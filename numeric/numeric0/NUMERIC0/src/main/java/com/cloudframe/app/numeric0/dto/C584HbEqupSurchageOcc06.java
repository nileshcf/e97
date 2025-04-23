package com.cloudframe.app.numeric0.dto;

/**
*  The class C584HbEqupSurchageOcc06 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:55. using version 5.0.0.254
**/


import com.cloudframe.app.numeric0.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;


public class C584HbEqupSurchageOcc06 extends C584HbEqupSurchageOcc06Serialized {
   

								private BigDecimal c584HbTotVzwSurchgAmt = BigDecimal.ZERO;

								private BigDecimal c584HbFusfRate = BigDecimal.ZERO;

								private BigDecimal c584HbRegulatoryCharg = BigDecimal.ZERO;

								private BigDecimal c584HbVzwAdminChgAmt = BigDecimal.ZERO;
	
	/**
	* Constructor for C584HbEqupSurchageOcc06
	**/
    public C584HbEqupSurchageOcc06() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of c584HbTotVzwSurchgAmt
	 *	@return c584HbTotVzwSurchgAmt
	 */
	public BigDecimal getC584HbTotVzwSurchgAmt() throws CFException {
       if (isC584HbTotVzwSurchgAmtModified()) { 
           c584HbTotVzwSurchgAmt = refreshC584HbTotVzwSurchgAmt();
        }
   		return c584HbTotVzwSurchgAmt;
	}
	

    /**
	 *	Returns the String value of c584HbTotVzwSurchgAmt
	 *	@return c584HbTotVzwSurchgAmt
	 */
	public char[]  getC584HbTotVzwSurchgAmtActualString() {
	    String value = String.valueOf(c584HbTotVzwSurchgAmt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update C584HbTotVzwSurchgAmt with the passed number
	 *  Corresponding COBOL Variable is C584-HB-TOT-VZW-SURCHG-AMT
	 *	@param number
	 */
	public void setC584HbTotVzwSurchgAmt(BigDecimal number) {
       c584HbTotVzwSurchgAmt = checkC584HbTotVzwSurchgAmtMaxLimit(number);
	    serializeC584HbTotVzwSurchgAmt(c584HbTotVzwSurchgAmt);
   }
	/**
	 * 	Update C584HbTotVzwSurchgAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setC584HbTotVzwSurchgAmt(char[] value) throws CFException {
		 c584HbTotVzwSurchgAmt = serializeC584HbTotVzwSurchgAmt(value);
	}   
	/**
	 *	Returns the value of c584HbFusfRate
	 *	@return c584HbFusfRate
	 */
	public BigDecimal getC584HbFusfRate() throws CFException {
       if (isC584HbFusfRateModified()) { 
           c584HbFusfRate = refreshC584HbFusfRate();
        }
   		return c584HbFusfRate;
	}
	

    /**
	 *	Returns the String value of c584HbFusfRate
	 *	@return c584HbFusfRate
	 */
	public char[]  getC584HbFusfRateActualString() {
	    String value = String.valueOf(c584HbFusfRate).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update C584HbFusfRate with the passed number
	 *  Corresponding COBOL Variable is C584-HB-FUSF-RATE
	 *	@param number
	 */
	public void setC584HbFusfRate(BigDecimal number) {
       c584HbFusfRate = checkC584HbFusfRateMaxLimit(number);
	    serializeC584HbFusfRate(c584HbFusfRate);
   }
	/**
	 * 	Update C584HbFusfRate with the passed value
	 *	@param value (String or char[])
	 */
	public void setC584HbFusfRate(char[] value) throws CFException {
		 c584HbFusfRate = serializeC584HbFusfRate(value);
	}   
	/**
	 *	Returns the value of c584HbRegulatoryCharg
	 *	@return c584HbRegulatoryCharg
	 */
	public BigDecimal getC584HbRegulatoryCharg() throws CFException {
       if (isC584HbRegulatoryChargModified()) { 
           c584HbRegulatoryCharg = refreshC584HbRegulatoryCharg();
        }
   		return c584HbRegulatoryCharg;
	}
	

    /**
	 *	Returns the String value of c584HbRegulatoryCharg
	 *	@return c584HbRegulatoryCharg
	 */
	public char[]  getC584HbRegulatoryChargActualString() {
	    String value = String.valueOf(c584HbRegulatoryCharg).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update C584HbRegulatoryCharg with the passed number
	 *  Corresponding COBOL Variable is C584-HB-REGULATORY-CHARG
	 *	@param number
	 */
	public void setC584HbRegulatoryCharg(BigDecimal number) {
       c584HbRegulatoryCharg = checkC584HbRegulatoryChargMaxLimit(number);
	    serializeC584HbRegulatoryCharg(c584HbRegulatoryCharg);
   }
	/**
	 * 	Update C584HbRegulatoryCharg with the passed value
	 *	@param value (String or char[])
	 */
	public void setC584HbRegulatoryCharg(char[] value) throws CFException {
		 c584HbRegulatoryCharg = serializeC584HbRegulatoryCharg(value);
	}   
	/**
	 *	Returns the value of c584HbVzwAdminChgAmt
	 *	@return c584HbVzwAdminChgAmt
	 */
	public BigDecimal getC584HbVzwAdminChgAmt() throws CFException {
       if (isC584HbVzwAdminChgAmtModified()) { 
           c584HbVzwAdminChgAmt = refreshC584HbVzwAdminChgAmt();
        }
   		return c584HbVzwAdminChgAmt;
	}
	

    /**
	 *	Returns the String value of c584HbVzwAdminChgAmt
	 *	@return c584HbVzwAdminChgAmt
	 */
	public char[]  getC584HbVzwAdminChgAmtActualString() {
	    String value = String.valueOf(c584HbVzwAdminChgAmt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update C584HbVzwAdminChgAmt with the passed number
	 *  Corresponding COBOL Variable is C584-HB-VZW-ADMIN-CHG-AMT
	 *	@param number
	 */
	public void setC584HbVzwAdminChgAmt(BigDecimal number) {
       c584HbVzwAdminChgAmt = checkC584HbVzwAdminChgAmtMaxLimit(number);
	    serializeC584HbVzwAdminChgAmt(c584HbVzwAdminChgAmt);
   }
	/**
	 * 	Update C584HbVzwAdminChgAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setC584HbVzwAdminChgAmt(char[] value) throws CFException {
		 c584HbVzwAdminChgAmt = serializeC584HbVzwAdminChgAmt(value);
	}   

	
	
	

		public static int getC584HbEqupSurchageOcc06FieldLength() {
			return C_584_HB_EQUP_SURCHAGE_OCC_06_LENGTH;
		}

}
  
