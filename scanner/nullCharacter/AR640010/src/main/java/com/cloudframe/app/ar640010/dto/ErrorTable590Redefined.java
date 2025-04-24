package com.cloudframe.app.ar640010.dto;

/**
*  The class ErrorTable590Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:49. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;


public class ErrorTable590Redefined extends ErrorTable590RedefinedSerialized { 
   
			private List<ErrorTableGroup590Array1> errorTableGroup590Array1 = new ArrayList<>();
    	
	
	/**
	* Constructor for ErrorTable590Redefined
	**/
    public ErrorTable590Redefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ErrorTable590Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ErrorTable590Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the  value of errorTableGroup590Array1
	 *  Corresponding COBOL Variable is FILLER
	 *	@return errorTableGroup590Array1
	 */
   public List<ErrorTableGroup590Array1> getErrorTableGroup590Array1() {
       return errorTableGroup590Array1;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return errorTableGroup590Array1
	 */
	public ErrorTableGroup590Array1 getErrorTableGroup590Array1(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getErrorTableGroup590Array1(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= ERROR_TABLE_GROUP_590_ARRAY_1_SIZE) {
             	index = ERROR_TABLE_GROUP_590_ARRAY_1_SIZE -1; // can't exceed max array size
             	logger.trace("errorTableGroup590Array1 - Array index exceeded max Size {}, resetting it to max allowed",ERROR_TABLE_GROUP_590_ARRAY_1_SIZE); 
	    }
		if (index >= errorTableGroup590Array1.size()) {
       		for (int fillIndex =  errorTableGroup590Array1.size() -1; fillIndex < index;fillIndex++) {
		       errorTableGroup590Array1.add(null);
		    }
			errorTableGroup590Array1.set(index,
			   	   	new ErrorTableGroup590Array1(this,beginErrorTableGroup590Array1 + index * ErrorTableGroup590Array1.getErrorTableGroup590Array1FieldLength()) 
				                        ); 	
		} 
   	   ErrorTableGroup590Array1 value = errorTableGroup590Array1.get(index);
   	   if (value == null) {
   	      errorTableGroup590Array1.set(index,
			   	   	new ErrorTableGroup590Array1(this,beginErrorTableGroup590Array1 + index * ErrorTableGroup590Array1.getErrorTableGroup590Array1FieldLength()) 
				                        ); 
		  value = errorTableGroup590Array1.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update ErrorTableGroup590Array1 at index with the passed value
	 *  Corresponding COBOL Variable is FILLER
	 *  @param index
	 *	@param value
	 */
  public void setErrorTableGroup590Array1(int index,char[] value) {
   	getErrorTableGroup590Array1(index).setString(value);
   }
   
	

	
	
	

		public static int getErrorTable590RedefinedFieldLength() {
			return ERROR_TABLE_590_REDEFINED_LENGTH;
		}

}
  
