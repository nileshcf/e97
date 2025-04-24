  package com.cloudframe.app.process.impl;
  /* 
*------------------------
*------------------------
*---------------------
*/
  
  import com.cloudframe.app.mcissues.McissuesCtx.*;
  import com.cloudframe.app.mcissues.McissuesCtx;
  import com.cloudframe.app.process.Mcissues;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import com.cloudframe.app.utility.CFUtil;
  import java.util.ArrayList;
  import com.cloudframe.app.data.Field;
  import java.util.Map;
  import java.util.HashMap;
  import java.math.BigDecimal;
  import com.cloudframe.app.exception.Terminate;
  import java.math.RoundingMode;
  import com.cloudframe.app.mcissues.dto.*;
  import com.cloudframe.app.mcissues.dto.Sys295EffDateGroup;
  import com.cloudframe.app.mcissues.dto.Date2;
  import com.cloudframe.app.mcissues.dto.A;
  import com.cloudframe.app.mcissues.dto.Ip43501ErrorInfoRec;
  import com.cloudframe.app.mcissues.dto.Ip503011TblEffDateRecord;
  import com.cloudframe.app.mcissues.dto.PeVersionNumMsg600;
  import com.cloudframe.app.mcissues.dto.Grp1;
  import com.cloudframe.app.mcissues.dto.ErrorInfoTableDefault315;
  import com.cloudframe.app.mcissues.dto.DtlRecord4800;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.global.sharedvar.Cf50005ClearingGrp;
  import com.cloudframe.app.mcissues.dto.SortKeyLthTable700;
  import com.cloudframe.app.global.sharedvar.Cf20004TableData;
  import com.cloudframe.app.mcissues.dto.Ip500041Rec;
  import com.cloudframe.app.mcissues.dto.DtlRecord3800;
  import com.cloudframe.app.mcissues.dto.Ip90354MasterRec;
  import com.cloudframe.app.mcissues.dto.C;
  import com.cloudframe.app.mcissues.dto.InputVars800;
  import com.cloudframe.app.global.sharedvar.Ip31021SummaryControlCard;
  import com.cloudframe.app.mcissues.dto.Group;
  import com.cloudframe.app.global.sharedvar.Ip66102IpmMsg;
  import com.cloudframe.app.mcissues.dto.AbBusslBussiValues800;
  import com.cloudframe.app.mcissues.dto.Holidays500;
  import com.cloudframe.app.mcissues.dto.DtlCnt800;
  import com.cloudframe.app.mcissues.dto.Ip33701TargetCurExp9Group;
  import com.cloudframe.app.mcissues.dto.EmptyIndexGroup800;
  import com.cloudframe.app.mcissues.dto.MapRow1ValGroup800;
  import com.cloudframe.app.mcissues.dto.InterimDateXGroup800;
  import com.cloudframe.app.mcissues.dto.PreEditVersionGroup300;
  import com.cloudframe.app.mcissues.dto.InxBGroup;
  import com.cloudframe.app.global.sharedvar.Ip2ooo1EditWorkRecord;
  import com.cloudframe.app.global.sharedvar.Ip3oo8o1EditsPerfTbl;
  import com.cloudframe.app.global.sharedvar.Ip655o4CurrentTagTable;
  import com.cloudframe.app.global.sharedvar.Ip655o4TcntGroup;
  import com.cloudframe.app.global.sharedvar.Ip40004IntMsgHdrRecGroup;
  import com.cloudframe.app.mcissues.dto.Ip66601UserTagInformation;
  import com.cloudframe.app.mcissues.dto.Ip00485MemberEntryInfo;
  import com.cloudframe.app.mcissues.dto.ClearingDtTm9Grp900;
  import com.cloudframe.app.mcissues.dto.ClearingDtTm9ShortGrp900;
  import com.cloudframe.app.mcissues.dto.TableArray;
  import com.cloudframe.app.mcissues.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("mcissues")
  
  public class McissuesImpl extends CommonProcess implements Mcissues {
  
  Logger logger = LoggerFactory.getLogger(McissuesImpl.class);
  
  
  
  
  
  
  private static final int IP66601_USER_TAG_LENGTH = 13;
  private static final int TABLE_ITEM_LENGTH = 8;
  
  
  
  
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      public int process(McissuesCtx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
          ;
//  PERFORM 0000-MAIN
          main(programCtx);/*0000-MAIN*/
          if (programCtx.isProgramEnded()) {
              return programCtx.getRc();
          }
       } catch(Exception e) {
            handleErrorCode(e);
            throw e;
       }
      
       return programCtx.getRc(); // Exit with return code
      // end of process method
      }
      /**
      * main 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAIN COBOL Cyclomatic complexity - 232
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void main(McissuesCtx programCtx) throws Exception {
//  PERFORM 0000-MAIN-SPLIT0
          mainSplit0(programCtx.getMainSplit0InCtx());/*0000-MAIN-SPLIT0*/
//  PERFORM 0000-MAIN-SPLIT1
          mainSplit1(programCtx.getMainSplit1InCtx());/*0000-MAIN-SPLIT1*/
//  PERFORM 0000-MAIN-SPLIT2
          mainSplit2(programCtx.getMainSplit2InCtx());/*0000-MAIN-SPLIT2*/
//  PERFORM 0000-MAIN-SPLIT3
          mainSplit3(programCtx.getMainSplit3InCtx());/*0000-MAIN-SPLIT3*/
//  PERFORM 0000-MAIN-SPLIT4
          mainSplit4(programCtx.getMainSplit4InCtx());/*0000-MAIN-SPLIT4*/
