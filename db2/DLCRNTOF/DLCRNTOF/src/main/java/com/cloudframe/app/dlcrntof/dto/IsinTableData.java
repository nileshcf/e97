package com.cloudframe.app.dlcrntof.dto;

/**
*  The class IsinTableData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/


import com.cloudframe.app.dlcrntof.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class IsinTableData extends IsinTableDataSerialized {
   
				private IsinTable isinTable = new IsinTable();
	
	/**
	* Constructor for IsinTableData
	**/
    public IsinTableData() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			isinTable.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of isinTable
	 *	@return isinTable
	 */   
	 public IsinTable getIsinTable() {
   	return isinTable;
   }
   /**
	* 	Update IsinTable with the passed value
	*   Corresponding COBOL Variable is ISIN-TABLE
	*	@param value
	*/
   public void setIsinTable(char[] value) {
      isinTable.setString(value); 
   }   
    
     /**
	 * 	Update IsinTable 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIsinTable(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,isinTable.begin,isinTable.length());
   }
   
     /**
	 * 	Update IsinTable 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIsinTable(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,isinTable.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update IsinTable with another Field
	 *	@param value
	 */
   public void setIsinTable(Field source) {
   	replace(source,0,source.length(),isinTable.begin,isinTable.length());
   }  
   
     /**
	 * 	Update IsinTable 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIsinTable(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,isinTable.begin,isinTable.length());
   }
   
     /**
	 * 	Update IsinTable 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIsinTable(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,isinTable.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getIsinTableDataFieldLength() {
			return ISIN_TABLE_DATA_LENGTH;
		}

}
  
