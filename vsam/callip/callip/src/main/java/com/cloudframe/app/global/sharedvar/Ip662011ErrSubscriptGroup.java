package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip662011ErrSubscriptGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:21. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;

            @Component("global_ip662011ErrSubscriptGroup")

public class Ip662011ErrSubscriptGroup extends Ip662011ErrSubscriptGroupSerialized  implements InitializingBean {
   

								private int ip662011ErrSubscript;
	
	/**
	* Constructor for Ip662011ErrSubscriptGroup
	**/
    public Ip662011ErrSubscriptGroup() {
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
	 *	Returns the value of ip662011ErrSubscript
	 *	@return ip662011ErrSubscript
	 */
	public int getIp662011ErrSubscript() throws CFException {
        if (isIp662011ErrSubscriptModified()) { 
           ip662011ErrSubscript = refreshIp662011ErrSubscript();
        }
   		return ip662011ErrSubscript;
	}
	
	/**
	 * 	Update Ip662011ErrSubscript with the passed value
	 *  Corresponding COBOL Variable is IP662011-ERR-SUBSCRIPT
	 *	@param number
	 */
	public void setIp662011ErrSubscript(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip662011ErrSubscript = checkIp662011ErrSubscriptMaxLimit(number); 
		serializeIp662011ErrSubscript(ip662011ErrSubscript);
	}


	public void setIp662011ErrSubscript(long number) {
	    number = checkIp662011ErrSubscriptMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp662011ErrSubscript((int)number);
	}
	

	
	
	

		public static int getIp662011ErrSubscriptGroupFieldLength() {
			return IP_662011_ERR_SUBSCRIPT_GROUP_LENGTH;
		}

}
  
