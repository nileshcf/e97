package com.cloudframe.app.cfdate02.file.records;

/**
*  The class OldcrLnShrGrpRemDtl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:35. using version 5.0.0.254
**/


import com.cloudframe.app.cfdate02.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class OldcrLnShrGrpRemDtl extends OldcrLnShrGrpRemDtlSerialized { 
   

						private char[] oldcrFieldErrorCode = Field.fillLowValue(3);
	
	/**
	* Constructor for OldcrLnShrGrpRemDtl
	**/
    public OldcrLnShrGrpRemDtl() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for OldcrLnShrGrpRemDtl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public OldcrLnShrGrpRemDtl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of oldcrFieldErrorCode
	 *	@return oldcrFieldErrorCode
	 */
   public char[] getOldcrFieldErrorCode() throws CFException{
     if (isOldcrFieldErrorCodeModified()) { 
        oldcrFieldErrorCode = refreshOldcrFieldErrorCode();
     }
   		return oldcrFieldErrorCode;
   }

  
	/**
	*  set variable oldcrFieldErrorCode
	*  Corresponding COBOL Variable is OLDCR-FIELD-ERROR-CODE
	*  @param value
	**/
   public void setOldcrFieldErrorCode(char[] value) {
      oldcrFieldErrorCode = checkOldcrFieldErrorCodeConstraints(value);
      serializeOldcrFieldErrorCode(oldcrFieldErrorCode);
   } 

     /**
	 * 	Update OldcrFieldErrorCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOldcrFieldErrorCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginOldcrFieldErrorCode,oldcrFieldErrorCode.length);
   	
   }
   
   public void setOldcrFieldErrorCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginOldcrFieldErrorCode,oldcrFieldErrorCode.length);
   	
   }
   
     /**
	 * 	Update OldcrFieldErrorCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOldcrFieldErrorCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOldcrFieldErrorCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update OldcrFieldErrorCode with another Field
	 *	@param value
	 */
   public void setOldcrFieldErrorCode(Field source) {
       replace(source,0,source.length(),beginOldcrFieldErrorCode,OLDCR_FIELD_ERROR_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update OldcrFieldErrorCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOldcrFieldErrorCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginOldcrFieldErrorCode,OLDCR_FIELD_ERROR_CODE_LEN);
   	
   }
   
     /**
	 * 	Update OldcrFieldErrorCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOldcrFieldErrorCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOldcrFieldErrorCode+targetIndex,targetLen);
    
   }

	
	
	

		public static int getOldcrLnShrGrpRemDtlFieldLength() {
			return OLDCR_LN_SHR_GRP_REM_DTL_LENGTH;
		}

}
  
