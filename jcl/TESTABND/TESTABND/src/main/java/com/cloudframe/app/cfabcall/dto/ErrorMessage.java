package com.cloudframe.app.cfabcall.dto;

/**
*  The class ErrorMessage is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:02. using version 5.0.0.256
**/


import com.cloudframe.app.cfabcall.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class ErrorMessage extends ErrorMessageSerialized {
   

								private short errorLen;
	
	/**
	* Constructor for ErrorMessage
	**/
    public ErrorMessage() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setErrorLen((short)720);
    }


 

	/**
	 *	Returns the value of errorLen
	 *	@return errorLen
	 */
	public short getErrorLen() throws CFException {
        if (isErrorLenModified()) { 
           errorLen = refreshErrorLen();
        }
   		return errorLen;
	}
	
	/**
	 * 	Update ErrorLen with the passed value
	 *  Corresponding COBOL Variable is ERROR-LEN
	 *	@param number
	 */
	public void setErrorLen(short number) {
	     // Truncate if the number is beyond +/- Max range
	    errorLen = checkErrorLenMaxLimit(number); 
		serializeErrorLen(errorLen);
	}

	public void setErrorLen(int number) {
	    number = checkErrorLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setErrorLen((short)number);
	}
	public void setErrorLen(long number) {
	    number = checkErrorLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setErrorLen((short)number);
	}
	


	
	
	

		public static int getErrorMessageFieldLength() {
			return ERROR_MESSAGE_LENGTH;
		}

}
  
