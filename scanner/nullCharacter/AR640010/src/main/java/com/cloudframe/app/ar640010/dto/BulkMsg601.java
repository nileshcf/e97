package com.cloudframe.app.ar640010.dto;

/**
*  The class BulkMsg601 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class BulkMsg601 extends BulkMsg601Serialized {
   


						private char[] bulkId601 = new char[4];


						private char[] bulkTtlNam601 = new char[50];
	
	/**
	* Constructor for BulkMsg601
	**/
    public BulkMsg601() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("0013-BULKID/TYPE: ").toCharArray()
             , getStartOffset() + 0
             ,18
             );
								setBulkId601(fillSpace(4));
       replaceValue( // serialize and save the value
             (" - ").toCharArray()
             , getStartOffset() + 22
             ,3
             );
								setBulkTtlNam601(fillSpace(50));
    }


 

	/**
	 *	Returns the value of bulkId601
	 *	@return bulkId601
	 */
   public char[] getBulkId601() throws CFException{
     if (isBulkId601Modified()) { 
        bulkId601 = refreshBulkId601();
     }
   		return bulkId601;
   }

  
	/**
	*  set variable bulkId601
	*  Corresponding COBOL Variable is 601-BULK-ID
	*  @param value
	**/
   public void setBulkId601(char[] value) {
      bulkId601 = checkBulkId601Constraints(value);
      serializeBulkId601(bulkId601);
   } 

     /**
	 * 	Update BulkId601 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBulkId601(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBulkId601,bulkId601.length);
   	
   }
   
   public void setBulkId601(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBulkId601,bulkId601.length);
   	
   }
   
     /**
	 * 	Update BulkId601 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBulkId601(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBulkId601+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BulkId601 with another Field
	 *	@param value
	 */
   public void setBulkId601(Field source) {
       replace(source,0,source.length(),beginBulkId601,BULK_ID_601_LEN);
   	
   }  
   
     /**
	 * 	Update BulkId601 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBulkId601(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBulkId601,BULK_ID_601_LEN);
   	
   }
   
     /**
	 * 	Update BulkId601 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBulkId601(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBulkId601+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bulkTtlNam601
	 *	@return bulkTtlNam601
	 */
   public char[] getBulkTtlNam601() throws CFException{
     if (isBulkTtlNam601Modified()) { 
        bulkTtlNam601 = refreshBulkTtlNam601();
     }
   		return bulkTtlNam601;
   }

  
	/**
	*  set variable bulkTtlNam601
	*  Corresponding COBOL Variable is 601-BULK-TTL-NAM
	*  @param value
	**/
   public void setBulkTtlNam601(char[] value) {
      bulkTtlNam601 = checkBulkTtlNam601Constraints(value);
      serializeBulkTtlNam601(bulkTtlNam601);
   } 

     /**
	 * 	Update BulkTtlNam601 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBulkTtlNam601(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBulkTtlNam601,bulkTtlNam601.length);
   	
   }
   
   public void setBulkTtlNam601(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBulkTtlNam601,bulkTtlNam601.length);
   	
   }
   
     /**
	 * 	Update BulkTtlNam601 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBulkTtlNam601(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBulkTtlNam601+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BulkTtlNam601 with another Field
	 *	@param value
	 */
   public void setBulkTtlNam601(Field source) {
       replace(source,0,source.length(),beginBulkTtlNam601,BULK_TTL_NAM_601_LEN);
   	
   }  
   
     /**
	 * 	Update BulkTtlNam601 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBulkTtlNam601(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBulkTtlNam601,BULK_TTL_NAM_601_LEN);
   	
   }
   
     /**
	 * 	Update BulkTtlNam601 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBulkTtlNam601(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBulkTtlNam601+targetIndex,targetLen);
    
   }

	
	
	

		public static int getBulkMsg601FieldLength() {
			return BULK_MSG_601_LENGTH;
		}

}
  
