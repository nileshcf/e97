package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip500041OneDayRecLthGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:00. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;

            @Component("global_ip500041OneDayRecLthGroup")

public class Ip500041OneDayRecLthGroup extends Ip500041OneDayRecLthGroupSerialized  implements InitializingBean {
   

								private long ip500041OneDayRecLth;
	
	/**
	* Constructor for Ip500041OneDayRecLthGroup
	**/
    public Ip500041OneDayRecLthGroup() {
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
	 *	Returns the value of ip500041OneDayRecLth
	 *	@return ip500041OneDayRecLth
	 */
	public long getIp500041OneDayRecLth() throws CFException {
        if (isIp500041OneDayRecLthModified()) { 
           ip500041OneDayRecLth = refreshIp500041OneDayRecLth();
        }
   		return ip500041OneDayRecLth;
	}
	
	/**
	 * 	Update Ip500041OneDayRecLth with the passed value
	 *  Corresponding COBOL Variable is IP500041-ONE-DAY-REC-LTH
	 *	@param number
	 */
	public void setIp500041OneDayRecLth(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ip500041OneDayRecLth = checkIp500041OneDayRecLthMaxLimit(number); 
		serializeIp500041OneDayRecLth(ip500041OneDayRecLth);
	}



	
	
	

		public static int getIp500041OneDayRecLthGroupFieldLength() {
			return IP_500041_ONE_DAY_REC_LTH_GROUP_LENGTH;
		}

}
  
