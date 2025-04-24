  package com.cloudframe.app.process.impl;
   /* The comment section is too large, 
	 * hence added at the end of the java code 
	 * please scroll all the way to the bottom to see complete comments 
	 */
  
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.sf328010.file.*;
  import com.cloudframe.app.sf328010.Sf328010Ctx.*;
  import com.cloudframe.app.sf328010.Sf328010Ctx;
  import com.cloudframe.app.process.Sf328010;
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
  import com.cloudframe.app.sf328010.dto.*;
  import com.cloudframe.app.sf328010.dto.DetailData2705;
  import com.cloudframe.app.sf328010.dto.DetailData1705;
  import com.cloudframe.app.sf328010.dto.HeaderLine1701;
  import com.cloudframe.app.sf328010.dto.DetailData705;
  import com.cloudframe.app.sf328010.dto.HeaderLine2702;
  import com.cloudframe.app.sf328010.dto.FuncWhenCompiled800;
  import com.cloudframe.app.sf328010.dto.Sf528ExtractZLogRec;
  import com.cloudframe.app.sf328010.file.records.Group1;
  import com.cloudframe.app.sf328010.dto.CompileInfoMsg600;
  import com.cloudframe.app.sf328010.dto.HighServiceTime800;
  import com.cloudframe.app.sf328010.file.records.Sys201ServiceRptRec;
  import com.cloudframe.app.sf328010.dto.Message6008002;
  import com.cloudframe.app.sf328010.dto.LowServiceTime800;
  import com.cloudframe.app.sf328010.dto.FuncCurrentDate800;
  import com.cloudframe.app.sf328010.dto.CurrentRunMsg600;
  import com.cloudframe.app.sf328010.dto.Message6008001;
  import com.cloudframe.app.sf328010.dto.Sf535ZlogServicesGroup;
  import com.cloudframe.app.sf328010.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("sf328010")
  
  public class Sf328010Impl extends CommonProcess implements Sf328010 {
  
  Logger logger = LoggerFactory.getLogger(Sf328010Impl.class);
  
  
  @Value("${timeZoneId:Etc/GMT}")
  private String timeZoneId;
  
  
  @Autowired 
  @Qualifier("sf328010_sys001ZLogFile")
  Sys001ZLogFile sys001ZLogFile;
  @Autowired 
  @Qualifier("sf328010_sys201ServiceReport")
  Sys201ServiceReport sys201ServiceReport;
  
  
  
  
  
  
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      public int process(Sf328010Ctx programCtx) throws Exception {
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
      		if(sys001ZLogFile.hasOpened() && !sys001ZLogFile.isReadOnly()) { 
      			sys001ZLogFile.flush(); 
      		}
      		if(sys201ServiceReport.hasOpened() && !sys201ServiceReport.isReadOnly()) { 
      			sys201ServiceReport.flush(); 
      		}
      }
      
       return programCtx.getRc(); // Exit with return code
      // end of process method
      }
      /**
      * mainline 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAINLINE COBOL Cyclomatic complexity - 5
      * Input  :  

      * - zLogEofSw100                   COBOL Name: 100-Z-LOG-EOF-SW
      * - zLogFirstRead100               COBOL Name: 100-Z-LOG-FIRST-READ
      *
      * Output : None 

      * @throws CFException
      */
      @Override
      public void mainline(MainlineInCtx methodIn) throws Exception {
      
// ******************************************************************
// *           0 0 0 0 - M a i n l i n e.                           *
// ******************************************************************
Sf328010Ctx programCtx = methodIn.getSf328010Ctx();
//  PERFORM 1000-INITIALIZE-PROGRAM
          initializeProgram(programCtx.getInitializeProgramInCtx());/*1000-INITIALIZE-PROGRAM*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  PERFORM 2000-PROCESS-Z-LOG-FILE UNTIL 88-100-Z-LOG-EOF
          while (!(methodIn.isZLogEof88100()) ) {
             processZLogFile(programCtx.getProcessZLogFileInCtx());/*2000-PROCESS-Z-LOG-FILE*/
             if (programCtx.isProgramEnded()) {
                 return ;
             }
          }
