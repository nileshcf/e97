package com.cloudframe.app.cfdate02.file.records;

/**
*  The class RlatdDtl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:10. using version 5.0.0.254
**/


import com.cloudframe.app.cfdate02.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RlatdDtl extends RlatdDtlSerialized { 
   

						private char[] rlatdFieldErrorCode = Field.fillLowValue(3);
	
	/**
	* Constructor for RlatdDtl
	**/
    public RlatdDtl() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for RlatdDtl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RlatdDtl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of rlatdFieldErrorCode
	 *	@return rlatdFieldErrorCode
	 */
   public char[] getRlatdFieldErrorCode() throws CFException{
     if (isRlatdFieldErrorCodeModified()) { 
        rlatdFieldErrorCode = refreshRlatdFieldErrorCode();
     }
   		return rlatdFieldErrorCode;
   }

  
	/**
	*  set variable rlatdFieldErrorCode
	*  Corresponding COBOL Variable is RLATD-FIELD-ERROR-CODE
	*  @param value
	**/
   public void setRlatdFieldErrorCode(char[] value) {
      rlatdFieldErrorCode = checkRlatdFieldErrorCodeConstraints(value);
      serializeRlatdFieldErrorCode(rlatdFieldErrorCode);
   } 

     /**
	 * 	Update RlatdFieldErrorCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlatdFieldErrorCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlatdFieldErrorCode,rlatdFieldErrorCode.length);
   	
   }
   
   public void setRlatdFieldErrorCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlatdFieldErrorCode,rlatdFieldErrorCode.length);
   	
   }
   
     /**
	 * 	Update RlatdFieldErrorCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlatdFieldErrorCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlatdFieldErrorCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RlatdFieldErrorCode with another Field
	 *	@param value
	 */
   public void setRlatdFieldErrorCode(Field source) {
       replace(source,0,source.length(),beginRlatdFieldErrorCode,RLATD_FIELD_ERROR_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update RlatdFieldErrorCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlatdFieldErrorCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlatdFieldErrorCode,RLATD_FIELD_ERROR_CODE_LEN);
   	
   }
   
     /**
	 * 	Update RlatdFieldErrorCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlatdFieldErrorCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlatdFieldErrorCode+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRlatdDtlFieldLength() {
			return RLATD_DTL_LENGTH;
		}

}
  
