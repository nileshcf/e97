package com.cloudframe.app.init1.dto;

/**
*  The class ProgramCounters is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


public class ProgramCounters extends ProgramCountersSerialized { 
   

								private int invoiceCtr;

								private int jitrInvCtr;

								private int commitCtr;

								private int quotient;

								private int remainder;

								private int acctCpduCtr;

								private int acctUsageCtr;

								private int acctLsbcaCtr;

								private int acctLsgremCtr;

								private BigDecimal acctDataChgAmt = BigDecimal.ZERO;

								private int billCpduCtr;

								private int billUsageCtr;

								private int billLsbcaCtr;

								private int billLsgremCtr;

								private BigDecimal billDataChgAmt = BigDecimal.ZERO;

								private int ubCpduCtr;

								private int ubBillmsgCtr;

								private int ubUsageCtr;

								private BigDecimal ubDataChgAmt = BigDecimal.ZERO;

								private BigDecimal totDataChgAmt = BigDecimal.ZERO;

								private int ubLsbcaCtr;

								private int ubLsgremCtr;

								private int lnshrgCtr;

								private int ubAtdsumCtr;

								private int flgCpduCtr;

								private int flgUsageCtr;

								private int flgLsbcaCtr;

								private int flgLsgremCtr;

								private int flgAtdsumCtr;

								private BigDecimal custFlgUsgCtr = BigDecimal.ZERO;

								private BigDecimal custUsgCtr = BigDecimal.ZERO;

								private BigDecimal fgvAlwCount = BigDecimal.ZERO;

								private int okdCpduCtr;

								private int okdUsageCtr;

								private int okdLsbcaCtr;

								private int okdLsgremCtr;

								private int okdAtdsumCtr;

								private int outCpduCtr;

								private int outBillmsgCtr;

								private int bypassBillmsgCtr;

								private int outUsageCtr;

								private int outLsbcaCtr;

								private int outLsgremCtr;

								private int outAtdsumCtr;

								private int errAcctCtr;

								private int errThreshold;

								private int alpPlanCtr;

								private int sfoPlanCtr;

								private int spoAlwCtr;

								private int glbProdCtr;

								private int svcProdCtr;

								private int spoProdCtr;

								private int alpCpduCtr;

								private int sfoCpduCtr;

								private int npspoCpduCtr;

								private int comCpduCtr;

								private int visCreateCtr;

								private int dupSpoAlwCtr;

								private int discArrayCtr;

								private int revoRejectCtr;

								private int basvcprdCtr;

								private int dtsvcalwCtr;

								private int sfoplanCtr01;

								private int spoallowCtr;

								private int mtnfileCtr;

								private int u07fileCtr;

								private int rccycCtr;

								private int m2mAlwCtr;

								private int m2mpromoCtr;

								private int mtnStatCtr;

								private int m2mTermCtr;

								private int trlCpduCnt;

								private int trlUsageCnt;

								private int trlLsbcaCnt;

								private int trlLsgremCnt;

								private int trlAtdsumCnt;

								private short saveI;

								private short count;

								private short idx;
	
	/**
	* Constructor for ProgramCounters
	**/
    public ProgramCounters() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ProgramCounters. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ProgramCounters(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setInvoiceCtr(0);
								setJitrInvCtr(0);
								setCommitCtr(0);
								setQuotient(0);
								setRemainder(0);
								setAcctCpduCtr(0);
								setAcctUsageCtr(0);
								setAcctLsbcaCtr(0);
								setAcctLsgremCtr(0);
								setAcctDataChgAmt(BigDecimal.ZERO);
								setBillCpduCtr(0);
								setBillUsageCtr(0);
								setBillLsbcaCtr(0);
								setBillLsgremCtr(0);
								setBillDataChgAmt(BigDecimal.ZERO);
								setUbCpduCtr(0);
								setUbBillmsgCtr(0);
								setUbUsageCtr(0);
								setUbDataChgAmt(BigDecimal.ZERO);
								setTotDataChgAmt(BigDecimal.ZERO);
								setUbLsbcaCtr(0);
								setUbLsgremCtr(0);
								setLnshrgCtr(0);
								setUbAtdsumCtr(0);
								setFlgCpduCtr(0);
								setFlgUsageCtr(0);
								setFlgLsbcaCtr(0);
								setFlgLsgremCtr(0);
								setFlgAtdsumCtr(0);
								setCustFlgUsgCtr(BigDecimal.ZERO);
								setCustUsgCtr(BigDecimal.ZERO);
								setFgvAlwCount(BigDecimal.ZERO);
								setOkdCpduCtr(0);
								setOkdUsageCtr(0);
								setOkdLsbcaCtr(0);
								setOkdLsgremCtr(0);
								setOkdAtdsumCtr(0);
								setOutCpduCtr(0);
								setOutBillmsgCtr(0);
								setBypassBillmsgCtr(0);
								setOutUsageCtr(0);
								setOutLsbcaCtr(0);
								setOutLsgremCtr(0);
								setOutAtdsumCtr(0);
								setErrAcctCtr(0);
								setErrThreshold(0);
								setAlpPlanCtr(0);
								setSfoPlanCtr(0);
								setSpoAlwCtr(0);
								setGlbProdCtr(0);
								setSvcProdCtr(0);
								setSpoProdCtr(0);
								setAlpCpduCtr(0);
								setSfoCpduCtr(0);
								setNpspoCpduCtr(0);
								setComCpduCtr(0);
								setVisCreateCtr(0);
								setDupSpoAlwCtr(0);
								setDiscArrayCtr(0);
								setRevoRejectCtr(0);
								setBasvcprdCtr(0);
								setDtsvcalwCtr(0);
								setSfoplanCtr01(0);
								setSpoallowCtr(0);
								setMtnfileCtr(0);
								setU07fileCtr(0);
								setRccycCtr(0);
								setM2mAlwCtr(0);
								setM2mpromoCtr(0);
								setMtnStatCtr(0);
								setM2mTermCtr(0);
								setTrlCpduCnt(0);
								setTrlUsageCnt(0);
								setTrlLsbcaCnt(0);
								setTrlLsgremCnt(0);
								setTrlAtdsumCnt(0);
								setSaveI((short)0);
								setCount((short)0);
								setIdx((short)0);
    } 

	/**
	 *	Returns the value of invoiceCtr
	 *	@return invoiceCtr
	 */
	public int getInvoiceCtr() throws CFException {
        if (isInvoiceCtrModified()) { 
           invoiceCtr = refreshInvoiceCtr();
        }
   		return invoiceCtr;
	}
	
	/**
	 * 	Update InvoiceCtr with the passed value
	 *  Corresponding COBOL Variable is WS-INVOICE-CTR
	 *	@param number
	 */
	public void setInvoiceCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    invoiceCtr = checkInvoiceCtrMaxLimit(number); 
		serializeInvoiceCtr(invoiceCtr);
	}


	public void setInvoiceCtr(long number) {
	    number = checkInvoiceCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setInvoiceCtr((int)number);
	}
	
	/**
	 *	Returns the value of jitrInvCtr
	 *	@return jitrInvCtr
	 */
	public int getJitrInvCtr() throws CFException {
        if (isJitrInvCtrModified()) { 
           jitrInvCtr = refreshJitrInvCtr();
        }
   		return jitrInvCtr;
	}
	
	/**
	 * 	Update JitrInvCtr with the passed value
	 *  Corresponding COBOL Variable is WS-JITR-INV-CTR
	 *	@param number
	 */
	public void setJitrInvCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    jitrInvCtr = checkJitrInvCtrMaxLimit(number); 
		serializeJitrInvCtr(jitrInvCtr);
	}


	public void setJitrInvCtr(long number) {
	    number = checkJitrInvCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setJitrInvCtr((int)number);
	}
	
	/**
	 *	Returns the value of commitCtr
	 *	@return commitCtr
	 */
	public int getCommitCtr() throws CFException {
        if (isCommitCtrModified()) { 
           commitCtr = refreshCommitCtr();
        }
   		return commitCtr;
	}
	
	/**
	 * 	Update CommitCtr with the passed value
	 *  Corresponding COBOL Variable is WS-COMMIT-CTR
	 *	@param number
	 */
	public void setCommitCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    commitCtr = checkCommitCtrMaxLimit(number); 
		serializeCommitCtr(commitCtr);
	}


	public void setCommitCtr(long number) {
	    number = checkCommitCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCommitCtr((int)number);
	}
	
	/**
	 *	Returns the value of quotient
	 *	@return quotient
	 */
	public int getQuotient() throws CFException {
        if (isQuotientModified()) { 
           quotient = refreshQuotient();
        }
   		return quotient;
	}
	
	/**
	 * 	Update Quotient with the passed value
	 *  Corresponding COBOL Variable is WS-QUOTIENT
	 *	@param number
	 */
	public void setQuotient(int number) {
	     // Truncate if the number is beyond +/- Max range
	    quotient = checkQuotientMaxLimit(number); 
		serializeQuotient(quotient);
	}


	public void setQuotient(long number) {
	    number = checkQuotientMaxLimit(number); // Truncate if value is beyond +/- Max range
		setQuotient((int)number);
	}
	
	/**
	 *	Returns the value of remainder
	 *	@return remainder
	 */
	public int getRemainder() throws CFException {
        if (isRemainderModified()) { 
           remainder = refreshRemainder();
        }
   		return remainder;
	}
	
	/**
	 * 	Update Remainder with the passed value
	 *  Corresponding COBOL Variable is WS-REMAINDER
	 *	@param number
	 */
	public void setRemainder(int number) {
	     // Truncate if the number is beyond +/- Max range
	    remainder = checkRemainderMaxLimit(number); 
		serializeRemainder(remainder);
	}


	public void setRemainder(long number) {
	    number = checkRemainderMaxLimit(number); // Truncate if value is beyond +/- Max range
		setRemainder((int)number);
	}
	
	/**
	 *	Returns the value of acctCpduCtr
	 *	@return acctCpduCtr
	 */
	public int getAcctCpduCtr() throws CFException {
        if (isAcctCpduCtrModified()) { 
           acctCpduCtr = refreshAcctCpduCtr();
        }
   		return acctCpduCtr;
	}
	
	/**
	 * 	Update AcctCpduCtr with the passed value
	 *  Corresponding COBOL Variable is WS-ACCT-CPDU-CTR
	 *	@param number
	 */
	public void setAcctCpduCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    acctCpduCtr = checkAcctCpduCtrMaxLimit(number); 
		serializeAcctCpduCtr(acctCpduCtr);
	}


	public void setAcctCpduCtr(long number) {
	    number = checkAcctCpduCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setAcctCpduCtr((int)number);
	}
	
	/**
	 *	Returns the value of acctUsageCtr
	 *	@return acctUsageCtr
	 */
	public int getAcctUsageCtr() throws CFException {
        if (isAcctUsageCtrModified()) { 
           acctUsageCtr = refreshAcctUsageCtr();
        }
   		return acctUsageCtr;
	}
	
	/**
	 * 	Update AcctUsageCtr with the passed value
	 *  Corresponding COBOL Variable is WS-ACCT-USAGE-CTR
	 *	@param number
	 */
	public void setAcctUsageCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    acctUsageCtr = checkAcctUsageCtrMaxLimit(number); 
		serializeAcctUsageCtr(acctUsageCtr);
	}


	public void setAcctUsageCtr(long number) {
	    number = checkAcctUsageCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setAcctUsageCtr((int)number);
	}
	
	/**
	 *	Returns the value of acctLsbcaCtr
	 *	@return acctLsbcaCtr
	 */
	public int getAcctLsbcaCtr() throws CFException {
        if (isAcctLsbcaCtrModified()) { 
           acctLsbcaCtr = refreshAcctLsbcaCtr();
        }
   		return acctLsbcaCtr;
	}
	
	/**
	 * 	Update AcctLsbcaCtr with the passed value
	 *  Corresponding COBOL Variable is WS-ACCT-LSBCA-CTR
	 *	@param number
	 */
	public void setAcctLsbcaCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    acctLsbcaCtr = checkAcctLsbcaCtrMaxLimit(number); 
		serializeAcctLsbcaCtr(acctLsbcaCtr);
	}


	public void setAcctLsbcaCtr(long number) {
	    number = checkAcctLsbcaCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setAcctLsbcaCtr((int)number);
	}
	
	/**
	 *	Returns the value of acctLsgremCtr
	 *	@return acctLsgremCtr
	 */
	public int getAcctLsgremCtr() throws CFException {
        if (isAcctLsgremCtrModified()) { 
           acctLsgremCtr = refreshAcctLsgremCtr();
        }
   		return acctLsgremCtr;
	}
	
	/**
	 * 	Update AcctLsgremCtr with the passed value
	 *  Corresponding COBOL Variable is WS-ACCT-LSGREM-CTR
	 *	@param number
	 */
	public void setAcctLsgremCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    acctLsgremCtr = checkAcctLsgremCtrMaxLimit(number); 
		serializeAcctLsgremCtr(acctLsgremCtr);
	}


	public void setAcctLsgremCtr(long number) {
	    number = checkAcctLsgremCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setAcctLsgremCtr((int)number);
	}
	
	public BigDecimal getAcctDataChgAmt() throws CFException {
        if (isAcctDataChgAmtModified()) { 
           acctDataChgAmt = refreshAcctDataChgAmt();
        }
   		return acctDataChgAmt;
	}

    public char[] getAcctDataChgAmtString() {
          return  acctDataChgAmtString();
    }
	
	/**
	 * 	Update AcctDataChgAmt with the passed number
	 *  Corresponding COBOL Variable is WS-ACCT-DATA-CHG-AMT
	 *	@param number
	 */
	public void setAcctDataChgAmt(BigDecimal number) {	
     acctDataChgAmt = checkAcctDataChgAmtMaxLimit(number);
	    serializeAcctDataChgAmt(acctDataChgAmt);
   }
	/**
	 *	Returns the value of billCpduCtr
	 *	@return billCpduCtr
	 */
	public int getBillCpduCtr() throws CFException {
        if (isBillCpduCtrModified()) { 
           billCpduCtr = refreshBillCpduCtr();
        }
   		return billCpduCtr;
	}
	
	/**
	 * 	Update BillCpduCtr with the passed value
	 *  Corresponding COBOL Variable is WS-BILL-CPDU-CTR
	 *	@param number
	 */
	public void setBillCpduCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    billCpduCtr = checkBillCpduCtrMaxLimit(number); 
		serializeBillCpduCtr(billCpduCtr);
	}


	public void setBillCpduCtr(long number) {
	    number = checkBillCpduCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBillCpduCtr((int)number);
	}
	
	/**
	 *	Returns the value of billUsageCtr
	 *	@return billUsageCtr
	 */
	public int getBillUsageCtr() throws CFException {
        if (isBillUsageCtrModified()) { 
           billUsageCtr = refreshBillUsageCtr();
        }
   		return billUsageCtr;
	}
	
	/**
	 * 	Update BillUsageCtr with the passed value
	 *  Corresponding COBOL Variable is WS-BILL-USAGE-CTR
	 *	@param number
	 */
	public void setBillUsageCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    billUsageCtr = checkBillUsageCtrMaxLimit(number); 
		serializeBillUsageCtr(billUsageCtr);
	}


	public void setBillUsageCtr(long number) {
	    number = checkBillUsageCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBillUsageCtr((int)number);
	}
	
	/**
	 *	Returns the value of billLsbcaCtr
	 *	@return billLsbcaCtr
	 */
	public int getBillLsbcaCtr() throws CFException {
        if (isBillLsbcaCtrModified()) { 
           billLsbcaCtr = refreshBillLsbcaCtr();
        }
   		return billLsbcaCtr;
	}
	
	/**
	 * 	Update BillLsbcaCtr with the passed value
	 *  Corresponding COBOL Variable is WS-BILL-LSBCA-CTR
	 *	@param number
	 */
	public void setBillLsbcaCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    billLsbcaCtr = checkBillLsbcaCtrMaxLimit(number); 
		serializeBillLsbcaCtr(billLsbcaCtr);
	}


	public void setBillLsbcaCtr(long number) {
	    number = checkBillLsbcaCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBillLsbcaCtr((int)number);
	}
	
	/**
	 *	Returns the value of billLsgremCtr
	 *	@return billLsgremCtr
	 */
	public int getBillLsgremCtr() throws CFException {
        if (isBillLsgremCtrModified()) { 
           billLsgremCtr = refreshBillLsgremCtr();
        }
   		return billLsgremCtr;
	}
	
	/**
	 * 	Update BillLsgremCtr with the passed value
	 *  Corresponding COBOL Variable is WS-BILL-LSGREM-CTR
	 *	@param number
	 */
	public void setBillLsgremCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    billLsgremCtr = checkBillLsgremCtrMaxLimit(number); 
		serializeBillLsgremCtr(billLsgremCtr);
	}


	public void setBillLsgremCtr(long number) {
	    number = checkBillLsgremCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBillLsgremCtr((int)number);
	}
	
	public BigDecimal getBillDataChgAmt() throws CFException {
        if (isBillDataChgAmtModified()) { 
           billDataChgAmt = refreshBillDataChgAmt();
        }
   		return billDataChgAmt;
	}

    public char[] getBillDataChgAmtString() {
          return  billDataChgAmtString();
    }
	
	/**
	 * 	Update BillDataChgAmt with the passed number
	 *  Corresponding COBOL Variable is WS-BILL-DATA-CHG-AMT
	 *	@param number
	 */
	public void setBillDataChgAmt(BigDecimal number) {	
     billDataChgAmt = checkBillDataChgAmtMaxLimit(number);
	    serializeBillDataChgAmt(billDataChgAmt);
   }
	/**
	 *	Returns the value of ubCpduCtr
	 *	@return ubCpduCtr
	 */
	public int getUbCpduCtr() throws CFException {
        if (isUbCpduCtrModified()) { 
           ubCpduCtr = refreshUbCpduCtr();
        }
   		return ubCpduCtr;
	}
	
	/**
	 * 	Update UbCpduCtr with the passed value
	 *  Corresponding COBOL Variable is WS-UB-CPDU-CTR
	 *	@param number
	 */
	public void setUbCpduCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ubCpduCtr = checkUbCpduCtrMaxLimit(number); 
		serializeUbCpduCtr(ubCpduCtr);
	}


	public void setUbCpduCtr(long number) {
	    number = checkUbCpduCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setUbCpduCtr((int)number);
	}
	
	/**
	 *	Returns the value of ubBillmsgCtr
	 *	@return ubBillmsgCtr
	 */
	public int getUbBillmsgCtr() throws CFException {
        if (isUbBillmsgCtrModified()) { 
           ubBillmsgCtr = refreshUbBillmsgCtr();
        }
   		return ubBillmsgCtr;
	}
	
	/**
	 * 	Update UbBillmsgCtr with the passed value
	 *  Corresponding COBOL Variable is WS-UB-BILLMSG-CTR
	 *	@param number
	 */
	public void setUbBillmsgCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ubBillmsgCtr = checkUbBillmsgCtrMaxLimit(number); 
		serializeUbBillmsgCtr(ubBillmsgCtr);
	}


	public void setUbBillmsgCtr(long number) {
	    number = checkUbBillmsgCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setUbBillmsgCtr((int)number);
	}
	
	/**
	 *	Returns the value of ubUsageCtr
	 *	@return ubUsageCtr
	 */
	public int getUbUsageCtr() throws CFException {
        if (isUbUsageCtrModified()) { 
           ubUsageCtr = refreshUbUsageCtr();
        }
   		return ubUsageCtr;
	}
	
	/**
	 * 	Update UbUsageCtr with the passed value
	 *  Corresponding COBOL Variable is WS-UB-USAGE-CTR
	 *	@param number
	 */
	public void setUbUsageCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ubUsageCtr = checkUbUsageCtrMaxLimit(number); 
		serializeUbUsageCtr(ubUsageCtr);
	}


	public void setUbUsageCtr(long number) {
	    number = checkUbUsageCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setUbUsageCtr((int)number);
	}
	
	public BigDecimal getUbDataChgAmt() throws CFException {
        if (isUbDataChgAmtModified()) { 
           ubDataChgAmt = refreshUbDataChgAmt();
        }
   		return ubDataChgAmt;
	}

    public char[] getUbDataChgAmtString() {
          return  ubDataChgAmtString();
    }
	
	/**
	 * 	Update UbDataChgAmt with the passed number
	 *  Corresponding COBOL Variable is WS-UB-DATA-CHG-AMT
	 *	@param number
	 */
	public void setUbDataChgAmt(BigDecimal number) {	
     ubDataChgAmt = checkUbDataChgAmtMaxLimit(number);
	    serializeUbDataChgAmt(ubDataChgAmt);
   }
	public BigDecimal getTotDataChgAmt() throws CFException {
        if (isTotDataChgAmtModified()) { 
           totDataChgAmt = refreshTotDataChgAmt();
        }
   		return totDataChgAmt;
	}

    public char[] getTotDataChgAmtString() {
          return  totDataChgAmtString();
    }
	
	/**
	 * 	Update TotDataChgAmt with the passed number
	 *  Corresponding COBOL Variable is WS-TOT-DATA-CHG-AMT
	 *	@param number
	 */
	public void setTotDataChgAmt(BigDecimal number) {	
     totDataChgAmt = checkTotDataChgAmtMaxLimit(number);
	    serializeTotDataChgAmt(totDataChgAmt);
   }
	/**
	 *	Returns the value of ubLsbcaCtr
	 *	@return ubLsbcaCtr
	 */
	public int getUbLsbcaCtr() throws CFException {
        if (isUbLsbcaCtrModified()) { 
           ubLsbcaCtr = refreshUbLsbcaCtr();
        }
   		return ubLsbcaCtr;
	}
	
	/**
	 * 	Update UbLsbcaCtr with the passed value
	 *  Corresponding COBOL Variable is WS-UB-LSBCA-CTR
	 *	@param number
	 */
	public void setUbLsbcaCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ubLsbcaCtr = checkUbLsbcaCtrMaxLimit(number); 
		serializeUbLsbcaCtr(ubLsbcaCtr);
	}


	public void setUbLsbcaCtr(long number) {
	    number = checkUbLsbcaCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setUbLsbcaCtr((int)number);
	}
	
	/**
	 *	Returns the value of ubLsgremCtr
	 *	@return ubLsgremCtr
	 */
	public int getUbLsgremCtr() throws CFException {
        if (isUbLsgremCtrModified()) { 
           ubLsgremCtr = refreshUbLsgremCtr();
        }
   		return ubLsgremCtr;
	}
	
	/**
	 * 	Update UbLsgremCtr with the passed value
	 *  Corresponding COBOL Variable is WS-UB-LSGREM-CTR
	 *	@param number
	 */
	public void setUbLsgremCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ubLsgremCtr = checkUbLsgremCtrMaxLimit(number); 
		serializeUbLsgremCtr(ubLsgremCtr);
	}


	public void setUbLsgremCtr(long number) {
	    number = checkUbLsgremCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setUbLsgremCtr((int)number);
	}
	
	/**
	 *	Returns the value of lnshrgCtr
	 *	@return lnshrgCtr
	 */
	public int getLnshrgCtr() throws CFException {
        if (isLnshrgCtrModified()) { 
           lnshrgCtr = refreshLnshrgCtr();
        }
   		return lnshrgCtr;
	}
	
	/**
	 * 	Update LnshrgCtr with the passed value
	 *  Corresponding COBOL Variable is WS-LNSHRG-CTR
	 *	@param number
	 */
	public void setLnshrgCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    lnshrgCtr = checkLnshrgCtrMaxLimit(number); 
		serializeLnshrgCtr(lnshrgCtr);
	}


	public void setLnshrgCtr(long number) {
	    number = checkLnshrgCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setLnshrgCtr((int)number);
	}
	
	/**
	 *	Returns the value of ubAtdsumCtr
	 *	@return ubAtdsumCtr
	 */
	public int getUbAtdsumCtr() throws CFException {
        if (isUbAtdsumCtrModified()) { 
           ubAtdsumCtr = refreshUbAtdsumCtr();
        }
   		return ubAtdsumCtr;
	}
	
	/**
	 * 	Update UbAtdsumCtr with the passed value
	 *  Corresponding COBOL Variable is WS-UB-ATDSUM-CTR
	 *	@param number
	 */
	public void setUbAtdsumCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ubAtdsumCtr = checkUbAtdsumCtrMaxLimit(number); 
		serializeUbAtdsumCtr(ubAtdsumCtr);
	}


	public void setUbAtdsumCtr(long number) {
	    number = checkUbAtdsumCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setUbAtdsumCtr((int)number);
	}
	
	/**
	 *	Returns the value of flgCpduCtr
	 *	@return flgCpduCtr
	 */
	public int getFlgCpduCtr() throws CFException {
        if (isFlgCpduCtrModified()) { 
           flgCpduCtr = refreshFlgCpduCtr();
        }
   		return flgCpduCtr;
	}
	
	/**
	 * 	Update FlgCpduCtr with the passed value
	 *  Corresponding COBOL Variable is WS-FLG-CPDU-CTR
	 *	@param number
	 */
	public void setFlgCpduCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    flgCpduCtr = checkFlgCpduCtrMaxLimit(number); 
		serializeFlgCpduCtr(flgCpduCtr);
	}


	public void setFlgCpduCtr(long number) {
	    number = checkFlgCpduCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setFlgCpduCtr((int)number);
	}
	
	/**
	 *	Returns the value of flgUsageCtr
	 *	@return flgUsageCtr
	 */
	public int getFlgUsageCtr() throws CFException {
        if (isFlgUsageCtrModified()) { 
           flgUsageCtr = refreshFlgUsageCtr();
        }
   		return flgUsageCtr;
	}
	
	/**
	 * 	Update FlgUsageCtr with the passed value
	 *  Corresponding COBOL Variable is WS-FLG-USAGE-CTR
	 *	@param number
	 */
	public void setFlgUsageCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    flgUsageCtr = checkFlgUsageCtrMaxLimit(number); 
		serializeFlgUsageCtr(flgUsageCtr);
	}


	public void setFlgUsageCtr(long number) {
	    number = checkFlgUsageCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setFlgUsageCtr((int)number);
	}
	
	/**
	 *	Returns the value of flgLsbcaCtr
	 *	@return flgLsbcaCtr
	 */
	public int getFlgLsbcaCtr() throws CFException {
        if (isFlgLsbcaCtrModified()) { 
           flgLsbcaCtr = refreshFlgLsbcaCtr();
        }
   		return flgLsbcaCtr;
	}
	
	/**
	 * 	Update FlgLsbcaCtr with the passed value
	 *  Corresponding COBOL Variable is WS-FLG-LSBCA-CTR
	 *	@param number
	 */
	public void setFlgLsbcaCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    flgLsbcaCtr = checkFlgLsbcaCtrMaxLimit(number); 
		serializeFlgLsbcaCtr(flgLsbcaCtr);
	}


	public void setFlgLsbcaCtr(long number) {
	    number = checkFlgLsbcaCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setFlgLsbcaCtr((int)number);
	}
	
	/**
	 *	Returns the value of flgLsgremCtr
	 *	@return flgLsgremCtr
	 */
	public int getFlgLsgremCtr() throws CFException {
        if (isFlgLsgremCtrModified()) { 
           flgLsgremCtr = refreshFlgLsgremCtr();
        }
   		return flgLsgremCtr;
	}
	
	/**
	 * 	Update FlgLsgremCtr with the passed value
	 *  Corresponding COBOL Variable is WS-FLG-LSGREM-CTR
	 *	@param number
	 */
	public void setFlgLsgremCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    flgLsgremCtr = checkFlgLsgremCtrMaxLimit(number); 
		serializeFlgLsgremCtr(flgLsgremCtr);
	}


	public void setFlgLsgremCtr(long number) {
	    number = checkFlgLsgremCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setFlgLsgremCtr((int)number);
	}
	
	/**
	 *	Returns the value of flgAtdsumCtr
	 *	@return flgAtdsumCtr
	 */
	public int getFlgAtdsumCtr() throws CFException {
        if (isFlgAtdsumCtrModified()) { 
           flgAtdsumCtr = refreshFlgAtdsumCtr();
        }
   		return flgAtdsumCtr;
	}
	
	/**
	 * 	Update FlgAtdsumCtr with the passed value
	 *  Corresponding COBOL Variable is WS-FLG-ATDSUM-CTR
	 *	@param number
	 */
	public void setFlgAtdsumCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    flgAtdsumCtr = checkFlgAtdsumCtrMaxLimit(number); 
		serializeFlgAtdsumCtr(flgAtdsumCtr);
	}


	public void setFlgAtdsumCtr(long number) {
	    number = checkFlgAtdsumCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setFlgAtdsumCtr((int)number);
	}
	
	public BigDecimal getCustFlgUsgCtr() throws CFException {
        if (isCustFlgUsgCtrModified()) { 
           custFlgUsgCtr = refreshCustFlgUsgCtr();
        }
   		return custFlgUsgCtr;
	}

    public char[] getCustFlgUsgCtrString() {
          return  custFlgUsgCtrString();
    }
	
	/**
	 * 	Update CustFlgUsgCtr with the passed number
	 *  Corresponding COBOL Variable is WS-CUST-FLG-USG-CTR
	 *	@param number
	 */
	public void setCustFlgUsgCtr(BigDecimal number) {	
     custFlgUsgCtr = checkCustFlgUsgCtrMaxLimit(number);
	    serializeCustFlgUsgCtr(custFlgUsgCtr);
   }
	public BigDecimal getCustUsgCtr() throws CFException {
        if (isCustUsgCtrModified()) { 
           custUsgCtr = refreshCustUsgCtr();
        }
   		return custUsgCtr;
	}

    public char[] getCustUsgCtrString() {
          return  custUsgCtrString();
    }
	
	/**
	 * 	Update CustUsgCtr with the passed number
	 *  Corresponding COBOL Variable is WS-CUST-USG-CTR
	 *	@param number
	 */
	public void setCustUsgCtr(BigDecimal number) {	
     custUsgCtr = checkCustUsgCtrMaxLimit(number);
	    serializeCustUsgCtr(custUsgCtr);
   }
	public BigDecimal getFgvAlwCount() throws CFException {
        if (isFgvAlwCountModified()) { 
           fgvAlwCount = refreshFgvAlwCount();
        }
   		return fgvAlwCount;
	}

    public char[] getFgvAlwCountString() {
          return  fgvAlwCountString();
    }
	
	/**
	 * 	Update FgvAlwCount with the passed number
	 *  Corresponding COBOL Variable is WS-FGV-ALW-COUNT
	 *	@param number
	 */
	public void setFgvAlwCount(BigDecimal number) {	
     fgvAlwCount = checkFgvAlwCountMaxLimit(number);
	    serializeFgvAlwCount(fgvAlwCount);
   }
	/**
	 *	Returns the value of okdCpduCtr
	 *	@return okdCpduCtr
	 */
	public int getOkdCpduCtr() throws CFException {
        if (isOkdCpduCtrModified()) { 
           okdCpduCtr = refreshOkdCpduCtr();
        }
   		return okdCpduCtr;
	}
	
	/**
	 * 	Update OkdCpduCtr with the passed value
	 *  Corresponding COBOL Variable is WS-OKD-CPDU-CTR
	 *	@param number
	 */
	public void setOkdCpduCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    okdCpduCtr = checkOkdCpduCtrMaxLimit(number); 
		serializeOkdCpduCtr(okdCpduCtr);
	}


	public void setOkdCpduCtr(long number) {
	    number = checkOkdCpduCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setOkdCpduCtr((int)number);
	}
	
	/**
	 *	Returns the value of okdUsageCtr
	 *	@return okdUsageCtr
	 */
	public int getOkdUsageCtr() throws CFException {
        if (isOkdUsageCtrModified()) { 
           okdUsageCtr = refreshOkdUsageCtr();
        }
   		return okdUsageCtr;
	}
	
	/**
	 * 	Update OkdUsageCtr with the passed value
	 *  Corresponding COBOL Variable is WS-OKD-USAGE-CTR
	 *	@param number
	 */
	public void setOkdUsageCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    okdUsageCtr = checkOkdUsageCtrMaxLimit(number); 
		serializeOkdUsageCtr(okdUsageCtr);
	}


	public void setOkdUsageCtr(long number) {
	    number = checkOkdUsageCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setOkdUsageCtr((int)number);
	}
	
	/**
	 *	Returns the value of okdLsbcaCtr
	 *	@return okdLsbcaCtr
	 */
	public int getOkdLsbcaCtr() throws CFException {
        if (isOkdLsbcaCtrModified()) { 
           okdLsbcaCtr = refreshOkdLsbcaCtr();
        }
   		return okdLsbcaCtr;
	}
	
	/**
	 * 	Update OkdLsbcaCtr with the passed value
	 *  Corresponding COBOL Variable is WS-OKD-LSBCA-CTR
	 *	@param number
	 */
	public void setOkdLsbcaCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    okdLsbcaCtr = checkOkdLsbcaCtrMaxLimit(number); 
		serializeOkdLsbcaCtr(okdLsbcaCtr);
	}


	public void setOkdLsbcaCtr(long number) {
	    number = checkOkdLsbcaCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setOkdLsbcaCtr((int)number);
	}
	
	/**
	 *	Returns the value of okdLsgremCtr
	 *	@return okdLsgremCtr
	 */
	public int getOkdLsgremCtr() throws CFException {
        if (isOkdLsgremCtrModified()) { 
           okdLsgremCtr = refreshOkdLsgremCtr();
        }
   		return okdLsgremCtr;
	}
	
	/**
	 * 	Update OkdLsgremCtr with the passed value
	 *  Corresponding COBOL Variable is WS-OKD-LSGREM-CTR
	 *	@param number
	 */
	public void setOkdLsgremCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    okdLsgremCtr = checkOkdLsgremCtrMaxLimit(number); 
		serializeOkdLsgremCtr(okdLsgremCtr);
	}


	public void setOkdLsgremCtr(long number) {
	    number = checkOkdLsgremCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setOkdLsgremCtr((int)number);
	}
	
	/**
	 *	Returns the value of okdAtdsumCtr
	 *	@return okdAtdsumCtr
	 */
	public int getOkdAtdsumCtr() throws CFException {
        if (isOkdAtdsumCtrModified()) { 
           okdAtdsumCtr = refreshOkdAtdsumCtr();
        }
   		return okdAtdsumCtr;
	}
	
	/**
	 * 	Update OkdAtdsumCtr with the passed value
	 *  Corresponding COBOL Variable is WS-OKD-ATDSUM-CTR
	 *	@param number
	 */
	public void setOkdAtdsumCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    okdAtdsumCtr = checkOkdAtdsumCtrMaxLimit(number); 
		serializeOkdAtdsumCtr(okdAtdsumCtr);
	}


	public void setOkdAtdsumCtr(long number) {
	    number = checkOkdAtdsumCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setOkdAtdsumCtr((int)number);
	}
	
	/**
	 *	Returns the value of outCpduCtr
	 *	@return outCpduCtr
	 */
	public int getOutCpduCtr() throws CFException {
        if (isOutCpduCtrModified()) { 
           outCpduCtr = refreshOutCpduCtr();
        }
   		return outCpduCtr;
	}
	
	/**
	 * 	Update OutCpduCtr with the passed value
	 *  Corresponding COBOL Variable is WS-OUT-CPDU-CTR
	 *	@param number
	 */
	public void setOutCpduCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    outCpduCtr = checkOutCpduCtrMaxLimit(number); 
		serializeOutCpduCtr(outCpduCtr);
	}


	public void setOutCpduCtr(long number) {
	    number = checkOutCpduCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setOutCpduCtr((int)number);
	}
	
	/**
	 *	Returns the value of outBillmsgCtr
	 *	@return outBillmsgCtr
	 */
	public int getOutBillmsgCtr() throws CFException {
        if (isOutBillmsgCtrModified()) { 
           outBillmsgCtr = refreshOutBillmsgCtr();
        }
   		return outBillmsgCtr;
	}
	
	/**
	 * 	Update OutBillmsgCtr with the passed value
	 *  Corresponding COBOL Variable is WS-OUT-BILLMSG-CTR
	 *	@param number
	 */
	public void setOutBillmsgCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    outBillmsgCtr = checkOutBillmsgCtrMaxLimit(number); 
		serializeOutBillmsgCtr(outBillmsgCtr);
	}


	public void setOutBillmsgCtr(long number) {
	    number = checkOutBillmsgCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setOutBillmsgCtr((int)number);
	}
	
	/**
	 *	Returns the value of bypassBillmsgCtr
	 *	@return bypassBillmsgCtr
	 */
	public int getBypassBillmsgCtr() throws CFException {
        if (isBypassBillmsgCtrModified()) { 
           bypassBillmsgCtr = refreshBypassBillmsgCtr();
        }
   		return bypassBillmsgCtr;
	}
	
	/**
	 * 	Update BypassBillmsgCtr with the passed value
	 *  Corresponding COBOL Variable is WS-BYPASS-BILLMSG-CTR
	 *	@param number
	 */
	public void setBypassBillmsgCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    bypassBillmsgCtr = checkBypassBillmsgCtrMaxLimit(number); 
		serializeBypassBillmsgCtr(bypassBillmsgCtr);
	}


	public void setBypassBillmsgCtr(long number) {
	    number = checkBypassBillmsgCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBypassBillmsgCtr((int)number);
	}
	
	/**
	 *	Returns the value of outUsageCtr
	 *	@return outUsageCtr
	 */
	public int getOutUsageCtr() throws CFException {
        if (isOutUsageCtrModified()) { 
           outUsageCtr = refreshOutUsageCtr();
        }
   		return outUsageCtr;
	}
	
	/**
	 * 	Update OutUsageCtr with the passed value
	 *  Corresponding COBOL Variable is WS-OUT-USAGE-CTR
	 *	@param number
	 */
	public void setOutUsageCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    outUsageCtr = checkOutUsageCtrMaxLimit(number); 
		serializeOutUsageCtr(outUsageCtr);
	}


	public void setOutUsageCtr(long number) {
	    number = checkOutUsageCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setOutUsageCtr((int)number);
	}
	
	/**
	 *	Returns the value of outLsbcaCtr
	 *	@return outLsbcaCtr
	 */
	public int getOutLsbcaCtr() throws CFException {
        if (isOutLsbcaCtrModified()) { 
           outLsbcaCtr = refreshOutLsbcaCtr();
        }
   		return outLsbcaCtr;
	}
	
	/**
	 * 	Update OutLsbcaCtr with the passed value
	 *  Corresponding COBOL Variable is WS-OUT-LSBCA-CTR
	 *	@param number
	 */
	public void setOutLsbcaCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    outLsbcaCtr = checkOutLsbcaCtrMaxLimit(number); 
		serializeOutLsbcaCtr(outLsbcaCtr);
	}


	public void setOutLsbcaCtr(long number) {
	    number = checkOutLsbcaCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setOutLsbcaCtr((int)number);
	}
	
	/**
	 *	Returns the value of outLsgremCtr
	 *	@return outLsgremCtr
	 */
	public int getOutLsgremCtr() throws CFException {
        if (isOutLsgremCtrModified()) { 
           outLsgremCtr = refreshOutLsgremCtr();
        }
   		return outLsgremCtr;
	}
	
	/**
	 * 	Update OutLsgremCtr with the passed value
	 *  Corresponding COBOL Variable is WS-OUT-LSGREM-CTR
	 *	@param number
	 */
	public void setOutLsgremCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    outLsgremCtr = checkOutLsgremCtrMaxLimit(number); 
		serializeOutLsgremCtr(outLsgremCtr);
	}


	public void setOutLsgremCtr(long number) {
	    number = checkOutLsgremCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setOutLsgremCtr((int)number);
	}
	
	/**
	 *	Returns the value of outAtdsumCtr
	 *	@return outAtdsumCtr
	 */
	public int getOutAtdsumCtr() throws CFException {
        if (isOutAtdsumCtrModified()) { 
           outAtdsumCtr = refreshOutAtdsumCtr();
        }
   		return outAtdsumCtr;
	}
	
	/**
	 * 	Update OutAtdsumCtr with the passed value
	 *  Corresponding COBOL Variable is WS-OUT-ATDSUM-CTR
	 *	@param number
	 */
	public void setOutAtdsumCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    outAtdsumCtr = checkOutAtdsumCtrMaxLimit(number); 
		serializeOutAtdsumCtr(outAtdsumCtr);
	}


	public void setOutAtdsumCtr(long number) {
	    number = checkOutAtdsumCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setOutAtdsumCtr((int)number);
	}
	
	/**
	 *	Returns the value of errAcctCtr
	 *	@return errAcctCtr
	 */
	public int getErrAcctCtr() throws CFException {
        if (isErrAcctCtrModified()) { 
           errAcctCtr = refreshErrAcctCtr();
        }
   		return errAcctCtr;
	}
	
	/**
	 * 	Update ErrAcctCtr with the passed value
	 *  Corresponding COBOL Variable is WS-ERR-ACCT-CTR
	 *	@param number
	 */
	public void setErrAcctCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    errAcctCtr = checkErrAcctCtrMaxLimit(number); 
		serializeErrAcctCtr(errAcctCtr);
	}


	public void setErrAcctCtr(long number) {
	    number = checkErrAcctCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setErrAcctCtr((int)number);
	}
	
	/**
	 *	Returns the value of errThreshold
	 *	@return errThreshold
	 */
	public int getErrThreshold() throws CFException {
        if (isErrThresholdModified()) { 
           errThreshold = refreshErrThreshold();
        }
   		return errThreshold;
	}
	
	/**
	 * 	Update ErrThreshold with the passed value
	 *  Corresponding COBOL Variable is WS-ERR-THRESHOLD
	 *	@param number
	 */
	public void setErrThreshold(int number) {
	     // Truncate if the number is beyond +/- Max range
	    errThreshold = checkErrThresholdMaxLimit(number); 
		serializeErrThreshold(errThreshold);
	}


	public void setErrThreshold(long number) {
	    number = checkErrThresholdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setErrThreshold((int)number);
	}
	
	/**
	 *	Returns the value of alpPlanCtr
	 *	@return alpPlanCtr
	 */
	public int getAlpPlanCtr() throws CFException {
        if (isAlpPlanCtrModified()) { 
           alpPlanCtr = refreshAlpPlanCtr();
        }
   		return alpPlanCtr;
	}
	
	/**
	 * 	Update AlpPlanCtr with the passed value
	 *  Corresponding COBOL Variable is WS-ALP-PLAN-CTR
	 *	@param number
	 */
	public void setAlpPlanCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    alpPlanCtr = checkAlpPlanCtrMaxLimit(number); 
		serializeAlpPlanCtr(alpPlanCtr);
	}


	public void setAlpPlanCtr(long number) {
	    number = checkAlpPlanCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setAlpPlanCtr((int)number);
	}
	
	/**
	 *	Returns the value of sfoPlanCtr
	 *	@return sfoPlanCtr
	 */
	public int getSfoPlanCtr() throws CFException {
        if (isSfoPlanCtrModified()) { 
           sfoPlanCtr = refreshSfoPlanCtr();
        }
   		return sfoPlanCtr;
	}
	
	/**
	 * 	Update SfoPlanCtr with the passed value
	 *  Corresponding COBOL Variable is WS-SFO-PLAN-CTR
	 *	@param number
	 */
	public void setSfoPlanCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sfoPlanCtr = checkSfoPlanCtrMaxLimit(number); 
		serializeSfoPlanCtr(sfoPlanCtr);
	}


	public void setSfoPlanCtr(long number) {
	    number = checkSfoPlanCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSfoPlanCtr((int)number);
	}
	
	/**
	 *	Returns the value of spoAlwCtr
	 *	@return spoAlwCtr
	 */
	public int getSpoAlwCtr() throws CFException {
        if (isSpoAlwCtrModified()) { 
           spoAlwCtr = refreshSpoAlwCtr();
        }
   		return spoAlwCtr;
	}
	
	/**
	 * 	Update SpoAlwCtr with the passed value
	 *  Corresponding COBOL Variable is WS-SPO-ALW-CTR
	 *	@param number
	 */
	public void setSpoAlwCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    spoAlwCtr = checkSpoAlwCtrMaxLimit(number); 
		serializeSpoAlwCtr(spoAlwCtr);
	}


	public void setSpoAlwCtr(long number) {
	    number = checkSpoAlwCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSpoAlwCtr((int)number);
	}
	
	/**
	 *	Returns the value of glbProdCtr
	 *	@return glbProdCtr
	 */
	public int getGlbProdCtr() throws CFException {
        if (isGlbProdCtrModified()) { 
           glbProdCtr = refreshGlbProdCtr();
        }
   		return glbProdCtr;
	}
	
	/**
	 * 	Update GlbProdCtr with the passed value
	 *  Corresponding COBOL Variable is WS-GLB-PROD-CTR
	 *	@param number
	 */
	public void setGlbProdCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    glbProdCtr = checkGlbProdCtrMaxLimit(number); 
		serializeGlbProdCtr(glbProdCtr);
	}


	public void setGlbProdCtr(long number) {
	    number = checkGlbProdCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setGlbProdCtr((int)number);
	}
	
	/**
	 *	Returns the value of svcProdCtr
	 *	@return svcProdCtr
	 */
	public int getSvcProdCtr() throws CFException {
        if (isSvcProdCtrModified()) { 
           svcProdCtr = refreshSvcProdCtr();
        }
   		return svcProdCtr;
	}
	
	/**
	 * 	Update SvcProdCtr with the passed value
	 *  Corresponding COBOL Variable is WS-SVC-PROD-CTR
	 *	@param number
	 */
	public void setSvcProdCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    svcProdCtr = checkSvcProdCtrMaxLimit(number); 
		serializeSvcProdCtr(svcProdCtr);
	}


	public void setSvcProdCtr(long number) {
	    number = checkSvcProdCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSvcProdCtr((int)number);
	}
	
	/**
	 *	Returns the value of spoProdCtr
	 *	@return spoProdCtr
	 */
	public int getSpoProdCtr() throws CFException {
        if (isSpoProdCtrModified()) { 
           spoProdCtr = refreshSpoProdCtr();
        }
   		return spoProdCtr;
	}
	
	/**
	 * 	Update SpoProdCtr with the passed value
	 *  Corresponding COBOL Variable is WS-SPO-PROD-CTR
	 *	@param number
	 */
	public void setSpoProdCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    spoProdCtr = checkSpoProdCtrMaxLimit(number); 
		serializeSpoProdCtr(spoProdCtr);
	}


	public void setSpoProdCtr(long number) {
	    number = checkSpoProdCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSpoProdCtr((int)number);
	}
	
	/**
	 *	Returns the value of alpCpduCtr
	 *	@return alpCpduCtr
	 */
	public int getAlpCpduCtr() throws CFException {
        if (isAlpCpduCtrModified()) { 
           alpCpduCtr = refreshAlpCpduCtr();
        }
   		return alpCpduCtr;
	}
	
	/**
	 * 	Update AlpCpduCtr with the passed value
	 *  Corresponding COBOL Variable is WS-ALP-CPDU-CTR
	 *	@param number
	 */
	public void setAlpCpduCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    alpCpduCtr = checkAlpCpduCtrMaxLimit(number); 
		serializeAlpCpduCtr(alpCpduCtr);
	}


	public void setAlpCpduCtr(long number) {
	    number = checkAlpCpduCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setAlpCpduCtr((int)number);
	}
	
	/**
	 *	Returns the value of sfoCpduCtr
	 *	@return sfoCpduCtr
	 */
	public int getSfoCpduCtr() throws CFException {
        if (isSfoCpduCtrModified()) { 
           sfoCpduCtr = refreshSfoCpduCtr();
        }
   		return sfoCpduCtr;
	}
	
	/**
	 * 	Update SfoCpduCtr with the passed value
	 *  Corresponding COBOL Variable is WS-SFO-CPDU-CTR
	 *	@param number
	 */
	public void setSfoCpduCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sfoCpduCtr = checkSfoCpduCtrMaxLimit(number); 
		serializeSfoCpduCtr(sfoCpduCtr);
	}


	public void setSfoCpduCtr(long number) {
	    number = checkSfoCpduCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSfoCpduCtr((int)number);
	}
	
	/**
	 *	Returns the value of npspoCpduCtr
	 *	@return npspoCpduCtr
	 */
	public int getNpspoCpduCtr() throws CFException {
        if (isNpspoCpduCtrModified()) { 
           npspoCpduCtr = refreshNpspoCpduCtr();
        }
   		return npspoCpduCtr;
	}
	
	/**
	 * 	Update NpspoCpduCtr with the passed value
	 *  Corresponding COBOL Variable is WS-NPSPO-CPDU-CTR
	 *	@param number
	 */
	public void setNpspoCpduCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    npspoCpduCtr = checkNpspoCpduCtrMaxLimit(number); 
		serializeNpspoCpduCtr(npspoCpduCtr);
	}


	public void setNpspoCpduCtr(long number) {
	    number = checkNpspoCpduCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setNpspoCpduCtr((int)number);
	}
	
	/**
	 *	Returns the value of comCpduCtr
	 *	@return comCpduCtr
	 */
	public int getComCpduCtr() throws CFException {
        if (isComCpduCtrModified()) { 
           comCpduCtr = refreshComCpduCtr();
        }
   		return comCpduCtr;
	}
	
	/**
	 * 	Update ComCpduCtr with the passed value
	 *  Corresponding COBOL Variable is WS-COM-CPDU-CTR
	 *	@param number
	 */
	public void setComCpduCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    comCpduCtr = checkComCpduCtrMaxLimit(number); 
		serializeComCpduCtr(comCpduCtr);
	}


	public void setComCpduCtr(long number) {
	    number = checkComCpduCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setComCpduCtr((int)number);
	}
	
	/**
	 *	Returns the value of visCreateCtr
	 *	@return visCreateCtr
	 */
	public int getVisCreateCtr() throws CFException {
        if (isVisCreateCtrModified()) { 
           visCreateCtr = refreshVisCreateCtr();
        }
   		return visCreateCtr;
	}
	
	/**
	 * 	Update VisCreateCtr with the passed value
	 *  Corresponding COBOL Variable is WS-VIS-CREATE-CTR
	 *	@param number
	 */
	public void setVisCreateCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    visCreateCtr = checkVisCreateCtrMaxLimit(number); 
		serializeVisCreateCtr(visCreateCtr);
	}


	public void setVisCreateCtr(long number) {
	    number = checkVisCreateCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setVisCreateCtr((int)number);
	}
	
	/**
	 *	Returns the value of dupSpoAlwCtr
	 *	@return dupSpoAlwCtr
	 */
	public int getDupSpoAlwCtr() throws CFException {
        if (isDupSpoAlwCtrModified()) { 
           dupSpoAlwCtr = refreshDupSpoAlwCtr();
        }
   		return dupSpoAlwCtr;
	}
	
	/**
	 * 	Update DupSpoAlwCtr with the passed value
	 *  Corresponding COBOL Variable is WS-DUP-SPO-ALW-CTR
	 *	@param number
	 */
	public void setDupSpoAlwCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    dupSpoAlwCtr = checkDupSpoAlwCtrMaxLimit(number); 
		serializeDupSpoAlwCtr(dupSpoAlwCtr);
	}


	public void setDupSpoAlwCtr(long number) {
	    number = checkDupSpoAlwCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setDupSpoAlwCtr((int)number);
	}
	
	/**
	 *	Returns the value of discArrayCtr
	 *	@return discArrayCtr
	 */
	public int getDiscArrayCtr() throws CFException {
        if (isDiscArrayCtrModified()) { 
           discArrayCtr = refreshDiscArrayCtr();
        }
   		return discArrayCtr;
	}
	
	/**
	 * 	Update DiscArrayCtr with the passed value
	 *  Corresponding COBOL Variable is WS-DISC-ARRAY-CTR
	 *	@param number
	 */
	public void setDiscArrayCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    discArrayCtr = checkDiscArrayCtrMaxLimit(number); 
		serializeDiscArrayCtr(discArrayCtr);
	}


	public void setDiscArrayCtr(long number) {
	    number = checkDiscArrayCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setDiscArrayCtr((int)number);
	}
	
	/**
	 *	Returns the value of revoRejectCtr
	 *	@return revoRejectCtr
	 */
	public int getRevoRejectCtr() throws CFException {
        if (isRevoRejectCtrModified()) { 
           revoRejectCtr = refreshRevoRejectCtr();
        }
   		return revoRejectCtr;
	}
	
	/**
	 * 	Update RevoRejectCtr with the passed value
	 *  Corresponding COBOL Variable is WS-REVO-REJECT-CTR
	 *	@param number
	 */
	public void setRevoRejectCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    revoRejectCtr = checkRevoRejectCtrMaxLimit(number); 
		serializeRevoRejectCtr(revoRejectCtr);
	}


	public void setRevoRejectCtr(long number) {
	    number = checkRevoRejectCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setRevoRejectCtr((int)number);
	}
	
	/**
	 *	Returns the value of basvcprdCtr
	 *	@return basvcprdCtr
	 */
	public int getBasvcprdCtr() throws CFException {
        if (isBasvcprdCtrModified()) { 
           basvcprdCtr = refreshBasvcprdCtr();
        }
   		return basvcprdCtr;
	}
	
	/**
	 * 	Update BasvcprdCtr with the passed value
	 *  Corresponding COBOL Variable is WS-BASVCPRD-CTR
	 *	@param number
	 */
	public void setBasvcprdCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    basvcprdCtr = checkBasvcprdCtrMaxLimit(number); 
		serializeBasvcprdCtr(basvcprdCtr);
	}


	public void setBasvcprdCtr(long number) {
	    number = checkBasvcprdCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBasvcprdCtr((int)number);
	}
	
	/**
	 *	Returns the value of dtsvcalwCtr
	 *	@return dtsvcalwCtr
	 */
	public int getDtsvcalwCtr() throws CFException {
        if (isDtsvcalwCtrModified()) { 
           dtsvcalwCtr = refreshDtsvcalwCtr();
        }
   		return dtsvcalwCtr;
	}
	
	/**
	 * 	Update DtsvcalwCtr with the passed value
	 *  Corresponding COBOL Variable is WS-DTSVCALW-CTR
	 *	@param number
	 */
	public void setDtsvcalwCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    dtsvcalwCtr = checkDtsvcalwCtrMaxLimit(number); 
		serializeDtsvcalwCtr(dtsvcalwCtr);
	}


	public void setDtsvcalwCtr(long number) {
	    number = checkDtsvcalwCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setDtsvcalwCtr((int)number);
	}
	
	/**
	 *	Returns the value of sfoplanCtr01
	 *	@return sfoplanCtr01
	 */
	public int getSfoplanCtr01() throws CFException {
        if (isSfoplanCtr01Modified()) { 
           sfoplanCtr01 = refreshSfoplanCtr01();
        }
   		return sfoplanCtr01;
	}
	
	/**
	 * 	Update SfoplanCtr01 with the passed value
	 *  Corresponding COBOL Variable is WS-SFOPLAN-CTR
	 *	@param number
	 */
	public void setSfoplanCtr01(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sfoplanCtr01 = checkSfoplanCtr01MaxLimit(number); 
		serializeSfoplanCtr01(sfoplanCtr01);
	}


	public void setSfoplanCtr01(long number) {
	    number = checkSfoplanCtr01MaxLimit(number); // Truncate if value is beyond +/- Max range
		setSfoplanCtr01((int)number);
	}
	
	/**
	 *	Returns the value of spoallowCtr
	 *	@return spoallowCtr
	 */
	public int getSpoallowCtr() throws CFException {
        if (isSpoallowCtrModified()) { 
           spoallowCtr = refreshSpoallowCtr();
        }
   		return spoallowCtr;
	}
	
	/**
	 * 	Update SpoallowCtr with the passed value
	 *  Corresponding COBOL Variable is WS-SPOALLOW-CTR
	 *	@param number
	 */
	public void setSpoallowCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    spoallowCtr = checkSpoallowCtrMaxLimit(number); 
		serializeSpoallowCtr(spoallowCtr);
	}


	public void setSpoallowCtr(long number) {
	    number = checkSpoallowCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSpoallowCtr((int)number);
	}
	
	/**
	 *	Returns the value of mtnfileCtr
	 *	@return mtnfileCtr
	 */
	public int getMtnfileCtr() throws CFException {
        if (isMtnfileCtrModified()) { 
           mtnfileCtr = refreshMtnfileCtr();
        }
   		return mtnfileCtr;
	}
	
	/**
	 * 	Update MtnfileCtr with the passed value
	 *  Corresponding COBOL Variable is WS-MTNFILE-CTR
	 *	@param number
	 */
	public void setMtnfileCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mtnfileCtr = checkMtnfileCtrMaxLimit(number); 
		serializeMtnfileCtr(mtnfileCtr);
	}


	public void setMtnfileCtr(long number) {
	    number = checkMtnfileCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMtnfileCtr((int)number);
	}
	
	/**
	 *	Returns the value of u07fileCtr
	 *	@return u07fileCtr
	 */
	public int getU07fileCtr() throws CFException {
        if (isU07fileCtrModified()) { 
           u07fileCtr = refreshU07fileCtr();
        }
   		return u07fileCtr;
	}
	
	/**
	 * 	Update U07fileCtr with the passed value
	 *  Corresponding COBOL Variable is WS-U07FILE-CTR
	 *	@param number
	 */
	public void setU07fileCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    u07fileCtr = checkU07fileCtrMaxLimit(number); 
		serializeU07fileCtr(u07fileCtr);
	}


	public void setU07fileCtr(long number) {
	    number = checkU07fileCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setU07fileCtr((int)number);
	}
	
	/**
	 *	Returns the value of rccycCtr
	 *	@return rccycCtr
	 */
	public int getRccycCtr() throws CFException {
        if (isRccycCtrModified()) { 
           rccycCtr = refreshRccycCtr();
        }
   		return rccycCtr;
	}
	
	/**
	 * 	Update RccycCtr with the passed value
	 *  Corresponding COBOL Variable is WS-RCCYC-CTR
	 *	@param number
	 */
	public void setRccycCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    rccycCtr = checkRccycCtrMaxLimit(number); 
		serializeRccycCtr(rccycCtr);
	}


	public void setRccycCtr(long number) {
	    number = checkRccycCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setRccycCtr((int)number);
	}
	
	/**
	 *	Returns the value of m2mAlwCtr
	 *	@return m2mAlwCtr
	 */
	public int getM2mAlwCtr() throws CFException {
        if (isM2mAlwCtrModified()) { 
           m2mAlwCtr = refreshM2mAlwCtr();
        }
   		return m2mAlwCtr;
	}
	
	/**
	 * 	Update M2mAlwCtr with the passed value
	 *  Corresponding COBOL Variable is WS-M2M-ALW-CTR
	 *	@param number
	 */
	public void setM2mAlwCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    m2mAlwCtr = checkM2mAlwCtrMaxLimit(number); 
		serializeM2mAlwCtr(m2mAlwCtr);
	}


	public void setM2mAlwCtr(long number) {
	    number = checkM2mAlwCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setM2mAlwCtr((int)number);
	}
	
	/**
	 *	Returns the value of m2mpromoCtr
	 *	@return m2mpromoCtr
	 */
	public int getM2mpromoCtr() throws CFException {
        if (isM2mpromoCtrModified()) { 
           m2mpromoCtr = refreshM2mpromoCtr();
        }
   		return m2mpromoCtr;
	}
	
	/**
	 * 	Update M2mpromoCtr with the passed value
	 *  Corresponding COBOL Variable is WS-M2MPROMO-CTR
	 *	@param number
	 */
	public void setM2mpromoCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    m2mpromoCtr = checkM2mpromoCtrMaxLimit(number); 
		serializeM2mpromoCtr(m2mpromoCtr);
	}


	public void setM2mpromoCtr(long number) {
	    number = checkM2mpromoCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setM2mpromoCtr((int)number);
	}
	
	/**
	 *	Returns the value of mtnStatCtr
	 *	@return mtnStatCtr
	 */
	public int getMtnStatCtr() throws CFException {
        if (isMtnStatCtrModified()) { 
           mtnStatCtr = refreshMtnStatCtr();
        }
   		return mtnStatCtr;
	}
	
	/**
	 * 	Update MtnStatCtr with the passed value
	 *  Corresponding COBOL Variable is WS-MTN-STAT-CTR
	 *	@param number
	 */
	public void setMtnStatCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mtnStatCtr = checkMtnStatCtrMaxLimit(number); 
		serializeMtnStatCtr(mtnStatCtr);
	}


	public void setMtnStatCtr(long number) {
	    number = checkMtnStatCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMtnStatCtr((int)number);
	}
	
	/**
	 *	Returns the value of m2mTermCtr
	 *	@return m2mTermCtr
	 */
	public int getM2mTermCtr() throws CFException {
        if (isM2mTermCtrModified()) { 
           m2mTermCtr = refreshM2mTermCtr();
        }
   		return m2mTermCtr;
	}
	
	/**
	 * 	Update M2mTermCtr with the passed value
	 *  Corresponding COBOL Variable is WS-M2M-TERM-CTR
	 *	@param number
	 */
	public void setM2mTermCtr(int number) {
	     // Truncate if the number is beyond +/- Max range
	    m2mTermCtr = checkM2mTermCtrMaxLimit(number); 
		serializeM2mTermCtr(m2mTermCtr);
	}


	public void setM2mTermCtr(long number) {
	    number = checkM2mTermCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setM2mTermCtr((int)number);
	}
	
	/**
	 *	Returns the value of trlCpduCnt
	 *	@return trlCpduCnt
	 */
	public int getTrlCpduCnt() throws CFException {
        if (isTrlCpduCntModified()) { 
           trlCpduCnt = refreshTrlCpduCnt();
        }
   		return trlCpduCnt;
	}
	
	/**
	 * 	Update TrlCpduCnt with the passed value
	 *  Corresponding COBOL Variable is WS-TRL-CPDU-CNT
	 *	@param number
	 */
	public void setTrlCpduCnt(int number) {
	     // Truncate if the number is beyond +/- Max range
	    trlCpduCnt = checkTrlCpduCntMaxLimit(number); 
		serializeTrlCpduCnt(trlCpduCnt);
	}


	public void setTrlCpduCnt(long number) {
	    number = checkTrlCpduCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTrlCpduCnt((int)number);
	}
	
	/**
	 *	Returns the value of trlUsageCnt
	 *	@return trlUsageCnt
	 */
	public int getTrlUsageCnt() throws CFException {
        if (isTrlUsageCntModified()) { 
           trlUsageCnt = refreshTrlUsageCnt();
        }
   		return trlUsageCnt;
	}
	
	/**
	 * 	Update TrlUsageCnt with the passed value
	 *  Corresponding COBOL Variable is WS-TRL-USAGE-CNT
	 *	@param number
	 */
	public void setTrlUsageCnt(int number) {
	     // Truncate if the number is beyond +/- Max range
	    trlUsageCnt = checkTrlUsageCntMaxLimit(number); 
		serializeTrlUsageCnt(trlUsageCnt);
	}


	public void setTrlUsageCnt(long number) {
	    number = checkTrlUsageCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTrlUsageCnt((int)number);
	}
	
	/**
	 *	Returns the value of trlLsbcaCnt
	 *	@return trlLsbcaCnt
	 */
	public int getTrlLsbcaCnt() throws CFException {
        if (isTrlLsbcaCntModified()) { 
           trlLsbcaCnt = refreshTrlLsbcaCnt();
        }
   		return trlLsbcaCnt;
	}
	
	/**
	 * 	Update TrlLsbcaCnt with the passed value
	 *  Corresponding COBOL Variable is WS-TRL-LSBCA-CNT
	 *	@param number
	 */
	public void setTrlLsbcaCnt(int number) {
	     // Truncate if the number is beyond +/- Max range
	    trlLsbcaCnt = checkTrlLsbcaCntMaxLimit(number); 
		serializeTrlLsbcaCnt(trlLsbcaCnt);
	}


	public void setTrlLsbcaCnt(long number) {
	    number = checkTrlLsbcaCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTrlLsbcaCnt((int)number);
	}
	
	/**
	 *	Returns the value of trlLsgremCnt
	 *	@return trlLsgremCnt
	 */
	public int getTrlLsgremCnt() throws CFException {
        if (isTrlLsgremCntModified()) { 
           trlLsgremCnt = refreshTrlLsgremCnt();
        }
   		return trlLsgremCnt;
	}
	
	/**
	 * 	Update TrlLsgremCnt with the passed value
	 *  Corresponding COBOL Variable is WS-TRL-LSGREM-CNT
	 *	@param number
	 */
	public void setTrlLsgremCnt(int number) {
	     // Truncate if the number is beyond +/- Max range
	    trlLsgremCnt = checkTrlLsgremCntMaxLimit(number); 
		serializeTrlLsgremCnt(trlLsgremCnt);
	}


	public void setTrlLsgremCnt(long number) {
	    number = checkTrlLsgremCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTrlLsgremCnt((int)number);
	}
	
	/**
	 *	Returns the value of trlAtdsumCnt
	 *	@return trlAtdsumCnt
	 */
	public int getTrlAtdsumCnt() throws CFException {
        if (isTrlAtdsumCntModified()) { 
           trlAtdsumCnt = refreshTrlAtdsumCnt();
        }
   		return trlAtdsumCnt;
	}
	
	/**
	 * 	Update TrlAtdsumCnt with the passed value
	 *  Corresponding COBOL Variable is WS-TRL-ATDSUM-CNT
	 *	@param number
	 */
	public void setTrlAtdsumCnt(int number) {
	     // Truncate if the number is beyond +/- Max range
	    trlAtdsumCnt = checkTrlAtdsumCntMaxLimit(number); 
		serializeTrlAtdsumCnt(trlAtdsumCnt);
	}


	public void setTrlAtdsumCnt(long number) {
	    number = checkTrlAtdsumCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTrlAtdsumCnt((int)number);
	}
	
	/**
	 *	Returns the value of saveI
	 *	@return saveI
	 */
	public short getSaveI() throws CFException {
        if (isSaveIModified()) { 
           saveI = refreshSaveI();
        }
   		return saveI;
	}
	
	/**
	 * 	Update SaveI with the passed value
	 *  Corresponding COBOL Variable is WS-SAVE-I
	 *	@param number
	 */
	public void setSaveI(short number) {
	     // Truncate if the number is beyond +/- Max range
	    saveI = checkSaveIMaxLimit(number); 
		serializeSaveI(saveI);
	}

	public void setSaveI(int number) {
	    number = checkSaveIMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSaveI((short)number);
	}
	public void setSaveI(long number) {
	    number = checkSaveIMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSaveI((short)number);
	}
	

	/**
	 *	Returns the value of count
	 *	@return count
	 */
	public short getCount() throws CFException {
        if (isCountModified()) { 
           count = refreshCount();
        }
   		return count;
	}
	
	/**
	 * 	Update Count with the passed value
	 *  Corresponding COBOL Variable is WS-COUNT
	 *	@param number
	 */
	public void setCount(short number) {
	     // Truncate if the number is beyond +/- Max range
	    count = checkCountMaxLimit(number); 
		serializeCount(count);
	}

	public void setCount(int number) {
	    number = checkCountMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCount((short)number);
	}
	public void setCount(long number) {
	    number = checkCountMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCount((short)number);
	}
	

	/**
	 *	Returns the value of idx
	 *	@return idx
	 */
	public short getIdx() throws CFException {
        if (isIdxModified()) { 
           idx = refreshIdx();
        }
   		return idx;
	}
	
	/**
	 * 	Update Idx with the passed value
	 *  Corresponding COBOL Variable is WS-IDX
	 *	@param number
	 */
	public void setIdx(short number) {
	     // Truncate if the number is beyond +/- Max range
	    idx = checkIdxMaxLimit(number); 
		serializeIdx(idx);
	}

	public void setIdx(int number) {
	    number = checkIdxMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIdx((short)number);
	}
	public void setIdx(long number) {
	    number = checkIdxMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIdx((short)number);
	}
	


	
	
	
	/**
	 * 	initializes ProgramCounters
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setInvoiceCtr(0);
                     setJitrInvCtr(0);
                     setCommitCtr(0);
                     setQuotient(0);
                     setRemainder(0);
                     setAcctCpduCtr(0);
                     setAcctUsageCtr(0);
                     setAcctLsbcaCtr(0);
                     setAcctLsgremCtr(0);
			setAcctDataChgAmt(BigDecimal.ZERO);
                     setBillCpduCtr(0);
                     setBillUsageCtr(0);
                     setBillLsbcaCtr(0);
                     setBillLsgremCtr(0);
			setBillDataChgAmt(BigDecimal.ZERO);
                     setUbCpduCtr(0);
                     setUbBillmsgCtr(0);
                     setUbUsageCtr(0);
			setUbDataChgAmt(BigDecimal.ZERO);
			setTotDataChgAmt(BigDecimal.ZERO);
                     setUbLsbcaCtr(0);
                     setUbLsgremCtr(0);
                     setLnshrgCtr(0);
                     setUbAtdsumCtr(0);
                     setFlgCpduCtr(0);
                     setFlgUsageCtr(0);
                     setFlgLsbcaCtr(0);
                     setFlgLsgremCtr(0);
                     setFlgAtdsumCtr(0);
			setCustFlgUsgCtr(BigDecimal.ZERO);
			setCustUsgCtr(BigDecimal.ZERO);
			setFgvAlwCount(BigDecimal.ZERO);
                     setOkdCpduCtr(0);
                     setOkdUsageCtr(0);
                     setOkdLsbcaCtr(0);
                     setOkdLsgremCtr(0);
                     setOkdAtdsumCtr(0);
                     setOutCpduCtr(0);
                     setOutBillmsgCtr(0);
                     setBypassBillmsgCtr(0);
                     setOutUsageCtr(0);
                     setOutLsbcaCtr(0);
                     setOutLsgremCtr(0);
                     setOutAtdsumCtr(0);
                     setErrAcctCtr(0);
                     setErrThreshold(0);
                     setAlpPlanCtr(0);
                     setSfoPlanCtr(0);
                     setSpoAlwCtr(0);
                     setGlbProdCtr(0);
                     setSvcProdCtr(0);
                     setSpoProdCtr(0);
                     setAlpCpduCtr(0);
                     setSfoCpduCtr(0);
                     setNpspoCpduCtr(0);
                     setComCpduCtr(0);
                     setVisCreateCtr(0);
                     setDupSpoAlwCtr(0);
                     setDiscArrayCtr(0);
                     setRevoRejectCtr(0);
                     setBasvcprdCtr(0);
                     setDtsvcalwCtr(0);
                     setSfoplanCtr01(0);
                     setSpoallowCtr(0);
                     setMtnfileCtr(0);
                     setU07fileCtr(0);
                     setRccycCtr(0);
                     setM2mAlwCtr(0);
                     setM2mpromoCtr(0);
                     setMtnStatCtr(0);
                     setM2mTermCtr(0);
                     setTrlCpduCnt(0);
                     setTrlUsageCnt(0);
                     setTrlLsbcaCnt(0);
                     setTrlLsgremCnt(0);
                     setTrlAtdsumCnt(0);
         	setSaveI((short)0);
         	setCount((short)0);
         	setIdx((short)0);
   }

		public static int getProgramCountersFieldLength() {
			return PROGRAM_COUNTERS_LENGTH;
		}

}
  
