  package com.cloudframe.app.process;
  /* 
* element ip282210 as of 12/06/21 07:03:54                    [vc]
*$set noamode
*----------------------------------------------------------------*
*          -- -- -- c o n f i d e n t i a l -- -- --             *
*    this item contains information and procedures which are     *
*    proprietary to mastercard international, incorporated,      *
*    and which are confidential.  it is provided with the        *
*    express understanding that it is to be used only for the    *
*    benefit of interbank card association, and is not to be     *
*    used, copied, or disclosed for any other purpose.  any      *
*    authorized reproduction (in whole or in part) of this       *
*    material must be marked with this legend.                   *
*----------------------------------------------------------------*
*author       : wipro                                            *
*date-written : may 2012                                         *
*date-compiled: may 2012                                         *
*security     : property of mastercard international, inc.       *
*----------------------------------------------------------------*
*program function: load api for table 201.                       *
*----------------------------------------------------------------*
*                                                                *
*this is a load and search module for table ip0201t1.            *
*                                                                *
*the calling program populates the acquirer reference bin in the *
*external copybook ip020104 to fetch all the processing agreement*
*ids from the table 201 relevant to the member id passed.        *
*                                                                *
*when this program is called for first time, it loads all the    *
*table 201 rows, from one-day-file into the internal table.      *
*then searches the table for the required member id entry.       *
*                                                                *
*if program executes subsequently, it searches for required row  *
*in the internal table itself unless the table needs a reload.   *
*                                                                *
*if required row is found in table, it is copied to external area*
*                                                                *
*----------------------------------------------------------------*
*revision history:                                               *
*----------------------------------------------------------------*
* project       : gcms 13.q3- russia onsoil                      *
* date          : 2013/07/19                                     *
* programmer    : wipro                                          *
* modification  : initial version                                *
*----------------------------------------------------------------*
* project       : gcms release 17.q1 - c81979                    *
*                 china on-soil clearing cycles less than 7      *
* date          : 2017/01/20                                     *
* programmer    : wipro                                          *
* modification  : modified 1312-load-to-ip02015t1-table para     *
*                 to return the new processing agreement data    *
*----------------------------------------------------------------*
* project       : gcms release 17.q4 - c97428                    *
*                 nspk on-us msgs route to gcms                  *
* date          : 2017/10/13                                     *
* programmer    : wipro                                          *
* modification  : modified 1312-load-to-ip02015t1-table para     *
*               : to return the new processing agreement data    *
*               : with the new field on-us-prcss-agrmt-id.       *
*----------------------------------------------------------------*
*    project         :release 18.4 # i6959                       *
*                     lcms and mds batch on-soil migration       *
*    date            :2018/10/20                                 *
*    programmer      :wipro                                      *
*    modification    :depending on count variable should be set  *
*                     before loading the values to the internal  *
*                     table and program modified to include the  *
*                     compiler directives to support in linux    *
*----------------------------------------------------------------*
*    project         :gcms release 18.q4 - i8682                 *
*                     indonesia on soil                          *
*    date            :2018/10/12                                 *
*    programmer      :wipro                                      *
*    modification    :added code to populate oper-sys-id and     *
*                     db-id.                                     *
*----------------------------------------------------------------*
*    project         :gcms release 20.q4 - i15084                *
*                     india onsoil - lcms deployment             *
*    date            :2020/10/16                                 *
*    programmer      :wipro                                      *
*    modification    :added code to load below 3 indicator       *
*                     in para 1312-load-to-ip02015t1-table       *
*                     1)acquirer-split-sw                        *
*                     2)push-onsoil-sw                           *
*                     3)incontrol-onsoil-sw                      *
*----------------------------------------------------------------*
*    project         :lcms india on-soil (proj # e34924)         *
*    date            :2022/01/22                                 *
*    programmer      :wipro                                      *
*    modification    :modified the program to change the field   *
*                     names in the move statement as per copybook*
*                     ip020104 & ip020105.                       *
*                     removed the logic related to load db2.     *
*----------------------------------------------------------------*
*/
  
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import org.springframework.web.bind.annotation.RequestParam;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.global.sharedvar.Ip02014PrcssAgrmtTable;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.process.Ip996010;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.global.sharedvar.Ip00054Table5Key1;
  import com.cloudframe.app.process.Ip299010;
  import com.cloudframe.app.global.sharedvar.Ip50005TableKey;
  import com.cloudframe.app.process.Ip650010;
  import com.cloudframe.app.global.sharedvar.Ip02014lTableDataKey;
  import com.cloudframe.app.global.sharedvar.Ip02014TableDataKey;
  import com.cloudframe.app.global.sharedvar.Ip02015PrcssAgrmtTabEnt;
  import com.cloudframe.app.process.Ip610010;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.ip282210.dto.*;
  import com.cloudframe.app.ip282210.dto.Ip28221PaTableRestart;
  import com.cloudframe.app.ip282210.dto.OneDayRecLengthError620;
  import com.cloudframe.app.global.sharedvar.Ip50005ClearingDtTm;
  import com.cloudframe.app.ip282210.dto.Ip29991TableLoadSizeInfo;
  import com.cloudframe.app.ip282210.dto.AbendMessage900;
  import com.cloudframe.app.ip282210.dto.AbendParaName900;
  import com.cloudframe.app.global.sharedvar.Ip02014wTable;
  import com.cloudframe.app.global.sharedvar.Ip02014lPrcssAgrmtTable;
  import com.cloudframe.app.global.sharedvar.Ip00054TableEntry;
  import com.cloudframe.app.global.sharedvar.Ip50005OneDayRecLthGroup;
  import com.cloudframe.app.global.sharedvar.Ip50005OneDayRec;
  import com.cloudframe.app.global.sharedvar.Ip50005OneDayReadStatusGroup;
  import com.cloudframe.app.global.sharedvar.Ip60001EventLogWorkArea;
  import com.cloudframe.app.global.sharedvar.Ip02014wEntriesCntGroup;
  import com.cloudframe.app.global.sharedvar.Ip02015PrcssAgrmtTable;
  import com.cloudframe.app.global.sharedvar.Ip996011ProgramStartMessage;
  import com.cloudframe.app.ip282210.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("ip282210")
  
  public class Ip282210 extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Ip282210.class);
  
  private Ip28221PaTableRestart ip28221PaTableRestart = new Ip28221PaTableRestart() ;
  private OneDayRecLengthError620 oneDayRecLengthError620 = new OneDayRecLengthError620() ;
  private Ip29991TableLoadSizeInfo ip29991TableLoadSizeInfo = new Ip29991TableLoadSizeInfo() ;
  private AbendMessage900 abendMessage900 = new AbendMessage900() ;
  private AbendParaName900 abendParaName900 = new AbendParaName900() ;
  private Work work = new Work() ;
  
  
  
  @Autowired 
  @Qualifier("ip299010")
  Ip299010 ip299010;
  @Autowired 
  @Qualifier("ip650010")
  Ip650010 ip650010;
  @Autowired 
  @Qualifier("global_ip02014wTable")
  Ip02014wTable ip02014wTable;
  @Autowired 
  @Qualifier("global_ip02014lPrcssAgrmtTable")
  Ip02014lPrcssAgrmtTable ip02014lPrcssAgrmtTable;
  @Autowired 
  @Qualifier("global_ip00054TableEntry")
  Ip00054TableEntry ip00054TableEntry;
  @Autowired 
  @Qualifier("global_ip02014wEntriesCntGroup")
  Ip02014wEntriesCntGroup ip02014wEntriesCntGroup;
  
  
  
  int ip02015PaIndex;
  int ip02014wPaIndex;
  
  
  
      public int setParameter(String ip28221PaTableRestart) throws Exception {
      		if(ip28221PaTableRestart != null)
      		    this.ip28221PaTableRestart.setString(com.cloudframe.app.data.Field.getParm(ip28221PaTableRestart),new String(CONSTANTS.EBCDIC_ENCODING));
      		setInitDone(false);
      		process();
      		return getRc();
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
      
// *----------------------------------------------------------------*
// *This para performs a routine to read and load table 201         *
// *----------------------------------------------------------------*
//  PERFORM 1000-LOAD-TABLE-IP0201T1
          loadTableIp0201t1();/*1000-LOAD-TABLE-IP0201T1*/
          if (this.isProgramEnded()) {
              return ;
          }
//  PERFORM 2000-POPULATE-LPA-ENTRY
          populateLpaEntry();/*2000-POPULATE-LPA-ENTRY*/
          if (this.isProgramEnded()) {
              return ;
          }
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          this.setProgramEnded(true);
          return ;
      
      }
      /**
      * loadTableIp0201t1 
      *   This method is derived from 
  *   COBOL Paragraph - 1000-LOAD-TABLE-IP0201T1 COBOL Cyclomatic complexity - 7
      * Input  :  

      * - lpaLoader300                   COBOL Name: 300-LPA-LOADER
      * - ip28221Restart                 COBOL Name: IP28221-RESTART
      * - pgmIp299010300                 COBOL Name: 300-PGM-IP299010
      * - pgmIp650010300                 COBOL Name: 300-PGM-IP650010
      * - abendPgm300                    COBOL Name: 300-ABEND-PGM
      * - ip50005ClearingDtTm            COBOL Name: IP50005-CLEARING-DT-TM
      *
      * Output :  

      * - ip60001HoldPgmName             COBOL Name: IP60001-HOLD-PGM-NAME
      * - lpaLoader300                   COBOL Name: 300-LPA-LOADER
      * - isItTheFirstTime100            COBOL Name: 100-IS-IT-THE-FIRST-TIME
      * - ptrIp299010800                 COBOL Name: 800-PTR-IP299010
      * - ptrIp650010800                 COBOL Name: 800-PTR-IP650010
      * - abendPtr800                    COBOL Name: 800-ABEND-PTR
      * - clearingDtTm800                COBOL Name: 800-CLEARING-DT-TM
      * - ip02014wEntriesCnt             COBOL Name: IP02014W-ENTRIES-CNT
      * - rowLength800                   COBOL Name: 800-ROW-LENGTH
      * - ip50005ClearingDtTm            COBOL Name: IP50005-CLEARING-DT-TM
      *
      * @throws CFException
      */
      private void loadTableIp0201t1() throws Exception {
			// Declare local variables used in the method
			char[] clearingDtTm800 = null;
			// End of variable declaration

      
// *    Load the table.                                             *
// *----------------------------------------------------------------*
//  MOVE 300-LPA-LOADER TO IP60001-HOLD-PGM-NAME
          ip60001EventLogWorkArea.setIp60001HoldPgmName(work.getLpaLoader300());
//  PERFORM 9950-UPDATE-EVENT-LOG
          updateEventLog();/*9950-UPDATE-EVENT-LOG*/
//  IF 88-IP28221-IP282210-RESTART
          if ( ip28221PaTableRestart.isIp28221Ip282210Restart88()  ) { 
//  SET 88-100-IT-IS-FIRST-TIME TO TRUE
              work.setItIsFirstTime88100True(); 
              
          }
//  IF 88-100-IT-IS-FIRST-TIME
          if ( work.isItIsFirstTime88100()  ) { 
//  PERFORM 1100-DISPLAY-EXEC-MSGS
              displayExecMsgs();/*1100-DISPLAY-EXEC-MSGS*/
//  SET 800-PTR-IP299010 TO ENTRY 300-PGM-IP299010
              work.setPtrIp299010800(work.getPgmIp299010300()); 
              
//  SET 800-PTR-IP650010 TO ENTRY 300-PGM-IP650010
              work.setPtrIp650010800(work.getPgmIp650010300()); 
              
//  SET 88-100-IT-IS-NOT-FIRST-TIME TO TRUE
              work.setItIsNotFirstTime88100True(); 
              
//  SET 800-ABEND-PTR TO ENTRY 300-ABEND-PGM
              work.setAbendPtr800(work.getAbendPgm300()); 
              
              // MOVE SPACES TO 800-CLEARING-DT-TM
              work.setClearingDtTm800(CONSTANTS.SPACE_10);
//  MOVE ZEROES TO IP02014W-ENTRIES-CNT
              ip02014wEntriesCntGroup.setIp02014wEntriesCnt((short) 0);
//  MOVE LENGTH OF IP02014-PRCSS-AGRMT-TABLE TO 800-ROW-LENGTH
              work.setRowLength800(Ip02014PrcssAgrmtTable.getIp02014PrcssAgrmtTableFieldLength());
          }
//  IF IP50005-CLEARING-DT-TM EQUAL TO 800-CLEARING-DT-TM
          clearingDtTm800 = work.getClearingDtTm800();
//  ELSE
          if (		compareChars(ip50005ClearingDtTm,clearingDtTm800) != 0 ) { 
              // MOVE IP50005-CLEARING-DT-TM TO 800-CLEARING-DT-TM
              work.setClearingDtTm800(ip50005ClearingDtTm.toCharArray());
//  PERFORM 1200-GET-TABLE-KEY-DT-TM
              getTableKeyDtTm();/*1200-GET-TABLE-KEY-DT-TM*/
//  PERFORM 1300-LOAD-LPA-TBL
              loadLpaTbl();/*1300-LOAD-LPA-TBL*/
          }
  
      
      }
      /**
      * displayExecMsgs 
      *   This method is derived from 
  *   COBOL Paragraph - 1100-DISPLAY-EXEC-MSGS COBOL Cyclomatic complexity - 2
      * Input  :  

      * - pgmIp996010300                 COBOL Name: 300-PGM-IP996010
      * - lpaLoader300                   COBOL Name: 300-LPA-LOADER
      * - pgmVersion300                  COBOL Name: 300-PGM-VERSION
      *
      * Output :  

      * - ptrIp996010800                 COBOL Name: 800-PTR-IP996010
      * - ip996011PgmId                  COBOL Name: IP996011-PGM-ID
      * - lpaLoader300                   COBOL Name: 300-LPA-LOADER
      * - ip996011PgmVersion             COBOL Name: IP996011-PGM-VERSION
      * - pgmVersion300                  COBOL Name: 300-PGM-VERSION
      * - ip996011WhenCompiled           COBOL Name: IP996011-WHEN-COMPILED
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      private void displayExecMsgs() throws Exception {
      
// *----------------------------------------------------------------*
// *If the program is called for the first time, this paragraph will*
// *be performed. it basically displays program execution messages. *
// *it fills the entries in log detail copybook - ip996011          *
// *and displays the details accordingly.                           *
// *----------------------------------------------------------------*
//  SET 800-PTR-IP996010 TO ENTRY 300-PGM-IP996010
          work.setPtrIp996010800(work.getPgmIp996010300()); 
          
//  MOVE 300-LPA-LOADER TO IP996011-PGM-ID
          ip996011ProgramStartMessage.setIp996011PgmId(work.getLpaLoader300());
//  MOVE 300-PGM-VERSION TO IP996011-PGM-VERSION
          ip996011ProgramStartMessage.setIp996011PgmVersion(work.getPgmVersion300());
          // MOVE WHEN-COMPILED TO IP996011-WHEN-COMPILED
          //  FORMAT1311677340 = "X(08)BX(08)"
          ip996011ProgramStartMessage.setIp996011WhenCompiled(CFUtil.cobolAnEditFormatter(CONSTANTS.FORMAT1311677340,CONSTANTS.LITERAL_140864318));
//  CALL 800-PTR-IP996010
          // CALL 800-PTR-IP996010
          	this.setRc( ip996010.process());
      
      }
      /**
      * getTableKeyDtTm 
      *   This method is derived from 
  *   COBOL Paragraph - 1200-GET-TABLE-KEY-DT-TM COBOL Cyclomatic complexity - 1
      * Input  :  

      * - tableId300                     COBOL Name: 300-TABLE-ID
      * - clearingDtTm800                COBOL Name: 800-CLEARING-DT-TM
      *
      * Output :  

      * - ip00054KeyTableId              COBOL Name: IP00054-KEY-TABLE-ID
      * - tableId300                     COBOL Name: 300-TABLE-ID
      * - ip00054ReloadDtTm              COBOL Name: IP00054-RELOAD-DT-TM
      * - clearingDtTm800                COBOL Name: 800-CLEARING-DT-TM
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      private void getTableKeyDtTm() throws Exception {
			// Declare local variables used in the method
			Ip00054Table5Key1 ip00054Table5Key1 = ip00054TableEntry.getIp00054Table5Key1();
			// End of variable declaration

      
// *----------------------------------------------------------------*
// *This paragraph calls routine which returns the date and time of *
// *the latest parameter record available on oneday file.           *
// *----------------------------------------------------------------*
//  MOVE 300-TABLE-ID TO IP00054-KEY-TABLE-ID
          ip00054Table5Key1.setIp00054KeyTableId(work.getTableId300());
  
//  MOVE 800-CLEARING-DT-TM TO IP00054-RELOAD-DT-TM
          ip00054TableEntry.setIp00054ReloadDtTm(work.getClearingDtTm800());
//  CALL 800-PTR-IP299010
          // CALL 800-PTR-IP299010
          	this.setRc( ip299010.process());
      
      }
      /**
      * loadLpaTbl 
      *   This method is derived from 
  *   COBOL Paragraph - 1300-LOAD-LPA-TBL COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ip00054ReloadDtTm              COBOL Name: IP00054-RELOAD-DT-TM
      * - lastKeyDtTm800                 COBOL Name: 800-LAST-KEY-DT-TM
      * - valueOne300                    COBOL Name: 300-VALUE-ONE
      *
      * Output :  

      * - rowsLoaded400                  COBOL Name: 400-ROWS-LOADED
      * - checkCount400                  COBOL Name: 400-CHECK-COUNT
      * - rowCount400                    COBOL Name: 400-ROW-COUNT
      * - startPoint400                  COBOL Name: 400-START-POINT
      * - valueOne300                    COBOL Name: 300-VALUE-ONE
      * - lastKeyDtTm800                 COBOL Name: 800-LAST-KEY-DT-TM
      * - ip00054ReloadDtTm              COBOL Name: IP00054-RELOAD-DT-TM
      *
      * @throws CFException
      */
      private void loadLpaTbl() throws Exception {
			// Declare local variables used in the method
			char[] ip00054ReloadDtTm = null;
			char[] lastKeyDtTm800 = null;
			// End of variable declaration

      
// *This paragraph checks the date and time key of loaded table     *
// *vs the table to be loaded.                                      *
// *then it calls routine to load table from one-day-file.          *
// *----------------------------------------------------------------*
//  IF IP00054-RELOAD-DT-TM EQUAL 800-LAST-KEY-DT-TM
          lastKeyDtTm800 = work.getLastKeyDtTm800();
          ip00054ReloadDtTm = ip00054TableEntry.getIp00054ReloadDtTm();
//  ELSE
          if (		compareChars(ip00054ReloadDtTm,lastKeyDtTm800) != 0 ) { 
//  MOVE ZEROES TO 400-ROWS-LOADED 400-CHECK-COUNT 400-ROW-COUNT
              work.setRowsLoaded400(0);
              work.setCheckCount400(0);
              work.setRowCount400(0);
              // MOVE 300-VALUE-ONE TO 400-START-POINT
              work.setStartPoint400(work.getValueOne300());
              // MOVE IP00054-RELOAD-DT-TM TO 800-LAST-KEY-DT-TM
              work.setLastKeyDtTm800(ip00054TableEntry.getIp00054ReloadDtTm());
//  PERFORM 1310-LOAD-LPA-ENTRIES
              loadLpaEntries();/*1310-LOAD-LPA-ENTRIES*/
//  PERFORM 1320-LOAD-SIZE-INFO-TABLE
              loadSizeInfoTable();/*1320-LOAD-SIZE-INFO-TABLE*/
          }
  
      
      }
      /**
      * loadLpaEntries 
      *   This method is derived from 
  *   COBOL Paragraph - 1310-LOAD-LPA-ENTRIES COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ip00054KeyTableId              COBOL Name: IP00054-KEY-TABLE-ID
      * - ip00054ReloadDtTm              COBOL Name: IP00054-RELOAD-DT-TM
      *
      * Output :  

      * - areLpaRecOver100               COBOL Name: 100-ARE-LPA-REC-OVER
      * - ip02015PasFoundCount           COBOL Name: IP02015-PAS-FOUND-COUNT
      * - ip50005ReadTableId             COBOL Name: IP50005-READ-TABLE-ID
      * - ip00054KeyTableId              COBOL Name: IP00054-KEY-TABLE-ID
      * - ip50005EffDate                 COBOL Name: IP50005-EFF-DATE
      * - ip00054ReloadDtTm              COBOL Name: IP00054-RELOAD-DT-TM
      *
      * @throws CFException
      */
      private void loadLpaEntries() throws Exception {
			// Declare local variables used in the method
			Ip00054Table5Key1 ip00054Table5Key1 = ip00054TableEntry.getIp00054Table5Key1();
			Ip50005TableKey ip50005TableKey = ip50005OneDayRec.getIp50005TableKeyAll().getIp50005TableKey();
			// End of variable declaration

      
// *---------------------------------------------------------------*
// *This paragraph calls routine which reads requested table       *
// *records from one-day-file and load into local table.           *
// *---------------------------------------------------------------*
//  SET 88-100-LPA-REC-NOT-OVER TO TRUE
          work.setLpaRecNotOver88100True(); 
          
          // MOVE ZEROES TO IP02015-PAS-FOUND-COUNT
          ip02015PrcssAgrmtTable.setIp02015PasFoundCount(0);
//  MOVE IP00054-KEY-TABLE-ID TO IP50005-READ-TABLE-ID
          ip50005TableKey.setIp50005ReadTableId(ip00054Table5Key1.getIp00054KeyTableId());
  
          // MOVE IP00054-RELOAD-DT-TM TO IP50005-EFF-DATE
          ip50005OneDayRec.getIp50005TableKeyAll().getIp50005TableKey().setIp50005EffDate(padLeftZeros(10,ip00054TableEntry.getIp00054ReloadDtTm(),false));
  
//  PERFORM 1311-GET-FROM-ONE-DAY-FILE UNTIL 88-100-LPA-REC-OVER
          while (!(work.isLpaRecOver88100()) ) {
             getFromOneDayFile();/*1311-GET-FROM-ONE-DAY-FILE*/
          }
//  PERFORM 1312-LOAD-TO-IP02015T1-TABLE
          loadToIp02015t1Table();/*1312-LOAD-TO-IP02015T1-TABLE*/
          ;
      
      }
      /**
      * getFromOneDayFile 
      *   This method is derived from 
  *   COBOL Paragraph - 1311-GET-FROM-ONE-DAY-FILE COBOL Cyclomatic complexity - 3
      * Input  :  

      * - ip50005OneDayReadStatus        COBOL Name: IP50005-ONE-DAY-READ-STATUS
      * - rowsLoaded400                  COBOL Name: 400-ROWS-LOADED
      * - table201AbsentInOdf610         COBOL Name: 610-TABLE-201-ABSENT-IN-ODF
      * - para1311300                    COBOL Name: 300-PARA-1311
      * - noTable201InOdf300             COBOL Name: 300-NO-TABLE201-IN-ODF
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      * - areLpaRecOver100               COBOL Name: 100-ARE-LPA-REC-OVER
      * - rowCount400                    COBOL Name: 400-ROW-COUNT
      * - rowsLoaded400                  COBOL Name: 400-ROWS-LOADED
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - table201AbsentInOdf610         COBOL Name: 610-TABLE-201-ABSENT-IN-ODF
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para1311300                    COBOL Name: 300-PARA-1311
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - noTable201InOdf300             COBOL Name: 300-NO-TABLE201-IN-ODF
      *
      * @throws CFException
      */
      private void getFromOneDayFile() throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph calls routine to read record from one-day-file.  *
