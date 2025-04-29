package com.cloudframe.app.sf320010.dto;

/**
*  The class MciwinFormats is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:37. using version 5.0.0.254
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MciwinFormats extends MciwinFormatsSerialized { 
   

								private int mciwin2DigitYearZd;

	
	/**
	* Constructor for MciwinFormats
	**/
    public MciwinFormats() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MciwinFormats. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MciwinFormats(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setMciwin2DigitYearZd(0);
       replaceValue( // serialize and save the value
             fillHighValue(2)
             , getStartOffset() + 2
             ,2
             );
    } 

	/**
	 *	Returns the value of mciwin2DigitYearZd
	 *	@return mciwin2DigitYearZd
	 */
	public int getMciwin2DigitYearZd() throws CFException {
       if (isMciwin2DigitYearZdModified()) { 
           mciwin2DigitYearZd = refreshMciwin2DigitYearZd();
        }
   		return mciwin2DigitYearZd;
	}
	

	
	   
	/**
	 * 	Update Mciwin2DigitYearZd with the passed value
	 *  Corresponding COBOL Variable is MCIWIN-2-DIGIT-YEAR-ZD
	 *	@param number
	 */
	public void setMciwin2DigitYearZd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    mciwin2DigitYearZd = checkMciwin2DigitYearZdMaxLimit(number); 
		serializeMciwin2DigitYearZd(mciwin2DigitYearZd);
	}
	

	public void setMciwin2DigitYearZd(long number) {
	    number = checkMciwin2DigitYearZdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMciwin2DigitYearZd((int)number);
	}
	
	/**
	 * 	Update Mciwin2DigitYearZd with the passed value
	 *	@param value (String or char[])
	 */
	public void setMciwin2DigitYearZd(char[] value) throws CFException {
		 mciwin2DigitYearZd = serializeMciwin2DigitYearZd(value);
	}
	/**
	 * 	Update Mciwin2DigitYearZd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMciwin2DigitYearZdString(char[] value) throws CFException {
		 setMciwin2DigitYearZd(value);
	}

	
	
	

		public static int getMciwinFormatsFieldLength() {
			return MCIWIN_FORMATS_LENGTH;
		}

}
  
