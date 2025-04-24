package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50005oOneDayRecLthGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:47. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.dto.GlobalDto;


@GlobalDto
public class Ip50005oOneDayRecLthGroup extends Ip50005oOneDayRecLthGroupSerialized { 
   

								private long ip50005oOneDayRecLth;

								private long ip50005oTableDataLength;
	
	/**
	* Constructor for Ip50005oOneDayRecLthGroup
	**/
    public Ip50005oOneDayRecLthGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ip50005oOneDayRecLth
	 *	@return ip50005oOneDayRecLth
	 */
	public long getIp50005oOneDayRecLth() throws CFException {
        if (isIp50005oOneDayRecLthModified()) { 
           ip50005oOneDayRecLth = refreshIp50005oOneDayRecLth();
        }
   		return ip50005oOneDayRecLth;
	}
	
	/**
	 * 	Update Ip50005oOneDayRecLth with the passed value
	 *  Corresponding COBOL Variable is IP50005O-ONE-DAY-REC-LTH
	 *	@param number
	 */
	public void setIp50005oOneDayRecLth(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ip50005oOneDayRecLth = checkIp50005oOneDayRecLthMaxLimit(number); 
		serializeIp50005oOneDayRecLth(ip50005oOneDayRecLth);
	}


	/**
	 *	Returns the value of ip50005oTableDataLength
	 *	@return ip50005oTableDataLength
	 */
	public long getIp50005oTableDataLength() throws CFException {
        if (isIp50005oTableDataLengthModified()) { 
           ip50005oTableDataLength = refreshIp50005oTableDataLength();
        }
   		return ip50005oTableDataLength;
	}
	
	/**
	 * 	Update Ip50005oTableDataLength with the passed value
	 *  Corresponding COBOL Variable is IP50005O-TABLE-DATA-LENGTH
	 *	@param number
	 */
	public void setIp50005oTableDataLength(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ip50005oTableDataLength = checkIp50005oTableDataLengthMaxLimit(number); 
		serializeIp50005oTableDataLength(ip50005oTableDataLength);
	}



	
	
	

		public static int getIp50005oOneDayRecLthGroupFieldLength() {
			return IP_50005O_ONE_DAY_REC_LTH_GROUP_LENGTH;
		}

}
  
