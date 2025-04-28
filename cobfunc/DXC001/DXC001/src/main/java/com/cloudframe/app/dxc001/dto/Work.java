package com.cloudframe.app.dxc001.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:56. using version 5.0.0.256
**/


import com.cloudframe.app.dxc001.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized { 
   

								private long currDat1;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of currDat1
	 *	@return currDat1
	 */
	public long getCurrDat1() throws CFException {
   		return currDat1;
	}
	
	/**
	 * 	Update CurrDat1 with the passed value
	 *  Corresponding COBOL Variable is CURR-DAT1
	 *	@param number
	 */
	public void setCurrDat1(long number) {
	     // Truncate if the number is beyond +/- Max range
	    currDat1 = checkCurrDat1MaxLimit(number); 
	}



	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
