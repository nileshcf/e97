package com.cloudframe.app.init1.dto;

/**
*  The class ProgramCounters is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


@Data
public class ProgramCounters extends ProgramCountersSerialized { 
   

								@Getter @Setter private int invoiceCtr;

								@Getter @Setter private int jitrInvCtr;

								@Getter @Setter private int commitCtr;

								@Getter @Setter private int quotient;

								@Getter @Setter private int remainder;

								@Getter @Setter private int acctCpduCtr;

								@Getter @Setter private int acctUsageCtr;

								@Getter @Setter private int acctLsbcaCtr;

								@Getter @Setter private int acctLsgremCtr;

								@Getter @Setter private BigDecimal acctDataChgAmt = BigDecimal.ZERO;

								@Getter @Setter private int billCpduCtr;

								@Getter @Setter private int billUsageCtr;

								@Getter @Setter private int billLsbcaCtr;

								@Getter @Setter private int billLsgremCtr;

								@Getter @Setter private BigDecimal billDataChgAmt = BigDecimal.ZERO;

								@Getter @Setter private int ubCpduCtr;

								@Getter @Setter private int ubBillmsgCtr;

								@Getter @Setter private int ubUsageCtr;

								@Getter @Setter private BigDecimal ubDataChgAmt = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal totDataChgAmt = BigDecimal.ZERO;

								@Getter @Setter private int ubLsbcaCtr;

								@Getter @Setter private int ubLsgremCtr;

								@Getter @Setter private int lnshrgCtr;

								@Getter @Setter private int ubAtdsumCtr;

								@Getter @Setter private int flgCpduCtr;

								@Getter @Setter private int flgUsageCtr;

								@Getter @Setter private int flgLsbcaCtr;

								@Getter @Setter private int flgLsgremCtr;

								@Getter @Setter private int flgAtdsumCtr;

								@Getter @Setter private BigDecimal custFlgUsgCtr = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal custUsgCtr = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal fgvAlwCount = BigDecimal.ZERO;

								@Getter @Setter private int okdCpduCtr;

								@Getter @Setter private int okdUsageCtr;

								@Getter @Setter private int okdLsbcaCtr;

								@Getter @Setter private int okdLsgremCtr;

								@Getter @Setter private int okdAtdsumCtr;

								@Getter @Setter private int outCpduCtr;

								@Getter @Setter private int outBillmsgCtr;

								@Getter @Setter private int bypassBillmsgCtr;

								@Getter @Setter private int outUsageCtr;

								@Getter @Setter private int outLsbcaCtr;

								@Getter @Setter private int outLsgremCtr;

								@Getter @Setter private int outAtdsumCtr;

								@Getter @Setter private int errAcctCtr;

								@Getter @Setter private int errThreshold;

								@Getter @Setter private int alpPlanCtr;

								@Getter @Setter private int sfoPlanCtr;

								@Getter @Setter private int spoAlwCtr;

								@Getter @Setter private int glbProdCtr;

								@Getter @Setter private int svcProdCtr;

								@Getter @Setter private int spoProdCtr;

								@Getter @Setter private int alpCpduCtr;

								@Getter @Setter private int sfoCpduCtr;

								@Getter @Setter private int npspoCpduCtr;

								@Getter @Setter private int comCpduCtr;

								@Getter @Setter private int visCreateCtr;

								@Getter @Setter private int dupSpoAlwCtr;

								@Getter @Setter private int discArrayCtr;

								@Getter @Setter private int revoRejectCtr;

								@Getter @Setter private int basvcprdCtr;

								@Getter @Setter private int dtsvcalwCtr;

								@Getter @Setter private int sfoplanCtr01;

								@Getter @Setter private int spoallowCtr;

								@Getter @Setter private int mtnfileCtr;

								@Getter @Setter private int u07fileCtr;

								@Getter @Setter private int rccycCtr;

								@Getter @Setter private int m2mAlwCtr;

								@Getter @Setter private int m2mpromoCtr;

								@Getter @Setter private int mtnStatCtr;

								@Getter @Setter private int m2mTermCtr;

								@Getter @Setter private int trlCpduCnt;

								@Getter @Setter private int trlUsageCnt;

								@Getter @Setter private int trlLsbcaCnt;

								@Getter @Setter private int trlLsgremCnt;

								@Getter @Setter private int trlAtdsumCnt;

								@Getter @Setter private short saveI;

								@Getter @Setter private short count;

								@Getter @Setter private short idx;
	
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


}
  
