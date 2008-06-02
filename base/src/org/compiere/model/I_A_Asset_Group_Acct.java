/**********************************************************************
 * This file is part of Adempiere ERP Bazaar                          *
 * http://www.adempiere.org                                           *
 *                                                                    *
 * Copyright (C) Trifon Trifonov.                                     *
 * Copyright (C) Contributors                                         *
 *                                                                    *
 * This program is free software;
 you can redistribute it and/or      *
 * modify it under the terms of the GNU General Public License        *
 * as published by the Free Software Foundation;
 either version 2     *
 * of the License, or (at your option) any later version.             *
 *                                                                    *
 * This program is distributed in the hope that it will be useful,    *
 * but WITHOUT ANY WARRANTY;
 without even the implied warranty of     *
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the       *
 * GNU General Public License for more details.                       *
 *                                                                    *
 * You should have received a copy of the GNU General Public License  *
 * along with this program;
 if not, write to the Free Software        *
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,         *
 * MA 02110-1301, USA.                                                *
 *                                                                    *
 * Contributors:                                                      *
 * - Trifon Trifonov (trifonnt@users.sourceforge.net)                 *
 *                                                                    *
 * Sponsors:                                                          *
 * - Company (http://www.site.com)                                    *
 **********************************************************************/
package org.compiere.model;

import java.math.BigDecimal;
import org.compiere.util.KeyNamePair;

/** Generated Interface for A_Asset_Group_Acct
 *  @author Trifon Trifonov (generated) 
 *  @version Release 3.5.1a
 */
public interface I_A_Asset_Group_Acct 
{

    /** TableName=A_Asset_Group_Acct */
    public static final String Table_Name = "A_Asset_Group_Acct";

    /** AD_Table_ID=53130 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 7 - System - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);

    /** Load Meta Data */

    /** Column name A_Accumdepreciation_Acct */
    public static final String COLUMNNAME_A_Accumdepreciation_Acct = "A_Accumdepreciation_Acct";

	/** Set A_Accumdepreciation_Acct	  */
	public void setA_Accumdepreciation_Acct (int A_Accumdepreciation_Acct);

	/** Get A_Accumdepreciation_Acct	  */
	public int getA_Accumdepreciation_Acct();

    /** Column name A_Asset_Acct */
    public static final String COLUMNNAME_A_Asset_Acct = "A_Asset_Acct";

	/** Set A_Asset_Acct	  */
	public void setA_Asset_Acct (int A_Asset_Acct);

	/** Get A_Asset_Acct	  */
	public int getA_Asset_Acct();

    /** Column name A_Asset_Group_Acct_ID */
    public static final String COLUMNNAME_A_Asset_Group_Acct_ID = "A_Asset_Group_Acct_ID";

	/** Set A_Asset_Group_Acct_ID	  */
	public void setA_Asset_Group_Acct_ID (int A_Asset_Group_Acct_ID);

	/** Get A_Asset_Group_Acct_ID	  */
	public int getA_Asset_Group_Acct_ID();

    /** Column name A_Asset_Group_ID */
    public static final String COLUMNNAME_A_Asset_Group_ID = "A_Asset_Group_ID";

	/** Set Asset Group.
	  * Group of Assets
	  */
	public void setA_Asset_Group_ID (int A_Asset_Group_ID);

	/** Get Asset Group.
	  * Group of Assets
	  */
	public int getA_Asset_Group_ID();

	public I_A_Asset_Group getA_Asset_Group() throws Exception;

    /** Column name A_Asset_Spread_Type */
    public static final String COLUMNNAME_A_Asset_Spread_Type = "A_Asset_Spread_Type";

	/** Set A_Asset_Spread_Type	  */
	public void setA_Asset_Spread_Type (int A_Asset_Spread_Type);

	/** Get A_Asset_Spread_Type	  */
	public int getA_Asset_Spread_Type();

    /** Column name A_Depreciation_Acct */
    public static final String COLUMNNAME_A_Depreciation_Acct = "A_Depreciation_Acct";

	/** Set A_Depreciation_Acct	  */
	public void setA_Depreciation_Acct (int A_Depreciation_Acct);

	/** Get A_Depreciation_Acct	  */
	public int getA_Depreciation_Acct();

    /** Column name A_Depreciation_Calc_Type */
    public static final String COLUMNNAME_A_Depreciation_Calc_Type = "A_Depreciation_Calc_Type";

