package com.cloudframe.app.search0.dto;

/**
*  The class SecondNumberGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:12. using version 5.0.0.256
**/


import com.cloudframe.app.search0.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class SecondNumberGroup extends SecondNumberGroupSerialized {
   

								private long secondNumber;
	
	/**
	* Constructor for SecondNumberGroup
	**/
    public SecondNumberGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of secondNumber
	 *	@return secondNumber
	 */
	public long getSecondNumber() throws CFException {
       if (isSecondNumberModified()) { 
           secondNumber = refreshSecondNumber();
        }
   		return secondNumber;
	}
	

	
	   
	/**
	 * 	Update SecondNumber with the passed value
	 *  Corresponding COBOL Variable is SECOND-NUMBER
	 *	@param number
	 */
	public void setSecondNumber(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    secondNumber = checkSecondNumberMaxLimit(number); 
		serializeSecondNumber(secondNumber);
	}
	

	/**
	 * 	Update SecondNumber with the passed value
	 *	@param value (String or char[])
	 */
	public void setSecondNumber(char[] value) throws CFException {
		 secondNumber = serializeSecondNumber(value);
	}
	/**
	 * 	Update SecondNumber with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSecondNumberString(char[] value) throws CFException {
		 setSecondNumber(value);
	}

	
	
	

		public static int getSecondNumberGroupFieldLength() {
			return SECOND_NUMBER_GROUP_LENGTH;
		}

}
  
