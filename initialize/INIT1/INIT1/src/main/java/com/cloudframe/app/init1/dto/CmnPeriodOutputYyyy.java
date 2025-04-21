package com.cloudframe.app.init1.dto;

/**
*  The class CmnPeriodOutputYyyy is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:59. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnPeriodOutputYyyy extends CmnPeriodOutputYyyySerialized { 
   

								private int cmnPeriodOutputYy1;

								private int cmnPeriodOutputYy2;
	
	/**
	* Constructor for CmnPeriodOutputYyyy
	**/
    public CmnPeriodOutputYyyy() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnPeriodOutputYyyy. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnPeriodOutputYyyy(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of cmnPeriodOutputYy1
	 *	@return cmnPeriodOutputYy1
	 */
	public int getCmnPeriodOutputYy1() throws CFException {
       if (isCmnPeriodOutputYy1Modified()) { 
           cmnPeriodOutputYy1 = refreshCmnPeriodOutputYy1();
        }
   		return cmnPeriodOutputYy1;
	}
	

	
	   
	/**
	 * 	Update CmnPeriodOutputYy1 with the passed value
	 *  Corresponding COBOL Variable is CMN-PERIOD-OUTPUT-YY1
	 *	@param number
	 */
	public void setCmnPeriodOutputYy1(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnPeriodOutputYy1 = checkCmnPeriodOutputYy1MaxLimit(number); 
		serializeCmnPeriodOutputYy1(cmnPeriodOutputYy1);
	}
	

	public void setCmnPeriodOutputYy1(long number) {
	    number = checkCmnPeriodOutputYy1MaxLimit(number); // Truncate if value is beyond +/- Max range
		setCmnPeriodOutputYy1((int)number);
	}
	
	/**
	 * 	Update CmnPeriodOutputYy1 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnPeriodOutputYy1(char[] value) throws CFException {
		 cmnPeriodOutputYy1 = serializeCmnPeriodOutputYy1(value);
	}
	/**
	 * 	Update CmnPeriodOutputYy1 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnPeriodOutputYy1String(char[] value) throws CFException {
		 setCmnPeriodOutputYy1(value);
	}
	/**
	 *	Returns the value of cmnPeriodOutputYy2
	 *	@return cmnPeriodOutputYy2
	 */
	public int getCmnPeriodOutputYy2() throws CFException {
       if (isCmnPeriodOutputYy2Modified()) { 
           cmnPeriodOutputYy2 = refreshCmnPeriodOutputYy2();
        }
   		return cmnPeriodOutputYy2;
	}
	

	
	   
	/**
	 * 	Update CmnPeriodOutputYy2 with the passed value
	 *  Corresponding COBOL Variable is CMN-PERIOD-OUTPUT-YY2
	 *	@param number
	 */
	public void setCmnPeriodOutputYy2(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnPeriodOutputYy2 = checkCmnPeriodOutputYy2MaxLimit(number); 
		serializeCmnPeriodOutputYy2(cmnPeriodOutputYy2);
	}
	

	public void setCmnPeriodOutputYy2(long number) {
	    number = checkCmnPeriodOutputYy2MaxLimit(number); // Truncate if value is beyond +/- Max range
		setCmnPeriodOutputYy2((int)number);
	}
	
	/**
	 * 	Update CmnPeriodOutputYy2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnPeriodOutputYy2(char[] value) throws CFException {
		 cmnPeriodOutputYy2 = serializeCmnPeriodOutputYy2(value);
	}
	/**
	 * 	Update CmnPeriodOutputYy2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnPeriodOutputYy2String(char[] value) throws CFException {
		 setCmnPeriodOutputYy2(value);
	}

	
	
	

		public static int getCmnPeriodOutputYyyyFieldLength() {
			return CMN_PERIOD_OUTPUT_YYYY_LENGTH;
		}

}
  
