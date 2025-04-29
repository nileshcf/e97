package com.cloudframe.app.refmod1.dto;

/**
*  The class BS3 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/


import com.cloudframe.app.refmod1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BS3 extends BS3Serialized {
   

						private char[] bSFld13 = Field.fillLowValue(30);

						private char[] bSFld23 = Field.fillLowValue(40);
	
	/**
	* Constructor for BS3
	**/
    public BS3() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of bSFld13
	 *	@return bSFld13
	 */
   public char[] getBSFld13() throws CFException{
     if (isBSFld13Modified()) { 
        bSFld13 = refreshBSFld13();
     }
   		return bSFld13;
   }

  
	/**
	*  set variable bSFld13
	*  Corresponding COBOL Variable is WS-3B-S-FLD1
	*  @param value
	**/
   public void setBSFld13(char[] value) {
      bSFld13 = checkBSFld13Constraints(value);
      serializeBSFld13(bSFld13);
   } 

     /**
	 * 	Update BSFld13 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBSFld13(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBSFld13,bSFld13.length);
   	
   }
   
   public void setBSFld13(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld13,bSFld13.length);
   	
   }
   
     /**
	 * 	Update BSFld13 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBSFld13(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld13+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BSFld13 with another Field
	 *	@param value
	 */
   public void setBSFld13(Field source) {
       replace(source,0,source.length(),beginBSFld13,B_SFLD_13_LEN);
   	
   }  
   
     /**
	 * 	Update BSFld13 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBSFld13(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBSFld13,B_SFLD_13_LEN);
   	
   }
   
     /**
	 * 	Update BSFld13 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBSFld13(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld13+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bSFld23
	 *	@return bSFld23
	 */
   public char[] getBSFld23() throws CFException{
     if (isBSFld23Modified()) { 
        bSFld23 = refreshBSFld23();
     }
   		return bSFld23;
   }

  
	/**
	*  set variable bSFld23
	*  Corresponding COBOL Variable is WS-3B-S-FLD2
	*  @param value
	**/
   public void setBSFld23(char[] value) {
      bSFld23 = checkBSFld23Constraints(value);
      serializeBSFld23(bSFld23);
   } 

     /**
	 * 	Update BSFld23 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBSFld23(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBSFld23,bSFld23.length);
   	
   }
   
   public void setBSFld23(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld23,bSFld23.length);
   	
   }
   
     /**
	 * 	Update BSFld23 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBSFld23(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld23+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BSFld23 with another Field
	 *	@param value
	 */
   public void setBSFld23(Field source) {
       replace(source,0,source.length(),beginBSFld23,B_SFLD_23_LEN);
   	
   }  
   
     /**
	 * 	Update BSFld23 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBSFld23(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBSFld23,B_SFLD_23_LEN);
   	
   }
   
     /**
	 * 	Update BSFld23 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBSFld23(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld23+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BS3
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBSFld13(CONSTANTS.SPACE_30);
         setBSFld23(CONSTANTS.SPACE_40);
   }

		public static int getBS3FieldLength() {
			return B_S_3_LENGTH;
		}

}
  
