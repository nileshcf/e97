package com.cloudframe.app.cfdate02.dto;

/**
*  The class CmnTimeCalcEndR is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:05. using version 5.0.0.256
**/


import com.cloudframe.app.cfdate02.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnTimeCalcEndR extends CmnTimeCalcEndRSerialized { 
   

								private int cmnTimeCalcEndSs;
	
	/**
	* Constructor for CmnTimeCalcEndR
	**/
    public CmnTimeCalcEndR() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnTimeCalcEndR. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnTimeCalcEndR(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of cmnTimeCalcEndSs
	 *	@return cmnTimeCalcEndSs
	 */
	public int getCmnTimeCalcEndSs() throws CFException {
       if (isCmnTimeCalcEndSsModified()) { 
           cmnTimeCalcEndSs = refreshCmnTimeCalcEndSs();
        }
   		return cmnTimeCalcEndSs;
	}
	

	
	   
	/**
	 * 	Update CmnTimeCalcEndSs with the passed value
	 *  Corresponding COBOL Variable is CMN-TIME-CALC-END-SS
	 *	@param number
	 */
	public void setCmnTimeCalcEndSs(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnTimeCalcEndSs = checkCmnTimeCalcEndSsMaxLimit(number); 
		serializeCmnTimeCalcEndSs(cmnTimeCalcEndSs);
	}
	

	public void setCmnTimeCalcEndSs(long number) {
	    number = checkCmnTimeCalcEndSsMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCmnTimeCalcEndSs((int)number);
	}
	
	/**
	 * 	Update CmnTimeCalcEndSs with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnTimeCalcEndSs(char[] value) throws CFException {
		 cmnTimeCalcEndSs = serializeCmnTimeCalcEndSs(value);
	}
	/**
	 * 	Update CmnTimeCalcEndSs with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnTimeCalcEndSsString(char[] value) throws CFException {
		 setCmnTimeCalcEndSs(value);
	}

	
	
	

		public static int getCmnTimeCalcEndRFieldLength() {
			return CMN_TIME_CALC_END_R_LENGTH;
		}

}
  
