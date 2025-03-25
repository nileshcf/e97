package com.cloudframe.app.business.impl;
/*
 **************************************************************
 * note - performance compile options needed for
 * the binary search routine.  see copybooks: bsrchwrk/bsrchasp
 * in this module
 *
 * access memory cache for program d5427hpc
 **************************************************************
 *----------------------------------------------------------------
 *            r e v i s i o n   l o g
 *----------------------------------------------------------------
 *   date        name           description
 *   jul. 2019   manikanta      original for
 *               srikakulapu &  mdtr-2019-0514-1a-tops
 *               ramcharan p
 * rel2304   manikanta &   mdtr-2023-0306-1a-tops to fix the
 *           bharath       overflow condtion and changing the
 *                         messages for easy identication
 *****************************************************************
 */

import com.cloudframe.app.business.*;
import com.cloudframe.app.business.C5427hpc;
import com.cloudframe.app.business.Dphpctsq;
import com.cloudframe.app.cics.TransactionManager;
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.common.CommonProcess;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.c5427hpc.*;
import com.cloudframe.app.dto.c5427hpc.C5427hpcCtx;
import com.cloudframe.app.dto.c5427hpc.C5427hpcCtx.*;
import com.cloudframe.app.dto.c5427hpc.CacheTsqRecord;
import com.cloudframe.app.dto.c5427hpc.Dfhcommarea;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("c5427hpc")
public class C5427hpcImpl extends CommonProcess implements C5427hpc {

  Logger logger = LoggerFactory.getLogger(C5427hpcImpl.class);

  @Autowired
  @Qualifier("dphpctsq")
  Dphpctsq dphpctsq;

