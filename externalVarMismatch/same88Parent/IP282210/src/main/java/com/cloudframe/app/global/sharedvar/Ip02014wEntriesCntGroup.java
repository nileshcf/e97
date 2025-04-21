package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip02014wEntriesCntGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:10. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;

            @Component("global_ip02014wEntriesCntGroup")

public class Ip02014wEntriesCntGroup extends Ip02014wEntriesCntGroupSerialized  implements InitializingBean {
   

								private short ip02014wEntriesCnt;
	
	/**
	* Constructor for Ip02014wEntriesCntGroup
	**/
    public Ip02014wEntriesCntGroup() {
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
	 *	Returns the value of ip02014wEntriesCnt
	 *	@return ip02014wEntriesCnt
	 */
	public short getIp02014wEntriesCnt() throws CFException {
        if (isIp02014wEntriesCntModified()) { 
           ip02014wEntriesCnt = refreshIp02014wEntriesCnt();
        }
   		return ip02014wEntriesCnt;
	}
	
	/**
	 * 	Update Ip02014wEntriesCnt with the passed value
	 *  Corresponding COBOL Variable is IP02014W-ENTRIES-CNT
	 *	@param number
	 */
	public void setIp02014wEntriesCnt(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip02014wEntriesCnt = checkIp02014wEntriesCntMaxLimit(number); 
		serializeIp02014wEntriesCnt(ip02014wEntriesCnt);
	}

	public void setIp02014wEntriesCnt(int number) {
	    number = checkIp02014wEntriesCntMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp02014wEntriesCnt((short)number);
	}
	public void setIp02014wEntriesCnt(long number) {
	    number = checkIp02014wEntriesCntMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp02014wEntriesCnt((short)number);
	}
	


	
	
	

		public static int getIp02014wEntriesCntGroupFieldLength() {
			return IP_02014W_ENTRIES_CNT_GROUP_LENGTH;
		}

}
  
