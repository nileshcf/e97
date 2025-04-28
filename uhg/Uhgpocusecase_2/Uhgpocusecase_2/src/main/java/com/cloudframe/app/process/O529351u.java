  package com.cloudframe.app.process;
   /* The comment section is too large, 
	 * hence added at the end of the java code 
	 * please scroll all the way to the bottom to see complete comments 
	 */
  
  import com.cloudframe.app.cics.CICSSession;
  import org.springframework.web.bind.annotation.PostMapping;
  import org.springframework.web.bind.annotation.RequestBody;
  import org.springframework.http.MediaType;
  import org.springframework.http.ResponseEntity;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import org.springframework.web.bind.annotation.RequestParam;
  import com.cloudframe.app.o529351u.dto.M51uFlags;
  import com.cloudframe.app.o529351u.dto.M51uLinkage;
  import com.cloudframe.app.exception.Terminate;
  import java.math.BigDecimal;
  import com.cloudframe.app.o529351u.dto.HoldTransData;
  import com.cloudframe.app.o529351u.dto.HoldTransData2;
  import com.cloudframe.app.o529351u.dto.D51uRequestFields;
  import com.cloudframe.app.cics.TransactionManager;
  import com.cloudframe.app.vsam.KeyInfo;
  import com.cloudframe.app.o529351u.dto.SceRecord;
  import com.cloudframe.app.o529351u.dto.LinkAreaM51u;
  import com.cloudframe.app.o529351u.dto.XrfCmInfo;
  import com.cloudframe.app.o529351u.dto.CkServCls;
  import com.cloudframe.app.o529351u.dto.FesaKey;
  import com.cloudframe.app.o529351u.dto.UGenericTranslation51;
  import com.cloudframe.app.o529351u.dto.PlanDosDt;
  import com.cloudframe.app.o529351u.dto.PlanDt;
  import com.cloudframe.app.o529351u.dto.PlanEffDt;
  import com.cloudframe.app.o529351u.dto.PlanCanDt;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.o529351u.dto.FesrKey01;
  import com.cloudframe.app.o529351u.dto.PlanVarInputLines;
  import com.cloudframe.app.o529351u.dto.ServTop;
  import com.cloudframe.app.o529351u.dto.FeServFr;
  import com.cloudframe.app.o529351u.dto.FeServTo;
  import com.cloudframe.app.o529351u.dto.Point;
  import com.cloudframe.app.o529351u.dto.D51uRetRulIcd;
  import com.cloudframe.app.o529351u.dto.PpaFixedPortion;
  import com.cloudframe.app.o529351u.dto.PpaPpoaltRecord;
  import com.cloudframe.app.o529351u.dto.SceAltKey;
  import com.cloudframe.app.o529351u.dto.SceKey;
  import com.cloudframe.app.o529351u.dto.McrCheckTable;
  import java.math.RoundingMode;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.dao.Db2Base;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.o529351u.dto.D51uNonArrayData;
  import com.cloudframe.app.o529351u.dto.DsmCommonArea;
  import com.cloudframe.app.o529351u.dto.D51uKey;
  import com.cloudframe.app.o529351u.dto.D51uOtherReq;
  import com.cloudframe.app.process.D529351u;
  import com.cloudframe.app.o529351u.dto.D51uTableCounts;
  import com.cloudframe.app.o529351u.dto.D51uErrorTrace;
  import com.cloudframe.app.o529351u.dto.D51uRetData;
  import com.cloudframe.app.o529351u.dto.D51uLstIcdKey;
  import com.cloudframe.app.o529351u.dto.D51uTestValues;
  import com.cloudframe.app.o529351u.dto.D51uTestDiagArea;
  import com.cloudframe.app.o529351u.dto.PrevMatchedKey;
  import com.cloudframe.app.o529351u.dto.D51uRetRulKeys;
  import com.cloudframe.app.o529351u.dto.D51uRetRulIpa;
  import com.cloudframe.app.o529351u.dto.D51uRetRulFrCondPos;
  import com.cloudframe.app.o529351u.dto.D51uRetRulFrToSvc;
  import com.cloudframe.app.o529351u.dto.ServToAlphatf;
  import com.cloudframe.app.o529351u.dto.ServAlphaf;
  import com.cloudframe.app.o529351u.dto.ServToAlphaff;
  import com.cloudframe.app.o529351u.dto.ServToAlphatl;
  import com.cloudframe.app.o529351u.dto.ServAlphal;
  import com.cloudframe.app.o529351u.dto.ServToAlphafl;
  import com.cloudframe.app.o529351u.dto.D51uRetRulProvTyp;
  import com.cloudframe.app.o529351u.dto.D51uRetRulCauseData;
  import com.cloudframe.app.o529351u.dto.D51uRetRulCpeFlgData;
  import com.cloudframe.app.o529351u.dto.*;
  import com.cloudframe.app.o529351u.dto.Dfhcommarea;
  import com.cloudframe.app.o529351u.dto.FesrKey;
  import com.cloudframe.app.o529351u.dto.W02FnuLineStartbr;
  import com.cloudframe.app.o529351u.dto.W02FnuLineReadnext;
  import com.cloudframe.app.o529351u.dto.FesaKey1;
  import com.cloudframe.app.o529351u.dto.FeSpiAltPlanRecord;
  import com.cloudframe.app.o529351u.dto.FeSpiRulesRecord;
  import com.cloudframe.app.o529351u.dto.W02FnuLineRead;
  import com.cloudframe.app.o529351u.dto.W02DsplMsgArea;
  import com.cloudframe.app.o529351u.dto.DsmCallArea;
  import com.cloudframe.app.o529351u.dto.EqiRecord;
  import com.cloudframe.app.o529351u.dto.DdEqisAlt;
  import com.cloudframe.app.o529351u.dto.CsvcProc;
  import com.cloudframe.app.o529351u.dto.Vyspi51uCallArea;
  import com.cloudframe.app.o529351u.dto.CetCicsErrorTableGroup;
  import com.cloudframe.app.o529351u.dto.GenTransSpiTableGroup;
  import com.cloudframe.app.o529351u.dto.NewTransSpiTableGroup;
  import com.cloudframe.app.o529351u.dto.CsvcCodeGroup;
  import com.cloudframe.app.o529351u.dto.Ioi02bInterface;
  import com.cloudframe.app.o529351u.dto.WorkFields;
  import com.cloudframe.app.o529351u.dto.DrstRestartDataArea;
  import com.cloudframe.app.o529351u.dto.LsSaveRecord1;
  import com.cloudframe.app.o529351u.dto.LsSaveRecord3;
  import com.cloudframe.app.o529351u.dto.LsSaveRecord4;
  import com.cloudframe.app.o529351u.dto.LsSaveRec1Clminf;
  import com.cloudframe.app.o529351u.dto.FrontendHdPmtIcnRecord;
  import com.cloudframe.app.o529351u.dto.FrontendMedPmtIcnRecord;
  import com.cloudframe.app.o529351u.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("o529351u")
  
  public class O529351u extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(O529351u.class);
  
  private Dfhcommarea dfhcommarea = new Dfhcommarea() ;
  private CICSSession cicsSession = new CICSSession() ;
  private FesrKey fesrKey = new FesrKey() ;
  private W02FnuLineStartbr w02FnuLineStartbr = new W02FnuLineStartbr() ;
  private W02FnuLineReadnext w02FnuLineReadnext = new W02FnuLineReadnext() ;
  private FesaKey1 fesaKey1 = new FesaKey1() ;
  private FeSpiAltPlanRecord feSpiAltPlanRecord = new FeSpiAltPlanRecord() ;
  private FeSpiRulesRecord feSpiRulesRecord = new FeSpiRulesRecord() ;
  private W02FnuLineRead w02FnuLineRead = new W02FnuLineRead() ;
  private W02DsplMsgArea w02DsplMsgArea = new W02DsplMsgArea() ;
  private DsmCallArea dsmCallArea = new DsmCallArea() ;
  private EqiRecord eqiRecord = new EqiRecord() ;
  private DdEqisAlt ddEqisAlt = new DdEqisAlt() ;
  private CsvcProc csvcProc = new CsvcProc() ;
  private Vyspi51uCallArea vyspi51uCallArea = new Vyspi51uCallArea() ;
  private CetCicsErrorTableGroup cetCicsErrorTableGroup = new CetCicsErrorTableGroup() ;
  private GenTransSpiTableGroup genTransSpiTableGroup = new GenTransSpiTableGroup() ;
  private NewTransSpiTableGroup newTransSpiTableGroup = new NewTransSpiTableGroup() ;
  private CsvcCodeGroup csvcCodeGroup = new CsvcCodeGroup() ;
  private Ioi02bInterface ioi02bInterface = new Ioi02bInterface() ;
  private WorkFields workFields = new WorkFields() ;
  private DrstRestartDataArea drstRestartDataArea = new DrstRestartDataArea() ;
  private LsSaveRecord1 lsSaveRecord1 = new LsSaveRecord1() ;
  private LsSaveRecord3 lsSaveRecord3 = new LsSaveRecord3() ;
  private LsSaveRecord4 lsSaveRecord4 = new LsSaveRecord4() ;
  private LsSaveRec1Clminf lsSaveRec1Clminf = new LsSaveRec1Clminf() ;
  private FrontendHdPmtIcnRecord frontendHdPmtIcnRecord = new FrontendHdPmtIcnRecord() ;
  private FrontendMedPmtIcnRecord frontendMedPmtIcnRecord = new FrontendMedPmtIcnRecord() ;
  private Work work = new Work() ;
  
  
  
  @Autowired 
  @Qualifier("d529351u")
  D529351u d529351u;
  
  
  private boolean doNotSkipReadPlanAltDb2 = true;
  private boolean doNotSkipExit = true;
  private boolean doNotSkipGenericTranslation = true;
  private boolean doNotSkipNewSpiTranslation = true;
  private boolean doNotSkipReadPlanAltFile = true;
  
  int newNdx;
  int uTrnslNdx51;
  int genNdx;
  
  
  
        public com.cloudframe.app.o529351u.rest.Dfhcommarea setCommarea(com.cloudframe.app.o529351u.rest.Dfhcommarea inputCommarea) throws Exception {
      		
      		inputCommarea.setDfhcommarea(dfhcommarea);
      		setInitDone(false);
      		try {
      			process();
      		}
      		catch(Exception e) { 
      		  	handleExceptionForRest(e);
      		} finally {
      			clearVars(getCICSSession());
      		}
      		inputCommarea.populateFrom(dfhcommarea);
      		return inputCommarea;
      }
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public int process() throws Exception {
       initVars();
       try {
       setCodePage("1047");
          ;
//  PERFORM 0000-MAIN-LINE
          mainLine();/*0000-MAIN-LINE*/
          if (this.isProgramEnded()) {
              return getRc();
          }
//  PERFORM 0000-EXIT
          exit();/*0000-EXIT*/
          if (this.isProgramEnded()) {
              return getRc();
          }
       } catch(Exception e) {
            handleErrorCode(e);
            throw e;
       }
      
       return getRc(); // Exit with return code
      // end of process method
      }
      /**
      * mainLine 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAIN-LINE COBOL Cyclomatic complexity - 14
      * Input  :  

      * - m51uFunctionFlag               COBOL Name: M51U-FUNCTION-FLAG
      * - m51uIllogicalCondSw            COBOL Name: M51U-ILLOGICAL-COND-SW
      * - uIcn51                         COBOL Name: LK-51U-ICN
      * - uNbrOfLines51                  COBOL Name: LK-51U-NBR-OF-LINES
      * - sub01                          COBOL Name: LK-SUB
      * - uStopAutoSw51                  COBOL Name: LK-51U-STOP-AUTO-SW
      * - uOutLineCauseCd51              COBOL Name: LK-51U-OUT-LINE-CAUSE-CD
      *
      * Output :  

      * - paragraph                      COBOL Name: WS-PARAGRAPH
      * - w02AbendingProg                COBOL Name: W02-ABENDING-PROG
      * - functionFlag                   COBOL Name: LK-FUNCTION-FLAG
      * - m51uFunctionFlag               COBOL Name: M51U-FUNCTION-FLAG
      * - illogicalCond                  COBOL Name: LK-ILLOGICAL-COND
      * - m51uIllogicalCondSw            COBOL Name: M51U-ILLOGICAL-COND-SW
      * - w02FnuIcn                      COBOL Name: W02-FNU-ICN
      * - uIcn51                         COBOL Name: LK-51U-ICN
      * - nbrOfLines                     COBOL Name: WS-NBR-OF-LINES
      * - uNbrOfLines51                  COBOL Name: LK-51U-NBR-OF-LINES
      * - sub01                          COBOL Name: LK-SUB
      * - w02DsplErrInd                  COBOL Name: W02-DSPL-ERR-IND
      * - w02DsplMsg                     COBOL Name: W02-DSPL-MSG
      * - uOutCauseCd51                  COBOL Name: LK-51U-OUT-CAUSE-CD
      * - uOutLineCauseCd51              COBOL Name: LK-51U-OUT-LINE-CAUSE-CD
      * - toCauseCdChanged               COBOL Name: WS-TO-CAUSE-CD-CHANGED
      * - uStopAutoSw51                  COBOL Name: LK-51U-STOP-AUTO-SW
      * - chargeCombined                 COBOL Name: WS-CHARGE-COMBINED
      *
      * @throws CFException
      */
      private void mainLine() throws Exception {
			// Declare local variables used in the method
			M51uFlags m51uFlags = dfhcommarea.getLinkAreaM51u().getM51uFlags();
			M51uLinkage m51uLinkage = dfhcommarea.getLinkAreaM51u().getM51uLinkage();
			short uNbrOfLines51 = 0;
			char[] uStopAutoSw51 = null;
			char[] uOutCauseCd51 = null;
			// End of variable declaration

      
// *81 This paragraph is the main section of this program. it       *
// *81 checks the requests and starts a browse of the special       *
// *81 processing instructions file.                                *
// *81***************************************************************
// *82***************************************************************
// *82 0000-main-line                                               *
// *82                                                              *
// *82 1. examines the request in the linkage area. depending on the*
// *82    request, either opens or closes the files.                *
// *82 2. initializes the storage variables, switches and linkage   *
// *82    variables.                                                *
// *82 3. examine the service code, charge  amount and plan variable*
// *82    and start a browse on the special processing instructions *
// *82    file.                                                     *
// *82 4. if the auto switch is set to 'z', exit the section.       *
// *82 5. examine the service code and populate the storage         *
// *82    variables with the date of service and charge amount      *
// *82***************************************************************

// *---------------*
          // MOVE '0000' TO WS-PARAGRAPH
          //  LITERAL_0000 = '0000'
          workFields.setParagraph(CONSTANTS.LITERAL_0000);
//  MOVE 'O529351U' TO W02-ABENDING-PROG
//  LITERAL_O529351U = 'O529351U'
          w02DsplMsgArea.setW02AbendingProg(CONSTANTS.LITERAL_O529351U);

// *    Set address of lk-vycci-record to m51u-vycci-pointer
//  MOVE M51U-FUNCTION-FLAG TO LK-FUNCTION-FLAG
          work.setFunctionFlag(m51uFlags.getM51uFunctionFlag());
  
//  MOVE M51U-ILLOGICAL-COND-SW TO LK-ILLOGICAL-COND
          work.setIllogicalCond(m51uFlags.getM51uIllogicalCondSw());
  

// *    Move cci-main-prog           to w02-main-prog.

// **   Set address of ppa-ppoalt-record to cci-ppa-ppoalt-rec-ptr.
// ******get common work area
//  MOVE LK-51U-ICN TO W02-FNU-ICN
          w02DsplMsgArea.setW02FnuIcn(m51uLinkage.getUIcn51());
  
//  PERFORM 1000-INITIALIZE THRU 1000-EXIT
          initialize();/*1000-INITIALIZE*/
          if (this.isProgramEnded()) {
              return ;
          }
//  PERFORM 1800-READ-GEN-SYS-SWITCH THRU 1800-EXIT
          readGenSysSwitch();/*1800-READ-GEN-SYS-SWITCH SECTION*/
          if (this.isProgramEnded()) {
              return ;
          }
//  IF LK-51U-NBR-OF-LINES NUMERIC
          if (        m51uLinkage.uNbrOfLines51IsNumeric() ) { 

// *       Move lk-51u-nbr-of-lines to ws-nbr-of-lines.
//  MOVE LK-51U-NBR-OF-LINES TO WS-NBR-OF-LINES
              workFields.setNbrOfLines(m51uLinkage.getUNbrOfLines51());
  
//  PERFORM 2000-MAIN-PROCESSING THRU 2000-EXIT VARYING LK-SUB FROM 1 BY 1 UNTIL LK-SUB > WS-NBR-OF-LINES
              for (work.setSub01(1); 	( work.getSub01() <= workFields.getNbrOfLines() ) ; work.setSub01(work.getSub01() + 1) ) {
              	mainProcessing();/*2000-MAIN-PROCESSING*/
                  if (this.isProgramEnded()) {
                      return ;
                  }
              }
          }
  
//  ELSE
          else { 
//  MOVE 'ERR' TO W02-DSPL-ERR-IND
//  LITERAL_ERR = 'ERR'
              w02DsplMsgArea.setW02DsplErrInd(CONSTANTS.LITERAL_ERR);
//  MOVE 'LK-51U-NBR-OF-LINES ERROR' TO W02-DSPL-MSG
              w02DsplMsgArea.setW02DsplMsg(CONSTANTS.LITERAL_956846606);
//  PERFORM 11100A-WRITE-TO-SYSM THRU 11100A-EXIT
              writeToSysm();/*11100A-WRITE-TO-SYSM SECTION*/
              if (this.isProgramEnded()) {
                  return ;
              }
//  SET M51U-ILLOGICAL-COND TO TRUE
              dfhcommarea.getLinkAreaM51u().getM51uFlags().setM51uIllogicalCondTrue(); 
              
//  PERFORM 8000-DUMP-ABEND THRU 8000-EXIT
              dumpAbend();/*8000-DUMP-ABEND SECTION*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }

// *00347      Perform 2000-main-processing  thru
// *00348              2000-exit varying lk-sub from 1 by 1
// *00349              until lk-sub > ws-nbr-of-lines.
          uStopAutoSw51 = m51uLinkage.getUStopAutoSw51();
//  IF LK-51U-STOP-AUTO-SW = 'Z'
//  LITERAL_Z = 'Z'
          if (compareChars(uStopAutoSw51, CONSTANTS.LITERAL_Z) == 0) { 
//cobolCode::GO TO 0000-EXIT
exit();
 return ;
//cobolCodeEnds::GO TO 0000-EXIT
          }
  
//  MOVE LK-51U-OUT-LINE-CAUSE-CD (1) TO LK-51U-OUT-CAUSE-CD
          m51uLinkage.setUOutCauseCd51(m51uLinkage.getUOutLineData51(0).getUOutLineCauseCd51());
  
//  MOVE 'N' TO WS-TO-CAUSE-CD-CHANGED
//  LITERAL_N = 'N'
          workFields.setToCauseCdChanged(CONSTANTS.LITERAL_N);
//  PERFORM VARYING LK-SUB FROM 1 BY 1 UNTIL LK-SUB > WS-NBR-OF-LINES OR TO-CAUSE-CD-CHANGED
          for (work.setSub01(1); (	( work.getSub01() <= workFields.getNbrOfLines() ) && !(workFields.isToCauseCdChanged1()) ) ; work.setSub01(work.getSub01() + 1) ) {
              uOutCauseCd51 = m51uLinkage.getUOutCauseCd51();
//  IF LK-51U-OUT-CAUSE-CD = SPACES
              if (        ( allSpaces(uOutCauseCd51)   )) { 
//  MOVE LK-51U-OUT-LINE-CAUSE-CD ( LK-SUB ) TO LK-51U-OUT-CAUSE-CD
                  m51uLinkage.setUOutCauseCd51(m51uLinkage.getUOutLineData51(work.getSub01() - 1).getUOutLineCauseCd51());
  
              }
  
//  ELSE
              else { 
//  IF LK-51U-OUT-LINE-CAUSE-CD ( LK-SUB ) NOT = SPACES
                  if (        ( !allSpaces(m51uLinkage.getUOutLineData51(work.getSub01() - 1).getUOutLineCauseCd51())  )) { 
                      uOutCauseCd51 = m51uLinkage.getUOutCauseCd51();
//  IF LK-51U-OUT-LINE-CAUSE-CD ( LK-SUB ) NOT = LK-51U-OUT-CAUSE-CD
                      if (		compareChars(m51uLinkage.getUOutLineData51(work.getSub01() - 1).getUOutLineCauseCd51(),uOutCauseCd51) != 0 ) { 
//  MOVE 'Y' TO WS-TO-CAUSE-CD-CHANGED
//  LITERAL_Y = 'Y'
                          workFields.setToCauseCdChanged(CONSTANTS.LITERAL_Y);
                      }
  
                  }
  
              }
          }
//  IF TO-CAUSE-CD-CHANGED
          if ( workFields.isToCauseCdChanged1()  ) { 
//  MOVE 'X' TO LK-51U-STOP-AUTO-SW
//  LITERAL_X = 'X'
              m51uLinkage.setUStopAutoSw51(CONSTANTS.LITERAL_X);
  
//cobolCode::GO TO 0000-EXIT
exit();
 return ;
//cobolCodeEnds::GO TO 0000-EXIT
          }
//  MOVE 'N' TO WS-CHARGE-COMBINED
//  LITERAL_N = 'N'
          workFields.setChargeCombined(CONSTANTS.LITERAL_N);
//  PERFORM 2700-CHIRO-PROCESSING THRU 2700-EXIT VARYING LK-SUB FROM 1 BY 1 UNTIL LK-SUB > WS-NBR-OF-LINES
          for (work.setSub01(1); 	( work.getSub01() <= workFields.getNbrOfLines() ) ; work.setSub01(work.getSub01() + 1) ) {
          	chiroProcessing();/*2700-CHIRO-PROCESSING*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
          ;
      
      }
      /**
      * exit 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-EXIT COBOL Cyclomatic complexity - 3
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void exit() throws Exception {
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          this.setProgramEnded(true);
          return ;
      
      }
      /**
      * initialize 
      *   This method is derived from 
  *   COBOL Paragraph - 1000-INITIALIZE COBOL Cyclomatic complexity - 5
      * Input  :  

      * - sub                            COBOL Name: WS-SUB
      *
      * Output :  

      * - paragraph                      COBOL Name: WS-PARAGRAPH
      * - uStopAutoSw51                  COBOL Name: LK-51U-STOP-AUTO-SW
      * - endOfSpiRule                   COBOL Name: WS-END-OF-SPI-RULE
      * - endOfPlanAlt                   COBOL Name: WS-END-OF-PLAN-ALT
      * - planVarFoundSw                 COBOL Name: WS-PLAN-VAR-FOUND-SW
      * - newPlanVarFoundSw              COBOL Name: WS-NEW-PLAN-VAR-FOUND-SW
      * - sub                            COBOL Name: WS-SUB
      * - fesaPolicy01                   COBOL Name: WS-FESA-POLICY
      * - fesaSpiPriDiagInd              COBOL Name: WS-FESA-SPI-PRI-DIAG-IND
      * - fesaSpiDiagElgInd              COBOL Name: WS-FESA-SPI-DIAG-ELG-IND
      * - fesaPlanVar01                  COBOL Name: WS-FESA-PLAN-VAR
      * - fesaEffDate01                  COBOL Name: WS-FESA-EFF-DATE
      * - fesaSpiNbr01                   COBOL Name: WS-FESA-SPI-NBR
      * - fesaPosTierCd                  COBOL Name: WS-FESA-POS-TIER-CD
      * - uOutLinePos51                  COBOL Name: LK-51U-OUT-LINE-POS
      * - uOutLineServiceCode51          COBOL Name: LK-51U-OUT-LINE-SERVICE-CODE
      * - uOutLineRemarkCd51             COBOL Name: LK-51U-OUT-LINE-REMARK-CD
      * - uOutLineCauseCd51              COBOL Name: LK-51U-OUT-LINE-CAUSE-CD
      * - uOutLineDosDate51              COBOL Name: LK-51U-OUT-LINE-DOS-DATE
      * - uOutLineChargeAmt51            COBOL Name: LK-51U-OUT-LINE-CHARGE-AMT
      * - uOutLineNotcovAmt51            COBOL Name: LK-51U-OUT-LINE-NOTCOV-AMT
      * - uOutLineAppUnits51             COBOL Name: LK-51U-OUT-LINE-APP-UNITS
      * - holdPs                         COBOL Name: WS-HOLD-PS
      * - uOutCauseCd51                  COBOL Name: LK-51U-OUT-CAUSE-CD
      * - holdSvc                        COBOL Name: WS-HOLD-SVC
      * - holdCauseCd                    COBOL Name: WS-HOLD-CAUSE-CD
      * - polNo                          COBOL Name: WS-POL-NO
      * - holdSpiTblId                   COBOL Name: WS-HOLD-SPI-TBL-ID
      * - holdPosTierCd                  COBOL Name: WS-HOLD-POS-TIER-CD
      * - holdDiagElgInd                 COBOL Name: WS-HOLD-DIAG-ELG-IND
      * - fcndPs                         COBOL Name: WS-FCND-PS
      * - fcndSvc                        COBOL Name: WS-FCND-SVC
      * - fcndCauseCd                    COBOL Name: WS-FCND-CAUSE-CD
      * - frtoPs                         COBOL Name: WS-FRTO-PS
      * - frtoSvc                        COBOL Name: WS-FRTO-SVC
      * - frtoCauseCd                    COBOL Name: WS-FRTO-CAUSE-CD
      * - ptypPs                         COBOL Name: WS-PTYP-PS
      * - ptypSvc                        COBOL Name: WS-PTYP-SVC
      * - ptypCauseCd                    COBOL Name: WS-PTYP-CAUSE-CD
      * - ricdPs                         COBOL Name: WS-RICD-PS
      * - ricdSvc                        COBOL Name: WS-RICD-SVC
      * - ricdCauseCd                    COBOL Name: WS-RICD-CAUSE-CD
      * - causPs                         COBOL Name: WS-CAUS-PS
      * - causSvc                        COBOL Name: WS-CAUS-SVC
      * - causCauseCd                    COBOL Name: WS-CAUS-CAUSE-CD
      * - ripaPs                         COBOL Name: WS-RIPA-PS
      * - ripaSvc                        COBOL Name: WS-RIPA-SVC
      * - ripaCauseCd                    COBOL Name: WS-RIPA-CAUSE-CD
      * - cflgPs                         COBOL Name: WS-CFLG-PS
      * - cflgSvc                        COBOL Name: WS-CFLG-SVC
      * - cflgCauseCd                    COBOL Name: WS-CFLG-CAUSE-CD
      * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
      * - nbrMatchedPrev                 COBOL Name: WS-NBR-MATCHED-PREV
      * - planVarPrev                    COBOL Name: WS-PLAN-VAR-PREV
      * - newPlanVarPrev                 COBOL Name: WS-NEW-PLAN-VAR-PREV
      * - nbrOfPlanVar                   COBOL Name: WS-NBR-OF-PLAN-VAR
      * - nbrOfNewPlanVar                COBOL Name: WS-NBR-OF-NEW-PLAN-VAR
      * - nbrOfLines                     COBOL Name: WS-NBR-OF-LINES
      * - psSub                          COBOL Name: PS-SUB
      * - svcSub                         COBOL Name: SVC-SUB
      * - pvSub                          COBOL Name: PV-SUB
      * - icd9Sub                        COBOL Name: ICD9-SUB
      * - causeSub                       COBOL Name: CAUSE-SUB
      * - sub01                          COBOL Name: LK-SUB
      * - cflgSub                        COBOL Name: CFLG-SUB
      * - diagSub                        COBOL Name: WS-DIAG-SUB
      * - d51uTestValues                 COBOL Name: D51U-TEST-VALUES
      *
      * @throws CFException
      */
      private void initialize() throws Exception {
			// Declare local variables used in the method
			M51uLinkage m51uLinkage = dfhcommarea.getLinkAreaM51u().getM51uLinkage();
			HoldTransData holdTransData = workFields.getHoldTransData();
			HoldTransData2 holdTransData2 = workFields.getHoldTransData2();
			D51uRequestFields d51uRequestFields = vyspi51uCallArea.getD51uRequestFields();
			// End of variable declaration

      
// *81***************************************************************
// *81 1000-Initialize                                              *
// *81                                                              *
// *81 business function:                                           *
// *81 initializes the switches, return variables, and subscripts   *
// *81 used in the program.                                         *
// *81***************************************************************
// *82***************************************************************
// *82 1000-initialize                                              *
// *82                                                              *
// *82 1. initialize the switches in the storage area to 'n'.       *
// *82 2. initialize the plan record variables with spaces          *
// *82 3. populate the line data in the linkage section with spaces/*
// *82    zeros.                                                    *
// *82 4. populate the storages variables with spaces/zeroes.       *
// *82 5. initialize the subscript variables with '1'.              *
// *82***************************************************************

// *----------------*
          // MOVE '1000' TO WS-PARAGRAPH
          //  LITERAL_1000 = '1000'
          workFields.setParagraph(CONSTANTS.LITERAL_1000);
//  MOVE 'N' TO LK-51U-STOP-AUTO-SW WS-END-OF-SPI-RULE WS-END-OF-PLAN-ALT WS-PLAN-VAR-FOUND-SW WS-NEW-PLAN-VAR-FOUND-SW
//  LITERAL_N = 'N'
          m51uLinkage.setUStopAutoSw51(CONSTANTS.LITERAL_N);
          work.setEndOfSpiRule(CONSTANTS.LITERAL_N);
          work.setEndOfPlanAlt(CONSTANTS.LITERAL_N);
          work.setPlanVarFoundSw(CONSTANTS.LITERAL_N);
          work.setNewPlanVarFoundSw(CONSTANTS.LITERAL_N);
  
//  PERFORM VARYING WS-SUB FROM 1 BY 1 UNTIL WS-SUB > 9999
          for (work.setSub(1); (	( work.getSub() <= 9999 )) ; work.setSub(work.getSub() + 1) ) {

// ****     Until ws-sub > 25
// *45917z  until ws-sub > 50
//  MOVE SPACES TO WS-FESA-POLICY ( WS-SUB ) WS-FESA-SPI-PRI-DIAG-IND ( WS-SUB ) WS-FESA-SPI-DIAG-ELG-IND ( WS-SUB )
              workFields.getPlanVarInputLines().getPlanVarRec(work.getSub() - 1).setFesaPolicy01(CONSTANTS.SPACE_6);
              workFields.getPlanVarInputLines().getPlanVarRec(work.getSub() - 1).setFesaSpiPriDiagInd(CONSTANTS.SPACE);
              workFields.getPlanVarInputLines().getPlanVarRec(work.getSub() - 1).setFesaSpiDiagElgInd(CONSTANTS.SPACE);
//  MOVE ZEROS TO WS-FESA-PLAN-VAR ( WS-SUB ) WS-FESA-EFF-DATE ( WS-SUB ) WS-FESA-SPI-NBR ( WS-SUB )
              workFields.getPlanVarInputLines().getPlanVarRec(work.getSub() - 1).setFesaPlanVar01(0);
              workFields.getPlanVarInputLines().getPlanVarRec(work.getSub() - 1).setFesaEffDate01(0);
              workFields.getPlanVarInputLines().getPlanVarRec(work.getSub() - 1).setFesaSpiNbr01(0);
//  MOVE SPACES TO WS-FESA-POS-TIER-CD ( WS-SUB )
              workFields.getPlanVarInputLines().getPlanVarRec(work.getSub() - 1).setFesaPosTierCd(CONSTANTS.SPACE);
          }
//  PERFORM VARYING WS-SUB FROM 1 BY 1 UNTIL WS-SUB > 120
          for (work.setSub(1); (	( work.getSub() <= 120 )) ; work.setSub(work.getSub() + 1) ) {
//  MOVE SPACES TO LK-51U-OUT-LINE-POS ( WS-SUB ) LK-51U-OUT-LINE-SERVICE-CODE ( WS-SUB ) LK-51U-OUT-LINE-REMARK-CD ( WS-SUB ) LK-51U-OUT-LINE-CAUSE-CD ( WS-SUB )
              dfhcommarea.getLinkAreaM51u().getM51uLinkage().getUOutLineData51(work.getSub() - 1).setUOutLinePos51(CONSTANTS.SPACE_2);
              dfhcommarea.getLinkAreaM51u().getM51uLinkage().getUOutLineData51(work.getSub() - 1).setUOutLineServiceCode51(CONSTANTS.SPACE_6);
              dfhcommarea.getLinkAreaM51u().getM51uLinkage().getUOutLineData51(work.getSub() - 1).setUOutLineRemarkCd51(CONSTANTS.SPACE_3);
              dfhcommarea.getLinkAreaM51u().getM51uLinkage().getUOutLineData51(work.getSub() - 1).setUOutLineCauseCd51(CONSTANTS.SPACE);
//  MOVE ZEROS TO LK-51U-OUT-LINE-DOS-DATE ( WS-SUB ) LK-51U-OUT-LINE-CHARGE-AMT ( WS-SUB ) LK-51U-OUT-LINE-NOTCOV-AMT ( WS-SUB ) LK-51U-OUT-LINE-APP-UNITS ( WS-SUB )
              dfhcommarea.getLinkAreaM51u().getM51uLinkage().getUOutLineData51(work.getSub() - 1).setUOutLineDosDate51(0);
              dfhcommarea.getLinkAreaM51u().getM51uLinkage().getUOutLineData51(work.getSub() - 1).setUOutLineChargeAmt51(BigDecimal.ZERO);
              dfhcommarea.getLinkAreaM51u().getM51uLinkage().getUOutLineData51(work.getSub() - 1).setUOutLineNotcovAmt51(BigDecimal.ZERO);
              dfhcommarea.getLinkAreaM51u().getM51uLinkage().getUOutLineData51(work.getSub() - 1).setUOutLineAppUnits51(0);
          }
//  MOVE SPACES TO WS-HOLD-PS LK-51U-OUT-CAUSE-CD WS-HOLD-SVC WS-HOLD-CAUSE-CD WS-POL-NO WS-HOLD-SPI-TBL-ID WS-HOLD-POS-TIER-CD WS-HOLD-DIAG-ELG-IND WS-FCND-PS WS-FCND-SVC WS-FCND-CAUSE-CD WS-FRTO-PS WS-FRTO-SVC WS-FRTO-CAUSE-CD WS-PTYP-PS WS-PTYP-SVC WS-PTYP-CAUSE-CD WS-RICD-PS WS-RICD-SVC WS-RICD-CAUSE-CD WS-CAUS-PS WS-CAUS-SVC WS-CAUS-CAUSE-CD WS-RIPA-PS WS-RIPA-SVC WS-RIPA-CAUSE-CD WS-CFLG-PS WS-CFLG-SVC WS-CFLG-CAUSE-CD
          holdTransData.setHoldPs(CONSTANTS.SPACE_2);
          m51uLinkage.setUOutCauseCd51(CONSTANTS.SPACE);
          holdTransData.setHoldSvc(CONSTANTS.SPACE_6);
          holdTransData.setHoldCauseCd(CONSTANTS.SPACE);
          workFields.setPolNo(CONSTANTS.SPACE_6);
          holdTransData.setHoldSpiTblId(CONSTANTS.SPACE_7);
          holdTransData.setHoldPosTierCd(CONSTANTS.SPACE);
          holdTransData.setHoldDiagElgInd(CONSTANTS.SPACE);
          holdTransData2.setFcndPs(CONSTANTS.SPACE_2);
          holdTransData2.setFcndSvc(CONSTANTS.SPACE_6);
          holdTransData2.setFcndCauseCd(CONSTANTS.SPACE);
          holdTransData2.setFrtoPs(CONSTANTS.SPACE_2);
          holdTransData2.setFrtoSvc(CONSTANTS.SPACE_6);
          holdTransData2.setFrtoCauseCd(CONSTANTS.SPACE);
          holdTransData2.setPtypPs(CONSTANTS.SPACE_2);
          holdTransData2.setPtypSvc(CONSTANTS.SPACE_6);
          holdTransData2.setPtypCauseCd(CONSTANTS.SPACE);
          holdTransData2.setRicdPs(CONSTANTS.SPACE_2);
          holdTransData2.setRicdSvc(CONSTANTS.SPACE_6);
          holdTransData2.setRicdCauseCd(CONSTANTS.SPACE);
          holdTransData2.setCausPs(CONSTANTS.SPACE_2);
          holdTransData2.setCausSvc(CONSTANTS.SPACE_6);
          holdTransData2.setCausCauseCd(CONSTANTS.SPACE);
          holdTransData2.setRipaPs(CONSTANTS.SPACE_2);
          holdTransData2.setRipaSvc(CONSTANTS.SPACE_6);
          holdTransData2.setRipaCauseCd(CONSTANTS.SPACE);
          holdTransData2.setCflgPs(CONSTANTS.SPACE_2);
          holdTransData2.setCflgSvc(CONSTANTS.SPACE_6);
          holdTransData2.setCflgCauseCd(CONSTANTS.SPACE);
  
//  MOVE ZEROS TO WS-NBR-MATCHED WS-NBR-MATCHED-PREV WS-PLAN-VAR-PREV WS-NEW-PLAN-VAR-PREV WS-NBR-OF-PLAN-VAR WS-NBR-OF-NEW-PLAN-VAR WS-NBR-OF-LINES
          workFields.setNbrMatched( 0);
          workFields.setNbrMatchedPrev( 0);
          workFields.setPlanVarPrev((short) 0);
          workFields.setNewPlanVarPrev((short) 0);
          workFields.setNbrOfPlanVar(0);
          workFields.setNbrOfNewPlanVar( 0);
          workFields.setNbrOfLines(0);
//  MOVE 1 TO WS-SUB PS-SUB SVC-SUB PV-SUB ICD9-SUB CAUSE-SUB LK-SUB CFLG-SUB WS-DIAG-SUB
//  LITERAL_1 = 1
          work.setSub(1);
          work.setPsSub(1);
          work.setSvcSub(1);
          work.setPvSub(1);
          work.setIcd9Sub(1);
          work.setCauseSub(1);
          work.setSub01(1);
          work.setCflgSub(1);
          work.setDiagSub(1);
//  INITIALIZE D51U-TEST-VALUES REPLACING ALPHANUMERIC BY SPACES
          d51uRequestFields.getD51uTestValues().initialize();
  
      
      }
      /**
      * readEqi 
      *   This method is derived from 
  *   COBOL Paragraph - 1500-READ-EQI COBOL Cyclomatic complexity - 3
      * Input  :  

      * - eibresp                        COBOL Name: EIBRESP
      * - lsEqiRecord                    COBOL Name: LS-EQI-RECORD
      *
      * Output :  

      * - eqiAltId                       COBOL Name: WS-EQI-ALT-ID
      * - cicsDfhrespCode                COBOL Name: CICS-DFHRESP-CODE
      * - eibresp                        COBOL Name: EIBRESP
      * - eqiRecord                      COBOL Name: EQI-RECORD
      * - lsEqiRecord                    COBOL Name: LS-EQI-RECORD
      *
      * @throws CFException
      */
      private void readEqi() throws Exception {
			// Declare local variables used in the method
			SceRecord sceRecord = eqiRecord.getSceRecord();
			 final int LS_EQI_RECORD_LENGTH = 48;
			// End of variable declaration

      
// *81***************************************************************
// *81 1500-Read-eqi                                                *
// *81                                                              *
// *81 business function:                                           *
// *81 reads service code equate initiate file from beginning with  *
// *81 key passed from calling program.                             *
// *81***************************************************************
// *82***************************************************************
// *82 1500-read-eqi                                                *
// *82                                                              *
// *82 1. populates service code equate initiate record from linkage*
// *82    section record obtained from calling program.             *
// *82 2. browses service code equate initiate file from the        *
// *82    beginning.                                                *
// *82 3. validates the file status code. when unsuccessful read,   *
// *82    exits the section.                                        *
// *82 4. reads service code equate initiate file                   *
// *82 5. when file status code is '00' populates service code      *
// *82    equate initiate file record to linkage section record to  *
// *82    pass to calling program.                                  *
// *82***************************************************************
//  MOVE 'U' TO WS-EQI-ALT-ID
//  LITERAL_U = 'U'
          ddEqisAlt.setEqiAltId(CONSTANTS.LITERAL_U);

// *EXEC CICS STARTBR 
// *  FILE      (WS-DD-EQIS-ALT) 
// *  RIDFLD    (SCE-ALT-KEY) 
// *  KEYLENGTH (LENGTH OF SCE-ALT-KEY) 
// *  RESP      (CICS-DFHRESP-CODE) 
// *END-EXEC. 
//  STARTBR FILE (WS-DD-EQIS-ALT) RIDFLD (SCE-ALT-KEY) KEYLENGTH (FUNCTION~LENGTH~SCE-ALT-KEY) RESP (CICS-DFHRESP-CODE)
          // STARTBR FILE (WS-DD-EQIS-ALT) RIDFLD (SCE-ALT-KEY) KEYLENGTH (FUNCTION~LENGTH~SCE-ALT-KEY) RESP (CICS-DFHRESP-CODE)
          // start Browsing a file
          TransactionManager.startBrowsing(getCICSSession(), ddEqisAlt.toCharArray(),sceRecord.getSceAltKey().toCharArray(),"".toCharArray()/*reqId*/,"".toCharArray()/*sysId*/,SceAltKey.getSceAltKeyFieldLength(),false/*debkey*/,false/*debrec*/,false/*rba*/,false/*rrn*/,false/*xrba*/,false/*gteq*/,false/*equal*/,false/*generic*/,new KeyInfo(17, 11, 0, false));
  
//  MOVE EIBRESP TO CICS-DFHRESP-CODE
          work.setCicsDfhrespCode(cicsSession.getEibresp());

// *    If not ioi-02b-good
//  IF NOT CICS-NORMAL
          if (!(work.isCicsNormal()) ) { 
//cobolCode::GO TO 1500-X
return ;
//cobolCodeEnds::GO TO 1500-X
          }

// *EXEC CICS READNEXT 
// *  FILE      (WS-DD-EQIS-ALT) 
// *  SET       (ADDRESS OF LS-EQI-RECORD) 
// *  RIDFLD    (SCE-ALT-KEY) 
// *  KEYLENGTH (LENGTH OF SCE-ALT-KEY) 
// *  LENGTH    (LENGTH OF LS-EQI-RECORD) 
// *  RESP      (CICS-DFHRESP-CODE) 
// *END-EXEC. 
//  READNEXT FILE (WS-DD-EQIS-ALT) SET (ADDRESS OF LS-EQI-RECORD) RIDFLD (SCE-ALT-KEY) KEYLENGTH (FUNCTION~LENGTH~SCE-ALT-KEY) LENGTH (FUNCTION~LENGTH~LS-EQI-RECORD) RESP (CICS-DFHRESP-CODE)
          // READNEXT FILE (WS-DD-EQIS-ALT) SET (ADDRESS OF LS-EQI-RECORD) RIDFLD (SCE-ALT-KEY) KEYLENGTH (FUNCTION~LENGTH~SCE-ALT-KEY) LENGTH (FUNCTION~LENGTH~LS-EQI-RECORD) RESP (CICS-DFHRESP-CODE)
          // read the next record from a file
          work.setLsEqiRecord(TransactionManager.readNextRecord(getCICSSession(), ddEqisAlt.toCharArray(),sceRecord.getSceAltKey().toCharArray(),"".toCharArray()/*Token*/,"".toCharArray()/*SysId*/,SceAltKey.getSceAltKeyFieldLength(),LS_EQI_RECORD_LENGTH,"".toCharArray()/*ReqId*/,false/*rba*/,false/*rrn*/,false/*xrba*/,false/*nosuspend*/,false/*uncommitted*/,false/*consistent*/,false/*repeatable*/,false/*update*/).toCharArray());
  
//  MOVE EIBRESP TO CICS-DFHRESP-CODE
          work.setCicsDfhrespCode(cicsSession.getEibresp());

// *    If ioi-02b-good

// *     Set  address of ls-eqi-record to ioi-02b-passed-rec-ptr
//  IF CICS-NORMAL
          if ( work.isCicsNormal()  ) { 
//  MOVE LS-EQI-RECORD TO EQI-RECORD
              eqiRecord.setString(work.getLsEqiRecord());
          }
//  ENDBR FILE (WS-DD-EQIS-ALT) RESP (CICS-DFHRESP-CODE)
          // ENDBR FILE (WS-DD-EQIS-ALT) RESP (CICS-DFHRESP-CODE)
          // end browsing the file
          TransactionManager.endBrowsing(getCICSSession(), ddEqisAlt.toCharArray(),"".toCharArray()/*sysId*/,"".toCharArray()/*reqId*/);
//  MOVE EIBRESP TO CICS-DFHRESP-CODE
          work.setCicsDfhrespCode(cicsSession.getEibresp());
      
      }
      /**
      * mainProcessing 
      *   This method is derived from 
  *   COBOL Paragraph - 2000-MAIN-PROCESSING COBOL Cyclomatic complexity - 25
      * Input  :  

      * - uCcmNOSvcInd51                 COBOL Name: LK-51U-CCM-N-O-SVC-IND
      * - uLineServiceCode51             COBOL Name: LK-51U-LINE-SERVICE-CODE
      * - uLineChargeAmt51               COBOL Name: LK-51U-LINE-CHARGE-AMT
      * - uLineNotcovAmt51               COBOL Name: LK-51U-LINE-NOTCOV-AMT
      * - sub01                          COBOL Name: LK-SUB
      * - uPolicyNo51                    COBOL Name: LK-51U-POLICY-NO
      * - polNo                          COBOL Name: WS-POL-NO
      * - uPlanVar51                     COBOL Name: LK-51U-PLAN-VAR
      * - planVarPrev                    COBOL Name: WS-PLAN-VAR-PREV
      * - planVarFoundSw                 COBOL Name: WS-PLAN-VAR-FOUND-SW
      * - primeSpiSw                     COBOL Name: WS-PRIME-SPI-SW
      * - xrfPlcyCm                      COBOL Name: XRF-PLCY-CM
      * - xrfDivCm                       COBOL Name: XRF-DIV-CM
      * - nbrOfLines                     COBOL Name: WS-NBR-OF-LINES
      * - medSvc                         COBOL Name: MED-SVC
      * - cls15                          COBOL Name: CLS-1-5
      * - ckServCls                      COBOL Name: CK-SERV-CLS
      * - newSpiSw                       COBOL Name: WS-NEW-SPI-SW
      * - nbrOfPlanVar                   COBOL Name: WS-NBR-OF-PLAN-VAR
      * - holdPs                         COBOL Name: WS-HOLD-PS
      * - holdSvc                        COBOL Name: WS-HOLD-SVC
      * - holdCauseCd                    COBOL Name: WS-HOLD-CAUSE-CD
      * - holdSpiTblId                   COBOL Name: WS-HOLD-SPI-TBL-ID
      * - holdPosTierCd                  COBOL Name: WS-HOLD-POS-TIER-CD
      * - holdDiagElgInd                 COBOL Name: WS-HOLD-DIAG-ELG-IND
      * - uLineAppUnits51                COBOL Name: LK-51U-LINE-APP-UNITS
      * - uLineDosDate51                 COBOL Name: LK-51U-LINE-DOS-DATE
      *
      * Output :  

      * - newServiceCode                 COBOL Name: WS-NEW-SERVICE-CODE
      * - uLineServiceCode51             COBOL Name: LK-51U-LINE-SERVICE-CODE
      * - paragraph                      COBOL Name: WS-PARAGRAPH
      * - nbrEqual                       COBOL Name: WS-NBR-EQUAL
      * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
      * - nbrMatchedPrev                 COBOL Name: WS-NBR-MATCHED-PREV
      * - sub                            COBOL Name: WS-SUB
      * - holdServCd                     COBOL Name: WS-HOLD-SERV-CD
      * - mmiFoundSw                     COBOL Name: WS-MMI-FOUND-SW
      * - withMmiSw2010                  COBOL Name: WS-2010-WITH-MMI-SW
      * - uSlotPlanVar51                 COBOL Name: LK-51U-SLOT-PLAN-VAR
      * - uSlotPolicyNo51                COBOL Name: LK-51U-SLOT-POLICY-NO
      * - polNo                          COBOL Name: WS-POL-NO
      * - xrfPlcyCm                      COBOL Name: XRF-PLCY-CM
      * - planVarPrev                    COBOL Name: WS-PLAN-VAR-PREV
      * - xrfDivCm                       COBOL Name: XRF-DIV-CM
      * - hold51uPolicy                  COBOL Name: WS-HOLD-51U-POLICY
      * - uPolicyNo51                    COBOL Name: LK-51U-POLICY-NO
      * - hold51uPlan                    COBOL Name: WS-HOLD-51U-PLAN
      * - uPlanVar51                     COBOL Name: LK-51U-PLAN-VAR
      * - sub01                          COBOL Name: LK-SUB
      * - nbrOfLines                     COBOL Name: WS-NBR-OF-LINES
      * - uOutLinePos51                  COBOL Name: LK-51U-OUT-LINE-POS
      * - holdPs                         COBOL Name: WS-HOLD-PS
      * - uOutLineServiceCode51          COBOL Name: LK-51U-OUT-LINE-SERVICE-CODE
      * - holdSvc                        COBOL Name: WS-HOLD-SVC
      * - uOutLineCauseCd51              COBOL Name: LK-51U-OUT-LINE-CAUSE-CD
      * - holdCauseCd                    COBOL Name: WS-HOLD-CAUSE-CD
      * - uSpiTblId51                    COBOL Name: LK-51U-SPI-TBL-ID
      * - holdSpiTblId                   COBOL Name: WS-HOLD-SPI-TBL-ID
      * - uOutSpiTblId51                 COBOL Name: LK-51U-OUT-SPI-TBL-ID
      * - uOutPosTierCd51                COBOL Name: LK-51U-OUT-POS-TIER-CD
      * - holdPosTierCd                  COBOL Name: WS-HOLD-POS-TIER-CD
      * - uOutDiagElgInd51               COBOL Name: LK-51U-OUT-DIAG-ELG-IND
      * - holdDiagElgInd                 COBOL Name: WS-HOLD-DIAG-ELG-IND
      * - uOutLineAppUnits51             COBOL Name: LK-51U-OUT-LINE-APP-UNITS
      * - uLineAppUnits51                COBOL Name: LK-51U-LINE-APP-UNITS
      * - uOutLineChargeAmt51            COBOL Name: LK-51U-OUT-LINE-CHARGE-AMT
      * - uLineChargeAmt51               COBOL Name: LK-51U-LINE-CHARGE-AMT
      * - uOutLineNotcovAmt51            COBOL Name: LK-51U-OUT-LINE-NOTCOV-AMT
      * - uLineNotcovAmt51               COBOL Name: LK-51U-LINE-NOTCOV-AMT
      * - uOutLineDosDate51              COBOL Name: LK-51U-OUT-LINE-DOS-DATE
      * - uLineDosDate51                 COBOL Name: LK-51U-LINE-DOS-DATE
      * - fcndPs                         COBOL Name: WS-FCND-PS
      * - fcndSvc                        COBOL Name: WS-FCND-SVC
      * - fcndCauseCd                    COBOL Name: WS-FCND-CAUSE-CD
      * - frtoPs                         COBOL Name: WS-FRTO-PS
      * - frtoSvc                        COBOL Name: WS-FRTO-SVC
      * - frtoCauseCd                    COBOL Name: WS-FRTO-CAUSE-CD
      * - ptypPs                         COBOL Name: WS-PTYP-PS
      * - ptypSvc                        COBOL Name: WS-PTYP-SVC
      * - ptypCauseCd                    COBOL Name: WS-PTYP-CAUSE-CD
      * - ricdPs                         COBOL Name: WS-RICD-PS
      * - ricdSvc                        COBOL Name: WS-RICD-SVC
      * - ricdCauseCd                    COBOL Name: WS-RICD-CAUSE-CD
      * - causPs                         COBOL Name: WS-CAUS-PS
      * - causSvc                        COBOL Name: WS-CAUS-SVC
      * - causCauseCd                    COBOL Name: WS-CAUS-CAUSE-CD
      * - ripaPs                         COBOL Name: WS-RIPA-PS
      * - ripaSvc                        COBOL Name: WS-RIPA-SVC
      * - ripaCauseCd                    COBOL Name: WS-RIPA-CAUSE-CD
      * - cflgPs                         COBOL Name: WS-CFLG-PS
      * - cflgSvc                        COBOL Name: WS-CFLG-SVC
      * - cflgCauseCd                    COBOL Name: WS-CFLG-CAUSE-CD
      * - endOfSpiRule                   COBOL Name: WS-END-OF-SPI-RULE
      * - uStopAutoSw51                  COBOL Name: LK-51U-STOP-AUTO-SW
      *
      * @throws CFException
      */
      private void mainProcessing() throws Exception {
			// Declare local variables used in the method
			LinkAreaM51u linkAreaM51u = dfhcommarea.getLinkAreaM51u();
			char[] uCcmNOSvcInd51 = null;
			char[] uPolicyNo51 = null;
			char[] polNo = null;
			char[] uSlotPolicyNo51 = null;
			M51uLinkage m51uLinkage = dfhcommarea.getLinkAreaM51u().getM51uLinkage();
			short uPlanVar51 = 0;
			short planVarPrev = 0;
			short uSlotPlanVar51 = 0;
			XrfCmInfo xrfCmInfo = dfhcommarea.getXrefCmInfo().getXrfCmInfo();
			int sub = 0;
			CkServCls ckServCls = workFields.getCkServCls();
			long cls15 = 0;
			HoldTransData holdTransData = workFields.getHoldTransData();
			HoldTransData2 holdTransData2 = workFields.getHoldTransData2();
			// End of variable declaration

      
// *82    Read eqi file to obtain the service code. this is done by *
// *82    calling vp055a00 program.                                 *
// *82 8. if the service line matched to the same number of items on*
// *82    more than one spi(special processing instructions) rule,  *
// *82    it will not apply any special processing instructions.    *
// *82    therefore turn off the auto switch.                       *
// *82    else populate the respective linkage section variables    *
// *82    with,place of service, service code,cause code,applicable *
// *82    units, charge amount, not covered amount and date of      *
// *82    service. also initialize the storage variables            *
// *82***************************************************************

// *--------------------*
          uCcmNOSvcInd51 = linkAreaM51u.getUCcmNOSvcInd51();
//  IF LK-51U-CCM-N-O-SVC-IND = 'O'
//  LITERAL_O = 'O'
          if (compareChars(uCcmNOSvcInd51, CONSTANTS.LITERAL_O) == 0) { 
//  MOVE LK-51U-LINE-SERVICE-CODE ( LK-SUB ) TO WS-NEW-SERVICE-CODE
              workFields.setNewServiceCode(dfhcommarea.getLinkAreaM51u().getM51uLinkage().getULineData51(work.getSub01() - 1).getULineServiceCode51());
//  IF NEW-SVC-CD
              if ( workFields.isNewSvcCd()  ) { 
//cobolCode::GO TO 2000-EXIT
return ;
//cobolCodeEnds::GO TO 2000-EXIT
              }
          }
  
          // MOVE '2000' TO WS-PARAGRAPH
          //  LITERAL_2000 = '2000'
          workFields.setParagraph(CONSTANTS.LITERAL_2000);
//  MOVE SPACES TO WS-NBR-EQUAL
          work.setNbrEqual(CONSTANTS.SPACE);
//  MOVE ZEROS TO WS-NBR-MATCHED WS-NBR-MATCHED-PREV
          workFields.setNbrMatched( 0);
          workFields.setNbrMatchedPrev( 0);
//  MOVE 1 TO WS-SUB
//  LITERAL_1 = 1
          work.setSub(1);
//  MOVE LK-51U-LINE-SERVICE-CODE ( LK-SUB ) TO WS-HOLD-SERV-CD
          workFields.setHoldServCd(dfhcommarea.getLinkAreaM51u().getM51uLinkage().getULineData51(work.getSub01() - 1).getULineServiceCode51());
//  IF INFORMATIONAL-SERV-CD
          if ( workFields.isInformationalServCd()  ) { 
//cobolCode::GO TO 2000-EXIT
return ;
//cobolCodeEnds::GO TO 2000-EXIT
          }
//  IF LK-51U-LINE-CHARGE-AMT ( LK-SUB ) = LK-51U-LINE-NOTCOV-AMT ( LK-SUB )
          if (			( m51uLinkage.getULineData51(work.getSub01() - 1).getULineChargeAmt51().compareTo(m51uLinkage.getULineData51(work.getSub01() - 1).getULineNotcovAmt51()) == 0) ) { 
//cobolCode::GO TO 2000-EXIT
return ;
//cobolCodeEnds::GO TO 2000-EXIT
          }
  
          polNo = workFields.getPolNo();
          uPolicyNo51 = m51uLinkage.getUPolicyNo51();
          planVarPrev = workFields.getPlanVarPrev();
          uPlanVar51 = m51uLinkage.getUPlanVar51();
//  IF LK-51U-POLICY-NO = WS-POL-NO AND LK-51U-PLAN-VAR = WS-PLAN-VAR-PREV
          if (		compareChars(uPolicyNo51,polNo) == 0  && 	( uPlanVar51 == planVarPrev )) { 
//  IF PLAN-VAR-FOUND
//  ELSE
              if (!(work.isPlanVarFound()) ) { 
//cobolCode::GO TO 2000-EXIT
return ;
//cobolCodeEnds::GO TO 2000-EXIT
              }
          }
  
//  ELSE
          else { 
              // MOVE ' ' TO WS-MMI-FOUND-SW
              //  SPACE = ' '
              work.setMmiFoundSw(CONSTANTS.SPACE);
              // MOVE ' ' TO WS-2010-WITH-MMI-SW
              //  SPACE = ' '
              work.setWithMmiSw2010(CONSTANTS.SPACE);
//  IF FE-PRIME-SPI-TURNED-OFF
              if ( work.isFePrimeSpiTurnedOff()  ) { 
//  MOVE ZEROES TO LK-51U-SLOT-PLAN-VAR
                  m51uLinkage.setUSlotPlanVar51((short) 0);
  
//  MOVE SPACES TO LK-51U-SLOT-POLICY-NO
                  m51uLinkage.setUSlotPolicyNo51(CONSTANTS.SPACE_6);
  
              }

// *If not valued, skip over prime spi logic
              uSlotPolicyNo51 = m51uLinkage.getUSlotPolicyNo51();
              uSlotPlanVar51 = m51uLinkage.getUSlotPlanVar51();
//  IF LK-51U-SLOT-PLAN-VAR > ZEROES AND LK-51U-SLOT-POLICY-NO > SPACES
              if (	( uSlotPlanVar51 > 0 )  &&              ( isGreaterThanSpaces(uSlotPolicyNo51) )) { 

// *Get model policy and plan and try to read spi with it
//  MOVE XRF-PLCY-CM TO WS-POL-NO
                  workFields.setPolNo(xrfCmInfo.getXrfPlcyCm());
  
//  MOVE XRF-DIV-CM TO WS-PLAN-VAR-PREV
                  workFields.setPlanVarPrev(xrfCmInfo.getXrfDivCm());
  
//  MOVE LK-51U-POLICY-NO TO WS-HOLD-51U-POLICY
                  workFields.setHold51uPolicy(m51uLinkage.getUPolicyNo51());
  
//  MOVE LK-51U-PLAN-VAR TO WS-HOLD-51U-PLAN
                  workFields.setHold51uPlan( m51uLinkage.getUPlanVar51());
  
//  MOVE XRF-PLCY-CM TO LK-51U-POLICY-NO
                  m51uLinkage.setUPolicyNo51(xrfCmInfo.getXrfPlcyCm());
  
//  MOVE XRF-DIV-CM TO LK-51U-PLAN-VAR
                  m51uLinkage.setUPlanVar51(xrfCmInfo.getXrfDivCm());
  
//  SET 2010-WITH-MMI-POL TO TRUE
                  work.setWithMmiPol2010True(); 
                  
//  PERFORM 2010-READ-PLAN-ALT-FILE THRU 2010-EXIT
                  readPlanAltFile();/*2010-READ-PLAN-ALT-FILE*/
                  if (this.isProgramEnded()) {
                      return ;
                  }
//  IF MMI-ALT-NOT-FOUND OR ( PLAN-VAR-NOT-FOUND )
                  if ( work.isMmiAltNotFound()   || ( work.isPlanVarNotFound()  )) { 

// *Not found with model, use orig value passed in linkage
                      // MOVE ' ' TO WS-MMI-FOUND-SW
                      //  SPACE = ' '
                      work.setMmiFoundSw(CONSTANTS.SPACE);
                      // MOVE ' ' TO WS-2010-WITH-MMI-SW
                      //  SPACE = ' '
                      work.setWithMmiSw2010(CONSTANTS.SPACE);
//  MOVE WS-HOLD-51U-POLICY TO LK-51U-POLICY-NO
                      m51uLinkage.setUPolicyNo51(workFields.getHold51uPolicy());
  
//  MOVE WS-HOLD-51U-PLAN TO LK-51U-PLAN-VAR
                      m51uLinkage.setUPlanVar51((short) workFields.getHold51uPlan());
  
//  MOVE LK-51U-POLICY-NO TO WS-POL-NO
                      workFields.setPolNo(m51uLinkage.getUPolicyNo51());
  
//  MOVE LK-51U-PLAN-VAR TO WS-PLAN-VAR-PREV
                      workFields.setPlanVarPrev(m51uLinkage.getUPlanVar51());
  
//  PERFORM 2010-READ-PLAN-ALT-FILE THRU 2010-EXIT
                      readPlanAltFile();/*2010-READ-PLAN-ALT-FILE*/
                      if (this.isProgramEnded()) {
                          return ;
                      }
                  }
              }
  
//  ELSE
              else { 

// ***** Fixed alignment on lines below *******
//  MOVE LK-51U-POLICY-NO TO WS-POL-NO
                  workFields.setPolNo(m51uLinkage.getUPolicyNo51());
  
//  MOVE LK-51U-PLAN-VAR TO WS-PLAN-VAR-PREV
                  workFields.setPlanVarPrev(m51uLinkage.getUPlanVar51());
  
//  PERFORM 2010-READ-PLAN-ALT-FILE THRU 2010-EXIT
                  readPlanAltFile();/*2010-READ-PLAN-ALT-FILE*/
                  if (this.isProgramEnded()) {
                      return ;
                  }
              }
              sub = work.getSub();
//  IF NOT PLAN-VAR-FOUND AND WS-SUB = 1
//  LITERAL_1 = 1
              if (!(work.isPlanVarFound())  && 	( sub == 1 )) { 
                  // MOVE WS-NBR-OF-LINES TO LK-SUB
                  work.setSub01(workFields.getNbrOfLines());
//cobolCode::GO TO 2000-EXIT
return ;
//cobolCodeEnds::GO TO 2000-EXIT
              }
  
          }
//  PERFORM 2600-CHECK-SERVICE-CODES THRU 2600-EXIT
          checkServiceCodes();/*2600-CHECK-SERVICE-CODES*/
          if (this.isProgramEnded()) {
              return ;
          }

// ***           Eqi table read process         ****
// ******************uhg india changes begin*********************
// *    if med-svc  = 999999  or cls-1-5 not numeric
          ckServCls = workFields.getCkServCls();
          cls15 = ckServCls.getCls15();
//  IF MED-SVC = 999999 OR ( CLS-1-5 NOT NUMERIC AND CK-SERV-CLS (1 : 2) NOT ALPHABETIC)
//  LITERAL_999999 = 999999
          if (compareChars(work.getMedSvc(),CONSTANTS.LITERAL_999999) == 0 || (         !(ckServCls.cls15IsNumeric() )  &&   	    !(isAlphabetic(substring(ckServCls.toCharArray(),0,2))) /*Alphabetic*/)) { 

// ******************Uhg india changes end***********************
//  PERFORM 2650-READ-EQI-FILE THRU 2650-EXIT
              readEqiFile();/*2650-READ-EQI-FILE*/
              if (this.isProgramEnded()) {
                  return ;
              }
              continueProcess();/*2650-CONTINUE-PROCESS*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
  
//  IF FE-SPI-TURNED-ON
          if ( work.isFeSpiTurnedOn()  ) { 
//  PERFORM 2030D-READ-SPI-RULES-DB2 THRU 2030D-EXIT VARYING WS-SUB FROM 1 BY 1 UNTIL WS-SUB > WS-NBR-OF-PLAN-VAR
              for (work.setSub(1); 	( work.getSub() <= workFields.getNbrOfPlanVar() ) ; work.setSub(work.getSub() + 1) ) {
              	readSpiRulesDb2();/*2030D-READ-SPI-RULES-DB2 SECTION*/
                  if (this.isProgramEnded()) {
                      return ;
                  }
              }
          }
//  ELSE
          else { 
//  PERFORM 2030-READ-SPI-RULES THRU 2030-EXIT VARYING WS-SUB FROM 1 BY 1 UNTIL WS-SUB > WS-NBR-OF-PLAN-VAR
              for (work.setSub(1); 	( work.getSub() <= workFields.getNbrOfPlanVar() ) ; work.setSub(work.getSub() + 1) ) {
              	readSpiRules();/*2030-READ-SPI-RULES*/
                  if (this.isProgramEnded()) {
                      return ;
                  }
              }
          }

// *** If the service line matched to the same number of items on mor
// *** than one spi rule, we will not apply any spis.  in addition, w
// *** will turn off auto.  tsh 9/93
//  IF NOT-NBR-EQUAL
          if ( work.isNotNbrEqual()  ) { 
//  MOVE WS-HOLD-PS TO LK-51U-OUT-LINE-POS ( LK-SUB )
              dfhcommarea.getLinkAreaM51u().getM51uLinkage().getUOutLineData51(work.getSub01() - 1).setUOutLinePos51(holdTransData.getHoldPs());
  
//  MOVE WS-HOLD-SVC TO LK-51U-OUT-LINE-SERVICE-CODE ( LK-SUB )
              dfhcommarea.getLinkAreaM51u().getM51uLinkage().getUOutLineData51(work.getSub01() - 1).setUOutLineServiceCode51(holdTransData.getHoldSvc());
  
//  MOVE WS-HOLD-CAUSE-CD TO LK-51U-OUT-LINE-CAUSE-CD ( LK-SUB )
              dfhcommarea.getLinkAreaM51u().getM51uLinkage().getUOutLineData51(work.getSub01() - 1).setUOutLineCauseCd51(holdTransData.getHoldCauseCd());
  
//  MOVE WS-HOLD-SPI-TBL-ID TO LK-51U-SPI-TBL-ID
              linkAreaM51u.setUSpiTblId51(holdTransData.getHoldSpiTblId());
  
//  MOVE WS-HOLD-SPI-TBL-ID TO LK-51U-OUT-SPI-TBL-ID ( LK-SUB )
              dfhcommarea.getLinkAreaM51u().getM51uLinkage().getUOutLineData51(work.getSub01() - 1).setUOutSpiTblId51(holdTransData.getHoldSpiTblId());
  
//  MOVE WS-HOLD-POS-TIER-CD TO LK-51U-OUT-POS-TIER-CD ( LK-SUB )
              dfhcommarea.getLinkAreaM51u().getM51uLinkage().getUOutLineData51(work.getSub01() - 1).setUOutPosTierCd51(holdTransData.getHoldPosTierCd());
  
//  MOVE WS-HOLD-DIAG-ELG-IND TO LK-51U-OUT-DIAG-ELG-IND ( LK-SUB )
              dfhcommarea.getLinkAreaM51u().getM51uLinkage().getUOutLineData51(work.getSub01() - 1).setUOutDiagElgInd51(holdTransData.getHoldDiagElgInd());
  
//  MOVE LK-51U-LINE-APP-UNITS ( LK-SUB ) TO LK-51U-OUT-LINE-APP-UNITS ( LK-SUB )
              dfhcommarea.getLinkAreaM51u().getM51uLinkage().getUOutLineData51(work.getSub01() - 1).setUOutLineAppUnits51(dfhcommarea.getLinkAreaM51u().getM51uLinkage().getULineData51(work.getSub01() - 1).getULineAppUnits51());

// *** Removed move of remark-code because it was causing
// *** override-code of 'r' being set incorrectly in 51d
//  MOVE LK-51U-LINE-CHARGE-AMT ( LK-SUB ) TO LK-51U-OUT-LINE-CHARGE-AMT ( LK-SUB )
              dfhcommarea.getLinkAreaM51u().getM51uLinkage().getUOutLineData51(work.getSub01() - 1).setUOutLineChargeAmt51(dfhcommarea.getLinkAreaM51u().getM51uLinkage().getULineData51(work.getSub01() - 1).getULineChargeAmt51());
//  MOVE LK-51U-LINE-NOTCOV-AMT ( LK-SUB ) TO LK-51U-OUT-LINE-NOTCOV-AMT ( LK-SUB )
              dfhcommarea.getLinkAreaM51u().getM51uLinkage().getUOutLineData51(work.getSub01() - 1).setUOutLineNotcovAmt51(dfhcommarea.getLinkAreaM51u().getM51uLinkage().getULineData51(work.getSub01() - 1).getULineNotcovAmt51());
//  MOVE LK-51U-LINE-DOS-DATE ( LK-SUB ) TO LK-51U-OUT-LINE-DOS-DATE ( LK-SUB )
              dfhcommarea.getLinkAreaM51u().getM51uLinkage().getUOutLineData51(work.getSub01() - 1).setUOutLineDosDate51(dfhcommarea.getLinkAreaM51u().getM51uLinkage().getULineData51(work.getSub01() - 1).getULineDosDate51());
              // MOVE ' ' TO WS-NBR-EQUAL
              //  SPACE = ' '
              work.setNbrEqual(CONSTANTS.SPACE);
//  MOVE SPACES TO WS-HOLD-PS
              holdTransData.setHoldPs(CONSTANTS.SPACE_2);
  
//  MOVE SPACES TO WS-HOLD-SVC
              holdTransData.setHoldSvc(CONSTANTS.SPACE_6);
  
//  MOVE SPACES TO WS-HOLD-CAUSE-CD WS-HOLD-SPI-TBL-ID WS-HOLD-POS-TIER-CD WS-HOLD-DIAG-ELG-IND WS-FCND-PS WS-FCND-SVC WS-FCND-CAUSE-CD WS-FRTO-PS WS-FRTO-SVC WS-FRTO-CAUSE-CD WS-PTYP-PS WS-PTYP-SVC WS-PTYP-CAUSE-CD WS-RICD-PS WS-RICD-SVC WS-RICD-CAUSE-CD WS-CAUS-PS WS-CAUS-SVC WS-CAUS-CAUSE-CD WS-RIPA-PS WS-RIPA-SVC WS-RIPA-CAUSE-CD WS-CFLG-PS WS-CFLG-SVC WS-CFLG-CAUSE-CD
              holdTransData.setHoldCauseCd(CONSTANTS.SPACE);
              holdTransData.setHoldSpiTblId(CONSTANTS.SPACE_7);
              holdTransData.setHoldPosTierCd(CONSTANTS.SPACE);
              holdTransData.setHoldDiagElgInd(CONSTANTS.SPACE);
              holdTransData2.setFcndPs(CONSTANTS.SPACE_2);
              holdTransData2.setFcndSvc(CONSTANTS.SPACE_6);
              holdTransData2.setFcndCauseCd(CONSTANTS.SPACE);
              holdTransData2.setFrtoPs(CONSTANTS.SPACE_2);
              holdTransData2.setFrtoSvc(CONSTANTS.SPACE_6);
              holdTransData2.setFrtoCauseCd(CONSTANTS.SPACE);
              holdTransData2.setPtypPs(CONSTANTS.SPACE_2);
              holdTransData2.setPtypSvc(CONSTANTS.SPACE_6);
              holdTransData2.setPtypCauseCd(CONSTANTS.SPACE);
              holdTransData2.setRicdPs(CONSTANTS.SPACE_2);
              holdTransData2.setRicdSvc(CONSTANTS.SPACE_6);
              holdTransData2.setRicdCauseCd(CONSTANTS.SPACE);
              holdTransData2.setCausPs(CONSTANTS.SPACE_2);
              holdTransData2.setCausSvc(CONSTANTS.SPACE_6);
              holdTransData2.setCausCauseCd(CONSTANTS.SPACE);
              holdTransData2.setRipaPs(CONSTANTS.SPACE_2);
              holdTransData2.setRipaSvc(CONSTANTS.SPACE_6);
              holdTransData2.setRipaCauseCd(CONSTANTS.SPACE);
              holdTransData2.setCflgPs(CONSTANTS.SPACE_2);
              holdTransData2.setCflgSvc(CONSTANTS.SPACE_6);
              holdTransData2.setCflgCauseCd(CONSTANTS.SPACE);
  
//  MOVE ZEROS TO WS-NBR-MATCHED
              workFields.setNbrMatched( 0);
//  MOVE ZEROS TO WS-NBR-MATCHED-PREV
              workFields.setNbrMatchedPrev( 0);
              // MOVE 'N' TO WS-END-OF-SPI-RULE
              //  LITERAL_N = 'N'
              work.setEndOfSpiRule(CONSTANTS.LITERAL_N);
          }
//  ELSE
          else { 
//  IF NBR-EQUAL
              if ( work.isNbrEqual1()  ) { 
//  MOVE 'Z' TO LK-51U-STOP-AUTO-SW
//  LITERAL_Z = 'Z'
                  m51uLinkage.setUStopAutoSw51(CONSTANTS.LITERAL_Z);
  
              }
          }
      
      }
      /**
      * readPlanAltFile 
      *   This method is derived from 
  *   COBOL Paragraph - 2010-READ-PLAN-ALT-FILE COBOL Cyclomatic complexity - 10
      * Input  :  

      * - newSpiSw                       COBOL Name: WS-NEW-SPI-SW
      * - uPolicyNo51                    COBOL Name: LK-51U-POLICY-NO
      * - uPlanVar51                     COBOL Name: LK-51U-PLAN-VAR
      * - cicsDfhrespCode                COBOL Name: CICS-DFHRESP-CODE
      * - sub                            COBOL Name: WS-SUB
      * - endOfPlanAlt                   COBOL Name: WS-END-OF-PLAN-ALT
      * - withMmiSw2010                  COBOL Name: WS-2010-WITH-MMI-SW
      * - ddPlanvara                     COBOL Name: DD-PLANVARA
      * - fesaKey1                       COBOL Name: FESA-KEY1
      * - w02FnuLineStartbr              COBOL Name: W02-FNU-LINE-STARTBR
      *
      * Output :  

      * - paragraph                      COBOL Name: WS-PARAGRAPH
      * - planVarFoundSw                 COBOL Name: WS-PLAN-VAR-FOUND-SW
      * - fesaPolicy                     COBOL Name: FESA-POLICY
      * - uPolicyNo51                    COBOL Name: LK-51U-POLICY-NO
      * - fesaPlanVar                    COBOL Name: FESA-PLAN-VAR
      * - uPlanVar51                     COBOL Name: LK-51U-PLAN-VAR
      * - fesaEffDate                    COBOL Name: FESA-EFF-DATE
      * - fesaSpiNbr                     COBOL Name: FESA-SPI-NBR
      * - fesaPolicy1                    COBOL Name: FESA-POLICY1
      * - fesaPlanVar1                   COBOL Name: FESA-PLAN-VAR1
      * - fesaEffDate1                   COBOL Name: FESA-EFF-DATE1
      * - fesaSpiNbr1                    COBOL Name: FESA-SPI-NBR1
      * - mmiFoundSw                     COBOL Name: WS-MMI-FOUND-SW
      * - w02FnuFileStbr                 COBOL Name: W02-FNU-FILE-STBR
      * - ddPlanvara                     COBOL Name: DD-PLANVARA
      * - w02FnuKeyStbr                  COBOL Name: W02-FNU-KEY-STBR
      * - fesaKey1                       COBOL Name: FESA-KEY1
      * - w02RespCd                      COBOL Name: W02-RESP-CD
      * - cicsDfhrespCode                COBOL Name: CICS-DFHRESP-CODE
      * - w02DsplMsg                     COBOL Name: W02-DSPL-MSG
      * - w02FnuLineStartbr              COBOL Name: W02-FNU-LINE-STARTBR
      * - w02DsplErrInd                  COBOL Name: W02-DSPL-ERR-IND
      * - m51uIllogicalCondSw            COBOL Name: M51U-ILLOGICAL-COND-SW
      *
      * @throws CFException
      */
      private void readPlanAltFile() throws Exception {
			// Declare local variables used in the method
			M51uLinkage m51uLinkage = dfhcommarea.getLinkAreaM51u().getM51uLinkage();
			FesaKey fesaKey = feSpiAltPlanRecord.getFesaKey();
			// End of variable declaration

      
// *81***************************************************************
// *81 2010-Read-plan-alt-file                                      *
// *81                                                              *
// *81 business function:                                           *
// *81 this section of the program will start the browse of the plan*
// *81 alternative file.                                            *
// *81***************************************************************
// *82***************************************************************
// *82 2010-read-plan-alt-file                                      *
// *82                                                              *
// *82 1. start browsing the plan alternative file. if the record is*
// *82    not found,exit the section. if any other error occurs,    *
// *82    display the error and abort the program.                  *
// *82 2. if the browse is successful, build and populate a table   *
// *82    to store the policy number, plan dates and plan variables.*
// *82 3. populate the working storage variables for the generic    *
// *82    translators and the additional translators.               *
// *82***************************************************************

// *---------------------*
          // MOVE '2010' TO WS-PARAGRAPH
          //  LITERAL_2010 = '2010'
          workFields.setParagraph(CONSTANTS.LITERAL_2010);
          // MOVE 'N' TO WS-PLAN-VAR-FOUND-SW
          //  LITERAL_N = 'N'
          work.setPlanVarFoundSw(CONSTANTS.LITERAL_N);
//  IF FE-SPI-TURNED-ON
          if ( work.isFeSpiTurnedOn()  ) { 
//  PERFORM 2010D-READ-PLAN-ALT-DB2 THRU 2010D-EXIT
              readPlanAltDb2();/*2010D-READ-PLAN-ALT-DB2 SECTION*/
              if (this.isProgramEnded()) {
                  return ;
              }
//cobolCode::GO TO 2010-EXIT
return ;
//cobolCodeEnds::GO TO 2010-EXIT
          }
//  MOVE LK-51U-POLICY-NO TO FESA-POLICY
          fesaKey.setFesaPolicy(m51uLinkage.getUPolicyNo51());
  
//  MOVE LK-51U-PLAN-VAR TO FESA-PLAN-VAR
          fesaKey.setFesaPlanVar(m51uLinkage.getUPlanVar51());
  
//  MOVE ZEROS TO FESA-EFF-DATE FESA-SPI-NBR
          fesaKey.setFesaEffDate(0);
          fesaKey.setFesaSpiNbr(0);
  
//  MOVE FESA-POLICY TO FESA-POLICY1
          fesaKey1.setFesaPolicy1(fesaKey.getFesaPolicy());
  
//  MOVE FESA-PLAN-VAR TO FESA-PLAN-VAR1
          fesaKey1.setFesaPlanVar1(fesaKey.getFesaPlanVar());
  
//  MOVE FESA-EFF-DATE TO FESA-EFF-DATE1
          fesaKey1.setFesaEffDate1(fesaKey.getFesaEffDate());
  
//  MOVE FESA-SPI-NBR TO FESA-SPI-NBR1
          fesaKey1.setFesaSpiNbr1(fesaKey.getFesaSpiNbr());
  
//  PERFORM 2016-START-BROWSE-PLANVARA THRU 2016-EXIT
          startBrowsePlanvara();/*2016-START-BROWSE-PLANVARA*/
          if (this.isProgramEnded()) {
              return ;
          }
//  EVALUATE TRUE
          if  ( work.isCicsNormal()  ) { 
//  PERFORM 2020-BUILD-PLAN-ALT-TABLE THRU 2020-EXIT UNTIL WS-SUB > 50 OR END-OF-PLAN-ALT
              while (	( work.getSub() <= 50 ) && !(work.isEndOfPlanAlt1()) ) {
                 buildPlanAltTable();/*2020-BUILD-PLAN-ALT-TABLE*/
                 if (this.isProgramEnded()) {
                     return ;
                 }
              }
          }
          else if  ( work.isCicsNotfnd()  ) { 
//  IF 2010-WITH-MMI-POL
              if ( work.isWithMmiPol2010()  ) { 
//  SET MMI-ALT-NOT-FOUND TO TRUE
                  work.setMmiAltNotFoundTrue(); 
                  
              }
          }
          else if  ( work.isCicsEndfile()  ) { 
              ;
          }
          else   { 
//  MOVE DD-PLANVARA TO W02-FNU-FILE-STBR
              w02FnuLineStartbr.setW02FnuFileStbr(work.getDdPlanvara());
//  MOVE FESA-POLICY TO FESA-POLICY1
              fesaKey1.setFesaPolicy1(fesaKey.getFesaPolicy());
  
//  MOVE FESA-PLAN-VAR TO FESA-PLAN-VAR1
              fesaKey1.setFesaPlanVar1(fesaKey.getFesaPlanVar());
  
//  MOVE FESA-EFF-DATE TO FESA-EFF-DATE1
              fesaKey1.setFesaEffDate1(fesaKey.getFesaEffDate());
  
//  MOVE FESA-SPI-NBR TO FESA-SPI-NBR1
              fesaKey1.setFesaSpiNbr1(fesaKey.getFesaSpiNbr());
  
              // MOVE FESA-KEY1 TO W02-FNU-KEY-STBR
              w02FnuLineStartbr.setW02FnuKeyStbr(fesaKey1.toCharArray());
//  MOVE CICS-DFHRESP-CODE TO W02-RESP-CD
              w02DsplMsgArea.setW02RespCd( work.getCicsDfhrespCode());
              // MOVE W02-FNU-LINE-STARTBR TO W02-DSPL-MSG
              w02DsplMsgArea.setW02DsplMsg(w02FnuLineStartbr.toCharArray());
//  MOVE 'ERR' TO W02-DSPL-ERR-IND
//  LITERAL_ERR = 'ERR'
              w02DsplMsgArea.setW02DsplErrInd(CONSTANTS.LITERAL_ERR);
//  PERFORM 11100A-WRITE-TO-SYSM THRU 11100A-EXIT
              writeToSysm();/*11100A-WRITE-TO-SYSM SECTION*/
              if (this.isProgramEnded()) {
                  return ;
              }
//  SET M51U-ILLOGICAL-COND TO TRUE
              dfhcommarea.getLinkAreaM51u().getM51uFlags().setM51uIllogicalCondTrue(); 
              
//  PERFORM 8000-DUMP-ABEND THRU 8000-EXIT
              dumpAbend();/*8000-DUMP-ABEND SECTION*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
//  PERFORM 2018-END-BROWSE-PLANVARA THRU 2018-EXIT
          endBrowsePlanvara();/*2018-END-BROWSE-PLANVARA*/
//  IF MMI-ALT-NOT-FOUND
          if ( work.isMmiAltNotFound()  ) { 
//cobolCode::GO TO 2010-EXIT
return ;
//cobolCodeEnds::GO TO 2010-EXIT
          }
//  PERFORM 2013-NEW-SPI-TRANSLATION THRU 2013-EXIT
          newSpiTranslation();/*2013-NEW-SPI-TRANSLATION*/

// *** Sdb dec95 deliverable
//  PERFORM 2015-GENERIC-TRANSLATION THRU 2015-EXIT
          genericTranslation();/*2015-GENERIC-TRANSLATION*/
          ;
      
      }
      /**
      * newSpiTranslation 
      *   This method is derived from 
  *   COBOL Paragraph - 2013-NEW-SPI-TRANSLATION COBOL Cyclomatic complexity - 5
      * Input  :  

      * - sub                            COBOL Name: WS-SUB
      * - uTrnslNdx51                    COBOL Name: LK-51U-TRNSL-NDX
      * - uGenericTrnsl51                COBOL Name: LK-51U-GENERIC-TRNSL
      * - newTransl                      COBOL Name: WS-NEW-TRANSL
      * - nbrOfPlanVar                   COBOL Name: WS-NBR-OF-PLAN-VAR
      *
      * Output :  

      * - newSub                         COBOL Name: WS-NEW-SUB
      * - sub                            COBOL Name: WS-SUB
      * - newNdx                         COBOL Name: NEW-NDX
      * - uTrnslNdx51                    COBOL Name: LK-51U-TRNSL-NDX
      * - fesaPolicy01                   COBOL Name: WS-FESA-POLICY
      * - fesaPlanVar01                  COBOL Name: WS-FESA-PLAN-VAR
      * - fesaEffDate01                  COBOL Name: WS-FESA-EFF-DATE
      * - fesaSpiNbr01                   COBOL Name: WS-FESA-SPI-NBR
      * - newTransl                      COBOL Name: WS-NEW-TRANSL
      * - planVarFoundSw                 COBOL Name: WS-PLAN-VAR-FOUND-SW
      * - nbrOfPlanVar                   COBOL Name: WS-NBR-OF-PLAN-VAR
      *
      * @throws CFException
      */
      private void newSpiTranslation() throws Exception {
			// Declare local variables used in the method
			UGenericTranslation51 uGenericTranslation51 = dfhcommarea.getLinkAreaM51u().getUGenericTranslation51();
			int newSub = 0;
			// End of variable declaration

      
// ***Sdb
// *81***************************************************************
// *81 2013-new-spi-translation                                     *
// *81                                                              *
// *81 business function:                                           *
// *81 this section takes care of the two additional spi(special    *
// *81 processing instructions) which are built to be accessed for  *
// *81 all policies/plan variations.                                *
// *81***************************************************************
// *82***************************************************************
// *82 2013-new-spi-translation                                     *
// *82                                                              *
// *82 1. while the translation index is less than 2, populate the  *
// *82    storage variables with the policy number('000000'),       *
// *82    plan variable ('0001'),effective date (zeroes) and new    *
// *82    translator, when the  generic translater key is set to 'y'*
// *82***************************************************************

// *-------------------------*
          // MOVE WS-SUB TO WS-NEW-SUB
          work.setNewSub(work.getSub());
//  SET NEW-NDX TO 1
          newNdx = 1; 
          
//  PERFORM VARYING LK-51U-TRNSL-NDX FROM 1 BY 1 UNTIL LK-51U-TRNSL-NDX > 2
          for (uTrnslNdx51 = 1; (	( uTrnslNdx51 <= 2 )) ; uTrnslNdx51 = uTrnslNdx51 + 1 ) {

// ****    If ws-new-sub  < 26
// **45917zif ws-new-sub  < 51
              newSub = work.getNewSub();
//  IF WS-NEW-SUB < 9999
              if (	( newSub < 9999 )) { 
//  IF LK-51U-GENERIC-TRNSL ( LK-51U-TRNSL-NDX ) = 'Y'
//  LITERAL_Y = 'Y'
                  if (uGenericTranslation51.getUGenericTrnslGroup51(uTrnslNdx51 - 1).getUGenericTrnsl51()[0] == 'Y') { 
//  MOVE '000000' TO WS-FESA-POLICY ( WS-NEW-SUB )
//  LITERAL_000000 = '000000'
                      workFields.getPlanVarInputLines().getPlanVarRec(work.getNewSub() - 1).setFesaPolicy01(CONSTANTS.LITERAL_000000);
//  MOVE '0001' TO WS-FESA-PLAN-VAR ( WS-NEW-SUB )
                      workFields.getPlanVarInputLines().getPlanVarRec(work.getNewSub() - 1).setFesaPlanVar01(1);
//  MOVE ZEROES TO WS-FESA-EFF-DATE ( WS-NEW-SUB )
                      workFields.getPlanVarInputLines().getPlanVarRec(work.getNewSub() - 1).setFesaEffDate01(0);
//  MOVE WS-NEW-TRANSL ( NEW-NDX ) TO WS-FESA-SPI-NBR ( WS-NEW-SUB )
                      workFields.getPlanVarInputLines().getPlanVarRec(work.getNewSub() - 1).setFesaSpiNbr01( newTransSpiTableGroup.getNewTransSpiTableR().getTabItem(newNdx - 1).getNewTransl());
                      // MOVE 'Y' TO WS-PLAN-VAR-FOUND-SW
                      //  LITERAL_Y = 'Y'
                      work.setPlanVarFoundSw(CONSTANTS.LITERAL_Y);
//  SET NEW-NDX UP BY 1
                      newNdx++; 
                      
//  ADD 1 TO WS-NEW-SUB
                      work.setNewSub(work.getNewSub()+1);
//  ADD 1 TO WS-NBR-OF-PLAN-VAR
                      workFields.setNbrOfPlanVar(workFields.getNbrOfPlanVar()+1);
                  }
  
//  ELSE
                  else { 
//  SET NEW-NDX UP BY 1
                      newNdx++; 
                      
                  }
              }
  
          }
      
      }
      /**
      * genericTranslation 
      *   This method is derived from 
  *   COBOL Paragraph - 2015-GENERIC-TRANSLATION COBOL Cyclomatic complexity - 5
      * Input  :  

      * - newSub                         COBOL Name: WS-NEW-SUB
      * - uTrnslNdx51                    COBOL Name: LK-51U-TRNSL-NDX
      * - uGenericTrnsl51                COBOL Name: LK-51U-GENERIC-TRNSL
      * - uPolicyNo51                    COBOL Name: LK-51U-POLICY-NO
      * - uPlanVar51                     COBOL Name: LK-51U-PLAN-VAR
      * - genericTransl                  COBOL Name: WS-GENERIC-TRANSL
      * - nbrOfPlanVar                   COBOL Name: WS-NBR-OF-PLAN-VAR
      *
      * Output :  

      * - genSub                         COBOL Name: WS-GEN-SUB
      * - newSub                         COBOL Name: WS-NEW-SUB
      * - genNdx                         COBOL Name: GEN-NDX
      * - uTrnslNdx51                    COBOL Name: LK-51U-TRNSL-NDX
      * - fesaPolicy01                   COBOL Name: WS-FESA-POLICY
      * - uPolicyNo51                    COBOL Name: LK-51U-POLICY-NO
      * - fesaPlanVar01                  COBOL Name: WS-FESA-PLAN-VAR
      * - uPlanVar51                     COBOL Name: LK-51U-PLAN-VAR
      * - fesaEffDate01                  COBOL Name: WS-FESA-EFF-DATE
      * - fesaSpiNbr01                   COBOL Name: WS-FESA-SPI-NBR
      * - genericTransl                  COBOL Name: WS-GENERIC-TRANSL
      * - planVarFoundSw                 COBOL Name: WS-PLAN-VAR-FOUND-SW
      * - nbrOfPlanVar                   COBOL Name: WS-NBR-OF-PLAN-VAR
      *
      * @throws CFException
      */
      private void genericTranslation() throws Exception {
			// Declare local variables used in the method
			M51uLinkage m51uLinkage = dfhcommarea.getLinkAreaM51u().getM51uLinkage();
			UGenericTranslation51 uGenericTranslation51 = dfhcommarea.getLinkAreaM51u().getUGenericTranslation51();
			int genSub = 0;
			// End of variable declaration

      
// *81***************************************************************
// *81 2015-Generic-translation                                     *
// *81                                                              *
// *81 business function:                                           *
// *81 the online plan screen allows the generic translation        *
// *81 indicators to be set(there are nine generic translations).if *
// *81 any of the indicators are set, load the generic  tranlsation *
// *81 to the spi(special processing instructions)  table to be     *
// *81 applied later in the program.                                *
// *81***************************************************************
// *82***************************************************************
// *82 2015-generic-translation                                     *
// *82                                                              *
// *82 1. while the translation index is less than 9, populate the  *
// *82    storage variables with the policy number, plan variable,  *
// *82    effective date and generic translator, when then generic  *
// *82    translator key is set to 'y'                              *
// *82***************************************************************

// *-------------------------*
          // MOVE WS-NEW-SUB TO WS-GEN-SUB
          work.setGenSub(work.getNewSub());
//  SET GEN-NDX TO 1
          genNdx = 1; 
          
//  PERFORM VARYING LK-51U-TRNSL-NDX FROM 1 BY 1 UNTIL LK-51U-TRNSL-NDX > 9
          for (uTrnslNdx51 = 1; (	( uTrnslNdx51 <= 9 )) ; uTrnslNdx51 = uTrnslNdx51 + 1 ) {

// ****    If ws-gen-sub  < 26
// **45917zif ws-gen-sub  < 51
              genSub = work.getGenSub();
//  IF WS-GEN-SUB < 9999
              if (	( genSub < 9999 )) { 
//  IF LK-51U-GENERIC-TRNSL ( LK-51U-TRNSL-NDX ) = 'Y'
//  LITERAL_Y = 'Y'
                  if (uGenericTranslation51.getUGenericTrnslGroup51(uTrnslNdx51 - 1).getUGenericTrnsl51()[0] == 'Y') { 
//  MOVE LK-51U-POLICY-NO TO WS-FESA-POLICY ( WS-GEN-SUB )
                      workFields.getPlanVarInputLines().getPlanVarRec(work.getGenSub() - 1).setFesaPolicy01(m51uLinkage.getUPolicyNo51());
  
//  MOVE LK-51U-PLAN-VAR TO WS-FESA-PLAN-VAR ( WS-GEN-SUB )
                      workFields.getPlanVarInputLines().getPlanVarRec(work.getGenSub() - 1).setFesaPlanVar01(m51uLinkage.getUPlanVar51());
  
//  MOVE ZEROES TO WS-FESA-EFF-DATE ( WS-GEN-SUB )
                      workFields.getPlanVarInputLines().getPlanVarRec(work.getGenSub() - 1).setFesaEffDate01(0);
//  MOVE WS-GENERIC-TRANSL ( GEN-NDX ) TO WS-FESA-SPI-NBR ( WS-GEN-SUB )
                      workFields.getPlanVarInputLines().getPlanVarRec(work.getGenSub() - 1).setFesaSpiNbr01( genTransSpiTableGroup.getGenTransSpiTableR().getTableItem(genNdx - 1).getGenericTransl());
                      // MOVE 'Y' TO WS-PLAN-VAR-FOUND-SW
                      //  LITERAL_Y = 'Y'
                      work.setPlanVarFoundSw(CONSTANTS.LITERAL_Y);
//  SET GEN-NDX UP BY 1
                      genNdx++; 
                      
//  ADD 1 TO WS-GEN-SUB
                      work.setGenSub(work.getGenSub()+1);
//  ADD 1 TO WS-NBR-OF-PLAN-VAR
                      workFields.setNbrOfPlanVar(workFields.getNbrOfPlanVar()+1);
                  }
  
//  ELSE
                  else { 
//  SET GEN-NDX UP BY 1
                      genNdx++; 
                      
                  }
              }
  
          }
      
      }
      /**
      * startBrowsePlanvara 
      *   This method is derived from 
  *   COBOL Paragraph - 2016-START-BROWSE-PLANVARA COBOL Cyclomatic complexity - 1
      * Input  :  

      * - eibresp                        COBOL Name: EIBRESP
      * - eibrcode                       COBOL Name: EIBRCODE
      *
      * Output :  

      * - cicsDfhrespCode                COBOL Name: CICS-DFHRESP-CODE
      * - eibresp                        COBOL Name: EIBRESP
      * - cetEibrcd                      COBOL Name: CET-EIBRCD
      * - eibrcode                       COBOL Name: EIBRCODE
      *
      * @throws CFException
      */
      private void startBrowsePlanvara() throws Exception {

// *EXEC CICS STARTBR 
// *  FILE      (DD-PLANVARA) 
// *  RIDFLD    (FESA-KEY) 
// *  KEYLENGTH (LENGTH OF FESA-KEY) 
// *  RESP      (CICS-DFHRESP-CODE) 
// *END-EXEC. 
//  STARTBR FILE (DD-PLANVARA) RIDFLD (FESA-KEY) KEYLENGTH (FUNCTION~LENGTH~FESA-KEY) RESP (CICS-DFHRESP-CODE)
          // STARTBR FILE (DD-PLANVARA) RIDFLD (FESA-KEY) KEYLENGTH (FUNCTION~LENGTH~FESA-KEY) RESP (CICS-DFHRESP-CODE)
          // start Browsing a file
          TransactionManager.startBrowsing(getCICSSession(), work.getDdPlanvara(),feSpiAltPlanRecord.getFesaKey().toCharArray(),"".toCharArray()/*reqId*/,"".toCharArray()/*sysId*/,FesaKey.getFesaKeyFieldLength(),false/*debkey*/,false/*debrec*/,false/*rba*/,false/*rrn*/,false/*xrba*/,false/*gteq*/,false/*equal*/,false/*generic*/,new KeyInfo(0, 17, 0, false));
//  MOVE EIBRESP TO CICS-DFHRESP-CODE
          work.setCicsDfhrespCode(cicsSession.getEibresp());
//  MOVE EIBRCODE TO CET-EIBRCD
          cetCicsErrorTableGroup.getCetCicsErrorTable().setCetEibrcd(cicsSession.getEibrcode());
      
      }
      /**
      * readNextPlanvara 
      *   This method is derived from 
  *   COBOL Paragraph - 2017-READ-NEXT-PLANVARA COBOL Cyclomatic complexity - 1
      * Input  :  

      * - eibresp                        COBOL Name: EIBRESP
      * - eibrcode                       COBOL Name: EIBRCODE
      *
      * Output :  

      * - cicsDfhrespCode                COBOL Name: CICS-DFHRESP-CODE
      * - eibresp                        COBOL Name: EIBRESP
      * - cetEibrcd                      COBOL Name: CET-EIBRCD
      * - eibrcode                       COBOL Name: EIBRCODE
      *
      * @throws CFException
      */
      private void readNextPlanvara() throws Exception {

// *EXEC CICS READNEXT 
// *  FILE      (DD-PLANVARA) 
// *  INTO      (FE-SPI-ALT-PLAN-RECORD) 
// *  RIDFLD    (FESA-KEY) 
// *  KEYLENGTH (LENGTH OF FESA-KEY) 
// *  LENGTH    (LENGTH OF FE-SPI-ALT-PLAN-RECORD) 
// *  RESP      (CICS-DFHRESP-CODE) 
// *END-EXEC. 
//  READNEXT FILE (DD-PLANVARA) INTO (FE-SPI-ALT-PLAN-RECORD) RIDFLD (FESA-KEY) KEYLENGTH (FUNCTION~LENGTH~FESA-KEY) LENGTH (FUNCTION~LENGTH~FE-SPI-ALT-PLAN-RECORD) RESP (CICS-DFHRESP-CODE)
          // READNEXT FILE (DD-PLANVARA) INTO (FE-SPI-ALT-PLAN-RECORD) RIDFLD (FESA-KEY) KEYLENGTH (FUNCTION~LENGTH~FESA-KEY) LENGTH (FUNCTION~LENGTH~FE-SPI-ALT-PLAN-RECORD) RESP (CICS-DFHRESP-CODE)
          // read the next record from a file
          feSpiAltPlanRecord.setString(TransactionManager.readNextRecord(getCICSSession(), work.getDdPlanvara(),feSpiAltPlanRecord.getFesaKey().toCharArray(),"".toCharArray()/*Token*/,"".toCharArray()/*SysId*/,FesaKey.getFesaKeyFieldLength(),FeSpiAltPlanRecord.getFeSpiAltPlanRecordFieldLength(),"".toCharArray()/*ReqId*/,false/*rba*/,false/*rrn*/,false/*xrba*/,false/*nosuspend*/,false/*uncommitted*/,false/*consistent*/,false/*repeatable*/,false/*update*/).toCharArray());
//  MOVE EIBRESP TO CICS-DFHRESP-CODE
          work.setCicsDfhrespCode(cicsSession.getEibresp());
//  MOVE EIBRCODE TO CET-EIBRCD
          cetCicsErrorTableGroup.getCetCicsErrorTable().setCetEibrcd(cicsSession.getEibrcode());
      
      }
      /**
      * endBrowsePlanvara 
      *   This method is derived from 
  *   COBOL Paragraph - 2018-END-BROWSE-PLANVARA COBOL Cyclomatic complexity - 1
      * Input  :  

      * - eibresp                        COBOL Name: EIBRESP
      *
      * Output :  

      * - cicsDfhrespCode                COBOL Name: CICS-DFHRESP-CODE
      * - eibresp                        COBOL Name: EIBRESP
      *
      * @throws CFException
      */
      private void endBrowsePlanvara() throws Exception {
//  ENDBR FILE (DD-PLANVARA) RESP (CICS-DFHRESP-CODE)
          // ENDBR FILE (DD-PLANVARA) RESP (CICS-DFHRESP-CODE)
          // end browsing the file
          TransactionManager.endBrowsing(getCICSSession(), work.getDdPlanvara(),"".toCharArray()/*sysId*/,"".toCharArray()/*reqId*/);
//  MOVE EIBRESP TO CICS-DFHRESP-CODE
          work.setCicsDfhrespCode(cicsSession.getEibresp());
      
      }
      /**
      * buildPlanAltTable 
      *   This method is derived from 
  *   COBOL Paragraph - 2020-BUILD-PLAN-ALT-TABLE COBOL Cyclomatic complexity - 9
      * Input  :  

      * - cicsDfhrespCode                COBOL Name: CICS-DFHRESP-CODE
      * - fesaPolicy                     COBOL Name: FESA-POLICY
      * - polNo                          COBOL Name: WS-POL-NO
      * - fesaPlanVar                    COBOL Name: FESA-PLAN-VAR
      * - planVarPrev                    COBOL Name: WS-PLAN-VAR-PREV
      * - fesaEffDate                    COBOL Name: FESA-EFF-DATE
      * - fesaCanDt                      COBOL Name: FESA-CAN-DT
      * - uLineDosDate51                 COBOL Name: LK-51U-LINE-DOS-DATE
      * - planDosYy                      COBOL Name: WS-PLAN-DOS-YY
      * - planDosMm                      COBOL Name: WS-PLAN-DOS-MM
      * - planDosDd                      COBOL Name: WS-PLAN-DOS-DD
      * - planDate                       COBOL Name: WS-PLAN-DATE
      * - fesaSpiNbr                     COBOL Name: FESA-SPI-NBR
      * - sub                            COBOL Name: WS-SUB
      * - nbrOfPlanVar                   COBOL Name: WS-NBR-OF-PLAN-VAR
      * - ddPlanvara                     COBOL Name: DD-PLANVARA
      * - fesaKey1                       COBOL Name: FESA-KEY1
      * - w02FnuLineReadnext             COBOL Name: W02-FNU-LINE-READNEXT
      *
      * Output :  

      * - endOfPlanAlt                   COBOL Name: WS-END-OF-PLAN-ALT
      * - planEffDate                    COBOL Name: WS-PLAN-EFF-DATE
      * - fesaEffDate                    COBOL Name: FESA-EFF-DATE
      * - planCanDate                    COBOL Name: WS-PLAN-CAN-DATE
      * - fesaCanDt                      COBOL Name: FESA-CAN-DT
      * - planDosDate                    COBOL Name: WS-PLAN-DOS-DATE
      * - uLineDosDate51                 COBOL Name: LK-51U-LINE-DOS-DATE
      * - planYy                         COBOL Name: WS-PLAN-YY
      * - planDosYy                      COBOL Name: WS-PLAN-DOS-YY
      * - planMm                         COBOL Name: WS-PLAN-MM
      * - planDosMm                      COBOL Name: WS-PLAN-DOS-MM
      * - planDd                         COBOL Name: WS-PLAN-DD
      * - planDosDd                      COBOL Name: WS-PLAN-DOS-DD
      * - fesaPolicy01                   COBOL Name: WS-FESA-POLICY
      * - fesaPolicy                     COBOL Name: FESA-POLICY
      * - fesaPlanVar01                  COBOL Name: WS-FESA-PLAN-VAR
      * - fesaPlanVar                    COBOL Name: FESA-PLAN-VAR
      * - fesaEffDate01                  COBOL Name: WS-FESA-EFF-DATE
      * - fesaSpiNbr01                   COBOL Name: WS-FESA-SPI-NBR
      * - fesaSpiNbr                     COBOL Name: FESA-SPI-NBR
      * - planVarFoundSw                 COBOL Name: WS-PLAN-VAR-FOUND-SW
      * - sub                            COBOL Name: WS-SUB
      * - nbrOfPlanVar                   COBOL Name: WS-NBR-OF-PLAN-VAR
      * - w02FnuFileRdnxt                COBOL Name: W02-FNU-FILE-RDNXT
      * - ddPlanvara                     COBOL Name: DD-PLANVARA
      * - fesaPolicy1                    COBOL Name: FESA-POLICY1
      * - fesaPlanVar1                   COBOL Name: FESA-PLAN-VAR1
      * - fesaEffDate1                   COBOL Name: FESA-EFF-DATE1
      * - fesaSpiNbr1                    COBOL Name: FESA-SPI-NBR1
      * - w02FnuKeyRdnxt                 COBOL Name: W02-FNU-KEY-RDNXT
      * - fesaKey1                       COBOL Name: FESA-KEY1
      * - w02RespCd                      COBOL Name: W02-RESP-CD
      * - cicsDfhrespCode                COBOL Name: CICS-DFHRESP-CODE
      * - w02DsplMsg                     COBOL Name: W02-DSPL-MSG
      * - w02FnuLineReadnext             COBOL Name: W02-FNU-LINE-READNEXT
      * - w02DsplErrInd                  COBOL Name: W02-DSPL-ERR-IND
      * - m51uIllogicalCondSw            COBOL Name: M51U-ILLOGICAL-COND-SW
      *
      * @throws CFException
      */
      private void buildPlanAltTable() throws Exception {
			// Declare local variables used in the method
			FesaKey fesaKey = feSpiAltPlanRecord.getFesaKey();
			char[] fesaPolicy = null;
			char[] polNo = null;
			int fesaPlanVar = 0;
			short planVarPrev = 0;
			PlanDosDt planDosDt = workFields.getPlanDosDt();
			PlanDt planDt = workFields.getPlanDt();
			long planDate = 0;
			long planCanDate = 0;
			// End of variable declaration

      
// *81 Built if date of service falls within the plan effective date*
// *81 and plan cancellation date.                                  *
// *81***************************************************************
// *82***************************************************************
// *82 2020-build-plan-alt-table                                    *
// *82                                                              *
// *82 1. read the next record from the plan variation file.        *
// *82    if the record is not found, or the end of file is reached *
// *82    set a switch to indicate the same and exit the section. if*
// *82    any other error occurs, display the error and abort the   *
// *82    program.                                                  *
// *82 2. if the policy number and the plan variable in the record  *
// *82    does not match with the ones in the storage variables,    *
// *82    exit the paragraph,otherwise                              *
// *82    -populate the storage variables with the plan dates.      *
// *82    -check if the date of service falls within the plan       *
// *82     effective date and the cancel date. also add a century   *
// *82     variable to the dates.                                   *
// *82    -built a table to store the policy name, plan variable,   *
// *82     effective date and special processing instructions number*
// *82***************************************************************

// *-------------------------*
//  PERFORM 2017-READ-NEXT-PLANVARA THRU 2017-EXIT
          readNextPlanvara();/*2017-READ-NEXT-PLANVARA*/
          if (this.isProgramEnded()) {
              return ;
          }
//  EVALUATE TRUE
          if  ( work.isCicsNormal()  ) { 
              polNo = workFields.getPolNo();
              planVarPrev = workFields.getPlanVarPrev();
              fesaPolicy = fesaKey.getFesaPolicy();
//  IF FESA-POLICY NOT = WS-POL-NO OR FESA-PLAN-VAR NOT = WS-PLAN-VAR-PREV
              if (		compareChars(fesaPolicy,polNo) != 0  || 	( fesaKey.getFesaPlanVar() != planVarPrev ) ) { 
                  // MOVE 'Y' TO WS-END-OF-PLAN-ALT
                  //  LITERAL_Y = 'Y'
                  work.setEndOfPlanAlt(CONSTANTS.LITERAL_Y);
//cobolCode::GO TO 2020-EXIT
return ;
//cobolCodeEnds::GO TO 2020-EXIT
              }
  
//  ELSE
              else { 
//  MOVE FESA-EFF-DATE TO WS-PLAN-EFF-DATE
                  workFields.setPlanEffDate( fesaKey.getFesaEffDate());
  
//  MOVE FESA-CAN-DT TO WS-PLAN-CAN-DATE
                  workFields.setPlanCanDate( feSpiAltPlanRecord.getFesaCanDt());
//  MOVE LK-51U-LINE-DOS-DATE ( LK-SUB ) TO WS-PLAN-DOS-DATE
                  workFields.setPlanDosDate( dfhcommarea.getLinkAreaM51u().getM51uLinkage().getULineData51(work.getSub01() - 1).getULineDosDate51());
//  MOVE WS-PLAN-DOS-YY TO WS-PLAN-YY
                  planDt.setPlanYy(planDosDt.getPlanDosYy());
  
//  MOVE WS-PLAN-DOS-MM TO WS-PLAN-MM
                  planDt.setPlanMm(planDosDt.getPlanDosMm());
  
//  MOVE WS-PLAN-DOS-DD TO WS-PLAN-DD
                  planDt.setPlanDd(planDosDt.getPlanDosDd());
  
//  PERFORM 2021-ADD-CENTURY-TO-DATES THRU 2021-EXIT
                  addCenturyToDates();/*2021-ADD-CENTURY-TO-DATES*/
                  if (this.isProgramEnded()) {
                      return ;
                  }
                  planDate = workFields.getPlanDate();
                  planCanDate = workFields.getPlanCanDate();
//  IF ( WS-PLAN-DATE NOT < WS-PLAN-EFF-DATE ) AND ( WS-PLAN-DATE NOT > WS-PLAN-CAN-DATE )
                  if ((	( planDate >= workFields.getPlanEffDate() )) && (	( planDate <= planCanDate ))) { 
//  MOVE FESA-POLICY TO WS-FESA-POLICY ( WS-SUB )
                      workFields.getPlanVarInputLines().getPlanVarRec(work.getSub() - 1).setFesaPolicy01(fesaKey.getFesaPolicy());
  
//  MOVE FESA-PLAN-VAR TO WS-FESA-PLAN-VAR ( WS-SUB )
                      workFields.getPlanVarInputLines().getPlanVarRec(work.getSub() - 1).setFesaPlanVar01(fesaKey.getFesaPlanVar());
  
//  MOVE FESA-EFF-DATE TO WS-FESA-EFF-DATE ( WS-SUB )
                      workFields.getPlanVarInputLines().getPlanVarRec(work.getSub() - 1).setFesaEffDate01(fesaKey.getFesaEffDate());
  
//  MOVE FESA-SPI-NBR TO WS-FESA-SPI-NBR ( WS-SUB )
                      workFields.getPlanVarInputLines().getPlanVarRec(work.getSub() - 1).setFesaSpiNbr01(fesaKey.getFesaSpiNbr());
  
                      // MOVE 'Y' TO WS-PLAN-VAR-FOUND-SW
                      //  LITERAL_Y = 'Y'
                      work.setPlanVarFoundSw(CONSTANTS.LITERAL_Y);
//  ADD 1 TO WS-SUB WS-NBR-OF-PLAN-VAR
                      work.setSub(work.getSub()+1);
                      workFields.setNbrOfPlanVar(workFields.getNbrOfPlanVar()+1);
                  }
  
//  ELSE
              }
          }
          else if  (( work.isCicsEof()  ) || ( work.isCicsEndfile()  )) { 
              // MOVE 'Y' TO WS-END-OF-PLAN-ALT
              //  LITERAL_Y = 'Y'
              work.setEndOfPlanAlt(CONSTANTS.LITERAL_Y);
//cobolCode::GO TO 2020-EXIT
return ;
//cobolCodeEnds::GO TO 2020-EXIT
          }
          else   { 
//  MOVE DD-PLANVARA TO W02-FNU-FILE-RDNXT
              w02FnuLineReadnext.setW02FnuFileRdnxt(work.getDdPlanvara());
//  MOVE FESA-POLICY TO FESA-POLICY1
              fesaKey1.setFesaPolicy1(fesaKey.getFesaPolicy());
  
//  MOVE FESA-PLAN-VAR TO FESA-PLAN-VAR1
              fesaKey1.setFesaPlanVar1(fesaKey.getFesaPlanVar());
  
//  MOVE FESA-EFF-DATE TO FESA-EFF-DATE1
              fesaKey1.setFesaEffDate1(fesaKey.getFesaEffDate());
  
//  MOVE FESA-SPI-NBR TO FESA-SPI-NBR1
              fesaKey1.setFesaSpiNbr1(fesaKey.getFesaSpiNbr());
  
              // MOVE FESA-KEY1 TO W02-FNU-KEY-RDNXT
              w02FnuLineReadnext.setW02FnuKeyRdnxt(fesaKey1.toCharArray());
//  MOVE CICS-DFHRESP-CODE TO W02-RESP-CD
              w02DsplMsgArea.setW02RespCd( work.getCicsDfhrespCode());
              // MOVE W02-FNU-LINE-READNEXT TO W02-DSPL-MSG
              w02DsplMsgArea.setW02DsplMsg(w02FnuLineReadnext.toCharArray());
//  MOVE 'ERR' TO W02-DSPL-ERR-IND
//  LITERAL_ERR = 'ERR'
              w02DsplMsgArea.setW02DsplErrInd(CONSTANTS.LITERAL_ERR);
//  PERFORM 11100A-WRITE-TO-SYSM THRU 11100A-EXIT
              writeToSysm();/*11100A-WRITE-TO-SYSM SECTION*/
              if (this.isProgramEnded()) {
                  return ;
              }
//  SET M51U-ILLOGICAL-COND TO TRUE
              dfhcommarea.getLinkAreaM51u().getM51uFlags().setM51uIllogicalCondTrue(); 
              
//  PERFORM 8000-DUMP-ABEND THRU 8000-EXIT
              dumpAbend();/*8000-DUMP-ABEND SECTION*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
      
      }
      /**
      * addCenturyToDates 
      *   This method is derived from 
  *   COBOL Paragraph - 2021-ADD-CENTURY-TO-DATES COBOL Cyclomatic complexity - 13
      * Input  :  

      * - fesaEffDate                    COBOL Name: FESA-EFF-DATE
      * - planEffYy                      COBOL Name: WS-PLAN-EFF-YY
      * - fesaCanDt                      COBOL Name: FESA-CAN-DT
      * - planCanYy                      COBOL Name: WS-PLAN-CAN-YY
      * - planDosDate                    COBOL Name: WS-PLAN-DOS-DATE
      * - planYy                         COBOL Name: WS-PLAN-YY
      *
      * Output :  

      * - planEffCc                      COBOL Name: WS-PLAN-EFF-CC
      * - planCanCc                      COBOL Name: WS-PLAN-CAN-CC
      * - planCc                         COBOL Name: WS-PLAN-CC
      *
      * @throws CFException
      */
      private void addCenturyToDates() throws Exception {
			// Declare local variables used in the method
			PlanEffDt planEffDt = workFields.getPlanEffDt();
			FesaKey fesaKey = feSpiAltPlanRecord.getFesaKey();
			int planEffYy = 0;
			int planCanYy = 0;
			int planYy = 0;
			PlanCanDt planCanDt = workFields.getPlanCanDt();
			PlanDt planDt = workFields.getPlanDt();
			// End of variable declaration

      
// *81***************************************************************
// *81 2021-Add-century-to-dates                                    *
// *81                                                              *
// *81 business function:                                           *
// *81 adds a century part into the date variables, to take care of *
// *81 y2k problems.                                                *
// *81***************************************************************
// *82***************************************************************
// *82 2021-add-century-to-dates                                    *
// *82                                                              *
// *82 1. to each of the date variables, in the record and in the   *
// *82    storage variables, add the century variable too. this     *
// *82    section takes care of the y2k conversion.                 *
// *82***************************************************************
          planEffYy = planEffDt.getPlanEffYy();
//  EVALUATE TRUE
          if  (	( feSpiAltPlanRecord.getFesaKey().getFesaEffDate() == 999999 )) { 
              // MOVE 99 TO WS-PLAN-EFF-CC
              workFields.getPlanEffDt().setPlanEffCc(99);
  
          }
          else if  (	( feSpiAltPlanRecord.getFesaKey().getFesaEffDate() == 0 )) { 
              // MOVE 00 TO WS-PLAN-EFF-CC
              workFields.getPlanEffDt().setPlanEffCc(0);
  
          }
          else if  (	( planEffYy > 50 )) { 
              // MOVE 19 TO WS-PLAN-EFF-CC
              workFields.getPlanEffDt().setPlanEffCc(19);
  
          }
          else   { 
              // MOVE 20 TO WS-PLAN-EFF-CC
              workFields.getPlanEffDt().setPlanEffCc(20);
  
          }
  
          planCanYy = planCanDt.getPlanCanYy();
//  EVALUATE TRUE
          if  (	( feSpiAltPlanRecord.getFesaCanDt() == 999999 )) { 
              // MOVE 99 TO WS-PLAN-CAN-CC
              workFields.getPlanCanDt().setPlanCanCc(99);
  
          }
          else if  (	( feSpiAltPlanRecord.getFesaCanDt() == 0 )) { 
              // MOVE 00 TO WS-PLAN-CAN-CC
              workFields.getPlanCanDt().setPlanCanCc(0);
  
          }
          else if  (	( planCanYy > 50 )) { 
              // MOVE 19 TO WS-PLAN-CAN-CC
              workFields.getPlanCanDt().setPlanCanCc(19);
  
          }
          else   { 
              // MOVE 20 TO WS-PLAN-CAN-CC
              workFields.getPlanCanDt().setPlanCanCc(20);
  
          }
  
          planYy = planDt.getPlanYy();
//  EVALUATE TRUE
          if  (	( workFields.getPlanDosDate() == 999999 ) ) { 
              // MOVE 99 TO WS-PLAN-CC
              workFields.getPlanDt().setPlanCc(99);
  
          }
          else if  (	( workFields.getPlanDosDate() == 0 ) ) { 
              // MOVE 00 TO WS-PLAN-CC
              workFields.getPlanDt().setPlanCc(0);
  
          }
          else if  (	( planYy > 50 )) { 
              // MOVE 19 TO WS-PLAN-CC
              workFields.getPlanDt().setPlanCc(19);
  
          }
          else   { 
              // MOVE 20 TO WS-PLAN-CC
              workFields.getPlanDt().setPlanCc(20);
  
          }
  
      
      }
      /**
      * readSpiRules 
      *   This method is derived from 
  *   COBOL Paragraph - 2030-READ-SPI-RULES COBOL Cyclomatic complexity - 6
      * Input  :  

      * - fesaSpiNbr01                   COBOL Name: WS-FESA-SPI-NBR
      * - cicsDfhrespCode                COBOL Name: CICS-DFHRESP-CODE
      * - ddSpirules                     COBOL Name: DD-SPIRULES
      * - fesrKey                        COBOL Name: WS-FESR-KEY
      * - w02FnuLineStartbr              COBOL Name: W02-FNU-LINE-STARTBR
      * - endOfSpiRule                   COBOL Name: WS-END-OF-SPI-RULE
      *
      * Output :  

      * - paragraph                      COBOL Name: WS-PARAGRAPH
      * - fesrToPs01                     COBOL Name: FESR-TO-PS
      * - fesrToSvc01                    COBOL Name: FESR-TO-SVC
      * - fesrToCause01                  COBOL Name: FESR-TO-CAUSE
      * - fesrSpiNbr01                   COBOL Name: FESR-SPI-NBR
      * - fesaSpiNbr01                   COBOL Name: WS-FESA-SPI-NBR
      * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
      * - w02FnuFileStbr                 COBOL Name: W02-FNU-FILE-STBR
      * - ddSpirules                     COBOL Name: DD-SPIRULES
      * - fesrSpiNbr                     COBOL Name: WS-FESR-SPI-NBR
      * - fesrToPs                       COBOL Name: WS-FESR-TO-PS
      * - fesrToSvc                      COBOL Name: WS-FESR-TO-SVC
      * - fesrToCause                    COBOL Name: WS-FESR-TO-CAUSE
      * - w02FnuKeyStbr                  COBOL Name: W02-FNU-KEY-STBR
      * - fesrKey                        COBOL Name: WS-FESR-KEY
      * - w02RespCd                      COBOL Name: W02-RESP-CD
      * - cicsDfhrespCode                COBOL Name: CICS-DFHRESP-CODE
      * - w02DsplMsg                     COBOL Name: W02-DSPL-MSG
      * - w02FnuLineStartbr              COBOL Name: W02-FNU-LINE-STARTBR
      * - w02DsplErrInd                  COBOL Name: W02-DSPL-ERR-IND
      * - m51uIllogicalCondSw            COBOL Name: M51U-ILLOGICAL-COND-SW
      * - endOfSpiRule                   COBOL Name: WS-END-OF-SPI-RULE
      *
      * @throws CFException
      */
      private void readSpiRules() throws Exception {
			// Declare local variables used in the method
			FesrKey01 fesrKey01 = feSpiRulesRecord.getFesrKey01();
			// End of variable declaration

      
// *81***************************************************************
// *81 2030-Read-spi-rules                                          *
// *81                                                              *
// *81 business function:                                           *
// *81 here program will start browse of spi rules file and performs*
// *81 read next on spi(special processing information) rules       *
// *81 record and builds a out service line if spi rules are applied*
// *81 to an in-service line.                                       *
// *81***************************************************************
// *82***************************************************************
// *82 2030-read-spi-rules                                          *
// *82                                                              *
// *82 1. fill the parameter keys with low values (initialize keys) *
// *82 2. browse the special processing instructions file. if the   *
// *82    record is not found or the end of file is reached, exit   *
// *82    the section. if any other error occurs, display the error *
// *82    and abort the program.                                    *
// *82 3. read the next record and apply the special processing     *
// *82    instruction rules individually.                           *
// *82***************************************************************

// *---------------------*
          // MOVE '2030' TO WS-PARAGRAPH
          //  LITERAL_2030 = '2030'
          workFields.setParagraph(CONSTANTS.LITERAL_2030);
//  MOVE LOW-VALUES TO FESR-TO-PS FESR-TO-SVC FESR-TO-CAUSE
          fesrKey01.setFesrToPs01(CONSTANTS.LOW_VALUE_1703015893);
          fesrKey01.setFesrToSvc01(CONSTANTS.LOW_VALUE_1703015769);
          fesrKey01.setFesrToCause01(CONSTANTS.LOW_VALUE_1703015924);
  
//  MOVE WS-FESA-SPI-NBR ( WS-SUB ) TO FESR-SPI-NBR
          fesrKey01.setFesrSpiNbr01(workFields.getPlanVarInputLines().getPlanVarRec(work.getSub() - 1).getFesaSpiNbr01());
  
//  MOVE ZEROS TO WS-NBR-MATCHED
          workFields.setNbrMatched( 0);
//  PERFORM 2041-START-BROWSE-SPIRULES THRU 2041-EXIT
          startBrowseSpirules();/*2041-START-BROWSE-SPIRULES*/
          if (this.isProgramEnded()) {
              return ;
          }
//  EVALUATE TRUE
          if  ( work.isCicsNormal()  ) { 
              ;
          }
          else if  (( work.isCicsNotfnd()  ) || ( work.isCicsEndfile()  )) { 
//cobolCode::GO TO 2030-EXIT
return ;
//cobolCodeEnds::GO TO 2030-EXIT
          }
          else   { 
//  MOVE DD-SPIRULES TO W02-FNU-FILE-STBR
              w02FnuLineStartbr.setW02FnuFileStbr(work.getDdSpirules());
//  MOVE FESR-SPI-NBR TO WS-FESR-SPI-NBR
              fesrKey.setFesrSpiNbr(fesrKey01.getFesrSpiNbr01());
  
//  MOVE FESR-TO-PS TO WS-FESR-TO-PS
              fesrKey.setFesrToPs(fesrKey01.getFesrToPs01());
  
//  MOVE FESR-TO-SVC TO WS-FESR-TO-SVC
              fesrKey.setFesrToSvc(fesrKey01.getFesrToSvc01());
  
//  MOVE FESR-TO-CAUSE TO WS-FESR-TO-CAUSE
              fesrKey.setFesrToCause(fesrKey01.getFesrToCause01());
  
              // MOVE WS-FESR-KEY TO W02-FNU-KEY-STBR
              w02FnuLineStartbr.setW02FnuKeyStbr(fesrKey.toCharArray());
//  MOVE CICS-DFHRESP-CODE TO W02-RESP-CD
              w02DsplMsgArea.setW02RespCd( work.getCicsDfhrespCode());
              // MOVE W02-FNU-LINE-STARTBR TO W02-DSPL-MSG
              w02DsplMsgArea.setW02DsplMsg(w02FnuLineStartbr.toCharArray());
//  MOVE 'ERR' TO W02-DSPL-ERR-IND
//  LITERAL_ERR = 'ERR'
              w02DsplMsgArea.setW02DsplErrInd(CONSTANTS.LITERAL_ERR);
//  PERFORM 11100A-WRITE-TO-SYSM THRU 11100A-EXIT
              writeToSysm();/*11100A-WRITE-TO-SYSM SECTION*/
              if (this.isProgramEnded()) {
                  return ;
              }
//  SET M51U-ILLOGICAL-COND TO TRUE
              dfhcommarea.getLinkAreaM51u().getM51uFlags().setM51uIllogicalCondTrue(); 
              
//  PERFORM 8000-DUMP-ABEND THRU 8000-EXIT
              dumpAbend();/*8000-DUMP-ABEND SECTION*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
//  PERFORM 2040-TRANSLATE-SPI-RULE THRU 2040-EXIT UNTIL END-OF-SPI-RULE
          while (!(work.isEndOfSpiRule1()) ) {
             translateSpiRule();/*2040-TRANSLATE-SPI-RULE*/
             if (this.isProgramEnded()) {
                 return ;
             }
          }
//  PERFORM 2043-END-BROWSE-SPIRULES THRU 2043-EXIT
          endBrowseSpirules();/*2043-END-BROWSE-SPIRULES*/
          // MOVE 'N' TO WS-END-OF-SPI-RULE
          //  LITERAL_N = 'N'
          work.setEndOfSpiRule(CONSTANTS.LITERAL_N);
      
      }
      /**
      * translateSpiRule 
      *   This method is derived from 
  *   COBOL Paragraph - 2040-TRANSLATE-SPI-RULE COBOL Cyclomatic complexity - 6
      * Input  :  

      * - cicsDfhrespCode                COBOL Name: CICS-DFHRESP-CODE
      * - ddSpirules                     COBOL Name: DD-SPIRULES
      * - fesrSpiNbr01                   COBOL Name: FESR-SPI-NBR
      * - fesrToPs01                     COBOL Name: FESR-TO-PS
      * - fesrToSvc01                    COBOL Name: FESR-TO-SVC
      * - fesrToCause01                  COBOL Name: FESR-TO-CAUSE
      * - fesrKey                        COBOL Name: WS-FESR-KEY
      * - w02FnuLineRead                 COBOL Name: W02-FNU-LINE-READ
      * - fesaSpiNbr01                   COBOL Name: WS-FESA-SPI-NBR
      * - sub                            COBOL Name: WS-SUB
      *
      * Output :  

      * - paragraph                      COBOL Name: WS-PARAGRAPH
      * - endOfSpiRule                   COBOL Name: WS-END-OF-SPI-RULE
      * - w02DsplErrInd                  COBOL Name: W02-DSPL-ERR-IND
      * - w02FnuFileRd                   COBOL Name: W02-FNU-FILE-RD
      * - ddSpirules                     COBOL Name: DD-SPIRULES
      * - fesrSpiNbr                     COBOL Name: WS-FESR-SPI-NBR
      * - fesrSpiNbr01                   COBOL Name: FESR-SPI-NBR
      * - fesrToPs                       COBOL Name: WS-FESR-TO-PS
      * - fesrToPs01                     COBOL Name: FESR-TO-PS
      * - fesrToSvc                      COBOL Name: WS-FESR-TO-SVC
      * - fesrToSvc01                    COBOL Name: FESR-TO-SVC
      * - fesrToCause                    COBOL Name: WS-FESR-TO-CAUSE
      * - fesrToCause01                  COBOL Name: FESR-TO-CAUSE
      * - w02FnuKeyRd                    COBOL Name: W02-FNU-KEY-RD
      * - fesrKey                        COBOL Name: WS-FESR-KEY
      * - w02RespCd                      COBOL Name: W02-RESP-CD
      * - cicsDfhrespCode                COBOL Name: CICS-DFHRESP-CODE
      * - w02DsplMsg                     COBOL Name: W02-DSPL-MSG
      * - w02FnuLineRead                 COBOL Name: W02-FNU-LINE-READ
      * - m51uIllogicalCondSw            COBOL Name: M51U-ILLOGICAL-COND-SW
      *
      * @throws CFException
      */
      private void translateSpiRule() throws Exception {
			// Declare local variables used in the method
			FesrKey01 fesrKey01 = feSpiRulesRecord.getFesrKey01();
			PlanVarInputLines planVarInputLines = workFields.getPlanVarInputLines();
			int fesrSpiNbr01 = 0;
			// End of variable declaration

      
// *81***************************************************************
// *81 2040-Translate-spi-rule                                      *
// *81                                                              *
// *81 business function:                                           *
// *81 reads next rules record and if special processing instruction*
// *81 number equal to the corresponding valus in the  plan table   *
// *81 then it applies the rules. rules are applied by matching     *
// *81 place of service,service, provider type, cause codes and icd9*
// *81 codes.                                                       *
// *81***************************************************************
// *82***************************************************************
// *82 2040-translate-spi-rule                                      *
// *82                                                              *
// *82 1. reads the next record from the rules file.                *
// *82 2. if the end of the file is reached or the record is not    *
// *82    found,set a switch to indicate the same and exit  section.*
// *82 3. if the spi (special processing instructions) number in the*
// *82    record does not match with the ones in the storage        *
// *82    variables, exit the section.                              *
// *82 4. search for a match on place of service, service codes,    *
// *82    provider types, cause codes and icd9 codes.               *
// *82***************************************************************

// *------------------------*
          // MOVE '2040' TO WS-PARAGRAPH
          //  LITERAL_2040 = '2040'
          workFields.setParagraph(CONSTANTS.LITERAL_2040);
//  PERFORM 2042-READ-NEXT-SPIRULES THRU 2042-EXIT
          readNextSpirules();/*2042-READ-NEXT-SPIRULES*/
          if (this.isProgramEnded()) {
              return ;
          }
//  EVALUATE TRUE
          if  ( work.isCicsNormal()  ) { 
              ;
          }
          else if  ( work.isCicsEndfile()  ) { 
              // MOVE 'Y' TO WS-END-OF-SPI-RULE
              //  LITERAL_Y = 'Y'
              work.setEndOfSpiRule(CONSTANTS.LITERAL_Y);
//cobolCode::GO TO 2040-EXIT
return ;
//cobolCodeEnds::GO TO 2040-EXIT
          }
          else if  ( work.isCicsNotfnd()  ) { 
              // MOVE 'Y' TO WS-END-OF-SPI-RULE
              //  LITERAL_Y = 'Y'
              work.setEndOfSpiRule(CONSTANTS.LITERAL_Y);
//cobolCode::GO TO 2040-EXIT
return ;
//cobolCodeEnds::GO TO 2040-EXIT
          }
          else   { 
//  MOVE 'ERR' TO W02-DSPL-ERR-IND
//  LITERAL_ERR = 'ERR'
              w02DsplMsgArea.setW02DsplErrInd(CONSTANTS.LITERAL_ERR);
//  MOVE DD-SPIRULES TO W02-FNU-FILE-RD
              w02FnuLineRead.setW02FnuFileRd(work.getDdSpirules());
//  MOVE FESR-SPI-NBR TO WS-FESR-SPI-NBR
              fesrKey.setFesrSpiNbr(fesrKey01.getFesrSpiNbr01());
  
//  MOVE FESR-TO-PS TO WS-FESR-TO-PS
              fesrKey.setFesrToPs(fesrKey01.getFesrToPs01());
  
//  MOVE FESR-TO-SVC TO WS-FESR-TO-SVC
              fesrKey.setFesrToSvc(fesrKey01.getFesrToSvc01());
  
//  MOVE FESR-TO-CAUSE TO WS-FESR-TO-CAUSE
              fesrKey.setFesrToCause(fesrKey01.getFesrToCause01());
  
              // MOVE WS-FESR-KEY TO W02-FNU-KEY-RD
              w02FnuLineRead.setW02FnuKeyRd(fesrKey.toCharArray());
//  MOVE CICS-DFHRESP-CODE TO W02-RESP-CD
              w02DsplMsgArea.setW02RespCd( work.getCicsDfhrespCode());
              // MOVE W02-FNU-LINE-READ TO W02-DSPL-MSG
              w02DsplMsgArea.setW02DsplMsg(w02FnuLineRead.toCharArray());
//  PERFORM 11100A-WRITE-TO-SYSM THRU 11100A-EXIT
              writeToSysm();/*11100A-WRITE-TO-SYSM SECTION*/
              if (this.isProgramEnded()) {
                  return ;
              }
//  SET M51U-ILLOGICAL-COND TO TRUE
              dfhcommarea.getLinkAreaM51u().getM51uFlags().setM51uIllogicalCondTrue(); 
              
//  PERFORM 8000-DUMP-ABEND THRU 8000-EXIT
              dumpAbend();/*8000-DUMP-ABEND SECTION*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }

// ***         Go to 2040-exit
//  IF FESR-SPI-NBR NOT = WS-FESA-SPI-NBR ( WS-SUB )
          if (	( fesrKey01.getFesrSpiNbr01() != planVarInputLines.getPlanVarRec(work.getSub() - 1).getFesaSpiNbr01() )) { 
              // MOVE 'Y' TO WS-END-OF-SPI-RULE
              //  LITERAL_Y = 'Y'
              work.setEndOfSpiRule(CONSTANTS.LITERAL_Y);
//cobolCode::GO TO 2040-EXIT
return ;
//cobolCodeEnds::GO TO 2040-EXIT
          }
  
//  PERFORM 2100-SPI-RULES-PROCESS THRU 2100-EXIT
          spiRulesProcess();/*2100-SPI-RULES-PROCESS*/
          ;
      
      }
      /**
      * startBrowseSpirules 
      *   This method is derived from 
  *   COBOL Paragraph - 2041-START-BROWSE-SPIRULES COBOL Cyclomatic complexity - 1
      * Input  :  

      * - eibresp                        COBOL Name: EIBRESP
      * - eibrcode                       COBOL Name: EIBRCODE
      *
      * Output :  

      * - cicsDfhrespCode                COBOL Name: CICS-DFHRESP-CODE
      * - eibresp                        COBOL Name: EIBRESP
      * - cetEibrcd                      COBOL Name: CET-EIBRCD
      * - eibrcode                       COBOL Name: EIBRCODE
      *
      * @throws CFException
      */
      private void startBrowseSpirules() throws Exception {

// *EXEC CICS STARTBR 
// *  FILE(DD-SPIRULES) 
// *  RIDFLD(FESR-KEY) 
// *  KEYLENGTH (LENGTH OF FESR-KEY) 
// *  RESP(CICS-DFHRESP-CODE) 
// *END-EXEC. 
//  STARTBR FILE(DD-SPIRULES) RIDFLD(FESR-KEY) KEYLENGTH (FUNCTION~LENGTH~FESR-KEY) RESP(CICS-DFHRESP-CODE)
          // STARTBR FILE(DD-SPIRULES) RIDFLD(FESR-KEY) KEYLENGTH (FUNCTION~LENGTH~FESR-KEY) RESP(CICS-DFHRESP-CODE)
          // start Browsing a file
          TransactionManager.startBrowsing(getCICSSession(), work.getDdSpirules(),feSpiRulesRecord.getFesrKey01().toCharArray(),"".toCharArray()/*reqId*/,"".toCharArray()/*sysId*/,FesrKey01.getFesrKey01FieldLength(),false/*debkey*/,false/*debrec*/,false/*rba*/,false/*rrn*/,false/*xrba*/,false/*gteq*/,false/*equal*/,false/*generic*/,new KeyInfo(0, 13, 0, false));
//  MOVE EIBRESP TO CICS-DFHRESP-CODE
          work.setCicsDfhrespCode(cicsSession.getEibresp());
//  MOVE EIBRCODE TO CET-EIBRCD
          cetCicsErrorTableGroup.getCetCicsErrorTable().setCetEibrcd(cicsSession.getEibrcode());
      
      }
      /**
      * readNextSpirules 
      *   This method is derived from 
  *   COBOL Paragraph - 2042-READ-NEXT-SPIRULES COBOL Cyclomatic complexity - 1
      * Input  :  

      * - eibresp                        COBOL Name: EIBRESP
      * - eibrcode                       COBOL Name: EIBRCODE
      *
      * Output :  

      * - cicsDfhrespCode                COBOL Name: CICS-DFHRESP-CODE
      * - eibresp                        COBOL Name: EIBRESP
      * - cetEibrcd                      COBOL Name: CET-EIBRCD
      * - eibrcode                       COBOL Name: EIBRCODE
      *
      * @throws CFException
      */
      private void readNextSpirules() throws Exception {

// *EXEC CICS READNEXT 
// *  FILE      (DD-SPIRULES) 
// *  INTO      (FE-SPI-RULES-RECORD) 
// *  RIDFLD    (FESR-KEY) 
// *  KEYLENGTH (LENGTH OF FESR-KEY) 
// *  LENGTH    (LENGTH OF FE-SPI-RULES-RECORD) 
// *  RESP      (CICS-DFHRESP-CODE) 
// *END-EXEC. 
//  READNEXT FILE (DD-SPIRULES) INTO (FE-SPI-RULES-RECORD) RIDFLD (FESR-KEY) KEYLENGTH (FUNCTION~LENGTH~FESR-KEY) LENGTH (FUNCTION~LENGTH~FE-SPI-RULES-RECORD) RESP (CICS-DFHRESP-CODE)
          // READNEXT FILE (DD-SPIRULES) INTO (FE-SPI-RULES-RECORD) RIDFLD (FESR-KEY) KEYLENGTH (FUNCTION~LENGTH~FESR-KEY) LENGTH (FUNCTION~LENGTH~FE-SPI-RULES-RECORD) RESP (CICS-DFHRESP-CODE)
          // read the next record from a file
          feSpiRulesRecord.setString(TransactionManager.readNextRecord(getCICSSession(), work.getDdSpirules(),feSpiRulesRecord.getFesrKey01().toCharArray(),"".toCharArray()/*Token*/,"".toCharArray()/*SysId*/,FesrKey01.getFesrKey01FieldLength(),FeSpiRulesRecord.getFeSpiRulesRecordFieldLength(),"".toCharArray()/*ReqId*/,false/*rba*/,false/*rrn*/,false/*xrba*/,false/*nosuspend*/,false/*uncommitted*/,false/*consistent*/,false/*repeatable*/,false/*update*/).toCharArray());
//  MOVE EIBRESP TO CICS-DFHRESP-CODE
          work.setCicsDfhrespCode(cicsSession.getEibresp());
//  MOVE EIBRCODE TO CET-EIBRCD
          cetCicsErrorTableGroup.getCetCicsErrorTable().setCetEibrcd(cicsSession.getEibrcode());
      
      }
      /**
      * endBrowseSpirules 
      *   This method is derived from 
  *   COBOL Paragraph - 2043-END-BROWSE-SPIRULES COBOL Cyclomatic complexity - 1
      * Input  :  

      * - eibresp                        COBOL Name: EIBRESP
      *
      * Output :  

      * - cicsDfhrespCode                COBOL Name: CICS-DFHRESP-CODE
      * - eibresp                        COBOL Name: EIBRESP
      *
      * @throws CFException
      */
      private void endBrowseSpirules() throws Exception {
//  ENDBR FILE (DD-SPIRULES) RESP (CICS-DFHRESP-CODE)
          // ENDBR FILE (DD-SPIRULES) RESP (CICS-DFHRESP-CODE)
          // end browsing the file
          TransactionManager.endBrowsing(getCICSSession(), work.getDdSpirules(),"".toCharArray()/*sysId*/,"".toCharArray()/*reqId*/);
//  MOVE EIBRESP TO CICS-DFHRESP-CODE
          work.setCicsDfhrespCode(cicsSession.getEibresp());
      
      }
      /**
      * spiRulesProcess 
      *   This method is derived from 
  *   COBOL Paragraph - 2100-SPI-RULES-PROCESS COBOL Cyclomatic complexity - 35
      * Input  :  

      * - fesrFromPs                     COBOL Name: FESR-FROM-PS
      * - psSub                          COBOL Name: PS-SUB
      * - fesrFromFrSvc                  COBOL Name: FESR-FROM-FR-SVC
      * - svcSub                         COBOL Name: SVC-SUB
      * - fesrFromPrvTyp                 COBOL Name: FESR-FROM-PRV-TYP
      * - pvSub                          COBOL Name: PV-SUB
      * - fesrFromFrIcd9                 COBOL Name: FESR-FROM-FR-ICD9
      * - icd9Sub                        COBOL Name: ICD9-SUB
      * - fesrFromCauseCd                COBOL Name: FESR-FROM-CAUSE-CD
      * - causeSub                       COBOL Name: CAUSE-SUB
      * - fesrIpaCd                      COBOL Name: FESR-IPA-CD
      * - fesrToPs01                     COBOL Name: FESR-TO-PS
      * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
      * - nbrMatchedPrev                 COBOL Name: WS-NBR-MATCHED-PREV
      * - fesrToSvc01                    COBOL Name: FESR-TO-SVC
      * - fesrToCause01                  COBOL Name: FESR-TO-CAUSE
      *
      * Output :  

      * - paragraph                      COBOL Name: WS-PARAGRAPH
      * - fromPsFound                    COBOL Name: WS-FROM-PS-FOUND
      * - fromSvcFound                   COBOL Name: WS-FROM-SVC-FOUND
      * - fromPrvFound                   COBOL Name: WS-FROM-PRV-FOUND
      * - fromIcd9Found                  COBOL Name: WS-FROM-ICD9-FOUND
      * - fromCauseFound                 COBOL Name: WS-FROM-CAUSE-FOUND
      * - ipaCodeFound                   COBOL Name: WS-IPA-CODE-FOUND
      * - searchComplete                 COBOL Name: WS-SEARCH-COMPLETE
      * - psSub                          COBOL Name: PS-SUB
      * - svcSub                         COBOL Name: SVC-SUB
      * - pvSub                          COBOL Name: PV-SUB
      * - icd9Sub                        COBOL Name: ICD9-SUB
      * - causeSub                       COBOL Name: CAUSE-SUB
      * - holdPs                         COBOL Name: WS-HOLD-PS
      * - fesrToPs01                     COBOL Name: FESR-TO-PS
      * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
      * - nbrMatchedPrev                 COBOL Name: WS-NBR-MATCHED-PREV
      * - nbrEqual                       COBOL Name: WS-NBR-EQUAL
      * - holdSvc                        COBOL Name: WS-HOLD-SVC
      * - fesrToSvc01                    COBOL Name: FESR-TO-SVC
      * - holdCauseCd                    COBOL Name: WS-HOLD-CAUSE-CD
      * - fesrToCause01                  COBOL Name: FESR-TO-CAUSE
      *
      * @throws CFException
      */
      private void spiRulesProcess() throws Exception {
			// Declare local variables used in the method
			FesrKey01 fesrKey01 = feSpiRulesRecord.getFesrKey01();
			HoldTransData holdTransData = workFields.getHoldTransData();
			short nbrMatched = 0;
			short nbrMatchedPrev = 0;
			// End of variable declaration

      
// *81***************************************************************
// *81 2100-Spi-rules-process                                       *
// *81                                                              *
// *81 business function:                                           *
// *81 searches for a match on each of the parameters individually. *
// *81 all from conditions which exist must match to the claim. as  *
// *81 soon as one does not match, the spi(special processing       *
// *81 instructions) does not apply.                                *
// *81***************************************************************
// *82***************************************************************
// *82 2100-spi-rules-process                                       *
// *82                                                              *
// *82 1. initialize the found switches.                            *
// *82 2. perform a search for the place of service, if the place of*
// *82    service is not found, exit the section.                   *
// *82 3. perform a search for the service code. if the service code*
// *82    is not found, exit the section.                           *
// *82 4. perform a search for the provider code. if the provider   *
// *82    code is not found, exit the section.                      *
// *82 5. perform a search for the fr-icd9. if the fr-icd9          *
// *82    is not found, exit the section.                           *
// *82 6. perform a search for the cause code. if the cause code    *
// *82    is not found, exit the section.                           *
// *82 7. perform a search for the prefered provider organization.  *
// *82    if the code is not found, exit the section.               *
// *82 8. if more than one spi matches, apply the spi which matched *
// *82    to the most "from fields".  if the number is equal, then  *
// *82    non-select the claim with '48' - mult spi matches.        *
// *82***************************************************************

// *------------------------*
          // MOVE '2100' TO WS-PARAGRAPH
          //  LITERAL_2100 = '2100'
          workFields.setParagraph(CONSTANTS.LITERAL_2100);
          // MOVE 'N' TO WS-FROM-PS-FOUND
          //  LITERAL_N = 'N'
          work.setFromPsFound(CONSTANTS.LITERAL_N);
          // MOVE 'N' TO WS-FROM-SVC-FOUND
          //  LITERAL_N = 'N'
          work.setFromSvcFound(CONSTANTS.LITERAL_N);
          // MOVE 'N' TO WS-FROM-PRV-FOUND
          //  LITERAL_N = 'N'
          work.setFromPrvFound(CONSTANTS.LITERAL_N);
          // MOVE 'N' TO WS-FROM-ICD9-FOUND
          //  LITERAL_N = 'N'
          work.setFromIcd9Found(CONSTANTS.LITERAL_N);
          // MOVE 'N' TO WS-FROM-CAUSE-FOUND
          //  LITERAL_N = 'N'
          work.setFromCauseFound(CONSTANTS.LITERAL_N);
          // MOVE 'N' TO WS-IPA-CODE-FOUND
          //  LITERAL_N = 'N'
          work.setIpaCodeFound(CONSTANTS.LITERAL_N);
          // MOVE 'N' TO WS-SEARCH-COMPLETE
          //  LITERAL_N = 'N'
          work.setSearchComplete(CONSTANTS.LITERAL_N);
//  IF FESR-FROM-PS (1) NOT = SPACES
          if (        ( !allSpaces(feSpiRulesRecord.getFesrFromCondPs(0).getFesrFromPs())  )) { 
//  PERFORM 2110-SEARCH-PS THRU 2110-EXIT VARYING PS-SUB FROM 1 BY 1 UNTIL PS-SUB > 30 OR SEARCH-COMPLETE OR FROM-PS-FOUND
              for (work.setPsSub(1); 	( work.getPsSub() <= 30 ) && !(work.isSearchComplete1())  && !(work.isFromPsFound1())  ; work.setPsSub(work.getPsSub() + 1) ) {
              	searchPs();/*2110-SEARCH-PS*/
              }
//  IF NOT FROM-PS-FOUND
              if (!(work.isFromPsFound1()) ) { 
//cobolCode::GO TO 2100-EXIT
return ;
//cobolCodeEnds::GO TO 2100-EXIT
              }
          }
          // MOVE 'N' TO WS-SEARCH-COMPLETE
          //  LITERAL_N = 'N'
          work.setSearchComplete(CONSTANTS.LITERAL_N);
//  IF FESR-FROM-FR-SVC (1) NOT = SPACES
          if (        ( !allSpaces(feSpiRulesRecord.getFesrFromCondFrToSvc(0).getFesrFromFrSvc())  )) { 
//  PERFORM 2120-SEARCH-SVC THRU 2120-EXIT VARYING SVC-SUB FROM 1 BY 1 UNTIL SVC-SUB > 198 OR SEARCH-COMPLETE OR FROM-SVC-FOUND
              for (work.setSvcSub(1); 	( work.getSvcSub() <= 198 ) && !(work.isSearchComplete1())  && !(work.isFromSvcFound1())  ; work.setSvcSub(work.getSvcSub() + 1) ) {
              	searchSvc();/*2120-SEARCH-SVC*/
              }
//  IF NOT FROM-SVC-FOUND
              if (!(work.isFromSvcFound1()) ) { 
//cobolCode::GO TO 2100-EXIT
return ;
//cobolCodeEnds::GO TO 2100-EXIT
              }
          }
          // MOVE 'N' TO WS-SEARCH-COMPLETE
          //  LITERAL_N = 'N'
          work.setSearchComplete(CONSTANTS.LITERAL_N);
//  IF FESR-FROM-PRV-TYP (1) NOT = SPACES
          if (        ( !allSpaces(feSpiRulesRecord.getFesrFromCondPrvTyp(0).getFesrFromPrvTyp())  )) { 
//  PERFORM 2130-SEARCH-PRV THRU 2130-EXIT VARYING PV-SUB FROM 1 BY 1 UNTIL PV-SUB > 80 OR SEARCH-COMPLETE
              for (work.setPvSub(1); 	( work.getPvSub() <= 80 ) && !(work.isSearchComplete1())  ; work.setPvSub(work.getPvSub() + 1) ) {
              	searchPrv();/*2130-SEARCH-PRV*/
              }
//  IF NOT FROM-PRV-FOUND
              if (!(work.isFromPrvFound1()) ) { 
//cobolCode::GO TO 2100-EXIT
return ;
//cobolCodeEnds::GO TO 2100-EXIT
              }
          }
          // MOVE 'N' TO WS-SEARCH-COMPLETE
          //  LITERAL_N = 'N'
          work.setSearchComplete(CONSTANTS.LITERAL_N);
//  IF FESR-FROM-FR-ICD9 (1) NOT = SPACES
          if (        ( !allSpaces(feSpiRulesRecord.getFesrFromCondFrToIcd9(0).getFesrFromFrIcd9())  )) { 
//  PERFORM 2140-SEARCH-ICD9 THRU 2140-EXIT VARYING ICD9-SUB FROM 1 BY 1 UNTIL ICD9-SUB > 100 OR SEARCH-COMPLETE OR FROM-ICD9-FOUND
              for (work.setIcd9Sub(1); 	( work.getIcd9Sub() <= 100 ) && !(work.isSearchComplete1())  && !(work.isFromIcd9Found1())  ; work.setIcd9Sub(work.getIcd9Sub() + 1) ) {
              	searchIcd9();/*2140-SEARCH-ICD9*/
              }
//  IF NOT FROM-ICD9-FOUND
              if (!(work.isFromIcd9Found1()) ) { 
//cobolCode::GO TO 2100-EXIT
return ;
//cobolCodeEnds::GO TO 2100-EXIT
              }
          }
          // MOVE 'N' TO WS-SEARCH-COMPLETE
          //  LITERAL_N = 'N'
          work.setSearchComplete(CONSTANTS.LITERAL_N);
//  IF FESR-FROM-CAUSE-CD (1) NOT = SPACES
          if (        ( !allSpaces(feSpiRulesRecord.getFesrFromCondCause(0).getFesrFromCauseCd())  )) { 
//  PERFORM 2150-SEARCH-CAUSE THRU 2150-EXIT VARYING CAUSE-SUB FROM 1 BY 1 UNTIL CAUSE-SUB > 7 OR SEARCH-COMPLETE OR FROM-CAUSE-FOUND
              for (work.setCauseSub(1); 	( work.getCauseSub() <= 7 ) && !(work.isSearchComplete1())  && !(work.isFromCauseFound1())  ; work.setCauseSub(work.getCauseSub() + 1) ) {
              	searchCause();/*2150-SEARCH-CAUSE*/
              }
//  IF NOT FROM-CAUSE-FOUND
              if (!(work.isFromCauseFound1()) ) { 
//cobolCode::GO TO 2100-EXIT
return ;
//cobolCodeEnds::GO TO 2100-EXIT
              }
          }
          // MOVE 'N' TO WS-SEARCH-COMPLETE
          //  LITERAL_N = 'N'
          work.setSearchComplete(CONSTANTS.LITERAL_N);
//  IF FESR-IPA-CD (1) = ZEROES
//  ELSE
          if (	( feSpiRulesRecord.getFesrIpaCode(0).getFesrIpaCd() != 0 )) { 
//  PERFORM 2160-MATCH-IPA-TO-PPOALT THRU 2160-EXIT
              matchIpaToPpoalt();/*2160-MATCH-IPA-TO-PPOALT*/
//  IF NOT IPA-CODE-FOUND
              if (!(work.isIpaCodeFound1()) ) { 
//cobolCode::GO TO 2100-EXIT
return ;
//cobolCodeEnds::GO TO 2100-EXIT
              }
//  ELSE
              else { 
//  MOVE FESR-TO-PS TO WS-HOLD-PS
                  holdTransData.setHoldPs(fesrKey01.getFesrToPs01());
  
//  ADD 1 TO WS-NBR-MATCHED
                  workFields.setNbrMatched( (short) (workFields.getNbrMatched()+(short)1));
              }
          }

// *** If more than one spi matches, apply the spi which matched
// *** to the most "from fields".  if the number is equal, then
// *** non-select the claim with '48' - mult spi matches.
          // MOVE 'N' TO WS-SEARCH-COMPLETE
          //  LITERAL_N = 'N'
          work.setSearchComplete(CONSTANTS.LITERAL_N);
          nbrMatchedPrev = workFields.getNbrMatchedPrev();
          nbrMatched = workFields.getNbrMatched();
//  IF WS-NBR-MATCHED > WS-NBR-MATCHED-PREV
          if (	( nbrMatched > nbrMatchedPrev )) { 
//  MOVE WS-NBR-MATCHED TO WS-NBR-MATCHED-PREV
              workFields.setNbrMatchedPrev(workFields.getNbrMatched());
              // MOVE 'N' TO WS-NBR-EQUAL
              //  LITERAL_N = 'N'
              work.setNbrEqual(CONSTANTS.LITERAL_N);
//  MOVE FESR-TO-PS TO WS-HOLD-PS
              holdTransData.setHoldPs(fesrKey01.getFesrToPs01());
  
//  MOVE FESR-TO-SVC TO WS-HOLD-SVC
              holdTransData.setHoldSvc(fesrKey01.getFesrToSvc01());
  
//  MOVE FESR-TO-CAUSE TO WS-HOLD-CAUSE-CD
              holdTransData.setHoldCauseCd(fesrKey01.getFesrToCause01());
  
//  MOVE ZEROS TO WS-NBR-MATCHED
              workFields.setNbrMatched( 0);
          }
  
//  ELSE
          else { 
              nbrMatchedPrev = workFields.getNbrMatchedPrev();
              nbrMatched = workFields.getNbrMatched();
//  IF WS-NBR-MATCHED = WS-NBR-MATCHED-PREV AND WS-NBR-MATCHED NOT = ZEROS
              if (	( nbrMatched == nbrMatchedPrev ) && 	( nbrMatched != 0 ) ) { 
                  // MOVE 'Y' TO WS-NBR-EQUAL
                  //  LITERAL_Y = 'Y'
                  work.setNbrEqual(CONSTANTS.LITERAL_Y);
//  MOVE SPACES TO WS-HOLD-PS
                  holdTransData.setHoldPs(CONSTANTS.SPACE_2);
  
//  MOVE SPACES TO WS-HOLD-SVC
                  holdTransData.setHoldSvc(CONSTANTS.SPACE_6);
  
//  MOVE SPACES TO WS-HOLD-CAUSE-CD
                  holdTransData.setHoldCauseCd(CONSTANTS.SPACE);
  
//  MOVE ZEROS TO WS-NBR-MATCHED
                  workFields.setNbrMatched( 0);
              }
  
          }
      
      }
      /**
      * searchPs 
      *   This method is derived from 
  *   COBOL Paragraph - 2110-SEARCH-PS COBOL Cyclomatic complexity - 3
      * Input  :  

      * - fesrFromPs                     COBOL Name: FESR-FROM-PS
      * - psSub                          COBOL Name: PS-SUB
      * - uLinePos51                     COBOL Name: LK-51U-LINE-POS
      * - sub01                          COBOL Name: LK-SUB
      * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
      *
      * Output :  

      * - paragraph                      COBOL Name: WS-PARAGRAPH
      * - searchComplete                 COBOL Name: WS-SEARCH-COMPLETE
      * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
      * - fromPsFound                    COBOL Name: WS-FROM-PS-FOUND
      *
      * @throws CFException
      */
      private void searchPs() throws Exception {
			// Declare local variables used in the method
			M51uLinkage m51uLinkage = dfhcommarea.getLinkAreaM51u().getM51uLinkage();
			// End of variable declaration

      
// *81***************************************************************
// *81 2110-Search-ps                                               *
// *81                                                              *
// *81 business function:                                           *
// *81 checks for a match on the place of service                   *
// *81***************************************************************
// *82***************************************************************
// *82 2110-search-ps                                               *
// *82                                                              *
// *82 1. if the place of service is empty, then set a switch to    *
// *82    indicate that the search is complete.                     *
// *82 2. if there is a match in the place of service between the   *
// *82    value in the record and the linkage section,then increment*
// *82    the counter and set a switch to indicate that a match is  *
// *82    found.                                                    *
// *82***************************************************************

// *-------------------*
          // MOVE '2110' TO WS-PARAGRAPH
          //  LITERAL_2110 = '2110'
          workFields.setParagraph(CONSTANTS.LITERAL_2110);
//  IF FESR-FROM-PS ( PS-SUB ) EQUAL SPACES
          if (        ( allSpaces(feSpiRulesRecord.getFesrFromCondPs(work.getPsSub() - 1).getFesrFromPs())   )) { 
              // MOVE 'Y' TO WS-SEARCH-COMPLETE
              //  LITERAL_Y = 'Y'
              work.setSearchComplete(CONSTANTS.LITERAL_Y);
          }
//  ELSE
          else { 
//  IF LK-51U-LINE-POS ( LK-SUB ) = FESR-FROM-PS ( PS-SUB )
              if (		compareChars(m51uLinkage.getULineData51(work.getSub01() - 1).getULinePos51(),feSpiRulesRecord.getFesrFromCondPs(work.getPsSub() - 1).getFesrFromPs()) == 0 ) { 
//  ADD 1 TO WS-NBR-MATCHED
                  workFields.setNbrMatched( (short) (workFields.getNbrMatched()+(short)1));
                  // MOVE 'Y' TO WS-FROM-PS-FOUND
                  //  LITERAL_Y = 'Y'
                  work.setFromPsFound(CONSTANTS.LITERAL_Y);
              }
  
          }
      
      }
      /**
      * searchSvc 
      *   This method is derived from 
  *   COBOL Paragraph - 2120-SEARCH-SVC COBOL Cyclomatic complexity - 3
      * Input  :  

      * - fesrFromFrSvc                  COBOL Name: FESR-FROM-FR-SVC
      * - svcSub                         COBOL Name: SVC-SUB
      * - fesrFromToSvc                  COBOL Name: FESR-FROM-TO-SVC
      *
      * Output :  

      * - paragraph                      COBOL Name: WS-PARAGRAPH
      * - searchComplete                 COBOL Name: WS-SEARCH-COMPLETE
      * - fesrFromToSvc                  COBOL Name: FESR-FROM-TO-SVC
      * - fesrFromFrSvc                  COBOL Name: FESR-FROM-FR-SVC
      *
      * @throws CFException
      */
      private void searchSvc() throws Exception {
      
// *81***************************************************************
// *81 2120-Search-svc                                              *
// *81                                                              *
// *81 business function:                                           *
// *81 this section checks for a match on the service codes         *
// *81***************************************************************
// *82***************************************************************
// *82 2120-search-svc                                              *
// *82                                                              *
// *82 1. if the service variable in the record is empty, then set  *
// *82    a switch to indicate that the search is complete.         *
// *82 2. perform a check on the service code matches.              *
// *82 3. when service codes match is found, a flag is set and a    *
// *82    counter is accumulated to indicate number of matches.     *
// *82    match should be within to and from spi svc, if both are   *
// *82    present                                                   *
// *82***************************************************************

// *-------------------*
          // MOVE '2120' TO WS-PARAGRAPH
          //  LITERAL_2120 = '2120'
          workFields.setParagraph(CONSTANTS.LITERAL_2120);
//  IF FESR-FROM-FR-SVC ( SVC-SUB ) EQUAL SPACES
          if (        ( allSpaces(feSpiRulesRecord.getFesrFromCondFrToSvc(work.getSvcSub() - 1).getFesrFromFrSvc())   )) { 
              // MOVE 'Y' TO WS-SEARCH-COMPLETE
              //  LITERAL_Y = 'Y'
              work.setSearchComplete(CONSTANTS.LITERAL_Y);
//cobolCode::GO TO 2120-EXIT
return ;
//cobolCodeEnds::GO TO 2120-EXIT
          }
//  ELSE
          else { 
//  IF FESR-FROM-TO-SVC ( SVC-SUB ) EQUAL SPACES
              if (        ( allSpaces(feSpiRulesRecord.getFesrFromCondFrToSvc(work.getSvcSub() - 1).getFesrFromToSvc())   )) { 
//  MOVE FESR-FROM-FR-SVC ( SVC-SUB ) TO FESR-FROM-TO-SVC ( SVC-SUB )
                  feSpiRulesRecord.getFesrFromCondFrToSvc(work.getSvcSub() - 1).setFesrFromToSvc(feSpiRulesRecord.getFesrFromCondFrToSvc(work.getSvcSub() - 1).getFesrFromFrSvc());
              }
          }
//  PERFORM 2125-TOPS-CNVSVC-FR-TO THRU 2125-EXIT
          topsCnvsvcFrTo();/*2125-TOPS-CNVSVC-FR-TO*/
          ;
      
      }
      /**
      * topsCnvsvcFrTo 
      *   This method is derived from 
  *   COBOL Paragraph - 2125-TOPS-CNVSVC-FR-TO COBOL Cyclomatic complexity - 18
      * Input  :  

      * - fesrFromToSvc                  COBOL Name: FESR-FROM-TO-SVC
      * - fesrFromFrSvc                  COBOL Name: FESR-FROM-FR-SVC
      * - fesrSvcInd                     COBOL Name: FESR-SVC-IND
      * - svcSub                         COBOL Name: SVC-SUB
      * - medSvc                         COBOL Name: MED-SVC
      * - uLineServiceCode51             COBOL Name: LK-51U-LINE-SERVICE-CODE
      * - uMedicalClaim51                COBOL Name: LK-51U-MEDICAL-CLAIM
      * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
      *
      * Output :  

      * - feServTo                       COBOL Name: FE-SERV-TO
      * - fesrFromToSvc                  COBOL Name: FESR-FROM-TO-SVC
      * - feServFr                       COBOL Name: FE-SERV-FR
      * - fesrFromFrSvc                  COBOL Name: FESR-FROM-FR-SVC
      * - servTop                        COBOL Name: WS-SERV-TOP
      * - medSvc                         COBOL Name: MED-SVC
      * - uLineServiceCode51             COBOL Name: LK-51U-LINE-SERVICE-CODE
      * - svc15                          COBOL Name: SVC-1-5
      * - svc6                           COBOL Name: SVC-6
      * - feSvc15Fr                      COBOL Name: FE-SVC-1-5-FR
      * - fromSvcFound                   COBOL Name: WS-FROM-SVC-FOUND
      * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
      * - feSvc15To                      COBOL Name: FE-SVC-1-5-TO
      * - feSvc6Fr                       COBOL Name: FE-SVC-6-FR
      *
      * @throws CFException
      */
      private void topsCnvsvcFrTo() throws Exception {
			// Declare local variables used in the method
			ServTop servTop = workFields.getServTop();
			FeServFr feServFr = workFields.getFeServFr();
			char[] svc15 = null;
			char[] feSvc15Fr = null;
			char[] svc6 = null;
			char[] uMedicalClaim51 = null;
			char[] feSvc6Fr = null;
			char[] feSvc15To = null;
			M51uLinkage m51uLinkage = dfhcommarea.getLinkAreaM51u().getM51uLinkage();
			FeServTo feServTo = workFields.getFeServTo();
			// End of variable declaration

      
// *81***************************************************************
// *81 2125-Tops-cnvsvc-fr-to                                       *
// *81                                                              *
// *81 business function:                                           *
// *81 checks for matches on tops service codes.                    *
// *81***************************************************************
// *82***************************************************************
// *82 2125-tops-cnvsvc-fr-to                                       *
// *82                                                              *
// *82 1. populate the tops service codes with the appropriate value*
// *82 2. perform a check on the service codes.                     *
// *82            1. check for a match on the first five digits.    *
// *82            2. check for a match on the first six digits.     *
// *82            3. check for a match on the first three digits.   *
// *82 3. for every match, increment the match counter.             *
// *82***************************************************************

// *-----------------------*
//  MOVE FESR-FROM-TO-SVC ( SVC-SUB ) TO FE-SERV-TO
          workFields.setFeServTo(feSpiRulesRecord.getFesrFromCondFrToSvc(work.getSvcSub() - 1).getFesrFromToSvc());
//  MOVE FESR-FROM-FR-SVC ( SVC-SUB ) TO FE-SERV-FR
          workFields.setFeServFr(feSpiRulesRecord.getFesrFromCondFrToSvc(work.getSvcSub() - 1).getFesrFromFrSvc());
//  IF FESR-SVC-IND ( SVC-SUB ) = 'T'
          if (feSpiRulesRecord.getFesrFromCondFrToSvc(work.getSvcSub() - 1).getFesrSvcInd()[0] == 'T') { 
//  MOVE MED-SVC TO WS-SERV-TOP
              workFields.setServTop(work.getMedSvc());
          }
//  ELSE
          else { 
//  MOVE LK-51U-LINE-SERVICE-CODE ( LK-SUB ) TO WS-SERV-TOP
              workFields.setServTop(dfhcommarea.getLinkAreaM51u().getM51uLinkage().getULineData51(work.getSub01() - 1).getULineServiceCode51());
          }
          uMedicalClaim51 = m51uLinkage.getUMedicalClaim51();
          svc15 = servTop.getSvc15();
//  IF ( SVC-1-5 (1 : 1) = 'C' ) AND LK-51U-MEDICAL-CLAIM NOT = 'Y'
//  LITERAL_Y = 'Y'
          if (( svc15[0] == 'C') && uMedicalClaim51[0] != 'Y') { 
              svc6 = servTop.getSvc6();
//  IF FESR-SVC-IND ( SVC-SUB ) = 'S' AND SVC-6 NOT = SPACES
              if (feSpiRulesRecord.getFesrFromCondFrToSvc(work.getSvcSub() - 1).getFesrSvcInd()[0] == 'S' &&         ( !allSpaces(svc6)  )) { 
                  feSvc15Fr = feServFr.getFeSvc15Fr();
                  svc15 = servTop.getSvc15();
//  IF ( SVC-1-5 (1 : 3) = FE-SVC-1-5-FR (1 : 3))
                  if ((		compareChars(substring(svc15,0,3),substring(feSvc15Fr,0,3)) == 0 )) { 
                      // MOVE 'Y' TO WS-FROM-SVC-FOUND
                      //  LITERAL_Y = 'Y'
                      work.setFromSvcFound(CONSTANTS.LITERAL_Y);
//  ADD 1 TO WS-NBR-MATCHED
                      workFields.setNbrMatched( (short) (workFields.getNbrMatched()+(short)1));
                  }
  
//cobolCode::GO TO 2125-EXIT
return ;
//cobolCodeEnds::GO TO 2125-EXIT
              }
  
              svc6 = servTop.getSvc6();
//  IF FESR-SVC-IND ( SVC-SUB ) = 'C' OR 'H' AND SVC-6 NOT = SPACES
              if (feSpiRulesRecord.getFesrFromCondFrToSvc(work.getSvcSub() - 1).getFesrSvcInd()[0] == 'C' || feSpiRulesRecord.getFesrFromCondFrToSvc(work.getSvcSub() - 1).getFesrSvcInd()[0] == 'H' &&         ( !allSpaces(svc6)  )) { 
//cobolCode::GO TO 2125-EXIT
return ;
//cobolCodeEnds::GO TO 2125-EXIT
              }
  
          }
  
          feSvc15To = feServTo.getFeSvc15To();
          svc15 = servTop.getSvc15();
//  IF ( SVC-1-5 NOT < FE-SVC-1-5-FR ) AND ( SVC-1-5 NOT > FE-SVC-1-5-TO )
          if ((		compareChars(svc15,feServFr.getFeSvc15Fr()) >= 0 ) && (		compareChars(svc15,feSvc15To) <= 0 )) { 

// *** Do not want a hit on rev code range if it's a medical claim!
//  IF FESR-SVC-IND ( SVC-SUB ) = 'R'
              if (feSpiRulesRecord.getFesrFromCondFrToSvc(work.getSvcSub() - 1).getFesrSvcInd()[0] == 'R') { 
                  uMedicalClaim51 = m51uLinkage.getUMedicalClaim51();
//  IF LK-51U-MEDICAL-CLAIM = 'Y'
//  LITERAL_Y = 'Y'
                  if (compareChars(uMedicalClaim51, CONSTANTS.LITERAL_Y) == 0) { 
//cobolCode::GO TO 2125-EXIT
return ;
//cobolCodeEnds::GO TO 2125-EXIT
                  }
  
              }
              feSvc6Fr = feServFr.getFeSvc6Fr();
//  IF FE-SVC-6-FR NOT = SPACES
              if (        ( !allSpaces(feSvc6Fr)  )) { 
                  svc6 = servTop.getSvc6();
                  feSvc6Fr = feServFr.getFeSvc6Fr();
//  IF SVC-6 = FE-SVC-6-FR
                  if (		compareChars(svc6,feSvc6Fr) == 0 ) { 
                      // MOVE 'Y' TO WS-FROM-SVC-FOUND
                      //  LITERAL_Y = 'Y'
                      work.setFromSvcFound(CONSTANTS.LITERAL_Y);
//  ADD 1 TO WS-NBR-MATCHED
                      workFields.setNbrMatched( (short) (workFields.getNbrMatched()+(short)1));
                  }
  
//  ELSE
                  else { 
                      svc6 = servTop.getSvc6();
                      feSvc6Fr = feServFr.getFeSvc6Fr();
//  IF SVC-6 = 'C' AND FE-SVC-6-FR = '2'
//  LITERAL_2 = '2'
                      if (compareChars(svc6, CONSTANTS.LITERAL_C) == 0 && compareChars(feSvc6Fr, CONSTANTS.LITERAL_2) == 0) { 
                          // MOVE 'Y' TO WS-FROM-SVC-FOUND
                          //  LITERAL_Y = 'Y'
                          work.setFromSvcFound(CONSTANTS.LITERAL_Y);
//  ADD 1 TO WS-NBR-MATCHED
                          workFields.setNbrMatched( (short) (workFields.getNbrMatched()+(short)1));
                      }
  
//  ELSE
                  }
              }
  
//  ELSE
              else { 
                  // MOVE 'Y' TO WS-FROM-SVC-FOUND
                  //  LITERAL_Y = 'Y'
                  work.setFromSvcFound(CONSTANTS.LITERAL_Y);
//  ADD 1 TO WS-NBR-MATCHED
                  workFields.setNbrMatched( (short) (workFields.getNbrMatched()+(short)1));
              }
          }
  
      
      }
      /**
      * searchPrv 
      *   This method is derived from 
  *   COBOL Paragraph - 2130-SEARCH-PRV COBOL Cyclomatic complexity - 3
      * Input  :  

      * - fesrFromPrvTyp                 COBOL Name: FESR-FROM-PRV-TYP
      * - pvSub                          COBOL Name: PV-SUB
      * - uProvType51                    COBOL Name: LK-51U-PROV-TYPE
      * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
      *
      * Output :  

      * - paragraph                      COBOL Name: WS-PARAGRAPH
      * - searchComplete                 COBOL Name: WS-SEARCH-COMPLETE
      * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
      * - fromPrvFound                   COBOL Name: WS-FROM-PRV-FOUND
      *
      * @throws CFException
      */
      private void searchPrv() throws Exception {
			// Declare local variables used in the method
			M51uLinkage m51uLinkage = dfhcommarea.getLinkAreaM51u().getM51uLinkage();
			char[] uProvType51 = null;
			// End of variable declaration

      
// *81***************************************************************
// *81 2130-Search-prv                                              *
// *81                                                              *
// *81 business function:                                           *
// *81 check for provider type match.                               *
// *81***************************************************************
// *82***************************************************************
// *82 2130-search-prv                                              *
// *82                                                              *
// *82 1. if the provider type is empty, then set a switch to       *
// *82    indicate that the search is complete.                     *
// *82    else, if the provider type in the record matches with the *
// *82    one in the linkage area, increment the counter which      *
// *82    indicates the number of matches.                          *
// *82***************************************************************

// *-------------------*
          // MOVE '2130' TO WS-PARAGRAPH
          //  LITERAL_2130 = '2130'
          workFields.setParagraph(CONSTANTS.LITERAL_2130);
//  IF FESR-FROM-PRV-TYP ( PV-SUB ) EQUAL SPACES
          if (        ( allSpaces(feSpiRulesRecord.getFesrFromCondPrvTyp(work.getPvSub() - 1).getFesrFromPrvTyp())   )) { 
              // MOVE 'Y' TO WS-SEARCH-COMPLETE
              //  LITERAL_Y = 'Y'
              work.setSearchComplete(CONSTANTS.LITERAL_Y);
          }
//  ELSE
          else { 
              uProvType51 = m51uLinkage.getUProvType51();
//  IF LK-51U-PROV-TYPE = FESR-FROM-PRV-TYP ( PV-SUB )
              if (		compareChars(uProvType51,feSpiRulesRecord.getFesrFromCondPrvTyp(work.getPvSub() - 1).getFesrFromPrvTyp()) == 0 ) { 
//  ADD 1 TO WS-NBR-MATCHED
                  workFields.setNbrMatched( (short) (workFields.getNbrMatched()+(short)1));
                  // MOVE 'Y' TO WS-FROM-PRV-FOUND
                  //  LITERAL_Y = 'Y'
                  work.setFromPrvFound(CONSTANTS.LITERAL_Y);
              }
  
          }
      
      }
      /**
      * searchIcd9 
      *   This method is derived from 
  *   COBOL Paragraph - 2140-SEARCH-ICD9 COBOL Cyclomatic complexity - 30
      * Input  :  

      * - s1                             COBOL Name: S1
      * - uDiagnosisCode51               COBOL Name: LK-51U-DIAGNOSIS-CODE
      * - searchComplete                 COBOL Name: WS-SEARCH-COMPLETE
      * - fromIcd9Found                  COBOL Name: WS-FROM-ICD9-FOUND
      * - uMedicalClaim51                COBOL Name: LK-51U-MEDICAL-CLAIM
      * - uLineDiagPointer51             COBOL Name: LK-51U-LINE-DIAG-POINTER
      * - uSourceInd51                   COBOL Name: LK-51U-SOURCE-IND
      * - sub01                          COBOL Name: LK-SUB
      * - fesrFromFrIcd9                 COBOL Name: FESR-FROM-FR-ICD9
      * - icd9Sub                        COBOL Name: ICD9-SUB
      * - fesrFromToIcd9                 COBOL Name: FESR-FROM-TO-ICD9
      * - uIcdVerNbr51                   COBOL Name: LK-51U-ICD-VER-NBR
      * - d51uRicdClmIcdInd              COBOL Name: D51U-RICD-CLM-ICD-IND
      * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
      *
      * Output :  

      * - paragraph                      COBOL Name: WS-PARAGRAPH
      * - s1                             COBOL Name: S1
      * - useDiagnosisSw                 COBOL Name: USE-DIAGNOSIS-SW
      * - point                          COBOL Name: WS-POINT
      * - uLineDiagPointer51             COBOL Name: LK-51U-LINE-DIAG-POINTER
      * - point1                         COBOL Name: WS-POINT-1
      * - point2                         COBOL Name: WS-POINT-2
      * - point3                         COBOL Name: WS-POINT-3
      * - point4                         COBOL Name: WS-POINT-4
      * - searchComplete                 COBOL Name: WS-SEARCH-COMPLETE
      * - fromIcd9Found                  COBOL Name: WS-FROM-ICD9-FOUND
      * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
      *
      * @throws CFException
      */
      private void searchIcd9() throws Exception {
			// Declare local variables used in the method
			M51uLinkage m51uLinkage = dfhcommarea.getLinkAreaM51u().getM51uLinkage();
			Point point = workFields.getPoint();
			char[] uSourceInd51 = null;
			char[] uLineDiagPointer51 = null;
			char[] uMedicalClaim51 = null;
			char[] uDiagnosisCode51 = null;
			char[] uIcdVerNbr51 = null;
			int point1 = 0;
			int s1 = 0;
			int point2 = 0;
			int point3 = 0;
			int point4 = 0;
			D51uRetRulIcd d51uRetRulIcd = vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIcd();
			// End of variable declaration

      
// *81***************************************************************
// *81 2140-Search-icd9                                             *
// *81                                                              *
// *81 check for icd9 match.                                        *
// *81***************************************************************
// *82***************************************************************
// *82 2140-search-icd9                                             *
// *82                                                              *
// *82 1. check if the diagnosis code is spaces.                    *
// *82 2. examine the mediclaim switch, the source indicator, the   *
// *82    line drag pointer and populate the use diagnosis switch.  *
// *82 3. when icd9 match is found, a flag is set and a counter is  *
// *82    accumulated to indicate number of matches. match should be*
// *82    within to from spi icd9 when both are present.            *
// *82***************************************************************

// *-------------------*
          // MOVE '2140' TO WS-PARAGRAPH
          //  LITERAL_2140 = '2140'
          workFields.setParagraph(CONSTANTS.LITERAL_2140);
//  PERFORM VARYING S1 FROM 1 BY 1 UNTIL S1 > 12 OR LK-51U-DIAGNOSIS-CODE (S1) = SPACES OR SEARCH-COMPLETE OR FROM-ICD9-FOUND
          for (work.setS1(1); (	( work.getS1() <= 12 ) &&         ( !allSpaces(m51uLinkage.getUDiagnosisCode51(work.getS1() - 1))  ) && !(work.isSearchComplete1())  && !(work.isFromIcd9Found1()) ) ; work.setS1(work.getS1() + 1) ) {

// *** For medical only check diagnosis where diag pointers apply
// *** for a given line
              // MOVE 'N' TO USE-DIAGNOSIS-SW
              //  LITERAL_N = 'N'
              work.setUseDiagnosisSw(CONSTANTS.LITERAL_N);
              uMedicalClaim51 = m51uLinkage.getUMedicalClaim51();
//  IF LK-51U-MEDICAL-CLAIM = 'Y'
//  LITERAL_Y = 'Y'
              if (compareChars(uMedicalClaim51, CONSTANTS.LITERAL_Y) == 0) { 

// *Dl1201    if s1 < 6
                  s1 = work.getS1();
//  IF S1 < 5
                  if (	( s1 < 5 )) { 
//  MOVE LK-51U-LINE-DIAG-POINTER ( LK-SUB ) TO WS-POINT
                      workFields.getPoint().setString(dfhcommarea.getLinkAreaM51u().getM51uLinkage().getULineData51(work.getSub01() - 1).getULineDiagPointer51());
                      s1 = work.getS1();
                      uSourceInd51 = m51uLinkage.getUSourceInd51();
                      point1 = point.getPoint1();
//  IF LK-51U-SOURCE-IND = 'M' AND WS-POINT-1 = 00 AND S1 = 1
//  LITERAL_1 = 1
                      if (compareChars(uSourceInd51, CONSTANTS.LITERAL_M) == 0 && 	( point1 == 0 ) && 	( s1 == 1 )) { 

// *Dl1201           ws-point-1 = '0'
                          // MOVE 'Y' TO USE-DIAGNOSIS-SW
                          //  LITERAL_Y = 'Y'
                          work.setUseDiagnosisSw(CONSTANTS.LITERAL_Y);
                      }
  
                      uSourceInd51 = m51uLinkage.getUSourceInd51();
                      point1 = point.getPoint1();
//  IF LK-51U-SOURCE-IND = 'M' AND WS-POINT-1 = 05
                      if (compareChars(uSourceInd51, CONSTANTS.LITERAL_M) == 0 && 	( point1 == 5 )) { 

// *Dl1201           ws-point-1 = '5'
                          // MOVE 'Y' TO USE-DIAGNOSIS-SW
                          //  LITERAL_Y = 'Y'
                          work.setUseDiagnosisSw(CONSTANTS.LITERAL_Y);
                      }
  

// *Dl1201        if lk-51u-line-diag-pointer(lk-sub)(1:1)
                      s1 = work.getS1();
                      uLineDiagPointer51 = m51uLinkage.getULineData51(work.getSub01() - 1).getULineDiagPointer51();
                      point1 = point.getPoint1();
//  IF LK-51U-LINE-DIAG-POINTER ( LK-SUB ) (1 : 2) NOT = SPACES AND WS-POINT-1 = S1
                      if (!(Field.allSpaces(uLineDiagPointer51,( 0 /*start*/ ), 2 /*len*/)) && 	( point1 == s1 )) { 
                          // MOVE 'Y' TO USE-DIAGNOSIS-SW
                          //  LITERAL_Y = 'Y'
                          work.setUseDiagnosisSw(CONSTANTS.LITERAL_Y);
                      }
  

// *Dl1201        if lk-51u-line-diag-pointer(lk-sub)(2:1)
                      s1 = work.getS1();
                      uLineDiagPointer51 = m51uLinkage.getULineData51(work.getSub01() - 1).getULineDiagPointer51();
                      point2 = point.getPoint2();
//  IF LK-51U-LINE-DIAG-POINTER ( LK-SUB ) (3 : 2) NOT = SPACES AND WS-POINT-2 = S1
                      if (!(Field.allSpaces(uLineDiagPointer51,( 2 /*start*/ ), 2 /*len*/)) && 	( point2 == s1 )) { 
                          // MOVE 'Y' TO USE-DIAGNOSIS-SW
                          //  LITERAL_Y = 'Y'
                          work.setUseDiagnosisSw(CONSTANTS.LITERAL_Y);
                      }
  

// *Dl1201        if lk-51u-line-diag-pointer(lk-sub)(3:1)
                      s1 = work.getS1();
                      uLineDiagPointer51 = m51uLinkage.getULineData51(work.getSub01() - 1).getULineDiagPointer51();
                      point3 = point.getPoint3();
//  IF LK-51U-LINE-DIAG-POINTER ( LK-SUB ) (5 : 2) NOT = SPACES AND WS-POINT-3 = S1
                      if (!(Field.allSpaces(uLineDiagPointer51,( 4 /*start*/ ), 2 /*len*/)) && 	( point3 == s1 )) { 
                          // MOVE 'Y' TO USE-DIAGNOSIS-SW
                          //  LITERAL_Y = 'Y'
                          work.setUseDiagnosisSw(CONSTANTS.LITERAL_Y);
                      }
  

// *Dl1201        if lk-51u-line-diag-pointer(lk-sub)(4:1)
                      s1 = work.getS1();
                      uLineDiagPointer51 = m51uLinkage.getULineData51(work.getSub01() - 1).getULineDiagPointer51();
                      point4 = point.getPoint4();
//  IF LK-51U-LINE-DIAG-POINTER ( LK-SUB ) (7 : 2) NOT = SPACES AND WS-POINT-4 = S1
                      if (!(Field.allSpaces(uLineDiagPointer51,( 6 /*start*/ ), 2 /*len*/)) && 	( point4 == s1 )) { 
                          // MOVE 'Y' TO USE-DIAGNOSIS-SW
                          //  LITERAL_Y = 'Y'
                          work.setUseDiagnosisSw(CONSTANTS.LITERAL_Y);
                      }
  
                  }
  
              }
  

// *Dl1201         if lk-51u-line-diag-pointer(lk-sub)(5:1)
// *dl1201                                      not = spaces
// *dl1201                  and
// *dl1201            ws-point-5 = s1
// *dl1201             move 'y' to use-diagnosis-sw
// *dl1201         end-if
//  ELSE
              else { 
                  // MOVE 'Y' TO USE-DIAGNOSIS-SW
                  //  LITERAL_Y = 'Y'
                  work.setUseDiagnosisSw(CONSTANTS.LITERAL_Y);
              }
//  IF USE-DIAGNOSIS
              if ( work.isUseDiagnosis()  ) { 
//  INSPECT LK-51U-DIAGNOSIS-CODE (S1) REPLACING ALL ' ' BY '0'
                  dfhcommarea.getLinkAreaM51u().getM51uLinkage().setUDiagnosisCode51((work.getS1() - 1),  replaceAll(dfhcommarea.getLinkAreaM51u().getM51uLinkage().getUDiagnosisCode51(work.getS1() - 1),CONSTANTS.SPACE,CONSTANTS.LITERAL_0)  );
//  INSPECT FESR-FROM-FR-ICD9 ( ICD9-SUB ) REPLACING ALL ' ' BY '0'
                  feSpiRulesRecord.getFesrFromCondFrToIcd9(work.getIcd9Sub() - 1).setFesrFromFrIcd9(  replaceAll(feSpiRulesRecord.getFesrFromCondFrToIcd9(work.getIcd9Sub() - 1).getFesrFromFrIcd9(),CONSTANTS.SPACE,CONSTANTS.LITERAL_0)  );
//  INSPECT FESR-FROM-TO-ICD9 ( ICD9-SUB ) REPLACING ALL ' ' BY '0'
                  feSpiRulesRecord.getFesrFromCondFrToIcd9(work.getIcd9Sub() - 1).setFesrFromToIcd9(  replaceAll(feSpiRulesRecord.getFesrFromCondFrToIcd9(work.getIcd9Sub() - 1).getFesrFromToIcd9(),CONSTANTS.SPACE,CONSTANTS.LITERAL_0)  );
//  IF FESR-FROM-FR-ICD9 ( ICD9-SUB ) = ZEROS
                  if (( allZeros(feSpiRulesRecord.getFesrFromCondFrToIcd9(work.getIcd9Sub() - 1).getFesrFromFrIcd9()) ) /*  ==  zeros*/) { 
                      // MOVE 'Y' TO WS-SEARCH-COMPLETE
                      //  LITERAL_Y = 'Y'
                      work.setSearchComplete(CONSTANTS.LITERAL_Y);
                  }
//  ELSE
                  else { 
//  IF FESR-FROM-TO-ICD9 ( ICD9-SUB ) NOT = ZEROS
                      if (!( allZeros(feSpiRulesRecord.getFesrFromCondFrToIcd9(work.getIcd9Sub() - 1).getFesrFromToIcd9()) ) /*  !=  zeros*/) { 

// *                  If lk-51u-diagnosis-code(s1) not <
                          uDiagnosisCode51 = m51uLinkage.getUDiagnosisCode51(work.getS1() - 1);
                          uIcdVerNbr51 = m51uLinkage.getUIcdVerNbr51();
//  IF LK-51U-DIAGNOSIS-CODE (S1) (1 : 5) NOT < FESR-FROM-FR-ICD9 ( ICD9-SUB ) AND LK-51U-DIAGNOSIS-CODE (S1) (1 : 5) NOT > FESR-FROM-TO-ICD9 ( ICD9-SUB ) AND LK-51U-ICD-VER-NBR = D51U-RICD-CLM-ICD-IND ( ICD9-SUB )
                          if (		compareChars(substring(uDiagnosisCode51,0,5),feSpiRulesRecord.getFesrFromCondFrToIcd9(work.getIcd9Sub() - 1).getFesrFromFrIcd9()) >= 0  && 		compareChars(substring(uDiagnosisCode51,0,5),feSpiRulesRecord.getFesrFromCondFrToIcd9(work.getIcd9Sub() - 1).getFesrFromToIcd9()) <= 0  && 		compareChars(uIcdVerNbr51,d51uRetRulIcd.getD51uRetRuleIcd(work.getIcd9Sub() - 1).getD51uRicdClmIcdInd()) == 0 ) { 

// *                     Lk-51u-diagnosis-code(s1) not >
                              // MOVE 'Y' TO WS-FROM-ICD9-FOUND
                              //  LITERAL_Y = 'Y'
                              work.setFromIcd9Found(CONSTANTS.LITERAL_Y);
                          }
  
                      }
//  ELSE
                      else { 

// *                  If lk-51u-diagnosis-code(s1) =
                          uDiagnosisCode51 = m51uLinkage.getUDiagnosisCode51(work.getS1() - 1);
                          uIcdVerNbr51 = m51uLinkage.getUIcdVerNbr51();
//  IF LK-51U-DIAGNOSIS-CODE (S1) (1 : 5) = FESR-FROM-FR-ICD9 ( ICD9-SUB ) AND LK-51U-ICD-VER-NBR = D51U-RICD-CLM-ICD-IND ( ICD9-SUB )
                          if (		compareChars(substring(uDiagnosisCode51,0,5),feSpiRulesRecord.getFesrFromCondFrToIcd9(work.getIcd9Sub() - 1).getFesrFromFrIcd9()) == 0  && 		compareChars(uIcdVerNbr51,d51uRetRulIcd.getD51uRetRuleIcd(work.getIcd9Sub() - 1).getD51uRicdClmIcdInd()) == 0 ) { 
                              // MOVE 'Y' TO WS-FROM-ICD9-FOUND
                              //  LITERAL_Y = 'Y'
                              work.setFromIcd9Found(CONSTANTS.LITERAL_Y);
                          }
  
                      }
                  }
              }
          }
  
//  IF FROM-ICD9-FOUND
          if ( work.isFromIcd9Found1()  ) { 
//  ADD 1 TO WS-NBR-MATCHED
              workFields.setNbrMatched( (short) (workFields.getNbrMatched()+(short)1));
          }
      
      }
      /**
      * searchCause 
      *   This method is derived from 
  *   COBOL Paragraph - 2150-SEARCH-CAUSE COBOL Cyclomatic complexity - 3
      * Input  :  

      * - fesrFromCauseCd                COBOL Name: FESR-FROM-CAUSE-CD
      * - causeSub                       COBOL Name: CAUSE-SUB
      * - uCauseCd51                     COBOL Name: LK-51U-CAUSE-CD
      * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
      *
      * Output :  

      * - paragraph                      COBOL Name: WS-PARAGRAPH
      * - searchComplete                 COBOL Name: WS-SEARCH-COMPLETE
      * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
      * - fromCauseFound                 COBOL Name: WS-FROM-CAUSE-FOUND
      *
      * @throws CFException
      */
      private void searchCause() throws Exception {
			// Declare local variables used in the method
			M51uLinkage m51uLinkage = dfhcommarea.getLinkAreaM51u().getM51uLinkage();
			char[] uCauseCd51 = null;
			// End of variable declaration

      
// *81***************************************************************
// *81 2150-Search-cause                                            *
// *81                                                              *
// *81 business function:                                           *
// *81 this section increments the counter which indicates the      *
// *81 number of matches when ever a cause code match is found.     *
// *81***************************************************************
// *82***************************************************************
// *82 2150-search-cause                                            *
// *82                                                              *
// *82 1. if the cause code for that particular index is empty, it  *
// *82    denotes that the search is complete. else, increase the   *
// *82    number of matches by 1.                                   *
// *82***************************************************************

// *-------------------*
          // MOVE '2150' TO WS-PARAGRAPH
          //  LITERAL_2150 = '2150'
          workFields.setParagraph(CONSTANTS.LITERAL_2150);
//  IF FESR-FROM-CAUSE-CD ( CAUSE-SUB ) = SPACES
          if (        ( allSpaces(feSpiRulesRecord.getFesrFromCondCause(work.getCauseSub() - 1).getFesrFromCauseCd())   )) { 
              // MOVE 'Y' TO WS-SEARCH-COMPLETE
              //  LITERAL_Y = 'Y'
              work.setSearchComplete(CONSTANTS.LITERAL_Y);
          }
//  ELSE
          else { 
              uCauseCd51 = m51uLinkage.getUCauseCd51();
//  IF LK-51U-CAUSE-CD = FESR-FROM-CAUSE-CD ( CAUSE-SUB )
              if (		compareChars(uCauseCd51,feSpiRulesRecord.getFesrFromCondCause(work.getCauseSub() - 1).getFesrFromCauseCd()) == 0 ) { 
//  ADD 1 TO WS-NBR-MATCHED
                  workFields.setNbrMatched( (short) (workFields.getNbrMatched()+(short)1));
                  // MOVE 'Y' TO WS-FROM-CAUSE-FOUND
                  //  LITERAL_Y = 'Y'
                  work.setFromCauseFound(CONSTANTS.LITERAL_Y);
              }
  
          }
      
      }
      /**
      * matchIpaToPpoalt 
      *   This method is derived from 
  *   COBOL Paragraph - 2160-MATCH-IPA-TO-PPOALT COBOL Cyclomatic complexity - 10
      * Input  :  

      * - ppaPpoIdCount                  COBOL Name: PPA-PPO-ID-COUNT
      * - ipaSub                         COBOL Name: IPA-SUB
      * - ppaIpa                         COBOL Name: PPA-IPA
      * - uEarliestDos51                 COBOL Name: LK-51U-EARLIEST-DOS
      * - ppaFirstEffDate                COBOL Name: PPA-FIRST-EFF-DATE
      * - ppaLastCanDate                 COBOL Name: PPA-LAST-CAN-DATE
      * - fesrIpaCd                      COBOL Name: FESR-IPA-CD
      *
      * Output :  

      * - ipaSub                         COBOL Name: IPA-SUB
      * - ipaCodeFound                   COBOL Name: WS-IPA-CODE-FOUND
      *
      * @throws CFException
      */
      private void matchIpaToPpoalt() throws Exception {
			// Declare local variables used in the method
			PpaFixedPortion ppaFixedPortion = dfhcommarea.getPpaPpoaltRecord().getPpaFixedPortion();
			short ppaPpoIdCount = 0;
			PpaPpoaltRecord ppaPpoaltRecord = dfhcommarea.getPpaPpoaltRecord();
			M51uLinkage m51uLinkage = dfhcommarea.getLinkAreaM51u().getM51uLinkage();
			long uEarliestDos51 = 0;
			// End of variable declaration

      
// *81***************************************************************
// *81 2160-Match-ipa-to-ppoalt                                     *
// *81                                                              *
// *81 business function:                                           *
// *81 checks for a match on individual practice association code   *
// *81***************************************************************
// *82***************************************************************
// *82 2160-match-ipa-to-ppoalt                                     *
// *82                                                              *
// *82 1. when no prefered provider organization records are found  *
// *82    exit, the section.                                        *
// *82 2. if the ppa-ipa is greater than zero                       *
// *82    - if the earliest date of service is greater than the ppa-*
// *82      first effective date and the earlist date of service is *
// *82      less than the last cancel date,                         *
// *82      - if the ppa-ipa matches with any of the three ipa-codes*
// *82        then set a switch to indicate that the ipa code is    *
// *82        found.                                                *
// *82***************************************************************

// *------------------------*
//  IF PPA-PPO-ID-COUNT IS NOT NUMERIC
          if (         !(ppaFixedPortion.ppaPpoIdCountIsNumeric() ) ) { 
//cobolCode::GO TO 2160-EXIT
return ;
//cobolCodeEnds::GO TO 2160-EXIT
          }
  
//  PERFORM VARYING IPA-SUB FROM 1 BY 1 UNTIL IPA-SUB > PPA-PPO-ID-COUNT
          for (work.setIpaSub(1); (	( work.getIpaSub() <= ppaFixedPortion.getPpaPpoIdCount() ) ) ; work.setIpaSub(work.getIpaSub() + 1) ) {
//  IF PPA-IPA ( IPA-SUB ) > ZEROES
              if (	( ppaPpoaltRecord.getPpaPpoId(work.getIpaSub() - 1).getPpaOccurrence().getPpaIpa() > 0 )) { 
                  uEarliestDos51 = m51uLinkage.getUEarliestDos51();
//  IF ( ( LK-51U-EARLIEST-DOS NOT < PPA-FIRST-EFF-DATE ( IPA-SUB )) AND ( LK-51U-EARLIEST-DOS NOT > PPA-LAST-CAN-DATE ( IPA-SUB )))
                  if ((((	( uEarliestDos51 >= ppaPpoaltRecord.getPpaPpoId(work.getIpaSub() - 1).getPpaOccurrence().getPpaFirstEffDate() ) )) && ((	( uEarliestDos51 <= ppaPpoaltRecord.getPpaPpoId(work.getIpaSub() - 1).getPpaOccurrence().getPpaLastCanDate() ) )))) { 
//  IF ( ( PPA-IPA ( IPA-SUB ) = FESR-IPA-CD (1)) OR ( PPA-IPA ( IPA-SUB ) = FESR-IPA-CD (2)) OR ( PPA-IPA ( IPA-SUB ) = FESR-IPA-CD (3)))
                      if ((((	( ppaPpoaltRecord.getPpaPpoId(work.getIpaSub() - 1).getPpaOccurrence().getPpaIpa() == feSpiRulesRecord.getFesrIpaCode(0).getFesrIpaCd() ))) || ((	( ppaPpoaltRecord.getPpaPpoId(work.getIpaSub() - 1).getPpaOccurrence().getPpaIpa() == feSpiRulesRecord.getFesrIpaCode(1).getFesrIpaCd() ))) || ((	( ppaPpoaltRecord.getPpaPpoId(work.getIpaSub() - 1).getPpaOccurrence().getPpaIpa() == feSpiRulesRecord.getFesrIpaCode(2).getFesrIpaCd() ))))) { 
                          // MOVE 'Y' TO WS-IPA-CODE-FOUND
                          //  LITERAL_Y = 'Y'
                          work.setIpaCodeFound(CONSTANTS.LITERAL_Y);
                      }
  
                  }
  
              }
  
          }
  
      
      }
      /**
      * checkServiceCodes 
      *   This method is derived from 
  *   COBOL Paragraph - 2600-CHECK-SERVICE-CODES COBOL Cyclomatic complexity - 2
      * Input  :  

      * - uLineServiceCode51             COBOL Name: LK-51U-LINE-SERVICE-CODE
      *
      * Output :  

      * - paragraph                      COBOL Name: WS-PARAGRAPH
      * - ckServCls                      COBOL Name: CK-SERV-CLS
      * - uLineServiceCode51             COBOL Name: LK-51U-LINE-SERVICE-CODE
      * - medSvcNbr                      COBOL Name: MED-SVC-NBR
      * - csvcCode                       COBOL Name: CSVC-CODE
      * - topsCnvSvc                     COBOL Name: WS-TOPS-CNV-SVC
      * - medSvc                         COBOL Name: MED-SVC
      * - cls15                          COBOL Name: CLS-1-5
      * - csvcProc                       COBOL Name: CSVC-PROC
      * - servTop                        COBOL Name: WS-SERV-TOP
      *
      * @throws CFException
      */
      private void checkServiceCodes() throws Exception {
			// Declare local variables used in the method
			CkServCls ckServCls = workFields.getCkServCls();
			long cls15 = 0;
			// End of variable declaration

      
// *81***************************************************************
// *81 2600-Check-service-codes                                     *
// *81                                                              *
// *81 business function:                                           *
// *81 convert the procedure code into the service code             *
// *81***************************************************************
// *82***************************************************************
// *82 2600-check-service-codes                                     *
// *82                                                              *
// *82 1. examine the service code. if necessary convert the        *
// *82    procedure code into the service code.                     *
// *82***************************************************************

// *------------------------*
          // MOVE '2600' TO WS-PARAGRAPH
          //  LITERAL_2600 = '2600'
          workFields.setParagraph(CONSTANTS.LITERAL_2600);
//  MOVE LK-51U-LINE-SERVICE-CODE ( LK-SUB ) TO CK-SERV-CLS
          workFields.getCkServCls().setString(dfhcommarea.getLinkAreaM51u().getM51uLinkage().getULineData51(work.getSub01() - 1).getULineServiceCode51());
//  MOVE 0 TO MED-SVC-NBR CSVC-CODE
//  LITERAL_0 = 0
          work.setMedSvcNbr((short)0);
          csvcCodeGroup.setCsvcCode(CONSTANTS.LITERAL_0);
          // MOVE 'N' TO WS-TOPS-CNV-SVC
          //  LITERAL_N = 'N'
          work.setTopsCnvSvc(CONSTANTS.LITERAL_N);
          // MOVE CK-SERV-CLS TO MED-SVC
          work.setMedSvc(workFields.getCkServCls().toCharArray());
          cls15 = ckServCls.getCls15();
//  IF CLS-1-5 IS NUMERIC
          if (        ckServCls.cls15IsNumeric() ) { 
              // MOVE CK-SERV-CLS TO CSVC-PROC
              csvcProc.setString(workFields.getCkServCls().getCharArray());
//  PERFORM CONVERT-PROC-TO-SVC-CD THRU CONVERT-PROC-EXIT
              convertProcToSvcCd();/*CONVERT-PROC-TO-SVC-CD SECTION*/
//  MOVE CSVC-CODE TO MED-SVC
              work.setMedSvc(csvcCodeGroup.getCsvcCode().toCharArray());
//  MOVE MED-SVC TO WS-SERV-TOP
              workFields.setServTop(work.getMedSvc());
              // MOVE 'Y' TO WS-TOPS-CNV-SVC
              //  LITERAL_Y = 'Y'
              work.setTopsCnvSvc(CONSTANTS.LITERAL_Y);
          }
  
      
      }
      /**
      * readEqiFile 
      *   This method is derived from 
  *   COBOL Paragraph - 2650-READ-EQI-FILE COBOL Cyclomatic complexity - 8
      * Input  :  

      * - cls15                          COBOL Name: CLS-1-5
      * - cicsDfhrespCode                COBOL Name: CICS-DFHRESP-CODE
      * - ddEqisAlt                      COBOL Name: WS-DD-EQIS-ALT
      * - sceAltKey                      COBOL Name: SCE-ALT-KEY
      * - w02FnuLineRead                 COBOL Name: W02-FNU-LINE-READ
      * - sceFromHcpcsCpt                COBOL Name: SCE-FROM-HCPCS-CPT
      *
      * Output :  

      * - medSvcNbr                      COBOL Name: MED-SVC-NBR
      * - csvcCode                       COBOL Name: CSVC-CODE
      * - topsCnvSvc                     COBOL Name: WS-TOPS-CNV-SVC
      * - sceAltModifier                 COBOL Name: SCE-ALT-MODIFIER
      * - sceAltToHcpcs                  COBOL Name: SCE-ALT-TO-HCPCS
      * - cls15                          COBOL Name: CLS-1-5
      * - sceAltCancDate                 COBOL Name: SCE-ALT-CANC-DATE
      * - sceServiceCode                 COBOL Name: SCE-SERVICE-CODE
      * - w02DsplErrInd                  COBOL Name: W02-DSPL-ERR-IND
      * - w02FnuFileRd                   COBOL Name: W02-FNU-FILE-RD
      * - ddEqisAlt                      COBOL Name: WS-DD-EQIS-ALT
      * - w02FnuKeyRd                    COBOL Name: W02-FNU-KEY-RD
      * - sceAltKey                      COBOL Name: SCE-ALT-KEY
      * - w02RespCd                      COBOL Name: W02-RESP-CD
      * - cicsDfhrespCode                COBOL Name: CICS-DFHRESP-CODE
      * - w02DsplMsg                     COBOL Name: W02-DSPL-MSG
      * - w02FnuLineRead                 COBOL Name: W02-FNU-LINE-READ
      * - m51uIllogicalCondSw            COBOL Name: M51U-ILLOGICAL-COND-SW
      *
      * @throws CFException
      */
      private void readEqiFile() throws Exception {
			// Declare local variables used in the method
			SceAltKey sceAltKey = eqiRecord.getSceRecord().getSceAltKey();
			CkServCls ckServCls = workFields.getCkServCls();
			SceKey sceKey = eqiRecord.getSceRecord().getSceKey();
			SceRecord sceRecord = eqiRecord.getSceRecord();
			char[] sceAltToHcpcs = null;
			char[] sceFromHcpcsCpt = null;
			long cls15 = 0;
			// End of variable declaration

      
// *82 If not  found, assign value of '999999' to the service code  *
// *82 per system spec.                                             *
// *82 populate sce-alt-canc-date with all 9's.                     *
// *82***************************************************************

// **** Display for testing, comment out                   ****
// ***  add 1 to scntr.
// **** if scntr < 12
// ***       display '51u prior to 27d tread= '  scntr
// **        display '51u cls-1-5#:    = ' cls-1-5
// **        display 'ck serv cls value= '  ck-serv-cls
// **   end-if.
// **** end of display                                     ****
//  MOVE 0 TO MED-SVC-NBR CSVC-CODE
//  LITERAL_0 = 0
          work.setMedSvcNbr((short)0);
          csvcCodeGroup.setCsvcCode(CONSTANTS.LITERAL_0);
          // MOVE 'N' TO WS-TOPS-CNV-SVC
          //  LITERAL_N = 'N'
          work.setTopsCnvSvc(CONSTANTS.LITERAL_N);
//  MOVE SPACES TO SCE-ALT-MODIFIER
          sceAltKey.setSceAltModifier(CONSTANTS.SPACE);
  
//  MOVE CLS-1-5 TO SCE-ALT-TO-HCPCS
          sceAltKey.setSceAltToHcpcs(String.valueOf(ckServCls.getCls15String()).toCharArray());
  
//  MOVE 99999999 TO SCE-ALT-CANC-DATE
          sceAltKey.setSceAltCancDate((long)99999999);
  
//  PERFORM 1500-READ-EQI THRU 1500-X
          readEqi();/*1500-READ-EQI*/
          if (this.isProgramEnded()) {
              return ;
          }

// *                            Frontend-hd-pmt-icn-record
// *                            frontend-med-pmt-icn-record
// *                            ls-prvfrc-rec
// *                            ls-golden-rule-record.
//  EVALUATE TRUE
          if  ( work.isCicsNormal()  ) { 
              ;
          }
          else if  ( work.isCicsNotfnd()  ) { 
              // MOVE 999999 TO SCE-SERVICE-CODE
              //  LITERAL_999999 = 999999
              eqiRecord.getSceRecord().getSceKey().setSceServiceCode(CONSTANTS.LITERAL_999999);
  
//cobolCode::GO TO 2650-CONTINUE-PROCESS
return ;
//cobolCodeEnds::GO TO 2650-CONTINUE-PROCESS
          }
          else if  ( work.isCicsEndfile()  ) { 
              // MOVE 999999 TO SCE-SERVICE-CODE
              //  LITERAL_999999 = 999999
              eqiRecord.getSceRecord().getSceKey().setSceServiceCode(CONSTANTS.LITERAL_999999);
  
//cobolCode::GO TO 2650-CONTINUE-PROCESS
return ;
//cobolCodeEnds::GO TO 2650-CONTINUE-PROCESS
          }
          else   { 
//  MOVE 'ERR' TO W02-DSPL-ERR-IND
//  LITERAL_ERR = 'ERR'
              w02DsplMsgArea.setW02DsplErrInd(CONSTANTS.LITERAL_ERR);
              // MOVE WS-DD-EQIS-ALT TO W02-FNU-FILE-RD
              w02FnuLineRead.setW02FnuFileRd(ddEqisAlt.toCharArray());
              // MOVE SCE-ALT-KEY TO W02-FNU-KEY-RD
              w02FnuLineRead.setW02FnuKeyRd(eqiRecord.getSceRecord().getSceAltKey().toCharArray());
  
//  MOVE CICS-DFHRESP-CODE TO W02-RESP-CD
              w02DsplMsgArea.setW02RespCd( work.getCicsDfhrespCode());
              // MOVE W02-FNU-LINE-READ TO W02-DSPL-MSG
              w02DsplMsgArea.setW02DsplMsg(w02FnuLineRead.toCharArray());
//  PERFORM 11100A-WRITE-TO-SYSM THRU 11100A-EXIT
              writeToSysm();/*11100A-WRITE-TO-SYSM SECTION*/
              if (this.isProgramEnded()) {
                  return ;
              }
//  SET M51U-ILLOGICAL-COND TO TRUE
              dfhcommarea.getLinkAreaM51u().getM51uFlags().setM51uIllogicalCondTrue(); 
              
//  PERFORM 8000-DUMP-ABEND THRU 8000-EXIT
              dumpAbend();/*8000-DUMP-ABEND SECTION*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
          sceAltToHcpcs = sceAltKey.getSceAltToHcpcs();
          cls15 = ckServCls.getCls15();
//  IF SCE-ALT-TO-HCPCS = CLS-1-5
          if (compareChars(sceAltToHcpcs,String.valueOf(ckServCls.getCls15String()).toCharArray()) == 0) { 
//cobolCode::GO TO 2650-CONTINUE-PROCESS
return ;
//cobolCodeEnds::GO TO 2650-CONTINUE-PROCESS
          }
  
//  IF CLS-1-5 < SCE-ALT-TO-HCPCS AND CLS-1-5 >= SCE-FROM-HCPCS-CPT
          sceFromHcpcsCpt = sceRecord.getSceFromHcpcsCpt();
          sceAltToHcpcs = sceAltKey.getSceAltToHcpcs();
          cls15 = ckServCls.getCls15();
//  ELSE
          if (compareChars(ckServCls.getCls15String(),sceAltToHcpcs) >= 0 || compareChars(ckServCls.getCls15String(),sceFromHcpcsCpt) < 0) { 
              // MOVE 999999 TO SCE-SERVICE-CODE
              //  LITERAL_999999 = 999999
              eqiRecord.getSceRecord().getSceKey().setSceServiceCode(CONSTANTS.LITERAL_999999);
  
          }
  
      
      }
      /**
      * continueProcess 
      *   This method is derived from 
  *   COBOL Paragraph - 2650-CONTINUE-PROCESS COBOL Cyclomatic complexity - 1
      * Input  :  

      * - sceServiceCode                 COBOL Name: SCE-SERVICE-CODE
      *
      * Output :  

      * - csvcProc                       COBOL Name: CSVC-PROC
      * - csvcCode                       COBOL Name: CSVC-CODE
      * - sceServiceCode                 COBOL Name: SCE-SERVICE-CODE
      * - medSvc                         COBOL Name: MED-SVC
      * - servTop                        COBOL Name: WS-SERV-TOP
      * - topsCnvSvc                     COBOL Name: WS-TOPS-CNV-SVC
      *
      * @throws CFException
      */
      private void continueProcess() throws Exception {
			// Declare local variables used in the method
			SceKey sceKey = eqiRecord.getSceRecord().getSceKey();
			// End of variable declaration

//  MOVE SCE-SERVICE-CODE TO CSVC-PROC CSVC-CODE
          csvcProc.setString(sceKey.getSceServiceCode());
          csvcCodeGroup.setCsvcCode(sceKey.getSceServiceCode());
  
//  MOVE CSVC-CODE TO MED-SVC
          work.setMedSvc(csvcCodeGroup.getCsvcCode().toCharArray());
//  MOVE MED-SVC TO WS-SERV-TOP
          workFields.setServTop(work.getMedSvc());
          // MOVE 'Y' TO WS-TOPS-CNV-SVC
          //  LITERAL_Y = 'Y'
          work.setTopsCnvSvc(CONSTANTS.LITERAL_Y);
      
      }
      /**
      * chiroProcessing 
      *   This method is derived from 
  *   COBOL Paragraph - 2700-CHIRO-PROCESSING COBOL Cyclomatic complexity - 12
      * Input  :  

      * - uCcmNOSvcInd51                 COBOL Name: LK-51U-CCM-N-O-SVC-IND
      * - uOutLineServiceCode51          COBOL Name: LK-51U-OUT-LINE-SERVICE-CODE
      * - sub01                          COBOL Name: LK-SUB
      * - nbrOfLines                     COBOL Name: WS-NBR-OF-LINES
      * - uOutLineChargeAmt51            COBOL Name: LK-51U-OUT-LINE-CHARGE-AMT
      * - uOutLineNotcovAmt51            COBOL Name: LK-51U-OUT-LINE-NOTCOV-AMT
      * - medSvc                         COBOL Name: MED-SVC
      * - uOutLineDosDate51              COBOL Name: LK-51U-OUT-LINE-DOS-DATE
      *
      * Output :  

      * - newServiceCode                 COBOL Name: WS-NEW-SERVICE-CODE
      * - uOutLineServiceCode51          COBOL Name: LK-51U-OUT-LINE-SERVICE-CODE
      * - paragraph                      COBOL Name: WS-PARAGRAPH
      * - firstTimeThru                  COBOL Name: WS-FIRST-TIME-THRU
      * - mcrLineCharge                  COBOL Name: MCR-LINE-CHARGE
      * - sub01                          COBOL Name: LK-SUB
      * - mcrLineNbr                     COBOL Name: MCR-LINE-NBR
      * - chargeSub                      COBOL Name: CHARGE-SUB
      * - uOutLineChargeAmt51            COBOL Name: LK-51U-OUT-LINE-CHARGE-AMT
      * - prevDateServ                   COBOL Name: WS-PREV-DATE-SERV
      * - uOutLineDosDate51              COBOL Name: LK-51U-OUT-LINE-DOS-DATE
      * - uOutLineNotcovAmt51            COBOL Name: LK-51U-OUT-LINE-NOTCOV-AMT
      * - uOutLineRemarkCd51             COBOL Name: LK-51U-OUT-LINE-REMARK-CD
      * - chargeCombined                 COBOL Name: WS-CHARGE-COMBINED
      * - uOutLineAppUnits51             COBOL Name: LK-51U-OUT-LINE-APP-UNITS
      *
      * @throws CFException
      */
      private void chiroProcessing() throws Exception {
			// Declare local variables used in the method
			LinkAreaM51u linkAreaM51u = dfhcommarea.getLinkAreaM51u();
			char[] uCcmNOSvcInd51 = null;
			char[] medSvc = null;
			McrCheckTable mcrCheckTable = workFields.getMcrCheckTable();
			BigDecimal tempDecimal = BigDecimal.ZERO;
			M51uLinkage m51uLinkage = dfhcommarea.getLinkAreaM51u().getM51uLinkage();
			int prevDateServ = 0;
			// End of variable declaration

      
// *81***************************************************************
// *81 2700-Chiro-processing                                        *
// *81                                                              *
// *81 business function:                                           *
// *81 depending on the service code populate  the storage variables*
// *81 with the charge amount and the date of service.              *
// *81***************************************************************
// *82***************************************************************
// *82 2700-chiro-processing                                        *
// *82                                                              *
// *82 1. if the service code is 'spth' and if the charge amount    *
// *82    is not equal to the not covered amount,examine the service*
// *82    codes, if necessary change the procedure code into the    *
// *82    service code.                                             *
// *82 2. if the service code is equal to 90000 or 97000            *
// *82     - if its entering this paragraph for the first time,     *
// *82       populate the charge amount and the date of service     *
// *82       variables with the values in the linkage area.         *
// *82     - if there already exists such a transaction, then add   *
// *82       the charge amount to the existing amount, and move the *
// *82       charge amount to the not covered amount. also move 'hj'*
// *82       to the remark code, and indicate that the charge amount*
// *82       has been combined.                                     *
// *82     - if there does not exist such a transaction, just move  *
// *82       the charge amount and the date of service into the     *
// *82       storage variables.                                     *
// *82 3. if the charge is combined, populate the applicable units  *
// *82    and the charge amount in the linkage area.                *
// *82***************************************************************

// *------------------------*
          uCcmNOSvcInd51 = linkAreaM51u.getUCcmNOSvcInd51();
//  IF LK-51U-CCM-N-O-SVC-IND = 'O'
//  LITERAL_O = 'O'
          if (compareChars(uCcmNOSvcInd51, CONSTANTS.LITERAL_O) == 0) { 
//  MOVE LK-51U-OUT-LINE-SERVICE-CODE ( LK-SUB ) TO WS-NEW-SERVICE-CODE
              workFields.setNewServiceCode(dfhcommarea.getLinkAreaM51u().getM51uLinkage().getUOutLineData51(work.getSub01() - 1).getUOutLineServiceCode51());
//  IF NEW-SVC-CD
              if ( workFields.isNewSvcCd()  ) { 
//cobolCode::GO TO 2700-EXIT
return ;
//cobolCodeEnds::GO TO 2700-EXIT
              }
          }
  
          // MOVE '2700' TO WS-PARAGRAPH
          //  LITERAL_2700 = '2700'
          workFields.setParagraph(CONSTANTS.LITERAL_2700);
          // MOVE 'Y' TO WS-FIRST-TIME-THRU
          //  LITERAL_Y = 'Y'
          work.setFirstTimeThru(CONSTANTS.LITERAL_Y);
//  MOVE ZEROS TO MCR-LINE-CHARGE
          mcrCheckTable.setMcrLineCharge(BigDecimal.ZERO);
  
//  PERFORM VARYING LK-SUB FROM 1 BY 1 UNTIL LK-SUB > WS-NBR-OF-LINES
          for (work.setSub01(1); (	( work.getSub01() <= workFields.getNbrOfLines() )) ; work.setSub01(work.getSub01() + 1) ) {
//  IF ( LK-51U-OUT-LINE-SERVICE-CODE ( LK-SUB ) = 'SPTH' ) AND ( LK-51U-OUT-LINE-CHARGE-AMT ( LK-SUB )) NOT EQUAL LK-51U-OUT-LINE-NOTCOV-AMT ( LK-SUB )
              if ((compareChars(m51uLinkage.getUOutLineData51(work.getSub01() - 1).getUOutLineServiceCode51(),CONSTANTS.LITERAL_SPTH_B2_) == 0) && 			( m51uLinkage.getUOutLineData51(work.getSub01() - 1).getUOutLineChargeAmt51().compareTo(m51uLinkage.getUOutLineData51(work.getSub01() - 1).getUOutLineNotcovAmt51()) != 0) ) { 
//  PERFORM 2600-CHECK-SERVICE-CODES THRU 2600-EXIT
                  checkServiceCodes();/*2600-CHECK-SERVICE-CODES*/
                  medSvc = work.getMedSvc();
//  IF MED-SVC = 90000 OR 97000
//  LITERAL_97000 = 97000
                  if (compareChars(medSvc,CONSTANTS.LITERAL_90000_B_) == 0 || compareChars(medSvc,CONSTANTS.LITERAL_97000_B_) == 0) { 
//  IF FIRST-TIME-THRU
                      if ( work.isFirstTimeThru1()  ) { 
                          // MOVE 'N' TO WS-FIRST-TIME-THRU
                          //  LITERAL_N = 'N'
                          work.setFirstTimeThru(CONSTANTS.LITERAL_N);
                          // MOVE 1 TO MCR-LINE-NBR
                          workFields.getMcrCheckTable().setMcrLineNbr(1);
  
//  MOVE LK-SUB TO CHARGE-SUB
                          workFields.setChargeSub( work.getSub01());
//  MOVE LK-51U-OUT-LINE-CHARGE-AMT ( LK-SUB ) TO MCR-LINE-CHARGE
                          mcrCheckTable.setMcrLineCharge(dfhcommarea.getLinkAreaM51u().getM51uLinkage().getUOutLineData51(work.getSub01() - 1).getUOutLineChargeAmt51());
  
//  MOVE LK-51U-OUT-LINE-DOS-DATE ( LK-SUB ) TO WS-PREV-DATE-SERV
                          workFields.setPrevDateServ(dfhcommarea.getLinkAreaM51u().getM51uLinkage().getUOutLineData51(work.getSub01() - 1).getUOutLineDosDate51());
                      }
//  ELSE
                      else { 
//  IF ( LK-51U-OUT-LINE-DOS-DATE ( LK-SUB ) EQUAL WS-PREV-DATE-SERV )
                          if ((	( m51uLinkage.getUOutLineData51(work.getSub01() - 1).getUOutLineDosDate51() == workFields.getPrevDateServ() ))) { 
//  ADD LK-51U-OUT-LINE-CHARGE-AMT ( LK-SUB ) TO MCR-LINE-CHARGE
                              tempDecimal = mcrCheckTable.getMcrLineCharge().add(dfhcommarea.getLinkAreaM51u().getM51uLinkage().getUOutLineData51(work.getSub01() - 1).getUOutLineChargeAmt51()).setScale(2,RoundingMode.DOWN);
                              mcrCheckTable.setMcrLineCharge(tempDecimal);
                              //
  
//  MOVE LK-51U-OUT-LINE-CHARGE-AMT ( LK-SUB ) TO LK-51U-OUT-LINE-NOTCOV-AMT ( LK-SUB )
                              dfhcommarea.getLinkAreaM51u().getM51uLinkage().getUOutLineData51(work.getSub01() - 1).setUOutLineNotcovAmt51(dfhcommarea.getLinkAreaM51u().getM51uLinkage().getUOutLineData51(work.getSub01() - 1).getUOutLineChargeAmt51());
//  MOVE 'HJ' TO LK-51U-OUT-LINE-REMARK-CD ( LK-SUB )
                              dfhcommarea.getLinkAreaM51u().getM51uLinkage().getUOutLineData51(work.getSub01() - 1).setUOutLineRemarkCd51(CONSTANTS.LITERAL_HJ_B_);
//  MOVE 'Y' TO WS-CHARGE-COMBINED
//  LITERAL_Y = 'Y'
                              workFields.setChargeCombined(CONSTANTS.LITERAL_Y);
                          }
  
//  ELSE
                          else { 
                              // MOVE 1 TO MCR-LINE-NBR
                              workFields.getMcrCheckTable().setMcrLineNbr(1);
  
//  MOVE LK-SUB TO CHARGE-SUB
                              workFields.setChargeSub( work.getSub01());
//  MOVE LK-51U-OUT-LINE-CHARGE-AMT ( LK-SUB ) TO MCR-LINE-CHARGE
                              mcrCheckTable.setMcrLineCharge(dfhcommarea.getLinkAreaM51u().getM51uLinkage().getUOutLineData51(work.getSub01() - 1).getUOutLineChargeAmt51());
  
//  MOVE LK-51U-OUT-LINE-DOS-DATE ( LK-SUB ) TO WS-PREV-DATE-SERV
                              workFields.setPrevDateServ(dfhcommarea.getLinkAreaM51u().getM51uLinkage().getUOutLineData51(work.getSub01() - 1).getUOutLineDosDate51());
                          }
                      }
                  }
  
              }
  
          }
//  IF CHARGE-COMBINED
          if ( workFields.isChargeCombined1()  ) { 
//  MOVE 'N' TO WS-CHARGE-COMBINED
//  LITERAL_N = 'N'
              workFields.setChargeCombined(CONSTANTS.LITERAL_N);
//  MOVE MCR-LINE-NBR TO LK-51U-OUT-LINE-APP-UNITS ( CHARGE-SUB )
              dfhcommarea.getLinkAreaM51u().getM51uLinkage().getUOutLineData51(workFields.getChargeSub() - 1).setUOutLineAppUnits51(mcrCheckTable.getMcrLineNbr());
  
//  MOVE MCR-LINE-CHARGE TO LK-51U-OUT-LINE-CHARGE-AMT ( CHARGE-SUB )
              dfhcommarea.getLinkAreaM51u().getM51uLinkage().getUOutLineData51(workFields.getChargeSub() - 1).setUOutLineChargeAmt51(mcrCheckTable.getMcrLineCharge());
  
          }
      
      }
      /**
      * commonIoCall 
      *   This method is derived from 
  *   COBOL Paragraph - 9960-COMMON-IO-CALL COBOL Cyclomatic complexity - 5
      * Input  :  

      * - ioi02bError                    COBOL Name: IOI-02B-ERROR
      * - w02FnuLineRead                 COBOL Name: W02-FNU-LINE-READ
      *
      * Output :  

      * - w02DsplMsg                     COBOL Name: W02-DSPL-MSG
      * - w02FnuLineRead                 COBOL Name: W02-FNU-LINE-READ
      * - m51uIllogicalCondSw            COBOL Name: M51U-ILLOGICAL-COND-SW
      *
      * @throws CFException
      */
      private void commonIoCall() throws Exception {
      
// *****************************************************************
// *   This section calls a tops module.                           *
// *****************************************************************
// *========================*

// *****Call pnc-02b-online-io using dfheiblk ioi-02b-interface
//  EVALUATE TRUE
          if  ( ioi02bInterface.isIoi02bGood()  ) { 
              ;
          }
          else if  (( ioi02bInterface.isIoi02bBadRequest()  ) || ( ioi02bInterface.isIoi02bNotInitialized()  )) { 
              // MOVE W02-FNU-LINE-READ TO W02-DSPL-MSG
              w02DsplMsgArea.setW02DsplMsg(w02FnuLineRead.toCharArray());
//  PERFORM 11100A-WRITE-TO-SYSM THRU 11100A-EXIT
              writeToSysm();/*11100A-WRITE-TO-SYSM SECTION*/
//  SET M51U-ILLOGICAL-COND TO TRUE
              dfhcommarea.getLinkAreaM51u().getM51uFlags().setM51uIllogicalCondTrue(); 
              
//  PERFORM 8000-DUMP-ABEND THRU 8000-EXIT
              dumpAbend();/*8000-DUMP-ABEND SECTION*/
          }
          else   { 
              ;
          }
      
      }
      /**
      * writeToSysm 
      *   This method is derived from 
  *   COBOL Paragraph - 11100A-WRITE-TO-SYSM SECTION COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void writeToSysm() throws Exception {
      
// *81***************************************************************
// *81                                                              *
// *81 11100A-write-to-sysm                                         *
// *81                                                              *
// *81 business function  :                                         *
// *81 get the absolute time and write it into the queue            *
// *81                                                              *
// *81***************************************************************
// *82***************************************************************
// *82                                                              *
// *82 11100a-write-to-sysm                                         *
// *82                                                              *
// *82 1. gets the time and date of the system and writes it into   *
// *82    the 'sysm' queue                                          *
// *82 2. initialize message,message comp code,reason code and the  *
// *82    correction id                                             *
// *82                                                              *
// *82 calls     :1. 11101-asktime-formatime                        *
// *82                                                              *
// *82***************************************************************
//  PERFORM 11101-ASKTIME-FORMATIME THRU 11101-EXIT
          asktimeFormatime();/*11101-ASKTIME-FORMATIME*/

// *EXEC CICS WRITEQ TD QUEUE   ('SYSM') 
// *  FROM    (W02-DSPL-MSG-AREA) 
// *  LENGTH  (LENGTH OF W02-DSPL-MSG-AREA) 
// *  NOHANDLE 
// *END-EXEC. 
//  WRITEQ TD QUEUE ('SYSM') FROM (W02-DSPL-MSG-AREA) LENGTH (FUNCTION~LENGTH~W02-DSPL-MSG-AREA) NOHANDLE
          // WRITEQ TD QUEUE ('SYSM') FROM (W02-DSPL-MSG-AREA) LENGTH (FUNCTION~LENGTH~W02-DSPL-MSG-AREA) NOHANDLE
          // write trigger queue
          TransactionManager.writeTriggerQueue(getCICSSession(), CONSTANTS.LITERAL_SYSM,w02DsplMsgArea.toCharArray(),-1,"".toCharArray()/*sysId*/);
      
      }
      /**
      * asktimeFormatime 
      *   This method is derived from 
  *   COBOL Paragraph - 11101-ASKTIME-FORMATIME COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void asktimeFormatime() throws Exception {
      
// *81***************************************************************
// *81                                                              *
// *81 11101-Asktime-formatime                                      *
// *81                                                              *
// *81 business function  :                                         *
// *81 this section gets the time and date of the system            *
// *81                                                              *
// *81***************************************************************
// *82***************************************************************
// *82                                                              *
// *82 11101-asktime-formatime                                      *
// *82                                                              *
// *82 1. get the absoulte time and format it                       *
// *82 2. populate the formatted time to the display message area of*
// *82    of the time variable                                      *
// *82                                                              *
// *82 called by :1. 11100a-write-to-sysm                           *
// *82                                                              *
// *82 calls     :none                                              *
// *82                                                              *
// *82***************************************************************

// *EXEC CICS ASKTIME 
// *  ABSTIME (W02-ABSOLUTE-TIME) 
// *END-EXEC. 
//  ASKTIME ABSTIME (W02-ABSOLUTE-TIME)
          // ASKTIME ABSTIME (W02-ABSOLUTE-TIME)
          // ask current time as the number of milliseconds since 00:00 on 1 January 1900
          	      work.setW02AbsoluteTime(TransactionManager.currentTimeMillis(getCICSSession()));

// *EXEC CICS FORMATTIME 
// *  ABSTIME   (W02-ABSOLUTE-TIME) 
// *  TIME      (W02-MQ-TIME) 
// *  TIMESEP 
// *END-EXEC. 
//  FORMATTIME ABSTIME (W02-ABSOLUTE-TIME) TIME (W02-MQ-TIME) TIMESEP
          // FORMATTIME ABSTIME (W02-ABSOLUTE-TIME) TIME (W02-MQ-TIME) TIMESEP
          // format time - based on number of milliseconds since 00:00 on 1 January 1900,
              TransactionManager.setTimeInMillis(getCICSSession(),work.getW02AbsoluteTime());
          	          w02DsplMsgArea.setW02MqTime(TransactionManager.getFormatTimeTIME(getCICSSession(),"TIMESEP"));
      
      }
      /**
      * dumpAbend 
      *   This method is derived from 
  *   COBOL Paragraph - 8000-DUMP-ABEND SECTION COBOL Cyclomatic complexity - 3
      * Input  : None 

      * Output :  

      * - illogicalCond                  COBOL Name: LK-ILLOGICAL-COND
      *
      * @throws CFException
      */
      private void dumpAbend() throws Exception {
      
// *30                           Should not be commnented.          *
// *30                           all elements are also changed.     *
// *81***************************************************************
// *81 8000-dump-abend                                              *
// *81                                                              *
// *81 business function:                                           *
// *81 dump process per task.                                       *
// *81***************************************************************
// *82***************************************************************
// *82 8000-dump-abend                                              *
// *82                                                              *
// *82 1. rollback, dump and return the control to main calling     *
// *82    program.                                                  *
// *82                                                              *
// *82 called by:                                                   *
// *82 calls    : none                                              *
// *82***************************************************************

// *EXEC CICS SYNCPOINT ROLLBACK 
// *END-EXEC. 
//  SYNCPOINT ROLLBACK
          // SYNCPOINT ROLLBACK
          
          // Establish a syncpoint
          TransactionManager.syncpoint(getCICSSession(), true/*toRollback*/, db2Base);
//  SET ILLOGICAL-COND TO TRUE
          work.setIllogicalCond1True(); 
          

// *EXEC CICS DUMP 
// *  DUMPCODE('BTMQ') 
// *END-EXEC 
//  DUMP DUMPCODE('BTMQ')
          CFUtil.generateDump();

// ***  Goback.
//  IF ILLOGICAL-COND
          if ( work.isIllogicalCond1()  ) { 
//  GOBACK
              setNotLogged(false); // no need to log, it is a normal termination
              this.setProgramEnded(true);
              return ;
          }
      
      }
      /**
      * convertProcToSvcCd 
      *   This method is derived from 
  *   COBOL Paragraph - CONVERT-PROC-TO-SVC-CD SECTION COBOL Cyclomatic complexity - 55
      * Input  :  

      * - ctlCntId1                      COBOL Name: CTL-CNT-ID1
      * - csvcP1st5                      COBOL Name: CSVC-P-1ST-5
      * - csvcPLst1                      COBOL Name: CSVC-P-LST-1
      * - csvcPLst1A                     COBOL Name: CSVC-P-LST-1-A
      *
      * Output :  

      * - csvcCode1st5                   COBOL Name: CSVC-CODE-1ST-5
      * - csvcCodeLst1                   COBOL Name: CSVC-CODE-LST-1
      * - csvcCode6A                     COBOL Name: CSVC-CODE-6-A
      * - csvcPLst1                      COBOL Name: CSVC-P-LST-1
      * - csvcCode15A                    COBOL Name: CSVC-CODE-1-5-A
      * - csvcCode                       COBOL Name: CSVC-CODE
      *
      * @throws CFException
      */
      private void convertProcToSvcCd() throws Exception {
			// Declare local variables used in the method
			char[] ctlCntId1 = null;
			// End of variable declaration

      
// *****************************************************************
// * Version: nov.93    date: 08/30/93  init: lrd ; new cpt4 mods  *
// * version: dec.02    date: 09/11/02  init: ram ; mod 8/9  mods  *
// *****************************************************************
// ******** convert procedure code to service code ******************
// *                                                                *
// *        if a service code is numeric it is really a procedure   *
// *        code.  this module takes a procedure code and converts  *
// *        it to a service code.                                   *
// *                                                                *
// ******************************************************************
          ctlCntId1 = workFields.getCtlCntId1();
//  IF CTL-CNT-ID1 EQUAL 'V'
//  LITERAL_V = 'V'
          if (compareChars(ctlCntId1, CONSTANTS.LITERAL_V) == 0) { 
//cobolCode::GO TO CONVERT-PROC-EXIT
return ;
//cobolCodeEnds::GO TO CONVERT-PROC-EXIT
          }
  
//  EVALUATE TRUE
          if  ( csvcProc.isCsvcSurgAnes()   &&  csvcProc.isCsvcSurgDigit()  ) { 
              // MOVE '10000' TO CSVC-CODE-1ST-5
              csvcCodeGroup.getCsvcCode().setCsvcCode1st5((long)10000);
//  MOVE '0' TO CSVC-CODE-LST-1
//  LITERAL_0 = '0'
              csvcCodeGroup.getCsvcCode().setCsvcCodeLst1(0);
          }
          else if  ( csvcProc.isCsvcSurgAnes()   &&  csvcProc.isCsvcAnesDigit()  ) { 
              // MOVE '10000' TO CSVC-CODE-1ST-5
              csvcCodeGroup.getCsvcCode().setCsvcCode1st5((long)10000);
//  MOVE '4' TO CSVC-CODE-LST-1
              csvcCodeGroup.getCsvcCode().setCsvcCodeLst1(4);
          }
          else if  ( csvcProc.isCsvcSurgAnes()   &&  csvcProc.isCsvcSurgAnesDigit()  ) { 
              // MOVE '10000' TO CSVC-CODE-1ST-5
              csvcCodeGroup.getCsvcCode().setCsvcCode1st5((long)10000);
//  MOVE CSVC-P-LST-1 TO CSVC-CODE-6-A
              csvcCodeGroup.getCsvcCodeA().setCsvcCode6A(csvcProc.getCsvcPLst1());
          }
          else if  ( csvcProc.isCsvcDiagXray()   &&  csvcProc.isCsvcLabXrayDigit()  ) { 
              // MOVE '70000' TO CSVC-CODE-1-5-A
              //  LITERAL_70000 = '70000'
              csvcCodeGroup.getCsvcCodeA().setCsvcCode15A(CONSTANTS.LITERAL_70000);
//  MOVE SPACE TO CSVC-CODE-6-A
              csvcCodeGroup.getCsvcCodeA().setCsvcCode6A(CONSTANTS.SPACE);
          }
          else if  ( csvcProc.isCsvcRadiotherapy1()   &&  csvcProc.isCsvcBlank()  ) { 
              // MOVE '77000' TO CSVC-CODE-1-5-A
              //  LITERAL_77000 = '77000'
              csvcCodeGroup.getCsvcCodeA().setCsvcCode15A(CONSTANTS.LITERAL_77000);
//  MOVE SPACE TO CSVC-CODE-6-A
              csvcCodeGroup.getCsvcCodeA().setCsvcCode6A(CONSTANTS.SPACE);
          }
          else if  ( csvcProc.isCsvcRadiotherapy2()   &&  csvcProc.isCsvcBlank()  ) { 
              // MOVE '77000' TO CSVC-CODE-1-5-A
              //  LITERAL_77000 = '77000'
              csvcCodeGroup.getCsvcCodeA().setCsvcCode15A(CONSTANTS.LITERAL_77000);
//  MOVE SPACE TO CSVC-CODE-6-A
              csvcCodeGroup.getCsvcCodeA().setCsvcCode6A(CONSTANTS.SPACE);
          }
          else if  ( csvcProc.isCsvcLab()   &&  csvcProc.isCsvcLabXrayDigit()  ) { 
              // MOVE '80000' TO CSVC-CODE-1-5-A
              //  LITERAL_80000 = '80000'
              csvcCodeGroup.getCsvcCodeA().setCsvcCode15A(CONSTANTS.LITERAL_80000);
//  MOVE SPACE TO CSVC-CODE-6-A
              csvcCodeGroup.getCsvcCodeA().setCsvcCode6A(CONSTANTS.SPACE);
          }
          else if  ( csvcProc.isCsvcMedVisit1()   &&  csvcProc.isCsvcMedX()  ) { 
              // MOVE '90000' TO CSVC-CODE-1-5-A
              //  LITERAL_90000 = '90000'
              csvcCodeGroup.getCsvcCodeA().setCsvcCode15A(CONSTANTS.LITERAL_90000);
//  MOVE SPACE TO CSVC-CODE-6-A
              csvcCodeGroup.getCsvcCodeA().setCsvcCode6A(CONSTANTS.SPACE);
          }
          else if  ( csvcProc.isCsvcMedVisit2()   &&  csvcProc.isCsvcMedX()  ) { 
              // MOVE '90100' TO CSVC-CODE-1-5-A
              //  LITERAL_90100 = '90100'
              csvcCodeGroup.getCsvcCodeA().setCsvcCode15A(CONSTANTS.LITERAL_90100);
//  MOVE SPACE TO CSVC-CODE-6-A
              csvcCodeGroup.getCsvcCodeA().setCsvcCode6A(CONSTANTS.SPACE);
          }
          else if  ( csvcProc.isCsvcHospMedVisit1()   &&  csvcProc.isCsvcMedX()  ) { 
              // MOVE '90200' TO CSVC-CODE-1-5-A
              //  LITERAL_90200 = '90200'
              csvcCodeGroup.getCsvcCodeA().setCsvcCode15A(CONSTANTS.LITERAL_90200);
//  MOVE SPACE TO CSVC-CODE-6-A
              csvcCodeGroup.getCsvcCodeA().setCsvcCode6A(CONSTANTS.SPACE);
          }
          else if  ( csvcProc.isCsvcMedVisit3()   &&  csvcProc.isCsvcMedX()  ) { 
              // MOVE '90300' TO CSVC-CODE-1-5-A
              //  LITERAL_90300 = '90300'
              csvcCodeGroup.getCsvcCodeA().setCsvcCode15A(CONSTANTS.LITERAL_90300);
//  MOVE SPACE TO CSVC-CODE-6-A
              csvcCodeGroup.getCsvcCodeA().setCsvcCode6A(CONSTANTS.SPACE);
          }
          else if  ( csvcProc.isCsvcHospMedVisit2()   &&  csvcProc.isCsvcMedX()  ) { 
              // MOVE '90500' TO CSVC-CODE-1-5-A
              //  LITERAL_90500 = '90500'
              csvcCodeGroup.getCsvcCodeA().setCsvcCode15A(CONSTANTS.LITERAL_90500);
//  MOVE SPACE TO CSVC-CODE-6-A
              csvcCodeGroup.getCsvcCodeA().setCsvcCode6A(CONSTANTS.SPACE);
          }
          else if  ( csvcProc.isCsvcConsultation()   &&  csvcProc.isCsvcDigit0()  ) { 
              // MOVE '90600' TO CSVC-CODE-1-5-A
              //  LITERAL_90600 = '90600'
              csvcCodeGroup.getCsvcCodeA().setCsvcCode15A(CONSTANTS.LITERAL_90600);
              // MOVE '0' TO CSVC-CODE-6-A
              //  LITERAL_0 = '0'
              csvcCodeGroup.getCsvcCodeA().setCsvcCode6A(CONSTANTS.LITERAL_0);
          }
          else if  ( csvcProc.isCsvcConsultation()   &&  csvcProc.isCsvcDigit1()  ) { 
              // MOVE '90600' TO CSVC-CODE-1-5-A
              //  LITERAL_90600 = '90600'
              csvcCodeGroup.getCsvcCodeA().setCsvcCode15A(CONSTANTS.LITERAL_90600);
              // MOVE '1' TO CSVC-CODE-6-A
              //  LITERAL_1 = '1'
              csvcCodeGroup.getCsvcCodeA().setCsvcCode6A(CONSTANTS.LITERAL_1);
          }
          else if  ( csvcProc.isCsvcPsycThrpy()   &&  csvcProc.isCsvcBlank()  ) { 
              // MOVE '90800' TO CSVC-CODE-1-5-A
              //  LITERAL_90800 = '90800'
              csvcCodeGroup.getCsvcCodeA().setCsvcCode15A(CONSTANTS.LITERAL_90800);
//  MOVE SPACE TO CSVC-CODE-6-A
              csvcCodeGroup.getCsvcCodeA().setCsvcCode6A(CONSTANTS.SPACE);
          }
          else if  ( csvcProc.isCsvcPhysMed()   &&  csvcProc.isCsvcBlank()  ) { 
              // MOVE '97000' TO CSVC-CODE-1-5-A
              //  LITERAL_97000 = '97000'
              csvcCodeGroup.getCsvcCodeA().setCsvcCode15A(CONSTANTS.LITERAL_97000);
//  MOVE SPACE TO CSVC-CODE-6-A
              csvcCodeGroup.getCsvcCodeA().setCsvcCode6A(CONSTANTS.SPACE);
          }
          else if  ( csvcProc.isCsvcDialysis()   &&  csvcProc.isCsvcBlank()  ) { 
              // MOVE '90935' TO CSVC-CODE-1-5-A
              //  LITERAL_90935 = '90935'
              csvcCodeGroup.getCsvcCodeA().setCsvcCode15A(CONSTANTS.LITERAL_90935);
//  MOVE SPACE TO CSVC-CODE-6-A
              csvcCodeGroup.getCsvcCodeA().setCsvcCode6A(CONSTANTS.SPACE);
          }
          else if  (( csvcProc.isCsvcDiagServices()   &&  csvcProc.isCsvcDiagSerDigit()  )) { 
              // MOVE '91000' TO CSVC-CODE-1-5-A
              //  LITERAL_91000 = '91000'
              csvcCodeGroup.getCsvcCodeA().setCsvcCode15A(CONSTANTS.LITERAL_91000);
//  MOVE SPACE TO CSVC-CODE-6-A
              csvcCodeGroup.getCsvcCodeA().setCsvcCode6A(CONSTANTS.SPACE);
          }
          else if  ( csvcProc.isCsvcNucMedicine()   &&  csvcProc.isCsvcBlank()  ) { 
              // MOVE '78000' TO CSVC-CODE-1-5-A
              //  LITERAL_78000 = '78000'
              csvcCodeGroup.getCsvcCodeA().setCsvcCode15A(CONSTANTS.LITERAL_78000);
//  MOVE SPACE TO CSVC-CODE-6-A
              csvcCodeGroup.getCsvcCodeA().setCsvcCode6A(CONSTANTS.SPACE);
          }
          else if  ( csvcProc.isCsvcIntenseMed()   &&  csvcProc.isCsvcBlank()  ) { 
              // MOVE '99160' TO CSVC-CODE-1-5-A
              //  LITERAL_99160 = '99160'
              csvcCodeGroup.getCsvcCodeA().setCsvcCode15A(CONSTANTS.LITERAL_99160);
//  MOVE SPACE TO CSVC-CODE-6-A
              csvcCodeGroup.getCsvcCodeA().setCsvcCode6A(CONSTANTS.SPACE);
          }
          else if  ( csvcProc.isCsvcImmunization()   &&  csvcProc.isCsvcBlank()  ) { 
              // MOVE '90700' TO CSVC-CODE-1-5-A
              //  LITERAL_90700 = '90700'
              csvcCodeGroup.getCsvcCodeA().setCsvcCode15A(CONSTANTS.LITERAL_90700);
//  MOVE SPACE TO CSVC-CODE-6-A
              csvcCodeGroup.getCsvcCodeA().setCsvcCode6A(CONSTANTS.SPACE);
          }
          else if  ( csvcProc.isCsvcPreventativeMed()   &&  csvcProc.isCsvcBlank()  ) { 
              // MOVE '90750' TO CSVC-CODE-1-5-A
              //  LITERAL_90750 = '90750'
              csvcCodeGroup.getCsvcCodeA().setCsvcCode15A(CONSTANTS.LITERAL_90750);
//  MOVE SPACE TO CSVC-CODE-6-A
              csvcCodeGroup.getCsvcCodeA().setCsvcCode6A(CONSTANTS.SPACE);
          }
          else if  ( csvcProc.isCsvcInjections()   &&  csvcProc.isCsvcBlank()  ) { 
              // MOVE '90780' TO CSVC-CODE-1-5-A
              //  LITERAL_90780 = '90780'
              csvcCodeGroup.getCsvcCodeA().setCsvcCode15A(CONSTANTS.LITERAL_90780);
//  MOVE SPACE TO CSVC-CODE-6-A
              csvcCodeGroup.getCsvcCodeA().setCsvcCode6A(CONSTANTS.SPACE);
          }
          else if  ( csvcProc.isCsvcSpeechThrpy()   &&  csvcProc.isCsvcBlank()  ) { 
              // MOVE '92507' TO CSVC-CODE-1-5-A
              //  LITERAL_92507 = '92507'
              csvcCodeGroup.getCsvcCodeA().setCsvcCode15A(CONSTANTS.LITERAL_92507);
//  MOVE SPACE TO CSVC-CODE-6-A
              csvcCodeGroup.getCsvcCodeA().setCsvcCode6A(CONSTANTS.SPACE);
          }
          else if  ( csvcProc.isCsvcChemotherapy()   &&  csvcProc.isCsvcBlank()  ) { 
              // MOVE '96500' TO CSVC-CODE-1-5-A
              //  LITERAL_96500 = '96500'
              csvcCodeGroup.getCsvcCodeA().setCsvcCode15A(CONSTANTS.LITERAL_96500);
//  MOVE SPACE TO CSVC-CODE-6-A
              csvcCodeGroup.getCsvcCodeA().setCsvcCode6A(CONSTANTS.SPACE);
          }
          else if  ( csvcProc.isCsvcSpecMedServices()   &&  csvcProc.isCsvcBlank()  ) { 
              // MOVE '29130' TO CSVC-CODE-1-5-A
              //  LITERAL_29130 = '29130'
              csvcCodeGroup.getCsvcCodeA().setCsvcCode15A(CONSTANTS.LITERAL_29130);
//  MOVE SPACE TO CSVC-CODE-6-A
              csvcCodeGroup.getCsvcCodeA().setCsvcCode6A(CONSTANTS.SPACE);
          }
          else   { 
//  MOVE '999999' TO CSVC-CODE
//  LITERAL_999999 = '999999'
              csvcCodeGroup.setCsvcCode(CONSTANTS.LITERAL_999999);
          }
      
      }
      /**
      * readGenSysSwitch 
      *   This method is derived from 
  *   COBOL Paragraph - 1800-READ-GEN-SYS-SWITCH SECTION COBOL Cyclomatic complexity - 3
      * Input  : None 

      * Output :  

      * - newSpiSw                       COBOL Name: WS-NEW-SPI-SW
      * - feSpiEnableInd                 COBOL Name: FE-SPI-ENABLE-IND
      * - fePrimeSpiEnableInd            COBOL Name: FE-PRIME-SPI-ENABLE-IND
      * - primeSpiSw                     COBOL Name: WS-PRIME-SPI-SW
      *
      * @throws CFException
      */
      private void readGenSysSwitch() throws Exception {
      
// *82 Calls     : 1. d5427rst program                              *
// *82***************************************************************
//  INITIALIZE WS-NEW-SPI-SW
          work.setNewSpiSw(CONSTANTS.SPACE /* Fill 1 Spaces*/);

// *    Perform 1810-gen-sys-restart thru 1810-exit.
//  SET FE-SPI-ENABLED TO TRUE
          work.setFeSpiEnabledTrue(); 
          
//  SET FE-PRIME-SPI-ENABLED TO TRUE
          work.setFePrimeSpiEnabledTrue(); 
          
//  EVALUATE TRUE
          if  ( work.isFeSpiEnabled()  ) { 
//  SET FE-SPI-TURNED-ON TO TRUE
              work.setFeSpiTurnedOnTrue(); 
              
          }

// *        When fe-spi-disabled
// *           set fe-spi-turned-off to true
//  EVALUATE TRUE
          if  ( work.isFePrimeSpiEnabled()  ) { 
//  SET FE-PRIME-SPI-TURNED-ON TO TRUE
              work.setFePrimeSpiTurnedOnTrue(); 
              
          }
      
      }
      /**
      * readPlanAltDb2 
      *   This method is derived from 
  *   COBOL Paragraph - 2010D-READ-PLAN-ALT-DB2 SECTION COBOL Cyclomatic complexity - 10
      * Input  :  

      * - uPolicyNo51                    COBOL Name: LK-51U-POLICY-NO
      * - uPlanVar51                     COBOL Name: LK-51U-PLAN-VAR
      * - planVarPrev                    COBOL Name: WS-PLAN-VAR-PREV
      * - uLineDosDate51                 COBOL Name: LK-51U-LINE-DOS-DATE
      * - planDosYy                      COBOL Name: WS-PLAN-DOS-YY
      * - planDosMm                      COBOL Name: WS-PLAN-DOS-MM
      * - planDosDd                      COBOL Name: WS-PLAN-DOS-DD
      * - planDate                       COBOL Name: WS-PLAN-DATE
      * - sub                            COBOL Name: WS-SUB
      * - d51uPlnvCnt                    COBOL Name: D51U-PLNV-CNT
      * - endOfPlanAlt                   COBOL Name: WS-END-OF-PLAN-ALT
      * - d51uInvReason                  COBOL Name: D51U-INV-REASON
      * - d51uSqlOrRespCd                COBOL Name: D51U-SQL-OR-RESP-CD
      * - withMmiSw2010                  COBOL Name: WS-2010-WITH-MMI-SW
      *
      * Output :  

      * - paragraph                      COBOL Name: WS-PARAGRAPH
      * - planVarFoundSw                 COBOL Name: WS-PLAN-VAR-FOUND-SW
      * - dSub                           COBOL Name: D-SUB
      * - fesaPolicy                     COBOL Name: FESA-POLICY
      * - uPolicyNo51                    COBOL Name: LK-51U-POLICY-NO
      * - fesaPlanVar                    COBOL Name: FESA-PLAN-VAR
      * - uPlanVar51                     COBOL Name: LK-51U-PLAN-VAR
      * - fesaEffDate                    COBOL Name: FESA-EFF-DATE
      * - fesaSpiNbr                     COBOL Name: FESA-SPI-NBR
      * - dsmCallArea                    COBOL Name: DSM-CALL-AREA
      * - d51uRequestFields              COBOL Name: D51U-REQUEST-FIELDS
      * - d51uReturnCode                 COBOL Name: D51U-RETURN-CODE
      * - dsmFuncCd                      COBOL Name: DSM-FUNC-CD
      * - d51uReqFuncCd                  COBOL Name: D51U-REQ-FUNC-CD
      * - d51uKeyPolicy                  COBOL Name: D51U-KEY-POLICY
      * - d51uKeyPlan                    COBOL Name: D51U-KEY-PLAN
      * - planVarPrev                    COBOL Name: WS-PLAN-VAR-PREV
      * - d51uKeyStatus                  COBOL Name: D51U-KEY-STATUS
      * - d51uKeyFeSpi                   COBOL Name: D51U-KEY-FE-SPI
      * - d51uReqCallingProgram          COBOL Name: D51U-REQ-CALLING-PROGRAM
      * - d51uReqCallerType              COBOL Name: D51U-REQ-CALLER-TYPE
      * - planDosDate                    COBOL Name: WS-PLAN-DOS-DATE
      * - uLineDosDate51                 COBOL Name: LK-51U-LINE-DOS-DATE
      * - planYy                         COBOL Name: WS-PLAN-YY
      * - planDosYy                      COBOL Name: WS-PLAN-DOS-YY
      * - planCc                         COBOL Name: WS-PLAN-CC
      * - planMm                         COBOL Name: WS-PLAN-MM
      * - planDosMm                      COBOL Name: WS-PLAN-DOS-MM
      * - planDd                         COBOL Name: WS-PLAN-DD
      * - planDosDd                      COBOL Name: WS-PLAN-DOS-DD
      * - d51uReqDosDate                 COBOL Name: D51U-REQ-DOS-DATE
      * - planDate                       COBOL Name: WS-PLAN-DATE
      * - rc                             COBOL Name: RETURN-CODE
      * - w02DsplErrInd                  COBOL Name: W02-DSPL-ERR-IND
      * - d51uInvReason                  COBOL Name: D51U-INV-REASON
      * - w02RespCd                      COBOL Name: W02-RESP-CD
      * - d51uSqlOrRespCd                COBOL Name: D51U-SQL-OR-RESP-CD
      * - w02AbendingProg                COBOL Name: W02-ABENDING-PROG
      * - w02MainProg                    COBOL Name: W02-MAIN-PROG
      * - m51uIllogicalCondSw            COBOL Name: M51U-ILLOGICAL-COND-SW
      * - mmiFoundSw                     COBOL Name: WS-MMI-FOUND-SW
      *
      * @throws CFException
      */
      private void readPlanAltDb2() throws Exception {
			// Declare local variables used in the method
			M51uLinkage m51uLinkage = dfhcommarea.getLinkAreaM51u().getM51uLinkage();
			FesaKey fesaKey = feSpiAltPlanRecord.getFesaKey();
			D51uNonArrayData d51uNonArrayData = vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData();
			DsmCommonArea dsmCommonArea = dsmCallArea.getDsmCommonArea();
			D51uKey d51uKey = vyspi51uCallArea.getD51uRequestFields().getD51uKey();
			D51uRequestFields d51uRequestFields = vyspi51uCallArea.getD51uRequestFields();
			PlanDosDt planDosDt = workFields.getPlanDosDt();
			PlanDt planDt = workFields.getPlanDt();
			int planYy = 0;
			int d51uPlnvCnt = 0;
			D51uOtherReq d51uOtherReq = vyspi51uCallArea.getD51uRequestFields().getD51uOtherReq();
			D51uTableCounts d51uTableCounts = vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().getD51uTableCounts();
			D51uErrorTrace d51uErrorTrace = vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uErrorTrace();
			// End of variable declaration

      
// *81***************************************************************
// *81 2010D-read-plan-alt-db2                                      *
// *81                                                              *
// *81 business function:                                           *
// *81 this section of the program will start the read  plan        *
// *81 variation file.                                              *
// *81***************************************************************
// *82***************************************************************
// *82 2010d-read-plan-alt-db2                                      *
// *82                                                              *
// *82 1. start browsing the plan alternative file. if the record is*
// *82    not found,exit the section. if any other error occurs,    *
// *82    display the error and abort the program.                  *
// *82 2. if the browse is successful, build and populate a table   *
// *82    to store the policy number, plan dates and plan variables.*
// *82 3. populate the working storage variables for the generic    *
// *82    translators and the additional translators.               *
// *82***************************************************************
//  MOVE '2010D' TO WS-PARAGRAPH
//  LITERAL_2010D = '2010D'
          workFields.setParagraph(CONSTANTS.LITERAL_2010D);
          // MOVE 'N' TO WS-PLAN-VAR-FOUND-SW
          //  LITERAL_N = 'N'
          work.setPlanVarFoundSw(CONSTANTS.LITERAL_N);
//  MOVE 0 TO D-SUB
//  LITERAL_0 = 0
          work.setDSub(0);
//  MOVE LK-51U-POLICY-NO TO FESA-POLICY
          fesaKey.setFesaPolicy(m51uLinkage.getUPolicyNo51());
  
//  MOVE LK-51U-PLAN-VAR TO FESA-PLAN-VAR
          fesaKey.setFesaPlanVar(m51uLinkage.getUPlanVar51());
  
//  MOVE ZEROS TO FESA-EFF-DATE FESA-SPI-NBR
          fesaKey.setFesaEffDate(0);
          fesaKey.setFesaSpiNbr(0);
  
//  INITIALIZE DSM-CALL-AREA D51U-REQUEST-FIELDS D51U-RETURN-CODE
          dsmCallArea.initialize();
          vyspi51uCallArea.getD51uRequestFields().initialize();
          d51uNonArrayData.setD51uReturnCode(0);
  

// *45917S          vyspi51u-call-area.
          // MOVE 01 TO DSM-FUNC-CD
          dsmCallArea.getDsmCommonArea().setDsmFuncCd(1);
  
//  SET D51U-REQ-SELECT-PLAN TO TRUE
          vyspi51uCallArea.getD51uRequestFields().setD51uReqSelectPlanTrue(); 
          
//  MOVE LK-51U-POLICY-NO TO D51U-KEY-POLICY
          d51uKey.setD51uKeyPolicy(m51uLinkage.getUPolicyNo51());
  
//  MOVE WS-PLAN-VAR-PREV TO D51U-KEY-PLAN
          d51uKey.setD51uKeyPlan(String.valueOf(CFUtil.pad(4,String.valueOf(workFields.getPlanVarPrev()),"0",CFUtil.LEFT_PAD)).toCharArray());
  
//  MOVE 'A' TO D51U-KEY-STATUS
//  LITERAL_A = 'A'
          d51uKey.setD51uKeyStatus(CONSTANTS.LITERAL_A);
  
//  MOVE FESA-SPI-NBR TO D51U-KEY-FE-SPI
          d51uKey.setD51uKeyFeSpi(String.valueOf(CFUtil.pad(7,String.valueOf(fesaKey.getFesaSpiNbr()),"0",CFUtil.LEFT_PAD)).toCharArray());
  
//  MOVE 'O529351U' TO D51U-REQ-CALLING-PROGRAM
//  LITERAL_O529351U = 'O529351U'
          d51uRequestFields.setD51uReqCallingProgram(CONSTANTS.LITERAL_O529351U);
  
//  SET D51U-REQ-CALLER-ONLINE TO TRUE
          vyspi51uCallArea.getD51uRequestFields().setD51uReqCallerOnlineTrue(); 
          
//  MOVE LK-51U-LINE-DOS-DATE ( LK-SUB ) TO WS-PLAN-DOS-DATE
          workFields.setPlanDosDate( dfhcommarea.getLinkAreaM51u().getM51uLinkage().getULineData51(work.getSub01() - 1).getULineDosDate51());
//  MOVE WS-PLAN-DOS-YY TO WS-PLAN-YY
          planDt.setPlanYy(planDosDt.getPlanDosYy());
  
          planYy = planDt.getPlanYy();
//  IF WS-PLAN-YY > 50
          if (	( planYy > 50 )) { 
              // MOVE 19 TO WS-PLAN-CC
              workFields.getPlanDt().setPlanCc(19);
  
          }
  
//  ELSE
          else { 
              // MOVE 20 TO WS-PLAN-CC
              workFields.getPlanDt().setPlanCc(20);
  
          }
//  MOVE WS-PLAN-DOS-MM TO WS-PLAN-MM
          planDt.setPlanMm(planDosDt.getPlanDosMm());
  
//  MOVE WS-PLAN-DOS-DD TO WS-PLAN-DD
          planDt.setPlanDd(planDosDt.getPlanDosDd());
  
//  MOVE WS-PLAN-DATE TO D51U-REQ-DOS-DATE
          d51uOtherReq.setD51uReqDosDate(String.valueOf(workFields.getPlanDateString()).toCharArray());
  
//  CALL WS-D529351U-DB2-DSM USING DSM-CALL-AREA VYSPI51U-CALL-AREA
          // CALL WS-D529351U-DB2-DSM USING DSM-CALL-AREA VYSPI51U-CALL-AREA
               this.setRc( d529351u.call(dsmCallArea,vyspi51uCallArea));
          d51uNonArrayData = vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData();
//  EVALUATE TRUE
          if  ( d51uNonArrayData.isD51uGoodReturn()  ) { 
//  PERFORM 2020D-BUILD-PLAN-ALT-TABLE THRU 2020D-EXIT UNTIL WS-SUB > D51U-PLNV-CNT OR END-OF-PLAN-ALT OR WS-SUB > 9999
              while (	( work.getSub() <= d51uTableCounts.getD51uPlnvCnt() ) && !(work.isEndOfPlanAlt1())  && 	( work.getSub() <= 9999 )) {
                 buildPlanAltTable2020D();/*2020D-BUILD-PLAN-ALT-TABLE SECTION*/
                 if (this.isProgramEnded()) {
                     return ;
                 }
              }
  
          }
          else if  ( d51uNonArrayData.isD51uNotFound()  ) { 
              ;
          }
          else if  ( d51uNonArrayData.isD51uDb2Error()  ) { 
//  MOVE D51U-INV-REASON TO W02-DSPL-ERR-IND
              w02DsplMsgArea.setW02DsplErrInd(String.valueOf(d51uNonArrayData.getD51uInvReasonString()).toCharArray());
  
//  MOVE D51U-SQL-OR-RESP-CD TO W02-RESP-CD
              w02DsplMsgArea.setW02RespCd(CFUtil.getLong(d51uErrorTrace.getD51uSqlOrRespCd()));
  
//  MOVE 'D529351U' TO W02-ABENDING-PROG
//  LITERAL_D529351U = 'D529351U'
              w02DsplMsgArea.setW02AbendingProg(CONSTANTS.LITERAL_D529351U);
//  MOVE 'PLN' TO W02-MAIN-PROG
//  LITERAL_PLN = 'PLN'
              w02DsplMsgArea.setW02MainProg(CONSTANTS.LITERAL_PLN);
//  PERFORM 11100A-WRITE-TO-SYSM THRU 11100A-EXIT
              writeToSysm();/*11100A-WRITE-TO-SYSM SECTION*/
              if (this.isProgramEnded()) {
                  return ;
              }
//  SET M51U-ILLOGICAL-COND TO TRUE
              dfhcommarea.getLinkAreaM51u().getM51uFlags().setM51uIllogicalCondTrue(); 
              
//  PERFORM 8000-DUMP-ABEND THRU 8000-EXIT
              dumpAbend();/*8000-DUMP-ABEND SECTION*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
  
          d51uPlnvCnt = d51uTableCounts.getD51uPlnvCnt();
//  IF D51U-PLNV-CNT = ZEROES AND 2010-WITH-MMI-POL
          if (	( d51uPlnvCnt == 0 ) &&  work.isWithMmiPol2010()  ) { 
//  SET MMI-ALT-NOT-FOUND TO TRUE
              work.setMmiAltNotFoundTrue(); 
              
//cobolCode::GO TO 2010D-EXIT
return ;
//cobolCodeEnds::GO TO 2010D-EXIT
          }
  
//  PERFORM 2013-NEW-SPI-TRANSLATION THRU 2013-EXIT
          newSpiTranslation();/*2013-NEW-SPI-TRANSLATION*/
//  PERFORM 2015-GENERIC-TRANSLATION THRU 2015-EXIT
          genericTranslation();/*2015-GENERIC-TRANSLATION*/
          ;
      
      }
      /**
      * buildPlanAltTable2020D 
      *   This method is derived from 
  *   COBOL Paragraph - 2020D-BUILD-PLAN-ALT-TABLE SECTION COBOL Cyclomatic complexity - 3
      * Input  :  

      * - dSub                           COBOL Name: D-SUB
      * - d51uRetPolicy                  COBOL Name: D51U-RET-POLICY
      * - polNo                          COBOL Name: WS-POL-NO
      * - d51uRetPlan                    COBOL Name: D51U-RET-PLAN
      * - planVarPrev                    COBOL Name: WS-PLAN-VAR-PREV
      * - d51uRetFeSpi                   COBOL Name: D51U-RET-FE-SPI
      * - d51uRetPosTierCd               COBOL Name: D51U-RET-POS-TIER-CD
      * - d51uRetPriDiagInd              COBOL Name: D51U-RET-PRI-DIAG-IND
      * - d51uRetDiagElgInd              COBOL Name: D51U-RET-DIAG-ELG-IND
      * - sub                            COBOL Name: WS-SUB
      * - nbrOfPlanVar                   COBOL Name: WS-NBR-OF-PLAN-VAR
      *
      * Output :  

      * - dSub                           COBOL Name: D-SUB
      * - fesaPolicy01                   COBOL Name: WS-FESA-POLICY
      * - d51uRetPolicy                  COBOL Name: D51U-RET-POLICY
      * - fesaPlanVar01                  COBOL Name: WS-FESA-PLAN-VAR
      * - d51uRetPlan                    COBOL Name: D51U-RET-PLAN
      * - fesaSpiNbr01                   COBOL Name: WS-FESA-SPI-NBR
      * - d51uRetFeSpi                   COBOL Name: D51U-RET-FE-SPI
      * - fesaPosTierCd                  COBOL Name: WS-FESA-POS-TIER-CD
      * - d51uRetPosTierCd               COBOL Name: D51U-RET-POS-TIER-CD
      * - fesaSpiPriDiagInd              COBOL Name: WS-FESA-SPI-PRI-DIAG-IND
      * - d51uRetPriDiagInd              COBOL Name: D51U-RET-PRI-DIAG-IND
      * - fesaSpiDiagElgInd              COBOL Name: WS-FESA-SPI-DIAG-ELG-IND
      * - d51uRetDiagElgInd              COBOL Name: D51U-RET-DIAG-ELG-IND
      * - planVarFoundSw                 COBOL Name: WS-PLAN-VAR-FOUND-SW
      * - sub                            COBOL Name: WS-SUB
      * - nbrOfPlanVar                   COBOL Name: WS-NBR-OF-PLAN-VAR
      *
      * @throws CFException
      */
      private void buildPlanAltTable2020D() throws Exception {
			// Declare local variables used in the method
			D51uRetData d51uRetData = vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetData();
			char[] polNo = null;
			short planVarPrev = 0;
			// End of variable declaration

      
// *82***************************************************************
// *82 2020D-build-plan-alt-table                                   *
// *82                                                              *
// *82 1. read the next record from the plan variation file.        *
// *82    if the record is not found, or the end of file is reached *
// *82    set a switch to indicate the same and exit the section. if*
// *82    any other error occurs, display the error and abort the   *
// *82    program.                                                  *
// *82 2. if the policy number and the plan variable in the record  *
// *82    does not match with the ones in the storage variables,    *
// *82    exit the paragraph,otherwise                              *
// *82    -populate the storage variables with the plan dates.      *
// *82    -check if the date of service falls within the plan       *
// *82     effective date and the cancel date. also add a century   *
// *82     variable to the dates.                                   *
// *82    -built a table to store the policy name, plan variable,   *
// *82     effective date and special processing instructions number*
// *82***************************************************************

// *-------------------------*

// *45917S  if d51u-ret-policy(d-sub)  = spaces or low-values
// *45917s      move 'y' to  ws-end-of-plan-alt
// *45917s      go to 2020d-exit
// *45917s  end-if.
//  ADD 1 TO D-SUB
          work.setDSub(work.getDSub()+1);
          polNo = workFields.getPolNo();
          planVarPrev = workFields.getPlanVarPrev();
//  IF D51U-RET-POLICY ( D-SUB ) = WS-POL-NO AND D51U-RET-PLAN ( D-SUB ) = WS-PLAN-VAR-PREV
          if (		compareChars(d51uRetData.getD51uReturnData(work.getDSub() - 1).getD51uRetPolicy(),polNo) == 0  && 	( d51uRetData.getD51uReturnData(work.getDSub() - 1).getD51uRetPlan() == planVarPrev ) ) { 
//  MOVE D51U-RET-POLICY ( D-SUB ) TO WS-FESA-POLICY ( WS-SUB )
              workFields.getPlanVarInputLines().getPlanVarRec(work.getSub() - 1).setFesaPolicy01(vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetData().getD51uReturnData(work.getDSub() - 1).getD51uRetPolicy());
//  MOVE D51U-RET-PLAN ( D-SUB ) TO WS-FESA-PLAN-VAR ( WS-SUB )
              workFields.getPlanVarInputLines().getPlanVarRec(work.getSub() - 1).setFesaPlanVar01(vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetData().getD51uReturnData(work.getDSub() - 1).getD51uRetPlan());
//  MOVE D51U-RET-FE-SPI ( D-SUB ) TO WS-FESA-SPI-NBR ( WS-SUB )
              workFields.getPlanVarInputLines().getPlanVarRec(work.getSub() - 1).setFesaSpiNbr01(CFUtil.getInt(vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetData().getD51uReturnData(work.getDSub() - 1).getD51uRetFeSpi()));
//  MOVE D51U-RET-POS-TIER-CD ( D-SUB ) TO WS-FESA-POS-TIER-CD ( WS-SUB )
              workFields.getPlanVarInputLines().getPlanVarRec(work.getSub() - 1).setFesaPosTierCd(vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetData().getD51uReturnData(work.getDSub() - 1).getD51uRetPosTierCd());
//  MOVE D51U-RET-PRI-DIAG-IND ( D-SUB ) TO WS-FESA-SPI-PRI-DIAG-IND ( WS-SUB )
              workFields.getPlanVarInputLines().getPlanVarRec(work.getSub() - 1).setFesaSpiPriDiagInd(vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetData().getD51uReturnData(work.getDSub() - 1).getD51uRetPriDiagInd());
//  MOVE D51U-RET-DIAG-ELG-IND ( D-SUB ) TO WS-FESA-SPI-DIAG-ELG-IND ( WS-SUB )
              workFields.getPlanVarInputLines().getPlanVarRec(work.getSub() - 1).setFesaSpiDiagElgInd(vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetData().getD51uReturnData(work.getDSub() - 1).getD51uRetDiagElgInd());
              // MOVE 'Y' TO WS-PLAN-VAR-FOUND-SW
              //  LITERAL_Y = 'Y'
              work.setPlanVarFoundSw(CONSTANTS.LITERAL_Y);
//  ADD 1 TO WS-SUB WS-NBR-OF-PLAN-VAR
              work.setSub(work.getSub()+1);
              workFields.setNbrOfPlanVar(workFields.getNbrOfPlanVar()+1);
          }
  
      
      }
      /**
      * readSpiRulesDb2 
      *   This method is derived from 
  *   COBOL Paragraph - 2030D-READ-SPI-RULES-DB2 SECTION COBOL Cyclomatic complexity - 6
      * Input  :  

      * - fesaSpiNbr01                   COBOL Name: WS-FESA-SPI-NBR
      * - uIcdVerNbr51                   COBOL Name: LK-51U-ICD-VER-NBR
      * - uCauseCd51                     COBOL Name: LK-51U-CAUSE-CD
      * - uProvType51                    COBOL Name: LK-51U-PROV-TYPE
      * - uLinePos51                     COBOL Name: LK-51U-LINE-POS
      * - uLineServiceCode51             COBOL Name: LK-51U-LINE-SERVICE-CODE
      * - fesaSpiPriDiagInd              COBOL Name: WS-FESA-SPI-PRI-DIAG-IND
      * - sub                            COBOL Name: WS-SUB
      * - uDiagnosisCode51               COBOL Name: LK-51U-DIAGNOSIS-CODE
      * - uCpeDescCd51                   COBOL Name: LK-51U-CPE-DESC-CD
      * - d51uReturnCode                 COBOL Name: D51U-RETURN-CODE
      * - d51uInvReason                  COBOL Name: D51U-INV-REASON
      * - d51uSqlOrRespCd                COBOL Name: D51U-SQL-OR-RESP-CD
      *
      * Output :  

      * - paragraph                      COBOL Name: WS-PARAGRAPH
      * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
      * - dsmCallArea                    COBOL Name: DSM-CALL-AREA
      * - d51uRequestFields              COBOL Name: D51U-REQUEST-FIELDS
      * - dsmFuncCd                      COBOL Name: DSM-FUNC-CD
      * - d51uReqFuncCd                  COBOL Name: D51U-REQ-FUNC-CD
      * - d51uKeyFeSpi                   COBOL Name: D51U-KEY-FE-SPI
      * - fesaSpiNbr01                   COBOL Name: WS-FESA-SPI-NBR
      * - d51uKeyStatus                  COBOL Name: D51U-KEY-STATUS
      * - d51uReqCallingProgram          COBOL Name: D51U-REQ-CALLING-PROGRAM
      * - d51uReqCallerType              COBOL Name: D51U-REQ-CALLER-TYPE
      * - d51uLstClmIcdInd               COBOL Name: D51U-LST-CLM-ICD-IND
      * - d51uTestCaus                   COBOL Name: D51U-TEST-CAUS
      * - uCauseCd51                     COBOL Name: LK-51U-CAUSE-CD
      * - d51uTestProvTyp                COBOL Name: D51U-TEST-PROV-TYP
      * - uProvType51                    COBOL Name: LK-51U-PROV-TYPE
      * - d51uTestPos                    COBOL Name: D51U-TEST-POS
      * - uLinePos51                     COBOL Name: LK-51U-LINE-POS
      * - d51uTestSvcCd                  COBOL Name: D51U-TEST-SVC-CD
      * - uLineServiceCode51             COBOL Name: LK-51U-LINE-SERVICE-CODE
      * - primDiagFound                  COBOL Name: WS-PRIM-DIAG-FOUND
      * - d51uTestDiag01                 COBOL Name: D51U-TEST-DIAG-01
      * - uDiagnosisCode51               COBOL Name: LK-51U-DIAGNOSIS-CODE
      * - d51uTestDiag02                 COBOL Name: D51U-TEST-DIAG-02
      * - d51uTestDiag03                 COBOL Name: D51U-TEST-DIAG-03
      * - d51uTestDiag04                 COBOL Name: D51U-TEST-DIAG-04
      * - d51uTestDiag05                 COBOL Name: D51U-TEST-DIAG-05
      * - d51uTestDiag06                 COBOL Name: D51U-TEST-DIAG-06
      * - d51uTestDiag07                 COBOL Name: D51U-TEST-DIAG-07
      * - d51uTestDiag08                 COBOL Name: D51U-TEST-DIAG-08
      * - d51uTestDiag09                 COBOL Name: D51U-TEST-DIAG-09
      * - d51uTestDiag10                 COBOL Name: D51U-TEST-DIAG-10
      * - d51uTestDiag11                 COBOL Name: D51U-TEST-DIAG-11
      * - d51uTestDiag12                 COBOL Name: D51U-TEST-DIAG-12
      * - d51uTestDiag13                 COBOL Name: D51U-TEST-DIAG-13
      * - d51uTestDiag14                 COBOL Name: D51U-TEST-DIAG-14
      * - d51uTestDiag15                 COBOL Name: D51U-TEST-DIAG-15
      * - d51uTestDiag16                 COBOL Name: D51U-TEST-DIAG-16
      * - d51uTestDiag17                 COBOL Name: D51U-TEST-DIAG-17
      * - d51uTestDiag18                 COBOL Name: D51U-TEST-DIAG-18
      * - d51uTestDiag19                 COBOL Name: D51U-TEST-DIAG-19
      * - d51uTestDiag20                 COBOL Name: D51U-TEST-DIAG-20
      * - d51uTestDiag21                 COBOL Name: D51U-TEST-DIAG-21
      * - d51uTestDiag22                 COBOL Name: D51U-TEST-DIAG-22
      * - d51uTestDiag23                 COBOL Name: D51U-TEST-DIAG-23
      * - d51uTestDiag24                 COBOL Name: D51U-TEST-DIAG-24
      * - d51uTestDiag25                 COBOL Name: D51U-TEST-DIAG-25
      * - d51uTestCpeDescCd              COBOL Name: D51U-TEST-CPE-DESC-CD
      * - uCpeDescCd51                   COBOL Name: LK-51U-CPE-DESC-CD
      * - rc                             COBOL Name: RETURN-CODE
      * - w02DsplErrInd                  COBOL Name: W02-DSPL-ERR-IND
      * - d51uInvReason                  COBOL Name: D51U-INV-REASON
      * - w02RespCd                      COBOL Name: W02-RESP-CD
      * - d51uSqlOrRespCd                COBOL Name: D51U-SQL-OR-RESP-CD
      * - w02AbendingProg                COBOL Name: W02-ABENDING-PROG
      * - w02MainProg                    COBOL Name: W02-MAIN-PROG
      * - m51uIllogicalCondSw            COBOL Name: M51U-ILLOGICAL-COND-SW
      *
      * @throws CFException
      */
      private void readSpiRulesDb2() throws Exception {
			// Declare local variables used in the method
			DsmCommonArea dsmCommonArea = dsmCallArea.getDsmCommonArea();
			D51uKey d51uKey = vyspi51uCallArea.getD51uRequestFields().getD51uKey();
			D51uRequestFields d51uRequestFields = vyspi51uCallArea.getD51uRequestFields();
			D51uLstIcdKey d51uLstIcdKey = vyspi51uCallArea.getD51uRequestFields().getD51uLstIcdKey();
			M51uLinkage m51uLinkage = dfhcommarea.getLinkAreaM51u().getM51uLinkage();
			char[] uIcdVerNbr51 = null;
			D51uTestValues d51uTestValues = vyspi51uCallArea.getD51uRequestFields().getD51uTestValues();
			PlanVarInputLines planVarInputLines = workFields.getPlanVarInputLines();
			D51uTestDiagArea d51uTestDiagArea = vyspi51uCallArea.getD51uRequestFields().getD51uTestValues().getD51uTestDiagArea();
			D51uNonArrayData d51uNonArrayData = vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData();
			D51uErrorTrace d51uErrorTrace = vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uErrorTrace();
			// End of variable declaration

      
// *82 2030D-read-spi-rules-db2                                     *
// *82                                                              *
// *82 1. fill the parameter keys with low values (initialize keys) *
// *82 2. browse the special processing instructions file. if the   *
// *82    record is not found or the end of file is reached, exit   *
// *82    the section. if any other error occurs, display the error *
// *82    and abort the program.                                    *
// *82 3. read the next record and apply the special processing     *
// *82    instruction rules individually.                           *
// *82***************************************************************

// *---------------------*
// **Perform 2030-read-spi-rules thru
// **        2030-exit varying ws-sub from 1 by 1
// **                  until ws-sub > ws-nbr-of-plan-var
// **
//  MOVE '2030D' TO WS-PARAGRAPH
//  LITERAL_2030D = '2030D'
          workFields.setParagraph(CONSTANTS.LITERAL_2030D);
//  MOVE ZEROS TO WS-NBR-MATCHED
          workFields.setNbrMatched( 0);
//  INITIALIZE DSM-CALL-AREA D51U-REQUEST-FIELDS
          dsmCallArea.initialize();
          vyspi51uCallArea.getD51uRequestFields().initialize();

// *45917S          vyspi51u-call-area.
          // MOVE 02 TO DSM-FUNC-CD
          dsmCallArea.getDsmCommonArea().setDsmFuncCd(2);
  
//  SET D51U-REQ-SELECT-RULE TO TRUE
          vyspi51uCallArea.getD51uRequestFields().setD51uReqSelectRuleTrue(); 
          
//  MOVE WS-FESA-SPI-NBR ( WS-SUB ) TO D51U-KEY-FE-SPI
          d51uKey.setD51uKeyFeSpi(String.valueOf(CFUtil.pad(7,String.valueOf(workFields.getPlanVarInputLines().getPlanVarRec(work.getSub() - 1).getFesaSpiNbr01()),"0",CFUtil.LEFT_PAD)).toCharArray());
  
//  MOVE 'A' TO D51U-KEY-STATUS
//  LITERAL_A = 'A'
          d51uKey.setD51uKeyStatus(CONSTANTS.LITERAL_A);
  
//  MOVE 'O529351U' TO D51U-REQ-CALLING-PROGRAM
//  LITERAL_O529351U = 'O529351U'
          d51uRequestFields.setD51uReqCallingProgram(CONSTANTS.LITERAL_O529351U);
  
//  SET D51U-REQ-CALLER-ONLINE TO TRUE
          vyspi51uCallArea.getD51uRequestFields().setD51uReqCallerOnlineTrue(); 
          

// *
          uIcdVerNbr51 = m51uLinkage.getUIcdVerNbr51();
//  IF LK-51U-ICD-VER-NBR = '0'
//  LITERAL_0 = '0'
          if (compareChars(uIcdVerNbr51, CONSTANTS.LITERAL_0) == 0) { 
              // MOVE '0' TO D51U-LST-CLM-ICD-IND
              //  LITERAL_0 = '0'
              vyspi51uCallArea.getD51uRequestFields().getD51uLstIcdKey().setD51uLstClmIcdInd(CONSTANTS.LITERAL_0);
  
          }
  
//  ELSE
          else { 
              // MOVE '9' TO D51U-LST-CLM-ICD-IND
              //  LITERAL_9 = '9'
              vyspi51uCallArea.getD51uRequestFields().getD51uLstIcdKey().setD51uLstClmIcdInd(CONSTANTS.LITERAL_9);
  
          }

// *
// * Add moves from input area to dsm test area
// *
//  MOVE LK-51U-CAUSE-CD TO D51U-TEST-CAUS
          d51uTestValues.setD51uTestCaus(m51uLinkage.getUCauseCd51());
  
//  MOVE LK-51U-PROV-TYPE TO D51U-TEST-PROV-TYP
          d51uTestValues.setD51uTestProvTyp(m51uLinkage.getUProvType51());
  
//  MOVE LK-51U-LINE-POS ( LK-SUB ) TO D51U-TEST-POS
          d51uTestValues.setD51uTestPos(dfhcommarea.getLinkAreaM51u().getM51uLinkage().getULineData51(work.getSub01() - 1).getULinePos51());
  

// *    Move lk-51u-line-service-code(lk-sub) to
//  MOVE LK-51U-LINE-SERVICE-CODE ( LK-SUB ) (1 : 5) TO D51U-TEST-SVC-CD
          d51uTestValues.setD51uTestSvcCd(pad(6,substring(dfhcommarea.getLinkAreaM51u().getM51uLinkage().getULineData51(work.getSub01() - 1).getULineServiceCode51(),0,5),SPACE_CHAR,RIGHT_PAD));
  
//  IF WS-FESA-SPI-PRI-DIAG-IND ( WS-SUB ) = 'Y'
//  LITERAL_Y = 'Y'
          if (planVarInputLines.getPlanVarRec(work.getSub() - 1).getFesaSpiPriDiagInd()[0] == 'Y') { 
//  INITIALIZE WS-PRIM-DIAG-FOUND
              work.setPrimDiagFound(CONSTANTS.SPACE /* Fill 1 Spaces*/);
//  PERFORM 2031D-POPULATE-PRI-DIAG THRU 2031D-EXIT
              populatePriDiag();/*2031D-POPULATE-PRI-DIAG SECTION*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
  
//  ELSE
          else { 
//  MOVE LK-51U-DIAGNOSIS-CODE ( 1) TO D51U-TEST-DIAG-01
              d51uTestDiagArea.setD51uTestDiag01(dfhcommarea.getLinkAreaM51u().getM51uLinkage().getUDiagnosisCode51(0));
  
//  MOVE LK-51U-DIAGNOSIS-CODE ( 2) TO D51U-TEST-DIAG-02
              d51uTestDiagArea.setD51uTestDiag02(dfhcommarea.getLinkAreaM51u().getM51uLinkage().getUDiagnosisCode51(1));
  
//  MOVE LK-51U-DIAGNOSIS-CODE ( 3) TO D51U-TEST-DIAG-03
              d51uTestDiagArea.setD51uTestDiag03(dfhcommarea.getLinkAreaM51u().getM51uLinkage().getUDiagnosisCode51(2));
  
//  MOVE LK-51U-DIAGNOSIS-CODE ( 4) TO D51U-TEST-DIAG-04
              d51uTestDiagArea.setD51uTestDiag04(dfhcommarea.getLinkAreaM51u().getM51uLinkage().getUDiagnosisCode51(3));
  
//  MOVE LK-51U-DIAGNOSIS-CODE ( 5) TO D51U-TEST-DIAG-05
              d51uTestDiagArea.setD51uTestDiag05(dfhcommarea.getLinkAreaM51u().getM51uLinkage().getUDiagnosisCode51(4));
  
//  MOVE LK-51U-DIAGNOSIS-CODE ( 6) TO D51U-TEST-DIAG-06
              d51uTestDiagArea.setD51uTestDiag06(dfhcommarea.getLinkAreaM51u().getM51uLinkage().getUDiagnosisCode51(5));
  
//  MOVE LK-51U-DIAGNOSIS-CODE ( 7) TO D51U-TEST-DIAG-07
              d51uTestDiagArea.setD51uTestDiag07(dfhcommarea.getLinkAreaM51u().getM51uLinkage().getUDiagnosisCode51(6));
  
//  MOVE LK-51U-DIAGNOSIS-CODE ( 8) TO D51U-TEST-DIAG-08
              d51uTestDiagArea.setD51uTestDiag08(dfhcommarea.getLinkAreaM51u().getM51uLinkage().getUDiagnosisCode51(7));
  
//  MOVE LK-51U-DIAGNOSIS-CODE ( 9) TO D51U-TEST-DIAG-09
              d51uTestDiagArea.setD51uTestDiag09(dfhcommarea.getLinkAreaM51u().getM51uLinkage().getUDiagnosisCode51(8));
  
//  MOVE LK-51U-DIAGNOSIS-CODE (10) TO D51U-TEST-DIAG-10
              d51uTestDiagArea.setD51uTestDiag10(dfhcommarea.getLinkAreaM51u().getM51uLinkage().getUDiagnosisCode51(9));
  
//  MOVE LK-51U-DIAGNOSIS-CODE (11) TO D51U-TEST-DIAG-11
              d51uTestDiagArea.setD51uTestDiag11(dfhcommarea.getLinkAreaM51u().getM51uLinkage().getUDiagnosisCode51(10));
  
//  MOVE LK-51U-DIAGNOSIS-CODE (12) TO D51U-TEST-DIAG-12
              d51uTestDiagArea.setD51uTestDiag12(dfhcommarea.getLinkAreaM51u().getM51uLinkage().getUDiagnosisCode51(11));
  
//  MOVE LK-51U-DIAGNOSIS-CODE (13) TO D51U-TEST-DIAG-13
              d51uTestDiagArea.setD51uTestDiag13(dfhcommarea.getLinkAreaM51u().getM51uLinkage().getUDiagnosisCode51(12));
  
//  MOVE LK-51U-DIAGNOSIS-CODE (14) TO D51U-TEST-DIAG-14
              d51uTestDiagArea.setD51uTestDiag14(dfhcommarea.getLinkAreaM51u().getM51uLinkage().getUDiagnosisCode51(13));
  
//  MOVE LK-51U-DIAGNOSIS-CODE (15) TO D51U-TEST-DIAG-15
              d51uTestDiagArea.setD51uTestDiag15(dfhcommarea.getLinkAreaM51u().getM51uLinkage().getUDiagnosisCode51(14));
  
//  MOVE LK-51U-DIAGNOSIS-CODE (16) TO D51U-TEST-DIAG-16
              d51uTestDiagArea.setD51uTestDiag16(dfhcommarea.getLinkAreaM51u().getM51uLinkage().getUDiagnosisCode51(15));
  
//  MOVE LK-51U-DIAGNOSIS-CODE (17) TO D51U-TEST-DIAG-17
              d51uTestDiagArea.setD51uTestDiag17(dfhcommarea.getLinkAreaM51u().getM51uLinkage().getUDiagnosisCode51(16));
  
//  MOVE LK-51U-DIAGNOSIS-CODE (18) TO D51U-TEST-DIAG-18
              d51uTestDiagArea.setD51uTestDiag18(dfhcommarea.getLinkAreaM51u().getM51uLinkage().getUDiagnosisCode51(17));
  
//  MOVE LK-51U-DIAGNOSIS-CODE (19) TO D51U-TEST-DIAG-19
              d51uTestDiagArea.setD51uTestDiag19(dfhcommarea.getLinkAreaM51u().getM51uLinkage().getUDiagnosisCode51(18));
  
//  MOVE LK-51U-DIAGNOSIS-CODE (20) TO D51U-TEST-DIAG-20
              d51uTestDiagArea.setD51uTestDiag20(dfhcommarea.getLinkAreaM51u().getM51uLinkage().getUDiagnosisCode51(19));
  
//  MOVE LK-51U-DIAGNOSIS-CODE (21) TO D51U-TEST-DIAG-21
              d51uTestDiagArea.setD51uTestDiag21(dfhcommarea.getLinkAreaM51u().getM51uLinkage().getUDiagnosisCode51(20));
  
//  MOVE LK-51U-DIAGNOSIS-CODE (22) TO D51U-TEST-DIAG-22
              d51uTestDiagArea.setD51uTestDiag22(dfhcommarea.getLinkAreaM51u().getM51uLinkage().getUDiagnosisCode51(21));
  
//  MOVE LK-51U-DIAGNOSIS-CODE (23) TO D51U-TEST-DIAG-23
              d51uTestDiagArea.setD51uTestDiag23(dfhcommarea.getLinkAreaM51u().getM51uLinkage().getUDiagnosisCode51(22));
  
//  MOVE LK-51U-DIAGNOSIS-CODE (24) TO D51U-TEST-DIAG-24
              d51uTestDiagArea.setD51uTestDiag24(dfhcommarea.getLinkAreaM51u().getM51uLinkage().getUDiagnosisCode51(23));
  
//  MOVE LK-51U-DIAGNOSIS-CODE (25) TO D51U-TEST-DIAG-25
              d51uTestDiagArea.setD51uTestDiag25(dfhcommarea.getLinkAreaM51u().getM51uLinkage().getUDiagnosisCode51(24));
  
          }
//  MOVE LK-51U-CPE-DESC-CD TO D51U-TEST-CPE-DESC-CD
          d51uTestValues.setD51uTestCpeDescCd(m51uLinkage.getUCpeDescCd51());
  
//  CALL WS-D529351U-DB2-DSM USING DSM-CALL-AREA VYSPI51U-CALL-AREA
          // CALL WS-D529351U-DB2-DSM USING DSM-CALL-AREA VYSPI51U-CALL-AREA
               this.setRc( d529351u.call(dsmCallArea,vyspi51uCallArea));
          d51uNonArrayData = vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData();
//  EVALUATE TRUE
          if  ( d51uNonArrayData.isD51uGoodReturn()  ) { 
//  PERFORM 2100D-SPI-RULES-PROCESS THRU 2100D-EXIT
              spiRulesProcess2100D();/*2100D-SPI-RULES-PROCESS SECTION*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
          else if  ( d51uNonArrayData.isD51uNotFound()  ) { 
              ;
          }
          else if  ( d51uNonArrayData.isD51uDb2Error()  ) { 
//  MOVE D51U-INV-REASON TO W02-DSPL-ERR-IND
              w02DsplMsgArea.setW02DsplErrInd(String.valueOf(d51uNonArrayData.getD51uInvReasonString()).toCharArray());
  
//  MOVE D51U-SQL-OR-RESP-CD TO W02-RESP-CD
              w02DsplMsgArea.setW02RespCd(CFUtil.getLong(d51uErrorTrace.getD51uSqlOrRespCd()));
  
//  MOVE 'D529351U' TO W02-ABENDING-PROG
//  LITERAL_D529351U = 'D529351U'
              w02DsplMsgArea.setW02AbendingProg(CONSTANTS.LITERAL_D529351U);
//  MOVE 'RUL' TO W02-MAIN-PROG
//  LITERAL_RUL = 'RUL'
              w02DsplMsgArea.setW02MainProg(CONSTANTS.LITERAL_RUL);
//  PERFORM 11100A-WRITE-TO-SYSM THRU 11100A-EXIT
              writeToSysm();/*11100A-WRITE-TO-SYSM SECTION*/
              if (this.isProgramEnded()) {
                  return ;
              }
//  SET M51U-ILLOGICAL-COND TO TRUE
              dfhcommarea.getLinkAreaM51u().getM51uFlags().setM51uIllogicalCondTrue(); 
              
//  PERFORM 8000-DUMP-ABEND THRU 8000-EXIT
              dumpAbend();/*8000-DUMP-ABEND SECTION*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
  
      
      }
      /**
      * populatePriDiag 
      *   This method is derived from 
  *   COBOL Paragraph - 2031D-POPULATE-PRI-DIAG SECTION COBOL Cyclomatic complexity - 8
      * Input  :  

      * - uMedicalClaim51                COBOL Name: LK-51U-MEDICAL-CLAIM
      * - s2                             COBOL Name: S2
      * - primDiagFound                  COBOL Name: WS-PRIM-DIAG-FOUND
      * - uLineDiagPointer51             COBOL Name: LK-51U-LINE-DIAG-POINTER
      * - sub01                          COBOL Name: LK-SUB
      * - uDiagnosisCode51               COBOL Name: LK-51U-DIAGNOSIS-CODE
      *
      * Output :  

      * - s2                             COBOL Name: S2
      * - point                          COBOL Name: WS-POINT
      * - uLineDiagPointer51             COBOL Name: LK-51U-LINE-DIAG-POINTER
      * - point1                         COBOL Name: WS-POINT-1
      * - d51uTestDiag01                 COBOL Name: D51U-TEST-DIAG-01
      * - uDiagnosisCode51               COBOL Name: LK-51U-DIAGNOSIS-CODE
      * - primDiagFound                  COBOL Name: WS-PRIM-DIAG-FOUND
      *
      * @throws CFException
      */
      private void populatePriDiag() throws Exception {
			// Declare local variables used in the method
			D51uTestDiagArea d51uTestDiagArea = vyspi51uCallArea.getD51uRequestFields().getD51uTestValues().getD51uTestDiagArea();
			Point point = workFields.getPoint();
			int point1 = 0;
			int s2 = 0;
			M51uLinkage m51uLinkage = dfhcommarea.getLinkAreaM51u().getM51uLinkage();
			char[] uLineDiagPointer51 = null;
			char[] uMedicalClaim51 = null;
			// End of variable declaration

          uMedicalClaim51 = m51uLinkage.getUMedicalClaim51();
//  IF LK-51U-MEDICAL-CLAIM = 'Y'
//  LITERAL_Y = 'Y'
          if (compareChars(uMedicalClaim51, CONSTANTS.LITERAL_Y) == 0) { 
//  PERFORM VARYING S2 FROM +1 BY +1 UNTIL S2 > 25 OR PRIM-DIAG-FOUND
              for (work.setS2(1); (	( work.getS2() <= 25 ) && !(work.isPrimDiagFound1()) ) ; work.setS2(work.getS2() + 1) ) {
                  uLineDiagPointer51 = m51uLinkage.getULineData51(work.getSub01() - 1).getULineDiagPointer51();
//  IF LK-51U-LINE-DIAG-POINTER ( LK-SUB ) (1 : 2) NOT = '  ' OR '99'
//  LITERAL_99 = '99'
                  if (!(Field.compareChar(uLineDiagPointer51 , CONSTANTS.SPACE_2 , ( 0 /*start*/ ), 2 /*left len*/  , 2 /*right len*/)) || !(Field.compareChar(uLineDiagPointer51 , CONSTANTS.LITERAL_99 , ( 0 /*start*/ ), 2 /*left len*/  , 2 /*right len*/))) { 
//  MOVE LK-51U-LINE-DIAG-POINTER ( LK-SUB ) TO WS-POINT
                      workFields.getPoint().setString(dfhcommarea.getLinkAreaM51u().getM51uLinkage().getULineData51(work.getSub01() - 1).getULineDiagPointer51());
                      s2 = work.getS2();
                      point1 = point.getPoint1();
//  IF WS-POINT-1 = S2
                      if (	( point1 == s2 )) { 
//  MOVE LK-51U-DIAGNOSIS-CODE (S2) TO D51U-TEST-DIAG-01
                          d51uTestDiagArea.setD51uTestDiag01(dfhcommarea.getLinkAreaM51u().getM51uLinkage().getUDiagnosisCode51(work.getS2() - 1));
  
//  SET PRIM-DIAG-FOUND TO TRUE
                          work.setPrimDiagFound1True(); 
                          
                      }
  
                  }
  
              }
          }
  
//  ELSE
          else { 
//  MOVE LK-51U-DIAGNOSIS-CODE (1) TO D51U-TEST-DIAG-01
              d51uTestDiagArea.setD51uTestDiag01(dfhcommarea.getLinkAreaM51u().getM51uLinkage().getUDiagnosisCode51(0));
  
          }
      
      }
      /**
      * spiRulesProcess2100D 
      *   This method is derived from 
  *   COBOL Paragraph - 2100D-SPI-RULES-PROCESS SECTION COBOL Cyclomatic complexity - 7
      * Input  :  

      * - keySub                         COBOL Name: KEY-SUB
      * - d51uRetDrvPos                  COBOL Name: D51U-RET-DRV-POS
      * - d51uRetDrvSvc                  COBOL Name: D51U-RET-DRV-SVC
      * - d51uRetDrvCau                  COBOL Name: D51U-RET-DRV-CAU
      *
      * Output :  

      * - paragraph                      COBOL Name: WS-PARAGRAPH
      * - keyComplete                    COBOL Name: WS-KEY-COMPLETE
      * - keySub                         COBOL Name: KEY-SUB
      * - fromPsFound                    COBOL Name: WS-FROM-PS-FOUND
      * - fromSvcFound                   COBOL Name: WS-FROM-SVC-FOUND
      * - fromPrvFound                   COBOL Name: WS-FROM-PRV-FOUND
      * - fromIcd9Found                  COBOL Name: WS-FROM-ICD9-FOUND
      * - fromCauseFound                 COBOL Name: WS-FROM-CAUSE-FOUND
      * - ipaCodeFound                   COBOL Name: WS-IPA-CODE-FOUND
      * - ipaAndGtnFound                 COBOL Name: WS-IPA-AND-GTN-FOUND
      * - cpeFlgFound                    COBOL Name: WS-CPE-FLG-FOUND
      * - searchComplete                 COBOL Name: WS-SEARCH-COMPLETE
      * - fcndPs                         COBOL Name: WS-FCND-PS
      * - fcndSvc                        COBOL Name: WS-FCND-SVC
      * - fcndCauseCd                    COBOL Name: WS-FCND-CAUSE-CD
      * - prevPs                         COBOL Name: WS-PREV-PS
      * - prevSvc                        COBOL Name: WS-PREV-SVC
      * - prevCauseCd                    COBOL Name: WS-PREV-CAUSE-CD
      * - frtoPs                         COBOL Name: WS-FRTO-PS
      * - frtoSvc                        COBOL Name: WS-FRTO-SVC
      * - frtoCauseCd                    COBOL Name: WS-FRTO-CAUSE-CD
      * - ptypPs                         COBOL Name: WS-PTYP-PS
      * - ptypSvc                        COBOL Name: WS-PTYP-SVC
      * - ptypCauseCd                    COBOL Name: WS-PTYP-CAUSE-CD
      * - ricdPs                         COBOL Name: WS-RICD-PS
      * - ricdSvc                        COBOL Name: WS-RICD-SVC
      * - ricdCauseCd                    COBOL Name: WS-RICD-CAUSE-CD
      * - causPs                         COBOL Name: WS-CAUS-PS
      * - causSvc                        COBOL Name: WS-CAUS-SVC
      * - causCauseCd                    COBOL Name: WS-CAUS-CAUSE-CD
      * - ripaPs                         COBOL Name: WS-RIPA-PS
      * - ripaSvc                        COBOL Name: WS-RIPA-SVC
      * - ripaCauseCd                    COBOL Name: WS-RIPA-CAUSE-CD
      * - cflgPs                         COBOL Name: WS-CFLG-PS
      * - cflgSvc                        COBOL Name: WS-CFLG-SVC
      * - cflgCauseCd                    COBOL Name: WS-CFLG-CAUSE-CD
      * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
      * - d51uRetDrvPos                  COBOL Name: D51U-RET-DRV-POS
      * - d51uRetDrvSvc                  COBOL Name: D51U-RET-DRV-SVC
      * - d51uRetDrvCau                  COBOL Name: D51U-RET-DRV-CAU
      *
      * @throws CFException
      */
      private void spiRulesProcess2100D() throws Exception {
			// Declare local variables used in the method
			HoldTransData2 holdTransData2 = workFields.getHoldTransData2();
			PrevMatchedKey prevMatchedKey = workFields.getPrevMatchedKey();
			D51uRetRulKeys d51uRetRulKeys = vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulKeys();
			// End of variable declaration

      
// *82    To the most "from fields".  if the number is equal, then  *
// *82    non-select the claim with '48' - mult spi matches.        *
// *82***************************************************************

// *------------------------*
//  MOVE '2100D' TO WS-PARAGRAPH
//  LITERAL_2100D = '2100D'
          workFields.setParagraph(CONSTANTS.LITERAL_2100D);
          // MOVE 'N' TO WS-KEY-COMPLETE
          //  LITERAL_N = 'N'
          work.setKeyComplete(CONSTANTS.LITERAL_N);
//  PERFORM VARYING KEY-SUB FROM 1 BY 1 UNTIL KEY-SUB > 99 OR KEY-COMPLETE
          for (work.setKeySub(1); (	( work.getKeySub() <= 99 ) && !(work.isKeyComplete1()) ) ; work.setKeySub(work.getKeySub() + 1) ) {
              // MOVE 'N' TO WS-FROM-PS-FOUND
              //  LITERAL_N = 'N'
              work.setFromPsFound(CONSTANTS.LITERAL_N);
              // MOVE 'N' TO WS-FROM-SVC-FOUND
              //  LITERAL_N = 'N'
              work.setFromSvcFound(CONSTANTS.LITERAL_N);
              // MOVE 'N' TO WS-FROM-PRV-FOUND
              //  LITERAL_N = 'N'
              work.setFromPrvFound(CONSTANTS.LITERAL_N);
              // MOVE 'N' TO WS-FROM-ICD9-FOUND
              //  LITERAL_N = 'N'
              work.setFromIcd9Found(CONSTANTS.LITERAL_N);
              // MOVE 'N' TO WS-FROM-CAUSE-FOUND
              //  LITERAL_N = 'N'
              work.setFromCauseFound(CONSTANTS.LITERAL_N);
              // MOVE 'N' TO WS-IPA-CODE-FOUND
              //  LITERAL_N = 'N'
              work.setIpaCodeFound(CONSTANTS.LITERAL_N);
              // MOVE 'N' TO WS-IPA-AND-GTN-FOUND
              //  LITERAL_N = 'N'
              work.setIpaAndGtnFound(CONSTANTS.LITERAL_N);
              // MOVE 'N' TO WS-CPE-FLG-FOUND
              //  LITERAL_N = 'N'
              work.setCpeFlgFound(CONSTANTS.LITERAL_N);
              // MOVE 'N' TO WS-SEARCH-COMPLETE
              //  LITERAL_N = 'N'
              work.setSearchComplete(CONSTANTS.LITERAL_N);
//  MOVE SPACES TO WS-FCND-PS WS-FCND-SVC WS-FCND-CAUSE-CD WS-PREV-PS WS-PREV-SVC WS-PREV-CAUSE-CD WS-FRTO-PS WS-FRTO-SVC WS-FRTO-CAUSE-CD WS-PTYP-PS WS-PTYP-SVC WS-PTYP-CAUSE-CD WS-RICD-PS WS-RICD-SVC WS-RICD-CAUSE-CD WS-CAUS-PS WS-CAUS-SVC WS-CAUS-CAUSE-CD WS-RIPA-PS WS-RIPA-SVC WS-RIPA-CAUSE-CD WS-CFLG-PS WS-CFLG-SVC WS-CFLG-CAUSE-CD
              holdTransData2.setFcndPs(CONSTANTS.SPACE_2);
              holdTransData2.setFcndSvc(CONSTANTS.SPACE_6);
              holdTransData2.setFcndCauseCd(CONSTANTS.SPACE);
              prevMatchedKey.setPrevPs(CONSTANTS.SPACE_2);
              prevMatchedKey.setPrevSvc(CONSTANTS.SPACE_6);
              prevMatchedKey.setPrevCauseCd(CONSTANTS.SPACE);
              holdTransData2.setFrtoPs(CONSTANTS.SPACE_2);
              holdTransData2.setFrtoSvc(CONSTANTS.SPACE_6);
              holdTransData2.setFrtoCauseCd(CONSTANTS.SPACE);
              holdTransData2.setPtypPs(CONSTANTS.SPACE_2);
              holdTransData2.setPtypSvc(CONSTANTS.SPACE_6);
              holdTransData2.setPtypCauseCd(CONSTANTS.SPACE);
              holdTransData2.setRicdPs(CONSTANTS.SPACE_2);
              holdTransData2.setRicdSvc(CONSTANTS.SPACE_6);
              holdTransData2.setRicdCauseCd(CONSTANTS.SPACE);
              holdTransData2.setCausPs(CONSTANTS.SPACE_2);
              holdTransData2.setCausSvc(CONSTANTS.SPACE_6);
              holdTransData2.setCausCauseCd(CONSTANTS.SPACE);
              holdTransData2.setRipaPs(CONSTANTS.SPACE_2);
              holdTransData2.setRipaSvc(CONSTANTS.SPACE_6);
              holdTransData2.setRipaCauseCd(CONSTANTS.SPACE);
              holdTransData2.setCflgPs(CONSTANTS.SPACE_2);
              holdTransData2.setCflgSvc(CONSTANTS.SPACE_6);
              holdTransData2.setCflgCauseCd(CONSTANTS.SPACE);
  
//  MOVE ZEROS TO WS-NBR-MATCHED
              workFields.setNbrMatched( 0);
//  IF D51U-RET-DRV-POS ( KEY-SUB ) = SPACES AND D51U-RET-DRV-SVC ( KEY-SUB ) = SPACES AND D51U-RET-DRV-CAU ( KEY-SUB ) = SPACES
              if (        ( allSpaces(d51uRetRulKeys.getD51uRetRuleKeys(work.getKeySub() - 1).getD51uRetDrvPos())   ) &&         ( allSpaces(d51uRetRulKeys.getD51uRetRuleKeys(work.getKeySub() - 1).getD51uRetDrvSvc())   ) &&         ( allSpaces(d51uRetRulKeys.getD51uRetRuleKeys(work.getKeySub() - 1).getD51uRetDrvCau())   )) { 
//  SET KEY-COMPLETE TO TRUE
                  work.setKeyComplete1True(); 
                  
              }
  
//  ELSE
              else { 
//  MOVE D51U-RET-DRV-POS ( KEY-SUB ) TO WS-PREV-PS
                  prevMatchedKey.setPrevPs(vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulKeys().getD51uRetRuleKeys(work.getKeySub() - 1).getD51uRetDrvPos());
  
//  MOVE D51U-RET-DRV-SVC ( KEY-SUB ) TO WS-PREV-SVC
                  prevMatchedKey.setPrevSvc(vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulKeys().getD51uRetRuleKeys(work.getKeySub() - 1).getD51uRetDrvSvc());
  
//  MOVE D51U-RET-DRV-CAU ( KEY-SUB ) TO WS-PREV-CAUSE-CD
                  prevMatchedKey.setPrevCauseCd(vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulKeys().getD51uRetRuleKeys(work.getKeySub() - 1).getD51uRetDrvCau());
  
//  PERFORM 2100D-MATCHING-RTN THRU 2100D-MATCH-EXIT
                  matchingRtn();/*2100D-MATCHING-RTN SECTION*/
                  if (this.isProgramEnded()) {
                      return ;
                  }
              }
          }
      
      }
      /**
      * matchingRtn 
      *   This method is derived from 
  *   COBOL Paragraph - 2100D-MATCHING-RTN SECTION COBOL Cyclomatic complexity - 119
      * Input  :  

      * - d51uFcndCnt                    COBOL Name: D51U-FCND-CNT
      * - d51uRetRuleSw                  COBOL Name: D51U-RET-RULE-SW
      * - d51uFrtoCnt                    COBOL Name: D51U-FRTO-CNT
      * - d51uPtypCnt                    COBOL Name: D51U-PTYP-CNT
      * - d51uCausCnt                    COBOL Name: D51U-CAUS-CNT
      * - d51uIcdCnt                     COBOL Name: D51U-ICD-CNT
      * - d51uCflgCnt                    COBOL Name: D51U-CFLG-CNT
      * - keySub                         COBOL Name: KEY-SUB
      * - psSub                          COBOL Name: PS-SUB
      * - fromPsFound                    COBOL Name: WS-FROM-PS-FOUND
      * - searchComplete                 COBOL Name: WS-SEARCH-COMPLETE
      * - svcSub                         COBOL Name: SVC-SUB
      * - fromSvcFound                   COBOL Name: WS-FROM-SVC-FOUND
      * - pvSub                          COBOL Name: PV-SUB
      * - fromPrvFound                   COBOL Name: WS-FROM-PRV-FOUND
      * - causeSub                       COBOL Name: CAUSE-SUB
      * - fromCauseFound                 COBOL Name: WS-FROM-CAUSE-FOUND
      * - d51uIpaCnt                     COBOL Name: D51U-IPA-CNT
      * - d51uRipaClmIpa1Cd              COBOL Name: D51U-RIPA-CLM-IPA-1-CD
      * - iSub                           COBOL Name: I-SUB
      * - ipaCodeFound                   COBOL Name: WS-IPA-CODE-FOUND
      * - ipaAndGtnFound                 COBOL Name: WS-IPA-AND-GTN-FOUND
      * - cflgSub                        COBOL Name: CFLG-SUB
      * - cpeFlgFound                    COBOL Name: WS-CPE-FLG-FOUND
      * - d51uMoreIcdRecords             COBOL Name: D51U-MORE-ICD-RECORDS
      * - icd9Sub                        COBOL Name: ICD9-SUB
      * - fromIcd9Found                  COBOL Name: WS-FROM-ICD9-FOUND
      * - uIcdVerNbr51                   COBOL Name: LK-51U-ICD-VER-NBR
      * - prevPs                         COBOL Name: WS-PREV-PS
      * - prevSvc                        COBOL Name: WS-PREV-SVC
      * - prevCauseCd                    COBOL Name: WS-PREV-CAUSE-CD
      * - d51uReturnCode                 COBOL Name: D51U-RETURN-CODE
      * - d51uMoreIcdCnt                 COBOL Name: D51U-MORE-ICD-CNT
      * - d51uInvReason                  COBOL Name: D51U-INV-REASON
      * - d51uSqlOrRespCd                COBOL Name: D51U-SQL-OR-RESP-CD
      * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
      * - nbrMatchedPrev                 COBOL Name: WS-NBR-MATCHED-PREV
      * - d51uKeyFeSpi                   COBOL Name: D51U-KEY-FE-SPI
      * - posSub                         COBOL Name: WS-POS-SUB
      * - d51uPlnvCnt                    COBOL Name: D51U-PLNV-CNT
      * - fesaSpiNbr01                   COBOL Name: WS-FESA-SPI-NBR
      * - fesaPosTierCd                  COBOL Name: WS-FESA-POS-TIER-CD
      * - fesaSpiDiagElgInd              COBOL Name: WS-FESA-SPI-DIAG-ELG-IND
      * - fcndPs                         COBOL Name: WS-FCND-PS
      * - fcndSvc                        COBOL Name: WS-FCND-SVC
      * - fcndCauseCd                    COBOL Name: WS-FCND-CAUSE-CD
      * - frtoPs                         COBOL Name: WS-FRTO-PS
      * - frtoSvc                        COBOL Name: WS-FRTO-SVC
      * - frtoCauseCd                    COBOL Name: WS-FRTO-CAUSE-CD
      * - ptypPs                         COBOL Name: WS-PTYP-PS
      * - ptypSvc                        COBOL Name: WS-PTYP-SVC
      * - ptypCauseCd                    COBOL Name: WS-PTYP-CAUSE-CD
      * - ricdPs                         COBOL Name: WS-RICD-PS
      * - ricdSvc                        COBOL Name: WS-RICD-SVC
      * - ricdCauseCd                    COBOL Name: WS-RICD-CAUSE-CD
      * - causPs                         COBOL Name: WS-CAUS-PS
      * - causSvc                        COBOL Name: WS-CAUS-SVC
      * - causCauseCd                    COBOL Name: WS-CAUS-CAUSE-CD
      * - ripaPs                         COBOL Name: WS-RIPA-PS
      * - ripaSvc                        COBOL Name: WS-RIPA-SVC
      * - ripaCauseCd                    COBOL Name: WS-RIPA-CAUSE-CD
      * - cflgPs                         COBOL Name: WS-CFLG-PS
      * - cflgSvc                        COBOL Name: WS-CFLG-SVC
      * - cflgCauseCd                    COBOL Name: WS-CFLG-CAUSE-CD
      *
      * Output :  

      * - sameTable                      COBOL Name: WS-SAME-TABLE
      * - psSub                          COBOL Name: PS-SUB
      * - searchComplete                 COBOL Name: WS-SEARCH-COMPLETE
      * - svcSub                         COBOL Name: SVC-SUB
      * - pvSub                          COBOL Name: PV-SUB
      * - causeSub                       COBOL Name: CAUSE-SUB
      * - iSub                           COBOL Name: I-SUB
      * - cflgSub                        COBOL Name: CFLG-SUB
      * - icd9Sub                        COBOL Name: ICD9-SUB
      * - d51uLstClmIcdInd               COBOL Name: D51U-LST-CLM-ICD-IND
      * - d51uMoreIcdSwitch              COBOL Name: D51U-MORE-ICD-SWITCH
      * - dsmFuncCd                      COBOL Name: DSM-FUNC-CD
      * - d51uLstClmIcdPos               COBOL Name: D51U-LST-CLM-ICD-POS
      * - prevPs                         COBOL Name: WS-PREV-PS
      * - d51uLstClmIcdSvc               COBOL Name: D51U-LST-CLM-ICD-SVC
      * - prevSvc                        COBOL Name: WS-PREV-SVC
      * - d51uLstClmIcdCau               COBOL Name: D51U-LST-CLM-ICD-CAU
      * - prevCauseCd                    COBOL Name: WS-PREV-CAUSE-CD
      * - rc                             COBOL Name: RETURN-CODE
      * - w02DsplErrInd                  COBOL Name: W02-DSPL-ERR-IND
      * - d51uInvReason                  COBOL Name: D51U-INV-REASON
      * - w02RespCd                      COBOL Name: W02-RESP-CD
      * - d51uSqlOrRespCd                COBOL Name: D51U-SQL-OR-RESP-CD
      * - w02AbendingProg                COBOL Name: W02-ABENDING-PROG
      * - w02MainProg                    COBOL Name: W02-MAIN-PROG
      * - m51uIllogicalCondSw            COBOL Name: M51U-ILLOGICAL-COND-SW
      * - nbrMatchedPrev                 COBOL Name: WS-NBR-MATCHED-PREV
      * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
      * - nbrEqual                       COBOL Name: WS-NBR-EQUAL
      * - holdSpiTblId                   COBOL Name: WS-HOLD-SPI-TBL-ID
      * - d51uKeyFeSpi                   COBOL Name: D51U-KEY-FE-SPI
      * - posTierFoundSw                 COBOL Name: WS-POS-TIER-FOUND-SW
      * - posSub                         COBOL Name: WS-POS-SUB
      * - hold1SpiTblId                  COBOL Name: WS-HOLD1-SPI-TBL-ID
      * - fesaSpiNbr01                   COBOL Name: WS-FESA-SPI-NBR
      * - holdPosTierCd                  COBOL Name: WS-HOLD-POS-TIER-CD
      * - fesaPosTierCd                  COBOL Name: WS-FESA-POS-TIER-CD
      * - holdDiagElgInd                 COBOL Name: WS-HOLD-DIAG-ELG-IND
      * - fesaSpiDiagElgInd              COBOL Name: WS-FESA-SPI-DIAG-ELG-IND
      * - holdPs                         COBOL Name: WS-HOLD-PS
      * - fcndPs                         COBOL Name: WS-FCND-PS
      * - holdSvc                        COBOL Name: WS-HOLD-SVC
      * - fcndSvc                        COBOL Name: WS-FCND-SVC
      * - holdCauseCd                    COBOL Name: WS-HOLD-CAUSE-CD
      * - fcndCauseCd                    COBOL Name: WS-FCND-CAUSE-CD
      * - frtoPs                         COBOL Name: WS-FRTO-PS
      * - frtoSvc                        COBOL Name: WS-FRTO-SVC
      * - frtoCauseCd                    COBOL Name: WS-FRTO-CAUSE-CD
      * - ptypPs                         COBOL Name: WS-PTYP-PS
      * - ptypSvc                        COBOL Name: WS-PTYP-SVC
      * - ptypCauseCd                    COBOL Name: WS-PTYP-CAUSE-CD
      * - ricdPs                         COBOL Name: WS-RICD-PS
      * - ricdSvc                        COBOL Name: WS-RICD-SVC
      * - ricdCauseCd                    COBOL Name: WS-RICD-CAUSE-CD
      * - causPs                         COBOL Name: WS-CAUS-PS
      * - causSvc                        COBOL Name: WS-CAUS-SVC
      * - causCauseCd                    COBOL Name: WS-CAUS-CAUSE-CD
      * - ripaPs                         COBOL Name: WS-RIPA-PS
      * - ripaSvc                        COBOL Name: WS-RIPA-SVC
      * - ripaCauseCd                    COBOL Name: WS-RIPA-CAUSE-CD
      * - cflgPs                         COBOL Name: WS-CFLG-PS
      * - cflgSvc                        COBOL Name: WS-CFLG-SVC
      * - cflgCauseCd                    COBOL Name: WS-CFLG-CAUSE-CD
      *
      * @throws CFException
      */
      private void matchingRtn() throws Exception {
			// Declare local variables used in the method
			D51uTableCounts d51uTableCounts = vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uReturnSw().getD51uTableCounts();
			D51uRetRulKeys d51uRetRulKeys = vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulKeys();
			int d51uCflgCnt = 0;
			int d51uFcndCnt = 0;
			int d51uFrtoCnt = 0;
			int d51uPtypCnt = 0;
			int d51uCausCnt = 0;
			int d51uIpaCnt = 0;
			int d51uIcdCnt = 0;
			int d51uMoreIcdCnt = 0;
			char[] d51uRetRuleSw = null;
			char[] d51uMoreIcdRecords = null;
			char[] uIcdVerNbr51 = null;
			char[] hold1SpiTblId = null;
			char[] holdSpiTblId = null;
			D51uRetRulIpa d51uRetRulIpa = vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIpa();
			D51uNonArrayData d51uNonArrayData = vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData();
			D51uLstIcdKey d51uLstIcdKey = vyspi51uCallArea.getD51uRequestFields().getD51uLstIcdKey();
			M51uLinkage m51uLinkage = dfhcommarea.getLinkAreaM51u().getM51uLinkage();
			DsmCommonArea dsmCommonArea = dsmCallArea.getDsmCommonArea();
			PrevMatchedKey prevMatchedKey = workFields.getPrevMatchedKey();
			D51uErrorTrace d51uErrorTrace = vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().getD51uErrorTrace();
			D51uKey d51uKey = vyspi51uCallArea.getD51uRequestFields().getD51uKey();
			HoldTransData holdTransData = workFields.getHoldTransData();
			HoldTransData2 holdTransData2 = workFields.getHoldTransData2();
			short nbrMatched = 0;
			short nbrMatchedPrev = 0;
			// End of variable declaration

      
// *

// *

// *45917S      if d51u-fcnd-from-cond-pos (1) not = spaces
          // MOVE 'N' TO WS-SAME-TABLE
          //  LITERAL_N = 'N'
          work.setSameTable(CONSTANTS.LITERAL_N);
          d51uCflgCnt = d51uTableCounts.getD51uCflgCnt();
          d51uRetRuleSw = d51uRetRulKeys.getD51uRetRuleKeys(work.getKeySub() - 1).getD51uRetRuleSw();
//  IF ( D51U-FCND-CNT = +0 AND D51U-RET-RULE-SW ( KEY-SUB ) (1 : 1) = '1' ) OR ( D51U-FRTO-CNT = +0 AND D51U-RET-RULE-SW ( KEY-SUB ) (2 : 1) = '1' ) OR ( D51U-PTYP-CNT = +0 AND D51U-RET-RULE-SW ( KEY-SUB ) (3 : 1) = '1' ) OR ( D51U-CAUS-CNT = +0 AND D51U-RET-RULE-SW ( KEY-SUB ) (4 : 1) = '1' ) OR ( D51U-ICD-CNT = +0 AND D51U-RET-RULE-SW ( KEY-SUB ) (7 : 1) = '1' ) OR ( D51U-CFLG-CNT = +0 AND D51U-RET-RULE-SW ( KEY-SUB ) (8 : 1) = '1' ) THEN
//  LITERAL_1 = '1'
          if ((	( d51uTableCounts.getD51uFcndCnt() == 0 ) &&  d51uRetRuleSw[0] == '1') || (	( d51uTableCounts.getD51uFrtoCnt() == 0 ) &&  d51uRetRuleSw[1] == '1') || (	( d51uTableCounts.getD51uPtypCnt() == 0 ) &&  d51uRetRuleSw[2] == '1') || (	( d51uTableCounts.getD51uCausCnt() == 0 ) &&  d51uRetRuleSw[3] == '1') || (	( d51uTableCounts.getD51uIcdCnt() == 0 ) &&  d51uRetRuleSw[6] == '1') || (	( d51uCflgCnt == 0 ) &&  d51uRetRuleSw[7] == '1')) { 
//cobolCode::GO TO 2100D-MATCH-EXIT
return ;
//cobolCodeEnds::GO TO 2100D-MATCH-EXIT
          }
  
//  ELSE
          d51uFcndCnt = d51uTableCounts.getD51uFcndCnt();
//  IF D51U-FCND-CNT > +0 THEN
          if (	( d51uFcndCnt > 0 )) { 
              d51uRetRuleSw = d51uRetRulKeys.getD51uRetRuleKeys(work.getKeySub() - 1).getD51uRetRuleSw();
//  IF D51U-RET-RULE-SW ( KEY-SUB ) (1 : 1) = '1' THEN
//  LITERAL_1 = '1'
              if ( d51uRetRuleSw[0] == '1') { 
//  SET SAME-TABLE TO TRUE
                  work.setSameTable1True(); 
                  
              }
  
//  PERFORM 2110D-SEARCH-PS THRU 2110D-EXIT VARYING PS-SUB FROM 1 BY 1 UNTIL PS-SUB > D51U-FCND-CNT OR FROM-PS-FOUND OR SEARCH-COMPLETE OR PS-SUB > +99
              for (work.setPsSub(1); 	( work.getPsSub() <= d51uTableCounts.getD51uFcndCnt() ) && !(work.isFromPsFound1())  && !(work.isSearchComplete1())  && 	( work.getPsSub() <= 99 ) ; work.setPsSub(work.getPsSub() + 1) ) {
              	searchPs2110D();/*2110D-SEARCH-PS SECTION*/
              }
  

// *45917C        until ps-sub > 99 or search-complete
//  IF NOT FROM-PS-FOUND AND SAME-TABLE
              if (!(work.isFromPsFound1())  &&  work.isSameTable1()  ) { 
//  NEXT SENTENCE
                  return ;
              }
          }
  
          // MOVE 'N' TO WS-SEARCH-COMPLETE
          //  LITERAL_N = 'N'
          work.setSearchComplete(CONSTANTS.LITERAL_N);
          // MOVE 'N' TO WS-SAME-TABLE
          //  LITERAL_N = 'N'
          work.setSameTable(CONSTANTS.LITERAL_N);

// *45917S      if d51u-frto-clm-frm-svc-cd (1) not = spaces
          d51uFrtoCnt = d51uTableCounts.getD51uFrtoCnt();
//  IF D51U-FRTO-CNT > +0 THEN
          if (	( d51uFrtoCnt > 0 )) { 
              d51uRetRuleSw = d51uRetRulKeys.getD51uRetRuleKeys(work.getKeySub() - 1).getD51uRetRuleSw();
//  IF D51U-RET-RULE-SW ( KEY-SUB ) (2 : 1) = '1' THEN
//  LITERAL_1 = '1'
              if ( d51uRetRuleSw[1] == '1') { 
//  SET SAME-TABLE TO TRUE
                  work.setSameTable1True(); 
                  
              }
  
//  PERFORM 2120D-SEARCH-SVC THRU 2120D-EXIT VARYING SVC-SUB FROM 1 BY 1 UNTIL SVC-SUB > D51U-FRTO-CNT OR FROM-SVC-FOUND OR SEARCH-COMPLETE OR SVC-SUB > +9999
              for (work.setSvcSub(1); 	( work.getSvcSub() <= d51uTableCounts.getD51uFrtoCnt() ) && !(work.isFromSvcFound1())  && !(work.isSearchComplete1())  && 	( work.getSvcSub() <= 9999 ) ; work.setSvcSub(work.getSvcSub() + 1) ) {
              	searchSvc2120D();/*2120D-SEARCH-SVC SECTION*/
              }
  

// *45917S        until svc-sub > 9999 or search-complete
//  IF NOT FROM-SVC-FOUND AND SAME-TABLE
              if (!(work.isFromSvcFound1())  &&  work.isSameTable1()  ) { 
//  NEXT SENTENCE
                  return ;
              }
          }
  
          // MOVE 'N' TO WS-SAME-TABLE
          //  LITERAL_N = 'N'
          work.setSameTable(CONSTANTS.LITERAL_N);
          // MOVE 'N' TO WS-SEARCH-COMPLETE
          //  LITERAL_N = 'N'
          work.setSearchComplete(CONSTANTS.LITERAL_N);

// *45917S      if d51u-ptyp-prov-typ(1) not = spaces
          d51uPtypCnt = d51uTableCounts.getD51uPtypCnt();
//  IF D51U-PTYP-CNT > +0 THEN
          if (	( d51uPtypCnt > 0 )) { 
              d51uRetRuleSw = d51uRetRulKeys.getD51uRetRuleKeys(work.getKeySub() - 1).getD51uRetRuleSw();
//  IF D51U-RET-RULE-SW ( KEY-SUB ) (3 : 1) = '1' THEN
//  LITERAL_1 = '1'
              if ( d51uRetRuleSw[2] == '1') { 
//  SET SAME-TABLE TO TRUE
                  work.setSameTable1True(); 
                  
              }
  
//  PERFORM 2130D-SEARCH-PRV THRU 2130D-EXIT VARYING PV-SUB FROM 1 BY 1 UNTIL PV-SUB > D51U-PTYP-CNT OR FROM-PRV-FOUND OR SEARCH-COMPLETE OR PV-SUB > +99
              for (work.setPvSub(1); 	( work.getPvSub() <= d51uTableCounts.getD51uPtypCnt() ) && !(work.isFromPrvFound1())  && !(work.isSearchComplete1())  && 	( work.getPvSub() <= 99 ) ; work.setPvSub(work.getPvSub() + 1) ) {
              	searchPrv2130D();/*2130D-SEARCH-PRV SECTION*/
              }
  

// *45917C        until pv-sub > 99 or search-complete
//  IF NOT FROM-PRV-FOUND AND SAME-TABLE
              if (!(work.isFromPrvFound1())  &&  work.isSameTable1()  ) { 
//  NEXT SENTENCE
                  return ;
              }
          }
  

// *       Perform 2140d-search-icd9 thru
// *               2140d-exit varying icd9-sub from 1 by 1
// *               until icd9-sub > d51u-icd-cnt
// *                  or from-icd9-found
// *                  or search-complete
// *                  or icd9-sub > +9999
// *     end-perform
// *
// *      if not  from-icd9-found
// *      and same-table
// *           next sentence
// *      end-if
// *     end-if
          // MOVE 'N' TO WS-SEARCH-COMPLETE
          //  LITERAL_N = 'N'
          work.setSearchComplete(CONSTANTS.LITERAL_N);
          // MOVE 'N' TO WS-SAME-TABLE
          //  LITERAL_N = 'N'
          work.setSameTable(CONSTANTS.LITERAL_N);

// *45917S      if d51u-caus-clm-cause-cd-1 (1) not = spaces
          d51uCausCnt = d51uTableCounts.getD51uCausCnt();
//  IF D51U-CAUS-CNT > +0 THEN
          if (	( d51uCausCnt > 0 )) { 
              d51uRetRuleSw = d51uRetRulKeys.getD51uRetRuleKeys(work.getKeySub() - 1).getD51uRetRuleSw();
//  IF D51U-RET-RULE-SW ( KEY-SUB ) (4 : 1) = '1' THEN
//  LITERAL_1 = '1'
              if ( d51uRetRuleSw[3] == '1') { 
//  SET SAME-TABLE TO TRUE
                  work.setSameTable1True(); 
                  
              }
  
//  PERFORM 2150D-SEARCH-CAUSE THRU 2150D-EXIT VARYING CAUSE-SUB FROM 1 BY 1 UNTIL CAUSE-SUB > D51U-CAUS-CNT OR FROM-CAUSE-FOUND OR SEARCH-COMPLETE OR CAUSE-SUB > +99
              for (work.setCauseSub(1); 	( work.getCauseSub() <= d51uTableCounts.getD51uCausCnt() ) && !(work.isFromCauseFound1())  && !(work.isSearchComplete1())  && 	( work.getCauseSub() <= 99 ) ; work.setCauseSub(work.getCauseSub() + 1) ) {
              	searchCause2150D();/*2150D-SEARCH-CAUSE SECTION*/
              }
  

// *45917C        until cause-sub > 99 or
// *45917s              search-complete
//  IF NOT FROM-CAUSE-FOUND AND SAME-TABLE
              if (!(work.isFromCauseFound1())  &&  work.isSameTable1()  ) { 
//  NEXT SENTENCE
                  return ;
              }
          }
  
          // MOVE 'N' TO WS-SAME-TABLE
          //  LITERAL_N = 'N'
          work.setSameTable(CONSTANTS.LITERAL_N);
          // MOVE 'N' TO WS-SEARCH-COMPLETE
          //  LITERAL_N = 'N'
          work.setSearchComplete(CONSTANTS.LITERAL_N);

// *45917C      if d51u-ripa-clm-ipa-1-cd(1)  = zeroes
// *d5201a      if d51u-ipa-cnt > +0
// *d5201e      if d51u-ipa-cnt = 0
//  IF D51U-IPA-CNT = 0 OR D51U-RIPA-CLM-IPA-1-CD (1) = ZEROES
          d51uIpaCnt = d51uTableCounts.getD51uIpaCnt();
//  ELSE
          if (	( d51uIpaCnt != 0 ) && 	( vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIpa().getD51uRetRuleIpa(0).getD51uRipaClmIpa1Cd() != 0 )) { 
//  PERFORM 2160D-MATCH-IPA-TO-PPOALT THRU 2160D-EXIT VARYING I-SUB FROM 1 BY 1 UNTIL I-SUB > D51U-IPA-CNT OR IPA-CODE-FOUND OR IPA-AND-GTN-FOUND OR SEARCH-COMPLETE OR I-SUB > +99
              for (work.setISub(1); 	( work.getISub() <= d51uTableCounts.getD51uIpaCnt() ) && !(work.isIpaCodeFound1())  && !(work.isIpaAndGtnFound1())  && !(work.isSearchComplete1())  && 	( work.getISub() <= 99 ) ; work.setISub(work.getISub() + 1) ) {
              	matchIpaToPpoalt2160D();/*2160D-MATCH-IPA-TO-PPOALT SECTION*/
                  if (this.isProgramEnded()) {
                      return ;
                  }
              }
  

// *45917C          until i-sub > 99 or
// *45917s              search-complete
//  IF NOT IPA-CODE-FOUND AND SAME-TABLE AND NOT IPA-AND-GTN-FOUND
              if (!(work.isIpaCodeFound1())  &&  work.isSameTable1()   && !(work.isIpaAndGtnFound1()) ) { 
//  NEXT SENTENCE
                  return ;
              }
          }
  

// ****      Else
// ****            move d51u-ripa-drv-pos(i-sub)  to ws-hold-ps
// ****            add 1           to ws-nbr-matched
          // MOVE 'N' TO WS-SEARCH-COMPLETE
          //  LITERAL_N = 'N'
          work.setSearchComplete(CONSTANTS.LITERAL_N);
          // MOVE 'N' TO WS-SAME-TABLE
          //  LITERAL_N = 'N'
          work.setSameTable(CONSTANTS.LITERAL_N);
          d51uCflgCnt = d51uTableCounts.getD51uCflgCnt();
//  IF D51U-CFLG-CNT > +0 THEN
          if (	( d51uCflgCnt > 0 )) { 
              d51uRetRuleSw = d51uRetRulKeys.getD51uRetRuleKeys(work.getKeySub() - 1).getD51uRetRuleSw();
//  IF D51U-RET-RULE-SW ( KEY-SUB ) (8 : 1) = '1' THEN
//  LITERAL_1 = '1'
              if ( d51uRetRuleSw[7] == '1') { 
//  SET SAME-TABLE TO TRUE
                  work.setSameTable1True(); 
                  
              }
  
//  PERFORM 2170D-SEARCH-CFLG THRU 2170D-EXIT VARYING CFLG-SUB FROM 1 BY 1 UNTIL CFLG-SUB > D51U-CFLG-CNT OR CPE-FLG-FOUND OR SEARCH-COMPLETE OR CFLG-SUB > +99
              for (work.setCflgSub(1); 	( work.getCflgSub() <= d51uTableCounts.getD51uCflgCnt() ) && !(work.isCpeFlgFound1())  && !(work.isSearchComplete1())  && 	( work.getCflgSub() <= 99 ) ; work.setCflgSub(work.getCflgSub() + 1) ) {
              	searchCflg();/*2170D-SEARCH-CFLG SECTION*/
              }
  
//  IF NOT CPE-FLG-FOUND AND SAME-TABLE
              if (!(work.isCpeFlgFound1())  &&  work.isSameTable1()  ) { 
//  NEXT SENTENCE
                  return ;
              }
          }
  

// *
          // MOVE 'N' TO WS-SAME-TABLE
          //  LITERAL_N = 'N'
          work.setSameTable(CONSTANTS.LITERAL_N);
          // MOVE 'N' TO WS-SEARCH-COMPLETE
          //  LITERAL_N = 'N'
          work.setSearchComplete(CONSTANTS.LITERAL_N);

// *
// *
          d51uIcdCnt = d51uTableCounts.getD51uIcdCnt();
//  IF D51U-ICD-CNT > +0 THEN
          if (	( d51uIcdCnt > 0 )) { 
              d51uIcdCnt = d51uTableCounts.getD51uIcdCnt();
//  IF D51U-ICD-CNT = +0 THEN
              if (	( d51uIcdCnt == 0 )) { 
                  // MOVE 'Y' TO WS-SEARCH-COMPLETE
                  //  LITERAL_Y = 'Y'
                  work.setSearchComplete(CONSTANTS.LITERAL_Y);
              }
  
              d51uRetRuleSw = d51uRetRulKeys.getD51uRetRuleKeys(work.getKeySub() - 1).getD51uRetRuleSw();
//  IF D51U-RET-RULE-SW ( KEY-SUB ) (7 : 1) = '1' THEN
//  LITERAL_1 = '1'
              if ( d51uRetRuleSw[6] == '1') { 
//  SET SAME-TABLE TO TRUE
                  work.setSameTable1True(); 
                  
              }
  
              d51uMoreIcdRecords = d51uNonArrayData.getD51uMoreIcdRecords();
//  IF D51U-MORE-ICD-RECORDS = 'N'
//  LITERAL_N = 'N'
              if (compareChars(d51uMoreIcdRecords, CONSTANTS.LITERAL_N) == 0) { 
                  d51uIcdCnt = d51uTableCounts.getD51uIcdCnt();
//  IF D51U-ICD-CNT > +0
                  if (	( d51uIcdCnt > 0 )) { 
//  PERFORM 2140D-SEARCH-ICD9 THRU 2140D-EXIT VARYING ICD9-SUB FROM 1 BY 1 UNTIL ICD9-SUB > D51U-ICD-CNT OR FROM-ICD9-FOUND OR SEARCH-COMPLETE OR ICD9-SUB > +9999
                      for (work.setIcd9Sub(1); 	( work.getIcd9Sub() <= d51uTableCounts.getD51uIcdCnt() ) && !(work.isFromIcd9Found1())  && !(work.isSearchComplete1())  && 	( work.getIcd9Sub() <= 9999 ) ; work.setIcd9Sub(work.getIcd9Sub() + 1) ) {
                      	searchIcd92140D();/*2140D-SEARCH-ICD9 SECTION*/
                          if (this.isProgramEnded()) {
                              return ;
                          }
                      }
  
                  }
  
              }
  
//  ELSE
              else { 
                  uIcdVerNbr51 = m51uLinkage.getUIcdVerNbr51();
//  IF LK-51U-ICD-VER-NBR = '0'
//  LITERAL_0 = '0'
                  if (compareChars(uIcdVerNbr51, CONSTANTS.LITERAL_0) == 0) { 
                      // MOVE '0' TO D51U-LST-CLM-ICD-IND
                      //  LITERAL_0 = '0'
                      vyspi51uCallArea.getD51uRequestFields().getD51uLstIcdKey().setD51uLstClmIcdInd(CONSTANTS.LITERAL_0);
  
                  }
  
//  ELSE
                  else { 
                      // MOVE '9' TO D51U-LST-CLM-ICD-IND
                      //  LITERAL_9 = '9'
                      vyspi51uCallArea.getD51uRequestFields().getD51uLstIcdKey().setD51uLstClmIcdInd(CONSTANTS.LITERAL_9);
  
                  }

// *
//  SET FIRST-TIME-MORE-ICD TO TRUE
                  vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().setFirstTimeMoreIcdTrue(); 
                  
                  // MOVE 03 TO DSM-FUNC-CD
                  dsmCallArea.getDsmCommonArea().setDsmFuncCd(3);
  
//  MOVE WS-PREV-PS TO D51U-LST-CLM-ICD-POS
                  d51uLstIcdKey.setD51uLstClmIcdPos(prevMatchedKey.getPrevPs());
  
//  MOVE WS-PREV-SVC TO D51U-LST-CLM-ICD-SVC
                  d51uLstIcdKey.setD51uLstClmIcdSvc(prevMatchedKey.getPrevSvc());
  
//  MOVE WS-PREV-CAUSE-CD TO D51U-LST-CLM-ICD-CAU
                  d51uLstIcdKey.setD51uLstClmIcdCau(prevMatchedKey.getPrevCauseCd());
  
//  CALL WS-D529351U-DB2-DSM USING DSM-CALL-AREA VYSPI51U-CALL-AREA
                  // CALL WS-D529351U-DB2-DSM USING DSM-CALL-AREA VYSPI51U-CALL-AREA
                       this.setRc( d529351u.call(dsmCallArea,vyspi51uCallArea));
                  d51uNonArrayData = vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData();
//  EVALUATE TRUE
                  if  ( d51uNonArrayData.isD51uGoodReturn()  ) { 
                      d51uMoreIcdCnt = d51uTableCounts.getD51uMoreIcdCnt();
//  IF D51U-MORE-ICD-CNT > +0
                      if (	( d51uMoreIcdCnt > 0 )) { 
//  PERFORM 2140D-SEARCH-ICD9 THRU 2140D-EXIT VARYING ICD9-SUB FROM 1 BY 1 UNTIL ICD9-SUB > D51U-MORE-ICD-CNT OR FROM-ICD9-FOUND OR SEARCH-COMPLETE OR ICD9-SUB > +9999
                          for (work.setIcd9Sub(1); 	( work.getIcd9Sub() <= d51uTableCounts.getD51uMoreIcdCnt() ) && !(work.isFromIcd9Found1())  && !(work.isSearchComplete1())  && 	( work.getIcd9Sub() <= 9999 ) ; work.setIcd9Sub(work.getIcd9Sub() + 1) ) {
                          	searchIcd92140D();/*2140D-SEARCH-ICD9 SECTION*/
                              if (this.isProgramEnded()) {
                                  return ;
                              }
                          }
  
                      }
  
                  }
                  else if  ( d51uNonArrayData.isD51uNotFound()  ) { 
                      ;
                  }
                  else if  ( d51uNonArrayData.isD51uDb2Error()  ) { 
//  MOVE D51U-INV-REASON TO W02-DSPL-ERR-IND
                      w02DsplMsgArea.setW02DsplErrInd(String.valueOf(d51uNonArrayData.getD51uInvReasonString()).toCharArray());
  
//  MOVE D51U-SQL-OR-RESP-CD TO W02-RESP-CD
                      w02DsplMsgArea.setW02RespCd(CFUtil.getLong(d51uErrorTrace.getD51uSqlOrRespCd()));
  
//  MOVE 'D529351U' TO W02-ABENDING-PROG
//  LITERAL_D529351U = 'D529351U'
                      w02DsplMsgArea.setW02AbendingProg(CONSTANTS.LITERAL_D529351U);
//  MOVE 'ICD' TO W02-MAIN-PROG
//  LITERAL_ICD = 'ICD'
                      w02DsplMsgArea.setW02MainProg(CONSTANTS.LITERAL_ICD);
//  PERFORM 11100A-WRITE-TO-SYSM THRU 11100A-EXIT
                      writeToSysm();/*11100A-WRITE-TO-SYSM SECTION*/
                      if (this.isProgramEnded()) {
                          return ;
                      }
//  SET M51U-ILLOGICAL-COND TO TRUE
                      dfhcommarea.getLinkAreaM51u().getM51uFlags().setM51uIllogicalCondTrue(); 
                      
//  PERFORM 8000-DUMP-ABEND THRU 8000-EXIT
                      dumpAbend();/*8000-DUMP-ABEND SECTION*/
                      if (this.isProgramEnded()) {
                          return ;
                      }
                  }
  

// *
                  d51uMoreIcdCnt = d51uTableCounts.getD51uMoreIcdCnt();
//  IF D51U-MORE-ICD-CNT = +9999
                  if (	( d51uMoreIcdCnt == 9999 )) { 
//  PERFORM UNTIL D51U-MORE-ICD-CNT = +0 OR D51U-MORE-ICD-CNT < +9999
                      while ((	( d51uTableCounts.getD51uMoreIcdCnt() != 0 ) && 	( d51uTableCounts.getD51uMoreIcdCnt() >= 9999 ))) {
//  SET NOT-FIRST-TIME-MORE-ICD TO TRUE
                          vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData().setNotFirstTimeMoreIcdTrue(); 
                          
                          // MOVE 03 TO DSM-FUNC-CD
                          dsmCallArea.getDsmCommonArea().setDsmFuncCd(3);
  
//  CALL WS-D529351U-DB2-DSM USING DSM-CALL-AREA VYSPI51U-CALL-AREA
                          // CALL WS-D529351U-DB2-DSM USING DSM-CALL-AREA VYSPI51U-CALL-AREA
                               this.setRc( d529351u.call(dsmCallArea,vyspi51uCallArea));
                          d51uNonArrayData = vyspi51uCallArea.getD51uReturnArea().getD51uNonArrayData();
//  EVALUATE TRUE
                          if  ( d51uNonArrayData.isD51uGoodReturn()  ) { 
                              d51uMoreIcdCnt = d51uTableCounts.getD51uMoreIcdCnt();
//  IF D51U-MORE-ICD-CNT > +0
                              if (	( d51uMoreIcdCnt > 0 )) { 
//  PERFORM 2140D-SEARCH-ICD9 THRU 2140D-EXIT VARYING ICD9-SUB FROM 1 BY 1 UNTIL ICD9-SUB > D51U-MORE-ICD-CNT OR FROM-ICD9-FOUND OR SEARCH-COMPLETE OR ICD9-SUB > +9999
                                  for (work.setIcd9Sub(1); 	( work.getIcd9Sub() <= d51uTableCounts.getD51uMoreIcdCnt() ) && !(work.isFromIcd9Found1())  && !(work.isSearchComplete1())  && 	( work.getIcd9Sub() <= 9999 ) ; work.setIcd9Sub(work.getIcd9Sub() + 1) ) {
                                  	searchIcd92140D();/*2140D-SEARCH-ICD9 SECTION*/
                                      if (this.isProgramEnded()) {
                                          return ;
                                      }
                                  }
  
                              }
  
                          }
                          else if  ( d51uNonArrayData.isD51uNotFound()  ) { 
                              ;
                          }
                          else if  ( d51uNonArrayData.isD51uDb2Error()  ) { 
//  MOVE D51U-INV-REASON TO W02-DSPL-ERR-IND
                              w02DsplMsgArea.setW02DsplErrInd(String.valueOf(d51uNonArrayData.getD51uInvReasonString()).toCharArray());
  
//  MOVE D51U-SQL-OR-RESP-CD TO W02-RESP-CD
                              w02DsplMsgArea.setW02RespCd(CFUtil.getLong(d51uErrorTrace.getD51uSqlOrRespCd()));
  
//  MOVE 'D529351U' TO W02-ABENDING-PROG
//  LITERAL_D529351U = 'D529351U'
                              w02DsplMsgArea.setW02AbendingProg(CONSTANTS.LITERAL_D529351U);
//  MOVE 'ICD' TO W02-MAIN-PROG
//  LITERAL_ICD = 'ICD'
                              w02DsplMsgArea.setW02MainProg(CONSTANTS.LITERAL_ICD);
//  PERFORM 11100A-WRITE-TO-SYSM THRU 11100A-EXIT
                              writeToSysm();/*11100A-WRITE-TO-SYSM SECTION*/
                              if (this.isProgramEnded()) {
                                  return ;
                              }
//  SET M51U-ILLOGICAL-COND TO TRUE
                              dfhcommarea.getLinkAreaM51u().getM51uFlags().setM51uIllogicalCondTrue(); 
                              
//  PERFORM 8000-DUMP-ABEND THRU 8000-EXIT
                              dumpAbend();/*8000-DUMP-ABEND SECTION*/
                              if (this.isProgramEnded()) {
                                  return ;
                              }
                          }
  
                      }
  
                  }
  
              }

// *
// *
//  IF NOT FROM-ICD9-FOUND AND SAME-TABLE
              if (!(work.isFromIcd9Found1())  &&  work.isSameTable1()  ) { 
//  NEXT SENTENCE
                  return ;
              }
          }
  

// *
// *** If more than one spi matches, apply the spi which matched
// *** to the most "from fields".  if the number is equal, then
// *** non-select the claim with '48' - mult spi matches.
          // MOVE 'N' TO WS-SEARCH-COMPLETE
          //  LITERAL_N = 'N'
          work.setSearchComplete(CONSTANTS.LITERAL_N);
          nbrMatchedPrev = workFields.getNbrMatchedPrev();
          nbrMatched = workFields.getNbrMatched();
//  IF WS-NBR-MATCHED > WS-NBR-MATCHED-PREV
          if (	( nbrMatched > nbrMatchedPrev )) { 
//  MOVE WS-NBR-MATCHED TO WS-NBR-MATCHED-PREV
              workFields.setNbrMatchedPrev(workFields.getNbrMatched());
              // MOVE 'N' TO WS-NBR-EQUAL
              //  LITERAL_N = 'N'
              work.setNbrEqual(CONSTANTS.LITERAL_N);
//  MOVE D51U-KEY-FE-SPI TO WS-HOLD-SPI-TBL-ID
              holdTransData.setHoldSpiTblId(d51uKey.getD51uKeyFeSpi());
  
              // MOVE 'N' TO WS-POS-TIER-FOUND-SW
              //  LITERAL_N = 'N'
              work.setPosTierFoundSw(CONSTANTS.LITERAL_N);
//  PERFORM VARYING WS-POS-SUB FROM 1 BY 1 UNTIL WS-POS-SUB > D51U-PLNV-CNT OR +99 OR HOLD-POS-FOUND
              for (work.setPosSub(1); (	( work.getPosSub() <= d51uTableCounts.getD51uPlnvCnt() ) && 	( work.getPosSub() <= 99 ) && !(work.isHoldPosFound()) ) ; work.setPosSub(work.getPosSub() + 1) ) {
//  MOVE WS-FESA-SPI-NBR ( WS-POS-SUB ) TO WS-HOLD1-SPI-TBL-ID
                  holdTransData.setHold1SpiTblId(String.valueOf(CFUtil.pad(7,String.valueOf(workFields.getPlanVarInputLines().getPlanVarRec(work.getPosSub() - 1).getFesaSpiNbr01()),"0",CFUtil.LEFT_PAD)).toCharArray());
  
                  holdSpiTblId = holdTransData.getHoldSpiTblId();
                  hold1SpiTblId = holdTransData.getHold1SpiTblId();
//  IF WS-HOLD1-SPI-TBL-ID = WS-HOLD-SPI-TBL-ID
                  if (		compareChars(hold1SpiTblId,holdSpiTblId) == 0 ) { 
//  MOVE WS-FESA-POS-TIER-CD ( WS-POS-SUB ) TO WS-HOLD-POS-TIER-CD
                      holdTransData.setHoldPosTierCd(workFields.getPlanVarInputLines().getPlanVarRec(work.getPosSub() - 1).getFesaPosTierCd());
  
//  MOVE WS-FESA-SPI-DIAG-ELG-IND ( WS-POS-SUB ) TO WS-HOLD-DIAG-ELG-IND
                      holdTransData.setHoldDiagElgInd(workFields.getPlanVarInputLines().getPlanVarRec(work.getPosSub() - 1).getFesaSpiDiagElgInd());
  
//  SET HOLD-POS-FOUND TO TRUE
                      work.setHoldPosFoundTrue(); 
                      
                  }
  
              }
  
//  IF FROM-PS-FOUND
              if ( work.isFromPsFound1()  ) { 
//  MOVE WS-FCND-PS TO WS-HOLD-PS
                  holdTransData.setHoldPs(holdTransData2.getFcndPs());
  
//  MOVE WS-FCND-SVC TO WS-HOLD-SVC
                  holdTransData.setHoldSvc(holdTransData2.getFcndSvc());
  
//  MOVE WS-FCND-CAUSE-CD TO WS-HOLD-CAUSE-CD
                  holdTransData.setHoldCauseCd(holdTransData2.getFcndCauseCd());
  
              }
//  IF FROM-SVC-FOUND
              if ( work.isFromSvcFound1()  ) { 
//  MOVE WS-FRTO-PS TO WS-HOLD-PS
                  holdTransData.setHoldPs(holdTransData2.getFrtoPs());
  
//  MOVE WS-FRTO-SVC TO WS-HOLD-SVC
                  holdTransData.setHoldSvc(holdTransData2.getFrtoSvc());
  
//  MOVE WS-FRTO-CAUSE-CD TO WS-HOLD-CAUSE-CD
                  holdTransData.setHoldCauseCd(holdTransData2.getFrtoCauseCd());
  
              }
//  IF FROM-PRV-FOUND
              if ( work.isFromPrvFound1()  ) { 
//  MOVE WS-PTYP-PS TO WS-HOLD-PS
                  holdTransData.setHoldPs(holdTransData2.getPtypPs());
  
//  MOVE WS-PTYP-SVC TO WS-HOLD-SVC
                  holdTransData.setHoldSvc(holdTransData2.getPtypSvc());
  
//  MOVE WS-PTYP-CAUSE-CD TO WS-HOLD-CAUSE-CD
                  holdTransData.setHoldCauseCd(holdTransData2.getPtypCauseCd());
  
              }
//  IF FROM-ICD9-FOUND
              if ( work.isFromIcd9Found1()  ) { 
//  MOVE WS-RICD-PS TO WS-HOLD-PS
                  holdTransData.setHoldPs(holdTransData2.getRicdPs());
  
//  MOVE WS-RICD-SVC TO WS-HOLD-SVC
                  holdTransData.setHoldSvc(holdTransData2.getRicdSvc());
  
//  MOVE WS-RICD-CAUSE-CD TO WS-HOLD-CAUSE-CD
                  holdTransData.setHoldCauseCd(holdTransData2.getRicdCauseCd());
  
              }
//  IF FROM-CAUSE-FOUND
              if ( work.isFromCauseFound1()  ) { 
//  MOVE WS-CAUS-PS TO WS-HOLD-PS
                  holdTransData.setHoldPs(holdTransData2.getCausPs());
  
//  MOVE WS-CAUS-SVC TO WS-HOLD-SVC
                  holdTransData.setHoldSvc(holdTransData2.getCausSvc());
  
//  MOVE WS-CAUS-CAUSE-CD TO WS-HOLD-CAUSE-CD
                  holdTransData.setHoldCauseCd(holdTransData2.getCausCauseCd());
  
              }

// *          If ipa-code-found
//  IF IPA-CODE-FOUND OR IPA-AND-GTN-FOUND
              if ( work.isIpaCodeFound1()   ||  work.isIpaAndGtnFound1()  ) { 
//  MOVE WS-RIPA-PS TO WS-HOLD-PS
                  holdTransData.setHoldPs(holdTransData2.getRipaPs());
  
//  MOVE WS-RIPA-SVC TO WS-HOLD-SVC
                  holdTransData.setHoldSvc(holdTransData2.getRipaSvc());
  
//  MOVE WS-RIPA-CAUSE-CD TO WS-HOLD-CAUSE-CD
                  holdTransData.setHoldCauseCd(holdTransData2.getRipaCauseCd());
  
              }
//  IF CPE-FLG-FOUND
              if ( work.isCpeFlgFound1()  ) { 
//  MOVE WS-CFLG-PS TO WS-HOLD-PS
                  holdTransData.setHoldPs(holdTransData2.getCflgPs());
  
//  MOVE WS-CFLG-SVC TO WS-HOLD-SVC
                  holdTransData.setHoldSvc(holdTransData2.getCflgSvc());
  
//  MOVE WS-CFLG-CAUSE-CD TO WS-HOLD-CAUSE-CD
                  holdTransData.setHoldCauseCd(holdTransData2.getCflgCauseCd());
  
              }
//  MOVE ZEROS TO WS-NBR-MATCHED
              workFields.setNbrMatched( 0);
          }
  
//  ELSE
          else { 
              nbrMatchedPrev = workFields.getNbrMatchedPrev();
              nbrMatched = workFields.getNbrMatched();
//  IF WS-NBR-MATCHED = WS-NBR-MATCHED-PREV AND WS-NBR-MATCHED NOT = ZEROS
              if (	( nbrMatched == nbrMatchedPrev ) && 	( nbrMatched != 0 ) ) { 
                  // MOVE 'Y' TO WS-NBR-EQUAL
                  //  LITERAL_Y = 'Y'
                  work.setNbrEqual(CONSTANTS.LITERAL_Y);
//  MOVE SPACES TO WS-HOLD-PS
                  holdTransData.setHoldPs(CONSTANTS.SPACE_2);
  
//  MOVE SPACES TO WS-HOLD-SVC
                  holdTransData.setHoldSvc(CONSTANTS.SPACE_6);
  
//  MOVE SPACES TO WS-HOLD-CAUSE-CD
                  holdTransData.setHoldCauseCd(CONSTANTS.SPACE);
  
//  MOVE SPACES TO WS-HOLD-SPI-TBL-ID WS-HOLD-POS-TIER-CD WS-HOLD-DIAG-ELG-IND WS-FCND-PS WS-FCND-SVC WS-FCND-CAUSE-CD WS-FRTO-PS WS-FRTO-SVC WS-FRTO-CAUSE-CD WS-PTYP-PS WS-PTYP-SVC WS-PTYP-CAUSE-CD WS-RICD-PS WS-RICD-SVC WS-RICD-CAUSE-CD WS-CAUS-PS WS-CAUS-SVC WS-CAUS-CAUSE-CD WS-RIPA-PS WS-RIPA-SVC WS-RIPA-CAUSE-CD WS-CFLG-PS WS-CFLG-SVC WS-CFLG-CAUSE-CD
                  holdTransData.setHoldSpiTblId(CONSTANTS.SPACE_7);
                  holdTransData.setHoldPosTierCd(CONSTANTS.SPACE);
                  holdTransData.setHoldDiagElgInd(CONSTANTS.SPACE);
                  holdTransData2.setFcndPs(CONSTANTS.SPACE_2);
                  holdTransData2.setFcndSvc(CONSTANTS.SPACE_6);
                  holdTransData2.setFcndCauseCd(CONSTANTS.SPACE);
                  holdTransData2.setFrtoPs(CONSTANTS.SPACE_2);
                  holdTransData2.setFrtoSvc(CONSTANTS.SPACE_6);
                  holdTransData2.setFrtoCauseCd(CONSTANTS.SPACE);
                  holdTransData2.setPtypPs(CONSTANTS.SPACE_2);
                  holdTransData2.setPtypSvc(CONSTANTS.SPACE_6);
                  holdTransData2.setPtypCauseCd(CONSTANTS.SPACE);
                  holdTransData2.setRicdPs(CONSTANTS.SPACE_2);
                  holdTransData2.setRicdSvc(CONSTANTS.SPACE_6);
                  holdTransData2.setRicdCauseCd(CONSTANTS.SPACE);
                  holdTransData2.setCausPs(CONSTANTS.SPACE_2);
                  holdTransData2.setCausSvc(CONSTANTS.SPACE_6);
                  holdTransData2.setCausCauseCd(CONSTANTS.SPACE);
                  holdTransData2.setRipaPs(CONSTANTS.SPACE_2);
                  holdTransData2.setRipaSvc(CONSTANTS.SPACE_6);
                  holdTransData2.setRipaCauseCd(CONSTANTS.SPACE);
                  holdTransData2.setCflgPs(CONSTANTS.SPACE_2);
                  holdTransData2.setCflgSvc(CONSTANTS.SPACE_6);
                  holdTransData2.setCflgCauseCd(CONSTANTS.SPACE);
  
//  MOVE ZEROS TO WS-NBR-MATCHED
                  workFields.setNbrMatched( 0);
              }
  
          }
      
      }
      /**
      * searchPs2110D 
      *   This method is derived from 
  *   COBOL Paragraph - 2110D-SEARCH-PS SECTION COBOL Cyclomatic complexity - 6
      * Input  :  

      * - d51uFcndDrvPos                 COBOL Name: D51U-FCND-DRV-POS
      * - prevPs                         COBOL Name: WS-PREV-PS
      * - d51uFcndDrvSvc                 COBOL Name: D51U-FCND-DRV-SVC
      * - prevSvc                        COBOL Name: WS-PREV-SVC
      * - d51uFcndDrvCau                 COBOL Name: D51U-FCND-DRV-CAU
      * - prevCauseCd                    COBOL Name: WS-PREV-CAUSE-CD
      * - psSub                          COBOL Name: PS-SUB
      * - d51uFcndFromCondPos            COBOL Name: D51U-FCND-FROM-COND-POS
      * - uLinePos51                     COBOL Name: LK-51U-LINE-POS
      * - sub01                          COBOL Name: LK-SUB
      * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
      *
      * Output :  

      * - paragraph                      COBOL Name: WS-PARAGRAPH
      * - sameTable                      COBOL Name: WS-SAME-TABLE
      * - searchComplete                 COBOL Name: WS-SEARCH-COMPLETE
      * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
      * - fromPsFound                    COBOL Name: WS-FROM-PS-FOUND
      * - fcndPs                         COBOL Name: WS-FCND-PS
      * - d51uFcndDrvPos                 COBOL Name: D51U-FCND-DRV-POS
      * - fcndSvc                        COBOL Name: WS-FCND-SVC
      * - d51uFcndDrvSvc                 COBOL Name: D51U-FCND-DRV-SVC
      * - fcndCauseCd                    COBOL Name: WS-FCND-CAUSE-CD
      * - d51uFcndDrvCau                 COBOL Name: D51U-FCND-DRV-CAU
      *
      * @throws CFException
      */
      private void searchPs2110D() throws Exception {
			// Declare local variables used in the method
			D51uRetRulFrCondPos d51uRetRulFrCondPos = vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulFrCondPos();
			HoldTransData2 holdTransData2 = workFields.getHoldTransData2();
			M51uLinkage m51uLinkage = dfhcommarea.getLinkAreaM51u().getM51uLinkage();
			PrevMatchedKey prevMatchedKey = workFields.getPrevMatchedKey();
			char[] prevPs = null;
			char[] prevSvc = null;
			char[] prevCauseCd = null;
			// End of variable declaration

//  MOVE '2110D' TO WS-PARAGRAPH
//  LITERAL_2110D = '2110D'
          workFields.setParagraph(CONSTANTS.LITERAL_2110D);
          prevCauseCd = prevMatchedKey.getPrevCauseCd();
          prevSvc = prevMatchedKey.getPrevSvc();
          prevPs = prevMatchedKey.getPrevPs();
//  IF D51U-FCND-DRV-POS ( PS-SUB ) = WS-PREV-PS AND D51U-FCND-DRV-SVC ( PS-SUB ) = WS-PREV-SVC AND D51U-FCND-DRV-CAU ( PS-SUB ) = WS-PREV-CAUSE-CD
          if (		compareChars(d51uRetRulFrCondPos.getD51uRetRuleFrCondPos(work.getPsSub() - 1).getD51uFcndDrvPos(),prevPs) == 0  && 		compareChars(d51uRetRulFrCondPos.getD51uRetRuleFrCondPos(work.getPsSub() - 1).getD51uFcndDrvSvc(),prevSvc) == 0  && 		compareChars(d51uRetRulFrCondPos.getD51uRetRuleFrCondPos(work.getPsSub() - 1).getD51uFcndDrvCau(),prevCauseCd) == 0 ) { 
//  SET SAME-TABLE TO TRUE
              work.setSameTable1True(); 
              
//  IF D51U-FCND-FROM-COND-POS ( PS-SUB ) EQUAL SPACES
              if (        ( allSpaces(d51uRetRulFrCondPos.getD51uRetRuleFrCondPos(work.getPsSub() - 1).getD51uFcndFromCondPos())   )) { 
                  // MOVE 'Y' TO WS-SEARCH-COMPLETE
                  //  LITERAL_Y = 'Y'
                  work.setSearchComplete(CONSTANTS.LITERAL_Y);
              }
  
//  ELSE
              else { 
//  IF LK-51U-LINE-POS ( LK-SUB ) = D51U-FCND-FROM-COND-POS ( PS-SUB )
                  if (		compareChars(m51uLinkage.getULineData51(work.getSub01() - 1).getULinePos51(),d51uRetRulFrCondPos.getD51uRetRuleFrCondPos(work.getPsSub() - 1).getD51uFcndFromCondPos()) == 0 ) { 
//  ADD 1 TO WS-NBR-MATCHED
                      workFields.setNbrMatched( (short) (workFields.getNbrMatched()+(short)1));
                      // MOVE 'Y' TO WS-FROM-PS-FOUND
                      //  LITERAL_Y = 'Y'
                      work.setFromPsFound(CONSTANTS.LITERAL_Y);
//  MOVE D51U-FCND-DRV-POS ( PS-SUB ) TO WS-FCND-PS
                      holdTransData2.setFcndPs(vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulFrCondPos().getD51uRetRuleFrCondPos(work.getPsSub() - 1).getD51uFcndDrvPos());
  
//  MOVE D51U-FCND-DRV-SVC ( PS-SUB ) TO WS-FCND-SVC
                      holdTransData2.setFcndSvc(vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulFrCondPos().getD51uRetRuleFrCondPos(work.getPsSub() - 1).getD51uFcndDrvSvc());
  
//  MOVE D51U-FCND-DRV-CAU ( PS-SUB ) TO WS-FCND-CAUSE-CD
                      holdTransData2.setFcndCauseCd(vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulFrCondPos().getD51uRetRuleFrCondPos(work.getPsSub() - 1).getD51uFcndDrvCau());
  
                  }
  
              }
          }
  
      
      }
      /**
      * searchSvc2120D 
      *   This method is derived from 
  *   COBOL Paragraph - 2120D-SEARCH-SVC SECTION COBOL Cyclomatic complexity - 7
      * Input  :  

      * - d51uFrtoDrvPos                 COBOL Name: D51U-FRTO-DRV-POS
      * - prevPs                         COBOL Name: WS-PREV-PS
      * - d51uFrtoDrvSvc                 COBOL Name: D51U-FRTO-DRV-SVC
      * - prevSvc                        COBOL Name: WS-PREV-SVC
      * - d51uFrtoDrvCau                 COBOL Name: D51U-FRTO-DRV-CAU
      * - prevCauseCd                    COBOL Name: WS-PREV-CAUSE-CD
      * - svcSub                         COBOL Name: SVC-SUB
      * - d51uFrtoClmFrmSvcCd            COBOL Name: D51U-FRTO-CLM-FRM-SVC-CD
      * - d51uFrtoClmToSvcCd             COBOL Name: D51U-FRTO-CLM-TO-SVC-CD
      * - fromSvcFound                   COBOL Name: WS-FROM-SVC-FOUND
      *
      * Output :  

      * - paragraph                      COBOL Name: WS-PARAGRAPH
      * - sameTable                      COBOL Name: WS-SAME-TABLE
      * - searchComplete                 COBOL Name: WS-SEARCH-COMPLETE
      * - d51uFrtoClmToSvcCd             COBOL Name: D51U-FRTO-CLM-TO-SVC-CD
      * - d51uFrtoClmFrmSvcCd            COBOL Name: D51U-FRTO-CLM-FRM-SVC-CD
      * - frtoPs                         COBOL Name: WS-FRTO-PS
      * - d51uFrtoDrvPos                 COBOL Name: D51U-FRTO-DRV-POS
      * - frtoSvc                        COBOL Name: WS-FRTO-SVC
      * - d51uFrtoDrvSvc                 COBOL Name: D51U-FRTO-DRV-SVC
      * - frtoCauseCd                    COBOL Name: WS-FRTO-CAUSE-CD
      * - d51uFrtoDrvCau                 COBOL Name: D51U-FRTO-DRV-CAU
      *
      * @throws CFException
      */
      private void searchSvc2120D() throws Exception {
			// Declare local variables used in the method
			D51uRetRulFrToSvc d51uRetRulFrToSvc = vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulFrToSvc();
			HoldTransData2 holdTransData2 = workFields.getHoldTransData2();
			PrevMatchedKey prevMatchedKey = workFields.getPrevMatchedKey();
			char[] prevPs = null;
			char[] prevSvc = null;
			char[] prevCauseCd = null;
			// End of variable declaration

      
// *81***************************************************************
// *81 2120D-search-svc                                             *
// *81                                                              *
// *81 business function:                                           *
// *81 this section checks for a match on the service codes         *
// *81***************************************************************
// *82***************************************************************
// *82 2120d-search-svc                                             *
// *82                                                              *
// *82 1. if the service variable in the record is empty, then set  *
// *82    a switch to indicate that the search is complete.         *
// *82 2. perform a check on the service code matches.              *
// *82 3. when service codes match is found, a flag is set and a    *
// *82    counter is accumulated to indicate number of matches.     *
// *82    match should be within to and from spi svc, if both are   *
// *82    present                                                   *
// *82***************************************************************

// *-------------------*

// *Qc9901     if   d51u-frto-drv-pos(svc-sub)  =  spaces
// *qc9901     and  d51u-frto-drv-svc(svc-sub)  =  spaces
// *45917c     and  d51u-frto-drv-cau(svc-sub)  =  spaces
// *45917s         move 'y' to ws-search-complete
// *45917s         go to 2120d-exit
// *qc9901     end-if.
//  MOVE '2120D' TO WS-PARAGRAPH
//  LITERAL_2120D = '2120D'
          workFields.setParagraph(CONSTANTS.LITERAL_2120D);
          prevCauseCd = prevMatchedKey.getPrevCauseCd();
          prevSvc = prevMatchedKey.getPrevSvc();
          prevPs = prevMatchedKey.getPrevPs();
//  IF D51U-FRTO-DRV-POS ( SVC-SUB ) = WS-PREV-PS AND D51U-FRTO-DRV-SVC ( SVC-SUB ) = WS-PREV-SVC AND D51U-FRTO-DRV-CAU ( SVC-SUB ) = WS-PREV-CAUSE-CD
          if (		compareChars(d51uRetRulFrToSvc.getD51uRetRuleFromtoSvc(work.getSvcSub() - 1).getD51uFrtoDrvPos(),prevPs) == 0  && 		compareChars(d51uRetRulFrToSvc.getD51uRetRuleFromtoSvc(work.getSvcSub() - 1).getD51uFrtoDrvSvc(),prevSvc) == 0  && 		compareChars(d51uRetRulFrToSvc.getD51uRetRuleFromtoSvc(work.getSvcSub() - 1).getD51uFrtoDrvCau(),prevCauseCd) == 0 ) { 
//  SET SAME-TABLE TO TRUE
              work.setSameTable1True(); 
              
//  IF D51U-FRTO-CLM-FRM-SVC-CD ( SVC-SUB ) EQUAL SPACES
              if (        ( allSpaces(d51uRetRulFrToSvc.getD51uRetRuleFromtoSvc(work.getSvcSub() - 1).getD51uFrtoClmFrmSvcCd())   )) { 
                  // MOVE 'Y' TO WS-SEARCH-COMPLETE
                  //  LITERAL_Y = 'Y'
                  work.setSearchComplete(CONSTANTS.LITERAL_Y);
//cobolCode::GO TO 2120D-EXIT
return ;
//cobolCodeEnds::GO TO 2120D-EXIT
              }
  
//  ELSE
              else { 
//  IF D51U-FRTO-CLM-TO-SVC-CD ( SVC-SUB ) EQUAL SPACES
                  if (        ( allSpaces(d51uRetRulFrToSvc.getD51uRetRuleFromtoSvc(work.getSvcSub() - 1).getD51uFrtoClmToSvcCd())   )) { 
//  MOVE D51U-FRTO-CLM-FRM-SVC-CD ( SVC-SUB ) TO D51U-FRTO-CLM-TO-SVC-CD ( SVC-SUB )
                      vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulFrToSvc().getD51uRetRuleFromtoSvc(work.getSvcSub() - 1).setD51uFrtoClmToSvcCd(vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulFrToSvc().getD51uRetRuleFromtoSvc(work.getSvcSub() - 1).getD51uFrtoClmFrmSvcCd());
                  }
  
//  PERFORM 2125D-TOPS-CNVSVC-FR-TO THRU 2125D-EXIT
                  topsCnvsvcFrTo2125D();/*2125D-TOPS-CNVSVC-FR-TO SECTION*/
//  IF FROM-SVC-FOUND
                  if ( work.isFromSvcFound1()  ) { 
//  MOVE D51U-FRTO-DRV-POS ( SVC-SUB ) TO WS-FRTO-PS
                      holdTransData2.setFrtoPs(vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulFrToSvc().getD51uRetRuleFromtoSvc(work.getSvcSub() - 1).getD51uFrtoDrvPos());
  
//  MOVE D51U-FRTO-DRV-SVC ( SVC-SUB ) TO WS-FRTO-SVC
                      holdTransData2.setFrtoSvc(vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulFrToSvc().getD51uRetRuleFromtoSvc(work.getSvcSub() - 1).getD51uFrtoDrvSvc());
  
//  MOVE D51U-FRTO-DRV-CAU ( SVC-SUB ) TO WS-FRTO-CAUSE-CD
                      holdTransData2.setFrtoCauseCd(vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulFrToSvc().getD51uRetRuleFromtoSvc(work.getSvcSub() - 1).getD51uFrtoDrvCau());
  
                  }
              }
          }
  
      
      }
      /**
      * topsCnvsvcFrTo2125D 
      *   This method is derived from 
  *   COBOL Paragraph - 2125D-TOPS-CNVSVC-FR-TO SECTION COBOL Cyclomatic complexity - 55
      * Input  :  

      * - d51uFrtoClmToSvcCd             COBOL Name: D51U-FRTO-CLM-TO-SVC-CD
      * - d51uFrtoClmFrmSvcCd            COBOL Name: D51U-FRTO-CLM-FRM-SVC-CD
      * - d51uFrtoSvcTypCd               COBOL Name: D51U-FRTO-SVC-TYP-CD
      * - svcSub                         COBOL Name: SVC-SUB
      * - medSvc                         COBOL Name: MED-SVC
      * - uLineServiceCode51             COBOL Name: LK-51U-LINE-SERVICE-CODE
      * - uMedicalClaim51                COBOL Name: LK-51U-MEDICAL-CLAIM
      * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
      * - svc1af                         COBOL Name: SVC-1AF
      * - svc25af                        COBOL Name: SVC-2-5AF
      * - feSvc1afFr                     COBOL Name: FE-SVC-1AF-FR
      * - feSvc25afFr                    COBOL Name: FE-SVC-2-5AF-FR
      * - feSvc1afTo                     COBOL Name: FE-SVC-1AF-TO
      * - feSvc25afTo                    COBOL Name: FE-SVC-2-5AF-TO
      * - svc14al                        COBOL Name: SVC-1-4AL
      * - svc5al                         COBOL Name: SVC-5AL
      * - feSvc14alFr                    COBOL Name: FE-SVC-1-4AL-FR
      * - feSvc5alFr                     COBOL Name: FE-SVC-5AL-FR
      * - feSvc14alTo                    COBOL Name: FE-SVC-1-4AL-TO
      * - feSvc5alTo                     COBOL Name: FE-SVC-5AL-TO
      *
      * Output :  

      * - feServTo                       COBOL Name: FE-SERV-TO
      * - d51uFrtoClmToSvcCd             COBOL Name: D51U-FRTO-CLM-TO-SVC-CD
      * - feServFr                       COBOL Name: FE-SERV-FR
      * - d51uFrtoClmFrmSvcCd            COBOL Name: D51U-FRTO-CLM-FRM-SVC-CD
      * - servTop                        COBOL Name: WS-SERV-TOP
      * - medSvc                         COBOL Name: MED-SVC
      * - uLineServiceCode51             COBOL Name: LK-51U-LINE-SERVICE-CODE
      * - svc15                          COBOL Name: SVC-1-5
      * - svc6                           COBOL Name: SVC-6
      * - feSvc15Fr                      COBOL Name: FE-SVC-1-5-FR
      * - fromSvcFound                   COBOL Name: WS-FROM-SVC-FOUND
      * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
      * - feSvc15To                      COBOL Name: FE-SVC-1-5-TO
      * - feSvc6Fr                       COBOL Name: FE-SVC-6-FR
      *
      * @throws CFException
      */
      private void topsCnvsvcFrTo2125D() throws Exception {
			// Declare local variables used in the method
			D51uRetRulFrToSvc d51uRetRulFrToSvc = vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulFrToSvc();
			ServTop servTop = workFields.getServTop();
			FeServFr feServFr = workFields.getFeServFr();
			char[] svc15 = null;
			char[] feSvc15Fr = null;
			char[] svc6 = null;
			char[] uMedicalClaim51 = null;
			char[] svc25af = null;
			char[] feSvc25afTo = null;
			char[] svc1af = null;
			char[] feSvc1afFr = null;
			char[] feSvc25afFr = null;
			char[] feSvc1afTo = null;
			char[] svc14al = null;
			char[] feSvc14alTo = null;
			char[] feSvc5alFr = null;
			char[] feSvc5alTo = null;
			char[] feSvc6Fr = null;
			char[] feSvc15To = null;
			M51uLinkage m51uLinkage = dfhcommarea.getLinkAreaM51u().getM51uLinkage();
			ServToAlphatf servToAlphatf = workFields.getServToAlphatf();
			ServAlphaf servAlphaf = workFields.getServAlphaf();
			ServToAlphaff servToAlphaff = workFields.getServToAlphaff();
			ServToAlphatl servToAlphatl = workFields.getServToAlphatl();
			ServAlphal servAlphal = workFields.getServAlphal();
			ServToAlphafl servToAlphafl = workFields.getServToAlphafl();
			FeServTo feServTo = workFields.getFeServTo();
			// End of variable declaration

      
// *81***************************************************************
// *81 2125D-tops-cnvsvc-fr-to                                      *
// *81                                                              *
// *81 business function:                                           *
// *81 checks for matches on tops service codes.                    *
// *81***************************************************************
// *82***************************************************************
// *82 2125d-tops-cnvsvc-fr-to                                      *
// *82                                                              *
// *82 1. populate the tops service codes with the appropriate value*
// *82 2. perform a check on the service codes.                     *
// *82            1. check for a match on the first five digits.    *
// *82            2. check for a match on the first six digits.     *
// *82            3. check for a match on the first three digits.   *
// *82 3. for every match, increment the match counter.             *
// *82***************************************************************

// *-----------------------*
//  MOVE D51U-FRTO-CLM-TO-SVC-CD ( SVC-SUB ) TO FE-SERV-TO
          workFields.setFeServTo(vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulFrToSvc().getD51uRetRuleFromtoSvc(work.getSvcSub() - 1).getD51uFrtoClmToSvcCd());
//  MOVE D51U-FRTO-CLM-FRM-SVC-CD ( SVC-SUB ) TO FE-SERV-FR
          workFields.setFeServFr(vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulFrToSvc().getD51uRetRuleFromtoSvc(work.getSvcSub() - 1).getD51uFrtoClmFrmSvcCd());
//  IF D51U-FRTO-SVC-TYP-CD ( SVC-SUB ) = 'T'
          if (d51uRetRulFrToSvc.getD51uRetRuleFromtoSvc(work.getSvcSub() - 1).getD51uFrtoSvcTypCd()[0] == 'T') { 
//  MOVE MED-SVC TO WS-SERV-TOP
              workFields.setServTop(work.getMedSvc());
          }
  
//  ELSE
          else { 
//  MOVE LK-51U-LINE-SERVICE-CODE ( LK-SUB ) TO WS-SERV-TOP
              workFields.setServTop(dfhcommarea.getLinkAreaM51u().getM51uLinkage().getULineData51(work.getSub01() - 1).getULineServiceCode51());
          }
          uMedicalClaim51 = m51uLinkage.getUMedicalClaim51();
          svc15 = servTop.getSvc15();
//  IF ( SVC-1-5 (1 : 1) = 'C' ) AND LK-51U-MEDICAL-CLAIM NOT = 'Y'
//  LITERAL_Y = 'Y'
          if (( svc15[0] == 'C') && uMedicalClaim51[0] != 'Y') { 
              svc6 = servTop.getSvc6();
//  IF D51U-FRTO-SVC-TYP-CD ( SVC-SUB ) = 'S' AND SVC-6 NOT = SPACES
              if (d51uRetRulFrToSvc.getD51uRetRuleFromtoSvc(work.getSvcSub() - 1).getD51uFrtoSvcTypCd()[0] == 'S' &&         ( !allSpaces(svc6)  )) { 
                  feSvc15Fr = feServFr.getFeSvc15Fr();
                  svc15 = servTop.getSvc15();
//  IF ( SVC-1-5 (1 : 3) = FE-SVC-1-5-FR (1 : 3))
                  if ((		compareChars(substring(svc15,0,3),substring(feSvc15Fr,0,3)) == 0 )) { 
                      // MOVE 'Y' TO WS-FROM-SVC-FOUND
                      //  LITERAL_Y = 'Y'
                      work.setFromSvcFound(CONSTANTS.LITERAL_Y);
//  ADD 1 TO WS-NBR-MATCHED
                      workFields.setNbrMatched( (short) (workFields.getNbrMatched()+(short)1));
                  }
  
//cobolCode::GO TO 2125D-EXIT
return ;
//cobolCodeEnds::GO TO 2125D-EXIT
              }
  
              svc6 = servTop.getSvc6();
//  IF D51U-FRTO-SVC-TYP-CD ( SVC-SUB ) = 'C' OR 'H' AND SVC-6 NOT = SPACES
              if (d51uRetRulFrToSvc.getD51uRetRuleFromtoSvc(work.getSvcSub() - 1).getD51uFrtoSvcTypCd()[0] == 'C' || d51uRetRulFrToSvc.getD51uRetRuleFromtoSvc(work.getSvcSub() - 1).getD51uFrtoSvcTypCd()[0] == 'H' &&         ( !allSpaces(svc6)  )) { 
//cobolCode::GO TO 2125D-EXIT
return ;
//cobolCodeEnds::GO TO 2125D-EXIT
              }
  
          }
  
          feSvc15To = feServTo.getFeSvc15To();
          svc15 = servTop.getSvc15();
//  IF ( SVC-1-5 NOT < FE-SVC-1-5-FR ) AND ( SVC-1-5 NOT > FE-SVC-1-5-TO )
          if ((		compareChars(svc15,feServFr.getFeSvc15Fr()) >= 0 ) && (		compareChars(svc15,feSvc15To) <= 0 )) { 

// *** Do not want a hit on rev code range if it's a medical claim!
//  IF D51U-FRTO-SVC-TYP-CD ( SVC-SUB ) = 'R'
              if (d51uRetRulFrToSvc.getD51uRetRuleFromtoSvc(work.getSvcSub() - 1).getD51uFrtoSvcTypCd()[0] == 'R') { 
                  uMedicalClaim51 = m51uLinkage.getUMedicalClaim51();
//  IF LK-51U-MEDICAL-CLAIM = 'Y'
//  LITERAL_Y = 'Y'
                  if (compareChars(uMedicalClaim51, CONSTANTS.LITERAL_Y) == 0) { 
//cobolCode::GO TO 2125D-EXIT
return ;
//cobolCodeEnds::GO TO 2125D-EXIT
                  }
  
              }
  
//  IF D51U-FRTO-SVC-TYP-CD ( SVC-SUB ) = 'C' OR 'H'
              if (d51uRetRulFrToSvc.getD51uRetRuleFromtoSvc(work.getSvcSub() - 1).getD51uFrtoSvcTypCd()[0] == 'C' || d51uRetRulFrToSvc.getD51uRetRuleFromtoSvc(work.getSvcSub() - 1).getD51uFrtoSvcTypCd()[0] == 'H') { 
//  IF ( FE-SVC-1-5-FR (5 : 1) NOT EQUAL SPACE AND SVC-1-5 (5 : 1) NOT EQUAL SPACE)
                  feSvc15Fr = feServFr.getFeSvc15Fr();
                  svc15 = servTop.getSvc15();
//  ELSE
                  if ((feSvc15Fr[4] == ' ' || svc15[4] == ' ')) { 
//cobolCode::GO TO 2125D-EXIT
return ;
//cobolCodeEnds::GO TO 2125D-EXIT
                  }
  
                  svc15 = servTop.getSvc15();
//  IF SVC-1-5 (2 : 1) IS ALPHABETIC OR SVC-1-5 (3 : 1) IS ALPHABETIC OR SVC-1-5 (4 : 1) IS ALPHABETIC
                  if (		(isAlphabetic(substring(svc15,1,2))) /*Alphabetic*/ || 		(isAlphabetic(substring(svc15,2,3))) /*Alphabetic*/ || 		(isAlphabetic(substring(svc15,3,4))) /*Alphabetic*/) { 
//cobolCode::GO TO 2125D-EXIT
return ;
//cobolCodeEnds::GO TO 2125D-EXIT
                  }
  
                  feSvc25afTo = servToAlphatf.getFeSvc25afTo();
//  IF ( SVC-1AF IS ALPHABETIC) AND ( SVC-2-5AF IS NUMERIC) AND ( FE-SVC-1AF-FR IS ALPHABETIC) AND ( FE-SVC-2-5AF-FR IS NUMERIC) AND ( FE-SVC-1AF-TO IS ALPHABETIC) AND ( FE-SVC-2-5AF-TO IS NUMERIC)
                  if ((		(isAlphabetic(servAlphaf.getSvc1af())) /*Alphabetic*/) && (    isNumeric(servAlphaf.getSvc25af())) && (		(isAlphabetic(servToAlphaff.getFeSvc1afFr())) /*Alphabetic*/) && (    isNumeric(servToAlphaff.getFeSvc25afFr())) && (		(isAlphabetic(servToAlphatf.getFeSvc1afTo())) /*Alphabetic*/) && (    isNumeric(feSvc25afTo))) { 

// ***When from and to range starts with same alpha character
                      feSvc1afFr = servToAlphaff.getFeSvc1afFr();
                      svc1af = servAlphaf.getSvc1af();
//  IF ( FE-SVC-1AF-FR = FE-SVC-1AF-TO ) AND ( SVC-1AF = FE-SVC-1AF-FR )
                      if ((		compareChars(feSvc1afFr,servToAlphatf.getFeSvc1afTo()) == 0 ) && (		compareChars(svc1af,feSvc1afFr) == 0 )) { 
//  IF ( SVC-2-5AF NOT < FE-SVC-2-5AF-FR ) AND ( SVC-2-5AF NOT > FE-SVC-2-5AF-TO )
                          svc25af = servAlphaf.getSvc25af();
                          feSvc25afTo = servToAlphatf.getFeSvc25afTo();
//  ELSE
                          if ((		compareChars(svc25af,workFields.getServToAlphaff().getFeSvc25afFr()) < 0 ) || (		compareChars(svc25af,feSvc25afTo) > 0 )) { 
//cobolCode::GO TO 2125D-EXIT
return ;
//cobolCodeEnds::GO TO 2125D-EXIT
                          }
  
                      }
  

// ***From and to range has diff alpha,service match to 'from range'
                      feSvc1afFr = servToAlphaff.getFeSvc1afFr();
                      svc1af = servAlphaf.getSvc1af();
//  IF ( FE-SVC-1AF-FR NOT = FE-SVC-1AF-TO ) AND ( SVC-1AF = FE-SVC-1AF-FR )
                      if ((		compareChars(feSvc1afFr,servToAlphatf.getFeSvc1afTo()) != 0 ) && (		compareChars(svc1af,feSvc1afFr) == 0 )) { 
//  IF ( SVC-2-5AF NOT < FE-SVC-2-5AF-FR )
                          svc25af = servAlphaf.getSvc25af();
                          feSvc25afFr = servToAlphaff.getFeSvc25afFr();
//  ELSE
                          if ((		compareChars(svc25af,feSvc25afFr) < 0 )) { 
//cobolCode::GO TO 2125D-EXIT
return ;
//cobolCodeEnds::GO TO 2125D-EXIT
                          }
  
                      }
  

// ***From and to range has diff alpha,service match with 'to range'
                      feSvc1afTo = servToAlphatf.getFeSvc1afTo();
                      svc1af = servAlphaf.getSvc1af();
//  IF ( FE-SVC-1AF-FR NOT = FE-SVC-1AF-TO ) AND ( SVC-1AF = FE-SVC-1AF-TO )
                      if ((		compareChars(servToAlphaff.getFeSvc1afFr(),feSvc1afTo) != 0 ) && (		compareChars(svc1af,feSvc1afTo) == 0 )) { 
//  IF ( SVC-2-5AF NOT > FE-SVC-2-5AF-TO )
                          svc25af = servAlphaf.getSvc25af();
                          feSvc25afTo = servToAlphatf.getFeSvc25afTo();
//  ELSE
                          if ((		compareChars(svc25af,feSvc25afTo) > 0 )) { 
//cobolCode::GO TO 2125D-EXIT
return ;
//cobolCodeEnds::GO TO 2125D-EXIT
                          }
  
                      }
  

// ***From and to range has diff alpha,service match in between
// ***'from' and 'to' range,no numeric check is required
                      feSvc1afFr = servToAlphaff.getFeSvc1afFr();
                      svc1af = servAlphaf.getSvc1af();
//  IF ( FE-SVC-1AF-FR NOT = FE-SVC-1AF-TO ) AND ( SVC-1AF NOT = FE-SVC-1AF-TO ) AND ( SVC-1AF NOT = FE-SVC-1AF-FR )
                      if ((		compareChars(feSvc1afFr,servToAlphatf.getFeSvc1afTo()) != 0 ) && (		compareChars(svc1af,servToAlphatf.getFeSvc1afTo()) != 0 ) && (		compareChars(svc1af,feSvc1afFr) != 0 )) { 
//  IF ( SVC-1AF > FE-SVC-1AF-FR ) AND ( SVC-1AF < FE-SVC-1AF-TO )
                          feSvc1afTo = servToAlphatf.getFeSvc1afTo();
                          svc1af = servAlphaf.getSvc1af();
//  ELSE
                          if ((		compareChars(svc1af,workFields.getServToAlphaff().getFeSvc1afFr()) <= 0 ) || (		compareChars(svc1af,feSvc1afTo) >= 0 )) { 
//cobolCode::GO TO 2125D-EXIT
return ;
//cobolCodeEnds::GO TO 2125D-EXIT
                          }
  
                      }
  
                  }
  
//  ELSE
                  else { 
                      feSvc5alTo = servToAlphatl.getFeSvc5alTo();
//  IF ( SVC-1-4AL IS NUMERIC) AND ( SVC-5AL IS ALPHABETIC) AND ( FE-SVC-1-4AL-FR IS NUMERIC) AND ( FE-SVC-5AL-FR IS ALPHABETIC) AND ( FE-SVC-1-4AL-TO IS NUMERIC) AND ( FE-SVC-5AL-TO IS ALPHABETIC)
                      if ((    isNumeric(servAlphal.getSvc14al())) && (		(isAlphabetic(servAlphal.getSvc5al())) /*Alphabetic*/) && (    isNumeric(servToAlphafl.getFeSvc14alFr())) && (		(isAlphabetic(servToAlphafl.getFeSvc5alFr())) /*Alphabetic*/) && (    isNumeric(servToAlphatl.getFeSvc14alTo())) && (		(isAlphabetic(feSvc5alTo)) /*Alphabetic*/)) { 
                          feSvc5alFr = servToAlphafl.getFeSvc5alFr();
                          feSvc5alTo = servToAlphatl.getFeSvc5alTo();
//  IF FE-SVC-5AL-FR = FE-SVC-5AL-TO
                          if (		compareChars(feSvc5alFr,feSvc5alTo) == 0 ) { 
//  IF ( SVC-1-4AL NOT < FE-SVC-1-4AL-FR ) AND ( SVC-1-4AL NOT > FE-SVC-1-4AL-TO )
                              svc14al = servAlphal.getSvc14al();
                              feSvc14alTo = servToAlphatl.getFeSvc14alTo();
//  ELSE
                              if ((		compareChars(svc14al,workFields.getServToAlphafl().getFeSvc14alFr()) < 0 ) || (		compareChars(svc14al,feSvc14alTo) > 0 )) { 
//cobolCode::GO TO 2125D-EXIT
return ;
//cobolCodeEnds::GO TO 2125D-EXIT
                              }
  
                          }
  
                      }
  
                  }
              }
  
              feSvc6Fr = feServFr.getFeSvc6Fr();
//  IF FE-SVC-6-FR NOT = SPACES
              if (        ( !allSpaces(feSvc6Fr)  )) { 
                  svc6 = servTop.getSvc6();
                  feSvc6Fr = feServFr.getFeSvc6Fr();
//  IF SVC-6 = FE-SVC-6-FR
                  if (		compareChars(svc6,feSvc6Fr) == 0 ) { 
                      // MOVE 'Y' TO WS-FROM-SVC-FOUND
                      //  LITERAL_Y = 'Y'
                      work.setFromSvcFound(CONSTANTS.LITERAL_Y);
//  ADD 1 TO WS-NBR-MATCHED
                      workFields.setNbrMatched( (short) (workFields.getNbrMatched()+(short)1));
                  }
  
//  ELSE
                  else { 
                      svc6 = servTop.getSvc6();
                      feSvc6Fr = feServFr.getFeSvc6Fr();
//  IF SVC-6 = 'C' AND FE-SVC-6-FR = '2'
//  LITERAL_2 = '2'
                      if (compareChars(svc6, CONSTANTS.LITERAL_C) == 0 && compareChars(feSvc6Fr, CONSTANTS.LITERAL_2) == 0) { 
                          // MOVE 'Y' TO WS-FROM-SVC-FOUND
                          //  LITERAL_Y = 'Y'
                          work.setFromSvcFound(CONSTANTS.LITERAL_Y);
//  ADD 1 TO WS-NBR-MATCHED
                          workFields.setNbrMatched( (short) (workFields.getNbrMatched()+(short)1));
                      }
  
//  ELSE
                  }
              }
  
//  ELSE
              else { 
                  // MOVE 'Y' TO WS-FROM-SVC-FOUND
                  //  LITERAL_Y = 'Y'
                  work.setFromSvcFound(CONSTANTS.LITERAL_Y);
//  ADD 1 TO WS-NBR-MATCHED
                  workFields.setNbrMatched( (short) (workFields.getNbrMatched()+(short)1));
              }
          }
  
      
      }
      /**
      * searchPrv2130D 
      *   This method is derived from 
  *   COBOL Paragraph - 2130D-SEARCH-PRV SECTION COBOL Cyclomatic complexity - 6
      * Input  :  

      * - d51uPtypDrvPos                 COBOL Name: D51U-PTYP-DRV-POS
      * - prevPs                         COBOL Name: WS-PREV-PS
      * - d51uPtypDrvSvc                 COBOL Name: D51U-PTYP-DRV-SVC
      * - prevSvc                        COBOL Name: WS-PREV-SVC
      * - d51uPtypDrvCau                 COBOL Name: D51U-PTYP-DRV-CAU
      * - prevCauseCd                    COBOL Name: WS-PREV-CAUSE-CD
      * - pvSub                          COBOL Name: PV-SUB
      * - d51uPtypProvTyp                COBOL Name: D51U-PTYP-PROV-TYP
      * - uProvType51                    COBOL Name: LK-51U-PROV-TYPE
      * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
      *
      * Output :  

      * - paragraph                      COBOL Name: WS-PARAGRAPH
      * - sameTable                      COBOL Name: WS-SAME-TABLE
      * - searchComplete                 COBOL Name: WS-SEARCH-COMPLETE
      * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
      * - fromPrvFound                   COBOL Name: WS-FROM-PRV-FOUND
      * - ptypPs                         COBOL Name: WS-PTYP-PS
      * - d51uPtypDrvPos                 COBOL Name: D51U-PTYP-DRV-POS
      * - ptypSvc                        COBOL Name: WS-PTYP-SVC
      * - d51uPtypDrvSvc                 COBOL Name: D51U-PTYP-DRV-SVC
      * - ptypCauseCd                    COBOL Name: WS-PTYP-CAUSE-CD
      * - d51uPtypDrvCau                 COBOL Name: D51U-PTYP-DRV-CAU
      *
      * @throws CFException
      */
      private void searchPrv2130D() throws Exception {
			// Declare local variables used in the method
			D51uRetRulProvTyp d51uRetRulProvTyp = vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulProvTyp();
			HoldTransData2 holdTransData2 = workFields.getHoldTransData2();
			M51uLinkage m51uLinkage = dfhcommarea.getLinkAreaM51u().getM51uLinkage();
			char[] uProvType51 = null;
			char[] prevPs = null;
			char[] prevSvc = null;
			char[] prevCauseCd = null;
			PrevMatchedKey prevMatchedKey = workFields.getPrevMatchedKey();
			// End of variable declaration

      
// *81***************************************************************
// *81 2130D-search-prv                                             *
// *81                                                              *
// *81 business function:                                           *
// *81 check for provider type match.                               *
// *81***************************************************************
// *82***************************************************************
// *82 2130d-search-prv                                             *
// *82                                                              *
// *82 1. if the provider type is empty, then set a switch to       *
// *82    indicate that the search is complete.                     *
// *82    else, if the provider type in the record matches with the *
// *82    one in the linkage area, increment the counter which      *
// *82    indicates the number of matches.                          *
// *82***************************************************************

// *-------------------*

// *Qc9901     if   d51u-ptyp-drv-pos(pv-sub)   =  spaces
// *qc9901     and  d51u-ptyp-drv-svc(pv-sub)   =  spaces
// *qc9901     and  d51u-ptyp-drv-cau(pv-sub)   =  spaces
// *qc9901         move 'y' to ws-search-complete
// *qc9901         go to 2130d-exit
// *qc9901     end-if.
//  MOVE '2130D' TO WS-PARAGRAPH
//  LITERAL_2130D = '2130D'
          workFields.setParagraph(CONSTANTS.LITERAL_2130D);
          prevCauseCd = prevMatchedKey.getPrevCauseCd();
          prevSvc = prevMatchedKey.getPrevSvc();
          prevPs = prevMatchedKey.getPrevPs();
//  IF D51U-PTYP-DRV-POS ( PV-SUB ) = WS-PREV-PS AND D51U-PTYP-DRV-SVC ( PV-SUB ) = WS-PREV-SVC AND D51U-PTYP-DRV-CAU ( PV-SUB ) = WS-PREV-CAUSE-CD
          if (		compareChars(d51uRetRulProvTyp.getD51uRetRuleProvTyp(work.getPvSub() - 1).getD51uPtypDrvPos(),prevPs) == 0  && 		compareChars(d51uRetRulProvTyp.getD51uRetRuleProvTyp(work.getPvSub() - 1).getD51uPtypDrvSvc(),prevSvc) == 0  && 		compareChars(d51uRetRulProvTyp.getD51uRetRuleProvTyp(work.getPvSub() - 1).getD51uPtypDrvCau(),prevCauseCd) == 0 ) { 
//  SET SAME-TABLE TO TRUE
              work.setSameTable1True(); 
              
//  IF D51U-PTYP-PROV-TYP ( PV-SUB ) EQUAL SPACES
              if (        ( allSpaces(d51uRetRulProvTyp.getD51uRetRuleProvTyp(work.getPvSub() - 1).getD51uPtypProvTyp())   )) { 
                  // MOVE 'Y' TO WS-SEARCH-COMPLETE
                  //  LITERAL_Y = 'Y'
                  work.setSearchComplete(CONSTANTS.LITERAL_Y);
              }
  
//  ELSE
              else { 
                  uProvType51 = m51uLinkage.getUProvType51();
//  IF LK-51U-PROV-TYPE = D51U-PTYP-PROV-TYP ( PV-SUB )
                  if (		compareChars(uProvType51,d51uRetRulProvTyp.getD51uRetRuleProvTyp(work.getPvSub() - 1).getD51uPtypProvTyp()) == 0 ) { 
//  ADD 1 TO WS-NBR-MATCHED
                      workFields.setNbrMatched( (short) (workFields.getNbrMatched()+(short)1));
                      // MOVE 'Y' TO WS-FROM-PRV-FOUND
                      //  LITERAL_Y = 'Y'
                      work.setFromPrvFound(CONSTANTS.LITERAL_Y);
//  MOVE D51U-PTYP-DRV-POS ( PV-SUB ) TO WS-PTYP-PS
                      holdTransData2.setPtypPs(vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulProvTyp().getD51uRetRuleProvTyp(work.getPvSub() - 1).getD51uPtypDrvPos());
  
//  MOVE D51U-PTYP-DRV-SVC ( PV-SUB ) TO WS-PTYP-SVC
                      holdTransData2.setPtypSvc(vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulProvTyp().getD51uRetRuleProvTyp(work.getPvSub() - 1).getD51uPtypDrvSvc());
  
//  MOVE D51U-PTYP-DRV-CAU ( PV-SUB ) TO WS-PTYP-CAUSE-CD
                      holdTransData2.setPtypCauseCd(vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulProvTyp().getD51uRetRuleProvTyp(work.getPvSub() - 1).getD51uPtypDrvCau());
  
                  }
  
              }
          }
  
      
      }
      /**
      * searchIcd92140D 
      *   This method is derived from 
  *   COBOL Paragraph - 2140D-SEARCH-ICD9 SECTION COBOL Cyclomatic complexity - 33
      * Input  :  

      * - d51uRicdDrvPos                 COBOL Name: D51U-RICD-DRV-POS
      * - prevPs                         COBOL Name: WS-PREV-PS
      * - d51uRicdDrvSvc                 COBOL Name: D51U-RICD-DRV-SVC
      * - prevSvc                        COBOL Name: WS-PREV-SVC
      * - d51uRicdDrvCau                 COBOL Name: D51U-RICD-DRV-CAU
      * - prevCauseCd                    COBOL Name: WS-PREV-CAUSE-CD
      * - icd9Sub                        COBOL Name: ICD9-SUB
      * - s1                             COBOL Name: S1
      * - uDiagnosisCode51               COBOL Name: LK-51U-DIAGNOSIS-CODE
      * - searchComplete                 COBOL Name: WS-SEARCH-COMPLETE
      * - fromIcd9Found                  COBOL Name: WS-FROM-ICD9-FOUND
      * - uMedicalClaim51                COBOL Name: LK-51U-MEDICAL-CLAIM
      * - uLineDiagPointer51             COBOL Name: LK-51U-LINE-DIAG-POINTER
      * - uSourceInd51                   COBOL Name: LK-51U-SOURCE-IND
      * - sub01                          COBOL Name: LK-SUB
      * - d51uRicdClmIcdFromCd           COBOL Name: D51U-RICD-CLM-ICD-FROM-CD
      * - d51uRicdClmIcdToCd             COBOL Name: D51U-RICD-CLM-ICD-TO-CD
      * - uIcdVerNbr51                   COBOL Name: LK-51U-ICD-VER-NBR
      * - d51uRicdClmIcdInd              COBOL Name: D51U-RICD-CLM-ICD-IND
      * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
      *
      * Output :  

      * - paragraph                      COBOL Name: WS-PARAGRAPH
      * - sameTable                      COBOL Name: WS-SAME-TABLE
      * - s1                             COBOL Name: S1
      * - useDiagnosisSw                 COBOL Name: USE-DIAGNOSIS-SW
      * - point                          COBOL Name: WS-POINT
      * - uLineDiagPointer51             COBOL Name: LK-51U-LINE-DIAG-POINTER
      * - point1                         COBOL Name: WS-POINT-1
      * - point2                         COBOL Name: WS-POINT-2
      * - point3                         COBOL Name: WS-POINT-3
      * - point4                         COBOL Name: WS-POINT-4
      * - searchComplete                 COBOL Name: WS-SEARCH-COMPLETE
      * - fromIcd9Found                  COBOL Name: WS-FROM-ICD9-FOUND
      * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
      * - ricdPs                         COBOL Name: WS-RICD-PS
      * - d51uRicdDrvPos                 COBOL Name: D51U-RICD-DRV-POS
      * - ricdSvc                        COBOL Name: WS-RICD-SVC
      * - d51uRicdDrvSvc                 COBOL Name: D51U-RICD-DRV-SVC
      * - ricdCauseCd                    COBOL Name: WS-RICD-CAUSE-CD
      * - d51uRicdDrvCau                 COBOL Name: D51U-RICD-DRV-CAU
      *
      * @throws CFException
      */
      private void searchIcd92140D() throws Exception {
			// Declare local variables used in the method
			M51uLinkage m51uLinkage = dfhcommarea.getLinkAreaM51u().getM51uLinkage();
			Point point = workFields.getPoint();
			char[] uSourceInd51 = null;
			char[] uLineDiagPointer51 = null;
			char[] uMedicalClaim51 = null;
			char[] uIcdVerNbr51 = null;
			char[] prevPs = null;
			char[] prevSvc = null;
			char[] prevCauseCd = null;
			int point1 = 0;
			int s1 = 0;
			int point2 = 0;
			int point3 = 0;
			int point4 = 0;
			D51uRetRulIcd d51uRetRulIcd = vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIcd();
			HoldTransData2 holdTransData2 = workFields.getHoldTransData2();
			PrevMatchedKey prevMatchedKey = workFields.getPrevMatchedKey();
			// End of variable declaration

      
// *81***************************************************************
// *81 2140D-search-icd9                                            *
// *81                                                              *
// *81 check for icd9 match.                                        *
// *81***************************************************************
// *82***************************************************************
// *82 2140d-search-icd9                                            *
// *82                                                              *
// *82 1. check if the diagnosis code is spaces.                    *
// *82 2. examine the mediclaim switch, the source indicator, the   *
// *82    line drag pointer and populate the use diagnosis switch.  *
// *82 3. when icd9 match is found, a flag is set and a counter is  *
// *82    accumulated to indicate number of matches. match should be*
// *82    within to from spi icd9 when both are present.            *
// *82***************************************************************

// *-------------------*

// *Qc9901     if   d51u-ricd-drv-pos(icd9-sub) =  spaces
// *qc9901     and  d51u-ricd-drv-svc(icd9-sub) =  spaces
// *qc9901     and  d51u-ricd-drv-cau(icd9-sub) =  spaces
// *qc9901           move 'y' to ws-search-complete
// *qc9901           go to 2140d-exit
// *qc9901     end-if.
//  MOVE '2140D' TO WS-PARAGRAPH
//  LITERAL_2140D = '2140D'
          workFields.setParagraph(CONSTANTS.LITERAL_2140D);
          prevCauseCd = prevMatchedKey.getPrevCauseCd();
          prevSvc = prevMatchedKey.getPrevSvc();
          prevPs = prevMatchedKey.getPrevPs();
//  IF D51U-RICD-DRV-POS ( ICD9-SUB ) = WS-PREV-PS AND D51U-RICD-DRV-SVC ( ICD9-SUB ) = WS-PREV-SVC AND D51U-RICD-DRV-CAU ( ICD9-SUB ) = WS-PREV-CAUSE-CD
          if (		compareChars(d51uRetRulIcd.getD51uRetRuleIcd(work.getIcd9Sub() - 1).getD51uRicdDrvPos(),prevPs) == 0  && 		compareChars(d51uRetRulIcd.getD51uRetRuleIcd(work.getIcd9Sub() - 1).getD51uRicdDrvSvc(),prevSvc) == 0  && 		compareChars(d51uRetRulIcd.getD51uRetRuleIcd(work.getIcd9Sub() - 1).getD51uRicdDrvCau(),prevCauseCd) == 0 ) { 
//  SET SAME-TABLE TO TRUE
              work.setSameTable1True(); 
              
//  PERFORM VARYING S1 FROM 1 BY 1 UNTIL S1 > 25 OR LK-51U-DIAGNOSIS-CODE (S1) = SPACES OR SEARCH-COMPLETE OR FROM-ICD9-FOUND
              for (work.setS1(1); (	( work.getS1() <= 25 ) &&         ( !allSpaces(m51uLinkage.getUDiagnosisCode51(work.getS1() - 1))  ) && !(work.isSearchComplete1())  && !(work.isFromIcd9Found1()) ) ; work.setS1(work.getS1() + 1) ) {

// *** For medical only check diagnosis where diag pointers apply
// *** for a given line
                  // MOVE 'N' TO USE-DIAGNOSIS-SW
                  //  LITERAL_N = 'N'
                  work.setUseDiagnosisSw(CONSTANTS.LITERAL_N);
                  uMedicalClaim51 = m51uLinkage.getUMedicalClaim51();
//  IF LK-51U-MEDICAL-CLAIM = 'Y'
//  LITERAL_Y = 'Y'
                  if (compareChars(uMedicalClaim51, CONSTANTS.LITERAL_Y) == 0) { 

// *45917S    if s1 < 6
// *48111a    if s1 < 5
                      s1 = work.getS1();
//  IF S1 < 26
                      if (	( s1 < 26 )) { 
//  MOVE LK-51U-LINE-DIAG-POINTER ( LK-SUB ) TO WS-POINT
                          workFields.getPoint().setString(dfhcommarea.getLinkAreaM51u().getM51uLinkage().getULineData51(work.getSub01() - 1).getULineDiagPointer51());
                          s1 = work.getS1();
                          uSourceInd51 = m51uLinkage.getUSourceInd51();
                          point1 = point.getPoint1();
//  IF LK-51U-SOURCE-IND = 'M' AND WS-POINT-1 = 00 AND S1 = 1
//  LITERAL_1 = 1
                          if (compareChars(uSourceInd51, CONSTANTS.LITERAL_M) == 0 && 	( point1 == 0 ) && 	( s1 == 1 )) { 

// *45917S           ws-point-1 = '0'
                              // MOVE 'Y' TO USE-DIAGNOSIS-SW
                              //  LITERAL_Y = 'Y'
                              work.setUseDiagnosisSw(CONSTANTS.LITERAL_Y);
                          }
  
                          uSourceInd51 = m51uLinkage.getUSourceInd51();
                          point1 = point.getPoint1();
//  IF LK-51U-SOURCE-IND = 'M' AND WS-POINT-1 = 05
                          if (compareChars(uSourceInd51, CONSTANTS.LITERAL_M) == 0 && 	( point1 == 5 )) { 

// *45917S           ws-point-1 = '5'
                              // MOVE 'Y' TO USE-DIAGNOSIS-SW
                              //  LITERAL_Y = 'Y'
                              work.setUseDiagnosisSw(CONSTANTS.LITERAL_Y);
                          }
  

// *45917S        if lk-51u-line-diag-pointer(lk-sub)(1:1)
                          s1 = work.getS1();
                          uLineDiagPointer51 = m51uLinkage.getULineData51(work.getSub01() - 1).getULineDiagPointer51();
                          point1 = point.getPoint1();
//  IF LK-51U-LINE-DIAG-POINTER ( LK-SUB ) (1 : 2) NOT = SPACES AND WS-POINT-1 = S1
                          if (!(Field.allSpaces(uLineDiagPointer51,( 0 /*start*/ ), 2 /*len*/)) && 	( point1 == s1 )) { 
                              // MOVE 'Y' TO USE-DIAGNOSIS-SW
                              //  LITERAL_Y = 'Y'
                              work.setUseDiagnosisSw(CONSTANTS.LITERAL_Y);
                          }
  

// *45917S        if lk-51u-line-diag-pointer(lk-sub)(2:1)
                          s1 = work.getS1();
                          uLineDiagPointer51 = m51uLinkage.getULineData51(work.getSub01() - 1).getULineDiagPointer51();
                          point2 = point.getPoint2();
//  IF LK-51U-LINE-DIAG-POINTER ( LK-SUB ) (3 : 2) NOT = SPACES AND WS-POINT-2 = S1
                          if (!(Field.allSpaces(uLineDiagPointer51,( 2 /*start*/ ), 2 /*len*/)) && 	( point2 == s1 )) { 
                              // MOVE 'Y' TO USE-DIAGNOSIS-SW
                              //  LITERAL_Y = 'Y'
                              work.setUseDiagnosisSw(CONSTANTS.LITERAL_Y);
                          }
  

// *45917S        if lk-51u-line-diag-pointer(lk-sub)(3:1)
                          s1 = work.getS1();
                          uLineDiagPointer51 = m51uLinkage.getULineData51(work.getSub01() - 1).getULineDiagPointer51();
                          point3 = point.getPoint3();
//  IF LK-51U-LINE-DIAG-POINTER ( LK-SUB ) (5 : 2) NOT = SPACES AND WS-POINT-3 = S1
                          if (!(Field.allSpaces(uLineDiagPointer51,( 4 /*start*/ ), 2 /*len*/)) && 	( point3 == s1 )) { 
                              // MOVE 'Y' TO USE-DIAGNOSIS-SW
                              //  LITERAL_Y = 'Y'
                              work.setUseDiagnosisSw(CONSTANTS.LITERAL_Y);
                          }
  

// *45917S        if lk-51u-line-diag-pointer(lk-sub)(4:1)
                          s1 = work.getS1();
                          uLineDiagPointer51 = m51uLinkage.getULineData51(work.getSub01() - 1).getULineDiagPointer51();
                          point4 = point.getPoint4();
//  IF LK-51U-LINE-DIAG-POINTER ( LK-SUB ) (7 : 2) NOT = SPACES AND WS-POINT-4 = S1
                          if (!(Field.allSpaces(uLineDiagPointer51,( 6 /*start*/ ), 2 /*len*/)) && 	( point4 == s1 )) { 
                              // MOVE 'Y' TO USE-DIAGNOSIS-SW
                              //  LITERAL_Y = 'Y'
                              work.setUseDiagnosisSw(CONSTANTS.LITERAL_Y);
                          }
  
                      }
  
                  }
  

// *45917S        if lk-51u-line-diag-pointer(lk-sub)(5:1)
// *45917s                                     not = spaces
// *45917s                 and
// *45917s           ws-point-5 = s1
// *45917s            move 'y' to use-diagnosis-sw
// *45917s        end-if
//  ELSE
                  else { 
                      // MOVE 'Y' TO USE-DIAGNOSIS-SW
                      //  LITERAL_Y = 'Y'
                      work.setUseDiagnosisSw(CONSTANTS.LITERAL_Y);
                  }
//  IF USE-DIAGNOSIS
                  if ( work.isUseDiagnosis()  ) { 
//  IF D51U-RICD-CLM-ICD-FROM-CD ( ICD9-SUB ) = SPACES
                      if (        ( allSpaces(d51uRetRulIcd.getD51uRetRuleIcd(work.getIcd9Sub() - 1).getD51uRicdClmIcdFromCd())   )) { 
                          // MOVE 'Y' TO WS-SEARCH-COMPLETE
                          //  LITERAL_Y = 'Y'
                          work.setSearchComplete(CONSTANTS.LITERAL_Y);
                      }
  
//  ELSE
                      else { 
//  IF D51U-RICD-CLM-ICD-TO-CD ( ICD9-SUB ) NOT = SPACES
                          if (        ( !allSpaces(d51uRetRulIcd.getD51uRetRuleIcd(work.getIcd9Sub() - 1).getD51uRicdClmIcdToCd())  )) { 
                              uIcdVerNbr51 = m51uLinkage.getUIcdVerNbr51();
//  IF LK-51U-DIAGNOSIS-CODE (S1) NOT < D51U-RICD-CLM-ICD-FROM-CD ( ICD9-SUB ) AND LK-51U-DIAGNOSIS-CODE (S1) NOT > D51U-RICD-CLM-ICD-TO-CD ( ICD9-SUB ) AND LK-51U-ICD-VER-NBR = D51U-RICD-CLM-ICD-IND ( ICD9-SUB )
                              if (		compareChars(m51uLinkage.getUDiagnosisCode51(work.getS1() - 1),d51uRetRulIcd.getD51uRetRuleIcd(work.getIcd9Sub() - 1).getD51uRicdClmIcdFromCd()) >= 0  && 		compareChars(m51uLinkage.getUDiagnosisCode51(work.getS1() - 1),d51uRetRulIcd.getD51uRetRuleIcd(work.getIcd9Sub() - 1).getD51uRicdClmIcdToCd()) <= 0  && 		compareChars(uIcdVerNbr51,d51uRetRulIcd.getD51uRetRuleIcd(work.getIcd9Sub() - 1).getD51uRicdClmIcdInd()) == 0 ) { 
                                  // MOVE 'Y' TO WS-FROM-ICD9-FOUND
                                  //  LITERAL_Y = 'Y'
                                  work.setFromIcd9Found(CONSTANTS.LITERAL_Y);
                              }
  
                          }
  
//  ELSE
                          else { 
                              uIcdVerNbr51 = m51uLinkage.getUIcdVerNbr51();
//  IF LK-51U-DIAGNOSIS-CODE (S1) = D51U-RICD-CLM-ICD-FROM-CD ( ICD9-SUB ) AND LK-51U-ICD-VER-NBR = D51U-RICD-CLM-ICD-IND ( ICD9-SUB )
                              if (		compareChars(m51uLinkage.getUDiagnosisCode51(work.getS1() - 1),d51uRetRulIcd.getD51uRetRuleIcd(work.getIcd9Sub() - 1).getD51uRicdClmIcdFromCd()) == 0  && 		compareChars(uIcdVerNbr51,d51uRetRulIcd.getD51uRetRuleIcd(work.getIcd9Sub() - 1).getD51uRicdClmIcdInd()) == 0 ) { 
                                  // MOVE 'Y' TO WS-FROM-ICD9-FOUND
                                  //  LITERAL_Y = 'Y'
                                  work.setFromIcd9Found(CONSTANTS.LITERAL_Y);
                              }
  
                          }
                      }
                  }
              }
  
//  IF FROM-ICD9-FOUND
              if ( work.isFromIcd9Found1()  ) { 
//  ADD 1 TO WS-NBR-MATCHED
                  workFields.setNbrMatched( (short) (workFields.getNbrMatched()+(short)1));
//  MOVE D51U-RICD-DRV-POS ( ICD9-SUB ) TO WS-RICD-PS
                  holdTransData2.setRicdPs(vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIcd().getD51uRetRuleIcd(work.getIcd9Sub() - 1).getD51uRicdDrvPos());
  
//  MOVE D51U-RICD-DRV-SVC ( ICD9-SUB ) TO WS-RICD-SVC
                  holdTransData2.setRicdSvc(vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIcd().getD51uRetRuleIcd(work.getIcd9Sub() - 1).getD51uRicdDrvSvc());
  
//  MOVE D51U-RICD-DRV-CAU ( ICD9-SUB ) TO WS-RICD-CAUSE-CD
                  holdTransData2.setRicdCauseCd(vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIcd().getD51uRetRuleIcd(work.getIcd9Sub() - 1).getD51uRicdDrvCau());
  
              }
          }
  
      
      }
      /**
      * searchCause2150D 
      *   This method is derived from 
  *   COBOL Paragraph - 2150D-SEARCH-CAUSE SECTION COBOL Cyclomatic complexity - 13
      * Input  :  

      * - d51uCausDrvPos                 COBOL Name: D51U-CAUS-DRV-POS
      * - prevPs                         COBOL Name: WS-PREV-PS
      * - d51uCausDrvSvc                 COBOL Name: D51U-CAUS-DRV-SVC
      * - prevSvc                        COBOL Name: WS-PREV-SVC
      * - d51uCausDrvCau                 COBOL Name: D51U-CAUS-DRV-CAU
      * - prevCauseCd                    COBOL Name: WS-PREV-CAUSE-CD
      * - causeSub                       COBOL Name: CAUSE-SUB
      * - d51uCausClmCauseCd1            COBOL Name: D51U-CAUS-CLM-CAUSE-CD-1
      * - uCauseCd51                     COBOL Name: LK-51U-CAUSE-CD
      * - d51uCausClmCauseCd2            COBOL Name: D51U-CAUS-CLM-CAUSE-CD-2
      * - d51uCausClmCauseCd3            COBOL Name: D51U-CAUS-CLM-CAUSE-CD-3
      * - d51uCausClmCauseCd4            COBOL Name: D51U-CAUS-CLM-CAUSE-CD-4
      * - d51uCausClmCauseCd5            COBOL Name: D51U-CAUS-CLM-CAUSE-CD-5
      * - d51uCausClmCauseCd6            COBOL Name: D51U-CAUS-CLM-CAUSE-CD-6
      * - d51uCausClmCauseCd7            COBOL Name: D51U-CAUS-CLM-CAUSE-CD-7
      * - d51uCausClmCauseCd8            COBOL Name: D51U-CAUS-CLM-CAUSE-CD-8
      * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
      *
      * Output :  

      * - paragraph                      COBOL Name: WS-PARAGRAPH
      * - sameTable                      COBOL Name: WS-SAME-TABLE
      * - searchComplete                 COBOL Name: WS-SEARCH-COMPLETE
      * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
      * - causPs                         COBOL Name: WS-CAUS-PS
      * - d51uCausDrvPos                 COBOL Name: D51U-CAUS-DRV-POS
      * - causSvc                        COBOL Name: WS-CAUS-SVC
      * - d51uCausDrvSvc                 COBOL Name: D51U-CAUS-DRV-SVC
      * - causCauseCd                    COBOL Name: WS-CAUS-CAUSE-CD
      * - d51uCausDrvCau                 COBOL Name: D51U-CAUS-DRV-CAU
      * - fromCauseFound                 COBOL Name: WS-FROM-CAUSE-FOUND
      *
      * @throws CFException
      */
      private void searchCause2150D() throws Exception {
			// Declare local variables used in the method
			D51uRetRulCauseData d51uRetRulCauseData = vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulCauseData();
			HoldTransData2 holdTransData2 = workFields.getHoldTransData2();
			M51uLinkage m51uLinkage = dfhcommarea.getLinkAreaM51u().getM51uLinkage();
			char[] uCauseCd51 = null;
			char[] prevPs = null;
			char[] prevSvc = null;
			char[] prevCauseCd = null;
			PrevMatchedKey prevMatchedKey = workFields.getPrevMatchedKey();
			// End of variable declaration

      
// *81***************************************************************
// *81 2150D-search-cause                                           *
// *81                                                              *
// *81 business function:                                           *
// *81 this section increments the counter which indicates the      *
// *81 number of matches when ever a cause code match is found.     *
// *81***************************************************************
// *82***************************************************************
// *82 2150d-search-cause                                           *
// *82                                                              *
// *82 1. if the cause code for that particular index is empty, it  *
// *82    denotes that the search is complete. else, increase the   *
// *82    number of matches by 1.                                   *
// *82***************************************************************

// *-------------------*

// *Qc9901     if  d51u-caus-drv-pos(cause-sub) =  spaces
// *qc9901     and d51u-caus-drv-svc(cause-sub) =  spaces
// *qc9901     and d51u-caus-drv-cau(cause-sub) =  spaces
// *45917s         move 'y' to ws-search-complete
// *qc9901         go to 2150d-exit
// *qc9901     end-if.
//  MOVE '2150D' TO WS-PARAGRAPH
//  LITERAL_2150D = '2150D'
          workFields.setParagraph(CONSTANTS.LITERAL_2150D);
          prevCauseCd = prevMatchedKey.getPrevCauseCd();
          prevSvc = prevMatchedKey.getPrevSvc();
          prevPs = prevMatchedKey.getPrevPs();
//  IF D51U-CAUS-DRV-POS ( CAUSE-SUB ) = WS-PREV-PS AND D51U-CAUS-DRV-SVC ( CAUSE-SUB ) = WS-PREV-SVC AND D51U-CAUS-DRV-CAU ( CAUSE-SUB ) = WS-PREV-CAUSE-CD
          if (		compareChars(d51uRetRulCauseData.getD51uRetRulCause(work.getCauseSub() - 1).getD51uCausDrvPos(),prevPs) == 0  && 		compareChars(d51uRetRulCauseData.getD51uRetRulCause(work.getCauseSub() - 1).getD51uCausDrvSvc(),prevSvc) == 0  && 		compareChars(d51uRetRulCauseData.getD51uRetRulCause(work.getCauseSub() - 1).getD51uCausDrvCau(),prevCauseCd) == 0 ) { 
//  SET SAME-TABLE TO TRUE
              work.setSameTable1True(); 
              
//  IF D51U-CAUS-CLM-CAUSE-CD-1 ( CAUSE-SUB ) = SPACES
              if (        ( allSpaces(d51uRetRulCauseData.getD51uRetRulCause(work.getCauseSub() - 1).getD51uCausClmCauseCd1())   )) { 
                  // MOVE 'Y' TO WS-SEARCH-COMPLETE
                  //  LITERAL_Y = 'Y'
                  work.setSearchComplete(CONSTANTS.LITERAL_Y);
              }
  
//  ELSE
              else { 
                  uCauseCd51 = m51uLinkage.getUCauseCd51();
//  IF LK-51U-CAUSE-CD = D51U-CAUS-CLM-CAUSE-CD-1 ( CAUSE-SUB ) OR LK-51U-CAUSE-CD = D51U-CAUS-CLM-CAUSE-CD-2 ( CAUSE-SUB ) OR LK-51U-CAUSE-CD = D51U-CAUS-CLM-CAUSE-CD-3 ( CAUSE-SUB ) OR LK-51U-CAUSE-CD = D51U-CAUS-CLM-CAUSE-CD-4 ( CAUSE-SUB ) OR LK-51U-CAUSE-CD = D51U-CAUS-CLM-CAUSE-CD-5 ( CAUSE-SUB ) OR LK-51U-CAUSE-CD = D51U-CAUS-CLM-CAUSE-CD-6 ( CAUSE-SUB ) OR LK-51U-CAUSE-CD = D51U-CAUS-CLM-CAUSE-CD-7 ( CAUSE-SUB ) OR LK-51U-CAUSE-CD = D51U-CAUS-CLM-CAUSE-CD-8 ( CAUSE-SUB )
                  if (		compareChars(uCauseCd51,d51uRetRulCauseData.getD51uRetRulCause(work.getCauseSub() - 1).getD51uCausClmCauseCd1()) == 0  || 		compareChars(uCauseCd51,d51uRetRulCauseData.getD51uRetRulCause(work.getCauseSub() - 1).getD51uCausClmCauseCd2()) == 0  || 		compareChars(uCauseCd51,d51uRetRulCauseData.getD51uRetRulCause(work.getCauseSub() - 1).getD51uCausClmCauseCd3()) == 0  || 		compareChars(uCauseCd51,d51uRetRulCauseData.getD51uRetRulCause(work.getCauseSub() - 1).getD51uCausClmCauseCd4()) == 0  || 		compareChars(uCauseCd51,d51uRetRulCauseData.getD51uRetRulCause(work.getCauseSub() - 1).getD51uCausClmCauseCd5()) == 0  || 		compareChars(uCauseCd51,d51uRetRulCauseData.getD51uRetRulCause(work.getCauseSub() - 1).getD51uCausClmCauseCd6()) == 0  || 		compareChars(uCauseCd51,d51uRetRulCauseData.getD51uRetRulCause(work.getCauseSub() - 1).getD51uCausClmCauseCd7()) == 0  || 		compareChars(uCauseCd51,d51uRetRulCauseData.getD51uRetRulCause(work.getCauseSub() - 1).getD51uCausClmCauseCd8()) == 0 ) { 
//  ADD 1 TO WS-NBR-MATCHED
                      workFields.setNbrMatched( (short) (workFields.getNbrMatched()+(short)1));
//  MOVE D51U-CAUS-DRV-POS ( CAUSE-SUB ) TO WS-CAUS-PS
                      holdTransData2.setCausPs(vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulCauseData().getD51uRetRulCause(work.getCauseSub() - 1).getD51uCausDrvPos());
  
//  MOVE D51U-CAUS-DRV-SVC ( CAUSE-SUB ) TO WS-CAUS-SVC
                      holdTransData2.setCausSvc(vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulCauseData().getD51uRetRulCause(work.getCauseSub() - 1).getD51uCausDrvSvc());
  

// **45917C     move d51u-caus-drv-cau(cause-sub) to ws-hold-cause-cd
//  MOVE D51U-CAUS-DRV-CAU ( CAUSE-SUB ) TO WS-CAUS-CAUSE-CD
                      holdTransData2.setCausCauseCd(vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulCauseData().getD51uRetRulCause(work.getCauseSub() - 1).getD51uCausDrvCau());
  
                      // MOVE 'Y' TO WS-FROM-CAUSE-FOUND
                      //  LITERAL_Y = 'Y'
                      work.setFromCauseFound(CONSTANTS.LITERAL_Y);
                  }
  
              }
          }
  
      
      }
      /**
      * matchIpaToPpoalt2160D 
      *   This method is derived from 
  *   COBOL Paragraph - 2160D-MATCH-IPA-TO-PPOALT SECTION COBOL Cyclomatic complexity - 33
      * Input  :  

      * - d51uRipaDrvPos                 COBOL Name: D51U-RIPA-DRV-POS
      * - prevPs                         COBOL Name: WS-PREV-PS
      * - d51uRipaDrvSvc                 COBOL Name: D51U-RIPA-DRV-SVC
      * - prevSvc                        COBOL Name: WS-PREV-SVC
      * - d51uRipaDrvCau                 COBOL Name: D51U-RIPA-DRV-CAU
      * - prevCauseCd                    COBOL Name: WS-PREV-CAUSE-CD
      * - iSub                           COBOL Name: I-SUB
      * - ppaPpoIdCount                  COBOL Name: PPA-PPO-ID-COUNT
      * - d51uRipaClmIpa1Cd              COBOL Name: D51U-RIPA-CLM-IPA-1-CD
      * - d51uRipaGrpTbl1Nbr             COBOL Name: D51U-RIPA-GRP-TBL-1-NBR
      * - d51uRipaGrpTbl2Nbr             COBOL Name: D51U-RIPA-GRP-TBL-2-NBR
      * - d51uRipaGrpTbl3Nbr             COBOL Name: D51U-RIPA-GRP-TBL-3-NBR
      * - ipaSub                         COBOL Name: IPA-SUB
      * - ppaIpa                         COBOL Name: PPA-IPA
      * - ppaGrpTabNo                    COBOL Name: PPA-GRP-TAB-NO
      * - uEarliestDos51                 COBOL Name: LK-51U-EARLIEST-DOS
      * - ppaFirstEffDate                COBOL Name: PPA-FIRST-EFF-DATE
      * - ppaLastCanDate                 COBOL Name: PPA-LAST-CAN-DATE
      * - d51uRipaClmIpa2Cd              COBOL Name: D51U-RIPA-CLM-IPA-2-CD
      * - d51uRipaClmIpa3Cd              COBOL Name: D51U-RIPA-CLM-IPA-3-CD
      * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
      *
      * Output :  

      * - gtnLoaded                      COBOL Name: WS-GTN-LOADED
      * - sameTable                      COBOL Name: WS-SAME-TABLE
      * - searchComplete                 COBOL Name: WS-SEARCH-COMPLETE
      * - ipaSub                         COBOL Name: IPA-SUB
      * - ipaAndGtnFound                 COBOL Name: WS-IPA-AND-GTN-FOUND
      * - ipaCodeFound                   COBOL Name: WS-IPA-CODE-FOUND
      * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
      * - ripaPs                         COBOL Name: WS-RIPA-PS
      * - d51uRipaDrvPos                 COBOL Name: D51U-RIPA-DRV-POS
      * - ripaSvc                        COBOL Name: WS-RIPA-SVC
      * - d51uRipaDrvSvc                 COBOL Name: D51U-RIPA-DRV-SVC
      * - ripaCauseCd                    COBOL Name: WS-RIPA-CAUSE-CD
      * - d51uRipaDrvCau                 COBOL Name: D51U-RIPA-DRV-CAU
      *
      * @throws CFException
      */
      private void matchIpaToPpoalt2160D() throws Exception {
			// Declare local variables used in the method
			PpaFixedPortion ppaFixedPortion = dfhcommarea.getPpaPpoaltRecord().getPpaFixedPortion();
			short ppaPpoIdCount = 0;
			D51uRetRulIpa d51uRetRulIpa = vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIpa();
			PpaPpoaltRecord ppaPpoaltRecord = dfhcommarea.getPpaPpoaltRecord();
			M51uLinkage m51uLinkage = dfhcommarea.getLinkAreaM51u().getM51uLinkage();
			long uEarliestDos51 = 0;
			HoldTransData2 holdTransData2 = workFields.getHoldTransData2();
			PrevMatchedKey prevMatchedKey = workFields.getPrevMatchedKey();
			char[] prevPs = null;
			char[] prevSvc = null;
			char[] prevCauseCd = null;
			// End of variable declaration

      
// *81***************************************************************
// *81 2160D-match-ipa-to-ppoalt                                    *
// *81                                                              *
// *81 business function:                                           *
// *81 checks for a match on individual practice association code   *
// *81***************************************************************
// *82***************************************************************
// *82 2160d-match-ipa-to-ppoalt                                    *
// *82                                                              *
// *82 1. when no prefered provider organization records are found  *
// *82    exit, the section.                                        *
// *82 2. if the ppa-ipa is greater than zero                       *
// *82    - if the earliest date of service is greater than the ppa-*
// *82      first effective date and the earlist date of service is *
// *82      less than the last cancel date,                         *
// *82      - if the ppa-ipa matches with any of the three ipa-codes*
// *82        then set a switch to indicate that the ipa code is    *
// *82        found.                                                *
// *82***************************************************************

// *------------------------*
          // MOVE 'N' TO WS-GTN-LOADED
          //  LITERAL_N = 'N'
          work.setGtnLoaded(CONSTANTS.LITERAL_N);
          prevCauseCd = prevMatchedKey.getPrevCauseCd();
          prevSvc = prevMatchedKey.getPrevSvc();
          prevPs = prevMatchedKey.getPrevPs();
//  IF D51U-RIPA-DRV-POS ( I-SUB ) = WS-PREV-PS AND D51U-RIPA-DRV-SVC ( I-SUB ) = WS-PREV-SVC AND D51U-RIPA-DRV-CAU ( I-SUB ) = WS-PREV-CAUSE-CD
          if (		compareChars(d51uRetRulIpa.getD51uRetRuleIpa(work.getISub() - 1).getD51uRipaDrvPos(),prevPs) == 0  && 		compareChars(d51uRetRulIpa.getD51uRetRuleIpa(work.getISub() - 1).getD51uRipaDrvSvc(),prevSvc) == 0  && 		compareChars(d51uRetRulIpa.getD51uRetRuleIpa(work.getISub() - 1).getD51uRipaDrvCau(),prevCauseCd) == 0 ) { 
//  SET SAME-TABLE TO TRUE
              work.setSameTable1True(); 
              
//  IF PPA-PPO-ID-COUNT IS NOT NUMERIC
              if (         !(ppaFixedPortion.ppaPpoIdCountIsNumeric() ) ) { 
                  // MOVE 'Y' TO WS-SEARCH-COMPLETE
                  //  LITERAL_Y = 'Y'
                  work.setSearchComplete(CONSTANTS.LITERAL_Y);
//cobolCode::GO TO 2160D-EXIT
return ;
//cobolCodeEnds::GO TO 2160D-EXIT
              }
  

// *Qc9901     if  d51u-ripa-drv-pos(i-sub) = spaces
// *qc9901     and d51u-ripa-drv-svc(i-sub) = spaces
// *qc9901     and d51u-ripa-drv-cau(i-sub) = spaces
// *qc9901         move 'y' to ws-search-complete
// *qc9901         go to 2160d-exit
// *qc9901     end-if.
// *code commented and moved above for 12-2017 so that if there is no
// *ppo record the same-table and ws-search-complete are both set
// *
// *    if  d51u-ripa-drv-pos(i-sub) = ws-prev-ps
// *    and d51u-ripa-drv-svc(i-sub) = ws-prev-svc
// *    and d51u-ripa-drv-cau(i-sub) = ws-prev-cause-cd
// *         set same-table to true
//  IF D51U-RIPA-CLM-IPA-1-CD ( I-SUB ) = ZEROES
              if (	( d51uRetRulIpa.getD51uRetRuleIpa(work.getISub() - 1).getD51uRipaClmIpa1Cd() == 0 )) { 
                  // MOVE 'Y' TO WS-SEARCH-COMPLETE
                  //  LITERAL_Y = 'Y'
                  work.setSearchComplete(CONSTANTS.LITERAL_Y);
              }
  
//  ELSE
              else { 
//  IF D51U-RIPA-GRP-TBL-1-NBR ( I-SUB ) NOT EQUAL SPACES OR D51U-RIPA-GRP-TBL-2-NBR ( I-SUB ) NOT EQUAL SPACES OR D51U-RIPA-GRP-TBL-3-NBR ( I-SUB ) NOT EQUAL SPACES
                  if (        ( !allSpaces(d51uRetRulIpa.getD51uRetRuleIpa(work.getISub() - 1).getD51uRipaGrpTbl1Nbr())  ) ||         ( !allSpaces(d51uRetRulIpa.getD51uRetRuleIpa(work.getISub() - 1).getD51uRipaGrpTbl2Nbr())  ) ||         ( !allSpaces(d51uRetRulIpa.getD51uRetRuleIpa(work.getISub() - 1).getD51uRipaGrpTbl3Nbr())  )) { 
//  SET GTN-LOADED TO TRUE
                      work.setGtnLoaded1True(); 
                      
                  }
  
//  PERFORM VARYING IPA-SUB FROM 1 BY 1 UNTIL IPA-SUB > PPA-PPO-ID-COUNT
                  for (work.setIpaSub(1); (	( work.getIpaSub() <= ppaFixedPortion.getPpaPpoIdCount() ) ) ; work.setIpaSub(work.getIpaSub() + 1) ) {
//  IF PPA-IPA ( IPA-SUB ) > ZEROES AND PPA-GRP-TAB-NO ( IPA-SUB ) > SPACES
                      if (	( ppaPpoaltRecord.getPpaPpoId(work.getIpaSub() - 1).getPpaOccurrence().getPpaIpa() > 0 ) &&              ( isGreaterThanSpaces(ppaPpoaltRecord.getPpaPpoId(work.getIpaSub() - 1).getPpaOccurrence().getPpaGrpTabNo()) )) { 

// ***70203N   ppa-grp-tab-no (ipa-sub) > zeroes
                          uEarliestDos51 = m51uLinkage.getUEarliestDos51();
//  IF ( ( LK-51U-EARLIEST-DOS NOT < PPA-FIRST-EFF-DATE ( IPA-SUB )) AND ( LK-51U-EARLIEST-DOS NOT > PPA-LAST-CAN-DATE ( IPA-SUB )))
                          if ((((	( uEarliestDos51 >= ppaPpoaltRecord.getPpaPpoId(work.getIpaSub() - 1).getPpaOccurrence().getPpaFirstEffDate() ) )) && ((	( uEarliestDos51 <= ppaPpoaltRecord.getPpaPpoId(work.getIpaSub() - 1).getPpaOccurrence().getPpaLastCanDate() ) )))) { 
//  IF ( PPA-IPA ( IPA-SUB ) = D51U-RIPA-CLM-IPA-1-CD ( I-SUB ) AND PPA-GRP-TAB-NO ( IPA-SUB ) = D51U-RIPA-GRP-TBL-1-NBR ( I-SUB )) OR ( PPA-IPA ( IPA-SUB ) = D51U-RIPA-CLM-IPA-2-CD ( I-SUB ) AND PPA-GRP-TAB-NO ( IPA-SUB ) = D51U-RIPA-GRP-TBL-2-NBR ( I-SUB )) OR ( PPA-IPA ( IPA-SUB ) = D51U-RIPA-CLM-IPA-3-CD ( I-SUB ) AND PPA-GRP-TAB-NO ( IPA-SUB ) = D51U-RIPA-GRP-TBL-3-NBR ( I-SUB ))
                              if ((	( ppaPpoaltRecord.getPpaPpoId(work.getIpaSub() - 1).getPpaOccurrence().getPpaIpa() == d51uRetRulIpa.getD51uRetRuleIpa(work.getISub() - 1).getD51uRipaClmIpa1Cd() ) && 		compareChars(ppaPpoaltRecord.getPpaPpoId(work.getIpaSub() - 1).getPpaOccurrence().getPpaGrpTabNo(),d51uRetRulIpa.getD51uRetRuleIpa(work.getISub() - 1).getD51uRipaGrpTbl1Nbr()) == 0 ) || (	( ppaPpoaltRecord.getPpaPpoId(work.getIpaSub() - 1).getPpaOccurrence().getPpaIpa() == d51uRetRulIpa.getD51uRetRuleIpa(work.getISub() - 1).getD51uRipaClmIpa2Cd() ) && 		compareChars(ppaPpoaltRecord.getPpaPpoId(work.getIpaSub() - 1).getPpaOccurrence().getPpaGrpTabNo(),d51uRetRulIpa.getD51uRetRuleIpa(work.getISub() - 1).getD51uRipaGrpTbl2Nbr()) == 0 ) || (	( ppaPpoaltRecord.getPpaPpoId(work.getIpaSub() - 1).getPpaOccurrence().getPpaIpa() == d51uRetRulIpa.getD51uRetRuleIpa(work.getISub() - 1).getD51uRipaClmIpa3Cd() ) && 		compareChars(ppaPpoaltRecord.getPpaPpoId(work.getIpaSub() - 1).getPpaOccurrence().getPpaGrpTabNo(),d51uRetRulIpa.getD51uRetRuleIpa(work.getISub() - 1).getD51uRipaGrpTbl3Nbr()) == 0 )) { 
                                  // MOVE 'Y' TO WS-IPA-AND-GTN-FOUND
                                  //  LITERAL_Y = 'Y'
                                  work.setIpaAndGtnFound(CONSTANTS.LITERAL_Y);
                              }
  
                          }
  
                      }
  
                  }
  
//  IF NOT IPA-AND-GTN-FOUND AND NOT GTN-LOADED
                  if (!(work.isIpaAndGtnFound1())  && !(work.isGtnLoaded1()) ) { 
//  PERFORM VARYING IPA-SUB FROM 1 BY 1 UNTIL IPA-SUB > PPA-PPO-ID-COUNT
                      for (work.setIpaSub(1); (	( work.getIpaSub() <= ppaFixedPortion.getPpaPpoIdCount() ) ) ; work.setIpaSub(work.getIpaSub() + 1) ) {
//  IF PPA-IPA ( IPA-SUB ) > ZEROES
                          if (	( ppaPpoaltRecord.getPpaPpoId(work.getIpaSub() - 1).getPpaOccurrence().getPpaIpa() > 0 )) { 
                              uEarliestDos51 = m51uLinkage.getUEarliestDos51();
//  IF ( ( LK-51U-EARLIEST-DOS NOT < PPA-FIRST-EFF-DATE ( IPA-SUB )) AND ( LK-51U-EARLIEST-DOS NOT > PPA-LAST-CAN-DATE ( IPA-SUB )))
                              if ((((	( uEarliestDos51 >= ppaPpoaltRecord.getPpaPpoId(work.getIpaSub() - 1).getPpaOccurrence().getPpaFirstEffDate() ) )) && ((	( uEarliestDos51 <= ppaPpoaltRecord.getPpaPpoId(work.getIpaSub() - 1).getPpaOccurrence().getPpaLastCanDate() ) )))) { 
//  IF ( ( PPA-IPA ( IPA-SUB ) = D51U-RIPA-CLM-IPA-1-CD ( I-SUB )) OR ( PPA-IPA ( IPA-SUB ) = D51U-RIPA-CLM-IPA-2-CD ( I-SUB )) OR ( PPA-IPA ( IPA-SUB ) = D51U-RIPA-CLM-IPA-3-CD ( I-SUB )))
                                  if ((((	( ppaPpoaltRecord.getPpaPpoId(work.getIpaSub() - 1).getPpaOccurrence().getPpaIpa() == d51uRetRulIpa.getD51uRetRuleIpa(work.getISub() - 1).getD51uRipaClmIpa1Cd() ))) || ((	( ppaPpoaltRecord.getPpaPpoId(work.getIpaSub() - 1).getPpaOccurrence().getPpaIpa() == d51uRetRulIpa.getD51uRetRuleIpa(work.getISub() - 1).getD51uRipaClmIpa2Cd() ))) || ((	( ppaPpoaltRecord.getPpaPpoId(work.getIpaSub() - 1).getPpaOccurrence().getPpaIpa() == d51uRetRulIpa.getD51uRetRuleIpa(work.getISub() - 1).getD51uRipaClmIpa3Cd() ))))) { 
                                      // MOVE 'Y' TO WS-IPA-CODE-FOUND
                                      //  LITERAL_Y = 'Y'
                                      work.setIpaCodeFound(CONSTANTS.LITERAL_Y);
                                  }
  
                              }
  
                          }
  
                      }
  
                  }

// *      If ipa-code-found
//  IF IPA-CODE-FOUND OR IPA-AND-GTN-FOUND
                  if ( work.isIpaCodeFound1()   ||  work.isIpaAndGtnFound1()  ) { 
//  ADD 1 TO WS-NBR-MATCHED
                      workFields.setNbrMatched( (short) (workFields.getNbrMatched()+(short)1));

// *45917C    move d51u-ripa-drv-pos(i-sub)  to ws-hold-ps
//  MOVE D51U-RIPA-DRV-POS ( I-SUB ) TO WS-RIPA-PS
                      holdTransData2.setRipaPs(vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIpa().getD51uRetRuleIpa(work.getISub() - 1).getD51uRipaDrvPos());
  
//  MOVE D51U-RIPA-DRV-SVC ( I-SUB ) TO WS-RIPA-SVC
                      holdTransData2.setRipaSvc(vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIpa().getD51uRetRuleIpa(work.getISub() - 1).getD51uRipaDrvSvc());
  
//  MOVE D51U-RIPA-DRV-CAU ( I-SUB ) TO WS-RIPA-CAUSE-CD
                      holdTransData2.setRipaCauseCd(vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulIpa().getD51uRetRuleIpa(work.getISub() - 1).getD51uRipaDrvCau());
  
                  }
              }
          }
  
      
      }
      /**
      * searchCflg 
      *   This method is derived from 
  *   COBOL Paragraph - 2170D-SEARCH-CFLG SECTION COBOL Cyclomatic complexity - 6
      * Input  :  

      * - d51uCflgDrvPos                 COBOL Name: D51U-CFLG-DRV-POS
      * - prevPs                         COBOL Name: WS-PREV-PS
      * - d51uCflgDrvSvc                 COBOL Name: D51U-CFLG-DRV-SVC
      * - prevSvc                        COBOL Name: WS-PREV-SVC
      * - d51uCflgDrvCau                 COBOL Name: D51U-CFLG-DRV-CAU
      * - prevCauseCd                    COBOL Name: WS-PREV-CAUSE-CD
      * - cflgSub                        COBOL Name: CFLG-SUB
      * - d51uCflgCpeDescCd              COBOL Name: D51U-CFLG-CPE-DESC-CD
      * - uCpeDescCd51                   COBOL Name: LK-51U-CPE-DESC-CD
      * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
      *
      * Output :  

      * - paragraph                      COBOL Name: WS-PARAGRAPH
      * - sameTable                      COBOL Name: WS-SAME-TABLE
      * - searchComplete                 COBOL Name: WS-SEARCH-COMPLETE
      * - nbrMatched                     COBOL Name: WS-NBR-MATCHED
      * - cflgPs                         COBOL Name: WS-CFLG-PS
      * - d51uCflgDrvPos                 COBOL Name: D51U-CFLG-DRV-POS
      * - cflgSvc                        COBOL Name: WS-CFLG-SVC
      * - d51uCflgDrvSvc                 COBOL Name: D51U-CFLG-DRV-SVC
      * - cflgCauseCd                    COBOL Name: WS-CFLG-CAUSE-CD
      * - d51uCflgDrvCau                 COBOL Name: D51U-CFLG-DRV-CAU
      * - cpeFlgFound                    COBOL Name: WS-CPE-FLG-FOUND
      *
      * @throws CFException
      */
      private void searchCflg() throws Exception {
			// Declare local variables used in the method
			D51uRetRulCpeFlgData d51uRetRulCpeFlgData = vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulCpeFlgData();
			HoldTransData2 holdTransData2 = workFields.getHoldTransData2();
			M51uLinkage m51uLinkage = dfhcommarea.getLinkAreaM51u().getM51uLinkage();
			char[] uCpeDescCd51 = null;
			char[] prevPs = null;
			char[] prevSvc = null;
			char[] prevCauseCd = null;
			PrevMatchedKey prevMatchedKey = workFields.getPrevMatchedKey();
			// End of variable declaration

      
// *81***************************************************************
// *81 2170D-search-cflg                                            *
// *81                                                              *
// *81 business function:                                           *
// *81 this section increments the counter which indicates the      *
// *81 number of matches when ever a cpe flag   match is found.     *
// *81***************************************************************
// *82***************************************************************
// *82 2170d-search-cflg                                            *
// *82                                                              *
// *82 1. if the cause code for that particular index is empty, it  *
// *82    denotes that the search is complete. else, increase the   *
// *82    number of matches by 1.                                   *
// *82***************************************************************

// *-------------------*
//  MOVE '2170D' TO WS-PARAGRAPH
//  LITERAL_2170D = '2170D'
          workFields.setParagraph(CONSTANTS.LITERAL_2170D);
          prevCauseCd = prevMatchedKey.getPrevCauseCd();
          prevSvc = prevMatchedKey.getPrevSvc();
          prevPs = prevMatchedKey.getPrevPs();
//  IF D51U-CFLG-DRV-POS ( CFLG-SUB ) = WS-PREV-PS AND D51U-CFLG-DRV-SVC ( CFLG-SUB ) = WS-PREV-SVC AND D51U-CFLG-DRV-CAU ( CFLG-SUB ) = WS-PREV-CAUSE-CD
          if (		compareChars(d51uRetRulCpeFlgData.getD51uRetRulCpeFlg(work.getCflgSub() - 1).getD51uCflgDrvPos(),prevPs) == 0  && 		compareChars(d51uRetRulCpeFlgData.getD51uRetRulCpeFlg(work.getCflgSub() - 1).getD51uCflgDrvSvc(),prevSvc) == 0  && 		compareChars(d51uRetRulCpeFlgData.getD51uRetRulCpeFlg(work.getCflgSub() - 1).getD51uCflgDrvCau(),prevCauseCd) == 0 ) { 
//  SET SAME-TABLE TO TRUE
              work.setSameTable1True(); 
              
//  IF D51U-CFLG-CPE-DESC-CD ( CFLG-SUB ) = SPACES
              if (        ( allSpaces(d51uRetRulCpeFlgData.getD51uRetRulCpeFlg(work.getCflgSub() - 1).getD51uCflgCpeDescCd())   )) { 
                  // MOVE 'Y' TO WS-SEARCH-COMPLETE
                  //  LITERAL_Y = 'Y'
                  work.setSearchComplete(CONSTANTS.LITERAL_Y);
              }
  
//  ELSE
              else { 
                  uCpeDescCd51 = m51uLinkage.getUCpeDescCd51();
//  IF LK-51U-CPE-DESC-CD = D51U-CFLG-CPE-DESC-CD ( CFLG-SUB )
                  if (		compareChars(uCpeDescCd51,d51uRetRulCpeFlgData.getD51uRetRulCpeFlg(work.getCflgSub() - 1).getD51uCflgCpeDescCd()) == 0 ) { 
//  ADD 1 TO WS-NBR-MATCHED
                      workFields.setNbrMatched( (short) (workFields.getNbrMatched()+(short)1));
//  MOVE D51U-CFLG-DRV-POS ( CAUSE-SUB ) TO WS-CFLG-PS
                      holdTransData2.setCflgPs(vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulCpeFlgData().getD51uRetRulCpeFlg(work.getCauseSub() - 1).getD51uCflgDrvPos());
  
//  MOVE D51U-CFLG-DRV-SVC ( CAUSE-SUB ) TO WS-CFLG-SVC
                      holdTransData2.setCflgSvc(vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulCpeFlgData().getD51uRetRulCpeFlg(work.getCauseSub() - 1).getD51uCflgDrvSvc());
  
//  MOVE D51U-CFLG-DRV-CAU ( CAUSE-SUB ) TO WS-CFLG-CAUSE-CD
                      holdTransData2.setCflgCauseCd(vyspi51uCallArea.getD51uReturnArea().getD51uArrayData().getD51uRetRulCpeFlgData().getD51uRetRulCpeFlg(work.getCauseSub() - 1).getD51uCflgDrvCau());
  
                      // MOVE 'Y' TO WS-CPE-FLG-FOUND
                      //  LITERAL_Y = 'Y'
                      work.setCpeFlgFound(CONSTANTS.LITERAL_Y);
                  }
  
              }
          }
  
      
      }
  
  
      /**
* This method pre-initializes variables consistent with
* what a mainframe program would have done at the start of a program
*/
      @Override
      public void initVars() throws CFException {
      setProgramEnded(false);
      	if (getCICSSession() == null)
          setCICSSession(TransactionManager.getSession());
       doNotSkipReadPlanAltDb2 = true;
       doNotSkipExit = true;
       doNotSkipGenericTranslation = true;
       doNotSkipNewSpiTranslation = true;
       doNotSkipReadPlanAltFile = true;
          if(!isInitDone()) {
          	this.setRc(0);
          	setInitDone(true);
          }
        CFUtil.resetDecimalAsComma();
       }
  
      public int call(Object[] params) throws Exception {
      
      int len = params.length;
         if (len > 1 && params[1] != null )
            dfhcommarea.set((Field)params[1]);
         // invoke the process and return rc
         return process();
         
      }
      
      public int call(Field... parameters) throws Exception {
         for (int index = 0; index < parameters.length;index++) {
             switch(index) {
              case 1:
                      if(parameters[index] != null ) {
              		if (parameters[index] instanceof Dfhcommarea) {
                       	this.dfhcommarea = ((Dfhcommarea) parameters[index]);
                  	} else {
                       	this.dfhcommarea.set(parameters[index]);
                  	}
                  }
                
                  break;
            }
         }
          return process();
      }
      
      
      public void setFromD529351u(Object[] params) {
      int len = params.length;
         if (len > 0)
         if(params[0] instanceof Field) 
   dsmCallArea.setString(((Field)params[0] ).toCharArray());
 else    dsmCallArea.setString((char[])params[0] );
         if (len > 1)
         if(params[1] instanceof Field) 
   vyspi51uCallArea.setString(((Field)params[1] ).toCharArray());
 else    vyspi51uCallArea.setString((char[])params[1] );
      }
  
  
  
  
  
  }
  /* 
*00***************************************************************
*00  licensed materials - property of united health group        *
*00                                                              *
*00    n o t   r e v i e w e d - comments have not been reviewed *
*00                              by sme                          *
*00***************************************************************
*10***************************************************************
*10  program name       :  o529351u.                             *
*10  business function  :  apply special processing instruction  *
*10                        (spi) translations.                   *
*10  designed by        :  n/a.                                  *
*10  programmed by      :  norcross isd.                         *
*10  date coded         :  april 1993.                           *
*10  type               :  batch.                                *
*10***************************************************************
*20***************************************************************
*20  major program process:                                      *
*20                                                              *
*20  this program uses the new policy, plan rule and plan        *
*20  variation file to determine whether a claim can be selected *
*20  for spi(special processing instructions) ps(place of        *
*20  service)/svc(service) substitition.                         *
*20  the program also applies generic translations to claims.    *
*20***************************************************************
*25***************************************************************
*25  parm info:                                                  *
*25                                                              *
*25  format      : n/a                                           *
*25  description : n/a                                           *
*25***************************************************************
*30***************************************************************
*30  program change log:                                         *
*30                                                              *
*30  pr #       date        level#                               *
*30  -----      -----       -------                              *
*30  jamie      april 02    cpt modifier 'c' needed to equate    *
*30  nixon                  to '2' but the spi logic was never   *
*30                         coded with the enhancement put in    *
*30                         99-01.  this hard-codes the equate.  *
*30                         if other equates are needed, there   *
*30                         is probably a better way to do this. *
*30  bob g.     july'93     added generic translation table      *
*30                         to process generic spi nos.          *
*30                         added paragraph 2015.                *
*30  ss         01/28/04    structured comments.                 *
*30  heidi t.   august 04   add eqi read after tops service code *
*30                         copybook read. if service code not   *
*30                         found, read eqi file to obtain       *
*30                         service code.                        *
*30   heidi t.   august 04  change the logic to read hcpcs codes *
*30                         in range.                            *
*30                                                              *
*30   rob kerr   june 05    removed epd-diag-record. it is no    *
*30                         longer used.                         *
*30   s. nichols july 05    sos issue 05-5863                    *
*30   rel0509    sept 05    field  expansion  sprf - 400001912   *
*30                         changes for sep 2005 release         *
*30  angel  antonio  12/05  add golden rule file for sprf 4-3937 *
*30                         dependent termination letters        *
*30   aman      january 06  removed open and close of files as a *
*30                         part of rta release                  *
*30   aman      january 06  added abend logic for rta r1.2       *
*30   rashmi    january 06  added abend logic for rta r1.2       *
*30 rel0608 refai ahamed sprf#4-8105: validating                 *
*30                   lk-line-service-code is a new service code *
*30                   or not when lk-51u-ccm-n-o-svc-ind = 'n'   *
*30 rel0703 deepthi   adding code to applies special processing  *
*30                   instruction(spi) translations              *
*30 rel0703 shine     fix for defect # 20243                     *
*30 rel0804 amit watts fix for sos 08-8798                       *
*30 relq111 janet caille fix for 10-0862, bumping tbl to 50      *
*30 relq311 rohit     hpsm pm10004822 tops modernization         *
*30         kumar     clean-up warning messgaes                  *
*30 relq311 janet caille fix for 10-0935, trnsl c rev codes      *
*30 relq311 girish    sprf 4-41737 icd10 field expansion         *
*30         velivala  defect fix # 10459                         *
*30 relq212 m.silva  added access to db2 spi tables if spi switch*
*30                  to call spi-db2 tables are turned on        *
*30 relq212 m.silva  fix abend in btmq due to dates conversion   *
*30 relq212 m.silva  addtional changes                           *
*30 relq212 m.silva  qc 3211 changes to move derived ps, svc cd  *
*30                  and cause code                              *
*30 relq212 m.silva  qc 3211 increase the diag occurs to 25      *
*30 relq212 m.silva  qc 4796 fix for asra abend                  *
*30 relq212 m.silva  qc5811  include derived ps, svc-cd and      *
*30                  cause cd in matching criteria               *
*30 relq212 m.silva  qc7401  fixed for regresion defect          *
*30 relq212 m.silva  qc9901  spi rules key matching              *
*30 relq312 rohit     hpsm pm10051935 tops modernization         *
*30         kumar     clean-up warning messgaes                  *
*30                   deleted 9998-goback section along with     *
*30                   perform 9998-goback statements coded with  *
*30                   tag p04822 and 45917c after made the       *
*30                   changes in vyerdump cicscopy.              *
*30                      ==== no code drop ====                  *
*30 relq312 p.parakh mdtr-2012-0520-1a-tops                      *
*30 relq312 p.parakh defect fix 7281 and 7267 - ipa match        *
*30 relq312 d.schein regenerate due to new cobparm defect 7743   *
*30 relq312 p.parakh defect fix 7841                             *
*30 relq412 aneesh   sos 12-2017 fe-spi should not be picked     *
*30         murali   without a match on ipa                      *
*30 relq412m rekha kumari sos 12-2073 code change                *
*30 relq113   chet walkuski    sprf# 4-47477 icd10 e-i           *
*30                            compliance release.qc#1247.       *
*30 relq213  ashutosh     - sprf 4-48111 - icd10 e&i             *
*30          savarni        commercial paper claims release      *
*30                       - diagnosis increased from 4 to 12     *
*30                       - dx pointer increased to  4 bytes     *
*30                       - mpi-dx-point increase to 2 bytes     *
*30 relq413 mcdermott     - sprf 4-57589 - new prime spi logic   *
*30                         will try to read spi with model      *
*30                         policy and plan if slot fields valued*
*30                         if not found, use values passed in   *
*30                         policy and plan                      *
*30 relq413 henderson     - sprf 4-57589 - added backout logic   *
*30                                        for prime spi logic   *
*30 relq413 henderson     - sprf 4-57589 - qc 1618 - addl check  *
*30                                        for plan var not found*
*30  rel14q2  hpsm pm10153810 -gaurav b. - fix for icd fetches   *
*30                                        beyond 9999 for table *
*30                                        fe_spi_rule_icd       *
*30                                      - fix for alm#15752-q114*
*30                                                alm#3903 -q214*
*30 q3-14 d schein     remove call to restart table              *
*30                    dtr mdtr-2014-0425-1a-tops                *
*30                    for fe spi  the following values will     *
*30                    be hardcode to on                         *
*30                    fe_spi_switch, fe_prime_spi_switch=on     *
*30 q3-14 d schein     defect 10489 remove warning messages      *
*30 q1-15 girish       changes for mdtr--2013-1014-1a-tops       *
*30       velivala/    added fix for hpsm pm10172289 to handle   *
*30       p.parakh     more than 9999 icd10 codes                *
*30 relq315 nick       4-70293 claims processing                 *
*30         bukwich    added checks to value ipa-and-gtn-found   *
*30 relq415 abhilasha  fix for sos 15-3411                       *
*30 relq116 manoj      fix for sos 15-3533                       *
*30         ganna      added new checks for ipa & gtn processing *
*30 relq116 manoj      fix for alm #4808 for sos 15-3533         *
*30         ganna      ppa-grp-tab-no checked with spaces        *
*30 rel1703 santosh s  fix for sos 17-3880.                      *
*30 rel17q4 gandharvi  prj116714 pharmacy coupon benefits        *
*30         tandon     added new service codes cb0 - cb9         *
*30 rel18q4 derek      prj145017 internal and customer reporting *
*30                                                              *
*30 rel1909 raj s      prj145017 internal and customer reporting *
*30                         added pos-tier-typ-cd field          *
*30 rel1909 jaspuneet  prj179220 msk logic to handle pri-diag-ind*
*30 rel2002 vasanthan  prj196213 alpha codes- fe spi service code*
*30         santhanam  ranges that start and end with alpha.     *
*30 rel2002 vasanthan  prj196213 -defect de295296. to bypass inst*
*30         santhanam  claims to match cpt ranges.               *
*30 rel2105 ankita     prj272472 - emergent non-emergent project*
*30         agarwal    phase 2 and 3                             *
*30 rel2108 vivek      prb1008113 : o529351u to threadsafe       *
*30         dahiya                                               *
*30 rel2109 y.levitis - prj272209 - designated diagnostic        *
*30                     provider (ddp). added  -                 *
*30                     major diagnostic eligible indicator      *
*30***************************************************************
*40***************************************************************
*40  external called programs:                                   *
*40                                                              *
*40  name                  description              call/link    *
*40  ----                  -----------              ---------    *
*40  m5293opi             output interface            call       *
*40  vp055a00             i/o handler                 call       *
*40  d529351u             dsm for spi table           call       *
*40  d5427rst             gen_sys_rst table           call       *
*40***************************************************************
*50***************************************************************
*50  return codes:                                               *
*50                                                              *
*50  code                  description                           *
*50  ---------------       --------------------------------      *
*50  n/a                   n/a                                   *
*50***************************************************************
*60***************************************************************
*60  files used:                                                 *
*60                                                              *
*60  filename              mode           description            *
*60  --------              ----           ----------------       *
*60  spirules              read           spi rules file         *
*60  planvara              read           plan variation file    *
*60  eqifile               read           service code equate    *
*60                                       initiate file          *
*60***************************************************************
*70***************************************************************
*70  tables and access types:                                    *
*70                                                              *
*70  name                  type           access                 *
*70  --------------        ----           -------                *
*70  n/a                   n/a            n/a                    *
*70***************************************************************
*/