//  IF 88-100-Z-LOG-EOF AND 88-100-FIRST-READ
//  ELSE
          if (!(methodIn.isZLogEof88100())  || !(methodIn.isFirstRead88100()) ) { 
//  PERFORM 3000-DISPLAY-SERVICE-DATE
              displayServiceDate(programCtx.getDisplayServiceDateInCtx());/*3000-DISPLAY-SERVICE-DATE*/
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

      * - zLogEofSw100                   COBOL Name: 100-Z-LOG-EOF-SW
      * - noInputData6000001             COBOL Name: 600-0001-NO-INPUT-DATA
      * - sf528ServiceDateTime           COBOL Name: SF528-SERVICE-DATE-TIME
      *
      * Output :  

      * - zLogFirstRead100               COBOL Name: 100-Z-LOG-FIRST-READ
      * - highServiceTime800             COBOL Name: 800-HIGH-SERVICE-TIME
      * - lowServiceTime800              COBOL Name: 800-LOW-SERVICE-TIME
      * - sf528ServiceDateTime           COBOL Name: SF528-SERVICE-DATE-TIME
      *
      * @throws CFException
      */
      @Override
      public InitializeProgramOutCtx initializeProgram(InitializeProgramInCtx methodIn) throws Exception {
      
// ******************************************************************
// *    1 0 0 0 - I n i t i a l i z e - p r o g r a m.              *
// *                                                                *
// *    1. display start-up messages.                               *
// *    2. open files.                                              *
// ******************************************************************
Sf328010Ctx programCtx = methodIn.getSf328010Ctx();
InitializeProgramOutCtx methodOut = methodIn.getInitializeProgramOutCtx();
//  PERFORM 1100-BUILD-BEG-JOB-MSGS
          buildBegJobMsgs(programCtx.getBuildBegJobMsgsInCtx());/*1100-BUILD-BEG-JOB-MSGS*/
//  PERFORM 1200-OPEN-FILES
          openFiles(programCtx.getOpenFilesInCtx());/*1200-OPEN-FILES*/
//  PERFORM 1300-SETUP-WORK-AREA
          setupWorkArea(programCtx.getSetupWorkAreaInCtx());/*1300-SETUP-WORK-AREA*/
//  PERFORM 8000-READ-Z-LOG-FILE
          readZLogFile(programCtx.getReadZLogFileInCtx());/*8000-READ-Z-LOG-FILE*/
//  PERFORM 8110-WRITE-REPORT-HEADER
          writeReportHeader(programCtx.getWriteReportHeaderInCtx());/*8110-WRITE-REPORT-HEADER*/
//  IF 88-100-Z-LOG-EOF
          if ( methodIn.isZLogEof88100()  ) { 
//  DISPLAY 600-0001-NO-INPUT-DATA
              logger.info(new String(methodIn.getNoInputData6000001())); 
//  PERFORM 1400-BUILD-EMPTY-RPT
              buildEmptyRpt(programCtx.getBuildEmptyRptInCtx());/*1400-BUILD-EMPTY-RPT*/
          }
//  ELSE
          else { 
//  SET 88-100-NOT-FIRST-READ TO TRUE
              methodOut.setNotFirstRead88100True(); 
              
//  PERFORM 8200-MOVE-DATA-HOLD
              moveDataHold(programCtx.getMoveDataHoldInCtx());/*8200-MOVE-DATA-HOLD*/
//  MOVE SF528-SERVICE-DATE-TIME TO 800-HIGH-SERVICE-TIME 800-LOW-SERVICE-TIME
              methodOut.getHighServiceTime800().setString(methodOut.getSf528ServiceDateTime());
              methodOut.getLowServiceTime800().setString(methodOut.getSf528ServiceDateTime());
          }
      
      return methodOut;
      }
      /**
      * buildBegJobMsgs 
      *   This method is derived from 
  *   COBOL Paragraph - 1100-BUILD-BEG-JOB-MSGS COBOL Cyclomatic complexity - 1
      * Input  :  

      * - runMonth800                    COBOL Name: 800-RUN-MONTH
      * - execStartMsg600                COBOL Name: 600-EXEC-START-MSG
      * - compileInfoMsg600              COBOL Name: 600-COMPILE-INFO-MSG
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
      * - runDate701                     COBOL Name: 701-RUN-DATE
      * - mnthMmNum100                   COBOL Name: 100-MNTH-MM-NUM
      * - runMonth701                    COBOL Name: 701-RUN-MONTH
      * - runMonth800                    COBOL Name: 800-RUN-MONTH
      * - runYear701                     COBOL Name: 701-RUN-YEAR
      *
      * @throws CFException
      */
      @Override
      public BuildBegJobMsgsOutCtx buildBegJobMsgs(BuildBegJobMsgsInCtx methodIn) throws Exception {
      
// ******************************************************************
// *       1 1 0 0 - B u i l d - b e g - j o b - m s g s .          *
// ******************************************************************
Sf328010Ctx programCtx = methodIn.getSf328010Ctx();
BuildBegJobMsgsOutCtx methodOut = methodIn.getBuildBegJobMsgsOutCtx();
//  MOVE FUNCTION WHEN-COMPILED TO 800-FUNC-WHEN-COMPILED
          methodOut.getFuncWhenCompiled800().setString("2021100505475800     ".toCharArray());
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
//  MOVE 600-CURR-DATE-DD TO 701-RUN-DATE
          methodOut.setRunDate701(methodOut.getCurrDateDd600());
//  MOVE 600-CURR-DATE-MM TO 100-MNTH-MM-NUM
          methodOut.setMnthMmNum100(methodOut.getCurrDateMm600());
//  PERFORM 8300-BUILD-MONTH
          buildMonth(programCtx.getBuildMonthInCtx());/*8300-BUILD-MONTH*/
//  MOVE 800-RUN-MONTH TO 701-RUN-MONTH
          methodOut.setRunMonth701(methodOut.getRunMonth800());
//  MOVE 600-CURR-DATE-YYYY TO 701-RUN-YEAR
          methodOut.setRunYear701(methodOut.getCurrDateYyyy600());
//  DISPLAY 600-EXEC-START-MSG
          logger.info(new String(methodIn.getExecStartMsg600())); 
//  DISPLAY 600-COMPILE-INFO-MSG
          logger.info(methodIn.getCompileInfoMsg600().toString()); 
//  DISPLAY 600-CURRENT-RUN-MSG
          logger.info(methodIn.getCurrentRunMsg600().toString()); 
      
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
      
// *                 1 2 0 0 - O p e n - f i l e s .                *
// ******************************************************************
Sf328010Ctx programCtx = methodIn.getSf328010Ctx();
//  OPEN INPUT SYS001-Z-LOG-FILE OUTPUT SYS201-SERVICE-REPORT
          sys001ZLogFile.open(new String(CONSTANTS.MODE_READ_ONLY_36242),sys001ZLogFile.getFileName(),sys001ZLogFile.getSys001ZLogFileCharSet(),sys001ZLogFile.getSys001ZLogFileCrlfFlag());
          sys201ServiceReport.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),sys201ServiceReport.getFileName(),sys201ServiceReport.getSys201ServiceReportCharSet(),sys201ServiceReport.getSys201ServiceReportCrlfFlag());
      
      }
      /**
      * setupWorkArea 
      *   This method is derived from 
  *   COBOL Paragraph - 1300-SETUP-WORK-AREA COBOL Cyclomatic complexity - 1
      * Input  :  

      * - plus1300                       COBOL Name: 300-PLUS-1
      *
      * Output :  

      * - zLogFirstRead100               COBOL Name: 100-Z-LOG-FIRST-READ
      * - pageCount400                   COBOL Name: 400-PAGE-COUNT
      * - plus1300                       COBOL Name: 300-PLUS-1
      * - pageNum702                     COBOL Name: 702-PAGE-NUM
      *
      * @throws CFException
      */
      @Override
      public SetupWorkAreaOutCtx setupWorkArea(SetupWorkAreaInCtx methodIn) throws Exception {
      
// ******************************************************************
// *         1 3 0 0 - S e t u p - w o r k - a r e a .              *
// ******************************************************************
Sf328010Ctx programCtx = methodIn.getSf328010Ctx();
SetupWorkAreaOutCtx methodOut = methodIn.getSetupWorkAreaOutCtx();
//  SET 88-100-FIRST-READ TO TRUE
          methodOut.setFirstRead88100True(); 
          
//  MOVE 300-PLUS-1 TO 400-PAGE-COUNT
          methodOut.setPageCount400( methodOut.getPlus1300());
//  MOVE 400-PAGE-COUNT TO 702-PAGE-NUM
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          methodOut.setPageNum702(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(methodOut.getPageCount400()).toCharArray()));
      
      return methodOut;
      }
      /**
      * buildEmptyRpt 
      *   This method is derived from 
  *   COBOL Paragraph - 1400-BUILD-EMPTY-RPT COBOL Cyclomatic complexity - 1
      * Input  :  

      * - sys201ServiceRptRec            COBOL Name: SYS201-SERVICE-RPT-REC
      * - rpt1LineCount400               COBOL Name: 400-RPT1-LINE-COUNT
      * - plus4300                       COBOL Name: 300-PLUS-4
      *
      * Output :  

      * - rpt1LineCount400               COBOL Name: 400-RPT1-LINE-COUNT
      *
      * @throws CFException
      */
      @Override
      public BuildEmptyRptOutCtx buildEmptyRpt(BuildEmptyRptInCtx methodIn) throws Exception {
      
// ******************************************************************
// *         1 4 0 0 - B u i l d - e m p t y - r e p o r t.         *
// ******************************************************************
Sf328010Ctx programCtx = methodIn.getSf328010Ctx();
BuildEmptyRptOutCtx methodOut = methodIn.getBuildEmptyRptOutCtx();
//  WRITE SYS201-SERVICE-RPT-REC FROM 706-EMPTY-REPORT AFTER ADVANCING 300-NUM-4 LINES
          sys201ServiceReport.writeAfter(methodIn.getEmptyReport706(),methodIn.getNum4300());
          methodOut.getSys201ServiceRptRec().setString(CONSTANTS.LOW_VALUE_215751987);
//  ADD 300-PLUS-4 TO 400-RPT1-LINE-COUNT
          methodOut.setRpt1LineCount400(methodOut.getRpt1LineCount400()+(int) methodIn.getPlus4300());
      
      return methodOut;
      }
      /**
      * processZLogFile 
      *   This method is derived from 
  *   COBOL Paragraph - 2000-PROCESS-Z-LOG-FILE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sf528ServiceId                 COBOL Name: SF528-SERVICE-ID
      * - holdServiceId800               COBOL Name: 800-HOLD-SERVICE-ID
      *
      * Output :  

      * - holdServiceId800               COBOL Name: 800-HOLD-SERVICE-ID
      * - sf528ServiceId                 COBOL Name: SF528-SERVICE-ID
      *
      * @throws CFException
      */
      @Override
      public ProcessZLogFileOutCtx processZLogFile(ProcessZLogFileInCtx methodIn) throws Exception {
      
// ******************************************************************
// *         2 0 0 0 - P r o c e s s - z - l o g - f i l e s.       *
// ******************************************************************
Sf328010Ctx programCtx = methodIn.getSf328010Ctx();
ProcessZLogFileOutCtx methodOut = methodIn.getProcessZLogFileOutCtx();
//  IF SF528-SERVICE-ID NOT EQUAL 800-HOLD-SERVICE-ID
          if (		compareChars(methodOut.getSf528ServiceId(),methodOut.getHoldServiceId800()) != 0 ) { 
//  PERFORM 8100-GENERATE-REPORT
              generateReport(programCtx.getGenerateReportInCtx());/*8100-GENERATE-REPORT*/
//  PERFORM 8200-MOVE-DATA-HOLD
              moveDataHold(programCtx.getMoveDataHoldInCtx());/*8200-MOVE-DATA-HOLD*/
          }
//  ELSE
          else { 
              // MOVE SF528-SERVICE-ID TO 800-HOLD-SERVICE-ID
              methodOut.setHoldServiceId800(methodOut.getSf528ServiceId());
          }
//  PERFORM 2100-ACCUMULATE-DATA
          accumulateData(programCtx.getAccumulateDataInCtx());/*2100-ACCUMULATE-DATA*/
//  PERFORM 8000-READ-Z-LOG-FILE
          readZLogFile(programCtx.getReadZLogFileInCtx());/*8000-READ-Z-LOG-FILE*/
          ;
      
      return methodOut;
      }
      /**
      * accumulateData 
      *   This method is derived from 
  *   COBOL Paragraph - 2100-ACCUMULATE-DATA COBOL Cyclomatic complexity - 4
      * Input  :  

      * - totServiceCnt400               COBOL Name: 400-TOT-SERVICE-CNT
      * - plus1300                       COBOL Name: 300-PLUS-1
      * - sf528ServiceStatus             COBOL Name: SF528-SERVICE-STATUS
      * - litC300                        COBOL Name: 300-LIT-C
      * - successCnt400                  COBOL Name: 400-SUCCESS-CNT
      * - errorCnt400                    COBOL Name: 400-ERROR-CNT
      * - sumElapsedTime400              COBOL Name: 400-SUM-ELAPSED-TIME
      * - sf528ElapsedTime               COBOL Name: SF528-ELAPSED-TIME
      * - highElapseTime400              COBOL Name: 400-HIGH-ELAPSE-TIME
      * - lowElapseTime400               COBOL Name: 400-LOW-ELAPSE-TIME
      *
      * Output :  

      * - totServiceCnt400               COBOL Name: 400-TOT-SERVICE-CNT
      * - successCnt400                  COBOL Name: 400-SUCCESS-CNT
      * - errorCnt400                    COBOL Name: 400-ERROR-CNT
      * - sumElapsedTime400              COBOL Name: 400-SUM-ELAPSED-TIME
      * - highElapseTime400              COBOL Name: 400-HIGH-ELAPSE-TIME
      * - sf528ElapsedTime               COBOL Name: SF528-ELAPSED-TIME
      * - lowElapseTime400               COBOL Name: 400-LOW-ELAPSE-TIME
      *
      * @throws CFException
      */
      @Override
      public AccumulateDataOutCtx accumulateData(AccumulateDataInCtx methodIn) throws Exception {
      
// ******************************************************************
// *         2 1 0 0 - A c c u m u l a t e - d a t a .              *
// ******************************************************************
Sf328010Ctx programCtx = methodIn.getSf328010Ctx();
AccumulateDataOutCtx methodOut = methodIn.getAccumulateDataOutCtx();
//  ADD 300-PLUS-1 TO 400-TOT-SERVICE-CNT
          methodOut.setTotServiceCnt400(methodOut.getTotServiceCnt400()+(int) methodIn.getPlus1300());
//  IF SF528-SERVICE-STATUS EQUAL 300-LIT-C
          if (		compareChars(methodIn.getSf528ServiceStatus(),methodIn.getLitC300()) == 0 ) { 
//  ADD 300-PLUS-1 TO 400-SUCCESS-CNT
              methodOut.setSuccessCnt400(methodOut.getSuccessCnt400()+(int) methodIn.getPlus1300());
          }
//  ELSE
          else { 
//  ADD 300-PLUS-1 TO 400-ERROR-CNT
              methodOut.setErrorCnt400(methodOut.getErrorCnt400()+(int) methodIn.getPlus1300());
          }
//  ADD SF528-ELAPSED-TIME TO 400-SUM-ELAPSED-TIME
          methodOut.setSumElapsedTime400(methodOut.getSumElapsedTime400()+(int) methodOut.getSf528ElapsedTime());
//  IF 400-HIGH-ELAPSE-TIME LESS THAN SF528-ELAPSED-TIME
          if (	( methodOut.getHighElapseTime400() < methodOut.getSf528ElapsedTime() )) { 
//  MOVE SF528-ELAPSED-TIME TO 400-HIGH-ELAPSE-TIME
              methodOut.setHighElapseTime400(methodOut.getSf528ElapsedTime());
          }
//  ELSE
          else { 
//  IF 400-LOW-ELAPSE-TIME GREATER THAN SF528-ELAPSED-TIME
              if (	( methodOut.getLowElapseTime400() > methodOut.getSf528ElapsedTime() )) { 
//  MOVE SF528-ELAPSED-TIME TO 400-LOW-ELAPSE-TIME
                  methodOut.setLowElapseTime400(methodOut.getSf528ElapsedTime());
              }
          }
//  PERFORM 2110-CALCULATE-PERCENT
          calculatePercent(programCtx.getCalculatePercentInCtx());/*2110-CALCULATE-PERCENT*/
//  PERFORM 2120-CALCULATE-SERVICE-DT-TM
          calculateServiceDtTm(programCtx.getCalculateServiceDtTmInCtx());/*2120-CALCULATE-SERVICE-DT-TM*/
          ;
      
      return methodOut;
      }
      /**
      * calculatePercent 
      *   This method is derived from 
  *   COBOL Paragraph - 2110-CALCULATE-PERCENT COBOL Cyclomatic complexity - 1
      * Input  :  

      * - successCnt400                  COBOL Name: 400-SUCCESS-CNT
      * - totServiceCnt400               COBOL Name: 400-TOT-SERVICE-CNT
      * - num100300                      COBOL Name: 300-NUM-100
      * - errorCnt400                    COBOL Name: 400-ERROR-CNT
      * - sumElapsedTime400              COBOL Name: 400-SUM-ELAPSED-TIME
      *
      * Output :  

      * - successPercent400              COBOL Name: 400-SUCCESS-PERCENT
      * - errPercent400                  COBOL Name: 400-ERR-PERCENT
      * - avgElapsed400                  COBOL Name: 400-AVG-ELAPSED
      *
      * @throws CFException
      */
      @Override
      public CalculatePercentOutCtx calculatePercent(CalculatePercentInCtx methodIn) throws Exception {
      
// ******************************************************************
// *         2 1 1 0 - C a l c u l a t i o n  - p e r c e n t .     *
// ******************************************************************
Sf328010Ctx programCtx = methodIn.getSf328010Ctx();
CalculatePercentOutCtx methodOut = methodIn.getCalculatePercentOutCtx();
          methodOut.setSuccessPercent400(BigDecimal.valueOf(methodIn.getSuccessCnt400()).divide(BigDecimal.valueOf(methodIn.getTotServiceCnt400()),18,RoundingMode.DOWN).setScale(3,BigDecimal.ROUND_DOWN).multiply(BigDecimal.valueOf(methodIn.getNum100300())).setScale(2,RoundingMode.HALF_UP));
          if(methodOut.getSuccessPercent400().signum() < 0 )  methodOut.setSuccessPercent400(methodOut.getSuccessPercent400().negate());
          methodOut.setErrPercent400(BigDecimal.valueOf(methodIn.getErrorCnt400()).divide(BigDecimal.valueOf(methodIn.getTotServiceCnt400()),18,RoundingMode.DOWN).setScale(3,BigDecimal.ROUND_DOWN).multiply(BigDecimal.valueOf(methodIn.getNum100300())).setScale(2,RoundingMode.HALF_UP));
          if(methodOut.getErrPercent400().signum() < 0 )  methodOut.setErrPercent400(methodOut.getErrPercent400().negate());
          methodOut.setAvgElapsed400(BigDecimal.valueOf(methodIn.getSumElapsedTime400()).divide(BigDecimal.valueOf(methodIn.getTotServiceCnt400()),18,RoundingMode.DOWN).setScale(3,BigDecimal.ROUND_DOWN).setScale(2,RoundingMode.HALF_UP));
          if(methodOut.getAvgElapsed400().signum() < 0 )  methodOut.setAvgElapsed400(methodOut.getAvgElapsed400().negate());
      
      return methodOut;
      }
      /**
      * calculateServiceDtTm 
      *   This method is derived from 
  *   COBOL Paragraph - 2120-CALCULATE-SERVICE-DT-TM COBOL Cyclomatic complexity - 3
      * Input  :  

      * - highServiceTime800             COBOL Name: 800-HIGH-SERVICE-TIME
      * - sf528ServiceDateTime           COBOL Name: SF528-SERVICE-DATE-TIME
      * - lowServiceTime800              COBOL Name: 800-LOW-SERVICE-TIME
      *
      * Output :  

      * - highServiceTime800             COBOL Name: 800-HIGH-SERVICE-TIME
      * - sf528ServiceDateTime           COBOL Name: SF528-SERVICE-DATE-TIME
      * - lowServiceTime800              COBOL Name: 800-LOW-SERVICE-TIME
      *
      * @throws CFException
      */
      @Override
      public CalculateServiceDtTmOutCtx calculateServiceDtTm(CalculateServiceDtTmInCtx methodIn) throws Exception {
      
// ******************************************************************
// ** 2 1 2 0 - C a l c u l a t e - s e r v i c e - d t - t m .   *
// ******************************************************************
Sf328010Ctx programCtx = methodIn.getSf328010Ctx();
CalculateServiceDtTmOutCtx methodOut = methodIn.getCalculateServiceDtTmOutCtx();
//  IF 800-HIGH-SERVICE-TIME LESS THAN SF528-SERVICE-DATE-TIME
          if (		compareChars(methodOut.getHighServiceTime800(),methodOut.getSf528ServiceDateTime()) < 0 ) { 
//  MOVE SF528-SERVICE-DATE-TIME TO 800-HIGH-SERVICE-TIME
              methodOut.getHighServiceTime800().setString(methodOut.getSf528ServiceDateTime());
          }
//  ELSE
          else { 
//  IF 800-LOW-SERVICE-TIME GREATER THAN SF528-SERVICE-DATE-TIME
              if (		compareChars(methodOut.getLowServiceTime800(),methodOut.getSf528ServiceDateTime()) > 0 ) { 
//  MOVE SF528-SERVICE-DATE-TIME TO 800-LOW-SERVICE-TIME
                  methodOut.getLowServiceTime800().setString(methodOut.getSf528ServiceDateTime());
              }
          }
      
      return methodOut;
      }
      /**
      * displayServiceDate 
      *   This method is derived from 
  *   COBOL Paragraph - 3000-DISPLAY-SERVICE-DATE COBOL Cyclomatic complexity - 1
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
      * - sys201ServiceRptRec            COBOL Name: SYS201-SERVICE-RPT-REC
      * - rpt1LineCount400               COBOL Name: 400-RPT1-LINE-COUNT
      * - plus4300                       COBOL Name: 300-PLUS-4
      *
      * Output :  

      * - lserviceDate705                COBOL Name: 705-LSERVICE-DATE
      * - lserviceDd800                  COBOL Name: 800-LSERVICE-DD
      * - mnthMmNum100                   COBOL Name: 100-MNTH-MM-NUM
      * - lserviceMm800                  COBOL Name: 800-LSERVICE-MM
      * - lserviceMonth705               COBOL Name: 705-LSERVICE-MONTH
      * - runMonth800                    COBOL Name: 800-RUN-MONTH
      * - lserviceCentury705             COBOL Name: 705-LSERVICE-CENTURY
      * - lserviceCc800                  COBOL Name: 800-LSERVICE-CC
      * - lserviceYear705                COBOL Name: 705-LSERVICE-YEAR
      * - lserviceYy800                  COBOL Name: 800-LSERVICE-YY
      * - lserviceHh705                  COBOL Name: 705-LSERVICE-HH
      * - lserviceHh800                  COBOL Name: 800-LSERVICE-HH
      * - lserviceMins705                COBOL Name: 705-LSERVICE-MINS
      * - lserviceMins800                COBOL Name: 800-LSERVICE-MINS
      * - lserviceSec705                 COBOL Name: 705-LSERVICE-SEC
      * - lserviceSec800                 COBOL Name: 800-LSERVICE-SEC
      * - hserviceDate705                COBOL Name: 705-HSERVICE-DATE
      * - hserviceDd800                  COBOL Name: 800-HSERVICE-DD
      * - hserviceMm800                  COBOL Name: 800-HSERVICE-MM
      * - hserviceMonth705               COBOL Name: 705-HSERVICE-MONTH
      * - hserviceCentury705             COBOL Name: 705-HSERVICE-CENTURY
      * - hserviceCc800                  COBOL Name: 800-HSERVICE-CC
      * - hserviceYear705                COBOL Name: 705-HSERVICE-YEAR
      * - hserviceYy800                  COBOL Name: 800-HSERVICE-YY
      * - hserviceHh705                  COBOL Name: 705-HSERVICE-HH
      * - hserviceHh800                  COBOL Name: 800-HSERVICE-HH
      * - hserviceMins705                COBOL Name: 705-HSERVICE-MINS
      * - hserviceMins800                COBOL Name: 800-HSERVICE-MINS
      * - hserviceSec705                 COBOL Name: 705-HSERVICE-SEC
      * - hserviceSec800                 COBOL Name: 800-HSERVICE-SEC
      * - rpt1LineCount400               COBOL Name: 400-RPT1-LINE-COUNT
      *
      * @throws CFException
      */
      @Override
      public DisplayServiceDateOutCtx displayServiceDate(DisplayServiceDateInCtx methodIn) throws Exception {
      
// ******************************************************************
// *       3 0 0 0 - D i s p l a y - s e r v i c e - d a t e .      *
// ******************************************************************
Sf328010Ctx programCtx = methodIn.getSf328010Ctx();
DisplayServiceDateOutCtx methodOut = methodIn.getDisplayServiceDateOutCtx();
//  MOVE 800-LSERVICE-DD TO 705-LSERVICE-DATE
          methodOut.setLserviceDate705(methodOut.getLserviceDd800());
//  MOVE 800-LSERVICE-MM TO 100-MNTH-MM-NUM
          methodOut.setMnthMmNum100(methodOut.getLserviceMm800());
//  PERFORM 8300-BUILD-MONTH
          buildMonth(programCtx.getBuildMonthInCtx());/*8300-BUILD-MONTH*/
//  MOVE 800-RUN-MONTH TO 705-LSERVICE-MONTH
          methodOut.setLserviceMonth705(methodOut.getRunMonth800());
//  MOVE 800-LSERVICE-CC TO 705-LSERVICE-CENTURY
          methodOut.setLserviceCentury705(methodOut.getLserviceCc800());
//  MOVE 800-LSERVICE-YY TO 705-LSERVICE-YEAR
          methodOut.setLserviceYear705(methodOut.getLserviceYy800());
//  MOVE 800-LSERVICE-HH TO 705-LSERVICE-HH
          methodOut.setLserviceHh705(methodOut.getLserviceHh800());
//  MOVE 800-LSERVICE-MINS TO 705-LSERVICE-MINS
          methodOut.setLserviceMins705(methodOut.getLserviceMins800());
//  MOVE 800-LSERVICE-SEC TO 705-LSERVICE-SEC
          methodOut.setLserviceSec705(methodOut.getLserviceSec800());
//  MOVE 800-HSERVICE-DD TO 705-HSERVICE-DATE
          methodOut.setHserviceDate705(methodOut.getHserviceDd800());
//  MOVE 800-HSERVICE-MM TO 100-MNTH-MM-NUM
          methodOut.setMnthMmNum100(methodOut.getHserviceMm800());
//  PERFORM 8300-BUILD-MONTH
          buildMonth(programCtx.getBuildMonthInCtx());/*8300-BUILD-MONTH*/
//  MOVE 800-RUN-MONTH TO 705-HSERVICE-MONTH
          methodOut.setHserviceMonth705(methodOut.getRunMonth800());
//  MOVE 800-HSERVICE-CC TO 705-HSERVICE-CENTURY
          methodOut.setHserviceCentury705(methodOut.getHserviceCc800());
//  MOVE 800-HSERVICE-YY TO 705-HSERVICE-YEAR
          methodOut.setHserviceYear705(methodOut.getHserviceYy800());
//  MOVE 800-HSERVICE-HH TO 705-HSERVICE-HH
          methodOut.setHserviceHh705(methodOut.getHserviceHh800());
//  MOVE 800-HSERVICE-MINS TO 705-HSERVICE-MINS
          methodOut.setHserviceMins705(methodOut.getHserviceMins800());
//  MOVE 800-HSERVICE-SEC TO 705-HSERVICE-SEC
          methodOut.setHserviceSec705(methodOut.getHserviceSec800());
//  WRITE SYS201-SERVICE-RPT-REC FROM 705-DETAIL-DATA2 AFTER ADVANCING 300-NUM-4 LINES
          sys201ServiceReport.writeAfter(methodIn.getDetailData2705().toCharArray(),methodIn.getNum4300());
          methodOut.getSys201ServiceRptRec().setString(CONSTANTS.LOW_VALUE_215751987);
//  ADD 300-PLUS-4 TO 400-RPT1-LINE-COUNT
          methodOut.setRpt1LineCount400(methodOut.getRpt1LineCount400()+(int) methodIn.getPlus4300());
      
      return methodOut;
      }
      /**
      * readZLogFile 
      *   This method is derived from 
  *   COBOL Paragraph - 8000-READ-Z-LOG-FILE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - zLogFirstRead100               COBOL Name: 100-Z-LOG-FIRST-READ
      * - zLogCnt400                     COBOL Name: 400-Z-LOG-CNT
      * - plus1300                       COBOL Name: 300-PLUS-1
      *
      * Output :  

      * - group1                         COBOL Name: FILLER
      * - zLogEofSw100                   COBOL Name: 100-Z-LOG-EOF-SW
      * - zLogCnt400                     COBOL Name: 400-Z-LOG-CNT
      *
      * @throws CFException
      */
      @Override
      public ReadZLogFileOutCtx readZLogFile(ReadZLogFileInCtx methodIn) throws Exception {
      
// ******************************************************************
// *       8 0 0 0 - R e a d - z - l o g - f i l e .                *
// ******************************************************************
Sf328010Ctx programCtx = methodIn.getSf328010Ctx();
ReadZLogFileOutCtx methodOut = methodIn.getReadZLogFileOutCtx();
          // READ SYS001-Z-LOG-FILE INTO SF528-EXTRACT-Z-LOG-REC
          sys001ZLogFile.read();
          if (!sys001ZLogFile.hasEnded()) {
            methodIn.getSf528ExtractZLogRec().setString(sys001ZLogFile.getRecord());
            methodOut.getGroup1().setString(sys001ZLogFile.getRecord());
          }
//  AT END
          if (sys001ZLogFile.hasEnded()) {  
//  SET 88-100-Z-LOG-EOF TO TRUE
              methodOut.setZLogEof88100True(); 
              
//  IF 88-100-FIRST-READ
//  ELSE
              if (!(methodIn.isFirstRead88100()) ) { 
//  PERFORM 8100-GENERATE-REPORT
                  generateReport(programCtx.getGenerateReportInCtx());/*8100-GENERATE-REPORT*/
              }
            }
//  NOT AT END
          else  {
//  ADD 300-PLUS-1 TO 400-Z-LOG-CNT
              methodOut.setZLogCnt400(methodOut.getZLogCnt400()+(int) methodIn.getPlus1300());
            }
      
      return methodOut;
      }
      /**
      * generateReport 
      *   This method is derived from 
  *   COBOL Paragraph - 8100-GENERATE-REPORT COBOL Cyclomatic complexity - 2
      * Input  :  

      * - rpt1LineCount400               COBOL Name: 400-RPT1-LINE-COUNT
      * - maxLinesPerPage300             COBOL Name: 300-MAX-LINES-PER-PAGE
      * - pageCount400                   COBOL Name: 400-PAGE-COUNT
      * - plus1300                       COBOL Name: 300-PLUS-1
      *
      * Output :  

      * - pageCount400                   COBOL Name: 400-PAGE-COUNT
      * - pageNum702                     COBOL Name: 702-PAGE-NUM
      * - rpt1LineCount400               COBOL Name: 400-RPT1-LINE-COUNT
      *
      * @throws CFException
      */
      @Override
      public GenerateReportOutCtx generateReport(GenerateReportInCtx methodIn) throws Exception {
      
// ****************************************************************
// *       8 1 0 0 - G e n e r a t e - r e p o r t .              *
// ****************************************************************
Sf328010Ctx programCtx = methodIn.getSf328010Ctx();
GenerateReportOutCtx methodOut = methodIn.getGenerateReportOutCtx();
//  IF 400-RPT1-LINE-COUNT GREATER THAN 300-MAX-LINES-PER-PAGE
          if (	( methodOut.getRpt1LineCount400() > methodIn.getMaxLinesPerPage300() ) ) { 
//  ADD 300-PLUS-1 TO 400-PAGE-COUNT
              methodOut.setPageCount400(methodOut.getPageCount400()+(int) methodIn.getPlus1300());
//  MOVE 400-PAGE-COUNT TO 702-PAGE-NUM
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
              methodOut.setPageNum702(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(methodOut.getPageCount400()).toCharArray()));
//  MOVE ZEROES TO 400-RPT1-LINE-COUNT
              methodOut.setRpt1LineCount400(0);
//  PERFORM 8110-WRITE-REPORT-HEADER
              writeReportHeader(programCtx.getWriteReportHeaderInCtx());/*8110-WRITE-REPORT-HEADER*/
          }