//  PERFORM 0000-MAIN-SPLIT5
          mainSplit5(programCtx.getMainSplit5InCtx());/*0000-MAIN-SPLIT5*/
      
      }
      /**
      * mainSplit0 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAIN-SPLIT0 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - ip90354MasterRec               COBOL Name: IP90354-MASTER-REC
      * - ip503011TblEffDateRecord       COBOL Name: IP503011-TBL-EFF-DATE-RECORD
      * - one                            COBOL Name: WS-ONE
      * - errorInfoTableDefault315       COBOL Name: 315-ERROR-INFO-TABLE-DEFAULT
      * - idx                            COBOL Name: WS-IDX
      *
      * Output :  

      * - dateWs                         COBOL Name: WS-DATE
      * - sys295EffDate                  COBOL Name: SYS295-EFF-DATE
      * - ip20004ItemLength              COBOL Name: IP20004-ITEM-LENGTH
      * - tmpLth800                      COBOL Name: 800-TMP-LTH
      * - ip90354L1CtlTableType          COBOL Name: IP90354-L1-CTL-TABLE-TYPE
      * - ip90354L1Ctlmti                COBOL Name: IP90354-L1-CTLMTI
      * - ip90354L1Ctlfunc               COBOL Name: IP90354-L1-CTLFUNC
      * - ip90354L1IndFld                COBOL Name: IP90354-L1-IND-FLD
      * - ip90354L1Ctldata               COBOL Name: IP90354-L1-CTLDATA
      * - ip90354L1Ctlexclusionind       COBOL Name: IP90354-L1-CTLEXCLUSIONIND
      * - display                        COBOL Name: WS-DISPLAY
      * - ip90354MasterRec               COBOL Name: IP90354-MASTER-REC
      * - ip503011TableId                COBOL Name: IP503011-TABLE-ID
      * - ip503011TblEffDate             COBOL Name: IP503011-TBL-EFF-DATE
      * - group                          COBOL Name: WS-GROUP
      * - dtlIdx                         COBOL Name: DTL-IDX
      * - data500                        COBOL Name: 500-DATA
      * - cond                           COBOL Name: WS-COND
      * - ip2ooo1ErrorInfoTable          COBOL Name: IP2OOO1-ERROR-INFO-TABLE
      * - errorInfoTableDefault315       COBOL Name: 315-ERROR-INFO-TABLE-DEFAULT
      * - idx                            COBOL Name: WS-IDX
      * - ip2ooo1ErrorType               COBOL Name: IP2OOO1-ERROR-TYPE
      * - ip2ooo1ErrorIndex              COBOL Name: IP2OOO1-ERROR-INDEX
      * - ip2ooo1ErrorMsgSevCd           COBOL Name: IP2OOO1-ERROR-MSG-SEV-CD
      * - ip2ooo1ErrorNumber             COBOL Name: IP2OOO1-ERROR-NUMBER
      * - ip2ooo1ErrorMsgNumber          COBOL Name: IP2OOO1-ERROR-MSG-NUMBER
      * - ip2ooo1IpmFieldType            COBOL Name: IP2OOO1-IPM-FIELD-TYPE
      * - ip2ooo1IpmFieldNumber          COBOL Name: IP2OOO1-IPM-FIELD-NUMBER
      * - ip2ooo1IpmSubfldNumber         COBOL Name: IP2OOO1-IPM-SUBFLD-NUMBER
      * - ip2ooo1ReplText                COBOL Name: IP2OOO1-REPL-TEXT
      *
      * @throws CFException
      */
      @Override
      public MainSplit0OutCtx mainSplit0(MainSplit0InCtx methodIn) throws Exception {
McissuesCtx programCtx = methodIn.getMcissuesCtx();
MainSplit0OutCtx methodOut = methodIn.getMainSplit0OutCtx();

// *
// * This is a copy of mc066
// *
          // MOVE '20201123' TO WS-DATE
          methodOut.setDateWs((long)20201123);
//  DISPLAY '* 1* WS-DATE = ' WS-DATE
          logger.info("* 1* WS-DATE = {}", String.valueOf(methodOut.getDateWs())); 
          // MOVE WS-DATE TO SYS295-EFF-DATE (1 : 8)
          methodOut.setSys295EffDate(replace(methodOut.getSys295EffDateString(),methodOut.getDateWsString(),0,8));
          // MOVE 14 TO SYS295-EFF-DATE (9 : 2)
          //  LITERAL_14 = 14
          methodOut.setSys295EffDate(replace(methodOut.getSys295EffDateString(),CONSTANTS.LITERAL_14,8,10));
//  DISPLAY '* 2* SYS295-EFF-DATE = ' SYS295-EFF-DATE
          logger.info("* 2* SYS295-EFF-DATE = {}", String.valueOf(methodOut.getSys295EffDate())); 

// *
// * This is a copy of mc066
// *
          // MOVE 5 TO IP20004-ITEM-LENGTH
          methodOut.setIp20004ItemLength((short)5);
//  DISPLAY '* 3*  IP20004-ITEM-LENGTH  = ' IP20004-ITEM-LENGTH
          logger.info("* 3*  IP20004-ITEM-LENGTH  = {}", String.valueOf(methodOut.getIp20004ItemLength())); 

// *
//  DIVIDE IP20004-ITEM-LENGTH BY 2 GIVING IP20004-ITEM-LENGTH REMAINDER 800-TMP-LTH
          methodOut.setTmpLth800( (short) (methodOut.getIp20004ItemLength()%2));
          methodOut.setIp20004ItemLength( (short) (methodOut.getIp20004ItemLength()/2));

// *
//  DISPLAY '* 4*  IP20004-ITEM-LENGTH  = ' IP20004-ITEM-LENGTH
          logger.info("* 4*  IP20004-ITEM-LENGTH  = {}", String.valueOf(methodOut.getIp20004ItemLength())); 
//  DISPLAY '* 5*  800-TMP-LTH          = ' 800-TMP-LTH
          logger.info("* 5*  800-TMP-LTH          = {}", String.valueOf(methodOut.getTmpLth800())); 

// *
          // MOVE 5 TO IP20004-ITEM-LENGTH
          methodOut.setIp20004ItemLength((short)5);
//  DISPLAY '* 6*  IP20004-ITEM-LENGTH  = ' IP20004-ITEM-LENGTH
          logger.info("* 6*  IP20004-ITEM-LENGTH  = {}", String.valueOf(methodOut.getIp20004ItemLength())); 

// *
//  DIVIDE IP20004-ITEM-LENGTH BY 2 GIVING 800-TMP-LTH REMAINDER IP20004-ITEM-LENGTH
          methodOut.setTmpLth800( (short) (methodOut.getIp20004ItemLength()/2));
          methodOut.setIp20004ItemLength( (short) (methodOut.getIp20004ItemLength()%2));

// *
//  DISPLAY '* 7*  IP20004-ITEM-LENGTH  = ' IP20004-ITEM-LENGTH
          logger.info("* 7*  IP20004-ITEM-LENGTH  = {}", String.valueOf(methodOut.getIp20004ItemLength())); 
//  DISPLAY '* 8*  800-TMP-LTH          = ' 800-TMP-LTH
          logger.info("* 8*  800-TMP-LTH          = {}", String.valueOf(methodOut.getTmpLth800())); 

// *
// * This is a copy of mc069 (set modified missing)
// *
          // MOVE 5 TO IP90354-L1-CTL-TABLE-TYPE
          methodOut.setIp90354L1CtlTableType(5);
          // MOVE 1214 TO IP90354-L1-CTLMTI
          methodOut.setIp90354L1Ctlmti(1214);
          // MOVE 456 TO IP90354-L1-CTLFUNC
          methodOut.setIp90354L1Ctlfunc(456);
          // MOVE 111 TO IP90354-L1-IND-FLD
          methodOut.setIp90354L1IndFld(111);
//  MOVE 'A' TO IP90354-L1-CTLDATA
//  LITERAL_A = 'A'
          methodOut.setIp90354L1Ctldata(CONSTANTS.LITERAL_A_B25_);
//  MOVE 'B' TO IP90354-L1-CTLEXCLUSIONIND
//  LITERAL_B = 'B'
          methodOut.setIp90354L1Ctlexclusionind(CONSTANTS.LITERAL_B);
          // MOVE IP90354-MASTER-REC (1 : 100) TO WS-DISPLAY (1 : 100)
          methodOut.setDisplay(replace(methodOut.getDisplay(),substring(methodOut.getIp90354MasterRec().getCharArray(),0,100),0,100));
//  DISPLAY '* 9* WS-DISPLAY = ' WS-DISPLAY
          logger.info("* 9* WS-DISPLAY = {}", new String(methodOut.getDisplay())); 
          // MOVE 5 TO IP90354-L1-CTL-TABLE-TYPE
          methodOut.setIp90354L1CtlTableType(5);
          // MOVE 1224 TO IP90354-L1-CTLMTI
          methodOut.setIp90354L1Ctlmti(1224);
          // MOVE 200 TO IP90354-L1-CTLFUNC
          methodOut.setIp90354L1Ctlfunc(200);
          // MOVE 111 TO IP90354-L1-IND-FLD
          methodOut.setIp90354L1IndFld(111);
//  MOVE 'A' TO IP90354-L1-CTLDATA
//  LITERAL_A = 'A'
          methodOut.setIp90354L1Ctldata(CONSTANTS.LITERAL_A_B25_);
//  MOVE 'B' TO IP90354-L1-CTLEXCLUSIONIND
//  LITERAL_B = 'B'
          methodOut.setIp90354L1Ctlexclusionind(CONSTANTS.LITERAL_B);
          // MOVE IP90354-MASTER-REC (1 : 100) TO WS-DISPLAY (1 : 100)
          methodOut.setDisplay(replace(methodOut.getDisplay(),substring(methodOut.getIp90354MasterRec().getCharArray(),0,100),0,100));
//  DISPLAY '*10* WS-DISPLAY = ' WS-DISPLAY
          logger.info("*10* WS-DISPLAY = {}", new String(methodOut.getDisplay())); 

// *
// * This is a copy of mc070
// *
//  MOVE 'IP5005T1' TO IP503011-TABLE-ID
//  LITERAL_IP5005T1 = 'IP5005T1'
          methodOut.setIp503011TableId(CONSTANTS.LITERAL_IP5005T1);
          // MOVE '20201130' TO IP503011-TBL-EFF-DATE
          methodOut.setIp503011TblEffDate((long)20201130);
//  DISPLAY '*12* ' IP503011-TBL-EFF-DATE-RECORD
          logger.info("*12* {}", methodIn.getIp503011TblEffDateRecord().toString()); 
//  DISPLAY '*13* MOVING 9999 TO IP503011-TABLE-ID'
          logger.info("*13* MOVING 9999 TO IP503011-TABLE-ID"); 
          // MOVE 9999 TO IP503011-TABLE-ID
          //  LITERAL_9999 = 9999
          methodOut.setIp503011TableId(CONSTANTS.LITERAL_9999);
//  DISPLAY '*14* IP503011-TABLE-ID = ' IP503011-TABLE-ID
          logger.info("*14* IP503011-TABLE-ID = {}", new String(methodOut.getIp503011TableId())); 
//  IF IP503011-TABLE-ID = 9999 THEN
//  LITERAL_9999 = 9999
          if (compareChars(methodOut.getIp503011TableId(),CONSTANTS.LITERAL_9999_B4_) == 0) { 
//  DISPLAY '*15* IF IP503011-TABLE-ID = 9999 ** MATCHED'
              logger.info("*15* IF IP503011-TABLE-ID = 9999 ** MATCHED"); 
          }
//  ELSE
          else { 
//  DISPLAY '*16* IF IP503011-TABLE-ID = 9999 ** FAILURE'
              logger.info("*16* IF IP503011-TABLE-ID = 9999 ** FAILURE"); 
          }

// *
// * This is a copy of mc080
// *
          // MOVE 'AAAABBBBCCCCDDDDEEEE' TO WS-GROUP
          //  LITERAL_AAAABBBBCCCCDDDDEEEE = 'AAAABBBBCCCCDDDDEEEE'
          methodOut.getGroup().setString(CONSTANTS.LITERAL_AAAABBBBCCCCDDDDEEEE);
//  SET DTL-IDX TO WS-ONE
          methodOut.setDtlIdx(methodIn.getOne()); 
          
//  DISPLAY '*17* 500-DATA(1) =  ' 500-DATA ( DTL-IDX )
          logger.info("*17* 500-DATA(1) =  {}", new String(methodOut.getData500(methodOut.getDtlIdx() - 1))); 
//  SET DTL-IDX UP BY WS-FOUR
          methodOut.setDtlIdx(methodOut.getDtlIdx() + methodIn.getFour()); 
          
//  DISPLAY '*18* 500-DATA(4) =  ' 500-DATA ( DTL-IDX )
          logger.info("*18* 500-DATA(4) =  {}", new String(methodOut.getData500(methodOut.getDtlIdx() - 1))); 
//  SET DTL-IDX DOWN BY WS-TWO
          methodOut.setDtlIdx(methodOut.getDtlIdx() - methodIn.getTwo()); 
          
//  DISPLAY '*19* 500-DATA(2) =  ' 500-DATA ( DTL-IDX )
          logger.info("*19* 500-DATA(2) =  {}", new String(methodOut.getData500(methodOut.getDtlIdx() - 1))); 

// *
// * This is a copy of ml001
// *
          // MOVE 'A' TO WS-COND
          //  LITERAL_A = 'A'
          methodOut.setCond(CONSTANTS.LITERAL_A);
//  EVALUATE TRUE
          if  (( methodOut.isCondA()  ) || ( methodOut.isCondB()  ) || ( methodOut.isCondC()  )) { 
//  DISPLAY '*20* WS-COND = ' WS-COND
              logger.info("*20* WS-COND = {}", new String(methodOut.getCond())); 
          }
          else   { 
//  DISPLAY '*20* **ERROR**'
              logger.info("*20* **ERROR**"); 
          }

// *
//  EVALUATE TRUE
          if  (( methodOut.isCondA()  ) || ( methodOut.isCondB()  ) || ( methodOut.isCondC()  ) || ( methodOut.isCondD()  )) { 
//  DISPLAY '*21* WS-COND = ' WS-COND
              logger.info("*21* WS-COND = {}", new String(methodOut.getCond())); 
          }
          else   { 
//  DISPLAY '*21* **ERROR**'
              logger.info("*21* **ERROR**"); 
          }

// *
//  EVALUATE TRUE
          if  (( methodOut.isCondA()  ) || ( methodOut.isCondB()  )) { 
//  DISPLAY '*22* WS-COND = ' WS-COND
              logger.info("*22* WS-COND = {}", new String(methodOut.getCond())); 
          }
          else if  (( methodOut.isCondC()  ) || ( methodOut.isCondD()  )) { 
//  DISPLAY '*22* **ERROR**'
              logger.info("*22* **ERROR**"); 
          }
          else   { 
//  DISPLAY '*22* **ERROR**'
              logger.info("*22* **ERROR**"); 
          }

// *
//  EVALUATE TRUE
          if  (( methodOut.isCondA()  ) || ( methodOut.isCondB()  ) || ( methodOut.isCondC()  ) || ( methodOut.isCondD()  ) || ( methodOut.isCondE()  ) || ( methodOut.isCondF()  ) || ( methodOut.isCondG()  )) { 
//  DISPLAY '*23* WS-COND = ' WS-COND
              logger.info("*23* WS-COND = {}", new String(methodOut.getCond())); 
          }
          else   { 
//  DISPLAY '*23* **ERROR**'
              logger.info("*23* **ERROR**"); 
          }

// *
// * This is a copy of mc095
// *
// *
          // MOVE 315-ERROR-INFO-TABLE-DEFAULT TO IP2OOO1-ERROR-INFO-TABLE
          methodOut.getIp2ooo1ErrorInfoTable().setString(methodOut.getErrorInfoTableDefault315().getCharArray());

// *
//  PERFORM VARYING WS-IDX FROM 1 BY 1 UNTIL WS-IDX > 10
          for (methodOut.setIdx(1); (	( methodOut.getIdx() <= 10 )) ; methodOut.setIdx(methodOut.getIdx() + 1) ) {
//  DISPLAY '*24* IP2OOO1-ERROR-TYPE(' WS-IDX ') = ' IP2OOO1-ERROR-TYPE ( WS-IDX )
              logger.info("*24* IP2OOO1-ERROR-TYPE({}) = {}", String.valueOf(methodOut.getIdx()), String.valueOf(methodOut.getIp2ooo1ErrorType(methodOut.getIdx() - 1))); 
//  DISPLAY '*25* IP2OOO1-ERROR-INDEX(' WS-IDX ') = ' IP2OOO1-ERROR-INDEX ( WS-IDX )
              logger.info("*25* IP2OOO1-ERROR-INDEX({}) = {}", String.valueOf(methodOut.getIdx()), methodOut.getIp2ooo1ErrorIndex(methodOut.getIdx() - 1).toString()); 
//  DISPLAY '*26* IP2OOO1-ERROR-MSG-SEV-CD(' WS-IDX ') = ' IP2OOO1-ERROR-MSG-SEV-CD ( WS-IDX )
              logger.info("*26* IP2OOO1-ERROR-MSG-SEV-CD({}) = {}", String.valueOf(methodOut.getIdx()), String.valueOf(methodOut.getIp2ooo1ErrorMsgSevCd(methodOut.getIdx() - 1))); 
//  DISPLAY '*27* IP2OOO1-ERROR-NUMBER(' WS-IDX ') = ' IP2OOO1-ERROR-NUMBER ( WS-IDX )
              logger.info("*27* IP2OOO1-ERROR-NUMBER({}) = {}", String.valueOf(methodOut.getIdx()), String.valueOf(methodOut.getIp2ooo1ErrorNumber(methodOut.getIdx() - 1))); 
//  DISPLAY '*28* IP2OOO1-ERROR-MSG-NUMBER(' WS-IDX ') = ' IP2OOO1-ERROR-MSG-NUMBER ( WS-IDX )
              logger.info("*28* IP2OOO1-ERROR-MSG-NUMBER({}) = {}", String.valueOf(methodOut.getIdx()), String.valueOf(methodOut.getIp2ooo1ErrorMsgNumber(methodOut.getIdx() - 1))); 
//  DISPLAY '*29* IP2OOO1-IPM-FIELD-TYPE(' WS-IDX ') = ' IP2OOO1-IPM-FIELD-TYPE ( WS-IDX )
              logger.info("*29* IP2OOO1-IPM-FIELD-TYPE({}) = {}", String.valueOf(methodOut.getIdx()), new String(methodOut.getIp2ooo1IpmFieldType(methodOut.getIdx() - 1))); 
//  DISPLAY '*30* IP2OOO1-IPM-FIELD-NUMBER(' WS-IDX ') = ' IP2OOO1-IPM-FIELD-NUMBER ( WS-IDX )
              logger.info("*30* IP2OOO1-IPM-FIELD-NUMBER({}) = {}", String.valueOf(methodOut.getIdx()), String.valueOf(methodOut.getIp2ooo1IpmFieldNumber(methodOut.getIdx() - 1))); 
//  DISPLAY '*31* IP2OOO1-IPM-SUBFLD-NUMBER(' WS-IDX ') = ' IP2OOO1-IPM-SUBFLD-NUMBER ( WS-IDX )
              logger.info("*31* IP2OOO1-IPM-SUBFLD-NUMBER({}) = {}", String.valueOf(methodOut.getIdx()), String.valueOf(methodOut.getIp2ooo1IpmSubfldNumber(methodOut.getIdx() - 1))); 
//  DISPLAY '*32* IP2OOO1-REPL-TEXT(' WS-IDX ',1) = ' IP2OOO1-REPL-TEXT ( WS-IDX ,1)
              logger.info("*32* IP2OOO1-REPL-TEXT({},1) = {}", String.valueOf(methodOut.getIdx()), new String(methodOut.getIp2ooo1ReplText(methodOut.getIdx() - 1,0))); 
//  IF IP2OOO1-REPL-TEXT ( WS-IDX ,2) = SPACES
              if (        ( allSpaces(methodOut.getIp2ooo1ReplText(methodOut.getIdx() - 1,1))   )) { 
//  DISPLAY '*33* IP2OOO1-REPL-TEXT(' WS-IDX ',2) = ' 'SPACES'
                  logger.info("*33* IP2OOO1-REPL-TEXT({},2) = SPACES", String.valueOf(methodOut.getIdx())); 
              }
//  ELSE
              else { 
//  DISPLAY '*34* IP2OOO1-REPL-TEXT(' WS-IDX ',2) = ' 'NOT SPACES'
                  logger.info("*34* IP2OOO1-REPL-TEXT({},2) = NOT SPACES", String.valueOf(methodOut.getIdx())); 
              }
//  IF IP2OOO1-REPL-TEXT ( WS-IDX ,3) = SPACES
              if (        ( allSpaces(methodOut.getIp2ooo1ReplText(methodOut.getIdx() - 1,2))   )) { 
//  DISPLAY '*35* IP2OOO1-REPL-TEXT(' WS-IDX ',3) = ' 'SPACES'
                  logger.info("*35* IP2OOO1-REPL-TEXT({},3) = SPACES", String.valueOf(methodOut.getIdx())); 
              }
//  ELSE
              else { 
//  DISPLAY '*36* IP2OOO1-REPL-TEXT(' WS-IDX ',3) = ' 'NOT SPACES'
                  logger.info("*36* IP2OOO1-REPL-TEXT({},3) = NOT SPACES", String.valueOf(methodOut.getIdx())); 
              }
          }
      
      return methodOut;
      }
      /**
      * mainSplit1 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAIN-SPLIT1 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - date2                          COBOL Name: WS-DATE-2
      * - ip3oo8o1EditPerformedInd       COBOL Name: IP3OO8O1-EDIT-PERFORMED-IND
      * - idx                            COBOL Name: WS-IDX
      * - ip66601UserTag                 COBOL Name: IP66601-USER-TAG
      * - xmlTag300                      COBOL Name: 300-XML-TAG
      * - xmlData300                     COBOL Name: 300-XML-DATA
      * - xmlTag2300                     COBOL Name: 300-XML-TAG2
      * - xmlTag3300                     COBOL Name: 300-XML-TAG3
      * - xmlTag4300                     COBOL Name: 300-XML-TAG4
      * - ip33701RateSrcToTrg            COBOL Name: IP33701-RATE-SRC-TO-TRG
      * - value1300                      COBOL Name: 300-VALUE-1
      * - subIdx400                      COBOL Name: 400-SUB-IDX
      * - value100300                    COBOL Name: 300-VALUE-100
      *
      * Output :  

      * - date21                         COBOL Name: WS-DATE-2-1
      * - date22                         COBOL Name: WS-DATE-2-2
      * - date3                          COBOL Name: WS-DATE-3
      * - date2                          COBOL Name: WS-DATE-2
      * - sys295EffDate2                 COBOL Name: SYS295-EFF-DATE-2
      * - ip3oo8o1EditsInitStr           COBOL Name: IP3OO8O1-EDITS-INIT-STR
      * - ip3oo8o1EditsHolder            COBOL Name: IP3OO8O1-EDITS-HOLDER
      * - ip3oo8o1Idx                    COBOL Name: IP3OO8O1-IDX
      * - ip655o4T                       COBOL Name: IP655O4-T
      * - ip655o4Tcnt                    COBOL Name: IP655O4-TCNT
      * - ip66601UserTcnt                COBOL Name: IP66601-USER-TCNT
      * - idx                            COBOL Name: WS-IDX
      * - ip66601UserTagType             COBOL Name: IP66601-USER-TAG-TYPE
      * - ip66601UserTagNo               COBOL Name: IP66601-USER-TAG-NO
      * - ip66601UserTagOccurrence       COBOL Name: IP66601-USER-TAG-OCCURRENCE
      * - ip66601UserTagSubfldNo         COBOL Name: IP66601-USER-TAG-SUBFLD-NO
      * - ip66601UserTagStart            COBOL Name: IP66601-USER-TAG-START
      * - ip66601UserTagLngth            COBOL Name: IP66601-USER-TAG-LNGTH
      * - ip66601UserTagStatus           COBOL Name: IP66601-USER-TAG-STATUS
      * - ip66601UserT                   COBOL Name: IP66601-USER-T
      * - ip66601UserP                   COBOL Name: IP66601-USER-P
      * - ip66601UserLeft                COBOL Name: IP66601-USER-LEFT
      * - ip66601UserRight               COBOL Name: IP66601-USER-RIGHT
      * - ip66601UserMedian              COBOL Name: IP66601-USER-MEDIAN
      * - ip66601UserStart               COBOL Name: IP66601-USER-START
      * - ip66601UserEnd                 COBOL Name: IP66601-USER-END
      * - ip66601UserTag                 COBOL Name: IP66601-USER-TAG
      * - xmlStr300                      COBOL Name: 300-XML-STR
      * - ip33701RateSrcToTrg            COBOL Name: IP33701-RATE-SRC-TO-TRG
      * - totalSubCount400               COBOL Name: 400-TOTAL-SUB-COUNT
      * - subIdx400                      COBOL Name: 400-SUB-IDX
      * - subValueCount400               COBOL Name: 400-SUB-VALUE-COUNT
      *
      * @throws CFException
      */
      @Override
      public MainSplit1OutCtx mainSplit1(MainSplit1InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			// End of variable declaration

McissuesCtx programCtx = methodIn.getMcissuesCtx();
MainSplit1OutCtx methodOut = methodIn.getMainSplit1OutCtx();

// *
          // MOVE '20201112' TO WS-DATE-2-1
          //  LITERAL_20201112 = '20201112'
          methodOut.setDate21(CONSTANTS.LITERAL_20201112);
          // MOVE '24' TO WS-DATE-2-2
          //  LITERAL_24 = '24'
          methodOut.setDate22(CONSTANTS.LITERAL_24);
          // MOVE WS-DATE-2 TO WS-DATE-3
          methodOut.getWork().replace(padSpaces(12,methodOut.getDate2().toCharArray()), /* beginIndex */16, /* length */12);
//  DISPLAY '*37* WS-DATE-2         = ' WS-DATE-2
          logger.info("*37* WS-DATE-2         = {}", methodOut.getDate2().toString()); 
//  DISPLAY '*38* WS-DATE-3         = ' WS-DATE-3
          logger.info("*38* WS-DATE-3         = {}", String.valueOf(methodOut.getDate3())); 
          // MOVE WS-DATE-3 TO SYS295-EFF-DATE-2
          methodOut.setSys295EffDate2(methodOut.getDate3String());
//  DISPLAY '*39* SYS295-EFF-DATE-2 = ' SYS295-EFF-DATE-2
          logger.info("*39* SYS295-EFF-DATE-2 = {}", new String(methodOut.getSys295EffDate2())); 

// *
//  INITIALIZE IP3OO8O1-EDITS-INIT-STR
          methodOut.setIp3oo8o1EditsInitStr(CONSTANTS.SPACE_4000 /* Fill 4000 Spaces*/);
//  MOVE IP3OO8O1-EDITS-INIT-STR TO IP3OO8O1-EDITS-HOLDER
          methodOut.setIp3oo8o1EditsHolder(methodOut.getIp3oo8o1EditsInitStr());
//  SET IP3OO8O1-IDX TO 435
          methodOut.setIp3oo8o1Idx(435); 
          
//  IF 88-IP3OO8O1-EDIT-NOT-PERFORMED ( IP3OO8O1-IDX )
          if ( methodIn.isIp3oo8o1EditNotPerformed88(methodOut.getIp3oo8o1Idx() - 1)  ) { 
//  DISPLAY '*40* *SUCCESS* 88-IP3OO8O1-EDIT-NOT-PERFORMED '
              logger.info("*40* *SUCCESS* 88-IP3OO8O1-EDIT-NOT-PERFORMED "); 
          }
//  ELSE
          else { 
//  DISPLAY '*41* *FAILURE* 88-IP3OO8O1-EDIT-PERFORMED '
              logger.info("*41* *FAILURE* 88-IP3OO8O1-EDIT-PERFORMED "); 
          }

// *
//  SET IP655O4-T TO 2
          methodOut.setIp655o4T(2); 
          
//  SET IP655O4-TCNT , IP66601-USER-TCNT TO IP655O4-T
          methodOut.setIp655o4Tcnt((short) (short) methodOut.getIp655o4T()); 
          
          methodOut.setIp66601UserTcnt((short) (short) methodOut.getIp655o4T()); 
          
//  DISPLAY '*42* IP655O4-TCNT      = ' IP655O4-TCNT
          logger.info("*42* IP655O4-TCNT      = {}", String.valueOf(methodOut.getIp655o4Tcnt())); 
//  DISPLAY '*43* IP66601-USER-TCNT = ' IP66601-USER-TCNT
          logger.info("*43* IP66601-USER-TCNT = {}", String.valueOf(methodOut.getIp66601UserTcnt())); 

// *
// *
// * Populate ip66601-user-tag-table
// *
//  PERFORM VARYING WS-IDX FROM 1 BY 1 UNTIL WS-IDX > 10
          for (methodOut.setIdx(1); (	( methodOut.getIdx() <= 10 )) ; methodOut.setIdx(methodOut.getIdx() + 1) ) {
              // MOVE WS-IDX TO IP66601-USER-TAG-TYPE ( WS-IDX )
              methodOut.setIp66601UserTagType(methodOut.getIdx() - 1,(short) methodOut.getIdx());
              methodOut.setIp66601UserTagNo(methodOut.getIdx() - 1,(short) (methodOut.getIdx() * 10));
              methodOut.setIp66601UserTagOccurrence(methodOut.getIdx() - 1,(short) (methodOut.getIdx() * 11));
              methodOut.setIp66601UserTagSubfldNo(methodOut.getIdx() - 1,(short) (methodOut.getIdx() * 12));
              methodOut.setIp66601UserTagStart(methodOut.getIdx() - 1,(short) (methodOut.getIdx() * 13));
              methodOut.setIp66601UserTagLngth(methodOut.getIdx() - 1,(short) (methodOut.getIdx() * 14));
              // MOVE 'A' TO IP66601-USER-TAG-STATUS ( WS-IDX )
              //  LITERAL_A = 'A'
              methodOut.setIp66601UserTagStatus(methodOut.getIdx() - 1,CONSTANTS.LITERAL_A);
          }

// *
//  SET IP66601-USER-T , IP66601-USER-P TO 1
          methodOut.setIp66601UserT(1); 
          
          methodOut.setIp66601UserP(1); 
          
//  SET IP66601-USER-LEFT TO 1
          methodOut.setIp66601UserLeft(1); 
          
//  SET IP66601-USER-RIGHT TO 10
          methodOut.setIp66601UserRight(10); 
          
//  SET IP66601-USER-MEDIAN TO 5
          methodOut.setIp66601UserMedian(5); 
          
//  SET IP66601-USER-START TO 6
          methodOut.setIp66601UserStart(6); 
          
//  SET IP66601-USER-END TO 7
          methodOut.setIp66601UserEnd(7); 
          
//  SET IP66601-USER-P TO 1
          methodOut.setIp66601UserP(1); 
          

// *
//  MOVE IP66601-USER-TAG ( IP66601-USER-T ) TO IP66601-USER-TAG (11)
          methodOut.setIp66601UserTag(10,methodOut.getIp66601UserTag(methodOut.getIp66601UserT() - 1).toCharArray());

// *
//  IF IP66601-USER-TAG ( IP66601-USER-MEDIAN ) > IP66601-USER-TAG ( IP66601-USER-LEFT )
          if (		compareChars(methodOut.getIp66601UserTag(methodOut.getIp66601UserMedian() - 1),methodOut.getIp66601UserTag(methodOut.getIp66601UserLeft() - 1)) > 0 ) { 
//  DISPLAY '*44* SUCCESS ** GROUP COMPARE >'
              logger.info("*44* SUCCESS ** GROUP COMPARE >"); 
          }
//  ELSE
          else { 
//  DISPLAY '*45* ERROR   ** GROUP COMPARE >'
              logger.info("*45* ERROR   ** GROUP COMPARE >"); 
          }

// *
//  IF IP66601-USER-TAG ( IP66601-USER-START ) < IP66601-USER-TAG ( IP66601-USER-END )
          if (		compareChars(methodOut.getIp66601UserTag(methodOut.getIp66601UserStart() - 1),methodOut.getIp66601UserTag(methodOut.getIp66601UserEnd() - 1)) < 0 ) { 
//  DISPLAY '*46* SUCCESS ** GROUP COMPARE <'
              logger.info("*46* SUCCESS ** GROUP COMPARE <"); 
          }
//  ELSE
          else { 
//  DISPLAY '*47* ERROR   ** GROUP COMPARE <'
              logger.info("*47* ERROR   ** GROUP COMPARE <"); 
          }

// *
//  SET IP66601-USER-P TO 11
          methodOut.setIp66601UserP(11); 
          
//  IF IP66601-USER-TAG ( IP66601-USER-T ) = IP66601-USER-TAG ( IP66601-USER-P )
          if (		compareChars(methodOut.getIp66601UserTag(methodOut.getIp66601UserT() - 1),methodOut.getIp66601UserTag(methodOut.getIp66601UserP() - 1)) == 0 ) { 
//  DISPLAY '*48* SUCCESS ** GROUP COMPARE ='
              logger.info("*48* SUCCESS ** GROUP COMPARE ="); 
          }
//  ELSE
          else { 
//  DISPLAY '*49* ERROR   ** GROUP COMPARE ='
              logger.info("*49* ERROR   ** GROUP COMPARE ="); 
          }

// *
//  IF IP66601-USER-TAG ( IP66601-USER-MEDIAN ) <= IP66601-USER-TAG ( IP66601-USER-END )
          if (		compareChars(methodOut.getIp66601UserTag(methodOut.getIp66601UserMedian() - 1),methodOut.getIp66601UserTag(methodOut.getIp66601UserEnd() - 1)) <= 0 ) { 
//  DISPLAY '*50* SUCCESS ** GROUP COMPARE <='
              logger.info("*50* SUCCESS ** GROUP COMPARE <="); 
          }
//  ELSE
          else { 
//  DISPLAY '*51* ERROR   ** GROUP COMPARE >='
              logger.info("*51* ERROR   ** GROUP COMPARE >="); 
          }

// *
//  IF IP66601-USER-TAG ( IP66601-USER-MEDIAN ) NOT > IP66601-USER-TAG ( IP66601-USER-END )
          if (		compareChars(methodOut.getIp66601UserTag(methodOut.getIp66601UserMedian() - 1),methodOut.getIp66601UserTag(methodOut.getIp66601UserEnd() - 1)) <= 0 ) { 
//  DISPLAY '*50* SUCCESS ** GROUP COMPARE NOT >'
              logger.info("*50* SUCCESS ** GROUP COMPARE NOT >"); 
          }
//  ELSE
          else { 
//  DISPLAY '*51* ERROR   ** GROUP COMPARE NOT >'
              logger.info("*51* ERROR   ** GROUP COMPARE NOT >"); 
          }

// *
//  IF IP66601-USER-TAG ( IP66601-USER-RIGHT ) >= IP66601-USER-TAG ( IP66601-USER-LEFT )
          if (		compareChars(methodOut.getIp66601UserTag(methodOut.getIp66601UserRight() - 1),methodOut.getIp66601UserTag(methodOut.getIp66601UserLeft() - 1)) >= 0 ) { 
//  DISPLAY '*52* SUCCESS ** GROUP COMPARE >='
              logger.info("*52* SUCCESS ** GROUP COMPARE >="); 
          }
//  ELSE
          else { 
//  DISPLAY '*53* ERROR   ** GROUP COMPARE >='
              logger.info("*53* ERROR   ** GROUP COMPARE >="); 
          }

// *
//  IF IP66601-USER-TAG ( IP66601-USER-RIGHT ) NOT < IP66601-USER-TAG ( IP66601-USER-LEFT )
          if (		compareChars(methodOut.getIp66601UserTag(methodOut.getIp66601UserRight() - 1),methodOut.getIp66601UserTag(methodOut.getIp66601UserLeft() - 1)) >= 0 ) { 
//  DISPLAY '*52* SUCCESS ** GROUP COMPARE NOT <'
              logger.info("*52* SUCCESS ** GROUP COMPARE NOT <"); 
          }
//  ELSE
          else { 
//  DISPLAY '*53* ERROR   ** GROUP COMPARE NOT <'
              logger.info("*53* ERROR   ** GROUP COMPARE NOT <"); 
          }

// *
//  SET IP66601-USER-P TO 12
          methodOut.setIp66601UserP(12); 
          
//  IF IP66601-USER-TAG ( IP66601-USER-T ) = IP66601-USER-TAG ( IP66601-USER-P )
          if (		compareChars(methodOut.getIp66601UserTag(methodOut.getIp66601UserT() - 1),methodOut.getIp66601UserTag(methodOut.getIp66601UserP() - 1)) == 0 ) { 
//  DISPLAY '*54* ERROR   ** GROUP COMPARE ='
              logger.info("*54* ERROR   ** GROUP COMPARE ="); 
          }
//  ELSE
          else { 
//  DISPLAY '*55* SUCCESS ** GROUP COMPARE ='
              logger.info("*55* SUCCESS ** GROUP COMPARE ="); 
          }

// *
//  SET IP66601-USER-P TO 12
          methodOut.setIp66601UserP(12); 
          
//  IF IP66601-USER-TAG ( IP66601-USER-T ) NOT = IP66601-USER-TAG ( IP66601-USER-P )
          if (		compareChars(methodOut.getIp66601UserTag(methodOut.getIp66601UserT() - 1),methodOut.getIp66601UserTag(methodOut.getIp66601UserP() - 1)) != 0 ) { 
//  DISPLAY '*56* SUCCESS ** GROUP COMPARE NOT ='
              logger.info("*56* SUCCESS ** GROUP COMPARE NOT ="); 
          }
//  ELSE
          else { 
//  DISPLAY '*57* ERROR   ** GROUP COMPARE NOT ='
              logger.info("*57* ERROR   ** GROUP COMPARE NOT ="); 
          }

// *
//  DISPLAY '*58* 300-XML-TAG   = ' 300-XML-TAG
          logger.info("*58* 300-XML-TAG   = {}", new String(methodIn.getXmlTag300())); 
//  DISPLAY '*59* 300-XML-DATA  = ' 300-XML-DATA
          logger.info("*59* 300-XML-DATA  = {}", new String(methodIn.getXmlData300())); 
          // MOVE SPACES TO 300-XML-STR
          methodOut.setXmlStr300(CONSTANTS.SPACE_80);
//  STRING 300-XML-TAG 300-XML-DATA X'0D' DELIMITED BY SIZE INTO 300-XML-STR END-STRING
          charArray = new ArrayList<char[]>();
             charArray.add(methodIn.getXmlTag300());
             charArray.add(methodIn.getXmlData300());
             charArray.add(CONSTANTS.HEX_0D);
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2));
          updated = updateString(methodOut.getXmlStr300() ,joinCharArray);
          methodOut.setXmlStr300(  (char[])updated.get("string"));
