package com.cloudframe.app.init1.dto;

/**
*  The class StartDt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:52. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class StartDt extends StartDtSerialized { 
   

								private int startDtMm;


								private int startDtYyyy;
	
	/**
	* Constructor for StartDt
	**/
    public StartDt() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for StartDt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public StartDt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of startDtMm
	 *	@return startDtMm
	 */
	public int getStartDtMm() throws CFException {
       if (isStartDtMmModified()) { 
           startDtMm = refreshStartDtMm();
        }
   		return startDtMm;
	}
	

	
	   
	/**
	 * 	Update StartDtMm with the passed value
	 *  Corresponding COBOL Variable is WS-START-DT-MM
	 *	@param number
	 */
	public void setStartDtMm(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    startDtMm = checkStartDtMmMaxLimit(number); 
		serializeStartDtMm(startDtMm);
	}
	

	public void setStartDtMm(long number) {
	    number = checkStartDtMmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setStartDtMm((int)number);
	}
	
	/**
	 * 	Update StartDtMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setStartDtMm(char[] value) throws CFException {
		 startDtMm = serializeStartDtMm(value);
	}
	/**
	 * 	Update StartDtMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setStartDtMmString(char[] value) throws CFException {
		 setStartDtMm(value);
	}
	/**
	 *	Returns the value of startDtYyyy
	 *	@return startDtYyyy
	 */
	public int getStartDtYyyy() throws CFException {
       if (isStartDtYyyyModified()) { 
           startDtYyyy = refreshStartDtYyyy();
        }
   		return startDtYyyy;
	}
	

	
	   
	/**
	 * 	Update StartDtYyyy with the passed value
	 *  Corresponding COBOL Variable is WS-START-DT-YYYY
	 *	@param number
	 */
	public void setStartDtYyyy(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    startDtYyyy = checkStartDtYyyyMaxLimit(number); 
		serializeStartDtYyyy(startDtYyyy);
	}
	

	public void setStartDtYyyy(long number) {
	    number = checkStartDtYyyyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setStartDtYyyy((int)number);
	}
	
	/**
	 * 	Update StartDtYyyy with the passed value
	 *	@param value (String or char[])
	 */
	public void setStartDtYyyy(char[] value) throws CFException {
		 startDtYyyy = serializeStartDtYyyy(value);
	}
	/**
	 * 	Update StartDtYyyy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setStartDtYyyyString(char[] value) throws CFException {
		 setStartDtYyyy(value);
	}

	
	
	
	/**
	 * 	initializes StartDt
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setStartDtMm(0);
                     setStartDtYyyy(0);
   }

		public static int getStartDtFieldLength() {
			return START_DT_LENGTH;
		}

}
  
