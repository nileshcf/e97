package com.cloudframe.app.init4.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:13. using version 5.0.0.257
**/


import com.cloudframe.app.init4.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized {
   

								private int i;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of i
	 *	@return i
	 */
	public int getI() throws CFException {
       if (isIModified()) { 
           i = refreshI();
        }
   		return i;
	}
	

	
	   
	/**
	 * 	Update I with the passed value
	 *  Corresponding COBOL Variable is WS-I
	 *	@param number
	 */
	public void setI(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    i = checkIMaxLimit(number); 
		serializeI(i);
	}
	

	public void setI(long number) {
	    number = checkIMaxLimit(number); // Truncate if value is beyond +/- Max range
		setI((int)number);
	}
	
	/**
	 * 	Update I with the passed value
	 *	@param value (String or char[])
	 */
	public void setI(char[] value) throws CFException {
		 i = serializeI(value);
	}
	/**
	 * 	Update I with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIString(char[] value) throws CFException {
		 setI(value);
	}

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
