package com.cloudframe.app.ar640010.dto;

/**
*  The class FunctionDate800Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FunctionDate800Redefined extends FunctionDate800RedefinedSerialized { 
   

								private int functionYear800;

								private int functionMonth800;

								private int functionDay800;
	
	/**
	* Constructor for FunctionDate800Redefined
	**/
    public FunctionDate800Redefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for FunctionDate800Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FunctionDate800Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of functionYear800
	 *	@return functionYear800
	 */
	public int getFunctionYear800() throws CFException {
       if (isFunctionYear800Modified()) { 
           functionYear800 = refreshFunctionYear800();
        }
   		return functionYear800;
	}
	

	
	   
	/**
	 * 	Update FunctionYear800 with the passed value
	 *  Corresponding COBOL Variable is 800-FUNCTION-YEAR
	 *	@param number
	 */
	public void setFunctionYear800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    functionYear800 = checkFunctionYear800MaxLimit(number); 
		serializeFunctionYear800(functionYear800);
	}
	

	public void setFunctionYear800(long number) {
	    number = checkFunctionYear800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setFunctionYear800((int)number);
	}
	
	/**
	 * 	Update FunctionYear800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setFunctionYear800(char[] value) throws CFException {
		 functionYear800 = serializeFunctionYear800(value);
	}
	/**
	 * 	Update FunctionYear800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFunctionYear800String(char[] value) throws CFException {
		 setFunctionYear800(value);
	}
	/**
	 *	Returns the value of functionMonth800
	 *	@return functionMonth800
	 */
	public int getFunctionMonth800() throws CFException {
       if (isFunctionMonth800Modified()) { 
           functionMonth800 = refreshFunctionMonth800();
        }
   		return functionMonth800;
	}
	

	
	   
	/**
	 * 	Update FunctionMonth800 with the passed value
	 *  Corresponding COBOL Variable is 800-FUNCTION-MONTH
	 *	@param number
	 */
	public void setFunctionMonth800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    functionMonth800 = checkFunctionMonth800MaxLimit(number); 
		serializeFunctionMonth800(functionMonth800);
	}
	

	public void setFunctionMonth800(long number) {
	    number = checkFunctionMonth800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setFunctionMonth800((int)number);
	}
	
	/**
	 * 	Update FunctionMonth800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setFunctionMonth800(char[] value) throws CFException {
		 functionMonth800 = serializeFunctionMonth800(value);
	}
	/**
	 * 	Update FunctionMonth800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFunctionMonth800String(char[] value) throws CFException {
		 setFunctionMonth800(value);
	}
	/**
	 *	Returns the value of functionDay800
	 *	@return functionDay800
	 */
	public int getFunctionDay800() throws CFException {
       if (isFunctionDay800Modified()) { 
           functionDay800 = refreshFunctionDay800();
        }
   		return functionDay800;
	}
	

	
	   
	/**
	 * 	Update FunctionDay800 with the passed value
	 *  Corresponding COBOL Variable is 800-FUNCTION-DAY
	 *	@param number
	 */
	public void setFunctionDay800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    functionDay800 = checkFunctionDay800MaxLimit(number); 
		serializeFunctionDay800(functionDay800);
	}
	

	public void setFunctionDay800(long number) {
	    number = checkFunctionDay800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setFunctionDay800((int)number);
	}
	
	/**
	 * 	Update FunctionDay800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setFunctionDay800(char[] value) throws CFException {
		 functionDay800 = serializeFunctionDay800(value);
	}
	/**
	 * 	Update FunctionDay800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFunctionDay800String(char[] value) throws CFException {
		 setFunctionDay800(value);
	}

	
	
	

		public static int getFunctionDate800RedefinedFieldLength() {
			return FUNCTION_DATE_800_REDEFINED_LENGTH;
		}

}
  