//  DISPLAY '*60* 300-XML-STR   = ' 300-XML-STR
          logger.info("*60* 300-XML-STR   = {}", new String(methodOut.getXmlStr300())); 

// *
//  DISPLAY '*61* 300-XML-TAG2  = ' 300-XML-TAG2
          logger.info("*61* 300-XML-TAG2  = {}", new String(methodIn.getXmlTag2300())); 
//  DISPLAY '*62* 300-XML-DATA  = ' 300-XML-DATA
          logger.info("*62* 300-XML-DATA  = {}", new String(methodIn.getXmlData300())); 
          // MOVE SPACES TO 300-XML-STR
          methodOut.setXmlStr300(CONSTANTS.SPACE_80);
//  STRING 300-XML-TAG2 300-XML-DATA DELIMITED BY SIZE INTO 300-XML-STR END-STRING
          charArray = new ArrayList<char[]>();
             charArray.add(methodIn.getXmlTag2300());
             charArray.add(methodIn.getXmlData300());
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
          updated = updateString(methodOut.getXmlStr300() ,joinCharArray);
          methodOut.setXmlStr300(  (char[])updated.get("string"));
//  DISPLAY '*63* 300-XML-STR   = ' 300-XML-STR
          logger.info("*63* 300-XML-STR   = {}", new String(methodOut.getXmlStr300())); 

// *
//  DISPLAY '*64* 300-XML-TAG3  = ' 300-XML-TAG3
          logger.info("*64* 300-XML-TAG3  = {}", new String(methodIn.getXmlTag3300())); 
//  DISPLAY '*65* 300-XML-DATA  = ' 300-XML-DATA
          logger.info("*65* 300-XML-DATA  = {}", new String(methodIn.getXmlData300())); 
          // MOVE SPACES TO 300-XML-STR
          methodOut.setXmlStr300(CONSTANTS.SPACE_80);
//  STRING 300-XML-TAG3 300-XML-DATA DELIMITED BY SIZE INTO 300-XML-STR END-STRING
          charArray = new ArrayList<char[]>();
             charArray.add(methodIn.getXmlTag3300());
             charArray.add(methodIn.getXmlData300());
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
          updated = updateString(methodOut.getXmlStr300() ,joinCharArray);
          methodOut.setXmlStr300(  (char[])updated.get("string"));
//  DISPLAY '*66* 300-XML-STR   = ' 300-XML-STR
          logger.info("*66* 300-XML-STR   = {}", new String(methodOut.getXmlStr300())); 

// *
//  DISPLAY '*67* 300-XML-TAG4  = ' 300-XML-TAG4
          logger.info("*67* 300-XML-TAG4  = {}", new String(methodIn.getXmlTag4300())); 
//  DISPLAY '*68* 300-XML-DATA  = ' 300-XML-DATA
          logger.info("*68* 300-XML-DATA  = {}", new String(methodIn.getXmlData300())); 
          // MOVE SPACES TO 300-XML-STR
          methodOut.setXmlStr300(CONSTANTS.SPACE_80);
//  STRING 300-XML-TAG4 300-XML-DATA DELIMITED BY SIZE INTO 300-XML-STR END-STRING
          charArray = new ArrayList<char[]>();
             charArray.add(methodIn.getXmlTag4300());
             charArray.add(methodIn.getXmlData300());
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
          updated = updateString(methodOut.getXmlStr300() ,joinCharArray);
          methodOut.setXmlStr300(  (char[])updated.get("string"));
//  DISPLAY '*69* 300-XML-STR   = ' 300-XML-STR
          logger.info("*69* 300-XML-STR   = {}", new String(methodOut.getXmlStr300())); 

// *
//  IF 88-IP33701-SRC-TO-TRG-SAME THEN
          if ( methodIn.isIp33701SrcToTrgSame88()  ) { 
//  DISPLAY '*69* 88-IP33701-SRC-TO-TRG-SAME SET'
              logger.info("*69* 88-IP33701-SRC-TO-TRG-SAME SET"); 
          }
          // MOVE 5678.789 TO IP33701-RATE-SRC-TO-TRG
          methodOut.setIp33701RateSrcToTrg(BigDecimal.valueOf(5678.789).setScale(7).setScale(7));
//  IF NOT 88-IP33701-SRC-TO-TRG-SAME THEN
          if (!(methodIn.isIp33701SrcToTrgSame88()) ) { 
//  DISPLAY '*70* SUCCESS'
              logger.info("*70* SUCCESS"); 
          }
//  ELSE
          else { 
//  DISPLAY '*71* FAILURE'
              logger.info("*71* FAILURE"); 
          }
          // MOVE 5.678901 TO IP33701-RATE-SRC-TO-TRG
          methodOut.setIp33701RateSrcToTrg(BigDecimal.valueOf(5.678901).setScale(7).setScale(7));

// *    If 88-ip33701-src-to-trg-range then
// *       display '*72* success'
// *    else
// *       display '*73* failure'
// *    end-if
// *
          // MOVE ZEROES TO 400-TOTAL-SUB-COUNT
          methodOut.setTotalSubCount400((short) 0);
//  PERFORM VARYING 400-SUB-IDX FROM 300-VALUE-1 BY 300-VALUE-1 UNTIL 400-SUB-IDX > 300-VALUE-100
          for (methodOut.setSubIdx400(methodIn.getValue1300()); (	( methodOut.getSubIdx400() <= methodIn.getValue100300() )) ; methodOut.setSubIdx400(methodOut.getSubIdx400() + methodIn.getValue1300()) ) {
//  MOVE ZEROES TO 400-SUB-VALUE-COUNT ( 400-SUB-IDX )
              methodOut.setSubValueCount400(methodOut.getSubIdx400() - 1,(short) 0);
          }
      
      return methodOut;
      }
      /**
      * mainSplit2 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAIN-SPLIT2 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - ip40004FileIdFinan             COBOL Name: IP40004-FILE-ID-FINAN
      * - xmlText                        COBOL Name: WS-XML-TEXT
      * - mapRow1800                     COBOL Name: 800-MAP-ROW-1
      * - emptyIndex800                  COBOL Name: 800-EMPTY-INDEX
      * - ip66601UserTagStart            COBOL Name: IP66601-USER-TAG-START
      * - i                              COBOL Name: I
      * - idx                            COBOL Name: WS-IDX
      * - ip00485MemberEntry             COBOL Name: IP00485-MEMBER-ENTRY
      * - ip00485MemberIdx               COBOL Name: IP00485-MEMBER-IDX
      * - ab800                          COBOL Name: 800-AB
      * - bussl800                       COBOL Name: 800-BUSSL
      * - bussi800                       COBOL Name: 800-BUSSI
      *
      * Output :  

      * - ip00321ReplTextCount           COBOL Name: IP00321-REPL-TEXT-COUNT
      * - ip40004FinFileType             COBOL Name: IP40004-FIN-FILE-TYPE
      * - ip40004FinFileRefDate          COBOL Name: IP40004-FIN-FILE-REF-DATE
      * - ip40004FinProcessorId          COBOL Name: IP40004-FIN-PROCESSOR-ID
      * - ip40004FinFileSeqNum           COBOL Name: IP40004-FIN-FILE-SEQ-NUM
      * - strt800                        COBOL Name: 800-STRT
      * - ip66102IpmMsg                  COBOL Name: IP66102-IPM-MSG
      * - ip40004FileIdFinan             COBOL Name: IP40004-FILE-ID-FINAN
      * - numSpaces                      COBOL Name: WS-NUM-SPACES
      * - charWs                         COBOL Name: WS-CHAR
      * - xmlData805                     COBOL Name: 805-XML-DATA
      * - xmlText                        COBOL Name: WS-XML-TEXT
      * - index800                       COBOL Name: 800-INDEX
      * - ip66601UserT                   COBOL Name: IP66601-USER-T
      * - i                              COBOL Name: I
      * - editNumber800                  COBOL Name: 800-EDIT-NUMBER
      * - ip33701TargetCurExp            COBOL Name: IP33701-TARGET-CUR-EXP
      * - ip00485MemberEntries           COBOL Name: IP00485-MEMBER-ENTRIES
      * - idx                            COBOL Name: WS-IDX
      * - ip00485MemberId                COBOL Name: IP00485-MEMBER-ID
      * - ip00485UserTagOccurrence       COBOL Name: IP00485-USER-TAG-OCCURRENCE
      * - ip00485UserTagSubfldNo         COBOL Name: IP00485-USER-TAG-SUBFLD-NO
      * - ip00485UserTagStart            COBOL Name: IP00485-USER-TAG-START
      * - ip00485UserTagLngth            COBOL Name: IP00485-USER-TAG-LNGTH
      * - ip00485UserTagStatus           COBOL Name: IP00485-USER-TAG-STATUS
      * - abBusslBussiValues800          COBOL Name: 800-AB-BUSSL-BUSSI-VALUES
      * - holidays500                    COBOL Name: 500-HOLIDAYS
      * - exclusionFlag100               COBOL Name: 100-EXCLUSION-FLAG
      * - interimDateX800                COBOL Name: 800-INTERIM-DATE-X
      * - holidayIndex500                COBOL Name: 500-HOLIDAY-INDEX
      * - prevTransType801               COBOL Name: 801-PREV-TRANS-TYPE
      * - transType701                   COBOL Name: 701-TRANS-TYPE
      * - prevMccCode801                 COBOL Name: 801-PREV-MCC-CODE
      *
      * @throws CFException
      */
      @Override
      public MainSplit2OutCtx mainSplit2(MainSplit2InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			boolean keepSearching = true;
			int[] searchIndexes = null;
			int searchLowPoint = 0;
			int searchMidPoint = 0;
			int searchHighPoint = 0;
			int searchCompare = 0;
			// End of variable declaration

McissuesCtx programCtx = methodIn.getMcissuesCtx();
MainSplit2OutCtx methodOut = methodIn.getMainSplit2OutCtx();

// *
          // MOVE 2 TO IP00321-REPL-TEXT-COUNT
          methodOut.setIp00321ReplTextCount(2);
//  PERFORM 2100-FIND-MOVE-REPLACE-TEXT IP00321-REPL-TEXT-COUNT TIMES
          { 
            for (int index = 0; index < methodOut.getIp00321ReplTextCount(); index++) {
               findMoveReplaceText(programCtx.getFindMoveReplaceTextInCtx());/*2100-FIND-MOVE-REPLACE-TEXT*/
               if (programCtx.isProgramEnded()) {
                   return methodOut;
               }
            }
          }

// *
//  PERFORM 2100-FIND-MOVE-REPLACE-TEXT THRU 2100-EXIT IP00321-REPL-TEXT-COUNT TIMES
          { 
            for (int index = 0; index < methodOut.getIp00321ReplTextCount(); index++) {
               findMoveReplaceText(programCtx.getFindMoveReplaceTextInCtx());/*2100-FIND-MOVE-REPLACE-TEXT*/
               if (programCtx.isProgramEnded()) {
                   return methodOut;
               }
               exit(programCtx.getExitInCtx());/*2100-EXIT*/
               if (programCtx.isProgramEnded()) {
                   return methodOut;
               }
            }
          }

// *
// * Mc102
// *
          // MOVE '002' TO IP40004-FIN-FILE-TYPE
          //  LITERAL_002 = '002'
          methodOut.setIp40004FinFileType(CONSTANTS.LITERAL_002);
          // MOVE 200202 TO IP40004-FIN-FILE-REF-DATE
          methodOut.setIp40004FinFileRefDate((long)200202);
          // MOVE '0000001500001' TO IP40004-FIN-PROCESSOR-ID
          //  LITERAL_0000001500001 = '0000001500001'
          methodOut.setIp40004FinProcessorId(CONSTANTS.LITERAL_0000001500001);
          // MOVE 1 TO IP40004-FIN-FILE-SEQ-NUM
          methodOut.setIp40004FinFileSeqNum((long)1);
          // MOVE 258 TO 800-STRT
          methodOut.setStrt800((short)258);
          // MOVE IP40004-FILE-ID-FINAN TO IP66102-IPM-MSG ( 800-STRT : 25)
          methodOut.getIp66102IpmMsg().replace(methodOut.getIp40004IntMsgHdrRecGroup()/*parent*/,60/*fromOffset - (ip40004FileIdFinan) */,25/*fromLen*/,0+(methodOut.getStrt800() - 1)/*toOffset - (ip66102IpmMsg) */,25/*toLen*/);
//  DISPLAY 'IP66102-IPM-MSG(800-STRT:25) = ' IP66102-IPM-MSG ( 800-STRT : 25)
          logger.info("IP66102-IPM-MSG(800-STRT:25) = {}", new String(substring(methodOut.getIp66102IpmMsg().getCharArray(),(methodOut.getStrt800()-1), (methodOut.getStrt800() + 24) ))); 

// *
          // MOVE 123456 TO WS-NUM-SPACES
          //  LITERAL_123456 = 123456, FORMAT_2061439275 = "999999999"
          methodOut.setNumSpaces(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2061439275,CONSTANTS.LITERAL_123456));
//  DISPLAY '*74* WS-NUM-SPACES = ' WS-NUM-SPACES
          logger.info("*74* WS-NUM-SPACES = {}", new String(methodOut.getNumSpaces())); 
          // MOVE WS-NUM-SPACES TO WS-CHAR
          methodOut.setCharWs(methodOut.getNumSpaces());
//  DISPLAY '*75* WS-CHAR       = ' WS-CHAR
          logger.info("*75* WS-CHAR       = {}", new String(methodOut.getCharWs())); 
//  STRING 'NUM-VALUE ' WS-NUM-SPACES DELIMITED BY SIZE INTO WS-CHAR END-STRING
          charArray = new ArrayList<char[]>();
             charArray.add(CONSTANTS.LITERAL_NUM_MN_VALUE_B_);
             charArray.add(methodOut.getNumSpaces());
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
          updated = updateString(methodOut.getCharWs() ,joinCharArray);
          methodOut.setCharWs(  (char[])updated.get("string"));
//  DISPLAY '*76* WS-CHAR*STRING= ' WS-CHAR
          logger.info("*76* WS-CHAR*STRING= {}", new String(methodOut.getCharWs())); 
          // MOVE ZEROES TO WS-NUM-SPACES
          methodOut.setNumSpaces(CONSTANTS.SPACE_9);
//  DISPLAY '*77* WS-NUM-SPACES = ' WS-NUM-SPACES
          logger.info("*77* WS-NUM-SPACES = {}", new String(methodOut.getNumSpaces())); 
          // MOVE WS-NUM-SPACES TO WS-CHAR
          methodOut.setCharWs(methodOut.getNumSpaces());
//  DISPLAY '*78* WS-CHAR       = ' WS-CHAR
          logger.info("*78* WS-CHAR       = {}", new String(methodOut.getCharWs())); 
//  STRING 'NUM-VALUE ' WS-NUM-SPACES DELIMITED BY SIZE INTO WS-CHAR END-STRING
          charArray = new ArrayList<char[]>();
             charArray.add(CONSTANTS.LITERAL_NUM_MN_VALUE_B_);
             charArray.add(methodOut.getNumSpaces());
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
          updated = updateString(methodOut.getCharWs() ,joinCharArray);
          methodOut.setCharWs(  (char[])updated.get("string"));
//  DISPLAY '*79* WS-CHAR*STRING= ' WS-CHAR
          logger.info("*79* WS-CHAR*STRING= {}", new String(methodOut.getCharWs())); 

// *
// * Mc105 - inspect with mutiple replace
// *
          // MOVE WS-XML-TEXT TO 805-XML-DATA
          methodOut.setXmlData805(methodOut.getXmlText());
//  INSPECT 805-XML-DATA REPLACING ALL 300-LOW-VALUE BY 300-SPACE ALL 300-HIGH-VALUE BY 300-SPACE ALL 300-AMPERSAND BY 300-SPACE
          methodOut.setXmlData805(  replaceAll(methodOut.getXmlData805(),methodIn.getLowValue300(),methodIn.getSpace300())  );
          methodOut.setXmlData805(  replaceAll(methodOut.getXmlData805(),methodIn.getHighValue300(),methodIn.getSpace300())  );
          methodOut.setXmlData805(  replaceAll(methodOut.getXmlData805(),methodIn.getAmpersand300(),methodIn.getSpace300())  );
//  DISPLAY '*80* 805-XML-DATA = <' 805-XML-DATA '>'
          logger.info("*80* 805-XML-DATA = <{}>", new String(methodOut.getXmlData805())); 

// *
// * Mc104 - table index issues
// *
// * setting zero to table index
//  SET 800-INDEX TO 800-MAP-ROW-1
          methodOut.setIndex800(methodIn.getMapRow1800()); 
          
//  SET IP66601-USER-T TO 800-INDEX
          methodOut.setIp66601UserT((methodOut.getIndex800()/IP66601_USER_TAG_LENGTH) + 1 ); 
          
//  IF IP66601-USER-T = 800-EMPTY-INDEX
          if (	( methodOut.getIp66601UserT() == ( methodIn.getEmptyIndex800() / 13 ) + 1  )) { 

// *Quirk  display '*81* ip66601-user-t = 800-empty-index **matched'
//  IF IP66601-USER-TAG-START ( IP66601-USER-T ) = IP66601-USER-TAG-START (1)

// *Quirk  display '*83* ip66601-user-tag-start(ip66601-user-t) = '
// *quirk           ip66601-user-tag-start(ip66601-user-t)
//  IF IP66601-USER-T = 800-EMPTY-INDEX
              if (	( methodOut.getIp66601UserT() == ( methodIn.getEmptyIndex800() / 13 ) + 1  )) { 
//  SET IP66601-USER-T UP BY 1
                  methodOut.setIp66601UserT(methodOut.getIp66601UserT() + 1); 
                  
              }
          }

