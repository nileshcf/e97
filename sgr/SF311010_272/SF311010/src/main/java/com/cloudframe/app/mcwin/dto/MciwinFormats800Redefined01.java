package com.cloudframe.app.mcwin.dto;

/**
*  The class MciwinFormats800Redefined01 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:27. using version 5.0.0.254
**/


import com.cloudframe.app.mcwin.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MciwinFormats800Redefined01 extends MciwinFormats800Redefined01Serialized { 
   

								private long mciwinYymmddPacked800;
	
	/**
	* Constructor for MciwinFormats800Redefined01
	**/
    public MciwinFormats800Redefined01() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MciwinFormats800Redefined01. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MciwinFormats800Redefined01(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	public long getMciwinYymmddPacked800() throws CFException {
        if (isMciwinYymmddPacked800Modified()) { 
           mciwinYymmddPacked800 = refreshMciwinYymmddPacked800();
        }
   		return mciwinYymmddPacked800;
	}
	
	/**
	 * 	Update MciwinYymmddPacked800 with the passed value
	 *  Corresponding COBOL Variable is 800-MCIWIN-YYMMDD-PACKED
	 *	@param number
	 */
	public void setMciwinYymmddPacked800(long number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			mciwinYymmddPacked800 = checkMciwinYymmddPacked800MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeMciwinYymmddPacked800(mciwinYymmddPacked800);
	}



	
	
	

		public static int getMciwinFormats800Redefined01FieldLength() {
			return MCIWIN_FORMATS_800_REDEFINED_01_LENGTH;
		}

}
  
