package com.cloudframe.app.sf320010.dto;

/**
*  The class Sf503PsTimeInSystem is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:29. using version 5.0.0.257
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sf503PsTimeInSystem extends Sf503PsTimeInSystemSerialized { 
   

								private int sf503PsTimeInSystemHh;

								private int sf503PsTimeInSystemMm;

								private int sf503PsTimeInSystemSs;
	
	/**
	* Constructor for Sf503PsTimeInSystem
	**/
    public Sf503PsTimeInSystem() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sf503PsTimeInSystem. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503PsTimeInSystem(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of sf503PsTimeInSystemHh
	 *	@return sf503PsTimeInSystemHh
	 */
	public int getSf503PsTimeInSystemHh() throws CFException {
        if (isSf503PsTimeInSystemHhModified()) { 
           sf503PsTimeInSystemHh = refreshSf503PsTimeInSystemHh();
        }
   		return sf503PsTimeInSystemHh;
	}
	
	/**
	 * 	Update Sf503PsTimeInSystemHh with the passed value
	 *  Corresponding COBOL Variable is SF503-PS-TIME-IN-SYSTEM-HH
	 *	@param number
	 */
	public void setSf503PsTimeInSystemHh(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sf503PsTimeInSystemHh = checkSf503PsTimeInSystemHhMaxLimit(number); 
		serializeSf503PsTimeInSystemHh(sf503PsTimeInSystemHh);
	}


	public void setSf503PsTimeInSystemHh(long number) {
	    number = checkSf503PsTimeInSystemHhMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSf503PsTimeInSystemHh((int)number);
	}
	
	/**
	 *	Returns the value of sf503PsTimeInSystemMm
	 *	@return sf503PsTimeInSystemMm
	 */
	public int getSf503PsTimeInSystemMm() throws CFException {
        if (isSf503PsTimeInSystemMmModified()) { 
           sf503PsTimeInSystemMm = refreshSf503PsTimeInSystemMm();
        }
   		return sf503PsTimeInSystemMm;
	}
	
	/**
	 * 	Update Sf503PsTimeInSystemMm with the passed value
	 *  Corresponding COBOL Variable is SF503-PS-TIME-IN-SYSTEM-MM
	 *	@param number
	 */
	public void setSf503PsTimeInSystemMm(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sf503PsTimeInSystemMm = checkSf503PsTimeInSystemMmMaxLimit(number); 
		serializeSf503PsTimeInSystemMm(sf503PsTimeInSystemMm);
	}


	public void setSf503PsTimeInSystemMm(long number) {
	    number = checkSf503PsTimeInSystemMmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSf503PsTimeInSystemMm((int)number);
	}
	
	/**
	 *	Returns the value of sf503PsTimeInSystemSs
	 *	@return sf503PsTimeInSystemSs
	 */
	public int getSf503PsTimeInSystemSs() throws CFException {
        if (isSf503PsTimeInSystemSsModified()) { 
           sf503PsTimeInSystemSs = refreshSf503PsTimeInSystemSs();
        }
   		return sf503PsTimeInSystemSs;
	}
	
	/**
	 * 	Update Sf503PsTimeInSystemSs with the passed value
	 *  Corresponding COBOL Variable is SF503-PS-TIME-IN-SYSTEM-SS
	 *	@param number
	 */
	public void setSf503PsTimeInSystemSs(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sf503PsTimeInSystemSs = checkSf503PsTimeInSystemSsMaxLimit(number); 
		serializeSf503PsTimeInSystemSs(sf503PsTimeInSystemSs);
	}


	public void setSf503PsTimeInSystemSs(long number) {
	    number = checkSf503PsTimeInSystemSsMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSf503PsTimeInSystemSs((int)number);
	}
	

	
	
	

		public static int getSf503PsTimeInSystemFieldLength() {
			return SF_503_PS_TIME_IN_SYSTEM_LENGTH;
		}

}
  
