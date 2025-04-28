  package com.cloudframe.app.process.impl;
   /* The comment section is too large, 
	 * hence added at the end of the java code 
	 * please scroll all the way to the bottom to see complete comments 
	 */
  
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.sf327010.file.*;
  import com.cloudframe.app.sf327010.Sf327010Ctx.*;
  import com.cloudframe.app.sf327010.Sf327010Ctx;
  import com.cloudframe.app.process.Sf327010;
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
  import com.cloudframe.app.data.Field;
  import java.math.BigDecimal;
  import java.math.RoundingMode;
  import com.cloudframe.app.sf327010.dto.*;
  import com.cloudframe.app.sf327010.dto.HdrLine1201;
  import com.cloudframe.app.sf327010.dto.DtlLine2205;
  import com.cloudframe.app.sf327010.dto.HdrLine2202;
  import com.cloudframe.app.sf327010.dto.DetailData3205;
  import com.cloudframe.app.sf327010.dto.DtlLine1205;
  import com.cloudframe.app.sf327010.dto.HighServiceTime800;
  import com.cloudframe.app.sf327010.dto.TotReadCountMsg600;
  import com.cloudframe.app.sf327010.file.records.Sys201AsaServerRec;
  import com.cloudframe.app.sf327010.dto.CurrentRunMsg600;
  import com.cloudframe.app.sf327010.dto.FuncWhenCompiled800;
  import com.cloudframe.app.sf327010.dto.LowServiceTime800;
  import com.cloudframe.app.sf327010.dto.FuncCurrentDate800;
  import com.cloudframe.app.sf327010.dto.CompileMsg600;
  import com.cloudframe.app.sf327010.dto.TotWriteCountMsg600;
  import com.cloudframe.app.sf327010.dto.EojMessage6009999;
  import com.cloudframe.app.sf327010.file.records.Group1;
  import com.cloudframe.app.sf327010.dto.Sf528ExtractZLogRec;
  import com.cloudframe.app.sf327010.dto.Sf535ZlogServicesGroup;
  import com.cloudframe.app.sf327010.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("sf327010")
  
  public class Sf327010Impl extends CommonProcess implements Sf327010 {
  
  Logger logger = LoggerFactory.getLogger(Sf327010Impl.class);
  
  
  @Value("${timeZoneId:Etc/GMT}")
  private String timeZoneId;
  
  
  @Autowired 
  @Qualifier("sf327010_sys001ExtractZLogFile")
  Sys001ExtractZLogFile sys001ExtractZLogFile;
  @Autowired 
  @Qualifier("sf327010_sys201AsaServerReport")
  Sys201AsaServerReport sys201AsaServerReport;
  
  
  
  
  
  
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      public int process(Sf327010Ctx programCtx) throws Exception {
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
        finally {
      		if(sys001ExtractZLogFile.hasOpened() && !sys001ExtractZLogFile.isReadOnly()) { 
      			sys001ExtractZLogFile.flush(); 
      		}
      		if(sys201AsaServerReport.hasOpened() && !sys201AsaServerReport.isReadOnly()) { 
      			sys201AsaServerReport.flush(); 
      		}
      }
      
       return programCtx.getRc(); // Exit with return code
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
      @Override
      public void mainline(MainlineInCtx methodIn) throws Exception {
      
// ****************************************************************
// *                0 0 0 0 - M a i n l i n e                 *   *
// ****************************************************************
Sf327010Ctx programCtx = methodIn.getSf327010Ctx();
//  PERFORM 1000-INITIALIZE-PROGRAM
          initializeProgram(programCtx.getInitializeProgramInCtx());/*1000-INITIALIZE-PROGRAM*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  PERFORM 2000-PROCESS-INPUT UNTIL 88-100-Z-LOG-EOF
          while (!(methodIn.isZLogEof88100()) ) {
             processInput(programCtx.getProcessInputInCtx());/*2000-PROCESS-INPUT*/
             if (programCtx.isProgramEnded()) {
                 return ;
             }
          }
//  PERFORM 9000-TERMINATE-PROGRAM
          terminateProgram(programCtx.getTerminateProgramInCtx());/*9000-TERMINATE-PROGRAM*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
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
      @Override
      public InitializeProgramOutCtx initializeProgram(InitializeProgramInCtx methodIn) throws Exception {
      
// ****************************************************************
// *                1000-Initialize-program                       *
// ****************************************************************
Sf327010Ctx programCtx = methodIn.getSf327010Ctx();
InitializeProgramOutCtx methodOut = methodIn.getInitializeProgramOutCtx();
//  PERFORM 1100-BUILD-BEG-MSG
          buildBegMsg(programCtx.getBuildBegMsgInCtx());/*1100-BUILD-BEG-MSG*/
//  PERFORM 1200-OPEN-FILES
          openFiles(programCtx.getOpenFilesInCtx());/*1200-OPEN-FILES*/
//  PERFORM 8000-READ-SYS001
          readSys001(programCtx.getReadSys001InCtx());/*8000-READ-SYS001*/
//  IF 88-100-Z-LOG-EOF
          if ( methodIn.isZLogEof88100()  ) { 
//  DISPLAY 600-NO-RECORD-FOUND-MSG
              logger.info(new String(methodIn.getNoRecordFoundMsg600())); 
//  MOVE SPACES TO 202-SERVER-ID
              methodOut.setServerId202(CONSTANTS.SPACE_3);
//  MOVE 300-PLUS-1 TO 202-PAGE-COUNT
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
              methodOut.setPageCount202(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(methodOut.getPlus1300()).toCharArray()));
//  PERFORM 8400-WRITE-HDR
              writeHdr(programCtx.getWriteHdrInCtx());/*8400-WRITE-HDR*/
//  PERFORM 1300-GENERATE-EMPTY-DTL
              generateEmptyDtl(programCtx.getGenerateEmptyDtlInCtx());/*1300-GENERATE-EMPTY-DTL*/
          }
//  ELSE
          else { 
//  MOVE SF528-SERVER-ID TO 202-SERVER-ID
              methodOut.setServerId202(methodOut.getSf528ServerId());
//  MOVE SF528-LOG-TYPE TO 205-LOG-TYPE
              methodOut.setLogType205(methodOut.getSf528LogType());
//  MOVE SF528-SERVICE-DATE-TIME TO 800-HIGH-SERVICE-TIME 800-LOW-SERVICE-TIME
              methodOut.getHighServiceTime800().setString(methodOut.getSf528ServiceDateTime());
              methodOut.getLowServiceTime800().setString(methodOut.getSf528ServiceDateTime());
//  ADD 300-PLUS-1 TO 400-PAGE-COUNT
              methodOut.setPageCount400(methodOut.getPageCount400()+(int) methodOut.getPlus1300());
//  MOVE 400-PAGE-COUNT TO 202-PAGE-COUNT
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
              methodOut.setPageCount202(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(methodOut.getPageCount400()).toCharArray()));
//  PERFORM 8400-WRITE-HDR
              writeHdr(programCtx.getWriteHdrInCtx());/*8400-WRITE-HDR*/
//  PERFORM 8100-BACKUP-RECORD-DATA
              backupRecordData(programCtx.getBackupRecordDataInCtx());/*8100-BACKUP-RECORD-DATA*/
//  PERFORM 8200-INITIALIZE-VALUES
              initializeValues(programCtx.getInitializeValuesInCtx());/*8200-INITIALIZE-VALUES*/
          }
      
      return methodOut;
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
      @Override
      public BuildBegMsgOutCtx buildBegMsg(BuildBegMsgInCtx methodIn) throws Exception {
      
// *****************************************************************
// *           1 1 0 0 - B u i l d - b e g - m s g                 *
// *****************************************************************
// *  this paragraph will build and display the start message      *
// *  for the program.                                             *
// *****************************************************************
Sf327010Ctx programCtx = methodIn.getSf327010Ctx();
BuildBegMsgOutCtx methodOut = methodIn.getBuildBegMsgOutCtx();
//  MOVE FUNCTION WHEN-COMPILED TO 800-FUNC-WHEN-COMPILED
          methodOut.getFuncWhenCompiled800().setString("2021100505475200     ".toCharArray());
//  MOVE 800-WHEN-DATE-YYYY TO 600-COMP-DATE-YYYY
          methodOut.setCompDateYyyy600(methodOut.getWhenDateYyyy800());
//  MOVE 800-WHEN-DATE-MM TO 600-COMP-DATE-MM
          methodOut.setCompDateMm600(methodOut.getWhenDateMm800());
//  MOVE 800-WHEN-DATE-DD TO 600-COMP-DATE-DD
          methodOut.setCompDateDd600(methodOut.getWhenDateDd800());
//  MOVE 800-WHEN-TIME-HH TO 600-COMP-TIME-HH
          methodOut.setCompTimeHh600(methodOut.getWhenTimeHh800());
//  MOVE 800-WHEN-TIME-MM TO 600-COMP-TIME-MM
          methodOut.setCompTimeMm600(methodOut.getWhenTimeMm800());
//  MOVE 800-WHEN-TIME-SS TO 600-COMP-TIME-SS
          methodOut.setCompTimeSs600(methodOut.getWhenTimeSs800());
//  MOVE FUNCTION CURRENT-DATE TO 800-FUNC-CURRENT-DATE
          methodOut.getFuncCurrentDate800().setString( substring(CFUtil.getCurrentDate(timeZoneId),0,21));
          // MOVE '2021' TO 600-CURR-DATE-YYYY 800-CURR-DATE-YYYY
          //  LITERAL_2021 = '2021'
          methodOut.setCurrDateYyyy600(CONSTANTS.LITERAL_2021);
          methodOut.setCurrDateYyyy800(CONSTANTS.LITERAL_2021);
          // MOVE '10' TO 600-CURR-DATE-MM 800-CURR-DATE-MM
          //  LITERAL_10 = '10'
          methodOut.setCurrDateMm600(CONSTANTS.LITERAL_10);
          methodOut.setCurrDateMm800(CONSTANTS.LITERAL_10);
          // MOVE '02' TO 600-CURR-DATE-DD 800-CURR-DATE-DD
          //  LITERAL_02 = '02'
          methodOut.setCurrDateDd600(CONSTANTS.LITERAL_02);
          methodOut.setCurrDateDd800(CONSTANTS.LITERAL_02);
          // MOVE '16' TO 600-CURR-TIME-HH
          //  LITERAL_16 = '16'
          methodOut.setCurrTimeHh600(CONSTANTS.LITERAL_16);
          // MOVE '05' TO 600-CURR-TIME-MM
          //  LITERAL_05 = '05'
          methodOut.setCurrTimeMm600(CONSTANTS.LITERAL_05);
          // MOVE '31' TO 600-CURR-TIME-SS
          //  LITERAL_31 = '31'
          methodOut.setCurrTimeSs600(CONSTANTS.LITERAL_31);
//  MOVE 800-CURR-DATE-YYYY TO 201-RUN-YEAR
          methodOut.setRunYear201(methodOut.getCurrDateYyyy800());
//  MOVE 800-CURR-DATE-MM TO 100-MNTH-MM-NUM
          methodOut.setMnthMmNum100(methodOut.getCurrDateMm800());
//  PERFORM 8500-BUILD-MONTH
          buildMonth(programCtx.getBuildMonthInCtx());/*8500-BUILD-MONTH*/
//  MOVE 800-RUN-MONTH TO 201-RUN-MONTH
          methodOut.setRunMonth201(methodOut.getRunMonth800());
//  MOVE 800-CURR-DATE-DD TO 201-RUN-DATE
          methodOut.setRunDate201(methodOut.getCurrDateDd800());
//  DISPLAY 600-START-EXEC-MSG
          logger.info(new String(methodIn.getStartExecMsg600())); 
//  DISPLAY 600-COMPILE-MSG
          logger.info(methodIn.getCompileMsg600().toString()); 
//  DISPLAY 600-CURRENT-RUN-MSG
          logger.info(methodIn.getCurrentRunMsg600().toString()); 
//  DISPLAY SPACE
          logger.info(" "); 
      
      return methodOut;
      }
      /**
      * openFiles 
      *   This method is derived from 
  *   COBOL Paragraph - 1200-OPEN-FILES COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void openFiles(OpenFilesInCtx methodIn) throws Exception {
      
// ******************************************************************
// *           1 2 0 0 - O p e n - f i l e s                        *
// ******************************************************************
Sf327010Ctx programCtx = methodIn.getSf327010Ctx();
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
      @Override
      public GenerateEmptyDtlOutCtx generateEmptyDtl(GenerateEmptyDtlInCtx methodIn) throws Exception {
      
// ******************************************************************
// *            1300-Generate-empty-dtl                             *
// ******************************************************************
Sf327010Ctx programCtx = methodIn.getSf327010Ctx();
GenerateEmptyDtlOutCtx methodOut = methodIn.getGenerateEmptyDtlOutCtx();
//  WRITE SYS201-ASA-SERVER-REC FROM 206-DTL-LINE-2 AFTER ADVANCING 300-NUM-4 LINES
          sys201AsaServerReport.writeAfter(methodIn.getDtlLine2206(),methodIn.getNum4300());
          methodOut.getSys201AsaServerRec().setString(CONSTANTS.LOW_VALUE_215751987);
//  ADD 300-PLUS-4 TO 400-LINE-COUNT
          methodOut.setLineCount400(methodOut.getLineCount400()+(int) methodIn.getPlus4300());
      
      return methodOut;
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
      @Override
      public void processInput(ProcessInputInCtx methodIn) throws Exception {
      
// ******************************************************************
// *           2 0 0 0 - P r o c e s s - i n p u t                  *
// ******************************************************************
Sf327010Ctx programCtx = methodIn.getSf327010Ctx();
//  PERFORM 2100-COMPARE-BACKUP-DATA
          compareBackupData(programCtx.getCompareBackupDataInCtx());/*2100-COMPARE-BACKUP-DATA*/
