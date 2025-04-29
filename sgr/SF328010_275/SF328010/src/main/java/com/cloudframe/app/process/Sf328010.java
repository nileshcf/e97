  package com.cloudframe.app.process;
   /* The comment section is too large, 
	 * hence added at the end of the java code 
	 * please scroll all the way to the bottom to see complete comments 
	 */
  
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.sf328010.file.*;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.sf328010.dto.WhenCompDate800;
  import com.cloudframe.app.sf328010.dto.CompileDate600;
  import com.cloudframe.app.sf328010.dto.WhenCompTime800;
  import com.cloudframe.app.sf328010.dto.CompileTime600;
  import com.cloudframe.app.utility.CFUtil;
  import org.springframework.beans.factory.annotation.Value;
  import com.cloudframe.app.sf328010.dto.CurrentDate600;
  import com.cloudframe.app.sf328010.dto.FuncCurrDate800;
  import com.cloudframe.app.sf328010.dto.CurrentTime600;
  import com.cloudframe.app.data.Field;
  import java.math.BigDecimal;
  import java.math.RoundingMode;
  import com.cloudframe.app.sf328010.dto.LserviceDate800;
  import com.cloudframe.app.sf328010.dto.Detail170501;
  import com.cloudframe.app.sf328010.dto.LserviceTime800;
  import com.cloudframe.app.sf328010.dto.HserviceDate800;
  import com.cloudframe.app.sf328010.dto.HserviceTime800;
  import com.cloudframe.app.sf328010.dto.Detail705;
  import com.cloudframe.app.sf328010.dto.Detail1705;
  import com.cloudframe.app.sf328010.dto.*;
  import com.cloudframe.app.sf328010.dto.DetailData1705;
  import com.cloudframe.app.sf328010.dto.HeaderLine2702;
  import com.cloudframe.app.sf328010.dto.DetailData2705;
  import com.cloudframe.app.sf328010.dto.HeaderLine1701;
  import com.cloudframe.app.sf328010.dto.DetailData705;
  import com.cloudframe.app.sf328010.dto.HighServiceTime800;
  import com.cloudframe.app.sf328010.dto.CurrentRunMsg600;
  import com.cloudframe.app.sf328010.dto.Sf528ExtractZLogRec;
  import com.cloudframe.app.sf328010.dto.FuncCurrentDate800;
  import com.cloudframe.app.sf328010.file.records.Sys201ServiceRptRec;
  import com.cloudframe.app.sf328010.dto.Message6008001;
  import com.cloudframe.app.sf328010.dto.CompileInfoMsg600;
  import com.cloudframe.app.sf328010.dto.LowServiceTime800;
  import com.cloudframe.app.sf328010.dto.FuncWhenCompiled800;
  import com.cloudframe.app.sf328010.file.records.Group1;
  import com.cloudframe.app.sf328010.dto.Message6008002;
  import com.cloudframe.app.sf328010.dto.Sf535ZlogServicesGroup;
  import com.cloudframe.app.sf328010.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("sf328010")
  
  public class Sf328010 extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Sf328010.class);
  
  private DetailData1705 detailData1705 = new DetailData1705() ;
  private HeaderLine2702 headerLine2702 = new HeaderLine2702() ;
  private DetailData2705 detailData2705 = new DetailData2705() ;
  private HeaderLine1701 headerLine1701 = new HeaderLine1701() ;
  private DetailData705 detailData705 = new DetailData705() ;
  private HighServiceTime800 highServiceTime800 = new HighServiceTime800() ;
  private CurrentRunMsg600 currentRunMsg600 = new CurrentRunMsg600() ;
  private Sf528ExtractZLogRec sf528ExtractZLogRec = new Sf528ExtractZLogRec() ;
  private FuncCurrentDate800 funcCurrentDate800 = new FuncCurrentDate800() ;
  private Sys201ServiceRptRec sys201ServiceRptRec = new Sys201ServiceRptRec() ;
  private Message6008001 message6008001 = new Message6008001() ;
  private CompileInfoMsg600 compileInfoMsg600 = new CompileInfoMsg600() ;
  private LowServiceTime800 lowServiceTime800 = new LowServiceTime800() ;
  private FuncWhenCompiled800 funcWhenCompiled800 = new FuncWhenCompiled800() ;
  private Group1 group1 = new Group1() ;
  private Message6008002 message6008002 = new Message6008002() ;
  private Sf535ZlogServicesGroup sf535ZlogServicesGroup = new Sf535ZlogServicesGroup() ;
  private Work work = new Work() ;
  
  @Value("${timeZoneId:Etc/GMT}")
  private String timeZoneId;
  
  
  @Autowired 
  @Qualifier("sf328010_sys001ZLogFile")
  Sys001ZLogFile sys001ZLogFile;
  @Autowired 
  @Qualifier("sf328010_sys201ServiceReport")
  Sys201ServiceReport sys201ServiceReport;
  
  
  
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
      		if(sys001ZLogFile.hasOpened() && !sys001ZLogFile.isReadOnly()) { 
      			sys001ZLogFile.flush(); 
      		}
      		if(sys201ServiceReport.hasOpened() && !sys201ServiceReport.isReadOnly()) { 
      			sys201ServiceReport.flush(); 
      		}
      }
      
       return getRc(); // Exit with return code
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
      private void mainline() throws Exception {
      
// ******************************************************************
// *           0 0 0 0 - M a i n l i n e.                           *
// ******************************************************************
//  PERFORM 1000-INITIALIZE-PROGRAM
          initializeProgram();/*1000-INITIALIZE-PROGRAM*/
          if (this.isProgramEnded()) {
              return ;
          }
//  PERFORM 2000-PROCESS-Z-LOG-FILE UNTIL 88-100-Z-LOG-EOF
          while (!(work.isZLogEof88100()) ) {
             processZLogFile();/*2000-PROCESS-Z-LOG-FILE*/
             if (this.isProgramEnded()) {
                 return ;
             }
          }
//  IF 88-100-Z-LOG-EOF AND 88-100-FIRST-READ
//  ELSE
          if (!(work.isZLogEof88100())  || !(work.isFirstRead88100()) ) { 
//  PERFORM 3000-DISPLAY-SERVICE-DATE
              displayServiceDate();/*3000-DISPLAY-SERVICE-DATE*/
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
      private void initializeProgram() throws Exception {
      
// ******************************************************************
// *    1 0 0 0 - I n i t i a l i z e - p r o g r a m.              *
// *                                                                *
// *    1. display start-up messages.                               *
// *    2. open files.                                              *
// ******************************************************************
//  PERFORM 1100-BUILD-BEG-JOB-MSGS
          buildBegJobMsgs();/*1100-BUILD-BEG-JOB-MSGS*/
//  PERFORM 1200-OPEN-FILES
          openFiles();/*1200-OPEN-FILES*/
//  PERFORM 1300-SETUP-WORK-AREA
          setupWorkArea();/*1300-SETUP-WORK-AREA*/
//  PERFORM 8000-READ-Z-LOG-FILE
          readZLogFile();/*8000-READ-Z-LOG-FILE*/
//  PERFORM 8110-WRITE-REPORT-HEADER
          writeReportHeader();/*8110-WRITE-REPORT-HEADER*/
//  IF 88-100-Z-LOG-EOF
          if ( work.isZLogEof88100()  ) { 
//  DISPLAY 600-0001-NO-INPUT-DATA
              logger.info(new String(work.getNoInputData6000001())); 
//  PERFORM 1400-BUILD-EMPTY-RPT
              buildEmptyRpt();/*1400-BUILD-EMPTY-RPT*/
          }
//  ELSE
          else { 
//  SET 88-100-NOT-FIRST-READ TO TRUE
              work.setNotFirstRead88100True(); 
              
//  PERFORM 8200-MOVE-DATA-HOLD
              moveDataHold();/*8200-MOVE-DATA-HOLD*/
//  MOVE SF528-SERVICE-DATE-TIME TO 800-HIGH-SERVICE-TIME 800-LOW-SERVICE-TIME
              highServiceTime800.setString(sf528ExtractZLogRec.getSf528ServiceDateTime());
              lowServiceTime800.setString(sf528ExtractZLogRec.getSf528ServiceDateTime());
          }
      
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
      private void buildBegJobMsgs() throws Exception {
			// Declare local variables used in the method
			WhenCompDate800 whenCompDate800 = funcWhenCompiled800.getWhenCompDate800();
			CompileDate600 compileDate600 = compileInfoMsg600.getCompileDate600();
			WhenCompTime800 whenCompTime800 = funcWhenCompiled800.getWhenCompTime800();
			CompileTime600 compileTime600 = compileInfoMsg600.getCompileTime600();
			CurrentDate600 currentDate600 = currentRunMsg600.getCurrentDate600();
			FuncCurrDate800 funcCurrDate800 = funcCurrentDate800.getFuncCurrDate800();
			CurrentTime600 currentTime600 = currentRunMsg600.getCurrentTime600();
			// End of variable declaration

      
// ******************************************************************
// *       1 1 0 0 - B u i l d - b e g - j o b - m s g s .          *
// ******************************************************************
//  MOVE FUNCTION WHEN-COMPILED TO 800-FUNC-WHEN-COMPILED
          funcWhenCompiled800.setString("2021100505475800     ".toCharArray());
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
  
//  MOVE 600-CURR-DATE-DD TO 701-RUN-DATE
          headerLine1701.setRunDate701(currentDate600.getCurrDateDd600());
  
//  MOVE 600-CURR-DATE-MM TO 100-MNTH-MM-NUM
          work.setMnthMmNum100(currentDate600.getCurrDateMm600());
  
//  PERFORM 8300-BUILD-MONTH
          buildMonth();/*8300-BUILD-MONTH*/
//  MOVE 800-RUN-MONTH TO 701-RUN-MONTH
          headerLine1701.setRunMonth701(work.getRunMonth800());
//  MOVE 600-CURR-DATE-YYYY TO 701-RUN-YEAR
          headerLine1701.setRunYear701(currentDate600.getCurrDateYyyy600());
  
//  DISPLAY 600-EXEC-START-MSG
          logger.info(new String(work.getExecStartMsg600())); 
//  DISPLAY 600-COMPILE-INFO-MSG
          logger.info(compileInfoMsg600.toString()); 
//  DISPLAY 600-CURRENT-RUN-MSG
          logger.info(currentRunMsg600.toString()); 
      
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
      
// *                 1 2 0 0 - O p e n - f i l e s .                *
// ******************************************************************
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
      private void setupWorkArea() throws Exception {
      
// ******************************************************************
// *         1 3 0 0 - S e t u p - w o r k - a r e a .              *
// ******************************************************************
//  SET 88-100-FIRST-READ TO TRUE
          work.setFirstRead88100True(); 
          
//  MOVE 300-PLUS-1 TO 400-PAGE-COUNT
          work.setPageCount400( work.getPlus1300());
//  MOVE 400-PAGE-COUNT TO 702-PAGE-NUM
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          headerLine2702.setPageNum702(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(work.getPageCount400()).toCharArray()));
      
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
      private void buildEmptyRpt() throws Exception {
      
// ******************************************************************
// *         1 4 0 0 - B u i l d - e m p t y - r e p o r t.         *
// ******************************************************************
//  WRITE SYS201-SERVICE-RPT-REC FROM 706-EMPTY-REPORT AFTER ADVANCING 300-NUM-4 LINES
          sys201ServiceReport.writeAfter(work.getEmptyReport706(),work.getNum4300());
          sys201ServiceRptRec.setString(CONSTANTS.LOW_VALUE_215751987);
//  ADD 300-PLUS-4 TO 400-RPT1-LINE-COUNT
          work.setRpt1LineCount400(work.getRpt1LineCount400()+(int) work.getPlus4300());
      
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
      private void processZLogFile() throws Exception {
			// Declare local variables used in the method
			char[] sf528ServiceId = null;
			char[] holdServiceId800 = null;
			// End of variable declaration

      
// ******************************************************************
// *         2 0 0 0 - P r o c e s s - z - l o g - f i l e s.       *
// ******************************************************************
          holdServiceId800 = work.getHoldServiceId800();
          sf528ServiceId = sf528ExtractZLogRec.getSf528ServiceId();
//  IF SF528-SERVICE-ID NOT EQUAL 800-HOLD-SERVICE-ID
          if (		compareChars(sf528ServiceId,holdServiceId800) != 0 ) { 
//  PERFORM 8100-GENERATE-REPORT
              generateReport();/*8100-GENERATE-REPORT*/
//  PERFORM 8200-MOVE-DATA-HOLD
              moveDataHold();/*8200-MOVE-DATA-HOLD*/
          }
  
//  ELSE
          else { 
              // MOVE SF528-SERVICE-ID TO 800-HOLD-SERVICE-ID
              work.setHoldServiceId800(sf528ExtractZLogRec.getSf528ServiceId());
          }
//  PERFORM 2100-ACCUMULATE-DATA
          accumulateData();/*2100-ACCUMULATE-DATA*/
//  PERFORM 8000-READ-Z-LOG-FILE
          readZLogFile();/*8000-READ-Z-LOG-FILE*/
          ;
      
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
      private void accumulateData() throws Exception {
			// Declare local variables used in the method
			char[] sf528ServiceStatus = null;
			char[] litC300 = null;
			int highElapseTime400 = 0;
			int sf528ElapsedTime = 0;
			int lowElapseTime400 = 0;
			// End of variable declaration

      
// ******************************************************************
// *         2 1 0 0 - A c c u m u l a t e - d a t a .              *
// ******************************************************************
//  ADD 300-PLUS-1 TO 400-TOT-SERVICE-CNT
          work.setTotServiceCnt400(work.getTotServiceCnt400()+(int) work.getPlus1300());
          sf528ServiceStatus = sf528ExtractZLogRec.getSf528ServiceStatus();
          litC300 = work.getLitC300();
//  IF SF528-SERVICE-STATUS EQUAL 300-LIT-C
          if (		compareChars(sf528ServiceStatus,litC300) == 0 ) { 
//  ADD 300-PLUS-1 TO 400-SUCCESS-CNT
              work.setSuccessCnt400(work.getSuccessCnt400()+(int) work.getPlus1300());
          }
  
//  ELSE
          else { 
//  ADD 300-PLUS-1 TO 400-ERROR-CNT
              work.setErrorCnt400(work.getErrorCnt400()+(int) work.getPlus1300());
          }
//  ADD SF528-ELAPSED-TIME TO 400-SUM-ELAPSED-TIME
          work.setSumElapsedTime400(work.getSumElapsedTime400()+(int) sf528ExtractZLogRec.getSf528ElapsedTime());
          sf528ElapsedTime = sf528ExtractZLogRec.getSf528ElapsedTime();
//  IF 400-HIGH-ELAPSE-TIME LESS THAN SF528-ELAPSED-TIME
          if (	( work.getHighElapseTime400() < sf528ElapsedTime )) { 
//  MOVE SF528-ELAPSED-TIME TO 400-HIGH-ELAPSE-TIME
              work.setHighElapseTime400(sf528ExtractZLogRec.getSf528ElapsedTime());
          }
  
//  ELSE
          else { 
              sf528ElapsedTime = sf528ExtractZLogRec.getSf528ElapsedTime();
//  IF 400-LOW-ELAPSE-TIME GREATER THAN SF528-ELAPSED-TIME
              if (	( work.getLowElapseTime400() > sf528ElapsedTime )) { 
//  MOVE SF528-ELAPSED-TIME TO 400-LOW-ELAPSE-TIME
                  work.setLowElapseTime400(sf528ExtractZLogRec.getSf528ElapsedTime());
              }
  
          }
//  PERFORM 2110-CALCULATE-PERCENT
          calculatePercent();/*2110-CALCULATE-PERCENT*/
//  PERFORM 2120-CALCULATE-SERVICE-DT-TM
          calculateServiceDtTm();/*2120-CALCULATE-SERVICE-DT-TM*/
          ;
      
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
      private void calculatePercent() throws Exception {
      
// ******************************************************************
// *         2 1 1 0 - C a l c u l a t i o n  - p e r c e n t .     *
// ******************************************************************
          work.setSuccessPercent400(BigDecimal.valueOf(work.getSuccessCnt400()).divide(BigDecimal.valueOf(work.getTotServiceCnt400()),18,RoundingMode.DOWN).setScale(3,BigDecimal.ROUND_DOWN).multiply(BigDecimal.valueOf(work.getNum100300())).setScale(2,RoundingMode.HALF_UP));
          if(work.getSuccessPercent400().signum() < 0 )  work.setSuccessPercent400(work.getSuccessPercent400().negate());
          work.setErrPercent400(BigDecimal.valueOf(work.getErrorCnt400()).divide(BigDecimal.valueOf(work.getTotServiceCnt400()),18,RoundingMode.DOWN).setScale(3,BigDecimal.ROUND_DOWN).multiply(BigDecimal.valueOf(work.getNum100300())).setScale(2,RoundingMode.HALF_UP));
          if(work.getErrPercent400().signum() < 0 )  work.setErrPercent400(work.getErrPercent400().negate());
          work.setAvgElapsed400(BigDecimal.valueOf(work.getSumElapsedTime400()).divide(BigDecimal.valueOf(work.getTotServiceCnt400()),18,RoundingMode.DOWN).setScale(3,BigDecimal.ROUND_DOWN).setScale(2,RoundingMode.HALF_UP));
          if(work.getAvgElapsed400().signum() < 0 )  work.setAvgElapsed400(work.getAvgElapsed400().negate());
      
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
      private void calculateServiceDtTm() throws Exception {
			// Declare local variables used in the method
			char[] sf528ServiceDateTime = null;
			// End of variable declaration

      
// ******************************************************************
// ** 2 1 2 0 - C a l c u l a t e - s e r v i c e - d t - t m .   *
// ******************************************************************
          sf528ServiceDateTime = sf528ExtractZLogRec.getSf528ServiceDateTime();
//  IF 800-HIGH-SERVICE-TIME LESS THAN SF528-SERVICE-DATE-TIME
          if (		compareChars(highServiceTime800,sf528ServiceDateTime) < 0 ) { 
//  MOVE SF528-SERVICE-DATE-TIME TO 800-HIGH-SERVICE-TIME
              highServiceTime800.setString(sf528ExtractZLogRec.getSf528ServiceDateTime());
          }
  
//  ELSE
          else { 
              sf528ServiceDateTime = sf528ExtractZLogRec.getSf528ServiceDateTime();
//  IF 800-LOW-SERVICE-TIME GREATER THAN SF528-SERVICE-DATE-TIME
              if (		compareChars(lowServiceTime800,sf528ServiceDateTime) > 0 ) { 
//  MOVE SF528-SERVICE-DATE-TIME TO 800-LOW-SERVICE-TIME
                  lowServiceTime800.setString(sf528ExtractZLogRec.getSf528ServiceDateTime());
              }
  
          }
      
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
      private void displayServiceDate() throws Exception {
			// Declare local variables used in the method
			LserviceDate800 lserviceDate800 = lowServiceTime800.getLserviceDate800();
			Detail170501 detail170501 = detailData2705.getDetail170501();
			LserviceTime800 lserviceTime800 = lowServiceTime800.getLserviceTime800();
			HserviceDate800 hserviceDate800 = highServiceTime800.getHserviceDate800();
			HserviceTime800 hserviceTime800 = highServiceTime800.getHserviceTime800();
			// End of variable declaration

      
// ******************************************************************
// *       3 0 0 0 - D i s p l a y - s e r v i c e - d a t e .      *
// ******************************************************************
//  MOVE 800-LSERVICE-DD TO 705-LSERVICE-DATE
          detail170501.setLserviceDate705(lserviceDate800.getLserviceDd800());
  
//  MOVE 800-LSERVICE-MM TO 100-MNTH-MM-NUM
          work.setMnthMmNum100(lserviceDate800.getLserviceMm800());
  
//  PERFORM 8300-BUILD-MONTH
          buildMonth();/*8300-BUILD-MONTH*/
//  MOVE 800-RUN-MONTH TO 705-LSERVICE-MONTH
          detail170501.setLserviceMonth705(work.getRunMonth800());
  
//  MOVE 800-LSERVICE-CC TO 705-LSERVICE-CENTURY
          detail170501.setLserviceCentury705(lserviceDate800.getLserviceCc800());
  
//  MOVE 800-LSERVICE-YY TO 705-LSERVICE-YEAR
          detail170501.setLserviceYear705(lserviceDate800.getLserviceYy800());
  
//  MOVE 800-LSERVICE-HH TO 705-LSERVICE-HH
          detail170501.setLserviceHh705(lserviceTime800.getLserviceHh800());
  
//  MOVE 800-LSERVICE-MINS TO 705-LSERVICE-MINS
          detail170501.setLserviceMins705(lserviceTime800.getLserviceMins800());
  
//  MOVE 800-LSERVICE-SEC TO 705-LSERVICE-SEC
          detail170501.setLserviceSec705(lserviceTime800.getLserviceSec800());
  
//  MOVE 800-HSERVICE-DD TO 705-HSERVICE-DATE
          detail170501.setHserviceDate705(hserviceDate800.getHserviceDd800());
  
//  MOVE 800-HSERVICE-MM TO 100-MNTH-MM-NUM
          work.setMnthMmNum100(hserviceDate800.getHserviceMm800());
  
//  PERFORM 8300-BUILD-MONTH
          buildMonth();/*8300-BUILD-MONTH*/
//  MOVE 800-RUN-MONTH TO 705-HSERVICE-MONTH
          detail170501.setHserviceMonth705(work.getRunMonth800());
  
//  MOVE 800-HSERVICE-CC TO 705-HSERVICE-CENTURY
          detail170501.setHserviceCentury705(hserviceDate800.getHserviceCc800());
  
//  MOVE 800-HSERVICE-YY TO 705-HSERVICE-YEAR
          detail170501.setHserviceYear705(hserviceDate800.getHserviceYy800());
  
//  MOVE 800-HSERVICE-HH TO 705-HSERVICE-HH
          detail170501.setHserviceHh705(hserviceTime800.getHserviceHh800());
  
//  MOVE 800-HSERVICE-MINS TO 705-HSERVICE-MINS
          detail170501.setHserviceMins705(hserviceTime800.getHserviceMins800());
  
//  MOVE 800-HSERVICE-SEC TO 705-HSERVICE-SEC
          detail170501.setHserviceSec705(hserviceTime800.getHserviceSec800());
  
//  WRITE SYS201-SERVICE-RPT-REC FROM 705-DETAIL-DATA2 AFTER ADVANCING 300-NUM-4 LINES
          sys201ServiceReport.writeAfter(detailData2705.toCharArray(),work.getNum4300());
          sys201ServiceRptRec.setString(CONSTANTS.LOW_VALUE_215751987);
//  ADD 300-PLUS-4 TO 400-RPT1-LINE-COUNT
          work.setRpt1LineCount400(work.getRpt1LineCount400()+(int) work.getPlus4300());
      
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
      private void readZLogFile() throws Exception {
      
// ******************************************************************
// *       8 0 0 0 - R e a d - z - l o g - f i l e .                *
// ******************************************************************
          // READ SYS001-Z-LOG-FILE INTO SF528-EXTRACT-Z-LOG-REC
          sys001ZLogFile.read();
          if (!sys001ZLogFile.hasEnded()) {
            sf528ExtractZLogRec.setString(sys001ZLogFile.getRecord());
            group1.setString(sys001ZLogFile.getRecord());
          }
//  AT END
          if (sys001ZLogFile.hasEnded()) {  
//  SET 88-100-Z-LOG-EOF TO TRUE
              work.setZLogEof88100True(); 
              
//  IF 88-100-FIRST-READ
//  ELSE
              if (!(work.isFirstRead88100()) ) { 
//  PERFORM 8100-GENERATE-REPORT
                  generateReport();/*8100-GENERATE-REPORT*/
              }
            }
//  NOT AT END
          else  {
//  ADD 300-PLUS-1 TO 400-Z-LOG-CNT
              work.setZLogCnt400(work.getZLogCnt400()+(int) work.getPlus1300());
            }
      
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
      private void generateReport() throws Exception {
			// Declare local variables used in the method
			long rpt1LineCount400 = 0;
			short maxLinesPerPage300 = 0;
			// End of variable declaration

      
// ****************************************************************
// *       8 1 0 0 - G e n e r a t e - r e p o r t .              *
// ****************************************************************
//  IF 400-RPT1-LINE-COUNT GREATER THAN 300-MAX-LINES-PER-PAGE
          if (	( work.getRpt1LineCount400() > work.getMaxLinesPerPage300() ) ) { 
//  ADD 300-PLUS-1 TO 400-PAGE-COUNT
              work.setPageCount400(work.getPageCount400()+(int) work.getPlus1300());
//  MOVE 400-PAGE-COUNT TO 702-PAGE-NUM
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
              headerLine2702.setPageNum702(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(work.getPageCount400()).toCharArray()));
//  MOVE ZEROES TO 400-RPT1-LINE-COUNT
              work.setRpt1LineCount400(0);
//  PERFORM 8110-WRITE-REPORT-HEADER
              writeReportHeader();/*8110-WRITE-REPORT-HEADER*/
          }
//  PERFORM 8120-WRITE-DETAIL
          writeDetail();/*8120-WRITE-DETAIL*/
          ;
      
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
      private void writeReportHeader() throws Exception {
      
// ****************************************************************
// *  8 1 1 0 - W r i t e - r e p o r t - h e a d e r .           *
// ****************************************************************
//  WRITE SYS201-SERVICE-RPT-REC FROM 701-HEADER-LINE-1 AFTER ADVANCING PAGE
          sys201ServiceReport.writeWithPageBreakAfter(headerLine1701.toCharArray());
          sys201ServiceRptRec.setString(CONSTANTS.LOW_VALUE_215751987);
//  WRITE SYS201-SERVICE-RPT-REC FROM 702-HEADER-LINE-2 AFTER ADVANCING 300-NUM-2 LINE
          sys201ServiceReport.writeAfter(headerLine2702.toCharArray(),work.getNum2300());
          sys201ServiceRptRec.setString(CONSTANTS.LOW_VALUE_215751987);
//  WRITE SYS201-SERVICE-RPT-REC FROM 703-HEADER-LINE-3 AFTER ADVANCING 300-NUM-4 LINES
          sys201ServiceReport.writeAfter(work.getHeaderLine3703(),work.getNum4300());
          sys201ServiceRptRec.setString(CONSTANTS.LOW_VALUE_215751987);
//  WRITE SYS201-SERVICE-RPT-REC FROM 704-HEADER-LINE-4 AFTER ADVANCING 300-NUM-1 LINE
          sys201ServiceReport.writeAfter(work.getHeaderLine4704(),work.getNum1300());
          sys201ServiceRptRec.setString(CONSTANTS.LOW_VALUE_215751987);
//  MOVE 300-PLUS-7 TO 400-RPT1-LINE-COUNT
          work.setRpt1LineCount400( work.getPlus7300());
      
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
      private void writeDetail() throws Exception {
			// Declare local variables used in the method
			Detail705 detail705 = detailData705.getDetail705();
			// End of variable declaration

      
// ****************************************************************
// *   8 1 2 0 - W r i t e - r e p o r t - d e t a i l .          *
// ****************************************************************
//  PERFORM 8121-FORMAT-DATA
          formatData();/*8121-FORMAT-DATA*/
//  MOVE 800-HOLD-SERVICE-ID TO 705-SERVICE-ID
          detail705.setServiceId705(work.getHoldServiceId800());
  
//  PERFORM 8122-BUILD-SERVICE-ID-DESC
          buildServiceIdDesc();/*8122-BUILD-SERVICE-ID-DESC*/
          // MOVE 800-TOT-SERVICE-CNT TO 705-TOTAL-CNT
          detailData705.getDetail705().setTotalCnt705(work.getTotServiceCnt800());
  
          // MOVE 800-SUCCESS-CNT TO 705-SUCCESS-CNT
          detailData705.getDetail705().setSuccessCnt705(work.getSuccessCnt800());
  
          // MOVE 800-SUCCESS-PERCENT TO 705-SUCCESS-PERCENT
          detailData705.getDetail705().setSuccessPercent705(work.getSuccessPercent800());
  
          // MOVE 800-ERROR-CNT TO 705-ERR-CNT
          detailData705.getDetail705().setErrCnt705(work.getErrorCnt800());
  
          // MOVE 800-UNSUCCESS-PERCENT TO 705-ERR-PERCENT
          detailData705.getDetail705().setErrPercent705(work.getUnsuccessPercent800());
  
          // MOVE 800-AVG-ELAPSED TO 705-AVG-TIME
          detailData705.getDetail705().setAvgTime705(work.getAvgElapsed800());
  
          // MOVE 800-HIGH-ELAPSE-TIME TO 705-HIGH-TIME
          detailData705.getDetail705().setHighTime705(work.getHighElapseTime800());
  
          // MOVE 800-LOW-ELAPSE-TIME TO 705-LOW-TIME
          detailData705.getDetail705().setLowTime705(work.getLowElapseTime800());
  
//  WRITE SYS201-SERVICE-RPT-REC FROM 705-DETAIL-DATA AFTER ADVANCING 300-NUM-4 LINES
          sys201ServiceReport.writeAfter(detailData705.toCharArray(),work.getNum4300());
          sys201ServiceRptRec.setString(CONSTANTS.LOW_VALUE_215751987);
//  ADD 300-PLUS-4 TO 400-RPT1-LINE-COUNT
          work.setRpt1LineCount400(work.getRpt1LineCount400()+(int) work.getPlus4300());
//  WRITE SYS201-SERVICE-RPT-REC FROM 705-DETAIL-DATA1 AFTER ADVANCING 300-NUM-1 LINES
          sys201ServiceReport.writeAfter(detailData1705.toCharArray(),work.getNum1300());
          sys201ServiceRptRec.setString(CONSTANTS.LOW_VALUE_215751987);
//  ADD 300-PLUS-1 TO 400-RPT1-LINE-COUNT
          work.setRpt1LineCount400(work.getRpt1LineCount400()+(int) work.getPlus1300());
//  ADD 300-PLUS-1 TO 400-TOT-REC-WRITTEN
          work.setTotRecWritten400(work.getTotRecWritten400()+(int) work.getPlus1300());
//  MOVE ZEROES TO 400-SUCCESS-CNT 400-ERROR-CNT 400-TOT-SERVICE-CNT 800-SUCCESS-PERCENT 800-UNSUCCESS-PERCENT 400-SUM-ELAPSED-TIME
//  FORMAT_27653163 = "ZZ9.99", FORMAT_27653163 = "ZZ9.99"
          work.setSuccessCnt400(0);
          work.setErrorCnt400(0);
          work.setTotServiceCnt400(0);
          work.setSuccessPercent800(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_27653163,CONSTANTS.ZERO_6));
          work.setUnsuccessPercent800(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_27653163,CONSTANTS.ZERO_6));
          work.setSumElapsedTime400(0);
      
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
      private void formatData() throws Exception {
      
// ****************************************************************
// *       8 1 2 1 - F o r m a t - d a t a  .                     *
// ****************************************************************
//  MOVE 400-SUCCESS-CNT TO 800-SUCCESS-CNT
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          work.setSuccessCnt800(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(work.getSuccessCnt400()).toCharArray()));
//  MOVE 400-ERROR-CNT TO 800-ERROR-CNT
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          work.setErrorCnt800(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(work.getErrorCnt400()).toCharArray()));
//  MOVE 400-TOT-SERVICE-CNT TO 800-TOT-SERVICE-CNT
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          work.setTotServiceCnt800(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(work.getTotServiceCnt400()).toCharArray()));
//  MOVE 400-SUCCESS-PERCENT TO 800-SUCCESS-PERCENT
//  FORMAT_27653163 = "ZZ9.99"
          work.setSuccessPercent800(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_27653163,work.getSuccessPercent400().toPlainString().toCharArray()));
//  MOVE 400-ERR-PERCENT TO 800-UNSUCCESS-PERCENT
//  FORMAT_27653163 = "ZZ9.99"
          work.setUnsuccessPercent800(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_27653163,work.getErrPercent400().toPlainString().toCharArray()));
//  MOVE 400-LOW-ELAPSE-TIME TO 800-LOW-ELAPSE-TIME
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          work.setLowElapseTime800(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(work.getLowElapseTime400()).toCharArray()));
//  MOVE 400-HIGH-ELAPSE-TIME TO 800-HIGH-ELAPSE-TIME
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          work.setHighElapseTime800(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(work.getHighElapseTime400()).toCharArray()));
//  MOVE 400-AVG-ELAPSED TO 800-AVG-ELAPSED
//  FORMAT_1949449721 = "ZZZ,ZZZ,ZZ9.99"
          work.setAvgElapsed800(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1949449721,work.getAvgElapsed400().toPlainString().toCharArray()));
      
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
      private void buildServiceIdDesc() throws Exception {
			// Declare local variables used in the method
			Detail1705 detail1705 = detailData1705.getDetail1705();
			boolean keepSearching = true;
			int[] searchIndexes = null;
			int searchLowPoint = 0;
			int searchMidPoint = 0;
			int searchHighPoint = 0;
			int searchCompare = 0;
			char[] holdServiceId800 = null;
			// End of variable declaration

      
// ****************************************************************
// * 8 1 2 2 - B u i l d - s e r v i c e - i d - d e s c .        *
// ****************************************************************
//  SET SF535-X TO 300-NUM-1
          sf535X = work.getNum1300(); 
          
          holdServiceId800 = work.getHoldServiceId800();
//  SEARCH ALL SF535-ZLOG-SERVICE-ENTRY
          // Binary Search through sf535ZlogServicesGroup.getSf535ZlogServiceTable().sf535ZlogServiceEntry
          searchLowPoint = 0; //prevLowValue
          searchHighPoint = sf535ZlogServicesGroup.getSf535ZlogServiceTable().sf535ZlogServiceEntrySize(); //prevHighValue
          searchMidPoint = searchHighPoint / 2; //starting at mid point
          searchIndexes = new int[]{searchLowPoint,searchMidPoint,searchHighPoint};
          keepSearching = true;
          while (keepSearching) {
          // compare logic below
             searchCompare = compareAscending(sf535ZlogServicesGroup.getSf535ZlogServiceTable().getSf535ZlogServiceEntry(searchMidPoint).getSf535ZlogService(),holdServiceId800);
          // end of compare logic
          	if (searchCompare == 0 ) { // if search found
          	      keepSearching = false;
          	     sf535X = searchMidPoint	 + 1;
//  MOVE SF535-ZSERV-DESC ( SF535-X ) TO 705-SERVICE-NAME
              detail1705.setServiceName705(pad(64,sf535ZlogServicesGroup.getSf535ZlogServiceTable().getSf535ZlogServiceEntry(sf535X - 1).getSf535ZservDesc(),SPACE_CHAR,RIGHT_PAD));
  
          	} else  {
          		adjustSearchIndex(searchCompare,searchIndexes);
          		searchLowPoint  = searchIndexes[0];
           		searchMidPoint  = searchIndexes[1];
           		searchHighPoint = searchIndexes[2];
           		if (searchMidPoint == -1) { // search exhausted
           		    keepSearching = false; 
//  MOVE 300-LIT-UNKNWN TO 705-SERVICE-NAME
              detail1705.setServiceName705(pad(64,work.getLitUnknwn300(),SPACE_CHAR,RIGHT_PAD));
  
           		}
          	}
          }
  
      
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
      private void moveDataHold() throws Exception {
      
// ******************************************************************
// *         8 3 0 0 - M o v e - d a t a - h o l d .                *
// ******************************************************************
          // MOVE SF528-SERVICE-ID TO 800-HOLD-SERVICE-ID
          work.setHoldServiceId800(sf528ExtractZLogRec.getSf528ServiceId());
//  MOVE SF528-ELAPSED-TIME TO 400-HIGH-ELAPSE-TIME 400-LOW-ELAPSE-TIME
          work.setHighElapseTime400(sf528ExtractZLogRec.getSf528ElapsedTime());
          work.setLowElapseTime400(sf528ExtractZLogRec.getSf528ElapsedTime());
      
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
      private void buildMonth() throws Exception {
      
// ******************************************************************
// *           8 3 0 0 - B u i l d - m o n t h .                    *
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
      private void terminateProgram() throws Exception {
      
// ******************************************************************
// *      9 0 0 0 - T e r m i n a t e - p r o g r a m               *
// *                                                                *
// *    1. close file.                                              *
// *    2. display record counts.                                   *
// ******************************************************************
//  CLOSE SYS001-Z-LOG-FILE SYS201-SERVICE-REPORT
          sys001ZLogFile.close(); 
          sys201ServiceReport.close(); 
//  DISPLAY SPACE
          logger.info(" "); 
//  DISPLAY 600-8000-MESSAGE
          logger.info(new String(work.getMessage6008000())); 
//  MOVE 400-Z-LOG-CNT TO 600-8001-SYS001-READ
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          message6008001.setSys001Read6008001(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(work.getZLogCnt400()).toCharArray()));
//  DISPLAY 600-8001-MESSAGE
          logger.info(message6008001.toString()); 
//  MOVE 400-TOT-REC-WRITTEN TO 600-8002-SYS201-WRITTEN
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          message6008002.setSys201Written6008002(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(work.getTotRecWritten400()).toCharArray()));
//  DISPLAY 600-8002-MESSAGE
          logger.info(message6008002.toString()); 
//  DISPLAY SPACE
          logger.info(" "); 
//  DISPLAY 600-8999-MESSAGE
          logger.info(new String(work.getMessage6008999())); 
//  DISPLAY SPACE
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
