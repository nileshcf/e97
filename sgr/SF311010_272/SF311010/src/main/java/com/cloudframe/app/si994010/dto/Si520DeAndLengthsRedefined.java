package com.cloudframe.app.si994010.dto;

/**
*  The class Si520DeAndLengthsRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:05. using version 5.0.0.256
**/


import com.cloudframe.app.si994010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;


public class Si520DeAndLengthsRedefined extends Si520DeAndLengthsRedefinedSerialized { 
   
			private List<Si520DeAndLengthsGroupArray1> si520DeAndLengthsGroupArray1 = new ArrayList<>();
    	
	
	/**
	* Constructor for Si520DeAndLengthsRedefined
	**/
    public Si520DeAndLengthsRedefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Si520DeAndLengthsRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Si520DeAndLengthsRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the  value of si520DeAndLengthsGroupArray1
	 *  Corresponding COBOL Variable is FILLER
	 *	@return si520DeAndLengthsGroupArray1
	 */
   public List<Si520DeAndLengthsGroupArray1> getSi520DeAndLengthsGroupArray1() {
       return si520DeAndLengthsGroupArray1;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return si520DeAndLengthsGroupArray1
	 */
	public Si520DeAndLengthsGroupArray1 getSi520DeAndLengthsGroupArray1(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getSi520DeAndLengthsGroupArray1(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= SI_520_DE_AND_LENGTHS_GROUP_ARRAY_1_SIZE) {
             	index = SI_520_DE_AND_LENGTHS_GROUP_ARRAY_1_SIZE -1; // can't exceed max array size
             	logger.trace("si520DeAndLengthsGroupArray1 - Array index exceeded max Size {}, resetting it to max allowed",SI_520_DE_AND_LENGTHS_GROUP_ARRAY_1_SIZE); 
	    }
		if (index >= si520DeAndLengthsGroupArray1.size()) {
       		for (int fillIndex =  si520DeAndLengthsGroupArray1.size() -1; fillIndex < index;fillIndex++) {
		       si520DeAndLengthsGroupArray1.add(null);
		    }
			si520DeAndLengthsGroupArray1.set(index,
			   	   	new Si520DeAndLengthsGroupArray1(this,beginSi520DeAndLengthsGroupArray1 + index * Si520DeAndLengthsGroupArray1.getSi520DeAndLengthsGroupArray1FieldLength()) 
				                        ); 	
		} 
   	   Si520DeAndLengthsGroupArray1 value = si520DeAndLengthsGroupArray1.get(index);
   	   if (value == null) {
   	      si520DeAndLengthsGroupArray1.set(index,
			   	   	new Si520DeAndLengthsGroupArray1(this,beginSi520DeAndLengthsGroupArray1 + index * Si520DeAndLengthsGroupArray1.getSi520DeAndLengthsGroupArray1FieldLength()) 
				                        ); 
		  value = si520DeAndLengthsGroupArray1.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Si520DeAndLengthsGroupArray1 at index with the passed value
	 *  Corresponding COBOL Variable is FILLER
	 *  @param index
	 *	@param value
	 */
  public void setSi520DeAndLengthsGroupArray1(int index,char[] value) {
   	getSi520DeAndLengthsGroupArray1(index).setString(value);
   }
   
	

	
	
	

		public static int getSi520DeAndLengthsRedefinedFieldLength() {
			return SI_520_DE_AND_LENGTHS_REDEFINED_LENGTH;
		}

}
  
