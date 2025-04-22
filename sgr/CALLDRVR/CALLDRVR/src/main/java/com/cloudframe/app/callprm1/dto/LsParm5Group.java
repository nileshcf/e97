package com.cloudframe.app.callprm1.dto;

/**
*  The class LsParm5Group is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:21. using version 5.0.0.254
**/


import com.cloudframe.app.callprm1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class LsParm5Group extends LsParm5GroupSerialized {
   

								private short lsParm5;
	
	/**
	* Constructor for LsParm5Group
	**/
    public LsParm5Group() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of lsParm5
	 *	@return lsParm5
	 */
	public short getLsParm5() throws CFException {
        if (isLsParm5Modified()) { 
           lsParm5 = refreshLsParm5();
        }
   		return lsParm5;
	}
	
	/**
	 * 	Update LsParm5 with the passed value
	 *  Corresponding COBOL Variable is LS-PARM5
	 *	@param number
	 */
	public void setLsParm5(short number) {
	     // Truncate if the number is beyond +/- Max range
	    lsParm5 = checkLsParm5MaxLimit(number); 
		serializeLsParm5(lsParm5);
	}

	public void setLsParm5(int number) {
	    number = checkLsParm5MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setLsParm5((short)number);
	}
	public void setLsParm5(long number) {
	    number = checkLsParm5MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setLsParm5((short)number);
	}
	


	
	
	

		public static int getLsParm5GroupFieldLength() {
			return LS_PARM_5_GROUP_LENGTH;
		}

}
  
