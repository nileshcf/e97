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
* program function: load api for table 6 (de attributes),
* the auxilliary table 6 for acceptance brand values, and
* table 7 (de subfield attributes).  tables are read from the
* optimized parameter file, sys007, via calls to the optimizied
* parameter file api. ip650010.  key values to be passed to
*
* subroutines:
*    ip299010:  searches table 5 (which lists all dated versions
*               of tables on the optimized parameter file).
*               returns, for the specified table, the highest
*               effective date and time which is less than or
*               equal to the current clearing cycle date and time.
*               this is then passed to ip650010 for use in the
*               vsam ksds search key value.
*    ip650010:  reads the optimized parameter file (sys007).
*               returns one record at a time. an entire table
*               may be contained in one record.
*-----------------------------------------------------------------
* this program loads table 6, 6-aux, or table 7 as needed.
* the program remembers four timestamps:
*   1. effective-date-and-time of the currently loaded table 6
*   2. effective-date-and-time of the currently loaded table 6a
*   3. effective-date-and-time of the currently loaded table 7
*   4. the clearing-cycle-date-and-time at which table 6 pointers
*      to table 7 were resolved.
*
* the current clearing-cycle-timestamp (in ip000608) will
* determine the need to load either table.  if it is equal to the
* pointer resolution date (item 3 above) then no load is needed,
* since if we passed this to ip299010 it would return the same
* effective dates for tables 6, 6a and 7 as are already loaded.
*
* if they are different, then we call ip29901o to obtain the
* timestamps of the versions of the three tables which should
* be in effect now.  if any timestamp is different from that
* of the currently loaded table, then the new version of the table
* is loaded.
*
* if either table 6 or table 7 was loaded, then we must link table
* 6 entries to their subfields in table 7. table 7 is scanned and
* the appropriate t7 index values are posted in the "first sub-
* field-pointer" fields of table 6.
*
* if either table 6 or table 6a was loaded, then we must link
* table 6 entries to their associate rows in table 6a.  tale 6a is
* scanned and the appropriate 6a index values are posted in the
* a/b pointer fields of table 6.
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
*----------------------------------------------------------------*
*    project         :gcms release 3.1                           *
*    date            :2002/05/06                                 *
*    version         :001.01                                     *
*    programmer      :isc                                        *
*    modification    :modified to call ip996010 to display       *
*                     execution messages.                        *
*-----------------------------------------------------------------
* project      :gcms release 3.1
* date         :2003/04/04
* modification :recompile for ip996010
*----------------------------------------------------------------*
* project      :gcms release 3.2
* date         :2003/10/03
* programmer   :ken petzoldt
* modification :corrected program name in abend display
*----------------------------------------------------------------*
* project      :gcms release 10.1 - scr07039
* date         :2010/04/16
* programmer   :wipro
* modification :modified to eliminate compiler warning
*               messages.
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
  import com.cloudframe.app.global.sharedvar.Ip000604DeAttrTable;
  import com.cloudframe.app.global.sharedvar.Ip000604DeAttrRow;
  import com.cloudframe.app.global.sharedvar.Ip50005TableKey;
  import com.cloudframe.app.global.sharedvar.Ip00060aDeAttrTable;
  import com.cloudframe.app.global.sharedvar.Ip00060aDeAttrRow;
  import com.cloudframe.app.global.sharedvar.Ip000704DeSubAttrTable;
  import com.cloudframe.app.global.sharedvar.Ip000704DeSubAttrRow;
  import com.cloudframe.app.process.Ip299010;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.process.Ip650010;
  import com.cloudframe.app.ip739010.dto.*;
  import com.cloudframe.app.ip739010.dto.TableIntegrityError640;
  import com.cloudframe.app.ip739010.dto.AbendParaName900;
  import com.cloudframe.app.ip739010.dto.AbendMessage900;
  import com.cloudframe.app.ip739010.dto.RowsLoadedMessage630;
  import com.cloudframe.app.ip739010.dto.TableOverflowError600;
  import com.cloudframe.app.ip739010.dto.RecNotFoundMsg610;
  import com.cloudframe.app.global.sharedvar.Ip00054TableEntry;
  import com.cloudframe.app.global.sharedvar.Ip50005OneDayRecLthGroup;
  import com.cloudframe.app.global.sharedvar.Ip50005OneDayRec;
  import com.cloudframe.app.global.sharedvar.Ip50005OneDayReadStatusGroup;
  import com.cloudframe.app.global.sharedvar.Ip50005ClearingDtTm;
  import com.cloudframe.app.global.sharedvar.Ip60001EventLogWorkArea;
  import com.cloudframe.app.global.sharedvar.Ip000608ProcessingDateTimeGroup;
  import com.cloudframe.app.global.sharedvar.Ip996011ProgramStartMessage;
  import com.cloudframe.app.ip739010.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("ip739010")
  
  public class Ip739010 extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Ip739010.class);
  
  private TableIntegrityError640 tableIntegrityError640 = new TableIntegrityError640() ;
  private AbendParaName900 abendParaName900 = new AbendParaName900() ;
  private AbendMessage900 abendMessage900 = new AbendMessage900() ;
  private RowsLoadedMessage630 rowsLoadedMessage630 = new RowsLoadedMessage630() ;
  private TableOverflowError600 tableOverflowError600 = new TableOverflowError600() ;
  private RecNotFoundMsg610 recNotFoundMsg610 = new RecNotFoundMsg610() ;
  private Work work = new Work() ;
  
  @Value("${timeZoneId:Etc/GMT}")
  private String timeZoneId;
  
  
  @Autowired 
  @Qualifier("global_ip00060aDeAttrTable")
  Ip00060aDeAttrTable ip00060aDeAttrTable;
  
  
  private static final int IP000704_DE_SUB_ATTR_ROW_LENGTH = 70;
  private static final int IP00060A_DE_ATTR_ROW_LENGTH = 80;
  
  int ip00060aI;
  int ip000604I;
  int ip000704I;
  
  
  
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
  *   COBOL Paragraph - 0000-MAINLINE COBOL Cyclomatic complexity - 3
      * Input  :  

      * - ip000608ProcessingDateTime     COBOL Name: IP000608-PROCESSING-DATE-TIME
      * - clearingDtTm800                COBOL Name: 800-CLEARING-DT-TM
      *
      * Output :  

      * - clearingDtTm800                COBOL Name: 800-CLEARING-DT-TM
      * - ip000608ProcessingDateTime     COBOL Name: IP000608-PROCESSING-DATE-TIME
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
              // MOVE IP000608-PROCESSING-DATE-TIME TO 800-CLEARING-DT-TM
              work.setClearingDtTm800(ip000608ProcessingDateTimeGroup.getIp000608ProcessingDateTime());
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
  *   COBOL Paragraph - 1000-INITIALIZATION COBOL Cyclomatic complexity - 5
      * Input  :  

      * - isItTheFirstTime100            COBOL Name: 100-IS-IT-THE-FIRST-TIME
      * - pgmIp650010300                 COBOL Name: 300-PGM-IP650010
      * - pgmIp299010300                 COBOL Name: 300-PGM-IP299010
      * - ip000608ProcessingDateTime     COBOL Name: IP000608-PROCESSING-DATE-TIME
      *
      * Output :  

      * - ptrIp650010800                 COBOL Name: 800-PTR-IP650010
      * - ptrIp299010800                 COBOL Name: 800-PTR-IP299010
      * - isItTheFirstTime100            COBOL Name: 100-IS-IT-THE-FIRST-TIME
      * - currentDateTime800             COBOL Name: 800-CURRENT-DATE-TIME
      * - wasT6Loaded100                 COBOL Name: 100-WAS-T6-LOADED
      * - wasT7Loaded100                 COBOL Name: 100-WAS-T7-LOADED
      * - ip000608ProcessingDateTime     COBOL Name: IP000608-PROCESSING-DATE-TIME
      *
      * @throws CFException
      */
      private void initialization() throws Exception {
			// Declare local variables used in the method
			char[] ip000608ProcessingDateTime = null;
			// End of variable declaration


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
//  SET 88-100-T6-NOT-LOADED TO TRUE
          work.setT6NotLoaded88100True(); 
          
//  SET 88-100-T7-NOT-LOADED TO TRUE
          work.setT7NotLoaded88100True(); 
          

// *    Ensure that the processing date has been set.  if not,
// *    use the current date.
          ip000608ProcessingDateTime = ip000608ProcessingDateTimeGroup.getIp000608ProcessingDateTime();
//  IF IP000608-PROCESSING-DATE-TIME = LOW-VALUES
          if (			( checkLowValue(ip000608ProcessingDateTime) ) ) { 
//  MOVE 800-CURRENT-DATE-TIME TO IP000608-PROCESSING-DATE-TIME
              ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime(work.getCurrentDateTime800());
          }
  
      
      }
      /**
      * loadTablesIfNeeded 
      *   This method is derived from 
  *   COBOL Paragraph - 2000-LOAD-TABLES-IF-NEEDED COBOL Cyclomatic complexity - 5
      * Input  :  

      * - wasT6Loaded100                 COBOL Name: 100-WAS-T6-LOADED
      * - wasT7Loaded100                 COBOL Name: 100-WAS-T7-LOADED
      *
      * Output : None 

      * @throws CFException
      */
      private void loadTablesIfNeeded() throws Exception {

// *-----------------------------------------------------------------
// * Check dates on current tables against dates which should
// * now be in effect.  load tables if needed. resolve first-subfield
// * pointers if needed.
// *-----------------------------------------------------------------
//  PERFORM 2100-LOAD-TABLE-6-IF-NEEDED
          loadTable6IfNeeded();/*2100-LOAD-TABLE-6-IF-NEEDED*/
//  IF 88-100-T6-WAS-LOADED
          if ( work.isT6WasLoaded88100()  ) { 
//  PERFORM 2200-LOAD-TABLE-6A
              loadTable6a();/*2200-LOAD-TABLE-6A*/
          }
//  PERFORM 2300-LOAD-TABLE-7-IF-NEEDED
          loadTable7IfNeeded();/*2300-LOAD-TABLE-7-IF-NEEDED*/
//  IF 88-100-T6-WAS-LOADED OR 88-100-T7-WAS-LOADED
          if ( work.isT6WasLoaded88100()   ||  work.isT7WasLoaded88100()  ) { 
//  PERFORM 2400-RESOLVE-FIRST-SUBFLD-PTRS
              resolveFirstSubfldPtrs();/*2400-RESOLVE-FIRST-SUBFLD-PTRS*/
          }
//  IF 88-100-T6-WAS-LOADED
          if ( work.isT6WasLoaded88100()  ) { 
//  PERFORM 2500-RESOLVE-ACC-BRAND-PTRS
              resolveAccBrandPtrs();/*2500-RESOLVE-ACC-BRAND-PTRS*/
          }
      
      }
      /**
      * loadTable6IfNeeded 
      *   This method is derived from 
  *   COBOL Paragraph - 2100-LOAD-TABLE-6-IF-NEEDED COBOL Cyclomatic complexity - 2
      * Input  :  

      * - table6Id300                    COBOL Name: 300-TABLE-6-ID
      * - ip000608ProcessingDateTime     COBOL Name: IP000608-PROCESSING-DATE-TIME
      * - lastKeyDtTmT6800               COBOL Name: 800-LAST-KEY-DT-TM-T6
      *
      * Output :  

      * - ip00054KeyTableId              COBOL Name: IP00054-KEY-TABLE-ID
      * - table6Id300                    COBOL Name: 300-TABLE-6-ID
      * - ip00054ReloadDtTm              COBOL Name: IP00054-RELOAD-DT-TM
      * - ip000608ProcessingDateTime     COBOL Name: IP000608-PROCESSING-DATE-TIME
      * - lastKeyDtTmT6800               COBOL Name: 800-LAST-KEY-DT-TM-T6
      * - wasT6Loaded100                 COBOL Name: 100-WAS-T6-LOADED
      *
      * @throws CFException
      */
      private void loadTable6IfNeeded() throws Exception {
			// Declare local variables used in the method
			Ip00054Table5Key1 ip00054Table5Key1 = ip00054TableEntry.getIp00054Table5Key1();
			char[] ip00054ReloadDtTm = null;
			char[] lastKeyDtTmT6800 = null;
			// End of variable declaration


// *-----------------------------------------------------------------
// * Pass current clearing-date-and-time to ip299010 to find the
// * table-6 date which should be in effect now.  load if needed.
// *-----------------------------------------------------------------
//  MOVE 300-TABLE-6-ID TO IP00054-KEY-TABLE-ID
          ip00054Table5Key1.setIp00054KeyTableId(work.getTable6Id300());
  
//  MOVE IP000608-PROCESSING-DATE-TIME TO IP00054-RELOAD-DT-TM
          ip00054TableEntry.setIp00054ReloadDtTm(ip000608ProcessingDateTimeGroup.getIp000608ProcessingDateTime());
//  PERFORM 8000-GET-TABLE-KEY-DT-TM
          getTableKeyDtTm();/*8000-GET-TABLE-KEY-DT-TM*/

// *    Check the date and time key of loaded table
// *    vs the table to be loaded.

// *        The loaded version of table 6 is still current
//  IF IP00054-RELOAD-DT-TM EQUAL 800-LAST-KEY-DT-TM-T6
          ip00054ReloadDtTm = ip00054TableEntry.getIp00054ReloadDtTm();
          lastKeyDtTmT6800 = work.getLastKeyDtTmT6800();
//  ELSE
          if (		compareChars(ip00054ReloadDtTm,lastKeyDtTmT6800) != 0 ) { 
//  PERFORM 2110-LOAD-TABLE-6
              loadTable6();/*2110-LOAD-TABLE-6*/
              // MOVE IP00054-RELOAD-DT-TM TO 800-LAST-KEY-DT-TM-T6
              work.setLastKeyDtTmT6800(ip00054TableEntry.getIp00054ReloadDtTm());
//  SET 88-100-T6-WAS-LOADED TO TRUE
              work.setT6WasLoaded88100True(); 
              
//  PERFORM 8400-DISPLAY-COUNT
              displayCount();/*8400-DISPLAY-COUNT*/
          }
  
      
      }
      /**
      * loadTable6 
      *   This method is derived from 
  *   COBOL Paragraph - 2110-LOAD-TABLE-6 COBOL Cyclomatic complexity - 2
      * Input  :  

      * - table6Id300                    COBOL Name: 300-TABLE-6-ID
      * - ip00054ReloadDtTm              COBOL Name: IP00054-RELOAD-DT-TM
      * - ip50005OneDayReadStatus        COBOL Name: IP50005-ONE-DAY-READ-STATUS
      * - rowCount800                    COBOL Name: 800-ROW-COUNT
      *
      * Output :  

      * - tableMaxLength800              COBOL Name: 800-TABLE-MAX-LENGTH
      * - rowLength800                   COBOL Name: 800-ROW-LENGTH
      * - ip50005ReadTableId             COBOL Name: IP50005-READ-TABLE-ID
      * - table6Id300                    COBOL Name: 300-TABLE-6-ID
      * - ip50005EffDate                 COBOL Name: IP50005-EFF-DATE
      * - ip00054ReloadDtTm              COBOL Name: IP00054-RELOAD-DT-TM
      * - startPoint400                  COBOL Name: 400-START-POINT
      * - maxT6RowNo800                  COBOL Name: 800-MAX-T6-ROW-NO
      * - rowCount800                    COBOL Name: 800-ROW-COUNT
      *
      * @throws CFException
      */
      private void loadTable6() throws Exception {
			// Declare local variables used in the method
			Ip50005TableKey ip50005TableKey = ip50005OneDayRec.getIp50005TableKeyAll().getIp50005TableKey();
			// End of variable declaration


// *-----------------------------------------------------------------
// * Get all records from the optimized parameter file for table 6.
// * move the data into table 6.
// *-----------------------------------------------------------------
//  MOVE LENGTH OF IP000604-DE-ATTR-TABLE TO 800-TABLE-MAX-LENGTH
          work.setTableMaxLength800(Ip000604DeAttrTable.getIp000604DeAttrTableFieldLength());
//  MOVE LENGTH OF IP000604-DE-ATTR-ROW TO 800-ROW-LENGTH
          work.setRowLength800(Ip000604DeAttrRow.getIp000604DeAttrRowFieldLength());
//  MOVE 300-TABLE-6-ID TO IP50005-READ-TABLE-ID
          ip50005TableKey.setIp50005ReadTableId(work.getTable6Id300());
  
          // MOVE IP00054-RELOAD-DT-TM TO IP50005-EFF-DATE
          ip50005OneDayRec.getIp50005TableKeyAll().getIp50005TableKey().setIp50005EffDate(padLeftZeros(10,ip00054TableEntry.getIp00054ReloadDtTm(),false));
  
//  MOVE 1 TO 400-START-POINT
          work.setStartPoint400(1);
//  PERFORM WITH TEST AFTER UNTIL 88-IP50005-TBL-LAST-REC-Y
          while (true) { 
//  PERFORM 8100-GET-FROM-ONE-DAY-FILE
              getFromOneDayFile();/*8100-GET-FROM-ONE-DAY-FILE*/
//  PERFORM 2111-MOVE-TO-TABLE-6
              moveToTable6();/*2111-MOVE-TO-TABLE-6*/
          if (( ip50005OneDayReadStatusGroup.isIp50005TblLastRecY88()  )) break;
          }
//  PERFORM 8300-CHECK-FOR-COMPLETE-ROWS
          checkForCompleteRows();/*8300-CHECK-FOR-COMPLETE-ROWS*/
          // MOVE 800-ROW-COUNT TO 800-MAX-T6-ROW-NO
          work.setMaxT6RowNo800(work.getRowCount800());
      
      }
      /**
      * moveToTable6 
      *   This method is derived from 
  *   COBOL Paragraph - 2111-MOVE-TO-TABLE-6 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - ip50005TableData               COBOL Name: IP50005-TABLE-DATA
      * - startPoint400                  COBOL Name: 400-START-POINT
      * - ip50005TableDataLength         COBOL Name: IP50005-TABLE-DATA-LENGTH
      *
      * Output :  

      * - ip000604DeAttrTable            COBOL Name: IP000604-DE-ATTR-TABLE
      * - ip50005TableData               COBOL Name: IP50005-TABLE-DATA
      * - startPoint400                  COBOL Name: 400-START-POINT
      *
      * @throws CFException
      */
      private void moveToTable6() throws Exception {

// *-----------------------------------------------------------------
// *  Check to see if the new data will fit into the table.  if so
// *  move it into the next available positions of table 6.
// *-----------------------------------------------------------------
//  PERFORM 8200-CHECK-TABLE-LIMIT
          checkTableLimit();/*8200-CHECK-TABLE-LIMIT*/
//  MOVE IP50005-TABLE-DATA TO IP000604-DE-ATTR-TABLE ( 400-START-POINT : IP50005-TABLE-DATA-LENGTH )
          ip000604DeAttrTable.replace(ip50005OneDayRec/*parent*/,22/*fromOffset - (ip000604DeAttrTable) */,32730/*fromLen*/,0+work.getStartPoint400() - 1/*toOffset - (ip50005TableData) */,(int) ip50005OneDayRecLthGroup.getIp50005TableDataLength()/*toLen*/);
//  ADD IP50005-TABLE-DATA-LENGTH TO 400-START-POINT
          work.setStartPoint400(work.getStartPoint400()+(int) ip50005OneDayRecLthGroup.getIp50005TableDataLength());
      
      }
      /**
      * loadTable6a 
      *   This method is derived from 
  *   COBOL Paragraph - 2200-LOAD-TABLE-6A COBOL Cyclomatic complexity - 3
      * Input  :  

      * - table6aId300                   COBOL Name: 300-TABLE-6A-ID
      * - ip00054ReloadDtTm              COBOL Name: IP00054-RELOAD-DT-TM
      * - ip50005OneDayReadStatus        COBOL Name: IP50005-ONE-DAY-READ-STATUS
      * - rowCount800                    COBOL Name: 800-ROW-COUNT
      * - ip00060aDeAttrTable            COBOL Name: IP00060A-DE-ATTR-TABLE
      *
      * Output :  

      * - tableMaxLength800              COBOL Name: 800-TABLE-MAX-LENGTH
      * - rowLength800                   COBOL Name: 800-ROW-LENGTH
      * - ip50005ReadTableId             COBOL Name: IP50005-READ-TABLE-ID
      * - table6aId300                   COBOL Name: 300-TABLE-6A-ID
      * - ip50005EffDate                 COBOL Name: IP50005-EFF-DATE
      * - ip00054ReloadDtTm              COBOL Name: IP00054-RELOAD-DT-TM
      * - startPoint400                  COBOL Name: 400-START-POINT
      * - maxT6aRowNo800                 COBOL Name: 800-MAX-T6A-ROW-NO
      * - rowCount800                    COBOL Name: 800-ROW-COUNT
      * - ip00060aDeName                 COBOL Name: IP00060A-DE-NAME
      * - lastKeyDtTmT6a800              COBOL Name: 800-LAST-KEY-DT-TM-T6A
      *
      * @throws CFException
      */
      private void loadTable6a() throws Exception {
			// Declare local variables used in the method
			Ip50005TableKey ip50005TableKey = ip50005OneDayRec.getIp50005TableKeyAll().getIp50005TableKey();
			int startPoint400 = 0;
			// End of variable declaration


// *-----------------------------------------------------------------
// * Get all records from the optimized parameter file for table 6a.
// * move the data into table 6a.
// *-----------------------------------------------------------------
//  MOVE LENGTH OF IP00060A-DE-ATTR-TABLE TO 800-TABLE-MAX-LENGTH
          work.setTableMaxLength800(Ip00060aDeAttrTable.getIp00060aDeAttrTableFieldLength());
//  MOVE LENGTH OF IP00060A-DE-ATTR-ROW TO 800-ROW-LENGTH
          work.setRowLength800(Ip00060aDeAttrRow.getIp00060aDeAttrRowFieldLength());
//  MOVE 300-TABLE-6A-ID TO IP50005-READ-TABLE-ID
          ip50005TableKey.setIp50005ReadTableId(work.getTable6aId300());
  
          // MOVE IP00054-RELOAD-DT-TM TO IP50005-EFF-DATE
          ip50005OneDayRec.getIp50005TableKeyAll().getIp50005TableKey().setIp50005EffDate(padLeftZeros(10,ip00054TableEntry.getIp00054ReloadDtTm(),false));
  
//  MOVE 1 TO 400-START-POINT
          work.setStartPoint400(1);
//  PERFORM WITH TEST AFTER UNTIL 88-IP50005-TBL-LAST-REC-Y
          while (true) { 
//  PERFORM 8100-GET-FROM-ONE-DAY-FILE
              getFromOneDayFile();/*8100-GET-FROM-ONE-DAY-FILE*/
//  PERFORM 2211-MOVE-TO-TABLE-6A
              moveToTable6a();/*2211-MOVE-TO-TABLE-6A*/
          if (( ip50005OneDayReadStatusGroup.isIp50005TblLastRecY88()  )) break;
          }
//  PERFORM 8300-CHECK-FOR-COMPLETE-ROWS
          checkForCompleteRows();/*8300-CHECK-FOR-COMPLETE-ROWS*/

// *    Check to see if the new data will fit into the table. if so
// *    move it into the next available positions of table 6a.
          // MOVE 800-ROW-COUNT TO 800-MAX-T6A-ROW-NO
          work.setMaxT6aRowNo800(work.getRowCount800());

// *    Mark the row after the last one loaded as "undefined"
          startPoint400 = work.getStartPoint400();
//  IF 400-START-POINT < LENGTH OF IP00060A-DE-ATTR-TABLE
          if (	( startPoint400 < Ip00060aDeAttrTable.getIp00060aDeAttrTableFieldLength() )) { 
//  SET IP00060A-UNDEFINED-DE ( 800-ROW-COUNT + 1) TO TRUE
              ip00060aDeAttrTable.getIp00060aDeAttrRow(work.getRowCount800() + 1 - 1).setIp00060aUndefinedDeTrue(); 
              
          }
  
          // MOVE IP00054-RELOAD-DT-TM TO 800-LAST-KEY-DT-TM-T6A
          work.setLastKeyDtTmT6a800(ip00054TableEntry.getIp00054ReloadDtTm());
//  PERFORM 8400-DISPLAY-COUNT
          displayCount();/*8400-DISPLAY-COUNT*/
          ;
      
      }
      /**
      * moveToTable6a 
      *   This method is derived from 
  *   COBOL Paragraph - 2211-MOVE-TO-TABLE-6A COBOL Cyclomatic complexity - 1
      * Input  :  

      * - ip50005TableData               COBOL Name: IP50005-TABLE-DATA
      * - startPoint400                  COBOL Name: 400-START-POINT
      * - ip50005TableDataLength         COBOL Name: IP50005-TABLE-DATA-LENGTH
      *
      * Output :  

      * - ip00060aDeAttrTable            COBOL Name: IP00060A-DE-ATTR-TABLE
      * - ip50005TableData               COBOL Name: IP50005-TABLE-DATA
      * - startPoint400                  COBOL Name: 400-START-POINT
      *
      * @throws CFException
      */
      private void moveToTable6a() throws Exception {

// *-----------------------------------------------------------------
// *  Check to see if the new data will fit into the table.  if so
// *  move it into the next available positions of table 6a.
// *-----------------------------------------------------------------
//  PERFORM 8200-CHECK-TABLE-LIMIT
          checkTableLimit();/*8200-CHECK-TABLE-LIMIT*/
//  MOVE IP50005-TABLE-DATA TO IP00060A-DE-ATTR-TABLE ( 400-START-POINT : IP50005-TABLE-DATA-LENGTH )
          ip00060aDeAttrTable.replace(ip50005OneDayRec/*parent*/,22/*fromOffset - (ip00060aDeAttrTable) */,32730/*fromLen*/,0+work.getStartPoint400() - 1/*toOffset - (ip50005TableData) */,(int) ip50005OneDayRecLthGroup.getIp50005TableDataLength()/*toLen*/);
//  ADD IP50005-TABLE-DATA-LENGTH TO 400-START-POINT
          work.setStartPoint400(work.getStartPoint400()+(int) ip50005OneDayRecLthGroup.getIp50005TableDataLength());
      
      }
      /**
      * loadTable7IfNeeded 
      *   This method is derived from 
  *   COBOL Paragraph - 2300-LOAD-TABLE-7-IF-NEEDED COBOL Cyclomatic complexity - 2
      * Input  :  

      * - table7Id300                    COBOL Name: 300-TABLE-7-ID
      * - ip000608ProcessingDateTime     COBOL Name: IP000608-PROCESSING-DATE-TIME
      * - lastKeyDtTmT7800               COBOL Name: 800-LAST-KEY-DT-TM-T7
      *
      * Output :  

      * - ip00054KeyTableId              COBOL Name: IP00054-KEY-TABLE-ID
      * - table7Id300                    COBOL Name: 300-TABLE-7-ID
      * - ip00054ReloadDtTm              COBOL Name: IP00054-RELOAD-DT-TM
      * - ip000608ProcessingDateTime     COBOL Name: IP000608-PROCESSING-DATE-TIME
      * - lastKeyDtTmT7800               COBOL Name: 800-LAST-KEY-DT-TM-T7
      * - wasT7Loaded100                 COBOL Name: 100-WAS-T7-LOADED
      *
      * @throws CFException
      */
      private void loadTable7IfNeeded() throws Exception {
			// Declare local variables used in the method
			Ip00054Table5Key1 ip00054Table5Key1 = ip00054TableEntry.getIp00054Table5Key1();
			char[] ip00054ReloadDtTm = null;
			char[] lastKeyDtTmT7800 = null;
			// End of variable declaration


// *-----------------------------------------------------------------
// * Pass current clearing-date-and-time to ip299010 to find the
// * table-7 date which should be loaded now.  load if needed.
// *-----------------------------------------------------------------
//  MOVE 300-TABLE-7-ID TO IP00054-KEY-TABLE-ID
          ip00054Table5Key1.setIp00054KeyTableId(work.getTable7Id300());
  
//  MOVE IP000608-PROCESSING-DATE-TIME TO IP00054-RELOAD-DT-TM
          ip00054TableEntry.setIp00054ReloadDtTm(ip000608ProcessingDateTimeGroup.getIp000608ProcessingDateTime());
//  PERFORM 8000-GET-TABLE-KEY-DT-TM
          getTableKeyDtTm();/*8000-GET-TABLE-KEY-DT-TM*/

// *    Check the date and time key of loaded table
// *    vs the table to be loaded.

// *        The loaded version of table 7 is still current
//  IF IP00054-RELOAD-DT-TM EQUAL 800-LAST-KEY-DT-TM-T7
          lastKeyDtTmT7800 = work.getLastKeyDtTmT7800();
          ip00054ReloadDtTm = ip00054TableEntry.getIp00054ReloadDtTm();
//  ELSE
          if (		compareChars(ip00054ReloadDtTm,lastKeyDtTmT7800) != 0 ) { 
//  PERFORM 2310-LOAD-TABLE-7
              loadTable7();/*2310-LOAD-TABLE-7*/
              // MOVE IP00054-RELOAD-DT-TM TO 800-LAST-KEY-DT-TM-T7
              work.setLastKeyDtTmT7800(ip00054TableEntry.getIp00054ReloadDtTm());
//  SET 88-100-T7-WAS-LOADED TO TRUE
              work.setT7WasLoaded88100True(); 
              
//  PERFORM 8400-DISPLAY-COUNT
              displayCount();/*8400-DISPLAY-COUNT*/
          }
  
      
      }
      /**
      * loadTable7 
      *   This method is derived from 
  *   COBOL Paragraph - 2310-LOAD-TABLE-7 COBOL Cyclomatic complexity - 3
      * Input  :  

      * - table7Id300                    COBOL Name: 300-TABLE-7-ID
      * - ip00054ReloadDtTm              COBOL Name: IP00054-RELOAD-DT-TM
      * - ip50005OneDayReadStatus        COBOL Name: IP50005-ONE-DAY-READ-STATUS
      * - rowCount800                    COBOL Name: 800-ROW-COUNT
      * - ip000704DeSubMax               COBOL Name: IP000704-DE-SUB-MAX
      *
      * Output :  

      * - tableMaxLength800              COBOL Name: 800-TABLE-MAX-LENGTH
      * - rowLength800                   COBOL Name: 800-ROW-LENGTH
      * - ip50005ReadTableId             COBOL Name: IP50005-READ-TABLE-ID
      * - table7Id300                    COBOL Name: 300-TABLE-7-ID
      * - ip50005EffDate                 COBOL Name: IP50005-EFF-DATE
      * - ip00054ReloadDtTm              COBOL Name: IP00054-RELOAD-DT-TM
      * - startPoint400                  COBOL Name: 400-START-POINT
      * - maxT7RowNo800                  COBOL Name: 800-MAX-T7-ROW-NO
      * - rowCount800                    COBOL Name: 800-ROW-COUNT
      * - ip000704DeSubName              COBOL Name: IP000704-DE-SUB-NAME
      *
      * @throws CFException
      */
      private void loadTable7() throws Exception {
			// Declare local variables used in the method
			Ip50005TableKey ip50005TableKey = ip50005OneDayRec.getIp50005TableKeyAll().getIp50005TableKey();
			int rowCount800 = 0;
			short ip000704DeSubMax = 0;
			// End of variable declaration


// *-----------------------------------------------------------------
// * Get all records from the optimized parameter file for table 7.
// * move the data into table 7.
// *-----------------------------------------------------------------
//  MOVE LENGTH OF IP000704-DE-SUB-ATTR-TABLE TO 800-TABLE-MAX-LENGTH
          work.setTableMaxLength800(Ip000704DeSubAttrTable.getIp000704DeSubAttrTableFieldLength());
//  MOVE LENGTH OF IP000704-DE-SUB-ATTR-ROW TO 800-ROW-LENGTH
          work.setRowLength800(Ip000704DeSubAttrRow.getIp000704DeSubAttrRowFieldLength());
//  MOVE 300-TABLE-7-ID TO IP50005-READ-TABLE-ID
          ip50005TableKey.setIp50005ReadTableId(work.getTable7Id300());
  
          // MOVE IP00054-RELOAD-DT-TM TO IP50005-EFF-DATE
          ip50005OneDayRec.getIp50005TableKeyAll().getIp50005TableKey().setIp50005EffDate(padLeftZeros(10,ip00054TableEntry.getIp00054ReloadDtTm(),false));
  
//  MOVE 1 TO 400-START-POINT
          work.setStartPoint400(1);
//  PERFORM WITH TEST AFTER UNTIL 88-IP50005-TBL-LAST-REC-Y
          while (true) { 
//  PERFORM 8100-GET-FROM-ONE-DAY-FILE
              getFromOneDayFile();/*8100-GET-FROM-ONE-DAY-FILE*/
//  PERFORM 2311-MOVE-TO-TABLE-7
              moveToTable7();/*2311-MOVE-TO-TABLE-7*/
          if (( ip50005OneDayReadStatusGroup.isIp50005TblLastRecY88()  )) break;
          }
//  PERFORM 8300-CHECK-FOR-COMPLETE-ROWS
          checkForCompleteRows();/*8300-CHECK-FOR-COMPLETE-ROWS*/
          // MOVE 800-ROW-COUNT TO 800-MAX-T7-ROW-NO
          work.setMaxT7RowNo800(work.getRowCount800());

// *    Mark the row after the last one loaded as "undefined"
          ip000704DeSubMax = work.getIp000704DeSubMax();
          rowCount800 = work.getRowCount800();
//  IF 800-ROW-COUNT < IP000704-DE-SUB-MAX
          if (	( rowCount800 < ip000704DeSubMax ) ) { 
//  SET IP000704-UNDEFINED-DE-SUBFLD ( 800-ROW-COUNT + 1) TO TRUE
              ip000704DeSubAttrTable.getIp000704DeSubAttrRow(work.getRowCount800() + 1 - 1).setIp000704UndefinedDeSubfldTrue(); 
              
          }
  
      
      }
      /**
      * moveToTable7 
      *   This method is derived from 
  *   COBOL Paragraph - 2311-MOVE-TO-TABLE-7 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - ip50005TableData               COBOL Name: IP50005-TABLE-DATA
      * - startPoint400                  COBOL Name: 400-START-POINT
      * - ip50005TableDataLength         COBOL Name: IP50005-TABLE-DATA-LENGTH
      *
      * Output :  

      * - ip000704DeSubAttrTable         COBOL Name: IP000704-DE-SUB-ATTR-TABLE
      * - ip50005TableData               COBOL Name: IP50005-TABLE-DATA
      * - startPoint400                  COBOL Name: 400-START-POINT
      *
      * @throws CFException
      */
      private void moveToTable7() throws Exception {

// *-----------------------------------------------------------------
// *  Check to see if the new data will fit into the table.  if so
// *  move it into the next available positions of table 7.
// *-----------------------------------------------------------------
//  PERFORM 8200-CHECK-TABLE-LIMIT
          checkTableLimit();/*8200-CHECK-TABLE-LIMIT*/
//  MOVE IP50005-TABLE-DATA TO IP000704-DE-SUB-ATTR-TABLE ( 400-START-POINT : IP50005-TABLE-DATA-LENGTH )
          ip000704DeSubAttrTable.replace(ip50005OneDayRec/*parent*/,22/*fromOffset - (ip000704DeSubAttrTable) */,32730/*fromLen*/,0+work.getStartPoint400() - 1/*toOffset - (ip50005TableData) */,(int) ip50005OneDayRecLthGroup.getIp50005TableDataLength()/*toLen*/);
//  ADD IP50005-TABLE-DATA-LENGTH TO 400-START-POINT
          work.setStartPoint400(work.getStartPoint400()+(int) ip50005OneDayRecLthGroup.getIp50005TableDataLength());
      
      }
      /**
      * resolveFirstSubfldPtrs 
      *   This method is derived from 
  *   COBOL Paragraph - 2400-RESOLVE-FIRST-SUBFLD-PTRS COBOL Cyclomatic complexity - 6
      * Input  :  

      * - ip000604I                      COBOL Name: IP000604-I
      * - ip000704I                      COBOL Name: IP000704-I
      * - maxT7RowNo800                  COBOL Name: 800-MAX-T7-ROW-NO
      * - ip000704DeNo                   COBOL Name: IP000704-DE-NO
      *
      * Output :  

      * - currentDeNo800                 COBOL Name: 800-CURRENT-DE-NO
      * - ip000604I                      COBOL Name: IP000604-I
      * - ip000604DeFirstSubfldRedefined COBOL Name: IP000604-DE-FIRST-SUBFLD-REDEFINED
      * - ip000604DeFirstAbRedefined     COBOL Name: IP000604-DE-FIRST-AB-REDEFINED
      * - ip000704I                      COBOL Name: IP000704-I
      * - ip000704DeNo                   COBOL Name: IP000704-DE-NO
      * - ip000604DeFirstSubfld          COBOL Name: IP000604-DE-FIRST-SUBFLD
      *
      * @throws CFException
      */
      private void resolveFirstSubfldPtrs() throws Exception {
			// Declare local variables used in the method
			int currentDeNo800 = 0;
			// End of variable declaration


// *-----------------------------------------------------------------
// * Scan table 7.  for each de whose subfields are defined there
// * post the index value of its first table-5 entry in the
// * first-subfld field of that de's entry in table 6.
// *-----------------------------------------------------------------
//  MOVE ZEROES TO 800-CURRENT-DE-NO
          work.setCurrentDeNo800(0);
//  PERFORM VARYING IP000604-I FROM 1 BY 1 UNTIL IP000604-I > 128
          for (ip000604I = 1; (	( ip000604I <= 128 )) ; ip000604I = ip000604I + 1 ) {
//  SET 88-IP000604-NO-DE-SUBFLDS ( IP000604-I ) TO TRUE
              ip000604DeAttrTable.getIp000604DeAttrRow(ip000604I - 1).setIp000604NoDeSubflds88True(); 
              
//  SET 88-IP000604-NO-AB-VALUES ( IP000604-I ) TO TRUE
              ip000604DeAttrTable.getIp000604DeAttrRow(ip000604I - 1).setIp000604NoAbValues88True(); 
              
          }
//  PERFORM VARYING IP000704-I FROM 1 BY 1 UNTIL IP000704-I > 800-MAX-T7-ROW-NO
          for (ip000704I = 1; (	( ip000704I <= work.getMaxT7RowNo800() )) ; ip000704I = ip000704I + 1 ) {
              currentDeNo800 = work.getCurrentDeNo800();
//  IF IP000704-DE-NO ( IP000704-I ) > 800-CURRENT-DE-NO
              if (	( ip000704DeSubAttrTable.getIp000704DeSubAttrRow(ip000704I - 1).getIp000704DeNo() > currentDeNo800 ) ) { 
//  MOVE IP000704-DE-NO ( IP000704-I ) TO 800-CURRENT-DE-NO
                  work.setCurrentDeNo800(ip000704DeSubAttrTable.getIp000704DeSubAttrRow(ip000704I - 1).getIp000704DeNo());
//  SET IP000604-DE-FIRST-SUBFLD ( 800-CURRENT-DE-NO ) TO IP000704-I
                  ip000604DeAttrTable.getIp000604DeAttrRow(work.getCurrentDeNo800() - 1).setIp000604DeFirstSubfld(IP000704_DE_SUB_ATTR_ROW_LENGTH * ( ((ip000704I < 1) ? 1:ip000704I) - 1)); 
                  
              }
  
          }
      
      }
      /**
      * resolveAccBrandPtrs 
      *   This method is derived from 
  *   COBOL Paragraph - 2500-RESOLVE-ACC-BRAND-PTRS COBOL Cyclomatic complexity - 4
      * Input  :  

      * - ip00060aI                      COBOL Name: IP00060A-I
      * - maxT6aRowNo800                 COBOL Name: 800-MAX-T6A-ROW-NO
      * - ip00060aDeNo                   COBOL Name: IP00060A-DE-NO
      *
      * Output :  

      * - currentDeNo800                 COBOL Name: 800-CURRENT-DE-NO
      * - ip00060aI                      COBOL Name: IP00060A-I
      * - ip00060aDeNo                   COBOL Name: IP00060A-DE-NO
      * - ip000604DeFirstAb              COBOL Name: IP000604-DE-FIRST-AB
      *
      * @throws CFException
      */
      private void resolveAccBrandPtrs() throws Exception {
			// Declare local variables used in the method
			int currentDeNo800 = 0;
			// End of variable declaration


// *-----------------------------------------------------------------
// * Scan table 6a.  for each de whose acceptance brand values are
// * defined there post the index value of its first table-6a entry
// * in the a/b pointer field of that de's entry in table 6.
// *-----------------------------------------------------------------
//  MOVE ZERO TO 800-CURRENT-DE-NO
          work.setCurrentDeNo800(0);
//  PERFORM VARYING IP00060A-I FROM 1 BY 1 UNTIL IP00060A-I > 800-MAX-T6A-ROW-NO
          for (ip00060aI = 1; (	( ip00060aI <= work.getMaxT6aRowNo800() )) ; ip00060aI = ip00060aI + 1 ) {
              currentDeNo800 = work.getCurrentDeNo800();
//  IF IP00060A-DE-NO ( IP00060A-I ) > 800-CURRENT-DE-NO
              if (	( ip00060aDeAttrTable.getIp00060aDeAttrRow(ip00060aI - 1).getIp00060aDeNo() > currentDeNo800 )) { 
//  MOVE IP00060A-DE-NO ( IP00060A-I ) TO 800-CURRENT-DE-NO
                  work.setCurrentDeNo800(ip00060aDeAttrTable.getIp00060aDeAttrRow(ip00060aI - 1).getIp00060aDeNo());
//  SET IP000604-DE-FIRST-AB ( 800-CURRENT-DE-NO ) TO IP00060A-I
                  ip000604DeAttrTable.getIp000604DeAttrRow(work.getCurrentDeNo800() - 1).setIp000604DeFirstAb(IP00060A_DE_ATTR_ROW_LENGTH * ( ((ip00060aI < 1) ? 1:ip00060aI) - 1)); 
                  
              }
  
//  ELSE
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
      * - ip50005ReadTableId             COBOL Name: IP50005-READ-TABLE-ID
      * - recNotFoundMsg610              COBOL Name: 610-REC-NOT-FOUND-MSG
      * - para8100300                    COBOL Name: 300-PARA-8100
      * - recAbsentAbendCode300          COBOL Name: 300-REC-ABSENT-ABEND-CODE
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      * - tableId610                     COBOL Name: 610-TABLE-ID
      * - ip50005ReadTableId             COBOL Name: IP50005-READ-TABLE-ID
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
			// Declare local variables used in the method
			Ip50005TableKey ip50005TableKey = ip50005OneDayRec.getIp50005TableKeyAll().getIp50005TableKey();
			// End of variable declaration


// *-----------------------------------------------------------------
// * Call routine to read record from optimized parameter file.
// *-----------------------------------------------------------------
//  CALL 800-PTR-IP650010
          // CALL 800-PTR-IP650010
          	this.setRc( ip650010.process());
//  IF 88-IP50005-ONE-DAY-IO-GOOD
//  ELSE
          if (!(ip50005OneDayReadStatusGroup.isIp50005OneDayIoGood88()) ) { 
//  MOVE IP50005-READ-TABLE-ID TO 610-TABLE-ID
              recNotFoundMsg610.setTableId610(ip50005TableKey.getIp50005ReadTableId());
  
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
//  DISPLAY 'A B E N D   I P 7 3 9 0 1 0        '
          logger.info("A B E N D   I P 7 3 9 0 1 0        "); 
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
