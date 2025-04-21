package com.cloudframe.app.search3.dto;

/**
*  The class TableGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/


import com.cloudframe.app.search3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class TableGroup extends TableGroupSerialized {
   
				private Table table = new Table();
	
	/**
	* Constructor for TableGroup
	**/
    public TableGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			table.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of table
	 *	@return table
	 */   
	 public Table getTable() {
   	return table;
   }
   /**
	* 	Update Table with the passed value
	*   Corresponding COBOL Variable is WS-TABLE
	*	@param value
	*/
   public void setTable(char[] value) {
      table.setString(value); 
   }   
    
     /**
	 * 	Update Table 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setTable(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,table.begin,table.length());
   }
   
     /**
	 * 	Update Table 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTable(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,table.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Table with another Field
	 *	@param value
	 */
   public void setTable(Field source) {
   	replace(source,0,source.length(),table.begin,table.length());
   }  
   
     /**
	 * 	Update Table 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setTable(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,table.begin,table.length());
   }
   
     /**
	 * 	Update Table 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTable(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,table.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getTableGroupFieldLength() {
			return TABLE_GROUP_LENGTH;
		}

}
  
