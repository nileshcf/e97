package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 2430;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPage2AcqFinDbCnt;
            protected  int beginPage2AcqFinDbAmt;
            protected  int beginPage2AcqTmpCrCnt;
            protected  int beginPage2AcqTmpDbCnt;
            protected  int beginPage2AcqFinCrCnt;
            protected  int beginPage2AcqFinCrAmt;
            protected  int beginPage2AcqAdjDbCnt;
            protected  int beginPage2AcqAdjDbAmt;
            protected  int beginPage2AcqAdjCrCnt;
            protected  int beginPage2AcqAdjCrAmt;
            protected  int beginPage2AcqAdj09DbCnt;
            protected  int beginPage2AcqAdj09DbAmt;
            protected  int beginPage2AcqAdj09CrCnt;
            protected  int beginPage2AcqAdj09CrAmt;
            protected  int beginPage2AcqA15ApdDbCnt;
            protected  int beginPage2AcqA15ApdCrCnt;
            protected  int beginPage2AcqFeeDbAmt;
            protected  int beginPage2AcqNsdFeeDbAmt;
            protected  int beginPage2AcqSdFeeDbAmt;
            protected  int beginPage2AcqFeeCrAmt;
            protected  int beginPage2AcqNsdFeeCrAmt;
            protected  int beginPage2AcqSdFeeCrAmt;
            protected  int beginPage2AcqAtmDbCnt;
            protected  int beginPage2AcqAtmDbAmt;
            protected  int beginPage2AcqAtmCrCnt;
            protected  int beginPage2AcqAtmCrAmt;
            protected  int beginPage2AcqPosDbCnt;
            protected  int beginPage2AcqPosDbAmt;
            protected  int beginPage2AcqPosCrCnt;
            protected  int beginPage2AcqPosCrAmt;
            protected  int beginPage2AcqAtmDbRevCnt;
            protected  int beginPage2AcqAtmDbRevAmt;
            protected  int beginPage2AcqAtmCrRevCnt;
            protected  int beginPage2AcqAtmCrRevAmt;
            protected  int beginPage2AcqPosDbRevCnt;
            protected  int beginPage2AcqPosDbRevAmt;
            protected  int beginPage2AcqPosCrRevCnt;
            protected  int beginPage2AcqPosCrRevAmt;
            protected  int beginPage2AcqSurchgFree;
            protected  int beginPage2IssFinDbCnt;
            protected  int beginPage2IssFinDbAmt;
            protected  int beginPage2IssTmpDbCnt;
            protected  int beginPage2IssTmpCrCnt;
            protected  int beginPage2IssFinCrCnt;
            protected  int beginPage2IssFinCrAmt;
            protected  int beginPage2IssAdjDbCnt;
            protected  int beginPage2IssAdjDbAmt;
            protected  int beginPage2IssAdjCrCnt;
            protected  int beginPage2IssAdjCrAmt;
            protected  int beginPage2IssA15ApdDbCnt;
            protected  int beginPage2IssA15ApdCrCnt;
            protected  int beginPage2IssAdj09DbCnt;
            protected  int beginPage2IssAdj09DbAmt;
            protected  int beginPage2IssAdj09CrCnt;
            protected  int beginPage2IssAdj09CrAmt;
            protected  int beginPage2IssFeeDbAmt;
            protected  int beginPage2IssFeeCrAmt;
            protected  int beginPage2IssAtmDbCnt;
            protected  int beginPage2IssAtmDbAmt;
            protected  int beginPage2IssAtmCrCnt;
            protected  int beginPage2IssAtmCrAmt;
            protected  int beginPage2IssPosDbCnt;
            protected  int beginPage2IssPosDbAmt;
            protected  int beginPage2IssPosCrCnt;
            protected  int beginPage2IssPosCrAmt;
            protected  int beginPage2IssAtmDbRevCnt;
            protected  int beginPage2IssAtmDbRevAmt;
            protected  int beginPage2IssAtmCrRevCnt;
            protected  int beginPage2IssAtmCrRevAmt;
            protected  int beginPage2IssPosDbRevCnt;
            protected  int beginPage2IssPosDbRevAmt;
            protected  int beginPage2IssPosCrRevCnt;
            protected  int beginPage2IssPosCrRevAmt;
            protected  int beginPage2IssCcaDbAmt;
            protected  int beginPage2IssCcaCrAmt;
            protected  int beginPage2IssIccrDbAmt;
            protected  int beginPage2IssIccrCrAmt;
            protected  int beginPage2IssSurchgFree;
            protected  int beginPage3AcqVatTotal;
            protected  int beginPage3IssVatTotal;
            protected  int beginPage3AcqVatFicnt;
            protected  int beginPage3AcqVatFiamt;
            protected  int beginPage3AcqVatFvamt;
            protected  int beginPage3AcqVatNicnt;
            protected  int beginPage3AcqVatNiamt;
            protected  int beginPage3AcqVatNvamt;
            protected  int beginPage3AcqVatTicnt;
            protected  int beginPage3AcqVatTiamt;
            protected  int beginPage3AcqVatTvamt;
            protected  int beginPage3IssVatFicnt;
            protected  int beginPage3IssVatFiamt;
            protected  int beginPage3IssVatFvamt;
            protected  int beginPage3IssVatNicnt;
            protected  int beginPage3IssVatNiamt;
            protected  int beginPage3IssVatNvamt;
            protected  int beginPage3IssVatTicnt;
            protected  int beginPage3IssVatTiamt;
            protected  int beginPage3IssVatTvamt;
            protected  int beginPage3NetVatFicnt;
            protected  int beginPage3NetVatFiamt;
            protected  int beginPage3NetVatFvamt;
            protected  int beginPage3NetVatNicnt;
            protected  int beginPage3NetVatNiamt;
            protected  int beginPage3NetVatNvamt;
            protected  int beginPage3NetVatTicnt;
            protected  int beginPage3NetVatTiamt;
            protected  int beginPage3NetVatTvamt;
            protected  int beginGrandTotSw;
            protected  int beginAmt;
            protected  int beginAmtT4;
            protected  int beginAmtT5;
            protected  int beginAmtCca;
            protected  int beginAmtIccr;
            protected  int beginAmtCr;
            protected  int beginAmtDb;
            protected  int beginAmtCrFee;
            protected  int beginAmtDbFee;
            protected  int beginNetAcqDb;
            protected  int beginNetAcqCr;
            protected  int beginNetIssDb;
            protected  int beginNetIssCr;
            protected  int beginNetAchTot;
            protected  int beginNetp4AcqDb;
            protected  int beginNetp4AcqCr;
            protected  int beginNetp4AcqTot;
            protected  int beginNetp4IssDb;
            protected  int beginNetp4IssCr;
            protected  int beginNetp4IssTot;
            protected  int beginNetp4AchTot;
            protected  int beginHldAcqIssId;
            protected  int beginSavAcqIssId;
            protected  int beginCurAcqIssId;
            protected  int beginSavMbrEndpoint;
            protected  int beginCurMbrEndpoint;
            protected  int beginSavMbrEntIca;
            protected  int beginCurMbrEntIca;
            protected  int beginSavMbrMbrIca;
            protected  int beginCurMbrMbrIca;
            protected  int beginApcTotAmount;
            protected  int beginApcTotCrAmount;
            protected  int beginApcTotDrAmount;
            protected  int beginProdNdx;
            protected  int beginNdxMax;
            protected  int beginNdx;
            protected  int beginCurNdx;
            protected  int beginApcInx;
            protected  int beginInx;
            protected  int beginWS2;
            protected  int beginWaPageCtr;
            protected  int beginWaLineCtr;
            protected  int beginImpDec;
            protected  int beginImpDecEp;
            protected  int beginImpAmtf;
            protected  int beginImpAmte;
            protected  int beginImpAmtep;
            protected  int beginImpAmt;
            protected  int beginImpAmtT4;
            protected  int beginImpCnt;
            protected  int beginFeeAmtNet;
            protected  int beginTot1FeeAmtCr;
            protected  int beginTot1FeeAmtDb;
            protected  int beginTot1FeeAmtNet01;
            protected  int beginTot1FinAmt01;
            protected  int beginTot1FinNbr01;
            protected  int beginTot1FinNbrDen01;
            protected  int beginTot1FinFeeNbr01;
            protected  int beginTot1PctFeeNbr01;
            protected  int beginTot1NfinFeeNbr01;
            protected  int beginTot1NbilFeeNbr01;
            protected  int beginExp1FeeAmtCr;
            protected  int beginExp1FeeAmtDb;
            protected  int beginExp1FeeAmtNet01;
            protected  int beginExp1FinAmt01;
            protected  int beginExp1FinNbr01;
            protected  int beginExp1FinNbrDen01;
            protected  int beginExp1FinFeeNbr01;
            protected  int beginExp1PctFeeNbr01;
            protected  int beginExp1NfinFeeNbr01;
            protected  int beginExp1NbilFeeNbr01;
            protected  int beginSub1FeeAmtCr;
            protected  int beginSub1FeeAmtDb;
            protected  int beginSub1FeeAmtNet01;
            protected  int beginSub1FinAmt01;
            protected  int beginSub1FinNbr01;
            protected  int beginSub1FinNbrDen01;
            protected  int beginSub1FinFeeNbr01;
            protected  int beginSub1PctFeeNbr01;
            protected  int beginSub1NfinFeeNbr01;
            protected  int beginSub1NbilFeeNbr01;
            protected  int beginMaxDays;
            protected  int beginMcrInCnt;
            protected  int beginMcrSkippedCnt;
            protected  int beginMonthSub;
            protected  int beginX360HeaderCuttime01;
            protected  int beginNetmceTot;
	
	/**
	* Constructor for WorkSerialized
	**/
    public WorkSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WorkSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WORK_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
             beginPage2AcqFinDbCnt = getStartOffset() + 0;	// set offset for serialization
  
             beginPage2AcqFinDbAmt = getStartOffset() + 9;	// set offset for serialization
  
             beginPage2AcqTmpCrCnt = getStartOffset() + 27;	// set offset for serialization
  
             beginPage2AcqTmpDbCnt = getStartOffset() + 36;	// set offset for serialization
  
             beginPage2AcqFinCrCnt = getStartOffset() + 45;	// set offset for serialization
  
             beginPage2AcqFinCrAmt = getStartOffset() + 54;	// set offset for serialization
  
             beginPage2AcqAdjDbCnt = getStartOffset() + 72;	// set offset for serialization
  
             beginPage2AcqAdjDbAmt = getStartOffset() + 81;	// set offset for serialization
  
             beginPage2AcqAdjCrCnt = getStartOffset() + 99;	// set offset for serialization
  
             beginPage2AcqAdjCrAmt = getStartOffset() + 108;	// set offset for serialization
  
             beginPage2AcqAdj09DbCnt = getStartOffset() + 126;	// set offset for serialization
  
             beginPage2AcqAdj09DbAmt = getStartOffset() + 135;	// set offset for serialization
  
             beginPage2AcqAdj09CrCnt = getStartOffset() + 153;	// set offset for serialization
  
             beginPage2AcqAdj09CrAmt = getStartOffset() + 162;	// set offset for serialization
  
             beginPage2AcqA15ApdDbCnt = getStartOffset() + 180;	// set offset for serialization
  
             beginPage2AcqA15ApdCrCnt = getStartOffset() + 185;	// set offset for serialization
  
             beginPage2AcqFeeDbAmt = getStartOffset() + 190;	// set offset for serialization
  
             beginPage2AcqNsdFeeDbAmt = getStartOffset() + 208;	// set offset for serialization
  
             beginPage2AcqSdFeeDbAmt = getStartOffset() + 223;	// set offset for serialization
  
             beginPage2AcqFeeCrAmt = getStartOffset() + 238;	// set offset for serialization
  
             beginPage2AcqNsdFeeCrAmt = getStartOffset() + 256;	// set offset for serialization
  
             beginPage2AcqSdFeeCrAmt = getStartOffset() + 271;	// set offset for serialization
  
             beginPage2AcqAtmDbCnt = getStartOffset() + 286;	// set offset for serialization
  
             beginPage2AcqAtmDbAmt = getStartOffset() + 295;	// set offset for serialization
  
             beginPage2AcqAtmCrCnt = getStartOffset() + 313;	// set offset for serialization
  
             beginPage2AcqAtmCrAmt = getStartOffset() + 322;	// set offset for serialization
  
             beginPage2AcqPosDbCnt = getStartOffset() + 340;	// set offset for serialization
  
             beginPage2AcqPosDbAmt = getStartOffset() + 349;	// set offset for serialization
  
             beginPage2AcqPosCrCnt = getStartOffset() + 367;	// set offset for serialization
  
             beginPage2AcqPosCrAmt = getStartOffset() + 376;	// set offset for serialization
  
             beginPage2AcqAtmDbRevCnt = getStartOffset() + 394;	// set offset for serialization
  
             beginPage2AcqAtmDbRevAmt = getStartOffset() + 403;	// set offset for serialization
  
             beginPage2AcqAtmCrRevCnt = getStartOffset() + 421;	// set offset for serialization
  
             beginPage2AcqAtmCrRevAmt = getStartOffset() + 430;	// set offset for serialization
  
             beginPage2AcqPosDbRevCnt = getStartOffset() + 448;	// set offset for serialization
  
             beginPage2AcqPosDbRevAmt = getStartOffset() + 457;	// set offset for serialization
  
             beginPage2AcqPosCrRevCnt = getStartOffset() + 475;	// set offset for serialization
  
             beginPage2AcqPosCrRevAmt = getStartOffset() + 484;	// set offset for serialization
  
             beginPage2AcqSurchgFree = getStartOffset() + 502;	// set offset for serialization
  
             beginPage2IssFinDbCnt = getStartOffset() + 511;	// set offset for serialization
  
             beginPage2IssFinDbAmt = getStartOffset() + 520;	// set offset for serialization
  
             beginPage2IssTmpDbCnt = getStartOffset() + 538;	// set offset for serialization
  
             beginPage2IssTmpCrCnt = getStartOffset() + 547;	// set offset for serialization
  
             beginPage2IssFinCrCnt = getStartOffset() + 556;	// set offset for serialization
  
             beginPage2IssFinCrAmt = getStartOffset() + 565;	// set offset for serialization
  
             beginPage2IssAdjDbCnt = getStartOffset() + 583;	// set offset for serialization
  
             beginPage2IssAdjDbAmt = getStartOffset() + 592;	// set offset for serialization
  
             beginPage2IssAdjCrCnt = getStartOffset() + 610;	// set offset for serialization
  
             beginPage2IssAdjCrAmt = getStartOffset() + 619;	// set offset for serialization
  
             beginPage2IssA15ApdDbCnt = getStartOffset() + 637;	// set offset for serialization
  
             beginPage2IssA15ApdCrCnt = getStartOffset() + 642;	// set offset for serialization
  
             beginPage2IssAdj09DbCnt = getStartOffset() + 647;	// set offset for serialization
  
             beginPage2IssAdj09DbAmt = getStartOffset() + 656;	// set offset for serialization
  
             beginPage2IssAdj09CrCnt = getStartOffset() + 674;	// set offset for serialization
  
             beginPage2IssAdj09CrAmt = getStartOffset() + 683;	// set offset for serialization
  
             beginPage2IssFeeDbAmt = getStartOffset() + 701;	// set offset for serialization
  
             beginPage2IssFeeCrAmt = getStartOffset() + 716;	// set offset for serialization
  
             beginPage2IssAtmDbCnt = getStartOffset() + 734;	// set offset for serialization
  
             beginPage2IssAtmDbAmt = getStartOffset() + 743;	// set offset for serialization
  
             beginPage2IssAtmCrCnt = getStartOffset() + 761;	// set offset for serialization
  
             beginPage2IssAtmCrAmt = getStartOffset() + 770;	// set offset for serialization
  
             beginPage2IssPosDbCnt = getStartOffset() + 788;	// set offset for serialization
  
             beginPage2IssPosDbAmt = getStartOffset() + 797;	// set offset for serialization
  
             beginPage2IssPosCrCnt = getStartOffset() + 815;	// set offset for serialization
  
             beginPage2IssPosCrAmt = getStartOffset() + 824;	// set offset for serialization
  
             beginPage2IssAtmDbRevCnt = getStartOffset() + 842;	// set offset for serialization
  
             beginPage2IssAtmDbRevAmt = getStartOffset() + 851;	// set offset for serialization
  
             beginPage2IssAtmCrRevCnt = getStartOffset() + 869;	// set offset for serialization
  
             beginPage2IssAtmCrRevAmt = getStartOffset() + 878;	// set offset for serialization
  
             beginPage2IssPosDbRevCnt = getStartOffset() + 896;	// set offset for serialization
  
             beginPage2IssPosDbRevAmt = getStartOffset() + 905;	// set offset for serialization
  
             beginPage2IssPosCrRevCnt = getStartOffset() + 923;	// set offset for serialization
  
             beginPage2IssPosCrRevAmt = getStartOffset() + 932;	// set offset for serialization
  
             beginPage2IssCcaDbAmt = getStartOffset() + 950;	// set offset for serialization
  
             beginPage2IssCcaCrAmt = getStartOffset() + 968;	// set offset for serialization
  
             beginPage2IssIccrDbAmt = getStartOffset() + 986;	// set offset for serialization
  
             beginPage2IssIccrCrAmt = getStartOffset() + 1004;	// set offset for serialization
  
             beginPage2IssSurchgFree = getStartOffset() + 1022;	// set offset for serialization
  
             beginPage3AcqVatTotal = getStartOffset() + 1031;	// set offset for serialization
  
             beginPage3IssVatTotal = getStartOffset() + 1042;	// set offset for serialization
  
             beginPage3AcqVatFicnt = getStartOffset() + 1053;	// set offset for serialization
  
             beginPage3AcqVatFiamt = getStartOffset() + 1062;	// set offset for serialization
  
             beginPage3AcqVatFvamt = getStartOffset() + 1077;	// set offset for serialization
  
             beginPage3AcqVatNicnt = getStartOffset() + 1088;	// set offset for serialization
  
             beginPage3AcqVatNiamt = getStartOffset() + 1097;	// set offset for serialization
  
             beginPage3AcqVatNvamt = getStartOffset() + 1112;	// set offset for serialization
  
             beginPage3AcqVatTicnt = getStartOffset() + 1123;	// set offset for serialization
  
             beginPage3AcqVatTiamt = getStartOffset() + 1132;	// set offset for serialization
  
             beginPage3AcqVatTvamt = getStartOffset() + 1147;	// set offset for serialization
  
             beginPage3IssVatFicnt = getStartOffset() + 1158;	// set offset for serialization
  
             beginPage3IssVatFiamt = getStartOffset() + 1167;	// set offset for serialization
  
             beginPage3IssVatFvamt = getStartOffset() + 1182;	// set offset for serialization
  
             beginPage3IssVatNicnt = getStartOffset() + 1193;	// set offset for serialization
  
             beginPage3IssVatNiamt = getStartOffset() + 1202;	// set offset for serialization
  
             beginPage3IssVatNvamt = getStartOffset() + 1217;	// set offset for serialization
  
             beginPage3IssVatTicnt = getStartOffset() + 1228;	// set offset for serialization
  
             beginPage3IssVatTiamt = getStartOffset() + 1237;	// set offset for serialization
  
             beginPage3IssVatTvamt = getStartOffset() + 1252;	// set offset for serialization
  
             beginPage3NetVatFicnt = getStartOffset() + 1263;	// set offset for serialization
  
             beginPage3NetVatFiamt = getStartOffset() + 1272;	// set offset for serialization
  
             beginPage3NetVatFvamt = getStartOffset() + 1287;	// set offset for serialization
  
             beginPage3NetVatNicnt = getStartOffset() + 1298;	// set offset for serialization
  
             beginPage3NetVatNiamt = getStartOffset() + 1307;	// set offset for serialization
  
             beginPage3NetVatNvamt = getStartOffset() + 1322;	// set offset for serialization
  
             beginPage3NetVatTicnt = getStartOffset() + 1333;	// set offset for serialization
  
             beginPage3NetVatTiamt = getStartOffset() + 1342;	// set offset for serialization
  
             beginPage3NetVatTvamt = getStartOffset() + 1357;	// set offset for serialization
  
             beginGrandTotSw = getStartOffset() + 1368;	// set offset for serialization
  
             beginAmt = getStartOffset() + 1369;	// set offset for serialization
  
             beginAmtT4 = getStartOffset() + 1387;	// set offset for serialization
  
             beginAmtT5 = getStartOffset() + 1411;	// set offset for serialization
  
             beginAmtCca = getStartOffset() + 1429;	// set offset for serialization
  
             beginAmtIccr = getStartOffset() + 1447;	// set offset for serialization
  
             beginAmtCr = getStartOffset() + 1465;	// set offset for serialization
  
             beginAmtDb = getStartOffset() + 1483;	// set offset for serialization
  
             beginAmtCrFee = getStartOffset() + 1501;	// set offset for serialization
  
             beginAmtDbFee = getStartOffset() + 1519;	// set offset for serialization
  
             beginNetAcqDb = getStartOffset() + 1537;	// set offset for serialization
  
             beginNetAcqCr = getStartOffset() + 1555;	// set offset for serialization
  
             beginNetIssDb = getStartOffset() + 1573;	// set offset for serialization
  
             beginNetIssCr = getStartOffset() + 1591;	// set offset for serialization
  
             beginNetAchTot = getStartOffset() + 1609;	// set offset for serialization
  
             beginNetp4AcqDb = getStartOffset() + 1627;	// set offset for serialization
  
             beginNetp4AcqCr = getStartOffset() + 1649;	// set offset for serialization
  
             beginNetp4AcqTot = getStartOffset() + 1671;	// set offset for serialization
  
             beginNetp4IssDb = getStartOffset() + 1693;	// set offset for serialization
  
             beginNetp4IssCr = getStartOffset() + 1715;	// set offset for serialization
  
             beginNetp4IssTot = getStartOffset() + 1737;	// set offset for serialization
  
             beginNetp4AchTot = getStartOffset() + 1759;	// set offset for serialization
  
  
  
  
  
  
             beginHldAcqIssId = getStartOffset() + 1781;	// set offset for serialization
  
             beginSavAcqIssId = getStartOffset() + 1782;	// set offset for serialization
  
             beginCurAcqIssId = getStartOffset() + 1783;	// set offset for serialization
  
  
             beginSavMbrEndpoint = getStartOffset() + 1784;	// set offset for serialization
  
             beginCurMbrEndpoint = getStartOffset() + 1791;	// set offset for serialization
  
             beginSavMbrEntIca = getStartOffset() + 1798;	// set offset for serialization
  
             beginCurMbrEntIca = getStartOffset() + 1804;	// set offset for serialization
  
             beginSavMbrMbrIca = getStartOffset() + 1810;	// set offset for serialization
  
             beginCurMbrMbrIca = getStartOffset() + 1816;	// set offset for serialization
  
  
             beginApcTotAmount = getStartOffset() + 1822;	// set offset for serialization
  
             beginApcTotCrAmount = getStartOffset() + 1839;	// set offset for serialization
  
             beginApcTotDrAmount = getStartOffset() + 1859;	// set offset for serialization
  
  
  
  
  
             beginProdNdx = getStartOffset() + 1879;	// set offset for serialization
  
             beginNdxMax = getStartOffset() + 1881;	// set offset for serialization
  
             beginNdx = getStartOffset() + 1884;	// set offset for serialization
  
             beginCurNdx = getStartOffset() + 1887;	// set offset for serialization
  
             beginApcInx = getStartOffset() + 1890;	// set offset for serialization
  
             beginInx = getStartOffset() + 1895;	// set offset for serialization
  
             beginWS2 = getStartOffset() + 1900;	// set offset for serialization
  
  
  
             beginWaPageCtr = getStartOffset() + 1905;	// set offset for serialization
  
             beginWaLineCtr = getStartOffset() + 1909;	// set offset for serialization
  
  
             beginImpDec = getStartOffset() + 1913;	// set offset for serialization
  
             beginImpDecEp = getStartOffset() + 1914;	// set offset for serialization
  
             beginImpAmtf = getStartOffset() + 1915;	// set offset for serialization
  
             beginImpAmte = getStartOffset() + 1926;	// set offset for serialization
  
             beginImpAmtep = getStartOffset() + 1944;	// set offset for serialization
  
             beginImpAmt = getStartOffset() + 1962;	// set offset for serialization
  
             beginImpAmtT4 = getStartOffset() + 1980;	// set offset for serialization
  
             beginImpCnt = getStartOffset() + 2004;	// set offset for serialization
  
             beginFeeAmtNet = getStartOffset() + 2013;	// set offset for serialization
  
             beginTot1FeeAmtCr = getStartOffset() + 2030;	// set offset for serialization
  
             beginTot1FeeAmtDb = getStartOffset() + 2047;	// set offset for serialization
  
             beginTot1FeeAmtNet01 = getStartOffset() + 2064;	// set offset for serialization
  
             beginTot1FinAmt01 = getStartOffset() + 2081;	// set offset for serialization
  
             beginTot1FinNbr01 = getStartOffset() + 2099;	// set offset for serialization
  
             beginTot1FinNbrDen01 = getStartOffset() + 2108;	// set offset for serialization
  
             beginTot1FinFeeNbr01 = getStartOffset() + 2117;	// set offset for serialization
  
             beginTot1PctFeeNbr01 = getStartOffset() + 2126;	// set offset for serialization
  
             beginTot1NfinFeeNbr01 = getStartOffset() + 2135;	// set offset for serialization
  
             beginTot1NbilFeeNbr01 = getStartOffset() + 2144;	// set offset for serialization
  
             beginExp1FeeAmtCr = getStartOffset() + 2153;	// set offset for serialization
  
             beginExp1FeeAmtDb = getStartOffset() + 2168;	// set offset for serialization
  
             beginExp1FeeAmtNet01 = getStartOffset() + 2183;	// set offset for serialization
  
             beginExp1FinAmt01 = getStartOffset() + 2198;	// set offset for serialization
  
             beginExp1FinNbr01 = getStartOffset() + 2216;	// set offset for serialization
  
             beginExp1FinNbrDen01 = getStartOffset() + 2225;	// set offset for serialization
  
             beginExp1FinFeeNbr01 = getStartOffset() + 2234;	// set offset for serialization
  
             beginExp1PctFeeNbr01 = getStartOffset() + 2243;	// set offset for serialization
  
             beginExp1NfinFeeNbr01 = getStartOffset() + 2252;	// set offset for serialization
  
             beginExp1NbilFeeNbr01 = getStartOffset() + 2261;	// set offset for serialization
  
             beginSub1FeeAmtCr = getStartOffset() + 2270;	// set offset for serialization
  
             beginSub1FeeAmtDb = getStartOffset() + 2287;	// set offset for serialization
  
             beginSub1FeeAmtNet01 = getStartOffset() + 2304;	// set offset for serialization
  
             beginSub1FinAmt01 = getStartOffset() + 2321;	// set offset for serialization
  
             beginSub1FinNbr01 = getStartOffset() + 2339;	// set offset for serialization
  
             beginSub1FinNbrDen01 = getStartOffset() + 2348;	// set offset for serialization
  
             beginSub1FinFeeNbr01 = getStartOffset() + 2357;	// set offset for serialization
  
             beginSub1PctFeeNbr01 = getStartOffset() + 2366;	// set offset for serialization
  
             beginSub1NfinFeeNbr01 = getStartOffset() + 2375;	// set offset for serialization
  
             beginSub1NbilFeeNbr01 = getStartOffset() + 2384;	// set offset for serialization
  
  
  
  
  
  
  
             beginMaxDays = getStartOffset() + 2393;	// set offset for serialization
  
  
  
  
  
             beginMcrInCnt = getStartOffset() + 2395;	// set offset for serialization
  
             beginMcrSkippedCnt = getStartOffset() + 2402;	// set offset for serialization
  
             beginMonthSub = getStartOffset() + 2409;	// set offset for serialization
  
             beginX360HeaderCuttime01 = getStartOffset() + 2411;	// set offset for serialization
  
  
  
  
  
             beginNetmceTot = getStartOffset() + 2415;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWsaProgramNameCounter = -1;
     public boolean isWsaProgramNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWsaProgramNameCounter != sharedCounter;
         localWsaProgramNameCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWsaProgramNameConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localWsaReleaseNbrCounter = -1;
     public boolean isWsaReleaseNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWsaReleaseNbrCounter != sharedCounter;
         localWsaReleaseNbrCounter = sharedCounter; return hasModified;
     }

   protected char[] checkWsaReleaseNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
         int localMciabendAbendCodeCounter = -1;
         public boolean isMciabendAbendCodeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMciabendAbendCodeCounter != sharedCounter;
            localMciabendAbendCodeCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkMciabendAbendCodeMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     int localBlkLineCounter = -1;
     public boolean isBlkLineModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBlkLineCounter != sharedCounter;
         localBlkLineCounter = sharedCounter; return hasModified;
     }

   protected char[] checkBlkLineConstraints(char[] value) {
   			return super.checkConstraints(value , 133 ,false, false);
   }
     int localProductionTitleCounter = -1;
     public boolean isProductionTitleModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localProductionTitleCounter != sharedCounter;
         localProductionTitleCounter = sharedCounter; return hasModified;
     }

   protected char[] checkProductionTitleConstraints(char[] value) {
   			return super.checkConstraints(value , 27 ,false, false);
   }
     int localCertificationTitleCounter = -1;
     public boolean isCertificationTitleModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCertificationTitleCounter != sharedCounter;
         localCertificationTitleCounter = sharedCounter; return hasModified;
     }

   protected char[] checkCertificationTitleConstraints(char[] value) {
   			return super.checkConstraints(value , 27 ,false, false);
   }
     int localFastTrckTitleCounter = -1;
     public boolean isFastTrckTitleModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFastTrckTitleCounter != sharedCounter;
         localFastTrckTitleCounter = sharedCounter; return hasModified;
     }

   protected char[] checkFastTrckTitleConstraints(char[] value) {
   			return super.checkConstraints(value , 27 ,false, false);
   }
     int localCrEnvIdCounter = -1;
     public boolean isCrEnvIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCrEnvIdCounter != sharedCounter;
         localCrEnvIdCounter = sharedCounter; return hasModified;
     }

   protected char[] checkCrEnvIdConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localHdPage1Ln3bCounter = -1;
     public boolean isHdPage1Ln3bModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHdPage1Ln3bCounter != sharedCounter;
         localHdPage1Ln3bCounter = sharedCounter; return hasModified;
     }

   protected char[] checkHdPage1Ln3bConstraints(char[] value) {
   			return super.checkConstraints(value , 132 ,false, false);
   }
     int localHdPage1Ln7Counter = -1;
     public boolean isHdPage1Ln7Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHdPage1Ln7Counter != sharedCounter;
         localHdPage1Ln7Counter = sharedCounter; return hasModified;
     }

   protected char[] checkHdPage1Ln7Constraints(char[] value) {
   			return super.checkConstraints(value , 133 ,false, false);
   }
     int localHdPage1Ln8Counter = -1;
     public boolean isHdPage1Ln8Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHdPage1Ln8Counter != sharedCounter;
         localHdPage1Ln8Counter = sharedCounter; return hasModified;
     }

   protected char[] checkHdPage1Ln8Constraints(char[] value) {
   			return super.checkConstraints(value , 133 ,false, false);
   }
     int localHdPage1Ln9Counter = -1;
     public boolean isHdPage1Ln9Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHdPage1Ln9Counter != sharedCounter;
         localHdPage1Ln9Counter = sharedCounter; return hasModified;
     }

   protected char[] checkHdPage1Ln9Constraints(char[] value) {
   			return super.checkConstraints(value , 133 ,false, false);
   }
     int localDashPage1LnCounter = -1;
     public boolean isDashPage1LnModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDashPage1LnCounter != sharedCounter;
         localDashPage1LnCounter = sharedCounter; return hasModified;
     }

   protected char[] checkDashPage1LnConstraints(char[] value) {
   			return super.checkConstraints(value , 133 ,false, false);
   }
     int localHdPage2Ln1Counter = -1;
     public boolean isHdPage2Ln1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHdPage2Ln1Counter != sharedCounter;
         localHdPage2Ln1Counter = sharedCounter; return hasModified;
     }

   protected char[] checkHdPage2Ln1Constraints(char[] value) {
   			return super.checkConstraints(value , 133 ,false, false);
   }
     int localHdPage2Ln2Counter = -1;
     public boolean isHdPage2Ln2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHdPage2Ln2Counter != sharedCounter;
         localHdPage2Ln2Counter = sharedCounter; return hasModified;
     }

   protected char[] checkHdPage2Ln2Constraints(char[] value) {
   			return super.checkConstraints(value , 133 ,false, false);
   }
     int localHdPage2Ln3Counter = -1;
     public boolean isHdPage2Ln3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHdPage2Ln3Counter != sharedCounter;
         localHdPage2Ln3Counter = sharedCounter; return hasModified;
     }

   protected char[] checkHdPage2Ln3Constraints(char[] value) {
   			return super.checkConstraints(value , 133 ,false, false);
   }
     int localHdPage2Ln4Counter = -1;
     public boolean isHdPage2Ln4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHdPage2Ln4Counter != sharedCounter;
         localHdPage2Ln4Counter = sharedCounter; return hasModified;
     }

   protected char[] checkHdPage2Ln4Constraints(char[] value) {
   			return super.checkConstraints(value , 133 ,false, false);
   }
     int localHdPage2Ln5Counter = -1;
     public boolean isHdPage2Ln5Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHdPage2Ln5Counter != sharedCounter;
         localHdPage2Ln5Counter = sharedCounter; return hasModified;
     }

   protected char[] checkHdPage2Ln5Constraints(char[] value) {
   			return super.checkConstraints(value , 133 ,false, false);
   }
     int localHdPage2Ln6Counter = -1;
     public boolean isHdPage2Ln6Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHdPage2Ln6Counter != sharedCounter;
         localHdPage2Ln6Counter = sharedCounter; return hasModified;
     }

   protected char[] checkHdPage2Ln6Constraints(char[] value) {
   			return super.checkConstraints(value , 133 ,false, false);
   }
     int localHdPage3Ln1Counter = -1;
     public boolean isHdPage3Ln1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHdPage3Ln1Counter != sharedCounter;
         localHdPage3Ln1Counter = sharedCounter; return hasModified;
     }

   protected char[] checkHdPage3Ln1Constraints(char[] value) {
   			return super.checkConstraints(value , 133 ,false, false);
   }
     int localHdPage3Ln1aCounter = -1;
     public boolean isHdPage3Ln1aModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHdPage3Ln1aCounter != sharedCounter;
         localHdPage3Ln1aCounter = sharedCounter; return hasModified;
     }

   protected char[] checkHdPage3Ln1aConstraints(char[] value) {
   			return super.checkConstraints(value , 132 ,false, false);
   }
     int localHdPage3Ln2Counter = -1;
     public boolean isHdPage3Ln2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHdPage3Ln2Counter != sharedCounter;
         localHdPage3Ln2Counter = sharedCounter; return hasModified;
     }

   protected char[] checkHdPage3Ln2Constraints(char[] value) {
   			return super.checkConstraints(value , 133 ,false, false);
   }
     int localHdPage3Ln6Counter = -1;
     public boolean isHdPage3Ln6Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHdPage3Ln6Counter != sharedCounter;
         localHdPage3Ln6Counter = sharedCounter; return hasModified;
     }

   protected char[] checkHdPage3Ln6Constraints(char[] value) {
   			return super.checkConstraints(value , 133 ,false, false);
   }
     int localHdPage3Ln7Counter = -1;
     public boolean isHdPage3Ln7Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHdPage3Ln7Counter != sharedCounter;
         localHdPage3Ln7Counter = sharedCounter; return hasModified;
     }

   protected char[] checkHdPage3Ln7Constraints(char[] value) {
   			return super.checkConstraints(value , 133 ,false, false);
   }
     int localHdPage3Ln8Counter = -1;
     public boolean isHdPage3Ln8Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHdPage3Ln8Counter != sharedCounter;
         localHdPage3Ln8Counter = sharedCounter; return hasModified;
     }

   protected char[] checkHdPage3Ln8Constraints(char[] value) {
   			return super.checkConstraints(value , 133 ,false, false);
   }
     int localHdPage3Ln9Counter = -1;
     public boolean isHdPage3Ln9Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHdPage3Ln9Counter != sharedCounter;
         localHdPage3Ln9Counter = sharedCounter; return hasModified;
     }

   protected char[] checkHdPage3Ln9Constraints(char[] value) {
   			return super.checkConstraints(value , 133 ,false, false);
   }
     int localHdPage3Ln10Counter = -1;
     public boolean isHdPage3Ln10Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHdPage3Ln10Counter != sharedCounter;
         localHdPage3Ln10Counter = sharedCounter; return hasModified;
     }

   protected char[] checkHdPage3Ln10Constraints(char[] value) {
   			return super.checkConstraints(value , 133 ,false, false);
   }
     int localHdPage3Ln11Counter = -1;
     public boolean isHdPage3Ln11Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHdPage3Ln11Counter != sharedCounter;
         localHdPage3Ln11Counter = sharedCounter; return hasModified;
     }

   protected char[] checkHdPage3Ln11Constraints(char[] value) {
   			return super.checkConstraints(value , 133 ,false, false);
   }
     int localDt311SamacqNetAmtCounter = -1;
     public boolean isDt311SamacqNetAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt311SamacqNetAmtCounter != sharedCounter;
         localDt311SamacqNetAmtCounter = sharedCounter; return hasModified;
     }

   protected char[] checkDt311SamacqNetAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
     int localDt311SamacqIndCounter = -1;
     public boolean isDt311SamacqIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt311SamacqIndCounter != sharedCounter;
         localDt311SamacqIndCounter = sharedCounter; return hasModified;
     }

   protected char[] checkDt311SamacqIndConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localDt311SamacqFeeAmtCounter = -1;
     public boolean isDt311SamacqFeeAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt311SamacqFeeAmtCounter != sharedCounter;
         localDt311SamacqFeeAmtCounter = sharedCounter; return hasModified;
     }

   protected char[] checkDt311SamacqFeeAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
     int localDt311SamacqFeeIndCounter = -1;
     public boolean isDt311SamacqFeeIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt311SamacqFeeIndCounter != sharedCounter;
         localDt311SamacqFeeIndCounter = sharedCounter; return hasModified;
     }

   protected char[] checkDt311SamacqFeeIndConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localDt311SamissNetAmtCounter = -1;
     public boolean isDt311SamissNetAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt311SamissNetAmtCounter != sharedCounter;
         localDt311SamissNetAmtCounter = sharedCounter; return hasModified;
     }

   protected char[] checkDt311SamissNetAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
     int localDt311SamissIndCounter = -1;
     public boolean isDt311SamissIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt311SamissIndCounter != sharedCounter;
         localDt311SamissIndCounter = sharedCounter; return hasModified;
     }

   protected char[] checkDt311SamissIndConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localDt311SamissFeeAmtCounter = -1;
     public boolean isDt311SamissFeeAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt311SamissFeeAmtCounter != sharedCounter;
         localDt311SamissFeeAmtCounter = sharedCounter; return hasModified;
     }

   protected char[] checkDt311SamissFeeAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
     int localDt311SamissFeeIndCounter = -1;
     public boolean isDt311SamissFeeIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDt311SamissFeeIndCounter != sharedCounter;
         localDt311SamissFeeIndCounter = sharedCounter; return hasModified;
     }

   protected char[] checkDt311SamissFeeIndConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localP2AcqPrintCounter = -1;
     public boolean isP2AcqPrintModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localP2AcqPrintCounter != sharedCounter;
         localP2AcqPrintCounter = sharedCounter; return hasModified;
     }

   protected char[] checkP2AcqPrintConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localP2IssPrintCounter = -1;
     public boolean isP2IssPrintModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localP2IssPrintCounter != sharedCounter;
         localP2IssPrintCounter = sharedCounter; return hasModified;
     }

   protected char[] checkP2IssPrintConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localSwRptqEofCounter = -1;
     public boolean isSwRptqEofModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSwRptqEofCounter != sharedCounter;
         localSwRptqEofCounter = sharedCounter; return hasModified;
     }

   protected char[] checkSwRptqEofConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localSwCurrEofCounter = -1;
     public boolean isSwCurrEofModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSwCurrEofCounter != sharedCounter;
         localSwCurrEofCounter = sharedCounter; return hasModified;
     }

   protected char[] checkSwCurrEofConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localSwApcEofCounter = -1;
     public boolean isSwApcEofModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSwApcEofCounter != sharedCounter;
         localSwApcEofCounter = sharedCounter; return hasModified;
     }

   protected char[] checkSwApcEofConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localErlyFlagSwCounter = -1;
     public boolean isErlyFlagSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErlyFlagSwCounter != sharedCounter;
         localErlyFlagSwCounter = sharedCounter; return hasModified;
     }

   protected char[] checkErlyFlagSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localPage2AcqFinDbCntCounter = -1;
     public boolean isPage2AcqFinDbCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2AcqFinDbCntCounter != sharedCounter;
         localPage2AcqFinDbCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2AcqFinDbCnt
	 *	@return page2AcqFinDbCnt
	 */
	public char[]  getPage2AcqFinDbCntString() {
	     return getCharArray(beginPage2AcqFinDbCnt,PAGE_2_ACQ_FIN_DB_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2AcqFinDbCntIsNumeric() {
	    return isNumeric(beginPage2AcqFinDbCnt
	                    ,beginPage2AcqFinDbCnt + PAGE_2_ACQ_FIN_DB_CNT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ACQ_FIN_DB_CNT_LEN = 9;
  	/**
	 * serializePage2AcqFinDbCnt
	 */
	protected void serializePage2AcqFinDbCnt(int page2AcqFinDbCnt) {
		 putNumber(beginPage2AcqFinDbCnt,page2AcqFinDbCnt,PAGE_2_ACQ_FIN_DB_CNT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2AcqFinDbCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2AcqFinDbCnt
	 */
   	protected  int serializePage2AcqFinDbCnt(char[] value) {
	    int  page2AcqFinDbCnt;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2AcqFinDbCnt = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginPage2AcqFinDbCnt
		       ,9
		      );
		 localPage2AcqFinDbCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2AcqFinDbCnt;
    }

   protected int checkPage2AcqFinDbCntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2AcqFinDbCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPage2AcqFinDbCnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPage2AcqFinDbCnt
			                 ,PAGE_2_ACQ_FIN_DB_CNT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2AcqFinDbCnt", beginPage2AcqFinDbCnt,PAGE_2_ACQ_FIN_DB_CNT_LEN);
    }
   	}
     int localPage2AcqFinDbAmtCounter = -1;
     public boolean isPage2AcqFinDbAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2AcqFinDbAmtCounter != sharedCounter;
         localPage2AcqFinDbAmtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2AcqFinDbAmt
	 *	@return page2AcqFinDbAmt
	 */
	public char[]  getPage2AcqFinDbAmtString() {
	     return getCharArray(beginPage2AcqFinDbAmt,PAGE_2_ACQ_FIN_DB_AMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2AcqFinDbAmtIsNumeric() {
	    return isNumeric(beginPage2AcqFinDbAmt
	                    ,beginPage2AcqFinDbAmt + PAGE_2_ACQ_FIN_DB_AMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ACQ_FIN_DB_AMT_LEN = 18;
  	/**
	 * serializePage2AcqFinDbAmt
	 */
	protected void serializePage2AcqFinDbAmt(long page2AcqFinDbAmt) {
		 putNumber(beginPage2AcqFinDbAmt,page2AcqFinDbAmt,PAGE_2_ACQ_FIN_DB_AMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2AcqFinDbAmtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2AcqFinDbAmt
	 */
   	protected  long serializePage2AcqFinDbAmt(char[] value) {
	    long  page2AcqFinDbAmt;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2AcqFinDbAmt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginPage2AcqFinDbAmt
		       ,18
		      );
		 localPage2AcqFinDbAmtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2AcqFinDbAmt;
    }

   protected long checkPage2AcqFinDbAmtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2AcqFinDbAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage2AcqFinDbAmt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage2AcqFinDbAmt
			                 ,PAGE_2_ACQ_FIN_DB_AMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2AcqFinDbAmt", beginPage2AcqFinDbAmt,PAGE_2_ACQ_FIN_DB_AMT_LEN);
    }
   	}
     int localPage2AcqTmpCrCntCounter = -1;
     public boolean isPage2AcqTmpCrCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2AcqTmpCrCntCounter != sharedCounter;
         localPage2AcqTmpCrCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2AcqTmpCrCnt
	 *	@return page2AcqTmpCrCnt
	 */
	public char[]  getPage2AcqTmpCrCntString() {
	     return getCharArray(beginPage2AcqTmpCrCnt,PAGE_2_ACQ_TMP_CR_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2AcqTmpCrCntIsNumeric() {
	    return isNumeric(beginPage2AcqTmpCrCnt
	                    ,beginPage2AcqTmpCrCnt + PAGE_2_ACQ_TMP_CR_CNT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ACQ_TMP_CR_CNT_LEN = 9;
  	/**
	 * serializePage2AcqTmpCrCnt
	 */
	protected void serializePage2AcqTmpCrCnt(int page2AcqTmpCrCnt) {
		 putNumber(beginPage2AcqTmpCrCnt,page2AcqTmpCrCnt,PAGE_2_ACQ_TMP_CR_CNT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2AcqTmpCrCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2AcqTmpCrCnt
	 */
   	protected  int serializePage2AcqTmpCrCnt(char[] value) {
	    int  page2AcqTmpCrCnt;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2AcqTmpCrCnt = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginPage2AcqTmpCrCnt
		       ,9
		      );
		 localPage2AcqTmpCrCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2AcqTmpCrCnt;
    }

   protected int checkPage2AcqTmpCrCntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2AcqTmpCrCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPage2AcqTmpCrCnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPage2AcqTmpCrCnt
			                 ,PAGE_2_ACQ_TMP_CR_CNT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2AcqTmpCrCnt", beginPage2AcqTmpCrCnt,PAGE_2_ACQ_TMP_CR_CNT_LEN);
    }
   	}
     int localPage2AcqTmpDbCntCounter = -1;
     public boolean isPage2AcqTmpDbCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2AcqTmpDbCntCounter != sharedCounter;
         localPage2AcqTmpDbCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2AcqTmpDbCnt
	 *	@return page2AcqTmpDbCnt
	 */
	public char[]  getPage2AcqTmpDbCntString() {
	     return getCharArray(beginPage2AcqTmpDbCnt,PAGE_2_ACQ_TMP_DB_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2AcqTmpDbCntIsNumeric() {
	    return isNumeric(beginPage2AcqTmpDbCnt
	                    ,beginPage2AcqTmpDbCnt + PAGE_2_ACQ_TMP_DB_CNT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ACQ_TMP_DB_CNT_LEN = 9;
  	/**
	 * serializePage2AcqTmpDbCnt
	 */
	protected void serializePage2AcqTmpDbCnt(int page2AcqTmpDbCnt) {
		 putNumber(beginPage2AcqTmpDbCnt,page2AcqTmpDbCnt,PAGE_2_ACQ_TMP_DB_CNT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2AcqTmpDbCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2AcqTmpDbCnt
	 */
   	protected  int serializePage2AcqTmpDbCnt(char[] value) {
	    int  page2AcqTmpDbCnt;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2AcqTmpDbCnt = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginPage2AcqTmpDbCnt
		       ,9
		      );
		 localPage2AcqTmpDbCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2AcqTmpDbCnt;
    }

   protected int checkPage2AcqTmpDbCntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2AcqTmpDbCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPage2AcqTmpDbCnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPage2AcqTmpDbCnt
			                 ,PAGE_2_ACQ_TMP_DB_CNT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2AcqTmpDbCnt", beginPage2AcqTmpDbCnt,PAGE_2_ACQ_TMP_DB_CNT_LEN);
    }
   	}
     int localPage2AcqFinCrCntCounter = -1;
     public boolean isPage2AcqFinCrCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2AcqFinCrCntCounter != sharedCounter;
         localPage2AcqFinCrCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2AcqFinCrCnt
	 *	@return page2AcqFinCrCnt
	 */
	public char[]  getPage2AcqFinCrCntString() {
	     return getCharArray(beginPage2AcqFinCrCnt,PAGE_2_ACQ_FIN_CR_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2AcqFinCrCntIsNumeric() {
	    return isNumeric(beginPage2AcqFinCrCnt
	                    ,beginPage2AcqFinCrCnt + PAGE_2_ACQ_FIN_CR_CNT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ACQ_FIN_CR_CNT_LEN = 9;
  	/**
	 * serializePage2AcqFinCrCnt
	 */
	protected void serializePage2AcqFinCrCnt(int page2AcqFinCrCnt) {
		 putNumber(beginPage2AcqFinCrCnt,page2AcqFinCrCnt,PAGE_2_ACQ_FIN_CR_CNT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2AcqFinCrCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2AcqFinCrCnt
	 */
   	protected  int serializePage2AcqFinCrCnt(char[] value) {
	    int  page2AcqFinCrCnt;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2AcqFinCrCnt = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginPage2AcqFinCrCnt
		       ,9
		      );
		 localPage2AcqFinCrCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2AcqFinCrCnt;
    }

   protected int checkPage2AcqFinCrCntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2AcqFinCrCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPage2AcqFinCrCnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPage2AcqFinCrCnt
			                 ,PAGE_2_ACQ_FIN_CR_CNT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2AcqFinCrCnt", beginPage2AcqFinCrCnt,PAGE_2_ACQ_FIN_CR_CNT_LEN);
    }
   	}
     int localPage2AcqFinCrAmtCounter = -1;
     public boolean isPage2AcqFinCrAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2AcqFinCrAmtCounter != sharedCounter;
         localPage2AcqFinCrAmtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2AcqFinCrAmt
	 *	@return page2AcqFinCrAmt
	 */
	public char[]  getPage2AcqFinCrAmtString() {
	     return getCharArray(beginPage2AcqFinCrAmt,PAGE_2_ACQ_FIN_CR_AMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2AcqFinCrAmtIsNumeric() {
	    return isNumeric(beginPage2AcqFinCrAmt
	                    ,beginPage2AcqFinCrAmt + PAGE_2_ACQ_FIN_CR_AMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ACQ_FIN_CR_AMT_LEN = 18;
  	/**
	 * serializePage2AcqFinCrAmt
	 */
	protected void serializePage2AcqFinCrAmt(long page2AcqFinCrAmt) {
		 putNumber(beginPage2AcqFinCrAmt,page2AcqFinCrAmt,PAGE_2_ACQ_FIN_CR_AMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2AcqFinCrAmtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2AcqFinCrAmt
	 */
   	protected  long serializePage2AcqFinCrAmt(char[] value) {
	    long  page2AcqFinCrAmt;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2AcqFinCrAmt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginPage2AcqFinCrAmt
		       ,18
		      );
		 localPage2AcqFinCrAmtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2AcqFinCrAmt;
    }

   protected long checkPage2AcqFinCrAmtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2AcqFinCrAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage2AcqFinCrAmt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage2AcqFinCrAmt
			                 ,PAGE_2_ACQ_FIN_CR_AMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2AcqFinCrAmt", beginPage2AcqFinCrAmt,PAGE_2_ACQ_FIN_CR_AMT_LEN);
    }
   	}
     int localPage2AcqAdjDbCntCounter = -1;
     public boolean isPage2AcqAdjDbCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2AcqAdjDbCntCounter != sharedCounter;
         localPage2AcqAdjDbCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2AcqAdjDbCnt
	 *	@return page2AcqAdjDbCnt
	 */
	public char[]  getPage2AcqAdjDbCntString() {
	     return getCharArray(beginPage2AcqAdjDbCnt,PAGE_2_ACQ_ADJ_DB_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2AcqAdjDbCntIsNumeric() {
	    return isNumeric(beginPage2AcqAdjDbCnt
	                    ,beginPage2AcqAdjDbCnt + PAGE_2_ACQ_ADJ_DB_CNT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ACQ_ADJ_DB_CNT_LEN = 9;
  	/**
	 * serializePage2AcqAdjDbCnt
	 */
	protected void serializePage2AcqAdjDbCnt(int page2AcqAdjDbCnt) {
		 putNumber(beginPage2AcqAdjDbCnt,page2AcqAdjDbCnt,PAGE_2_ACQ_ADJ_DB_CNT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2AcqAdjDbCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2AcqAdjDbCnt
	 */
   	protected  int serializePage2AcqAdjDbCnt(char[] value) {
	    int  page2AcqAdjDbCnt;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2AcqAdjDbCnt = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginPage2AcqAdjDbCnt
		       ,9
		      );
		 localPage2AcqAdjDbCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2AcqAdjDbCnt;
    }

   protected int checkPage2AcqAdjDbCntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2AcqAdjDbCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPage2AcqAdjDbCnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPage2AcqAdjDbCnt
			                 ,PAGE_2_ACQ_ADJ_DB_CNT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2AcqAdjDbCnt", beginPage2AcqAdjDbCnt,PAGE_2_ACQ_ADJ_DB_CNT_LEN);
    }
   	}
     int localPage2AcqAdjDbAmtCounter = -1;
     public boolean isPage2AcqAdjDbAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2AcqAdjDbAmtCounter != sharedCounter;
         localPage2AcqAdjDbAmtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2AcqAdjDbAmt
	 *	@return page2AcqAdjDbAmt
	 */
	public char[]  getPage2AcqAdjDbAmtString() {
	     return getCharArray(beginPage2AcqAdjDbAmt,PAGE_2_ACQ_ADJ_DB_AMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2AcqAdjDbAmtIsNumeric() {
	    return isNumeric(beginPage2AcqAdjDbAmt
	                    ,beginPage2AcqAdjDbAmt + PAGE_2_ACQ_ADJ_DB_AMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ACQ_ADJ_DB_AMT_LEN = 18;
  	/**
	 * serializePage2AcqAdjDbAmt
	 */
	protected void serializePage2AcqAdjDbAmt(long page2AcqAdjDbAmt) {
		 putNumber(beginPage2AcqAdjDbAmt,page2AcqAdjDbAmt,PAGE_2_ACQ_ADJ_DB_AMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2AcqAdjDbAmtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2AcqAdjDbAmt
	 */
   	protected  long serializePage2AcqAdjDbAmt(char[] value) {
	    long  page2AcqAdjDbAmt;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2AcqAdjDbAmt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginPage2AcqAdjDbAmt
		       ,18
		      );
		 localPage2AcqAdjDbAmtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2AcqAdjDbAmt;
    }

   protected long checkPage2AcqAdjDbAmtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2AcqAdjDbAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage2AcqAdjDbAmt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage2AcqAdjDbAmt
			                 ,PAGE_2_ACQ_ADJ_DB_AMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2AcqAdjDbAmt", beginPage2AcqAdjDbAmt,PAGE_2_ACQ_ADJ_DB_AMT_LEN);
    }
   	}
     int localPage2AcqAdjCrCntCounter = -1;
     public boolean isPage2AcqAdjCrCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2AcqAdjCrCntCounter != sharedCounter;
         localPage2AcqAdjCrCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2AcqAdjCrCnt
	 *	@return page2AcqAdjCrCnt
	 */
	public char[]  getPage2AcqAdjCrCntString() {
	     return getCharArray(beginPage2AcqAdjCrCnt,PAGE_2_ACQ_ADJ_CR_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2AcqAdjCrCntIsNumeric() {
	    return isNumeric(beginPage2AcqAdjCrCnt
	                    ,beginPage2AcqAdjCrCnt + PAGE_2_ACQ_ADJ_CR_CNT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ACQ_ADJ_CR_CNT_LEN = 9;
  	/**
	 * serializePage2AcqAdjCrCnt
	 */
	protected void serializePage2AcqAdjCrCnt(int page2AcqAdjCrCnt) {
		 putNumber(beginPage2AcqAdjCrCnt,page2AcqAdjCrCnt,PAGE_2_ACQ_ADJ_CR_CNT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2AcqAdjCrCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2AcqAdjCrCnt
	 */
   	protected  int serializePage2AcqAdjCrCnt(char[] value) {
	    int  page2AcqAdjCrCnt;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2AcqAdjCrCnt = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginPage2AcqAdjCrCnt
		       ,9
		      );
		 localPage2AcqAdjCrCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2AcqAdjCrCnt;
    }

   protected int checkPage2AcqAdjCrCntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2AcqAdjCrCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPage2AcqAdjCrCnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPage2AcqAdjCrCnt
			                 ,PAGE_2_ACQ_ADJ_CR_CNT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2AcqAdjCrCnt", beginPage2AcqAdjCrCnt,PAGE_2_ACQ_ADJ_CR_CNT_LEN);
    }
   	}
     int localPage2AcqAdjCrAmtCounter = -1;
     public boolean isPage2AcqAdjCrAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2AcqAdjCrAmtCounter != sharedCounter;
         localPage2AcqAdjCrAmtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2AcqAdjCrAmt
	 *	@return page2AcqAdjCrAmt
	 */
	public char[]  getPage2AcqAdjCrAmtString() {
	     return getCharArray(beginPage2AcqAdjCrAmt,PAGE_2_ACQ_ADJ_CR_AMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2AcqAdjCrAmtIsNumeric() {
	    return isNumeric(beginPage2AcqAdjCrAmt
	                    ,beginPage2AcqAdjCrAmt + PAGE_2_ACQ_ADJ_CR_AMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ACQ_ADJ_CR_AMT_LEN = 18;
  	/**
	 * serializePage2AcqAdjCrAmt
	 */
	protected void serializePage2AcqAdjCrAmt(long page2AcqAdjCrAmt) {
		 putNumber(beginPage2AcqAdjCrAmt,page2AcqAdjCrAmt,PAGE_2_ACQ_ADJ_CR_AMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2AcqAdjCrAmtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2AcqAdjCrAmt
	 */
   	protected  long serializePage2AcqAdjCrAmt(char[] value) {
	    long  page2AcqAdjCrAmt;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2AcqAdjCrAmt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginPage2AcqAdjCrAmt
		       ,18
		      );
		 localPage2AcqAdjCrAmtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2AcqAdjCrAmt;
    }

   protected long checkPage2AcqAdjCrAmtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2AcqAdjCrAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage2AcqAdjCrAmt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage2AcqAdjCrAmt
			                 ,PAGE_2_ACQ_ADJ_CR_AMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2AcqAdjCrAmt", beginPage2AcqAdjCrAmt,PAGE_2_ACQ_ADJ_CR_AMT_LEN);
    }
   	}
     int localPage2AcqAdj09DbCntCounter = -1;
     public boolean isPage2AcqAdj09DbCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2AcqAdj09DbCntCounter != sharedCounter;
         localPage2AcqAdj09DbCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2AcqAdj09DbCnt
	 *	@return page2AcqAdj09DbCnt
	 */
	public char[]  getPage2AcqAdj09DbCntString() {
	     return getCharArray(beginPage2AcqAdj09DbCnt,PAGE_2_ACQ_ADJ_09_DB_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2AcqAdj09DbCntIsNumeric() {
	    return isNumeric(beginPage2AcqAdj09DbCnt
	                    ,beginPage2AcqAdj09DbCnt + PAGE_2_ACQ_ADJ_09_DB_CNT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ACQ_ADJ_09_DB_CNT_LEN = 9;
  	/**
	 * serializePage2AcqAdj09DbCnt
	 */
	protected void serializePage2AcqAdj09DbCnt(int page2AcqAdj09DbCnt) {
		 putNumber(beginPage2AcqAdj09DbCnt,page2AcqAdj09DbCnt,PAGE_2_ACQ_ADJ_09_DB_CNT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2AcqAdj09DbCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2AcqAdj09DbCnt
	 */
   	protected  int serializePage2AcqAdj09DbCnt(char[] value) {
	    int  page2AcqAdj09DbCnt;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2AcqAdj09DbCnt = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginPage2AcqAdj09DbCnt
		       ,9
		      );
		 localPage2AcqAdj09DbCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2AcqAdj09DbCnt;
    }

   protected int checkPage2AcqAdj09DbCntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2AcqAdj09DbCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPage2AcqAdj09DbCnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPage2AcqAdj09DbCnt
			                 ,PAGE_2_ACQ_ADJ_09_DB_CNT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2AcqAdj09DbCnt", beginPage2AcqAdj09DbCnt,PAGE_2_ACQ_ADJ_09_DB_CNT_LEN);
    }
   	}
     int localPage2AcqAdj09DbAmtCounter = -1;
     public boolean isPage2AcqAdj09DbAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2AcqAdj09DbAmtCounter != sharedCounter;
         localPage2AcqAdj09DbAmtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2AcqAdj09DbAmt
	 *	@return page2AcqAdj09DbAmt
	 */
	public char[]  getPage2AcqAdj09DbAmtString() {
	     return getCharArray(beginPage2AcqAdj09DbAmt,PAGE_2_ACQ_ADJ_09_DB_AMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2AcqAdj09DbAmtIsNumeric() {
	    return isNumeric(beginPage2AcqAdj09DbAmt
	                    ,beginPage2AcqAdj09DbAmt + PAGE_2_ACQ_ADJ_09_DB_AMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ACQ_ADJ_09_DB_AMT_LEN = 18;
  	/**
	 * serializePage2AcqAdj09DbAmt
	 */
	protected void serializePage2AcqAdj09DbAmt(long page2AcqAdj09DbAmt) {
		 putNumber(beginPage2AcqAdj09DbAmt,page2AcqAdj09DbAmt,PAGE_2_ACQ_ADJ_09_DB_AMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2AcqAdj09DbAmtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2AcqAdj09DbAmt
	 */
   	protected  long serializePage2AcqAdj09DbAmt(char[] value) {
	    long  page2AcqAdj09DbAmt;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2AcqAdj09DbAmt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginPage2AcqAdj09DbAmt
		       ,18
		      );
		 localPage2AcqAdj09DbAmtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2AcqAdj09DbAmt;
    }

   protected long checkPage2AcqAdj09DbAmtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2AcqAdj09DbAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage2AcqAdj09DbAmt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage2AcqAdj09DbAmt
			                 ,PAGE_2_ACQ_ADJ_09_DB_AMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2AcqAdj09DbAmt", beginPage2AcqAdj09DbAmt,PAGE_2_ACQ_ADJ_09_DB_AMT_LEN);
    }
   	}
     int localPage2AcqAdj09CrCntCounter = -1;
     public boolean isPage2AcqAdj09CrCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2AcqAdj09CrCntCounter != sharedCounter;
         localPage2AcqAdj09CrCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2AcqAdj09CrCnt
	 *	@return page2AcqAdj09CrCnt
	 */
	public char[]  getPage2AcqAdj09CrCntString() {
	     return getCharArray(beginPage2AcqAdj09CrCnt,PAGE_2_ACQ_ADJ_09_CR_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2AcqAdj09CrCntIsNumeric() {
	    return isNumeric(beginPage2AcqAdj09CrCnt
	                    ,beginPage2AcqAdj09CrCnt + PAGE_2_ACQ_ADJ_09_CR_CNT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ACQ_ADJ_09_CR_CNT_LEN = 9;
  	/**
	 * serializePage2AcqAdj09CrCnt
	 */
	protected void serializePage2AcqAdj09CrCnt(int page2AcqAdj09CrCnt) {
		 putNumber(beginPage2AcqAdj09CrCnt,page2AcqAdj09CrCnt,PAGE_2_ACQ_ADJ_09_CR_CNT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2AcqAdj09CrCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2AcqAdj09CrCnt
	 */
   	protected  int serializePage2AcqAdj09CrCnt(char[] value) {
	    int  page2AcqAdj09CrCnt;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2AcqAdj09CrCnt = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginPage2AcqAdj09CrCnt
		       ,9
		      );
		 localPage2AcqAdj09CrCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2AcqAdj09CrCnt;
    }

   protected int checkPage2AcqAdj09CrCntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2AcqAdj09CrCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPage2AcqAdj09CrCnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPage2AcqAdj09CrCnt
			                 ,PAGE_2_ACQ_ADJ_09_CR_CNT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2AcqAdj09CrCnt", beginPage2AcqAdj09CrCnt,PAGE_2_ACQ_ADJ_09_CR_CNT_LEN);
    }
   	}
     int localPage2AcqAdj09CrAmtCounter = -1;
     public boolean isPage2AcqAdj09CrAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2AcqAdj09CrAmtCounter != sharedCounter;
         localPage2AcqAdj09CrAmtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2AcqAdj09CrAmt
	 *	@return page2AcqAdj09CrAmt
	 */
	public char[]  getPage2AcqAdj09CrAmtString() {
	     return getCharArray(beginPage2AcqAdj09CrAmt,PAGE_2_ACQ_ADJ_09_CR_AMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2AcqAdj09CrAmtIsNumeric() {
	    return isNumeric(beginPage2AcqAdj09CrAmt
	                    ,beginPage2AcqAdj09CrAmt + PAGE_2_ACQ_ADJ_09_CR_AMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ACQ_ADJ_09_CR_AMT_LEN = 18;
  	/**
	 * serializePage2AcqAdj09CrAmt
	 */
	protected void serializePage2AcqAdj09CrAmt(long page2AcqAdj09CrAmt) {
		 putNumber(beginPage2AcqAdj09CrAmt,page2AcqAdj09CrAmt,PAGE_2_ACQ_ADJ_09_CR_AMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2AcqAdj09CrAmtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2AcqAdj09CrAmt
	 */
   	protected  long serializePage2AcqAdj09CrAmt(char[] value) {
	    long  page2AcqAdj09CrAmt;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2AcqAdj09CrAmt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginPage2AcqAdj09CrAmt
		       ,18
		      );
		 localPage2AcqAdj09CrAmtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2AcqAdj09CrAmt;
    }

   protected long checkPage2AcqAdj09CrAmtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2AcqAdj09CrAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage2AcqAdj09CrAmt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage2AcqAdj09CrAmt
			                 ,PAGE_2_ACQ_ADJ_09_CR_AMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2AcqAdj09CrAmt", beginPage2AcqAdj09CrAmt,PAGE_2_ACQ_ADJ_09_CR_AMT_LEN);
    }
   	}
     int localPage2AcqA15ApdDbCntCounter = -1;
     public boolean isPage2AcqA15ApdDbCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2AcqA15ApdDbCntCounter != sharedCounter;
         localPage2AcqA15ApdDbCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2AcqA15ApdDbCnt
	 *	@return page2AcqA15ApdDbCnt
	 */
	public char[]  getPage2AcqA15ApdDbCntString() {
	     return getCharArray(beginPage2AcqA15ApdDbCnt,PAGE_2_ACQ_A_15_APD_DB_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2AcqA15ApdDbCntIsNumeric() {
	    return isNumeric(beginPage2AcqA15ApdDbCnt
	                    ,beginPage2AcqA15ApdDbCnt + PAGE_2_ACQ_A_15_APD_DB_CNT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ACQ_A_15_APD_DB_CNT_LEN = 5;
  	/**
	 * serializePage2AcqA15ApdDbCnt
	 */
	protected void serializePage2AcqA15ApdDbCnt(int page2AcqA15ApdDbCnt) {
		 putNumber(beginPage2AcqA15ApdDbCnt,page2AcqA15ApdDbCnt,PAGE_2_ACQ_A_15_APD_DB_CNT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2AcqA15ApdDbCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2AcqA15ApdDbCnt
	 */
   	protected  int serializePage2AcqA15ApdDbCnt(char[] value) {
	    int  page2AcqA15ApdDbCnt;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2AcqA15ApdDbCnt = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,true/*isSigned?*/)
		       ,beginPage2AcqA15ApdDbCnt
		       ,5
		      );
		 localPage2AcqA15ApdDbCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2AcqA15ApdDbCnt;
    }

   protected int checkPage2AcqA15ApdDbCntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100K/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2AcqA15ApdDbCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPage2AcqA15ApdDbCnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPage2AcqA15ApdDbCnt
			                 ,PAGE_2_ACQ_A_15_APD_DB_CNT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2AcqA15ApdDbCnt", beginPage2AcqA15ApdDbCnt,PAGE_2_ACQ_A_15_APD_DB_CNT_LEN);
    }
   	}
     int localPage2AcqA15ApdCrCntCounter = -1;
     public boolean isPage2AcqA15ApdCrCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2AcqA15ApdCrCntCounter != sharedCounter;
         localPage2AcqA15ApdCrCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2AcqA15ApdCrCnt
	 *	@return page2AcqA15ApdCrCnt
	 */
	public char[]  getPage2AcqA15ApdCrCntString() {
	     return getCharArray(beginPage2AcqA15ApdCrCnt,PAGE_2_ACQ_A_15_APD_CR_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2AcqA15ApdCrCntIsNumeric() {
	    return isNumeric(beginPage2AcqA15ApdCrCnt
	                    ,beginPage2AcqA15ApdCrCnt + PAGE_2_ACQ_A_15_APD_CR_CNT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ACQ_A_15_APD_CR_CNT_LEN = 5;
  	/**
	 * serializePage2AcqA15ApdCrCnt
	 */
	protected void serializePage2AcqA15ApdCrCnt(int page2AcqA15ApdCrCnt) {
		 putNumber(beginPage2AcqA15ApdCrCnt,page2AcqA15ApdCrCnt,PAGE_2_ACQ_A_15_APD_CR_CNT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2AcqA15ApdCrCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2AcqA15ApdCrCnt
	 */
   	protected  int serializePage2AcqA15ApdCrCnt(char[] value) {
	    int  page2AcqA15ApdCrCnt;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2AcqA15ApdCrCnt = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,true/*isSigned?*/)
		       ,beginPage2AcqA15ApdCrCnt
		       ,5
		      );
		 localPage2AcqA15ApdCrCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2AcqA15ApdCrCnt;
    }

   protected int checkPage2AcqA15ApdCrCntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100K/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2AcqA15ApdCrCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPage2AcqA15ApdCrCnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPage2AcqA15ApdCrCnt
			                 ,PAGE_2_ACQ_A_15_APD_CR_CNT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2AcqA15ApdCrCnt", beginPage2AcqA15ApdCrCnt,PAGE_2_ACQ_A_15_APD_CR_CNT_LEN);
    }
   	}
     int localPage2AcqFeeDbAmtCounter = -1;
     public boolean isPage2AcqFeeDbAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2AcqFeeDbAmtCounter != sharedCounter;
         localPage2AcqFeeDbAmtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2AcqFeeDbAmt
	 *	@return page2AcqFeeDbAmt
	 */
	public char[]  getPage2AcqFeeDbAmtString() {
	     return getCharArray(beginPage2AcqFeeDbAmt,PAGE_2_ACQ_FEE_DB_AMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2AcqFeeDbAmtIsNumeric() {
	    return isNumeric(beginPage2AcqFeeDbAmt
	                    ,beginPage2AcqFeeDbAmt + PAGE_2_ACQ_FEE_DB_AMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ACQ_FEE_DB_AMT_LEN = 18;
  	/**
	 * serializePage2AcqFeeDbAmt
	 */
	protected void serializePage2AcqFeeDbAmt(long page2AcqFeeDbAmt) {
		 putNumber(beginPage2AcqFeeDbAmt,page2AcqFeeDbAmt,PAGE_2_ACQ_FEE_DB_AMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2AcqFeeDbAmtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2AcqFeeDbAmt
	 */
   	protected  long serializePage2AcqFeeDbAmt(char[] value) {
	    long  page2AcqFeeDbAmt;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2AcqFeeDbAmt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginPage2AcqFeeDbAmt
		       ,18
		      );
		 localPage2AcqFeeDbAmtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2AcqFeeDbAmt;
    }

   protected long checkPage2AcqFeeDbAmtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2AcqFeeDbAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage2AcqFeeDbAmt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage2AcqFeeDbAmt
			                 ,PAGE_2_ACQ_FEE_DB_AMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2AcqFeeDbAmt", beginPage2AcqFeeDbAmt,PAGE_2_ACQ_FEE_DB_AMT_LEN);
    }
   	}
     int localPage2AcqNsdFeeDbAmtCounter = -1;
     public boolean isPage2AcqNsdFeeDbAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2AcqNsdFeeDbAmtCounter != sharedCounter;
         localPage2AcqNsdFeeDbAmtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2AcqNsdFeeDbAmt
	 *	@return page2AcqNsdFeeDbAmt
	 */
	public char[]  getPage2AcqNsdFeeDbAmtString() {
	     return getCharArray(beginPage2AcqNsdFeeDbAmt,PAGE_2_ACQ_NSD_FEE_DB_AMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2AcqNsdFeeDbAmtIsNumeric() {
	    return isNumeric(beginPage2AcqNsdFeeDbAmt
	                    ,beginPage2AcqNsdFeeDbAmt + PAGE_2_ACQ_NSD_FEE_DB_AMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ACQ_NSD_FEE_DB_AMT_LEN = 15;
  	/**
	 * serializePage2AcqNsdFeeDbAmt
	 */
	protected void serializePage2AcqNsdFeeDbAmt(long page2AcqNsdFeeDbAmt) {
		 putNumber(beginPage2AcqNsdFeeDbAmt,page2AcqNsdFeeDbAmt,PAGE_2_ACQ_NSD_FEE_DB_AMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2AcqNsdFeeDbAmtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2AcqNsdFeeDbAmt
	 */
   	protected  long serializePage2AcqNsdFeeDbAmt(char[] value) {
	    long  page2AcqNsdFeeDbAmt;
	    if(value.length >0 && value.length!= 15)
            value = new String(value).trim().toCharArray();
	    if (value.length < 15) value = pad(15, value, ' ', LEFT_PAD);
	    else if (value.length > 15) value = substring(value,0,15);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2AcqNsdFeeDbAmt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(15,value,true/*isSigned?*/)
		       ,beginPage2AcqNsdFeeDbAmt
		       ,15
		      );
		 localPage2AcqNsdFeeDbAmtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2AcqNsdFeeDbAmt;
    }

   protected long checkPage2AcqNsdFeeDbAmtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1P/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2AcqNsdFeeDbAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage2AcqNsdFeeDbAmt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage2AcqNsdFeeDbAmt
			                 ,PAGE_2_ACQ_NSD_FEE_DB_AMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2AcqNsdFeeDbAmt", beginPage2AcqNsdFeeDbAmt,PAGE_2_ACQ_NSD_FEE_DB_AMT_LEN);
    }
   	}
     int localPage2AcqSdFeeDbAmtCounter = -1;
     public boolean isPage2AcqSdFeeDbAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2AcqSdFeeDbAmtCounter != sharedCounter;
         localPage2AcqSdFeeDbAmtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2AcqSdFeeDbAmt
	 *	@return page2AcqSdFeeDbAmt
	 */
	public char[]  getPage2AcqSdFeeDbAmtString() {
	     return getCharArray(beginPage2AcqSdFeeDbAmt,PAGE_2_ACQ_SD_FEE_DB_AMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2AcqSdFeeDbAmtIsNumeric() {
	    return isNumeric(beginPage2AcqSdFeeDbAmt
	                    ,beginPage2AcqSdFeeDbAmt + PAGE_2_ACQ_SD_FEE_DB_AMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ACQ_SD_FEE_DB_AMT_LEN = 15;
  	/**
	 * serializePage2AcqSdFeeDbAmt
	 */
	protected void serializePage2AcqSdFeeDbAmt(long page2AcqSdFeeDbAmt) {
		 putNumber(beginPage2AcqSdFeeDbAmt,page2AcqSdFeeDbAmt,PAGE_2_ACQ_SD_FEE_DB_AMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2AcqSdFeeDbAmtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2AcqSdFeeDbAmt
	 */
   	protected  long serializePage2AcqSdFeeDbAmt(char[] value) {
	    long  page2AcqSdFeeDbAmt;
	    if(value.length >0 && value.length!= 15)
            value = new String(value).trim().toCharArray();
	    if (value.length < 15) value = pad(15, value, ' ', LEFT_PAD);
	    else if (value.length > 15) value = substring(value,0,15);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2AcqSdFeeDbAmt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(15,value,true/*isSigned?*/)
		       ,beginPage2AcqSdFeeDbAmt
		       ,15
		      );
		 localPage2AcqSdFeeDbAmtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2AcqSdFeeDbAmt;
    }

   protected long checkPage2AcqSdFeeDbAmtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1P/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2AcqSdFeeDbAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage2AcqSdFeeDbAmt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage2AcqSdFeeDbAmt
			                 ,PAGE_2_ACQ_SD_FEE_DB_AMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2AcqSdFeeDbAmt", beginPage2AcqSdFeeDbAmt,PAGE_2_ACQ_SD_FEE_DB_AMT_LEN);
    }
   	}
     int localPage2AcqFeeCrAmtCounter = -1;
     public boolean isPage2AcqFeeCrAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2AcqFeeCrAmtCounter != sharedCounter;
         localPage2AcqFeeCrAmtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2AcqFeeCrAmt
	 *	@return page2AcqFeeCrAmt
	 */
	public char[]  getPage2AcqFeeCrAmtString() {
	     return getCharArray(beginPage2AcqFeeCrAmt,PAGE_2_ACQ_FEE_CR_AMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2AcqFeeCrAmtIsNumeric() {
	    return isNumeric(beginPage2AcqFeeCrAmt
	                    ,beginPage2AcqFeeCrAmt + PAGE_2_ACQ_FEE_CR_AMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ACQ_FEE_CR_AMT_LEN = 18;
  	/**
	 * serializePage2AcqFeeCrAmt
	 */
	protected void serializePage2AcqFeeCrAmt(long page2AcqFeeCrAmt) {
		 putNumber(beginPage2AcqFeeCrAmt,page2AcqFeeCrAmt,PAGE_2_ACQ_FEE_CR_AMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2AcqFeeCrAmtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2AcqFeeCrAmt
	 */
   	protected  long serializePage2AcqFeeCrAmt(char[] value) {
	    long  page2AcqFeeCrAmt;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2AcqFeeCrAmt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginPage2AcqFeeCrAmt
		       ,18
		      );
		 localPage2AcqFeeCrAmtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2AcqFeeCrAmt;
    }

   protected long checkPage2AcqFeeCrAmtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2AcqFeeCrAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage2AcqFeeCrAmt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage2AcqFeeCrAmt
			                 ,PAGE_2_ACQ_FEE_CR_AMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2AcqFeeCrAmt", beginPage2AcqFeeCrAmt,PAGE_2_ACQ_FEE_CR_AMT_LEN);
    }
   	}
     int localPage2AcqNsdFeeCrAmtCounter = -1;
     public boolean isPage2AcqNsdFeeCrAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2AcqNsdFeeCrAmtCounter != sharedCounter;
         localPage2AcqNsdFeeCrAmtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2AcqNsdFeeCrAmt
	 *	@return page2AcqNsdFeeCrAmt
	 */
	public char[]  getPage2AcqNsdFeeCrAmtString() {
	     return getCharArray(beginPage2AcqNsdFeeCrAmt,PAGE_2_ACQ_NSD_FEE_CR_AMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2AcqNsdFeeCrAmtIsNumeric() {
	    return isNumeric(beginPage2AcqNsdFeeCrAmt
	                    ,beginPage2AcqNsdFeeCrAmt + PAGE_2_ACQ_NSD_FEE_CR_AMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ACQ_NSD_FEE_CR_AMT_LEN = 15;
  	/**
	 * serializePage2AcqNsdFeeCrAmt
	 */
	protected void serializePage2AcqNsdFeeCrAmt(long page2AcqNsdFeeCrAmt) {
		 putNumber(beginPage2AcqNsdFeeCrAmt,page2AcqNsdFeeCrAmt,PAGE_2_ACQ_NSD_FEE_CR_AMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2AcqNsdFeeCrAmtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2AcqNsdFeeCrAmt
	 */
   	protected  long serializePage2AcqNsdFeeCrAmt(char[] value) {
	    long  page2AcqNsdFeeCrAmt;
	    if(value.length >0 && value.length!= 15)
            value = new String(value).trim().toCharArray();
	    if (value.length < 15) value = pad(15, value, ' ', LEFT_PAD);
	    else if (value.length > 15) value = substring(value,0,15);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2AcqNsdFeeCrAmt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(15,value,true/*isSigned?*/)
		       ,beginPage2AcqNsdFeeCrAmt
		       ,15
		      );
		 localPage2AcqNsdFeeCrAmtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2AcqNsdFeeCrAmt;
    }

   protected long checkPage2AcqNsdFeeCrAmtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1P/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2AcqNsdFeeCrAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage2AcqNsdFeeCrAmt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage2AcqNsdFeeCrAmt
			                 ,PAGE_2_ACQ_NSD_FEE_CR_AMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2AcqNsdFeeCrAmt", beginPage2AcqNsdFeeCrAmt,PAGE_2_ACQ_NSD_FEE_CR_AMT_LEN);
    }
   	}
     int localPage2AcqSdFeeCrAmtCounter = -1;
     public boolean isPage2AcqSdFeeCrAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2AcqSdFeeCrAmtCounter != sharedCounter;
         localPage2AcqSdFeeCrAmtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2AcqSdFeeCrAmt
	 *	@return page2AcqSdFeeCrAmt
	 */
	public char[]  getPage2AcqSdFeeCrAmtString() {
	     return getCharArray(beginPage2AcqSdFeeCrAmt,PAGE_2_ACQ_SD_FEE_CR_AMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2AcqSdFeeCrAmtIsNumeric() {
	    return isNumeric(beginPage2AcqSdFeeCrAmt
	                    ,beginPage2AcqSdFeeCrAmt + PAGE_2_ACQ_SD_FEE_CR_AMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ACQ_SD_FEE_CR_AMT_LEN = 15;
  	/**
	 * serializePage2AcqSdFeeCrAmt
	 */
	protected void serializePage2AcqSdFeeCrAmt(long page2AcqSdFeeCrAmt) {
		 putNumber(beginPage2AcqSdFeeCrAmt,page2AcqSdFeeCrAmt,PAGE_2_ACQ_SD_FEE_CR_AMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2AcqSdFeeCrAmtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2AcqSdFeeCrAmt
	 */
   	protected  long serializePage2AcqSdFeeCrAmt(char[] value) {
	    long  page2AcqSdFeeCrAmt;
	    if(value.length >0 && value.length!= 15)
            value = new String(value).trim().toCharArray();
	    if (value.length < 15) value = pad(15, value, ' ', LEFT_PAD);
	    else if (value.length > 15) value = substring(value,0,15);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2AcqSdFeeCrAmt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(15,value,true/*isSigned?*/)
		       ,beginPage2AcqSdFeeCrAmt
		       ,15
		      );
		 localPage2AcqSdFeeCrAmtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2AcqSdFeeCrAmt;
    }

   protected long checkPage2AcqSdFeeCrAmtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1P/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2AcqSdFeeCrAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage2AcqSdFeeCrAmt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage2AcqSdFeeCrAmt
			                 ,PAGE_2_ACQ_SD_FEE_CR_AMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2AcqSdFeeCrAmt", beginPage2AcqSdFeeCrAmt,PAGE_2_ACQ_SD_FEE_CR_AMT_LEN);
    }
   	}
     int localPage2AcqAtmDbCntCounter = -1;
     public boolean isPage2AcqAtmDbCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2AcqAtmDbCntCounter != sharedCounter;
         localPage2AcqAtmDbCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2AcqAtmDbCnt
	 *	@return page2AcqAtmDbCnt
	 */
	public char[]  getPage2AcqAtmDbCntString() {
	     return getCharArray(beginPage2AcqAtmDbCnt,PAGE_2_ACQ_ATM_DB_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2AcqAtmDbCntIsNumeric() {
	    return isNumeric(beginPage2AcqAtmDbCnt
	                    ,beginPage2AcqAtmDbCnt + PAGE_2_ACQ_ATM_DB_CNT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ACQ_ATM_DB_CNT_LEN = 9;
  	/**
	 * serializePage2AcqAtmDbCnt
	 */
	protected void serializePage2AcqAtmDbCnt(int page2AcqAtmDbCnt) {
		 putNumber(beginPage2AcqAtmDbCnt,page2AcqAtmDbCnt,PAGE_2_ACQ_ATM_DB_CNT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2AcqAtmDbCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2AcqAtmDbCnt
	 */
   	protected  int serializePage2AcqAtmDbCnt(char[] value) {
	    int  page2AcqAtmDbCnt;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2AcqAtmDbCnt = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginPage2AcqAtmDbCnt
		       ,9
		      );
		 localPage2AcqAtmDbCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2AcqAtmDbCnt;
    }

   protected int checkPage2AcqAtmDbCntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2AcqAtmDbCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPage2AcqAtmDbCnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPage2AcqAtmDbCnt
			                 ,PAGE_2_ACQ_ATM_DB_CNT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2AcqAtmDbCnt", beginPage2AcqAtmDbCnt,PAGE_2_ACQ_ATM_DB_CNT_LEN);
    }
   	}
     int localPage2AcqAtmDbAmtCounter = -1;
     public boolean isPage2AcqAtmDbAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2AcqAtmDbAmtCounter != sharedCounter;
         localPage2AcqAtmDbAmtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2AcqAtmDbAmt
	 *	@return page2AcqAtmDbAmt
	 */
	public char[]  getPage2AcqAtmDbAmtString() {
	     return getCharArray(beginPage2AcqAtmDbAmt,PAGE_2_ACQ_ATM_DB_AMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2AcqAtmDbAmtIsNumeric() {
	    return isNumeric(beginPage2AcqAtmDbAmt
	                    ,beginPage2AcqAtmDbAmt + PAGE_2_ACQ_ATM_DB_AMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ACQ_ATM_DB_AMT_LEN = 18;
  	/**
	 * serializePage2AcqAtmDbAmt
	 */
	protected void serializePage2AcqAtmDbAmt(long page2AcqAtmDbAmt) {
		 putNumber(beginPage2AcqAtmDbAmt,page2AcqAtmDbAmt,PAGE_2_ACQ_ATM_DB_AMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2AcqAtmDbAmtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2AcqAtmDbAmt
	 */
   	protected  long serializePage2AcqAtmDbAmt(char[] value) {
	    long  page2AcqAtmDbAmt;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2AcqAtmDbAmt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginPage2AcqAtmDbAmt
		       ,18
		      );
		 localPage2AcqAtmDbAmtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2AcqAtmDbAmt;
    }

   protected long checkPage2AcqAtmDbAmtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2AcqAtmDbAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage2AcqAtmDbAmt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage2AcqAtmDbAmt
			                 ,PAGE_2_ACQ_ATM_DB_AMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2AcqAtmDbAmt", beginPage2AcqAtmDbAmt,PAGE_2_ACQ_ATM_DB_AMT_LEN);
    }
   	}
     int localPage2AcqAtmCrCntCounter = -1;
     public boolean isPage2AcqAtmCrCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2AcqAtmCrCntCounter != sharedCounter;
         localPage2AcqAtmCrCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2AcqAtmCrCnt
	 *	@return page2AcqAtmCrCnt
	 */
	public char[]  getPage2AcqAtmCrCntString() {
	     return getCharArray(beginPage2AcqAtmCrCnt,PAGE_2_ACQ_ATM_CR_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2AcqAtmCrCntIsNumeric() {
	    return isNumeric(beginPage2AcqAtmCrCnt
	                    ,beginPage2AcqAtmCrCnt + PAGE_2_ACQ_ATM_CR_CNT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ACQ_ATM_CR_CNT_LEN = 9;
  	/**
	 * serializePage2AcqAtmCrCnt
	 */
	protected void serializePage2AcqAtmCrCnt(int page2AcqAtmCrCnt) {
		 putNumber(beginPage2AcqAtmCrCnt,page2AcqAtmCrCnt,PAGE_2_ACQ_ATM_CR_CNT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2AcqAtmCrCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2AcqAtmCrCnt
	 */
   	protected  int serializePage2AcqAtmCrCnt(char[] value) {
	    int  page2AcqAtmCrCnt;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2AcqAtmCrCnt = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginPage2AcqAtmCrCnt
		       ,9
		      );
		 localPage2AcqAtmCrCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2AcqAtmCrCnt;
    }

   protected int checkPage2AcqAtmCrCntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2AcqAtmCrCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPage2AcqAtmCrCnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPage2AcqAtmCrCnt
			                 ,PAGE_2_ACQ_ATM_CR_CNT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2AcqAtmCrCnt", beginPage2AcqAtmCrCnt,PAGE_2_ACQ_ATM_CR_CNT_LEN);
    }
   	}
     int localPage2AcqAtmCrAmtCounter = -1;
     public boolean isPage2AcqAtmCrAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2AcqAtmCrAmtCounter != sharedCounter;
         localPage2AcqAtmCrAmtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2AcqAtmCrAmt
	 *	@return page2AcqAtmCrAmt
	 */
	public char[]  getPage2AcqAtmCrAmtString() {
	     return getCharArray(beginPage2AcqAtmCrAmt,PAGE_2_ACQ_ATM_CR_AMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2AcqAtmCrAmtIsNumeric() {
	    return isNumeric(beginPage2AcqAtmCrAmt
	                    ,beginPage2AcqAtmCrAmt + PAGE_2_ACQ_ATM_CR_AMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ACQ_ATM_CR_AMT_LEN = 18;
  	/**
	 * serializePage2AcqAtmCrAmt
	 */
	protected void serializePage2AcqAtmCrAmt(long page2AcqAtmCrAmt) {
		 putNumber(beginPage2AcqAtmCrAmt,page2AcqAtmCrAmt,PAGE_2_ACQ_ATM_CR_AMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2AcqAtmCrAmtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2AcqAtmCrAmt
	 */
   	protected  long serializePage2AcqAtmCrAmt(char[] value) {
	    long  page2AcqAtmCrAmt;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2AcqAtmCrAmt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginPage2AcqAtmCrAmt
		       ,18
		      );
		 localPage2AcqAtmCrAmtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2AcqAtmCrAmt;
    }

   protected long checkPage2AcqAtmCrAmtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2AcqAtmCrAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage2AcqAtmCrAmt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage2AcqAtmCrAmt
			                 ,PAGE_2_ACQ_ATM_CR_AMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2AcqAtmCrAmt", beginPage2AcqAtmCrAmt,PAGE_2_ACQ_ATM_CR_AMT_LEN);
    }
   	}
     int localPage2AcqPosDbCntCounter = -1;
     public boolean isPage2AcqPosDbCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2AcqPosDbCntCounter != sharedCounter;
         localPage2AcqPosDbCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2AcqPosDbCnt
	 *	@return page2AcqPosDbCnt
	 */
	public char[]  getPage2AcqPosDbCntString() {
	     return getCharArray(beginPage2AcqPosDbCnt,PAGE_2_ACQ_POS_DB_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2AcqPosDbCntIsNumeric() {
	    return isNumeric(beginPage2AcqPosDbCnt
	                    ,beginPage2AcqPosDbCnt + PAGE_2_ACQ_POS_DB_CNT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ACQ_POS_DB_CNT_LEN = 9;
  	/**
	 * serializePage2AcqPosDbCnt
	 */
	protected void serializePage2AcqPosDbCnt(int page2AcqPosDbCnt) {
		 putNumber(beginPage2AcqPosDbCnt,page2AcqPosDbCnt,PAGE_2_ACQ_POS_DB_CNT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2AcqPosDbCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2AcqPosDbCnt
	 */
   	protected  int serializePage2AcqPosDbCnt(char[] value) {
	    int  page2AcqPosDbCnt;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2AcqPosDbCnt = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginPage2AcqPosDbCnt
		       ,9
		      );
		 localPage2AcqPosDbCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2AcqPosDbCnt;
    }

   protected int checkPage2AcqPosDbCntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2AcqPosDbCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPage2AcqPosDbCnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPage2AcqPosDbCnt
			                 ,PAGE_2_ACQ_POS_DB_CNT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2AcqPosDbCnt", beginPage2AcqPosDbCnt,PAGE_2_ACQ_POS_DB_CNT_LEN);
    }
   	}
     int localPage2AcqPosDbAmtCounter = -1;
     public boolean isPage2AcqPosDbAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2AcqPosDbAmtCounter != sharedCounter;
         localPage2AcqPosDbAmtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2AcqPosDbAmt
	 *	@return page2AcqPosDbAmt
	 */
	public char[]  getPage2AcqPosDbAmtString() {
	     return getCharArray(beginPage2AcqPosDbAmt,PAGE_2_ACQ_POS_DB_AMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2AcqPosDbAmtIsNumeric() {
	    return isNumeric(beginPage2AcqPosDbAmt
	                    ,beginPage2AcqPosDbAmt + PAGE_2_ACQ_POS_DB_AMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ACQ_POS_DB_AMT_LEN = 18;
  	/**
	 * serializePage2AcqPosDbAmt
	 */
	protected void serializePage2AcqPosDbAmt(long page2AcqPosDbAmt) {
		 putNumber(beginPage2AcqPosDbAmt,page2AcqPosDbAmt,PAGE_2_ACQ_POS_DB_AMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2AcqPosDbAmtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2AcqPosDbAmt
	 */
   	protected  long serializePage2AcqPosDbAmt(char[] value) {
	    long  page2AcqPosDbAmt;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2AcqPosDbAmt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginPage2AcqPosDbAmt
		       ,18
		      );
		 localPage2AcqPosDbAmtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2AcqPosDbAmt;
    }

   protected long checkPage2AcqPosDbAmtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2AcqPosDbAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage2AcqPosDbAmt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage2AcqPosDbAmt
			                 ,PAGE_2_ACQ_POS_DB_AMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2AcqPosDbAmt", beginPage2AcqPosDbAmt,PAGE_2_ACQ_POS_DB_AMT_LEN);
    }
   	}
     int localPage2AcqPosCrCntCounter = -1;
     public boolean isPage2AcqPosCrCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2AcqPosCrCntCounter != sharedCounter;
         localPage2AcqPosCrCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2AcqPosCrCnt
	 *	@return page2AcqPosCrCnt
	 */
	public char[]  getPage2AcqPosCrCntString() {
	     return getCharArray(beginPage2AcqPosCrCnt,PAGE_2_ACQ_POS_CR_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2AcqPosCrCntIsNumeric() {
	    return isNumeric(beginPage2AcqPosCrCnt
	                    ,beginPage2AcqPosCrCnt + PAGE_2_ACQ_POS_CR_CNT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ACQ_POS_CR_CNT_LEN = 9;
  	/**
	 * serializePage2AcqPosCrCnt
	 */
	protected void serializePage2AcqPosCrCnt(int page2AcqPosCrCnt) {
		 putNumber(beginPage2AcqPosCrCnt,page2AcqPosCrCnt,PAGE_2_ACQ_POS_CR_CNT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2AcqPosCrCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2AcqPosCrCnt
	 */
   	protected  int serializePage2AcqPosCrCnt(char[] value) {
	    int  page2AcqPosCrCnt;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2AcqPosCrCnt = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginPage2AcqPosCrCnt
		       ,9
		      );
		 localPage2AcqPosCrCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2AcqPosCrCnt;
    }

   protected int checkPage2AcqPosCrCntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2AcqPosCrCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPage2AcqPosCrCnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPage2AcqPosCrCnt
			                 ,PAGE_2_ACQ_POS_CR_CNT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2AcqPosCrCnt", beginPage2AcqPosCrCnt,PAGE_2_ACQ_POS_CR_CNT_LEN);
    }
   	}
     int localPage2AcqPosCrAmtCounter = -1;
     public boolean isPage2AcqPosCrAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2AcqPosCrAmtCounter != sharedCounter;
         localPage2AcqPosCrAmtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2AcqPosCrAmt
	 *	@return page2AcqPosCrAmt
	 */
	public char[]  getPage2AcqPosCrAmtString() {
	     return getCharArray(beginPage2AcqPosCrAmt,PAGE_2_ACQ_POS_CR_AMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2AcqPosCrAmtIsNumeric() {
	    return isNumeric(beginPage2AcqPosCrAmt
	                    ,beginPage2AcqPosCrAmt + PAGE_2_ACQ_POS_CR_AMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ACQ_POS_CR_AMT_LEN = 18;
  	/**
	 * serializePage2AcqPosCrAmt
	 */
	protected void serializePage2AcqPosCrAmt(long page2AcqPosCrAmt) {
		 putNumber(beginPage2AcqPosCrAmt,page2AcqPosCrAmt,PAGE_2_ACQ_POS_CR_AMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2AcqPosCrAmtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2AcqPosCrAmt
	 */
   	protected  long serializePage2AcqPosCrAmt(char[] value) {
	    long  page2AcqPosCrAmt;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2AcqPosCrAmt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginPage2AcqPosCrAmt
		       ,18
		      );
		 localPage2AcqPosCrAmtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2AcqPosCrAmt;
    }

   protected long checkPage2AcqPosCrAmtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2AcqPosCrAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage2AcqPosCrAmt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage2AcqPosCrAmt
			                 ,PAGE_2_ACQ_POS_CR_AMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2AcqPosCrAmt", beginPage2AcqPosCrAmt,PAGE_2_ACQ_POS_CR_AMT_LEN);
    }
   	}
     int localPage2AcqAtmDbRevCntCounter = -1;
     public boolean isPage2AcqAtmDbRevCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2AcqAtmDbRevCntCounter != sharedCounter;
         localPage2AcqAtmDbRevCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2AcqAtmDbRevCnt
	 *	@return page2AcqAtmDbRevCnt
	 */
	public char[]  getPage2AcqAtmDbRevCntString() {
	     return getCharArray(beginPage2AcqAtmDbRevCnt,PAGE_2_ACQ_ATM_DB_REV_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2AcqAtmDbRevCntIsNumeric() {
	    return isNumeric(beginPage2AcqAtmDbRevCnt
	                    ,beginPage2AcqAtmDbRevCnt + PAGE_2_ACQ_ATM_DB_REV_CNT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ACQ_ATM_DB_REV_CNT_LEN = 9;
  	/**
	 * serializePage2AcqAtmDbRevCnt
	 */
	protected void serializePage2AcqAtmDbRevCnt(int page2AcqAtmDbRevCnt) {
		 putNumber(beginPage2AcqAtmDbRevCnt,page2AcqAtmDbRevCnt,PAGE_2_ACQ_ATM_DB_REV_CNT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2AcqAtmDbRevCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2AcqAtmDbRevCnt
	 */
   	protected  int serializePage2AcqAtmDbRevCnt(char[] value) {
	    int  page2AcqAtmDbRevCnt;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2AcqAtmDbRevCnt = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginPage2AcqAtmDbRevCnt
		       ,9
		      );
		 localPage2AcqAtmDbRevCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2AcqAtmDbRevCnt;
    }

   protected int checkPage2AcqAtmDbRevCntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2AcqAtmDbRevCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPage2AcqAtmDbRevCnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPage2AcqAtmDbRevCnt
			                 ,PAGE_2_ACQ_ATM_DB_REV_CNT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2AcqAtmDbRevCnt", beginPage2AcqAtmDbRevCnt,PAGE_2_ACQ_ATM_DB_REV_CNT_LEN);
    }
   	}
     int localPage2AcqAtmDbRevAmtCounter = -1;
     public boolean isPage2AcqAtmDbRevAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2AcqAtmDbRevAmtCounter != sharedCounter;
         localPage2AcqAtmDbRevAmtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2AcqAtmDbRevAmt
	 *	@return page2AcqAtmDbRevAmt
	 */
	public char[]  getPage2AcqAtmDbRevAmtString() {
	     return getCharArray(beginPage2AcqAtmDbRevAmt,PAGE_2_ACQ_ATM_DB_REV_AMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2AcqAtmDbRevAmtIsNumeric() {
	    return isNumeric(beginPage2AcqAtmDbRevAmt
	                    ,beginPage2AcqAtmDbRevAmt + PAGE_2_ACQ_ATM_DB_REV_AMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ACQ_ATM_DB_REV_AMT_LEN = 18;
  	/**
	 * serializePage2AcqAtmDbRevAmt
	 */
	protected void serializePage2AcqAtmDbRevAmt(long page2AcqAtmDbRevAmt) {
		 putNumber(beginPage2AcqAtmDbRevAmt,page2AcqAtmDbRevAmt,PAGE_2_ACQ_ATM_DB_REV_AMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2AcqAtmDbRevAmtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2AcqAtmDbRevAmt
	 */
   	protected  long serializePage2AcqAtmDbRevAmt(char[] value) {
	    long  page2AcqAtmDbRevAmt;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2AcqAtmDbRevAmt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginPage2AcqAtmDbRevAmt
		       ,18
		      );
		 localPage2AcqAtmDbRevAmtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2AcqAtmDbRevAmt;
    }

   protected long checkPage2AcqAtmDbRevAmtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2AcqAtmDbRevAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage2AcqAtmDbRevAmt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage2AcqAtmDbRevAmt
			                 ,PAGE_2_ACQ_ATM_DB_REV_AMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2AcqAtmDbRevAmt", beginPage2AcqAtmDbRevAmt,PAGE_2_ACQ_ATM_DB_REV_AMT_LEN);
    }
   	}
     int localPage2AcqAtmCrRevCntCounter = -1;
     public boolean isPage2AcqAtmCrRevCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2AcqAtmCrRevCntCounter != sharedCounter;
         localPage2AcqAtmCrRevCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2AcqAtmCrRevCnt
	 *	@return page2AcqAtmCrRevCnt
	 */
	public char[]  getPage2AcqAtmCrRevCntString() {
	     return getCharArray(beginPage2AcqAtmCrRevCnt,PAGE_2_ACQ_ATM_CR_REV_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2AcqAtmCrRevCntIsNumeric() {
	    return isNumeric(beginPage2AcqAtmCrRevCnt
	                    ,beginPage2AcqAtmCrRevCnt + PAGE_2_ACQ_ATM_CR_REV_CNT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ACQ_ATM_CR_REV_CNT_LEN = 9;
  	/**
	 * serializePage2AcqAtmCrRevCnt
	 */
	protected void serializePage2AcqAtmCrRevCnt(int page2AcqAtmCrRevCnt) {
		 putNumber(beginPage2AcqAtmCrRevCnt,page2AcqAtmCrRevCnt,PAGE_2_ACQ_ATM_CR_REV_CNT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2AcqAtmCrRevCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2AcqAtmCrRevCnt
	 */
   	protected  int serializePage2AcqAtmCrRevCnt(char[] value) {
	    int  page2AcqAtmCrRevCnt;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2AcqAtmCrRevCnt = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginPage2AcqAtmCrRevCnt
		       ,9
		      );
		 localPage2AcqAtmCrRevCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2AcqAtmCrRevCnt;
    }

   protected int checkPage2AcqAtmCrRevCntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2AcqAtmCrRevCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPage2AcqAtmCrRevCnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPage2AcqAtmCrRevCnt
			                 ,PAGE_2_ACQ_ATM_CR_REV_CNT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2AcqAtmCrRevCnt", beginPage2AcqAtmCrRevCnt,PAGE_2_ACQ_ATM_CR_REV_CNT_LEN);
    }
   	}
     int localPage2AcqAtmCrRevAmtCounter = -1;
     public boolean isPage2AcqAtmCrRevAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2AcqAtmCrRevAmtCounter != sharedCounter;
         localPage2AcqAtmCrRevAmtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2AcqAtmCrRevAmt
	 *	@return page2AcqAtmCrRevAmt
	 */
	public char[]  getPage2AcqAtmCrRevAmtString() {
	     return getCharArray(beginPage2AcqAtmCrRevAmt,PAGE_2_ACQ_ATM_CR_REV_AMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2AcqAtmCrRevAmtIsNumeric() {
	    return isNumeric(beginPage2AcqAtmCrRevAmt
	                    ,beginPage2AcqAtmCrRevAmt + PAGE_2_ACQ_ATM_CR_REV_AMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ACQ_ATM_CR_REV_AMT_LEN = 18;
  	/**
	 * serializePage2AcqAtmCrRevAmt
	 */
	protected void serializePage2AcqAtmCrRevAmt(long page2AcqAtmCrRevAmt) {
		 putNumber(beginPage2AcqAtmCrRevAmt,page2AcqAtmCrRevAmt,PAGE_2_ACQ_ATM_CR_REV_AMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2AcqAtmCrRevAmtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2AcqAtmCrRevAmt
	 */
   	protected  long serializePage2AcqAtmCrRevAmt(char[] value) {
	    long  page2AcqAtmCrRevAmt;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2AcqAtmCrRevAmt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginPage2AcqAtmCrRevAmt
		       ,18
		      );
		 localPage2AcqAtmCrRevAmtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2AcqAtmCrRevAmt;
    }

   protected long checkPage2AcqAtmCrRevAmtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2AcqAtmCrRevAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage2AcqAtmCrRevAmt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage2AcqAtmCrRevAmt
			                 ,PAGE_2_ACQ_ATM_CR_REV_AMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2AcqAtmCrRevAmt", beginPage2AcqAtmCrRevAmt,PAGE_2_ACQ_ATM_CR_REV_AMT_LEN);
    }
   	}
     int localPage2AcqPosDbRevCntCounter = -1;
     public boolean isPage2AcqPosDbRevCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2AcqPosDbRevCntCounter != sharedCounter;
         localPage2AcqPosDbRevCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2AcqPosDbRevCnt
	 *	@return page2AcqPosDbRevCnt
	 */
	public char[]  getPage2AcqPosDbRevCntString() {
	     return getCharArray(beginPage2AcqPosDbRevCnt,PAGE_2_ACQ_POS_DB_REV_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2AcqPosDbRevCntIsNumeric() {
	    return isNumeric(beginPage2AcqPosDbRevCnt
	                    ,beginPage2AcqPosDbRevCnt + PAGE_2_ACQ_POS_DB_REV_CNT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ACQ_POS_DB_REV_CNT_LEN = 9;
  	/**
	 * serializePage2AcqPosDbRevCnt
	 */
	protected void serializePage2AcqPosDbRevCnt(int page2AcqPosDbRevCnt) {
		 putNumber(beginPage2AcqPosDbRevCnt,page2AcqPosDbRevCnt,PAGE_2_ACQ_POS_DB_REV_CNT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2AcqPosDbRevCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2AcqPosDbRevCnt
	 */
   	protected  int serializePage2AcqPosDbRevCnt(char[] value) {
	    int  page2AcqPosDbRevCnt;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2AcqPosDbRevCnt = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginPage2AcqPosDbRevCnt
		       ,9
		      );
		 localPage2AcqPosDbRevCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2AcqPosDbRevCnt;
    }

   protected int checkPage2AcqPosDbRevCntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2AcqPosDbRevCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPage2AcqPosDbRevCnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPage2AcqPosDbRevCnt
			                 ,PAGE_2_ACQ_POS_DB_REV_CNT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2AcqPosDbRevCnt", beginPage2AcqPosDbRevCnt,PAGE_2_ACQ_POS_DB_REV_CNT_LEN);
    }
   	}
     int localPage2AcqPosDbRevAmtCounter = -1;
     public boolean isPage2AcqPosDbRevAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2AcqPosDbRevAmtCounter != sharedCounter;
         localPage2AcqPosDbRevAmtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2AcqPosDbRevAmt
	 *	@return page2AcqPosDbRevAmt
	 */
	public char[]  getPage2AcqPosDbRevAmtString() {
	     return getCharArray(beginPage2AcqPosDbRevAmt,PAGE_2_ACQ_POS_DB_REV_AMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2AcqPosDbRevAmtIsNumeric() {
	    return isNumeric(beginPage2AcqPosDbRevAmt
	                    ,beginPage2AcqPosDbRevAmt + PAGE_2_ACQ_POS_DB_REV_AMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ACQ_POS_DB_REV_AMT_LEN = 18;
  	/**
	 * serializePage2AcqPosDbRevAmt
	 */
	protected void serializePage2AcqPosDbRevAmt(long page2AcqPosDbRevAmt) {
		 putNumber(beginPage2AcqPosDbRevAmt,page2AcqPosDbRevAmt,PAGE_2_ACQ_POS_DB_REV_AMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2AcqPosDbRevAmtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2AcqPosDbRevAmt
	 */
   	protected  long serializePage2AcqPosDbRevAmt(char[] value) {
	    long  page2AcqPosDbRevAmt;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2AcqPosDbRevAmt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginPage2AcqPosDbRevAmt
		       ,18
		      );
		 localPage2AcqPosDbRevAmtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2AcqPosDbRevAmt;
    }

   protected long checkPage2AcqPosDbRevAmtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2AcqPosDbRevAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage2AcqPosDbRevAmt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage2AcqPosDbRevAmt
			                 ,PAGE_2_ACQ_POS_DB_REV_AMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2AcqPosDbRevAmt", beginPage2AcqPosDbRevAmt,PAGE_2_ACQ_POS_DB_REV_AMT_LEN);
    }
   	}
     int localPage2AcqPosCrRevCntCounter = -1;
     public boolean isPage2AcqPosCrRevCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2AcqPosCrRevCntCounter != sharedCounter;
         localPage2AcqPosCrRevCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2AcqPosCrRevCnt
	 *	@return page2AcqPosCrRevCnt
	 */
	public char[]  getPage2AcqPosCrRevCntString() {
	     return getCharArray(beginPage2AcqPosCrRevCnt,PAGE_2_ACQ_POS_CR_REV_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2AcqPosCrRevCntIsNumeric() {
	    return isNumeric(beginPage2AcqPosCrRevCnt
	                    ,beginPage2AcqPosCrRevCnt + PAGE_2_ACQ_POS_CR_REV_CNT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ACQ_POS_CR_REV_CNT_LEN = 9;
  	/**
	 * serializePage2AcqPosCrRevCnt
	 */
	protected void serializePage2AcqPosCrRevCnt(int page2AcqPosCrRevCnt) {
		 putNumber(beginPage2AcqPosCrRevCnt,page2AcqPosCrRevCnt,PAGE_2_ACQ_POS_CR_REV_CNT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2AcqPosCrRevCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2AcqPosCrRevCnt
	 */
   	protected  int serializePage2AcqPosCrRevCnt(char[] value) {
	    int  page2AcqPosCrRevCnt;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2AcqPosCrRevCnt = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginPage2AcqPosCrRevCnt
		       ,9
		      );
		 localPage2AcqPosCrRevCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2AcqPosCrRevCnt;
    }

   protected int checkPage2AcqPosCrRevCntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2AcqPosCrRevCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPage2AcqPosCrRevCnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPage2AcqPosCrRevCnt
			                 ,PAGE_2_ACQ_POS_CR_REV_CNT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2AcqPosCrRevCnt", beginPage2AcqPosCrRevCnt,PAGE_2_ACQ_POS_CR_REV_CNT_LEN);
    }
   	}
     int localPage2AcqPosCrRevAmtCounter = -1;
     public boolean isPage2AcqPosCrRevAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2AcqPosCrRevAmtCounter != sharedCounter;
         localPage2AcqPosCrRevAmtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2AcqPosCrRevAmt
	 *	@return page2AcqPosCrRevAmt
	 */
	public char[]  getPage2AcqPosCrRevAmtString() {
	     return getCharArray(beginPage2AcqPosCrRevAmt,PAGE_2_ACQ_POS_CR_REV_AMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2AcqPosCrRevAmtIsNumeric() {
	    return isNumeric(beginPage2AcqPosCrRevAmt
	                    ,beginPage2AcqPosCrRevAmt + PAGE_2_ACQ_POS_CR_REV_AMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ACQ_POS_CR_REV_AMT_LEN = 18;
  	/**
	 * serializePage2AcqPosCrRevAmt
	 */
	protected void serializePage2AcqPosCrRevAmt(long page2AcqPosCrRevAmt) {
		 putNumber(beginPage2AcqPosCrRevAmt,page2AcqPosCrRevAmt,PAGE_2_ACQ_POS_CR_REV_AMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2AcqPosCrRevAmtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2AcqPosCrRevAmt
	 */
   	protected  long serializePage2AcqPosCrRevAmt(char[] value) {
	    long  page2AcqPosCrRevAmt;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2AcqPosCrRevAmt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginPage2AcqPosCrRevAmt
		       ,18
		      );
		 localPage2AcqPosCrRevAmtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2AcqPosCrRevAmt;
    }

   protected long checkPage2AcqPosCrRevAmtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2AcqPosCrRevAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage2AcqPosCrRevAmt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage2AcqPosCrRevAmt
			                 ,PAGE_2_ACQ_POS_CR_REV_AMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2AcqPosCrRevAmt", beginPage2AcqPosCrRevAmt,PAGE_2_ACQ_POS_CR_REV_AMT_LEN);
    }
   	}
     int localPage2AcqSurchgFreeCounter = -1;
     public boolean isPage2AcqSurchgFreeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2AcqSurchgFreeCounter != sharedCounter;
         localPage2AcqSurchgFreeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2AcqSurchgFree
	 *	@return page2AcqSurchgFree
	 */
	public char[]  getPage2AcqSurchgFreeString() {
	     return getCharArray(beginPage2AcqSurchgFree,PAGE_2_ACQ_SURCHG_FREE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2AcqSurchgFreeIsNumeric() {
	    return isNumeric(beginPage2AcqSurchgFree
	                    ,beginPage2AcqSurchgFree + PAGE_2_ACQ_SURCHG_FREE_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ACQ_SURCHG_FREE_LEN = 9;
  	/**
	 * serializePage2AcqSurchgFree
	 */
	protected void serializePage2AcqSurchgFree(int page2AcqSurchgFree) {
		 putNumber(beginPage2AcqSurchgFree,page2AcqSurchgFree,PAGE_2_ACQ_SURCHG_FREE_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2AcqSurchgFreeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2AcqSurchgFree
	 */
   	protected  int serializePage2AcqSurchgFree(char[] value) {
	    int  page2AcqSurchgFree;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2AcqSurchgFree = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginPage2AcqSurchgFree
		       ,9
		      );
		 localPage2AcqSurchgFreeCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2AcqSurchgFree;
    }

   protected int checkPage2AcqSurchgFreeMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2AcqSurchgFree is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPage2AcqSurchgFree() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPage2AcqSurchgFree
			                 ,PAGE_2_ACQ_SURCHG_FREE_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2AcqSurchgFree", beginPage2AcqSurchgFree,PAGE_2_ACQ_SURCHG_FREE_LEN);
    }
   	}
     int localPage2IssFinDbCntCounter = -1;
     public boolean isPage2IssFinDbCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2IssFinDbCntCounter != sharedCounter;
         localPage2IssFinDbCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2IssFinDbCnt
	 *	@return page2IssFinDbCnt
	 */
	public char[]  getPage2IssFinDbCntString() {
	     return getCharArray(beginPage2IssFinDbCnt,PAGE_2_ISS_FIN_DB_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2IssFinDbCntIsNumeric() {
	    return isNumeric(beginPage2IssFinDbCnt
	                    ,beginPage2IssFinDbCnt + PAGE_2_ISS_FIN_DB_CNT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ISS_FIN_DB_CNT_LEN = 9;
  	/**
	 * serializePage2IssFinDbCnt
	 */
	protected void serializePage2IssFinDbCnt(int page2IssFinDbCnt) {
		 putNumber(beginPage2IssFinDbCnt,page2IssFinDbCnt,PAGE_2_ISS_FIN_DB_CNT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2IssFinDbCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2IssFinDbCnt
	 */
   	protected  int serializePage2IssFinDbCnt(char[] value) {
	    int  page2IssFinDbCnt;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2IssFinDbCnt = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginPage2IssFinDbCnt
		       ,9
		      );
		 localPage2IssFinDbCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2IssFinDbCnt;
    }

   protected int checkPage2IssFinDbCntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2IssFinDbCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPage2IssFinDbCnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPage2IssFinDbCnt
			                 ,PAGE_2_ISS_FIN_DB_CNT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2IssFinDbCnt", beginPage2IssFinDbCnt,PAGE_2_ISS_FIN_DB_CNT_LEN);
    }
   	}
     int localPage2IssFinDbAmtCounter = -1;
     public boolean isPage2IssFinDbAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2IssFinDbAmtCounter != sharedCounter;
         localPage2IssFinDbAmtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2IssFinDbAmt
	 *	@return page2IssFinDbAmt
	 */
	public char[]  getPage2IssFinDbAmtString() {
	     return getCharArray(beginPage2IssFinDbAmt,PAGE_2_ISS_FIN_DB_AMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2IssFinDbAmtIsNumeric() {
	    return isNumeric(beginPage2IssFinDbAmt
	                    ,beginPage2IssFinDbAmt + PAGE_2_ISS_FIN_DB_AMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ISS_FIN_DB_AMT_LEN = 18;
  	/**
	 * serializePage2IssFinDbAmt
	 */
	protected void serializePage2IssFinDbAmt(long page2IssFinDbAmt) {
		 putNumber(beginPage2IssFinDbAmt,page2IssFinDbAmt,PAGE_2_ISS_FIN_DB_AMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2IssFinDbAmtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2IssFinDbAmt
	 */
   	protected  long serializePage2IssFinDbAmt(char[] value) {
	    long  page2IssFinDbAmt;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2IssFinDbAmt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginPage2IssFinDbAmt
		       ,18
		      );
		 localPage2IssFinDbAmtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2IssFinDbAmt;
    }

   protected long checkPage2IssFinDbAmtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2IssFinDbAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage2IssFinDbAmt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage2IssFinDbAmt
			                 ,PAGE_2_ISS_FIN_DB_AMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2IssFinDbAmt", beginPage2IssFinDbAmt,PAGE_2_ISS_FIN_DB_AMT_LEN);
    }
   	}
     int localPage2IssTmpDbCntCounter = -1;
     public boolean isPage2IssTmpDbCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2IssTmpDbCntCounter != sharedCounter;
         localPage2IssTmpDbCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2IssTmpDbCnt
	 *	@return page2IssTmpDbCnt
	 */
	public char[]  getPage2IssTmpDbCntString() {
	     return getCharArray(beginPage2IssTmpDbCnt,PAGE_2_ISS_TMP_DB_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2IssTmpDbCntIsNumeric() {
	    return isNumeric(beginPage2IssTmpDbCnt
	                    ,beginPage2IssTmpDbCnt + PAGE_2_ISS_TMP_DB_CNT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ISS_TMP_DB_CNT_LEN = 9;
  	/**
	 * serializePage2IssTmpDbCnt
	 */
	protected void serializePage2IssTmpDbCnt(int page2IssTmpDbCnt) {
		 putNumber(beginPage2IssTmpDbCnt,page2IssTmpDbCnt,PAGE_2_ISS_TMP_DB_CNT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2IssTmpDbCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2IssTmpDbCnt
	 */
   	protected  int serializePage2IssTmpDbCnt(char[] value) {
	    int  page2IssTmpDbCnt;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2IssTmpDbCnt = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginPage2IssTmpDbCnt
		       ,9
		      );
		 localPage2IssTmpDbCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2IssTmpDbCnt;
    }

   protected int checkPage2IssTmpDbCntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2IssTmpDbCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPage2IssTmpDbCnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPage2IssTmpDbCnt
			                 ,PAGE_2_ISS_TMP_DB_CNT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2IssTmpDbCnt", beginPage2IssTmpDbCnt,PAGE_2_ISS_TMP_DB_CNT_LEN);
    }
   	}
     int localPage2IssTmpCrCntCounter = -1;
     public boolean isPage2IssTmpCrCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2IssTmpCrCntCounter != sharedCounter;
         localPage2IssTmpCrCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2IssTmpCrCnt
	 *	@return page2IssTmpCrCnt
	 */
	public char[]  getPage2IssTmpCrCntString() {
	     return getCharArray(beginPage2IssTmpCrCnt,PAGE_2_ISS_TMP_CR_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2IssTmpCrCntIsNumeric() {
	    return isNumeric(beginPage2IssTmpCrCnt
	                    ,beginPage2IssTmpCrCnt + PAGE_2_ISS_TMP_CR_CNT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ISS_TMP_CR_CNT_LEN = 9;
  	/**
	 * serializePage2IssTmpCrCnt
	 */
	protected void serializePage2IssTmpCrCnt(int page2IssTmpCrCnt) {
		 putNumber(beginPage2IssTmpCrCnt,page2IssTmpCrCnt,PAGE_2_ISS_TMP_CR_CNT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2IssTmpCrCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2IssTmpCrCnt
	 */
   	protected  int serializePage2IssTmpCrCnt(char[] value) {
	    int  page2IssTmpCrCnt;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2IssTmpCrCnt = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginPage2IssTmpCrCnt
		       ,9
		      );
		 localPage2IssTmpCrCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2IssTmpCrCnt;
    }

   protected int checkPage2IssTmpCrCntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2IssTmpCrCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPage2IssTmpCrCnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPage2IssTmpCrCnt
			                 ,PAGE_2_ISS_TMP_CR_CNT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2IssTmpCrCnt", beginPage2IssTmpCrCnt,PAGE_2_ISS_TMP_CR_CNT_LEN);
    }
   	}
     int localPage2IssFinCrCntCounter = -1;
     public boolean isPage2IssFinCrCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2IssFinCrCntCounter != sharedCounter;
         localPage2IssFinCrCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2IssFinCrCnt
	 *	@return page2IssFinCrCnt
	 */
	public char[]  getPage2IssFinCrCntString() {
	     return getCharArray(beginPage2IssFinCrCnt,PAGE_2_ISS_FIN_CR_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2IssFinCrCntIsNumeric() {
	    return isNumeric(beginPage2IssFinCrCnt
	                    ,beginPage2IssFinCrCnt + PAGE_2_ISS_FIN_CR_CNT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ISS_FIN_CR_CNT_LEN = 9;
  	/**
	 * serializePage2IssFinCrCnt
	 */
	protected void serializePage2IssFinCrCnt(int page2IssFinCrCnt) {
		 putNumber(beginPage2IssFinCrCnt,page2IssFinCrCnt,PAGE_2_ISS_FIN_CR_CNT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2IssFinCrCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2IssFinCrCnt
	 */
   	protected  int serializePage2IssFinCrCnt(char[] value) {
	    int  page2IssFinCrCnt;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2IssFinCrCnt = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginPage2IssFinCrCnt
		       ,9
		      );
		 localPage2IssFinCrCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2IssFinCrCnt;
    }

   protected int checkPage2IssFinCrCntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2IssFinCrCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPage2IssFinCrCnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPage2IssFinCrCnt
			                 ,PAGE_2_ISS_FIN_CR_CNT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2IssFinCrCnt", beginPage2IssFinCrCnt,PAGE_2_ISS_FIN_CR_CNT_LEN);
    }
   	}
     int localPage2IssFinCrAmtCounter = -1;
     public boolean isPage2IssFinCrAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2IssFinCrAmtCounter != sharedCounter;
         localPage2IssFinCrAmtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2IssFinCrAmt
	 *	@return page2IssFinCrAmt
	 */
	public char[]  getPage2IssFinCrAmtString() {
	     return getCharArray(beginPage2IssFinCrAmt,PAGE_2_ISS_FIN_CR_AMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2IssFinCrAmtIsNumeric() {
	    return isNumeric(beginPage2IssFinCrAmt
	                    ,beginPage2IssFinCrAmt + PAGE_2_ISS_FIN_CR_AMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ISS_FIN_CR_AMT_LEN = 18;
  	/**
	 * serializePage2IssFinCrAmt
	 */
	protected void serializePage2IssFinCrAmt(long page2IssFinCrAmt) {
		 putNumber(beginPage2IssFinCrAmt,page2IssFinCrAmt,PAGE_2_ISS_FIN_CR_AMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2IssFinCrAmtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2IssFinCrAmt
	 */
   	protected  long serializePage2IssFinCrAmt(char[] value) {
	    long  page2IssFinCrAmt;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2IssFinCrAmt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginPage2IssFinCrAmt
		       ,18
		      );
		 localPage2IssFinCrAmtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2IssFinCrAmt;
    }

   protected long checkPage2IssFinCrAmtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2IssFinCrAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage2IssFinCrAmt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage2IssFinCrAmt
			                 ,PAGE_2_ISS_FIN_CR_AMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2IssFinCrAmt", beginPage2IssFinCrAmt,PAGE_2_ISS_FIN_CR_AMT_LEN);
    }
   	}
     int localPage2IssAdjDbCntCounter = -1;
     public boolean isPage2IssAdjDbCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2IssAdjDbCntCounter != sharedCounter;
         localPage2IssAdjDbCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2IssAdjDbCnt
	 *	@return page2IssAdjDbCnt
	 */
	public char[]  getPage2IssAdjDbCntString() {
	     return getCharArray(beginPage2IssAdjDbCnt,PAGE_2_ISS_ADJ_DB_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2IssAdjDbCntIsNumeric() {
	    return isNumeric(beginPage2IssAdjDbCnt
	                    ,beginPage2IssAdjDbCnt + PAGE_2_ISS_ADJ_DB_CNT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ISS_ADJ_DB_CNT_LEN = 9;
  	/**
	 * serializePage2IssAdjDbCnt
	 */
	protected void serializePage2IssAdjDbCnt(int page2IssAdjDbCnt) {
		 putNumber(beginPage2IssAdjDbCnt,page2IssAdjDbCnt,PAGE_2_ISS_ADJ_DB_CNT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2IssAdjDbCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2IssAdjDbCnt
	 */
   	protected  int serializePage2IssAdjDbCnt(char[] value) {
	    int  page2IssAdjDbCnt;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2IssAdjDbCnt = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginPage2IssAdjDbCnt
		       ,9
		      );
		 localPage2IssAdjDbCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2IssAdjDbCnt;
    }

   protected int checkPage2IssAdjDbCntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2IssAdjDbCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPage2IssAdjDbCnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPage2IssAdjDbCnt
			                 ,PAGE_2_ISS_ADJ_DB_CNT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2IssAdjDbCnt", beginPage2IssAdjDbCnt,PAGE_2_ISS_ADJ_DB_CNT_LEN);
    }
   	}
     int localPage2IssAdjDbAmtCounter = -1;
     public boolean isPage2IssAdjDbAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2IssAdjDbAmtCounter != sharedCounter;
         localPage2IssAdjDbAmtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2IssAdjDbAmt
	 *	@return page2IssAdjDbAmt
	 */
	public char[]  getPage2IssAdjDbAmtString() {
	     return getCharArray(beginPage2IssAdjDbAmt,PAGE_2_ISS_ADJ_DB_AMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2IssAdjDbAmtIsNumeric() {
	    return isNumeric(beginPage2IssAdjDbAmt
	                    ,beginPage2IssAdjDbAmt + PAGE_2_ISS_ADJ_DB_AMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ISS_ADJ_DB_AMT_LEN = 18;
  	/**
	 * serializePage2IssAdjDbAmt
	 */
	protected void serializePage2IssAdjDbAmt(long page2IssAdjDbAmt) {
		 putNumber(beginPage2IssAdjDbAmt,page2IssAdjDbAmt,PAGE_2_ISS_ADJ_DB_AMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2IssAdjDbAmtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2IssAdjDbAmt
	 */
   	protected  long serializePage2IssAdjDbAmt(char[] value) {
	    long  page2IssAdjDbAmt;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2IssAdjDbAmt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginPage2IssAdjDbAmt
		       ,18
		      );
		 localPage2IssAdjDbAmtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2IssAdjDbAmt;
    }

   protected long checkPage2IssAdjDbAmtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2IssAdjDbAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage2IssAdjDbAmt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage2IssAdjDbAmt
			                 ,PAGE_2_ISS_ADJ_DB_AMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2IssAdjDbAmt", beginPage2IssAdjDbAmt,PAGE_2_ISS_ADJ_DB_AMT_LEN);
    }
   	}
     int localPage2IssAdjCrCntCounter = -1;
     public boolean isPage2IssAdjCrCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2IssAdjCrCntCounter != sharedCounter;
         localPage2IssAdjCrCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2IssAdjCrCnt
	 *	@return page2IssAdjCrCnt
	 */
	public char[]  getPage2IssAdjCrCntString() {
	     return getCharArray(beginPage2IssAdjCrCnt,PAGE_2_ISS_ADJ_CR_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2IssAdjCrCntIsNumeric() {
	    return isNumeric(beginPage2IssAdjCrCnt
	                    ,beginPage2IssAdjCrCnt + PAGE_2_ISS_ADJ_CR_CNT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ISS_ADJ_CR_CNT_LEN = 9;
  	/**
	 * serializePage2IssAdjCrCnt
	 */
	protected void serializePage2IssAdjCrCnt(int page2IssAdjCrCnt) {
		 putNumber(beginPage2IssAdjCrCnt,page2IssAdjCrCnt,PAGE_2_ISS_ADJ_CR_CNT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2IssAdjCrCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2IssAdjCrCnt
	 */
   	protected  int serializePage2IssAdjCrCnt(char[] value) {
	    int  page2IssAdjCrCnt;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2IssAdjCrCnt = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginPage2IssAdjCrCnt
		       ,9
		      );
		 localPage2IssAdjCrCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2IssAdjCrCnt;
    }

   protected int checkPage2IssAdjCrCntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2IssAdjCrCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPage2IssAdjCrCnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPage2IssAdjCrCnt
			                 ,PAGE_2_ISS_ADJ_CR_CNT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2IssAdjCrCnt", beginPage2IssAdjCrCnt,PAGE_2_ISS_ADJ_CR_CNT_LEN);
    }
   	}
     int localPage2IssAdjCrAmtCounter = -1;
     public boolean isPage2IssAdjCrAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2IssAdjCrAmtCounter != sharedCounter;
         localPage2IssAdjCrAmtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2IssAdjCrAmt
	 *	@return page2IssAdjCrAmt
	 */
	public char[]  getPage2IssAdjCrAmtString() {
	     return getCharArray(beginPage2IssAdjCrAmt,PAGE_2_ISS_ADJ_CR_AMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2IssAdjCrAmtIsNumeric() {
	    return isNumeric(beginPage2IssAdjCrAmt
	                    ,beginPage2IssAdjCrAmt + PAGE_2_ISS_ADJ_CR_AMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ISS_ADJ_CR_AMT_LEN = 18;
  	/**
	 * serializePage2IssAdjCrAmt
	 */
	protected void serializePage2IssAdjCrAmt(long page2IssAdjCrAmt) {
		 putNumber(beginPage2IssAdjCrAmt,page2IssAdjCrAmt,PAGE_2_ISS_ADJ_CR_AMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2IssAdjCrAmtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2IssAdjCrAmt
	 */
   	protected  long serializePage2IssAdjCrAmt(char[] value) {
	    long  page2IssAdjCrAmt;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2IssAdjCrAmt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginPage2IssAdjCrAmt
		       ,18
		      );
		 localPage2IssAdjCrAmtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2IssAdjCrAmt;
    }

   protected long checkPage2IssAdjCrAmtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2IssAdjCrAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage2IssAdjCrAmt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage2IssAdjCrAmt
			                 ,PAGE_2_ISS_ADJ_CR_AMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2IssAdjCrAmt", beginPage2IssAdjCrAmt,PAGE_2_ISS_ADJ_CR_AMT_LEN);
    }
   	}
     int localPage2IssA15ApdDbCntCounter = -1;
     public boolean isPage2IssA15ApdDbCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2IssA15ApdDbCntCounter != sharedCounter;
         localPage2IssA15ApdDbCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2IssA15ApdDbCnt
	 *	@return page2IssA15ApdDbCnt
	 */
	public char[]  getPage2IssA15ApdDbCntString() {
	     return getCharArray(beginPage2IssA15ApdDbCnt,PAGE_2_ISS_A_15_APD_DB_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2IssA15ApdDbCntIsNumeric() {
	    return isNumeric(beginPage2IssA15ApdDbCnt
	                    ,beginPage2IssA15ApdDbCnt + PAGE_2_ISS_A_15_APD_DB_CNT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ISS_A_15_APD_DB_CNT_LEN = 5;
  	/**
	 * serializePage2IssA15ApdDbCnt
	 */
	protected void serializePage2IssA15ApdDbCnt(int page2IssA15ApdDbCnt) {
		 putNumber(beginPage2IssA15ApdDbCnt,page2IssA15ApdDbCnt,PAGE_2_ISS_A_15_APD_DB_CNT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2IssA15ApdDbCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2IssA15ApdDbCnt
	 */
   	protected  int serializePage2IssA15ApdDbCnt(char[] value) {
	    int  page2IssA15ApdDbCnt;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2IssA15ApdDbCnt = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,true/*isSigned?*/)
		       ,beginPage2IssA15ApdDbCnt
		       ,5
		      );
		 localPage2IssA15ApdDbCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2IssA15ApdDbCnt;
    }

   protected int checkPage2IssA15ApdDbCntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100K/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2IssA15ApdDbCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPage2IssA15ApdDbCnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPage2IssA15ApdDbCnt
			                 ,PAGE_2_ISS_A_15_APD_DB_CNT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2IssA15ApdDbCnt", beginPage2IssA15ApdDbCnt,PAGE_2_ISS_A_15_APD_DB_CNT_LEN);
    }
   	}
     int localPage2IssA15ApdCrCntCounter = -1;
     public boolean isPage2IssA15ApdCrCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2IssA15ApdCrCntCounter != sharedCounter;
         localPage2IssA15ApdCrCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2IssA15ApdCrCnt
	 *	@return page2IssA15ApdCrCnt
	 */
	public char[]  getPage2IssA15ApdCrCntString() {
	     return getCharArray(beginPage2IssA15ApdCrCnt,PAGE_2_ISS_A_15_APD_CR_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2IssA15ApdCrCntIsNumeric() {
	    return isNumeric(beginPage2IssA15ApdCrCnt
	                    ,beginPage2IssA15ApdCrCnt + PAGE_2_ISS_A_15_APD_CR_CNT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ISS_A_15_APD_CR_CNT_LEN = 5;
  	/**
	 * serializePage2IssA15ApdCrCnt
	 */
	protected void serializePage2IssA15ApdCrCnt(int page2IssA15ApdCrCnt) {
		 putNumber(beginPage2IssA15ApdCrCnt,page2IssA15ApdCrCnt,PAGE_2_ISS_A_15_APD_CR_CNT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2IssA15ApdCrCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2IssA15ApdCrCnt
	 */
   	protected  int serializePage2IssA15ApdCrCnt(char[] value) {
	    int  page2IssA15ApdCrCnt;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2IssA15ApdCrCnt = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,true/*isSigned?*/)
		       ,beginPage2IssA15ApdCrCnt
		       ,5
		      );
		 localPage2IssA15ApdCrCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2IssA15ApdCrCnt;
    }

   protected int checkPage2IssA15ApdCrCntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100K/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2IssA15ApdCrCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPage2IssA15ApdCrCnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPage2IssA15ApdCrCnt
			                 ,PAGE_2_ISS_A_15_APD_CR_CNT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2IssA15ApdCrCnt", beginPage2IssA15ApdCrCnt,PAGE_2_ISS_A_15_APD_CR_CNT_LEN);
    }
   	}
     int localPage2IssAdj09DbCntCounter = -1;
     public boolean isPage2IssAdj09DbCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2IssAdj09DbCntCounter != sharedCounter;
         localPage2IssAdj09DbCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2IssAdj09DbCnt
	 *	@return page2IssAdj09DbCnt
	 */
	public char[]  getPage2IssAdj09DbCntString() {
	     return getCharArray(beginPage2IssAdj09DbCnt,PAGE_2_ISS_ADJ_09_DB_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2IssAdj09DbCntIsNumeric() {
	    return isNumeric(beginPage2IssAdj09DbCnt
	                    ,beginPage2IssAdj09DbCnt + PAGE_2_ISS_ADJ_09_DB_CNT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ISS_ADJ_09_DB_CNT_LEN = 9;
  	/**
	 * serializePage2IssAdj09DbCnt
	 */
	protected void serializePage2IssAdj09DbCnt(int page2IssAdj09DbCnt) {
		 putNumber(beginPage2IssAdj09DbCnt,page2IssAdj09DbCnt,PAGE_2_ISS_ADJ_09_DB_CNT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2IssAdj09DbCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2IssAdj09DbCnt
	 */
   	protected  int serializePage2IssAdj09DbCnt(char[] value) {
	    int  page2IssAdj09DbCnt;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2IssAdj09DbCnt = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginPage2IssAdj09DbCnt
		       ,9
		      );
		 localPage2IssAdj09DbCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2IssAdj09DbCnt;
    }

   protected int checkPage2IssAdj09DbCntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2IssAdj09DbCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPage2IssAdj09DbCnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPage2IssAdj09DbCnt
			                 ,PAGE_2_ISS_ADJ_09_DB_CNT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2IssAdj09DbCnt", beginPage2IssAdj09DbCnt,PAGE_2_ISS_ADJ_09_DB_CNT_LEN);
    }
   	}
     int localPage2IssAdj09DbAmtCounter = -1;
     public boolean isPage2IssAdj09DbAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2IssAdj09DbAmtCounter != sharedCounter;
         localPage2IssAdj09DbAmtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2IssAdj09DbAmt
	 *	@return page2IssAdj09DbAmt
	 */
	public char[]  getPage2IssAdj09DbAmtString() {
	     return getCharArray(beginPage2IssAdj09DbAmt,PAGE_2_ISS_ADJ_09_DB_AMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2IssAdj09DbAmtIsNumeric() {
	    return isNumeric(beginPage2IssAdj09DbAmt
	                    ,beginPage2IssAdj09DbAmt + PAGE_2_ISS_ADJ_09_DB_AMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ISS_ADJ_09_DB_AMT_LEN = 18;
  	/**
	 * serializePage2IssAdj09DbAmt
	 */
	protected void serializePage2IssAdj09DbAmt(long page2IssAdj09DbAmt) {
		 putNumber(beginPage2IssAdj09DbAmt,page2IssAdj09DbAmt,PAGE_2_ISS_ADJ_09_DB_AMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2IssAdj09DbAmtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2IssAdj09DbAmt
	 */
   	protected  long serializePage2IssAdj09DbAmt(char[] value) {
	    long  page2IssAdj09DbAmt;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2IssAdj09DbAmt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginPage2IssAdj09DbAmt
		       ,18
		      );
		 localPage2IssAdj09DbAmtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2IssAdj09DbAmt;
    }

   protected long checkPage2IssAdj09DbAmtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2IssAdj09DbAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage2IssAdj09DbAmt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage2IssAdj09DbAmt
			                 ,PAGE_2_ISS_ADJ_09_DB_AMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2IssAdj09DbAmt", beginPage2IssAdj09DbAmt,PAGE_2_ISS_ADJ_09_DB_AMT_LEN);
    }
   	}
     int localPage2IssAdj09CrCntCounter = -1;
     public boolean isPage2IssAdj09CrCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2IssAdj09CrCntCounter != sharedCounter;
         localPage2IssAdj09CrCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2IssAdj09CrCnt
	 *	@return page2IssAdj09CrCnt
	 */
	public char[]  getPage2IssAdj09CrCntString() {
	     return getCharArray(beginPage2IssAdj09CrCnt,PAGE_2_ISS_ADJ_09_CR_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2IssAdj09CrCntIsNumeric() {
	    return isNumeric(beginPage2IssAdj09CrCnt
	                    ,beginPage2IssAdj09CrCnt + PAGE_2_ISS_ADJ_09_CR_CNT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ISS_ADJ_09_CR_CNT_LEN = 9;
  	/**
	 * serializePage2IssAdj09CrCnt
	 */
	protected void serializePage2IssAdj09CrCnt(int page2IssAdj09CrCnt) {
		 putNumber(beginPage2IssAdj09CrCnt,page2IssAdj09CrCnt,PAGE_2_ISS_ADJ_09_CR_CNT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2IssAdj09CrCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2IssAdj09CrCnt
	 */
   	protected  int serializePage2IssAdj09CrCnt(char[] value) {
	    int  page2IssAdj09CrCnt;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2IssAdj09CrCnt = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginPage2IssAdj09CrCnt
		       ,9
		      );
		 localPage2IssAdj09CrCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2IssAdj09CrCnt;
    }

   protected int checkPage2IssAdj09CrCntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2IssAdj09CrCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPage2IssAdj09CrCnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPage2IssAdj09CrCnt
			                 ,PAGE_2_ISS_ADJ_09_CR_CNT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2IssAdj09CrCnt", beginPage2IssAdj09CrCnt,PAGE_2_ISS_ADJ_09_CR_CNT_LEN);
    }
   	}
     int localPage2IssAdj09CrAmtCounter = -1;
     public boolean isPage2IssAdj09CrAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2IssAdj09CrAmtCounter != sharedCounter;
         localPage2IssAdj09CrAmtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2IssAdj09CrAmt
	 *	@return page2IssAdj09CrAmt
	 */
	public char[]  getPage2IssAdj09CrAmtString() {
	     return getCharArray(beginPage2IssAdj09CrAmt,PAGE_2_ISS_ADJ_09_CR_AMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2IssAdj09CrAmtIsNumeric() {
	    return isNumeric(beginPage2IssAdj09CrAmt
	                    ,beginPage2IssAdj09CrAmt + PAGE_2_ISS_ADJ_09_CR_AMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ISS_ADJ_09_CR_AMT_LEN = 18;
  	/**
	 * serializePage2IssAdj09CrAmt
	 */
	protected void serializePage2IssAdj09CrAmt(long page2IssAdj09CrAmt) {
		 putNumber(beginPage2IssAdj09CrAmt,page2IssAdj09CrAmt,PAGE_2_ISS_ADJ_09_CR_AMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2IssAdj09CrAmtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2IssAdj09CrAmt
	 */
   	protected  long serializePage2IssAdj09CrAmt(char[] value) {
	    long  page2IssAdj09CrAmt;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2IssAdj09CrAmt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginPage2IssAdj09CrAmt
		       ,18
		      );
		 localPage2IssAdj09CrAmtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2IssAdj09CrAmt;
    }

   protected long checkPage2IssAdj09CrAmtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2IssAdj09CrAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage2IssAdj09CrAmt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage2IssAdj09CrAmt
			                 ,PAGE_2_ISS_ADJ_09_CR_AMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2IssAdj09CrAmt", beginPage2IssAdj09CrAmt,PAGE_2_ISS_ADJ_09_CR_AMT_LEN);
    }
   	}
     int localPage2IssFeeDbAmtCounter = -1;
     public boolean isPage2IssFeeDbAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2IssFeeDbAmtCounter != sharedCounter;
         localPage2IssFeeDbAmtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2IssFeeDbAmt
	 *	@return page2IssFeeDbAmt
	 */
	public char[]  getPage2IssFeeDbAmtString() {
	     return getCharArray(beginPage2IssFeeDbAmt,PAGE_2_ISS_FEE_DB_AMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2IssFeeDbAmtIsNumeric() {
	    return isNumeric(beginPage2IssFeeDbAmt
	                    ,beginPage2IssFeeDbAmt + PAGE_2_ISS_FEE_DB_AMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ISS_FEE_DB_AMT_LEN = 15;
  	/**
	 * serializePage2IssFeeDbAmt
	 */
	protected void serializePage2IssFeeDbAmt(long page2IssFeeDbAmt) {
		 putNumber(beginPage2IssFeeDbAmt,page2IssFeeDbAmt,PAGE_2_ISS_FEE_DB_AMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2IssFeeDbAmtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2IssFeeDbAmt
	 */
   	protected  long serializePage2IssFeeDbAmt(char[] value) {
	    long  page2IssFeeDbAmt;
	    if(value.length >0 && value.length!= 15)
            value = new String(value).trim().toCharArray();
	    if (value.length < 15) value = pad(15, value, ' ', LEFT_PAD);
	    else if (value.length > 15) value = substring(value,0,15);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2IssFeeDbAmt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(15,value,true/*isSigned?*/)
		       ,beginPage2IssFeeDbAmt
		       ,15
		      );
		 localPage2IssFeeDbAmtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2IssFeeDbAmt;
    }

   protected long checkPage2IssFeeDbAmtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1P/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2IssFeeDbAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage2IssFeeDbAmt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage2IssFeeDbAmt
			                 ,PAGE_2_ISS_FEE_DB_AMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2IssFeeDbAmt", beginPage2IssFeeDbAmt,PAGE_2_ISS_FEE_DB_AMT_LEN);
    }
   	}
     int localPage2IssFeeCrAmtCounter = -1;
     public boolean isPage2IssFeeCrAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2IssFeeCrAmtCounter != sharedCounter;
         localPage2IssFeeCrAmtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2IssFeeCrAmt
	 *	@return page2IssFeeCrAmt
	 */
	public char[]  getPage2IssFeeCrAmtString() {
	     return getCharArray(beginPage2IssFeeCrAmt,PAGE_2_ISS_FEE_CR_AMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2IssFeeCrAmtIsNumeric() {
	    return isNumeric(beginPage2IssFeeCrAmt
	                    ,beginPage2IssFeeCrAmt + PAGE_2_ISS_FEE_CR_AMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ISS_FEE_CR_AMT_LEN = 18;
  	/**
	 * serializePage2IssFeeCrAmt
	 */
	protected void serializePage2IssFeeCrAmt(long page2IssFeeCrAmt) {
		 putNumber(beginPage2IssFeeCrAmt,page2IssFeeCrAmt,PAGE_2_ISS_FEE_CR_AMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2IssFeeCrAmtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2IssFeeCrAmt
	 */
   	protected  long serializePage2IssFeeCrAmt(char[] value) {
	    long  page2IssFeeCrAmt;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2IssFeeCrAmt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginPage2IssFeeCrAmt
		       ,18
		      );
		 localPage2IssFeeCrAmtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2IssFeeCrAmt;
    }

   protected long checkPage2IssFeeCrAmtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2IssFeeCrAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage2IssFeeCrAmt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage2IssFeeCrAmt
			                 ,PAGE_2_ISS_FEE_CR_AMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2IssFeeCrAmt", beginPage2IssFeeCrAmt,PAGE_2_ISS_FEE_CR_AMT_LEN);
    }
   	}
     int localPage2IssAtmDbCntCounter = -1;
     public boolean isPage2IssAtmDbCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2IssAtmDbCntCounter != sharedCounter;
         localPage2IssAtmDbCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2IssAtmDbCnt
	 *	@return page2IssAtmDbCnt
	 */
	public char[]  getPage2IssAtmDbCntString() {
	     return getCharArray(beginPage2IssAtmDbCnt,PAGE_2_ISS_ATM_DB_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2IssAtmDbCntIsNumeric() {
	    return isNumeric(beginPage2IssAtmDbCnt
	                    ,beginPage2IssAtmDbCnt + PAGE_2_ISS_ATM_DB_CNT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ISS_ATM_DB_CNT_LEN = 9;
  	/**
	 * serializePage2IssAtmDbCnt
	 */
	protected void serializePage2IssAtmDbCnt(int page2IssAtmDbCnt) {
		 putNumber(beginPage2IssAtmDbCnt,page2IssAtmDbCnt,PAGE_2_ISS_ATM_DB_CNT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2IssAtmDbCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2IssAtmDbCnt
	 */
   	protected  int serializePage2IssAtmDbCnt(char[] value) {
	    int  page2IssAtmDbCnt;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2IssAtmDbCnt = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginPage2IssAtmDbCnt
		       ,9
		      );
		 localPage2IssAtmDbCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2IssAtmDbCnt;
    }

   protected int checkPage2IssAtmDbCntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2IssAtmDbCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPage2IssAtmDbCnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPage2IssAtmDbCnt
			                 ,PAGE_2_ISS_ATM_DB_CNT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2IssAtmDbCnt", beginPage2IssAtmDbCnt,PAGE_2_ISS_ATM_DB_CNT_LEN);
    }
   	}
     int localPage2IssAtmDbAmtCounter = -1;
     public boolean isPage2IssAtmDbAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2IssAtmDbAmtCounter != sharedCounter;
         localPage2IssAtmDbAmtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2IssAtmDbAmt
	 *	@return page2IssAtmDbAmt
	 */
	public char[]  getPage2IssAtmDbAmtString() {
	     return getCharArray(beginPage2IssAtmDbAmt,PAGE_2_ISS_ATM_DB_AMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2IssAtmDbAmtIsNumeric() {
	    return isNumeric(beginPage2IssAtmDbAmt
	                    ,beginPage2IssAtmDbAmt + PAGE_2_ISS_ATM_DB_AMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ISS_ATM_DB_AMT_LEN = 18;
  	/**
	 * serializePage2IssAtmDbAmt
	 */
	protected void serializePage2IssAtmDbAmt(long page2IssAtmDbAmt) {
		 putNumber(beginPage2IssAtmDbAmt,page2IssAtmDbAmt,PAGE_2_ISS_ATM_DB_AMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2IssAtmDbAmtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2IssAtmDbAmt
	 */
   	protected  long serializePage2IssAtmDbAmt(char[] value) {
	    long  page2IssAtmDbAmt;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2IssAtmDbAmt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginPage2IssAtmDbAmt
		       ,18
		      );
		 localPage2IssAtmDbAmtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2IssAtmDbAmt;
    }

   protected long checkPage2IssAtmDbAmtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2IssAtmDbAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage2IssAtmDbAmt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage2IssAtmDbAmt
			                 ,PAGE_2_ISS_ATM_DB_AMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2IssAtmDbAmt", beginPage2IssAtmDbAmt,PAGE_2_ISS_ATM_DB_AMT_LEN);
    }
   	}
     int localPage2IssAtmCrCntCounter = -1;
     public boolean isPage2IssAtmCrCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2IssAtmCrCntCounter != sharedCounter;
         localPage2IssAtmCrCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2IssAtmCrCnt
	 *	@return page2IssAtmCrCnt
	 */
	public char[]  getPage2IssAtmCrCntString() {
	     return getCharArray(beginPage2IssAtmCrCnt,PAGE_2_ISS_ATM_CR_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2IssAtmCrCntIsNumeric() {
	    return isNumeric(beginPage2IssAtmCrCnt
	                    ,beginPage2IssAtmCrCnt + PAGE_2_ISS_ATM_CR_CNT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ISS_ATM_CR_CNT_LEN = 9;
  	/**
	 * serializePage2IssAtmCrCnt
	 */
	protected void serializePage2IssAtmCrCnt(int page2IssAtmCrCnt) {
		 putNumber(beginPage2IssAtmCrCnt,page2IssAtmCrCnt,PAGE_2_ISS_ATM_CR_CNT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2IssAtmCrCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2IssAtmCrCnt
	 */
   	protected  int serializePage2IssAtmCrCnt(char[] value) {
	    int  page2IssAtmCrCnt;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2IssAtmCrCnt = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginPage2IssAtmCrCnt
		       ,9
		      );
		 localPage2IssAtmCrCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2IssAtmCrCnt;
    }

   protected int checkPage2IssAtmCrCntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2IssAtmCrCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPage2IssAtmCrCnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPage2IssAtmCrCnt
			                 ,PAGE_2_ISS_ATM_CR_CNT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2IssAtmCrCnt", beginPage2IssAtmCrCnt,PAGE_2_ISS_ATM_CR_CNT_LEN);
    }
   	}
     int localPage2IssAtmCrAmtCounter = -1;
     public boolean isPage2IssAtmCrAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2IssAtmCrAmtCounter != sharedCounter;
         localPage2IssAtmCrAmtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2IssAtmCrAmt
	 *	@return page2IssAtmCrAmt
	 */
	public char[]  getPage2IssAtmCrAmtString() {
	     return getCharArray(beginPage2IssAtmCrAmt,PAGE_2_ISS_ATM_CR_AMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2IssAtmCrAmtIsNumeric() {
	    return isNumeric(beginPage2IssAtmCrAmt
	                    ,beginPage2IssAtmCrAmt + PAGE_2_ISS_ATM_CR_AMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ISS_ATM_CR_AMT_LEN = 18;
  	/**
	 * serializePage2IssAtmCrAmt
	 */
	protected void serializePage2IssAtmCrAmt(long page2IssAtmCrAmt) {
		 putNumber(beginPage2IssAtmCrAmt,page2IssAtmCrAmt,PAGE_2_ISS_ATM_CR_AMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2IssAtmCrAmtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2IssAtmCrAmt
	 */
   	protected  long serializePage2IssAtmCrAmt(char[] value) {
	    long  page2IssAtmCrAmt;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2IssAtmCrAmt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginPage2IssAtmCrAmt
		       ,18
		      );
		 localPage2IssAtmCrAmtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2IssAtmCrAmt;
    }

   protected long checkPage2IssAtmCrAmtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2IssAtmCrAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage2IssAtmCrAmt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage2IssAtmCrAmt
			                 ,PAGE_2_ISS_ATM_CR_AMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2IssAtmCrAmt", beginPage2IssAtmCrAmt,PAGE_2_ISS_ATM_CR_AMT_LEN);
    }
   	}
     int localPage2IssPosDbCntCounter = -1;
     public boolean isPage2IssPosDbCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2IssPosDbCntCounter != sharedCounter;
         localPage2IssPosDbCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2IssPosDbCnt
	 *	@return page2IssPosDbCnt
	 */
	public char[]  getPage2IssPosDbCntString() {
	     return getCharArray(beginPage2IssPosDbCnt,PAGE_2_ISS_POS_DB_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2IssPosDbCntIsNumeric() {
	    return isNumeric(beginPage2IssPosDbCnt
	                    ,beginPage2IssPosDbCnt + PAGE_2_ISS_POS_DB_CNT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ISS_POS_DB_CNT_LEN = 9;
  	/**
	 * serializePage2IssPosDbCnt
	 */
	protected void serializePage2IssPosDbCnt(int page2IssPosDbCnt) {
		 putNumber(beginPage2IssPosDbCnt,page2IssPosDbCnt,PAGE_2_ISS_POS_DB_CNT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2IssPosDbCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2IssPosDbCnt
	 */
   	protected  int serializePage2IssPosDbCnt(char[] value) {
	    int  page2IssPosDbCnt;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2IssPosDbCnt = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginPage2IssPosDbCnt
		       ,9
		      );
		 localPage2IssPosDbCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2IssPosDbCnt;
    }

   protected int checkPage2IssPosDbCntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2IssPosDbCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPage2IssPosDbCnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPage2IssPosDbCnt
			                 ,PAGE_2_ISS_POS_DB_CNT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2IssPosDbCnt", beginPage2IssPosDbCnt,PAGE_2_ISS_POS_DB_CNT_LEN);
    }
   	}
     int localPage2IssPosDbAmtCounter = -1;
     public boolean isPage2IssPosDbAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2IssPosDbAmtCounter != sharedCounter;
         localPage2IssPosDbAmtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2IssPosDbAmt
	 *	@return page2IssPosDbAmt
	 */
	public char[]  getPage2IssPosDbAmtString() {
	     return getCharArray(beginPage2IssPosDbAmt,PAGE_2_ISS_POS_DB_AMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2IssPosDbAmtIsNumeric() {
	    return isNumeric(beginPage2IssPosDbAmt
	                    ,beginPage2IssPosDbAmt + PAGE_2_ISS_POS_DB_AMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ISS_POS_DB_AMT_LEN = 18;
  	/**
	 * serializePage2IssPosDbAmt
	 */
	protected void serializePage2IssPosDbAmt(long page2IssPosDbAmt) {
		 putNumber(beginPage2IssPosDbAmt,page2IssPosDbAmt,PAGE_2_ISS_POS_DB_AMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2IssPosDbAmtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2IssPosDbAmt
	 */
   	protected  long serializePage2IssPosDbAmt(char[] value) {
	    long  page2IssPosDbAmt;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2IssPosDbAmt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginPage2IssPosDbAmt
		       ,18
		      );
		 localPage2IssPosDbAmtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2IssPosDbAmt;
    }

   protected long checkPage2IssPosDbAmtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2IssPosDbAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage2IssPosDbAmt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage2IssPosDbAmt
			                 ,PAGE_2_ISS_POS_DB_AMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2IssPosDbAmt", beginPage2IssPosDbAmt,PAGE_2_ISS_POS_DB_AMT_LEN);
    }
   	}
     int localPage2IssPosCrCntCounter = -1;
     public boolean isPage2IssPosCrCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2IssPosCrCntCounter != sharedCounter;
         localPage2IssPosCrCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2IssPosCrCnt
	 *	@return page2IssPosCrCnt
	 */
	public char[]  getPage2IssPosCrCntString() {
	     return getCharArray(beginPage2IssPosCrCnt,PAGE_2_ISS_POS_CR_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2IssPosCrCntIsNumeric() {
	    return isNumeric(beginPage2IssPosCrCnt
	                    ,beginPage2IssPosCrCnt + PAGE_2_ISS_POS_CR_CNT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ISS_POS_CR_CNT_LEN = 9;
  	/**
	 * serializePage2IssPosCrCnt
	 */
	protected void serializePage2IssPosCrCnt(int page2IssPosCrCnt) {
		 putNumber(beginPage2IssPosCrCnt,page2IssPosCrCnt,PAGE_2_ISS_POS_CR_CNT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2IssPosCrCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2IssPosCrCnt
	 */
   	protected  int serializePage2IssPosCrCnt(char[] value) {
	    int  page2IssPosCrCnt;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2IssPosCrCnt = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginPage2IssPosCrCnt
		       ,9
		      );
		 localPage2IssPosCrCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2IssPosCrCnt;
    }

   protected int checkPage2IssPosCrCntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2IssPosCrCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPage2IssPosCrCnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPage2IssPosCrCnt
			                 ,PAGE_2_ISS_POS_CR_CNT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2IssPosCrCnt", beginPage2IssPosCrCnt,PAGE_2_ISS_POS_CR_CNT_LEN);
    }
   	}
     int localPage2IssPosCrAmtCounter = -1;
     public boolean isPage2IssPosCrAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2IssPosCrAmtCounter != sharedCounter;
         localPage2IssPosCrAmtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2IssPosCrAmt
	 *	@return page2IssPosCrAmt
	 */
	public char[]  getPage2IssPosCrAmtString() {
	     return getCharArray(beginPage2IssPosCrAmt,PAGE_2_ISS_POS_CR_AMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2IssPosCrAmtIsNumeric() {
	    return isNumeric(beginPage2IssPosCrAmt
	                    ,beginPage2IssPosCrAmt + PAGE_2_ISS_POS_CR_AMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ISS_POS_CR_AMT_LEN = 18;
  	/**
	 * serializePage2IssPosCrAmt
	 */
	protected void serializePage2IssPosCrAmt(long page2IssPosCrAmt) {
		 putNumber(beginPage2IssPosCrAmt,page2IssPosCrAmt,PAGE_2_ISS_POS_CR_AMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2IssPosCrAmtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2IssPosCrAmt
	 */
   	protected  long serializePage2IssPosCrAmt(char[] value) {
	    long  page2IssPosCrAmt;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2IssPosCrAmt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginPage2IssPosCrAmt
		       ,18
		      );
		 localPage2IssPosCrAmtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2IssPosCrAmt;
    }

   protected long checkPage2IssPosCrAmtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2IssPosCrAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage2IssPosCrAmt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage2IssPosCrAmt
			                 ,PAGE_2_ISS_POS_CR_AMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2IssPosCrAmt", beginPage2IssPosCrAmt,PAGE_2_ISS_POS_CR_AMT_LEN);
    }
   	}
     int localPage2IssAtmDbRevCntCounter = -1;
     public boolean isPage2IssAtmDbRevCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2IssAtmDbRevCntCounter != sharedCounter;
         localPage2IssAtmDbRevCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2IssAtmDbRevCnt
	 *	@return page2IssAtmDbRevCnt
	 */
	public char[]  getPage2IssAtmDbRevCntString() {
	     return getCharArray(beginPage2IssAtmDbRevCnt,PAGE_2_ISS_ATM_DB_REV_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2IssAtmDbRevCntIsNumeric() {
	    return isNumeric(beginPage2IssAtmDbRevCnt
	                    ,beginPage2IssAtmDbRevCnt + PAGE_2_ISS_ATM_DB_REV_CNT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ISS_ATM_DB_REV_CNT_LEN = 9;
  	/**
	 * serializePage2IssAtmDbRevCnt
	 */
	protected void serializePage2IssAtmDbRevCnt(int page2IssAtmDbRevCnt) {
		 putNumber(beginPage2IssAtmDbRevCnt,page2IssAtmDbRevCnt,PAGE_2_ISS_ATM_DB_REV_CNT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2IssAtmDbRevCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2IssAtmDbRevCnt
	 */
   	protected  int serializePage2IssAtmDbRevCnt(char[] value) {
	    int  page2IssAtmDbRevCnt;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2IssAtmDbRevCnt = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginPage2IssAtmDbRevCnt
		       ,9
		      );
		 localPage2IssAtmDbRevCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2IssAtmDbRevCnt;
    }

   protected int checkPage2IssAtmDbRevCntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2IssAtmDbRevCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPage2IssAtmDbRevCnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPage2IssAtmDbRevCnt
			                 ,PAGE_2_ISS_ATM_DB_REV_CNT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2IssAtmDbRevCnt", beginPage2IssAtmDbRevCnt,PAGE_2_ISS_ATM_DB_REV_CNT_LEN);
    }
   	}
     int localPage2IssAtmDbRevAmtCounter = -1;
     public boolean isPage2IssAtmDbRevAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2IssAtmDbRevAmtCounter != sharedCounter;
         localPage2IssAtmDbRevAmtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2IssAtmDbRevAmt
	 *	@return page2IssAtmDbRevAmt
	 */
	public char[]  getPage2IssAtmDbRevAmtString() {
	     return getCharArray(beginPage2IssAtmDbRevAmt,PAGE_2_ISS_ATM_DB_REV_AMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2IssAtmDbRevAmtIsNumeric() {
	    return isNumeric(beginPage2IssAtmDbRevAmt
	                    ,beginPage2IssAtmDbRevAmt + PAGE_2_ISS_ATM_DB_REV_AMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ISS_ATM_DB_REV_AMT_LEN = 18;
  	/**
	 * serializePage2IssAtmDbRevAmt
	 */
	protected void serializePage2IssAtmDbRevAmt(long page2IssAtmDbRevAmt) {
		 putNumber(beginPage2IssAtmDbRevAmt,page2IssAtmDbRevAmt,PAGE_2_ISS_ATM_DB_REV_AMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2IssAtmDbRevAmtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2IssAtmDbRevAmt
	 */
   	protected  long serializePage2IssAtmDbRevAmt(char[] value) {
	    long  page2IssAtmDbRevAmt;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2IssAtmDbRevAmt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginPage2IssAtmDbRevAmt
		       ,18
		      );
		 localPage2IssAtmDbRevAmtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2IssAtmDbRevAmt;
    }

   protected long checkPage2IssAtmDbRevAmtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2IssAtmDbRevAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage2IssAtmDbRevAmt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage2IssAtmDbRevAmt
			                 ,PAGE_2_ISS_ATM_DB_REV_AMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2IssAtmDbRevAmt", beginPage2IssAtmDbRevAmt,PAGE_2_ISS_ATM_DB_REV_AMT_LEN);
    }
   	}
     int localPage2IssAtmCrRevCntCounter = -1;
     public boolean isPage2IssAtmCrRevCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2IssAtmCrRevCntCounter != sharedCounter;
         localPage2IssAtmCrRevCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2IssAtmCrRevCnt
	 *	@return page2IssAtmCrRevCnt
	 */
	public char[]  getPage2IssAtmCrRevCntString() {
	     return getCharArray(beginPage2IssAtmCrRevCnt,PAGE_2_ISS_ATM_CR_REV_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2IssAtmCrRevCntIsNumeric() {
	    return isNumeric(beginPage2IssAtmCrRevCnt
	                    ,beginPage2IssAtmCrRevCnt + PAGE_2_ISS_ATM_CR_REV_CNT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ISS_ATM_CR_REV_CNT_LEN = 9;
  	/**
	 * serializePage2IssAtmCrRevCnt
	 */
	protected void serializePage2IssAtmCrRevCnt(int page2IssAtmCrRevCnt) {
		 putNumber(beginPage2IssAtmCrRevCnt,page2IssAtmCrRevCnt,PAGE_2_ISS_ATM_CR_REV_CNT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2IssAtmCrRevCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2IssAtmCrRevCnt
	 */
   	protected  int serializePage2IssAtmCrRevCnt(char[] value) {
	    int  page2IssAtmCrRevCnt;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2IssAtmCrRevCnt = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginPage2IssAtmCrRevCnt
		       ,9
		      );
		 localPage2IssAtmCrRevCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2IssAtmCrRevCnt;
    }

   protected int checkPage2IssAtmCrRevCntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2IssAtmCrRevCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPage2IssAtmCrRevCnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPage2IssAtmCrRevCnt
			                 ,PAGE_2_ISS_ATM_CR_REV_CNT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2IssAtmCrRevCnt", beginPage2IssAtmCrRevCnt,PAGE_2_ISS_ATM_CR_REV_CNT_LEN);
    }
   	}
     int localPage2IssAtmCrRevAmtCounter = -1;
     public boolean isPage2IssAtmCrRevAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2IssAtmCrRevAmtCounter != sharedCounter;
         localPage2IssAtmCrRevAmtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2IssAtmCrRevAmt
	 *	@return page2IssAtmCrRevAmt
	 */
	public char[]  getPage2IssAtmCrRevAmtString() {
	     return getCharArray(beginPage2IssAtmCrRevAmt,PAGE_2_ISS_ATM_CR_REV_AMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2IssAtmCrRevAmtIsNumeric() {
	    return isNumeric(beginPage2IssAtmCrRevAmt
	                    ,beginPage2IssAtmCrRevAmt + PAGE_2_ISS_ATM_CR_REV_AMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ISS_ATM_CR_REV_AMT_LEN = 18;
  	/**
	 * serializePage2IssAtmCrRevAmt
	 */
	protected void serializePage2IssAtmCrRevAmt(long page2IssAtmCrRevAmt) {
		 putNumber(beginPage2IssAtmCrRevAmt,page2IssAtmCrRevAmt,PAGE_2_ISS_ATM_CR_REV_AMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2IssAtmCrRevAmtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2IssAtmCrRevAmt
	 */
   	protected  long serializePage2IssAtmCrRevAmt(char[] value) {
	    long  page2IssAtmCrRevAmt;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2IssAtmCrRevAmt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginPage2IssAtmCrRevAmt
		       ,18
		      );
		 localPage2IssAtmCrRevAmtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2IssAtmCrRevAmt;
    }

   protected long checkPage2IssAtmCrRevAmtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2IssAtmCrRevAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage2IssAtmCrRevAmt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage2IssAtmCrRevAmt
			                 ,PAGE_2_ISS_ATM_CR_REV_AMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2IssAtmCrRevAmt", beginPage2IssAtmCrRevAmt,PAGE_2_ISS_ATM_CR_REV_AMT_LEN);
    }
   	}
     int localPage2IssPosDbRevCntCounter = -1;
     public boolean isPage2IssPosDbRevCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2IssPosDbRevCntCounter != sharedCounter;
         localPage2IssPosDbRevCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2IssPosDbRevCnt
	 *	@return page2IssPosDbRevCnt
	 */
	public char[]  getPage2IssPosDbRevCntString() {
	     return getCharArray(beginPage2IssPosDbRevCnt,PAGE_2_ISS_POS_DB_REV_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2IssPosDbRevCntIsNumeric() {
	    return isNumeric(beginPage2IssPosDbRevCnt
	                    ,beginPage2IssPosDbRevCnt + PAGE_2_ISS_POS_DB_REV_CNT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ISS_POS_DB_REV_CNT_LEN = 9;
  	/**
	 * serializePage2IssPosDbRevCnt
	 */
	protected void serializePage2IssPosDbRevCnt(int page2IssPosDbRevCnt) {
		 putNumber(beginPage2IssPosDbRevCnt,page2IssPosDbRevCnt,PAGE_2_ISS_POS_DB_REV_CNT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2IssPosDbRevCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2IssPosDbRevCnt
	 */
   	protected  int serializePage2IssPosDbRevCnt(char[] value) {
	    int  page2IssPosDbRevCnt;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2IssPosDbRevCnt = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginPage2IssPosDbRevCnt
		       ,9
		      );
		 localPage2IssPosDbRevCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2IssPosDbRevCnt;
    }

   protected int checkPage2IssPosDbRevCntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2IssPosDbRevCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPage2IssPosDbRevCnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPage2IssPosDbRevCnt
			                 ,PAGE_2_ISS_POS_DB_REV_CNT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2IssPosDbRevCnt", beginPage2IssPosDbRevCnt,PAGE_2_ISS_POS_DB_REV_CNT_LEN);
    }
   	}
     int localPage2IssPosDbRevAmtCounter = -1;
     public boolean isPage2IssPosDbRevAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2IssPosDbRevAmtCounter != sharedCounter;
         localPage2IssPosDbRevAmtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2IssPosDbRevAmt
	 *	@return page2IssPosDbRevAmt
	 */
	public char[]  getPage2IssPosDbRevAmtString() {
	     return getCharArray(beginPage2IssPosDbRevAmt,PAGE_2_ISS_POS_DB_REV_AMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2IssPosDbRevAmtIsNumeric() {
	    return isNumeric(beginPage2IssPosDbRevAmt
	                    ,beginPage2IssPosDbRevAmt + PAGE_2_ISS_POS_DB_REV_AMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ISS_POS_DB_REV_AMT_LEN = 18;
  	/**
	 * serializePage2IssPosDbRevAmt
	 */
	protected void serializePage2IssPosDbRevAmt(long page2IssPosDbRevAmt) {
		 putNumber(beginPage2IssPosDbRevAmt,page2IssPosDbRevAmt,PAGE_2_ISS_POS_DB_REV_AMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2IssPosDbRevAmtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2IssPosDbRevAmt
	 */
   	protected  long serializePage2IssPosDbRevAmt(char[] value) {
	    long  page2IssPosDbRevAmt;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2IssPosDbRevAmt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginPage2IssPosDbRevAmt
		       ,18
		      );
		 localPage2IssPosDbRevAmtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2IssPosDbRevAmt;
    }

   protected long checkPage2IssPosDbRevAmtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2IssPosDbRevAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage2IssPosDbRevAmt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage2IssPosDbRevAmt
			                 ,PAGE_2_ISS_POS_DB_REV_AMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2IssPosDbRevAmt", beginPage2IssPosDbRevAmt,PAGE_2_ISS_POS_DB_REV_AMT_LEN);
    }
   	}
     int localPage2IssPosCrRevCntCounter = -1;
     public boolean isPage2IssPosCrRevCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2IssPosCrRevCntCounter != sharedCounter;
         localPage2IssPosCrRevCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2IssPosCrRevCnt
	 *	@return page2IssPosCrRevCnt
	 */
	public char[]  getPage2IssPosCrRevCntString() {
	     return getCharArray(beginPage2IssPosCrRevCnt,PAGE_2_ISS_POS_CR_REV_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2IssPosCrRevCntIsNumeric() {
	    return isNumeric(beginPage2IssPosCrRevCnt
	                    ,beginPage2IssPosCrRevCnt + PAGE_2_ISS_POS_CR_REV_CNT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ISS_POS_CR_REV_CNT_LEN = 9;
  	/**
	 * serializePage2IssPosCrRevCnt
	 */
	protected void serializePage2IssPosCrRevCnt(int page2IssPosCrRevCnt) {
		 putNumber(beginPage2IssPosCrRevCnt,page2IssPosCrRevCnt,PAGE_2_ISS_POS_CR_REV_CNT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2IssPosCrRevCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2IssPosCrRevCnt
	 */
   	protected  int serializePage2IssPosCrRevCnt(char[] value) {
	    int  page2IssPosCrRevCnt;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2IssPosCrRevCnt = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginPage2IssPosCrRevCnt
		       ,9
		      );
		 localPage2IssPosCrRevCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2IssPosCrRevCnt;
    }

   protected int checkPage2IssPosCrRevCntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2IssPosCrRevCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPage2IssPosCrRevCnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPage2IssPosCrRevCnt
			                 ,PAGE_2_ISS_POS_CR_REV_CNT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2IssPosCrRevCnt", beginPage2IssPosCrRevCnt,PAGE_2_ISS_POS_CR_REV_CNT_LEN);
    }
   	}
     int localPage2IssPosCrRevAmtCounter = -1;
     public boolean isPage2IssPosCrRevAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2IssPosCrRevAmtCounter != sharedCounter;
         localPage2IssPosCrRevAmtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2IssPosCrRevAmt
	 *	@return page2IssPosCrRevAmt
	 */
	public char[]  getPage2IssPosCrRevAmtString() {
	     return getCharArray(beginPage2IssPosCrRevAmt,PAGE_2_ISS_POS_CR_REV_AMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2IssPosCrRevAmtIsNumeric() {
	    return isNumeric(beginPage2IssPosCrRevAmt
	                    ,beginPage2IssPosCrRevAmt + PAGE_2_ISS_POS_CR_REV_AMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ISS_POS_CR_REV_AMT_LEN = 18;
  	/**
	 * serializePage2IssPosCrRevAmt
	 */
	protected void serializePage2IssPosCrRevAmt(long page2IssPosCrRevAmt) {
		 putNumber(beginPage2IssPosCrRevAmt,page2IssPosCrRevAmt,PAGE_2_ISS_POS_CR_REV_AMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2IssPosCrRevAmtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2IssPosCrRevAmt
	 */
   	protected  long serializePage2IssPosCrRevAmt(char[] value) {
	    long  page2IssPosCrRevAmt;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2IssPosCrRevAmt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginPage2IssPosCrRevAmt
		       ,18
		      );
		 localPage2IssPosCrRevAmtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2IssPosCrRevAmt;
    }

   protected long checkPage2IssPosCrRevAmtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2IssPosCrRevAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage2IssPosCrRevAmt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage2IssPosCrRevAmt
			                 ,PAGE_2_ISS_POS_CR_REV_AMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2IssPosCrRevAmt", beginPage2IssPosCrRevAmt,PAGE_2_ISS_POS_CR_REV_AMT_LEN);
    }
   	}
     int localPage2IssCcaDbAmtCounter = -1;
     public boolean isPage2IssCcaDbAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2IssCcaDbAmtCounter != sharedCounter;
         localPage2IssCcaDbAmtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2IssCcaDbAmt
	 *	@return page2IssCcaDbAmt
	 */
	public char[]  getPage2IssCcaDbAmtString() {
	     return getCharArray(beginPage2IssCcaDbAmt,PAGE_2_ISS_CCA_DB_AMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2IssCcaDbAmtIsNumeric() {
	    return isNumeric(beginPage2IssCcaDbAmt
	                    ,beginPage2IssCcaDbAmt + PAGE_2_ISS_CCA_DB_AMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ISS_CCA_DB_AMT_LEN = 18;
  	/**
	 * serializePage2IssCcaDbAmt
	 */
	protected void serializePage2IssCcaDbAmt(long page2IssCcaDbAmt) {
		 putNumber(beginPage2IssCcaDbAmt,page2IssCcaDbAmt,PAGE_2_ISS_CCA_DB_AMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2IssCcaDbAmtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2IssCcaDbAmt
	 */
   	protected  long serializePage2IssCcaDbAmt(char[] value) {
	    long  page2IssCcaDbAmt;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2IssCcaDbAmt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginPage2IssCcaDbAmt
		       ,18
		      );
		 localPage2IssCcaDbAmtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2IssCcaDbAmt;
    }

   protected long checkPage2IssCcaDbAmtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2IssCcaDbAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage2IssCcaDbAmt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage2IssCcaDbAmt
			                 ,PAGE_2_ISS_CCA_DB_AMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2IssCcaDbAmt", beginPage2IssCcaDbAmt,PAGE_2_ISS_CCA_DB_AMT_LEN);
    }
   	}
     int localPage2IssCcaCrAmtCounter = -1;
     public boolean isPage2IssCcaCrAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2IssCcaCrAmtCounter != sharedCounter;
         localPage2IssCcaCrAmtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2IssCcaCrAmt
	 *	@return page2IssCcaCrAmt
	 */
	public char[]  getPage2IssCcaCrAmtString() {
	     return getCharArray(beginPage2IssCcaCrAmt,PAGE_2_ISS_CCA_CR_AMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2IssCcaCrAmtIsNumeric() {
	    return isNumeric(beginPage2IssCcaCrAmt
	                    ,beginPage2IssCcaCrAmt + PAGE_2_ISS_CCA_CR_AMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ISS_CCA_CR_AMT_LEN = 18;
  	/**
	 * serializePage2IssCcaCrAmt
	 */
	protected void serializePage2IssCcaCrAmt(long page2IssCcaCrAmt) {
		 putNumber(beginPage2IssCcaCrAmt,page2IssCcaCrAmt,PAGE_2_ISS_CCA_CR_AMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2IssCcaCrAmtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2IssCcaCrAmt
	 */
   	protected  long serializePage2IssCcaCrAmt(char[] value) {
	    long  page2IssCcaCrAmt;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2IssCcaCrAmt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginPage2IssCcaCrAmt
		       ,18
		      );
		 localPage2IssCcaCrAmtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2IssCcaCrAmt;
    }

   protected long checkPage2IssCcaCrAmtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2IssCcaCrAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage2IssCcaCrAmt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage2IssCcaCrAmt
			                 ,PAGE_2_ISS_CCA_CR_AMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2IssCcaCrAmt", beginPage2IssCcaCrAmt,PAGE_2_ISS_CCA_CR_AMT_LEN);
    }
   	}
     int localPage2IssIccrDbAmtCounter = -1;
     public boolean isPage2IssIccrDbAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2IssIccrDbAmtCounter != sharedCounter;
         localPage2IssIccrDbAmtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2IssIccrDbAmt
	 *	@return page2IssIccrDbAmt
	 */
	public char[]  getPage2IssIccrDbAmtString() {
	     return getCharArray(beginPage2IssIccrDbAmt,PAGE_2_ISS_ICCR_DB_AMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2IssIccrDbAmtIsNumeric() {
	    return isNumeric(beginPage2IssIccrDbAmt
	                    ,beginPage2IssIccrDbAmt + PAGE_2_ISS_ICCR_DB_AMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ISS_ICCR_DB_AMT_LEN = 18;
  	/**
	 * serializePage2IssIccrDbAmt
	 */
	protected void serializePage2IssIccrDbAmt(long page2IssIccrDbAmt) {
		 putNumber(beginPage2IssIccrDbAmt,page2IssIccrDbAmt,PAGE_2_ISS_ICCR_DB_AMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2IssIccrDbAmtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2IssIccrDbAmt
	 */
   	protected  long serializePage2IssIccrDbAmt(char[] value) {
	    long  page2IssIccrDbAmt;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2IssIccrDbAmt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginPage2IssIccrDbAmt
		       ,18
		      );
		 localPage2IssIccrDbAmtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2IssIccrDbAmt;
    }

   protected long checkPage2IssIccrDbAmtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2IssIccrDbAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage2IssIccrDbAmt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage2IssIccrDbAmt
			                 ,PAGE_2_ISS_ICCR_DB_AMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2IssIccrDbAmt", beginPage2IssIccrDbAmt,PAGE_2_ISS_ICCR_DB_AMT_LEN);
    }
   	}
     int localPage2IssIccrCrAmtCounter = -1;
     public boolean isPage2IssIccrCrAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2IssIccrCrAmtCounter != sharedCounter;
         localPage2IssIccrCrAmtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2IssIccrCrAmt
	 *	@return page2IssIccrCrAmt
	 */
	public char[]  getPage2IssIccrCrAmtString() {
	     return getCharArray(beginPage2IssIccrCrAmt,PAGE_2_ISS_ICCR_CR_AMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2IssIccrCrAmtIsNumeric() {
	    return isNumeric(beginPage2IssIccrCrAmt
	                    ,beginPage2IssIccrCrAmt + PAGE_2_ISS_ICCR_CR_AMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ISS_ICCR_CR_AMT_LEN = 18;
  	/**
	 * serializePage2IssIccrCrAmt
	 */
	protected void serializePage2IssIccrCrAmt(long page2IssIccrCrAmt) {
		 putNumber(beginPage2IssIccrCrAmt,page2IssIccrCrAmt,PAGE_2_ISS_ICCR_CR_AMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2IssIccrCrAmtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2IssIccrCrAmt
	 */
   	protected  long serializePage2IssIccrCrAmt(char[] value) {
	    long  page2IssIccrCrAmt;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2IssIccrCrAmt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginPage2IssIccrCrAmt
		       ,18
		      );
		 localPage2IssIccrCrAmtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2IssIccrCrAmt;
    }

   protected long checkPage2IssIccrCrAmtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2IssIccrCrAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage2IssIccrCrAmt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage2IssIccrCrAmt
			                 ,PAGE_2_ISS_ICCR_CR_AMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2IssIccrCrAmt", beginPage2IssIccrCrAmt,PAGE_2_ISS_ICCR_CR_AMT_LEN);
    }
   	}
     int localPage2IssSurchgFreeCounter = -1;
     public boolean isPage2IssSurchgFreeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage2IssSurchgFreeCounter != sharedCounter;
         localPage2IssSurchgFreeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page2IssSurchgFree
	 *	@return page2IssSurchgFree
	 */
	public char[]  getPage2IssSurchgFreeString() {
	     return getCharArray(beginPage2IssSurchgFree,PAGE_2_ISS_SURCHG_FREE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page2IssSurchgFreeIsNumeric() {
	    return isNumeric(beginPage2IssSurchgFree
	                    ,beginPage2IssSurchgFree + PAGE_2_ISS_SURCHG_FREE_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_2_ISS_SURCHG_FREE_LEN = 9;
  	/**
	 * serializePage2IssSurchgFree
	 */
	protected void serializePage2IssSurchgFree(int page2IssSurchgFree) {
		 putNumber(beginPage2IssSurchgFree,page2IssSurchgFree,PAGE_2_ISS_SURCHG_FREE_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage2IssSurchgFreeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage2IssSurchgFree
	 */
   	protected  int serializePage2IssSurchgFree(char[] value) {
	    int  page2IssSurchgFree;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page2IssSurchgFree = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginPage2IssSurchgFree
		       ,9
		      );
		 localPage2IssSurchgFreeCounter = shareString.getSerializedField().getModifiedCounter();
		return  page2IssSurchgFree;
    }

   protected int checkPage2IssSurchgFreeMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage2IssSurchgFree is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPage2IssSurchgFree() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPage2IssSurchgFree
			                 ,PAGE_2_ISS_SURCHG_FREE_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page2IssSurchgFree", beginPage2IssSurchgFree,PAGE_2_ISS_SURCHG_FREE_LEN);
    }
   	}
     int localPage3AcqVatTotalCounter = -1;
     public boolean isPage3AcqVatTotalModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage3AcqVatTotalCounter != sharedCounter;
         localPage3AcqVatTotalCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page3AcqVatTotal
	 *	@return page3AcqVatTotal
	 */
	public char[]  getPage3AcqVatTotalString() {
	     return getCharArray(beginPage3AcqVatTotal,PAGE_3_ACQ_VAT_TOTAL_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page3AcqVatTotalIsNumeric() {
	    return isNumeric(beginPage3AcqVatTotal
	                    ,beginPage3AcqVatTotal + PAGE_3_ACQ_VAT_TOTAL_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_3_ACQ_VAT_TOTAL_LEN = 11;
  	/**
	 * serializePage3AcqVatTotal
	 */
	protected void serializePage3AcqVatTotal(long page3AcqVatTotal) {
		 putNumber(beginPage3AcqVatTotal,page3AcqVatTotal,PAGE_3_ACQ_VAT_TOTAL_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage3AcqVatTotalCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage3AcqVatTotal
	 */
   	protected  long serializePage3AcqVatTotal(char[] value) {
	    long  page3AcqVatTotal;
	    if(value.length >0 && value.length!= 11)
            value = new String(value).trim().toCharArray();
	    if (value.length < 11) value = pad(11, value, ' ', LEFT_PAD);
	    else if (value.length > 11) value = substring(value,0,11);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page3AcqVatTotal = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(11,value,true/*isSigned?*/)
		       ,beginPage3AcqVatTotal
		       ,11
		      );
		 localPage3AcqVatTotalCounter = shareString.getSerializedField().getModifiedCounter();
		return  page3AcqVatTotal;
    }

   protected long checkPage3AcqVatTotalMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage3AcqVatTotal is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage3AcqVatTotal() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage3AcqVatTotal
			                 ,PAGE_3_ACQ_VAT_TOTAL_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page3AcqVatTotal", beginPage3AcqVatTotal,PAGE_3_ACQ_VAT_TOTAL_LEN);
    }
   	}
     int localPage3IssVatTotalCounter = -1;
     public boolean isPage3IssVatTotalModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage3IssVatTotalCounter != sharedCounter;
         localPage3IssVatTotalCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page3IssVatTotal
	 *	@return page3IssVatTotal
	 */
	public char[]  getPage3IssVatTotalString() {
	     return getCharArray(beginPage3IssVatTotal,PAGE_3_ISS_VAT_TOTAL_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page3IssVatTotalIsNumeric() {
	    return isNumeric(beginPage3IssVatTotal
	                    ,beginPage3IssVatTotal + PAGE_3_ISS_VAT_TOTAL_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_3_ISS_VAT_TOTAL_LEN = 11;
  	/**
	 * serializePage3IssVatTotal
	 */
	protected void serializePage3IssVatTotal(long page3IssVatTotal) {
		 putNumber(beginPage3IssVatTotal,page3IssVatTotal,PAGE_3_ISS_VAT_TOTAL_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage3IssVatTotalCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage3IssVatTotal
	 */
   	protected  long serializePage3IssVatTotal(char[] value) {
	    long  page3IssVatTotal;
	    if(value.length >0 && value.length!= 11)
            value = new String(value).trim().toCharArray();
	    if (value.length < 11) value = pad(11, value, ' ', LEFT_PAD);
	    else if (value.length > 11) value = substring(value,0,11);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page3IssVatTotal = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(11,value,true/*isSigned?*/)
		       ,beginPage3IssVatTotal
		       ,11
		      );
		 localPage3IssVatTotalCounter = shareString.getSerializedField().getModifiedCounter();
		return  page3IssVatTotal;
    }

   protected long checkPage3IssVatTotalMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage3IssVatTotal is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage3IssVatTotal() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage3IssVatTotal
			                 ,PAGE_3_ISS_VAT_TOTAL_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page3IssVatTotal", beginPage3IssVatTotal,PAGE_3_ISS_VAT_TOTAL_LEN);
    }
   	}
     int localPage3AcqVatFicntCounter = -1;
     public boolean isPage3AcqVatFicntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage3AcqVatFicntCounter != sharedCounter;
         localPage3AcqVatFicntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page3AcqVatFicnt
	 *	@return page3AcqVatFicnt
	 */
	public char[]  getPage3AcqVatFicntString() {
	     return getCharArray(beginPage3AcqVatFicnt,PAGE_3_ACQ_VAT_FICNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page3AcqVatFicntIsNumeric() {
	    return isNumeric(beginPage3AcqVatFicnt
	                    ,beginPage3AcqVatFicnt + PAGE_3_ACQ_VAT_FICNT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_3_ACQ_VAT_FICNT_LEN = 9;
  	/**
	 * serializePage3AcqVatFicnt
	 */
	protected void serializePage3AcqVatFicnt(int page3AcqVatFicnt) {
		 putNumber(beginPage3AcqVatFicnt,page3AcqVatFicnt,PAGE_3_ACQ_VAT_FICNT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage3AcqVatFicntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage3AcqVatFicnt
	 */
   	protected  int serializePage3AcqVatFicnt(char[] value) {
	    int  page3AcqVatFicnt;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page3AcqVatFicnt = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginPage3AcqVatFicnt
		       ,9
		      );
		 localPage3AcqVatFicntCounter = shareString.getSerializedField().getModifiedCounter();
		return  page3AcqVatFicnt;
    }

   protected int checkPage3AcqVatFicntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage3AcqVatFicnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPage3AcqVatFicnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPage3AcqVatFicnt
			                 ,PAGE_3_ACQ_VAT_FICNT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page3AcqVatFicnt", beginPage3AcqVatFicnt,PAGE_3_ACQ_VAT_FICNT_LEN);
    }
   	}
     int localPage3AcqVatFiamtCounter = -1;
     public boolean isPage3AcqVatFiamtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage3AcqVatFiamtCounter != sharedCounter;
         localPage3AcqVatFiamtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page3AcqVatFiamt
	 *	@return page3AcqVatFiamt
	 */
	public char[]  getPage3AcqVatFiamtString() {
	     return getCharArray(beginPage3AcqVatFiamt,PAGE_3_ACQ_VAT_FIAMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page3AcqVatFiamtIsNumeric() {
	    return isNumeric(beginPage3AcqVatFiamt
	                    ,beginPage3AcqVatFiamt + PAGE_3_ACQ_VAT_FIAMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_3_ACQ_VAT_FIAMT_LEN = 15;
  	/**
	 * serializePage3AcqVatFiamt
	 */
	protected void serializePage3AcqVatFiamt(long page3AcqVatFiamt) {
		 putNumber(beginPage3AcqVatFiamt,page3AcqVatFiamt,PAGE_3_ACQ_VAT_FIAMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage3AcqVatFiamtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage3AcqVatFiamt
	 */
   	protected  long serializePage3AcqVatFiamt(char[] value) {
	    long  page3AcqVatFiamt;
	    if(value.length >0 && value.length!= 15)
            value = new String(value).trim().toCharArray();
	    if (value.length < 15) value = pad(15, value, ' ', LEFT_PAD);
	    else if (value.length > 15) value = substring(value,0,15);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page3AcqVatFiamt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(15,value,true/*isSigned?*/)
		       ,beginPage3AcqVatFiamt
		       ,15
		      );
		 localPage3AcqVatFiamtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page3AcqVatFiamt;
    }

   protected long checkPage3AcqVatFiamtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1P/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage3AcqVatFiamt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage3AcqVatFiamt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage3AcqVatFiamt
			                 ,PAGE_3_ACQ_VAT_FIAMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page3AcqVatFiamt", beginPage3AcqVatFiamt,PAGE_3_ACQ_VAT_FIAMT_LEN);
    }
   	}
     int localPage3AcqVatFvamtCounter = -1;
     public boolean isPage3AcqVatFvamtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage3AcqVatFvamtCounter != sharedCounter;
         localPage3AcqVatFvamtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page3AcqVatFvamt
	 *	@return page3AcqVatFvamt
	 */
	public char[]  getPage3AcqVatFvamtString() {
	     return getCharArray(beginPage3AcqVatFvamt,PAGE_3_ACQ_VAT_FVAMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page3AcqVatFvamtIsNumeric() {
	    return isNumeric(beginPage3AcqVatFvamt
	                    ,beginPage3AcqVatFvamt + PAGE_3_ACQ_VAT_FVAMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_3_ACQ_VAT_FVAMT_LEN = 11;
  	/**
	 * serializePage3AcqVatFvamt
	 */
	protected void serializePage3AcqVatFvamt(long page3AcqVatFvamt) {
		 putNumber(beginPage3AcqVatFvamt,page3AcqVatFvamt,PAGE_3_ACQ_VAT_FVAMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage3AcqVatFvamtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage3AcqVatFvamt
	 */
   	protected  long serializePage3AcqVatFvamt(char[] value) {
	    long  page3AcqVatFvamt;
	    if(value.length >0 && value.length!= 11)
            value = new String(value).trim().toCharArray();
	    if (value.length < 11) value = pad(11, value, ' ', LEFT_PAD);
	    else if (value.length > 11) value = substring(value,0,11);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page3AcqVatFvamt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(11,value,true/*isSigned?*/)
		       ,beginPage3AcqVatFvamt
		       ,11
		      );
		 localPage3AcqVatFvamtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page3AcqVatFvamt;
    }

   protected long checkPage3AcqVatFvamtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage3AcqVatFvamt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage3AcqVatFvamt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage3AcqVatFvamt
			                 ,PAGE_3_ACQ_VAT_FVAMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page3AcqVatFvamt", beginPage3AcqVatFvamt,PAGE_3_ACQ_VAT_FVAMT_LEN);
    }
   	}
     int localPage3AcqVatNicntCounter = -1;
     public boolean isPage3AcqVatNicntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage3AcqVatNicntCounter != sharedCounter;
         localPage3AcqVatNicntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page3AcqVatNicnt
	 *	@return page3AcqVatNicnt
	 */
	public char[]  getPage3AcqVatNicntString() {
	     return getCharArray(beginPage3AcqVatNicnt,PAGE_3_ACQ_VAT_NICNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page3AcqVatNicntIsNumeric() {
	    return isNumeric(beginPage3AcqVatNicnt
	                    ,beginPage3AcqVatNicnt + PAGE_3_ACQ_VAT_NICNT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_3_ACQ_VAT_NICNT_LEN = 9;
  	/**
	 * serializePage3AcqVatNicnt
	 */
	protected void serializePage3AcqVatNicnt(int page3AcqVatNicnt) {
		 putNumber(beginPage3AcqVatNicnt,page3AcqVatNicnt,PAGE_3_ACQ_VAT_NICNT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage3AcqVatNicntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage3AcqVatNicnt
	 */
   	protected  int serializePage3AcqVatNicnt(char[] value) {
	    int  page3AcqVatNicnt;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page3AcqVatNicnt = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginPage3AcqVatNicnt
		       ,9
		      );
		 localPage3AcqVatNicntCounter = shareString.getSerializedField().getModifiedCounter();
		return  page3AcqVatNicnt;
    }

   protected int checkPage3AcqVatNicntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage3AcqVatNicnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPage3AcqVatNicnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPage3AcqVatNicnt
			                 ,PAGE_3_ACQ_VAT_NICNT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page3AcqVatNicnt", beginPage3AcqVatNicnt,PAGE_3_ACQ_VAT_NICNT_LEN);
    }
   	}
     int localPage3AcqVatNiamtCounter = -1;
     public boolean isPage3AcqVatNiamtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage3AcqVatNiamtCounter != sharedCounter;
         localPage3AcqVatNiamtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page3AcqVatNiamt
	 *	@return page3AcqVatNiamt
	 */
	public char[]  getPage3AcqVatNiamtString() {
	     return getCharArray(beginPage3AcqVatNiamt,PAGE_3_ACQ_VAT_NIAMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page3AcqVatNiamtIsNumeric() {
	    return isNumeric(beginPage3AcqVatNiamt
	                    ,beginPage3AcqVatNiamt + PAGE_3_ACQ_VAT_NIAMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_3_ACQ_VAT_NIAMT_LEN = 15;
  	/**
	 * serializePage3AcqVatNiamt
	 */
	protected void serializePage3AcqVatNiamt(long page3AcqVatNiamt) {
		 putNumber(beginPage3AcqVatNiamt,page3AcqVatNiamt,PAGE_3_ACQ_VAT_NIAMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage3AcqVatNiamtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage3AcqVatNiamt
	 */
   	protected  long serializePage3AcqVatNiamt(char[] value) {
	    long  page3AcqVatNiamt;
	    if(value.length >0 && value.length!= 15)
            value = new String(value).trim().toCharArray();
	    if (value.length < 15) value = pad(15, value, ' ', LEFT_PAD);
	    else if (value.length > 15) value = substring(value,0,15);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page3AcqVatNiamt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(15,value,true/*isSigned?*/)
		       ,beginPage3AcqVatNiamt
		       ,15
		      );
		 localPage3AcqVatNiamtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page3AcqVatNiamt;
    }

   protected long checkPage3AcqVatNiamtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1P/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage3AcqVatNiamt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage3AcqVatNiamt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage3AcqVatNiamt
			                 ,PAGE_3_ACQ_VAT_NIAMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page3AcqVatNiamt", beginPage3AcqVatNiamt,PAGE_3_ACQ_VAT_NIAMT_LEN);
    }
   	}
     int localPage3AcqVatNvamtCounter = -1;
     public boolean isPage3AcqVatNvamtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage3AcqVatNvamtCounter != sharedCounter;
         localPage3AcqVatNvamtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page3AcqVatNvamt
	 *	@return page3AcqVatNvamt
	 */
	public char[]  getPage3AcqVatNvamtString() {
	     return getCharArray(beginPage3AcqVatNvamt,PAGE_3_ACQ_VAT_NVAMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page3AcqVatNvamtIsNumeric() {
	    return isNumeric(beginPage3AcqVatNvamt
	                    ,beginPage3AcqVatNvamt + PAGE_3_ACQ_VAT_NVAMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_3_ACQ_VAT_NVAMT_LEN = 11;
  	/**
	 * serializePage3AcqVatNvamt
	 */
	protected void serializePage3AcqVatNvamt(long page3AcqVatNvamt) {
		 putNumber(beginPage3AcqVatNvamt,page3AcqVatNvamt,PAGE_3_ACQ_VAT_NVAMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage3AcqVatNvamtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage3AcqVatNvamt
	 */
   	protected  long serializePage3AcqVatNvamt(char[] value) {
	    long  page3AcqVatNvamt;
	    if(value.length >0 && value.length!= 11)
            value = new String(value).trim().toCharArray();
	    if (value.length < 11) value = pad(11, value, ' ', LEFT_PAD);
	    else if (value.length > 11) value = substring(value,0,11);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page3AcqVatNvamt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(11,value,true/*isSigned?*/)
		       ,beginPage3AcqVatNvamt
		       ,11
		      );
		 localPage3AcqVatNvamtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page3AcqVatNvamt;
    }

   protected long checkPage3AcqVatNvamtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage3AcqVatNvamt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage3AcqVatNvamt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage3AcqVatNvamt
			                 ,PAGE_3_ACQ_VAT_NVAMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page3AcqVatNvamt", beginPage3AcqVatNvamt,PAGE_3_ACQ_VAT_NVAMT_LEN);
    }
   	}
     int localPage3AcqVatTicntCounter = -1;
     public boolean isPage3AcqVatTicntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage3AcqVatTicntCounter != sharedCounter;
         localPage3AcqVatTicntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page3AcqVatTicnt
	 *	@return page3AcqVatTicnt
	 */
	public char[]  getPage3AcqVatTicntString() {
	     return getCharArray(beginPage3AcqVatTicnt,PAGE_3_ACQ_VAT_TICNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page3AcqVatTicntIsNumeric() {
	    return isNumeric(beginPage3AcqVatTicnt
	                    ,beginPage3AcqVatTicnt + PAGE_3_ACQ_VAT_TICNT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_3_ACQ_VAT_TICNT_LEN = 9;
  	/**
	 * serializePage3AcqVatTicnt
	 */
	protected void serializePage3AcqVatTicnt(int page3AcqVatTicnt) {
		 putNumber(beginPage3AcqVatTicnt,page3AcqVatTicnt,PAGE_3_ACQ_VAT_TICNT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage3AcqVatTicntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage3AcqVatTicnt
	 */
   	protected  int serializePage3AcqVatTicnt(char[] value) {
	    int  page3AcqVatTicnt;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page3AcqVatTicnt = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginPage3AcqVatTicnt
		       ,9
		      );
		 localPage3AcqVatTicntCounter = shareString.getSerializedField().getModifiedCounter();
		return  page3AcqVatTicnt;
    }

   protected int checkPage3AcqVatTicntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage3AcqVatTicnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPage3AcqVatTicnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPage3AcqVatTicnt
			                 ,PAGE_3_ACQ_VAT_TICNT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page3AcqVatTicnt", beginPage3AcqVatTicnt,PAGE_3_ACQ_VAT_TICNT_LEN);
    }
   	}
     int localPage3AcqVatTiamtCounter = -1;
     public boolean isPage3AcqVatTiamtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage3AcqVatTiamtCounter != sharedCounter;
         localPage3AcqVatTiamtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page3AcqVatTiamt
	 *	@return page3AcqVatTiamt
	 */
	public char[]  getPage3AcqVatTiamtString() {
	     return getCharArray(beginPage3AcqVatTiamt,PAGE_3_ACQ_VAT_TIAMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page3AcqVatTiamtIsNumeric() {
	    return isNumeric(beginPage3AcqVatTiamt
	                    ,beginPage3AcqVatTiamt + PAGE_3_ACQ_VAT_TIAMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_3_ACQ_VAT_TIAMT_LEN = 15;
  	/**
	 * serializePage3AcqVatTiamt
	 */
	protected void serializePage3AcqVatTiamt(long page3AcqVatTiamt) {
		 putNumber(beginPage3AcqVatTiamt,page3AcqVatTiamt,PAGE_3_ACQ_VAT_TIAMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage3AcqVatTiamtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage3AcqVatTiamt
	 */
   	protected  long serializePage3AcqVatTiamt(char[] value) {
	    long  page3AcqVatTiamt;
	    if(value.length >0 && value.length!= 15)
            value = new String(value).trim().toCharArray();
	    if (value.length < 15) value = pad(15, value, ' ', LEFT_PAD);
	    else if (value.length > 15) value = substring(value,0,15);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page3AcqVatTiamt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(15,value,true/*isSigned?*/)
		       ,beginPage3AcqVatTiamt
		       ,15
		      );
		 localPage3AcqVatTiamtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page3AcqVatTiamt;
    }

   protected long checkPage3AcqVatTiamtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1P/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage3AcqVatTiamt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage3AcqVatTiamt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage3AcqVatTiamt
			                 ,PAGE_3_ACQ_VAT_TIAMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page3AcqVatTiamt", beginPage3AcqVatTiamt,PAGE_3_ACQ_VAT_TIAMT_LEN);
    }
   	}
     int localPage3AcqVatTvamtCounter = -1;
     public boolean isPage3AcqVatTvamtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage3AcqVatTvamtCounter != sharedCounter;
         localPage3AcqVatTvamtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page3AcqVatTvamt
	 *	@return page3AcqVatTvamt
	 */
	public char[]  getPage3AcqVatTvamtString() {
	     return getCharArray(beginPage3AcqVatTvamt,PAGE_3_ACQ_VAT_TVAMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page3AcqVatTvamtIsNumeric() {
	    return isNumeric(beginPage3AcqVatTvamt
	                    ,beginPage3AcqVatTvamt + PAGE_3_ACQ_VAT_TVAMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_3_ACQ_VAT_TVAMT_LEN = 11;
  	/**
	 * serializePage3AcqVatTvamt
	 */
	protected void serializePage3AcqVatTvamt(long page3AcqVatTvamt) {
		 putNumber(beginPage3AcqVatTvamt,page3AcqVatTvamt,PAGE_3_ACQ_VAT_TVAMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage3AcqVatTvamtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage3AcqVatTvamt
	 */
   	protected  long serializePage3AcqVatTvamt(char[] value) {
	    long  page3AcqVatTvamt;
	    if(value.length >0 && value.length!= 11)
            value = new String(value).trim().toCharArray();
	    if (value.length < 11) value = pad(11, value, ' ', LEFT_PAD);
	    else if (value.length > 11) value = substring(value,0,11);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page3AcqVatTvamt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(11,value,true/*isSigned?*/)
		       ,beginPage3AcqVatTvamt
		       ,11
		      );
		 localPage3AcqVatTvamtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page3AcqVatTvamt;
    }

   protected long checkPage3AcqVatTvamtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage3AcqVatTvamt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage3AcqVatTvamt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage3AcqVatTvamt
			                 ,PAGE_3_ACQ_VAT_TVAMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page3AcqVatTvamt", beginPage3AcqVatTvamt,PAGE_3_ACQ_VAT_TVAMT_LEN);
    }
   	}
     int localPage3IssVatFicntCounter = -1;
     public boolean isPage3IssVatFicntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage3IssVatFicntCounter != sharedCounter;
         localPage3IssVatFicntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page3IssVatFicnt
	 *	@return page3IssVatFicnt
	 */
	public char[]  getPage3IssVatFicntString() {
	     return getCharArray(beginPage3IssVatFicnt,PAGE_3_ISS_VAT_FICNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page3IssVatFicntIsNumeric() {
	    return isNumeric(beginPage3IssVatFicnt
	                    ,beginPage3IssVatFicnt + PAGE_3_ISS_VAT_FICNT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_3_ISS_VAT_FICNT_LEN = 9;
  	/**
	 * serializePage3IssVatFicnt
	 */
	protected void serializePage3IssVatFicnt(int page3IssVatFicnt) {
		 putNumber(beginPage3IssVatFicnt,page3IssVatFicnt,PAGE_3_ISS_VAT_FICNT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage3IssVatFicntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage3IssVatFicnt
	 */
   	protected  int serializePage3IssVatFicnt(char[] value) {
	    int  page3IssVatFicnt;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page3IssVatFicnt = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginPage3IssVatFicnt
		       ,9
		      );
		 localPage3IssVatFicntCounter = shareString.getSerializedField().getModifiedCounter();
		return  page3IssVatFicnt;
    }

   protected int checkPage3IssVatFicntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage3IssVatFicnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPage3IssVatFicnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPage3IssVatFicnt
			                 ,PAGE_3_ISS_VAT_FICNT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page3IssVatFicnt", beginPage3IssVatFicnt,PAGE_3_ISS_VAT_FICNT_LEN);
    }
   	}
     int localPage3IssVatFiamtCounter = -1;
     public boolean isPage3IssVatFiamtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage3IssVatFiamtCounter != sharedCounter;
         localPage3IssVatFiamtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page3IssVatFiamt
	 *	@return page3IssVatFiamt
	 */
	public char[]  getPage3IssVatFiamtString() {
	     return getCharArray(beginPage3IssVatFiamt,PAGE_3_ISS_VAT_FIAMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page3IssVatFiamtIsNumeric() {
	    return isNumeric(beginPage3IssVatFiamt
	                    ,beginPage3IssVatFiamt + PAGE_3_ISS_VAT_FIAMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_3_ISS_VAT_FIAMT_LEN = 15;
  	/**
	 * serializePage3IssVatFiamt
	 */
	protected void serializePage3IssVatFiamt(long page3IssVatFiamt) {
		 putNumber(beginPage3IssVatFiamt,page3IssVatFiamt,PAGE_3_ISS_VAT_FIAMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage3IssVatFiamtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage3IssVatFiamt
	 */
   	protected  long serializePage3IssVatFiamt(char[] value) {
	    long  page3IssVatFiamt;
	    if(value.length >0 && value.length!= 15)
            value = new String(value).trim().toCharArray();
	    if (value.length < 15) value = pad(15, value, ' ', LEFT_PAD);
	    else if (value.length > 15) value = substring(value,0,15);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page3IssVatFiamt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(15,value,true/*isSigned?*/)
		       ,beginPage3IssVatFiamt
		       ,15
		      );
		 localPage3IssVatFiamtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page3IssVatFiamt;
    }

   protected long checkPage3IssVatFiamtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1P/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage3IssVatFiamt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage3IssVatFiamt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage3IssVatFiamt
			                 ,PAGE_3_ISS_VAT_FIAMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page3IssVatFiamt", beginPage3IssVatFiamt,PAGE_3_ISS_VAT_FIAMT_LEN);
    }
   	}
     int localPage3IssVatFvamtCounter = -1;
     public boolean isPage3IssVatFvamtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage3IssVatFvamtCounter != sharedCounter;
         localPage3IssVatFvamtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page3IssVatFvamt
	 *	@return page3IssVatFvamt
	 */
	public char[]  getPage3IssVatFvamtString() {
	     return getCharArray(beginPage3IssVatFvamt,PAGE_3_ISS_VAT_FVAMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page3IssVatFvamtIsNumeric() {
	    return isNumeric(beginPage3IssVatFvamt
	                    ,beginPage3IssVatFvamt + PAGE_3_ISS_VAT_FVAMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_3_ISS_VAT_FVAMT_LEN = 11;
  	/**
	 * serializePage3IssVatFvamt
	 */
	protected void serializePage3IssVatFvamt(long page3IssVatFvamt) {
		 putNumber(beginPage3IssVatFvamt,page3IssVatFvamt,PAGE_3_ISS_VAT_FVAMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage3IssVatFvamtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage3IssVatFvamt
	 */
   	protected  long serializePage3IssVatFvamt(char[] value) {
	    long  page3IssVatFvamt;
	    if(value.length >0 && value.length!= 11)
            value = new String(value).trim().toCharArray();
	    if (value.length < 11) value = pad(11, value, ' ', LEFT_PAD);
	    else if (value.length > 11) value = substring(value,0,11);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page3IssVatFvamt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(11,value,true/*isSigned?*/)
		       ,beginPage3IssVatFvamt
		       ,11
		      );
		 localPage3IssVatFvamtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page3IssVatFvamt;
    }

   protected long checkPage3IssVatFvamtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage3IssVatFvamt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage3IssVatFvamt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage3IssVatFvamt
			                 ,PAGE_3_ISS_VAT_FVAMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page3IssVatFvamt", beginPage3IssVatFvamt,PAGE_3_ISS_VAT_FVAMT_LEN);
    }
   	}
     int localPage3IssVatNicntCounter = -1;
     public boolean isPage3IssVatNicntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage3IssVatNicntCounter != sharedCounter;
         localPage3IssVatNicntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page3IssVatNicnt
	 *	@return page3IssVatNicnt
	 */
	public char[]  getPage3IssVatNicntString() {
	     return getCharArray(beginPage3IssVatNicnt,PAGE_3_ISS_VAT_NICNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page3IssVatNicntIsNumeric() {
	    return isNumeric(beginPage3IssVatNicnt
	                    ,beginPage3IssVatNicnt + PAGE_3_ISS_VAT_NICNT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_3_ISS_VAT_NICNT_LEN = 9;
  	/**
	 * serializePage3IssVatNicnt
	 */
	protected void serializePage3IssVatNicnt(int page3IssVatNicnt) {
		 putNumber(beginPage3IssVatNicnt,page3IssVatNicnt,PAGE_3_ISS_VAT_NICNT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage3IssVatNicntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage3IssVatNicnt
	 */
   	protected  int serializePage3IssVatNicnt(char[] value) {
	    int  page3IssVatNicnt;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page3IssVatNicnt = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginPage3IssVatNicnt
		       ,9
		      );
		 localPage3IssVatNicntCounter = shareString.getSerializedField().getModifiedCounter();
		return  page3IssVatNicnt;
    }

   protected int checkPage3IssVatNicntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage3IssVatNicnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPage3IssVatNicnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPage3IssVatNicnt
			                 ,PAGE_3_ISS_VAT_NICNT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page3IssVatNicnt", beginPage3IssVatNicnt,PAGE_3_ISS_VAT_NICNT_LEN);
    }
   	}
     int localPage3IssVatNiamtCounter = -1;
     public boolean isPage3IssVatNiamtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage3IssVatNiamtCounter != sharedCounter;
         localPage3IssVatNiamtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page3IssVatNiamt
	 *	@return page3IssVatNiamt
	 */
	public char[]  getPage3IssVatNiamtString() {
	     return getCharArray(beginPage3IssVatNiamt,PAGE_3_ISS_VAT_NIAMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page3IssVatNiamtIsNumeric() {
	    return isNumeric(beginPage3IssVatNiamt
	                    ,beginPage3IssVatNiamt + PAGE_3_ISS_VAT_NIAMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_3_ISS_VAT_NIAMT_LEN = 15;
  	/**
	 * serializePage3IssVatNiamt
	 */
	protected void serializePage3IssVatNiamt(long page3IssVatNiamt) {
		 putNumber(beginPage3IssVatNiamt,page3IssVatNiamt,PAGE_3_ISS_VAT_NIAMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage3IssVatNiamtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage3IssVatNiamt
	 */
   	protected  long serializePage3IssVatNiamt(char[] value) {
	    long  page3IssVatNiamt;
	    if(value.length >0 && value.length!= 15)
            value = new String(value).trim().toCharArray();
	    if (value.length < 15) value = pad(15, value, ' ', LEFT_PAD);
	    else if (value.length > 15) value = substring(value,0,15);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page3IssVatNiamt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(15,value,true/*isSigned?*/)
		       ,beginPage3IssVatNiamt
		       ,15
		      );
		 localPage3IssVatNiamtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page3IssVatNiamt;
    }

   protected long checkPage3IssVatNiamtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1P/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage3IssVatNiamt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage3IssVatNiamt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage3IssVatNiamt
			                 ,PAGE_3_ISS_VAT_NIAMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page3IssVatNiamt", beginPage3IssVatNiamt,PAGE_3_ISS_VAT_NIAMT_LEN);
    }
   	}
     int localPage3IssVatNvamtCounter = -1;
     public boolean isPage3IssVatNvamtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage3IssVatNvamtCounter != sharedCounter;
         localPage3IssVatNvamtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page3IssVatNvamt
	 *	@return page3IssVatNvamt
	 */
	public char[]  getPage3IssVatNvamtString() {
	     return getCharArray(beginPage3IssVatNvamt,PAGE_3_ISS_VAT_NVAMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page3IssVatNvamtIsNumeric() {
	    return isNumeric(beginPage3IssVatNvamt
	                    ,beginPage3IssVatNvamt + PAGE_3_ISS_VAT_NVAMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_3_ISS_VAT_NVAMT_LEN = 11;
  	/**
	 * serializePage3IssVatNvamt
	 */
	protected void serializePage3IssVatNvamt(long page3IssVatNvamt) {
		 putNumber(beginPage3IssVatNvamt,page3IssVatNvamt,PAGE_3_ISS_VAT_NVAMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage3IssVatNvamtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage3IssVatNvamt
	 */
   	protected  long serializePage3IssVatNvamt(char[] value) {
	    long  page3IssVatNvamt;
	    if(value.length >0 && value.length!= 11)
            value = new String(value).trim().toCharArray();
	    if (value.length < 11) value = pad(11, value, ' ', LEFT_PAD);
	    else if (value.length > 11) value = substring(value,0,11);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page3IssVatNvamt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(11,value,true/*isSigned?*/)
		       ,beginPage3IssVatNvamt
		       ,11
		      );
		 localPage3IssVatNvamtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page3IssVatNvamt;
    }

   protected long checkPage3IssVatNvamtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage3IssVatNvamt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage3IssVatNvamt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage3IssVatNvamt
			                 ,PAGE_3_ISS_VAT_NVAMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page3IssVatNvamt", beginPage3IssVatNvamt,PAGE_3_ISS_VAT_NVAMT_LEN);
    }
   	}
     int localPage3IssVatTicntCounter = -1;
     public boolean isPage3IssVatTicntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage3IssVatTicntCounter != sharedCounter;
         localPage3IssVatTicntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page3IssVatTicnt
	 *	@return page3IssVatTicnt
	 */
	public char[]  getPage3IssVatTicntString() {
	     return getCharArray(beginPage3IssVatTicnt,PAGE_3_ISS_VAT_TICNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page3IssVatTicntIsNumeric() {
	    return isNumeric(beginPage3IssVatTicnt
	                    ,beginPage3IssVatTicnt + PAGE_3_ISS_VAT_TICNT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_3_ISS_VAT_TICNT_LEN = 9;
  	/**
	 * serializePage3IssVatTicnt
	 */
	protected void serializePage3IssVatTicnt(int page3IssVatTicnt) {
		 putNumber(beginPage3IssVatTicnt,page3IssVatTicnt,PAGE_3_ISS_VAT_TICNT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage3IssVatTicntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage3IssVatTicnt
	 */
   	protected  int serializePage3IssVatTicnt(char[] value) {
	    int  page3IssVatTicnt;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page3IssVatTicnt = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginPage3IssVatTicnt
		       ,9
		      );
		 localPage3IssVatTicntCounter = shareString.getSerializedField().getModifiedCounter();
		return  page3IssVatTicnt;
    }

   protected int checkPage3IssVatTicntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage3IssVatTicnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPage3IssVatTicnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPage3IssVatTicnt
			                 ,PAGE_3_ISS_VAT_TICNT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page3IssVatTicnt", beginPage3IssVatTicnt,PAGE_3_ISS_VAT_TICNT_LEN);
    }
   	}
     int localPage3IssVatTiamtCounter = -1;
     public boolean isPage3IssVatTiamtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage3IssVatTiamtCounter != sharedCounter;
         localPage3IssVatTiamtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page3IssVatTiamt
	 *	@return page3IssVatTiamt
	 */
	public char[]  getPage3IssVatTiamtString() {
	     return getCharArray(beginPage3IssVatTiamt,PAGE_3_ISS_VAT_TIAMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page3IssVatTiamtIsNumeric() {
	    return isNumeric(beginPage3IssVatTiamt
	                    ,beginPage3IssVatTiamt + PAGE_3_ISS_VAT_TIAMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_3_ISS_VAT_TIAMT_LEN = 15;
  	/**
	 * serializePage3IssVatTiamt
	 */
	protected void serializePage3IssVatTiamt(long page3IssVatTiamt) {
		 putNumber(beginPage3IssVatTiamt,page3IssVatTiamt,PAGE_3_ISS_VAT_TIAMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage3IssVatTiamtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage3IssVatTiamt
	 */
   	protected  long serializePage3IssVatTiamt(char[] value) {
	    long  page3IssVatTiamt;
	    if(value.length >0 && value.length!= 15)
            value = new String(value).trim().toCharArray();
	    if (value.length < 15) value = pad(15, value, ' ', LEFT_PAD);
	    else if (value.length > 15) value = substring(value,0,15);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page3IssVatTiamt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(15,value,true/*isSigned?*/)
		       ,beginPage3IssVatTiamt
		       ,15
		      );
		 localPage3IssVatTiamtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page3IssVatTiamt;
    }

   protected long checkPage3IssVatTiamtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1P/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage3IssVatTiamt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage3IssVatTiamt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage3IssVatTiamt
			                 ,PAGE_3_ISS_VAT_TIAMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page3IssVatTiamt", beginPage3IssVatTiamt,PAGE_3_ISS_VAT_TIAMT_LEN);
    }
   	}
     int localPage3IssVatTvamtCounter = -1;
     public boolean isPage3IssVatTvamtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage3IssVatTvamtCounter != sharedCounter;
         localPage3IssVatTvamtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page3IssVatTvamt
	 *	@return page3IssVatTvamt
	 */
	public char[]  getPage3IssVatTvamtString() {
	     return getCharArray(beginPage3IssVatTvamt,PAGE_3_ISS_VAT_TVAMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page3IssVatTvamtIsNumeric() {
	    return isNumeric(beginPage3IssVatTvamt
	                    ,beginPage3IssVatTvamt + PAGE_3_ISS_VAT_TVAMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_3_ISS_VAT_TVAMT_LEN = 11;
  	/**
	 * serializePage3IssVatTvamt
	 */
	protected void serializePage3IssVatTvamt(long page3IssVatTvamt) {
		 putNumber(beginPage3IssVatTvamt,page3IssVatTvamt,PAGE_3_ISS_VAT_TVAMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage3IssVatTvamtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage3IssVatTvamt
	 */
   	protected  long serializePage3IssVatTvamt(char[] value) {
	    long  page3IssVatTvamt;
	    if(value.length >0 && value.length!= 11)
            value = new String(value).trim().toCharArray();
	    if (value.length < 11) value = pad(11, value, ' ', LEFT_PAD);
	    else if (value.length > 11) value = substring(value,0,11);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page3IssVatTvamt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(11,value,true/*isSigned?*/)
		       ,beginPage3IssVatTvamt
		       ,11
		      );
		 localPage3IssVatTvamtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page3IssVatTvamt;
    }

   protected long checkPage3IssVatTvamtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage3IssVatTvamt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage3IssVatTvamt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage3IssVatTvamt
			                 ,PAGE_3_ISS_VAT_TVAMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page3IssVatTvamt", beginPage3IssVatTvamt,PAGE_3_ISS_VAT_TVAMT_LEN);
    }
   	}
     int localPage3NetVatFicntCounter = -1;
     public boolean isPage3NetVatFicntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage3NetVatFicntCounter != sharedCounter;
         localPage3NetVatFicntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page3NetVatFicnt
	 *	@return page3NetVatFicnt
	 */
	public char[]  getPage3NetVatFicntString() {
	     return getCharArray(beginPage3NetVatFicnt,PAGE_3_NET_VAT_FICNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page3NetVatFicntIsNumeric() {
	    return isNumeric(beginPage3NetVatFicnt
	                    ,beginPage3NetVatFicnt + PAGE_3_NET_VAT_FICNT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_3_NET_VAT_FICNT_LEN = 9;
  	/**
	 * serializePage3NetVatFicnt
	 */
	protected void serializePage3NetVatFicnt(int page3NetVatFicnt) {
		 putNumber(beginPage3NetVatFicnt,page3NetVatFicnt,PAGE_3_NET_VAT_FICNT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage3NetVatFicntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage3NetVatFicnt
	 */
   	protected  int serializePage3NetVatFicnt(char[] value) {
	    int  page3NetVatFicnt;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page3NetVatFicnt = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginPage3NetVatFicnt
		       ,9
		      );
		 localPage3NetVatFicntCounter = shareString.getSerializedField().getModifiedCounter();
		return  page3NetVatFicnt;
    }

   protected int checkPage3NetVatFicntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage3NetVatFicnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPage3NetVatFicnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPage3NetVatFicnt
			                 ,PAGE_3_NET_VAT_FICNT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page3NetVatFicnt", beginPage3NetVatFicnt,PAGE_3_NET_VAT_FICNT_LEN);
    }
   	}
     int localPage3NetVatFiamtCounter = -1;
     public boolean isPage3NetVatFiamtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage3NetVatFiamtCounter != sharedCounter;
         localPage3NetVatFiamtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page3NetVatFiamt
	 *	@return page3NetVatFiamt
	 */
	public char[]  getPage3NetVatFiamtString() {
	     return getCharArray(beginPage3NetVatFiamt,PAGE_3_NET_VAT_FIAMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page3NetVatFiamtIsNumeric() {
	    return isNumeric(beginPage3NetVatFiamt
	                    ,beginPage3NetVatFiamt + PAGE_3_NET_VAT_FIAMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_3_NET_VAT_FIAMT_LEN = 15;
  	/**
	 * serializePage3NetVatFiamt
	 */
	protected void serializePage3NetVatFiamt(long page3NetVatFiamt) {
		 putNumber(beginPage3NetVatFiamt,page3NetVatFiamt,PAGE_3_NET_VAT_FIAMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage3NetVatFiamtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage3NetVatFiamt
	 */
   	protected  long serializePage3NetVatFiamt(char[] value) {
	    long  page3NetVatFiamt;
	    if(value.length >0 && value.length!= 15)
            value = new String(value).trim().toCharArray();
	    if (value.length < 15) value = pad(15, value, ' ', LEFT_PAD);
	    else if (value.length > 15) value = substring(value,0,15);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page3NetVatFiamt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(15,value,true/*isSigned?*/)
		       ,beginPage3NetVatFiamt
		       ,15
		      );
		 localPage3NetVatFiamtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page3NetVatFiamt;
    }

   protected long checkPage3NetVatFiamtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1P/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage3NetVatFiamt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage3NetVatFiamt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage3NetVatFiamt
			                 ,PAGE_3_NET_VAT_FIAMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page3NetVatFiamt", beginPage3NetVatFiamt,PAGE_3_NET_VAT_FIAMT_LEN);
    }
   	}
     int localPage3NetVatFvamtCounter = -1;
     public boolean isPage3NetVatFvamtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage3NetVatFvamtCounter != sharedCounter;
         localPage3NetVatFvamtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page3NetVatFvamt
	 *	@return page3NetVatFvamt
	 */
	public char[]  getPage3NetVatFvamtString() {
	     return getCharArray(beginPage3NetVatFvamt,PAGE_3_NET_VAT_FVAMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page3NetVatFvamtIsNumeric() {
	    return isNumeric(beginPage3NetVatFvamt
	                    ,beginPage3NetVatFvamt + PAGE_3_NET_VAT_FVAMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_3_NET_VAT_FVAMT_LEN = 11;
  	/**
	 * serializePage3NetVatFvamt
	 */
	protected void serializePage3NetVatFvamt(long page3NetVatFvamt) {
		 putNumber(beginPage3NetVatFvamt,page3NetVatFvamt,PAGE_3_NET_VAT_FVAMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage3NetVatFvamtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage3NetVatFvamt
	 */
   	protected  long serializePage3NetVatFvamt(char[] value) {
	    long  page3NetVatFvamt;
	    if(value.length >0 && value.length!= 11)
            value = new String(value).trim().toCharArray();
	    if (value.length < 11) value = pad(11, value, ' ', LEFT_PAD);
	    else if (value.length > 11) value = substring(value,0,11);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page3NetVatFvamt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(11,value,true/*isSigned?*/)
		       ,beginPage3NetVatFvamt
		       ,11
		      );
		 localPage3NetVatFvamtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page3NetVatFvamt;
    }

   protected long checkPage3NetVatFvamtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage3NetVatFvamt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage3NetVatFvamt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage3NetVatFvamt
			                 ,PAGE_3_NET_VAT_FVAMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page3NetVatFvamt", beginPage3NetVatFvamt,PAGE_3_NET_VAT_FVAMT_LEN);
    }
   	}
     int localPage3NetVatNicntCounter = -1;
     public boolean isPage3NetVatNicntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage3NetVatNicntCounter != sharedCounter;
         localPage3NetVatNicntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page3NetVatNicnt
	 *	@return page3NetVatNicnt
	 */
	public char[]  getPage3NetVatNicntString() {
	     return getCharArray(beginPage3NetVatNicnt,PAGE_3_NET_VAT_NICNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page3NetVatNicntIsNumeric() {
	    return isNumeric(beginPage3NetVatNicnt
	                    ,beginPage3NetVatNicnt + PAGE_3_NET_VAT_NICNT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_3_NET_VAT_NICNT_LEN = 9;
  	/**
	 * serializePage3NetVatNicnt
	 */
	protected void serializePage3NetVatNicnt(int page3NetVatNicnt) {
		 putNumber(beginPage3NetVatNicnt,page3NetVatNicnt,PAGE_3_NET_VAT_NICNT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage3NetVatNicntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage3NetVatNicnt
	 */
   	protected  int serializePage3NetVatNicnt(char[] value) {
	    int  page3NetVatNicnt;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page3NetVatNicnt = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginPage3NetVatNicnt
		       ,9
		      );
		 localPage3NetVatNicntCounter = shareString.getSerializedField().getModifiedCounter();
		return  page3NetVatNicnt;
    }

   protected int checkPage3NetVatNicntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage3NetVatNicnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPage3NetVatNicnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPage3NetVatNicnt
			                 ,PAGE_3_NET_VAT_NICNT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page3NetVatNicnt", beginPage3NetVatNicnt,PAGE_3_NET_VAT_NICNT_LEN);
    }
   	}
     int localPage3NetVatNiamtCounter = -1;
     public boolean isPage3NetVatNiamtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage3NetVatNiamtCounter != sharedCounter;
         localPage3NetVatNiamtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page3NetVatNiamt
	 *	@return page3NetVatNiamt
	 */
	public char[]  getPage3NetVatNiamtString() {
	     return getCharArray(beginPage3NetVatNiamt,PAGE_3_NET_VAT_NIAMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page3NetVatNiamtIsNumeric() {
	    return isNumeric(beginPage3NetVatNiamt
	                    ,beginPage3NetVatNiamt + PAGE_3_NET_VAT_NIAMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_3_NET_VAT_NIAMT_LEN = 15;
  	/**
	 * serializePage3NetVatNiamt
	 */
	protected void serializePage3NetVatNiamt(long page3NetVatNiamt) {
		 putNumber(beginPage3NetVatNiamt,page3NetVatNiamt,PAGE_3_NET_VAT_NIAMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage3NetVatNiamtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage3NetVatNiamt
	 */
   	protected  long serializePage3NetVatNiamt(char[] value) {
	    long  page3NetVatNiamt;
	    if(value.length >0 && value.length!= 15)
            value = new String(value).trim().toCharArray();
	    if (value.length < 15) value = pad(15, value, ' ', LEFT_PAD);
	    else if (value.length > 15) value = substring(value,0,15);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page3NetVatNiamt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(15,value,true/*isSigned?*/)
		       ,beginPage3NetVatNiamt
		       ,15
		      );
		 localPage3NetVatNiamtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page3NetVatNiamt;
    }

   protected long checkPage3NetVatNiamtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1P/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage3NetVatNiamt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage3NetVatNiamt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage3NetVatNiamt
			                 ,PAGE_3_NET_VAT_NIAMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page3NetVatNiamt", beginPage3NetVatNiamt,PAGE_3_NET_VAT_NIAMT_LEN);
    }
   	}
     int localPage3NetVatNvamtCounter = -1;
     public boolean isPage3NetVatNvamtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage3NetVatNvamtCounter != sharedCounter;
         localPage3NetVatNvamtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page3NetVatNvamt
	 *	@return page3NetVatNvamt
	 */
	public char[]  getPage3NetVatNvamtString() {
	     return getCharArray(beginPage3NetVatNvamt,PAGE_3_NET_VAT_NVAMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page3NetVatNvamtIsNumeric() {
	    return isNumeric(beginPage3NetVatNvamt
	                    ,beginPage3NetVatNvamt + PAGE_3_NET_VAT_NVAMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_3_NET_VAT_NVAMT_LEN = 11;
  	/**
	 * serializePage3NetVatNvamt
	 */
	protected void serializePage3NetVatNvamt(long page3NetVatNvamt) {
		 putNumber(beginPage3NetVatNvamt,page3NetVatNvamt,PAGE_3_NET_VAT_NVAMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage3NetVatNvamtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage3NetVatNvamt
	 */
   	protected  long serializePage3NetVatNvamt(char[] value) {
	    long  page3NetVatNvamt;
	    if(value.length >0 && value.length!= 11)
            value = new String(value).trim().toCharArray();
	    if (value.length < 11) value = pad(11, value, ' ', LEFT_PAD);
	    else if (value.length > 11) value = substring(value,0,11);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page3NetVatNvamt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(11,value,true/*isSigned?*/)
		       ,beginPage3NetVatNvamt
		       ,11
		      );
		 localPage3NetVatNvamtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page3NetVatNvamt;
    }

   protected long checkPage3NetVatNvamtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage3NetVatNvamt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage3NetVatNvamt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage3NetVatNvamt
			                 ,PAGE_3_NET_VAT_NVAMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page3NetVatNvamt", beginPage3NetVatNvamt,PAGE_3_NET_VAT_NVAMT_LEN);
    }
   	}
     int localPage3NetVatTicntCounter = -1;
     public boolean isPage3NetVatTicntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage3NetVatTicntCounter != sharedCounter;
         localPage3NetVatTicntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page3NetVatTicnt
	 *	@return page3NetVatTicnt
	 */
	public char[]  getPage3NetVatTicntString() {
	     return getCharArray(beginPage3NetVatTicnt,PAGE_3_NET_VAT_TICNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page3NetVatTicntIsNumeric() {
	    return isNumeric(beginPage3NetVatTicnt
	                    ,beginPage3NetVatTicnt + PAGE_3_NET_VAT_TICNT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_3_NET_VAT_TICNT_LEN = 9;
  	/**
	 * serializePage3NetVatTicnt
	 */
	protected void serializePage3NetVatTicnt(int page3NetVatTicnt) {
		 putNumber(beginPage3NetVatTicnt,page3NetVatTicnt,PAGE_3_NET_VAT_TICNT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage3NetVatTicntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage3NetVatTicnt
	 */
   	protected  int serializePage3NetVatTicnt(char[] value) {
	    int  page3NetVatTicnt;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page3NetVatTicnt = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,true/*isSigned?*/)
		       ,beginPage3NetVatTicnt
		       ,9
		      );
		 localPage3NetVatTicntCounter = shareString.getSerializedField().getModifiedCounter();
		return  page3NetVatTicnt;
    }

   protected int checkPage3NetVatTicntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage3NetVatTicnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPage3NetVatTicnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPage3NetVatTicnt
			                 ,PAGE_3_NET_VAT_TICNT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page3NetVatTicnt", beginPage3NetVatTicnt,PAGE_3_NET_VAT_TICNT_LEN);
    }
   	}
     int localPage3NetVatTiamtCounter = -1;
     public boolean isPage3NetVatTiamtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage3NetVatTiamtCounter != sharedCounter;
         localPage3NetVatTiamtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page3NetVatTiamt
	 *	@return page3NetVatTiamt
	 */
	public char[]  getPage3NetVatTiamtString() {
	     return getCharArray(beginPage3NetVatTiamt,PAGE_3_NET_VAT_TIAMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page3NetVatTiamtIsNumeric() {
	    return isNumeric(beginPage3NetVatTiamt
	                    ,beginPage3NetVatTiamt + PAGE_3_NET_VAT_TIAMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_3_NET_VAT_TIAMT_LEN = 15;
  	/**
	 * serializePage3NetVatTiamt
	 */
	protected void serializePage3NetVatTiamt(long page3NetVatTiamt) {
		 putNumber(beginPage3NetVatTiamt,page3NetVatTiamt,PAGE_3_NET_VAT_TIAMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage3NetVatTiamtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage3NetVatTiamt
	 */
   	protected  long serializePage3NetVatTiamt(char[] value) {
	    long  page3NetVatTiamt;
	    if(value.length >0 && value.length!= 15)
            value = new String(value).trim().toCharArray();
	    if (value.length < 15) value = pad(15, value, ' ', LEFT_PAD);
	    else if (value.length > 15) value = substring(value,0,15);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page3NetVatTiamt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(15,value,true/*isSigned?*/)
		       ,beginPage3NetVatTiamt
		       ,15
		      );
		 localPage3NetVatTiamtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page3NetVatTiamt;
    }

   protected long checkPage3NetVatTiamtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1P/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage3NetVatTiamt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage3NetVatTiamt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage3NetVatTiamt
			                 ,PAGE_3_NET_VAT_TIAMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page3NetVatTiamt", beginPage3NetVatTiamt,PAGE_3_NET_VAT_TIAMT_LEN);
    }
   	}
     int localPage3NetVatTvamtCounter = -1;
     public boolean isPage3NetVatTvamtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPage3NetVatTvamtCounter != sharedCounter;
         localPage3NetVatTvamtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of page3NetVatTvamt
	 *	@return page3NetVatTvamt
	 */
	public char[]  getPage3NetVatTvamtString() {
	     return getCharArray(beginPage3NetVatTvamt,PAGE_3_NET_VAT_TVAMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean page3NetVatTvamtIsNumeric() {
	    return isNumeric(beginPage3NetVatTvamt
	                    ,beginPage3NetVatTvamt + PAGE_3_NET_VAT_TVAMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PAGE_3_NET_VAT_TVAMT_LEN = 11;
  	/**
	 * serializePage3NetVatTvamt
	 */
	protected void serializePage3NetVatTvamt(long page3NetVatTvamt) {
		 putNumber(beginPage3NetVatTvamt,page3NetVatTvamt,PAGE_3_NET_VAT_TVAMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPage3NetVatTvamtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePage3NetVatTvamt
	 */
   	protected  long serializePage3NetVatTvamt(char[] value) {
	    long  page3NetVatTvamt;
	    if(value.length >0 && value.length!= 11)
            value = new String(value).trim().toCharArray();
	    if (value.length < 11) value = pad(11, value, ' ', LEFT_PAD);
	    else if (value.length > 11) value = substring(value,0,11);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    page3NetVatTvamt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(11,value,true/*isSigned?*/)
		       ,beginPage3NetVatTvamt
		       ,11
		      );
		 localPage3NetVatTvamtCounter = shareString.getSerializedField().getModifiedCounter();
		return  page3NetVatTvamt;
    }

   protected long checkPage3NetVatTvamtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshPage3NetVatTvamt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPage3NetVatTvamt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPage3NetVatTvamt
			                 ,PAGE_3_NET_VAT_TVAMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("page3NetVatTvamt", beginPage3NetVatTvamt,PAGE_3_NET_VAT_TVAMT_LEN);
    }
   	}
     int localGrandTotSwCounter = -1;
     public boolean isGrandTotSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGrandTotSwCounter != sharedCounter;
         localGrandTotSwCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of grandTotSw
	 *	@return grandTotSw
	 */
	public char[]  getGrandTotSwString() {
	     return getCharArray(beginGrandTotSw,GRAND_TOT_SW_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean grandTotSwIsNumeric() {
	    return isNumeric(beginGrandTotSw
	                    ,beginGrandTotSw + GRAND_TOT_SW_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int GRAND_TOT_SW_LEN = 1;
  	/**
	 * serializeGrandTotSw
	 */
	protected void serializeGrandTotSw(int grandTotSw) {
		 putNumber(beginGrandTotSw,grandTotSw,GRAND_TOT_SW_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localGrandTotSwCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeGrandTotSw
	 */
   	protected  int serializeGrandTotSw(char[] value) {
	    int  grandTotSw;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    grandTotSw = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginGrandTotSw
		       ,1
		      );
		 localGrandTotSwCounter = shareString.getSerializedField().getModifiedCounter();
		return  grandTotSw;
    }

   protected int checkGrandTotSwMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshGrandTotSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshGrandTotSw() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginGrandTotSw
			                 ,GRAND_TOT_SW_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("grandTotSw", beginGrandTotSw,GRAND_TOT_SW_LEN);
    }
   	}
     int localAmtCounter = -1;
     public boolean isAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmtCounter != sharedCounter;
         localAmtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of amt
	 *	@return amt
	 */
	public char[]  getAmtString() {
	     return getCharArray(beginAmt,AMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean amtIsNumeric() {
	    return isNumeric(beginAmt
	                    ,beginAmt + AMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int AMT_LEN = 18;
  	/**
	 * serializeAmt
	 */
	protected void serializeAmt(long amt) {
		 putNumber(beginAmt,amt,AMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAmtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeAmt
	 */
   	protected  long serializeAmt(char[] value) {
	    long  amt;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    amt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginAmt
		       ,18
		      );
		 localAmtCounter = shareString.getSerializedField().getModifiedCounter();
		return  amt;
    }

   protected long checkAmtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshAmt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginAmt
			                 ,AMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("amt", beginAmt,AMT_LEN);
    }
   	}
     int localAmtT4Counter = -1;
     public boolean isAmtT4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmtT4Counter != sharedCounter;
         localAmtT4Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of amtT4
	 *	@return amtT4
	 */
	public char[]  getAmtT4String() {
	     return getCharArray(beginAmtT4,AMT_T_4_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean amtT4IsNumeric() {
	    return isNumeric(beginAmtT4
	                    ,beginAmtT4 + AMT_T_4_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int AMT_T_4_LEN = 24;
  	/**
	 * serializeAmtT4
	 */
	protected void serializeAmtT4(long amtT4) {
		 putNumber(beginAmtT4,amtT4,AMT_T_4_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAmtT4Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeAmtT4
	 */
   	protected  long serializeAmtT4(char[] value) {
	    long  amtT4;
	    if(value.length >0 && value.length!= 24)
            value = new String(value).trim().toCharArray();
	    if (value.length < 24) value = pad(24, value, ' ', LEFT_PAD);
	    else if (value.length > 24) value = substring(value,0,24);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    amtT4 = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(24,value,true/*isSigned?*/)
		       ,beginAmtT4
		       ,24
		      );
		 localAmtT4Counter = shareString.getSerializedField().getModifiedCounter();
		return  amtT4;
    }

   protected long checkAmtT4MaxLimit(long number) {

        return checkMaxLimit(number , Long.MAX_VALUE/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshAmtT4 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshAmtT4() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginAmtT4
			                 ,AMT_T_4_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("amtT4", beginAmtT4,AMT_T_4_LEN);
    }
   	}
     int localAmtT5Counter = -1;
     public boolean isAmtT5Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmtT5Counter != sharedCounter;
         localAmtT5Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of amtT5
	 *	@return amtT5
	 */
	public char[]  getAmtT5String() {
	     return getCharArray(beginAmtT5,AMT_T_5_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean amtT5IsNumeric() {
	    return isNumeric(beginAmtT5
	                    ,beginAmtT5 + AMT_T_5_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int AMT_T_5_LEN = 18;
  	/**
	 * serializeAmtT5
	 */
	protected void serializeAmtT5(long amtT5) {
		 putNumber(beginAmtT5,amtT5,AMT_T_5_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAmtT5Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeAmtT5
	 */
   	protected  long serializeAmtT5(char[] value) {
	    long  amtT5;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    amtT5 = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginAmtT5
		       ,18
		      );
		 localAmtT5Counter = shareString.getSerializedField().getModifiedCounter();
		return  amtT5;
    }

   protected long checkAmtT5MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshAmtT5 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshAmtT5() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginAmtT5
			                 ,AMT_T_5_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("amtT5", beginAmtT5,AMT_T_5_LEN);
    }
   	}
     int localAmtCcaCounter = -1;
     public boolean isAmtCcaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmtCcaCounter != sharedCounter;
         localAmtCcaCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of amtCca
	 *	@return amtCca
	 */
	public char[]  getAmtCcaString() {
	     return getCharArray(beginAmtCca,AMT_CCA_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean amtCcaIsNumeric() {
	    return isNumeric(beginAmtCca
	                    ,beginAmtCca + AMT_CCA_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int AMT_CCA_LEN = 18;
  	/**
	 * serializeAmtCca
	 */
	protected void serializeAmtCca(long amtCca) {
		 putNumber(beginAmtCca,amtCca,AMT_CCA_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAmtCcaCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeAmtCca
	 */
   	protected  long serializeAmtCca(char[] value) {
	    long  amtCca;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    amtCca = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginAmtCca
		       ,18
		      );
		 localAmtCcaCounter = shareString.getSerializedField().getModifiedCounter();
		return  amtCca;
    }

   protected long checkAmtCcaMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshAmtCca is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshAmtCca() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginAmtCca
			                 ,AMT_CCA_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("amtCca", beginAmtCca,AMT_CCA_LEN);
    }
   	}
     int localAmtIccrCounter = -1;
     public boolean isAmtIccrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmtIccrCounter != sharedCounter;
         localAmtIccrCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of amtIccr
	 *	@return amtIccr
	 */
	public char[]  getAmtIccrString() {
	     return getCharArray(beginAmtIccr,AMT_ICCR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean amtIccrIsNumeric() {
	    return isNumeric(beginAmtIccr
	                    ,beginAmtIccr + AMT_ICCR_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int AMT_ICCR_LEN = 18;
  	/**
	 * serializeAmtIccr
	 */
	protected void serializeAmtIccr(long amtIccr) {
		 putNumber(beginAmtIccr,amtIccr,AMT_ICCR_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAmtIccrCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeAmtIccr
	 */
   	protected  long serializeAmtIccr(char[] value) {
	    long  amtIccr;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    amtIccr = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginAmtIccr
		       ,18
		      );
		 localAmtIccrCounter = shareString.getSerializedField().getModifiedCounter();
		return  amtIccr;
    }

   protected long checkAmtIccrMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshAmtIccr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshAmtIccr() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginAmtIccr
			                 ,AMT_ICCR_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("amtIccr", beginAmtIccr,AMT_ICCR_LEN);
    }
   	}
     int localAmtCrCounter = -1;
     public boolean isAmtCrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmtCrCounter != sharedCounter;
         localAmtCrCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of amtCr
	 *	@return amtCr
	 */
	public char[]  getAmtCrString() {
	     return getCharArray(beginAmtCr,AMT_CR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean amtCrIsNumeric() {
	    return isNumeric(beginAmtCr
	                    ,beginAmtCr + AMT_CR_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int AMT_CR_LEN = 18;
  	/**
	 * serializeAmtCr
	 */
	protected void serializeAmtCr(long amtCr) {
		 putNumber(beginAmtCr,amtCr,AMT_CR_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAmtCrCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeAmtCr
	 */
   	protected  long serializeAmtCr(char[] value) {
	    long  amtCr;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    amtCr = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginAmtCr
		       ,18
		      );
		 localAmtCrCounter = shareString.getSerializedField().getModifiedCounter();
		return  amtCr;
    }

   protected long checkAmtCrMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshAmtCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshAmtCr() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginAmtCr
			                 ,AMT_CR_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("amtCr", beginAmtCr,AMT_CR_LEN);
    }
   	}
     int localAmtDbCounter = -1;
     public boolean isAmtDbModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmtDbCounter != sharedCounter;
         localAmtDbCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of amtDb
	 *	@return amtDb
	 */
	public char[]  getAmtDbString() {
	     return getCharArray(beginAmtDb,AMT_DB_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean amtDbIsNumeric() {
	    return isNumeric(beginAmtDb
	                    ,beginAmtDb + AMT_DB_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int AMT_DB_LEN = 18;
  	/**
	 * serializeAmtDb
	 */
	protected void serializeAmtDb(long amtDb) {
		 putNumber(beginAmtDb,amtDb,AMT_DB_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAmtDbCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeAmtDb
	 */
   	protected  long serializeAmtDb(char[] value) {
	    long  amtDb;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    amtDb = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginAmtDb
		       ,18
		      );
		 localAmtDbCounter = shareString.getSerializedField().getModifiedCounter();
		return  amtDb;
    }

   protected long checkAmtDbMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshAmtDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshAmtDb() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginAmtDb
			                 ,AMT_DB_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("amtDb", beginAmtDb,AMT_DB_LEN);
    }
   	}
     int localAmtCrFeeCounter = -1;
     public boolean isAmtCrFeeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmtCrFeeCounter != sharedCounter;
         localAmtCrFeeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of amtCrFee
	 *	@return amtCrFee
	 */
	public char[]  getAmtCrFeeString() {
	     return getCharArray(beginAmtCrFee,AMT_CR_FEE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean amtCrFeeIsNumeric() {
	    return isNumeric(beginAmtCrFee
	                    ,beginAmtCrFee + AMT_CR_FEE_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int AMT_CR_FEE_LEN = 18;
  	/**
	 * serializeAmtCrFee
	 */
	protected void serializeAmtCrFee(long amtCrFee) {
		 putNumber(beginAmtCrFee,amtCrFee,AMT_CR_FEE_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAmtCrFeeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeAmtCrFee
	 */
   	protected  long serializeAmtCrFee(char[] value) {
	    long  amtCrFee;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    amtCrFee = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginAmtCrFee
		       ,18
		      );
		 localAmtCrFeeCounter = shareString.getSerializedField().getModifiedCounter();
		return  amtCrFee;
    }

   protected long checkAmtCrFeeMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshAmtCrFee is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshAmtCrFee() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginAmtCrFee
			                 ,AMT_CR_FEE_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("amtCrFee", beginAmtCrFee,AMT_CR_FEE_LEN);
    }
   	}
     int localAmtDbFeeCounter = -1;
     public boolean isAmtDbFeeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmtDbFeeCounter != sharedCounter;
         localAmtDbFeeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of amtDbFee
	 *	@return amtDbFee
	 */
	public char[]  getAmtDbFeeString() {
	     return getCharArray(beginAmtDbFee,AMT_DB_FEE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean amtDbFeeIsNumeric() {
	    return isNumeric(beginAmtDbFee
	                    ,beginAmtDbFee + AMT_DB_FEE_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int AMT_DB_FEE_LEN = 18;
  	/**
	 * serializeAmtDbFee
	 */
	protected void serializeAmtDbFee(long amtDbFee) {
		 putNumber(beginAmtDbFee,amtDbFee,AMT_DB_FEE_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAmtDbFeeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeAmtDbFee
	 */
   	protected  long serializeAmtDbFee(char[] value) {
	    long  amtDbFee;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    amtDbFee = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginAmtDbFee
		       ,18
		      );
		 localAmtDbFeeCounter = shareString.getSerializedField().getModifiedCounter();
		return  amtDbFee;
    }

   protected long checkAmtDbFeeMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshAmtDbFee is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshAmtDbFee() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginAmtDbFee
			                 ,AMT_DB_FEE_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("amtDbFee", beginAmtDbFee,AMT_DB_FEE_LEN);
    }
   	}
     int localNetAcqDbCounter = -1;
     public boolean isNetAcqDbModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNetAcqDbCounter != sharedCounter;
         localNetAcqDbCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of netAcqDb
	 *	@return netAcqDb
	 */
	public char[]  getNetAcqDbString() {
	     return getCharArray(beginNetAcqDb,NET_ACQ_DB_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean netAcqDbIsNumeric() {
	    return isNumeric(beginNetAcqDb
	                    ,beginNetAcqDb + NET_ACQ_DB_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int NET_ACQ_DB_LEN = 18;
  	/**
	 * serializeNetAcqDb
	 */
	protected void serializeNetAcqDb(long netAcqDb) {
		 putNumber(beginNetAcqDb,netAcqDb,NET_ACQ_DB_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localNetAcqDbCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeNetAcqDb
	 */
   	protected  long serializeNetAcqDb(char[] value) {
	    long  netAcqDb;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    netAcqDb = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginNetAcqDb
		       ,18
		      );
		 localNetAcqDbCounter = shareString.getSerializedField().getModifiedCounter();
		return  netAcqDb;
    }

   protected long checkNetAcqDbMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshNetAcqDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshNetAcqDb() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginNetAcqDb
			                 ,NET_ACQ_DB_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("netAcqDb", beginNetAcqDb,NET_ACQ_DB_LEN);
    }
   	}
     int localNetAcqCrCounter = -1;
     public boolean isNetAcqCrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNetAcqCrCounter != sharedCounter;
         localNetAcqCrCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of netAcqCr
	 *	@return netAcqCr
	 */
	public char[]  getNetAcqCrString() {
	     return getCharArray(beginNetAcqCr,NET_ACQ_CR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean netAcqCrIsNumeric() {
	    return isNumeric(beginNetAcqCr
	                    ,beginNetAcqCr + NET_ACQ_CR_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int NET_ACQ_CR_LEN = 18;
  	/**
	 * serializeNetAcqCr
	 */
	protected void serializeNetAcqCr(long netAcqCr) {
		 putNumber(beginNetAcqCr,netAcqCr,NET_ACQ_CR_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localNetAcqCrCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeNetAcqCr
	 */
   	protected  long serializeNetAcqCr(char[] value) {
	    long  netAcqCr;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    netAcqCr = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginNetAcqCr
		       ,18
		      );
		 localNetAcqCrCounter = shareString.getSerializedField().getModifiedCounter();
		return  netAcqCr;
    }

   protected long checkNetAcqCrMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshNetAcqCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshNetAcqCr() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginNetAcqCr
			                 ,NET_ACQ_CR_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("netAcqCr", beginNetAcqCr,NET_ACQ_CR_LEN);
    }
   	}
     int localNetIssDbCounter = -1;
     public boolean isNetIssDbModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNetIssDbCounter != sharedCounter;
         localNetIssDbCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of netIssDb
	 *	@return netIssDb
	 */
	public char[]  getNetIssDbString() {
	     return getCharArray(beginNetIssDb,NET_ISS_DB_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean netIssDbIsNumeric() {
	    return isNumeric(beginNetIssDb
	                    ,beginNetIssDb + NET_ISS_DB_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int NET_ISS_DB_LEN = 18;
  	/**
	 * serializeNetIssDb
	 */
	protected void serializeNetIssDb(long netIssDb) {
		 putNumber(beginNetIssDb,netIssDb,NET_ISS_DB_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localNetIssDbCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeNetIssDb
	 */
   	protected  long serializeNetIssDb(char[] value) {
	    long  netIssDb;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    netIssDb = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginNetIssDb
		       ,18
		      );
		 localNetIssDbCounter = shareString.getSerializedField().getModifiedCounter();
		return  netIssDb;
    }

   protected long checkNetIssDbMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshNetIssDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshNetIssDb() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginNetIssDb
			                 ,NET_ISS_DB_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("netIssDb", beginNetIssDb,NET_ISS_DB_LEN);
    }
   	}
     int localNetIssCrCounter = -1;
     public boolean isNetIssCrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNetIssCrCounter != sharedCounter;
         localNetIssCrCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of netIssCr
	 *	@return netIssCr
	 */
	public char[]  getNetIssCrString() {
	     return getCharArray(beginNetIssCr,NET_ISS_CR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean netIssCrIsNumeric() {
	    return isNumeric(beginNetIssCr
	                    ,beginNetIssCr + NET_ISS_CR_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int NET_ISS_CR_LEN = 18;
  	/**
	 * serializeNetIssCr
	 */
	protected void serializeNetIssCr(long netIssCr) {
		 putNumber(beginNetIssCr,netIssCr,NET_ISS_CR_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localNetIssCrCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeNetIssCr
	 */
   	protected  long serializeNetIssCr(char[] value) {
	    long  netIssCr;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    netIssCr = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginNetIssCr
		       ,18
		      );
		 localNetIssCrCounter = shareString.getSerializedField().getModifiedCounter();
		return  netIssCr;
    }

   protected long checkNetIssCrMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshNetIssCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshNetIssCr() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginNetIssCr
			                 ,NET_ISS_CR_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("netIssCr", beginNetIssCr,NET_ISS_CR_LEN);
    }
   	}
     int localNetAchTotCounter = -1;
     public boolean isNetAchTotModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNetAchTotCounter != sharedCounter;
         localNetAchTotCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of netAchTot
	 *	@return netAchTot
	 */
	public char[]  getNetAchTotString() {
	     return getCharArray(beginNetAchTot,NET_ACH_TOT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean netAchTotIsNumeric() {
	    return isNumeric(beginNetAchTot
	                    ,beginNetAchTot + NET_ACH_TOT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int NET_ACH_TOT_LEN = 18;
  	/**
	 * serializeNetAchTot
	 */
	protected void serializeNetAchTot(long netAchTot) {
		 putNumber(beginNetAchTot,netAchTot,NET_ACH_TOT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localNetAchTotCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeNetAchTot
	 */
   	protected  long serializeNetAchTot(char[] value) {
	    long  netAchTot;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    netAchTot = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginNetAchTot
		       ,18
		      );
		 localNetAchTotCounter = shareString.getSerializedField().getModifiedCounter();
		return  netAchTot;
    }

   protected long checkNetAchTotMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshNetAchTot is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshNetAchTot() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginNetAchTot
			                 ,NET_ACH_TOT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("netAchTot", beginNetAchTot,NET_ACH_TOT_LEN);
    }
   	}
     int localNetp4AcqDbCounter = -1;
     public boolean isNetp4AcqDbModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNetp4AcqDbCounter != sharedCounter;
         localNetp4AcqDbCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of netp4AcqDb
	 *	@return netp4AcqDb
	 */
	public char[]  getNetp4AcqDbString() {
	     return getCharArray(beginNetp4AcqDb,NETP_4_ACQ_DB_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean netp4AcqDbIsNumeric() {
	    return isNumeric(beginNetp4AcqDb
	                    ,beginNetp4AcqDb + NETP_4_ACQ_DB_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int NETP_4_ACQ_DB_LEN = 22;
  	/**
	 * serializeNetp4AcqDb
	 */
	protected void serializeNetp4AcqDb(long netp4AcqDb) {
		 putNumber(beginNetp4AcqDb,netp4AcqDb,NETP_4_ACQ_DB_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localNetp4AcqDbCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeNetp4AcqDb
	 */
   	protected  long serializeNetp4AcqDb(char[] value) {
	    long  netp4AcqDb;
	    if(value.length >0 && value.length!= 22)
            value = new String(value).trim().toCharArray();
	    if (value.length < 22) value = pad(22, value, ' ', LEFT_PAD);
	    else if (value.length > 22) value = substring(value,0,22);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    netp4AcqDb = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(22,value,true/*isSigned?*/)
		       ,beginNetp4AcqDb
		       ,22
		      );
		 localNetp4AcqDbCounter = shareString.getSerializedField().getModifiedCounter();
		return  netp4AcqDb;
    }

   protected long checkNetp4AcqDbMaxLimit(long number) {

        return checkMaxLimit(number , Long.MAX_VALUE/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshNetp4AcqDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshNetp4AcqDb() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginNetp4AcqDb
			                 ,NETP_4_ACQ_DB_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("netp4AcqDb", beginNetp4AcqDb,NETP_4_ACQ_DB_LEN);
    }
   	}
     int localNetp4AcqCrCounter = -1;
     public boolean isNetp4AcqCrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNetp4AcqCrCounter != sharedCounter;
         localNetp4AcqCrCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of netp4AcqCr
	 *	@return netp4AcqCr
	 */
	public char[]  getNetp4AcqCrString() {
	     return getCharArray(beginNetp4AcqCr,NETP_4_ACQ_CR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean netp4AcqCrIsNumeric() {
	    return isNumeric(beginNetp4AcqCr
	                    ,beginNetp4AcqCr + NETP_4_ACQ_CR_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int NETP_4_ACQ_CR_LEN = 22;
  	/**
	 * serializeNetp4AcqCr
	 */
	protected void serializeNetp4AcqCr(long netp4AcqCr) {
		 putNumber(beginNetp4AcqCr,netp4AcqCr,NETP_4_ACQ_CR_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localNetp4AcqCrCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeNetp4AcqCr
	 */
   	protected  long serializeNetp4AcqCr(char[] value) {
	    long  netp4AcqCr;
	    if(value.length >0 && value.length!= 22)
            value = new String(value).trim().toCharArray();
	    if (value.length < 22) value = pad(22, value, ' ', LEFT_PAD);
	    else if (value.length > 22) value = substring(value,0,22);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    netp4AcqCr = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(22,value,true/*isSigned?*/)
		       ,beginNetp4AcqCr
		       ,22
		      );
		 localNetp4AcqCrCounter = shareString.getSerializedField().getModifiedCounter();
		return  netp4AcqCr;
    }

   protected long checkNetp4AcqCrMaxLimit(long number) {

        return checkMaxLimit(number , Long.MAX_VALUE/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshNetp4AcqCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshNetp4AcqCr() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginNetp4AcqCr
			                 ,NETP_4_ACQ_CR_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("netp4AcqCr", beginNetp4AcqCr,NETP_4_ACQ_CR_LEN);
    }
   	}
     int localNetp4AcqTotCounter = -1;
     public boolean isNetp4AcqTotModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNetp4AcqTotCounter != sharedCounter;
         localNetp4AcqTotCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of netp4AcqTot
	 *	@return netp4AcqTot
	 */
	public char[]  getNetp4AcqTotString() {
	     return getCharArray(beginNetp4AcqTot,NETP_4_ACQ_TOT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean netp4AcqTotIsNumeric() {
	    return isNumeric(beginNetp4AcqTot
	                    ,beginNetp4AcqTot + NETP_4_ACQ_TOT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int NETP_4_ACQ_TOT_LEN = 22;
  	/**
	 * serializeNetp4AcqTot
	 */
	protected void serializeNetp4AcqTot(long netp4AcqTot) {
		 putNumber(beginNetp4AcqTot,netp4AcqTot,NETP_4_ACQ_TOT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localNetp4AcqTotCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeNetp4AcqTot
	 */
   	protected  long serializeNetp4AcqTot(char[] value) {
	    long  netp4AcqTot;
	    if(value.length >0 && value.length!= 22)
            value = new String(value).trim().toCharArray();
	    if (value.length < 22) value = pad(22, value, ' ', LEFT_PAD);
	    else if (value.length > 22) value = substring(value,0,22);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    netp4AcqTot = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(22,value,true/*isSigned?*/)
		       ,beginNetp4AcqTot
		       ,22
		      );
		 localNetp4AcqTotCounter = shareString.getSerializedField().getModifiedCounter();
		return  netp4AcqTot;
    }

   protected long checkNetp4AcqTotMaxLimit(long number) {

        return checkMaxLimit(number , Long.MAX_VALUE/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshNetp4AcqTot is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshNetp4AcqTot() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginNetp4AcqTot
			                 ,NETP_4_ACQ_TOT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("netp4AcqTot", beginNetp4AcqTot,NETP_4_ACQ_TOT_LEN);
    }
   	}
     int localNetp4IssDbCounter = -1;
     public boolean isNetp4IssDbModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNetp4IssDbCounter != sharedCounter;
         localNetp4IssDbCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of netp4IssDb
	 *	@return netp4IssDb
	 */
	public char[]  getNetp4IssDbString() {
	     return getCharArray(beginNetp4IssDb,NETP_4_ISS_DB_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean netp4IssDbIsNumeric() {
	    return isNumeric(beginNetp4IssDb
	                    ,beginNetp4IssDb + NETP_4_ISS_DB_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int NETP_4_ISS_DB_LEN = 22;
  	/**
	 * serializeNetp4IssDb
	 */
	protected void serializeNetp4IssDb(long netp4IssDb) {
		 putNumber(beginNetp4IssDb,netp4IssDb,NETP_4_ISS_DB_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localNetp4IssDbCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeNetp4IssDb
	 */
   	protected  long serializeNetp4IssDb(char[] value) {
	    long  netp4IssDb;
	    if(value.length >0 && value.length!= 22)
            value = new String(value).trim().toCharArray();
	    if (value.length < 22) value = pad(22, value, ' ', LEFT_PAD);
	    else if (value.length > 22) value = substring(value,0,22);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    netp4IssDb = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(22,value,true/*isSigned?*/)
		       ,beginNetp4IssDb
		       ,22
		      );
		 localNetp4IssDbCounter = shareString.getSerializedField().getModifiedCounter();
		return  netp4IssDb;
    }

   protected long checkNetp4IssDbMaxLimit(long number) {

        return checkMaxLimit(number , Long.MAX_VALUE/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshNetp4IssDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshNetp4IssDb() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginNetp4IssDb
			                 ,NETP_4_ISS_DB_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("netp4IssDb", beginNetp4IssDb,NETP_4_ISS_DB_LEN);
    }
   	}
     int localNetp4IssCrCounter = -1;
     public boolean isNetp4IssCrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNetp4IssCrCounter != sharedCounter;
         localNetp4IssCrCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of netp4IssCr
	 *	@return netp4IssCr
	 */
	public char[]  getNetp4IssCrString() {
	     return getCharArray(beginNetp4IssCr,NETP_4_ISS_CR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean netp4IssCrIsNumeric() {
	    return isNumeric(beginNetp4IssCr
	                    ,beginNetp4IssCr + NETP_4_ISS_CR_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int NETP_4_ISS_CR_LEN = 22;
  	/**
	 * serializeNetp4IssCr
	 */
	protected void serializeNetp4IssCr(long netp4IssCr) {
		 putNumber(beginNetp4IssCr,netp4IssCr,NETP_4_ISS_CR_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localNetp4IssCrCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeNetp4IssCr
	 */
   	protected  long serializeNetp4IssCr(char[] value) {
	    long  netp4IssCr;
	    if(value.length >0 && value.length!= 22)
            value = new String(value).trim().toCharArray();
	    if (value.length < 22) value = pad(22, value, ' ', LEFT_PAD);
	    else if (value.length > 22) value = substring(value,0,22);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    netp4IssCr = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(22,value,true/*isSigned?*/)
		       ,beginNetp4IssCr
		       ,22
		      );
		 localNetp4IssCrCounter = shareString.getSerializedField().getModifiedCounter();
		return  netp4IssCr;
    }

   protected long checkNetp4IssCrMaxLimit(long number) {

        return checkMaxLimit(number , Long.MAX_VALUE/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshNetp4IssCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshNetp4IssCr() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginNetp4IssCr
			                 ,NETP_4_ISS_CR_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("netp4IssCr", beginNetp4IssCr,NETP_4_ISS_CR_LEN);
    }
   	}
     int localNetp4IssTotCounter = -1;
     public boolean isNetp4IssTotModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNetp4IssTotCounter != sharedCounter;
         localNetp4IssTotCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of netp4IssTot
	 *	@return netp4IssTot
	 */
	public char[]  getNetp4IssTotString() {
	     return getCharArray(beginNetp4IssTot,NETP_4_ISS_TOT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean netp4IssTotIsNumeric() {
	    return isNumeric(beginNetp4IssTot
	                    ,beginNetp4IssTot + NETP_4_ISS_TOT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int NETP_4_ISS_TOT_LEN = 22;
  	/**
	 * serializeNetp4IssTot
	 */
	protected void serializeNetp4IssTot(long netp4IssTot) {
		 putNumber(beginNetp4IssTot,netp4IssTot,NETP_4_ISS_TOT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localNetp4IssTotCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeNetp4IssTot
	 */
   	protected  long serializeNetp4IssTot(char[] value) {
	    long  netp4IssTot;
	    if(value.length >0 && value.length!= 22)
            value = new String(value).trim().toCharArray();
	    if (value.length < 22) value = pad(22, value, ' ', LEFT_PAD);
	    else if (value.length > 22) value = substring(value,0,22);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    netp4IssTot = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(22,value,true/*isSigned?*/)
		       ,beginNetp4IssTot
		       ,22
		      );
		 localNetp4IssTotCounter = shareString.getSerializedField().getModifiedCounter();
		return  netp4IssTot;
    }

   protected long checkNetp4IssTotMaxLimit(long number) {

        return checkMaxLimit(number , Long.MAX_VALUE/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshNetp4IssTot is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshNetp4IssTot() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginNetp4IssTot
			                 ,NETP_4_ISS_TOT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("netp4IssTot", beginNetp4IssTot,NETP_4_ISS_TOT_LEN);
    }
   	}
     int localNetp4AchTotCounter = -1;
     public boolean isNetp4AchTotModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNetp4AchTotCounter != sharedCounter;
         localNetp4AchTotCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of netp4AchTot
	 *	@return netp4AchTot
	 */
	public char[]  getNetp4AchTotString() {
	     return getCharArray(beginNetp4AchTot,NETP_4_ACH_TOT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean netp4AchTotIsNumeric() {
	    return isNumeric(beginNetp4AchTot
	                    ,beginNetp4AchTot + NETP_4_ACH_TOT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int NETP_4_ACH_TOT_LEN = 22;
  	/**
	 * serializeNetp4AchTot
	 */
	protected void serializeNetp4AchTot(long netp4AchTot) {
		 putNumber(beginNetp4AchTot,netp4AchTot,NETP_4_ACH_TOT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localNetp4AchTotCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeNetp4AchTot
	 */
   	protected  long serializeNetp4AchTot(char[] value) {
	    long  netp4AchTot;
	    if(value.length >0 && value.length!= 22)
            value = new String(value).trim().toCharArray();
	    if (value.length < 22) value = pad(22, value, ' ', LEFT_PAD);
	    else if (value.length > 22) value = substring(value,0,22);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    netp4AchTot = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(22,value,true/*isSigned?*/)
		       ,beginNetp4AchTot
		       ,22
		      );
		 localNetp4AchTotCounter = shareString.getSerializedField().getModifiedCounter();
		return  netp4AchTot;
    }

   protected long checkNetp4AchTotMaxLimit(long number) {

        return checkMaxLimit(number , Long.MAX_VALUE/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshNetp4AchTot is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshNetp4AchTot() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginNetp4AchTot
			                 ,NETP_4_ACH_TOT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("netp4AchTot", beginNetp4AchTot,NETP_4_ACH_TOT_LEN);
    }
   	}
     int localSavSetlTypCounter = -1;
     public boolean isSavSetlTypModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSavSetlTypCounter != sharedCounter;
         localSavSetlTypCounter = sharedCounter; return hasModified;
     }

   protected char[] checkSavSetlTypConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localSavProcDescCounter = -1;
     public boolean isSavProcDescModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSavProcDescCounter != sharedCounter;
         localSavProcDescCounter = sharedCounter; return hasModified;
     }

   protected char[] checkSavProcDescConstraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
     int localCurProcDescCounter = -1;
     public boolean isCurProcDescModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurProcDescCounter != sharedCounter;
         localCurProcDescCounter = sharedCounter; return hasModified;
     }

   protected char[] checkCurProcDescConstraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
     int localSavInstDescCounter = -1;
     public boolean isSavInstDescModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSavInstDescCounter != sharedCounter;
         localSavInstDescCounter = sharedCounter; return hasModified;
     }

   protected char[] checkSavInstDescConstraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
     int localCurInstDescCounter = -1;
     public boolean isCurInstDescModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurInstDescCounter != sharedCounter;
         localCurInstDescCounter = sharedCounter; return hasModified;
     }

   protected char[] checkCurInstDescConstraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
     int localHldAcqIssIdCounter = -1;
     public boolean isHldAcqIssIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHldAcqIssIdCounter != sharedCounter;
         localHldAcqIssIdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of hldAcqIssId
	 *	@return hldAcqIssId
	 */
	public char[]  getHldAcqIssIdString() {
	     return getCharArray(beginHldAcqIssId,HLD_ACQ_ISS_ID_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean hldAcqIssIdIsNumeric() {
	    return isNumeric(beginHldAcqIssId
	                    ,beginHldAcqIssId + HLD_ACQ_ISS_ID_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int HLD_ACQ_ISS_ID_LEN = 1;
  	/**
	 * serializeHldAcqIssId
	 */
	protected void serializeHldAcqIssId(int hldAcqIssId) {
		 putNumber(beginHldAcqIssId,hldAcqIssId,HLD_ACQ_ISS_ID_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localHldAcqIssIdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeHldAcqIssId
	 */
   	protected  int serializeHldAcqIssId(char[] value) {
	    int  hldAcqIssId;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    hldAcqIssId = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginHldAcqIssId
		       ,1
		      );
		 localHldAcqIssIdCounter = shareString.getSerializedField().getModifiedCounter();
		return  hldAcqIssId;
    }

   protected int checkHldAcqIssIdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshHldAcqIssId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshHldAcqIssId() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginHldAcqIssId
			                 ,HLD_ACQ_ISS_ID_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("hldAcqIssId", beginHldAcqIssId,HLD_ACQ_ISS_ID_LEN);
    }
   	}
     int localSavAcqIssIdCounter = -1;
     public boolean isSavAcqIssIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSavAcqIssIdCounter != sharedCounter;
         localSavAcqIssIdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of savAcqIssId
	 *	@return savAcqIssId
	 */
	public char[]  getSavAcqIssIdString() {
	     return getCharArray(beginSavAcqIssId,SAV_ACQ_ISS_ID_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean savAcqIssIdIsNumeric() {
	    return isNumeric(beginSavAcqIssId
	                    ,beginSavAcqIssId + SAV_ACQ_ISS_ID_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SAV_ACQ_ISS_ID_LEN = 1;
  	/**
	 * serializeSavAcqIssId
	 */
	protected void serializeSavAcqIssId(int savAcqIssId) {
		 putNumber(beginSavAcqIssId,savAcqIssId,SAV_ACQ_ISS_ID_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSavAcqIssIdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSavAcqIssId
	 */
   	protected  int serializeSavAcqIssId(char[] value) {
	    int  savAcqIssId;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    savAcqIssId = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginSavAcqIssId
		       ,1
		      );
		 localSavAcqIssIdCounter = shareString.getSerializedField().getModifiedCounter();
		return  savAcqIssId;
    }

   protected int checkSavAcqIssIdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSavAcqIssId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSavAcqIssId() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginSavAcqIssId
			                 ,SAV_ACQ_ISS_ID_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("savAcqIssId", beginSavAcqIssId,SAV_ACQ_ISS_ID_LEN);
    }
   	}
     int localCurAcqIssIdCounter = -1;
     public boolean isCurAcqIssIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurAcqIssIdCounter != sharedCounter;
         localCurAcqIssIdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of curAcqIssId
	 *	@return curAcqIssId
	 */
	public char[]  getCurAcqIssIdString() {
	     return getCharArray(beginCurAcqIssId,CUR_ACQ_ISS_ID_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean curAcqIssIdIsNumeric() {
	    return isNumeric(beginCurAcqIssId
	                    ,beginCurAcqIssId + CUR_ACQ_ISS_ID_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CUR_ACQ_ISS_ID_LEN = 1;
  	/**
	 * serializeCurAcqIssId
	 */
	protected void serializeCurAcqIssId(int curAcqIssId) {
		 putNumber(beginCurAcqIssId,curAcqIssId,CUR_ACQ_ISS_ID_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCurAcqIssIdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCurAcqIssId
	 */
   	protected  int serializeCurAcqIssId(char[] value) {
	    int  curAcqIssId;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    curAcqIssId = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginCurAcqIssId
		       ,1
		      );
		 localCurAcqIssIdCounter = shareString.getSerializedField().getModifiedCounter();
		return  curAcqIssId;
    }

   protected int checkCurAcqIssIdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCurAcqIssId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCurAcqIssId() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCurAcqIssId
			                 ,CUR_ACQ_ISS_ID_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("curAcqIssId", beginCurAcqIssId,CUR_ACQ_ISS_ID_LEN);
    }
   	}
     int localCurrSetlTypCounter = -1;
     public boolean isCurrSetlTypModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrSetlTypCounter != sharedCounter;
         localCurrSetlTypCounter = sharedCounter; return hasModified;
     }

   protected char[] checkCurrSetlTypConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localSavMbrEndpointCounter = -1;
     public boolean isSavMbrEndpointModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSavMbrEndpointCounter != sharedCounter;
         localSavMbrEndpointCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of savMbrEndpoint
	 *	@return savMbrEndpoint
	 */
	public char[]  getSavMbrEndpointString() {
	     return getCharArray(beginSavMbrEndpoint,SAV_MBR_ENDPOINT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean savMbrEndpointIsNumeric() {
	    return isNumeric(beginSavMbrEndpoint
	                    ,beginSavMbrEndpoint + SAV_MBR_ENDPOINT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SAV_MBR_ENDPOINT_LEN = 7;
  	/**
	 * serializeSavMbrEndpoint
	 */
	protected void serializeSavMbrEndpoint(long savMbrEndpoint) {
		 putNumber(beginSavMbrEndpoint,savMbrEndpoint,SAV_MBR_ENDPOINT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSavMbrEndpointCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSavMbrEndpoint
	 */
   	protected  long serializeSavMbrEndpoint(char[] value) {
	    long  savMbrEndpoint;
	    if(value.length >0 && value.length!= 7)
            value = new String(value).trim().toCharArray();
	    if (value.length < 7) value = pad(7, value, ' ', LEFT_PAD);
	    else if (value.length > 7) value = substring(value,0,7);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    savMbrEndpoint = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(7,value,false/*isSigned?*/)
		       ,beginSavMbrEndpoint
		       ,7
		      );
		 localSavMbrEndpointCounter = shareString.getSerializedField().getModifiedCounter();
		return  savMbrEndpoint;
    }

   protected long checkSavMbrEndpointMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSavMbrEndpoint is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSavMbrEndpoint() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSavMbrEndpoint
			                 ,SAV_MBR_ENDPOINT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("savMbrEndpoint", beginSavMbrEndpoint,SAV_MBR_ENDPOINT_LEN);
    }
   	}
     int localCurMbrEndpointCounter = -1;
     public boolean isCurMbrEndpointModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurMbrEndpointCounter != sharedCounter;
         localCurMbrEndpointCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of curMbrEndpoint
	 *	@return curMbrEndpoint
	 */
	public char[]  getCurMbrEndpointString() {
	     return getCharArray(beginCurMbrEndpoint,CUR_MBR_ENDPOINT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean curMbrEndpointIsNumeric() {
	    return isNumeric(beginCurMbrEndpoint
	                    ,beginCurMbrEndpoint + CUR_MBR_ENDPOINT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CUR_MBR_ENDPOINT_LEN = 7;
  	/**
	 * serializeCurMbrEndpoint
	 */
	protected void serializeCurMbrEndpoint(long curMbrEndpoint) {
		 putNumber(beginCurMbrEndpoint,curMbrEndpoint,CUR_MBR_ENDPOINT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCurMbrEndpointCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCurMbrEndpoint
	 */
   	protected  long serializeCurMbrEndpoint(char[] value) {
	    long  curMbrEndpoint;
	    if(value.length >0 && value.length!= 7)
            value = new String(value).trim().toCharArray();
	    if (value.length < 7) value = pad(7, value, ' ', LEFT_PAD);
	    else if (value.length > 7) value = substring(value,0,7);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    curMbrEndpoint = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(7,value,false/*isSigned?*/)
		       ,beginCurMbrEndpoint
		       ,7
		      );
		 localCurMbrEndpointCounter = shareString.getSerializedField().getModifiedCounter();
		return  curMbrEndpoint;
    }

   protected long checkCurMbrEndpointMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCurMbrEndpoint is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshCurMbrEndpoint() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginCurMbrEndpoint
			                 ,CUR_MBR_ENDPOINT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("curMbrEndpoint", beginCurMbrEndpoint,CUR_MBR_ENDPOINT_LEN);
    }
   	}
     int localSavMbrEntIcaCounter = -1;
     public boolean isSavMbrEntIcaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSavMbrEntIcaCounter != sharedCounter;
         localSavMbrEntIcaCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of savMbrEntIca
	 *	@return savMbrEntIca
	 */
	public char[]  getSavMbrEntIcaString() {
	     return getCharArray(beginSavMbrEntIca,SAV_MBR_ENT_ICA_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean savMbrEntIcaIsNumeric() {
	    return isNumeric(beginSavMbrEntIca
	                    ,beginSavMbrEntIca + SAV_MBR_ENT_ICA_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SAV_MBR_ENT_ICA_LEN = 6;
  	/**
	 * serializeSavMbrEntIca
	 */
	protected void serializeSavMbrEntIca(long savMbrEntIca) {
		 putNumber(beginSavMbrEntIca,savMbrEntIca,SAV_MBR_ENT_ICA_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSavMbrEntIcaCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSavMbrEntIca
	 */
   	protected  long serializeSavMbrEntIca(char[] value) {
	    long  savMbrEntIca;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    savMbrEntIca = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginSavMbrEntIca
		       ,6
		      );
		 localSavMbrEntIcaCounter = shareString.getSerializedField().getModifiedCounter();
		return  savMbrEntIca;
    }

   protected long checkSavMbrEntIcaMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSavMbrEntIca is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSavMbrEntIca() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSavMbrEntIca
			                 ,SAV_MBR_ENT_ICA_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("savMbrEntIca", beginSavMbrEntIca,SAV_MBR_ENT_ICA_LEN);
    }
   	}
     int localCurMbrEntIcaCounter = -1;
     public boolean isCurMbrEntIcaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurMbrEntIcaCounter != sharedCounter;
         localCurMbrEntIcaCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of curMbrEntIca
	 *	@return curMbrEntIca
	 */
	public char[]  getCurMbrEntIcaString() {
	     return getCharArray(beginCurMbrEntIca,CUR_MBR_ENT_ICA_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean curMbrEntIcaIsNumeric() {
	    return isNumeric(beginCurMbrEntIca
	                    ,beginCurMbrEntIca + CUR_MBR_ENT_ICA_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CUR_MBR_ENT_ICA_LEN = 6;
  	/**
	 * serializeCurMbrEntIca
	 */
	protected void serializeCurMbrEntIca(long curMbrEntIca) {
		 putNumber(beginCurMbrEntIca,curMbrEntIca,CUR_MBR_ENT_ICA_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCurMbrEntIcaCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCurMbrEntIca
	 */
   	protected  long serializeCurMbrEntIca(char[] value) {
	    long  curMbrEntIca;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    curMbrEntIca = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginCurMbrEntIca
		       ,6
		      );
		 localCurMbrEntIcaCounter = shareString.getSerializedField().getModifiedCounter();
		return  curMbrEntIca;
    }

   protected long checkCurMbrEntIcaMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCurMbrEntIca is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshCurMbrEntIca() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginCurMbrEntIca
			                 ,CUR_MBR_ENT_ICA_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("curMbrEntIca", beginCurMbrEntIca,CUR_MBR_ENT_ICA_LEN);
    }
   	}
     int localSavMbrMbrIcaCounter = -1;
     public boolean isSavMbrMbrIcaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSavMbrMbrIcaCounter != sharedCounter;
         localSavMbrMbrIcaCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of savMbrMbrIca
	 *	@return savMbrMbrIca
	 */
	public char[]  getSavMbrMbrIcaString() {
	     return getCharArray(beginSavMbrMbrIca,SAV_MBR_MBR_ICA_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean savMbrMbrIcaIsNumeric() {
	    return isNumeric(beginSavMbrMbrIca
	                    ,beginSavMbrMbrIca + SAV_MBR_MBR_ICA_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SAV_MBR_MBR_ICA_LEN = 6;
  	/**
	 * serializeSavMbrMbrIca
	 */
	protected void serializeSavMbrMbrIca(long savMbrMbrIca) {
		 putNumber(beginSavMbrMbrIca,savMbrMbrIca,SAV_MBR_MBR_ICA_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSavMbrMbrIcaCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSavMbrMbrIca
	 */
   	protected  long serializeSavMbrMbrIca(char[] value) {
	    long  savMbrMbrIca;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    savMbrMbrIca = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginSavMbrMbrIca
		       ,6
		      );
		 localSavMbrMbrIcaCounter = shareString.getSerializedField().getModifiedCounter();
		return  savMbrMbrIca;
    }

   protected long checkSavMbrMbrIcaMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSavMbrMbrIca is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSavMbrMbrIca() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSavMbrMbrIca
			                 ,SAV_MBR_MBR_ICA_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("savMbrMbrIca", beginSavMbrMbrIca,SAV_MBR_MBR_ICA_LEN);
    }
   	}
     int localCurMbrMbrIcaCounter = -1;
     public boolean isCurMbrMbrIcaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurMbrMbrIcaCounter != sharedCounter;
         localCurMbrMbrIcaCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of curMbrMbrIca
	 *	@return curMbrMbrIca
	 */
	public char[]  getCurMbrMbrIcaString() {
	     return getCharArray(beginCurMbrMbrIca,CUR_MBR_MBR_ICA_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean curMbrMbrIcaIsNumeric() {
	    return isNumeric(beginCurMbrMbrIca
	                    ,beginCurMbrMbrIca + CUR_MBR_MBR_ICA_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CUR_MBR_MBR_ICA_LEN = 6;
  	/**
	 * serializeCurMbrMbrIca
	 */
	protected void serializeCurMbrMbrIca(long curMbrMbrIca) {
		 putNumber(beginCurMbrMbrIca,curMbrMbrIca,CUR_MBR_MBR_ICA_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCurMbrMbrIcaCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCurMbrMbrIca
	 */
   	protected  long serializeCurMbrMbrIca(char[] value) {
	    long  curMbrMbrIca;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    curMbrMbrIca = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginCurMbrMbrIca
		       ,6
		      );
		 localCurMbrMbrIcaCounter = shareString.getSerializedField().getModifiedCounter();
		return  curMbrMbrIca;
    }

   protected long checkCurMbrMbrIcaMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCurMbrMbrIca is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshCurMbrMbrIca() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginCurMbrMbrIca
			                 ,CUR_MBR_MBR_ICA_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("curMbrMbrIca", beginCurMbrMbrIca,CUR_MBR_MBR_ICA_LEN);
    }
   	}
     int localSavApcIcaCounter = -1;
     public boolean isSavApcIcaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSavApcIcaCounter != sharedCounter;
         localSavApcIcaCounter = sharedCounter; return hasModified;
     }

   protected char[] checkSavApcIcaConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
     int localApcTotAmountCounter = -1;
     
     public boolean isApcTotAmountModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localApcTotAmountCounter != sharedCounter;
         localApcTotAmountCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of apcTotAmount
	 *	@return apcTotAmount
	 */
	public char[]  getApcTotAmountString() {
	    return getCharArray(beginApcTotAmount,APC_TOT_AMOUNT_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean apcTotAmountIsNumeric() {
		    return isNumeric(beginApcTotAmount
	                    ,beginApcTotAmount + APC_TOT_AMOUNT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int APC_TOT_AMOUNT_LEN = 17;
  protected  static final int APC_TOT_AMOUNT_SCALE = 2;

   protected BigDecimal checkApcTotAmountMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,17/*precision*/);
   }

  	/**
	 * serializeApcTotAmount
	 */
	protected void serializeApcTotAmount(BigDecimal apcTotAmount) {
	       putNumber(beginApcTotAmount,apcTotAmount,APC_TOT_AMOUNT_LEN,APC_TOT_AMOUNT_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localApcTotAmountCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeApcTotAmount
	 */
   	protected  BigDecimal serializeApcTotAmount(char[] value) throws CFException {
        if (value.length < 17) value = pad(17, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(17,value,true/*isSigned?*/)
		       ,beginApcTotAmount
		       ,17
		      );		 localApcTotAmountCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,APC_TOT_AMOUNT_LEN,APC_TOT_AMOUNT_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("apcTotAmount", beginApcTotAmount,APC_TOT_AMOUNT_LEN);
    	}
    }
    /**
	 *	refreshApcTotAmount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshApcTotAmount() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginApcTotAmount
			            ,APC_TOT_AMOUNT_LEN
			            ,APC_TOT_AMOUNT_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("apcTotAmount", beginApcTotAmount,APC_TOT_AMOUNT_LEN);
    }
   	}
     int localApcTotCrAmountCounter = -1;
     
     public boolean isApcTotCrAmountModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localApcTotCrAmountCounter != sharedCounter;
         localApcTotCrAmountCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of apcTotCrAmount
	 *	@return apcTotCrAmount
	 */
	public char[]  getApcTotCrAmountString() {
	    return getCharArray(beginApcTotCrAmount,APC_TOT_CR_AMOUNT_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean apcTotCrAmountIsNumeric() {
		    return isNumeric(beginApcTotCrAmount
	                    ,beginApcTotCrAmount + APC_TOT_CR_AMOUNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int APC_TOT_CR_AMOUNT_LEN = 20;
  protected  static final int APC_TOT_CR_AMOUNT_SCALE = 5;

   protected BigDecimal checkApcTotCrAmountMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,5/*scale*/,20/*precision*/);
   }

  	/**
	 * serializeApcTotCrAmount
	 */
	protected void serializeApcTotCrAmount(BigDecimal apcTotCrAmount) {
	       putNumber(beginApcTotCrAmount,apcTotCrAmount,APC_TOT_CR_AMOUNT_LEN,APC_TOT_CR_AMOUNT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localApcTotCrAmountCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeApcTotCrAmount
	 */
   	protected  BigDecimal serializeApcTotCrAmount(char[] value) throws CFException {
        if (value.length < 20) value = pad(20, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(20,value,false/*isSigned?*/)
		       ,beginApcTotCrAmount
		       ,20
		      );		 localApcTotCrAmountCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,APC_TOT_CR_AMOUNT_LEN,APC_TOT_CR_AMOUNT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("apcTotCrAmount", beginApcTotCrAmount,APC_TOT_CR_AMOUNT_LEN);
    	}
    }
    /**
	 *	refreshApcTotCrAmount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshApcTotCrAmount() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginApcTotCrAmount
			            ,APC_TOT_CR_AMOUNT_LEN
			            ,APC_TOT_CR_AMOUNT_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("apcTotCrAmount", beginApcTotCrAmount,APC_TOT_CR_AMOUNT_LEN);
    }
   	}
     int localApcTotDrAmountCounter = -1;
     
     public boolean isApcTotDrAmountModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localApcTotDrAmountCounter != sharedCounter;
         localApcTotDrAmountCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of apcTotDrAmount
	 *	@return apcTotDrAmount
	 */
	public char[]  getApcTotDrAmountString() {
	    return getCharArray(beginApcTotDrAmount,APC_TOT_DR_AMOUNT_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean apcTotDrAmountIsNumeric() {
		    return isNumeric(beginApcTotDrAmount
	                    ,beginApcTotDrAmount + APC_TOT_DR_AMOUNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int APC_TOT_DR_AMOUNT_LEN = 20;
  protected  static final int APC_TOT_DR_AMOUNT_SCALE = 5;

   protected BigDecimal checkApcTotDrAmountMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,5/*scale*/,20/*precision*/);
   }

  	/**
	 * serializeApcTotDrAmount
	 */
	protected void serializeApcTotDrAmount(BigDecimal apcTotDrAmount) {
	       putNumber(beginApcTotDrAmount,apcTotDrAmount,APC_TOT_DR_AMOUNT_LEN,APC_TOT_DR_AMOUNT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localApcTotDrAmountCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeApcTotDrAmount
	 */
   	protected  BigDecimal serializeApcTotDrAmount(char[] value) throws CFException {
        if (value.length < 20) value = pad(20, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(20,value,false/*isSigned?*/)
		       ,beginApcTotDrAmount
		       ,20
		      );		 localApcTotDrAmountCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,APC_TOT_DR_AMOUNT_LEN,APC_TOT_DR_AMOUNT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("apcTotDrAmount", beginApcTotDrAmount,APC_TOT_DR_AMOUNT_LEN);
    	}
    }
    /**
	 *	refreshApcTotDrAmount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshApcTotDrAmount() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginApcTotDrAmount
			            ,APC_TOT_DR_AMOUNT_LEN
			            ,APC_TOT_DR_AMOUNT_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("apcTotDrAmount", beginApcTotDrAmount,APC_TOT_DR_AMOUNT_LEN);
    }
   	}
     int localFirstRecordCounter = -1;
     public boolean isFirstRecordModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFirstRecordCounter != sharedCounter;
         localFirstRecordCounter = sharedCounter; return hasModified;
     }

   protected char[] checkFirstRecordConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localNoActLineCounter = -1;
     public boolean isNoActLineModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNoActLineCounter != sharedCounter;
         localNoActLineCounter = sharedCounter; return hasModified;
     }

   protected char[] checkNoActLineConstraints(char[] value) {
   			return super.checkConstraints(value , 132 ,false, false);
   }
     int localNoActivitySwCounter = -1;
     public boolean isNoActivitySwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNoActivitySwCounter != sharedCounter;
         localNoActivitySwCounter = sharedCounter; return hasModified;
     }

   protected char[] checkNoActivitySwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localMissingActivitySwCounter = -1;
     public boolean isMissingActivitySwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMissingActivitySwCounter != sharedCounter;
         localMissingActivitySwCounter = sharedCounter; return hasModified;
     }

   protected char[] checkMissingActivitySwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localProdNdxCounter = -1;
     public boolean isProdNdxModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localProdNdxCounter != sharedCounter;
         localProdNdxCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of prodNdx
	 *	@return prodNdx
	 */
	public char[]  getProdNdxString() {
	     return getCharArray(beginProdNdx,PROD_NDX_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean prodNdxIsNumeric() {
	    return isNumeric(beginProdNdx
	                    ,beginProdNdx + PROD_NDX_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PROD_NDX_LEN = 2;
  	/**
	 * serializeProdNdx
	 */
	protected void serializeProdNdx(int prodNdx) {
		 putNumber(beginProdNdx,prodNdx,PROD_NDX_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localProdNdxCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeProdNdx
	 */
   	protected  int serializeProdNdx(char[] value) {
	    int  prodNdx;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    prodNdx = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginProdNdx
		       ,2
		      );
		 localProdNdxCounter = shareString.getSerializedField().getModifiedCounter();
		return  prodNdx;
    }

   protected int checkProdNdxMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshProdNdx is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshProdNdx() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginProdNdx
			                 ,PROD_NDX_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("prodNdx", beginProdNdx,PROD_NDX_LEN);
    }
   	}
     int localNdxMaxCounter = -1;
     public boolean isNdxMaxModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNdxMaxCounter != sharedCounter;
         localNdxMaxCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ndxMax
	 *	@return ndxMax
	 */
	public char[]  getNdxMaxString() {
	     return getCharArray(beginNdxMax,NDX_MAX_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ndxMaxIsNumeric() {
	    return isNumeric(beginNdxMax
	                    ,beginNdxMax + NDX_MAX_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int NDX_MAX_LEN = 3;
  	/**
	 * serializeNdxMax
	 */
	protected void serializeNdxMax(int ndxMax) {
		 putNumber(beginNdxMax,ndxMax,NDX_MAX_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localNdxMaxCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeNdxMax
	 */
   	protected  int serializeNdxMax(char[] value) {
	    int  ndxMax;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ndxMax = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginNdxMax
		       ,3
		      );
		 localNdxMaxCounter = shareString.getSerializedField().getModifiedCounter();
		return  ndxMax;
    }

   protected int checkNdxMaxMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshNdxMax is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshNdxMax() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginNdxMax
			                 ,NDX_MAX_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ndxMax", beginNdxMax,NDX_MAX_LEN);
    }
   	}
     int localNdxCounter = -1;
     public boolean isNdxModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNdxCounter != sharedCounter;
         localNdxCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ndx
	 *	@return ndx
	 */
	public char[]  getNdxString() {
	     return getCharArray(beginNdx,NDX_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ndxIsNumeric() {
	    return isNumeric(beginNdx
	                    ,beginNdx + NDX_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int NDX_LEN = 3;
  	/**
	 * serializeNdx
	 */
	protected void serializeNdx(int ndx) {
		 putNumber(beginNdx,ndx,NDX_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localNdxCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeNdx
	 */
   	protected  int serializeNdx(char[] value) {
	    int  ndx;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ndx = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginNdx
		       ,3
		      );
		 localNdxCounter = shareString.getSerializedField().getModifiedCounter();
		return  ndx;
    }

   protected int checkNdxMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshNdx is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshNdx() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginNdx
			                 ,NDX_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ndx", beginNdx,NDX_LEN);
    }
   	}
     int localCurNdxCounter = -1;
     public boolean isCurNdxModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurNdxCounter != sharedCounter;
         localCurNdxCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of curNdx
	 *	@return curNdx
	 */
	public char[]  getCurNdxString() {
	     return getCharArray(beginCurNdx,CUR_NDX_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean curNdxIsNumeric() {
	    return isNumeric(beginCurNdx
	                    ,beginCurNdx + CUR_NDX_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CUR_NDX_LEN = 3;
  	/**
	 * serializeCurNdx
	 */
	protected void serializeCurNdx(int curNdx) {
		 putNumber(beginCurNdx,curNdx,CUR_NDX_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCurNdxCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCurNdx
	 */
   	protected  int serializeCurNdx(char[] value) {
	    int  curNdx;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    curNdx = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginCurNdx
		       ,3
		      );
		 localCurNdxCounter = shareString.getSerializedField().getModifiedCounter();
		return  curNdx;
    }

   protected int checkCurNdxMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCurNdx is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCurNdx() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCurNdx
			                 ,CUR_NDX_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("curNdx", beginCurNdx,CUR_NDX_LEN);
    }
   	}
     int localApcInxCounter = -1;
     public boolean isApcInxModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localApcInxCounter != sharedCounter;
         localApcInxCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of apcInx
	 *	@return apcInx
	 */
	public char[]  getApcInxString() {
	     return getCharArray(beginApcInx,APC_INX_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean apcInxIsNumeric() {
	    return isNumeric(beginApcInx
	                    ,beginApcInx + APC_INX_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int APC_INX_LEN = 5;
  	/**
	 * serializeApcInx
	 */
	protected void serializeApcInx(long apcInx) {
		 putNumber(beginApcInx,apcInx,APC_INX_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localApcInxCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeApcInx
	 */
   	protected  long serializeApcInx(char[] value) {
	    long  apcInx;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    apcInx = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginApcInx
		       ,5
		      );
		 localApcInxCounter = shareString.getSerializedField().getModifiedCounter();
		return  apcInx;
    }

   protected long checkApcInxMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshApcInx is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshApcInx() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginApcInx
			                 ,APC_INX_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("apcInx", beginApcInx,APC_INX_LEN);
    }
   	}
     int localInxCounter = -1;
     public boolean isInxModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInxCounter != sharedCounter;
         localInxCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of inx
	 *	@return inx
	 */
	public char[]  getInxString() {
	     return getCharArray(beginInx,INX_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean inxIsNumeric() {
	    return isNumeric(beginInx
	                    ,beginInx + INX_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int INX_LEN = 5;
  	/**
	 * serializeInx
	 */
	protected void serializeInx(long inx) {
		 putNumber(beginInx,inx,INX_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localInxCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeInx
	 */
   	protected  long serializeInx(char[] value) {
	    long  inx;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    inx = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginInx
		       ,5
		      );
		 localInxCounter = shareString.getSerializedField().getModifiedCounter();
		return  inx;
    }

   protected long checkInxMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshInx is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshInx() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginInx
			                 ,INX_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("inx", beginInx,INX_LEN);
    }
   	}
     int localWS2Counter = -1;
     public boolean isWS2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWS2Counter != sharedCounter;
         localWS2Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wS2
	 *	@return wS2
	 */
	public char[]  getWS2String() {
	     return getCharArray(beginWS2,W_S_2_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wS2IsNumeric() {
	    return isNumeric(beginWS2
	                    ,beginWS2 + W_S_2_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int W_S_2_LEN = 5;
  	/**
	 * serializeWS2
	 */
	protected void serializeWS2(long wS2) {
		 putNumber(beginWS2,wS2,W_S_2_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWS2Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWS2
	 */
   	protected  long serializeWS2(char[] value) {
	    long  wS2;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wS2 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginWS2
		       ,5
		      );
		 localWS2Counter = shareString.getSerializedField().getModifiedCounter();
		return  wS2;
    }

   protected long checkWS2MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWS2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshWS2() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginWS2
			                 ,W_S_2_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wS2", beginWS2,W_S_2_LEN);
    }
   	}
     int localRptTypeCounter = -1;
     public boolean isRptTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRptTypeCounter != sharedCounter;
         localRptTypeCounter = sharedCounter; return hasModified;
     }

   protected char[] checkRptTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localSystemTimeCounter = -1;
     public boolean isSystemTimeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSystemTimeCounter != sharedCounter;
         localSystemTimeCounter = sharedCounter; return hasModified;
     }

   protected char[] checkSystemTimeConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
        int localWaPageCtrCounter = -1;
        public boolean isWaPageCtrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWaPageCtrCounter != sharedCounter;
           localWaPageCtrCounter = sharedCounter; return hasModified; 
        }
	    public boolean waPageCtrIsNumeric() {
	      return decimalIsNumeric(beginWaPageCtr,WA_PAGE_CTR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int WA_PAGE_CTR_LEN = 4;
  	/**
	 * 	serializeWaPageCtr
	 */
	protected void serializeWaPageCtr(int waPageCtr) {
		   putDecimal(beginWaPageCtr,waPageCtr,WA_PAGE_CTR_LEN,true);
   }
   

   protected int checkWaPageCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_10M /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshWaPageCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWaPageCtr() throws CFException {	
   	try { 
		 return (getIntDecimal(beginWaPageCtr,WA_PAGE_CTR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("waPageCtr", beginWaPageCtr,WA_PAGE_CTR_LEN);
     }
   	}
        int localWaLineCtrCounter = -1;
        public boolean isWaLineCtrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWaLineCtrCounter != sharedCounter;
           localWaLineCtrCounter = sharedCounter; return hasModified; 
        }
	    public boolean waLineCtrIsNumeric() {
	      return decimalIsNumeric(beginWaLineCtr,WA_LINE_CTR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int WA_LINE_CTR_LEN = 4;
  	/**
	 * 	serializeWaLineCtr
	 */
	protected void serializeWaLineCtr(int waLineCtr) {
		   putDecimal(beginWaLineCtr,waLineCtr,WA_LINE_CTR_LEN,true);
   }
   

   protected int checkWaLineCtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_10M /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshWaLineCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWaLineCtr() throws CFException {	
   	try { 
		 return (getIntDecimal(beginWaLineCtr,WA_LINE_CTR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("waLineCtr", beginWaLineCtr,WA_LINE_CTR_LEN);
     }
   	}
     int localEofTranSwCounter = -1;
     public boolean isEofTranSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEofTranSwCounter != sharedCounter;
         localEofTranSwCounter = sharedCounter; return hasModified;
     }

   protected char[] checkEofTranSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localImpDecCounter = -1;
     public boolean isImpDecModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localImpDecCounter != sharedCounter;
         localImpDecCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of impDec
	 *	@return impDec
	 */
	public char[]  getImpDecString() {
	     return getCharArray(beginImpDec,IMP_DEC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean impDecIsNumeric() {
	    return isNumeric(beginImpDec
	                    ,beginImpDec + IMP_DEC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IMP_DEC_LEN = 1;
  	/**
	 * serializeImpDec
	 */
	protected void serializeImpDec(int impDec) {
		 putNumber(beginImpDec,impDec,IMP_DEC_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localImpDecCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeImpDec
	 */
   	protected  int serializeImpDec(char[] value) {
	    int  impDec;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    impDec = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginImpDec
		       ,1
		      );
		 localImpDecCounter = shareString.getSerializedField().getModifiedCounter();
		return  impDec;
    }

   protected int checkImpDecMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshImpDec is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshImpDec() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginImpDec
			                 ,IMP_DEC_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("impDec", beginImpDec,IMP_DEC_LEN);
    }
   	}
     int localImpDecEpCounter = -1;
     public boolean isImpDecEpModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localImpDecEpCounter != sharedCounter;
         localImpDecEpCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of impDecEp
	 *	@return impDecEp
	 */
	public char[]  getImpDecEpString() {
	     return getCharArray(beginImpDecEp,IMP_DEC_EP_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean impDecEpIsNumeric() {
	    return isNumeric(beginImpDecEp
	                    ,beginImpDecEp + IMP_DEC_EP_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IMP_DEC_EP_LEN = 1;
  	/**
	 * serializeImpDecEp
	 */
	protected void serializeImpDecEp(int impDecEp) {
		 putNumber(beginImpDecEp,impDecEp,IMP_DEC_EP_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localImpDecEpCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeImpDecEp
	 */
   	protected  int serializeImpDecEp(char[] value) {
	    int  impDecEp;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    impDecEp = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginImpDecEp
		       ,1
		      );
		 localImpDecEpCounter = shareString.getSerializedField().getModifiedCounter();
		return  impDecEp;
    }

   protected int checkImpDecEpMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshImpDecEp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshImpDecEp() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginImpDecEp
			                 ,IMP_DEC_EP_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("impDecEp", beginImpDecEp,IMP_DEC_EP_LEN);
    }
   	}
     int localImpAmtfCounter = -1;
     public boolean isImpAmtfModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localImpAmtfCounter != sharedCounter;
         localImpAmtfCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of impAmtf
	 *	@return impAmtf
	 */
	public char[]  getImpAmtfString() {
	     return getCharArray(beginImpAmtf,IMP_AMTF_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean impAmtfIsNumeric() {
	    return isNumeric(beginImpAmtf
	                    ,beginImpAmtf + IMP_AMTF_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IMP_AMTF_LEN = 11;
  	/**
	 * serializeImpAmtf
	 */
	protected void serializeImpAmtf(long impAmtf) {
		 putNumber(beginImpAmtf,impAmtf,IMP_AMTF_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localImpAmtfCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeImpAmtf
	 */
   	protected  long serializeImpAmtf(char[] value) {
	    long  impAmtf;
	    if(value.length >0 && value.length!= 11)
            value = new String(value).trim().toCharArray();
	    if (value.length < 11) value = pad(11, value, ' ', LEFT_PAD);
	    else if (value.length > 11) value = substring(value,0,11);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    impAmtf = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(11,value,true/*isSigned?*/)
		       ,beginImpAmtf
		       ,11
		      );
		 localImpAmtfCounter = shareString.getSerializedField().getModifiedCounter();
		return  impAmtf;
    }

   protected long checkImpAmtfMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshImpAmtf is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshImpAmtf() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginImpAmtf
			                 ,IMP_AMTF_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("impAmtf", beginImpAmtf,IMP_AMTF_LEN);
    }
   	}
     int localImpAmteCounter = -1;
     public boolean isImpAmteModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localImpAmteCounter != sharedCounter;
         localImpAmteCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of impAmte
	 *	@return impAmte
	 */
	public char[]  getImpAmteString() {
	     return getCharArray(beginImpAmte,IMP_AMTE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean impAmteIsNumeric() {
	    return isNumeric(beginImpAmte
	                    ,beginImpAmte + IMP_AMTE_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IMP_AMTE_LEN = 18;
  	/**
	 * serializeImpAmte
	 */
	protected void serializeImpAmte(long impAmte) {
		 putNumber(beginImpAmte,impAmte,IMP_AMTE_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localImpAmteCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeImpAmte
	 */
   	protected  long serializeImpAmte(char[] value) {
	    long  impAmte;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    impAmte = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginImpAmte
		       ,18
		      );
		 localImpAmteCounter = shareString.getSerializedField().getModifiedCounter();
		return  impAmte;
    }

   protected long checkImpAmteMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshImpAmte is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshImpAmte() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginImpAmte
			                 ,IMP_AMTE_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("impAmte", beginImpAmte,IMP_AMTE_LEN);
    }
   	}
     int localImpAmtepCounter = -1;
     public boolean isImpAmtepModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localImpAmtepCounter != sharedCounter;
         localImpAmtepCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of impAmtep
	 *	@return impAmtep
	 */
	public char[]  getImpAmtepString() {
	     return getCharArray(beginImpAmtep,IMP_AMTEP_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean impAmtepIsNumeric() {
	    return isNumeric(beginImpAmtep
	                    ,beginImpAmtep + IMP_AMTEP_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IMP_AMTEP_LEN = 18;
  	/**
	 * serializeImpAmtep
	 */
	protected void serializeImpAmtep(long impAmtep) {
		 putNumber(beginImpAmtep,impAmtep,IMP_AMTEP_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localImpAmtepCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeImpAmtep
	 */
   	protected  long serializeImpAmtep(char[] value) {
	    long  impAmtep;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    impAmtep = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginImpAmtep
		       ,18
		      );
		 localImpAmtepCounter = shareString.getSerializedField().getModifiedCounter();
		return  impAmtep;
    }

   protected long checkImpAmtepMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshImpAmtep is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshImpAmtep() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginImpAmtep
			                 ,IMP_AMTEP_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("impAmtep", beginImpAmtep,IMP_AMTEP_LEN);
    }
   	}
     int localImpAmtCounter = -1;
     public boolean isImpAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localImpAmtCounter != sharedCounter;
         localImpAmtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of impAmt
	 *	@return impAmt
	 */
	public char[]  getImpAmtString() {
	     return getCharArray(beginImpAmt,IMP_AMT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean impAmtIsNumeric() {
	    return isNumeric(beginImpAmt
	                    ,beginImpAmt + IMP_AMT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IMP_AMT_LEN = 18;
  	/**
	 * serializeImpAmt
	 */
	protected void serializeImpAmt(long impAmt) {
		 putNumber(beginImpAmt,impAmt,IMP_AMT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localImpAmtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeImpAmt
	 */
   	protected  long serializeImpAmt(char[] value) {
	    long  impAmt;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    impAmt = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginImpAmt
		       ,18
		      );
		 localImpAmtCounter = shareString.getSerializedField().getModifiedCounter();
		return  impAmt;
    }

   protected long checkImpAmtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshImpAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshImpAmt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginImpAmt
			                 ,IMP_AMT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("impAmt", beginImpAmt,IMP_AMT_LEN);
    }
   	}
     int localImpAmtT4Counter = -1;
     public boolean isImpAmtT4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localImpAmtT4Counter != sharedCounter;
         localImpAmtT4Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of impAmtT4
	 *	@return impAmtT4
	 */
	public char[]  getImpAmtT4String() {
	     return getCharArray(beginImpAmtT4,IMP_AMT_T_4_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean impAmtT4IsNumeric() {
	    return isNumeric(beginImpAmtT4
	                    ,beginImpAmtT4 + IMP_AMT_T_4_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IMP_AMT_T_4_LEN = 24;
  	/**
	 * serializeImpAmtT4
	 */
	protected void serializeImpAmtT4(long impAmtT4) {
		 putNumber(beginImpAmtT4,impAmtT4,IMP_AMT_T_4_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localImpAmtT4Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeImpAmtT4
	 */
   	protected  long serializeImpAmtT4(char[] value) {
	    long  impAmtT4;
	    if(value.length >0 && value.length!= 24)
            value = new String(value).trim().toCharArray();
	    if (value.length < 24) value = pad(24, value, ' ', LEFT_PAD);
	    else if (value.length > 24) value = substring(value,0,24);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    impAmtT4 = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(24,value,true/*isSigned?*/)
		       ,beginImpAmtT4
		       ,24
		      );
		 localImpAmtT4Counter = shareString.getSerializedField().getModifiedCounter();
		return  impAmtT4;
    }

   protected long checkImpAmtT4MaxLimit(long number) {

        return checkMaxLimit(number , Long.MAX_VALUE/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshImpAmtT4 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshImpAmtT4() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginImpAmtT4
			                 ,IMP_AMT_T_4_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("impAmtT4", beginImpAmtT4,IMP_AMT_T_4_LEN);
    }
   	}
     int localImpCntCounter = -1;
     public boolean isImpCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localImpCntCounter != sharedCounter;
         localImpCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of impCnt
	 *	@return impCnt
	 */
	public char[]  getImpCntString() {
	     return getCharArray(beginImpCnt,IMP_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean impCntIsNumeric() {
	    return isNumeric(beginImpCnt
	                    ,beginImpCnt + IMP_CNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IMP_CNT_LEN = 9;
  	/**
	 * serializeImpCnt
	 */
	protected void serializeImpCnt(long impCnt) {
		 putNumber(beginImpCnt,impCnt,IMP_CNT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localImpCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeImpCnt
	 */
   	protected  long serializeImpCnt(char[] value) {
	    long  impCnt;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    impCnt = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginImpCnt
		       ,9
		      );
		 localImpCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  impCnt;
    }

   protected long checkImpCntMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshImpCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshImpCnt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginImpCnt
			                 ,IMP_CNT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("impCnt", beginImpCnt,IMP_CNT_LEN);
    }
   	}
     int localFeeAmtNetCounter = -1;
     public boolean isFeeAmtNetModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFeeAmtNetCounter != sharedCounter;
         localFeeAmtNetCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of feeAmtNet
	 *	@return feeAmtNet
	 */
	public char[]  getFeeAmtNetString() {
	     return getCharArray(beginFeeAmtNet,FEE_AMT_NET_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean feeAmtNetIsNumeric() {
	    return isNumeric(beginFeeAmtNet
	                    ,beginFeeAmtNet + FEE_AMT_NET_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int FEE_AMT_NET_LEN = 17;
  	/**
	 * serializeFeeAmtNet
	 */
	protected void serializeFeeAmtNet(long feeAmtNet) {
		 putNumber(beginFeeAmtNet,feeAmtNet,FEE_AMT_NET_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localFeeAmtNetCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeFeeAmtNet
	 */
   	protected  long serializeFeeAmtNet(char[] value) {
	    long  feeAmtNet;
	    if(value.length >0 && value.length!= 17)
            value = new String(value).trim().toCharArray();
	    if (value.length < 17) value = pad(17, value, ' ', LEFT_PAD);
	    else if (value.length > 17) value = substring(value,0,17);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    feeAmtNet = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(17,value,true/*isSigned?*/)
		       ,beginFeeAmtNet
		       ,17
		      );
		 localFeeAmtNetCounter = shareString.getSerializedField().getModifiedCounter();
		return  feeAmtNet;
    }

   protected long checkFeeAmtNetMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100P/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshFeeAmtNet is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshFeeAmtNet() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginFeeAmtNet
			                 ,FEE_AMT_NET_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("feeAmtNet", beginFeeAmtNet,FEE_AMT_NET_LEN);
    }
   	}
     int localTot1FeeAmtCrCounter = -1;
     public boolean isTot1FeeAmtCrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTot1FeeAmtCrCounter != sharedCounter;
         localTot1FeeAmtCrCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tot1FeeAmtCr
	 *	@return tot1FeeAmtCr
	 */
	public char[]  getTot1FeeAmtCrString() {
	     return getCharArray(beginTot1FeeAmtCr,TOT_1_FEE_AMT_CR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tot1FeeAmtCrIsNumeric() {
	    return isNumeric(beginTot1FeeAmtCr
	                    ,beginTot1FeeAmtCr + TOT_1_FEE_AMT_CR_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TOT_1_FEE_AMT_CR_LEN = 17;
  	/**
	 * serializeTot1FeeAmtCr
	 */
	protected void serializeTot1FeeAmtCr(long tot1FeeAmtCr) {
		 putNumber(beginTot1FeeAmtCr,tot1FeeAmtCr,TOT_1_FEE_AMT_CR_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTot1FeeAmtCrCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTot1FeeAmtCr
	 */
   	protected  long serializeTot1FeeAmtCr(char[] value) {
	    long  tot1FeeAmtCr;
	    if(value.length >0 && value.length!= 17)
            value = new String(value).trim().toCharArray();
	    if (value.length < 17) value = pad(17, value, ' ', LEFT_PAD);
	    else if (value.length > 17) value = substring(value,0,17);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tot1FeeAmtCr = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(17,value,true/*isSigned?*/)
		       ,beginTot1FeeAmtCr
		       ,17
		      );
		 localTot1FeeAmtCrCounter = shareString.getSerializedField().getModifiedCounter();
		return  tot1FeeAmtCr;
    }

   protected long checkTot1FeeAmtCrMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100P/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshTot1FeeAmtCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTot1FeeAmtCr() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTot1FeeAmtCr
			                 ,TOT_1_FEE_AMT_CR_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tot1FeeAmtCr", beginTot1FeeAmtCr,TOT_1_FEE_AMT_CR_LEN);
    }
   	}
     int localTot1FeeAmtDbCounter = -1;
     public boolean isTot1FeeAmtDbModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTot1FeeAmtDbCounter != sharedCounter;
         localTot1FeeAmtDbCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tot1FeeAmtDb
	 *	@return tot1FeeAmtDb
	 */
	public char[]  getTot1FeeAmtDbString() {
	     return getCharArray(beginTot1FeeAmtDb,TOT_1_FEE_AMT_DB_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tot1FeeAmtDbIsNumeric() {
	    return isNumeric(beginTot1FeeAmtDb
	                    ,beginTot1FeeAmtDb + TOT_1_FEE_AMT_DB_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TOT_1_FEE_AMT_DB_LEN = 17;
  	/**
	 * serializeTot1FeeAmtDb
	 */
	protected void serializeTot1FeeAmtDb(long tot1FeeAmtDb) {
		 putNumber(beginTot1FeeAmtDb,tot1FeeAmtDb,TOT_1_FEE_AMT_DB_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTot1FeeAmtDbCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTot1FeeAmtDb
	 */
   	protected  long serializeTot1FeeAmtDb(char[] value) {
	    long  tot1FeeAmtDb;
	    if(value.length >0 && value.length!= 17)
            value = new String(value).trim().toCharArray();
	    if (value.length < 17) value = pad(17, value, ' ', LEFT_PAD);
	    else if (value.length > 17) value = substring(value,0,17);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tot1FeeAmtDb = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(17,value,true/*isSigned?*/)
		       ,beginTot1FeeAmtDb
		       ,17
		      );
		 localTot1FeeAmtDbCounter = shareString.getSerializedField().getModifiedCounter();
		return  tot1FeeAmtDb;
    }

   protected long checkTot1FeeAmtDbMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100P/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshTot1FeeAmtDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTot1FeeAmtDb() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTot1FeeAmtDb
			                 ,TOT_1_FEE_AMT_DB_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tot1FeeAmtDb", beginTot1FeeAmtDb,TOT_1_FEE_AMT_DB_LEN);
    }
   	}
     int localTot1FeeAmtNet01Counter = -1;
     public boolean isTot1FeeAmtNet01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTot1FeeAmtNet01Counter != sharedCounter;
         localTot1FeeAmtNet01Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tot1FeeAmtNet01
	 *	@return tot1FeeAmtNet01
	 */
	public char[]  getTot1FeeAmtNet01String() {
	     return getCharArray(beginTot1FeeAmtNet01,TOT_1_FEE_AMT_NET_01_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tot1FeeAmtNet01IsNumeric() {
	    return isNumeric(beginTot1FeeAmtNet01
	                    ,beginTot1FeeAmtNet01 + TOT_1_FEE_AMT_NET_01_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TOT_1_FEE_AMT_NET_01_LEN = 17;
  	/**
	 * serializeTot1FeeAmtNet01
	 */
	protected void serializeTot1FeeAmtNet01(long tot1FeeAmtNet01) {
		 putNumber(beginTot1FeeAmtNet01,tot1FeeAmtNet01,TOT_1_FEE_AMT_NET_01_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTot1FeeAmtNet01Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTot1FeeAmtNet01
	 */
   	protected  long serializeTot1FeeAmtNet01(char[] value) {
	    long  tot1FeeAmtNet01;
	    if(value.length >0 && value.length!= 17)
            value = new String(value).trim().toCharArray();
	    if (value.length < 17) value = pad(17, value, ' ', LEFT_PAD);
	    else if (value.length > 17) value = substring(value,0,17);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tot1FeeAmtNet01 = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(17,value,true/*isSigned?*/)
		       ,beginTot1FeeAmtNet01
		       ,17
		      );
		 localTot1FeeAmtNet01Counter = shareString.getSerializedField().getModifiedCounter();
		return  tot1FeeAmtNet01;
    }

   protected long checkTot1FeeAmtNet01MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100P/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshTot1FeeAmtNet01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTot1FeeAmtNet01() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTot1FeeAmtNet01
			                 ,TOT_1_FEE_AMT_NET_01_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tot1FeeAmtNet01", beginTot1FeeAmtNet01,TOT_1_FEE_AMT_NET_01_LEN);
    }
   	}
     int localTot1FinAmt01Counter = -1;
     public boolean isTot1FinAmt01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTot1FinAmt01Counter != sharedCounter;
         localTot1FinAmt01Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tot1FinAmt01
	 *	@return tot1FinAmt01
	 */
	public char[]  getTot1FinAmt01String() {
	     return getCharArray(beginTot1FinAmt01,TOT_1_FIN_AMT_01_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tot1FinAmt01IsNumeric() {
	    return isNumeric(beginTot1FinAmt01
	                    ,beginTot1FinAmt01 + TOT_1_FIN_AMT_01_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TOT_1_FIN_AMT_01_LEN = 18;
  	/**
	 * serializeTot1FinAmt01
	 */
	protected void serializeTot1FinAmt01(long tot1FinAmt01) {
		 putNumber(beginTot1FinAmt01,tot1FinAmt01,TOT_1_FIN_AMT_01_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTot1FinAmt01Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTot1FinAmt01
	 */
   	protected  long serializeTot1FinAmt01(char[] value) {
	    long  tot1FinAmt01;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tot1FinAmt01 = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginTot1FinAmt01
		       ,18
		      );
		 localTot1FinAmt01Counter = shareString.getSerializedField().getModifiedCounter();
		return  tot1FinAmt01;
    }

   protected long checkTot1FinAmt01MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshTot1FinAmt01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTot1FinAmt01() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTot1FinAmt01
			                 ,TOT_1_FIN_AMT_01_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tot1FinAmt01", beginTot1FinAmt01,TOT_1_FIN_AMT_01_LEN);
    }
   	}
     int localTot1FinNbr01Counter = -1;
     public boolean isTot1FinNbr01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTot1FinNbr01Counter != sharedCounter;
         localTot1FinNbr01Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tot1FinNbr01
	 *	@return tot1FinNbr01
	 */
	public char[]  getTot1FinNbr01String() {
	     return getCharArray(beginTot1FinNbr01,TOT_1_FIN_NBR_01_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tot1FinNbr01IsNumeric() {
	    return isNumeric(beginTot1FinNbr01
	                    ,beginTot1FinNbr01 + TOT_1_FIN_NBR_01_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TOT_1_FIN_NBR_01_LEN = 9;
  	/**
	 * serializeTot1FinNbr01
	 */
	protected void serializeTot1FinNbr01(long tot1FinNbr01) {
		 putNumber(beginTot1FinNbr01,tot1FinNbr01,TOT_1_FIN_NBR_01_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTot1FinNbr01Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTot1FinNbr01
	 */
   	protected  long serializeTot1FinNbr01(char[] value) {
	    long  tot1FinNbr01;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tot1FinNbr01 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginTot1FinNbr01
		       ,9
		      );
		 localTot1FinNbr01Counter = shareString.getSerializedField().getModifiedCounter();
		return  tot1FinNbr01;
    }

   protected long checkTot1FinNbr01MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTot1FinNbr01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTot1FinNbr01() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTot1FinNbr01
			                 ,TOT_1_FIN_NBR_01_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tot1FinNbr01", beginTot1FinNbr01,TOT_1_FIN_NBR_01_LEN);
    }
   	}
     int localTot1FinNbrDen01Counter = -1;
     public boolean isTot1FinNbrDen01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTot1FinNbrDen01Counter != sharedCounter;
         localTot1FinNbrDen01Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tot1FinNbrDen01
	 *	@return tot1FinNbrDen01
	 */
	public char[]  getTot1FinNbrDen01String() {
	     return getCharArray(beginTot1FinNbrDen01,TOT_1_FIN_NBR_DEN_01_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tot1FinNbrDen01IsNumeric() {
	    return isNumeric(beginTot1FinNbrDen01
	                    ,beginTot1FinNbrDen01 + TOT_1_FIN_NBR_DEN_01_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TOT_1_FIN_NBR_DEN_01_LEN = 9;
  	/**
	 * serializeTot1FinNbrDen01
	 */
	protected void serializeTot1FinNbrDen01(long tot1FinNbrDen01) {
		 putNumber(beginTot1FinNbrDen01,tot1FinNbrDen01,TOT_1_FIN_NBR_DEN_01_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTot1FinNbrDen01Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTot1FinNbrDen01
	 */
   	protected  long serializeTot1FinNbrDen01(char[] value) {
	    long  tot1FinNbrDen01;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tot1FinNbrDen01 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginTot1FinNbrDen01
		       ,9
		      );
		 localTot1FinNbrDen01Counter = shareString.getSerializedField().getModifiedCounter();
		return  tot1FinNbrDen01;
    }

   protected long checkTot1FinNbrDen01MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTot1FinNbrDen01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTot1FinNbrDen01() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTot1FinNbrDen01
			                 ,TOT_1_FIN_NBR_DEN_01_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tot1FinNbrDen01", beginTot1FinNbrDen01,TOT_1_FIN_NBR_DEN_01_LEN);
    }
   	}
     int localTot1FinFeeNbr01Counter = -1;
     public boolean isTot1FinFeeNbr01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTot1FinFeeNbr01Counter != sharedCounter;
         localTot1FinFeeNbr01Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tot1FinFeeNbr01
	 *	@return tot1FinFeeNbr01
	 */
	public char[]  getTot1FinFeeNbr01String() {
	     return getCharArray(beginTot1FinFeeNbr01,TOT_1_FIN_FEE_NBR_01_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tot1FinFeeNbr01IsNumeric() {
	    return isNumeric(beginTot1FinFeeNbr01
	                    ,beginTot1FinFeeNbr01 + TOT_1_FIN_FEE_NBR_01_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TOT_1_FIN_FEE_NBR_01_LEN = 9;
  	/**
	 * serializeTot1FinFeeNbr01
	 */
	protected void serializeTot1FinFeeNbr01(long tot1FinFeeNbr01) {
		 putNumber(beginTot1FinFeeNbr01,tot1FinFeeNbr01,TOT_1_FIN_FEE_NBR_01_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTot1FinFeeNbr01Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTot1FinFeeNbr01
	 */
   	protected  long serializeTot1FinFeeNbr01(char[] value) {
	    long  tot1FinFeeNbr01;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tot1FinFeeNbr01 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginTot1FinFeeNbr01
		       ,9
		      );
		 localTot1FinFeeNbr01Counter = shareString.getSerializedField().getModifiedCounter();
		return  tot1FinFeeNbr01;
    }

   protected long checkTot1FinFeeNbr01MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTot1FinFeeNbr01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTot1FinFeeNbr01() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTot1FinFeeNbr01
			                 ,TOT_1_FIN_FEE_NBR_01_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tot1FinFeeNbr01", beginTot1FinFeeNbr01,TOT_1_FIN_FEE_NBR_01_LEN);
    }
   	}
     int localTot1PctFeeNbr01Counter = -1;
     public boolean isTot1PctFeeNbr01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTot1PctFeeNbr01Counter != sharedCounter;
         localTot1PctFeeNbr01Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tot1PctFeeNbr01
	 *	@return tot1PctFeeNbr01
	 */
	public char[]  getTot1PctFeeNbr01String() {
	     return getCharArray(beginTot1PctFeeNbr01,TOT_1_PCT_FEE_NBR_01_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tot1PctFeeNbr01IsNumeric() {
	    return isNumeric(beginTot1PctFeeNbr01
	                    ,beginTot1PctFeeNbr01 + TOT_1_PCT_FEE_NBR_01_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TOT_1_PCT_FEE_NBR_01_LEN = 9;
  	/**
	 * serializeTot1PctFeeNbr01
	 */
	protected void serializeTot1PctFeeNbr01(long tot1PctFeeNbr01) {
		 putNumber(beginTot1PctFeeNbr01,tot1PctFeeNbr01,TOT_1_PCT_FEE_NBR_01_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTot1PctFeeNbr01Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTot1PctFeeNbr01
	 */
   	protected  long serializeTot1PctFeeNbr01(char[] value) {
	    long  tot1PctFeeNbr01;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tot1PctFeeNbr01 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginTot1PctFeeNbr01
		       ,9
		      );
		 localTot1PctFeeNbr01Counter = shareString.getSerializedField().getModifiedCounter();
		return  tot1PctFeeNbr01;
    }

   protected long checkTot1PctFeeNbr01MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTot1PctFeeNbr01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTot1PctFeeNbr01() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTot1PctFeeNbr01
			                 ,TOT_1_PCT_FEE_NBR_01_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tot1PctFeeNbr01", beginTot1PctFeeNbr01,TOT_1_PCT_FEE_NBR_01_LEN);
    }
   	}
     int localTot1NfinFeeNbr01Counter = -1;
     public boolean isTot1NfinFeeNbr01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTot1NfinFeeNbr01Counter != sharedCounter;
         localTot1NfinFeeNbr01Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tot1NfinFeeNbr01
	 *	@return tot1NfinFeeNbr01
	 */
	public char[]  getTot1NfinFeeNbr01String() {
	     return getCharArray(beginTot1NfinFeeNbr01,TOT_1_NFIN_FEE_NBR_01_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tot1NfinFeeNbr01IsNumeric() {
	    return isNumeric(beginTot1NfinFeeNbr01
	                    ,beginTot1NfinFeeNbr01 + TOT_1_NFIN_FEE_NBR_01_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TOT_1_NFIN_FEE_NBR_01_LEN = 9;
  	/**
	 * serializeTot1NfinFeeNbr01
	 */
	protected void serializeTot1NfinFeeNbr01(long tot1NfinFeeNbr01) {
		 putNumber(beginTot1NfinFeeNbr01,tot1NfinFeeNbr01,TOT_1_NFIN_FEE_NBR_01_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTot1NfinFeeNbr01Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTot1NfinFeeNbr01
	 */
   	protected  long serializeTot1NfinFeeNbr01(char[] value) {
	    long  tot1NfinFeeNbr01;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tot1NfinFeeNbr01 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginTot1NfinFeeNbr01
		       ,9
		      );
		 localTot1NfinFeeNbr01Counter = shareString.getSerializedField().getModifiedCounter();
		return  tot1NfinFeeNbr01;
    }

   protected long checkTot1NfinFeeNbr01MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTot1NfinFeeNbr01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTot1NfinFeeNbr01() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTot1NfinFeeNbr01
			                 ,TOT_1_NFIN_FEE_NBR_01_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tot1NfinFeeNbr01", beginTot1NfinFeeNbr01,TOT_1_NFIN_FEE_NBR_01_LEN);
    }
   	}
     int localTot1NbilFeeNbr01Counter = -1;
     public boolean isTot1NbilFeeNbr01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTot1NbilFeeNbr01Counter != sharedCounter;
         localTot1NbilFeeNbr01Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tot1NbilFeeNbr01
	 *	@return tot1NbilFeeNbr01
	 */
	public char[]  getTot1NbilFeeNbr01String() {
	     return getCharArray(beginTot1NbilFeeNbr01,TOT_1_NBIL_FEE_NBR_01_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tot1NbilFeeNbr01IsNumeric() {
	    return isNumeric(beginTot1NbilFeeNbr01
	                    ,beginTot1NbilFeeNbr01 + TOT_1_NBIL_FEE_NBR_01_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TOT_1_NBIL_FEE_NBR_01_LEN = 9;
  	/**
	 * serializeTot1NbilFeeNbr01
	 */
	protected void serializeTot1NbilFeeNbr01(long tot1NbilFeeNbr01) {
		 putNumber(beginTot1NbilFeeNbr01,tot1NbilFeeNbr01,TOT_1_NBIL_FEE_NBR_01_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTot1NbilFeeNbr01Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTot1NbilFeeNbr01
	 */
   	protected  long serializeTot1NbilFeeNbr01(char[] value) {
	    long  tot1NbilFeeNbr01;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tot1NbilFeeNbr01 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginTot1NbilFeeNbr01
		       ,9
		      );
		 localTot1NbilFeeNbr01Counter = shareString.getSerializedField().getModifiedCounter();
		return  tot1NbilFeeNbr01;
    }

   protected long checkTot1NbilFeeNbr01MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTot1NbilFeeNbr01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshTot1NbilFeeNbr01() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginTot1NbilFeeNbr01
			                 ,TOT_1_NBIL_FEE_NBR_01_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tot1NbilFeeNbr01", beginTot1NbilFeeNbr01,TOT_1_NBIL_FEE_NBR_01_LEN);
    }
   	}
     int localExp1FeeAmtCrCounter = -1;
     public boolean isExp1FeeAmtCrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExp1FeeAmtCrCounter != sharedCounter;
         localExp1FeeAmtCrCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of exp1FeeAmtCr
	 *	@return exp1FeeAmtCr
	 */
	public char[]  getExp1FeeAmtCrString() {
	     return getCharArray(beginExp1FeeAmtCr,EXP_1_FEE_AMT_CR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean exp1FeeAmtCrIsNumeric() {
	    return isNumeric(beginExp1FeeAmtCr
	                    ,beginExp1FeeAmtCr + EXP_1_FEE_AMT_CR_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int EXP_1_FEE_AMT_CR_LEN = 15;
  	/**
	 * serializeExp1FeeAmtCr
	 */
	protected void serializeExp1FeeAmtCr(long exp1FeeAmtCr) {
		 putNumber(beginExp1FeeAmtCr,exp1FeeAmtCr,EXP_1_FEE_AMT_CR_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localExp1FeeAmtCrCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeExp1FeeAmtCr
	 */
   	protected  long serializeExp1FeeAmtCr(char[] value) {
	    long  exp1FeeAmtCr;
	    if(value.length >0 && value.length!= 15)
            value = new String(value).trim().toCharArray();
	    if (value.length < 15) value = pad(15, value, ' ', LEFT_PAD);
	    else if (value.length > 15) value = substring(value,0,15);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    exp1FeeAmtCr = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(15,value,true/*isSigned?*/)
		       ,beginExp1FeeAmtCr
		       ,15
		      );
		 localExp1FeeAmtCrCounter = shareString.getSerializedField().getModifiedCounter();
		return  exp1FeeAmtCr;
    }

   protected long checkExp1FeeAmtCrMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1P/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshExp1FeeAmtCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshExp1FeeAmtCr() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginExp1FeeAmtCr
			                 ,EXP_1_FEE_AMT_CR_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("exp1FeeAmtCr", beginExp1FeeAmtCr,EXP_1_FEE_AMT_CR_LEN);
    }
   	}
     int localExp1FeeAmtDbCounter = -1;
     public boolean isExp1FeeAmtDbModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExp1FeeAmtDbCounter != sharedCounter;
         localExp1FeeAmtDbCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of exp1FeeAmtDb
	 *	@return exp1FeeAmtDb
	 */
	public char[]  getExp1FeeAmtDbString() {
	     return getCharArray(beginExp1FeeAmtDb,EXP_1_FEE_AMT_DB_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean exp1FeeAmtDbIsNumeric() {
	    return isNumeric(beginExp1FeeAmtDb
	                    ,beginExp1FeeAmtDb + EXP_1_FEE_AMT_DB_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int EXP_1_FEE_AMT_DB_LEN = 15;
  	/**
	 * serializeExp1FeeAmtDb
	 */
	protected void serializeExp1FeeAmtDb(long exp1FeeAmtDb) {
		 putNumber(beginExp1FeeAmtDb,exp1FeeAmtDb,EXP_1_FEE_AMT_DB_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localExp1FeeAmtDbCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeExp1FeeAmtDb
	 */
   	protected  long serializeExp1FeeAmtDb(char[] value) {
	    long  exp1FeeAmtDb;
	    if(value.length >0 && value.length!= 15)
            value = new String(value).trim().toCharArray();
	    if (value.length < 15) value = pad(15, value, ' ', LEFT_PAD);
	    else if (value.length > 15) value = substring(value,0,15);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    exp1FeeAmtDb = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(15,value,true/*isSigned?*/)
		       ,beginExp1FeeAmtDb
		       ,15
		      );
		 localExp1FeeAmtDbCounter = shareString.getSerializedField().getModifiedCounter();
		return  exp1FeeAmtDb;
    }

   protected long checkExp1FeeAmtDbMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1P/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshExp1FeeAmtDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshExp1FeeAmtDb() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginExp1FeeAmtDb
			                 ,EXP_1_FEE_AMT_DB_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("exp1FeeAmtDb", beginExp1FeeAmtDb,EXP_1_FEE_AMT_DB_LEN);
    }
   	}
     int localExp1FeeAmtNet01Counter = -1;
     public boolean isExp1FeeAmtNet01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExp1FeeAmtNet01Counter != sharedCounter;
         localExp1FeeAmtNet01Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of exp1FeeAmtNet01
	 *	@return exp1FeeAmtNet01
	 */
	public char[]  getExp1FeeAmtNet01String() {
	     return getCharArray(beginExp1FeeAmtNet01,EXP_1_FEE_AMT_NET_01_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean exp1FeeAmtNet01IsNumeric() {
	    return isNumeric(beginExp1FeeAmtNet01
	                    ,beginExp1FeeAmtNet01 + EXP_1_FEE_AMT_NET_01_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int EXP_1_FEE_AMT_NET_01_LEN = 15;
  	/**
	 * serializeExp1FeeAmtNet01
	 */
	protected void serializeExp1FeeAmtNet01(long exp1FeeAmtNet01) {
		 putNumber(beginExp1FeeAmtNet01,exp1FeeAmtNet01,EXP_1_FEE_AMT_NET_01_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localExp1FeeAmtNet01Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeExp1FeeAmtNet01
	 */
   	protected  long serializeExp1FeeAmtNet01(char[] value) {
	    long  exp1FeeAmtNet01;
	    if(value.length >0 && value.length!= 15)
            value = new String(value).trim().toCharArray();
	    if (value.length < 15) value = pad(15, value, ' ', LEFT_PAD);
	    else if (value.length > 15) value = substring(value,0,15);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    exp1FeeAmtNet01 = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(15,value,true/*isSigned?*/)
		       ,beginExp1FeeAmtNet01
		       ,15
		      );
		 localExp1FeeAmtNet01Counter = shareString.getSerializedField().getModifiedCounter();
		return  exp1FeeAmtNet01;
    }

   protected long checkExp1FeeAmtNet01MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1P/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshExp1FeeAmtNet01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshExp1FeeAmtNet01() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginExp1FeeAmtNet01
			                 ,EXP_1_FEE_AMT_NET_01_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("exp1FeeAmtNet01", beginExp1FeeAmtNet01,EXP_1_FEE_AMT_NET_01_LEN);
    }
   	}
     int localExp1FinAmt01Counter = -1;
     public boolean isExp1FinAmt01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExp1FinAmt01Counter != sharedCounter;
         localExp1FinAmt01Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of exp1FinAmt01
	 *	@return exp1FinAmt01
	 */
	public char[]  getExp1FinAmt01String() {
	     return getCharArray(beginExp1FinAmt01,EXP_1_FIN_AMT_01_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean exp1FinAmt01IsNumeric() {
	    return isNumeric(beginExp1FinAmt01
	                    ,beginExp1FinAmt01 + EXP_1_FIN_AMT_01_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int EXP_1_FIN_AMT_01_LEN = 18;
  	/**
	 * serializeExp1FinAmt01
	 */
	protected void serializeExp1FinAmt01(long exp1FinAmt01) {
		 putNumber(beginExp1FinAmt01,exp1FinAmt01,EXP_1_FIN_AMT_01_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localExp1FinAmt01Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeExp1FinAmt01
	 */
   	protected  long serializeExp1FinAmt01(char[] value) {
	    long  exp1FinAmt01;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    exp1FinAmt01 = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginExp1FinAmt01
		       ,18
		      );
		 localExp1FinAmt01Counter = shareString.getSerializedField().getModifiedCounter();
		return  exp1FinAmt01;
    }

   protected long checkExp1FinAmt01MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshExp1FinAmt01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshExp1FinAmt01() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginExp1FinAmt01
			                 ,EXP_1_FIN_AMT_01_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("exp1FinAmt01", beginExp1FinAmt01,EXP_1_FIN_AMT_01_LEN);
    }
   	}
     int localExp1FinNbr01Counter = -1;
     public boolean isExp1FinNbr01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExp1FinNbr01Counter != sharedCounter;
         localExp1FinNbr01Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of exp1FinNbr01
	 *	@return exp1FinNbr01
	 */
	public char[]  getExp1FinNbr01String() {
	     return getCharArray(beginExp1FinNbr01,EXP_1_FIN_NBR_01_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean exp1FinNbr01IsNumeric() {
	    return isNumeric(beginExp1FinNbr01
	                    ,beginExp1FinNbr01 + EXP_1_FIN_NBR_01_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int EXP_1_FIN_NBR_01_LEN = 9;
  	/**
	 * serializeExp1FinNbr01
	 */
	protected void serializeExp1FinNbr01(long exp1FinNbr01) {
		 putNumber(beginExp1FinNbr01,exp1FinNbr01,EXP_1_FIN_NBR_01_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localExp1FinNbr01Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeExp1FinNbr01
	 */
   	protected  long serializeExp1FinNbr01(char[] value) {
	    long  exp1FinNbr01;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    exp1FinNbr01 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginExp1FinNbr01
		       ,9
		      );
		 localExp1FinNbr01Counter = shareString.getSerializedField().getModifiedCounter();
		return  exp1FinNbr01;
    }

   protected long checkExp1FinNbr01MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshExp1FinNbr01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshExp1FinNbr01() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginExp1FinNbr01
			                 ,EXP_1_FIN_NBR_01_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("exp1FinNbr01", beginExp1FinNbr01,EXP_1_FIN_NBR_01_LEN);
    }
   	}
     int localExp1FinNbrDen01Counter = -1;
     public boolean isExp1FinNbrDen01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExp1FinNbrDen01Counter != sharedCounter;
         localExp1FinNbrDen01Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of exp1FinNbrDen01
	 *	@return exp1FinNbrDen01
	 */
	public char[]  getExp1FinNbrDen01String() {
	     return getCharArray(beginExp1FinNbrDen01,EXP_1_FIN_NBR_DEN_01_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean exp1FinNbrDen01IsNumeric() {
	    return isNumeric(beginExp1FinNbrDen01
	                    ,beginExp1FinNbrDen01 + EXP_1_FIN_NBR_DEN_01_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int EXP_1_FIN_NBR_DEN_01_LEN = 9;
  	/**
	 * serializeExp1FinNbrDen01
	 */
	protected void serializeExp1FinNbrDen01(long exp1FinNbrDen01) {
		 putNumber(beginExp1FinNbrDen01,exp1FinNbrDen01,EXP_1_FIN_NBR_DEN_01_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localExp1FinNbrDen01Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeExp1FinNbrDen01
	 */
   	protected  long serializeExp1FinNbrDen01(char[] value) {
	    long  exp1FinNbrDen01;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    exp1FinNbrDen01 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginExp1FinNbrDen01
		       ,9
		      );
		 localExp1FinNbrDen01Counter = shareString.getSerializedField().getModifiedCounter();
		return  exp1FinNbrDen01;
    }

   protected long checkExp1FinNbrDen01MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshExp1FinNbrDen01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshExp1FinNbrDen01() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginExp1FinNbrDen01
			                 ,EXP_1_FIN_NBR_DEN_01_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("exp1FinNbrDen01", beginExp1FinNbrDen01,EXP_1_FIN_NBR_DEN_01_LEN);
    }
   	}
     int localExp1FinFeeNbr01Counter = -1;
     public boolean isExp1FinFeeNbr01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExp1FinFeeNbr01Counter != sharedCounter;
         localExp1FinFeeNbr01Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of exp1FinFeeNbr01
	 *	@return exp1FinFeeNbr01
	 */
	public char[]  getExp1FinFeeNbr01String() {
	     return getCharArray(beginExp1FinFeeNbr01,EXP_1_FIN_FEE_NBR_01_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean exp1FinFeeNbr01IsNumeric() {
	    return isNumeric(beginExp1FinFeeNbr01
	                    ,beginExp1FinFeeNbr01 + EXP_1_FIN_FEE_NBR_01_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int EXP_1_FIN_FEE_NBR_01_LEN = 9;
  	/**
	 * serializeExp1FinFeeNbr01
	 */
	protected void serializeExp1FinFeeNbr01(long exp1FinFeeNbr01) {
		 putNumber(beginExp1FinFeeNbr01,exp1FinFeeNbr01,EXP_1_FIN_FEE_NBR_01_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localExp1FinFeeNbr01Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeExp1FinFeeNbr01
	 */
   	protected  long serializeExp1FinFeeNbr01(char[] value) {
	    long  exp1FinFeeNbr01;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    exp1FinFeeNbr01 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginExp1FinFeeNbr01
		       ,9
		      );
		 localExp1FinFeeNbr01Counter = shareString.getSerializedField().getModifiedCounter();
		return  exp1FinFeeNbr01;
    }

   protected long checkExp1FinFeeNbr01MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshExp1FinFeeNbr01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshExp1FinFeeNbr01() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginExp1FinFeeNbr01
			                 ,EXP_1_FIN_FEE_NBR_01_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("exp1FinFeeNbr01", beginExp1FinFeeNbr01,EXP_1_FIN_FEE_NBR_01_LEN);
    }
   	}
     int localExp1PctFeeNbr01Counter = -1;
     public boolean isExp1PctFeeNbr01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExp1PctFeeNbr01Counter != sharedCounter;
         localExp1PctFeeNbr01Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of exp1PctFeeNbr01
	 *	@return exp1PctFeeNbr01
	 */
	public char[]  getExp1PctFeeNbr01String() {
	     return getCharArray(beginExp1PctFeeNbr01,EXP_1_PCT_FEE_NBR_01_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean exp1PctFeeNbr01IsNumeric() {
	    return isNumeric(beginExp1PctFeeNbr01
	                    ,beginExp1PctFeeNbr01 + EXP_1_PCT_FEE_NBR_01_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int EXP_1_PCT_FEE_NBR_01_LEN = 9;
  	/**
	 * serializeExp1PctFeeNbr01
	 */
	protected void serializeExp1PctFeeNbr01(long exp1PctFeeNbr01) {
		 putNumber(beginExp1PctFeeNbr01,exp1PctFeeNbr01,EXP_1_PCT_FEE_NBR_01_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localExp1PctFeeNbr01Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeExp1PctFeeNbr01
	 */
   	protected  long serializeExp1PctFeeNbr01(char[] value) {
	    long  exp1PctFeeNbr01;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    exp1PctFeeNbr01 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginExp1PctFeeNbr01
		       ,9
		      );
		 localExp1PctFeeNbr01Counter = shareString.getSerializedField().getModifiedCounter();
		return  exp1PctFeeNbr01;
    }

   protected long checkExp1PctFeeNbr01MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshExp1PctFeeNbr01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshExp1PctFeeNbr01() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginExp1PctFeeNbr01
			                 ,EXP_1_PCT_FEE_NBR_01_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("exp1PctFeeNbr01", beginExp1PctFeeNbr01,EXP_1_PCT_FEE_NBR_01_LEN);
    }
   	}
     int localExp1NfinFeeNbr01Counter = -1;
     public boolean isExp1NfinFeeNbr01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExp1NfinFeeNbr01Counter != sharedCounter;
         localExp1NfinFeeNbr01Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of exp1NfinFeeNbr01
	 *	@return exp1NfinFeeNbr01
	 */
	public char[]  getExp1NfinFeeNbr01String() {
	     return getCharArray(beginExp1NfinFeeNbr01,EXP_1_NFIN_FEE_NBR_01_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean exp1NfinFeeNbr01IsNumeric() {
	    return isNumeric(beginExp1NfinFeeNbr01
	                    ,beginExp1NfinFeeNbr01 + EXP_1_NFIN_FEE_NBR_01_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int EXP_1_NFIN_FEE_NBR_01_LEN = 9;
  	/**
	 * serializeExp1NfinFeeNbr01
	 */
	protected void serializeExp1NfinFeeNbr01(long exp1NfinFeeNbr01) {
		 putNumber(beginExp1NfinFeeNbr01,exp1NfinFeeNbr01,EXP_1_NFIN_FEE_NBR_01_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localExp1NfinFeeNbr01Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeExp1NfinFeeNbr01
	 */
   	protected  long serializeExp1NfinFeeNbr01(char[] value) {
	    long  exp1NfinFeeNbr01;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    exp1NfinFeeNbr01 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginExp1NfinFeeNbr01
		       ,9
		      );
		 localExp1NfinFeeNbr01Counter = shareString.getSerializedField().getModifiedCounter();
		return  exp1NfinFeeNbr01;
    }

   protected long checkExp1NfinFeeNbr01MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshExp1NfinFeeNbr01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshExp1NfinFeeNbr01() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginExp1NfinFeeNbr01
			                 ,EXP_1_NFIN_FEE_NBR_01_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("exp1NfinFeeNbr01", beginExp1NfinFeeNbr01,EXP_1_NFIN_FEE_NBR_01_LEN);
    }
   	}
     int localExp1NbilFeeNbr01Counter = -1;
     public boolean isExp1NbilFeeNbr01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExp1NbilFeeNbr01Counter != sharedCounter;
         localExp1NbilFeeNbr01Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of exp1NbilFeeNbr01
	 *	@return exp1NbilFeeNbr01
	 */
	public char[]  getExp1NbilFeeNbr01String() {
	     return getCharArray(beginExp1NbilFeeNbr01,EXP_1_NBIL_FEE_NBR_01_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean exp1NbilFeeNbr01IsNumeric() {
	    return isNumeric(beginExp1NbilFeeNbr01
	                    ,beginExp1NbilFeeNbr01 + EXP_1_NBIL_FEE_NBR_01_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int EXP_1_NBIL_FEE_NBR_01_LEN = 9;
  	/**
	 * serializeExp1NbilFeeNbr01
	 */
	protected void serializeExp1NbilFeeNbr01(long exp1NbilFeeNbr01) {
		 putNumber(beginExp1NbilFeeNbr01,exp1NbilFeeNbr01,EXP_1_NBIL_FEE_NBR_01_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localExp1NbilFeeNbr01Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeExp1NbilFeeNbr01
	 */
   	protected  long serializeExp1NbilFeeNbr01(char[] value) {
	    long  exp1NbilFeeNbr01;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    exp1NbilFeeNbr01 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginExp1NbilFeeNbr01
		       ,9
		      );
		 localExp1NbilFeeNbr01Counter = shareString.getSerializedField().getModifiedCounter();
		return  exp1NbilFeeNbr01;
    }

   protected long checkExp1NbilFeeNbr01MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshExp1NbilFeeNbr01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshExp1NbilFeeNbr01() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginExp1NbilFeeNbr01
			                 ,EXP_1_NBIL_FEE_NBR_01_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("exp1NbilFeeNbr01", beginExp1NbilFeeNbr01,EXP_1_NBIL_FEE_NBR_01_LEN);
    }
   	}
     int localSub1FeeAmtCrCounter = -1;
     public boolean isSub1FeeAmtCrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSub1FeeAmtCrCounter != sharedCounter;
         localSub1FeeAmtCrCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of sub1FeeAmtCr
	 *	@return sub1FeeAmtCr
	 */
	public char[]  getSub1FeeAmtCrString() {
	     return getCharArray(beginSub1FeeAmtCr,SUB_1_FEE_AMT_CR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sub1FeeAmtCrIsNumeric() {
	    return isNumeric(beginSub1FeeAmtCr
	                    ,beginSub1FeeAmtCr + SUB_1_FEE_AMT_CR_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SUB_1_FEE_AMT_CR_LEN = 17;
  	/**
	 * serializeSub1FeeAmtCr
	 */
	protected void serializeSub1FeeAmtCr(long sub1FeeAmtCr) {
		 putNumber(beginSub1FeeAmtCr,sub1FeeAmtCr,SUB_1_FEE_AMT_CR_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSub1FeeAmtCrCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSub1FeeAmtCr
	 */
   	protected  long serializeSub1FeeAmtCr(char[] value) {
	    long  sub1FeeAmtCr;
	    if(value.length >0 && value.length!= 17)
            value = new String(value).trim().toCharArray();
	    if (value.length < 17) value = pad(17, value, ' ', LEFT_PAD);
	    else if (value.length > 17) value = substring(value,0,17);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    sub1FeeAmtCr = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(17,value,true/*isSigned?*/)
		       ,beginSub1FeeAmtCr
		       ,17
		      );
		 localSub1FeeAmtCrCounter = shareString.getSerializedField().getModifiedCounter();
		return  sub1FeeAmtCr;
    }

   protected long checkSub1FeeAmtCrMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100P/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshSub1FeeAmtCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSub1FeeAmtCr() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSub1FeeAmtCr
			                 ,SUB_1_FEE_AMT_CR_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("sub1FeeAmtCr", beginSub1FeeAmtCr,SUB_1_FEE_AMT_CR_LEN);
    }
   	}
     int localSub1FeeAmtDbCounter = -1;
     public boolean isSub1FeeAmtDbModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSub1FeeAmtDbCounter != sharedCounter;
         localSub1FeeAmtDbCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of sub1FeeAmtDb
	 *	@return sub1FeeAmtDb
	 */
	public char[]  getSub1FeeAmtDbString() {
	     return getCharArray(beginSub1FeeAmtDb,SUB_1_FEE_AMT_DB_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sub1FeeAmtDbIsNumeric() {
	    return isNumeric(beginSub1FeeAmtDb
	                    ,beginSub1FeeAmtDb + SUB_1_FEE_AMT_DB_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SUB_1_FEE_AMT_DB_LEN = 17;
  	/**
	 * serializeSub1FeeAmtDb
	 */
	protected void serializeSub1FeeAmtDb(long sub1FeeAmtDb) {
		 putNumber(beginSub1FeeAmtDb,sub1FeeAmtDb,SUB_1_FEE_AMT_DB_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSub1FeeAmtDbCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSub1FeeAmtDb
	 */
   	protected  long serializeSub1FeeAmtDb(char[] value) {
	    long  sub1FeeAmtDb;
	    if(value.length >0 && value.length!= 17)
            value = new String(value).trim().toCharArray();
	    if (value.length < 17) value = pad(17, value, ' ', LEFT_PAD);
	    else if (value.length > 17) value = substring(value,0,17);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    sub1FeeAmtDb = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(17,value,true/*isSigned?*/)
		       ,beginSub1FeeAmtDb
		       ,17
		      );
		 localSub1FeeAmtDbCounter = shareString.getSerializedField().getModifiedCounter();
		return  sub1FeeAmtDb;
    }

   protected long checkSub1FeeAmtDbMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100P/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshSub1FeeAmtDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSub1FeeAmtDb() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSub1FeeAmtDb
			                 ,SUB_1_FEE_AMT_DB_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("sub1FeeAmtDb", beginSub1FeeAmtDb,SUB_1_FEE_AMT_DB_LEN);
    }
   	}
     int localSub1FeeAmtNet01Counter = -1;
     public boolean isSub1FeeAmtNet01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSub1FeeAmtNet01Counter != sharedCounter;
         localSub1FeeAmtNet01Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of sub1FeeAmtNet01
	 *	@return sub1FeeAmtNet01
	 */
	public char[]  getSub1FeeAmtNet01String() {
	     return getCharArray(beginSub1FeeAmtNet01,SUB_1_FEE_AMT_NET_01_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sub1FeeAmtNet01IsNumeric() {
	    return isNumeric(beginSub1FeeAmtNet01
	                    ,beginSub1FeeAmtNet01 + SUB_1_FEE_AMT_NET_01_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SUB_1_FEE_AMT_NET_01_LEN = 17;
  	/**
	 * serializeSub1FeeAmtNet01
	 */
	protected void serializeSub1FeeAmtNet01(long sub1FeeAmtNet01) {
		 putNumber(beginSub1FeeAmtNet01,sub1FeeAmtNet01,SUB_1_FEE_AMT_NET_01_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSub1FeeAmtNet01Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSub1FeeAmtNet01
	 */
   	protected  long serializeSub1FeeAmtNet01(char[] value) {
	    long  sub1FeeAmtNet01;
	    if(value.length >0 && value.length!= 17)
            value = new String(value).trim().toCharArray();
	    if (value.length < 17) value = pad(17, value, ' ', LEFT_PAD);
	    else if (value.length > 17) value = substring(value,0,17);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    sub1FeeAmtNet01 = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(17,value,true/*isSigned?*/)
		       ,beginSub1FeeAmtNet01
		       ,17
		      );
		 localSub1FeeAmtNet01Counter = shareString.getSerializedField().getModifiedCounter();
		return  sub1FeeAmtNet01;
    }

   protected long checkSub1FeeAmtNet01MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100P/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshSub1FeeAmtNet01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSub1FeeAmtNet01() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSub1FeeAmtNet01
			                 ,SUB_1_FEE_AMT_NET_01_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("sub1FeeAmtNet01", beginSub1FeeAmtNet01,SUB_1_FEE_AMT_NET_01_LEN);
    }
   	}
     int localSub1FinAmt01Counter = -1;
     public boolean isSub1FinAmt01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSub1FinAmt01Counter != sharedCounter;
         localSub1FinAmt01Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of sub1FinAmt01
	 *	@return sub1FinAmt01
	 */
	public char[]  getSub1FinAmt01String() {
	     return getCharArray(beginSub1FinAmt01,SUB_1_FIN_AMT_01_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sub1FinAmt01IsNumeric() {
	    return isNumeric(beginSub1FinAmt01
	                    ,beginSub1FinAmt01 + SUB_1_FIN_AMT_01_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SUB_1_FIN_AMT_01_LEN = 18;
  	/**
	 * serializeSub1FinAmt01
	 */
	protected void serializeSub1FinAmt01(long sub1FinAmt01) {
		 putNumber(beginSub1FinAmt01,sub1FinAmt01,SUB_1_FIN_AMT_01_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSub1FinAmt01Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSub1FinAmt01
	 */
   	protected  long serializeSub1FinAmt01(char[] value) {
	    long  sub1FinAmt01;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    sub1FinAmt01 = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,true/*isSigned?*/)
		       ,beginSub1FinAmt01
		       ,18
		      );
		 localSub1FinAmt01Counter = shareString.getSerializedField().getModifiedCounter();
		return  sub1FinAmt01;
    }

   protected long checkSub1FinAmt01MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshSub1FinAmt01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSub1FinAmt01() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSub1FinAmt01
			                 ,SUB_1_FIN_AMT_01_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("sub1FinAmt01", beginSub1FinAmt01,SUB_1_FIN_AMT_01_LEN);
    }
   	}
     int localSub1FinNbr01Counter = -1;
     public boolean isSub1FinNbr01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSub1FinNbr01Counter != sharedCounter;
         localSub1FinNbr01Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of sub1FinNbr01
	 *	@return sub1FinNbr01
	 */
	public char[]  getSub1FinNbr01String() {
	     return getCharArray(beginSub1FinNbr01,SUB_1_FIN_NBR_01_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sub1FinNbr01IsNumeric() {
	    return isNumeric(beginSub1FinNbr01
	                    ,beginSub1FinNbr01 + SUB_1_FIN_NBR_01_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SUB_1_FIN_NBR_01_LEN = 9;
  	/**
	 * serializeSub1FinNbr01
	 */
	protected void serializeSub1FinNbr01(long sub1FinNbr01) {
		 putNumber(beginSub1FinNbr01,sub1FinNbr01,SUB_1_FIN_NBR_01_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSub1FinNbr01Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSub1FinNbr01
	 */
   	protected  long serializeSub1FinNbr01(char[] value) {
	    long  sub1FinNbr01;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    sub1FinNbr01 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginSub1FinNbr01
		       ,9
		      );
		 localSub1FinNbr01Counter = shareString.getSerializedField().getModifiedCounter();
		return  sub1FinNbr01;
    }

   protected long checkSub1FinNbr01MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSub1FinNbr01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSub1FinNbr01() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSub1FinNbr01
			                 ,SUB_1_FIN_NBR_01_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("sub1FinNbr01", beginSub1FinNbr01,SUB_1_FIN_NBR_01_LEN);
    }
   	}
     int localSub1FinNbrDen01Counter = -1;
     public boolean isSub1FinNbrDen01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSub1FinNbrDen01Counter != sharedCounter;
         localSub1FinNbrDen01Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of sub1FinNbrDen01
	 *	@return sub1FinNbrDen01
	 */
	public char[]  getSub1FinNbrDen01String() {
	     return getCharArray(beginSub1FinNbrDen01,SUB_1_FIN_NBR_DEN_01_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sub1FinNbrDen01IsNumeric() {
	    return isNumeric(beginSub1FinNbrDen01
	                    ,beginSub1FinNbrDen01 + SUB_1_FIN_NBR_DEN_01_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SUB_1_FIN_NBR_DEN_01_LEN = 9;
  	/**
	 * serializeSub1FinNbrDen01
	 */
	protected void serializeSub1FinNbrDen01(long sub1FinNbrDen01) {
		 putNumber(beginSub1FinNbrDen01,sub1FinNbrDen01,SUB_1_FIN_NBR_DEN_01_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSub1FinNbrDen01Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSub1FinNbrDen01
	 */
   	protected  long serializeSub1FinNbrDen01(char[] value) {
	    long  sub1FinNbrDen01;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    sub1FinNbrDen01 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginSub1FinNbrDen01
		       ,9
		      );
		 localSub1FinNbrDen01Counter = shareString.getSerializedField().getModifiedCounter();
		return  sub1FinNbrDen01;
    }

   protected long checkSub1FinNbrDen01MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSub1FinNbrDen01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSub1FinNbrDen01() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSub1FinNbrDen01
			                 ,SUB_1_FIN_NBR_DEN_01_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("sub1FinNbrDen01", beginSub1FinNbrDen01,SUB_1_FIN_NBR_DEN_01_LEN);
    }
   	}
     int localSub1FinFeeNbr01Counter = -1;
     public boolean isSub1FinFeeNbr01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSub1FinFeeNbr01Counter != sharedCounter;
         localSub1FinFeeNbr01Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of sub1FinFeeNbr01
	 *	@return sub1FinFeeNbr01
	 */
	public char[]  getSub1FinFeeNbr01String() {
	     return getCharArray(beginSub1FinFeeNbr01,SUB_1_FIN_FEE_NBR_01_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sub1FinFeeNbr01IsNumeric() {
	    return isNumeric(beginSub1FinFeeNbr01
	                    ,beginSub1FinFeeNbr01 + SUB_1_FIN_FEE_NBR_01_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SUB_1_FIN_FEE_NBR_01_LEN = 9;
  	/**
	 * serializeSub1FinFeeNbr01
	 */
	protected void serializeSub1FinFeeNbr01(long sub1FinFeeNbr01) {
		 putNumber(beginSub1FinFeeNbr01,sub1FinFeeNbr01,SUB_1_FIN_FEE_NBR_01_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSub1FinFeeNbr01Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSub1FinFeeNbr01
	 */
   	protected  long serializeSub1FinFeeNbr01(char[] value) {
	    long  sub1FinFeeNbr01;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    sub1FinFeeNbr01 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginSub1FinFeeNbr01
		       ,9
		      );
		 localSub1FinFeeNbr01Counter = shareString.getSerializedField().getModifiedCounter();
		return  sub1FinFeeNbr01;
    }

   protected long checkSub1FinFeeNbr01MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSub1FinFeeNbr01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSub1FinFeeNbr01() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSub1FinFeeNbr01
			                 ,SUB_1_FIN_FEE_NBR_01_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("sub1FinFeeNbr01", beginSub1FinFeeNbr01,SUB_1_FIN_FEE_NBR_01_LEN);
    }
   	}
     int localSub1PctFeeNbr01Counter = -1;
     public boolean isSub1PctFeeNbr01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSub1PctFeeNbr01Counter != sharedCounter;
         localSub1PctFeeNbr01Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of sub1PctFeeNbr01
	 *	@return sub1PctFeeNbr01
	 */
	public char[]  getSub1PctFeeNbr01String() {
	     return getCharArray(beginSub1PctFeeNbr01,SUB_1_PCT_FEE_NBR_01_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sub1PctFeeNbr01IsNumeric() {
	    return isNumeric(beginSub1PctFeeNbr01
	                    ,beginSub1PctFeeNbr01 + SUB_1_PCT_FEE_NBR_01_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SUB_1_PCT_FEE_NBR_01_LEN = 9;
  	/**
	 * serializeSub1PctFeeNbr01
	 */
	protected void serializeSub1PctFeeNbr01(long sub1PctFeeNbr01) {
		 putNumber(beginSub1PctFeeNbr01,sub1PctFeeNbr01,SUB_1_PCT_FEE_NBR_01_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSub1PctFeeNbr01Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSub1PctFeeNbr01
	 */
   	protected  long serializeSub1PctFeeNbr01(char[] value) {
	    long  sub1PctFeeNbr01;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    sub1PctFeeNbr01 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginSub1PctFeeNbr01
		       ,9
		      );
		 localSub1PctFeeNbr01Counter = shareString.getSerializedField().getModifiedCounter();
		return  sub1PctFeeNbr01;
    }

   protected long checkSub1PctFeeNbr01MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSub1PctFeeNbr01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSub1PctFeeNbr01() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSub1PctFeeNbr01
			                 ,SUB_1_PCT_FEE_NBR_01_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("sub1PctFeeNbr01", beginSub1PctFeeNbr01,SUB_1_PCT_FEE_NBR_01_LEN);
    }
   	}
     int localSub1NfinFeeNbr01Counter = -1;
     public boolean isSub1NfinFeeNbr01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSub1NfinFeeNbr01Counter != sharedCounter;
         localSub1NfinFeeNbr01Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of sub1NfinFeeNbr01
	 *	@return sub1NfinFeeNbr01
	 */
	public char[]  getSub1NfinFeeNbr01String() {
	     return getCharArray(beginSub1NfinFeeNbr01,SUB_1_NFIN_FEE_NBR_01_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sub1NfinFeeNbr01IsNumeric() {
	    return isNumeric(beginSub1NfinFeeNbr01
	                    ,beginSub1NfinFeeNbr01 + SUB_1_NFIN_FEE_NBR_01_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SUB_1_NFIN_FEE_NBR_01_LEN = 9;
  	/**
	 * serializeSub1NfinFeeNbr01
	 */
	protected void serializeSub1NfinFeeNbr01(long sub1NfinFeeNbr01) {
		 putNumber(beginSub1NfinFeeNbr01,sub1NfinFeeNbr01,SUB_1_NFIN_FEE_NBR_01_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSub1NfinFeeNbr01Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSub1NfinFeeNbr01
	 */
   	protected  long serializeSub1NfinFeeNbr01(char[] value) {
	    long  sub1NfinFeeNbr01;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    sub1NfinFeeNbr01 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginSub1NfinFeeNbr01
		       ,9
		      );
		 localSub1NfinFeeNbr01Counter = shareString.getSerializedField().getModifiedCounter();
		return  sub1NfinFeeNbr01;
    }

   protected long checkSub1NfinFeeNbr01MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSub1NfinFeeNbr01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSub1NfinFeeNbr01() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSub1NfinFeeNbr01
			                 ,SUB_1_NFIN_FEE_NBR_01_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("sub1NfinFeeNbr01", beginSub1NfinFeeNbr01,SUB_1_NFIN_FEE_NBR_01_LEN);
    }
   	}
     int localSub1NbilFeeNbr01Counter = -1;
     public boolean isSub1NbilFeeNbr01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSub1NbilFeeNbr01Counter != sharedCounter;
         localSub1NbilFeeNbr01Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of sub1NbilFeeNbr01
	 *	@return sub1NbilFeeNbr01
	 */
	public char[]  getSub1NbilFeeNbr01String() {
	     return getCharArray(beginSub1NbilFeeNbr01,SUB_1_NBIL_FEE_NBR_01_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sub1NbilFeeNbr01IsNumeric() {
	    return isNumeric(beginSub1NbilFeeNbr01
	                    ,beginSub1NbilFeeNbr01 + SUB_1_NBIL_FEE_NBR_01_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SUB_1_NBIL_FEE_NBR_01_LEN = 9;
  	/**
	 * serializeSub1NbilFeeNbr01
	 */
	protected void serializeSub1NbilFeeNbr01(long sub1NbilFeeNbr01) {
		 putNumber(beginSub1NbilFeeNbr01,sub1NbilFeeNbr01,SUB_1_NBIL_FEE_NBR_01_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSub1NbilFeeNbr01Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSub1NbilFeeNbr01
	 */
   	protected  long serializeSub1NbilFeeNbr01(char[] value) {
	    long  sub1NbilFeeNbr01;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    sub1NbilFeeNbr01 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginSub1NbilFeeNbr01
		       ,9
		      );
		 localSub1NbilFeeNbr01Counter = shareString.getSerializedField().getModifiedCounter();
		return  sub1NbilFeeNbr01;
    }

   protected long checkSub1NbilFeeNbr01MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSub1NbilFeeNbr01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSub1NbilFeeNbr01() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSub1NbilFeeNbr01
			                 ,SUB_1_NBIL_FEE_NBR_01_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("sub1NbilFeeNbr01", beginSub1NbilFeeNbr01,SUB_1_NBIL_FEE_NBR_01_LEN);
    }
   	}
     int localSaveWsAmtepCounter = -1;
     public boolean isSaveWsAmtepModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSaveWsAmtepCounter != sharedCounter;
         localSaveWsAmtepCounter = sharedCounter; return hasModified;
     }

   protected char[] checkSaveWsAmtepConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
     int localSaveWsAmtdt4Counter = -1;
     public boolean isSaveWsAmtdt4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSaveWsAmtdt4Counter != sharedCounter;
         localSaveWsAmtdt4Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSaveWsAmtdt4Constraints(char[] value) {
   			return super.checkConstraints(value , 24 ,false, false);
   }
     int localSaveWsAmteCounter = -1;
     public boolean isSaveWsAmteModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSaveWsAmteCounter != sharedCounter;
         localSaveWsAmteCounter = sharedCounter; return hasModified;
     }

   protected char[] checkSaveWsAmteConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
     int localSwTranEofCounter = -1;
     public boolean isSwTranEofModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSwTranEofCounter != sharedCounter;
         localSwTranEofCounter = sharedCounter; return hasModified;
     }

   protected char[] checkSwTranEofConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localTranApcCounter = -1;
     public boolean isTranApcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTranApcCounter != sharedCounter;
         localTranApcCounter = sharedCounter; return hasModified;
     }

   protected char[] checkTranApcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localTranIcaCounter = -1;
     public boolean isTranIcaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTranIcaCounter != sharedCounter;
         localTranIcaCounter = sharedCounter; return hasModified;
     }

   protected char[] checkTranIcaConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localMaxDaysCounter = -1;
     public boolean isMaxDaysModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMaxDaysCounter != sharedCounter;
         localMaxDaysCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of maxDays
	 *	@return maxDays
	 */
	public char[]  getMaxDaysString() {
	     return getCharArray(beginMaxDays,MAX_DAYS_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean maxDaysIsNumeric() {
	    return isNumeric(beginMaxDays
	                    ,beginMaxDays + MAX_DAYS_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MAX_DAYS_LEN = 2;
  	/**
	 * serializeMaxDays
	 */
	protected void serializeMaxDays(int maxDays) {
		 putNumber(beginMaxDays,maxDays,MAX_DAYS_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMaxDaysCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMaxDays
	 */
   	protected  int serializeMaxDays(char[] value) {
	    int  maxDays;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    maxDays = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginMaxDays
		       ,2
		      );
		 localMaxDaysCounter = shareString.getSerializedField().getModifiedCounter();
		return  maxDays;
    }

   protected int checkMaxDaysMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMaxDays is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMaxDays() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMaxDays
			                 ,MAX_DAYS_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("maxDays", beginMaxDays,MAX_DAYS_LEN);
    }
   	}
     int localMessage1Counter = -1;
     public boolean isMessage1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMessage1Counter != sharedCounter;
         localMessage1Counter = sharedCounter; return hasModified;
     }

   protected char[] checkMessage1Constraints(char[] value) {
   			return super.checkConstraints(value , 100 ,false, false);
   }
     int localMessage2Counter = -1;
     public boolean isMessage2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMessage2Counter != sharedCounter;
         localMessage2Counter = sharedCounter; return hasModified;
     }

   protected char[] checkMessage2Constraints(char[] value) {
   			return super.checkConstraints(value , 100 ,false, false);
   }
     int localMessage3Counter = -1;
     public boolean isMessage3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMessage3Counter != sharedCounter;
         localMessage3Counter = sharedCounter; return hasModified;
     }

   protected char[] checkMessage3Constraints(char[] value) {
   			return super.checkConstraints(value , 100 ,false, false);
   }
     int localMsg002NoParmInTypeCounter = -1;
     public boolean isMsg002NoParmInTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsg002NoParmInTypeCounter != sharedCounter;
         localMsg002NoParmInTypeCounter = sharedCounter; return hasModified;
     }

   protected char[] checkMsg002NoParmInTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 100 ,false, false);
   }
     int localMcrInCntCounter = -1;
     public boolean isMcrInCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMcrInCntCounter != sharedCounter;
         localMcrInCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of mcrInCnt
	 *	@return mcrInCnt
	 */
	public char[]  getMcrInCntString() {
	     return getCharArray(beginMcrInCnt,MCR_IN_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean mcrInCntIsNumeric() {
	    return isNumeric(beginMcrInCnt
	                    ,beginMcrInCnt + MCR_IN_CNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MCR_IN_CNT_LEN = 7;
  	/**
	 * serializeMcrInCnt
	 */
	protected void serializeMcrInCnt(long mcrInCnt) {
		 putNumber(beginMcrInCnt,mcrInCnt,MCR_IN_CNT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMcrInCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMcrInCnt
	 */
   	protected  long serializeMcrInCnt(char[] value) {
	    long  mcrInCnt;
	    if(value.length >0 && value.length!= 7)
            value = new String(value).trim().toCharArray();
	    if (value.length < 7) value = pad(7, value, ' ', LEFT_PAD);
	    else if (value.length > 7) value = substring(value,0,7);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    mcrInCnt = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(7,value,false/*isSigned?*/)
		       ,beginMcrInCnt
		       ,7
		      );
		 localMcrInCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  mcrInCnt;
    }

   protected long checkMcrInCntMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMcrInCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMcrInCnt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMcrInCnt
			                 ,MCR_IN_CNT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("mcrInCnt", beginMcrInCnt,MCR_IN_CNT_LEN);
    }
   	}
     int localMcrSkippedCntCounter = -1;
     public boolean isMcrSkippedCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMcrSkippedCntCounter != sharedCounter;
         localMcrSkippedCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of mcrSkippedCnt
	 *	@return mcrSkippedCnt
	 */
	public char[]  getMcrSkippedCntString() {
	     return getCharArray(beginMcrSkippedCnt,MCR_SKIPPED_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean mcrSkippedCntIsNumeric() {
	    return isNumeric(beginMcrSkippedCnt
	                    ,beginMcrSkippedCnt + MCR_SKIPPED_CNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MCR_SKIPPED_CNT_LEN = 7;
  	/**
	 * serializeMcrSkippedCnt
	 */
	protected void serializeMcrSkippedCnt(long mcrSkippedCnt) {
		 putNumber(beginMcrSkippedCnt,mcrSkippedCnt,MCR_SKIPPED_CNT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMcrSkippedCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMcrSkippedCnt
	 */
   	protected  long serializeMcrSkippedCnt(char[] value) {
	    long  mcrSkippedCnt;
	    if(value.length >0 && value.length!= 7)
            value = new String(value).trim().toCharArray();
	    if (value.length < 7) value = pad(7, value, ' ', LEFT_PAD);
	    else if (value.length > 7) value = substring(value,0,7);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    mcrSkippedCnt = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(7,value,false/*isSigned?*/)
		       ,beginMcrSkippedCnt
		       ,7
		      );
		 localMcrSkippedCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  mcrSkippedCnt;
    }

   protected long checkMcrSkippedCntMaxLimit(long number) {

        return checkMaxLimit(number , MAX_10M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMcrSkippedCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMcrSkippedCnt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMcrSkippedCnt
			                 ,MCR_SKIPPED_CNT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("mcrSkippedCnt", beginMcrSkippedCnt,MCR_SKIPPED_CNT_LEN);
    }
   	}
     int localMonthSubCounter = -1;
     public boolean isMonthSubModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMonthSubCounter != sharedCounter;
         localMonthSubCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of monthSub
	 *	@return monthSub
	 */
	public char[]  getMonthSubString() {
	     return getCharArray(beginMonthSub,MONTH_SUB_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean monthSubIsNumeric() {
	    return isNumeric(beginMonthSub
	                    ,beginMonthSub + MONTH_SUB_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MONTH_SUB_LEN = 2;
  	/**
	 * serializeMonthSub
	 */
	protected void serializeMonthSub(int monthSub) {
		 putNumber(beginMonthSub,monthSub,MONTH_SUB_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMonthSubCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMonthSub
	 */
   	protected  int serializeMonthSub(char[] value) {
	    int  monthSub;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    monthSub = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginMonthSub
		       ,2
		      );
		 localMonthSubCounter = shareString.getSerializedField().getModifiedCounter();
		return  monthSub;
    }

   protected int checkMonthSubMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMonthSub is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMonthSub() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMonthSub
			                 ,MONTH_SUB_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("monthSub", beginMonthSub,MONTH_SUB_LEN);
    }
   	}
     int localX360HeaderCuttime01Counter = -1;
     public boolean isX360HeaderCuttime01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360HeaderCuttime01Counter != sharedCounter;
         localX360HeaderCuttime01Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360HeaderCuttime01
	 *	@return x360HeaderCuttime01
	 */
	public char[]  getX360HeaderCuttime01String() {
	     return getCharArray(beginX360HeaderCuttime01,X_360_HEADER_CUTTIME_01_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360HeaderCuttime01IsNumeric() {
	    return isNumeric(beginX360HeaderCuttime01
	                    ,beginX360HeaderCuttime01 + X_360_HEADER_CUTTIME_01_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_HEADER_CUTTIME_01_LEN = 4;
  	/**
	 * serializeX360HeaderCuttime01
	 */
	protected void serializeX360HeaderCuttime01(int x360HeaderCuttime01) {
		 putNumber(beginX360HeaderCuttime01,x360HeaderCuttime01,X_360_HEADER_CUTTIME_01_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360HeaderCuttime01Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360HeaderCuttime01
	 */
   	protected  int serializeX360HeaderCuttime01(char[] value) {
	    int  x360HeaderCuttime01;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360HeaderCuttime01 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginX360HeaderCuttime01
		       ,4
		      );
		 localX360HeaderCuttime01Counter = shareString.getSerializedField().getModifiedCounter();
		return  x360HeaderCuttime01;
    }

   protected int checkX360HeaderCuttime01MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360HeaderCuttime01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360HeaderCuttime01() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginX360HeaderCuttime01
			                 ,X_360_HEADER_CUTTIME_01_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360HeaderCuttime01", beginX360HeaderCuttime01,X_360_HEADER_CUTTIME_01_LEN);
    }
   	}
     int localX360SrtAcqIssId01Counter = -1;
     public boolean isX360SrtAcqIssId01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360SrtAcqIssId01Counter != sharedCounter;
         localX360SrtAcqIssId01Counter = sharedCounter; return hasModified;
     }

   protected char[] checkX360SrtAcqIssId01Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localInhProcFlagCounter = -1;
     public boolean isInhProcFlagModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInhProcFlagCounter != sharedCounter;
         localInhProcFlagCounter = sharedCounter; return hasModified;
     }

   protected char[] checkInhProcFlagConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localMceSw1Counter = -1;
     public boolean isMceSw1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMceSw1Counter != sharedCounter;
         localMceSw1Counter = sharedCounter; return hasModified;
     }

   protected char[] checkMceSw1Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localMceSw2Counter = -1;
     public boolean isMceSw2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMceSw2Counter != sharedCounter;
         localMceSw2Counter = sharedCounter; return hasModified;
     }

   protected char[] checkMceSw2Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localNetmceTotCounter = -1;
     public boolean isNetmceTotModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNetmceTotCounter != sharedCounter;
         localNetmceTotCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of netmceTot
	 *	@return netmceTot
	 */
	public char[]  getNetmceTotString() {
	     return getCharArray(beginNetmceTot,NETMCE_TOT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean netmceTotIsNumeric() {
	    return isNumeric(beginNetmceTot
	                    ,beginNetmceTot + NETMCE_TOT_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int NETMCE_TOT_LEN = 15;
  	/**
	 * serializeNetmceTot
	 */
	protected void serializeNetmceTot(long netmceTot) {
		 putNumber(beginNetmceTot,netmceTot,NETMCE_TOT_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localNetmceTotCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeNetmceTot
	 */
   	protected  long serializeNetmceTot(char[] value) {
	    long  netmceTot;
	    if(value.length >0 && value.length!= 15)
            value = new String(value).trim().toCharArray();
	    if (value.length < 15) value = pad(15, value, ' ', LEFT_PAD);
	    else if (value.length > 15) value = substring(value,0,15);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    netmceTot = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(15,value,true/*isSigned?*/)
		       ,beginNetmceTot
		       ,15
		      );
		 localNetmceTotCounter = shareString.getSerializedField().getModifiedCounter();
		return  netmceTot;
    }

   protected long checkNetmceTotMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1P/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshNetmceTot is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshNetmceTot() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginNetmceTot
			                 ,NETMCE_TOT_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("netmceTot", beginNetmceTot,NETMCE_TOT_LEN);
    }
   	}




}
  
