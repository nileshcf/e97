package com.cloudframe.app.global.sharedvar;

/**
*  The class BS15 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BS15 extends BS15Serialized { 
   

						private char[] bSFld115 = Field.fillLowValue(30);

						private char[] bSFld215 = Field.fillLowValue(40);
	
	/**
	* Constructor for BS15
	**/
    public BS15() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BS15. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BS15(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bSFld115
	 *	@return bSFld115
	 */
   public char[] getBSFld115() throws CFException{
     if (isBSFld115Modified()) { 
        bSFld115 = refreshBSFld115();
     }
   		return bSFld115;
   }

  
	/**
	*  set variable bSFld115
	*  Corresponding COBOL Variable is WS-15B-S-FLD1
	*  @param value
	**/
   public void setBSFld115(char[] value) {
      bSFld115 = checkBSFld115Constraints(value);
      serializeBSFld115(bSFld115);
   } 

     /**
	 * 	Update BSFld115 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBSFld115(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBSFld115,bSFld115.length);
   	
   }
   
   public void setBSFld115(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld115,bSFld115.length);
   	
   }
   
     /**
	 * 	Update BSFld115 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBSFld115(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld115+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BSFld115 with another Field
	 *	@param value
	 */
   public void setBSFld115(Field source) {
       replace(source,0,source.length(),beginBSFld115,B_SFLD_115_LEN);
   	
   }  
   
     /**
	 * 	Update BSFld115 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBSFld115(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBSFld115,B_SFLD_115_LEN);
   	
   }
   
     /**
	 * 	Update BSFld115 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBSFld115(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld115+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bSFld215
	 *	@return bSFld215
	 */
   public char[] getBSFld215() throws CFException{
     if (isBSFld215Modified()) { 
        bSFld215 = refreshBSFld215();
     }
   		return bSFld215;
   }

  
	/**
	*  set variable bSFld215
	*  Corresponding COBOL Variable is WS-15B-S-FLD2
	*  @param value
	**/
   public void setBSFld215(char[] value) {
      bSFld215 = checkBSFld215Constraints(value);
      serializeBSFld215(bSFld215);
   } 

     /**
	 * 	Update BSFld215 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBSFld215(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBSFld215,bSFld215.length);
   	
   }
   
   public void setBSFld215(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld215,bSFld215.length);
   	
   }
   
     /**
	 * 	Update BSFld215 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBSFld215(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld215+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BSFld215 with another Field
	 *	@param value
	 */
   public void setBSFld215(Field source) {
       replace(source,0,source.length(),beginBSFld215,B_SFLD_215_LEN);
   	
   }  
   
     /**
	 * 	Update BSFld215 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBSFld215(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBSFld215,B_SFLD_215_LEN);
   	
   }
   
     /**
	 * 	Update BSFld215 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBSFld215(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld215+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BS15
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBSFld115(CONSTANTS.SPACE_30);
         setBSFld215(CONSTANTS.SPACE_40);
   }

		public static int getBS15FieldLength() {
			return B_S_15_LENGTH;
		}

}
  