// *        Display '*98* ip66601-user-tag-start(ip66601-user-t) = '
// *                 ip66601-user-tag-start(ip66601-user-t)
// *       end-if
// *    end-if
// * setting zero to table index
// *    set ip66601-user-t to 300-value-0
// *    set 400-val to ip66601-user-t
// *    display '*87* 400-val  = ' 400-val
// *
// *    if ip66601-user-t = 800-empty-index
// *       display '*99* ip66601-user-t = 800-empty-index **matched'
// *       if ip66601-user-tag-start(ip66601-user-t) =
// *          ip66601-user-tag-start(1)
// *          display '*100* ip66601-user-tag-start(ip66601-user-t) '
// *                  'matches ip66601-user-tag-start(1)'
// *       end-if
// *       display '*101* ip66601-user-tag-start(ip66601-user-t) = '
// *                ip66601-user-tag-start(ip66601-user-t)
// *       if ip66601-user-t = 800-empty-index
// *        set ip66601-user-t up by 1
// *        display '*102* ip66601-user-tag-start(ip66601-user-t) = '
// *                 ip66601-user-tag-start(ip66601-user-t)
// *       end-if
// *    end-if
// *
// *
//  PERFORM VARYING I FROM 1 BY 1 UNTIL I > 5
          for (methodOut.setI(1); (	( methodOut.getI() <= 5 )) ; methodOut.setI(methodOut.getI() + 1) ) {
//  EVALUATE I
              switch(methodOut.getI()){
              	case 1:
                  // MOVE 0876 TO 800-EDIT-NUMBER
                  methodOut.setEditNumber800((long)876);
              break;
              	case 2:
                  // MOVE 0877 TO 800-EDIT-NUMBER
                  methodOut.setEditNumber800((long)877);
              break;
              	case 3:
                  // MOVE 0879 TO 800-EDIT-NUMBER
                  methodOut.setEditNumber800((long)879);
              break;
              	case 4:
                  // MOVE 0880 TO 800-EDIT-NUMBER
                  methodOut.setEditNumber800((long)880);
              break;
              default :
                  // MOVE 0890 TO 800-EDIT-NUMBER
                  methodOut.setEditNumber800((long)890);
              }
//  EVALUATE 800-EDIT-NUMBER
              switch((int) methodOut.getEditNumber800()){
              	case 876:
//  DISPLAY '*85* 800-EDIT-NUMBER = ' 800-EDIT-NUMBER
                  logger.info("*85* 800-EDIT-NUMBER = {}", String.valueOf(methodOut.getEditNumber800())); 
              break;
              	case 877:
//  DISPLAY '*86* 800-EDIT-NUMBER = ' 800-EDIT-NUMBER
                  logger.info("*86* 800-EDIT-NUMBER = {}", String.valueOf(methodOut.getEditNumber800())); 
              break;
              	case 879:
              
              	case 880:
//  DISPLAY '*87* 800-EDIT-NUMBER = ' 800-EDIT-NUMBER
                  logger.info("*87* 800-EDIT-NUMBER = {}", String.valueOf(methodOut.getEditNumber800())); 
              break;
              default :
//  DISPLAY '*88* 800-EDIT-NUMBER = ' 800-EDIT-NUMBER
                  logger.info("*88* 800-EDIT-NUMBER = {}", String.valueOf(methodOut.getEditNumber800())); 
              }
          }

// *
//  PERFORM VARYING I FROM 1 BY 1 UNTIL I > 5
          for (methodOut.setI(1); (	( methodOut.getI() <= 5 )) ; methodOut.setI(methodOut.getI() + 1) ) {
//  EVALUATE I
              switch(methodOut.getI()){
              	case 1:
                  // MOVE 1 TO IP33701-TARGET-CUR-EXP
                  //  LITERAL_1 = 1
                  methodOut.setIp33701TargetCurExp(CONSTANTS.LITERAL_1);
              break;
              	case 2:
                  // MOVE 2 TO IP33701-TARGET-CUR-EXP
                  //  LITERAL_2 = 2
                  methodOut.setIp33701TargetCurExp(CONSTANTS.LITERAL_2);
              break;
              	case 3:
                  // MOVE 3 TO IP33701-TARGET-CUR-EXP
                  //  LITERAL_3 = 3
                  methodOut.setIp33701TargetCurExp(CONSTANTS.LITERAL_3);
              break;
              	case 4:
                  // MOVE 4 TO IP33701-TARGET-CUR-EXP
                  //  LITERAL_4 = 4
                  methodOut.setIp33701TargetCurExp(CONSTANTS.LITERAL_4);
              break;
              	case 5:
                  // MOVE 5 TO IP33701-TARGET-CUR-EXP
                  //  LITERAL_5 = 5
                  methodOut.setIp33701TargetCurExp(CONSTANTS.LITERAL_5);
              break;
              	case 6:
                  // MOVE 6 TO IP33701-TARGET-CUR-EXP
                  //  LITERAL_6 = 6
                  methodOut.setIp33701TargetCurExp(CONSTANTS.LITERAL_6);
              break;
              }
//  EVALUATE IP33701-TARGET-CUR-EXP
              switch(new String(methodOut.getIp33701TargetCurExp())){
              	case "1":
//  DISPLAY '*89* IP33701-TARGET-CUR-EXP = ' IP33701-TARGET-CUR-EXP
                  logger.info("*89* IP33701-TARGET-CUR-EXP = {}", new String(methodOut.getIp33701TargetCurExp())); 
              break;
              	case "2":
//  DISPLAY '*90* IP33701-TARGET-CUR-EXP = ' IP33701-TARGET-CUR-EXP
                  logger.info("*90* IP33701-TARGET-CUR-EXP = {}", new String(methodOut.getIp33701TargetCurExp())); 
              break;
              	case "3":
//  DISPLAY '*91* IP33701-TARGET-CUR-EXP = ' IP33701-TARGET-CUR-EXP
                  logger.info("*91* IP33701-TARGET-CUR-EXP = {}", new String(methodOut.getIp33701TargetCurExp())); 
              break;
              	case "4":
//  DISPLAY '*92* IP33701-TARGET-CUR-EXP = ' IP33701-TARGET-CUR-EXP
                  logger.info("*92* IP33701-TARGET-CUR-EXP = {}", new String(methodOut.getIp33701TargetCurExp())); 
              break;
              	case "5":
//  DISPLAY '*93* IP33701-TARGET-CUR-EXP = ' IP33701-TARGET-CUR-EXP
                  logger.info("*93* IP33701-TARGET-CUR-EXP = {}", new String(methodOut.getIp33701TargetCurExp())); 
              break;
              	case "6":
//  DISPLAY '*94* IP33701-TARGET-CUR-EXP = ' IP33701-TARGET-CUR-EXP
                  logger.info("*94* IP33701-TARGET-CUR-EXP = {}", new String(methodOut.getIp33701TargetCurExp())); 
              break;
              }
          }

// *
// *
// * Populate ip00485-user-tag-table
// *
//  MOVE 99 TO IP00485-MEMBER-ENTRIES
          methodOut.setIp00485MemberEntries((long)99);
//  PERFORM VARYING WS-IDX FROM 1 BY 1 UNTIL WS-IDX > 99
          for (methodOut.setIdx(1); (	( methodOut.getIdx() <= 99 )) ; methodOut.setIdx(methodOut.getIdx() + 1) ) {
              // MOVE WS-IDX TO IP00485-MEMBER-ID ( WS-IDX )
              methodOut.setIp00485MemberId(methodOut.getIdx() - 1,(short) methodOut.getIdx());
              methodOut.setIp00485UserTagOccurrence(methodOut.getIdx() - 1,(short) (methodOut.getIdx() * 11));
              methodOut.setIp00485UserTagSubfldNo(methodOut.getIdx() - 1,(short) (methodOut.getIdx() * 12));
              methodOut.setIp00485UserTagStart(methodOut.getIdx() - 1,(short) (methodOut.getIdx() * 13));
              methodOut.setIp00485UserTagLngth(methodOut.getIdx() - 1,(short) (methodOut.getIdx() * 14));
              // MOVE 'A' TO IP00485-USER-TAG-STATUS ( WS-IDX )
              //  LITERAL_A = 'A'
              methodOut.setIp00485UserTagStatus(methodOut.getIdx() - 1,CONSTANTS.LITERAL_A);
          }

// *
//  SEARCH ALL IP00485-MEMBER-ENTRY
          // Binary Search through methodIn.getIp00485MemberEntryInfo().ip00485MemberEntry
          searchLowPoint = 0; //prevLowValue
          searchHighPoint = (int)methodOut.getIp00485MemberEntries(); //prevHighValue
          searchMidPoint = searchHighPoint / 2; //starting at mid point
          searchIndexes = new int[]{searchLowPoint,searchMidPoint,searchHighPoint};
          keepSearching = true;
          while (keepSearching) {
          // compare logic below
             searchCompare = compareAscending(methodOut.getIp00485MemberId(searchMidPoint) , 97);
          // end of compare logic
          	if (searchCompare == 0 ) { // if search found
          	      keepSearching = false;
          	     methodIn.setIp00485MemberIdx(searchMidPoint + 1);
//  DISPLAY '*96* IP00485-MEMBER-ID (IP00485-MEMBER-IDX) =' IP00485-MEMBER-ID ( IP00485-MEMBER-IDX ) ' FOUND'
              logger.info("*96* IP00485-MEMBER-ID (IP00485-MEMBER-IDX) ={} FOUND", String.valueOf(methodOut.getIp00485MemberId(methodIn.getIp00485MemberIdx() - 1))); 
          	} else  {
          		adjustSearchIndex(searchCompare,searchIndexes);
          		searchLowPoint  = searchIndexes[0];
           		searchMidPoint  = searchIndexes[1];
           		searchHighPoint = searchIndexes[2];
           		if (searchMidPoint == -1) { // search exhausted
           		    keepSearching = false; 
//  DISPLAY '*95* IP00485-MEMBER-ID (IP00485-MEMBER-IDX) =' ' 97 NOT FOUND'
              logger.info("*95* IP00485-MEMBER-ID (IP00485-MEMBER-IDX) = 97 NOT FOUND"); 
           		}
          	}
          }

// *
//  SEARCH ALL IP00485-MEMBER-ENTRY
          // Binary Search through methodIn.getIp00485MemberEntryInfo().ip00485MemberEntry
          searchLowPoint = 0; //prevLowValue
          searchHighPoint = (int)methodOut.getIp00485MemberEntries(); //prevHighValue
          searchMidPoint = searchHighPoint / 2; //starting at mid point
          searchIndexes = new int[]{searchLowPoint,searchMidPoint,searchHighPoint};
          keepSearching = true;
          while (keepSearching) {
          // compare logic below
             searchCompare = compareAscending(methodOut.getIp00485MemberId(searchMidPoint) , 999);
          // end of compare logic
          	if (searchCompare == 0 ) { // if search found
          	      keepSearching = false;
          	     methodIn.setIp00485MemberIdx(searchMidPoint + 1);
//  DISPLAY '*98* IP00485-MEMBER-ID (IP00485-MEMBER-IDX) =' IP00485-MEMBER-ID ( IP00485-MEMBER-IDX ) ' FOUND'
              logger.info("*98* IP00485-MEMBER-ID (IP00485-MEMBER-IDX) ={} FOUND", String.valueOf(methodOut.getIp00485MemberId(methodIn.getIp00485MemberIdx() - 1))); 
          	} else  {
          		adjustSearchIndex(searchCompare,searchIndexes);
          		searchLowPoint  = searchIndexes[0];
           		searchMidPoint  = searchIndexes[1];
           		searchHighPoint = searchIndexes[2];
           		if (searchMidPoint == -1) { // search exhausted
           		    keepSearching = false; 
//  DISPLAY '*97* IP00485-MEMBER-ID (IP00485-MEMBER-IDX) =' ' 999 NOT FOUND'
              logger.info("*97* IP00485-MEMBER-ID (IP00485-MEMBER-IDX) = 999 NOT FOUND"); 
           		}
          	}
          }

// *
// *
//  SEARCH ALL IP00485-MEMBER-ENTRY
          // Binary Search through methodIn.getIp00485MemberEntryInfo().ip00485MemberEntry
          searchLowPoint = 0; //prevLowValue
          searchHighPoint = (int)methodOut.getIp00485MemberEntries(); //prevHighValue
          searchMidPoint = searchHighPoint / 2; //starting at mid point
          searchIndexes = new int[]{searchLowPoint,searchMidPoint,searchHighPoint};
          keepSearching = true;
          while (keepSearching) {
          // compare logic below
             searchCompare = compareAscending(methodOut.getIp00485MemberId(searchMidPoint) , 15);
          // end of compare logic
          	if (searchCompare == 0 ) { // if search found
          	      keepSearching = false;
          	     methodIn.setIp00485MemberIdx(searchMidPoint + 1);
//  DISPLAY '*100* IP00485-MEMBER-ID (IP00485-MEMBER-IDX)' ' = ' IP00485-MEMBER-ID ( IP00485-MEMBER-IDX ) ' FOUND'
              logger.info("*100* IP00485-MEMBER-ID (IP00485-MEMBER-IDX) = {} FOUND", String.valueOf(methodOut.getIp00485MemberId(methodIn.getIp00485MemberIdx() - 1))); 
          	} else  {
          		adjustSearchIndex(searchCompare,searchIndexes);
          		searchLowPoint  = searchIndexes[0];
           		searchMidPoint  = searchIndexes[1];
           		searchHighPoint = searchIndexes[2];
           		if (searchMidPoint == -1) { // search exhausted
           		    keepSearching = false; 
//  DISPLAY '*99* IP00485-MEMBER-ID (IP00485-MEMBER-IDX) =' ' 15 NOT FOUND'
              logger.info("*99* IP00485-MEMBER-ID (IP00485-MEMBER-IDX) = 15 NOT FOUND"); 
           		}
          	}
          }

// *
//  IF ( 800-AB EQUAL SPACES OR LOW-VALUES OR HIGH-VALUES ) OR ( 800-BUSSL EQUAL ZEROES OR LOW-VALUES OR HIGH-VALUES ) OR ( 800-BUSSI EQUAL ZEROES OR LOW-VALUES OR HIGH-VALUES )
          if ((        ( allSpaces(methodIn.getAb800())   ) || 			( checkLowValue(methodIn.getAb800()) )  || ( isHighValue(methodIn.getAb800()) ) ) || (	( methodIn.getBussl800() == 0 ) || 			( checkLowValue(methodIn.getBussl800String()) )  || ( isHighValue(methodIn.getBussl800String()) ) ) || (	( methodIn.getBussi800() == 0 ) || 			( checkLowValue(methodIn.getBussi800String()) )  || ( isHighValue(methodIn.getBussi800String()) ) )) { 
//  DISPLAY '*101* SUCCESS'
              logger.info("*101* SUCCESS"); 
          }
//  ELSE
          else { 
//  DISPLAY '*102* FAILURE'
              logger.info("*102* FAILURE"); 
          }

// *

// *
          // MOVE LOW-VALUES TO 800-AB-BUSSL-BUSSI-VALUES
          methodOut.getAbBusslBussiValues800().setString(CONSTANTS.LOW_VALUE_1703015800);
//  IF ( 800-AB EQUAL SPACES OR LOW-VALUES OR HIGH-VALUES ) OR ( 800-BUSSL EQUAL ZEROES OR LOW-VALUES OR HIGH-VALUES ) OR ( 800-BUSSI EQUAL ZEROES OR LOW-VALUES OR HIGH-VALUES )
          if ((        ( allSpaces(methodIn.getAb800())   ) || 			( checkLowValue(methodIn.getAb800()) )  || ( isHighValue(methodIn.getAb800()) ) ) || (	( methodIn.getBussl800() == 0 ) || 			( checkLowValue(methodIn.getBussl800String()) )  || ( isHighValue(methodIn.getBussl800String()) ) ) || (	( methodIn.getBussi800() == 0 ) || 			( checkLowValue(methodIn.getBussi800String()) )  || ( isHighValue(methodIn.getBussi800String()) ) )) { 
//  DISPLAY '*103* SUCCESS'
              logger.info("*103* SUCCESS"); 
          }
//  ELSE
          else { 
//  DISPLAY '*104* FAILURE'
              logger.info("*104* FAILURE"); 
          }

// *

// *
          // MOVE HIGH-VALUES TO 800-AB-BUSSL-BUSSI-VALUES
          methodOut.getAbBusslBussiValues800().setString(CONSTANTS.HIGH_VALUE_1986603300);
//  IF ( 800-AB EQUAL SPACES OR LOW-VALUES OR HIGH-VALUES ) OR ( 800-BUSSL EQUAL ZEROES OR LOW-VALUES OR HIGH-VALUES ) OR ( 800-BUSSI EQUAL ZEROES OR LOW-VALUES OR HIGH-VALUES )
//  ELSE
          if ((        ( !allSpaces(methodIn.getAb800())  ) && !( checkLowValue(methodIn.getAb800()) )  && !( isHighValue(methodIn.getAb800()) ) ) && (	( methodIn.getBussl800() != 0 ) && !( checkLowValue(methodIn.getBussl800String()) )  && !( isHighValue(methodIn.getBussl800String()) ) ) && (	( methodIn.getBussi800() != 0 ) && !( checkLowValue(methodIn.getBussi800String()) )  && !( isHighValue(methodIn.getBussi800String()) ) )) { 
//  DISPLAY '*106* FAILURE'
              logger.info("*106* FAILURE"); 
          }

// *
//  INITIALIZE 800-AB-BUSSL-BUSSI-VALUES
          methodOut.getAbBusslBussiValues800().initialize();
//  IF 800-AB EQUAL SPACES OR 800-BUSSL EQUAL ZEROES OR 800-BUSSI EQUAL ZEROES
//  ELSE
          if (        ( !allSpaces(methodIn.getAb800())  ) && 	( methodIn.getBussl800() != 0 ) && 	( methodIn.getBussi800() != 0 )) { 
//  DISPLAY '*107* FAILURE'
              logger.info("*107* FAILURE"); 
          }

// *
          // MOVE ALL ZEROES TO 500-HOLIDAYS
          methodOut.getHolidays500().setString(CONSTANTS.ZERO_150);
          // MOVE '190011914720360' TO 500-HOLIDAYS (1 : 15)
          //  LITERAL_190011914720360 = '190011914720360'
          methodOut.getHolidays500().replace(CONSTANTS.LITERAL_190011914720360,0,15/* length */,0,15 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  SET 88-100-EXCLUSION-OFF TO TRUE
          methodOut.setExclusionOff88100True(); 
          
          // MOVE '20203600' TO 800-INTERIM-DATE-X
          //  LITERAL_20203600 = '20203600'
          methodOut.setInterimDateX800(CONSTANTS.LITERAL_20203600);
//  SET 500-HOLIDAY-INDEX TO 1
          methodOut.setHolidayIndex500(1); 
          
//  PERFORM 3222-SEARCH-HOLIDAY-EXCLUSION UNTIL 500-HOLIDAY-INDEX GREATER THAN 30 OR 88-100-EXCLUSION-ON
          while (	( methodOut.getHolidayIndex500() <= 30 ) && !(methodOut.isExclusionOn88100()) ) {
             searchHolidayExclusion(programCtx.getSearchHolidayExclusionInCtx());/*3222-SEARCH-HOLIDAY-EXCLUSION*/
             if (programCtx.isProgramEnded()) {
                 return methodOut;
             }
          }
//  IF 88-100-EXCLUSION-ON
          if ( methodOut.isExclusionOn88100()  ) { 
//  DISPLAY '*111* SUCCESS'
              logger.info("*111* SUCCESS"); 
          }
//  ELSE
          else { 
//  DISPLAY '*112* FAILURE'
              logger.info("*112* FAILURE"); 
          }

// *
// * Mc110
// *
          // MOVE SPACES TO 801-PREV-TRANS-TYPE 701-TRANS-TYPE
          methodOut.setPrevTransType801(CONSTANTS.SPACE_4);
          methodOut.setTransType701(CONSTANTS.SPACE_80);
          // MOVE '0000' TO 801-PREV-MCC-CODE
          methodOut.setPrevMccCode801(CONSTANTS.LITERAL_0000_B4_);

// *
//  STRING 'OTHERS' DELIMITED BY SPACE, ' ' DELIMITED BY SIZE, 'TRANSACTION-TYPE:-' DELIMITED BY SPACE, 801-PREV-TRANS-TYPE DELIMITED BY SPACE, ' ' DELIMITED BY SIZE, 'MCC-CODE:-' DELIMITED BY SPACE, 801-PREV-MCC-CODE DELIMITED BY SPACE, INTO 701-TRANS-TYPE
          charArray = new ArrayList<char[]>();
             charArray.add(splitFirst( CONSTANTS.LITERAL_OTHERS , CONSTANTS.SPACE ) );
             charArray.add(CONSTANTS.SPACE);
             charArray.add(splitFirst( CONSTANTS.LITERAL_TRANSACTION_MN2_TYPE_CL_ , CONSTANTS.SPACE ) );
             charArray.add(splitFirst( methodOut.getPrevTransType801() , CONSTANTS.SPACE ) );
             charArray.add(CONSTANTS.SPACE);
             charArray.add(splitFirst( CONSTANTS.LITERAL_MCC_MN2_CODE_CL_ , CONSTANTS.SPACE ) );
             charArray.add(splitFirst( methodOut.getPrevMccCode801() , CONSTANTS.SPACE ) );
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3),charArray.get(4),charArray.get(5),charArray.get(6));
          updated = updateString(methodOut.getTransType701() ,joinCharArray);
          methodOut.setTransType701(  (char[])updated.get("string"));

