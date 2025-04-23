package com.cloudframe.app.init1.dto;

/**
*  The class CmnDateCalcStartYyyy is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:56. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnDateCalcStartYyyy extends CmnDateCalcStartYyyySerialized { 
   

								private int cmnDateCalcStartCc;

								private int cmnDateCalcStartYy;
	
	/**
	* Constructor for CmnDateCalcStartYyyy
	**/
    public CmnDateCalcStartYyyy() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnDateCalcStartYyyy. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateCalcStartYyyy(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of cmnDateCalcStartCc
	 *	@return cmnDateCalcStartCc
	 */
	public int getCmnDateCalcStartCc() throws CFException {
       if (isCmnDateCalcStartCcModified()) { 
           cmnDateCalcStartCc = refreshCmnDateCalcStartCc();
        }
   		return cmnDateCalcStartCc;
	}
	

	
	   
	/**
	 * 	Update CmnDateCalcStartCc with the passed value
	 *  Corresponding COBOL Variable is CMN-DATE-CALC-START-CC
	 *	@param number
	 */
	public void setCmnDateCalcStartCc(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnDateCalcStartCc = checkCmnDateCalcStartCcMaxLimit(number); 
		serializeCmnDateCalcStartCc(cmnDateCalcStartCc);
	}
	

	public void setCmnDateCalcStartCc(long number) {
	    number = checkCmnDateCalcStartCcMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCmnDateCalcStartCc((int)number);
	}
	
	/**
	 * 	Update CmnDateCalcStartCc with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnDateCalcStartCc(char[] value) throws CFException {
		 cmnDateCalcStartCc = serializeCmnDateCalcStartCc(value);
	}
	/**
	 * 	Update CmnDateCalcStartCc with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnDateCalcStartCcString(char[] value) throws CFException {
		 setCmnDateCalcStartCc(value);
	}
	/**
	 *	Returns the value of cmnDateCalcStartYy
	 *	@return cmnDateCalcStartYy
	 */
	public int getCmnDateCalcStartYy() throws CFException {
       if (isCmnDateCalcStartYyModified()) { 
           cmnDateCalcStartYy = refreshCmnDateCalcStartYy();
        }
   		return cmnDateCalcStartYy;
	}
	

	
	   
	/**
	 * 	Update CmnDateCalcStartYy with the passed value
	 *  Corresponding COBOL Variable is CMN-DATE-CALC-START-YY
	 *	@param number
	 */
	public void setCmnDateCalcStartYy(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnDateCalcStartYy = checkCmnDateCalcStartYyMaxLimit(number); 
		serializeCmnDateCalcStartYy(cmnDateCalcStartYy);
	}
	

	public void setCmnDateCalcStartYy(long number) {
	    number = checkCmnDateCalcStartYyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCmnDateCalcStartYy((int)number);
	}
	
	/**
	 * 	Update CmnDateCalcStartYy with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnDateCalcStartYy(char[] value) throws CFException {
		 cmnDateCalcStartYy = serializeCmnDateCalcStartYy(value);
	}
	/**
	 * 	Update CmnDateCalcStartYy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnDateCalcStartYyString(char[] value) throws CFException {
		 setCmnDateCalcStartYy(value);
	}

	
	
	

		public static int getCmnDateCalcStartYyyyFieldLength() {
			return CMN_DATE_CALC_START_YYYY_LENGTH;
		}

}
  
