package com.cloudframe.app.numeric0.dto;

/**
*  The class C585HbEqupSurchageOcc06 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:04. using version 5.0.0.254
**/


import com.cloudframe.app.numeric0.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;


public class C585HbEqupSurchageOcc06 extends C585HbEqupSurchageOcc06Serialized {
   

								private BigDecimal c585HbTotVzwSurchgAmt = BigDecimal.ZERO;

								private BigDecimal c585HbFusfRate = BigDecimal.ZERO;

								private BigDecimal c585HbRegulatoryCharg = BigDecimal.ZERO;

								private BigDecimal c585HbVzwAdminChgAmt = BigDecimal.ZERO;
	
	/**
	* Constructor for C585HbEqupSurchageOcc06
	**/
    public C585HbEqupSurchageOcc06() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of c585HbTotVzwSurchgAmt
	 *	@return c585HbTotVzwSurchgAmt
	 */
	public BigDecimal getC585HbTotVzwSurchgAmt() throws CFException {
       if (isC585HbTotVzwSurchgAmtModified()) { 
           c585HbTotVzwSurchgAmt = refreshC585HbTotVzwSurchgAmt();
        }
   		return c585HbTotVzwSurchgAmt;
	}
	

    /**
	 *	Returns the String value of c585HbTotVzwSurchgAmt
	 *	@return c585HbTotVzwSurchgAmt
	 */
	public char[]  getC585HbTotVzwSurchgAmtActualString() {
	    String value = String.valueOf(c585HbTotVzwSurchgAmt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update C585HbTotVzwSurchgAmt with the passed number
	 *  Corresponding COBOL Variable is C585-HB-TOT-VZW-SURCHG-AMT
	 *	@param number
	 */
	public void setC585HbTotVzwSurchgAmt(BigDecimal number) {
       c585HbTotVzwSurchgAmt = checkC585HbTotVzwSurchgAmtMaxLimit(number);
	    serializeC585HbTotVzwSurchgAmt(c585HbTotVzwSurchgAmt);
   }
	/**
	 * 	Update C585HbTotVzwSurchgAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setC585HbTotVzwSurchgAmt(char[] value) throws CFException {
		 c585HbTotVzwSurchgAmt = serializeC585HbTotVzwSurchgAmt(value);
	}   
	/**
	 *	Returns the value of c585HbFusfRate
	 *	@return c585HbFusfRate
	 */
	public BigDecimal getC585HbFusfRate() throws CFException {
       if (isC585HbFusfRateModified()) { 
           c585HbFusfRate = refreshC585HbFusfRate();
        }
   		return c585HbFusfRate;
	}
	

    /**
	 *	Returns the String value of c585HbFusfRate
	 *	@return c585HbFusfRate
	 */
	public char[]  getC585HbFusfRateActualString() {
	    String value = String.valueOf(c585HbFusfRate).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update C585HbFusfRate with the passed number
	 *  Corresponding COBOL Variable is C585-HB-FUSF-RATE
	 *	@param number
	 */
	public void setC585HbFusfRate(BigDecimal number) {
       c585HbFusfRate = checkC585HbFusfRateMaxLimit(number);
	    serializeC585HbFusfRate(c585HbFusfRate);
   }
	/**
	 * 	Update C585HbFusfRate with the passed value
	 *	@param value (String or char[])
	 */
	public void setC585HbFusfRate(char[] value) throws CFException {
		 c585HbFusfRate = serializeC585HbFusfRate(value);
	}   
	/**
	 *	Returns the value of c585HbRegulatoryCharg
	 *	@return c585HbRegulatoryCharg
	 */
	public BigDecimal getC585HbRegulatoryCharg() throws CFException {
       if (isC585HbRegulatoryChargModified()) { 
           c585HbRegulatoryCharg = refreshC585HbRegulatoryCharg();
        }
   		return c585HbRegulatoryCharg;
	}
	

    /**
	 *	Returns the String value of c585HbRegulatoryCharg
	 *	@return c585HbRegulatoryCharg
	 */
	public char[]  getC585HbRegulatoryChargActualString() {
	    String value = String.valueOf(c585HbRegulatoryCharg).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update C585HbRegulatoryCharg with the passed number
	 *  Corresponding COBOL Variable is C585-HB-REGULATORY-CHARG
	 *	@param number
	 */
	public void setC585HbRegulatoryCharg(BigDecimal number) {
       c585HbRegulatoryCharg = checkC585HbRegulatoryChargMaxLimit(number);
	    serializeC585HbRegulatoryCharg(c585HbRegulatoryCharg);
   }
	/**
	 * 	Update C585HbRegulatoryCharg with the passed value
	 *	@param value (String or char[])
	 */
	public void setC585HbRegulatoryCharg(char[] value) throws CFException {
		 c585HbRegulatoryCharg = serializeC585HbRegulatoryCharg(value);
	}   
	/**
	 *	Returns the value of c585HbVzwAdminChgAmt
	 *	@return c585HbVzwAdminChgAmt
	 */
	public BigDecimal getC585HbVzwAdminChgAmt() throws CFException {
       if (isC585HbVzwAdminChgAmtModified()) { 
           c585HbVzwAdminChgAmt = refreshC585HbVzwAdminChgAmt();
        }
   		return c585HbVzwAdminChgAmt;
	}
	

    /**
	 *	Returns the String value of c585HbVzwAdminChgAmt
	 *	@return c585HbVzwAdminChgAmt
	 */
	public char[]  getC585HbVzwAdminChgAmtActualString() {
	    String value = String.valueOf(c585HbVzwAdminChgAmt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update C585HbVzwAdminChgAmt with the passed number
	 *  Corresponding COBOL Variable is C585-HB-VZW-ADMIN-CHG-AMT
	 *	@param number
	 */
	public void setC585HbVzwAdminChgAmt(BigDecimal number) {
       c585HbVzwAdminChgAmt = checkC585HbVzwAdminChgAmtMaxLimit(number);
	    serializeC585HbVzwAdminChgAmt(c585HbVzwAdminChgAmt);
   }
	/**
	 * 	Update C585HbVzwAdminChgAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setC585HbVzwAdminChgAmt(char[] value) throws CFException {
		 c585HbVzwAdminChgAmt = serializeC585HbVzwAdminChgAmt(value);
	}   

	
	
	

		public static int getC585HbEqupSurchageOcc06FieldLength() {
			return C_585_HB_EQUP_SURCHAGE_OCC_06_LENGTH;
		}

}
  