// *
//  DISPLAY '*113* 701-TRANS-TYPE = (' 701-TRANS-TYPE ')'
          logger.info("*113* 701-TRANS-TYPE = ({})", new String(methodOut.getTransType701())); 
          // MOVE SPACES TO 701-TRANS-TYPE
          methodOut.setTransType701(CONSTANTS.SPACE_80);
          // MOVE '*' TO 801-PREV-TRANS-TYPE
          methodOut.setPrevTransType801(CONSTANTS.LITERAL_STR_B3_);

// *
// *
//  STRING 'OTHERS' DELIMITED BY SPACE, ' ' DELIMITED BY SIZE, 'TRANSACTION-TYPE:-' DELIMITED BY SPACE, 801-PREV-TRANS-TYPE DELIMITED BY SPACE, ' ' DELIMITED BY SIZE, 'MCC-CODE:-' DELIMITED BY SPACE, 801-PREV-MCC-CODE DELIMITED BY SPACE, INTO 701-TRANS-TYPE
          charArray = new ArrayList<char[]>();
             charArray.add(splitFirst( CONSTANTS.LITERAL_OTHERS , CONSTANTS.SPACE ) );
             charArray.add(CONSTANTS.SPACE);
             charArray.add(splitFirst( CONSTANTS.LITERAL_TRANSACTION_MN2_TYPE_CL_ , CONSTANTS.SPACE ) );
             charArray.add(splitFirst( methodOut.getPrevTransType801() , CONSTANTS.SPACE ) );
             charArray.add(CONSTANTS.SPACE);
             charArray.add(splitFirst( CONSTANTS.LITERAL_MCC_MN2_CODE_CL_ , CONSTANTS.SPACE ) );
             charArray.add(splitFirst( methodOut.getPrevMccCode801() , CONSTANTS.SPACE ) );
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3),charArray.get(4),charArray.get(5),charArray.get(6));
          updated = updateString(methodOut.getTransType701() ,joinCharArray);
          methodOut.setTransType701(  (char[])updated.get("string"));
      
      return methodOut;
      }
      /**
      * mainSplit3 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAIN-SPLIT3 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - transType701                   COBOL Name: 701-TRANS-TYPE
      * - prevMccCode801                 COBOL Name: 801-PREV-MCC-CODE
      * - exclusionFlag100               COBOL Name: 100-EXCLUSION-FLAG
      * - a                              COBOL Name: WS-A
      * - c                              COBOL Name: WS-C
      *
      * Output :  

      * - transType701                   COBOL Name: 701-TRANS-TYPE
      * - prevTransType801               COBOL Name: 801-PREV-TRANS-TYPE
      * - valueOfPds158s3800             COBOL Name: 800-VALUE-OF-PDS158S3
      * - valueOfPds158s2800             COBOL Name: 800-VALUE-OF-PDS158S2
      * - var                            COBOL Name: WS-VAR
      * - aVar1                          COBOL Name: WS-A-VAR1
      * - aVar2                          COBOL Name: WS-A-VAR2
      * - aVar4                          COBOL Name: WS-A-VAR4
      * - aLen                           COBOL Name: WS-A-LEN
      * - bLen                           COBOL Name: WS-B-LEN
      * - b                              COBOL Name: WS-B
      * - a                              COBOL Name: WS-A
      * - cVar1                          COBOL Name: WS-C-VAR1
      * - cVar2                          COBOL Name: WS-C-VAR2
      * - cVar4                          COBOL Name: WS-C-VAR4
      * - cLen                           COBOL Name: WS-C-LEN
      * - dLen                           COBOL Name: WS-D-LEN
      * - d                              COBOL Name: WS-D
      * - c                              COBOL Name: WS-C
      * - ecbRateDiff800                 COBOL Name: 800-ECB-RATE-DIFF
      * - cf50005ClearingGrp             COBOL Name: CF50005-CLEARING-GRP
      * - clearingDtTm9800               COBOL Name: 800-CLEARING-DT-TM-9
      *
      * @throws CFException
      */
      @Override
      public MainSplit3OutCtx mainSplit3(MainSplit3InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			 final int B_LENGTH = 50;
			 final int D_LENGTH = 40;
			// End of variable declaration

McissuesCtx programCtx = methodIn.getMcissuesCtx();
MainSplit3OutCtx methodOut = methodIn.getMainSplit3OutCtx();

// *
//  DISPLAY '*114* 701-TRANS-TYPE = (' 701-TRANS-TYPE ')'
          logger.info("*114* 701-TRANS-TYPE = ({})", new String(methodOut.getTransType701())); 
          // MOVE SPACES TO 701-TRANS-TYPE
          methodOut.setTransType701(CONSTANTS.SPACE_80);
          // MOVE ALL '*' TO 801-PREV-TRANS-TYPE
          methodOut.setPrevTransType801(CONSTANTS.LITERAL_STR4_);

// *
// *
//  STRING 'OTHERS' DELIMITED BY SPACE, ' ' DELIMITED BY SIZE, 'TRANSACTION-TYPE:-' DELIMITED BY SPACE, 801-PREV-TRANS-TYPE DELIMITED BY '*' , ' ' DELIMITED BY SIZE, 'MCC-CODE:-' DELIMITED BY SPACE, 801-PREV-MCC-CODE DELIMITED BY SPACE, INTO 701-TRANS-TYPE
          charArray = new ArrayList<char[]>();
             charArray.add(splitFirst( CONSTANTS.LITERAL_OTHERS , CONSTANTS.SPACE ) );
             charArray.add(CONSTANTS.SPACE);
             charArray.add(splitFirst( CONSTANTS.LITERAL_TRANSACTION_MN2_TYPE_CL_ , CONSTANTS.SPACE ) );
             charArray.add(splitFirst( methodOut.getPrevTransType801() , CONSTANTS.LITERAL_STR_ ) );
             charArray.add(CONSTANTS.SPACE);
             charArray.add(splitFirst( CONSTANTS.LITERAL_MCC_MN2_CODE_CL_ , CONSTANTS.SPACE ) );
             charArray.add(splitFirst( methodIn.getPrevMccCode801() , CONSTANTS.SPACE ) );
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3),charArray.get(4),charArray.get(5),charArray.get(6));
          updated = updateString(methodOut.getTransType701() ,joinCharArray);
          methodOut.setTransType701(  (char[])updated.get("string"));

// *
//  DISPLAY '*115* 701-TRANS-TYPE = (' 701-TRANS-TYPE ')'
          logger.info("*115* 701-TRANS-TYPE = ({})", new String(methodOut.getTransType701())); 
          // MOVE SPACES TO 701-TRANS-TYPE
          methodOut.setTransType701(CONSTANTS.SPACE_80);
          // MOVE ALL '*#' TO 801-PREV-TRANS-TYPE
          methodOut.setPrevTransType801(CONSTANTS.LITERAL_STR2_HS2_);

// *
// *
//  STRING 'OTHERS' DELIMITED BY SPACE, ' ' DELIMITED BY SIZE, 'TRANSACTION-TYPE:-' DELIMITED BY SPACE, 801-PREV-TRANS-TYPE DELIMITED BY '*#' , ' ' DELIMITED BY SIZE, 'MCC-CODE:-' DELIMITED BY SPACE, 801-PREV-MCC-CODE DELIMITED BY SPACE, INTO 701-TRANS-TYPE
          charArray = new ArrayList<char[]>();
             charArray.add(splitFirst( CONSTANTS.LITERAL_OTHERS , CONSTANTS.SPACE ) );
             charArray.add(CONSTANTS.SPACE);
             charArray.add(splitFirst( CONSTANTS.LITERAL_TRANSACTION_MN2_TYPE_CL_ , CONSTANTS.SPACE ) );
             charArray.add(splitFirst( methodOut.getPrevTransType801() , CONSTANTS.LITERAL_STR_HS_ ) );
             charArray.add(CONSTANTS.SPACE);
             charArray.add(splitFirst( CONSTANTS.LITERAL_MCC_MN2_CODE_CL_ , CONSTANTS.SPACE ) );
             charArray.add(splitFirst( methodIn.getPrevMccCode801() , CONSTANTS.SPACE ) );
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3),charArray.get(4),charArray.get(5),charArray.get(6));
          updated = updateString(methodOut.getTransType701() ,joinCharArray);
          methodOut.setTransType701(  (char[])updated.get("string"));

// *

// *
// *-------------------------------
// *
//  DISPLAY '*116* 701-TRANS-TYPE = (' 701-TRANS-TYPE ')'
          logger.info("*116* 701-TRANS-TYPE = ({})", new String(methodOut.getTransType701())); 
          // MOVE '010101' TO 800-VALUE-OF-PDS158S3
          //  LITERAL_010101 = '010101'
          methodOut.setValueOfPds158s3800(CONSTANTS.LITERAL_010101);
          // MOVE '1' TO 800-VALUE-OF-PDS158S2
          //  LITERAL_1 = '1'
          methodOut.setValueOfPds158s2800(CONSTANTS.LITERAL_1);

// *
//  IF 88-100-EXCLUSION-ON AND 800-VALUE-OF-PDS158S3 GREATER THAN SPACES
//  ELSE
          if (!(methodIn.isExclusionOn88100())  ||                    ( isLessOrEqualSpaces(methodOut.getValueOfPds158s3800()) )) { 
//  DISPLAY '*117* FAILURE'
              logger.info("*117* FAILURE"); 
          }
//  IF 88-100-EXCLUSION-ON AND 800-VALUE-OF-PDS158S2 GREATER THAN SPACES
          if ( methodIn.isExclusionOn88100()   &&              ( isGreaterThanSpaces(methodOut.getValueOfPds158s2800()) )) { 
//  DISPLAY '*118* SUCCESS'
              logger.info("*118* SUCCESS"); 
          }

// *
//  IF 88-100-EXCLUSION-ON AND 800-VALUE-OF-PDS158S3 GREATER THAN OR EQUAL SPACES
//  ELSE
          if (!(methodIn.isExclusionOn88100())  ||                   ( isLessThanSpaces(methodOut.getValueOfPds158s3800()) )) { 
//  DISPLAY '*119* FAILURE'
              logger.info("*119* FAILURE"); 
          }
//  IF 88-100-EXCLUSION-ON AND 800-VALUE-OF-PDS158S2 GREATER THAN OR EQUAL SPACES
          if ( methodIn.isExclusionOn88100()   &&               ( isGreaterOrEqualSpaces(methodOut.getValueOfPds158s2800())  )) { 
//  DISPLAY '*120* SUCCESS'
              logger.info("*120* SUCCESS"); 
          }

// *
//  IF 88-100-EXCLUSION-ON AND 800-VALUE-OF-PDS158S3 LESS THAN SPACES
//  ELSE
          if (!(methodIn.isExclusionOn88100())  ||               ( isGreaterOrEqualSpaces(methodOut.getValueOfPds158s3800())  )) { 
//  DISPLAY '*121* SUCCESS'
              logger.info("*121* SUCCESS"); 
          }
//  IF 88-100-EXCLUSION-ON AND 800-VALUE-OF-PDS158S2 LESS THAN SPACES
          if ( methodIn.isExclusionOn88100()   &&                   ( isLessThanSpaces(methodOut.getValueOfPds158s2800()) )) { 
//  DISPLAY '*122* FAILURE'
              logger.info("*122* FAILURE"); 
          }

// *
//  IF 88-100-EXCLUSION-ON AND 800-VALUE-OF-PDS158S3 <= SPACES
//  ELSE
          if (!(methodIn.isExclusionOn88100())  ||              ( isGreaterThanSpaces(methodOut.getValueOfPds158s3800()) )) { 
//  DISPLAY '*123* SUCCESS'
              logger.info("*123* SUCCESS"); 
          }
//  IF 88-100-EXCLUSION-ON AND 800-VALUE-OF-PDS158S2 <= SPACES
          if ( methodIn.isExclusionOn88100()   &&                    ( isLessOrEqualSpaces(methodOut.getValueOfPds158s2800()) )) { 
//  DISPLAY '*124* FAILURE'
              logger.info("*124* FAILURE"); 
          }

// *
// *-------------------------------
// *
          // MOVE SPACES TO 800-VALUE-OF-PDS158S3 800-VALUE-OF-PDS158S2
          methodOut.setValueOfPds158s3800(CONSTANTS.SPACE_6);
          methodOut.setValueOfPds158s2800(CONSTANTS.SPACE);

// *
//  IF 88-100-EXCLUSION-ON AND 800-VALUE-OF-PDS158S3 GREATER THAN SPACES
//  ELSE
          if (!(methodIn.isExclusionOn88100())  ||                    ( isLessOrEqualSpaces(methodOut.getValueOfPds158s3800()) )) { 
//  DISPLAY '*125* SUCCESS'
              logger.info("*125* SUCCESS"); 
          }
//  IF 88-100-EXCLUSION-ON AND 800-VALUE-OF-PDS158S2 GREATER THAN SPACES
          if ( methodIn.isExclusionOn88100()   &&              ( isGreaterThanSpaces(methodOut.getValueOfPds158s2800()) )) { 
//  DISPLAY '*126* FAILURE'
              logger.info("*126* FAILURE"); 
          }

// *
//  IF 88-100-EXCLUSION-ON AND 800-VALUE-OF-PDS158S3 GREATER THAN OR EQUAL SPACES
//  ELSE
          if (!(methodIn.isExclusionOn88100())  ||                   ( isLessThanSpaces(methodOut.getValueOfPds158s3800()) )) { 
//  DISPLAY '*127* FAILURE'
              logger.info("*127* FAILURE"); 
          }
//  IF 88-100-EXCLUSION-ON AND 800-VALUE-OF-PDS158S2 GREATER THAN OR EQUAL SPACES
          if ( methodIn.isExclusionOn88100()   &&               ( isGreaterOrEqualSpaces(methodOut.getValueOfPds158s2800())  )) { 
//  DISPLAY '*128* SUCCESS'
              logger.info("*128* SUCCESS"); 
          }

// *
//  IF 88-100-EXCLUSION-ON AND 800-VALUE-OF-PDS158S3 LESS THAN SPACES
//  ELSE
          if (!(methodIn.isExclusionOn88100())  ||               ( isGreaterOrEqualSpaces(methodOut.getValueOfPds158s3800())  )) { 
//  DISPLAY '*129* SUCCESS'
              logger.info("*129* SUCCESS"); 
          }
//  IF 88-100-EXCLUSION-ON AND 800-VALUE-OF-PDS158S2 LESS THAN SPACES
          if ( methodIn.isExclusionOn88100()   &&                   ( isLessThanSpaces(methodOut.getValueOfPds158s2800()) )) { 
//  DISPLAY '*130* FAILURE'
              logger.info("*130* FAILURE"); 
          }

// *
//  IF 88-100-EXCLUSION-ON AND 800-VALUE-OF-PDS158S3 LESS THAN OR EQUAL SPACES
//  ELSE
          if (!(methodIn.isExclusionOn88100())  ||              ( isGreaterThanSpaces(methodOut.getValueOfPds158s3800()) )) { 
//  DISPLAY '*131* FAILURE'
              logger.info("*131* FAILURE"); 
          }
//  IF 88-100-EXCLUSION-ON AND 800-VALUE-OF-PDS158S2 <= SPACES
          if ( methodIn.isExclusionOn88100()   &&                    ( isLessOrEqualSpaces(methodOut.getValueOfPds158s2800()) )) { 
//  DISPLAY '*132* SUCCESS'
              logger.info("*132* SUCCESS"); 
          }

// *
// *-------------------------------
// *
          // MOVE LOW-VALUES TO 800-VALUE-OF-PDS158S3 800-VALUE-OF-PDS158S2
          methodOut.setValueOfPds158s3800(CONSTANTS.LOW_VALUE_1703015769);
          methodOut.setValueOfPds158s2800(CONSTANTS.LOW_VALUE_1703015924);

// *
//  IF 88-100-EXCLUSION-ON AND 800-VALUE-OF-PDS158S3 GREATER THAN SPACES
//  ELSE
          if (!(methodIn.isExclusionOn88100())  ||                    ( isLessOrEqualSpaces(methodOut.getValueOfPds158s3800()) )) { 
//  DISPLAY '*133* SUCCESS'
              logger.info("*133* SUCCESS"); 
          }
//  IF 88-100-EXCLUSION-ON AND 800-VALUE-OF-PDS158S2 GREATER THAN SPACES
          if ( methodIn.isExclusionOn88100()   &&              ( isGreaterThanSpaces(methodOut.getValueOfPds158s2800()) )) { 
//  DISPLAY '*134* FAILURE'
              logger.info("*134* FAILURE"); 
          }

// *
//  IF 88-100-EXCLUSION-ON AND 800-VALUE-OF-PDS158S3 GREATER THAN OR EQUAL SPACES
//  ELSE
          if (!(methodIn.isExclusionOn88100())  ||                   ( isLessThanSpaces(methodOut.getValueOfPds158s3800()) )) { 
//  DISPLAY '*135* SUCCESS'
              logger.info("*135* SUCCESS"); 
          }
//  IF 88-100-EXCLUSION-ON AND 800-VALUE-OF-PDS158S2 GREATER THAN OR EQUAL SPACES
          if ( methodIn.isExclusionOn88100()   &&               ( isGreaterOrEqualSpaces(methodOut.getValueOfPds158s2800())  )) { 
//  DISPLAY '*136* FAILURE'
              logger.info("*136* FAILURE"); 
          }

// *
//  IF 88-100-EXCLUSION-ON AND 800-VALUE-OF-PDS158S3 LESS THAN SPACES
//  ELSE
          if (!(methodIn.isExclusionOn88100())  ||               ( isGreaterOrEqualSpaces(methodOut.getValueOfPds158s3800())  )) { 
//  DISPLAY '*137* FAILURE'
              logger.info("*137* FAILURE"); 
          }
//  IF 88-100-EXCLUSION-ON AND 800-VALUE-OF-PDS158S2 LESS THAN SPACES
          if ( methodIn.isExclusionOn88100()   &&                   ( isLessThanSpaces(methodOut.getValueOfPds158s2800()) )) { 
//  DISPLAY '*138* SUCCESS'
              logger.info("*138* SUCCESS"); 
          }

// *
//  IF 88-100-EXCLUSION-ON AND 800-VALUE-OF-PDS158S3 <= SPACES
//  ELSE
          if (!(methodIn.isExclusionOn88100())  ||              ( isGreaterThanSpaces(methodOut.getValueOfPds158s3800()) )) { 
//  DISPLAY '*139* FAILURE'
              logger.info("*139* FAILURE"); 
          }
//  IF 88-100-EXCLUSION-ON AND 800-VALUE-OF-PDS158S2 <= SPACES
          if ( methodIn.isExclusionOn88100()   &&                    ( isLessOrEqualSpaces(methodOut.getValueOfPds158s2800()) )) { 
//  DISPLAY '*140* SUCCESS'
              logger.info("*140* SUCCESS"); 
          }

// *
          // MOVE HIGH-VALUES TO WS-VAR
          methodOut.setVar(CONSTANTS.HIGH_VALUE_1986603238);
//  IF WS-VAR = HIGH-VALUES OR SPACES
          if (( isHighValue(methodOut.getVar()) )  ||         ( allSpaces(methodOut.getVar())   )) { 
              // MOVE 'N/A' TO WS-VAR
              //  LITERAL_N_SL_A = 'N/A'
              methodOut.setVar(CONSTANTS.LITERAL_N_SL_A);
//  DISPLAY '*141* SUCCESS'
              logger.info("*141* SUCCESS"); 
          }
//  ELSE
          else { 
//  DISPLAY '*142* FAILURE'
              logger.info("*142* FAILURE"); 
          }

// *
//  IF WS-VAR = HIGH-VALUES OR SPACES
          if (( isHighValue(methodOut.getVar()) )  ||         ( allSpaces(methodOut.getVar())   )) { 
//  DISPLAY '*143* FAILURE'
              logger.info("*143* FAILURE"); 
          }
//  ELSE
          else { 
//  DISPLAY '*144* SUCCESS  ' WS-VAR
              logger.info("*144* SUCCESS  {}", new String(methodOut.getVar())); 
          }

// *
//  MOVE ALL 'A' TO WS-A-VAR1
          methodOut.setAVar1(CONSTANTS.LITERAL_AAAAA);
