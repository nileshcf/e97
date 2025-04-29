package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip35501RelativeRecNumGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:27. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;

            @Component("global_ip35501RelativeRecNumGroup")

public class Ip35501RelativeRecNumGroup extends Ip35501RelativeRecNumGroupSerialized  implements InitializingBean {
   

								private int ip35501RelativeRecNum;
	
	/**
	* Constructor for Ip35501RelativeRecNumGroup
	**/
    public Ip35501RelativeRecNumGroup() {
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
	 *	Returns the value of ip35501RelativeRecNum
	 *	@return ip35501RelativeRecNum
	 */
	public int getIp35501RelativeRecNum() throws CFException {
        if (isIp35501RelativeRecNumModified()) { 
           ip35501RelativeRecNum = refreshIp35501RelativeRecNum();
        }
   		return ip35501RelativeRecNum;
	}
	
	/**
	 * 	Update Ip35501RelativeRecNum with the passed value
	 *  Corresponding COBOL Variable is IP35501-RELATIVE-REC-NUM
	 *	@param number
	 */
	public void setIp35501RelativeRecNum(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip35501RelativeRecNum = checkIp35501RelativeRecNumMaxLimit(number); 
		serializeIp35501RelativeRecNum(ip35501RelativeRecNum);
	}


	public void setIp35501RelativeRecNum(long number) {
	    number = checkIp35501RelativeRecNumMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp35501RelativeRecNum((int)number);
	}
	

	
	
	

		public static int getIp35501RelativeRecNumGroupFieldLength() {
			return IP_35501_RELATIVE_REC_NUM_GROUP_LENGTH;
		}

}
  