	/** Set A_Depreciation_Calc_Type	  */
	public void setA_Depreciation_Calc_Type (int A_Depreciation_Calc_Type);

	/** Get A_Depreciation_Calc_Type	  */
	public int getA_Depreciation_Calc_Type();

    /** Column name A_Depreciation_ID */
    public static final String COLUMNNAME_A_Depreciation_ID = "A_Depreciation_ID";

	/** Set A_Depreciation_ID	  */
	public void setA_Depreciation_ID (int A_Depreciation_ID);

	/** Get A_Depreciation_ID	  */
	public int getA_Depreciation_ID();

    /** Column name A_Depreciation_Manual_Amount */
    public static final String COLUMNNAME_A_Depreciation_Manual_Amount = "A_Depreciation_Manual_Amount";

	/** Set A_Depreciation_Manual_Amount	  */
	public void setA_Depreciation_Manual_Amount (BigDecimal A_Depreciation_Manual_Amount);

	/** Get A_Depreciation_Manual_Amount	  */
	public BigDecimal getA_Depreciation_Manual_Amount();

    /** Column name A_Depreciation_Manual_Period */
    public static final String COLUMNNAME_A_Depreciation_Manual_Period = "A_Depreciation_Manual_Period";

	/** Set A_Depreciation_Manual_Period	  */
	public void setA_Depreciation_Manual_Period (String A_Depreciation_Manual_Period);

	/** Get A_Depreciation_Manual_Period	  */
	public String getA_Depreciation_Manual_Period();

    /** Column name A_Depreciation_Table_Header_ID */
    public static final String COLUMNNAME_A_Depreciation_Table_Header_ID = "A_Depreciation_Table_Header_ID";

	/** Set A_Depreciation_Table_Header_ID	  */
	public void setA_Depreciation_Table_Header_ID (int A_Depreciation_Table_Header_ID);

	/** Get A_Depreciation_Table_Header_ID	  */
	public int getA_Depreciation_Table_Header_ID();

    /** Column name A_Depreciation_Variable_Perc */
    public static final String COLUMNNAME_A_Depreciation_Variable_Perc = "A_Depreciation_Variable_Perc";

	/** Set A_Depreciation_Variable_Perc	  */
	public void setA_Depreciation_Variable_Perc (BigDecimal A_Depreciation_Variable_Perc);

	/** Get A_Depreciation_Variable_Perc	  */
	public BigDecimal getA_Depreciation_Variable_Perc();

    /** Column name A_Disposal_Gain */
    public static final String COLUMNNAME_A_Disposal_Gain = "A_Disposal_Gain";

	/** Set A_Disposal_Gain	  */
	public void setA_Disposal_Gain (int A_Disposal_Gain);

	/** Get A_Disposal_Gain	  */
	public int getA_Disposal_Gain();

    /** Column name A_Disposal_Loss */
    public static final String COLUMNNAME_A_Disposal_Loss = "A_Disposal_Loss";

	/** Set A_Disposal_Loss	  */
	public void setA_Disposal_Loss (int A_Disposal_Loss);

	/** Get A_Disposal_Loss	  */
	public int getA_Disposal_Loss();

    /** Column name A_Disposal_Revenue */
    public static final String COLUMNNAME_A_Disposal_Revenue = "A_Disposal_Revenue";

	/** Set A_Disposal_Revenue	  */
	public void setA_Disposal_Revenue (int A_Disposal_Revenue);

	/** Get A_Disposal_Revenue	  */
	public int getA_Disposal_Revenue();

    /** Column name A_Reval_Accumdep_Offset_Cur */
    public static final String COLUMNNAME_A_Reval_Accumdep_Offset_Cur = "A_Reval_Accumdep_Offset_Cur";

	/** Set A_Reval_Accumdep_Offset_Cur	  */
	public void setA_Reval_Accumdep_Offset_Cur (int A_Reval_Accumdep_Offset_Cur);

	/** Get A_Reval_Accumdep_Offset_Cur	  */
	public int getA_Reval_Accumdep_Offset_Cur();

    /** Column name A_Reval_Accumdep_Offset_Prior */
    public static final String COLUMNNAME_A_Reval_Accumdep_Offset_Prior = "A_Reval_Accumdep_Offset_Prior";

	/** Set A_Reval_Accumdep_Offset_Prior	  */
	public void setA_Reval_Accumdep_Offset_Prior (int A_Reval_Accumdep_Offset_Prior);

