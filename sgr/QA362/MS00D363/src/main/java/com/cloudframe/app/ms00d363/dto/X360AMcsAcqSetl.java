package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360AMcsAcqSetl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class X360AMcsAcqSetl extends X360AMcsAcqSetlSerialized { 
   

								private int x360AMcsAcqApprovedCntCr;

								private int x360AMcsAcqApprovedCntDb;

								private int x360AMcsAcqDeniedCntCr;

								private int x360AMcsAcqDeniedCntDb;

								private long x360AMcsAcqAmtCr;

								private long x360AMcsAcqAmtDb;

								private long x360AMcsAcqCnvRteBse;

								private int x360AMcsAcqCurrCde;

								private long x360AMcsAcqCnvRteLoc;


								private long x360AMcsAcqSetlIca;

								private int x360AAcqFinIfeeCnt;

								private int x360AAcqNfIfeeCnt;

								private int x360AAcqPctIfeeCnt;

								private int x360AAcqNobillIfeeCnt;

								private long x360AAcqIfeeAmtCr;

								private long x360AAcqIfeeAmtDb;

								private long x360AAcqOrigAmtCr;

								private long x360AAcqOrigAmtDb;

								private long x360AAcqNewAmtCr;

								private long x360AAcqNewAmtDb;

								private long x360AAcqAdjAmtCr;

								private long x360AAcqAdjAmtDb;

								private long x360AAcqMccrAmtCrNotused;

								private long x360AAcqMccrAmtDbNotused;

								private long x360AAcqIccrAmtCrNotused;

								private long x360AAcqIccrAmtDbNotused;

								private int x360AAcqA09ApprovedCntCr;

								private int x360AAcqA09ApprovedCntDb;

								private long x360AAcqA09ApprovedAmtCr;

								private long x360AAcqA09ApprovedAmtDb;

								private long x360AAcqBaseSetlAmtCr;

								private long x360AAcqBaseSetlAmtDb;

								private long x360AAcqMccrA09CrNotused;

								private long x360AAcqMccrA09DbNotused;

								private int x360FaVatAcqNfCnt;

								private long x360FaVatAcqFinAmt;

								private long x360FaVatAcqNfAmt;

								private long x360FaVatAcqFinVat;

								private long x360FaVatAcqNfVat;
	
	/**
	* Constructor for X360AMcsAcqSetl
	**/
    public X360AMcsAcqSetl() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for X360AMcsAcqSetl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360AMcsAcqSetl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	public int getX360AMcsAcqApprovedCntCr() throws CFException {
        if (isX360AMcsAcqApprovedCntCrModified()) { 
           x360AMcsAcqApprovedCntCr = refreshX360AMcsAcqApprovedCntCr();
        }
   		return x360AMcsAcqApprovedCntCr;
	}
	
	/**
	 * 	Update X360AMcsAcqApprovedCntCr with the passed value
	 *  Corresponding COBOL Variable is X360-A-MCS-ACQ-APPROVED-CNT-CR
	 *	@param number
	 */
	public void setX360AMcsAcqApprovedCntCr(int number) {
			x360AMcsAcqApprovedCntCr = checkX360AMcsAcqApprovedCntCrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AMcsAcqApprovedCntCr(x360AMcsAcqApprovedCntCr);
	}


	public void setX360AMcsAcqApprovedCntCr(long number) {
	    number = checkX360AMcsAcqApprovedCntCrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360AMcsAcqApprovedCntCr((int)number);
	}
	
	public int getX360AMcsAcqApprovedCntDb() throws CFException {
        if (isX360AMcsAcqApprovedCntDbModified()) { 
           x360AMcsAcqApprovedCntDb = refreshX360AMcsAcqApprovedCntDb();
        }
   		return x360AMcsAcqApprovedCntDb;
	}
	
	/**
	 * 	Update X360AMcsAcqApprovedCntDb with the passed value
	 *  Corresponding COBOL Variable is X360-A-MCS-ACQ-APPROVED-CNT-DB
	 *	@param number
	 */
	public void setX360AMcsAcqApprovedCntDb(int number) {
			x360AMcsAcqApprovedCntDb = checkX360AMcsAcqApprovedCntDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AMcsAcqApprovedCntDb(x360AMcsAcqApprovedCntDb);
	}


	public void setX360AMcsAcqApprovedCntDb(long number) {
	    number = checkX360AMcsAcqApprovedCntDbMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360AMcsAcqApprovedCntDb((int)number);
	}
	
	public int getX360AMcsAcqDeniedCntCr() throws CFException {
        if (isX360AMcsAcqDeniedCntCrModified()) { 
           x360AMcsAcqDeniedCntCr = refreshX360AMcsAcqDeniedCntCr();
        }
   		return x360AMcsAcqDeniedCntCr;
	}
	
	/**
	 * 	Update X360AMcsAcqDeniedCntCr with the passed value
	 *  Corresponding COBOL Variable is X360-A-MCS-ACQ-DENIED-CNT-CR
	 *	@param number
	 */
	public void setX360AMcsAcqDeniedCntCr(int number) {
			x360AMcsAcqDeniedCntCr = checkX360AMcsAcqDeniedCntCrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AMcsAcqDeniedCntCr(x360AMcsAcqDeniedCntCr);
	}


	public void setX360AMcsAcqDeniedCntCr(long number) {
	    number = checkX360AMcsAcqDeniedCntCrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360AMcsAcqDeniedCntCr((int)number);
	}
	
	public int getX360AMcsAcqDeniedCntDb() throws CFException {
        if (isX360AMcsAcqDeniedCntDbModified()) { 
           x360AMcsAcqDeniedCntDb = refreshX360AMcsAcqDeniedCntDb();
        }
   		return x360AMcsAcqDeniedCntDb;
	}
	
	/**
	 * 	Update X360AMcsAcqDeniedCntDb with the passed value
	 *  Corresponding COBOL Variable is X360-A-MCS-ACQ-DENIED-CNT-DB
	 *	@param number
	 */
	public void setX360AMcsAcqDeniedCntDb(int number) {
			x360AMcsAcqDeniedCntDb = checkX360AMcsAcqDeniedCntDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AMcsAcqDeniedCntDb(x360AMcsAcqDeniedCntDb);
	}


	public void setX360AMcsAcqDeniedCntDb(long number) {
	    number = checkX360AMcsAcqDeniedCntDbMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360AMcsAcqDeniedCntDb((int)number);
	}
	
	public long getX360AMcsAcqAmtCr() throws CFException {
        if (isX360AMcsAcqAmtCrModified()) { 
           x360AMcsAcqAmtCr = refreshX360AMcsAcqAmtCr();
        }
   		return x360AMcsAcqAmtCr;
	}
	
	/**
	 * 	Update X360AMcsAcqAmtCr with the passed value
	 *  Corresponding COBOL Variable is X360-A-MCS-ACQ-AMT-CR
	 *	@param number
	 */
	public void setX360AMcsAcqAmtCr(long number) {
			x360AMcsAcqAmtCr = checkX360AMcsAcqAmtCrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AMcsAcqAmtCr(x360AMcsAcqAmtCr);
	}


	public long getX360AMcsAcqAmtDb() throws CFException {
        if (isX360AMcsAcqAmtDbModified()) { 
           x360AMcsAcqAmtDb = refreshX360AMcsAcqAmtDb();
        }
   		return x360AMcsAcqAmtDb;
	}
	
	/**
	 * 	Update X360AMcsAcqAmtDb with the passed value
	 *  Corresponding COBOL Variable is X360-A-MCS-ACQ-AMT-DB
	 *	@param number
	 */
	public void setX360AMcsAcqAmtDb(long number) {
			x360AMcsAcqAmtDb = checkX360AMcsAcqAmtDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AMcsAcqAmtDb(x360AMcsAcqAmtDb);
	}


	/**
	 *	Returns the value of x360AMcsAcqCnvRteBse
	 *	@return x360AMcsAcqCnvRteBse
	 */
	public long getX360AMcsAcqCnvRteBse() throws CFException {
       if (isX360AMcsAcqCnvRteBseModified()) { 
           x360AMcsAcqCnvRteBse = refreshX360AMcsAcqCnvRteBse();
        }
   		return x360AMcsAcqCnvRteBse;
	}
	

	
	   
	/**
	 * 	Update X360AMcsAcqCnvRteBse with the passed value
	 *  Corresponding COBOL Variable is X360-A-MCS-ACQ-CNV-RTE-BSE
	 *	@param number
	 */
	public void setX360AMcsAcqCnvRteBse(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360AMcsAcqCnvRteBse = checkX360AMcsAcqCnvRteBseMaxLimit(number); 
		serializeX360AMcsAcqCnvRteBse(x360AMcsAcqCnvRteBse);
	}
	

	/**
	 * 	Update X360AMcsAcqCnvRteBse with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360AMcsAcqCnvRteBse(char[] value) throws CFException {
		 x360AMcsAcqCnvRteBse = serializeX360AMcsAcqCnvRteBse(value);
	}
	/**
	 * 	Update X360AMcsAcqCnvRteBse with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360AMcsAcqCnvRteBseString(char[] value) throws CFException {
		 setX360AMcsAcqCnvRteBse(value);
	}
	/**
	 *	Returns the value of x360AMcsAcqCurrCde
	 *	@return x360AMcsAcqCurrCde
	 */
	public int getX360AMcsAcqCurrCde() throws CFException {
       if (isX360AMcsAcqCurrCdeModified()) { 
           x360AMcsAcqCurrCde = refreshX360AMcsAcqCurrCde();
        }
   		return x360AMcsAcqCurrCde;
	}
	

	
	   
	/**
	 * 	Update X360AMcsAcqCurrCde with the passed value
	 *  Corresponding COBOL Variable is X360-A-MCS-ACQ-CURR-CDE
	 *	@param number
	 */
	public void setX360AMcsAcqCurrCde(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360AMcsAcqCurrCde = checkX360AMcsAcqCurrCdeMaxLimit(number); 
		serializeX360AMcsAcqCurrCde(x360AMcsAcqCurrCde);
	}
	

	public void setX360AMcsAcqCurrCde(long number) {
	    number = checkX360AMcsAcqCurrCdeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360AMcsAcqCurrCde((int)number);
	}
	
	/**
	 * 	Update X360AMcsAcqCurrCde with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360AMcsAcqCurrCde(char[] value) throws CFException {
		 x360AMcsAcqCurrCde = serializeX360AMcsAcqCurrCde(value);
	}
	/**
	 * 	Update X360AMcsAcqCurrCde with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360AMcsAcqCurrCdeString(char[] value) throws CFException {
		 setX360AMcsAcqCurrCde(value);
	}
	/**
	 *	Returns the value of x360AMcsAcqCnvRteLoc
	 *	@return x360AMcsAcqCnvRteLoc
	 */
	public long getX360AMcsAcqCnvRteLoc() throws CFException {
       if (isX360AMcsAcqCnvRteLocModified()) { 
           x360AMcsAcqCnvRteLoc = refreshX360AMcsAcqCnvRteLoc();
        }
   		return x360AMcsAcqCnvRteLoc;
	}
	

	
	   
	/**
	 * 	Update X360AMcsAcqCnvRteLoc with the passed value
	 *  Corresponding COBOL Variable is X360-A-MCS-ACQ-CNV-RTE-LOC
	 *	@param number
	 */
	public void setX360AMcsAcqCnvRteLoc(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360AMcsAcqCnvRteLoc = checkX360AMcsAcqCnvRteLocMaxLimit(number); 
		serializeX360AMcsAcqCnvRteLoc(x360AMcsAcqCnvRteLoc);
	}
	

	/**
	 * 	Update X360AMcsAcqCnvRteLoc with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360AMcsAcqCnvRteLoc(char[] value) throws CFException {
		 x360AMcsAcqCnvRteLoc = serializeX360AMcsAcqCnvRteLoc(value);
	}
	/**
	 * 	Update X360AMcsAcqCnvRteLoc with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360AMcsAcqCnvRteLocString(char[] value) throws CFException {
		 setX360AMcsAcqCnvRteLoc(value);
	}
	/**
	 *	Returns the value of x360AMcsAcqSetlIca
	 *	@return x360AMcsAcqSetlIca
	 */
	public long getX360AMcsAcqSetlIca() throws CFException {
       if (isX360AMcsAcqSetlIcaModified()) { 
           x360AMcsAcqSetlIca = refreshX360AMcsAcqSetlIca();
        }
   		return x360AMcsAcqSetlIca;
	}
	

	
	   
	/**
	 * 	Update X360AMcsAcqSetlIca with the passed value
	 *  Corresponding COBOL Variable is X360-A-MCS-ACQ-SETL-ICA
	 *	@param number
	 */
	public void setX360AMcsAcqSetlIca(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360AMcsAcqSetlIca = checkX360AMcsAcqSetlIcaMaxLimit(number); 
		serializeX360AMcsAcqSetlIca(x360AMcsAcqSetlIca);
	}
	

	/**
	 * 	Update X360AMcsAcqSetlIca with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360AMcsAcqSetlIca(char[] value) throws CFException {
		 x360AMcsAcqSetlIca = serializeX360AMcsAcqSetlIca(value);
	}
	/**
	 * 	Update X360AMcsAcqSetlIca with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360AMcsAcqSetlIcaString(char[] value) throws CFException {
		 setX360AMcsAcqSetlIca(value);
	}
	public int getX360AAcqFinIfeeCnt() throws CFException {
        if (isX360AAcqFinIfeeCntModified()) { 
           x360AAcqFinIfeeCnt = refreshX360AAcqFinIfeeCnt();
        }
   		return x360AAcqFinIfeeCnt;
	}
	
	/**
	 * 	Update X360AAcqFinIfeeCnt with the passed value
	 *  Corresponding COBOL Variable is X360-A-ACQ-FIN-IFEE-CNT
	 *	@param number
	 */
	public void setX360AAcqFinIfeeCnt(int number) {
			x360AAcqFinIfeeCnt = checkX360AAcqFinIfeeCntMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AAcqFinIfeeCnt(x360AAcqFinIfeeCnt);
	}


	public void setX360AAcqFinIfeeCnt(long number) {
	    number = checkX360AAcqFinIfeeCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360AAcqFinIfeeCnt((int)number);
	}
	
	public int getX360AAcqNfIfeeCnt() throws CFException {
        if (isX360AAcqNfIfeeCntModified()) { 
           x360AAcqNfIfeeCnt = refreshX360AAcqNfIfeeCnt();
        }
   		return x360AAcqNfIfeeCnt;
	}
	
	/**
	 * 	Update X360AAcqNfIfeeCnt with the passed value
	 *  Corresponding COBOL Variable is X360-A-ACQ-NF-IFEE-CNT
	 *	@param number
	 */
	public void setX360AAcqNfIfeeCnt(int number) {
			x360AAcqNfIfeeCnt = checkX360AAcqNfIfeeCntMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AAcqNfIfeeCnt(x360AAcqNfIfeeCnt);
	}


	public void setX360AAcqNfIfeeCnt(long number) {
	    number = checkX360AAcqNfIfeeCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360AAcqNfIfeeCnt((int)number);
	}
	
	public int getX360AAcqPctIfeeCnt() throws CFException {
        if (isX360AAcqPctIfeeCntModified()) { 
           x360AAcqPctIfeeCnt = refreshX360AAcqPctIfeeCnt();
        }
   		return x360AAcqPctIfeeCnt;
	}
	
	/**
	 * 	Update X360AAcqPctIfeeCnt with the passed value
	 *  Corresponding COBOL Variable is X360-A-ACQ-PCT-IFEE-CNT
	 *	@param number
	 */
	public void setX360AAcqPctIfeeCnt(int number) {
			x360AAcqPctIfeeCnt = checkX360AAcqPctIfeeCntMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AAcqPctIfeeCnt(x360AAcqPctIfeeCnt);
	}


	public void setX360AAcqPctIfeeCnt(long number) {
	    number = checkX360AAcqPctIfeeCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360AAcqPctIfeeCnt((int)number);
	}
	
	public int getX360AAcqNobillIfeeCnt() throws CFException {
        if (isX360AAcqNobillIfeeCntModified()) { 
           x360AAcqNobillIfeeCnt = refreshX360AAcqNobillIfeeCnt();
        }
   		return x360AAcqNobillIfeeCnt;
	}
	
	/**
	 * 	Update X360AAcqNobillIfeeCnt with the passed value
	 *  Corresponding COBOL Variable is X360-A-ACQ-NOBILL-IFEE-CNT
	 *	@param number
	 */
	public void setX360AAcqNobillIfeeCnt(int number) {
			x360AAcqNobillIfeeCnt = checkX360AAcqNobillIfeeCntMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AAcqNobillIfeeCnt(x360AAcqNobillIfeeCnt);
	}


	public void setX360AAcqNobillIfeeCnt(long number) {
	    number = checkX360AAcqNobillIfeeCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360AAcqNobillIfeeCnt((int)number);
	}
	
	public long getX360AAcqIfeeAmtCr() throws CFException {
        if (isX360AAcqIfeeAmtCrModified()) { 
           x360AAcqIfeeAmtCr = refreshX360AAcqIfeeAmtCr();
        }
   		return x360AAcqIfeeAmtCr;
	}
	
	/**
	 * 	Update X360AAcqIfeeAmtCr with the passed value
	 *  Corresponding COBOL Variable is X360-A-ACQ-IFEE-AMT-CR
	 *	@param number
	 */
	public void setX360AAcqIfeeAmtCr(long number) {
			x360AAcqIfeeAmtCr = checkX360AAcqIfeeAmtCrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AAcqIfeeAmtCr(x360AAcqIfeeAmtCr);
	}


	public long getX360AAcqIfeeAmtDb() throws CFException {
        if (isX360AAcqIfeeAmtDbModified()) { 
           x360AAcqIfeeAmtDb = refreshX360AAcqIfeeAmtDb();
        }
   		return x360AAcqIfeeAmtDb;
	}
	
	/**
	 * 	Update X360AAcqIfeeAmtDb with the passed value
	 *  Corresponding COBOL Variable is X360-A-ACQ-IFEE-AMT-DB
	 *	@param number
	 */
	public void setX360AAcqIfeeAmtDb(long number) {
			x360AAcqIfeeAmtDb = checkX360AAcqIfeeAmtDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AAcqIfeeAmtDb(x360AAcqIfeeAmtDb);
	}


	public long getX360AAcqOrigAmtCr() throws CFException {
        if (isX360AAcqOrigAmtCrModified()) { 
           x360AAcqOrigAmtCr = refreshX360AAcqOrigAmtCr();
        }
   		return x360AAcqOrigAmtCr;
	}
	
	/**
	 * 	Update X360AAcqOrigAmtCr with the passed value
	 *  Corresponding COBOL Variable is X360-A-ACQ-ORIG-AMT-CR
	 *	@param number
	 */
	public void setX360AAcqOrigAmtCr(long number) {
			x360AAcqOrigAmtCr = checkX360AAcqOrigAmtCrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AAcqOrigAmtCr(x360AAcqOrigAmtCr);
	}


	public long getX360AAcqOrigAmtDb() throws CFException {
        if (isX360AAcqOrigAmtDbModified()) { 
           x360AAcqOrigAmtDb = refreshX360AAcqOrigAmtDb();
        }
   		return x360AAcqOrigAmtDb;
	}
	
	/**
	 * 	Update X360AAcqOrigAmtDb with the passed value
	 *  Corresponding COBOL Variable is X360-A-ACQ-ORIG-AMT-DB
	 *	@param number
	 */
	public void setX360AAcqOrigAmtDb(long number) {
			x360AAcqOrigAmtDb = checkX360AAcqOrigAmtDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AAcqOrigAmtDb(x360AAcqOrigAmtDb);
	}


	public long getX360AAcqNewAmtCr() throws CFException {
        if (isX360AAcqNewAmtCrModified()) { 
           x360AAcqNewAmtCr = refreshX360AAcqNewAmtCr();
        }
   		return x360AAcqNewAmtCr;
	}
	
	/**
	 * 	Update X360AAcqNewAmtCr with the passed value
	 *  Corresponding COBOL Variable is X360-A-ACQ-NEW-AMT-CR
	 *	@param number
	 */
	public void setX360AAcqNewAmtCr(long number) {
			x360AAcqNewAmtCr = checkX360AAcqNewAmtCrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AAcqNewAmtCr(x360AAcqNewAmtCr);
	}


	public long getX360AAcqNewAmtDb() throws CFException {
        if (isX360AAcqNewAmtDbModified()) { 
           x360AAcqNewAmtDb = refreshX360AAcqNewAmtDb();
        }
   		return x360AAcqNewAmtDb;
	}
	
	/**
	 * 	Update X360AAcqNewAmtDb with the passed value
	 *  Corresponding COBOL Variable is X360-A-ACQ-NEW-AMT-DB
	 *	@param number
	 */
	public void setX360AAcqNewAmtDb(long number) {
			x360AAcqNewAmtDb = checkX360AAcqNewAmtDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AAcqNewAmtDb(x360AAcqNewAmtDb);
	}


	public long getX360AAcqAdjAmtCr() throws CFException {
        if (isX360AAcqAdjAmtCrModified()) { 
           x360AAcqAdjAmtCr = refreshX360AAcqAdjAmtCr();
        }
   		return x360AAcqAdjAmtCr;
	}
	
	/**
	 * 	Update X360AAcqAdjAmtCr with the passed value
	 *  Corresponding COBOL Variable is X360-A-ACQ-ADJ-AMT-CR
	 *	@param number
	 */
	public void setX360AAcqAdjAmtCr(long number) {
			x360AAcqAdjAmtCr = checkX360AAcqAdjAmtCrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AAcqAdjAmtCr(x360AAcqAdjAmtCr);
	}


	public long getX360AAcqAdjAmtDb() throws CFException {
        if (isX360AAcqAdjAmtDbModified()) { 
           x360AAcqAdjAmtDb = refreshX360AAcqAdjAmtDb();
        }
   		return x360AAcqAdjAmtDb;
	}
	
	/**
	 * 	Update X360AAcqAdjAmtDb with the passed value
	 *  Corresponding COBOL Variable is X360-A-ACQ-ADJ-AMT-DB
	 *	@param number
	 */
	public void setX360AAcqAdjAmtDb(long number) {
			x360AAcqAdjAmtDb = checkX360AAcqAdjAmtDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AAcqAdjAmtDb(x360AAcqAdjAmtDb);
	}


	public long getX360AAcqMccrAmtCrNotused() throws CFException {
        if (isX360AAcqMccrAmtCrNotusedModified()) { 
           x360AAcqMccrAmtCrNotused = refreshX360AAcqMccrAmtCrNotused();
        }
   		return x360AAcqMccrAmtCrNotused;
	}
	
	/**
	 * 	Update X360AAcqMccrAmtCrNotused with the passed value
	 *  Corresponding COBOL Variable is X360-A-ACQ-MCCR-AMT-CR-NOTUSED
	 *	@param number
	 */
	public void setX360AAcqMccrAmtCrNotused(long number) {
			x360AAcqMccrAmtCrNotused = checkX360AAcqMccrAmtCrNotusedMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AAcqMccrAmtCrNotused(x360AAcqMccrAmtCrNotused);
	}


	public long getX360AAcqMccrAmtDbNotused() throws CFException {
        if (isX360AAcqMccrAmtDbNotusedModified()) { 
           x360AAcqMccrAmtDbNotused = refreshX360AAcqMccrAmtDbNotused();
        }
   		return x360AAcqMccrAmtDbNotused;
	}
	
	/**
	 * 	Update X360AAcqMccrAmtDbNotused with the passed value
	 *  Corresponding COBOL Variable is X360-A-ACQ-MCCR-AMT-DB-NOTUSED
	 *	@param number
	 */
	public void setX360AAcqMccrAmtDbNotused(long number) {
			x360AAcqMccrAmtDbNotused = checkX360AAcqMccrAmtDbNotusedMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AAcqMccrAmtDbNotused(x360AAcqMccrAmtDbNotused);
	}


	public long getX360AAcqIccrAmtCrNotused() throws CFException {
        if (isX360AAcqIccrAmtCrNotusedModified()) { 
           x360AAcqIccrAmtCrNotused = refreshX360AAcqIccrAmtCrNotused();
        }
   		return x360AAcqIccrAmtCrNotused;
	}
	
	/**
	 * 	Update X360AAcqIccrAmtCrNotused with the passed value
	 *  Corresponding COBOL Variable is X360-A-ACQ-ICCR-AMT-CR-NOTUSED
	 *	@param number
	 */
	public void setX360AAcqIccrAmtCrNotused(long number) {
			x360AAcqIccrAmtCrNotused = checkX360AAcqIccrAmtCrNotusedMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AAcqIccrAmtCrNotused(x360AAcqIccrAmtCrNotused);
	}


	public long getX360AAcqIccrAmtDbNotused() throws CFException {
        if (isX360AAcqIccrAmtDbNotusedModified()) { 
           x360AAcqIccrAmtDbNotused = refreshX360AAcqIccrAmtDbNotused();
        }
   		return x360AAcqIccrAmtDbNotused;
	}
	
	/**
	 * 	Update X360AAcqIccrAmtDbNotused with the passed value
	 *  Corresponding COBOL Variable is X360-A-ACQ-ICCR-AMT-DB-NOTUSED
	 *	@param number
	 */
	public void setX360AAcqIccrAmtDbNotused(long number) {
			x360AAcqIccrAmtDbNotused = checkX360AAcqIccrAmtDbNotusedMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AAcqIccrAmtDbNotused(x360AAcqIccrAmtDbNotused);
	}


	public int getX360AAcqA09ApprovedCntCr() throws CFException {
        if (isX360AAcqA09ApprovedCntCrModified()) { 
           x360AAcqA09ApprovedCntCr = refreshX360AAcqA09ApprovedCntCr();
        }
   		return x360AAcqA09ApprovedCntCr;
	}
	
	/**
	 * 	Update X360AAcqA09ApprovedCntCr with the passed value
	 *  Corresponding COBOL Variable is X360-A-ACQ-A09-APPROVED-CNT-CR
	 *	@param number
	 */
	public void setX360AAcqA09ApprovedCntCr(int number) {
			x360AAcqA09ApprovedCntCr = checkX360AAcqA09ApprovedCntCrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AAcqA09ApprovedCntCr(x360AAcqA09ApprovedCntCr);
	}


	public void setX360AAcqA09ApprovedCntCr(long number) {
	    number = checkX360AAcqA09ApprovedCntCrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360AAcqA09ApprovedCntCr((int)number);
	}
	
	public int getX360AAcqA09ApprovedCntDb() throws CFException {
        if (isX360AAcqA09ApprovedCntDbModified()) { 
           x360AAcqA09ApprovedCntDb = refreshX360AAcqA09ApprovedCntDb();
        }
   		return x360AAcqA09ApprovedCntDb;
	}
	
	/**
	 * 	Update X360AAcqA09ApprovedCntDb with the passed value
	 *  Corresponding COBOL Variable is X360-A-ACQ-A09-APPROVED-CNT-DB
	 *	@param number
	 */
	public void setX360AAcqA09ApprovedCntDb(int number) {
			x360AAcqA09ApprovedCntDb = checkX360AAcqA09ApprovedCntDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AAcqA09ApprovedCntDb(x360AAcqA09ApprovedCntDb);
	}


	public void setX360AAcqA09ApprovedCntDb(long number) {
	    number = checkX360AAcqA09ApprovedCntDbMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360AAcqA09ApprovedCntDb((int)number);
	}
	
	public long getX360AAcqA09ApprovedAmtCr() throws CFException {
        if (isX360AAcqA09ApprovedAmtCrModified()) { 
           x360AAcqA09ApprovedAmtCr = refreshX360AAcqA09ApprovedAmtCr();
        }
   		return x360AAcqA09ApprovedAmtCr;
	}
	
	/**
	 * 	Update X360AAcqA09ApprovedAmtCr with the passed value
	 *  Corresponding COBOL Variable is X360-A-ACQ-A09-APPROVED-AMT-CR
	 *	@param number
	 */
	public void setX360AAcqA09ApprovedAmtCr(long number) {
			x360AAcqA09ApprovedAmtCr = checkX360AAcqA09ApprovedAmtCrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AAcqA09ApprovedAmtCr(x360AAcqA09ApprovedAmtCr);
	}


	public long getX360AAcqA09ApprovedAmtDb() throws CFException {
        if (isX360AAcqA09ApprovedAmtDbModified()) { 
           x360AAcqA09ApprovedAmtDb = refreshX360AAcqA09ApprovedAmtDb();
        }
   		return x360AAcqA09ApprovedAmtDb;
	}
	
	/**
	 * 	Update X360AAcqA09ApprovedAmtDb with the passed value
	 *  Corresponding COBOL Variable is X360-A-ACQ-A09-APPROVED-AMT-DB
	 *	@param number
	 */
	public void setX360AAcqA09ApprovedAmtDb(long number) {
			x360AAcqA09ApprovedAmtDb = checkX360AAcqA09ApprovedAmtDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AAcqA09ApprovedAmtDb(x360AAcqA09ApprovedAmtDb);
	}


	public long getX360AAcqBaseSetlAmtCr() throws CFException {
        if (isX360AAcqBaseSetlAmtCrModified()) { 
           x360AAcqBaseSetlAmtCr = refreshX360AAcqBaseSetlAmtCr();
        }
   		return x360AAcqBaseSetlAmtCr;
	}
	
	/**
	 * 	Update X360AAcqBaseSetlAmtCr with the passed value
	 *  Corresponding COBOL Variable is X360-A-ACQ-BASE-SETL-AMT-CR
	 *	@param number
	 */
	public void setX360AAcqBaseSetlAmtCr(long number) {
			x360AAcqBaseSetlAmtCr = checkX360AAcqBaseSetlAmtCrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AAcqBaseSetlAmtCr(x360AAcqBaseSetlAmtCr);
	}


	public long getX360AAcqBaseSetlAmtDb() throws CFException {
        if (isX360AAcqBaseSetlAmtDbModified()) { 
           x360AAcqBaseSetlAmtDb = refreshX360AAcqBaseSetlAmtDb();
        }
   		return x360AAcqBaseSetlAmtDb;
	}
	
	/**
	 * 	Update X360AAcqBaseSetlAmtDb with the passed value
	 *  Corresponding COBOL Variable is X360-A-ACQ-BASE-SETL-AMT-DB
	 *	@param number
	 */
	public void setX360AAcqBaseSetlAmtDb(long number) {
			x360AAcqBaseSetlAmtDb = checkX360AAcqBaseSetlAmtDbMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AAcqBaseSetlAmtDb(x360AAcqBaseSetlAmtDb);
	}


	public long getX360AAcqMccrA09CrNotused() throws CFException {
        if (isX360AAcqMccrA09CrNotusedModified()) { 
           x360AAcqMccrA09CrNotused = refreshX360AAcqMccrA09CrNotused();
        }
   		return x360AAcqMccrA09CrNotused;
	}
	
	/**
	 * 	Update X360AAcqMccrA09CrNotused with the passed value
	 *  Corresponding COBOL Variable is X360-A-ACQ-MCCR-A09-CR-NOTUSED
	 *	@param number
	 */
	public void setX360AAcqMccrA09CrNotused(long number) {
			x360AAcqMccrA09CrNotused = checkX360AAcqMccrA09CrNotusedMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AAcqMccrA09CrNotused(x360AAcqMccrA09CrNotused);
	}


	public long getX360AAcqMccrA09DbNotused() throws CFException {
        if (isX360AAcqMccrA09DbNotusedModified()) { 
           x360AAcqMccrA09DbNotused = refreshX360AAcqMccrA09DbNotused();
        }
   		return x360AAcqMccrA09DbNotused;
	}
	
	/**
	 * 	Update X360AAcqMccrA09DbNotused with the passed value
	 *  Corresponding COBOL Variable is X360-A-ACQ-MCCR-A09-DB-NOTUSED
	 *	@param number
	 */
	public void setX360AAcqMccrA09DbNotused(long number) {
			x360AAcqMccrA09DbNotused = checkX360AAcqMccrA09DbNotusedMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360AAcqMccrA09DbNotused(x360AAcqMccrA09DbNotused);
	}


	public int getX360FaVatAcqNfCnt() throws CFException {
        if (isX360FaVatAcqNfCntModified()) { 
           x360FaVatAcqNfCnt = refreshX360FaVatAcqNfCnt();
        }
   		return x360FaVatAcqNfCnt;
	}
	
	/**
	 * 	Update X360FaVatAcqNfCnt with the passed value
	 *  Corresponding COBOL Variable is X360-FA-VAT-ACQ-NF-CNT
	 *	@param number
	 */
	public void setX360FaVatAcqNfCnt(int number) {
			x360FaVatAcqNfCnt = checkX360FaVatAcqNfCntMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FaVatAcqNfCnt(x360FaVatAcqNfCnt);
	}


	public void setX360FaVatAcqNfCnt(long number) {
	    number = checkX360FaVatAcqNfCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360FaVatAcqNfCnt((int)number);
	}
	
	public long getX360FaVatAcqFinAmt() throws CFException {
        if (isX360FaVatAcqFinAmtModified()) { 
           x360FaVatAcqFinAmt = refreshX360FaVatAcqFinAmt();
        }
   		return x360FaVatAcqFinAmt;
	}
	
	/**
	 * 	Update X360FaVatAcqFinAmt with the passed value
	 *  Corresponding COBOL Variable is X360-FA-VAT-ACQ-FIN-AMT
	 *	@param number
	 */
	public void setX360FaVatAcqFinAmt(long number) {
			x360FaVatAcqFinAmt = checkX360FaVatAcqFinAmtMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FaVatAcqFinAmt(x360FaVatAcqFinAmt);
	}


	public long getX360FaVatAcqNfAmt() throws CFException {
        if (isX360FaVatAcqNfAmtModified()) { 
           x360FaVatAcqNfAmt = refreshX360FaVatAcqNfAmt();
        }
   		return x360FaVatAcqNfAmt;
	}
	
	/**
	 * 	Update X360FaVatAcqNfAmt with the passed value
	 *  Corresponding COBOL Variable is X360-FA-VAT-ACQ-NF-AMT
	 *	@param number
	 */
	public void setX360FaVatAcqNfAmt(long number) {
			x360FaVatAcqNfAmt = checkX360FaVatAcqNfAmtMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FaVatAcqNfAmt(x360FaVatAcqNfAmt);
	}


	public long getX360FaVatAcqFinVat() throws CFException {
        if (isX360FaVatAcqFinVatModified()) { 
           x360FaVatAcqFinVat = refreshX360FaVatAcqFinVat();
        }
   		return x360FaVatAcqFinVat;
	}
	
	/**
	 * 	Update X360FaVatAcqFinVat with the passed value
	 *  Corresponding COBOL Variable is X360-FA-VAT-ACQ-FIN-VAT
	 *	@param number
	 */
	public void setX360FaVatAcqFinVat(long number) {
			x360FaVatAcqFinVat = checkX360FaVatAcqFinVatMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FaVatAcqFinVat(x360FaVatAcqFinVat);
	}


	public long getX360FaVatAcqNfVat() throws CFException {
        if (isX360FaVatAcqNfVatModified()) { 
           x360FaVatAcqNfVat = refreshX360FaVatAcqNfVat();
        }
   		return x360FaVatAcqNfVat;
	}
	
	/**
	 * 	Update X360FaVatAcqNfVat with the passed value
	 *  Corresponding COBOL Variable is X360-FA-VAT-ACQ-NF-VAT
	 *	@param number
	 */
	public void setX360FaVatAcqNfVat(long number) {
			x360FaVatAcqNfVat = checkX360FaVatAcqNfVatMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FaVatAcqNfVat(x360FaVatAcqNfVat);
	}



	
	
	

		public static int getX360AMcsAcqSetlFieldLength() {
			return X_360_AMCS_ACQ_SETL_LENGTH;
		}

}
  
