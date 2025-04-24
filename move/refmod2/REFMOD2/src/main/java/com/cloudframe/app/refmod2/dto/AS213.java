package com.cloudframe.app.refmod2.dto;

/**
*  The class AS213 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AS213 extends AS213Serialized { 
   

						private char[] aSFld1213 = Field.fillLowValue(30);

						private char[] aSFld2213 = Field.fillLowValue(40);
	
	/**
	* Constructor for AS213
	**/
    public AS213() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AS213. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AS213(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of aSFld1213
	 *	@return aSFld1213
	 */
   public char[] getASFld1213() throws CFException{
     if (isASFld1213Modified()) { 
        aSFld1213 = refreshASFld1213();
     }
   		return aSFld1213;
   }

  
	/**
	*  set variable aSFld1213
	*  Corresponding COBOL Variable is WS-2-13A-S-FLD1
	*  @param value
	**/
   public void setASFld1213(char[] value) {
      aSFld1213 = checkASFld1213Constraints(value);
      serializeASFld1213(aSFld1213);
   } 

     /**
	 * 	Update ASFld1213 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setASFld1213(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginASFld1213,aSFld1213.length);
   	
   }
   
   public void setASFld1213(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginASFld1213,aSFld1213.length);
   	
   }
   
     /**
	 * 	Update ASFld1213 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setASFld1213(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld1213+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ASFld1213 with another Field
	 *	@param value
	 */
   public void setASFld1213(Field source) {
       replace(source,0,source.length(),beginASFld1213,A_SFLD_1213_LEN);
   	
   }  
   
     /**
	 * 	Update ASFld1213 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setASFld1213(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginASFld1213,A_SFLD_1213_LEN);
   	
   }
   
     /**
	 * 	Update ASFld1213 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setASFld1213(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld1213+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aSFld2213
	 *	@return aSFld2213
	 */
   public char[] getASFld2213() throws CFException{
     if (isASFld2213Modified()) { 
        aSFld2213 = refreshASFld2213();
     }
   		return aSFld2213;
   }

  
	/**
	*  set variable aSFld2213
	*  Corresponding COBOL Variable is WS-2-13A-S-FLD2
	*  @param value
	**/
   public void setASFld2213(char[] value) {
      aSFld2213 = checkASFld2213Constraints(value);
      serializeASFld2213(aSFld2213);
   } 

     /**
	 * 	Update ASFld2213 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setASFld2213(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginASFld2213,aSFld2213.length);
   	
   }
   
   public void setASFld2213(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginASFld2213,aSFld2213.length);
   	
   }
   
     /**
	 * 	Update ASFld2213 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setASFld2213(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld2213+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ASFld2213 with another Field
	 *	@param value
	 */
   public void setASFld2213(Field source) {
       replace(source,0,source.length(),beginASFld2213,A_SFLD_2213_LEN);
   	
   }  
   
     /**
	 * 	Update ASFld2213 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setASFld2213(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginASFld2213,A_SFLD_2213_LEN);
   	
   }
   
     /**
	 * 	Update ASFld2213 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setASFld2213(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld2213+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AS213
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setASFld1213(CONSTANTS.SPACE_30);
         setASFld2213(CONSTANTS.SPACE_40);
   }

		public static int getAS213FieldLength() {
			return A_S_213_LENGTH;
		}

}
  
