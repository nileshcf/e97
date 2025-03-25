package com.cloudframe.app.business.impl;
/*
 **************************************************************
 * note - performance compile options needed for
 * the binary search routine.  see copybooks: bsrchwrk/bsrchasp
 * in this module
 *
 * access memory cache for program d5427bhi
 **************************************************************
 * rel1909  ramcharan p   original for mdtr-2019-0706-1a-tops
 *          & manikanta   to store db2 memory of ben_hipaa_srvc
 *          srikakulapu   table using mbhi trans
 * rel2302  manikanta     fix for prb prb1352654 fixing the
 *           srikakulapu   overflow condtion and changing the
 *                         messages for easy identication
 * rel2302  vivek dahiya  add new field  prb1415287
 **************************************************************
 */

import com.cloudframe.app.business.C5427bhi;
import com.cloudframe.app.cics.TransactionManager;
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.common.CommonProcess;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.c5427bhi.*;
import com.cloudframe.app.dto.c5427bhi.C5427bhiCtx;
import com.cloudframe.app.dto.c5427bhi.C5427bhiCtx.*;
import com.cloudframe.app.dto.c5427bhi.CacheTsqRecord;
import com.cloudframe.app.dto.c5427bhi.Dfhcommarea;
import com.cloudframe.app.exception.CFException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("c5427bhi")
public class C5427bhiImpl extends CommonProcess implements C5427bhi {

  Logger logger = LoggerFactory.getLogger(C5427bhiImpl.class);

