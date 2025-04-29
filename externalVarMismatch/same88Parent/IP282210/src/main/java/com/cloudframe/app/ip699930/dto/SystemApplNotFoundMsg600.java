package com.cloudframe.app.ip699930.dto;

/**
*  The class SystemApplNotFoundMsg600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:33. using version 5.0.0.254
**/


import com.cloudframe.app.ip699930.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SystemApplNotFoundMsg600 extends SystemApplNotFoundMsg600Serialized {
   


						private char[] noSystemApplIdsApplId600 = Field.fillLowValue(3);


						private char[] noSystemApplIdsPa600 = Field.fillLowValue(11);
	
	/**
	* Constructor for SystemApplNotFoundMsg600
	**/
    public SystemApplNotFoundMsg600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("SYSTEM APPLICATION ID ").toCharArray()
             , getStartOffset() + 0
             ,22
             );
       replaceValue( // serialize and save the value
             ("NOT FOUND FOR PROCESSING AGREEMENT: ").toCharArray()
             , getStartOffset() + 25
             ,36
             );
    }


 

	/**
	 *	Returns the value of noSystemApplIdsApplId600
	 *	@return noSystemApplIdsApplId600
	 */
   public char[] getNoSystemApplIdsApplId600() throws CFException{
     if (isNoSystemApplIdsApplId600Modified()) { 
        noSystemApplIdsApplId600 = refreshNoSystemApplIdsApplId600();
     }
   		return noSystemApplIdsApplId600;
   }

  
	/**
	*  set variable noSystemApplIdsApplId600
	*  Corresponding COBOL Variable is 600-NO-SYSTEM-APPL-IDS-APPL-ID
	*  @param value
	**/
   public void setNoSystemApplIdsApplId600(char[] value) {
      noSystemApplIdsApplId600 = checkNoSystemApplIdsApplId600Constraints(value);
      serializeNoSystemApplIdsApplId600(noSystemApplIdsApplId600);
   } 

     /**
	 * 	Update NoSystemApplIdsApplId600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setNoSystemApplIdsApplId600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginNoSystemApplIdsApplId600,noSystemApplIdsApplId600.length);
   	
   }
   
   public void setNoSystemApplIdsApplId600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginNoSystemApplIdsApplId600,noSystemApplIdsApplId600.length);
   	
   }
   
     /**
	 * 	Update NoSystemApplIdsApplId600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setNoSystemApplIdsApplId600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginNoSystemApplIdsApplId600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update NoSystemApplIdsApplId600 with another Field
	 *	@param value
	 */
   public void setNoSystemApplIdsApplId600(Field source) {
       replace(source,0,source.length(),beginNoSystemApplIdsApplId600,NO_SYSTEM_APPL_IDS_APPL_ID_600_LEN);
   	
   }  
   
     /**
	 * 	Update NoSystemApplIdsApplId600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setNoSystemApplIdsApplId600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginNoSystemApplIdsApplId600,NO_SYSTEM_APPL_IDS_APPL_ID_600_LEN);
   	
   }
   
     /**
	 * 	Update NoSystemApplIdsApplId600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setNoSystemApplIdsApplId600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginNoSystemApplIdsApplId600+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of noSystemApplIdsPa600
	 *	@return noSystemApplIdsPa600
	 */
   public char[] getNoSystemApplIdsPa600() throws CFException{
     if (isNoSystemApplIdsPa600Modified()) { 
        noSystemApplIdsPa600 = refreshNoSystemApplIdsPa600();
     }
   		return noSystemApplIdsPa600;
   }

  
	/**
	*  set variable noSystemApplIdsPa600
	*  Corresponding COBOL Variable is 600-NO-SYSTEM-APPL-IDS-PA
	*  @param value
	**/
   public void setNoSystemApplIdsPa600(char[] value) {
      noSystemApplIdsPa600 = checkNoSystemApplIdsPa600Constraints(value);
      serializeNoSystemApplIdsPa600(noSystemApplIdsPa600);
   } 

     /**
	 * 	Update NoSystemApplIdsPa600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setNoSystemApplIdsPa600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginNoSystemApplIdsPa600,noSystemApplIdsPa600.length);
   	
   }
   
   public void setNoSystemApplIdsPa600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginNoSystemApplIdsPa600,noSystemApplIdsPa600.length);
   	
   }
   
     /**
	 * 	Update NoSystemApplIdsPa600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setNoSystemApplIdsPa600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginNoSystemApplIdsPa600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update NoSystemApplIdsPa600 with another Field
	 *	@param value
	 */
   public void setNoSystemApplIdsPa600(Field source) {
       replace(source,0,source.length(),beginNoSystemApplIdsPa600,NO_SYSTEM_APPL_IDS_PA_600_LEN);
   	
   }  
   
     /**
	 * 	Update NoSystemApplIdsPa600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setNoSystemApplIdsPa600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginNoSystemApplIdsPa600,NO_SYSTEM_APPL_IDS_PA_600_LEN);
   	
   }
   
     /**
	 * 	Update NoSystemApplIdsPa600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setNoSystemApplIdsPa600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginNoSystemApplIdsPa600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSystemApplNotFoundMsg600FieldLength() {
			return SYSTEM_APPL_NOT_FOUND_MSG_600_LENGTH;
		}

}
  
