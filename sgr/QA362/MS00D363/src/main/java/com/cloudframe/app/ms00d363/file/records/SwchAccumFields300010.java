package com.cloudframe.app.ms00d363.file.records;

/**
*  The class SwchAccumFields300010 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


public class SwchAccumFields300010 extends SwchAccumFields300010Serialized { 
   

								private BigDecimal swchPaymentPartyAmt300010 = BigDecimal.ZERO;
	
	/**
	* Constructor for SwchAccumFields300010
	**/
    public SwchAccumFields300010() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SwchAccumFields300010. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SwchAccumFields300010(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	public BigDecimal getSwchPaymentPartyAmt300010() throws CFException {
        if (isSwchPaymentPartyAmt300010Modified()) { 
           swchPaymentPartyAmt300010 = refreshSwchPaymentPartyAmt300010();
        }
   		return swchPaymentPartyAmt300010;
	}

    public char[] getSwchPaymentPartyAmt300010String() {
          return  swchPaymentPartyAmt300010String();
    }
	
	/**
	 * 	Update SwchPaymentPartyAmt300010 with the passed number
	 *  Corresponding COBOL Variable is SWCH-PAYMENT-PARTY-AMT-300010
	 *	@param number
	 */
	public void setSwchPaymentPartyAmt300010(BigDecimal number) {	
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
     swchPaymentPartyAmt300010 = checkSwchPaymentPartyAmt300010MaxLimit(number);
	    serializeSwchPaymentPartyAmt300010(swchPaymentPartyAmt300010);
   }

	
	
	

		public static int getSwchAccumFields300010FieldLength() {
			return SWCH_ACCUM_FIELDS_300010_LENGTH;
		}

}
  
