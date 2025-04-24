package com.cloudframe.app.numeric0.dto;

/**
*  The class C588HbEqupSurchageOcc06 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:28. using version 5.0.0.254
**/


import com.cloudframe.app.numeric0.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;


public class C588HbEqupSurchageOcc06 extends C588HbEqupSurchageOcc06Serialized { 
   

								private BigDecimal c588HbTotVzwSurchgAmt = BigDecimal.ZERO;

								private BigDecimal c588HbFusfRate = BigDecimal.ZERO;

								private BigDecimal c588HbRegulatoryCharg = BigDecimal.ZERO;

								private BigDecimal c588HbVzwAdminChgAmt = BigDecimal.ZERO;
	
	/**
	* Constructor for C588HbEqupSurchageOcc06
	**/
    public C588HbEqupSurchageOcc06() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of c588HbTotVzwSurchgAmt
	 *	@return c588HbTotVzwSurchgAmt
	 */
	public BigDecimal getC588HbTotVzwSurchgAmt() throws CFException {
       if (isC588HbTotVzwSurchgAmtModified()) { 
           c588HbTotVzwSurchgAmt = refreshC588HbTotVzwSurchgAmt();
        }
   		return c588HbTotVzwSurchgAmt;
	}
	

    /**
	 *	Returns the String value of c588HbTotVzwSurchgAmt
	 *	@return c588HbTotVzwSurchgAmt
	 */
	public char[]  getC588HbTotVzwSurchgAmtActualString() {
	    String value = String.valueOf(c588HbTotVzwSurchgAmt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update C588HbTotVzwSurchgAmt with the passed number
	 *  Corresponding COBOL Variable is C588-HB-TOT-VZW-SURCHG-AMT
	 *	@param number
	 */
	public void setC588HbTotVzwSurchgAmt(BigDecimal number) {
       c588HbTotVzwSurchgAmt = checkC588HbTotVzwSurchgAmtMaxLimit(number);
	    serializeC588HbTotVzwSurchgAmt(c588HbTotVzwSurchgAmt);
   }
	/**
	 * 	Update C588HbTotVzwSurchgAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setC588HbTotVzwSurchgAmt(char[] value) throws CFException {
		 c588HbTotVzwSurchgAmt = serializeC588HbTotVzwSurchgAmt(value);
	}   
	/**
	 *	Returns the value of c588HbFusfRate
	 *	@return c588HbFusfRate
	 */
	public BigDecimal getC588HbFusfRate() throws CFException {
       if (isC588HbFusfRateModified()) { 
           c588HbFusfRate = refreshC588HbFusfRate();
        }
   		return c588HbFusfRate;
	}
	

    /**
	 *	Returns the String value of c588HbFusfRate
	 *	@return c588HbFusfRate
	 */
	public char[]  getC588HbFusfRateActualString() {
	    String value = String.valueOf(c588HbFusfRate).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update C588HbFusfRate with the passed number
	 *  Corresponding COBOL Variable is C588-HB-FUSF-RATE
	 *	@param number
	 */
	public void setC588HbFusfRate(BigDecimal number) {
       c588HbFusfRate = checkC588HbFusfRateMaxLimit(number);
	    serializeC588HbFusfRate(c588HbFusfRate);
   }
	/**
	 * 	Update C588HbFusfRate with the passed value
	 *	@param value (String or char[])
	 */
	public void setC588HbFusfRate(char[] value) throws CFException {
		 c588HbFusfRate = serializeC588HbFusfRate(value);
	}   
	/**
	 *	Returns the value of c588HbRegulatoryCharg
	 *	@return c588HbRegulatoryCharg
	 */
	public BigDecimal getC588HbRegulatoryCharg() throws CFException {
       if (isC588HbRegulatoryChargModified()) { 
           c588HbRegulatoryCharg = refreshC588HbRegulatoryCharg();
        }
   		return c588HbRegulatoryCharg;
	}
	

    /**
	 *	Returns the String value of c588HbRegulatoryCharg
	 *	@return c588HbRegulatoryCharg
	 */
	public char[]  getC588HbRegulatoryChargActualString() {
	    String value = String.valueOf(c588HbRegulatoryCharg).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update C588HbRegulatoryCharg with the passed number
	 *  Corresponding COBOL Variable is C588-HB-REGULATORY-CHARG
	 *	@param number
	 */
	public void setC588HbRegulatoryCharg(BigDecimal number) {
       c588HbRegulatoryCharg = checkC588HbRegulatoryChargMaxLimit(number);
	    serializeC588HbRegulatoryCharg(c588HbRegulatoryCharg);
   }
	/**
	 * 	Update C588HbRegulatoryCharg with the passed value
	 *	@param value (String or char[])
	 */
	public void setC588HbRegulatoryCharg(char[] value) throws CFException {
		 c588HbRegulatoryCharg = serializeC588HbRegulatoryCharg(value);
	}   
	/**
	 *	Returns the value of c588HbVzwAdminChgAmt
	 *	@return c588HbVzwAdminChgAmt
	 */
	public BigDecimal getC588HbVzwAdminChgAmt() throws CFException {
       if (isC588HbVzwAdminChgAmtModified()) { 
           c588HbVzwAdminChgAmt = refreshC588HbVzwAdminChgAmt();
        }
   		return c588HbVzwAdminChgAmt;
	}
	

    /**
	 *	Returns the String value of c588HbVzwAdminChgAmt
	 *	@return c588HbVzwAdminChgAmt
	 */
	public char[]  getC588HbVzwAdminChgAmtActualString() {
	    String value = String.valueOf(c588HbVzwAdminChgAmt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update C588HbVzwAdminChgAmt with the passed number
	 *  Corresponding COBOL Variable is C588-HB-VZW-ADMIN-CHG-AMT
	 *	@param number
	 */
	public void setC588HbVzwAdminChgAmt(BigDecimal number) {
       c588HbVzwAdminChgAmt = checkC588HbVzwAdminChgAmtMaxLimit(number);
	    serializeC588HbVzwAdminChgAmt(c588HbVzwAdminChgAmt);
   }
	/**
	 * 	Update C588HbVzwAdminChgAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setC588HbVzwAdminChgAmt(char[] value) throws CFException {
		 c588HbVzwAdminChgAmt = serializeC588HbVzwAdminChgAmt(value);
	}   

	
	
	

		public static int getC588HbEqupSurchageOcc06FieldLength() {
			return C_588_HB_EQUP_SURCHAGE_OCC_06_LENGTH;
		}

}
  
