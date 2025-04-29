package com.cloudframe.app.sf320010.dto;

/**
*  The class Sf503RcTime is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:37. using version 5.0.0.254
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sf503RcTime extends Sf503RcTimeSerialized { 
   

								private int sf503RcTimeHh;

								private int sf503RcTimeMm;

								private int sf503RcTimeSs;
	
	/**
	* Constructor for Sf503RcTime
	**/
    public Sf503RcTime() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sf503RcTime. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503RcTime(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of sf503RcTimeHh
	 *	@return sf503RcTimeHh
	 */
	public int getSf503RcTimeHh() throws CFException {
        if (isSf503RcTimeHhModified()) { 
           sf503RcTimeHh = refreshSf503RcTimeHh();
        }
   		return sf503RcTimeHh;
	}
	
	/**
	 * 	Update Sf503RcTimeHh with the passed value
	 *  Corresponding COBOL Variable is SF503-RC-TIME-HH
	 *	@param number
	 */
	public void setSf503RcTimeHh(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sf503RcTimeHh = checkSf503RcTimeHhMaxLimit(number); 
		serializeSf503RcTimeHh(sf503RcTimeHh);
	}


	public void setSf503RcTimeHh(long number) {
	    number = checkSf503RcTimeHhMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSf503RcTimeHh((int)number);
	}
	
	/**
	 *	Returns the value of sf503RcTimeMm
	 *	@return sf503RcTimeMm
	 */
	public int getSf503RcTimeMm() throws CFException {
        if (isSf503RcTimeMmModified()) { 
           sf503RcTimeMm = refreshSf503RcTimeMm();
        }
   		return sf503RcTimeMm;
	}
	
	/**
	 * 	Update Sf503RcTimeMm with the passed value
	 *  Corresponding COBOL Variable is SF503-RC-TIME-MM
	 *	@param number
	 */
	public void setSf503RcTimeMm(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sf503RcTimeMm = checkSf503RcTimeMmMaxLimit(number); 
		serializeSf503RcTimeMm(sf503RcTimeMm);
	}


	public void setSf503RcTimeMm(long number) {
	    number = checkSf503RcTimeMmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSf503RcTimeMm((int)number);
	}
	
	/**
	 *	Returns the value of sf503RcTimeSs
	 *	@return sf503RcTimeSs
	 */
	public int getSf503RcTimeSs() throws CFException {
        if (isSf503RcTimeSsModified()) { 
           sf503RcTimeSs = refreshSf503RcTimeSs();
        }
   		return sf503RcTimeSs;
	}
	
	/**
	 * 	Update Sf503RcTimeSs with the passed value
	 *  Corresponding COBOL Variable is SF503-RC-TIME-SS
	 *	@param number
	 */
	public void setSf503RcTimeSs(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sf503RcTimeSs = checkSf503RcTimeSsMaxLimit(number); 
		serializeSf503RcTimeSs(sf503RcTimeSs);
	}


	public void setSf503RcTimeSs(long number) {
	    number = checkSf503RcTimeSsMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSf503RcTimeSs((int)number);
	}
	

	
	
	

		public static int getSf503RcTimeFieldLength() {
			return SF_503_RC_TIME_LENGTH;
		}

}
  
