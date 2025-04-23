package com.cloudframe.app.init1.dto;

/**
*  The class WcdloEndDt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WcdloEndDt extends WcdloEndDtSerialized { 
   

								private int wcdloEndDtMm;


								private int wcdloEndDtDd;


								private int wcdloEndDtYyyy;
	
	/**
	* Constructor for WcdloEndDt
	**/
    public WcdloEndDt() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WcdloEndDt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcdloEndDt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wcdloEndDtMm
	 *	@return wcdloEndDtMm
	 */
	public int getWcdloEndDtMm() throws CFException {
       if (isWcdloEndDtMmModified()) { 
           wcdloEndDtMm = refreshWcdloEndDtMm();
        }
   		return wcdloEndDtMm;
	}
	

	
	   
	/**
	 * 	Update WcdloEndDtMm with the passed value
	 *  Corresponding COBOL Variable is WCDLO-END-DT-MM
	 *	@param number
	 */
	public void setWcdloEndDtMm(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    wcdloEndDtMm = checkWcdloEndDtMmMaxLimit(number); 
		serializeWcdloEndDtMm(wcdloEndDtMm);
	}
	

	public void setWcdloEndDtMm(long number) {
	    number = checkWcdloEndDtMmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWcdloEndDtMm((int)number);
	}
	
	/**
	 * 	Update WcdloEndDtMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setWcdloEndDtMm(char[] value) throws CFException {
		 wcdloEndDtMm = serializeWcdloEndDtMm(value);
	}
	/**
	 * 	Update WcdloEndDtMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWcdloEndDtMmString(char[] value) throws CFException {
		 setWcdloEndDtMm(value);
	}
	/**
	 *	Returns the value of wcdloEndDtDd
	 *	@return wcdloEndDtDd
	 */
	public int getWcdloEndDtDd() throws CFException {
       if (isWcdloEndDtDdModified()) { 
           wcdloEndDtDd = refreshWcdloEndDtDd();
        }
   		return wcdloEndDtDd;
	}
	

	
	   
	/**
	 * 	Update WcdloEndDtDd with the passed value
	 *  Corresponding COBOL Variable is WCDLO-END-DT-DD
	 *	@param number
	 */
	public void setWcdloEndDtDd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    wcdloEndDtDd = checkWcdloEndDtDdMaxLimit(number); 
		serializeWcdloEndDtDd(wcdloEndDtDd);
	}
	

	public void setWcdloEndDtDd(long number) {
	    number = checkWcdloEndDtDdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWcdloEndDtDd((int)number);
	}
	
	/**
	 * 	Update WcdloEndDtDd with the passed value
	 *	@param value (String or char[])
	 */
	public void setWcdloEndDtDd(char[] value) throws CFException {
		 wcdloEndDtDd = serializeWcdloEndDtDd(value);
	}
	/**
	 * 	Update WcdloEndDtDd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWcdloEndDtDdString(char[] value) throws CFException {
		 setWcdloEndDtDd(value);
	}
	/**
	 *	Returns the value of wcdloEndDtYyyy
	 *	@return wcdloEndDtYyyy
	 */
	public int getWcdloEndDtYyyy() throws CFException {
       if (isWcdloEndDtYyyyModified()) { 
           wcdloEndDtYyyy = refreshWcdloEndDtYyyy();
        }
   		return wcdloEndDtYyyy;
	}
	

	
	   
	/**
	 * 	Update WcdloEndDtYyyy with the passed value
	 *  Corresponding COBOL Variable is WCDLO-END-DT-YYYY
	 *	@param number
	 */
	public void setWcdloEndDtYyyy(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    wcdloEndDtYyyy = checkWcdloEndDtYyyyMaxLimit(number); 
		serializeWcdloEndDtYyyy(wcdloEndDtYyyy);
	}
	

	public void setWcdloEndDtYyyy(long number) {
	    number = checkWcdloEndDtYyyyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWcdloEndDtYyyy((int)number);
	}
	
	/**
	 * 	Update WcdloEndDtYyyy with the passed value
	 *	@param value (String or char[])
	 */
	public void setWcdloEndDtYyyy(char[] value) throws CFException {
		 wcdloEndDtYyyy = serializeWcdloEndDtYyyy(value);
	}
	/**
	 * 	Update WcdloEndDtYyyy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWcdloEndDtYyyyString(char[] value) throws CFException {
		 setWcdloEndDtYyyy(value);
	}

	
	
	
	/**
	 * 	initializes WcdloEndDt
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setWcdloEndDtMm(0);
                     setWcdloEndDtDd(0);
                     setWcdloEndDtYyyy(0);
   }

		public static int getWcdloEndDtFieldLength() {
			return WCDLO_END_DT_LENGTH;
		}

}
  
