package com.cloudframe.app.numeric0.dto;

/**
*  The class C587HbEqupSurchageOcc06 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:28. using version 5.0.0.254
**/


import com.cloudframe.app.numeric0.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;


public class C587HbEqupSurchageOcc06 extends C587HbEqupSurchageOcc06Serialized { 
   

								private BigDecimal c587HbTotVzwSurchgAmt = BigDecimal.ZERO;

								private BigDecimal c587HbFusfRate = BigDecimal.ZERO;

								private BigDecimal c587HbRegulatoryCharg = BigDecimal.ZERO;

								private BigDecimal c587HbVzwAdminChgAmt = BigDecimal.ZERO;
	
	/**
	* Constructor for C587HbEqupSurchageOcc06
	**/
    public C587HbEqupSurchageOcc06() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of c587HbTotVzwSurchgAmt
	 *	@return c587HbTotVzwSurchgAmt
	 */
	public BigDecimal getC587HbTotVzwSurchgAmt() throws CFException {
       if (isC587HbTotVzwSurchgAmtModified()) { 
           c587HbTotVzwSurchgAmt = refreshC587HbTotVzwSurchgAmt();
        }
   		return c587HbTotVzwSurchgAmt;
	}
	

    /**
	 *	Returns the String value of c587HbTotVzwSurchgAmt
	 *	@return c587HbTotVzwSurchgAmt
	 */
	public char[]  getC587HbTotVzwSurchgAmtActualString() {
	    String value = String.valueOf(c587HbTotVzwSurchgAmt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update C587HbTotVzwSurchgAmt with the passed number
	 *  Corresponding COBOL Variable is C587-HB-TOT-VZW-SURCHG-AMT
	 *	@param number
	 */
	public void setC587HbTotVzwSurchgAmt(BigDecimal number) {
       c587HbTotVzwSurchgAmt = checkC587HbTotVzwSurchgAmtMaxLimit(number);
	    serializeC587HbTotVzwSurchgAmt(c587HbTotVzwSurchgAmt);
   }
	/**
	 * 	Update C587HbTotVzwSurchgAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setC587HbTotVzwSurchgAmt(char[] value) throws CFException {
		 c587HbTotVzwSurchgAmt = serializeC587HbTotVzwSurchgAmt(value);
	}   
	/**
	 *	Returns the value of c587HbFusfRate
	 *	@return c587HbFusfRate
	 */
	public BigDecimal getC587HbFusfRate() throws CFException {
       if (isC587HbFusfRateModified()) { 
           c587HbFusfRate = refreshC587HbFusfRate();
        }
   		return c587HbFusfRate;
	}
	

    /**
	 *	Returns the String value of c587HbFusfRate
	 *	@return c587HbFusfRate
	 */
	public char[]  getC587HbFusfRateActualString() {
	    String value = String.valueOf(c587HbFusfRate).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update C587HbFusfRate with the passed number
	 *  Corresponding COBOL Variable is C587-HB-FUSF-RATE
	 *	@param number
	 */
	public void setC587HbFusfRate(BigDecimal number) {
       c587HbFusfRate = checkC587HbFusfRateMaxLimit(number);
	    serializeC587HbFusfRate(c587HbFusfRate);
   }
	/**
	 * 	Update C587HbFusfRate with the passed value
	 *	@param value (String or char[])
	 */
	public void setC587HbFusfRate(char[] value) throws CFException {
		 c587HbFusfRate = serializeC587HbFusfRate(value);
	}   
	/**
	 *	Returns the value of c587HbRegulatoryCharg
	 *	@return c587HbRegulatoryCharg
	 */
	public BigDecimal getC587HbRegulatoryCharg() throws CFException {
       if (isC587HbRegulatoryChargModified()) { 
           c587HbRegulatoryCharg = refreshC587HbRegulatoryCharg();
        }
   		return c587HbRegulatoryCharg;
	}
	

    /**
	 *	Returns the String value of c587HbRegulatoryCharg
	 *	@return c587HbRegulatoryCharg
	 */
	public char[]  getC587HbRegulatoryChargActualString() {
	    String value = String.valueOf(c587HbRegulatoryCharg).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update C587HbRegulatoryCharg with the passed number
	 *  Corresponding COBOL Variable is C587-HB-REGULATORY-CHARG
	 *	@param number
	 */
	public void setC587HbRegulatoryCharg(BigDecimal number) {
       c587HbRegulatoryCharg = checkC587HbRegulatoryChargMaxLimit(number);
	    serializeC587HbRegulatoryCharg(c587HbRegulatoryCharg);
   }
	/**
	 * 	Update C587HbRegulatoryCharg with the passed value
	 *	@param value (String or char[])
	 */
	public void setC587HbRegulatoryCharg(char[] value) throws CFException {
		 c587HbRegulatoryCharg = serializeC587HbRegulatoryCharg(value);
	}   
	/**
	 *	Returns the value of c587HbVzwAdminChgAmt
	 *	@return c587HbVzwAdminChgAmt
	 */
	public BigDecimal getC587HbVzwAdminChgAmt() throws CFException {
       if (isC587HbVzwAdminChgAmtModified()) { 
           c587HbVzwAdminChgAmt = refreshC587HbVzwAdminChgAmt();
        }
   		return c587HbVzwAdminChgAmt;
	}
	

    /**
	 *	Returns the String value of c587HbVzwAdminChgAmt
	 *	@return c587HbVzwAdminChgAmt
	 */
	public char[]  getC587HbVzwAdminChgAmtActualString() {
	    String value = String.valueOf(c587HbVzwAdminChgAmt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update C587HbVzwAdminChgAmt with the passed number
	 *  Corresponding COBOL Variable is C587-HB-VZW-ADMIN-CHG-AMT
	 *	@param number
	 */
	public void setC587HbVzwAdminChgAmt(BigDecimal number) {
       c587HbVzwAdminChgAmt = checkC587HbVzwAdminChgAmtMaxLimit(number);
	    serializeC587HbVzwAdminChgAmt(c587HbVzwAdminChgAmt);
   }
	/**
	 * 	Update C587HbVzwAdminChgAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setC587HbVzwAdminChgAmt(char[] value) throws CFException {
		 c587HbVzwAdminChgAmt = serializeC587HbVzwAdminChgAmt(value);
	}   

	
	
	

		public static int getC587HbEqupSurchageOcc06FieldLength() {
			return C_587_HB_EQUP_SURCHAGE_OCC_06_LENGTH;
		}

}
  