// *----------------------------------------------------------------*
//  CALL 800-PTR-IP650010
          // CALL 800-PTR-IP650010
          	this.setRc( ip650010.process());
//  IF 88-IP50005-ONE-DAY-IO-GOOD
          if ( ip50005OneDayReadStatusGroup.isIp50005OneDayIoGood88()  ) { 
//  PERFORM 1311-10-LOAD-TO-IP0201T1-TABLE
              _10LoadToIp0201t1Table();/*1311-10-LOAD-TO-IP0201T1-TABLE*/
//  IF 88-IP50005-TBL-LAST-REC-Y
              if ( ip50005OneDayReadStatusGroup.isIp50005TblLastRecY88()  ) { 
//  SET 88-100-LPA-REC-OVER TO TRUE
                  work.setLpaRecOver88100True(); 
                  
                  // MOVE 400-ROWS-LOADED TO 400-ROW-COUNT
                  work.setRowCount400(work.getRowsLoaded400());
              }
          }
//  ELSE
          else { 
//  MOVE 610-TABLE-201-ABSENT-IN-ODF TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(pad(66,work.getTable201AbsentInOdf610(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-1311 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(pad(30,work.getPara1311300(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-NO-TABLE201-IN-ODF TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getNoTable201InOdf300());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError();/*9000-TERMINATE-ON-ERROR*/
          }
      
      }
      /**
      * _10LoadToIp0201t1Table 
      *   This method is derived from 
  *   COBOL Paragraph - 1311-10-LOAD-TO-IP0201T1-TABLE COBOL Cyclomatic complexity - 1
      * Input  :  

      * - ip02014wEntriesCnt             COBOL Name: IP02014W-ENTRIES-CNT
      * - rowCount800                    COBOL Name: 800-ROW-COUNT
      * - ip50005TableData               COBOL Name: IP50005-TABLE-DATA
      * - startPoint400                  COBOL Name: 400-START-POINT
      * - recordLength800                COBOL Name: 800-RECORD-LENGTH
      * - rowsLoaded400                  COBOL Name: 400-ROWS-LOADED
      *
      * Output :  

      * - ip02014wEntriesCnt             COBOL Name: IP02014W-ENTRIES-CNT
      * - ip02014wTable                  COBOL Name: IP02014W-TABLE
      * - ip50005TableData               COBOL Name: IP50005-TABLE-DATA
      * - startPoint400                  COBOL Name: 400-START-POINT
      * - rowsLoaded400                  COBOL Name: 400-ROWS-LOADED
      *
      * @throws CFException
      */
      private void _10LoadToIp0201t1Table() throws Exception {
      
// *From one-day-file and routine to check whether there is         *
// *sufficient empty space in local table to load data.             *
// *----------------------------------------------------------------*
//  PERFORM 1311-11-CHECK-ONEDAY-REC-LEN
          _11CheckOnedayRecLen();/*1311-11-CHECK-ONEDAY-REC-LEN*/
//  PERFORM 1311-12-CHECK-TABLE-LIMIT
          _12CheckTableLimit();/*1311-12-CHECK-TABLE-LIMIT*/
//  ADD 800-ROW-COUNT TO IP02014W-ENTRIES-CNT
          ip02014wEntriesCntGroup.setIp02014wEntriesCnt( (short) (ip02014wEntriesCntGroup.getIp02014wEntriesCnt()+(short) work.getRowCount800()));
//  MOVE IP50005-TABLE-DATA (1 : 800-RECORD-LENGTH ) TO IP02014W-TABLE ( 400-START-POINT : 800-RECORD-LENGTH )
          ip02014wTable.replace(ip50005OneDayRec/*parent*/,22/*fromOffset - (ip02014wTable) */,work.getRecordLength800()/*fromLen*/,0+work.getStartPoint400() - 1/*toOffset - (ip50005TableData) */,work.getRecordLength800()/*toLen*/);
//  ADD 800-RECORD-LENGTH TO 400-START-POINT
          work.setStartPoint400(work.getStartPoint400()+work.getRecordLength800());
//  ADD 800-ROW-COUNT TO 400-ROWS-LOADED
          work.setRowsLoaded400(work.getRowsLoaded400()+work.getRowCount800());
      
      }
      /**
      * _11CheckOnedayRecLen 
      *   This method is derived from 
  *   COBOL Paragraph - 1311-11-CHECK-ONEDAY-REC-LEN COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ip50005TableDataLength         COBOL Name: IP50005-TABLE-DATA-LENGTH
      * - oneDayRecLengthError620        COBOL Name: 620-ONE-DAY-REC-LENGTH-ERROR
      * - para131111300                  COBOL Name: 300-PARA-1311-11
      * - recLengthAbendCode300          COBOL Name: 300-REC-LENGTH-ABEND-CODE
      *
      * Output :  

      * - recordLength800                COBOL Name: 800-RECORD-LENGTH
      * - ip50005TableDataLength         COBOL Name: IP50005-TABLE-DATA-LENGTH
      * - rowCount800                    COBOL Name: 800-ROW-COUNT
      * - remainder800                   COBOL Name: 800-REMAINDER
      * - errorLength620                 COBOL Name: 620-ERROR-LENGTH
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - oneDayRecLengthError620        COBOL Name: 620-ONE-DAY-REC-LENGTH-ERROR
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para131111300                  COBOL Name: 300-PARA-1311-11
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - recLengthAbendCode300          COBOL Name: 300-REC-LENGTH-ABEND-CODE
      *
      * @throws CFException
      */
      private void _11CheckOnedayRecLen() throws Exception {
			// Declare local variables used in the method
			int remainder800 = 0;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// *This paragraph checks length of one-day-file record read.       *
// *                                                                *
// *one-day file record length should be in multiple of length of   *
// *ip02014-prcss-agrmt-table                                       *
// *                                                                *
// *to validate one-day-file record length, it  is divided by length*
// *of ip02014-prcss-agrmt-table and remainder of division is       *
// *checked.                                                        *
// *if remainder is zero, one-day-file record length is correct else*
// *it is incorrect.                                                *
// *                                                                *
// *if one-day-file record length is incorrect, appropriate abend   *
// *message is displayed and abend program is called.               *
// *----------------------------------------------------------------*
//  MOVE IP50005-TABLE-DATA-LENGTH TO 800-RECORD-LENGTH
          work.setRecordLength800((int) ip50005OneDayRecLthGroup.getIp50005TableDataLength());
//  DIVIDE 800-RECORD-LENGTH BY 800-ROW-LENGTH GIVING 800-ROW-COUNT REMAINDER 800-REMAINDER
          work.setRowCount800( (int) work.getRecordLength800()/work.getRowLength800());
          work.setRemainder800( (int) work.getRecordLength800()%work.getRowLength800());
//  IF 800-REMAINDER EQUAL ZEROS
          remainder800 = work.getRemainder800();
//  ELSE
          if (	( remainder800 != 0 )) { 
//  MOVE IP50005-TABLE-DATA-LENGTH TO 620-ERROR-LENGTH
//  FORMAT_1318933825 = "ZZZZZZZ9"
              oneDayRecLengthError620.setErrorLength620(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1318933825,String.valueOf(ip50005OneDayRecLthGroup.getIp50005TableDataLength()).toCharArray()));
              // MOVE 620-ONE-DAY-REC-LENGTH-ERROR TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(oneDayRecLengthError620.toCharArray());
//  MOVE 300-PARA-1311-11 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(pad(30,work.getPara131111300(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-REC-LENGTH-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getRecLengthAbendCode300());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError();/*9000-TERMINATE-ON-ERROR*/
          }
  
      
      }
      /**
      * _12CheckTableLimit 
      *   This method is derived from 
  *   COBOL Paragraph - 1311-12-CHECK-TABLE-LIMIT COBOL Cyclomatic complexity - 2
      * Input  :  

      * - rowCount800                    COBOL Name: 800-ROW-COUNT
      * - rowsLoaded400                  COBOL Name: 400-ROWS-LOADED
      * - ip02014wEntries                COBOL Name: IP02014W-ENTRIES
      * - ip02014TblOverflowErr600       COBOL Name: 600-IP02014-TBL-OVERFLOW-ERR
      * - para131112300                  COBOL Name: 300-PARA-1311-12
      * - tblOverflowAbendCode300        COBOL Name: 300-TBL-OVERFLOW-ABEND-CODE
      *
      * Output :  

      * - checkCount400                  COBOL Name: 400-CHECK-COUNT
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - ip02014TblOverflowErr600       COBOL Name: 600-IP02014-TBL-OVERFLOW-ERR
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para131112300                  COBOL Name: 300-PARA-1311-12
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - tblOverflowAbendCode300        COBOL Name: 300-TBL-OVERFLOW-ABEND-CODE
      *
      * @throws CFException
      */
      private void _12CheckTableLimit() throws Exception {
			// Declare local variables used in the method
			int checkCount400 = 0;
			short ip02014wEntries = 0;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// *This paragraph checks the local table overflow condition.       *
// *----------------------------------------------------------------*
          work.setCheckCount400( ( work.getRowCount800() + work.getRowsLoaded400() ) );
          checkCount400 = work.getCheckCount400();
          ip02014wEntries = work.getIp02014wEntries();
//  IF 400-CHECK-COUNT GREATER THAN IP02014W-ENTRIES
          if (	( checkCount400 > ip02014wEntries ) ) { 
//  MOVE 600-IP02014-TBL-OVERFLOW-ERR TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(pad(66,work.getIp02014TblOverflowErr600(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-1311-12 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(pad(30,work.getPara131112300(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-TBL-OVERFLOW-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getTblOverflowAbendCode300());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError();/*9000-TERMINATE-ON-ERROR*/
          }
  
      
      }
      /**
      * loadToIp02015t1Table 
      *   This method is derived from 
  *   COBOL Paragraph - 1312-LOAD-TO-IP02015T1-TABLE COBOL Cyclomatic complexity - 4
      * Input  :  

      * - ip02014wPaIndex                COBOL Name: IP02014W-PA-INDEX
      * - ip02014wEntriesCnt             COBOL Name: IP02014W-ENTRIES-CNT
      * - ip02014wHostInd                COBOL Name: IP02014W-HOST-IND
      * - ip02014wPrcssAgrmtId           COBOL Name: IP02014W-PRCSS-AGRMT-ID
      * - ip02014wGeoScopeCode           COBOL Name: IP02014W-GEO-SCOPE-CODE
      * - ip02014wClrPrcssCd             COBOL Name: IP02014W-CLR-PRCSS-CD
      * - rowsLoaded400                  COBOL Name: 400-ROWS-LOADED
      * - ip02014wImpBulkId              COBOL Name: IP02014W-IMP-BULK-ID
      * - ip02014wNumCurrCd              COBOL Name: IP02014W-NUM-CURR-CD
      * - ip02014wOfsoilDataTypCd        COBOL Name: IP02014W-OFSOIL-DATA-TYP-CD
      * - ip02014wMrchntSplitCd          COBOL Name: IP02014W-MRCHNT-SPLIT-CD
      * - ip02014wCurrSplitCd            COBOL Name: IP02014W-CURR-SPLIT-CD
      * - ip02014wAcquirerSplitCd        COBOL Name: IP02014W-ACQUIRER-SPLIT-CD
      * - ip02014wDomCollOnlyCd          COBOL Name: IP02014W-DOM-COLL-ONLY-CD
      * - ip02014wOnsoilDataShrSw        COBOL Name: IP02014W-ONSOIL-DATA-SHR-SW
      * - ip02014wCemOnsoilSw            COBOL Name: IP02014W-CEM-ONSOIL-SW
      * - ip02014wEsrvcOnsoilSw          COBOL Name: IP02014W-ESRVC-ONSOIL-SW
      * - ip02014wGftOnsoilSw            COBOL Name: IP02014W-GFT-ONSOIL-SW
      * - ip02014wBnknetOnsoilSw         COBOL Name: IP02014W-BNKNET-ONSOIL-SW
      * - ip02014wMdesOnsoilSw           COBOL Name: IP02014W-MDES-ONSOIL-SW
      * - ip02014wZappOnsoilSw           COBOL Name: IP02014W-ZAPP-ONSOIL-SW
      * - ip02014wClrCycleNum            COBOL Name: IP02014W-CLR-CYCLE-NUM
      * - ip02014wDtaWrhsOnsoilSw        COBOL Name: IP02014W-DTA-WRHS-ONSOIL-SW
      * - ip02014wBllngOnsoilSw          COBOL Name: IP02014W-BLLNG-ONSOIL-SW
      * - ip02014wSetlOnsoilSw           COBOL Name: IP02014W-SETL-ONSOIL-SW
      * - ip02014wClrOnsoilSw            COBOL Name: IP02014W-CLR-ONSOIL-SW
      * - ip02014wAmsOnsoilSw            COBOL Name: IP02014W-AMS-ONSOIL-SW
      * - ip02014wMcomOnsoilSw           COBOL Name: IP02014W-MCOM-ONSOIL-SW
      * - ip02014wMdsOnsoilSw            COBOL Name: IP02014W-MDS-ONSOIL-SW
      * - ip02014wStndInOnsoilSw         COBOL Name: IP02014W-STND-IN-ONSOIL-SW
      * - ip02014wAuthOnsoilSw           COBOL Name: IP02014W-AUTH-ONSOIL-SW
      * - ip02014wRptHdrName             COBOL Name: IP02014W-RPT-HDR-NAME
      * - ip02014wOnUsPrcssAgrmtId       COBOL Name: IP02014W-ON-US-PRCSS-AGRMT-ID
      * - ip02014wPushOnsoilSw           COBOL Name: IP02014W-PUSH-ONSOIL-SW
      * - ip02014wIncontrolOnsoilSw      COBOL Name: IP02014W-INCONTROL-ONSOIL-SW
      * - ip02014wOperSysId              COBOL Name: IP02014W-OPER-SYS-ID
      * - ip02014wDbId                   COBOL Name: IP02014W-DB-ID
      *
      * Output :  

      * - ip02015PaIndex                 COBOL Name: IP02015-PA-INDEX
      * - ip02014wPaIndex                COBOL Name: IP02014W-PA-INDEX
      * - ip02015HostPrcssAgrmtId        COBOL Name: IP02015-HOST-PRCSS-AGRMT-ID
      * - ip02014wPrcssAgrmtId           COBOL Name: IP02014W-PRCSS-AGRMT-ID
      * - ip02015HostGeoScopeCode        COBOL Name: IP02015-HOST-GEO-SCOPE-CODE
      * - ip02014wGeoScopeCode           COBOL Name: IP02014W-GEO-SCOPE-CODE
      * - ip02015HostClrPrcssCd          COBOL Name: IP02015-HOST-CLR-PRCSS-CD
      * - ip02014wClrPrcssCd             COBOL Name: IP02014W-CLR-PRCSS-CD
      * - ip02015PasFoundCount           COBOL Name: IP02015-PAS-FOUND-COUNT
      * - rowsLoaded400                  COBOL Name: 400-ROWS-LOADED
      * - ip02015PrcssAgrmtId            COBOL Name: IP02015-PRCSS-AGRMT-ID
      * - ip02015GeoScopeCode            COBOL Name: IP02015-GEO-SCOPE-CODE
      * - ip02015HostInd                 COBOL Name: IP02015-HOST-IND
      * - ip02014wHostInd                COBOL Name: IP02014W-HOST-IND
      * - ip02015ImpBulkId               COBOL Name: IP02015-IMP-BULK-ID
      * - ip02014wImpBulkId              COBOL Name: IP02014W-IMP-BULK-ID
      * - ip02015NumCurrCd               COBOL Name: IP02015-NUM-CURR-CD
      * - ip02014wNumCurrCd              COBOL Name: IP02014W-NUM-CURR-CD
      * - ip02015OfsoilDataTypCd         COBOL Name: IP02015-OFSOIL-DATA-TYP-CD
      * - ip02014wOfsoilDataTypCd        COBOL Name: IP02014W-OFSOIL-DATA-TYP-CD
      * - ip02015MrchntSplitCd           COBOL Name: IP02015-MRCHNT-SPLIT-CD
      * - ip02014wMrchntSplitCd          COBOL Name: IP02014W-MRCHNT-SPLIT-CD
      * - ip02015CurrSplitCd             COBOL Name: IP02015-CURR-SPLIT-CD
      * - ip02014wCurrSplitCd            COBOL Name: IP02014W-CURR-SPLIT-CD
      * - ip02015AcquirerSplitCd         COBOL Name: IP02015-ACQUIRER-SPLIT-CD
      * - ip02014wAcquirerSplitCd        COBOL Name: IP02014W-ACQUIRER-SPLIT-CD
      * - ip02015DomCollOnlyCd           COBOL Name: IP02015-DOM-COLL-ONLY-CD
      * - ip02014wDomCollOnlyCd          COBOL Name: IP02014W-DOM-COLL-ONLY-CD
      * - ip02015OnsoilDataShrSw         COBOL Name: IP02015-ONSOIL-DATA-SHR-SW
      * - ip02014wOnsoilDataShrSw        COBOL Name: IP02014W-ONSOIL-DATA-SHR-SW
      * - ip02015CemOnsoilSw             COBOL Name: IP02015-CEM-ONSOIL-SW
      * - ip02014wCemOnsoilSw            COBOL Name: IP02014W-CEM-ONSOIL-SW
      * - ip02015EsrvcOnsoilSw           COBOL Name: IP02015-ESRVC-ONSOIL-SW
      * - ip02014wEsrvcOnsoilSw          COBOL Name: IP02014W-ESRVC-ONSOIL-SW
      * - ip02015GftOnsoilSw             COBOL Name: IP02015-GFT-ONSOIL-SW
      * - ip02014wGftOnsoilSw            COBOL Name: IP02014W-GFT-ONSOIL-SW
      * - ip02015BnknetOnsoilSw          COBOL Name: IP02015-BNKNET-ONSOIL-SW
      * - ip02014wBnknetOnsoilSw         COBOL Name: IP02014W-BNKNET-ONSOIL-SW
      * - ip02015MdesOnsoilSw            COBOL Name: IP02015-MDES-ONSOIL-SW
      * - ip02014wMdesOnsoilSw           COBOL Name: IP02014W-MDES-ONSOIL-SW
      * - ip02015ZappOnsoilSw            COBOL Name: IP02015-ZAPP-ONSOIL-SW
      * - ip02014wZappOnsoilSw           COBOL Name: IP02014W-ZAPP-ONSOIL-SW
      * - ip02015ClrCycleNum             COBOL Name: IP02015-CLR-CYCLE-NUM
      * - ip02014wClrCycleNum            COBOL Name: IP02014W-CLR-CYCLE-NUM
      * - ip02015DtaWrhsOnsoilSw         COBOL Name: IP02015-DTA-WRHS-ONSOIL-SW
      * - ip02014wDtaWrhsOnsoilSw        COBOL Name: IP02014W-DTA-WRHS-ONSOIL-SW
      * - ip02015BllngOnsoilSw           COBOL Name: IP02015-BLLNG-ONSOIL-SW
      * - ip02014wBllngOnsoilSw          COBOL Name: IP02014W-BLLNG-ONSOIL-SW
      * - ip02015SetlOnsoilSw            COBOL Name: IP02015-SETL-ONSOIL-SW
      * - ip02014wSetlOnsoilSw           COBOL Name: IP02014W-SETL-ONSOIL-SW
      * - ip02015ClrOnsoilSw             COBOL Name: IP02015-CLR-ONSOIL-SW
      * - ip02014wClrOnsoilSw            COBOL Name: IP02014W-CLR-ONSOIL-SW
      * - ip02015AmsOnsoilSw             COBOL Name: IP02015-AMS-ONSOIL-SW
      * - ip02014wAmsOnsoilSw            COBOL Name: IP02014W-AMS-ONSOIL-SW
      * - ip02015McomOnsoilSw            COBOL Name: IP02015-MCOM-ONSOIL-SW
      * - ip02014wMcomOnsoilSw           COBOL Name: IP02014W-MCOM-ONSOIL-SW
      * - ip02015MdsOnsoilSw             COBOL Name: IP02015-MDS-ONSOIL-SW
      * - ip02014wMdsOnsoilSw            COBOL Name: IP02014W-MDS-ONSOIL-SW
      * - ip02015StndInOnsoilSw          COBOL Name: IP02015-STND-IN-ONSOIL-SW
      * - ip02014wStndInOnsoilSw         COBOL Name: IP02014W-STND-IN-ONSOIL-SW
      * - ip02015AuthOnsoilSw            COBOL Name: IP02015-AUTH-ONSOIL-SW
      * - ip02014wAuthOnsoilSw           COBOL Name: IP02014W-AUTH-ONSOIL-SW
      * - ip02015RptHdrName              COBOL Name: IP02015-RPT-HDR-NAME
      * - ip02014wRptHdrName             COBOL Name: IP02014W-RPT-HDR-NAME
      * - ip02015ClrPrcssCd              COBOL Name: IP02015-CLR-PRCSS-CD
      * - ip02015OnUsPrcssAgrmtId        COBOL Name: IP02015-ON-US-PRCSS-AGRMT-ID
      * - ip02014wOnUsPrcssAgrmtId       COBOL Name: IP02014W-ON-US-PRCSS-AGRMT-ID
      * - ip02015PushOnsoilSw            COBOL Name: IP02015-PUSH-ONSOIL-SW
      * - ip02014wPushOnsoilSw           COBOL Name: IP02014W-PUSH-ONSOIL-SW
      * - ip02015IncontrolOnsoilSw       COBOL Name: IP02015-INCONTROL-ONSOIL-SW
      * - ip02014wIncontrolOnsoilSw      COBOL Name: IP02014W-INCONTROL-ONSOIL-SW
      * - ip02015OperSysId               COBOL Name: IP02015-OPER-SYS-ID
      * - ip02014wOperSysId              COBOL Name: IP02014W-OPER-SYS-ID
      * - ip02015DbId                    COBOL Name: IP02015-DB-ID
      * - ip02014wDbId                   COBOL Name: IP02014W-DB-ID
      *
      * @throws CFException
      */
      private void loadToIp02015t1Table() throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph loads the records from ip02014w layout to       *
