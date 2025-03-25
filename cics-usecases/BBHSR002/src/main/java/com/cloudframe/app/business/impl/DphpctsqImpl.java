package com.cloudframe.app.business.impl;
/*
 ******************************************************************
 * note - arith(extend) is used to increase numerics from 18 to
 * 31 digits. use this when calling 'get diagnostics' in db2.
 ******************************************************************
 *00******************************************************
 *00  licensed materials - property of united health group
 *00******************************************************
 *10**************************************************************
 *10***************************************************************
 *10                                                              *
 *10        program name      :   dphpctsq                        *
 *10        business function :   cache processing.               *
 *10        designed by       :                                   *
 *10        programmed by     :                                   *
 *10        date coded        :   july 2019                       *
 *10        frequency used    :   at the time of region startup   *
 *10        type              :   online                          *
 *10***************************************************************
 *20***************************************************************
 *20  this program builds/refreshes the cache used by d5427hpc.   *
 *20  this module will take data needed and place it into memory  *
 *20  (1 unique cache area per region).the
 *20  pointer to the cache areas will be saved in a local tsq     *
 *20  structure and referenced by d5427hpc.                       *
 *20                                                              *
 *20  note: this module should be invoked via a transaction that  *
 *20  has a tclass set to 1.  only 1 instance should be running   *
 *20  in any given region!!!                                      *
 *20  the cache transaction should be invoked as follows:         *
 *20   1.  hard coded as part of cics region startup.             *
 *20   2.  testing tran. from cics terminal.                      *
 *20   3.  dads - batch utility step.                             *
 ******************************************************************
 *20***************************************************************
 *30***************************************************************
 *30  program change log :                                        *
 *30                                                              *
 *30***************************************************************
 *30  date    programmer     change                               *
 *30***************************************************************
 *30  jul-19  manikanta      original for mdtr-2019-0514-1a-tops  *
 *30          srikakulapu &  to store db2 memory of hipaa_proc_cd *
 *30          ramcharan p    table using hpcl trans               *
 *30  rel2304 manikanta      mdtr-2023-0306-1a-tops to fix the    *
 *30          & bharath      overflow condtion and create standard*
 *30                         log messages to write in msgusr spool*
 *30**************************************************************
 */

import com.cloudframe.app.business.Dphpctsq;
import com.cloudframe.app.cics.TransactionManager;
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.common.CommonProcess;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.dphpctsq.*;
import com.cloudframe.app.dto.dphpctsq.CacheTsqRecord;
import com.cloudframe.app.dto.dphpctsq.DfhcommareaGroup;
import com.cloudframe.app.dto.dphpctsq.DphpctsqCtx;
import com.cloudframe.app.dto.dphpctsq.DphpctsqCtx.*;
import com.cloudframe.app.dto.dphpctsq.Sqlca;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.repository.DphpctsqRepository;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.utility.DsntiarUtil;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("dphpctsq")
public class DphpctsqImpl extends CommonProcess implements Dphpctsq {

  Logger logger = LoggerFactory.getLogger(DphpctsqImpl.class);

  @Value("${DPHPCTSQ.dbQualifier:}")
  private String dbQualifier;

  @Autowired
  @Qualifier("dphpctsqRepository")
  DphpctsqRepository dphpctsqRepository;

  private static final int HEX_REMAINDER_LENGTH = 2;
  private int tallyCount = 0;

