  package com.cloudframe.app.process;
   /* The comment section is too large, 
	 * hence added at the end of the java code 
	 * please scroll all the way to the bottom to see complete comments 
	 */
  
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.sf327010.file.*;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.sf327010.dto.WhenCompDate800;
  import com.cloudframe.app.sf327010.dto.CompileDate600;
  import com.cloudframe.app.sf327010.dto.WhenCompTime800;
  import com.cloudframe.app.sf327010.dto.CompileTime600;
  import org.springframework.beans.factory.annotation.Value;
  import com.cloudframe.app.sf327010.dto.CurrentDate600;
  import com.cloudframe.app.sf327010.dto.FuncCurrDate800;
  import com.cloudframe.app.sf327010.dto.CurrentTime600;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.sf327010.dto.LserviceDate800;
  import com.cloudframe.app.sf327010.dto.Detail1205;
  import com.cloudframe.app.sf327010.dto.LserviceTime800;
  import com.cloudframe.app.sf327010.dto.HserviceDate800;
  import com.cloudframe.app.sf327010.dto.HserviceTime800;
  import java.math.BigDecimal;
  import java.math.RoundingMode;
  import com.cloudframe.app.sf327010.dto.*;
  import com.cloudframe.app.sf327010.dto.DtlLine1205;
  import com.cloudframe.app.sf327010.dto.HdrLine1201;
  import com.cloudframe.app.sf327010.dto.DtlLine2205;
  import com.cloudframe.app.sf327010.dto.HdrLine2202;
  import com.cloudframe.app.sf327010.dto.DetailData3205;
  import com.cloudframe.app.sf327010.dto.CompileMsg600;
  import com.cloudframe.app.sf327010.dto.LowServiceTime800;
  import com.cloudframe.app.sf327010.dto.TotWriteCountMsg600;
  import com.cloudframe.app.sf327010.dto.CurrentRunMsg600;
  import com.cloudframe.app.sf327010.dto.FuncCurrentDate800;
  import com.cloudframe.app.sf327010.dto.FuncWhenCompiled800;
  import com.cloudframe.app.sf327010.dto.TotReadCountMsg600;
  import com.cloudframe.app.sf327010.dto.HighServiceTime800;
  import com.cloudframe.app.sf327010.file.records.Group1;
  import com.cloudframe.app.sf327010.dto.Sf528ExtractZLogRec;
  import com.cloudframe.app.sf327010.dto.EojMessage6009999;
  import com.cloudframe.app.sf327010.file.records.Sys201AsaServerRec;
  import com.cloudframe.app.sf327010.dto.Sf535ZlogServicesGroup;
  import com.cloudframe.app.sf327010.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("sf327010")
  
  public class Sf327010 extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Sf327010.class);
  
  private DtlLine1205 dtlLine1205 = new DtlLine1205() ;
  private HdrLine1201 hdrLine1201 = new HdrLine1201() ;
  private DtlLine2205 dtlLine2205 = new DtlLine2205() ;
  private HdrLine2202 hdrLine2202 = new HdrLine2202() ;
  private DetailData3205 detailData3205 = new DetailData3205() ;
  private CompileMsg600 compileMsg600 = new CompileMsg600() ;
  private LowServiceTime800 lowServiceTime800 = new LowServiceTime800() ;
  private TotWriteCountMsg600 totWriteCountMsg600 = new TotWriteCountMsg600() ;
  private CurrentRunMsg600 currentRunMsg600 = new CurrentRunMsg600() ;
  private FuncCurrentDate800 funcCurrentDate800 = new FuncCurrentDate800() ;
  private FuncWhenCompiled800 funcWhenCompiled800 = new FuncWhenCompiled800() ;
  private TotReadCountMsg600 totReadCountMsg600 = new TotReadCountMsg600() ;
  private HighServiceTime800 highServiceTime800 = new HighServiceTime800() ;
  private Group1 group1 = new Group1() ;
  private Sf528ExtractZLogRec sf528ExtractZLogRec = new Sf528ExtractZLogRec() ;
  private EojMessage6009999 eojMessage6009999 = new EojMessage6009999() ;
  private Sys201AsaServerRec sys201AsaServerRec = new Sys201AsaServerRec() ;
  private Sf535ZlogServicesGroup sf535ZlogServicesGroup = new Sf535ZlogServicesGroup() ;
  private Work work = new Work() ;
  
  @Value("${timeZoneId:Etc/GMT}")
  private String timeZoneId;
  
  
  @Autowired 
  @Qualifier("sf327010_sys001ExtractZLogFile")
  Sys001ExtractZLogFile sys001ExtractZLogFile;
  @Autowired 
  @Qualifier("sf327010_sys201AsaServerReport")
  Sys201AsaServerReport sys201AsaServerReport;
  
  
  
  int sf535X;
  
  
  
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
        finally {
      		if(sys001ExtractZLogFile.hasOpened() && !sys001ExtractZLogFile.isReadOnly()) { 
      			sys001ExtractZLogFile.flush(); 
      		}
      		if(sys201AsaServerReport.hasOpened() && !sys201AsaServerReport.isReadOnly()) { 
      			sys201AsaServerReport.flush(); 
      		}
      }
      
       return getRc(); // Exit with return code
      // end of process method
      }
      /**
      * mainline 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAINLINE COBOL Cyclomatic complexity - 3
      * Input  :  

      * - extractZLogEofSw100            COBOL Name: 100-EXTRACT-Z-LOG-EOF-SW
      *
      * Output : None 

      * @throws CFException
      */
      private void mainline() throws Exception {
      
// ****************************************************************
// *                0 0 0 0 - M a i n l i n e                 *   *
// ****************************************************************
//  PERFORM 1000-INITIALIZE-PROGRAM
          initializeProgram();/*1000-INITIALIZE-PROGRAM*/
          if (this.isProgramEnded()) {
              return ;
          }
//  PERFORM 2000-PROCESS-INPUT UNTIL 88-100-Z-LOG-EOF
          while (!(work.isZLogEof88100()) ) {
             processInput();/*2000-PROCESS-INPUT*/
             if (this.isProgramEnded()) {
                 return ;
             }
          }
//  PERFORM 9000-TERMINATE-PROGRAM
          terminateProgram();/*9000-TERMINATE-PROGRAM*/
          if (this.isProgramEnded()) {
              return ;
          }
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          this.setProgramEnded(true);
          return ;
      
      }
      /**
      * initializeProgram 
      *   This method is derived from 
  *   COBOL Paragraph - 1000-INITIALIZE-PROGRAM COBOL Cyclomatic complexity - 2
      * Input  :  

      * - extractZLogEofSw100            COBOL Name: 100-EXTRACT-Z-LOG-EOF-SW
      * - noRecordFoundMsg600            COBOL Name: 600-NO-RECORD-FOUND-MSG
      * - plus1300                       COBOL Name: 300-PLUS-1
      * - sf528ServerId                  COBOL Name: SF528-SERVER-ID
      * - sf528LogType                   COBOL Name: SF528-LOG-TYPE
      * - sf528ServiceDateTime           COBOL Name: SF528-SERVICE-DATE-TIME
      * - pageCount400                   COBOL Name: 400-PAGE-COUNT
      *
      * Output :  

      * - serverId202                    COBOL Name: 202-SERVER-ID
      * - pageCount202                   COBOL Name: 202-PAGE-COUNT
      * - plus1300                       COBOL Name: 300-PLUS-1
      * - sf528ServerId                  COBOL Name: SF528-SERVER-ID
      * - logType205                     COBOL Name: 205-LOG-TYPE
      * - sf528LogType                   COBOL Name: SF528-LOG-TYPE
      * - highServiceTime800             COBOL Name: 800-HIGH-SERVICE-TIME
      * - lowServiceTime800              COBOL Name: 800-LOW-SERVICE-TIME
      * - sf528ServiceDateTime           COBOL Name: SF528-SERVICE-DATE-TIME
      * - pageCount400                   COBOL Name: 400-PAGE-COUNT
      *
      * @throws CFException
      */
      private void initializeProgram() throws Exception {
      
// ****************************************************************
// *                1000-Initialize-program                       *
// ****************************************************************
//  PERFORM 1100-BUILD-BEG-MSG
          buildBegMsg();/*1100-BUILD-BEG-MSG*/
//  PERFORM 1200-OPEN-FILES
          openFiles();/*1200-OPEN-FILES*/
//  PERFORM 8000-READ-SYS001
          readSys001();/*8000-READ-SYS001*/
//  IF 88-100-Z-LOG-EOF
          if ( work.isZLogEof88100()  ) { 
//  DISPLAY 600-NO-RECORD-FOUND-MSG
              logger.info(new String(work.getNoRecordFoundMsg600())); 
//  MOVE SPACES TO 202-SERVER-ID
              hdrLine2202.setServerId202(CONSTANTS.SPACE_3);
//  MOVE 300-PLUS-1 TO 202-PAGE-COUNT
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
              hdrLine2202.setPageCount202(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(work.getPlus1300()).toCharArray()));
//  PERFORM 8400-WRITE-HDR
              writeHdr();/*8400-WRITE-HDR*/
//  PERFORM 1300-GENERATE-EMPTY-DTL
              generateEmptyDtl();/*1300-GENERATE-EMPTY-DTL*/
          }
//  ELSE
          else { 
//  MOVE SF528-SERVER-ID TO 202-SERVER-ID
              hdrLine2202.setServerId202(sf528ExtractZLogRec.getSf528ServerId());
//  MOVE SF528-LOG-TYPE TO 205-LOG-TYPE
              dtlLine1205.setLogType205(sf528ExtractZLogRec.getSf528LogType());
//  MOVE SF528-SERVICE-DATE-TIME TO 800-HIGH-SERVICE-TIME 800-LOW-SERVICE-TIME
              highServiceTime800.setString(sf528ExtractZLogRec.getSf528ServiceDateTime());
              lowServiceTime800.setString(sf528ExtractZLogRec.getSf528ServiceDateTime());
//  ADD 300-PLUS-1 TO 400-PAGE-COUNT
              work.setPageCount400(work.getPageCount400()+(int) work.getPlus1300());
//  MOVE 400-PAGE-COUNT TO 202-PAGE-COUNT
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
              hdrLine2202.setPageCount202(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(work.getPageCount400()).toCharArray()));
