package com.cloudframe.app.search0.dto;

/**
*  The class FirstNumberGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:29. using version 5.0.0.257
**/


import com.cloudframe.app.search0.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class FirstNumberGroup extends FirstNumberGroupSerialized {
   

								private long firstNumber;
	
	/**
	* Constructor for FirstNumberGroup
	**/
    public FirstNumberGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of firstNumber
	 *	@return firstNumber
	 */
	public long getFirstNumber() throws CFException {
       if (isFirstNumberModified()) { 
           firstNumber = refreshFirstNumber();
        }
   		return firstNumber;
	}
	

	
	   
	/**
	 * 	Update FirstNumber with the passed value
	 *  Corresponding COBOL Variable is FIRST-NUMBER
	 *	@param number
	 */
	public void setFirstNumber(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    firstNumber = checkFirstNumberMaxLimit(number); 
		serializeFirstNumber(firstNumber);
	}
	

	/**
	 * 	Update FirstNumber with the passed value
	 *	@param value (String or char[])
	 */
	public void setFirstNumber(char[] value) throws CFException {
		 firstNumber = serializeFirstNumber(value);
	}
	/**
	 * 	Update FirstNumber with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFirstNumberString(char[] value) throws CFException {
		 setFirstNumber(value);
	}

	
	
	

		public static int getFirstNumberGroupFieldLength() {
			return FIRST_NUMBER_GROUP_LENGTH;
		}

}
  
