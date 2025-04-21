package com.cloudframe.app.ar640010.dto;

/**
*  The class FailedMsg699 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class FailedMsg699 extends FailedMsg699Serialized {
   



								private long failedRequest699;


								private int failedTotal699;
	
	/**
	* Constructor for FailedMsg699
	**/
    public FailedMsg699() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("9999-").toCharArray()
             , getStartOffset() + 0
             ,5
             );
       replaceValue( // serialize and save the value
             ("REQUEST NBR: ").toCharArray()
             , getStartOffset() + 5
             ,13
             );
								setFailedRequest699(0L);
       replaceValue( // serialize and save the value
             (" FAILED - TOTAL ERRORS: ").toCharArray()
             , getStartOffset() + 27
             ,24
             );
								setFailedTotal699(0);
    }


 

	/**
	 *	Returns the value of failedRequest699
	 *	@return failedRequest699
	 */
	public long getFailedRequest699() throws CFException {
       if (isFailedRequest699Modified()) { 
           failedRequest699 = refreshFailedRequest699();
        }
   		return failedRequest699;
	}
	

	
	   
	/**
	 * 	Update FailedRequest699 with the passed value
	 *  Corresponding COBOL Variable is 699-FAILED-REQUEST
	 *	@param number
	 */
	public void setFailedRequest699(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    failedRequest699 = checkFailedRequest699MaxLimit(number); 
		serializeFailedRequest699(failedRequest699);
	}
	

	/**
	 * 	Update FailedRequest699 with the passed value
	 *	@param value (String or char[])
	 */
	public void setFailedRequest699(char[] value) throws CFException {
		 failedRequest699 = serializeFailedRequest699(value);
	}
	/**
	 * 	Update FailedRequest699 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFailedRequest699String(char[] value) throws CFException {
		 setFailedRequest699(value);
	}
	/**
	 *	Returns the value of failedTotal699
	 *	@return failedTotal699
	 */
	public int getFailedTotal699() throws CFException {
       if (isFailedTotal699Modified()) { 
           failedTotal699 = refreshFailedTotal699();
        }
   		return failedTotal699;
	}
	

	
	   
	/**
	 * 	Update FailedTotal699 with the passed value
	 *  Corresponding COBOL Variable is 699-FAILED-TOTAL
	 *	@param number
	 */
	public void setFailedTotal699(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    failedTotal699 = checkFailedTotal699MaxLimit(number); 
		serializeFailedTotal699(failedTotal699);
	}
	

	public void setFailedTotal699(long number) {
	    number = checkFailedTotal699MaxLimit(number); // Truncate if value is beyond +/- Max range
		setFailedTotal699((int)number);
	}
	
	/**
	 * 	Update FailedTotal699 with the passed value
	 *	@param value (String or char[])
	 */
	public void setFailedTotal699(char[] value) throws CFException {
		 failedTotal699 = serializeFailedTotal699(value);
	}
	/**
	 * 	Update FailedTotal699 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFailedTotal699String(char[] value) throws CFException {
		 setFailedTotal699(value);
	}

	
	
	

		public static int getFailedMsg699FieldLength() {
			return FAILED_MSG_699_LENGTH;
		}

}
  
