  package com.cloudframe.app.process;
  /* 
*------------------------
*------------------------
*---------------------
*/
  
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.utility.CFUtil;
  import java.util.ArrayList;
  import com.cloudframe.app.data.Field;
  import java.util.Map;
  import java.util.HashMap;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.cpsc4.dto.*;
  import com.cloudframe.app.cpsc4.dto.S0v3DtlMdlData;
  import com.cloudframe.app.cpsc4.dto.S0v3DtlRsrchData;
  import com.cloudframe.app.cpsc4.dto.S0v3DtlCatAvGeData;
  import com.cloudframe.app.cpsc4.dto.S0v3DtlDriftData;
  import com.cloudframe.app.cpsc4.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("cpsc4")
  
  public class Cpsc4 extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Cpsc4.class);
  
  private S0v3DtlMdlData s0v3DtlMdlData = new S0v3DtlMdlData() ;
  private S0v3DtlRsrchData s0v3DtlRsrchData = new S0v3DtlRsrchData() ;
  private S0v3DtlCatAvGeData s0v3DtlCatAvGeData = new S0v3DtlCatAvGeData() ;
  private S0v3DtlDriftData s0v3DtlDriftData = new S0v3DtlDriftData() ;
  private Work work = new Work() ;
  
  
  
  
  
  
  
  
  
      /**
      * process 
      * Input  :  

      * - s0v3DtlMdlData                 COBOL Name: WS-S0V3-DTL-MDL-DATA
      * - s0v3DtlCatAvGeData             COBOL Name: WS-S0V3-DTL-CAT-AV-GE-DATA
      * - s0v3DtlDriftData               COBOL Name: WS-S0V3-DTL-DRIFT-DATA
      * - s0v3DtlRsrchData               COBOL Name: WS-S0V3-DTL-RSRCH-DATA
      *
      * Output :  

      * - advsryMdlId                    COBOL Name: WS-ADVSRY-MDL-ID
      * - mdlTmpltTyCd                   COBOL Name: WS-MDL-TMPLT-TY-CD
      * - acctSvcTyCd                    COBOL Name: WS-ACCT-SVC-TY-CD
      * - advsryRsrchTyCd                COBOL Name: WS-ADVSRY-RSRCH-TY-CD
      * - portObjCd                      COBOL Name: WS-PORT-OBJ-CD
      * - minInvstAmt                    COBOL Name: WS-MIN-INVST-AMT
      * - begEffDate                     COBOL Name: WS-BEG-EFF-DATE
      * - clsNewMnyInd                   COBOL Name: WS-CLS-NEW-MNY-IND
      * - rebalAtmptCnt                  COBOL Name: WS-REBAL-ATMPT-CNT
      * - advsryMdlNa                    COBOL Name: WS-ADVSRY-MDL-NA
      * - advsrySubAdviseCd              COBOL Name: WS-ADVSRY-SUB-ADVISE-CD
      * - taxSnstvInd                    COBOL Name: WS-TAX-SNSTV-IND
      * - mdlSerTyCd                     COBOL Name: WS-MDL-SER-TY-CD
      * - advsryMdlVerCd                 COBOL Name: WS-ADVSRY-MDL-VER-CD
      * - advsryMdlBnchmkCd              COBOL Name: WS-ADVSRY-MDL-BNCHMK-CD
      * - mdlThresTyCd                   COBOL Name: WS-MDL-THRES-TY-CD
      * - endEffDa                       COBOL Name: WS-END-EFF-DA
      * - advsryMdlTyCd                  COBOL Name: WS-ADVSRY-MDL-TY-CD
      * - invstObjCd                     COBOL Name: WS-INVST-OBJ-CD
      * - invstPct                       COBOL Name: WS-INVST-PCT
      * - minTrgtDriftPct                COBOL Name: WS-MIN-TRGT-DRIFT-PCT
      * - maxTrgtDriftPct                COBOL Name: WS-MAX-TRGT-DRIFT-PCT
      * - mdlDriftBandTyCd               COBOL Name: WS-MDL-DRIFT-BAND-TY-CD
      * - mdlDriftTyCd                   COBOL Name: WS-MDL-DRIFT-TY-CD
      * - allocTrgtFromPct               COBOL Name: WS-ALLOC-TRGT-FROM-PCT
      * - allocTrgtToPct                 COBOL Name: WS-ALLOC-TRGT-TO-PCT
      * - minDriftPct                    COBOL Name: WS-MIN-DRIFT-PCT
      * - maxDriftPct                    COBOL Name: WS-MAX-DRIFT-PCT
      * - cusipOrSmaId                   COBOL Name: WS-CUSIP-OR-SMA-ID
      * - prodInvstObjCd                 COBOL Name: WS-PROD-INVST-OBJ-CD
      * - prodInvstAllocPct              COBOL Name: WS-PROD-INVST-ALLOC-PCT
      * - prodMinTrgtDriftPct            COBOL Name: WS-PROD-MIN-TRGT-DRIFT-PCT
      * - prodMaxTrgtDriftPct            COBOL Name: WS-PROD-MAX-TRGT-DRIFT-PCT
      * - driftDataCnt                   COBOL Name: WS-DRIFT-DATA-CNT
      * - driftFlag                      COBOL Name: WS-DRIFT-FLAG
      * - s0v3DtlRec                     COBOL Name: WS-S0V3-DTL-REC
      *
      * @throws CFException
      */
      @Override
      public int process() throws Exception {
       initVars();
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			// End of variable declaration

       try {
       setCodePage("1047");
//  MOVE 'ADVSRY' TO WS-ADVSRY-MDL-ID
//  LITERAL_ADVSRY = 'ADVSRY'
          s0v3DtlMdlData.setAdvsryMdlId(CONSTANTS.LITERAL_ADVSRY);
//  MOVE 'TMP' TO WS-MDL-TMPLT-TY-CD
//  LITERAL_TMP = 'TMP'
          s0v3DtlMdlData.setMdlTmpltTyCd(CONSTANTS.LITERAL_TMP);
//  MOVE 'SV' TO WS-ACCT-SVC-TY-CD
//  LITERAL_SV = 'SV'
          s0v3DtlMdlData.setAcctSvcTyCd(CONSTANTS.LITERAL_SV);
//  MOVE 'C' TO WS-ADVSRY-RSRCH-TY-CD
//  LITERAL_C = 'C'
          s0v3DtlMdlData.setAdvsryRsrchTyCd(CONSTANTS.LITERAL_C);
//  MOVE 'OB' TO WS-PORT-OBJ-CD
//  LITERAL_OB = 'OB'
          s0v3DtlMdlData.setPortObjCd(CONSTANTS.LITERAL_OB);
          // MOVE 156789 TO WS-MIN-INVST-AMT
          s0v3DtlMdlData.setMinInvstAmt((long)156789);
//  MOVE 'BEGEFFDATE' TO WS-BEG-EFF-DATE
//  LITERAL_BEGEFFDATE = 'BEGEFFDATE'
          s0v3DtlMdlData.setBegEffDate(CONSTANTS.LITERAL_BEGEFFDATE);
//  MOVE 'I' TO WS-CLS-NEW-MNY-IND
//  LITERAL_I = 'I'
          s0v3DtlMdlData.setClsNewMnyInd(CONSTANTS.LITERAL_I);
//  MOVE 'ATMP' TO WS-REBAL-ATMPT-CNT
//  LITERAL_ATMP = 'ATMP'
          s0v3DtlMdlData.setRebalAtmptCnt(CONSTANTS.LITERAL_ATMP);
//  MOVE 'SOME RANDOM 80 CHARS' TO WS-ADVSRY-MDL-NA
          s0v3DtlMdlData.setAdvsryMdlNa(CONSTANTS.LITERAL_59855490);
//  MOVE 'A' TO WS-ADVSRY-SUB-ADVISE-CD
//  LITERAL_A = 'A'
          s0v3DtlMdlData.setAdvsrySubAdviseCd(CONSTANTS.LITERAL_A);
//  MOVE 'B' TO WS-TAX-SNSTV-IND
//  LITERAL_B = 'B'
          s0v3DtlMdlData.setTaxSnstvInd(CONSTANTS.LITERAL_B);
//  MOVE 'SERT' TO WS-MDL-SER-TY-CD
//  LITERAL_SERT = 'SERT'
          s0v3DtlMdlData.setMdlSerTyCd(CONSTANTS.LITERAL_SERT);
//  MOVE 'VERCD' TO WS-ADVSRY-MDL-VER-CD
//  LITERAL_VERCD = 'VERCD'
          s0v3DtlMdlData.setAdvsryMdlVerCd(CONSTANTS.LITERAL_VERCD);
//  MOVE 'BNCHM' TO WS-ADVSRY-MDL-BNCHMK-CD
//  LITERAL_BNCHM = 'BNCHM'
          s0v3DtlMdlData.setAdvsryMdlBnchmkCd(CONSTANTS.LITERAL_BNCHM);
//  MOVE 'C' TO WS-MDL-THRES-TY-CD
//  LITERAL_C = 'C'
          s0v3DtlMdlData.setMdlThresTyCd(CONSTANTS.LITERAL_C);
//  MOVE 'ENDEFFDA' TO WS-END-EFF-DA
          s0v3DtlMdlData.setEndEffDa(CONSTANTS.LITERAL_ENDEFFDA_B2_);
//  MOVE 'DEF' TO WS-ADVSRY-MDL-TY-CD
//  LITERAL_DEF = 'DEF'
          s0v3DtlMdlData.setAdvsryMdlTyCd(CONSTANTS.LITERAL_DEF);
//  MOVE 'G' TO WS-INVST-OBJ-CD (1)
//  LITERAL_G = 'G'
          s0v3DtlCatAvGeData.getCatAvGeData(0).setInvstObjCd(CONSTANTS.LITERAL_G);
//  MOVE 50 TO WS-INVST-PCT (1)
//  LITERAL_50 = 50, FORMAT_34169195 = "ZZ9"
          s0v3DtlCatAvGeData.getCatAvGeData(0).setInvstPct(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_34169195,CONSTANTS.LITERAL_50));
//  MOVE 1.5 TO WS-MIN-TRGT-DRIFT-PCT (1)
//  LITERAL_32905356 = 1.5, FORMAT_27653163 = "ZZ9.99"
          s0v3DtlCatAvGeData.getCatAvGeData(0).setMinTrgtDriftPct(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_27653163,CONSTANTS.LITERAL_32905356));