//  PERFORM 2200-ACCUMULATE-DATA
          accumulateData(programCtx.getAccumulateDataInCtx());/*2200-ACCUMULATE-DATA*/
//  PERFORM 8100-BACKUP-RECORD-DATA
          backupRecordData(programCtx.getBackupRecordDataInCtx());/*8100-BACKUP-RECORD-DATA*/
//  PERFORM 8000-READ-SYS001
          readSys001(programCtx.getReadSys001InCtx());/*8000-READ-SYS001*/
//  IF 88-100-Z-LOG-EOF
          if ( methodIn.isZLogEof88100()  ) { 
//  PERFORM 8300-GENERATE-DTL
              generateDtl(programCtx);/*8300-GENERATE-DTL*/
//  PERFORM 2300-DISPLAY-SERVICE-DATE
              displayServiceDate(programCtx.getDisplayServiceDateInCtx());/*2300-DISPLAY-SERVICE-DATE*/
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
      @Override
      public CompareBackupDataOutCtx compareBackupData(CompareBackupDataInCtx methodIn) throws Exception {
      
// ******************************************************************
// *         2100-Compare-backup-data                               *
// ******************************************************************
Sf327010Ctx programCtx = methodIn.getSf327010Ctx();
CompareBackupDataOutCtx methodOut = methodIn.getCompareBackupDataOutCtx();
//  IF SF528-SERVER-ID NOT EQUAL 800-PREV-SERVER-ID
          if (		compareChars(methodIn.getSf528ServerId(),methodIn.getPrevServerId800()) != 0 ) { 
//  PERFORM 8300-GENERATE-DTL
              generateDtl(programCtx);/*8300-GENERATE-DTL*/
//  PERFORM 2110-GENERATE-HDR
              generateHdr(programCtx.getGenerateHdrInCtx());/*2110-GENERATE-HDR*/
//  MOVE SF528-LOG-TYPE TO 205-LOG-TYPE
              methodOut.setLogType205(methodOut.getSf528LogType());
//  PERFORM 8200-INITIALIZE-VALUES
              initializeValues(programCtx.getInitializeValuesInCtx());/*8200-INITIALIZE-VALUES*/
          }
//  ELSE
          else { 
//  IF SF528-LOG-TYPE NOT EQUAL 800-PREV-LOG-TYPE
              if (		compareChars(methodOut.getSf528LogType(),methodIn.getPrevLogType800()) != 0 ) { 
//  PERFORM 8300-GENERATE-DTL
                  generateDtl(programCtx);/*8300-GENERATE-DTL*/
//  MOVE SF528-LOG-TYPE TO 205-LOG-TYPE
                  methodOut.setLogType205(methodOut.getSf528LogType());
//  PERFORM 8200-INITIALIZE-VALUES
                  initializeValues(programCtx.getInitializeValuesInCtx());/*8200-INITIALIZE-VALUES*/
              }
//  ELSE
              else { 
//  IF SF528-SERVICE-ID NOT EQUAL 800-PREV-SERVICE-ID
                  if (		compareChars(methodIn.getSf528ServiceId(),methodIn.getPrevServiceId800()) != 0 ) { 
//  PERFORM 8300-GENERATE-DTL
                      generateDtl(programCtx);/*8300-GENERATE-DTL*/
//  PERFORM 8200-INITIALIZE-VALUES
                      initializeValues(programCtx.getInitializeValuesInCtx());/*8200-INITIALIZE-VALUES*/
                  }
              }
          }
      
      return methodOut;
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
      @Override
      public GenerateHdrOutCtx generateHdr(GenerateHdrInCtx methodIn) throws Exception {
      
// ******************************************************************
// *            2110-Generate-hdr                                   *
// ******************************************************************
Sf327010Ctx programCtx = methodIn.getSf327010Ctx();
GenerateHdrOutCtx methodOut = methodIn.getGenerateHdrOutCtx();
//  IF 400-LINE-COUNT GREATER THAN 300-MAX-LINES-PER-PAGE
          if (	( methodOut.getLineCount400() > methodIn.getMaxLinesPerPage300() ) ) { 
//  MOVE 300-NUM-0 TO 400-LINE-COUNT
              methodOut.setLineCount400( methodOut.getNum0300());
//  ADD 300-PLUS-1 TO 400-PAGE-COUNT
              methodOut.setPageCount400(methodOut.getPageCount400()+(int) methodIn.getPlus1300());
//  MOVE SF528-SERVER-ID TO 202-SERVER-ID
              methodOut.setServerId202(methodOut.getSf528ServerId());
//  MOVE 400-PAGE-COUNT TO 202-PAGE-COUNT
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
              methodOut.setPageCount202(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(methodOut.getPageCount400()).toCharArray()));
//  PERFORM 8400-WRITE-HDR
              writeHdr(programCtx.getWriteHdrInCtx());/*8400-WRITE-HDR*/
          }
//  ELSE
          else { 
//  ADD 300-PLUS-1 TO 400-PAGE-COUNT
              methodOut.setPageCount400(methodOut.getPageCount400()+(int) methodIn.getPlus1300());
//  MOVE SF528-SERVER-ID TO 202-SERVER-ID
              methodOut.setServerId202(methodOut.getSf528ServerId());
//  MOVE 400-PAGE-COUNT TO 202-PAGE-COUNT
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
              methodOut.setPageCount202(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(methodOut.getPageCount400()).toCharArray()));
//  PERFORM 8400-WRITE-HDR
              writeHdr(programCtx.getWriteHdrInCtx());/*8400-WRITE-HDR*/
          }
      
      return methodOut;
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
      @Override
      public AccumulateDataOutCtx accumulateData(AccumulateDataInCtx methodIn) throws Exception {
      
// ******************************************************************
// *                2200-Accumulate-data                           *
// ******************************************************************
Sf327010Ctx programCtx = methodIn.getSf327010Ctx();
AccumulateDataOutCtx methodOut = methodIn.getAccumulateDataOutCtx();
//  ADD 300-PLUS-1 TO 400-TOT-MESS-COUNT
          methodOut.setTotMessCount400(methodOut.getTotMessCount400()+(int) methodIn.getPlus1300());
//  IF SF528-SERVICE-STATUS EQUAL 300-CHAR-C
          if (		compareChars(methodIn.getSf528ServiceStatus(),methodIn.getCharC300()) == 0 ) { 
//  ADD 300-PLUS-1 TO 400-SUCCESS-COUNT
              methodOut.setSuccessCount400(methodOut.getSuccessCount400()+(int) methodIn.getPlus1300());
          }
//  ELSE
          else { 
//  ADD 300-PLUS-1 TO 400-ERROR-COUNT
              methodOut.setErrorCount400(methodOut.getErrorCount400()+(int) methodIn.getPlus1300());
          }
//  ADD SF528-ELAPSED-TIME TO 800-SUM-ELAPSED-TIME
          methodOut.setSumElapsedTime800(methodOut.getSumElapsedTime800()+(int) methodOut.getSf528ElapsedTime());
//  IF SF528-ELAPSED-TIME GREATER THAN 800-HIGH-ELAPSED
          if (	( methodOut.getSf528ElapsedTime() > methodOut.getHighElapsed800() )) { 
              // MOVE SF528-ELAPSED-TIME TO 800-HIGH-ELAPSED
              methodOut.setHighElapsed800(methodOut.getSf528ElapsedTime());
          }
//  IF SF528-ELAPSED-TIME LESS THAN 800-LOW-ELAPSED
          if (	( methodOut.getSf528ElapsedTime() < methodOut.getLowElapsed800() )) { 
              // MOVE SF528-ELAPSED-TIME TO 800-LOW-ELAPSED
              methodOut.setLowElapsed800(methodOut.getSf528ElapsedTime());
          }
//  IF SF528-SERVICE-DATE-TIME GREATER THAN 800-HIGH-SERVICE-TIME
          if (		compareChars(methodOut.getSf528ServiceDateTime(),methodOut.getHighServiceTime800()) > 0 ) { 
//  MOVE SF528-SERVICE-DATE-TIME TO 800-HIGH-SERVICE-TIME
              methodOut.getHighServiceTime800().setString(methodOut.getSf528ServiceDateTime());
          }
//  ELSE
          else { 
//  IF SF528-SERVICE-DATE-TIME LESS THAN 800-LOW-SERVICE-TIME
              if (		compareChars(methodOut.getSf528ServiceDateTime(),methodOut.getLowServiceTime800()) < 0 ) { 
//  MOVE SF528-SERVICE-DATE-TIME TO 800-LOW-SERVICE-TIME
                  methodOut.getLowServiceTime800().setString(methodOut.getSf528ServiceDateTime());
              }
          }
      
      return methodOut;
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
      @Override
      public DisplayServiceDateOutCtx displayServiceDate(DisplayServiceDateInCtx methodIn) throws Exception {
      
// ******************************************************************
// *       2 3 0 0 - D i s p l a y - s e r v i c e - d a t e .      *
// ******************************************************************
Sf327010Ctx programCtx = methodIn.getSf327010Ctx();
DisplayServiceDateOutCtx methodOut = methodIn.getDisplayServiceDateOutCtx();
//  MOVE 800-LSERVICE-DD TO 205-LSERVICE-DATE
          methodOut.setLserviceDate205(methodOut.getLserviceDd800());
//  MOVE 800-LSERVICE-MM TO 100-MNTH-MM-NUM
          methodOut.setMnthMmNum100(methodOut.getLserviceMm800());
//  PERFORM 8500-BUILD-MONTH
          buildMonth(programCtx.getBuildMonthInCtx());/*8500-BUILD-MONTH*/
//  MOVE 800-RUN-MONTH TO 205-LSERVICE-MONTH
          methodOut.setLserviceMonth205(methodOut.getRunMonth800());
//  MOVE 800-LSERVICE-CC TO 205-LSERVICE-CENTURY
          methodOut.setLserviceCentury205(methodOut.getLserviceCc800());
//  MOVE 800-LSERVICE-YY TO 205-LSERVICE-YEAR
          methodOut.setLserviceYear205(methodOut.getLserviceYy800());
//  MOVE 800-LSERVICE-HH TO 205-LSERVICE-HH
          methodOut.setLserviceHh205(methodOut.getLserviceHh800());
//  MOVE 800-LSERVICE-MINS TO 205-LSERVICE-MINS
          methodOut.setLserviceMins205(methodOut.getLserviceMins800());
//  MOVE 800-LSERVICE-SEC TO 205-LSERVICE-SEC
          methodOut.setLserviceSec205(methodOut.getLserviceSec800());
//  MOVE 800-HSERVICE-DD TO 205-HSERVICE-DATE
          methodOut.setHserviceDate205(methodOut.getHserviceDd800());
//  MOVE 800-HSERVICE-MM TO 100-MNTH-MM-NUM
          methodOut.setMnthMmNum100(methodOut.getHserviceMm800());
//  PERFORM 8500-BUILD-MONTH
          buildMonth(programCtx.getBuildMonthInCtx());/*8500-BUILD-MONTH*/
//  MOVE 800-RUN-MONTH TO 205-HSERVICE-MONTH
          methodOut.setHserviceMonth205(methodOut.getRunMonth800());
//  MOVE 800-HSERVICE-CC TO 205-HSERVICE-CENTURY
          methodOut.setHserviceCentury205(methodOut.getHserviceCc800());
//  MOVE 800-HSERVICE-YY TO 205-HSERVICE-YEAR
          methodOut.setHserviceYear205(methodOut.getHserviceYy800());
//  MOVE 800-HSERVICE-HH TO 205-HSERVICE-HH
          methodOut.setHserviceHh205(methodOut.getHserviceHh800());
//  MOVE 800-HSERVICE-MINS TO 205-HSERVICE-MINS
          methodOut.setHserviceMins205(methodOut.getHserviceMins800());
//  MOVE 800-HSERVICE-SEC TO 205-HSERVICE-SEC
          methodOut.setHserviceSec205(methodOut.getHserviceSec800());
//  WRITE SYS201-ASA-SERVER-REC FROM 205-DETAIL-DATA3 AFTER ADVANCING 300-NUM-4 LINES
          sys201AsaServerReport.writeAfter(methodIn.getDetailData3205().toCharArray(),methodIn.getNum4300());
          methodOut.getSys201AsaServerRec().setString(CONSTANTS.LOW_VALUE_215751987);
//  ADD 300-PLUS-4 TO 400-LINE-COUNT
          methodOut.setLineCount400(methodOut.getLineCount400()+(int) methodIn.getPlus4300());
      
      return methodOut;
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
      @Override
      public ReadSys001OutCtx readSys001(ReadSys001InCtx methodIn) throws Exception {
      
// ******************************************************************
// *           8 0 0 0 - R e a d - s y s 0 0 1                      *
// ******************************************************************
Sf327010Ctx programCtx = methodIn.getSf327010Ctx();
ReadSys001OutCtx methodOut = methodIn.getReadSys001OutCtx();
          // READ SYS001-EXTRACT-Z-LOG-FILE INTO SF528-EXTRACT-Z-LOG-REC
          sys001ExtractZLogFile.read();
          if (!sys001ExtractZLogFile.hasEnded()) {
            methodIn.getSf528ExtractZLogRec().setString(sys001ExtractZLogFile.getRecord());
            methodOut.getGroup1().setString(sys001ExtractZLogFile.getRecord());
          }
//  AT END
          if (sys001ExtractZLogFile.hasEnded()) {  
//  SET 88-100-Z-LOG-EOF TO TRUE
              methodOut.setZLogEof88100True(); 
              
            }
//  NOT AT END
          else  {
//  ADD 300-PLUS-1 TO 400-READ-COUNT
              methodOut.setReadCount400(methodOut.getReadCount400()+(int) methodIn.getPlus1300());
            }
      
      return methodOut;
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
      @Override
      public BackupRecordDataOutCtx backupRecordData(BackupRecordDataInCtx methodIn) throws Exception {
      
// ******************************************************************
// *           8100-Backup-record-data.                             *
// ******************************************************************
Sf327010Ctx programCtx = methodIn.getSf327010Ctx();
BackupRecordDataOutCtx methodOut = methodIn.getBackupRecordDataOutCtx();
          // MOVE SF528-SERVER-ID TO 800-PREV-SERVER-ID
          methodOut.setPrevServerId800(methodOut.getSf528ServerId());
          // MOVE SF528-LOG-TYPE TO 800-PREV-LOG-TYPE
          methodOut.setPrevLogType800(methodOut.getSf528LogType());
          // MOVE SF528-SERVICE-ID TO 800-PREV-SERVICE-ID
          methodOut.setPrevServiceId800(methodOut.getSf528ServiceId());
      
      return methodOut;
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
      @Override
      public InitializeValuesOutCtx initializeValues(InitializeValuesInCtx methodIn) throws Exception {
      
// ******************************************************************
// *           8200-Initialize-values                               *
// ******************************************************************
Sf327010Ctx programCtx = methodIn.getSf327010Ctx();
InitializeValuesOutCtx methodOut = methodIn.getInitializeValuesOutCtx();
//  MOVE 300-NUM-0 TO 400-TOT-MESS-COUNT
          methodOut.setTotMessCount400( methodOut.getNum0300());
//  MOVE 300-NUM-0 TO 400-SUCCESS-COUNT
          methodOut.setSuccessCount400( methodOut.getNum0300());
//  MOVE 300-NUM-0 TO 400-ERROR-COUNT
          methodOut.setErrorCount400( methodOut.getNum0300());
//  MOVE 300-NUM-0 TO 800-SUM-ELAPSED-TIME
          methodOut.setSumElapsedTime800((int) methodOut.getNum0300());
          // MOVE SF528-ELAPSED-TIME TO 800-HIGH-ELAPSED
          methodOut.setHighElapsed800(methodOut.getSf528ElapsedTime());
          // MOVE SF528-ELAPSED-TIME TO 800-LOW-ELAPSED
          methodOut.setLowElapsed800(methodOut.getSf528ElapsedTime());
      
      return methodOut;
      }
      /**
      * generateDtl 
      *   This method is derived from 
  *   COBOL Paragraph - 8300-GENERATE-DTL COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void generateDtl(Sf327010Ctx programCtx) throws Exception {
      
// ******************************************************************
// *               8300-Generate-dtl                                *
// ******************************************************************
//  PERFORM 8310-CALCULATE-REP-DATA
          calculateRepData(programCtx.getCalculateRepDataInCtx());/*8310-CALCULATE-REP-DATA*/
//  PERFORM 8320-CHECK-LINE-COUNT
          checkLineCount(programCtx.getCheckLineCountInCtx());/*8320-CHECK-LINE-COUNT*/
//  PERFORM 8330-MOVE-REPORT-DATA
          moveReportData(programCtx.getMoveReportDataInCtx());/*8330-MOVE-REPORT-DATA*/
//  PERFORM 8350-BUILD-SERVICE-ID-DESC
          buildServiceIdDesc(programCtx.getBuildServiceIdDescInCtx());/*8350-BUILD-SERVICE-ID-DESC*/
//  PERFORM 8340-GENERATE-REPORT
          generateReport(programCtx.getGenerateReportInCtx());/*8340-GENERATE-REPORT*/
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
      @Override
      public CalculateRepDataOutCtx calculateRepData(CalculateRepDataInCtx methodIn) throws Exception {
      
// ******************************************************************
// *               8310-Calculate-rep-data                          *
// ******************************************************************
Sf327010Ctx programCtx = methodIn.getSf327010Ctx();
CalculateRepDataOutCtx methodOut = methodIn.getCalculateRepDataOutCtx();
          methodOut.setSuccessPercent400(BigDecimal.valueOf(methodIn.getSuccessCount400()).divide(BigDecimal.valueOf(methodIn.getTotMessCount400()),18,RoundingMode.DOWN).setScale(3,BigDecimal.ROUND_DOWN).multiply(BigDecimal.valueOf(methodIn.getNum100300())).setScale(2,RoundingMode.HALF_UP));
          if(methodOut.getSuccessPercent400().signum() < 0 )  methodOut.setSuccessPercent400(methodOut.getSuccessPercent400().negate());
          methodOut.setErrorPercent400(BigDecimal.valueOf(methodIn.getErrorCount400()).divide(BigDecimal.valueOf(methodIn.getTotMessCount400()),18,RoundingMode.DOWN).setScale(3,BigDecimal.ROUND_DOWN).multiply(BigDecimal.valueOf(methodIn.getNum100300())).setScale(2,RoundingMode.HALF_UP));
          if(methodOut.getErrorPercent400().signum() < 0 )  methodOut.setErrorPercent400(methodOut.getErrorPercent400().negate());
          methodOut.setAvgElapsedN800(BigDecimal.valueOf(methodIn.getSumElapsedTime800()).divide(BigDecimal.valueOf(methodIn.getTotMessCount400()),18,RoundingMode.DOWN).setScale(3,BigDecimal.ROUND_DOWN).setScale(2,RoundingMode.HALF_UP));
          if(methodOut.getAvgElapsedN800().signum() < 0 )  methodOut.setAvgElapsedN800(methodOut.getAvgElapsedN800().negate());
          // MOVE 800-AVG-ELAPSED-N TO 800-AVG-ELAPSED
          //  FORMAT_1949449721 = "ZZZ,ZZZ,ZZ9.99"
          methodOut.setAvgElapsed800(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1949449721,methodOut.getAvgElapsedN800().toPlainString().toCharArray()));
          // MOVE 400-SUCCESS-PERCENT TO 800-SUCCESS-PERCENT
          //  FORMAT_27653163 = "ZZ9.99"
          methodOut.setSuccessPercent800(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_27653163,methodOut.getSuccessPercent400().toPlainString().toCharArray()));
          // MOVE 400-ERROR-PERCENT TO 800-ERROR-PERCENT
          //  FORMAT_27653163 = "ZZ9.99"
          methodOut.setErrorPercent800(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_27653163,methodOut.getErrorPercent400().toPlainString().toCharArray()));
      
      return methodOut;
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
      @Override
      public CheckLineCountOutCtx checkLineCount(CheckLineCountInCtx methodIn) throws Exception {
      
// ******************************************************************
// *                 8320-Check-line-count                          *
// ******************************************************************
Sf327010Ctx programCtx = methodIn.getSf327010Ctx();
CheckLineCountOutCtx methodOut = methodIn.getCheckLineCountOutCtx();
//  IF 400-LINE-COUNT GREATER THAN 300-MAX-LINES-PER-PAGE
          if (	( methodOut.getLineCount400() > methodIn.getMaxLinesPerPage300() ) ) { 
//  MOVE 300-NUM-0 TO 400-LINE-COUNT
              methodOut.setLineCount400( methodOut.getNum0300());
//  ADD 300-PLUS-1 TO 400-PAGE-COUNT
              methodOut.setPageCount400(methodOut.getPageCount400()+(int) methodIn.getPlus1300());
//  MOVE SF528-SERVER-ID TO 202-SERVER-ID
              methodOut.setServerId202(methodOut.getSf528ServerId());
//  MOVE 400-PAGE-COUNT TO 202-PAGE-COUNT
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
              methodOut.setPageCount202(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(methodOut.getPageCount400()).toCharArray()));
//  PERFORM 8400-WRITE-HDR
              writeHdr(programCtx.getWriteHdrInCtx());/*8400-WRITE-HDR*/
          }
      
      return methodOut;
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
      @Override
      public MoveReportDataOutCtx moveReportData(MoveReportDataInCtx methodIn) throws Exception {
      
// ******************************************************************
// *                 8330-Move-report-data                          *
// ******************************************************************
Sf327010Ctx programCtx = methodIn.getSf327010Ctx();
MoveReportDataOutCtx methodOut = methodIn.getMoveReportDataOutCtx();
          // MOVE 800-SUCCESS-PERCENT TO 205-SUCCESSFUL-PERCNT
          methodOut.setSuccessfulPercnt205(methodOut.getSuccessPercent800());
          // MOVE 800-AVG-ELAPSED TO 205-AVG-ELAPSED
          methodOut.setAvgElapsed205(methodOut.getAvgElapsed800());
          // MOVE 800-ERROR-PERCENT TO 205-ERROR-PERCENT
          methodOut.setErrorPercent205(methodOut.getErrorPercent800());
//  MOVE 800-PREV-SERVICE-ID TO 205-SERVICE
          methodOut.setService205(methodOut.getPrevServiceId800());
//  MOVE 400-TOT-MESS-COUNT TO 205-TOT-MSG-COUNT
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          methodOut.setTotMsgCount205(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(methodOut.getTotMessCount400()).toCharArray()));
//  MOVE 400-SUCCESS-COUNT TO 205-SUCCESSFUL-COUNT
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          methodOut.setSuccessfulCount205(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(methodOut.getSuccessCount400()).toCharArray()));
//  MOVE 400-ERROR-COUNT TO 205-ERROR-COUNT
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          methodOut.setErrorCount205(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(methodOut.getErrorCount400()).toCharArray()));
//  MOVE 800-LOW-ELAPSED TO 205-LOW-ELAPSED
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          methodOut.setLowElapsed205(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(methodOut.getLowElapsed800()).toCharArray()));
//  MOVE 800-HIGH-ELAPSED TO 205-HIGH-ELAPSED
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          methodOut.setHighElapsed205(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(methodOut.getHighElapsed800()).toCharArray()));
      
      return methodOut;
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
      @Override
      public GenerateReportOutCtx generateReport(GenerateReportInCtx methodIn) throws Exception {
      
// ******************************************************************
// *                 8340-Generate-report                           *
// ******************************************************************
Sf327010Ctx programCtx = methodIn.getSf327010Ctx();
GenerateReportOutCtx methodOut = methodIn.getGenerateReportOutCtx();
//  WRITE SYS201-ASA-SERVER-REC FROM 205-DTL-LINE-1 AFTER ADVANCING 300-NUM-4 LINES
          sys201AsaServerReport.writeAfter(methodIn.getDtlLine1205().toCharArray(),methodIn.getNum4300());
          methodOut.getSys201AsaServerRec().setString(CONSTANTS.LOW_VALUE_215751987);
//  ADD 300-PLUS-4 TO 400-LINE-COUNT
          methodOut.setLineCount400(methodOut.getLineCount400()+(int) methodIn.getPlus4300());
//  WRITE SYS201-ASA-SERVER-REC FROM 205-DTL-LINE-2 AFTER ADVANCING 300-NUM-1 LINES
          sys201AsaServerReport.writeAfter(methodIn.getDtlLine2205().toCharArray(),methodIn.getNum1300());
          methodOut.getSys201AsaServerRec().setString(CONSTANTS.LOW_VALUE_215751987);
//  ADD 300-PLUS-1 TO 400-LINE-COUNT
          methodOut.setLineCount400(methodOut.getLineCount400()+(int) methodIn.getPlus1300());
//  ADD 300-PLUS-1 TO 400-WRITE-COUNT
          methodOut.setWriteCount400(methodOut.getWriteCount400()+(int) methodIn.getPlus1300());
      
      return methodOut;
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
      @Override
      public BuildServiceIdDescOutCtx buildServiceIdDesc(BuildServiceIdDescInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			boolean keepSearching = true;
			int[] searchIndexes = null;
			int searchLowPoint = 0;
			int searchMidPoint = 0;
			int searchHighPoint = 0;
			int searchCompare = 0;
			// End of variable declaration

      
// ****************************************************************
// * 8 3 5 0 - B u i l d - s e r v i c e - i d - d e s c .        *
// ****************************************************************
Sf327010Ctx programCtx = methodIn.getSf327010Ctx();
BuildServiceIdDescOutCtx methodOut = methodIn.getBuildServiceIdDescOutCtx();
//  SET SF535-X TO 300-NUM-1
          methodOut.setSf535X(methodIn.getNum1300()); 
          
//  SEARCH ALL SF535-ZLOG-SERVICE-ENTRY
          // Binary Search through methodIn.getSf535ZlogServiceTable().sf535ZlogServiceEntry
          searchLowPoint = 0; //prevLowValue
          searchHighPoint = methodIn.getSf535ZlogServiceTable().sf535ZlogServiceEntrySize(); //prevHighValue
          searchMidPoint = searchHighPoint / 2; //starting at mid point
          searchIndexes = new int[]{searchLowPoint,searchMidPoint,searchHighPoint};
          keepSearching = true;
          while (keepSearching) {
          // compare logic below
             searchCompare = compareAscending(methodIn.getSf535ZlogService(searchMidPoint),methodIn.getPrevServiceId800());
          // end of compare logic
          	if (searchCompare == 0 ) { // if search found
          	      keepSearching = false;
          	     methodOut.setSf535X(searchMidPoint + 1);
//  MOVE SF535-ZSERV-DESC ( SF535-X ) TO 205-SERVICE-NAME
              methodOut.setServiceName205(methodOut.getSf535ZservDesc(methodOut.getSf535X() - 1));
          	} else  {
          		adjustSearchIndex(searchCompare,searchIndexes);
          		searchLowPoint  = searchIndexes[0];
           		searchMidPoint  = searchIndexes[1];
           		searchHighPoint = searchIndexes[2];
           		if (searchMidPoint == -1) { // search exhausted
           		    keepSearching = false; 
//  MOVE 300-LIT-UNKNWN TO 205-SERVICE-NAME
              methodOut.setServiceName205(pad(55,methodOut.getLitUnknwn300(),SPACE_CHAR,RIGHT_PAD));
           		}
          	}
          }
      
      return methodOut;
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
      @Override
      public WriteHdrOutCtx writeHdr(WriteHdrInCtx methodIn) throws Exception {
      
// ******************************************************************
// *            8400-Write-hdr                                      *
// ******************************************************************
Sf327010Ctx programCtx = methodIn.getSf327010Ctx();
WriteHdrOutCtx methodOut = methodIn.getWriteHdrOutCtx();
//  WRITE SYS201-ASA-SERVER-REC FROM 201-HDR-LINE-1 AFTER ADVANCING PAGE
          sys201AsaServerReport.writeWithPageBreakAfter(methodIn.getHdrLine1201().toCharArray());
          methodOut.getSys201AsaServerRec().setString(CONSTANTS.LOW_VALUE_215751987);
//  WRITE SYS201-ASA-SERVER-REC FROM 202-HDR-LINE-2 AFTER ADVANCING 300-NUM-2 LINE
          sys201AsaServerReport.writeAfter(methodIn.getHdrLine2202().toCharArray(),methodIn.getNum2300());
          methodOut.getSys201AsaServerRec().setString(CONSTANTS.LOW_VALUE_215751987);
//  WRITE SYS201-ASA-SERVER-REC FROM 203-HDR-LINE-3 AFTER ADVANCING 300-NUM-4 LINES
          sys201AsaServerReport.writeAfter(methodIn.getHdrLine3203(),methodIn.getNum4300());
          methodOut.getSys201AsaServerRec().setString(CONSTANTS.LOW_VALUE_215751987);
//  WRITE SYS201-ASA-SERVER-REC FROM 204-HDR-LINE-4 AFTER ADVANCING 300-NUM-1 LINE
          sys201AsaServerReport.writeAfter(methodIn.getHdrLine4204(),methodIn.getNum1300());
          methodOut.getSys201AsaServerRec().setString(CONSTANTS.LOW_VALUE_215751987);
//  MOVE 300-PLUS-7 TO 400-LINE-COUNT
          methodOut.setLineCount400( methodOut.getPlus7300());
      
      return methodOut;
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
      @Override
      public BuildMonthOutCtx buildMonth(BuildMonthInCtx methodIn) throws Exception {
      
// ******************************************************************
// *           8 5 0 0 - B u i l d - m o n t h .                    *
// ******************************************************************
Sf327010Ctx programCtx = methodIn.getSf327010Ctx();
BuildMonthOutCtx methodOut = methodIn.getBuildMonthOutCtx();
//  EVALUATE TRUE
          if  ( methodIn.isMnthMmNumJan88100()  ) { 
              // MOVE 300-MONTH-JAN TO 800-RUN-MONTH
              methodOut.setRunMonth800(methodOut.getMonthJan300());
          }
          else if  ( methodIn.isMnthMmNumFeb88100()  ) { 
              // MOVE 300-MONTH-FEB TO 800-RUN-MONTH
              methodOut.setRunMonth800(methodOut.getMonthFeb300());
          }
          else if  ( methodIn.isMnthMmNumMar88100()  ) { 
              // MOVE 300-MONTH-MAR TO 800-RUN-MONTH
              methodOut.setRunMonth800(methodOut.getMonthMar300());
          }
          else if  ( methodIn.isMnthMmNumApr88100()  ) { 
              // MOVE 300-MONTH-APR TO 800-RUN-MONTH
              methodOut.setRunMonth800(methodOut.getMonthApr300());
          }
          else if  ( methodIn.isMnthMmNumMay88100()  ) { 
              // MOVE 300-MONTH-MAY TO 800-RUN-MONTH
              methodOut.setRunMonth800(methodOut.getMonthMay300());
          }
          else if  ( methodIn.isMnthMmNumJun88100()  ) { 
              // MOVE 300-MONTH-JUN TO 800-RUN-MONTH
              methodOut.setRunMonth800(methodOut.getMonthJun300());
          }
          else if  ( methodIn.isMnthMmNumJul88100()  ) { 
              // MOVE 300-MONTH-JUL TO 800-RUN-MONTH
              methodOut.setRunMonth800(methodOut.getMonthJul300());
          }
          else if  ( methodIn.isMnthMmNumAug88100()  ) { 
              // MOVE 300-MONTH-AUG TO 800-RUN-MONTH
              methodOut.setRunMonth800(methodOut.getMonthAug300());
          }
          else if  ( methodIn.isMnthMmNumSep88100()  ) { 
              // MOVE 300-MONTH-SEP TO 800-RUN-MONTH
              methodOut.setRunMonth800(methodOut.getMonthSep300());
          }
          else if  ( methodIn.isMnthMmNumOct88100()  ) { 
              // MOVE 300-MONTH-OCT TO 800-RUN-MONTH
              methodOut.setRunMonth800(methodOut.getMonthOct300());
          }
          else if  ( methodIn.isMnthMmNumNov88100()  ) { 
              // MOVE 300-MONTH-NOV TO 800-RUN-MONTH
              methodOut.setRunMonth800(methodOut.getMonthNov300());
          }
          else if  ( methodIn.isMnthMmNumDec88100()  ) { 
              // MOVE 300-MONTH-DEC TO 800-RUN-MONTH
              methodOut.setRunMonth800(methodOut.getMonthDec300());
          }
          else   { 
              ;
          }
      
      return methodOut;
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
      @Override
      public TerminateProgramOutCtx terminateProgram(TerminateProgramInCtx methodIn) throws Exception {
      
// ******************************************************************
// *           9000-Terminate-program                               *
// ******************************************************************
Sf327010Ctx programCtx = methodIn.getSf327010Ctx();
TerminateProgramOutCtx methodOut = methodIn.getTerminateProgramOutCtx();
//  CLOSE SYS001-EXTRACT-Z-LOG-FILE SYS201-ASA-SERVER-REPORT
          sys001ExtractZLogFile.close(); 
          sys201AsaServerReport.close(); 
//  MOVE 400-READ-COUNT TO 600-TOT-READ-COUNT
//  FORMAT_397784695 = "ZZ,ZZZ,ZZZ,ZZ9"
          methodOut.setTotReadCount600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_397784695,String.valueOf(methodOut.getReadCount400()).toCharArray()));
//  MOVE 400-WRITE-COUNT TO 600-WRITE-COUNT
//  FORMAT_397784695 = "ZZ,ZZZ,ZZZ,ZZ9"
          methodOut.setWriteCount600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_397784695,String.valueOf(methodOut.getWriteCount400()).toCharArray()));
//  MOVE 800-RETURN-CODE TO 600-9999-RETURN-CODE
          methodOut.setReturnCode6009999(methodOut.getReturnCode800());
//  DISPLAY SPACES
          logger.info(" "); 
//  DISPLAY 600-TOT-READ-COUNT-MSG
          logger.info(methodIn.getTotReadCountMsg600().toString()); 
//  DISPLAY SPACES
          logger.info(" "); 
//  DISPLAY 600-TOT-WRITE-COUNT-MSG
          logger.info(methodIn.getTotWriteCountMsg600().toString()); 
//  DISPLAY SPACES
          logger.info(" "); 
//  DISPLAY 600-9999-EOJ-MESSAGE
          logger.info(methodIn.getEojMessage6009999().toString()); 
//  DISPLAY SPACES
          logger.info(" "); 
//  DISPLAY 600-9500-EOJ-MESSAGE
          logger.info(new String(methodIn.getEojMessage6009500())); 
      
      return methodOut;
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
