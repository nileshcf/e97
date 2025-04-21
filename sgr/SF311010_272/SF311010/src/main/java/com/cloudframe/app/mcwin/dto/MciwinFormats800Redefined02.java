package com.cloudframe.app.mcwin.dto;

/**
*  The class MciwinFormats800Redefined02 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:07. using version 5.0.0.256
**/


import com.cloudframe.app.mcwin.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MciwinFormats800Redefined02 extends MciwinFormats800Redefined02Serialized { 
   

								private long mciwinYydddPacked800;

	
	/**
	* Constructor for MciwinFormats800Redefined02
	**/
    public MciwinFormats800Redefined02() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MciwinFormats800Redefined02. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MciwinFormats800Redefined02(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	public long getMciwinYydddPacked800() throws CFException {
        if (isMciwinYydddPacked800Modified()) { 
           mciwinYydddPacked800 = refreshMciwinYydddPacked800();
        }
   		return mciwinYydddPacked800;
	}
	
	/**
	 * 	Update MciwinYydddPacked800 with the passed value
	 *  Corresponding COBOL Variable is 800-MCIWIN-YYDDD-PACKED
	 *	@param number
	 */
	public void setMciwinYydddPacked800(long number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			mciwinYydddPacked800 = checkMciwinYydddPacked800MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeMciwinYydddPacked800(mciwinYydddPacked800);
	}



	
	
	

		public static int getMciwinFormats800Redefined02FieldLength() {
			return MCIWIN_FORMATS_800_REDEFINED_02_LENGTH;
		}

}
  
