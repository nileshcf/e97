package com.cloudframe.app.ar640010.dto;

/**
*  The class WarningTable580Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;


public class WarningTable580Redefined extends WarningTable580RedefinedSerialized { 
   
			private List<WarningTableGroup580Array1> warningTableGroup580Array1 = new ArrayList<>();
    	
	
	/**
	* Constructor for WarningTable580Redefined
	**/
    public WarningTable580Redefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WarningTable580Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WarningTable580Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the  value of warningTableGroup580Array1
	 *  Corresponding COBOL Variable is FILLER
	 *	@return warningTableGroup580Array1
	 */
   public List<WarningTableGroup580Array1> getWarningTableGroup580Array1() {
       return warningTableGroup580Array1;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return warningTableGroup580Array1
	 */
	public WarningTableGroup580Array1 getWarningTableGroup580Array1(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getWarningTableGroup580Array1(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= WARNING_TABLE_GROUP_580_ARRAY_1_SIZE) {
             	index = WARNING_TABLE_GROUP_580_ARRAY_1_SIZE -1; // can't exceed max array size
             	logger.trace("warningTableGroup580Array1 - Array index exceeded max Size {}, resetting it to max allowed",WARNING_TABLE_GROUP_580_ARRAY_1_SIZE); 
	    }
		if (index >= warningTableGroup580Array1.size()) {
       		for (int fillIndex =  warningTableGroup580Array1.size() -1; fillIndex < index;fillIndex++) {
		       warningTableGroup580Array1.add(null);
		    }
			warningTableGroup580Array1.set(index,
			   	   	new WarningTableGroup580Array1(this,beginWarningTableGroup580Array1 + index * WarningTableGroup580Array1.getWarningTableGroup580Array1FieldLength()) 
				                        ); 	
		} 
   	   WarningTableGroup580Array1 value = warningTableGroup580Array1.get(index);
   	   if (value == null) {
   	      warningTableGroup580Array1.set(index,
			   	   	new WarningTableGroup580Array1(this,beginWarningTableGroup580Array1 + index * WarningTableGroup580Array1.getWarningTableGroup580Array1FieldLength()) 
				                        ); 
		  value = warningTableGroup580Array1.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update WarningTableGroup580Array1 at index with the passed value
	 *  Corresponding COBOL Variable is FILLER
	 *  @param index
	 *	@param value
	 */
  public void setWarningTableGroup580Array1(int index,char[] value) {
   	getWarningTableGroup580Array1(index).setString(value);
   }
   
	

	
	
	

		public static int getWarningTable580RedefinedFieldLength() {
			return WARNING_TABLE_580_REDEFINED_LENGTH;
		}

}
  
