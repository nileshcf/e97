package com.cloudframe.app.callprm2.dto;

/**
*  The class LsParm2Group is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:38. using version 5.0.0.254
**/


import com.cloudframe.app.callprm2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class LsParm2Group extends LsParm2GroupSerialized {
   

								private short lsParm2;
	
	/**
	* Constructor for LsParm2Group
	**/
    public LsParm2Group() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of lsParm2
	 *	@return lsParm2
	 */
	public short getLsParm2() throws CFException {
        if (isLsParm2Modified()) { 
           lsParm2 = refreshLsParm2();
        }
   		return lsParm2;
	}
	
	/**
	 * 	Update LsParm2 with the passed value
	 *  Corresponding COBOL Variable is LS-PARM2
	 *	@param number
	 */
	public void setLsParm2(short number) {
	     // Truncate if the number is beyond +/- Max range
	    lsParm2 = checkLsParm2MaxLimit(number); 
		serializeLsParm2(lsParm2);
	}

	public void setLsParm2(int number) {
	    number = checkLsParm2MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setLsParm2((short)number);
	}
	public void setLsParm2(long number) {
	    number = checkLsParm2MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setLsParm2((short)number);
	}
	


	
	
	

		public static int getLsParm2GroupFieldLength() {
			return LS_PARM_2_GROUP_LENGTH;
		}

}
  
