package com.cloudframe.app.vsammon1.dto;

/**
*  The class MethodData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:18. using version 5.0.0.257
**/


import com.cloudframe.app.vsammon1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MethodData extends MethodDataSerialized { 
   

						private char[] iMethod = Field.fillLowValue(35);
	
	/**
	* Constructor for MethodData
	**/
    public MethodData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MethodData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MethodData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of iMethod
	 *	@return iMethod
	 */
   public char[] getIMethod() throws CFException{
     if (isIMethodModified()) { 
        iMethod = refreshIMethod();
     }
   		return iMethod;
   }

  
	/**
	*  set variable iMethod
	*  Corresponding COBOL Variable is WS-I-METHOD
	*  @param value
	**/
   public void setIMethod(char[] value) {
      iMethod = checkIMethodConstraints(value);
      serializeIMethod(iMethod);
   } 

     /**
	 * 	Update IMethod 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIMethod(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIMethod,iMethod.length);
   	
   }
   
   public void setIMethod(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIMethod,iMethod.length);
   	
   }
   
     /**
	 * 	Update IMethod 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIMethod(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIMethod+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update IMethod with another Field
	 *	@param value
	 */
   public void setIMethod(Field source) {
       replace(source,0,source.length(),beginIMethod,I_METHOD_LEN);
   	
   }  
   
     /**
	 * 	Update IMethod 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIMethod(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIMethod,I_METHOD_LEN);
   	
   }
   
     /**
	 * 	Update IMethod 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIMethod(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIMethod+targetIndex,targetLen);
    
   }

	
	
	

		public static int getMethodDataFieldLength() {
			return METHOD_DATA_LENGTH;
		}

}
  
