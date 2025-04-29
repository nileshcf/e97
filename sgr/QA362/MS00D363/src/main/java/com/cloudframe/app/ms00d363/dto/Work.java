package com.cloudframe.app.ms00d363.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;


@Data
public class Work extends WorkSerialized {
   

						@Getter @Setter private char[] wsaProgramName = new char[8];

						@Getter @Setter private char[] wsaReleaseNbr = new char[8];

								@Getter @Setter private int mciabendAbendCode;

						@Getter @Setter private char[] blkLine = new char[133];

						@Getter @Setter private char[] productionTitle = new char[27];

						@Getter @Setter private char[] certificationTitle = new char[27];

						@Getter @Setter private char[] fastTrckTitle = new char[27];

						@Getter @Setter private char[] crEnvId = Field.fillLowValue(8);

						@Getter @Setter private char[] hdPage1Ln3b = new char[132];

						@Getter @Setter private char[] hdPage1Ln7 = new char[133];

						@Getter @Setter private char[] hdPage1Ln8 = new char[133];

						@Getter @Setter private char[] hdPage1Ln9 = new char[133];

						@Getter @Setter private char[] dashPage1Ln = new char[133];

						@Getter @Setter private char[] hdPage2Ln1 = new char[133];

						@Getter @Setter private char[] hdPage2Ln2 = new char[133];

						@Getter @Setter private char[] hdPage2Ln3 = new char[133];

						@Getter @Setter private char[] hdPage2Ln4 = new char[133];

						@Getter @Setter private char[] hdPage2Ln5 = new char[133];

						@Getter @Setter private char[] hdPage2Ln6 = new char[133];

						@Getter @Setter private char[] hdPage3Ln1 = new char[133];

						@Getter @Setter private char[] hdPage3Ln1a = new char[132];

						@Getter @Setter private char[] hdPage3Ln2 = new char[133];

						@Getter @Setter private char[] hdPage3Ln6 = new char[133];

						@Getter @Setter private char[] hdPage3Ln7 = new char[133];

						@Getter @Setter private char[] hdPage3Ln8 = new char[133];

						@Getter @Setter private char[] hdPage3Ln9 = new char[133];

						@Getter @Setter private char[] hdPage3Ln10 = new char[133];

						@Getter @Setter private char[] hdPage3Ln11 = new char[133];

						@Getter @Setter private char[] dt311SamacqNetAmt = Field.fillLowValue(18);

						@Getter @Setter private char[] dt311SamacqInd = new char[2];

						@Getter @Setter private char[] dt311SamacqFeeAmt = Field.fillLowValue(16);

						@Getter @Setter private char[] dt311SamacqFeeInd = new char[2];

						@Getter @Setter private char[] dt311SamissNetAmt = Field.fillLowValue(18);

						@Getter @Setter private char[] dt311SamissInd = new char[2];

						@Getter @Setter private char[] dt311SamissFeeAmt = Field.fillLowValue(16);

						@Getter @Setter private char[] dt311SamissFeeInd = new char[2];

						@Getter @Setter private char[] p2AcqPrint = new char[1];

						@Getter @Setter private char[] p2IssPrint = new char[1];

						@Getter @Setter private char[] swRptqEof = new char[1];

						@Getter @Setter private char[] swCurrEof = new char[1];

						@Getter @Setter private char[] swApcEof = new char[1];

						@Getter @Setter private char[] erlyFlagSw = new char[1];

								@Getter @Setter private int page2AcqFinDbCnt;

								@Getter @Setter private long page2AcqFinDbAmt;

								@Getter @Setter private int page2AcqTmpCrCnt;

								@Getter @Setter private int page2AcqTmpDbCnt;

								@Getter @Setter private int page2AcqFinCrCnt;

								@Getter @Setter private long page2AcqFinCrAmt;

								@Getter @Setter private int page2AcqAdjDbCnt;

								@Getter @Setter private long page2AcqAdjDbAmt;

								@Getter @Setter private int page2AcqAdjCrCnt;

								@Getter @Setter private long page2AcqAdjCrAmt;

								@Getter @Setter private int page2AcqAdj09DbCnt;

								@Getter @Setter private long page2AcqAdj09DbAmt;

