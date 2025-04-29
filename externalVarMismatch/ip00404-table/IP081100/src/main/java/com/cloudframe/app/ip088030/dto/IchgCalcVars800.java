package com.cloudframe.app.ip088030.dto;

/**
*  The class IchgCalcVars800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:34. using version 5.0.0.254
**/


import com.cloudframe.app.ip088030.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;


public class IchgCalcVars800 extends IchgCalcVars800Serialized {
   

								private BigDecimal viaAmt800 = BigDecimal.ZERO;

								private BigDecimal fiaAmt800 = BigDecimal.ZERO;

								private BigDecimal netAmt800 = BigDecimal.ZERO;

								private BigDecimal clrTxnAmt6800 = BigDecimal.ZERO;

								private BigDecimal viaRate800 = BigDecimal.ZERO;

								private BigDecimal minAmt800 = BigDecimal.ZERO;

								private BigDecimal maxAmt800 = BigDecimal.ZERO;

								private BigDecimal viaRate801 = BigDecimal.ZERO;

								private BigDecimal fiaAmt801 = BigDecimal.ZERO;

								private BigDecimal minAmt801 = BigDecimal.ZERO;

								private BigDecimal maxAmt801 = BigDecimal.ZERO;

								private BigDecimal viaRate802 = BigDecimal.ZERO;

								private BigDecimal fiaAmt802 = BigDecimal.ZERO;

								private BigDecimal minAmt802 = BigDecimal.ZERO;

								private BigDecimal maxAmt802 = BigDecimal.ZERO;
	
