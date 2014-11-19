/******************************************************************************
 * Product: iDempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 2012 Carlos Ruiz                							  *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 *****************************************************************************/
package org.compiere.model;

import java.nio.charset.Charset;
import java.sql.ResultSet;
import java.util.List;
import java.util.Properties;

import org.compiere.util.CCache;
import org.compiere.util.CLogger;
import org.compiere.util.Env;
import org.compiere.util.Msg;

/**
 *	Import Template Model
 *
 *  @author Carlos Ruiz - GlobalQSS
 */
public class MImportTemplate extends X_AD_ImportTemplate
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3316290883489953101L;

	/**	Logger			*/
	@SuppressWarnings("unused")
	private static CLogger s_log = CLogger.getCLogger(MImportTemplate.class);

	/**************************************************************************
	 * 	Standard Constructor
	 *	@param ctx context
	 *	@param AD_ImportTemplate_ID id
	 *	@param trxName transaction
	 */
	public MImportTemplate (Properties ctx, int AD_ImportTemplate_ID, String trxName)
	{
	      super (ctx, AD_ImportTemplate_ID, trxName);
	}	//	MImportTemplate

	/**
	 * 	Load Constructor
	 *	@param ctx ctx
	 *	@param rs result set
	 *	@param trxName transaction
	 */
	public MImportTemplate (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MImportTemplate

	@Override
	protected boolean beforeSave(boolean newRecord) {
		// Validate character set vs supported
		if (getCharacterSet() == null) {
			setCharacterSet(Charset.defaultCharset().displayName());
		}
		if (getCharacterSet() == null || !Charset.isSupported(getCharacterSet())) {
			log.saveError("Error", Msg.parseTranslation(getCtx(), "@Invalid@ @CharacterSet@"));
			return false;
		}
		return super.beforeSave(newRecord);
	}

	/**	Cache of Role						*/
	private static CCache<String,List<MImportTemplate>>	s_cacheRoleTab = new CCache<String,List<MImportTemplate>>(Table_Name, Table_Name+"_Of_Role", 5);

	public static List<MImportTemplate> getTemplates(int roleid, int tabid) {
		String key = roleid + "_" + tabid;
		List<MImportTemplate> retValue = s_cacheRoleTab.get(key);
		if (retValue != null)
			return retValue;

		final String where = ""
				+ "IsActive='Y' AND AD_Client_ID IN (0, ?) AND AD_Tab_ID=? "
				+ "AND EXISTS (SELECT 1 "
				+ "              FROM AD_ImportTemplateAccess ita "
				+ "              WHERE ita.AD_ImportTemplate_ID=AD_ImportTemplate.AD_ImportTemplate_ID AND ita.IsActive='Y' AND ita.AD_Role_ID=? AND (IsAllowInsert='Y' OR IsAllowMerge='Y' OR IsAllowUpdate='Y'))";
		retValue = new Query(Env.getCtx(), MImportTemplate.Table_Name, where, null)
			.setParameters(Env.getAD_Client_ID(Env.getCtx()), tabid, roleid)
			.setOrderBy("Name")
			.list();
		s_cacheRoleTab.put(key, retValue);
		return retValue;
	}

}	//	MImportTemplate