//  MOVE 2.5 TO WS-MAX-TRGT-DRIFT-PCT (1)
//  LITERAL_32935147 = 2.5, FORMAT_27653163 = "ZZ9.99"
          s0v3DtlCatAvGeData.getCatAvGeData(0).setMaxTrgtDriftPct(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_27653163,CONSTANTS.LITERAL_32935147));
//  MOVE 'H' TO WS-MDL-DRIFT-BAND-TY-CD (1)
//  LITERAL_H = 'H'
          s0v3DtlDriftData.getDriftData(0).setMdlDriftBandTyCd(CONSTANTS.LITERAL_H);
//  MOVE 'I' TO WS-MDL-DRIFT-TY-CD (1)
//  LITERAL_I = 'I'
          s0v3DtlDriftData.getDriftData(0).setMdlDriftTyCd(CONSTANTS.LITERAL_I);
//  MOVE 50 TO WS-ALLOC-TRGT-FROM-PCT (1)
//  LITERAL_50 = 50, FORMAT_34169195 = "ZZ9"
          s0v3DtlDriftData.getDriftData(0).setAllocTrgtFromPct(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_34169195,CONSTANTS.LITERAL_50));
//  MOVE 60 TO WS-ALLOC-TRGT-TO-PCT (1)
//  LITERAL_60 = 60, FORMAT_34169195 = "ZZ9"
          s0v3DtlDriftData.getDriftData(0).setAllocTrgtToPct(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_34169195,CONSTANTS.LITERAL_60));
