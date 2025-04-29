package com.cloudframe.app.ms00d363.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;


public class Work extends WorkSerialized {
   

						private char[] wsaProgramName = new char[8];

						private char[] wsaReleaseNbr = new char[8];

								private int mciabendAbendCode;

						private char[] blkLine = new char[133];

						private char[] productionTitle = new char[27];

						private char[] certificationTitle = new char[27];

						private char[] fastTrckTitle = new char[27];

						private char[] crEnvId = Field.fillLowValue(8);

						private char[] hdPage1Ln3b = new char[132];

						private char[] hdPage1Ln7 = new char[133];

						private char[] hdPage1Ln8 = new char[133];

						private char[] hdPage1Ln9 = new char[133];

						private char[] dashPage1Ln = new char[133];

						private char[] hdPage2Ln1 = new char[133];

						private char[] hdPage2Ln2 = new char[133];

						private char[] hdPage2Ln3 = new char[133];

						private char[] hdPage2Ln4 = new char[133];

						private char[] hdPage2Ln5 = new char[133];

						private char[] hdPage2Ln6 = new char[133];

						private char[] hdPage3Ln1 = new char[133];

						private char[] hdPage3Ln1a = new char[132];

						private char[] hdPage3Ln2 = new char[133];

						private char[] hdPage3Ln6 = new char[133];

						private char[] hdPage3Ln7 = new char[133];

						private char[] hdPage3Ln8 = new char[133];

						private char[] hdPage3Ln9 = new char[133];

						private char[] hdPage3Ln10 = new char[133];

						private char[] hdPage3Ln11 = new char[133];

						private char[] dt311SamacqNetAmt = Field.fillLowValue(18);

						private char[] dt311SamacqInd = new char[2];

						private char[] dt311SamacqFeeAmt = Field.fillLowValue(16);

						private char[] dt311SamacqFeeInd = new char[2];

						private char[] dt311SamissNetAmt = Field.fillLowValue(18);

						private char[] dt311SamissInd = new char[2];

						private char[] dt311SamissFeeAmt = Field.fillLowValue(16);

						private char[] dt311SamissFeeInd = new char[2];

						private char[] p2AcqPrint = new char[1];

						private char[] p2IssPrint = new char[1];

						private char[] swRptqEof = new char[1];

						private char[] swCurrEof = new char[1];

						private char[] swApcEof = new char[1];

						private char[] erlyFlagSw = new char[1];

								private int page2AcqFinDbCnt;

								private long page2AcqFinDbAmt;

								private int page2AcqTmpCrCnt;

								private int page2AcqTmpDbCnt;

								private int page2AcqFinCrCnt;

								private long page2AcqFinCrAmt;

								private int page2AcqAdjDbCnt;

								private long page2AcqAdjDbAmt;

								private int page2AcqAdjCrCnt;

								private long page2AcqAdjCrAmt;

								private int page2AcqAdj09DbCnt;

								private long page2AcqAdj09DbAmt;

								private int page2AcqAdj09CrCnt;

								private long page2AcqAdj09CrAmt;

								private int page2AcqA15ApdDbCnt;

								private int page2AcqA15ApdCrCnt;

								private long page2AcqFeeDbAmt;

								private long page2AcqNsdFeeDbAmt;

								private long page2AcqSdFeeDbAmt;

								private long page2AcqFeeCrAmt;

								private long page2AcqNsdFeeCrAmt;

								private long page2AcqSdFeeCrAmt;

								private int page2AcqAtmDbCnt;

								private long page2AcqAtmDbAmt;

								private int page2AcqAtmCrCnt;

								private long page2AcqAtmCrAmt;

								private int page2AcqPosDbCnt;

								private long page2AcqPosDbAmt;

								private int page2AcqPosCrCnt;

								private long page2AcqPosCrAmt;

								private int page2AcqAtmDbRevCnt;

								private long page2AcqAtmDbRevAmt;

								private int page2AcqAtmCrRevCnt;

								private long page2AcqAtmCrRevAmt;

								private int page2AcqPosDbRevCnt;

								private long page2AcqPosDbRevAmt;

								private int page2AcqPosCrRevCnt;

								private long page2AcqPosCrRevAmt;

								private int page2AcqSurchgFree;

								private int page2IssFinDbCnt;

								private long page2IssFinDbAmt;

								private int page2IssTmpDbCnt;

								private int page2IssTmpCrCnt;

								private int page2IssFinCrCnt;

								private long page2IssFinCrAmt;

								private int page2IssAdjDbCnt;

								private long page2IssAdjDbAmt;

								private int page2IssAdjCrCnt;

								private long page2IssAdjCrAmt;

								private int page2IssA15ApdDbCnt;

								private int page2IssA15ApdCrCnt;

								private int page2IssAdj09DbCnt;

								private long page2IssAdj09DbAmt;

								private int page2IssAdj09CrCnt;

								private long page2IssAdj09CrAmt;

								private long page2IssFeeDbAmt;

								private long page2IssFeeCrAmt;

								private int page2IssAtmDbCnt;

								private long page2IssAtmDbAmt;

								private int page2IssAtmCrCnt;

								private long page2IssAtmCrAmt;

								private int page2IssPosDbCnt;

								private long page2IssPosDbAmt;

								private int page2IssPosCrCnt;

								private long page2IssPosCrAmt;

								private int page2IssAtmDbRevCnt;

								private long page2IssAtmDbRevAmt;

								private int page2IssAtmCrRevCnt;

								private long page2IssAtmCrRevAmt;

								private int page2IssPosDbRevCnt;

								private long page2IssPosDbRevAmt;

								private int page2IssPosCrRevCnt;

								private long page2IssPosCrRevAmt;

								private long page2IssCcaDbAmt;

								private long page2IssCcaCrAmt;

								private long page2IssIccrDbAmt;

								private long page2IssIccrCrAmt;

								private int page2IssSurchgFree;

								private long page3AcqVatTotal;

								private long page3IssVatTotal;

								private int page3AcqVatFicnt;

								private long page3AcqVatFiamt;

								private long page3AcqVatFvamt;

								private int page3AcqVatNicnt;

								private long page3AcqVatNiamt;

								private long page3AcqVatNvamt;

								private int page3AcqVatTicnt;

								private long page3AcqVatTiamt;

								private long page3AcqVatTvamt;

								private int page3IssVatFicnt;

								private long page3IssVatFiamt;

								private long page3IssVatFvamt;

								private int page3IssVatNicnt;

								private long page3IssVatNiamt;

								private long page3IssVatNvamt;

								private int page3IssVatTicnt;

								private long page3IssVatTiamt;

								private long page3IssVatTvamt;

								private int page3NetVatFicnt;

								private long page3NetVatFiamt;

								private long page3NetVatFvamt;

								private int page3NetVatNicnt;

								private long page3NetVatNiamt;

								private long page3NetVatNvamt;

								private int page3NetVatTicnt;

								private long page3NetVatTiamt;

								private long page3NetVatTvamt;

								private int grandTotSw;

								private long amt;

								private long amtT4;

								private long amtT5;

								private long amtCca;

								private long amtIccr;

								private long amtCr;

								private long amtDb;

								private long amtCrFee;

								private long amtDbFee;

								private long netAcqDb;

								private long netAcqCr;

								private long netIssDb;

								private long netIssCr;

								private long netAchTot;

								private long netp4AcqDb;

								private long netp4AcqCr;

								private long netp4AcqTot;

								private long netp4IssDb;

								private long netp4IssCr;

								private long netp4IssTot;

								private long netp4AchTot;

						private char[] savSetlTyp = new char[1];

						private char[] savProcDesc = Field.fillLowValue(25);

						private char[] curProcDesc = Field.fillLowValue(25);

						private char[] savInstDesc = Field.fillLowValue(25);

						private char[] curInstDesc = Field.fillLowValue(25);

								private int hldAcqIssId;

								private int savAcqIssId;

								private int curAcqIssId;

						private char[] currSetlTyp = new char[1];

								private long savMbrEndpoint;

								private long curMbrEndpoint;

								private long savMbrEntIca;

								private long curMbrEntIca;

								private long savMbrMbrIca;

								private long curMbrMbrIca;

						private char[] savApcIca = new char[6];

								private BigDecimal apcTotAmount = BigDecimal.ZERO;

								private BigDecimal apcTotCrAmount = BigDecimal.ZERO;

								private BigDecimal apcTotDrAmount = BigDecimal.ZERO;

						private char[] firstRecord = new char[1];

						private char[] noActLine = new char[132];

						private char[] noActivitySw = new char[1];

						private char[] missingActivitySw = new char[1];

								private int prodNdx;

								private int ndxMax;

								private int ndx;

								private int curNdx;

								private long apcInx;

								private long inx;

								private long wS2;

						private char[] rptType = new char[1];

						private char[] systemTime = Field.fillLowValue(6);

								private int waPageCtr;

								private int waLineCtr;

						private char[] eofTranSw = new char[1];

								private int impDec;

								private int impDecEp;

								private long impAmtf;

								private long impAmte;

								private long impAmtep;

								private long impAmt;

								private long impAmtT4;

								private long impCnt;

								private long feeAmtNet;

								private long tot1FeeAmtCr;

								private long tot1FeeAmtDb;

								private long tot1FeeAmtNet01;

								private long tot1FinAmt01;

								private long tot1FinNbr01;

								private long tot1FinNbrDen01;

								private long tot1FinFeeNbr01;

								private long tot1PctFeeNbr01;

								private long tot1NfinFeeNbr01;

								private long tot1NbilFeeNbr01;

								private long exp1FeeAmtCr;

								private long exp1FeeAmtDb;

								private long exp1FeeAmtNet01;

								private long exp1FinAmt01;

								private long exp1FinNbr01;

								private long exp1FinNbrDen01;

								private long exp1FinFeeNbr01;

								private long exp1PctFeeNbr01;

								private long exp1NfinFeeNbr01;

								private long exp1NbilFeeNbr01;

								private long sub1FeeAmtCr;

								private long sub1FeeAmtDb;

								private long sub1FeeAmtNet01;

								private long sub1FinAmt01;

								private long sub1FinNbr01;

								private long sub1FinNbrDen01;

								private long sub1FinFeeNbr01;

								private long sub1PctFeeNbr01;

								private long sub1NfinFeeNbr01;

								private long sub1NbilFeeNbr01;

						private char[] saveWsAmtep = new char[20];

						private char[] saveWsAmtdt4 = new char[24];

						private char[] saveWsAmte = new char[16];

						private char[] swTranEof = new char[1];

						private char[] tranApc = new char[1];

						private char[] tranIca = new char[1];

								private int maxDays;

						private char[] message1 = new char[100];

						private char[] message2 = new char[100];

						private char[] message3 = new char[100];

						private char[] msg002NoParmInType = new char[100];

								private long mcrInCnt;

								private long mcrSkippedCnt;

								private int monthSub;

								private int x360HeaderCuttime01;

						private char[] x360SrtAcqIssId01 = new char[1];

						private char[] inhProcFlag = Field.fillLowValue(1);

						private char[] mceSw1 = new char[1];

						private char[] mceSw2 = new char[1];

								private long netmceTot;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setWsaProgramName(("SWCHXXXX").toCharArray());
								setWsaReleaseNbr(("XXXX.XX ").toCharArray());
								setBlkLine(pad(133," ".toCharArray(),' ',RIGHT_PAD));
								setProductionTitle(fillSpace(27));
								setCertificationTitle(("***CERTIFICATION TESTING***").toCharArray());
								setFastTrckTitle(("**FTF TEST***              ").toCharArray());
								setHdPage1Ln3b(pad(132," ".toCharArray(),' ',RIGHT_PAD));
								setHdPage1Ln7("0 DESCRIPTION             TRANSACTIONS            FINANCIAL    ---------------------------- INTERCHANGE ---------------------------- ".toCharArray());
								setHdPage1Ln8("                        NUMBER     NUMBER           AMOUNT     --------------- COUNTS ----------------  --------- AMOUNT  ---------- ".toCharArray());
								setHdPage1Ln9("                       APPROVED   DENIALS            TRANS     FINANCIAL   % BASED    NONFIN   NONBILL                               ".toCharArray());
								setDashPage1Ln("    -------------------------------------------------------------------------------------------------------------------------------- ".toCharArray());
								setHdPage2Ln1("0 DESCRIPTION                                DEBITS                                 CREDITS                                          ".toCharArray());
								setHdPage2Ln2("                                     NUMBER           AMOUNT                NUMBER           AMOUNT                                  ".toCharArray());
								setHdPage2Ln3("  FINANCIAL                                                                                                                          ".toCharArray());
								setHdPage2Ln4("0 EXCEPTION ITEMS                                                                                                                    ".toCharArray());
								setHdPage2Ln5("0 TOTAL FEES                                                                                                                         ".toCharArray());
								setHdPage2Ln6("0 INTERCHANGE                                                                                                                        ".toCharArray());
								setHdPage3Ln1("- ACQUIRER SETTLEMENT SUMMARY                  DEBIT                         CREDIT                         NET                      ".toCharArray());
								setHdPage3Ln1a("   NO                         CREDITS                         DEBITS                         NET                                    ".toCharArray());
								setHdPage3Ln2("- ISSUER SETTLEMENT SUMMARY                    DEBIT                         CREDIT                         NET                      ".toCharArray());
								setHdPage3Ln6(" -----------FINANCIAL TRANSACTIONS----------  --------NON-FINANCIAL TRANSACTIONS--------  ------------TOTAL TRANSACTIONS------------ ".toCharArray());
								setHdPage3Ln7("                 INTERCHANGE          VAT                    INTERCHANGE          VAT                    INTERCHANGE          VAT    ".toCharArray());
								setHdPage3Ln8("        COUNT       AMOUNT          AMOUNT          COUNT       AMOUNT          AMOUNT          COUNT       AMOUNT          AMOUNT   ".toCharArray());
								setHdPage3Ln9("0TOTAL ACQUIRER                                                                                                                      ".toCharArray());
								setHdPage3Ln10("0TOTAL ISSUER                                                                                                                        ".toCharArray());
								setHdPage3Ln11("0NET                                                                                                                                 ".toCharArray());
								setDt311SamacqInd(fillSpace(2));
								setDt311SamacqFeeInd(fillSpace(2));
								setDt311SamissInd(fillSpace(2));
								setDt311SamissFeeInd(fillSpace(2));
								setP2AcqPrint(("N").toCharArray());
								setP2IssPrint(("N").toCharArray());
								setSwRptqEof(("N").toCharArray());
								setSwCurrEof(("N").toCharArray());
								setSwApcEof(("N").toCharArray());
								setErlyFlagSw(("N").toCharArray());
								setPage2AcqFinDbCnt(0);
								setPage2AcqFinDbAmt(0L);
								setPage2AcqTmpCrCnt(0);
								setPage2AcqTmpDbCnt(0);
								setPage2AcqFinCrCnt(0);
								setPage2AcqFinCrAmt(0L);
								setPage2AcqAdjDbCnt(0);
								setPage2AcqAdjDbAmt(0L);
								setPage2AcqAdjCrCnt(0);
								setPage2AcqAdjCrAmt(0L);
								setPage2AcqAdj09DbCnt(0);
								setPage2AcqAdj09DbAmt(0L);
								setPage2AcqAdj09CrCnt(0);
								setPage2AcqAdj09CrAmt(0L);
								setPage2AcqA15ApdDbCnt(0);
								setPage2AcqA15ApdCrCnt(0);
								setPage2AcqFeeDbAmt(0L);
								setPage2AcqNsdFeeDbAmt(0L);
								setPage2AcqSdFeeDbAmt(0L);
								setPage2AcqFeeCrAmt(0L);
								setPage2AcqNsdFeeCrAmt(0L);
								setPage2AcqSdFeeCrAmt(0L);
								setPage2AcqAtmDbCnt(0);
								setPage2AcqAtmDbAmt(0L);
								setPage2AcqAtmCrCnt(0);
								setPage2AcqAtmCrAmt(0L);
								setPage2AcqPosDbCnt(0);
								setPage2AcqPosDbAmt(0L);
								setPage2AcqPosCrCnt(0);
								setPage2AcqPosCrAmt(0L);
								setPage2AcqAtmDbRevCnt(0);
								setPage2AcqAtmDbRevAmt(0L);
								setPage2AcqAtmCrRevCnt(0);
								setPage2AcqAtmCrRevAmt(0L);
								setPage2AcqPosDbRevCnt(0);
								setPage2AcqPosDbRevAmt(0L);
								setPage2AcqPosCrRevCnt(0);
								setPage2AcqPosCrRevAmt(0L);
								setPage2AcqSurchgFree(0);
								setPage2IssFinDbCnt(0);
								setPage2IssFinDbAmt(0L);
								setPage2IssTmpDbCnt(0);
								setPage2IssTmpCrCnt(0);
								setPage2IssFinCrCnt(0);
								setPage2IssFinCrAmt(0L);
								setPage2IssAdjDbCnt(0);
								setPage2IssAdjDbAmt(0L);
								setPage2IssAdjCrCnt(0);
								setPage2IssAdjCrAmt(0L);
								setPage2IssA15ApdDbCnt(0);
								setPage2IssA15ApdCrCnt(0);
								setPage2IssAdj09DbCnt(0);
								setPage2IssAdj09DbAmt(0L);
								setPage2IssAdj09CrCnt(0);
								setPage2IssAdj09CrAmt(0L);
								setPage2IssFeeDbAmt(0L);
								setPage2IssFeeCrAmt(0L);
								setPage2IssAtmDbCnt(0);
								setPage2IssAtmDbAmt(0L);
								setPage2IssAtmCrCnt(0);
								setPage2IssAtmCrAmt(0L);
								setPage2IssPosDbCnt(0);
								setPage2IssPosDbAmt(0L);
								setPage2IssPosCrCnt(0);
								setPage2IssPosCrAmt(0L);
								setPage2IssAtmDbRevCnt(0);
								setPage2IssAtmDbRevAmt(0L);
								setPage2IssAtmCrRevCnt(0);
								setPage2IssAtmCrRevAmt(0L);
								setPage2IssPosDbRevCnt(0);
								setPage2IssPosDbRevAmt(0L);
								setPage2IssPosCrRevCnt(0);
								setPage2IssPosCrRevAmt(0L);
								setPage2IssCcaDbAmt(0L);
								setPage2IssCcaCrAmt(0L);
								setPage2IssIccrDbAmt(0L);
								setPage2IssIccrCrAmt(0L);
								setPage2IssSurchgFree(0);
								setPage3AcqVatTotal(0L);
								setPage3IssVatTotal(0L);
								setPage3AcqVatFicnt(0);
								setPage3AcqVatFiamt(0L);
								setPage3AcqVatFvamt(0L);
								setPage3AcqVatNicnt(0);
								setPage3AcqVatNiamt(0L);
								setPage3AcqVatNvamt(0L);
								setPage3AcqVatTicnt(0);
								setPage3AcqVatTiamt(0L);
								setPage3AcqVatTvamt(0L);
								setPage3IssVatFicnt(0);
								setPage3IssVatFiamt(0L);
								setPage3IssVatFvamt(0L);
								setPage3IssVatNicnt(0);
								setPage3IssVatNiamt(0L);
								setPage3IssVatNvamt(0L);
								setPage3IssVatTicnt(0);
								setPage3IssVatTiamt(0L);
								setPage3IssVatTvamt(0L);
								setPage3NetVatFicnt(0);
								setPage3NetVatFiamt(0L);
								setPage3NetVatFvamt(0L);
								setPage3NetVatNicnt(0);
								setPage3NetVatNiamt(0L);
								setPage3NetVatNvamt(0L);
								setPage3NetVatTicnt(0);
								setPage3NetVatTiamt(0L);
								setPage3NetVatTvamt(0L);
								setGrandTotSw(0);
								setAmt(0L);
								setAmtT4(0L);
								setAmtT5(0L);
								setAmtCca(0L);
								setAmtIccr(0L);
								setAmtCr(0L);
								setAmtDb(0L);
								setAmtCrFee(0L);
								setAmtDbFee(0L);
								setNetAcqDb(0L);
								setNetAcqCr(0L);
								setNetIssDb(0L);
								setNetIssCr(0L);
								setNetAchTot(0L);
								setNetp4AcqDb(0L);
								setNetp4AcqCr(0L);
								setNetp4AcqTot(0L);
								setNetp4IssDb(0L);
								setNetp4IssCr(0L);
								setNetp4IssTot(0L);
								setNetp4AchTot(0L);
								setSavSetlTyp(fillSpace(1));
								setCurrSetlTyp(fillSpace(1));
								setSavMbrEndpoint(0L);
								setCurMbrEndpoint(0L);
								setSavMbrEntIca(0L);
								setCurMbrEntIca(0L);
								setSavMbrMbrIca(0L);
								setCurMbrMbrIca(0L);
								setSavApcIca("000000".toCharArray());
								setApcTotAmount(BigDecimal.ZERO);
								setApcTotCrAmount(BigDecimal.ZERO);
								setApcTotDrAmount(BigDecimal.ZERO);
								setFirstRecord(("Y").toCharArray());
								setNoActLine(" -             THERE WAS NO ACTIVITY REPORTED TODAY.                                                                                ".toCharArray());
								setNoActivitySw(("N").toCharArray());
								setMissingActivitySw(("N").toCharArray());
								setProdNdx(0);
								setNdxMax(0);
								setNdx(0);
								setCurNdx(0);
								setApcInx(0L);
								setInx(0L);
								setWS2(0L);
								setRptType(fillSpace(1));
								setWaPageCtr(0);
								setWaLineCtr(99);
								setEofTranSw(("N").toCharArray());
								setImpDec(0);
								setImpDecEp(0);
								setImpAmtf(0L);
								setImpAmte(0L);
								setImpAmtep(0L);
								setImpAmt(0L);
								setImpAmtT4(0L);
								setImpCnt(0L);
								setFeeAmtNet(0L);
								setTot1FeeAmtCr(0L);
								setTot1FeeAmtDb(0L);
								setTot1FeeAmtNet01(0L);
								setTot1FinAmt01(0L);
								setTot1FinNbr01(0L);
								setTot1FinNbrDen01(0L);
								setTot1FinFeeNbr01(0L);
								setTot1PctFeeNbr01(0L);
								setTot1NfinFeeNbr01(0L);
								setTot1NbilFeeNbr01(0L);
								setExp1FeeAmtCr(0L);
								setExp1FeeAmtDb(0L);
								setExp1FeeAmtNet01(0L);
								setExp1FinAmt01(0L);
								setExp1FinNbr01(0L);
								setExp1FinNbrDen01(0L);
								setExp1FinFeeNbr01(0L);
								setExp1PctFeeNbr01(0L);
								setExp1NfinFeeNbr01(0L);
								setExp1NbilFeeNbr01(0L);
								setSub1FeeAmtCr(0L);
								setSub1FeeAmtDb(0L);
								setSub1FeeAmtNet01(0L);
								setSub1FinAmt01(0L);
								setSub1FinNbr01(0L);
								setSub1FinNbrDen01(0L);
								setSub1FinFeeNbr01(0L);
								setSub1PctFeeNbr01(0L);
								setSub1NfinFeeNbr01(0L);
								setSub1NbilFeeNbr01(0L);
								setSaveWsAmtep(fillSpace(20));
								setSaveWsAmtdt4(fillSpace(24));
								setSaveWsAmte(fillSpace(16));
								setSwTranEof(("N").toCharArray());
								setTranApc(("N").toCharArray());
								setTranIca(("N").toCharArray());
								setMaxDays(0);
								setMessage1("MTD TRANSACTION FILE IS EMPTY.                                                                      ".toCharArray());
								setMessage2("MTD TRANSACTION FILE MISSING DATE RECORD.                                                           ".toCharArray());
								setMessage3("MTD TRANSACTION FILE MISSING ACTIVITY FOR SOME DAYS IN THIS MONTH                                   ".toCharArray());
								setMsg002NoParmInType("*MSG002: NO PROCESSING PARM TO DETERMINE IF DAILY OR MONTHLY RPT.                                   ".toCharArray());
								setMcrInCnt(0L);
								setMcrSkippedCnt(0L);
								setMonthSub(0);
								setX360SrtAcqIssId01(fillSpace(1));
								setMceSw1(("N").toCharArray());
								setMceSw2(("N").toCharArray());
								setNetmceTot(0L);
    }


 

	/**
	 *	Returns the value of wsaProgramName
	 *	@return wsaProgramName
	 */
   public char[] getWsaProgramName() throws CFException{
   		return wsaProgramName;
   }

  
	/**
	*  set variable wsaProgramName
	*  Corresponding COBOL Variable is WSA-PROGRAM-NAME
	*  @param value
	**/
   public void setWsaProgramName(char[] value) {
       value = checkWsaProgramNameConstraints(value);
       arraycopy(value,0,wsaProgramName,0,value.length);
   } 
	public void setWsaProgramName(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wsaProgramName,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of wsaReleaseNbr
	 *	@return wsaReleaseNbr
	 */
   public char[] getWsaReleaseNbr() throws CFException{
   		return wsaReleaseNbr;
   }

  
	/**
	*  set variable wsaReleaseNbr
	*  Corresponding COBOL Variable is WSA-RELEASE-NBR
	*  @param value
	**/
   public void setWsaReleaseNbr(char[] value) {
       value = checkWsaReleaseNbrConstraints(value);
       arraycopy(value,0,wsaReleaseNbr,0,value.length);
   } 
	public void setWsaReleaseNbr(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wsaReleaseNbr,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of mciabendAbendCode
	 *	@return mciabendAbendCode
	 */
	public int getMciabendAbendCode() throws CFException {
   		return mciabendAbendCode;
	}
	
	/**
	 * 	Update MciabendAbendCode with the passed value
	 *  Corresponding COBOL Variable is MCIABEND-ABEND-CODE
	 *	@param number
	 */
	public void setMciabendAbendCode(int number) {
	     // Truncate if the number is beyond +/- Max range
	    mciabendAbendCode = checkMciabendAbendCodeMaxLimit(number); 
	}


	public void setMciabendAbendCode(long number) {
	    number = checkMciabendAbendCodeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMciabendAbendCode((int)number);
	}
	
	/**
	 *	Returns the value of blkLine
	 *	@return blkLine
	 */
   public char[] getBlkLine() throws CFException{
   		return blkLine;
   }

  
	/**
	*  set variable blkLine
	*  Corresponding COBOL Variable is BLK-LINE
	*  @param value
	**/
   public void setBlkLine(char[] value) {
       value = checkBlkLineConstraints(value);
       arraycopy(value,0,blkLine,0,value.length);
   } 
	public void setBlkLine(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,blkLine,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of productionTitle
	 *	@return productionTitle
	 */
   public char[] getProductionTitle() throws CFException{
   		return productionTitle;
   }

  
	/**
	*  set variable productionTitle
	*  Corresponding COBOL Variable is PRODUCTION-TITLE
	*  @param value
	**/
   public void setProductionTitle(char[] value) {
       value = checkProductionTitleConstraints(value);
       arraycopy(value,0,productionTitle,0,value.length);
   } 
	public void setProductionTitle(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,productionTitle,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of certificationTitle
	 *	@return certificationTitle
	 */
   public char[] getCertificationTitle() throws CFException{
   		return certificationTitle;
   }

  
	/**
	*  set variable certificationTitle
	*  Corresponding COBOL Variable is CERTIFICATION-TITLE
	*  @param value
	**/
   public void setCertificationTitle(char[] value) {
       value = checkCertificationTitleConstraints(value);
       arraycopy(value,0,certificationTitle,0,value.length);
   } 
	public void setCertificationTitle(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,certificationTitle,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of fastTrckTitle
	 *	@return fastTrckTitle
	 */
   public char[] getFastTrckTitle() throws CFException{
   		return fastTrckTitle;
   }

  
	/**
	*  set variable fastTrckTitle
	*  Corresponding COBOL Variable is FAST-TRCK-TITLE
	*  @param value
	**/
   public void setFastTrckTitle(char[] value) {
       value = checkFastTrckTitleConstraints(value);
       arraycopy(value,0,fastTrckTitle,0,value.length);
   } 
	public void setFastTrckTitle(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,fastTrckTitle,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of crEnvId
	 *	@return crEnvId
	 */
   public char[] getCrEnvId() throws CFException{
   		return crEnvId;
   }

  
	/**
	*  set variable crEnvId
	*  Corresponding COBOL Variable is CR-ENV-ID
	*  @param value
	**/
   public void setCrEnvId(char[] value) {
       value = checkCrEnvIdConstraints(value);
       arraycopy(value,0,crEnvId,0,value.length);
   } 
	public void setCrEnvId(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,crEnvId,0,beginIndex + endIndex);
   }
	char[] prParameterIdValue88Value1 = "        ".toCharArray();
char[] prParameterIdValue88Value2 = "SWCHPROD".toCharArray();

	/**
	 *	Test condition "        " "SWCHPROD" for isPrParameterIdValue()
	 *	@return  Returns true if isPrParameterIdValue() is "        " "SWCHPROD"
	 */
   public boolean isPrParameterIdValue() throws CFException {
      return (  compareChars( getCrEnvId() , prParameterIdValue88Value1)  == 0  ||  compareChars( getCrEnvId() , prParameterIdValue88Value2)  == 0  );
   }


	/**
	*  set values "        " "SWCHPROD"
	*/
   	public void setPrParameterIdValueTrue() {  			
    	setCrEnvId( prParameterIdValue88Value1);
   	}
	char[] crParameterIdValue88Value = "SWCHCERT".toCharArray();
	/**
	 *	Test condition "SWCHCERT" for isCrParameterIdValue()
	 *	@return  Returns true if isCrParameterIdValue() is "SWCHCERT"
	 */
   public boolean isCrParameterIdValue() throws CFException {
      return (  compareChars( getCrEnvId() , crParameterIdValue88Value)  == 0  );
   }


	/**
	*  set values "SWCHCERT"
	*/
   	public void setCrParameterIdValueTrue() {  			
    	setCrEnvId( crParameterIdValue88Value);
   	}
	char[] qaParameterIdValue88Value = "SWCHQUAL".toCharArray();
	/**
	 *	Test condition "SWCHQUAL" for isQaParameterIdValue()
	 *	@return  Returns true if isQaParameterIdValue() is "SWCHQUAL"
	 */
   public boolean isQaParameterIdValue() throws CFException {
      return (  compareChars( getCrEnvId() , qaParameterIdValue88Value)  == 0  );
   }


	/**
	*  set values "SWCHQUAL"
	*/
   	public void setQaParameterIdValueTrue() {  			
    	setCrEnvId( qaParameterIdValue88Value);
   	}
	char[] dvParameterIdValue88Value = "SWCHDEVL".toCharArray();
	/**
	 *	Test condition "SWCHDEVL" for isDvParameterIdValue()
	 *	@return  Returns true if isDvParameterIdValue() is "SWCHDEVL"
	 */
   public boolean isDvParameterIdValue() throws CFException {
      return (  compareChars( getCrEnvId() , dvParameterIdValue88Value)  == 0  );
   }


	/**
	*  set values "SWCHDEVL"
	*/
   	public void setDvParameterIdValueTrue() {  			
    	setCrEnvId( dvParameterIdValue88Value);
   	}
	char[] reParameterIdValue88Value = "SWCHREGR".toCharArray();
	/**
	 *	Test condition "SWCHREGR" for isReParameterIdValue()
	 *	@return  Returns true if isReParameterIdValue() is "SWCHREGR"
	 */
   public boolean isReParameterIdValue() throws CFException {
      return (  compareChars( getCrEnvId() , reParameterIdValue88Value)  == 0  );
   }


	/**
	*  set values "SWCHREGR"
	*/
   	public void setReParameterIdValueTrue() {  			
    	setCrEnvId( reParameterIdValue88Value);
   	}
	char[] ftParameterIdValue88Value = "SWCHFTF ".toCharArray();
	/**
	 *	Test condition "SWCHFTF " for isFtParameterIdValue()
	 *	@return  Returns true if isFtParameterIdValue() is "SWCHFTF "
	 */
   public boolean isFtParameterIdValue() throws CFException {
      return (  compareChars( getCrEnvId() , ftParameterIdValue88Value)  == 0  );
   }


	/**
	*  set values "SWCHFTF "
	*/
   	public void setFtParameterIdValueTrue() {  			
    	setCrEnvId( ftParameterIdValue88Value);
   	}
	char[] lcParameterIdValue88Value = "SWCHLOCL".toCharArray();
	/**
	 *	Test condition "SWCHLOCL" for isLcParameterIdValue()
	 *	@return  Returns true if isLcParameterIdValue() is "SWCHLOCL"
	 */
   public boolean isLcParameterIdValue() throws CFException {
      return (  compareChars( getCrEnvId() , lcParameterIdValue88Value)  == 0  );
   }


	/**
	*  set values "SWCHLOCL"
	*/
   	public void setLcParameterIdValueTrue() {  			
    	setCrEnvId( lcParameterIdValue88Value);
   	}
	/**
	 *	Returns the value of hdPage1Ln3b
	 *	@return hdPage1Ln3b
	 */
   public char[] getHdPage1Ln3b() throws CFException{
   		return hdPage1Ln3b;
   }

  
	/**
	*  set variable hdPage1Ln3b
	*  Corresponding COBOL Variable is HD-PAGE1-LN3B
	*  @param value
	**/
   public void setHdPage1Ln3b(char[] value) {
       value = checkHdPage1Ln3bConstraints(value);
       arraycopy(value,0,hdPage1Ln3b,0,value.length);
   } 
	public void setHdPage1Ln3b(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,hdPage1Ln3b,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of hdPage1Ln7
	 *	@return hdPage1Ln7
	 */
   public char[] getHdPage1Ln7() throws CFException{
   		return hdPage1Ln7;
   }

  
	/**
	*  set variable hdPage1Ln7
	*  Corresponding COBOL Variable is HD-PAGE1-LN7
	*  @param value
	**/
   public void setHdPage1Ln7(char[] value) {
       value = checkHdPage1Ln7Constraints(value);
       arraycopy(value,0,hdPage1Ln7,0,value.length);
   } 
	public void setHdPage1Ln7(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,hdPage1Ln7,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of hdPage1Ln8
	 *	@return hdPage1Ln8
	 */
   public char[] getHdPage1Ln8() throws CFException{
   		return hdPage1Ln8;
   }

  
	/**
	*  set variable hdPage1Ln8
	*  Corresponding COBOL Variable is HD-PAGE1-LN8
	*  @param value
	**/
   public void setHdPage1Ln8(char[] value) {
       value = checkHdPage1Ln8Constraints(value);
       arraycopy(value,0,hdPage1Ln8,0,value.length);
   } 
	public void setHdPage1Ln8(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,hdPage1Ln8,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of hdPage1Ln9
	 *	@return hdPage1Ln9
	 */
   public char[] getHdPage1Ln9() throws CFException{
   		return hdPage1Ln9;
   }

  
	/**
	*  set variable hdPage1Ln9
	*  Corresponding COBOL Variable is HD-PAGE1-LN9
	*  @param value
	**/
   public void setHdPage1Ln9(char[] value) {
       value = checkHdPage1Ln9Constraints(value);
       arraycopy(value,0,hdPage1Ln9,0,value.length);
   } 
	public void setHdPage1Ln9(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,hdPage1Ln9,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of dashPage1Ln
	 *	@return dashPage1Ln
	 */
   public char[] getDashPage1Ln() throws CFException{
   		return dashPage1Ln;
   }

  
	/**
	*  set variable dashPage1Ln
	*  Corresponding COBOL Variable is DASH-PAGE1-LN
	*  @param value
	**/
   public void setDashPage1Ln(char[] value) {
       value = checkDashPage1LnConstraints(value);
       arraycopy(value,0,dashPage1Ln,0,value.length);
   } 
	public void setDashPage1Ln(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,dashPage1Ln,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of hdPage2Ln1
	 *	@return hdPage2Ln1
	 */
   public char[] getHdPage2Ln1() throws CFException{
   		return hdPage2Ln1;
   }

  
	/**
	*  set variable hdPage2Ln1
	*  Corresponding COBOL Variable is HD-PAGE2-LN1
	*  @param value
	**/
   public void setHdPage2Ln1(char[] value) {
       value = checkHdPage2Ln1Constraints(value);
       arraycopy(value,0,hdPage2Ln1,0,value.length);
   } 
	public void setHdPage2Ln1(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,hdPage2Ln1,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of hdPage2Ln2
	 *	@return hdPage2Ln2
	 */
   public char[] getHdPage2Ln2() throws CFException{
   		return hdPage2Ln2;
   }

  
	/**
	*  set variable hdPage2Ln2
	*  Corresponding COBOL Variable is HD-PAGE2-LN2
	*  @param value
	**/
   public void setHdPage2Ln2(char[] value) {
       value = checkHdPage2Ln2Constraints(value);
       arraycopy(value,0,hdPage2Ln2,0,value.length);
   } 
	public void setHdPage2Ln2(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,hdPage2Ln2,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of hdPage2Ln3
	 *	@return hdPage2Ln3
	 */
   public char[] getHdPage2Ln3() throws CFException{
   		return hdPage2Ln3;
   }

  
	/**
	*  set variable hdPage2Ln3
	*  Corresponding COBOL Variable is HD-PAGE2-LN3
	*  @param value
	**/
   public void setHdPage2Ln3(char[] value) {
       value = checkHdPage2Ln3Constraints(value);
       arraycopy(value,0,hdPage2Ln3,0,value.length);
   } 
	public void setHdPage2Ln3(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,hdPage2Ln3,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of hdPage2Ln4
	 *	@return hdPage2Ln4
	 */
   public char[] getHdPage2Ln4() throws CFException{
   		return hdPage2Ln4;
   }

  
	/**
	*  set variable hdPage2Ln4
	*  Corresponding COBOL Variable is HD-PAGE2-LN4
	*  @param value
	**/
   public void setHdPage2Ln4(char[] value) {
       value = checkHdPage2Ln4Constraints(value);
       arraycopy(value,0,hdPage2Ln4,0,value.length);
   } 
	public void setHdPage2Ln4(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,hdPage2Ln4,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of hdPage2Ln5
	 *	@return hdPage2Ln5
	 */
   public char[] getHdPage2Ln5() throws CFException{
   		return hdPage2Ln5;
   }

  
	/**
	*  set variable hdPage2Ln5
	*  Corresponding COBOL Variable is HD-PAGE2-LN5
	*  @param value
	**/
   public void setHdPage2Ln5(char[] value) {
       value = checkHdPage2Ln5Constraints(value);
       arraycopy(value,0,hdPage2Ln5,0,value.length);
   } 
	public void setHdPage2Ln5(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,hdPage2Ln5,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of hdPage2Ln6
	 *	@return hdPage2Ln6
	 */
   public char[] getHdPage2Ln6() throws CFException{
   		return hdPage2Ln6;
   }

  
	/**
	*  set variable hdPage2Ln6
	*  Corresponding COBOL Variable is HD-PAGE2-LN6
	*  @param value
	**/
   public void setHdPage2Ln6(char[] value) {
       value = checkHdPage2Ln6Constraints(value);
       arraycopy(value,0,hdPage2Ln6,0,value.length);
   } 
	public void setHdPage2Ln6(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,hdPage2Ln6,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of hdPage3Ln1
	 *	@return hdPage3Ln1
	 */
   public char[] getHdPage3Ln1() throws CFException{
   		return hdPage3Ln1;
   }

  
	/**
	*  set variable hdPage3Ln1
	*  Corresponding COBOL Variable is HD-PAGE3-LN1
	*  @param value
	**/
   public void setHdPage3Ln1(char[] value) {
       value = checkHdPage3Ln1Constraints(value);
       arraycopy(value,0,hdPage3Ln1,0,value.length);
   } 
	public void setHdPage3Ln1(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,hdPage3Ln1,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of hdPage3Ln1a
	 *	@return hdPage3Ln1a
	 */
   public char[] getHdPage3Ln1a() throws CFException{
   		return hdPage3Ln1a;
   }

  
	/**
	*  set variable hdPage3Ln1a
	*  Corresponding COBOL Variable is HD-PAGE3-LN1A
	*  @param value
	**/
   public void setHdPage3Ln1a(char[] value) {
       value = checkHdPage3Ln1aConstraints(value);
       arraycopy(value,0,hdPage3Ln1a,0,value.length);
   } 
	public void setHdPage3Ln1a(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,hdPage3Ln1a,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of hdPage3Ln2
	 *	@return hdPage3Ln2
	 */
   public char[] getHdPage3Ln2() throws CFException{
   		return hdPage3Ln2;
   }

  
	/**
	*  set variable hdPage3Ln2
	*  Corresponding COBOL Variable is HD-PAGE3-LN2
	*  @param value
	**/
   public void setHdPage3Ln2(char[] value) {
       value = checkHdPage3Ln2Constraints(value);
       arraycopy(value,0,hdPage3Ln2,0,value.length);
   } 
	public void setHdPage3Ln2(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,hdPage3Ln2,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of hdPage3Ln6
	 *	@return hdPage3Ln6
	 */
   public char[] getHdPage3Ln6() throws CFException{
   		return hdPage3Ln6;
   }

  
	/**
	*  set variable hdPage3Ln6
	*  Corresponding COBOL Variable is HD-PAGE3-LN6
	*  @param value
	**/
   public void setHdPage3Ln6(char[] value) {
       value = checkHdPage3Ln6Constraints(value);
       arraycopy(value,0,hdPage3Ln6,0,value.length);
   } 
	public void setHdPage3Ln6(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,hdPage3Ln6,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of hdPage3Ln7
	 *	@return hdPage3Ln7
	 */
   public char[] getHdPage3Ln7() throws CFException{
   		return hdPage3Ln7;
   }

  
	/**
	*  set variable hdPage3Ln7
	*  Corresponding COBOL Variable is HD-PAGE3-LN7
	*  @param value
	**/
   public void setHdPage3Ln7(char[] value) {
       value = checkHdPage3Ln7Constraints(value);
       arraycopy(value,0,hdPage3Ln7,0,value.length);
   } 
	public void setHdPage3Ln7(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,hdPage3Ln7,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of hdPage3Ln8
	 *	@return hdPage3Ln8
	 */
   public char[] getHdPage3Ln8() throws CFException{
   		return hdPage3Ln8;
   }

  
	/**
	*  set variable hdPage3Ln8
	*  Corresponding COBOL Variable is HD-PAGE3-LN8
	*  @param value
	**/
   public void setHdPage3Ln8(char[] value) {
       value = checkHdPage3Ln8Constraints(value);
       arraycopy(value,0,hdPage3Ln8,0,value.length);
   } 
	public void setHdPage3Ln8(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,hdPage3Ln8,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of hdPage3Ln9
	 *	@return hdPage3Ln9
	 */
   public char[] getHdPage3Ln9() throws CFException{
   		return hdPage3Ln9;
   }

  
	/**
	*  set variable hdPage3Ln9
	*  Corresponding COBOL Variable is HD-PAGE3-LN9
	*  @param value
	**/
   public void setHdPage3Ln9(char[] value) {
       value = checkHdPage3Ln9Constraints(value);
       arraycopy(value,0,hdPage3Ln9,0,value.length);
   } 
	public void setHdPage3Ln9(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,hdPage3Ln9,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of hdPage3Ln10
	 *	@return hdPage3Ln10
	 */
   public char[] getHdPage3Ln10() throws CFException{
   		return hdPage3Ln10;
   }

  
	/**
	*  set variable hdPage3Ln10
	*  Corresponding COBOL Variable is HD-PAGE3-LN10
	*  @param value
	**/
   public void setHdPage3Ln10(char[] value) {
       value = checkHdPage3Ln10Constraints(value);
       arraycopy(value,0,hdPage3Ln10,0,value.length);
   } 
	public void setHdPage3Ln10(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,hdPage3Ln10,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of hdPage3Ln11
	 *	@return hdPage3Ln11
	 */
   public char[] getHdPage3Ln11() throws CFException{
   		return hdPage3Ln11;
   }

  
	/**
	*  set variable hdPage3Ln11
	*  Corresponding COBOL Variable is HD-PAGE3-LN11
	*  @param value
	**/
   public void setHdPage3Ln11(char[] value) {
       value = checkHdPage3Ln11Constraints(value);
       arraycopy(value,0,hdPage3Ln11,0,value.length);
   } 
	public void setHdPage3Ln11(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,hdPage3Ln11,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of dt311SamacqNetAmt
	 *	@return dt311SamacqNetAmt
	 */
   public char[] getDt311SamacqNetAmt() throws CFException{
   		return dt311SamacqNetAmt;
   }

  
	/**
	*  set variable dt311SamacqNetAmt
	*  Corresponding COBOL Variable is DT3-11-SAMACQ-NET-AMT
	*  @param value
	**/
   public void setDt311SamacqNetAmt(char[] value) {
       value = checkDt311SamacqNetAmtConstraints(value);
       arraycopy(value,0,dt311SamacqNetAmt,0,value.length);
   } 
	public void setDt311SamacqNetAmt(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,dt311SamacqNetAmt,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of dt311SamacqInd
	 *	@return dt311SamacqInd
	 */
   public char[] getDt311SamacqInd() throws CFException{
   		return dt311SamacqInd;
   }

  
	/**
	*  set variable dt311SamacqInd
	*  Corresponding COBOL Variable is DT3-11-SAMACQ-IND
	*  @param value
	**/
   public void setDt311SamacqInd(char[] value) {
       value = checkDt311SamacqIndConstraints(value);
       arraycopy(value,0,dt311SamacqInd,0,value.length);
   } 
	public void setDt311SamacqInd(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,dt311SamacqInd,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of dt311SamacqFeeAmt
	 *	@return dt311SamacqFeeAmt
	 */
   public char[] getDt311SamacqFeeAmt() throws CFException{
   		return dt311SamacqFeeAmt;
   }

  
	/**
	*  set variable dt311SamacqFeeAmt
	*  Corresponding COBOL Variable is DT3-11-SAMACQ-FEE-AMT
	*  @param value
	**/
   public void setDt311SamacqFeeAmt(char[] value) {
       value = checkDt311SamacqFeeAmtConstraints(value);
       arraycopy(value,0,dt311SamacqFeeAmt,0,value.length);
   } 
	public void setDt311SamacqFeeAmt(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,dt311SamacqFeeAmt,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of dt311SamacqFeeInd
	 *	@return dt311SamacqFeeInd
	 */
   public char[] getDt311SamacqFeeInd() throws CFException{
   		return dt311SamacqFeeInd;
   }

  
	/**
	*  set variable dt311SamacqFeeInd
	*  Corresponding COBOL Variable is DT3-11-SAMACQ-FEE-IND
	*  @param value
	**/
   public void setDt311SamacqFeeInd(char[] value) {
       value = checkDt311SamacqFeeIndConstraints(value);
       arraycopy(value,0,dt311SamacqFeeInd,0,value.length);
   } 
	public void setDt311SamacqFeeInd(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,dt311SamacqFeeInd,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of dt311SamissNetAmt
	 *	@return dt311SamissNetAmt
	 */
   public char[] getDt311SamissNetAmt() throws CFException{
   		return dt311SamissNetAmt;
   }

  
	/**
	*  set variable dt311SamissNetAmt
	*  Corresponding COBOL Variable is DT3-11-SAMISS-NET-AMT
	*  @param value
	**/
   public void setDt311SamissNetAmt(char[] value) {
       value = checkDt311SamissNetAmtConstraints(value);
       arraycopy(value,0,dt311SamissNetAmt,0,value.length);
   } 
	public void setDt311SamissNetAmt(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,dt311SamissNetAmt,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of dt311SamissInd
	 *	@return dt311SamissInd
	 */
   public char[] getDt311SamissInd() throws CFException{
   		return dt311SamissInd;
   }

  
	/**
	*  set variable dt311SamissInd
	*  Corresponding COBOL Variable is DT3-11-SAMISS-IND
	*  @param value
	**/
   public void setDt311SamissInd(char[] value) {
       value = checkDt311SamissIndConstraints(value);
       arraycopy(value,0,dt311SamissInd,0,value.length);
   } 
	public void setDt311SamissInd(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,dt311SamissInd,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of dt311SamissFeeAmt
	 *	@return dt311SamissFeeAmt
	 */
   public char[] getDt311SamissFeeAmt() throws CFException{
   		return dt311SamissFeeAmt;
   }

  
	/**
	*  set variable dt311SamissFeeAmt
	*  Corresponding COBOL Variable is DT3-11-SAMISS-FEE-AMT
	*  @param value
	**/
   public void setDt311SamissFeeAmt(char[] value) {
       value = checkDt311SamissFeeAmtConstraints(value);
       arraycopy(value,0,dt311SamissFeeAmt,0,value.length);
   } 
	public void setDt311SamissFeeAmt(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,dt311SamissFeeAmt,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of dt311SamissFeeInd
	 *	@return dt311SamissFeeInd
	 */
   public char[] getDt311SamissFeeInd() throws CFException{
   		return dt311SamissFeeInd;
   }

  
	/**
	*  set variable dt311SamissFeeInd
	*  Corresponding COBOL Variable is DT3-11-SAMISS-FEE-IND
	*  @param value
	**/
   public void setDt311SamissFeeInd(char[] value) {
       value = checkDt311SamissFeeIndConstraints(value);
       arraycopy(value,0,dt311SamissFeeInd,0,value.length);
   } 
	public void setDt311SamissFeeInd(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,dt311SamissFeeInd,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of p2AcqPrint
	 *	@return p2AcqPrint
	 */
   public char[] getP2AcqPrint() throws CFException{
   		return p2AcqPrint;
   }

  
	/**
	*  set variable p2AcqPrint
	*  Corresponding COBOL Variable is P2-ACQ-PRINT
	*  @param value
	**/
   public void setP2AcqPrint(char[] value) {
       value = checkP2AcqPrintConstraints(value);
       arraycopy(value,0,p2AcqPrint,0,value.length);
   } 
	public void setP2AcqPrint(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,p2AcqPrint,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of p2IssPrint
	 *	@return p2IssPrint
	 */
   public char[] getP2IssPrint() throws CFException{
   		return p2IssPrint;
   }

  
	/**
	*  set variable p2IssPrint
	*  Corresponding COBOL Variable is P2-ISS-PRINT
	*  @param value
	**/
   public void setP2IssPrint(char[] value) {
       value = checkP2IssPrintConstraints(value);
       arraycopy(value,0,p2IssPrint,0,value.length);
   } 
	public void setP2IssPrint(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,p2IssPrint,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of swRptqEof
	 *	@return swRptqEof
	 */
   public char[] getSwRptqEof() throws CFException{
   		return swRptqEof;
   }

  
	/**
	*  set variable swRptqEof
	*  Corresponding COBOL Variable is SW-RPTQ-EOF
	*  @param value
	**/
   public void setSwRptqEof(char[] value) {
       value = checkSwRptqEofConstraints(value);
       arraycopy(value,0,swRptqEof,0,value.length);
   } 
	public void setSwRptqEof(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,swRptqEof,0,beginIndex + endIndex);
   }
	char[] swRptqEofValue88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isSwRptqEofValue()
	 *	@return  Returns true if isSwRptqEofValue() is "Y"
	 */
   public boolean isSwRptqEofValue() throws CFException {
      return (  compareChars( getSwRptqEof() , swRptqEofValue88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setSwRptqEofValueTrue() {  			
    	setSwRptqEof( swRptqEofValue88Value);
   	}
	/**
	 *	Returns the value of swCurrEof
	 *	@return swCurrEof
	 */
   public char[] getSwCurrEof() throws CFException{
   		return swCurrEof;
   }

  
	/**
	*  set variable swCurrEof
	*  Corresponding COBOL Variable is SW-CURR-EOF
	*  @param value
	**/
   public void setSwCurrEof(char[] value) {
       value = checkSwCurrEofConstraints(value);
       arraycopy(value,0,swCurrEof,0,value.length);
   } 
	public void setSwCurrEof(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,swCurrEof,0,beginIndex + endIndex);
   }
	char[] swCurrEofValue88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isSwCurrEofValue()
	 *	@return  Returns true if isSwCurrEofValue() is "Y"
	 */
   public boolean isSwCurrEofValue() throws CFException {
      return (  compareChars( getSwCurrEof() , swCurrEofValue88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setSwCurrEofValueTrue() {  			
    	setSwCurrEof( swCurrEofValue88Value);
   	}
	/**
	 *	Returns the value of swApcEof
	 *	@return swApcEof
	 */
   public char[] getSwApcEof() throws CFException{
   		return swApcEof;
   }

  
	/**
	*  set variable swApcEof
	*  Corresponding COBOL Variable is SW-APC-EOF
	*  @param value
	**/
   public void setSwApcEof(char[] value) {
       value = checkSwApcEofConstraints(value);
       arraycopy(value,0,swApcEof,0,value.length);
   } 
	public void setSwApcEof(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,swApcEof,0,beginIndex + endIndex);
   }
	char[] swApcEofValue88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isSwApcEofValue()
	 *	@return  Returns true if isSwApcEofValue() is "Y"
	 */
   public boolean isSwApcEofValue() throws CFException {
      return (  compareChars( getSwApcEof() , swApcEofValue88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setSwApcEofValueTrue() {  			
    	setSwApcEof( swApcEofValue88Value);
   	}
	/**
	 *	Returns the value of erlyFlagSw
	 *	@return erlyFlagSw
	 */
   public char[] getErlyFlagSw() throws CFException{
   		return erlyFlagSw;
   }

  
	/**
	*  set variable erlyFlagSw
	*  Corresponding COBOL Variable is WS-ERLY-FLAG-SW
	*  @param value
	**/
   public void setErlyFlagSw(char[] value) {
       value = checkErlyFlagSwConstraints(value);
       arraycopy(value,0,erlyFlagSw,0,value.length);
   } 
	public void setErlyFlagSw(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,erlyFlagSw,0,beginIndex + endIndex);
   }
	char[] erlyFlag88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isErlyFlag()
	 *	@return  Returns true if isErlyFlag() is "Y"
	 */
   public boolean isErlyFlag() throws CFException {
      return (  compareChars( getErlyFlagSw() , erlyFlag88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setErlyFlagTrue() {  			
    	setErlyFlagSw( erlyFlag88Value);
   	}
	/**
	 *	Returns the value of page2AcqFinDbCnt
	 *	@return page2AcqFinDbCnt
	 */
	public int getPage2AcqFinDbCnt() throws CFException {
       if (isPage2AcqFinDbCntModified()) { 
           page2AcqFinDbCnt = refreshPage2AcqFinDbCnt();
        }
   		return page2AcqFinDbCnt;
	}
	

    /**
	 *	Returns the String value of page2AcqFinDbCnt
	 *	@return page2AcqFinDbCnt
	 */
	public char[]  getPage2AcqFinDbCntActualString() {
	    String value = String.valueOf(page2AcqFinDbCnt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2AcqFinDbCnt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ACQ-FIN-DB-CNT
	 *	@param number
	 */
	public void setPage2AcqFinDbCnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2AcqFinDbCnt = checkPage2AcqFinDbCntMaxLimit(number); 
		serializePage2AcqFinDbCnt(page2AcqFinDbCnt);
	}
	

	public void setPage2AcqFinDbCnt(long number) {
	    number = checkPage2AcqFinDbCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPage2AcqFinDbCnt((int)number);
	}
	
	/**
	 * 	Update Page2AcqFinDbCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2AcqFinDbCnt(char[] value) throws CFException {
		 page2AcqFinDbCnt = serializePage2AcqFinDbCnt(value);
	}
	/**
	 * 	Update Page2AcqFinDbCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2AcqFinDbCntString(char[] value) throws CFException {
		 setPage2AcqFinDbCnt(value);
	}
	/**
	 *	Returns the value of page2AcqFinDbAmt
	 *	@return page2AcqFinDbAmt
	 */
	public long getPage2AcqFinDbAmt() throws CFException {
       if (isPage2AcqFinDbAmtModified()) { 
           page2AcqFinDbAmt = refreshPage2AcqFinDbAmt();
        }
   		return page2AcqFinDbAmt;
	}
	

    /**
	 *	Returns the String value of page2AcqFinDbAmt
	 *	@return page2AcqFinDbAmt
	 */
	public char[]  getPage2AcqFinDbAmtActualString() {
	    String value = String.valueOf(page2AcqFinDbAmt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2AcqFinDbAmt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ACQ-FIN-DB-AMT
	 *	@param number
	 */
	public void setPage2AcqFinDbAmt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2AcqFinDbAmt = checkPage2AcqFinDbAmtMaxLimit(number); 
		serializePage2AcqFinDbAmt(page2AcqFinDbAmt);
	}
	

	/**
	 * 	Update Page2AcqFinDbAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2AcqFinDbAmt(char[] value) throws CFException {
		 page2AcqFinDbAmt = serializePage2AcqFinDbAmt(value);
	}
	/**
	 * 	Update Page2AcqFinDbAmt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2AcqFinDbAmtString(char[] value) throws CFException {
		 setPage2AcqFinDbAmt(value);
	}
	/**
	 *	Returns the value of page2AcqTmpCrCnt
	 *	@return page2AcqTmpCrCnt
	 */
	public int getPage2AcqTmpCrCnt() throws CFException {
       if (isPage2AcqTmpCrCntModified()) { 
           page2AcqTmpCrCnt = refreshPage2AcqTmpCrCnt();
        }
   		return page2AcqTmpCrCnt;
	}
	

    /**
	 *	Returns the String value of page2AcqTmpCrCnt
	 *	@return page2AcqTmpCrCnt
	 */
	public char[]  getPage2AcqTmpCrCntActualString() {
	    String value = String.valueOf(page2AcqTmpCrCnt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2AcqTmpCrCnt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ACQ-TMP-CR-CNT
	 *	@param number
	 */
	public void setPage2AcqTmpCrCnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2AcqTmpCrCnt = checkPage2AcqTmpCrCntMaxLimit(number); 
		serializePage2AcqTmpCrCnt(page2AcqTmpCrCnt);
	}
	

	public void setPage2AcqTmpCrCnt(long number) {
	    number = checkPage2AcqTmpCrCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPage2AcqTmpCrCnt((int)number);
	}
	
	/**
	 * 	Update Page2AcqTmpCrCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2AcqTmpCrCnt(char[] value) throws CFException {
		 page2AcqTmpCrCnt = serializePage2AcqTmpCrCnt(value);
	}
	/**
	 * 	Update Page2AcqTmpCrCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2AcqTmpCrCntString(char[] value) throws CFException {
		 setPage2AcqTmpCrCnt(value);
	}
	/**
	 *	Returns the value of page2AcqTmpDbCnt
	 *	@return page2AcqTmpDbCnt
	 */
	public int getPage2AcqTmpDbCnt() throws CFException {
       if (isPage2AcqTmpDbCntModified()) { 
           page2AcqTmpDbCnt = refreshPage2AcqTmpDbCnt();
        }
   		return page2AcqTmpDbCnt;
	}
	

    /**
	 *	Returns the String value of page2AcqTmpDbCnt
	 *	@return page2AcqTmpDbCnt
	 */
	public char[]  getPage2AcqTmpDbCntActualString() {
	    String value = String.valueOf(page2AcqTmpDbCnt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2AcqTmpDbCnt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ACQ-TMP-DB-CNT
	 *	@param number
	 */
	public void setPage2AcqTmpDbCnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2AcqTmpDbCnt = checkPage2AcqTmpDbCntMaxLimit(number); 
		serializePage2AcqTmpDbCnt(page2AcqTmpDbCnt);
	}
	

	public void setPage2AcqTmpDbCnt(long number) {
	    number = checkPage2AcqTmpDbCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPage2AcqTmpDbCnt((int)number);
	}
	
	/**
	 * 	Update Page2AcqTmpDbCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2AcqTmpDbCnt(char[] value) throws CFException {
		 page2AcqTmpDbCnt = serializePage2AcqTmpDbCnt(value);
	}
	/**
	 * 	Update Page2AcqTmpDbCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2AcqTmpDbCntString(char[] value) throws CFException {
		 setPage2AcqTmpDbCnt(value);
	}
	/**
	 *	Returns the value of page2AcqFinCrCnt
	 *	@return page2AcqFinCrCnt
	 */
	public int getPage2AcqFinCrCnt() throws CFException {
       if (isPage2AcqFinCrCntModified()) { 
           page2AcqFinCrCnt = refreshPage2AcqFinCrCnt();
        }
   		return page2AcqFinCrCnt;
	}
	

    /**
	 *	Returns the String value of page2AcqFinCrCnt
	 *	@return page2AcqFinCrCnt
	 */
	public char[]  getPage2AcqFinCrCntActualString() {
	    String value = String.valueOf(page2AcqFinCrCnt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2AcqFinCrCnt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ACQ-FIN-CR-CNT
	 *	@param number
	 */
	public void setPage2AcqFinCrCnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2AcqFinCrCnt = checkPage2AcqFinCrCntMaxLimit(number); 
		serializePage2AcqFinCrCnt(page2AcqFinCrCnt);
	}
	

	public void setPage2AcqFinCrCnt(long number) {
	    number = checkPage2AcqFinCrCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPage2AcqFinCrCnt((int)number);
	}
	
	/**
	 * 	Update Page2AcqFinCrCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2AcqFinCrCnt(char[] value) throws CFException {
		 page2AcqFinCrCnt = serializePage2AcqFinCrCnt(value);
	}
	/**
	 * 	Update Page2AcqFinCrCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2AcqFinCrCntString(char[] value) throws CFException {
		 setPage2AcqFinCrCnt(value);
	}
	/**
	 *	Returns the value of page2AcqFinCrAmt
	 *	@return page2AcqFinCrAmt
	 */
	public long getPage2AcqFinCrAmt() throws CFException {
       if (isPage2AcqFinCrAmtModified()) { 
           page2AcqFinCrAmt = refreshPage2AcqFinCrAmt();
        }
   		return page2AcqFinCrAmt;
	}
	

    /**
	 *	Returns the String value of page2AcqFinCrAmt
	 *	@return page2AcqFinCrAmt
	 */
	public char[]  getPage2AcqFinCrAmtActualString() {
	    String value = String.valueOf(page2AcqFinCrAmt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2AcqFinCrAmt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ACQ-FIN-CR-AMT
	 *	@param number
	 */
	public void setPage2AcqFinCrAmt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2AcqFinCrAmt = checkPage2AcqFinCrAmtMaxLimit(number); 
		serializePage2AcqFinCrAmt(page2AcqFinCrAmt);
	}
	

	/**
	 * 	Update Page2AcqFinCrAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2AcqFinCrAmt(char[] value) throws CFException {
		 page2AcqFinCrAmt = serializePage2AcqFinCrAmt(value);
	}
	/**
	 * 	Update Page2AcqFinCrAmt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2AcqFinCrAmtString(char[] value) throws CFException {
		 setPage2AcqFinCrAmt(value);
	}
	/**
	 *	Returns the value of page2AcqAdjDbCnt
	 *	@return page2AcqAdjDbCnt
	 */
	public int getPage2AcqAdjDbCnt() throws CFException {
       if (isPage2AcqAdjDbCntModified()) { 
           page2AcqAdjDbCnt = refreshPage2AcqAdjDbCnt();
        }
   		return page2AcqAdjDbCnt;
	}
	

    /**
	 *	Returns the String value of page2AcqAdjDbCnt
	 *	@return page2AcqAdjDbCnt
	 */
	public char[]  getPage2AcqAdjDbCntActualString() {
	    String value = String.valueOf(page2AcqAdjDbCnt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2AcqAdjDbCnt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ACQ-ADJ-DB-CNT
	 *	@param number
	 */
	public void setPage2AcqAdjDbCnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2AcqAdjDbCnt = checkPage2AcqAdjDbCntMaxLimit(number); 
		serializePage2AcqAdjDbCnt(page2AcqAdjDbCnt);
	}
	

	public void setPage2AcqAdjDbCnt(long number) {
	    number = checkPage2AcqAdjDbCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPage2AcqAdjDbCnt((int)number);
	}
	
	/**
	 * 	Update Page2AcqAdjDbCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2AcqAdjDbCnt(char[] value) throws CFException {
		 page2AcqAdjDbCnt = serializePage2AcqAdjDbCnt(value);
	}
	/**
	 * 	Update Page2AcqAdjDbCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2AcqAdjDbCntString(char[] value) throws CFException {
		 setPage2AcqAdjDbCnt(value);
	}
	/**
	 *	Returns the value of page2AcqAdjDbAmt
	 *	@return page2AcqAdjDbAmt
	 */
	public long getPage2AcqAdjDbAmt() throws CFException {
       if (isPage2AcqAdjDbAmtModified()) { 
           page2AcqAdjDbAmt = refreshPage2AcqAdjDbAmt();
        }
   		return page2AcqAdjDbAmt;
	}
	

    /**
	 *	Returns the String value of page2AcqAdjDbAmt
	 *	@return page2AcqAdjDbAmt
	 */
	public char[]  getPage2AcqAdjDbAmtActualString() {
	    String value = String.valueOf(page2AcqAdjDbAmt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2AcqAdjDbAmt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ACQ-ADJ-DB-AMT
	 *	@param number
	 */
	public void setPage2AcqAdjDbAmt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2AcqAdjDbAmt = checkPage2AcqAdjDbAmtMaxLimit(number); 
		serializePage2AcqAdjDbAmt(page2AcqAdjDbAmt);
	}
	

	/**
	 * 	Update Page2AcqAdjDbAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2AcqAdjDbAmt(char[] value) throws CFException {
		 page2AcqAdjDbAmt = serializePage2AcqAdjDbAmt(value);
	}
	/**
	 * 	Update Page2AcqAdjDbAmt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2AcqAdjDbAmtString(char[] value) throws CFException {
		 setPage2AcqAdjDbAmt(value);
	}
	/**
	 *	Returns the value of page2AcqAdjCrCnt
	 *	@return page2AcqAdjCrCnt
	 */
	public int getPage2AcqAdjCrCnt() throws CFException {
       if (isPage2AcqAdjCrCntModified()) { 
           page2AcqAdjCrCnt = refreshPage2AcqAdjCrCnt();
        }
   		return page2AcqAdjCrCnt;
	}
	

    /**
	 *	Returns the String value of page2AcqAdjCrCnt
	 *	@return page2AcqAdjCrCnt
	 */
	public char[]  getPage2AcqAdjCrCntActualString() {
	    String value = String.valueOf(page2AcqAdjCrCnt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2AcqAdjCrCnt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ACQ-ADJ-CR-CNT
	 *	@param number
	 */
	public void setPage2AcqAdjCrCnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2AcqAdjCrCnt = checkPage2AcqAdjCrCntMaxLimit(number); 
		serializePage2AcqAdjCrCnt(page2AcqAdjCrCnt);
	}
	

	public void setPage2AcqAdjCrCnt(long number) {
	    number = checkPage2AcqAdjCrCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPage2AcqAdjCrCnt((int)number);
	}
	
	/**
	 * 	Update Page2AcqAdjCrCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2AcqAdjCrCnt(char[] value) throws CFException {
		 page2AcqAdjCrCnt = serializePage2AcqAdjCrCnt(value);
	}
	/**
	 * 	Update Page2AcqAdjCrCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2AcqAdjCrCntString(char[] value) throws CFException {
		 setPage2AcqAdjCrCnt(value);
	}
	/**
	 *	Returns the value of page2AcqAdjCrAmt
	 *	@return page2AcqAdjCrAmt
	 */
	public long getPage2AcqAdjCrAmt() throws CFException {
       if (isPage2AcqAdjCrAmtModified()) { 
           page2AcqAdjCrAmt = refreshPage2AcqAdjCrAmt();
        }
   		return page2AcqAdjCrAmt;
	}
	

    /**
	 *	Returns the String value of page2AcqAdjCrAmt
	 *	@return page2AcqAdjCrAmt
	 */
	public char[]  getPage2AcqAdjCrAmtActualString() {
	    String value = String.valueOf(page2AcqAdjCrAmt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2AcqAdjCrAmt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ACQ-ADJ-CR-AMT
	 *	@param number
	 */
	public void setPage2AcqAdjCrAmt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2AcqAdjCrAmt = checkPage2AcqAdjCrAmtMaxLimit(number); 
		serializePage2AcqAdjCrAmt(page2AcqAdjCrAmt);
	}
	

	/**
	 * 	Update Page2AcqAdjCrAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2AcqAdjCrAmt(char[] value) throws CFException {
		 page2AcqAdjCrAmt = serializePage2AcqAdjCrAmt(value);
	}
	/**
	 * 	Update Page2AcqAdjCrAmt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2AcqAdjCrAmtString(char[] value) throws CFException {
		 setPage2AcqAdjCrAmt(value);
	}
	/**
	 *	Returns the value of page2AcqAdj09DbCnt
	 *	@return page2AcqAdj09DbCnt
	 */
	public int getPage2AcqAdj09DbCnt() throws CFException {
       if (isPage2AcqAdj09DbCntModified()) { 
           page2AcqAdj09DbCnt = refreshPage2AcqAdj09DbCnt();
        }
   		return page2AcqAdj09DbCnt;
	}
	

    /**
	 *	Returns the String value of page2AcqAdj09DbCnt
	 *	@return page2AcqAdj09DbCnt
	 */
	public char[]  getPage2AcqAdj09DbCntActualString() {
	    String value = String.valueOf(page2AcqAdj09DbCnt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2AcqAdj09DbCnt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ACQ-ADJ09-DB-CNT
	 *	@param number
	 */
	public void setPage2AcqAdj09DbCnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2AcqAdj09DbCnt = checkPage2AcqAdj09DbCntMaxLimit(number); 
		serializePage2AcqAdj09DbCnt(page2AcqAdj09DbCnt);
	}
	

	public void setPage2AcqAdj09DbCnt(long number) {
	    number = checkPage2AcqAdj09DbCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPage2AcqAdj09DbCnt((int)number);
	}
	
	/**
	 * 	Update Page2AcqAdj09DbCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2AcqAdj09DbCnt(char[] value) throws CFException {
		 page2AcqAdj09DbCnt = serializePage2AcqAdj09DbCnt(value);
	}
	/**
	 * 	Update Page2AcqAdj09DbCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2AcqAdj09DbCntString(char[] value) throws CFException {
		 setPage2AcqAdj09DbCnt(value);
	}
	/**
	 *	Returns the value of page2AcqAdj09DbAmt
	 *	@return page2AcqAdj09DbAmt
	 */
	public long getPage2AcqAdj09DbAmt() throws CFException {
       if (isPage2AcqAdj09DbAmtModified()) { 
           page2AcqAdj09DbAmt = refreshPage2AcqAdj09DbAmt();
        }
   		return page2AcqAdj09DbAmt;
	}
	

    /**
	 *	Returns the String value of page2AcqAdj09DbAmt
	 *	@return page2AcqAdj09DbAmt
	 */
	public char[]  getPage2AcqAdj09DbAmtActualString() {
	    String value = String.valueOf(page2AcqAdj09DbAmt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2AcqAdj09DbAmt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ACQ-ADJ09-DB-AMT
	 *	@param number
	 */
	public void setPage2AcqAdj09DbAmt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2AcqAdj09DbAmt = checkPage2AcqAdj09DbAmtMaxLimit(number); 
		serializePage2AcqAdj09DbAmt(page2AcqAdj09DbAmt);
	}
	

	/**
	 * 	Update Page2AcqAdj09DbAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2AcqAdj09DbAmt(char[] value) throws CFException {
		 page2AcqAdj09DbAmt = serializePage2AcqAdj09DbAmt(value);
	}
	/**
	 * 	Update Page2AcqAdj09DbAmt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2AcqAdj09DbAmtString(char[] value) throws CFException {
		 setPage2AcqAdj09DbAmt(value);
	}
	/**
	 *	Returns the value of page2AcqAdj09CrCnt
	 *	@return page2AcqAdj09CrCnt
	 */
	public int getPage2AcqAdj09CrCnt() throws CFException {
       if (isPage2AcqAdj09CrCntModified()) { 
           page2AcqAdj09CrCnt = refreshPage2AcqAdj09CrCnt();
        }
   		return page2AcqAdj09CrCnt;
	}
	

    /**
	 *	Returns the String value of page2AcqAdj09CrCnt
	 *	@return page2AcqAdj09CrCnt
	 */
	public char[]  getPage2AcqAdj09CrCntActualString() {
	    String value = String.valueOf(page2AcqAdj09CrCnt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2AcqAdj09CrCnt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ACQ-ADJ09-CR-CNT
	 *	@param number
	 */
	public void setPage2AcqAdj09CrCnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2AcqAdj09CrCnt = checkPage2AcqAdj09CrCntMaxLimit(number); 
		serializePage2AcqAdj09CrCnt(page2AcqAdj09CrCnt);
	}
	

	public void setPage2AcqAdj09CrCnt(long number) {
	    number = checkPage2AcqAdj09CrCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPage2AcqAdj09CrCnt((int)number);
	}
	
	/**
	 * 	Update Page2AcqAdj09CrCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2AcqAdj09CrCnt(char[] value) throws CFException {
		 page2AcqAdj09CrCnt = serializePage2AcqAdj09CrCnt(value);
	}
	/**
	 * 	Update Page2AcqAdj09CrCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2AcqAdj09CrCntString(char[] value) throws CFException {
		 setPage2AcqAdj09CrCnt(value);
	}
	/**
	 *	Returns the value of page2AcqAdj09CrAmt
	 *	@return page2AcqAdj09CrAmt
	 */
	public long getPage2AcqAdj09CrAmt() throws CFException {
       if (isPage2AcqAdj09CrAmtModified()) { 
           page2AcqAdj09CrAmt = refreshPage2AcqAdj09CrAmt();
        }
   		return page2AcqAdj09CrAmt;
	}
	

    /**
	 *	Returns the String value of page2AcqAdj09CrAmt
	 *	@return page2AcqAdj09CrAmt
	 */
	public char[]  getPage2AcqAdj09CrAmtActualString() {
	    String value = String.valueOf(page2AcqAdj09CrAmt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2AcqAdj09CrAmt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ACQ-ADJ09-CR-AMT
	 *	@param number
	 */
	public void setPage2AcqAdj09CrAmt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2AcqAdj09CrAmt = checkPage2AcqAdj09CrAmtMaxLimit(number); 
		serializePage2AcqAdj09CrAmt(page2AcqAdj09CrAmt);
	}
	

	/**
	 * 	Update Page2AcqAdj09CrAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2AcqAdj09CrAmt(char[] value) throws CFException {
		 page2AcqAdj09CrAmt = serializePage2AcqAdj09CrAmt(value);
	}
	/**
	 * 	Update Page2AcqAdj09CrAmt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2AcqAdj09CrAmtString(char[] value) throws CFException {
		 setPage2AcqAdj09CrAmt(value);
	}
	/**
	 *	Returns the value of page2AcqA15ApdDbCnt
	 *	@return page2AcqA15ApdDbCnt
	 */
	public int getPage2AcqA15ApdDbCnt() throws CFException {
       if (isPage2AcqA15ApdDbCntModified()) { 
           page2AcqA15ApdDbCnt = refreshPage2AcqA15ApdDbCnt();
        }
   		return page2AcqA15ApdDbCnt;
	}
	

    /**
	 *	Returns the String value of page2AcqA15ApdDbCnt
	 *	@return page2AcqA15ApdDbCnt
	 */
	public char[]  getPage2AcqA15ApdDbCntActualString() {
	    String value = String.valueOf(page2AcqA15ApdDbCnt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2AcqA15ApdDbCnt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ACQ-A15-APD-DB-CNT
	 *	@param number
	 */
	public void setPage2AcqA15ApdDbCnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2AcqA15ApdDbCnt = checkPage2AcqA15ApdDbCntMaxLimit(number); 
		serializePage2AcqA15ApdDbCnt(page2AcqA15ApdDbCnt);
	}
	

	public void setPage2AcqA15ApdDbCnt(long number) {
	    number = checkPage2AcqA15ApdDbCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPage2AcqA15ApdDbCnt((int)number);
	}
	
	/**
	 * 	Update Page2AcqA15ApdDbCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2AcqA15ApdDbCnt(char[] value) throws CFException {
		 page2AcqA15ApdDbCnt = serializePage2AcqA15ApdDbCnt(value);
	}
	/**
	 * 	Update Page2AcqA15ApdDbCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2AcqA15ApdDbCntString(char[] value) throws CFException {
		 setPage2AcqA15ApdDbCnt(value);
	}
	/**
	 *	Returns the value of page2AcqA15ApdCrCnt
	 *	@return page2AcqA15ApdCrCnt
	 */
	public int getPage2AcqA15ApdCrCnt() throws CFException {
       if (isPage2AcqA15ApdCrCntModified()) { 
           page2AcqA15ApdCrCnt = refreshPage2AcqA15ApdCrCnt();
        }
   		return page2AcqA15ApdCrCnt;
	}
	

    /**
	 *	Returns the String value of page2AcqA15ApdCrCnt
	 *	@return page2AcqA15ApdCrCnt
	 */
	public char[]  getPage2AcqA15ApdCrCntActualString() {
	    String value = String.valueOf(page2AcqA15ApdCrCnt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2AcqA15ApdCrCnt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ACQ-A15-APD-CR-CNT
	 *	@param number
	 */
	public void setPage2AcqA15ApdCrCnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2AcqA15ApdCrCnt = checkPage2AcqA15ApdCrCntMaxLimit(number); 
		serializePage2AcqA15ApdCrCnt(page2AcqA15ApdCrCnt);
	}
	

	public void setPage2AcqA15ApdCrCnt(long number) {
	    number = checkPage2AcqA15ApdCrCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPage2AcqA15ApdCrCnt((int)number);
	}
	
	/**
	 * 	Update Page2AcqA15ApdCrCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2AcqA15ApdCrCnt(char[] value) throws CFException {
		 page2AcqA15ApdCrCnt = serializePage2AcqA15ApdCrCnt(value);
	}
	/**
	 * 	Update Page2AcqA15ApdCrCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2AcqA15ApdCrCntString(char[] value) throws CFException {
		 setPage2AcqA15ApdCrCnt(value);
	}
	/**
	 *	Returns the value of page2AcqFeeDbAmt
	 *	@return page2AcqFeeDbAmt
	 */
	public long getPage2AcqFeeDbAmt() throws CFException {
       if (isPage2AcqFeeDbAmtModified()) { 
           page2AcqFeeDbAmt = refreshPage2AcqFeeDbAmt();
        }
   		return page2AcqFeeDbAmt;
	}
	

    /**
	 *	Returns the String value of page2AcqFeeDbAmt
	 *	@return page2AcqFeeDbAmt
	 */
	public char[]  getPage2AcqFeeDbAmtActualString() {
	    String value = String.valueOf(page2AcqFeeDbAmt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2AcqFeeDbAmt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ACQ-FEE-DB-AMT
	 *	@param number
	 */
	public void setPage2AcqFeeDbAmt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2AcqFeeDbAmt = checkPage2AcqFeeDbAmtMaxLimit(number); 
		serializePage2AcqFeeDbAmt(page2AcqFeeDbAmt);
	}
	

	/**
	 * 	Update Page2AcqFeeDbAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2AcqFeeDbAmt(char[] value) throws CFException {
		 page2AcqFeeDbAmt = serializePage2AcqFeeDbAmt(value);
	}
	/**
	 * 	Update Page2AcqFeeDbAmt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2AcqFeeDbAmtString(char[] value) throws CFException {
		 setPage2AcqFeeDbAmt(value);
	}
	/**
	 *	Returns the value of page2AcqNsdFeeDbAmt
	 *	@return page2AcqNsdFeeDbAmt
	 */
	public long getPage2AcqNsdFeeDbAmt() throws CFException {
       if (isPage2AcqNsdFeeDbAmtModified()) { 
           page2AcqNsdFeeDbAmt = refreshPage2AcqNsdFeeDbAmt();
        }
   		return page2AcqNsdFeeDbAmt;
	}
	

    /**
	 *	Returns the String value of page2AcqNsdFeeDbAmt
	 *	@return page2AcqNsdFeeDbAmt
	 */
	public char[]  getPage2AcqNsdFeeDbAmtActualString() {
	    String value = String.valueOf(page2AcqNsdFeeDbAmt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2AcqNsdFeeDbAmt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ACQ-NSD-FEE-DB-AMT
	 *	@param number
	 */
	public void setPage2AcqNsdFeeDbAmt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2AcqNsdFeeDbAmt = checkPage2AcqNsdFeeDbAmtMaxLimit(number); 
		serializePage2AcqNsdFeeDbAmt(page2AcqNsdFeeDbAmt);
	}
	

	/**
	 * 	Update Page2AcqNsdFeeDbAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2AcqNsdFeeDbAmt(char[] value) throws CFException {
		 page2AcqNsdFeeDbAmt = serializePage2AcqNsdFeeDbAmt(value);
	}
	/**
	 * 	Update Page2AcqNsdFeeDbAmt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2AcqNsdFeeDbAmtString(char[] value) throws CFException {
		 setPage2AcqNsdFeeDbAmt(value);
	}
	/**
	 *	Returns the value of page2AcqSdFeeDbAmt
	 *	@return page2AcqSdFeeDbAmt
	 */
	public long getPage2AcqSdFeeDbAmt() throws CFException {
       if (isPage2AcqSdFeeDbAmtModified()) { 
           page2AcqSdFeeDbAmt = refreshPage2AcqSdFeeDbAmt();
        }
   		return page2AcqSdFeeDbAmt;
	}
	

    /**
	 *	Returns the String value of page2AcqSdFeeDbAmt
	 *	@return page2AcqSdFeeDbAmt
	 */
	public char[]  getPage2AcqSdFeeDbAmtActualString() {
	    String value = String.valueOf(page2AcqSdFeeDbAmt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2AcqSdFeeDbAmt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ACQ-SD-FEE-DB-AMT
	 *	@param number
	 */
	public void setPage2AcqSdFeeDbAmt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2AcqSdFeeDbAmt = checkPage2AcqSdFeeDbAmtMaxLimit(number); 
		serializePage2AcqSdFeeDbAmt(page2AcqSdFeeDbAmt);
	}
	

	/**
	 * 	Update Page2AcqSdFeeDbAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2AcqSdFeeDbAmt(char[] value) throws CFException {
		 page2AcqSdFeeDbAmt = serializePage2AcqSdFeeDbAmt(value);
	}
	/**
	 * 	Update Page2AcqSdFeeDbAmt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2AcqSdFeeDbAmtString(char[] value) throws CFException {
		 setPage2AcqSdFeeDbAmt(value);
	}
	/**
	 *	Returns the value of page2AcqFeeCrAmt
	 *	@return page2AcqFeeCrAmt
	 */
	public long getPage2AcqFeeCrAmt() throws CFException {
       if (isPage2AcqFeeCrAmtModified()) { 
           page2AcqFeeCrAmt = refreshPage2AcqFeeCrAmt();
        }
   		return page2AcqFeeCrAmt;
	}
	

    /**
	 *	Returns the String value of page2AcqFeeCrAmt
	 *	@return page2AcqFeeCrAmt
	 */
	public char[]  getPage2AcqFeeCrAmtActualString() {
	    String value = String.valueOf(page2AcqFeeCrAmt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2AcqFeeCrAmt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ACQ-FEE-CR-AMT
	 *	@param number
	 */
	public void setPage2AcqFeeCrAmt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2AcqFeeCrAmt = checkPage2AcqFeeCrAmtMaxLimit(number); 
		serializePage2AcqFeeCrAmt(page2AcqFeeCrAmt);
	}
	

	/**
	 * 	Update Page2AcqFeeCrAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2AcqFeeCrAmt(char[] value) throws CFException {
		 page2AcqFeeCrAmt = serializePage2AcqFeeCrAmt(value);
	}
	/**
	 * 	Update Page2AcqFeeCrAmt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2AcqFeeCrAmtString(char[] value) throws CFException {
		 setPage2AcqFeeCrAmt(value);
	}
	/**
	 *	Returns the value of page2AcqNsdFeeCrAmt
	 *	@return page2AcqNsdFeeCrAmt
	 */
	public long getPage2AcqNsdFeeCrAmt() throws CFException {
       if (isPage2AcqNsdFeeCrAmtModified()) { 
           page2AcqNsdFeeCrAmt = refreshPage2AcqNsdFeeCrAmt();
        }
   		return page2AcqNsdFeeCrAmt;
	}
	

    /**
	 *	Returns the String value of page2AcqNsdFeeCrAmt
	 *	@return page2AcqNsdFeeCrAmt
	 */
	public char[]  getPage2AcqNsdFeeCrAmtActualString() {
	    String value = String.valueOf(page2AcqNsdFeeCrAmt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2AcqNsdFeeCrAmt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ACQ-NSD-FEE-CR-AMT
	 *	@param number
	 */
	public void setPage2AcqNsdFeeCrAmt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2AcqNsdFeeCrAmt = checkPage2AcqNsdFeeCrAmtMaxLimit(number); 
		serializePage2AcqNsdFeeCrAmt(page2AcqNsdFeeCrAmt);
	}
	

	/**
	 * 	Update Page2AcqNsdFeeCrAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2AcqNsdFeeCrAmt(char[] value) throws CFException {
		 page2AcqNsdFeeCrAmt = serializePage2AcqNsdFeeCrAmt(value);
	}
	/**
	 * 	Update Page2AcqNsdFeeCrAmt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2AcqNsdFeeCrAmtString(char[] value) throws CFException {
		 setPage2AcqNsdFeeCrAmt(value);
	}
	/**
	 *	Returns the value of page2AcqSdFeeCrAmt
	 *	@return page2AcqSdFeeCrAmt
	 */
	public long getPage2AcqSdFeeCrAmt() throws CFException {
       if (isPage2AcqSdFeeCrAmtModified()) { 
           page2AcqSdFeeCrAmt = refreshPage2AcqSdFeeCrAmt();
        }
   		return page2AcqSdFeeCrAmt;
	}
	

    /**
	 *	Returns the String value of page2AcqSdFeeCrAmt
	 *	@return page2AcqSdFeeCrAmt
	 */
	public char[]  getPage2AcqSdFeeCrAmtActualString() {
	    String value = String.valueOf(page2AcqSdFeeCrAmt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2AcqSdFeeCrAmt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ACQ-SD-FEE-CR-AMT
	 *	@param number
	 */
	public void setPage2AcqSdFeeCrAmt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2AcqSdFeeCrAmt = checkPage2AcqSdFeeCrAmtMaxLimit(number); 
		serializePage2AcqSdFeeCrAmt(page2AcqSdFeeCrAmt);
	}
	

	/**
	 * 	Update Page2AcqSdFeeCrAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2AcqSdFeeCrAmt(char[] value) throws CFException {
		 page2AcqSdFeeCrAmt = serializePage2AcqSdFeeCrAmt(value);
	}
	/**
	 * 	Update Page2AcqSdFeeCrAmt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2AcqSdFeeCrAmtString(char[] value) throws CFException {
		 setPage2AcqSdFeeCrAmt(value);
	}
	/**
	 *	Returns the value of page2AcqAtmDbCnt
	 *	@return page2AcqAtmDbCnt
	 */
	public int getPage2AcqAtmDbCnt() throws CFException {
       if (isPage2AcqAtmDbCntModified()) { 
           page2AcqAtmDbCnt = refreshPage2AcqAtmDbCnt();
        }
   		return page2AcqAtmDbCnt;
	}
	

    /**
	 *	Returns the String value of page2AcqAtmDbCnt
	 *	@return page2AcqAtmDbCnt
	 */
	public char[]  getPage2AcqAtmDbCntActualString() {
	    String value = String.valueOf(page2AcqAtmDbCnt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2AcqAtmDbCnt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ACQ-ATM-DB-CNT
	 *	@param number
	 */
	public void setPage2AcqAtmDbCnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2AcqAtmDbCnt = checkPage2AcqAtmDbCntMaxLimit(number); 
		serializePage2AcqAtmDbCnt(page2AcqAtmDbCnt);
	}
	

	public void setPage2AcqAtmDbCnt(long number) {
	    number = checkPage2AcqAtmDbCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPage2AcqAtmDbCnt((int)number);
	}
	
	/**
	 * 	Update Page2AcqAtmDbCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2AcqAtmDbCnt(char[] value) throws CFException {
		 page2AcqAtmDbCnt = serializePage2AcqAtmDbCnt(value);
	}
	/**
	 * 	Update Page2AcqAtmDbCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2AcqAtmDbCntString(char[] value) throws CFException {
		 setPage2AcqAtmDbCnt(value);
	}
	/**
	 *	Returns the value of page2AcqAtmDbAmt
	 *	@return page2AcqAtmDbAmt
	 */
	public long getPage2AcqAtmDbAmt() throws CFException {
       if (isPage2AcqAtmDbAmtModified()) { 
           page2AcqAtmDbAmt = refreshPage2AcqAtmDbAmt();
        }
   		return page2AcqAtmDbAmt;
	}
	

    /**
	 *	Returns the String value of page2AcqAtmDbAmt
	 *	@return page2AcqAtmDbAmt
	 */
	public char[]  getPage2AcqAtmDbAmtActualString() {
	    String value = String.valueOf(page2AcqAtmDbAmt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2AcqAtmDbAmt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ACQ-ATM-DB-AMT
	 *	@param number
	 */
	public void setPage2AcqAtmDbAmt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2AcqAtmDbAmt = checkPage2AcqAtmDbAmtMaxLimit(number); 
		serializePage2AcqAtmDbAmt(page2AcqAtmDbAmt);
	}
	

	/**
	 * 	Update Page2AcqAtmDbAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2AcqAtmDbAmt(char[] value) throws CFException {
		 page2AcqAtmDbAmt = serializePage2AcqAtmDbAmt(value);
	}
	/**
	 * 	Update Page2AcqAtmDbAmt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2AcqAtmDbAmtString(char[] value) throws CFException {
		 setPage2AcqAtmDbAmt(value);
	}
	/**
	 *	Returns the value of page2AcqAtmCrCnt
	 *	@return page2AcqAtmCrCnt
	 */
	public int getPage2AcqAtmCrCnt() throws CFException {
       if (isPage2AcqAtmCrCntModified()) { 
           page2AcqAtmCrCnt = refreshPage2AcqAtmCrCnt();
        }
   		return page2AcqAtmCrCnt;
	}
	

    /**
	 *	Returns the String value of page2AcqAtmCrCnt
	 *	@return page2AcqAtmCrCnt
	 */
	public char[]  getPage2AcqAtmCrCntActualString() {
	    String value = String.valueOf(page2AcqAtmCrCnt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2AcqAtmCrCnt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ACQ-ATM-CR-CNT
	 *	@param number
	 */
	public void setPage2AcqAtmCrCnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2AcqAtmCrCnt = checkPage2AcqAtmCrCntMaxLimit(number); 
		serializePage2AcqAtmCrCnt(page2AcqAtmCrCnt);
	}
	

	public void setPage2AcqAtmCrCnt(long number) {
	    number = checkPage2AcqAtmCrCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPage2AcqAtmCrCnt((int)number);
	}
	
	/**
	 * 	Update Page2AcqAtmCrCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2AcqAtmCrCnt(char[] value) throws CFException {
		 page2AcqAtmCrCnt = serializePage2AcqAtmCrCnt(value);
	}
	/**
	 * 	Update Page2AcqAtmCrCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2AcqAtmCrCntString(char[] value) throws CFException {
		 setPage2AcqAtmCrCnt(value);
	}
	/**
	 *	Returns the value of page2AcqAtmCrAmt
	 *	@return page2AcqAtmCrAmt
	 */
	public long getPage2AcqAtmCrAmt() throws CFException {
       if (isPage2AcqAtmCrAmtModified()) { 
           page2AcqAtmCrAmt = refreshPage2AcqAtmCrAmt();
        }
   		return page2AcqAtmCrAmt;
	}
	

    /**
	 *	Returns the String value of page2AcqAtmCrAmt
	 *	@return page2AcqAtmCrAmt
	 */
	public char[]  getPage2AcqAtmCrAmtActualString() {
	    String value = String.valueOf(page2AcqAtmCrAmt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2AcqAtmCrAmt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ACQ-ATM-CR-AMT
	 *	@param number
	 */
	public void setPage2AcqAtmCrAmt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2AcqAtmCrAmt = checkPage2AcqAtmCrAmtMaxLimit(number); 
		serializePage2AcqAtmCrAmt(page2AcqAtmCrAmt);
	}
	

	/**
	 * 	Update Page2AcqAtmCrAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2AcqAtmCrAmt(char[] value) throws CFException {
		 page2AcqAtmCrAmt = serializePage2AcqAtmCrAmt(value);
	}
	/**
	 * 	Update Page2AcqAtmCrAmt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2AcqAtmCrAmtString(char[] value) throws CFException {
		 setPage2AcqAtmCrAmt(value);
	}
	/**
	 *	Returns the value of page2AcqPosDbCnt
	 *	@return page2AcqPosDbCnt
	 */
	public int getPage2AcqPosDbCnt() throws CFException {
       if (isPage2AcqPosDbCntModified()) { 
           page2AcqPosDbCnt = refreshPage2AcqPosDbCnt();
        }
   		return page2AcqPosDbCnt;
	}
	

    /**
	 *	Returns the String value of page2AcqPosDbCnt
	 *	@return page2AcqPosDbCnt
	 */
	public char[]  getPage2AcqPosDbCntActualString() {
	    String value = String.valueOf(page2AcqPosDbCnt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2AcqPosDbCnt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ACQ-POS-DB-CNT
	 *	@param number
	 */
	public void setPage2AcqPosDbCnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2AcqPosDbCnt = checkPage2AcqPosDbCntMaxLimit(number); 
		serializePage2AcqPosDbCnt(page2AcqPosDbCnt);
	}
	

	public void setPage2AcqPosDbCnt(long number) {
	    number = checkPage2AcqPosDbCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPage2AcqPosDbCnt((int)number);
	}
	
	/**
	 * 	Update Page2AcqPosDbCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2AcqPosDbCnt(char[] value) throws CFException {
		 page2AcqPosDbCnt = serializePage2AcqPosDbCnt(value);
	}
	/**
	 * 	Update Page2AcqPosDbCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2AcqPosDbCntString(char[] value) throws CFException {
		 setPage2AcqPosDbCnt(value);
	}
	/**
	 *	Returns the value of page2AcqPosDbAmt
	 *	@return page2AcqPosDbAmt
	 */
	public long getPage2AcqPosDbAmt() throws CFException {
       if (isPage2AcqPosDbAmtModified()) { 
           page2AcqPosDbAmt = refreshPage2AcqPosDbAmt();
        }
   		return page2AcqPosDbAmt;
	}
	

    /**
	 *	Returns the String value of page2AcqPosDbAmt
	 *	@return page2AcqPosDbAmt
	 */
	public char[]  getPage2AcqPosDbAmtActualString() {
	    String value = String.valueOf(page2AcqPosDbAmt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2AcqPosDbAmt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ACQ-POS-DB-AMT
	 *	@param number
	 */
	public void setPage2AcqPosDbAmt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2AcqPosDbAmt = checkPage2AcqPosDbAmtMaxLimit(number); 
		serializePage2AcqPosDbAmt(page2AcqPosDbAmt);
	}
	

	/**
	 * 	Update Page2AcqPosDbAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2AcqPosDbAmt(char[] value) throws CFException {
		 page2AcqPosDbAmt = serializePage2AcqPosDbAmt(value);
	}
	/**
	 * 	Update Page2AcqPosDbAmt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2AcqPosDbAmtString(char[] value) throws CFException {
		 setPage2AcqPosDbAmt(value);
	}
	/**
	 *	Returns the value of page2AcqPosCrCnt
	 *	@return page2AcqPosCrCnt
	 */
	public int getPage2AcqPosCrCnt() throws CFException {
       if (isPage2AcqPosCrCntModified()) { 
           page2AcqPosCrCnt = refreshPage2AcqPosCrCnt();
        }
   		return page2AcqPosCrCnt;
	}
	

    /**
	 *	Returns the String value of page2AcqPosCrCnt
	 *	@return page2AcqPosCrCnt
	 */
	public char[]  getPage2AcqPosCrCntActualString() {
	    String value = String.valueOf(page2AcqPosCrCnt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2AcqPosCrCnt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ACQ-POS-CR-CNT
	 *	@param number
	 */
	public void setPage2AcqPosCrCnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2AcqPosCrCnt = checkPage2AcqPosCrCntMaxLimit(number); 
		serializePage2AcqPosCrCnt(page2AcqPosCrCnt);
	}
	

	public void setPage2AcqPosCrCnt(long number) {
	    number = checkPage2AcqPosCrCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPage2AcqPosCrCnt((int)number);
	}
	
	/**
	 * 	Update Page2AcqPosCrCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2AcqPosCrCnt(char[] value) throws CFException {
		 page2AcqPosCrCnt = serializePage2AcqPosCrCnt(value);
	}
	/**
	 * 	Update Page2AcqPosCrCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2AcqPosCrCntString(char[] value) throws CFException {
		 setPage2AcqPosCrCnt(value);
	}
	/**
	 *	Returns the value of page2AcqPosCrAmt
	 *	@return page2AcqPosCrAmt
	 */
	public long getPage2AcqPosCrAmt() throws CFException {
       if (isPage2AcqPosCrAmtModified()) { 
           page2AcqPosCrAmt = refreshPage2AcqPosCrAmt();
        }
   		return page2AcqPosCrAmt;
	}
	

    /**
	 *	Returns the String value of page2AcqPosCrAmt
	 *	@return page2AcqPosCrAmt
	 */
	public char[]  getPage2AcqPosCrAmtActualString() {
	    String value = String.valueOf(page2AcqPosCrAmt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2AcqPosCrAmt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ACQ-POS-CR-AMT
	 *	@param number
	 */
	public void setPage2AcqPosCrAmt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2AcqPosCrAmt = checkPage2AcqPosCrAmtMaxLimit(number); 
		serializePage2AcqPosCrAmt(page2AcqPosCrAmt);
	}
	

	/**
	 * 	Update Page2AcqPosCrAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2AcqPosCrAmt(char[] value) throws CFException {
		 page2AcqPosCrAmt = serializePage2AcqPosCrAmt(value);
	}
	/**
	 * 	Update Page2AcqPosCrAmt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2AcqPosCrAmtString(char[] value) throws CFException {
		 setPage2AcqPosCrAmt(value);
	}
	/**
	 *	Returns the value of page2AcqAtmDbRevCnt
	 *	@return page2AcqAtmDbRevCnt
	 */
	public int getPage2AcqAtmDbRevCnt() throws CFException {
       if (isPage2AcqAtmDbRevCntModified()) { 
           page2AcqAtmDbRevCnt = refreshPage2AcqAtmDbRevCnt();
        }
   		return page2AcqAtmDbRevCnt;
	}
	

    /**
	 *	Returns the String value of page2AcqAtmDbRevCnt
	 *	@return page2AcqAtmDbRevCnt
	 */
	public char[]  getPage2AcqAtmDbRevCntActualString() {
	    String value = String.valueOf(page2AcqAtmDbRevCnt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2AcqAtmDbRevCnt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ACQ-ATM-DB-REV-CNT
	 *	@param number
	 */
	public void setPage2AcqAtmDbRevCnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2AcqAtmDbRevCnt = checkPage2AcqAtmDbRevCntMaxLimit(number); 
		serializePage2AcqAtmDbRevCnt(page2AcqAtmDbRevCnt);
	}
	

	public void setPage2AcqAtmDbRevCnt(long number) {
	    number = checkPage2AcqAtmDbRevCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPage2AcqAtmDbRevCnt((int)number);
	}
	
	/**
	 * 	Update Page2AcqAtmDbRevCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2AcqAtmDbRevCnt(char[] value) throws CFException {
		 page2AcqAtmDbRevCnt = serializePage2AcqAtmDbRevCnt(value);
	}
	/**
	 * 	Update Page2AcqAtmDbRevCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2AcqAtmDbRevCntString(char[] value) throws CFException {
		 setPage2AcqAtmDbRevCnt(value);
	}
	/**
	 *	Returns the value of page2AcqAtmDbRevAmt
	 *	@return page2AcqAtmDbRevAmt
	 */
	public long getPage2AcqAtmDbRevAmt() throws CFException {
       if (isPage2AcqAtmDbRevAmtModified()) { 
           page2AcqAtmDbRevAmt = refreshPage2AcqAtmDbRevAmt();
        }
   		return page2AcqAtmDbRevAmt;
	}
	

    /**
	 *	Returns the String value of page2AcqAtmDbRevAmt
	 *	@return page2AcqAtmDbRevAmt
	 */
	public char[]  getPage2AcqAtmDbRevAmtActualString() {
	    String value = String.valueOf(page2AcqAtmDbRevAmt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2AcqAtmDbRevAmt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ACQ-ATM-DB-REV-AMT
	 *	@param number
	 */
	public void setPage2AcqAtmDbRevAmt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2AcqAtmDbRevAmt = checkPage2AcqAtmDbRevAmtMaxLimit(number); 
		serializePage2AcqAtmDbRevAmt(page2AcqAtmDbRevAmt);
	}
	

	/**
	 * 	Update Page2AcqAtmDbRevAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2AcqAtmDbRevAmt(char[] value) throws CFException {
		 page2AcqAtmDbRevAmt = serializePage2AcqAtmDbRevAmt(value);
	}
	/**
	 * 	Update Page2AcqAtmDbRevAmt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2AcqAtmDbRevAmtString(char[] value) throws CFException {
		 setPage2AcqAtmDbRevAmt(value);
	}
	/**
	 *	Returns the value of page2AcqAtmCrRevCnt
	 *	@return page2AcqAtmCrRevCnt
	 */
	public int getPage2AcqAtmCrRevCnt() throws CFException {
       if (isPage2AcqAtmCrRevCntModified()) { 
           page2AcqAtmCrRevCnt = refreshPage2AcqAtmCrRevCnt();
        }
   		return page2AcqAtmCrRevCnt;
	}
	

    /**
	 *	Returns the String value of page2AcqAtmCrRevCnt
	 *	@return page2AcqAtmCrRevCnt
	 */
	public char[]  getPage2AcqAtmCrRevCntActualString() {
	    String value = String.valueOf(page2AcqAtmCrRevCnt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2AcqAtmCrRevCnt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ACQ-ATM-CR-REV-CNT
	 *	@param number
	 */
	public void setPage2AcqAtmCrRevCnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2AcqAtmCrRevCnt = checkPage2AcqAtmCrRevCntMaxLimit(number); 
		serializePage2AcqAtmCrRevCnt(page2AcqAtmCrRevCnt);
	}
	

	public void setPage2AcqAtmCrRevCnt(long number) {
	    number = checkPage2AcqAtmCrRevCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPage2AcqAtmCrRevCnt((int)number);
	}
	
	/**
	 * 	Update Page2AcqAtmCrRevCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2AcqAtmCrRevCnt(char[] value) throws CFException {
		 page2AcqAtmCrRevCnt = serializePage2AcqAtmCrRevCnt(value);
	}
	/**
	 * 	Update Page2AcqAtmCrRevCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2AcqAtmCrRevCntString(char[] value) throws CFException {
		 setPage2AcqAtmCrRevCnt(value);
	}
	/**
	 *	Returns the value of page2AcqAtmCrRevAmt
	 *	@return page2AcqAtmCrRevAmt
	 */
	public long getPage2AcqAtmCrRevAmt() throws CFException {
       if (isPage2AcqAtmCrRevAmtModified()) { 
           page2AcqAtmCrRevAmt = refreshPage2AcqAtmCrRevAmt();
        }
   		return page2AcqAtmCrRevAmt;
	}
	

    /**
	 *	Returns the String value of page2AcqAtmCrRevAmt
	 *	@return page2AcqAtmCrRevAmt
	 */
	public char[]  getPage2AcqAtmCrRevAmtActualString() {
	    String value = String.valueOf(page2AcqAtmCrRevAmt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2AcqAtmCrRevAmt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ACQ-ATM-CR-REV-AMT
	 *	@param number
	 */
	public void setPage2AcqAtmCrRevAmt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2AcqAtmCrRevAmt = checkPage2AcqAtmCrRevAmtMaxLimit(number); 
		serializePage2AcqAtmCrRevAmt(page2AcqAtmCrRevAmt);
	}
	

	/**
	 * 	Update Page2AcqAtmCrRevAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2AcqAtmCrRevAmt(char[] value) throws CFException {
		 page2AcqAtmCrRevAmt = serializePage2AcqAtmCrRevAmt(value);
	}
	/**
	 * 	Update Page2AcqAtmCrRevAmt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2AcqAtmCrRevAmtString(char[] value) throws CFException {
		 setPage2AcqAtmCrRevAmt(value);
	}
	/**
	 *	Returns the value of page2AcqPosDbRevCnt
	 *	@return page2AcqPosDbRevCnt
	 */
	public int getPage2AcqPosDbRevCnt() throws CFException {
       if (isPage2AcqPosDbRevCntModified()) { 
           page2AcqPosDbRevCnt = refreshPage2AcqPosDbRevCnt();
        }
   		return page2AcqPosDbRevCnt;
	}
	

    /**
	 *	Returns the String value of page2AcqPosDbRevCnt
	 *	@return page2AcqPosDbRevCnt
	 */
	public char[]  getPage2AcqPosDbRevCntActualString() {
	    String value = String.valueOf(page2AcqPosDbRevCnt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2AcqPosDbRevCnt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ACQ-POS-DB-REV-CNT
	 *	@param number
	 */
	public void setPage2AcqPosDbRevCnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2AcqPosDbRevCnt = checkPage2AcqPosDbRevCntMaxLimit(number); 
		serializePage2AcqPosDbRevCnt(page2AcqPosDbRevCnt);
	}
	

	public void setPage2AcqPosDbRevCnt(long number) {
	    number = checkPage2AcqPosDbRevCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPage2AcqPosDbRevCnt((int)number);
	}
	
	/**
	 * 	Update Page2AcqPosDbRevCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2AcqPosDbRevCnt(char[] value) throws CFException {
		 page2AcqPosDbRevCnt = serializePage2AcqPosDbRevCnt(value);
	}
	/**
	 * 	Update Page2AcqPosDbRevCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2AcqPosDbRevCntString(char[] value) throws CFException {
		 setPage2AcqPosDbRevCnt(value);
	}
	/**
	 *	Returns the value of page2AcqPosDbRevAmt
	 *	@return page2AcqPosDbRevAmt
	 */
	public long getPage2AcqPosDbRevAmt() throws CFException {
       if (isPage2AcqPosDbRevAmtModified()) { 
           page2AcqPosDbRevAmt = refreshPage2AcqPosDbRevAmt();
        }
   		return page2AcqPosDbRevAmt;
	}
	

    /**
	 *	Returns the String value of page2AcqPosDbRevAmt
	 *	@return page2AcqPosDbRevAmt
	 */
	public char[]  getPage2AcqPosDbRevAmtActualString() {
	    String value = String.valueOf(page2AcqPosDbRevAmt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2AcqPosDbRevAmt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ACQ-POS-DB-REV-AMT
	 *	@param number
	 */
	public void setPage2AcqPosDbRevAmt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2AcqPosDbRevAmt = checkPage2AcqPosDbRevAmtMaxLimit(number); 
		serializePage2AcqPosDbRevAmt(page2AcqPosDbRevAmt);
	}
	

	/**
	 * 	Update Page2AcqPosDbRevAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2AcqPosDbRevAmt(char[] value) throws CFException {
		 page2AcqPosDbRevAmt = serializePage2AcqPosDbRevAmt(value);
	}
	/**
	 * 	Update Page2AcqPosDbRevAmt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2AcqPosDbRevAmtString(char[] value) throws CFException {
		 setPage2AcqPosDbRevAmt(value);
	}
	/**
	 *	Returns the value of page2AcqPosCrRevCnt
	 *	@return page2AcqPosCrRevCnt
	 */
	public int getPage2AcqPosCrRevCnt() throws CFException {
       if (isPage2AcqPosCrRevCntModified()) { 
           page2AcqPosCrRevCnt = refreshPage2AcqPosCrRevCnt();
        }
   		return page2AcqPosCrRevCnt;
	}
	

    /**
	 *	Returns the String value of page2AcqPosCrRevCnt
	 *	@return page2AcqPosCrRevCnt
	 */
	public char[]  getPage2AcqPosCrRevCntActualString() {
	    String value = String.valueOf(page2AcqPosCrRevCnt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2AcqPosCrRevCnt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ACQ-POS-CR-REV-CNT
	 *	@param number
	 */
	public void setPage2AcqPosCrRevCnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2AcqPosCrRevCnt = checkPage2AcqPosCrRevCntMaxLimit(number); 
		serializePage2AcqPosCrRevCnt(page2AcqPosCrRevCnt);
	}
	

	public void setPage2AcqPosCrRevCnt(long number) {
	    number = checkPage2AcqPosCrRevCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPage2AcqPosCrRevCnt((int)number);
	}
	
	/**
	 * 	Update Page2AcqPosCrRevCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2AcqPosCrRevCnt(char[] value) throws CFException {
		 page2AcqPosCrRevCnt = serializePage2AcqPosCrRevCnt(value);
	}
	/**
	 * 	Update Page2AcqPosCrRevCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2AcqPosCrRevCntString(char[] value) throws CFException {
		 setPage2AcqPosCrRevCnt(value);
	}
	/**
	 *	Returns the value of page2AcqPosCrRevAmt
	 *	@return page2AcqPosCrRevAmt
	 */
	public long getPage2AcqPosCrRevAmt() throws CFException {
       if (isPage2AcqPosCrRevAmtModified()) { 
           page2AcqPosCrRevAmt = refreshPage2AcqPosCrRevAmt();
        }
   		return page2AcqPosCrRevAmt;
	}
	

    /**
	 *	Returns the String value of page2AcqPosCrRevAmt
	 *	@return page2AcqPosCrRevAmt
	 */
	public char[]  getPage2AcqPosCrRevAmtActualString() {
	    String value = String.valueOf(page2AcqPosCrRevAmt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2AcqPosCrRevAmt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ACQ-POS-CR-REV-AMT
	 *	@param number
	 */
	public void setPage2AcqPosCrRevAmt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2AcqPosCrRevAmt = checkPage2AcqPosCrRevAmtMaxLimit(number); 
		serializePage2AcqPosCrRevAmt(page2AcqPosCrRevAmt);
	}
	

	/**
	 * 	Update Page2AcqPosCrRevAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2AcqPosCrRevAmt(char[] value) throws CFException {
		 page2AcqPosCrRevAmt = serializePage2AcqPosCrRevAmt(value);
	}
	/**
	 * 	Update Page2AcqPosCrRevAmt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2AcqPosCrRevAmtString(char[] value) throws CFException {
		 setPage2AcqPosCrRevAmt(value);
	}
	/**
	 *	Returns the value of page2AcqSurchgFree
	 *	@return page2AcqSurchgFree
	 */
	public int getPage2AcqSurchgFree() throws CFException {
       if (isPage2AcqSurchgFreeModified()) { 
           page2AcqSurchgFree = refreshPage2AcqSurchgFree();
        }
   		return page2AcqSurchgFree;
	}
	

    /**
	 *	Returns the String value of page2AcqSurchgFree
	 *	@return page2AcqSurchgFree
	 */
	public char[]  getPage2AcqSurchgFreeActualString() {
	    String value = String.valueOf(page2AcqSurchgFree).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2AcqSurchgFree with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ACQ-SURCHG-FREE
	 *	@param number
	 */
	public void setPage2AcqSurchgFree(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2AcqSurchgFree = checkPage2AcqSurchgFreeMaxLimit(number); 
		serializePage2AcqSurchgFree(page2AcqSurchgFree);
	}
	

	public void setPage2AcqSurchgFree(long number) {
	    number = checkPage2AcqSurchgFreeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPage2AcqSurchgFree((int)number);
	}
	
	/**
	 * 	Update Page2AcqSurchgFree with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2AcqSurchgFree(char[] value) throws CFException {
		 page2AcqSurchgFree = serializePage2AcqSurchgFree(value);
	}
	/**
	 * 	Update Page2AcqSurchgFree with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2AcqSurchgFreeString(char[] value) throws CFException {
		 setPage2AcqSurchgFree(value);
	}
	/**
	 *	Returns the value of page2IssFinDbCnt
	 *	@return page2IssFinDbCnt
	 */
	public int getPage2IssFinDbCnt() throws CFException {
       if (isPage2IssFinDbCntModified()) { 
           page2IssFinDbCnt = refreshPage2IssFinDbCnt();
        }
   		return page2IssFinDbCnt;
	}
	

    /**
	 *	Returns the String value of page2IssFinDbCnt
	 *	@return page2IssFinDbCnt
	 */
	public char[]  getPage2IssFinDbCntActualString() {
	    String value = String.valueOf(page2IssFinDbCnt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2IssFinDbCnt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ISS-FIN-DB-CNT
	 *	@param number
	 */
	public void setPage2IssFinDbCnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2IssFinDbCnt = checkPage2IssFinDbCntMaxLimit(number); 
		serializePage2IssFinDbCnt(page2IssFinDbCnt);
	}
	

	public void setPage2IssFinDbCnt(long number) {
	    number = checkPage2IssFinDbCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPage2IssFinDbCnt((int)number);
	}
	
	/**
	 * 	Update Page2IssFinDbCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2IssFinDbCnt(char[] value) throws CFException {
		 page2IssFinDbCnt = serializePage2IssFinDbCnt(value);
	}
	/**
	 * 	Update Page2IssFinDbCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2IssFinDbCntString(char[] value) throws CFException {
		 setPage2IssFinDbCnt(value);
	}
	/**
	 *	Returns the value of page2IssFinDbAmt
	 *	@return page2IssFinDbAmt
	 */
	public long getPage2IssFinDbAmt() throws CFException {
       if (isPage2IssFinDbAmtModified()) { 
           page2IssFinDbAmt = refreshPage2IssFinDbAmt();
        }
   		return page2IssFinDbAmt;
	}
	

    /**
	 *	Returns the String value of page2IssFinDbAmt
	 *	@return page2IssFinDbAmt
	 */
	public char[]  getPage2IssFinDbAmtActualString() {
	    String value = String.valueOf(page2IssFinDbAmt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2IssFinDbAmt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ISS-FIN-DB-AMT
	 *	@param number
	 */
	public void setPage2IssFinDbAmt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2IssFinDbAmt = checkPage2IssFinDbAmtMaxLimit(number); 
		serializePage2IssFinDbAmt(page2IssFinDbAmt);
	}
	

	/**
	 * 	Update Page2IssFinDbAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2IssFinDbAmt(char[] value) throws CFException {
		 page2IssFinDbAmt = serializePage2IssFinDbAmt(value);
	}
	/**
	 * 	Update Page2IssFinDbAmt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2IssFinDbAmtString(char[] value) throws CFException {
		 setPage2IssFinDbAmt(value);
	}
	/**
	 *	Returns the value of page2IssTmpDbCnt
	 *	@return page2IssTmpDbCnt
	 */
	public int getPage2IssTmpDbCnt() throws CFException {
       if (isPage2IssTmpDbCntModified()) { 
           page2IssTmpDbCnt = refreshPage2IssTmpDbCnt();
        }
   		return page2IssTmpDbCnt;
	}
	

    /**
	 *	Returns the String value of page2IssTmpDbCnt
	 *	@return page2IssTmpDbCnt
	 */
	public char[]  getPage2IssTmpDbCntActualString() {
	    String value = String.valueOf(page2IssTmpDbCnt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2IssTmpDbCnt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ISS-TMP-DB-CNT
	 *	@param number
	 */
	public void setPage2IssTmpDbCnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2IssTmpDbCnt = checkPage2IssTmpDbCntMaxLimit(number); 
		serializePage2IssTmpDbCnt(page2IssTmpDbCnt);
	}
	

	public void setPage2IssTmpDbCnt(long number) {
	    number = checkPage2IssTmpDbCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPage2IssTmpDbCnt((int)number);
	}
	
	/**
	 * 	Update Page2IssTmpDbCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2IssTmpDbCnt(char[] value) throws CFException {
		 page2IssTmpDbCnt = serializePage2IssTmpDbCnt(value);
	}
	/**
	 * 	Update Page2IssTmpDbCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2IssTmpDbCntString(char[] value) throws CFException {
		 setPage2IssTmpDbCnt(value);
	}
	/**
	 *	Returns the value of page2IssTmpCrCnt
	 *	@return page2IssTmpCrCnt
	 */
	public int getPage2IssTmpCrCnt() throws CFException {
       if (isPage2IssTmpCrCntModified()) { 
           page2IssTmpCrCnt = refreshPage2IssTmpCrCnt();
        }
   		return page2IssTmpCrCnt;
	}
	

    /**
	 *	Returns the String value of page2IssTmpCrCnt
	 *	@return page2IssTmpCrCnt
	 */
	public char[]  getPage2IssTmpCrCntActualString() {
	    String value = String.valueOf(page2IssTmpCrCnt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2IssTmpCrCnt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ISS-TMP-CR-CNT
	 *	@param number
	 */
	public void setPage2IssTmpCrCnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2IssTmpCrCnt = checkPage2IssTmpCrCntMaxLimit(number); 
		serializePage2IssTmpCrCnt(page2IssTmpCrCnt);
	}
	

	public void setPage2IssTmpCrCnt(long number) {
	    number = checkPage2IssTmpCrCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPage2IssTmpCrCnt((int)number);
	}
	
	/**
	 * 	Update Page2IssTmpCrCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2IssTmpCrCnt(char[] value) throws CFException {
		 page2IssTmpCrCnt = serializePage2IssTmpCrCnt(value);
	}
	/**
	 * 	Update Page2IssTmpCrCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2IssTmpCrCntString(char[] value) throws CFException {
		 setPage2IssTmpCrCnt(value);
	}
	/**
	 *	Returns the value of page2IssFinCrCnt
	 *	@return page2IssFinCrCnt
	 */
	public int getPage2IssFinCrCnt() throws CFException {
       if (isPage2IssFinCrCntModified()) { 
           page2IssFinCrCnt = refreshPage2IssFinCrCnt();
        }
   		return page2IssFinCrCnt;
	}
	

    /**
	 *	Returns the String value of page2IssFinCrCnt
	 *	@return page2IssFinCrCnt
	 */
	public char[]  getPage2IssFinCrCntActualString() {
	    String value = String.valueOf(page2IssFinCrCnt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2IssFinCrCnt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ISS-FIN-CR-CNT
	 *	@param number
	 */
	public void setPage2IssFinCrCnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2IssFinCrCnt = checkPage2IssFinCrCntMaxLimit(number); 
		serializePage2IssFinCrCnt(page2IssFinCrCnt);
	}
	

	public void setPage2IssFinCrCnt(long number) {
	    number = checkPage2IssFinCrCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPage2IssFinCrCnt((int)number);
	}
	
	/**
	 * 	Update Page2IssFinCrCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2IssFinCrCnt(char[] value) throws CFException {
		 page2IssFinCrCnt = serializePage2IssFinCrCnt(value);
	}
	/**
	 * 	Update Page2IssFinCrCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2IssFinCrCntString(char[] value) throws CFException {
		 setPage2IssFinCrCnt(value);
	}
	/**
	 *	Returns the value of page2IssFinCrAmt
	 *	@return page2IssFinCrAmt
	 */
	public long getPage2IssFinCrAmt() throws CFException {
       if (isPage2IssFinCrAmtModified()) { 
           page2IssFinCrAmt = refreshPage2IssFinCrAmt();
        }
   		return page2IssFinCrAmt;
	}
	

    /**
	 *	Returns the String value of page2IssFinCrAmt
	 *	@return page2IssFinCrAmt
	 */
	public char[]  getPage2IssFinCrAmtActualString() {
	    String value = String.valueOf(page2IssFinCrAmt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2IssFinCrAmt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ISS-FIN-CR-AMT
	 *	@param number
	 */
	public void setPage2IssFinCrAmt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2IssFinCrAmt = checkPage2IssFinCrAmtMaxLimit(number); 
		serializePage2IssFinCrAmt(page2IssFinCrAmt);
	}
	

	/**
	 * 	Update Page2IssFinCrAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2IssFinCrAmt(char[] value) throws CFException {
		 page2IssFinCrAmt = serializePage2IssFinCrAmt(value);
	}
	/**
	 * 	Update Page2IssFinCrAmt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2IssFinCrAmtString(char[] value) throws CFException {
		 setPage2IssFinCrAmt(value);
	}
	/**
	 *	Returns the value of page2IssAdjDbCnt
	 *	@return page2IssAdjDbCnt
	 */
	public int getPage2IssAdjDbCnt() throws CFException {
       if (isPage2IssAdjDbCntModified()) { 
           page2IssAdjDbCnt = refreshPage2IssAdjDbCnt();
        }
   		return page2IssAdjDbCnt;
	}
	

    /**
	 *	Returns the String value of page2IssAdjDbCnt
	 *	@return page2IssAdjDbCnt
	 */
	public char[]  getPage2IssAdjDbCntActualString() {
	    String value = String.valueOf(page2IssAdjDbCnt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2IssAdjDbCnt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ISS-ADJ-DB-CNT
	 *	@param number
	 */
	public void setPage2IssAdjDbCnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2IssAdjDbCnt = checkPage2IssAdjDbCntMaxLimit(number); 
		serializePage2IssAdjDbCnt(page2IssAdjDbCnt);
	}
	

	public void setPage2IssAdjDbCnt(long number) {
	    number = checkPage2IssAdjDbCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPage2IssAdjDbCnt((int)number);
	}
	
	/**
	 * 	Update Page2IssAdjDbCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2IssAdjDbCnt(char[] value) throws CFException {
		 page2IssAdjDbCnt = serializePage2IssAdjDbCnt(value);
	}
	/**
	 * 	Update Page2IssAdjDbCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2IssAdjDbCntString(char[] value) throws CFException {
		 setPage2IssAdjDbCnt(value);
	}
	/**
	 *	Returns the value of page2IssAdjDbAmt
	 *	@return page2IssAdjDbAmt
	 */
	public long getPage2IssAdjDbAmt() throws CFException {
       if (isPage2IssAdjDbAmtModified()) { 
           page2IssAdjDbAmt = refreshPage2IssAdjDbAmt();
        }
   		return page2IssAdjDbAmt;
	}
	

    /**
	 *	Returns the String value of page2IssAdjDbAmt
	 *	@return page2IssAdjDbAmt
	 */
	public char[]  getPage2IssAdjDbAmtActualString() {
	    String value = String.valueOf(page2IssAdjDbAmt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2IssAdjDbAmt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ISS-ADJ-DB-AMT
	 *	@param number
	 */
	public void setPage2IssAdjDbAmt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2IssAdjDbAmt = checkPage2IssAdjDbAmtMaxLimit(number); 
		serializePage2IssAdjDbAmt(page2IssAdjDbAmt);
	}
	

	/**
	 * 	Update Page2IssAdjDbAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2IssAdjDbAmt(char[] value) throws CFException {
		 page2IssAdjDbAmt = serializePage2IssAdjDbAmt(value);
	}
	/**
	 * 	Update Page2IssAdjDbAmt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2IssAdjDbAmtString(char[] value) throws CFException {
		 setPage2IssAdjDbAmt(value);
	}
	/**
	 *	Returns the value of page2IssAdjCrCnt
	 *	@return page2IssAdjCrCnt
	 */
	public int getPage2IssAdjCrCnt() throws CFException {
       if (isPage2IssAdjCrCntModified()) { 
           page2IssAdjCrCnt = refreshPage2IssAdjCrCnt();
        }
   		return page2IssAdjCrCnt;
	}
	

    /**
	 *	Returns the String value of page2IssAdjCrCnt
	 *	@return page2IssAdjCrCnt
	 */
	public char[]  getPage2IssAdjCrCntActualString() {
	    String value = String.valueOf(page2IssAdjCrCnt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2IssAdjCrCnt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ISS-ADJ-CR-CNT
	 *	@param number
	 */
	public void setPage2IssAdjCrCnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2IssAdjCrCnt = checkPage2IssAdjCrCntMaxLimit(number); 
		serializePage2IssAdjCrCnt(page2IssAdjCrCnt);
	}
	

	public void setPage2IssAdjCrCnt(long number) {
	    number = checkPage2IssAdjCrCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPage2IssAdjCrCnt((int)number);
	}
	
	/**
	 * 	Update Page2IssAdjCrCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2IssAdjCrCnt(char[] value) throws CFException {
		 page2IssAdjCrCnt = serializePage2IssAdjCrCnt(value);
	}
	/**
	 * 	Update Page2IssAdjCrCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2IssAdjCrCntString(char[] value) throws CFException {
		 setPage2IssAdjCrCnt(value);
	}
	/**
	 *	Returns the value of page2IssAdjCrAmt
	 *	@return page2IssAdjCrAmt
	 */
	public long getPage2IssAdjCrAmt() throws CFException {
       if (isPage2IssAdjCrAmtModified()) { 
           page2IssAdjCrAmt = refreshPage2IssAdjCrAmt();
        }
   		return page2IssAdjCrAmt;
	}
	

    /**
	 *	Returns the String value of page2IssAdjCrAmt
	 *	@return page2IssAdjCrAmt
	 */
	public char[]  getPage2IssAdjCrAmtActualString() {
	    String value = String.valueOf(page2IssAdjCrAmt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2IssAdjCrAmt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ISS-ADJ-CR-AMT
	 *	@param number
	 */
	public void setPage2IssAdjCrAmt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2IssAdjCrAmt = checkPage2IssAdjCrAmtMaxLimit(number); 
		serializePage2IssAdjCrAmt(page2IssAdjCrAmt);
	}
	

	/**
	 * 	Update Page2IssAdjCrAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2IssAdjCrAmt(char[] value) throws CFException {
		 page2IssAdjCrAmt = serializePage2IssAdjCrAmt(value);
	}
	/**
	 * 	Update Page2IssAdjCrAmt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2IssAdjCrAmtString(char[] value) throws CFException {
		 setPage2IssAdjCrAmt(value);
	}
	/**
	 *	Returns the value of page2IssA15ApdDbCnt
	 *	@return page2IssA15ApdDbCnt
	 */
	public int getPage2IssA15ApdDbCnt() throws CFException {
       if (isPage2IssA15ApdDbCntModified()) { 
           page2IssA15ApdDbCnt = refreshPage2IssA15ApdDbCnt();
        }
   		return page2IssA15ApdDbCnt;
	}
	

    /**
	 *	Returns the String value of page2IssA15ApdDbCnt
	 *	@return page2IssA15ApdDbCnt
	 */
	public char[]  getPage2IssA15ApdDbCntActualString() {
	    String value = String.valueOf(page2IssA15ApdDbCnt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2IssA15ApdDbCnt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ISS-A15-APD-DB-CNT
	 *	@param number
	 */
	public void setPage2IssA15ApdDbCnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2IssA15ApdDbCnt = checkPage2IssA15ApdDbCntMaxLimit(number); 
		serializePage2IssA15ApdDbCnt(page2IssA15ApdDbCnt);
	}
	

	public void setPage2IssA15ApdDbCnt(long number) {
	    number = checkPage2IssA15ApdDbCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPage2IssA15ApdDbCnt((int)number);
	}
	
	/**
	 * 	Update Page2IssA15ApdDbCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2IssA15ApdDbCnt(char[] value) throws CFException {
		 page2IssA15ApdDbCnt = serializePage2IssA15ApdDbCnt(value);
	}
	/**
	 * 	Update Page2IssA15ApdDbCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2IssA15ApdDbCntString(char[] value) throws CFException {
		 setPage2IssA15ApdDbCnt(value);
	}
	/**
	 *	Returns the value of page2IssA15ApdCrCnt
	 *	@return page2IssA15ApdCrCnt
	 */
	public int getPage2IssA15ApdCrCnt() throws CFException {
       if (isPage2IssA15ApdCrCntModified()) { 
           page2IssA15ApdCrCnt = refreshPage2IssA15ApdCrCnt();
        }
   		return page2IssA15ApdCrCnt;
	}
	

    /**
	 *	Returns the String value of page2IssA15ApdCrCnt
	 *	@return page2IssA15ApdCrCnt
	 */
	public char[]  getPage2IssA15ApdCrCntActualString() {
	    String value = String.valueOf(page2IssA15ApdCrCnt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2IssA15ApdCrCnt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ISS-A15-APD-CR-CNT
	 *	@param number
	 */
	public void setPage2IssA15ApdCrCnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2IssA15ApdCrCnt = checkPage2IssA15ApdCrCntMaxLimit(number); 
		serializePage2IssA15ApdCrCnt(page2IssA15ApdCrCnt);
	}
	

	public void setPage2IssA15ApdCrCnt(long number) {
	    number = checkPage2IssA15ApdCrCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPage2IssA15ApdCrCnt((int)number);
	}
	
	/**
	 * 	Update Page2IssA15ApdCrCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2IssA15ApdCrCnt(char[] value) throws CFException {
		 page2IssA15ApdCrCnt = serializePage2IssA15ApdCrCnt(value);
	}
	/**
	 * 	Update Page2IssA15ApdCrCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2IssA15ApdCrCntString(char[] value) throws CFException {
		 setPage2IssA15ApdCrCnt(value);
	}
	/**
	 *	Returns the value of page2IssAdj09DbCnt
	 *	@return page2IssAdj09DbCnt
	 */
	public int getPage2IssAdj09DbCnt() throws CFException {
       if (isPage2IssAdj09DbCntModified()) { 
           page2IssAdj09DbCnt = refreshPage2IssAdj09DbCnt();
        }
   		return page2IssAdj09DbCnt;
	}
	

    /**
	 *	Returns the String value of page2IssAdj09DbCnt
	 *	@return page2IssAdj09DbCnt
	 */
	public char[]  getPage2IssAdj09DbCntActualString() {
	    String value = String.valueOf(page2IssAdj09DbCnt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2IssAdj09DbCnt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ISS-ADJ09-DB-CNT
	 *	@param number
	 */
	public void setPage2IssAdj09DbCnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2IssAdj09DbCnt = checkPage2IssAdj09DbCntMaxLimit(number); 
		serializePage2IssAdj09DbCnt(page2IssAdj09DbCnt);
	}
	

	public void setPage2IssAdj09DbCnt(long number) {
	    number = checkPage2IssAdj09DbCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPage2IssAdj09DbCnt((int)number);
	}
	
	/**
	 * 	Update Page2IssAdj09DbCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2IssAdj09DbCnt(char[] value) throws CFException {
		 page2IssAdj09DbCnt = serializePage2IssAdj09DbCnt(value);
	}
	/**
	 * 	Update Page2IssAdj09DbCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2IssAdj09DbCntString(char[] value) throws CFException {
		 setPage2IssAdj09DbCnt(value);
	}
	/**
	 *	Returns the value of page2IssAdj09DbAmt
	 *	@return page2IssAdj09DbAmt
	 */
	public long getPage2IssAdj09DbAmt() throws CFException {
       if (isPage2IssAdj09DbAmtModified()) { 
           page2IssAdj09DbAmt = refreshPage2IssAdj09DbAmt();
        }
   		return page2IssAdj09DbAmt;
	}
	

    /**
	 *	Returns the String value of page2IssAdj09DbAmt
	 *	@return page2IssAdj09DbAmt
	 */
	public char[]  getPage2IssAdj09DbAmtActualString() {
	    String value = String.valueOf(page2IssAdj09DbAmt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2IssAdj09DbAmt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ISS-ADJ09-DB-AMT
	 *	@param number
	 */
	public void setPage2IssAdj09DbAmt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2IssAdj09DbAmt = checkPage2IssAdj09DbAmtMaxLimit(number); 
		serializePage2IssAdj09DbAmt(page2IssAdj09DbAmt);
	}
	

	/**
	 * 	Update Page2IssAdj09DbAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2IssAdj09DbAmt(char[] value) throws CFException {
		 page2IssAdj09DbAmt = serializePage2IssAdj09DbAmt(value);
	}
	/**
	 * 	Update Page2IssAdj09DbAmt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2IssAdj09DbAmtString(char[] value) throws CFException {
		 setPage2IssAdj09DbAmt(value);
	}
	/**
	 *	Returns the value of page2IssAdj09CrCnt
	 *	@return page2IssAdj09CrCnt
	 */
	public int getPage2IssAdj09CrCnt() throws CFException {
       if (isPage2IssAdj09CrCntModified()) { 
           page2IssAdj09CrCnt = refreshPage2IssAdj09CrCnt();
        }
   		return page2IssAdj09CrCnt;
	}
	

    /**
	 *	Returns the String value of page2IssAdj09CrCnt
	 *	@return page2IssAdj09CrCnt
	 */
	public char[]  getPage2IssAdj09CrCntActualString() {
	    String value = String.valueOf(page2IssAdj09CrCnt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2IssAdj09CrCnt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ISS-ADJ09-CR-CNT
	 *	@param number
	 */
	public void setPage2IssAdj09CrCnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2IssAdj09CrCnt = checkPage2IssAdj09CrCntMaxLimit(number); 
		serializePage2IssAdj09CrCnt(page2IssAdj09CrCnt);
	}
	

	public void setPage2IssAdj09CrCnt(long number) {
	    number = checkPage2IssAdj09CrCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPage2IssAdj09CrCnt((int)number);
	}
	
	/**
	 * 	Update Page2IssAdj09CrCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2IssAdj09CrCnt(char[] value) throws CFException {
		 page2IssAdj09CrCnt = serializePage2IssAdj09CrCnt(value);
	}
	/**
	 * 	Update Page2IssAdj09CrCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2IssAdj09CrCntString(char[] value) throws CFException {
		 setPage2IssAdj09CrCnt(value);
	}
	/**
	 *	Returns the value of page2IssAdj09CrAmt
	 *	@return page2IssAdj09CrAmt
	 */
	public long getPage2IssAdj09CrAmt() throws CFException {
       if (isPage2IssAdj09CrAmtModified()) { 
           page2IssAdj09CrAmt = refreshPage2IssAdj09CrAmt();
        }
   		return page2IssAdj09CrAmt;
	}
	

    /**
	 *	Returns the String value of page2IssAdj09CrAmt
	 *	@return page2IssAdj09CrAmt
	 */
	public char[]  getPage2IssAdj09CrAmtActualString() {
	    String value = String.valueOf(page2IssAdj09CrAmt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2IssAdj09CrAmt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ISS-ADJ09-CR-AMT
	 *	@param number
	 */
	public void setPage2IssAdj09CrAmt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2IssAdj09CrAmt = checkPage2IssAdj09CrAmtMaxLimit(number); 
		serializePage2IssAdj09CrAmt(page2IssAdj09CrAmt);
	}
	

	/**
	 * 	Update Page2IssAdj09CrAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2IssAdj09CrAmt(char[] value) throws CFException {
		 page2IssAdj09CrAmt = serializePage2IssAdj09CrAmt(value);
	}
	/**
	 * 	Update Page2IssAdj09CrAmt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2IssAdj09CrAmtString(char[] value) throws CFException {
		 setPage2IssAdj09CrAmt(value);
	}
	/**
	 *	Returns the value of page2IssFeeDbAmt
	 *	@return page2IssFeeDbAmt
	 */
	public long getPage2IssFeeDbAmt() throws CFException {
       if (isPage2IssFeeDbAmtModified()) { 
           page2IssFeeDbAmt = refreshPage2IssFeeDbAmt();
        }
   		return page2IssFeeDbAmt;
	}
	

    /**
	 *	Returns the String value of page2IssFeeDbAmt
	 *	@return page2IssFeeDbAmt
	 */
	public char[]  getPage2IssFeeDbAmtActualString() {
	    String value = String.valueOf(page2IssFeeDbAmt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2IssFeeDbAmt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ISS-FEE-DB-AMT
	 *	@param number
	 */
	public void setPage2IssFeeDbAmt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2IssFeeDbAmt = checkPage2IssFeeDbAmtMaxLimit(number); 
		serializePage2IssFeeDbAmt(page2IssFeeDbAmt);
	}
	

	/**
	 * 	Update Page2IssFeeDbAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2IssFeeDbAmt(char[] value) throws CFException {
		 page2IssFeeDbAmt = serializePage2IssFeeDbAmt(value);
	}
	/**
	 * 	Update Page2IssFeeDbAmt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2IssFeeDbAmtString(char[] value) throws CFException {
		 setPage2IssFeeDbAmt(value);
	}
	/**
	 *	Returns the value of page2IssFeeCrAmt
	 *	@return page2IssFeeCrAmt
	 */
	public long getPage2IssFeeCrAmt() throws CFException {
       if (isPage2IssFeeCrAmtModified()) { 
           page2IssFeeCrAmt = refreshPage2IssFeeCrAmt();
        }
   		return page2IssFeeCrAmt;
	}
	

    /**
	 *	Returns the String value of page2IssFeeCrAmt
	 *	@return page2IssFeeCrAmt
	 */
	public char[]  getPage2IssFeeCrAmtActualString() {
	    String value = String.valueOf(page2IssFeeCrAmt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2IssFeeCrAmt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ISS-FEE-CR-AMT
	 *	@param number
	 */
	public void setPage2IssFeeCrAmt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2IssFeeCrAmt = checkPage2IssFeeCrAmtMaxLimit(number); 
		serializePage2IssFeeCrAmt(page2IssFeeCrAmt);
	}
	

	/**
	 * 	Update Page2IssFeeCrAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2IssFeeCrAmt(char[] value) throws CFException {
		 page2IssFeeCrAmt = serializePage2IssFeeCrAmt(value);
	}
	/**
	 * 	Update Page2IssFeeCrAmt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2IssFeeCrAmtString(char[] value) throws CFException {
		 setPage2IssFeeCrAmt(value);
	}
	/**
	 *	Returns the value of page2IssAtmDbCnt
	 *	@return page2IssAtmDbCnt
	 */
	public int getPage2IssAtmDbCnt() throws CFException {
       if (isPage2IssAtmDbCntModified()) { 
           page2IssAtmDbCnt = refreshPage2IssAtmDbCnt();
        }
   		return page2IssAtmDbCnt;
	}
	

    /**
	 *	Returns the String value of page2IssAtmDbCnt
	 *	@return page2IssAtmDbCnt
	 */
	public char[]  getPage2IssAtmDbCntActualString() {
	    String value = String.valueOf(page2IssAtmDbCnt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2IssAtmDbCnt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ISS-ATM-DB-CNT
	 *	@param number
	 */
	public void setPage2IssAtmDbCnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2IssAtmDbCnt = checkPage2IssAtmDbCntMaxLimit(number); 
		serializePage2IssAtmDbCnt(page2IssAtmDbCnt);
	}
	

	public void setPage2IssAtmDbCnt(long number) {
	    number = checkPage2IssAtmDbCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPage2IssAtmDbCnt((int)number);
	}
	
	/**
	 * 	Update Page2IssAtmDbCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2IssAtmDbCnt(char[] value) throws CFException {
		 page2IssAtmDbCnt = serializePage2IssAtmDbCnt(value);
	}
	/**
	 * 	Update Page2IssAtmDbCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2IssAtmDbCntString(char[] value) throws CFException {
		 setPage2IssAtmDbCnt(value);
	}
	/**
	 *	Returns the value of page2IssAtmDbAmt
	 *	@return page2IssAtmDbAmt
	 */
	public long getPage2IssAtmDbAmt() throws CFException {
       if (isPage2IssAtmDbAmtModified()) { 
           page2IssAtmDbAmt = refreshPage2IssAtmDbAmt();
        }
   		return page2IssAtmDbAmt;
	}
	

    /**
	 *	Returns the String value of page2IssAtmDbAmt
	 *	@return page2IssAtmDbAmt
	 */
	public char[]  getPage2IssAtmDbAmtActualString() {
	    String value = String.valueOf(page2IssAtmDbAmt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2IssAtmDbAmt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ISS-ATM-DB-AMT
	 *	@param number
	 */
	public void setPage2IssAtmDbAmt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2IssAtmDbAmt = checkPage2IssAtmDbAmtMaxLimit(number); 
		serializePage2IssAtmDbAmt(page2IssAtmDbAmt);
	}
	

	/**
	 * 	Update Page2IssAtmDbAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2IssAtmDbAmt(char[] value) throws CFException {
		 page2IssAtmDbAmt = serializePage2IssAtmDbAmt(value);
	}
	/**
	 * 	Update Page2IssAtmDbAmt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2IssAtmDbAmtString(char[] value) throws CFException {
		 setPage2IssAtmDbAmt(value);
	}
	/**
	 *	Returns the value of page2IssAtmCrCnt
	 *	@return page2IssAtmCrCnt
	 */
	public int getPage2IssAtmCrCnt() throws CFException {
       if (isPage2IssAtmCrCntModified()) { 
           page2IssAtmCrCnt = refreshPage2IssAtmCrCnt();
        }
   		return page2IssAtmCrCnt;
	}
	

    /**
	 *	Returns the String value of page2IssAtmCrCnt
	 *	@return page2IssAtmCrCnt
	 */
	public char[]  getPage2IssAtmCrCntActualString() {
	    String value = String.valueOf(page2IssAtmCrCnt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2IssAtmCrCnt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ISS-ATM-CR-CNT
	 *	@param number
	 */
	public void setPage2IssAtmCrCnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2IssAtmCrCnt = checkPage2IssAtmCrCntMaxLimit(number); 
		serializePage2IssAtmCrCnt(page2IssAtmCrCnt);
	}
	

	public void setPage2IssAtmCrCnt(long number) {
	    number = checkPage2IssAtmCrCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPage2IssAtmCrCnt((int)number);
	}
	
	/**
	 * 	Update Page2IssAtmCrCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2IssAtmCrCnt(char[] value) throws CFException {
		 page2IssAtmCrCnt = serializePage2IssAtmCrCnt(value);
	}
	/**
	 * 	Update Page2IssAtmCrCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2IssAtmCrCntString(char[] value) throws CFException {
		 setPage2IssAtmCrCnt(value);
	}
	/**
	 *	Returns the value of page2IssAtmCrAmt
	 *	@return page2IssAtmCrAmt
	 */
	public long getPage2IssAtmCrAmt() throws CFException {
       if (isPage2IssAtmCrAmtModified()) { 
           page2IssAtmCrAmt = refreshPage2IssAtmCrAmt();
        }
   		return page2IssAtmCrAmt;
	}
	

    /**
	 *	Returns the String value of page2IssAtmCrAmt
	 *	@return page2IssAtmCrAmt
	 */
	public char[]  getPage2IssAtmCrAmtActualString() {
	    String value = String.valueOf(page2IssAtmCrAmt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2IssAtmCrAmt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ISS-ATM-CR-AMT
	 *	@param number
	 */
	public void setPage2IssAtmCrAmt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2IssAtmCrAmt = checkPage2IssAtmCrAmtMaxLimit(number); 
		serializePage2IssAtmCrAmt(page2IssAtmCrAmt);
	}
	

	/**
	 * 	Update Page2IssAtmCrAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2IssAtmCrAmt(char[] value) throws CFException {
		 page2IssAtmCrAmt = serializePage2IssAtmCrAmt(value);
	}
	/**
	 * 	Update Page2IssAtmCrAmt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2IssAtmCrAmtString(char[] value) throws CFException {
		 setPage2IssAtmCrAmt(value);
	}
	/**
	 *	Returns the value of page2IssPosDbCnt
	 *	@return page2IssPosDbCnt
	 */
	public int getPage2IssPosDbCnt() throws CFException {
       if (isPage2IssPosDbCntModified()) { 
           page2IssPosDbCnt = refreshPage2IssPosDbCnt();
        }
   		return page2IssPosDbCnt;
	}
	

    /**
	 *	Returns the String value of page2IssPosDbCnt
	 *	@return page2IssPosDbCnt
	 */
	public char[]  getPage2IssPosDbCntActualString() {
	    String value = String.valueOf(page2IssPosDbCnt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2IssPosDbCnt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ISS-POS-DB-CNT
	 *	@param number
	 */
	public void setPage2IssPosDbCnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2IssPosDbCnt = checkPage2IssPosDbCntMaxLimit(number); 
		serializePage2IssPosDbCnt(page2IssPosDbCnt);
	}
	

	public void setPage2IssPosDbCnt(long number) {
	    number = checkPage2IssPosDbCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPage2IssPosDbCnt((int)number);
	}
	
	/**
	 * 	Update Page2IssPosDbCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2IssPosDbCnt(char[] value) throws CFException {
		 page2IssPosDbCnt = serializePage2IssPosDbCnt(value);
	}
	/**
	 * 	Update Page2IssPosDbCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2IssPosDbCntString(char[] value) throws CFException {
		 setPage2IssPosDbCnt(value);
	}
	/**
	 *	Returns the value of page2IssPosDbAmt
	 *	@return page2IssPosDbAmt
	 */
	public long getPage2IssPosDbAmt() throws CFException {
       if (isPage2IssPosDbAmtModified()) { 
           page2IssPosDbAmt = refreshPage2IssPosDbAmt();
        }
   		return page2IssPosDbAmt;
	}
	

    /**
	 *	Returns the String value of page2IssPosDbAmt
	 *	@return page2IssPosDbAmt
	 */
	public char[]  getPage2IssPosDbAmtActualString() {
	    String value = String.valueOf(page2IssPosDbAmt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2IssPosDbAmt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ISS-POS-DB-AMT
	 *	@param number
	 */
	public void setPage2IssPosDbAmt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2IssPosDbAmt = checkPage2IssPosDbAmtMaxLimit(number); 
		serializePage2IssPosDbAmt(page2IssPosDbAmt);
	}
	

	/**
	 * 	Update Page2IssPosDbAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2IssPosDbAmt(char[] value) throws CFException {
		 page2IssPosDbAmt = serializePage2IssPosDbAmt(value);
	}
	/**
	 * 	Update Page2IssPosDbAmt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2IssPosDbAmtString(char[] value) throws CFException {
		 setPage2IssPosDbAmt(value);
	}
	/**
	 *	Returns the value of page2IssPosCrCnt
	 *	@return page2IssPosCrCnt
	 */
	public int getPage2IssPosCrCnt() throws CFException {
       if (isPage2IssPosCrCntModified()) { 
           page2IssPosCrCnt = refreshPage2IssPosCrCnt();
        }
   		return page2IssPosCrCnt;
	}
	

    /**
	 *	Returns the String value of page2IssPosCrCnt
	 *	@return page2IssPosCrCnt
	 */
	public char[]  getPage2IssPosCrCntActualString() {
	    String value = String.valueOf(page2IssPosCrCnt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2IssPosCrCnt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ISS-POS-CR-CNT
	 *	@param number
	 */
	public void setPage2IssPosCrCnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2IssPosCrCnt = checkPage2IssPosCrCntMaxLimit(number); 
		serializePage2IssPosCrCnt(page2IssPosCrCnt);
	}
	

	public void setPage2IssPosCrCnt(long number) {
	    number = checkPage2IssPosCrCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPage2IssPosCrCnt((int)number);
	}
	
	/**
	 * 	Update Page2IssPosCrCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2IssPosCrCnt(char[] value) throws CFException {
		 page2IssPosCrCnt = serializePage2IssPosCrCnt(value);
	}
	/**
	 * 	Update Page2IssPosCrCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2IssPosCrCntString(char[] value) throws CFException {
		 setPage2IssPosCrCnt(value);
	}
	/**
	 *	Returns the value of page2IssPosCrAmt
	 *	@return page2IssPosCrAmt
	 */
	public long getPage2IssPosCrAmt() throws CFException {
       if (isPage2IssPosCrAmtModified()) { 
           page2IssPosCrAmt = refreshPage2IssPosCrAmt();
        }
   		return page2IssPosCrAmt;
	}
	

    /**
	 *	Returns the String value of page2IssPosCrAmt
	 *	@return page2IssPosCrAmt
	 */
	public char[]  getPage2IssPosCrAmtActualString() {
	    String value = String.valueOf(page2IssPosCrAmt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2IssPosCrAmt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ISS-POS-CR-AMT
	 *	@param number
	 */
	public void setPage2IssPosCrAmt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2IssPosCrAmt = checkPage2IssPosCrAmtMaxLimit(number); 
		serializePage2IssPosCrAmt(page2IssPosCrAmt);
	}
	

	/**
	 * 	Update Page2IssPosCrAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2IssPosCrAmt(char[] value) throws CFException {
		 page2IssPosCrAmt = serializePage2IssPosCrAmt(value);
	}
	/**
	 * 	Update Page2IssPosCrAmt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2IssPosCrAmtString(char[] value) throws CFException {
		 setPage2IssPosCrAmt(value);
	}
	/**
	 *	Returns the value of page2IssAtmDbRevCnt
	 *	@return page2IssAtmDbRevCnt
	 */
	public int getPage2IssAtmDbRevCnt() throws CFException {
       if (isPage2IssAtmDbRevCntModified()) { 
           page2IssAtmDbRevCnt = refreshPage2IssAtmDbRevCnt();
        }
   		return page2IssAtmDbRevCnt;
	}
	

    /**
	 *	Returns the String value of page2IssAtmDbRevCnt
	 *	@return page2IssAtmDbRevCnt
	 */
	public char[]  getPage2IssAtmDbRevCntActualString() {
	    String value = String.valueOf(page2IssAtmDbRevCnt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2IssAtmDbRevCnt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ISS-ATM-DB-REV-CNT
	 *	@param number
	 */
	public void setPage2IssAtmDbRevCnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2IssAtmDbRevCnt = checkPage2IssAtmDbRevCntMaxLimit(number); 
		serializePage2IssAtmDbRevCnt(page2IssAtmDbRevCnt);
	}
	

	public void setPage2IssAtmDbRevCnt(long number) {
	    number = checkPage2IssAtmDbRevCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPage2IssAtmDbRevCnt((int)number);
	}
	
	/**
	 * 	Update Page2IssAtmDbRevCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2IssAtmDbRevCnt(char[] value) throws CFException {
		 page2IssAtmDbRevCnt = serializePage2IssAtmDbRevCnt(value);
	}
	/**
	 * 	Update Page2IssAtmDbRevCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2IssAtmDbRevCntString(char[] value) throws CFException {
		 setPage2IssAtmDbRevCnt(value);
	}
	/**
	 *	Returns the value of page2IssAtmDbRevAmt
	 *	@return page2IssAtmDbRevAmt
	 */
	public long getPage2IssAtmDbRevAmt() throws CFException {
       if (isPage2IssAtmDbRevAmtModified()) { 
           page2IssAtmDbRevAmt = refreshPage2IssAtmDbRevAmt();
        }
   		return page2IssAtmDbRevAmt;
	}
	

    /**
	 *	Returns the String value of page2IssAtmDbRevAmt
	 *	@return page2IssAtmDbRevAmt
	 */
	public char[]  getPage2IssAtmDbRevAmtActualString() {
	    String value = String.valueOf(page2IssAtmDbRevAmt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2IssAtmDbRevAmt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ISS-ATM-DB-REV-AMT
	 *	@param number
	 */
	public void setPage2IssAtmDbRevAmt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2IssAtmDbRevAmt = checkPage2IssAtmDbRevAmtMaxLimit(number); 
		serializePage2IssAtmDbRevAmt(page2IssAtmDbRevAmt);
	}
	

	/**
	 * 	Update Page2IssAtmDbRevAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2IssAtmDbRevAmt(char[] value) throws CFException {
		 page2IssAtmDbRevAmt = serializePage2IssAtmDbRevAmt(value);
	}
	/**
	 * 	Update Page2IssAtmDbRevAmt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2IssAtmDbRevAmtString(char[] value) throws CFException {
		 setPage2IssAtmDbRevAmt(value);
	}
	/**
	 *	Returns the value of page2IssAtmCrRevCnt
	 *	@return page2IssAtmCrRevCnt
	 */
	public int getPage2IssAtmCrRevCnt() throws CFException {
       if (isPage2IssAtmCrRevCntModified()) { 
           page2IssAtmCrRevCnt = refreshPage2IssAtmCrRevCnt();
        }
   		return page2IssAtmCrRevCnt;
	}
	

    /**
	 *	Returns the String value of page2IssAtmCrRevCnt
	 *	@return page2IssAtmCrRevCnt
	 */
	public char[]  getPage2IssAtmCrRevCntActualString() {
	    String value = String.valueOf(page2IssAtmCrRevCnt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2IssAtmCrRevCnt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ISS-ATM-CR-REV-CNT
	 *	@param number
	 */
	public void setPage2IssAtmCrRevCnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2IssAtmCrRevCnt = checkPage2IssAtmCrRevCntMaxLimit(number); 
		serializePage2IssAtmCrRevCnt(page2IssAtmCrRevCnt);
	}
	

	public void setPage2IssAtmCrRevCnt(long number) {
	    number = checkPage2IssAtmCrRevCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPage2IssAtmCrRevCnt((int)number);
	}
	
	/**
	 * 	Update Page2IssAtmCrRevCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2IssAtmCrRevCnt(char[] value) throws CFException {
		 page2IssAtmCrRevCnt = serializePage2IssAtmCrRevCnt(value);
	}
	/**
	 * 	Update Page2IssAtmCrRevCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2IssAtmCrRevCntString(char[] value) throws CFException {
		 setPage2IssAtmCrRevCnt(value);
	}
	/**
	 *	Returns the value of page2IssAtmCrRevAmt
	 *	@return page2IssAtmCrRevAmt
	 */
	public long getPage2IssAtmCrRevAmt() throws CFException {
       if (isPage2IssAtmCrRevAmtModified()) { 
           page2IssAtmCrRevAmt = refreshPage2IssAtmCrRevAmt();
        }
   		return page2IssAtmCrRevAmt;
	}
	

    /**
	 *	Returns the String value of page2IssAtmCrRevAmt
	 *	@return page2IssAtmCrRevAmt
	 */
	public char[]  getPage2IssAtmCrRevAmtActualString() {
	    String value = String.valueOf(page2IssAtmCrRevAmt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2IssAtmCrRevAmt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ISS-ATM-CR-REV-AMT
	 *	@param number
	 */
	public void setPage2IssAtmCrRevAmt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2IssAtmCrRevAmt = checkPage2IssAtmCrRevAmtMaxLimit(number); 
		serializePage2IssAtmCrRevAmt(page2IssAtmCrRevAmt);
	}
	

	/**
	 * 	Update Page2IssAtmCrRevAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2IssAtmCrRevAmt(char[] value) throws CFException {
		 page2IssAtmCrRevAmt = serializePage2IssAtmCrRevAmt(value);
	}
	/**
	 * 	Update Page2IssAtmCrRevAmt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2IssAtmCrRevAmtString(char[] value) throws CFException {
		 setPage2IssAtmCrRevAmt(value);
	}
	/**
	 *	Returns the value of page2IssPosDbRevCnt
	 *	@return page2IssPosDbRevCnt
	 */
	public int getPage2IssPosDbRevCnt() throws CFException {
       if (isPage2IssPosDbRevCntModified()) { 
           page2IssPosDbRevCnt = refreshPage2IssPosDbRevCnt();
        }
   		return page2IssPosDbRevCnt;
	}
	

    /**
	 *	Returns the String value of page2IssPosDbRevCnt
	 *	@return page2IssPosDbRevCnt
	 */
	public char[]  getPage2IssPosDbRevCntActualString() {
	    String value = String.valueOf(page2IssPosDbRevCnt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2IssPosDbRevCnt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ISS-POS-DB-REV-CNT
	 *	@param number
	 */
	public void setPage2IssPosDbRevCnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2IssPosDbRevCnt = checkPage2IssPosDbRevCntMaxLimit(number); 
		serializePage2IssPosDbRevCnt(page2IssPosDbRevCnt);
	}
	

	public void setPage2IssPosDbRevCnt(long number) {
	    number = checkPage2IssPosDbRevCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPage2IssPosDbRevCnt((int)number);
	}
	
	/**
	 * 	Update Page2IssPosDbRevCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2IssPosDbRevCnt(char[] value) throws CFException {
		 page2IssPosDbRevCnt = serializePage2IssPosDbRevCnt(value);
	}
	/**
	 * 	Update Page2IssPosDbRevCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2IssPosDbRevCntString(char[] value) throws CFException {
		 setPage2IssPosDbRevCnt(value);
	}
	/**
	 *	Returns the value of page2IssPosDbRevAmt
	 *	@return page2IssPosDbRevAmt
	 */
	public long getPage2IssPosDbRevAmt() throws CFException {
       if (isPage2IssPosDbRevAmtModified()) { 
           page2IssPosDbRevAmt = refreshPage2IssPosDbRevAmt();
        }
   		return page2IssPosDbRevAmt;
	}
	

    /**
	 *	Returns the String value of page2IssPosDbRevAmt
	 *	@return page2IssPosDbRevAmt
	 */
	public char[]  getPage2IssPosDbRevAmtActualString() {
	    String value = String.valueOf(page2IssPosDbRevAmt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2IssPosDbRevAmt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ISS-POS-DB-REV-AMT
	 *	@param number
	 */
	public void setPage2IssPosDbRevAmt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2IssPosDbRevAmt = checkPage2IssPosDbRevAmtMaxLimit(number); 
		serializePage2IssPosDbRevAmt(page2IssPosDbRevAmt);
	}
	

	/**
	 * 	Update Page2IssPosDbRevAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2IssPosDbRevAmt(char[] value) throws CFException {
		 page2IssPosDbRevAmt = serializePage2IssPosDbRevAmt(value);
	}
	/**
	 * 	Update Page2IssPosDbRevAmt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2IssPosDbRevAmtString(char[] value) throws CFException {
		 setPage2IssPosDbRevAmt(value);
	}
	/**
	 *	Returns the value of page2IssPosCrRevCnt
	 *	@return page2IssPosCrRevCnt
	 */
	public int getPage2IssPosCrRevCnt() throws CFException {
       if (isPage2IssPosCrRevCntModified()) { 
           page2IssPosCrRevCnt = refreshPage2IssPosCrRevCnt();
        }
   		return page2IssPosCrRevCnt;
	}
	

    /**
	 *	Returns the String value of page2IssPosCrRevCnt
	 *	@return page2IssPosCrRevCnt
	 */
	public char[]  getPage2IssPosCrRevCntActualString() {
	    String value = String.valueOf(page2IssPosCrRevCnt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2IssPosCrRevCnt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ISS-POS-CR-REV-CNT
	 *	@param number
	 */
	public void setPage2IssPosCrRevCnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2IssPosCrRevCnt = checkPage2IssPosCrRevCntMaxLimit(number); 
		serializePage2IssPosCrRevCnt(page2IssPosCrRevCnt);
	}
	

	public void setPage2IssPosCrRevCnt(long number) {
	    number = checkPage2IssPosCrRevCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPage2IssPosCrRevCnt((int)number);
	}
	
	/**
	 * 	Update Page2IssPosCrRevCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2IssPosCrRevCnt(char[] value) throws CFException {
		 page2IssPosCrRevCnt = serializePage2IssPosCrRevCnt(value);
	}
	/**
	 * 	Update Page2IssPosCrRevCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2IssPosCrRevCntString(char[] value) throws CFException {
		 setPage2IssPosCrRevCnt(value);
	}
	/**
	 *	Returns the value of page2IssPosCrRevAmt
	 *	@return page2IssPosCrRevAmt
	 */
	public long getPage2IssPosCrRevAmt() throws CFException {
       if (isPage2IssPosCrRevAmtModified()) { 
           page2IssPosCrRevAmt = refreshPage2IssPosCrRevAmt();
        }
   		return page2IssPosCrRevAmt;
	}
	

    /**
	 *	Returns the String value of page2IssPosCrRevAmt
	 *	@return page2IssPosCrRevAmt
	 */
	public char[]  getPage2IssPosCrRevAmtActualString() {
	    String value = String.valueOf(page2IssPosCrRevAmt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2IssPosCrRevAmt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ISS-POS-CR-REV-AMT
	 *	@param number
	 */
	public void setPage2IssPosCrRevAmt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2IssPosCrRevAmt = checkPage2IssPosCrRevAmtMaxLimit(number); 
		serializePage2IssPosCrRevAmt(page2IssPosCrRevAmt);
	}
	

	/**
	 * 	Update Page2IssPosCrRevAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2IssPosCrRevAmt(char[] value) throws CFException {
		 page2IssPosCrRevAmt = serializePage2IssPosCrRevAmt(value);
	}
	/**
	 * 	Update Page2IssPosCrRevAmt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2IssPosCrRevAmtString(char[] value) throws CFException {
		 setPage2IssPosCrRevAmt(value);
	}
	/**
	 *	Returns the value of page2IssCcaDbAmt
	 *	@return page2IssCcaDbAmt
	 */
	public long getPage2IssCcaDbAmt() throws CFException {
       if (isPage2IssCcaDbAmtModified()) { 
           page2IssCcaDbAmt = refreshPage2IssCcaDbAmt();
        }
   		return page2IssCcaDbAmt;
	}
	

    /**
	 *	Returns the String value of page2IssCcaDbAmt
	 *	@return page2IssCcaDbAmt
	 */
	public char[]  getPage2IssCcaDbAmtActualString() {
	    String value = String.valueOf(page2IssCcaDbAmt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2IssCcaDbAmt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ISS-CCA-DB-AMT
	 *	@param number
	 */
	public void setPage2IssCcaDbAmt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2IssCcaDbAmt = checkPage2IssCcaDbAmtMaxLimit(number); 
		serializePage2IssCcaDbAmt(page2IssCcaDbAmt);
	}
	

	/**
	 * 	Update Page2IssCcaDbAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2IssCcaDbAmt(char[] value) throws CFException {
		 page2IssCcaDbAmt = serializePage2IssCcaDbAmt(value);
	}
	/**
	 * 	Update Page2IssCcaDbAmt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2IssCcaDbAmtString(char[] value) throws CFException {
		 setPage2IssCcaDbAmt(value);
	}
	/**
	 *	Returns the value of page2IssCcaCrAmt
	 *	@return page2IssCcaCrAmt
	 */
	public long getPage2IssCcaCrAmt() throws CFException {
       if (isPage2IssCcaCrAmtModified()) { 
           page2IssCcaCrAmt = refreshPage2IssCcaCrAmt();
        }
   		return page2IssCcaCrAmt;
	}
	

    /**
	 *	Returns the String value of page2IssCcaCrAmt
	 *	@return page2IssCcaCrAmt
	 */
	public char[]  getPage2IssCcaCrAmtActualString() {
	    String value = String.valueOf(page2IssCcaCrAmt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2IssCcaCrAmt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ISS-CCA-CR-AMT
	 *	@param number
	 */
	public void setPage2IssCcaCrAmt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2IssCcaCrAmt = checkPage2IssCcaCrAmtMaxLimit(number); 
		serializePage2IssCcaCrAmt(page2IssCcaCrAmt);
	}
	

	/**
	 * 	Update Page2IssCcaCrAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2IssCcaCrAmt(char[] value) throws CFException {
		 page2IssCcaCrAmt = serializePage2IssCcaCrAmt(value);
	}
	/**
	 * 	Update Page2IssCcaCrAmt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2IssCcaCrAmtString(char[] value) throws CFException {
		 setPage2IssCcaCrAmt(value);
	}
	/**
	 *	Returns the value of page2IssIccrDbAmt
	 *	@return page2IssIccrDbAmt
	 */
	public long getPage2IssIccrDbAmt() throws CFException {
       if (isPage2IssIccrDbAmtModified()) { 
           page2IssIccrDbAmt = refreshPage2IssIccrDbAmt();
        }
   		return page2IssIccrDbAmt;
	}
	

    /**
	 *	Returns the String value of page2IssIccrDbAmt
	 *	@return page2IssIccrDbAmt
	 */
	public char[]  getPage2IssIccrDbAmtActualString() {
	    String value = String.valueOf(page2IssIccrDbAmt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2IssIccrDbAmt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ISS-ICCR-DB-AMT
	 *	@param number
	 */
	public void setPage2IssIccrDbAmt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2IssIccrDbAmt = checkPage2IssIccrDbAmtMaxLimit(number); 
		serializePage2IssIccrDbAmt(page2IssIccrDbAmt);
	}
	

	/**
	 * 	Update Page2IssIccrDbAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2IssIccrDbAmt(char[] value) throws CFException {
		 page2IssIccrDbAmt = serializePage2IssIccrDbAmt(value);
	}
	/**
	 * 	Update Page2IssIccrDbAmt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2IssIccrDbAmtString(char[] value) throws CFException {
		 setPage2IssIccrDbAmt(value);
	}
	/**
	 *	Returns the value of page2IssIccrCrAmt
	 *	@return page2IssIccrCrAmt
	 */
	public long getPage2IssIccrCrAmt() throws CFException {
       if (isPage2IssIccrCrAmtModified()) { 
           page2IssIccrCrAmt = refreshPage2IssIccrCrAmt();
        }
   		return page2IssIccrCrAmt;
	}
	

    /**
	 *	Returns the String value of page2IssIccrCrAmt
	 *	@return page2IssIccrCrAmt
	 */
	public char[]  getPage2IssIccrCrAmtActualString() {
	    String value = String.valueOf(page2IssIccrCrAmt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2IssIccrCrAmt with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ISS-ICCR-CR-AMT
	 *	@param number
	 */
	public void setPage2IssIccrCrAmt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2IssIccrCrAmt = checkPage2IssIccrCrAmtMaxLimit(number); 
		serializePage2IssIccrCrAmt(page2IssIccrCrAmt);
	}
	

	/**
	 * 	Update Page2IssIccrCrAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2IssIccrCrAmt(char[] value) throws CFException {
		 page2IssIccrCrAmt = serializePage2IssIccrCrAmt(value);
	}
	/**
	 * 	Update Page2IssIccrCrAmt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2IssIccrCrAmtString(char[] value) throws CFException {
		 setPage2IssIccrCrAmt(value);
	}
	/**
	 *	Returns the value of page2IssSurchgFree
	 *	@return page2IssSurchgFree
	 */
	public int getPage2IssSurchgFree() throws CFException {
       if (isPage2IssSurchgFreeModified()) { 
           page2IssSurchgFree = refreshPage2IssSurchgFree();
        }
   		return page2IssSurchgFree;
	}
	

    /**
	 *	Returns the String value of page2IssSurchgFree
	 *	@return page2IssSurchgFree
	 */
	public char[]  getPage2IssSurchgFreeActualString() {
	    String value = String.valueOf(page2IssSurchgFree).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page2IssSurchgFree with the passed value
	 *  Corresponding COBOL Variable is PAGE2-ISS-SURCHG-FREE
	 *	@param number
	 */
	public void setPage2IssSurchgFree(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    page2IssSurchgFree = checkPage2IssSurchgFreeMaxLimit(number); 
		serializePage2IssSurchgFree(page2IssSurchgFree);
	}
	

	public void setPage2IssSurchgFree(long number) {
	    number = checkPage2IssSurchgFreeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPage2IssSurchgFree((int)number);
	}
	
	/**
	 * 	Update Page2IssSurchgFree with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage2IssSurchgFree(char[] value) throws CFException {
		 page2IssSurchgFree = serializePage2IssSurchgFree(value);
	}
	/**
	 * 	Update Page2IssSurchgFree with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage2IssSurchgFreeString(char[] value) throws CFException {
		 setPage2IssSurchgFree(value);
	}
	/**
	 *	Returns the value of page3AcqVatTotal
	 *	@return page3AcqVatTotal
	 */
	public long getPage3AcqVatTotal() throws CFException {
       if (isPage3AcqVatTotalModified()) { 
           page3AcqVatTotal = refreshPage3AcqVatTotal();
        }
   		return page3AcqVatTotal;
	}
	

    /**
	 *	Returns the String value of page3AcqVatTotal
	 *	@return page3AcqVatTotal
	 */
	public char[]  getPage3AcqVatTotalActualString() {
	    String value = String.valueOf(page3AcqVatTotal).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page3AcqVatTotal with the passed value
	 *  Corresponding COBOL Variable is PAGE3-ACQ-VAT-TOTAL
	 *	@param number
	 */
	public void setPage3AcqVatTotal(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page3AcqVatTotal = checkPage3AcqVatTotalMaxLimit(number); 
		serializePage3AcqVatTotal(page3AcqVatTotal);
	}
	

	/**
	 * 	Update Page3AcqVatTotal with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage3AcqVatTotal(char[] value) throws CFException {
		 page3AcqVatTotal = serializePage3AcqVatTotal(value);
	}
	/**
	 * 	Update Page3AcqVatTotal with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage3AcqVatTotalString(char[] value) throws CFException {
		 setPage3AcqVatTotal(value);
	}
	/**
	 *	Returns the value of page3IssVatTotal
	 *	@return page3IssVatTotal
	 */
	public long getPage3IssVatTotal() throws CFException {
       if (isPage3IssVatTotalModified()) { 
           page3IssVatTotal = refreshPage3IssVatTotal();
        }
   		return page3IssVatTotal;
	}
	

    /**
	 *	Returns the String value of page3IssVatTotal
	 *	@return page3IssVatTotal
	 */
	public char[]  getPage3IssVatTotalActualString() {
	    String value = String.valueOf(page3IssVatTotal).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page3IssVatTotal with the passed value
	 *  Corresponding COBOL Variable is PAGE3-ISS-VAT-TOTAL
	 *	@param number
	 */
	public void setPage3IssVatTotal(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page3IssVatTotal = checkPage3IssVatTotalMaxLimit(number); 
		serializePage3IssVatTotal(page3IssVatTotal);
	}
	

	/**
	 * 	Update Page3IssVatTotal with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage3IssVatTotal(char[] value) throws CFException {
		 page3IssVatTotal = serializePage3IssVatTotal(value);
	}
	/**
	 * 	Update Page3IssVatTotal with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage3IssVatTotalString(char[] value) throws CFException {
		 setPage3IssVatTotal(value);
	}
	/**
	 *	Returns the value of page3AcqVatFicnt
	 *	@return page3AcqVatFicnt
	 */
	public int getPage3AcqVatFicnt() throws CFException {
       if (isPage3AcqVatFicntModified()) { 
           page3AcqVatFicnt = refreshPage3AcqVatFicnt();
        }
   		return page3AcqVatFicnt;
	}
	

    /**
	 *	Returns the String value of page3AcqVatFicnt
	 *	@return page3AcqVatFicnt
	 */
	public char[]  getPage3AcqVatFicntActualString() {
	    String value = String.valueOf(page3AcqVatFicnt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page3AcqVatFicnt with the passed value
	 *  Corresponding COBOL Variable is PAGE3-ACQ-VAT-FICNT
	 *	@param number
	 */
	public void setPage3AcqVatFicnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    page3AcqVatFicnt = checkPage3AcqVatFicntMaxLimit(number); 
		serializePage3AcqVatFicnt(page3AcqVatFicnt);
	}
	

	public void setPage3AcqVatFicnt(long number) {
	    number = checkPage3AcqVatFicntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPage3AcqVatFicnt((int)number);
	}
	
	/**
	 * 	Update Page3AcqVatFicnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage3AcqVatFicnt(char[] value) throws CFException {
		 page3AcqVatFicnt = serializePage3AcqVatFicnt(value);
	}
	/**
	 * 	Update Page3AcqVatFicnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage3AcqVatFicntString(char[] value) throws CFException {
		 setPage3AcqVatFicnt(value);
	}
	/**
	 *	Returns the value of page3AcqVatFiamt
	 *	@return page3AcqVatFiamt
	 */
	public long getPage3AcqVatFiamt() throws CFException {
       if (isPage3AcqVatFiamtModified()) { 
           page3AcqVatFiamt = refreshPage3AcqVatFiamt();
        }
   		return page3AcqVatFiamt;
	}
	

    /**
	 *	Returns the String value of page3AcqVatFiamt
	 *	@return page3AcqVatFiamt
	 */
	public char[]  getPage3AcqVatFiamtActualString() {
	    String value = String.valueOf(page3AcqVatFiamt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page3AcqVatFiamt with the passed value
	 *  Corresponding COBOL Variable is PAGE3-ACQ-VAT-FIAMT
	 *	@param number
	 */
	public void setPage3AcqVatFiamt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page3AcqVatFiamt = checkPage3AcqVatFiamtMaxLimit(number); 
		serializePage3AcqVatFiamt(page3AcqVatFiamt);
	}
	

	/**
	 * 	Update Page3AcqVatFiamt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage3AcqVatFiamt(char[] value) throws CFException {
		 page3AcqVatFiamt = serializePage3AcqVatFiamt(value);
	}
	/**
	 * 	Update Page3AcqVatFiamt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage3AcqVatFiamtString(char[] value) throws CFException {
		 setPage3AcqVatFiamt(value);
	}
	/**
	 *	Returns the value of page3AcqVatFvamt
	 *	@return page3AcqVatFvamt
	 */
	public long getPage3AcqVatFvamt() throws CFException {
       if (isPage3AcqVatFvamtModified()) { 
           page3AcqVatFvamt = refreshPage3AcqVatFvamt();
        }
   		return page3AcqVatFvamt;
	}
	

    /**
	 *	Returns the String value of page3AcqVatFvamt
	 *	@return page3AcqVatFvamt
	 */
	public char[]  getPage3AcqVatFvamtActualString() {
	    String value = String.valueOf(page3AcqVatFvamt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page3AcqVatFvamt with the passed value
	 *  Corresponding COBOL Variable is PAGE3-ACQ-VAT-FVAMT
	 *	@param number
	 */
	public void setPage3AcqVatFvamt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page3AcqVatFvamt = checkPage3AcqVatFvamtMaxLimit(number); 
		serializePage3AcqVatFvamt(page3AcqVatFvamt);
	}
	

	/**
	 * 	Update Page3AcqVatFvamt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage3AcqVatFvamt(char[] value) throws CFException {
		 page3AcqVatFvamt = serializePage3AcqVatFvamt(value);
	}
	/**
	 * 	Update Page3AcqVatFvamt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage3AcqVatFvamtString(char[] value) throws CFException {
		 setPage3AcqVatFvamt(value);
	}
	/**
	 *	Returns the value of page3AcqVatNicnt
	 *	@return page3AcqVatNicnt
	 */
	public int getPage3AcqVatNicnt() throws CFException {
       if (isPage3AcqVatNicntModified()) { 
           page3AcqVatNicnt = refreshPage3AcqVatNicnt();
        }
   		return page3AcqVatNicnt;
	}
	

    /**
	 *	Returns the String value of page3AcqVatNicnt
	 *	@return page3AcqVatNicnt
	 */
	public char[]  getPage3AcqVatNicntActualString() {
	    String value = String.valueOf(page3AcqVatNicnt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page3AcqVatNicnt with the passed value
	 *  Corresponding COBOL Variable is PAGE3-ACQ-VAT-NICNT
	 *	@param number
	 */
	public void setPage3AcqVatNicnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    page3AcqVatNicnt = checkPage3AcqVatNicntMaxLimit(number); 
		serializePage3AcqVatNicnt(page3AcqVatNicnt);
	}
	

	public void setPage3AcqVatNicnt(long number) {
	    number = checkPage3AcqVatNicntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPage3AcqVatNicnt((int)number);
	}
	
	/**
	 * 	Update Page3AcqVatNicnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage3AcqVatNicnt(char[] value) throws CFException {
		 page3AcqVatNicnt = serializePage3AcqVatNicnt(value);
	}
	/**
	 * 	Update Page3AcqVatNicnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage3AcqVatNicntString(char[] value) throws CFException {
		 setPage3AcqVatNicnt(value);
	}
	/**
	 *	Returns the value of page3AcqVatNiamt
	 *	@return page3AcqVatNiamt
	 */
	public long getPage3AcqVatNiamt() throws CFException {
       if (isPage3AcqVatNiamtModified()) { 
           page3AcqVatNiamt = refreshPage3AcqVatNiamt();
        }
   		return page3AcqVatNiamt;
	}
	

    /**
	 *	Returns the String value of page3AcqVatNiamt
	 *	@return page3AcqVatNiamt
	 */
	public char[]  getPage3AcqVatNiamtActualString() {
	    String value = String.valueOf(page3AcqVatNiamt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page3AcqVatNiamt with the passed value
	 *  Corresponding COBOL Variable is PAGE3-ACQ-VAT-NIAMT
	 *	@param number
	 */
	public void setPage3AcqVatNiamt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page3AcqVatNiamt = checkPage3AcqVatNiamtMaxLimit(number); 
		serializePage3AcqVatNiamt(page3AcqVatNiamt);
	}
	

	/**
	 * 	Update Page3AcqVatNiamt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage3AcqVatNiamt(char[] value) throws CFException {
		 page3AcqVatNiamt = serializePage3AcqVatNiamt(value);
	}
	/**
	 * 	Update Page3AcqVatNiamt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage3AcqVatNiamtString(char[] value) throws CFException {
		 setPage3AcqVatNiamt(value);
	}
	/**
	 *	Returns the value of page3AcqVatNvamt
	 *	@return page3AcqVatNvamt
	 */
	public long getPage3AcqVatNvamt() throws CFException {
       if (isPage3AcqVatNvamtModified()) { 
           page3AcqVatNvamt = refreshPage3AcqVatNvamt();
        }
   		return page3AcqVatNvamt;
	}
	

    /**
	 *	Returns the String value of page3AcqVatNvamt
	 *	@return page3AcqVatNvamt
	 */
	public char[]  getPage3AcqVatNvamtActualString() {
	    String value = String.valueOf(page3AcqVatNvamt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page3AcqVatNvamt with the passed value
	 *  Corresponding COBOL Variable is PAGE3-ACQ-VAT-NVAMT
	 *	@param number
	 */
	public void setPage3AcqVatNvamt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page3AcqVatNvamt = checkPage3AcqVatNvamtMaxLimit(number); 
		serializePage3AcqVatNvamt(page3AcqVatNvamt);
	}
	

	/**
	 * 	Update Page3AcqVatNvamt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage3AcqVatNvamt(char[] value) throws CFException {
		 page3AcqVatNvamt = serializePage3AcqVatNvamt(value);
	}
	/**
	 * 	Update Page3AcqVatNvamt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage3AcqVatNvamtString(char[] value) throws CFException {
		 setPage3AcqVatNvamt(value);
	}
	/**
	 *	Returns the value of page3AcqVatTicnt
	 *	@return page3AcqVatTicnt
	 */
	public int getPage3AcqVatTicnt() throws CFException {
       if (isPage3AcqVatTicntModified()) { 
           page3AcqVatTicnt = refreshPage3AcqVatTicnt();
        }
   		return page3AcqVatTicnt;
	}
	

    /**
	 *	Returns the String value of page3AcqVatTicnt
	 *	@return page3AcqVatTicnt
	 */
	public char[]  getPage3AcqVatTicntActualString() {
	    String value = String.valueOf(page3AcqVatTicnt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page3AcqVatTicnt with the passed value
	 *  Corresponding COBOL Variable is PAGE3-ACQ-VAT-TICNT
	 *	@param number
	 */
	public void setPage3AcqVatTicnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    page3AcqVatTicnt = checkPage3AcqVatTicntMaxLimit(number); 
		serializePage3AcqVatTicnt(page3AcqVatTicnt);
	}
	

	public void setPage3AcqVatTicnt(long number) {
	    number = checkPage3AcqVatTicntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPage3AcqVatTicnt((int)number);
	}
	
	/**
	 * 	Update Page3AcqVatTicnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage3AcqVatTicnt(char[] value) throws CFException {
		 page3AcqVatTicnt = serializePage3AcqVatTicnt(value);
	}
	/**
	 * 	Update Page3AcqVatTicnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage3AcqVatTicntString(char[] value) throws CFException {
		 setPage3AcqVatTicnt(value);
	}
	/**
	 *	Returns the value of page3AcqVatTiamt
	 *	@return page3AcqVatTiamt
	 */
	public long getPage3AcqVatTiamt() throws CFException {
       if (isPage3AcqVatTiamtModified()) { 
           page3AcqVatTiamt = refreshPage3AcqVatTiamt();
        }
   		return page3AcqVatTiamt;
	}
	

    /**
	 *	Returns the String value of page3AcqVatTiamt
	 *	@return page3AcqVatTiamt
	 */
	public char[]  getPage3AcqVatTiamtActualString() {
	    String value = String.valueOf(page3AcqVatTiamt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page3AcqVatTiamt with the passed value
	 *  Corresponding COBOL Variable is PAGE3-ACQ-VAT-TIAMT
	 *	@param number
	 */
	public void setPage3AcqVatTiamt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page3AcqVatTiamt = checkPage3AcqVatTiamtMaxLimit(number); 
		serializePage3AcqVatTiamt(page3AcqVatTiamt);
	}
	

	/**
	 * 	Update Page3AcqVatTiamt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage3AcqVatTiamt(char[] value) throws CFException {
		 page3AcqVatTiamt = serializePage3AcqVatTiamt(value);
	}
	/**
	 * 	Update Page3AcqVatTiamt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage3AcqVatTiamtString(char[] value) throws CFException {
		 setPage3AcqVatTiamt(value);
	}
	/**
	 *	Returns the value of page3AcqVatTvamt
	 *	@return page3AcqVatTvamt
	 */
	public long getPage3AcqVatTvamt() throws CFException {
       if (isPage3AcqVatTvamtModified()) { 
           page3AcqVatTvamt = refreshPage3AcqVatTvamt();
        }
   		return page3AcqVatTvamt;
	}
	

    /**
	 *	Returns the String value of page3AcqVatTvamt
	 *	@return page3AcqVatTvamt
	 */
	public char[]  getPage3AcqVatTvamtActualString() {
	    String value = String.valueOf(page3AcqVatTvamt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page3AcqVatTvamt with the passed value
	 *  Corresponding COBOL Variable is PAGE3-ACQ-VAT-TVAMT
	 *	@param number
	 */
	public void setPage3AcqVatTvamt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page3AcqVatTvamt = checkPage3AcqVatTvamtMaxLimit(number); 
		serializePage3AcqVatTvamt(page3AcqVatTvamt);
	}
	

	/**
	 * 	Update Page3AcqVatTvamt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage3AcqVatTvamt(char[] value) throws CFException {
		 page3AcqVatTvamt = serializePage3AcqVatTvamt(value);
	}
	/**
	 * 	Update Page3AcqVatTvamt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage3AcqVatTvamtString(char[] value) throws CFException {
		 setPage3AcqVatTvamt(value);
	}
	/**
	 *	Returns the value of page3IssVatFicnt
	 *	@return page3IssVatFicnt
	 */
	public int getPage3IssVatFicnt() throws CFException {
       if (isPage3IssVatFicntModified()) { 
           page3IssVatFicnt = refreshPage3IssVatFicnt();
        }
   		return page3IssVatFicnt;
	}
	

    /**
	 *	Returns the String value of page3IssVatFicnt
	 *	@return page3IssVatFicnt
	 */
	public char[]  getPage3IssVatFicntActualString() {
	    String value = String.valueOf(page3IssVatFicnt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page3IssVatFicnt with the passed value
	 *  Corresponding COBOL Variable is PAGE3-ISS-VAT-FICNT
	 *	@param number
	 */
	public void setPage3IssVatFicnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    page3IssVatFicnt = checkPage3IssVatFicntMaxLimit(number); 
		serializePage3IssVatFicnt(page3IssVatFicnt);
	}
	

	public void setPage3IssVatFicnt(long number) {
	    number = checkPage3IssVatFicntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPage3IssVatFicnt((int)number);
	}
	
	/**
	 * 	Update Page3IssVatFicnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage3IssVatFicnt(char[] value) throws CFException {
		 page3IssVatFicnt = serializePage3IssVatFicnt(value);
	}
	/**
	 * 	Update Page3IssVatFicnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage3IssVatFicntString(char[] value) throws CFException {
		 setPage3IssVatFicnt(value);
	}
	/**
	 *	Returns the value of page3IssVatFiamt
	 *	@return page3IssVatFiamt
	 */
	public long getPage3IssVatFiamt() throws CFException {
       if (isPage3IssVatFiamtModified()) { 
           page3IssVatFiamt = refreshPage3IssVatFiamt();
        }
   		return page3IssVatFiamt;
	}
	

    /**
	 *	Returns the String value of page3IssVatFiamt
	 *	@return page3IssVatFiamt
	 */
	public char[]  getPage3IssVatFiamtActualString() {
	    String value = String.valueOf(page3IssVatFiamt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page3IssVatFiamt with the passed value
	 *  Corresponding COBOL Variable is PAGE3-ISS-VAT-FIAMT
	 *	@param number
	 */
	public void setPage3IssVatFiamt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page3IssVatFiamt = checkPage3IssVatFiamtMaxLimit(number); 
		serializePage3IssVatFiamt(page3IssVatFiamt);
	}
	

	/**
	 * 	Update Page3IssVatFiamt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage3IssVatFiamt(char[] value) throws CFException {
		 page3IssVatFiamt = serializePage3IssVatFiamt(value);
	}
	/**
	 * 	Update Page3IssVatFiamt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage3IssVatFiamtString(char[] value) throws CFException {
		 setPage3IssVatFiamt(value);
	}
	/**
	 *	Returns the value of page3IssVatFvamt
	 *	@return page3IssVatFvamt
	 */
	public long getPage3IssVatFvamt() throws CFException {
       if (isPage3IssVatFvamtModified()) { 
           page3IssVatFvamt = refreshPage3IssVatFvamt();
        }
   		return page3IssVatFvamt;
	}
	

    /**
	 *	Returns the String value of page3IssVatFvamt
	 *	@return page3IssVatFvamt
	 */
	public char[]  getPage3IssVatFvamtActualString() {
	    String value = String.valueOf(page3IssVatFvamt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page3IssVatFvamt with the passed value
	 *  Corresponding COBOL Variable is PAGE3-ISS-VAT-FVAMT
	 *	@param number
	 */
	public void setPage3IssVatFvamt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page3IssVatFvamt = checkPage3IssVatFvamtMaxLimit(number); 
		serializePage3IssVatFvamt(page3IssVatFvamt);
	}
	

	/**
	 * 	Update Page3IssVatFvamt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage3IssVatFvamt(char[] value) throws CFException {
		 page3IssVatFvamt = serializePage3IssVatFvamt(value);
	}
	/**
	 * 	Update Page3IssVatFvamt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage3IssVatFvamtString(char[] value) throws CFException {
		 setPage3IssVatFvamt(value);
	}
	/**
	 *	Returns the value of page3IssVatNicnt
	 *	@return page3IssVatNicnt
	 */
	public int getPage3IssVatNicnt() throws CFException {
       if (isPage3IssVatNicntModified()) { 
           page3IssVatNicnt = refreshPage3IssVatNicnt();
        }
   		return page3IssVatNicnt;
	}
	

    /**
	 *	Returns the String value of page3IssVatNicnt
	 *	@return page3IssVatNicnt
	 */
	public char[]  getPage3IssVatNicntActualString() {
	    String value = String.valueOf(page3IssVatNicnt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page3IssVatNicnt with the passed value
	 *  Corresponding COBOL Variable is PAGE3-ISS-VAT-NICNT
	 *	@param number
	 */
	public void setPage3IssVatNicnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    page3IssVatNicnt = checkPage3IssVatNicntMaxLimit(number); 
		serializePage3IssVatNicnt(page3IssVatNicnt);
	}
	

	public void setPage3IssVatNicnt(long number) {
	    number = checkPage3IssVatNicntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPage3IssVatNicnt((int)number);
	}
	
	/**
	 * 	Update Page3IssVatNicnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage3IssVatNicnt(char[] value) throws CFException {
		 page3IssVatNicnt = serializePage3IssVatNicnt(value);
	}
	/**
	 * 	Update Page3IssVatNicnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage3IssVatNicntString(char[] value) throws CFException {
		 setPage3IssVatNicnt(value);
	}
	/**
	 *	Returns the value of page3IssVatNiamt
	 *	@return page3IssVatNiamt
	 */
	public long getPage3IssVatNiamt() throws CFException {
       if (isPage3IssVatNiamtModified()) { 
           page3IssVatNiamt = refreshPage3IssVatNiamt();
        }
   		return page3IssVatNiamt;
	}
	

    /**
	 *	Returns the String value of page3IssVatNiamt
	 *	@return page3IssVatNiamt
	 */
	public char[]  getPage3IssVatNiamtActualString() {
	    String value = String.valueOf(page3IssVatNiamt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page3IssVatNiamt with the passed value
	 *  Corresponding COBOL Variable is PAGE3-ISS-VAT-NIAMT
	 *	@param number
	 */
	public void setPage3IssVatNiamt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page3IssVatNiamt = checkPage3IssVatNiamtMaxLimit(number); 
		serializePage3IssVatNiamt(page3IssVatNiamt);
	}
	

	/**
	 * 	Update Page3IssVatNiamt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage3IssVatNiamt(char[] value) throws CFException {
		 page3IssVatNiamt = serializePage3IssVatNiamt(value);
	}
	/**
	 * 	Update Page3IssVatNiamt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage3IssVatNiamtString(char[] value) throws CFException {
		 setPage3IssVatNiamt(value);
	}
	/**
	 *	Returns the value of page3IssVatNvamt
	 *	@return page3IssVatNvamt
	 */
	public long getPage3IssVatNvamt() throws CFException {
       if (isPage3IssVatNvamtModified()) { 
           page3IssVatNvamt = refreshPage3IssVatNvamt();
        }
   		return page3IssVatNvamt;
	}
	

    /**
	 *	Returns the String value of page3IssVatNvamt
	 *	@return page3IssVatNvamt
	 */
	public char[]  getPage3IssVatNvamtActualString() {
	    String value = String.valueOf(page3IssVatNvamt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page3IssVatNvamt with the passed value
	 *  Corresponding COBOL Variable is PAGE3-ISS-VAT-NVAMT
	 *	@param number
	 */
	public void setPage3IssVatNvamt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page3IssVatNvamt = checkPage3IssVatNvamtMaxLimit(number); 
		serializePage3IssVatNvamt(page3IssVatNvamt);
	}
	

	/**
	 * 	Update Page3IssVatNvamt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage3IssVatNvamt(char[] value) throws CFException {
		 page3IssVatNvamt = serializePage3IssVatNvamt(value);
	}
	/**
	 * 	Update Page3IssVatNvamt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage3IssVatNvamtString(char[] value) throws CFException {
		 setPage3IssVatNvamt(value);
	}
	/**
	 *	Returns the value of page3IssVatTicnt
	 *	@return page3IssVatTicnt
	 */
	public int getPage3IssVatTicnt() throws CFException {
       if (isPage3IssVatTicntModified()) { 
           page3IssVatTicnt = refreshPage3IssVatTicnt();
        }
   		return page3IssVatTicnt;
	}
	

    /**
	 *	Returns the String value of page3IssVatTicnt
	 *	@return page3IssVatTicnt
	 */
	public char[]  getPage3IssVatTicntActualString() {
	    String value = String.valueOf(page3IssVatTicnt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page3IssVatTicnt with the passed value
	 *  Corresponding COBOL Variable is PAGE3-ISS-VAT-TICNT
	 *	@param number
	 */
	public void setPage3IssVatTicnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    page3IssVatTicnt = checkPage3IssVatTicntMaxLimit(number); 
		serializePage3IssVatTicnt(page3IssVatTicnt);
	}
	

	public void setPage3IssVatTicnt(long number) {
	    number = checkPage3IssVatTicntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPage3IssVatTicnt((int)number);
	}
	
	/**
	 * 	Update Page3IssVatTicnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage3IssVatTicnt(char[] value) throws CFException {
		 page3IssVatTicnt = serializePage3IssVatTicnt(value);
	}
	/**
	 * 	Update Page3IssVatTicnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage3IssVatTicntString(char[] value) throws CFException {
		 setPage3IssVatTicnt(value);
	}
	/**
	 *	Returns the value of page3IssVatTiamt
	 *	@return page3IssVatTiamt
	 */
	public long getPage3IssVatTiamt() throws CFException {
       if (isPage3IssVatTiamtModified()) { 
           page3IssVatTiamt = refreshPage3IssVatTiamt();
        }
   		return page3IssVatTiamt;
	}
	

    /**
	 *	Returns the String value of page3IssVatTiamt
	 *	@return page3IssVatTiamt
	 */
	public char[]  getPage3IssVatTiamtActualString() {
	    String value = String.valueOf(page3IssVatTiamt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page3IssVatTiamt with the passed value
	 *  Corresponding COBOL Variable is PAGE3-ISS-VAT-TIAMT
	 *	@param number
	 */
	public void setPage3IssVatTiamt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page3IssVatTiamt = checkPage3IssVatTiamtMaxLimit(number); 
		serializePage3IssVatTiamt(page3IssVatTiamt);
	}
	

	/**
	 * 	Update Page3IssVatTiamt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage3IssVatTiamt(char[] value) throws CFException {
		 page3IssVatTiamt = serializePage3IssVatTiamt(value);
	}
	/**
	 * 	Update Page3IssVatTiamt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage3IssVatTiamtString(char[] value) throws CFException {
		 setPage3IssVatTiamt(value);
	}
	/**
	 *	Returns the value of page3IssVatTvamt
	 *	@return page3IssVatTvamt
	 */
	public long getPage3IssVatTvamt() throws CFException {
       if (isPage3IssVatTvamtModified()) { 
           page3IssVatTvamt = refreshPage3IssVatTvamt();
        }
   		return page3IssVatTvamt;
	}
	

    /**
	 *	Returns the String value of page3IssVatTvamt
	 *	@return page3IssVatTvamt
	 */
	public char[]  getPage3IssVatTvamtActualString() {
	    String value = String.valueOf(page3IssVatTvamt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page3IssVatTvamt with the passed value
	 *  Corresponding COBOL Variable is PAGE3-ISS-VAT-TVAMT
	 *	@param number
	 */
	public void setPage3IssVatTvamt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page3IssVatTvamt = checkPage3IssVatTvamtMaxLimit(number); 
		serializePage3IssVatTvamt(page3IssVatTvamt);
	}
	

	/**
	 * 	Update Page3IssVatTvamt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage3IssVatTvamt(char[] value) throws CFException {
		 page3IssVatTvamt = serializePage3IssVatTvamt(value);
	}
	/**
	 * 	Update Page3IssVatTvamt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage3IssVatTvamtString(char[] value) throws CFException {
		 setPage3IssVatTvamt(value);
	}
	/**
	 *	Returns the value of page3NetVatFicnt
	 *	@return page3NetVatFicnt
	 */
	public int getPage3NetVatFicnt() throws CFException {
       if (isPage3NetVatFicntModified()) { 
           page3NetVatFicnt = refreshPage3NetVatFicnt();
        }
   		return page3NetVatFicnt;
	}
	

    /**
	 *	Returns the String value of page3NetVatFicnt
	 *	@return page3NetVatFicnt
	 */
	public char[]  getPage3NetVatFicntActualString() {
	    String value = String.valueOf(page3NetVatFicnt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page3NetVatFicnt with the passed value
	 *  Corresponding COBOL Variable is PAGE3-NET-VAT-FICNT
	 *	@param number
	 */
	public void setPage3NetVatFicnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    page3NetVatFicnt = checkPage3NetVatFicntMaxLimit(number); 
		serializePage3NetVatFicnt(page3NetVatFicnt);
	}
	

	public void setPage3NetVatFicnt(long number) {
	    number = checkPage3NetVatFicntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPage3NetVatFicnt((int)number);
	}
	
	/**
	 * 	Update Page3NetVatFicnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage3NetVatFicnt(char[] value) throws CFException {
		 page3NetVatFicnt = serializePage3NetVatFicnt(value);
	}
	/**
	 * 	Update Page3NetVatFicnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage3NetVatFicntString(char[] value) throws CFException {
		 setPage3NetVatFicnt(value);
	}
	/**
	 *	Returns the value of page3NetVatFiamt
	 *	@return page3NetVatFiamt
	 */
	public long getPage3NetVatFiamt() throws CFException {
       if (isPage3NetVatFiamtModified()) { 
           page3NetVatFiamt = refreshPage3NetVatFiamt();
        }
   		return page3NetVatFiamt;
	}
	

    /**
	 *	Returns the String value of page3NetVatFiamt
	 *	@return page3NetVatFiamt
	 */
	public char[]  getPage3NetVatFiamtActualString() {
	    String value = String.valueOf(page3NetVatFiamt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page3NetVatFiamt with the passed value
	 *  Corresponding COBOL Variable is PAGE3-NET-VAT-FIAMT
	 *	@param number
	 */
	public void setPage3NetVatFiamt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page3NetVatFiamt = checkPage3NetVatFiamtMaxLimit(number); 
		serializePage3NetVatFiamt(page3NetVatFiamt);
	}
	

	/**
	 * 	Update Page3NetVatFiamt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage3NetVatFiamt(char[] value) throws CFException {
		 page3NetVatFiamt = serializePage3NetVatFiamt(value);
	}
	/**
	 * 	Update Page3NetVatFiamt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage3NetVatFiamtString(char[] value) throws CFException {
		 setPage3NetVatFiamt(value);
	}
	/**
	 *	Returns the value of page3NetVatFvamt
	 *	@return page3NetVatFvamt
	 */
	public long getPage3NetVatFvamt() throws CFException {
       if (isPage3NetVatFvamtModified()) { 
           page3NetVatFvamt = refreshPage3NetVatFvamt();
        }
   		return page3NetVatFvamt;
	}
	

    /**
	 *	Returns the String value of page3NetVatFvamt
	 *	@return page3NetVatFvamt
	 */
	public char[]  getPage3NetVatFvamtActualString() {
	    String value = String.valueOf(page3NetVatFvamt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page3NetVatFvamt with the passed value
	 *  Corresponding COBOL Variable is PAGE3-NET-VAT-FVAMT
	 *	@param number
	 */
	public void setPage3NetVatFvamt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page3NetVatFvamt = checkPage3NetVatFvamtMaxLimit(number); 
		serializePage3NetVatFvamt(page3NetVatFvamt);
	}
	

	/**
	 * 	Update Page3NetVatFvamt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage3NetVatFvamt(char[] value) throws CFException {
		 page3NetVatFvamt = serializePage3NetVatFvamt(value);
	}
	/**
	 * 	Update Page3NetVatFvamt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage3NetVatFvamtString(char[] value) throws CFException {
		 setPage3NetVatFvamt(value);
	}
	/**
	 *	Returns the value of page3NetVatNicnt
	 *	@return page3NetVatNicnt
	 */
	public int getPage3NetVatNicnt() throws CFException {
       if (isPage3NetVatNicntModified()) { 
           page3NetVatNicnt = refreshPage3NetVatNicnt();
        }
   		return page3NetVatNicnt;
	}
	

    /**
	 *	Returns the String value of page3NetVatNicnt
	 *	@return page3NetVatNicnt
	 */
	public char[]  getPage3NetVatNicntActualString() {
	    String value = String.valueOf(page3NetVatNicnt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page3NetVatNicnt with the passed value
	 *  Corresponding COBOL Variable is PAGE3-NET-VAT-NICNT
	 *	@param number
	 */
	public void setPage3NetVatNicnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    page3NetVatNicnt = checkPage3NetVatNicntMaxLimit(number); 
		serializePage3NetVatNicnt(page3NetVatNicnt);
	}
	

	public void setPage3NetVatNicnt(long number) {
	    number = checkPage3NetVatNicntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPage3NetVatNicnt((int)number);
	}
	
	/**
	 * 	Update Page3NetVatNicnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage3NetVatNicnt(char[] value) throws CFException {
		 page3NetVatNicnt = serializePage3NetVatNicnt(value);
	}
	/**
	 * 	Update Page3NetVatNicnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage3NetVatNicntString(char[] value) throws CFException {
		 setPage3NetVatNicnt(value);
	}
	/**
	 *	Returns the value of page3NetVatNiamt
	 *	@return page3NetVatNiamt
	 */
	public long getPage3NetVatNiamt() throws CFException {
       if (isPage3NetVatNiamtModified()) { 
           page3NetVatNiamt = refreshPage3NetVatNiamt();
        }
   		return page3NetVatNiamt;
	}
	

    /**
	 *	Returns the String value of page3NetVatNiamt
	 *	@return page3NetVatNiamt
	 */
	public char[]  getPage3NetVatNiamtActualString() {
	    String value = String.valueOf(page3NetVatNiamt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page3NetVatNiamt with the passed value
	 *  Corresponding COBOL Variable is PAGE3-NET-VAT-NIAMT
	 *	@param number
	 */
	public void setPage3NetVatNiamt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page3NetVatNiamt = checkPage3NetVatNiamtMaxLimit(number); 
		serializePage3NetVatNiamt(page3NetVatNiamt);
	}
	

	/**
	 * 	Update Page3NetVatNiamt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage3NetVatNiamt(char[] value) throws CFException {
		 page3NetVatNiamt = serializePage3NetVatNiamt(value);
	}
	/**
	 * 	Update Page3NetVatNiamt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage3NetVatNiamtString(char[] value) throws CFException {
		 setPage3NetVatNiamt(value);
	}
	/**
	 *	Returns the value of page3NetVatNvamt
	 *	@return page3NetVatNvamt
	 */
	public long getPage3NetVatNvamt() throws CFException {
       if (isPage3NetVatNvamtModified()) { 
           page3NetVatNvamt = refreshPage3NetVatNvamt();
        }
   		return page3NetVatNvamt;
	}
	

    /**
	 *	Returns the String value of page3NetVatNvamt
	 *	@return page3NetVatNvamt
	 */
	public char[]  getPage3NetVatNvamtActualString() {
	    String value = String.valueOf(page3NetVatNvamt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page3NetVatNvamt with the passed value
	 *  Corresponding COBOL Variable is PAGE3-NET-VAT-NVAMT
	 *	@param number
	 */
	public void setPage3NetVatNvamt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page3NetVatNvamt = checkPage3NetVatNvamtMaxLimit(number); 
		serializePage3NetVatNvamt(page3NetVatNvamt);
	}
	

	/**
	 * 	Update Page3NetVatNvamt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage3NetVatNvamt(char[] value) throws CFException {
		 page3NetVatNvamt = serializePage3NetVatNvamt(value);
	}
	/**
	 * 	Update Page3NetVatNvamt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage3NetVatNvamtString(char[] value) throws CFException {
		 setPage3NetVatNvamt(value);
	}
	/**
	 *	Returns the value of page3NetVatTicnt
	 *	@return page3NetVatTicnt
	 */
	public int getPage3NetVatTicnt() throws CFException {
       if (isPage3NetVatTicntModified()) { 
           page3NetVatTicnt = refreshPage3NetVatTicnt();
        }
   		return page3NetVatTicnt;
	}
	

    /**
	 *	Returns the String value of page3NetVatTicnt
	 *	@return page3NetVatTicnt
	 */
	public char[]  getPage3NetVatTicntActualString() {
	    String value = String.valueOf(page3NetVatTicnt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page3NetVatTicnt with the passed value
	 *  Corresponding COBOL Variable is PAGE3-NET-VAT-TICNT
	 *	@param number
	 */
	public void setPage3NetVatTicnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    page3NetVatTicnt = checkPage3NetVatTicntMaxLimit(number); 
		serializePage3NetVatTicnt(page3NetVatTicnt);
	}
	

	public void setPage3NetVatTicnt(long number) {
	    number = checkPage3NetVatTicntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPage3NetVatTicnt((int)number);
	}
	
	/**
	 * 	Update Page3NetVatTicnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage3NetVatTicnt(char[] value) throws CFException {
		 page3NetVatTicnt = serializePage3NetVatTicnt(value);
	}
	/**
	 * 	Update Page3NetVatTicnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage3NetVatTicntString(char[] value) throws CFException {
		 setPage3NetVatTicnt(value);
	}
	/**
	 *	Returns the value of page3NetVatTiamt
	 *	@return page3NetVatTiamt
	 */
	public long getPage3NetVatTiamt() throws CFException {
       if (isPage3NetVatTiamtModified()) { 
           page3NetVatTiamt = refreshPage3NetVatTiamt();
        }
   		return page3NetVatTiamt;
	}
	

    /**
	 *	Returns the String value of page3NetVatTiamt
	 *	@return page3NetVatTiamt
	 */
	public char[]  getPage3NetVatTiamtActualString() {
	    String value = String.valueOf(page3NetVatTiamt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page3NetVatTiamt with the passed value
	 *  Corresponding COBOL Variable is PAGE3-NET-VAT-TIAMT
	 *	@param number
	 */
	public void setPage3NetVatTiamt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page3NetVatTiamt = checkPage3NetVatTiamtMaxLimit(number); 
		serializePage3NetVatTiamt(page3NetVatTiamt);
	}
	

	/**
	 * 	Update Page3NetVatTiamt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage3NetVatTiamt(char[] value) throws CFException {
		 page3NetVatTiamt = serializePage3NetVatTiamt(value);
	}
	/**
	 * 	Update Page3NetVatTiamt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage3NetVatTiamtString(char[] value) throws CFException {
		 setPage3NetVatTiamt(value);
	}
	/**
	 *	Returns the value of page3NetVatTvamt
	 *	@return page3NetVatTvamt
	 */
	public long getPage3NetVatTvamt() throws CFException {
       if (isPage3NetVatTvamtModified()) { 
           page3NetVatTvamt = refreshPage3NetVatTvamt();
        }
   		return page3NetVatTvamt;
	}
	

    /**
	 *	Returns the String value of page3NetVatTvamt
	 *	@return page3NetVatTvamt
	 */
	public char[]  getPage3NetVatTvamtActualString() {
	    String value = String.valueOf(page3NetVatTvamt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Page3NetVatTvamt with the passed value
	 *  Corresponding COBOL Variable is PAGE3-NET-VAT-TVAMT
	 *	@param number
	 */
	public void setPage3NetVatTvamt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    page3NetVatTvamt = checkPage3NetVatTvamtMaxLimit(number); 
		serializePage3NetVatTvamt(page3NetVatTvamt);
	}
	

	/**
	 * 	Update Page3NetVatTvamt with the passed value
	 *	@param value (String or char[])
	 */
	public void setPage3NetVatTvamt(char[] value) throws CFException {
		 page3NetVatTvamt = serializePage3NetVatTvamt(value);
	}
	/**
	 * 	Update Page3NetVatTvamt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPage3NetVatTvamtString(char[] value) throws CFException {
		 setPage3NetVatTvamt(value);
	}
	/**
	 *	Returns the value of grandTotSw
	 *	@return grandTotSw
	 */
	public int getGrandTotSw() throws CFException {
       if (isGrandTotSwModified()) { 
           grandTotSw = refreshGrandTotSw();
        }
   		return grandTotSw;
	}
	

	
	   
	/**
	 * 	Update GrandTotSw with the passed value
	 *  Corresponding COBOL Variable is WS-GRAND-TOT-SW
	 *	@param number
	 */
	public void setGrandTotSw(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    grandTotSw = checkGrandTotSwMaxLimit(number); 
		serializeGrandTotSw(grandTotSw);
	}
	

	public void setGrandTotSw(long number) {
	    number = checkGrandTotSwMaxLimit(number); // Truncate if value is beyond +/- Max range
		setGrandTotSw((int)number);
	}
	
	/**
	 * 	Update GrandTotSw with the passed value
	 *	@param value (String or char[])
	 */
	public void setGrandTotSw(char[] value) throws CFException {
		 grandTotSw = serializeGrandTotSw(value);
	}
	/**
	 * 	Update GrandTotSw with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setGrandTotSwString(char[] value) throws CFException {
		 setGrandTotSw(value);
	}
	/**
	 *	Returns the value of amt
	 *	@return amt
	 */
	public long getAmt() throws CFException {
       if (isAmtModified()) { 
           amt = refreshAmt();
        }
   		return amt;
	}
	

    /**
	 *	Returns the String value of amt
	 *	@return amt
	 */
	public char[]  getAmtActualString() {
	    String value = String.valueOf(amt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Amt with the passed value
	 *  Corresponding COBOL Variable is WS-AMT
	 *	@param number
	 */
	public void setAmt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    amt = checkAmtMaxLimit(number); 
		serializeAmt(amt);
	}
	

	/**
	 * 	Update Amt with the passed value
	 *	@param value (String or char[])
	 */
	public void setAmt(char[] value) throws CFException {
		 amt = serializeAmt(value);
	}
	/**
	 * 	Update Amt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAmtString(char[] value) throws CFException {
		 setAmt(value);
	}
	/**
	 *	Returns the value of amtT4
	 *	@return amtT4
	 */
	public long getAmtT4() throws CFException {
       if (isAmtT4Modified()) { 
           amtT4 = refreshAmtT4();
        }
   		return amtT4;
	}
	

    /**
	 *	Returns the String value of amtT4
	 *	@return amtT4
	 */
	public char[]  getAmtT4ActualString() {
	    String value = String.valueOf(amtT4).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update AmtT4 with the passed value
	 *  Corresponding COBOL Variable is WS-AMT-T4
	 *	@param number
	 */
	public void setAmtT4(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    amtT4 = checkAmtT4MaxLimit(number); 
		serializeAmtT4(amtT4);
	}
	

	/**
	 * 	Update AmtT4 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAmtT4(char[] value) throws CFException {
		 amtT4 = serializeAmtT4(value);
	}
	/**
	 * 	Update AmtT4 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAmtT4String(char[] value) throws CFException {
		 setAmtT4(value);
	}
	/**
	 *	Returns the value of amtT5
	 *	@return amtT5
	 */
	public long getAmtT5() throws CFException {
       if (isAmtT5Modified()) { 
           amtT5 = refreshAmtT5();
        }
   		return amtT5;
	}
	

    /**
	 *	Returns the String value of amtT5
	 *	@return amtT5
	 */
	public char[]  getAmtT5ActualString() {
	    String value = String.valueOf(amtT5).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update AmtT5 with the passed value
	 *  Corresponding COBOL Variable is WS-AMT-T5
	 *	@param number
	 */
	public void setAmtT5(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    amtT5 = checkAmtT5MaxLimit(number); 
		serializeAmtT5(amtT5);
	}
	

	/**
	 * 	Update AmtT5 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAmtT5(char[] value) throws CFException {
		 amtT5 = serializeAmtT5(value);
	}
	/**
	 * 	Update AmtT5 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAmtT5String(char[] value) throws CFException {
		 setAmtT5(value);
	}
	/**
	 *	Returns the value of amtCca
	 *	@return amtCca
	 */
	public long getAmtCca() throws CFException {
       if (isAmtCcaModified()) { 
           amtCca = refreshAmtCca();
        }
   		return amtCca;
	}
	

    /**
	 *	Returns the String value of amtCca
	 *	@return amtCca
	 */
	public char[]  getAmtCcaActualString() {
	    String value = String.valueOf(amtCca).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update AmtCca with the passed value
	 *  Corresponding COBOL Variable is WS-AMT-CCA
	 *	@param number
	 */
	public void setAmtCca(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    amtCca = checkAmtCcaMaxLimit(number); 
		serializeAmtCca(amtCca);
	}
	

	/**
	 * 	Update AmtCca with the passed value
	 *	@param value (String or char[])
	 */
	public void setAmtCca(char[] value) throws CFException {
		 amtCca = serializeAmtCca(value);
	}
	/**
	 * 	Update AmtCca with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAmtCcaString(char[] value) throws CFException {
		 setAmtCca(value);
	}
	/**
	 *	Returns the value of amtIccr
	 *	@return amtIccr
	 */
	public long getAmtIccr() throws CFException {
       if (isAmtIccrModified()) { 
           amtIccr = refreshAmtIccr();
        }
   		return amtIccr;
	}
	

    /**
	 *	Returns the String value of amtIccr
	 *	@return amtIccr
	 */
	public char[]  getAmtIccrActualString() {
	    String value = String.valueOf(amtIccr).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update AmtIccr with the passed value
	 *  Corresponding COBOL Variable is WS-AMT-ICCR
	 *	@param number
	 */
	public void setAmtIccr(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    amtIccr = checkAmtIccrMaxLimit(number); 
		serializeAmtIccr(amtIccr);
	}
	

	/**
	 * 	Update AmtIccr with the passed value
	 *	@param value (String or char[])
	 */
	public void setAmtIccr(char[] value) throws CFException {
		 amtIccr = serializeAmtIccr(value);
	}
	/**
	 * 	Update AmtIccr with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAmtIccrString(char[] value) throws CFException {
		 setAmtIccr(value);
	}
	/**
	 *	Returns the value of amtCr
	 *	@return amtCr
	 */
	public long getAmtCr() throws CFException {
       if (isAmtCrModified()) { 
           amtCr = refreshAmtCr();
        }
   		return amtCr;
	}
	

    /**
	 *	Returns the String value of amtCr
	 *	@return amtCr
	 */
	public char[]  getAmtCrActualString() {
	    String value = String.valueOf(amtCr).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update AmtCr with the passed value
	 *  Corresponding COBOL Variable is WS-AMT-CR
	 *	@param number
	 */
	public void setAmtCr(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    amtCr = checkAmtCrMaxLimit(number); 
		serializeAmtCr(amtCr);
	}
	

	/**
	 * 	Update AmtCr with the passed value
	 *	@param value (String or char[])
	 */
	public void setAmtCr(char[] value) throws CFException {
		 amtCr = serializeAmtCr(value);
	}
	/**
	 * 	Update AmtCr with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAmtCrString(char[] value) throws CFException {
		 setAmtCr(value);
	}
	/**
	 *	Returns the value of amtDb
	 *	@return amtDb
	 */
	public long getAmtDb() throws CFException {
       if (isAmtDbModified()) { 
           amtDb = refreshAmtDb();
        }
   		return amtDb;
	}
	

    /**
	 *	Returns the String value of amtDb
	 *	@return amtDb
	 */
	public char[]  getAmtDbActualString() {
	    String value = String.valueOf(amtDb).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update AmtDb with the passed value
	 *  Corresponding COBOL Variable is WS-AMT-DB
	 *	@param number
	 */
	public void setAmtDb(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    amtDb = checkAmtDbMaxLimit(number); 
		serializeAmtDb(amtDb);
	}
	

	/**
	 * 	Update AmtDb with the passed value
	 *	@param value (String or char[])
	 */
	public void setAmtDb(char[] value) throws CFException {
		 amtDb = serializeAmtDb(value);
	}
	/**
	 * 	Update AmtDb with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAmtDbString(char[] value) throws CFException {
		 setAmtDb(value);
	}
	/**
	 *	Returns the value of amtCrFee
	 *	@return amtCrFee
	 */
	public long getAmtCrFee() throws CFException {
       if (isAmtCrFeeModified()) { 
           amtCrFee = refreshAmtCrFee();
        }
   		return amtCrFee;
	}
	

    /**
	 *	Returns the String value of amtCrFee
	 *	@return amtCrFee
	 */
	public char[]  getAmtCrFeeActualString() {
	    String value = String.valueOf(amtCrFee).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update AmtCrFee with the passed value
	 *  Corresponding COBOL Variable is WS-AMT-CR-FEE
	 *	@param number
	 */
	public void setAmtCrFee(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    amtCrFee = checkAmtCrFeeMaxLimit(number); 
		serializeAmtCrFee(amtCrFee);
	}
	

	/**
	 * 	Update AmtCrFee with the passed value
	 *	@param value (String or char[])
	 */
	public void setAmtCrFee(char[] value) throws CFException {
		 amtCrFee = serializeAmtCrFee(value);
	}
	/**
	 * 	Update AmtCrFee with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAmtCrFeeString(char[] value) throws CFException {
		 setAmtCrFee(value);
	}
	/**
	 *	Returns the value of amtDbFee
	 *	@return amtDbFee
	 */
	public long getAmtDbFee() throws CFException {
       if (isAmtDbFeeModified()) { 
           amtDbFee = refreshAmtDbFee();
        }
   		return amtDbFee;
	}
	

    /**
	 *	Returns the String value of amtDbFee
	 *	@return amtDbFee
	 */
	public char[]  getAmtDbFeeActualString() {
	    String value = String.valueOf(amtDbFee).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update AmtDbFee with the passed value
	 *  Corresponding COBOL Variable is WS-AMT-DB-FEE
	 *	@param number
	 */
	public void setAmtDbFee(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    amtDbFee = checkAmtDbFeeMaxLimit(number); 
		serializeAmtDbFee(amtDbFee);
	}
	

	/**
	 * 	Update AmtDbFee with the passed value
	 *	@param value (String or char[])
	 */
	public void setAmtDbFee(char[] value) throws CFException {
		 amtDbFee = serializeAmtDbFee(value);
	}
	/**
	 * 	Update AmtDbFee with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAmtDbFeeString(char[] value) throws CFException {
		 setAmtDbFee(value);
	}
	/**
	 *	Returns the value of netAcqDb
	 *	@return netAcqDb
	 */
	public long getNetAcqDb() throws CFException {
       if (isNetAcqDbModified()) { 
           netAcqDb = refreshNetAcqDb();
        }
   		return netAcqDb;
	}
	

    /**
	 *	Returns the String value of netAcqDb
	 *	@return netAcqDb
	 */
	public char[]  getNetAcqDbActualString() {
	    String value = String.valueOf(netAcqDb).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update NetAcqDb with the passed value
	 *  Corresponding COBOL Variable is WS-NET-ACQ-DB
	 *	@param number
	 */
	public void setNetAcqDb(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    netAcqDb = checkNetAcqDbMaxLimit(number); 
		serializeNetAcqDb(netAcqDb);
	}
	

	/**
	 * 	Update NetAcqDb with the passed value
	 *	@param value (String or char[])
	 */
	public void setNetAcqDb(char[] value) throws CFException {
		 netAcqDb = serializeNetAcqDb(value);
	}
	/**
	 * 	Update NetAcqDb with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNetAcqDbString(char[] value) throws CFException {
		 setNetAcqDb(value);
	}
	/**
	 *	Returns the value of netAcqCr
	 *	@return netAcqCr
	 */
	public long getNetAcqCr() throws CFException {
       if (isNetAcqCrModified()) { 
           netAcqCr = refreshNetAcqCr();
        }
   		return netAcqCr;
	}
	

    /**
	 *	Returns the String value of netAcqCr
	 *	@return netAcqCr
	 */
	public char[]  getNetAcqCrActualString() {
	    String value = String.valueOf(netAcqCr).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update NetAcqCr with the passed value
	 *  Corresponding COBOL Variable is WS-NET-ACQ-CR
	 *	@param number
	 */
	public void setNetAcqCr(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    netAcqCr = checkNetAcqCrMaxLimit(number); 
		serializeNetAcqCr(netAcqCr);
	}
	

	/**
	 * 	Update NetAcqCr with the passed value
	 *	@param value (String or char[])
	 */
	public void setNetAcqCr(char[] value) throws CFException {
		 netAcqCr = serializeNetAcqCr(value);
	}
	/**
	 * 	Update NetAcqCr with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNetAcqCrString(char[] value) throws CFException {
		 setNetAcqCr(value);
	}
	/**
	 *	Returns the value of netIssDb
	 *	@return netIssDb
	 */
	public long getNetIssDb() throws CFException {
       if (isNetIssDbModified()) { 
           netIssDb = refreshNetIssDb();
        }
   		return netIssDb;
	}
	

    /**
	 *	Returns the String value of netIssDb
	 *	@return netIssDb
	 */
	public char[]  getNetIssDbActualString() {
	    String value = String.valueOf(netIssDb).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update NetIssDb with the passed value
	 *  Corresponding COBOL Variable is WS-NET-ISS-DB
	 *	@param number
	 */
	public void setNetIssDb(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    netIssDb = checkNetIssDbMaxLimit(number); 
		serializeNetIssDb(netIssDb);
	}
	

	/**
	 * 	Update NetIssDb with the passed value
	 *	@param value (String or char[])
	 */
	public void setNetIssDb(char[] value) throws CFException {
		 netIssDb = serializeNetIssDb(value);
	}
	/**
	 * 	Update NetIssDb with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNetIssDbString(char[] value) throws CFException {
		 setNetIssDb(value);
	}
	/**
	 *	Returns the value of netIssCr
	 *	@return netIssCr
	 */
	public long getNetIssCr() throws CFException {
       if (isNetIssCrModified()) { 
           netIssCr = refreshNetIssCr();
        }
   		return netIssCr;
	}
	

    /**
	 *	Returns the String value of netIssCr
	 *	@return netIssCr
	 */
	public char[]  getNetIssCrActualString() {
	    String value = String.valueOf(netIssCr).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update NetIssCr with the passed value
	 *  Corresponding COBOL Variable is WS-NET-ISS-CR
	 *	@param number
	 */
	public void setNetIssCr(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    netIssCr = checkNetIssCrMaxLimit(number); 
		serializeNetIssCr(netIssCr);
	}
	

	/**
	 * 	Update NetIssCr with the passed value
	 *	@param value (String or char[])
	 */
	public void setNetIssCr(char[] value) throws CFException {
		 netIssCr = serializeNetIssCr(value);
	}
	/**
	 * 	Update NetIssCr with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNetIssCrString(char[] value) throws CFException {
		 setNetIssCr(value);
	}
	/**
	 *	Returns the value of netAchTot
	 *	@return netAchTot
	 */
	public long getNetAchTot() throws CFException {
       if (isNetAchTotModified()) { 
           netAchTot = refreshNetAchTot();
        }
   		return netAchTot;
	}
	

    /**
	 *	Returns the String value of netAchTot
	 *	@return netAchTot
	 */
	public char[]  getNetAchTotActualString() {
	    String value = String.valueOf(netAchTot).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update NetAchTot with the passed value
	 *  Corresponding COBOL Variable is WS-NET-ACH-TOT
	 *	@param number
	 */
	public void setNetAchTot(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    netAchTot = checkNetAchTotMaxLimit(number); 
		serializeNetAchTot(netAchTot);
	}
	

	/**
	 * 	Update NetAchTot with the passed value
	 *	@param value (String or char[])
	 */
	public void setNetAchTot(char[] value) throws CFException {
		 netAchTot = serializeNetAchTot(value);
	}
	/**
	 * 	Update NetAchTot with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNetAchTotString(char[] value) throws CFException {
		 setNetAchTot(value);
	}
	/**
	 *	Returns the value of netp4AcqDb
	 *	@return netp4AcqDb
	 */
	public long getNetp4AcqDb() throws CFException {
       if (isNetp4AcqDbModified()) { 
           netp4AcqDb = refreshNetp4AcqDb();
        }
   		return netp4AcqDb;
	}
	

    /**
	 *	Returns the String value of netp4AcqDb
	 *	@return netp4AcqDb
	 */
	public char[]  getNetp4AcqDbActualString() {
	    String value = String.valueOf(netp4AcqDb).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Netp4AcqDb with the passed value
	 *  Corresponding COBOL Variable is WS-NETP4-ACQ-DB
	 *	@param number
	 */
	public void setNetp4AcqDb(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    netp4AcqDb = checkNetp4AcqDbMaxLimit(number); 
		serializeNetp4AcqDb(netp4AcqDb);
	}
	

	/**
	 * 	Update Netp4AcqDb with the passed value
	 *	@param value (String or char[])
	 */
	public void setNetp4AcqDb(char[] value) throws CFException {
		 netp4AcqDb = serializeNetp4AcqDb(value);
	}
	/**
	 * 	Update Netp4AcqDb with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNetp4AcqDbString(char[] value) throws CFException {
		 setNetp4AcqDb(value);
	}
	/**
	 *	Returns the value of netp4AcqCr
	 *	@return netp4AcqCr
	 */
	public long getNetp4AcqCr() throws CFException {
       if (isNetp4AcqCrModified()) { 
           netp4AcqCr = refreshNetp4AcqCr();
        }
   		return netp4AcqCr;
	}
	

    /**
	 *	Returns the String value of netp4AcqCr
	 *	@return netp4AcqCr
	 */
	public char[]  getNetp4AcqCrActualString() {
	    String value = String.valueOf(netp4AcqCr).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Netp4AcqCr with the passed value
	 *  Corresponding COBOL Variable is WS-NETP4-ACQ-CR
	 *	@param number
	 */
	public void setNetp4AcqCr(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    netp4AcqCr = checkNetp4AcqCrMaxLimit(number); 
		serializeNetp4AcqCr(netp4AcqCr);
	}
	

	/**
	 * 	Update Netp4AcqCr with the passed value
	 *	@param value (String or char[])
	 */
	public void setNetp4AcqCr(char[] value) throws CFException {
		 netp4AcqCr = serializeNetp4AcqCr(value);
	}
	/**
	 * 	Update Netp4AcqCr with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNetp4AcqCrString(char[] value) throws CFException {
		 setNetp4AcqCr(value);
	}
	/**
	 *	Returns the value of netp4AcqTot
	 *	@return netp4AcqTot
	 */
	public long getNetp4AcqTot() throws CFException {
       if (isNetp4AcqTotModified()) { 
           netp4AcqTot = refreshNetp4AcqTot();
        }
   		return netp4AcqTot;
	}
	

    /**
	 *	Returns the String value of netp4AcqTot
	 *	@return netp4AcqTot
	 */
	public char[]  getNetp4AcqTotActualString() {
	    String value = String.valueOf(netp4AcqTot).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Netp4AcqTot with the passed value
	 *  Corresponding COBOL Variable is WS-NETP4-ACQ-TOT
	 *	@param number
	 */
	public void setNetp4AcqTot(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    netp4AcqTot = checkNetp4AcqTotMaxLimit(number); 
		serializeNetp4AcqTot(netp4AcqTot);
	}
	

	/**
	 * 	Update Netp4AcqTot with the passed value
	 *	@param value (String or char[])
	 */
	public void setNetp4AcqTot(char[] value) throws CFException {
		 netp4AcqTot = serializeNetp4AcqTot(value);
	}
	/**
	 * 	Update Netp4AcqTot with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNetp4AcqTotString(char[] value) throws CFException {
		 setNetp4AcqTot(value);
	}
	/**
	 *	Returns the value of netp4IssDb
	 *	@return netp4IssDb
	 */
	public long getNetp4IssDb() throws CFException {
       if (isNetp4IssDbModified()) { 
           netp4IssDb = refreshNetp4IssDb();
        }
   		return netp4IssDb;
	}
	

    /**
	 *	Returns the String value of netp4IssDb
	 *	@return netp4IssDb
	 */
	public char[]  getNetp4IssDbActualString() {
	    String value = String.valueOf(netp4IssDb).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Netp4IssDb with the passed value
	 *  Corresponding COBOL Variable is WS-NETP4-ISS-DB
	 *	@param number
	 */
	public void setNetp4IssDb(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    netp4IssDb = checkNetp4IssDbMaxLimit(number); 
		serializeNetp4IssDb(netp4IssDb);
	}
	

	/**
	 * 	Update Netp4IssDb with the passed value
	 *	@param value (String or char[])
	 */
	public void setNetp4IssDb(char[] value) throws CFException {
		 netp4IssDb = serializeNetp4IssDb(value);
	}
	/**
	 * 	Update Netp4IssDb with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNetp4IssDbString(char[] value) throws CFException {
		 setNetp4IssDb(value);
	}
	/**
	 *	Returns the value of netp4IssCr
	 *	@return netp4IssCr
	 */
	public long getNetp4IssCr() throws CFException {
       if (isNetp4IssCrModified()) { 
           netp4IssCr = refreshNetp4IssCr();
        }
   		return netp4IssCr;
	}
	

    /**
	 *	Returns the String value of netp4IssCr
	 *	@return netp4IssCr
	 */
	public char[]  getNetp4IssCrActualString() {
	    String value = String.valueOf(netp4IssCr).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Netp4IssCr with the passed value
	 *  Corresponding COBOL Variable is WS-NETP4-ISS-CR
	 *	@param number
	 */
	public void setNetp4IssCr(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    netp4IssCr = checkNetp4IssCrMaxLimit(number); 
		serializeNetp4IssCr(netp4IssCr);
	}
	

	/**
	 * 	Update Netp4IssCr with the passed value
	 *	@param value (String or char[])
	 */
	public void setNetp4IssCr(char[] value) throws CFException {
		 netp4IssCr = serializeNetp4IssCr(value);
	}
	/**
	 * 	Update Netp4IssCr with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNetp4IssCrString(char[] value) throws CFException {
		 setNetp4IssCr(value);
	}
	/**
	 *	Returns the value of netp4IssTot
	 *	@return netp4IssTot
	 */
	public long getNetp4IssTot() throws CFException {
       if (isNetp4IssTotModified()) { 
           netp4IssTot = refreshNetp4IssTot();
        }
   		return netp4IssTot;
	}
	

    /**
	 *	Returns the String value of netp4IssTot
	 *	@return netp4IssTot
	 */
	public char[]  getNetp4IssTotActualString() {
	    String value = String.valueOf(netp4IssTot).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Netp4IssTot with the passed value
	 *  Corresponding COBOL Variable is WS-NETP4-ISS-TOT
	 *	@param number
	 */
	public void setNetp4IssTot(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    netp4IssTot = checkNetp4IssTotMaxLimit(number); 
		serializeNetp4IssTot(netp4IssTot);
	}
	

	/**
	 * 	Update Netp4IssTot with the passed value
	 *	@param value (String or char[])
	 */
	public void setNetp4IssTot(char[] value) throws CFException {
		 netp4IssTot = serializeNetp4IssTot(value);
	}
	/**
	 * 	Update Netp4IssTot with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNetp4IssTotString(char[] value) throws CFException {
		 setNetp4IssTot(value);
	}
	/**
	 *	Returns the value of netp4AchTot
	 *	@return netp4AchTot
	 */
	public long getNetp4AchTot() throws CFException {
       if (isNetp4AchTotModified()) { 
           netp4AchTot = refreshNetp4AchTot();
        }
   		return netp4AchTot;
	}
	

    /**
	 *	Returns the String value of netp4AchTot
	 *	@return netp4AchTot
	 */
	public char[]  getNetp4AchTotActualString() {
	    String value = String.valueOf(netp4AchTot).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Netp4AchTot with the passed value
	 *  Corresponding COBOL Variable is WS-NETP4-ACH-TOT
	 *	@param number
	 */
	public void setNetp4AchTot(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    netp4AchTot = checkNetp4AchTotMaxLimit(number); 
		serializeNetp4AchTot(netp4AchTot);
	}
	

	/**
	 * 	Update Netp4AchTot with the passed value
	 *	@param value (String or char[])
	 */
	public void setNetp4AchTot(char[] value) throws CFException {
		 netp4AchTot = serializeNetp4AchTot(value);
	}
	/**
	 * 	Update Netp4AchTot with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNetp4AchTotString(char[] value) throws CFException {
		 setNetp4AchTot(value);
	}
	/**
	 *	Returns the value of savSetlTyp
	 *	@return savSetlTyp
	 */
   public char[] getSavSetlTyp() throws CFException{
   		return savSetlTyp;
   }

  
	/**
	*  set variable savSetlTyp
	*  Corresponding COBOL Variable is WS-SAV-SETL-TYP
	*  @param value
	**/
   public void setSavSetlTyp(char[] value) {
       value = checkSavSetlTypConstraints(value);
       arraycopy(value,0,savSetlTyp,0,value.length);
   } 
	public void setSavSetlTyp(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,savSetlTyp,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of savProcDesc
	 *	@return savProcDesc
	 */
   public char[] getSavProcDesc() throws CFException{
   		return savProcDesc;
   }

  
	/**
	*  set variable savProcDesc
	*  Corresponding COBOL Variable is WS-SAV-PROC-DESC
	*  @param value
	**/
   public void setSavProcDesc(char[] value) {
       value = checkSavProcDescConstraints(value);
       arraycopy(value,0,savProcDesc,0,value.length);
   } 
	public void setSavProcDesc(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,savProcDesc,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of curProcDesc
	 *	@return curProcDesc
	 */
   public char[] getCurProcDesc() throws CFException{
   		return curProcDesc;
   }

  
	/**
	*  set variable curProcDesc
	*  Corresponding COBOL Variable is WS-CUR-PROC-DESC
	*  @param value
	**/
   public void setCurProcDesc(char[] value) {
       value = checkCurProcDescConstraints(value);
       arraycopy(value,0,curProcDesc,0,value.length);
   } 
	public void setCurProcDesc(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,curProcDesc,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of savInstDesc
	 *	@return savInstDesc
	 */
   public char[] getSavInstDesc() throws CFException{
   		return savInstDesc;
   }

  
	/**
	*  set variable savInstDesc
	*  Corresponding COBOL Variable is WS-SAV-INST-DESC
	*  @param value
	**/
   public void setSavInstDesc(char[] value) {
       value = checkSavInstDescConstraints(value);
       arraycopy(value,0,savInstDesc,0,value.length);
   } 
	public void setSavInstDesc(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,savInstDesc,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of curInstDesc
	 *	@return curInstDesc
	 */
   public char[] getCurInstDesc() throws CFException{
   		return curInstDesc;
   }

  
	/**
	*  set variable curInstDesc
	*  Corresponding COBOL Variable is WS-CUR-INST-DESC
	*  @param value
	**/
   public void setCurInstDesc(char[] value) {
       value = checkCurInstDescConstraints(value);
       arraycopy(value,0,curInstDesc,0,value.length);
   } 
	public void setCurInstDesc(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,curInstDesc,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of hldAcqIssId
	 *	@return hldAcqIssId
	 */
	public int getHldAcqIssId() throws CFException {
       if (isHldAcqIssIdModified()) { 
           hldAcqIssId = refreshHldAcqIssId();
        }
   		return hldAcqIssId;
	}
	

	
	   
	/**
	 * 	Update HldAcqIssId with the passed value
	 *  Corresponding COBOL Variable is WS-HLD-ACQ-ISS-ID
	 *	@param number
	 */
	public void setHldAcqIssId(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    hldAcqIssId = checkHldAcqIssIdMaxLimit(number); 
		serializeHldAcqIssId(hldAcqIssId);
	}
	

	public void setHldAcqIssId(long number) {
	    number = checkHldAcqIssIdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setHldAcqIssId((int)number);
	}
	
	/**
	 * 	Update HldAcqIssId with the passed value
	 *	@param value (String or char[])
	 */
	public void setHldAcqIssId(char[] value) throws CFException {
		 hldAcqIssId = serializeHldAcqIssId(value);
	}
	/**
	 * 	Update HldAcqIssId with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setHldAcqIssIdString(char[] value) throws CFException {
		 setHldAcqIssId(value);
	}
	/**
	 *	Returns the value of savAcqIssId
	 *	@return savAcqIssId
	 */
	public int getSavAcqIssId() throws CFException {
       if (isSavAcqIssIdModified()) { 
           savAcqIssId = refreshSavAcqIssId();
        }
   		return savAcqIssId;
	}
	

	
	   
	/**
	 * 	Update SavAcqIssId with the passed value
	 *  Corresponding COBOL Variable is WS-SAV-ACQ-ISS-ID
	 *	@param number
	 */
	public void setSavAcqIssId(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    savAcqIssId = checkSavAcqIssIdMaxLimit(number); 
		serializeSavAcqIssId(savAcqIssId);
	}
	

	public void setSavAcqIssId(long number) {
	    number = checkSavAcqIssIdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSavAcqIssId((int)number);
	}
	
	/**
	 * 	Update SavAcqIssId with the passed value
	 *	@param value (String or char[])
	 */
	public void setSavAcqIssId(char[] value) throws CFException {
		 savAcqIssId = serializeSavAcqIssId(value);
	}
	/**
	 * 	Update SavAcqIssId with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSavAcqIssIdString(char[] value) throws CFException {
		 setSavAcqIssId(value);
	}
	/**
	 *	Returns the value of curAcqIssId
	 *	@return curAcqIssId
	 */
	public int getCurAcqIssId() throws CFException {
       if (isCurAcqIssIdModified()) { 
           curAcqIssId = refreshCurAcqIssId();
        }
   		return curAcqIssId;
	}
	

	
	   
	/**
	 * 	Update CurAcqIssId with the passed value
	 *  Corresponding COBOL Variable is WS-CUR-ACQ-ISS-ID
	 *	@param number
	 */
	public void setCurAcqIssId(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    curAcqIssId = checkCurAcqIssIdMaxLimit(number); 
		serializeCurAcqIssId(curAcqIssId);
	}
	

	public void setCurAcqIssId(long number) {
	    number = checkCurAcqIssIdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCurAcqIssId((int)number);
	}
	
	/**
	 * 	Update CurAcqIssId with the passed value
	 *	@param value (String or char[])
	 */
	public void setCurAcqIssId(char[] value) throws CFException {
		 curAcqIssId = serializeCurAcqIssId(value);
	}
	/**
	 * 	Update CurAcqIssId with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCurAcqIssIdString(char[] value) throws CFException {
		 setCurAcqIssId(value);
	}
	/**
	 *	Returns the value of currSetlTyp
	 *	@return currSetlTyp
	 */
   public char[] getCurrSetlTyp() throws CFException{
   		return currSetlTyp;
   }

  
	/**
	*  set variable currSetlTyp
	*  Corresponding COBOL Variable is WS-CURR-SETL-TYP
	*  @param value
	**/
   public void setCurrSetlTyp(char[] value) {
       value = checkCurrSetlTypConstraints(value);
       arraycopy(value,0,currSetlTyp,0,value.length);
   } 
	public void setCurrSetlTyp(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,currSetlTyp,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of savMbrEndpoint
	 *	@return savMbrEndpoint
	 */
	public long getSavMbrEndpoint() throws CFException {
       if (isSavMbrEndpointModified()) { 
           savMbrEndpoint = refreshSavMbrEndpoint();
        }
   		return savMbrEndpoint;
	}
	

	
	   
	/**
	 * 	Update SavMbrEndpoint with the passed value
	 *  Corresponding COBOL Variable is WS-SAV-MBR-ENDPOINT
	 *	@param number
	 */
	public void setSavMbrEndpoint(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    savMbrEndpoint = checkSavMbrEndpointMaxLimit(number); 
		serializeSavMbrEndpoint(savMbrEndpoint);
	}
	

	/**
	 * 	Update SavMbrEndpoint with the passed value
	 *	@param value (String or char[])
	 */
	public void setSavMbrEndpoint(char[] value) throws CFException {
		 savMbrEndpoint = serializeSavMbrEndpoint(value);
	}
	/**
	 * 	Update SavMbrEndpoint with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSavMbrEndpointString(char[] value) throws CFException {
		 setSavMbrEndpoint(value);
	}
	/**
	 *	Returns the value of curMbrEndpoint
	 *	@return curMbrEndpoint
	 */
	public long getCurMbrEndpoint() throws CFException {
       if (isCurMbrEndpointModified()) { 
           curMbrEndpoint = refreshCurMbrEndpoint();
        }
   		return curMbrEndpoint;
	}
	

	
	   
	/**
	 * 	Update CurMbrEndpoint with the passed value
	 *  Corresponding COBOL Variable is WS-CUR-MBR-ENDPOINT
	 *	@param number
	 */
	public void setCurMbrEndpoint(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    curMbrEndpoint = checkCurMbrEndpointMaxLimit(number); 
		serializeCurMbrEndpoint(curMbrEndpoint);
	}
	

	/**
	 * 	Update CurMbrEndpoint with the passed value
	 *	@param value (String or char[])
	 */
	public void setCurMbrEndpoint(char[] value) throws CFException {
		 curMbrEndpoint = serializeCurMbrEndpoint(value);
	}
	/**
	 * 	Update CurMbrEndpoint with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCurMbrEndpointString(char[] value) throws CFException {
		 setCurMbrEndpoint(value);
	}
	/**
	 *	Returns the value of savMbrEntIca
	 *	@return savMbrEntIca
	 */
	public long getSavMbrEntIca() throws CFException {
       if (isSavMbrEntIcaModified()) { 
           savMbrEntIca = refreshSavMbrEntIca();
        }
   		return savMbrEntIca;
	}
	

	
	   
	/**
	 * 	Update SavMbrEntIca with the passed value
	 *  Corresponding COBOL Variable is WS-SAV-MBR-ENT-ICA
	 *	@param number
	 */
	public void setSavMbrEntIca(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    savMbrEntIca = checkSavMbrEntIcaMaxLimit(number); 
		serializeSavMbrEntIca(savMbrEntIca);
	}
	

	/**
	 * 	Update SavMbrEntIca with the passed value
	 *	@param value (String or char[])
	 */
	public void setSavMbrEntIca(char[] value) throws CFException {
		 savMbrEntIca = serializeSavMbrEntIca(value);
	}
	/**
	 * 	Update SavMbrEntIca with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSavMbrEntIcaString(char[] value) throws CFException {
		 setSavMbrEntIca(value);
	}
	/**
	 *	Returns the value of curMbrEntIca
	 *	@return curMbrEntIca
	 */
	public long getCurMbrEntIca() throws CFException {
       if (isCurMbrEntIcaModified()) { 
           curMbrEntIca = refreshCurMbrEntIca();
        }
   		return curMbrEntIca;
	}
	

	
	   
	/**
	 * 	Update CurMbrEntIca with the passed value
	 *  Corresponding COBOL Variable is WS-CUR-MBR-ENT-ICA
	 *	@param number
	 */
	public void setCurMbrEntIca(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    curMbrEntIca = checkCurMbrEntIcaMaxLimit(number); 
		serializeCurMbrEntIca(curMbrEntIca);
	}
	

	/**
	 * 	Update CurMbrEntIca with the passed value
	 *	@param value (String or char[])
	 */
	public void setCurMbrEntIca(char[] value) throws CFException {
		 curMbrEntIca = serializeCurMbrEntIca(value);
	}
	/**
	 * 	Update CurMbrEntIca with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCurMbrEntIcaString(char[] value) throws CFException {
		 setCurMbrEntIca(value);
	}
	/**
	 *	Returns the value of savMbrMbrIca
	 *	@return savMbrMbrIca
	 */
	public long getSavMbrMbrIca() throws CFException {
       if (isSavMbrMbrIcaModified()) { 
           savMbrMbrIca = refreshSavMbrMbrIca();
        }
   		return savMbrMbrIca;
	}
	

	
	   
	/**
	 * 	Update SavMbrMbrIca with the passed value
	 *  Corresponding COBOL Variable is WS-SAV-MBR-MBR-ICA
	 *	@param number
	 */
	public void setSavMbrMbrIca(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    savMbrMbrIca = checkSavMbrMbrIcaMaxLimit(number); 
		serializeSavMbrMbrIca(savMbrMbrIca);
	}
	

	/**
	 * 	Update SavMbrMbrIca with the passed value
	 *	@param value (String or char[])
	 */
	public void setSavMbrMbrIca(char[] value) throws CFException {
		 savMbrMbrIca = serializeSavMbrMbrIca(value);
	}
	/**
	 * 	Update SavMbrMbrIca with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSavMbrMbrIcaString(char[] value) throws CFException {
		 setSavMbrMbrIca(value);
	}
	/**
	 *	Returns the value of curMbrMbrIca
	 *	@return curMbrMbrIca
	 */
	public long getCurMbrMbrIca() throws CFException {
       if (isCurMbrMbrIcaModified()) { 
           curMbrMbrIca = refreshCurMbrMbrIca();
        }
   		return curMbrMbrIca;
	}
	

	
	   
	/**
	 * 	Update CurMbrMbrIca with the passed value
	 *  Corresponding COBOL Variable is WS-CUR-MBR-MBR-ICA
	 *	@param number
	 */
	public void setCurMbrMbrIca(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    curMbrMbrIca = checkCurMbrMbrIcaMaxLimit(number); 
		serializeCurMbrMbrIca(curMbrMbrIca);
	}
	

	/**
	 * 	Update CurMbrMbrIca with the passed value
	 *	@param value (String or char[])
	 */
	public void setCurMbrMbrIca(char[] value) throws CFException {
		 curMbrMbrIca = serializeCurMbrMbrIca(value);
	}
	/**
	 * 	Update CurMbrMbrIca with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCurMbrMbrIcaString(char[] value) throws CFException {
		 setCurMbrMbrIca(value);
	}
	/**
	 *	Returns the value of savApcIca
	 *	@return savApcIca
	 */
   public char[] getSavApcIca() throws CFException{
   		return savApcIca;
   }

  
	/**
	*  set variable savApcIca
	*  Corresponding COBOL Variable is WS-SAV-APC-ICA
	*  @param value
	**/
   public void setSavApcIca(char[] value) {
       value = checkSavApcIcaConstraints(value);
       arraycopy(value,0,savApcIca,0,value.length);
   } 
	public void setSavApcIca(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,savApcIca,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of apcTotAmount
	 *	@return apcTotAmount
	 */
	public BigDecimal getApcTotAmount() throws CFException {
       if (isApcTotAmountModified()) { 
           apcTotAmount = refreshApcTotAmount();
        }
   		return apcTotAmount;
	}
	

    /**
	 *	Returns the String value of apcTotAmount
	 *	@return apcTotAmount
	 */
	public char[]  getApcTotAmountActualString() {
	    String value = String.valueOf(apcTotAmount).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update ApcTotAmount with the passed number
	 *  Corresponding COBOL Variable is WS-APC-TOT-AMOUNT
	 *	@param number
	 */
	public void setApcTotAmount(BigDecimal number) {
       apcTotAmount = checkApcTotAmountMaxLimit(number);
	    serializeApcTotAmount(apcTotAmount);
   }
	/**
	 * 	Update ApcTotAmount with the passed value
	 *	@param value (String or char[])
	 */
	public void setApcTotAmount(char[] value) throws CFException {
		 apcTotAmount = serializeApcTotAmount(value);
	}   
	/**
	 *	Returns the value of apcTotCrAmount
	 *	@return apcTotCrAmount
	 */
	public BigDecimal getApcTotCrAmount() throws CFException {
       if (isApcTotCrAmountModified()) { 
           apcTotCrAmount = refreshApcTotCrAmount();
        }
   		return apcTotCrAmount;
	}
	

	
	   
	/**
	 * 	Update ApcTotCrAmount with the passed number
	 *  Corresponding COBOL Variable is WS-APC-TOT-CR-AMOUNT
	 *	@param number
	 */
	public void setApcTotCrAmount(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       apcTotCrAmount = checkApcTotCrAmountMaxLimit(number);
	    serializeApcTotCrAmount(apcTotCrAmount);
   }
	/**
	 * 	Update ApcTotCrAmount with the passed value
	 *	@param value (String or char[])
	 */
	public void setApcTotCrAmount(char[] value) throws CFException {
		 apcTotCrAmount = serializeApcTotCrAmount(value);
	}   
	/**
	 *	Returns the value of apcTotDrAmount
	 *	@return apcTotDrAmount
	 */
	public BigDecimal getApcTotDrAmount() throws CFException {
       if (isApcTotDrAmountModified()) { 
           apcTotDrAmount = refreshApcTotDrAmount();
        }
   		return apcTotDrAmount;
	}
	

	
	   
	/**
	 * 	Update ApcTotDrAmount with the passed number
	 *  Corresponding COBOL Variable is WS-APC-TOT-DR-AMOUNT
	 *	@param number
	 */
	public void setApcTotDrAmount(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       apcTotDrAmount = checkApcTotDrAmountMaxLimit(number);
	    serializeApcTotDrAmount(apcTotDrAmount);
   }
	/**
	 * 	Update ApcTotDrAmount with the passed value
	 *	@param value (String or char[])
	 */
	public void setApcTotDrAmount(char[] value) throws CFException {
		 apcTotDrAmount = serializeApcTotDrAmount(value);
	}   
	/**
	 *	Returns the value of firstRecord
	 *	@return firstRecord
	 */
   public char[] getFirstRecord() throws CFException{
   		return firstRecord;
   }

  
	/**
	*  set variable firstRecord
	*  Corresponding COBOL Variable is FIRST-RECORD
	*  @param value
	**/
   public void setFirstRecord(char[] value) {
       value = checkFirstRecordConstraints(value);
       arraycopy(value,0,firstRecord,0,value.length);
   } 
	public void setFirstRecord(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,firstRecord,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of noActLine
	 *	@return noActLine
	 */
   public char[] getNoActLine() throws CFException{
   		return noActLine;
   }

  
	/**
	*  set variable noActLine
	*  Corresponding COBOL Variable is NO-ACT-LINE
	*  @param value
	**/
   public void setNoActLine(char[] value) {
       value = checkNoActLineConstraints(value);
       arraycopy(value,0,noActLine,0,value.length);
   } 
	public void setNoActLine(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,noActLine,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of noActivitySw
	 *	@return noActivitySw
	 */
   public char[] getNoActivitySw() throws CFException{
   		return noActivitySw;
   }

  
	/**
	*  set variable noActivitySw
	*  Corresponding COBOL Variable is NO-ACTIVITY-SW
	*  @param value
	**/
   public void setNoActivitySw(char[] value) {
       value = checkNoActivitySwConstraints(value);
       arraycopy(value,0,noActivitySw,0,value.length);
   } 
	public void setNoActivitySw(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,noActivitySw,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of missingActivitySw
	 *	@return missingActivitySw
	 */
   public char[] getMissingActivitySw() throws CFException{
   		return missingActivitySw;
   }

  
	/**
	*  set variable missingActivitySw
	*  Corresponding COBOL Variable is MISSING-ACTIVITY-SW
	*  @param value
	**/
   public void setMissingActivitySw(char[] value) {
       value = checkMissingActivitySwConstraints(value);
       arraycopy(value,0,missingActivitySw,0,value.length);
   } 
	public void setMissingActivitySw(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,missingActivitySw,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of prodNdx
	 *	@return prodNdx
	 */
	public int getProdNdx() throws CFException {
       if (isProdNdxModified()) { 
           prodNdx = refreshProdNdx();
        }
   		return prodNdx;
	}
	

	
	   
	/**
	 * 	Update ProdNdx with the passed value
	 *  Corresponding COBOL Variable is PROD-NDX
	 *	@param number
	 */
	public void setProdNdx(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    prodNdx = checkProdNdxMaxLimit(number); 
		serializeProdNdx(prodNdx);
	}
	

	public void setProdNdx(long number) {
	    number = checkProdNdxMaxLimit(number); // Truncate if value is beyond +/- Max range
		setProdNdx((int)number);
	}
	
	/**
	 * 	Update ProdNdx with the passed value
	 *	@param value (String or char[])
	 */
	public void setProdNdx(char[] value) throws CFException {
		 prodNdx = serializeProdNdx(value);
	}
	/**
	 * 	Update ProdNdx with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setProdNdxString(char[] value) throws CFException {
		 setProdNdx(value);
	}
	/**
	 *	Returns the value of ndxMax
	 *	@return ndxMax
	 */
	public int getNdxMax() throws CFException {
       if (isNdxMaxModified()) { 
           ndxMax = refreshNdxMax();
        }
   		return ndxMax;
	}
	

	
	   
	/**
	 * 	Update NdxMax with the passed value
	 *  Corresponding COBOL Variable is NDX-MAX
	 *	@param number
	 */
	public void setNdxMax(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ndxMax = checkNdxMaxMaxLimit(number); 
		serializeNdxMax(ndxMax);
	}
	

	public void setNdxMax(long number) {
	    number = checkNdxMaxMaxLimit(number); // Truncate if value is beyond +/- Max range
		setNdxMax((int)number);
	}
	
	/**
	 * 	Update NdxMax with the passed value
	 *	@param value (String or char[])
	 */
	public void setNdxMax(char[] value) throws CFException {
		 ndxMax = serializeNdxMax(value);
	}
	/**
	 * 	Update NdxMax with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNdxMaxString(char[] value) throws CFException {
		 setNdxMax(value);
	}
	/**
	 *	Returns the value of ndx
	 *	@return ndx
	 */
	public int getNdx() throws CFException {
       if (isNdxModified()) { 
           ndx = refreshNdx();
        }
   		return ndx;
	}
	

	
	   
	/**
	 * 	Update Ndx with the passed value
	 *  Corresponding COBOL Variable is NDX
	 *	@param number
	 */
	public void setNdx(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ndx = checkNdxMaxLimit(number); 
		serializeNdx(ndx);
	}
	

	public void setNdx(long number) {
	    number = checkNdxMaxLimit(number); // Truncate if value is beyond +/- Max range
		setNdx((int)number);
	}
	
	/**
	 * 	Update Ndx with the passed value
	 *	@param value (String or char[])
	 */
	public void setNdx(char[] value) throws CFException {
		 ndx = serializeNdx(value);
	}
	/**
	 * 	Update Ndx with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNdxString(char[] value) throws CFException {
		 setNdx(value);
	}
	/**
	 *	Returns the value of curNdx
	 *	@return curNdx
	 */
	public int getCurNdx() throws CFException {
       if (isCurNdxModified()) { 
           curNdx = refreshCurNdx();
        }
   		return curNdx;
	}
	

	
	   
	/**
	 * 	Update CurNdx with the passed value
	 *  Corresponding COBOL Variable is CUR-NDX
	 *	@param number
	 */
	public void setCurNdx(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    curNdx = checkCurNdxMaxLimit(number); 
		serializeCurNdx(curNdx);
	}
	

	public void setCurNdx(long number) {
	    number = checkCurNdxMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCurNdx((int)number);
	}
	
	/**
	 * 	Update CurNdx with the passed value
	 *	@param value (String or char[])
	 */
	public void setCurNdx(char[] value) throws CFException {
		 curNdx = serializeCurNdx(value);
	}
	/**
	 * 	Update CurNdx with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCurNdxString(char[] value) throws CFException {
		 setCurNdx(value);
	}
	/**
	 *	Returns the value of apcInx
	 *	@return apcInx
	 */
	public long getApcInx() throws CFException {
       if (isApcInxModified()) { 
           apcInx = refreshApcInx();
        }
   		return apcInx;
	}
	

	
	   
	/**
	 * 	Update ApcInx with the passed value
	 *  Corresponding COBOL Variable is APC-INX
	 *	@param number
	 */
	public void setApcInx(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    apcInx = checkApcInxMaxLimit(number); 
		serializeApcInx(apcInx);
	}
	

	/**
	 * 	Update ApcInx with the passed value
	 *	@param value (String or char[])
	 */
	public void setApcInx(char[] value) throws CFException {
		 apcInx = serializeApcInx(value);
	}
	/**
	 * 	Update ApcInx with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setApcInxString(char[] value) throws CFException {
		 setApcInx(value);
	}
	/**
	 *	Returns the value of inx
	 *	@return inx
	 */
	public long getInx() throws CFException {
       if (isInxModified()) { 
           inx = refreshInx();
        }
   		return inx;
	}
	

	
	   
	/**
	 * 	Update Inx with the passed value
	 *  Corresponding COBOL Variable is WS-INX
	 *	@param number
	 */
	public void setInx(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    inx = checkInxMaxLimit(number); 
		serializeInx(inx);
	}
	

	/**
	 * 	Update Inx with the passed value
	 *	@param value (String or char[])
	 */
	public void setInx(char[] value) throws CFException {
		 inx = serializeInx(value);
	}
	/**
	 * 	Update Inx with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setInxString(char[] value) throws CFException {
		 setInx(value);
	}
	/**
	 *	Returns the value of wS2
	 *	@return wS2
	 */
	public long getWS2() throws CFException {
       if (isWS2Modified()) { 
           wS2 = refreshWS2();
        }
   		return wS2;
	}
	

	
	   
	/**
	 * 	Update WS2 with the passed value
	 *  Corresponding COBOL Variable is WS-2
	 *	@param number
	 */
	public void setWS2(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    wS2 = checkWS2MaxLimit(number); 
		serializeWS2(wS2);
	}
	

	/**
	 * 	Update WS2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setWS2(char[] value) throws CFException {
		 wS2 = serializeWS2(value);
	}
	/**
	 * 	Update WS2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWS2String(char[] value) throws CFException {
		 setWS2(value);
	}
	/**
	 *	Returns the value of rptType
	 *	@return rptType
	 */
   public char[] getRptType() throws CFException{
   		return rptType;
   }

  
	/**
	*  set variable rptType
	*  Corresponding COBOL Variable is WS-RPT-TYPE
	*  @param value
	**/
   public void setRptType(char[] value) {
       value = checkRptTypeConstraints(value);
       arraycopy(value,0,rptType,0,value.length);
   } 
	public void setRptType(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rptType,0,beginIndex + endIndex);
   }
	char[] rptTypeDaily88Value = "D".toCharArray();
	/**
	 *	Test condition "D" for isRptTypeDaily()
	 *	@return  Returns true if isRptTypeDaily() is "D"
	 */
   public boolean isRptTypeDaily() throws CFException {
      return (  compareChars( getRptType() , rptTypeDaily88Value)  == 0  );
   }


	/**
	*  set values "D"
	*/
   	public void setRptTypeDailyTrue() {  			
    	setRptType( rptTypeDaily88Value);
   	}
	char[] rptTypeMonthly88Value = "M".toCharArray();
	/**
	 *	Test condition "M" for isRptTypeMonthly()
	 *	@return  Returns true if isRptTypeMonthly() is "M"
	 */
   public boolean isRptTypeMonthly() throws CFException {
      return (  compareChars( getRptType() , rptTypeMonthly88Value)  == 0  );
   }


	/**
	*  set values "M"
	*/
   	public void setRptTypeMonthlyTrue() {  			
    	setRptType( rptTypeMonthly88Value);
   	}
	/**
	 *	Returns the value of systemTime
	 *	@return systemTime
	 */
   public char[] getSystemTime() throws CFException{
   		return systemTime;
   }

  
	/**
	*  set variable systemTime
	*  Corresponding COBOL Variable is SYSTEM-TIME
	*  @param value
	**/
   public void setSystemTime(char[] value) {
       value = checkSystemTimeConstraints(value);
       arraycopy(value,0,systemTime,0,value.length);
   } 
	public void setSystemTime(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,systemTime,0,beginIndex + endIndex);
   }
	public int getWaPageCtr() throws CFException {
        if (isWaPageCtrModified()) { 
           waPageCtr = refreshWaPageCtr();
        }
   		return waPageCtr;
	}
	
	/**
	 * 	Update WaPageCtr with the passed value
	 *  Corresponding COBOL Variable is WA-PAGE-CTR
	 *	@param number
	 */
	public void setWaPageCtr(int number) {
			waPageCtr = checkWaPageCtrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeWaPageCtr(waPageCtr);
	}


	public void setWaPageCtr(long number) {
	    number = checkWaPageCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWaPageCtr((int)number);
	}
	
	public int getWaLineCtr() throws CFException {
        if (isWaLineCtrModified()) { 
           waLineCtr = refreshWaLineCtr();
        }
   		return waLineCtr;
	}
	
	/**
	 * 	Update WaLineCtr with the passed value
	 *  Corresponding COBOL Variable is WA-LINE-CTR
	 *	@param number
	 */
	public void setWaLineCtr(int number) {
			waLineCtr = checkWaLineCtrMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeWaLineCtr(waLineCtr);
	}


	public void setWaLineCtr(long number) {
	    number = checkWaLineCtrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWaLineCtr((int)number);
	}
	
	/**
	 *	Returns the value of eofTranSw
	 *	@return eofTranSw
	 */
   public char[] getEofTranSw() throws CFException{
   		return eofTranSw;
   }

  
	/**
	*  set variable eofTranSw
	*  Corresponding COBOL Variable is EOF-TRAN-SW
	*  @param value
	**/
   public void setEofTranSw(char[] value) {
       value = checkEofTranSwConstraints(value);
       arraycopy(value,0,eofTranSw,0,value.length);
   } 
	public void setEofTranSw(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,eofTranSw,0,beginIndex + endIndex);
   }
	char[] eofTran88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isEofTran()
	 *	@return  Returns true if isEofTran() is "Y"
	 */
   public boolean isEofTran() throws CFException {
      return (  compareChars( getEofTranSw() , eofTran88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setEofTranTrue() {  			
    	setEofTranSw( eofTran88Value);
   	}
	/**
	 *	Returns the value of impDec
	 *	@return impDec
	 */
	public int getImpDec() throws CFException {
       if (isImpDecModified()) { 
           impDec = refreshImpDec();
        }
   		return impDec;
	}
	

	
	   
	/**
	 * 	Update ImpDec with the passed value
	 *  Corresponding COBOL Variable is WS-IMP-DEC
	 *	@param number
	 */
	public void setImpDec(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    impDec = checkImpDecMaxLimit(number); 
		serializeImpDec(impDec);
	}
	

	public void setImpDec(long number) {
	    number = checkImpDecMaxLimit(number); // Truncate if value is beyond +/- Max range
		setImpDec((int)number);
	}
	
	/**
	 * 	Update ImpDec with the passed value
	 *	@param value (String or char[])
	 */
	public void setImpDec(char[] value) throws CFException {
		 impDec = serializeImpDec(value);
	}
	/**
	 * 	Update ImpDec with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setImpDecString(char[] value) throws CFException {
		 setImpDec(value);
	}
	/**
	 *	Returns the value of impDecEp
	 *	@return impDecEp
	 */
	public int getImpDecEp() throws CFException {
       if (isImpDecEpModified()) { 
           impDecEp = refreshImpDecEp();
        }
   		return impDecEp;
	}
	

	
	   
	/**
	 * 	Update ImpDecEp with the passed value
	 *  Corresponding COBOL Variable is WS-IMP-DEC-EP
	 *	@param number
	 */
	public void setImpDecEp(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    impDecEp = checkImpDecEpMaxLimit(number); 
		serializeImpDecEp(impDecEp);
	}
	

	public void setImpDecEp(long number) {
	    number = checkImpDecEpMaxLimit(number); // Truncate if value is beyond +/- Max range
		setImpDecEp((int)number);
	}
	
	/**
	 * 	Update ImpDecEp with the passed value
	 *	@param value (String or char[])
	 */
	public void setImpDecEp(char[] value) throws CFException {
		 impDecEp = serializeImpDecEp(value);
	}
	/**
	 * 	Update ImpDecEp with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setImpDecEpString(char[] value) throws CFException {
		 setImpDecEp(value);
	}
	/**
	 *	Returns the value of impAmtf
	 *	@return impAmtf
	 */
	public long getImpAmtf() throws CFException {
       if (isImpAmtfModified()) { 
           impAmtf = refreshImpAmtf();
        }
   		return impAmtf;
	}
	

    /**
	 *	Returns the String value of impAmtf
	 *	@return impAmtf
	 */
	public char[]  getImpAmtfActualString() {
	    String value = String.valueOf(impAmtf).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update ImpAmtf with the passed value
	 *  Corresponding COBOL Variable is WS-IMP-AMTF
	 *	@param number
	 */
	public void setImpAmtf(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    impAmtf = checkImpAmtfMaxLimit(number); 
		serializeImpAmtf(impAmtf);
	}
	

	/**
	 * 	Update ImpAmtf with the passed value
	 *	@param value (String or char[])
	 */
	public void setImpAmtf(char[] value) throws CFException {
		 impAmtf = serializeImpAmtf(value);
	}
	/**
	 * 	Update ImpAmtf with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setImpAmtfString(char[] value) throws CFException {
		 setImpAmtf(value);
	}
	/**
	 *	Returns the value of impAmte
	 *	@return impAmte
	 */
	public long getImpAmte() throws CFException {
       if (isImpAmteModified()) { 
           impAmte = refreshImpAmte();
        }
   		return impAmte;
	}
	

    /**
	 *	Returns the String value of impAmte
	 *	@return impAmte
	 */
	public char[]  getImpAmteActualString() {
	    String value = String.valueOf(impAmte).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update ImpAmte with the passed value
	 *  Corresponding COBOL Variable is WS-IMP-AMTE
	 *	@param number
	 */
	public void setImpAmte(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    impAmte = checkImpAmteMaxLimit(number); 
		serializeImpAmte(impAmte);
	}
	

	/**
	 * 	Update ImpAmte with the passed value
	 *	@param value (String or char[])
	 */
	public void setImpAmte(char[] value) throws CFException {
		 impAmte = serializeImpAmte(value);
	}
	/**
	 * 	Update ImpAmte with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setImpAmteString(char[] value) throws CFException {
		 setImpAmte(value);
	}
	/**
	 *	Returns the value of impAmtep
	 *	@return impAmtep
	 */
	public long getImpAmtep() throws CFException {
       if (isImpAmtepModified()) { 
           impAmtep = refreshImpAmtep();
        }
   		return impAmtep;
	}
	

    /**
	 *	Returns the String value of impAmtep
	 *	@return impAmtep
	 */
	public char[]  getImpAmtepActualString() {
	    String value = String.valueOf(impAmtep).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update ImpAmtep with the passed value
	 *  Corresponding COBOL Variable is WS-IMP-AMTEP
	 *	@param number
	 */
	public void setImpAmtep(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    impAmtep = checkImpAmtepMaxLimit(number); 
		serializeImpAmtep(impAmtep);
	}
	

	/**
	 * 	Update ImpAmtep with the passed value
	 *	@param value (String or char[])
	 */
	public void setImpAmtep(char[] value) throws CFException {
		 impAmtep = serializeImpAmtep(value);
	}
	/**
	 * 	Update ImpAmtep with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setImpAmtepString(char[] value) throws CFException {
		 setImpAmtep(value);
	}
	/**
	 *	Returns the value of impAmt
	 *	@return impAmt
	 */
	public long getImpAmt() throws CFException {
       if (isImpAmtModified()) { 
           impAmt = refreshImpAmt();
        }
   		return impAmt;
	}
	

    /**
	 *	Returns the String value of impAmt
	 *	@return impAmt
	 */
	public char[]  getImpAmtActualString() {
	    String value = String.valueOf(impAmt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update ImpAmt with the passed value
	 *  Corresponding COBOL Variable is WS-IMP-AMT
	 *	@param number
	 */
	public void setImpAmt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    impAmt = checkImpAmtMaxLimit(number); 
		serializeImpAmt(impAmt);
	}
	

	/**
	 * 	Update ImpAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setImpAmt(char[] value) throws CFException {
		 impAmt = serializeImpAmt(value);
	}
	/**
	 * 	Update ImpAmt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setImpAmtString(char[] value) throws CFException {
		 setImpAmt(value);
	}
	/**
	 *	Returns the value of impAmtT4
	 *	@return impAmtT4
	 */
	public long getImpAmtT4() throws CFException {
       if (isImpAmtT4Modified()) { 
           impAmtT4 = refreshImpAmtT4();
        }
   		return impAmtT4;
	}
	

    /**
	 *	Returns the String value of impAmtT4
	 *	@return impAmtT4
	 */
	public char[]  getImpAmtT4ActualString() {
	    String value = String.valueOf(impAmtT4).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update ImpAmtT4 with the passed value
	 *  Corresponding COBOL Variable is WS-IMP-AMT-T4
	 *	@param number
	 */
	public void setImpAmtT4(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    impAmtT4 = checkImpAmtT4MaxLimit(number); 
		serializeImpAmtT4(impAmtT4);
	}
	

	/**
	 * 	Update ImpAmtT4 with the passed value
	 *	@param value (String or char[])
	 */
	public void setImpAmtT4(char[] value) throws CFException {
		 impAmtT4 = serializeImpAmtT4(value);
	}
	/**
	 * 	Update ImpAmtT4 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setImpAmtT4String(char[] value) throws CFException {
		 setImpAmtT4(value);
	}
	/**
	 *	Returns the value of impCnt
	 *	@return impCnt
	 */
	public long getImpCnt() throws CFException {
       if (isImpCntModified()) { 
           impCnt = refreshImpCnt();
        }
   		return impCnt;
	}
	

	
	   
	/**
	 * 	Update ImpCnt with the passed value
	 *  Corresponding COBOL Variable is WS-IMP-CNT
	 *	@param number
	 */
	public void setImpCnt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    impCnt = checkImpCntMaxLimit(number); 
		serializeImpCnt(impCnt);
	}
	

	/**
	 * 	Update ImpCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setImpCnt(char[] value) throws CFException {
		 impCnt = serializeImpCnt(value);
	}
	/**
	 * 	Update ImpCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setImpCntString(char[] value) throws CFException {
		 setImpCnt(value);
	}
	/**
	 *	Returns the value of feeAmtNet
	 *	@return feeAmtNet
	 */
	public long getFeeAmtNet() throws CFException {
       if (isFeeAmtNetModified()) { 
           feeAmtNet = refreshFeeAmtNet();
        }
   		return feeAmtNet;
	}
	

    /**
	 *	Returns the String value of feeAmtNet
	 *	@return feeAmtNet
	 */
	public char[]  getFeeAmtNetActualString() {
	    String value = String.valueOf(feeAmtNet).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update FeeAmtNet with the passed value
	 *  Corresponding COBOL Variable is WS-FEE-AMT-NET
	 *	@param number
	 */
	public void setFeeAmtNet(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    feeAmtNet = checkFeeAmtNetMaxLimit(number); 
		serializeFeeAmtNet(feeAmtNet);
	}
	

	/**
	 * 	Update FeeAmtNet with the passed value
	 *	@param value (String or char[])
	 */
	public void setFeeAmtNet(char[] value) throws CFException {
		 feeAmtNet = serializeFeeAmtNet(value);
	}
	/**
	 * 	Update FeeAmtNet with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFeeAmtNetString(char[] value) throws CFException {
		 setFeeAmtNet(value);
	}
	/**
	 *	Returns the value of tot1FeeAmtCr
	 *	@return tot1FeeAmtCr
	 */
	public long getTot1FeeAmtCr() throws CFException {
       if (isTot1FeeAmtCrModified()) { 
           tot1FeeAmtCr = refreshTot1FeeAmtCr();
        }
   		return tot1FeeAmtCr;
	}
	

    /**
	 *	Returns the String value of tot1FeeAmtCr
	 *	@return tot1FeeAmtCr
	 */
	public char[]  getTot1FeeAmtCrActualString() {
	    String value = String.valueOf(tot1FeeAmtCr).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Tot1FeeAmtCr with the passed value
	 *  Corresponding COBOL Variable is WS-TOT1-FEE-AMT-CR
	 *	@param number
	 */
	public void setTot1FeeAmtCr(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    tot1FeeAmtCr = checkTot1FeeAmtCrMaxLimit(number); 
		serializeTot1FeeAmtCr(tot1FeeAmtCr);
	}
	

	/**
	 * 	Update Tot1FeeAmtCr with the passed value
	 *	@param value (String or char[])
	 */
	public void setTot1FeeAmtCr(char[] value) throws CFException {
		 tot1FeeAmtCr = serializeTot1FeeAmtCr(value);
	}
	/**
	 * 	Update Tot1FeeAmtCr with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTot1FeeAmtCrString(char[] value) throws CFException {
		 setTot1FeeAmtCr(value);
	}
	/**
	 *	Returns the value of tot1FeeAmtDb
	 *	@return tot1FeeAmtDb
	 */
	public long getTot1FeeAmtDb() throws CFException {
       if (isTot1FeeAmtDbModified()) { 
           tot1FeeAmtDb = refreshTot1FeeAmtDb();
        }
   		return tot1FeeAmtDb;
	}
	

    /**
	 *	Returns the String value of tot1FeeAmtDb
	 *	@return tot1FeeAmtDb
	 */
	public char[]  getTot1FeeAmtDbActualString() {
	    String value = String.valueOf(tot1FeeAmtDb).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Tot1FeeAmtDb with the passed value
	 *  Corresponding COBOL Variable is WS-TOT1-FEE-AMT-DB
	 *	@param number
	 */
	public void setTot1FeeAmtDb(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    tot1FeeAmtDb = checkTot1FeeAmtDbMaxLimit(number); 
		serializeTot1FeeAmtDb(tot1FeeAmtDb);
	}
	

	/**
	 * 	Update Tot1FeeAmtDb with the passed value
	 *	@param value (String or char[])
	 */
	public void setTot1FeeAmtDb(char[] value) throws CFException {
		 tot1FeeAmtDb = serializeTot1FeeAmtDb(value);
	}
	/**
	 * 	Update Tot1FeeAmtDb with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTot1FeeAmtDbString(char[] value) throws CFException {
		 setTot1FeeAmtDb(value);
	}
	/**
	 *	Returns the value of tot1FeeAmtNet01
	 *	@return tot1FeeAmtNet01
	 */
	public long getTot1FeeAmtNet01() throws CFException {
       if (isTot1FeeAmtNet01Modified()) { 
           tot1FeeAmtNet01 = refreshTot1FeeAmtNet01();
        }
   		return tot1FeeAmtNet01;
	}
	

    /**
	 *	Returns the String value of tot1FeeAmtNet01
	 *	@return tot1FeeAmtNet01
	 */
	public char[]  getTot1FeeAmtNet01ActualString() {
	    String value = String.valueOf(tot1FeeAmtNet01).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Tot1FeeAmtNet01 with the passed value
	 *  Corresponding COBOL Variable is WS-TOT1-FEE-AMT-NET
	 *	@param number
	 */
	public void setTot1FeeAmtNet01(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    tot1FeeAmtNet01 = checkTot1FeeAmtNet01MaxLimit(number); 
		serializeTot1FeeAmtNet01(tot1FeeAmtNet01);
	}
	

	/**
	 * 	Update Tot1FeeAmtNet01 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTot1FeeAmtNet01(char[] value) throws CFException {
		 tot1FeeAmtNet01 = serializeTot1FeeAmtNet01(value);
	}
	/**
	 * 	Update Tot1FeeAmtNet01 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTot1FeeAmtNet01String(char[] value) throws CFException {
		 setTot1FeeAmtNet01(value);
	}
	/**
	 *	Returns the value of tot1FinAmt01
	 *	@return tot1FinAmt01
	 */
	public long getTot1FinAmt01() throws CFException {
       if (isTot1FinAmt01Modified()) { 
           tot1FinAmt01 = refreshTot1FinAmt01();
        }
   		return tot1FinAmt01;
	}
	

    /**
	 *	Returns the String value of tot1FinAmt01
	 *	@return tot1FinAmt01
	 */
	public char[]  getTot1FinAmt01ActualString() {
	    String value = String.valueOf(tot1FinAmt01).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Tot1FinAmt01 with the passed value
	 *  Corresponding COBOL Variable is WS-TOT1-FIN-AMT
	 *	@param number
	 */
	public void setTot1FinAmt01(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    tot1FinAmt01 = checkTot1FinAmt01MaxLimit(number); 
		serializeTot1FinAmt01(tot1FinAmt01);
	}
	

	/**
	 * 	Update Tot1FinAmt01 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTot1FinAmt01(char[] value) throws CFException {
		 tot1FinAmt01 = serializeTot1FinAmt01(value);
	}
	/**
	 * 	Update Tot1FinAmt01 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTot1FinAmt01String(char[] value) throws CFException {
		 setTot1FinAmt01(value);
	}
	/**
	 *	Returns the value of tot1FinNbr01
	 *	@return tot1FinNbr01
	 */
	public long getTot1FinNbr01() throws CFException {
       if (isTot1FinNbr01Modified()) { 
           tot1FinNbr01 = refreshTot1FinNbr01();
        }
   		return tot1FinNbr01;
	}
	

	
	   
	/**
	 * 	Update Tot1FinNbr01 with the passed value
	 *  Corresponding COBOL Variable is WS-TOT1-FIN-NBR
	 *	@param number
	 */
	public void setTot1FinNbr01(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    tot1FinNbr01 = checkTot1FinNbr01MaxLimit(number); 
		serializeTot1FinNbr01(tot1FinNbr01);
	}
	

	/**
	 * 	Update Tot1FinNbr01 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTot1FinNbr01(char[] value) throws CFException {
		 tot1FinNbr01 = serializeTot1FinNbr01(value);
	}
	/**
	 * 	Update Tot1FinNbr01 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTot1FinNbr01String(char[] value) throws CFException {
		 setTot1FinNbr01(value);
	}
	/**
	 *	Returns the value of tot1FinNbrDen01
	 *	@return tot1FinNbrDen01
	 */
	public long getTot1FinNbrDen01() throws CFException {
       if (isTot1FinNbrDen01Modified()) { 
           tot1FinNbrDen01 = refreshTot1FinNbrDen01();
        }
   		return tot1FinNbrDen01;
	}
	

	
	   
	/**
	 * 	Update Tot1FinNbrDen01 with the passed value
	 *  Corresponding COBOL Variable is WS-TOT1-FIN-NBR-DEN
	 *	@param number
	 */
	public void setTot1FinNbrDen01(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    tot1FinNbrDen01 = checkTot1FinNbrDen01MaxLimit(number); 
		serializeTot1FinNbrDen01(tot1FinNbrDen01);
	}
	

	/**
	 * 	Update Tot1FinNbrDen01 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTot1FinNbrDen01(char[] value) throws CFException {
		 tot1FinNbrDen01 = serializeTot1FinNbrDen01(value);
	}
	/**
	 * 	Update Tot1FinNbrDen01 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTot1FinNbrDen01String(char[] value) throws CFException {
		 setTot1FinNbrDen01(value);
	}
	/**
	 *	Returns the value of tot1FinFeeNbr01
	 *	@return tot1FinFeeNbr01
	 */
	public long getTot1FinFeeNbr01() throws CFException {
       if (isTot1FinFeeNbr01Modified()) { 
           tot1FinFeeNbr01 = refreshTot1FinFeeNbr01();
        }
   		return tot1FinFeeNbr01;
	}
	

	
	   
	/**
	 * 	Update Tot1FinFeeNbr01 with the passed value
	 *  Corresponding COBOL Variable is WS-TOT1-FIN-FEE-NBR
	 *	@param number
	 */
	public void setTot1FinFeeNbr01(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    tot1FinFeeNbr01 = checkTot1FinFeeNbr01MaxLimit(number); 
		serializeTot1FinFeeNbr01(tot1FinFeeNbr01);
	}
	

	/**
	 * 	Update Tot1FinFeeNbr01 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTot1FinFeeNbr01(char[] value) throws CFException {
		 tot1FinFeeNbr01 = serializeTot1FinFeeNbr01(value);
	}
	/**
	 * 	Update Tot1FinFeeNbr01 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTot1FinFeeNbr01String(char[] value) throws CFException {
		 setTot1FinFeeNbr01(value);
	}
	/**
	 *	Returns the value of tot1PctFeeNbr01
	 *	@return tot1PctFeeNbr01
	 */
	public long getTot1PctFeeNbr01() throws CFException {
       if (isTot1PctFeeNbr01Modified()) { 
           tot1PctFeeNbr01 = refreshTot1PctFeeNbr01();
        }
   		return tot1PctFeeNbr01;
	}
	

	
	   
	/**
	 * 	Update Tot1PctFeeNbr01 with the passed value
	 *  Corresponding COBOL Variable is WS-TOT1-PCT-FEE-NBR
	 *	@param number
	 */
	public void setTot1PctFeeNbr01(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    tot1PctFeeNbr01 = checkTot1PctFeeNbr01MaxLimit(number); 
		serializeTot1PctFeeNbr01(tot1PctFeeNbr01);
	}
	

	/**
	 * 	Update Tot1PctFeeNbr01 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTot1PctFeeNbr01(char[] value) throws CFException {
		 tot1PctFeeNbr01 = serializeTot1PctFeeNbr01(value);
	}
	/**
	 * 	Update Tot1PctFeeNbr01 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTot1PctFeeNbr01String(char[] value) throws CFException {
		 setTot1PctFeeNbr01(value);
	}
	/**
	 *	Returns the value of tot1NfinFeeNbr01
	 *	@return tot1NfinFeeNbr01
	 */
	public long getTot1NfinFeeNbr01() throws CFException {
       if (isTot1NfinFeeNbr01Modified()) { 
           tot1NfinFeeNbr01 = refreshTot1NfinFeeNbr01();
        }
   		return tot1NfinFeeNbr01;
	}
	

	
	   
	/**
	 * 	Update Tot1NfinFeeNbr01 with the passed value
	 *  Corresponding COBOL Variable is WS-TOT1-NFIN-FEE-NBR
	 *	@param number
	 */
	public void setTot1NfinFeeNbr01(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    tot1NfinFeeNbr01 = checkTot1NfinFeeNbr01MaxLimit(number); 
		serializeTot1NfinFeeNbr01(tot1NfinFeeNbr01);
	}
	

	/**
	 * 	Update Tot1NfinFeeNbr01 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTot1NfinFeeNbr01(char[] value) throws CFException {
		 tot1NfinFeeNbr01 = serializeTot1NfinFeeNbr01(value);
	}
	/**
	 * 	Update Tot1NfinFeeNbr01 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTot1NfinFeeNbr01String(char[] value) throws CFException {
		 setTot1NfinFeeNbr01(value);
	}
	/**
	 *	Returns the value of tot1NbilFeeNbr01
	 *	@return tot1NbilFeeNbr01
	 */
	public long getTot1NbilFeeNbr01() throws CFException {
       if (isTot1NbilFeeNbr01Modified()) { 
           tot1NbilFeeNbr01 = refreshTot1NbilFeeNbr01();
        }
   		return tot1NbilFeeNbr01;
	}
	

	
	   
	/**
	 * 	Update Tot1NbilFeeNbr01 with the passed value
	 *  Corresponding COBOL Variable is WS-TOT1-NBIL-FEE-NBR
	 *	@param number
	 */
	public void setTot1NbilFeeNbr01(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    tot1NbilFeeNbr01 = checkTot1NbilFeeNbr01MaxLimit(number); 
		serializeTot1NbilFeeNbr01(tot1NbilFeeNbr01);
	}
	

	/**
	 * 	Update Tot1NbilFeeNbr01 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTot1NbilFeeNbr01(char[] value) throws CFException {
		 tot1NbilFeeNbr01 = serializeTot1NbilFeeNbr01(value);
	}
	/**
	 * 	Update Tot1NbilFeeNbr01 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTot1NbilFeeNbr01String(char[] value) throws CFException {
		 setTot1NbilFeeNbr01(value);
	}
	/**
	 *	Returns the value of exp1FeeAmtCr
	 *	@return exp1FeeAmtCr
	 */
	public long getExp1FeeAmtCr() throws CFException {
       if (isExp1FeeAmtCrModified()) { 
           exp1FeeAmtCr = refreshExp1FeeAmtCr();
        }
   		return exp1FeeAmtCr;
	}
	

    /**
	 *	Returns the String value of exp1FeeAmtCr
	 *	@return exp1FeeAmtCr
	 */
	public char[]  getExp1FeeAmtCrActualString() {
	    String value = String.valueOf(exp1FeeAmtCr).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Exp1FeeAmtCr with the passed value
	 *  Corresponding COBOL Variable is WS-EXP1-FEE-AMT-CR
	 *	@param number
	 */
	public void setExp1FeeAmtCr(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    exp1FeeAmtCr = checkExp1FeeAmtCrMaxLimit(number); 
		serializeExp1FeeAmtCr(exp1FeeAmtCr);
	}
	

	/**
	 * 	Update Exp1FeeAmtCr with the passed value
	 *	@param value (String or char[])
	 */
	public void setExp1FeeAmtCr(char[] value) throws CFException {
		 exp1FeeAmtCr = serializeExp1FeeAmtCr(value);
	}
	/**
	 * 	Update Exp1FeeAmtCr with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setExp1FeeAmtCrString(char[] value) throws CFException {
		 setExp1FeeAmtCr(value);
	}
	/**
	 *	Returns the value of exp1FeeAmtDb
	 *	@return exp1FeeAmtDb
	 */
	public long getExp1FeeAmtDb() throws CFException {
       if (isExp1FeeAmtDbModified()) { 
           exp1FeeAmtDb = refreshExp1FeeAmtDb();
        }
   		return exp1FeeAmtDb;
	}
	

    /**
	 *	Returns the String value of exp1FeeAmtDb
	 *	@return exp1FeeAmtDb
	 */
	public char[]  getExp1FeeAmtDbActualString() {
	    String value = String.valueOf(exp1FeeAmtDb).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Exp1FeeAmtDb with the passed value
	 *  Corresponding COBOL Variable is WS-EXP1-FEE-AMT-DB
	 *	@param number
	 */
	public void setExp1FeeAmtDb(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    exp1FeeAmtDb = checkExp1FeeAmtDbMaxLimit(number); 
		serializeExp1FeeAmtDb(exp1FeeAmtDb);
	}
	

	/**
	 * 	Update Exp1FeeAmtDb with the passed value
	 *	@param value (String or char[])
	 */
	public void setExp1FeeAmtDb(char[] value) throws CFException {
		 exp1FeeAmtDb = serializeExp1FeeAmtDb(value);
	}
	/**
	 * 	Update Exp1FeeAmtDb with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setExp1FeeAmtDbString(char[] value) throws CFException {
		 setExp1FeeAmtDb(value);
	}
	/**
	 *	Returns the value of exp1FeeAmtNet01
	 *	@return exp1FeeAmtNet01
	 */
	public long getExp1FeeAmtNet01() throws CFException {
       if (isExp1FeeAmtNet01Modified()) { 
           exp1FeeAmtNet01 = refreshExp1FeeAmtNet01();
        }
   		return exp1FeeAmtNet01;
	}
	

    /**
	 *	Returns the String value of exp1FeeAmtNet01
	 *	@return exp1FeeAmtNet01
	 */
	public char[]  getExp1FeeAmtNet01ActualString() {
	    String value = String.valueOf(exp1FeeAmtNet01).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Exp1FeeAmtNet01 with the passed value
	 *  Corresponding COBOL Variable is WS-EXP1-FEE-AMT-NET
	 *	@param number
	 */
	public void setExp1FeeAmtNet01(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    exp1FeeAmtNet01 = checkExp1FeeAmtNet01MaxLimit(number); 
		serializeExp1FeeAmtNet01(exp1FeeAmtNet01);
	}
	

	/**
	 * 	Update Exp1FeeAmtNet01 with the passed value
	 *	@param value (String or char[])
	 */
	public void setExp1FeeAmtNet01(char[] value) throws CFException {
		 exp1FeeAmtNet01 = serializeExp1FeeAmtNet01(value);
	}
	/**
	 * 	Update Exp1FeeAmtNet01 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setExp1FeeAmtNet01String(char[] value) throws CFException {
		 setExp1FeeAmtNet01(value);
	}
	/**
	 *	Returns the value of exp1FinAmt01
	 *	@return exp1FinAmt01
	 */
	public long getExp1FinAmt01() throws CFException {
       if (isExp1FinAmt01Modified()) { 
           exp1FinAmt01 = refreshExp1FinAmt01();
        }
   		return exp1FinAmt01;
	}
	

    /**
	 *	Returns the String value of exp1FinAmt01
	 *	@return exp1FinAmt01
	 */
	public char[]  getExp1FinAmt01ActualString() {
	    String value = String.valueOf(exp1FinAmt01).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Exp1FinAmt01 with the passed value
	 *  Corresponding COBOL Variable is WS-EXP1-FIN-AMT
	 *	@param number
	 */
	public void setExp1FinAmt01(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    exp1FinAmt01 = checkExp1FinAmt01MaxLimit(number); 
		serializeExp1FinAmt01(exp1FinAmt01);
	}
	

	/**
	 * 	Update Exp1FinAmt01 with the passed value
	 *	@param value (String or char[])
	 */
	public void setExp1FinAmt01(char[] value) throws CFException {
		 exp1FinAmt01 = serializeExp1FinAmt01(value);
	}
	/**
	 * 	Update Exp1FinAmt01 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setExp1FinAmt01String(char[] value) throws CFException {
		 setExp1FinAmt01(value);
	}
	/**
	 *	Returns the value of exp1FinNbr01
	 *	@return exp1FinNbr01
	 */
	public long getExp1FinNbr01() throws CFException {
       if (isExp1FinNbr01Modified()) { 
           exp1FinNbr01 = refreshExp1FinNbr01();
        }
   		return exp1FinNbr01;
	}
	

	
	   
	/**
	 * 	Update Exp1FinNbr01 with the passed value
	 *  Corresponding COBOL Variable is WS-EXP1-FIN-NBR
	 *	@param number
	 */
	public void setExp1FinNbr01(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    exp1FinNbr01 = checkExp1FinNbr01MaxLimit(number); 
		serializeExp1FinNbr01(exp1FinNbr01);
	}
	

	/**
	 * 	Update Exp1FinNbr01 with the passed value
	 *	@param value (String or char[])
	 */
	public void setExp1FinNbr01(char[] value) throws CFException {
		 exp1FinNbr01 = serializeExp1FinNbr01(value);
	}
	/**
	 * 	Update Exp1FinNbr01 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setExp1FinNbr01String(char[] value) throws CFException {
		 setExp1FinNbr01(value);
	}
	/**
	 *	Returns the value of exp1FinNbrDen01
	 *	@return exp1FinNbrDen01
	 */
	public long getExp1FinNbrDen01() throws CFException {
       if (isExp1FinNbrDen01Modified()) { 
           exp1FinNbrDen01 = refreshExp1FinNbrDen01();
        }
   		return exp1FinNbrDen01;
	}
	

	
	   
	/**
	 * 	Update Exp1FinNbrDen01 with the passed value
	 *  Corresponding COBOL Variable is WS-EXP1-FIN-NBR-DEN
	 *	@param number
	 */
	public void setExp1FinNbrDen01(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    exp1FinNbrDen01 = checkExp1FinNbrDen01MaxLimit(number); 
		serializeExp1FinNbrDen01(exp1FinNbrDen01);
	}
	

	/**
	 * 	Update Exp1FinNbrDen01 with the passed value
	 *	@param value (String or char[])
	 */
	public void setExp1FinNbrDen01(char[] value) throws CFException {
		 exp1FinNbrDen01 = serializeExp1FinNbrDen01(value);
	}
	/**
	 * 	Update Exp1FinNbrDen01 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setExp1FinNbrDen01String(char[] value) throws CFException {
		 setExp1FinNbrDen01(value);
	}
	/**
	 *	Returns the value of exp1FinFeeNbr01
	 *	@return exp1FinFeeNbr01
	 */
	public long getExp1FinFeeNbr01() throws CFException {
       if (isExp1FinFeeNbr01Modified()) { 
           exp1FinFeeNbr01 = refreshExp1FinFeeNbr01();
        }
   		return exp1FinFeeNbr01;
	}
	

	
	   
	/**
	 * 	Update Exp1FinFeeNbr01 with the passed value
	 *  Corresponding COBOL Variable is WS-EXP1-FIN-FEE-NBR
	 *	@param number
	 */
	public void setExp1FinFeeNbr01(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    exp1FinFeeNbr01 = checkExp1FinFeeNbr01MaxLimit(number); 
		serializeExp1FinFeeNbr01(exp1FinFeeNbr01);
	}
	

	/**
	 * 	Update Exp1FinFeeNbr01 with the passed value
	 *	@param value (String or char[])
	 */
	public void setExp1FinFeeNbr01(char[] value) throws CFException {
		 exp1FinFeeNbr01 = serializeExp1FinFeeNbr01(value);
	}
	/**
	 * 	Update Exp1FinFeeNbr01 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setExp1FinFeeNbr01String(char[] value) throws CFException {
		 setExp1FinFeeNbr01(value);
	}
	/**
	 *	Returns the value of exp1PctFeeNbr01
	 *	@return exp1PctFeeNbr01
	 */
	public long getExp1PctFeeNbr01() throws CFException {
       if (isExp1PctFeeNbr01Modified()) { 
           exp1PctFeeNbr01 = refreshExp1PctFeeNbr01();
        }
   		return exp1PctFeeNbr01;
	}
	

	
	   
	/**
	 * 	Update Exp1PctFeeNbr01 with the passed value
	 *  Corresponding COBOL Variable is WS-EXP1-PCT-FEE-NBR
	 *	@param number
	 */
	public void setExp1PctFeeNbr01(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    exp1PctFeeNbr01 = checkExp1PctFeeNbr01MaxLimit(number); 
		serializeExp1PctFeeNbr01(exp1PctFeeNbr01);
	}
	

	/**
	 * 	Update Exp1PctFeeNbr01 with the passed value
	 *	@param value (String or char[])
	 */
	public void setExp1PctFeeNbr01(char[] value) throws CFException {
		 exp1PctFeeNbr01 = serializeExp1PctFeeNbr01(value);
	}
	/**
	 * 	Update Exp1PctFeeNbr01 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setExp1PctFeeNbr01String(char[] value) throws CFException {
		 setExp1PctFeeNbr01(value);
	}
	/**
	 *	Returns the value of exp1NfinFeeNbr01
	 *	@return exp1NfinFeeNbr01
	 */
	public long getExp1NfinFeeNbr01() throws CFException {
       if (isExp1NfinFeeNbr01Modified()) { 
           exp1NfinFeeNbr01 = refreshExp1NfinFeeNbr01();
        }
   		return exp1NfinFeeNbr01;
	}
	

	
	   
	/**
	 * 	Update Exp1NfinFeeNbr01 with the passed value
	 *  Corresponding COBOL Variable is WS-EXP1-NFIN-FEE-NBR
	 *	@param number
	 */
	public void setExp1NfinFeeNbr01(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    exp1NfinFeeNbr01 = checkExp1NfinFeeNbr01MaxLimit(number); 
		serializeExp1NfinFeeNbr01(exp1NfinFeeNbr01);
	}
	

	/**
	 * 	Update Exp1NfinFeeNbr01 with the passed value
	 *	@param value (String or char[])
	 */
	public void setExp1NfinFeeNbr01(char[] value) throws CFException {
		 exp1NfinFeeNbr01 = serializeExp1NfinFeeNbr01(value);
	}
	/**
	 * 	Update Exp1NfinFeeNbr01 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setExp1NfinFeeNbr01String(char[] value) throws CFException {
		 setExp1NfinFeeNbr01(value);
	}
	/**
	 *	Returns the value of exp1NbilFeeNbr01
	 *	@return exp1NbilFeeNbr01
	 */
	public long getExp1NbilFeeNbr01() throws CFException {
       if (isExp1NbilFeeNbr01Modified()) { 
           exp1NbilFeeNbr01 = refreshExp1NbilFeeNbr01();
        }
   		return exp1NbilFeeNbr01;
	}
	

	
	   
	/**
	 * 	Update Exp1NbilFeeNbr01 with the passed value
	 *  Corresponding COBOL Variable is WS-EXP1-NBIL-FEE-NBR
	 *	@param number
	 */
	public void setExp1NbilFeeNbr01(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    exp1NbilFeeNbr01 = checkExp1NbilFeeNbr01MaxLimit(number); 
		serializeExp1NbilFeeNbr01(exp1NbilFeeNbr01);
	}
	

	/**
	 * 	Update Exp1NbilFeeNbr01 with the passed value
	 *	@param value (String or char[])
	 */
	public void setExp1NbilFeeNbr01(char[] value) throws CFException {
		 exp1NbilFeeNbr01 = serializeExp1NbilFeeNbr01(value);
	}
	/**
	 * 	Update Exp1NbilFeeNbr01 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setExp1NbilFeeNbr01String(char[] value) throws CFException {
		 setExp1NbilFeeNbr01(value);
	}
	/**
	 *	Returns the value of sub1FeeAmtCr
	 *	@return sub1FeeAmtCr
	 */
	public long getSub1FeeAmtCr() throws CFException {
       if (isSub1FeeAmtCrModified()) { 
           sub1FeeAmtCr = refreshSub1FeeAmtCr();
        }
   		return sub1FeeAmtCr;
	}
	

    /**
	 *	Returns the String value of sub1FeeAmtCr
	 *	@return sub1FeeAmtCr
	 */
	public char[]  getSub1FeeAmtCrActualString() {
	    String value = String.valueOf(sub1FeeAmtCr).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Sub1FeeAmtCr with the passed value
	 *  Corresponding COBOL Variable is WS-SUB1-FEE-AMT-CR
	 *	@param number
	 */
	public void setSub1FeeAmtCr(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    sub1FeeAmtCr = checkSub1FeeAmtCrMaxLimit(number); 
		serializeSub1FeeAmtCr(sub1FeeAmtCr);
	}
	

	/**
	 * 	Update Sub1FeeAmtCr with the passed value
	 *	@param value (String or char[])
	 */
	public void setSub1FeeAmtCr(char[] value) throws CFException {
		 sub1FeeAmtCr = serializeSub1FeeAmtCr(value);
	}
	/**
	 * 	Update Sub1FeeAmtCr with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSub1FeeAmtCrString(char[] value) throws CFException {
		 setSub1FeeAmtCr(value);
	}
	/**
	 *	Returns the value of sub1FeeAmtDb
	 *	@return sub1FeeAmtDb
	 */
	public long getSub1FeeAmtDb() throws CFException {
       if (isSub1FeeAmtDbModified()) { 
           sub1FeeAmtDb = refreshSub1FeeAmtDb();
        }
   		return sub1FeeAmtDb;
	}
	

    /**
	 *	Returns the String value of sub1FeeAmtDb
	 *	@return sub1FeeAmtDb
	 */
	public char[]  getSub1FeeAmtDbActualString() {
	    String value = String.valueOf(sub1FeeAmtDb).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Sub1FeeAmtDb with the passed value
	 *  Corresponding COBOL Variable is WS-SUB1-FEE-AMT-DB
	 *	@param number
	 */
	public void setSub1FeeAmtDb(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    sub1FeeAmtDb = checkSub1FeeAmtDbMaxLimit(number); 
		serializeSub1FeeAmtDb(sub1FeeAmtDb);
	}
	

	/**
	 * 	Update Sub1FeeAmtDb with the passed value
	 *	@param value (String or char[])
	 */
	public void setSub1FeeAmtDb(char[] value) throws CFException {
		 sub1FeeAmtDb = serializeSub1FeeAmtDb(value);
	}
	/**
	 * 	Update Sub1FeeAmtDb with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSub1FeeAmtDbString(char[] value) throws CFException {
		 setSub1FeeAmtDb(value);
	}
	/**
	 *	Returns the value of sub1FeeAmtNet01
	 *	@return sub1FeeAmtNet01
	 */
	public long getSub1FeeAmtNet01() throws CFException {
       if (isSub1FeeAmtNet01Modified()) { 
           sub1FeeAmtNet01 = refreshSub1FeeAmtNet01();
        }
   		return sub1FeeAmtNet01;
	}
	

    /**
	 *	Returns the String value of sub1FeeAmtNet01
	 *	@return sub1FeeAmtNet01
	 */
	public char[]  getSub1FeeAmtNet01ActualString() {
	    String value = String.valueOf(sub1FeeAmtNet01).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Sub1FeeAmtNet01 with the passed value
	 *  Corresponding COBOL Variable is WS-SUB1-FEE-AMT-NET
	 *	@param number
	 */
	public void setSub1FeeAmtNet01(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    sub1FeeAmtNet01 = checkSub1FeeAmtNet01MaxLimit(number); 
		serializeSub1FeeAmtNet01(sub1FeeAmtNet01);
	}
	

	/**
	 * 	Update Sub1FeeAmtNet01 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSub1FeeAmtNet01(char[] value) throws CFException {
		 sub1FeeAmtNet01 = serializeSub1FeeAmtNet01(value);
	}
	/**
	 * 	Update Sub1FeeAmtNet01 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSub1FeeAmtNet01String(char[] value) throws CFException {
		 setSub1FeeAmtNet01(value);
	}
	/**
	 *	Returns the value of sub1FinAmt01
	 *	@return sub1FinAmt01
	 */
	public long getSub1FinAmt01() throws CFException {
       if (isSub1FinAmt01Modified()) { 
           sub1FinAmt01 = refreshSub1FinAmt01();
        }
   		return sub1FinAmt01;
	}
	

    /**
	 *	Returns the String value of sub1FinAmt01
	 *	@return sub1FinAmt01
	 */
	public char[]  getSub1FinAmt01ActualString() {
	    String value = String.valueOf(sub1FinAmt01).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Sub1FinAmt01 with the passed value
	 *  Corresponding COBOL Variable is WS-SUB1-FIN-AMT
	 *	@param number
	 */
	public void setSub1FinAmt01(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    sub1FinAmt01 = checkSub1FinAmt01MaxLimit(number); 
		serializeSub1FinAmt01(sub1FinAmt01);
	}
	

	/**
	 * 	Update Sub1FinAmt01 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSub1FinAmt01(char[] value) throws CFException {
		 sub1FinAmt01 = serializeSub1FinAmt01(value);
	}
	/**
	 * 	Update Sub1FinAmt01 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSub1FinAmt01String(char[] value) throws CFException {
		 setSub1FinAmt01(value);
	}
	/**
	 *	Returns the value of sub1FinNbr01
	 *	@return sub1FinNbr01
	 */
	public long getSub1FinNbr01() throws CFException {
       if (isSub1FinNbr01Modified()) { 
           sub1FinNbr01 = refreshSub1FinNbr01();
        }
   		return sub1FinNbr01;
	}
	

	
	   
	/**
	 * 	Update Sub1FinNbr01 with the passed value
	 *  Corresponding COBOL Variable is WS-SUB1-FIN-NBR
	 *	@param number
	 */
	public void setSub1FinNbr01(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    sub1FinNbr01 = checkSub1FinNbr01MaxLimit(number); 
		serializeSub1FinNbr01(sub1FinNbr01);
	}
	

	/**
	 * 	Update Sub1FinNbr01 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSub1FinNbr01(char[] value) throws CFException {
		 sub1FinNbr01 = serializeSub1FinNbr01(value);
	}
	/**
	 * 	Update Sub1FinNbr01 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSub1FinNbr01String(char[] value) throws CFException {
		 setSub1FinNbr01(value);
	}
	/**
	 *	Returns the value of sub1FinNbrDen01
	 *	@return sub1FinNbrDen01
	 */
	public long getSub1FinNbrDen01() throws CFException {
       if (isSub1FinNbrDen01Modified()) { 
           sub1FinNbrDen01 = refreshSub1FinNbrDen01();
        }
   		return sub1FinNbrDen01;
	}
	

	
	   
	/**
	 * 	Update Sub1FinNbrDen01 with the passed value
	 *  Corresponding COBOL Variable is WS-SUB1-FIN-NBR-DEN
	 *	@param number
	 */
	public void setSub1FinNbrDen01(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    sub1FinNbrDen01 = checkSub1FinNbrDen01MaxLimit(number); 
		serializeSub1FinNbrDen01(sub1FinNbrDen01);
	}
	

	/**
	 * 	Update Sub1FinNbrDen01 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSub1FinNbrDen01(char[] value) throws CFException {
		 sub1FinNbrDen01 = serializeSub1FinNbrDen01(value);
	}
	/**
	 * 	Update Sub1FinNbrDen01 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSub1FinNbrDen01String(char[] value) throws CFException {
		 setSub1FinNbrDen01(value);
	}
	/**
	 *	Returns the value of sub1FinFeeNbr01
	 *	@return sub1FinFeeNbr01
	 */
	public long getSub1FinFeeNbr01() throws CFException {
       if (isSub1FinFeeNbr01Modified()) { 
           sub1FinFeeNbr01 = refreshSub1FinFeeNbr01();
        }
   		return sub1FinFeeNbr01;
	}
	

	
	   
	/**
	 * 	Update Sub1FinFeeNbr01 with the passed value
	 *  Corresponding COBOL Variable is WS-SUB1-FIN-FEE-NBR
	 *	@param number
	 */
	public void setSub1FinFeeNbr01(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    sub1FinFeeNbr01 = checkSub1FinFeeNbr01MaxLimit(number); 
		serializeSub1FinFeeNbr01(sub1FinFeeNbr01);
	}
	

	/**
	 * 	Update Sub1FinFeeNbr01 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSub1FinFeeNbr01(char[] value) throws CFException {
		 sub1FinFeeNbr01 = serializeSub1FinFeeNbr01(value);
	}
	/**
	 * 	Update Sub1FinFeeNbr01 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSub1FinFeeNbr01String(char[] value) throws CFException {
		 setSub1FinFeeNbr01(value);
	}
	/**
	 *	Returns the value of sub1PctFeeNbr01
	 *	@return sub1PctFeeNbr01
	 */
	public long getSub1PctFeeNbr01() throws CFException {
       if (isSub1PctFeeNbr01Modified()) { 
           sub1PctFeeNbr01 = refreshSub1PctFeeNbr01();
        }
   		return sub1PctFeeNbr01;
	}
	

	
	   
	/**
	 * 	Update Sub1PctFeeNbr01 with the passed value
	 *  Corresponding COBOL Variable is WS-SUB1-PCT-FEE-NBR
	 *	@param number
	 */
	public void setSub1PctFeeNbr01(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    sub1PctFeeNbr01 = checkSub1PctFeeNbr01MaxLimit(number); 
		serializeSub1PctFeeNbr01(sub1PctFeeNbr01);
	}
	

	/**
	 * 	Update Sub1PctFeeNbr01 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSub1PctFeeNbr01(char[] value) throws CFException {
		 sub1PctFeeNbr01 = serializeSub1PctFeeNbr01(value);
	}
	/**
	 * 	Update Sub1PctFeeNbr01 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSub1PctFeeNbr01String(char[] value) throws CFException {
		 setSub1PctFeeNbr01(value);
	}
	/**
	 *	Returns the value of sub1NfinFeeNbr01
	 *	@return sub1NfinFeeNbr01
	 */
	public long getSub1NfinFeeNbr01() throws CFException {
       if (isSub1NfinFeeNbr01Modified()) { 
           sub1NfinFeeNbr01 = refreshSub1NfinFeeNbr01();
        }
   		return sub1NfinFeeNbr01;
	}
	

	
	   
	/**
	 * 	Update Sub1NfinFeeNbr01 with the passed value
	 *  Corresponding COBOL Variable is WS-SUB1-NFIN-FEE-NBR
	 *	@param number
	 */
	public void setSub1NfinFeeNbr01(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    sub1NfinFeeNbr01 = checkSub1NfinFeeNbr01MaxLimit(number); 
		serializeSub1NfinFeeNbr01(sub1NfinFeeNbr01);
	}
	

	/**
	 * 	Update Sub1NfinFeeNbr01 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSub1NfinFeeNbr01(char[] value) throws CFException {
		 sub1NfinFeeNbr01 = serializeSub1NfinFeeNbr01(value);
	}
	/**
	 * 	Update Sub1NfinFeeNbr01 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSub1NfinFeeNbr01String(char[] value) throws CFException {
		 setSub1NfinFeeNbr01(value);
	}
	/**
	 *	Returns the value of sub1NbilFeeNbr01
	 *	@return sub1NbilFeeNbr01
	 */
	public long getSub1NbilFeeNbr01() throws CFException {
       if (isSub1NbilFeeNbr01Modified()) { 
           sub1NbilFeeNbr01 = refreshSub1NbilFeeNbr01();
        }
   		return sub1NbilFeeNbr01;
	}
	

	
	   
	/**
	 * 	Update Sub1NbilFeeNbr01 with the passed value
	 *  Corresponding COBOL Variable is WS-SUB1-NBIL-FEE-NBR
	 *	@param number
	 */
	public void setSub1NbilFeeNbr01(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    sub1NbilFeeNbr01 = checkSub1NbilFeeNbr01MaxLimit(number); 
		serializeSub1NbilFeeNbr01(sub1NbilFeeNbr01);
	}
	

	/**
	 * 	Update Sub1NbilFeeNbr01 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSub1NbilFeeNbr01(char[] value) throws CFException {
		 sub1NbilFeeNbr01 = serializeSub1NbilFeeNbr01(value);
	}
	/**
	 * 	Update Sub1NbilFeeNbr01 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSub1NbilFeeNbr01String(char[] value) throws CFException {
		 setSub1NbilFeeNbr01(value);
	}
	/**
	 *	Returns the value of saveWsAmtep
	 *	@return saveWsAmtep
	 */
   public char[] getSaveWsAmtep() throws CFException{
   		return saveWsAmtep;
   }

  
	/**
	*  set variable saveWsAmtep
	*  Corresponding COBOL Variable is SAVE-WS-AMTEP
	*  @param value
	**/
   public void setSaveWsAmtep(char[] value) {
       value = checkSaveWsAmtepConstraints(value);
       arraycopy(value,0,saveWsAmtep,0,value.length);
   } 
	public void setSaveWsAmtep(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,saveWsAmtep,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of saveWsAmtdt4
	 *	@return saveWsAmtdt4
	 */
   public char[] getSaveWsAmtdt4() throws CFException{
   		return saveWsAmtdt4;
   }

  
	/**
	*  set variable saveWsAmtdt4
	*  Corresponding COBOL Variable is SAVE-WS-AMTDT4
	*  @param value
	**/
   public void setSaveWsAmtdt4(char[] value) {
       value = checkSaveWsAmtdt4Constraints(value);
       arraycopy(value,0,saveWsAmtdt4,0,value.length);
   } 
	public void setSaveWsAmtdt4(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,saveWsAmtdt4,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of saveWsAmte
	 *	@return saveWsAmte
	 */
   public char[] getSaveWsAmte() throws CFException{
   		return saveWsAmte;
   }

  
	/**
	*  set variable saveWsAmte
	*  Corresponding COBOL Variable is SAVE-WS-AMTE
	*  @param value
	**/
   public void setSaveWsAmte(char[] value) {
       value = checkSaveWsAmteConstraints(value);
       arraycopy(value,0,saveWsAmte,0,value.length);
   } 
	public void setSaveWsAmte(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,saveWsAmte,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of swTranEof
	 *	@return swTranEof
	 */
   public char[] getSwTranEof() throws CFException{
   		return swTranEof;
   }

  
	/**
	*  set variable swTranEof
	*  Corresponding COBOL Variable is SW-TRAN-EOF
	*  @param value
	**/
   public void setSwTranEof(char[] value) {
       value = checkSwTranEofConstraints(value);
       arraycopy(value,0,swTranEof,0,value.length);
   } 
	public void setSwTranEof(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,swTranEof,0,beginIndex + endIndex);
   }
	char[] swTranEofValue88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isSwTranEofValue()
	 *	@return  Returns true if isSwTranEofValue() is "Y"
	 */
   public boolean isSwTranEofValue() throws CFException {
      return (  compareChars( getSwTranEof() , swTranEofValue88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setSwTranEofValueTrue() {  			
    	setSwTranEof( swTranEofValue88Value);
   	}
	/**
	 *	Returns the value of tranApc
	 *	@return tranApc
	 */
   public char[] getTranApc() throws CFException{
   		return tranApc;
   }

  
	/**
	*  set variable tranApc
	*  Corresponding COBOL Variable is WS-TRAN-APC
	*  @param value
	**/
   public void setTranApc(char[] value) {
       value = checkTranApcConstraints(value);
       arraycopy(value,0,tranApc,0,value.length);
   } 
	public void setTranApc(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tranApc,0,beginIndex + endIndex);
   }
	char[] swTranApc88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isSwTranApc()
	 *	@return  Returns true if isSwTranApc() is "Y"
	 */
   public boolean isSwTranApc() throws CFException {
      return (  compareChars( getTranApc() , swTranApc88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setSwTranApcTrue() {  			
    	setTranApc( swTranApc88Value);
   	}
	char[] swTranNoApc88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isSwTranNoApc()
	 *	@return  Returns true if isSwTranNoApc() is "N"
	 */
   public boolean isSwTranNoApc() throws CFException {
      return (  compareChars( getTranApc() , swTranNoApc88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setSwTranNoApcTrue() {  			
    	setTranApc( swTranNoApc88Value);
   	}
	/**
	 *	Returns the value of tranIca
	 *	@return tranIca
	 */
   public char[] getTranIca() throws CFException{
   		return tranIca;
   }

  
	/**
	*  set variable tranIca
	*  Corresponding COBOL Variable is WS-TRAN-ICA
	*  @param value
	**/
   public void setTranIca(char[] value) {
       value = checkTranIcaConstraints(value);
       arraycopy(value,0,tranIca,0,value.length);
   } 
	public void setTranIca(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tranIca,0,beginIndex + endIndex);
   }
	char[] icaFound88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIcaFound()
	 *	@return  Returns true if isIcaFound() is "Y"
	 */
   public boolean isIcaFound() throws CFException {
      return (  compareChars( getTranIca() , icaFound88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIcaFoundTrue() {  			
    	setTranIca( icaFound88Value);
   	}
	char[] icaNotFound88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIcaNotFound()
	 *	@return  Returns true if isIcaNotFound() is "N"
	 */
   public boolean isIcaNotFound() throws CFException {
      return (  compareChars( getTranIca() , icaNotFound88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIcaNotFoundTrue() {  			
    	setTranIca( icaNotFound88Value);
   	}
	/**
	 *	Returns the value of maxDays
	 *	@return maxDays
	 */
	public int getMaxDays() throws CFException {
       if (isMaxDaysModified()) { 
           maxDays = refreshMaxDays();
        }
   		return maxDays;
	}
	

	
	   
	/**
	 * 	Update MaxDays with the passed value
	 *  Corresponding COBOL Variable is MAX-DAYS
	 *	@param number
	 */
	public void setMaxDays(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    maxDays = checkMaxDaysMaxLimit(number); 
		serializeMaxDays(maxDays);
	}
	

	public void setMaxDays(long number) {
	    number = checkMaxDaysMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMaxDays((int)number);
	}
	
	/**
	 * 	Update MaxDays with the passed value
	 *	@param value (String or char[])
	 */
	public void setMaxDays(char[] value) throws CFException {
		 maxDays = serializeMaxDays(value);
	}
	/**
	 * 	Update MaxDays with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMaxDaysString(char[] value) throws CFException {
		 setMaxDays(value);
	}
	/**
	 *	Returns the value of message1
	 *	@return message1
	 */
   public char[] getMessage1() throws CFException{
   		return message1;
   }

  
	/**
	*  set variable message1
	*  Corresponding COBOL Variable is MESSAGE1
	*  @param value
	**/
   public void setMessage1(char[] value) {
       value = checkMessage1Constraints(value);
       arraycopy(value,0,message1,0,value.length);
   } 
	public void setMessage1(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,message1,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of message2
	 *	@return message2
	 */
   public char[] getMessage2() throws CFException{
   		return message2;
   }

  
	/**
	*  set variable message2
	*  Corresponding COBOL Variable is MESSAGE2
	*  @param value
	**/
   public void setMessage2(char[] value) {
       value = checkMessage2Constraints(value);
       arraycopy(value,0,message2,0,value.length);
   } 
	public void setMessage2(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,message2,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of message3
	 *	@return message3
	 */
   public char[] getMessage3() throws CFException{
   		return message3;
   }

  
	/**
	*  set variable message3
	*  Corresponding COBOL Variable is MESSAGE3
	*  @param value
	**/
   public void setMessage3(char[] value) {
       value = checkMessage3Constraints(value);
       arraycopy(value,0,message3,0,value.length);
   } 
	public void setMessage3(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,message3,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of msg002NoParmInType
	 *	@return msg002NoParmInType
	 */
   public char[] getMsg002NoParmInType() throws CFException{
   		return msg002NoParmInType;
   }

  
	/**
	*  set variable msg002NoParmInType
	*  Corresponding COBOL Variable is MSG002-NO-PARM-IN-TYPE
	*  @param value
	**/
   public void setMsg002NoParmInType(char[] value) {
       value = checkMsg002NoParmInTypeConstraints(value);
       arraycopy(value,0,msg002NoParmInType,0,value.length);
   } 
	public void setMsg002NoParmInType(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,msg002NoParmInType,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of mcrInCnt
	 *	@return mcrInCnt
	 */
	public long getMcrInCnt() throws CFException {
       if (isMcrInCntModified()) { 
           mcrInCnt = refreshMcrInCnt();
        }
   		return mcrInCnt;
	}
	

	
	   
	/**
	 * 	Update McrInCnt with the passed value
	 *  Corresponding COBOL Variable is MCR-IN-CNT
	 *	@param number
	 */
	public void setMcrInCnt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    mcrInCnt = checkMcrInCntMaxLimit(number); 
		serializeMcrInCnt(mcrInCnt);
	}
	

	/**
	 * 	Update McrInCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setMcrInCnt(char[] value) throws CFException {
		 mcrInCnt = serializeMcrInCnt(value);
	}
	/**
	 * 	Update McrInCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMcrInCntString(char[] value) throws CFException {
		 setMcrInCnt(value);
	}
	/**
	 *	Returns the value of mcrSkippedCnt
	 *	@return mcrSkippedCnt
	 */
	public long getMcrSkippedCnt() throws CFException {
       if (isMcrSkippedCntModified()) { 
           mcrSkippedCnt = refreshMcrSkippedCnt();
        }
   		return mcrSkippedCnt;
	}
	

	
	   
	/**
	 * 	Update McrSkippedCnt with the passed value
	 *  Corresponding COBOL Variable is MCR-SKIPPED-CNT
	 *	@param number
	 */
	public void setMcrSkippedCnt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    mcrSkippedCnt = checkMcrSkippedCntMaxLimit(number); 
		serializeMcrSkippedCnt(mcrSkippedCnt);
	}
	

	/**
	 * 	Update McrSkippedCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setMcrSkippedCnt(char[] value) throws CFException {
		 mcrSkippedCnt = serializeMcrSkippedCnt(value);
	}
	/**
	 * 	Update McrSkippedCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMcrSkippedCntString(char[] value) throws CFException {
		 setMcrSkippedCnt(value);
	}
	/**
	 *	Returns the value of monthSub
	 *	@return monthSub
	 */
	public int getMonthSub() throws CFException {
       if (isMonthSubModified()) { 
           monthSub = refreshMonthSub();
        }
   		return monthSub;
	}
	

	
	   
	/**
	 * 	Update MonthSub with the passed value
	 *  Corresponding COBOL Variable is MONTH-SUB
	 *	@param number
	 */
	public void setMonthSub(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    monthSub = checkMonthSubMaxLimit(number); 
		serializeMonthSub(monthSub);
	}
	

	public void setMonthSub(long number) {
	    number = checkMonthSubMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMonthSub((int)number);
	}
	
	/**
	 * 	Update MonthSub with the passed value
	 *	@param value (String or char[])
	 */
	public void setMonthSub(char[] value) throws CFException {
		 monthSub = serializeMonthSub(value);
	}
	/**
	 * 	Update MonthSub with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMonthSubString(char[] value) throws CFException {
		 setMonthSub(value);
	}
	/**
	 *	Returns the value of x360HeaderCuttime01
	 *	@return x360HeaderCuttime01
	 */
	public int getX360HeaderCuttime01() throws CFException {
       if (isX360HeaderCuttime01Modified()) { 
           x360HeaderCuttime01 = refreshX360HeaderCuttime01();
        }
   		return x360HeaderCuttime01;
	}
	

	
	   
	/**
	 * 	Update X360HeaderCuttime01 with the passed value
	 *  Corresponding COBOL Variable is WS-X360-HEADER-CUTTIME
	 *	@param number
	 */
	public void setX360HeaderCuttime01(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360HeaderCuttime01 = checkX360HeaderCuttime01MaxLimit(number); 
		serializeX360HeaderCuttime01(x360HeaderCuttime01);
	}
	

	public void setX360HeaderCuttime01(long number) {
	    number = checkX360HeaderCuttime01MaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360HeaderCuttime01((int)number);
	}
	
	/**
	 * 	Update X360HeaderCuttime01 with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360HeaderCuttime01(char[] value) throws CFException {
		 x360HeaderCuttime01 = serializeX360HeaderCuttime01(value);
	}
	/**
	 * 	Update X360HeaderCuttime01 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360HeaderCuttime01String(char[] value) throws CFException {
		 setX360HeaderCuttime01(value);
	}
	/**
	 *	Returns the value of x360SrtAcqIssId01
	 *	@return x360SrtAcqIssId01
	 */
   public char[] getX360SrtAcqIssId01() throws CFException{
   		return x360SrtAcqIssId01;
   }

  
	/**
	*  set variable x360SrtAcqIssId01
	*  Corresponding COBOL Variable is WS-X360-SRT-ACQ-ISS-ID
	*  @param value
	**/
   public void setX360SrtAcqIssId01(char[] value) {
       value = checkX360SrtAcqIssId01Constraints(value);
       arraycopy(value,0,x360SrtAcqIssId01,0,value.length);
   } 
	public void setX360SrtAcqIssId01(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,x360SrtAcqIssId01,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of inhProcFlag
	 *	@return inhProcFlag
	 */
   public char[] getInhProcFlag() throws CFException{
   		return inhProcFlag;
   }

  
	/**
	*  set variable inhProcFlag
	*  Corresponding COBOL Variable is WS-INH-PROC-FLAG
	*  @param value
	**/
   public void setInhProcFlag(char[] value) {
       value = checkInhProcFlagConstraints(value);
       arraycopy(value,0,inhProcFlag,0,value.length);
   } 
	public void setInhProcFlag(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,inhProcFlag,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of mceSw1
	 *	@return mceSw1
	 */
   public char[] getMceSw1() throws CFException{
   		return mceSw1;
   }

  
	/**
	*  set variable mceSw1
	*  Corresponding COBOL Variable is MCE-SW1
	*  @param value
	**/
   public void setMceSw1(char[] value) {
       value = checkMceSw1Constraints(value);
       arraycopy(value,0,mceSw1,0,value.length);
   } 
	public void setMceSw1(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,mceSw1,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of mceSw2
	 *	@return mceSw2
	 */
   public char[] getMceSw2() throws CFException{
   		return mceSw2;
   }

  
	/**
	*  set variable mceSw2
	*  Corresponding COBOL Variable is MCE-SW2
	*  @param value
	**/
   public void setMceSw2(char[] value) {
       value = checkMceSw2Constraints(value);
       arraycopy(value,0,mceSw2,0,value.length);
   } 
	public void setMceSw2(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,mceSw2,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of netmceTot
	 *	@return netmceTot
	 */
	public long getNetmceTot() throws CFException {
       if (isNetmceTotModified()) { 
           netmceTot = refreshNetmceTot();
        }
   		return netmceTot;
	}
	

    /**
	 *	Returns the String value of netmceTot
	 *	@return netmceTot
	 */
	public char[]  getNetmceTotActualString() {
	    String value = String.valueOf(netmceTot).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update NetmceTot with the passed value
	 *  Corresponding COBOL Variable is WS-NETMCE-TOT
	 *	@param number
	 */
	public void setNetmceTot(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    netmceTot = checkNetmceTotMaxLimit(number); 
		serializeNetmceTot(netmceTot);
	}
	

	/**
	 * 	Update NetmceTot with the passed value
	 *	@param value (String or char[])
	 */
	public void setNetmceTot(char[] value) throws CFException {
		 netmceTot = serializeNetmceTot(value);
	}
	/**
	 * 	Update NetmceTot with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNetmceTotString(char[] value) throws CFException {
		 setNetmceTot(value);
	}

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
