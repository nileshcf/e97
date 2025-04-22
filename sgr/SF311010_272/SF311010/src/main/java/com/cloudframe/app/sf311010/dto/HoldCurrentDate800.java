package com.cloudframe.app.sf311010.dto;

/**
*  The class HoldCurrentDate800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:14. using version 5.0.0.254
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class HoldCurrentDate800 extends HoldCurrentDate800Serialized {
   

								private int holdCurrYy800;

								private int holdCurrMm800;

								private int holdCurrDd800;
	
	/**
	* Constructor for HoldCurrentDate800
	**/
    public HoldCurrentDate800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setHoldCurrYy800(0);
								setHoldCurrMm800(0);
								setHoldCurrDd800(0);
    }


 

	/**
	 *	Returns the value of holdCurrYy800
	 *	@return holdCurrYy800
	 */
	public int getHoldCurrYy800() throws CFException {
       if (isHoldCurrYy800Modified()) { 
           holdCurrYy800 = refreshHoldCurrYy800();
        }
   		return holdCurrYy800;
	}
	

	
	   
	/**
	 * 	Update HoldCurrYy800 with the passed value
	 *  Corresponding COBOL Variable is 800-HOLD-CURR-YY
	 *	@param number
	 */
	public void setHoldCurrYy800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    holdCurrYy800 = checkHoldCurrYy800MaxLimit(number); 
		serializeHoldCurrYy800(holdCurrYy800);
	}
	

	public void setHoldCurrYy800(long number) {
	    number = checkHoldCurrYy800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setHoldCurrYy800((int)number);
	}
	
	/**
	 * 	Update HoldCurrYy800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setHoldCurrYy800(char[] value) throws CFException {
		 holdCurrYy800 = serializeHoldCurrYy800(value);
	}
	/**
	 * 	Update HoldCurrYy800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setHoldCurrYy800String(char[] value) throws CFException {
		 setHoldCurrYy800(value);
	}
	/**
	 *	Returns the value of holdCurrMm800
	 *	@return holdCurrMm800
	 */
	public int getHoldCurrMm800() throws CFException {
       if (isHoldCurrMm800Modified()) { 
           holdCurrMm800 = refreshHoldCurrMm800();
        }
   		return holdCurrMm800;
	}
	

	
	   
	/**
	 * 	Update HoldCurrMm800 with the passed value
	 *  Corresponding COBOL Variable is 800-HOLD-CURR-MM
	 *	@param number
	 */
	public void setHoldCurrMm800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    holdCurrMm800 = checkHoldCurrMm800MaxLimit(number); 
		serializeHoldCurrMm800(holdCurrMm800);
	}
	

	public void setHoldCurrMm800(long number) {
	    number = checkHoldCurrMm800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setHoldCurrMm800((int)number);
	}
	
	/**
	 * 	Update HoldCurrMm800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setHoldCurrMm800(char[] value) throws CFException {
		 holdCurrMm800 = serializeHoldCurrMm800(value);
	}
	/**
	 * 	Update HoldCurrMm800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setHoldCurrMm800String(char[] value) throws CFException {
		 setHoldCurrMm800(value);
	}
	/**
	 *	Returns the value of holdCurrDd800
	 *	@return holdCurrDd800
	 */
	public int getHoldCurrDd800() throws CFException {
       if (isHoldCurrDd800Modified()) { 
           holdCurrDd800 = refreshHoldCurrDd800();
        }
   		return holdCurrDd800;
	}
	

	
	   
	/**
	 * 	Update HoldCurrDd800 with the passed value
	 *  Corresponding COBOL Variable is 800-HOLD-CURR-DD
	 *	@param number
	 */
	public void setHoldCurrDd800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    holdCurrDd800 = checkHoldCurrDd800MaxLimit(number); 
		serializeHoldCurrDd800(holdCurrDd800);
	}
	

	public void setHoldCurrDd800(long number) {
	    number = checkHoldCurrDd800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setHoldCurrDd800((int)number);
	}
	
	/**
	 * 	Update HoldCurrDd800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setHoldCurrDd800(char[] value) throws CFException {
		 holdCurrDd800 = serializeHoldCurrDd800(value);
	}
	/**
	 * 	Update HoldCurrDd800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setHoldCurrDd800String(char[] value) throws CFException {
		 setHoldCurrDd800(value);
	}

	
	
	

		public static int getHoldCurrentDate800FieldLength() {
			return HOLD_CURRENT_DATE_800_LENGTH;
		}

}
  