//  MOVE -1.23 TO WS-MIN-DRIFT-PCT (1)
//  LITERAL_1445338457 = -1.23, FORMAT_725264259 = "-ZZZ.99"
          s0v3DtlDriftData.getDriftData(0).setMinDriftPct(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_725264259,CONSTANTS.LITERAL_1445338457));
//  MOVE -2.34 TO WS-MAX-DRIFT-PCT (1)
//  LITERAL_1446262970 = -2.34, FORMAT_725264259 = "-ZZZ.99"
          s0v3DtlDriftData.getDriftData(0).setMaxDriftPct(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_725264259,CONSTANTS.LITERAL_1446262970));
//  MOVE 'CUSIP123' TO WS-CUSIP-OR-SMA-ID (1)
          s0v3DtlRsrchData.getRsrchData(0).setCusipOrSmaId(CONSTANTS.LITERAL_CUSIP123_B_);
//  MOVE 'J' TO WS-PROD-INVST-OBJ-CD (1)
//  LITERAL_J = 'J'
          s0v3DtlRsrchData.getRsrchData(0).setProdInvstObjCd(CONSTANTS.LITERAL_J);
//  MOVE -12.34 TO WS-PROD-INVST-ALLOC-PCT (1)
//  LITERAL_1859394719 = -12.34, FORMAT_725296995 = "-ZZZ.ZZ"
          s0v3DtlRsrchData.getRsrchData(0).setProdInvstAllocPct(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_725296995,CONSTANTS.LITERAL_1859394719));