//  PERFORM 8120-WRITE-DETAIL
          writeDetail(programCtx.getWriteDetailInCtx());/*8120-WRITE-DETAIL*/
          ;
      
      return methodOut;
      }
      /**
      * writeReportHeader 
      *   This method is derived from 
  *   COBOL Paragraph - 8110-WRITE-REPORT-HEADER COBOL Cyclomatic complexity - 1
      * Input  :  

      * - sys201ServiceRptRec            COBOL Name: SYS201-SERVICE-RPT-REC
      * - plus7300                       COBOL Name: 300-PLUS-7
      *
      * Output :  

      * - rpt1LineCount400               COBOL Name: 400-RPT1-LINE-COUNT
      * - plus7300                       COBOL Name: 300-PLUS-7
      *
      * @throws CFException
      */
      @Override
      public WriteReportHeaderOutCtx writeReportHeader(WriteReportHeaderInCtx methodIn) throws Exception {
      
// ****************************************************************
// *  8 1 1 0 - W r i t e - r e p o r t - h e a d e r .           *
// ****************************************************************
Sf328010Ctx programCtx = methodIn.getSf328010Ctx();
WriteReportHeaderOutCtx methodOut = methodIn.getWriteReportHeaderOutCtx();
//  WRITE SYS201-SERVICE-RPT-REC FROM 701-HEADER-LINE-1 AFTER ADVANCING PAGE
          sys201ServiceReport.writeWithPageBreakAfter(methodIn.getHeaderLine1701().toCharArray());
          methodOut.getSys201ServiceRptRec().setString(CONSTANTS.LOW_VALUE_215751987);
//  WRITE SYS201-SERVICE-RPT-REC FROM 702-HEADER-LINE-2 AFTER ADVANCING 300-NUM-2 LINE
          sys201ServiceReport.writeAfter(methodIn.getHeaderLine2702().toCharArray(),methodIn.getNum2300());
          methodOut.getSys201ServiceRptRec().setString(CONSTANTS.LOW_VALUE_215751987);
//  WRITE SYS201-SERVICE-RPT-REC FROM 703-HEADER-LINE-3 AFTER ADVANCING 300-NUM-4 LINES
          sys201ServiceReport.writeAfter(methodIn.getHeaderLine3703(),methodIn.getNum4300());
          methodOut.getSys201ServiceRptRec().setString(CONSTANTS.LOW_VALUE_215751987);
//  WRITE SYS201-SERVICE-RPT-REC FROM 704-HEADER-LINE-4 AFTER ADVANCING 300-NUM-1 LINE
          sys201ServiceReport.writeAfter(methodIn.getHeaderLine4704(),methodIn.getNum1300());
          methodOut.getSys201ServiceRptRec().setString(CONSTANTS.LOW_VALUE_215751987);
//  MOVE 300-PLUS-7 TO 400-RPT1-LINE-COUNT
          methodOut.setRpt1LineCount400( methodOut.getPlus7300());
      
      return methodOut;
      }
      /**
      * writeDetail 
      *   This method is derived from 
  *   COBOL Paragraph - 8120-WRITE-DETAIL COBOL Cyclomatic complexity - 1
      * Input  :  

      * - holdServiceId800               COBOL Name: 800-HOLD-SERVICE-ID
      * - totServiceCnt800               COBOL Name: 800-TOT-SERVICE-CNT
      * - successCnt800                  COBOL Name: 800-SUCCESS-CNT
      * - successPercent800              COBOL Name: 800-SUCCESS-PERCENT
      * - errorCnt800                    COBOL Name: 800-ERROR-CNT
      * - unsuccessPercent800            COBOL Name: 800-UNSUCCESS-PERCENT
      * - avgElapsed800                  COBOL Name: 800-AVG-ELAPSED
      * - highElapseTime800              COBOL Name: 800-HIGH-ELAPSE-TIME
      * - lowElapseTime800               COBOL Name: 800-LOW-ELAPSE-TIME
      * - sys201ServiceRptRec            COBOL Name: SYS201-SERVICE-RPT-REC
      * - rpt1LineCount400               COBOL Name: 400-RPT1-LINE-COUNT
      * - plus4300                       COBOL Name: 300-PLUS-4
      * - plus1300                       COBOL Name: 300-PLUS-1
      * - totRecWritten400               COBOL Name: 400-TOT-REC-WRITTEN
      *
      * Output :  

      * - serviceId705                   COBOL Name: 705-SERVICE-ID
      * - holdServiceId800               COBOL Name: 800-HOLD-SERVICE-ID
      * - totalCnt705                    COBOL Name: 705-TOTAL-CNT
      * - totServiceCnt800               COBOL Name: 800-TOT-SERVICE-CNT
      * - successCnt705                  COBOL Name: 705-SUCCESS-CNT
      * - successCnt800                  COBOL Name: 800-SUCCESS-CNT
      * - successPercent705              COBOL Name: 705-SUCCESS-PERCENT
      * - successPercent800              COBOL Name: 800-SUCCESS-PERCENT
      * - errCnt705                      COBOL Name: 705-ERR-CNT
      * - errorCnt800                    COBOL Name: 800-ERROR-CNT
      * - errPercent705                  COBOL Name: 705-ERR-PERCENT
      * - unsuccessPercent800            COBOL Name: 800-UNSUCCESS-PERCENT
      * - avgTime705                     COBOL Name: 705-AVG-TIME
      * - avgElapsed800                  COBOL Name: 800-AVG-ELAPSED
      * - highTime705                    COBOL Name: 705-HIGH-TIME
      * - highElapseTime800              COBOL Name: 800-HIGH-ELAPSE-TIME
      * - lowTime705                     COBOL Name: 705-LOW-TIME
      * - lowElapseTime800               COBOL Name: 800-LOW-ELAPSE-TIME
      * - rpt1LineCount400               COBOL Name: 400-RPT1-LINE-COUNT
      * - totRecWritten400               COBOL Name: 400-TOT-REC-WRITTEN
      * - successCnt400                  COBOL Name: 400-SUCCESS-CNT
      * - errorCnt400                    COBOL Name: 400-ERROR-CNT
      * - totServiceCnt400               COBOL Name: 400-TOT-SERVICE-CNT
      * - sumElapsedTime400              COBOL Name: 400-SUM-ELAPSED-TIME
      *
      * @throws CFException
      */
      @Override
      public WriteDetailOutCtx writeDetail(WriteDetailInCtx methodIn) throws Exception {
      
// ****************************************************************
// *   8 1 2 0 - W r i t e - r e p o r t - d e t a i l .          *
// ****************************************************************
Sf328010Ctx programCtx = methodIn.getSf328010Ctx();
WriteDetailOutCtx methodOut = methodIn.getWriteDetailOutCtx();
//  PERFORM 8121-FORMAT-DATA
          formatData(programCtx.getFormatDataInCtx());/*8121-FORMAT-DATA*/
//  MOVE 800-HOLD-SERVICE-ID TO 705-SERVICE-ID
          methodOut.setServiceId705(methodOut.getHoldServiceId800());
//  PERFORM 8122-BUILD-SERVICE-ID-DESC
          buildServiceIdDesc(programCtx.getBuildServiceIdDescInCtx());/*8122-BUILD-SERVICE-ID-DESC*/
          // MOVE 800-TOT-SERVICE-CNT TO 705-TOTAL-CNT
          methodOut.setTotalCnt705(methodOut.getTotServiceCnt800());
          // MOVE 800-SUCCESS-CNT TO 705-SUCCESS-CNT
          methodOut.setSuccessCnt705(methodOut.getSuccessCnt800());
          // MOVE 800-SUCCESS-PERCENT TO 705-SUCCESS-PERCENT
          methodOut.setSuccessPercent705(methodOut.getSuccessPercent800());
          // MOVE 800-ERROR-CNT TO 705-ERR-CNT
          methodOut.setErrCnt705(methodOut.getErrorCnt800());
          // MOVE 800-UNSUCCESS-PERCENT TO 705-ERR-PERCENT
          methodOut.setErrPercent705(methodOut.getUnsuccessPercent800());
          // MOVE 800-AVG-ELAPSED TO 705-AVG-TIME
          methodOut.setAvgTime705(methodOut.getAvgElapsed800());
          // MOVE 800-HIGH-ELAPSE-TIME TO 705-HIGH-TIME
          methodOut.setHighTime705(methodOut.getHighElapseTime800());
          // MOVE 800-LOW-ELAPSE-TIME TO 705-LOW-TIME
          methodOut.setLowTime705(methodOut.getLowElapseTime800());
//  WRITE SYS201-SERVICE-RPT-REC FROM 705-DETAIL-DATA AFTER ADVANCING 300-NUM-4 LINES
          sys201ServiceReport.writeAfter(methodIn.getDetailData705().toCharArray(),methodIn.getNum4300());
          methodOut.getSys201ServiceRptRec().setString(CONSTANTS.LOW_VALUE_215751987);
//  ADD 300-PLUS-4 TO 400-RPT1-LINE-COUNT
          methodOut.setRpt1LineCount400(methodOut.getRpt1LineCount400()+(int) methodIn.getPlus4300());
//  WRITE SYS201-SERVICE-RPT-REC FROM 705-DETAIL-DATA1 AFTER ADVANCING 300-NUM-1 LINES
          sys201ServiceReport.writeAfter(methodIn.getDetailData1705().toCharArray(),methodIn.getNum1300());
          methodOut.getSys201ServiceRptRec().setString(CONSTANTS.LOW_VALUE_215751987);
//  ADD 300-PLUS-1 TO 400-RPT1-LINE-COUNT
          methodOut.setRpt1LineCount400(methodOut.getRpt1LineCount400()+(int) methodIn.getPlus1300());
//  ADD 300-PLUS-1 TO 400-TOT-REC-WRITTEN
          methodOut.setTotRecWritten400(methodOut.getTotRecWritten400()+(int) methodIn.getPlus1300());
//  MOVE ZEROES TO 400-SUCCESS-CNT 400-ERROR-CNT 400-TOT-SERVICE-CNT 800-SUCCESS-PERCENT 800-UNSUCCESS-PERCENT 400-SUM-ELAPSED-TIME
//  FORMAT_27653163 = "ZZ9.99", FORMAT_27653163 = "ZZ9.99"
          methodOut.setSuccessCnt400(0);
          methodOut.setErrorCnt400(0);
          methodOut.setTotServiceCnt400(0);
          methodOut.setSuccessPercent800(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_27653163,CONSTANTS.ZERO_6));
          methodOut.setUnsuccessPercent800(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_27653163,CONSTANTS.ZERO_6));
          methodOut.setSumElapsedTime400(0);
      
      return methodOut;
      }
      /**
      * formatData 
      *   This method is derived from 
  *   COBOL Paragraph - 8121-FORMAT-DATA COBOL Cyclomatic complexity - 1
      * Input  :  

      * - successCnt400                  COBOL Name: 400-SUCCESS-CNT
      * - errorCnt400                    COBOL Name: 400-ERROR-CNT
      * - totServiceCnt400               COBOL Name: 400-TOT-SERVICE-CNT
      * - successPercent400              COBOL Name: 400-SUCCESS-PERCENT
      * - errPercent400                  COBOL Name: 400-ERR-PERCENT
      * - lowElapseTime400               COBOL Name: 400-LOW-ELAPSE-TIME
      * - highElapseTime400              COBOL Name: 400-HIGH-ELAPSE-TIME
      * - avgElapsed400                  COBOL Name: 400-AVG-ELAPSED
      *
      * Output :  

      * - successCnt800                  COBOL Name: 800-SUCCESS-CNT
      * - successCnt400                  COBOL Name: 400-SUCCESS-CNT
      * - errorCnt800                    COBOL Name: 800-ERROR-CNT
      * - errorCnt400                    COBOL Name: 400-ERROR-CNT
      * - totServiceCnt800               COBOL Name: 800-TOT-SERVICE-CNT
      * - totServiceCnt400               COBOL Name: 400-TOT-SERVICE-CNT
      * - successPercent800              COBOL Name: 800-SUCCESS-PERCENT
      * - successPercent400              COBOL Name: 400-SUCCESS-PERCENT
      * - unsuccessPercent800            COBOL Name: 800-UNSUCCESS-PERCENT
      * - errPercent400                  COBOL Name: 400-ERR-PERCENT
      * - lowElapseTime800               COBOL Name: 800-LOW-ELAPSE-TIME
      * - lowElapseTime400               COBOL Name: 400-LOW-ELAPSE-TIME
      * - highElapseTime800              COBOL Name: 800-HIGH-ELAPSE-TIME
      * - highElapseTime400              COBOL Name: 400-HIGH-ELAPSE-TIME
      * - avgElapsed800                  COBOL Name: 800-AVG-ELAPSED
      * - avgElapsed400                  COBOL Name: 400-AVG-ELAPSED
      *
      * @throws CFException
      */
      @Override
      public FormatDataOutCtx formatData(FormatDataInCtx methodIn) throws Exception {
      
// ****************************************************************
// *       8 1 2 1 - F o r m a t - d a t a  .                     *
// ****************************************************************
Sf328010Ctx programCtx = methodIn.getSf328010Ctx();
FormatDataOutCtx methodOut = methodIn.getFormatDataOutCtx();
//  MOVE 400-SUCCESS-CNT TO 800-SUCCESS-CNT
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          methodOut.setSuccessCnt800(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(methodOut.getSuccessCnt400()).toCharArray()));
//  MOVE 400-ERROR-CNT TO 800-ERROR-CNT
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          methodOut.setErrorCnt800(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(methodOut.getErrorCnt400()).toCharArray()));
//  MOVE 400-TOT-SERVICE-CNT TO 800-TOT-SERVICE-CNT
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          methodOut.setTotServiceCnt800(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(methodOut.getTotServiceCnt400()).toCharArray()));
//  MOVE 400-SUCCESS-PERCENT TO 800-SUCCESS-PERCENT
//  FORMAT_27653163 = "ZZ9.99"
          methodOut.setSuccessPercent800(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_27653163,methodOut.getSuccessPercent400().toPlainString().toCharArray()));