  public com.cloudframe.app.rest.dphpctsq.DfhcommareaGroup setCommarea(
      com.cloudframe.app.rest.dphpctsq.DfhcommareaGroup inputCommarea) throws Exception {
    DphpctsqCtx programCtx = new GlobalExecutorCtx().getContext(DphpctsqCtx.class);
    inputCommarea.setDfhcommareaGroup(programCtx.getDfhcommareaGroup());
    setInitDone(false);
    try {
      process(programCtx);
    } catch (Exception e) {
      handleExceptionForRest(e);
    } finally {
      clearVars();
    }
    inputCommarea.populateFrom(programCtx.getDfhcommareaGroup());
    return inputCommarea;
  }
  /**
   * process Input : None
   *
   * <p>Output : None
   *
   * @throws CFException
   */
  public int process(DphpctsqCtx programCtx) throws Exception {
    try {
      setCodePage("1047");
      // Reset program ended flag
      programCtx.setProgramEnded(false);
      db2Base.reset("DPHPCTSQ", dbQualifier, true /*use Dynamic SQL*/);
      // Added variable to get the output context in place.
      ProcessInCtx methodIn = programCtx.getProcessInCtx();
      //  cobolCode::PERFORM 0000-MAINLINE
      mainline(programCtx.getMainlineInCtx()); /*0000-MAINLINE*/
      if (programCtx.isProgramEnded()) {
        return programCtx.getRc();
      }
      //  cobolCode::PERFORM 0000-EXIT
      exit(programCtx.getExitInCtx()); /*0000-EXIT*/
      if (programCtx.isProgramEnded()) {
        return programCtx.getRc();
      }
    } catch (Exception e) {
      handleErrorCode(e);
      throw e;
    } finally {
      handleDbAtEnd(db2Base);
    }

    return programCtx.getRc(); // Exit with return code
    // end of process method
  }
  /**
   * mainline This method is derived from COBOL Paragraph - 0000-MAINLINE COBOL Cyclomatic
   * complexity - 30 Input :
   *
   * <p>- thisProgram COBOL Name: WS-THIS-PROGRAM - writetdqCommarea COBOL Name: WRITETDQ-COMMAREA -
   * cacheKeyCnt COBOL Name: CACHE-KEY-CNT - cacheDataCnt COBOL Name: CACHE-DATA-CNT - keyArrayMax
   * COBOL Name: WS-KEY-ARRAY-MAX - thresholdPercent COBOL Name: WS-THRESHOLD-PERCENT - dataArrayMax
   * COBOL Name: WS-DATA-ARRAY-MAX
   *
   * <p>Output :
   *
   * <p>- wtdqApplication COBOL Name: WTDQ-APPLICATION - message COBOL Name: WS-MESSAGE -
   * wtdqMessage COBOL Name: WTDQ-MESSAGE - wtdqMessageTyp COBOL Name: WTDQ-MESSAGE-TYP - resp COBOL
   * Name: WS-RESP - resp2 COBOL Name: WS-RESP2 - cicsAbendCode COBOL Name: CICS-ABEND-CODE -
   * display1 COBOL Name: WS-DISPLAY1 - cacheKeyCnt COBOL Name: CACHE-KEY-CNT - display2 COBOL Name:
   * WS-DISPLAY2 - cacheDataCnt COBOL Name: CACHE-DATA-CNT - cacheKeyThreshold COBOL Name:
   * CACHE-KEY-THRESHOLD - cacheDataThreshold COBOL Name: CACHE-DATA-THRESHOLD - thresholdPercentDis
   * COBOL Name: WS-THRESHOLD-PERCENT-DIS - percentCalc COBOL Name: WS-PERCENT-CALC -
   * cacheKeyThresholdPercent COBOL Name: CACHE-KEY-THRESHOLD-PERCENT - keyArrayMax COBOL Name:
   * WS-KEY-ARRAY-MAX - cacheDataThresholdPercent COBOL Name: CACHE-DATA-THRESHOLD-PERCENT -
   * display3 COBOL Name: WS-DISPLAY3 - dataArrayMax COBOL Name: WS-DATA-ARRAY-MAX - display4 COBOL
   * Name: WS-DISPLAY4
   *
   * @throws CFException
   */
  @Override
  public MainlineOutCtx mainline(MainlineInCtx methodIn) throws Exception {
    // Declare local variables used in the method
    ArrayList<char[]> charArray = new ArrayList<char[]>();
    char[] joinCharArray = null;
    Map<String, Object> updated = null;
    // End of variable declaration

    // Added variable to get the program context in place.
    DphpctsqCtx programCtx = methodIn.getDphpctsqCtx();
    // Added variable to get the output context in place.
    MainlineOutCtx methodOut = methodIn.getMainlineOutCtx();
    //  cobolCode::MOVE 'TOPS' TO WTDQ-APPLICATION
    //  LITERAL_TOPS = 'TOPS'
    methodOut.setWtdqApplication(CONSTANTS.LITERAL_TOPS);
    methodOut.setMessage(CONSTANTS.SPACE_80);
    //  cobolCode::MOVE SPACES TO WTDQ-MESSAGE
    methodOut.setWtdqMessage(CONSTANTS.SPACE_5000);
    //  cobolCode::STRING WS-THIS-PROGRAM DELIMITED BY SIZE X'4060E2E3C1D9E340C3C1C3C8C5' DELIMITED
    // BY SIZE INTO WTDQ-MESSAGE
    charArray = new ArrayList<char[]>();
    charArray.add(methodIn.getThisProgram());
    charArray.add(CONSTANTS.HEX_1);
    joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1));
    updated = updateString(methodOut.getWtdqMessage(), joinCharArray);
    methodOut.setWtdqMessage((char[]) updated.get("string"));

    // *    Into ws-message.
    //  cobolCode::SET WTDQ-INFO-MSG TO TRUE
    methodOut.setWtdqInfoMsgTrue();

    //  cobolCode::DISPLAY WRITETDQ-COMMAREA
    logger.info(methodIn.getWritetdqCommarea().toString());
    //  cobolCode::PERFORM 8000-RETRIEVE-INTERVAL THRU 8000-EXIT
    retrieveInterval(programCtx.getRetrieveIntervalInCtx()); /*8000-RETRIEVE-INTERVAL*/

    // *EXEC CICS
    // *  READQ TS
    // *  QNAME (WS-TS-QUEUE-NAME)
    // *  INTO  (WS-CACHE-TSQ-RECORD)
    // *  LENGTH(LENGTH OF WS-CACHE-TSQ-RECORD)
    // *  ITEM  (WS-TSQ-ITEM1)
    // *  RESP  (WS-RESP)
    // *  RESP2 (WS-RESP2)
    // *END-EXEC.
    //  cobolCode::READQ TS QNAME (WS-TS-QUEUE-NAME) INTO (WS-CACHE-TSQ-RECORD)
    // LENGTH(FUNCTION~LENGTH~WS-CACHE-TSQ-RECORD) ITEM (WS-TSQ-ITEM1) RESP (WS-RESP) RESP2
    // (WS-RESP2)

    // *EXEC CICS
    // *  READQ TS
    // *  QNAME (WS-TS-QUEUE-NAME)
    // *  INTO  (WS-CACHE-TSQ-RECORD)
    // *  LENGTH(LENGTH OF WS-CACHE-TSQ-RECORD)
    // *  ITEM  (WS-TSQ-ITEM1)
    // *  RESP  (WS-RESP)
    // *  RESP2 (WS-RESP2)
    // *END-EXEC.
    /**
     * The readQ - CICS operation retrieves data from a stored queue item in string format. When the
     * target element is a numeric or pointer variable, the string data must be converted to a
     * numeric format to ensure compatibility with the readQ - CICS statement.
     */
    methodIn
        .getCacheTsqRecord()
        .setString(
            TransactionManager.readQueue(
                programCtx.getCicsSession(),
                methodIn.getTsQueueName(),
                methodIn.getTsqItem1(),
                CacheTsqRecord.getCacheTsqRecordFieldLength()));
    //  cobolCode::MOVE EIBRESP TO WS-RESP
    methodOut.setResp(programCtx.getCicsSession().getEibresp());
    //  cobolCode::MOVE EIBRESP2 TO WS-RESP2
    methodOut.setResp2(programCtx.getCicsSession().getEibresp2());
    //  cobolCode::EVALUATE WS-RESP
    switch (methodOut.getResp()) {
      case 0:
        methodOut.setMessage(CONSTANTS.LITERAL_64728542);
        //  cobolCode::SET WTDQ-INFO-MSG TO TRUE
        methodOut.setWtdqInfoMsgTrue();

        //  cobolCode::DISPLAY WRITETDQ-COMMAREA
        logger.info(methodIn.getWritetdqCommarea().toString());
        //  cobolCode::PERFORM 1500-FREE-CACHE THRU 1500-EXIT
        freeCache(programCtx.getFreeCacheInCtx()); /*1500-FREE-CACHE*/
        break;
      case 44:
        methodOut.setMessage(CONSTANTS.LITERAL_615412875);
        //  cobolCode::SET WTDQ-INFO-MSG TO TRUE
        methodOut.setWtdqInfoMsgTrue();

        //  cobolCode::DISPLAY WRITETDQ-COMMAREA
        logger.info(methodIn.getWritetdqCommarea().toString());
        break;
      default:
        //  LITERAL_0003 = '0003'
        methodOut.setCicsAbendCode(CONSTANTS.LITERAL_0003);
        methodOut.setMessage(CONSTANTS.HEX_2);
        //  cobolCode::SET WTDQ-ERROR-MSG TO TRUE
        methodOut.setWtdqErrorMsgTrue();

        // cobolCode::GO TO 9800-ABEND-CICS
        if (programCtx.getDoNotSkipAbendCics()) {
          abendCics(programCtx.getAbendCicsInCtx());
        } else {
          programCtx.setDoNotSkipAbendCics(true);
        }
        if (programCtx.getDoNotSkipFormat()) {
          format(programCtx.getFormatInCtx());
        } else {
          programCtx.setDoNotSkipFormat(true);
        }
        abendDb2(programCtx.getAbendDb2InCtx());
        format9910(programCtx.getFormat9910InCtx());
        abend(programCtx.getAbendInCtx());
        zzzaGetDiag(programCtx.getZzzaGetDiagInCtx());
        zzzbGetConn(programCtx.getZzzbGetConnInCtx());
        zzzcGetStmt(programCtx.getZzzcGetStmtInCtx());
        zzzdGetCond(programCtx.getZzzdGetCondInCtx());
        zzzeOrdToken(programCtx.getZzzeOrdTokenInCtx());
        zzzgFormatSqlca(programCtx.getZzzgFormatSqlcaInCtx());
        zzzhPrintSqlca(programCtx.getZzzhPrintSqlcaInCtx());
        zzzfDisplay(programCtx.getZzzfDisplayInCtx());
        return methodOut;
        // cobolCodeEnds::GO TO 9800-ABEND-CICS
    }
    //  cobolCode::PERFORM 3000-BUILD-CACHE THRU 3000-EXIT
    buildCache(programCtx.getBuildCacheInCtx()); /*3000-BUILD-CACHE*/

    // ****************************************************************
    // * Design steps for building cache:
    // *
    // * 1.  determine number of unique search keys
    // *     and number of unique data rows on hand.  if
    // *     nbr. exceeds max. limitations, then load what we can.
    // *     leverage this value to define space
    // *     needed for linkage areas:
    // *     :cache:-hpc-key-area
    // *     :cache:-hpc-data-area
    // * 2.  store pointer to the cache in a 1 item tsq. this
    // *     will be leveraged by d5427hpc to search the cache,
    // *     and bypass calling db2.
    // * 3.  9998-writeq-td para will write msg to cics region spool
    // *     - all abends will be written to cics region spool
    // *     - initial transaction info will be written to region spool
    // *     7005-write-tdq para will write msg to tdq.
    // ****************************************************************
    //  cobolCode::PERFORM 6000-WRITE-CACHE-TSQ THRU 6000-EXIT
    writeCacheTsq(programCtx.getWriteCacheTsqInCtx()); /*6000-WRITE-CACHE-TSQ*/

    // ******************************************************************
    // *    Disply number of rows loaded into cics region sysmsg        *
    // ******************************************************************

    // ******************************************************************
    // *    Disply number of rows loaded into cics region sysmsg        *
    // ******************************************************************
    //  FORMAT1725453934 = "+++++++++9"
    methodOut.setDisplay1(
        CFUtil.cobolNumberFormatter(
            CONSTANTS.FORMAT1725453934, String.valueOf(methodOut.getCacheKeyCnt()).toCharArray()));
    //  FORMAT1725453934 = "+++++++++9"
    methodOut.setDisplay2(
        CFUtil.cobolNumberFormatter(
            CONSTANTS.FORMAT1725453934, String.valueOf(methodOut.getCacheDataCnt()).toCharArray()));
    //  cobolCode::MOVE SPACES TO WTDQ-MESSAGE
    methodOut.setWtdqMessage(CONSTANTS.SPACE_5000);
    //  cobolCode::STRING 'CACHES KEY ROWS LOADED=' DELIMITED BY SIZE WS-DISPLAY1 DELIMITED BY SIZE
    // ',DATA ROWS LOADED=' DELIMITED BY SIZE WS-DISPLAY2 DELIMITED BY SIZE INTO WTDQ-MESSAGE
    charArray = new ArrayList<char[]>();
    charArray.add(CONSTANTS.LITERAL_1747832195);
    charArray.add(methodOut.getDisplay1());
    charArray.add(CONSTANTS.LITERAL_1752934267);
    charArray.add(methodOut.getDisplay2());
    joinCharArray =
        Field.mergeArrays(charArray.get(0), charArray.get(1), charArray.get(2), charArray.get(3));
    updated = updateString(methodOut.getWtdqMessage(), joinCharArray);
    methodOut.setWtdqMessage((char[]) updated.get("string"));
    //  cobolCode::SET WTDQ-INFO-MSG TO TRUE
    methodOut.setWtdqInfoMsgTrue();

    //  cobolCode::DISPLAY WRITETDQ-COMMAREA
    logger.info(methodIn.getWritetdqCommarea().toString());
    //  cobolCode::PERFORM 7000-DISPLAY-CACHE-INFO THRU 7000-EXIT
    displayCacheInfo(programCtx.getDisplayCacheInfoInCtx()); /*7000-DISPLAY-CACHE-INFO*/
    //  cobolCode::COMPUTE CACHE-KEY-THRESHOLD ROUNDED = WS-KEY-ARRAY-MAX * WS-THRESHOLD-PERCENT
    methodOut.setCacheKeyThreshold(
        BigDecimal.valueOf(methodOut.getKeyArrayMax())
            .multiply(methodIn.getThresholdPercent())
            .setScale(0, BigDecimal.ROUND_HALF_UP)
            .intValue());
    //  cobolCode::COMPUTE CACHE-DATA-THRESHOLD ROUNDED = WS-DATA-ARRAY-MAX * WS-THRESHOLD-PERCENT
    methodOut.setCacheDataThreshold(
        BigDecimal.valueOf(methodOut.getDataArrayMax())
            .multiply(methodIn.getThresholdPercent())
            .setScale(0, BigDecimal.ROUND_HALF_UP)
            .intValue());
    //  cobolCode::IF CACHE-KEY-CNT >= CACHE-KEY-THRESHOLD OR CACHE-DATA-CNT >= CACHE-DATA-THRESHOLD
    if ((methodOut.getCacheKeyCnt() >= methodOut.getCacheKeyThreshold())
        || (methodOut.getCacheDataCnt() >= methodOut.getCacheDataThreshold())) {
      //  cobolCode::COMPUTE WS-THRESHOLD-PERCENT-DIS = WS-THRESHOLD-PERCENT * 100
      methodOut.setThresholdPercentDis(
          CFUtil.cobolNumberFormatter(
              CONSTANTS.FORMAT_34169195,
              (methodIn.getThresholdPercent().multiply(BigDecimal.valueOf(100))).toPlainString()));
      //  cobolCode::COMPUTE WS-PERCENT-CALC ROUNDED = ( CACHE-KEY-CNT / WS-KEY-ARRAY-MAX ) * 100
      methodOut.setPercentCalc(
          BigDecimal.valueOf(methodOut.getCacheKeyCnt())
              .divide(BigDecimal.valueOf(methodOut.getKeyArrayMax()), 18, RoundingMode.DOWN)
              .setScale(5, BigDecimal.ROUND_DOWN)
              .multiply(BigDecimal.valueOf(100))
              .setScale(4, RoundingMode.HALF_UP));
      //  cobolCode::COMPUTE CACHE-KEY-THRESHOLD-PERCENT ROUNDED = WS-PERCENT-CALC
      methodOut.setCacheKeyThresholdPercent(
          CFUtil.cobolNumberFormatter(
              CONSTANTS.FORMAT_34169195,
              (methodOut.getPercentCalc().setScale(0, BigDecimal.ROUND_HALF_UP)).toPlainString()));
      //  cobolCode::MOVE WS-KEY-ARRAY-MAX TO WS-DISPLAY1
      //  FORMAT1725453934 = "+++++++++9"
      methodOut.setDisplay1(
          CFUtil.cobolNumberFormatter(
              CONSTANTS.FORMAT1725453934,
              String.valueOf(methodOut.getKeyArrayMax()).toCharArray()));
      //  FORMAT1725453934 = "+++++++++9"
      methodOut.setDisplay2(
          CFUtil.cobolNumberFormatter(
              CONSTANTS.FORMAT1725453934,
              String.valueOf(methodOut.getCacheKeyCnt()).toCharArray()));
      //  cobolCode::COMPUTE WS-PERCENT-CALC ROUNDED = ( CACHE-DATA-CNT / WS-DATA-ARRAY-MAX ) * 100
      methodOut.setPercentCalc(
          BigDecimal.valueOf(methodOut.getCacheDataCnt())
              .divide(BigDecimal.valueOf(methodOut.getDataArrayMax()), 18, RoundingMode.DOWN)
              .setScale(5, BigDecimal.ROUND_DOWN)
              .multiply(BigDecimal.valueOf(100))
              .setScale(4, RoundingMode.HALF_UP));
      //  cobolCode::COMPUTE CACHE-DATA-THRESHOLD-PERCENT ROUNDED = WS-PERCENT-CALC
      methodOut.setCacheDataThresholdPercent(
          CFUtil.cobolNumberFormatter(
              CONSTANTS.FORMAT_34169195,
              (methodOut.getPercentCalc().setScale(0, BigDecimal.ROUND_HALF_UP)).toPlainString()));
      //  cobolCode::MOVE WS-DATA-ARRAY-MAX TO WS-DISPLAY3
      //  FORMAT1725453934 = "+++++++++9"
      methodOut.setDisplay3(
          CFUtil.cobolNumberFormatter(
              CONSTANTS.FORMAT1725453934,
              String.valueOf(methodOut.getDataArrayMax()).toCharArray()));
      //  FORMAT1725453934 = "+++++++++9"
      methodOut.setDisplay4(
          CFUtil.cobolNumberFormatter(
              CONSTANTS.FORMAT1725453934,
              String.valueOf(methodOut.getCacheDataCnt()).toCharArray()));
      //  cobolCode::STRING '|CACHE HAS EXCEEDED CAPACITY THRESHOLD PERCENTAGE' DELIMITED BY SIZE '
      // OF ' DELIMITED BY SIZE WS-THRESHOLD-PERCENT-DIS DELIMITED BY SIZE '%' DELIMITED BY SIZE '
      //         |KEY ARRAY CAPACITY AT:' DELIMITED BY SIZE CACHE-KEY-THRESHOLD-PERCENT DELIMITED BY
      // SIZE '%' DELIMITED BY SIZE '|MAX KEY LIMIT:' DELIMITED BY SIZE WS-DISPLAY1 DELIMITED BY
      // SIZE '                |KEYS LOADED:' DELIMITED BY SIZE WS-DISPLAY2 DELIMITED BY SIZE '|DATA
      // ARRAY CAPACITY AT:' DELIMITED BY SIZE CACHE-DATA-THRESHOLD-PERCENT DELIMITED BY SIZE '%'
      // DELIMITED BY SIZE '                 |MAX DATA LIMIT:' DELIMITED BY SIZE WS-DISPLAY3
      // DELIMITED BY SIZE '|DATA ROWS LOADED:' DELIMITED BY SIZE WS-DISPLAY4 DELIMITED BY SIZE INTO
      // WTDQ-MESSAGE
      charArray = new ArrayList<char[]>();
      charArray.add(CONSTANTS.LITERAL_978412740);
      charArray.add(CONSTANTS.LITERAL_34134);
      charArray.add(methodOut.getThresholdPercentDis());
      charArray.add(CONSTANTS.LITERAL_PR_);
      charArray.add(CONSTANTS.LITERAL_213092859);
      charArray.add(methodOut.getCacheKeyThresholdPercent());
      charArray.add(CONSTANTS.LITERAL_PR_);
      charArray.add(CONSTANTS.LITERAL_2134117780);
      charArray.add(methodOut.getDisplay1());
      charArray.add(CONSTANTS.LITERAL_1813498943);
      charArray.add(methodOut.getDisplay2());
      charArray.add(CONSTANTS.LITERAL_1838548414);
      charArray.add(methodOut.getCacheDataThresholdPercent());
      charArray.add(CONSTANTS.LITERAL_PR_);
      charArray.add(CONSTANTS.LITERAL_1585992423);
      charArray.add(methodOut.getDisplay3());
      charArray.add(CONSTANTS.LITERAL_591207304);
      charArray.add(methodOut.getDisplay4());
      joinCharArray =
          Field.mergeArrays(
              charArray.get(0),
              charArray.get(1),
              charArray.get(2),
              charArray.get(3),
              charArray.get(4),
              charArray.get(5),
              charArray.get(6),
              charArray.get(7),
              charArray.get(8),
              charArray.get(9),
              charArray.get(10),
              charArray.get(11),
              charArray.get(12),
              charArray.get(13),
              charArray.get(14),
              charArray.get(15),
              charArray.get(16),
              charArray.get(17));
      updated = updateString(methodOut.getWtdqMessage(), joinCharArray);
      methodOut.setWtdqMessage((char[]) updated.get("string"));
      //  cobolCode::SET WTDQ-WARN-MSG TO TRUE
      methodOut.setWtdqWarnMsgTrue();

      //  cobolCode::DISPLAY WRITETDQ-COMMAREA
      logger.info(methodIn.getWritetdqCommarea().toString());
    }

    return methodOut;
  }
  /**
   * exit This method is derived from COBOL Paragraph - 0000-EXIT COBOL Cyclomatic complexity - 4
   * Input :
   *
   * <p>- thisProgram COBOL Name: WS-THIS-PROGRAM - writetdqCommarea COBOL Name: WRITETDQ-COMMAREA
   *
   * <p>Output :
   *
   * <p>- wtdqMessage COBOL Name: WTDQ-MESSAGE - wtdqMessageTyp COBOL Name: WTDQ-MESSAGE-TYP
   *
   * @throws CFException
   */
  @Override
  public ExitOutCtx exit(ExitInCtx methodIn) throws Exception {
    // Declare local variables used in the method
    ArrayList<char[]> charArray = new ArrayList<char[]>();
    char[] joinCharArray = null;
    Map<String, Object> updated = null;
    // End of variable declaration

    // Added variable to get the program context in place.
    DphpctsqCtx programCtx = methodIn.getDphpctsqCtx();
    // Added variable to get the output context in place.
    ExitOutCtx methodOut = methodIn.getExitOutCtx();
    //  cobolCode::MOVE SPACES TO WTDQ-MESSAGE
    methodOut.setWtdqMessage(CONSTANTS.SPACE_5000);
    //  cobolCode::STRING WS-THIS-PROGRAM DELIMITED BY SIZE X'4060E2E3D6D740C3C1C3C8C540' DELIMITED
    // BY SIZE INTO WTDQ-MESSAGE
    charArray = new ArrayList<char[]>();
    charArray.add(methodIn.getThisProgram());
    charArray.add(CONSTANTS.HEX_3);
    joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1));
    updated = updateString(methodOut.getWtdqMessage(), joinCharArray);
    methodOut.setWtdqMessage((char[]) updated.get("string"));
    //  cobolCode::SET WTDQ-INFO-MSG TO TRUE
    methodOut.setWtdqInfoMsgTrue();

    //  cobolCode::DISPLAY WRITETDQ-COMMAREA
    logger.info(methodIn.getWritetdqCommarea().toString());
    //  cobolCode::GOBACK
    setNotLogged(false); // no need to log, it is a normal termination
    programCtx.setProgramEnded(true);
    return methodOut;
  }
  /**
   * freeCache This method is derived from COBOL Paragraph - 1500-FREE-CACHE COBOL Cyclomatic
   * complexity - 18 Input :
   *
   * <p>- tsQueueName COBOL Name: WS-TS-QUEUE-NAME - writetdqCommarea COBOL Name: WRITETDQ-COMMAREA
   * - tsqCacheAddress COBOL Name: TSQ-CACHE-ADDRESS
   *
   * <p>Output :
   *
   * <p>- resp COBOL Name: WS-RESP - resp2 COBOL Name: WS-RESP2 - wtdqMessage COBOL Name:
   * WTDQ-MESSAGE - wtdqMessageTyp COBOL Name: WTDQ-MESSAGE-TYP - cicsAbendCode COBOL Name:
   * CICS-ABEND-CODE - message COBOL Name: WS-MESSAGE - integerDisplay COBOL Name:
   * WS-INTEGER-DISPLAY - tsqCacheAddress COBOL Name: TSQ-CACHE-ADDRESS
   *
   * @throws CFException
   */
  @Override
  public FreeCacheOutCtx freeCache(FreeCacheInCtx methodIn) throws Exception {
    // Declare local variables used in the method
    ArrayList<char[]> charArray = new ArrayList<char[]>();
    char[] joinCharArray = null;
    Map<String, Object> updated = null;
    // End of variable declaration

    // Added variable to get the program context in place.
    DphpctsqCtx programCtx = methodIn.getDphpctsqCtx();
    // Added variable to get the output context in place.
    FreeCacheOutCtx methodOut = methodIn.getFreeCacheOutCtx();
    //  cobolCode::DELETEQ TS QNAME (WS-TS-QUEUE-NAME) RESP (WS-RESP) RESP2 (WS-RESP2)
    // delete a queue
    TransactionManager.deleteQueue(programCtx.getCicsSession(), methodIn.getTsQueueName());
    //  cobolCode::MOVE EIBRESP TO WS-RESP
    methodOut.setResp(programCtx.getCicsSession().getEibresp());
    //  cobolCode::MOVE EIBRESP2 TO WS-RESP2
    methodOut.setResp2(programCtx.getCicsSession().getEibresp2());
    //  cobolCode::EVALUATE WS-RESP
    switch (methodOut.getResp()) {
      case 0:
        //  cobolCode::MOVE SPACES TO WTDQ-MESSAGE
        methodOut.setWtdqMessage(CONSTANTS.SPACE_5000);
        //  cobolCode::STRING 'DELETE OF CACHE TSQ:' DELIMITED BY SIZE WS-TS-QUEUE-NAME DELIMITED BY
        // SIZE ' SUCCESSFUL' DELIMITED BY SIZE INTO WTDQ-MESSAGE
        charArray = new ArrayList<char[]>();
        charArray.add(CONSTANTS.LITERAL_1110710789);
        charArray.add(methodIn.getTsQueueName());
        charArray.add(CONSTANTS.LITERAL_B_SUCCESSFUL);
        joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1), charArray.get(2));
        updated = updateString(methodOut.getWtdqMessage(), joinCharArray);
        methodOut.setWtdqMessage((char[]) updated.get("string"));

        // *        Into ws-message
        //  cobolCode::SET WTDQ-INFO-MSG TO TRUE
        methodOut.setWtdqInfoMsgTrue();

        //  cobolCode::DISPLAY WRITETDQ-COMMAREA
        logger.info(methodIn.getWritetdqCommarea().toString());
        break;
      default:
        //  LITERAL_1501 = '1501'
        methodOut.setCicsAbendCode(CONSTANTS.LITERAL_1501);
        methodOut.setMessage(CONSTANTS.SPACE_80);
        //  cobolCode::STRING 'DELETE OF CACHE TSQ:' DELIMITED BY SIZE WS-TS-QUEUE-NAME DELIMITED BY
        // SIZE ' FAILED' DELIMITED BY SIZE INTO WS-MESSAGE
        charArray = new ArrayList<char[]>();
        charArray.add(CONSTANTS.LITERAL_1110710789);
        charArray.add(methodIn.getTsQueueName());
        charArray.add(CONSTANTS.LITERAL_B_FAILED);
        joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1), charArray.get(2));
        updated = updateString(methodOut.getMessage(), joinCharArray);
        methodOut.setMessage((char[]) updated.get("string"));
        //  cobolCode::SET WTDQ-ERROR-MSG TO TRUE
        methodOut.setWtdqErrorMsgTrue();

        // cobolCode::GO TO 9800-ABEND-CICS
        if (programCtx.getDoNotSkipAbendCics()) {
          abendCics(programCtx.getAbendCicsInCtx());
        } else {
          programCtx.setDoNotSkipAbendCics(true);
        }
        if (programCtx.getDoNotSkipFormat()) {
          format(programCtx.getFormatInCtx());
        } else {
          programCtx.setDoNotSkipFormat(true);
        }
        abendDb2(programCtx.getAbendDb2InCtx());
        format9910(programCtx.getFormat9910InCtx());
        abend(programCtx.getAbendInCtx());
        zzzaGetDiag(programCtx.getZzzaGetDiagInCtx());
        zzzbGetConn(programCtx.getZzzbGetConnInCtx());
        zzzcGetStmt(programCtx.getZzzcGetStmtInCtx());
        zzzdGetCond(programCtx.getZzzdGetCondInCtx());
        zzzeOrdToken(programCtx.getZzzeOrdTokenInCtx());
        zzzgFormatSqlca(programCtx.getZzzgFormatSqlcaInCtx());
        zzzhPrintSqlca(programCtx.getZzzhPrintSqlcaInCtx());
        zzzfDisplay(programCtx.getZzzfDisplayInCtx());
        return methodOut;
        // cobolCodeEnds::GO TO 9800-ABEND-CICS
    }

    // *EXEC CICS
    // *  DELAY FOR SECONDS(05)
    // *  RESP  (WS-RESP)
    // *END-EXEC
    //  cobolCode::DELAY FOR SECONDS(05) RESP (WS-RESP)

    // *EXEC CICS
    // *  DELAY FOR SECONDS(05)
    // *  RESP  (WS-RESP)
    // *END-EXEC
    // delay request
    TransactionManager.delay(
        programCtx.getCicsSession(),
        "".toCharArray() /*reqId*/,
        -1,
        "".toCharArray() /*time*/,
        -1,
        -1,
        5);
    //  cobolCode::MOVE EIBRESP TO WS-RESP
    methodOut.setResp(programCtx.getCicsSession().getEibresp());
    //  cobolCode::EVALUATE WS-RESP
    switch (methodOut.getResp()) {
      case 0:
        break;
      default:
        methodOut.setMessage(CONSTANTS.LITERAL_1876998128);
        //  LITERAL_1502 = '1502'
        methodOut.setCicsAbendCode(CONSTANTS.LITERAL_1502);
        //  cobolCode::SET WTDQ-ERROR-MSG TO TRUE
        methodOut.setWtdqErrorMsgTrue();

        // cobolCode::GO TO 9800-ABEND-CICS
        if (programCtx.getDoNotSkipAbendCics()) {
          abendCics(programCtx.getAbendCicsInCtx());
        } else {
          programCtx.setDoNotSkipAbendCics(true);
        }
        if (programCtx.getDoNotSkipFormat()) {
          format(programCtx.getFormatInCtx());
        } else {
          programCtx.setDoNotSkipFormat(true);
        }
        abendDb2(programCtx.getAbendDb2InCtx());
        format9910(programCtx.getFormat9910InCtx());
        abend(programCtx.getAbendInCtx());
        zzzaGetDiag(programCtx.getZzzaGetDiagInCtx());
        zzzbGetConn(programCtx.getZzzbGetConnInCtx());
        zzzcGetStmt(programCtx.getZzzcGetStmtInCtx());
        zzzdGetCond(programCtx.getZzzdGetCondInCtx());
        zzzeOrdToken(programCtx.getZzzeOrdTokenInCtx());
        zzzgFormatSqlca(programCtx.getZzzgFormatSqlcaInCtx());
        zzzhPrintSqlca(programCtx.getZzzhPrintSqlcaInCtx());
        zzzfDisplay(programCtx.getZzzfDisplayInCtx());
        return methodOut;
        // cobolCodeEnds::GO TO 9800-ABEND-CICS
    }
    //  cobolCode::FREEMAIN DATAPOINTER(TSQ-CACHE-PTR) RESP (WS-RESP) RESP2 (WS-RESP2)
    // freemain
    TransactionManager.freeMain(programCtx.getCicsSession(), methodIn.getTsqCachePtr());
    //  cobolCode::MOVE EIBRESP TO WS-RESP
    methodOut.setResp(programCtx.getCicsSession().getEibresp());
    //  cobolCode::MOVE EIBRESP2 TO WS-RESP2
    methodOut.setResp2(programCtx.getCicsSession().getEibresp2());
    //  cobolCode::EVALUATE WS-RESP
    switch (methodOut.getResp()) {
      case 0:
        //  cobolCode::MOVE TSQ-CACHE-ADDRESS TO WS-INTEGER-DISPLAY
        //  FORMAT_2028989547 = "ZZZZZZZZZZ9"
        methodOut.setIntegerDisplay(
            CFUtil.cobolNumberFormatter(
                CONSTANTS.FORMAT_2028989547,
                String.valueOf(methodOut.getTsqCacheAddress()).toCharArray()));
        //  cobolCode::MOVE SPACES TO WTDQ-MESSAGE
        methodOut.setWtdqMessage(CONSTANTS.SPACE_5000);
        //  cobolCode::STRING 'CACHE FREED' DELIMITED BY SIZE ', ADDR=' DELIMITED BY SIZE
        // WS-INTEGER-DISPLAY DELIMITED BY SIZE INTO WTDQ-MESSAGE
        charArray = new ArrayList<char[]>();
        charArray.add(CONSTANTS.LITERAL_CACHE_B_FREED);
        charArray.add(CONSTANTS.LITERAL_1688518708);
        charArray.add(methodOut.getIntegerDisplay());
        joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1), charArray.get(2));
        updated = updateString(methodOut.getWtdqMessage(), joinCharArray);
        methodOut.setWtdqMessage((char[]) updated.get("string"));

        // *        Into ws-message
        //  cobolCode::SET WTDQ-INFO-MSG TO TRUE
        methodOut.setWtdqInfoMsgTrue();

        //  cobolCode::DISPLAY WRITETDQ-COMMAREA
        logger.info(methodIn.getWritetdqCommarea().toString());
        break;
      default:
        methodOut.setMessage(CONSTANTS.SPACE_80);
        //  cobolCode::MOVE TSQ-CACHE-ADDRESS TO WS-INTEGER-DISPLAY
        //  FORMAT_2028989547 = "ZZZZZZZZZZ9"
        methodOut.setIntegerDisplay(
            CFUtil.cobolNumberFormatter(
                CONSTANTS.FORMAT_2028989547,
                String.valueOf(methodOut.getTsqCacheAddress()).toCharArray()));
        //  LITERAL_1503 = '1503'
        methodOut.setCicsAbendCode(CONSTANTS.LITERAL_1503);
        //  cobolCode::STRING 'FREEMAIN OF CACHE FAILED, ADDRESS=' DELIMITED BY SIZE
        // WS-INTEGER-DISPLAY DELIMITED BY SIZE INTO WS-MESSAGE
        charArray = new ArrayList<char[]>();
        charArray.add(CONSTANTS.LITERAL_1621600547);
        charArray.add(methodOut.getIntegerDisplay());
        joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1));
        updated = updateString(methodOut.getMessage(), joinCharArray);
        methodOut.setMessage((char[]) updated.get("string"));
        //  cobolCode::SET WTDQ-ERROR-MSG TO TRUE
        methodOut.setWtdqErrorMsgTrue();

        // cobolCode::GO TO 9800-ABEND-CICS
        if (programCtx.getDoNotSkipAbendCics()) {
          abendCics(programCtx.getAbendCicsInCtx());
        } else {
          programCtx.setDoNotSkipAbendCics(true);
        }
        if (programCtx.getDoNotSkipFormat()) {
          format(programCtx.getFormatInCtx());
        } else {
          programCtx.setDoNotSkipFormat(true);
        }
        abendDb2(programCtx.getAbendDb2InCtx());
        format9910(programCtx.getFormat9910InCtx());
        abend(programCtx.getAbendInCtx());
        zzzaGetDiag(programCtx.getZzzaGetDiagInCtx());
        zzzbGetConn(programCtx.getZzzbGetConnInCtx());
        zzzcGetStmt(programCtx.getZzzcGetStmtInCtx());
        zzzdGetCond(programCtx.getZzzdGetCondInCtx());
        zzzeOrdToken(programCtx.getZzzeOrdTokenInCtx());
        zzzgFormatSqlca(programCtx.getZzzgFormatSqlcaInCtx());
        zzzhPrintSqlca(programCtx.getZzzhPrintSqlcaInCtx());
        zzzfDisplay(programCtx.getZzzfDisplayInCtx());
        return methodOut;
        // cobolCodeEnds::GO TO 9800-ABEND-CICS
    }

    return methodOut;
  }
  /**
   * buildCache This method is derived from COBOL Paragraph - 3000-BUILD-CACHE COBOL Cyclomatic
   * complexity - 5 Input :
   *
   * <p>- sqlcode COBOL Name: SQLCODE
   *
   * <p>Output :
   *
   * <p>- cicsAbendCode COBOL Name: CICS-ABEND-CODE - message COBOL Name: WS-MESSAGE -
   * wtdqMessageTyp COBOL Name: WTDQ-MESSAGE-TYP - eofSw COBOL Name: EOF-SW - lenOf1KeyOccurrence
   * COBOL Name: WS-LEN-OF-1-KEY-OCCURRENCE - lenOf1DataOccurrence COBOL Name:
   * WS-LEN-OF-1-DATA-OCCURRENCE - runningKeyLen COBOL Name: WS-RUNNING-KEY-LEN - runningDataLen
   * COBOL Name: WS-RUNNING-DATA-LEN - hostVarArrayArea COBOL Name: WS-HOST-VAR-ARRAY-AREA
   *
   * @throws CFException
   */
  @Override
  public BuildCacheOutCtx buildCache(BuildCacheInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 3000-Build-cache                                             *
    // *81                                                              *
    // *81 business function:                                           *
    // *81 build cache                                                  *
    // *81***************************************************************
    // *82***************************************************************
    // *82 3000-build-cahce                                             *
    // *82  this routine will open cache cursor
    // *82**************************************************************
    // *82***************************************************************
    // *82 called by: 1. 0000-mainline                                  *
    // *82 calls    : 1. 9800-abend-cics                                *
    // *82            2. 4000-fetch-c1                                  *
    // *82***************************************************************
    // Added variable to get the program context in place.
    DphpctsqCtx programCtx = methodIn.getDphpctsqCtx();
    // Added variable to get the output context in place.
    BuildCacheOutCtx methodOut = methodIn.getBuildCacheOutCtx();
    //  cobolCode::DECLARE C1 CURSOR WITH ROWSET POSITIONING FOR WITH CTEA AS ( SELECT INTEGER ( 1 )
    // AS QUERY_TYP , HIPAA_VER_NBR , SUBSTR ( '  ' , 1 , 2 ) AS SORT_COL1 , HIPAA_CD ,
    // GRNRC_RQST_CD , HIPAA_GRP_CD , INTEGER ( 1 ) AS DATA_TYP FROM HIPAA_PROC_CD A UNION ALL
    // SELECT INTEGER ( 1 ) AS QUERY_TYP , HIPAA_VER_NBR , SUBSTR ( '  ' , 1 , 2 ) AS SORT_COL1 ,
    // HIPAA_CD , GRNRC_RQST_CD , HIPAA_GRP_CD , INTEGER ( 2 ) AS DATA_TYP FROM HIPAA_PROC_CD A
    // WHERE NOT EXISTS ( SELECT 1 FROM HIPAA_PROC_CD B WHERE A.HIPAA_CD = B.HIPAA_GRP_CD FETCH
    // FIRST 1 ROWS ONLY ) UNION ALL SELECT INTEGER ( 1 ) AS QUERY_TYP , HIPAA_VER_NBR , SUBSTR ( '
    // ' , 1 , 2 ) AS SORT_COL1 , HIPAA_CD , GRNRC_RQST_CD , HIPAA_GRP_CD , INTEGER ( 3 ) AS
    // DATA_TYP FROM HIPAA_PROC_CD WHERE GRNRC_RQST_CD IN ( 'S' , 'G' ) UNION ALL SELECT INTEGER ( 2
    // ) AS QUERY_TYP , HIPAA_VER_NBR , HIPAA_GRP_CD AS SORT_COL1 , HIPAA_CD , GRNRC_RQST_CD ,
    // HIPAA_GRP_CD , INTEGER ( 0 ) AS DATA_TYP FROM HIPAA_PROC_CD UNION ALL SELECT INTEGER ( 3 ) AS
    // QUERY_TYP , HIPAA_VER_NBR , HIPAA_CD AS SORT_COL1 , HIPAA_CD , GRNRC_RQST_CD , HIPAA_GRP_CD ,
    // INTEGER ( 0 ) AS DATA_TYP FROM HIPAA_PROC_CD ) , KEY AS ( SELECT COUNT ( DISTINCT
    // QUERY_TYP||HIPAA_VER_NBR|| SORT_COL1 ) AS CNT FROM CTEA ) , DATA AS ( SELECT COUNT ( 1 ) AS
    // CNT FROM CTEA ) SELECT QUERY_TYP , HIPAA_VER_NBR , SORT_COL1 , HIPAA_CD , GRNRC_RQST_CD ,
    // HIPAA_GRP_CD , DATA_TYP , KEY.CNT , DATA.CNT FROM CTEA , KEY , DATA ORDER BY 1 , 2 , 3 , 4 ,
    // 5 FOR FETCH ONLY WITH UR
    programCtx.setC1ResultSet(dphpctsqRepository.openC1Dphpctsq(programCtx.getSqlca()));
    //  cobolCode::EVALUATE TRUE
    if ((methodOut.getSqlcode() == 0)) {;
    } else {
      //  LITERAL_3001 = '3001'
      methodOut.setCicsAbendCode(CONSTANTS.LITERAL_3001);
      methodOut.setMessage(CONSTANTS.LITERAL_391632092);
      //  cobolCode::SET WTDQ-ERROR-MSG TO TRUE
      methodOut.setWtdqErrorMsgTrue();

      // cobolCode::GO TO 9900-ABEND-DB2
      abendDb2(programCtx.getAbendDb2InCtx());
      format9910(programCtx.getFormat9910InCtx());
      abend(programCtx.getAbendInCtx());
      zzzaGetDiag(programCtx.getZzzaGetDiagInCtx());
      zzzbGetConn(programCtx.getZzzbGetConnInCtx());
      zzzcGetStmt(programCtx.getZzzcGetStmtInCtx());
      zzzdGetCond(programCtx.getZzzdGetCondInCtx());
      zzzeOrdToken(programCtx.getZzzeOrdTokenInCtx());
      zzzgFormatSqlca(programCtx.getZzzgFormatSqlcaInCtx());
      zzzhPrintSqlca(programCtx.getZzzhPrintSqlcaInCtx());
      zzzfDisplay(programCtx.getZzzfDisplayInCtx());
      return methodOut;
      // cobolCodeEnds::GO TO 9900-ABEND-DB2
    }
    //  cobolCode::SET NOT-EOF TO TRUE
    methodOut.setNotEofTrue();

    //  cobolCode::COMPUTE WS-LEN-OF-1-KEY-OCCURRENCE = FUNCTION~LENGTH CACHE-KEY-ARRAY (1)
    methodOut.setLenOf1KeyOccurrence(CacheKeyArray.getCacheKeyArrayFieldLength());
    //  cobolCode::COMPUTE WS-LEN-OF-1-DATA-OCCURRENCE = FUNCTION~LENGTH CACHE-DATA-ARRAY (1)
    methodOut.setLenOf1DataOccurrence(CacheDataArray.getCacheDataArrayFieldLength());
    //  cobolCode::COMPUTE WS-RUNNING-KEY-LEN = FUNCTION~LENGTH CACHE-KEY-FIXED-AREA
    methodOut.setRunningKeyLen(CacheKeyFixedArea.getCacheKeyFixedAreaFieldLength());
    //  cobolCode::COMPUTE WS-RUNNING-DATA-LEN = FUNCTION~LENGTH CACHE-DATA-FIXED-AREA
    methodOut.setRunningDataLen(CacheDataFixedArea.getCacheDataFixedAreaFieldLength());
    //  cobolCode::PERFORM UNTIL EOF
    while ((!(methodOut.isEof()))) {
      //  cobolCode::INITIALIZE WS-HOST-VAR-ARRAY-AREA
      methodOut.getHostVarArrayArea().initialize();
      //  cobolCode::PERFORM 4000-FETCH-C1 THRU 4000-EXIT
      fetchC1(programCtx.getFetchC1InCtx()); /*4000-FETCH-C1*/
    }

    return methodOut;
  }
  /**
   * fetchC1 This method is derived from COBOL Paragraph - 4000-FETCH-C1 COBOL Cyclomatic complexity
   * - 8 Input :
   *
   * <p>- cacheStorageSw COBOL Name: CACHE-STORAGE-SW - sqlerrd COBOL Name: SQLERRD
   *
   * <p>Output :
   *
   * <p>- dsnnrows COBOL Name: DSNNROWS - i1 COBOL Name: I1 - i2 COBOL Name: I2 - i3 COBOL Name: I3
   * - i4 COBOL Name: I4 - i5 COBOL Name: I5 - i6 COBOL Name: I6 - i7 COBOL Name: I7 - eofSw COBOL
   * Name: EOF-SW - cicsAbendCode COBOL Name: CICS-ABEND-CODE - message COBOL Name: WS-MESSAGE -
   * wtdqMessageTyp COBOL Name: WTDQ-MESSAGE-TYP
   *
   * @throws CFException
   */
  @Override
  public FetchC1OutCtx fetchC1(FetchC1InCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 4000-Fetch-c1                                                *
    // *81                                                              *
    // *81 business function:                                           *
    // *81 fetch records from db2                                       *
    // *81***************************************************************
    // *82***************************************************************
    // *82 4000-fetch-c1                                                *
    // *82  this routine will take db2 data                             *
    // *82  which will be loaded to cics core/cache.                    *
    // *82**************************************************************
    // *82***************************************************************
    // *82 called by: 1. 3000-build-cache                               *
    // *82 calls    : 1. 9900-abend-cics                                *
    // *82            2. 2000-get-storage-for-cache                     *
    // *82            2. 5000-load-cache-areas                          *
    // *82***************************************************************
    // FETCH NEXT ROWSET FROM C1 FOR 100 ROWS INTO  ?    ,   ?    ,   ?    ,   ?    ,   ?    ,   ?
    //  ,   ?    ,   ?    ,   ?
    // Added variable to get the program context in place.
    DphpctsqCtx programCtx = methodIn.getDphpctsqCtx();
    // Added variable to get the output context in place.
    FetchC1OutCtx methodOut = methodIn.getFetchC1OutCtx();
    //  cobolCode::MOVE 100 TO DSNNROWS
    methodOut.setDsnnrows(100);
    //  cobolCode::FETCH NEXT ROWSET FROM C1 FOR 100 ROWS INTO ? , ? , ? , ? , ? , ? , ? , ? , ?
    dphpctsqRepository.fetchC1Dphpctsq(
        programCtx.getC1ResultSet(), methodOut.getHostVarArrayArea(), programCtx.getSqlca());
    //  cobolCode::EVALUATE SQLCODE
    switch (methodOut.getSqlcode()) {
      case +0:
        //  cobolCode::IF STORAGE-FOR-CACHE-NOT-OBTAINED
        if (methodIn.isStorageForCacheNotObtained()) {
          //  cobolCode::PERFORM 2000-GET-STORAGE-FOR-CACHE THRU 2000-EXIT
          getStorageForCache(
              programCtx.getGetStorageForCacheInCtx()); /*2000-GET-STORAGE-FOR-CACHE*/
        }
        //  cobolCode::SET I1, I2, I3, I4, I5, I6, I7 TO 1
        methodOut.setI1(1);

        methodOut.setI2(1);

        methodOut.setI3(1);

        methodOut.setI4(1);

        methodOut.setI5(1);

        methodOut.setI6(1);

        methodOut.setI7(1);

        //  cobolCode::PERFORM 5000-LOAD-CACHE-AREAS THRU 5000-EXIT
        loadCacheAreas(programCtx.getLoadCacheAreasInCtx()); /*5000-LOAD-CACHE-AREAS*/
        break;
      case +100:
        //  cobolCode::SET EOF TO TRUE
        methodOut.setEofTrue();

        //  cobolCode::IF SQLERRD (3) > +0
        if ((methodIn.getSqlerrd(2) > 0)) {
          //  cobolCode::IF STORAGE-FOR-CACHE-NOT-OBTAINED
          if (methodIn.isStorageForCacheNotObtained()) {
            //  cobolCode::PERFORM 2000-GET-STORAGE-FOR-CACHE THRU 2000-EXIT
            getStorageForCache(
                programCtx.getGetStorageForCacheInCtx()); /*2000-GET-STORAGE-FOR-CACHE*/
          }
          //  cobolCode::SET I1, I2, I3, I4, I5, I6, I7 TO 1
          methodOut.setI1(1);

          methodOut.setI2(1);

          methodOut.setI3(1);

          methodOut.setI4(1);

          methodOut.setI5(1);

          methodOut.setI6(1);

          methodOut.setI7(1);

          //  cobolCode::PERFORM 5000-LOAD-CACHE-AREAS THRU 5000-EXIT
          loadCacheAreas(programCtx.getLoadCacheAreasInCtx()); /*5000-LOAD-CACHE-AREAS*/
        }
        break;
      default:
        //  LITERAL_4001 = '4001'
        methodOut.setCicsAbendCode(CONSTANTS.LITERAL_4001);
        methodOut.setMessage(CONSTANTS.LITERAL_1361447333);
        //  cobolCode::SET WTDQ-ERROR-MSG TO TRUE
        methodOut.setWtdqErrorMsgTrue();

        // cobolCode::GO TO 9900-ABEND-DB2
        abendDb2(programCtx.getAbendDb2InCtx());
        format9910(programCtx.getFormat9910InCtx());
        abend(programCtx.getAbendInCtx());
        zzzaGetDiag(programCtx.getZzzaGetDiagInCtx());
        zzzbGetConn(programCtx.getZzzbGetConnInCtx());
        zzzcGetStmt(programCtx.getZzzcGetStmtInCtx());
        zzzdGetCond(programCtx.getZzzdGetCondInCtx());
        zzzeOrdToken(programCtx.getZzzeOrdTokenInCtx());
        zzzgFormatSqlca(programCtx.getZzzgFormatSqlcaInCtx());
        zzzhPrintSqlca(programCtx.getZzzhPrintSqlcaInCtx());
        zzzfDisplay(programCtx.getZzzfDisplayInCtx());
        return methodOut;
        // cobolCodeEnds::GO TO 9900-ABEND-DB2
    }

    return methodOut;
  }
  /**
   * getStorageForCache This method is derived from COBOL Paragraph - 2000-GET-STORAGE-FOR-CACHE
   * COBOL Cyclomatic complexity - 15 Input :
   *
   * <p>- hvKeyCnt COBOL Name: HV-KEY-CNT - keyArrayMax COBOL Name: WS-KEY-ARRAY-MAX -
   * writetdqCommarea COBOL Name: WRITETDQ-COMMAREA - hvDataCnt COBOL Name: HV-DATA-CNT -
   * dataArrayMax COBOL Name: WS-DATA-ARRAY-MAX - tmpLenByte4 COBOL Name: TMP-LEN-BYTE4 -
   * svindxHexLowHword COBOL Name: SVINDX-HEX-LOW-HWORD - svindxHex COBOL Name: SVINDX-HEX -
   * hexRemainder COBOL Name: HEX-REMAINDER - tmpPointer COBOL Name: TMP-POINTER - tmpPointerBin
   * COBOL Name: TMP-POINTER-BIN
   *
   * <p>Output :
   *
   * <p>- cacheKeyOverflowInd COBOL Name: WS-CACHE-KEY-OVERFLOW-IND - cacheDataOverflowInd COBOL
   * Name: WS-CACHE-DATA-OVERFLOW-IND - display1 COBOL Name: WS-DISPLAY1 - hvKeyCnt COBOL Name:
   * HV-KEY-CNT - display2 COBOL Name: WS-DISPLAY2 - keyArrayMax COBOL Name: WS-KEY-ARRAY-MAX -
   * wtdqMessage COBOL Name: WTDQ-MESSAGE - wtdqMessageTyp COBOL Name: WTDQ-MESSAGE-TYP - hvDataCnt
   * COBOL Name: HV-DATA-CNT - dataArrayMax COBOL Name: WS-DATA-ARRAY-MAX - tmpLen COBOL Name:
   * TMP-LEN - svindxHexX COBOL Name: SVINDX-HEX-X - svindxHexLowByte COBOL Name:
   * SVINDX-HEX-LOW-BYTE - tmpLenByte4 COBOL Name: TMP-LEN-BYTE4 - svindxHexLowHword COBOL Name:
   * SVINDX-HEX-LOW-HWORD - hexIndex COBOL Name: HEX-INDEX - lenCacheKeyArea COBOL Name:
   * LEN-CACHE-KEY-AREA - lenCacheDataArea COBOL Name: LEN-CACHE-DATA-AREA - resp COBOL Name:
   * WS-RESP - resp2 COBOL Name: WS-RESP2 - getmainSw COBOL Name: GETMAIN-SW - cicsAbendCode COBOL
   * Name: CICS-ABEND-CODE - message COBOL Name: WS-MESSAGE - tsqCachePtr COBOL Name: TSQ-CACHE-PTR
   * - cacheHpcKeyArea COBOL Name: CACHE-HPC-KEY-AREA - tmpPointerBin COBOL Name: TMP-POINTER-BIN -
   * cacheDataPtr COBOL Name: CACHE-DATA-PTR - cacheHpcDataArea COBOL Name: CACHE-HPC-DATA-AREA -
   * cacheStorageSw COBOL Name: CACHE-STORAGE-SW - cacheKeyCnt COBOL Name: CACHE-KEY-CNT -
   * cacheDataCnt COBOL Name: CACHE-DATA-CNT - cacheKeyArrayMax COBOL Name: CACHE-KEY-ARRAY-MAX -
   * cacheDataArrayMax COBOL Name: CACHE-DATA-ARRAY-MAX - cacheKeyOverflowInd01 COBOL Name:
   * CACHE-KEY-OVERFLOW-IND - cacheDataOverflowInd01 COBOL Name: CACHE-DATA-OVERFLOW-IND
   *
   * @throws CFException
   */
  @Override
  public GetStorageForCacheOutCtx getStorageForCache(GetStorageForCacheInCtx methodIn)
      throws Exception {
    // Declare local variables used in the method
    ArrayList<char[]> charArray = new ArrayList<char[]>();
    char[] joinCharArray = null;
    Map<String, Object> updated = null;
    boolean overflow = false;
    // End of variable declaration

    // *81***************************************************************
    // *81 2000-Get-storage-for-cache                                   *
    // *81                                                              *
    // *81 business function:                                           *
    // *81 perform getmain function to build cache.                     *
    // *81***************************************************************
    // *82***************************************************************
    // *82 2000-get-storage-for-cache                                   *
    // *82  this routine will calculate total length needed for         *
    // *82  cache-tops-rstctl-area and perform getmain for the          *
    // *82  calculated length.                                          *
    // *82**************************************************************
    // *82***************************************************************
    // *82 called by: 1. 0000-mainline                                  *
    // *82 calls    : 1. 9800-abend-cics                                *
    // *82***************************************************************
    // Added variable to get the program context in place.
    DphpctsqCtx programCtx = methodIn.getDphpctsqCtx();
    // Added variable to get the output context in place.
    GetStorageForCacheOutCtx methodOut = methodIn.getGetStorageForCacheOutCtx();
    //  cobolCode::SET WS-CACHE-KEY-OVERFLOW-NO TO TRUE
    methodOut.setCacheKeyOverflowNoWsTrue();

    //  cobolCode::SET WS-CACHE-DATA-OVERFLOW-NO TO TRUE
    methodOut.setCacheDataOverflowNoWsTrue();

    //  cobolCode::IF HV-KEY-CNT (1) > WS-KEY-ARRAY-MAX
    if ((methodOut.getHvKeyCnt(0) > methodOut.getKeyArrayMax())) {
      //  cobolCode::SET WS-CACHE-KEY-OVERFLOW-YES TO TRUE
      methodOut.setCacheKeyOverflowYesWsTrue();

      //  cobolCode::MOVE HV-KEY-CNT (1) TO WS-DISPLAY1
      //  FORMAT1725453934 = "+++++++++9"
      methodOut.setDisplay1(
          CFUtil.cobolNumberFormatter(
              CONSTANTS.FORMAT1725453934, String.valueOf(methodOut.getHvKeyCnt(0)).toCharArray()));
      //  cobolCode::MOVE WS-KEY-ARRAY-MAX TO WS-DISPLAY2
      //  FORMAT1725453934 = "+++++++++9"
      methodOut.setDisplay2(
          CFUtil.cobolNumberFormatter(
              CONSTANTS.FORMAT1725453934,
              String.valueOf(methodOut.getKeyArrayMax()).toCharArray()));
      //  cobolCode::MOVE SPACES TO WTDQ-MESSAGE
      methodOut.setWtdqMessage(CONSTANTS.SPACE_5000);
      //  cobolCode::STRING 'LINKAGE KEY ARRAY OVERFLOW.                     ' DELIMITED BY SIZE '
      //                  KEYS NEEDED=' DELIMITED BY SIZE WS-DISPLAY1 DELIMITED BY SIZE ' MAX. KEYS
      // ALLOWED=' DELIMITED BY SIZE WS-DISPLAY2 DELIMITED BY SIZE INTO WTDQ-MESSAGE
      charArray = new ArrayList<char[]>();
      charArray.add(CONSTANTS.LITERAL_1609908425);
      charArray.add(CONSTANTS.LITERAL_1151288636);
      charArray.add(methodOut.getDisplay1());
      charArray.add(CONSTANTS.LITERAL_1853199783);
      charArray.add(methodOut.getDisplay2());
      joinCharArray =
          Field.mergeArrays(
              charArray.get(0),
              charArray.get(1),
              charArray.get(2),
              charArray.get(3),
              charArray.get(4));
      updated = updateString(methodOut.getWtdqMessage(), joinCharArray);
      methodOut.setWtdqMessage((char[]) updated.get("string"));
      overflow = (boolean) updated.get("exceeds");
      //  cobolCode::SET WTDQ-INFO-MSG TO TRUE
      methodOut.setWtdqInfoMsgTrue();

      //  cobolCode::DISPLAY WRITETDQ-COMMAREA
      logger.info(methodIn.getWritetdqCommarea().toString());
      //  cobolCode::MOVE WS-KEY-ARRAY-MAX TO HV-KEY-CNT (1)
      methodOut.setHvKeyCnt(0, methodOut.getKeyArrayMax());
    }
    //  cobolCode::IF HV-DATA-CNT (1) > WS-DATA-ARRAY-MAX
    if ((methodOut.getHvDataCnt(0) > methodOut.getDataArrayMax())) {
      //  cobolCode::SET WS-CACHE-DATA-OVERFLOW-YES TO TRUE
      methodOut.setCacheDataOverflowYesWsTrue();

      //  cobolCode::MOVE HV-DATA-CNT (1) TO WS-DISPLAY1
      //  FORMAT1725453934 = "+++++++++9"
      methodOut.setDisplay1(
          CFUtil.cobolNumberFormatter(
              CONSTANTS.FORMAT1725453934, String.valueOf(methodOut.getHvDataCnt(0)).toCharArray()));
      //  cobolCode::MOVE WS-DATA-ARRAY-MAX TO WS-DISPLAY2
      //  FORMAT1725453934 = "+++++++++9"
      methodOut.setDisplay2(
          CFUtil.cobolNumberFormatter(
              CONSTANTS.FORMAT1725453934,
              String.valueOf(methodOut.getDataArrayMax()).toCharArray()));
      //  cobolCode::MOVE SPACES TO WTDQ-MESSAGE
      methodOut.setWtdqMessage(CONSTANTS.SPACE_5000);
      //  cobolCode::STRING 'LINKAGE DATA ARRAY OVERFLOW.                    ' DELIMITED BY SIZE '
      //                  DATA NEEDED=' DELIMITED BY SIZE WS-DISPLAY1 DELIMITED BY SIZE ' MAX. DATA
      // ROWS ALLOWED=' DELIMITED BY SIZE WS-DISPLAY2 DELIMITED BY SIZE INTO WTDQ-MESSAGE
      charArray = new ArrayList<char[]>();
      charArray.add(CONSTANTS.LITERAL_1008589078);
      charArray.add(CONSTANTS.LITERAL_23299534);
      charArray.add(methodOut.getDisplay1());
      charArray.add(CONSTANTS.LITERAL_2107550020);
      charArray.add(methodOut.getDisplay2());
      joinCharArray =
          Field.mergeArrays(
              charArray.get(0),
              charArray.get(1),
              charArray.get(2),
              charArray.get(3),
              charArray.get(4));
      updated = updateString(methodOut.getWtdqMessage(), joinCharArray);
      methodOut.setWtdqMessage((char[]) updated.get("string"));
      overflow = (boolean) updated.get("exceeds");
      //  cobolCode::SET WTDQ-INFO-MSG TO TRUE
      methodOut.setWtdqInfoMsgTrue();

      //  cobolCode::DISPLAY WRITETDQ-COMMAREA
      logger.info(methodIn.getWritetdqCommarea().toString());
      //  cobolCode::MOVE WS-DATA-ARRAY-MAX TO HV-DATA-CNT (1)
      methodOut.setHvDataCnt(0, methodOut.getDataArrayMax());
    }
    //  cobolCode::COMPUTE TMP-LEN = ( HV-KEY-CNT (1) * FUNCTION~LENGTH CACHE-KEY-ARRAY (1)) +
    // FUNCTION~LENGTH CACHE-KEY-FIXED-AREA
    methodOut.setTmpLen(
        (methodOut.getHvKeyCnt(0) * CacheKeyArray.getCacheKeyArrayFieldLength())
            + CacheKeyFixedArea.getCacheKeyFixedAreaFieldLength());

    // *****************************************************************
    // *    We now have the length of cache-hpc-key-area.
    // *    we will round up this length to the nearest 16 bytes,
    // *    then calculate the length needed for:
    // *    cache-hpc-data-area. this grand total will be used
    // *    to do just 1 getmain for both cache areas.
    // *    note - the reason for this is that cobol expects each "01"
    // *    level to be on a (double word (8 byte)) boundry.
    // *
    // *    we use the last byte of the length to see what the
    // *    value is. we use a hex remainder array of 256 values to see
    // *    how much we have to increase the length to make it a
    // *    multiple of 16. this is a very fast way to do this as
    // *    it requires no multiple / divide operations
    // * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
    // * here is an example to help explain the math:
    // * assume length of binary counter = 2134
    // * hex =  x'0856'  s9(4) comp or 2 bytes.
    // * we take the last byte x'56'(decimal 86)
    // * and double it to get x'ac' (decimal 172)
    // * 172 represents a displacement value.
    // * when hex-index is 'set' to this value,  the displacement
    // * value is turned back into an occurrance number.
    // * the formula for deriving occurrance value is
    // * (displacement value/length of 1 occurrance in array +1 or
    // * (172/2 + 1) = 87
    // * occurrance 87 in the hex remainder array is:
    // * hex-56   --> pic s9(4)  comp value +10.
    // * we add the value of +10 to 2134 to get 2144, which has now
    // * rounded the binary counter area up to a multiple of 16.
    // * fyi,
    // * formula for displacement value = occurrance number - 1 * length
    // * of 1 occurrance in array, or  (87 - 1 * 2 = 172)
    // * note - displacement = how far away from start of table.
    // * the first byte of an array is always at displacement 0.
    // * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
    //  cobolCode::MOVE LOW-VALUES TO SVINDX-HEX-X
    methodOut.setSvindxHexX(CONSTANTS.LOW_VALUE_1703015831);
    //  cobolCode::MOVE TMP-LEN-BYTE4 TO SVINDX-HEX-LOW-BYTE
    methodOut.setSvindxHexLowByte(methodOut.getTmpLenByte4());
    //  cobolCode::ADD SVINDX-HEX-LOW-HWORD TO SVINDX-HEX-LOW-HWORD
    methodOut.setSvindxHexLowHword(
        (short) (methodOut.getSvindxHexLowHword() + methodOut.getSvindxHexLowHword()));
    //  cobolCode::SET HEX-INDEX TO SVINDX-HEX
    methodOut.setHexIndex((methodIn.getSvindxHex() / HEX_REMAINDER_LENGTH) + 1);

    //  cobolCode::ADD HEX-REMAINDER ( HEX-INDEX ) TO TMP-LEN
    methodOut.setTmpLen(
        methodOut.getTmpLen() + methodIn.getHexRemainder(methodOut.getHexIndex() - 1));
    //  cobolCode::MOVE TMP-LEN TO LEN-CACHE-KEY-AREA
    methodOut.setLenCacheKeyArea(methodOut.getTmpLen());
    //  cobolCode::COMPUTE LEN-CACHE-DATA-AREA = ( HV-DATA-CNT (1) * FUNCTION~LENGTH
    // CACHE-DATA-ARRAY (1)) + FUNCTION~LENGTH CACHE-DATA-FIXED-AREA
    methodOut.setLenCacheDataArea(
        (methodOut.getHvDataCnt(0) * CacheDataArray.getCacheDataArrayFieldLength())
            + CacheDataFixedArea.getCacheDataFixedAreaFieldLength());
    //  cobolCode::COMPUTE TMP-LEN = LEN-CACHE-KEY-AREA + LEN-CACHE-DATA-AREA
    methodOut.setTmpLen(methodOut.getLenCacheKeyArea() + methodOut.getLenCacheDataArea());
    //  cobolCode::GETMAIN SET (TMP-POINTER) FLENGTH (TMP-LEN) SHARED NOSUSPEND RESP (WS-RESP) RESP2
    // (WS-RESP2)
    // getmain
    methodIn.setTmpPointer(
        TransactionManager.getMain(programCtx.getCicsSession(), methodOut.getTmpLen(), true));
    //  cobolCode::MOVE EIBRESP TO WS-RESP
    methodOut.setResp(programCtx.getCicsSession().getEibresp());
    //  cobolCode::MOVE EIBRESP2 TO WS-RESP2
    methodOut.setResp2(programCtx.getCicsSession().getEibresp2());
    //  cobolCode::EVALUATE WS-RESP
    switch (methodOut.getResp()) {
      case 0:
        //  cobolCode::SET GETMAIN-SUCCESSFUL TO TRUE
        methodOut.setGetmainSuccessfulTrue();

        break;
      default:
        //  cobolCode::SET GETMAIN-FAILED TO TRUE
        methodOut.setGetmainFailedTrue();

        //  LITERAL_2003 = '2003'
        methodOut.setCicsAbendCode(CONSTANTS.LITERAL_2003);
        methodOut.setMessage(CONSTANTS.LITERAL_1753158207);
        //  cobolCode::SET WTDQ-ERROR-MSG TO TRUE
        methodOut.setWtdqErrorMsgTrue();

        // cobolCode::GO TO 9800-ABEND-CICS
        if (programCtx.getDoNotSkipAbendCics()) {
          abendCics(programCtx.getAbendCicsInCtx());
        } else {
          programCtx.setDoNotSkipAbendCics(true);
        }
        if (programCtx.getDoNotSkipFormat()) {
          format(programCtx.getFormatInCtx());
        } else {
          programCtx.setDoNotSkipFormat(true);
        }
        abendDb2(programCtx.getAbendDb2InCtx());
        format9910(programCtx.getFormat9910InCtx());
        abend(programCtx.getAbendInCtx());
        zzzaGetDiag(programCtx.getZzzaGetDiagInCtx());
        zzzbGetConn(programCtx.getZzzbGetConnInCtx());
        zzzcGetStmt(programCtx.getZzzcGetStmtInCtx());
        zzzdGetCond(programCtx.getZzzdGetCondInCtx());
        zzzeOrdToken(programCtx.getZzzeOrdTokenInCtx());
        zzzgFormatSqlca(programCtx.getZzzgFormatSqlcaInCtx());
        zzzhPrintSqlca(programCtx.getZzzhPrintSqlcaInCtx());
        zzzfDisplay(programCtx.getZzzfDisplayInCtx());
        return methodOut;
        // cobolCodeEnds::GO TO 9800-ABEND-CICS
    }

    // *****************************************************
    // * Establish addressability to cache linkage areas
    // *+save cache pointer in tsq once
    // * areas have been loaded...
    // *****************************************************
    //  cobolCode::SET TSQ-CACHE-PTR TO TMP-POINTER
    methodOut.setTsqCachePtr(methodIn.getTmpPointer());

    //  cobolCode::SET ADDRESS OF CACHE-HPC-KEY-AREA TO TSQ-CACHE-PTR
    methodOut.getCacheHpcKeyArea().set(getObject(methodOut.getTsqCachePtr()));

    //  cobolCode::ADD LEN-CACHE-KEY-AREA TO TMP-POINTER-BIN
    methodOut.setTmpPointerBin(methodOut.getTmpPointerBin() + methodOut.getLenCacheKeyArea());
    //  cobolCode::SET CACHE-DATA-PTR TO TMP-POINTER
    methodOut.setCacheDataPtr(methodIn.getTmpPointer());

    //  cobolCode::SET ADDRESS OF CACHE-HPC-DATA-AREA TO CACHE-DATA-PTR
    methodOut.getCacheHpcDataArea().set(getObject(methodOut.getCacheDataPtr()));

    //  cobolCode::SET STORAGE-FOR-CACHE-OBTAINED TO TRUE
    methodOut.setStorageForCacheObtainedTrue();

    methodOut.setCacheKeyCnt(0);
    methodOut.setCacheDataCnt(0);
    //  cobolCode::MOVE WS-KEY-ARRAY-MAX TO CACHE-KEY-ARRAY-MAX
    methodOut.setCacheKeyArrayMax(methodOut.getKeyArrayMax());
    //  cobolCode::MOVE WS-DATA-ARRAY-MAX TO CACHE-DATA-ARRAY-MAX
    methodOut.setCacheDataArrayMax(methodOut.getDataArrayMax());
    //  cobolCode::MOVE WS-CACHE-KEY-OVERFLOW-IND TO CACHE-KEY-OVERFLOW-IND
    methodOut.setCacheKeyOverflowInd01(methodOut.getCacheKeyOverflowInd());
    //  cobolCode::MOVE WS-CACHE-DATA-OVERFLOW-IND TO CACHE-DATA-OVERFLOW-IND
    methodOut.setCacheDataOverflowInd01(methodOut.getCacheDataOverflowInd());

    return methodOut;
  }
  /**
   * loadCacheAreas This method is derived from COBOL Paragraph - 5000-LOAD-CACHE-AREAS COBOL
   * Cyclomatic complexity - 15 Input :
   *
   * <p>- sqlerrd COBOL Name: SQLERRD - hvQueryTyp COBOL Name: HV-QUERY-TYP - hvHipaaVerNbr COBOL
   * Name: HV-HIPAA-VER-NBR - hvSortCol1 COBOL Name: HV-SORT-COL1 - currKey COBOL Name: WS-CURR-KEY
   * - priorKey COBOL Name: WS-PRIOR-KEY - runningDataLen COBOL Name: WS-RUNNING-DATA-LEN -
   * lenOf1DataOccurrence COBOL Name: WS-LEN-OF-1-DATA-OCCURRENCE - cacheDataCnt COBOL Name:
   * CACHE-DATA-CNT - runningDataCnt COBOL Name: WS-RUNNING-DATA-CNT - cacheDataNbrOfEntries COBOL
   * Name: CACHE-DATA-NBR-OF-ENTRIES - dataErrorSw COBOL Name: DATA-ERROR-SW - cacheKeyCnt COBOL
   * Name: CACHE-KEY-CNT - runningKeyCnt COBOL Name: WS-RUNNING-KEY-CNT - runningKeyLen COBOL Name:
   * WS-RUNNING-KEY-LEN - lenOf1KeyOccurrence COBOL Name: WS-LEN-OF-1-KEY-OCCURRENCE -
   * lenCacheKeyArea COBOL Name: LEN-CACHE-KEY-AREA - writetdqCommarea COBOL Name: WRITETDQ-COMMAREA
   *
   * <p>Output :
   *
   * <p>- wKeyQueryTyp COBOL Name: W-KEY-QUERY-TYP - hvQueryTyp COBOL Name: HV-QUERY-TYP -
   * wKeyHipaaVerNbr COBOL Name: W-KEY-HIPAA-VER-NBR - hvHipaaVerNbr COBOL Name: HV-HIPAA-VER-NBR -
   * wKeySortCol1 COBOL Name: W-KEY-SORT-COL1 - hvSortCol1 COBOL Name: HV-SORT-COL1 - runningDataLen
   * COBOL Name: WS-RUNNING-DATA-LEN - cacheDataCnt COBOL Name: CACHE-DATA-CNT - runningDataCnt
   * COBOL Name: WS-RUNNING-DATA-CNT - cacheDataNbrOfEntries COBOL Name: CACHE-DATA-NBR-OF-ENTRIES -
   * eofSw COBOL Name: EOF-SW - cacheDataNdx COBOL Name: CACHE-DATA-NDX - priorKey COBOL Name:
   * WS-PRIOR-KEY - currKey COBOL Name: WS-CURR-KEY - cacheKeyCnt COBOL Name: CACHE-KEY-CNT -
   * runningKeyCnt COBOL Name: WS-RUNNING-KEY-CNT - runningKeyLen COBOL Name: WS-RUNNING-KEY-LEN -
   * display1 COBOL Name: WS-DISPLAY1 - display2 COBOL Name: WS-DISPLAY2 - display3 COBOL Name:
   * WS-DISPLAY3 - lenCacheKeyArea COBOL Name: LEN-CACHE-KEY-AREA - wtdqMessage COBOL Name:
   * WTDQ-MESSAGE - wtdqMessageTyp COBOL Name: WTDQ-MESSAGE-TYP - cacheKeyNdx COBOL Name:
   * CACHE-KEY-NDX - cacheDataOffset COBOL Name: CACHE-DATA-OFFSET - cacheQueryTyp COBOL Name:
   * CACHE-QUERY-TYP - cacheHipaaVerNbr COBOL Name: CACHE-HIPAA-VER-NBR - cacheSortCol1 COBOL Name:
   * CACHE-SORT-COL1 - i1 COBOL Name: I1 - i2 COBOL Name: I2 - i3 COBOL Name: I3 - i4 COBOL Name: I4
   * - i5 COBOL Name: I5 - i6 COBOL Name: I6 - i7 COBOL Name: I7
   *
   * @throws CFException
   */
  @Override
  public LoadCacheAreasOutCtx loadCacheAreas(LoadCacheAreasInCtx methodIn) throws Exception {
    // Declare local variables used in the method
    ArrayList<char[]> charArray = new ArrayList<char[]>();
    char[] joinCharArray = null;
    Map<String, Object> updated = null;
    boolean overflow = false;
    // End of variable declaration

    // *81***************************************************************
    // *81 5000-Load-cache-areas                                        *
    // *81                                                              *
    // *81 business function:                                           *
    // *81 load db2 records to cics cache.                              *
    // *81***************************************************************
    // *82***************************************************************
    // *82 5000-load-cache-areas                                        *
    // *82  this routine will fetch records from db2                    *
    // *82  which will be loaded to cics core/cache.                    *
    // *82**************************************************************
    // *82***************************************************************
    // *82 called by: 1. 4000-fetch-c1                                  *
    // *82 calls    : 1. 9900-abend-cics                                *
    // *82***************************************************************
    // Added variable to get the program context in place.
    DphpctsqCtx programCtx = methodIn.getDphpctsqCtx();
    // Added variable to get the output context in place.
    LoadCacheAreasOutCtx methodOut = methodIn.getLoadCacheAreasOutCtx();
    //  cobolCode::PERFORM SQLERRD (3) TIMES
    for (int index0 = 0; index0 < methodIn.getSqlerrd(2); index0++) {
      //  cobolCode::MOVE HV-QUERY-TYP (I1) TO W-KEY-QUERY-TYP
      methodOut.setWKeyQueryTyp(methodOut.getHvQueryTyp(methodOut.getI1() - 1));
      //  cobolCode::MOVE HV-HIPAA-VER-NBR (I2) TO W-KEY-HIPAA-VER-NBR
      methodOut.setWKeyHipaaVerNbr(methodOut.getHvHipaaVerNbr(methodOut.getI2() - 1));
      //  cobolCode::MOVE HV-SORT-COL1 (I3) TO W-KEY-SORT-COL1
      methodOut.setWKeySortCol1(methodOut.getHvSortCol1(methodOut.getI3() - 1));
      //  cobolCode::IF WS-CURR-KEY = WS-PRIOR-KEY
      if (compareChars(methodOut.getCurrKey(), methodOut.getPriorKey()) == 0) {
        //  cobolCode::COMPUTE WS-RUNNING-DATA-LEN = WS-RUNNING-DATA-LEN +
        // WS-LEN-OF-1-DATA-OCCURRENCE
        methodOut.setRunningDataLen(
            methodOut.getRunningDataLen() + methodIn.getLenOf1DataOccurrence());
        //  cobolCode::ADD +1 TO CACHE-DATA-CNT , WS-RUNNING-DATA-CNT , CACHE-DATA-NBR-OF-ENTRIES (
        // CACHE-KEY-NDX )
        methodOut.setCacheDataCnt(methodOut.getCacheDataCnt() + 1);
        methodOut.setRunningDataCnt(methodOut.getRunningDataCnt() + 1);
        methodOut.setCacheDataNbrOfEntries(
            methodOut.getCacheKeyNdx() - 1,
            methodOut.getCacheDataNbrOfEntries(methodOut.getCacheKeyNdx() - 1) + 1);
        //  cobolCode::PERFORM 5100-CHECK-CACHE-DATA-AREA THRU 5100-EXIT
        checkCacheDataArea(programCtx.getCheckCacheDataAreaInCtx()); /*5100-CHECK-CACHE-DATA-AREA*/
        //  cobolCode::IF DATA-ERROR
        if (methodIn.isDataError()) {
          //  cobolCode::SET EOF TO TRUE
          methodOut.setEofTrue();

          // cobolCode::GO TO 5000-EXIT
          return methodOut;
          // cobolCodeEnds::GO TO 5000-EXIT
        }
        //  cobolCode::SET CACHE-DATA-NDX TO CACHE-DATA-CNT
        methodOut.setCacheDataNdx(methodOut.getCacheDataCnt());

        //  cobolCode::PERFORM 5200-LOAD-DATA-CACHE THRU 5200-EXIT
        loadDataCache(programCtx.getLoadDataCacheInCtx()); /*5200-LOAD-DATA-CACHE*/
      }
      //  cobolCode::ELSE
      else {
        methodOut.setPriorKey(methodOut.getCurrKey().toCharArray());
        //  cobolCode::ADD +1 TO CACHE-KEY-CNT , WS-RUNNING-KEY-CNT
        methodOut.setCacheKeyCnt(methodOut.getCacheKeyCnt() + 1);
        methodOut.setRunningKeyCnt(methodOut.getRunningKeyCnt() + 1);
        //  cobolCode::COMPUTE WS-RUNNING-KEY-LEN = WS-RUNNING-KEY-LEN + WS-LEN-OF-1-KEY-OCCURRENCE
        methodOut.setRunningKeyLen(
            methodOut.getRunningKeyLen() + methodIn.getLenOf1KeyOccurrence());
        //  cobolCode::IF WS-RUNNING-KEY-LEN > LEN-CACHE-KEY-AREA
        if ((methodOut.getRunningKeyLen() > methodOut.getLenCacheKeyArea())) {
          //  FORMAT1725453934 = "+++++++++9"
          methodOut.setDisplay1(
              CFUtil.cobolNumberFormatter(
                  CONSTANTS.FORMAT1725453934,
                  String.valueOf(methodOut.getCacheKeyCnt()).toCharArray()));
          //  cobolCode::MOVE WS-RUNNING-KEY-LEN TO WS-DISPLAY2
          //  FORMAT1725453934 = "+++++++++9"
          methodOut.setDisplay2(
              CFUtil.cobolNumberFormatter(
                  CONSTANTS.FORMAT1725453934,
                  String.valueOf(methodOut.getRunningKeyLen()).toCharArray()));
          //  cobolCode::MOVE LEN-CACHE-KEY-AREA TO WS-DISPLAY3
          //  FORMAT1725453934 = "+++++++++9"
          methodOut.setDisplay3(
              CFUtil.cobolNumberFormatter(
                  CONSTANTS.FORMAT1725453934,
                  String.valueOf(methodOut.getLenCacheKeyArea()).toCharArray()));
          //  cobolCode::MOVE SPACES TO WTDQ-MESSAGE
          methodOut.setWtdqMessage(CONSTANTS.SPACE_5000);
          //  cobolCode::STRING 'CACHE OVERFLOW:' DELIMITED BY SIZE ' KEY CNT=' DELIMITED BY SIZE
          // WS-DISPLAY1 DELIMITED BY SIZE ' RUNNING LEN=' DELIMITED BY SIZE WS-DISPLAY2 DELIMITED
          // BY SIZE '    MAX LEN=' DELIMITED BY SIZE WS-DISPLAY3 DELIMITED BY SIZE ' KEY CNT
          // LOWERED BY 1' DELIMITED BY SIZE INTO WTDQ-MESSAGE
          charArray = new ArrayList<char[]>();
          charArray.add(CONSTANTS.LITERAL_CACHE_B_OVERFLOW_CL_);
          charArray.add(CONSTANTS.LITERAL_1573260015);
          charArray.add(methodOut.getDisplay1());
          charArray.add(CONSTANTS.LITERAL_1077635333);
          charArray.add(methodOut.getDisplay2());
          charArray.add(CONSTANTS.LITERAL_1319075196);
          charArray.add(methodOut.getDisplay3());
          charArray.add(CONSTANTS.LITERAL_B5_KEYCNTLOWEREDBY1);
          joinCharArray =
              Field.mergeArrays(
                  charArray.get(0),
                  charArray.get(1),
                  charArray.get(2),
                  charArray.get(3),
                  charArray.get(4),
                  charArray.get(5),
                  charArray.get(6),
                  charArray.get(7));
          updated = updateString(methodOut.getWtdqMessage(), joinCharArray);
          methodOut.setWtdqMessage((char[]) updated.get("string"));
          overflow = (boolean) updated.get("exceeds");
          //  cobolCode::SET WTDQ-INFO-MSG TO TRUE
          methodOut.setWtdqInfoMsgTrue();

          //  cobolCode::DISPLAY WRITETDQ-COMMAREA
          logger.info(methodIn.getWritetdqCommarea().toString());
          //  cobolCode::SUBTRACT 1 FROM CACHE-KEY-CNT
          methodOut.setCacheKeyCnt(methodOut.getCacheKeyCnt() - 1);
          //  cobolCode::SET EOF TO TRUE
          methodOut.setEofTrue();

          // cobolCode::GO TO 5000-EXIT
          return methodOut;
          // cobolCodeEnds::GO TO 5000-EXIT
        }
        //  cobolCode::SET CACHE-KEY-NDX TO CACHE-KEY-CNT
        methodOut.setCacheKeyNdx(methodOut.getCacheKeyCnt());

        //  cobolCode::IF CACHE-KEY-CNT = +1
        if ((methodOut.getCacheKeyCnt() == 1)) {
          //  cobolCode::MOVE +1 TO CACHE-DATA-OFFSET (1)
          methodOut.setCacheDataOffset(0, 1);
        }
        //  cobolCode::ELSE
        else {
          //  cobolCode::COMPUTE CACHE-DATA-OFFSET ( CACHE-KEY-NDX ) = CACHE-DATA-OFFSET (
          // CACHE-KEY-NDX - 1) + CACHE-DATA-NBR-OF-ENTRIES ( CACHE-KEY-NDX - 1)
          methodOut.setCacheDataOffset(
              methodOut.getCacheKeyNdx() - 1,
              methodOut.getCacheDataOffset(methodOut.getCacheKeyNdx() - 1 - 1)
                  + methodOut.getCacheDataNbrOfEntries(methodOut.getCacheKeyNdx() - 1 - 1));
        }
        //  cobolCode::MOVE HV-QUERY-TYP (I1) TO CACHE-QUERY-TYP ( CACHE-KEY-NDX )
        methodOut.setCacheQueryTyp(
            methodOut.getCacheKeyNdx() - 1, methodOut.getHvQueryTyp(methodOut.getI1() - 1));
        //  cobolCode::MOVE HV-HIPAA-VER-NBR (I2) TO CACHE-HIPAA-VER-NBR ( CACHE-KEY-NDX )
        methodOut.setCacheHipaaVerNbr(
            methodOut.getCacheKeyNdx() - 1, methodOut.getHvHipaaVerNbr(methodOut.getI2() - 1));
        //  cobolCode::MOVE HV-SORT-COL1 (I3) TO CACHE-SORT-COL1 ( CACHE-KEY-NDX )
        methodOut.setCacheSortCol1(
            methodOut.getCacheKeyNdx() - 1, methodOut.getHvSortCol1(methodOut.getI3() - 1));
        //  cobolCode::MOVE +1 TO CACHE-DATA-NBR-OF-ENTRIES ( CACHE-KEY-NDX )
        methodOut.setCacheDataNbrOfEntries(methodOut.getCacheKeyNdx() - 1, 1);
        //  cobolCode::ADD +1 TO CACHE-DATA-CNT , WS-RUNNING-DATA-CNT
        methodOut.setCacheDataCnt(methodOut.getCacheDataCnt() + 1);
        methodOut.setRunningDataCnt(methodOut.getRunningDataCnt() + 1);
        //  cobolCode::COMPUTE WS-RUNNING-DATA-LEN = WS-RUNNING-DATA-LEN +
        // WS-LEN-OF-1-DATA-OCCURRENCE
        methodOut.setRunningDataLen(
            methodOut.getRunningDataLen() + methodIn.getLenOf1DataOccurrence());
        //  cobolCode::PERFORM 5100-CHECK-CACHE-DATA-AREA THRU 5100-EXIT
        checkCacheDataArea(programCtx.getCheckCacheDataAreaInCtx()); /*5100-CHECK-CACHE-DATA-AREA*/
        //  cobolCode::IF DATA-ERROR
        if (methodIn.isDataError()) {
          //  cobolCode::SET EOF TO TRUE
          methodOut.setEofTrue();

          // cobolCode::GO TO 5000-EXIT
          return methodOut;
          // cobolCodeEnds::GO TO 5000-EXIT
        }
        //  cobolCode::SET CACHE-DATA-NDX TO CACHE-DATA-CNT
        methodOut.setCacheDataNdx(methodOut.getCacheDataCnt());

        //  cobolCode::PERFORM 5200-LOAD-DATA-CACHE THRU 5200-EXIT
        loadDataCache(programCtx.getLoadDataCacheInCtx()); /*5200-LOAD-DATA-CACHE*/
      }
      //  cobolCode::SET I1, I2, I3, I4, I5, I6, I7 UP BY 1
      methodOut.setI1(methodOut.getI1() + 1);

      methodOut.setI2(methodOut.getI2() + 1);

      methodOut.setI3(methodOut.getI3() + 1);

      methodOut.setI4(methodOut.getI4() + 1);

      methodOut.setI5(methodOut.getI5() + 1);

      methodOut.setI6(methodOut.getI6() + 1);

      methodOut.setI7(methodOut.getI7() + 1);
    }

    return methodOut;
  }
  /**
   * checkCacheDataArea This method is derived from COBOL Paragraph - 5100-CHECK-CACHE-DATA-AREA
   * COBOL Cyclomatic complexity - 12 Input :
   *
   * <p>- runningDataLen COBOL Name: WS-RUNNING-DATA-LEN - lenCacheDataArea COBOL Name:
   * LEN-CACHE-DATA-AREA - cacheDataCnt COBOL Name: CACHE-DATA-CNT - cacheKeyCnt COBOL Name:
   * CACHE-KEY-CNT - writetdqCommarea COBOL Name: WRITETDQ-COMMAREA
   *
   * <p>Output :
   *
   * <p>- display1 COBOL Name: WS-DISPLAY1 - cacheDataCnt COBOL Name: CACHE-DATA-CNT - display2
   * COBOL Name: WS-DISPLAY2 - runningDataLen COBOL Name: WS-RUNNING-DATA-LEN - display3 COBOL Name:
   * WS-DISPLAY3 - lenCacheDataArea COBOL Name: LEN-CACHE-DATA-AREA - display4 COBOL Name:
   * WS-DISPLAY4 - cacheKeyCnt COBOL Name: CACHE-KEY-CNT - cicsAbendCode COBOL Name: CICS-ABEND-CODE
   * - wtdqMessage COBOL Name: WTDQ-MESSAGE - wtdqMessageTyp COBOL Name: WTDQ-MESSAGE-TYP -
   * dataErrorSw COBOL Name: DATA-ERROR-SW
   *
   * @throws CFException
   */
  @Override
  public CheckCacheDataAreaOutCtx checkCacheDataArea(CheckCacheDataAreaInCtx methodIn)
      throws Exception {
    // Declare local variables used in the method
    ArrayList<char[]> charArray = new ArrayList<char[]>();
    char[] joinCharArray = null;
    Map<String, Object> updated = null;
    boolean overflow = false;
    // End of variable declaration

    // *81***************************************************************
    // *81 5100-Check-cache-data-area                                   *
    // *81                                                              *
    // *81 business function:                                           *
    // *81 ensure space is availabe in cache data area                  *
    // *81***************************************************************
    // *82***************************************************************
    // *82 called by: 1. 5000-load-cache-areas                          *
    // *82 calls    : 1. 9900-abend-cics                                *
    // *82***************************************************************
    // Added variable to get the program context in place.
    DphpctsqCtx programCtx = methodIn.getDphpctsqCtx();
    // Added variable to get the output context in place.
    CheckCacheDataAreaOutCtx methodOut = methodIn.getCheckCacheDataAreaOutCtx();
    //  cobolCode::IF WS-RUNNING-DATA-LEN > LEN-CACHE-DATA-AREA
    if ((methodOut.getRunningDataLen() > methodOut.getLenCacheDataArea())) {
      //  FORMAT1725453934 = "+++++++++9"
      methodOut.setDisplay1(
          CFUtil.cobolNumberFormatter(
              CONSTANTS.FORMAT1725453934,
              String.valueOf(methodOut.getCacheDataCnt()).toCharArray()));
      //  cobolCode::MOVE WS-RUNNING-DATA-LEN TO WS-DISPLAY2
      //  FORMAT1725453934 = "+++++++++9"
      methodOut.setDisplay2(
          CFUtil.cobolNumberFormatter(
              CONSTANTS.FORMAT1725453934,
              String.valueOf(methodOut.getRunningDataLen()).toCharArray()));
      //  cobolCode::MOVE LEN-CACHE-DATA-AREA TO WS-DISPLAY3
      //  FORMAT1725453934 = "+++++++++9"
      methodOut.setDisplay3(
          CFUtil.cobolNumberFormatter(
              CONSTANTS.FORMAT1725453934,
              String.valueOf(methodOut.getLenCacheDataArea()).toCharArray()));
      //  FORMAT1725453934 = "+++++++++9"
      methodOut.setDisplay4(
          CFUtil.cobolNumberFormatter(
              CONSTANTS.FORMAT1725453934,
              String.valueOf(methodOut.getCacheKeyCnt()).toCharArray()));
      //  LITERAL_5101 = '5101'
      methodOut.setCicsAbendCode(CONSTANTS.LITERAL_5101);
      //  cobolCode::MOVE SPACES TO WTDQ-MESSAGE
      methodOut.setWtdqMessage(CONSTANTS.SPACE_5000);
      //  cobolCode::STRING 'CACHE OVERFLOW:' DELIMITED BY SIZE ' CURR DATA CNT=' DELIMITED BY SIZE
      // WS-DISPLAY1 DELIMITED BY SIZE ' RUNNING LEN=' DELIMITED BY SIZE WS-DISPLAY2 DELIMITED BY
      // SIZE '     MAX LEN=' DELIMITED BY SIZE WS-DISPLAY3 DELIMITED BY SIZE ' KEY COUNT OF '
      // DELIMITED BY SIZE WS-DISPLAY4 DELIMITED BY SIZE ' WILL BE REDUCED BY 1' DELIMITED BY SIZE
      // INTO WTDQ-MESSAGE
      charArray = new ArrayList<char[]>();
      charArray.add(CONSTANTS.LITERAL_CACHE_B_OVERFLOW_CL_);
      charArray.add(CONSTANTS.LITERAL_754667848);
      charArray.add(methodOut.getDisplay1());
      charArray.add(CONSTANTS.LITERAL_1077635333);
      charArray.add(methodOut.getDisplay2());
      charArray.add(CONSTANTS.LITERAL_2047346400);
      charArray.add(methodOut.getDisplay3());
      charArray.add(CONSTANTS.LITERAL_104494852);
      charArray.add(methodOut.getDisplay4());
      charArray.add(CONSTANTS.LITERAL_B5_WILLBEREDUCEDBY1);
      joinCharArray =
          Field.mergeArrays(
              charArray.get(0),
              charArray.get(1),
              charArray.get(2),
              charArray.get(3),
              charArray.get(4),
              charArray.get(5),
              charArray.get(6),
              charArray.get(7),
              charArray.get(8),
              charArray.get(9));
      updated = updateString(methodOut.getWtdqMessage(), joinCharArray);
      methodOut.setWtdqMessage((char[]) updated.get("string"));
      overflow = (boolean) updated.get("exceeds");
      //  cobolCode::SET WTDQ-INFO-MSG TO TRUE
      methodOut.setWtdqInfoMsgTrue();

      //  cobolCode::DISPLAY WRITETDQ-COMMAREA
      logger.info(methodIn.getWritetdqCommarea().toString());
      //  cobolCode::SUBTRACT 1 FROM CACHE-KEY-CNT
      methodOut.setCacheKeyCnt(methodOut.getCacheKeyCnt() - 1);
      //  cobolCode::SET DATA-ERROR TO TRUE
      methodOut.setDataErrorTrue();
    }

    return methodOut;
  }
  /**
   * loadDataCache This method is derived from COBOL Paragraph - 5200-LOAD-DATA-CACHE COBOL
   * Cyclomatic complexity - 1 Input :
   *
   * <p>- hvHipaaCd COBOL Name: HV-HIPAA-CD - hvGrnrcRqstCd COBOL Name: HV-GRNRC-RQST-CD -
   * hvHipaaGrpCd COBOL Name: HV-HIPAA-GRP-CD - hvDataTyp COBOL Name: HV-DATA-TYP
   *
   * <p>Output :
   *
   * <p>- cacheHipaaCd COBOL Name: CACHE-HIPAA-CD - hvHipaaCd COBOL Name: HV-HIPAA-CD -
   * cacheGrnrcRqstCd COBOL Name: CACHE-GRNRC-RQST-CD - hvGrnrcRqstCd COBOL Name: HV-GRNRC-RQST-CD -
   * cacheHipaaGrpCd COBOL Name: CACHE-HIPAA-GRP-CD - hvHipaaGrpCd COBOL Name: HV-HIPAA-GRP-CD -
   * cacheDataTyp COBOL Name: CACHE-DATA-TYP - hvDataTyp COBOL Name: HV-DATA-TYP
   *
   * @throws CFException
   */
  @Override
  public LoadDataCacheOutCtx loadDataCache(LoadDataCacheInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 5200-Load-data-cache                                         *
    // *81                                                              *
    // *81 business function:                                           *
    // *81 load data into data cache area.                              *
    // *81***************************************************************
    // *82***************************************************************
    // *82 called by: 1. 5000-load-cache-areas                          *
    // *82 calls    : 1. 9900-abend-cics                                *
    // *82***************************************************************
    // Added variable to get the program context in place.
    DphpctsqCtx programCtx = methodIn.getDphpctsqCtx();
    // Added variable to get the output context in place.
    LoadDataCacheOutCtx methodOut = methodIn.getLoadDataCacheOutCtx();
    //  cobolCode::MOVE HV-HIPAA-CD (I4) TO CACHE-HIPAA-CD ( CACHE-DATA-NDX )
    methodOut.setCacheHipaaCd(
        methodIn.getCacheDataNdx() - 1, methodOut.getHvHipaaCd(methodIn.getI4() - 1));
    //  cobolCode::MOVE HV-GRNRC-RQST-CD (I5) TO CACHE-GRNRC-RQST-CD ( CACHE-DATA-NDX )
    methodOut.setCacheGrnrcRqstCd(
        methodIn.getCacheDataNdx() - 1, methodOut.getHvGrnrcRqstCd(methodIn.getI5() - 1));
    //  cobolCode::MOVE HV-HIPAA-GRP-CD (I6) TO CACHE-HIPAA-GRP-CD ( CACHE-DATA-NDX )
    methodOut.setCacheHipaaGrpCd(
        methodIn.getCacheDataNdx() - 1, methodOut.getHvHipaaGrpCd(methodIn.getI6() - 1));
    //  cobolCode::MOVE HV-DATA-TYP (I7) TO CACHE-DATA-TYP ( CACHE-DATA-NDX )
    methodOut.setCacheDataTyp(
        methodIn.getCacheDataNdx() - 1, methodOut.getHvDataTyp(methodIn.getI7() - 1));

    return methodOut;
  }
  /**
   * writeCacheTsq This method is derived from COBOL Paragraph - 6000-WRITE-CACHE-TSQ COBOL
   * Cyclomatic complexity - 6 Input :
   *
   * <p>- tsQueueName COBOL Name: WS-TS-QUEUE-NAME
   *
   * <p>Output :
   *
   * <p>- resp COBOL Name: WS-RESP - resp2 COBOL Name: WS-RESP2 - tsqWriteSw COBOL Name:
   * TSQ-WRITE-SW - cicsAbendCode COBOL Name: CICS-ABEND-CODE - message COBOL Name: WS-MESSAGE -
   * wtdqMessageTyp COBOL Name: WTDQ-MESSAGE-TYP
   *
   * @throws CFException
   */
  @Override
  public WriteCacheTsqOutCtx writeCacheTsq(WriteCacheTsqInCtx methodIn) throws Exception {
    // Declare local variables used in the method
    ArrayList<char[]> charArray = new ArrayList<char[]>();
    char[] joinCharArray = null;
    Map<String, Object> updated = null;
    // End of variable declaration

    // *81***************************************************************
    // *81 6000-Write-cache-tsq                                         *
    // *81                                                              *
    // *81 business function:                                           *
    // *81 write cache in tsq area.                                     *
    // *81***************************************************************

    // *EXEC CICS
    // *  WRITEQ      TS
    // *  QNAME       (WS-TS-QUEUE-NAME)
    // *  FROM        (WS-CACHE-TSQ-RECORD)
    // *  LENGTH      (LENGTH OF WS-CACHE-TSQ-RECORD)
    // *  ITEM        (WS-TSQ-ITEM1)
    // *  MAIN
    // *  NOSUSPEND
    // *  RESP        (WS-RESP)
    // *  RESP2       (WS-RESP2)
    // *END-EXEC.
    // Added variable to get the program context in place.
    DphpctsqCtx programCtx = methodIn.getDphpctsqCtx();
    // Added variable to get the output context in place.
    WriteCacheTsqOutCtx methodOut = methodIn.getWriteCacheTsqOutCtx();
    //  cobolCode::WRITEQ TS QNAME (WS-TS-QUEUE-NAME) FROM (WS-CACHE-TSQ-RECORD) LENGTH
    // (FUNCTION~LENGTH~WS-CACHE-TSQ-RECORD) ITEM (WS-TSQ-ITEM1) MAIN NOSUSPEND RESP (WS-RESP) RESP2
    // (WS-RESP2)
    // write data to a queue
    TransactionManager.writeQueue(
        programCtx.getCicsSession(),
        methodIn.getTsQueueName(),
        methodIn.getCacheTsqRecord().toCharArray(),
        CacheTsqRecord.getCacheTsqRecordFieldLength(),
        methodIn.getTsqItem1(),
        false /*toRewrite*/,
        false /*isPersistentQ*/);
    //  cobolCode::MOVE EIBRESP TO WS-RESP
    methodOut.setResp(programCtx.getCicsSession().getEibresp());
    //  cobolCode::MOVE EIBRESP2 TO WS-RESP2
    methodOut.setResp2(programCtx.getCicsSession().getEibresp2());
    //  cobolCode::EVALUATE WS-RESP
    switch (methodOut.getResp()) {
      case 0:
        //  cobolCode::SET TSQ-WRITE-SUCCESSFUL TO TRUE
        methodOut.setTsqWriteSuccessfulTrue();

        break;
      default:
        //  cobolCode::SET TSQ-WRITE-FAILED TO TRUE
        methodOut.setTsqWriteFailedTrue();

        //  LITERAL_6001 = '6001'
        methodOut.setCicsAbendCode(CONSTANTS.LITERAL_6001);
        methodOut.setMessage(CONSTANTS.SPACE_80);
        //  cobolCode::STRING 'WRITE OF CACHE TSQ ' DELIMITED BY SIZE WS-TS-QUEUE-NAME DELIMITED BY
        // SIZE ' FAILED' DELIMITED BY SIZE INTO WS-MESSAGE
        charArray = new ArrayList<char[]>();
        charArray.add(CONSTANTS.LITERAL_1365944475);
        charArray.add(methodIn.getTsQueueName());
        charArray.add(CONSTANTS.LITERAL_B_FAILED);
        joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1), charArray.get(2));
        updated = updateString(methodOut.getMessage(), joinCharArray);
        methodOut.setMessage((char[]) updated.get("string"));
        //  cobolCode::SET WTDQ-ERROR-MSG TO TRUE
        methodOut.setWtdqErrorMsgTrue();

        // cobolCode::GO TO 9800-ABEND-CICS
        if (programCtx.getDoNotSkipAbendCics()) {
          abendCics(programCtx.getAbendCicsInCtx());
        } else {
          programCtx.setDoNotSkipAbendCics(true);
        }
        if (programCtx.getDoNotSkipFormat()) {
          format(programCtx.getFormatInCtx());
        } else {
          programCtx.setDoNotSkipFormat(true);
        }
        abendDb2(programCtx.getAbendDb2InCtx());
        format9910(programCtx.getFormat9910InCtx());
        abend(programCtx.getAbendInCtx());
        zzzaGetDiag(programCtx.getZzzaGetDiagInCtx());
        zzzbGetConn(programCtx.getZzzbGetConnInCtx());
        zzzcGetStmt(programCtx.getZzzcGetStmtInCtx());
        zzzdGetCond(programCtx.getZzzdGetCondInCtx());
        zzzeOrdToken(programCtx.getZzzeOrdTokenInCtx());
        zzzgFormatSqlca(programCtx.getZzzgFormatSqlcaInCtx());
        zzzhPrintSqlca(programCtx.getZzzhPrintSqlcaInCtx());
        zzzfDisplay(programCtx.getZzzfDisplayInCtx());
        return methodOut;
        // cobolCodeEnds::GO TO 9800-ABEND-CICS
    }

    return methodOut;
  }
  /**
   * displayCacheInfo This method is derived from COBOL Paragraph - 7000-DISPLAY-CACHE-INFO COBOL
   * Cyclomatic complexity - 14 Input :
   *
   * <p>- writetdqCommarea COBOL Name: WRITETDQ-COMMAREA - tsQueueName COBOL Name: WS-TS-QUEUE-NAME
   * - tmpLen COBOL Name: TMP-LEN - lenCacheKeyArea COBOL Name: LEN-CACHE-KEY-AREA - tsqCacheAddress
   * COBOL Name: TSQ-CACHE-ADDRESS - lenCacheDataArea COBOL Name: LEN-CACHE-DATA-AREA -
   * cacheDataAddress COBOL Name: CACHE-DATA-ADDRESS
   *
   * <p>Output :
   *
   * <p>- message COBOL Name: WS-MESSAGE - display1 COBOL Name: WS-DISPLAY1 - tmpLen COBOL Name:
   * TMP-LEN - wtdqMessage COBOL Name: WTDQ-MESSAGE - lenCacheKeyArea COBOL Name: LEN-CACHE-KEY-AREA
   * - integerDisplay COBOL Name: WS-INTEGER-DISPLAY - tsqCacheAddress COBOL Name: TSQ-CACHE-ADDRESS
   * - lenCacheDataArea COBOL Name: LEN-CACHE-DATA-AREA - cacheDataAddress COBOL Name:
   * CACHE-DATA-ADDRESS - wtdqMessageTyp COBOL Name: WTDQ-MESSAGE-TYP
   *
   * @throws CFException
   */
  @Override
  public DisplayCacheInfoOutCtx displayCacheInfo(DisplayCacheInfoInCtx methodIn) throws Exception {
    // Declare local variables used in the method
    ArrayList<char[]> charArray = new ArrayList<char[]>();
    char[] joinCharArray = null;
    Map<String, Object> updated = null;
    // End of variable declaration

    // *81***************************************************************
    // *81 7000-Display-cache-info                                      *
    // *81                                                              *
    // *81 business function:                                           *
    // *81 display cache information                                    *
    // *81***************************************************************
    // Added variable to get the program context in place.
    DphpctsqCtx programCtx = methodIn.getDphpctsqCtx();
    // Added variable to get the output context in place.
    DisplayCacheInfoOutCtx methodOut = methodIn.getDisplayCacheInfoOutCtx();
    methodOut.setMessage(CONSTANTS.SPACE_80);
    //  cobolCode::STRING 'CACHE SUCCESSFULLY BUILT' DELIMITED BY SIZE INTO WS-MESSAGE
    charArray = new ArrayList<char[]>();
    charArray.add(CONSTANTS.LITERAL_CACHE_B2_SUCCESSFULLYBUILT);
    joinCharArray = Field.mergeArrays(charArray.get(0));
    updated = updateString(methodOut.getMessage(), joinCharArray);
    methodOut.setMessage((char[]) updated.get("string"));
    //  cobolCode::DISPLAY WRITETDQ-COMMAREA
    logger.info(methodIn.getWritetdqCommarea().toString());

    // ***************

    // ***************
    methodOut.setMessage(CONSTANTS.SPACE_80);
    //  cobolCode::STRING 'CACHE POINTER STORED IN TSQ: ' DELIMITED BY SIZE WS-TS-QUEUE-NAME
    // DELIMITED BY SIZE INTO WS-MESSAGE
    charArray = new ArrayList<char[]>();
    charArray.add(CONSTANTS.LITERAL_CACHE_B5_POINTERSTOREDINTSQ_CL_);
    charArray.add(methodIn.getTsQueueName());
    joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1));
    updated = updateString(methodOut.getMessage(), joinCharArray);
    methodOut.setMessage((char[]) updated.get("string"));
    //  cobolCode::DISPLAY WRITETDQ-COMMAREA
    logger.info(methodIn.getWritetdqCommarea().toString());

    // ***************
    //  cobolCode::MOVE TMP-LEN TO WS-DISPLAY1
    //  FORMAT1725453934 = "+++++++++9"
    methodOut.setDisplay1(
        CFUtil.cobolNumberFormatter(
            CONSTANTS.FORMAT1725453934, String.valueOf(methodOut.getTmpLen()).toCharArray()));
    //  cobolCode::MOVE SPACES TO WTDQ-MESSAGE
    methodOut.setWtdqMessage(CONSTANTS.SPACE_5000);
    //  cobolCode::STRING 'TOTAL LENGTH OF SHARED CACHE MEMORY AREA =' DELIMITED BY SIZE WS-DISPLAY1
    // DELIMITED BY SIZE INTO WTDQ-MESSAGE
    charArray = new ArrayList<char[]>();
    charArray.add(CONSTANTS.LITERAL_19893348);
    charArray.add(methodOut.getDisplay1());
    joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1));
    updated = updateString(methodOut.getWtdqMessage(), joinCharArray);
    methodOut.setWtdqMessage((char[]) updated.get("string"));
    //  cobolCode::DISPLAY WRITETDQ-COMMAREA
    logger.info(methodIn.getWritetdqCommarea().toString());

    // ***************
    //  cobolCode::MOVE LEN-CACHE-KEY-AREA TO WS-DISPLAY1
    //  FORMAT1725453934 = "+++++++++9"
    methodOut.setDisplay1(
        CFUtil.cobolNumberFormatter(
            CONSTANTS.FORMAT1725453934,
            String.valueOf(methodOut.getLenCacheKeyArea()).toCharArray()));
    //  cobolCode::MOVE TSQ-CACHE-ADDRESS TO WS-INTEGER-DISPLAY
    //  FORMAT_2028989547 = "ZZZZZZZZZZ9"
    methodOut.setIntegerDisplay(
        CFUtil.cobolNumberFormatter(
            CONSTANTS.FORMAT_2028989547,
            String.valueOf(methodOut.getTsqCacheAddress()).toCharArray()));
    methodOut.setMessage(CONSTANTS.SPACE_80);
    //  cobolCode::MOVE SPACES TO WTDQ-MESSAGE
    methodOut.setWtdqMessage(CONSTANTS.SPACE_5000);
    //  cobolCode::STRING ' LENGTH OF CACHE KEY AREA:' DELIMITED BY SIZE WS-DISPLAY1 DELIMITED BY
    // SIZE ',BYTES AT ADDR = ' DELIMITED BY SIZE WS-INTEGER-DISPLAY DELIMITED BY SIZE INTO
    // WTDQ-MESSAGE
    charArray = new ArrayList<char[]>();
    charArray.add(CONSTANTS.LITERAL_802447190);
    charArray.add(methodOut.getDisplay1());
    charArray.add(CONSTANTS.LITERAL_1565802046);
    charArray.add(methodOut.getIntegerDisplay());
    joinCharArray =
        Field.mergeArrays(charArray.get(0), charArray.get(1), charArray.get(2), charArray.get(3));
    updated = updateString(methodOut.getWtdqMessage(), joinCharArray);
    methodOut.setWtdqMessage((char[]) updated.get("string"));
    //  cobolCode::DISPLAY WRITETDQ-COMMAREA
    logger.info(methodIn.getWritetdqCommarea().toString());

    // ***************
    //  cobolCode::MOVE LEN-CACHE-DATA-AREA TO WS-DISPLAY1
    //  FORMAT1725453934 = "+++++++++9"
    methodOut.setDisplay1(
        CFUtil.cobolNumberFormatter(
            CONSTANTS.FORMAT1725453934,
            String.valueOf(methodOut.getLenCacheDataArea()).toCharArray()));
    //  cobolCode::MOVE CACHE-DATA-ADDRESS TO WS-INTEGER-DISPLAY
    //  FORMAT_2028989547 = "ZZZZZZZZZZ9"
    methodOut.setIntegerDisplay(
        CFUtil.cobolNumberFormatter(
            CONSTANTS.FORMAT_2028989547,
            String.valueOf(methodOut.getCacheDataAddress()).toCharArray()));
    methodOut.setMessage(CONSTANTS.SPACE_80);
    //  cobolCode::MOVE SPACES TO WTDQ-MESSAGE
    methodOut.setWtdqMessage(CONSTANTS.SPACE_5000);
    //  cobolCode::STRING ' LENGTH OF CACHE DATA AREA:' DELIMITED BY SIZE WS-DISPLAY1 DELIMITED BY
    // SIZE ',BYTES AT ADDR = ' DELIMITED BY SIZE WS-INTEGER-DISPLAY DELIMITED BY SIZE INTO
    // WTDQ-MESSAGE
    charArray = new ArrayList<char[]>();
    charArray.add(CONSTANTS.LITERAL_493124361);
    charArray.add(methodOut.getDisplay1());
    charArray.add(CONSTANTS.LITERAL_1565802046);
    charArray.add(methodOut.getIntegerDisplay());
    joinCharArray =
        Field.mergeArrays(charArray.get(0), charArray.get(1), charArray.get(2), charArray.get(3));
    updated = updateString(methodOut.getWtdqMessage(), joinCharArray);
    methodOut.setWtdqMessage((char[]) updated.get("string"));
    //  cobolCode::SET WTDQ-INFO-MSG TO TRUE
    methodOut.setWtdqInfoMsgTrue();

    //  cobolCode::DISPLAY WRITETDQ-COMMAREA
    logger.info(methodIn.getWritetdqCommarea().toString());

    return methodOut;
  }
  /**
   * retrieveInterval This method is derived from COBOL Paragraph - 8000-RETRIEVE-INTERVAL COBOL
   * Cyclomatic complexity - 1 Input :
   *
   * <p>- cacheRefreshIntervalHh COBOL Name: CACHE-REFRESH-INTERVAL-HH - cacheRefreshIntervalMm
   * COBOL Name: CACHE-REFRESH-INTERVAL-MM - cacheRefreshIntervalSs COBOL Name:
   * CACHE-REFRESH-INTERVAL-SS
   *
   * <p>Output :
   *
   * <p>- cicsHours COBOL Name: CICS-HOURS - cacheRefreshIntervalHh COBOL Name:
   * CACHE-REFRESH-INTERVAL-HH - cicsMinutes COBOL Name: CICS-MINUTES - cacheRefreshIntervalMm COBOL
   * Name: CACHE-REFRESH-INTERVAL-MM - cicsSeconds COBOL Name: CICS-SECONDS - cacheRefreshIntervalSs
   * COBOL Name: CACHE-REFRESH-INTERVAL-SS
   *
   * @throws CFException
   */
  @Override
  public RetrieveIntervalOutCtx retrieveInterval(RetrieveIntervalInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 8000-Retrieve-interval.                                      *
    // *81                                                              *
    // *81 business function:  returns the cache refresh interval.      *
    // *82 called by  : 0000-mainline                                   *
    // *81***************************************************************

    // ****************************************************************
    // Added variable to get the program context in place.
    DphpctsqCtx programCtx = methodIn.getDphpctsqCtx();
    // Added variable to get the output context in place.
    RetrieveIntervalOutCtx methodOut = methodIn.getRetrieveIntervalOutCtx();
    //  cobolCode::MOVE CACHE-REFRESH-INTERVAL-HH TO CICS-HOURS
    methodOut.setCicsHours(methodOut.getCacheRefreshIntervalHh());
    //  cobolCode::MOVE CACHE-REFRESH-INTERVAL-MM TO CICS-MINUTES
    methodOut.setCicsMinutes(methodOut.getCacheRefreshIntervalMm());
    //  cobolCode::MOVE CACHE-REFRESH-INTERVAL-SS TO CICS-SECONDS
    methodOut.setCicsSeconds(methodOut.getCacheRefreshIntervalSs());

    return methodOut;
  }
  /**
   * abendCics This method is derived from COBOL Paragraph - 9800-ABEND-CICS COBOL Cyclomatic
   * complexity - 1 Input :
   *
   * <p>- writetdqCommarea COBOL Name: WRITETDQ-COMMAREA
   *
   * <p>Output : None
   *
   * @throws CFException
   */
  @Override
  public void abendCics(AbendCicsInCtx methodIn) throws Exception {

    // *****************************************************************
    // * Abend cics
    // *****************************************************************
    // Added variable to get the program context in place.
    DphpctsqCtx programCtx = methodIn.getDphpctsqCtx();
    //  cobolCode::PERFORM 9810-FORMAT THRU 9810-EXIT
    format(programCtx.getFormatInCtx()); /*9810-FORMAT*/
    //  cobolCode::DISPLAY WRITETDQ-COMMAREA
    logger.info(methodIn.getWritetdqCommarea().toString());
    //  cobolCode::PERFORM 9999-ABEND THRU 9999-EXIT
    abend(programCtx.getAbendInCtx()); /*9999-ABEND*/
  }
  /**
   * format This method is derived from COBOL Paragraph - 9810-FORMAT COBOL Cyclomatic complexity -
   * 9 Input :
   *
   * <p>- resp COBOL Name: WS-RESP - resp2 COBOL Name: WS-RESP2 - thisProgram COBOL Name:
   * WS-THIS-PROGRAM - message COBOL Name: WS-MESSAGE
   *
   * <p>Output :
   *
   * <p>- display1 COBOL Name: WS-DISPLAY1 - resp COBOL Name: WS-RESP - display2 COBOL Name:
   * WS-DISPLAY2 - resp2 COBOL Name: WS-RESP2 - wtdqMessage COBOL Name: WTDQ-MESSAGE -
   * wtdqMessageTyp COBOL Name: WTDQ-MESSAGE-TYP
   *
   * @throws CFException
   */
  @Override
  public FormatOutCtx format(FormatInCtx methodIn) throws Exception {
    // Declare local variables used in the method
    ArrayList<char[]> charArray = new ArrayList<char[]>();
    char[] joinCharArray = null;
    Map<String, Object> updated = null;
    // End of variable declaration

    // *****************************************************************
    // * Format cics abend
    // *****************************************************************
    // Added variable to get the program context in place.
    DphpctsqCtx programCtx = methodIn.getDphpctsqCtx();
    // Added variable to get the output context in place.
    FormatOutCtx methodOut = methodIn.getFormatOutCtx();
    //  cobolCode::MOVE WS-RESP TO WS-DISPLAY1
    //  FORMAT1725453934 = "+++++++++9"
    methodOut.setDisplay1(
        CFUtil.cobolNumberFormatter(
            CONSTANTS.FORMAT1725453934, String.valueOf(methodOut.getResp()).toCharArray()));
    //  cobolCode::MOVE WS-RESP2 TO WS-DISPLAY2
    //  FORMAT1725453934 = "+++++++++9"
    methodOut.setDisplay2(
        CFUtil.cobolNumberFormatter(
            CONSTANTS.FORMAT1725453934, String.valueOf(methodOut.getResp2()).toCharArray()));
    //  cobolCode::MOVE SPACES TO WTDQ-MESSAGE
    methodOut.setWtdqMessage(CONSTANTS.SPACE_5000);
    //  cobolCode::STRING 'PROGRAM ' DELIMITED BY SIZE WS-THIS-PROGRAM DELIMITED BY SIZE ' ABEND,'
    // DELIMITED BY SIZE ' RESP:' DELIMITED BY SIZE WS-DISPLAY1 DELIMITED BY SIZE ' RESP2:'
    // DELIMITED BY SIZE WS-DISPLAY2 DELIMITED BY SIZE '| MESSAGE:' DELIMITED BY SIZE WS-MESSAGE
    // DELIMITED BY '  ' INTO WTDQ-MESSAGE
    charArray = new ArrayList<char[]>();
    charArray.add(CONSTANTS.LITERAL_PROGRAM_B_);
    charArray.add(methodIn.getThisProgram());
    charArray.add(CONSTANTS.LITERAL_1874719246);
    charArray.add(CONSTANTS.LITERAL_B_RESP_CL_);
    charArray.add(methodOut.getDisplay1());
    charArray.add(CONSTANTS.LITERAL_B_RESP2_CL_);
    charArray.add(methodOut.getDisplay2());
    charArray.add(CONSTANTS.LITERAL_36706999);
    charArray.add(splitFirst(methodIn.getMessage(), CONSTANTS.SPACE_2));
    joinCharArray =
        Field.mergeArrays(
            charArray.get(0),
            charArray.get(1),
            charArray.get(2),
            charArray.get(3),
            charArray.get(4),
            charArray.get(5),
            charArray.get(6),
            charArray.get(7),
            charArray.get(8));
    updated = updateString(methodOut.getWtdqMessage(), joinCharArray);
    methodOut.setWtdqMessage((char[]) updated.get("string"));
    //  cobolCode::SET WTDQ-ERROR-MSG TO TRUE
    methodOut.setWtdqErrorMsgTrue();

    return methodOut;
  }
  /**
   * abendDb2 This method is derived from COBOL Paragraph - 9900-ABEND-DB2 COBOL Cyclomatic
   * complexity - 1 Input :
   *
   * <p>- writetdqCommarea COBOL Name: WRITETDQ-COMMAREA
   *
   * <p>Output : None
   *
   * @throws CFException
   */
  @Override
  public void abendDb2(AbendDb2InCtx methodIn) throws Exception {

    // *****************************************************************
    // * Abend db2
    // *****************************************************************
    // Added variable to get the program context in place.
    DphpctsqCtx programCtx = methodIn.getDphpctsqCtx();
    //  cobolCode::PERFORM 9910-FORMAT THRU 9910-EXIT
    format9910(programCtx.getFormat9910InCtx()); /*9910-FORMAT*/
    //  cobolCode::PERFORM ZZZA-GET-DIAG THRU ZZZA-EXIT
    zzzaGetDiag(programCtx.getZzzaGetDiagInCtx()); /*ZZZA-GET-DIAG*/
    //  cobolCode::DISPLAY WRITETDQ-COMMAREA
    logger.info(methodIn.getWritetdqCommarea().toString());
    //  cobolCode::PERFORM 9999-ABEND THRU 9999-EXIT
    abend(programCtx.getAbendInCtx()); /*9999-ABEND*/
  }
  /**
   * format9910 This method is derived from COBOL Paragraph - 9910-FORMAT COBOL Cyclomatic
   * complexity - 8 Input :
   *
   * <p>- sqlcode COBOL Name: SQLCODE - thisProgram COBOL Name: WS-THIS-PROGRAM - message COBOL
   * Name: WS-MESSAGE
   *
   * <p>Output :
   *
   * <p>- display1 COBOL Name: WS-DISPLAY1 - sqlcode COBOL Name: SQLCODE - wtdqMessage COBOL Name:
   * WTDQ-MESSAGE - wtdqMessageTyp COBOL Name: WTDQ-MESSAGE-TYP
   *
   * @throws CFException
   */
  @Override
  public Format9910OutCtx format9910(Format9910InCtx methodIn) throws Exception {
    // Declare local variables used in the method
    ArrayList<char[]> charArray = new ArrayList<char[]>();
    char[] joinCharArray = null;
    Map<String, Object> updated = null;
    // End of variable declaration

    // *****************************************************************
    // * Format db2 abend
    // *****************************************************************
    // Added variable to get the program context in place.
    DphpctsqCtx programCtx = methodIn.getDphpctsqCtx();
    // Added variable to get the output context in place.
    Format9910OutCtx methodOut = methodIn.getFormat9910OutCtx();
    //  FORMAT1725453934 = "+++++++++9"
    methodOut.setDisplay1(
        CFUtil.cobolNumberFormatter(
            CONSTANTS.FORMAT1725453934, String.valueOf(methodOut.getSqlcode()).toCharArray()));
    //  cobolCode::MOVE SPACES TO WTDQ-MESSAGE
    methodOut.setWtdqMessage(CONSTANTS.SPACE_5000);
    //  cobolCode::STRING 'PROGRAM ' DELIMITED BY SIZE WS-THIS-PROGRAM DELIMITED BY SIZE ' ABEND,'
    // DELIMITED BY SIZE ' SQLCODE:' DELIMITED BY SIZE WS-DISPLAY1 DELIMITED BY SIZE '| MESSAGE:'
    // DELIMITED BY SIZE WS-MESSAGE DELIMITED BY '  ' '| DB2 GET DIAGNOSTIC AREA:' DELIMITED BY SIZE
    // INTO WTDQ-MESSAGE
    charArray = new ArrayList<char[]>();
    charArray.add(CONSTANTS.LITERAL_PROGRAM_B_);
    charArray.add(methodIn.getThisProgram());
    charArray.add(CONSTANTS.LITERAL_1874719246);
    charArray.add(CONSTANTS.LITERAL_B_SQLCODE_CL_);
    charArray.add(methodOut.getDisplay1());
    charArray.add(CONSTANTS.LITERAL_36706999);
    charArray.add(splitFirst(methodIn.getMessage(), CONSTANTS.SPACE_2));
    charArray.add(CONSTANTS.LITERAL_1883691790);
    joinCharArray =
        Field.mergeArrays(
            charArray.get(0),
            charArray.get(1),
            charArray.get(2),
            charArray.get(3),
            charArray.get(4),
            charArray.get(5),
            charArray.get(6),
            charArray.get(7));
    updated = updateString(methodOut.getWtdqMessage(), joinCharArray);
    methodOut.setWtdqMessage((char[]) updated.get("string"));
    //  cobolCode::SET WTDQ-ERROR-MSG TO TRUE
    methodOut.setWtdqErrorMsgTrue();

    return methodOut;
  }
  /**
   * abend This method is derived from COBOL Paragraph - 9999-ABEND COBOL Cyclomatic complexity - 3
   * Input :
   *
   * <p>- getmainSw COBOL Name: GETMAIN-SW - tsqWriteSw COBOL Name: TSQ-WRITE-SW
   *
   * <p>Output :
   *
   * <p>- resp COBOL Name: WS-RESP - resp2 COBOL Name: WS-RESP2
   *
   * @throws CFException
   */
  @Override
  public AbendOutCtx abend(AbendInCtx methodIn) throws Exception {
    // Added variable to get the program context in place.
    DphpctsqCtx programCtx = methodIn.getDphpctsqCtx();
    // Added variable to get the output context in place.
    AbendOutCtx methodOut = methodIn.getAbendOutCtx();

    // ****************************************************************
    // * Release storage obtained for cache
    // ****************************************************************

    // *EXEC CICS FREEMAIN
    // *  DATAPOINTER(WS-CACHE-POINTER)
    // *  RESP    (WS-RESP)
    // *  RESP2   (WS-RESP2)
    // *END-EXEC
    //  cobolCode::IF GETMAIN-SUCCESSFUL
    if (methodIn.isGetmainSuccessful()) {
      //  cobolCode::FREEMAIN DATAPOINTER(WS-CACHE-POINTER) RESP (WS-RESP) RESP2 (WS-RESP2)
      // freemain
      TransactionManager.freeMain(programCtx.getCicsSession(), methodIn.getCachePointer());
      //  cobolCode::MOVE EIBRESP TO WS-RESP
      methodOut.setResp(programCtx.getCicsSession().getEibresp());
      //  cobolCode::MOVE EIBRESP2 TO WS-RESP2
      methodOut.setResp2(programCtx.getCicsSession().getEibresp2());
    }
    //  cobolCode::IF TSQ-WRITE-SUCCESSFUL
    if (methodIn.isTsqWriteSuccessful()) {
      //  cobolCode::DELETEQ TS QNAME (WS-TS-QUEUE-NAME) RESP (WS-RESP) RESP2 (WS-RESP2)
      // delete a queue
      TransactionManager.deleteQueue(programCtx.getCicsSession(), methodIn.getTsQueueName());
      //  cobolCode::MOVE EIBRESP TO WS-RESP
      methodOut.setResp(programCtx.getCicsSession().getEibresp());
      //  cobolCode::MOVE EIBRESP2 TO WS-RESP2
      methodOut.setResp2(programCtx.getCicsSession().getEibresp2());
    }

    return methodOut;
  }
  /**
   * zzzaGetDiag This method is derived from COBOL Paragraph - ZZZA-GET-DIAG COBOL Cyclomatic
   * complexity - 2 Input :
   *
   * <p>- gdNumber COBOL Name: GD-NUMBER
   *
   * <p>Output :
   *
   * <p>- gdCond COBOL Name: GD-COND - gdDisplayLit COBOL Name: GD-DISPLAY-LIT
   *
   * @throws CFException
   */
  @Override
  public ZzzaGetDiagOutCtx zzzaGetDiag(ZzzaGetDiagInCtx methodIn) throws Exception {

    // *****************************************************************
    // Added variable to get the program context in place.
    DphpctsqCtx programCtx = methodIn.getDphpctsqCtx();
    // Added variable to get the output context in place.
    ZzzaGetDiagOutCtx methodOut = methodIn.getZzzaGetDiagOutCtx();
    //  cobolCode::PERFORM ZZZG-FORMAT-SQLCA THRU ZZZG-EXIT
    zzzgFormatSqlca(programCtx.getZzzgFormatSqlcaInCtx()); /*ZZZG-FORMAT-SQLCA*/
    //  cobolCode::PERFORM ZZZB-GET-CONN THRU ZZZB-EXIT
    zzzbGetConn(programCtx.getZzzbGetConnInCtx()); /*ZZZB-GET-CONN*/
    //  cobolCode::PERFORM ZZZC-GET-STMT THRU ZZZC-EXIT
    zzzcGetStmt(programCtx.getZzzcGetStmtInCtx()); /*ZZZC-GET-STMT*/
    methodOut.setGdCond(0);
    //  cobolCode::PERFORM ZZZD-GET-COND THRU ZZZD-EXIT GD-NUMBER TIMES
    {
      for (int index = 0; index < methodIn.getGdNumber(); index++) {
        zzzdGetCond(programCtx.getZzzdGetCondInCtx()); /*ZZZD-GET-COND*/
      }
    }
    //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
    methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
    //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
    zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/

    return methodOut;
  }
  /**
   * zzzbGetConn This method is derived from COBOL Paragraph - ZZZB-GET-CONN COBOL Cyclomatic
   * complexity - 28 Input :
   *
   * <p>- sqlcode COBOL Name: SQLCODE - gdAuthType COBOL Name: GD-AUTH-TYPE - gdConnLit01 COBOL
   * Name: GD-CONN-LIT-01 - gdAuthIdL COBOL Name: GD-AUTH-ID-L - gdConnLit02 COBOL Name:
   * GD-CONN-LIT-02 - gdAuthIdT COBOL Name: GD-AUTH-ID-T - gdConnState COBOL Name: GD-CONN-STATE -
   * gdConnLit03 COBOL Name: GD-CONN-LIT-03 - gdConnStatus COBOL Name: GD-CONN-STATUS - gdConnLit04
   * COBOL Name: GD-CONN-LIT-04 - gdEncryptType COBOL Name: GD-ENCRYPT-TYPE - gdConnLit05 COBOL
   * Name: GD-CONN-LIT-05 - gdProdIdL COBOL Name: GD-PROD-ID-L - gdConnLit06 COBOL Name:
   * GD-CONN-LIT-06 - gdProdIdT COBOL Name: GD-PROD-ID-T - gdServerClass COBOL Name: GD-SERVER-CLASS
   * - gdConnLit07 COBOL Name: GD-CONN-LIT-07
   *
   * <p>Output :
   *
   * <p>- gdDisplayLit COBOL Name: GD-DISPLAY-LIT - gdIntegerDisp COBOL Name: GD-INTEGER-DISP -
   * sqlcode COBOL Name: SQLCODE - gdAuthIdT COBOL Name: GD-AUTH-ID-T - gdConnState COBOL Name:
   * GD-CONN-STATE - gdConnStatus COBOL Name: GD-CONN-STATUS - gdServerClass COBOL Name:
   * GD-SERVER-CLASS
   *
   * @throws CFException
   */
  @Override
  public ZzzbGetConnOutCtx zzzbGetConn(ZzzbGetConnInCtx methodIn) throws Exception {
    // Declare local variables used in the method
    ArrayList<char[]> charArray = new ArrayList<char[]>();
    char[] joinCharArray = null;
    Map<String, Object> updated = null;
    // End of variable declaration

    // *****************************************************************
    // * Get conn
    // *****************************************************************
    // Added variable to get the program context in place.
    DphpctsqCtx programCtx = methodIn.getDphpctsqCtx();
    // Added variable to get the output context in place.
    ZzzbGetConnOutCtx methodOut = methodIn.getZzzbGetConnOutCtx();
    //  cobolCode::GET DIAGNOSTICS CONDITION 1 ? = DB2_AUTHENTICATION_TYPE , ? =
    // DB2_AUTHORIZATION_ID , ? = DB2_CONNECTION_STATE , ? = DB2_CONNECTION_STATUS , ? =
    // DB2_ENCRYPTION_TYPE , ? = DB2_PRODUCT_ID , ? = DB2_SERVER_CLASS_NAME

    /**
     * ***** GET DIAGNOSTICS CONDITION 1 ***** :GD-AUTH-TYPE = DB2_AUTHENTICATION_TYPE *****
     * ,:GD-AUTH-ID = DB2_AUTHORIZATION_ID ***** ,:GD-CONN-STATE = DB2_CONNECTION_STATE *****
     * ,:GD-CONN-STATUS = DB2_CONNECTION_STATUS ***** ,:GD-ENCRYPT-TYPE = DB2_ENCRYPTION_TYPE *****
     * ,:GD-PROD-ID = DB2_PRODUCT_ID ***** ,:GD-SERVER-CLASS = DB2_SERVER_CLASS_NAME
     */
    // Get diagnotics

    // *****
    //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
    methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
    //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
    zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/

    // *****
    //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
    methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
    //  cobolCode::MOVE '*********************************************' TO GD-DISPLAY-LIT
    methodOut.setGdDisplayLit(CONSTANTS.LITERAL_1359560854);
    //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
    zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/

    // *****
    //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
    methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
    //  cobolCode::MOVE '* GET DIAGNOSTICS CONNECTION INFORMATION' TO GD-DISPLAY-LIT
    methodOut.setGdDisplayLit(CONSTANTS.LITERAL_1498136602);
    //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
    zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/

    // *****
    //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
    methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
    //  cobolCode::MOVE '*********************************************' TO GD-DISPLAY-LIT
    methodOut.setGdDisplayLit(CONSTANTS.LITERAL_1359560854);
    //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
    zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/

    // *****
    //  cobolCode::IF SQLCODE NOT = ZERO
    if ((methodOut.getSqlcode() != 0)) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  FORMAT1132375918 = "+999999999"
      methodOut.setGdIntegerDisp(
          CFUtil.cobolNumberFormatter(
              CONSTANTS.FORMAT1132375918, String.valueOf(methodOut.getSqlcode()).toCharArray()));
      //  cobolCode::STRING 'CALL FAILED: SQLCODE = ' DELIMITED BY SIZE GD-INTEGER-DISP DELIMITED BY
      // SIZE INTO GD-DISPLAY-LIT
      charArray = new ArrayList<char[]>();
      charArray.add(CONSTANTS.LITERAL_542747305);
      charArray.add(methodOut.getGdIntegerDisp());
      joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1));
      updated = updateString(methodOut.getGdDisplayLit(), joinCharArray);
      methodOut.setGdDisplayLit((char[]) updated.get("string"));
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
      // cobolCode::GO TO ZZZB-EXIT
      return methodOut;
      // cobolCodeEnds::GO TO ZZZB-EXIT
    }

    // *****
    //  cobolCode::IF GD-AUTH-TYPE NOT = SPACE
    if ((!allSpaces(methodIn.getGdAuthType()))) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  cobolCode::STRING GD-CONN-LIT-01 DELIMITED BY SIZE GD-AUTH-TYPE DELIMITED BY SIZE INTO
      // GD-DISPLAY-LIT
      charArray = new ArrayList<char[]>();
      charArray.add(methodIn.getGdConnLit01());
      charArray.add(methodIn.getGdAuthType());
      joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1));
      updated = updateString(methodOut.getGdDisplayLit(), joinCharArray);
      methodOut.setGdDisplayLit((char[]) updated.get("string"));
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
    }

    // *****
    //  cobolCode::IF GD-AUTH-ID-L > ZERO
    if ((methodIn.getGdAuthIdL() > 0)) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  cobolCode::STRING GD-CONN-LIT-02 DELIMITED BY SIZE GD-AUTH-ID-T (1 : GD-AUTH-ID-L )
      // DELIMITED BY SIZE INTO GD-DISPLAY-LIT
      charArray = new ArrayList<char[]>();
      charArray.add(methodIn.getGdConnLit02());
      charArray.add(substring(methodOut.getGdAuthIdT(), 0, methodIn.getGdAuthIdL()));
      joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1));
      updated = updateString(methodOut.getGdDisplayLit(), joinCharArray);
      methodOut.setGdDisplayLit((char[]) updated.get("string"));
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
    }
    //  cobolCode::IF GD-AUTH-ID-L > 57
    if ((methodIn.getGdAuthIdL() > 57)) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  cobolCode::MOVE GD-AUTH-ID-T (58 : ( GD-AUTH-ID-L - 57)) TO GD-DISPLAY-LIT
      methodOut
          .getGdGetDiagArea()
          .replace(
              methodOut.getGdGetDiagArea() /*parent*/,
              88605 + 58 - 1 /*fromOffset - (gdDisplayLit) */,
              (int) (methodIn.getGdAuthIdL() - 57) /*fromLen*/,
              85 /*toOffset - (gdAuthIdT) */,
              80 /*toLen*/);
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
    }

    // *****
    //  cobolCode::IF GD-CONN-STATE NOT = ZERO
    if ((methodOut.getGdConnState() != 0)) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  FORMAT1132375918 = "+999999999"
      methodOut.setGdIntegerDisp(
          CFUtil.cobolNumberFormatter(
              CONSTANTS.FORMAT1132375918,
              String.valueOf(methodOut.getGdConnState()).toCharArray()));
      //  cobolCode::STRING GD-CONN-LIT-03 DELIMITED BY SIZE GD-INTEGER-DISP DELIMITED BY SIZE INTO
      // GD-DISPLAY-LIT
      charArray = new ArrayList<char[]>();
      charArray.add(methodIn.getGdConnLit03());
      charArray.add(methodOut.getGdIntegerDisp());
      joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1));
      updated = updateString(methodOut.getGdDisplayLit(), joinCharArray);
      methodOut.setGdDisplayLit((char[]) updated.get("string"));
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
    }

    // *****
    //  cobolCode::IF GD-CONN-STATUS NOT = ZERO
    if ((methodOut.getGdConnStatus() != 0)) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  FORMAT1132375918 = "+999999999"
      methodOut.setGdIntegerDisp(
          CFUtil.cobolNumberFormatter(
              CONSTANTS.FORMAT1132375918,
              String.valueOf(methodOut.getGdConnStatus()).toCharArray()));
      //  cobolCode::STRING GD-CONN-LIT-04 DELIMITED BY SIZE GD-INTEGER-DISP DELIMITED BY SIZE INTO
      // GD-DISPLAY-LIT
      charArray = new ArrayList<char[]>();
      charArray.add(methodIn.getGdConnLit04());
      charArray.add(methodOut.getGdIntegerDisp());
      joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1));
      updated = updateString(methodOut.getGdDisplayLit(), joinCharArray);
      methodOut.setGdDisplayLit((char[]) updated.get("string"));
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
    }

    // *****
    //  cobolCode::IF GD-ENCRYPT-TYPE NOT = SPACE
    if ((!allSpaces(methodIn.getGdEncryptType()))) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  cobolCode::STRING GD-CONN-LIT-05 DELIMITED BY SIZE GD-ENCRYPT-TYPE DELIMITED BY SIZE INTO
      // GD-DISPLAY-LIT
      charArray = new ArrayList<char[]>();
      charArray.add(methodIn.getGdConnLit05());
      charArray.add(methodIn.getGdEncryptType());
      joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1));
      updated = updateString(methodOut.getGdDisplayLit(), joinCharArray);
      methodOut.setGdDisplayLit((char[]) updated.get("string"));
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
    }

    // *****
    //  cobolCode::IF GD-PROD-ID-L > ZERO
    if ((methodIn.getGdProdIdL() > 0)) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  cobolCode::STRING GD-CONN-LIT-06 DELIMITED BY SIZE GD-PROD-ID-T (1 : GD-PROD-ID-L )
      // DELIMITED BY SIZE INTO GD-DISPLAY-LIT
      charArray = new ArrayList<char[]>();
      charArray.add(methodIn.getGdConnLit06());
      charArray.add(substring(methodIn.getGdProdIdT(), 0, methodIn.getGdProdIdL()));
      joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1));
      updated = updateString(methodOut.getGdDisplayLit(), joinCharArray);
      methodOut.setGdDisplayLit((char[]) updated.get("string"));
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
    }

    // *****
    //  cobolCode::IF GD-SERVER-CLASS NOT = SPACE
    if ((!allSpaces(methodOut.getGdServerClass()))) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  cobolCode::STRING GD-CONN-LIT-07 DELIMITED BY SIZE GD-SERVER-CLASS (1 : 56) DELIMITED BY
      // SIZE INTO GD-DISPLAY-LIT
      charArray = new ArrayList<char[]>();
      charArray.add(methodIn.getGdConnLit07());
      charArray.add(substring(methodOut.getGdServerClass(), 0, 56));
      joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1));
      updated = updateString(methodOut.getGdDisplayLit(), joinCharArray);
      methodOut.setGdDisplayLit((char[]) updated.get("string"));
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
      //  cobolCode::IF GD-SERVER-CLASS (57 : 72) NOT = SPACE
      if (!(Field.allSpaces(methodOut.getGdServerClass(), (56 /*start*/), 72 /*len*/))) {
        //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
        methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
        //  cobolCode::MOVE GD-SERVER-CLASS (57 : 72) TO GD-DISPLAY-LIT
        methodOut
            .getGdGetDiagArea()
            .replace(
                methodOut.getGdGetDiagArea() /*parent*/,
                88752 + 57 - 1 /*fromOffset - (gdDisplayLit) */,
                72 /*fromLen*/,
                85 /*toOffset - (gdServerClass) */,
                80 /*toLen*/);
        //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
        zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
      }
    }

    return methodOut;
  }
  /**
   * zzzcGetStmt This method is derived from COBOL Paragraph - ZZZC-GET-STMT COBOL Cyclomatic
   * complexity - 44 Input :
   *
   * <p>- sqlcode COBOL Name: SQLCODE - gdLastRow COBOL Name: GD-LAST-ROW - gdStmtLit01 COBOL Name:
   * GD-STMT-LIT-01 - gdNumberMarkers COBOL Name: GD-NUMBER-MARKERS - gdStmtLit02 COBOL Name:
   * GD-STMT-LIT-02 - gdNumberSets COBOL Name: GD-NUMBER-SETS - gdStmtLit03 COBOL Name:
   * GD-STMT-LIT-03 - gdNumberRows COBOL Name: GD-NUMBER-ROWS - gdStmtLit04 COBOL Name:
   * GD-STMT-LIT-04 - gdReturnStatus COBOL Name: GD-RETURN-STATUS - gdStmtLit05 COBOL Name:
   * GD-STMT-LIT-05 - gdCursorHold COBOL Name: GD-CURSOR-HOLD - gdStmtLit06 COBOL Name:
   * GD-STMT-LIT-06 - gdCursorRowset COBOL Name: GD-CURSOR-ROWSET - gdStmtLit07 COBOL Name:
   * GD-STMT-LIT-07 - gdCursorScrollable COBOL Name: GD-CURSOR-SCROLLABLE - gdStmtLit08 COBOL Name:
   * GD-STMT-LIT-08 - gdCursorSensitivity COBOL Name: GD-CURSOR-SENSITIVITY - gdStmtLit09 COBOL
   * Name: GD-STMT-LIT-09 - gdCursorType COBOL Name: GD-CURSOR-TYPE - gdStmtLit10 COBOL Name:
   * GD-STMT-LIT-10 - gdMore COBOL Name: GD-MORE - gdStmtLit11 COBOL Name: GD-STMT-LIT-11 - gdNumber
   * COBOL Name: GD-NUMBER - gdStmtLit12 COBOL Name: GD-STMT-LIT-12 - gdRowCount COBOL Name:
   * GD-ROW-COUNT - gdStmtLit13 COBOL Name: GD-STMT-LIT-13
   *
   * <p>Output :
   *
   * <p>- gdDisplayLit COBOL Name: GD-DISPLAY-LIT - gdIntegerDisp COBOL Name: GD-INTEGER-DISP -
   * sqlcode COBOL Name: SQLCODE - gdLastRow COBOL Name: GD-LAST-ROW - gdNumberMarkers COBOL Name:
   * GD-NUMBER-MARKERS - gdNumberSets COBOL Name: GD-NUMBER-SETS - gdBigDecimalDisp COBOL Name:
   * GD-BIG-DECIMAL-DISP - gdNumberRows COBOL Name: GD-NUMBER-ROWS - gdReturnStatus COBOL Name:
   * GD-RETURN-STATUS - gdNumber COBOL Name: GD-NUMBER - gdRowCount COBOL Name: GD-ROW-COUNT
   *
   * @throws CFException
   */
  @Override
  public ZzzcGetStmtOutCtx zzzcGetStmt(ZzzcGetStmtInCtx methodIn) throws Exception {
    // Declare local variables used in the method
    ArrayList<char[]> charArray = new ArrayList<char[]>();
    char[] joinCharArray = null;
    Map<String, Object> updated = null;
    // End of variable declaration

    // *****************************************************************
    // * Get stmt
    // *****************************************************************
    // Added variable to get the program context in place.
    DphpctsqCtx programCtx = methodIn.getDphpctsqCtx();
    // Added variable to get the output context in place.
    ZzzcGetStmtOutCtx methodOut = methodIn.getZzzcGetStmtOutCtx();
    //  cobolCode::GET DIAGNOSTICS ? = DB2_LAST_ROW , ? = DB2_NUMBER_PARAMETER_MARKERS , ? =
    // DB2_NUMBER_RESULT_SETS , ? = DB2_NUMBER_ROWS , ? = DB2_RETURN_STATUS , ? =
    // DB2_SQL_ATTR_CURSOR_HOLD , ? = DB2_SQL_ATTR_CURSOR_ROWSET , ? =
    // DB2_SQL_ATTR_CURSOR_SCROLLABLE , ? = DB2_SQL_ATTR_CURSOR_SENSITIVITY , ? =
    // DB2_SQL_ATTR_CURSOR_TYPE , ? = MORE , ? = NUMBER , ? = ROW_COUNT

    /**
     * ***** GET DIAGNOSTICS ***** :GD-LAST-ROW = DB2_LAST_ROW ***** ,:GD-NUMBER-MARKERS =
     * DB2_NUMBER_PARAMETER_MARKERS ***** ,:GD-NUMBER-SETS = DB2_NUMBER_RESULT_SETS *****
     * ,:GD-NUMBER-ROWS = DB2_NUMBER_ROWS ***** ,:GD-RETURN-STATUS = DB2_RETURN_STATUS *****
     * ,:GD-CURSOR-HOLD = DB2_SQL_ATTR_CURSOR_HOLD ***** ,:GD-CURSOR-ROWSET =
     * DB2_SQL_ATTR_CURSOR_ROWSET ***** ,:GD-CURSOR-SCROLLABLE = DB2_SQL_ATTR_CURSOR_SCROLLABLE
     * ***** ,:GD-CURSOR-SENSITIVITY = DB2_SQL_ATTR_CURSOR_SENSITIVITY ***** ,:GD-CURSOR-TYPE =
     * DB2_SQL_ATTR_CURSOR_TYPE ***** ,:GD-MORE = MORE ***** ,:GD-NUMBER = NUMBER *****
     * ,:GD-ROW-COUNT = ROW_COUNT
     */
    // Get diagnotics
    gdGetDiagArea.setGdNumber(db2Base.getDiagnostics().getTotalConditions());

    // *****
    //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
    methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
    //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
    zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/

    // *****
    //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
    methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
    //  cobolCode::MOVE '*********************************************' TO GD-DISPLAY-LIT
    methodOut.setGdDisplayLit(CONSTANTS.LITERAL_1359560854);
    //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
    zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/

    // *****
    //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
    methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
    //  cobolCode::MOVE '* GET DIAGNOSTICS STATEMENT INFORMATION' TO GD-DISPLAY-LIT
    methodOut.setGdDisplayLit(CONSTANTS.LITERAL_694185677);
    //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
    zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/

    // *****
    //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
    methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
    //  cobolCode::MOVE '*********************************************' TO GD-DISPLAY-LIT
    methodOut.setGdDisplayLit(CONSTANTS.LITERAL_1359560854);
    //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
    zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/

    // *****
    //  cobolCode::IF SQLCODE NOT = ZERO
    if ((methodOut.getSqlcode() != 0)) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  FORMAT1132375918 = "+999999999"
      methodOut.setGdIntegerDisp(
          CFUtil.cobolNumberFormatter(
              CONSTANTS.FORMAT1132375918, String.valueOf(methodOut.getSqlcode()).toCharArray()));
      //  cobolCode::STRING 'CALL FAILED: SQLCODE = ' DELIMITED BY SIZE GD-INTEGER-DISP DELIMITED BY
      // SIZE INTO GD-DISPLAY-LIT
      charArray = new ArrayList<char[]>();
      charArray.add(CONSTANTS.LITERAL_542747305);
      charArray.add(methodOut.getGdIntegerDisp());
      joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1));
      updated = updateString(methodOut.getGdDisplayLit(), joinCharArray);
      methodOut.setGdDisplayLit((char[]) updated.get("string"));
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
      // cobolCode::GO TO ZZZC-EXIT
      return methodOut;
      // cobolCodeEnds::GO TO ZZZC-EXIT
    }

    // *****
    //  cobolCode::IF GD-LAST-ROW NOT = ZERO
    if ((methodOut.getGdLastRow() != 0)) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  FORMAT1132375918 = "+999999999"
      methodOut.setGdIntegerDisp(
          CFUtil.cobolNumberFormatter(
              CONSTANTS.FORMAT1132375918, String.valueOf(methodOut.getGdLastRow()).toCharArray()));
      //  cobolCode::STRING GD-STMT-LIT-01 DELIMITED BY SIZE GD-INTEGER-DISP DELIMITED BY SIZE INTO
      // GD-DISPLAY-LIT
      charArray = new ArrayList<char[]>();
      charArray.add(methodIn.getGdStmtLit01());
      charArray.add(methodOut.getGdIntegerDisp());
      joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1));
      updated = updateString(methodOut.getGdDisplayLit(), joinCharArray);
      methodOut.setGdDisplayLit((char[]) updated.get("string"));
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
    }

    // *****
    //  cobolCode::IF GD-NUMBER-MARKERS NOT = ZERO
    if ((methodOut.getGdNumberMarkers() != 0)) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  FORMAT1132375918 = "+999999999"
      methodOut.setGdIntegerDisp(
          CFUtil.cobolNumberFormatter(
              CONSTANTS.FORMAT1132375918,
              String.valueOf(methodOut.getGdNumberMarkers()).toCharArray()));
      //  cobolCode::STRING GD-STMT-LIT-02 DELIMITED BY SIZE GD-INTEGER-DISP DELIMITED BY SIZE INTO
      // GD-DISPLAY-LIT
      charArray = new ArrayList<char[]>();
      charArray.add(methodIn.getGdStmtLit02());
      charArray.add(methodOut.getGdIntegerDisp());
      joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1));
      updated = updateString(methodOut.getGdDisplayLit(), joinCharArray);
      methodOut.setGdDisplayLit((char[]) updated.get("string"));
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
    }

    // *****
    //  cobolCode::IF GD-NUMBER-SETS NOT = ZERO
    if ((methodOut.getGdNumberSets() != 0)) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  FORMAT1132375918 = "+999999999"
      methodOut.setGdIntegerDisp(
          CFUtil.cobolNumberFormatter(
              CONSTANTS.FORMAT1132375918,
              String.valueOf(methodOut.getGdNumberSets()).toCharArray()));
      //  cobolCode::STRING GD-STMT-LIT-03 DELIMITED BY SIZE GD-INTEGER-DISP DELIMITED BY SIZE INTO
      // GD-DISPLAY-LIT
      charArray = new ArrayList<char[]>();
      charArray.add(methodIn.getGdStmtLit03());
      charArray.add(methodOut.getGdIntegerDisp());
      joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1));
      updated = updateString(methodOut.getGdDisplayLit(), joinCharArray);
      methodOut.setGdDisplayLit((char[]) updated.get("string"));
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
    }

    // *****
    //  cobolCode::IF GD-NUMBER-ROWS NOT = ZERO
    if ((methodOut.getGdNumberRows() != 0)) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  cobolCode::MOVE GD-NUMBER-ROWS TO GD-BIG-DECIMAL-DISP
      //  FORMAT_2103136818 = "+9999999999999999999999999999999"
      methodOut.setGdBigDecimalDisp(
          CFUtil.cobolNumberFormatter(
              CONSTANTS.FORMAT_2103136818,
              String.valueOf(methodOut.getGdNumberRows()).toCharArray()));
      //  cobolCode::STRING GD-STMT-LIT-04 DELIMITED BY SIZE GD-BIG-DECIMAL-DISP DELIMITED BY SIZE
      // INTO GD-DISPLAY-LIT
      charArray = new ArrayList<char[]>();
      charArray.add(methodIn.getGdStmtLit04());
      charArray.add(methodOut.getGdBigDecimalDisp());
      joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1));
      updated = updateString(methodOut.getGdDisplayLit(), joinCharArray);
      methodOut.setGdDisplayLit((char[]) updated.get("string"));
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
    }

    // *****
    //  cobolCode::IF GD-RETURN-STATUS NOT = ZERO
    if ((methodOut.getGdReturnStatus() != 0)) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  FORMAT1132375918 = "+999999999"
      methodOut.setGdIntegerDisp(
          CFUtil.cobolNumberFormatter(
              CONSTANTS.FORMAT1132375918,
              String.valueOf(methodOut.getGdReturnStatus()).toCharArray()));
      //  cobolCode::STRING GD-STMT-LIT-05 DELIMITED BY SIZE GD-INTEGER-DISP DELIMITED BY SIZE INTO
      // GD-DISPLAY-LIT
      charArray = new ArrayList<char[]>();
      charArray.add(methodIn.getGdStmtLit05());
      charArray.add(methodOut.getGdIntegerDisp());
      joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1));
      updated = updateString(methodOut.getGdDisplayLit(), joinCharArray);
      methodOut.setGdDisplayLit((char[]) updated.get("string"));
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
    }

    // *****
    //  cobolCode::IF GD-CURSOR-HOLD NOT = SPACE
    if ((!allSpaces(methodIn.getGdCursorHold()))) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  cobolCode::STRING GD-STMT-LIT-06 DELIMITED BY SIZE GD-CURSOR-HOLD DELIMITED BY SIZE INTO
      // GD-DISPLAY-LIT
      charArray = new ArrayList<char[]>();
      charArray.add(methodIn.getGdStmtLit06());
      charArray.add(methodIn.getGdCursorHold());
      joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1));
      updated = updateString(methodOut.getGdDisplayLit(), joinCharArray);
      methodOut.setGdDisplayLit((char[]) updated.get("string"));
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
    }

    // *****
    //  cobolCode::IF GD-CURSOR-ROWSET NOT = SPACE
    if ((!allSpaces(methodIn.getGdCursorRowset()))) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  cobolCode::STRING GD-STMT-LIT-07 DELIMITED BY SIZE GD-CURSOR-ROWSET DELIMITED BY SIZE INTO
      // GD-DISPLAY-LIT
      charArray = new ArrayList<char[]>();
      charArray.add(methodIn.getGdStmtLit07());
      charArray.add(methodIn.getGdCursorRowset());
      joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1));
      updated = updateString(methodOut.getGdDisplayLit(), joinCharArray);
      methodOut.setGdDisplayLit((char[]) updated.get("string"));
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
    }

    // *****
    //  cobolCode::IF GD-CURSOR-SCROLLABLE NOT = SPACE
    if ((!allSpaces(methodIn.getGdCursorScrollable()))) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  cobolCode::STRING GD-STMT-LIT-08 DELIMITED BY SIZE GD-CURSOR-SCROLLABLE DELIMITED BY SIZE
      // INTO GD-DISPLAY-LIT
      charArray = new ArrayList<char[]>();
      charArray.add(methodIn.getGdStmtLit08());
      charArray.add(methodIn.getGdCursorScrollable());
      joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1));
      updated = updateString(methodOut.getGdDisplayLit(), joinCharArray);
      methodOut.setGdDisplayLit((char[]) updated.get("string"));
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
    }

    // *****
    //  cobolCode::IF GD-CURSOR-SENSITIVITY NOT = SPACE
    if ((!allSpaces(methodIn.getGdCursorSensitivity()))) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  cobolCode::STRING GD-STMT-LIT-09 DELIMITED BY SIZE GD-CURSOR-SENSITIVITY DELIMITED BY SIZE
      // INTO GD-DISPLAY-LIT
      charArray = new ArrayList<char[]>();
      charArray.add(methodIn.getGdStmtLit09());
      charArray.add(methodIn.getGdCursorSensitivity());
      joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1));
      updated = updateString(methodOut.getGdDisplayLit(), joinCharArray);
      methodOut.setGdDisplayLit((char[]) updated.get("string"));
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
    }

    // *****
    //  cobolCode::IF GD-CURSOR-TYPE NOT = SPACE
    if ((!allSpaces(methodIn.getGdCursorType()))) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  cobolCode::STRING GD-STMT-LIT-10 DELIMITED BY SIZE GD-CURSOR-TYPE DELIMITED BY SIZE INTO
      // GD-DISPLAY-LIT
      charArray = new ArrayList<char[]>();
      charArray.add(methodIn.getGdStmtLit10());
      charArray.add(methodIn.getGdCursorType());
      joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1));
      updated = updateString(methodOut.getGdDisplayLit(), joinCharArray);
      methodOut.setGdDisplayLit((char[]) updated.get("string"));
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
    }

    // *****
    //  cobolCode::IF GD-MORE NOT = SPACE
    if ((!allSpaces(methodIn.getGdMore()))) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  cobolCode::STRING GD-STMT-LIT-11 DELIMITED BY SIZE GD-MORE DELIMITED BY SIZE INTO
      // GD-DISPLAY-LIT
      charArray = new ArrayList<char[]>();
      charArray.add(methodIn.getGdStmtLit11());
      charArray.add(methodIn.getGdMore());
      joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1));
      updated = updateString(methodOut.getGdDisplayLit(), joinCharArray);
      methodOut.setGdDisplayLit((char[]) updated.get("string"));
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
    }

    // *****
    //  cobolCode::IF GD-NUMBER NOT = ZERO
    if ((methodOut.getGdNumber() != 0)) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  FORMAT1132375918 = "+999999999"
      methodOut.setGdIntegerDisp(
          CFUtil.cobolNumberFormatter(
              CONSTANTS.FORMAT1132375918, String.valueOf(methodOut.getGdNumber()).toCharArray()));
      //  cobolCode::STRING GD-STMT-LIT-12 DELIMITED BY SIZE GD-INTEGER-DISP DELIMITED BY SIZE INTO
      // GD-DISPLAY-LIT
      charArray = new ArrayList<char[]>();
      charArray.add(methodIn.getGdStmtLit12());
      charArray.add(methodOut.getGdIntegerDisp());
      joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1));
      updated = updateString(methodOut.getGdDisplayLit(), joinCharArray);
      methodOut.setGdDisplayLit((char[]) updated.get("string"));
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
    }

    // *****
    //  cobolCode::IF GD-ROW-COUNT NOT = ZERO
    if ((methodOut.getGdRowCount() != 0)) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  cobolCode::MOVE GD-ROW-COUNT TO GD-BIG-DECIMAL-DISP
      //  FORMAT_2103136818 = "+9999999999999999999999999999999"
      methodOut.setGdBigDecimalDisp(
          CFUtil.cobolNumberFormatter(
              CONSTANTS.FORMAT_2103136818,
              String.valueOf(methodOut.getGdRowCount()).toCharArray()));
      //  cobolCode::STRING GD-STMT-LIT-13 DELIMITED BY SIZE GD-BIG-DECIMAL-DISP DELIMITED BY SIZE
      // INTO GD-DISPLAY-LIT
      charArray = new ArrayList<char[]>();
      charArray.add(methodIn.getGdStmtLit13());
      charArray.add(methodOut.getGdBigDecimalDisp());
      joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1));
      updated = updateString(methodOut.getGdDisplayLit(), joinCharArray);
      methodOut.setGdDisplayLit((char[]) updated.get("string"));
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
    }

    return methodOut;
  }
  /**
   * zzzdGetCond This method is derived from COBOL Paragraph - ZZZD-GET-COND COBOL Cyclomatic
   * complexity - 85 Input :
   *
   * <p>- gdCond COBOL Name: GD-COND - sqlcode COBOL Name: SQLCODE - gdCatalogNameL COBOL Name:
   * GD-CATALOG-NAME-L - gdCondLit01 COBOL Name: GD-COND-LIT-01 - gdCatalogNameT COBOL Name:
   * GD-CATALOG-NAME-T - gdConditionNumber COBOL Name: GD-CONDITION-NUMBER - gdCondLit02 COBOL Name:
   * GD-COND-LIT-02 - gdCursorNameL COBOL Name: GD-CURSOR-NAME-L - gdCondLit03 COBOL Name:
   * GD-COND-LIT-03 - gdCursorNameT COBOL Name: GD-CURSOR-NAME-T - gdErrorCode1 COBOL Name:
   * GD-ERROR-CODE1 - gdCondLit04 COBOL Name: GD-COND-LIT-04 - gdErrorCode2 COBOL Name:
   * GD-ERROR-CODE2 - gdCondLit05 COBOL Name: GD-COND-LIT-05 - gdErrorCode3 COBOL Name:
   * GD-ERROR-CODE3 - gdCondLit06 COBOL Name: GD-COND-LIT-06 - gdErrorCode4 COBOL Name:
   * GD-ERROR-CODE4 - gdCondLit07 COBOL Name: GD-COND-LIT-07 - gdInternalErrPtr COBOL Name:
   * GD-INTERNAL-ERR-PTR - gdCondLit08 COBOL Name: GD-COND-LIT-08 - gdLineNumber COBOL Name:
   * GD-LINE-NUMBER - gdCondLit09 COBOL Name: GD-COND-LIT-09 - gdMessageId COBOL Name: GD-MESSAGE-ID
   * - gdCondLit10 COBOL Name: GD-COND-LIT-10 - gdModDetectingErr COBOL Name: GD-MOD-DETECTING-ERR -
   * gdCondLit11 COBOL Name: GD-COND-LIT-11 - gdTokenCount COBOL Name: GD-TOKEN-COUNT - gdReasonCode
   * COBOL Name: GD-REASON-CODE - gdCondLit13 COBOL Name: GD-COND-LIT-13 - gdReturnedSqlcode COBOL
   * Name: GD-RETURNED-SQLCODE - gdCondLit14 COBOL Name: GD-COND-LIT-14 - gdRowNumber COBOL Name:
   * GD-ROW-NUMBER - gdCondLit15 COBOL Name: GD-COND-LIT-15 - gdSqlerrdSet COBOL Name:
   * GD-SQLERRD-SET - gdCondLit16 COBOL Name: GD-COND-LIT-16 - gdSqlerrd1 COBOL Name: GD-SQLERRD1 -
   * gdCondLit17 COBOL Name: GD-COND-LIT-17 - gdSqlerrd2 COBOL Name: GD-SQLERRD2 - gdCondLit18 COBOL
   * Name: GD-COND-LIT-18 - gdSqlerrd3 COBOL Name: GD-SQLERRD3 - gdCondLit19 COBOL Name:
   * GD-COND-LIT-19 - gdSqlerrd4 COBOL Name: GD-SQLERRD4 - gdCondLit20 COBOL Name: GD-COND-LIT-20 -
   * gdSqlerrd5 COBOL Name: GD-SQLERRD5 - gdCondLit21 COBOL Name: GD-COND-LIT-21 - gdSqlerrd6 COBOL
   * Name: GD-SQLERRD6 - gdCondLit22 COBOL Name: GD-COND-LIT-22 - gdCondLit23 COBOL Name:
   * GD-COND-LIT-23 - gdMessageTextL COBOL Name: GD-MESSAGE-TEXT-L - gdCondLit24 COBOL Name:
   * GD-COND-LIT-24 - gdMessageTextT COBOL Name: GD-MESSAGE-TEXT-T - gdReturnedSqlstate COBOL Name:
   * GD-RETURNED-SQLSTATE - gdCondLit25 COBOL Name: GD-COND-LIT-25 - gdServerNameL COBOL Name:
   * GD-SERVER-NAME-L - gdCondLit26 COBOL Name: GD-COND-LIT-26 - gdServerNameT COBOL Name:
   * GD-SERVER-NAME-T
   *
   * <p>Output :
   *
   * <p>- gdCond COBOL Name: GD-COND - gdDisplayLit COBOL Name: GD-DISPLAY-LIT - gdIntegerDisp COBOL
   * Name: GD-INTEGER-DISP - sqlcode COBOL Name: SQLCODE - gdCatalogNameT COBOL Name:
   * GD-CATALOG-NAME-T - gdConditionNumber COBOL Name: GD-CONDITION-NUMBER - gdCursorNameT COBOL
   * Name: GD-CURSOR-NAME-T - gdErrorCode1 COBOL Name: GD-ERROR-CODE1 - gdErrorCode2 COBOL Name:
   * GD-ERROR-CODE2 - gdErrorCode3 COBOL Name: GD-ERROR-CODE3 - gdErrorCode4 COBOL Name:
   * GD-ERROR-CODE4 - gdInternalErrPtr COBOL Name: GD-INTERNAL-ERR-PTR - gdLineNumber COBOL Name:
   * GD-LINE-NUMBER - gdSub COBOL Name: GD-SUB - gdReasonCode COBOL Name: GD-REASON-CODE -
   * gdReturnedSqlcode COBOL Name: GD-RETURNED-SQLCODE - gdBigDecimalDisp COBOL Name:
   * GD-BIG-DECIMAL-DISP - gdRowNumber COBOL Name: GD-ROW-NUMBER - gdSqlerrd1 COBOL Name:
   * GD-SQLERRD1 - gdSqlerrd2 COBOL Name: GD-SQLERRD2 - gdSqlerrd3 COBOL Name: GD-SQLERRD3 -
   * gdSqlerrd4 COBOL Name: GD-SQLERRD4 - gdSqlerrd5 COBOL Name: GD-SQLERRD5 - gdSqlerrd6 COBOL
   * Name: GD-SQLERRD6 - gdTokenCount COBOL Name: GD-TOKEN-COUNT - gdPos COBOL Name: GD-POS -
   * gdMessageTextT COBOL Name: GD-MESSAGE-TEXT-T - gdServerNameT COBOL Name: GD-SERVER-NAME-T
   *
   * @throws CFException
   */
  @Override
  public ZzzdGetCondOutCtx zzzdGetCond(ZzzdGetCondInCtx methodIn) throws Exception {
    // Declare local variables used in the method
    ArrayList<char[]> charArray = new ArrayList<char[]>();
    char[] joinCharArray = null;
    Map<String, Object> updated = null;
    // End of variable declaration

    // *****************************************************************
    // * Get cond
    // *****************************************************************
    // Added variable to get the program context in place.
    DphpctsqCtx programCtx = methodIn.getDphpctsqCtx();
    // Added variable to get the output context in place.
    ZzzdGetCondOutCtx methodOut = methodIn.getZzzdGetCondOutCtx();
    //  cobolCode::ADD 1 TO GD-COND
    methodOut.setGdCond(methodOut.getGdCond() + 1);
    //  cobolCode::GET DIAGNOSTICS CONDITION ? = CATALOG_NAME , ? = CONDITION_NUMBER , ? =
    // CURSOR_NAME , ? = DB2_ERROR_CODE1 , ? = DB2_ERROR_CODE2 , ? = DB2_ERROR_CODE3 , ? =
    // DB2_ERROR_CODE4 , ? = DB2_INTERNAL_ERROR_POINTER , ? = DB2_LINE_NUMBER , ? = DB2_MESSAGE_ID ,
    // ? = DB2_MODULE_DETECTING_ERROR , ? = DB2_ORDINAL_TOKEN_1 , ? = DB2_ORDINAL_TOKEN_2 , ? =
    // DB2_ORDINAL_TOKEN_3 , ? = DB2_ORDINAL_TOKEN_4 , ? = DB2_ORDINAL_TOKEN_5 , ? =
    // DB2_ORDINAL_TOKEN_6 , ? = DB2_ORDINAL_TOKEN_7 , ? = DB2_ORDINAL_TOKEN_8 , ? =
    // DB2_ORDINAL_TOKEN_9 , ? = DB2_ORDINAL_TOKEN_10 , ? = DB2_ORDINAL_TOKEN_11 , ? =
    // DB2_ORDINAL_TOKEN_12 , ? = DB2_ORDINAL_TOKEN_13 , ? = DB2_ORDINAL_TOKEN_14 , ? =
    // DB2_ORDINAL_TOKEN_15 , ? = DB2_ORDINAL_TOKEN_16 , ? = DB2_ORDINAL_TOKEN_17 , ? =
    // DB2_ORDINAL_TOKEN_18 , ? = DB2_ORDINAL_TOKEN_19 , ? = DB2_ORDINAL_TOKEN_20 , ? =
    // DB2_ORDINAL_TOKEN_21 , ? = DB2_ORDINAL_TOKEN_22 , ? = DB2_ORDINAL_TOKEN_23 , ? =
    // DB2_ORDINAL_TOKEN_24 , ? = DB2_ORDINAL_TOKEN_25 , ? = DB2_ORDINAL_TOKEN_26 , ? =
    // DB2_ORDINAL_TOKEN_27 , ? = DB2_ORDINAL_TOKEN_28 , ? = DB2_ORDINAL_TOKEN_29 , ? =
    // DB2_ORDINAL_TOKEN_30 , ? = DB2_ORDINAL_TOKEN_31 , ? = DB2_ORDINAL_TOKEN_32 , ? =
    // DB2_ORDINAL_TOKEN_33 , ? = DB2_ORDINAL_TOKEN_34 , ? = DB2_ORDINAL_TOKEN_35 , ? =
    // DB2_ORDINAL_TOKEN_36 , ? = DB2_ORDINAL_TOKEN_37 , ? = DB2_ORDINAL_TOKEN_38 , ? =
    // DB2_ORDINAL_TOKEN_39 , ? = DB2_ORDINAL_TOKEN_40 , ? = DB2_ORDINAL_TOKEN_41 , ? =
    // DB2_ORDINAL_TOKEN_42 , ? = DB2_ORDINAL_TOKEN_43 , ? = DB2_ORDINAL_TOKEN_44 , ? =
    // DB2_ORDINAL_TOKEN_45 , ? = DB2_ORDINAL_TOKEN_46 , ? = DB2_ORDINAL_TOKEN_47 , ? =
    // DB2_ORDINAL_TOKEN_48 , ? = DB2_ORDINAL_TOKEN_49 , ? = DB2_ORDINAL_TOKEN_50 , ? =
    // DB2_ORDINAL_TOKEN_51 , ? = DB2_ORDINAL_TOKEN_52 , ? = DB2_ORDINAL_TOKEN_53 , ? =
    // DB2_ORDINAL_TOKEN_54 , ? = DB2_ORDINAL_TOKEN_55 , ? = DB2_ORDINAL_TOKEN_56 , ? =
    // DB2_ORDINAL_TOKEN_57 , ? = DB2_ORDINAL_TOKEN_58 , ? = DB2_ORDINAL_TOKEN_59 , ? =
    // DB2_ORDINAL_TOKEN_60 , ? = DB2_ORDINAL_TOKEN_61 , ? = DB2_ORDINAL_TOKEN_62 , ? =
    // DB2_ORDINAL_TOKEN_63 , ? = DB2_ORDINAL_TOKEN_64 , ? = DB2_ORDINAL_TOKEN_65 , ? =
    // DB2_ORDINAL_TOKEN_66 , ? = DB2_ORDINAL_TOKEN_67 , ? = DB2_ORDINAL_TOKEN_68 , ? =
    // DB2_ORDINAL_TOKEN_69 , ? = DB2_ORDINAL_TOKEN_70 , ? = DB2_ORDINAL_TOKEN_71 , ? =
    // DB2_ORDINAL_TOKEN_72 , ? = DB2_ORDINAL_TOKEN_73 , ? = DB2_ORDINAL_TOKEN_74 , ? =
    // DB2_ORDINAL_TOKEN_75 , ? = DB2_ORDINAL_TOKEN_76 , ? = DB2_ORDINAL_TOKEN_77 , ? =
    // DB2_ORDINAL_TOKEN_78 , ? = DB2_ORDINAL_TOKEN_79 , ? = DB2_ORDINAL_TOKEN_80 , ? =
    // DB2_ORDINAL_TOKEN_81 , ? = DB2_ORDINAL_TOKEN_82 , ? = DB2_ORDINAL_TOKEN_83 , ? =
    // DB2_ORDINAL_TOKEN_84 , ? = DB2_ORDINAL_TOKEN_85 , ? = DB2_ORDINAL_TOKEN_86 , ? =
    // DB2_ORDINAL_TOKEN_87 , ? = DB2_ORDINAL_TOKEN_88 , ? = DB2_ORDINAL_TOKEN_89 , ? =
    // DB2_ORDINAL_TOKEN_90 , ? = DB2_ORDINAL_TOKEN_91 , ? = DB2_ORDINAL_TOKEN_92 , ? =
    // DB2_ORDINAL_TOKEN_93 , ? = DB2_ORDINAL_TOKEN_94 , ? = DB2_ORDINAL_TOKEN_95 , ? =
    // DB2_ORDINAL_TOKEN_96 , ? = DB2_ORDINAL_TOKEN_97 , ? = DB2_ORDINAL_TOKEN_98 , ? =
    // DB2_ORDINAL_TOKEN_99 , ? = DB2_ORDINAL_TOKEN_100 , ? = DB2_REASON_CODE , ? =
    // DB2_RETURNED_SQLCODE , ? = DB2_ROW_NUMBER , ? = DB2_SQLERRD_SET , ? = DB2_SQLERRD1 , ? =
    // DB2_SQLERRD2 , ? = DB2_SQLERRD3 , ? = DB2_SQLERRD4 , ? = DB2_SQLERRD5 , ? = DB2_SQLERRD6 , ?
    // = DB2_TOKEN_COUNT , ? = MESSAGE_TEXT , ? = RETURNED_SQLSTATE , ? = SERVER_NAME

    /**
     * ***** GET DIAGNOSTICS CONDITION :GD-COND ***** :GD-CATALOG-NAME = CATALOG_NAME *****
     * ,:GD-CONDITION-NUMBER = CONDITION_NUMBER ***** ,:GD-CURSOR-NAME = CURSOR_NAME *****
     * ,:GD-ERROR-CODE1 = DB2_ERROR_CODE1 ***** ,:GD-ERROR-CODE2 = DB2_ERROR_CODE2 *****
     * ,:GD-ERROR-CODE3 = DB2_ERROR_CODE3 ***** ,:GD-ERROR-CODE4 = DB2_ERROR_CODE4 *****
     * ,:GD-INTERNAL-ERR-PTR = DB2_INTERNAL_ERROR_POINTER ***** ,:GD-LINE-NUMBER = DB2_LINE_NUMBER
     * ***** ,:GD-MESSAGE-ID = DB2_MESSAGE_ID ***** ,:GD-MOD-DETECTING-ERR =
     * DB2_MODULE_DETECTING_ERROR ***** ,:GD-ORD-TOKEN-1 = DB2_ORDINAL_TOKEN_1 *****
     * ,:GD-ORD-TOKEN-2 = DB2_ORDINAL_TOKEN_2 ***** ,:GD-ORD-TOKEN-3 = DB2_ORDINAL_TOKEN_3 *****
     * ,:GD-ORD-TOKEN-4 = DB2_ORDINAL_TOKEN_4 ***** ,:GD-ORD-TOKEN-5 = DB2_ORDINAL_TOKEN_5 *****
     * ,:GD-ORD-TOKEN-6 = DB2_ORDINAL_TOKEN_6 ***** ,:GD-ORD-TOKEN-7 = DB2_ORDINAL_TOKEN_7 *****
     * ,:GD-ORD-TOKEN-8 = DB2_ORDINAL_TOKEN_8 ***** ,:GD-ORD-TOKEN-9 = DB2_ORDINAL_TOKEN_9 *****
     * ,:GD-ORD-TOKEN-10 = DB2_ORDINAL_TOKEN_10 ***** ,:GD-ORD-TOKEN-11 = DB2_ORDINAL_TOKEN_11 *****
     * ,:GD-ORD-TOKEN-12 = DB2_ORDINAL_TOKEN_12 ***** ,:GD-ORD-TOKEN-13 = DB2_ORDINAL_TOKEN_13 *****
     * ,:GD-ORD-TOKEN-14 = DB2_ORDINAL_TOKEN_14 ***** ,:GD-ORD-TOKEN-15 = DB2_ORDINAL_TOKEN_15 *****
     * ,:GD-ORD-TOKEN-16 = DB2_ORDINAL_TOKEN_16 ***** ,:GD-ORD-TOKEN-17 = DB2_ORDINAL_TOKEN_17 *****
     * ,:GD-ORD-TOKEN-18 = DB2_ORDINAL_TOKEN_18 ***** ,:GD-ORD-TOKEN-19 = DB2_ORDINAL_TOKEN_19 *****
     * ,:GD-ORD-TOKEN-20 = DB2_ORDINAL_TOKEN_20 ***** ,:GD-ORD-TOKEN-21 = DB2_ORDINAL_TOKEN_21 *****
     * ,:GD-ORD-TOKEN-22 = DB2_ORDINAL_TOKEN_22 ***** ,:GD-ORD-TOKEN-23 = DB2_ORDINAL_TOKEN_23 *****
     * ,:GD-ORD-TOKEN-24 = DB2_ORDINAL_TOKEN_24 ***** ,:GD-ORD-TOKEN-25 = DB2_ORDINAL_TOKEN_25 *****
     * ,:GD-ORD-TOKEN-26 = DB2_ORDINAL_TOKEN_26 ***** ,:GD-ORD-TOKEN-27 = DB2_ORDINAL_TOKEN_27 *****
     * ,:GD-ORD-TOKEN-28 = DB2_ORDINAL_TOKEN_28 ***** ,:GD-ORD-TOKEN-29 = DB2_ORDINAL_TOKEN_29 *****
     * ,:GD-ORD-TOKEN-30 = DB2_ORDINAL_TOKEN_30 ***** ,:GD-ORD-TOKEN-31 = DB2_ORDINAL_TOKEN_31 *****
     * ,:GD-ORD-TOKEN-32 = DB2_ORDINAL_TOKEN_32 ***** ,:GD-ORD-TOKEN-33 = DB2_ORDINAL_TOKEN_33 *****
     * ,:GD-ORD-TOKEN-34 = DB2_ORDINAL_TOKEN_34 ***** ,:GD-ORD-TOKEN-35 = DB2_ORDINAL_TOKEN_35 *****
     * ,:GD-ORD-TOKEN-36 = DB2_ORDINAL_TOKEN_36 ***** ,:GD-ORD-TOKEN-37 = DB2_ORDINAL_TOKEN_37 *****
     * ,:GD-ORD-TOKEN-38 = DB2_ORDINAL_TOKEN_38 ***** ,:GD-ORD-TOKEN-39 = DB2_ORDINAL_TOKEN_39 *****
     * ,:GD-ORD-TOKEN-40 = DB2_ORDINAL_TOKEN_40 ***** ,:GD-ORD-TOKEN-41 = DB2_ORDINAL_TOKEN_41 *****
     * ,:GD-ORD-TOKEN-42 = DB2_ORDINAL_TOKEN_42 ***** ,:GD-ORD-TOKEN-43 = DB2_ORDINAL_TOKEN_43 *****
     * ,:GD-ORD-TOKEN-44 = DB2_ORDINAL_TOKEN_44 ***** ,:GD-ORD-TOKEN-45 = DB2_ORDINAL_TOKEN_45 *****
     * ,:GD-ORD-TOKEN-46 = DB2_ORDINAL_TOKEN_46 ***** ,:GD-ORD-TOKEN-47 = DB2_ORDINAL_TOKEN_47 *****
     * ,:GD-ORD-TOKEN-48 = DB2_ORDINAL_TOKEN_48 ***** ,:GD-ORD-TOKEN-49 = DB2_ORDINAL_TOKEN_49 *****
     * ,:GD-ORD-TOKEN-50 = DB2_ORDINAL_TOKEN_50 ***** ,:GD-ORD-TOKEN-51 = DB2_ORDINAL_TOKEN_51 *****
     * ,:GD-ORD-TOKEN-52 = DB2_ORDINAL_TOKEN_52 ***** ,:GD-ORD-TOKEN-53 = DB2_ORDINAL_TOKEN_53 *****
     * ,:GD-ORD-TOKEN-54 = DB2_ORDINAL_TOKEN_54 ***** ,:GD-ORD-TOKEN-55 = DB2_ORDINAL_TOKEN_55 *****
     * ,:GD-ORD-TOKEN-56 = DB2_ORDINAL_TOKEN_56 ***** ,:GD-ORD-TOKEN-57 = DB2_ORDINAL_TOKEN_57 *****
     * ,:GD-ORD-TOKEN-58 = DB2_ORDINAL_TOKEN_58 ***** ,:GD-ORD-TOKEN-59 = DB2_ORDINAL_TOKEN_59 *****
     * ,:GD-ORD-TOKEN-60 = DB2_ORDINAL_TOKEN_60 ***** ,:GD-ORD-TOKEN-61 = DB2_ORDINAL_TOKEN_61 *****
     * ,:GD-ORD-TOKEN-62 = DB2_ORDINAL_TOKEN_62 ***** ,:GD-ORD-TOKEN-63 = DB2_ORDINAL_TOKEN_63 *****
     * ,:GD-ORD-TOKEN-64 = DB2_ORDINAL_TOKEN_64 ***** ,:GD-ORD-TOKEN-65 = DB2_ORDINAL_TOKEN_65 *****
     * ,:GD-ORD-TOKEN-66 = DB2_ORDINAL_TOKEN_66 ***** ,:GD-ORD-TOKEN-67 = DB2_ORDINAL_TOKEN_67 *****
     * ,:GD-ORD-TOKEN-68 = DB2_ORDINAL_TOKEN_68 ***** ,:GD-ORD-TOKEN-69 = DB2_ORDINAL_TOKEN_69 *****
     * ,:GD-ORD-TOKEN-70 = DB2_ORDINAL_TOKEN_70 ***** ,:GD-ORD-TOKEN-71 = DB2_ORDINAL_TOKEN_71 *****
     * ,:GD-ORD-TOKEN-72 = DB2_ORDINAL_TOKEN_72 ***** ,:GD-ORD-TOKEN-73 = DB2_ORDINAL_TOKEN_73 *****
     * ,:GD-ORD-TOKEN-74 = DB2_ORDINAL_TOKEN_74 ***** ,:GD-ORD-TOKEN-75 = DB2_ORDINAL_TOKEN_75 *****
     * ,:GD-ORD-TOKEN-76 = DB2_ORDINAL_TOKEN_76 ***** ,:GD-ORD-TOKEN-77 = DB2_ORDINAL_TOKEN_77 *****
     * ,:GD-ORD-TOKEN-78 = DB2_ORDINAL_TOKEN_78 ***** ,:GD-ORD-TOKEN-79 = DB2_ORDINAL_TOKEN_79 *****
     * ,:GD-ORD-TOKEN-80 = DB2_ORDINAL_TOKEN_80 ***** ,:GD-ORD-TOKEN-81 = DB2_ORDINAL_TOKEN_81 *****
     * ,:GD-ORD-TOKEN-82 = DB2_ORDINAL_TOKEN_82 ***** ,:GD-ORD-TOKEN-83 = DB2_ORDINAL_TOKEN_83 *****
     * ,:GD-ORD-TOKEN-84 = DB2_ORDINAL_TOKEN_84 ***** ,:GD-ORD-TOKEN-85 = DB2_ORDINAL_TOKEN_85 *****
     * ,:GD-ORD-TOKEN-86 = DB2_ORDINAL_TOKEN_86 ***** ,:GD-ORD-TOKEN-87 = DB2_ORDINAL_TOKEN_87 *****
     * ,:GD-ORD-TOKEN-88 = DB2_ORDINAL_TOKEN_88 ***** ,:GD-ORD-TOKEN-89 = DB2_ORDINAL_TOKEN_89 *****
     * ,:GD-ORD-TOKEN-90 = DB2_ORDINAL_TOKEN_90 ***** ,:GD-ORD-TOKEN-91 = DB2_ORDINAL_TOKEN_91 *****
     * ,:GD-ORD-TOKEN-92 = DB2_ORDINAL_TOKEN_92 ***** ,:GD-ORD-TOKEN-93 = DB2_ORDINAL_TOKEN_93 *****
     * ,:GD-ORD-TOKEN-94 = DB2_ORDINAL_TOKEN_94 ***** ,:GD-ORD-TOKEN-95 = DB2_ORDINAL_TOKEN_95 *****
     * ,:GD-ORD-TOKEN-96 = DB2_ORDINAL_TOKEN_96 ***** ,:GD-ORD-TOKEN-97 = DB2_ORDINAL_TOKEN_97 *****
     * ,:GD-ORD-TOKEN-98 = DB2_ORDINAL_TOKEN_98 ***** ,:GD-ORD-TOKEN-99 = DB2_ORDINAL_TOKEN_99 *****
     * ,:GD-ORD-TOKEN-100 = DB2_ORDINAL_TOKEN_100 ***** ,:GD-REASON-CODE = DB2_REASON_CODE *****
     * ,:GD-RETURNED-SQLCODE = DB2_RETURNED_SQLCODE ***** ,:GD-ROW-NUMBER = DB2_ROW_NUMBER *****
     * ,:GD-SQLERRD-SET = DB2_SQLERRD_SET ***** ,:GD-SQLERRD1 = DB2_SQLERRD1 ***** ,:GD-SQLERRD2 =
     * DB2_SQLERRD2 ***** ,:GD-SQLERRD3 = DB2_SQLERRD3 ***** ,:GD-SQLERRD4 = DB2_SQLERRD4 *****
     * ,:GD-SQLERRD5 = DB2_SQLERRD5 ***** ,:GD-SQLERRD6 = DB2_SQLERRD6 ***** ,:GD-TOKEN-COUNT =
     * DB2_TOKEN_COUNT ***** ,:GD-MESSAGE-TEXT = MESSAGE_TEXT ***** ,:GD-RETURNED-SQLSTATE =
     * RETURNED_SQLSTATE ***** ,:GD-SERVER-NAME = SERVER_NAME
     */
    // Get diagnotics
    gdGetDiagArea.setGdReturnedSqlcode(
        db2Base.getDiagnostics().getSqlCode(gdGetDiagArea.getGdCond()));
    gdGetDiagArea.setGdRowNumber(
        (long) db2Base.getDiagnostics().getConditionRowNumber(gdGetDiagArea.getGdCond()));
    gdGetDiagArea
        .getGdMessageText()
        .setString(db2Base.getDiagnostics().getMessage(gdGetDiagArea.getGdCond()));
    gdGetDiagArea.setGdReturnedSqlstate(
        db2Base.getDiagnostics().getSqlState(gdGetDiagArea.getGdCond()));

    // *****
    //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
    methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
    //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
    zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/

    // *****
    //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
    methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
    //  cobolCode::MOVE '*********************************************' TO GD-DISPLAY-LIT
    methodOut.setGdDisplayLit(CONSTANTS.LITERAL_1359560854);
    //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
    zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/

    // *****
    //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
    methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
    //  cobolCode::MOVE '* GET DIAGNOSTICS CONDITION INFORMATION' TO GD-DISPLAY-LIT
    methodOut.setGdDisplayLit(CONSTANTS.LITERAL_799960799);
    //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
    zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/

    // *****
    //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
    methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
    //  cobolCode::MOVE '*********************************************' TO GD-DISPLAY-LIT
    methodOut.setGdDisplayLit(CONSTANTS.LITERAL_1359560854);
    //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
    zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/

    // *****
    //  cobolCode::IF SQLCODE NOT = ZERO
    if ((methodOut.getSqlcode() != 0)) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  FORMAT1132375918 = "+999999999"
      methodOut.setGdIntegerDisp(
          CFUtil.cobolNumberFormatter(
              CONSTANTS.FORMAT1132375918, String.valueOf(methodOut.getSqlcode()).toCharArray()));
      //  cobolCode::STRING 'CALL FAILED: SQLCODE = ' DELIMITED BY SIZE GD-INTEGER-DISP DELIMITED BY
      // SIZE INTO GD-DISPLAY-LIT
      charArray = new ArrayList<char[]>();
      charArray.add(CONSTANTS.LITERAL_542747305);
      charArray.add(methodOut.getGdIntegerDisp());
      joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1));
      updated = updateString(methodOut.getGdDisplayLit(), joinCharArray);
      methodOut.setGdDisplayLit((char[]) updated.get("string"));
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
      // cobolCode::GO TO ZZZD-EXIT
      return methodOut;
      // cobolCodeEnds::GO TO ZZZD-EXIT
    }

    // *****
    //  cobolCode::IF GD-CATALOG-NAME-L > ZERO
    if ((methodIn.getGdCatalogNameL() > 0)) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  cobolCode::STRING GD-COND-LIT-01 DELIMITED BY SIZE GD-CATALOG-NAME-T (1 :
      // GD-CATALOG-NAME-L ) DELIMITED BY SIZE INTO GD-DISPLAY-LIT
      charArray = new ArrayList<char[]>();
      charArray.add(methodIn.getGdCondLit01());
      charArray.add(substring(methodOut.getGdCatalogNameT(), 0, methodIn.getGdCatalogNameL()));
      joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1));
      updated = updateString(methodOut.getGdDisplayLit(), joinCharArray);
      methodOut.setGdDisplayLit((char[]) updated.get("string"));
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
    }
    //  cobolCode::IF GD-CATALOG-NAME-L > 65
    if ((methodIn.getGdCatalogNameL() > 65)) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  cobolCode::MOVE GD-CATALOG-NAME-T (66 : ( GD-CATALOG-NAME-L - 65)) TO GD-DISPLAY-LIT
      methodOut
          .getGdGetDiagArea()
          .replace(
              methodOut.getGdGetDiagArea() /*parent*/,
              3736 + 66 - 1 /*fromOffset - (gdDisplayLit) */,
              (int) (methodIn.getGdCatalogNameL() - 65) /*fromLen*/,
              85 /*toOffset - (gdCatalogNameT) */,
              80 /*toLen*/);
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
    }

    // *****
    //  cobolCode::IF GD-CONDITION-NUMBER NOT = ZERO
    if ((methodOut.getGdConditionNumber() != 0)) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  FORMAT1132375918 = "+999999999"
      methodOut.setGdIntegerDisp(
          CFUtil.cobolNumberFormatter(
              CONSTANTS.FORMAT1132375918,
              String.valueOf(methodOut.getGdConditionNumber()).toCharArray()));
      //  cobolCode::STRING GD-COND-LIT-02 DELIMITED BY SIZE GD-INTEGER-DISP DELIMITED BY SIZE INTO
      // GD-DISPLAY-LIT
      charArray = new ArrayList<char[]>();
      charArray.add(methodIn.getGdCondLit02());
      charArray.add(methodOut.getGdIntegerDisp());
      joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1));
      updated = updateString(methodOut.getGdDisplayLit(), joinCharArray);
      methodOut.setGdDisplayLit((char[]) updated.get("string"));
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
    }

    // *****
    //  cobolCode::IF GD-CURSOR-NAME-L > ZERO
    if ((methodIn.getGdCursorNameL() > 0)) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  cobolCode::STRING GD-COND-LIT-03 DELIMITED BY SIZE GD-CURSOR-NAME-T (1 : GD-CURSOR-NAME-L
      // ) DELIMITED BY SIZE INTO GD-DISPLAY-LIT
      charArray = new ArrayList<char[]>();
      charArray.add(methodIn.getGdCondLit03());
      charArray.add(substring(methodOut.getGdCursorNameT(), 0, methodIn.getGdCursorNameL()));
      joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1));
      updated = updateString(methodOut.getGdDisplayLit(), joinCharArray);
      methodOut.setGdDisplayLit((char[]) updated.get("string"));
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
    }
    //  cobolCode::IF GD-CURSOR-NAME-L > 66
    if ((methodIn.getGdCursorNameL() > 66)) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  cobolCode::MOVE GD-CURSOR-NAME-T (67 : ( GD-CURSOR-NAME-L - 66)) TO GD-DISPLAY-LIT
      methodOut
          .getGdGetDiagArea()
          .replace(
              methodOut.getGdGetDiagArea() /*parent*/,
              3870 + 67 - 1 /*fromOffset - (gdDisplayLit) */,
              (int) (methodIn.getGdCursorNameL() - 66) /*fromLen*/,
              85 /*toOffset - (gdCursorNameT) */,
              80 /*toLen*/);
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
    }

    // *****
    //  cobolCode::IF GD-ERROR-CODE1 NOT = ZERO
    if ((methodOut.getGdErrorCode1() != 0)) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  FORMAT1132375918 = "+999999999"
      methodOut.setGdIntegerDisp(
          CFUtil.cobolNumberFormatter(
              CONSTANTS.FORMAT1132375918,
              String.valueOf(methodOut.getGdErrorCode1()).toCharArray()));
      //  cobolCode::STRING GD-COND-LIT-04 DELIMITED BY SIZE GD-INTEGER-DISP DELIMITED BY SIZE INTO
      // GD-DISPLAY-LIT
      charArray = new ArrayList<char[]>();
      charArray.add(methodIn.getGdCondLit04());
      charArray.add(methodOut.getGdIntegerDisp());
      joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1));
      updated = updateString(methodOut.getGdDisplayLit(), joinCharArray);
      methodOut.setGdDisplayLit((char[]) updated.get("string"));
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
    }

    // *****
    //  cobolCode::IF GD-ERROR-CODE2 NOT = ZERO
    if ((methodOut.getGdErrorCode2() != 0)) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  FORMAT1132375918 = "+999999999"
      methodOut.setGdIntegerDisp(
          CFUtil.cobolNumberFormatter(
              CONSTANTS.FORMAT1132375918,
              String.valueOf(methodOut.getGdErrorCode2()).toCharArray()));
      //  cobolCode::STRING GD-COND-LIT-05 DELIMITED BY SIZE GD-INTEGER-DISP DELIMITED BY SIZE INTO
      // GD-DISPLAY-LIT
      charArray = new ArrayList<char[]>();
      charArray.add(methodIn.getGdCondLit05());
      charArray.add(methodOut.getGdIntegerDisp());
      joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1));
      updated = updateString(methodOut.getGdDisplayLit(), joinCharArray);
      methodOut.setGdDisplayLit((char[]) updated.get("string"));
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
    }

    // *****
    //  cobolCode::IF GD-ERROR-CODE3 NOT = ZERO
    if ((methodOut.getGdErrorCode3() != 0)) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  FORMAT1132375918 = "+999999999"
      methodOut.setGdIntegerDisp(
          CFUtil.cobolNumberFormatter(
              CONSTANTS.FORMAT1132375918,
              String.valueOf(methodOut.getGdErrorCode3()).toCharArray()));
      //  cobolCode::STRING GD-COND-LIT-06 DELIMITED BY SIZE GD-INTEGER-DISP DELIMITED BY SIZE INTO
      // GD-DISPLAY-LIT
      charArray = new ArrayList<char[]>();
      charArray.add(methodIn.getGdCondLit06());
      charArray.add(methodOut.getGdIntegerDisp());
      joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1));
      updated = updateString(methodOut.getGdDisplayLit(), joinCharArray);
      methodOut.setGdDisplayLit((char[]) updated.get("string"));
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
    }

    // *****
    //  cobolCode::IF GD-ERROR-CODE4 NOT = ZERO
    if ((methodOut.getGdErrorCode4() != 0)) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  FORMAT1132375918 = "+999999999"
      methodOut.setGdIntegerDisp(
          CFUtil.cobolNumberFormatter(
              CONSTANTS.FORMAT1132375918,
              String.valueOf(methodOut.getGdErrorCode4()).toCharArray()));
      //  cobolCode::STRING GD-COND-LIT-07 DELIMITED BY SIZE GD-INTEGER-DISP DELIMITED BY SIZE INTO
      // GD-DISPLAY-LIT
      charArray = new ArrayList<char[]>();
      charArray.add(methodIn.getGdCondLit07());
      charArray.add(methodOut.getGdIntegerDisp());
      joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1));
      updated = updateString(methodOut.getGdDisplayLit(), joinCharArray);
      methodOut.setGdDisplayLit((char[]) updated.get("string"));
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
    }

    // *****
    //  cobolCode::IF GD-INTERNAL-ERR-PTR NOT = ZERO
    if ((methodOut.getGdInternalErrPtr() != 0)) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  FORMAT1132375918 = "+999999999"
      methodOut.setGdIntegerDisp(
          CFUtil.cobolNumberFormatter(
              CONSTANTS.FORMAT1132375918,
              String.valueOf(methodOut.getGdInternalErrPtr()).toCharArray()));
      //  cobolCode::STRING GD-COND-LIT-08 DELIMITED BY SIZE GD-INTEGER-DISP DELIMITED BY SIZE INTO
      // GD-DISPLAY-LIT
      charArray = new ArrayList<char[]>();
      charArray.add(methodIn.getGdCondLit08());
      charArray.add(methodOut.getGdIntegerDisp());
      joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1));
      updated = updateString(methodOut.getGdDisplayLit(), joinCharArray);
      methodOut.setGdDisplayLit((char[]) updated.get("string"));
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
    }

    // *****
    //  cobolCode::IF GD-LINE-NUMBER NOT = ZERO
    if ((methodOut.getGdLineNumber() != 0)) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  FORMAT1132375918 = "+999999999"
      methodOut.setGdIntegerDisp(
          CFUtil.cobolNumberFormatter(
              CONSTANTS.FORMAT1132375918,
              String.valueOf(methodOut.getGdLineNumber()).toCharArray()));
      //  cobolCode::STRING GD-COND-LIT-09 DELIMITED BY SIZE GD-INTEGER-DISP DELIMITED BY SIZE INTO
      // GD-DISPLAY-LIT
      charArray = new ArrayList<char[]>();
      charArray.add(methodIn.getGdCondLit09());
      charArray.add(methodOut.getGdIntegerDisp());
      joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1));
      updated = updateString(methodOut.getGdDisplayLit(), joinCharArray);
      methodOut.setGdDisplayLit((char[]) updated.get("string"));
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
    }

    // *****
    //  cobolCode::IF GD-MESSAGE-ID NOT = SPACE
    if ((!allSpaces(methodIn.getGdMessageId()))) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  cobolCode::STRING GD-COND-LIT-10 DELIMITED BY SIZE GD-MESSAGE-ID DELIMITED BY SIZE INTO
      // GD-DISPLAY-LIT
      charArray = new ArrayList<char[]>();
      charArray.add(methodIn.getGdCondLit10());
      charArray.add(methodIn.getGdMessageId());
      joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1));
      updated = updateString(methodOut.getGdDisplayLit(), joinCharArray);
      methodOut.setGdDisplayLit((char[]) updated.get("string"));
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
    }

    // *****
    //  cobolCode::IF GD-MOD-DETECTING-ERR NOT = SPACE
    if ((!allSpaces(methodIn.getGdModDetectingErr()))) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  cobolCode::STRING GD-COND-LIT-11 DELIMITED BY SIZE GD-MOD-DETECTING-ERR DELIMITED BY SIZE
      // INTO GD-DISPLAY-LIT
      charArray = new ArrayList<char[]>();
      charArray.add(methodIn.getGdCondLit11());
      charArray.add(methodIn.getGdModDetectingErr());
      joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1));
      updated = updateString(methodOut.getGdDisplayLit(), joinCharArray);
      methodOut.setGdDisplayLit((char[]) updated.get("string"));
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
    }

    // *****

    // *****
    methodOut.setGdSub(1);
    //  cobolCode::PERFORM ZZZE-ORD-TOKEN THRU ZZZE-EXIT GD-TOKEN-COUNT TIMES
    {
      for (int index = 0; index < methodOut.getGdTokenCount(); index++) {
        zzzeOrdToken(programCtx.getZzzeOrdTokenInCtx()); /*ZZZE-ORD-TOKEN*/
      }
    }

    // *****
    //  cobolCode::IF GD-REASON-CODE NOT = ZERO
    if ((methodOut.getGdReasonCode() != 0)) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  FORMAT1132375918 = "+999999999"
      methodOut.setGdIntegerDisp(
          CFUtil.cobolNumberFormatter(
              CONSTANTS.FORMAT1132375918,
              String.valueOf(methodOut.getGdReasonCode()).toCharArray()));
      //  cobolCode::STRING GD-COND-LIT-13 DELIMITED BY SIZE GD-INTEGER-DISP DELIMITED BY SIZE INTO
      // GD-DISPLAY-LIT
      charArray = new ArrayList<char[]>();
      charArray.add(methodIn.getGdCondLit13());
      charArray.add(methodOut.getGdIntegerDisp());
      joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1));
      updated = updateString(methodOut.getGdDisplayLit(), joinCharArray);
      methodOut.setGdDisplayLit((char[]) updated.get("string"));
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
    }

    // *****
    //  cobolCode::IF GD-RETURNED-SQLCODE NOT = ZERO
    if ((methodOut.getGdReturnedSqlcode() != 0)) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  FORMAT1132375918 = "+999999999"
      methodOut.setGdIntegerDisp(
          CFUtil.cobolNumberFormatter(
              CONSTANTS.FORMAT1132375918,
              String.valueOf(methodOut.getGdReturnedSqlcode()).toCharArray()));
      //  cobolCode::STRING GD-COND-LIT-14 DELIMITED BY SIZE GD-INTEGER-DISP DELIMITED BY SIZE INTO
      // GD-DISPLAY-LIT
      charArray = new ArrayList<char[]>();
      charArray.add(methodIn.getGdCondLit14());
      charArray.add(methodOut.getGdIntegerDisp());
      joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1));
      updated = updateString(methodOut.getGdDisplayLit(), joinCharArray);
      methodOut.setGdDisplayLit((char[]) updated.get("string"));
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
    }

    // *****
    //  cobolCode::IF GD-ROW-NUMBER NOT = ZERO
    if ((methodOut.getGdRowNumber() != 0)) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  cobolCode::MOVE GD-ROW-NUMBER TO GD-BIG-DECIMAL-DISP
      //  FORMAT_2103136818 = "+9999999999999999999999999999999"
      methodOut.setGdBigDecimalDisp(
          CFUtil.cobolNumberFormatter(
              CONSTANTS.FORMAT_2103136818,
              String.valueOf(methodOut.getGdRowNumber()).toCharArray()));
      //  cobolCode::STRING GD-COND-LIT-15 DELIMITED BY SIZE GD-BIG-DECIMAL-DISP DELIMITED BY SIZE
      // INTO GD-DISPLAY-LIT
      charArray = new ArrayList<char[]>();
      charArray.add(methodIn.getGdCondLit15());
      charArray.add(methodOut.getGdBigDecimalDisp());
      joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1));
      updated = updateString(methodOut.getGdDisplayLit(), joinCharArray);
      methodOut.setGdDisplayLit((char[]) updated.get("string"));
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
    }

    // *****
    //  cobolCode::IF GD-SQLERRD-SET NOT = SPACE
    if ((!allSpaces(methodIn.getGdSqlerrdSet()))) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  cobolCode::STRING GD-COND-LIT-16 DELIMITED BY SIZE GD-SQLERRD-SET DELIMITED BY SIZE INTO
      // GD-DISPLAY-LIT
      charArray = new ArrayList<char[]>();
      charArray.add(methodIn.getGdCondLit16());
      charArray.add(methodIn.getGdSqlerrdSet());
      joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1));
      updated = updateString(methodOut.getGdDisplayLit(), joinCharArray);
      methodOut.setGdDisplayLit((char[]) updated.get("string"));
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
    }

    // *****
    //  cobolCode::IF GD-SQLERRD1 NOT = ZERO
    if ((methodOut.getGdSqlerrd1() != 0)) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  FORMAT1132375918 = "+999999999"
      methodOut.setGdIntegerDisp(
          CFUtil.cobolNumberFormatter(
              CONSTANTS.FORMAT1132375918, String.valueOf(methodOut.getGdSqlerrd1()).toCharArray()));
      //  cobolCode::STRING GD-COND-LIT-17 DELIMITED BY SIZE GD-INTEGER-DISP DELIMITED BY SIZE INTO
      // GD-DISPLAY-LIT
      charArray = new ArrayList<char[]>();
      charArray.add(methodIn.getGdCondLit17());
      charArray.add(methodOut.getGdIntegerDisp());
      joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1));
      updated = updateString(methodOut.getGdDisplayLit(), joinCharArray);
      methodOut.setGdDisplayLit((char[]) updated.get("string"));
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
    }

    // *****
    //  cobolCode::IF GD-SQLERRD2 NOT = ZERO
    if ((methodOut.getGdSqlerrd2() != 0)) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  FORMAT1132375918 = "+999999999"
      methodOut.setGdIntegerDisp(
          CFUtil.cobolNumberFormatter(
              CONSTANTS.FORMAT1132375918, String.valueOf(methodOut.getGdSqlerrd2()).toCharArray()));
      //  cobolCode::STRING GD-COND-LIT-18 DELIMITED BY SIZE GD-INTEGER-DISP DELIMITED BY SIZE INTO
      // GD-DISPLAY-LIT
      charArray = new ArrayList<char[]>();
      charArray.add(methodIn.getGdCondLit18());
      charArray.add(methodOut.getGdIntegerDisp());
      joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1));
      updated = updateString(methodOut.getGdDisplayLit(), joinCharArray);
      methodOut.setGdDisplayLit((char[]) updated.get("string"));
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
    }

    // *****
    //  cobolCode::IF GD-SQLERRD3 NOT = ZERO
    if ((methodOut.getGdSqlerrd3() != 0)) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  FORMAT1132375918 = "+999999999"
      methodOut.setGdIntegerDisp(
          CFUtil.cobolNumberFormatter(
              CONSTANTS.FORMAT1132375918, String.valueOf(methodOut.getGdSqlerrd3()).toCharArray()));
      //  cobolCode::STRING GD-COND-LIT-19 DELIMITED BY SIZE GD-INTEGER-DISP DELIMITED BY SIZE INTO
      // GD-DISPLAY-LIT
      charArray = new ArrayList<char[]>();
      charArray.add(methodIn.getGdCondLit19());
      charArray.add(methodOut.getGdIntegerDisp());
      joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1));
      updated = updateString(methodOut.getGdDisplayLit(), joinCharArray);
      methodOut.setGdDisplayLit((char[]) updated.get("string"));
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
    }

    // *****
    //  cobolCode::IF GD-SQLERRD4 NOT = ZERO
    if ((methodOut.getGdSqlerrd4() != 0)) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  FORMAT1132375918 = "+999999999"
      methodOut.setGdIntegerDisp(
          CFUtil.cobolNumberFormatter(
              CONSTANTS.FORMAT1132375918, String.valueOf(methodOut.getGdSqlerrd4()).toCharArray()));
      //  cobolCode::STRING GD-COND-LIT-20 DELIMITED BY SIZE GD-INTEGER-DISP DELIMITED BY SIZE INTO
      // GD-DISPLAY-LIT
      charArray = new ArrayList<char[]>();
      charArray.add(methodIn.getGdCondLit20());
      charArray.add(methodOut.getGdIntegerDisp());
      joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1));
      updated = updateString(methodOut.getGdDisplayLit(), joinCharArray);
      methodOut.setGdDisplayLit((char[]) updated.get("string"));
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
    }

    // *****
    //  cobolCode::IF GD-SQLERRD5 NOT = ZERO
    if ((methodOut.getGdSqlerrd5() != 0)) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  FORMAT1132375918 = "+999999999"
      methodOut.setGdIntegerDisp(
          CFUtil.cobolNumberFormatter(
              CONSTANTS.FORMAT1132375918, String.valueOf(methodOut.getGdSqlerrd5()).toCharArray()));
      //  cobolCode::STRING GD-COND-LIT-21 DELIMITED BY SIZE GD-INTEGER-DISP DELIMITED BY SIZE INTO
      // GD-DISPLAY-LIT
      charArray = new ArrayList<char[]>();
      charArray.add(methodIn.getGdCondLit21());
      charArray.add(methodOut.getGdIntegerDisp());
      joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1));
      updated = updateString(methodOut.getGdDisplayLit(), joinCharArray);
      methodOut.setGdDisplayLit((char[]) updated.get("string"));
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
    }

    // *****
    //  cobolCode::IF GD-SQLERRD6 NOT = ZERO
    if ((methodOut.getGdSqlerrd6() != 0)) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  FORMAT1132375918 = "+999999999"
      methodOut.setGdIntegerDisp(
          CFUtil.cobolNumberFormatter(
              CONSTANTS.FORMAT1132375918, String.valueOf(methodOut.getGdSqlerrd6()).toCharArray()));
      //  cobolCode::STRING GD-COND-LIT-22 DELIMITED BY SIZE GD-INTEGER-DISP DELIMITED BY SIZE INTO
      // GD-DISPLAY-LIT
      charArray = new ArrayList<char[]>();
      charArray.add(methodIn.getGdCondLit22());
      charArray.add(methodOut.getGdIntegerDisp());
      joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1));
      updated = updateString(methodOut.getGdDisplayLit(), joinCharArray);
      methodOut.setGdDisplayLit((char[]) updated.get("string"));
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
    }

    // *****
    //  cobolCode::IF GD-TOKEN-COUNT NOT = ZERO
    if ((methodOut.getGdTokenCount() != 0)) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  FORMAT1132375918 = "+999999999"
      methodOut.setGdIntegerDisp(
          CFUtil.cobolNumberFormatter(
              CONSTANTS.FORMAT1132375918,
              String.valueOf(methodOut.getGdTokenCount()).toCharArray()));
      //  cobolCode::STRING GD-COND-LIT-23 DELIMITED BY SIZE GD-INTEGER-DISP DELIMITED BY SIZE INTO
      // GD-DISPLAY-LIT
      charArray = new ArrayList<char[]>();
      charArray.add(methodIn.getGdCondLit23());
      charArray.add(methodOut.getGdIntegerDisp());
      joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1));
      updated = updateString(methodOut.getGdDisplayLit(), joinCharArray);
      methodOut.setGdDisplayLit((char[]) updated.get("string"));
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
    }

    // *****
    //  cobolCode::IF GD-MESSAGE-TEXT-L > ZERO
    if ((methodIn.getGdMessageTextL() > 0)) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  cobolCode::STRING GD-COND-LIT-24 DELIMITED BY SIZE GD-MESSAGE-TEXT-T (1 :
      // GD-MESSAGE-TEXT-L ) DELIMITED BY SIZE INTO GD-DISPLAY-LIT
      charArray = new ArrayList<char[]>();
      charArray.add(methodIn.getGdCondLit24());
      charArray.add(substring(methodOut.getGdMessageTextT(), 0, methodIn.getGdMessageTextL()));
      joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1));
      updated = updateString(methodOut.getGdDisplayLit(), joinCharArray);
      methodOut.setGdDisplayLit((char[]) updated.get("string"));
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
    }
    methodOut.setGdPos(65);
    //  cobolCode::PERFORM UNTIL GD-POS NOT < GD-MESSAGE-TEXT-L
    while (((methodOut.getGdPos() < methodIn.getGdMessageTextL()))) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  cobolCode::MOVE GD-MESSAGE-TEXT-T ( GD-POS + 1 : ( GD-MESSAGE-TEXT-L - GD-POS )) TO
      // GD-DISPLAY-LIT
      methodOut
          .getGdGetDiagArea()
          .replace(
              methodOut.getGdGetDiagArea() /*parent*/,
              55795 + methodOut.getGdPos() + 1 - 1 /*fromOffset - (gdDisplayLit) */,
              methodIn.getGdMessageTextL() - methodOut.getGdPos() /*fromLen*/,
              85 /*toOffset - (gdMessageTextT) */,
              80 /*toLen*/);
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
      //  cobolCode::ADD 80 TO GD-POS
      methodOut.setGdPos(methodOut.getGdPos() + 80);
    }

    // *****
    //  cobolCode::IF GD-RETURNED-SQLSTATE NOT = SPACE
    if ((!allSpaces(methodIn.getGdReturnedSqlstate()))) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  cobolCode::STRING GD-COND-LIT-25 DELIMITED BY SIZE GD-RETURNED-SQLSTATE DELIMITED BY SIZE
      // INTO GD-DISPLAY-LIT
      charArray = new ArrayList<char[]>();
      charArray.add(methodIn.getGdCondLit25());
      charArray.add(methodIn.getGdReturnedSqlstate());
      joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1));
      updated = updateString(methodOut.getGdDisplayLit(), joinCharArray);
      methodOut.setGdDisplayLit((char[]) updated.get("string"));
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
    }

    // *****
    //  cobolCode::IF GD-SERVER-NAME-L > ZERO
    if ((methodIn.getGdServerNameL() > 0)) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  cobolCode::STRING GD-COND-LIT-26 DELIMITED BY SIZE GD-SERVER-NAME-T (1 : GD-SERVER-NAME-L
      // ) DELIMITED BY SIZE INTO GD-DISPLAY-LIT
      charArray = new ArrayList<char[]>();
      charArray.add(methodIn.getGdCondLit26());
      charArray.add(substring(methodOut.getGdServerNameT(), 0, methodIn.getGdServerNameL()));
      joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1));
      updated = updateString(methodOut.getGdDisplayLit(), joinCharArray);
      methodOut.setGdDisplayLit((char[]) updated.get("string"));
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
    }
    //  cobolCode::IF GD-SERVER-NAME-L > 66
    if ((methodIn.getGdServerNameL() > 66)) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  cobolCode::MOVE GD-SERVER-NAME-T (67 : ( GD-SERVER-NAME-L - 66)) TO GD-DISPLAY-LIT
      methodOut
          .getGdGetDiagArea()
          .replace(
              methodOut.getGdGetDiagArea() /*parent*/,
              88474 + 67 - 1 /*fromOffset - (gdDisplayLit) */,
              (int) (methodIn.getGdServerNameL() - 66) /*fromLen*/,
              85 /*toOffset - (gdServerNameT) */,
              80 /*toLen*/);
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
    }

    return methodOut;
  }
  /**
   * zzzeOrdToken This method is derived from COBOL Paragraph - ZZZE-ORD-TOKEN COBOL Cyclomatic
   * complexity - 8 Input :
   *
   * <p>- gdOrdTokenL COBOL Name: GD-ORD-TOKEN-L - gdSub COBOL Name: GD-SUB - gdCondLit12 COBOL
   * Name: GD-COND-LIT-12 - gdOrdTokenT COBOL Name: GD-ORD-TOKEN-T
   *
   * <p>Output :
   *
   * <p>- gdDisplayLit COBOL Name: GD-DISPLAY-LIT - gdPos COBOL Name: GD-POS - gdOrdTokenT COBOL
   * Name: GD-ORD-TOKEN-T - gdSub COBOL Name: GD-SUB
   *
   * @throws CFException
   */
  @Override
  public ZzzeOrdTokenOutCtx zzzeOrdToken(ZzzeOrdTokenInCtx methodIn) throws Exception {
    // Declare local variables used in the method
    ArrayList<char[]> charArray = new ArrayList<char[]>();
    char[] joinCharArray = null;
    Map<String, Object> updated = null;
    // End of variable declaration

    // *****************************************************************
    // * Ord token
    // *****************************************************************
    // Added variable to get the program context in place.
    DphpctsqCtx programCtx = methodIn.getDphpctsqCtx();
    // Added variable to get the output context in place.
    ZzzeOrdTokenOutCtx methodOut = methodIn.getZzzeOrdTokenOutCtx();
    //  cobolCode::IF GD-ORD-TOKEN-L ( GD-SUB ) > ZERO
    if ((methodIn.getGdOrdTokenL(methodOut.getGdSub() - 1) > 0)) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  cobolCode::STRING GD-COND-LIT-12 DELIMITED BY SIZE ' (' DELIMITED BY SIZE GD-SUB DELIMITED
      // BY SIZE ') = ' DELIMITED BY SIZE GD-ORD-TOKEN-T ( GD-SUB ) (1 : GD-ORD-TOKEN-L ( GD-SUB ))
      // DELIMITED BY SIZE INTO GD-DISPLAY-LIT
      charArray = new ArrayList<char[]>();
      charArray.add(methodIn.getGdCondLit12());
      charArray.add(CONSTANTS.LITERAL_B_PRO_);
      charArray.add(String.valueOf(methodOut.getGdSubString()).toCharArray());
      charArray.add(CONSTANTS.LITERAL_1012268454);
      charArray.add(
          substring(
              methodOut.getGdOrdTokenT(methodOut.getGdSub() - 1),
              0,
              methodIn.getGdOrdTokenL(methodOut.getGdSub() - 1)));
      joinCharArray =
          Field.mergeArrays(
              charArray.get(0),
              charArray.get(1),
              charArray.get(2),
              charArray.get(3),
              charArray.get(4));
      updated = updateString(methodOut.getGdDisplayLit(), joinCharArray);
      methodOut.setGdDisplayLit((char[]) updated.get("string"));
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
    }
    methodOut.setGdPos(54);
    //  cobolCode::PERFORM UNTIL GD-POS NOT < GD-ORD-TOKEN-L ( GD-SUB )
    while (((methodOut.getGdPos() < methodIn.getGdOrdTokenL(methodOut.getGdSub() - 1)))) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  cobolCode::MOVE GD-ORD-TOKEN-T ( GD-SUB ) ( GD-POS + 1 : ( GD-ORD-TOKEN-L ( GD-SUB ) -
      // GD-POS )) TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(
          substring(
              methodOut.getGdOrdTokenT(methodOut.getGdSub() - 1),
              (methodOut.getGdPos() + 1 - 1),
              (methodIn.getGdOrdTokenL(methodOut.getGdSub() - 1)
                  - methodOut.getGdPos()
                  + (methodOut.getGdPos() + 1 - 1))));
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
      //  cobolCode::ADD 80 TO GD-POS
      methodOut.setGdPos(methodOut.getGdPos() + 80);
    }
    //  cobolCode::ADD 1 TO GD-SUB
    methodOut.setGdSub(methodOut.getGdSub() + 1);

    return methodOut;
  }
  /**
   * zzzgFormatSqlca This method is derived from COBOL Paragraph - ZZZG-FORMAT-SQLCA COBOL
   * Cyclomatic complexity - 4 Input : None
   *
   * <p>Output :
   *
   * <p>- gdSqlcaMsgLen COBOL Name: GD-SQLCA-MSG-LEN - gdSqlcaMsgText COBOL Name: GD-SQLCA-MSG-TEXT
   * - gdSqlcaLineSize COBOL Name: GD-SQLCA-LINE-SIZE - rc COBOL Name: RETURN-CODE - gdDisplayLit
   * COBOL Name: GD-DISPLAY-LIT - gdIntegerDisp COBOL Name: GD-INTEGER-DISP - gdSqlcaWorkArea COBOL
   * Name: GD-SQLCA-WORK-AREA
   *
   * @throws CFException
   */
  @Override
  public ZzzgFormatSqlcaOutCtx zzzgFormatSqlca(ZzzgFormatSqlcaInCtx methodIn) throws Exception {
    // Declare local variables used in the method
    ArrayList<char[]> charArray = new ArrayList<char[]>();
    char[] joinCharArray = null;
    Map<String, Object> updated = null;
    // End of variable declaration

    // *****************************************************************
    // * Format sqlca
    // *****************************************************************
    // Added variable to get the program context in place.
    DphpctsqCtx programCtx = methodIn.getDphpctsqCtx();
    // Added variable to get the output context in place.
    ZzzgFormatSqlcaOutCtx methodOut = methodIn.getZzzgFormatSqlcaOutCtx();
    //  cobolCode::MOVE 2400 TO GD-SQLCA-MSG-LEN
    methodOut.setGdSqlcaMsgLen((short) 2400);
    //  cobolCode::MOVE SPACE TO GD-SQLCA-MSG-TEXT
    methodOut.setGdSqlcaMsgText(CONSTANTS.SPACE_2400);
    methodOut.setGdSqlcaLineSize(240);
    //  cobolCode::CALL GD-DSNTIAR USING SQLCA GD-SQLCA-MSG GD-SQLCA-LINE-SIZE
    // db2 error handling
    db2ErrorLogger(
        programCtx.getSqlca(), methodOut.getGdSqlcaMsg(), methodOut.getGdSqlcaLineSizeGroup());

    // *****
    //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
    methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
    //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
    zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/

    // *****
    //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
    methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
    //  cobolCode::MOVE '*********************************************' TO GD-DISPLAY-LIT
    methodOut.setGdDisplayLit(CONSTANTS.LITERAL_1359560854);
    //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
    zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/

    // *****
    //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
    methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
    //  cobolCode::MOVE '* SQLCA' TO GD-DISPLAY-LIT
    methodOut.setGdDisplayLit(CONSTANTS.LITERAL_2028136706);
    //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
    zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/

    // *****
    //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
    methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
    //  cobolCode::MOVE '*********************************************' TO GD-DISPLAY-LIT
    methodOut.setGdDisplayLit(CONSTANTS.LITERAL_1359560854);
    //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
    zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/

    // *****
    //  cobolCode::IF RETURN-CODE NOT = ZERO
    if ((programCtx.getRc() != 0)) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  cobolCode::MOVE RETURN-CODE TO GD-INTEGER-DISP
      //  FORMAT1132375918 = "+999999999"
      methodOut.setGdIntegerDisp(
          CFUtil.cobolNumberFormatter(
              CONSTANTS.FORMAT1132375918, String.valueOf(programCtx.getRc()).toCharArray()));
      //  cobolCode::STRING
      // X'C3C1D3D340E3D640C4E2D5E3C9C1D940C6C1C9D3C5C47A40D9C5E3E4D9D560C3D6C4C5407E40' DELIMITED
      // BY SIZE GD-INTEGER-DISP DELIMITED BY SIZE INTO GD-DISPLAY-LIT
      charArray = new ArrayList<char[]>();
      charArray.add(CONSTANTS.HEX_4);
      charArray.add(methodOut.getGdIntegerDisp());
      joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1));
      updated = updateString(methodOut.getGdDisplayLit(), joinCharArray);
      methodOut.setGdDisplayLit((char[]) updated.get("string"));
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
      // cobolCode::GO TO ZZZG-EXIT
      return methodOut;
      // cobolCodeEnds::GO TO ZZZG-EXIT
    }

    // *****
    //  cobolCode::MOVE GD-SQLCA-MSG-TEXT (1 : 240) TO GD-SQLCA-WORK-AREA
    methodIn
        .getGdGetDiagArea()
        .replace(
            methodIn.getGdGetDiagArea() /*parent*/,
            181 /*fromOffset - (gdSqlcaWorkArea) */,
            240 /*fromLen*/,
            2585 /*toOffset - (gdSqlcaMsgText) */,
            240 /*toLen*/);
    //  cobolCode::PERFORM ZZZH-PRINT-SQLCA THRU ZZZH-EXIT
    zzzhPrintSqlca(programCtx.getZzzhPrintSqlcaInCtx()); /*ZZZH-PRINT-SQLCA*/
    //  cobolCode::MOVE GD-SQLCA-MSG-TEXT (241 : 240) TO GD-SQLCA-WORK-AREA
    methodIn
        .getGdGetDiagArea()
        .replace(
            methodIn.getGdGetDiagArea() /*parent*/,
            181 + 241 - 1 /*fromOffset - (gdSqlcaWorkArea) */,
            240 /*fromLen*/,
            2585 /*toOffset - (gdSqlcaMsgText) */,
            240 /*toLen*/);
    //  cobolCode::PERFORM ZZZH-PRINT-SQLCA THRU ZZZH-EXIT
    zzzhPrintSqlca(programCtx.getZzzhPrintSqlcaInCtx()); /*ZZZH-PRINT-SQLCA*/
    //  cobolCode::MOVE GD-SQLCA-MSG-TEXT (481 : 240) TO GD-SQLCA-WORK-AREA
    methodIn
        .getGdGetDiagArea()
        .replace(
            methodIn.getGdGetDiagArea() /*parent*/,
            181 + 481 - 1 /*fromOffset - (gdSqlcaWorkArea) */,
            240 /*fromLen*/,
            2585 /*toOffset - (gdSqlcaMsgText) */,
            240 /*toLen*/);
    //  cobolCode::PERFORM ZZZH-PRINT-SQLCA THRU ZZZH-EXIT
    zzzhPrintSqlca(programCtx.getZzzhPrintSqlcaInCtx()); /*ZZZH-PRINT-SQLCA*/
    //  cobolCode::MOVE GD-SQLCA-MSG-TEXT (721 : 240) TO GD-SQLCA-WORK-AREA
    methodIn
        .getGdGetDiagArea()
        .replace(
            methodIn.getGdGetDiagArea() /*parent*/,
            181 + 721 - 1 /*fromOffset - (gdSqlcaWorkArea) */,
            240 /*fromLen*/,
            2585 /*toOffset - (gdSqlcaMsgText) */,
            240 /*toLen*/);
    //  cobolCode::PERFORM ZZZH-PRINT-SQLCA THRU ZZZH-EXIT
    zzzhPrintSqlca(programCtx.getZzzhPrintSqlcaInCtx()); /*ZZZH-PRINT-SQLCA*/
    //  cobolCode::MOVE GD-SQLCA-MSG-TEXT (961 : 240) TO GD-SQLCA-WORK-AREA
    methodIn
        .getGdGetDiagArea()
        .replace(
            methodIn.getGdGetDiagArea() /*parent*/,
            181 + 961 - 1 /*fromOffset - (gdSqlcaWorkArea) */,
            240 /*fromLen*/,
            2585 /*toOffset - (gdSqlcaMsgText) */,
            240 /*toLen*/);
    //  cobolCode::PERFORM ZZZH-PRINT-SQLCA THRU ZZZH-EXIT
    zzzhPrintSqlca(programCtx.getZzzhPrintSqlcaInCtx()); /*ZZZH-PRINT-SQLCA*/
    //  cobolCode::MOVE GD-SQLCA-MSG-TEXT (1201 : 240) TO GD-SQLCA-WORK-AREA
    methodIn
        .getGdGetDiagArea()
        .replace(
            methodIn.getGdGetDiagArea() /*parent*/,
            181 + 1201 - 1 /*fromOffset - (gdSqlcaWorkArea) */,
            240 /*fromLen*/,
            2585 /*toOffset - (gdSqlcaMsgText) */,
            240 /*toLen*/);
    //  cobolCode::PERFORM ZZZH-PRINT-SQLCA THRU ZZZH-EXIT
    zzzhPrintSqlca(programCtx.getZzzhPrintSqlcaInCtx()); /*ZZZH-PRINT-SQLCA*/
    //  cobolCode::MOVE GD-SQLCA-MSG-TEXT (1441 : 240) TO GD-SQLCA-WORK-AREA
    methodIn
        .getGdGetDiagArea()
        .replace(
            methodIn.getGdGetDiagArea() /*parent*/,
            181 + 1441 - 1 /*fromOffset - (gdSqlcaWorkArea) */,
            240 /*fromLen*/,
            2585 /*toOffset - (gdSqlcaMsgText) */,
            240 /*toLen*/);
    //  cobolCode::PERFORM ZZZH-PRINT-SQLCA THRU ZZZH-EXIT
    zzzhPrintSqlca(programCtx.getZzzhPrintSqlcaInCtx()); /*ZZZH-PRINT-SQLCA*/
    //  cobolCode::MOVE GD-SQLCA-MSG-TEXT (1681 : 240) TO GD-SQLCA-WORK-AREA
    methodIn
        .getGdGetDiagArea()
        .replace(
            methodIn.getGdGetDiagArea() /*parent*/,
            181 + 1681 - 1 /*fromOffset - (gdSqlcaWorkArea) */,
            240 /*fromLen*/,
            2585 /*toOffset - (gdSqlcaMsgText) */,
            240 /*toLen*/);
    //  cobolCode::PERFORM ZZZH-PRINT-SQLCA THRU ZZZH-EXIT
    zzzhPrintSqlca(programCtx.getZzzhPrintSqlcaInCtx()); /*ZZZH-PRINT-SQLCA*/
    //  cobolCode::MOVE GD-SQLCA-MSG-TEXT (1921 : 240) TO GD-SQLCA-WORK-AREA
    methodIn
        .getGdGetDiagArea()
        .replace(
            methodIn.getGdGetDiagArea() /*parent*/,
            181 + 1921 - 1 /*fromOffset - (gdSqlcaWorkArea) */,
            240 /*fromLen*/,
            2585 /*toOffset - (gdSqlcaMsgText) */,
            240 /*toLen*/);
    //  cobolCode::PERFORM ZZZH-PRINT-SQLCA THRU ZZZH-EXIT
    zzzhPrintSqlca(programCtx.getZzzhPrintSqlcaInCtx()); /*ZZZH-PRINT-SQLCA*/
    //  cobolCode::MOVE GD-SQLCA-MSG-TEXT (2161 : 240) TO GD-SQLCA-WORK-AREA
    methodIn
        .getGdGetDiagArea()
        .replace(
            methodIn.getGdGetDiagArea() /*parent*/,
            181 + 2161 - 1 /*fromOffset - (gdSqlcaWorkArea) */,
            240 /*fromLen*/,
            2585 /*toOffset - (gdSqlcaMsgText) */,
            240 /*toLen*/);
    //  cobolCode::PERFORM ZZZH-PRINT-SQLCA THRU ZZZH-EXIT
    zzzhPrintSqlca(programCtx.getZzzhPrintSqlcaInCtx()); /*ZZZH-PRINT-SQLCA*/

    return methodOut;
  }
  /**
   * zzzhPrintSqlca This method is derived from COBOL Paragraph - ZZZH-PRINT-SQLCA COBOL Cyclomatic
   * complexity - 5 Input :
   *
   * <p>- gdSqlcaWorkArea COBOL Name: GD-SQLCA-WORK-AREA
   *
   * <p>Output :
   *
   * <p>- gdDisplayLit COBOL Name: GD-DISPLAY-LIT - gdSqlcaWorkArea COBOL Name: GD-SQLCA-WORK-AREA
   *
   * @throws CFException
   */
  @Override
  public ZzzhPrintSqlcaOutCtx zzzhPrintSqlca(ZzzhPrintSqlcaInCtx methodIn) throws Exception {

    // *****************************************************************
    // * Print sqlca
    // *****************************************************************
    // Added variable to get the program context in place.
    DphpctsqCtx programCtx = methodIn.getDphpctsqCtx();
    // Added variable to get the output context in place.
    ZzzhPrintSqlcaOutCtx methodOut = methodIn.getZzzhPrintSqlcaOutCtx();
    //  cobolCode::IF GD-SQLCA-WORK-AREA (1 : 80) NOT = SPACE
    if (!(Field.allSpaces(methodOut.getGdSqlcaWorkArea(), (0 /*start*/), 80 /*len*/))) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  cobolCode::MOVE GD-SQLCA-WORK-AREA (1 : 80) TO GD-DISPLAY-LIT
      methodOut
          .getGdGetDiagArea()
          .replace(
              methodOut.getGdGetDiagArea() /*parent*/,
              2585 /*fromOffset - (gdDisplayLit) */,
              80 /*fromLen*/,
              85 /*toOffset - (gdSqlcaWorkArea) */,
              80 /*toLen*/);
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
    }

    // *****
    //  cobolCode::IF GD-SQLCA-WORK-AREA (81 : 70) NOT = SPACE
    if (!(Field.allSpaces(methodOut.getGdSqlcaWorkArea(), (80 /*start*/), 70 /*len*/))) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  cobolCode::MOVE GD-SQLCA-WORK-AREA (81 : 70) TO GD-DISPLAY-LIT (11 : 70)
      methodOut
          .getGdGetDiagArea()
          .replace(
              methodOut.getGdGetDiagArea() /*parent*/,
              2585 + 81 - 1 /*fromOffset - (gdDisplayLit) */,
              70 /*fromLen*/,
              85 + 11 - 1 /*toOffset - (gdSqlcaWorkArea) */,
              70 /*toLen*/);
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
    }

    // *****
    //  cobolCode::IF GD-SQLCA-WORK-AREA (151 : 70) NOT = SPACE
    if (!(Field.allSpaces(methodOut.getGdSqlcaWorkArea(), (150 /*start*/), 70 /*len*/))) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  cobolCode::MOVE GD-SQLCA-WORK-AREA (151 : 70) TO GD-DISPLAY-LIT (11 : 70)
      methodOut
          .getGdGetDiagArea()
          .replace(
              methodOut.getGdGetDiagArea() /*parent*/,
              2585 + 151 - 1 /*fromOffset - (gdDisplayLit) */,
              70 /*fromLen*/,
              85 + 11 - 1 /*toOffset - (gdSqlcaWorkArea) */,
              70 /*toLen*/);
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
    }

    // *****
    //  cobolCode::IF GD-SQLCA-WORK-AREA (221 : 20) NOT = SPACE
    if (!(Field.allSpaces(methodOut.getGdSqlcaWorkArea(), (220 /*start*/), 20 /*len*/))) {
      //  cobolCode::MOVE SPACE TO GD-DISPLAY-LIT
      methodOut.setGdDisplayLit(CONSTANTS.SPACE_80);
      //  cobolCode::MOVE GD-SQLCA-WORK-AREA (221 : 20) TO GD-DISPLAY-LIT (11 : 20)
      methodOut
          .getGdGetDiagArea()
          .replace(
              methodOut.getGdGetDiagArea() /*parent*/,
              2585 + 221 - 1 /*fromOffset - (gdDisplayLit) */,
              20 /*fromLen*/,
              85 + 11 - 1 /*toOffset - (gdSqlcaWorkArea) */,
              20 /*toLen*/);
      //  cobolCode::PERFORM ZZZF-DISPLAY THRU ZZZF-EXIT
      zzzfDisplay(programCtx.getZzzfDisplayInCtx()); /*ZZZF-DISPLAY*/
    }

    return methodOut;
  }
  /**
   * zzzfDisplay This method is derived from COBOL Paragraph - ZZZF-DISPLAY COBOL Cyclomatic
   * complexity - 4 Input :
   *
   * <p>- gdDisplayLit COBOL Name: GD-DISPLAY-LIT
   *
   * <p>Output :
   *
   * <p>- tally COBOL Name: WS-TALLY - message COBOL Name: WS-MESSAGE - gdDisplayLit COBOL Name:
   * GD-DISPLAY-LIT - wtdqMessage COBOL Name: WTDQ-MESSAGE
   *
   * @throws CFException
   */
  @Override
  public ZzzfDisplayOutCtx zzzfDisplay(ZzzfDisplayInCtx methodIn) throws Exception {
    // Declare local variables used in the method
    ArrayList<char[]> charArray = new ArrayList<char[]>();
    char[] joinCharArray = null;
    Map<String, Object> updated = null;
    // End of variable declaration

    // Added variable to get the program context in place.
    DphpctsqCtx programCtx = methodIn.getDphpctsqCtx();
    // Added variable to get the output context in place.
    ZzzfDisplayOutCtx methodOut = methodIn.getZzzfDisplayOutCtx();
    //  cobolCode::IF GD-DISPLAY-LIT (1 : 5) = '*****' OR GD-DISPLAY-LIT = SPACES
    if (Field.compareChar(
            methodOut.getGdDisplayLit(),
            CONSTANTS.LITERAL_STR5_,
            (0 /*start*/),
            5 /*left len*/,
            5 /*right len*/)
        || (allSpaces(methodOut.getGdDisplayLit()))) {
      // cobolCode::GO TO ZZZF-EXIT
      return methodOut;
      // cobolCodeEnds::GO TO ZZZF-EXIT
    }
    methodOut.setTally((short) 0);
    //  cobolCode::INSPECT GD-DISPLAY-LIT TALLYING WS-TALLY FOR LEADING SPACE
    tallyCount = tallyLeading(methodOut.getGdDisplayLit(), CONSTANTS.SPACE);
    methodOut.setTally((short) (methodOut.getTally() + tallyCount));
    //  cobolCode::MOVE GD-DISPLAY-LIT ( WS-TALLY + 1 : ) TO WS-MESSAGE
    methodOut.setMessage(
        substring(
            methodOut.getGdDisplayLit(),
            (methodOut.getTally() + 1 - 1),
            (methodOut.getTally() + 1 + 79)));
    //  cobolCode::STRING WS-MESSAGE DELIMITED BY '  ' '|' DELIMITED BY SIZE INTO WTDQ-MESSAGE
    charArray = new ArrayList<char[]>();
    charArray.add(splitFirst(methodOut.getMessage(), CONSTANTS.SPACE_2));
    charArray.add(CONSTANTS.LITERAL_36552);
    joinCharArray = Field.mergeArrays(charArray.get(0), charArray.get(1));
    updated = updateString(methodOut.getWtdqMessage(), joinCharArray);
    methodOut.setWtdqMessage((char[]) updated.get("string"));

    return methodOut;
  }

  public int call(ProgramContext ctx, Object[] params) throws Exception {
    DphpctsqCtx programCtx = (DphpctsqCtx) ctx;

    int len = params.length;
    if (len > 1 && params[1] != null) programCtx.getDfhcommareaGroup().set((Field) params[1]);
    // invoke the process and return rc
    return process(programCtx);
  }

  public int call(ProgramContext ctx, Field... parameters) throws Exception {
    DphpctsqCtx programCtx = (DphpctsqCtx) ctx;
    for (int index = 0; index < parameters.length; index++) {
      switch (index) {
        case 1:
          if (parameters[index] != null) {
            if (parameters[index] instanceof DfhcommareaGroup) {
              programCtx.setDfhcommareaGroup((DfhcommareaGroup) parameters[index]);
            } else {
              programCtx.getDfhcommareaGroup().set(parameters[index]);
            }
          }

          break;
      }
    }
    return process(programCtx);
  }

  public void setFromDsntiar(DphpctsqCtx programCtx, Object[] params) {
    int len = params.length;
    if (len > 0)
      if (params[0] instanceof Field)
        programCtx.getSqlca().setString(((Field) params[0]).toCharArray());
      else programCtx.getSqlca().setString((char[]) params[0]);
    if (len > 1)
      if (params[1] instanceof Field)
        programCtx.getGdGetDiagArea().getGdSqlcaMsg().setString(((Field) params[1]).toCharArray());
      else programCtx.getGdGetDiagArea().getGdSqlcaMsg().setString((char[]) params[1]);
    if (len > 2)
      if (params[2] instanceof Field)
        programCtx
            .getGdGetDiagArea()
            .getGdSqlcaLineSizeGroup()
            .setString(((Field) params[2]).toCharArray());
      else programCtx.getGdGetDiagArea().getGdSqlcaLineSizeGroup().setString((char[]) params[2]);
  }

  /**
   * This method calls DsntiarUtil class and prepare error message in a similar format as the
   * mainframe output.
   *
   * @param sqlca
   * @param errorMessage
   * @param messageLenField
   */
  private void db2ErrorLogger(Sqlca sqlca, GdSqlcaMsg errorMessage, Field messageLenField)
      throws CFException {
    List<String> list = null;
    // convert Field to int for the length
    int messageLen = 0;
    if (messageLenField != null) {
      messageLen = messageLenField.getInt();
    }
    list =
        DsntiarUtil.dsntiarInfo(
            sqlca.getSqlcode(),
            sqlca.getSqlext().getSqlstate(),
            sqlca.getSqlerrp(),
            sqlca.getSqlerrm().getSqlerrmc(),
            sqlca.getSqlerrd(),
            messageLen);
    if (list != null && !list.isEmpty()) {
      errorMessage.setGdSqlcaMsgText(list.get(0).toCharArray());
    }
  }
}