//  MOVE -1.23 TO WS-PROD-MIN-TRGT-DRIFT-PCT (1)
//  LITERAL_1445338457 = -1.23, FORMAT_725296995 = "-ZZZ.ZZ"
          s0v3DtlRsrchData.getRsrchData(0).setProdMinTrgtDriftPct(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_725296995,CONSTANTS.LITERAL_1445338457));
//  MOVE -2.34 TO WS-PROD-MAX-TRGT-DRIFT-PCT (1)
//  LITERAL_1446262970 = -2.34, FORMAT_725296995 = "-ZZZ.ZZ"
          s0v3DtlRsrchData.getRsrchData(0).setProdMaxTrgtDriftPct(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_725296995,CONSTANTS.LITERAL_1446262970));
          // MOVE +12 TO WS-DRIFT-DATA-CNT
          work.setDriftDataCnt(12);
//  SET WS-DRIFT-FOUND TO TRUE
          work.setDriftFoundTrue(); 
          
//  IF WS-DRIFT-FOUND
          if ( work.isDriftFound()  ) { 
//  STRING WS-S0V3-DTL-MDL-DATA WS-S0V3-DTL-CAT-AV-GE-DATA WS-S0V3-DTL-DRIFT-DATA WS-S0V3-DTL-RSRCH-DATA DELIMITED BY SIZE INTO WS-S0V3-DTL-REC END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(s0v3DtlMdlData.toCharArray());
                 charArray.add(s0v3DtlCatAvGeData.toCharArray());
                 charArray.add(substring(s0v3DtlDriftData.getCharArray(),0,s0v3DtlDriftData.getVariableLength(work.getDriftDataCnt())));
                 charArray.add(s0v3DtlRsrchData.toCharArray());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3));
              updated = updateString(work.getS0v3DtlRec() ,joinCharArray);
              work.setS0v3DtlRec(  (char[])updated.get("string"));
          }
//  ELSE
          else { 
//  STRING WS-S0V3-DTL-MDL-DATA WS-S0V3-DTL-CAT-AV-GE-DATA WS-S0V3-DTL-RSRCH-DATA DELIMITED BY SIZE INTO WS-S0V3-DTL-REC END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(s0v3DtlMdlData.toCharArray());
                 charArray.add(s0v3DtlCatAvGeData.toCharArray());
                 charArray.add(s0v3DtlRsrchData.toCharArray());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2));
              updated = updateString(work.getS0v3DtlRec() ,joinCharArray);
              work.setS0v3DtlRec(  (char[])updated.get("string"));
          }
//  DISPLAY 'WS-S0V3-DTL-REC'
          logger.info("WS-S0V3-DTL-REC"); 
//  DISPLAY ' |->   1-100 :(' WS-S0V3-DTL-REC (1 : 100) ')'
          logger.info(" |->   1-100 :({})", new String(substring(work.getS0v3DtlRec(),0,100))); 
//  DISPLAY ' |-> 100-200 :(' WS-S0V3-DTL-REC (100 : 100) ')'
          logger.info(" |-> 100-200 :({})", new String(substring(work.getS0v3DtlRec(),99,199))); 
//  DISPLAY ' |-> 200-300 :(' WS-S0V3-DTL-REC (200 : 100) ')'
          logger.info(" |-> 200-300 :({})", new String(substring(work.getS0v3DtlRec(),199,299))); 
//  DISPLAY ' |-> 300-400 :(' WS-S0V3-DTL-REC (300 : 100) ')'
          logger.info(" |-> 300-400 :({})", new String(substring(work.getS0v3DtlRec(),299,399))); 
//  DISPLAY ' |-> 400-500 :(' WS-S0V3-DTL-REC (400 : 100) ')'
          logger.info(" |-> 400-500 :({})", new String(substring(work.getS0v3DtlRec(),399,499))); 
