package com.cloudframe.app.cfdate02.file.records;

/**
*  The class RlatuDtl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:12. using version 5.0.0.256
**/


import com.cloudframe.app.cfdate02.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RlatuDtl extends RlatuDtlSerialized { 
   

						private char[] rlatuFieldErrorCode = Field.fillLowValue(3);
	
	/**
	* Constructor for RlatuDtl
	**/
    public RlatuDtl() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for RlatuDtl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RlatuDtl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of rlatuFieldErrorCode
	 *	@return rlatuFieldErrorCode
	 */
   public char[] getRlatuFieldErrorCode() throws CFException{
     if (isRlatuFieldErrorCodeModified()) { 
        rlatuFieldErrorCode = refreshRlatuFieldErrorCode();
     }
   		return rlatuFieldErrorCode;
   }

  
	/**
	*  set variable rlatuFieldErrorCode
	*  Corresponding COBOL Variable is RLATU-FIELD-ERROR-CODE
	*  @param value
	**/
   public void setRlatuFieldErrorCode(char[] value) {
      rlatuFieldErrorCode = checkRlatuFieldErrorCodeConstraints(value);
      serializeRlatuFieldErrorCode(rlatuFieldErrorCode);
   } 

     /**
	 * 	Update RlatuFieldErrorCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlatuFieldErrorCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlatuFieldErrorCode,rlatuFieldErrorCode.length);
   	
   }
   
   public void setRlatuFieldErrorCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlatuFieldErrorCode,rlatuFieldErrorCode.length);
   	
   }
   
     /**
	 * 	Update RlatuFieldErrorCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlatuFieldErrorCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlatuFieldErrorCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RlatuFieldErrorCode with another Field
	 *	@param value
	 */
   public void setRlatuFieldErrorCode(Field source) {
       replace(source,0,source.length(),beginRlatuFieldErrorCode,RLATU_FIELD_ERROR_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update RlatuFieldErrorCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlatuFieldErrorCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlatuFieldErrorCode,RLATU_FIELD_ERROR_CODE_LEN);
   	
   }
   
     /**
	 * 	Update RlatuFieldErrorCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlatuFieldErrorCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlatuFieldErrorCode+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRlatuDtlFieldLength() {
			return RLATU_DTL_LENGTH;
		}

}
  
