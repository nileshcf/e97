package com.cloudframe.app.sf320010.dto;

/**
*  The class Sf503RcDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:34. using version 5.0.0.254
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sf503RcDate extends Sf503RcDateSerialized { 
   

								private int sf503RcDateMm;

								private int sf503RcDateDd;

								private int sf503RcDateYy;
	
	/**
	* Constructor for Sf503RcDate
	**/
    public Sf503RcDate() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sf503RcDate. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503RcDate(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of sf503RcDateMm
	 *	@return sf503RcDateMm
	 */
	public int getSf503RcDateMm() throws CFException {
        if (isSf503RcDateMmModified()) { 
           sf503RcDateMm = refreshSf503RcDateMm();
        }
   		return sf503RcDateMm;
	}
	
	/**
	 * 	Update Sf503RcDateMm with the passed value
	 *  Corresponding COBOL Variable is SF503-RC-DATE-MM
	 *	@param number
	 */
	public void setSf503RcDateMm(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sf503RcDateMm = checkSf503RcDateMmMaxLimit(number); 
		serializeSf503RcDateMm(sf503RcDateMm);
	}


	public void setSf503RcDateMm(long number) {
	    number = checkSf503RcDateMmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSf503RcDateMm((int)number);
	}
	
	/**
	 *	Returns the value of sf503RcDateDd
	 *	@return sf503RcDateDd
	 */
	public int getSf503RcDateDd() throws CFException {
        if (isSf503RcDateDdModified()) { 
           sf503RcDateDd = refreshSf503RcDateDd();
        }
   		return sf503RcDateDd;
	}
	
	/**
	 * 	Update Sf503RcDateDd with the passed value
	 *  Corresponding COBOL Variable is SF503-RC-DATE-DD
	 *	@param number
	 */
	public void setSf503RcDateDd(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sf503RcDateDd = checkSf503RcDateDdMaxLimit(number); 
		serializeSf503RcDateDd(sf503RcDateDd);
	}


	public void setSf503RcDateDd(long number) {
	    number = checkSf503RcDateDdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSf503RcDateDd((int)number);
	}
	
	/**
	 *	Returns the value of sf503RcDateYy
	 *	@return sf503RcDateYy
	 */
	public int getSf503RcDateYy() throws CFException {
        if (isSf503RcDateYyModified()) { 
           sf503RcDateYy = refreshSf503RcDateYy();
        }
   		return sf503RcDateYy;
	}
	
	/**
	 * 	Update Sf503RcDateYy with the passed value
	 *  Corresponding COBOL Variable is SF503-RC-DATE-YY
	 *	@param number
	 */
	public void setSf503RcDateYy(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sf503RcDateYy = checkSf503RcDateYyMaxLimit(number); 
		serializeSf503RcDateYy(sf503RcDateYy);
	}


	public void setSf503RcDateYy(long number) {
	    number = checkSf503RcDateYyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSf503RcDateYy((int)number);
	}
	

	
	
	

		public static int getSf503RcDateFieldLength() {
			return SF_503_RC_DATE_LENGTH;
		}

}
  
