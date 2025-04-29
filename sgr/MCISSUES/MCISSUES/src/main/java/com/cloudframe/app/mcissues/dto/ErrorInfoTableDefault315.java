package com.cloudframe.app.mcissues.dto;

/**
*  The class ErrorInfoTableDefault315 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:36. using version 5.0.0.254
**/


import com.cloudframe.app.mcissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;


public class ErrorInfoTableDefault315 extends ErrorInfoTableDefault315Serialized {
   
			private List<ErrorInfoTableEntries315> errorInfoTableEntries315 = new ArrayList<>();
    	
	
	/**
	* Constructor for ErrorInfoTableDefault315
	**/
    public ErrorInfoTableDefault315() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < ERROR_INFO_TABLE_ENTRIES_315_SIZE;arrayIndex++) {
						errorInfoTableEntries315.add(new ErrorInfoTableEntries315(this, beginErrorInfoTableEntries315 + 
						arrayIndex * ErrorInfoTableEntries315.getErrorInfoTableEntries315FieldLength()));
				}
	   	/*  end of offset */
			for (int arrayIndex = 0; arrayIndex < ERROR_INFO_TABLE_ENTRIES_315_SIZE;arrayIndex++) {
					errorInfoTableEntries315.add(new ErrorInfoTableEntries315(this, beginErrorInfoTableEntries315 + 
						arrayIndex * ErrorInfoTableEntries315.getErrorInfoTableEntries315FieldLength()));
			}
    }


 

	/**
	 *	Returns the  value of errorInfoTableEntries315
	 *  Corresponding COBOL Variable is 315-ERROR-INFO-TABLE-ENTRIES
	 *	@return errorInfoTableEntries315
	 */
   public List<ErrorInfoTableEntries315> getErrorInfoTableEntries315() {
       return errorInfoTableEntries315;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return errorInfoTableEntries315
	 */
	public ErrorInfoTableEntries315 getErrorInfoTableEntries315(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getErrorInfoTableEntries315(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= ERROR_INFO_TABLE_ENTRIES_315_SIZE) {
             	index = ERROR_INFO_TABLE_ENTRIES_315_SIZE -1; // can't exceed max array size
             	logger.trace("errorInfoTableEntries315 - Array index exceeded max Size {}, resetting it to max allowed",ERROR_INFO_TABLE_ENTRIES_315_SIZE); 
	    }
		if (index >= errorInfoTableEntries315.size()) {
       		for (int fillIndex =  errorInfoTableEntries315.size() -1; fillIndex < index;fillIndex++) {
		       errorInfoTableEntries315.add(null);
		    }
			errorInfoTableEntries315.set(index,
			   	   	new ErrorInfoTableEntries315(this,beginErrorInfoTableEntries315 + index * ErrorInfoTableEntries315.getErrorInfoTableEntries315FieldLength()) 
				                        ); 	
		} 
   	   ErrorInfoTableEntries315 value = errorInfoTableEntries315.get(index);
   	   if (value == null) {
   	      errorInfoTableEntries315.set(index,
			   	   	new ErrorInfoTableEntries315(this,beginErrorInfoTableEntries315 + index * ErrorInfoTableEntries315.getErrorInfoTableEntries315FieldLength()) 
				                        ); 
		  value = errorInfoTableEntries315.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update ErrorInfoTableEntries315 at index with the passed value
	 *  Corresponding COBOL Variable is 315-ERROR-INFO-TABLE-ENTRIES
	 *  @param index
	 *	@param value
	 */
  public void setErrorInfoTableEntries315(int index,char[] value) {
   	getErrorInfoTableEntries315(index).setString(value);
   }
   
	

	
	
	

		public static int getErrorInfoTableDefault315FieldLength() {
			return ERROR_INFO_TABLE_DEFAULT_315_LENGTH;
		}

}
  