//  MOVE 400-ERR-PERCENT TO 800-UNSUCCESS-PERCENT
//  FORMAT_27653163 = "ZZ9.99"
          methodOut.setUnsuccessPercent800(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_27653163,methodOut.getErrPercent400().toPlainString().toCharArray()));
//  MOVE 400-LOW-ELAPSE-TIME TO 800-LOW-ELAPSE-TIME
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          methodOut.setLowElapseTime800(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(methodOut.getLowElapseTime400()).toCharArray()));
//  MOVE 400-HIGH-ELAPSE-TIME TO 800-HIGH-ELAPSE-TIME
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          methodOut.setHighElapseTime800(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(methodOut.getHighElapseTime400()).toCharArray()));
//  MOVE 400-AVG-ELAPSED TO 800-AVG-ELAPSED
//  FORMAT_1949449721 = "ZZZ,ZZZ,ZZ9.99"
          methodOut.setAvgElapsed800(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1949449721,methodOut.getAvgElapsed400().toPlainString().toCharArray()));
      
      return methodOut;
      }
      /**
      * buildServiceIdDesc 
      *   This method is derived from 
  *   COBOL Paragraph - 8122-BUILD-SERVICE-ID-DESC COBOL Cyclomatic complexity - 2
      * Input  :  

      * - num1300                        COBOL Name: 300-NUM-1
      * - sf535ZlogServiceEntry          COBOL Name: SF535-ZLOG-SERVICE-ENTRY
      * - litUnknwn300                   COBOL Name: 300-LIT-UNKNWN
      * - sf535ZlogService               COBOL Name: SF535-ZLOG-SERVICE
      * - holdServiceId800               COBOL Name: 800-HOLD-SERVICE-ID
      * - sf535ZservDesc                 COBOL Name: SF535-ZSERV-DESC
      *
      * Output :  

      * - sf535X                         COBOL Name: SF535-X
      * - serviceName705                 COBOL Name: 705-SERVICE-NAME
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
// * 8 1 2 2 - B u i l d - s e r v i c e - i d - d e s c .        *
// ****************************************************************
Sf328010Ctx programCtx = methodIn.getSf328010Ctx();
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
             searchCompare = compareAscending(methodIn.getSf535ZlogService(searchMidPoint),methodIn.getHoldServiceId800());
          // end of compare logic
          	if (searchCompare == 0 ) { // if search found
          	      keepSearching = false;
          	     methodOut.setSf535X(searchMidPoint + 1);
//  MOVE SF535-ZSERV-DESC ( SF535-X ) TO 705-SERVICE-NAME
              methodOut.setServiceName705(pad(64,methodOut.getSf535ZservDesc(methodOut.getSf535X() - 1),SPACE_CHAR,RIGHT_PAD));
          	} else  {
          		adjustSearchIndex(searchCompare,searchIndexes);
          		searchLowPoint  = searchIndexes[0];
           		searchMidPoint  = searchIndexes[1];
           		searchHighPoint = searchIndexes[2];
           		if (searchMidPoint == -1) { // search exhausted
           		    keepSearching = false; 
//  MOVE 300-LIT-UNKNWN TO 705-SERVICE-NAME
              methodOut.setServiceName705(pad(64,methodOut.getLitUnknwn300(),SPACE_CHAR,RIGHT_PAD));
           		}
          	}
          }
      
      return methodOut;
      }
      /**
      * moveDataHold 
      *   This method is derived from 
  *   COBOL Paragraph - 8200-MOVE-DATA-HOLD COBOL Cyclomatic complexity - 1
      * Input  :  

      * - sf528ServiceId                 COBOL Name: SF528-SERVICE-ID
      * - sf528ElapsedTime               COBOL Name: SF528-ELAPSED-TIME
      *
      * Output :  

      * - holdServiceId800               COBOL Name: 800-HOLD-SERVICE-ID
      * - sf528ServiceId                 COBOL Name: SF528-SERVICE-ID
      * - highElapseTime400              COBOL Name: 400-HIGH-ELAPSE-TIME
      * - lowElapseTime400               COBOL Name: 400-LOW-ELAPSE-TIME
      * - sf528ElapsedTime               COBOL Name: SF528-ELAPSED-TIME
      *
      * @throws CFException
      */
      @Override
      public MoveDataHoldOutCtx moveDataHold(MoveDataHoldInCtx methodIn) throws Exception {
      
// ******************************************************************
// *         8 3 0 0 - M o v e - d a t a - h o l d .                *
// ******************************************************************
Sf328010Ctx programCtx = methodIn.getSf328010Ctx();
MoveDataHoldOutCtx methodOut = methodIn.getMoveDataHoldOutCtx();
          // MOVE SF528-SERVICE-ID TO 800-HOLD-SERVICE-ID
          methodOut.setHoldServiceId800(methodOut.getSf528ServiceId());
//  MOVE SF528-ELAPSED-TIME TO 400-HIGH-ELAPSE-TIME 400-LOW-ELAPSE-TIME
          methodOut.setHighElapseTime400(methodOut.getSf528ElapsedTime());
          methodOut.setLowElapseTime400(methodOut.getSf528ElapsedTime());
      
      return methodOut;
      }
      /**
      * buildMonth 
      *   This method is derived from 
  *   COBOL Paragraph - 8300-BUILD-MONTH COBOL Cyclomatic complexity - 14
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
// *           8 3 0 0 - B u i l d - m o n t h .                    *
// ******************************************************************
Sf328010Ctx programCtx = methodIn.getSf328010Ctx();
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

      * - message6008000                 COBOL Name: 600-8000-MESSAGE
      * - zLogCnt400                     COBOL Name: 400-Z-LOG-CNT
      * - message6008001                 COBOL Name: 600-8001-MESSAGE
      * - totRecWritten400               COBOL Name: 400-TOT-REC-WRITTEN
      * - message6008002                 COBOL Name: 600-8002-MESSAGE
      * - message6008999                 COBOL Name: 600-8999-MESSAGE
      * - eojMessage6009500              COBOL Name: 600-9500-EOJ-MESSAGE
      *
      * Output :  

      * - sys001Read6008001              COBOL Name: 600-8001-SYS001-READ
      * - zLogCnt400                     COBOL Name: 400-Z-LOG-CNT
      * - sys201Written6008002           COBOL Name: 600-8002-SYS201-WRITTEN
      * - totRecWritten400               COBOL Name: 400-TOT-REC-WRITTEN
      *
      * @throws CFException
      */
      @Override
      public TerminateProgramOutCtx terminateProgram(TerminateProgramInCtx methodIn) throws Exception {
      
// ******************************************************************
// *      9 0 0 0 - T e r m i n a t e - p r o g r a m               *
// *                                                                *
// *    1. close file.                                              *
// *    2. display record counts.                                   *
// ******************************************************************
Sf328010Ctx programCtx = methodIn.getSf328010Ctx();
TerminateProgramOutCtx methodOut = methodIn.getTerminateProgramOutCtx();
//  CLOSE SYS001-Z-LOG-FILE SYS201-SERVICE-REPORT
          sys001ZLogFile.close(); 
          sys201ServiceReport.close(); 
//  DISPLAY SPACE
          logger.info(" "); 
//  DISPLAY 600-8000-MESSAGE
          logger.info(new String(methodIn.getMessage6008000())); 
//  MOVE 400-Z-LOG-CNT TO 600-8001-SYS001-READ
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          methodOut.setSys001Read6008001(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(methodOut.getZLogCnt400()).toCharArray()));
//  DISPLAY 600-8001-MESSAGE
          logger.info(methodIn.getMessage6008001().toString()); 
