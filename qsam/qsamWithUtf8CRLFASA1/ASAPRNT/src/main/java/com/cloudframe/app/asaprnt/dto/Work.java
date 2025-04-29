package com.cloudframe.app.asaprnt.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:29. using version 5.0.0.257
**/


import com.cloudframe.app.asaprnt.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized {
   

								private short lineSpace;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of lineSpace
	 *	@return lineSpace
	 */
	public short getLineSpace() throws CFException {
   		return lineSpace;
	}
	
	/**
	 * 	Update LineSpace with the passed value
	 *  Corresponding COBOL Variable is LINE-SPACE
	 *	@param number
	 */
	public void setLineSpace(short number) {
	     // Truncate if the number is beyond +/- Max range
	    lineSpace = checkLineSpaceMaxLimit(number); 
	}

	public void setLineSpace(int number) {
	    number = checkLineSpaceMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setLineSpace((short)number);
	}
	public void setLineSpace(long number) {
	    number = checkLineSpaceMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setLineSpace((short)number);
	}
	


	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
