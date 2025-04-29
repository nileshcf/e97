package com.cloudframe.app.refmod1.dto;

/**
*  The class BS1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/


import com.cloudframe.app.refmod1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BS1 extends BS1Serialized {
   

						private char[] bSFld11 = Field.fillLowValue(30);

						private char[] bSFld21 = Field.fillLowValue(40);
	
	/**
	* Constructor for BS1
	**/
    public BS1() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of bSFld11
	 *	@return bSFld11
	 */
   public char[] getBSFld11() throws CFException{
     if (isBSFld11Modified()) { 
        bSFld11 = refreshBSFld11();
     }
   		return bSFld11;
   }

  
	/**
	*  set variable bSFld11
	*  Corresponding COBOL Variable is WS-1B-S-FLD1
	*  @param value
	**/
   public void setBSFld11(char[] value) {
      bSFld11 = checkBSFld11Constraints(value);
      serializeBSFld11(bSFld11);
   } 

     /**
	 * 	Update BSFld11 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBSFld11(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBSFld11,bSFld11.length);
   	
   }
   
   public void setBSFld11(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld11,bSFld11.length);
   	
   }
   
     /**
	 * 	Update BSFld11 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBSFld11(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld11+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BSFld11 with another Field
	 *	@param value
	 */
   public void setBSFld11(Field source) {
       replace(source,0,source.length(),beginBSFld11,B_SFLD_11_LEN);
   	
   }  
   
     /**
	 * 	Update BSFld11 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBSFld11(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBSFld11,B_SFLD_11_LEN);
   	
   }
   
     /**
	 * 	Update BSFld11 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBSFld11(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld11+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bSFld21
	 *	@return bSFld21
	 */
   public char[] getBSFld21() throws CFException{
     if (isBSFld21Modified()) { 
        bSFld21 = refreshBSFld21();
     }
   		return bSFld21;
   }

  
	/**
	*  set variable bSFld21
	*  Corresponding COBOL Variable is WS-1B-S-FLD2
	*  @param value
	**/
   public void setBSFld21(char[] value) {
      bSFld21 = checkBSFld21Constraints(value);
      serializeBSFld21(bSFld21);
   } 

     /**
	 * 	Update BSFld21 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBSFld21(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBSFld21,bSFld21.length);
   	
   }
   
   public void setBSFld21(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld21,bSFld21.length);
   	
   }
   
     /**
	 * 	Update BSFld21 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBSFld21(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld21+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BSFld21 with another Field
	 *	@param value
	 */
   public void setBSFld21(Field source) {
       replace(source,0,source.length(),beginBSFld21,B_SFLD_21_LEN);
   	
   }  
   
     /**
	 * 	Update BSFld21 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBSFld21(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBSFld21,B_SFLD_21_LEN);
   	
   }
   
     /**
	 * 	Update BSFld21 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBSFld21(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld21+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BS1
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBSFld11(CONSTANTS.SPACE_30);
         setBSFld21(CONSTANTS.SPACE_40);
   }

		public static int getBS1FieldLength() {
			return B_S_1_LENGTH;
		}

}
  
