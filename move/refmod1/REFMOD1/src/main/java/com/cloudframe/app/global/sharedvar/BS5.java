package com.cloudframe.app.global.sharedvar;

/**
*  The class BS5 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BS5 extends BS5Serialized { 
   

						private char[] bSFld15 = Field.fillLowValue(30);

						private char[] bSFld25 = Field.fillLowValue(40);
	
	/**
	* Constructor for BS5
	**/
    public BS5() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BS5. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BS5(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bSFld15
	 *	@return bSFld15
	 */
   public char[] getBSFld15() throws CFException{
     if (isBSFld15Modified()) { 
        bSFld15 = refreshBSFld15();
     }
   		return bSFld15;
   }

  
	/**
	*  set variable bSFld15
	*  Corresponding COBOL Variable is WS-5B-S-FLD1
	*  @param value
	**/
   public void setBSFld15(char[] value) {
      bSFld15 = checkBSFld15Constraints(value);
      serializeBSFld15(bSFld15);
   } 

     /**
	 * 	Update BSFld15 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBSFld15(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBSFld15,bSFld15.length);
   	
   }
   
   public void setBSFld15(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld15,bSFld15.length);
   	
   }
   
     /**
	 * 	Update BSFld15 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBSFld15(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld15+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BSFld15 with another Field
	 *	@param value
	 */
   public void setBSFld15(Field source) {
       replace(source,0,source.length(),beginBSFld15,B_SFLD_15_LEN);
   	
   }  
   
     /**
	 * 	Update BSFld15 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBSFld15(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBSFld15,B_SFLD_15_LEN);
   	
   }
   
     /**
	 * 	Update BSFld15 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBSFld15(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld15+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bSFld25
	 *	@return bSFld25
	 */
   public char[] getBSFld25() throws CFException{
     if (isBSFld25Modified()) { 
        bSFld25 = refreshBSFld25();
     }
   		return bSFld25;
   }

  
	/**
	*  set variable bSFld25
	*  Corresponding COBOL Variable is WS-5B-S-FLD2
	*  @param value
	**/
   public void setBSFld25(char[] value) {
      bSFld25 = checkBSFld25Constraints(value);
      serializeBSFld25(bSFld25);
   } 

     /**
	 * 	Update BSFld25 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBSFld25(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBSFld25,bSFld25.length);
   	
   }
   
   public void setBSFld25(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld25,bSFld25.length);
   	
   }
   
     /**
	 * 	Update BSFld25 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBSFld25(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld25+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BSFld25 with another Field
	 *	@param value
	 */
   public void setBSFld25(Field source) {
       replace(source,0,source.length(),beginBSFld25,B_SFLD_25_LEN);
   	
   }  
   
     /**
	 * 	Update BSFld25 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBSFld25(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBSFld25,B_SFLD_25_LEN);
   	
   }
   
     /**
	 * 	Update BSFld25 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBSFld25(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld25+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BS5
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBSFld15(CONSTANTS.SPACE_30);
         setBSFld25(CONSTANTS.SPACE_40);
   }

		public static int getBS5FieldLength() {
			return B_S_5_LENGTH;
		}

}
  
