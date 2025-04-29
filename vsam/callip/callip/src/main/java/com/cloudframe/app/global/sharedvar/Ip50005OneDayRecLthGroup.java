package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50005OneDayRecLthGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:24. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;

            @Component("global_ip50005OneDayRecLthGroup")

public class Ip50005OneDayRecLthGroup extends Ip50005OneDayRecLthGroupSerialized  implements InitializingBean {
   

								private long ip50005OneDayRecLth;

								private long ip50005TableDataLength;
	
	/**
	* Constructor for Ip50005OneDayRecLthGroup
	**/
    public Ip50005OneDayRecLthGroup() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip50005OneDayRecLth
	 *	@return ip50005OneDayRecLth
	 */
	public long getIp50005OneDayRecLth() throws CFException {
        if (isIp50005OneDayRecLthModified()) { 
           ip50005OneDayRecLth = refreshIp50005OneDayRecLth();
        }
   		return ip50005OneDayRecLth;
	}
	
	/**
	 * 	Update Ip50005OneDayRecLth with the passed value
	 *  Corresponding COBOL Variable is IP50005-ONE-DAY-REC-LTH
	 *	@param number
	 */
	public void setIp50005OneDayRecLth(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ip50005OneDayRecLth = checkIp50005OneDayRecLthMaxLimit(number); 
		serializeIp50005OneDayRecLth(ip50005OneDayRecLth);
	}


	/**
	 *	Returns the value of ip50005TableDataLength
	 *	@return ip50005TableDataLength
	 */
	public long getIp50005TableDataLength() throws CFException {
        if (isIp50005TableDataLengthModified()) { 
           ip50005TableDataLength = refreshIp50005TableDataLength();
        }
   		return ip50005TableDataLength;
	}
	
	/**
	 * 	Update Ip50005TableDataLength with the passed value
	 *  Corresponding COBOL Variable is IP50005-TABLE-DATA-LENGTH
	 *	@param number
	 */
	public void setIp50005TableDataLength(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ip50005TableDataLength = checkIp50005TableDataLengthMaxLimit(number); 
		serializeIp50005TableDataLength(ip50005TableDataLength);
	}



	
	
	

		public static int getIp50005OneDayRecLthGroupFieldLength() {
			return IP_50005_ONE_DAY_REC_LTH_GROUP_LENGTH;
		}

}
  