//  DISPLAY ' |-> 500-600 :(' WS-S0V3-DTL-REC (500 : 100) ')'
          logger.info(" |-> 500-600 :({})", new String(substring(work.getS0v3DtlRec(),499,599))); 
//  DISPLAY ' |-> 600-700 :(' WS-S0V3-DTL-REC (600 : 100) ')'
          logger.info(" |-> 600-700 :({})", new String(substring(work.getS0v3DtlRec(),599,699))); 
//  DISPLAY ' |-> 700-800 :(' WS-S0V3-DTL-REC (700 : 100) ')'
          logger.info(" |-> 700-800 :({})", new String(substring(work.getS0v3DtlRec(),699,799))); 
//  DISPLAY ' |-> 800-900 :(' WS-S0V3-DTL-REC (800 : 100) ')'
          logger.info(" |-> 800-900 :({})", new String(substring(work.getS0v3DtlRec(),799,899))); 
//  DISPLAY ' |-> 900-1000:(' WS-S0V3-DTL-REC (900 : 100) ')'
          logger.info(" |-> 900-1000:({})", new String(substring(work.getS0v3DtlRec(),899,999))); 
//  DISPLAY ' |->1000-1100:(' WS-S0V3-DTL-REC (1000 : 100) ')'
          logger.info(" |->1000-1100:({})", new String(substring(work.getS0v3DtlRec(),999,1099))); 
//  DISPLAY ' |->1100-1200:(' WS-S0V3-DTL-REC (1100 : 100) ')'
          logger.info(" |->1100-1200:({})", new String(substring(work.getS0v3DtlRec(),1099,1199))); 
//  DISPLAY ' |->1200-1300:(' WS-S0V3-DTL-REC (1200 : 100) ')'
          logger.info(" |->1200-1300:({})", new String(substring(work.getS0v3DtlRec(),1199,1299))); 
//  DISPLAY ' |->1300-1400:(' WS-S0V3-DTL-REC (1300 : 100) ')'
          logger.info(" |->1300-1400:({})", new String(substring(work.getS0v3DtlRec(),1299,1399))); 
//  DISPLAY ' |->1400-1500:(' WS-S0V3-DTL-REC (1400 : 100) ')'
          logger.info(" |->1400-1500:({})", new String(substring(work.getS0v3DtlRec(),1399,1499))); 
//  PERFORM PROCESS-1
          process1();/*PROCESS-1*/
       } catch(Exception e) {
            handleErrorCode(e);
            throw e;
       }
      
       return getRc(); // Exit with return code
      // end of process method
      }
      /**
      * process1 
      *   This method is derived from 
  *   COBOL Paragraph - PROCESS-1 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - s0v3DtlRec                     COBOL Name: WS-S0V3-DTL-REC
      *
      * Output : None 

      * @throws CFException
      */
      private void process1() throws Exception {
//  DISPLAY ' |->1500-1600:(' WS-S0V3-DTL-REC (1500 : 100) ')'
          logger.info(" |->1500-1600:({})", new String(substring(work.getS0v3DtlRec(),1499,1599))); 
//  DISPLAY ' |->1600-1700:(' WS-S0V3-DTL-REC (1600 : 100) ')'
          logger.info(" |->1600-1700:({})", new String(substring(work.getS0v3DtlRec(),1599,1699))); 
//  DISPLAY ' |->1700-1800:(' WS-S0V3-DTL-REC (1700 : 100) ')'
          logger.info(" |->1700-1800:({})", new String(substring(work.getS0v3DtlRec(),1699,1799))); 
//  DISPLAY ' |->1800-1900:(' WS-S0V3-DTL-REC (1800 : 100) ')'
          logger.info(" |->1800-1900:({})", new String(substring(work.getS0v3DtlRec(),1799,1899))); 
//  DISPLAY ' |->1900-2000:(' WS-S0V3-DTL-REC (1900 : 100) ')'
          logger.info(" |->1900-2000:({})", new String(substring(work.getS0v3DtlRec(),1899,1999))); 
//  STOP RUN
          throw Terminate.TERMINATE;
      
      }
  
  
      /**
* This method pre-initializes variables consistent with
* what a mainframe program would have done at the start of a program
*/
      @Override
      public void initVars() throws CFException {
      setProgramEnded(false);
          if(!isInitDone()) {
          	this.setRc(0);
          	setInitDone(true);
          }
        CFUtil.resetDecimalAsComma();
       }
  
  
  
  
  
  
  }
