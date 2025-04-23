package com.cloudframe.app.sf311010.dto;

/**
*  The class MciwinFormatsRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:05. using version 5.0.0.254
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MciwinFormatsRedefined extends MciwinFormatsRedefinedSerialized { 
   

								private int mciwin2DigitYearPd;

	
	/**
	* Constructor for MciwinFormatsRedefined
	**/
    public MciwinFormatsRedefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MciwinFormatsRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MciwinFormatsRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	public int getMciwin2DigitYearPd() throws CFException {
        if (isMciwin2DigitYearPdModified()) { 
           mciwin2DigitYearPd = refreshMciwin2DigitYearPd();
        }
   		return mciwin2DigitYearPd;
	}
	
	/**
	 * 	Update Mciwin2DigitYearPd with the passed value
	 *  Corresponding COBOL Variable is MCIWIN-2-DIGIT-YEAR-PD
	 *	@param number
	 */
	public void setMciwin2DigitYearPd(int number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			mciwin2DigitYearPd = checkMciwin2DigitYearPdMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeMciwin2DigitYearPd(mciwin2DigitYearPd);
	}


	public void setMciwin2DigitYearPd(long number) {
	    number = checkMciwin2DigitYearPdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMciwin2DigitYearPd((int)number);
	}
	

	
	
	

		public static int getMciwinFormatsRedefinedFieldLength() {
			return MCIWIN_FORMATS_REDEFINED_LENGTH;
		}

}
  
