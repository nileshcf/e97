package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70301LnCommitCntGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;

            @Component("global_ip70301LnCommitCntGroup")

public class Ip70301LnCommitCntGroup extends Ip70301LnCommitCntGroupSerialized  implements InitializingBean {
   

								private int ip70301LnCommitCnt;
	
	/**
	* Constructor for Ip70301LnCommitCntGroup
	**/
    public Ip70301LnCommitCntGroup() {
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
	 *	Returns the value of ip70301LnCommitCnt
	 *	@return ip70301LnCommitCnt
	 */
	public int getIp70301LnCommitCnt() throws CFException {
       if (isIp70301LnCommitCntModified()) { 
           ip70301LnCommitCnt = refreshIp70301LnCommitCnt();
        }
   		return ip70301LnCommitCnt;
	}
	

	
	   
	/**
	 * 	Update Ip70301LnCommitCnt with the passed value
	 *  Corresponding COBOL Variable is IP70301-LN-COMMIT-CNT
	 *	@param number
	 */
	public void setIp70301LnCommitCnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip70301LnCommitCnt = checkIp70301LnCommitCntMaxLimit(number); 
		serializeIp70301LnCommitCnt(ip70301LnCommitCnt);
	}
	

	public void setIp70301LnCommitCnt(long number) {
	    number = checkIp70301LnCommitCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp70301LnCommitCnt((int)number);
	}
	
	/**
	 * 	Update Ip70301LnCommitCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp70301LnCommitCnt(char[] value) throws CFException {
		 ip70301LnCommitCnt = serializeIp70301LnCommitCnt(value);
	}
	/**
	 * 	Update Ip70301LnCommitCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp70301LnCommitCntString(char[] value) throws CFException {
		 setIp70301LnCommitCnt(value);
	}

	
	
	

		public static int getIp70301LnCommitCntGroupFieldLength() {
			return IP_70301_LN_COMMIT_CNT_GROUP_LENGTH;
		}

}
  
