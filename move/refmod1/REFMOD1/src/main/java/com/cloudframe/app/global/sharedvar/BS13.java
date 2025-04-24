package com.cloudframe.app.global.sharedvar;

/**
*  The class BS13 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BS13 extends BS13Serialized { 
   

						private char[] bSFld113 = Field.fillLowValue(30);

						private char[] bSFld213 = Field.fillLowValue(40);
	
	/**
	* Constructor for BS13
	**/
    public BS13() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BS13. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BS13(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bSFld113
	 *	@return bSFld113
	 */
   public char[] getBSFld113() throws CFException{
     if (isBSFld113Modified()) { 
        bSFld113 = refreshBSFld113();
     }
   		return bSFld113;
   }

  
	/**
	*  set variable bSFld113
	*  Corresponding COBOL Variable is WS-13B-S-FLD1
	*  @param value
	**/
   public void setBSFld113(char[] value) {
      bSFld113 = checkBSFld113Constraints(value);
      serializeBSFld113(bSFld113);
   } 

     /**
	 * 	Update BSFld113 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBSFld113(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBSFld113,bSFld113.length);
   	
   }
   
   public void setBSFld113(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld113,bSFld113.length);
   	
   }
   
     /**
	 * 	Update BSFld113 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBSFld113(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld113+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BSFld113 with another Field
	 *	@param value
	 */
   public void setBSFld113(Field source) {
       replace(source,0,source.length(),beginBSFld113,B_SFLD_113_LEN);
   	
   }  
   
     /**
	 * 	Update BSFld113 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBSFld113(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBSFld113,B_SFLD_113_LEN);
   	
   }
   
     /**
	 * 	Update BSFld113 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBSFld113(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld113+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bSFld213
	 *	@return bSFld213
	 */
   public char[] getBSFld213() throws CFException{
     if (isBSFld213Modified()) { 
        bSFld213 = refreshBSFld213();
     }
   		return bSFld213;
   }

  
	/**
	*  set variable bSFld213
	*  Corresponding COBOL Variable is WS-13B-S-FLD2
	*  @param value
	**/
   public void setBSFld213(char[] value) {
      bSFld213 = checkBSFld213Constraints(value);
      serializeBSFld213(bSFld213);
   } 

     /**
	 * 	Update BSFld213 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBSFld213(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBSFld213,bSFld213.length);
   	
   }
   
   public void setBSFld213(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld213,bSFld213.length);
   	
   }
   
     /**
	 * 	Update BSFld213 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBSFld213(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld213+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BSFld213 with another Field
	 *	@param value
	 */
   public void setBSFld213(Field source) {
       replace(source,0,source.length(),beginBSFld213,B_SFLD_213_LEN);
   	
   }  
   
     /**
	 * 	Update BSFld213 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBSFld213(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBSFld213,B_SFLD_213_LEN);
   	
   }
   
     /**
	 * 	Update BSFld213 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBSFld213(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld213+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BS13
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBSFld113(CONSTANTS.SPACE_30);
         setBSFld213(CONSTANTS.SPACE_40);
   }

		public static int getBS13FieldLength() {
			return B_S_13_LENGTH;
		}

}
  
