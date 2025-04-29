package com.cloudframe.app.init1.dto;

/**
*  The class CmnTimeCalcEndR is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:22. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnTimeCalcEndR extends CmnTimeCalcEndRSerialized { 
   

								private int cmnTimeCalcEndHh;

								private int cmnTimeCalcEndMm;

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
	 *	Returns the value of cmnTimeCalcEndHh
	 *	@return cmnTimeCalcEndHh
	 */
	public int getCmnTimeCalcEndHh() throws CFException {
       if (isCmnTimeCalcEndHhModified()) { 
           cmnTimeCalcEndHh = refreshCmnTimeCalcEndHh();
        }
   		return cmnTimeCalcEndHh;
	}
	

	
	   
	/**
	 * 	Update CmnTimeCalcEndHh with the passed value
	 *  Corresponding COBOL Variable is CMN-TIME-CALC-END-HH
	 *	@param number
	 */
	public void setCmnTimeCalcEndHh(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnTimeCalcEndHh = checkCmnTimeCalcEndHhMaxLimit(number); 
		serializeCmnTimeCalcEndHh(cmnTimeCalcEndHh);
	}
	

	public void setCmnTimeCalcEndHh(long number) {
	    number = checkCmnTimeCalcEndHhMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCmnTimeCalcEndHh((int)number);
	}
	
	/**
	 * 	Update CmnTimeCalcEndHh with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnTimeCalcEndHh(char[] value) throws CFException {
		 cmnTimeCalcEndHh = serializeCmnTimeCalcEndHh(value);
	}
	/**
	 * 	Update CmnTimeCalcEndHh with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnTimeCalcEndHhString(char[] value) throws CFException {
		 setCmnTimeCalcEndHh(value);
	}
	/**
	 *	Returns the value of cmnTimeCalcEndMm
	 *	@return cmnTimeCalcEndMm
	 */
	public int getCmnTimeCalcEndMm() throws CFException {
       if (isCmnTimeCalcEndMmModified()) { 
           cmnTimeCalcEndMm = refreshCmnTimeCalcEndMm();
        }
   		return cmnTimeCalcEndMm;
	}
	

	
	   
	/**
	 * 	Update CmnTimeCalcEndMm with the passed value
	 *  Corresponding COBOL Variable is CMN-TIME-CALC-END-MM
	 *	@param number
	 */
	public void setCmnTimeCalcEndMm(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnTimeCalcEndMm = checkCmnTimeCalcEndMmMaxLimit(number); 
		serializeCmnTimeCalcEndMm(cmnTimeCalcEndMm);
	}
	

	public void setCmnTimeCalcEndMm(long number) {
	    number = checkCmnTimeCalcEndMmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCmnTimeCalcEndMm((int)number);
	}
	
	/**
	 * 	Update CmnTimeCalcEndMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnTimeCalcEndMm(char[] value) throws CFException {
		 cmnTimeCalcEndMm = serializeCmnTimeCalcEndMm(value);
	}
	/**
	 * 	Update CmnTimeCalcEndMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnTimeCalcEndMmString(char[] value) throws CFException {
		 setCmnTimeCalcEndMm(value);
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
  