//  MOVE 400-TOT-REC-WRITTEN TO 600-8002-SYS201-WRITTEN
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          methodOut.setSys201Written6008002(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(methodOut.getTotRecWritten400()).toCharArray()));
//  DISPLAY 600-8002-MESSAGE
          logger.info(methodIn.getMessage6008002().toString()); 
//  DISPLAY SPACE
          logger.info(" "); 
//  DISPLAY 600-8999-MESSAGE
          logger.info(new String(methodIn.getMessage6008999())); 
//  DISPLAY SPACE
          logger.info(" "); 
//  DISPLAY 600-9500-EOJ-MESSAGE
          logger.info(new String(methodIn.getEojMessage6009500())); 
      
      return methodOut;
      }
  
  
  
  
  
  
  
  
  }
  /* 
*author.                 sajitha.s
*installation.           mastercard international, inc.
*date-written.           jun 02,2008.
****************************************************************
*          -- -- -- c o n f i d e n t i a l -- -- --           *
*                                                              *
*    this item contains information and procedures which are   *
*    proprietary to mastercard international, incorporated,    *
*    and which are confidential.  it is provided with the      *
*    express understanding that it is to be used only for the  *
*    benefit of interbank card association, and is not to be   *
*    used, copied, or disclosed for any other purpose.  any    *
*    authorized reproduction (in whole or in part) of this     *
*    material must be marked with this legend.                 *
****************************************************************
****************************************************************
*    program name:  sf328010.                                  *
*        function:  the program will create the z-log summary  *
*                   report by the asa service id.              *
*        language:  cobol                                      *
*     system name:  support file system.                       *
*       frequency:  daily.                                     *
*   classfication:  batch                                      *
*                                                              *
*      processing:  this program reads the z-log records that  *
*                   is extracted by the sf326010 program and it*
*                   creates the sf328010-aa summary report by  *
*                   asa service id.                            *
*                                                              *
****************************************************************
****************************************************************
*    r e v i s i o n   h i s t o r y .                         *
****************************************************************
*|-----|--------|--------|------------|-------------------------|
*| ver |  date  |  rpi   | programmer |    modifications        |
*|-----|--------|--------|------------|-------------------------|
*| 01  |06/02/08|rel 9.1 |sajitha.s   | intial version.         |
*|     |        |        |            |                         |
*|-----|--------|--------|------------|-------------------------|
*| 02  |11/26/08|rel 9.2 |sajitha.s   | modified the program to |
*|     |        |        |            | include the service name|
*|     |        |        |            | and the date range in   |
*|     |        |        |            | the report.             |
*|-----|--------|--------|------------|-------------------------|
*| 03  |08/05/09|rel 9.2 |schwamle    | modified the program to |
*|     |        |        |            | include additional      |
*|     |        |        |            | service codes and names |
*|-----|--------|--------|------------|-------------------------|
*| 04  |04/16/12|apsup12 |arnold j.   | corrected the table of  |
*|     |        |        |trembley    | asa service names.      |
*|-----|--------|--------|------------|-------------------------|
*| 05  |01/21/12|rel13q3 |durga s.    | sf328010 update service |
*|     |        |prb     |            | descriptions:           |
*|     |        |55837   |            | added services and descr|
*|     |        |        |            | -crition in asa service |
*|     |        |        |            | table.                  |
*|-----|--------|--------|------------|-------------------------|
*| 06  |03/01/13|rel13q3 |durga s.    | chip cvc1 conversion    |
*|     |        |c40598  |            | service:modified the    |
*|     |        |        |            | program to add two new  |
*|     |        |        |            | service ids and descript|
*|     |        |        |            | -ions in internal table |
*|     |        |        |            | for chip cvc1 conversion|
*|-----|--------|--------|------------|-------------------------|
*| 07  |05/02/13|rel13q4 |durga s     |mastercard digital enable|
*|     |        |c48552  |            |ment system:             |
*|     |        |        |            |modified the program     |
*|     |        |        |            |to add four new service  |
*|     |        |        |            |ids (0050,0051,0052 and  |
*|     |        |        |            |1050) and its description|
*|     |        |        |            |for mdes.                |
*|-----|--------|--------|------------|-------------------------|
*| 08  |08/02/13|rel14q1 | vijay      | mdes rev 3:             |
*|     |        |c48552  | sangale    | modified the program to |
*|     |        |        |            | add two new service ids |
*|     |        |        |            | and descriptions in the |
*|     |        |        |            | internal table for mdes |
*|     |        |        |            | service.                |
*|-----|--------|--------|------------|-------------------------|
*| 09  |02/21/14|prodfix |arnold j. |convert service code/     |
*|     |        |prb63084|trembley  |description table to use  |
*|     |        |        |          |copybook sf535010, and    |
*|     |        |        |          |share it with sf328010    |
*|     |        |        |          |and "zlogpars".           |
*|-----|--------|--------|------------|-------------------------|
*| 10  |03/21/14|rel14q4 |durga s     |new moneysend payment    |
*|     |        |c53888  |            |types:                   |
*|     |        |        |            |recompiled for sf535010  |
*|     |        |        |            |copybook changes.        |
*|-----|--------|--------|------------|-------------------------|
*| 11  |04/17/14|rel14q4 |srinivas    |mdes card on file :      |
*|     |        |c66566  |            |recompiled for sf535010  |
*|     |        |        |            |copybook changes.        |
*|-----|--------|--------|------------|-------------------------|
*| 12  |09/17/14|rel15q1 |arvind      |mdes mastercard cloud    |
*|     |        |c67779  |            |based payments(switching)|
*|     |        |        |            |recompiled for sf535010  |
*|     |        |        |            |copybook changes.        |
*|-----|--------|--------|------------|-------------------------|
*| 13  |12/11/14|rel15q3 |durga s     |sf327010 update service  |
*|     |        |prb65265|            |descriptions :           |
*|     |        |        |            |recompiled for sf535010  |
*|     |        |        |            |copybook changes.        |
*|-----|--------|--------|------------|-------------------------|
*| 14  |12/04/15|rel16q2 |sangeetha   |card on file enhancement2|
*|     |        |c80567  |   chakkr   |recompiled for sf535010  |
*|     |        |        |            |copybook changes.        |
*|-----|--------|--------|------------|-------------------------|
*| 15  |05/26/16|rel16q4 |hemanth     |card on file (cof) items |
*|     |        |c80567  |   reddy    |1 tr crypto descoping + 2|
*|     |        |        |            |secure code rev 07.      |
*|     |        |        |            |recompiled for sf535010  |
*|     |        |        |            |copybook changes.        |
*|-----|--------|--------|------------|-------------------------|
*| 16  |12/01/16|rel17q2 |vasanthi    |emvco payment account    |
*|     |        |c89448  |   p        |reference :              |
*|     |        |        |            |recompiled for sf535010  |
*|     |        |        |            |copybook changes.        |
*|-----|--------|--------|------------|-------------------------|
*| 17  |04/22/17|rel17q3 |r jones     |mngs to ssp connection   |
*|     |        |c97336  |            |reference :              |
*|     |        |        |            |recompiled for sf535010  |
*|     |        |        |            |copybook changes.        |
*|-----|--------|--------|------------|-------------------------|
*| 18  |10/07/20|rel21q2 |ankit singh |modified the program to  |
*|     |        |pbi     |            |remove all sonar error.  |
*|     |        |29119   |            |                         |
*|     |        |        |            |modified para: 8300-.    |
*|-----|--------|--------|------------|-------------------------|
*| 19  |10/07/20|rel21q2 |ankit singh |modified the processor   |
*|     |        |pbi     |            |group from cob3 to cob6. |
*|     |        |28592   |            |                         |
*|-----|--------|--------|------------|-------------------------|
*| 20  |02/17/21|rel21q2 |vasanth m   |fixed the allignment of  |
*|     |        |pbi29119|            |sf3260bb report.         |
*|     |        |& 28592 |            |                         |
*|-----|--------|--------|------------|-------------------------|
*| xx  |xx/xx/xx|xxxxxxx |xxxxxxxx    |xxxxxxxxxxxxxxxxxxxx     |
*|     |        |        |            |                         |
*|-----|--------|--------|------------|-------------------------|
****************************************************************
******************************************************************
*    e n v i r o n m e n t   d i v i s i o n                     *
******************************************************************
*/
