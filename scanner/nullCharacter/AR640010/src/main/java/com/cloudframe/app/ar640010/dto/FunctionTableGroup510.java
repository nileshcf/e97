package com.cloudframe.app.ar640010.dto;

/**
*  The class FunctionTableGroup510 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FunctionTableGroup510 extends FunctionTableGroup510Serialized {
   

						private char[] functionTable510 = new char[490];
					private FunctionTable510Redefined functionTable510Redefined = new FunctionTable510Redefined();
	
	/**
	* Constructor for FunctionTableGroup510
	**/
    public FunctionTableGroup510() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			functionTable510Redefined.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setFunctionTable510("A=ADD APPLICATION FILE FOR SUBSEQUENT RETRIEVAL  B=BROADCAST FILE TO ALL ELLIGIBLE BULK ENDPOINTS C=COUNT INBOUND FILES FOR SPECIFIED BULK ID/TYPE I=INSTALL POST-APPLICATION EXIT FILE & ENDPOINTS L=BROADCAST FILE TO ELIGIBLE \"LISTED\" ENDPOINTS  R=RETRIEVE FILE FOR APPLICATION PROCESSING       F=FIFO RETRIEVE FILE FOR APPLICATION PROCESSING  S=SEND APPLICATION FILE TO SPECIFIC ENDPOINT     X=RESET APPLICATION FILE STATUS CODE             ?=FUNCTION REQUEST CODE UNKNOWN TO GFT API MNGR  ".toCharArray());
    }


 

	/**
	 *	Returns the value of functionTable510
	 *	@return functionTable510
	 */
   public char[] getFunctionTable510() throws CFException{
     if (isFunctionTable510Modified()) { 
        functionTable510 = refreshFunctionTable510();
     }
   		return functionTable510;
   }

  
	/**
	*  set variable functionTable510
	*  Corresponding COBOL Variable is 510-FUNCTION-TABLE
	*  @param value
	**/
   public void setFunctionTable510(char[] value) {
      functionTable510 = checkFunctionTable510Constraints(value);
      serializeFunctionTable510(functionTable510);
   } 

     /**
	 * 	Update FunctionTable510 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFunctionTable510(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFunctionTable510,functionTable510.length);
   	
   }
   
   public void setFunctionTable510(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFunctionTable510,functionTable510.length);
   	
   }
   
     /**
	 * 	Update FunctionTable510 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFunctionTable510(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFunctionTable510+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FunctionTable510 with another Field
	 *	@param value
	 */
   public void setFunctionTable510(Field source) {
       replace(source,0,source.length(),beginFunctionTable510,FUNCTION_TABLE_510_LEN);
   	
   }  
   
     /**
	 * 	Update FunctionTable510 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFunctionTable510(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFunctionTable510,FUNCTION_TABLE_510_LEN);
   	
   }
   
     /**
	 * 	Update FunctionTable510 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFunctionTable510(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFunctionTable510+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of functionTable510Redefined
	 *	@return functionTable510Redefined
	 */   
	 public FunctionTable510Redefined getFunctionTable510Redefined() {
   	return functionTable510Redefined;
   }
   /**
	* 	Update FunctionTable510Redefined with the passed value
	*   Corresponding COBOL Variable is 510-FUNCTION-TABLE-REDEFINED
	*	@param value
	*/
   public void setFunctionTable510Redefined(char[] value) {
      functionTable510Redefined.setString(value); 
   }   
    
     /**
	 * 	Update FunctionTable510Redefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setFunctionTable510Redefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,functionTable510Redefined.begin,functionTable510Redefined.length());
   }
   
     /**
	 * 	Update FunctionTable510Redefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFunctionTable510Redefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,functionTable510Redefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update FunctionTable510Redefined with another Field
	 *	@param value
	 */
   public void setFunctionTable510Redefined(Field source) {
   	replace(source,0,source.length(),functionTable510Redefined.begin,functionTable510Redefined.length());
   }  
   
     /**
	 * 	Update FunctionTable510Redefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setFunctionTable510Redefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,functionTable510Redefined.begin,functionTable510Redefined.length());
   }
   
     /**
	 * 	Update FunctionTable510Redefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFunctionTable510Redefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,functionTable510Redefined.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getFunctionTableGroup510FieldLength() {
			return FUNCTION_TABLE_GROUP_510_LENGTH;
		}

}
  
