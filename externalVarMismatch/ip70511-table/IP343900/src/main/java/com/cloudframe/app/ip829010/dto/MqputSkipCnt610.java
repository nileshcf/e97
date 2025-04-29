package com.cloudframe.app.ip829010.dto;

/**
*  The class MqputSkipCnt610 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/


import com.cloudframe.app.ip829010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class MqputSkipCnt610 extends MqputSkipCnt610Serialized {
   



								private long putSkipCnt610;
	
	/**
	* Constructor for MqputSkipCnt610
	**/
    public MqputSkipCnt610() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("IP829010-").toCharArray()
             , getStartOffset() + 0
             ,9
             );
       replaceValue( // serialize and save the value
             ("NO. OF RECS SKIPPED FROM MQ PUT     =      ").toCharArray()
             , getStartOffset() + 9
             ,43
             );
    }


 

	/**
	 *	Returns the value of putSkipCnt610
	 *	@return putSkipCnt610
	 */
	public long getPutSkipCnt610() throws CFException {
       if (isPutSkipCnt610Modified()) { 
           putSkipCnt610 = refreshPutSkipCnt610();
        }
   		return putSkipCnt610;
	}
	

	
	   
	/**
	 * 	Update PutSkipCnt610 with the passed value
	 *  Corresponding COBOL Variable is 610-PUT-SKIP-CNT
	 *	@param number
	 */
	public void setPutSkipCnt610(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    putSkipCnt610 = checkPutSkipCnt610MaxLimit(number); 
		serializePutSkipCnt610(putSkipCnt610);
	}
	

	/**
	 * 	Update PutSkipCnt610 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPutSkipCnt610(char[] value) throws CFException {
		 putSkipCnt610 = serializePutSkipCnt610(value);
	}
	/**
	 * 	Update PutSkipCnt610 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPutSkipCnt610String(char[] value) throws CFException {
		 setPutSkipCnt610(value);
	}

	
	
	

		public static int getMqputSkipCnt610FieldLength() {
			return MQPUT_SKIP_CNT_610_LENGTH;
		}

}
  
