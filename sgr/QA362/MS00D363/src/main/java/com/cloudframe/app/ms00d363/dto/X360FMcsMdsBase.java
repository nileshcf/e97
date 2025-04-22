package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360FMcsMdsBase is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


public class X360FMcsMdsBase extends X360FMcsMdsBaseSerialized { 
   

								private long x360FMcsMdsReqAmt;

								private long x360FMcsMdsCmpAmt;

								private long x360FMcsMdsCnvRteBse;

								private long x360FMcsMdsMccrAmt;

								private long x360FMcsMdsCnvMccr;

								private long x360FMcsMdsIccrAmt;

								private long x360FMcsMdsCnvIccr;

								private long x360FBaseIfeeAmtIssCr;

								private long x360FBaseIfeeAmtIssDb;

								private BigDecimal x360FBseToLocRate = BigDecimal.ZERO;

								private long x360FBaseIfeeAmtAcqCr;

								private long x360FBaseIfeeAmtAcqDb;

								private long x360FAcqIssDeniedAmt;

	
	/**
	* Constructor for X360FMcsMdsBase
	**/
    public X360FMcsMdsBase() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for X360FMcsMdsBase. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360FMcsMdsBase(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	public long getX360FMcsMdsReqAmt() throws CFException {
        if (isX360FMcsMdsReqAmtModified()) { 
           x360FMcsMdsReqAmt = refreshX360FMcsMdsReqAmt();
        }
   		return x360FMcsMdsReqAmt;
	}
	
	/**
	 * 	Update X360FMcsMdsReqAmt with the passed value
	 *  Corresponding COBOL Variable is X360-F-MCS-MDS-REQ-AMT
	 *	@param number
	 */
	public void setX360FMcsMdsReqAmt(long number) {
			x360FMcsMdsReqAmt = checkX360FMcsMdsReqAmtMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FMcsMdsReqAmt(x360FMcsMdsReqAmt);
	}


	public long getX360FMcsMdsCmpAmt() throws CFException {
        if (isX360FMcsMdsCmpAmtModified()) { 
           x360FMcsMdsCmpAmt = refreshX360FMcsMdsCmpAmt();
        }
   		return x360FMcsMdsCmpAmt;
	}
	
	/**
	 * 	Update X360FMcsMdsCmpAmt with the passed value
	 *  Corresponding COBOL Variable is X360-F-MCS-MDS-CMP-AMT
	 *	@param number
	 */
	public void setX360FMcsMdsCmpAmt(long number) {
			x360FMcsMdsCmpAmt = checkX360FMcsMdsCmpAmtMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FMcsMdsCmpAmt(x360FMcsMdsCmpAmt);
	}


	/**
	 *	Returns the value of x360FMcsMdsCnvRteBse
	 *	@return x360FMcsMdsCnvRteBse
	 */
	public long getX360FMcsMdsCnvRteBse() throws CFException {
       if (isX360FMcsMdsCnvRteBseModified()) { 
           x360FMcsMdsCnvRteBse = refreshX360FMcsMdsCnvRteBse();
        }
   		return x360FMcsMdsCnvRteBse;
	}
	

	
	   
	/**
	 * 	Update X360FMcsMdsCnvRteBse with the passed value
	 *  Corresponding COBOL Variable is X360-F-MCS-MDS-CNV-RTE-BSE
	 *	@param number
	 */
	public void setX360FMcsMdsCnvRteBse(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360FMcsMdsCnvRteBse = checkX360FMcsMdsCnvRteBseMaxLimit(number); 
		serializeX360FMcsMdsCnvRteBse(x360FMcsMdsCnvRteBse);
	}
	

	/**
	 * 	Update X360FMcsMdsCnvRteBse with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360FMcsMdsCnvRteBse(char[] value) throws CFException {
		 x360FMcsMdsCnvRteBse = serializeX360FMcsMdsCnvRteBse(value);
	}
	/**
	 * 	Update X360FMcsMdsCnvRteBse with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360FMcsMdsCnvRteBseString(char[] value) throws CFException {
		 setX360FMcsMdsCnvRteBse(value);
	}
	public long getX360FMcsMdsMccrAmt() throws CFException {
        if (isX360FMcsMdsMccrAmtModified()) { 
           x360FMcsMdsMccrAmt = refreshX360FMcsMdsMccrAmt();
        }
   		return x360FMcsMdsMccrAmt;
	}
	
	/**
	 * 	Update X360FMcsMdsMccrAmt with the passed value
	 *  Corresponding COBOL Variable is X360-F-MCS-MDS-MCCR-AMT
	 *	@param number
	 */
	public void setX360FMcsMdsMccrAmt(long number) {
			x360FMcsMdsMccrAmt = checkX360FMcsMdsMccrAmtMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FMcsMdsMccrAmt(x360FMcsMdsMccrAmt);
	}


	/**
	 *	Returns the value of x360FMcsMdsCnvMccr
	 *	@return x360FMcsMdsCnvMccr
	 */
	public long getX360FMcsMdsCnvMccr() throws CFException {
       if (isX360FMcsMdsCnvMccrModified()) { 
           x360FMcsMdsCnvMccr = refreshX360FMcsMdsCnvMccr();
        }
   		return x360FMcsMdsCnvMccr;
	}
	

	
	   
	/**
	 * 	Update X360FMcsMdsCnvMccr with the passed value
	 *  Corresponding COBOL Variable is X360-F-MCS-MDS-CNV-MCCR
	 *	@param number
	 */
	public void setX360FMcsMdsCnvMccr(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360FMcsMdsCnvMccr = checkX360FMcsMdsCnvMccrMaxLimit(number); 
		serializeX360FMcsMdsCnvMccr(x360FMcsMdsCnvMccr);
	}
	

	/**
	 * 	Update X360FMcsMdsCnvMccr with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360FMcsMdsCnvMccr(char[] value) throws CFException {
		 x360FMcsMdsCnvMccr = serializeX360FMcsMdsCnvMccr(value);
	}
	/**
	 * 	Update X360FMcsMdsCnvMccr with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360FMcsMdsCnvMccrString(char[] value) throws CFException {
		 setX360FMcsMdsCnvMccr(value);
	}
	public long getX360FMcsMdsIccrAmt() throws CFException {
        if (isX360FMcsMdsIccrAmtModified()) { 
           x360FMcsMdsIccrAmt = refreshX360FMcsMdsIccrAmt();
        }
   		return x360FMcsMdsIccrAmt;
	}
	
	/**
	 * 	Update X360FMcsMdsIccrAmt with the passed value
	 *  Corresponding COBOL Variable is X360-F-MCS-MDS-ICCR-AMT
	 *	@param number
	 */
	public void setX360FMcsMdsIccrAmt(long number) {
			x360FMcsMdsIccrAmt = checkX360FMcsMdsIccrAmtMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FMcsMdsIccrAmt(x360FMcsMdsIccrAmt);
	}


	/**
	 *	Returns the value of x360FMcsMdsCnvIccr
	 *	@return x360FMcsMdsCnvIccr
	 */
	public long getX360FMcsMdsCnvIccr() throws CFException {
       if (isX360FMcsMdsCnvIccrModified()) { 
           x360FMcsMdsCnvIccr = refreshX360FMcsMdsCnvIccr();
        }
   		return x360FMcsMdsCnvIccr;
	}
	

	
	   
	/**
	 * 	Update X360FMcsMdsCnvIccr with the passed value
	 *  Corresponding COBOL Variable is X360-F-MCS-MDS-CNV-ICCR
	 *	@param number
	 */
	public void setX360FMcsMdsCnvIccr(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360FMcsMdsCnvIccr = checkX360FMcsMdsCnvIccrMaxLimit(number); 
		serializeX360FMcsMdsCnvIccr(x360FMcsMdsCnvIccr);
	}
	

	/**
	 * 	Update X360FMcsMdsCnvIccr with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360FMcsMdsCnvIccr(char[] value) throws CFException {
		 x360FMcsMdsCnvIccr = serializeX360FMcsMdsCnvIccr(value);
	}
	/**
	 * 	Update X360FMcsMdsCnvIccr with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360FMcsMdsCnvIccrString(char[] value) throws CFException {
		 setX360FMcsMdsCnvIccr(value);
	}
	public long getX360FBaseIfeeAmtIssCr() throws CFException {
        if (isX360FBaseIfeeAmtIssCrModified()) { 
           x360FBaseIfeeAmtIssCr = refreshX360FBaseIfeeAmtIssCr();
        }
   		return x360FBaseIfeeAmtIssCr;
	}
	
	/**
	 * 	Update X360FBaseIfeeAmtIssCr with the passed value
	 *  Corresponding COBOL Variable is X360-F-BASE-IFEE-AMT-ISS-CR
	 *	@param number
	 */
	public void setX360FBaseIfeeAmtIssCr(long number) {
			x360FBaseIfeeAmtIssCr = checkX360FBaseIfeeAmtIssCrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FBaseIfeeAmtIssCr(x360FBaseIfeeAmtIssCr);
	}


	public long getX360FBaseIfeeAmtIssDb() throws CFException {
        if (isX360FBaseIfeeAmtIssDbModified()) { 
           x360FBaseIfeeAmtIssDb = refreshX360FBaseIfeeAmtIssDb();
        }
   		return x360FBaseIfeeAmtIssDb;
	}
	
	/**
	 * 	Update X360FBaseIfeeAmtIssDb with the passed value
	 *  Corresponding COBOL Variable is X360-F-BASE-IFEE-AMT-ISS-DB
	 *	@param number
	 */
	public void setX360FBaseIfeeAmtIssDb(long number) {
			x360FBaseIfeeAmtIssDb = checkX360FBaseIfeeAmtIssDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FBaseIfeeAmtIssDb(x360FBaseIfeeAmtIssDb);
	}


	/**
	 *	Returns the value of x360FBseToLocRate
	 *	@return x360FBseToLocRate
	 */
	public BigDecimal getX360FBseToLocRate() throws CFException {
       if (isX360FBseToLocRateModified()) { 
           x360FBseToLocRate = refreshX360FBseToLocRate();
        }
   		return x360FBseToLocRate;
	}
	

	
	   
	/**
	 * 	Update X360FBseToLocRate with the passed number
	 *  Corresponding COBOL Variable is X360-F-BSE-TO-LOC-RATE
	 *	@param number
	 */
	public void setX360FBseToLocRate(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       x360FBseToLocRate = checkX360FBseToLocRateMaxLimit(number);
	    serializeX360FBseToLocRate(x360FBseToLocRate);
   }
	/**
	 * 	Update X360FBseToLocRate with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360FBseToLocRate(char[] value) throws CFException {
		 x360FBseToLocRate = serializeX360FBseToLocRate(value);
	}   
	public long getX360FBaseIfeeAmtAcqCr() throws CFException {
        if (isX360FBaseIfeeAmtAcqCrModified()) { 
           x360FBaseIfeeAmtAcqCr = refreshX360FBaseIfeeAmtAcqCr();
        }
   		return x360FBaseIfeeAmtAcqCr;
	}
	
	/**
	 * 	Update X360FBaseIfeeAmtAcqCr with the passed value
	 *  Corresponding COBOL Variable is X360-F-BASE-IFEE-AMT-ACQ-CR
	 *	@param number
	 */
	public void setX360FBaseIfeeAmtAcqCr(long number) {
			x360FBaseIfeeAmtAcqCr = checkX360FBaseIfeeAmtAcqCrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FBaseIfeeAmtAcqCr(x360FBaseIfeeAmtAcqCr);
	}


	public long getX360FBaseIfeeAmtAcqDb() throws CFException {
        if (isX360FBaseIfeeAmtAcqDbModified()) { 
           x360FBaseIfeeAmtAcqDb = refreshX360FBaseIfeeAmtAcqDb();
        }
   		return x360FBaseIfeeAmtAcqDb;
	}
	
	/**
	 * 	Update X360FBaseIfeeAmtAcqDb with the passed value
	 *  Corresponding COBOL Variable is X360-F-BASE-IFEE-AMT-ACQ-DB
	 *	@param number
	 */
	public void setX360FBaseIfeeAmtAcqDb(long number) {
			x360FBaseIfeeAmtAcqDb = checkX360FBaseIfeeAmtAcqDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FBaseIfeeAmtAcqDb(x360FBaseIfeeAmtAcqDb);
	}


	public long getX360FAcqIssDeniedAmt() throws CFException {
        if (isX360FAcqIssDeniedAmtModified()) { 
           x360FAcqIssDeniedAmt = refreshX360FAcqIssDeniedAmt();
        }
   		return x360FAcqIssDeniedAmt;
	}
	
	/**
	 * 	Update X360FAcqIssDeniedAmt with the passed value
	 *  Corresponding COBOL Variable is X360-F-ACQ-ISS-DENIED-AMT
	 *	@param number
	 */
	public void setX360FAcqIssDeniedAmt(long number) {
			x360FAcqIssDeniedAmt = checkX360FAcqIssDeniedAmtMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FAcqIssDeniedAmt(x360FAcqIssDeniedAmt);
	}



	
	
	

		public static int getX360FMcsMdsBaseFieldLength() {
			return X_360_FMCS_MDS_BASE_LENGTH;
		}

}
  
