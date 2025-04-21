package com.cloudframe.app.sf327010.dto;

/**
*  The class EojMessage6009999 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:59. using version 5.0.0.256
**/


import com.cloudframe.app.sf327010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class EojMessage6009999 extends EojMessage6009999Serialized {
   


								private int returnCode6009999;
	
	/**
	* Constructor for EojMessage6009999
	**/
    public EojMessage6009999() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             (" SF327010-9999 END OF STEP, CONDITION CODE = ").toCharArray()
             , getStartOffset() + 0
             ,45
             );
								setReturnCode6009999(0);
    }


 

	/**
	 *	Returns the value of returnCode6009999
	 *	@return returnCode6009999
	 */
	public int getReturnCode6009999() throws CFException {
       if (isReturnCode6009999Modified()) { 
           returnCode6009999 = refreshReturnCode6009999();
        }
   		return returnCode6009999;
	}
	

	
	   
	/**
	 * 	Update ReturnCode6009999 with the passed value
	 *  Corresponding COBOL Variable is 600-9999-RETURN-CODE
	 *	@param number
	 */
	public void setReturnCode6009999(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    returnCode6009999 = checkReturnCode6009999MaxLimit(number); 
		serializeReturnCode6009999(returnCode6009999);
	}
	

	public void setReturnCode6009999(long number) {
	    number = checkReturnCode6009999MaxLimit(number); // Truncate if value is beyond +/- Max range
		setReturnCode6009999((int)number);
	}
	
	/**
	 * 	Update ReturnCode6009999 with the passed value
	 *	@param value (String or char[])
	 */
	public void setReturnCode6009999(char[] value) throws CFException {
		 returnCode6009999 = serializeReturnCode6009999(value);
	}
	/**
	 * 	Update ReturnCode6009999 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setReturnCode6009999String(char[] value) throws CFException {
		 setReturnCode6009999(value);
	}

	
	
	

		public static int getEojMessage6009999FieldLength() {
			return EOJ_MESSAGE_6009999_LENGTH;
		}

}
  
