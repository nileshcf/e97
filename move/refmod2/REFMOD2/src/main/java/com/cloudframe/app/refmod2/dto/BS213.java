package com.cloudframe.app.refmod2.dto;

/**
*  The class BS213 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:25. using version 5.0.0.254
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BS213 extends BS213Serialized { 
   

						private char[] bSFld1213 = Field.fillLowValue(30);

						private char[] bSFld2213 = Field.fillLowValue(40);
	
	/**
	* Constructor for BS213
	**/
    public BS213() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BS213. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BS213(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bSFld1213
	 *	@return bSFld1213
	 */
   public char[] getBSFld1213() throws CFException{
     if (isBSFld1213Modified()) { 
        bSFld1213 = refreshBSFld1213();
     }
   		return bSFld1213;
   }

  
	/**
	*  set variable bSFld1213
	*  Corresponding COBOL Variable is WS-2-13B-S-FLD1
	*  @param value
	**/
   public void setBSFld1213(char[] value) {
      bSFld1213 = checkBSFld1213Constraints(value);
      serializeBSFld1213(bSFld1213);
   } 

     /**
	 * 	Update BSFld1213 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBSFld1213(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBSFld1213,bSFld1213.length);
   	
   }
   
   public void setBSFld1213(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld1213,bSFld1213.length);
   	
   }
   
     /**
	 * 	Update BSFld1213 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBSFld1213(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld1213+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BSFld1213 with another Field
	 *	@param value
	 */
   public void setBSFld1213(Field source) {
       replace(source,0,source.length(),beginBSFld1213,B_SFLD_1213_LEN);
   	
   }  
   
     /**
	 * 	Update BSFld1213 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBSFld1213(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBSFld1213,B_SFLD_1213_LEN);
   	
   }
   
     /**
	 * 	Update BSFld1213 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBSFld1213(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld1213+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bSFld2213
	 *	@return bSFld2213
	 */
   public char[] getBSFld2213() throws CFException{
     if (isBSFld2213Modified()) { 
        bSFld2213 = refreshBSFld2213();
     }
   		return bSFld2213;
   }

  
	/**
	*  set variable bSFld2213
	*  Corresponding COBOL Variable is WS-2-13B-S-FLD2
	*  @param value
	**/
   public void setBSFld2213(char[] value) {
      bSFld2213 = checkBSFld2213Constraints(value);
      serializeBSFld2213(bSFld2213);
   } 

     /**
	 * 	Update BSFld2213 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBSFld2213(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBSFld2213,bSFld2213.length);
   	
   }
   
   public void setBSFld2213(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld2213,bSFld2213.length);
   	
   }
   
     /**
	 * 	Update BSFld2213 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBSFld2213(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld2213+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BSFld2213 with another Field
	 *	@param value
	 */
   public void setBSFld2213(Field source) {
       replace(source,0,source.length(),beginBSFld2213,B_SFLD_2213_LEN);
   	
   }  
   
     /**
	 * 	Update BSFld2213 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBSFld2213(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBSFld2213,B_SFLD_2213_LEN);
   	
   }
   
     /**
	 * 	Update BSFld2213 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBSFld2213(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld2213+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BS213
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBSFld1213(CONSTANTS.SPACE_30);
         setBSFld2213(CONSTANTS.SPACE_40);
   }

		public static int getBS213FieldLength() {
			return B_S_213_LENGTH;
		}

}
  
