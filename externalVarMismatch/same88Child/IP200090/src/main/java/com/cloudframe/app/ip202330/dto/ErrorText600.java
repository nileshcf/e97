package com.cloudframe.app.ip202330.dto;

/**
*  The class ErrorText600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:05. using version 5.0.0.254
**/


import com.cloudframe.app.ip202330.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ErrorText600 extends ErrorText600Serialized { 
   


								private short errorFieldNumber600;
	
	/**
	* Constructor for ErrorText600
	**/
    public ErrorText600() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ErrorText600. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ErrorText600(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             ("NO VALID ATTRIBUTE FOR ").toCharArray()
             , getStartOffset() + 0
             ,23
             );
								setErrorFieldNumber600((short)0);
    } 

	/**
	 *	Returns the value of errorFieldNumber600
	 *	@return errorFieldNumber600
	 */
	public short getErrorFieldNumber600() throws CFException {
       if (isErrorFieldNumber600Modified()) { 
           errorFieldNumber600 = refreshErrorFieldNumber600();
        }
   		return errorFieldNumber600;
	}
	

    /**
	 *	Returns the String value of errorFieldNumber600
	 *	@return errorFieldNumber600
	 */
	public char[]  getErrorFieldNumber600ActualString() {
	    String value = String.valueOf(errorFieldNumber600).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update ErrorFieldNumber600 with the passed value
	 *  Corresponding COBOL Variable is 600-ERROR-FIELD-NUMBER
	 *	@param number
	 */
	public void setErrorFieldNumber600(short number) {
	     // Truncate if the number is beyond +/- Max range	
	    errorFieldNumber600 = checkErrorFieldNumber600MaxLimit(number); 
		serializeErrorFieldNumber600(errorFieldNumber600);
	}
	
	public void setErrorFieldNumber600(int number) {
	    number = checkErrorFieldNumber600MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setErrorFieldNumber600((short)number);
	}
	public void setErrorFieldNumber600(long number) {
	    number = checkErrorFieldNumber600MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setErrorFieldNumber600((short)number);
	}
	

	/**
	 * 	Update ErrorFieldNumber600 with the passed value
	 *	@param value (String or char[])
	 */
	public void setErrorFieldNumber600(char[] value) throws CFException {
		 errorFieldNumber600 = serializeErrorFieldNumber600(value);
	}
	/**
	 * 	Update ErrorFieldNumber600 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setErrorFieldNumber600String(char[] value) throws CFException {
		 setErrorFieldNumber600(value);
	}

	
	
	

		public static int getErrorText600FieldLength() {
			return ERROR_TEXT_600_LENGTH;
		}

}
  