//  PERFORM 8400-WRITE-HDR
              writeHdr();/*8400-WRITE-HDR*/
//  PERFORM 8100-BACKUP-RECORD-DATA
              backupRecordData();/*8100-BACKUP-RECORD-DATA*/
//  PERFORM 8200-INITIALIZE-VALUES
              initializeValues();/*8200-INITIALIZE-VALUES*/
          }
      
      }
      /**
      * buildBegMsg 
      *   This method is derived from 
  *   COBOL Paragraph - 1100-BUILD-BEG-MSG COBOL Cyclomatic complexity - 1
      * Input  :  

      * - runMonth800                    COBOL Name: 800-RUN-MONTH
      * - startExecMsg600                COBOL Name: 600-START-EXEC-MSG
      * - compileMsg600                  COBOL Name: 600-COMPILE-MSG
      * - currentRunMsg600               COBOL Name: 600-CURRENT-RUN-MSG
      *
      * Output :  

      * - funcWhenCompiled800            COBOL Name: 800-FUNC-WHEN-COMPILED
      * - whenDateYyyy800                COBOL Name: 800-WHEN-DATE-YYYY
      * - compDateYyyy600                COBOL Name: 600-COMP-DATE-YYYY
      * - whenDateMm800                  COBOL Name: 800-WHEN-DATE-MM
      * - compDateMm600                  COBOL Name: 600-COMP-DATE-MM
      * - whenDateDd800                  COBOL Name: 800-WHEN-DATE-DD
      * - compDateDd600                  COBOL Name: 600-COMP-DATE-DD
      * - whenTimeHh800                  COBOL Name: 800-WHEN-TIME-HH
      * - compTimeHh600                  COBOL Name: 600-COMP-TIME-HH
      * - whenTimeMm800                  COBOL Name: 800-WHEN-TIME-MM
      * - compTimeMm600                  COBOL Name: 600-COMP-TIME-MM
      * - whenTimeSs800                  COBOL Name: 800-WHEN-TIME-SS
      * - compTimeSs600                  COBOL Name: 600-COMP-TIME-SS
      * - funcCurrentDate800             COBOL Name: 800-FUNC-CURRENT-DATE
      * - currDateYyyy600                COBOL Name: 600-CURR-DATE-YYYY
      * - currDateYyyy800                COBOL Name: 800-CURR-DATE-YYYY
      * - currDateMm600                  COBOL Name: 600-CURR-DATE-MM
      * - currDateMm800                  COBOL Name: 800-CURR-DATE-MM
      * - currDateDd600                  COBOL Name: 600-CURR-DATE-DD
      * - currDateDd800                  COBOL Name: 800-CURR-DATE-DD
      * - currTimeHh600                  COBOL Name: 600-CURR-TIME-HH
      * - currTimeMm600                  COBOL Name: 600-CURR-TIME-MM
      * - currTimeSs600                  COBOL Name: 600-CURR-TIME-SS
      * - runYear201                     COBOL Name: 201-RUN-YEAR
      * - mnthMmNum100                   COBOL Name: 100-MNTH-MM-NUM
      * - runMonth201                    COBOL Name: 201-RUN-MONTH
      * - runMonth800                    COBOL Name: 800-RUN-MONTH
      * - runDate201                     COBOL Name: 201-RUN-DATE
      *
      * @throws CFException
      */
      private void buildBegMsg() throws Exception {
			// Declare local variables used in the method
			WhenCompDate800 whenCompDate800 = funcWhenCompiled800.getWhenCompDate800();
			CompileDate600 compileDate600 = compileMsg600.getCompileDate600();
			WhenCompTime800 whenCompTime800 = funcWhenCompiled800.getWhenCompTime800();
			CompileTime600 compileTime600 = compileMsg600.getCompileTime600();
			CurrentDate600 currentDate600 = currentRunMsg600.getCurrentDate600();
			FuncCurrDate800 funcCurrDate800 = funcCurrentDate800.getFuncCurrDate800();
			CurrentTime600 currentTime600 = currentRunMsg600.getCurrentTime600();
			// End of variable declaration

      
// *****************************************************************
// *           1 1 0 0 - B u i l d - b e g - m s g                 *
// *****************************************************************
// *  this paragraph will build and display the start message      *
// *  for the program.                                             *
// *****************************************************************
//  MOVE FUNCTION WHEN-COMPILED TO 800-FUNC-WHEN-COMPILED
          funcWhenCompiled800.setString("2021100505475200     ".toCharArray());
//  MOVE 800-WHEN-DATE-YYYY TO 600-COMP-DATE-YYYY
          compileDate600.setCompDateYyyy600(whenCompDate800.getWhenDateYyyy800());
  
//  MOVE 800-WHEN-DATE-MM TO 600-COMP-DATE-MM
          compileDate600.setCompDateMm600(whenCompDate800.getWhenDateMm800());
  
//  MOVE 800-WHEN-DATE-DD TO 600-COMP-DATE-DD
          compileDate600.setCompDateDd600(whenCompDate800.getWhenDateDd800());
  
//  MOVE 800-WHEN-TIME-HH TO 600-COMP-TIME-HH
          compileTime600.setCompTimeHh600(whenCompTime800.getWhenTimeHh800());
  
//  MOVE 800-WHEN-TIME-MM TO 600-COMP-TIME-MM
          compileTime600.setCompTimeMm600(whenCompTime800.getWhenTimeMm800());
  
//  MOVE 800-WHEN-TIME-SS TO 600-COMP-TIME-SS
          compileTime600.setCompTimeSs600(whenCompTime800.getWhenTimeSs800());
  
//  MOVE FUNCTION CURRENT-DATE TO 800-FUNC-CURRENT-DATE
          funcCurrentDate800.setString( substring(CFUtil.getCurrentDate(timeZoneId),0,21));
          // MOVE '2021' TO 600-CURR-DATE-YYYY 800-CURR-DATE-YYYY
          //  LITERAL_2021 = '2021'
          currentRunMsg600.getCurrentDate600().setCurrDateYyyy600(CONSTANTS.LITERAL_2021);
          funcCurrentDate800.getFuncCurrDate800().setCurrDateYyyy800(CONSTANTS.LITERAL_2021);
  
          // MOVE '10' TO 600-CURR-DATE-MM 800-CURR-DATE-MM
          //  LITERAL_10 = '10'
          currentRunMsg600.getCurrentDate600().setCurrDateMm600(CONSTANTS.LITERAL_10);
          funcCurrentDate800.getFuncCurrDate800().setCurrDateMm800(CONSTANTS.LITERAL_10);
  
          // MOVE '02' TO 600-CURR-DATE-DD 800-CURR-DATE-DD
          //  LITERAL_02 = '02'
          currentRunMsg600.getCurrentDate600().setCurrDateDd600(CONSTANTS.LITERAL_02);
          funcCurrentDate800.getFuncCurrDate800().setCurrDateDd800(CONSTANTS.LITERAL_02);
  
          // MOVE '16' TO 600-CURR-TIME-HH
          //  LITERAL_16 = '16'
          currentRunMsg600.getCurrentTime600().setCurrTimeHh600(CONSTANTS.LITERAL_16);
  
          // MOVE '05' TO 600-CURR-TIME-MM
          //  LITERAL_05 = '05'
          currentRunMsg600.getCurrentTime600().setCurrTimeMm600(CONSTANTS.LITERAL_05);
  
          // MOVE '31' TO 600-CURR-TIME-SS
          //  LITERAL_31 = '31'
          currentRunMsg600.getCurrentTime600().setCurrTimeSs600(CONSTANTS.LITERAL_31);
  
//  MOVE 800-CURR-DATE-YYYY TO 201-RUN-YEAR
          hdrLine1201.setRunYear201(funcCurrDate800.getCurrDateYyyy800());
  
//  MOVE 800-CURR-DATE-MM TO 100-MNTH-MM-NUM
          work.setMnthMmNum100(funcCurrDate800.getCurrDateMm800());
  
//  PERFORM 8500-BUILD-MONTH
          buildMonth();/*8500-BUILD-MONTH*/
//  MOVE 800-RUN-MONTH TO 201-RUN-MONTH
          hdrLine1201.setRunMonth201(work.getRunMonth800());
//  MOVE 800-CURR-DATE-DD TO 201-RUN-DATE
          hdrLine1201.setRunDate201(funcCurrDate800.getCurrDateDd800());
  
//  DISPLAY 600-START-EXEC-MSG
          logger.info(new String(work.getStartExecMsg600())); 
//  DISPLAY 600-COMPILE-MSG
          logger.info(compileMsg600.toString()); 
//  DISPLAY 600-CURRENT-RUN-MSG
          logger.info(currentRunMsg600.toString()); 
//  DISPLAY SPACE
          logger.info(" "); 
      
      }
      /**
      * openFiles 
      *   This method is derived from 
  *   COBOL Paragraph - 1200-OPEN-FILES COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void openFiles() throws Exception {
      
// ******************************************************************
// *           1 2 0 0 - O p e n - f i l e s                        *
// ******************************************************************
//  OPEN INPUT SYS001-EXTRACT-Z-LOG-FILE OUTPUT SYS201-ASA-SERVER-REPORT
          sys001ExtractZLogFile.open(new String(CONSTANTS.MODE_READ_ONLY_36242),sys001ExtractZLogFile.getFileName(),sys001ExtractZLogFile.getSys001ExtractZLogFileCharSet(),sys001ExtractZLogFile.getSys001ExtractZLogFileCrlfFlag());
          sys201AsaServerReport.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),sys201AsaServerReport.getFileName(),sys201AsaServerReport.getSys201AsaServerReportCharSet(),sys201AsaServerReport.getSys201AsaServerReportCrlfFlag());
      
      }
      /**
      * generateEmptyDtl 
      *   This method is derived from 
  *   COBOL Paragraph - 1300-GENERATE-EMPTY-DTL COBOL Cyclomatic complexity - 1
      * Input  :  

      * - sys201AsaServerRec             COBOL Name: SYS201-ASA-SERVER-REC
      * - lineCount400                   COBOL Name: 400-LINE-COUNT
      * - plus4300                       COBOL Name: 300-PLUS-4
      *
      * Output :  

      * - lineCount400                   COBOL Name: 400-LINE-COUNT
      *
      * @throws CFException
      */
      private void generateEmptyDtl() throws Exception {
      
// ******************************************************************
// *            1300-Generate-empty-dtl                             *
// ******************************************************************
//  WRITE SYS201-ASA-SERVER-REC FROM 206-DTL-LINE-2 AFTER ADVANCING 300-NUM-4 LINES
          sys201AsaServerReport.writeAfter(work.getDtlLine2206(),work.getNum4300());
          sys201AsaServerRec.setString(CONSTANTS.LOW_VALUE_215751987);
//  ADD 300-PLUS-4 TO 400-LINE-COUNT
          work.setLineCount400(work.getLineCount400()+(int) work.getPlus4300());
      
      }
      /**
      * processInput 
      *   This method is derived from 
  *   COBOL Paragraph - 2000-PROCESS-INPUT COBOL Cyclomatic complexity - 2
      * Input  :  

      * - extractZLogEofSw100            COBOL Name: 100-EXTRACT-Z-LOG-EOF-SW
      *
      * Output : None 

      * @throws CFException
      */
      private void processInput() throws Exception {
      
// ******************************************************************
// *           2 0 0 0 - P r o c e s s - i n p u t                  *
// ******************************************************************
//  PERFORM 2100-COMPARE-BACKUP-DATA
          compareBackupData();/*2100-COMPARE-BACKUP-DATA*/
//  PERFORM 2200-ACCUMULATE-DATA
          accumulateData();/*2200-ACCUMULATE-DATA*/
//  PERFORM 8100-BACKUP-RECORD-DATA
          backupRecordData();/*8100-BACKUP-RECORD-DATA*/
//  PERFORM 8000-READ-SYS001
          readSys001();/*8000-READ-SYS001*/
//  IF 88-100-Z-LOG-EOF
          if ( work.isZLogEof88100()  ) { 
//  PERFORM 8300-GENERATE-DTL
              generateDtl();/*8300-GENERATE-DTL*/
//  PERFORM 2300-DISPLAY-SERVICE-DATE
              displayServiceDate();/*2300-DISPLAY-SERVICE-DATE*/
          }
      
      }
      /**
      * compareBackupData 
      *   This method is derived from 
  *   COBOL Paragraph - 2100-COMPARE-BACKUP-DATA COBOL Cyclomatic complexity - 4
      * Input  :  

      * - sf528ServerId                  COBOL Name: SF528-SERVER-ID
      * - prevServerId800                COBOL Name: 800-PREV-SERVER-ID
      * - sf528LogType                   COBOL Name: SF528-LOG-TYPE
      * - prevLogType800                 COBOL Name: 800-PREV-LOG-TYPE
      * - sf528ServiceId                 COBOL Name: SF528-SERVICE-ID
      * - prevServiceId800               COBOL Name: 800-PREV-SERVICE-ID
      *
      * Output :  

      * - logType205                     COBOL Name: 205-LOG-TYPE
      * - sf528LogType                   COBOL Name: SF528-LOG-TYPE
      *
      * @throws CFException
      */
      private void compareBackupData() throws Exception {
			// Declare local variables used in the method
			char[] sf528ServerId = null;
			char[] prevServerId800 = null;
			char[] sf528LogType = null;
			char[] prevLogType800 = null;
			char[] sf528ServiceId = null;
			char[] prevServiceId800 = null;
			// End of variable declaration

      
// ******************************************************************
// *         2100-Compare-backup-data                               *
// ******************************************************************
          sf528ServerId = sf528ExtractZLogRec.getSf528ServerId();
          prevServerId800 = work.getPrevServerId800();
//  IF SF528-SERVER-ID NOT EQUAL 800-PREV-SERVER-ID
          if (		compareChars(sf528ServerId,prevServerId800) != 0 ) { 
//  PERFORM 8300-GENERATE-DTL
              generateDtl();/*8300-GENERATE-DTL*/
//  PERFORM 2110-GENERATE-HDR
              generateHdr();/*2110-GENERATE-HDR*/
//  MOVE SF528-LOG-TYPE TO 205-LOG-TYPE
              dtlLine1205.setLogType205(sf528ExtractZLogRec.getSf528LogType());
//  PERFORM 8200-INITIALIZE-VALUES
              initializeValues();/*8200-INITIALIZE-VALUES*/
          }
  
//  ELSE
          else { 
              prevLogType800 = work.getPrevLogType800();
              sf528LogType = sf528ExtractZLogRec.getSf528LogType();
//  IF SF528-LOG-TYPE NOT EQUAL 800-PREV-LOG-TYPE
              if (		compareChars(sf528LogType,prevLogType800) != 0 ) { 
//  PERFORM 8300-GENERATE-DTL
                  generateDtl();/*8300-GENERATE-DTL*/
//  MOVE SF528-LOG-TYPE TO 205-LOG-TYPE
                  dtlLine1205.setLogType205(sf528ExtractZLogRec.getSf528LogType());
//  PERFORM 8200-INITIALIZE-VALUES
                  initializeValues();/*8200-INITIALIZE-VALUES*/
              }
  
//  ELSE
              else { 
                  prevServiceId800 = work.getPrevServiceId800();
                  sf528ServiceId = sf528ExtractZLogRec.getSf528ServiceId();
//  IF SF528-SERVICE-ID NOT EQUAL 800-PREV-SERVICE-ID
                  if (		compareChars(sf528ServiceId,prevServiceId800) != 0 ) { 
//  PERFORM 8300-GENERATE-DTL
                      generateDtl();/*8300-GENERATE-DTL*/
//  PERFORM 8200-INITIALIZE-VALUES
                      initializeValues();/*8200-INITIALIZE-VALUES*/
                  }
  
              }
          }
      
      }
      /**
      * generateHdr 
      *   This method is derived from 
  *   COBOL Paragraph - 2110-GENERATE-HDR COBOL Cyclomatic complexity - 2
      * Input  :  

      * - lineCount400                   COBOL Name: 400-LINE-COUNT
      * - maxLinesPerPage300             COBOL Name: 300-MAX-LINES-PER-PAGE
      * - num0300                        COBOL Name: 300-NUM-0
      * - pageCount400                   COBOL Name: 400-PAGE-COUNT
      * - plus1300                       COBOL Name: 300-PLUS-1
      * - sf528ServerId                  COBOL Name: SF528-SERVER-ID
      *
      * Output :  

      * - lineCount400                   COBOL Name: 400-LINE-COUNT
      * - num0300                        COBOL Name: 300-NUM-0
      * - pageCount400                   COBOL Name: 400-PAGE-COUNT
      * - serverId202                    COBOL Name: 202-SERVER-ID
      * - sf528ServerId                  COBOL Name: SF528-SERVER-ID
      * - pageCount202                   COBOL Name: 202-PAGE-COUNT
      *
      * @throws CFException
      */
      private void generateHdr() throws Exception {
			// Declare local variables used in the method
			long lineCount400 = 0;
			short maxLinesPerPage300 = 0;
			// End of variable declaration

      
// ******************************************************************
// *            2110-Generate-hdr                                   *
// ******************************************************************
//  IF 400-LINE-COUNT GREATER THAN 300-MAX-LINES-PER-PAGE
          if (	( work.getLineCount400() > work.getMaxLinesPerPage300() ) ) { 
//  MOVE 300-NUM-0 TO 400-LINE-COUNT
              work.setLineCount400( work.getNum0300());
//  ADD 300-PLUS-1 TO 400-PAGE-COUNT
              work.setPageCount400(work.getPageCount400()+(int) work.getPlus1300());
//  MOVE SF528-SERVER-ID TO 202-SERVER-ID
              hdrLine2202.setServerId202(sf528ExtractZLogRec.getSf528ServerId());
//  MOVE 400-PAGE-COUNT TO 202-PAGE-COUNT
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
              hdrLine2202.setPageCount202(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(work.getPageCount400()).toCharArray()));
//  PERFORM 8400-WRITE-HDR
              writeHdr();/*8400-WRITE-HDR*/
          }
