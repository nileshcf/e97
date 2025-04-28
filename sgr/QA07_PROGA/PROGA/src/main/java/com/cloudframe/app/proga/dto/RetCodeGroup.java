package com.cloudframe.app.proga.dto;

/**
*  The class RetCodeGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:06. using version 5.0.0.256
**/


import com.cloudframe.app.proga.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class RetCodeGroup extends RetCodeGroupSerialized { 
   

								private int retCode;
	
	/**
	* Constructor for RetCodeGroup
	**/
    public RetCodeGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of retCode
	 *	@return retCode
	 */
	public int getRetCode() throws CFException {
       if (isRetCodeModified()) { 
           retCode = refreshRetCode();
        }
   		return retCode;
	}
	

	
	   
	/**
	 * 	Update RetCode with the passed value
	 *  Corresponding COBOL Variable is RET-CODE
	 *	@param number
	 */
	public void setRetCode(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    retCode = checkRetCodeMaxLimit(number); 
		serializeRetCode(retCode);
	}
	

	public void setRetCode(long number) {
	    number = checkRetCodeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setRetCode((int)number);
	}
	
	/**
	 * 	Update RetCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setRetCode(char[] value) throws CFException {
		 retCode = serializeRetCode(value);
	}
	/**
	 * 	Update RetCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRetCodeString(char[] value) throws CFException {
		 setRetCode(value);
	}

	
	
	

		public static int getRetCodeGroupFieldLength() {
			return RET_CODE_GROUP_LENGTH;
		}

}
  
