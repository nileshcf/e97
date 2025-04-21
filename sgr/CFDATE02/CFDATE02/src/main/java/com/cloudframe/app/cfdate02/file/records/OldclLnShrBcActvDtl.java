package com.cloudframe.app.cfdate02.file.records;

/**
*  The class OldclLnShrBcActvDtl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:12. using version 5.0.0.256
**/


import com.cloudframe.app.cfdate02.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class OldclLnShrBcActvDtl extends OldclLnShrBcActvDtlSerialized { 
   

						private char[] oldclFieldErrorCode = Field.fillLowValue(3);
	
	/**
	* Constructor for OldclLnShrBcActvDtl
	**/
    public OldclLnShrBcActvDtl() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for OldclLnShrBcActvDtl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public OldclLnShrBcActvDtl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of oldclFieldErrorCode
	 *	@return oldclFieldErrorCode
	 */
   public char[] getOldclFieldErrorCode() throws CFException{
     if (isOldclFieldErrorCodeModified()) { 
        oldclFieldErrorCode = refreshOldclFieldErrorCode();
     }
   		return oldclFieldErrorCode;
   }

  
	/**
	*  set variable oldclFieldErrorCode
	*  Corresponding COBOL Variable is OLDCL-FIELD-ERROR-CODE
	*  @param value
	**/
   public void setOldclFieldErrorCode(char[] value) {
      oldclFieldErrorCode = checkOldclFieldErrorCodeConstraints(value);
      serializeOldclFieldErrorCode(oldclFieldErrorCode);
   } 

     /**
	 * 	Update OldclFieldErrorCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOldclFieldErrorCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginOldclFieldErrorCode,oldclFieldErrorCode.length);
   	
   }
   
   public void setOldclFieldErrorCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginOldclFieldErrorCode,oldclFieldErrorCode.length);
   	
   }
   
     /**
	 * 	Update OldclFieldErrorCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOldclFieldErrorCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOldclFieldErrorCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update OldclFieldErrorCode with another Field
	 *	@param value
	 */
   public void setOldclFieldErrorCode(Field source) {
       replace(source,0,source.length(),beginOldclFieldErrorCode,OLDCL_FIELD_ERROR_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update OldclFieldErrorCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOldclFieldErrorCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginOldclFieldErrorCode,OLDCL_FIELD_ERROR_CODE_LEN);
   	
   }
   
     /**
	 * 	Update OldclFieldErrorCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOldclFieldErrorCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOldclFieldErrorCode+targetIndex,targetLen);
    
   }

	
	
	

		public static int getOldclLnShrBcActvDtlFieldLength() {
			return OLDCL_LN_SHR_BC_ACTV_DTL_LENGTH;
		}

}
  
