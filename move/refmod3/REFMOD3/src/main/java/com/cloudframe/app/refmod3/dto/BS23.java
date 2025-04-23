package com.cloudframe.app.refmod3.dto;

/**
*  The class BS23 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:02. using version 5.0.0.254
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BS23 extends BS23Serialized {
   

						private char[] bSFld123 = Field.fillLowValue(30);

						private char[] bSFld223 = Field.fillLowValue(40);
	
	/**
	* Constructor for BS23
	**/
    public BS23() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of bSFld123
	 *	@return bSFld123
	 */
   public char[] getBSFld123() throws CFException{
     if (isBSFld123Modified()) { 
        bSFld123 = refreshBSFld123();
     }
   		return bSFld123;
   }

  
	/**
	*  set variable bSFld123
	*  Corresponding COBOL Variable is WS-2-3B-S-FLD1
	*  @param value
	**/
   public void setBSFld123(char[] value) {
      bSFld123 = checkBSFld123Constraints(value);
      serializeBSFld123(bSFld123);
   } 

     /**
	 * 	Update BSFld123 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBSFld123(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBSFld123,bSFld123.length);
   	
   }
   
   public void setBSFld123(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld123,bSFld123.length);
   	
   }
   
     /**
	 * 	Update BSFld123 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBSFld123(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld123+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BSFld123 with another Field
	 *	@param value
	 */
   public void setBSFld123(Field source) {
       replace(source,0,source.length(),beginBSFld123,B_SFLD_123_LEN);
   	
   }  
   
     /**
	 * 	Update BSFld123 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBSFld123(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBSFld123,B_SFLD_123_LEN);
   	
   }
   
     /**
	 * 	Update BSFld123 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBSFld123(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld123+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bSFld223
	 *	@return bSFld223
	 */
   public char[] getBSFld223() throws CFException{
     if (isBSFld223Modified()) { 
        bSFld223 = refreshBSFld223();
     }
   		return bSFld223;
   }

  
	/**
	*  set variable bSFld223
	*  Corresponding COBOL Variable is WS-2-3B-S-FLD2
	*  @param value
	**/
   public void setBSFld223(char[] value) {
      bSFld223 = checkBSFld223Constraints(value);
      serializeBSFld223(bSFld223);
   } 

     /**
	 * 	Update BSFld223 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBSFld223(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBSFld223,bSFld223.length);
   	
   }
   
   public void setBSFld223(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld223,bSFld223.length);
   	
   }
   
     /**
	 * 	Update BSFld223 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBSFld223(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld223+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BSFld223 with another Field
	 *	@param value
	 */
   public void setBSFld223(Field source) {
       replace(source,0,source.length(),beginBSFld223,B_SFLD_223_LEN);
   	
   }  
   
     /**
	 * 	Update BSFld223 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBSFld223(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBSFld223,B_SFLD_223_LEN);
   	
   }
   
     /**
	 * 	Update BSFld223 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBSFld223(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld223+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BS23
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBSFld123(CONSTANTS.SPACE_30);
         setBSFld223(CONSTANTS.SPACE_40);
   }

		public static int getBS23FieldLength() {
			return B_S_23_LENGTH;
		}

}
  
