package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70301OrigMsgLenGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:01. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;

            @Component("global_ip70301OrigMsgLenGroup")

public class Ip70301OrigMsgLenGroup extends Ip70301OrigMsgLenGroupSerialized  implements InitializingBean {
   

								private long ip70301OrigMsgLen;
	
	/**
	* Constructor for Ip70301OrigMsgLenGroup
	**/
    public Ip70301OrigMsgLenGroup() {
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
	 *	Returns the value of ip70301OrigMsgLen
	 *	@return ip70301OrigMsgLen
	 */
	public long getIp70301OrigMsgLen() throws CFException {
        if (isIp70301OrigMsgLenModified()) { 
           ip70301OrigMsgLen = refreshIp70301OrigMsgLen();
        }
   		return ip70301OrigMsgLen;
	}
	
	/**
	 * 	Update Ip70301OrigMsgLen with the passed value
	 *  Corresponding COBOL Variable is IP70301-ORIG-MSG-LEN
	 *	@param number
	 */
	public void setIp70301OrigMsgLen(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ip70301OrigMsgLen = checkIp70301OrigMsgLenMaxLimit(number); 
		serializeIp70301OrigMsgLen(ip70301OrigMsgLen);
	}



	
	
	

		public static int getIp70301OrigMsgLenGroupFieldLength() {
			return IP_70301_ORIG_MSG_LEN_GROUP_LENGTH;
		}

}
  
