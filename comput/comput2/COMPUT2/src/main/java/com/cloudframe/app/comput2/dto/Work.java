package com.cloudframe.app.comput2.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:34. using version 5.0.0.254
**/


import com.cloudframe.app.comput2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;


public class Work extends WorkSerialized {
   

								private long div;

								private BigDecimal allow = BigDecimal.ZERO;

								private BigDecimal oosuSharedAllow = BigDecimal.ZERO;

								private BigDecimal rlu3aTotDataPromoAllow = BigDecimal.ZERO;

								private int cKilobyteNum;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setCKilobyteNum(1024);
    }


 

	public long getDiv() throws CFException {
        if (isDivModified()) { 
           div = refreshDiv();
        }
   		return div;
	}
	
	/**
	 * 	Update Div with the passed value
	 *  Corresponding COBOL Variable is WS-DIV
	 *	@param number
	 */
	public void setDiv(long number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			div = checkDivMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeDiv(div);
	}


	public BigDecimal getAllow() throws CFException {
        if (isAllowModified()) { 
           allow = refreshAllow();
        }
   		return allow;
	}

    public char[] getAllowString() {
          return  allowString();
    }
	
	/**
	 * 	Update Allow with the passed number
	 *  Corresponding COBOL Variable is WS-ALLOW
	 *	@param number
	 */
	public void setAllow(BigDecimal number) {	
     allow = checkAllowMaxLimit(number);
	    serializeAllow(allow);
   }
	public BigDecimal getOosuSharedAllow() throws CFException {
        if (isOosuSharedAllowModified()) { 
           oosuSharedAllow = refreshOosuSharedAllow();
        }
   		return oosuSharedAllow;
	}

    public char[] getOosuSharedAllowString() {
          return  oosuSharedAllowString();
    }
	
	/**
	 * 	Update OosuSharedAllow with the passed number
	 *  Corresponding COBOL Variable is WS-OOSU-SHARED-ALLOW
	 *	@param number
	 */
	public void setOosuSharedAllow(BigDecimal number) {	
     oosuSharedAllow = checkOosuSharedAllowMaxLimit(number);
	    serializeOosuSharedAllow(oosuSharedAllow);
   }
	public BigDecimal getRlu3aTotDataPromoAllow() throws CFException {
        if (isRlu3aTotDataPromoAllowModified()) { 
           rlu3aTotDataPromoAllow = refreshRlu3aTotDataPromoAllow();
        }
   		return rlu3aTotDataPromoAllow;
	}

    public char[] getRlu3aTotDataPromoAllowString() {
          return  rlu3aTotDataPromoAllowString();
    }
	
	/**
	 * 	Update Rlu3aTotDataPromoAllow with the passed number
	 *  Corresponding COBOL Variable is LK-RLU3A-TOT-DATA-PROMO-ALLOW
	 *	@param number
	 */
	public void setRlu3aTotDataPromoAllow(BigDecimal number) {	
     rlu3aTotDataPromoAllow = checkRlu3aTotDataPromoAllowMaxLimit(number);
	    serializeRlu3aTotDataPromoAllow(rlu3aTotDataPromoAllow);
   }
	/**
	 *	Returns the value of cKilobyteNum
	 *	@return cKilobyteNum
	 */
	public int getCKilobyteNum() throws CFException {
   		return cKilobyteNum;
	}
	
	/**
	 * 	Update CKilobyteNum with the passed value
	 *  Corresponding COBOL Variable is C-KILOBYTE-NUM
	 *	@param number
	 */
	public void setCKilobyteNum(int number) {
	     // Truncate if the number is beyond +/- Max range
	    cKilobyteNum = checkCKilobyteNumMaxLimit(number); 
	}


	public void setCKilobyteNum(long number) {
	    number = checkCKilobyteNumMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCKilobyteNum((int)number);
	}
	

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
