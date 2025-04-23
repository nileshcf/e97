package com.cloudframe.app.refmod3.dto;

/**
*  The class BS25 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:24. using version 5.0.0.254
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BS25 extends BS25Serialized { 
   

						private char[] bSFld125 = Field.fillLowValue(30);

						private char[] bSFld225 = Field.fillLowValue(40);
	
	/**
	* Constructor for BS25
	**/
    public BS25() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BS25. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BS25(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bSFld125
	 *	@return bSFld125
	 */
   public char[] getBSFld125() throws CFException{
     if (isBSFld125Modified()) { 
        bSFld125 = refreshBSFld125();
     }
   		return bSFld125;
   }

  
	/**
	*  set variable bSFld125
	*  Corresponding COBOL Variable is WS-2-5B-S-FLD1
	*  @param value
	**/
   public void setBSFld125(char[] value) {
      bSFld125 = checkBSFld125Constraints(value);
      serializeBSFld125(bSFld125);
   } 

     /**
	 * 	Update BSFld125 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBSFld125(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBSFld125,bSFld125.length);
   	
   }
   
   public void setBSFld125(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld125,bSFld125.length);
   	
   }
   
     /**
	 * 	Update BSFld125 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBSFld125(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld125+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BSFld125 with another Field
	 *	@param value
	 */
   public void setBSFld125(Field source) {
       replace(source,0,source.length(),beginBSFld125,B_SFLD_125_LEN);
   	
   }  
   
     /**
	 * 	Update BSFld125 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBSFld125(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBSFld125,B_SFLD_125_LEN);
   	
   }
   
     /**
	 * 	Update BSFld125 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBSFld125(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld125+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bSFld225
	 *	@return bSFld225
	 */
   public char[] getBSFld225() throws CFException{
     if (isBSFld225Modified()) { 
        bSFld225 = refreshBSFld225();
     }
   		return bSFld225;
   }

  
	/**
	*  set variable bSFld225
	*  Corresponding COBOL Variable is WS-2-5B-S-FLD2
	*  @param value
	**/
   public void setBSFld225(char[] value) {
      bSFld225 = checkBSFld225Constraints(value);
      serializeBSFld225(bSFld225);
   } 

     /**
	 * 	Update BSFld225 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBSFld225(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBSFld225,bSFld225.length);
   	
   }
   
   public void setBSFld225(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld225,bSFld225.length);
   	
   }
   
     /**
	 * 	Update BSFld225 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBSFld225(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld225+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BSFld225 with another Field
	 *	@param value
	 */
   public void setBSFld225(Field source) {
       replace(source,0,source.length(),beginBSFld225,B_SFLD_225_LEN);
   	
   }  
   
     /**
	 * 	Update BSFld225 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBSFld225(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBSFld225,B_SFLD_225_LEN);
   	
   }
   
     /**
	 * 	Update BSFld225 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBSFld225(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld225+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BS25
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBSFld125(CONSTANTS.SPACE_30);
         setBSFld225(CONSTANTS.SPACE_40);
   }

		public static int getBS25FieldLength() {
			return B_S_25_LENGTH;
		}

}
  
