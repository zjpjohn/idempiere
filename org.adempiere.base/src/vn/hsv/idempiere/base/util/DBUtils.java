package vn.hsv.idempiere.base.util;

public class DBUtils {
	
	public static void appendWhereClause (StringBuilder sql, String addWhereClause){
		int posFrom = sql.lastIndexOf(" FROM ");
		if (posFrom < 0)
			posFrom = 0;
		
		boolean hasWhere = sql.indexOf(" WHERE ", posFrom) != -1;
		
		int posOrder = sql.lastIndexOf(" ORDER BY ");
		
		if (posOrder < 0){
			posOrder = sql.length();
		}
		
		int offset = posOrder;
		String insertContent = hasWhere?" AND ":" WHERE ";
		sql.insert(offset, insertContent);
		offset += insertContent.length();
		
		insertContent = addWhereClause;
		sql.insert(offset, insertContent);
		offset += insertContent.length();
	}
}
