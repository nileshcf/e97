package com.cloudframe.app.refmod2.dto;

/**
*  The class AS25 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AS25 extends AS25Serialized { 
   

						private char[] aSFld125 = Field.fillLowValue(30);

						private char[] aSFld225 = Field.fillLowValue(40);
	
	/**
	* Constructor for AS25
	**/
    public AS25() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AS25. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AS25(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of aSFld125
	 *	@return aSFld125
	 */
   public char[] getASFld125() throws CFException{
     if (isASFld125Modified()) { 
        aSFld125 = refreshASFld125();
     }
   		return aSFld125;
   }

  
	/**
	*  set variable aSFld125
	*  Corresponding COBOL Variable is WS-2-5A-S-FLD1
	*  @param value
	**/
   public void setASFld125(char[] value) {
      aSFld125 = checkASFld125Constraints(value);
      serializeASFld125(aSFld125);
   } 

     /**
	 * 	Update ASFld125 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setASFld125(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginASFld125,aSFld125.length);
   	
   }
   
   public void setASFld125(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginASFld125,aSFld125.length);
   	
   }
   
     /**
	 * 	Update ASFld125 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setASFld125(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld125+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ASFld125 with another Field
	 *	@param value
	 */
   public void setASFld125(Field source) {
       replace(source,0,source.length(),beginASFld125,A_SFLD_125_LEN);
   	
   }  
   
     /**
	 * 	Update ASFld125 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setASFld125(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginASFld125,A_SFLD_125_LEN);
   	
   }
   
     /**
	 * 	Update ASFld125 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setASFld125(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld125+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aSFld225
	 *	@return aSFld225
	 */
   public char[] getASFld225() throws CFException{
     if (isASFld225Modified()) { 
        aSFld225 = refreshASFld225();
     }
   		return aSFld225;
   }

  
	/**
	*  set variable aSFld225
	*  Corresponding COBOL Variable is WS-2-5A-S-FLD2
	*  @param value
	**/
   public void setASFld225(char[] value) {
      aSFld225 = checkASFld225Constraints(value);
      serializeASFld225(aSFld225);
   } 

     /**
	 * 	Update ASFld225 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setASFld225(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginASFld225,aSFld225.length);
   	
   }
   
   public void setASFld225(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginASFld225,aSFld225.length);
   	
   }
   
     /**
	 * 	Update ASFld225 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setASFld225(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld225+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ASFld225 with another Field
	 *	@param value
	 */
   public void setASFld225(Field source) {
       replace(source,0,source.length(),beginASFld225,A_SFLD_225_LEN);
   	
   }  
   
     /**
	 * 	Update ASFld225 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setASFld225(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginASFld225,A_SFLD_225_LEN);
   	
   }
   
     /**
	 * 	Update ASFld225 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setASFld225(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld225+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AS25
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setASFld125(CONSTANTS.SPACE_30);
         setASFld225(CONSTANTS.SPACE_40);
   }

		public static int getAS25FieldLength() {
			return A_S_25_LENGTH;
		}

}
  
