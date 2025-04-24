  package com.cloudframe.app.process.impl;
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
  
  import com.cloudframe.app.ip739010.Ip739010Ctx.*;
  import com.cloudframe.app.ip739010.Ip739010Ctx;
  import com.cloudframe.app.process.Ip739010;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.utility.CFUtil;
  import org.springframework.beans.factory.annotation.Value;
  import com.cloudframe.app.global.sharedvar.Ip000604DeAttrTable;
  import com.cloudframe.app.global.sharedvar.Ip000604DeAttrRow;
  import com.cloudframe.app.global.sharedvar.Ip00060aDeAttrTable;
  import com.cloudframe.app.global.sharedvar.Ip00060aDeAttrRow;
  import com.cloudframe.app.global.sharedvar.Ip000704DeSubAttrTable;
  import com.cloudframe.app.global.sharedvar.Ip000704DeSubAttrRow;
  import com.cloudframe.app.process.Ip299010;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.process.*;
  import com.cloudframe.app.process.Ip650010;
  import com.cloudframe.app.ip739010.dto.*;
  import com.cloudframe.app.ip739010.dto.RecNotFoundMsg610;
  import com.cloudframe.app.ip739010.dto.AbendParaName900;
  import com.cloudframe.app.ip739010.dto.TableOverflowError600;
  import com.cloudframe.app.ip739010.dto.TableIntegrityError640;
  import com.cloudframe.app.ip739010.dto.RowsLoadedMessage630;
  import com.cloudframe.app.ip739010.dto.AbendMessage900;
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
  
  public class Ip739010Impl extends CommonProcess implements Ip739010 {
  
  Logger logger = LoggerFactory.getLogger(Ip739010Impl.class);
  
  
  @Value("${timeZoneId:Etc/GMT}")
  private String timeZoneId;
  
  
  
  
  private static final int IP000704_DE_SUB_ATTR_ROW_LENGTH = 70;
  private static final int IP00060A_DE_ATTR_ROW_LENGTH = 80;
  
  
  
  
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      public int process(Ip739010Ctx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
          ;
//  PERFORM 0000-MAINLINE
          mainline(programCtx.getMainlineInCtx());/*0000-MAINLINE*/
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
      @Override
      public MainlineOutCtx mainline(MainlineInCtx methodIn) throws Exception {
Ip739010Ctx programCtx = methodIn.getIp739010Ctx();
MainlineOutCtx methodOut = methodIn.getMainlineOutCtx();
//  PERFORM 1000-INITIALIZATION
          initialization(programCtx.getInitializationInCtx());/*1000-INITIALIZATION*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }

// *    Check to see if clearing cycle time has changed since
// *    we last checked the currency of the tables.
//  IF IP000608-PROCESSING-DATE-TIME EQUAL TO 800-CLEARING-DT-TM
//  ELSE
          if (		compareChars(methodOut.getIp000608ProcessingDateTime(),methodOut.getClearingDtTm800()) != 0 ) { 

// *        We must check to see if tables are still current
              // MOVE IP000608-PROCESSING-DATE-TIME TO 800-CLEARING-DT-TM
              methodOut.setClearingDtTm800(methodOut.getIp000608ProcessingDateTime());
//  PERFORM 2000-LOAD-TABLES-IF-NEEDED
              loadTablesIfNeeded(programCtx.getLoadTablesIfNeededInCtx());/*2000-LOAD-TABLES-IF-NEEDED*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return methodOut;
      
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
      @Override
      public InitializationOutCtx initialization(InitializationInCtx methodIn) throws Exception {
Ip739010Ctx programCtx = methodIn.getIp739010Ctx();
InitializationOutCtx methodOut = methodIn.getInitializationOutCtx();

// *-----------------------------------------------------------------
// * Update the event log.  display standard messages on first call.
// *-----------------------------------------------------------------
//  IF 88-100-IT-IS-FIRST-TIME
          if ( methodIn.isItIsFirstTime88100()  ) { 
//  SET 800-PTR-IP650010 TO ENTRY 300-PGM-IP650010
              methodOut.setPtrIp650010800(methodIn.getPgmIp650010300()); 
              
//  SET 800-PTR-IP299010 TO ENTRY 300-PGM-IP299010
              methodOut.setPtrIp299010800(methodIn.getPgmIp299010300()); 
              
//  SET 88-100-IT-IS-NOT-FIRST-TIME TO TRUE
              methodOut.setItIsNotFirstTime88100True(); 
              
//  MOVE FUNCTION CURRENT-DATE TO 800-CURRENT-DATE-TIME
              methodOut.setCurrentDateTime800( substring(CFUtil.getCurrentDate(timeZoneId),0,10));
          }
//  SET 88-100-T6-NOT-LOADED TO TRUE
          methodOut.setT6NotLoaded88100True(); 
          
//  SET 88-100-T7-NOT-LOADED TO TRUE
          methodOut.setT7NotLoaded88100True(); 
          

// *    Ensure that the processing date has been set.  if not,
// *    use the current date.
//  IF IP000608-PROCESSING-DATE-TIME = LOW-VALUES
          if (			( checkLowValue(methodOut.getIp000608ProcessingDateTime()) ) ) { 
//  MOVE 800-CURRENT-DATE-TIME TO IP000608-PROCESSING-DATE-TIME
              methodOut.setIp000608ProcessingDateTime(methodOut.getCurrentDateTime800());
          }
      
      return methodOut;
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
      @Override
      public void loadTablesIfNeeded(LoadTablesIfNeededInCtx methodIn) throws Exception {
Ip739010Ctx programCtx = methodIn.getIp739010Ctx();

// *-----------------------------------------------------------------
// * Check dates on current tables against dates which should
// * now be in effect.  load tables if needed. resolve first-subfield
// * pointers if needed.
// *-----------------------------------------------------------------
//  PERFORM 2100-LOAD-TABLE-6-IF-NEEDED
          loadTable6IfNeeded(programCtx.getLoadTable6IfNeededInCtx());/*2100-LOAD-TABLE-6-IF-NEEDED*/
//  IF 88-100-T6-WAS-LOADED
          if ( methodIn.isT6WasLoaded88100()  ) { 
//  PERFORM 2200-LOAD-TABLE-6A
              loadTable6a(programCtx.getLoadTable6aInCtx());/*2200-LOAD-TABLE-6A*/
          }
//  PERFORM 2300-LOAD-TABLE-7-IF-NEEDED
          loadTable7IfNeeded(programCtx.getLoadTable7IfNeededInCtx());/*2300-LOAD-TABLE-7-IF-NEEDED*/
//  IF 88-100-T6-WAS-LOADED OR 88-100-T7-WAS-LOADED
          if ( methodIn.isT6WasLoaded88100()   ||  methodIn.isT7WasLoaded88100()  ) { 
//  PERFORM 2400-RESOLVE-FIRST-SUBFLD-PTRS
              resolveFirstSubfldPtrs(programCtx.getResolveFirstSubfldPtrsInCtx());/*2400-RESOLVE-FIRST-SUBFLD-PTRS*/
          }
//  IF 88-100-T6-WAS-LOADED
          if ( methodIn.isT6WasLoaded88100()  ) { 
//  PERFORM 2500-RESOLVE-ACC-BRAND-PTRS
              resolveAccBrandPtrs(programCtx.getResolveAccBrandPtrsInCtx());/*2500-RESOLVE-ACC-BRAND-PTRS*/
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
      @Override
      public LoadTable6IfNeededOutCtx loadTable6IfNeeded(LoadTable6IfNeededInCtx methodIn) throws Exception {
Ip739010Ctx programCtx = methodIn.getIp739010Ctx();
LoadTable6IfNeededOutCtx methodOut = methodIn.getLoadTable6IfNeededOutCtx();

// *-----------------------------------------------------------------
// * Pass current clearing-date-and-time to ip299010 to find the
// * table-6 date which should be in effect now.  load if needed.
// *-----------------------------------------------------------------
//  MOVE 300-TABLE-6-ID TO IP00054-KEY-TABLE-ID
          methodOut.setIp00054KeyTableId(methodOut.getTable6Id300());
//  MOVE IP000608-PROCESSING-DATE-TIME TO IP00054-RELOAD-DT-TM
          methodOut.setIp00054ReloadDtTm(methodOut.getIp000608ProcessingDateTime());
//  PERFORM 8000-GET-TABLE-KEY-DT-TM
          getTableKeyDtTm(programCtx.getGetTableKeyDtTmInCtx());/*8000-GET-TABLE-KEY-DT-TM*/

// *    Check the date and time key of loaded table
// *    vs the table to be loaded.

// *        The loaded version of table 6 is still current
//  IF IP00054-RELOAD-DT-TM EQUAL 800-LAST-KEY-DT-TM-T6
//  ELSE
          if (		compareChars(methodOut.getIp00054ReloadDtTm(),methodOut.getLastKeyDtTmT6800()) != 0 ) { 
//  PERFORM 2110-LOAD-TABLE-6
              loadTable6(programCtx.getLoadTable6InCtx());/*2110-LOAD-TABLE-6*/
              // MOVE IP00054-RELOAD-DT-TM TO 800-LAST-KEY-DT-TM-T6
              methodOut.setLastKeyDtTmT6800(methodOut.getIp00054ReloadDtTm());
//  SET 88-100-T6-WAS-LOADED TO TRUE
              methodOut.setT6WasLoaded88100True(); 
              
//  PERFORM 8400-DISPLAY-COUNT
              displayCount(programCtx.getDisplayCountInCtx());/*8400-DISPLAY-COUNT*/
          }
      
      return methodOut;
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
      @Override
      public LoadTable6OutCtx loadTable6(LoadTable6InCtx methodIn) throws Exception {
Ip739010Ctx programCtx = methodIn.getIp739010Ctx();
LoadTable6OutCtx methodOut = methodIn.getLoadTable6OutCtx();

// *-----------------------------------------------------------------
// * Get all records from the optimized parameter file for table 6.
// * move the data into table 6.
// *-----------------------------------------------------------------
//  MOVE LENGTH OF IP000604-DE-ATTR-TABLE TO 800-TABLE-MAX-LENGTH
          methodOut.setTableMaxLength800(Ip000604DeAttrTable.getIp000604DeAttrTableFieldLength());
//  MOVE LENGTH OF IP000604-DE-ATTR-ROW TO 800-ROW-LENGTH
          methodOut.setRowLength800(Ip000604DeAttrRow.getIp000604DeAttrRowFieldLength());
//  MOVE 300-TABLE-6-ID TO IP50005-READ-TABLE-ID
          methodOut.setIp50005ReadTableId(methodOut.getTable6Id300());
          // MOVE IP00054-RELOAD-DT-TM TO IP50005-EFF-DATE
          methodOut.setIp50005EffDate(padLeftZeros(10,methodOut.getIp00054ReloadDtTm(),false));
//  MOVE 1 TO 400-START-POINT
          methodOut.setStartPoint400(1);
//  PERFORM WITH TEST AFTER UNTIL 88-IP50005-TBL-LAST-REC-Y
          while (true) { 
//  PERFORM 8100-GET-FROM-ONE-DAY-FILE
              getFromOneDayFile(programCtx.getGetFromOneDayFileInCtx());/*8100-GET-FROM-ONE-DAY-FILE*/
//  PERFORM 2111-MOVE-TO-TABLE-6
              moveToTable6(programCtx.getMoveToTable6InCtx());/*2111-MOVE-TO-TABLE-6*/
          if (( methodIn.isIp50005TblLastRecY88()  )) break;
          }
//  PERFORM 8300-CHECK-FOR-COMPLETE-ROWS
          checkForCompleteRows(programCtx.getCheckForCompleteRowsInCtx());/*8300-CHECK-FOR-COMPLETE-ROWS*/
          // MOVE 800-ROW-COUNT TO 800-MAX-T6-ROW-NO
          methodOut.setMaxT6RowNo800(methodOut.getRowCount800());
      
      return methodOut;
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
      @Override
      public MoveToTable6OutCtx moveToTable6(MoveToTable6InCtx methodIn) throws Exception {
Ip739010Ctx programCtx = methodIn.getIp739010Ctx();
MoveToTable6OutCtx methodOut = methodIn.getMoveToTable6OutCtx();

// *-----------------------------------------------------------------
// *  Check to see if the new data will fit into the table.  if so
// *  move it into the next available positions of table 6.
// *-----------------------------------------------------------------
//  PERFORM 8200-CHECK-TABLE-LIMIT
          checkTableLimit(programCtx.getCheckTableLimitInCtx());/*8200-CHECK-TABLE-LIMIT*/
//  MOVE IP50005-TABLE-DATA TO IP000604-DE-ATTR-TABLE ( 400-START-POINT : IP50005-TABLE-DATA-LENGTH )
          methodOut.getIp000604DeAttrTable().replace(methodIn.getIp50005OneDayRec()/*parent*/,22/*fromOffset - (ip000604DeAttrTable) */,32730/*fromLen*/,0+methodOut.getStartPoint400() - 1/*toOffset - (ip50005TableData) */,(int) methodIn.getIp50005TableDataLength()/*toLen*/);
//  ADD IP50005-TABLE-DATA-LENGTH TO 400-START-POINT
          methodOut.setStartPoint400(methodOut.getStartPoint400()+(int) methodIn.getIp50005TableDataLength());
      
      return methodOut;
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
      @Override
      public LoadTable6aOutCtx loadTable6a(LoadTable6aInCtx methodIn) throws Exception {
Ip739010Ctx programCtx = methodIn.getIp739010Ctx();
LoadTable6aOutCtx methodOut = methodIn.getLoadTable6aOutCtx();

// *-----------------------------------------------------------------
// * Get all records from the optimized parameter file for table 6a.
// * move the data into table 6a.
// *-----------------------------------------------------------------
//  MOVE LENGTH OF IP00060A-DE-ATTR-TABLE TO 800-TABLE-MAX-LENGTH
          methodOut.setTableMaxLength800(Ip00060aDeAttrTable.getIp00060aDeAttrTableFieldLength());
//  MOVE LENGTH OF IP00060A-DE-ATTR-ROW TO 800-ROW-LENGTH
          methodOut.setRowLength800(Ip00060aDeAttrRow.getIp00060aDeAttrRowFieldLength());
//  MOVE 300-TABLE-6A-ID TO IP50005-READ-TABLE-ID
          methodOut.setIp50005ReadTableId(methodOut.getTable6aId300());
          // MOVE IP00054-RELOAD-DT-TM TO IP50005-EFF-DATE
          methodOut.setIp50005EffDate(padLeftZeros(10,methodOut.getIp00054ReloadDtTm(),false));
//  MOVE 1 TO 400-START-POINT
          methodOut.setStartPoint400(1);
//  PERFORM WITH TEST AFTER UNTIL 88-IP50005-TBL-LAST-REC-Y
          while (true) { 
//  PERFORM 8100-GET-FROM-ONE-DAY-FILE
              getFromOneDayFile(programCtx.getGetFromOneDayFileInCtx());/*8100-GET-FROM-ONE-DAY-FILE*/
//  PERFORM 2211-MOVE-TO-TABLE-6A
              moveToTable6a(programCtx.getMoveToTable6aInCtx());/*2211-MOVE-TO-TABLE-6A*/
          if (( methodIn.isIp50005TblLastRecY88()  )) break;
          }
//  PERFORM 8300-CHECK-FOR-COMPLETE-ROWS
          checkForCompleteRows(programCtx.getCheckForCompleteRowsInCtx());/*8300-CHECK-FOR-COMPLETE-ROWS*/

// *    Check to see if the new data will fit into the table. if so
// *    move it into the next available positions of table 6a.
          // MOVE 800-ROW-COUNT TO 800-MAX-T6A-ROW-NO
          methodOut.setMaxT6aRowNo800(methodOut.getRowCount800());

// *    Mark the row after the last one loaded as "undefined"
//  IF 400-START-POINT < LENGTH OF IP00060A-DE-ATTR-TABLE
          if (	( methodOut.getStartPoint400() < Ip00060aDeAttrTable.getIp00060aDeAttrTableFieldLength() )) { 
//  SET IP00060A-UNDEFINED-DE ( 800-ROW-COUNT + 1) TO TRUE
              methodOut.setIp00060aUndefinedDeTrue(methodOut.getRowCount800() + 1 - 1); 
              
          }
          // MOVE IP00054-RELOAD-DT-TM TO 800-LAST-KEY-DT-TM-T6A
          methodOut.setLastKeyDtTmT6a800(methodOut.getIp00054ReloadDtTm());
//  PERFORM 8400-DISPLAY-COUNT
          displayCount(programCtx.getDisplayCountInCtx());/*8400-DISPLAY-COUNT*/
          ;
      
      return methodOut;
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
      @Override
      public MoveToTable6aOutCtx moveToTable6a(MoveToTable6aInCtx methodIn) throws Exception {
Ip739010Ctx programCtx = methodIn.getIp739010Ctx();
MoveToTable6aOutCtx methodOut = methodIn.getMoveToTable6aOutCtx();

// *-----------------------------------------------------------------
// *  Check to see if the new data will fit into the table.  if so
// *  move it into the next available positions of table 6a.
// *-----------------------------------------------------------------
//  PERFORM 8200-CHECK-TABLE-LIMIT
          checkTableLimit(programCtx.getCheckTableLimitInCtx());/*8200-CHECK-TABLE-LIMIT*/
//  MOVE IP50005-TABLE-DATA TO IP00060A-DE-ATTR-TABLE ( 400-START-POINT : IP50005-TABLE-DATA-LENGTH )
          methodOut.getIp00060aDeAttrTable().replace(methodIn.getIp50005OneDayRec()/*parent*/,22/*fromOffset - (ip00060aDeAttrTable) */,32730/*fromLen*/,0+methodOut.getStartPoint400() - 1/*toOffset - (ip50005TableData) */,(int) methodIn.getIp50005TableDataLength()/*toLen*/);
//  ADD IP50005-TABLE-DATA-LENGTH TO 400-START-POINT
          methodOut.setStartPoint400(methodOut.getStartPoint400()+(int) methodIn.getIp50005TableDataLength());
      
      return methodOut;
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
      @Override
      public LoadTable7IfNeededOutCtx loadTable7IfNeeded(LoadTable7IfNeededInCtx methodIn) throws Exception {
Ip739010Ctx programCtx = methodIn.getIp739010Ctx();
LoadTable7IfNeededOutCtx methodOut = methodIn.getLoadTable7IfNeededOutCtx();

// *-----------------------------------------------------------------
// * Pass current clearing-date-and-time to ip299010 to find the
// * table-7 date which should be loaded now.  load if needed.
// *-----------------------------------------------------------------
//  MOVE 300-TABLE-7-ID TO IP00054-KEY-TABLE-ID
          methodOut.setIp00054KeyTableId(methodOut.getTable7Id300());
//  MOVE IP000608-PROCESSING-DATE-TIME TO IP00054-RELOAD-DT-TM
          methodOut.setIp00054ReloadDtTm(methodOut.getIp000608ProcessingDateTime());
//  PERFORM 8000-GET-TABLE-KEY-DT-TM
          getTableKeyDtTm(programCtx.getGetTableKeyDtTmInCtx());/*8000-GET-TABLE-KEY-DT-TM*/

// *    Check the date and time key of loaded table
// *    vs the table to be loaded.

// *        The loaded version of table 7 is still current
//  IF IP00054-RELOAD-DT-TM EQUAL 800-LAST-KEY-DT-TM-T7
//  ELSE
          if (		compareChars(methodOut.getIp00054ReloadDtTm(),methodOut.getLastKeyDtTmT7800()) != 0 ) { 
//  PERFORM 2310-LOAD-TABLE-7
              loadTable7(programCtx.getLoadTable7InCtx());/*2310-LOAD-TABLE-7*/
              // MOVE IP00054-RELOAD-DT-TM TO 800-LAST-KEY-DT-TM-T7
              methodOut.setLastKeyDtTmT7800(methodOut.getIp00054ReloadDtTm());
//  SET 88-100-T7-WAS-LOADED TO TRUE
              methodOut.setT7WasLoaded88100True(); 
              
//  PERFORM 8400-DISPLAY-COUNT
              displayCount(programCtx.getDisplayCountInCtx());/*8400-DISPLAY-COUNT*/
          }
      
      return methodOut;
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
      @Override
      public LoadTable7OutCtx loadTable7(LoadTable7InCtx methodIn) throws Exception {
Ip739010Ctx programCtx = methodIn.getIp739010Ctx();
LoadTable7OutCtx methodOut = methodIn.getLoadTable7OutCtx();

// *-----------------------------------------------------------------
// * Get all records from the optimized parameter file for table 7.
// * move the data into table 7.
// *-----------------------------------------------------------------
//  MOVE LENGTH OF IP000704-DE-SUB-ATTR-TABLE TO 800-TABLE-MAX-LENGTH
          methodOut.setTableMaxLength800(Ip000704DeSubAttrTable.getIp000704DeSubAttrTableFieldLength());
//  MOVE LENGTH OF IP000704-DE-SUB-ATTR-ROW TO 800-ROW-LENGTH
          methodOut.setRowLength800(Ip000704DeSubAttrRow.getIp000704DeSubAttrRowFieldLength());
//  MOVE 300-TABLE-7-ID TO IP50005-READ-TABLE-ID
          methodOut.setIp50005ReadTableId(methodOut.getTable7Id300());
          // MOVE IP00054-RELOAD-DT-TM TO IP50005-EFF-DATE
          methodOut.setIp50005EffDate(padLeftZeros(10,methodOut.getIp00054ReloadDtTm(),false));
//  MOVE 1 TO 400-START-POINT
          methodOut.setStartPoint400(1);
//  PERFORM WITH TEST AFTER UNTIL 88-IP50005-TBL-LAST-REC-Y
          while (true) { 
//  PERFORM 8100-GET-FROM-ONE-DAY-FILE
              getFromOneDayFile(programCtx.getGetFromOneDayFileInCtx());/*8100-GET-FROM-ONE-DAY-FILE*/
//  PERFORM 2311-MOVE-TO-TABLE-7
              moveToTable7(programCtx.getMoveToTable7InCtx());/*2311-MOVE-TO-TABLE-7*/
          if (( methodIn.isIp50005TblLastRecY88()  )) break;
          }
//  PERFORM 8300-CHECK-FOR-COMPLETE-ROWS
          checkForCompleteRows(programCtx.getCheckForCompleteRowsInCtx());/*8300-CHECK-FOR-COMPLETE-ROWS*/
          // MOVE 800-ROW-COUNT TO 800-MAX-T7-ROW-NO
          methodOut.setMaxT7RowNo800(methodOut.getRowCount800());

// *    Mark the row after the last one loaded as "undefined"
//  IF 800-ROW-COUNT < IP000704-DE-SUB-MAX
          if (	( methodOut.getRowCount800() < methodIn.getIp000704DeSubMax() ) ) { 
//  SET IP000704-UNDEFINED-DE-SUBFLD ( 800-ROW-COUNT + 1) TO TRUE
              methodOut.setIp000704UndefinedDeSubfldTrue(methodOut.getRowCount800() + 1 - 1); 
              
          }
      
      return methodOut;
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
      @Override
      public MoveToTable7OutCtx moveToTable7(MoveToTable7InCtx methodIn) throws Exception {
Ip739010Ctx programCtx = methodIn.getIp739010Ctx();
MoveToTable7OutCtx methodOut = methodIn.getMoveToTable7OutCtx();

// *-----------------------------------------------------------------
// *  Check to see if the new data will fit into the table.  if so
// *  move it into the next available positions of table 7.
// *-----------------------------------------------------------------
//  PERFORM 8200-CHECK-TABLE-LIMIT
          checkTableLimit(programCtx.getCheckTableLimitInCtx());/*8200-CHECK-TABLE-LIMIT*/
//  MOVE IP50005-TABLE-DATA TO IP000704-DE-SUB-ATTR-TABLE ( 400-START-POINT : IP50005-TABLE-DATA-LENGTH )
          methodOut.getIp000704DeSubAttrTable().replace(methodIn.getIp50005OneDayRec()/*parent*/,22/*fromOffset - (ip000704DeSubAttrTable) */,32730/*fromLen*/,0+methodOut.getStartPoint400() - 1/*toOffset - (ip50005TableData) */,(int) methodIn.getIp50005TableDataLength()/*toLen*/);
//  ADD IP50005-TABLE-DATA-LENGTH TO 400-START-POINT
          methodOut.setStartPoint400(methodOut.getStartPoint400()+(int) methodIn.getIp50005TableDataLength());
      
      return methodOut;
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
      @Override
      public ResolveFirstSubfldPtrsOutCtx resolveFirstSubfldPtrs(ResolveFirstSubfldPtrsInCtx methodIn) throws Exception {
Ip739010Ctx programCtx = methodIn.getIp739010Ctx();
ResolveFirstSubfldPtrsOutCtx methodOut = methodIn.getResolveFirstSubfldPtrsOutCtx();

// *-----------------------------------------------------------------
// * Scan table 7.  for each de whose subfields are defined there
// * post the index value of its first table-5 entry in the
// * first-subfld field of that de's entry in table 6.
// *-----------------------------------------------------------------
//  MOVE ZEROES TO 800-CURRENT-DE-NO
          methodOut.setCurrentDeNo800(0);
//  PERFORM VARYING IP000604-I FROM 1 BY 1 UNTIL IP000604-I > 128
          for (methodOut.setIp000604I(1); (	( methodOut.getIp000604I() <= 128 )) ; methodOut.setIp000604I(methodOut.getIp000604I() + 1) ) {
//  SET 88-IP000604-NO-DE-SUBFLDS ( IP000604-I ) TO TRUE
              methodOut.setIp000604NoDeSubflds88True(methodOut.getIp000604I() - 1); 
              
//  SET 88-IP000604-NO-AB-VALUES ( IP000604-I ) TO TRUE
              methodOut.setIp000604NoAbValues88True(methodOut.getIp000604I() - 1); 
              
          }
//  PERFORM VARYING IP000704-I FROM 1 BY 1 UNTIL IP000704-I > 800-MAX-T7-ROW-NO
          for (methodOut.setIp000704I(1); (	( methodOut.getIp000704I() <= methodIn.getMaxT7RowNo800() )) ; methodOut.setIp000704I(methodOut.getIp000704I() + 1) ) {
//  IF IP000704-DE-NO ( IP000704-I ) > 800-CURRENT-DE-NO
              if (	( methodOut.getIp000704DeNo(methodOut.getIp000704I() - 1) > methodOut.getCurrentDeNo800() ) ) { 
//  MOVE IP000704-DE-NO ( IP000704-I ) TO 800-CURRENT-DE-NO
                  methodOut.setCurrentDeNo800(methodOut.getIp000704DeNo(methodOut.getIp000704I() - 1));
//  SET IP000604-DE-FIRST-SUBFLD ( 800-CURRENT-DE-NO ) TO IP000704-I
                  methodOut.setIp000604DeFirstSubfld(methodOut.getCurrentDeNo800() - 1,IP000704_DE_SUB_ATTR_ROW_LENGTH * ( ((methodOut.getIp000704I() < 1) ? 1:methodOut.getIp000704I()) - 1)); 
                  
              }
          }
      
      return methodOut;
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
      @Override
      public ResolveAccBrandPtrsOutCtx resolveAccBrandPtrs(ResolveAccBrandPtrsInCtx methodIn) throws Exception {
Ip739010Ctx programCtx = methodIn.getIp739010Ctx();
ResolveAccBrandPtrsOutCtx methodOut = methodIn.getResolveAccBrandPtrsOutCtx();

// *-----------------------------------------------------------------
// * Scan table 6a.  for each de whose acceptance brand values are
// * defined there post the index value of its first table-6a entry
// * in the a/b pointer field of that de's entry in table 6.
// *-----------------------------------------------------------------
//  MOVE ZERO TO 800-CURRENT-DE-NO
          methodOut.setCurrentDeNo800(0);
//  PERFORM VARYING IP00060A-I FROM 1 BY 1 UNTIL IP00060A-I > 800-MAX-T6A-ROW-NO
          for (methodOut.setIp00060aI(1); (	( methodOut.getIp00060aI() <= methodIn.getMaxT6aRowNo800() )) ; methodOut.setIp00060aI(methodOut.getIp00060aI() + 1) ) {
//  IF IP00060A-DE-NO ( IP00060A-I ) > 800-CURRENT-DE-NO
              if (	( methodOut.getIp00060aDeNo(methodOut.getIp00060aI() - 1) > methodOut.getCurrentDeNo800() )) { 
//  MOVE IP00060A-DE-NO ( IP00060A-I ) TO 800-CURRENT-DE-NO
                  methodOut.setCurrentDeNo800(methodOut.getIp00060aDeNo(methodOut.getIp00060aI() - 1));
//  SET IP000604-DE-FIRST-AB ( 800-CURRENT-DE-NO ) TO IP00060A-I
                  methodOut.setIp000604DeFirstAb(methodOut.getCurrentDeNo800() - 1,IP00060A_DE_ATTR_ROW_LENGTH * ( ((methodOut.getIp00060aI() < 1) ? 1:methodOut.getIp00060aI()) - 1)); 
                  
              }
//  ELSE
          }
      
      return methodOut;
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
      @Override
      public GetTableKeyDtTmOutCtx getTableKeyDtTm(GetTableKeyDtTmInCtx methodIn) throws Exception {
Ip739010Ctx programCtx = methodIn.getIp739010Ctx();
GetTableKeyDtTmOutCtx methodOut = methodIn.getGetTableKeyDtTmOutCtx();

// *-----------------------------------------------------------------
// * Call routine which returns the date and time of
// * the table version which should be effective now.
// *-----------------------------------------------------------------
//  CALL 800-PTR-IP299010
          // CALL 800-PTR-IP299010
          	programCtx.setRc( ip299010.process(programCtx.getGlobalCtx().getContext("IP299010")));
      
      return methodOut;
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
      @Override
      public GetFromOneDayFileOutCtx getFromOneDayFile(GetFromOneDayFileInCtx methodIn) throws Exception {
Ip739010Ctx programCtx = methodIn.getIp739010Ctx();
GetFromOneDayFileOutCtx methodOut = methodIn.getGetFromOneDayFileOutCtx();

// *-----------------------------------------------------------------
// * Call routine to read record from optimized parameter file.
// *-----------------------------------------------------------------
//  CALL 800-PTR-IP650010
          // CALL 800-PTR-IP650010
          	programCtx.setRc( ip650010.process(programCtx.getGlobalCtx().getContext("IP650010")));
//  IF 88-IP50005-ONE-DAY-IO-GOOD
//  ELSE
          if (!(methodIn.isIp50005OneDayIoGood88()) ) { 
//  MOVE IP50005-READ-TABLE-ID TO 610-TABLE-ID
              methodOut.setTableId610(methodOut.getIp50005ReadTableId());
              // MOVE 610-REC-NOT-FOUND-MSG TO 900-ABEND-TEXT IP60001-EVENT-ERROR-MSG
              methodOut.setAbendText900(methodOut.getRecNotFoundMsg610().toCharArray());
              methodOut.setIp60001EventErrorMsg(methodOut.getRecNotFoundMsg610().toCharArray());
//  MOVE 300-PARA-8100 TO 900-ABEND-PARA
              methodOut.setAbendPara900(pad(30,methodOut.getPara8100300(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-REC-ABSENT-ABEND-CODE TO 900-ABEND-CODE IP60001-EVENT-ERROR-CODE
              methodOut.setAbendCode900(methodOut.getRecAbsentAbendCode300());
              methodOut.setIp60001EventErrorCode(methodOut.getRecAbsentAbendCode300());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError(programCtx.getTerminateOnErrorInCtx());/*9000-TERMINATE-ON-ERROR*/
          }
      
      return methodOut;
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
      @Override
      public CheckTableLimitOutCtx checkTableLimit(CheckTableLimitInCtx methodIn) throws Exception {
Ip739010Ctx programCtx = methodIn.getIp739010Ctx();
CheckTableLimitOutCtx methodOut = methodIn.getCheckTableLimitOutCtx();
          methodOut.setCheckLength800((int) (methodIn.getStartPoint400() + methodIn.getIp50005TableDataLength() - 1));
//  IF 800-CHECK-LENGTH GREATER THAN 800-TABLE-MAX-LENGTH
          if (	( methodOut.getCheckLength800() > methodIn.getTableMaxLength800() )) { 
//  MOVE IP50005-READ-TABLE-ID TO 600-TABLE-ID
              methodOut.setTableId600(methodOut.getIp50005ReadTableId());
//  MOVE IP50005-EFF-DATE TO 600-TIMESTAMP
              methodOut.setTimestamp600(String.valueOf(methodOut.getIp50005EffDateString()).toCharArray());
              // MOVE 600-TABLE-OVERFLOW-ERROR TO 900-ABEND-TEXT IP60001-EVENT-ERROR-MSG
              methodOut.setAbendText900(methodOut.getTableOverflowError600().toCharArray());
              methodOut.setIp60001EventErrorMsg(methodOut.getTableOverflowError600().toCharArray());
//  MOVE 300-PARA-8200 TO 900-ABEND-PARA
              methodOut.setAbendPara900(pad(30,methodOut.getPara8200300(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-TBL-OVERFLOW-ABEND-CODE TO 900-ABEND-CODE IP60001-EVENT-ERROR-CODE
              methodOut.setAbendCode900(methodOut.getTblOverflowAbendCode300());
              methodOut.setIp60001EventErrorCode(methodOut.getTblOverflowAbendCode300());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError(programCtx.getTerminateOnErrorInCtx());/*9000-TERMINATE-ON-ERROR*/
          }
      
      return methodOut;
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
      @Override
      public CheckForCompleteRowsOutCtx checkForCompleteRows(CheckForCompleteRowsInCtx methodIn) throws Exception {
Ip739010Ctx programCtx = methodIn.getIp739010Ctx();
CheckForCompleteRowsOutCtx methodOut = methodIn.getCheckForCompleteRowsOutCtx();

// *    400-Start-point now points to the first byte beyond the table
//  SUBTRACT 1 FROM 400-START-POINT
          methodOut.setStartPoint400(methodOut.getStartPoint400()-1);
//  DIVIDE 400-START-POINT BY 800-ROW-LENGTH GIVING 800-ROW-COUNT REMAINDER 800-REMAINDER
          methodOut.setRowCount800( (int) methodOut.getStartPoint400()/methodIn.getRowLength800());
          methodOut.setRemainder800( (int) methodOut.getStartPoint400()%methodIn.getRowLength800());
//  IF 800-REMAINDER > ZERO
          if (	( methodOut.getRemainder800() > 0 )) { 
//  MOVE IP50005-READ-TABLE-ID TO 640-TABLE-ID
              methodOut.setTableId640(methodOut.getIp50005ReadTableId());
//  MOVE IP50005-EFF-DATE TO 640-TIMESTAMP
              methodOut.setTimestamp640(String.valueOf(methodOut.getIp50005EffDateString()).toCharArray());
              // MOVE 640-TABLE-INTEGRITY-ERROR TO 900-ABEND-TEXT IP60001-EVENT-ERROR-MSG
              methodOut.setAbendText900(methodOut.getTableIntegrityError640().toCharArray());
              methodOut.setIp60001EventErrorMsg(methodOut.getTableIntegrityError640().toCharArray());
//  MOVE 300-PARA-8200 TO 900-ABEND-PARA
              methodOut.setAbendPara900(pad(30,methodOut.getPara8200300(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-TBL-INTEGRITY-ABEND-CODE TO 900-ABEND-CODE IP60001-EVENT-ERROR-CODE
              methodOut.setAbendCode900(methodOut.getTblIntegrityAbendCode300());
              methodOut.setIp60001EventErrorCode(methodOut.getTblIntegrityAbendCode300());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError(programCtx.getTerminateOnErrorInCtx());/*9000-TERMINATE-ON-ERROR*/
          }
      
      return methodOut;
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
      @Override
      public DisplayCountOutCtx displayCount(DisplayCountInCtx methodIn) throws Exception {
Ip739010Ctx programCtx = methodIn.getIp739010Ctx();
DisplayCountOutCtx methodOut = methodIn.getDisplayCountOutCtx();

// * Display table recods read and loaded count.
// *-----------------------------------------------------------------
//  MOVE IP50005-READ-TABLE-ID TO 630-TABLE-ID
          methodOut.setTableId630(methodOut.getIp50005ReadTableId());
//  MOVE IP50005-EFF-DATE TO 630-TABLE-TIMESTAMP
          methodOut.setTableTimestamp630(String.valueOf(methodOut.getIp50005EffDateString()).toCharArray());
          methodOut.setRowsLoadedCnt630(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(methodIn.getRowCount800())));
//  DISPLAY 630-ROWS-LOADED-MESSAGE
          logger.info(methodIn.getRowsLoadedMessage630().toString()); 
      
      return methodOut;
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
      @Override
      public void terminateOnError(TerminateOnErrorInCtx methodIn) throws Exception {
Ip739010Ctx programCtx = methodIn.getIp739010Ctx();

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
          logger.info(methodIn.getAbendParaName900().toString()); 
//  DISPLAY 900-ABEND-MESSAGE
          logger.info(methodIn.getAbendMessage900().toString()); 
      
      }
  
  
  
  
  
  
  
  
  }
