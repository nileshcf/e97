package com.cloudframe.app.cfdate02.dto;

/**
*  The class CmnTimeCalcNewTimeR is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:10. using version 5.0.0.254
**/


import com.cloudframe.app.cfdate02.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnTimeCalcNewTimeR extends CmnTimeCalcNewTimeRSerialized { 
   

								private int cmnTimeCalcNewTimeSs;
	
	/**
	* Constructor for CmnTimeCalcNewTimeR
	**/
    public CmnTimeCalcNewTimeR() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnTimeCalcNewTimeR. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnTimeCalcNewTimeR(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of cmnTimeCalcNewTimeSs
	 *	@return cmnTimeCalcNewTimeSs
	 */
	public int getCmnTimeCalcNewTimeSs() throws CFException {
       if (isCmnTimeCalcNewTimeSsModified()) { 
           cmnTimeCalcNewTimeSs = refreshCmnTimeCalcNewTimeSs();
        }
   		return cmnTimeCalcNewTimeSs;
	}
	

	
	   
	/**
	 * 	Update CmnTimeCalcNewTimeSs with the passed value
	 *  Corresponding COBOL Variable is CMN-TIME-CALC-NEW-TIME-SS
	 *	@param number
	 */
	public void setCmnTimeCalcNewTimeSs(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnTimeCalcNewTimeSs = checkCmnTimeCalcNewTimeSsMaxLimit(number); 
		serializeCmnTimeCalcNewTimeSs(cmnTimeCalcNewTimeSs);
	}
	

	public void setCmnTimeCalcNewTimeSs(long number) {
	    number = checkCmnTimeCalcNewTimeSsMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCmnTimeCalcNewTimeSs((int)number);
	}
	
	/**
	 * 	Update CmnTimeCalcNewTimeSs with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnTimeCalcNewTimeSs(char[] value) throws CFException {
		 cmnTimeCalcNewTimeSs = serializeCmnTimeCalcNewTimeSs(value);
	}
	/**
	 * 	Update CmnTimeCalcNewTimeSs with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnTimeCalcNewTimeSsString(char[] value) throws CFException {
		 setCmnTimeCalcNewTimeSs(value);
	}

	
	
	

		public static int getCmnTimeCalcNewTimeRFieldLength() {
			return CMN_TIME_CALC_NEW_TIME_R_LENGTH;
		}

}
  
