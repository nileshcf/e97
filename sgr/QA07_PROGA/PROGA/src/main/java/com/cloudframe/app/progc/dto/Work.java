package com.cloudframe.app.progc.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:28. using version 5.0.0.254
**/


import com.cloudframe.app.progc.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized {
   

								private int lsReturnCode;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of lsReturnCode
	 *	@return lsReturnCode
	 */
	public int getLsReturnCode() throws CFException {
       if (isLsReturnCodeModified()) { 
           lsReturnCode = refreshLsReturnCode();
        }
   		return lsReturnCode;
	}
	

	
	   
	/**
	 * 	Update LsReturnCode with the passed value
	 *  Corresponding COBOL Variable is LS-RETURN-CODE
	 *	@param number
	 */
	public void setLsReturnCode(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    lsReturnCode = checkLsReturnCodeMaxLimit(number); 
		serializeLsReturnCode(lsReturnCode);
	}
	

	public void setLsReturnCode(long number) {
	    number = checkLsReturnCodeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setLsReturnCode((int)number);
	}
	
	/**
	 * 	Update LsReturnCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsReturnCode(char[] value) throws CFException {
		 lsReturnCode = serializeLsReturnCode(value);
	}
	/**
	 * 	Update LsReturnCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsReturnCodeString(char[] value) throws CFException {
		 setLsReturnCode(value);
	}

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
