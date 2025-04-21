  package com.cloudframe.app.process;
  /* 
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
* author.        steve callahan.
* date-written.  october, 2000.
* security.      property of mastercard international, inc.
*-----------------------------------------------------------------
* program function: load api for table 8 (pds attributes) and
* table 9 (pds subfield attributes).  tables are read from the
* optimized parameter file, sys007, via calls to the optimizied
* parameter file api, ip650010.  subroutines called are:
*
*    ip299010:  searches table 5 (which lists all dated versions
*               of tables on the optimized parameter file).
*               returns, for the specified table, the highest
*               effective date and time which is less than or
*               equal to the current clearing cycle date and time.
*               this date-time value is later used as part of the
*               search key passed to ip650010 for use in the
*               vsam ksds search key value.
*               values passed to ip299010: table-id.
*
*    ip650010:  reads the optimized parameter file (sys007).
*               returns one record at a time. an entire table
*               may be contained in one record.
*               values passed to ip650010: table-id, effective
*               date and time.
*-----------------------------------------------------------------
* this program loads table 8 and or table 9 as needed.
* the program remembers three timestamps:
*   1. effective-date-and-time of the currently loaded table 8
*   2. effective-date-and-time of the currently loaded table 9
*   3. the clearing-cycle-date-and-time at which table 8 pointers
*      to table 9 were resolved.
*
* the current clearing-cycle-timestamp (common area item 47)
* will determine the need to load either table.  if it is equal
* to the pointer resolution date (item 3 above) then no load is
* needed, since if we passed this to ip299010 it would return the
* same effective dates for tables 8 and 9 as are already loaded.
*
* if they are different, then we call ip29901o to obtain the
* timestamps of the versions of tables 8 and 9 which should
* be in effect now.  if either timestamp is different from that
* of the currently loaded table, then the new version of the table
* is loaded.
*
* if either table 8 or table 9 was loaded, then we must link table
* 8 entries to their subfields in table 9. table 9 is scanned and
* the appropriate t9 index values are posted in the "first sub-
* field-pointer" fields of table 8.
*
* the current clearing-cycle-timestamp is posted as the
* pointer-resolution timestamp.
*-----------------------------------------------------------------
* revision history:
*-----------------------------------------------------------------
*    project         :ses ipm pre-edit
*    date            :2000/10/06
*    version         :001.00
*    programmer      :steve callahan
*    modification    :initial version
*-----------------------------------------------------------------
*    project         :gcms release 3.1                           *
*    date            :2002/05/06                                 *
*    version         :001.01                                     *
*    programmer      :isc                                        *
*    modification    :modified to call ip996010 to display       *
*                     execution messages.                        *
*----------------------------------------------------------------*
*    project         :gcms release 3.1                           *
*    date            :04/04/2003                                 *
*    version         :001.02                                     *
*    programmer      :craig engler                               *
*----------------------------------------------------------------*
*    project         :gcms release 10.1 - scr07039               *
*    date            :2010/04/16                                 *
*    programmer      :wipro                                      *
*    modification    :modified to eliminate compiler warning     *
*                     messages.                                  *
*----------------------------------------------------------------*
*/
  
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.utility.CFUtil;
  import org.springframework.beans.factory.annotation.Value;
  import com.cloudframe.app.global.sharedvar.Ip00054Table5Key1;
  import com.cloudframe.app.global.sharedvar.Ip000804PdsAttrTable;
  import com.cloudframe.app.global.sharedvar.Ip000804PdsAttrRow;
  import com.cloudframe.app.global.sharedvar.Ip50005TableKey;
  import com.cloudframe.app.global.sharedvar.Ip000904PdsSubAttrTable;
  import com.cloudframe.app.global.sharedvar.Ip000904PdsSubAttrRow;
  import com.cloudframe.app.process.Ip299010;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.process.Ip650010;
  import com.cloudframe.app.ip741010.dto.*;
  import com.cloudframe.app.ip741010.dto.RowsLoadedMessage630;
  import com.cloudframe.app.ip741010.dto.AbendMessage900;
  import com.cloudframe.app.ip741010.dto.AbendParaName900;
  import com.cloudframe.app.ip741010.dto.TableOverflowError600;
  import com.cloudframe.app.ip741010.dto.RecNotFoundMsg610;
  import com.cloudframe.app.ip741010.dto.TableIntegrityError640;
  import com.cloudframe.app.global.sharedvar.Ip00054TableEntry;
  import com.cloudframe.app.global.sharedvar.Ip50005OneDayRecLthGroup;
  import com.cloudframe.app.global.sharedvar.Ip50005OneDayRec;
  import com.cloudframe.app.global.sharedvar.Ip50005OneDayReadStatusGroup;
  import com.cloudframe.app.global.sharedvar.Ip50005ClearingDtTm;
  import com.cloudframe.app.global.sharedvar.Ip60001EventLogWorkArea;
  import com.cloudframe.app.global.sharedvar.Ip000608ProcessingDateTimeGroup;
  import com.cloudframe.app.global.sharedvar.Ip000804PdsAttributes;
  import com.cloudframe.app.global.sharedvar.Ip996011ProgramStartMessage;
  import com.cloudframe.app.ip741010.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("ip741010")
  
  public class Ip741010 extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Ip741010.class);
  
  private RowsLoadedMessage630 rowsLoadedMessage630 = new RowsLoadedMessage630() ;
  private AbendMessage900 abendMessage900 = new AbendMessage900() ;
  private AbendParaName900 abendParaName900 = new AbendParaName900() ;
  private TableOverflowError600 tableOverflowError600 = new TableOverflowError600() ;
  private RecNotFoundMsg610 recNotFoundMsg610 = new RecNotFoundMsg610() ;
  private TableIntegrityError640 tableIntegrityError640 = new TableIntegrityError640() ;
  private Work work = new Work() ;
  
  @Value("${timeZoneId:Etc/GMT}")
  private String timeZoneId;
  
  
  
  
  private static final int IP000904_PDS_SUB_ATTR_ROW_LENGTH = 70;
  
  int ip000804I;
  int ip000904I;
  
  
  
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
  *   COBOL Paragraph - 0000-MAINLINE COBOL Cyclomatic complexity - 4
      * Input  :  

      * - ip000608ProcessingDateTime     COBOL Name: IP000608-PROCESSING-DATE-TIME
      * - clearingDtTm800                COBOL Name: 800-CLEARING-DT-TM
      * - currentDateTime800             COBOL Name: 800-CURRENT-DATE-TIME
      *
      * Output :  

      * - ip000608ProcessingDateTime     COBOL Name: IP000608-PROCESSING-DATE-TIME
      * - currentDateTime800             COBOL Name: 800-CURRENT-DATE-TIME
      * - clearingDtTm800                COBOL Name: 800-CLEARING-DT-TM
      * - ip00054ReloadDtTm              COBOL Name: IP00054-RELOAD-DT-TM
      *
      * @throws CFException
      */
      private void mainline() throws Exception {
			// Declare local variables used in the method
			char[] ip000608ProcessingDateTime = null;
			char[] clearingDtTm800 = null;
			// End of variable declaration

//  PERFORM 1000-INITIALIZATION
          initialization();/*1000-INITIALIZATION*/
          if (this.isProgramEnded()) {
              return ;
          }

// *    Check to see if clearing cycle time has changed since
// *    we last checked the currency of the tables.
//  IF IP000608-PROCESSING-DATE-TIME EQUAL TO 800-CLEARING-DT-TM
          clearingDtTm800 = work.getClearingDtTm800();
          ip000608ProcessingDateTime = ip000608ProcessingDateTimeGroup.getIp000608ProcessingDateTime();
//  ELSE
          if (		compareChars(ip000608ProcessingDateTime,clearingDtTm800) != 0 ) { 

// *        We must check to see if tables are still current
              ip000608ProcessingDateTime = ip000608ProcessingDateTimeGroup.getIp000608ProcessingDateTime();
//  IF IP000608-PROCESSING-DATE-TIME = LOW-VALUES
              if (			( checkLowValue(ip000608ProcessingDateTime) ) ) { 
//  MOVE 800-CURRENT-DATE-TIME TO IP000608-PROCESSING-DATE-TIME
                  ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(work.getCurrentDateTime800());
              }
  
//  MOVE IP000608-PROCESSING-DATE-TIME TO 800-CLEARING-DT-TM IP00054-RELOAD-DT-TM
              work.setClearingDtTm800(ip000608ProcessingDateTimeGroup.getIp000608ProcessingDateTime());
              ip00054TableEntry.setIp00054ReloadDtTm(ip000608ProcessingDateTimeGroup.getIp000608ProcessingDateTime());
//  PERFORM 2000-LOAD-TABLES-IF-NEEDED
              loadTablesIfNeeded();/*2000-LOAD-TABLES-IF-NEEDED*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
  
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          this.setProgramEnded(true);
          return ;
      
      }
      /**
      * initialization 
      *   This method is derived from 
  *   COBOL Paragraph - 1000-INITIALIZATION COBOL Cyclomatic complexity - 4
      * Input  :  

      * - isItTheFirstTime100            COBOL Name: 100-IS-IT-THE-FIRST-TIME
      * - pgmIp650010300                 COBOL Name: 300-PGM-IP650010
      * - pgmIp299010300                 COBOL Name: 300-PGM-IP299010
      *
      * Output :  

      * - ptrIp650010800                 COBOL Name: 800-PTR-IP650010
      * - ptrIp299010800                 COBOL Name: 800-PTR-IP299010
      * - isItTheFirstTime100            COBOL Name: 100-IS-IT-THE-FIRST-TIME
      * - currentDateTime800             COBOL Name: 800-CURRENT-DATE-TIME
      * - haveWeLoadedATable100          COBOL Name: 100-HAVE-WE-LOADED-A-TABLE
      *
      * @throws CFException
      */
      private void initialization() throws Exception {

// *-----------------------------------------------------------------
// * Update the event log.  display standard messages on first call.
// *-----------------------------------------------------------------
//  IF 88-100-IT-IS-FIRST-TIME
          if ( work.isItIsFirstTime88100()  ) { 
//  SET 800-PTR-IP650010 TO ENTRY 300-PGM-IP650010
              work.setPtrIp650010800(work.getPgmIp650010300()); 
              
//  SET 800-PTR-IP299010 TO ENTRY 300-PGM-IP299010
              work.setPtrIp299010800(work.getPgmIp299010300()); 
              
//  SET 88-100-IT-IS-NOT-FIRST-TIME TO TRUE
              work.setItIsNotFirstTime88100True(); 
              
//  MOVE FUNCTION CURRENT-DATE TO 800-CURRENT-DATE-TIME
              work.setCurrentDateTime800( substring(CFUtil.getCurrentDate(timeZoneId),0,10));
          }
//  SET 88-100-NO-TABLE-WAS-LOADED TO TRUE
          work.setNoTableWasLoaded88100True(); 
          
      
      }
      /**
      * loadTablesIfNeeded 
      *   This method is derived from 
  *   COBOL Paragraph - 2000-LOAD-TABLES-IF-NEEDED COBOL Cyclomatic complexity - 2
      * Input  :  

      * - haveWeLoadedATable100          COBOL Name: 100-HAVE-WE-LOADED-A-TABLE
      *
      * Output : None 

      * @throws CFException
      */
      private void loadTablesIfNeeded() throws Exception {
      
// *        This is used to tell whether we must resolve pointers

// *-----------------------------------------------------------------
// * Check dates on current tables against dates which should
// * now be in effect.  load tables if needed. resolve first-subfield
// * pointers if needed.
// *-----------------------------------------------------------------
//  PERFORM 2100-LOAD-TABLE-8-IF-NEEDED
          loadTable8IfNeeded();/*2100-LOAD-TABLE-8-IF-NEEDED*/
//  PERFORM 2200-LOAD-TABLE-9-IF-NEEDED
          loadTable9IfNeeded();/*2200-LOAD-TABLE-9-IF-NEEDED*/
//  IF 88-100-WE-LOADED-A-TABLE
          if ( work.isWeLoadedATable88100()  ) { 
//  PERFORM 2300-RESOLVE-FIRST-SUBFLD-PTRS
              resolveFirstSubfldPtrs();/*2300-RESOLVE-FIRST-SUBFLD-PTRS*/
          }
      
      }
      /**
      * loadTable8IfNeeded 
      *   This method is derived from 
  *   COBOL Paragraph - 2100-LOAD-TABLE-8-IF-NEEDED COBOL Cyclomatic complexity - 2
      * Input  :  

      * - table8Id300                    COBOL Name: 300-TABLE-8-ID
      * - ip000608ProcessingDateTime     COBOL Name: IP000608-PROCESSING-DATE-TIME
      * - lastKeyDtTmT8800               COBOL Name: 800-LAST-KEY-DT-TM-T8
      *
      * Output :  

      * - ip00054KeyTableId              COBOL Name: IP00054-KEY-TABLE-ID
      * - table8Id300                    COBOL Name: 300-TABLE-8-ID
      * - ip00054ReloadDtTm              COBOL Name: IP00054-RELOAD-DT-TM
      * - ip000608ProcessingDateTime     COBOL Name: IP000608-PROCESSING-DATE-TIME
      * - lastKeyDtTmT8800               COBOL Name: 800-LAST-KEY-DT-TM-T8
      * - haveWeLoadedATable100          COBOL Name: 100-HAVE-WE-LOADED-A-TABLE
      *
      * @throws CFException
      */
      private void loadTable8IfNeeded() throws Exception {
			// Declare local variables used in the method
			Ip00054Table5Key1 ip00054Table5Key1 = ip00054TableEntry.getIp00054Table5Key1();
			char[] ip00054ReloadDtTm = null;
			char[] lastKeyDtTmT8800 = null;
			// End of variable declaration


// *-----------------------------------------------------------------
// * Pass current clearing-date-and-time to ip299010 to find the
// * table-8 date which should be in effect now.  load if needed.
// *-----------------------------------------------------------------
//  MOVE 300-TABLE-8-ID TO IP00054-KEY-TABLE-ID
          ip00054Table5Key1.setIp00054KeyTableId(work.getTable8Id300());
  
//  MOVE IP000608-PROCESSING-DATE-TIME TO IP00054-RELOAD-DT-TM
          ip00054TableEntry.setIp00054ReloadDtTm(ip000608ProcessingDateTimeGroup.getIp000608ProcessingDateTime());
//  PERFORM 8000-GET-TABLE-KEY-DT-TM
          getTableKeyDtTm();/*8000-GET-TABLE-KEY-DT-TM*/

// *    Check the date and time key of loaded table
// *    vs the table to be loaded.

// *        The loaded version of table 8 is still current
//  IF IP00054-RELOAD-DT-TM EQUAL 800-LAST-KEY-DT-TM-T8
          lastKeyDtTmT8800 = work.getLastKeyDtTmT8800();
          ip00054ReloadDtTm = ip00054TableEntry.getIp00054ReloadDtTm();
//  ELSE
          if (		compareChars(ip00054ReloadDtTm,lastKeyDtTmT8800) != 0 ) { 
//  PERFORM 2110-LOAD-TABLE-8
              loadTable8();/*2110-LOAD-TABLE-8*/
              // MOVE IP00054-RELOAD-DT-TM TO 800-LAST-KEY-DT-TM-T8
              work.setLastKeyDtTmT8800(ip00054TableEntry.getIp00054ReloadDtTm());
//  SET 88-100-WE-LOADED-A-TABLE TO TRUE
              work.setWeLoadedATable88100True(); 
              
//  PERFORM 8400-DISPLAY-COUNT
              displayCount();/*8400-DISPLAY-COUNT*/
          }
  
      
      }
      /**
      * loadTable8 
      *   This method is derived from 
  *   COBOL Paragraph - 2110-LOAD-TABLE-8 COBOL Cyclomatic complexity - 2
      * Input  :  

      * - table8Id300                    COBOL Name: 300-TABLE-8-ID
      * - ip00054ReloadDtTm              COBOL Name: IP00054-RELOAD-DT-TM
      * - ip50005OneDayReadStatus        COBOL Name: IP50005-ONE-DAY-READ-STATUS
      * - rowCount800                    COBOL Name: 800-ROW-COUNT
      *
      * Output :  

      * - tableMaxLength800              COBOL Name: 800-TABLE-MAX-LENGTH
      * - rowLength800                   COBOL Name: 800-ROW-LENGTH
      * - ip50005ReadTableId             COBOL Name: IP50005-READ-TABLE-ID
      * - tableId610                     COBOL Name: 610-TABLE-ID
      * - table8Id300                    COBOL Name: 300-TABLE-8-ID
      * - ip50005EffDate                 COBOL Name: IP50005-EFF-DATE
      * - ip00054ReloadDtTm              COBOL Name: IP00054-RELOAD-DT-TM
      * - startPoint400                  COBOL Name: 400-START-POINT
      * - ip000804MaxPdsNo               COBOL Name: IP000804-MAX-PDS-NO
      *
      * @throws CFException
      */
      private void loadTable8() throws Exception {
			// Declare local variables used in the method
			Ip50005TableKey ip50005TableKey = ip50005OneDayRec.getIp50005TableKeyAll().getIp50005TableKey();
			// End of variable declaration


// * Move the data into table 8.
// *-----------------------------------------------------------------
//  MOVE LENGTH OF IP000804-PDS-ATTR-TABLE TO 800-TABLE-MAX-LENGTH
          work.setTableMaxLength800(Ip000804PdsAttrTable.getIp000804PdsAttrTableFieldLength());
//  MOVE LENGTH OF IP000804-PDS-ATTR-ROW TO 800-ROW-LENGTH
          work.setRowLength800(Ip000804PdsAttrRow.getIp000804PdsAttrRowFieldLength());
//  MOVE 300-TABLE-8-ID TO IP50005-READ-TABLE-ID 610-TABLE-ID
          ip50005TableKey.setIp50005ReadTableId(work.getTable8Id300());
          recNotFoundMsg610.setTableId610(work.getTable8Id300());
  
          // MOVE IP00054-RELOAD-DT-TM TO IP50005-EFF-DATE
          ip50005OneDayRec.getIp50005TableKeyAll().getIp50005TableKey().setIp50005EffDate(padLeftZeros(10,ip00054TableEntry.getIp00054ReloadDtTm(),false));
  
//  MOVE 1 TO 400-START-POINT
          work.setStartPoint400(1);
//  PERFORM WITH TEST AFTER UNTIL 88-IP50005-TBL-LAST-REC-Y
          while (true) { 
//  PERFORM 8100-GET-FROM-ONE-DAY-FILE
              getFromOneDayFile();/*8100-GET-FROM-ONE-DAY-FILE*/
//  PERFORM 2111-MOVE-TO-TABLE-8
              moveToTable8();/*2111-MOVE-TO-TABLE-8*/
          if (( ip50005OneDayReadStatusGroup.isIp50005TblLastRecY88()  )) break;
          }
//  PERFORM 8300-CHECK-FOR-COMPLETE-ROWS
          checkForCompleteRows();/*8300-CHECK-FOR-COMPLETE-ROWS*/
          ip000804PdsAttributes.setIp000804MaxPdsNo((short) (work.getRowCount800()));
      
      }
      /**
      * moveToTable8 
      *   This method is derived from 
  *   COBOL Paragraph - 2111-MOVE-TO-TABLE-8 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - ip50005TableData               COBOL Name: IP50005-TABLE-DATA
      * - startPoint400                  COBOL Name: 400-START-POINT
      * - ip50005TableDataLength         COBOL Name: IP50005-TABLE-DATA-LENGTH
      *
      * Output :  

      * - ip000804PdsAttrTable           COBOL Name: IP000804-PDS-ATTR-TABLE
      * - ip50005TableData               COBOL Name: IP50005-TABLE-DATA
      * - startPoint400                  COBOL Name: 400-START-POINT
      *
      * @throws CFException
      */
      private void moveToTable8() throws Exception {

// *-----------------------------------------------------------------
// *  Check to see if the new data will fit into the table.  if so
// *  move it into the next available positions of table 8.
// *-----------------------------------------------------------------
//  PERFORM 8200-CHECK-TABLE-LIMIT
          checkTableLimit();/*8200-CHECK-TABLE-LIMIT*/
//  MOVE IP50005-TABLE-DATA TO IP000804-PDS-ATTR-TABLE ( 400-START-POINT : IP50005-TABLE-DATA-LENGTH )
          ip000804PdsAttributes.replace(ip50005OneDayRec/*parent*/,22/*fromOffset - (ip000804PdsAttrTable) */,32730/*fromLen*/,2+work.getStartPoint400() - 1/*toOffset - (ip50005TableData) */,(int) ip50005OneDayRecLthGroup.getIp50005TableDataLength()/*toLen*/);
//  ADD IP50005-TABLE-DATA-LENGTH TO 400-START-POINT
          work.setStartPoint400(work.getStartPoint400()+(int) ip50005OneDayRecLthGroup.getIp50005TableDataLength());
      
      }
      /**
      * loadTable9IfNeeded 
      *   This method is derived from 
  *   COBOL Paragraph - 2200-LOAD-TABLE-9-IF-NEEDED COBOL Cyclomatic complexity - 2
      * Input  :  

      * - table9Id300                    COBOL Name: 300-TABLE-9-ID
      * - ip000608ProcessingDateTime     COBOL Name: IP000608-PROCESSING-DATE-TIME
      * - lastKeyDtTmT9800               COBOL Name: 800-LAST-KEY-DT-TM-T9
      *
      * Output :  

      * - ip00054KeyTableId              COBOL Name: IP00054-KEY-TABLE-ID
      * - table9Id300                    COBOL Name: 300-TABLE-9-ID
      * - ip00054ReloadDtTm              COBOL Name: IP00054-RELOAD-DT-TM
      * - ip000608ProcessingDateTime     COBOL Name: IP000608-PROCESSING-DATE-TIME
      * - lastKeyDtTmT9800               COBOL Name: 800-LAST-KEY-DT-TM-T9
      * - haveWeLoadedATable100          COBOL Name: 100-HAVE-WE-LOADED-A-TABLE
      *
      * @throws CFException
      */
      private void loadTable9IfNeeded() throws Exception {
			// Declare local variables used in the method
			Ip00054Table5Key1 ip00054Table5Key1 = ip00054TableEntry.getIp00054Table5Key1();
			char[] ip00054ReloadDtTm = null;
			char[] lastKeyDtTmT9800 = null;
			// End of variable declaration


// *-----------------------------------------------------------------
// * Pass current clearing-date-and-time to ip299010 to find the
// * table-9 date which should be loaded now.  load if needed.
// *-----------------------------------------------------------------
//  MOVE 300-TABLE-9-ID TO IP00054-KEY-TABLE-ID
          ip00054Table5Key1.setIp00054KeyTableId(work.getTable9Id300());
  
//  MOVE IP000608-PROCESSING-DATE-TIME TO IP00054-RELOAD-DT-TM
          ip00054TableEntry.setIp00054ReloadDtTm(ip000608ProcessingDateTimeGroup.getIp000608ProcessingDateTime());
//  PERFORM 8000-GET-TABLE-KEY-DT-TM
          getTableKeyDtTm();/*8000-GET-TABLE-KEY-DT-TM*/

// *    Check the date and time key of loaded table
// *    vs the table to be loaded.

// *        The loaded version of table 9 is still current
//  IF IP00054-RELOAD-DT-TM EQUAL 800-LAST-KEY-DT-TM-T9
          lastKeyDtTmT9800 = work.getLastKeyDtTmT9800();
          ip00054ReloadDtTm = ip00054TableEntry.getIp00054ReloadDtTm();
//  ELSE
          if (		compareChars(ip00054ReloadDtTm,lastKeyDtTmT9800) != 0 ) { 
//  PERFORM 2210-LOAD-TABLE-9
              loadTable9();/*2210-LOAD-TABLE-9*/
              // MOVE IP00054-RELOAD-DT-TM TO 800-LAST-KEY-DT-TM-T9
              work.setLastKeyDtTmT9800(ip00054TableEntry.getIp00054ReloadDtTm());
//  SET 88-100-WE-LOADED-A-TABLE TO TRUE
              work.setWeLoadedATable88100True(); 
              
//  PERFORM 8400-DISPLAY-COUNT
              displayCount();/*8400-DISPLAY-COUNT*/
          }
  
      
      }
      /**
      * loadTable9 
      *   This method is derived from 
  *   COBOL Paragraph - 2210-LOAD-TABLE-9 COBOL Cyclomatic complexity - 3
      * Input  :  

      * - table9Id300                    COBOL Name: 300-TABLE-9-ID
      * - ip00054ReloadDtTm              COBOL Name: IP00054-RELOAD-DT-TM
      * - ip50005OneDayReadStatus        COBOL Name: IP50005-ONE-DAY-READ-STATUS
      * - rowCount800                    COBOL Name: 800-ROW-COUNT
      * - ip000904PdsSubMax              COBOL Name: IP000904-PDS-SUB-MAX
      *
      * Output :  

      * - tableMaxLength800              COBOL Name: 800-TABLE-MAX-LENGTH
      * - rowLength800                   COBOL Name: 800-ROW-LENGTH
      * - ip50005ReadTableId             COBOL Name: IP50005-READ-TABLE-ID
      * - tableId610                     COBOL Name: 610-TABLE-ID
      * - table9Id300                    COBOL Name: 300-TABLE-9-ID
      * - ip50005EffDate                 COBOL Name: IP50005-EFF-DATE
      * - ip00054ReloadDtTm              COBOL Name: IP00054-RELOAD-DT-TM
      * - startPoint400                  COBOL Name: 400-START-POINT
      * - maxT9RowNo800                  COBOL Name: 800-MAX-T9-ROW-NO
      * - rowCount800                    COBOL Name: 800-ROW-COUNT
      * - ip000904PdsSubName             COBOL Name: IP000904-PDS-SUB-NAME
      *
      * @throws CFException
      */
      private void loadTable9() throws Exception {
			// Declare local variables used in the method
			Ip50005TableKey ip50005TableKey = ip50005OneDayRec.getIp50005TableKeyAll().getIp50005TableKey();
			int rowCount800 = 0;
			short ip000904PdsSubMax = 0;
			// End of variable declaration


// *-----------------------------------------------------------------
// * Get all records from the optimized parameter file for table 9.
// * move the data into table 9.
// *-----------------------------------------------------------------
//  MOVE LENGTH OF IP000904-PDS-SUB-ATTR-TABLE TO 800-TABLE-MAX-LENGTH
          work.setTableMaxLength800(Ip000904PdsSubAttrTable.getIp000904PdsSubAttrTableFieldLength());
//  MOVE LENGTH OF IP000904-PDS-SUB-ATTR-ROW TO 800-ROW-LENGTH
          work.setRowLength800(Ip000904PdsSubAttrRow.getIp000904PdsSubAttrRowFieldLength());
//  MOVE 300-TABLE-9-ID TO IP50005-READ-TABLE-ID 610-TABLE-ID
          ip50005TableKey.setIp50005ReadTableId(work.getTable9Id300());
          recNotFoundMsg610.setTableId610(work.getTable9Id300());
  
          // MOVE IP00054-RELOAD-DT-TM TO IP50005-EFF-DATE
          ip50005OneDayRec.getIp50005TableKeyAll().getIp50005TableKey().setIp50005EffDate(padLeftZeros(10,ip00054TableEntry.getIp00054ReloadDtTm(),false));
  
//  MOVE 1 TO 400-START-POINT
          work.setStartPoint400(1);
//  PERFORM WITH TEST AFTER UNTIL 88-IP50005-TBL-LAST-REC-Y
          while (true) { 
//  PERFORM 8100-GET-FROM-ONE-DAY-FILE
              getFromOneDayFile();/*8100-GET-FROM-ONE-DAY-FILE*/
//  PERFORM 2211-MOVE-TO-TABLE-9
              moveToTable9();/*2211-MOVE-TO-TABLE-9*/
          if (( ip50005OneDayReadStatusGroup.isIp50005TblLastRecY88()  )) break;
          }
//  PERFORM 8300-CHECK-FOR-COMPLETE-ROWS
          checkForCompleteRows();/*8300-CHECK-FOR-COMPLETE-ROWS*/
          // MOVE 800-ROW-COUNT TO 800-MAX-T9-ROW-NO
          work.setMaxT9RowNo800(work.getRowCount800());

// *    Mark the row after the last one loaded as "undefined"
          rowCount800 = work.getRowCount800();
          ip000904PdsSubMax = work.getIp000904PdsSubMax();
//  IF 800-ROW-COUNT < IP000904-PDS-SUB-MAX
          if (	( rowCount800 < ip000904PdsSubMax ) ) { 
//  SET IP000904-UNDEFINED-PDS-SUBFLD ( 800-ROW-COUNT + 1) TO TRUE
              ip000904PdsSubAttrTable.getIp000904PdsSubAttrRow(work.getRowCount800() + 1 - 1).setIp000904UndefinedPdsSubfldTrue(); 
              
          }
  
      
      }
      /**
      * moveToTable9 
      *   This method is derived from 
  *   COBOL Paragraph - 2211-MOVE-TO-TABLE-9 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - ip50005TableData               COBOL Name: IP50005-TABLE-DATA
      * - startPoint400                  COBOL Name: 400-START-POINT
      * - ip50005TableDataLength         COBOL Name: IP50005-TABLE-DATA-LENGTH
      *
      * Output :  

      * - ip000904PdsSubAttrTable        COBOL Name: IP000904-PDS-SUB-ATTR-TABLE
      * - ip50005TableData               COBOL Name: IP50005-TABLE-DATA
      * - startPoint400                  COBOL Name: 400-START-POINT
      *
      * @throws CFException
      */
      private void moveToTable9() throws Exception {

// *-----------------------------------------------------------------
// *  Check to see if the new data will fit into the table.  if so
// *  move it into the next available positions of table 9.
// *-----------------------------------------------------------------
//  PERFORM 8200-CHECK-TABLE-LIMIT
          checkTableLimit();/*8200-CHECK-TABLE-LIMIT*/
//  MOVE IP50005-TABLE-DATA TO IP000904-PDS-SUB-ATTR-TABLE ( 400-START-POINT : IP50005-TABLE-DATA-LENGTH )
          ip000904PdsSubAttrTable.replace(ip50005OneDayRec/*parent*/,22/*fromOffset - (ip000904PdsSubAttrTable) */,32730/*fromLen*/,0+work.getStartPoint400() - 1/*toOffset - (ip50005TableData) */,(int) ip50005OneDayRecLthGroup.getIp50005TableDataLength()/*toLen*/);
//  ADD IP50005-TABLE-DATA-LENGTH TO 400-START-POINT
          work.setStartPoint400(work.getStartPoint400()+(int) ip50005OneDayRecLthGroup.getIp50005TableDataLength());
      
      }
      /**
      * resolveFirstSubfldPtrs 
      *   This method is derived from 
  *   COBOL Paragraph - 2300-RESOLVE-FIRST-SUBFLD-PTRS COBOL Cyclomatic complexity - 6
      * Input  :  

      * - ip000804I                      COBOL Name: IP000804-I
      * - ip000804MaxPdsNo               COBOL Name: IP000804-MAX-PDS-NO
      * - ip000904I                      COBOL Name: IP000904-I
      * - maxT9RowNo800                  COBOL Name: 800-MAX-T9-ROW-NO
      * - ip000904PdsNo                  COBOL Name: IP000904-PDS-NO
      *
      * Output :  

      * - currentPdsNo800                COBOL Name: 800-CURRENT-PDS-NO
      * - ip000804I                      COBOL Name: IP000804-I
      * - ip000804PdsFirstSubfldRedefined COBOL Name: IP000804-PDS-FIRST-SUBFLD-REDEFINED
      * - ip000904I                      COBOL Name: IP000904-I
      * - ip000904PdsNo                  COBOL Name: IP000904-PDS-NO
      * - ip000804PdsFirstSubfld         COBOL Name: IP000804-PDS-FIRST-SUBFLD
      *
      * @throws CFException
      */
      private void resolveFirstSubfldPtrs() throws Exception {
			// Declare local variables used in the method
			int currentPdsNo800 = 0;
			// End of variable declaration


// *-----------------------------------------------------------------
// * Scan table 9.  for each pds whose subfields are defined there
// * post the index value of its first table-9 entry in the
// * first-subfld field of that pds's entry in table 8.
// *-----------------------------------------------------------------
//  MOVE ZEROES TO 800-CURRENT-PDS-NO
          work.setCurrentPdsNo800(0);
//  PERFORM VARYING IP000804-I FROM 1 BY 1 UNTIL IP000804-I > IP000804-MAX-PDS-NO
          for (ip000804I = 1; (	( ip000804I <= ip000804PdsAttributes.getIp000804MaxPdsNo() ) ) ; ip000804I = ip000804I + 1 ) {
//  SET 88-IP000804-NO-PDS-SUBFLDS ( IP000804-I ) TO TRUE
              ip000804PdsAttributes.getIp000804PdsAttrTable().getIp000804PdsAttrRow(ip000804I - 1).setIp000804NoPdsSubflds88True(); 
              
          }
//  PERFORM VARYING IP000904-I FROM 1 BY 1 UNTIL IP000904-I > 800-MAX-T9-ROW-NO
          for (ip000904I = 1; (	( ip000904I <= work.getMaxT9RowNo800() )) ; ip000904I = ip000904I + 1 ) {
              currentPdsNo800 = work.getCurrentPdsNo800();
//  IF IP000904-PDS-NO ( IP000904-I ) > 800-CURRENT-PDS-NO
              if (	( ip000904PdsSubAttrTable.getIp000904PdsSubAttrRow(ip000904I - 1).getIp000904PdsNo() > currentPdsNo800 ) ) { 
//  MOVE IP000904-PDS-NO ( IP000904-I ) TO 800-CURRENT-PDS-NO
                  work.setCurrentPdsNo800(ip000904PdsSubAttrTable.getIp000904PdsSubAttrRow(ip000904I - 1).getIp000904PdsNo());
//  SET IP000804-PDS-FIRST-SUBFLD ( 800-CURRENT-PDS-NO ) TO IP000904-I
                  ip000804PdsAttributes.getIp000804PdsAttrTable().getIp000804PdsAttrRow(work.getCurrentPdsNo800() - 1).setIp000804PdsFirstSubfld(IP000904_PDS_SUB_ATTR_ROW_LENGTH * ( ((ip000904I < 1) ? 1:ip000904I) - 1)); 
                  
              }
  
          }
      
      }
      /**
      * getTableKeyDtTm 
      *   This method is derived from 
  *   COBOL Paragraph - 8000-GET-TABLE-KEY-DT-TM COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      private void getTableKeyDtTm() throws Exception {

// *-----------------------------------------------------------------
// * Call routine which returns the date and time of
// * the table version which should be effective now.
// *-----------------------------------------------------------------
//  CALL 800-PTR-IP299010
          // CALL 800-PTR-IP299010
          	this.setRc( ip299010.process());
      
      }
      /**
      * getFromOneDayFile 
      *   This method is derived from 
  *   COBOL Paragraph - 8100-GET-FROM-ONE-DAY-FILE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ip50005OneDayReadStatus        COBOL Name: IP50005-ONE-DAY-READ-STATUS
      * - recNotFoundMsg610              COBOL Name: 610-REC-NOT-FOUND-MSG
      * - para8100300                    COBOL Name: 300-PARA-8100
      * - recAbsentAbendCode300          COBOL Name: 300-REC-ABSENT-ABEND-CODE
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - ip60001EventErrorMsg           COBOL Name: IP60001-EVENT-ERROR-MSG
      * - recNotFoundMsg610              COBOL Name: 610-REC-NOT-FOUND-MSG
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para8100300                    COBOL Name: 300-PARA-8100
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - ip60001EventErrorCode          COBOL Name: IP60001-EVENT-ERROR-CODE
      * - recAbsentAbendCode300          COBOL Name: 300-REC-ABSENT-ABEND-CODE
      *
      * @throws CFException
      */
      private void getFromOneDayFile() throws Exception {

// *-----------------------------------------------------------------
// * Call routine to read record from one-day-file.
// *-----------------------------------------------------------------
//  CALL 800-PTR-IP650010
          // CALL 800-PTR-IP650010
          	this.setRc( ip650010.process());
//  IF 88-IP50005-ONE-DAY-IO-GOOD
//  ELSE
          if (!(ip50005OneDayReadStatusGroup.isIp50005OneDayIoGood88()) ) { 
              // MOVE 610-REC-NOT-FOUND-MSG TO 900-ABEND-TEXT IP60001-EVENT-ERROR-MSG
              abendMessage900.setAbendText900(recNotFoundMsg610.toCharArray());
              ip60001EventLogWorkArea.setIp60001EventErrorMsg(recNotFoundMsg610.toCharArray());
//  MOVE 300-PARA-8100 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(pad(30,work.getPara8100300(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-REC-ABSENT-ABEND-CODE TO 900-ABEND-CODE IP60001-EVENT-ERROR-CODE
              abendMessage900.setAbendCode900(work.getRecAbsentAbendCode300());
              ip60001EventLogWorkArea.setIp60001EventErrorCode(work.getRecAbsentAbendCode300());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError();/*9000-TERMINATE-ON-ERROR*/
          }
      
      }
      /**
      * checkTableLimit 
      *   This method is derived from 
  *   COBOL Paragraph - 8200-CHECK-TABLE-LIMIT COBOL Cyclomatic complexity - 2
      * Input  :  

      * - startPoint400                  COBOL Name: 400-START-POINT
      * - ip50005TableDataLength         COBOL Name: IP50005-TABLE-DATA-LENGTH
      * - tableMaxLength800              COBOL Name: 800-TABLE-MAX-LENGTH
      * - ip50005ReadTableId             COBOL Name: IP50005-READ-TABLE-ID
      * - ip50005EffDate                 COBOL Name: IP50005-EFF-DATE
      * - tableOverflowError600          COBOL Name: 600-TABLE-OVERFLOW-ERROR
      * - para8200300                    COBOL Name: 300-PARA-8200
      * - tblOverflowAbendCode300        COBOL Name: 300-TBL-OVERFLOW-ABEND-CODE
      *
      * Output :  

      * - checkLength800                 COBOL Name: 800-CHECK-LENGTH
      * - tableId600                     COBOL Name: 600-TABLE-ID
      * - ip50005ReadTableId             COBOL Name: IP50005-READ-TABLE-ID
      * - timestamp600                   COBOL Name: 600-TIMESTAMP
      * - ip50005EffDate                 COBOL Name: IP50005-EFF-DATE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - ip60001EventErrorMsg           COBOL Name: IP60001-EVENT-ERROR-MSG
      * - tableOverflowError600          COBOL Name: 600-TABLE-OVERFLOW-ERROR
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para8200300                    COBOL Name: 300-PARA-8200
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - ip60001EventErrorCode          COBOL Name: IP60001-EVENT-ERROR-CODE
      * - tblOverflowAbendCode300        COBOL Name: 300-TBL-OVERFLOW-ABEND-CODE
      *
      * @throws CFException
      */
      private void checkTableLimit() throws Exception {
			// Declare local variables used in the method
			Ip50005TableKey ip50005TableKey = ip50005OneDayRec.getIp50005TableKeyAll().getIp50005TableKey();
			int checkLength800 = 0;
			int tableMaxLength800 = 0;
			// End of variable declaration

          work.setCheckLength800((int) (work.getStartPoint400() + ip50005OneDayRecLthGroup.getIp50005TableDataLength() - 1));
          tableMaxLength800 = work.getTableMaxLength800();
          checkLength800 = work.getCheckLength800();
//  IF 800-CHECK-LENGTH GREATER THAN 800-TABLE-MAX-LENGTH
          if (	( checkLength800 > tableMaxLength800 )) { 
//  MOVE IP50005-READ-TABLE-ID TO 600-TABLE-ID
              tableOverflowError600.setTableId600(ip50005TableKey.getIp50005ReadTableId());
  
//  MOVE IP50005-EFF-DATE TO 600-TIMESTAMP
              tableOverflowError600.setTimestamp600(String.valueOf(ip50005TableKey.getIp50005EffDateString()).toCharArray());
  
              // MOVE 600-TABLE-OVERFLOW-ERROR TO 900-ABEND-TEXT IP60001-EVENT-ERROR-MSG
              abendMessage900.setAbendText900(tableOverflowError600.toCharArray());
              ip60001EventLogWorkArea.setIp60001EventErrorMsg(tableOverflowError600.toCharArray());
//  MOVE 300-PARA-8200 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(pad(30,work.getPara8200300(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-TBL-OVERFLOW-ABEND-CODE TO 900-ABEND-CODE IP60001-EVENT-ERROR-CODE
              abendMessage900.setAbendCode900(work.getTblOverflowAbendCode300());
              ip60001EventLogWorkArea.setIp60001EventErrorCode(work.getTblOverflowAbendCode300());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError();/*9000-TERMINATE-ON-ERROR*/
          }
  
      
      }
      /**
      * checkForCompleteRows 
      *   This method is derived from 
  *   COBOL Paragraph - 8300-CHECK-FOR-COMPLETE-ROWS COBOL Cyclomatic complexity - 2
      * Input  :  

      * - startPoint400                  COBOL Name: 400-START-POINT
      * - ip50005ReadTableId             COBOL Name: IP50005-READ-TABLE-ID
      * - ip50005EffDate                 COBOL Name: IP50005-EFF-DATE
      * - tableIntegrityError640         COBOL Name: 640-TABLE-INTEGRITY-ERROR
      * - para8200300                    COBOL Name: 300-PARA-8200
      * - tblIntegrityAbendCode300       COBOL Name: 300-TBL-INTEGRITY-ABEND-CODE
      *
      * Output :  

      * - startPoint400                  COBOL Name: 400-START-POINT
      * - rowCount800                    COBOL Name: 800-ROW-COUNT
      * - remainder800                   COBOL Name: 800-REMAINDER
      * - tableId640                     COBOL Name: 640-TABLE-ID
      * - ip50005ReadTableId             COBOL Name: IP50005-READ-TABLE-ID
      * - timestamp640                   COBOL Name: 640-TIMESTAMP
      * - ip50005EffDate                 COBOL Name: IP50005-EFF-DATE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - ip60001EventErrorMsg           COBOL Name: IP60001-EVENT-ERROR-MSG
      * - tableIntegrityError640         COBOL Name: 640-TABLE-INTEGRITY-ERROR
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para8200300                    COBOL Name: 300-PARA-8200
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - ip60001EventErrorCode          COBOL Name: IP60001-EVENT-ERROR-CODE
      * - tblIntegrityAbendCode300       COBOL Name: 300-TBL-INTEGRITY-ABEND-CODE
      *
      * @throws CFException
      */
      private void checkForCompleteRows() throws Exception {
			// Declare local variables used in the method
			Ip50005TableKey ip50005TableKey = ip50005OneDayRec.getIp50005TableKeyAll().getIp50005TableKey();
			int remainder800 = 0;
			// End of variable declaration


// *    400-Start-point now points to the first byte beyond the table
//  SUBTRACT 1 FROM 400-START-POINT
          work.setStartPoint400(work.getStartPoint400()-1);
//  DIVIDE 400-START-POINT BY 800-ROW-LENGTH GIVING 800-ROW-COUNT REMAINDER 800-REMAINDER
          work.setRowCount800( (int) work.getStartPoint400()/work.getRowLength800());
          work.setRemainder800( (int) work.getStartPoint400()%work.getRowLength800());
          remainder800 = work.getRemainder800();
//  IF 800-REMAINDER > ZERO
          if (	( remainder800 > 0 )) { 
//  MOVE IP50005-READ-TABLE-ID TO 640-TABLE-ID
              tableIntegrityError640.setTableId640(ip50005TableKey.getIp50005ReadTableId());
  
//  MOVE IP50005-EFF-DATE TO 640-TIMESTAMP
              tableIntegrityError640.setTimestamp640(String.valueOf(ip50005TableKey.getIp50005EffDateString()).toCharArray());
  
              // MOVE 640-TABLE-INTEGRITY-ERROR TO 900-ABEND-TEXT IP60001-EVENT-ERROR-MSG
              abendMessage900.setAbendText900(tableIntegrityError640.toCharArray());
              ip60001EventLogWorkArea.setIp60001EventErrorMsg(tableIntegrityError640.toCharArray());
//  MOVE 300-PARA-8200 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(pad(30,work.getPara8200300(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-TBL-INTEGRITY-ABEND-CODE TO 900-ABEND-CODE IP60001-EVENT-ERROR-CODE
              abendMessage900.setAbendCode900(work.getTblIntegrityAbendCode300());
              ip60001EventLogWorkArea.setIp60001EventErrorCode(work.getTblIntegrityAbendCode300());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError();/*9000-TERMINATE-ON-ERROR*/
          }
  
      
      }
      /**
      * displayCount 
      *   This method is derived from 
  *   COBOL Paragraph - 8400-DISPLAY-COUNT COBOL Cyclomatic complexity - 1
      * Input  :  

      * - ip50005ReadTableId             COBOL Name: IP50005-READ-TABLE-ID
      * - ip50005EffDate                 COBOL Name: IP50005-EFF-DATE
      * - rowCount800                    COBOL Name: 800-ROW-COUNT
      * - rowsLoadedMessage630           COBOL Name: 630-ROWS-LOADED-MESSAGE
      *
      * Output :  

      * - tableId630                     COBOL Name: 630-TABLE-ID
      * - ip50005ReadTableId             COBOL Name: IP50005-READ-TABLE-ID
      * - tableTimestamp630              COBOL Name: 630-TABLE-TIMESTAMP
      * - ip50005EffDate                 COBOL Name: IP50005-EFF-DATE
      * - rowsLoadedCnt630               COBOL Name: 630-ROWS-LOADED-CNT
      *
      * @throws CFException
      */
      private void displayCount() throws Exception {
			// Declare local variables used in the method
			Ip50005TableKey ip50005TableKey = ip50005OneDayRec.getIp50005TableKeyAll().getIp50005TableKey();
			// End of variable declaration


// *-----------------------------------------------------------------
// * Display table recods read and loaded count.
// *-----------------------------------------------------------------
//  MOVE IP50005-READ-TABLE-ID TO 630-TABLE-ID
          rowsLoadedMessage630.setTableId630(ip50005TableKey.getIp50005ReadTableId());
  
//  MOVE IP50005-EFF-DATE TO 630-TABLE-TIMESTAMP
          rowsLoadedMessage630.setTableTimestamp630(String.valueOf(ip50005TableKey.getIp50005EffDateString()).toCharArray());
  
          rowsLoadedMessage630.setRowsLoadedCnt630(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(work.getRowCount800())));
//  DISPLAY 630-ROWS-LOADED-MESSAGE
          logger.info(rowsLoadedMessage630.toString()); 
      
      }
      /**
      * terminateOnError 
      *   This method is derived from 
  *   COBOL Paragraph - 9000-TERMINATE-ON-ERROR COBOL Cyclomatic complexity - 1
      * Input  :  

      * - abendParaName900               COBOL Name: 900-ABEND-PARA-NAME
      * - abendMessage900                COBOL Name: 900-ABEND-MESSAGE
      *
      * Output : None 

      * @throws CFException
      */
      private void terminateOnError() throws Exception {

// *-----------------------------------------------------------------
// * Display abend message and call abend routine.
// *-----------------------------------------------------------------
//  DISPLAY '***********************************'
          logger.info("***********************************"); 
//  DISPLAY 'A B E N D   A B E N D   A B E N D  '
          logger.info("A B E N D   A B E N D   A B E N D  "); 
//  DISPLAY 'A B E N D   I P 7 4 1 0 1 0        '
          logger.info("A B E N D   I P 7 4 1 0 1 0        "); 
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
