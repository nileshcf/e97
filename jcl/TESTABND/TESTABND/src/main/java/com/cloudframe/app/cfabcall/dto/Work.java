package com.cloudframe.app.cfabcall.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:33. using version 5.0.0.254
**/


import com.cloudframe.app.cfabcall.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized {
   

								private long abendCodeCee;

								private int timing;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of abendCodeCee
	 *	@return abendCodeCee
	 */
	public long getAbendCodeCee() throws CFException {
   		return abendCodeCee;
	}
	
	/**
	 * 	Update AbendCodeCee with the passed value
	 *  Corresponding COBOL Variable is WS-ABEND-CODE-CEE
	 *	@param number
	 */
	public void setAbendCodeCee(long number) {
	     // Truncate if the number is beyond +/- Max range
	    abendCodeCee = checkAbendCodeCeeMaxLimit(number); 
	}


	/**
	 *	Returns the value of timing
	 *	@return timing
	 */
	public int getTiming() throws CFException {
   		return timing;
	}
	
	/**
	 * 	Update Timing with the passed value
	 *  Corresponding COBOL Variable is WS-TIMING
	 *	@param number
	 */
	public void setTiming(int number) {
	     // Truncate if the number is beyond +/- Max range
	    timing = checkTimingMaxLimit(number); 
	}


	public void setTiming(long number) {
	    number = checkTimingMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTiming((int)number);
	}
	

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