//  MOVE ALL 'B' TO WS-A-VAR2
          methodOut.setAVar2(CONSTANTS.LITERAL_BBBBBBBBBB);
//  MOVE ALL 'C' TO WS-A-VAR4
          methodOut.setAVar4(CONSTANTS.LITERAL_CCCCCCCCCCCCCCCCCCCCCCCCC);
//  MOVE LENGTH OF WS-A TO WS-A-LEN
          methodOut.setALen((short) A.getAFieldLength());
//  MOVE LENGTH OF WS-B TO WS-B-LEN
          methodOut.setBLen((short) B_LENGTH);

// *
          // MOVE ALL 'Z' TO WS-B
          methodOut.setB(CONSTANTS.LITERAL_1605480576);
          // MOVE WS-A (1 : WS-A-LEN ) TO WS-B (1 : WS-A-LEN )
          methodOut.setB(replace(methodOut.getB(),substring(methodOut.getA().getCharArray(),0,methodOut.getALen()),0,methodOut.getALen()));
//  DISPLAY '*145* WS-A   = ' WS-A
          logger.info("*145* WS-A   = {}", methodOut.getA().toString()); 
//  DISPLAY '*146* WS-B   = ' WS-B
          logger.info("*146* WS-B   = {}", new String(methodOut.getB())); 

// *
//  MOVE ALL 'A' TO WS-C-VAR1
          methodOut.setCVar1(CONSTANTS.LITERAL_AAAAA);
//  MOVE ALL 'B' TO WS-C-VAR2
          methodOut.setCVar2(CONSTANTS.LITERAL_BBBBBBBBBB);
//  MOVE ALL 'C' TO WS-C-VAR4
          methodOut.setCVar4(CONSTANTS.LITERAL_1211094465);
//  MOVE LENGTH OF WS-C TO WS-C-LEN
          methodOut.setCLen((short) C.getCFieldLength());
//  MOVE LENGTH OF WS-D TO WS-D-LEN
          methodOut.setDLen((short) D_LENGTH);

// *
          // MOVE ALL 'Z' TO WS-D
          methodOut.setD(CONSTANTS.LITERAL_295742784);
          // MOVE WS-C (1 : WS-D-LEN ) TO WS-D (1 : WS-D-LEN )
          methodOut.setD(replace(methodOut.getD(),substring(methodOut.getC().getCharArray(),0,methodOut.getDLen()),0,methodOut.getDLen()));
//  DISPLAY '*147* WS-C   = ' WS-C
          logger.info("*147* WS-C   = {}", methodOut.getC().toString()); 
//  DISPLAY '*148* WS-D   = ' WS-D
          logger.info("*148* WS-D   = {}", new String(methodOut.getD())); 

// *
// *
          // MOVE 10 TO 800-ECB-RATE-DIFF
          methodOut.setEcbRateDiff800(BigDecimal.TEN.setScale(6));
//  EVALUATE TRUE
          if  (        ( methodOut.getEcbRateDiff800().compareTo(BigDecimal.ZERO) < 0 )) { 
//  DISPLAY '*149 * 800-ECB-RATE-DIFF  ** - VE     **'
              logger.info("*149 * 800-ECB-RATE-DIFF  ** - VE     **"); 
          }
          else if  (        ( methodOut.getEcbRateDiff800().compareTo(BigDecimal.ZERO) > 0 ) ||         ( methodOut.getEcbRateDiff800().compareTo(BigDecimal.ZERO) == 0 )) { 
//  DISPLAY '*150 * 800-ECB-RATE-DIFF  ** + VE / 0 **'
              logger.info("*150 * 800-ECB-RATE-DIFF  ** + VE / 0 **"); 
          }

// *
//  IF 800-ECB-RATE-DIFF IS NEGATIVE
          if (        ( methodOut.getEcbRateDiff800().compareTo(BigDecimal.ZERO) < 0 )) { 
//  DISPLAY '*151 * 800-ECB-RATE-DIFF  ** - VE     **'
              logger.info("*151 * 800-ECB-RATE-DIFF  ** - VE     **"); 
          }
//  ELSE
          else { 
//  IF 800-ECB-RATE-DIFF IS POSITIVE OR 800-ECB-RATE-DIFF IS ZERO
              if (        ( methodOut.getEcbRateDiff800().compareTo(BigDecimal.ZERO) > 0 ) ||         ( methodOut.getEcbRateDiff800().compareTo(BigDecimal.ZERO) == 0 )) { 
//  DISPLAY '*152 * 800-ECB-RATE-DIFF  ** + VE / 0 **'
                  logger.info("*152 * 800-ECB-RATE-DIFF  ** + VE / 0 **"); 
              }
          }
//  MOVE -10.23 TO 800-ECB-RATE-DIFF
          methodOut.setEcbRateDiff800(BigDecimal.valueOf(-10.23).setScale(6));
//  EVALUATE TRUE
          if  (        ( methodOut.getEcbRateDiff800().compareTo(BigDecimal.ZERO) < 0 )) { 
//  DISPLAY '*153 * 800-ECB-RATE-DIFF  ** - VE     **'
              logger.info("*153 * 800-ECB-RATE-DIFF  ** - VE     **"); 
          }
          else if  (        ( methodOut.getEcbRateDiff800().compareTo(BigDecimal.ZERO) > 0 ) ||         ( methodOut.getEcbRateDiff800().compareTo(BigDecimal.ZERO) == 0 )) { 
//  DISPLAY '*154 * 800-ECB-RATE-DIFF  ** + VE / 0 **'
              logger.info("*154 * 800-ECB-RATE-DIFF  ** + VE / 0 **"); 
          }

// *
//  IF 800-ECB-RATE-DIFF IS NEGATIVE
          if (        ( methodOut.getEcbRateDiff800().compareTo(BigDecimal.ZERO) < 0 )) { 
//  DISPLAY '*155 * 800-ECB-RATE-DIFF  ** - VE     **'
              logger.info("*155 * 800-ECB-RATE-DIFF  ** - VE     **"); 
          }
//  ELSE
          else { 
//  IF 800-ECB-RATE-DIFF IS POSITIVE OR 800-ECB-RATE-DIFF IS ZERO
              if (        ( methodOut.getEcbRateDiff800().compareTo(BigDecimal.ZERO) > 0 ) ||         ( methodOut.getEcbRateDiff800().compareTo(BigDecimal.ZERO) == 0 )) { 
//  DISPLAY '*156 * 800-ECB-RATE-DIFF  ** + VE / 0 **'
                  logger.info("*156 * 800-ECB-RATE-DIFF  ** + VE / 0 **"); 
              }
          }

