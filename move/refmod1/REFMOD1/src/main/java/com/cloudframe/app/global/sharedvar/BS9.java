package com.cloudframe.app.global.sharedvar;

/**
*  The class BS9 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BS9 extends BS9Serialized { 
   

						private char[] bSFld19 = Field.fillLowValue(30);

						private char[] bSFld29 = Field.fillLowValue(40);
	
	/**
	* Constructor for BS9
	**/
    public BS9() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BS9. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BS9(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bSFld19
	 *	@return bSFld19
	 */
   public char[] getBSFld19() throws CFException{
     if (isBSFld19Modified()) { 
        bSFld19 = refreshBSFld19();
     }
   		return bSFld19;
   }

  
	/**
	*  set variable bSFld19
	*  Corresponding COBOL Variable is WS-9B-S-FLD1
	*  @param value
	**/
   public void setBSFld19(char[] value) {
      bSFld19 = checkBSFld19Constraints(value);
      serializeBSFld19(bSFld19);
   } 

     /**
	 * 	Update BSFld19 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBSFld19(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBSFld19,bSFld19.length);
   	
   }
   
   public void setBSFld19(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld19,bSFld19.length);
   	
   }
   
     /**
	 * 	Update BSFld19 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBSFld19(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld19+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BSFld19 with another Field
	 *	@param value
	 */
   public void setBSFld19(Field source) {
       replace(source,0,source.length(),beginBSFld19,B_SFLD_19_LEN);
   	
   }  
   
     /**
	 * 	Update BSFld19 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBSFld19(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBSFld19,B_SFLD_19_LEN);
   	
   }
   
     /**
	 * 	Update BSFld19 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBSFld19(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld19+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bSFld29
	 *	@return bSFld29
	 */
   public char[] getBSFld29() throws CFException{
     if (isBSFld29Modified()) { 
        bSFld29 = refreshBSFld29();
     }
   		return bSFld29;
   }

  
	/**
	*  set variable bSFld29
	*  Corresponding COBOL Variable is WS-9B-S-FLD2
	*  @param value
	**/
   public void setBSFld29(char[] value) {
      bSFld29 = checkBSFld29Constraints(value);
      serializeBSFld29(bSFld29);
   } 

     /**
	 * 	Update BSFld29 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBSFld29(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBSFld29,bSFld29.length);
   	
   }
   
   public void setBSFld29(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld29,bSFld29.length);
   	
   }
   
     /**
	 * 	Update BSFld29 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBSFld29(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld29+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BSFld29 with another Field
	 *	@param value
	 */
   public void setBSFld29(Field source) {
       replace(source,0,source.length(),beginBSFld29,B_SFLD_29_LEN);
   	
   }  
   
     /**
	 * 	Update BSFld29 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBSFld29(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBSFld29,B_SFLD_29_LEN);
   	
   }
   
     /**
	 * 	Update BSFld29 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBSFld29(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld29+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BS9
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBSFld19(CONSTANTS.SPACE_30);
         setBSFld29(CONSTANTS.SPACE_40);
   }

		public static int getBS9FieldLength() {
			return B_S_9_LENGTH;
		}

}
  
