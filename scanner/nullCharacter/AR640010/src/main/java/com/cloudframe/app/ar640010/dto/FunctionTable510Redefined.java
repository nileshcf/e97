package com.cloudframe.app.ar640010.dto;

/**
*  The class FunctionTable510Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;


public class FunctionTable510Redefined extends FunctionTable510RedefinedSerialized { 
   
			private List<FunctionEntry510> functionEntry510 = new ArrayList<>();
    	
	
	/**
	* Constructor for FunctionTable510Redefined
	**/
    public FunctionTable510Redefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for FunctionTable510Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FunctionTable510Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the  value of functionEntry510
	 *  Corresponding COBOL Variable is 510-FUNCTION-ENTRY
	 *	@return functionEntry510
	 */
   public List<FunctionEntry510> getFunctionEntry510() {
       return functionEntry510;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return functionEntry510
	 */
	public FunctionEntry510 getFunctionEntry510(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getFunctionEntry510(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= FUNCTION_ENTRY_510_SIZE) {
             	index = FUNCTION_ENTRY_510_SIZE -1; // can't exceed max array size
             	logger.trace("functionEntry510 - Array index exceeded max Size {}, resetting it to max allowed",FUNCTION_ENTRY_510_SIZE); 
	    }
		if (index >= functionEntry510.size()) {
       		for (int fillIndex =  functionEntry510.size() -1; fillIndex < index;fillIndex++) {
		       functionEntry510.add(null);
		    }
			functionEntry510.set(index,
			   	   	new FunctionEntry510(this,beginFunctionEntry510 + index * FunctionEntry510.getFunctionEntry510FieldLength()) 
				                        ); 	
		} 
   	   FunctionEntry510 value = functionEntry510.get(index);
   	   if (value == null) {
   	      functionEntry510.set(index,
			   	   	new FunctionEntry510(this,beginFunctionEntry510 + index * FunctionEntry510.getFunctionEntry510FieldLength()) 
				                        ); 
		  value = functionEntry510.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update FunctionEntry510 at index with the passed value
	 *  Corresponding COBOL Variable is 510-FUNCTION-ENTRY
	 *  @param index
	 *	@param value
	 */
  public void setFunctionEntry510(int index,char[] value) {
   	getFunctionEntry510(index).setString(value);
   }
   
	

	
	
	

		public static int getFunctionTable510RedefinedFieldLength() {
			return FUNCTION_TABLE_510_REDEFINED_LENGTH;
		}

}
  