  public com.cloudframe.app.rest.c5427hpc.Dfhcommarea setCommarea(
      com.cloudframe.app.rest.c5427hpc.Dfhcommarea inputCommarea) throws Exception {
    C5427hpcCtx programCtx = new GlobalExecutorCtx().getContext(C5427hpcCtx.class);
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
  public int process(C5427hpcCtx programCtx) throws Exception {
    try {
      setCodePage("1047");
      // Reset program ended flag
      programCtx.setProgramEnded(false);
      // Added variable to get the output context in place.
      ProcessInCtx methodIn = programCtx.getProcessInCtx();
      //  cobolCode::PERFORM 0000-MAINLINE
      programCtx.setLoopMainline(true);
      while (programCtx.getLoopMainline()) {
        mainline(programCtx.getMainlineInCtx());
        if (programCtx.isProgramEnded()) return programCtx.getRc();
      } /*0000-MAINLINE*/
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
   * complexity - 14 Input :
   *
   * <p>- swFirstTime COBOL Name: SW-FIRST-TIME - tsqCachePtr COBOL Name: TSQ-CACHE-PTR -
   * crtnCallType COBOL Name: CRTN-CALL-TYPE
   *
   * <p>Output :
   *
   * <p>- swFirstTime COBOL Name: SW-FIRST-TIME - respCode COBOL Name: WS-RESP-CODE - resp2Code
   * COBOL Name: WS-RESP2-CODE - swUseCache COBOL Name: SW-USE-CACHE - cacheHpcKeyArea COBOL Name:
   * CACHE-HPC-KEY-AREA - cacheDataPtr COBOL Name: CACHE-DATA-PTR - cacheHpcDataArea COBOL Name:
   * CACHE-HPC-DATA-AREA - crtnSrchFoundSw COBOL Name: CRTN-SRCH-FOUND-SW - rc COBOL Name:
   * RETURN-CODE - crtnQueryTyp COBOL Name: CRTN-QUERY-TYP
   *
   * @throws CFException
   */
  @Override
  public MainlineOutCtx mainline(MainlineInCtx methodIn) throws Exception {

    // ****************************************************************
    // Added variable to get the program context in place.
    C5427hpcCtx programCtx = methodIn.getC5427hpcCtx();
    programCtx.setLoopMainline(false);
    // Added variable to get the output context in place.
    MainlineOutCtx methodOut = methodIn.getMainlineOutCtx();
    //  cobolCode::IF SW-FIRST-TIME-IS-Y OR SW-RETRY-IS-Y
    if (methodIn.isSwFirstTimeIsY() || methodOut.isSwRetryIsY()) {
      //  cobolCode::IF SW-FIRST-TIME-IS-Y
      if (methodIn.isSwFirstTimeIsY()) {
        //  cobolCode::SET SW-FIRST-TIME-IS-N TO TRUE
        methodOut.setSwFirstTimeIsNTrue();
      }

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
          //  cobolCode::SET ADDRESS OF CACHE-HPC-KEY-AREA TO TSQ-CACHE-PTR
          methodOut.getCacheHpcKeyArea().set(getObject(methodIn.getTsqCachePtr()));

          //  cobolCode::SET ADDRESS OF CACHE-HPC-DATA-AREA TO CACHE-DATA-PTR
          methodOut.getCacheHpcDataArea().set(getObject(methodOut.getCacheDataPtr()));

          //  cobolCode::IF SW-RETRY-IS-Y
          if (methodOut.isSwRetryIsY()) {
            //  cobolCode::SET SW-FIRST-TIME-IS-N TO TRUE
            methodOut.setSwFirstTimeIsNTrue();
          }
          break;
        case 44:
          //  cobolCode::IF SW-RETRY-IS-Y
          if (methodOut.isSwRetryIsY()) {
            //  cobolCode::SET SW-USE-CACHE-IS-N TO TRUE
            methodOut.setSwUseCacheIsNTrue();

            //  cobolCode::SET CRTN-SRCH-FOUND-SW-IS-OVERFLOW TO TRUE
            methodOut.setCrtnSrchFoundSwIsOverflowTrue();

            // cobolCode::GO TO 0000-EXIT
            exit(programCtx);
            return methodOut;
            // cobolCodeEnds::GO TO 0000-EXIT
          }
          //  cobolCode::CALL WS-DPHPCTSQ USING DFHEIBLK DFHCOMMAREA
          programCtx.setRc(
              dphpctsq.call(
                  programCtx.getGlobalCtx().getContext("DPHPCTSQ"),
                  programCtx.getCicsSession(),
                  methodOut.getDfhcommarea()));
          //  cobolCode::SET SW-RETRY-IS-Y TO TRUE
          methodOut.setSwRetryIsYTrue();

          // cobolCode::GO TO 0000-MAINLINE
          programCtx.setLoopMainline(true);
          return methodOut;
          // cobolCodeEnds::GO TO 0000-MAINLINE

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
    //  cobolCode::EVALUATE TRUE
    if (methodIn.isCrtnListCsr()) {
      //  cobolCode::MOVE '1' TO CRTN-QUERY-TYP
      methodOut.setCrtnQueryTyp(1);
      //  cobolCode::PERFORM 1000-PROCESS-CACHE THRU 1000-EXIT
      processCache(programCtx.getProcessCacheInCtx()); /*1000-PROCESS-CACHE*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    } else if (methodIn.isCrtnGenericCsr()) {
      //  cobolCode::MOVE '1' TO CRTN-QUERY-TYP
      methodOut.setCrtnQueryTyp(1);
      //  cobolCode::PERFORM 1500-PROCESS-CACHE THRU 1500-EXIT
      processCache1500(programCtx.getProcessCache1500InCtx()); /*1500-PROCESS-CACHE*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    } else if (methodIn.isCrtnGroupCsr()) {
      //  cobolCode::MOVE '2' TO CRTN-QUERY-TYP
      methodOut.setCrtnQueryTyp(2);
      //  cobolCode::PERFORM 2000-PROCESS-CACHE THRU 2000-EXIT
      processCache2000(programCtx.getProcessCache2000InCtx()); /*2000-PROCESS-CACHE*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
    } else if (methodIn.isCrtnSelect()) {
      //  cobolCode::MOVE '3' TO CRTN-QUERY-TYP
      methodOut.setCrtnQueryTyp(3);
      //  cobolCode::PERFORM 3000-PROCESS-CACHE THRU 3000-EXIT
      processCache3000(programCtx.getProcessCache3000InCtx()); /*3000-PROCESS-CACHE*/
      if (programCtx.isProgramEnded()) {
        return methodOut;
      }
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
  public void exit(C5427hpcCtx programCtx) throws Exception {
    //  cobolCode::GOBACK
    setNotLogged(false); // no need to log, it is a normal termination
    programCtx.setProgramEnded(true);
    return;
  }
  /**
   * processCache This method is derived from COBOL Paragraph - 1000-PROCESS-CACHE COBOL Cyclomatic
   * complexity - 27 Input :
   *
   * <p>- crtnFunction COBOL Name: CRTN-FUNCTION - cacheKeyOverflowInd COBOL Name:
   * CACHE-KEY-OVERFLOW-IND - cacheDataOverflowInd COBOL Name: CACHE-DATA-OVERFLOW-IND -
   * crtnSrchKeyPartial COBOL Name: CRTN-SRCH-KEY-PARTIAL - cacheKeyAreaPartial COBOL Name:
   * CACHE-KEY-AREA-PARTIAL - cacheKeyCnt COBOL Name: CACHE-KEY-CNT - binsrchFound COBOL Name:
   * BINSRCH-FOUND - cacheDataOffset COBOL Name: CACHE-DATA-OFFSET - crtnNdx COBOL Name: CRTN-NDX -
   * crtnSrchCd COBOL Name: CRTN-SRCH-CD - cacheDataNbrOfEntries COBOL Name:
   * CACHE-DATA-NBR-OF-ENTRIES - cacheKeyNdx COBOL Name: CACHE-KEY-NDX - cacheHipaaGrpCd COBOL Name:
   * CACHE-HIPAA-GRP-CD - cacheDataTyp COBOL Name: CACHE-DATA-TYP - cacheHipaaCd COBOL Name:
   * CACHE-HIPAA-CD - priorHipaaCd COBOL Name: PRIOR-HIPAA-CD - cacheGrnrcRqstCd COBOL Name:
   * CACHE-GRNRC-RQST-CD - priorGrnrcRqstCd COBOL Name: PRIOR-GRNRC-RQST-CD
   *
   * <p>Output :
   *
   * <p>- crtnSrchFoundSw COBOL Name: CRTN-SRCH-FOUND-SW - crtnSqlcode COBOL Name: CRTN-SQLCODE -
   * cacheDataNdx COBOL Name: CACHE-DATA-NDX - bcntrFetchOccurrance COBOL Name:
   * BCNTR-FETCH-OCCURRANCE - crtnHipaaCd30Flag COBOL Name: CRTN-HIPAA-CD-30-FLAG - crtnNdx COBOL
   * Name: CRTN-NDX - crtnHipaaCd COBOL Name: CRTN-HIPAA-CD - priorHipaaCd COBOL Name:
   * PRIOR-HIPAA-CD - cacheHipaaCd COBOL Name: CACHE-HIPAA-CD - crtnGrnrcRqstCd COBOL Name:
   * CRTN-GRNRC-RQST-CD - priorGrnrcRqstCd COBOL Name: PRIOR-GRNRC-RQST-CD - cacheGrnrcRqstCd COBOL
   * Name: CACHE-GRNRC-RQST-CD
   *
   * @throws CFException
   */
  @Override
  public ProcessCacheOutCtx processCache(ProcessCacheInCtx methodIn) throws Exception {
    // Added variable to get the program context in place.
    C5427hpcCtx programCtx = methodIn.getC5427hpcCtx();
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
      // *      and crtn-srch-key-partial >
      // *      cache-key-area-partial(cache-key-cnt)
      //  cobolCode::IF ( ( CACHE-KEY-OVERFLOW-YES OR CACHE-DATA-OVERFLOW-YES ) AND (
      // CRTN-SRCH-KEY-PARTIAL > CACHE-KEY-AREA-PARTIAL ( CACHE-KEY-CNT )))
      if ((((methodIn.isCacheKeyOverflowYes() || methodIn.isCacheDataOverflowYes()))
          && ((compareChars(
                  methodIn.getCrtnSrchKeyPartial(),
                  methodIn.getCacheKeyAreaPartial(methodIn.getCacheKeyCnt() - 1))
              > 0)))) {
        //  cobolCode::SET CRTN-SRCH-FOUND-SW-IS-OVERFLOW TO TRUE
        methodOut.setCrtnSrchFoundSwIsOverflowTrue();

        methodOut.setCrtnSqlcode(100);
        // cobolCode::GO TO 1000-EXIT
        return methodOut;
        // cobolCodeEnds::GO TO 1000-EXIT
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
        //  cobolCode::SET CRTN-HIPAA-CD-30-N TO TRUE
        methodOut.setCrtnHipaaCd30NTrue();

        //  cobolCode::PERFORM VARYING CRTN-NDX FROM 1 BY 1 UNTIL CRTN-NDX > 10 OR
        // CRTN-HIPAA-CD-30-Y
        for (methodOut.setCrtnNdx(1);
            ((methodOut.getCrtnNdx() <= 10) && !(methodOut.isCrtnHipaaCd30Y()));
            methodOut.setCrtnNdx(methodOut.getCrtnNdx() + 1)) {
          //  cobolCode::IF CRTN-SRCH-CD ( CRTN-NDX ) = '30'
          if (methodIn.getCrtnSrchCd(methodOut.getCrtnNdx() - 1)[0] == '3') {
            //  cobolCode::SET CRTN-HIPAA-CD-30-Y TO TRUE
            methodOut.setCrtnHipaaCd30YTrue();
          }
        }
      }
      // cobolCode::GO TO 1000-EXIT
      return methodOut;
      // cobolCodeEnds::GO TO 1000-EXIT
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
        //  cobolCode::PERFORM VARYING CRTN-NDX FROM 1 BY 1 UNTIL CRTN-NDX > 10 OR
        // CRTN-SRCH-FOUND-SW-IS-YES
        for (methodOut.setCrtnNdx(1);
            ((methodOut.getCrtnNdx() <= 10) && !(methodOut.isCrtnSrchFoundSwIsYes()));
            methodOut.setCrtnNdx(methodOut.getCrtnNdx() + 1)) {
          //  cobolCode::IF ( ( ( CRTN-SRCH-CD ( CRTN-NDX ) = CACHE-HIPAA-GRP-CD ( CACHE-DATA-NDX )
          // AND CACHE-DATA-TYP ( CACHE-DATA-NDX ) = 1 OR CRTN-SRCH-CD ( CRTN-NDX ) = CACHE-HIPAA-CD
          // ( CACHE-DATA-NDX ) AND CACHE-DATA-TYP ( CACHE-DATA-NDX ) = 2) OR ( CACHE-DATA-TYP (
          // CACHE-DATA-NDX ) = 3 AND CRTN-HIPAA-CD-30-Y ) ) AND ( CRTN-SRCH-CD ( CRTN-NDX ) IS NOT
          // = SPACES ) AND ( CACHE-HIPAA-CD ( CACHE-DATA-NDX ) IS NOT = PRIOR-HIPAA-CD OR
          // CACHE-GRNRC-RQST-CD ( CACHE-DATA-NDX ) IS NOT = PRIOR-GRNRC-RQST-CD ) )
          if ((((((compareChars(
                                  methodIn.getCrtnSrchCd(methodOut.getCrtnNdx() - 1),
                                  methodIn.getCacheHipaaGrpCd(methodOut.getCacheDataNdx() - 1))
                              == 0
                          && (methodIn.getCacheDataTyp(methodOut.getCacheDataNdx() - 1) == 1)
                      || compareChars(
                                  methodIn.getCrtnSrchCd(methodOut.getCrtnNdx() - 1),
                                  methodOut.getCacheHipaaCd(methodOut.getCacheDataNdx() - 1))
                              == 0
                          && (methodIn.getCacheDataTyp(methodOut.getCacheDataNdx() - 1) == 2)))
                  || (((methodIn.getCacheDataTyp(methodOut.getCacheDataNdx() - 1) == 3)
                      && methodOut.isCrtnHipaaCd30Y()))))
              && (((!allSpaces(methodIn.getCrtnSrchCd(methodOut.getCrtnNdx() - 1)))))
              && ((compareChars(
                          methodOut.getCacheHipaaCd(methodOut.getCacheDataNdx() - 1),
                          methodOut.getPriorHipaaCd())
                      != 0
                  || compareChars(
                          methodOut.getCacheGrnrcRqstCd(methodOut.getCacheDataNdx() - 1),
                          methodOut.getPriorGrnrcRqstCd())
                      != 0)))) {
            //  cobolCode::SET CRTN-SRCH-FOUND-SW-IS-YES TO TRUE
            methodOut.setCrtnSrchFoundSwIsYesTrue();

            methodOut.setCrtnSqlcode(0);
            //  cobolCode::MOVE CACHE-HIPAA-CD ( CACHE-DATA-NDX ) TO CRTN-HIPAA-CD , PRIOR-HIPAA-CD
            methodOut.setCrtnHipaaCd(methodOut.getCacheHipaaCd(methodOut.getCacheDataNdx() - 1));
            methodOut.setPriorHipaaCd(methodOut.getCacheHipaaCd(methodOut.getCacheDataNdx() - 1));
            //  cobolCode::MOVE CACHE-GRNRC-RQST-CD ( CACHE-DATA-NDX ) TO CRTN-GRNRC-RQST-CD ,
            // PRIOR-GRNRC-RQST-CD
            methodOut.setCrtnGrnrcRqstCd(
                methodOut.getCacheGrnrcRqstCd(methodOut.getCacheDataNdx() - 1));
            methodOut.setPriorGrnrcRqstCd(
                methodOut.getCacheGrnrcRqstCd(methodOut.getCacheDataNdx() - 1));
          }
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
   * processCache1500 This method is derived from COBOL Paragraph - 1500-PROCESS-CACHE COBOL
   * Cyclomatic complexity - 12 Input :
   *
   * <p>- crtnFunction COBOL Name: CRTN-FUNCTION - cacheKeyOverflowInd COBOL Name:
   * CACHE-KEY-OVERFLOW-IND - cacheDataOverflowInd COBOL Name: CACHE-DATA-OVERFLOW-IND -
   * crtnSrchKeyPartial COBOL Name: CRTN-SRCH-KEY-PARTIAL - cacheKeyAreaPartial COBOL Name:
   * CACHE-KEY-AREA-PARTIAL - cacheKeyCnt COBOL Name: CACHE-KEY-CNT - binsrchFound COBOL Name:
   * BINSRCH-FOUND - cacheDataOffset COBOL Name: CACHE-DATA-OFFSET - cacheDataNbrOfEntries COBOL
   * Name: CACHE-DATA-NBR-OF-ENTRIES - cacheKeyNdx COBOL Name: CACHE-KEY-NDX - cacheDataTyp COBOL
   * Name: CACHE-DATA-TYP - cacheHipaaCd COBOL Name: CACHE-HIPAA-CD - cacheGrnrcRqstCd COBOL Name:
   * CACHE-GRNRC-RQST-CD
   *
   * <p>Output :
   *
   * <p>- crtnSrchFoundSw COBOL Name: CRTN-SRCH-FOUND-SW - crtnSqlcode COBOL Name: CRTN-SQLCODE -
   * cacheDataNdx COBOL Name: CACHE-DATA-NDX - bcntrFetchOccurrance COBOL Name:
   * BCNTR-FETCH-OCCURRANCE - crtnHipaaCd COBOL Name: CRTN-HIPAA-CD - cacheHipaaCd COBOL Name:
   * CACHE-HIPAA-CD - crtnGrnrcRqstCd COBOL Name: CRTN-GRNRC-RQST-CD - cacheGrnrcRqstCd COBOL Name:
   * CACHE-GRNRC-RQST-CD
   *
   * @throws CFException
   */
  @Override
  public ProcessCache1500OutCtx processCache1500(ProcessCache1500InCtx methodIn) throws Exception {
    // Added variable to get the program context in place.
    C5427hpcCtx programCtx = methodIn.getC5427hpcCtx();
    // Added variable to get the output context in place.
    ProcessCache1500OutCtx methodOut = methodIn.getProcessCache1500OutCtx();
    //  cobolCode::IF CRTN-FUNCTION-IS-OPEN
    if (methodIn.isCrtnFunctionIsOpen()) {

      // *****************************************************************
      // *    If the cache was loaded but it is completely full,         *
      // *    then we check to see if the key we are searching for       *
      // *    is greater than the last key in the cache, if so then      *
      // *    we set the overflow switch and return.                     *
      // *****************************************************************
      // *      if cache-key-cnt = cache-key-array-max
      // *      and crtn-srch-key-partial >
      // *      cache-key-area-partial(cache-key-cnt)
      //  cobolCode::IF ( ( CACHE-KEY-OVERFLOW-YES OR CACHE-DATA-OVERFLOW-YES ) AND
      // CRTN-SRCH-KEY-PARTIAL > CACHE-KEY-AREA-PARTIAL ( CACHE-KEY-CNT ))
      if ((((methodIn.isCacheKeyOverflowYes() || methodIn.isCacheDataOverflowYes()))
          && compareChars(
                  methodIn.getCrtnSrchKeyPartial(),
                  methodIn.getCacheKeyAreaPartial(methodIn.getCacheKeyCnt() - 1))
              > 0)) {
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

        // ***      If cache-data-typ(cache-data-ndx) = 2
        //  cobolCode::IF CACHE-DATA-TYP ( CACHE-DATA-NDX ) = 3
        if ((methodIn.getCacheDataTyp(methodOut.getCacheDataNdx() - 1) == 3)) {
          //  cobolCode::SET CRTN-SRCH-FOUND-SW-IS-YES TO TRUE
          methodOut.setCrtnSrchFoundSwIsYesTrue();

          methodOut.setCrtnSqlcode(0);
          //  cobolCode::MOVE CACHE-HIPAA-CD ( CACHE-DATA-NDX ) TO CRTN-HIPAA-CD
          methodOut.setCrtnHipaaCd(methodOut.getCacheHipaaCd(methodOut.getCacheDataNdx() - 1));
          //  cobolCode::MOVE CACHE-GRNRC-RQST-CD ( CACHE-DATA-NDX ) TO CRTN-GRNRC-RQST-CD
          methodOut.setCrtnGrnrcRqstCd(
              methodOut.getCacheGrnrcRqstCd(methodOut.getCacheDataNdx() - 1));
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
   * processCache2000 This method is derived from COBOL Paragraph - 2000-PROCESS-CACHE COBOL
   * Cyclomatic complexity - 11 Input :
   *
   * <p>- crtnFunction COBOL Name: CRTN-FUNCTION - cacheKeyOverflowInd COBOL Name:
   * CACHE-KEY-OVERFLOW-IND - cacheDataOverflowInd COBOL Name: CACHE-DATA-OVERFLOW-IND - crtnSrchKey
   * COBOL Name: CRTN-SRCH-KEY - cacheKeyArea COBOL Name: CACHE-KEY-AREA - cacheKeyCnt COBOL Name:
   * CACHE-KEY-CNT - binsrchFound COBOL Name: BINSRCH-FOUND - cacheDataOffset COBOL Name:
   * CACHE-DATA-OFFSET - cacheDataNbrOfEntries COBOL Name: CACHE-DATA-NBR-OF-ENTRIES - cacheKeyNdx
   * COBOL Name: CACHE-KEY-NDX - cacheHipaaCd COBOL Name: CACHE-HIPAA-CD
   *
   * <p>Output :
   *
   * <p>- crtnSrchFoundSw COBOL Name: CRTN-SRCH-FOUND-SW - crtnSqlcode COBOL Name: CRTN-SQLCODE -
   * cacheDataNdx COBOL Name: CACHE-DATA-NDX - bcntrFetchOccurrance COBOL Name:
   * BCNTR-FETCH-OCCURRANCE - crtnHipaaCd COBOL Name: CRTN-HIPAA-CD - cacheHipaaCd COBOL Name:
   * CACHE-HIPAA-CD
   *
   * @throws CFException
   */
  @Override
  public ProcessCache2000OutCtx processCache2000(ProcessCache2000InCtx methodIn) throws Exception {
    // Added variable to get the program context in place.
    C5427hpcCtx programCtx = methodIn.getC5427hpcCtx();
    // Added variable to get the output context in place.
    ProcessCache2000OutCtx methodOut = methodIn.getProcessCache2000OutCtx();
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
        // cobolCode::GO TO 2000-EXIT
        return methodOut;
        // cobolCodeEnds::GO TO 2000-EXIT
      }
      //  cobolCode::SET CRTN-SRCH-FOUND-SW-IS-NO TO TRUE
      methodOut.setCrtnSrchFoundSwIsNoTrue();

      //  cobolCode::PERFORM 5100-SEARCH-CACHE THRU 5100-EXIT
      searchCache5100(programCtx.getSearchCache5100InCtx()); /*5100-SEARCH-CACHE*/
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
      // cobolCode::GO TO 2000-EXIT
      return methodOut;
      // cobolCodeEnds::GO TO 2000-EXIT
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
        //  cobolCode::SET CRTN-SRCH-FOUND-SW-IS-YES TO TRUE
        methodOut.setCrtnSrchFoundSwIsYesTrue();

        methodOut.setCrtnSqlcode(0);
        //  cobolCode::MOVE CACHE-HIPAA-CD ( CACHE-DATA-NDX ) TO CRTN-HIPAA-CD
        methodOut.setCrtnHipaaCd(methodOut.getCacheHipaaCd(methodOut.getCacheDataNdx() - 1));
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
   * processCache3000 This method is derived from COBOL Paragraph - 3000-PROCESS-CACHE COBOL
   * Cyclomatic complexity - 6 Input :
   *
   * <p>- cacheKeyOverflowInd COBOL Name: CACHE-KEY-OVERFLOW-IND - cacheDataOverflowInd COBOL Name:
   * CACHE-DATA-OVERFLOW-IND - crtnSrchKey COBOL Name: CRTN-SRCH-KEY - cacheKeyArea COBOL Name:
   * CACHE-KEY-AREA - cacheKeyCnt COBOL Name: CACHE-KEY-CNT - binsrchFound COBOL Name: BINSRCH-FOUND
   * - cacheDataOffset COBOL Name: CACHE-DATA-OFFSET - cacheHipaaCd COBOL Name: CACHE-HIPAA-CD
   *
   * <p>Output :
   *
   * <p>- crtnSrchFoundSw COBOL Name: CRTN-SRCH-FOUND-SW - crtnSqlcode COBOL Name: CRTN-SQLCODE -
   * cacheDataNdx COBOL Name: CACHE-DATA-NDX - crtnHipaaCd COBOL Name: CRTN-HIPAA-CD - cacheHipaaCd
   * COBOL Name: CACHE-HIPAA-CD
   *
   * @throws CFException
   */
  @Override
  public ProcessCache3000OutCtx processCache3000(ProcessCache3000InCtx methodIn) throws Exception {
    // Added variable to get the program context in place.
    C5427hpcCtx programCtx = methodIn.getC5427hpcCtx();
    // Added variable to get the output context in place.
    ProcessCache3000OutCtx methodOut = methodIn.getProcessCache3000OutCtx();

    // *****************************************************************
    // *    If the cache was loaded but it is completely full,         *
    // *    then we check to see if the key we are searching for       *
    // *    is greater than the last key in the cache, if so then      *
    // *    we set the overflow switch and return.                     *
    // *****************************************************************
    // *    if cache-key-cnt = cache-key-array-max
    // *    and crtn-srch-key >
    // *    cache-key-area(cache-key-cnt)
    //  cobolCode::IF ( ( CACHE-KEY-OVERFLOW-YES OR CACHE-DATA-OVERFLOW-YES ) AND ( CRTN-SRCH-KEY >
    // CACHE-KEY-AREA ( CACHE-KEY-CNT )))
    if ((((methodIn.isCacheKeyOverflowYes() || methodIn.isCacheDataOverflowYes()))
        && ((compareChars(
                methodIn.getCrtnSrchKey(), methodIn.getCacheKeyArea(methodIn.getCacheKeyCnt() - 1))
            > 0)))) {
      //  cobolCode::SET CRTN-SRCH-FOUND-SW-IS-OVERFLOW TO TRUE
      methodOut.setCrtnSrchFoundSwIsOverflowTrue();

      methodOut.setCrtnSqlcode(100);
      // cobolCode::GO TO 3000-EXIT
      return methodOut;
      // cobolCodeEnds::GO TO 3000-EXIT
    }
    //  cobolCode::SET CRTN-SRCH-FOUND-SW-IS-NO TO TRUE
    methodOut.setCrtnSrchFoundSwIsNoTrue();

    //  cobolCode::PERFORM 5100-SEARCH-CACHE THRU 5100-EXIT
    searchCache5100(programCtx.getSearchCache5100InCtx()); /*5100-SEARCH-CACHE*/
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

      //  cobolCode::MOVE CACHE-HIPAA-CD ( CACHE-DATA-NDX ) TO CRTN-HIPAA-CD
      methodOut.setCrtnHipaaCd(methodOut.getCacheHipaaCd(methodOut.getCacheDataNdx() - 1));
    }

    return methodOut;
  }
  /**
   * searchCache This method is derived from COBOL Paragraph - 5000-SEARCH-CACHE COBOL Cyclomatic
   * complexity - 7 Input :
   *
   * <p>- cacheKeyCnt COBOL Name: CACHE-KEY-CNT - cacheKeyAreaPartial COBOL Name:
   * CACHE-KEY-AREA-PARTIAL - crtnSrchKeyPartial COBOL Name: CRTN-SRCH-KEY-PARTIAL
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
    C5427hpcCtx programCtx = methodIn.getC5427hpcCtx();
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
    //  cobolCode::IF CACHE-KEY-AREA-PARTIAL (1) > CRTN-SRCH-KEY-PARTIAL OR CACHE-KEY-AREA-PARTIAL (
    // BINSRCH-HIGH ) < CRTN-SRCH-KEY-PARTIAL
    //  cobolCode::ELSE
    if (compareChars(methodIn.getCacheKeyAreaPartial(0), methodIn.getCrtnSrchKeyPartial()) <= 0
        && compareChars(
                methodIn.getCacheKeyAreaPartial(methodOut.getBinsrchHigh() - 1),
                methodIn.getCrtnSrchKeyPartial())
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
                methodIn.getCacheKeyAreaPartial(methodOut.getCacheKeyNdx() - 1),
                methodIn.getCrtnSrchKeyPartial())
            < 0) {
          //  cobolCode::COMPUTE BINSRCH-LOW = BINSRCH-MID + 1 END-COMPUTE
          methodOut.setBinsrchLow(methodOut.getBinsrchMid() + 1);
        } else if (compareChars(
                methodIn.getCacheKeyAreaPartial(methodOut.getCacheKeyNdx() - 1),
                methodIn.getCrtnSrchKeyPartial())
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
   * searchCache5100 This method is derived from COBOL Paragraph - 5100-SEARCH-CACHE COBOL
   * Cyclomatic complexity - 7 Input :
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
  public SearchCache5100OutCtx searchCache5100(SearchCache5100InCtx methodIn) throws Exception {
    // Added variable to get the program context in place.
    C5427hpcCtx programCtx = methodIn.getC5427hpcCtx();
    // Added variable to get the output context in place.
    SearchCache5100OutCtx methodOut = methodIn.getSearchCache5100OutCtx();
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
    C5427hpcCtx programCtx = (C5427hpcCtx) ctx;

    int len = params.length;
    if (len > 1 && params[1] != null) programCtx.getDfhcommarea().set((Field) params[1]);
    // invoke the process and return rc
    return process(programCtx);
  }

  public int call(ProgramContext ctx, Field... parameters) throws Exception {
    C5427hpcCtx programCtx = (C5427hpcCtx) ctx;
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

  public void setFromDphpctsq(C5427hpcCtx programCtx, Object[] params) {
    int len = params.length;
    if (len > 0)
      if (params[0] instanceof Field)
        programCtx.getCicsSession().setString(((Field) params[0]).toCharArray());
      else programCtx.getCicsSession().setString((char[]) params[0]);
    if (len > 1)
      if (params[1] instanceof Field)
        programCtx.getDfhcommarea().setString(((Field) params[1]).toCharArray());
      else programCtx.getDfhcommarea().setString((char[]) params[1]);
  }
}
