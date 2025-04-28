  package com.cloudframe.app.process.impl;
  /* 
* element ip299010 as of 07/26/19 08:48:06
*-----------------------------------------------------------------
*          -- -- -- c o n f i d e n t i a l -- -- --
*    this item contains information and procedures which are
*    proprietary to mastercard international, incorporated,
*    and which are confidential.  it is provided with the
*    express understanding that it is to be used only for the
*    benefit of interbank card association, and is not to be
*    used, copied, or disclosed for any other purpose.  any
*    authorized reproduction (in whole or in part) of this
*    material must be marked with this legend.
*-----------------------------------------------------------------
*author.        isc.
*date-written.  october 2000.
*date-compiled. october 2000.
*security.      property of mastercard international, inc.
*-----------------------------------------------------------------
*program functionality: load search api for table 5.
*-----------------------------------------------------------------
*
*when this program is called for first time, it loads all the
*table 5 records, from one-day-file into local table and then
*searches for required record.
*
*if this program is called from clearing supervisor it loads the
*table 5 from db2 and does the search.
*-----------------------------------------------------------------
*revision history:
*-----------------------------------------------------------------
*
*    project         :ses clearing.
*    date            :2000/10/04
*    version         :001.00
*    programmer      :gopinath joshi
*    modification    :initial version
*-----------------------------------------------------------------
*    project         :gcms release 3.1
*    date            :2002/05/03
*    version         :001.03
*    programmer      :isc
*    modification    :modified to call ip996010 to display
*                     execution messages.
*-----------------------------------------------------------------
*    project         : gcms release 10.1 - scr07039
*    date            : 2010/04/16
*    programmer      : wipro
*    modification    : modified to eliminate compiler warning
*                      messages.
*-----------------------------------------------------------------
*    project         :prb64799
*    date            :2016/04/15
*    programmer      :wipro ltd
*    modification    :added depending on 400-records-loaded
*-----------------------------------------------------------------
*/
  
  import com.cloudframe.app.ip299010.Ip299010Ctx.*;
  import com.cloudframe.app.ip299010.Ip299010Ctx;
  import com.cloudframe.app.process.Ip299010;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.global.sharedvar.Ip00054TableEntry;
  import com.cloudframe.app.process.Ip650010;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.process.*;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.ip299010.dto.*;
  import com.cloudframe.app.ip299010.dto.Ip00054wTable;
  import com.cloudframe.app.ip299010.dto.TblEntryNotFoundMsg650;
  import com.cloudframe.app.ip299010.dto.AbendMessage900;
  import com.cloudframe.app.ip299010.dto.AbendParaName900;
  import com.cloudframe.app.ip299010.dto.RecordsLoadedMessage630;
  import com.cloudframe.app.ip299010.dto.OneDayRecLengthError620;
  import com.cloudframe.app.ip299010.dto.Table5Key1800;
  import com.cloudframe.app.global.sharedvar.Ip50005OneDayRecLthGroup;
  import com.cloudframe.app.global.sharedvar.Ip50005OneDayRec;
  import com.cloudframe.app.global.sharedvar.Ip50005OneDayReadStatusGroup;
  import com.cloudframe.app.global.sharedvar.Ip50005ClearingDtTm;
  import com.cloudframe.app.global.sharedvar.Ip60001EventLogWorkArea;
  import com.cloudframe.app.global.sharedvar.Ip996011ProgramStartMessage;
  import com.cloudframe.app.ip299010.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("ip299010")
  
  public class Ip299010Impl extends CommonProcess implements Ip299010 {
  
  Logger logger = LoggerFactory.getLogger(Ip299010Impl.class);
  
  
  
  
  
  
  
  
  
  
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      public int process(Ip299010Ctx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
          ;
//  PERFORM 0000-MAINLINE
          mainline(programCtx);/*0000-MAINLINE*/
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
      * mainline 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAINLINE COBOL Cyclomatic complexity - 2
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void mainline(Ip299010Ctx programCtx) throws Exception {
      
// *-----------------------------------------------------------------
// *This para performs a routine to load table 5 and then search
// *the requested key entry.
// *-----------------------------------------------------------------
//  PERFORM 1000-LOAD-TABLE-IP0005T1
          loadTableIp0005t1(programCtx.getLoadTableIp0005t1InCtx());/*1000-LOAD-TABLE-IP0005T1*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  PERFORM 2000-SEARCH-FOR-VALUE
          searchForValue(programCtx.getSearchForValueInCtx());/*2000-SEARCH-FOR-VALUE*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return ;
      
      }
      /**
      * loadTableIp0005t1 
      *   This method is derived from 
  *   COBOL Paragraph - 1000-LOAD-TABLE-IP0005T1 COBOL Cyclomatic complexity - 3
      * Input  :  

      * - isItTheFirstTime100            COBOL Name: 100-IS-IT-THE-FIRST-TIME
      * - pgmIp650010300                 COBOL Name: 300-PGM-IP650010
      *
      * Output :  

      * - ptrIp650010800                 COBOL Name: 800-PTR-IP650010
      * - rowLength800                   COBOL Name: 800-ROW-LENGTH
      * - isItTheFirstTime100            COBOL Name: 100-IS-IT-THE-FIRST-TIME
      *
      * @throws CFException
      */
      @Override
      public LoadTableIp0005t1OutCtx loadTableIp0005t1(LoadTableIp0005t1InCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *This para first updates the event log and then checks the table
// *load condition.
// *-----------------------------------------------------------------
Ip299010Ctx programCtx = methodIn.getIp299010Ctx();
LoadTableIp0005t1OutCtx methodOut = methodIn.getLoadTableIp0005t1OutCtx();
//  IF 88-100-IT-IS-FIRST-TIME
          if ( methodIn.isItIsFirstTime88100()  ) { 
//  SET 800-PTR-IP650010 TO ENTRY 300-PGM-IP650010
              methodOut.setPtrIp650010800(methodIn.getPgmIp650010300()); 
              
//  MOVE LENGTH OF IP00054-TABLE-ENTRY TO 800-ROW-LENGTH
              methodOut.setRowLength800(Ip00054TableEntry.getIp00054TableEntryFieldLength());
//  PERFORM 1200-LOAD-TBL5-TABLE
              loadTbl5Table(programCtx.getLoadTbl5TableInCtx());/*1200-LOAD-TBL5-TABLE*/
//  SET 88-100-IT-IS-NOT-FIRST-TIME TO TRUE
              methodOut.setItIsNotFirstTime88100True(); 
              
          }
      
      return methodOut;
      }
      /**
      * loadTbl5Table 
      *   This method is derived from 
  *   COBOL Paragraph - 1200-LOAD-TBL5-TABLE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - areTableRecordsOver100         COBOL Name: 100-ARE-TABLE-RECORDS-OVER
      *
      * Output : None 

      * @throws CFException
      */
      @Override
      public void loadTbl5Table(LoadTbl5TableInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *Then it calls routine to load table 5.
// *-----------------------------------------------------------------
Ip299010Ctx programCtx = methodIn.getIp299010Ctx();
//  PERFORM 1210-INITIALIZE-LOAD
          initializeLoad(programCtx.getInitializeLoadInCtx());/*1210-INITIALIZE-LOAD*/
//  PERFORM 1220-GET-FROM-ONE-DAY-FILE UNTIL 88-100-TABLE-REC-OVER
          while (!(methodIn.isTableRecOver88100()) ) {
             getFromOneDayFile(programCtx.getGetFromOneDayFileInCtx());/*1220-GET-FROM-ONE-DAY-FILE*/
          }
//  PERFORM 1230-DISPLAY-COUNT
          displayCount(programCtx.getDisplayCountInCtx());/*1230-DISPLAY-COUNT*/
          ;
      
      }
      /**
      * initializeLoad 
      *   This method is derived from 
  *   COBOL Paragraph - 1210-INITIALIZE-LOAD COBOL Cyclomatic complexity - 1
      * Input  :  

      * - tableId300                     COBOL Name: 300-TABLE-ID
      *
      * Output :  

      * - ip50005ReadTableId             COBOL Name: IP50005-READ-TABLE-ID
      * - tableId300                     COBOL Name: 300-TABLE-ID
      * - ip50005EffDate                 COBOL Name: IP50005-EFF-DATE
      * - recordsLoaded400               COBOL Name: 400-RECORDS-LOADED
      * - areTableRecordsOver100         COBOL Name: 100-ARE-TABLE-RECORDS-OVER
      *
      * @throws CFException
      */
      @Override
      public InitializeLoadOutCtx initializeLoad(InitializeLoadInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph prepares the table 5 key.
// *-----------------------------------------------------------------
Ip299010Ctx programCtx = methodIn.getIp299010Ctx();
InitializeLoadOutCtx methodOut = methodIn.getInitializeLoadOutCtx();
//  MOVE 300-TABLE-ID TO IP50005-READ-TABLE-ID
          methodOut.setIp50005ReadTableId(methodOut.getTableId300());
//  MOVE ZEROES TO IP50005-EFF-DATE 400-RECORDS-LOADED
          methodOut.setIp50005EffDate(0);
          methodOut.setRecordsLoaded400(0);
//  SET 88-100-TABLE-REC-NOT-OVER TO TRUE
          methodOut.setTableRecNotOver88100True(); 
          
      
      return methodOut;
      }
      /**
      * getFromOneDayFile 
      *   This method is derived from 
  *   COBOL Paragraph - 1220-GET-FROM-ONE-DAY-FILE COBOL Cyclomatic complexity - 3
      * Input  :  

      * - ip50005OneDayReadStatus        COBOL Name: IP50005-ONE-DAY-READ-STATUS
      * - recNotFoundMsg610              COBOL Name: 610-REC-NOT-FOUND-MSG
      * - para1220300                    COBOL Name: 300-PARA-1220
      * - recAbsentAbendCode300          COBOL Name: 300-REC-ABSENT-ABEND-CODE
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      * - areTableRecordsOver100         COBOL Name: 100-ARE-TABLE-RECORDS-OVER
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - recNotFoundMsg610              COBOL Name: 610-REC-NOT-FOUND-MSG
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para1220300                    COBOL Name: 300-PARA-1220
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - recAbsentAbendCode300          COBOL Name: 300-REC-ABSENT-ABEND-CODE
      *
      * @throws CFException
      */
      @Override
      public GetFromOneDayFileOutCtx getFromOneDayFile(GetFromOneDayFileInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph calls routine to read record from one-day-file.
// *-----------------------------------------------------------------
Ip299010Ctx programCtx = methodIn.getIp299010Ctx();
GetFromOneDayFileOutCtx methodOut = methodIn.getGetFromOneDayFileOutCtx();
//  CALL 800-PTR-IP650010
          // CALL 800-PTR-IP650010
          	programCtx.setRc( ip650010.process(programCtx.getGlobalCtx().getContext("IP650010")));
//  IF 88-IP50005-ONE-DAY-IO-GOOD
          if ( methodIn.isIp50005OneDayIoGood88()  ) { 
//  PERFORM 1221-LOAD-TO-IP0005T1-TABLE
              loadToIp0005t1Table(programCtx.getLoadToIp0005t1TableInCtx());/*1221-LOAD-TO-IP0005T1-TABLE*/
//  IF 88-IP50005-TBL-LAST-REC-Y
              if ( methodIn.isIp50005TblLastRecY88()  ) { 
//  SET 88-100-TABLE-REC-OVER TO TRUE
                  methodOut.setTableRecOver88100True(); 
                  
              }
          }
//  ELSE
          else { 
//  MOVE 610-REC-NOT-FOUND-MSG TO 900-ABEND-TEXT
              methodOut.setAbendText900(pad(96,methodOut.getRecNotFoundMsg610(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-1220 TO 900-ABEND-PARA
              methodOut.setAbendPara900(pad(30,methodOut.getPara1220300(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-REC-ABSENT-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getRecAbsentAbendCode300());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError(programCtx.getTerminateOnErrorInCtx());/*9000-TERMINATE-ON-ERROR*/
          }
      
      return methodOut;
      }
      /**
      * loadToIp0005t1Table 
      *   This method is derived from 
  *   COBOL Paragraph - 1221-LOAD-TO-IP0005T1-TABLE COBOL Cyclomatic complexity - 1
      * Input  :  

      * - ip50005TableData               COBOL Name: IP50005-TABLE-DATA
      * - startPoint400                  COBOL Name: 400-START-POINT
      * - recordLength800                COBOL Name: 800-RECORD-LENGTH
      * - recordsLoaded400               COBOL Name: 400-RECORDS-LOADED
      * - recordCount800                 COBOL Name: 800-RECORD-COUNT
      *
      * Output :  

      * - ip00054wTable                  COBOL Name: IP00054W-TABLE
      * - ip50005TableData               COBOL Name: IP50005-TABLE-DATA
      * - startPoint400                  COBOL Name: 400-START-POINT
      * - recordsLoaded400               COBOL Name: 400-RECORDS-LOADED
      *
      * @throws CFException
      */
      @Override
      public LoadToIp0005t1TableOutCtx loadToIp0005t1Table(LoadToIp0005t1TableInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph calls routine  to validate length of record read
// *and routine to check whether there is
// *sufficient empty space in local table to load data.
// *-----------------------------------------------------------------
Ip299010Ctx programCtx = methodIn.getIp299010Ctx();
LoadToIp0005t1TableOutCtx methodOut = methodIn.getLoadToIp0005t1TableOutCtx();
//  PERFORM 1221-10-CHECK-ONEDAY-REC-LEN
          _10CheckOnedayRecLen(programCtx.get_10CheckOnedayRecLenInCtx());/*1221-10-CHECK-ONEDAY-REC-LEN*/
//  PERFORM 1221-11-CHECK-TABLE-LIMIT
          _11CheckTableLimit(programCtx.get_11CheckTableLimitInCtx());/*1221-11-CHECK-TABLE-LIMIT*/
//  MOVE IP50005-TABLE-DATA ( 300-VALUE-ONE : 800-RECORD-LENGTH ) TO IP00054W-TABLE ( 400-START-POINT : 800-RECORD-LENGTH )
          methodOut.getIp00054wTable().replace(methodIn.getIp50005OneDayRec()/*parent*/,22+methodIn.getValueOne300() - 1/*fromOffset - (ip00054wTable) */,methodIn.getRecordLength800()/*fromLen*/,0+methodOut.getStartPoint400() - 1/*toOffset - (ip50005TableData) */,methodIn.getRecordLength800()/*toLen*/);
//  ADD 800-RECORD-LENGTH TO 400-START-POINT
          methodOut.setStartPoint400(methodOut.getStartPoint400()+methodIn.getRecordLength800());
//  ADD 800-RECORD-COUNT TO 400-RECORDS-LOADED
          methodOut.setRecordsLoaded400(methodOut.getRecordsLoaded400()+methodIn.getRecordCount800());
      
      return methodOut;
      }
      /**
      * _10CheckOnedayRecLen 
      *   This method is derived from 
  *   COBOL Paragraph - 1221-10-CHECK-ONEDAY-REC-LEN COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ip50005TableDataLength         COBOL Name: IP50005-TABLE-DATA-LENGTH
      * - ip50005OneDayRecLth            COBOL Name: IP50005-ONE-DAY-REC-LTH
      * - oneDayRecLengthError620        COBOL Name: 620-ONE-DAY-REC-LENGTH-ERROR
      * - para122110300                  COBOL Name: 300-PARA-1221-10
      * - recLengthAbendCode300          COBOL Name: 300-REC-LENGTH-ABEND-CODE
      *
      * Output :  

      * - recordLength800                COBOL Name: 800-RECORD-LENGTH
      * - ip50005TableDataLength         COBOL Name: IP50005-TABLE-DATA-LENGTH
      * - recordCount800                 COBOL Name: 800-RECORD-COUNT
      * - remainder800                   COBOL Name: 800-REMAINDER
      * - errorLength620                 COBOL Name: 620-ERROR-LENGTH
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - oneDayRecLengthError620        COBOL Name: 620-ONE-DAY-REC-LENGTH-ERROR
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para122110300                  COBOL Name: 300-PARA-1221-10
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - recLengthAbendCode300          COBOL Name: 300-REC-LENGTH-ABEND-CODE
      *
      * @throws CFException
      */
      @Override
      public _10CheckOnedayRecLenOutCtx _10CheckOnedayRecLen(_10CheckOnedayRecLenInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph checks length of table record read.
// *-----------------------------------------------------------------
Ip299010Ctx programCtx = methodIn.getIp299010Ctx();
_10CheckOnedayRecLenOutCtx methodOut = methodIn.get_10CheckOnedayRecLenOutCtx();
//  MOVE IP50005-TABLE-DATA-LENGTH TO 800-RECORD-LENGTH
          methodOut.setRecordLength800((int) methodOut.getIp50005TableDataLength());
//  DIVIDE 800-RECORD-LENGTH BY 800-ROW-LENGTH GIVING 800-RECORD-COUNT REMAINDER 800-REMAINDER
          methodOut.setRecordCount800( (int) methodOut.getRecordLength800()/methodIn.getRowLength800());
          methodOut.setRemainder800( (int) methodOut.getRecordLength800()%methodIn.getRowLength800());
//  IF 800-REMAINDER EQUAL ZEROS
//  ELSE
          if (	( methodOut.getRemainder800() != 0 )) { 
              methodOut.setErrorLength620(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1522103253,String.valueOf((int) methodIn.getIp50005OneDayRecLth())));
              // MOVE 620-ONE-DAY-REC-LENGTH-ERROR TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getOneDayRecLengthError620().toCharArray());
//  MOVE 300-PARA-1221-10 TO 900-ABEND-PARA
              methodOut.setAbendPara900(pad(30,methodOut.getPara122110300(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-REC-LENGTH-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getRecLengthAbendCode300());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError(programCtx.getTerminateOnErrorInCtx());/*9000-TERMINATE-ON-ERROR*/
          }
      
      return methodOut;
      }
      /**
      * _11CheckTableLimit 
      *   This method is derived from 
  *   COBOL Paragraph - 1221-11-CHECK-TABLE-LIMIT COBOL Cyclomatic complexity - 2
      * Input  :  

      * - recordCount800                 COBOL Name: 800-RECORD-COUNT
      * - recordsLoaded400               COBOL Name: 400-RECORDS-LOADED
      * - ip00054wEntries                COBOL Name: IP00054W-ENTRIES
      * - tableOverflowError600          COBOL Name: 600-TABLE-OVERFLOW-ERROR
      * - para122111300                  COBOL Name: 300-PARA-1221-11
      * - tblOverflowAbendCode300        COBOL Name: 300-TBL-OVERFLOW-ABEND-CODE
      *
      * Output :  

      * - checkCount400                  COBOL Name: 400-CHECK-COUNT
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - tableOverflowError600          COBOL Name: 600-TABLE-OVERFLOW-ERROR
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para122111300                  COBOL Name: 300-PARA-1221-11
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - tblOverflowAbendCode300        COBOL Name: 300-TBL-OVERFLOW-ABEND-CODE
      *
      * @throws CFException
      */
      @Override
      public _11CheckTableLimitOutCtx _11CheckTableLimit(_11CheckTableLimitInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph checks the local table overflow condition.
// *-----------------------------------------------------------------
Ip299010Ctx programCtx = methodIn.getIp299010Ctx();
_11CheckTableLimitOutCtx methodOut = methodIn.get_11CheckTableLimitOutCtx();
          methodOut.setCheckCount400( ( methodIn.getRecordCount800() + methodIn.getRecordsLoaded400() ) );
//  IF 400-CHECK-COUNT GREATER THAN IP00054W-ENTRIES
          if (	( methodOut.getCheckCount400() > methodIn.getIp00054wEntries() ) ) { 
//  MOVE 600-TABLE-OVERFLOW-ERROR TO 900-ABEND-TEXT
              methodOut.setAbendText900(pad(96,methodOut.getTableOverflowError600(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-1221-11 TO 900-ABEND-PARA
              methodOut.setAbendPara900(pad(30,methodOut.getPara122111300(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-TBL-OVERFLOW-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getTblOverflowAbendCode300());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError(programCtx.getTerminateOnErrorInCtx());/*9000-TERMINATE-ON-ERROR*/
          }
      
      return methodOut;
      }
      /**
      * displayCount 
      *   This method is derived from 
  *   COBOL Paragraph - 1230-DISPLAY-COUNT COBOL Cyclomatic complexity - 1
      * Input  :  

      * - recordsLoaded400               COBOL Name: 400-RECORDS-LOADED
      * - recordsLoadedMessage630        COBOL Name: 630-RECORDS-LOADED-MESSAGE
      *
      * Output :  

      * - recLoadedCnt630                COBOL Name: 630-REC-LOADED-CNT
      *
      * @throws CFException
      */
      @Override
      public DisplayCountOutCtx displayCount(DisplayCountInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *Display table recods read and loaded count.
// *-----------------------------------------------------------------
Ip299010Ctx programCtx = methodIn.getIp299010Ctx();
DisplayCountOutCtx methodOut = methodIn.getDisplayCountOutCtx();
          methodOut.setRecLoadedCnt630(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(methodIn.getRecordsLoaded400())));
//  DISPLAY 630-RECORDS-LOADED-MESSAGE
          logger.info(methodIn.getRecordsLoadedMessage630().toString()); 
      
      return methodOut;
      }
      /**
      * searchForValue 
      *   This method is derived from 
  *   COBOL Paragraph - 2000-SEARCH-FOR-VALUE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - isTblidFndIntable5100          COBOL Name: 100-IS-TBLID-FND-INTABLE5
      *
      * Output : None 

      * @throws CFException
      */
      @Override
      public void searchForValue(SearchForValueInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph searches the table 5.
// *-----------------------------------------------------------------
Ip299010Ctx programCtx = methodIn.getIp299010Ctx();
//  PERFORM 2100-LOCATE-TABLE-ID-ON-TBL5
          locateTableIdOnTbl5(programCtx.getLocateTableIdOnTbl5InCtx());/*2100-LOCATE-TABLE-ID-ON-TBL5*/
//  IF 88-100-TABLEID-FOUND
          if ( methodIn.isTableidFound88100()  ) { 
//  PERFORM 2200-SEARCH-TABLE-IP0005T1
              searchTableIp0005t1(programCtx.getSearchTableIp0005t1InCtx());/*2200-SEARCH-TABLE-IP0005T1*/
          }
      
      }
      /**
      * locateTableIdOnTbl5 
      *   This method is derived from 
  *   COBOL Paragraph - 2100-LOCATE-TABLE-ID-ON-TBL5 COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ip00054KeyTableId              COBOL Name: IP00054-KEY-TABLE-ID
      * - ip00054wEntry                  COBOL Name: IP00054W-ENTRY
      * - ip00054wTable5Key1             COBOL Name: IP00054W-TABLE-5-KEY-1
      * - table5Key1800                  COBOL Name: 800-TABLE-5-KEY-1
      *
      * Output :  

      * - tableId800                     COBOL Name: 800-TABLE-ID
      * - ip00054KeyTableId              COBOL Name: IP00054-KEY-TABLE-ID
      * - ip00054wIdx                    COBOL Name: IP00054W-IDX
      * - isTblidFndIntable5100          COBOL Name: 100-IS-TBLID-FND-INTABLE5
      *
      * @throws CFException
      */
      @Override
      public LocateTableIdOnTbl5OutCtx locateTableIdOnTbl5(LocateTableIdOnTbl5InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			boolean keepSearching = true;
			// End of variable declaration

      
// * This para locates the table entries for which the effective date
// * and time keys is to be found on table 5.
// *-----------------------------------------------------------------
Ip299010Ctx programCtx = methodIn.getIp299010Ctx();
LocateTableIdOnTbl5OutCtx methodOut = methodIn.getLocateTableIdOnTbl5OutCtx();
//  MOVE IP00054-KEY-TABLE-ID TO 800-TABLE-ID
          methodOut.setTableId800(methodOut.getIp00054KeyTableId());
//  SET IP00054W-IDX TO 1
          methodOut.setIp00054wIdx(1); 
          
//  SET 88-100-TABLEID-FOUND TO TRUE
          methodOut.setTableidFound88100True(); 
          
//  SEARCH IP00054W-ENTRY
          keepSearching = true;
          if(methodIn.getRecordsLoaded400() == 0){ 
          keepSearching = false; 
          }
          while(keepSearching) {
          	if  (		compareChars(methodIn.getIp00054wTable5Key1(methodOut.getIp00054wIdx() - 1),methodIn.getTable5Key1800()) == 0 ) { 
              ;
          	break;
          	}
          	methodOut.setIp00054wIdx(methodOut.getIp00054wIdx() + 1);
          	if (methodOut.getIp00054wIdx() > methodIn.getRecordsLoaded400()) { 
          	 keepSearching = false;
          	}
          }
          	if(!keepSearching) { 
//  SET 88-100-TABLEID-NOT-FOUND TO TRUE
              methodOut.setTableidNotFound88100True(); 
              
          	}
      
      return methodOut;
      }
      /**
      * searchTableIp0005t1 
      *   This method is derived from 
  *   COBOL Paragraph - 2200-SEARCH-TABLE-IP0005T1 COBOL Cyclomatic complexity - 5
      * Input  :  

      * - tableId800                     COBOL Name: 800-TABLE-ID
      * - ip00054wKeyTableId             COBOL Name: IP00054W-KEY-TABLE-ID
      * - ip00054wIdx                    COBOL Name: IP00054W-IDX
      * - ip00054wReloadDtTm             COBOL Name: IP00054W-RELOAD-DT-TM
      * - ip00054ReloadDtTm              COBOL Name: IP00054-RELOAD-DT-TM
      * - ip00054wEntry                  COBOL Name: IP00054W-ENTRY
      *
      * Output :  

      * - isTableKeyFound100             COBOL Name: 100-IS-TABLE-KEY-FOUND
      * - ip00054TableEntry              COBOL Name: IP00054-TABLE-ENTRY
      * - ip00054wEntry                  COBOL Name: IP00054W-ENTRY
      * - ip00054wIdx                    COBOL Name: IP00054W-IDX
      *
      * @throws CFException
      */
      @Override
      public SearchTableIp0005t1OutCtx searchTableIp0005t1(SearchTableIp0005t1InCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// * This para finds the nearest effective date and time key for the
// * requested table and clearing date and time.
// *-----------------------------------------------------------------
Ip299010Ctx programCtx = methodIn.getIp299010Ctx();
SearchTableIp0005t1OutCtx methodOut = methodIn.getSearchTableIp0005t1OutCtx();
//  SET 88-100-TABLE-KEY-NOT-FOUND TO TRUE
          methodOut.setTableKeyNotFound88100True(); 
          
//  PERFORM UNTIL 88-100-TABLE-KEY-FOUND
          while ((!(methodOut.isTableKeyFound88100()) )) {
//  IF 800-TABLE-ID EQUAL TO IP00054W-KEY-TABLE-ID ( IP00054W-IDX )
              if (		compareChars(methodIn.getTableId800(),methodIn.getIp00054wKeyTableId(methodOut.getIp00054wIdx() - 1)) == 0 ) { 
//  IF IP00054W-RELOAD-DT-TM ( IP00054W-IDX ) IS LESS THAN OR EQUAL TO IP00054-RELOAD-DT-TM
                  if (		compareChars(methodIn.getIp00054wReloadDtTm(methodOut.getIp00054wIdx() - 1),methodIn.getIp00054ReloadDtTm()) <= 0 ) { 
//  MOVE IP00054W-ENTRY ( IP00054W-IDX ) TO IP00054-TABLE-ENTRY
                      methodOut.getIp00054TableEntry().setString(methodOut.getIp00054wEntry(methodOut.getIp00054wIdx() - 1).toCharArray());
//  SET 88-100-TABLE-KEY-FOUND TO TRUE
                      methodOut.setTableKeyFound88100True(); 
                      
                  }
//  ELSE
                  else { 
//  SET IP00054W-IDX UP BY 300-VALUE-ONE
                      methodOut.setIp00054wIdx(methodOut.getIp00054wIdx() + methodIn.getValueOne300()); 
                      
                  }
              }
//  ELSE
              else { 
//  PERFORM 2210-ABEND-FOR-TBL-ABSENT
                  abendForTblAbsent(programCtx.getAbendForTblAbsentInCtx());/*2210-ABEND-FOR-TBL-ABSENT*/
              }
          }
      
      return methodOut;
      }
      /**
      * abendForTblAbsent 
      *   This method is derived from 
  *   COBOL Paragraph - 2210-ABEND-FOR-TBL-ABSENT COBOL Cyclomatic complexity - 1
      * Input  :  

      * - tableId800                     COBOL Name: 800-TABLE-ID
      * - ip00054ReloadDtTm              COBOL Name: IP00054-RELOAD-DT-TM
      * - tblEntryNotFoundMsg650         COBOL Name: 650-TBL-ENTRY-NOT-FOUND-MSG
      * - para2210300                    COBOL Name: 300-PARA-2210
      * - tblEntryAbendCode300           COBOL Name: 300-TBL-ENTRY-ABEND-CODE
      *
      * Output :  

      * - tableId650                     COBOL Name: 650-TABLE-ID
      * - tableId800                     COBOL Name: 800-TABLE-ID
      * - effDtTm650                     COBOL Name: 650-EFF-DT-TM
      * - ip00054ReloadDtTm              COBOL Name: IP00054-RELOAD-DT-TM
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - ip60001EventErrorMsg           COBOL Name: IP60001-EVENT-ERROR-MSG
      * - tblEntryNotFoundMsg650         COBOL Name: 650-TBL-ENTRY-NOT-FOUND-MSG
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para2210300                    COBOL Name: 300-PARA-2210
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - ip60001EventErrorCode          COBOL Name: IP60001-EVENT-ERROR-CODE
      * - tblEntryAbendCode300           COBOL Name: 300-TBL-ENTRY-ABEND-CODE
      *
      * @throws CFException
      */
      @Override
      public AbendForTblAbsentOutCtx abendForTblAbsent(AbendForTblAbsentInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// * Abend if requested table entry is not on table 5 for the
// * nearest effetive date and time.
// *-----------------------------------------------------------------
Ip299010Ctx programCtx = methodIn.getIp299010Ctx();
AbendForTblAbsentOutCtx methodOut = methodIn.getAbendForTblAbsentOutCtx();
//  MOVE 800-TABLE-ID TO 650-TABLE-ID
          methodOut.setTableId650(methodOut.getTableId800());
//  MOVE IP00054-RELOAD-DT-TM TO 650-EFF-DT-TM
          methodOut.setEffDtTm650(methodOut.getIp00054ReloadDtTm());
          // MOVE 650-TBL-ENTRY-NOT-FOUND-MSG TO 900-ABEND-TEXT IP60001-EVENT-ERROR-MSG
          methodOut.setAbendText900(methodOut.getTblEntryNotFoundMsg650().toCharArray());
          methodOut.setIp60001EventErrorMsg(methodOut.getTblEntryNotFoundMsg650().toCharArray());
//  MOVE 300-PARA-2210 TO 900-ABEND-PARA
          methodOut.setAbendPara900(pad(30,methodOut.getPara2210300(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-TBL-ENTRY-ABEND-CODE TO 900-ABEND-CODE IP60001-EVENT-ERROR-CODE
          methodOut.setAbendCode900(methodOut.getTblEntryAbendCode300());
          methodOut.setIp60001EventErrorCode(methodOut.getTblEntryAbendCode300());
//  PERFORM 9000-TERMINATE-ON-ERROR
          terminateOnError(programCtx.getTerminateOnErrorInCtx());/*9000-TERMINATE-ON-ERROR*/
          ;
      
      return methodOut;
      }
      /**
      * terminateOnError 
      *   This method is derived from 
  *   COBOL Paragraph - 9000-TERMINATE-ON-ERROR COBOL Cyclomatic complexity - 1
      * Input  :  

      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - abendParaName900               COBOL Name: 900-ABEND-PARA-NAME
      * - abendMessage900                COBOL Name: 900-ABEND-MESSAGE
      *
      * Output :  

      * - ip60001EventErrorMsg           COBOL Name: IP60001-EVENT-ERROR-MSG
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - ip60001EventErrorCode          COBOL Name: IP60001-EVENT-ERROR-CODE
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      *
      * @throws CFException
      */
      @Override
      public TerminateOnErrorOutCtx terminateOnError(TerminateOnErrorInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph displays abend message and calls abend routine.
// *-----------------------------------------------------------------
Ip299010Ctx programCtx = methodIn.getIp299010Ctx();
TerminateOnErrorOutCtx methodOut = methodIn.getTerminateOnErrorOutCtx();
//  MOVE 900-ABEND-TEXT TO IP60001-EVENT-ERROR-MSG
          methodOut.setIp60001EventErrorMsg(methodOut.getAbendText900());
//  MOVE 900-ABEND-CODE TO IP60001-EVENT-ERROR-CODE
          methodOut.setIp60001EventErrorCode(methodOut.getAbendCode900());
//  DISPLAY '***********************************'
          logger.info("***********************************"); 
//  DISPLAY 'A B E N D   A B E N D   A B E N D  '
          logger.info("A B E N D   A B E N D   A B E N D  "); 
//  DISPLAY 'A B E N D   I P 2 9 9 0 1 0        '
          logger.info("A B E N D   I P 2 9 9 0 1 0        "); 
//  DISPLAY '***********************************'
          logger.info("***********************************"); 
//  DISPLAY 900-ABEND-PARA-NAME
          logger.info(methodIn.getAbendParaName900().toString()); 
//  DISPLAY 900-ABEND-MESSAGE
          logger.info(methodIn.getAbendMessage900().toString()); 
      
      return methodOut;
      }
  
  
  
  
  
  
  
  
  }