								@Getter @Setter private int page2AcqAdj09CrCnt;

								@Getter @Setter private long page2AcqAdj09CrAmt;

								@Getter @Setter private int page2AcqA15ApdDbCnt;

								@Getter @Setter private int page2AcqA15ApdCrCnt;

								@Getter @Setter private long page2AcqFeeDbAmt;

								@Getter @Setter private long page2AcqNsdFeeDbAmt;

								@Getter @Setter private long page2AcqSdFeeDbAmt;

								@Getter @Setter private long page2AcqFeeCrAmt;

								@Getter @Setter private long page2AcqNsdFeeCrAmt;

								@Getter @Setter private long page2AcqSdFeeCrAmt;

								@Getter @Setter private int page2AcqAtmDbCnt;

								@Getter @Setter private long page2AcqAtmDbAmt;

								@Getter @Setter private int page2AcqAtmCrCnt;

								@Getter @Setter private long page2AcqAtmCrAmt;

								@Getter @Setter private int page2AcqPosDbCnt;

								@Getter @Setter private long page2AcqPosDbAmt;

								@Getter @Setter private int page2AcqPosCrCnt;

								@Getter @Setter private long page2AcqPosCrAmt;

								@Getter @Setter private int page2AcqAtmDbRevCnt;

								@Getter @Setter private long page2AcqAtmDbRevAmt;

								@Getter @Setter private int page2AcqAtmCrRevCnt;

								@Getter @Setter private long page2AcqAtmCrRevAmt;

								@Getter @Setter private int page2AcqPosDbRevCnt;

								@Getter @Setter private long page2AcqPosDbRevAmt;

								@Getter @Setter private int page2AcqPosCrRevCnt;

								@Getter @Setter private long page2AcqPosCrRevAmt;

								@Getter @Setter private int page2AcqSurchgFree;

								@Getter @Setter private int page2IssFinDbCnt;

								@Getter @Setter private long page2IssFinDbAmt;

								@Getter @Setter private int page2IssTmpDbCnt;

								@Getter @Setter private int page2IssTmpCrCnt;

								@Getter @Setter private int page2IssFinCrCnt;

								@Getter @Setter private long page2IssFinCrAmt;

								@Getter @Setter private int page2IssAdjDbCnt;

								@Getter @Setter private long page2IssAdjDbAmt;

								@Getter @Setter private int page2IssAdjCrCnt;

								@Getter @Setter private long page2IssAdjCrAmt;

								@Getter @Setter private int page2IssA15ApdDbCnt;

								@Getter @Setter private int page2IssA15ApdCrCnt;

								@Getter @Setter private int page2IssAdj09DbCnt;

								@Getter @Setter private long page2IssAdj09DbAmt;

								@Getter @Setter private int page2IssAdj09CrCnt;

								@Getter @Setter private long page2IssAdj09CrAmt;

								@Getter @Setter private long page2IssFeeDbAmt;

								@Getter @Setter private long page2IssFeeCrAmt;

								@Getter @Setter private int page2IssAtmDbCnt;

								@Getter @Setter private long page2IssAtmDbAmt;

								@Getter @Setter private int page2IssAtmCrCnt;

								@Getter @Setter private long page2IssAtmCrAmt;

								@Getter @Setter private int page2IssPosDbCnt;

								@Getter @Setter private long page2IssPosDbAmt;

								@Getter @Setter private int page2IssPosCrCnt;

								@Getter @Setter private long page2IssPosCrAmt;

								@Getter @Setter private int page2IssAtmDbRevCnt;

								@Getter @Setter private long page2IssAtmDbRevAmt;

								@Getter @Setter private int page2IssAtmCrRevCnt;

								@Getter @Setter private long page2IssAtmCrRevAmt;

								@Getter @Setter private int page2IssPosDbRevCnt;

								@Getter @Setter private long page2IssPosDbRevAmt;

								@Getter @Setter private int page2IssPosCrRevCnt;

								@Getter @Setter private long page2IssPosCrRevAmt;

								@Getter @Setter private long page2IssCcaDbAmt;

								@Getter @Setter private long page2IssCcaCrAmt;

								@Getter @Setter private long page2IssIccrDbAmt;

