package com.cloudframe.app.ip829010.dto;

/**
*  The class MqgetFailCnt612 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/


import com.cloudframe.app.ip829010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class MqgetFailCnt612 extends MqgetFailCnt612Serialized {
   



								private long getFailCnt612;
	
	/**
	* Constructor for MqgetFailCnt612
	**/
    public MqgetFailCnt612() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("IP829010-").toCharArray()
             , getStartOffset() + 0
             ,9
             );
       replaceValue( // serialize and save the value
             ("NO. OF MQGET FAILS                  =      ").toCharArray()
             , getStartOffset() + 9
             ,43
             );
    }


 

	/**
	 *	Returns the value of getFailCnt612
	 *	@return getFailCnt612
	 */
	public long getGetFailCnt612() throws CFException {
       if (isGetFailCnt612Modified()) { 
           getFailCnt612 = refreshGetFailCnt612();
        }
   		return getFailCnt612;
	}
	

	
	   
	/**
	 * 	Update GetFailCnt612 with the passed value
	 *  Corresponding COBOL Variable is 612-GET-FAIL-CNT
	 *	@param number
	 */
	public void setGetFailCnt612(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    getFailCnt612 = checkGetFailCnt612MaxLimit(number); 
		serializeGetFailCnt612(getFailCnt612);
	}
	

	/**
	 * 	Update GetFailCnt612 with the passed value
	 *	@param value (String or char[])
	 */
	public void setGetFailCnt612(char[] value) throws CFException {
		 getFailCnt612 = serializeGetFailCnt612(value);
	}
	/**
	 * 	Update GetFailCnt612 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setGetFailCnt612String(char[] value) throws CFException {
		 setGetFailCnt612(value);
	}

	
	
	

		public static int getMqgetFailCnt612FieldLength() {
			return MQGET_FAIL_CNT_612_LENGTH;
		}

}
  
