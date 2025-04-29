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
  import com.cloudframe.app.mcissues.dto.Ip90354TableDataKey;
  import com.cloudframe.app.mcissues.dto.Ip90354L1Ctlmtifunc;
  import com.cloudframe.app.mcissues.dto.Ip90354L1CtldataInd;
  import com.cloudframe.app.global.sharedvar.Ip2ooo1ErrorInfoTable;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.mcissues.dto.Ip66601UserTagTable;
  import java.util.ArrayList;
  import com.cloudframe.app.data.Field;
  import java.util.Map;
  import java.util.HashMap;
  import java.math.BigDecimal;
  import com.cloudframe.app.global.sharedvar.Ip40004FileIdFinan;
  import com.cloudframe.app.global.sharedvar.Ip40004FinStatRec;
  import com.cloudframe.app.global.sharedvar.Cf20004Data;
  import com.cloudframe.app.mcissues.dto.Ip43501SortSolution;
  import com.cloudframe.app.mcissues.dto.Report1HeadingLine11701;
  import com.cloudframe.app.mcissues.dto.DtlCntZ800;
  import com.cloudframe.app.exception.Terminate;
  import java.math.RoundingMode;
  import com.cloudframe.app.mcissues.dto.*;
  import com.cloudframe.app.mcissues.dto.Sys295EffDateGroup;
  import com.cloudframe.app.mcissues.dto.DtlCnt800;
  import com.cloudframe.app.mcissues.dto.DtlRecord4800;
  import com.cloudframe.app.mcissues.dto.DtlRecord3800;
  import com.cloudframe.app.mcissues.dto.C;
  import com.cloudframe.app.mcissues.dto.Ip500041Rec;
  import com.cloudframe.app.mcissues.dto.ErrorInfoTableDefault315;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.global.sharedvar.Cf20004TableData;
  import com.cloudframe.app.mcissues.dto.Ip43501ErrorInfoRec;
  import com.cloudframe.app.mcissues.dto.Holidays500;
  import com.cloudframe.app.mcissues.dto.Grp1;
  import com.cloudframe.app.mcissues.dto.SortKeyLthTable700;
  import com.cloudframe.app.mcissues.dto.InputVars800;
  import com.cloudframe.app.global.sharedvar.Ip31021SummaryControlCard;
  import com.cloudframe.app.global.sharedvar.Ip66102IpmMsg;
  import com.cloudframe.app.mcissues.dto.Ip90354MasterRec;
  import com.cloudframe.app.mcissues.dto.PeVersionNumMsg600;
  import com.cloudframe.app.global.sharedvar.Cf50005ClearingGrp;
  import com.cloudframe.app.mcissues.dto.A;
  import com.cloudframe.app.mcissues.dto.Group;
  import com.cloudframe.app.mcissues.dto.Ip503011TblEffDateRecord;
  import com.cloudframe.app.mcissues.dto.Date2;
  import com.cloudframe.app.mcissues.dto.AbBusslBussiValues800;
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
  
  public class Mcissues extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Mcissues.class);
  
  private Sys295EffDateGroup sys295EffDateGroup = new Sys295EffDateGroup() ;
  private DtlCnt800 dtlCnt800 = new DtlCnt800() ;
  private DtlRecord4800 dtlRecord4800 = new DtlRecord4800() ;
  private DtlRecord3800 dtlRecord3800 = new DtlRecord3800() ;
  private C c = new C() ;
  private Ip500041Rec ip500041Rec = new Ip500041Rec() ;
  private ErrorInfoTableDefault315 errorInfoTableDefault315 = new ErrorInfoTableDefault315() ;
  private Ip43501ErrorInfoRec ip43501ErrorInfoRec = new Ip43501ErrorInfoRec() ;
  private Holidays500 holidays500 = new Holidays500() ;
  private Grp1 grp1 = new Grp1() ;
  private SortKeyLthTable700 sortKeyLthTable700 = new SortKeyLthTable700() ;
  private InputVars800 inputVars800 = new InputVars800() ;
  private Ip90354MasterRec ip90354MasterRec = new Ip90354MasterRec() ;
  private PeVersionNumMsg600 peVersionNumMsg600 = new PeVersionNumMsg600() ;
  private A a = new A() ;
  private Group group = new Group() ;
  private Ip503011TblEffDateRecord ip503011TblEffDateRecord = new Ip503011TblEffDateRecord() ;
  private Date2 date2 = new Date2() ;
  private AbBusslBussiValues800 abBusslBussiValues800 = new AbBusslBussiValues800() ;
  private Ip33701TargetCurExp9Group ip33701TargetCurExp9Group = new Ip33701TargetCurExp9Group() ;
  private EmptyIndexGroup800 emptyIndexGroup800 = new EmptyIndexGroup800() ;
  private MapRow1ValGroup800 mapRow1ValGroup800 = new MapRow1ValGroup800() ;
  private InterimDateXGroup800 interimDateXGroup800 = new InterimDateXGroup800() ;
  private PreEditVersionGroup300 preEditVersionGroup300 = new PreEditVersionGroup300() ;
  private InxBGroup inxBGroup = new InxBGroup() ;
  private Ip66601UserTagInformation ip66601UserTagInformation = new Ip66601UserTagInformation() ;
  private Ip00485MemberEntryInfo ip00485MemberEntryInfo = new Ip00485MemberEntryInfo() ;
  private ClearingDtTm9Grp900 clearingDtTm9Grp900 = new ClearingDtTm9Grp900() ;
  private ClearingDtTm9ShortGrp900 clearingDtTm9ShortGrp900 = new ClearingDtTm9ShortGrp900() ;
  private TableArray tableArray = new TableArray() ;
  private Work work = new Work() ;
  
  
  
  @Autowired 
  @Qualifier("global_cf20004TableData")
  Cf20004TableData cf20004TableData;
  @Autowired 
  @Qualifier("global_ip31021SummaryControlCard")
  Ip31021SummaryControlCard ip31021SummaryControlCard;
  @Autowired 
  @Qualifier("global_ip66102IpmMsg")
  Ip66102IpmMsg ip66102IpmMsg;
  @Autowired 
  @Qualifier("global_cf50005ClearingGrp")
  Cf50005ClearingGrp cf50005ClearingGrp;
  @Autowired 
  @Qualifier("global_ip2ooo1EditWorkRecord")
  Ip2ooo1EditWorkRecord ip2ooo1EditWorkRecord;
  @Autowired 
  @Qualifier("global_ip3oo8o1EditsPerfTbl")
  Ip3oo8o1EditsPerfTbl ip3oo8o1EditsPerfTbl;
  @Autowired 
  @Qualifier("global_ip655o4CurrentTagTable")
  Ip655o4CurrentTagTable ip655o4CurrentTagTable;
  @Autowired 
  @Qualifier("global_ip655o4TcntGroup")
  Ip655o4TcntGroup ip655o4TcntGroup;
  @Autowired 
  @Qualifier("global_ip40004IntMsgHdrRecGroup")
  Ip40004IntMsgHdrRecGroup ip40004IntMsgHdrRecGroup;
  
  
  private static final int IP66601_USER_TAG_LENGTH = 13;
  private static final int TABLE_ITEM_LENGTH = 8;
  
  int ip00485MemberIdx;
  int ip66601UserRight;
  int subIdx400;
  int ip66601UserStart;
  int ip655o4T;
  int ip66601UserMedian;
  int holidayIndex500;
  int dtlIdx;
  int ip66601UserT;
  int inxC;
  int inxD;
  int ip3oo8o1Idx;
  int ip66601UserEnd;
  int index800;
  int ip66601UserP;
  int ip66601UserLeft;
  int inxA;
  
  
  
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
//  PERFORM 0000-MAIN
          main();/*0000-MAIN*/
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
      * main 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAIN COBOL Cyclomatic complexity - 232
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void main() throws Exception {
//  PERFORM 0000-MAIN-SPLIT0
          mainSplit0();/*0000-MAIN-SPLIT0*/
//  PERFORM 0000-MAIN-SPLIT1
          mainSplit1();/*0000-MAIN-SPLIT1*/
//  PERFORM 0000-MAIN-SPLIT2
          mainSplit2();/*0000-MAIN-SPLIT2*/
//  PERFORM 0000-MAIN-SPLIT3
          mainSplit3();/*0000-MAIN-SPLIT3*/
//  PERFORM 0000-MAIN-SPLIT4
          mainSplit4();/*0000-MAIN-SPLIT4*/
//  PERFORM 0000-MAIN-SPLIT5
          mainSplit5();/*0000-MAIN-SPLIT5*/
      
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
      private void mainSplit0() throws Exception {
			// Declare local variables used in the method
			Ip90354TableDataKey ip90354TableDataKey = ip90354MasterRec.getIp90354TableData().getIp90354TableDataKey();
			Ip90354L1Ctlmtifunc ip90354L1Ctlmtifunc = ip90354MasterRec.getIp90354TableData().getIp90354TableDataKey().getIp90354L1Ctlmtifunc();
			Ip90354L1CtldataInd ip90354L1CtldataInd = ip90354MasterRec.getIp90354TableData().getIp90354TableDataKey().getIp90354L1CtldataInd();
			char[] ip503011TableId = null;
			Ip2ooo1ErrorInfoTable ip2ooo1ErrorInfoTable = ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable();
			// End of variable declaration


// *
// * This is a copy of mc066
// *
          // MOVE '20201123' TO WS-DATE
          work.setDateWs((long)20201123);
//  DISPLAY '* 1* WS-DATE = ' WS-DATE
          logger.info("* 1* WS-DATE = {}", String.valueOf(work.getDateWs())); 
          // MOVE WS-DATE TO SYS295-EFF-DATE (1 : 8)
          sys295EffDateGroup.setSys295EffDate(replace(sys295EffDateGroup.getSys295EffDateString(),work.getDateWsString(),0,8));
          // MOVE 14 TO SYS295-EFF-DATE (9 : 2)
          //  LITERAL_14 = 14
          sys295EffDateGroup.setSys295EffDate(replace(sys295EffDateGroup.getSys295EffDateString(),CONSTANTS.LITERAL_14,8,10));
//  DISPLAY '* 2* SYS295-EFF-DATE = ' SYS295-EFF-DATE
          logger.info("* 2* SYS295-EFF-DATE = {}", String.valueOf(sys295EffDateGroup.getSys295EffDate())); 

// *
// * This is a copy of mc066
// *
          // MOVE 5 TO IP20004-ITEM-LENGTH
          work.setIp20004ItemLength((short)5);
//  DISPLAY '* 3*  IP20004-ITEM-LENGTH  = ' IP20004-ITEM-LENGTH
          logger.info("* 3*  IP20004-ITEM-LENGTH  = {}", String.valueOf(work.getIp20004ItemLength())); 

// *
//  DIVIDE IP20004-ITEM-LENGTH BY 2 GIVING IP20004-ITEM-LENGTH REMAINDER 800-TMP-LTH
          work.setTmpLth800( (short) (work.getIp20004ItemLength()%2));
          work.setIp20004ItemLength( (short) (work.getIp20004ItemLength()/2));

// *
//  DISPLAY '* 4*  IP20004-ITEM-LENGTH  = ' IP20004-ITEM-LENGTH
          logger.info("* 4*  IP20004-ITEM-LENGTH  = {}", String.valueOf(work.getIp20004ItemLength())); 
//  DISPLAY '* 5*  800-TMP-LTH          = ' 800-TMP-LTH
          logger.info("* 5*  800-TMP-LTH          = {}", String.valueOf(work.getTmpLth800())); 

// *
          // MOVE 5 TO IP20004-ITEM-LENGTH
          work.setIp20004ItemLength((short)5);
//  DISPLAY '* 6*  IP20004-ITEM-LENGTH  = ' IP20004-ITEM-LENGTH
          logger.info("* 6*  IP20004-ITEM-LENGTH  = {}", String.valueOf(work.getIp20004ItemLength())); 

// *
//  DIVIDE IP20004-ITEM-LENGTH BY 2 GIVING 800-TMP-LTH REMAINDER IP20004-ITEM-LENGTH
          work.setTmpLth800( (short) (work.getIp20004ItemLength()/2));
          work.setIp20004ItemLength( (short) (work.getIp20004ItemLength()%2));

// *
//  DISPLAY '* 7*  IP20004-ITEM-LENGTH  = ' IP20004-ITEM-LENGTH
          logger.info("* 7*  IP20004-ITEM-LENGTH  = {}", String.valueOf(work.getIp20004ItemLength())); 
//  DISPLAY '* 8*  800-TMP-LTH          = ' 800-TMP-LTH
          logger.info("* 8*  800-TMP-LTH          = {}", String.valueOf(work.getTmpLth800())); 

// *
// * This is a copy of mc069 (set modified missing)
// *
          // MOVE 5 TO IP90354-L1-CTL-TABLE-TYPE
          ip90354MasterRec.getIp90354TableData().getIp90354TableDataKey().setIp90354L1CtlTableType(5);
  
          // MOVE 1214 TO IP90354-L1-CTLMTI
          ip90354MasterRec.getIp90354TableData().getIp90354TableDataKey().getIp90354L1Ctlmtifunc().setIp90354L1Ctlmti(1214);
  
          // MOVE 456 TO IP90354-L1-CTLFUNC
          ip90354MasterRec.getIp90354TableData().getIp90354TableDataKey().getIp90354L1Ctlmtifunc().setIp90354L1Ctlfunc(456);
  
          // MOVE 111 TO IP90354-L1-IND-FLD
          ip90354MasterRec.getIp90354TableData().getIp90354TableDataKey().getIp90354L1CtldataInd().setIp90354L1IndFld(111);
  
//  MOVE 'A' TO IP90354-L1-CTLDATA
//  LITERAL_A = 'A'
          ip90354TableDataKey.setIp90354L1Ctldata(CONSTANTS.LITERAL_A_B25_);
  
//  MOVE 'B' TO IP90354-L1-CTLEXCLUSIONIND
//  LITERAL_B = 'B'
          ip90354TableDataKey.setIp90354L1Ctlexclusionind(CONSTANTS.LITERAL_B);
  
          // MOVE IP90354-MASTER-REC (1 : 100) TO WS-DISPLAY (1 : 100)
          work.setDisplay(replace(work.getDisplay(),substring(ip90354MasterRec.getCharArray(),0,100),0,100));
//  DISPLAY '* 9* WS-DISPLAY = ' WS-DISPLAY
          logger.info("* 9* WS-DISPLAY = {}", new String(work.getDisplay())); 
          // MOVE 5 TO IP90354-L1-CTL-TABLE-TYPE
          ip90354MasterRec.getIp90354TableData().getIp90354TableDataKey().setIp90354L1CtlTableType(5);
  
          // MOVE 1224 TO IP90354-L1-CTLMTI
          ip90354MasterRec.getIp90354TableData().getIp90354TableDataKey().getIp90354L1Ctlmtifunc().setIp90354L1Ctlmti(1224);
  
          // MOVE 200 TO IP90354-L1-CTLFUNC
          ip90354MasterRec.getIp90354TableData().getIp90354TableDataKey().getIp90354L1Ctlmtifunc().setIp90354L1Ctlfunc(200);
  
          // MOVE 111 TO IP90354-L1-IND-FLD
          ip90354MasterRec.getIp90354TableData().getIp90354TableDataKey().getIp90354L1CtldataInd().setIp90354L1IndFld(111);
  
//  MOVE 'A' TO IP90354-L1-CTLDATA
//  LITERAL_A = 'A'
          ip90354TableDataKey.setIp90354L1Ctldata(CONSTANTS.LITERAL_A_B25_);
  
//  MOVE 'B' TO IP90354-L1-CTLEXCLUSIONIND
//  LITERAL_B = 'B'
          ip90354TableDataKey.setIp90354L1Ctlexclusionind(CONSTANTS.LITERAL_B);
  
          // MOVE IP90354-MASTER-REC (1 : 100) TO WS-DISPLAY (1 : 100)
          work.setDisplay(replace(work.getDisplay(),substring(ip90354MasterRec.getCharArray(),0,100),0,100));
//  DISPLAY '*10* WS-DISPLAY = ' WS-DISPLAY
          logger.info("*10* WS-DISPLAY = {}", new String(work.getDisplay())); 

// *
// * This is a copy of mc070
// *
//  MOVE 'IP5005T1' TO IP503011-TABLE-ID
//  LITERAL_IP5005T1 = 'IP5005T1'
          ip503011TblEffDateRecord.setIp503011TableId(CONSTANTS.LITERAL_IP5005T1);
          // MOVE '20201130' TO IP503011-TBL-EFF-DATE
          ip503011TblEffDateRecord.setIp503011TblEffDate((long)20201130);
//  DISPLAY '*12* ' IP503011-TBL-EFF-DATE-RECORD
          logger.info("*12* {}", ip503011TblEffDateRecord.toString()); 
//  DISPLAY '*13* MOVING 9999 TO IP503011-TABLE-ID'
          logger.info("*13* MOVING 9999 TO IP503011-TABLE-ID"); 
          // MOVE 9999 TO IP503011-TABLE-ID
          //  LITERAL_9999 = 9999
          ip503011TblEffDateRecord.setIp503011TableId(CONSTANTS.LITERAL_9999);
//  DISPLAY '*14* IP503011-TABLE-ID = ' IP503011-TABLE-ID
          logger.info("*14* IP503011-TABLE-ID = {}", new String(ip503011TblEffDateRecord.getIp503011TableId())); 
          ip503011TableId = ip503011TblEffDateRecord.getIp503011TableId();
//  IF IP503011-TABLE-ID = 9999 THEN
//  LITERAL_9999 = 9999
          if (compareChars(ip503011TableId,CONSTANTS.LITERAL_9999_B4_) == 0) { 
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
          group.setString(CONSTANTS.LITERAL_AAAABBBBCCCCDDDDEEEE);
//  SET DTL-IDX TO WS-ONE
          dtlIdx = work.getOne(); 
          
//  DISPLAY '*17* 500-DATA(1) =  ' 500-DATA ( DTL-IDX )
          logger.info("*17* 500-DATA(1) =  {}", new String(group.getGroup500(dtlIdx - 1).getData500())); 
//  SET DTL-IDX UP BY WS-FOUR
          dtlIdx = dtlIdx + work.getFour(); 
          
//  DISPLAY '*18* 500-DATA(4) =  ' 500-DATA ( DTL-IDX )
          logger.info("*18* 500-DATA(4) =  {}", new String(group.getGroup500(dtlIdx - 1).getData500())); 
//  SET DTL-IDX DOWN BY WS-TWO
          dtlIdx = dtlIdx - work.getTwo(); 
          
//  DISPLAY '*19* 500-DATA(2) =  ' 500-DATA ( DTL-IDX )
          logger.info("*19* 500-DATA(2) =  {}", new String(group.getGroup500(dtlIdx - 1).getData500())); 

// *
// * This is a copy of ml001
// *
          // MOVE 'A' TO WS-COND
          //  LITERAL_A = 'A'
          work.setCond(CONSTANTS.LITERAL_A);
//  EVALUATE TRUE
          if  (( work.isCondA()  ) || ( work.isCondB()  ) || ( work.isCondC()  )) { 
//  DISPLAY '*20* WS-COND = ' WS-COND
              logger.info("*20* WS-COND = {}", new String(work.getCond())); 
          }
          else   { 
//  DISPLAY '*20* **ERROR**'
              logger.info("*20* **ERROR**"); 
          }

// *
//  EVALUATE TRUE
          if  (( work.isCondA()  ) || ( work.isCondB()  ) || ( work.isCondC()  ) || ( work.isCondD()  )) { 
//  DISPLAY '*21* WS-COND = ' WS-COND
              logger.info("*21* WS-COND = {}", new String(work.getCond())); 
          }
          else   { 
//  DISPLAY '*21* **ERROR**'
              logger.info("*21* **ERROR**"); 
          }

// *
//  EVALUATE TRUE
          if  (( work.isCondA()  ) || ( work.isCondB()  )) { 
//  DISPLAY '*22* WS-COND = ' WS-COND
              logger.info("*22* WS-COND = {}", new String(work.getCond())); 
          }
          else if  (( work.isCondC()  ) || ( work.isCondD()  )) { 
//  DISPLAY '*22* **ERROR**'
              logger.info("*22* **ERROR**"); 
          }
          else   { 
//  DISPLAY '*22* **ERROR**'
              logger.info("*22* **ERROR**"); 
          }

// *
//  EVALUATE TRUE
          if  (( work.isCondA()  ) || ( work.isCondB()  ) || ( work.isCondC()  ) || ( work.isCondD()  ) || ( work.isCondE()  ) || ( work.isCondF()  ) || ( work.isCondG()  )) { 
//  DISPLAY '*23* WS-COND = ' WS-COND
              logger.info("*23* WS-COND = {}", new String(work.getCond())); 
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
          ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().setString(errorInfoTableDefault315.getCharArray());

// *
//  PERFORM VARYING WS-IDX FROM 1 BY 1 UNTIL WS-IDX > 10
          for (work.setIdx(1); (	( work.getIdx() <= 10 )) ; work.setIdx(work.getIdx() + 1) ) {
//  DISPLAY '*24* IP2OOO1-ERROR-TYPE(' WS-IDX ') = ' IP2OOO1-ERROR-TYPE ( WS-IDX )
              logger.info("*24* IP2OOO1-ERROR-TYPE({}) = {}", String.valueOf(work.getIdx()), String.valueOf(ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(work.getIdx() - 1).getIp2ooo1ErrorType())); 
//  DISPLAY '*25* IP2OOO1-ERROR-INDEX(' WS-IDX ') = ' IP2OOO1-ERROR-INDEX ( WS-IDX )
              logger.info("*25* IP2OOO1-ERROR-INDEX({}) = {}", String.valueOf(work.getIdx()), ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(work.getIdx() - 1).getIp2ooo1ErrorInfo().getIp2ooo1ErrorIndex().toString()); 
//  DISPLAY '*26* IP2OOO1-ERROR-MSG-SEV-CD(' WS-IDX ') = ' IP2OOO1-ERROR-MSG-SEV-CD ( WS-IDX )
              logger.info("*26* IP2OOO1-ERROR-MSG-SEV-CD({}) = {}", String.valueOf(work.getIdx()), String.valueOf(ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(work.getIdx() - 1).getIp2ooo1ErrorInfo().getIp2ooo1ErrorIndex().getIp2ooo1ErrorMsgSevCd())); 
//  DISPLAY '*27* IP2OOO1-ERROR-NUMBER(' WS-IDX ') = ' IP2OOO1-ERROR-NUMBER ( WS-IDX )
              logger.info("*27* IP2OOO1-ERROR-NUMBER({}) = {}", String.valueOf(work.getIdx()), String.valueOf(ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(work.getIdx() - 1).getIp2ooo1ErrorInfo().getIp2ooo1ErrorIndex().getIp2ooo1ErrorNumber())); 
//  DISPLAY '*28* IP2OOO1-ERROR-MSG-NUMBER(' WS-IDX ') = ' IP2OOO1-ERROR-MSG-NUMBER ( WS-IDX )
              logger.info("*28* IP2OOO1-ERROR-MSG-NUMBER({}) = {}", String.valueOf(work.getIdx()), String.valueOf(ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(work.getIdx() - 1).getIp2ooo1ErrorInfo().getIp2ooo1ErrorMsgNumber())); 
//  DISPLAY '*29* IP2OOO1-IPM-FIELD-TYPE(' WS-IDX ') = ' IP2OOO1-IPM-FIELD-TYPE ( WS-IDX )
              logger.info("*29* IP2OOO1-IPM-FIELD-TYPE({}) = {}", String.valueOf(work.getIdx()), new String(ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(work.getIdx() - 1).getIp2ooo1ErrorInfo().getIp2ooo1IpmFieldType())); 
//  DISPLAY '*30* IP2OOO1-IPM-FIELD-NUMBER(' WS-IDX ') = ' IP2OOO1-IPM-FIELD-NUMBER ( WS-IDX )
              logger.info("*30* IP2OOO1-IPM-FIELD-NUMBER({}) = {}", String.valueOf(work.getIdx()), String.valueOf(ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(work.getIdx() - 1).getIp2ooo1ErrorInfo().getIp2ooo1IpmFieldNumber())); 
//  DISPLAY '*31* IP2OOO1-IPM-SUBFLD-NUMBER(' WS-IDX ') = ' IP2OOO1-IPM-SUBFLD-NUMBER ( WS-IDX )
              logger.info("*31* IP2OOO1-IPM-SUBFLD-NUMBER({}) = {}", String.valueOf(work.getIdx()), String.valueOf(ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(work.getIdx() - 1).getIp2ooo1ErrorInfo().getIp2ooo1IpmSubfldNumber())); 
//  DISPLAY '*32* IP2OOO1-REPL-TEXT(' WS-IDX ',1) = ' IP2OOO1-REPL-TEXT ( WS-IDX ,1)
              logger.info("*32* IP2OOO1-REPL-TEXT({},1) = {}", String.valueOf(work.getIdx()), new String(ip2ooo1EditWorkRecord.getIp2ooo1ErrorInfoTable().getIp2ooo1TableEntries(work.getIdx() - 1).getIp2ooo1ReplText(0))); 
//  IF IP2OOO1-REPL-TEXT ( WS-IDX ,2) = SPACES
              if (        ( allSpaces(ip2ooo1ErrorInfoTable.getIp2ooo1TableEntries(work.getIdx() - 1).getIp2ooo1ReplText(1))   )) { 
//  DISPLAY '*33* IP2OOO1-REPL-TEXT(' WS-IDX ',2) = ' 'SPACES'
                  logger.info("*33* IP2OOO1-REPL-TEXT({},2) = SPACES", String.valueOf(work.getIdx())); 
              }
  
//  ELSE
              else { 
//  DISPLAY '*34* IP2OOO1-REPL-TEXT(' WS-IDX ',2) = ' 'NOT SPACES'
                  logger.info("*34* IP2OOO1-REPL-TEXT({},2) = NOT SPACES", String.valueOf(work.getIdx())); 
              }
//  IF IP2OOO1-REPL-TEXT ( WS-IDX ,3) = SPACES
              if (        ( allSpaces(ip2ooo1ErrorInfoTable.getIp2ooo1TableEntries(work.getIdx() - 1).getIp2ooo1ReplText(2))   )) { 
//  DISPLAY '*35* IP2OOO1-REPL-TEXT(' WS-IDX ',3) = ' 'SPACES'
                  logger.info("*35* IP2OOO1-REPL-TEXT({},3) = SPACES", String.valueOf(work.getIdx())); 
              }
  
//  ELSE
              else { 
//  DISPLAY '*36* IP2OOO1-REPL-TEXT(' WS-IDX ',3) = ' 'NOT SPACES'
                  logger.info("*36* IP2OOO1-REPL-TEXT({},3) = NOT SPACES", String.valueOf(work.getIdx())); 
              }
          }
      
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
      private void mainSplit1() throws Exception {
			// Declare local variables used in the method
			Ip66601UserTagTable ip66601UserTagTable = ip66601UserTagInformation.getIp66601UserTagTable();
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			// End of variable declaration


// *
          // MOVE '20201112' TO WS-DATE-2-1
          //  LITERAL_20201112 = '20201112'
          date2.setDate21(CONSTANTS.LITERAL_20201112);
          // MOVE '24' TO WS-DATE-2-2
          //  LITERAL_24 = '24'
          date2.setDate22(CONSTANTS.LITERAL_24);
          // MOVE WS-DATE-2 TO WS-DATE-3
          work.replace(padSpaces(12,date2.toCharArray()), /* beginIndex */16, /* length */12);
//  DISPLAY '*37* WS-DATE-2         = ' WS-DATE-2
          logger.info("*37* WS-DATE-2         = {}", date2.toString()); 
//  DISPLAY '*38* WS-DATE-3         = ' WS-DATE-3
          logger.info("*38* WS-DATE-3         = {}", String.valueOf(work.getDate3())); 
          // MOVE WS-DATE-3 TO SYS295-EFF-DATE-2
          work.setSys295EffDate2(work.getDate3String());
//  DISPLAY '*39* SYS295-EFF-DATE-2 = ' SYS295-EFF-DATE-2
          logger.info("*39* SYS295-EFF-DATE-2 = {}", new String(work.getSys295EffDate2())); 

// *
//  INITIALIZE IP3OO8O1-EDITS-INIT-STR
          ip3oo8o1EditsPerfTbl.setIp3oo8o1EditsInitStr(CONSTANTS.SPACE_4000 /* Fill 4000 Spaces*/);
//  MOVE IP3OO8O1-EDITS-INIT-STR TO IP3OO8O1-EDITS-HOLDER
          ip3oo8o1EditsPerfTbl.setIp3oo8o1EditsHolder(ip3oo8o1EditsPerfTbl.getIp3oo8o1EditsInitStr());
//  SET IP3OO8O1-IDX TO 435
          ip3oo8o1Idx = 435; 
          
//  IF 88-IP3OO8O1-EDIT-NOT-PERFORMED ( IP3OO8O1-IDX )
          if ( ip3oo8o1EditsPerfTbl.getIp3oo8o1EditsPerfEntry().isIp3oo8o1EditNotPerformed88((ip3oo8o1Idx - 1))  ) { 
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
          ip655o4T = 2; 
          
//  SET IP655O4-TCNT , IP66601-USER-TCNT TO IP655O4-T
          ip655o4TcntGroup.setIp655o4Tcnt((short) ip655o4T); 
          
          ip66601UserTagInformation.setIp66601UserTcnt((short) ip655o4T); 
          
//  DISPLAY '*42* IP655O4-TCNT      = ' IP655O4-TCNT
          logger.info("*42* IP655O4-TCNT      = {}", String.valueOf(ip655o4TcntGroup.getIp655o4Tcnt())); 
//  DISPLAY '*43* IP66601-USER-TCNT = ' IP66601-USER-TCNT
          logger.info("*43* IP66601-USER-TCNT = {}", String.valueOf(ip66601UserTagInformation.getIp66601UserTcnt())); 

// *
// *
// * Populate ip66601-user-tag-table
// *
//  PERFORM VARYING WS-IDX FROM 1 BY 1 UNTIL WS-IDX > 10
          for (work.setIdx(1); (	( work.getIdx() <= 10 )) ; work.setIdx(work.getIdx() + 1) ) {
              // MOVE WS-IDX TO IP66601-USER-TAG-TYPE ( WS-IDX )
              ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagType((short) work.getIdx());
              ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagNo((short) (work.getIdx() * 10));
              ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).getIp66601UserTagId().setIp66601UserTagOccurrence((short) (work.getIdx() * 11));
              ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).getIp66601UserTagId().setIp66601UserTagSubfldNo((short) (work.getIdx() * 12));
              ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).setIp66601UserTagStart((short) (work.getIdx() * 13));
              ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).setIp66601UserTagLngth((short) (work.getIdx() * 14));
              // MOVE 'A' TO IP66601-USER-TAG-STATUS ( WS-IDX )
              //  LITERAL_A = 'A'
              ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).setIp66601UserTagStatus(CONSTANTS.LITERAL_A);
          }

// *
//  SET IP66601-USER-T , IP66601-USER-P TO 1
          ip66601UserT = 1; 
          
          ip66601UserP = 1; 
          
//  SET IP66601-USER-LEFT TO 1
          ip66601UserLeft = 1; 
          
//  SET IP66601-USER-RIGHT TO 10
          ip66601UserRight = 10; 
          
//  SET IP66601-USER-MEDIAN TO 5
          ip66601UserMedian = 5; 
          
//  SET IP66601-USER-START TO 6
          ip66601UserStart = 6; 
          
//  SET IP66601-USER-END TO 7
          ip66601UserEnd = 7; 
          
//  SET IP66601-USER-P TO 1
          ip66601UserP = 1; 
          

// *
//  MOVE IP66601-USER-TAG ( IP66601-USER-T ) TO IP66601-USER-TAG (11)
          ip66601UserTagInformation.getIp66601UserTagTable().setIp66601UserTag(10,ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).toCharArray());

