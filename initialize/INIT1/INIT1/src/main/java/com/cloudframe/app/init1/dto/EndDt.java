package com.cloudframe.app.init1.dto;

/**
*  The class EndDt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:22. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class EndDt extends EndDtSerialized { 
   

								private int endDtMm;


								private int endDtYyyy;
	
	/**
	* Constructor for EndDt
	**/
    public EndDt() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for EndDt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public EndDt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of endDtMm
	 *	@return endDtMm
	 */
	public int getEndDtMm() throws CFException {
       if (isEndDtMmModified()) { 
           endDtMm = refreshEndDtMm();
        }
   		return endDtMm;
	}
	

	
	   
	/**
	 * 	Update EndDtMm with the passed value
	 *  Corresponding COBOL Variable is WS-END-DT-MM
	 *	@param number
	 */
	public void setEndDtMm(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    endDtMm = checkEndDtMmMaxLimit(number); 
		serializeEndDtMm(endDtMm);
	}
	

	public void setEndDtMm(long number) {
	    number = checkEndDtMmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setEndDtMm((int)number);
	}
	
	/**
	 * 	Update EndDtMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setEndDtMm(char[] value) throws CFException {
		 endDtMm = serializeEndDtMm(value);
	}
	/**
	 * 	Update EndDtMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setEndDtMmString(char[] value) throws CFException {
		 setEndDtMm(value);
	}
	/**
	 *	Returns the value of endDtYyyy
	 *	@return endDtYyyy
	 */
	public int getEndDtYyyy() throws CFException {
       if (isEndDtYyyyModified()) { 
           endDtYyyy = refreshEndDtYyyy();
        }
   		return endDtYyyy;
	}
	

	
	   
	/**
	 * 	Update EndDtYyyy with the passed value
	 *  Corresponding COBOL Variable is WS-END-DT-YYYY
	 *	@param number
	 */
	public void setEndDtYyyy(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    endDtYyyy = checkEndDtYyyyMaxLimit(number); 
		serializeEndDtYyyy(endDtYyyy);
	}
	

	public void setEndDtYyyy(long number) {
	    number = checkEndDtYyyyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setEndDtYyyy((int)number);
	}
	
	/**
	 * 	Update EndDtYyyy with the passed value
	 *	@param value (String or char[])
	 */
	public void setEndDtYyyy(char[] value) throws CFException {
		 endDtYyyy = serializeEndDtYyyy(value);
	}
	/**
	 * 	Update EndDtYyyy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setEndDtYyyyString(char[] value) throws CFException {
		 setEndDtYyyy(value);
	}

	
	
	
	/**
	 * 	initializes EndDt
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setEndDtMm(0);
                     setEndDtYyyy(0);
   }

		public static int getEndDtFieldLength() {
			return END_DT_LENGTH;
		}

}
  
