package com.cloudframe.app.business.impl;
/*
 *00***************************************************************
 *00    licensed materials - property of united health group      *
 *00                                                              *
 *00 s m e   r e v i e w e d - comments have been reviewed by sme *
 *00                                                              *
 *00***************************************************************
 *10***************************************************************
 *10  program name       :  d5427scn.                             *
 *10  business function  :  db2 data service module.              *
 *10  designed by        :  n/a.                                  *
 *10  programmed by      :  sarala                                *
 *10  date coded         :  rel q4-10.                            *
 *10  type               :  online - called thru onlines.         *
 *10***************************************************************
 *20***************************************************************
 *20  major program process:                                      *
 *20                                                              *
 *20  the purpose of new module is to query the srvc_cd_trans_tbl *
 *20  db2 table to retrieve the service code number               *
 *20                                                              *
 *20***************************************************************
 *30***************************************************************
 *30  program change log:                                         *
 *30                                                              *
 *30  release  sprf    programmer   description                   *
 *30  -----    -----   -------      ----------------------------- *
 *30  relq410  #33120  sarala       initial build                 *
 *30                                                              *
 *30  rel1906          manikanta    for mdtr-2019-0507-1a-tops    *
 *30                   srikakulapu  modify code to leverage       *
 *30                                memory cache   first,         *
 *30                                instead of selected sql's.    *
 *30***************************************************************
 *40***************************************************************
 *40  external called programs:                                   *
 *40                                                              *
 *40  name          description              call/link/xctl/start *
 *40  ----          -----------              -------------------- *
 *40  n/a           n/a                      n/a                  *
 *40***************************************************************
 *50***************************************************************
 *50  return codes:                                               *
 *50                                                              *
 *50   sql codes for the db2 operation.                           *
 *50                                                              *
 *50   copybook   description                                     *
 *50   --------   --------------------------------------------- - *
 *50   vysqlcds   sql codes for the db2 operation.                *
 *50                                                              *
 *50***************************************************************
 *60***************************************************************
 *60  tables and access types:                                    *
 *60                                                              *
 *60  name                          type           access         *
 *60  --------------                ----           -------        *
 *60  srvc_cd_trans_tbl             db2            read           *
 *60***************************************************************
 */

import com.cloudframe.app.business.D5427scn;
import com.cloudframe.app.cics.TransactionManager;
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.common.CommonProcess;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.d5427scn.*;
import com.cloudframe.app.dto.d5427scn.CacheTsqRecord;
import com.cloudframe.app.dto.d5427scn.D5427scnCtx;
import com.cloudframe.app.dto.d5427scn.D5427scnCtx.*;
import com.cloudframe.app.dto.d5427scn.DfhcommareaGroup;
import com.cloudframe.app.dto.d5427scn.DsmCallArea;
import com.cloudframe.app.dto.d5427scn.ScnDataArea;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.repository.D5427scnRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("d5427scn")
public class D5427scnImpl extends CommonProcess implements D5427scn {

  Logger logger = LoggerFactory.getLogger(D5427scnImpl.class);

  @Value("${D5427SCN.dbQualifier:}")
  private String dbQualifier;

  @Autowired
  @Qualifier("d5427scnRepository")
  D5427scnRepository d5427scnRepository;

