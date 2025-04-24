package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50004iOneDayRecLthGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:41. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.dto.GlobalDto;


@GlobalDto
public class Ip50004iOneDayRecLthGroup extends Ip50004iOneDayRecLthGroupSerialized { 
   

								private long ip50004iOneDayRecLth;
	
	/**
	* Constructor for Ip50004iOneDayRecLthGroup
	**/
    public Ip50004iOneDayRecLthGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ip50004iOneDayRecLth
	 *	@return ip50004iOneDayRecLth
	 */
	public long getIp50004iOneDayRecLth() throws CFException {
        if (isIp50004iOneDayRecLthModified()) { 
           ip50004iOneDayRecLth = refreshIp50004iOneDayRecLth();
        }
   		return ip50004iOneDayRecLth;
	}
	
	/**
	 * 	Update Ip50004iOneDayRecLth with the passed value
	 *  Corresponding COBOL Variable is IP50004I-ONE-DAY-REC-LTH
	 *	@param number
	 */
	public void setIp50004iOneDayRecLth(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ip50004iOneDayRecLth = checkIp50004iOneDayRecLthMaxLimit(number); 
		serializeIp50004iOneDayRecLth(ip50004iOneDayRecLth);
	}



	
	
	

		public static int getIp50004iOneDayRecLthGroupFieldLength() {
			return IP_50004I_ONE_DAY_REC_LTH_GROUP_LENGTH;
		}

}
  
