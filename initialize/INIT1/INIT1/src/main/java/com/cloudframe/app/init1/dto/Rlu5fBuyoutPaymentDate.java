package com.cloudframe.app.init1.dto;

/**
*  The class Rlu5fBuyoutPaymentDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:13. using version 5.0.0.257
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Rlu5fBuyoutPaymentDate extends Rlu5fBuyoutPaymentDateSerialized { 
   

								private int rlu5fBuyoutOnDateMm;

								private int rlu5fBuyoutOnDateDd;

								private int rlu5fBuyoutOnDateCc;

								private int rlu5fBuyoutOnDateYy;
	
	/**
	* Constructor for Rlu5fBuyoutPaymentDate
	**/
    public Rlu5fBuyoutPaymentDate() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Rlu5fBuyoutPaymentDate. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Rlu5fBuyoutPaymentDate(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of rlu5fBuyoutOnDateMm
	 *	@return rlu5fBuyoutOnDateMm
	 */
	public int getRlu5fBuyoutOnDateMm() throws CFException {
       if (isRlu5fBuyoutOnDateMmModified()) { 
           rlu5fBuyoutOnDateMm = refreshRlu5fBuyoutOnDateMm();
        }
   		return rlu5fBuyoutOnDateMm;
	}
	

	
	   
	/**
	 * 	Update Rlu5fBuyoutOnDateMm with the passed value
	 *  Corresponding COBOL Variable is RLU5F-BUYOUT-ON-DATE-MM
	 *	@param number
	 */
	public void setRlu5fBuyoutOnDateMm(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    rlu5fBuyoutOnDateMm = checkRlu5fBuyoutOnDateMmMaxLimit(number); 
		serializeRlu5fBuyoutOnDateMm(rlu5fBuyoutOnDateMm);
	}
	

	public void setRlu5fBuyoutOnDateMm(long number) {
	    number = checkRlu5fBuyoutOnDateMmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setRlu5fBuyoutOnDateMm((int)number);
	}
	
	/**
	 * 	Update Rlu5fBuyoutOnDateMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setRlu5fBuyoutOnDateMm(char[] value) throws CFException {
		 rlu5fBuyoutOnDateMm = serializeRlu5fBuyoutOnDateMm(value);
	}
	/**
	 * 	Update Rlu5fBuyoutOnDateMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRlu5fBuyoutOnDateMmString(char[] value) throws CFException {
		 setRlu5fBuyoutOnDateMm(value);
	}
	/**
	 *	Returns the value of rlu5fBuyoutOnDateDd
	 *	@return rlu5fBuyoutOnDateDd
	 */
	public int getRlu5fBuyoutOnDateDd() throws CFException {
       if (isRlu5fBuyoutOnDateDdModified()) { 
           rlu5fBuyoutOnDateDd = refreshRlu5fBuyoutOnDateDd();
        }
   		return rlu5fBuyoutOnDateDd;
	}
	

	
	   
	/**
	 * 	Update Rlu5fBuyoutOnDateDd with the passed value
	 *  Corresponding COBOL Variable is RLU5F-BUYOUT-ON-DATE-DD
	 *	@param number
	 */
	public void setRlu5fBuyoutOnDateDd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    rlu5fBuyoutOnDateDd = checkRlu5fBuyoutOnDateDdMaxLimit(number); 
		serializeRlu5fBuyoutOnDateDd(rlu5fBuyoutOnDateDd);
	}
	

	public void setRlu5fBuyoutOnDateDd(long number) {
	    number = checkRlu5fBuyoutOnDateDdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setRlu5fBuyoutOnDateDd((int)number);
	}
	
	/**
	 * 	Update Rlu5fBuyoutOnDateDd with the passed value
	 *	@param value (String or char[])
	 */
	public void setRlu5fBuyoutOnDateDd(char[] value) throws CFException {
		 rlu5fBuyoutOnDateDd = serializeRlu5fBuyoutOnDateDd(value);
	}
	/**
	 * 	Update Rlu5fBuyoutOnDateDd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRlu5fBuyoutOnDateDdString(char[] value) throws CFException {
		 setRlu5fBuyoutOnDateDd(value);
	}
	/**
	 *	Returns the value of rlu5fBuyoutOnDateCc
	 *	@return rlu5fBuyoutOnDateCc
	 */
	public int getRlu5fBuyoutOnDateCc() throws CFException {
       if (isRlu5fBuyoutOnDateCcModified()) { 
           rlu5fBuyoutOnDateCc = refreshRlu5fBuyoutOnDateCc();
        }
   		return rlu5fBuyoutOnDateCc;
	}
	

	
	   
	/**
	 * 	Update Rlu5fBuyoutOnDateCc with the passed value
	 *  Corresponding COBOL Variable is RLU5F-BUYOUT-ON-DATE-CC
	 *	@param number
	 */
	public void setRlu5fBuyoutOnDateCc(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    rlu5fBuyoutOnDateCc = checkRlu5fBuyoutOnDateCcMaxLimit(number); 
		serializeRlu5fBuyoutOnDateCc(rlu5fBuyoutOnDateCc);
	}
	

	public void setRlu5fBuyoutOnDateCc(long number) {
	    number = checkRlu5fBuyoutOnDateCcMaxLimit(number); // Truncate if value is beyond +/- Max range
		setRlu5fBuyoutOnDateCc((int)number);
	}
	
	/**
	 * 	Update Rlu5fBuyoutOnDateCc with the passed value
	 *	@param value (String or char[])
	 */
	public void setRlu5fBuyoutOnDateCc(char[] value) throws CFException {
		 rlu5fBuyoutOnDateCc = serializeRlu5fBuyoutOnDateCc(value);
	}
	/**
	 * 	Update Rlu5fBuyoutOnDateCc with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRlu5fBuyoutOnDateCcString(char[] value) throws CFException {
		 setRlu5fBuyoutOnDateCc(value);
	}
	/**
	 *	Returns the value of rlu5fBuyoutOnDateYy
	 *	@return rlu5fBuyoutOnDateYy
	 */
	public int getRlu5fBuyoutOnDateYy() throws CFException {
       if (isRlu5fBuyoutOnDateYyModified()) { 
           rlu5fBuyoutOnDateYy = refreshRlu5fBuyoutOnDateYy();
        }
   		return rlu5fBuyoutOnDateYy;
	}
	

	
	   
	/**
	 * 	Update Rlu5fBuyoutOnDateYy with the passed value
	 *  Corresponding COBOL Variable is RLU5F-BUYOUT-ON-DATE-YY
	 *	@param number
	 */
	public void setRlu5fBuyoutOnDateYy(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    rlu5fBuyoutOnDateYy = checkRlu5fBuyoutOnDateYyMaxLimit(number); 
		serializeRlu5fBuyoutOnDateYy(rlu5fBuyoutOnDateYy);
	}
	

	public void setRlu5fBuyoutOnDateYy(long number) {
	    number = checkRlu5fBuyoutOnDateYyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setRlu5fBuyoutOnDateYy((int)number);
	}
	
	/**
	 * 	Update Rlu5fBuyoutOnDateYy with the passed value
	 *	@param value (String or char[])
	 */
	public void setRlu5fBuyoutOnDateYy(char[] value) throws CFException {
		 rlu5fBuyoutOnDateYy = serializeRlu5fBuyoutOnDateYy(value);
	}
	/**
	 * 	Update Rlu5fBuyoutOnDateYy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRlu5fBuyoutOnDateYyString(char[] value) throws CFException {
		 setRlu5fBuyoutOnDateYy(value);
	}

	
	
	
	/**
	 * 	initializes Rlu5fBuyoutPaymentDate
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setRlu5fBuyoutOnDateMm(0);
                     setRlu5fBuyoutOnDateDd(0);
                     setRlu5fBuyoutOnDateCc(0);
                     setRlu5fBuyoutOnDateYy(0);
   }

		public static int getRlu5fBuyoutPaymentDateFieldLength() {
			return RLU_5F_BUYOUT_PAYMENT_DATE_LENGTH;
		}

}
  
