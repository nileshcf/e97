package com.cloudframe.app.init1.dto;

/**
*  The class RlhzaFiller02 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:52. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RlhzaFiller02 extends RlhzaFiller02Serialized { 
   

								private int rlhzaRcBlAsOfDay;
	
	/**
	* Constructor for RlhzaFiller02
	**/
    public RlhzaFiller02() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for RlhzaFiller02. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RlhzaFiller02(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of rlhzaRcBlAsOfDay
	 *	@return rlhzaRcBlAsOfDay
	 */
	public int getRlhzaRcBlAsOfDay() throws CFException {
       if (isRlhzaRcBlAsOfDayModified()) { 
           rlhzaRcBlAsOfDay = refreshRlhzaRcBlAsOfDay();
        }
   		return rlhzaRcBlAsOfDay;
	}
	

	
	   
	/**
	 * 	Update RlhzaRcBlAsOfDay with the passed value
	 *  Corresponding COBOL Variable is RLHZA-RC-BL-AS-OF-DAY
	 *	@param number
	 */
	public void setRlhzaRcBlAsOfDay(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    rlhzaRcBlAsOfDay = checkRlhzaRcBlAsOfDayMaxLimit(number); 
		serializeRlhzaRcBlAsOfDay(rlhzaRcBlAsOfDay);
	}
	

	public void setRlhzaRcBlAsOfDay(long number) {
	    number = checkRlhzaRcBlAsOfDayMaxLimit(number); // Truncate if value is beyond +/- Max range
		setRlhzaRcBlAsOfDay((int)number);
	}
	
	/**
	 * 	Update RlhzaRcBlAsOfDay with the passed value
	 *	@param value (String or char[])
	 */
	public void setRlhzaRcBlAsOfDay(char[] value) throws CFException {
		 rlhzaRcBlAsOfDay = serializeRlhzaRcBlAsOfDay(value);
	}
	/**
	 * 	Update RlhzaRcBlAsOfDay with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRlhzaRcBlAsOfDayString(char[] value) throws CFException {
		 setRlhzaRcBlAsOfDay(value);
	}

	
	
	

		public static int getRlhzaFiller02FieldLength() {
			return RLHZA_FILLER_02_LENGTH;
		}

}
  