// * ip02015 layout.                                                *
// *----------------------------------------------------------------*
//  SET IP02015-PA-INDEX TO 1
          ip02015PaIndex = 1; 
          
//  PERFORM VARYING IP02014W-PA-INDEX FROM 1 BY 1 UNTIL IP02014W-PA-INDEX GREATER IP02014W-ENTRIES-CNT
          for (ip02014wPaIndex = 1; (	( ip02014wPaIndex <= ip02014wEntriesCntGroup.getIp02014wEntriesCnt() ) ) ; ip02014wPaIndex = ip02014wPaIndex + 1 ) {
//  IF 88-IP02014W-PA-IS-HOST ( IP02014W-PA-INDEX )
              if ( ip02014wTable.getIp02014wPrcsAgrmtTable(ip02014wPaIndex - 1).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().isIp02014wPaIsHost88()  ) { 
//  MOVE IP02014W-PRCSS-AGRMT-ID ( IP02014W-PA-INDEX ) TO IP02015-HOST-PRCSS-AGRMT-ID
                  ip02015PrcssAgrmtTable.setIp02015HostPrcssAgrmtId(ip02014wTable.getIp02014wPrcsAgrmtTable(ip02014wPaIndex - 1).getIp02014wPrcssAgrmtTable().getIp02014wTableDataKey().getIp02014wPrcssAgrmtId());
//  MOVE IP02014W-GEO-SCOPE-CODE ( IP02014W-PA-INDEX ) TO IP02015-HOST-GEO-SCOPE-CODE
                  ip02015PrcssAgrmtTable.setIp02015HostGeoScopeCode(ip02014wTable.getIp02014wPrcsAgrmtTable(ip02014wPaIndex - 1).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wGeoScopeCode());
//  MOVE IP02014W-CLR-PRCSS-CD ( IP02014W-PA-INDEX ) TO IP02015-HOST-CLR-PRCSS-CD
                  ip02015PrcssAgrmtTable.setIp02015HostClrPrcssCd(ip02014wTable.getIp02014wPrcsAgrmtTable(ip02014wPaIndex - 1).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wClrPrcssCd());
              }
//  MOVE 400-ROWS-LOADED TO IP02015-PAS-FOUND-COUNT
              ip02015PrcssAgrmtTable.setIp02015PasFoundCount(work.getRowsLoaded400());
//  MOVE IP02014W-PRCSS-AGRMT-ID ( IP02014W-PA-INDEX ) TO IP02015-PRCSS-AGRMT-ID ( IP02015-PA-INDEX )
              ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(ip02015PaIndex - 1).setIp02015PrcssAgrmtId(ip02014wTable.getIp02014wPrcsAgrmtTable(ip02014wPaIndex - 1).getIp02014wPrcssAgrmtTable().getIp02014wTableDataKey().getIp02014wPrcssAgrmtId());
//  MOVE IP02014W-GEO-SCOPE-CODE ( IP02014W-PA-INDEX ) TO IP02015-GEO-SCOPE-CODE ( IP02015-PA-INDEX )
              ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(ip02015PaIndex - 1).setIp02015GeoScopeCode(ip02014wTable.getIp02014wPrcsAgrmtTable(ip02014wPaIndex - 1).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wGeoScopeCode());
//  MOVE IP02014W-HOST-IND ( IP02014W-PA-INDEX ) TO IP02015-HOST-IND ( IP02015-PA-INDEX )
              ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(ip02015PaIndex - 1).setIp02015HostInd(ip02014wTable.getIp02014wPrcsAgrmtTable(ip02014wPaIndex - 1).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wHostInd());
//  MOVE IP02014W-IMP-BULK-ID ( IP02014W-PA-INDEX ) TO IP02015-IMP-BULK-ID ( IP02015-PA-INDEX )
              ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(ip02015PaIndex - 1).getIp02015ImpBulkId().setString(ip02014wTable.getIp02014wPrcsAgrmtTable(ip02014wPaIndex - 1).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wImpBulkId().toCharArray());
//  MOVE IP02014W-NUM-CURR-CD ( IP02014W-PA-INDEX ) TO IP02015-NUM-CURR-CD ( IP02015-PA-INDEX )
              ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(ip02015PaIndex - 1).setIp02015NumCurrCd(ip02014wTable.getIp02014wPrcsAgrmtTable(ip02014wPaIndex - 1).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wNumCurrCd());
//  MOVE IP02014W-OFSOIL-DATA-TYP-CD ( IP02014W-PA-INDEX ) TO IP02015-OFSOIL-DATA-TYP-CD ( IP02015-PA-INDEX )
              ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(ip02015PaIndex - 1).setIp02015OfsoilDataTypCd(ip02014wTable.getIp02014wPrcsAgrmtTable(ip02014wPaIndex - 1).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wOfsoilDataTypCd());
//  MOVE IP02014W-MRCHNT-SPLIT-CD ( IP02014W-PA-INDEX ) TO IP02015-MRCHNT-SPLIT-CD ( IP02015-PA-INDEX )
              ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(ip02015PaIndex - 1).setIp02015MrchntSplitCd(ip02014wTable.getIp02014wPrcsAgrmtTable(ip02014wPaIndex - 1).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wMrchntSplitCd());
//  MOVE IP02014W-CURR-SPLIT-CD ( IP02014W-PA-INDEX ) TO IP02015-CURR-SPLIT-CD ( IP02015-PA-INDEX )
              ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(ip02015PaIndex - 1).setIp02015CurrSplitCd(ip02014wTable.getIp02014wPrcsAgrmtTable(ip02014wPaIndex - 1).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wCurrSplitCd());
//  MOVE IP02014W-ACQUIRER-SPLIT-CD ( IP02014W-PA-INDEX ) TO IP02015-ACQUIRER-SPLIT-CD ( IP02015-PA-INDEX )
              ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(ip02015PaIndex - 1).setIp02015AcquirerSplitCd(ip02014wTable.getIp02014wPrcsAgrmtTable(ip02014wPaIndex - 1).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wAcquirerSplitCd());
//  MOVE IP02014W-DOM-COLL-ONLY-CD ( IP02014W-PA-INDEX ) TO IP02015-DOM-COLL-ONLY-CD ( IP02015-PA-INDEX )
              ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(ip02015PaIndex - 1).setIp02015DomCollOnlyCd(ip02014wTable.getIp02014wPrcsAgrmtTable(ip02014wPaIndex - 1).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wDomCollOnlyCd());
//  MOVE IP02014W-ONSOIL-DATA-SHR-SW ( IP02014W-PA-INDEX ) TO IP02015-ONSOIL-DATA-SHR-SW ( IP02015-PA-INDEX )
              ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(ip02015PaIndex - 1).setIp02015OnsoilDataShrSw(ip02014wTable.getIp02014wPrcsAgrmtTable(ip02014wPaIndex - 1).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wOnsoilDataShrSw());
//  MOVE IP02014W-CEM-ONSOIL-SW ( IP02014W-PA-INDEX ) TO IP02015-CEM-ONSOIL-SW ( IP02015-PA-INDEX )
              ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(ip02015PaIndex - 1).setIp02015CemOnsoilSw(ip02014wTable.getIp02014wPrcsAgrmtTable(ip02014wPaIndex - 1).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wCemOnsoilSw());
//  MOVE IP02014W-ESRVC-ONSOIL-SW ( IP02014W-PA-INDEX ) TO IP02015-ESRVC-ONSOIL-SW ( IP02015-PA-INDEX )
              ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(ip02015PaIndex - 1).setIp02015EsrvcOnsoilSw(ip02014wTable.getIp02014wPrcsAgrmtTable(ip02014wPaIndex - 1).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wEsrvcOnsoilSw());
//  MOVE IP02014W-GFT-ONSOIL-SW ( IP02014W-PA-INDEX ) TO IP02015-GFT-ONSOIL-SW ( IP02015-PA-INDEX )
              ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(ip02015PaIndex - 1).setIp02015GftOnsoilSw(ip02014wTable.getIp02014wPrcsAgrmtTable(ip02014wPaIndex - 1).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wGftOnsoilSw());
//  MOVE IP02014W-BNKNET-ONSOIL-SW ( IP02014W-PA-INDEX ) TO IP02015-BNKNET-ONSOIL-SW ( IP02015-PA-INDEX )
              ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(ip02015PaIndex - 1).setIp02015BnknetOnsoilSw(ip02014wTable.getIp02014wPrcsAgrmtTable(ip02014wPaIndex - 1).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wBnknetOnsoilSw());
//  MOVE IP02014W-MDES-ONSOIL-SW ( IP02014W-PA-INDEX ) TO IP02015-MDES-ONSOIL-SW ( IP02015-PA-INDEX )
              ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(ip02015PaIndex - 1).setIp02015MdesOnsoilSw(ip02014wTable.getIp02014wPrcsAgrmtTable(ip02014wPaIndex - 1).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wMdesOnsoilSw());
//  MOVE IP02014W-ZAPP-ONSOIL-SW ( IP02014W-PA-INDEX ) TO IP02015-ZAPP-ONSOIL-SW ( IP02015-PA-INDEX )
              ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(ip02015PaIndex - 1).setIp02015ZappOnsoilSw(ip02014wTable.getIp02014wPrcsAgrmtTable(ip02014wPaIndex - 1).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wZappOnsoilSw());
//  MOVE IP02014W-CLR-CYCLE-NUM ( IP02014W-PA-INDEX ) TO IP02015-CLR-CYCLE-NUM ( IP02015-PA-INDEX )
              ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(ip02015PaIndex - 1).setIp02015ClrCycleNum(ip02014wTable.getIp02014wPrcsAgrmtTable(ip02014wPaIndex - 1).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wClrCycleNum());
//  MOVE IP02014W-DTA-WRHS-ONSOIL-SW ( IP02014W-PA-INDEX ) TO IP02015-DTA-WRHS-ONSOIL-SW ( IP02015-PA-INDEX )
              ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(ip02015PaIndex - 1).setIp02015DtaWrhsOnsoilSw(ip02014wTable.getIp02014wPrcsAgrmtTable(ip02014wPaIndex - 1).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wDtaWrhsOnsoilSw());
//  MOVE IP02014W-BLLNG-ONSOIL-SW ( IP02014W-PA-INDEX ) TO IP02015-BLLNG-ONSOIL-SW ( IP02015-PA-INDEX )
              ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(ip02015PaIndex - 1).setIp02015BllngOnsoilSw(ip02014wTable.getIp02014wPrcsAgrmtTable(ip02014wPaIndex - 1).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wBllngOnsoilSw());
//  MOVE IP02014W-SETL-ONSOIL-SW ( IP02014W-PA-INDEX ) TO IP02015-SETL-ONSOIL-SW ( IP02015-PA-INDEX )
              ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(ip02015PaIndex - 1).setIp02015SetlOnsoilSw(ip02014wTable.getIp02014wPrcsAgrmtTable(ip02014wPaIndex - 1).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wSetlOnsoilSw());
//  MOVE IP02014W-CLR-ONSOIL-SW ( IP02014W-PA-INDEX ) TO IP02015-CLR-ONSOIL-SW ( IP02015-PA-INDEX )
              ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(ip02015PaIndex - 1).setIp02015ClrOnsoilSw(ip02014wTable.getIp02014wPrcsAgrmtTable(ip02014wPaIndex - 1).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wClrOnsoilSw());
//  MOVE IP02014W-AMS-ONSOIL-SW ( IP02014W-PA-INDEX ) TO IP02015-AMS-ONSOIL-SW ( IP02015-PA-INDEX )
              ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(ip02015PaIndex - 1).setIp02015AmsOnsoilSw(ip02014wTable.getIp02014wPrcsAgrmtTable(ip02014wPaIndex - 1).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wAmsOnsoilSw());
//  MOVE IP02014W-MCOM-ONSOIL-SW ( IP02014W-PA-INDEX ) TO IP02015-MCOM-ONSOIL-SW ( IP02015-PA-INDEX )
              ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(ip02015PaIndex - 1).setIp02015McomOnsoilSw(ip02014wTable.getIp02014wPrcsAgrmtTable(ip02014wPaIndex - 1).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wMcomOnsoilSw());
//  MOVE IP02014W-MDS-ONSOIL-SW ( IP02014W-PA-INDEX ) TO IP02015-MDS-ONSOIL-SW ( IP02015-PA-INDEX )
              ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(ip02015PaIndex - 1).setIp02015MdsOnsoilSw(ip02014wTable.getIp02014wPrcsAgrmtTable(ip02014wPaIndex - 1).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wMdsOnsoilSw());
//  MOVE IP02014W-STND-IN-ONSOIL-SW ( IP02014W-PA-INDEX ) TO IP02015-STND-IN-ONSOIL-SW ( IP02015-PA-INDEX )
              ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(ip02015PaIndex - 1).setIp02015StndInOnsoilSw(ip02014wTable.getIp02014wPrcsAgrmtTable(ip02014wPaIndex - 1).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wStndInOnsoilSw());
//  MOVE IP02014W-AUTH-ONSOIL-SW ( IP02014W-PA-INDEX ) TO IP02015-AUTH-ONSOIL-SW ( IP02015-PA-INDEX )
              ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(ip02015PaIndex - 1).setIp02015AuthOnsoilSw(ip02014wTable.getIp02014wPrcsAgrmtTable(ip02014wPaIndex - 1).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wAuthOnsoilSw());
//  MOVE IP02014W-RPT-HDR-NAME ( IP02014W-PA-INDEX ) TO IP02015-RPT-HDR-NAME ( IP02015-PA-INDEX )
              ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(ip02015PaIndex - 1).setIp02015RptHdrName(ip02014wTable.getIp02014wPrcsAgrmtTable(ip02014wPaIndex - 1).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wRptHdrName());
//  MOVE IP02014W-CLR-PRCSS-CD ( IP02014W-PA-INDEX ) TO IP02015-CLR-PRCSS-CD ( IP02015-PA-INDEX )
              ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(ip02015PaIndex - 1).setIp02015ClrPrcssCd(ip02014wTable.getIp02014wPrcsAgrmtTable(ip02014wPaIndex - 1).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wClrPrcssCd());
//  MOVE IP02014W-ON-US-PRCSS-AGRMT-ID ( IP02014W-PA-INDEX ) TO IP02015-ON-US-PRCSS-AGRMT-ID ( IP02015-PA-INDEX )
              ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(ip02015PaIndex - 1).setIp02015OnUsPrcssAgrmtId(ip02014wTable.getIp02014wPrcsAgrmtTable(ip02014wPaIndex - 1).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wOnUsPrcssAgrmtId());
//  MOVE IP02014W-PUSH-ONSOIL-SW ( IP02014W-PA-INDEX ) TO IP02015-PUSH-ONSOIL-SW ( IP02015-PA-INDEX )
              ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(ip02015PaIndex - 1).setIp02015PushOnsoilSw(ip02014wTable.getIp02014wPrcsAgrmtTable(ip02014wPaIndex - 1).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wPushOnsoilSw());
//  MOVE IP02014W-INCONTROL-ONSOIL-SW ( IP02014W-PA-INDEX ) TO IP02015-INCONTROL-ONSOIL-SW ( IP02015-PA-INDEX )
              ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(ip02015PaIndex - 1).setIp02015IncontrolOnsoilSw(ip02014wTable.getIp02014wPrcsAgrmtTable(ip02014wPaIndex - 1).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wIncontrolOnsoilSw());
//  MOVE IP02014W-OPER-SYS-ID ( IP02014W-PA-INDEX ) TO IP02015-OPER-SYS-ID ( IP02015-PA-INDEX )
              ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(ip02015PaIndex - 1).setIp02015OperSysId(ip02014wTable.getIp02014wPrcsAgrmtTable(ip02014wPaIndex - 1).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wOperSysId());
//  MOVE IP02014W-DB-ID ( IP02014W-PA-INDEX ) TO IP02015-DB-ID ( IP02015-PA-INDEX )
              ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(ip02015PaIndex - 1).setIp02015DbId(ip02014wTable.getIp02014wPrcsAgrmtTable(ip02014wPaIndex - 1).getIp02014wPrcssAgrmtTable().getIp02014wTableDataFields().getIp02014wDbId());
//  SET IP02015-PA-INDEX UP BY 1
              ip02015PaIndex++; 
              
          }
      
      }
      /**
      * loadSizeInfoTable 
      *   This method is derived from 
  *   COBOL Paragraph - 1320-LOAD-SIZE-INFO-TABLE COBOL Cyclomatic complexity - 1
      * Input  :  

      * - lpaLoader300                   COBOL Name: 300-LPA-LOADER
      * - tableId300                     COBOL Name: 300-TABLE-ID
      * - rowsLoaded400                  COBOL Name: 400-ROWS-LOADED
      * - ip02014wEntries                COBOL Name: IP02014W-ENTRIES
      * - tableName300                   COBOL Name: 300-TABLE-NAME
      * - ip29991TableLoadSizeInfo       COBOL Name: IP29991-TABLE-LOAD-SIZE-INFO
      *
      * Output :  

      * - ip29991LoadSearchPgm           COBOL Name: IP29991-LOAD-SEARCH-PGM
      * - lpaLoader300                   COBOL Name: 300-LPA-LOADER
      * - ip29991TableId                 COBOL Name: IP29991-TABLE-ID
      * - tableId300                     COBOL Name: 300-TABLE-ID
      * - ip29991TableRowsLoaded         COBOL Name: IP29991-TABLE-ROWS-LOADED
      * - rowsLoaded400                  COBOL Name: 400-ROWS-LOADED
      * - ip29991TableRowOccurs          COBOL Name: IP29991-TABLE-ROW-OCCURS
      * - ip02014wEntries                COBOL Name: IP02014W-ENTRIES
      * - ip29991TableName               COBOL Name: IP29991-TABLE-NAME
      * - tableName300                   COBOL Name: 300-TABLE-NAME
      *
      * @throws CFException
      */
      private void loadSizeInfoTable() throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph populates values to copybook ip299901.           *
