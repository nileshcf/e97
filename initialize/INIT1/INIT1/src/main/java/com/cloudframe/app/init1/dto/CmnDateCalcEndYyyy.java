package com.cloudframe.app.init1.dto;

/**
*  The class CmnDateCalcEndYyyy is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnDateCalcEndYyyy extends CmnDateCalcEndYyyySerialized { 
   

								private int cmnDateCalcEndCc;

								private int cmnDateCalcEndYy;
	
	/**
	* Constructor for CmnDateCalcEndYyyy
	**/
    public CmnDateCalcEndYyyy() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnDateCalcEndYyyy. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateCalcEndYyyy(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of cmnDateCalcEndCc
	 *	@return cmnDateCalcEndCc
	 */
	public int getCmnDateCalcEndCc() throws CFException {
       if (isCmnDateCalcEndCcModified()) { 
           cmnDateCalcEndCc = refreshCmnDateCalcEndCc();
        }
   		return cmnDateCalcEndCc;
	}
	

	
	   
	/**
	 * 	Update CmnDateCalcEndCc with the passed value
	 *  Corresponding COBOL Variable is CMN-DATE-CALC-END-CC
	 *	@param number
	 */
	public void setCmnDateCalcEndCc(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnDateCalcEndCc = checkCmnDateCalcEndCcMaxLimit(number); 
		serializeCmnDateCalcEndCc(cmnDateCalcEndCc);
	}
	

	public void setCmnDateCalcEndCc(long number) {
	    number = checkCmnDateCalcEndCcMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCmnDateCalcEndCc((int)number);
	}
	
	/**
	 * 	Update CmnDateCalcEndCc with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnDateCalcEndCc(char[] value) throws CFException {
		 cmnDateCalcEndCc = serializeCmnDateCalcEndCc(value);
	}
	/**
	 * 	Update CmnDateCalcEndCc with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnDateCalcEndCcString(char[] value) throws CFException {
		 setCmnDateCalcEndCc(value);
	}
	/**
	 *	Returns the value of cmnDateCalcEndYy
	 *	@return cmnDateCalcEndYy
	 */
	public int getCmnDateCalcEndYy() throws CFException {
       if (isCmnDateCalcEndYyModified()) { 
           cmnDateCalcEndYy = refreshCmnDateCalcEndYy();
        }
   		return cmnDateCalcEndYy;
	}
	

	
	   
	/**
	 * 	Update CmnDateCalcEndYy with the passed value
	 *  Corresponding COBOL Variable is CMN-DATE-CALC-END-YY
	 *	@param number
	 */
	public void setCmnDateCalcEndYy(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnDateCalcEndYy = checkCmnDateCalcEndYyMaxLimit(number); 
		serializeCmnDateCalcEndYy(cmnDateCalcEndYy);
	}
	

	public void setCmnDateCalcEndYy(long number) {
	    number = checkCmnDateCalcEndYyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCmnDateCalcEndYy((int)number);
	}
	
	/**
	 * 	Update CmnDateCalcEndYy with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnDateCalcEndYy(char[] value) throws CFException {
		 cmnDateCalcEndYy = serializeCmnDateCalcEndYy(value);
	}
	/**
	 * 	Update CmnDateCalcEndYy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnDateCalcEndYyString(char[] value) throws CFException {
		 setCmnDateCalcEndYy(value);
	}

	
	
	

		public static int getCmnDateCalcEndYyyyFieldLength() {
			return CMN_DATE_CALC_END_YYYY_LENGTH;
		}

}
  
