package com.cloudframe.app.cfdate02.file.records;

/**
*  The class IldclLnShrBcActvDtl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/


import com.cloudframe.app.cfdate02.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class IldclLnShrBcActvDtl extends IldclLnShrBcActvDtlSerialized { 
   

						private char[] ildclFieldErrorCode = Field.fillLowValue(3);
	
	/**
	* Constructor for IldclLnShrBcActvDtl
	**/
    public IldclLnShrBcActvDtl() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for IldclLnShrBcActvDtl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IldclLnShrBcActvDtl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ildclFieldErrorCode
	 *	@return ildclFieldErrorCode
	 */
   public char[] getIldclFieldErrorCode() throws CFException{
     if (isIldclFieldErrorCodeModified()) { 
        ildclFieldErrorCode = refreshIldclFieldErrorCode();
     }
   		return ildclFieldErrorCode;
   }

  
	/**
	*  set variable ildclFieldErrorCode
	*  Corresponding COBOL Variable is ILDCL-FIELD-ERROR-CODE
	*  @param value
	**/
   public void setIldclFieldErrorCode(char[] value) {
      ildclFieldErrorCode = checkIldclFieldErrorCodeConstraints(value);
      serializeIldclFieldErrorCode(ildclFieldErrorCode);
   } 

     /**
	 * 	Update IldclFieldErrorCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIldclFieldErrorCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIldclFieldErrorCode,ildclFieldErrorCode.length);
   	
   }
   
   public void setIldclFieldErrorCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIldclFieldErrorCode,ildclFieldErrorCode.length);
   	
   }
   
     /**
	 * 	Update IldclFieldErrorCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIldclFieldErrorCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIldclFieldErrorCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update IldclFieldErrorCode with another Field
	 *	@param value
	 */
   public void setIldclFieldErrorCode(Field source) {
       replace(source,0,source.length(),beginIldclFieldErrorCode,ILDCL_FIELD_ERROR_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update IldclFieldErrorCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIldclFieldErrorCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIldclFieldErrorCode,ILDCL_FIELD_ERROR_CODE_LEN);
   	
   }
   
     /**
	 * 	Update IldclFieldErrorCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIldclFieldErrorCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIldclFieldErrorCode+targetIndex,targetLen);
    
   }

	
	
	

		public static int getIldclLnShrBcActvDtlFieldLength() {
			return ILDCL_LN_SHR_BC_ACTV_DTL_LENGTH;
		}

}
  
