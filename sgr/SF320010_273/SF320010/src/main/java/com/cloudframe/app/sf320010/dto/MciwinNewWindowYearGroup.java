package com.cloudframe.app.sf320010.dto;

/**
*  The class MciwinNewWindowYearGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:45. using version 5.0.0.254
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class MciwinNewWindowYearGroup extends MciwinNewWindowYearGroupSerialized { 
   

								private int mciwinNewWindowYear;
	
	/**
	* Constructor for MciwinNewWindowYearGroup
	**/
    public MciwinNewWindowYearGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setMciwinNewWindowYear(50);
    }


 

	/**
	 *	Returns the value of mciwinNewWindowYear
	 *	@return mciwinNewWindowYear
	 */
	public int getMciwinNewWindowYear() throws CFException {
       if (isMciwinNewWindowYearModified()) { 
           mciwinNewWindowYear = refreshMciwinNewWindowYear();
        }
   		return mciwinNewWindowYear;
	}
	

	
	   
	/**
	 * 	Update MciwinNewWindowYear with the passed value
	 *  Corresponding COBOL Variable is MCIWIN-NEW-WINDOW-YEAR
	 *	@param number
	 */
	public void setMciwinNewWindowYear(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    mciwinNewWindowYear = checkMciwinNewWindowYearMaxLimit(number); 
		serializeMciwinNewWindowYear(mciwinNewWindowYear);
	}
	

	public void setMciwinNewWindowYear(long number) {
	    number = checkMciwinNewWindowYearMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMciwinNewWindowYear((int)number);
	}
	
	/**
	 * 	Update MciwinNewWindowYear with the passed value
	 *	@param value (String or char[])
	 */
	public void setMciwinNewWindowYear(char[] value) throws CFException {
		 mciwinNewWindowYear = serializeMciwinNewWindowYear(value);
	}
	/**
	 * 	Update MciwinNewWindowYear with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMciwinNewWindowYearString(char[] value) throws CFException {
		 setMciwinNewWindowYear(value);
	}

	
	
	

		public static int getMciwinNewWindowYearGroupFieldLength() {
			return MCIWIN_NEW_WINDOW_YEAR_GROUP_LENGTH;
		}

}
  
