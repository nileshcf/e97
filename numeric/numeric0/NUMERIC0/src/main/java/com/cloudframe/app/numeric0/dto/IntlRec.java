package com.cloudframe.app.numeric0.dto;

/**
*  The class IntlRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:53. using version 5.0.0.256
**/


import com.cloudframe.app.numeric0.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;


public class IntlRec extends IntlRecSerialized { 
   

								private BigDecimal intlRateAmount = BigDecimal.ZERO;
	
	/**
	* Constructor for IntlRec
	**/
    public IntlRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	public BigDecimal getIntlRateAmount() throws CFException {
        if (isIntlRateAmountModified()) { 
           intlRateAmount = refreshIntlRateAmount();
        }
   		return intlRateAmount;
	}

    public char[] getIntlRateAmountString() {
          return  intlRateAmountString();
    }
	
	/**
	 * 	Update IntlRateAmount with the passed number
	 *  Corresponding COBOL Variable is INTL-RATE-AMOUNT
	 *	@param number
	 */
	public void setIntlRateAmount(BigDecimal number) {	
     intlRateAmount = checkIntlRateAmountMaxLimit(number);
	    serializeIntlRateAmount(intlRateAmount);
   }

	
	
	

		public static int getIntlRecFieldLength() {
			return INTL_REC_LENGTH;
		}

}
  