// *
//  INITIALIZE CF50005-CLEARING-GRP
          methodOut.getCf50005ClearingGrp().initialize();
          // MOVE '2021050410' TO CF50005-CLEARING-GRP
          //  LITERAL_2021050410 = '2021050410'
          methodOut.getCf50005ClearingGrp().setString(CONSTANTS.LITERAL_2021050410);
          // MOVE CF50005-CLEARING-GRP TO 800-CLEARING-DT-TM-9
          methodOut.getWork().replace(padSpaces(12,methodOut.getCf50005ClearingGrp().toCharArray()), /* beginIndex */267, /* length */12);
      
      return methodOut;
      }
      /**
      * mainSplit4 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAIN-SPLIT4 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - cf50005ClearingGrp             COBOL Name: CF50005-CLEARING-GRP
      * - clearingDtTm9800               COBOL Name: 800-CLEARING-DT-TM-9
      * - preEditVersion300              COBOL Name: 300-PRE-EDIT-VERSION
      * - peVerYy300                     COBOL Name: 300-PE-VER-YY
      * - peRelease300                   COBOL Name: 300-PE-RELEASE
      * - peVerSequence300               COBOL Name: 300-PE-VER-SEQUENCE
      * - peVersionNumMsg600             COBOL Name: 600-PE-VERSION-NUM-MSG
      * - inxA                           COBOL Name: INX-A
      * - inxBBin                        COBOL Name: INX-B-BIN
      *
      * Output :  

      * - clearingDtTm9X700              COBOL Name: 700-CLEARING-DT-TM-9-X
      * - clearingDtTm9700               COBOL Name: 700-CLEARING-DT-TM-9
      * - cf50005ClearingGrp             COBOL Name: CF50005-CLEARING-GRP
      * - clearingDtTm9Short800          COBOL Name: 800-CLEARING-DT-TM-9-SHORT
      * - cf50005ClearingDtX             COBOL Name: CF50005-CLEARING-DT-X
      * - clearingDtTm9800               COBOL Name: 800-CLEARING-DT-TM-9
      * - cf50005ClearingDtN             COBOL Name: CF50005-CLEARING-DT-N
      * - i                              COBOL Name: I
      * - clearingDtTm9Short900          COBOL Name: 900-CLEARING-DT-TM-9-SHORT
      * - clearingDtTm9900               COBOL Name: 900-CLEARING-DT-TM-9
      * - peVersionNum600                COBOL Name: 600-PE-VERSION-NUM
      * - preEditVersion300              COBOL Name: 300-PRE-EDIT-VERSION
      * - ip31021SummaryControlCard      COBOL Name: IP31021-SUMMARY-CONTROL-CARD
      * - ip31021InputSource             COBOL Name: IP31021-INPUT-SOURCE
      * - ip31021SummarySif              COBOL Name: IP31021-SUMMARY-SIF
      * - ip31021SummaryCycle            COBOL Name: IP31021-SUMMARY-CYCLE
      * - inputVars800                   COBOL Name: 800-INPUT-VARS
      * - inputTableId800                COBOL Name: 800-INPUT-TABLE-ID
      * - inputSegId800                  COBOL Name: 800-INPUT-SEG-ID
      * - ip500041Rec                    COBOL Name: IP500041-REC
      * - ip500041TableId                COBOL Name: IP500041-TABLE-ID
      * - cf20004TableData               COBOL Name: CF20004-TABLE-DATA
      * - cf20004Items                   COBOL Name: CF20004-ITEMS
      * - cf20004TableEnts               COBOL Name: CF20004-TABLE-ENTS
      * - sortKeyLthTable700             COBOL Name: 700-SORT-KEY-LTH-TABLE
      * - tableId700                     COBOL Name: 700-TABLE-ID
      * - inxA                           COBOL Name: INX-A
      * - tableItem                      COBOL Name: TABLE-ITEM
      * - inxB                           COBOL Name: INX-B
      *
      * @throws CFException
      */
      @Override
      public MainSplit4OutCtx mainSplit4(MainSplit4InCtx methodIn) throws Exception {
McissuesCtx programCtx = methodIn.getMcissuesCtx();
MainSplit4OutCtx methodOut = methodIn.getMainSplit4OutCtx();
//  IF CF50005-CLEARING-GRP = 800-CLEARING-DT-TM-9
          if (compareChars(methodOut.getCf50005ClearingGrp(),String.valueOf(methodOut.getClearingDtTm9800String()).toCharArray()) == 0) { 
//  DISPLAY '*157 CF50005-CLEARING-GRP (' CF50005-CLEARING-GRP ') EQUALS' '  800-CLEARING-DT-TM-9  (' 800-CLEARING-DT-TM-9 ')'
              logger.info("*157 CF50005-CLEARING-GRP ({}) EQUALS  800-CLEARING-DT-TM-9  ({})", methodOut.getCf50005ClearingGrp().toString(), String.valueOf(methodOut.getClearingDtTm9800())); 
          }
//  ELSE
          else { 
//  DISPLAY '*158 CF50005-CLEARING-GRP (' CF50005-CLEARING-GRP ') NOT EQUALS' '  800-CLEARING-DT-TM-9 (' 800-CLEARING-DT-TM-9 ')'
              logger.info("*158 CF50005-CLEARING-GRP ({}) NOT EQUALS  800-CLEARING-DT-TM-9 ({})", methodOut.getCf50005ClearingGrp().toString(), String.valueOf(methodOut.getClearingDtTm9800())); 
          }
          // MOVE SPACES TO 700-CLEARING-DT-TM-9-X
          methodOut.setClearingDtTm9X700(CONSTANTS.SPACE_12);
          // MOVE CF50005-CLEARING-GRP TO 700-CLEARING-DT-TM-9
          methodOut.getWork().replace(padSpaces(12,methodOut.getCf50005ClearingGrp().toCharArray()), /* beginIndex */279, /* length */12);
//  IF CF50005-CLEARING-GRP = 700-CLEARING-DT-TM-9
          if (compareChars(methodOut.getCf50005ClearingGrp(),String.valueOf(methodOut.getClearingDtTm9700String()).toCharArray()) == 0) { 
//  DISPLAY '*189 CF50005-CLEARING-GRP (' CF50005-CLEARING-GRP ') EQUALS' '  700-CLEARING-DT-TM-9  (' 700-CLEARING-DT-TM-9 ')'
              logger.info("*189 CF50005-CLEARING-GRP ({}) EQUALS  700-CLEARING-DT-TM-9  ({})", methodOut.getCf50005ClearingGrp().toString(), String.valueOf(methodOut.getClearingDtTm9700())); 
          }
//  ELSE
          else { 
//  DISPLAY '*190 CF50005-CLEARING-GRP (' CF50005-CLEARING-GRP ') NOT EQUALS' '  700-CLEARING-DT-TM-9 (' 700-CLEARING-DT-TM-9 ')'
              logger.info("*190 CF50005-CLEARING-GRP ({}) NOT EQUALS  700-CLEARING-DT-TM-9 ({})", methodOut.getCf50005ClearingGrp().toString(), String.valueOf(methodOut.getClearingDtTm9700())); 
          }
          // MOVE CF50005-CLEARING-GRP TO 800-CLEARING-DT-TM-9-SHORT
          methodOut.getWork().replace(padSpaces(8,methodOut.getCf50005ClearingGrp().toCharArray()), /* beginIndex */291, /* length */8);
//  IF CF50005-CLEARING-GRP = 800-CLEARING-DT-TM-9-SHORT
          if (compareChars(methodOut.getCf50005ClearingGrp(),String.valueOf(methodOut.getClearingDtTm9Short800String()).toCharArray()) == 0) { 
//  DISPLAY '*159 CF50005-CLEARING-GRP (' CF50005-CLEARING-GRP ') EQUALS' '  800-CLEARING-DT-TM-9-SHORT (' 800-CLEARING-DT-TM-9-SHORT ')'
              logger.info("*159 CF50005-CLEARING-GRP ({}) EQUALS  800-CLEARING-DT-TM-9-SHORT ({})", methodOut.getCf50005ClearingGrp().toString(), String.valueOf(methodOut.getClearingDtTm9Short800())); 
          }
//  ELSE
          else { 
//  DISPLAY '*160 CF50005-CLEARING-GRP (' CF50005-CLEARING-GRP ') NOT EQUALS' '  800-CLEARING-DT-TM-9-SHORT (' 800-CLEARING-DT-TM-9-SHORT ')'
              logger.info("*160 CF50005-CLEARING-GRP ({}) NOT EQUALS  800-CLEARING-DT-TM-9-SHORT ({})", methodOut.getCf50005ClearingGrp().toString(), String.valueOf(methodOut.getClearingDtTm9Short800())); 
          }

// *
          // MOVE CF50005-CLEARING-DT-X TO 800-CLEARING-DT-TM-9
          methodOut.setClearingDtTm9800(padLeftZeros(12,methodOut.getCf50005ClearingDtX(),false));
//  IF CF50005-CLEARING-DT-X = 800-CLEARING-DT-TM-9
          if (compareChars(methodOut.getCf50005ClearingDtX(),String.valueOf(methodOut.getClearingDtTm9800String()).toCharArray()) == 0) { 
//  DISPLAY '*161 CF50005-CLEARING-DT-X (' CF50005-CLEARING-DT-X ') EQUALS' '  800-CLEARING-DT-TM-9 (' 800-CLEARING-DT-TM-9 ')'
              logger.info("*161 CF50005-CLEARING-DT-X ({}) EQUALS  800-CLEARING-DT-TM-9 ({})", new String(methodOut.getCf50005ClearingDtX()), String.valueOf(methodOut.getClearingDtTm9800())); 
          }
//  ELSE
          else { 
//  DISPLAY '*162 CF50005-CLEARING-DT-X (' CF50005-CLEARING-DT-X ') NOT EQUALS' '  800-CLEARING-DT-TM-9 (' 800-CLEARING-DT-TM-9 ')'
              logger.info("*162 CF50005-CLEARING-DT-X ({}) NOT EQUALS  800-CLEARING-DT-TM-9 ({})", new String(methodOut.getCf50005ClearingDtX()), String.valueOf(methodOut.getClearingDtTm9800())); 
          }
//  IF CF50005-CLEARING-DT-N = 800-CLEARING-DT-TM-9
          if (	( methodOut.getCf50005ClearingDtN() == methodOut.getClearingDtTm9800() )) { 
//  DISPLAY '*163 CF50005-CLEARING-DT-N (' CF50005-CLEARING-DT-N ') EQUALS' '  800-CLEARING-DT-TM-9 (' 800-CLEARING-DT-TM-9 ')'
              logger.info("*163 CF50005-CLEARING-DT-N ({}) EQUALS  800-CLEARING-DT-TM-9 ({})", String.valueOf(methodOut.getCf50005ClearingDtN()), String.valueOf(methodOut.getClearingDtTm9800())); 
          }
//  ELSE
          else { 
//  DISPLAY '*164 CF50005-CLEARING-DT-N (' CF50005-CLEARING-DT-N ') NOT EQUALS' '  800-CLEARING-DT-TM-9 (' 800-CLEARING-DT-TM-9 ')'
              logger.info("*164 CF50005-CLEARING-DT-N ({}) NOT EQUALS  800-CLEARING-DT-TM-9 ({})", String.valueOf(methodOut.getCf50005ClearingDtN()), String.valueOf(methodOut.getClearingDtTm9800())); 
          }
          // MOVE '2021050P1Q' TO CF50005-CLEARING-GRP
          //  LITERAL_2021050P1Q = '2021050P1Q'
          methodOut.getCf50005ClearingGrp().setString(CONSTANTS.LITERAL_2021050P1Q);
          // MOVE CF50005-CLEARING-DT-X TO 800-CLEARING-DT-TM-9
          methodOut.setClearingDtTm9800(padLeftZeros(12,methodOut.getCf50005ClearingDtX(),false));
//  IF CF50005-CLEARING-DT-X = 800-CLEARING-DT-TM-9
          if (compareChars(methodOut.getCf50005ClearingDtX(),String.valueOf(methodOut.getClearingDtTm9800String()).toCharArray()) == 0) { 
//  DISPLAY '*165 CF50005-CLEARING-DT-X (' CF50005-CLEARING-DT-X ') EQUALS' '  800-CLEARING-DT-TM-9 (' 800-CLEARING-DT-TM-9 ')'
              logger.info("*165 CF50005-CLEARING-DT-X ({}) EQUALS  800-CLEARING-DT-TM-9 ({})", new String(methodOut.getCf50005ClearingDtX()), String.valueOf(methodOut.getClearingDtTm9800())); 
          }
//  ELSE
          else { 
//  DISPLAY '*166 CF50005-CLEARING-DT-X (' CF50005-CLEARING-DT-X ') NOT EQUALS' '  800-CLEARING-DT-TM-9 (' 800-CLEARING-DT-TM-9 ')'
              logger.info("*166 CF50005-CLEARING-DT-X ({}) NOT EQUALS  800-CLEARING-DT-TM-9 ({})", new String(methodOut.getCf50005ClearingDtX()), String.valueOf(methodOut.getClearingDtTm9800())); 
          }

// *     Else
// *         display '*168 cf50005-clearing-dt-n ('
// *                 cf50005-clearing-dt-n ') not equals'
// *                 '  800-clearing-dt-tm-9 ('
// *                 800-clearing-dt-tm-9 ')'
// *     end-if
// *
          // MOVE 'ABCDEFGH' TO CF50005-CLEARING-DT-X
          //  LITERAL_ABCDEFGH = 'ABCDEFGH'
          methodOut.setCf50005ClearingDtX(CONSTANTS.LITERAL_ABCDEFGH);
          // MOVE CF50005-CLEARING-DT-X TO 800-CLEARING-DT-TM-9
          methodOut.setClearingDtTm9800(padLeftZeros(12,methodOut.getCf50005ClearingDtX(),false));
//  IF CF50005-CLEARING-DT-X = 800-CLEARING-DT-TM-9
          if (compareChars(methodOut.getCf50005ClearingDtX(),String.valueOf(methodOut.getClearingDtTm9800String()).toCharArray()) == 0) { 
//  DISPLAY '*169 CF50005-CLEARING-DT-X (' CF50005-CLEARING-DT-X ') EQUALS' '  800-CLEARING-DT-TM-9 (' 800-CLEARING-DT-TM-9 ')'
              logger.info("*169 CF50005-CLEARING-DT-X ({}) EQUALS  800-CLEARING-DT-TM-9 ({})", new String(methodOut.getCf50005ClearingDtX()), String.valueOf(methodOut.getClearingDtTm9800())); 
          }
//  ELSE
          else { 
//  DISPLAY '*170 CF50005-CLEARING-DT-X (' CF50005-CLEARING-DT-X ') NOT EQUALS' '  800-CLEARING-DT-TM-9 (' 800-CLEARING-DT-TM-9 ')'
              logger.info("*170 CF50005-CLEARING-DT-X ({}) NOT EQUALS  800-CLEARING-DT-TM-9 ({})", new String(methodOut.getCf50005ClearingDtX()), String.valueOf(methodOut.getClearingDtTm9800())); 
          }
//  IF CF50005-CLEARING-DT-N = 800-CLEARING-DT-TM-9
          if (	( methodOut.getCf50005ClearingDtN() == methodOut.getClearingDtTm9800() )) { 
//  DISPLAY '*171 CF50005-CLEARING-DT-N (' CF50005-CLEARING-DT-N ') EQUALS' '  800-CLEARING-DT-TM-9 (' 800-CLEARING-DT-TM-9 ')'
              logger.info("*171 CF50005-CLEARING-DT-N ({}) EQUALS  800-CLEARING-DT-TM-9 ({})", String.valueOf(methodOut.getCf50005ClearingDtN()), String.valueOf(methodOut.getClearingDtTm9800())); 
          }
//  ELSE
          else { 
//  DISPLAY '*172 CF50005-CLEARING-DT-N (' CF50005-CLEARING-DT-N ') NOT EQUALS' '  800-CLEARING-DT-TM-9 (' 800-CLEARING-DT-TM-9 ')'
              logger.info("*172 CF50005-CLEARING-DT-N ({}) NOT EQUALS  800-CLEARING-DT-TM-9 ({})", String.valueOf(methodOut.getCf50005ClearingDtN()), String.valueOf(methodOut.getClearingDtTm9800())); 
          }

// * Same as above but with arrays
          // MOVE '2021050410' TO CF50005-CLEARING-GRP
          //  LITERAL_2021050410 = '2021050410'
          methodOut.getCf50005ClearingGrp().setString(CONSTANTS.LITERAL_2021050410);
          // MOVE 3 TO I
          //  LITERAL_3 = 3
          methodOut.setI(3);

// *
// *  Commented for now.. we will handle it later
// *     move  cf50005-clearing-grp to 900-clearing-dt-tm-9 (i)
// *     if cf50005-clearing-grp = 900-clearing-dt-tm-9 (i)
// *         display '*173 cf50005-clearing-grp ('
// *                 cf50005-clearing-grp ') equals'
// *                 '  900-clearing-dt-tm-9 (i) ('
// *                 900-clearing-dt-tm-9 (i)')'
// *     else
// *         display '*174 cf50005-clearing-grp ('
// *                 cf50005-clearing-grp ') not equals'
// *                 '  900-clearing-dt-tm-9 (i) ('
// *                 900-clearing-dt-tm-9 (i)')'
// *     end-if
//  MOVE CF50005-CLEARING-GRP TO 900-CLEARING-DT-TM-9-SHORT (I)
          methodOut.setClearingDtTm9Short900(methodOut.getI() - 1,methodOut.getCf50005ClearingGrp().toCharArray());
//  IF CF50005-CLEARING-GRP = 900-CLEARING-DT-TM-9-SHORT (I)
          if (compareChars(methodOut.getCf50005ClearingGrp(),String.valueOf(methodOut.getClearingDtTm9Short900String(methodOut.getI() - 1)).toCharArray()) == 0) { 
//  DISPLAY '*175 CF50005-CLEARING-GRP (' CF50005-CLEARING-GRP ') EQUALS' '  900-CLEARING-DT-TM-9-SHORT (I) (' 900-CLEARING-DT-TM-9-SHORT (I) ')'
              logger.info("*175 CF50005-CLEARING-GRP ({}) EQUALS  900-CLEARING-DT-TM-9-SHORT (I) ({})", methodOut.getCf50005ClearingGrp().toString(), String.valueOf(methodOut.getClearingDtTm9Short900(methodOut.getI() - 1))); 
          }
//  ELSE
          else { 
//  DISPLAY '*176 CF50005-CLEARING-GRP (' CF50005-CLEARING-GRP ') NOT EQUALS' '  900-CLEARING-DT-TM-9-SHORT (I) (' 900-CLEARING-DT-TM-9-SHORT (I) ')'
              logger.info("*176 CF50005-CLEARING-GRP ({}) NOT EQUALS  900-CLEARING-DT-TM-9-SHORT (I) ({})", methodOut.getCf50005ClearingGrp().toString(), String.valueOf(methodOut.getClearingDtTm9Short900(methodOut.getI() - 1))); 
          }

// *
//  MOVE CF50005-CLEARING-DT-X TO 900-CLEARING-DT-TM-9 (I)
          methodOut.setClearingDtTm9900(methodOut.getI() - 1,padLeftZeros(12,methodOut.getCf50005ClearingDtX(),false));
//  IF CF50005-CLEARING-DT-X = 900-CLEARING-DT-TM-9 (I)
          if (compareChars(methodOut.getCf50005ClearingDtX(),String.valueOf(methodOut.getClearingDtTm9900String(methodOut.getI() - 1)).toCharArray()) == 0) { 
//  DISPLAY '*177 CF50005-CLEARING-DT-X (' CF50005-CLEARING-DT-X ') EQUALS' '  900-CLEARING-DT-TM-9 (I) (' 900-CLEARING-DT-TM-9 (I) ')'
              logger.info("*177 CF50005-CLEARING-DT-X ({}) EQUALS  900-CLEARING-DT-TM-9 (I) ({})", new String(methodOut.getCf50005ClearingDtX()), String.valueOf(methodOut.getClearingDtTm9900(methodOut.getI() - 1))); 
          }
//  ELSE
          else { 
//  DISPLAY '*178 CF50005-CLEARING-DT-X (' CF50005-CLEARING-DT-X ') NOT EQUALS' '  900-CLEARING-DT-TM-9 (I) (' 900-CLEARING-DT-TM-9 (I) ')'
              logger.info("*178 CF50005-CLEARING-DT-X ({}) NOT EQUALS  900-CLEARING-DT-TM-9 (I) ({})", new String(methodOut.getCf50005ClearingDtX()), String.valueOf(methodOut.getClearingDtTm9900(methodOut.getI() - 1))); 
          }
//  IF CF50005-CLEARING-DT-N = 900-CLEARING-DT-TM-9 (I)
          if (	( methodOut.getCf50005ClearingDtN() == methodOut.getClearingDtTm9900(methodOut.getI() - 1) )) { 
//  DISPLAY '*179 CF50005-CLEARING-DT-N (' CF50005-CLEARING-DT-N ') EQUALS' '  900-CLEARING-DT-TM-9 (I) (' 900-CLEARING-DT-TM-9 (I) ')'
              logger.info("*179 CF50005-CLEARING-DT-N ({}) EQUALS  900-CLEARING-DT-TM-9 (I) ({})", String.valueOf(methodOut.getCf50005ClearingDtN()), String.valueOf(methodOut.getClearingDtTm9900(methodOut.getI() - 1))); 
          }
//  ELSE
          else { 
//  DISPLAY '*180 CF50005-CLEARING-DT-N (' CF50005-CLEARING-DT-N ') NOT EQUALS' '  900-CLEARING-DT-TM-9 (I) (' 900-CLEARING-DT-TM-9 (I) ')'
              logger.info("*180 CF50005-CLEARING-DT-N ({}) NOT EQUALS  900-CLEARING-DT-TM-9 (I) ({})", String.valueOf(methodOut.getCf50005ClearingDtN()), String.valueOf(methodOut.getClearingDtTm9900(methodOut.getI() - 1))); 
          }

// *
          // MOVE '2021050P1Q' TO CF50005-CLEARING-GRP
          //  LITERAL_2021050P1Q = '2021050P1Q'
          methodOut.getCf50005ClearingGrp().setString(CONSTANTS.LITERAL_2021050P1Q);
//  MOVE CF50005-CLEARING-DT-X TO 900-CLEARING-DT-TM-9 (I)
          methodOut.setClearingDtTm9900(methodOut.getI() - 1,padLeftZeros(12,methodOut.getCf50005ClearingDtX(),false));
//  IF CF50005-CLEARING-DT-X = 900-CLEARING-DT-TM-9 (I)
          if (compareChars(methodOut.getCf50005ClearingDtX(),String.valueOf(methodOut.getClearingDtTm9900String(methodOut.getI() - 1)).toCharArray()) == 0) { 
//  DISPLAY '*181 CF50005-CLEARING-DT-X (' CF50005-CLEARING-DT-X ') EQUALS' '  900-CLEARING-DT-TM-9 (I) (' 900-CLEARING-DT-TM-9 (I) ')'
              logger.info("*181 CF50005-CLEARING-DT-X ({}) EQUALS  900-CLEARING-DT-TM-9 (I) ({})", new String(methodOut.getCf50005ClearingDtX()), String.valueOf(methodOut.getClearingDtTm9900(methodOut.getI() - 1))); 
          }
//  ELSE
          else { 
//  DISPLAY '*182 CF50005-CLEARING-DT-X (' CF50005-CLEARING-DT-X ') NOT EQUALS' '  900-CLEARING-DT-TM-9 (I) (' 900-CLEARING-DT-TM-9 (I) ')'
              logger.info("*182 CF50005-CLEARING-DT-X ({}) NOT EQUALS  900-CLEARING-DT-TM-9 (I) ({})", new String(methodOut.getCf50005ClearingDtX()), String.valueOf(methodOut.getClearingDtTm9900(methodOut.getI() - 1))); 
          }

// *
// *  Commented for now.. we will handle it later
// *     if cf50005-clearing-dt-n  = 900-clearing-dt-tm-9 (i)
// *         display '*183 cf50005-clearing-dt-n ('
// *                 cf50005-clearing-dt-n ') equals'
// *                 '  900-clearing-dt-tm-9 (i) ('
// *                 900-clearing-dt-tm-9 (i)')'
// *     else
// *         display '*184 cf50005-clearing-dt-n ('
// *                 cf50005-clearing-dt-n ') not equals'
// *                 '  900-clearing-dt-tm-9 (i) ('
// *                 900-clearing-dt-tm-9 (i)')'
// *     end-if
// *
          // MOVE 'ABCDEFGH' TO CF50005-CLEARING-DT-X
          //  LITERAL_ABCDEFGH = 'ABCDEFGH'
          methodOut.setCf50005ClearingDtX(CONSTANTS.LITERAL_ABCDEFGH);
//  MOVE CF50005-CLEARING-DT-X TO 900-CLEARING-DT-TM-9 (I)
          methodOut.setClearingDtTm9900(methodOut.getI() - 1,padLeftZeros(12,methodOut.getCf50005ClearingDtX(),false));
//  IF CF50005-CLEARING-DT-X = 900-CLEARING-DT-TM-9 (I)
          if (compareChars(methodOut.getCf50005ClearingDtX(),String.valueOf(methodOut.getClearingDtTm9900String(methodOut.getI() - 1)).toCharArray()) == 0) { 
//  DISPLAY '*185 CF50005-CLEARING-DT-X (' CF50005-CLEARING-DT-X ') EQUALS' '  900-CLEARING-DT-TM-9 (I) (' 900-CLEARING-DT-TM-9 (I) ')'
              logger.info("*185 CF50005-CLEARING-DT-X ({}) EQUALS  900-CLEARING-DT-TM-9 (I) ({})", new String(methodOut.getCf50005ClearingDtX()), String.valueOf(methodOut.getClearingDtTm9900(methodOut.getI() - 1))); 
          }
//  ELSE
          else { 
//  DISPLAY '*186 CF50005-CLEARING-DT-X (' CF50005-CLEARING-DT-X ') NOT EQUALS' '  900-CLEARING-DT-TM-9 (I) (' 900-CLEARING-DT-TM-9 (I) ')'
              logger.info("*186 CF50005-CLEARING-DT-X ({}) NOT EQUALS  900-CLEARING-DT-TM-9 (I) ({})", new String(methodOut.getCf50005ClearingDtX()), String.valueOf(methodOut.getClearingDtTm9900(methodOut.getI() - 1))); 
          }
//  IF CF50005-CLEARING-DT-N = 900-CLEARING-DT-TM-9 (I)
          if (	( methodOut.getCf50005ClearingDtN() == methodOut.getClearingDtTm9900(methodOut.getI() - 1) )) { 
//  DISPLAY '*187 CF50005-CLEARING-DT-N (' CF50005-CLEARING-DT-N ') EQUALS' '  900-CLEARING-DT-TM-9 (I) (' 900-CLEARING-DT-TM-9 (I) ')'
              logger.info("*187 CF50005-CLEARING-DT-N ({}) EQUALS  900-CLEARING-DT-TM-9 (I) ({})", String.valueOf(methodOut.getCf50005ClearingDtN()), String.valueOf(methodOut.getClearingDtTm9900(methodOut.getI() - 1))); 
          }
//  ELSE
          else { 
//  DISPLAY '*188 CF50005-CLEARING-DT-N (' CF50005-CLEARING-DT-N ') NOT EQUALS' '  900-CLEARING-DT-TM-9 (I) (' 900-CLEARING-DT-TM-9 (I) ')'
              logger.info("*188 CF50005-CLEARING-DT-N ({}) NOT EQUALS  900-CLEARING-DT-TM-9 (I) ({})", String.valueOf(methodOut.getCf50005ClearingDtN()), String.valueOf(methodOut.getClearingDtTm9900(methodOut.getI() - 1))); 
          }

// *
//  MOVE 300-PRE-EDIT-VERSION TO 600-PE-VERSION-NUM
          methodOut.setPeVersionNum600(methodOut.getPreEditVersion300());
//  DISPLAY '*191 300-PE-VER-YY      = ' 300-PE-VER-YY
          logger.info("*191 300-PE-VER-YY      = {}", new String(methodIn.getPeVerYy300())); 
//  DISPLAY '*192 300-PE-RELEASE     = ' 300-PE-RELEASE
          logger.info("*192 300-PE-RELEASE     = {}", new String(methodIn.getPeRelease300())); 
//  DISPLAY '*193 300-PE-VER-SEQUENCE= ' 300-PE-VER-SEQUENCE
          logger.info("*193 300-PE-VER-SEQUENCE= {}", new String(methodIn.getPeVerSequence300())); 
//  DISPLAY '*194 600-PE-VERSION-NUM = ' 600-PE-VERSION-NUM
          logger.info("*194 600-PE-VERSION-NUM = {}", new String(methodOut.getPeVersionNum600())); 
//  DISPLAY '*195 600-PE-VERSION-NUM-MSG = ' 600-PE-VERSION-NUM-MSG
          logger.info("*195 600-PE-VERSION-NUM-MSG = {}", methodIn.getPeVersionNumMsg600().toString()); 

// *
//  INITIALIZE IP31021-SUMMARY-CONTROL-CARD IP31021-INPUT-SOURCE IP31021-SUMMARY-SIF IP31021-SUMMARY-CYCLE 800-INPUT-VARS 800-INPUT-TABLE-ID 800-INPUT-SEG-ID IP500041-REC
          methodOut.getIp31021SummaryControlCard().initialize();
          methodOut.setIp31021InputSource(CONSTANTS.SPACE_10 /* Fill 10 Spaces*/);
          methodOut.setIp31021SummarySif(CONSTANTS.SPACE /* Fill 1 Spaces*/);
          methodOut.setIp31021SummaryCycle(0);
          methodOut.getInputVars800().initialize();
          methodOut.setInputTableId800(0);
          methodOut.setInputSegId800(CONSTANTS.SPACE_4 /* Fill 4 Spaces*/);
          methodOut.getIp500041Rec().initialize();
          // MOVE '0000000001' TO IP31021-INPUT-SOURCE
          //  LITERAL_0000000001 = '0000000001'
          methodOut.setIp31021InputSource(CONSTANTS.LITERAL_0000000001);
          // MOVE '00000000001' TO IP500041-TABLE-ID
          //  LITERAL_00000000001 = '00000000001'
          methodOut.setIp500041TableId(CONSTANTS.LITERAL_00000000001);
          // MOVE IP31021-INPUT-SOURCE TO 800-INPUT-TABLE-ID
          methodOut.setInputTableId800(padLeftZeros(11,methodOut.getIp31021InputSource(),false));
//  IF IP500041-TABLE-ID = 800-INPUT-TABLE-ID
          if (compareChars(methodOut.getIp500041TableId(),String.valueOf(methodOut.getInputTableId800String()).toCharArray()) == 0) { 
//  DISPLAY '*196 SUCCESS '
              logger.info("*196 SUCCESS "); 
          }
//  ELSE
          else { 
//  DISPLAY '*197 FAILURE '
              logger.info("*197 FAILURE "); 
          }
//  INITIALIZE CF20004-TABLE-DATA
          methodOut.getCf20004TableData().initialize();
          // MOVE ALL '0' TO CF20004-ITEMS (1 : 256)
          methodOut.getCf20004TableData().replace(CONSTANTS.LITERAL_1907030827,33,256);
//  DISPLAY '*198 CF20004-ITEMS = ' CF20004-ITEMS
          logger.info("*198 CF20004-ITEMS = {}", new String(methodOut.getCf20004Items())); 
          // MOVE CF20004-TABLE-DATA TO CF20004-TABLE-ENTS
          methodOut.setCf20004TableEnts(methodOut.getCf20004TableData().toCharArray());
//  DISPLAY '*199 CF20004-TABLE-ENTS = ' CF20004-TABLE-ENTS
          logger.info("*199 CF20004-TABLE-ENTS = {}", new String(methodOut.getCf20004TableEnts())); 

// *
//  MOVE ALL '*' TO 700-SORT-KEY-LTH-TABLE
          methodOut.getSortKeyLthTable700().setString(CONSTANTS.LITERAL_2032398511);
//  MOVE ALL 'B' TO 700-TABLE-ID (1)
          methodOut.setTableId700(0,CONSTANTS.LITERAL_BBBBBBBB);
//  MOVE ALL 'C' TO 700-TABLE-ID (2)
          methodOut.setTableId700(1,CONSTANTS.LITERAL_CCCCCCCC);
//  MOVE ALL 'D' TO 700-TABLE-ID (3)
          methodOut.setTableId700(2,CONSTANTS.LITERAL_DDDDDDDD);
//  MOVE ALL 'E' TO 700-TABLE-ID (4)
          methodOut.setTableId700(3,CONSTANTS.LITERAL_EEEEEEEE);
//  MOVE 'ABCDEFGH' TO 700-TABLE-ID (16)
//  LITERAL_ABCDEFGH = 'ABCDEFGH'
          methodOut.setTableId700(15,CONSTANTS.LITERAL_ABCDEFGH);

// *
//  PERFORM VARYING INX-A FROM 1 BY 1 UNTIL INX-A > 10
          for (methodOut.setInxA(1); (	( methodOut.getInxA() <= 10 )) ; methodOut.setInxA(methodOut.getInxA() + 1) ) {
//  EVALUATE INX-A
              switch(methodOut.getInxA()){
              	case 1:
//  MOVE ALL 'A' TO TABLE-ITEM ( INX-A )
                  methodOut.setTableItem(methodOut.getInxA() - 1,CONSTANTS.LITERAL_AAAAAAAA);
              break;
              	case 2:
//  MOVE ALL 'B' TO TABLE-ITEM ( INX-A )
                  methodOut.setTableItem(methodOut.getInxA() - 1,CONSTANTS.LITERAL_BBBBBBBB);
              break;
              	case 3:
//  MOVE ALL 'C' TO TABLE-ITEM ( INX-A )
                  methodOut.setTableItem(methodOut.getInxA() - 1,CONSTANTS.LITERAL_CCCCCCCC);
              break;
              	case 4:
//  MOVE ALL 'D' TO TABLE-ITEM ( INX-A )
                  methodOut.setTableItem(methodOut.getInxA() - 1,CONSTANTS.LITERAL_DDDDDDDD);
              break;
              	case 5:
//  MOVE ALL 'E' TO TABLE-ITEM ( INX-A )
                  methodOut.setTableItem(methodOut.getInxA() - 1,CONSTANTS.LITERAL_EEEEEEEE);
              break;
              	case 6:
//  MOVE ALL 'F' TO TABLE-ITEM ( INX-A )
                  methodOut.setTableItem(methodOut.getInxA() - 1,CONSTANTS.LITERAL_FFFFFFFF);
              break;
              	case 7:
//  MOVE ALL 'G' TO TABLE-ITEM ( INX-A )
                  methodOut.setTableItem(methodOut.getInxA() - 1,CONSTANTS.LITERAL_GGGGGGGG);
              break;
              	case 8:
//  MOVE ALL 'H' TO TABLE-ITEM ( INX-A )
                  methodOut.setTableItem(methodOut.getInxA() - 1,CONSTANTS.LITERAL_HHHHHHHH);
              break;
              	case 9:
//  MOVE ALL 'I' TO TABLE-ITEM ( INX-A )
                  methodOut.setTableItem(methodOut.getInxA() - 1,CONSTANTS.LITERAL_IIIIIIII);
              break;
              	case 10:
//  MOVE ALL 'J' TO TABLE-ITEM ( INX-A )
                  methodOut.setTableItem(methodOut.getInxA() - 1,CONSTANTS.LITERAL_JJJJJJJJ);
              break;
              default :
//  MOVE ALL 'Z' TO TABLE-ITEM ( INX-A )
                  methodOut.setTableItem(methodOut.getInxA() - 1,CONSTANTS.LITERAL_ZZZZZZZZ);
              }
          }

// *
//  SET INX-A TO 10
          methodOut.setInxA(10); 
          
//  SET INX-B TO INX-A
          methodOut.setInxB(TABLE_ITEM_LENGTH * ( ((methodOut.getInxA() < 1) ? 1:methodOut.getInxA()) - 1)); 
          
//  IF INX-A = INX-B THEN
          if (	( methodOut.getInxA() == ( methodOut.getInxB() / 8 ) + 1  )) { 
//  DISPLAY '*200 INX-A = INX-B'
              logger.info("*200 INX-A = INX-B"); 
          }
//  DISPLAY '*201 INX-B-BIN =  ' INX-B-BIN
          logger.info("*201 INX-B-BIN =  {}", String.valueOf(methodIn.getInxBBin())); 

// *
//  DISPLAY 'IN LOOP'
          logger.info("IN LOOP"); 
//  PERFORM VARYING INX-A FROM 1 BY 1 UNTIL INX-A > INX-B
          for (methodOut.setInxA(1); (	( methodOut.getInxA() <= ( methodOut.getInxB() / 8 ) + 1  )) ; methodOut.setInxA(methodOut.getInxA() + 1) ) {
//  DISPLAY '*202 ' TABLE-ITEM ( INX-A )
              logger.info("*202 {}", new String(methodOut.getTableItem(methodOut.getInxA() - 1))); 
          }

// *
//  DISPLAY '*203 INX-A = 6'
          logger.info("*203 INX-A = 6"); 
//  DISPLAY '*204 ---------'
          logger.info("*204 ---------"); 
//  SET INX-A TO 3
          methodOut.setInxA(3); 
          
//  SET INX-B TO INX-A
          methodOut.setInxB(TABLE_ITEM_LENGTH * ( ((methodOut.getInxA() < 1) ? 1:methodOut.getInxA()) - 1)); 
          
//  DISPLAY '*205 INX-B-BIN =  ' INX-B-BIN
          logger.info("*205 INX-B-BIN =  {}", String.valueOf(methodIn.getInxBBin())); 

// *
//  SET INX-A TO 6
          methodOut.setInxA(6); 
          
//  DISPLAY '*206 ** ' TABLE-ITEM ( INX-A )
          logger.info("*206 ** {}", new String(methodOut.getTableItem(methodOut.getInxA() - 1))); 
      
      return methodOut;
      }
      /**
      * mainSplit5 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAIN-SPLIT5 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - inxB                           COBOL Name: INX-B
      * - tableItem                      COBOL Name: TABLE-ITEM
      * - tableId700                     COBOL Name: 700-TABLE-ID
      * - grp1                           COBOL Name: WS-GRP-1
      * - report1HeadingLine11701        COBOL Name: 701-REPORT-1-HEADING-LINE-11
      * - dtlCnt800                      COBOL Name: 800-DTL-CNT
      * - dtlCntA800                     COBOL Name: 800-DTL-CNT-A
      * - value1300                      COBOL Name: 300-VALUE-1
      * - value10300                     COBOL Name: 300-VALUE-10
      * - c0071300                       COBOL Name: 300-C-0071
      *
      * Output :  

      * - inxA                           COBOL Name: INX-A
      * - inxC                           COBOL Name: INX-C
      * - inxD                           COBOL Name: INX-D
      * - ip43501ErrorInfoRec            COBOL Name: IP43501-ERROR-INFO-REC
      * - ip43501EiSourceMsgNum          COBOL Name: IP43501-EI-SOURCE-MSG-NUM
      * - sourceMessageNo701             COBOL Name: 701-SOURCE-MESSAGE-NO
      * - mcissuesWhenCompiled           COBOL Name: MCISSUES-WHEN-COMPILED
      * - dtlCntZo800                    COBOL Name: 800-DTL-CNT-ZO
      * - dtlRecord3800                  COBOL Name: 800-DTL-RECORD-3
      * - dtlCount800                    COBOL Name: 800-DTL-COUNT
      * - dtlRecord4800                  COBOL Name: 800-DTL-RECORD-4
      * - dtlLast800                     COBOL Name: 800-DTL-LAST
      * - dtlRecord1800                  COBOL Name: 800-DTL-RECORD-1
      * - iCtr400                        COBOL Name: 400-I-CTR
      * - dtlCntA800                     COBOL Name: 800-DTL-CNT-A
      * - ip00104Elsub                   COBOL Name: IP00104-ELSUB
      * - c0071300                       COBOL Name: 300-C-0071
      *
      * @throws CFException
      */
      @Override
      public MainSplit5OutCtx mainSplit5(MainSplit5InCtx methodIn) throws Exception {
McissuesCtx programCtx = methodIn.getMcissuesCtx();
MainSplit5OutCtx methodOut = methodIn.getMainSplit5OutCtx();
//  SET INX-A TO INX-B
          methodOut.setInxA((methodIn.getInxB()/TABLE_ITEM_LENGTH) + 1 ); 
          
//  DISPLAY '*207 ** ' TABLE-ITEM ( INX-A )
          logger.info("*207 ** {}", new String(methodIn.getTableItem(methodOut.getInxA() - 1))); 

// *
// * Indirect reference of inx-b via inx-b-bin
// *
//  DISPLAY '*208 700-TABLE-ID (INX-B-BIN) = ' 700-TABLE-ID ( INX-B-BIN )
          logger.info("*208 700-TABLE-ID (INX-B-BIN) = {}", new String(methodIn.getTableId700((int) methodIn.getInxBBin() - 1))); 

// *
// * Below one is crazy...
// *
// *    set inx-c to inx-b
// *    display '700-table-id (inx-c) = ' 700-table-id (inx-c)
// *
// * this one works fine
// *
//  SET INX-C TO INX-A
          methodOut.setInxC(methodOut.getInxA()); 
          
//  DISPLAY '*209 700-TABLE-ID (INX-C) = ' 700-TABLE-ID ( INX-C )
          logger.info("*209 700-TABLE-ID (INX-C) = {}", new String(methodIn.getTableId700(methodOut.getInxC() - 1))); 

// *
//  SET INX-D TO INX-B
          methodOut.setInxD(methodIn.getInxB()); 
          
//  SET INX-A TO INX-D
          methodOut.setInxA((methodOut.getInxD()/TABLE_ITEM_LENGTH) + 1 ); 
          
//  DISPLAY '*210 ** ' TABLE-ITEM ( INX-A )
          logger.info("*210 ** {}", new String(methodIn.getTableItem(methodOut.getInxA() - 1))); 

// * Mc143
//  INITIALIZE IP43501-ERROR-INFO-REC
          methodOut.getIp43501ErrorInfoRec().initialize();
//  DISPLAY '*211 ' WS-GRP-1
          logger.info("*211 {}", methodIn.getGrp1().toString()); 
          // MOVE 2 TO IP43501-EI-SOURCE-MSG-NUM
          //  LITERAL_2 = 2
          methodOut.setIp43501EiSourceMsgNum((long)2);
//  MOVE IP43501-EI-SOURCE-MSG-NUM (2 : 9) TO 701-SOURCE-MESSAGE-NO
          methodOut.setSourceMessageNo701(String.valueOf(substring(methodOut.getIp43501EiSourceMsgNumString(),1,10)).toCharArray());
//  DISPLAY '*212 ' 701-REPORT-1-HEADING-LINE-11
          logger.info("*212 {}", methodIn.getReport1HeadingLine11701().toString()); 

// *
          // MOVE WHEN-COMPILED TO MCISSUES-WHEN-COMPILED
          //  FORMAT1311677340 = "X(08)BX(08)"
          methodOut.setMcissuesWhenCompiled(CFUtil.cobolAnEditFormatter(CONSTANTS.FORMAT1311677340,CONSTANTS.LITERAL_2016092150));
//  DISPLAY '*213 MCISSUES-WHEN-COMPILED = ' MCISSUES-WHEN-COMPILED
          logger.info("*213 MCISSUES-WHEN-COMPILED = {}", new String(methodOut.getMcissuesWhenCompiled())); 

// *
          // MOVE '123456' TO 800-DTL-CNT-ZO
          //  LITERAL_123456 = '123456'
          methodOut.setDtlCntZo800((long)123456);
//  INITIALIZE 800-DTL-RECORD-3 800-DTL-COUNT 800-DTL-RECORD-4 800-DTL-LAST
          methodOut.getDtlRecord3800().initialize();
          methodOut.setDtlCount800(CONSTANTS.SPACE_10 /* Fill 10 Spaces*/);
          methodOut.getDtlRecord4800().initialize();
          methodOut.setDtlLast800(CONSTANTS.SPACE /* Fill 1 Spaces*/);
//  SET 88-800-SYS201-L03 TO TRUE
          methodOut.setSys201L0388800True(); 
          
//  DISPLAY '*214 * 800-DTL-CNT    = (' 800-DTL-CNT ')'
          logger.info("*214 * 800-DTL-CNT    = ({})", methodIn.getDtlCnt800().toString()); 
//  DISPLAY '*215 * 800-DTL-CNT-A  = (' 800-DTL-CNT-A ')'
          logger.info("*215 * 800-DTL-CNT-A  = ({})", new String(methodOut.getDtlCntA800())); 
//  DISPLAY '*216 * 800-DTL-CNT-ZO = (' 800-DTL-CNT-ZO ')'
          logger.info("*216 * 800-DTL-CNT-ZO = ({})", String.valueOf(methodOut.getDtlCntZo800())); 

// *
//  IF 800-DTL-CNT-ZO > 0
//  LITERAL_0 = 0
          if (	( methodOut.getDtlCntZo800() > 0 ) ) { 
              // MOVE ZEROS TO 400-I-CTR
              methodOut.setICtr400((short) 0);
//  PERFORM VARYING 400-I-CTR FROM 300-VALUE-1 BY 300-VALUE-1 UNTIL 400-I-CTR > 300-VALUE-10
              for (methodOut.setICtr400((short) methodIn.getValue1300()); (	( methodOut.getICtr400() <= methodIn.getValue10300() ) ) ; methodOut.setICtr400((short)(methodOut.getICtr400() +  methodIn.getValue1300())) ) {
//  IF 800-DTL-CNT-ZO ( 400-I-CTR : 1) > 0
//  LITERAL_0 = 0
                  if (compareChars(substring(methodOut.getDtlCntZo800String(),(methodOut.getICtr400()-1), (methodOut.getICtr400() + 0) ),CONSTANTS.LITERAL_0) > 0) { 
//  MOVE 800-DTL-CNT-ZO ( 400-I-CTR : ) TO 800-DTL-COUNT
                      methodOut.setDtlCount800(String.valueOf(substring(methodOut.getDtlCntZo800String(),(methodOut.getICtr400()-1), (methodOut.getICtr400() + 9) )).toCharArray());
//  ADD 300-VALUE-10 TO 400-I-CTR
                      methodOut.setICtr400( (short) (methodOut.getICtr400()+(short) methodIn.getValue10300()));
                  }
              }
          }
//  DISPLAY '*217* 800-DTL-COUNT  = (' 800-DTL-COUNT ')'
          logger.info("*217* 800-DTL-COUNT  = ({})", new String(methodOut.getDtlCount800())); 

// *
//  IF 800-DTL-CNT-ZO > 0
//  LITERAL_0 = 0
          if (	( methodOut.getDtlCntZo800() > 0 ) ) { 
              // MOVE ZEROES TO 400-I-CTR
              methodOut.setICtr400((short) 0);
//  PERFORM VARYING 400-I-CTR FROM 300-VALUE-1 BY 300-VALUE-1 UNTIL 400-I-CTR > 300-VALUE-10
              for (methodOut.setICtr400((short) methodIn.getValue1300()); (	( methodOut.getICtr400() <= methodIn.getValue10300() ) ) ; methodOut.setICtr400((short)(methodOut.getICtr400() +  methodIn.getValue1300())) ) {
//  IF 800-DTL-CNT-ZO ( 400-I-CTR : 1) > 0
//  LITERAL_0 = 0
                  if (compareChars(substring(methodOut.getDtlCntZo800String(),(methodOut.getICtr400()-1), (methodOut.getICtr400() + 0) ),CONSTANTS.LITERAL_0) > 0) { 
                      // MOVE 800-DTL-CNT-A ( 400-I-CTR : ) TO 800-DTL-COUNT
                      methodOut.getDtlRecord3800().replace(methodOut.getDtlCnt800()/*parent*/,(methodOut.getICtr400() - 1)/*fromOffset - (dtlCntA800) */,(10-(methodOut.getICtr400() - 1))/*fromLen*/,0/*toOffset - (dtlCount800) */,10/*toLen*/);
//  ADD 300-VALUE-10 TO 400-I-CTR
                      methodOut.setICtr400( (short) (methodOut.getICtr400()+(short) methodIn.getValue10300()));
                  }
              }
          }
//  DISPLAY '*218* 800-DTL-COUNT  = (' 800-DTL-COUNT ')'
          logger.info("*218* 800-DTL-COUNT  = ({})", new String(methodOut.getDtlCount800())); 

// *
//  PERFORM 9000-MOVE-EDIT-FIELDS THRU 9000-EXIT
          moveEditFields(programCtx);/*9000-MOVE-EDIT-FIELDS*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }

// *
//  MOVE 300-C-0071 TO IP00104-ELSUB
          methodOut.setIp00104Elsub(padLeftZeros(3,methodOut.getC0071300(),false));
//  DISPLAY '*221* 300-C-0071     = (' 300-C-0071 ')'
          logger.info("*221* 300-C-0071     = ({})", new String(methodOut.getC0071300())); 
//  DISPLAY '*222* IP00104-ELSUB  = (' IP00104-ELSUB ')'
          logger.info("*222* IP00104-ELSUB  = ({})", String.valueOf(methodOut.getIp00104Elsub())); 

// *

// *
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return methodOut;
      
      }
      /**
      * findMoveReplaceText 
      *   This method is derived from 
  *   COBOL Paragraph - 2100-FIND-MOVE-REPLACE-TEXT COBOL Cyclomatic complexity - 1
      * Input  :  

      * - ip00321ReplTextCount           COBOL Name: IP00321-REPL-TEXT-COUNT
      *
      * Output : None 

      * @throws CFException
      */
      @Override
      public void findMoveReplaceText(FindMoveReplaceTextInCtx methodIn) throws Exception {
McissuesCtx programCtx = methodIn.getMcissuesCtx();
//  DISPLAY '*' IP00321-REPL-TEXT-COUNT '*2100-FIND-MOVE-REPLACE-TEXT'
          logger.info("*{}*2100-FIND-MOVE-REPLACE-TEXT", String.valueOf(methodIn.getIp00321ReplTextCount())); 
      
      }
      /**
      * exit 
      *   This method is derived from 
  *   COBOL Paragraph - 2100-EXIT COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ip00321ReplTextCount           COBOL Name: IP00321-REPL-TEXT-COUNT
      *
      * Output : None 

      * @throws CFException
      */
      @Override
      public void exit(ExitInCtx methodIn) throws Exception {
McissuesCtx programCtx = methodIn.getMcissuesCtx();
//  DISPLAY '*' IP00321-REPL-TEXT-COUNT '*2100-EXIT'
          logger.info("*{}*2100-EXIT", String.valueOf(methodIn.getIp00321ReplTextCount())); 
      
      }
      /**
      * searchHolidayExclusion 
      *   This method is derived from 
  *   COBOL Paragraph - 3222-SEARCH-HOLIDAY-EXCLUSION COBOL Cyclomatic complexity - 4
      * Input  :  

      * - julianHolidays500              COBOL Name: 500-JULIAN-HOLIDAYS
      * - holidayIndex500                COBOL Name: 500-HOLIDAY-INDEX
      * - interimJulianDate800           COBOL Name: 800-INTERIM-JULIAN-DATE
      *
      * Output :  

      * - exclusionFlag100               COBOL Name: 100-EXCLUSION-FLAG
      * - holidayIndex500                COBOL Name: 500-HOLIDAY-INDEX
      *
      * @throws CFException
      */
      @Override
      public SearchHolidayExclusionOutCtx searchHolidayExclusion(SearchHolidayExclusionInCtx methodIn) throws Exception {
      
// *

// *
McissuesCtx programCtx = methodIn.getMcissuesCtx();
SearchHolidayExclusionOutCtx methodOut = methodIn.getSearchHolidayExclusionOutCtx();
//  IF 500-JULIAN-HOLIDAYS ( 500-HOLIDAY-INDEX ) IS NUMERIC
          if (        methodIn.getHolidays500().julianHolidays500IsNumeric((methodOut.getHolidayIndex500() - 1)) ) { 
//  IF 500-JULIAN-HOLIDAYS ( 500-HOLIDAY-INDEX ) EQUAL ZEROES
//  ELSE
              if (	( methodIn.getJulianHolidays500(methodOut.getHolidayIndex500() - 1) != 0 )) { 
//  IF 800-INTERIM-JULIAN-DATE EQUAL 500-JULIAN-HOLIDAYS ( 500-HOLIDAY-INDEX )
                  if (	( methodIn.getInterimJulianDate800() == methodIn.getJulianHolidays500(methodOut.getHolidayIndex500() - 1) ) ) { 
//  DISPLAY '*108* MATCH FOUND '
                      logger.info("*108* MATCH FOUND "); 
//  DISPLAY '*109* 800-INTERIM-JULIAN-DATE = ' 800-INTERIM-JULIAN-DATE
                      logger.info("*109* 800-INTERIM-JULIAN-DATE = {}", String.valueOf(methodIn.getInterimJulianDate800())); 
//  DISPLAY '*110* 500-JULIAN-HOLIDAYS(500-HOLIDAY-INDEX) = ' 500-JULIAN-HOLIDAYS ( 500-HOLIDAY-INDEX )
                      logger.info("*110* 500-JULIAN-HOLIDAYS(500-HOLIDAY-INDEX) = {}", String.valueOf(methodIn.getJulianHolidays500(methodOut.getHolidayIndex500() - 1))); 
//  SET 88-100-EXCLUSION-ON TO TRUE
                      methodOut.setExclusionOn88100True(); 
                      
                  }
              }
          }
//  SET 500-HOLIDAY-INDEX UP BY 1
          methodOut.setHolidayIndex500(methodOut.getHolidayIndex500() + 1); 
          
      
      return methodOut;
      }
      /**
      * moveEditFields 
      *   This method is derived from 
  *   COBOL Paragraph - 9000-MOVE-EDIT-FIELDS COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output :  

      * - var1N                          COBOL Name: WS-VAR1-N
      * - var1Ed                         COBOL Name: WS-VAR1-ED
      * - var2Ed                         COBOL Name: WS-VAR2-ED
      *
      * @throws CFException
      */
      @Override
      public MoveEditFieldsOutCtx moveEditFields(McissuesCtx programCtx) throws Exception {
MoveEditFieldsOutCtx methodOut = programCtx.getMoveEditFieldsOutCtx();
          // MOVE 42060.77 TO WS-VAR1-N
          methodOut.setVar1N(BigDecimal.valueOf(42060.77).setScale(2,RoundingMode.DOWN));
          // MOVE WS-VAR1-N TO WS-VAR1-ED
          //  FORMAT_1949449721 = "ZZZ,ZZZ,ZZ9.99"
          methodOut.setVar1Ed(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1949449721,methodOut.getVar1N().toPlainString().toCharArray()));
//  DISPLAY '*219* WS-VAR1-ED  = (' WS-VAR1-ED ')'
          logger.info("*219* WS-VAR1-ED  = ({})", new String(methodOut.getVar1Ed())); 
          // MOVE WS-VAR1-ED TO WS-VAR2-ED
          methodOut.setVar2Ed(methodOut.getVar1Ed());
//  DISPLAY '*220* WS-VAR2-ED  = (' WS-VAR2-ED ')'
          logger.info("*220* WS-VAR2-ED  = ({})", new String(methodOut.getVar2Ed())); 
          ;
      
      return methodOut;
      }
  
  
  
  
  
  
  
  
  }
