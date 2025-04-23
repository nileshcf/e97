package com.cloudframe.app.ip829010.dto;

/**
*  The class MqputFailCnt613 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/


import com.cloudframe.app.ip829010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class MqputFailCnt613 extends MqputFailCnt613Serialized {
   



								private long putFailCnt613;
	
	/**
	* Constructor for MqputFailCnt613
	**/
    public MqputFailCnt613() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("IP829010-").toCharArray()
             , getStartOffset() + 0
             ,9
             );
       replaceValue( // serialize and save the value
             ("NO. OF MQPUT FAILS                  =      ").toCharArray()
             , getStartOffset() + 9
             ,43
             );
    }


 

	/**
	 *	Returns the value of putFailCnt613
	 *	@return putFailCnt613
	 */
	public long getPutFailCnt613() throws CFException {
       if (isPutFailCnt613Modified()) { 
           putFailCnt613 = refreshPutFailCnt613();
        }
   		return putFailCnt613;
	}
	

	
	   
	/**
	 * 	Update PutFailCnt613 with the passed value
	 *  Corresponding COBOL Variable is 613-PUT-FAIL-CNT
	 *	@param number
	 */
	public void setPutFailCnt613(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    putFailCnt613 = checkPutFailCnt613MaxLimit(number); 
		serializePutFailCnt613(putFailCnt613);
	}
	

	/**
	 * 	Update PutFailCnt613 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPutFailCnt613(char[] value) throws CFException {
		 putFailCnt613 = serializePutFailCnt613(value);
	}
	/**
	 * 	Update PutFailCnt613 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPutFailCnt613String(char[] value) throws CFException {
		 setPutFailCnt613(value);
	}

	
	
	

		public static int getMqputFailCnt613FieldLength() {
			return MQPUT_FAIL_CNT_613_LENGTH;
		}

}
  