								@Getter @Setter private long page2IssIccrCrAmt;

								@Getter @Setter private int page2IssSurchgFree;

								@Getter @Setter private long page3AcqVatTotal;

								@Getter @Setter private long page3IssVatTotal;

								@Getter @Setter private int page3AcqVatFicnt;

								@Getter @Setter private long page3AcqVatFiamt;

								@Getter @Setter private long page3AcqVatFvamt;

								@Getter @Setter private int page3AcqVatNicnt;

								@Getter @Setter private long page3AcqVatNiamt;

								@Getter @Setter private long page3AcqVatNvamt;

								@Getter @Setter private int page3AcqVatTicnt;

								@Getter @Setter private long page3AcqVatTiamt;

								@Getter @Setter private long page3AcqVatTvamt;

								@Getter @Setter private int page3IssVatFicnt;

								@Getter @Setter private long page3IssVatFiamt;

								@Getter @Setter private long page3IssVatFvamt;

								@Getter @Setter private int page3IssVatNicnt;

								@Getter @Setter private long page3IssVatNiamt;

								@Getter @Setter private long page3IssVatNvamt;

								@Getter @Setter private int page3IssVatTicnt;

								@Getter @Setter private long page3IssVatTiamt;

								@Getter @Setter private long page3IssVatTvamt;

								@Getter @Setter private int page3NetVatFicnt;

								@Getter @Setter private long page3NetVatFiamt;

								@Getter @Setter private long page3NetVatFvamt;

								@Getter @Setter private int page3NetVatNicnt;

								@Getter @Setter private long page3NetVatNiamt;

								@Getter @Setter private long page3NetVatNvamt;

								@Getter @Setter private int page3NetVatTicnt;

								@Getter @Setter private long page3NetVatTiamt;

								@Getter @Setter private long page3NetVatTvamt;

								@Getter @Setter private int grandTotSw;

								@Getter @Setter private long amt;

								@Getter @Setter private long amtT4;

								@Getter @Setter private long amtT5;

								@Getter @Setter private long amtCca;

								@Getter @Setter private long amtIccr;

								@Getter @Setter private long amtCr;

								@Getter @Setter private long amtDb;

								@Getter @Setter private long amtCrFee;

								@Getter @Setter private long amtDbFee;

								@Getter @Setter private long netAcqDb;

								@Getter @Setter private long netAcqCr;

								@Getter @Setter private long netIssDb;

								@Getter @Setter private long netIssCr;

								@Getter @Setter private long netAchTot;

								@Getter @Setter private long netp4AcqDb;

								@Getter @Setter private long netp4AcqCr;

								@Getter @Setter private long netp4AcqTot;

								@Getter @Setter private long netp4IssDb;

								@Getter @Setter private long netp4IssCr;

								@Getter @Setter private long netp4IssTot;

								@Getter @Setter private long netp4AchTot;

						@Getter @Setter private char[] savSetlTyp = new char[1];

						@Getter @Setter private char[] savProcDesc = Field.fillLowValue(25);

						@Getter @Setter private char[] curProcDesc = Field.fillLowValue(25);

						@Getter @Setter private char[] savInstDesc = Field.fillLowValue(25);

						@Getter @Setter private char[] curInstDesc = Field.fillLowValue(25);

								@Getter @Setter private int hldAcqIssId;

								@Getter @Setter private int savAcqIssId;

								@Getter @Setter private int curAcqIssId;

						@Getter @Setter private char[] currSetlTyp = new char[1];

								@Getter @Setter private long savMbrEndpoint;

								@Getter @Setter private long curMbrEndpoint;

								@Getter @Setter private long savMbrEntIca;

								@Getter @Setter private long curMbrEntIca;

								@Getter @Setter private long savMbrMbrIca;

								@Getter @Setter private long curMbrMbrIca;

						@Getter @Setter private char[] savApcIca = new char[6];

								@Getter @Setter private BigDecimal apcTotAmount = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal apcTotCrAmount = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal apcTotDrAmount = BigDecimal.ZERO;

						@Getter @Setter private char[] firstRecord = new char[1];

						@Getter @Setter private char[] noActLine = new char[132];

						@Getter @Setter private char[] noActivitySw = new char[1];

