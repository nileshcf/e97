package com.cloudframe.app.ip666030.dto;

/**
*  The class StartGroup800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:01. using version 5.0.0.254
**/


import com.cloudframe.app.ip666030.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class StartGroup800 extends StartGroup800Serialized {
   

								private int start800;

								private int startR800;
	
	/**
	* Constructor for StartGroup800
	**/
    public StartGroup800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of start800
	 *	@return start800
	 */
	public int getStart800() throws CFException {
        if (isStart800Modified()) { 
           start800 = refreshStart800();
        }
   		return start800;
	}
	
	/**
	 * 	Update Start800 with the passed value
	 *  Corresponding COBOL Variable is 800-START
	 *	@param number
	 */
	public void setStart800(int number) {
	     // Truncate if the number is beyond +/- Max range
	    start800 = checkStart800MaxLimit(number); 
		serializeStart800(start800);
	}


	public void setStart800(long number) {
	    number = checkStart800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setStart800((int)number);
	}
	
	/**
	 *	Returns the value of startR800
	 *	@return startR800
	 */
	public int getStartR800() throws CFException {
        if (isStartR800Modified()) { 
           startR800 = refreshStartR800();
        }
   		return startR800;
	}
	
	/**
	 * 	Update StartR800 with the passed value
	 *  Corresponding COBOL Variable is 800-START-R
	 *	@param number
	 */
	public void setStartR800(int number) {
	     // Truncate if the number is beyond +/- Max range
	    startR800 = checkStartR800MaxLimit(number); 
		serializeStartR800(startR800);
	}


	public void setStartR800(long number) {
	    number = checkStartR800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setStartR800((int)number);
	}
	

	
	
	

		public static int getStartGroup800FieldLength() {
			return START_GROUP_800_LENGTH;
		}

}
  
