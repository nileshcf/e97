package com.cloudframe.app.ar640010.dto;

/**
*  The class FunctionEntry510 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FunctionEntry510 extends FunctionEntry510Serialized { 
   

						private char[] functionCode510 = Field.fillLowValue(1);

						private char[] functionDesc510 = Field.fillLowValue(47);
	
	/**
	* Constructor for FunctionEntry510
	**/
    public FunctionEntry510() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for FunctionEntry510. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FunctionEntry510(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of functionCode510
	 *	@return functionCode510
	 */
   public char[] getFunctionCode510() throws CFException{
     if (isFunctionCode510Modified()) { 
        functionCode510 = refreshFunctionCode510();
     }
   		return functionCode510;
   }

  
	/**
	*  set variable functionCode510
	*  Corresponding COBOL Variable is 510-FUNCTION-CODE
	*  @param value
	**/
   public void setFunctionCode510(char[] value) {
      functionCode510 = checkFunctionCode510Constraints(value);
      serializeFunctionCode510(functionCode510);
   } 

     /**
	 * 	Update FunctionCode510 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFunctionCode510(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFunctionCode510,functionCode510.length);
   	
   }
   
   public void setFunctionCode510(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFunctionCode510,functionCode510.length);
   	
   }
   
     /**
	 * 	Update FunctionCode510 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFunctionCode510(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFunctionCode510+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FunctionCode510 with another Field
	 *	@param value
	 */
   public void setFunctionCode510(Field source) {
       replace(source,0,source.length(),beginFunctionCode510,FUNCTION_CODE_510_LEN);
   	
   }  
   
     /**
	 * 	Update FunctionCode510 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFunctionCode510(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFunctionCode510,FUNCTION_CODE_510_LEN);
   	
   }
   
     /**
	 * 	Update FunctionCode510 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFunctionCode510(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFunctionCode510+targetIndex,targetLen);
    
   }
	char[] functionEot8851088Value = "?".toCharArray();
	/**
	 *	Test condition "?" for isFunctionEot88510()
	 *	@return  Returns true if isFunctionEot88510() is "?"
	 */
   public boolean isFunctionEot88510() throws CFException {
      return (  compareChars( getFunctionCode510() , functionEot8851088Value)  == 0  );
   }


	/**
	*  set values "?"
	*/
   	public void setFunctionEot88510True() {  			
    	setFunctionCode510( functionEot8851088Value);
   	}
	/**
	 *	Returns the value of functionDesc510
	 *	@return functionDesc510
	 */
   public char[] getFunctionDesc510() throws CFException{
     if (isFunctionDesc510Modified()) { 
        functionDesc510 = refreshFunctionDesc510();
     }
   		return functionDesc510;
   }

  
	/**
	*  set variable functionDesc510
	*  Corresponding COBOL Variable is 510-FUNCTION-DESC
	*  @param value
	**/
   public void setFunctionDesc510(char[] value) {
      functionDesc510 = checkFunctionDesc510Constraints(value);
      serializeFunctionDesc510(functionDesc510);
   } 

     /**
	 * 	Update FunctionDesc510 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFunctionDesc510(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFunctionDesc510,functionDesc510.length);
   	
   }
   
   public void setFunctionDesc510(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFunctionDesc510,functionDesc510.length);
   	
   }
   
     /**
	 * 	Update FunctionDesc510 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFunctionDesc510(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFunctionDesc510+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FunctionDesc510 with another Field
	 *	@param value
	 */
   public void setFunctionDesc510(Field source) {
       replace(source,0,source.length(),beginFunctionDesc510,FUNCTION_DESC_510_LEN);
   	
   }  
   
     /**
	 * 	Update FunctionDesc510 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFunctionDesc510(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFunctionDesc510,FUNCTION_DESC_510_LEN);
   	
   }
   
     /**
	 * 	Update FunctionDesc510 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFunctionDesc510(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFunctionDesc510+targetIndex,targetLen);
    
   }

	
	
	

		public static int getFunctionEntry510FieldLength() {
			return FUNCTION_ENTRY_510_LENGTH;
		}

}
  
