package com.cloudframe.app.ip606130.dto;

/**
*  The class EndOfStepMsg300 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:24. using version 5.0.0.254
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class EndOfStepMsg300 extends EndOfStepMsg300Serialized {
   




								private int condCode300;
	
	/**
	* Constructor for EndOfStepMsg300
	**/
    public EndOfStepMsg300() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("IP606130").toCharArray()
             , getStartOffset() + 0
             ,8
             );
       replaceValue( // serialize and save the value
             ("-9999-").toCharArray()
             , getStartOffset() + 8
             ,6
             );
       replaceValue( // serialize and save the value
             ("END OF STEP, CONDITION CODE  :").toCharArray()
             , getStartOffset() + 14
             ,30
             );
								setCondCode300(0);
    }


 

	/**
	 *	Returns the value of condCode300
	 *	@return condCode300
	 */
	public int getCondCode300() throws CFException {
       if (isCondCode300Modified()) { 
           condCode300 = refreshCondCode300();
        }
   		return condCode300;
	}
	

	
	   
	/**
	 * 	Update CondCode300 with the passed value
	 *  Corresponding COBOL Variable is 300-COND-CODE
	 *	@param number
	 */
	public void setCondCode300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    condCode300 = checkCondCode300MaxLimit(number); 
		serializeCondCode300(condCode300);
	}
	

	public void setCondCode300(long number) {
	    number = checkCondCode300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setCondCode300((int)number);
	}
	
	/**
	 * 	Update CondCode300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCondCode300(char[] value) throws CFException {
		 condCode300 = serializeCondCode300(value);
	}
	/**
	 * 	Update CondCode300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCondCode300String(char[] value) throws CFException {
		 setCondCode300(value);
	}

	
	
	

		public static int getEndOfStepMsg300FieldLength() {
			return END_OF_STEP_MSG_300_LENGTH;
		}

}
  