//  ELSE
          else { 
//  ADD 300-PLUS-1 TO 400-PAGE-COUNT
              work.setPageCount400(work.getPageCount400()+(int) work.getPlus1300());
//  MOVE SF528-SERVER-ID TO 202-SERVER-ID
              hdrLine2202.setServerId202(sf528ExtractZLogRec.getSf528ServerId());
//  MOVE 400-PAGE-COUNT TO 202-PAGE-COUNT
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
              hdrLine2202.setPageCount202(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(work.getPageCount400()).toCharArray()));
//  PERFORM 8400-WRITE-HDR
              writeHdr();/*8400-WRITE-HDR*/
          }
      
      }
      /**
      * accumulateData 
      *   This method is derived from 
  *   COBOL Paragraph - 2200-ACCUMULATE-DATA COBOL Cyclomatic complexity - 6
      * Input  :  

      * - totMessCount400                COBOL Name: 400-TOT-MESS-COUNT
      * - plus1300                       COBOL Name: 300-PLUS-1
      * - sf528ServiceStatus             COBOL Name: SF528-SERVICE-STATUS
      * - charC300                       COBOL Name: 300-CHAR-C
      * - successCount400                COBOL Name: 400-SUCCESS-COUNT
      * - errorCount400                  COBOL Name: 400-ERROR-COUNT
      * - sumElapsedTime800              COBOL Name: 800-SUM-ELAPSED-TIME
      * - sf528ElapsedTime               COBOL Name: SF528-ELAPSED-TIME
      * - highElapsed800                 COBOL Name: 800-HIGH-ELAPSED
      * - lowElapsed800                  COBOL Name: 800-LOW-ELAPSED
      * - sf528ServiceDateTime           COBOL Name: SF528-SERVICE-DATE-TIME
      * - highServiceTime800             COBOL Name: 800-HIGH-SERVICE-TIME
      * - lowServiceTime800              COBOL Name: 800-LOW-SERVICE-TIME
      *
      * Output :  

      * - totMessCount400                COBOL Name: 400-TOT-MESS-COUNT
      * - successCount400                COBOL Name: 400-SUCCESS-COUNT
      * - errorCount400                  COBOL Name: 400-ERROR-COUNT
      * - sumElapsedTime800              COBOL Name: 800-SUM-ELAPSED-TIME
      * - highElapsed800                 COBOL Name: 800-HIGH-ELAPSED
      * - sf528ElapsedTime               COBOL Name: SF528-ELAPSED-TIME
      * - lowElapsed800                  COBOL Name: 800-LOW-ELAPSED
      * - highServiceTime800             COBOL Name: 800-HIGH-SERVICE-TIME
      * - sf528ServiceDateTime           COBOL Name: SF528-SERVICE-DATE-TIME
      * - lowServiceTime800              COBOL Name: 800-LOW-SERVICE-TIME
      *
      * @throws CFException
      */
      private void accumulateData() throws Exception {
			// Declare local variables used in the method
			char[] sf528ServiceStatus = null;
			char[] charC300 = null;
			char[] sf528ServiceDateTime = null;
			int sf528ElapsedTime = 0;
			int highElapsed800 = 0;
			int lowElapsed800 = 0;
			// End of variable declaration

      
// ******************************************************************
// *                2200-Accumulate-data                           *
// ******************************************************************
//  ADD 300-PLUS-1 TO 400-TOT-MESS-COUNT
          work.setTotMessCount400(work.getTotMessCount400()+(int) work.getPlus1300());
          sf528ServiceStatus = sf528ExtractZLogRec.getSf528ServiceStatus();
          charC300 = work.getCharC300();
//  IF SF528-SERVICE-STATUS EQUAL 300-CHAR-C
          if (		compareChars(sf528ServiceStatus,charC300) == 0 ) { 
//  ADD 300-PLUS-1 TO 400-SUCCESS-COUNT
              work.setSuccessCount400(work.getSuccessCount400()+(int) work.getPlus1300());
          }
  
//  ELSE
          else { 
//  ADD 300-PLUS-1 TO 400-ERROR-COUNT
              work.setErrorCount400(work.getErrorCount400()+(int) work.getPlus1300());
          }
//  ADD SF528-ELAPSED-TIME TO 800-SUM-ELAPSED-TIME
          work.setSumElapsedTime800(work.getSumElapsedTime800()+(int) sf528ExtractZLogRec.getSf528ElapsedTime());
          sf528ElapsedTime = sf528ExtractZLogRec.getSf528ElapsedTime();
          highElapsed800 = work.getHighElapsed800();
//  IF SF528-ELAPSED-TIME GREATER THAN 800-HIGH-ELAPSED
          if (	( sf528ElapsedTime > highElapsed800 )) { 
              // MOVE SF528-ELAPSED-TIME TO 800-HIGH-ELAPSED
              work.setHighElapsed800(sf528ExtractZLogRec.getSf528ElapsedTime());
          }
  
          sf528ElapsedTime = sf528ExtractZLogRec.getSf528ElapsedTime();
          lowElapsed800 = work.getLowElapsed800();
//  IF SF528-ELAPSED-TIME LESS THAN 800-LOW-ELAPSED
          if (	( sf528ElapsedTime < lowElapsed800 )) { 
              // MOVE SF528-ELAPSED-TIME TO 800-LOW-ELAPSED
              work.setLowElapsed800(sf528ExtractZLogRec.getSf528ElapsedTime());
          }
  
          sf528ServiceDateTime = sf528ExtractZLogRec.getSf528ServiceDateTime();
//  IF SF528-SERVICE-DATE-TIME GREATER THAN 800-HIGH-SERVICE-TIME
          if (		compareChars(sf528ServiceDateTime,highServiceTime800) > 0 ) { 
//  MOVE SF528-SERVICE-DATE-TIME TO 800-HIGH-SERVICE-TIME
              highServiceTime800.setString(sf528ExtractZLogRec.getSf528ServiceDateTime());
          }
  
//  ELSE
          else { 
              sf528ServiceDateTime = sf528ExtractZLogRec.getSf528ServiceDateTime();
//  IF SF528-SERVICE-DATE-TIME LESS THAN 800-LOW-SERVICE-TIME
              if (		compareChars(sf528ServiceDateTime,lowServiceTime800) < 0 ) { 
//  MOVE SF528-SERVICE-DATE-TIME TO 800-LOW-SERVICE-TIME
                  lowServiceTime800.setString(sf528ExtractZLogRec.getSf528ServiceDateTime());
              }
  
          }
      
      }
      /**
      * displayServiceDate 
      *   This method is derived from 
  *   COBOL Paragraph - 2300-DISPLAY-SERVICE-DATE COBOL Cyclomatic complexity - 1
      * Input  :  

      * - lserviceDd800                  COBOL Name: 800-LSERVICE-DD
      * - lserviceMm800                  COBOL Name: 800-LSERVICE-MM
      * - runMonth800                    COBOL Name: 800-RUN-MONTH
      * - lserviceCc800                  COBOL Name: 800-LSERVICE-CC
      * - lserviceYy800                  COBOL Name: 800-LSERVICE-YY
      * - lserviceHh800                  COBOL Name: 800-LSERVICE-HH
      * - lserviceMins800                COBOL Name: 800-LSERVICE-MINS
      * - lserviceSec800                 COBOL Name: 800-LSERVICE-SEC
      * - hserviceDd800                  COBOL Name: 800-HSERVICE-DD
      * - hserviceMm800                  COBOL Name: 800-HSERVICE-MM
      * - hserviceCc800                  COBOL Name: 800-HSERVICE-CC
      * - hserviceYy800                  COBOL Name: 800-HSERVICE-YY
      * - hserviceHh800                  COBOL Name: 800-HSERVICE-HH
      * - hserviceMins800                COBOL Name: 800-HSERVICE-MINS
      * - hserviceSec800                 COBOL Name: 800-HSERVICE-SEC
      * - sys201AsaServerRec             COBOL Name: SYS201-ASA-SERVER-REC
      * - lineCount400                   COBOL Name: 400-LINE-COUNT
      * - plus4300                       COBOL Name: 300-PLUS-4
      *
      * Output :  

      * - lserviceDate205                COBOL Name: 205-LSERVICE-DATE
      * - lserviceDd800                  COBOL Name: 800-LSERVICE-DD
      * - mnthMmNum100                   COBOL Name: 100-MNTH-MM-NUM
      * - lserviceMm800                  COBOL Name: 800-LSERVICE-MM
      * - lserviceMonth205               COBOL Name: 205-LSERVICE-MONTH
      * - runMonth800                    COBOL Name: 800-RUN-MONTH
      * - lserviceCentury205             COBOL Name: 205-LSERVICE-CENTURY
      * - lserviceCc800                  COBOL Name: 800-LSERVICE-CC
      * - lserviceYear205                COBOL Name: 205-LSERVICE-YEAR
      * - lserviceYy800                  COBOL Name: 800-LSERVICE-YY
      * - lserviceHh205                  COBOL Name: 205-LSERVICE-HH
      * - lserviceHh800                  COBOL Name: 800-LSERVICE-HH
      * - lserviceMins205                COBOL Name: 205-LSERVICE-MINS
      * - lserviceMins800                COBOL Name: 800-LSERVICE-MINS
      * - lserviceSec205                 COBOL Name: 205-LSERVICE-SEC
      * - lserviceSec800                 COBOL Name: 800-LSERVICE-SEC
      * - hserviceDate205                COBOL Name: 205-HSERVICE-DATE
      * - hserviceDd800                  COBOL Name: 800-HSERVICE-DD
      * - hserviceMm800                  COBOL Name: 800-HSERVICE-MM
      * - hserviceMonth205               COBOL Name: 205-HSERVICE-MONTH
      * - hserviceCentury205             COBOL Name: 205-HSERVICE-CENTURY
      * - hserviceCc800                  COBOL Name: 800-HSERVICE-CC
      * - hserviceYear205                COBOL Name: 205-HSERVICE-YEAR
      * - hserviceYy800                  COBOL Name: 800-HSERVICE-YY
      * - hserviceHh205                  COBOL Name: 205-HSERVICE-HH
      * - hserviceHh800                  COBOL Name: 800-HSERVICE-HH
      * - hserviceMins205                COBOL Name: 205-HSERVICE-MINS
      * - hserviceMins800                COBOL Name: 800-HSERVICE-MINS
      * - hserviceSec205                 COBOL Name: 205-HSERVICE-SEC
      * - hserviceSec800                 COBOL Name: 800-HSERVICE-SEC
      * - lineCount400                   COBOL Name: 400-LINE-COUNT
      *
      * @throws CFException
      */
      private void displayServiceDate() throws Exception {
			// Declare local variables used in the method
			LserviceDate800 lserviceDate800 = lowServiceTime800.getLserviceDate800();
			Detail1205 detail1205 = detailData3205.getDetail1205();
			LserviceTime800 lserviceTime800 = lowServiceTime800.getLserviceTime800();
			HserviceDate800 hserviceDate800 = highServiceTime800.getHserviceDate800();
			HserviceTime800 hserviceTime800 = highServiceTime800.getHserviceTime800();
			// End of variable declaration

      
// ******************************************************************
// *       2 3 0 0 - D i s p l a y - s e r v i c e - d a t e .      *
// ******************************************************************
//  MOVE 800-LSERVICE-DD TO 205-LSERVICE-DATE
          detail1205.setLserviceDate205(lserviceDate800.getLserviceDd800());
  
//  MOVE 800-LSERVICE-MM TO 100-MNTH-MM-NUM
          work.setMnthMmNum100(lserviceDate800.getLserviceMm800());
  
//  PERFORM 8500-BUILD-MONTH
          buildMonth();/*8500-BUILD-MONTH*/
//  MOVE 800-RUN-MONTH TO 205-LSERVICE-MONTH
          detail1205.setLserviceMonth205(work.getRunMonth800());
  
//  MOVE 800-LSERVICE-CC TO 205-LSERVICE-CENTURY
          detail1205.setLserviceCentury205(lserviceDate800.getLserviceCc800());
  
//  MOVE 800-LSERVICE-YY TO 205-LSERVICE-YEAR
          detail1205.setLserviceYear205(lserviceDate800.getLserviceYy800());
  
//  MOVE 800-LSERVICE-HH TO 205-LSERVICE-HH
          detail1205.setLserviceHh205(lserviceTime800.getLserviceHh800());
  
//  MOVE 800-LSERVICE-MINS TO 205-LSERVICE-MINS
          detail1205.setLserviceMins205(lserviceTime800.getLserviceMins800());
  
//  MOVE 800-LSERVICE-SEC TO 205-LSERVICE-SEC
          detail1205.setLserviceSec205(lserviceTime800.getLserviceSec800());
  
//  MOVE 800-HSERVICE-DD TO 205-HSERVICE-DATE
          detail1205.setHserviceDate205(hserviceDate800.getHserviceDd800());
  
//  MOVE 800-HSERVICE-MM TO 100-MNTH-MM-NUM
          work.setMnthMmNum100(hserviceDate800.getHserviceMm800());
  
//  PERFORM 8500-BUILD-MONTH
          buildMonth();/*8500-BUILD-MONTH*/
//  MOVE 800-RUN-MONTH TO 205-HSERVICE-MONTH
          detail1205.setHserviceMonth205(work.getRunMonth800());
  
//  MOVE 800-HSERVICE-CC TO 205-HSERVICE-CENTURY
          detail1205.setHserviceCentury205(hserviceDate800.getHserviceCc800());
  
//  MOVE 800-HSERVICE-YY TO 205-HSERVICE-YEAR
          detail1205.setHserviceYear205(hserviceDate800.getHserviceYy800());
  
//  MOVE 800-HSERVICE-HH TO 205-HSERVICE-HH
          detail1205.setHserviceHh205(hserviceTime800.getHserviceHh800());
  
//  MOVE 800-HSERVICE-MINS TO 205-HSERVICE-MINS
          detail1205.setHserviceMins205(hserviceTime800.getHserviceMins800());
  
//  MOVE 800-HSERVICE-SEC TO 205-HSERVICE-SEC
          detail1205.setHserviceSec205(hserviceTime800.getHserviceSec800());
  
//  WRITE SYS201-ASA-SERVER-REC FROM 205-DETAIL-DATA3 AFTER ADVANCING 300-NUM-4 LINES
          sys201AsaServerReport.writeAfter(detailData3205.toCharArray(),work.getNum4300());
          sys201AsaServerRec.setString(CONSTANTS.LOW_VALUE_215751987);
//  ADD 300-PLUS-4 TO 400-LINE-COUNT
          work.setLineCount400(work.getLineCount400()+(int) work.getPlus4300());
      
      }
      /**
      * readSys001 
      *   This method is derived from 
  *   COBOL Paragraph - 8000-READ-SYS001 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - readCount400                   COBOL Name: 400-READ-COUNT
      * - plus1300                       COBOL Name: 300-PLUS-1
      *
      * Output :  

      * - group1                         COBOL Name: FILLER
      * - extractZLogEofSw100            COBOL Name: 100-EXTRACT-Z-LOG-EOF-SW
      * - readCount400                   COBOL Name: 400-READ-COUNT
      *
      * @throws CFException
      */
      private void readSys001() throws Exception {
      
// ******************************************************************
// *           8 0 0 0 - R e a d - s y s 0 0 1                      *
// ******************************************************************
          // READ SYS001-EXTRACT-Z-LOG-FILE INTO SF528-EXTRACT-Z-LOG-REC
          sys001ExtractZLogFile.read();
          if (!sys001ExtractZLogFile.hasEnded()) {
            sf528ExtractZLogRec.setString(sys001ExtractZLogFile.getRecord());
            group1.setString(sys001ExtractZLogFile.getRecord());
          }
//  AT END
          if (sys001ExtractZLogFile.hasEnded()) {  
//  SET 88-100-Z-LOG-EOF TO TRUE
              work.setZLogEof88100True(); 
              
            }
//  NOT AT END
          else  {
//  ADD 300-PLUS-1 TO 400-READ-COUNT
              work.setReadCount400(work.getReadCount400()+(int) work.getPlus1300());
            }
      
      }
      /**
      * backupRecordData 
      *   This method is derived from 
  *   COBOL Paragraph - 8100-BACKUP-RECORD-DATA COBOL Cyclomatic complexity - 1
      * Input  :  

      * - sf528ServerId                  COBOL Name: SF528-SERVER-ID
      * - sf528LogType                   COBOL Name: SF528-LOG-TYPE
      * - sf528ServiceId                 COBOL Name: SF528-SERVICE-ID
      *
      * Output :  

      * - prevServerId800                COBOL Name: 800-PREV-SERVER-ID
      * - sf528ServerId                  COBOL Name: SF528-SERVER-ID
      * - prevLogType800                 COBOL Name: 800-PREV-LOG-TYPE
      * - sf528LogType                   COBOL Name: SF528-LOG-TYPE
      * - prevServiceId800               COBOL Name: 800-PREV-SERVICE-ID
      * - sf528ServiceId                 COBOL Name: SF528-SERVICE-ID
      *
      * @throws CFException
      */
      private void backupRecordData() throws Exception {
      
// ******************************************************************
// *           8100-Backup-record-data.                             *
// ******************************************************************
          // MOVE SF528-SERVER-ID TO 800-PREV-SERVER-ID
          work.setPrevServerId800(sf528ExtractZLogRec.getSf528ServerId());
          // MOVE SF528-LOG-TYPE TO 800-PREV-LOG-TYPE
          work.setPrevLogType800(sf528ExtractZLogRec.getSf528LogType());
          // MOVE SF528-SERVICE-ID TO 800-PREV-SERVICE-ID
          work.setPrevServiceId800(sf528ExtractZLogRec.getSf528ServiceId());
      
      }
      /**
      * initializeValues 
      *   This method is derived from 
  *   COBOL Paragraph - 8200-INITIALIZE-VALUES COBOL Cyclomatic complexity - 1
      * Input  :  

      * - num0300                        COBOL Name: 300-NUM-0
      * - sf528ElapsedTime               COBOL Name: SF528-ELAPSED-TIME
      *
      * Output :  

      * - totMessCount400                COBOL Name: 400-TOT-MESS-COUNT
      * - num0300                        COBOL Name: 300-NUM-0
      * - successCount400                COBOL Name: 400-SUCCESS-COUNT
      * - errorCount400                  COBOL Name: 400-ERROR-COUNT
      * - sumElapsedTime800              COBOL Name: 800-SUM-ELAPSED-TIME
      * - highElapsed800                 COBOL Name: 800-HIGH-ELAPSED
      * - sf528ElapsedTime               COBOL Name: SF528-ELAPSED-TIME
      * - lowElapsed800                  COBOL Name: 800-LOW-ELAPSED
      *
      * @throws CFException
      */
      private void initializeValues() throws Exception {
      
// ******************************************************************
// *           8200-Initialize-values                               *
// ******************************************************************
//  MOVE 300-NUM-0 TO 400-TOT-MESS-COUNT
          work.setTotMessCount400( work.getNum0300());
//  MOVE 300-NUM-0 TO 400-SUCCESS-COUNT
          work.setSuccessCount400( work.getNum0300());
//  MOVE 300-NUM-0 TO 400-ERROR-COUNT
          work.setErrorCount400( work.getNum0300());
//  MOVE 300-NUM-0 TO 800-SUM-ELAPSED-TIME
          work.setSumElapsedTime800((int) work.getNum0300());
          // MOVE SF528-ELAPSED-TIME TO 800-HIGH-ELAPSED
          work.setHighElapsed800(sf528ExtractZLogRec.getSf528ElapsedTime());
          // MOVE SF528-ELAPSED-TIME TO 800-LOW-ELAPSED
          work.setLowElapsed800(sf528ExtractZLogRec.getSf528ElapsedTime());
      
      }
      /**
      * generateDtl 
      *   This method is derived from 
  *   COBOL Paragraph - 8300-GENERATE-DTL COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void generateDtl() throws Exception {
      
// ******************************************************************
// *               8300-Generate-dtl                                *
// ******************************************************************
//  PERFORM 8310-CALCULATE-REP-DATA
          calculateRepData();/*8310-CALCULATE-REP-DATA*/