	/** Get A_Reval_Accumdep_Offset_Prior	  */
	public int getA_Reval_Accumdep_Offset_Prior();

    /** Column name A_Reval_Cal_Method */
    public static final String COLUMNNAME_A_Reval_Cal_Method = "A_Reval_Cal_Method";

	/** Set A_Reval_Cal_Method	  */
	public void setA_Reval_Cal_Method (String A_Reval_Cal_Method);

	/** Get A_Reval_Cal_Method	  */
	public String getA_Reval_Cal_Method();

    /** Column name A_Reval_Cost_Offset */
    public static final String COLUMNNAME_A_Reval_Cost_Offset = "A_Reval_Cost_Offset";

	/** Set A_Reval_Cost_Offset	  */
	public void setA_Reval_Cost_Offset (int A_Reval_Cost_Offset);

	/** Get A_Reval_Cost_Offset	  */
	public int getA_Reval_Cost_Offset();

    /** Column name A_Reval_Cost_Offset_Prior */
    public static final String COLUMNNAME_A_Reval_Cost_Offset_Prior = "A_Reval_Cost_Offset_Prior";

	/** Set A_Reval_Cost_Offset_Prior	  */
	public void setA_Reval_Cost_Offset_Prior (int A_Reval_Cost_Offset_Prior);

	/** Get A_Reval_Cost_Offset_Prior	  */
	public int getA_Reval_Cost_Offset_Prior();

    /** Column name A_Reval_Depexp_Offset */
    public static final String COLUMNNAME_A_Reval_Depexp_Offset = "A_Reval_Depexp_Offset";

	/** Set A_Reval_Depexp_Offset	  */
	public void setA_Reval_Depexp_Offset (int A_Reval_Depexp_Offset);

	/** Get A_Reval_Depexp_Offset	  */
	public int getA_Reval_Depexp_Offset();

    /** Column name A_Split_Percent */
    public static final String COLUMNNAME_A_Split_Percent = "A_Split_Percent";

	/** Set A_Split_Percent	  */
	public void setA_Split_Percent (BigDecimal A_Split_Percent);

	/** Get A_Split_Percent	  */
	public BigDecimal getA_Split_Percent();

    /** Column name C_AcctSchema_ID */
    public static final String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";

	/** Set Accounting Schema.
	  * Rules for accounting
	  */
	public void setC_AcctSchema_ID (int C_AcctSchema_ID);

	/** Get Accounting Schema.
	  * Rules for accounting
	  */
	public int getC_AcctSchema_ID();

	public I_C_AcctSchema getC_AcctSchema() throws Exception;

    /** Column name ConventionType */
    public static final String COLUMNNAME_ConventionType = "ConventionType";

	/** Set ConventionType	  */
	public void setConventionType (int ConventionType);

	/** Get ConventionType	  */
	public int getConventionType();

    /** Column name DepreciationType */
    public static final String COLUMNNAME_DepreciationType = "DepreciationType";

	/** Set DepreciationType	  */
	public void setDepreciationType (int DepreciationType);

	/** Get DepreciationType	  */
	public int getDepreciationType();

    /** Column name PostingType */
    public static final String COLUMNNAME_PostingType = "PostingType";

	/** Set PostingType.
	  * The type of posted amount for the transaction
	  */
	public void setPostingType (String PostingType);

	/** Get PostingType.
	  * The type of posted amount for the transaction
	  */
	public String getPostingType();

    /** Column name Processing */
    public static final String COLUMNNAME_Processing = "Processing";

	/** Set Process Now	  */
	public void setProcessing (boolean Processing);

	/** Get Process Now	  */
	public boolean isProcessing();

    /** Column name UseLifeMonths */
    public static final String COLUMNNAME_UseLifeMonths = "UseLifeMonths";

	/** Set Usable Life - Months.
	  * Months of the usable life of the asset
	  */
	public void setUseLifeMonths (int UseLifeMonths);

	/** Get Usable Life - Months.
	  * Months of the usable life of the asset
	  */
	public int getUseLifeMonths();

    /** Column name UseLifeYears */
    public static final String COLUMNNAME_UseLifeYears = "UseLifeYears";

	/** Set Usable Life - Years.
	  * Years of the usable life of the asset
	  */
	public void setUseLifeYears (int UseLifeYears);

	/** Get Usable Life - Years.
	  * Years of the usable life of the asset
	  */
	public int getUseLifeYears();
}