package com.cloudframe.app.sf320010.dto;

/**
*  The class MciwinFormatsRedefined01 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:12. using version 5.0.0.254
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MciwinFormatsRedefined01 extends MciwinFormatsRedefined01Serialized { 
   

								private long mciwinYymmddPacked;
	
	/**
	* Constructor for MciwinFormatsRedefined01
	**/
    public MciwinFormatsRedefined01() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MciwinFormatsRedefined01. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MciwinFormatsRedefined01(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	public long getMciwinYymmddPacked() throws CFException {
        if (isMciwinYymmddPackedModified()) { 
           mciwinYymmddPacked = refreshMciwinYymmddPacked();
        }
   		return mciwinYymmddPacked;
	}
	
	/**
	 * 	Update MciwinYymmddPacked with the passed value
	 *  Corresponding COBOL Variable is MCIWIN-YYMMDD-PACKED
	 *	@param number
	 */
	public void setMciwinYymmddPacked(long number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			mciwinYymmddPacked = checkMciwinYymmddPackedMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeMciwinYymmddPacked(mciwinYymmddPacked);
	}



	
	
	

		public static int getMciwinFormatsRedefined01FieldLength() {
			return MCIWIN_FORMATS_REDEFINED_01_LENGTH;
		}

}
  
