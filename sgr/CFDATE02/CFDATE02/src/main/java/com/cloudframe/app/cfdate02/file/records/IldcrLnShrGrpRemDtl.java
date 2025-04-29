package com.cloudframe.app.cfdate02.file.records;

/**
*  The class IldcrLnShrGrpRemDtl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:35. using version 5.0.0.254
**/


import com.cloudframe.app.cfdate02.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class IldcrLnShrGrpRemDtl extends IldcrLnShrGrpRemDtlSerialized { 
   

						private char[] ildcrFieldErrorCode = Field.fillLowValue(3);
	
	/**
	* Constructor for IldcrLnShrGrpRemDtl
	**/
    public IldcrLnShrGrpRemDtl() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for IldcrLnShrGrpRemDtl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IldcrLnShrGrpRemDtl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ildcrFieldErrorCode
	 *	@return ildcrFieldErrorCode
	 */
   public char[] getIldcrFieldErrorCode() throws CFException{
     if (isIldcrFieldErrorCodeModified()) { 
        ildcrFieldErrorCode = refreshIldcrFieldErrorCode();
     }
   		return ildcrFieldErrorCode;
   }

  
	/**
	*  set variable ildcrFieldErrorCode
	*  Corresponding COBOL Variable is ILDCR-FIELD-ERROR-CODE
	*  @param value
	**/
   public void setIldcrFieldErrorCode(char[] value) {
      ildcrFieldErrorCode = checkIldcrFieldErrorCodeConstraints(value);
      serializeIldcrFieldErrorCode(ildcrFieldErrorCode);
   } 

     /**
	 * 	Update IldcrFieldErrorCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIldcrFieldErrorCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIldcrFieldErrorCode,ildcrFieldErrorCode.length);
   	
   }
   
   public void setIldcrFieldErrorCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIldcrFieldErrorCode,ildcrFieldErrorCode.length);
   	
   }
   
     /**
	 * 	Update IldcrFieldErrorCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIldcrFieldErrorCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIldcrFieldErrorCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update IldcrFieldErrorCode with another Field
	 *	@param value
	 */
   public void setIldcrFieldErrorCode(Field source) {
       replace(source,0,source.length(),beginIldcrFieldErrorCode,ILDCR_FIELD_ERROR_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update IldcrFieldErrorCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIldcrFieldErrorCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIldcrFieldErrorCode,ILDCR_FIELD_ERROR_CODE_LEN);
   	
   }
   
     /**
	 * 	Update IldcrFieldErrorCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIldcrFieldErrorCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIldcrFieldErrorCode+targetIndex,targetLen);
    
   }

	
	
	

		public static int getIldcrLnShrGrpRemDtlFieldLength() {
			return ILDCR_LN_SHR_GRP_REM_DTL_LENGTH;
		}

}
  
