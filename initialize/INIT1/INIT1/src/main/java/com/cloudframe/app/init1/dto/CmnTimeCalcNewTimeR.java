package com.cloudframe.app.init1.dto;

/**
*  The class CmnTimeCalcNewTimeR is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:55. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnTimeCalcNewTimeR extends CmnTimeCalcNewTimeRSerialized { 
   

								private int cmnTimeCalcNewTimeHh;

								private int cmnTimeCalcNewTimeMm;

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
	 *	Returns the value of cmnTimeCalcNewTimeHh
	 *	@return cmnTimeCalcNewTimeHh
	 */
	public int getCmnTimeCalcNewTimeHh() throws CFException {
       if (isCmnTimeCalcNewTimeHhModified()) { 
           cmnTimeCalcNewTimeHh = refreshCmnTimeCalcNewTimeHh();
        }
   		return cmnTimeCalcNewTimeHh;
	}
	

	
	   
	/**
	 * 	Update CmnTimeCalcNewTimeHh with the passed value
	 *  Corresponding COBOL Variable is CMN-TIME-CALC-NEW-TIME-HH
	 *	@param number
	 */
	public void setCmnTimeCalcNewTimeHh(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnTimeCalcNewTimeHh = checkCmnTimeCalcNewTimeHhMaxLimit(number); 
		serializeCmnTimeCalcNewTimeHh(cmnTimeCalcNewTimeHh);
	}
	

	public void setCmnTimeCalcNewTimeHh(long number) {
	    number = checkCmnTimeCalcNewTimeHhMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCmnTimeCalcNewTimeHh((int)number);
	}
	
	/**
	 * 	Update CmnTimeCalcNewTimeHh with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnTimeCalcNewTimeHh(char[] value) throws CFException {
		 cmnTimeCalcNewTimeHh = serializeCmnTimeCalcNewTimeHh(value);
	}
	/**
	 * 	Update CmnTimeCalcNewTimeHh with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnTimeCalcNewTimeHhString(char[] value) throws CFException {
		 setCmnTimeCalcNewTimeHh(value);
	}
	/**
	 *	Returns the value of cmnTimeCalcNewTimeMm
	 *	@return cmnTimeCalcNewTimeMm
	 */
	public int getCmnTimeCalcNewTimeMm() throws CFException {
       if (isCmnTimeCalcNewTimeMmModified()) { 
           cmnTimeCalcNewTimeMm = refreshCmnTimeCalcNewTimeMm();
        }
   		return cmnTimeCalcNewTimeMm;
	}
	

	
	   
	/**
	 * 	Update CmnTimeCalcNewTimeMm with the passed value
	 *  Corresponding COBOL Variable is CMN-TIME-CALC-NEW-TIME-MM
	 *	@param number
	 */
	public void setCmnTimeCalcNewTimeMm(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnTimeCalcNewTimeMm = checkCmnTimeCalcNewTimeMmMaxLimit(number); 
		serializeCmnTimeCalcNewTimeMm(cmnTimeCalcNewTimeMm);
	}
	

	public void setCmnTimeCalcNewTimeMm(long number) {
	    number = checkCmnTimeCalcNewTimeMmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCmnTimeCalcNewTimeMm((int)number);
	}
	
	/**
	 * 	Update CmnTimeCalcNewTimeMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnTimeCalcNewTimeMm(char[] value) throws CFException {
		 cmnTimeCalcNewTimeMm = serializeCmnTimeCalcNewTimeMm(value);
	}
	/**
	 * 	Update CmnTimeCalcNewTimeMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnTimeCalcNewTimeMmString(char[] value) throws CFException {
		 setCmnTimeCalcNewTimeMm(value);
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
  
