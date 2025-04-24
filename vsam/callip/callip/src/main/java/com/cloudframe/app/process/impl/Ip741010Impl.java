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
  
  import com.cloudframe.app.ip741010.Ip741010Ctx.*;
  import com.cloudframe.app.ip741010.Ip741010Ctx;
  import com.cloudframe.app.process.Ip741010;
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
  import com.cloudframe.app.global.sharedvar.Ip000804PdsAttrTable;
  import com.cloudframe.app.global.sharedvar.Ip000804PdsAttrRow;
  import com.cloudframe.app.global.sharedvar.Ip000904PdsSubAttrTable;
  import com.cloudframe.app.global.sharedvar.Ip000904PdsSubAttrRow;
  import com.cloudframe.app.process.Ip299010;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.process.*;
  import com.cloudframe.app.process.Ip650010;
  import com.cloudframe.app.ip741010.dto.*;
  import com.cloudframe.app.ip741010.dto.AbendParaName900;
  import com.cloudframe.app.ip741010.dto.TableIntegrityError640;
  import com.cloudframe.app.ip741010.dto.RowsLoadedMessage630;
  import com.cloudframe.app.ip741010.dto.TableOverflowError600;
  import com.cloudframe.app.ip741010.dto.AbendMessage900;
  import com.cloudframe.app.ip741010.dto.RecNotFoundMsg610;
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
  
  public class Ip741010Impl extends CommonProcess implements Ip741010 {
  
  Logger logger = LoggerFactory.getLogger(Ip741010Impl.class);
  
  
  @Value("${timeZoneId:Etc/GMT}")
  private String timeZoneId;
  
  
  
  
  private static final int IP000904_PDS_SUB_ATTR_ROW_LENGTH = 70;
  
  
  
  
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      public int process(Ip741010Ctx programCtx) throws Exception {
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
      @Override
      public MainlineOutCtx mainline(MainlineInCtx methodIn) throws Exception {
Ip741010Ctx programCtx = methodIn.getIp741010Ctx();
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
//  IF IP000608-PROCESSING-DATE-TIME = LOW-VALUES
              if (			( checkLowValue(methodOut.getIp000608ProcessingDateTime()) ) ) { 
//  MOVE 800-CURRENT-DATE-TIME TO IP000608-PROCESSING-DATE-TIME
                  methodOut.setIp000608ProcessingDateTime(methodOut.getCurrentDateTime800());
              }
//  MOVE IP000608-PROCESSING-DATE-TIME TO 800-CLEARING-DT-TM IP00054-RELOAD-DT-TM
              methodOut.setClearingDtTm800(methodOut.getIp000608ProcessingDateTime());
              methodOut.setIp00054ReloadDtTm(methodOut.getIp000608ProcessingDateTime());
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
      @Override
      public InitializationOutCtx initialization(InitializationInCtx methodIn) throws Exception {
Ip741010Ctx programCtx = methodIn.getIp741010Ctx();
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
//  SET 88-100-NO-TABLE-WAS-LOADED TO TRUE
          methodOut.setNoTableWasLoaded88100True(); 
          
      
      return methodOut;
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
      @Override
      public void loadTablesIfNeeded(LoadTablesIfNeededInCtx methodIn) throws Exception {
      
// *        This is used to tell whether we must resolve pointers
Ip741010Ctx programCtx = methodIn.getIp741010Ctx();

// *-----------------------------------------------------------------
// * Check dates on current tables against dates which should
// * now be in effect.  load tables if needed. resolve first-subfield
// * pointers if needed.
// *-----------------------------------------------------------------
//  PERFORM 2100-LOAD-TABLE-8-IF-NEEDED
          loadTable8IfNeeded(programCtx.getLoadTable8IfNeededInCtx());/*2100-LOAD-TABLE-8-IF-NEEDED*/
//  PERFORM 2200-LOAD-TABLE-9-IF-NEEDED
          loadTable9IfNeeded(programCtx.getLoadTable9IfNeededInCtx());/*2200-LOAD-TABLE-9-IF-NEEDED*/
//  IF 88-100-WE-LOADED-A-TABLE
          if ( methodIn.isWeLoadedATable88100()  ) { 
//  PERFORM 2300-RESOLVE-FIRST-SUBFLD-PTRS
              resolveFirstSubfldPtrs(programCtx.getResolveFirstSubfldPtrsInCtx());/*2300-RESOLVE-FIRST-SUBFLD-PTRS*/
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
      @Override
      public LoadTable8IfNeededOutCtx loadTable8IfNeeded(LoadTable8IfNeededInCtx methodIn) throws Exception {
Ip741010Ctx programCtx = methodIn.getIp741010Ctx();
LoadTable8IfNeededOutCtx methodOut = methodIn.getLoadTable8IfNeededOutCtx();

// *-----------------------------------------------------------------
// * Pass current clearing-date-and-time to ip299010 to find the
// * table-8 date which should be in effect now.  load if needed.
// *-----------------------------------------------------------------
//  MOVE 300-TABLE-8-ID TO IP00054-KEY-TABLE-ID
          methodOut.setIp00054KeyTableId(methodOut.getTable8Id300());
//  MOVE IP000608-PROCESSING-DATE-TIME TO IP00054-RELOAD-DT-TM
          methodOut.setIp00054ReloadDtTm(methodOut.getIp000608ProcessingDateTime());
//  PERFORM 8000-GET-TABLE-KEY-DT-TM
          getTableKeyDtTm(programCtx.getGetTableKeyDtTmInCtx());/*8000-GET-TABLE-KEY-DT-TM*/

// *    Check the date and time key of loaded table
// *    vs the table to be loaded.

// *        The loaded version of table 8 is still current
//  IF IP00054-RELOAD-DT-TM EQUAL 800-LAST-KEY-DT-TM-T8
//  ELSE
          if (		compareChars(methodOut.getIp00054ReloadDtTm(),methodOut.getLastKeyDtTmT8800()) != 0 ) { 
//  PERFORM 2110-LOAD-TABLE-8
              loadTable8(programCtx.getLoadTable8InCtx());/*2110-LOAD-TABLE-8*/
              // MOVE IP00054-RELOAD-DT-TM TO 800-LAST-KEY-DT-TM-T8
              methodOut.setLastKeyDtTmT8800(methodOut.getIp00054ReloadDtTm());
//  SET 88-100-WE-LOADED-A-TABLE TO TRUE
              methodOut.setWeLoadedATable88100True(); 
              
//  PERFORM 8400-DISPLAY-COUNT
              displayCount(programCtx.getDisplayCountInCtx());/*8400-DISPLAY-COUNT*/
          }
      
      return methodOut;
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
      @Override
      public LoadTable8OutCtx loadTable8(LoadTable8InCtx methodIn) throws Exception {
Ip741010Ctx programCtx = methodIn.getIp741010Ctx();
LoadTable8OutCtx methodOut = methodIn.getLoadTable8OutCtx();

// * Move the data into table 8.
// *-----------------------------------------------------------------
//  MOVE LENGTH OF IP000804-PDS-ATTR-TABLE TO 800-TABLE-MAX-LENGTH
          methodOut.setTableMaxLength800(Ip000804PdsAttrTable.getIp000804PdsAttrTableFieldLength());
//  MOVE LENGTH OF IP000804-PDS-ATTR-ROW TO 800-ROW-LENGTH
          methodOut.setRowLength800(Ip000804PdsAttrRow.getIp000804PdsAttrRowFieldLength());
//  MOVE 300-TABLE-8-ID TO IP50005-READ-TABLE-ID 610-TABLE-ID
          methodOut.setIp50005ReadTableId(methodOut.getTable8Id300());
          methodOut.setTableId610(methodOut.getTable8Id300());
          // MOVE IP00054-RELOAD-DT-TM TO IP50005-EFF-DATE
          methodOut.setIp50005EffDate(padLeftZeros(10,methodOut.getIp00054ReloadDtTm(),false));
//  MOVE 1 TO 400-START-POINT
          methodOut.setStartPoint400(1);
//  PERFORM WITH TEST AFTER UNTIL 88-IP50005-TBL-LAST-REC-Y
          while (true) { 
//  PERFORM 8100-GET-FROM-ONE-DAY-FILE
              getFromOneDayFile(programCtx.getGetFromOneDayFileInCtx());/*8100-GET-FROM-ONE-DAY-FILE*/
//  PERFORM 2111-MOVE-TO-TABLE-8
              moveToTable8(programCtx.getMoveToTable8InCtx());/*2111-MOVE-TO-TABLE-8*/
          if (( methodIn.isIp50005TblLastRecY88()  )) break;
          }
//  PERFORM 8300-CHECK-FOR-COMPLETE-ROWS
          checkForCompleteRows(programCtx.getCheckForCompleteRowsInCtx());/*8300-CHECK-FOR-COMPLETE-ROWS*/
          methodOut.setIp000804MaxPdsNo((short) (methodIn.getRowCount800()));
      
      return methodOut;
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
      @Override
      public MoveToTable8OutCtx moveToTable8(MoveToTable8InCtx methodIn) throws Exception {
Ip741010Ctx programCtx = methodIn.getIp741010Ctx();
MoveToTable8OutCtx methodOut = methodIn.getMoveToTable8OutCtx();

// *-----------------------------------------------------------------
// *  Check to see if the new data will fit into the table.  if so
// *  move it into the next available positions of table 8.
// *-----------------------------------------------------------------
//  PERFORM 8200-CHECK-TABLE-LIMIT
          checkTableLimit(programCtx.getCheckTableLimitInCtx());/*8200-CHECK-TABLE-LIMIT*/
//  MOVE IP50005-TABLE-DATA TO IP000804-PDS-ATTR-TABLE ( 400-START-POINT : IP50005-TABLE-DATA-LENGTH )
          methodOut.getIp000804PdsAttributes().replace(methodIn.getIp50005OneDayRec()/*parent*/,22/*fromOffset - (ip000804PdsAttrTable) */,32730/*fromLen*/,2+methodOut.getStartPoint400() - 1/*toOffset - (ip50005TableData) */,(int) methodIn.getIp50005TableDataLength()/*toLen*/);
//  ADD IP50005-TABLE-DATA-LENGTH TO 400-START-POINT
          methodOut.setStartPoint400(methodOut.getStartPoint400()+(int) methodIn.getIp50005TableDataLength());
      
      return methodOut;
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
      @Override
      public LoadTable9IfNeededOutCtx loadTable9IfNeeded(LoadTable9IfNeededInCtx methodIn) throws Exception {
Ip741010Ctx programCtx = methodIn.getIp741010Ctx();
LoadTable9IfNeededOutCtx methodOut = methodIn.getLoadTable9IfNeededOutCtx();

// *-----------------------------------------------------------------
// * Pass current clearing-date-and-time to ip299010 to find the
// * table-9 date which should be loaded now.  load if needed.
// *-----------------------------------------------------------------
//  MOVE 300-TABLE-9-ID TO IP00054-KEY-TABLE-ID
          methodOut.setIp00054KeyTableId(methodOut.getTable9Id300());
//  MOVE IP000608-PROCESSING-DATE-TIME TO IP00054-RELOAD-DT-TM
          methodOut.setIp00054ReloadDtTm(methodOut.getIp000608ProcessingDateTime());
//  PERFORM 8000-GET-TABLE-KEY-DT-TM
          getTableKeyDtTm(programCtx.getGetTableKeyDtTmInCtx());/*8000-GET-TABLE-KEY-DT-TM*/

// *    Check the date and time key of loaded table
// *    vs the table to be loaded.

// *        The loaded version of table 9 is still current
//  IF IP00054-RELOAD-DT-TM EQUAL 800-LAST-KEY-DT-TM-T9
//  ELSE
          if (		compareChars(methodOut.getIp00054ReloadDtTm(),methodOut.getLastKeyDtTmT9800()) != 0 ) { 
//  PERFORM 2210-LOAD-TABLE-9
              loadTable9(programCtx.getLoadTable9InCtx());/*2210-LOAD-TABLE-9*/
              // MOVE IP00054-RELOAD-DT-TM TO 800-LAST-KEY-DT-TM-T9
              methodOut.setLastKeyDtTmT9800(methodOut.getIp00054ReloadDtTm());
//  SET 88-100-WE-LOADED-A-TABLE TO TRUE
              methodOut.setWeLoadedATable88100True(); 
              
//  PERFORM 8400-DISPLAY-COUNT
              displayCount(programCtx.getDisplayCountInCtx());/*8400-DISPLAY-COUNT*/
          }
      
      return methodOut;
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
      @Override
      public LoadTable9OutCtx loadTable9(LoadTable9InCtx methodIn) throws Exception {
Ip741010Ctx programCtx = methodIn.getIp741010Ctx();
LoadTable9OutCtx methodOut = methodIn.getLoadTable9OutCtx();

// *-----------------------------------------------------------------
// * Get all records from the optimized parameter file for table 9.
// * move the data into table 9.
// *-----------------------------------------------------------------
//  MOVE LENGTH OF IP000904-PDS-SUB-ATTR-TABLE TO 800-TABLE-MAX-LENGTH
          methodOut.setTableMaxLength800(Ip000904PdsSubAttrTable.getIp000904PdsSubAttrTableFieldLength());
//  MOVE LENGTH OF IP000904-PDS-SUB-ATTR-ROW TO 800-ROW-LENGTH
          methodOut.setRowLength800(Ip000904PdsSubAttrRow.getIp000904PdsSubAttrRowFieldLength());
//  MOVE 300-TABLE-9-ID TO IP50005-READ-TABLE-ID 610-TABLE-ID
          methodOut.setIp50005ReadTableId(methodOut.getTable9Id300());
          methodOut.setTableId610(methodOut.getTable9Id300());
          // MOVE IP00054-RELOAD-DT-TM TO IP50005-EFF-DATE
          methodOut.setIp50005EffDate(padLeftZeros(10,methodOut.getIp00054ReloadDtTm(),false));
//  MOVE 1 TO 400-START-POINT
          methodOut.setStartPoint400(1);
//  PERFORM WITH TEST AFTER UNTIL 88-IP50005-TBL-LAST-REC-Y
          while (true) { 
//  PERFORM 8100-GET-FROM-ONE-DAY-FILE
              getFromOneDayFile(programCtx.getGetFromOneDayFileInCtx());/*8100-GET-FROM-ONE-DAY-FILE*/
//  PERFORM 2211-MOVE-TO-TABLE-9
              moveToTable9(programCtx.getMoveToTable9InCtx());/*2211-MOVE-TO-TABLE-9*/
          if (( methodIn.isIp50005TblLastRecY88()  )) break;
          }
//  PERFORM 8300-CHECK-FOR-COMPLETE-ROWS
          checkForCompleteRows(programCtx.getCheckForCompleteRowsInCtx());/*8300-CHECK-FOR-COMPLETE-ROWS*/
          // MOVE 800-ROW-COUNT TO 800-MAX-T9-ROW-NO
          methodOut.setMaxT9RowNo800(methodOut.getRowCount800());

// *    Mark the row after the last one loaded as "undefined"
//  IF 800-ROW-COUNT < IP000904-PDS-SUB-MAX
          if (	( methodOut.getRowCount800() < methodIn.getIp000904PdsSubMax() ) ) { 
//  SET IP000904-UNDEFINED-PDS-SUBFLD ( 800-ROW-COUNT + 1) TO TRUE
              methodOut.setIp000904UndefinedPdsSubfldTrue(methodOut.getRowCount800() + 1 - 1); 
              
          }
      
      return methodOut;
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
      @Override
      public MoveToTable9OutCtx moveToTable9(MoveToTable9InCtx methodIn) throws Exception {
Ip741010Ctx programCtx = methodIn.getIp741010Ctx();
MoveToTable9OutCtx methodOut = methodIn.getMoveToTable9OutCtx();

// *-----------------------------------------------------------------
// *  Check to see if the new data will fit into the table.  if so
// *  move it into the next available positions of table 9.
// *-----------------------------------------------------------------
//  PERFORM 8200-CHECK-TABLE-LIMIT
          checkTableLimit(programCtx.getCheckTableLimitInCtx());/*8200-CHECK-TABLE-LIMIT*/
//  MOVE IP50005-TABLE-DATA TO IP000904-PDS-SUB-ATTR-TABLE ( 400-START-POINT : IP50005-TABLE-DATA-LENGTH )
          methodOut.getIp000904PdsSubAttrTable().replace(methodIn.getIp50005OneDayRec()/*parent*/,22/*fromOffset - (ip000904PdsSubAttrTable) */,32730/*fromLen*/,0+methodOut.getStartPoint400() - 1/*toOffset - (ip50005TableData) */,(int) methodIn.getIp50005TableDataLength()/*toLen*/);
//  ADD IP50005-TABLE-DATA-LENGTH TO 400-START-POINT
          methodOut.setStartPoint400(methodOut.getStartPoint400()+(int) methodIn.getIp50005TableDataLength());
      
      return methodOut;
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
      @Override
      public ResolveFirstSubfldPtrsOutCtx resolveFirstSubfldPtrs(ResolveFirstSubfldPtrsInCtx methodIn) throws Exception {
Ip741010Ctx programCtx = methodIn.getIp741010Ctx();
ResolveFirstSubfldPtrsOutCtx methodOut = methodIn.getResolveFirstSubfldPtrsOutCtx();

// *-----------------------------------------------------------------
// * Scan table 9.  for each pds whose subfields are defined there
// * post the index value of its first table-9 entry in the
// * first-subfld field of that pds's entry in table 8.
// *-----------------------------------------------------------------
//  MOVE ZEROES TO 800-CURRENT-PDS-NO
          methodOut.setCurrentPdsNo800(0);
//  PERFORM VARYING IP000804-I FROM 1 BY 1 UNTIL IP000804-I > IP000804-MAX-PDS-NO
          for (methodOut.setIp000804I(1); (	( methodOut.getIp000804I() <= methodIn.getIp000804MaxPdsNo() ) ) ; methodOut.setIp000804I(methodOut.getIp000804I() + 1) ) {
//  SET 88-IP000804-NO-PDS-SUBFLDS ( IP000804-I ) TO TRUE
              methodOut.setIp000804NoPdsSubflds88True(methodOut.getIp000804I() - 1); 
              
          }
//  PERFORM VARYING IP000904-I FROM 1 BY 1 UNTIL IP000904-I > 800-MAX-T9-ROW-NO
          for (methodOut.setIp000904I(1); (	( methodOut.getIp000904I() <= methodIn.getMaxT9RowNo800() )) ; methodOut.setIp000904I(methodOut.getIp000904I() + 1) ) {
//  IF IP000904-PDS-NO ( IP000904-I ) > 800-CURRENT-PDS-NO
              if (	( methodOut.getIp000904PdsNo(methodOut.getIp000904I() - 1) > methodOut.getCurrentPdsNo800() ) ) { 
//  MOVE IP000904-PDS-NO ( IP000904-I ) TO 800-CURRENT-PDS-NO
                  methodOut.setCurrentPdsNo800(methodOut.getIp000904PdsNo(methodOut.getIp000904I() - 1));
//  SET IP000804-PDS-FIRST-SUBFLD ( 800-CURRENT-PDS-NO ) TO IP000904-I
                  methodOut.setIp000804PdsFirstSubfld(methodOut.getCurrentPdsNo800() - 1,IP000904_PDS_SUB_ATTR_ROW_LENGTH * ( ((methodOut.getIp000904I() < 1) ? 1:methodOut.getIp000904I()) - 1)); 
                  
              }
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
Ip741010Ctx programCtx = methodIn.getIp741010Ctx();
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
      @Override
      public GetFromOneDayFileOutCtx getFromOneDayFile(GetFromOneDayFileInCtx methodIn) throws Exception {
Ip741010Ctx programCtx = methodIn.getIp741010Ctx();
GetFromOneDayFileOutCtx methodOut = methodIn.getGetFromOneDayFileOutCtx();

// *-----------------------------------------------------------------
// * Call routine to read record from one-day-file.
// *-----------------------------------------------------------------
//  CALL 800-PTR-IP650010
          // CALL 800-PTR-IP650010
          	programCtx.setRc( ip650010.process(programCtx.getGlobalCtx().getContext("IP650010")));
//  IF 88-IP50005-ONE-DAY-IO-GOOD
//  ELSE
          if (!(methodIn.isIp50005OneDayIoGood88()) ) { 
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
Ip741010Ctx programCtx = methodIn.getIp741010Ctx();
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
Ip741010Ctx programCtx = methodIn.getIp741010Ctx();
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
Ip741010Ctx programCtx = methodIn.getIp741010Ctx();
DisplayCountOutCtx methodOut = methodIn.getDisplayCountOutCtx();

// *-----------------------------------------------------------------
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
Ip741010Ctx programCtx = methodIn.getIp741010Ctx();

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
          logger.info(methodIn.getAbendParaName900().toString()); 
//  DISPLAY 900-ABEND-MESSAGE
          logger.info(methodIn.getAbendMessage900().toString()); 
      
      }
  
  
  
  
  
  
  
  
  }
