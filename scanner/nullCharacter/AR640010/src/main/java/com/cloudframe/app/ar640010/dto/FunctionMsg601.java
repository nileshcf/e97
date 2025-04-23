package com.cloudframe.app.ar640010.dto;

/**
*  The class FunctionMsg601 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FunctionMsg601 extends FunctionMsg601Serialized {
   


						private char[] functionRequest601 = new char[1];


						private char[] functionDesc601 = new char[47];
	
	/**
	* Constructor for FunctionMsg601
	**/
    public FunctionMsg601() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("0011-FUNCTION ID: ").toCharArray()
             , getStartOffset() + 0
             ,18
             );
								setFunctionRequest601(fillSpace(1));
       replaceValue( // serialize and save the value
             (" - ").toCharArray()
             , getStartOffset() + 19
             ,3
             );
								setFunctionDesc601(fillSpace(47));
    }


 

	/**
	 *	Returns the value of functionRequest601
	 *	@return functionRequest601
	 */
   public char[] getFunctionRequest601() throws CFException{
     if (isFunctionRequest601Modified()) { 
        functionRequest601 = refreshFunctionRequest601();
     }
   		return functionRequest601;
   }

  
	/**
	*  set variable functionRequest601
	*  Corresponding COBOL Variable is 601-FUNCTION-REQUEST
	*  @param value
	**/
   public void setFunctionRequest601(char[] value) {
      functionRequest601 = checkFunctionRequest601Constraints(value);
      serializeFunctionRequest601(functionRequest601);
   } 

     /**
	 * 	Update FunctionRequest601 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFunctionRequest601(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFunctionRequest601,functionRequest601.length);
   	
   }
   
   public void setFunctionRequest601(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFunctionRequest601,functionRequest601.length);
   	
   }
   
     /**
	 * 	Update FunctionRequest601 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFunctionRequest601(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFunctionRequest601+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FunctionRequest601 with another Field
	 *	@param value
	 */
   public void setFunctionRequest601(Field source) {
       replace(source,0,source.length(),beginFunctionRequest601,FUNCTION_REQUEST_601_LEN);
   	
   }  
   
     /**
	 * 	Update FunctionRequest601 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFunctionRequest601(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFunctionRequest601,FUNCTION_REQUEST_601_LEN);
   	
   }
   
     /**
	 * 	Update FunctionRequest601 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFunctionRequest601(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFunctionRequest601+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of functionDesc601
	 *	@return functionDesc601
	 */
   public char[] getFunctionDesc601() throws CFException{
     if (isFunctionDesc601Modified()) { 
        functionDesc601 = refreshFunctionDesc601();
     }
   		return functionDesc601;
   }

  
	/**
	*  set variable functionDesc601
	*  Corresponding COBOL Variable is 601-FUNCTION-DESC
	*  @param value
	**/
   public void setFunctionDesc601(char[] value) {
      functionDesc601 = checkFunctionDesc601Constraints(value);
      serializeFunctionDesc601(functionDesc601);
   } 

     /**
	 * 	Update FunctionDesc601 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFunctionDesc601(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFunctionDesc601,functionDesc601.length);
   	
   }
   
   public void setFunctionDesc601(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFunctionDesc601,functionDesc601.length);
   	
   }
   
     /**
	 * 	Update FunctionDesc601 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFunctionDesc601(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFunctionDesc601+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FunctionDesc601 with another Field
	 *	@param value
	 */
   public void setFunctionDesc601(Field source) {
       replace(source,0,source.length(),beginFunctionDesc601,FUNCTION_DESC_601_LEN);
   	
   }  
   
     /**
	 * 	Update FunctionDesc601 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFunctionDesc601(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFunctionDesc601,FUNCTION_DESC_601_LEN);
   	
   }
   
     /**
	 * 	Update FunctionDesc601 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFunctionDesc601(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFunctionDesc601+targetIndex,targetLen);
    
   }

	
	
	

		public static int getFunctionMsg601FieldLength() {
			return FUNCTION_MSG_601_LENGTH;
		}

}
  
