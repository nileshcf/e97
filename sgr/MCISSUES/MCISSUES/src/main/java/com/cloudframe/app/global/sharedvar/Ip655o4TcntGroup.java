package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip655o4TcntGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;

            @Component("global_ip655o4TcntGroup")

public class Ip655o4TcntGroup extends Ip655o4TcntGroupSerialized  implements InitializingBean {
   

								private short ip655o4Tcnt;
	
	/**
	* Constructor for Ip655o4TcntGroup
	**/
    public Ip655o4TcntGroup() {
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
	 *	Returns the value of ip655o4Tcnt
	 *	@return ip655o4Tcnt
	 */
	public short getIp655o4Tcnt() throws CFException {
        if (isIp655o4TcntModified()) { 
           ip655o4Tcnt = refreshIp655o4Tcnt();
        }
   		return ip655o4Tcnt;
	}
	
	/**
	 * 	Update Ip655o4Tcnt with the passed value
	 *  Corresponding COBOL Variable is IP655O4-TCNT
	 *	@param number
	 */
	public void setIp655o4Tcnt(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip655o4Tcnt = checkIp655o4TcntMaxLimit(number); 
		serializeIp655o4Tcnt(ip655o4Tcnt);
	}

	public void setIp655o4Tcnt(int number) {
	    number = checkIp655o4TcntMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp655o4Tcnt((short)number);
	}
	public void setIp655o4Tcnt(long number) {
	    number = checkIp655o4TcntMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp655o4Tcnt((short)number);
	}
	


	
	
	

		public static int getIp655o4TcntGroupFieldLength() {
			return IP_655O_4_TCNT_GROUP_LENGTH;
		}

}
  