	/**
	* Constructor for IchgCalcVars800
	**/
    public IchgCalcVars800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setViaAmt800(BigDecimal.ZERO);
								setFiaAmt800(BigDecimal.ZERO);
								setNetAmt800(BigDecimal.ZERO);
								setClrTxnAmt6800(BigDecimal.ZERO);
								setViaRate800(BigDecimal.ZERO);
								setMinAmt800(BigDecimal.ZERO);
								setMaxAmt800(BigDecimal.ZERO);
								setViaRate801(BigDecimal.ZERO);
								setFiaAmt801(BigDecimal.ZERO);
								setMinAmt801(BigDecimal.ZERO);
								setMaxAmt801(BigDecimal.ZERO);
								setViaRate802(BigDecimal.ZERO);
								setFiaAmt802(BigDecimal.ZERO);
								setMinAmt802(BigDecimal.ZERO);
								setMaxAmt802(BigDecimal.ZERO);
    }


 

	/**
	 *	Returns the value of viaAmt800
	 *	@return viaAmt800
	 */
	public BigDecimal getViaAmt800() throws CFException {
       if (isViaAmt800Modified()) { 
           viaAmt800 = refreshViaAmt800();
        }
   		return viaAmt800;
	}
	

	
	   
	/**
	 * 	Update ViaAmt800 with the passed number
	 *  Corresponding COBOL Variable is 800-VIA-AMT
	 *	@param number
	 */
	public void setViaAmt800(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       viaAmt800 = checkViaAmt800MaxLimit(number);
	    serializeViaAmt800(viaAmt800);
   }
	/**
	 * 	Update ViaAmt800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setViaAmt800(char[] value) throws CFException {
		 viaAmt800 = serializeViaAmt800(value);
	}   
	/**
	 *	Returns the value of fiaAmt800
	 *	@return fiaAmt800
	 */
	public BigDecimal getFiaAmt800() throws CFException {
       if (isFiaAmt800Modified()) { 
           fiaAmt800 = refreshFiaAmt800();
        }
   		return fiaAmt800;
	}
	

	
	   
	/**
	 * 	Update FiaAmt800 with the passed number
	 *  Corresponding COBOL Variable is 800-FIA-AMT
	 *	@param number
	 */
	public void setFiaAmt800(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       fiaAmt800 = checkFiaAmt800MaxLimit(number);
	    serializeFiaAmt800(fiaAmt800);
   }
	/**
	 * 	Update FiaAmt800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setFiaAmt800(char[] value) throws CFException {
		 fiaAmt800 = serializeFiaAmt800(value);
	}   
	/**
	 *	Returns the value of netAmt800
	 *	@return netAmt800
	 */
	public BigDecimal getNetAmt800() throws CFException {
       if (isNetAmt800Modified()) { 
           netAmt800 = refreshNetAmt800();
        }
   		return netAmt800;
	}
	

	
	   
	/**
	 * 	Update NetAmt800 with the passed number
	 *  Corresponding COBOL Variable is 800-NET-AMT
	 *	@param number
	 */
	public void setNetAmt800(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       netAmt800 = checkNetAmt800MaxLimit(number);
	    serializeNetAmt800(netAmt800);
   }
	/**
	 * 	Update NetAmt800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNetAmt800(char[] value) throws CFException {
		 netAmt800 = serializeNetAmt800(value);
	}   
	/**
	 *	Returns the value of clrTxnAmt6800
	 *	@return clrTxnAmt6800
	 */
	public BigDecimal getClrTxnAmt6800() throws CFException {
       if (isClrTxnAmt6800Modified()) { 
           clrTxnAmt6800 = refreshClrTxnAmt6800();
        }
   		return clrTxnAmt6800;
	}
	

	
	   
	/**
	 * 	Update ClrTxnAmt6800 with the passed number
	 *  Corresponding COBOL Variable is 800-CLR-TXN-AMT-6
	 *	@param number
	 */
	public void setClrTxnAmt6800(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       clrTxnAmt6800 = checkClrTxnAmt6800MaxLimit(number);
	    serializeClrTxnAmt6800(clrTxnAmt6800);
   }
	/**
	 * 	Update ClrTxnAmt6800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setClrTxnAmt6800(char[] value) throws CFException {
		 clrTxnAmt6800 = serializeClrTxnAmt6800(value);
	}   
	/**
	 *	Returns the value of viaRate800
	 *	@return viaRate800
	 */
	public BigDecimal getViaRate800() throws CFException {
       if (isViaRate800Modified()) { 
           viaRate800 = refreshViaRate800();
        }
   		return viaRate800;
	}
	

	
	   
	/**
	 * 	Update ViaRate800 with the passed number
	 *  Corresponding COBOL Variable is 800-VIA-RATE
	 *	@param number
	 */
	public void setViaRate800(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       viaRate800 = checkViaRate800MaxLimit(number);
	    serializeViaRate800(viaRate800);
   }
	/**
	 * 	Update ViaRate800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setViaRate800(char[] value) throws CFException {
		 viaRate800 = serializeViaRate800(value);
	}   
	/**
	 *	Returns the value of minAmt800
	 *	@return minAmt800
	 */
	public BigDecimal getMinAmt800() throws CFException {
       if (isMinAmt800Modified()) { 
           minAmt800 = refreshMinAmt800();
        }
   		return minAmt800;
	}
	

	
	   
	/**
	 * 	Update MinAmt800 with the passed number
	 *  Corresponding COBOL Variable is 800-MIN-AMT
	 *	@param number
	 */
	public void setMinAmt800(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       minAmt800 = checkMinAmt800MaxLimit(number);
	    serializeMinAmt800(minAmt800);
   }
	/**
	 * 	Update MinAmt800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMinAmt800(char[] value) throws CFException {
		 minAmt800 = serializeMinAmt800(value);
	}   
	/**
	 *	Returns the value of maxAmt800
	 *	@return maxAmt800
	 */
	public BigDecimal getMaxAmt800() throws CFException {
       if (isMaxAmt800Modified()) { 
           maxAmt800 = refreshMaxAmt800();
        }
   		return maxAmt800;
	}
	

	
	   
	/**
	 * 	Update MaxAmt800 with the passed number
	 *  Corresponding COBOL Variable is 800-MAX-AMT
	 *	@param number
	 */
	public void setMaxAmt800(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       maxAmt800 = checkMaxAmt800MaxLimit(number);
	    serializeMaxAmt800(maxAmt800);
   }
	/**
	 * 	Update MaxAmt800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMaxAmt800(char[] value) throws CFException {
		 maxAmt800 = serializeMaxAmt800(value);
	}   
	/**
	 *	Returns the value of viaRate801
	 *	@return viaRate801
	 */
	public BigDecimal getViaRate801() throws CFException {
       if (isViaRate801Modified()) { 
           viaRate801 = refreshViaRate801();
        }
   		return viaRate801;
	}
	

	
	   
	/**
	 * 	Update ViaRate801 with the passed number
	 *  Corresponding COBOL Variable is 801-VIA-RATE
	 *	@param number
	 */
	public void setViaRate801(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       viaRate801 = checkViaRate801MaxLimit(number);
	    serializeViaRate801(viaRate801);
   }
	/**
	 * 	Update ViaRate801 with the passed value
	 *	@param value (String or char[])
	 */
	public void setViaRate801(char[] value) throws CFException {
		 viaRate801 = serializeViaRate801(value);
	}   
	/**
	 *	Returns the value of fiaAmt801
	 *	@return fiaAmt801
	 */
	public BigDecimal getFiaAmt801() throws CFException {
       if (isFiaAmt801Modified()) { 
           fiaAmt801 = refreshFiaAmt801();
        }
   		return fiaAmt801;
	}
	

	
	   
	/**
	 * 	Update FiaAmt801 with the passed number
	 *  Corresponding COBOL Variable is 801-FIA-AMT
	 *	@param number
	 */
	public void setFiaAmt801(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       fiaAmt801 = checkFiaAmt801MaxLimit(number);
	    serializeFiaAmt801(fiaAmt801);
   }
	/**
	 * 	Update FiaAmt801 with the passed value
	 *	@param value (String or char[])
	 */
	public void setFiaAmt801(char[] value) throws CFException {
		 fiaAmt801 = serializeFiaAmt801(value);
	}   
	/**
	 *	Returns the value of minAmt801
	 *	@return minAmt801
	 */
	public BigDecimal getMinAmt801() throws CFException {
       if (isMinAmt801Modified()) { 
           minAmt801 = refreshMinAmt801();
        }
   		return minAmt801;
	}
	

	
	   
	/**
	 * 	Update MinAmt801 with the passed number
	 *  Corresponding COBOL Variable is 801-MIN-AMT
	 *	@param number
	 */
	public void setMinAmt801(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       minAmt801 = checkMinAmt801MaxLimit(number);
	    serializeMinAmt801(minAmt801);
   }
	/**
	 * 	Update MinAmt801 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMinAmt801(char[] value) throws CFException {
		 minAmt801 = serializeMinAmt801(value);
	}   
	/**
	 *	Returns the value of maxAmt801
	 *	@return maxAmt801
	 */
	public BigDecimal getMaxAmt801() throws CFException {
       if (isMaxAmt801Modified()) { 
           maxAmt801 = refreshMaxAmt801();
        }
   		return maxAmt801;
	}
	

	
	   
	/**
	 * 	Update MaxAmt801 with the passed number
	 *  Corresponding COBOL Variable is 801-MAX-AMT
	 *	@param number
	 */
	public void setMaxAmt801(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       maxAmt801 = checkMaxAmt801MaxLimit(number);
	    serializeMaxAmt801(maxAmt801);
   }
	/**
	 * 	Update MaxAmt801 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMaxAmt801(char[] value) throws CFException {
		 maxAmt801 = serializeMaxAmt801(value);
	}   
	/**
	 *	Returns the value of viaRate802
	 *	@return viaRate802
	 */
	public BigDecimal getViaRate802() throws CFException {
       if (isViaRate802Modified()) { 
           viaRate802 = refreshViaRate802();
        }
   		return viaRate802;
	}
	

	
	   
	/**
	 * 	Update ViaRate802 with the passed number
	 *  Corresponding COBOL Variable is 802-VIA-RATE
	 *	@param number
	 */
	public void setViaRate802(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       viaRate802 = checkViaRate802MaxLimit(number);
	    serializeViaRate802(viaRate802);
   }
	/**
	 * 	Update ViaRate802 with the passed value
	 *	@param value (String or char[])
	 */
	public void setViaRate802(char[] value) throws CFException {
		 viaRate802 = serializeViaRate802(value);
	}   
	/**
	 *	Returns the value of fiaAmt802
	 *	@return fiaAmt802
	 */
	public BigDecimal getFiaAmt802() throws CFException {
       if (isFiaAmt802Modified()) { 
           fiaAmt802 = refreshFiaAmt802();
        }
   		return fiaAmt802;
	}
	

	
	   
	/**
	 * 	Update FiaAmt802 with the passed number
	 *  Corresponding COBOL Variable is 802-FIA-AMT
	 *	@param number
	 */
	public void setFiaAmt802(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       fiaAmt802 = checkFiaAmt802MaxLimit(number);
	    serializeFiaAmt802(fiaAmt802);
   }
	/**
	 * 	Update FiaAmt802 with the passed value
	 *	@param value (String or char[])
	 */
	public void setFiaAmt802(char[] value) throws CFException {
		 fiaAmt802 = serializeFiaAmt802(value);
	}   
	/**
	 *	Returns the value of minAmt802
	 *	@return minAmt802
	 */
	public BigDecimal getMinAmt802() throws CFException {
       if (isMinAmt802Modified()) { 
           minAmt802 = refreshMinAmt802();
        }
   		return minAmt802;
	}
	

	
	   
	/**
	 * 	Update MinAmt802 with the passed number
	 *  Corresponding COBOL Variable is 802-MIN-AMT
	 *	@param number
	 */
	public void setMinAmt802(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       minAmt802 = checkMinAmt802MaxLimit(number);
	    serializeMinAmt802(minAmt802);
   }
	/**
	 * 	Update MinAmt802 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMinAmt802(char[] value) throws CFException {
		 minAmt802 = serializeMinAmt802(value);
	}   
	/**
	 *	Returns the value of maxAmt802
	 *	@return maxAmt802
	 */
	public BigDecimal getMaxAmt802() throws CFException {
       if (isMaxAmt802Modified()) { 
           maxAmt802 = refreshMaxAmt802();
        }
   		return maxAmt802;
	}
	

	
	   
	/**
	 * 	Update MaxAmt802 with the passed number
	 *  Corresponding COBOL Variable is 802-MAX-AMT
	 *	@param number
	 */
	public void setMaxAmt802(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       maxAmt802 = checkMaxAmt802MaxLimit(number);
	    serializeMaxAmt802(maxAmt802);
   }
	/**
	 * 	Update MaxAmt802 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMaxAmt802(char[] value) throws CFException {
		 maxAmt802 = serializeMaxAmt802(value);
	}   

	
	
	

		public static int getIchgCalcVars800FieldLength() {
			return ICHG_CALC_VARS_800_LENGTH;
		}

}
  
