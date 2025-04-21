package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360AMcsIssSetl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:12. using version 5.0.0.256
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class X360AMcsIssSetl extends X360AMcsIssSetlSerialized { 
   

								private int x360AMcsIssApprovedCntCr;

								private int x360AMcsIssApprovedCntDb;

								private int x360AMcsIssDeniedCntCr;

								private int x360AMcsIssDeniedCntDb;

								private long x360AMcsIssAmtCr;

								private long x360AMcsIssAmtDb;

								private long x360AMcsIssCnvRteBse;

								private int x360AMcsIssCurrCde;

								private long x360AMcsIssCnvRteLoc;


								private long x360AMcsIssSetlIca;

								private int x360AIssFinIfeeCnt;

								private int x360AIssNfIfeeCnt;

								private int x360AIssPctIfeeCnt;

								private int x360AIssNobillIfeeCnt;

								private long x360AIssIfeeAmtCr;

								private long x360AIssIfeeAmtDb;

								private long x360AIssOrigAmtCr;

								private long x360AIssOrigAmtDb;

								private long x360AIssNewAmtCr;

								private long x360AIssNewAmtDb;

								private long x360AIssAdjAmtCr;

								private long x360AIssAdjAmtDb;

								private long x360AIssbMccrAmtCr;

								private long x360AIssbMccrAmtDb;

								private long x360AIssbIccrAmtCr;

								private long x360AIssbIccrAmtDb;

								private int x360AIssA09ApprovedCntCr;

								private int x360AIssA09ApprovedCntDb;

								private long x360AIssA09ApprovedAmtCr;

								private long x360AIssA09ApprovedAmtDb;

								private long x360AIssBaseSetlAmtCr;

								private long x360AIssBaseSetlAmtDb;

								private long x360AIssbMccrA09Cr;

								private long x360AIssbMccrA09Db;

								private int x360FaVatIssNfCnt;

								private long x360FaVatIssFinAmt;

								private long x360FaVatIssNfAmt;

								private long x360FaVatIssFinVat;

								private long x360FaVatIssNfVat;
	
	/**
	* Constructor for X360AMcsIssSetl
	**/
    public X360AMcsIssSetl() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for X360AMcsIssSetl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360AMcsIssSetl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	public int getX360AMcsIssApprovedCntCr() throws CFException {
        if (isX360AMcsIssApprovedCntCrModified()) { 
           x360AMcsIssApprovedCntCr = refreshX360AMcsIssApprovedCntCr();
        }
   		return x360AMcsIssApprovedCntCr;
	}
	
	/**
	 * 	Update X360AMcsIssApprovedCntCr with the passed value
	 *  Corresponding COBOL Variable is X360-A-MCS-ISS-APPROVED-CNT-CR
	 *	@param number
	 */
	public void setX360AMcsIssApprovedCntCr(int number) {
			x360AMcsIssApprovedCntCr = checkX360AMcsIssApprovedCntCrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AMcsIssApprovedCntCr(x360AMcsIssApprovedCntCr);
	}


	public void setX360AMcsIssApprovedCntCr(long number) {
	    number = checkX360AMcsIssApprovedCntCrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360AMcsIssApprovedCntCr((int)number);
	}
	
	public int getX360AMcsIssApprovedCntDb() throws CFException {
        if (isX360AMcsIssApprovedCntDbModified()) { 
           x360AMcsIssApprovedCntDb = refreshX360AMcsIssApprovedCntDb();
        }
   		return x360AMcsIssApprovedCntDb;
	}
	
	/**
	 * 	Update X360AMcsIssApprovedCntDb with the passed value
	 *  Corresponding COBOL Variable is X360-A-MCS-ISS-APPROVED-CNT-DB
	 *	@param number
	 */
	public void setX360AMcsIssApprovedCntDb(int number) {
			x360AMcsIssApprovedCntDb = checkX360AMcsIssApprovedCntDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AMcsIssApprovedCntDb(x360AMcsIssApprovedCntDb);
	}


	public void setX360AMcsIssApprovedCntDb(long number) {
	    number = checkX360AMcsIssApprovedCntDbMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360AMcsIssApprovedCntDb((int)number);
	}
	
	public int getX360AMcsIssDeniedCntCr() throws CFException {
        if (isX360AMcsIssDeniedCntCrModified()) { 
           x360AMcsIssDeniedCntCr = refreshX360AMcsIssDeniedCntCr();
        }
   		return x360AMcsIssDeniedCntCr;
	}
	
	/**
	 * 	Update X360AMcsIssDeniedCntCr with the passed value
	 *  Corresponding COBOL Variable is X360-A-MCS-ISS-DENIED-CNT-CR
	 *	@param number
	 */
	public void setX360AMcsIssDeniedCntCr(int number) {
			x360AMcsIssDeniedCntCr = checkX360AMcsIssDeniedCntCrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AMcsIssDeniedCntCr(x360AMcsIssDeniedCntCr);
	}


	public void setX360AMcsIssDeniedCntCr(long number) {
	    number = checkX360AMcsIssDeniedCntCrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360AMcsIssDeniedCntCr((int)number);
	}
	
	public int getX360AMcsIssDeniedCntDb() throws CFException {
        if (isX360AMcsIssDeniedCntDbModified()) { 
           x360AMcsIssDeniedCntDb = refreshX360AMcsIssDeniedCntDb();
        }
   		return x360AMcsIssDeniedCntDb;
	}
	
	/**
	 * 	Update X360AMcsIssDeniedCntDb with the passed value
	 *  Corresponding COBOL Variable is X360-A-MCS-ISS-DENIED-CNT-DB
	 *	@param number
	 */
	public void setX360AMcsIssDeniedCntDb(int number) {
			x360AMcsIssDeniedCntDb = checkX360AMcsIssDeniedCntDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AMcsIssDeniedCntDb(x360AMcsIssDeniedCntDb);
	}


	public void setX360AMcsIssDeniedCntDb(long number) {
	    number = checkX360AMcsIssDeniedCntDbMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360AMcsIssDeniedCntDb((int)number);
	}
	
	public long getX360AMcsIssAmtCr() throws CFException {
        if (isX360AMcsIssAmtCrModified()) { 
           x360AMcsIssAmtCr = refreshX360AMcsIssAmtCr();
        }
   		return x360AMcsIssAmtCr;
	}
	
	/**
	 * 	Update X360AMcsIssAmtCr with the passed value
	 *  Corresponding COBOL Variable is X360-A-MCS-ISS-AMT-CR
	 *	@param number
	 */
	public void setX360AMcsIssAmtCr(long number) {
			x360AMcsIssAmtCr = checkX360AMcsIssAmtCrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AMcsIssAmtCr(x360AMcsIssAmtCr);
	}


	public long getX360AMcsIssAmtDb() throws CFException {
        if (isX360AMcsIssAmtDbModified()) { 
           x360AMcsIssAmtDb = refreshX360AMcsIssAmtDb();
        }
   		return x360AMcsIssAmtDb;
	}
	
	/**
	 * 	Update X360AMcsIssAmtDb with the passed value
	 *  Corresponding COBOL Variable is X360-A-MCS-ISS-AMT-DB
	 *	@param number
	 */
	public void setX360AMcsIssAmtDb(long number) {
			x360AMcsIssAmtDb = checkX360AMcsIssAmtDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AMcsIssAmtDb(x360AMcsIssAmtDb);
	}


	/**
	 *	Returns the value of x360AMcsIssCnvRteBse
	 *	@return x360AMcsIssCnvRteBse
	 */
	public long getX360AMcsIssCnvRteBse() throws CFException {
       if (isX360AMcsIssCnvRteBseModified()) { 
           x360AMcsIssCnvRteBse = refreshX360AMcsIssCnvRteBse();
        }
   		return x360AMcsIssCnvRteBse;
	}
	

	
	   
	/**
	 * 	Update X360AMcsIssCnvRteBse with the passed value
	 *  Corresponding COBOL Variable is X360-A-MCS-ISS-CNV-RTE-BSE
	 *	@param number
	 */
	public void setX360AMcsIssCnvRteBse(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360AMcsIssCnvRteBse = checkX360AMcsIssCnvRteBseMaxLimit(number); 
		serializeX360AMcsIssCnvRteBse(x360AMcsIssCnvRteBse);
	}
	

	/**
	 * 	Update X360AMcsIssCnvRteBse with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360AMcsIssCnvRteBse(char[] value) throws CFException {
		 x360AMcsIssCnvRteBse = serializeX360AMcsIssCnvRteBse(value);
	}
	/**
	 * 	Update X360AMcsIssCnvRteBse with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360AMcsIssCnvRteBseString(char[] value) throws CFException {
		 setX360AMcsIssCnvRteBse(value);
	}
	/**
	 *	Returns the value of x360AMcsIssCurrCde
	 *	@return x360AMcsIssCurrCde
	 */
	public int getX360AMcsIssCurrCde() throws CFException {
       if (isX360AMcsIssCurrCdeModified()) { 
           x360AMcsIssCurrCde = refreshX360AMcsIssCurrCde();
        }
   		return x360AMcsIssCurrCde;
	}
	

	
	   
	/**
	 * 	Update X360AMcsIssCurrCde with the passed value
	 *  Corresponding COBOL Variable is X360-A-MCS-ISS-CURR-CDE
	 *	@param number
	 */
	public void setX360AMcsIssCurrCde(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360AMcsIssCurrCde = checkX360AMcsIssCurrCdeMaxLimit(number); 
		serializeX360AMcsIssCurrCde(x360AMcsIssCurrCde);
	}
	

	public void setX360AMcsIssCurrCde(long number) {
	    number = checkX360AMcsIssCurrCdeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360AMcsIssCurrCde((int)number);
	}
	
	/**
	 * 	Update X360AMcsIssCurrCde with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360AMcsIssCurrCde(char[] value) throws CFException {
		 x360AMcsIssCurrCde = serializeX360AMcsIssCurrCde(value);
	}
	/**
	 * 	Update X360AMcsIssCurrCde with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360AMcsIssCurrCdeString(char[] value) throws CFException {
		 setX360AMcsIssCurrCde(value);
	}
	/**
	 *	Returns the value of x360AMcsIssCnvRteLoc
	 *	@return x360AMcsIssCnvRteLoc
	 */
	public long getX360AMcsIssCnvRteLoc() throws CFException {
       if (isX360AMcsIssCnvRteLocModified()) { 
           x360AMcsIssCnvRteLoc = refreshX360AMcsIssCnvRteLoc();
        }
   		return x360AMcsIssCnvRteLoc;
	}
	

	
	   
	/**
	 * 	Update X360AMcsIssCnvRteLoc with the passed value
	 *  Corresponding COBOL Variable is X360-A-MCS-ISS-CNV-RTE-LOC
	 *	@param number
	 */
	public void setX360AMcsIssCnvRteLoc(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360AMcsIssCnvRteLoc = checkX360AMcsIssCnvRteLocMaxLimit(number); 
		serializeX360AMcsIssCnvRteLoc(x360AMcsIssCnvRteLoc);
	}
	

	/**
	 * 	Update X360AMcsIssCnvRteLoc with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360AMcsIssCnvRteLoc(char[] value) throws CFException {
		 x360AMcsIssCnvRteLoc = serializeX360AMcsIssCnvRteLoc(value);
	}
	/**
	 * 	Update X360AMcsIssCnvRteLoc with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360AMcsIssCnvRteLocString(char[] value) throws CFException {
		 setX360AMcsIssCnvRteLoc(value);
	}
	/**
	 *	Returns the value of x360AMcsIssSetlIca
	 *	@return x360AMcsIssSetlIca
	 */
	public long getX360AMcsIssSetlIca() throws CFException {
       if (isX360AMcsIssSetlIcaModified()) { 
           x360AMcsIssSetlIca = refreshX360AMcsIssSetlIca();
        }
   		return x360AMcsIssSetlIca;
	}
	

	
	   
	/**
	 * 	Update X360AMcsIssSetlIca with the passed value
	 *  Corresponding COBOL Variable is X360-A-MCS-ISS-SETL-ICA
	 *	@param number
	 */
	public void setX360AMcsIssSetlIca(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360AMcsIssSetlIca = checkX360AMcsIssSetlIcaMaxLimit(number); 
		serializeX360AMcsIssSetlIca(x360AMcsIssSetlIca);
	}
	

	/**
	 * 	Update X360AMcsIssSetlIca with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360AMcsIssSetlIca(char[] value) throws CFException {
		 x360AMcsIssSetlIca = serializeX360AMcsIssSetlIca(value);
	}
	/**
	 * 	Update X360AMcsIssSetlIca with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360AMcsIssSetlIcaString(char[] value) throws CFException {
		 setX360AMcsIssSetlIca(value);
	}
	public int getX360AIssFinIfeeCnt() throws CFException {
        if (isX360AIssFinIfeeCntModified()) { 
           x360AIssFinIfeeCnt = refreshX360AIssFinIfeeCnt();
        }
   		return x360AIssFinIfeeCnt;
	}
	
	/**
	 * 	Update X360AIssFinIfeeCnt with the passed value
	 *  Corresponding COBOL Variable is X360-A-ISS-FIN-IFEE-CNT
	 *	@param number
	 */
	public void setX360AIssFinIfeeCnt(int number) {
			x360AIssFinIfeeCnt = checkX360AIssFinIfeeCntMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AIssFinIfeeCnt(x360AIssFinIfeeCnt);
	}


	public void setX360AIssFinIfeeCnt(long number) {
	    number = checkX360AIssFinIfeeCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360AIssFinIfeeCnt((int)number);
	}
	
	public int getX360AIssNfIfeeCnt() throws CFException {
        if (isX360AIssNfIfeeCntModified()) { 
           x360AIssNfIfeeCnt = refreshX360AIssNfIfeeCnt();
        }
   		return x360AIssNfIfeeCnt;
	}
	
	/**
	 * 	Update X360AIssNfIfeeCnt with the passed value
	 *  Corresponding COBOL Variable is X360-A-ISS-NF-IFEE-CNT
	 *	@param number
	 */
	public void setX360AIssNfIfeeCnt(int number) {
			x360AIssNfIfeeCnt = checkX360AIssNfIfeeCntMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AIssNfIfeeCnt(x360AIssNfIfeeCnt);
	}


	public void setX360AIssNfIfeeCnt(long number) {
	    number = checkX360AIssNfIfeeCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360AIssNfIfeeCnt((int)number);
	}
	
	public int getX360AIssPctIfeeCnt() throws CFException {
        if (isX360AIssPctIfeeCntModified()) { 
           x360AIssPctIfeeCnt = refreshX360AIssPctIfeeCnt();
        }
   		return x360AIssPctIfeeCnt;
	}
	
	/**
	 * 	Update X360AIssPctIfeeCnt with the passed value
	 *  Corresponding COBOL Variable is X360-A-ISS-PCT-IFEE-CNT
	 *	@param number
	 */
	public void setX360AIssPctIfeeCnt(int number) {
			x360AIssPctIfeeCnt = checkX360AIssPctIfeeCntMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AIssPctIfeeCnt(x360AIssPctIfeeCnt);
	}


	public void setX360AIssPctIfeeCnt(long number) {
	    number = checkX360AIssPctIfeeCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360AIssPctIfeeCnt((int)number);
	}
	
	public int getX360AIssNobillIfeeCnt() throws CFException {
        if (isX360AIssNobillIfeeCntModified()) { 
           x360AIssNobillIfeeCnt = refreshX360AIssNobillIfeeCnt();
        }
   		return x360AIssNobillIfeeCnt;
	}
	
	/**
	 * 	Update X360AIssNobillIfeeCnt with the passed value
	 *  Corresponding COBOL Variable is X360-A-ISS-NOBILL-IFEE-CNT
	 *	@param number
	 */
	public void setX360AIssNobillIfeeCnt(int number) {
			x360AIssNobillIfeeCnt = checkX360AIssNobillIfeeCntMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AIssNobillIfeeCnt(x360AIssNobillIfeeCnt);
	}


	public void setX360AIssNobillIfeeCnt(long number) {
	    number = checkX360AIssNobillIfeeCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360AIssNobillIfeeCnt((int)number);
	}
	
	public long getX360AIssIfeeAmtCr() throws CFException {
        if (isX360AIssIfeeAmtCrModified()) { 
           x360AIssIfeeAmtCr = refreshX360AIssIfeeAmtCr();
        }
   		return x360AIssIfeeAmtCr;
	}
	
	/**
	 * 	Update X360AIssIfeeAmtCr with the passed value
	 *  Corresponding COBOL Variable is X360-A-ISS-IFEE-AMT-CR
	 *	@param number
	 */
	public void setX360AIssIfeeAmtCr(long number) {
			x360AIssIfeeAmtCr = checkX360AIssIfeeAmtCrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AIssIfeeAmtCr(x360AIssIfeeAmtCr);
	}


	public long getX360AIssIfeeAmtDb() throws CFException {
        if (isX360AIssIfeeAmtDbModified()) { 
           x360AIssIfeeAmtDb = refreshX360AIssIfeeAmtDb();
        }
   		return x360AIssIfeeAmtDb;
	}
	
	/**
	 * 	Update X360AIssIfeeAmtDb with the passed value
	 *  Corresponding COBOL Variable is X360-A-ISS-IFEE-AMT-DB
	 *	@param number
	 */
	public void setX360AIssIfeeAmtDb(long number) {
			x360AIssIfeeAmtDb = checkX360AIssIfeeAmtDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AIssIfeeAmtDb(x360AIssIfeeAmtDb);
	}


	public long getX360AIssOrigAmtCr() throws CFException {
        if (isX360AIssOrigAmtCrModified()) { 
           x360AIssOrigAmtCr = refreshX360AIssOrigAmtCr();
        }
   		return x360AIssOrigAmtCr;
	}
	
	/**
	 * 	Update X360AIssOrigAmtCr with the passed value
	 *  Corresponding COBOL Variable is X360-A-ISS-ORIG-AMT-CR
	 *	@param number
	 */
	public void setX360AIssOrigAmtCr(long number) {
			x360AIssOrigAmtCr = checkX360AIssOrigAmtCrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AIssOrigAmtCr(x360AIssOrigAmtCr);
	}


	public long getX360AIssOrigAmtDb() throws CFException {
        if (isX360AIssOrigAmtDbModified()) { 
           x360AIssOrigAmtDb = refreshX360AIssOrigAmtDb();
        }
   		return x360AIssOrigAmtDb;
	}
	
	/**
	 * 	Update X360AIssOrigAmtDb with the passed value
	 *  Corresponding COBOL Variable is X360-A-ISS-ORIG-AMT-DB
	 *	@param number
	 */
	public void setX360AIssOrigAmtDb(long number) {
			x360AIssOrigAmtDb = checkX360AIssOrigAmtDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AIssOrigAmtDb(x360AIssOrigAmtDb);
	}


	public long getX360AIssNewAmtCr() throws CFException {
        if (isX360AIssNewAmtCrModified()) { 
           x360AIssNewAmtCr = refreshX360AIssNewAmtCr();
        }
   		return x360AIssNewAmtCr;
	}
	
	/**
	 * 	Update X360AIssNewAmtCr with the passed value
	 *  Corresponding COBOL Variable is X360-A-ISS-NEW-AMT-CR
	 *	@param number
	 */
	public void setX360AIssNewAmtCr(long number) {
			x360AIssNewAmtCr = checkX360AIssNewAmtCrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AIssNewAmtCr(x360AIssNewAmtCr);
	}


	public long getX360AIssNewAmtDb() throws CFException {
        if (isX360AIssNewAmtDbModified()) { 
           x360AIssNewAmtDb = refreshX360AIssNewAmtDb();
        }
   		return x360AIssNewAmtDb;
	}
	
	/**
	 * 	Update X360AIssNewAmtDb with the passed value
	 *  Corresponding COBOL Variable is X360-A-ISS-NEW-AMT-DB
	 *	@param number
	 */
	public void setX360AIssNewAmtDb(long number) {
			x360AIssNewAmtDb = checkX360AIssNewAmtDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AIssNewAmtDb(x360AIssNewAmtDb);
	}


	public long getX360AIssAdjAmtCr() throws CFException {
        if (isX360AIssAdjAmtCrModified()) { 
           x360AIssAdjAmtCr = refreshX360AIssAdjAmtCr();
        }
   		return x360AIssAdjAmtCr;
	}
	
	/**
	 * 	Update X360AIssAdjAmtCr with the passed value
	 *  Corresponding COBOL Variable is X360-A-ISS-ADJ-AMT-CR
	 *	@param number
	 */
	public void setX360AIssAdjAmtCr(long number) {
			x360AIssAdjAmtCr = checkX360AIssAdjAmtCrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AIssAdjAmtCr(x360AIssAdjAmtCr);
	}


	public long getX360AIssAdjAmtDb() throws CFException {
        if (isX360AIssAdjAmtDbModified()) { 
           x360AIssAdjAmtDb = refreshX360AIssAdjAmtDb();
        }
   		return x360AIssAdjAmtDb;
	}
	
	/**
	 * 	Update X360AIssAdjAmtDb with the passed value
	 *  Corresponding COBOL Variable is X360-A-ISS-ADJ-AMT-DB
	 *	@param number
	 */
	public void setX360AIssAdjAmtDb(long number) {
			x360AIssAdjAmtDb = checkX360AIssAdjAmtDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AIssAdjAmtDb(x360AIssAdjAmtDb);
	}


	public long getX360AIssbMccrAmtCr() throws CFException {
        if (isX360AIssbMccrAmtCrModified()) { 
           x360AIssbMccrAmtCr = refreshX360AIssbMccrAmtCr();
        }
   		return x360AIssbMccrAmtCr;
	}
	
	/**
	 * 	Update X360AIssbMccrAmtCr with the passed value
	 *  Corresponding COBOL Variable is X360-A-ISSB-MCCR-AMT-CR
	 *	@param number
	 */
	public void setX360AIssbMccrAmtCr(long number) {
			x360AIssbMccrAmtCr = checkX360AIssbMccrAmtCrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AIssbMccrAmtCr(x360AIssbMccrAmtCr);
	}


	public long getX360AIssbMccrAmtDb() throws CFException {
        if (isX360AIssbMccrAmtDbModified()) { 
           x360AIssbMccrAmtDb = refreshX360AIssbMccrAmtDb();
        }
   		return x360AIssbMccrAmtDb;
	}
	
	/**
	 * 	Update X360AIssbMccrAmtDb with the passed value
	 *  Corresponding COBOL Variable is X360-A-ISSB-MCCR-AMT-DB
	 *	@param number
	 */
	public void setX360AIssbMccrAmtDb(long number) {
			x360AIssbMccrAmtDb = checkX360AIssbMccrAmtDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AIssbMccrAmtDb(x360AIssbMccrAmtDb);
	}


	public long getX360AIssbIccrAmtCr() throws CFException {
        if (isX360AIssbIccrAmtCrModified()) { 
           x360AIssbIccrAmtCr = refreshX360AIssbIccrAmtCr();
        }
   		return x360AIssbIccrAmtCr;
	}
	
	/**
	 * 	Update X360AIssbIccrAmtCr with the passed value
	 *  Corresponding COBOL Variable is X360-A-ISSB-ICCR-AMT-CR
	 *	@param number
	 */
	public void setX360AIssbIccrAmtCr(long number) {
			x360AIssbIccrAmtCr = checkX360AIssbIccrAmtCrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AIssbIccrAmtCr(x360AIssbIccrAmtCr);
	}


	public long getX360AIssbIccrAmtDb() throws CFException {
        if (isX360AIssbIccrAmtDbModified()) { 
           x360AIssbIccrAmtDb = refreshX360AIssbIccrAmtDb();
        }
   		return x360AIssbIccrAmtDb;
	}
	
	/**
	 * 	Update X360AIssbIccrAmtDb with the passed value
	 *  Corresponding COBOL Variable is X360-A-ISSB-ICCR-AMT-DB
	 *	@param number
	 */
	public void setX360AIssbIccrAmtDb(long number) {
			x360AIssbIccrAmtDb = checkX360AIssbIccrAmtDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AIssbIccrAmtDb(x360AIssbIccrAmtDb);
	}


	public int getX360AIssA09ApprovedCntCr() throws CFException {
        if (isX360AIssA09ApprovedCntCrModified()) { 
           x360AIssA09ApprovedCntCr = refreshX360AIssA09ApprovedCntCr();
        }
   		return x360AIssA09ApprovedCntCr;
	}
	
	/**
	 * 	Update X360AIssA09ApprovedCntCr with the passed value
	 *  Corresponding COBOL Variable is X360-A-ISS-A09-APPROVED-CNT-CR
	 *	@param number
	 */
	public void setX360AIssA09ApprovedCntCr(int number) {
			x360AIssA09ApprovedCntCr = checkX360AIssA09ApprovedCntCrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AIssA09ApprovedCntCr(x360AIssA09ApprovedCntCr);
	}


	public void setX360AIssA09ApprovedCntCr(long number) {
	    number = checkX360AIssA09ApprovedCntCrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360AIssA09ApprovedCntCr((int)number);
	}
	
	public int getX360AIssA09ApprovedCntDb() throws CFException {
        if (isX360AIssA09ApprovedCntDbModified()) { 
           x360AIssA09ApprovedCntDb = refreshX360AIssA09ApprovedCntDb();
        }
   		return x360AIssA09ApprovedCntDb;
	}
	
	/**
	 * 	Update X360AIssA09ApprovedCntDb with the passed value
	 *  Corresponding COBOL Variable is X360-A-ISS-A09-APPROVED-CNT-DB
	 *	@param number
	 */
	public void setX360AIssA09ApprovedCntDb(int number) {
			x360AIssA09ApprovedCntDb = checkX360AIssA09ApprovedCntDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AIssA09ApprovedCntDb(x360AIssA09ApprovedCntDb);
	}


	public void setX360AIssA09ApprovedCntDb(long number) {
	    number = checkX360AIssA09ApprovedCntDbMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360AIssA09ApprovedCntDb((int)number);
	}
	
	public long getX360AIssA09ApprovedAmtCr() throws CFException {
        if (isX360AIssA09ApprovedAmtCrModified()) { 
           x360AIssA09ApprovedAmtCr = refreshX360AIssA09ApprovedAmtCr();
        }
   		return x360AIssA09ApprovedAmtCr;
	}
	
	/**
	 * 	Update X360AIssA09ApprovedAmtCr with the passed value
	 *  Corresponding COBOL Variable is X360-A-ISS-A09-APPROVED-AMT-CR
	 *	@param number
	 */
	public void setX360AIssA09ApprovedAmtCr(long number) {
			x360AIssA09ApprovedAmtCr = checkX360AIssA09ApprovedAmtCrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AIssA09ApprovedAmtCr(x360AIssA09ApprovedAmtCr);
	}


	public long getX360AIssA09ApprovedAmtDb() throws CFException {
        if (isX360AIssA09ApprovedAmtDbModified()) { 
           x360AIssA09ApprovedAmtDb = refreshX360AIssA09ApprovedAmtDb();
        }
   		return x360AIssA09ApprovedAmtDb;
	}
	
	/**
	 * 	Update X360AIssA09ApprovedAmtDb with the passed value
	 *  Corresponding COBOL Variable is X360-A-ISS-A09-APPROVED-AMT-DB
	 *	@param number
	 */
	public void setX360AIssA09ApprovedAmtDb(long number) {
			x360AIssA09ApprovedAmtDb = checkX360AIssA09ApprovedAmtDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AIssA09ApprovedAmtDb(x360AIssA09ApprovedAmtDb);
	}


	public long getX360AIssBaseSetlAmtCr() throws CFException {
        if (isX360AIssBaseSetlAmtCrModified()) { 
           x360AIssBaseSetlAmtCr = refreshX360AIssBaseSetlAmtCr();
        }
   		return x360AIssBaseSetlAmtCr;
	}
	
	/**
	 * 	Update X360AIssBaseSetlAmtCr with the passed value
	 *  Corresponding COBOL Variable is X360-A-ISS-BASE-SETL-AMT-CR
	 *	@param number
	 */
	public void setX360AIssBaseSetlAmtCr(long number) {
			x360AIssBaseSetlAmtCr = checkX360AIssBaseSetlAmtCrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AIssBaseSetlAmtCr(x360AIssBaseSetlAmtCr);
	}


	public long getX360AIssBaseSetlAmtDb() throws CFException {
        if (isX360AIssBaseSetlAmtDbModified()) { 
           x360AIssBaseSetlAmtDb = refreshX360AIssBaseSetlAmtDb();
        }
   		return x360AIssBaseSetlAmtDb;
	}
	
	/**
	 * 	Update X360AIssBaseSetlAmtDb with the passed value
	 *  Corresponding COBOL Variable is X360-A-ISS-BASE-SETL-AMT-DB
	 *	@param number
	 */
	public void setX360AIssBaseSetlAmtDb(long number) {
			x360AIssBaseSetlAmtDb = checkX360AIssBaseSetlAmtDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AIssBaseSetlAmtDb(x360AIssBaseSetlAmtDb);
	}


	public long getX360AIssbMccrA09Cr() throws CFException {
        if (isX360AIssbMccrA09CrModified()) { 
           x360AIssbMccrA09Cr = refreshX360AIssbMccrA09Cr();
        }
   		return x360AIssbMccrA09Cr;
	}
	
	/**
	 * 	Update X360AIssbMccrA09Cr with the passed value
	 *  Corresponding COBOL Variable is X360-A-ISSB-MCCR-A09-CR
	 *	@param number
	 */
	public void setX360AIssbMccrA09Cr(long number) {
			x360AIssbMccrA09Cr = checkX360AIssbMccrA09CrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AIssbMccrA09Cr(x360AIssbMccrA09Cr);
	}


	public long getX360AIssbMccrA09Db() throws CFException {
        if (isX360AIssbMccrA09DbModified()) { 
           x360AIssbMccrA09Db = refreshX360AIssbMccrA09Db();
        }
   		return x360AIssbMccrA09Db;
	}
	
	/**
	 * 	Update X360AIssbMccrA09Db with the passed value
	 *  Corresponding COBOL Variable is X360-A-ISSB-MCCR-A09-DB
	 *	@param number
	 */
	public void setX360AIssbMccrA09Db(long number) {
			x360AIssbMccrA09Db = checkX360AIssbMccrA09DbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AIssbMccrA09Db(x360AIssbMccrA09Db);
	}


	public int getX360FaVatIssNfCnt() throws CFException {
        if (isX360FaVatIssNfCntModified()) { 
           x360FaVatIssNfCnt = refreshX360FaVatIssNfCnt();
        }
   		return x360FaVatIssNfCnt;
	}
	
	/**
	 * 	Update X360FaVatIssNfCnt with the passed value
	 *  Corresponding COBOL Variable is X360-FA-VAT-ISS-NF-CNT
	 *	@param number
	 */
	public void setX360FaVatIssNfCnt(int number) {
			x360FaVatIssNfCnt = checkX360FaVatIssNfCntMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FaVatIssNfCnt(x360FaVatIssNfCnt);
	}


	public void setX360FaVatIssNfCnt(long number) {
	    number = checkX360FaVatIssNfCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360FaVatIssNfCnt((int)number);
	}
	
	public long getX360FaVatIssFinAmt() throws CFException {
        if (isX360FaVatIssFinAmtModified()) { 
           x360FaVatIssFinAmt = refreshX360FaVatIssFinAmt();
        }
   		return x360FaVatIssFinAmt;
	}
	
	/**
	 * 	Update X360FaVatIssFinAmt with the passed value
	 *  Corresponding COBOL Variable is X360-FA-VAT-ISS-FIN-AMT
	 *	@param number
	 */
	public void setX360FaVatIssFinAmt(long number) {
			x360FaVatIssFinAmt = checkX360FaVatIssFinAmtMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FaVatIssFinAmt(x360FaVatIssFinAmt);
	}


	public long getX360FaVatIssNfAmt() throws CFException {
        if (isX360FaVatIssNfAmtModified()) { 
           x360FaVatIssNfAmt = refreshX360FaVatIssNfAmt();
        }
   		return x360FaVatIssNfAmt;
	}
	
	/**
	 * 	Update X360FaVatIssNfAmt with the passed value
	 *  Corresponding COBOL Variable is X360-FA-VAT-ISS-NF-AMT
	 *	@param number
	 */
	public void setX360FaVatIssNfAmt(long number) {
			x360FaVatIssNfAmt = checkX360FaVatIssNfAmtMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FaVatIssNfAmt(x360FaVatIssNfAmt);
	}


	public long getX360FaVatIssFinVat() throws CFException {
        if (isX360FaVatIssFinVatModified()) { 
           x360FaVatIssFinVat = refreshX360FaVatIssFinVat();
        }
   		return x360FaVatIssFinVat;
	}
	
	/**
	 * 	Update X360FaVatIssFinVat with the passed value
	 *  Corresponding COBOL Variable is X360-FA-VAT-ISS-FIN-VAT
	 *	@param number
	 */
	public void setX360FaVatIssFinVat(long number) {
			x360FaVatIssFinVat = checkX360FaVatIssFinVatMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FaVatIssFinVat(x360FaVatIssFinVat);
	}


	public long getX360FaVatIssNfVat() throws CFException {
        if (isX360FaVatIssNfVatModified()) { 
           x360FaVatIssNfVat = refreshX360FaVatIssNfVat();
        }
   		return x360FaVatIssNfVat;
	}
	
	/**
	 * 	Update X360FaVatIssNfVat with the passed value
	 *  Corresponding COBOL Variable is X360-FA-VAT-ISS-NF-VAT
	 *	@param number
	 */
	public void setX360FaVatIssNfVat(long number) {
			x360FaVatIssNfVat = checkX360FaVatIssNfVatMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FaVatIssNfVat(x360FaVatIssNfVat);
	}



	
	
	

		public static int getX360AMcsIssSetlFieldLength() {
			return X_360_AMCS_ISS_SETL_LENGTH;
		}

}
  
