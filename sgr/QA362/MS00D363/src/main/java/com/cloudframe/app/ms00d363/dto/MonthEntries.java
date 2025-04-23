package com.cloudframe.app.ms00d363.dto;

/**
*  The class MonthEntries is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MonthEntries extends MonthEntriesSerialized { 
   

								private int monthNoDays;
	
	/**
	* Constructor for MonthEntries
	**/
    public MonthEntries() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MonthEntries. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MonthEntries(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of monthNoDays
	 *	@return monthNoDays
	 */
	public int getMonthNoDays() throws CFException {
       if (isMonthNoDaysModified()) { 
           monthNoDays = refreshMonthNoDays();
        }
   		return monthNoDays;
	}
	

	
	   
	/**
	 * 	Update MonthNoDays with the passed value
	 *  Corresponding COBOL Variable is MONTH-NO-DAYS
	 *	@param number
	 */
	public void setMonthNoDays(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    monthNoDays = checkMonthNoDaysMaxLimit(number); 
		serializeMonthNoDays(monthNoDays);
	}
	

	public void setMonthNoDays(long number) {
	    number = checkMonthNoDaysMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMonthNoDays((int)number);
	}
	
	/**
	 * 	Update MonthNoDays with the passed value
	 *	@param value (String or char[])
	 */
	public void setMonthNoDays(char[] value) throws CFException {
		 monthNoDays = serializeMonthNoDays(value);
	}
	/**
	 * 	Update MonthNoDays with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMonthNoDaysString(char[] value) throws CFException {
		 setMonthNoDays(value);
	}

	
	
	

		public static int getMonthEntriesFieldLength() {
			return MONTH_ENTRIES_LENGTH;
		}

}
  
