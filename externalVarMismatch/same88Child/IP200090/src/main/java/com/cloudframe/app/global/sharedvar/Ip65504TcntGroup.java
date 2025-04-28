package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504TcntGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:05. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.dto.GlobalDto;


@GlobalDto
public class Ip65504TcntGroup extends Ip65504TcntGroupSerialized { 
   

								private short ip65504Tcnt;
	
	/**
	* Constructor for Ip65504TcntGroup
	**/
    public Ip65504TcntGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ip65504Tcnt
	 *	@return ip65504Tcnt
	 */
	public short getIp65504Tcnt() throws CFException {
        if (isIp65504TcntModified()) { 
           ip65504Tcnt = refreshIp65504Tcnt();
        }
   		return ip65504Tcnt;
	}
	
	/**
	 * 	Update Ip65504Tcnt with the passed value
	 *  Corresponding COBOL Variable is IP65504-TCNT
	 *	@param number
	 */
	public void setIp65504Tcnt(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504Tcnt = checkIp65504TcntMaxLimit(number); 
		serializeIp65504Tcnt(ip65504Tcnt);
	}

	public void setIp65504Tcnt(int number) {
	    number = checkIp65504TcntMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504Tcnt((short)number);
	}
	public void setIp65504Tcnt(long number) {
	    number = checkIp65504TcntMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504Tcnt((short)number);
	}
	


	
	
	

		public static int getIp65504TcntGroupFieldLength() {
			return IP_65504_TCNT_GROUP_LENGTH;
		}

}
  
