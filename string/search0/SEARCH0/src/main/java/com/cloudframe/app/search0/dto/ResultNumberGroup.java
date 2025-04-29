package com.cloudframe.app.search0.dto;

/**
*  The class ResultNumberGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:29. using version 5.0.0.257
**/


import com.cloudframe.app.search0.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class ResultNumberGroup extends ResultNumberGroupSerialized {
   

								private long resultNumber;
	
	/**
	* Constructor for ResultNumberGroup
	**/
    public ResultNumberGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of resultNumber
	 *	@return resultNumber
	 */
	public long getResultNumber() throws CFException {
       if (isResultNumberModified()) { 
           resultNumber = refreshResultNumber();
        }
   		return resultNumber;
	}
	

	
	   
	/**
	 * 	Update ResultNumber with the passed value
	 *  Corresponding COBOL Variable is RESULT-NUMBER
	 *	@param number
	 */
	public void setResultNumber(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    resultNumber = checkResultNumberMaxLimit(number); 
		serializeResultNumber(resultNumber);
	}
	

	/**
	 * 	Update ResultNumber with the passed value
	 *	@param value (String or char[])
	 */
	public void setResultNumber(char[] value) throws CFException {
		 resultNumber = serializeResultNumber(value);
	}
	/**
	 * 	Update ResultNumber with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setResultNumberString(char[] value) throws CFException {
		 setResultNumber(value);
	}

	
	
	

		public static int getResultNumberGroupFieldLength() {
			return RESULT_NUMBER_GROUP_LENGTH;
		}

}
  
