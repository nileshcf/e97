package com.cloudframe.app.init1.dto;

/**
*  The class BmdCdrInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:52. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class BmdCdrInfo extends BmdCdrInfoSerialized {
   
				private BmdCdrTable bmdCdrTable = new BmdCdrTable();
	
	/**
	* Constructor for BmdCdrInfo
	**/
    public BmdCdrInfo() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			bmdCdrTable.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of bmdCdrTable
	 *	@return bmdCdrTable
	 */   
	 public BmdCdrTable getBmdCdrTable() {
   	return bmdCdrTable;
   }
   /**
	* 	Update BmdCdrTable with the passed value
	*   Corresponding COBOL Variable is WS-BMD-CDR-TABLE
	*	@param value
	*/
   public void setBmdCdrTable(char[] value) {
      bmdCdrTable.setString(value); 
   }   
    
     /**
	 * 	Update BmdCdrTable 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBmdCdrTable(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bmdCdrTable.begin,bmdCdrTable.length());
   }
   
     /**
	 * 	Update BmdCdrTable 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBmdCdrTable(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bmdCdrTable.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BmdCdrTable with another Field
	 *	@param value
	 */
   public void setBmdCdrTable(Field source) {
   	replace(source,0,source.length(),bmdCdrTable.begin,bmdCdrTable.length());
   }  
   
     /**
	 * 	Update BmdCdrTable 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBmdCdrTable(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bmdCdrTable.begin,bmdCdrTable.length());
   }
   
     /**
	 * 	Update BmdCdrTable 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBmdCdrTable(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bmdCdrTable.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getBmdCdrInfoFieldLength() {
			return BMD_CDR_INFO_LENGTH;
		}

}
  
