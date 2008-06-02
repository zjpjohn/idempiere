/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2007 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software;
 you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY;
 without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program;
 if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.eevolution.model;

/** Generated Model - DO NOT CHANGE */
import java.util.*;
import java.sql.*;
import java.math.*;
import org.compiere.util.*;
import org.compiere.util.*;
import org.compiere.model.*;
/** Generated Model for S_Resource
 *  @author Adempiere (generated) 
 *  @version Release 3.1.5 - $Id$ */
public class X_S_Resource extends PO
{
/** Standard Constructor
@param ctx context
@param S_Resource_ID id
@param trxName transaction
*/
public X_S_Resource (Properties ctx, int S_Resource_ID, String trxName)
{
super (ctx, S_Resource_ID, trxName);
/** if (S_Resource_ID == 0)
{
setIsAvailable (true);	// Y
setM_Warehouse_ID (0);
setName (null);
setS_ResourceType_ID (0);
setS_Resource_ID (0);
setValue (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_S_Resource (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=487 */
public static final int Table_ID=MTable.getTable_ID("S_Resource");

/** TableName=S_Resource */
public static final String Table_Name="S_Resource";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"S_Resource");

protected BigDecimal accessLevel = BigDecimal.valueOf(3);
/** AccessLevel
@return 3 - Client - Org 
*/
protected int get_AccessLevel()
{
return accessLevel.intValue();
}
/** Load Meta Data
@param ctx context
@return PO Info
*/
protected POInfo initPO (Properties ctx)
{
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_S_Resource[").append(get_ID()).append("]");
return sb.toString();
}
/** Set User/Contact.
@param AD_User_ID User within the system - Internal or Business Partner Contact */
public void setAD_User_ID (int AD_User_ID)
{
if (AD_User_ID <= 0) set_Value ("AD_User_ID", null);
 else 
set_Value ("AD_User_ID", Integer.valueOf(AD_User_ID));
}
/** Get User/Contact.
@return User within the system - Internal or Business Partner Contact */
public int getAD_User_ID() 
{
Integer ii = (Integer)get_Value("AD_User_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
/** Set Chargeable Quantity.
@param ChargeableQty Chargeable Quantity */
public void setChargeableQty (BigDecimal ChargeableQty)
{
set_Value ("ChargeableQty", ChargeableQty);
}
/** Get Chargeable Quantity.
@return Chargeable Quantity */
public BigDecimal getChargeableQty() 
{
BigDecimal bd = (BigDecimal)get_Value("ChargeableQty");
if (bd == null) return Env.ZERO;
return bd;
}
/** Column name ChargeableQty */
public static final String COLUMNNAME_ChargeableQty = "ChargeableQty";
/** Set DailyCapacity.
@param DailyCapacity DailyCapacity */
public void setDailyCapacity (BigDecimal DailyCapacity)
{
set_Value ("DailyCapacity", DailyCapacity);
}
/** Get DailyCapacity.
@return DailyCapacity */
public BigDecimal getDailyCapacity() 
{
BigDecimal bd = (BigDecimal)get_Value("DailyCapacity");
if (bd == null) return Env.ZERO;
return bd;
}
/** Column name DailyCapacity */
public static final String COLUMNNAME_DailyCapacity = "DailyCapacity";
/** Set Description.
@param Description Optional short description of the record */
public void setDescription (String Description)
{
if (Description != null && Description.length() > 255)
{
log.warning("Length > 255 - truncated");
Description = Description.substring(0,254);
}
set_Value ("Description", Description);
}
/** Get Description.
@return Optional short description of the record */
public String getDescription() 
{
return (String)get_Value("Description");
}
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Available.
@param IsAvailable Resource is available */
public void setIsAvailable (boolean IsAvailable)
{
set_Value ("IsAvailable", Boolean.valueOf(IsAvailable));
}
/** Get Available.
@return Resource is available */
public boolean isAvailable() 
{
Object oo = get_Value("IsAvailable");
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}
/** Column name IsAvailable */
public static final String COLUMNNAME_IsAvailable = "IsAvailable";
/** Set IsManufacturingResource.
@param IsManufacturingResource IsManufacturingResource */
public void setIsManufacturingResource (boolean IsManufacturingResource)
{
set_Value ("IsManufacturingResource", Boolean.valueOf(IsManufacturingResource));
}
/** Get IsManufacturingResource.
@return IsManufacturingResource */
public boolean isManufacturingResource() 
{
Object oo = get_Value("IsManufacturingResource");
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}
/** Column name IsManufacturingResource */
public static final String COLUMNNAME_IsManufacturingResource = "IsManufacturingResource";
/** Set Warehouse.
@param M_Warehouse_ID Storage Warehouse and Service Point */
public void setM_Warehouse_ID (int M_Warehouse_ID)
{
if (M_Warehouse_ID < 1) throw new IllegalArgumentException ("M_Warehouse_ID is mandatory.");
set_Value ("M_Warehouse_ID", Integer.valueOf(M_Warehouse_ID));
}
/** Get Warehouse.
@return Storage Warehouse and Service Point */
public int getM_Warehouse_ID() 
{
Integer ii = (Integer)get_Value("M_Warehouse_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name M_Warehouse_ID */
public static final String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";

/** ManufacturingResourceType AD_Reference_ID=50008 */
public static final int MANUFACTURINGRESOURCETYPE_AD_Reference_ID=50008;
/** Production Line = PL */
public static final String MANUFACTURINGRESOURCETYPE_ProductionLine = "PL";
/** Plant = PT */
public static final String MANUFACTURINGRESOURCETYPE_Plant = "PT";
/** Work Center = WC */
public static final String MANUFACTURINGRESOURCETYPE_WorkCenter = "WC";
/** Work Station = WS */
public static final String MANUFACTURINGRESOURCETYPE_WorkStation = "WS";
/** Set ManufacturingResourceType.
@param ManufacturingResourceType ManufacturingResourceType */
public void setManufacturingResourceType (String ManufacturingResourceType)
{
if (ManufacturingResourceType == null || ManufacturingResourceType.equals("PL") || ManufacturingResourceType.equals("PT") || ManufacturingResourceType.equals("WC") || ManufacturingResourceType.equals("WS"));
 else throw new IllegalArgumentException ("ManufacturingResourceType Invalid value - " + ManufacturingResourceType + " - Reference_ID=50008 - PL - PT - WC - WS");
if (ManufacturingResourceType != null && ManufacturingResourceType.length() > 2)
{
log.warning("Length > 2 - truncated");
ManufacturingResourceType = ManufacturingResourceType.substring(0,1);
}
set_Value ("ManufacturingResourceType", ManufacturingResourceType);
}
/** Get ManufacturingResourceType.
@return ManufacturingResourceType */
public String getManufacturingResourceType() 
{
return (String)get_Value("ManufacturingResourceType");
}
/** Column name ManufacturingResourceType */
public static final String COLUMNNAME_ManufacturingResourceType = "ManufacturingResourceType";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name == null) throw new IllegalArgumentException ("Name is mandatory.");
if (Name.length() > 60)
{
log.warning("Length > 60 - truncated");
Name = Name.substring(0,59);
}
set_Value ("Name", Name);
}
/** Get Name.
@return Alphanumeric identifier of the entity */
public String getName() 
{
return (String)get_Value("Name");
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getName());
}
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set PercentUtillization.
@param PercentUtillization PercentUtillization */
public void setPercentUtillization (BigDecimal PercentUtillization)
{
set_Value ("PercentUtillization", PercentUtillization);
}
/** Get PercentUtillization.
@return PercentUtillization */
public BigDecimal getPercentUtillization() 
{
BigDecimal bd = (BigDecimal)get_Value("PercentUtillization");
if (bd == null) return Env.ZERO;
return bd;
}
/** Column name PercentUtillization */
public static final String COLUMNNAME_PercentUtillization = "PercentUtillization";
/** Set Queuing Time.
@param QueuingTime Queuing Time */
public void setQueuingTime (BigDecimal QueuingTime)
{
set_Value ("QueuingTime", QueuingTime);
}
/** Get Queuing Time.
@return Queuing Time */
public BigDecimal getQueuingTime() 
{
BigDecimal bd = (BigDecimal)get_Value("QueuingTime");
if (bd == null) return Env.ZERO;
return bd;
}
/** Column name QueuingTime */
public static final String COLUMNNAME_QueuingTime = "QueuingTime";
/** Set Resource Type.
@param S_ResourceType_ID Resource Type */
public void setS_ResourceType_ID (int S_ResourceType_ID)
{
if (S_ResourceType_ID < 1) throw new IllegalArgumentException ("S_ResourceType_ID is mandatory.");
set_Value ("S_ResourceType_ID", Integer.valueOf(S_ResourceType_ID));
}
/** Get Resource Type.
@return Resource Type */
public int getS_ResourceType_ID() 
{
Integer ii = (Integer)get_Value("S_ResourceType_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name S_ResourceType_ID */
public static final String COLUMNNAME_S_ResourceType_ID = "S_ResourceType_ID";
/** Set Resource.
@param S_Resource_ID Resource */
public void setS_Resource_ID (int S_Resource_ID)
{
if (S_Resource_ID < 1) throw new IllegalArgumentException ("S_Resource_ID is mandatory.");
set_ValueNoCheck ("S_Resource_ID", Integer.valueOf(S_Resource_ID));
}
/** Get Resource.
@return Resource */
public int getS_Resource_ID() 
{
Integer ii = (Integer)get_Value("S_Resource_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Column name S_Resource_ID */
public static final String COLUMNNAME_S_Resource_ID = "S_Resource_ID";
/** Set Search Key.
@param Value Search key for the record in the format required - must be unique */
public void setValue (String Value)
{
if (Value == null) throw new IllegalArgumentException ("Value is mandatory.");
if (Value.length() > 40)
{
log.warning("Length > 40 - truncated");
Value = Value.substring(0,39);
}
set_Value ("Value", Value);
}
/** Get Search Key.
@return Search key for the record in the format required - must be unique */
public String getValue() 
{
return (String)get_Value("Value");
}
/** Column name Value */
public static final String COLUMNNAME_Value = "Value";
/** Set Waiting Time.
@param WaitingTime Workflow Simulation Waiting time */
public void setWaitingTime (BigDecimal WaitingTime)
{
set_Value ("WaitingTime", WaitingTime);
}
/** Get Waiting Time.
@return Workflow Simulation Waiting time */
public BigDecimal getWaitingTime() 
{
BigDecimal bd = (BigDecimal)get_Value("WaitingTime");
if (bd == null) return Env.ZERO;
return bd;
}
/** Column name WaitingTime */
public static final String COLUMNNAME_WaitingTime = "WaitingTime";
}