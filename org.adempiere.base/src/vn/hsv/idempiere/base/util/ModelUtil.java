/******************************************************************************
 * Product: Idempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2006 ComPiere, Inc. All Rights Reserved.                *
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

package vn.hsv.idempiere.base.util;

import org.compiere.model.I_C_Order;
import org.compiere.model.I_C_OrderLine;
import org.compiere.model.I_M_StorageOnHand;
import org.compiere.model.MStorageOnHand;
import org.compiere.model.MStorageReservation;
import org.compiere.model.MTransaction;

/**
 * @author hieplq@hasuvimex.vn:Dec 20, 2015
 *
 */
public class ModelUtil {
	public static void setOrderLinkForTransaction (IOrderLineLink provideOrderInfo, MTransaction transaction){
		if (provideOrderInfo.getOrderLineRef() != null){
			transaction.setC_OrderLine_ID(provideOrderInfo.getOrderLineRefID());
			transaction.setC_Order_ID(provideOrderInfo.getOrderRefID());
		}
	}
	
	public static I_C_Order implementGetOrderRef (IOrderLineLink providerOrder){
		I_C_OrderLine orderLine = providerOrder.getOrderLineRef();
		if (orderLine == null)
			return null;
		
		return orderLine.getC_Order();
	}
	
	public static int implementGetOrderRefID (IOrderLineLink providerOrder){
		
		if (providerOrder.getOrderLineRefID() == 0)
			return 0;
		
		return providerOrder.getOrderRef().getC_Order_ID();
	}
	
	public static void setOrderLinkForStorageOnhand (IOrderLineLink provideOrderInfo, MStorageOnHand storage){
		if (provideOrderInfo.getOrderLineRef() != null){
			setOrderLinkForStorageOnhand (provideOrderInfo.getOrderRefID(), 
					provideOrderInfo.getOrderLineRefID(),
					storage);
		}
	}
	
	public static void setOrderLinkForStorageOnhand (int orderID, int orderLineID, MStorageOnHand storage){
		storage.setC_OrderLine_ID(orderLineID);
		storage.setC_Order_ID(orderID);
	}
	
	public static void setOrderLinkForStorageReservation (IOrderLineLink provideOrderInfo, MStorageReservation storage){
		if (provideOrderInfo.getOrderLineRef() != null){
			storage.setC_OrderLine_ID(provideOrderInfo.getOrderLineRefID());
			storage.setC_Order_ID(provideOrderInfo.getOrderRefID());
		}
	}
	
	public static String appendOrderClause (String tableAlias, String sqlWhere, int orderLineID, boolean appendAnd){
		String clName = I_M_StorageOnHand.COLUMNNAME_C_OrderLine_ID;
		if (tableAlias != null && tableAlias.trim().length() > 0)
			clName = tableAlias + "." + clName;
		
		if (appendAnd)
			sqlWhere = sqlWhere + " AND ";
		
		if (orderLineID == 0)
			sqlWhere += "(" + clName + "=? OR " + clName + " IS NULL)";
		else
			sqlWhere += clName + "=?";
		
		return sqlWhere;
	}
}
