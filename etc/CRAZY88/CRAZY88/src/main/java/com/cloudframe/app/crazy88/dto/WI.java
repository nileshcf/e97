package com.cloudframe.app.crazy88.dto;

/**
*  The class WI is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:10. using version 5.0.0.256
**/


import com.cloudframe.app.crazy88.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class WI extends WISerialized {
   

								private short i;
	
	/**
	* Constructor for WI
	**/
    public WI() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setI((short)0);
    }


 

	/**
	 *	Returns the value of i
	 *	@return i
	 */
	public short getI() throws CFException {
        if (isIModified()) { 
           i = refreshI();
        }
   		return i;
	}
	
	/**
	 * 	Update I with the passed value
	 *  Corresponding COBOL Variable is I
	 *	@param number
	 */
	public void setI(short number) {
	     // Truncate if the number is beyond +/- Max range
	    i = checkIMaxLimit(number); 
		serializeI(i);
	}

	public void setI(int number) {
	    number = checkIMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setI((short)number);
	}
	public void setI(long number) {
	    number = checkIMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setI((short)number);
	}
	


	
	
	

		public static int getWIFieldLength() {
			return W_I_LENGTH;
		}

}
  