  public com.cloudframe.app.rest.c5427bhi.Dfhcommarea setCommarea(
      com.cloudframe.app.rest.c5427bhi.Dfhcommarea inputCommarea) throws Exception {
    C5427bhiCtx programCtx = new GlobalExecutorCtx().getContext(C5427bhiCtx.class);
    inputCommarea.setDfhcommarea(programCtx.getDfhcommarea());
    setInitDone(false);
    try {
      process(programCtx);
    } catch (Exception e) {
      handleExceptionForRest(e);
    } finally {
      clearVars();
    }
    inputCommarea.populateFrom(programCtx.getDfhcommarea());
    return inputCommarea;
  }
  /**
   * process Input : None
   *
   * <p>Output : None
   *
   * @throws CFException
   */
  public int process(C5427bhiCtx programCtx) throws Exception {
    try {
      setCodePage("1047");
      // Reset program ended flag
      programCtx.setProgramEnded(false);
      // Added variable to get the output context in place.
      ProcessInCtx methodIn = programCtx.getProcessInCtx();
      //  cobolCode::PERFORM 0000-MAINLINE
      mainline(programCtx.getMainlineInCtx()); /*0000-MAINLINE*/
      if (programCtx.isProgramEnded()) {
        return programCtx.getRc();
      }
      //  cobolCode::PERFORM 0000-EXIT
      exit(programCtx); /*0000-EXIT*/
      if (programCtx.isProgramEnded()) {
        return programCtx.getRc();
      }
    } catch (Exception e) {
      handleErrorCode(e);
      throw e;
    }

    return programCtx.getRc(); // Exit with return code
    // end of process method
  }
  /**
   * mainline This method is derived from COBOL Paragraph - 0000-MAINLINE COBOL Cyclomatic
   * complexity - 5 Input :
   *
   * <p>- swFirstTime COBOL Name: SW-FIRST-TIME - tsqCachePtr COBOL Name: TSQ-CACHE-PTR
   *
   * <p>Output :
   *
   * <p>- swFirstTime COBOL Name: SW-FIRST-TIME - respCode COBOL Name: WS-RESP-CODE - resp2Code
   * COBOL Name: WS-RESP2-CODE - swUseCache COBOL Name: SW-USE-CACHE - cacheBhiKeyArea COBOL Name:
   * CACHE-BHI-KEY-AREA - cacheDataPtr COBOL Name: CACHE-DATA-PTR - cacheBhiDataArea COBOL Name:
   * CACHE-BHI-DATA-AREA - crtnSrchFoundSw COBOL Name: CRTN-SRCH-FOUND-SW
   *
   * @throws CFException
   */
  @Override
  public MainlineOutCtx mainline(MainlineInCtx methodIn) throws Exception {

    // ****************************************************************
    // Added variable to get the program context in place.
    C5427bhiCtx programCtx = methodIn.getC5427bhiCtx();
    // Added variable to get the output context in place.
    MainlineOutCtx methodOut = methodIn.getMainlineOutCtx();
    //  cobolCode::IF SW-FIRST-TIME-IS-Y
    if (methodIn.isSwFirstTimeIsY()) {
      //  cobolCode::SET SW-FIRST-TIME-IS-N TO TRUE
      methodOut.setSwFirstTimeIsNTrue();

      // *EXEC CICS
      // *  READQ TS
      // *  QNAME (WS-TS-QUEUE-NAME)
      // *  INTO  (WS-CACHE-TSQ-RECORD)
      // *  LENGTH(LENGTH OF WS-CACHE-TSQ-RECORD)
      // *  ITEM  (WS-TSQ-ITEM1)
      // *  RESP (WS-RESP-CODE)
      // *  RESP2 (WS-RESP2-CODE)
      // *END-EXEC
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
      // *END-EXEC
      /**
       * The readQ - CICS operation retrieves data from a stored queue item in string format. When
       * the target element is a numeric or pointer variable, the string data must be converted to a
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
          //  cobolCode::SET SW-USE-CACHE-IS-Y TO TRUE
          methodOut.setSwUseCacheIsYTrue();

          // *******************************************************
          // * Establish addressability to cache
          // *******************************************************
          //  cobolCode::SET ADDRESS OF CACHE-BHI-KEY-AREA TO TSQ-CACHE-PTR
          methodOut.getCacheBhiKeyArea().set(getObject(methodIn.getTsqCachePtr()));

          //  cobolCode::SET ADDRESS OF CACHE-BHI-DATA-AREA TO CACHE-DATA-PTR
          methodOut.getCacheBhiDataArea().set(getObject(methodOut.getCacheDataPtr()));

          break;
        default:
          //  cobolCode::SET SW-USE-CACHE-IS-N TO TRUE
          methodOut.setSwUseCacheIsNTrue();

          //  cobolCode::SET CRTN-SRCH-FOUND-SW-IS-OVERFLOW TO TRUE
          methodOut.setCrtnSrchFoundSwIsOverflowTrue();

          // cobolCode::GO TO 0000-EXIT
          exit(programCtx);
          return methodOut;
          // cobolCodeEnds::GO TO 0000-EXIT
      }
    }
    //  cobolCode::IF SW-USE-CACHE-IS-N
    if (methodOut.isSwUseCacheIsN()) {
      //  cobolCode::SET CRTN-SRCH-FOUND-SW-IS-OVERFLOW TO TRUE
      methodOut.setCrtnSrchFoundSwIsOverflowTrue();

      // cobolCode::GO TO 0000-EXIT
      exit(programCtx);
      return methodOut;
      // cobolCodeEnds::GO TO 0000-EXIT
    }
    //  cobolCode::PERFORM 1500-PROCESS-CACHE THRU 1500-EXIT
    processCache(programCtx.getProcessCacheInCtx()); /*1500-PROCESS-CACHE*/
    if (programCtx.isProgramEnded()) {
      return methodOut;
    }

    return methodOut;
  }
  /**
   * exit This method is derived from COBOL Paragraph - 0000-EXIT COBOL Cyclomatic complexity - 2
   * Input : None
   *
   * <p>Output : None
   *
   * @throws CFException
   */
  @Override
  public void exit(C5427bhiCtx programCtx) throws Exception {
    //  cobolCode::GOBACK
    setNotLogged(false); // no need to log, it is a normal termination
    programCtx.setProgramEnded(true);
    return;
  }
  /**
   * processCache This method is derived from COBOL Paragraph - 1500-PROCESS-CACHE COBOL Cyclomatic
   * complexity - 15 Input :
   *
   * <p>- crtnFunction COBOL Name: CRTN-FUNCTION - cacheKeyOverflowInd COBOL Name:
   * CACHE-KEY-OVERFLOW-IND - cacheDataOverflowInd COBOL Name: CACHE-DATA-OVERFLOW-IND - crtnSrchKey
   * COBOL Name: CRTN-SRCH-KEY - cacheKeyArea COBOL Name: CACHE-KEY-AREA - cacheKeyCnt COBOL Name:
   * CACHE-KEY-CNT - binsrchFound COBOL Name: BINSRCH-FOUND - cacheDataOffset COBOL Name:
   * CACHE-DATA-OFFSET - cacheDataNbrOfEntries COBOL Name: CACHE-DATA-NBR-OF-ENTRIES - cacheKeyNdx
   * COBOL Name: CACHE-KEY-NDX - cacheEffDt COBOL Name: CACHE-EFF-DT - crtnReqEffDt COBOL Name:
   * CRTN-REQ-EFF-DT - cacheCancDt COBOL Name: CACHE-CANC-DT - crtnReqCancDt COBOL Name:
   * CRTN-REQ-CANC-DT - cacheNtwkTypCd COBOL Name: CACHE-NTWK-TYP-CD - cacheSrvcCd COBOL Name:
   * CACHE-SRVC-CD - cachePlOfSrvcCd COBOL Name: CACHE-PL-OF-SRVC-CD - cacheCausCd COBOL Name:
   * CACHE-CAUS-CD - cacheBenLvlCd COBOL Name: CACHE-BEN-LVL-CD - cacheInNtwkClssCd COBOL Name:
   * CACHE-IN-NTWK-CLSS-CD - cacheTier1NtwkClssCd COBOL Name: CACHE-TIER1-NTWK-CLSS-CD -
   * cacheProcCdRngBegnVal COBOL Name: CACHE-PROC-CD-RNG-BEGN-VAL - cacheProcCdRngEndVal COBOL Name:
   * CACHE-PROC-CD-RNG-END-VAL - cacheProcCdRngTypVal COBOL Name: CACHE-PROC-CD-RNG-TYP-VAL -
   * cacheProvOrgTypCd COBOL Name: CACHE-PROV-ORG-TYP-CD - cacheHipaaCommtTxt COBOL Name:
   * CACHE-HIPAA-COMMT-TXT
   *
   * <p>Output :
   *
   * <p>- crtnSrchFoundSw COBOL Name: CRTN-SRCH-FOUND-SW - crtnSqlcode COBOL Name: CRTN-SQLCODE -
   * cacheDataNdx COBOL Name: CACHE-DATA-NDX - bcntrFetchOccurrance COBOL Name:
   * BCNTR-FETCH-OCCURRANCE - crtnNtwkTypCd COBOL Name: CRTN-NTWK-TYP-CD - cacheNtwkTypCd COBOL
   * Name: CACHE-NTWK-TYP-CD - crtnEffDt COBOL Name: CRTN-EFF-DT - cacheEffDt COBOL Name:
   * CACHE-EFF-DT - crtnCancDt COBOL Name: CRTN-CANC-DT - cacheCancDt COBOL Name: CACHE-CANC-DT -
   * crtnSrvcCd COBOL Name: CRTN-SRVC-CD - cacheSrvcCd COBOL Name: CACHE-SRVC-CD - crtnPlOfSrvcCd
   * COBOL Name: CRTN-PL-OF-SRVC-CD - cachePlOfSrvcCd COBOL Name: CACHE-PL-OF-SRVC-CD - crtnCausCd
   * COBOL Name: CRTN-CAUS-CD - cacheCausCd COBOL Name: CACHE-CAUS-CD - crtnBenLvlCd COBOL Name:
   * CRTN-BEN-LVL-CD - cacheBenLvlCd COBOL Name: CACHE-BEN-LVL-CD - crtnInNtwkClssCd COBOL Name:
   * CRTN-IN-NTWK-CLSS-CD - cacheInNtwkClssCd COBOL Name: CACHE-IN-NTWK-CLSS-CD -
   * crtnTier1NtwkClssCd COBOL Name: CRTN-TIER1-NTWK-CLSS-CD - cacheTier1NtwkClssCd COBOL Name:
   * CACHE-TIER1-NTWK-CLSS-CD - crtnProcCdRngBegnVal COBOL Name: CRTN-PROC-CD-RNG-BEGN-VAL -
   * cacheProcCdRngBegnVal COBOL Name: CACHE-PROC-CD-RNG-BEGN-VAL - crtnProcCdRngEndVal COBOL Name:
   * CRTN-PROC-CD-RNG-END-VAL - cacheProcCdRngEndVal COBOL Name: CACHE-PROC-CD-RNG-END-VAL -
   * crtnProcCdRngTypVal COBOL Name: CRTN-PROC-CD-RNG-TYP-VAL - cacheProcCdRngTypVal COBOL Name:
   * CACHE-PROC-CD-RNG-TYP-VAL - crtnProvOrgTypCd COBOL Name: CRTN-PROV-ORG-TYP-CD -
   * cacheProvOrgTypCd COBOL Name: CACHE-PROV-ORG-TYP-CD - crtnHipaaCommtTxt COBOL Name:
   * CRTN-HIPAA-COMMT-TXT - cacheHipaaCommtTxt COBOL Name: CACHE-HIPAA-COMMT-TXT
   *
   * @throws CFException
   */
  @Override
  public ProcessCacheOutCtx processCache(ProcessCacheInCtx methodIn) throws Exception {
    // Added variable to get the program context in place.
    C5427bhiCtx programCtx = methodIn.getC5427bhiCtx();
    // Added variable to get the output context in place.
    ProcessCacheOutCtx methodOut = methodIn.getProcessCacheOutCtx();
    //  cobolCode::IF CRTN-FUNCTION-IS-OPEN
    if (methodIn.isCrtnFunctionIsOpen()) {

      // *****************************************************************
      // *    If the cache was loaded but it is completely full,         *
      // *    then we check to see if the key we are searching for       *
      // *    is greater than the last key in the cache, if so then      *
      // *    we set the overflow switch and return.                     *
      // *****************************************************************
      // *      if cache-key-cnt = cache-key-array-max
      // *      and crtn-srch-key >
      // *      cache-key-area(cache-key-cnt)
      //  cobolCode::IF ( ( CACHE-KEY-OVERFLOW-YES OR CACHE-DATA-OVERFLOW-YES ) AND ( CRTN-SRCH-KEY
      // > CACHE-KEY-AREA ( CACHE-KEY-CNT )))
      if ((((methodIn.isCacheKeyOverflowYes() || methodIn.isCacheDataOverflowYes()))
          && ((compareChars(
                  methodIn.getCrtnSrchKey(),
                  methodIn.getCacheKeyArea(methodIn.getCacheKeyCnt() - 1))
              > 0)))) {
        //  cobolCode::SET CRTN-SRCH-FOUND-SW-IS-OVERFLOW TO TRUE
        methodOut.setCrtnSrchFoundSwIsOverflowTrue();

        methodOut.setCrtnSqlcode(100);
        // cobolCode::GO TO 1500-EXIT
        return methodOut;
        // cobolCodeEnds::GO TO 1500-EXIT
      }
      //  cobolCode::SET CRTN-SRCH-FOUND-SW-IS-NO TO TRUE
      methodOut.setCrtnSrchFoundSwIsNoTrue();

      //  cobolCode::PERFORM 5000-SEARCH-CACHE THRU 5000-EXIT
      searchCache(programCtx.getSearchCacheInCtx()); /*5000-SEARCH-CACHE*/
      //  cobolCode::EVALUATE TRUE
      if (methodIn.isBinsrchFoundIsN()) {
        methodOut.setCrtnSqlcode(100);
        //  cobolCode::SET CRTN-SRCH-FOUND-SW-IS-NO TO TRUE
        methodOut.setCrtnSrchFoundSwIsNoTrue();

      } else if (methodIn.isBinsrchFoundIsY()) {
        methodOut.setCrtnSqlcode(0);
        //  cobolCode::SET CRTN-SRCH-FOUND-SW-IS-YES TO TRUE
        methodOut.setCrtnSrchFoundSwIsYesTrue();

        //  cobolCode::SET CACHE-DATA-NDX TO CACHE-DATA-OFFSET ( CACHE-KEY-NDX )
        methodOut.setCacheDataNdx(methodIn.getCacheDataOffset(methodIn.getCacheKeyNdx() - 1));

        methodOut.setBcntrFetchOccurrance((short) 1);
      }
      // cobolCode::GO TO 1500-EXIT
      return methodOut;
      // cobolCodeEnds::GO TO 1500-EXIT
    }
    //  cobolCode::IF BINSRCH-FOUND-IS-Y AND CRTN-FUNCTION-IS-FETCH
    if (methodIn.isBinsrchFoundIsY() && methodIn.isCrtnFunctionIsFetch()) {
      methodOut.setCrtnSqlcode(100);
      //  cobolCode::SET CRTN-SRCH-FOUND-SW-IS-NO TO TRUE
      methodOut.setCrtnSrchFoundSwIsNoTrue();

      //  cobolCode::PERFORM UNTIL CRTN-SRCH-FOUND-SW-IS-YES OR BCNTR-FETCH-OCCURRANCE >
      // CACHE-DATA-NBR-OF-ENTRIES ( CACHE-KEY-NDX )
      while ((!(methodOut.isCrtnSrchFoundSwIsYes())
          && (methodOut.getBcntrFetchOccurrance()
              <= methodIn.getCacheDataNbrOfEntries(methodIn.getCacheKeyNdx() - 1)))) {
        //  cobolCode::IF ( ( CACHE-EFF-DT ( CACHE-DATA-NDX ) <= CRTN-REQ-EFF-DT AND CACHE-CANC-DT (
        // CACHE-DATA-NDX ) >= CRTN-REQ-EFF-DT ) OR ( CACHE-EFF-DT ( CACHE-DATA-NDX ) <=
        // CRTN-REQ-CANC-DT AND CACHE-CANC-DT ( CACHE-DATA-NDX ) >= CRTN-REQ-CANC-DT ) )
        if ((((compareChars(
                        methodOut.getCacheEffDt(methodOut.getCacheDataNdx() - 1),
                        methodIn.getCrtnReqEffDt())
                    <= 0
                && compareChars(
                        methodOut.getCacheCancDt(methodOut.getCacheDataNdx() - 1),
                        methodIn.getCrtnReqEffDt())
                    >= 0))
            || ((compareChars(
                        methodOut.getCacheEffDt(methodOut.getCacheDataNdx() - 1),
                        methodIn.getCrtnReqCancDt())
                    <= 0
                && compareChars(
                        methodOut.getCacheCancDt(methodOut.getCacheDataNdx() - 1),
                        methodIn.getCrtnReqCancDt())
                    >= 0)))) {
          //  cobolCode::SET CRTN-SRCH-FOUND-SW-IS-YES TO TRUE
          methodOut.setCrtnSrchFoundSwIsYesTrue();

          methodOut.setCrtnSqlcode(0);
          //  cobolCode::MOVE CACHE-NTWK-TYP-CD ( CACHE-DATA-NDX ) TO CRTN-NTWK-TYP-CD
          methodOut.setCrtnNtwkTypCd(methodOut.getCacheNtwkTypCd(methodOut.getCacheDataNdx() - 1));
          //  cobolCode::MOVE CACHE-EFF-DT ( CACHE-DATA-NDX ) TO CRTN-EFF-DT
          methodOut.setCrtnEffDt(methodOut.getCacheEffDt(methodOut.getCacheDataNdx() - 1));
          //  cobolCode::MOVE CACHE-CANC-DT ( CACHE-DATA-NDX ) TO CRTN-CANC-DT
          methodOut.setCrtnCancDt(methodOut.getCacheCancDt(methodOut.getCacheDataNdx() - 1));
          //  cobolCode::MOVE CACHE-SRVC-CD ( CACHE-DATA-NDX ) TO CRTN-SRVC-CD
          methodOut.setCrtnSrvcCd(methodOut.getCacheSrvcCd(methodOut.getCacheDataNdx() - 1));
          //  cobolCode::MOVE CACHE-PL-OF-SRVC-CD ( CACHE-DATA-NDX ) TO CRTN-PL-OF-SRVC-CD
          methodOut.setCrtnPlOfSrvcCd(
              methodOut.getCachePlOfSrvcCd(methodOut.getCacheDataNdx() - 1));
          //  cobolCode::MOVE CACHE-CAUS-CD ( CACHE-DATA-NDX ) TO CRTN-CAUS-CD
          methodOut.setCrtnCausCd(methodOut.getCacheCausCd(methodOut.getCacheDataNdx() - 1));
          //  cobolCode::MOVE CACHE-BEN-LVL-CD ( CACHE-DATA-NDX ) TO CRTN-BEN-LVL-CD
          methodOut.setCrtnBenLvlCd(methodOut.getCacheBenLvlCd(methodOut.getCacheDataNdx() - 1));
          //  cobolCode::MOVE CACHE-IN-NTWK-CLSS-CD ( CACHE-DATA-NDX ) TO CRTN-IN-NTWK-CLSS-CD
          methodOut.setCrtnInNtwkClssCd(
              methodOut.getCacheInNtwkClssCd(methodOut.getCacheDataNdx() - 1));
          //  cobolCode::MOVE CACHE-TIER1-NTWK-CLSS-CD ( CACHE-DATA-NDX ) TO CRTN-TIER1-NTWK-CLSS-CD
          methodOut.setCrtnTier1NtwkClssCd(
              methodOut.getCacheTier1NtwkClssCd(methodOut.getCacheDataNdx() - 1));
          //  cobolCode::MOVE CACHE-PROC-CD-RNG-BEGN-VAL ( CACHE-DATA-NDX ) TO
          // CRTN-PROC-CD-RNG-BEGN-VAL
          methodOut.setCrtnProcCdRngBegnVal(
              methodOut.getCacheProcCdRngBegnVal(methodOut.getCacheDataNdx() - 1));
          //  cobolCode::MOVE CACHE-PROC-CD-RNG-END-VAL ( CACHE-DATA-NDX ) TO
          // CRTN-PROC-CD-RNG-END-VAL
          methodOut.setCrtnProcCdRngEndVal(
              methodOut.getCacheProcCdRngEndVal(methodOut.getCacheDataNdx() - 1));
          //  cobolCode::MOVE CACHE-PROC-CD-RNG-TYP-VAL ( CACHE-DATA-NDX ) TO
          // CRTN-PROC-CD-RNG-TYP-VAL
          methodOut.setCrtnProcCdRngTypVal(
              methodOut.getCacheProcCdRngTypVal(methodOut.getCacheDataNdx() - 1));
          //  cobolCode::MOVE CACHE-PROV-ORG-TYP-CD ( CACHE-DATA-NDX ) TO CRTN-PROV-ORG-TYP-CD
          methodOut.setCrtnProvOrgTypCd(
              methodOut.getCacheProvOrgTypCd(methodOut.getCacheDataNdx() - 1));
          //  cobolCode::MOVE CACHE-HIPAA-COMMT-TXT ( CACHE-DATA-NDX ) TO CRTN-HIPAA-COMMT-TXT
          methodOut.setCrtnHipaaCommtTxt(
              methodOut.getCacheHipaaCommtTxt(methodOut.getCacheDataNdx() - 1));
        }
        //  cobolCode::ADD +1 TO BCNTR-FETCH-OCCURRANCE
        methodOut.setBcntrFetchOccurrance(
            (short) (methodOut.getBcntrFetchOccurrance() + (short) 1));
        //  cobolCode::SET CACHE-DATA-NDX UP BY 1
        methodOut.setCacheDataNdx(methodOut.getCacheDataNdx() + 1);
      }
    }
    //  cobolCode::ELSE
    else {
      //  cobolCode::SET CRTN-SRCH-FOUND-SW-IS-NO TO TRUE
      methodOut.setCrtnSrchFoundSwIsNoTrue();

      methodOut.setCrtnSqlcode(100);
    }

    return methodOut;
  }
  /**
   * searchCache This method is derived from COBOL Paragraph - 5000-SEARCH-CACHE COBOL Cyclomatic
   * complexity - 7 Input :
   *
   * <p>- cacheKeyCnt COBOL Name: CACHE-KEY-CNT - cacheKeyArea COBOL Name: CACHE-KEY-AREA -
   * crtnSrchKey COBOL Name: CRTN-SRCH-KEY
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
    C5427bhiCtx programCtx = methodIn.getC5427bhiCtx();
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
    //  cobolCode::IF CACHE-KEY-AREA (1) > CRTN-SRCH-KEY OR CACHE-KEY-AREA ( BINSRCH-HIGH ) <
    // CRTN-SRCH-KEY
    //  cobolCode::ELSE
    if (compareChars(methodIn.getCacheKeyArea(0), methodIn.getCrtnSrchKey()) <= 0
        && compareChars(
                methodIn.getCacheKeyArea(methodOut.getBinsrchHigh() - 1), methodIn.getCrtnSrchKey())
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
                methodIn.getCacheKeyArea(methodOut.getCacheKeyNdx() - 1), methodIn.getCrtnSrchKey())
            < 0) {
          //  cobolCode::COMPUTE BINSRCH-LOW = BINSRCH-MID + 1 END-COMPUTE
          methodOut.setBinsrchLow(methodOut.getBinsrchMid() + 1);
        } else if (compareChars(
                methodIn.getCacheKeyArea(methodOut.getCacheKeyNdx() - 1), methodIn.getCrtnSrchKey())
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

  public int call(ProgramContext ctx, Object[] params) throws Exception {
    C5427bhiCtx programCtx = (C5427bhiCtx) ctx;

    int len = params.length;
    if (len > 1 && params[1] != null) programCtx.getDfhcommarea().set((Field) params[1]);
    // invoke the process and return rc
    return process(programCtx);
  }

  public int call(ProgramContext ctx, Field... parameters) throws Exception {
    C5427bhiCtx programCtx = (C5427bhiCtx) ctx;
    for (int index = 0; index < parameters.length; index++) {
      switch (index) {
        case 1:
          if (parameters[index] != null) {
            if (parameters[index] instanceof Dfhcommarea) {
              programCtx.setDfhcommarea((Dfhcommarea) parameters[index]);
            } else {
              programCtx.getDfhcommarea().set(parameters[index]);
            }
          }

          break;
      }
    }
    return process(programCtx);
  }
}
