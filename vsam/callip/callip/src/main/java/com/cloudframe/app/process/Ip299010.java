  package com.cloudframe.app.process;
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
  
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.global.sharedvar.Ip00054TableEntry;
  import com.cloudframe.app.global.sharedvar.Ip50005TableKey;
  import com.cloudframe.app.process.Ip650010;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.global.sharedvar.Ip00054Table5Key1;
  import com.cloudframe.app.ip299010.dto.*;
  import com.cloudframe.app.ip299010.dto.RecordsLoadedMessage630;
  import com.cloudframe.app.ip299010.dto.Table5Key1800;
  import com.cloudframe.app.ip299010.dto.AbendParaName900;
  import com.cloudframe.app.ip299010.dto.AbendMessage900;
  import com.cloudframe.app.ip299010.dto.OneDayRecLengthError620;
  import com.cloudframe.app.ip299010.dto.TblEntryNotFoundMsg650;
  import com.cloudframe.app.ip299010.dto.Ip00054wTable;
  import com.cloudframe.app.global.sharedvar.Ip50005OneDayRecLthGroup;
  import com.cloudframe.app.global.sharedvar.Ip50005OneDayRec;
  import com.cloudframe.app.global.sharedvar.Ip50005OneDayReadStatusGroup;
  import com.cloudframe.app.global.sharedvar.Ip50005ClearingDtTm;
  import com.cloudframe.app.global.sharedvar.Ip60001EventLogWorkArea;
  import com.cloudframe.app.global.sharedvar.Ip996011ProgramStartMessage;
  import com.cloudframe.app.ip299010.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("ip299010")
  
  public class Ip299010 extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Ip299010.class);
  
  private RecordsLoadedMessage630 recordsLoadedMessage630 = new RecordsLoadedMessage630() ;
  private Table5Key1800 table5Key1800 = new Table5Key1800() ;
  private AbendParaName900 abendParaName900 = new AbendParaName900() ;
  private AbendMessage900 abendMessage900 = new AbendMessage900() ;
  private OneDayRecLengthError620 oneDayRecLengthError620 = new OneDayRecLengthError620() ;
  private TblEntryNotFoundMsg650 tblEntryNotFoundMsg650 = new TblEntryNotFoundMsg650() ;
  private Ip00054wTable ip00054wTable = new Ip00054wTable() ;
  private Work work = new Work() ;
  
  
  
  
  
  
  int ip00054wIdx;
  
  
  
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
//  PERFORM 0000-MAINLINE
          mainline();/*0000-MAINLINE*/
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
      * mainline 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAINLINE COBOL Cyclomatic complexity - 2
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void mainline() throws Exception {
      
// *-----------------------------------------------------------------
// *This para performs a routine to load table 5 and then search
// *the requested key entry.
// *-----------------------------------------------------------------
//  PERFORM 1000-LOAD-TABLE-IP0005T1
          loadTableIp0005t1();/*1000-LOAD-TABLE-IP0005T1*/
          if (this.isProgramEnded()) {
              return ;
          }
//  PERFORM 2000-SEARCH-FOR-VALUE
          searchForValue();/*2000-SEARCH-FOR-VALUE*/
          if (this.isProgramEnded()) {
              return ;
          }
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          this.setProgramEnded(true);
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
      private void loadTableIp0005t1() throws Exception {
      
// *-----------------------------------------------------------------
// *This para first updates the event log and then checks the table
// *load condition.
// *-----------------------------------------------------------------
//  IF 88-100-IT-IS-FIRST-TIME
          if ( work.isItIsFirstTime88100()  ) { 
//  SET 800-PTR-IP650010 TO ENTRY 300-PGM-IP650010
              work.setPtrIp650010800(work.getPgmIp650010300()); 
              
//  MOVE LENGTH OF IP00054-TABLE-ENTRY TO 800-ROW-LENGTH
              work.setRowLength800(Ip00054TableEntry.getIp00054TableEntryFieldLength());
//  PERFORM 1200-LOAD-TBL5-TABLE
              loadTbl5Table();/*1200-LOAD-TBL5-TABLE*/
//  SET 88-100-IT-IS-NOT-FIRST-TIME TO TRUE
              work.setItIsNotFirstTime88100True(); 
              
          }
      
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
      private void loadTbl5Table() throws Exception {
      
// *-----------------------------------------------------------------
// *Then it calls routine to load table 5.
// *-----------------------------------------------------------------
//  PERFORM 1210-INITIALIZE-LOAD
          initializeLoad();/*1210-INITIALIZE-LOAD*/
//  PERFORM 1220-GET-FROM-ONE-DAY-FILE UNTIL 88-100-TABLE-REC-OVER
          while (!(work.isTableRecOver88100()) ) {
             getFromOneDayFile();/*1220-GET-FROM-ONE-DAY-FILE*/
          }
//  PERFORM 1230-DISPLAY-COUNT
          displayCount();/*1230-DISPLAY-COUNT*/
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
      private void initializeLoad() throws Exception {
			// Declare local variables used in the method
			Ip50005TableKey ip50005TableKey = ip50005OneDayRec.getIp50005TableKeyAll().getIp50005TableKey();
			// End of variable declaration

      
// *-----------------------------------------------------------------
// *This paragraph prepares the table 5 key.
// *-----------------------------------------------------------------
//  MOVE 300-TABLE-ID TO IP50005-READ-TABLE-ID
          ip50005TableKey.setIp50005ReadTableId(work.getTableId300());
  
//  MOVE ZEROES TO IP50005-EFF-DATE 400-RECORDS-LOADED
          ip50005TableKey.setIp50005EffDate(0);
          work.setRecordsLoaded400(0);
  
//  SET 88-100-TABLE-REC-NOT-OVER TO TRUE
          work.setTableRecNotOver88100True(); 
          
      
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
      private void getFromOneDayFile() throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph calls routine to read record from one-day-file.
// *-----------------------------------------------------------------
//  CALL 800-PTR-IP650010
          // CALL 800-PTR-IP650010
          	this.setRc( ip650010.process());
//  IF 88-IP50005-ONE-DAY-IO-GOOD
          if ( ip50005OneDayReadStatusGroup.isIp50005OneDayIoGood88()  ) { 
//  PERFORM 1221-LOAD-TO-IP0005T1-TABLE
              loadToIp0005t1Table();/*1221-LOAD-TO-IP0005T1-TABLE*/
//  IF 88-IP50005-TBL-LAST-REC-Y
              if ( ip50005OneDayReadStatusGroup.isIp50005TblLastRecY88()  ) { 
//  SET 88-100-TABLE-REC-OVER TO TRUE
                  work.setTableRecOver88100True(); 
                  
              }
          }
//  ELSE
          else { 
//  MOVE 610-REC-NOT-FOUND-MSG TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(pad(96,work.getRecNotFoundMsg610(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-1220 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(pad(30,work.getPara1220300(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-REC-ABSENT-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getRecAbsentAbendCode300());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError();/*9000-TERMINATE-ON-ERROR*/
          }
      
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
      private void loadToIp0005t1Table() throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph calls routine  to validate length of record read
// *and routine to check whether there is
// *sufficient empty space in local table to load data.
// *-----------------------------------------------------------------
//  PERFORM 1221-10-CHECK-ONEDAY-REC-LEN
          _10CheckOnedayRecLen();/*1221-10-CHECK-ONEDAY-REC-LEN*/
//  PERFORM 1221-11-CHECK-TABLE-LIMIT
          _11CheckTableLimit();/*1221-11-CHECK-TABLE-LIMIT*/
//  MOVE IP50005-TABLE-DATA ( 300-VALUE-ONE : 800-RECORD-LENGTH ) TO IP00054W-TABLE ( 400-START-POINT : 800-RECORD-LENGTH )
          ip00054wTable.replace(ip50005OneDayRec/*parent*/,22+work.getValueOne300() - 1/*fromOffset - (ip00054wTable) */,work.getRecordLength800()/*fromLen*/,0+work.getStartPoint400() - 1/*toOffset - (ip50005TableData) */,work.getRecordLength800()/*toLen*/);
//  ADD 800-RECORD-LENGTH TO 400-START-POINT
          work.setStartPoint400(work.getStartPoint400()+work.getRecordLength800());
//  ADD 800-RECORD-COUNT TO 400-RECORDS-LOADED
          work.setRecordsLoaded400(work.getRecordsLoaded400()+work.getRecordCount800());
      
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
      private void _10CheckOnedayRecLen() throws Exception {
			// Declare local variables used in the method
			int remainder800 = 0;
			// End of variable declaration

      
// *-----------------------------------------------------------------
// *This paragraph checks length of table record read.
// *-----------------------------------------------------------------
//  MOVE IP50005-TABLE-DATA-LENGTH TO 800-RECORD-LENGTH
          work.setRecordLength800((int) ip50005OneDayRecLthGroup.getIp50005TableDataLength());
//  DIVIDE 800-RECORD-LENGTH BY 800-ROW-LENGTH GIVING 800-RECORD-COUNT REMAINDER 800-REMAINDER
          work.setRecordCount800( (int) work.getRecordLength800()/work.getRowLength800());
          work.setRemainder800( (int) work.getRecordLength800()%work.getRowLength800());
//  IF 800-REMAINDER EQUAL ZEROS
          remainder800 = work.getRemainder800();
//  ELSE
          if (	( remainder800 != 0 )) { 
              oneDayRecLengthError620.setErrorLength620(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1522103253,String.valueOf((int) ip50005OneDayRecLthGroup.getIp50005OneDayRecLth())));
              // MOVE 620-ONE-DAY-REC-LENGTH-ERROR TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(oneDayRecLengthError620.toCharArray());
//  MOVE 300-PARA-1221-10 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(pad(30,work.getPara122110300(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-REC-LENGTH-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getRecLengthAbendCode300());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError();/*9000-TERMINATE-ON-ERROR*/
          }
  
      
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
      private void _11CheckTableLimit() throws Exception {
			// Declare local variables used in the method
			int checkCount400 = 0;
			short ip00054wEntries = 0;
			// End of variable declaration

      
// *-----------------------------------------------------------------
// *This paragraph checks the local table overflow condition.
// *-----------------------------------------------------------------
          work.setCheckCount400( ( work.getRecordCount800() + work.getRecordsLoaded400() ) );
          checkCount400 = work.getCheckCount400();
          ip00054wEntries = work.getIp00054wEntries();
//  IF 400-CHECK-COUNT GREATER THAN IP00054W-ENTRIES
          if (	( checkCount400 > ip00054wEntries ) ) { 
//  MOVE 600-TABLE-OVERFLOW-ERROR TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(pad(96,work.getTableOverflowError600(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-1221-11 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(pad(30,work.getPara122111300(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-TBL-OVERFLOW-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getTblOverflowAbendCode300());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError();/*9000-TERMINATE-ON-ERROR*/
          }
  
      
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
      private void displayCount() throws Exception {
      
// *-----------------------------------------------------------------
// *Display table recods read and loaded count.
// *-----------------------------------------------------------------
          recordsLoadedMessage630.setRecLoadedCnt630(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(work.getRecordsLoaded400())));
//  DISPLAY 630-RECORDS-LOADED-MESSAGE
          logger.info(recordsLoadedMessage630.toString()); 
      
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
      private void searchForValue() throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph searches the table 5.
// *-----------------------------------------------------------------
//  PERFORM 2100-LOCATE-TABLE-ID-ON-TBL5
          locateTableIdOnTbl5();/*2100-LOCATE-TABLE-ID-ON-TBL5*/
//  IF 88-100-TABLEID-FOUND
          if ( work.isTableidFound88100()  ) { 
//  PERFORM 2200-SEARCH-TABLE-IP0005T1
              searchTableIp0005t1();/*2200-SEARCH-TABLE-IP0005T1*/
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
      private void locateTableIdOnTbl5() throws Exception {
			// Declare local variables used in the method
			Ip00054Table5Key1 ip00054Table5Key1 = ip00054TableEntry.getIp00054Table5Key1();
			boolean keepSearching = true;
			// End of variable declaration

      
// * This para locates the table entries for which the effective date
// * and time keys is to be found on table 5.
// *-----------------------------------------------------------------
//  MOVE IP00054-KEY-TABLE-ID TO 800-TABLE-ID
          table5Key1800.setTableId800(ip00054Table5Key1.getIp00054KeyTableId());
  
//  SET IP00054W-IDX TO 1
          ip00054wIdx = 1; 
          
//  SET 88-100-TABLEID-FOUND TO TRUE
          work.setTableidFound88100True(); 
          
//  SEARCH IP00054W-ENTRY
          keepSearching = true;
          if(work.getRecordsLoaded400() == 0){ 
          keepSearching = false; 
          }
          while(keepSearching) {
          	if  (		compareChars(ip00054wTable.getIp00054wEntry(ip00054wIdx - 1).getIp00054wTable5Key1(),table5Key1800) == 0 ) { 
              ;
          	break;
          	}
          	ip00054wIdx++;
          	if (ip00054wIdx > work.getRecordsLoaded400()) { 
          	 keepSearching = false;
          	}
          }
          	if(!keepSearching) { 
//  SET 88-100-TABLEID-NOT-FOUND TO TRUE
              work.setTableidNotFound88100True(); 
              
          	}
      
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
      private void searchTableIp0005t1() throws Exception {
			// Declare local variables used in the method
			char[] ip00054ReloadDtTm = null;
			char[] tableId800 = null;
			// End of variable declaration

      
// *-----------------------------------------------------------------
// * This para finds the nearest effective date and time key for the
// * requested table and clearing date and time.
// *-----------------------------------------------------------------
//  SET 88-100-TABLE-KEY-NOT-FOUND TO TRUE
          work.setTableKeyNotFound88100True(); 
          
//  PERFORM UNTIL 88-100-TABLE-KEY-FOUND
          while ((!(work.isTableKeyFound88100()) )) {
              tableId800 = table5Key1800.getTableId800();
//  IF 800-TABLE-ID EQUAL TO IP00054W-KEY-TABLE-ID ( IP00054W-IDX )
              if (		compareChars(tableId800,ip00054wTable.getIp00054wEntry(ip00054wIdx - 1).getIp00054wTable5Key1().getIp00054wKeyTableId()) == 0 ) { 
                  ip00054ReloadDtTm = ip00054TableEntry.getIp00054ReloadDtTm();
//  IF IP00054W-RELOAD-DT-TM ( IP00054W-IDX ) IS LESS THAN OR EQUAL TO IP00054-RELOAD-DT-TM
                  if (		compareChars(ip00054wTable.getIp00054wEntry(ip00054wIdx - 1).getIp00054wReloadDtTm(),ip00054ReloadDtTm) <= 0 ) { 
//  MOVE IP00054W-ENTRY ( IP00054W-IDX ) TO IP00054-TABLE-ENTRY
                      ip00054TableEntry.setString(ip00054wTable.getIp00054wEntry(ip00054wIdx - 1).toCharArray());
//  SET 88-100-TABLE-KEY-FOUND TO TRUE
                      work.setTableKeyFound88100True(); 
                      
                  }
  
//  ELSE
                  else { 
//  SET IP00054W-IDX UP BY 300-VALUE-ONE
                      ip00054wIdx = ip00054wIdx + work.getValueOne300(); 
                      
                  }
              }
  
//  ELSE
              else { 
//  PERFORM 2210-ABEND-FOR-TBL-ABSENT
                  abendForTblAbsent();/*2210-ABEND-FOR-TBL-ABSENT*/
              }
          }
      
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
      private void abendForTblAbsent() throws Exception {
      
// *-----------------------------------------------------------------
// * Abend if requested table entry is not on table 5 for the
// * nearest effetive date and time.
// *-----------------------------------------------------------------
//  MOVE 800-TABLE-ID TO 650-TABLE-ID
          tblEntryNotFoundMsg650.setTableId650(table5Key1800.getTableId800());
//  MOVE IP00054-RELOAD-DT-TM TO 650-EFF-DT-TM
          tblEntryNotFoundMsg650.setEffDtTm650(ip00054TableEntry.getIp00054ReloadDtTm());
          // MOVE 650-TBL-ENTRY-NOT-FOUND-MSG TO 900-ABEND-TEXT IP60001-EVENT-ERROR-MSG
          abendMessage900.setAbendText900(tblEntryNotFoundMsg650.toCharArray());
          ip60001EventLogWorkArea.setIp60001EventErrorMsg(tblEntryNotFoundMsg650.toCharArray());
//  MOVE 300-PARA-2210 TO 900-ABEND-PARA
          abendParaName900.setAbendPara900(pad(30,work.getPara2210300(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-TBL-ENTRY-ABEND-CODE TO 900-ABEND-CODE IP60001-EVENT-ERROR-CODE
          abendMessage900.setAbendCode900(work.getTblEntryAbendCode300());
          ip60001EventLogWorkArea.setIp60001EventErrorCode(work.getTblEntryAbendCode300());
//  PERFORM 9000-TERMINATE-ON-ERROR
          terminateOnError();/*9000-TERMINATE-ON-ERROR*/
          ;
      
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
      private void terminateOnError() throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph displays abend message and calls abend routine.
// *-----------------------------------------------------------------
//  MOVE 900-ABEND-TEXT TO IP60001-EVENT-ERROR-MSG
          ip60001EventLogWorkArea.setIp60001EventErrorMsg(abendMessage900.getAbendText900());
//  MOVE 900-ABEND-CODE TO IP60001-EVENT-ERROR-CODE
          ip60001EventLogWorkArea.setIp60001EventErrorCode(abendMessage900.getAbendCode900());
//  DISPLAY '***********************************'
          logger.info("***********************************"); 
//  DISPLAY 'A B E N D   A B E N D   A B E N D  '
          logger.info("A B E N D   A B E N D   A B E N D  "); 
//  DISPLAY 'A B E N D   I P 2 9 9 0 1 0        '
          logger.info("A B E N D   I P 2 9 9 0 1 0        "); 
//  DISPLAY '***********************************'
          logger.info("***********************************"); 
//  DISPLAY 900-ABEND-PARA-NAME
          logger.info(abendParaName900.toString()); 
//  DISPLAY 900-ABEND-MESSAGE
          logger.info(abendMessage900.toString()); 
      
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