//  PERFORM 8320-CHECK-LINE-COUNT
          checkLineCount();/*8320-CHECK-LINE-COUNT*/
//  PERFORM 8330-MOVE-REPORT-DATA
          moveReportData();/*8330-MOVE-REPORT-DATA*/
//  PERFORM 8350-BUILD-SERVICE-ID-DESC
          buildServiceIdDesc();/*8350-BUILD-SERVICE-ID-DESC*/
//  PERFORM 8340-GENERATE-REPORT
          generateReport();/*8340-GENERATE-REPORT*/
          ;
      
      }
      /**
      * calculateRepData 
      *   This method is derived from 
  *   COBOL Paragraph - 8310-CALCULATE-REP-DATA COBOL Cyclomatic complexity - 1
      * Input  :  

      * - successCount400                COBOL Name: 400-SUCCESS-COUNT
      * - totMessCount400                COBOL Name: 400-TOT-MESS-COUNT
      * - num100300                      COBOL Name: 300-NUM-100
      * - errorCount400                  COBOL Name: 400-ERROR-COUNT
      * - sumElapsedTime800              COBOL Name: 800-SUM-ELAPSED-TIME
      *
      * Output :  

      * - successPercent400              COBOL Name: 400-SUCCESS-PERCENT
      * - errorPercent400                COBOL Name: 400-ERROR-PERCENT
      * - avgElapsedN800                 COBOL Name: 800-AVG-ELAPSED-N
      * - avgElapsed800                  COBOL Name: 800-AVG-ELAPSED
      * - successPercent800              COBOL Name: 800-SUCCESS-PERCENT
      * - errorPercent800                COBOL Name: 800-ERROR-PERCENT
      *
      * @throws CFException
      */
      private void calculateRepData() throws Exception {
      
// ******************************************************************
// *               8310-Calculate-rep-data                          *
// ******************************************************************
          work.setSuccessPercent400(BigDecimal.valueOf(work.getSuccessCount400()).divide(BigDecimal.valueOf(work.getTotMessCount400()),18,RoundingMode.DOWN).setScale(3,BigDecimal.ROUND_DOWN).multiply(BigDecimal.valueOf(work.getNum100300())).setScale(2,RoundingMode.HALF_UP));
          if(work.getSuccessPercent400().signum() < 0 )  work.setSuccessPercent400(work.getSuccessPercent400().negate());
          work.setErrorPercent400(BigDecimal.valueOf(work.getErrorCount400()).divide(BigDecimal.valueOf(work.getTotMessCount400()),18,RoundingMode.DOWN).setScale(3,BigDecimal.ROUND_DOWN).multiply(BigDecimal.valueOf(work.getNum100300())).setScale(2,RoundingMode.HALF_UP));
          if(work.getErrorPercent400().signum() < 0 )  work.setErrorPercent400(work.getErrorPercent400().negate());
          work.setAvgElapsedN800(BigDecimal.valueOf(work.getSumElapsedTime800()).divide(BigDecimal.valueOf(work.getTotMessCount400()),18,RoundingMode.DOWN).setScale(3,BigDecimal.ROUND_DOWN).setScale(2,RoundingMode.HALF_UP));
          if(work.getAvgElapsedN800().signum() < 0 )  work.setAvgElapsedN800(work.getAvgElapsedN800().negate());
          // MOVE 800-AVG-ELAPSED-N TO 800-AVG-ELAPSED
          //  FORMAT_1949449721 = "ZZZ,ZZZ,ZZ9.99"
          work.setAvgElapsed800(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1949449721,work.getAvgElapsedN800().toPlainString().toCharArray()));
          // MOVE 400-SUCCESS-PERCENT TO 800-SUCCESS-PERCENT
          //  FORMAT_27653163 = "ZZ9.99"
          work.setSuccessPercent800(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_27653163,work.getSuccessPercent400().toPlainString().toCharArray()));
          // MOVE 400-ERROR-PERCENT TO 800-ERROR-PERCENT
          //  FORMAT_27653163 = "ZZ9.99"
          work.setErrorPercent800(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_27653163,work.getErrorPercent400().toPlainString().toCharArray()));
      
      }
      /**
      * checkLineCount 
      *   This method is derived from 
  *   COBOL Paragraph - 8320-CHECK-LINE-COUNT COBOL Cyclomatic complexity - 2
      * Input  :  

      * - lineCount400                   COBOL Name: 400-LINE-COUNT
      * - maxLinesPerPage300             COBOL Name: 300-MAX-LINES-PER-PAGE
      * - num0300                        COBOL Name: 300-NUM-0
      * - pageCount400                   COBOL Name: 400-PAGE-COUNT
      * - plus1300                       COBOL Name: 300-PLUS-1
      * - sf528ServerId                  COBOL Name: SF528-SERVER-ID
      *
      * Output :  

      * - lineCount400                   COBOL Name: 400-LINE-COUNT
      * - num0300                        COBOL Name: 300-NUM-0
      * - pageCount400                   COBOL Name: 400-PAGE-COUNT
      * - serverId202                    COBOL Name: 202-SERVER-ID
      * - sf528ServerId                  COBOL Name: SF528-SERVER-ID
      * - pageCount202                   COBOL Name: 202-PAGE-COUNT
      *
      * @throws CFException
      */
      private void checkLineCount() throws Exception {
			// Declare local variables used in the method
			long lineCount400 = 0;
			short maxLinesPerPage300 = 0;
			// End of variable declaration

      
// ******************************************************************
// *                 8320-Check-line-count                          *
// ******************************************************************
//  IF 400-LINE-COUNT GREATER THAN 300-MAX-LINES-PER-PAGE
          if (	( work.getLineCount400() > work.getMaxLinesPerPage300() ) ) { 
//  MOVE 300-NUM-0 TO 400-LINE-COUNT
              work.setLineCount400( work.getNum0300());
//  ADD 300-PLUS-1 TO 400-PAGE-COUNT
              work.setPageCount400(work.getPageCount400()+(int) work.getPlus1300());
//  MOVE SF528-SERVER-ID TO 202-SERVER-ID
              hdrLine2202.setServerId202(sf528ExtractZLogRec.getSf528ServerId());
//  MOVE 400-PAGE-COUNT TO 202-PAGE-COUNT
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
              hdrLine2202.setPageCount202(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(work.getPageCount400()).toCharArray()));
//  PERFORM 8400-WRITE-HDR
              writeHdr();/*8400-WRITE-HDR*/
          }
      
      }
      /**
      * moveReportData 
      *   This method is derived from 
  *   COBOL Paragraph - 8330-MOVE-REPORT-DATA COBOL Cyclomatic complexity - 1
      * Input  :  

      * - successPercent800              COBOL Name: 800-SUCCESS-PERCENT
      * - avgElapsed800                  COBOL Name: 800-AVG-ELAPSED
      * - errorPercent800                COBOL Name: 800-ERROR-PERCENT
      * - prevServiceId800               COBOL Name: 800-PREV-SERVICE-ID
      * - totMessCount400                COBOL Name: 400-TOT-MESS-COUNT
      * - successCount400                COBOL Name: 400-SUCCESS-COUNT
      * - errorCount400                  COBOL Name: 400-ERROR-COUNT
      * - lowElapsed800                  COBOL Name: 800-LOW-ELAPSED
      * - highElapsed800                 COBOL Name: 800-HIGH-ELAPSED
      *
      * Output :  

      * - successfulPercnt205            COBOL Name: 205-SUCCESSFUL-PERCNT
      * - successPercent800              COBOL Name: 800-SUCCESS-PERCENT
      * - avgElapsed205                  COBOL Name: 205-AVG-ELAPSED
      * - avgElapsed800                  COBOL Name: 800-AVG-ELAPSED
      * - errorPercent205                COBOL Name: 205-ERROR-PERCENT
      * - errorPercent800                COBOL Name: 800-ERROR-PERCENT
      * - service205                     COBOL Name: 205-SERVICE
      * - prevServiceId800               COBOL Name: 800-PREV-SERVICE-ID
      * - totMsgCount205                 COBOL Name: 205-TOT-MSG-COUNT
      * - totMessCount400                COBOL Name: 400-TOT-MESS-COUNT
      * - successfulCount205             COBOL Name: 205-SUCCESSFUL-COUNT
      * - successCount400                COBOL Name: 400-SUCCESS-COUNT
      * - errorCount205                  COBOL Name: 205-ERROR-COUNT
      * - errorCount400                  COBOL Name: 400-ERROR-COUNT
      * - lowElapsed205                  COBOL Name: 205-LOW-ELAPSED
      * - lowElapsed800                  COBOL Name: 800-LOW-ELAPSED
      * - highElapsed205                 COBOL Name: 205-HIGH-ELAPSED
      * - highElapsed800                 COBOL Name: 800-HIGH-ELAPSED
      *
      * @throws CFException
      */
      private void moveReportData() throws Exception {
      
// ******************************************************************
// *                 8330-Move-report-data                          *
// ******************************************************************
          // MOVE 800-SUCCESS-PERCENT TO 205-SUCCESSFUL-PERCNT
          dtlLine1205.setSuccessfulPercnt205(work.getSuccessPercent800());
          // MOVE 800-AVG-ELAPSED TO 205-AVG-ELAPSED
          dtlLine1205.setAvgElapsed205(work.getAvgElapsed800());
          // MOVE 800-ERROR-PERCENT TO 205-ERROR-PERCENT
          dtlLine1205.setErrorPercent205(work.getErrorPercent800());
//  MOVE 800-PREV-SERVICE-ID TO 205-SERVICE
          dtlLine1205.setService205(work.getPrevServiceId800());
//  MOVE 400-TOT-MESS-COUNT TO 205-TOT-MSG-COUNT
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          dtlLine1205.setTotMsgCount205(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(work.getTotMessCount400()).toCharArray()));
//  MOVE 400-SUCCESS-COUNT TO 205-SUCCESSFUL-COUNT
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          dtlLine1205.setSuccessfulCount205(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(work.getSuccessCount400()).toCharArray()));
//  MOVE 400-ERROR-COUNT TO 205-ERROR-COUNT
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          dtlLine1205.setErrorCount205(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(work.getErrorCount400()).toCharArray()));
//  MOVE 800-LOW-ELAPSED TO 205-LOW-ELAPSED
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          dtlLine1205.setLowElapsed205(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(work.getLowElapsed800()).toCharArray()));
//  MOVE 800-HIGH-ELAPSED TO 205-HIGH-ELAPSED
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          dtlLine1205.setHighElapsed205(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(work.getHighElapsed800()).toCharArray()));
      
      }
      /**
      * generateReport 
      *   This method is derived from 
  *   COBOL Paragraph - 8340-GENERATE-REPORT COBOL Cyclomatic complexity - 1
      * Input  :  

      * - sys201AsaServerRec             COBOL Name: SYS201-ASA-SERVER-REC
      * - lineCount400                   COBOL Name: 400-LINE-COUNT
      * - plus4300                       COBOL Name: 300-PLUS-4
      * - plus1300                       COBOL Name: 300-PLUS-1
      * - writeCount400                  COBOL Name: 400-WRITE-COUNT
      *
      * Output :  

      * - lineCount400                   COBOL Name: 400-LINE-COUNT
      * - writeCount400                  COBOL Name: 400-WRITE-COUNT
      *
      * @throws CFException
      */
      private void generateReport() throws Exception {
      
// ******************************************************************
// *                 8340-Generate-report                           *
// ******************************************************************
//  WRITE SYS201-ASA-SERVER-REC FROM 205-DTL-LINE-1 AFTER ADVANCING 300-NUM-4 LINES
          sys201AsaServerReport.writeAfter(dtlLine1205.toCharArray(),work.getNum4300());
          sys201AsaServerRec.setString(CONSTANTS.LOW_VALUE_215751987);
//  ADD 300-PLUS-4 TO 400-LINE-COUNT
          work.setLineCount400(work.getLineCount400()+(int) work.getPlus4300());
//  WRITE SYS201-ASA-SERVER-REC FROM 205-DTL-LINE-2 AFTER ADVANCING 300-NUM-1 LINES
          sys201AsaServerReport.writeAfter(dtlLine2205.toCharArray(),work.getNum1300());
          sys201AsaServerRec.setString(CONSTANTS.LOW_VALUE_215751987);
//  ADD 300-PLUS-1 TO 400-LINE-COUNT
          work.setLineCount400(work.getLineCount400()+(int) work.getPlus1300());
//  ADD 300-PLUS-1 TO 400-WRITE-COUNT
          work.setWriteCount400(work.getWriteCount400()+(int) work.getPlus1300());
      
      }
      /**
      * buildServiceIdDesc 
      *   This method is derived from 
  *   COBOL Paragraph - 8350-BUILD-SERVICE-ID-DESC COBOL Cyclomatic complexity - 2
      * Input  :  

      * - num1300                        COBOL Name: 300-NUM-1
      * - sf535ZlogServiceEntry          COBOL Name: SF535-ZLOG-SERVICE-ENTRY
      * - litUnknwn300                   COBOL Name: 300-LIT-UNKNWN
      * - sf535ZlogService               COBOL Name: SF535-ZLOG-SERVICE
      * - prevServiceId800               COBOL Name: 800-PREV-SERVICE-ID
      * - sf535ZservDesc                 COBOL Name: SF535-ZSERV-DESC
      *
      * Output :  

      * - sf535X                         COBOL Name: SF535-X
      * - serviceName205                 COBOL Name: 205-SERVICE-NAME
      * - litUnknwn300                   COBOL Name: 300-LIT-UNKNWN
      * - sf535ZservDesc                 COBOL Name: SF535-ZSERV-DESC
      *
      * @throws CFException
      */
      private void buildServiceIdDesc() throws Exception {
			// Declare local variables used in the method
			boolean keepSearching = true;
			int[] searchIndexes = null;
			int searchLowPoint = 0;
			int searchMidPoint = 0;
			int searchHighPoint = 0;
			int searchCompare = 0;
			char[] prevServiceId800 = null;
			// End of variable declaration

      
// ****************************************************************
// * 8 3 5 0 - B u i l d - s e r v i c e - i d - d e s c .        *
// ****************************************************************
//  SET SF535-X TO 300-NUM-1
          sf535X = work.getNum1300(); 
          
          prevServiceId800 = work.getPrevServiceId800();
//  SEARCH ALL SF535-ZLOG-SERVICE-ENTRY
          // Binary Search through sf535ZlogServicesGroup.getSf535ZlogServiceTable().sf535ZlogServiceEntry
          searchLowPoint = 0; //prevLowValue
          searchHighPoint = sf535ZlogServicesGroup.getSf535ZlogServiceTable().sf535ZlogServiceEntrySize(); //prevHighValue
          searchMidPoint = searchHighPoint / 2; //starting at mid point
          searchIndexes = new int[]{searchLowPoint,searchMidPoint,searchHighPoint};
          keepSearching = true;
          while (keepSearching) {
          // compare logic below
             searchCompare = compareAscending(sf535ZlogServicesGroup.getSf535ZlogServiceTable().getSf535ZlogServiceEntry(searchMidPoint).getSf535ZlogService(),prevServiceId800);
          // end of compare logic
          	if (searchCompare == 0 ) { // if search found
          	      keepSearching = false;
          	     sf535X = searchMidPoint	 + 1;
//  MOVE SF535-ZSERV-DESC ( SF535-X ) TO 205-SERVICE-NAME
              dtlLine2205.setServiceName205(sf535ZlogServicesGroup.getSf535ZlogServiceTable().getSf535ZlogServiceEntry(sf535X - 1).getSf535ZservDesc());
          	} else  {
          		adjustSearchIndex(searchCompare,searchIndexes);
          		searchLowPoint  = searchIndexes[0];
           		searchMidPoint  = searchIndexes[1];
           		searchHighPoint = searchIndexes[2];
           		if (searchMidPoint == -1) { // search exhausted
           		    keepSearching = false; 
//  MOVE 300-LIT-UNKNWN TO 205-SERVICE-NAME
              dtlLine2205.setServiceName205(pad(55,work.getLitUnknwn300(),SPACE_CHAR,RIGHT_PAD));
           		}
          	}
          }
  
      
      }
      /**
      * writeHdr 
      *   This method is derived from 
  *   COBOL Paragraph - 8400-WRITE-HDR COBOL Cyclomatic complexity - 1
      * Input  :  

      * - sys201AsaServerRec             COBOL Name: SYS201-ASA-SERVER-REC
      * - plus7300                       COBOL Name: 300-PLUS-7
      *
      * Output :  

      * - lineCount400                   COBOL Name: 400-LINE-COUNT
      * - plus7300                       COBOL Name: 300-PLUS-7
      *
      * @throws CFException
      */
      private void writeHdr() throws Exception {
      
// ******************************************************************
// *            8400-Write-hdr                                      *
// ******************************************************************
//  WRITE SYS201-ASA-SERVER-REC FROM 201-HDR-LINE-1 AFTER ADVANCING PAGE
          sys201AsaServerReport.writeWithPageBreakAfter(hdrLine1201.toCharArray());
          sys201AsaServerRec.setString(CONSTANTS.LOW_VALUE_215751987);
//  WRITE SYS201-ASA-SERVER-REC FROM 202-HDR-LINE-2 AFTER ADVANCING 300-NUM-2 LINE
          sys201AsaServerReport.writeAfter(hdrLine2202.toCharArray(),work.getNum2300());
          sys201AsaServerRec.setString(CONSTANTS.LOW_VALUE_215751987);
//  WRITE SYS201-ASA-SERVER-REC FROM 203-HDR-LINE-3 AFTER ADVANCING 300-NUM-4 LINES
          sys201AsaServerReport.writeAfter(work.getHdrLine3203(),work.getNum4300());
          sys201AsaServerRec.setString(CONSTANTS.LOW_VALUE_215751987);
//  WRITE SYS201-ASA-SERVER-REC FROM 204-HDR-LINE-4 AFTER ADVANCING 300-NUM-1 LINE
          sys201AsaServerReport.writeAfter(work.getHdrLine4204(),work.getNum1300());
          sys201AsaServerRec.setString(CONSTANTS.LOW_VALUE_215751987);
//  MOVE 300-PLUS-7 TO 400-LINE-COUNT
          work.setLineCount400( work.getPlus7300());
      
      }
      /**
      * buildMonth 
      *   This method is derived from 
  *   COBOL Paragraph - 8500-BUILD-MONTH COBOL Cyclomatic complexity - 14
      * Input  :  

      * - mnthMmNum100                   COBOL Name: 100-MNTH-MM-NUM
      * - monthJan300                    COBOL Name: 300-MONTH-JAN
      * - monthFeb300                    COBOL Name: 300-MONTH-FEB
      * - monthMar300                    COBOL Name: 300-MONTH-MAR
      * - monthApr300                    COBOL Name: 300-MONTH-APR
      * - monthMay300                    COBOL Name: 300-MONTH-MAY
      * - monthJun300                    COBOL Name: 300-MONTH-JUN
      * - monthJul300                    COBOL Name: 300-MONTH-JUL
      * - monthAug300                    COBOL Name: 300-MONTH-AUG
      * - monthSep300                    COBOL Name: 300-MONTH-SEP
      * - monthOct300                    COBOL Name: 300-MONTH-OCT
      * - monthNov300                    COBOL Name: 300-MONTH-NOV
      * - monthDec300                    COBOL Name: 300-MONTH-DEC
      *
      * Output :  

      * - runMonth800                    COBOL Name: 800-RUN-MONTH
      * - monthJan300                    COBOL Name: 300-MONTH-JAN
      * - monthFeb300                    COBOL Name: 300-MONTH-FEB
      * - monthMar300                    COBOL Name: 300-MONTH-MAR
      * - monthApr300                    COBOL Name: 300-MONTH-APR
      * - monthMay300                    COBOL Name: 300-MONTH-MAY
      * - monthJun300                    COBOL Name: 300-MONTH-JUN
      * - monthJul300                    COBOL Name: 300-MONTH-JUL
      * - monthAug300                    COBOL Name: 300-MONTH-AUG
      * - monthSep300                    COBOL Name: 300-MONTH-SEP
      * - monthOct300                    COBOL Name: 300-MONTH-OCT
      * - monthNov300                    COBOL Name: 300-MONTH-NOV
      * - monthDec300                    COBOL Name: 300-MONTH-DEC
      *
      * @throws CFException
      */
      private void buildMonth() throws Exception {
      
// ******************************************************************
// *           8 5 0 0 - B u i l d - m o n t h .                    *
// ******************************************************************
//  EVALUATE TRUE
          if  ( work.isMnthMmNumJan88100()  ) { 
              // MOVE 300-MONTH-JAN TO 800-RUN-MONTH
              work.setRunMonth800(work.getMonthJan300());
          }
          else if  ( work.isMnthMmNumFeb88100()  ) { 
              // MOVE 300-MONTH-FEB TO 800-RUN-MONTH
              work.setRunMonth800(work.getMonthFeb300());
          }
          else if  ( work.isMnthMmNumMar88100()  ) { 
              // MOVE 300-MONTH-MAR TO 800-RUN-MONTH
              work.setRunMonth800(work.getMonthMar300());
          }
          else if  ( work.isMnthMmNumApr88100()  ) { 
              // MOVE 300-MONTH-APR TO 800-RUN-MONTH
              work.setRunMonth800(work.getMonthApr300());
          }
          else if  ( work.isMnthMmNumMay88100()  ) { 
              // MOVE 300-MONTH-MAY TO 800-RUN-MONTH
              work.setRunMonth800(work.getMonthMay300());
          }
          else if  ( work.isMnthMmNumJun88100()  ) { 
              // MOVE 300-MONTH-JUN TO 800-RUN-MONTH
              work.setRunMonth800(work.getMonthJun300());
          }
          else if  ( work.isMnthMmNumJul88100()  ) { 
              // MOVE 300-MONTH-JUL TO 800-RUN-MONTH
              work.setRunMonth800(work.getMonthJul300());
          }
          else if  ( work.isMnthMmNumAug88100()  ) { 
              // MOVE 300-MONTH-AUG TO 800-RUN-MONTH
              work.setRunMonth800(work.getMonthAug300());
          }
          else if  ( work.isMnthMmNumSep88100()  ) { 
              // MOVE 300-MONTH-SEP TO 800-RUN-MONTH
              work.setRunMonth800(work.getMonthSep300());
          }
          else if  ( work.isMnthMmNumOct88100()  ) { 
              // MOVE 300-MONTH-OCT TO 800-RUN-MONTH
              work.setRunMonth800(work.getMonthOct300());
          }
          else if  ( work.isMnthMmNumNov88100()  ) { 
              // MOVE 300-MONTH-NOV TO 800-RUN-MONTH
              work.setRunMonth800(work.getMonthNov300());
          }
          else if  ( work.isMnthMmNumDec88100()  ) { 
              // MOVE 300-MONTH-DEC TO 800-RUN-MONTH
              work.setRunMonth800(work.getMonthDec300());
          }
          else   { 
              ;
          }
      
      }
      /**
      * terminateProgram 
      *   This method is derived from 
  *   COBOL Paragraph - 9000-TERMINATE-PROGRAM COBOL Cyclomatic complexity - 1
      * Input  :  

      * - readCount400                   COBOL Name: 400-READ-COUNT
      * - writeCount400                  COBOL Name: 400-WRITE-COUNT
      * - returnCode800                  COBOL Name: 800-RETURN-CODE
      * - totReadCountMsg600             COBOL Name: 600-TOT-READ-COUNT-MSG
      * - totWriteCountMsg600            COBOL Name: 600-TOT-WRITE-COUNT-MSG
      * - eojMessage6009999              COBOL Name: 600-9999-EOJ-MESSAGE
      * - eojMessage6009500              COBOL Name: 600-9500-EOJ-MESSAGE
      *
      * Output :  

      * - totReadCount600                COBOL Name: 600-TOT-READ-COUNT
      * - readCount400                   COBOL Name: 400-READ-COUNT
      * - writeCount600                  COBOL Name: 600-WRITE-COUNT
      * - writeCount400                  COBOL Name: 400-WRITE-COUNT
      * - returnCode6009999              COBOL Name: 600-9999-RETURN-CODE
      * - returnCode800                  COBOL Name: 800-RETURN-CODE
      *
      * @throws CFException
      */
      private void terminateProgram() throws Exception {
      
// ******************************************************************
// *           9000-Terminate-program                               *
// ******************************************************************
//  CLOSE SYS001-EXTRACT-Z-LOG-FILE SYS201-ASA-SERVER-REPORT
          sys001ExtractZLogFile.close(); 
          sys201AsaServerReport.close(); 
//  MOVE 400-READ-COUNT TO 600-TOT-READ-COUNT
//  FORMAT_397784695 = "ZZ,ZZZ,ZZZ,ZZ9"
          totReadCountMsg600.setTotReadCount600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_397784695,String.valueOf(work.getReadCount400()).toCharArray()));
