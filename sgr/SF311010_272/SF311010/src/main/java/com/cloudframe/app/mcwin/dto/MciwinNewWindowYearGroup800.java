package com.cloudframe.app.mcwin.dto;

/**
*  The class MciwinNewWindowYearGroup800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:05. using version 5.0.0.254
**/


import com.cloudframe.app.mcwin.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class MciwinNewWindowYearGroup800 extends MciwinNewWindowYearGroup800Serialized {
   

								private int mciwinNewWindowYear800;
	
	/**
	* Constructor for MciwinNewWindowYearGroup800
	**/
    public MciwinNewWindowYearGroup800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setMciwinNewWindowYear800(50);
    }


 

	/**
	 *	Returns the value of mciwinNewWindowYear800
	 *	@return mciwinNewWindowYear800
	 */
	public int getMciwinNewWindowYear800() throws CFException {
       if (isMciwinNewWindowYear800Modified()) { 
           mciwinNewWindowYear800 = refreshMciwinNewWindowYear800();
        }
   		return mciwinNewWindowYear800;
	}
	

	
	   
	/**
	 * 	Update MciwinNewWindowYear800 with the passed value
	 *  Corresponding COBOL Variable is 800-MCIWIN-NEW-WINDOW-YEAR
	 *	@param number
	 */
	public void setMciwinNewWindowYear800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    mciwinNewWindowYear800 = checkMciwinNewWindowYear800MaxLimit(number); 
		serializeMciwinNewWindowYear800(mciwinNewWindowYear800);
	}
	

	public void setMciwinNewWindowYear800(long number) {
	    number = checkMciwinNewWindowYear800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setMciwinNewWindowYear800((int)number);
	}
	
	/**
	 * 	Update MciwinNewWindowYear800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMciwinNewWindowYear800(char[] value) throws CFException {
		 mciwinNewWindowYear800 = serializeMciwinNewWindowYear800(value);
	}
	/**
	 * 	Update MciwinNewWindowYear800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMciwinNewWindowYear800String(char[] value) throws CFException {
		 setMciwinNewWindowYear800(value);
	}

	
	
	

		public static int getMciwinNewWindowYearGroup800FieldLength() {
			return MCIWIN_NEW_WINDOW_YEAR_GROUP_800_LENGTH;
		}

}
  