// *
//  IF IP66601-USER-TAG ( IP66601-USER-MEDIAN ) > IP66601-USER-TAG ( IP66601-USER-LEFT )
          if (		compareChars(ip66601UserTagTable.getIp66601UserTag(ip66601UserMedian - 1),ip66601UserTagTable.getIp66601UserTag(ip66601UserLeft - 1)) > 0 ) { 
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
          if (		compareChars(ip66601UserTagTable.getIp66601UserTag(ip66601UserStart - 1),ip66601UserTagTable.getIp66601UserTag(ip66601UserEnd - 1)) < 0 ) { 
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
          ip66601UserP = 11; 
          
//  IF IP66601-USER-TAG ( IP66601-USER-T ) = IP66601-USER-TAG ( IP66601-USER-P )
          if (		compareChars(ip66601UserTagTable.getIp66601UserTag(ip66601UserT - 1),ip66601UserTagTable.getIp66601UserTag(ip66601UserP - 1)) == 0 ) { 
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
          if (		compareChars(ip66601UserTagTable.getIp66601UserTag(ip66601UserMedian - 1),ip66601UserTagTable.getIp66601UserTag(ip66601UserEnd - 1)) <= 0 ) { 
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
          if (		compareChars(ip66601UserTagTable.getIp66601UserTag(ip66601UserMedian - 1),ip66601UserTagTable.getIp66601UserTag(ip66601UserEnd - 1)) <= 0 ) { 
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
          if (		compareChars(ip66601UserTagTable.getIp66601UserTag(ip66601UserRight - 1),ip66601UserTagTable.getIp66601UserTag(ip66601UserLeft - 1)) >= 0 ) { 
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
          if (		compareChars(ip66601UserTagTable.getIp66601UserTag(ip66601UserRight - 1),ip66601UserTagTable.getIp66601UserTag(ip66601UserLeft - 1)) >= 0 ) { 
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
          ip66601UserP = 12; 
          
//  IF IP66601-USER-TAG ( IP66601-USER-T ) = IP66601-USER-TAG ( IP66601-USER-P )
          if (		compareChars(ip66601UserTagTable.getIp66601UserTag(ip66601UserT - 1),ip66601UserTagTable.getIp66601UserTag(ip66601UserP - 1)) == 0 ) { 
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
          ip66601UserP = 12; 
          
//  IF IP66601-USER-TAG ( IP66601-USER-T ) NOT = IP66601-USER-TAG ( IP66601-USER-P )
          if (		compareChars(ip66601UserTagTable.getIp66601UserTag(ip66601UserT - 1),ip66601UserTagTable.getIp66601UserTag(ip66601UserP - 1)) != 0 ) { 
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
          logger.info("*58* 300-XML-TAG   = {}", new String(work.getXmlTag300())); 
//  DISPLAY '*59* 300-XML-DATA  = ' 300-XML-DATA
          logger.info("*59* 300-XML-DATA  = {}", new String(work.getXmlData300())); 
          // MOVE SPACES TO 300-XML-STR
          work.setXmlStr300(CONSTANTS.SPACE_80);
//  STRING 300-XML-TAG 300-XML-DATA X'0D' DELIMITED BY SIZE INTO 300-XML-STR END-STRING
          charArray = new ArrayList<char[]>();
             charArray.add(work.getXmlTag300());
             charArray.add(work.getXmlData300());
             charArray.add(CONSTANTS.HEX_0D);
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2));
          updated = updateString(work.getXmlStr300() ,joinCharArray);
          work.setXmlStr300(  (char[])updated.get("string"));
//  DISPLAY '*60* 300-XML-STR   = ' 300-XML-STR
          logger.info("*60* 300-XML-STR   = {}", new String(work.getXmlStr300())); 

// *
//  DISPLAY '*61* 300-XML-TAG2  = ' 300-XML-TAG2
          logger.info("*61* 300-XML-TAG2  = {}", new String(work.getXmlTag2300())); 
//  DISPLAY '*62* 300-XML-DATA  = ' 300-XML-DATA
          logger.info("*62* 300-XML-DATA  = {}", new String(work.getXmlData300())); 
          // MOVE SPACES TO 300-XML-STR
          work.setXmlStr300(CONSTANTS.SPACE_80);
//  STRING 300-XML-TAG2 300-XML-DATA DELIMITED BY SIZE INTO 300-XML-STR END-STRING
          charArray = new ArrayList<char[]>();
             charArray.add(work.getXmlTag2300());
             charArray.add(work.getXmlData300());
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
          updated = updateString(work.getXmlStr300() ,joinCharArray);
          work.setXmlStr300(  (char[])updated.get("string"));
//  DISPLAY '*63* 300-XML-STR   = ' 300-XML-STR
          logger.info("*63* 300-XML-STR   = {}", new String(work.getXmlStr300())); 

// *
//  DISPLAY '*64* 300-XML-TAG3  = ' 300-XML-TAG3
          logger.info("*64* 300-XML-TAG3  = {}", new String(work.getXmlTag3300())); 
//  DISPLAY '*65* 300-XML-DATA  = ' 300-XML-DATA
          logger.info("*65* 300-XML-DATA  = {}", new String(work.getXmlData300())); 
          // MOVE SPACES TO 300-XML-STR
          work.setXmlStr300(CONSTANTS.SPACE_80);
//  STRING 300-XML-TAG3 300-XML-DATA DELIMITED BY SIZE INTO 300-XML-STR END-STRING
          charArray = new ArrayList<char[]>();
             charArray.add(work.getXmlTag3300());
             charArray.add(work.getXmlData300());
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
          updated = updateString(work.getXmlStr300() ,joinCharArray);
          work.setXmlStr300(  (char[])updated.get("string"));
//  DISPLAY '*66* 300-XML-STR   = ' 300-XML-STR
          logger.info("*66* 300-XML-STR   = {}", new String(work.getXmlStr300())); 

// *
//  DISPLAY '*67* 300-XML-TAG4  = ' 300-XML-TAG4
          logger.info("*67* 300-XML-TAG4  = {}", new String(work.getXmlTag4300())); 
//  DISPLAY '*68* 300-XML-DATA  = ' 300-XML-DATA
          logger.info("*68* 300-XML-DATA  = {}", new String(work.getXmlData300())); 
          // MOVE SPACES TO 300-XML-STR
          work.setXmlStr300(CONSTANTS.SPACE_80);
//  STRING 300-XML-TAG4 300-XML-DATA DELIMITED BY SIZE INTO 300-XML-STR END-STRING
          charArray = new ArrayList<char[]>();
             charArray.add(work.getXmlTag4300());
             charArray.add(work.getXmlData300());
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
          updated = updateString(work.getXmlStr300() ,joinCharArray);
          work.setXmlStr300(  (char[])updated.get("string"));
//  DISPLAY '*69* 300-XML-STR   = ' 300-XML-STR
          logger.info("*69* 300-XML-STR   = {}", new String(work.getXmlStr300())); 

// *
//  IF 88-IP33701-SRC-TO-TRG-SAME THEN
          if ( work.isIp33701SrcToTrgSame88()  ) { 
//  DISPLAY '*69* 88-IP33701-SRC-TO-TRG-SAME SET'
              logger.info("*69* 88-IP33701-SRC-TO-TRG-SAME SET"); 
          }
          // MOVE 5678.789 TO IP33701-RATE-SRC-TO-TRG
          work.setIp33701RateSrcToTrg(BigDecimal.valueOf(5678.789).setScale(7).setScale(7));
//  IF NOT 88-IP33701-SRC-TO-TRG-SAME THEN
          if (!(work.isIp33701SrcToTrgSame88()) ) { 
//  DISPLAY '*70* SUCCESS'
              logger.info("*70* SUCCESS"); 
          }
//  ELSE
          else { 
//  DISPLAY '*71* FAILURE'
              logger.info("*71* FAILURE"); 
          }
          // MOVE 5.678901 TO IP33701-RATE-SRC-TO-TRG
          work.setIp33701RateSrcToTrg(BigDecimal.valueOf(5.678901).setScale(7).setScale(7));

// *    If 88-ip33701-src-to-trg-range then
// *       display '*72* success'
// *    else
// *       display '*73* failure'
// *    end-if
// *
          // MOVE ZEROES TO 400-TOTAL-SUB-COUNT
          work.setTotalSubCount400((short) 0);
//  PERFORM VARYING 400-SUB-IDX FROM 300-VALUE-1 BY 300-VALUE-1 UNTIL 400-SUB-IDX > 300-VALUE-100
          for (subIdx400 = work.getValue1300(); (	( subIdx400 <= work.getValue100300() )) ; subIdx400 = subIdx400 + work.getValue1300() ) {
//  MOVE ZEROES TO 400-SUB-VALUE-COUNT ( 400-SUB-IDX )
              work.setSubValueCount400((subIdx400 - 1),(short) 0);
          }
      
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
      private void mainSplit2() throws Exception {
			// Declare local variables used in the method
			Ip40004FileIdFinan ip40004FileIdFinan = ip40004IntMsgHdrRecGroup.getIp40004IntMsgDtlRec().getIp40004MsgDatax().getIp40004FinStatRec().getIp40004FileIdFinan();
			Ip40004FinStatRec ip40004FinStatRec = ip40004IntMsgHdrRecGroup.getIp40004IntMsgDtlRec().getIp40004MsgDatax().getIp40004FinStatRec();
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			char[] ab800 = null;
			Map<String,Object> updated = null;
			Ip66601UserTagTable ip66601UserTagTable = ip66601UserTagInformation.getIp66601UserTagTable();
			int emptyIndex800 = 0;
			int searchLowPoint = 0;
			int searchMidPoint = 0;
			int searchHighPoint = 0;
			int searchCompare = 0;
			int bussi800 = 0;
			int bussl800 = 0;
			boolean keepSearching = true;
			int[] searchIndexes = null;
			// End of variable declaration


// *
          // MOVE 2 TO IP00321-REPL-TEXT-COUNT
          work.setIp00321ReplTextCount(2);
//  PERFORM 2100-FIND-MOVE-REPLACE-TEXT IP00321-REPL-TEXT-COUNT TIMES
          { 
            for (int index = 0; index < work.getIp00321ReplTextCount(); index++) {
               findMoveReplaceText();/*2100-FIND-MOVE-REPLACE-TEXT*/
               if (this.isProgramEnded()) {
                   return ;
               }
            }
          }

// *
//  PERFORM 2100-FIND-MOVE-REPLACE-TEXT THRU 2100-EXIT IP00321-REPL-TEXT-COUNT TIMES
          { 
            for (int index = 0; index < work.getIp00321ReplTextCount(); index++) {
               findMoveReplaceText();/*2100-FIND-MOVE-REPLACE-TEXT*/
               if (this.isProgramEnded()) {
                   return ;
               }
               exit();/*2100-EXIT*/
               if (this.isProgramEnded()) {
                   return ;
               }
            }
          }

// *
// * Mc102
// *
          // MOVE '002' TO IP40004-FIN-FILE-TYPE
          //  LITERAL_002 = '002'
          ip40004IntMsgHdrRecGroup.getIp40004IntMsgDtlRec().getIp40004MsgDatax().getIp40004FinStatRec().getIp40004FileIdFinan().setIp40004FinFileType(CONSTANTS.LITERAL_002);
  
          // MOVE 200202 TO IP40004-FIN-FILE-REF-DATE
          ip40004IntMsgHdrRecGroup.getIp40004IntMsgDtlRec().getIp40004MsgDatax().getIp40004FinStatRec().getIp40004FileIdFinan().setIp40004FinFileRefDate((long)200202);
  
          // MOVE '0000001500001' TO IP40004-FIN-PROCESSOR-ID
          //  LITERAL_0000001500001 = '0000001500001'
          ip40004IntMsgHdrRecGroup.getIp40004IntMsgDtlRec().getIp40004MsgDatax().getIp40004FinStatRec().getIp40004FileIdFinan().setIp40004FinProcessorId(CONSTANTS.LITERAL_0000001500001);
  
          // MOVE 1 TO IP40004-FIN-FILE-SEQ-NUM
          ip40004IntMsgHdrRecGroup.getIp40004IntMsgDtlRec().getIp40004MsgDatax().getIp40004FinStatRec().getIp40004FileIdFinan().setIp40004FinFileSeqNum((long)1);
  
          // MOVE 258 TO 800-STRT
          work.setStrt800((short)258);
          // MOVE IP40004-FILE-ID-FINAN TO IP66102-IPM-MSG ( 800-STRT : 25)
          ip66102IpmMsg.replace(ip40004IntMsgHdrRecGroup/*parent*/,60/*fromOffset - (ip40004FileIdFinan) */,25/*fromLen*/,0+(work.getStrt800() - 1)/*toOffset - (ip66102IpmMsg) */,25/*toLen*/);
  
//  DISPLAY 'IP66102-IPM-MSG(800-STRT:25) = ' IP66102-IPM-MSG ( 800-STRT : 25)
          logger.info("IP66102-IPM-MSG(800-STRT:25) = {}", new String(substring(ip66102IpmMsg.getCharArray(),(work.getStrt800()-1), (work.getStrt800() + 24) ))); 

// *
          // MOVE 123456 TO WS-NUM-SPACES
          //  LITERAL_123456 = 123456, FORMAT_2061439275 = "999999999"
          work.setNumSpaces(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2061439275,CONSTANTS.LITERAL_123456));
//  DISPLAY '*74* WS-NUM-SPACES = ' WS-NUM-SPACES
          logger.info("*74* WS-NUM-SPACES = {}", new String(work.getNumSpaces())); 
          // MOVE WS-NUM-SPACES TO WS-CHAR
          work.setCharWs(work.getNumSpaces());
//  DISPLAY '*75* WS-CHAR       = ' WS-CHAR
          logger.info("*75* WS-CHAR       = {}", new String(work.getCharWs())); 
//  STRING 'NUM-VALUE ' WS-NUM-SPACES DELIMITED BY SIZE INTO WS-CHAR END-STRING
          charArray = new ArrayList<char[]>();
             charArray.add(CONSTANTS.LITERAL_NUM_MN_VALUE_B_);
             charArray.add(work.getNumSpaces());
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
          updated = updateString(work.getCharWs() ,joinCharArray);
          work.setCharWs(  (char[])updated.get("string"));
//  DISPLAY '*76* WS-CHAR*STRING= ' WS-CHAR
          logger.info("*76* WS-CHAR*STRING= {}", new String(work.getCharWs())); 
          // MOVE ZEROES TO WS-NUM-SPACES
          work.setNumSpaces(CONSTANTS.SPACE_9);
//  DISPLAY '*77* WS-NUM-SPACES = ' WS-NUM-SPACES
          logger.info("*77* WS-NUM-SPACES = {}", new String(work.getNumSpaces())); 
          // MOVE WS-NUM-SPACES TO WS-CHAR
          work.setCharWs(work.getNumSpaces());
//  DISPLAY '*78* WS-CHAR       = ' WS-CHAR
          logger.info("*78* WS-CHAR       = {}", new String(work.getCharWs())); 
//  STRING 'NUM-VALUE ' WS-NUM-SPACES DELIMITED BY SIZE INTO WS-CHAR END-STRING
          charArray = new ArrayList<char[]>();
             charArray.add(CONSTANTS.LITERAL_NUM_MN_VALUE_B_);
             charArray.add(work.getNumSpaces());
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
          updated = updateString(work.getCharWs() ,joinCharArray);
          work.setCharWs(  (char[])updated.get("string"));
//  DISPLAY '*79* WS-CHAR*STRING= ' WS-CHAR
          logger.info("*79* WS-CHAR*STRING= {}", new String(work.getCharWs())); 

// *
// * Mc105 - inspect with mutiple replace
// *
          // MOVE WS-XML-TEXT TO 805-XML-DATA
          work.setXmlData805(work.getXmlText());
//  INSPECT 805-XML-DATA REPLACING ALL 300-LOW-VALUE BY 300-SPACE ALL 300-HIGH-VALUE BY 300-SPACE ALL 300-AMPERSAND BY 300-SPACE
          work.setXmlData805(  replaceAll(work.getXmlData805(),work.getLowValue300(),work.getSpace300())  );
          work.setXmlData805(  replaceAll(work.getXmlData805(),work.getHighValue300(),work.getSpace300())  );
          work.setXmlData805(  replaceAll(work.getXmlData805(),work.getAmpersand300(),work.getSpace300())  );
//  DISPLAY '*80* 805-XML-DATA = <' 805-XML-DATA '>'
          logger.info("*80* 805-XML-DATA = <{}>", new String(work.getXmlData805())); 

// *
// * Mc104 - table index issues
// *
// * setting zero to table index
//  SET 800-INDEX TO 800-MAP-ROW-1
          index800 = mapRow1ValGroup800.getMapRow1800(); 
          
//  SET IP66601-USER-T TO 800-INDEX
          ip66601UserT = (index800/IP66601_USER_TAG_LENGTH) + 1 ; 
          
          emptyIndex800 = emptyIndexGroup800.getEmptyIndex800();
//  IF IP66601-USER-T = 800-EMPTY-INDEX
          if (	( ip66601UserT == ( emptyIndex800 / 13 ) + 1  )) { 

// *Quirk  display '*81* ip66601-user-t = 800-empty-index **matched'
//  IF IP66601-USER-TAG-START ( IP66601-USER-T ) = IP66601-USER-TAG-START (1)

// *Quirk  display '*83* ip66601-user-tag-start(ip66601-user-t) = '
// *quirk           ip66601-user-tag-start(ip66601-user-t)
              emptyIndex800 = emptyIndexGroup800.getEmptyIndex800();
//  IF IP66601-USER-T = 800-EMPTY-INDEX
              if (	( ip66601UserT == ( emptyIndex800 / 13 ) + 1  )) { 
//  SET IP66601-USER-T UP BY 1
                  ip66601UserT++; 
                  
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
          for (work.setI(1); (	( work.getI() <= 5 )) ; work.setI(work.getI() + 1) ) {
//  EVALUATE I
              switch(work.getI()){
              	case 1:
                  // MOVE 0876 TO 800-EDIT-NUMBER
                  work.setEditNumber800((long)876);
              break;
              	case 2:
                  // MOVE 0877 TO 800-EDIT-NUMBER
                  work.setEditNumber800((long)877);
              break;
              	case 3:
                  // MOVE 0879 TO 800-EDIT-NUMBER
                  work.setEditNumber800((long)879);
              break;
              	case 4:
                  // MOVE 0880 TO 800-EDIT-NUMBER
                  work.setEditNumber800((long)880);
              break;
              default :
                  // MOVE 0890 TO 800-EDIT-NUMBER
                  work.setEditNumber800((long)890);
              }
//  EVALUATE 800-EDIT-NUMBER
              switch((int) work.getEditNumber800()){
              	case 876:
//  DISPLAY '*85* 800-EDIT-NUMBER = ' 800-EDIT-NUMBER
                  logger.info("*85* 800-EDIT-NUMBER = {}", String.valueOf(work.getEditNumber800())); 
              break;
              	case 877:
//  DISPLAY '*86* 800-EDIT-NUMBER = ' 800-EDIT-NUMBER
                  logger.info("*86* 800-EDIT-NUMBER = {}", String.valueOf(work.getEditNumber800())); 
              break;
              	case 879:
              
              	case 880:
//  DISPLAY '*87* 800-EDIT-NUMBER = ' 800-EDIT-NUMBER
                  logger.info("*87* 800-EDIT-NUMBER = {}", String.valueOf(work.getEditNumber800())); 
              break;
              default :
//  DISPLAY '*88* 800-EDIT-NUMBER = ' 800-EDIT-NUMBER
                  logger.info("*88* 800-EDIT-NUMBER = {}", String.valueOf(work.getEditNumber800())); 
              }
          }

// *
//  PERFORM VARYING I FROM 1 BY 1 UNTIL I > 5
          for (work.setI(1); (	( work.getI() <= 5 )) ; work.setI(work.getI() + 1) ) {
//  EVALUATE I
              switch(work.getI()){
              	case 1:
                  // MOVE 1 TO IP33701-TARGET-CUR-EXP
                  //  LITERAL_1 = 1
                  ip33701TargetCurExp9Group.setIp33701TargetCurExp(CONSTANTS.LITERAL_1);
              break;
              	case 2:
                  // MOVE 2 TO IP33701-TARGET-CUR-EXP
                  //  LITERAL_2 = 2
                  ip33701TargetCurExp9Group.setIp33701TargetCurExp(CONSTANTS.LITERAL_2);
              break;
              	case 3:
                  // MOVE 3 TO IP33701-TARGET-CUR-EXP
                  //  LITERAL_3 = 3
                  ip33701TargetCurExp9Group.setIp33701TargetCurExp(CONSTANTS.LITERAL_3);
              break;
              	case 4:
                  // MOVE 4 TO IP33701-TARGET-CUR-EXP
                  //  LITERAL_4 = 4
                  ip33701TargetCurExp9Group.setIp33701TargetCurExp(CONSTANTS.LITERAL_4);
              break;
              	case 5:
                  // MOVE 5 TO IP33701-TARGET-CUR-EXP
                  //  LITERAL_5 = 5
                  ip33701TargetCurExp9Group.setIp33701TargetCurExp(CONSTANTS.LITERAL_5);
              break;
              	case 6:
                  // MOVE 6 TO IP33701-TARGET-CUR-EXP
                  //  LITERAL_6 = 6
                  ip33701TargetCurExp9Group.setIp33701TargetCurExp(CONSTANTS.LITERAL_6);
              break;
              }
//  EVALUATE IP33701-TARGET-CUR-EXP
              switch(new String(ip33701TargetCurExp9Group.getIp33701TargetCurExp())){
              	case "1":
//  DISPLAY '*89* IP33701-TARGET-CUR-EXP = ' IP33701-TARGET-CUR-EXP
                  logger.info("*89* IP33701-TARGET-CUR-EXP = {}", new String(ip33701TargetCurExp9Group.getIp33701TargetCurExp())); 
              break;
              	case "2":
//  DISPLAY '*90* IP33701-TARGET-CUR-EXP = ' IP33701-TARGET-CUR-EXP
                  logger.info("*90* IP33701-TARGET-CUR-EXP = {}", new String(ip33701TargetCurExp9Group.getIp33701TargetCurExp())); 
              break;
              	case "3":
//  DISPLAY '*91* IP33701-TARGET-CUR-EXP = ' IP33701-TARGET-CUR-EXP
                  logger.info("*91* IP33701-TARGET-CUR-EXP = {}", new String(ip33701TargetCurExp9Group.getIp33701TargetCurExp())); 
              break;
              	case "4":
//  DISPLAY '*92* IP33701-TARGET-CUR-EXP = ' IP33701-TARGET-CUR-EXP
                  logger.info("*92* IP33701-TARGET-CUR-EXP = {}", new String(ip33701TargetCurExp9Group.getIp33701TargetCurExp())); 
              break;
              	case "5":
//  DISPLAY '*93* IP33701-TARGET-CUR-EXP = ' IP33701-TARGET-CUR-EXP
                  logger.info("*93* IP33701-TARGET-CUR-EXP = {}", new String(ip33701TargetCurExp9Group.getIp33701TargetCurExp())); 
              break;
              	case "6":
//  DISPLAY '*94* IP33701-TARGET-CUR-EXP = ' IP33701-TARGET-CUR-EXP
                  logger.info("*94* IP33701-TARGET-CUR-EXP = {}", new String(ip33701TargetCurExp9Group.getIp33701TargetCurExp())); 
              break;
              }
          }

// *
// *
// * Populate ip00485-user-tag-table
// *
//  MOVE 99 TO IP00485-MEMBER-ENTRIES
          ip00485MemberEntryInfo.setIp00485MemberEntries((long)99);
//  PERFORM VARYING WS-IDX FROM 1 BY 1 UNTIL WS-IDX > 99
          for (work.setIdx(1); (	( work.getIdx() <= 99 )) ; work.setIdx(work.getIdx() + 1) ) {
              // MOVE WS-IDX TO IP00485-MEMBER-ID ( WS-IDX )
              ip00485MemberEntryInfo.getIp00485MemberEntry(work.getIdx() - 1).getIp00485UserTagId().setIp00485MemberId((short) work.getIdx());
              ip00485MemberEntryInfo.getIp00485MemberEntry(work.getIdx() - 1).getIp00485UserTagId().setIp00485UserTagOccurrence((short) (work.getIdx() * 11));
              ip00485MemberEntryInfo.getIp00485MemberEntry(work.getIdx() - 1).getIp00485UserTagId().setIp00485UserTagSubfldNo((short) (work.getIdx() * 12));
              ip00485MemberEntryInfo.getIp00485MemberEntry(work.getIdx() - 1).setIp00485UserTagStart((short) (work.getIdx() * 13));
              ip00485MemberEntryInfo.getIp00485MemberEntry(work.getIdx() - 1).setIp00485UserTagLngth((short) (work.getIdx() * 14));
              // MOVE 'A' TO IP00485-USER-TAG-STATUS ( WS-IDX )
              //  LITERAL_A = 'A'
              ip00485MemberEntryInfo.getIp00485MemberEntry(work.getIdx() - 1).setIp00485UserTagStatus(CONSTANTS.LITERAL_A);
          }

// *
//  SEARCH ALL IP00485-MEMBER-ENTRY
          // Binary Search through ip00485MemberEntryInfo.ip00485MemberEntry
          searchLowPoint = 0; //prevLowValue
          searchHighPoint = (int)ip00485MemberEntryInfo.getIp00485MemberEntries(); //prevHighValue
          searchMidPoint = searchHighPoint / 2; //starting at mid point
          searchIndexes = new int[]{searchLowPoint,searchMidPoint,searchHighPoint};
          keepSearching = true;
          while (keepSearching) {
          // compare logic below
             searchCompare = compareAscending(ip00485MemberEntryInfo.getIp00485MemberEntry(searchMidPoint).getIp00485UserTagId().getIp00485MemberId() , 97);
          // end of compare logic
          	if (searchCompare == 0 ) { // if search found
          	      keepSearching = false;
          	     ip00485MemberIdx = searchMidPoint	 + 1;
//  DISPLAY '*96* IP00485-MEMBER-ID (IP00485-MEMBER-IDX) =' IP00485-MEMBER-ID ( IP00485-MEMBER-IDX ) ' FOUND'
              logger.info("*96* IP00485-MEMBER-ID (IP00485-MEMBER-IDX) ={} FOUND", String.valueOf(ip00485MemberEntryInfo.getIp00485MemberEntry(ip00485MemberIdx - 1).getIp00485UserTagId().getIp00485MemberId())); 
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
          // Binary Search through ip00485MemberEntryInfo.ip00485MemberEntry
          searchLowPoint = 0; //prevLowValue
          searchHighPoint = (int)ip00485MemberEntryInfo.getIp00485MemberEntries(); //prevHighValue
          searchMidPoint = searchHighPoint / 2; //starting at mid point
          searchIndexes = new int[]{searchLowPoint,searchMidPoint,searchHighPoint};
          keepSearching = true;
          while (keepSearching) {
          // compare logic below
             searchCompare = compareAscending(ip00485MemberEntryInfo.getIp00485MemberEntry(searchMidPoint).getIp00485UserTagId().getIp00485MemberId() , 999);
          // end of compare logic
          	if (searchCompare == 0 ) { // if search found
          	      keepSearching = false;
          	     ip00485MemberIdx = searchMidPoint	 + 1;
//  DISPLAY '*98* IP00485-MEMBER-ID (IP00485-MEMBER-IDX) =' IP00485-MEMBER-ID ( IP00485-MEMBER-IDX ) ' FOUND'
              logger.info("*98* IP00485-MEMBER-ID (IP00485-MEMBER-IDX) ={} FOUND", String.valueOf(ip00485MemberEntryInfo.getIp00485MemberEntry(ip00485MemberIdx - 1).getIp00485UserTagId().getIp00485MemberId())); 
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
          // Binary Search through ip00485MemberEntryInfo.ip00485MemberEntry
          searchLowPoint = 0; //prevLowValue
          searchHighPoint = (int)ip00485MemberEntryInfo.getIp00485MemberEntries(); //prevHighValue
          searchMidPoint = searchHighPoint / 2; //starting at mid point
          searchIndexes = new int[]{searchLowPoint,searchMidPoint,searchHighPoint};
          keepSearching = true;
          while (keepSearching) {
          // compare logic below
             searchCompare = compareAscending(ip00485MemberEntryInfo.getIp00485MemberEntry(searchMidPoint).getIp00485UserTagId().getIp00485MemberId() , 15);
          // end of compare logic
          	if (searchCompare == 0 ) { // if search found
          	      keepSearching = false;
          	     ip00485MemberIdx = searchMidPoint	 + 1;
//  DISPLAY '*100* IP00485-MEMBER-ID (IP00485-MEMBER-IDX)' ' = ' IP00485-MEMBER-ID ( IP00485-MEMBER-IDX ) ' FOUND'
              logger.info("*100* IP00485-MEMBER-ID (IP00485-MEMBER-IDX) = {} FOUND", String.valueOf(ip00485MemberEntryInfo.getIp00485MemberEntry(ip00485MemberIdx - 1).getIp00485UserTagId().getIp00485MemberId())); 
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
          bussi800 = abBusslBussiValues800.getBussi800();
//  IF ( 800-AB EQUAL SPACES OR LOW-VALUES OR HIGH-VALUES ) OR ( 800-BUSSL EQUAL ZEROES OR LOW-VALUES OR HIGH-VALUES ) OR ( 800-BUSSI EQUAL ZEROES OR LOW-VALUES OR HIGH-VALUES )
          if ((        ( allSpaces(abBusslBussiValues800.getAb800())   ) || 			( checkLowValue(abBusslBussiValues800.getAb800()) )  || ( isHighValue(abBusslBussiValues800.getAb800()) ) ) || (	( abBusslBussiValues800.getBussl800() == 0 ) || 			( checkLowValue(abBusslBussiValues800.getBussl800String()) )  || ( isHighValue(abBusslBussiValues800.getBussl800String()) ) ) || (	( bussi800 == 0 ) || 			( checkLowValue(abBusslBussiValues800.getBussi800String()) )  || ( isHighValue(abBusslBussiValues800.getBussi800String()) ) )) { 
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
          abBusslBussiValues800.setString(CONSTANTS.LOW_VALUE_1703015800);
          bussi800 = abBusslBussiValues800.getBussi800();
//  IF ( 800-AB EQUAL SPACES OR LOW-VALUES OR HIGH-VALUES ) OR ( 800-BUSSL EQUAL ZEROES OR LOW-VALUES OR HIGH-VALUES ) OR ( 800-BUSSI EQUAL ZEROES OR LOW-VALUES OR HIGH-VALUES )
          if ((        ( allSpaces(abBusslBussiValues800.getAb800())   ) || 			( checkLowValue(abBusslBussiValues800.getAb800()) )  || ( isHighValue(abBusslBussiValues800.getAb800()) ) ) || (	( abBusslBussiValues800.getBussl800() == 0 ) || 			( checkLowValue(abBusslBussiValues800.getBussl800String()) )  || ( isHighValue(abBusslBussiValues800.getBussl800String()) ) ) || (	( bussi800 == 0 ) || 			( checkLowValue(abBusslBussiValues800.getBussi800String()) )  || ( isHighValue(abBusslBussiValues800.getBussi800String()) ) )) { 
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
          abBusslBussiValues800.setString(CONSTANTS.HIGH_VALUE_1986603300);
//  IF ( 800-AB EQUAL SPACES OR LOW-VALUES OR HIGH-VALUES ) OR ( 800-BUSSL EQUAL ZEROES OR LOW-VALUES OR HIGH-VALUES ) OR ( 800-BUSSI EQUAL ZEROES OR LOW-VALUES OR HIGH-VALUES )
          bussi800 = abBusslBussiValues800.getBussi800();
//  ELSE
          if ((        ( !allSpaces(abBusslBussiValues800.getAb800())  ) && !( checkLowValue(abBusslBussiValues800.getAb800()) )  && !( isHighValue(abBusslBussiValues800.getAb800()) ) ) && (	( abBusslBussiValues800.getBussl800() != 0 ) && !( checkLowValue(abBusslBussiValues800.getBussl800String()) )  && !( isHighValue(abBusslBussiValues800.getBussl800String()) ) ) && (	( bussi800 != 0 ) && !( checkLowValue(abBusslBussiValues800.getBussi800String()) )  && !( isHighValue(abBusslBussiValues800.getBussi800String()) ) )) { 
//  DISPLAY '*106* FAILURE'
              logger.info("*106* FAILURE"); 
          }
  

// *
//  INITIALIZE 800-AB-BUSSL-BUSSI-VALUES
          abBusslBussiValues800.initialize();
//  IF 800-AB EQUAL SPACES OR 800-BUSSL EQUAL ZEROES OR 800-BUSSI EQUAL ZEROES
          ab800 = abBusslBussiValues800.getAb800();
          bussi800 = abBusslBussiValues800.getBussi800();
          bussl800 = abBusslBussiValues800.getBussl800();
//  ELSE
          if (        ( !allSpaces(ab800)  ) && 	( bussl800 != 0 ) && 	( bussi800 != 0 )) { 
//  DISPLAY '*107* FAILURE'
              logger.info("*107* FAILURE"); 
          }
  

// *
          // MOVE ALL ZEROES TO 500-HOLIDAYS
          holidays500.setString(CONSTANTS.ZERO_150);
          // MOVE '190011914720360' TO 500-HOLIDAYS (1 : 15)
          //  LITERAL_190011914720360 = '190011914720360'
          holidays500.replace(CONSTANTS.LITERAL_190011914720360,0,15/* length */,0,15 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  SET 88-100-EXCLUSION-OFF TO TRUE
          work.setExclusionOff88100True(); 
          
          // MOVE '20203600' TO 800-INTERIM-DATE-X
          //  LITERAL_20203600 = '20203600'
          interimDateXGroup800.setInterimDateX800(CONSTANTS.LITERAL_20203600);
//  SET 500-HOLIDAY-INDEX TO 1
          holidayIndex500 = 1; 
          
//  PERFORM 3222-SEARCH-HOLIDAY-EXCLUSION UNTIL 500-HOLIDAY-INDEX GREATER THAN 30 OR 88-100-EXCLUSION-ON
          while (	( holidayIndex500 <= 30 ) && !(work.isExclusionOn88100()) ) {
             searchHolidayExclusion();/*3222-SEARCH-HOLIDAY-EXCLUSION*/
             if (this.isProgramEnded()) {
                 return ;
             }
          }
//  IF 88-100-EXCLUSION-ON
          if ( work.isExclusionOn88100()  ) { 
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
          work.setPrevTransType801(CONSTANTS.SPACE_4);
          work.setTransType701(CONSTANTS.SPACE_80);
          // MOVE '0000' TO 801-PREV-MCC-CODE
          work.setPrevMccCode801(CONSTANTS.LITERAL_0000_B4_);

// *
//  STRING 'OTHERS' DELIMITED BY SPACE, ' ' DELIMITED BY SIZE, 'TRANSACTION-TYPE:-' DELIMITED BY SPACE, 801-PREV-TRANS-TYPE DELIMITED BY SPACE, ' ' DELIMITED BY SIZE, 'MCC-CODE:-' DELIMITED BY SPACE, 801-PREV-MCC-CODE DELIMITED BY SPACE, INTO 701-TRANS-TYPE
          charArray = new ArrayList<char[]>();
             charArray.add(splitFirst( CONSTANTS.LITERAL_OTHERS , CONSTANTS.SPACE ) );
             charArray.add(CONSTANTS.SPACE);
             charArray.add(splitFirst( CONSTANTS.LITERAL_TRANSACTION_MN2_TYPE_CL_ , CONSTANTS.SPACE ) );
             charArray.add(splitFirst( work.getPrevTransType801() , CONSTANTS.SPACE ) );
             charArray.add(CONSTANTS.SPACE);
             charArray.add(splitFirst( CONSTANTS.LITERAL_MCC_MN2_CODE_CL_ , CONSTANTS.SPACE ) );
             charArray.add(splitFirst( work.getPrevMccCode801() , CONSTANTS.SPACE ) );
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3),charArray.get(4),charArray.get(5),charArray.get(6));
          updated = updateString(work.getTransType701() ,joinCharArray);
          work.setTransType701(  (char[])updated.get("string"));

// *
//  DISPLAY '*113* 701-TRANS-TYPE = (' 701-TRANS-TYPE ')'
          logger.info("*113* 701-TRANS-TYPE = ({})", new String(work.getTransType701())); 
          // MOVE SPACES TO 701-TRANS-TYPE
          work.setTransType701(CONSTANTS.SPACE_80);
          // MOVE '*' TO 801-PREV-TRANS-TYPE
          work.setPrevTransType801(CONSTANTS.LITERAL_STR_B3_);

// *
// *
//  STRING 'OTHERS' DELIMITED BY SPACE, ' ' DELIMITED BY SIZE, 'TRANSACTION-TYPE:-' DELIMITED BY SPACE, 801-PREV-TRANS-TYPE DELIMITED BY SPACE, ' ' DELIMITED BY SIZE, 'MCC-CODE:-' DELIMITED BY SPACE, 801-PREV-MCC-CODE DELIMITED BY SPACE, INTO 701-TRANS-TYPE
          charArray = new ArrayList<char[]>();
             charArray.add(splitFirst( CONSTANTS.LITERAL_OTHERS , CONSTANTS.SPACE ) );
             charArray.add(CONSTANTS.SPACE);
             charArray.add(splitFirst( CONSTANTS.LITERAL_TRANSACTION_MN2_TYPE_CL_ , CONSTANTS.SPACE ) );
             charArray.add(splitFirst( work.getPrevTransType801() , CONSTANTS.SPACE ) );
             charArray.add(CONSTANTS.SPACE);
             charArray.add(splitFirst( CONSTANTS.LITERAL_MCC_MN2_CODE_CL_ , CONSTANTS.SPACE ) );
             charArray.add(splitFirst( work.getPrevMccCode801() , CONSTANTS.SPACE ) );
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3),charArray.get(4),charArray.get(5),charArray.get(6));
          updated = updateString(work.getTransType701() ,joinCharArray);
          work.setTransType701(  (char[])updated.get("string"));
      
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
      private void mainSplit3() throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			char[] valueOfPds158s3800 = null;
			char[] valueOfPds158s2800 = null;
			char[] var = null;
			Map<String,Object> updated = null;
			 final int B_LENGTH = 50;
			 final int D_LENGTH = 40;
			BigDecimal ecbRateDiff800 = BigDecimal.ZERO;
			// End of variable declaration


// *
//  DISPLAY '*114* 701-TRANS-TYPE = (' 701-TRANS-TYPE ')'
          logger.info("*114* 701-TRANS-TYPE = ({})", new String(work.getTransType701())); 
          // MOVE SPACES TO 701-TRANS-TYPE
          work.setTransType701(CONSTANTS.SPACE_80);
          // MOVE ALL '*' TO 801-PREV-TRANS-TYPE
          work.setPrevTransType801(CONSTANTS.LITERAL_STR4_);

// *
// *
//  STRING 'OTHERS' DELIMITED BY SPACE, ' ' DELIMITED BY SIZE, 'TRANSACTION-TYPE:-' DELIMITED BY SPACE, 801-PREV-TRANS-TYPE DELIMITED BY '*' , ' ' DELIMITED BY SIZE, 'MCC-CODE:-' DELIMITED BY SPACE, 801-PREV-MCC-CODE DELIMITED BY SPACE, INTO 701-TRANS-TYPE
          charArray = new ArrayList<char[]>();
             charArray.add(splitFirst( CONSTANTS.LITERAL_OTHERS , CONSTANTS.SPACE ) );
             charArray.add(CONSTANTS.SPACE);
             charArray.add(splitFirst( CONSTANTS.LITERAL_TRANSACTION_MN2_TYPE_CL_ , CONSTANTS.SPACE ) );
             charArray.add(splitFirst( work.getPrevTransType801() , CONSTANTS.LITERAL_STR_ ) );
             charArray.add(CONSTANTS.SPACE);
             charArray.add(splitFirst( CONSTANTS.LITERAL_MCC_MN2_CODE_CL_ , CONSTANTS.SPACE ) );
             charArray.add(splitFirst( work.getPrevMccCode801() , CONSTANTS.SPACE ) );
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3),charArray.get(4),charArray.get(5),charArray.get(6));
          updated = updateString(work.getTransType701() ,joinCharArray);
          work.setTransType701(  (char[])updated.get("string"));

// *
//  DISPLAY '*115* 701-TRANS-TYPE = (' 701-TRANS-TYPE ')'
          logger.info("*115* 701-TRANS-TYPE = ({})", new String(work.getTransType701())); 
          // MOVE SPACES TO 701-TRANS-TYPE
          work.setTransType701(CONSTANTS.SPACE_80);
          // MOVE ALL '*#' TO 801-PREV-TRANS-TYPE
          work.setPrevTransType801(CONSTANTS.LITERAL_STR2_HS2_);

// *
// *
//  STRING 'OTHERS' DELIMITED BY SPACE, ' ' DELIMITED BY SIZE, 'TRANSACTION-TYPE:-' DELIMITED BY SPACE, 801-PREV-TRANS-TYPE DELIMITED BY '*#' , ' ' DELIMITED BY SIZE, 'MCC-CODE:-' DELIMITED BY SPACE, 801-PREV-MCC-CODE DELIMITED BY SPACE, INTO 701-TRANS-TYPE
          charArray = new ArrayList<char[]>();
             charArray.add(splitFirst( CONSTANTS.LITERAL_OTHERS , CONSTANTS.SPACE ) );
             charArray.add(CONSTANTS.SPACE);
             charArray.add(splitFirst( CONSTANTS.LITERAL_TRANSACTION_MN2_TYPE_CL_ , CONSTANTS.SPACE ) );
             charArray.add(splitFirst( work.getPrevTransType801() , CONSTANTS.LITERAL_STR_HS_ ) );
             charArray.add(CONSTANTS.SPACE);
             charArray.add(splitFirst( CONSTANTS.LITERAL_MCC_MN2_CODE_CL_ , CONSTANTS.SPACE ) );
             charArray.add(splitFirst( work.getPrevMccCode801() , CONSTANTS.SPACE ) );
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3),charArray.get(4),charArray.get(5),charArray.get(6));
          updated = updateString(work.getTransType701() ,joinCharArray);
          work.setTransType701(  (char[])updated.get("string"));

// *

// *
// *-------------------------------
// *
//  DISPLAY '*116* 701-TRANS-TYPE = (' 701-TRANS-TYPE ')'
          logger.info("*116* 701-TRANS-TYPE = ({})", new String(work.getTransType701())); 
          // MOVE '010101' TO 800-VALUE-OF-PDS158S3
          //  LITERAL_010101 = '010101'
          work.setValueOfPds158s3800(CONSTANTS.LITERAL_010101);
          // MOVE '1' TO 800-VALUE-OF-PDS158S2
          //  LITERAL_1 = '1'
          work.setValueOfPds158s2800(CONSTANTS.LITERAL_1);

// *
//  IF 88-100-EXCLUSION-ON AND 800-VALUE-OF-PDS158S3 GREATER THAN SPACES
          valueOfPds158s3800 = work.getValueOfPds158s3800();
//  ELSE
          if (!(work.isExclusionOn88100())  ||                    ( isLessOrEqualSpaces(valueOfPds158s3800) )) { 
//  DISPLAY '*117* FAILURE'
              logger.info("*117* FAILURE"); 
          }
  
          valueOfPds158s2800 = work.getValueOfPds158s2800();
//  IF 88-100-EXCLUSION-ON AND 800-VALUE-OF-PDS158S2 GREATER THAN SPACES
          if ( work.isExclusionOn88100()   &&              ( isGreaterThanSpaces(valueOfPds158s2800) )) { 
//  DISPLAY '*118* SUCCESS'
              logger.info("*118* SUCCESS"); 
          }
  

// *
//  IF 88-100-EXCLUSION-ON AND 800-VALUE-OF-PDS158S3 GREATER THAN OR EQUAL SPACES
          valueOfPds158s3800 = work.getValueOfPds158s3800();
//  ELSE
          if (!(work.isExclusionOn88100())  ||                   ( isLessThanSpaces(valueOfPds158s3800) )) { 
//  DISPLAY '*119* FAILURE'
              logger.info("*119* FAILURE"); 
          }
  
          valueOfPds158s2800 = work.getValueOfPds158s2800();
//  IF 88-100-EXCLUSION-ON AND 800-VALUE-OF-PDS158S2 GREATER THAN OR EQUAL SPACES
          if ( work.isExclusionOn88100()   &&               ( isGreaterOrEqualSpaces(valueOfPds158s2800)  )) { 
//  DISPLAY '*120* SUCCESS'
              logger.info("*120* SUCCESS"); 
          }
  

// *
//  IF 88-100-EXCLUSION-ON AND 800-VALUE-OF-PDS158S3 LESS THAN SPACES
          valueOfPds158s3800 = work.getValueOfPds158s3800();
//  ELSE
          if (!(work.isExclusionOn88100())  ||               ( isGreaterOrEqualSpaces(valueOfPds158s3800)  )) { 
//  DISPLAY '*121* SUCCESS'
              logger.info("*121* SUCCESS"); 
          }
  
          valueOfPds158s2800 = work.getValueOfPds158s2800();
//  IF 88-100-EXCLUSION-ON AND 800-VALUE-OF-PDS158S2 LESS THAN SPACES
          if ( work.isExclusionOn88100()   &&                   ( isLessThanSpaces(valueOfPds158s2800) )) { 
//  DISPLAY '*122* FAILURE'
              logger.info("*122* FAILURE"); 
          }
  

// *
//  IF 88-100-EXCLUSION-ON AND 800-VALUE-OF-PDS158S3 <= SPACES
          valueOfPds158s3800 = work.getValueOfPds158s3800();
//  ELSE
          if (!(work.isExclusionOn88100())  ||              ( isGreaterThanSpaces(valueOfPds158s3800) )) { 
//  DISPLAY '*123* SUCCESS'
              logger.info("*123* SUCCESS"); 
          }
  
          valueOfPds158s2800 = work.getValueOfPds158s2800();
//  IF 88-100-EXCLUSION-ON AND 800-VALUE-OF-PDS158S2 <= SPACES
          if ( work.isExclusionOn88100()   &&                    ( isLessOrEqualSpaces(valueOfPds158s2800) )) { 
//  DISPLAY '*124* FAILURE'
              logger.info("*124* FAILURE"); 
          }
  

// *
// *-------------------------------
// *
          // MOVE SPACES TO 800-VALUE-OF-PDS158S3 800-VALUE-OF-PDS158S2
          work.setValueOfPds158s3800(CONSTANTS.SPACE_6);
          work.setValueOfPds158s2800(CONSTANTS.SPACE);

// *
//  IF 88-100-EXCLUSION-ON AND 800-VALUE-OF-PDS158S3 GREATER THAN SPACES
          valueOfPds158s3800 = work.getValueOfPds158s3800();
//  ELSE
          if (!(work.isExclusionOn88100())  ||                    ( isLessOrEqualSpaces(valueOfPds158s3800) )) { 
//  DISPLAY '*125* SUCCESS'
              logger.info("*125* SUCCESS"); 
          }
  
          valueOfPds158s2800 = work.getValueOfPds158s2800();
//  IF 88-100-EXCLUSION-ON AND 800-VALUE-OF-PDS158S2 GREATER THAN SPACES
          if ( work.isExclusionOn88100()   &&              ( isGreaterThanSpaces(valueOfPds158s2800) )) { 
//  DISPLAY '*126* FAILURE'
              logger.info("*126* FAILURE"); 
          }
  

// *
//  IF 88-100-EXCLUSION-ON AND 800-VALUE-OF-PDS158S3 GREATER THAN OR EQUAL SPACES
          valueOfPds158s3800 = work.getValueOfPds158s3800();
//  ELSE
          if (!(work.isExclusionOn88100())  ||                   ( isLessThanSpaces(valueOfPds158s3800) )) { 
//  DISPLAY '*127* FAILURE'
              logger.info("*127* FAILURE"); 
          }
  
          valueOfPds158s2800 = work.getValueOfPds158s2800();
//  IF 88-100-EXCLUSION-ON AND 800-VALUE-OF-PDS158S2 GREATER THAN OR EQUAL SPACES
          if ( work.isExclusionOn88100()   &&               ( isGreaterOrEqualSpaces(valueOfPds158s2800)  )) { 
//  DISPLAY '*128* SUCCESS'
              logger.info("*128* SUCCESS"); 
          }
  

// *
//  IF 88-100-EXCLUSION-ON AND 800-VALUE-OF-PDS158S3 LESS THAN SPACES
          valueOfPds158s3800 = work.getValueOfPds158s3800();
//  ELSE
          if (!(work.isExclusionOn88100())  ||               ( isGreaterOrEqualSpaces(valueOfPds158s3800)  )) { 
//  DISPLAY '*129* SUCCESS'
              logger.info("*129* SUCCESS"); 
          }
  
          valueOfPds158s2800 = work.getValueOfPds158s2800();
//  IF 88-100-EXCLUSION-ON AND 800-VALUE-OF-PDS158S2 LESS THAN SPACES
          if ( work.isExclusionOn88100()   &&                   ( isLessThanSpaces(valueOfPds158s2800) )) { 
//  DISPLAY '*130* FAILURE'
              logger.info("*130* FAILURE"); 
          }
  

// *
//  IF 88-100-EXCLUSION-ON AND 800-VALUE-OF-PDS158S3 LESS THAN OR EQUAL SPACES
          valueOfPds158s3800 = work.getValueOfPds158s3800();
//  ELSE
          if (!(work.isExclusionOn88100())  ||              ( isGreaterThanSpaces(valueOfPds158s3800) )) { 
//  DISPLAY '*131* FAILURE'
              logger.info("*131* FAILURE"); 
          }
  
          valueOfPds158s2800 = work.getValueOfPds158s2800();
//  IF 88-100-EXCLUSION-ON AND 800-VALUE-OF-PDS158S2 <= SPACES
          if ( work.isExclusionOn88100()   &&                    ( isLessOrEqualSpaces(valueOfPds158s2800) )) { 
//  DISPLAY '*132* SUCCESS'
              logger.info("*132* SUCCESS"); 
          }
  

// *
// *-------------------------------
// *
          // MOVE LOW-VALUES TO 800-VALUE-OF-PDS158S3 800-VALUE-OF-PDS158S2
          work.setValueOfPds158s3800(CONSTANTS.LOW_VALUE_1703015769);
          work.setValueOfPds158s2800(CONSTANTS.LOW_VALUE_1703015924);

// *
//  IF 88-100-EXCLUSION-ON AND 800-VALUE-OF-PDS158S3 GREATER THAN SPACES
          valueOfPds158s3800 = work.getValueOfPds158s3800();
//  ELSE
          if (!(work.isExclusionOn88100())  ||                    ( isLessOrEqualSpaces(valueOfPds158s3800) )) { 
//  DISPLAY '*133* SUCCESS'
              logger.info("*133* SUCCESS"); 
          }
  
          valueOfPds158s2800 = work.getValueOfPds158s2800();
//  IF 88-100-EXCLUSION-ON AND 800-VALUE-OF-PDS158S2 GREATER THAN SPACES
          if ( work.isExclusionOn88100()   &&              ( isGreaterThanSpaces(valueOfPds158s2800) )) { 
//  DISPLAY '*134* FAILURE'
              logger.info("*134* FAILURE"); 
          }
  

// *
//  IF 88-100-EXCLUSION-ON AND 800-VALUE-OF-PDS158S3 GREATER THAN OR EQUAL SPACES
          valueOfPds158s3800 = work.getValueOfPds158s3800();
//  ELSE
          if (!(work.isExclusionOn88100())  ||                   ( isLessThanSpaces(valueOfPds158s3800) )) { 
//  DISPLAY '*135* SUCCESS'
              logger.info("*135* SUCCESS"); 
          }
  
          valueOfPds158s2800 = work.getValueOfPds158s2800();
//  IF 88-100-EXCLUSION-ON AND 800-VALUE-OF-PDS158S2 GREATER THAN OR EQUAL SPACES
          if ( work.isExclusionOn88100()   &&               ( isGreaterOrEqualSpaces(valueOfPds158s2800)  )) { 
//  DISPLAY '*136* FAILURE'
              logger.info("*136* FAILURE"); 
          }
  

// *
//  IF 88-100-EXCLUSION-ON AND 800-VALUE-OF-PDS158S3 LESS THAN SPACES
          valueOfPds158s3800 = work.getValueOfPds158s3800();
//  ELSE
          if (!(work.isExclusionOn88100())  ||               ( isGreaterOrEqualSpaces(valueOfPds158s3800)  )) { 
//  DISPLAY '*137* FAILURE'
              logger.info("*137* FAILURE"); 
          }
  
          valueOfPds158s2800 = work.getValueOfPds158s2800();
//  IF 88-100-EXCLUSION-ON AND 800-VALUE-OF-PDS158S2 LESS THAN SPACES
          if ( work.isExclusionOn88100()   &&                   ( isLessThanSpaces(valueOfPds158s2800) )) { 
//  DISPLAY '*138* SUCCESS'
              logger.info("*138* SUCCESS"); 
          }
  

// *
//  IF 88-100-EXCLUSION-ON AND 800-VALUE-OF-PDS158S3 <= SPACES
          valueOfPds158s3800 = work.getValueOfPds158s3800();
//  ELSE
          if (!(work.isExclusionOn88100())  ||              ( isGreaterThanSpaces(valueOfPds158s3800) )) { 
//  DISPLAY '*139* FAILURE'
              logger.info("*139* FAILURE"); 
          }
  
          valueOfPds158s2800 = work.getValueOfPds158s2800();
//  IF 88-100-EXCLUSION-ON AND 800-VALUE-OF-PDS158S2 <= SPACES
          if ( work.isExclusionOn88100()   &&                    ( isLessOrEqualSpaces(valueOfPds158s2800) )) { 
//  DISPLAY '*140* SUCCESS'
              logger.info("*140* SUCCESS"); 
          }
  

// *
          // MOVE HIGH-VALUES TO WS-VAR
          work.setVar(CONSTANTS.HIGH_VALUE_1986603238);
          var = work.getVar();
//  IF WS-VAR = HIGH-VALUES OR SPACES
          if (( isHighValue(var) )  ||         ( allSpaces(var)   )) { 
              // MOVE 'N/A' TO WS-VAR
              //  LITERAL_N_SL_A = 'N/A'
              work.setVar(CONSTANTS.LITERAL_N_SL_A);
//  DISPLAY '*141* SUCCESS'
              logger.info("*141* SUCCESS"); 
          }
  
//  ELSE
          else { 
//  DISPLAY '*142* FAILURE'
              logger.info("*142* FAILURE"); 
          }

// *
          var = work.getVar();
//  IF WS-VAR = HIGH-VALUES OR SPACES
          if (( isHighValue(var) )  ||         ( allSpaces(var)   )) { 
//  DISPLAY '*143* FAILURE'
              logger.info("*143* FAILURE"); 
          }
  
//  ELSE
          else { 
//  DISPLAY '*144* SUCCESS  ' WS-VAR
              logger.info("*144* SUCCESS  {}", new String(work.getVar())); 
          }

// *
//  MOVE ALL 'A' TO WS-A-VAR1
          a.setAVar1(CONSTANTS.LITERAL_AAAAA);
//  MOVE ALL 'B' TO WS-A-VAR2
          a.setAVar2(CONSTANTS.LITERAL_BBBBBBBBBB);
//  MOVE ALL 'C' TO WS-A-VAR4
          a.setAVar4(CONSTANTS.LITERAL_CCCCCCCCCCCCCCCCCCCCCCCCC);
//  MOVE LENGTH OF WS-A TO WS-A-LEN
          work.setALen((short) A.getAFieldLength());
//  MOVE LENGTH OF WS-B TO WS-B-LEN
          work.setBLen((short) B_LENGTH);

// *
          // MOVE ALL 'Z' TO WS-B
          work.setB(CONSTANTS.LITERAL_1605480576);
          // MOVE WS-A (1 : WS-A-LEN ) TO WS-B (1 : WS-A-LEN )
          work.setB(replace(work.getB(),substring(a.getCharArray(),0,work.getALen()),0,work.getALen()));
//  DISPLAY '*145* WS-A   = ' WS-A
          logger.info("*145* WS-A   = {}", a.toString()); 
//  DISPLAY '*146* WS-B   = ' WS-B
          logger.info("*146* WS-B   = {}", new String(work.getB())); 

// *
//  MOVE ALL 'A' TO WS-C-VAR1
          c.setCVar1(CONSTANTS.LITERAL_AAAAA);
//  MOVE ALL 'B' TO WS-C-VAR2
          c.setCVar2(CONSTANTS.LITERAL_BBBBBBBBBB);
//  MOVE ALL 'C' TO WS-C-VAR4
          c.setCVar4(CONSTANTS.LITERAL_1211094465);
//  MOVE LENGTH OF WS-C TO WS-C-LEN
          work.setCLen((short) C.getCFieldLength());
//  MOVE LENGTH OF WS-D TO WS-D-LEN
          work.setDLen((short) D_LENGTH);

// *
          // MOVE ALL 'Z' TO WS-D
          work.setD(CONSTANTS.LITERAL_295742784);
          // MOVE WS-C (1 : WS-D-LEN ) TO WS-D (1 : WS-D-LEN )
          work.setD(replace(work.getD(),substring(c.getCharArray(),0,work.getDLen()),0,work.getDLen()));
//  DISPLAY '*147* WS-C   = ' WS-C
          logger.info("*147* WS-C   = {}", c.toString()); 
//  DISPLAY '*148* WS-D   = ' WS-D
          logger.info("*148* WS-D   = {}", new String(work.getD())); 

// *
// *
          // MOVE 10 TO 800-ECB-RATE-DIFF
          work.setEcbRateDiff800(BigDecimal.TEN.setScale(6));
          ecbRateDiff800 = work.getEcbRateDiff800();
//  EVALUATE TRUE
          if  (        ( ecbRateDiff800.compareTo(BigDecimal.ZERO) < 0 )) { 
//  DISPLAY '*149 * 800-ECB-RATE-DIFF  ** - VE     **'
              logger.info("*149 * 800-ECB-RATE-DIFF  ** - VE     **"); 
          }
          else if  (        ( ecbRateDiff800.compareTo(BigDecimal.ZERO) > 0 ) ||         ( ecbRateDiff800.compareTo(BigDecimal.ZERO) == 0 )) { 
//  DISPLAY '*150 * 800-ECB-RATE-DIFF  ** + VE / 0 **'
              logger.info("*150 * 800-ECB-RATE-DIFF  ** + VE / 0 **"); 
          }
  

// *
          ecbRateDiff800 = work.getEcbRateDiff800();
//  IF 800-ECB-RATE-DIFF IS NEGATIVE
          if (        ( ecbRateDiff800.compareTo(BigDecimal.ZERO) < 0 )) { 
//  DISPLAY '*151 * 800-ECB-RATE-DIFF  ** - VE     **'
              logger.info("*151 * 800-ECB-RATE-DIFF  ** - VE     **"); 
          }
  
//  ELSE
          else { 
              ecbRateDiff800 = work.getEcbRateDiff800();
//  IF 800-ECB-RATE-DIFF IS POSITIVE OR 800-ECB-RATE-DIFF IS ZERO
              if (        ( ecbRateDiff800.compareTo(BigDecimal.ZERO) > 0 ) ||         ( ecbRateDiff800.compareTo(BigDecimal.ZERO) == 0 )) { 
//  DISPLAY '*152 * 800-ECB-RATE-DIFF  ** + VE / 0 **'
                  logger.info("*152 * 800-ECB-RATE-DIFF  ** + VE / 0 **"); 
              }
  
          }
//  MOVE -10.23 TO 800-ECB-RATE-DIFF
          work.setEcbRateDiff800(BigDecimal.valueOf(-10.23).setScale(6));
          ecbRateDiff800 = work.getEcbRateDiff800();
//  EVALUATE TRUE
          if  (        ( ecbRateDiff800.compareTo(BigDecimal.ZERO) < 0 )) { 
//  DISPLAY '*153 * 800-ECB-RATE-DIFF  ** - VE     **'
              logger.info("*153 * 800-ECB-RATE-DIFF  ** - VE     **"); 
          }
          else if  (        ( ecbRateDiff800.compareTo(BigDecimal.ZERO) > 0 ) ||         ( ecbRateDiff800.compareTo(BigDecimal.ZERO) == 0 )) { 
//  DISPLAY '*154 * 800-ECB-RATE-DIFF  ** + VE / 0 **'
              logger.info("*154 * 800-ECB-RATE-DIFF  ** + VE / 0 **"); 
          }
  

// *
          ecbRateDiff800 = work.getEcbRateDiff800();
//  IF 800-ECB-RATE-DIFF IS NEGATIVE
          if (        ( ecbRateDiff800.compareTo(BigDecimal.ZERO) < 0 )) { 
//  DISPLAY '*155 * 800-ECB-RATE-DIFF  ** - VE     **'
              logger.info("*155 * 800-ECB-RATE-DIFF  ** - VE     **"); 
          }
  
//  ELSE
          else { 
              ecbRateDiff800 = work.getEcbRateDiff800();
//  IF 800-ECB-RATE-DIFF IS POSITIVE OR 800-ECB-RATE-DIFF IS ZERO
              if (        ( ecbRateDiff800.compareTo(BigDecimal.ZERO) > 0 ) ||         ( ecbRateDiff800.compareTo(BigDecimal.ZERO) == 0 )) { 
//  DISPLAY '*156 * 800-ECB-RATE-DIFF  ** + VE / 0 **'
                  logger.info("*156 * 800-ECB-RATE-DIFF  ** + VE / 0 **"); 
              }
  
          }

// *
//  INITIALIZE CF50005-CLEARING-GRP
          cf50005ClearingGrp.initialize();
          // MOVE '2021050410' TO CF50005-CLEARING-GRP
          //  LITERAL_2021050410 = '2021050410'
          cf50005ClearingGrp.setString(CONSTANTS.LITERAL_2021050410);
          // MOVE CF50005-CLEARING-GRP TO 800-CLEARING-DT-TM-9
          work.replace(padSpaces(12,cf50005ClearingGrp.toCharArray()), /* beginIndex */267, /* length */12);
      
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
      private void mainSplit4() throws Exception {
			// Declare local variables used in the method
			long clearingDtTm9800 = 0;
			long clearingDtTm9700 = 0;
			long clearingDtTm9Short800 = 0;
			long cf50005ClearingDtN = 0;
			long inputTableId800 = 0;
			char[] cf50005ClearingDtX = null;
			char[] ip500041TableId = null;
			Cf20004Data cf20004Data = cf20004TableData.getCf20004ValidValuesEntry().getCf20004Data();
			int inxB = 0;
			// End of variable declaration

          clearingDtTm9800 = work.getClearingDtTm9800();
//  IF CF50005-CLEARING-GRP = 800-CLEARING-DT-TM-9
          if (compareChars(cf50005ClearingGrp,String.valueOf(work.getClearingDtTm9800String()).toCharArray()) == 0) { 
//  DISPLAY '*157 CF50005-CLEARING-GRP (' CF50005-CLEARING-GRP ') EQUALS' '  800-CLEARING-DT-TM-9  (' 800-CLEARING-DT-TM-9 ')'
              logger.info("*157 CF50005-CLEARING-GRP ({}) EQUALS  800-CLEARING-DT-TM-9  ({})", cf50005ClearingGrp.toString(), String.valueOf(work.getClearingDtTm9800())); 
          }
  
//  ELSE
          else { 
//  DISPLAY '*158 CF50005-CLEARING-GRP (' CF50005-CLEARING-GRP ') NOT EQUALS' '  800-CLEARING-DT-TM-9 (' 800-CLEARING-DT-TM-9 ')'
              logger.info("*158 CF50005-CLEARING-GRP ({}) NOT EQUALS  800-CLEARING-DT-TM-9 ({})", cf50005ClearingGrp.toString(), String.valueOf(work.getClearingDtTm9800())); 
          }
          // MOVE SPACES TO 700-CLEARING-DT-TM-9-X
          work.setClearingDtTm9X700(CONSTANTS.SPACE_12);
          // MOVE CF50005-CLEARING-GRP TO 700-CLEARING-DT-TM-9
          work.replace(padSpaces(12,cf50005ClearingGrp.toCharArray()), /* beginIndex */279, /* length */12);
          clearingDtTm9700 = work.getClearingDtTm9700();
//  IF CF50005-CLEARING-GRP = 700-CLEARING-DT-TM-9
          if (compareChars(cf50005ClearingGrp,String.valueOf(work.getClearingDtTm9700String()).toCharArray()) == 0) { 
//  DISPLAY '*189 CF50005-CLEARING-GRP (' CF50005-CLEARING-GRP ') EQUALS' '  700-CLEARING-DT-TM-9  (' 700-CLEARING-DT-TM-9 ')'
              logger.info("*189 CF50005-CLEARING-GRP ({}) EQUALS  700-CLEARING-DT-TM-9  ({})", cf50005ClearingGrp.toString(), String.valueOf(work.getClearingDtTm9700())); 
          }
  
//  ELSE
          else { 
//  DISPLAY '*190 CF50005-CLEARING-GRP (' CF50005-CLEARING-GRP ') NOT EQUALS' '  700-CLEARING-DT-TM-9 (' 700-CLEARING-DT-TM-9 ')'
              logger.info("*190 CF50005-CLEARING-GRP ({}) NOT EQUALS  700-CLEARING-DT-TM-9 ({})", cf50005ClearingGrp.toString(), String.valueOf(work.getClearingDtTm9700())); 
          }
          // MOVE CF50005-CLEARING-GRP TO 800-CLEARING-DT-TM-9-SHORT
          work.replace(padSpaces(8,cf50005ClearingGrp.toCharArray()), /* beginIndex */291, /* length */8);
          clearingDtTm9Short800 = work.getClearingDtTm9Short800();
//  IF CF50005-CLEARING-GRP = 800-CLEARING-DT-TM-9-SHORT
          if (compareChars(cf50005ClearingGrp,String.valueOf(work.getClearingDtTm9Short800String()).toCharArray()) == 0) { 
//  DISPLAY '*159 CF50005-CLEARING-GRP (' CF50005-CLEARING-GRP ') EQUALS' '  800-CLEARING-DT-TM-9-SHORT (' 800-CLEARING-DT-TM-9-SHORT ')'
              logger.info("*159 CF50005-CLEARING-GRP ({}) EQUALS  800-CLEARING-DT-TM-9-SHORT ({})", cf50005ClearingGrp.toString(), String.valueOf(work.getClearingDtTm9Short800())); 
          }
  
//  ELSE
          else { 
//  DISPLAY '*160 CF50005-CLEARING-GRP (' CF50005-CLEARING-GRP ') NOT EQUALS' '  800-CLEARING-DT-TM-9-SHORT (' 800-CLEARING-DT-TM-9-SHORT ')'
              logger.info("*160 CF50005-CLEARING-GRP ({}) NOT EQUALS  800-CLEARING-DT-TM-9-SHORT ({})", cf50005ClearingGrp.toString(), String.valueOf(work.getClearingDtTm9Short800())); 
          }

// *
          // MOVE CF50005-CLEARING-DT-X TO 800-CLEARING-DT-TM-9
          work.setClearingDtTm9800(padLeftZeros(12,cf50005ClearingGrp.getCf50005ClearingDtX(),false));
          clearingDtTm9800 = work.getClearingDtTm9800();
          cf50005ClearingDtX = cf50005ClearingGrp.getCf50005ClearingDtX();
//  IF CF50005-CLEARING-DT-X = 800-CLEARING-DT-TM-9
          if (compareChars(cf50005ClearingDtX,String.valueOf(work.getClearingDtTm9800String()).toCharArray()) == 0) { 
//  DISPLAY '*161 CF50005-CLEARING-DT-X (' CF50005-CLEARING-DT-X ') EQUALS' '  800-CLEARING-DT-TM-9 (' 800-CLEARING-DT-TM-9 ')'
              logger.info("*161 CF50005-CLEARING-DT-X ({}) EQUALS  800-CLEARING-DT-TM-9 ({})", new String(cf50005ClearingGrp.getCf50005ClearingDtX()), String.valueOf(work.getClearingDtTm9800())); 
          }
  
//  ELSE
          else { 
//  DISPLAY '*162 CF50005-CLEARING-DT-X (' CF50005-CLEARING-DT-X ') NOT EQUALS' '  800-CLEARING-DT-TM-9 (' 800-CLEARING-DT-TM-9 ')'
              logger.info("*162 CF50005-CLEARING-DT-X ({}) NOT EQUALS  800-CLEARING-DT-TM-9 ({})", new String(cf50005ClearingGrp.getCf50005ClearingDtX()), String.valueOf(work.getClearingDtTm9800())); 
          }
          cf50005ClearingDtN = cf50005ClearingGrp.getCf50005ClearingDtN();
          clearingDtTm9800 = work.getClearingDtTm9800();
//  IF CF50005-CLEARING-DT-N = 800-CLEARING-DT-TM-9
          if (	( cf50005ClearingDtN == clearingDtTm9800 )) { 
//  DISPLAY '*163 CF50005-CLEARING-DT-N (' CF50005-CLEARING-DT-N ') EQUALS' '  800-CLEARING-DT-TM-9 (' 800-CLEARING-DT-TM-9 ')'
              logger.info("*163 CF50005-CLEARING-DT-N ({}) EQUALS  800-CLEARING-DT-TM-9 ({})", String.valueOf(cf50005ClearingGrp.getCf50005ClearingDtN()), String.valueOf(work.getClearingDtTm9800())); 
          }
  
//  ELSE
          else { 
//  DISPLAY '*164 CF50005-CLEARING-DT-N (' CF50005-CLEARING-DT-N ') NOT EQUALS' '  800-CLEARING-DT-TM-9 (' 800-CLEARING-DT-TM-9 ')'
              logger.info("*164 CF50005-CLEARING-DT-N ({}) NOT EQUALS  800-CLEARING-DT-TM-9 ({})", String.valueOf(cf50005ClearingGrp.getCf50005ClearingDtN()), String.valueOf(work.getClearingDtTm9800())); 
          }
          // MOVE '2021050P1Q' TO CF50005-CLEARING-GRP
          //  LITERAL_2021050P1Q = '2021050P1Q'
          cf50005ClearingGrp.setString(CONSTANTS.LITERAL_2021050P1Q);
          // MOVE CF50005-CLEARING-DT-X TO 800-CLEARING-DT-TM-9
          work.setClearingDtTm9800(padLeftZeros(12,cf50005ClearingGrp.getCf50005ClearingDtX(),false));
          clearingDtTm9800 = work.getClearingDtTm9800();
          cf50005ClearingDtX = cf50005ClearingGrp.getCf50005ClearingDtX();
//  IF CF50005-CLEARING-DT-X = 800-CLEARING-DT-TM-9
          if (compareChars(cf50005ClearingDtX,String.valueOf(work.getClearingDtTm9800String()).toCharArray()) == 0) { 
//  DISPLAY '*165 CF50005-CLEARING-DT-X (' CF50005-CLEARING-DT-X ') EQUALS' '  800-CLEARING-DT-TM-9 (' 800-CLEARING-DT-TM-9 ')'
              logger.info("*165 CF50005-CLEARING-DT-X ({}) EQUALS  800-CLEARING-DT-TM-9 ({})", new String(cf50005ClearingGrp.getCf50005ClearingDtX()), String.valueOf(work.getClearingDtTm9800())); 
          }
  
//  ELSE
          else { 
//  DISPLAY '*166 CF50005-CLEARING-DT-X (' CF50005-CLEARING-DT-X ') NOT EQUALS' '  800-CLEARING-DT-TM-9 (' 800-CLEARING-DT-TM-9 ')'
              logger.info("*166 CF50005-CLEARING-DT-X ({}) NOT EQUALS  800-CLEARING-DT-TM-9 ({})", new String(cf50005ClearingGrp.getCf50005ClearingDtX()), String.valueOf(work.getClearingDtTm9800())); 
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
          cf50005ClearingGrp.setCf50005ClearingDtX(CONSTANTS.LITERAL_ABCDEFGH);
          // MOVE CF50005-CLEARING-DT-X TO 800-CLEARING-DT-TM-9
          work.setClearingDtTm9800(padLeftZeros(12,cf50005ClearingGrp.getCf50005ClearingDtX(),false));
          clearingDtTm9800 = work.getClearingDtTm9800();
          cf50005ClearingDtX = cf50005ClearingGrp.getCf50005ClearingDtX();
//  IF CF50005-CLEARING-DT-X = 800-CLEARING-DT-TM-9
          if (compareChars(cf50005ClearingDtX,String.valueOf(work.getClearingDtTm9800String()).toCharArray()) == 0) { 
//  DISPLAY '*169 CF50005-CLEARING-DT-X (' CF50005-CLEARING-DT-X ') EQUALS' '  800-CLEARING-DT-TM-9 (' 800-CLEARING-DT-TM-9 ')'
              logger.info("*169 CF50005-CLEARING-DT-X ({}) EQUALS  800-CLEARING-DT-TM-9 ({})", new String(cf50005ClearingGrp.getCf50005ClearingDtX()), String.valueOf(work.getClearingDtTm9800())); 
          }
  
//  ELSE
          else { 
//  DISPLAY '*170 CF50005-CLEARING-DT-X (' CF50005-CLEARING-DT-X ') NOT EQUALS' '  800-CLEARING-DT-TM-9 (' 800-CLEARING-DT-TM-9 ')'
              logger.info("*170 CF50005-CLEARING-DT-X ({}) NOT EQUALS  800-CLEARING-DT-TM-9 ({})", new String(cf50005ClearingGrp.getCf50005ClearingDtX()), String.valueOf(work.getClearingDtTm9800())); 
          }
          cf50005ClearingDtN = cf50005ClearingGrp.getCf50005ClearingDtN();
          clearingDtTm9800 = work.getClearingDtTm9800();
//  IF CF50005-CLEARING-DT-N = 800-CLEARING-DT-TM-9
          if (	( cf50005ClearingDtN == clearingDtTm9800 )) { 
//  DISPLAY '*171 CF50005-CLEARING-DT-N (' CF50005-CLEARING-DT-N ') EQUALS' '  800-CLEARING-DT-TM-9 (' 800-CLEARING-DT-TM-9 ')'
              logger.info("*171 CF50005-CLEARING-DT-N ({}) EQUALS  800-CLEARING-DT-TM-9 ({})", String.valueOf(cf50005ClearingGrp.getCf50005ClearingDtN()), String.valueOf(work.getClearingDtTm9800())); 
          }
  
//  ELSE
          else { 
//  DISPLAY '*172 CF50005-CLEARING-DT-N (' CF50005-CLEARING-DT-N ') NOT EQUALS' '  800-CLEARING-DT-TM-9 (' 800-CLEARING-DT-TM-9 ')'
              logger.info("*172 CF50005-CLEARING-DT-N ({}) NOT EQUALS  800-CLEARING-DT-TM-9 ({})", String.valueOf(cf50005ClearingGrp.getCf50005ClearingDtN()), String.valueOf(work.getClearingDtTm9800())); 
          }

// * Same as above but with arrays
          // MOVE '2021050410' TO CF50005-CLEARING-GRP
          //  LITERAL_2021050410 = '2021050410'
          cf50005ClearingGrp.setString(CONSTANTS.LITERAL_2021050410);
          // MOVE 3 TO I
          //  LITERAL_3 = 3
          work.setI(3);

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
          clearingDtTm9ShortGrp900.getClearingDtTm9ShortAry900(work.getI() - 1).setClearingDtTm9Short900(cf50005ClearingGrp.toCharArray());
//  IF CF50005-CLEARING-GRP = 900-CLEARING-DT-TM-9-SHORT (I)
          if (compareChars(cf50005ClearingGrp,String.valueOf(clearingDtTm9ShortGrp900.getClearingDtTm9ShortAry900(work.getI() - 1).getClearingDtTm9Short900String()).toCharArray()) == 0) { 
//  DISPLAY '*175 CF50005-CLEARING-GRP (' CF50005-CLEARING-GRP ') EQUALS' '  900-CLEARING-DT-TM-9-SHORT (I) (' 900-CLEARING-DT-TM-9-SHORT (I) ')'
              logger.info("*175 CF50005-CLEARING-GRP ({}) EQUALS  900-CLEARING-DT-TM-9-SHORT (I) ({})", cf50005ClearingGrp.toString(), String.valueOf(clearingDtTm9ShortGrp900.getClearingDtTm9ShortAry900(work.getI() - 1).getClearingDtTm9Short900())); 
          }
//  ELSE
          else { 
//  DISPLAY '*176 CF50005-CLEARING-GRP (' CF50005-CLEARING-GRP ') NOT EQUALS' '  900-CLEARING-DT-TM-9-SHORT (I) (' 900-CLEARING-DT-TM-9-SHORT (I) ')'
              logger.info("*176 CF50005-CLEARING-GRP ({}) NOT EQUALS  900-CLEARING-DT-TM-9-SHORT (I) ({})", cf50005ClearingGrp.toString(), String.valueOf(clearingDtTm9ShortGrp900.getClearingDtTm9ShortAry900(work.getI() - 1).getClearingDtTm9Short900())); 
          }

// *
//  MOVE CF50005-CLEARING-DT-X TO 900-CLEARING-DT-TM-9 (I)
          clearingDtTm9Grp900.getClearingDtTm9Ary900(work.getI() - 1).setClearingDtTm9900(padLeftZeros(12,cf50005ClearingGrp.getCf50005ClearingDtX(),false));
          cf50005ClearingDtX = cf50005ClearingGrp.getCf50005ClearingDtX();
//  IF CF50005-CLEARING-DT-X = 900-CLEARING-DT-TM-9 (I)
          if (compareChars(cf50005ClearingDtX,String.valueOf(clearingDtTm9Grp900.getClearingDtTm9Ary900(work.getI() - 1).getClearingDtTm9900String()).toCharArray()) == 0) { 
//  DISPLAY '*177 CF50005-CLEARING-DT-X (' CF50005-CLEARING-DT-X ') EQUALS' '  900-CLEARING-DT-TM-9 (I) (' 900-CLEARING-DT-TM-9 (I) ')'
              logger.info("*177 CF50005-CLEARING-DT-X ({}) EQUALS  900-CLEARING-DT-TM-9 (I) ({})", new String(cf50005ClearingGrp.getCf50005ClearingDtX()), String.valueOf(clearingDtTm9Grp900.getClearingDtTm9Ary900(work.getI() - 1).getClearingDtTm9900())); 
          }
  
//  ELSE
          else { 
//  DISPLAY '*178 CF50005-CLEARING-DT-X (' CF50005-CLEARING-DT-X ') NOT EQUALS' '  900-CLEARING-DT-TM-9 (I) (' 900-CLEARING-DT-TM-9 (I) ')'
              logger.info("*178 CF50005-CLEARING-DT-X ({}) NOT EQUALS  900-CLEARING-DT-TM-9 (I) ({})", new String(cf50005ClearingGrp.getCf50005ClearingDtX()), String.valueOf(clearingDtTm9Grp900.getClearingDtTm9Ary900(work.getI() - 1).getClearingDtTm9900())); 
          }
          cf50005ClearingDtN = cf50005ClearingGrp.getCf50005ClearingDtN();
//  IF CF50005-CLEARING-DT-N = 900-CLEARING-DT-TM-9 (I)
          if (	( cf50005ClearingDtN == clearingDtTm9Grp900.getClearingDtTm9Ary900(work.getI() - 1).getClearingDtTm9900() )) { 
//  DISPLAY '*179 CF50005-CLEARING-DT-N (' CF50005-CLEARING-DT-N ') EQUALS' '  900-CLEARING-DT-TM-9 (I) (' 900-CLEARING-DT-TM-9 (I) ')'
              logger.info("*179 CF50005-CLEARING-DT-N ({}) EQUALS  900-CLEARING-DT-TM-9 (I) ({})", String.valueOf(cf50005ClearingGrp.getCf50005ClearingDtN()), String.valueOf(clearingDtTm9Grp900.getClearingDtTm9Ary900(work.getI() - 1).getClearingDtTm9900())); 
          }
  
//  ELSE
          else { 
//  DISPLAY '*180 CF50005-CLEARING-DT-N (' CF50005-CLEARING-DT-N ') NOT EQUALS' '  900-CLEARING-DT-TM-9 (I) (' 900-CLEARING-DT-TM-9 (I) ')'
              logger.info("*180 CF50005-CLEARING-DT-N ({}) NOT EQUALS  900-CLEARING-DT-TM-9 (I) ({})", String.valueOf(cf50005ClearingGrp.getCf50005ClearingDtN()), String.valueOf(clearingDtTm9Grp900.getClearingDtTm9Ary900(work.getI() - 1).getClearingDtTm9900())); 
          }

// *
          // MOVE '2021050P1Q' TO CF50005-CLEARING-GRP
          //  LITERAL_2021050P1Q = '2021050P1Q'
          cf50005ClearingGrp.setString(CONSTANTS.LITERAL_2021050P1Q);
//  MOVE CF50005-CLEARING-DT-X TO 900-CLEARING-DT-TM-9 (I)
          clearingDtTm9Grp900.getClearingDtTm9Ary900(work.getI() - 1).setClearingDtTm9900(padLeftZeros(12,cf50005ClearingGrp.getCf50005ClearingDtX(),false));
          cf50005ClearingDtX = cf50005ClearingGrp.getCf50005ClearingDtX();
//  IF CF50005-CLEARING-DT-X = 900-CLEARING-DT-TM-9 (I)
          if (compareChars(cf50005ClearingDtX,String.valueOf(clearingDtTm9Grp900.getClearingDtTm9Ary900(work.getI() - 1).getClearingDtTm9900String()).toCharArray()) == 0) { 
//  DISPLAY '*181 CF50005-CLEARING-DT-X (' CF50005-CLEARING-DT-X ') EQUALS' '  900-CLEARING-DT-TM-9 (I) (' 900-CLEARING-DT-TM-9 (I) ')'
              logger.info("*181 CF50005-CLEARING-DT-X ({}) EQUALS  900-CLEARING-DT-TM-9 (I) ({})", new String(cf50005ClearingGrp.getCf50005ClearingDtX()), String.valueOf(clearingDtTm9Grp900.getClearingDtTm9Ary900(work.getI() - 1).getClearingDtTm9900())); 
          }
  
//  ELSE
          else { 
//  DISPLAY '*182 CF50005-CLEARING-DT-X (' CF50005-CLEARING-DT-X ') NOT EQUALS' '  900-CLEARING-DT-TM-9 (I) (' 900-CLEARING-DT-TM-9 (I) ')'
              logger.info("*182 CF50005-CLEARING-DT-X ({}) NOT EQUALS  900-CLEARING-DT-TM-9 (I) ({})", new String(cf50005ClearingGrp.getCf50005ClearingDtX()), String.valueOf(clearingDtTm9Grp900.getClearingDtTm9Ary900(work.getI() - 1).getClearingDtTm9900())); 
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
          cf50005ClearingGrp.setCf50005ClearingDtX(CONSTANTS.LITERAL_ABCDEFGH);
//  MOVE CF50005-CLEARING-DT-X TO 900-CLEARING-DT-TM-9 (I)
          clearingDtTm9Grp900.getClearingDtTm9Ary900(work.getI() - 1).setClearingDtTm9900(padLeftZeros(12,cf50005ClearingGrp.getCf50005ClearingDtX(),false));
          cf50005ClearingDtX = cf50005ClearingGrp.getCf50005ClearingDtX();
//  IF CF50005-CLEARING-DT-X = 900-CLEARING-DT-TM-9 (I)
          if (compareChars(cf50005ClearingDtX,String.valueOf(clearingDtTm9Grp900.getClearingDtTm9Ary900(work.getI() - 1).getClearingDtTm9900String()).toCharArray()) == 0) { 
//  DISPLAY '*185 CF50005-CLEARING-DT-X (' CF50005-CLEARING-DT-X ') EQUALS' '  900-CLEARING-DT-TM-9 (I) (' 900-CLEARING-DT-TM-9 (I) ')'
              logger.info("*185 CF50005-CLEARING-DT-X ({}) EQUALS  900-CLEARING-DT-TM-9 (I) ({})", new String(cf50005ClearingGrp.getCf50005ClearingDtX()), String.valueOf(clearingDtTm9Grp900.getClearingDtTm9Ary900(work.getI() - 1).getClearingDtTm9900())); 
          }
  
//  ELSE
          else { 
//  DISPLAY '*186 CF50005-CLEARING-DT-X (' CF50005-CLEARING-DT-X ') NOT EQUALS' '  900-CLEARING-DT-TM-9 (I) (' 900-CLEARING-DT-TM-9 (I) ')'
              logger.info("*186 CF50005-CLEARING-DT-X ({}) NOT EQUALS  900-CLEARING-DT-TM-9 (I) ({})", new String(cf50005ClearingGrp.getCf50005ClearingDtX()), String.valueOf(clearingDtTm9Grp900.getClearingDtTm9Ary900(work.getI() - 1).getClearingDtTm9900())); 
          }
          cf50005ClearingDtN = cf50005ClearingGrp.getCf50005ClearingDtN();
//  IF CF50005-CLEARING-DT-N = 900-CLEARING-DT-TM-9 (I)
          if (	( cf50005ClearingDtN == clearingDtTm9Grp900.getClearingDtTm9Ary900(work.getI() - 1).getClearingDtTm9900() )) { 
//  DISPLAY '*187 CF50005-CLEARING-DT-N (' CF50005-CLEARING-DT-N ') EQUALS' '  900-CLEARING-DT-TM-9 (I) (' 900-CLEARING-DT-TM-9 (I) ')'
              logger.info("*187 CF50005-CLEARING-DT-N ({}) EQUALS  900-CLEARING-DT-TM-9 (I) ({})", String.valueOf(cf50005ClearingGrp.getCf50005ClearingDtN()), String.valueOf(clearingDtTm9Grp900.getClearingDtTm9Ary900(work.getI() - 1).getClearingDtTm9900())); 
          }
  
//  ELSE
          else { 
//  DISPLAY '*188 CF50005-CLEARING-DT-N (' CF50005-CLEARING-DT-N ') NOT EQUALS' '  900-CLEARING-DT-TM-9 (I) (' 900-CLEARING-DT-TM-9 (I) ')'
              logger.info("*188 CF50005-CLEARING-DT-N ({}) NOT EQUALS  900-CLEARING-DT-TM-9 (I) ({})", String.valueOf(cf50005ClearingGrp.getCf50005ClearingDtN()), String.valueOf(clearingDtTm9Grp900.getClearingDtTm9Ary900(work.getI() - 1).getClearingDtTm9900())); 
          }

// *
//  MOVE 300-PRE-EDIT-VERSION TO 600-PE-VERSION-NUM
          peVersionNumMsg600.setPeVersionNum600(preEditVersionGroup300.getPreEditVersion300());
//  DISPLAY '*191 300-PE-VER-YY      = ' 300-PE-VER-YY
          logger.info("*191 300-PE-VER-YY      = {}", new String(preEditVersionGroup300.getPreEditVersion300Redefined().getPeVerYy300())); 
//  DISPLAY '*192 300-PE-RELEASE     = ' 300-PE-RELEASE
          logger.info("*192 300-PE-RELEASE     = {}", new String(preEditVersionGroup300.getPreEditVersion300Redefined().getPeRelease300())); 
//  DISPLAY '*193 300-PE-VER-SEQUENCE= ' 300-PE-VER-SEQUENCE
          logger.info("*193 300-PE-VER-SEQUENCE= {}", new String(preEditVersionGroup300.getPreEditVersion300Redefined().getPeVerSequence300())); 
//  DISPLAY '*194 600-PE-VERSION-NUM = ' 600-PE-VERSION-NUM
          logger.info("*194 600-PE-VERSION-NUM = {}", new String(peVersionNumMsg600.getPeVersionNum600())); 
//  DISPLAY '*195 600-PE-VERSION-NUM-MSG = ' 600-PE-VERSION-NUM-MSG
          logger.info("*195 600-PE-VERSION-NUM-MSG = {}", peVersionNumMsg600.toString()); 

// *
//  INITIALIZE IP31021-SUMMARY-CONTROL-CARD IP31021-INPUT-SOURCE IP31021-SUMMARY-SIF IP31021-SUMMARY-CYCLE 800-INPUT-VARS 800-INPUT-TABLE-ID 800-INPUT-SEG-ID IP500041-REC
          ip31021SummaryControlCard.initialize();
          ip31021SummaryControlCard.setIp31021InputSource(CONSTANTS.SPACE_10 /* Fill 10 Spaces*/);
          ip31021SummaryControlCard.setIp31021SummarySif(CONSTANTS.SPACE /* Fill 1 Spaces*/);
          ip31021SummaryControlCard.setIp31021SummaryCycle(0);
          inputVars800.initialize();
          inputVars800.setInputTableId800(0);
          inputVars800.setInputSegId800(CONSTANTS.SPACE_4 /* Fill 4 Spaces*/);
          ip500041Rec.initialize();
          // MOVE '0000000001' TO IP31021-INPUT-SOURCE
          //  LITERAL_0000000001 = '0000000001'
          ip31021SummaryControlCard.setIp31021InputSource(CONSTANTS.LITERAL_0000000001);
          // MOVE '00000000001' TO IP500041-TABLE-ID
          //  LITERAL_00000000001 = '00000000001'
          ip500041Rec.setIp500041TableId(CONSTANTS.LITERAL_00000000001);
          // MOVE IP31021-INPUT-SOURCE TO 800-INPUT-TABLE-ID
          inputVars800.setInputTableId800(padLeftZeros(11,ip31021SummaryControlCard.getIp31021InputSource(),false));
          inputTableId800 = inputVars800.getInputTableId800();
          ip500041TableId = ip500041Rec.getIp500041TableId();
//  IF IP500041-TABLE-ID = 800-INPUT-TABLE-ID
          if (compareChars(ip500041TableId,String.valueOf(inputVars800.getInputTableId800String()).toCharArray()) == 0) { 
//  DISPLAY '*196 SUCCESS '
              logger.info("*196 SUCCESS "); 
          }
  
//  ELSE
          else { 
//  DISPLAY '*197 FAILURE '
              logger.info("*197 FAILURE "); 
          }
//  INITIALIZE CF20004-TABLE-DATA
          cf20004TableData.initialize();
          // MOVE ALL '0' TO CF20004-ITEMS (1 : 256)
          cf20004TableData.replace(CONSTANTS.LITERAL_1907030827,33,256);
//  DISPLAY '*198 CF20004-ITEMS = ' CF20004-ITEMS
          logger.info("*198 CF20004-ITEMS = {}", new String(cf20004Data.getCf20004Items())); 
  
          // MOVE CF20004-TABLE-DATA TO CF20004-TABLE-ENTS
          work.setCf20004TableEnts(cf20004TableData.toCharArray());
//  DISPLAY '*199 CF20004-TABLE-ENTS = ' CF20004-TABLE-ENTS
          logger.info("*199 CF20004-TABLE-ENTS = {}", new String(work.getCf20004TableEnts())); 

// *
//  MOVE ALL '*' TO 700-SORT-KEY-LTH-TABLE
          sortKeyLthTable700.setString(CONSTANTS.LITERAL_2032398511);
//  MOVE ALL 'B' TO 700-TABLE-ID (1)
          sortKeyLthTable700.getSortKeyLthEntry700(0).setTableId700(CONSTANTS.LITERAL_BBBBBBBB);
//  MOVE ALL 'C' TO 700-TABLE-ID (2)
          sortKeyLthTable700.getSortKeyLthEntry700(1).setTableId700(CONSTANTS.LITERAL_CCCCCCCC);
//  MOVE ALL 'D' TO 700-TABLE-ID (3)
          sortKeyLthTable700.getSortKeyLthEntry700(2).setTableId700(CONSTANTS.LITERAL_DDDDDDDD);
//  MOVE ALL 'E' TO 700-TABLE-ID (4)
          sortKeyLthTable700.getSortKeyLthEntry700(3).setTableId700(CONSTANTS.LITERAL_EEEEEEEE);
//  MOVE 'ABCDEFGH' TO 700-TABLE-ID (16)
//  LITERAL_ABCDEFGH = 'ABCDEFGH'
          sortKeyLthTable700.getSortKeyLthEntry700(15).setTableId700(CONSTANTS.LITERAL_ABCDEFGH);

// *
//  PERFORM VARYING INX-A FROM 1 BY 1 UNTIL INX-A > 10
          for (inxA = 1; (	( inxA <= 10 )) ; inxA = inxA + 1 ) {
//  EVALUATE INX-A
              switch(inxA){
              	case 1:
//  MOVE ALL 'A' TO TABLE-ITEM ( INX-A )
                  tableArray.setTableItem((inxA - 1),CONSTANTS.LITERAL_AAAAAAAA);
              break;
              	case 2:
//  MOVE ALL 'B' TO TABLE-ITEM ( INX-A )
                  tableArray.setTableItem((inxA - 1),CONSTANTS.LITERAL_BBBBBBBB);
              break;
              	case 3:
//  MOVE ALL 'C' TO TABLE-ITEM ( INX-A )
                  tableArray.setTableItem((inxA - 1),CONSTANTS.LITERAL_CCCCCCCC);
              break;
              	case 4:
//  MOVE ALL 'D' TO TABLE-ITEM ( INX-A )
                  tableArray.setTableItem((inxA - 1),CONSTANTS.LITERAL_DDDDDDDD);
              break;
              	case 5:
//  MOVE ALL 'E' TO TABLE-ITEM ( INX-A )
                  tableArray.setTableItem((inxA - 1),CONSTANTS.LITERAL_EEEEEEEE);
              break;
              	case 6:
//  MOVE ALL 'F' TO TABLE-ITEM ( INX-A )
                  tableArray.setTableItem((inxA - 1),CONSTANTS.LITERAL_FFFFFFFF);
              break;
              	case 7:
//  MOVE ALL 'G' TO TABLE-ITEM ( INX-A )
                  tableArray.setTableItem((inxA - 1),CONSTANTS.LITERAL_GGGGGGGG);
              break;
              	case 8:
//  MOVE ALL 'H' TO TABLE-ITEM ( INX-A )
                  tableArray.setTableItem((inxA - 1),CONSTANTS.LITERAL_HHHHHHHH);
              break;
              	case 9:
//  MOVE ALL 'I' TO TABLE-ITEM ( INX-A )
                  tableArray.setTableItem((inxA - 1),CONSTANTS.LITERAL_IIIIIIII);
              break;
              	case 10:
//  MOVE ALL 'J' TO TABLE-ITEM ( INX-A )
                  tableArray.setTableItem((inxA - 1),CONSTANTS.LITERAL_JJJJJJJJ);
              break;
              default :
//  MOVE ALL 'Z' TO TABLE-ITEM ( INX-A )
                  tableArray.setTableItem((inxA - 1),CONSTANTS.LITERAL_ZZZZZZZZ);
              }
          }

// *
//  SET INX-A TO 10
          inxA = 10; 
          
//  SET INX-B TO INX-A
          inxBGroup.setInxB(TABLE_ITEM_LENGTH * ( ((inxA < 1) ? 1:inxA) - 1)); 
          
          inxB = inxBGroup.getInxB();
//  IF INX-A = INX-B THEN
          if (	( inxA == ( inxB / 8 ) + 1  )) { 
//  DISPLAY '*200 INX-A = INX-B'
              logger.info("*200 INX-A = INX-B"); 
          }
  
//  DISPLAY '*201 INX-B-BIN =  ' INX-B-BIN
          logger.info("*201 INX-B-BIN =  {}", String.valueOf(inxBGroup.getInxBBin())); 

// *
//  DISPLAY 'IN LOOP'
          logger.info("IN LOOP"); 
//  PERFORM VARYING INX-A FROM 1 BY 1 UNTIL INX-A > INX-B
          for (inxA = 1; (	( inxA <= ( inxBGroup.getInxB() / 8 ) + 1  )) ; inxA = inxA + 1 ) {
//  DISPLAY '*202 ' TABLE-ITEM ( INX-A )
              logger.info("*202 {}", new String(tableArray.getTableItem(inxA - 1))); 
          }

// *
//  DISPLAY '*203 INX-A = 6'
          logger.info("*203 INX-A = 6"); 
//  DISPLAY '*204 ---------'
          logger.info("*204 ---------"); 
//  SET INX-A TO 3
          inxA = 3; 
          
//  SET INX-B TO INX-A
          inxBGroup.setInxB(TABLE_ITEM_LENGTH * ( ((inxA < 1) ? 1:inxA) - 1)); 
          
//  DISPLAY '*205 INX-B-BIN =  ' INX-B-BIN
          logger.info("*205 INX-B-BIN =  {}", String.valueOf(inxBGroup.getInxBBin())); 

// *
//  SET INX-A TO 6
          inxA = 6; 
          
//  DISPLAY '*206 ** ' TABLE-ITEM ( INX-A )
          logger.info("*206 ** {}", new String(tableArray.getTableItem(inxA - 1))); 
      
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
      private void mainSplit5() throws Exception {
			// Declare local variables used in the method
			Ip43501SortSolution ip43501SortSolution = ip43501ErrorInfoRec.getIp43501SortSolution();
			Report1HeadingLine11701 report1HeadingLine11701 = grp1.getReport1HeadingLine11701();
			DtlCntZ800 dtlCntZ800 = dtlCnt800.getDtlCntZ800();
			long dtlCntZo800 = 0;
			// End of variable declaration

//  SET INX-A TO INX-B
          inxA = (inxBGroup.getInxB()/TABLE_ITEM_LENGTH) + 1 ; 
          
//  DISPLAY '*207 ** ' TABLE-ITEM ( INX-A )
          logger.info("*207 ** {}", new String(tableArray.getTableItem(inxA - 1))); 

// *
// * Indirect reference of inx-b via inx-b-bin
// *
//  DISPLAY '*208 700-TABLE-ID (INX-B-BIN) = ' 700-TABLE-ID ( INX-B-BIN )
          logger.info("*208 700-TABLE-ID (INX-B-BIN) = {}", new String(sortKeyLthTable700.getSortKeyLthEntry700((int) inxBGroup.getInxBBin() - 1).getTableId700())); 

// *
// * Below one is crazy...
// *
// *    set inx-c to inx-b
// *    display '700-table-id (inx-c) = ' 700-table-id (inx-c)
// *
// * this one works fine
// *
//  SET INX-C TO INX-A
          inxC = inxA; 
          
//  DISPLAY '*209 700-TABLE-ID (INX-C) = ' 700-TABLE-ID ( INX-C )
          logger.info("*209 700-TABLE-ID (INX-C) = {}", new String(sortKeyLthTable700.getSortKeyLthEntry700(inxC - 1).getTableId700())); 

// *
//  SET INX-D TO INX-B
          inxD = inxBGroup.getInxB(); 
          
//  SET INX-A TO INX-D
          inxA = (inxD/TABLE_ITEM_LENGTH) + 1 ; 
          
//  DISPLAY '*210 ** ' TABLE-ITEM ( INX-A )
          logger.info("*210 ** {}", new String(tableArray.getTableItem(inxA - 1))); 

// * Mc143
//  INITIALIZE IP43501-ERROR-INFO-REC
          ip43501ErrorInfoRec.initialize();
//  DISPLAY '*211 ' WS-GRP-1
          logger.info("*211 {}", grp1.toString()); 
          // MOVE 2 TO IP43501-EI-SOURCE-MSG-NUM
          //  LITERAL_2 = 2
          ip43501ErrorInfoRec.getIp43501SortSolution().setIp43501EiSourceMsgNum((long)2);
  
//  MOVE IP43501-EI-SOURCE-MSG-NUM (2 : 9) TO 701-SOURCE-MESSAGE-NO
          report1HeadingLine11701.setSourceMessageNo701(String.valueOf(substring(ip43501ErrorInfoRec.getIp43501SortSolution().getIp43501EiSourceMsgNumString(),1,10)).toCharArray());
  
//  DISPLAY '*212 ' 701-REPORT-1-HEADING-LINE-11
          logger.info("*212 {}", grp1.getReport1HeadingLine11701().toString()); 

// *
          // MOVE WHEN-COMPILED TO MCISSUES-WHEN-COMPILED
          //  FORMAT1311677340 = "X(08)BX(08)"
          work.setMcissuesWhenCompiled(CFUtil.cobolAnEditFormatter(CONSTANTS.FORMAT1311677340,CONSTANTS.LITERAL_2016092150));
//  DISPLAY '*213 MCISSUES-WHEN-COMPILED = ' MCISSUES-WHEN-COMPILED
          logger.info("*213 MCISSUES-WHEN-COMPILED = {}", new String(work.getMcissuesWhenCompiled())); 

// *
          // MOVE '123456' TO 800-DTL-CNT-ZO
          //  LITERAL_123456 = '123456'
          dtlCnt800.getDtlCntZ800().setDtlCntZo800((long)123456);
  
//  INITIALIZE 800-DTL-RECORD-3 800-DTL-COUNT 800-DTL-RECORD-4 800-DTL-LAST
          dtlRecord3800.initialize();
          dtlRecord3800.setDtlCount800(CONSTANTS.SPACE_10 /* Fill 10 Spaces*/);
          dtlRecord4800.initialize();
          dtlRecord4800.setDtlLast800(CONSTANTS.SPACE /* Fill 1 Spaces*/);
//  SET 88-800-SYS201-L03 TO TRUE
          work.setSys201L0388800True(); 
          
//  DISPLAY '*214 * 800-DTL-CNT    = (' 800-DTL-CNT ')'
          logger.info("*214 * 800-DTL-CNT    = ({})", dtlCnt800.toString()); 
//  DISPLAY '*215 * 800-DTL-CNT-A  = (' 800-DTL-CNT-A ')'
          logger.info("*215 * 800-DTL-CNT-A  = ({})", new String(dtlCnt800.getDtlCntA800())); 
//  DISPLAY '*216 * 800-DTL-CNT-ZO = (' 800-DTL-CNT-ZO ')'
          logger.info("*216 * 800-DTL-CNT-ZO = ({})", String.valueOf(dtlCntZ800.getDtlCntZo800())); 
  

// *
          dtlCntZo800 = dtlCntZ800.getDtlCntZo800();
//  IF 800-DTL-CNT-ZO > 0
//  LITERAL_0 = 0
          if (	( dtlCntZo800 > 0 ) ) { 
              // MOVE ZEROS TO 400-I-CTR
              work.setICtr400((short) 0);
//  PERFORM VARYING 400-I-CTR FROM 300-VALUE-1 BY 300-VALUE-1 UNTIL 400-I-CTR > 300-VALUE-10
              for (work.setICtr400((short) work.getValue1300()); (	( work.getICtr400() <= work.getValue10300() ) ) ; work.setICtr400((short)(work.getICtr400() +  work.getValue1300())) ) {
                  dtlCntZo800 = dtlCntZ800.getDtlCntZo800();
//  IF 800-DTL-CNT-ZO ( 400-I-CTR : 1) > 0
//  LITERAL_0 = 0
                  if (compareChars(substring(dtlCntZ800.getDtlCntZo800String(),(work.getICtr400()-1), (work.getICtr400() + 0) ),CONSTANTS.LITERAL_0) > 0) { 
//  MOVE 800-DTL-CNT-ZO ( 400-I-CTR : ) TO 800-DTL-COUNT
                      dtlRecord3800.setDtlCount800(String.valueOf(substring(dtlCnt800.getDtlCntZ800().getDtlCntZo800String(),(work.getICtr400()-1), (work.getICtr400() + 9) )).toCharArray());
//  ADD 300-VALUE-10 TO 400-I-CTR
                      work.setICtr400( (short) (work.getICtr400()+(short) work.getValue10300()));
                  }
  
              }
          }
  
//  DISPLAY '*217* 800-DTL-COUNT  = (' 800-DTL-COUNT ')'
          logger.info("*217* 800-DTL-COUNT  = ({})", new String(dtlRecord3800.getDtlCount800())); 

// *
          dtlCntZo800 = dtlCntZ800.getDtlCntZo800();
//  IF 800-DTL-CNT-ZO > 0
//  LITERAL_0 = 0
          if (	( dtlCntZo800 > 0 ) ) { 
              // MOVE ZEROES TO 400-I-CTR
              work.setICtr400((short) 0);
//  PERFORM VARYING 400-I-CTR FROM 300-VALUE-1 BY 300-VALUE-1 UNTIL 400-I-CTR > 300-VALUE-10
              for (work.setICtr400((short) work.getValue1300()); (	( work.getICtr400() <= work.getValue10300() ) ) ; work.setICtr400((short)(work.getICtr400() +  work.getValue1300())) ) {
                  dtlCntZo800 = dtlCntZ800.getDtlCntZo800();
//  IF 800-DTL-CNT-ZO ( 400-I-CTR : 1) > 0
//  LITERAL_0 = 0
                  if (compareChars(substring(dtlCntZ800.getDtlCntZo800String(),(work.getICtr400()-1), (work.getICtr400() + 0) ),CONSTANTS.LITERAL_0) > 0) { 
                      // MOVE 800-DTL-CNT-A ( 400-I-CTR : ) TO 800-DTL-COUNT
                      dtlRecord3800.replace(dtlCnt800/*parent*/,(work.getICtr400() - 1)/*fromOffset - (dtlCntA800) */,(10-(work.getICtr400() - 1))/*fromLen*/,0/*toOffset - (dtlCount800) */,10/*toLen*/);
//  ADD 300-VALUE-10 TO 400-I-CTR
                      work.setICtr400( (short) (work.getICtr400()+(short) work.getValue10300()));
                  }
  
              }
          }
  
//  DISPLAY '*218* 800-DTL-COUNT  = (' 800-DTL-COUNT ')'
          logger.info("*218* 800-DTL-COUNT  = ({})", new String(dtlRecord3800.getDtlCount800())); 

// *
//  PERFORM 9000-MOVE-EDIT-FIELDS THRU 9000-EXIT
          moveEditFields();/*9000-MOVE-EDIT-FIELDS*/
          if (this.isProgramEnded()) {
              return ;
          }

// *
//  MOVE 300-C-0071 TO IP00104-ELSUB
          work.setIp00104Elsub(padLeftZeros(3,work.getC0071300(),false));
//  DISPLAY '*221* 300-C-0071     = (' 300-C-0071 ')'
          logger.info("*221* 300-C-0071     = ({})", new String(work.getC0071300())); 
//  DISPLAY '*222* IP00104-ELSUB  = (' IP00104-ELSUB ')'
          logger.info("*222* IP00104-ELSUB  = ({})", String.valueOf(work.getIp00104Elsub())); 

// *

// *
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          this.setProgramEnded(true);
          return ;
      
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
      private void findMoveReplaceText() throws Exception {
//  DISPLAY '*' IP00321-REPL-TEXT-COUNT '*2100-FIND-MOVE-REPLACE-TEXT'
          logger.info("*{}*2100-FIND-MOVE-REPLACE-TEXT", String.valueOf(work.getIp00321ReplTextCount())); 
      
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
      private void exit() throws Exception {
//  DISPLAY '*' IP00321-REPL-TEXT-COUNT '*2100-EXIT'
          logger.info("*{}*2100-EXIT", String.valueOf(work.getIp00321ReplTextCount())); 
      
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
      private void searchHolidayExclusion() throws Exception {
			// Declare local variables used in the method
			long interimJulianDate800 = 0;
			// End of variable declaration

      
// *

// *
//  IF 500-JULIAN-HOLIDAYS ( 500-HOLIDAY-INDEX ) IS NUMERIC
          if (        holidays500.julianHolidays500IsNumeric((holidayIndex500 - 1)) ) { 
//  IF 500-JULIAN-HOLIDAYS ( 500-HOLIDAY-INDEX ) EQUAL ZEROES
//  ELSE
              if (	( holidays500.getJulianHolidays500(holidayIndex500 - 1) != 0 )) { 
                  interimJulianDate800 = interimDateXGroup800.getInterimDate800().getInterimJulianDate800();
//  IF 800-INTERIM-JULIAN-DATE EQUAL 500-JULIAN-HOLIDAYS ( 500-HOLIDAY-INDEX )
                  if (	( interimJulianDate800 == holidays500.getJulianHolidays500(holidayIndex500 - 1) ) ) { 
//  DISPLAY '*108* MATCH FOUND '
                      logger.info("*108* MATCH FOUND "); 
//  DISPLAY '*109* 800-INTERIM-JULIAN-DATE = ' 800-INTERIM-JULIAN-DATE
                      logger.info("*109* 800-INTERIM-JULIAN-DATE = {}", String.valueOf(interimDateXGroup800.getInterimDate800().getInterimJulianDate800())); 
//  DISPLAY '*110* 500-JULIAN-HOLIDAYS(500-HOLIDAY-INDEX) = ' 500-JULIAN-HOLIDAYS ( 500-HOLIDAY-INDEX )
                      logger.info("*110* 500-JULIAN-HOLIDAYS(500-HOLIDAY-INDEX) = {}", String.valueOf(holidays500.getJulianHolidays500((holidayIndex500 - 1)))); 
//  SET 88-100-EXCLUSION-ON TO TRUE
                      work.setExclusionOn88100True(); 
                      
                  }
  
              }
          }
//  SET 500-HOLIDAY-INDEX UP BY 1
          holidayIndex500++; 
          
      
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
      private void moveEditFields() throws Exception {
          // MOVE 42060.77 TO WS-VAR1-N
          work.setVar1N(BigDecimal.valueOf(42060.77).setScale(2,RoundingMode.DOWN));
          // MOVE WS-VAR1-N TO WS-VAR1-ED
          //  FORMAT_1949449721 = "ZZZ,ZZZ,ZZ9.99"
          work.setVar1Ed(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1949449721,work.getVar1N().toPlainString().toCharArray()));
//  DISPLAY '*219* WS-VAR1-ED  = (' WS-VAR1-ED ')'
          logger.info("*219* WS-VAR1-ED  = ({})", new String(work.getVar1Ed())); 
          // MOVE WS-VAR1-ED TO WS-VAR2-ED
          work.setVar2Ed(work.getVar1Ed());
//  DISPLAY '*220* WS-VAR2-ED  = (' WS-VAR2-ED ')'
          logger.info("*220* WS-VAR2-ED  = ({})", new String(work.getVar2Ed())); 
          ;
      
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
