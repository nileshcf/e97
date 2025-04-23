package com.cloudframe.app.numeric0.dto;

/**
*  The class C586HbEqupSurchageOcc06 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:17. using version 5.0.0.254
**/


import com.cloudframe.app.numeric0.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;


public class C586HbEqupSurchageOcc06 extends C586HbEqupSurchageOcc06Serialized {
   

								private BigDecimal c586HbTotVzwSurchgAmt = BigDecimal.ZERO;

								private BigDecimal c586HbFusfRate = BigDecimal.ZERO;

								private BigDecimal c586HbRegulatoryCharg = BigDecimal.ZERO;

								private BigDecimal c586HbVzwAdminChgAmt = BigDecimal.ZERO;
	
	/**
	* Constructor for C586HbEqupSurchageOcc06
	**/
    public C586HbEqupSurchageOcc06() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of c586HbTotVzwSurchgAmt
	 *	@return c586HbTotVzwSurchgAmt
	 */
	public BigDecimal getC586HbTotVzwSurchgAmt() throws CFException {
       if (isC586HbTotVzwSurchgAmtModified()) { 
           c586HbTotVzwSurchgAmt = refreshC586HbTotVzwSurchgAmt();
        }
   		return c586HbTotVzwSurchgAmt;
	}
	

    /**
	 *	Returns the String value of c586HbTotVzwSurchgAmt
	 *	@return c586HbTotVzwSurchgAmt
	 */
	public char[]  getC586HbTotVzwSurchgAmtActualString() {
	    String value = String.valueOf(c586HbTotVzwSurchgAmt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update C586HbTotVzwSurchgAmt with the passed number
	 *  Corresponding COBOL Variable is C586-HB-TOT-VZW-SURCHG-AMT
	 *	@param number
	 */
	public void setC586HbTotVzwSurchgAmt(BigDecimal number) {
       c586HbTotVzwSurchgAmt = checkC586HbTotVzwSurchgAmtMaxLimit(number);
	    serializeC586HbTotVzwSurchgAmt(c586HbTotVzwSurchgAmt);
   }
	/**
	 * 	Update C586HbTotVzwSurchgAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setC586HbTotVzwSurchgAmt(char[] value) throws CFException {
		 c586HbTotVzwSurchgAmt = serializeC586HbTotVzwSurchgAmt(value);
	}   
	/**
	 *	Returns the value of c586HbFusfRate
	 *	@return c586HbFusfRate
	 */
	public BigDecimal getC586HbFusfRate() throws CFException {
       if (isC586HbFusfRateModified()) { 
           c586HbFusfRate = refreshC586HbFusfRate();
        }
   		return c586HbFusfRate;
	}
	

    /**
	 *	Returns the String value of c586HbFusfRate
	 *	@return c586HbFusfRate
	 */
	public char[]  getC586HbFusfRateActualString() {
	    String value = String.valueOf(c586HbFusfRate).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update C586HbFusfRate with the passed number
	 *  Corresponding COBOL Variable is C586-HB-FUSF-RATE
	 *	@param number
	 */
	public void setC586HbFusfRate(BigDecimal number) {
       c586HbFusfRate = checkC586HbFusfRateMaxLimit(number);
	    serializeC586HbFusfRate(c586HbFusfRate);
   }
	/**
	 * 	Update C586HbFusfRate with the passed value
	 *	@param value (String or char[])
	 */
	public void setC586HbFusfRate(char[] value) throws CFException {
		 c586HbFusfRate = serializeC586HbFusfRate(value);
	}   
	/**
	 *	Returns the value of c586HbRegulatoryCharg
	 *	@return c586HbRegulatoryCharg
	 */
	public BigDecimal getC586HbRegulatoryCharg() throws CFException {
       if (isC586HbRegulatoryChargModified()) { 
           c586HbRegulatoryCharg = refreshC586HbRegulatoryCharg();
        }
   		return c586HbRegulatoryCharg;
	}
	

    /**
	 *	Returns the String value of c586HbRegulatoryCharg
	 *	@return c586HbRegulatoryCharg
	 */
	public char[]  getC586HbRegulatoryChargActualString() {
	    String value = String.valueOf(c586HbRegulatoryCharg).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update C586HbRegulatoryCharg with the passed number
	 *  Corresponding COBOL Variable is C586-HB-REGULATORY-CHARG
	 *	@param number
	 */
	public void setC586HbRegulatoryCharg(BigDecimal number) {
       c586HbRegulatoryCharg = checkC586HbRegulatoryChargMaxLimit(number);
	    serializeC586HbRegulatoryCharg(c586HbRegulatoryCharg);
   }
	/**
	 * 	Update C586HbRegulatoryCharg with the passed value
	 *	@param value (String or char[])
	 */
	public void setC586HbRegulatoryCharg(char[] value) throws CFException {
		 c586HbRegulatoryCharg = serializeC586HbRegulatoryCharg(value);
	}   
	/**
	 *	Returns the value of c586HbVzwAdminChgAmt
	 *	@return c586HbVzwAdminChgAmt
	 */
	public BigDecimal getC586HbVzwAdminChgAmt() throws CFException {
       if (isC586HbVzwAdminChgAmtModified()) { 
           c586HbVzwAdminChgAmt = refreshC586HbVzwAdminChgAmt();
        }
   		return c586HbVzwAdminChgAmt;
	}
	

    /**
	 *	Returns the String value of c586HbVzwAdminChgAmt
	 *	@return c586HbVzwAdminChgAmt
	 */
	public char[]  getC586HbVzwAdminChgAmtActualString() {
	    String value = String.valueOf(c586HbVzwAdminChgAmt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update C586HbVzwAdminChgAmt with the passed number
	 *  Corresponding COBOL Variable is C586-HB-VZW-ADMIN-CHG-AMT
	 *	@param number
	 */
	public void setC586HbVzwAdminChgAmt(BigDecimal number) {
       c586HbVzwAdminChgAmt = checkC586HbVzwAdminChgAmtMaxLimit(number);
	    serializeC586HbVzwAdminChgAmt(c586HbVzwAdminChgAmt);
   }
	/**
	 * 	Update C586HbVzwAdminChgAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setC586HbVzwAdminChgAmt(char[] value) throws CFException {
		 c586HbVzwAdminChgAmt = serializeC586HbVzwAdminChgAmt(value);
	}   

	
	
	

		public static int getC586HbEqupSurchageOcc06FieldLength() {
			return C_586_HB_EQUP_SURCHAGE_OCC_06_LENGTH;
		}

}
  
