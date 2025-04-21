package com.cloudframe.app.init1.dto;

/**
*  The class CmnDateCalcNewDateYyyy is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:59. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnDateCalcNewDateYyyy extends CmnDateCalcNewDateYyyySerialized { 
   

								private int cmnDateCalcNewDateCc;

								private int cmnDateCalcNewDateYy;
	
	/**
	* Constructor for CmnDateCalcNewDateYyyy
	**/
    public CmnDateCalcNewDateYyyy() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnDateCalcNewDateYyyy. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateCalcNewDateYyyy(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of cmnDateCalcNewDateCc
	 *	@return cmnDateCalcNewDateCc
	 */
	public int getCmnDateCalcNewDateCc() throws CFException {
       if (isCmnDateCalcNewDateCcModified()) { 
           cmnDateCalcNewDateCc = refreshCmnDateCalcNewDateCc();
        }
   		return cmnDateCalcNewDateCc;
	}
	

	
	   
	/**
	 * 	Update CmnDateCalcNewDateCc with the passed value
	 *  Corresponding COBOL Variable is CMN-DATE-CALC-NEW-DATE-CC
	 *	@param number
	 */
	public void setCmnDateCalcNewDateCc(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnDateCalcNewDateCc = checkCmnDateCalcNewDateCcMaxLimit(number); 
		serializeCmnDateCalcNewDateCc(cmnDateCalcNewDateCc);
	}
	

	public void setCmnDateCalcNewDateCc(long number) {
	    number = checkCmnDateCalcNewDateCcMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCmnDateCalcNewDateCc((int)number);
	}
	
	/**
	 * 	Update CmnDateCalcNewDateCc with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnDateCalcNewDateCc(char[] value) throws CFException {
		 cmnDateCalcNewDateCc = serializeCmnDateCalcNewDateCc(value);
	}
	/**
	 * 	Update CmnDateCalcNewDateCc with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnDateCalcNewDateCcString(char[] value) throws CFException {
		 setCmnDateCalcNewDateCc(value);
	}
	/**
	 *	Returns the value of cmnDateCalcNewDateYy
	 *	@return cmnDateCalcNewDateYy
	 */
	public int getCmnDateCalcNewDateYy() throws CFException {
       if (isCmnDateCalcNewDateYyModified()) { 
           cmnDateCalcNewDateYy = refreshCmnDateCalcNewDateYy();
        }
   		return cmnDateCalcNewDateYy;
	}
	

	
	   
	/**
	 * 	Update CmnDateCalcNewDateYy with the passed value
	 *  Corresponding COBOL Variable is CMN-DATE-CALC-NEW-DATE-YY
	 *	@param number
	 */
	public void setCmnDateCalcNewDateYy(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnDateCalcNewDateYy = checkCmnDateCalcNewDateYyMaxLimit(number); 
		serializeCmnDateCalcNewDateYy(cmnDateCalcNewDateYy);
	}
	

	public void setCmnDateCalcNewDateYy(long number) {
	    number = checkCmnDateCalcNewDateYyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCmnDateCalcNewDateYy((int)number);
	}
	
	/**
	 * 	Update CmnDateCalcNewDateYy with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnDateCalcNewDateYy(char[] value) throws CFException {
		 cmnDateCalcNewDateYy = serializeCmnDateCalcNewDateYy(value);
	}
	/**
	 * 	Update CmnDateCalcNewDateYy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnDateCalcNewDateYyString(char[] value) throws CFException {
		 setCmnDateCalcNewDateYy(value);
	}

	
	
	

		public static int getCmnDateCalcNewDateYyyyFieldLength() {
			return CMN_DATE_CALC_NEW_DATE_YYYY_LENGTH;
		}

}
  
