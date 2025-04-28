package com.cloudframe.app.ip200090.dto;

/**
*  The class ErrorMessage610 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:05. using version 5.0.0.256
**/


import com.cloudframe.app.ip200090.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class ErrorMessage610 extends ErrorMessage610Serialized { 
   


								private long editNumber610;
	
	/**
	* Constructor for ErrorMessage610
	**/
    public ErrorMessage610() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             "SYNTAX DRIVER IS CALLED FOR INVALID REQUIREMENT EDIT NUMBER : ".toCharArray()
             , getStartOffset() + 0
             ,62
             );
    }


 

	/**
	 *	Returns the value of editNumber610
	 *	@return editNumber610
	 */
	public long getEditNumber610() throws CFException {
       if (isEditNumber610Modified()) { 
           editNumber610 = refreshEditNumber610();
        }
   		return editNumber610;
	}
	

	
	   
	/**
	 * 	Update EditNumber610 with the passed value
	 *  Corresponding COBOL Variable is 610-EDIT-NUMBER
	 *	@param number
	 */
	public void setEditNumber610(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    editNumber610 = checkEditNumber610MaxLimit(number); 
		serializeEditNumber610(editNumber610);
	}
	

	/**
	 * 	Update EditNumber610 with the passed value
	 *	@param value (String or char[])
	 */
	public void setEditNumber610(char[] value) throws CFException {
		 editNumber610 = serializeEditNumber610(value);
	}
	/**
	 * 	Update EditNumber610 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setEditNumber610String(char[] value) throws CFException {
		 setEditNumber610(value);
	}

	
	
	

		public static int getErrorMessage610FieldLength() {
			return ERROR_MESSAGE_610_LENGTH;
		}

}
  
