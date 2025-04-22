package com.cloudframe.app.numeric0.dto;

/**
*  The class MainHbEqupSurchageOcc06 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:04. using version 5.0.0.254
**/


import com.cloudframe.app.numeric0.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;


public class MainHbEqupSurchageOcc06 extends MainHbEqupSurchageOcc06Serialized {
   

								private BigDecimal mainHbTotVzwSurchgAmt = BigDecimal.ZERO;

								private BigDecimal mainHbFusfRate = BigDecimal.ZERO;

								private BigDecimal mainHbRegulatoryCharg = BigDecimal.ZERO;

								private BigDecimal mainHbVzwAdminChgAmt = BigDecimal.ZERO;
	
	/**
	* Constructor for MainHbEqupSurchageOcc06
	**/
    public MainHbEqupSurchageOcc06() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of mainHbTotVzwSurchgAmt
	 *	@return mainHbTotVzwSurchgAmt
	 */
	public BigDecimal getMainHbTotVzwSurchgAmt() throws CFException {
       if (isMainHbTotVzwSurchgAmtModified()) { 
           mainHbTotVzwSurchgAmt = refreshMainHbTotVzwSurchgAmt();
        }
   		return mainHbTotVzwSurchgAmt;
	}
	

    /**
	 *	Returns the String value of mainHbTotVzwSurchgAmt
	 *	@return mainHbTotVzwSurchgAmt
	 */
	public char[]  getMainHbTotVzwSurchgAmtActualString() {
	    String value = String.valueOf(mainHbTotVzwSurchgAmt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update MainHbTotVzwSurchgAmt with the passed number
	 *  Corresponding COBOL Variable is MAIN-HB-TOT-VZW-SURCHG-AMT
	 *	@param number
	 */
	public void setMainHbTotVzwSurchgAmt(BigDecimal number) {
       mainHbTotVzwSurchgAmt = checkMainHbTotVzwSurchgAmtMaxLimit(number);
	    serializeMainHbTotVzwSurchgAmt(mainHbTotVzwSurchgAmt);
   }
	/**
	 * 	Update MainHbTotVzwSurchgAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setMainHbTotVzwSurchgAmt(char[] value) throws CFException {
		 mainHbTotVzwSurchgAmt = serializeMainHbTotVzwSurchgAmt(value);
	}   
	/**
	 *	Returns the value of mainHbFusfRate
	 *	@return mainHbFusfRate
	 */
	public BigDecimal getMainHbFusfRate() throws CFException {
       if (isMainHbFusfRateModified()) { 
           mainHbFusfRate = refreshMainHbFusfRate();
        }
   		return mainHbFusfRate;
	}
	

    /**
	 *	Returns the String value of mainHbFusfRate
	 *	@return mainHbFusfRate
	 */
	public char[]  getMainHbFusfRateActualString() {
	    String value = String.valueOf(mainHbFusfRate).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update MainHbFusfRate with the passed number
	 *  Corresponding COBOL Variable is MAIN-HB-FUSF-RATE
	 *	@param number
	 */
	public void setMainHbFusfRate(BigDecimal number) {
       mainHbFusfRate = checkMainHbFusfRateMaxLimit(number);
	    serializeMainHbFusfRate(mainHbFusfRate);
   }
	/**
	 * 	Update MainHbFusfRate with the passed value
	 *	@param value (String or char[])
	 */
	public void setMainHbFusfRate(char[] value) throws CFException {
		 mainHbFusfRate = serializeMainHbFusfRate(value);
	}   
	/**
	 *	Returns the value of mainHbRegulatoryCharg
	 *	@return mainHbRegulatoryCharg
	 */
	public BigDecimal getMainHbRegulatoryCharg() throws CFException {
       if (isMainHbRegulatoryChargModified()) { 
           mainHbRegulatoryCharg = refreshMainHbRegulatoryCharg();
        }
   		return mainHbRegulatoryCharg;
	}
	

    /**
	 *	Returns the String value of mainHbRegulatoryCharg
	 *	@return mainHbRegulatoryCharg
	 */
	public char[]  getMainHbRegulatoryChargActualString() {
	    String value = String.valueOf(mainHbRegulatoryCharg).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update MainHbRegulatoryCharg with the passed number
	 *  Corresponding COBOL Variable is MAIN-HB-REGULATORY-CHARG
	 *	@param number
	 */
	public void setMainHbRegulatoryCharg(BigDecimal number) {
       mainHbRegulatoryCharg = checkMainHbRegulatoryChargMaxLimit(number);
	    serializeMainHbRegulatoryCharg(mainHbRegulatoryCharg);
   }
	/**
	 * 	Update MainHbRegulatoryCharg with the passed value
	 *	@param value (String or char[])
	 */
	public void setMainHbRegulatoryCharg(char[] value) throws CFException {
		 mainHbRegulatoryCharg = serializeMainHbRegulatoryCharg(value);
	}   
	/**
	 *	Returns the value of mainHbVzwAdminChgAmt
	 *	@return mainHbVzwAdminChgAmt
	 */
	public BigDecimal getMainHbVzwAdminChgAmt() throws CFException {
       if (isMainHbVzwAdminChgAmtModified()) { 
           mainHbVzwAdminChgAmt = refreshMainHbVzwAdminChgAmt();
        }
   		return mainHbVzwAdminChgAmt;
	}
	

    /**
	 *	Returns the String value of mainHbVzwAdminChgAmt
	 *	@return mainHbVzwAdminChgAmt
	 */
	public char[]  getMainHbVzwAdminChgAmtActualString() {
	    String value = String.valueOf(mainHbVzwAdminChgAmt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update MainHbVzwAdminChgAmt with the passed number
	 *  Corresponding COBOL Variable is MAIN-HB-VZW-ADMIN-CHG-AMT
	 *	@param number
	 */
	public void setMainHbVzwAdminChgAmt(BigDecimal number) {
       mainHbVzwAdminChgAmt = checkMainHbVzwAdminChgAmtMaxLimit(number);
	    serializeMainHbVzwAdminChgAmt(mainHbVzwAdminChgAmt);
   }
	/**
	 * 	Update MainHbVzwAdminChgAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setMainHbVzwAdminChgAmt(char[] value) throws CFException {
		 mainHbVzwAdminChgAmt = serializeMainHbVzwAdminChgAmt(value);
	}   

	
	
	

		public static int getMainHbEqupSurchageOcc06FieldLength() {
			return MAIN_HB_EQUP_SURCHAGE_OCC_06_LENGTH;
		}

}
  