// *----------------------------------------------------------------*
//  MOVE 300-LPA-LOADER TO IP29991-LOAD-SEARCH-PGM
          ip29991TableLoadSizeInfo.setIp29991LoadSearchPgm(work.getLpaLoader300());
//  MOVE 300-TABLE-ID TO IP29991-TABLE-ID
          ip29991TableLoadSizeInfo.setIp29991TableId(work.getTableId300());
          // MOVE 400-ROWS-LOADED TO IP29991-TABLE-ROWS-LOADED
          ip29991TableLoadSizeInfo.setIp29991TableRowsLoaded(work.getRowsLoaded400());
//  MOVE IP02014W-ENTRIES TO IP29991-TABLE-ROW-OCCURS
          ip29991TableLoadSizeInfo.setIp29991TableRowOccurs( work.getIp02014wEntries());
//  MOVE 300-TABLE-NAME TO IP29991-TABLE-NAME
          ip29991TableLoadSizeInfo.setIp29991TableName(work.getTableName300());
//  DISPLAY IP29991-TABLE-LOAD-SIZE-INFO
          logger.info(ip29991TableLoadSizeInfo.toString()); 
      
      }
      /**
      * populateLpaEntry 
      *   This method is derived from 
  *   COBOL Paragraph - 2000-POPULATE-LPA-ENTRY COBOL Cyclomatic complexity - 3
      * Input  :  

      * - ip02014PrcssAgrmtId            COBOL Name: IP02014-PRCSS-AGRMT-ID
      * - ip02014lPrcssAgrmtId           COBOL Name: IP02014L-PRCSS-AGRMT-ID
      * - keyEntryFound100               COBOL Name: 100-KEY-ENTRY-FOUND
      *
      * Output : None 

      * @throws CFException
      */
      private void populateLpaEntry() throws Exception {
			// Declare local variables used in the method
			Ip02014lTableDataKey ip02014lTableDataKey = ip02014lPrcssAgrmtTable.getIp02014lTableDataKey();
			Ip02014TableDataKey ip02014TableDataKey = ip02014PrcssAgrmtTable.getIp02014TableDataKey();
			char[] ip02014PrcssAgrmtId = null;
			char[] ip02014lPrcssAgrmtId = null;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// *This paragraph will initialize the copybook ip020104 then fill  *
// *the area with the requested lpa information                     *
// *----------------------------------------------------------------*
//  IF IP02014-PRCSS-AGRMT-ID EQUAL IP02014L-PRCSS-AGRMT-ID AND 88-100-ENTRY-FOUND-Y
          ip02014PrcssAgrmtId = ip02014TableDataKey.getIp02014PrcssAgrmtId();
          ip02014lPrcssAgrmtId = ip02014lTableDataKey.getIp02014lPrcssAgrmtId();
//  ELSE
          if (		compareChars(ip02014PrcssAgrmtId,ip02014lPrcssAgrmtId) != 0  || !(work.isEntryFoundY88100()) ) { 
//  PERFORM 2100-SEARCH-LPA-ENTRIES
              searchLpaEntries();/*2100-SEARCH-LPA-ENTRIES*/
          }
  
      
      }
      /**
      * searchLpaEntries 
      *   This method is derived from 
  *   COBOL Paragraph - 2100-SEARCH-LPA-ENTRIES COBOL Cyclomatic complexity - 4
      * Input  :  

      * - ip02015PasFoundCount           COBOL Name: IP02015-PAS-FOUND-COUNT
      * - ip02014PrcssAgrmtId            COBOL Name: IP02014-PRCSS-AGRMT-ID
      * - ip02015PrcssAgrmtId            COBOL Name: IP02015-PRCSS-AGRMT-ID
      * - ip02015PrcssAgrmtEntry         COBOL Name: IP02015-PRCSS-AGRMT-ENTRY
      *
      * Output :  

      * - keyEntryFound100               COBOL Name: 100-KEY-ENTRY-FOUND
      * - ip02015PaIndex                 COBOL Name: IP02015-PA-INDEX
      * - ip02014PrcssAgrmtTable         COBOL Name: IP02014-PRCSS-AGRMT-TABLE
      * - ip02014lPrcssAgrmtTable        COBOL Name: IP02014L-PRCSS-AGRMT-TABLE
      * - ip02015PrcssAgrmtEntry         COBOL Name: IP02015-PRCSS-AGRMT-ENTRY
      *
      * @throws CFException
      */
      private void searchLpaEntries() throws Exception {
			// Declare local variables used in the method
			Ip02014TableDataKey ip02014TableDataKey = ip02014PrcssAgrmtTable.getIp02014TableDataKey();
			Ip02015PrcssAgrmtTabEnt ip02015PrcssAgrmtTabEnt = ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt();
			char[] ip02014PrcssAgrmtId = null;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// *Search the ip020105 copybook table                              *
// *----------------------------------------------------------------*
//  SET 88-100-ENTRY-FOUND-N TO TRUE
          work.setEntryFoundN88100True(); 
          
//  SET IP02015-PA-INDEX TO 1
          ip02015PaIndex = 1; 
          
//  PERFORM UNTIL 88-100-ENTRY-FOUND-Y OR IP02015-PA-INDEX GREATER IP02015-PAS-FOUND-COUNT
          while ((!(work.isEntryFoundY88100())  && 	( ip02015PaIndex <= ip02015PrcssAgrmtTable.getIp02015PasFoundCount() ))) {
              ip02014PrcssAgrmtId = ip02014TableDataKey.getIp02014PrcssAgrmtId();
//  IF IP02014-PRCSS-AGRMT-ID EQUAL IP02015-PRCSS-AGRMT-ID ( IP02015-PA-INDEX )
              if (		compareChars(ip02014PrcssAgrmtId,ip02015PrcssAgrmtTabEnt.getIp02015PrcssAgrmtEntry(ip02015PaIndex - 1).getIp02015PrcssAgrmtId()) == 0 ) { 
//  MOVE IP02015-PRCSS-AGRMT-ENTRY ( IP02015-PA-INDEX ) TO IP02014-PRCSS-AGRMT-TABLE IP02014L-PRCSS-AGRMT-TABLE
                  ip02014PrcssAgrmtTable.setString(pad(932,ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(ip02015PaIndex - 1).toCharArray(),SPACE_CHAR,RIGHT_PAD));
                  ip02014lPrcssAgrmtTable.setString(pad(932,ip02015PrcssAgrmtTable.getIp02015PrcssAgrmtTabEnt().getIp02015PrcssAgrmtEntry(ip02015PaIndex - 1).toCharArray(),SPACE_CHAR,RIGHT_PAD));
//  SET 88-100-ENTRY-FOUND-Y TO TRUE
                  work.setEntryFoundY88100True(); 
                  
              }
  
//  ELSE
              else { 
//  SET IP02015-PA-INDEX UP BY 1
                  ip02015PaIndex++; 
                  
              }
          }
      
      }
      /**
      * terminateOnError 
      *   This method is derived from 
  *   COBOL Paragraph - 9000-TERMINATE-ON-ERROR COBOL Cyclomatic complexity - 1
      * Input  :  

      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - astriskLine900                 COBOL Name: 900-ASTRISK-LINE
      * - abendAbend900                  COBOL Name: 900-ABEND-ABEND
      * - abendAbendPgm900               COBOL Name: 900-ABEND-ABEND-PGM
      * - abendParaName900               COBOL Name: 900-ABEND-PARA-NAME
      * - abendMessage900                COBOL Name: 900-ABEND-MESSAGE
      *
      * Output :  

      * - ip60001EventErrorMsg           COBOL Name: IP60001-EVENT-ERROR-MSG
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - ip60001EventErrorCode          COBOL Name: IP60001-EVENT-ERROR-CODE
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      private void terminateOnError() throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph displays abend message and calls abend routine.  *
// *----------------------------------------------------------------*
//  MOVE 900-ABEND-TEXT TO IP60001-EVENT-ERROR-MSG
          ip60001EventLogWorkArea.setIp60001EventErrorMsg(abendMessage900.getAbendText900());
//  MOVE 900-ABEND-CODE TO IP60001-EVENT-ERROR-CODE
          ip60001EventLogWorkArea.setIp60001EventErrorCode(abendMessage900.getAbendCode900());
//  DISPLAY 900-ASTRISK-LINE
          logger.info(new String(work.getAstriskLine900())); 
//  DISPLAY 900-ABEND-ABEND
          logger.info(new String(work.getAbendAbend900())); 
//  DISPLAY 900-ABEND-ABEND-PGM
          logger.info(new String(work.getAbendAbendPgm900())); 
//  DISPLAY 900-ASTRISK-LINE
          logger.info(new String(work.getAstriskLine900())); 
//  DISPLAY 900-ABEND-PARA-NAME
          logger.info(abendParaName900.toString()); 
//  DISPLAY 900-ABEND-MESSAGE
          logger.info(abendMessage900.toString()); 
//  CALL 800-ABEND-PTR
          // CALL 800-ABEND-PTR
          	this.setRc( ip610010.process());
      
      }
      /**
      * updateEventLog 
      *   This method is derived from 
  *   COBOL Paragraph - 9950-UPDATE-EVENT-LOG COBOL Cyclomatic complexity - 3
      * Input  :  

      * - ip60001EventLogControl         COBOL Name: IP60001-EVENT-LOG-CONTROL
      * - ip60001Subscript               COBOL Name: IP60001-SUBSCRIPT
      * - ip60001HoldPgmName             COBOL Name: IP60001-HOLD-PGM-NAME
      *
      * Output :  

      * - ip60001Subscript               COBOL Name: IP60001-SUBSCRIPT
      * - ip60001PgmName                 COBOL Name: IP60001-PGM-NAME
      * - ip60001HoldPgmName             COBOL Name: IP60001-HOLD-PGM-NAME
      *
      * @throws CFException
      */
      private void updateEventLog() throws Exception {
			// Declare local variables used in the method
			long ip60001Subscript = 0;
			// End of variable declaration

      
// * Element ip601011 as of 10/31/02 04:53:52                    [vc]
// ******************************************************************
// *   description: this is the procedure division copybook to      *
// *                fill the event log table.  move the current     *
// *                program name to ip60001-hold-pgm-name and       *
// *                the current paragraph name to                   *
// *                ip60001-hold-para-name.  then perform paragraph *
// *                9950-update-event-log.                          *
// ******************************************************************
// *   modifications history                                        *
// *   date             project     modifications                   *
// *   07/30/99         2526        created                         *
// *   mm/dd/yy         xxxxxxx     description                     *
// ******************************************************************
// *  layout description:  event log update                         *
// ******************************************************************
// *  start copybook member ip601011 - event log update             *
// ******************************************************************
//  IF 88-IP60001-LOG-EVENT
          if ( ip60001EventLogWorkArea.isIp60001LogEvent88()  ) { 
              ip60001Subscript = ip60001EventLogWorkArea.getIp60001Subscript();
//  IF IP60001-SUBSCRIPT = 500
              if (	( ip60001Subscript == 500 ) ) { 
//  MOVE 1 TO IP60001-SUBSCRIPT
                  ip60001EventLogWorkArea.setIp60001Subscript((long)1);
              }
  
//  ELSE
              else { 
//  ADD 1 TO IP60001-SUBSCRIPT
                  ip60001EventLogWorkArea.setIp60001Subscript(ip60001EventLogWorkArea.getIp60001Subscript()+(long)1);
              }
//  MOVE IP60001-HOLD-PGM-NAME TO IP60001-PGM-NAME ( IP60001-SUBSCRIPT )
              ip60001EventLogWorkArea.getIp60001EventEntry((int) ip60001EventLogWorkArea.getIp60001Subscript() - 1).setIp60001PgmName(ip60001EventLogWorkArea.getIp60001HoldPgmName());
          }
      
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
  
      public int call(Object[] params) throws Exception {
      
      int len = params.length;
         if (len > 0 && params[0] != null )
            ip28221PaTableRestart.set((Field)params[0]);
         // invoke the process and return rc
         return process();
         
      }
      
      public int call(Field... parameters) throws Exception {
         for (int index = 0; index < parameters.length;index++) {
             switch(index) {
              case 0:
                      if(parameters[index] != null ) {
              		if (parameters[index] instanceof Ip28221PaTableRestart) {
                       	this.ip28221PaTableRestart = ((Ip28221PaTableRestart) parameters[index]);
                  	} else {
                       	this.ip28221PaTableRestart.set(parameters[index]);
                  	}
                  }
                
                  break;
            }
         }
          return process();
      }
      
      
  
  
  
  
  
  }
