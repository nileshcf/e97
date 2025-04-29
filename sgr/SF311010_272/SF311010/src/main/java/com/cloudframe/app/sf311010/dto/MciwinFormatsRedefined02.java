package com.cloudframe.app.sf311010.dto;

/**
*  The class MciwinFormatsRedefined02 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:30. using version 5.0.0.254
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MciwinFormatsRedefined02 extends MciwinFormatsRedefined02Serialized { 
   

								private long mciwinYydddPacked;

	
	/**
	* Constructor for MciwinFormatsRedefined02
	**/
    public MciwinFormatsRedefined02() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MciwinFormatsRedefined02. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MciwinFormatsRedefined02(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	public long getMciwinYydddPacked() throws CFException {
        if (isMciwinYydddPackedModified()) { 
           mciwinYydddPacked = refreshMciwinYydddPacked();
        }
   		return mciwinYydddPacked;
	}
	
	/**
	 * 	Update MciwinYydddPacked with the passed value
	 *  Corresponding COBOL Variable is MCIWIN-YYDDD-PACKED
	 *	@param number
	 */
	public void setMciwinYydddPacked(long number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			mciwinYydddPacked = checkMciwinYydddPackedMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeMciwinYydddPacked(mciwinYydddPacked);
	}



	
	
	

		public static int getMciwinFormatsRedefined02FieldLength() {
			return MCIWIN_FORMATS_REDEFINED_02_LENGTH;
		}

}
  