						@Getter @Setter private char[] missingActivitySw = new char[1];

								@Getter @Setter private int prodNdx;

								@Getter @Setter private int ndxMax;

								@Getter @Setter private int ndx;

								@Getter @Setter private int curNdx;

								@Getter @Setter private long apcInx;

								@Getter @Setter private long inx;

								@Getter @Setter private long wS2;

						@Getter @Setter private char[] rptType = new char[1];

						@Getter @Setter private char[] systemTime = Field.fillLowValue(6);

								@Getter @Setter private int waPageCtr;

								@Getter @Setter private int waLineCtr;

						@Getter @Setter private char[] eofTranSw = new char[1];

								@Getter @Setter private int impDec;

								@Getter @Setter private int impDecEp;

								@Getter @Setter private long impAmtf;

								@Getter @Setter private long impAmte;

								@Getter @Setter private long impAmtep;

								@Getter @Setter private long impAmt;

								@Getter @Setter private long impAmtT4;

								@Getter @Setter private long impCnt;

								@Getter @Setter private long feeAmtNet;

								@Getter @Setter private long tot1FeeAmtCr;

								@Getter @Setter private long tot1FeeAmtDb;

								@Getter @Setter private long tot1FeeAmtNet01;

								@Getter @Setter private long tot1FinAmt01;

								@Getter @Setter private long tot1FinNbr01;

								@Getter @Setter private long tot1FinNbrDen01;

								@Getter @Setter private long tot1FinFeeNbr01;

								@Getter @Setter private long tot1PctFeeNbr01;

								@Getter @Setter private long tot1NfinFeeNbr01;

								@Getter @Setter private long tot1NbilFeeNbr01;

								@Getter @Setter private long exp1FeeAmtCr;

								@Getter @Setter private long exp1FeeAmtDb;

								@Getter @Setter private long exp1FeeAmtNet01;

								@Getter @Setter private long exp1FinAmt01;

								@Getter @Setter private long exp1FinNbr01;

								@Getter @Setter private long exp1FinNbrDen01;

								@Getter @Setter private long exp1FinFeeNbr01;

								@Getter @Setter private long exp1PctFeeNbr01;

								@Getter @Setter private long exp1NfinFeeNbr01;

								@Getter @Setter private long exp1NbilFeeNbr01;

								@Getter @Setter private long sub1FeeAmtCr;

								@Getter @Setter private long sub1FeeAmtDb;

								@Getter @Setter private long sub1FeeAmtNet01;

								@Getter @Setter private long sub1FinAmt01;

								@Getter @Setter private long sub1FinNbr01;

								@Getter @Setter private long sub1FinNbrDen01;

								@Getter @Setter private long sub1FinFeeNbr01;

								@Getter @Setter private long sub1PctFeeNbr01;

								@Getter @Setter private long sub1NfinFeeNbr01;

								@Getter @Setter private long sub1NbilFeeNbr01;

						@Getter @Setter private char[] saveWsAmtep = new char[20];

						@Getter @Setter private char[] saveWsAmtdt4 = new char[24];

						@Getter @Setter private char[] saveWsAmte = new char[16];

						@Getter @Setter private char[] swTranEof = new char[1];

						@Getter @Setter private char[] tranApc = new char[1];

						@Getter @Setter private char[] tranIca = new char[1];

								@Getter @Setter private int maxDays;

						@Getter @Setter private char[] message1 = new char[100];

						@Getter @Setter private char[] message2 = new char[100];

						@Getter @Setter private char[] message3 = new char[100];

						@Getter @Setter private char[] msg002NoParmInType = new char[100];

								@Getter @Setter private long mcrInCnt;

								@Getter @Setter private long mcrSkippedCnt;

								@Getter @Setter private int monthSub;

								@Getter @Setter private int x360HeaderCuttime01;

						@Getter @Setter private char[] x360SrtAcqIssId01 = new char[1];

						@Getter @Setter private char[] inhProcFlag = Field.fillLowValue(1);

						@Getter @Setter private char[] mceSw1 = new char[1];

						@Getter @Setter private char[] mceSw2 = new char[1];

								@Getter @Setter private long netmceTot;
	
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





}
  
