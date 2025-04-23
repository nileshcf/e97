package com.cloudframe.app.global.sharedvar;

/**
*  The class AS13 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AS13 extends AS13Serialized { 
   

						private char[] aSFld113 = Field.fillLowValue(30);

						private char[] aSFld213 = Field.fillLowValue(40);
	
	/**
	* Constructor for AS13
	**/
    public AS13() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AS13. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AS13(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of aSFld113
	 *	@return aSFld113
	 */
   public char[] getASFld113() throws CFException{
     if (isASFld113Modified()) { 
        aSFld113 = refreshASFld113();
     }
   		return aSFld113;
   }

  
	/**
	*  set variable aSFld113
	*  Corresponding COBOL Variable is WS-13A-S-FLD1
	*  @param value
	**/
   public void setASFld113(char[] value) {
      aSFld113 = checkASFld113Constraints(value);
      serializeASFld113(aSFld113);
   } 

     /**
	 * 	Update ASFld113 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setASFld113(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginASFld113,aSFld113.length);
   	
   }
   
   public void setASFld113(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginASFld113,aSFld113.length);
   	
   }
   
     /**
	 * 	Update ASFld113 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setASFld113(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld113+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ASFld113 with another Field
	 *	@param value
	 */
   public void setASFld113(Field source) {
       replace(source,0,source.length(),beginASFld113,A_SFLD_113_LEN);
   	
   }  
   
     /**
	 * 	Update ASFld113 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setASFld113(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginASFld113,A_SFLD_113_LEN);
   	
   }
   
     /**
	 * 	Update ASFld113 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setASFld113(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld113+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aSFld213
	 *	@return aSFld213
	 */
   public char[] getASFld213() throws CFException{
     if (isASFld213Modified()) { 
        aSFld213 = refreshASFld213();
     }
   		return aSFld213;
   }

  
	/**
	*  set variable aSFld213
	*  Corresponding COBOL Variable is WS-13A-S-FLD2
	*  @param value
	**/
   public void setASFld213(char[] value) {
      aSFld213 = checkASFld213Constraints(value);
      serializeASFld213(aSFld213);
   } 

     /**
	 * 	Update ASFld213 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setASFld213(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginASFld213,aSFld213.length);
   	
   }
   
   public void setASFld213(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginASFld213,aSFld213.length);
   	
   }
   
     /**
	 * 	Update ASFld213 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setASFld213(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld213+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ASFld213 with another Field
	 *	@param value
	 */
   public void setASFld213(Field source) {
       replace(source,0,source.length(),beginASFld213,A_SFLD_213_LEN);
   	
   }  
   
     /**
	 * 	Update ASFld213 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setASFld213(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginASFld213,A_SFLD_213_LEN);
   	
   }
   
     /**
	 * 	Update ASFld213 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setASFld213(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld213+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AS13
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setASFld113(CONSTANTS.SPACE_30);
         setASFld213(CONSTANTS.SPACE_40);
   }

		public static int getAS13FieldLength() {
			return A_S_13_LENGTH;
		}

}
  
