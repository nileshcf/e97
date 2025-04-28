package com.cloudframe.app.mcwin.dto;

/**
*  The class MciwinFormats800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:05. using version 5.0.0.256
**/


import com.cloudframe.app.mcwin.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MciwinFormats800 extends MciwinFormats800Serialized { 
   

								private int mciwin2DigitYearZd800;

	
	/**
	* Constructor for MciwinFormats800
	**/
    public MciwinFormats800() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MciwinFormats800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MciwinFormats800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setMciwin2DigitYearZd800(0);
       replaceValue( // serialize and save the value
             fillHighValue(2)
             , getStartOffset() + 2
             ,2
             );
    } 

	/**
	 *	Returns the value of mciwin2DigitYearZd800
	 *	@return mciwin2DigitYearZd800
	 */
	public int getMciwin2DigitYearZd800() throws CFException {
       if (isMciwin2DigitYearZd800Modified()) { 
           mciwin2DigitYearZd800 = refreshMciwin2DigitYearZd800();
        }
   		return mciwin2DigitYearZd800;
	}
	

	
	   
	/**
	 * 	Update Mciwin2DigitYearZd800 with the passed value
	 *  Corresponding COBOL Variable is 800-MCIWIN-2-DIGIT-YEAR-ZD
	 *	@param number
	 */
	public void setMciwin2DigitYearZd800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    mciwin2DigitYearZd800 = checkMciwin2DigitYearZd800MaxLimit(number); 
		serializeMciwin2DigitYearZd800(mciwin2DigitYearZd800);
	}
	

	public void setMciwin2DigitYearZd800(long number) {
	    number = checkMciwin2DigitYearZd800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setMciwin2DigitYearZd800((int)number);
	}
	
	/**
	 * 	Update Mciwin2DigitYearZd800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMciwin2DigitYearZd800(char[] value) throws CFException {
		 mciwin2DigitYearZd800 = serializeMciwin2DigitYearZd800(value);
	}
	/**
	 * 	Update Mciwin2DigitYearZd800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMciwin2DigitYearZd800String(char[] value) throws CFException {
		 setMciwin2DigitYearZd800(value);
	}

	
	
	

		public static int getMciwinFormats800FieldLength() {
			return MCIWIN_FORMATS_800_LENGTH;
		}

}
  
