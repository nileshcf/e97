package com.cloudframe.app.refmod2.dto;

/**
*  The class BT216 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:22. using version 5.0.0.257
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BT216 extends BT216Serialized {
   

						private char[] bTFld1216 = Field.fillLowValue(20);

						private char[] bTFld2216 = Field.fillLowValue(40);

						private char[] bTFld3216 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT216
	**/
    public BT216() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of bTFld1216
	 *	@return bTFld1216
	 */
   public char[] getBTFld1216() throws CFException{
     if (isBTFld1216Modified()) { 
        bTFld1216 = refreshBTFld1216();
     }
   		return bTFld1216;
   }

  
	/**
	*  set variable bTFld1216
	*  Corresponding COBOL Variable is WS-2-16B-T-FLD1
	*  @param value
	**/
   public void setBTFld1216(char[] value) {
      bTFld1216 = checkBTFld1216Constraints(value);
      serializeBTFld1216(bTFld1216);
   } 

     /**
	 * 	Update BTFld1216 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld1216(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld1216,bTFld1216.length);
   	
   }
   
   public void setBTFld1216(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld1216,bTFld1216.length);
   	
   }
   
     /**
	 * 	Update BTFld1216 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld1216(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld1216+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld1216 with another Field
	 *	@param value
	 */
   public void setBTFld1216(Field source) {
       replace(source,0,source.length(),beginBTFld1216,B_TFLD_1216_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld1216 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld1216(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld1216,B_TFLD_1216_LEN);
   	
   }
   
     /**
	 * 	Update BTFld1216 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld1216(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld1216+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld2216
	 *	@return bTFld2216
	 */
   public char[] getBTFld2216() throws CFException{
     if (isBTFld2216Modified()) { 
        bTFld2216 = refreshBTFld2216();
     }
   		return bTFld2216;
   }

  
	/**
	*  set variable bTFld2216
	*  Corresponding COBOL Variable is WS-2-16B-T-FLD2
	*  @param value
	**/
   public void setBTFld2216(char[] value) {
      bTFld2216 = checkBTFld2216Constraints(value);
      serializeBTFld2216(bTFld2216);
   } 

     /**
	 * 	Update BTFld2216 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld2216(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld2216,bTFld2216.length);
   	
   }
   
   public void setBTFld2216(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld2216,bTFld2216.length);
   	
   }
   
     /**
	 * 	Update BTFld2216 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld2216(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld2216+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld2216 with another Field
	 *	@param value
	 */
   public void setBTFld2216(Field source) {
       replace(source,0,source.length(),beginBTFld2216,B_TFLD_2216_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld2216 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld2216(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld2216,B_TFLD_2216_LEN);
   	
   }
   
     /**
	 * 	Update BTFld2216 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld2216(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld2216+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld3216
	 *	@return bTFld3216
	 */
   public char[] getBTFld3216() throws CFException{
     if (isBTFld3216Modified()) { 
        bTFld3216 = refreshBTFld3216();
     }
   		return bTFld3216;
   }

  
	/**
	*  set variable bTFld3216
	*  Corresponding COBOL Variable is WS-2-16B-T-FLD3
	*  @param value
	**/
   public void setBTFld3216(char[] value) {
      bTFld3216 = checkBTFld3216Constraints(value);
      serializeBTFld3216(bTFld3216);
   } 

     /**
	 * 	Update BTFld3216 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld3216(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld3216,bTFld3216.length);
   	
   }
   
   public void setBTFld3216(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld3216,bTFld3216.length);
   	
   }
   
     /**
	 * 	Update BTFld3216 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld3216(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld3216+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld3216 with another Field
	 *	@param value
	 */
   public void setBTFld3216(Field source) {
       replace(source,0,source.length(),beginBTFld3216,B_TFLD_3216_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld3216 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld3216(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld3216,B_TFLD_3216_LEN);
   	
   }
   
     /**
	 * 	Update BTFld3216 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld3216(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld3216+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BT216
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld1216(CONSTANTS.SPACE_20);
         setBTFld2216(CONSTANTS.SPACE_40);
         setBTFld3216(CONSTANTS.SPACE_30);
   }

		public static int getBT216FieldLength() {
			return B_T_216_LENGTH;
		}

}
  