  public com.cloudframe.app.rest.d5427scn.DfhcommareaGroup setCommarea(
      com.cloudframe.app.rest.d5427scn.DfhcommareaGroup inputCommarea) throws Exception {
    D5427scnCtx programCtx = new GlobalExecutorCtx().getContext(D5427scnCtx.class);
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
  public int process(D5427scnCtx programCtx) throws Exception {
    try {
      setCodePage("1047");
      // Reset program ended flag
      programCtx.setProgramEnded(false);
      db2Base.reset("D5427SCN", dbQualifier, true /*use Dynamic SQL*/);
      // Added variable to get the output context in place.
      ProcessInCtx methodIn = programCtx.getProcessInCtx();
      //  cobolCode::PERFORM 0000-MAIN-LINE
      mainLine(programCtx.getMainLineInCtx()); /*0000-MAIN-LINE SECTION*/
      if (programCtx.isProgramEnded()) {
        return programCtx.getRc();
      }
      exit(programCtx); /*0000-EXIT*/
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
   * mainLine This method is derived from COBOL Paragraph - 0000-MAIN-LINE SECTION COBOL Cyclomatic
   * complexity - 3 Input :
   *
   * <p>- dsmReturnCode COBOL Name: DSM-RETURN-CODE - scnReqClngProg COBOL Name: SCN-REQ-CLNG-PROG -
   * dsmPgmName COBOL Name: WS-DSM-PGM-NAME - dsmFuncCd COBOL Name: DSM-FUNC-CD
   *
   * <p>Output :
   *
   * <p>- dsmErrClngPgmName COBOL Name: DSM-ERR-CLNG-PGM-NAME - scnReqClngProg COBOL Name:
   * SCN-REQ-CLNG-PROG - dsmErrPgmName COBOL Name: DSM-ERR-PGM-NAME - dsmPgmName COBOL Name:
   * WS-DSM-PGM-NAME
   *
   * @throws CFException
   */
  @Override
  public MainLineOutCtx mainLine(MainLineInCtx methodIn) throws Exception {
    // Added variable to get the program context in place.
    D5427scnCtx programCtx = methodIn.getD5427scnCtx();
    // Added variable to get the output context in place.
    MainLineOutCtx methodOut = methodIn.getMainLineOutCtx();
    //  cobolCode::PERFORM 1000-INITIALIZE
    initialize(programCtx.getInitializeInCtx()); /*1000-INITIALIZE SECTION*/
    if (programCtx.isProgramEnded()) {
      return methodOut;
    }
    //  cobolCode::IF DSM-EDIT-ERROR
    if (methodIn.isDsmEditError()) {
      //  cobolCode::MOVE SCN-REQ-CLNG-PROG TO DSM-ERR-CLNG-PGM-NAME
      methodOut.setDsmErrClngPgmName(methodOut.getScnReqClngProg());
      //  cobolCode::MOVE WS-DSM-PGM-NAME TO DSM-ERR-PGM-NAME
      methodOut.setDsmErrPgmName(methodOut.getDsmPgmName());
    }
    //  cobolCode::ELSE
    else {
      //  cobolCode::IF DSM-FUNC-CD = 01
      if ((methodIn.getDsmFuncCd() == 1)) {
        //  cobolCode::PERFORM 3000-GET-SVC-CD-NBR
        getSvcCdNbr(programCtx.getGetSvcCdNbrInCtx()); /*3000-GET-SVC-CD-NBR SECTION*/
        if (programCtx.isProgramEnded()) {
          return methodOut;
        }
      }
    }

    return methodOut;
  }
  /**
   * exit This method is derived from COBOL Paragraph - 0000-EXIT COBOL Cyclomatic complexity - 3
   * Input : None
   *
   * <p>Output : None
   *
   * @throws CFException
   */
  @Override
  public void exit(D5427scnCtx programCtx) throws Exception {
    //  cobolCode::GOBACK
    setNotLogged(false); // no need to log, it is a normal termination
    programCtx.setProgramEnded(true);
    return;
  }
  /**
   * initialize This method is derived from COBOL Paragraph - 1000-INITIALIZE SECTION COBOL
   * Cyclomatic complexity - 18 Input :
   *
   * <p>- dsmFuncCd COBOL Name: DSM-FUNC-CD - scnReqSrvcCd COBOL Name: SCN-REQ-SRVC-CD - scnReqEffDt
   * COBOL Name: SCN-REQ-EFF-DT - scnReqCancDt COBOL Name: SCN-REQ-CANC-DT - scnReqClngProg COBOL
   * Name: SCN-REQ-CLNG-PROG
   *
   * <p>Output :
   *
   * <p>- dclsrvcCdTransTbl COBOL Name: DCLSRVC-CD-TRANS-TBL - scnRetArea COBOL Name: SCN-RET-AREA -
   * dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmLogArea COBOL Name: DSM-LOG-AREA -
   * dsmSqlErrorLevel COBOL Name: DSM-SQL-ERROR-LEVEL - dsmEditErrorField COBOL Name:
   * DSM-EDIT-ERROR-FIELD - dsmEditErrorValueTxt COBOL Name: DSM-EDIT-ERROR-VALUE-TXT - dsmFuncCd
   * COBOL Name: DSM-FUNC-CD - scnReqSrvcCd COBOL Name: SCN-REQ-SRVC-CD - scnReqEffDt COBOL Name:
   * SCN-REQ-EFF-DT - scnReqCancDt COBOL Name: SCN-REQ-CANC-DT - scnReqClngProg COBOL Name:
   * SCN-REQ-CLNG-PROG
   *
   * @throws CFException
   */
  @Override
  public InitializeOutCtx initialize(InitializeInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 1000-Initialize                                              *
    // *81                                                              *
    // *81 business function:                                           *
    // *81 initialization para.                                         *
    // *81                                                              *
    // *81***************************************************************
    // *82***************************************************************
    // *82 1000-initialize.                                             *
    // *82                                                              *
    // *82 1. initialize the dclgen fields and return area and request  *
    // *82    field validation                                          *
    // *82                                                              *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427scnCtx programCtx = methodIn.getD5427scnCtx();
    // Added variable to get the output context in place.
    InitializeOutCtx methodOut = methodIn.getInitializeOutCtx();
    //  cobolCode::INITIALIZE DCLSRVC-CD-TRANS-TBL SCN-RET-AREA DSM-RETURN-CODE DSM-LOG-AREA
    methodOut.getDclsrvcCdTransTbl().initialize();
    methodOut.getScnRetArea().initialize();
    methodOut.setDsmReturnCode(0);
    methodOut.getDsmLogArea().initialize();
    //  cobolCode::IF DSM-FUNC-CD = 01
    //  cobolCode::ELSE
    if ((methodOut.getDsmFuncCd() != 1)) {
      //  cobolCode::SET DSM-EDIT-ERROR TO TRUE
      methodOut.setDsmEditErrorTrue();

      //  cobolCode::SET DSM-PROCESS-ERROR TO TRUE
      methodOut.setDsmProcessErrorTrue();

      //  cobolCode::MOVE 'DSM-FUNC-CD' TO DSM-EDIT-ERROR-FIELD
      methodOut.setDsmEditErrorField(CONSTANTS.LITERAL_DSM_MN2_FUNCCD_B19_);
      //  cobolCode::MOVE DSM-FUNC-CD TO DSM-EDIT-ERROR-VALUE-TXT
      methodOut
          .getDsmEditErrorValueTxt()
          .setString(String.valueOf(methodOut.getDsmFuncCdString()).toCharArray());
      // cobolCode::GO TO 1000-EXIT
      return methodOut;
      // cobolCodeEnds::GO TO 1000-EXIT
    }
    //  cobolCode::IF SCN-REQ-SRVC-CD = SPACES OR ZEROES OR LOW-VALUES OR HIGH-VALUES
    if ((allSpaces(methodOut.getScnReqSrvcCd()))
        || (allZeros(methodOut.getScnReqSrvcCd())) /*  ==  zeros*/
        || (checkLowValue(methodOut.getScnReqSrvcCd()))
        || (isHighValue(methodOut.getScnReqSrvcCd()))) {
      //  cobolCode::SET DSM-EDIT-ERROR TO TRUE
      methodOut.setDsmEditErrorTrue();

      //  cobolCode::MOVE 'SCN-REQ-SRVC-CD  ' TO DSM-EDIT-ERROR-FIELD
      methodOut.setDsmEditErrorField(CONSTANTS.LITERAL_SCN_MN3_REQSRVCCD_B15_);
      //  cobolCode::MOVE SCN-REQ-SRVC-CD TO DSM-EDIT-ERROR-VALUE-TXT
      methodOut.getDsmEditErrorValueTxt().setString(methodOut.getScnReqSrvcCd());
      // cobolCode::GO TO 1000-EXIT
      return methodOut;
      // cobolCodeEnds::GO TO 1000-EXIT
    }
    //  cobolCode::IF SCN-REQ-EFF-DT = SPACES OR ZEROES OR LOW-VALUES OR HIGH-VALUES
    if ((allSpaces(methodOut.getScnReqEffDt()))
        || (allZeros(methodOut.getScnReqEffDt())) /*  ==  zeros*/
        || (checkLowValue(methodOut.getScnReqEffDt()))
        || (isHighValue(methodOut.getScnReqEffDt()))) {
      //  cobolCode::SET DSM-EDIT-ERROR TO TRUE
      methodOut.setDsmEditErrorTrue();

      //  cobolCode::MOVE 'SCN-REQ-EFF-DT   ' TO DSM-EDIT-ERROR-FIELD
      methodOut.setDsmEditErrorField(CONSTANTS.LITERAL_SCN_MN3_REQEFFDT_B16_);
      //  cobolCode::MOVE SCN-REQ-EFF-DT TO DSM-EDIT-ERROR-VALUE-TXT
      methodOut.getDsmEditErrorValueTxt().setString(methodOut.getScnReqEffDt());
      // cobolCode::GO TO 1000-EXIT
      return methodOut;
      // cobolCodeEnds::GO TO 1000-EXIT
    }
    //  cobolCode::IF SCN-REQ-CANC-DT = SPACES OR ZEROES OR LOW-VALUES OR HIGH-VALUES
    if ((allSpaces(methodOut.getScnReqCancDt()))
        || (allZeros(methodOut.getScnReqCancDt())) /*  ==  zeros*/
        || (checkLowValue(methodOut.getScnReqCancDt()))
        || (isHighValue(methodOut.getScnReqCancDt()))) {
      //  cobolCode::SET DSM-EDIT-ERROR TO TRUE
      methodOut.setDsmEditErrorTrue();

      //  cobolCode::MOVE 'SCN-REQ-CANC-DT  ' TO DSM-EDIT-ERROR-FIELD
      methodOut.setDsmEditErrorField(CONSTANTS.LITERAL_SCN_MN3_REQCANCDT_B15_);
      //  cobolCode::MOVE SCN-REQ-CANC-DT TO DSM-EDIT-ERROR-VALUE-TXT
      methodOut.getDsmEditErrorValueTxt().setString(methodOut.getScnReqCancDt());
      // cobolCode::GO TO 1000-EXIT
      return methodOut;
      // cobolCodeEnds::GO TO 1000-EXIT
    }
    //  cobolCode::IF SCN-REQ-CLNG-PROG = SPACES OR ZEROES OR LOW-VALUES OR HIGH-VALUES
    if ((allSpaces(methodOut.getScnReqClngProg()))
        || (allZeros(methodOut.getScnReqClngProg())) /*  ==  zeros*/
        || (checkLowValue(methodOut.getScnReqClngProg()))
        || (isHighValue(methodOut.getScnReqClngProg()))) {
      //  cobolCode::SET DSM-EDIT-ERROR TO TRUE
      methodOut.setDsmEditErrorTrue();

      //  cobolCode::MOVE 'SCN-REQ-CLNG-PROG' TO DSM-EDIT-ERROR-FIELD
      methodOut.setDsmEditErrorField(CONSTANTS.LITERAL_SCN_MN3_REQCLNGPROG_B13_);
      //  cobolCode::MOVE SCN-REQ-CLNG-PROG TO DSM-EDIT-ERROR-VALUE-TXT
      methodOut.getDsmEditErrorValueTxt().setString(methodOut.getScnReqClngProg());
      // cobolCode::GO TO 1000-EXIT
      return methodOut;
      // cobolCodeEnds::GO TO 1000-EXIT
    }

    return methodOut;
  }
  /**
   * getSvcCdNbr This method is derived from COBOL Paragraph - 3000-GET-SVC-CD-NBR SECTION COBOL
   * Cyclomatic complexity - 8 Input :
   *
   * <p>- scnReqEffDt COBOL Name: SCN-REQ-EFF-DT - scnReqSrvcCd COBOL Name: SCN-REQ-SRVC-CD -
   * scnReqCancDt COBOL Name: SCN-REQ-CANC-DT - tsqCachePtr COBOL Name: TSQ-CACHE-PTR - sqlcode
   * COBOL Name: SQLCODE - svcaSrvcCdNbr COBOL Name: SVCA-SRVC-CD-NBR - dsmFuncCd COBOL Name:
   * DSM-FUNC-CD
   *
   * <p>Output :
   *
   * <p>- svcaEffDt COBOL Name: SVCA-EFF-DT - scnReqEffDt COBOL Name: SCN-REQ-EFF-DT - svcaSrvcCd
   * COBOL Name: SVCA-SRVC-CD - scnReqSrvcCd COBOL Name: SCN-REQ-SRVC-CD - svcaCancDt COBOL Name:
   * SVCA-CANC-DT - scnReqCancDt COBOL Name: SCN-REQ-CANC-DT - respCode COBOL Name: WS-RESP-CODE -
   * resp2Code COBOL Name: WS-RESP2-CODE - cacheScnKeyArea COBOL Name: CACHE-SCN-KEY-AREA -
   * csrchSrvcCd COBOL Name: CSRCH-SRVC-CD - csrchFoundSw COBOL Name: CSRCH-FOUND-SW - sqlcode_Ws
   * COBOL Name: WS-SQLCODE - dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL Name: SQLCODE -
   * scnRetSrvcCdNbr COBOL Name: SCN-RET-SRVC-CD-NBR - svcaSrvcCdNbr COBOL Name: SVCA-SRVC-CD-NBR -
   * dsmReturnCode COBOL Name: DSM-RETURN-CODE - dsmErrTblAction COBOL Name: DSM-ERR-TBL-ACTION -
   * dsmErrTblName COBOL Name: DSM-ERR-TBL-NAME - dsmErrSectnName COBOL Name: DSM-ERR-SECTN-NAME -
   * dsmEditErrorValueTxt COBOL Name: DSM-EDIT-ERROR-VALUE-TXT - dsmFuncCd COBOL Name: DSM-FUNC-CD -
   * dsmEditErrorField COBOL Name: DSM-EDIT-ERROR-FIELD
   *
   * @throws CFException
   */
  @Override
  public GetSvcCdNbrOutCtx getSvcCdNbr(GetSvcCdNbrInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 3000-Get-svc-cd-nbr.                                         *
    // *81                                                              *
    // *81 business function:                                           *
    // *81 retrieve data from service code translation table            *
    // *81***************************************************************
    // *82***************************************************************
    // *82 3000-get-svc-cd-nbr.                                         *
    // *82                                                              *
    // *82 1. populate the dclgen fields and perform the query to get   *
    // *82    the service code number from  srvc_cd_trans_tbl           *
    // *82                                                              *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427scnCtx programCtx = methodIn.getD5427scnCtx();
    // Added variable to get the output context in place.
    GetSvcCdNbrOutCtx methodOut = methodIn.getGetSvcCdNbrOutCtx();
    //  cobolCode::MOVE SCN-REQ-EFF-DT TO SVCA-EFF-DT
    methodOut.setSvcaEffDt(methodOut.getScnReqEffDt());
    //  cobolCode::MOVE SCN-REQ-SRVC-CD TO SVCA-SRVC-CD
    methodOut.setSvcaSrvcCd(methodOut.getScnReqSrvcCd());
    //  cobolCode::MOVE SCN-REQ-CANC-DT TO SVCA-CANC-DT
    methodOut.setSvcaCancDt(methodOut.getScnReqCancDt());

    // *EXEC CICS
    // *  READQ TS
    // *  QNAME (WS-TS-QUEUE-NAME)
    // *  INTO  (WS-CACHE-TSQ-RECORD)
    // *  LENGTH(LENGTH OF WS-CACHE-TSQ-RECORD)
    // *  ITEM  (WS-TSQ-ITEM1)
    // *  RESP (WS-RESP-CODE)
    // *  RESP2 (WS-RESP2-CODE)
    // *END-EXEC.
    //  cobolCode::READQ TS QNAME (WS-TS-QUEUE-NAME) INTO (WS-CACHE-TSQ-RECORD)
    // LENGTH(FUNCTION~LENGTH~WS-CACHE-TSQ-RECORD) ITEM (WS-TSQ-ITEM1) RESP (WS-RESP-CODE) RESP2
    // (WS-RESP2-CODE)

    // *EXEC CICS
    // *  READQ TS
    // *  QNAME (WS-TS-QUEUE-NAME)
    // *  INTO  (WS-CACHE-TSQ-RECORD)
    // *  LENGTH(LENGTH OF WS-CACHE-TSQ-RECORD)
    // *  ITEM  (WS-TSQ-ITEM1)
    // *  RESP (WS-RESP-CODE)
    // *  RESP2 (WS-RESP2-CODE)
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
    //  cobolCode::MOVE EIBRESP TO WS-RESP-CODE
    methodOut.setRespCode(programCtx.getCicsSession().getEibresp());
    //  cobolCode::MOVE EIBRESP2 TO WS-RESP2-CODE
    methodOut.setResp2Code(programCtx.getCicsSession().getEibresp2());
    //  cobolCode::EVALUATE WS-RESP-CODE
    switch (methodOut.getRespCode()) {
      case 0:
        //  cobolCode::SET ADDRESS OF CACHE-SCN-KEY-AREA TO TSQ-CACHE-PTR
        methodOut.getCacheScnKeyArea().set(getObject(methodIn.getTsqCachePtr()));

        //  cobolCode::MOVE SCN-REQ-SRVC-CD TO CSRCH-SRVC-CD
        methodOut.setCsrchSrvcCd(methodOut.getScnReqSrvcCd());
        //  cobolCode::PERFORM 3100-PROCESS-CACHE THRU 3100-EXIT
        processCache(programCtx.getProcessCacheInCtx()); /*3100-PROCESS-CACHE SECTION*/
        if (programCtx.isProgramEnded()) {
          return methodOut;
        }
        break;
      default:
        //  cobolCode::SET CSRCH-FOUND-SW-IS-OVERFLOW TO TRUE
        methodOut.setCsrchFoundSwIsOverflowTrue();
    }
    //  cobolCode::IF CSRCH-FOUND-SW-IS-OVERFLOW
    if (methodOut.isCsrchFoundSwIsOverflow()) {
      //  cobolCode::SELECT SRVC_CD_NBR FROM SRVC_CD_TRANS_TBL WHERE SRVC_CD = ? AND EFF_DT <= ? AND
      // CANC_DT >= ?
      d5427scnRepository.selectSrvcCdTransTbl(
          programCtx.getSqlca(), methodOut.getDclsrvcCdTransTbl());
    }
    //  cobolCode::MOVE SQLCODE TO WS-SQLCODE DSM-SQLCODE
    methodOut.setSqlcode_Ws(methodOut.getSqlcode());
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::EVALUATE TRUE
    if (methodOut.isSqlcodeOk()) {
      //  cobolCode::MOVE SVCA-SRVC-CD-NBR TO SCN-RET-SRVC-CD-NBR
      methodOut.setScnRetSrvcCdNbr(methodOut.getSvcaSrvcCdNbr());
    } else if (methodOut.isSqlcodeNotFound()) {
      //  cobolCode::MOVE SPACES TO SCN-RET-SRVC-CD-NBR
      methodOut.setScnRetSrvcCdNbr(CONSTANTS.SPACE_3);
      //  cobolCode::SET DSM-ENTRY-NOT-FND-INQ TO TRUE
      methodOut.setDsmEntryNotFndInqTrue();

    } else {
      //  cobolCode::SET DSM-DB2-ERROR TO TRUE
      methodOut.setDsmDb2ErrorTrue();

      //  cobolCode::MOVE 'SELECT' TO DSM-ERR-TBL-ACTION
      methodOut.setDsmErrTblAction(CONSTANTS.LITERAL_SELECT_B4_);
      //  cobolCode::MOVE 'SRVC_CD_TRANS_TBL' TO DSM-ERR-TBL-NAME
      methodOut.setDsmErrTblName(CONSTANTS.LITERAL_SRVC_CD_TRANS_TBL_B8_);
      //  cobolCode::MOVE '3000-GET-SVC-CD-NBR' TO DSM-ERR-SECTN-NAME
      methodOut.setDsmErrSectnName(CONSTANTS.LITERAL_5463002);
      //  cobolCode::MOVE DSM-FUNC-CD TO DSM-EDIT-ERROR-VALUE-TXT
      methodOut
          .getDsmEditErrorValueTxt()
          .setString(String.valueOf(methodOut.getDsmFuncCdString()).toCharArray());
      //  cobolCode::MOVE 'DSM-FUNC-CD' TO DSM-EDIT-ERROR-FIELD
      methodOut.setDsmEditErrorField(CONSTANTS.LITERAL_DSM_MN2_FUNCCD_B19_);
      //  cobolCode::PERFORM 7777-ERROR-PROCESS
      errorProcess(programCtx.getErrorProcessInCtx()); /*7777-ERROR-PROCESS SECTION*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    }

    return methodOut;
  }
  /**
   * processCache This method is derived from COBOL Paragraph - 3100-PROCESS-CACHE SECTION COBOL
   * Cyclomatic complexity - 7 Input :
   *
   * <p>- cacheKeyCnt COBOL Name: CACHE-KEY-CNT - cacheKeyArrayMax COBOL Name: CACHE-KEY-ARRAY-MAX -
   * csrchSearchKey COBOL Name: CSRCH-SEARCH-KEY - cacheKeyArea COBOL Name: CACHE-KEY-AREA -
   * binsrchFound COBOL Name: BINSRCH-FOUND - cacheEffDt COBOL Name: CACHE-EFF-DT - svcaEffDt COBOL
   * Name: SVCA-EFF-DT - cacheCancDt COBOL Name: CACHE-CANC-DT - svcaCancDt COBOL Name: SVCA-CANC-DT
   * - cacheKeyNdx COBOL Name: CACHE-KEY-NDX - cacheSrvcCdNbr COBOL Name: CACHE-SRVC-CD-NBR
   *
   * <p>Output :
   *
   * <p>- csrchFoundSw COBOL Name: CSRCH-FOUND-SW - sqlcode COBOL Name: SQLCODE - svcaSrvcCdNbr
   * COBOL Name: SVCA-SRVC-CD-NBR - cacheSrvcCdNbr COBOL Name: CACHE-SRVC-CD-NBR
   *
   * @throws CFException
   */
  @Override
  public ProcessCacheOutCtx processCache(ProcessCacheInCtx methodIn) throws Exception {
    // Added variable to get the program context in place.
    D5427scnCtx programCtx = methodIn.getD5427scnCtx();
    // Added variable to get the output context in place.
    ProcessCacheOutCtx methodOut = methodIn.getProcessCacheOutCtx();
    //  cobolCode::IF CACHE-KEY-CNT = CACHE-KEY-ARRAY-MAX AND CSRCH-SEARCH-KEY > CACHE-KEY-AREA (
    // CACHE-KEY-CNT )
    if ((methodIn.getCacheKeyCnt() == methodIn.getCacheKeyArrayMax())
        && compareChars(
                methodIn.getCsrchSearchKey(),
                methodIn.getCacheKeyArea(methodIn.getCacheKeyCnt() - 1))
            > 0) {
      //  cobolCode::SET CSRCH-FOUND-SW-IS-OVERFLOW TO TRUE
      methodOut.setCsrchFoundSwIsOverflowTrue();

    }
    //  cobolCode::ELSE
    else {
      //  cobolCode::PERFORM 3200-SEARCH-CACHE THRU 3200-EXIT
      searchCache(programCtx.getSearchCacheInCtx()); /*3200-SEARCH-CACHE SECTION*/
      //  cobolCode::EVALUATE TRUE
      if (methodIn.isBinsrchFoundIsN()) {
        //  cobolCode::SET CSRCH-FOUND-SW-IS-NO TO TRUE
        methodOut.setCsrchFoundSwIsNoTrue();

        methodOut.setSqlcode(100);
      } else if (methodIn.isBinsrchFoundIsY()) {
        //  cobolCode::IF CACHE-EFF-DT ( CACHE-KEY-NDX ) <= SVCA-EFF-DT AND CACHE-CANC-DT (
        // CACHE-KEY-NDX ) >= SVCA-CANC-DT
        if (compareChars(
                    methodIn.getCacheEffDt(methodIn.getCacheKeyNdx() - 1), methodIn.getSvcaEffDt())
                <= 0
            && compareChars(
                    methodIn.getCacheCancDt(methodIn.getCacheKeyNdx() - 1),
                    methodIn.getSvcaCancDt())
                >= 0) {
          //  cobolCode::SET CSRCH-FOUND-SW-IS-YES TO TRUE
          methodOut.setCsrchFoundSwIsYesTrue();

          methodOut.setSqlcode(0);
          //  cobolCode::MOVE CACHE-SRVC-CD-NBR ( CACHE-KEY-NDX ) TO SVCA-SRVC-CD-NBR
          methodOut.setSvcaSrvcCdNbr(methodOut.getCacheSrvcCdNbr(methodIn.getCacheKeyNdx() - 1));
        }
        //  cobolCode::ELSE
        else {
          //  cobolCode::SET CSRCH-FOUND-SW-IS-NO TO TRUE
          methodOut.setCsrchFoundSwIsNoTrue();

          methodOut.setSqlcode(100);
        }
      }
    }

    return methodOut;
  }
  /**
   * searchCache This method is derived from COBOL Paragraph - 3200-SEARCH-CACHE SECTION COBOL
   * Cyclomatic complexity - 7 Input :
   *
   * <p>- cacheKeyCnt COBOL Name: CACHE-KEY-CNT - cacheKeyArea COBOL Name: CACHE-KEY-AREA -
   * csrchSearchKey COBOL Name: CSRCH-SEARCH-KEY
   *
   * <p>Output :
   *
   * <p>- binsrchHigh COBOL Name: BINSRCH-HIGH - cacheKeyCnt COBOL Name: CACHE-KEY-CNT -
   * binsrchFound COBOL Name: BINSRCH-FOUND - binsrchLow COBOL Name: BINSRCH-LOW - binsrchMid COBOL
   * Name: BINSRCH-MID - cacheKeyNdx COBOL Name: CACHE-KEY-NDX
   *
   * @throws CFException
   */
  @Override
  public SearchCacheOutCtx searchCache(SearchCacheInCtx methodIn) throws Exception {
    // Added variable to get the program context in place.
    D5427scnCtx programCtx = methodIn.getD5427scnCtx();
    // Added variable to get the output context in place.
    SearchCacheOutCtx methodOut = methodIn.getSearchCacheOutCtx();
    methodOut.setBinsrchHigh(methodOut.getCacheKeyCnt());
    //  cobolCode::SET BINSRCH-FOUND-IS-N TO TRUE
    methodOut.setBinsrchFoundIsNTrue();

    // * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
    // *                                                               *
    // *    This area is used in conjunction with the binsrchw         *
    // *    copy member to implement a binary search. this binary      *
    // *    search only works with a single key. if you have more      *
    // *    than one key field, then create a group level with all     *
    // *    the search keys under that group level.                    *
    // *                                                               *
    // *    also for maximum performance make sure that you use        *
    // *    the "trunc(opt)" compiler option.                          *
    // *                                                               *
    // *    ====> you must set :binsrch:-hi to the number of entries   *
    // *          that you have loaded into the array that you wish    *
    // *          to search.                                           *
    // *                                                               *
    // *    this copy member is used to search an array which is       *
    // *    in "ascending sequence".                                   *
    // *                                                               *
    // * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *

    // * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
    // *                                                               *
    // *    This area is used in conjunction with the binsrchw         *
    // *    copy member to implement a binary search. this binary      *
    // *    search only works with a single key. if you have more      *
    // *    than one key field, then create a group level with all     *
    // *    the search keys under that group level.                    *
    // *                                                               *
    // *    also for maximum performance make sure that you use        *
    // *    the "trunc(opt)" compiler option.                          *
    // *                                                               *
    // *    ====> you must set :binsrch:-hi to the number of entries   *
    // *          that you have loaded into the array that you wish    *
    // *          to search.                                           *
    // *                                                               *
    // *    this copy member is used to search an array which is       *
    // *    in "ascending sequence".                                   *
    // *                                                               *
    // * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
    //  LITERAL_N = 'N'
    methodOut.setBinsrchFound(CONSTANTS.LITERAL_N);
    //  cobolCode::IF CACHE-KEY-AREA (1) > CSRCH-SEARCH-KEY OR CACHE-KEY-AREA ( BINSRCH-HIGH ) <
    // CSRCH-SEARCH-KEY
    //  cobolCode::ELSE
    if (compareChars(methodIn.getCacheKeyArea(0), methodIn.getCsrchSearchKey()) <= 0
        && compareChars(
                methodIn.getCacheKeyArea(methodOut.getBinsrchHigh() - 1),
                methodIn.getCsrchSearchKey())
            >= 0) {

      // * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
      // *                                                               *
      // *    Here we are doing the binary search.                       *
      // *                                                               *
      // * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
      //  cobolCode::MOVE +1 TO BINSRCH-LOW
      methodOut.setBinsrchLow(1);
      //  cobolCode::PERFORM WITH TEST AFTER UNTIL BINSRCH-LOW > BINSRCH-HIGH
      while (true) {
        //  cobolCode::COMPUTE BINSRCH-MID = ( ( BINSRCH-HIGH + BINSRCH-LOW ) / 2)
        methodOut.setBinsrchMid(((methodOut.getBinsrchHigh() + methodOut.getBinsrchLow()) / 2));
        //  cobolCode::SET CACHE-KEY-NDX TO BINSRCH-MID
        methodOut.setCacheKeyNdx(methodOut.getBinsrchMid());

        //  cobolCode::EVALUATE TRUE
        if (compareChars(
                methodIn.getCacheKeyArea(methodOut.getCacheKeyNdx() - 1),
                methodIn.getCsrchSearchKey())
            < 0) {
          //  cobolCode::COMPUTE BINSRCH-LOW = BINSRCH-MID + 1 END-COMPUTE
          methodOut.setBinsrchLow(methodOut.getBinsrchMid() + 1);
        } else if (compareChars(
                methodIn.getCacheKeyArea(methodOut.getCacheKeyNdx() - 1),
                methodIn.getCsrchSearchKey())
            > 0) {
          //  cobolCode::COMPUTE BINSRCH-HIGH = BINSRCH-MID - 1 END-COMPUTE
          methodOut.setBinsrchHigh(methodOut.getBinsrchMid() - 1);
        } else {
          //  cobolCode::COMPUTE BINSRCH-HIGH = ZERO
          methodOut.setBinsrchHigh(0);
          //  LITERAL_Y = 'Y'
          methodOut.setBinsrchFound(CONSTANTS.LITERAL_Y);
        }
        if (((methodOut.getBinsrchLow() > methodOut.getBinsrchHigh()))) break;
      }
    }

    return methodOut;
  }
  /**
   * errorProcess This method is derived from COBOL Paragraph - 7777-ERROR-PROCESS SECTION COBOL
   * Cyclomatic complexity - 1 Input :
   *
   * <p>- scnReqClngProg COBOL Name: SCN-REQ-CLNG-PROG - dsmPgmName COBOL Name: WS-DSM-PGM-NAME
   *
   * <p>Output :
   *
   * <p>- dsmErrClngPgmName COBOL Name: DSM-ERR-CLNG-PGM-NAME - scnReqClngProg COBOL Name:
   * SCN-REQ-CLNG-PROG - dsmErrPgmName COBOL Name: DSM-ERR-PGM-NAME - dsmPgmName COBOL Name:
   * WS-DSM-PGM-NAME
   *
   * @throws CFException
   */
  @Override
  public ErrorProcessOutCtx errorProcess(ErrorProcessInCtx methodIn) throws Exception {

    // *81***************************************************************
    // *81 7777-Error-process                                           *
    // *81                                                              *
    // *81 business function:                                           *
    // *81 populate data for error logging                              *
    // *81***************************************************************
    // *82***************************************************************
    // *82 7777-error-process                                           *
    // *82                                                              *
    // *82 1. populate fields in vydsmara for error logging             *
    // *82 2. evaluate on sqlcode and then goback to calling pgm        *
    // *82                                                              *
    // *82***************************************************************
    // Added variable to get the program context in place.
    D5427scnCtx programCtx = methodIn.getD5427scnCtx();
    // Added variable to get the output context in place.
    ErrorProcessOutCtx methodOut = methodIn.getErrorProcessOutCtx();
    //  cobolCode::MOVE SCN-REQ-CLNG-PROG TO DSM-ERR-CLNG-PGM-NAME
    methodOut.setDsmErrClngPgmName(methodOut.getScnReqClngProg());
    //  cobolCode::MOVE WS-DSM-PGM-NAME TO DSM-ERR-PGM-NAME
    methodOut.setDsmErrPgmName(methodOut.getDsmPgmName());
    //  cobolCode::PERFORM 9999-SQL-ERROR-PROCESS
    sqlErrorProcess(programCtx.getSqlErrorProcessInCtx()); /*9999-SQL-ERROR-PROCESS SECTION*/
    if (programCtx.isProgramEnded()) {
      return methodOut;
    }

    return methodOut;
  }
  /**
   * sqlErrorProcess This method is derived from COBOL Paragraph - 9999-SQL-ERROR-PROCESS SECTION
   * COBOL Cyclomatic complexity - 18 Input :
   *
   * <p>- sqlcode COBOL Name: SQLCODE
   *
   * <p>Output :
   *
   * <p>- dsmSqlcode COBOL Name: DSM-SQLCODE - sqlcode COBOL Name: SQLCODE - dsmErrTxt COBOL Name:
   * DSM-ERR-TXT - dsmSqlErrorLevel COBOL Name: DSM-SQL-ERROR-LEVEL
   *
   * @throws CFException
   */
  @Override
  public SqlErrorProcessOutCtx sqlErrorProcess(SqlErrorProcessInCtx methodIn) throws Exception {

    // *                    Statement within else part to check the sql *
    // *                    return code other than zero and goback      *
    // *                    statement to terminate the execution of the *
    // *                    program whenever sqlcode is not zero.       *
    // *                   >there is no changes in the functionalities  *
    // *                    of this copybook.                           *
    // *                   >this copybook has been changed to remove the*
    // *                    warning message code igyop3093-w.           *
    // ******************************************************************
    // Added variable to get the program context in place.
    D5427scnCtx programCtx = methodIn.getD5427scnCtx();
    // Added variable to get the output context in place.
    SqlErrorProcessOutCtx methodOut = methodIn.getSqlErrorProcessOutCtx();
    //  cobolCode::MOVE SQLCODE TO DSM-SQLCODE
    methodOut.setDsmSqlcode(methodOut.getSqlcode());
    //  cobolCode::IF SQLCODE = +000
    //  cobolCode::ELSE
    if ((methodOut.getSqlcode() != 0)) {

      // ***  Evaluate sqlcode
      //  cobolCode::EVALUATE SQLCODE
      switch (methodOut.getSqlcode()) {
        case +100:
          //  cobolCode::MOVE '+100: RECORD NOT FOUND ' TO DSM-ERR-TXT
          methodOut.setDsmErrTxt(CONSTANTS.LITERAL_1685312042);
          //  cobolCode::SET DSM-NOTFOUND-ERROR TO TRUE
          methodOut.setDsmNotfoundErrorTrue();

          break;
        case -180:
          //  cobolCode::MOVE '-180: DATE/TIME/TIMESTAMP INVALID ' TO DSM-ERR-TXT
          methodOut.setDsmErrTxt(CONSTANTS.LITERAL_1336588646);
          //  cobolCode::SET DSM-VALUE-ERROR TO TRUE
          methodOut.setDsmValueErrorTrue();

          break;
        case -501:
          //  cobolCode::MOVE '-501: CURSOR NOT OPEN FOR FETCH ' TO DSM-ERR-TXT
          methodOut.setDsmErrTxt(CONSTANTS.LITERAL_859286545);
          //  cobolCode::SET DSM-PROCESS-ERROR TO TRUE
          methodOut.setDsmProcessErrorTrue();

          break;
        case -502:
          //  cobolCode::MOVE '-502: CURSOR ALREADY OPEN ' TO DSM-ERR-TXT
          methodOut.setDsmErrTxt(CONSTANTS.LITERAL_980244056);
          //  cobolCode::SET DSM-PROCESS-ERROR TO TRUE
          methodOut.setDsmProcessErrorTrue();

          break;
        case -803:
          //  cobolCode::MOVE '-803: DUP INSERT, KEY ALREADY EXIST' TO DSM-ERR-TXT
          //  LITERAL_1968872792 = '-803: DUP INSERT, KEY ALREADY EXIST'
          methodOut.setDsmErrTxt(CONSTANTS.LITERAL_1968872792);
          //  cobolCode::SET DSM-DUPLICATE-ERROR TO TRUE
          methodOut.setDsmDuplicateErrorTrue();

          break;
        case -805:
          //  cobolCode::MOVE '-805: DBRM/PACKG NOT FND,REBIND RQD' TO DSM-ERR-TXT
          //  LITERAL_1471723776 = '-805: DBRM/PACKG NOT FND,REBIND RQD'
          methodOut.setDsmErrTxt(CONSTANTS.LITERAL_1471723776);
          //  cobolCode::SET DSM-PACKAGE-ERROR TO TRUE
          methodOut.setDsmPackageErrorTrue();

          break;
        case -904:
          //  cobolCode::MOVE '-904: RESOURCE UNAVAILABLE ' TO DSM-ERR-TXT
          methodOut.setDsmErrTxt(CONSTANTS.LITERAL_385706472);
          //  cobolCode::SET DSM-SYSTEM-ERROR TO TRUE
          methodOut.setDsmSystemErrorTrue();

          break;
        case -911:
          //  cobolCode::MOVE '-911: DEADLOCK OR TIMEOUT OCCURED ' TO DSM-ERR-TXT
          methodOut.setDsmErrTxt(CONSTANTS.LITERAL_1620162762);
          //  cobolCode::SET DSM-SYSTEM-ERROR TO TRUE
          methodOut.setDsmSystemErrorTrue();

          break;
        case -922:
          //  cobolCode::MOVE '-922: CONNECTION NOT ESTABLISHED ' TO DSM-ERR-TXT
          methodOut.setDsmErrTxt(CONSTANTS.LITERAL_807482241);
          //  cobolCode::SET DSM-SYSTEM-ERROR TO TRUE
          methodOut.setDsmSystemErrorTrue();

          break;
        case -923:
          //  cobolCode::MOVE '-923: CONNECTION NOT ESTABLISHED ' TO DSM-ERR-TXT
          methodOut.setDsmErrTxt(CONSTANTS.LITERAL_1303808128);
          //  cobolCode::SET DSM-SYSTEM-ERROR TO TRUE
          methodOut.setDsmSystemErrorTrue();

          break;
        case -927:
          //  cobolCode::MOVE '-927: DB2 CONN NOT ESTABLISHED ' TO DSM-ERR-TXT
          methodOut.setDsmErrTxt(CONSTANTS.LITERAL_1659151422);
          //  cobolCode::SET DSM-SYSTEM-ERROR TO TRUE
          methodOut.setDsmSystemErrorTrue();

          break;
        default:
          //  cobolCode::MOVE 'SEE SQLCODE AND ERROR AREA FOR INFO' TO DSM-ERR-TXT
          //  LITERAL_228553855 = 'SEE SQLCODE AND ERROR AREA FOR INFO'
          methodOut.setDsmErrTxt(CONSTANTS.LITERAL_228553855);
          //  cobolCode::SET DSM-UNDEFINED-ERROR TO TRUE
          methodOut.setDsmUndefinedErrorTrue();
      }

      // ***  End-evaluate.
      //  cobolCode::GOBACK
      setNotLogged(false); // no need to log, it is a normal termination
      programCtx.setProgramEnded(true);
      return methodOut;
    }

    return methodOut;
  }

  public int call(ProgramContext ctx, Object[] params) throws Exception {
    D5427scnCtx programCtx = (D5427scnCtx) ctx;

    int len = params.length;
    if (len > 1 && params[1] != null) programCtx.getDfhcommareaGroup().set((Field) params[1]);
    if (len > 2 && params[2] != null) programCtx.getDsmCallArea().set((Field) params[2]);
    if (len > 3 && params[3] != null) programCtx.getScnDataArea().set((Field) params[3]);
    // invoke the process and return rc
    return process(programCtx);
  }

  public int call(ProgramContext ctx, Field... parameters) throws Exception {
    D5427scnCtx programCtx = (D5427scnCtx) ctx;
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
        case 2:
          if (parameters[index] != null) {
            if (parameters[index] instanceof DsmCallArea) {
              programCtx.setDsmCallArea((DsmCallArea) parameters[index]);
            } else {
              programCtx.getDsmCallArea().set(parameters[index]);
            }
          }

          break;
        case 3:
          if (parameters[index] != null) {
            if (parameters[index] instanceof ScnDataArea) {
              programCtx.setScnDataArea((ScnDataArea) parameters[index]);
            } else {
              programCtx.getScnDataArea().set(parameters[index]);
            }
          }

          break;
      }
    }
    return process(programCtx);
  }
}
