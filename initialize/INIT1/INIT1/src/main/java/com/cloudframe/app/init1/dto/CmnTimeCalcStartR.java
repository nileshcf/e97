package com.cloudframe.app.init1.dto;

/**
*  The class CmnTimeCalcStartR is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:22. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnTimeCalcStartR extends CmnTimeCalcStartRSerialized { 
   

								private int cmnTimeCalcStartHh;

								private int cmnTimeCalcStartMm;

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
	 *	Returns the value of cmnTimeCalcStartHh
	 *	@return cmnTimeCalcStartHh
	 */
	public int getCmnTimeCalcStartHh() throws CFException {
       if (isCmnTimeCalcStartHhModified()) { 
           cmnTimeCalcStartHh = refreshCmnTimeCalcStartHh();
        }
   		return cmnTimeCalcStartHh;
	}
	

	
	   
	/**
	 * 	Update CmnTimeCalcStartHh with the passed value
	 *  Corresponding COBOL Variable is CMN-TIME-CALC-START-HH
	 *	@param number
	 */
	public void setCmnTimeCalcStartHh(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnTimeCalcStartHh = checkCmnTimeCalcStartHhMaxLimit(number); 
		serializeCmnTimeCalcStartHh(cmnTimeCalcStartHh);
	}
	

	public void setCmnTimeCalcStartHh(long number) {
	    number = checkCmnTimeCalcStartHhMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCmnTimeCalcStartHh((int)number);
	}
	
	/**
	 * 	Update CmnTimeCalcStartHh with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnTimeCalcStartHh(char[] value) throws CFException {
		 cmnTimeCalcStartHh = serializeCmnTimeCalcStartHh(value);
	}
	/**
	 * 	Update CmnTimeCalcStartHh with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnTimeCalcStartHhString(char[] value) throws CFException {
		 setCmnTimeCalcStartHh(value);
	}
	/**
	 *	Returns the value of cmnTimeCalcStartMm
	 *	@return cmnTimeCalcStartMm
	 */
	public int getCmnTimeCalcStartMm() throws CFException {
       if (isCmnTimeCalcStartMmModified()) { 
           cmnTimeCalcStartMm = refreshCmnTimeCalcStartMm();
        }
   		return cmnTimeCalcStartMm;
	}
	

	
	   
	/**
	 * 	Update CmnTimeCalcStartMm with the passed value
	 *  Corresponding COBOL Variable is CMN-TIME-CALC-START-MM
	 *	@param number
	 */
	public void setCmnTimeCalcStartMm(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnTimeCalcStartMm = checkCmnTimeCalcStartMmMaxLimit(number); 
		serializeCmnTimeCalcStartMm(cmnTimeCalcStartMm);
	}
	

	public void setCmnTimeCalcStartMm(long number) {
	    number = checkCmnTimeCalcStartMmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCmnTimeCalcStartMm((int)number);
	}
	
	/**
	 * 	Update CmnTimeCalcStartMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnTimeCalcStartMm(char[] value) throws CFException {
		 cmnTimeCalcStartMm = serializeCmnTimeCalcStartMm(value);
	}
	/**
	 * 	Update CmnTimeCalcStartMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnTimeCalcStartMmString(char[] value) throws CFException {
		 setCmnTimeCalcStartMm(value);
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
  
