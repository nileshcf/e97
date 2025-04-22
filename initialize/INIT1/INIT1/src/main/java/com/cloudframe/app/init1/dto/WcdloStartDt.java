package com.cloudframe.app.init1.dto;

/**
*  The class WcdloStartDt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:05. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WcdloStartDt extends WcdloStartDtSerialized { 
   

								private int wcdloStartDtMm;


								private int wcdloStartDtDd;


								private int wcdloStartDtYyyy;
	
	/**
	* Constructor for WcdloStartDt
	**/
    public WcdloStartDt() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WcdloStartDt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcdloStartDt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wcdloStartDtMm
	 *	@return wcdloStartDtMm
	 */
	public int getWcdloStartDtMm() throws CFException {
       if (isWcdloStartDtMmModified()) { 
           wcdloStartDtMm = refreshWcdloStartDtMm();
        }
   		return wcdloStartDtMm;
	}
	

	
	   
	/**
	 * 	Update WcdloStartDtMm with the passed value
	 *  Corresponding COBOL Variable is WCDLO-START-DT-MM
	 *	@param number
	 */
	public void setWcdloStartDtMm(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    wcdloStartDtMm = checkWcdloStartDtMmMaxLimit(number); 
		serializeWcdloStartDtMm(wcdloStartDtMm);
	}
	

	public void setWcdloStartDtMm(long number) {
	    number = checkWcdloStartDtMmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWcdloStartDtMm((int)number);
	}
	
	/**
	 * 	Update WcdloStartDtMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setWcdloStartDtMm(char[] value) throws CFException {
		 wcdloStartDtMm = serializeWcdloStartDtMm(value);
	}
	/**
	 * 	Update WcdloStartDtMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWcdloStartDtMmString(char[] value) throws CFException {
		 setWcdloStartDtMm(value);
	}
	/**
	 *	Returns the value of wcdloStartDtDd
	 *	@return wcdloStartDtDd
	 */
	public int getWcdloStartDtDd() throws CFException {
       if (isWcdloStartDtDdModified()) { 
           wcdloStartDtDd = refreshWcdloStartDtDd();
        }
   		return wcdloStartDtDd;
	}
	

	
	   
	/**
	 * 	Update WcdloStartDtDd with the passed value
	 *  Corresponding COBOL Variable is WCDLO-START-DT-DD
	 *	@param number
	 */
	public void setWcdloStartDtDd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    wcdloStartDtDd = checkWcdloStartDtDdMaxLimit(number); 
		serializeWcdloStartDtDd(wcdloStartDtDd);
	}
	

	public void setWcdloStartDtDd(long number) {
	    number = checkWcdloStartDtDdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWcdloStartDtDd((int)number);
	}
	
	/**
	 * 	Update WcdloStartDtDd with the passed value
	 *	@param value (String or char[])
	 */
	public void setWcdloStartDtDd(char[] value) throws CFException {
		 wcdloStartDtDd = serializeWcdloStartDtDd(value);
	}
	/**
	 * 	Update WcdloStartDtDd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWcdloStartDtDdString(char[] value) throws CFException {
		 setWcdloStartDtDd(value);
	}
	/**
	 *	Returns the value of wcdloStartDtYyyy
	 *	@return wcdloStartDtYyyy
	 */
	public int getWcdloStartDtYyyy() throws CFException {
       if (isWcdloStartDtYyyyModified()) { 
           wcdloStartDtYyyy = refreshWcdloStartDtYyyy();
        }
   		return wcdloStartDtYyyy;
	}
	

	
	   
	/**
	 * 	Update WcdloStartDtYyyy with the passed value
	 *  Corresponding COBOL Variable is WCDLO-START-DT-YYYY
	 *	@param number
	 */
	public void setWcdloStartDtYyyy(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    wcdloStartDtYyyy = checkWcdloStartDtYyyyMaxLimit(number); 
		serializeWcdloStartDtYyyy(wcdloStartDtYyyy);
	}
	

	public void setWcdloStartDtYyyy(long number) {
	    number = checkWcdloStartDtYyyyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWcdloStartDtYyyy((int)number);
	}
	
	/**
	 * 	Update WcdloStartDtYyyy with the passed value
	 *	@param value (String or char[])
	 */
	public void setWcdloStartDtYyyy(char[] value) throws CFException {
		 wcdloStartDtYyyy = serializeWcdloStartDtYyyy(value);
	}
	/**
	 * 	Update WcdloStartDtYyyy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWcdloStartDtYyyyString(char[] value) throws CFException {
		 setWcdloStartDtYyyy(value);
	}

	
	
	
	/**
	 * 	initializes WcdloStartDt
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setWcdloStartDtMm(0);
                     setWcdloStartDtDd(0);
                     setWcdloStartDtYyyy(0);
   }

		public static int getWcdloStartDtFieldLength() {
			return WCDLO_START_DT_LENGTH;
		}

}
  
