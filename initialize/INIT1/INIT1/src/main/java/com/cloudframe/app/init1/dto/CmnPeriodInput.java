package com.cloudframe.app.init1.dto;

/**
*  The class CmnPeriodInput is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnPeriodInput extends CmnPeriodInputSerialized { 
   

								private int cmnPeriodInputMm;

								private int cmnPeriodInputYy;
	
	/**
	* Constructor for CmnPeriodInput
	**/
    public CmnPeriodInput() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnPeriodInput. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnPeriodInput(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of cmnPeriodInputMm
	 *	@return cmnPeriodInputMm
	 */
	public int getCmnPeriodInputMm() throws CFException {
       if (isCmnPeriodInputMmModified()) { 
           cmnPeriodInputMm = refreshCmnPeriodInputMm();
        }
   		return cmnPeriodInputMm;
	}
	

	
	   
	/**
	 * 	Update CmnPeriodInputMm with the passed value
	 *  Corresponding COBOL Variable is CMN-PERIOD-INPUT-MM
	 *	@param number
	 */
	public void setCmnPeriodInputMm(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnPeriodInputMm = checkCmnPeriodInputMmMaxLimit(number); 
		serializeCmnPeriodInputMm(cmnPeriodInputMm);
	}
	

	public void setCmnPeriodInputMm(long number) {
	    number = checkCmnPeriodInputMmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCmnPeriodInputMm((int)number);
	}
	
	/**
	 * 	Update CmnPeriodInputMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnPeriodInputMm(char[] value) throws CFException {
		 cmnPeriodInputMm = serializeCmnPeriodInputMm(value);
	}
	/**
	 * 	Update CmnPeriodInputMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnPeriodInputMmString(char[] value) throws CFException {
		 setCmnPeriodInputMm(value);
	}
	/**
	 *	Returns the value of cmnPeriodInputYy
	 *	@return cmnPeriodInputYy
	 */
	public int getCmnPeriodInputYy() throws CFException {
       if (isCmnPeriodInputYyModified()) { 
           cmnPeriodInputYy = refreshCmnPeriodInputYy();
        }
   		return cmnPeriodInputYy;
	}
	

	
	   
	/**
	 * 	Update CmnPeriodInputYy with the passed value
	 *  Corresponding COBOL Variable is CMN-PERIOD-INPUT-YY
	 *	@param number
	 */
	public void setCmnPeriodInputYy(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnPeriodInputYy = checkCmnPeriodInputYyMaxLimit(number); 
		serializeCmnPeriodInputYy(cmnPeriodInputYy);
	}
	

	public void setCmnPeriodInputYy(long number) {
	    number = checkCmnPeriodInputYyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCmnPeriodInputYy((int)number);
	}
	
	/**
	 * 	Update CmnPeriodInputYy with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnPeriodInputYy(char[] value) throws CFException {
		 cmnPeriodInputYy = serializeCmnPeriodInputYy(value);
	}
	/**
	 * 	Update CmnPeriodInputYy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnPeriodInputYyString(char[] value) throws CFException {
		 setCmnPeriodInputYy(value);
	}

	
	
	

		public static int getCmnPeriodInputFieldLength() {
			return CMN_PERIOD_INPUT_LENGTH;
		}

}
  
