package com.cloudframe.app.ms00d363.dto;

/**
*  The class MonthTableRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:12. using version 5.0.0.256
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;


public class MonthTableRedefined extends MonthTableRedefinedSerialized { 
   
			private List<MonthEntries> monthEntries = new ArrayList<>();
    	
	
	/**
	* Constructor for MonthTableRedefined
	**/
    public MonthTableRedefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MonthTableRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MonthTableRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the  value of monthEntries
	 *  Corresponding COBOL Variable is MONTH-ENTRIES
	 *	@return monthEntries
	 */
   public List<MonthEntries> getMonthEntries() {
       return monthEntries;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return monthEntries
	 */
	public MonthEntries getMonthEntries(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getMonthEntries(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= MONTH_ENTRIES_SIZE) {
             	index = MONTH_ENTRIES_SIZE -1; // can't exceed max array size
             	logger.trace("monthEntries - Array index exceeded max Size {}, resetting it to max allowed",MONTH_ENTRIES_SIZE); 
	    }
		if (index >= monthEntries.size()) {
       		for (int fillIndex =  monthEntries.size() -1; fillIndex < index;fillIndex++) {
		       monthEntries.add(null);
		    }
			monthEntries.set(index,
			   	   	new MonthEntries(this,beginMonthEntries + index * MonthEntries.getMonthEntriesFieldLength()) 
				                        ); 	
		} 
   	   MonthEntries value = monthEntries.get(index);
   	   if (value == null) {
   	      monthEntries.set(index,
			   	   	new MonthEntries(this,beginMonthEntries + index * MonthEntries.getMonthEntriesFieldLength()) 
				                        ); 
		  value = monthEntries.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update MonthEntries at index with the passed value
	 *  Corresponding COBOL Variable is MONTH-ENTRIES
	 *  @param index
	 *	@param value
	 */
  public void setMonthEntries(int index,char[] value) {
   	getMonthEntries(index).setString(value);
   }
   
	

	
	
	

		public static int getMonthTableRedefinedFieldLength() {
			return MONTH_TABLE_REDEFINED_LENGTH;
		}

}
  
