package com.cloudframe.app.mcwin.dto;

/**
*  The class MciwinFormats800Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/


import com.cloudframe.app.mcwin.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MciwinFormats800Redefined extends MciwinFormats800RedefinedSerialized { 
   

								private int mciwin2DigitYearPd800;

	
	/**
	* Constructor for MciwinFormats800Redefined
	**/
    public MciwinFormats800Redefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MciwinFormats800Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MciwinFormats800Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	public int getMciwin2DigitYearPd800() throws CFException {
        if (isMciwin2DigitYearPd800Modified()) { 
           mciwin2DigitYearPd800 = refreshMciwin2DigitYearPd800();
        }
   		return mciwin2DigitYearPd800;
	}
	
	/**
	 * 	Update Mciwin2DigitYearPd800 with the passed value
	 *  Corresponding COBOL Variable is 800-MCIWIN-2-DIGIT-YEAR-PD
	 *	@param number
	 */
	public void setMciwin2DigitYearPd800(int number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			mciwin2DigitYearPd800 = checkMciwin2DigitYearPd800MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeMciwin2DigitYearPd800(mciwin2DigitYearPd800);
	}


	public void setMciwin2DigitYearPd800(long number) {
	    number = checkMciwin2DigitYearPd800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setMciwin2DigitYearPd800((int)number);
	}
	

	
	
	

		public static int getMciwinFormats800RedefinedFieldLength() {
			return MCIWIN_FORMATS_800_REDEFINED_LENGTH;
		}

}
  
