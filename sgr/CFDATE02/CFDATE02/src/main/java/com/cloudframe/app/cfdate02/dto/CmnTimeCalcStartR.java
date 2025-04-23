package com.cloudframe.app.cfdate02.dto;

/**
*  The class CmnTimeCalcStartR is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/


import com.cloudframe.app.cfdate02.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnTimeCalcStartR extends CmnTimeCalcStartRSerialized { 
   

								private int cmnTimeCalcStartSs;
	
	/**
	* Constructor for CmnTimeCalcStartR
	**/
    public CmnTimeCalcStartR() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnTimeCalcStartR. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnTimeCalcStartR(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of cmnTimeCalcStartSs
	 *	@return cmnTimeCalcStartSs
	 */
	public int getCmnTimeCalcStartSs() throws CFException {
       if (isCmnTimeCalcStartSsModified()) { 
           cmnTimeCalcStartSs = refreshCmnTimeCalcStartSs();
        }
   		return cmnTimeCalcStartSs;
	}
	

	
	   
	/**
	 * 	Update CmnTimeCalcStartSs with the passed value
	 *  Corresponding COBOL Variable is CMN-TIME-CALC-START-SS
	 *	@param number
	 */
	public void setCmnTimeCalcStartSs(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnTimeCalcStartSs = checkCmnTimeCalcStartSsMaxLimit(number); 
		serializeCmnTimeCalcStartSs(cmnTimeCalcStartSs);
	}
	

	public void setCmnTimeCalcStartSs(long number) {
	    number = checkCmnTimeCalcStartSsMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCmnTimeCalcStartSs((int)number);
	}
	
	/**
	 * 	Update CmnTimeCalcStartSs with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnTimeCalcStartSs(char[] value) throws CFException {
		 cmnTimeCalcStartSs = serializeCmnTimeCalcStartSs(value);
	}
	/**
	 * 	Update CmnTimeCalcStartSs with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnTimeCalcStartSsString(char[] value) throws CFException {
		 setCmnTimeCalcStartSs(value);
	}

	
	
	

		public static int getCmnTimeCalcStartRFieldLength() {
			return CMN_TIME_CALC_START_R_LENGTH;
		}

}
  
