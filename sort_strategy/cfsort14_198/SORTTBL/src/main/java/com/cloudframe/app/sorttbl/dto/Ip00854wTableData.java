package com.cloudframe.app.sorttbl.dto;

/**
*  The class Ip00854wTableData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:58. using version 5.0.0.254
**/


import com.cloudframe.app.sorttbl.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip00854wTableData extends Ip00854wTableDataSerialized {
   
				private Ip00854wTable ip00854wTable = new Ip00854wTable();
	
	/**
	* Constructor for Ip00854wTableData
	**/
    public Ip00854wTableData() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			ip00854wTable.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ip00854wTable
	 *	@return ip00854wTable
	 */   
	 public Ip00854wTable getIp00854wTable() {
   	return ip00854wTable;
   }
   /**
	* 	Update Ip00854wTable with the passed value
	*   Corresponding COBOL Variable is IP00854W-TABLE
	*	@param value
	*/
   public void setIp00854wTable(char[] value) {
      ip00854wTable.setString(value); 
   }   
    
     /**
	 * 	Update Ip00854wTable 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp00854wTable(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00854wTable.begin,ip00854wTable.length());
   }
   
     /**
	 * 	Update Ip00854wTable 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00854wTable(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00854wTable.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip00854wTable with another Field
	 *	@param value
	 */
   public void setIp00854wTable(Field source) {
   	replace(source,0,source.length(),ip00854wTable.begin,ip00854wTable.length());
   }  
   
     /**
	 * 	Update Ip00854wTable 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp00854wTable(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00854wTable.begin,ip00854wTable.length());
   }
   
     /**
	 * 	Update Ip00854wTable 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00854wTable(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00854wTable.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getIp00854wTableDataFieldLength() {
			return IP_00854W_TABLE_DATA_LENGTH;
		}

}
  