//  MOVE 400-WRITE-COUNT TO 600-WRITE-COUNT
//  FORMAT_397784695 = "ZZ,ZZZ,ZZZ,ZZ9"
          totWriteCountMsg600.setWriteCount600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_397784695,String.valueOf(work.getWriteCount400()).toCharArray()));
//  MOVE 800-RETURN-CODE TO 600-9999-RETURN-CODE
          eojMessage6009999.setReturnCode6009999(work.getReturnCode800());
//  DISPLAY SPACES
          logger.info(" "); 
//  DISPLAY 600-TOT-READ-COUNT-MSG
          logger.info(totReadCountMsg600.toString()); 
//  DISPLAY SPACES
          logger.info(" "); 
//  DISPLAY 600-TOT-WRITE-COUNT-MSG
          logger.info(totWriteCountMsg600.toString()); 
//  DISPLAY SPACES
          logger.info(" "); 
//  DISPLAY 600-9999-EOJ-MESSAGE
          logger.info(eojMessage6009999.toString()); 
//  DISPLAY SPACES
          logger.info(" "); 
//  DISPLAY 600-9500-EOJ-MESSAGE
          logger.info(new String(work.getEojMessage6009500())); 
      
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
  /* 
****************************************************************
* security.             'confidential                          *
*        this item contains information and procedures         *
*        which are proprietary to mastercard international     *
*        incorporated, and which are confidential.  it is      *
*        provided with the express understanding that it       *
*        is to be used only for the benefit of interbank       *
*        card association, and is not to be used, copied or    *
*        disclosed for any other purpose.  any authorized      *
*        reproduction (in whole or in part) of this            *
*        material must be marked with this legend.'            *
****************************************************************
****************************************************************
*                                                              *
*   program name:      sf327010.                               *
*   function:          this program will create z log summary  *
*                      report by asa server,log type and asa   *
*                      service.                                *
*   language:          cobol.                                  *
*   system name:       stand-in.                               *
*   frequency:         daily.                                  *
*   classification:    batch.                                  *
*                                                              *
****************************************************************
****************************************************************
*    r e v i s i o n   h i s t o r y .                         *
****************************************************************
*|-----|---------|-------|----------|--------------------------|
*| ver |  date   |  rpi  |  pgmr    |    modifications         |
*|-----|---------|-------|----------|--------------------------|
*| 01  |05/26/08 |rel 9.1|karthika g|original version.         |
*|-----|---------|-------|----------|--------------------------|
*| 02  |08/20/08 |rel 9.1|sajitha s |modified the report format|
*|     |         |       |          |for the date field.       |
*|-----|---------|-------|----------|--------------------------|
*| 02  |11/26/08|rel 9.2 |janakiram |  modified the program to |
*|     |        |        |thumati   |  include the service name|
*|     |        |        |          |  and the date range in   |
*|     |        |        |          |  the report.             |
*|-----|--------|--------|----------|--------------------------|
*| 03  |08/05/09|rel 9.2 |schwamle  | modified the program to  |
*|     |        |        |          | include additional       |
*|     |        |        |          | service codes and names  |
*|-----|--------|--------|----------|--------------------------|
*| 04  |04/16/12|apsup12 |arnold j. | corrected the table      |
*|     |        |        |trembley  | asa service names.       |
*|-----|--------|--------|----------|--------------------------|
*| 05  |09/27/12|rel12q4 |lawrence  | corrected uknown service |
*|     |        |        |watson    | id for fraud notification|
*|-----|--------|--------|----------|--------------------------|
*| 06  |03/01/13|rel13q3 |durga s   |chip cvc1 conversion      |
*|     |        |c40598  |          |service: modified the     |
*|     |        |        |          |program to add two new    |
*|     |        |        |          |service ids and descriptio|
*|     |        |        |          |-ns in the internal table |
*|     |        |        |          |for chip cvc1 conversion. |
*|-----|--------|--------|----------|--------------------------|
*| 07  |05/02/13|rel13q4 |durga s   |mastercard digital enablem|
*|     |        |c48552  |          |ent system:               |
*|     |        |        |          |modified the program      |
*|     |        |        |          |to add four new service   |
*|     |        |        |          |ids (0050, 0051, 0052 and |
*|     |        |        |          |1050) and its  description|
*|     |        |        |          |for mdes.                 |
*|-----|--------|--------|----------|--------------------------|
*| 08  |08/02/13|rel14q1 | vijay    |mdes rev 3:               |
*|     |        |c48552  | sangale  |modified the program to   |
*|     |        |        |          |add two new service ids   |
*|     |        |        |          |and descriptions in the   |
*|     |        |        |          |internal table for mdes   |
*|     |        |        |          |service.                  |
*|-----|--------|--------|----------|--------------------------|
*| 09  |02/21/14|prodfix |arnold j. |convert service code/     |
*|     |        |prb63084|trembley  |description table to use  |
*|     |        |        |          |copybook sf535010, and    |
*|     |        |        |          |share it with sf328010    |
*|     |        |        |          |and "zlogpars".           |
*|-----|--------|--------|----------|--------------------------|
*| 10  |03/21/14|rel14q4 |durga s   |new moneysend payment     |
*|     |        |c53888  |          |types:                    |
*|     |        |        |          |recompiled for sf535010   |
*|     |        |        |          |copybook changes.         |
*|-----|--------|--------|----------|--------------------------|
*| 11  |04/17/14|rel14q4 |srinivas  |mdes card on file :       |
*|     |        |c66566  |          |recompiled for sf535010   |
*|     |        |        |          |copybook changes.         |
*|-----|--------|--------|----------|--------------------------|
*| 12  |09/17/14|rel15q1 |arvind    |mdes mastercard cloud     |
*|     |        |c67779  |          |based payments(switching) |
*|     |        |        |          |recompiled for sf535010   |
*|     |        |        |          |copybook changes.         |
*|-----|--------|--------|----------|--------------------------|
*| 13  |12/11/14|rel15q3 |durga s   |sf327010 update service   |
*|     |        |prb65265|          |descriptions:             |
*|     |        |        |          |recompiled for sf535010   |
*|     |        |        |          |copybook changes.         |
*|-----|--------|--------|----------|--------------------------|
*| 14  |12/04/15|rel16q2 |sangeetha |card on file enhancement#2|
*|     |        |c80567  |   chakkr |recompiled for sf535010   |
*|     |        |        |          |copybook changes.         |
*|-----|--------|--------|----------|--------------------------|
*| 15  |05/26/16|rel16q4 |hemanth   |card on file (cof) items 1|
*|     |        |c80567  |   reddy  |tr crypto descoping + 2   |
*|     |        |        |          |secure code rev 07.       |
*|     |        |        |          |recompiled for sf535010   |
*|     |        |        |          |copybook changes.         |
*|-----|--------|--------|----------|--------------------------|
*| 16  |12/01/16|rel17q2 |vasanthi  |emvco payment account     |
*|     |        |c89448  |   p      |reference :               |
*|     |        |        |          |recompiled for sf535010   |
*|     |        |        |          |copybook changes.         |
*|-----|--------|--------|----------|--------------------------|
*| 17  |04/22/17|rel17q3 |r jones   |mngs to ssp connection    |
*|     |        |c97336  |          |reference :               |
*|     |        |        |          |recompiled for sf535010   |
*|     |        |        |          |copybook changes.         |
*|-----|--------|--------|----------|--------------------------|
*| 18  |10/28/20|rel21q2 |vasantha  |modified the program to   |
*|     |        |pbi29119|  kumar   |fix sonar error and for   |
*|     |        |   &    | muthuraj |cob6 conversion.          |
*|     |        |pbi28592|          |                          |
*|-----|--------|--------|----------|--------------------------|
*| 99  |00/99/99|xxxxxxx |xxxxxxx   |xxxxxxxxxxxxxxxxxxxxxxx   |
*|     |        |        | xxxx     |xxxxxxxxxxxxxx.           |
*|-----|--------|--------|----------|--------------------------|
*    e n v i r o n m e n t   d i v i s i o n .                 *
****************************************************************
*/
