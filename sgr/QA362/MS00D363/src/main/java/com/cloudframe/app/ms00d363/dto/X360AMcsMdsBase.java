package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360AMcsMdsBase is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


public class X360AMcsMdsBase extends X360AMcsMdsBaseSerialized { 
   

								private long x360AMcsMdsOrgReq;

								private long x360AMcsMdsOrgAmt;

								private long x360AMcsMdsNewAmt;

								private long x360AMcsMdsAdjAdjAmtCr;

								private long x360AMcsMdsAdjAdjAmtDb;

								private long x360AMcsMdsCnvRte;

								private long x360AMcsMdsMccrAmt;

								private long x360AMcsMdsCnvMccr;

								private long x360AMcsMdsIccrAmt;

								private long x360AMcsMdsCnvIccr;

								private long x360ABaseIfeeAmtIssCr;

								private long x360ABaseIfeeAmtIssDb;

								private BigDecimal x360ABseToLocRate = BigDecimal.ZERO;

								private long x360ABaseIfeeAmtAcqCr;

								private long x360ABaseIfeeAmtAcqDb;

								private long x360AAcqA09IfeeAmtCr;

								private long x360AAcqA09IfeeAmtDb;
	
	/**
	* Constructor for X360AMcsMdsBase
	**/
    public X360AMcsMdsBase() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for X360AMcsMdsBase. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360AMcsMdsBase(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	public long getX360AMcsMdsOrgReq() throws CFException {
        if (isX360AMcsMdsOrgReqModified()) { 
           x360AMcsMdsOrgReq = refreshX360AMcsMdsOrgReq();
        }
   		return x360AMcsMdsOrgReq;
	}
	
	/**
	 * 	Update X360AMcsMdsOrgReq with the passed value
	 *  Corresponding COBOL Variable is X360-A-MCS-MDS-ORG-REQ
	 *	@param number
	 */
	public void setX360AMcsMdsOrgReq(long number) {
			x360AMcsMdsOrgReq = checkX360AMcsMdsOrgReqMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AMcsMdsOrgReq(x360AMcsMdsOrgReq);
	}


	public long getX360AMcsMdsOrgAmt() throws CFException {
        if (isX360AMcsMdsOrgAmtModified()) { 
           x360AMcsMdsOrgAmt = refreshX360AMcsMdsOrgAmt();
        }
   		return x360AMcsMdsOrgAmt;
	}
	
	/**
	 * 	Update X360AMcsMdsOrgAmt with the passed value
	 *  Corresponding COBOL Variable is X360-A-MCS-MDS-ORG-AMT
	 *	@param number
	 */
	public void setX360AMcsMdsOrgAmt(long number) {
			x360AMcsMdsOrgAmt = checkX360AMcsMdsOrgAmtMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AMcsMdsOrgAmt(x360AMcsMdsOrgAmt);
	}


	public long getX360AMcsMdsNewAmt() throws CFException {
        if (isX360AMcsMdsNewAmtModified()) { 
           x360AMcsMdsNewAmt = refreshX360AMcsMdsNewAmt();
        }
   		return x360AMcsMdsNewAmt;
	}
	
	/**
	 * 	Update X360AMcsMdsNewAmt with the passed value
	 *  Corresponding COBOL Variable is X360-A-MCS-MDS-NEW-AMT
	 *	@param number
	 */
	public void setX360AMcsMdsNewAmt(long number) {
			x360AMcsMdsNewAmt = checkX360AMcsMdsNewAmtMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AMcsMdsNewAmt(x360AMcsMdsNewAmt);
	}


	public long getX360AMcsMdsAdjAdjAmtCr() throws CFException {
        if (isX360AMcsMdsAdjAdjAmtCrModified()) { 
           x360AMcsMdsAdjAdjAmtCr = refreshX360AMcsMdsAdjAdjAmtCr();
        }
   		return x360AMcsMdsAdjAdjAmtCr;
	}
	
	/**
	 * 	Update X360AMcsMdsAdjAdjAmtCr with the passed value
	 *  Corresponding COBOL Variable is X360-A-MCS-MDS-ADJ-ADJ-AMT-CR
	 *	@param number
	 */
	public void setX360AMcsMdsAdjAdjAmtCr(long number) {
			x360AMcsMdsAdjAdjAmtCr = checkX360AMcsMdsAdjAdjAmtCrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AMcsMdsAdjAdjAmtCr(x360AMcsMdsAdjAdjAmtCr);
	}


	public long getX360AMcsMdsAdjAdjAmtDb() throws CFException {
        if (isX360AMcsMdsAdjAdjAmtDbModified()) { 
           x360AMcsMdsAdjAdjAmtDb = refreshX360AMcsMdsAdjAdjAmtDb();
        }
   		return x360AMcsMdsAdjAdjAmtDb;
	}
	
	/**
	 * 	Update X360AMcsMdsAdjAdjAmtDb with the passed value
	 *  Corresponding COBOL Variable is X360-A-MCS-MDS-ADJ-ADJ-AMT-DB
	 *	@param number
	 */
	public void setX360AMcsMdsAdjAdjAmtDb(long number) {
			x360AMcsMdsAdjAdjAmtDb = checkX360AMcsMdsAdjAdjAmtDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AMcsMdsAdjAdjAmtDb(x360AMcsMdsAdjAdjAmtDb);
	}


	/**
	 *	Returns the value of x360AMcsMdsCnvRte
	 *	@return x360AMcsMdsCnvRte
	 */
	public long getX360AMcsMdsCnvRte() throws CFException {
       if (isX360AMcsMdsCnvRteModified()) { 
           x360AMcsMdsCnvRte = refreshX360AMcsMdsCnvRte();
        }
   		return x360AMcsMdsCnvRte;
	}
	

	
	   
	/**
	 * 	Update X360AMcsMdsCnvRte with the passed value
	 *  Corresponding COBOL Variable is X360-A-MCS-MDS-CNV-RTE
	 *	@param number
	 */
	public void setX360AMcsMdsCnvRte(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360AMcsMdsCnvRte = checkX360AMcsMdsCnvRteMaxLimit(number); 
		serializeX360AMcsMdsCnvRte(x360AMcsMdsCnvRte);
	}
	

	/**
	 * 	Update X360AMcsMdsCnvRte with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360AMcsMdsCnvRte(char[] value) throws CFException {
		 x360AMcsMdsCnvRte = serializeX360AMcsMdsCnvRte(value);
	}
	/**
	 * 	Update X360AMcsMdsCnvRte with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360AMcsMdsCnvRteString(char[] value) throws CFException {
		 setX360AMcsMdsCnvRte(value);
	}
	public long getX360AMcsMdsMccrAmt() throws CFException {
        if (isX360AMcsMdsMccrAmtModified()) { 
           x360AMcsMdsMccrAmt = refreshX360AMcsMdsMccrAmt();
        }
   		return x360AMcsMdsMccrAmt;
	}
	
	/**
	 * 	Update X360AMcsMdsMccrAmt with the passed value
	 *  Corresponding COBOL Variable is X360-A-MCS-MDS-MCCR-AMT
	 *	@param number
	 */
	public void setX360AMcsMdsMccrAmt(long number) {
			x360AMcsMdsMccrAmt = checkX360AMcsMdsMccrAmtMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AMcsMdsMccrAmt(x360AMcsMdsMccrAmt);
	}


	/**
	 *	Returns the value of x360AMcsMdsCnvMccr
	 *	@return x360AMcsMdsCnvMccr
	 */
	public long getX360AMcsMdsCnvMccr() throws CFException {
       if (isX360AMcsMdsCnvMccrModified()) { 
           x360AMcsMdsCnvMccr = refreshX360AMcsMdsCnvMccr();
        }
   		return x360AMcsMdsCnvMccr;
	}
	

	
	   
	/**
	 * 	Update X360AMcsMdsCnvMccr with the passed value
	 *  Corresponding COBOL Variable is X360-A-MCS-MDS-CNV-MCCR
	 *	@param number
	 */
	public void setX360AMcsMdsCnvMccr(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360AMcsMdsCnvMccr = checkX360AMcsMdsCnvMccrMaxLimit(number); 
		serializeX360AMcsMdsCnvMccr(x360AMcsMdsCnvMccr);
	}
	

	/**
	 * 	Update X360AMcsMdsCnvMccr with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360AMcsMdsCnvMccr(char[] value) throws CFException {
		 x360AMcsMdsCnvMccr = serializeX360AMcsMdsCnvMccr(value);
	}
	/**
	 * 	Update X360AMcsMdsCnvMccr with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360AMcsMdsCnvMccrString(char[] value) throws CFException {
		 setX360AMcsMdsCnvMccr(value);
	}
	public long getX360AMcsMdsIccrAmt() throws CFException {
        if (isX360AMcsMdsIccrAmtModified()) { 
           x360AMcsMdsIccrAmt = refreshX360AMcsMdsIccrAmt();
        }
   		return x360AMcsMdsIccrAmt;
	}
	
	/**
	 * 	Update X360AMcsMdsIccrAmt with the passed value
	 *  Corresponding COBOL Variable is X360-A-MCS-MDS-ICCR-AMT
	 *	@param number
	 */
	public void setX360AMcsMdsIccrAmt(long number) {
			x360AMcsMdsIccrAmt = checkX360AMcsMdsIccrAmtMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AMcsMdsIccrAmt(x360AMcsMdsIccrAmt);
	}


	/**
	 *	Returns the value of x360AMcsMdsCnvIccr
	 *	@return x360AMcsMdsCnvIccr
	 */
	public long getX360AMcsMdsCnvIccr() throws CFException {
       if (isX360AMcsMdsCnvIccrModified()) { 
           x360AMcsMdsCnvIccr = refreshX360AMcsMdsCnvIccr();
        }
   		return x360AMcsMdsCnvIccr;
	}
	

	
	   
	/**
	 * 	Update X360AMcsMdsCnvIccr with the passed value
	 *  Corresponding COBOL Variable is X360-A-MCS-MDS-CNV-ICCR
	 *	@param number
	 */
	public void setX360AMcsMdsCnvIccr(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360AMcsMdsCnvIccr = checkX360AMcsMdsCnvIccrMaxLimit(number); 
		serializeX360AMcsMdsCnvIccr(x360AMcsMdsCnvIccr);
	}
	

	/**
	 * 	Update X360AMcsMdsCnvIccr with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360AMcsMdsCnvIccr(char[] value) throws CFException {
		 x360AMcsMdsCnvIccr = serializeX360AMcsMdsCnvIccr(value);
	}
	/**
	 * 	Update X360AMcsMdsCnvIccr with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360AMcsMdsCnvIccrString(char[] value) throws CFException {
		 setX360AMcsMdsCnvIccr(value);
	}
	public long getX360ABaseIfeeAmtIssCr() throws CFException {
        if (isX360ABaseIfeeAmtIssCrModified()) { 
           x360ABaseIfeeAmtIssCr = refreshX360ABaseIfeeAmtIssCr();
        }
   		return x360ABaseIfeeAmtIssCr;
	}
	
	/**
	 * 	Update X360ABaseIfeeAmtIssCr with the passed value
	 *  Corresponding COBOL Variable is X360-A-BASE-IFEE-AMT-ISS-CR
	 *	@param number
	 */
	public void setX360ABaseIfeeAmtIssCr(long number) {
			x360ABaseIfeeAmtIssCr = checkX360ABaseIfeeAmtIssCrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360ABaseIfeeAmtIssCr(x360ABaseIfeeAmtIssCr);
	}


	public long getX360ABaseIfeeAmtIssDb() throws CFException {
        if (isX360ABaseIfeeAmtIssDbModified()) { 
           x360ABaseIfeeAmtIssDb = refreshX360ABaseIfeeAmtIssDb();
        }
   		return x360ABaseIfeeAmtIssDb;
	}
	
	/**
	 * 	Update X360ABaseIfeeAmtIssDb with the passed value
	 *  Corresponding COBOL Variable is X360-A-BASE-IFEE-AMT-ISS-DB
	 *	@param number
	 */
	public void setX360ABaseIfeeAmtIssDb(long number) {
			x360ABaseIfeeAmtIssDb = checkX360ABaseIfeeAmtIssDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360ABaseIfeeAmtIssDb(x360ABaseIfeeAmtIssDb);
	}


	/**
	 *	Returns the value of x360ABseToLocRate
	 *	@return x360ABseToLocRate
	 */
	public BigDecimal getX360ABseToLocRate() throws CFException {
       if (isX360ABseToLocRateModified()) { 
           x360ABseToLocRate = refreshX360ABseToLocRate();
        }
   		return x360ABseToLocRate;
	}
	

	
	   
	/**
	 * 	Update X360ABseToLocRate with the passed number
	 *  Corresponding COBOL Variable is X360-A-BSE-TO-LOC-RATE
	 *	@param number
	 */
	public void setX360ABseToLocRate(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       x360ABseToLocRate = checkX360ABseToLocRateMaxLimit(number);
	    serializeX360ABseToLocRate(x360ABseToLocRate);
   }
	/**
	 * 	Update X360ABseToLocRate with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360ABseToLocRate(char[] value) throws CFException {
		 x360ABseToLocRate = serializeX360ABseToLocRate(value);
	}   
	public long getX360ABaseIfeeAmtAcqCr() throws CFException {
        if (isX360ABaseIfeeAmtAcqCrModified()) { 
           x360ABaseIfeeAmtAcqCr = refreshX360ABaseIfeeAmtAcqCr();
        }
   		return x360ABaseIfeeAmtAcqCr;
	}
	
	/**
	 * 	Update X360ABaseIfeeAmtAcqCr with the passed value
	 *  Corresponding COBOL Variable is X360-A-BASE-IFEE-AMT-ACQ-CR
	 *	@param number
	 */
	public void setX360ABaseIfeeAmtAcqCr(long number) {
			x360ABaseIfeeAmtAcqCr = checkX360ABaseIfeeAmtAcqCrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360ABaseIfeeAmtAcqCr(x360ABaseIfeeAmtAcqCr);
	}


	public long getX360ABaseIfeeAmtAcqDb() throws CFException {
        if (isX360ABaseIfeeAmtAcqDbModified()) { 
           x360ABaseIfeeAmtAcqDb = refreshX360ABaseIfeeAmtAcqDb();
        }
   		return x360ABaseIfeeAmtAcqDb;
	}
	
	/**
	 * 	Update X360ABaseIfeeAmtAcqDb with the passed value
	 *  Corresponding COBOL Variable is X360-A-BASE-IFEE-AMT-ACQ-DB
	 *	@param number
	 */
	public void setX360ABaseIfeeAmtAcqDb(long number) {
			x360ABaseIfeeAmtAcqDb = checkX360ABaseIfeeAmtAcqDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360ABaseIfeeAmtAcqDb(x360ABaseIfeeAmtAcqDb);
	}


	public long getX360AAcqA09IfeeAmtCr() throws CFException {
        if (isX360AAcqA09IfeeAmtCrModified()) { 
           x360AAcqA09IfeeAmtCr = refreshX360AAcqA09IfeeAmtCr();
        }
   		return x360AAcqA09IfeeAmtCr;
	}
	
	/**
	 * 	Update X360AAcqA09IfeeAmtCr with the passed value
	 *  Corresponding COBOL Variable is X360-A-ACQ-A09-IFEE-AMT-CR
	 *	@param number
	 */
	public void setX360AAcqA09IfeeAmtCr(long number) {
			x360AAcqA09IfeeAmtCr = checkX360AAcqA09IfeeAmtCrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AAcqA09IfeeAmtCr(x360AAcqA09IfeeAmtCr);
	}


	public long getX360AAcqA09IfeeAmtDb() throws CFException {
        if (isX360AAcqA09IfeeAmtDbModified()) { 
           x360AAcqA09IfeeAmtDb = refreshX360AAcqA09IfeeAmtDb();
        }
   		return x360AAcqA09IfeeAmtDb;
	}
	
	/**
	 * 	Update X360AAcqA09IfeeAmtDb with the passed value
	 *  Corresponding COBOL Variable is X360-A-ACQ-A09-IFEE-AMT-DB
	 *	@param number
	 */
	public void setX360AAcqA09IfeeAmtDb(long number) {
			x360AAcqA09IfeeAmtDb = checkX360AAcqA09IfeeAmtDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AAcqA09IfeeAmtDb(x360AAcqA09IfeeAmtDb);
	}



	
	
	

		public static int getX360AMcsMdsBaseFieldLength() {
			return X_360_AMCS_MDS_BASE_LENGTH;
		}

}
  
