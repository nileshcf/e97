package com.cloudframe.app.init1.dto;

/**
*  The class CmnNumTime is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnNumTime extends CmnNumTimeSerialized { 
   

								private int cmnNumTimeHh;

								private int cmnNumTimeMm;

								private int cmnNumTimeSs;
	
	/**
	* Constructor for CmnNumTime
	**/
    public CmnNumTime() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnNumTime. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnNumTime(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of cmnNumTimeHh
	 *	@return cmnNumTimeHh
	 */
	public int getCmnNumTimeHh() throws CFException {
       if (isCmnNumTimeHhModified()) { 
           cmnNumTimeHh = refreshCmnNumTimeHh();
        }
   		return cmnNumTimeHh;
	}
	

	
	   
	/**
	 * 	Update CmnNumTimeHh with the passed value
	 *  Corresponding COBOL Variable is CMN-NUM-TIME-HH
	 *	@param number
	 */
	public void setCmnNumTimeHh(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnNumTimeHh = checkCmnNumTimeHhMaxLimit(number); 
		serializeCmnNumTimeHh(cmnNumTimeHh);
	}
	

	public void setCmnNumTimeHh(long number) {
	    number = checkCmnNumTimeHhMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCmnNumTimeHh((int)number);
	}
	
	/**
	 * 	Update CmnNumTimeHh with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnNumTimeHh(char[] value) throws CFException {
		 cmnNumTimeHh = serializeCmnNumTimeHh(value);
	}
	/**
	 * 	Update CmnNumTimeHh with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnNumTimeHhString(char[] value) throws CFException {
		 setCmnNumTimeHh(value);
	}
	/**
	 *	Returns the value of cmnNumTimeMm
	 *	@return cmnNumTimeMm
	 */
	public int getCmnNumTimeMm() throws CFException {
       if (isCmnNumTimeMmModified()) { 
           cmnNumTimeMm = refreshCmnNumTimeMm();
        }
   		return cmnNumTimeMm;
	}
	

	
	   
	/**
	 * 	Update CmnNumTimeMm with the passed value
	 *  Corresponding COBOL Variable is CMN-NUM-TIME-MM
	 *	@param number
	 */
	public void setCmnNumTimeMm(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnNumTimeMm = checkCmnNumTimeMmMaxLimit(number); 
		serializeCmnNumTimeMm(cmnNumTimeMm);
	}
	

	public void setCmnNumTimeMm(long number) {
	    number = checkCmnNumTimeMmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCmnNumTimeMm((int)number);
	}
	
	/**
	 * 	Update CmnNumTimeMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnNumTimeMm(char[] value) throws CFException {
		 cmnNumTimeMm = serializeCmnNumTimeMm(value);
	}
	/**
	 * 	Update CmnNumTimeMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnNumTimeMmString(char[] value) throws CFException {
		 setCmnNumTimeMm(value);
	}
	/**
	 *	Returns the value of cmnNumTimeSs
	 *	@return cmnNumTimeSs
	 */
	public int getCmnNumTimeSs() throws CFException {
       if (isCmnNumTimeSsModified()) { 
           cmnNumTimeSs = refreshCmnNumTimeSs();
        }
   		return cmnNumTimeSs;
	}
	

	
	   
	/**
	 * 	Update CmnNumTimeSs with the passed value
	 *  Corresponding COBOL Variable is CMN-NUM-TIME-SS
	 *	@param number
	 */
	public void setCmnNumTimeSs(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnNumTimeSs = checkCmnNumTimeSsMaxLimit(number); 
		serializeCmnNumTimeSs(cmnNumTimeSs);
	}
	

	public void setCmnNumTimeSs(long number) {
	    number = checkCmnNumTimeSsMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCmnNumTimeSs((int)number);
	}
	
	/**
	 * 	Update CmnNumTimeSs with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnNumTimeSs(char[] value) throws CFException {
		 cmnNumTimeSs = serializeCmnNumTimeSs(value);
	}
	/**
	 * 	Update CmnNumTimeSs with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnNumTimeSsString(char[] value) throws CFException {
		 setCmnNumTimeSs(value);
	}

	
	
	

		public static int getCmnNumTimeFieldLength() {
			return CMN_NUM_TIME_LENGTH;
		}

}
  
