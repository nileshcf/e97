  package com.cloudframe.app.process.impl;
   /* The comment section is too large, 
	 * hence added at the end of the java code 
	 * please scroll all the way to the bottom to see complete comments 
	 */
  
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.sf311010.file.*;
  import com.cloudframe.app.sf311010.Sf311010Ctx.*;
  import com.cloudframe.app.sf311010.Sf311010Ctx;
  import com.cloudframe.app.process.Sf311010;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import org.springframework.web.bind.annotation.RequestParam;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.process.Mcwin;
  import com.cloudframe.app.process.*;
  import com.cloudframe.app.process.Mcabend;
  import java.util.Calendar;
  import java.util.TimeZone;
  import java.util.Date;
  import org.springframework.beans.factory.annotation.Value;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.process.Sf910020;
  import java.math.BigDecimal;
  import com.cloudframe.app.process.Si994010;
  import com.cloudframe.app.process.Si994020;
  import com.cloudframe.app.dto.ProgramContext;
  import com.cloudframe.app.sf311010.dto.*;
  import com.cloudframe.app.sf311010.dto.A01PassedParm;
  import com.cloudframe.app.sf311010.dto.Head3354;
  import com.cloudframe.app.sf311010.dto.Head1350;
  import com.cloudframe.app.sf311010.dto.DetailLine362;
  import com.cloudframe.app.sf311010.dto.Head6360;
  import com.cloudframe.app.sf311010.dto.EndOfReportLine366;
  import com.cloudframe.app.sf311010.dto.Head2352;
  import com.cloudframe.app.sf311010.dto.Head5358;
  import com.cloudframe.app.sf311010.dto.Head4356;
  import com.cloudframe.app.sf311010.dto.AcquirerIca800;
  import com.cloudframe.app.sf311010.dto.WhenCompiled804;
  import com.cloudframe.app.sf311010.dto.De48DataGroup500;
  import com.cloudframe.app.sf311010.dto.MciwinYearToWindow;
  import com.cloudframe.app.sf311010.dto.Sf501LogRecord;
  import com.cloudframe.app.sf311010.dto.AsmSf910020Parms880;
  import com.cloudframe.app.sf311010.dto.LogDecompressedData860;
  import com.cloudframe.app.sf311010.dto.De11TraceAudit800;
  import com.cloudframe.app.sf311010.dto.TotalMessage650;
  import com.cloudframe.app.sf311010.dto.MciabendParms;
  import com.cloudframe.app.sf311010.dto.Sf31IsoExtractRec;
  import com.cloudframe.app.sf311010.dto.DataGroup1000;
  import com.cloudframe.app.sf311010.dto.Date800;
  import com.cloudframe.app.sf311010.dto.Time801;
  import com.cloudframe.app.sf311010.file.records.ReportRecord;
  import com.cloudframe.app.sf311010.dto.HoldCurrentDate800;
  import com.cloudframe.app.sf311010.file.records.IssAcqVer2Record;
  import com.cloudframe.app.sf311010.dto.ForwardIca800;
  import com.cloudframe.app.sf311010.dto.MciwinReturnedYear;
  import com.cloudframe.app.sf311010.dto.MciwinNewWindowYearGroup;
  import com.cloudframe.app.sf311010.file.records.CentralSiteRecord;
  import com.cloudframe.app.sf311010.dto.De120DataGroup500;
  import com.cloudframe.app.sf311010.dto.DateYymmdd800;
  import com.cloudframe.app.sf311010.dto.De48Se42500;
  import com.cloudframe.app.sf311010.dto.TimeHhmmss801;
  import com.cloudframe.app.sf311010.dto.De48Se66SfLenGroup500;
  import com.cloudframe.app.sf311010.dto.De48Se24SfLenGroup500;
  import com.cloudframe.app.sf311010.dto.BiaDataConvGroup800;
  import com.cloudframe.app.sf311010.dto.WorkAcqIcaGroup800;
  import com.cloudframe.app.sf311010.dto.WorkFwdIcaGroup800;
  import com.cloudframe.app.sf311010.dto.WorkCompTwoGroup808;
  import com.cloudframe.app.sf311010.dto.De125WorkAreaAGroup890;
  import com.cloudframe.app.global.sharedvar.PtrSf910020Group800;
  import com.cloudframe.app.global.sharedvar.PtrSi994010Group800;
  import com.cloudframe.app.global.sharedvar.Si583ParserArea;
  import com.cloudframe.app.global.sharedvar.SeprControlBlock;
  import com.cloudframe.app.global.sharedvar.SeprTableGroup;
  import com.cloudframe.app.sf311010.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("sf311010")
  
  public class Sf311010Impl extends CommonProcess implements Sf311010 {
  
  Logger logger = LoggerFactory.getLogger(Sf311010Impl.class);
  
  
  @Value("${timeZoneId:Etc/GMT}")
  private String timeZoneId;
  
  
  @Autowired 
  @Qualifier("sf311010_centralSiteBdlogs")
  CentralSiteBdlogs centralSiteBdlogs;
  @Autowired 
  @Qualifier("mcwin")
  Mcwin mcwin;
  @Autowired 
  @Qualifier("mcabend")
  Mcabend mcabend;
  @Autowired 
  @Qualifier("sf311010_issAcqVer2FileOut")
  IssAcqVer2FileOut issAcqVer2FileOut;
  @Autowired 
  @Qualifier("sf311010_logStatisticsReport")
  LogStatisticsReport logStatisticsReport;
  @Autowired 
  @Qualifier("sf910020")
  Sf910020 sf910020;
  @Autowired 
  @Qualifier("si994010")
  Si994010 si994010;
  @Autowired 
  @Qualifier("si994020")
  Si994020 si994020;
  
  
  
  
  
  
      @Override
      public int setParameter(Sf311010Ctx programCtx, String a01PassedParm) throws Exception {
      		if(a01PassedParm != null)
      		    programCtx.getA01PassedParm().setString(com.cloudframe.app.data.Field.getParm(a01PassedParm),new String(CONSTANTS.EBCDIC_ENCODING));
      		setInitDone(false);
      		process(programCtx);
      		return programCtx.getRc();
      }
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      public int process(Sf311010Ctx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
ProcessInCtx methodIn = programCtx.getProcessInCtx();
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
      		if(centralSiteBdlogs.hasOpened() && !centralSiteBdlogs.isReadOnly()) { 
      			centralSiteBdlogs.flush(); 
      		}
      		if(issAcqVer2FileOut.hasOpened() && !issAcqVer2FileOut.isReadOnly()) { 
      			issAcqVer2FileOut.flush(); 
      		}
      		if(logStatisticsReport.hasOpened() && !logStatisticsReport.isReadOnly()) { 
      			logStatisticsReport.flush(); 
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

      * - centralSiteEofSw100            COBOL Name: 100-CENTRAL-SITE-EOF-SW
      *
      * Output : None 

      * @throws CFException
      */
      @Override
      public void mainline(MainlineInCtx methodIn) throws Exception {
Sf311010Ctx programCtx = methodIn.getSf311010Ctx();
//  PERFORM 1000-INITIALIZE
          initialize(programCtx.getInitializeInCtx());/*1000-INITIALIZE*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  PERFORM 2000-READ-CENTRAL-SITE-BDLOGS UNTIL 88-100-CENTRAL-SITE-EOF
          while (!(methodIn.isCentralSiteEof88100()) ) {
             readCentralSiteBdlogs(programCtx.getReadCentralSiteBdlogsInCtx());/*2000-READ-CENTRAL-SITE-BDLOGS*/
             if (programCtx.isProgramEnded()) {
                 return ;
             }
          }
//  PERFORM 6000-GENERATE-CONTROL-REPORT
          generateControlReport(programCtx);/*6000-GENERATE-CONTROL-REPORT*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  PERFORM 9900-EOJ-ROUTINE
          eojRoutine(programCtx.getEojRoutineInCtx());/*9900-EOJ-ROUTINE*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return ;
      
      }
      /**
      * initialize 
      *   This method is derived from 
  *   COBOL Paragraph - 1000-INITIALIZE COBOL Cyclomatic complexity - 10
      * Input  :  

      * - mciwinRetCentury               COBOL Name: MCIWIN-RET-CENTURY
      * - mcwinMsg1600                   COBOL Name: 600-MCWIN-MSG1
      * - mcwinMsg2600                   COBOL Name: 600-MCWIN-MSG2
      * - mciabendNodump                 COBOL Name: MCIABEND-NODUMP
      * - date800                        COBOL Name: 800-DATE
      * - time801                        COBOL Name: 801-TIME
      * - a01PassedParmLength            COBOL Name: A01-PASSED-PARM-LENGTH
      * - seven300                       COBOL Name: 300-SEVEN
      * - parmsMsg600                    COBOL Name: 600-PARMS-MSG
      * - a01PassedCycleId               COBOL Name: A01-PASSED-CYCLE-ID
      * - litA300                        COBOL Name: 300-LIT-A
      * - litB300                        COBOL Name: 300-LIT-B
      * - litC300                        COBOL Name: 300-LIT-C
      * - cycleMsg600                    COBOL Name: 600-CYCLE-MSG
      * - a01PassedVoiceIca              COBOL Name: A01-PASSED-VOICE-ICA
      * - voiceMsg600                    COBOL Name: 600-VOICE-MSG
      * - sf910020300                    COBOL Name: 300-SF910020
      * - si994010300                    COBOL Name: 300-SI994010
      * - seprCallSi994020               COBOL Name: SEPR-CALL-SI994020
      *
      * Output :  

      * - de48Se66SfLen9500              COBOL Name: 500-DE48-SE66-SF-LEN-9
      * - whenCompiled804                COBOL Name: 804-WHEN-COMPILED
      * - dateYymmdd800                  COBOL Name: 800-DATE-YYMMDD
      * - dateMm800                      COBOL Name: 800-DATE-MM
      * - dateMonth800                   COBOL Name: 800-DATE-MONTH
      * - dateDd800                      COBOL Name: 800-DATE-DD
      * - dateDay800                     COBOL Name: 800-DATE-DAY
      * - dateYy800                      COBOL Name: 800-DATE-YY
      * - dateYear800                    COBOL Name: 800-DATE-YEAR
      * - holdCurrentDate800             COBOL Name: 800-HOLD-CURRENT-DATE
      * - holdCurrYy800                  COBOL Name: 800-HOLD-CURR-YY
      * - mciwinYearToWindow             COBOL Name: MCIWIN-YEAR-TO-WINDOW
      * - rc                             COBOL Name: RETURN-CODE
      * - holdCurrCc800                  COBOL Name: 800-HOLD-CURR-CC
      * - mciwinRetCentury               COBOL Name: MCIWIN-RET-CENTURY
      * - mciwinReturnCode               COBOL Name: MCIWIN-RETURN-CODE
      * - mciabendAbendCode              COBOL Name: MCIABEND-ABEND-CODE
      * - mciabendDumpOpt                COBOL Name: MCIABEND-DUMP-OPT
      * - mciabendNodump                 COBOL Name: MCIABEND-NODUMP
      * - timeHhmmss801                  COBOL Name: 801-TIME-HHMMSS
      * - timeHh801                      COBOL Name: 801-TIME-HH
      * - timeHours801                   COBOL Name: 801-TIME-HOURS
      * - timeMm801                      COBOL Name: 801-TIME-MM
      * - timeMinutes801                 COBOL Name: 801-TIME-MINUTES
      * - timeSs801                      COBOL Name: 801-TIME-SS
      * - timeSeconds801                 COBOL Name: 801-TIME-SECONDS
      * - head1Date350                   COBOL Name: 350-HEAD1-DATE
      * - date800                        COBOL Name: 800-DATE
      * - head2Time352                   COBOL Name: 352-HEAD2-TIME
      * - compileDate804                 COBOL Name: 804-COMPILE-DATE
      * - compileTime804                 COBOL Name: 804-COMPILE-TIME
      * - cycleId100                     COBOL Name: 100-CYCLE-ID
      * - a01PassedCycleId               COBOL Name: A01-PASSED-CYCLE-ID
      * - ptrSf910020800                 COBOL Name: 800-PTR-SF910020
      * - ptrSi994010800                 COBOL Name: 800-PTR-SI994010
      * - seprPtrSi994020                COBOL Name: SEPR-PTR-SI994020
      *
      * @throws CFException
      */
      @Override
      public InitializeOutCtx initialize(InitializeInCtx methodIn) throws Exception {
      
// *
// ***********************************************************
// *    This is the initial paragraph that performs all      *
// *    set-ups in this program                              *
// ***********************************************************

// *
Sf311010Ctx programCtx = methodIn.getSf311010Ctx();
InitializeOutCtx methodOut = methodIn.getInitializeOutCtx();
//  INITIALIZE 500-DE48-SE66-SF-LEN-9
          methodOut.setDe48Se66SfLen9500(0);
          // MOVE WHEN-COMPILED TO 804-WHEN-COMPILED
          methodOut.getWhenCompiled804().setString(CONSTANTS.LITERAL_704083453);

// *
//  ACCEPT 800-DATE-YYMMDD FROM DATE
          methodOut.getDateYymmdd800().setString(CFUtil.getCurrentDateStr()); 
          // MOVE '211006' TO 800-DATE-YYMMDD
          //  LITERAL_211006 = '211006'
          methodOut.getDateYymmdd800().setString(CONSTANTS.LITERAL_211006);
//  MOVE 800-DATE-MM TO 800-DATE-MONTH
          methodOut.setDateMonth800(methodOut.getDateMm800());
//  MOVE 800-DATE-DD TO 800-DATE-DAY
          methodOut.setDateDay800(methodOut.getDateDd800());
//  MOVE 800-DATE-YY TO 800-DATE-YEAR
          methodOut.setDateYear800(methodOut.getDateYy800());

// *
          // MOVE 800-DATE-YYMMDD TO 800-HOLD-CURRENT-DATE
          methodOut.getHoldCurrentDate800().setString(methodOut.getDateYymmdd800().getCharArray());
//  MOVE 800-HOLD-CURR-YY TO MCIWIN-YEAR-TO-WINDOW
          methodOut.getMciwinYearToWindow().setString(String.valueOf(methodOut.getHoldCurrYy800String()).toCharArray());
//  CALL MCWIN-PROGRAM USING MCIWIN-YEAR-TO-WINDOW MCIWIN-RETURNED-YEAR MCIWIN-NEW-WINDOW-YEAR
          // CALL MCWIN-PROGRAM USING MCIWIN-YEAR-TO-WINDOW MCIWIN-RETURNED-YEAR MCIWIN-NEW-WINDOW-YEAR
               programCtx.setRc( mcwin.call(programCtx.getGlobalCtx().getContext("MCWIN"),methodOut.getMciwinYearToWindow(),methodOut.getMciwinReturnedYear(),methodOut.getMciwinNewWindowYearGroup()));
//  IF RETURN-CODE = ZERO
          if (	( programCtx.getRc() == 0 )) { 
//  MOVE MCIWIN-RET-CENTURY TO 800-HOLD-CURR-CC
              methodOut.setHoldCurrCc800(methodOut.getMciwinRetCentury());
          }
//  ELSE
          else { 
//  MOVE RETURN-CODE TO MCIWIN-RETURN-CODE MCIABEND-ABEND-CODE
              methodOut.setMciwinReturnCode(programCtx.getRc());
              methodOut.setMciabendAbendCode(programCtx.getRc());
//  DISPLAY 600-MCWIN-MSG1
              logger.info(new String(methodIn.getMcwinMsg1600())); 
//  DISPLAY 600-MCWIN-MSG2 MCIWIN-RETURN-CODE
              logger.info("{}{}", new String(methodIn.getMcwinMsg2600()), String.valueOf(methodOut.getMciwinReturnCode())); 
//  MOVE MCIABEND-NODUMP TO MCIABEND-DUMP-OPT
              methodOut.setMciabendDumpOpt(methodOut.getMciabendNodump());
//  CALL MCABEND-MODULE USING MCIABEND-PARM1
              // CALL MCABEND-MODULE USING MCIABEND-PARM1
                   programCtx.setRc( mcabend.call(programCtx.getGlobalCtx().getContext("MCABEND"),methodOut.getMciabendParm1()));
          }

// *
//  ACCEPT 801-TIME-HHMMSS FROM TIME
          methodOut.getTimeHhmmss801().setString(getCurrentTimeString()); 
          // MOVE '07462500' TO 801-TIME-HHMMSS
          //  LITERAL_07462500 = '07462500'
          methodOut.getTimeHhmmss801().setString(CONSTANTS.LITERAL_07462500);
//  MOVE 801-TIME-HH TO 801-TIME-HOURS
          methodOut.setTimeHours801(methodOut.getTimeHh801());
//  MOVE 801-TIME-MM TO 801-TIME-MINUTES
          methodOut.setTimeMinutes801(methodOut.getTimeMm801());
//  MOVE 801-TIME-SS TO 801-TIME-SECONDS
          methodOut.setTimeSeconds801(methodOut.getTimeSs801());

// *
          // MOVE 800-DATE TO 350-HEAD1-DATE
          methodOut.setHead1Date350(methodOut.getDate800().toCharArray());
//  MOVE '07:46:25' TO 352-HEAD2-TIME
//  LITERAL_07_CL2_4625 = '07:46:25'
          methodOut.setHead2Time352(CONSTANTS.LITERAL_07_CL2_4625);

// *
//  DISPLAY 'SF311010  SPLIT BANKNET LOG FILE TYPES'
          logger.info("SF311010  SPLIT BANKNET LOG FILE TYPES"); 
//  DISPLAY 'SF311010  PROGRAM COMPILED ' 804-COMPILE-DATE ' AT ' 804-COMPILE-TIME
          logger.info("SF311010  PROGRAM COMPILED {} AT {}", new String(methodOut.getCompileDate804()), new String(methodOut.getCompileTime804())); 
//  DISPLAY 'SF311010  PROGRAM EXECUTED ' 800-DATE ' AT ' 801-TIME
          logger.info("SF311010  PROGRAM EXECUTED {} AT {}", methodOut.getDate800().toString(), methodIn.getTime801().toString()); 
//  DISPLAY ' '
          logger.info(" "); 

// *
//  IF A01-PASSED-PARM-LENGTH = 300-SEVEN
//  ELSE
          if (	( methodIn.getA01PassedParmLength() != methodIn.getSeven300() ) ) { 
//  DISPLAY 600-PARMS-MSG
              logger.info(new String(methodIn.getParmsMsg600())); 
          }
//  IF A01-PASSED-CYCLE-ID = 300-LIT-A OR A01-PASSED-CYCLE-ID = 300-LIT-B OR A01-PASSED-CYCLE-ID = 300-LIT-C
          if (		compareChars(methodOut.getA01PassedCycleId(),methodIn.getLitA300()) == 0  || 		compareChars(methodOut.getA01PassedCycleId(),methodIn.getLitB300()) == 0  || 		compareChars(methodOut.getA01PassedCycleId(),methodIn.getLitC300()) == 0 ) { 
              // MOVE A01-PASSED-CYCLE-ID TO 100-CYCLE-ID
              methodOut.setCycleId100(methodOut.getA01PassedCycleId());
          }
//  ELSE
          else { 
//  DISPLAY 600-CYCLE-MSG
              logger.info(new String(methodIn.getCycleMsg600())); 
          }
//  IF A01-PASSED-VOICE-ICA NUMERIC
//  ELSE
          if (    !( isNumeric(methodIn.getA01PassedVoiceIca()) )) { 
//  DISPLAY 600-VOICE-MSG
              logger.info(new String(methodIn.getVoiceMsg600())); 
          }

// *
//  SET 800-PTR-SF910020 TO ENTRY 300-SF910020
          methodOut.setPtrSf910020800(methodIn.getSf910020300()); 
          
//  SET 800-PTR-SI994010 TO ENTRY 300-SI994010
          methodOut.setPtrSi994010800(methodIn.getSi994010300()); 
          

// *
//  SET SEPR-PTR-SI994020 TO ENTRY SEPR-CALL-SI994020
          methodOut.setSeprPtrSi994020(methodIn.getSeprCallSi994020()); 
          
//  OPEN INPUT CENTRAL-SITE-BDLOGS
          centralSiteBdlogs.open(new String(CONSTANTS.MODE_READ_ONLY_36242),centralSiteBdlogs.getFileName(),centralSiteBdlogs.getCentralSiteBdlogsCharSet(),centralSiteBdlogs.getCentralSiteBdlogsCrlfFlag());

// *
//  OPEN OUTPUT ISS-ACQ-VER2-FILE-OUT LOG-STATISTICS-REPORT
          issAcqVer2FileOut.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),issAcqVer2FileOut.getFileName(),issAcqVer2FileOut.getIssAcqVer2FileOutCharSet(),issAcqVer2FileOut.getIssAcqVer2FileOutCrlfFlag());
          logStatisticsReport.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),logStatisticsReport.getFileName(),logStatisticsReport.getLogStatisticsReportCharSet(),logStatisticsReport.getLogStatisticsReportCrlfFlag());
      
      return methodOut;
      }
      /**
      * readCentralSiteBdlogs 
      *   This method is derived from 
  *   COBOL Paragraph - 2000-READ-CENTRAL-SITE-BDLOGS COBOL Cyclomatic complexity - 1
      * Input  :  

      * - logLen800                      COBOL Name: 800-LOG-LEN
      *
      * Output :  

      * - centralSiteRecord              COBOL Name: CENTRAL-SITE-RECORD
      * - centralSiteEofSw100            COBOL Name: 100-CENTRAL-SITE-EOF-SW
      *
      * @throws CFException
      */
      @Override
      public ReadCentralSiteBdlogsOutCtx readCentralSiteBdlogs(ReadCentralSiteBdlogsInCtx methodIn) throws Exception {
      
// *
Sf311010Ctx programCtx = methodIn.getSf311010Ctx();
ReadCentralSiteBdlogsOutCtx methodOut = methodIn.getReadCentralSiteBdlogsOutCtx();
//  READ CENTRAL-SITE-BDLOGS
          	centralSiteBdlogs.read();
          methodIn.setLogLen800(centralSiteBdlogs.getRecLen());
          if (!centralSiteBdlogs.hasEnded()) {
          	methodOut.getCentralSiteRecord().setString(centralSiteBdlogs.getRecord());
          }
//  AT END
          if (centralSiteBdlogs.hasEnded()) {  
//  SET 88-100-CENTRAL-SITE-EOF TO TRUE
              methodOut.setCentralSiteEof88100True(); 
              
//  DISPLAY 'CENTRAL SITE LOG PROCESSING COMPLETED'
              logger.info("CENTRAL SITE LOG PROCESSING COMPLETED"); 
            }
//  NOT AT END
          else  {
//  PERFORM 3000-PROCESS-LOG
              processLog(programCtx.getProcessLogInCtx());/*3000-PROCESS-LOG*/
            }
      
      return methodOut;
      }
      /**
      * processLog 
      *   This method is derived from 
  *   COBOL Paragraph - 3000-PROCESS-LOG COBOL Cyclomatic complexity - 4
      * Input  :  

      * - totalRecs400                   COBOL Name: 400-TOTAL-RECS
      * - packedOne300                   COBOL Name: 300-PACKED-ONE
      * - logLen800                      COBOL Name: 800-LOG-LEN
      * - centralSiteRecord              COBOL Name: CENTRAL-SITE-RECORD
      * - totalIsoAuth400                COBOL Name: 400-TOTAL-ISO-AUTH
      * - litIa300                       COBOL Name: 300-LIT-IA
      * - totalIaDropped400              COBOL Name: 400-TOTAL-IA-DROPPED
      * - one300                         COBOL Name: 300-ONE
      *
      * Output :  

      * - totalRecs400                   COBOL Name: 400-TOTAL-RECS
      * - sf501LogRecord                 COBOL Name: SF501-LOG-RECORD
      * - centralSiteRecord              COBOL Name: CENTRAL-SITE-RECORD
      * - sf501Class                     COBOL Name: SF501-CLASS
      * - logClass100                    COBOL Name: 100-LOG-CLASS
      * - sf501Type                      COBOL Name: SF501-TYPE
      * - logType100                     COBOL Name: 100-LOG-TYPE
      * - parseSw100                     COBOL Name: 100-PARSE-SW
      * - totalIsoAuth400                COBOL Name: 400-TOTAL-ISO-AUTH
      * - sf501JPosEntryPoint            COBOL Name: SF501-J-POS-ENTRY-POINT
      * - totalIaDropped400              COBOL Name: 400-TOTAL-IA-DROPPED
      *
      * @throws CFException
      */
      @Override
      public ProcessLogOutCtx processLog(ProcessLogInCtx methodIn) throws Exception {
      
// ***********************************************************
// *    This paragraph will separate the banknet logs and    *
// *    process only j2, j3 & ja.                            *
// ***********************************************************
Sf311010Ctx programCtx = methodIn.getSf311010Ctx();
ProcessLogOutCtx methodOut = methodIn.getProcessLogOutCtx();
//  ADD 300-PACKED-ONE TO 400-TOTAL-RECS
          methodOut.setTotalRecs400(methodOut.getTotalRecs400()+(short) methodIn.getPackedOne300());
//  MOVE CENTRAL-SITE-RECORD (1 : 800-LOG-LEN ) TO SF501-LOG-RECORD (1 : 800-LOG-LEN )
          methodOut.getSf501LogRecord().replace(methodOut.getCentralSiteRecord(),0,methodIn.getLogLen800(),0,methodIn.getLogLen800() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE SF501-CLASS TO 100-LOG-CLASS
          methodOut.setLogClass100(methodOut.getSf501Class());
//  MOVE SF501-TYPE TO 100-LOG-TYPE
          methodOut.setLogType100(methodOut.getSf501Type());
//  SET 88-100-NOT-PARSED TO TRUE
          methodOut.setNotParsed88100True(); 
          

// * Ia is not valid in production, drop them at this point.
//  IF 88-100-LOG-CLASS-J AND 88-100-LOG-TYPE-2-3-A
          if ( methodOut.isLogClassJ88100()   &&  methodOut.isLogType23A88100()  ) { 
//  ADD 300-PACKED-ONE TO 400-TOTAL-ISO-AUTH
              methodOut.setTotalIsoAuth400(methodOut.getTotalIsoAuth400()+(short) methodIn.getPackedOne300());
//  IF SF501-J-POS-ENTRY-POINT = 300-LIT-IA
              if (		compareChars(methodOut.getSf501JPosEntryPoint(),methodIn.getLitIa300()) == 0 ) { 
//  ADD 300-ONE TO 400-TOTAL-IA-DROPPED
                  methodOut.setTotalIaDropped400(methodOut.getTotalIaDropped400()+(int) methodIn.getOne300());
              }
//  ELSE
              else { 
//  PERFORM 3100-PROCESS-J-LOGS
                  processJLogs(programCtx.getProcessJLogsInCtx());/*3100-PROCESS-J-LOGS*/
              }
          }
      
      return methodOut;
      }
      /**
      * processJLogs 
      *   This method is derived from 
  *   COBOL Paragraph - 3100-PROCESS-J-LOGS COBOL Cyclomatic complexity - 13
      * Input  :  

      * - logType100                     COBOL Name: 100-LOG-TYPE
      * - totalType2400                  COBOL Name: 400-TOTAL-TYPE-2
      * - one300                         COBOL Name: 300-ONE
      * - logLen800                      COBOL Name: 800-LOG-LEN
      * - binary61300                    COBOL Name: 300-BINARY-61
      * - sf501JIsoData                  COBOL Name: SF501-J-ISO-DATA
      * - totalType3400                  COBOL Name: 400-TOTAL-TYPE-3
      * - binary88300                    COBOL Name: 300-BINARY-88
      * - sf501J3Data                    COBOL Name: SF501-J3-DATA
      * - lit0420300                     COBOL Name: 300-LIT-0420
      * - lit0430300                     COBOL Name: 300-LIT-0430
      * - lit0120300                     COBOL Name: 300-LIT-0120
      * - lit0130300                     COBOL Name: 300-LIT-0130
      * - totalRevAdv400                 COBOL Name: 400-TOTAL-REV-ADV
      * - total0120Adv400                COBOL Name: 400-TOTAL-0120-ADV
      * - parseSw100                     COBOL Name: 100-PARSE-SW
      * - sf31IsoAuthResponse            COBOL Name: SF31-ISO-AUTH-RESPONSE
      * - lit30300                       COBOL Name: 300-LIT-30
      * - sf31IsoAuthAddlData            COBOL Name: SF31-ISO-AUTH-ADDL-DATA
      * - lit002300                      COBOL Name: 300-LIT-002
      * - totalBadPan400                 COBOL Name: 400-TOTAL-BAD-PAN
      * - sf31IsoBkntRefNo               COBOL Name: SF31-ISO-BKNT-REF-NO
      * - sf31IsoCardholderNbr           COBOL Name: SF31-ISO-CARDHOLDER-NBR
      * - totalVer2400                   COBOL Name: 400-TOTAL-VER2
      * - issAcqVer2Record               COBOL Name: ISS-ACQ-VER2-RECORD
      *
      * Output :  

      * - totalType2400                  COBOL Name: 400-TOTAL-TYPE-2
      * - si583DataLength                COBOL Name: SI583-DATA-LENGTH
      * - si583DataPtr                   COBOL Name: SI583-DATA-PTR
      * - mti800                         COBOL Name: 800-MTI
      * - sf501JIsoData                  COBOL Name: SF501-J-ISO-DATA
      * - totalType3400                  COBOL Name: 400-TOTAL-TYPE-3
      * - sf501J3Data                    COBOL Name: SF501-J3-DATA
      * - totalRevAdv400                 COBOL Name: 400-TOTAL-REV-ADV
      * - total0120Adv400                COBOL Name: 400-TOTAL-0120-ADV
      * - totalBadPan400                 COBOL Name: 400-TOTAL-BAD-PAN
      * - totalVer2400                   COBOL Name: 400-TOTAL-VER2
      *
      * @throws CFException
      */
      @Override
      public ProcessJLogsOutCtx processJLogs(ProcessJLogsInCtx methodIn) throws Exception {
      
// *
// **************************************************************
// *    This paragraph decides what type iso log to process.    *
// *    set the address pointer to the start of the data to     *
// *    be parsed.                                              *
// **************************************************************
Sf311010Ctx programCtx = methodIn.getSf311010Ctx();
ProcessJLogsOutCtx methodOut = methodIn.getProcessJLogsOutCtx();
//  IF 88-100-LOG-TYPE-2-A
          if ( methodIn.isLogType2A88100()  ) { 
//  ADD 300-ONE TO 400-TOTAL-TYPE-2
              methodOut.setTotalType2400(methodOut.getTotalType2400()+(int) methodIn.getOne300());
              methodOut.setSi583DataLength(methodIn.getLogLen800() - methodIn.getBinary61300());
//  SET SI583-DATA-PTR TO ADDRESS OF SF501-J-ISO-DATA
              methodOut.setSi583DataPtr(setObject(methodIn.getSf501RecordRedefined(),61,7939)); 
              
//  DISPLAY '*2-A-LOG * ' SF501-J-ISO-DATA (101 : 100)
              logger.info("*2-A-LOG * {}", new String(substring(methodOut.getSf501JIsoData(),100,200))); 
//  MOVE SF501-J-ISO-DATA (1 : 4) TO 800-MTI
              methodOut.setMti800(substring(methodOut.getSf501JIsoData(),0,4));
          }
//  IF 88-100-LOG-TYPE-3
          if ( methodIn.isLogType388100()  ) { 
//  ADD 300-ONE TO 400-TOTAL-TYPE-3
              methodOut.setTotalType3400(methodOut.getTotalType3400()+(int) methodIn.getOne300());
              methodOut.setSi583DataLength(methodIn.getLogLen800() - methodIn.getBinary88300());
//  SET SI583-DATA-PTR TO ADDRESS OF SF501-J3-DATA
              methodOut.setSi583DataPtr(setObject(methodIn.getSf501JIsoDataRedefined(),88,7912)); 
              
//  DISPLAY '*3---LOG * ' SF501-J3-DATA (101 : 100)
              logger.info("*3---LOG * {}", new String(substring(methodOut.getSf501J3Data(),100,200))); 
//  MOVE SF501-J3-DATA (1 : 4) TO 800-MTI
              methodOut.setMti800(substring(methodOut.getSf501J3Data(),0,4));
          }

// **** Bypass reversal advices                                 *
// ****    bypass 0120 authorization advices.                      *
//  IF 800-MTI = 300-LIT-0420 OR 300-LIT-0430 OR 800-MTI = 300-LIT-0120 OR 300-LIT-0130
          if (		compareChars(methodOut.getMti800(),methodIn.getLit0420300()) == 0  || 		compareChars(methodOut.getMti800(),methodIn.getLit0430300()) == 0  || 		compareChars(methodOut.getMti800(),methodIn.getLit0120300()) == 0  || 		compareChars(methodOut.getMti800(),methodIn.getLit0130300()) == 0 ) { 
//  IF 800-MTI = 300-LIT-0420 OR 300-LIT-0430
              if (		compareChars(methodOut.getMti800(),methodIn.getLit0420300()) == 0  || 		compareChars(methodOut.getMti800(),methodIn.getLit0430300()) == 0 ) { 
//  ADD 300-ONE TO 400-TOTAL-REV-ADV
                  methodOut.setTotalRevAdv400(methodOut.getTotalRevAdv400()+(int) methodIn.getOne300());
              }
//  ELSE
              else { 
//  ADD 300-ONE TO 400-TOTAL-0120-ADV
                  methodOut.setTotal0120Adv400(methodOut.getTotal0120Adv400()+(int) methodIn.getOne300());
              }
          }
//  ELSE
          else { 
//  PERFORM 5000-CALL-PARSER
              callParser(programCtx.getCallParserInCtx());/*5000-CALL-PARSER*/
//  IF 88-100-PARSED
              if ( methodIn.isParsed88100()  ) { 
//  PERFORM 3120-MOVE-DATA
                  moveData(programCtx.getMoveDataInCtx());/*3120-MOVE-DATA*/
//  IF ( SF31-ISO-AUTH-RESPONSE = 300-LIT-30 AND SF31-ISO-AUTH-ADDL-DATA (1 : 3) = 300-LIT-002 )
                  if ((		compareChars(methodIn.getSf31IsoAuthResponse(),methodIn.getLit30300()) == 0  && Field.compareChar(methodIn.getSf31IsoAuthAddlData() , methodIn.getLit002300() , ( 0 /*start*/ ), 3 /*left len*/ , 3 /*right len*/))) { 
//  ADD 300-ONE TO 400-TOTAL-BAD-PAN
                      methodOut.setTotalBadPan400(methodOut.getTotalBadPan400()+(int) methodIn.getOne300());
//  DISPLAY 'FORMAT ERROR, INVALID PAN ' SF31-ISO-BKNT-REF-NO SPACE SF31-ISO-CARDHOLDER-NBR (1 : 11)
                      logger.info("FORMAT ERROR, INVALID PAN {}{}", new String(methodIn.getSf31IsoBkntRefNo()), new String(substring(methodIn.getSf31IsoCardholderNbr(),0,11))); 
                  }
//  ELSE
                  else { 
//  ADD 300-ONE TO 400-TOTAL-VER2
                      methodOut.setTotalVer2400(methodOut.getTotalVer2400()+(int) methodIn.getOne300());
//  WRITE ISS-ACQ-VER2-RECORD FROM SF31-ISO-EXTRACT-REC
                      issAcqVer2FileOut.write(methodIn.getSf31IsoExtractRec().toCharArray()); 
                      methodOut.getIssAcqVer2Record().setString(CONSTANTS.LOW_VALUE_215516604);
                  }
              }
          }
      
      return methodOut;
      }
      /**
      * moveData 
      *   This method is derived from 
  *   COBOL Paragraph - 3120-MOVE-DATA COBOL Cyclomatic complexity - 254
      * Input  :  

      * - sf501HdrHour                   COBOL Name: SF501-HDR-HOUR
      * - convData800                    COBOL Name: 800-CONV-DATA
      * - sf501HdrMin                    COBOL Name: SF501-HDR-MIN
      * - sf501HdrSec                    COBOL Name: SF501-HDR-SEC
      * - sf501HdrMon                    COBOL Name: SF501-HDR-MON
      * - sf501HdrDay                    COBOL Name: SF501-HDR-DAY
      * - sf501HdrYear                   COBOL Name: SF501-HDR-YEAR
      * - sf501JResponseInd              COBOL Name: SF501-J-RESPONSE-IND
      * - nine300                        COBOL Name: 300-NINE
      * - eight300                       COBOL Name: 300-EIGHT
      * - seven300                       COBOL Name: 300-SEVEN
      * - six300                         COBOL Name: 300-SIX
      * - five300                        COBOL Name: 300-FIVE
      * - four300                        COBOL Name: 300-FOUR
      * - three300                       COBOL Name: 300-THREE
      * - two300                         COBOL Name: 300-TWO
      * - one300                         COBOL Name: 300-ONE
      * - sf501JDownOption               COBOL Name: SF501-J-DOWN-OPTION
      * - sf501JMotoOption               COBOL Name: SF501-J-MOTO-OPTION
      * - cardholderNbr860               COBOL Name: 860-CARDHOLDER-NBR
      * - authNumber860                  COBOL Name: 860-AUTH-NUMBER
      * - authResponse860                COBOL Name: 860-AUTH-RESPONSE
      * - authAddlData860                COBOL Name: 860-AUTH-ADDL-DATA
      * - cardholderExpdt860             COBOL Name: 860-CARDHOLDER-EXPDT
      * - trackTwoData860                COBOL Name: 860-TRACK-TWO-DATA
      * - trackOneData860                COBOL Name: 860-TRACK-ONE-DATA
      * - sysTraceAudit860               COBOL Name: 860-SYS-TRACE-AUDIT
      * - de11TraceAudit800              COBOL Name: 800-DE11-TRACE-AUDIT
      * - posData860                     COBOL Name: 860-POS-DATA
      * - acquirerIca860                 COBOL Name: 860-ACQUIRER-ICA
      * - forwardInstId860               COBOL Name: 860-FORWARD-INST-ID
      * - timeLocalTrans100860           COBOL Name: 860-TIME-LOCAL-TRANS-100
      * - dateLocalTrans100860           COBOL Name: 860-DATE-LOCAL-TRANS-100
      * - posDeviceType860               COBOL Name: 860-POS-DEVICE-TYPE
      * - posEntry110860                 COBOL Name: 860-POS-ENTRY-110
      * - si583DeLength1                 COBOL Name: SI583-DE-LENGTH-1
      * - si583Mti1                      COBOL Name: SI583-MTI-1
      * - mti0110300                     COBOL Name: 300-MTI-0110
      * - data1000                       COBOL Name: 1000-DATA
      * - si583DeLength2                 COBOL Name: SI583-DE-LENGTH-2
      * - si583Mti2                      COBOL Name: SI583-MTI-2
      * - mti0100300                     COBOL Name: 300-MTI-0100
      * - finNetwork110860               COBOL Name: 860-FIN-NETWORK-110
      * - finNetworkCode860              COBOL Name: 860-FIN-NETWORK-CODE
      * - processingCode110860           COBOL Name: 860-PROCESSING-CODE-110
      * - processingCode100860           COBOL Name: 860-PROCESSING-CODE-100
      * - dateTimeXmit110860             COBOL Name: 860-DATE-TIME-XMIT-110
      * - dateTimeXmit100860             COBOL Name: 860-DATE-TIME-XMIT-100
      * - transMmdd110860                COBOL Name: 860-TRANS-MMDD-110
      * - transMmdd860                   COBOL Name: 860-TRANS-MMDD
      * - merchantType110860             COBOL Name: 860-MERCHANT-TYPE-110
      * - merchantType860                COBOL Name: 860-MERCHANT-TYPE
      * - countryCode110860              COBOL Name: 860-COUNTRY-CODE-110
      * - countryCode860                 COBOL Name: 860-COUNTRY-CODE
      * - posPinCapture110860            COBOL Name: 860-POS-PIN-CAPTURE-110
      * - posPinCapture860               COBOL Name: 860-POS-PIN-CAPTURE
      * - retrievalRefno110860           COBOL Name: 860-RETRIEVAL-REFNO-110
      * - retrievalRefno860              COBOL Name: 860-RETRIEVAL-REFNO
      * - idTerminal110860               COBOL Name: 860-ID-TERMINAL-110
      * - idTerminal860                  COBOL Name: 860-ID-TERMINAL
      * - cardAcceptor110860             COBOL Name: 860-CARD-ACCEPTOR-110
      * - cardAcceptor860                COBOL Name: 860-CARD-ACCEPTOR
      * - authMrchNmctst110860           COBOL Name: 860-AUTH-MRCH-NMCTST-110
      * - authMrchNmctst860              COBOL Name: 860-AUTH-MRCH-NMCTST
      * - bkntData110860                 COBOL Name: 860-BKNT-DATA-110
      * - bkntData860                    COBOL Name: 860-BKNT-DATA
      * - si583DePresentInd2             COBOL Name: SI583-DE-PRESENT-IND-2
      * - si583DePresentInd1             COBOL Name: SI583-DE-PRESENT-IND-1
      * - lit380000300                   COBOL Name: 300-LIT-380000
      * - avs2RecCount400                COBOL Name: 400-AVS2-REC-COUNT
      *
      * Output :  

      * - sf31IsoExtractRec              COBOL Name: SF31-ISO-EXTRACT-REC
      * - biaByte800                     COBOL Name: 800-BIA-BYTE
      * - sf501HdrHour                   COBOL Name: SF501-HDR-HOUR
      * - hour800                        COBOL Name: 800-HOUR
      * - convData800                    COBOL Name: 800-CONV-DATA
      * - sf501HdrMin                    COBOL Name: SF501-HDR-MIN
      * - min800                         COBOL Name: 800-MIN
      * - sf501HdrSec                    COBOL Name: SF501-HDR-SEC
      * - sec800                         COBOL Name: 800-SEC
      * - workCompTwo808                 COBOL Name: 808-WORK-COMP-TWO
      * - workCompOneByte808             COBOL Name: 808-WORK-COMP-ONE-BYTE
      * - sf501HdrMon                    COBOL Name: SF501-HDR-MON
      * - sf501HdrDay                    COBOL Name: SF501-HDR-DAY
      * - sf501HdrYear                   COBOL Name: SF501-HDR-YEAR
      * - asmTranByte880                 COBOL Name: 880-ASM-TRAN-BYTE
      * - sf501JResponseInd              COBOL Name: SF501-J-RESPONSE-IND
      * - rc                             COBOL Name: RETURN-CODE
      * - isoBlResponse1800              COBOL Name: 800-ISO-BL-RESPONSE-1
      * - nine300                        COBOL Name: 300-NINE
      * - eight300                       COBOL Name: 300-EIGHT
      * - seven300                       COBOL Name: 300-SEVEN
      * - six300                         COBOL Name: 300-SIX
      * - five300                        COBOL Name: 300-FIVE
      * - four300                        COBOL Name: 300-FOUR
      * - three300                       COBOL Name: 300-THREE
      * - two300                         COBOL Name: 300-TWO
      * - one300                         COBOL Name: 300-ONE
      * - isoBlResponse2800              COBOL Name: 800-ISO-BL-RESPONSE-2
      * - sf501JDownOption               COBOL Name: SF501-J-DOWN-OPTION
      * - asmBitSw880                    COBOL Name: 880-ASM-BIT-SW
      * - isoBlDown1800                  COBOL Name: 800-ISO-BL-DOWN-1
      * - isoBlDown2800                  COBOL Name: 800-ISO-BL-DOWN-2
      * - sf501JMotoOption               COBOL Name: SF501-J-MOTO-OPTION
      * - isoBlMoto1800                  COBOL Name: 800-ISO-BL-MOTO-1
      * - sf31IsoCardholderNbr           COBOL Name: SF31-ISO-CARDHOLDER-NBR
      * - cardholderNbr860               COBOL Name: 860-CARDHOLDER-NBR
      * - sf31IsoAuthNumber              COBOL Name: SF31-ISO-AUTH-NUMBER
      * - authNumber860                  COBOL Name: 860-AUTH-NUMBER
      * - sf31IsoAuthResponse            COBOL Name: SF31-ISO-AUTH-RESPONSE
      * - authResponse860                COBOL Name: 860-AUTH-RESPONSE
      * - sf31IsoAuthAddlData            COBOL Name: SF31-ISO-AUTH-ADDL-DATA
      * - authAddlData860                COBOL Name: 860-AUTH-ADDL-DATA
      * - sf31IsoCardholderExpdt         COBOL Name: SF31-ISO-CARDHOLDER-EXPDT
      * - cardholderExpdt860             COBOL Name: 860-CARDHOLDER-EXPDT
      * - sf31IsoTrackTwoData            COBOL Name: SF31-ISO-TRACK-TWO-DATA
      * - trackTwoData860                COBOL Name: 860-TRACK-TWO-DATA
      * - sf31IsoTrackOneData            COBOL Name: SF31-ISO-TRACK-ONE-DATA
      * - trackOneData860                COBOL Name: 860-TRACK-ONE-DATA
      * - traceAudit800                  COBOL Name: 800-TRACE-AUDIT
      * - sysTraceAudit860               COBOL Name: 860-SYS-TRACE-AUDIT
      * - sf31IsoBlIcSeqNo               COBOL Name: SF31-ISO-BL-IC-SEQ-NO
      * - de11TraceAudit800              COBOL Name: 800-DE11-TRACE-AUDIT
      * - sf31IsoPosData                 COBOL Name: SF31-ISO-POS-DATA
      * - posData860                     COBOL Name: 860-POS-DATA
      * - workAcqIca800                  COBOL Name: 800-WORK-ACQ-ICA
      * - acquirerIca800                 COBOL Name: 800-ACQUIRER-ICA
      * - acquirerIca860                 COBOL Name: 860-ACQUIRER-ICA
      * - acqFiller1800                  COBOL Name: 800-ACQ-FILLER-1
      * - acquirerIcaOnly4800            COBOL Name: 800-ACQUIRER-ICA-ONLY4
      * - acqIcaOnly4800                 COBOL Name: 800-ACQ-ICA-ONLY4
      * - sf31IsoAcquirerIca             COBOL Name: SF31-ISO-ACQUIRER-ICA
      * - acqFiller2800                  COBOL Name: 800-ACQ-FILLER-2
      * - acquirerIcaOnly5800            COBOL Name: 800-ACQUIRER-ICA-ONLY5
      * - acqIcaOnly5800                 COBOL Name: 800-ACQ-ICA-ONLY5
      * - workFwdIca800                  COBOL Name: 800-WORK-FWD-ICA
      * - forwardIca800                  COBOL Name: 800-FORWARD-ICA
      * - forwardInstId860               COBOL Name: 860-FORWARD-INST-ID
      * - sf31IsoForwardInstIdOnly       COBOL Name: SF31-ISO-FORWARD-INST-ID-ONLY
      * - fwdFiller1800                  COBOL Name: 800-FWD-FILLER-1
      * - forwardIcaOnly4800             COBOL Name: 800-FORWARD-ICA-ONLY4
      * - fwdIcaOnly4800                 COBOL Name: 800-FWD-ICA-ONLY4
      * - fwdFiller2800                  COBOL Name: 800-FWD-FILLER-2
      * - forwardIcaOnly5800             COBOL Name: 800-FORWARD-ICA-ONLY5
      * - fwdIcaOnly5800                 COBOL Name: 800-FWD-ICA-ONLY5
      * - sf31IsoTimeLocalTrans          COBOL Name: SF31-ISO-TIME-LOCAL-TRANS
      * - timeLocalTrans100860           COBOL Name: 860-TIME-LOCAL-TRANS-100
      * - sf31IsoDateLocalTrans          COBOL Name: SF31-ISO-DATE-LOCAL-TRANS
      * - dateLocalTrans100860           COBOL Name: 860-DATE-LOCAL-TRANS-100
      * - sf31IsoPosDeviceType           COBOL Name: SF31-ISO-POS-DEVICE-TYPE
      * - posDeviceType860               COBOL Name: 860-POS-DEVICE-TYPE
      * - posEntry110860                 COBOL Name: 860-POS-ENTRY-110
      * - de48Data500                    COBOL Name: 500-DE48-DATA
      * - messageType100                 COBOL Name: 100-MESSAGE-TYPE
      * - seprDataLength                 COBOL Name: SEPR-DATA-LENGTH
      * - si583DeLength1                 COBOL Name: SI583-DE-LENGTH-1
      * - data1000                       COBOL Name: 1000-DATA
      * - sf31IsoTransactionType         COBOL Name: SF31-ISO-TRANSACTION-TYPE
      * - sf31IsoAddtlData               COBOL Name: SF31-ISO-ADDTL-DATA
      * - si583DeLength2                 COBOL Name: SI583-DE-LENGTH-2
      * - sf31IsoFinNetworkCode          COBOL Name: SF31-ISO-FIN-NETWORK-CODE
      * - finNetwork110860               COBOL Name: 860-FIN-NETWORK-110
      * - finNetworkCode860              COBOL Name: 860-FIN-NETWORK-CODE
      * - sf31IsoProcessingCode          COBOL Name: SF31-ISO-PROCESSING-CODE
      * - processingCode110860           COBOL Name: 860-PROCESSING-CODE-110
      * - processingCode100860           COBOL Name: 860-PROCESSING-CODE-100
      * - sf31IsoDateTimeXmit            COBOL Name: SF31-ISO-DATE-TIME-XMIT
      * - dateTimeXmit110860             COBOL Name: 860-DATE-TIME-XMIT-110
      * - dateTimeXmit100860             COBOL Name: 860-DATE-TIME-XMIT-100
      * - sf31IsoTransMmdd               COBOL Name: SF31-ISO-TRANS-MMDD
      * - transMmdd110860                COBOL Name: 860-TRANS-MMDD-110
      * - transMmdd860                   COBOL Name: 860-TRANS-MMDD
      * - sf31IsoMerchantType            COBOL Name: SF31-ISO-MERCHANT-TYPE
      * - merchantType110860             COBOL Name: 860-MERCHANT-TYPE-110
      * - merchantType860                COBOL Name: 860-MERCHANT-TYPE
      * - sf31IsoCountryCode             COBOL Name: SF31-ISO-COUNTRY-CODE
      * - countryCode110860              COBOL Name: 860-COUNTRY-CODE-110
      * - countryCode860                 COBOL Name: 860-COUNTRY-CODE
      * - sf31IsoPosPinCapture           COBOL Name: SF31-ISO-POS-PIN-CAPTURE
      * - posPinCapture110860            COBOL Name: 860-POS-PIN-CAPTURE-110
      * - posPinCapture860               COBOL Name: 860-POS-PIN-CAPTURE
      * - sf31IsoRetrievalRefno          COBOL Name: SF31-ISO-RETRIEVAL-REFNO
      * - retrievalRefno110860           COBOL Name: 860-RETRIEVAL-REFNO-110
      * - retrievalRefno860              COBOL Name: 860-RETRIEVAL-REFNO
      * - sf31IsoIdTerminal              COBOL Name: SF31-ISO-ID-TERMINAL
      * - idTerminal110860               COBOL Name: 860-ID-TERMINAL-110
      * - idTerminal860                  COBOL Name: 860-ID-TERMINAL
      * - sf31IsoCardAcceptor            COBOL Name: SF31-ISO-CARD-ACCEPTOR
      * - cardAcceptor110860             COBOL Name: 860-CARD-ACCEPTOR-110
      * - cardAcceptor860                COBOL Name: 860-CARD-ACCEPTOR
      * - sf31IsoDe43MrchNmctst          COBOL Name: SF31-ISO-DE43-MRCH-NMCTST
      * - authMrchNmctst110860           COBOL Name: 860-AUTH-MRCH-NMCTST-110
      * - authMrchNmctst860              COBOL Name: 860-AUTH-MRCH-NMCTST
      * - sf31IsoBkntData                COBOL Name: SF31-ISO-BKNT-DATA
      * - bkntData110860                 COBOL Name: 860-BKNT-DATA-110
      * - bkntData860                    COBOL Name: 860-BKNT-DATA
      * - sf31IsoMerchantId              COBOL Name: SF31-ISO-MERCHANT-ID
      * - de120Data500                   COBOL Name: 500-DE120-DATA
      * - avs2RecCount400                COBOL Name: 400-AVS2-REC-COUNT
      *
      * @throws CFException
      */
      @Override
      public MoveDataOutCtx moveData(MoveDataInCtx methodIn) throws Exception {
      
// *
Sf311010Ctx programCtx = methodIn.getSf311010Ctx();
MoveDataOutCtx methodOut = methodIn.getMoveDataOutCtx();
          // MOVE LOW-VALUES TO SF31-ISO-EXTRACT-REC
          methodOut.getSf31IsoExtractRec().setString(CONSTANTS.LOW_VALUE_215516604);

// *
//  MOVE SF501-HDR-HOUR TO 800-BIA-BYTE
          methodOut.setBiaByte800(methodOut.getSf501HdrHour());
//  MOVE 800-CONV-DATA TO 800-HOUR
          methodOut.setHour800(methodOut.getConvData800());
//  MOVE SF501-HDR-MIN TO 800-BIA-BYTE
          methodOut.setBiaByte800(methodOut.getSf501HdrMin());
//  MOVE 800-CONV-DATA TO 800-MIN
          methodOut.setMin800(methodOut.getConvData800());
//  MOVE SF501-HDR-SEC TO 800-BIA-BYTE
          methodOut.setBiaByte800(methodOut.getSf501HdrSec());
//  MOVE 800-CONV-DATA TO 800-SEC
          methodOut.setSec800(methodOut.getConvData800());
//  MOVE ZEROS TO 808-WORK-COMP-TWO
          methodOut.setWorkCompTwo808(0);
//  MOVE SF501-HDR-MON TO 808-WORK-COMP-ONE-BYTE
          methodOut.setWorkCompOneByte808(methodOut.getSf501HdrMon());
//  MOVE SF501-HDR-DAY TO 808-WORK-COMP-ONE-BYTE
          methodOut.setWorkCompOneByte808(methodOut.getSf501HdrDay());
//  MOVE SF501-HDR-YEAR TO 808-WORK-COMP-ONE-BYTE
          methodOut.setWorkCompOneByte808(methodOut.getSf501HdrYear());

// *
//  MOVE SF501-J-RESPONSE-IND TO 880-ASM-TRAN-BYTE
          methodOut.setAsmTranByte880(methodOut.getSf501JResponseInd());
//  CALL 800-PTR-SF910020 USING 880-ASM-SF910020-PARMS
          // CALL 800-PTR-SF910020 USING 880-ASM-SF910020-PARMS
               programCtx.setRc( sf910020.call(programCtx.getGlobalCtx().getContext("SF910020"),methodOut.getAsmSf910020Parms880()));
//  EVALUATE 88-880-BIT0-ON ALSO 88-880-BIT1-ON ALSO 88-880-BIT2-ON ALSO 88-880-BIT3-ON
          if  (( methodIn.isBit0On88880()  )     && (!(methodIn.isBit1On88880()) )     && (!(methodIn.isBit2On88880()) )     && ( methodIn.isBit3On88880()  )) { 
//  MOVE 300-NINE TO 800-ISO-BL-RESPONSE-1
              methodOut.setIsoBlResponse1800(methodOut.getNine300());
          }
          else if  (( methodIn.isBit0On88880()  )     && (!(methodIn.isBit1On88880()) )     && (!(methodIn.isBit2On88880()) )     && (!(methodIn.isBit3On88880()) )) { 
//  MOVE 300-EIGHT TO 800-ISO-BL-RESPONSE-1
              methodOut.setIsoBlResponse1800(methodOut.getEight300());
          }
          else if  ((!(methodIn.isBit0On88880()) )     && ( methodIn.isBit1On88880()  )     && ( methodIn.isBit2On88880()  )     && ( methodIn.isBit3On88880()  )) { 
//  MOVE 300-SEVEN TO 800-ISO-BL-RESPONSE-1
              methodOut.setIsoBlResponse1800(methodOut.getSeven300());
          }
          else if  ((!(methodIn.isBit0On88880()) )     && ( methodIn.isBit1On88880()  )     && ( methodIn.isBit2On88880()  )     && (!(methodIn.isBit3On88880()) )) { 
//  MOVE 300-SIX TO 800-ISO-BL-RESPONSE-1
              methodOut.setIsoBlResponse1800(methodOut.getSix300());
          }
          else if  ((!(methodIn.isBit0On88880()) )     && ( methodIn.isBit1On88880()  )     && (!(methodIn.isBit2On88880()) )     && ( methodIn.isBit3On88880()  )) { 
//  MOVE 300-FIVE TO 800-ISO-BL-RESPONSE-1
              methodOut.setIsoBlResponse1800(methodOut.getFive300());
          }
          else if  ((!(methodIn.isBit0On88880()) )     && ( methodIn.isBit1On88880()  )     && (!(methodIn.isBit2On88880()) )     && (!(methodIn.isBit3On88880()) )) { 
//  MOVE 300-FOUR TO 800-ISO-BL-RESPONSE-1
              methodOut.setIsoBlResponse1800(methodOut.getFour300());
          }
          else if  ((!(methodIn.isBit0On88880()) )     && (!(methodIn.isBit1On88880()) )     && ( methodIn.isBit2On88880()  )     && ( methodIn.isBit3On88880()  )) { 
//  MOVE 300-THREE TO 800-ISO-BL-RESPONSE-1
              methodOut.setIsoBlResponse1800(methodOut.getThree300());
          }
          else if  ((!(methodIn.isBit0On88880()) )     && (!(methodIn.isBit1On88880()) )     && ( methodIn.isBit2On88880()  )     && (!(methodIn.isBit3On88880()) )) { 
//  MOVE 300-TWO TO 800-ISO-BL-RESPONSE-1
              methodOut.setIsoBlResponse1800(methodOut.getTwo300());
          }
          else if  ((!(methodIn.isBit0On88880()) )     && (!(methodIn.isBit1On88880()) )     && (!(methodIn.isBit2On88880()) )     && ( methodIn.isBit3On88880()  )) { 
//  MOVE 300-ONE TO 800-ISO-BL-RESPONSE-1
              methodOut.setIsoBlResponse1800(methodOut.getOne300());
          }
//  EVALUATE 88-880-BIT4-ON ALSO 88-880-BIT5-ON ALSO 88-880-BIT6-ON ALSO 88-880-BIT7-ON
          if  (( methodIn.isBit4On88880()  )     && (!(methodIn.isBit5On88880()) )     && (!(methodIn.isBit6On88880()) )     && ( methodIn.isBit7On88880()  )) { 
//  MOVE 300-NINE TO 800-ISO-BL-RESPONSE-2
              methodOut.setIsoBlResponse2800(methodOut.getNine300());
          }
          else if  (( methodIn.isBit4On88880()  )     && (!(methodIn.isBit5On88880()) )     && (!(methodIn.isBit6On88880()) )     && (!(methodIn.isBit7On88880()) )) { 
//  MOVE 300-EIGHT TO 800-ISO-BL-RESPONSE-2
              methodOut.setIsoBlResponse2800(methodOut.getEight300());
          }
          else if  ((!(methodIn.isBit4On88880()) )     && ( methodIn.isBit5On88880()  )     && ( methodIn.isBit6On88880()  )     && ( methodIn.isBit7On88880()  )) { 
//  MOVE 300-SEVEN TO 800-ISO-BL-RESPONSE-2
              methodOut.setIsoBlResponse2800(methodOut.getSeven300());
          }
          else if  ((!(methodIn.isBit4On88880()) )     && ( methodIn.isBit5On88880()  )     && ( methodIn.isBit6On88880()  )     && (!(methodIn.isBit7On88880()) )) { 
//  MOVE 300-SIX TO 800-ISO-BL-RESPONSE-2
              methodOut.setIsoBlResponse2800(methodOut.getSix300());
          }
          else if  ((!(methodIn.isBit4On88880()) )     && ( methodIn.isBit5On88880()  )     && (!(methodIn.isBit6On88880()) )     && ( methodIn.isBit7On88880()  )) { 
//  MOVE 300-FIVE TO 800-ISO-BL-RESPONSE-2
              methodOut.setIsoBlResponse2800(methodOut.getFive300());
          }
          else if  ((!(methodIn.isBit4On88880()) )     && ( methodIn.isBit5On88880()  )     && (!(methodIn.isBit6On88880()) )     && (!(methodIn.isBit7On88880()) )) { 
//  MOVE 300-FOUR TO 800-ISO-BL-RESPONSE-2
              methodOut.setIsoBlResponse2800(methodOut.getFour300());
          }
          else if  ((!(methodIn.isBit4On88880()) )     && (!(methodIn.isBit5On88880()) )     && ( methodIn.isBit6On88880()  )     && ( methodIn.isBit7On88880()  )) { 
//  MOVE 300-THREE TO 800-ISO-BL-RESPONSE-2
              methodOut.setIsoBlResponse2800(methodOut.getThree300());
          }
          else if  ((!(methodIn.isBit4On88880()) )     && (!(methodIn.isBit5On88880()) )     && ( methodIn.isBit6On88880()  )     && (!(methodIn.isBit7On88880()) )) { 
//  MOVE 300-TWO TO 800-ISO-BL-RESPONSE-2
              methodOut.setIsoBlResponse2800(methodOut.getTwo300());
          }
          else if  ((!(methodIn.isBit4On88880()) )     && (!(methodIn.isBit5On88880()) )     && (!(methodIn.isBit6On88880()) )     && ( methodIn.isBit7On88880()  )) { 
//  MOVE 300-ONE TO 800-ISO-BL-RESPONSE-2
              methodOut.setIsoBlResponse2800(methodOut.getOne300());
          }
//  MOVE SF501-J-DOWN-OPTION TO 880-ASM-TRAN-BYTE
          methodOut.setAsmTranByte880(methodOut.getSf501JDownOption());
//  MOVE ZEROS TO 880-ASM-BIT-SW
          methodOut.getAsmBitSw880().setString(CONSTANTS.ZERO_8);
//  CALL 800-PTR-SF910020 USING 880-ASM-SF910020-PARMS
          // CALL 800-PTR-SF910020 USING 880-ASM-SF910020-PARMS
               programCtx.setRc( sf910020.call(programCtx.getGlobalCtx().getContext("SF910020"),methodOut.getAsmSf910020Parms880()));
//  EVALUATE 88-880-BIT0-ON ALSO 88-880-BIT1-ON ALSO 88-880-BIT2-ON ALSO 88-880-BIT3-ON
          if  (( methodIn.isBit0On88880()  )     && (!(methodIn.isBit1On88880()) )     && (!(methodIn.isBit2On88880()) )     && ( methodIn.isBit3On88880()  )) { 
//  MOVE 300-NINE TO 800-ISO-BL-DOWN-1
              methodOut.setIsoBlDown1800(methodOut.getNine300());
          }
          else if  (( methodIn.isBit0On88880()  )     && (!(methodIn.isBit1On88880()) )     && (!(methodIn.isBit2On88880()) )     && (!(methodIn.isBit3On88880()) )) { 
//  MOVE 300-EIGHT TO 800-ISO-BL-DOWN-1
              methodOut.setIsoBlDown1800(methodOut.getEight300());
          }
          else if  ((!(methodIn.isBit0On88880()) )     && ( methodIn.isBit1On88880()  )     && ( methodIn.isBit2On88880()  )     && ( methodIn.isBit3On88880()  )) { 
//  MOVE 300-SEVEN TO 800-ISO-BL-DOWN-1
              methodOut.setIsoBlDown1800(methodOut.getSeven300());
          }
          else if  ((!(methodIn.isBit0On88880()) )     && ( methodIn.isBit1On88880()  )     && ( methodIn.isBit2On88880()  )     && (!(methodIn.isBit3On88880()) )) { 
//  MOVE 300-SIX TO 800-ISO-BL-DOWN-1
              methodOut.setIsoBlDown1800(methodOut.getSix300());
          }
          else if  ((!(methodIn.isBit0On88880()) )     && ( methodIn.isBit1On88880()  )     && (!(methodIn.isBit2On88880()) )     && ( methodIn.isBit3On88880()  )) { 
//  MOVE 300-FIVE TO 800-ISO-BL-DOWN-1
              methodOut.setIsoBlDown1800(methodOut.getFive300());
          }
          else if  ((!(methodIn.isBit0On88880()) )     && ( methodIn.isBit1On88880()  )     && (!(methodIn.isBit2On88880()) )     && (!(methodIn.isBit3On88880()) )) { 
//  MOVE 300-FOUR TO 800-ISO-BL-DOWN-1
              methodOut.setIsoBlDown1800(methodOut.getFour300());
          }
          else if  ((!(methodIn.isBit0On88880()) )     && (!(methodIn.isBit1On88880()) )     && ( methodIn.isBit2On88880()  )     && ( methodIn.isBit3On88880()  )) { 
//  MOVE 300-THREE TO 800-ISO-BL-DOWN-1
              methodOut.setIsoBlDown1800(methodOut.getThree300());
          }
          else if  ((!(methodIn.isBit0On88880()) )     && (!(methodIn.isBit1On88880()) )     && ( methodIn.isBit2On88880()  )     && (!(methodIn.isBit3On88880()) )) { 
//  MOVE 300-TWO TO 800-ISO-BL-DOWN-1
              methodOut.setIsoBlDown1800(methodOut.getTwo300());
          }
          else if  ((!(methodIn.isBit0On88880()) )     && (!(methodIn.isBit1On88880()) )     && (!(methodIn.isBit2On88880()) )     && ( methodIn.isBit3On88880()  )) { 
//  MOVE 300-ONE TO 800-ISO-BL-DOWN-1
              methodOut.setIsoBlDown1800(methodOut.getOne300());
          }
          else if  ((!(methodIn.isBit0On88880()) )     && (!(methodIn.isBit1On88880()) )     && (!(methodIn.isBit2On88880()) )     && (!(methodIn.isBit3On88880()) )) { 
//  MOVE ZERO TO 800-ISO-BL-DOWN-1
              methodOut.setIsoBlDown1800(0);
          }
//  EVALUATE 88-880-BIT4-ON ALSO 88-880-BIT5-ON ALSO 88-880-BIT6-ON ALSO 88-880-BIT7-ON
          if  (( methodIn.isBit4On88880()  )     && (!(methodIn.isBit5On88880()) )     && (!(methodIn.isBit6On88880()) )     && ( methodIn.isBit7On88880()  )) { 
//  MOVE 300-NINE TO 800-ISO-BL-DOWN-2
              methodOut.setIsoBlDown2800(methodOut.getNine300());
          }
          else if  (( methodIn.isBit4On88880()  )     && (!(methodIn.isBit5On88880()) )     && (!(methodIn.isBit6On88880()) )     && (!(methodIn.isBit7On88880()) )) { 
//  MOVE 300-EIGHT TO 800-ISO-BL-DOWN-2
              methodOut.setIsoBlDown2800(methodOut.getEight300());
          }
          else if  ((!(methodIn.isBit4On88880()) )     && ( methodIn.isBit5On88880()  )     && ( methodIn.isBit6On88880()  )     && ( methodIn.isBit7On88880()  )) { 
//  MOVE 300-SEVEN TO 800-ISO-BL-DOWN-2
              methodOut.setIsoBlDown2800(methodOut.getSeven300());
          }
          else if  ((!(methodIn.isBit4On88880()) )     && ( methodIn.isBit5On88880()  )     && ( methodIn.isBit6On88880()  )     && (!(methodIn.isBit7On88880()) )) { 
//  MOVE 300-SIX TO 800-ISO-BL-DOWN-2
              methodOut.setIsoBlDown2800(methodOut.getSix300());
          }
          else if  ((!(methodIn.isBit4On88880()) )     && ( methodIn.isBit5On88880()  )     && (!(methodIn.isBit6On88880()) )     && ( methodIn.isBit7On88880()  )) { 
//  MOVE 300-FIVE TO 800-ISO-BL-DOWN-2
              methodOut.setIsoBlDown2800(methodOut.getFive300());
          }
          else if  ((!(methodIn.isBit4On88880()) )     && ( methodIn.isBit5On88880()  )     && (!(methodIn.isBit6On88880()) )     && (!(methodIn.isBit7On88880()) )) { 
//  MOVE 300-FOUR TO 800-ISO-BL-DOWN-2
              methodOut.setIsoBlDown2800(methodOut.getFour300());
          }
          else if  ((!(methodIn.isBit4On88880()) )     && (!(methodIn.isBit5On88880()) )     && ( methodIn.isBit6On88880()  )     && ( methodIn.isBit7On88880()  )) { 
//  MOVE 300-THREE TO 800-ISO-BL-DOWN-2
              methodOut.setIsoBlDown2800(methodOut.getThree300());
          }
          else if  ((!(methodIn.isBit4On88880()) )     && (!(methodIn.isBit5On88880()) )     && ( methodIn.isBit6On88880()  )     && (!(methodIn.isBit7On88880()) )) { 
//  MOVE 300-TWO TO 800-ISO-BL-DOWN-2
              methodOut.setIsoBlDown2800(methodOut.getTwo300());
          }
          else if  ((!(methodIn.isBit4On88880()) )     && (!(methodIn.isBit5On88880()) )     && (!(methodIn.isBit6On88880()) )     && ( methodIn.isBit7On88880()  )) { 
//  MOVE 300-ONE TO 800-ISO-BL-DOWN-2
              methodOut.setIsoBlDown2800(methodOut.getOne300());
          }
          else if  ((!(methodIn.isBit4On88880()) )     && (!(methodIn.isBit5On88880()) )     && (!(methodIn.isBit6On88880()) )     && (!(methodIn.isBit7On88880()) )) { 
//  MOVE ZERO TO 800-ISO-BL-DOWN-2
              methodOut.setIsoBlDown2800(0);
          }

// ****************************************************************
// * Meg-304 start  made changes to the moto-option to work with
// *                the assembler routine used for iss and acq
// *                currency certified as well as moto.
//  MOVE SF501-J-MOTO-OPTION TO 880-ASM-TRAN-BYTE
          methodOut.setAsmTranByte880(methodOut.getSf501JMotoOption());
//  MOVE ZEROS TO 880-ASM-BIT-SW
          methodOut.getAsmBitSw880().setString(CONSTANTS.ZERO_8);
//  CALL 800-PTR-SF910020 USING 880-ASM-SF910020-PARMS
          // CALL 800-PTR-SF910020 USING 880-ASM-SF910020-PARMS
               programCtx.setRc( sf910020.call(programCtx.getGlobalCtx().getContext("SF910020"),methodOut.getAsmSf910020Parms880()));
//  EVALUATE 88-880-BIT0-ON ALSO 88-880-BIT1-ON ALSO 88-880-BIT2-ON ALSO 88-880-BIT3-ON
          if  (( methodIn.isBit0On88880()  )     && (!(methodIn.isBit1On88880()) )     && (!(methodIn.isBit2On88880()) )     && ( methodIn.isBit3On88880()  )) { 
//  MOVE 300-NINE TO 800-ISO-BL-MOTO-1
              methodOut.setIsoBlMoto1800(methodOut.getNine300());
          }
          else if  (( methodIn.isBit0On88880()  )     && (!(methodIn.isBit1On88880()) )     && (!(methodIn.isBit2On88880()) )     && (!(methodIn.isBit3On88880()) )) { 
//  MOVE 300-EIGHT TO 800-ISO-BL-MOTO-1
              methodOut.setIsoBlMoto1800(methodOut.getEight300());
          }
          else if  ((!(methodIn.isBit0On88880()) )     && ( methodIn.isBit1On88880()  )     && ( methodIn.isBit2On88880()  )     && ( methodIn.isBit3On88880()  )) { 
//  MOVE 300-SEVEN TO 800-ISO-BL-MOTO-1
              methodOut.setIsoBlMoto1800(methodOut.getSeven300());
          }
          else if  ((!(methodIn.isBit0On88880()) )     && ( methodIn.isBit1On88880()  )     && ( methodIn.isBit2On88880()  )     && (!(methodIn.isBit3On88880()) )) { 
//  MOVE 300-SIX TO 800-ISO-BL-MOTO-1
              methodOut.setIsoBlMoto1800(methodOut.getSix300());
          }
          else if  ((!(methodIn.isBit0On88880()) )     && ( methodIn.isBit1On88880()  )     && (!(methodIn.isBit2On88880()) )     && ( methodIn.isBit3On88880()  )) { 
//  MOVE 300-FIVE TO 800-ISO-BL-MOTO-1
              methodOut.setIsoBlMoto1800(methodOut.getFive300());
          }
          else if  ((!(methodIn.isBit0On88880()) )     && ( methodIn.isBit1On88880()  )     && (!(methodIn.isBit2On88880()) )     && (!(methodIn.isBit3On88880()) )) { 
//  MOVE 300-FOUR TO 800-ISO-BL-MOTO-1
              methodOut.setIsoBlMoto1800(methodOut.getFour300());
          }
          else if  ((!(methodIn.isBit0On88880()) )     && (!(methodIn.isBit1On88880()) )     && ( methodIn.isBit2On88880()  )     && ( methodIn.isBit3On88880()  )) { 
//  MOVE 300-THREE TO 800-ISO-BL-MOTO-1
              methodOut.setIsoBlMoto1800(methodOut.getThree300());
          }
          else if  ((!(methodIn.isBit0On88880()) )     && (!(methodIn.isBit1On88880()) )     && ( methodIn.isBit2On88880()  )     && (!(methodIn.isBit3On88880()) )) { 
//  MOVE 300-TWO TO 800-ISO-BL-MOTO-1
              methodOut.setIsoBlMoto1800(methodOut.getTwo300());
          }
          else if  ((!(methodIn.isBit0On88880()) )     && (!(methodIn.isBit1On88880()) )     && (!(methodIn.isBit2On88880()) )     && ( methodIn.isBit3On88880()  )) { 
//  MOVE 300-ONE TO 800-ISO-BL-MOTO-1
              methodOut.setIsoBlMoto1800(methodOut.getOne300());
          }
          else if  ((!(methodIn.isBit0On88880()) )     && (!(methodIn.isBit1On88880()) )     && (!(methodIn.isBit2On88880()) )     && (!(methodIn.isBit3On88880()) )) { 
//  MOVE ZERO TO 800-ISO-BL-MOTO-1
              methodOut.setIsoBlMoto1800(0);
          }

// ****************************************************************
//  MOVE 860-CARDHOLDER-NBR TO SF31-ISO-CARDHOLDER-NBR
          methodOut.setSf31IsoCardholderNbr(methodOut.getCardholderNbr860());
//  MOVE 860-AUTH-NUMBER TO SF31-ISO-AUTH-NUMBER
          methodOut.setSf31IsoAuthNumber(methodOut.getAuthNumber860());
//  MOVE 860-AUTH-RESPONSE TO SF31-ISO-AUTH-RESPONSE
          methodOut.setSf31IsoAuthResponse(methodOut.getAuthResponse860());
//  MOVE 860-AUTH-ADDL-DATA TO SF31-ISO-AUTH-ADDL-DATA
          methodOut.setSf31IsoAuthAddlData(methodOut.getAuthAddlData860());
//  MOVE 860-CARDHOLDER-EXPDT TO SF31-ISO-CARDHOLDER-EXPDT
          methodOut.setSf31IsoCardholderExpdt(methodOut.getCardholderExpdt860());
//  MOVE 860-TRACK-TWO-DATA TO SF31-ISO-TRACK-TWO-DATA
          methodOut.setSf31IsoTrackTwoData(methodOut.getTrackTwoData860());
//  MOVE 860-TRACK-ONE-DATA TO SF31-ISO-TRACK-ONE-DATA
          methodOut.setSf31IsoTrackOneData(methodOut.getTrackOneData860());
          // MOVE 860-SYS-TRACE-AUDIT TO 800-TRACE-AUDIT
          methodOut.setTraceAudit800(padLeftZeros(6,methodOut.getSysTraceAudit860(),false));
          // MOVE 800-DE11-TRACE-AUDIT TO SF31-ISO-BL-IC-SEQ-NO
          methodOut.setSf31IsoBlIcSeqNo(methodOut.getDe11TraceAudit800().toCharArray());
//  MOVE 860-POS-DATA TO SF31-ISO-POS-DATA
          methodOut.setSf31IsoPosData(methodOut.getPosData860());

// ****************************************************************
//  MOVE ZEROS TO 800-WORK-ACQ-ICA
          methodOut.setWorkAcqIca800(0);
//  MOVE 860-ACQUIRER-ICA TO 800-ACQUIRER-ICA
          methodOut.getAcquirerIca800().setString(methodOut.getAcquirerIca860());
//  IF 800-ACQ-FILLER-1 = LOW-VALUES OR 800-ACQ-FILLER-1 = SPACES
          if (			( checkLowValue(methodOut.getAcqFiller1800()) )  ||         ( allSpaces(methodOut.getAcqFiller1800())   )) { 
//  MOVE 800-ACQUIRER-ICA-ONLY4 TO 800-ACQ-ICA-ONLY4
              methodOut.setAcqIcaOnly4800(methodOut.getAcquirerIcaOnly4800());
//  MOVE 800-WORK-ACQ-ICA TO SF31-ISO-ACQUIRER-ICA
              methodOut.setSf31IsoAcquirerIca(String.valueOf(methodOut.getWorkAcqIca800String()).toCharArray());
          }
//  ELSE
          else { 
//  IF 800-ACQ-FILLER-2 = LOW-VALUES OR 800-ACQ-FILLER-2 = SPACES
              if (			( checkLowValue(methodOut.getAcqFiller2800()) )  ||         ( allSpaces(methodOut.getAcqFiller2800())   )) { 
                  // MOVE 800-ACQUIRER-ICA-ONLY5 TO 800-ACQ-ICA-ONLY5
                  methodOut.getAcqIcaOnly5800().setString(methodOut.getAcquirerIcaOnly5800().getCharArray());
//  MOVE 800-WORK-ACQ-ICA TO SF31-ISO-ACQUIRER-ICA
                  methodOut.setSf31IsoAcquirerIca(String.valueOf(methodOut.getWorkAcqIca800String()).toCharArray());
              }
//  ELSE
              else { 
//  MOVE 860-ACQUIRER-ICA TO SF31-ISO-ACQUIRER-ICA
                  methodOut.setSf31IsoAcquirerIca(methodOut.getAcquirerIca860());
              }
          }

// *
//  MOVE ZEROS TO 800-WORK-FWD-ICA
          methodOut.setWorkFwdIca800(0);
//  MOVE 860-FORWARD-INST-ID TO 800-FORWARD-ICA
          methodOut.getForwardIca800().setString(methodOut.getForwardInstId860());
//  IF 860-FORWARD-INST-ID = LOW-VALUES
          if (			( checkLowValue(methodOut.getForwardInstId860()) ) ) { 
//  MOVE 860-FORWARD-INST-ID TO SF31-ISO-FORWARD-INST-ID-ONLY
              methodOut.setSf31IsoForwardInstIdOnly(methodOut.getForwardInstId860());
          }
//  ELSE
          else { 
//  IF 800-FWD-FILLER-1 = LOW-VALUES OR 800-FWD-FILLER-1 = SPACES
              if (			( checkLowValue(methodOut.getFwdFiller1800()) )  ||         ( allSpaces(methodOut.getFwdFiller1800())   )) { 
//  MOVE 800-FORWARD-ICA-ONLY4 TO 800-FWD-ICA-ONLY4
                  methodOut.setFwdIcaOnly4800(methodOut.getForwardIcaOnly4800());
//  MOVE 800-WORK-FWD-ICA TO SF31-ISO-FORWARD-INST-ID-ONLY
                  methodOut.setSf31IsoForwardInstIdOnly(String.valueOf(methodOut.getWorkFwdIca800String()).toCharArray());
              }
//  ELSE
              else { 
//  IF 800-FWD-FILLER-2 = LOW-VALUES OR 800-FWD-FILLER-2 = SPACES
                  if (			( checkLowValue(methodOut.getFwdFiller2800()) )  ||         ( allSpaces(methodOut.getFwdFiller2800())   )) { 
                      // MOVE 800-FORWARD-ICA-ONLY5 TO 800-FWD-ICA-ONLY5
                      methodOut.getFwdIcaOnly5800().setString(methodOut.getForwardIcaOnly5800().getCharArray());
//  MOVE 800-WORK-FWD-ICA TO SF31-ISO-FORWARD-INST-ID-ONLY
                      methodOut.setSf31IsoForwardInstIdOnly(String.valueOf(methodOut.getWorkFwdIca800String()).toCharArray());
                  }
//  ELSE
                  else { 
//  MOVE 860-FORWARD-INST-ID TO SF31-ISO-FORWARD-INST-ID-ONLY
                      methodOut.setSf31IsoForwardInstIdOnly(methodOut.getForwardInstId860());
                  }
              }
          }

// *
//  IF 860-TIME-LOCAL-TRANS-100 (1 : 1) > LOW-VALUES
          if (		( isGreaterThanLowValue(substring(methodOut.getTimeLocalTrans100860String(),0,1)) ) ) { 
              // MOVE 860-TIME-LOCAL-TRANS-100 TO SF31-ISO-TIME-LOCAL-TRANS
              methodOut.setSf31IsoTimeLocalTrans(methodOut.getTimeLocalTrans100860());
          }

// *
//  IF 860-DATE-LOCAL-TRANS-100 (1 : 1) > LOW-VALUES
          if (		( isGreaterThanLowValue(substring(methodOut.getDateLocalTrans100860String(),0,1)) ) ) { 
//  MOVE 860-DATE-LOCAL-TRANS-100 TO SF31-ISO-DATE-LOCAL-TRANS
              methodOut.setSf31IsoDateLocalTrans(methodOut.getDateLocalTrans100860());
          }

// *
//  IF 860-POS-DEVICE-TYPE (1 : 1) > LOW-VALUES
          if (		( isGreaterThanLowValue(substring(methodOut.getPosDeviceType860(),0,1)) ) ) { 
//  MOVE 860-POS-DEVICE-TYPE TO SF31-ISO-POS-DEVICE-TYPE
              methodOut.setSf31IsoPosDeviceType(methodOut.getPosDeviceType860());
          }
//  ELSE
          else { 
//  IF 860-POS-ENTRY-110 (1 : 1) > LOW-VALUES
              if (		( isGreaterThanLowValue(substring(methodOut.getPosEntry110860String(),0,1)) ) ) { 
//  MOVE 860-POS-ENTRY-110 TO SF31-ISO-POS-DEVICE-TYPE
                  methodOut.setSf31IsoPosDeviceType(String.valueOf(methodOut.getPosEntry110860String()).toCharArray());
              }
          }

// *
//  IF SI583-DE-LENGTH-1 (48) > ZERO
          if (	( methodOut.getSi583DeLength1(47) > 0 ) ) { 
//  MOVE SPACE TO 500-DE48-DATA
              methodOut.setDe48Data500(CONSTANTS.SPACE_999);
//  IF SI583-MTI-1 EQUAL 300-MTI-0110
              if (compareChars(methodIn.getSi583Mti1(),String.valueOf(methodIn.getMti0110300String()).toCharArray()) == 0) { 
//  SET 88-100-MTI1-0110 TO TRUE
                  methodOut.setMti1011088100True(); 
                  
              }
//  ELSE
              else { 
//  SET 88-100-MTI1-0100 TO TRUE
                  methodOut.setMti1010088100True(); 
                  
              }
//  MOVE SI583-DE-LENGTH-1 (48) TO SEPR-DATA-LENGTH
              methodOut.setSeprDataLength(methodOut.getSi583DeLength1(47));
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (48) : SEPR-DATA-LENGTH ) TO 500-DE48-DATA (1 : SEPR-DATA-LENGTH )
              methodOut.getDe48DataGroup500().replace(methodIn.getDataGroup1000()/*parent*/,0+methodIn.getSi583DeStartingPos1(47) - 1/*fromOffset - (de48Data500) */,methodOut.getSeprDataLength()/*fromLen*/,0/*toOffset - (data1000) */,methodOut.getSeprDataLength()/*toLen*/);
//  MOVE 500-DE48-DATA (1 : 1) TO SF31-ISO-TRANSACTION-TYPE
              methodOut.setSf31IsoTransactionType(methodOut.getDe48Data500());
//  MOVE 500-DE48-DATA (1 : 3) TO SF31-ISO-ADDTL-DATA
              methodOut.setSf31IsoAddtlData(methodOut.getDe48Data500());
//  PERFORM 8000-PROCESS-DE48
              processDe48(programCtx.getProcessDe48InCtx());/*8000-PROCESS-DE48*/
          }
//  ELSE
          else { 
//  IF SI583-DE-LENGTH-2 (48) > ZERO
              if (	( methodOut.getSi583DeLength2(47) > 0 ) ) { 
//  MOVE SPACE TO 500-DE48-DATA
                  methodOut.setDe48Data500(CONSTANTS.SPACE_999);
//  IF SI583-MTI-2 EQUAL 300-MTI-0100
                  if (compareChars(methodIn.getSi583Mti2(),String.valueOf(methodIn.getMti0100300String()).toCharArray()) == 0) { 
//  SET 88-100-MTI2-0100 TO TRUE
                      methodOut.setMti2010088100True(); 
                      
                  }
//  ELSE
                  else { 
//  SET 88-100-MTI2-0110 TO TRUE
                      methodOut.setMti2011088100True(); 
                      
                  }
//  MOVE SI583-DE-LENGTH-2 (48) TO SEPR-DATA-LENGTH
                  methodOut.setSeprDataLength(methodOut.getSi583DeLength2(47));
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (48) : SEPR-DATA-LENGTH ) TO 500-DE48-DATA (1 : SEPR-DATA-LENGTH )
                  methodOut.getDe48DataGroup500().replace(methodIn.getDataGroup1000()/*parent*/,0+methodIn.getSi583DeStartingPos2(47) - 1/*fromOffset - (de48Data500) */,methodOut.getSeprDataLength()/*fromLen*/,0/*toOffset - (data1000) */,methodOut.getSeprDataLength()/*toLen*/);
//  MOVE 500-DE48-DATA (1 : 1) TO SF31-ISO-TRANSACTION-TYPE
                  methodOut.setSf31IsoTransactionType(methodOut.getDe48Data500());
//  MOVE 500-DE48-DATA (1 : 3) TO SF31-ISO-ADDTL-DATA
                  methodOut.setSf31IsoAddtlData(methodOut.getDe48Data500());
//  PERFORM 8000-PROCESS-DE48
                  processDe48(programCtx.getProcessDe48InCtx());/*8000-PROCESS-DE48*/
              }
          }

// *
//  IF 860-FIN-NETWORK-110 (1 : 1) > LOW-VALUES
          if (		( isGreaterThanLowValue(substring(methodOut.getFinNetwork110860(),0,1)) ) ) { 
//  MOVE 860-FIN-NETWORK-110 TO SF31-ISO-FIN-NETWORK-CODE
              methodOut.setSf31IsoFinNetworkCode(methodOut.getFinNetwork110860());
          }
//  ELSE
          else { 
//  IF 860-FIN-NETWORK-CODE (1 : 1) > LOW-VALUES
              if (		( isGreaterThanLowValue(substring(methodOut.getFinNetworkCode860(),0,1)) ) ) { 
//  MOVE 860-FIN-NETWORK-CODE TO SF31-ISO-FIN-NETWORK-CODE
                  methodOut.setSf31IsoFinNetworkCode(methodOut.getFinNetworkCode860());
              }
          }

// *
//  IF 860-PROCESSING-CODE-110 (1 : 1) > LOW-VALUES
          if (		( isGreaterThanLowValue(substring(methodOut.getProcessingCode110860String(),0,1)) ) ) { 
//  MOVE 860-PROCESSING-CODE-110 TO SF31-ISO-PROCESSING-CODE
              methodOut.setSf31IsoProcessingCode(String.valueOf(methodOut.getProcessingCode110860String()).toCharArray());
          }
//  ELSE
          else { 
//  IF 860-PROCESSING-CODE-100 (1 : 1) > LOW-VALUES
              if (		( isGreaterThanLowValue(substring(methodOut.getProcessingCode100860String(),0,1)) ) ) { 
//  MOVE 860-PROCESSING-CODE-100 TO SF31-ISO-PROCESSING-CODE
                  methodOut.setSf31IsoProcessingCode(String.valueOf(methodOut.getProcessingCode100860String()).toCharArray());
              }
          }

// *
//  IF 860-DATE-TIME-XMIT-110 (1 : 1) > LOW-VALUES
          if (		( isGreaterThanLowValue(substring(methodOut.getDateTimeXmit110860String(),0,1)) ) ) { 
//  MOVE 860-DATE-TIME-XMIT-110 TO SF31-ISO-DATE-TIME-XMIT
              methodOut.setSf31IsoDateTimeXmit(String.valueOf(methodOut.getDateTimeXmit110860String()).toCharArray());
          }
//  ELSE
          else { 
//  IF 860-DATE-TIME-XMIT-100 (1 : 1) > LOW-VALUES
              if (		( isGreaterThanLowValue(substring(methodOut.getDateTimeXmit100860String(),0,1)) ) ) { 
//  MOVE 860-DATE-TIME-XMIT-100 TO SF31-ISO-DATE-TIME-XMIT
                  methodOut.setSf31IsoDateTimeXmit(String.valueOf(methodOut.getDateTimeXmit100860String()).toCharArray());
              }
          }

// *
//  IF 860-TRANS-MMDD-110 (1 : 1) > LOW-VALUES
          if (		( isGreaterThanLowValue(substring(methodOut.getTransMmdd110860String(),0,1)) ) ) { 
//  MOVE 860-TRANS-MMDD-110 TO SF31-ISO-TRANS-MMDD
              methodOut.setSf31IsoTransMmdd(String.valueOf(methodOut.getTransMmdd110860String()).toCharArray());
          }
//  ELSE
          else { 
//  IF 860-TRANS-MMDD (1 : 1) > LOW-VALUES
              if (		( isGreaterThanLowValue(substring(methodOut.getTransMmdd860String(),0,1)) ) ) { 
//  MOVE 860-TRANS-MMDD TO SF31-ISO-TRANS-MMDD
                  methodOut.setSf31IsoTransMmdd(String.valueOf(methodOut.getTransMmdd860String()).toCharArray());
              }
          }

// *
//  IF 860-MERCHANT-TYPE-110 (1 : 1) > LOW-VALUES
          if (		( isGreaterThanLowValue(substring(methodOut.getMerchantType110860String(),0,1)) ) ) { 
//  MOVE 860-MERCHANT-TYPE-110 TO SF31-ISO-MERCHANT-TYPE
              methodOut.setSf31IsoMerchantType(String.valueOf(methodOut.getMerchantType110860String()).toCharArray());
          }
//  ELSE
          else { 
//  IF 860-MERCHANT-TYPE (1 : 1) > LOW-VALUES
              if (		( isGreaterThanLowValue(substring(methodOut.getMerchantType860String(),0,1)) ) ) { 
//  MOVE 860-MERCHANT-TYPE TO SF31-ISO-MERCHANT-TYPE
                  methodOut.setSf31IsoMerchantType(String.valueOf(methodOut.getMerchantType860String()).toCharArray());
              }
          }

// *
//  IF 860-COUNTRY-CODE-110 (1 : 1) > LOW-VALUES
          if (		( isGreaterThanLowValue(substring(methodOut.getCountryCode110860(),0,1)) ) ) { 
//  MOVE 860-COUNTRY-CODE-110 TO SF31-ISO-COUNTRY-CODE
              methodOut.setSf31IsoCountryCode(methodOut.getCountryCode110860());
          }
//  ELSE
          else { 
//  IF 860-COUNTRY-CODE (1 : 1) > LOW-VALUES
              if (		( isGreaterThanLowValue(substring(methodOut.getCountryCode860(),0,1)) ) ) { 
//  MOVE 860-COUNTRY-CODE TO SF31-ISO-COUNTRY-CODE
                  methodOut.setSf31IsoCountryCode(methodOut.getCountryCode860());
              }
          }

// *
//  IF 860-POS-PIN-CAPTURE-110 (1 : 1) > LOW-VALUES
          if (		( isGreaterThanLowValue(substring(methodOut.getPosPinCapture110860String(),0,1)) ) ) { 
//  MOVE 860-POS-PIN-CAPTURE-110 TO SF31-ISO-POS-PIN-CAPTURE
              methodOut.setSf31IsoPosPinCapture(String.valueOf(methodOut.getPosPinCapture110860String()).toCharArray());
          }
//  ELSE
          else { 
//  IF 860-POS-PIN-CAPTURE (1 : 1) > LOW-VALUES
              if (		( isGreaterThanLowValue(substring(methodOut.getPosPinCapture860String(),0,1)) ) ) { 
//  MOVE 860-POS-PIN-CAPTURE TO SF31-ISO-POS-PIN-CAPTURE
                  methodOut.setSf31IsoPosPinCapture(String.valueOf(methodOut.getPosPinCapture860String()).toCharArray());
              }
          }

// *
//  IF 860-RETRIEVAL-REFNO-110 (1 : 1) > LOW-VALUES
          if (		( isGreaterThanLowValue(substring(methodOut.getRetrievalRefno110860(),0,1)) ) ) { 
//  MOVE 860-RETRIEVAL-REFNO-110 TO SF31-ISO-RETRIEVAL-REFNO
              methodOut.setSf31IsoRetrievalRefno(methodOut.getRetrievalRefno110860());
          }
//  ELSE
          else { 
//  IF 860-RETRIEVAL-REFNO (1 : 1) > LOW-VALUES
              if (		( isGreaterThanLowValue(substring(methodOut.getRetrievalRefno860(),0,1)) ) ) { 
//  MOVE 860-RETRIEVAL-REFNO TO SF31-ISO-RETRIEVAL-REFNO
                  methodOut.setSf31IsoRetrievalRefno(methodOut.getRetrievalRefno860());
              }
          }

// *
//  IF 860-ID-TERMINAL-110 (1 : 1) > LOW-VALUES
          if (		( isGreaterThanLowValue(substring(methodOut.getIdTerminal110860(),0,1)) ) ) { 
//  MOVE 860-ID-TERMINAL-110 TO SF31-ISO-ID-TERMINAL
              methodOut.setSf31IsoIdTerminal(methodOut.getIdTerminal110860());
          }
//  ELSE
          else { 
//  IF 860-ID-TERMINAL (1 : 1) > LOW-VALUES
              if (		( isGreaterThanLowValue(substring(methodOut.getIdTerminal860(),0,1)) ) ) { 
//  MOVE 860-ID-TERMINAL TO SF31-ISO-ID-TERMINAL
                  methodOut.setSf31IsoIdTerminal(methodOut.getIdTerminal860());
              }
          }

// *
//  IF 860-CARD-ACCEPTOR-110 (1 : 1) > LOW-VALUES
          if (		( isGreaterThanLowValue(substring(methodOut.getCardAcceptor110860(),0,1)) ) ) { 
//  MOVE 860-CARD-ACCEPTOR-110 TO SF31-ISO-CARD-ACCEPTOR
              methodOut.setSf31IsoCardAcceptor(methodOut.getCardAcceptor110860());
          }
//  ELSE
          else { 
//  IF 860-CARD-ACCEPTOR (1 : 1) > LOW-VALUES
              if (		( isGreaterThanLowValue(substring(methodOut.getCardAcceptor860(),0,1)) ) ) { 
//  MOVE 860-CARD-ACCEPTOR TO SF31-ISO-CARD-ACCEPTOR
                  methodOut.setSf31IsoCardAcceptor(methodOut.getCardAcceptor860());
              }
          }

// *
//  IF 860-AUTH-MRCH-NMCTST-110 (1 : 1) > LOW-VALUES
          if (		( isGreaterThanLowValue(substring(methodOut.getAuthMrchNmctst110860(),0,1)) ) ) { 
//  MOVE 860-AUTH-MRCH-NMCTST-110 TO SF31-ISO-DE43-MRCH-NMCTST
              methodOut.setSf31IsoDe43MrchNmctst(methodOut.getAuthMrchNmctst110860());
          }
//  ELSE
          else { 
//  IF 860-AUTH-MRCH-NMCTST (1 : 1) > LOW-VALUES
              if (		( isGreaterThanLowValue(substring(methodOut.getAuthMrchNmctst860(),0,1)) ) ) { 
//  MOVE 860-AUTH-MRCH-NMCTST TO SF31-ISO-DE43-MRCH-NMCTST
                  methodOut.setSf31IsoDe43MrchNmctst(methodOut.getAuthMrchNmctst860());
              }
//  ELSE
              else { 
//  MOVE SPACES TO SF31-ISO-DE43-MRCH-NMCTST
                  methodOut.setSf31IsoDe43MrchNmctst(CONSTANTS.SPACE_40);
              }
          }

// *
//  IF 860-BKNT-DATA-110 (1 : 1) > LOW-VALUES
          if (		( isGreaterThanLowValue(substring(methodOut.getBkntData110860().toCharArray(),0,1)) ) ) { 
              // MOVE 860-BKNT-DATA-110 TO SF31-ISO-BKNT-DATA
              methodOut.getSf31IsoBkntData().setString(methodOut.getBkntData110860().getCharArray());
          }
//  ELSE
          else { 
//  IF 860-BKNT-DATA (1 : 1) > LOW-VALUES
              if (		( isGreaterThanLowValue(substring(methodOut.getBkntData860().toCharArray(),0,1)) ) ) { 
                  // MOVE 860-BKNT-DATA TO SF31-ISO-BKNT-DATA
                  methodOut.getSf31IsoBkntData().setString(methodOut.getBkntData860().getCharArray());
              }
          }

// *
// ***** Repurposed the use of sf31-iso-private-data 100 bytes as   *
// ***** part of rel21q2 i11106 project.                            *
// *
// ***** sf31-iso-merchant-id is 16 bytes (de042 is 15 bytes)
//  IF 88-SI583-DE-PRESENT-2 (42)
          if ( methodIn.isSi583DePresent288(41)  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (42) : SI583-DE-LENGTH-2 (42)) TO SF31-ISO-MERCHANT-ID
              methodOut.getSf31IsoExtractRec().replace(methodIn.getDataGroup1000()/*parent*/,0+methodIn.getSi583DeStartingPos2(41) - 1/*fromOffset - (sf31IsoMerchantId) */,methodOut.getSi583DeLength2(41)/*fromLen*/,309/*toOffset - (data1000) */,16/*toLen*/);
          }
//  ELSE
          else { 
//  IF 88-SI583-DE-PRESENT-1 (42)
              if ( methodIn.isSi583DePresent188(41)  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (42) : SI583-DE-LENGTH-2 (42)) TO SF31-ISO-MERCHANT-ID
                  methodOut.getSf31IsoExtractRec().replace(methodIn.getDataGroup1000()/*parent*/,0+methodIn.getSi583DeStartingPos2(41) - 1/*fromOffset - (sf31IsoMerchantId) */,methodOut.getSi583DeLength2(41)/*fromLen*/,309/*toOffset - (data1000) */,16/*toLen*/);
              }
//  ELSE
              else { 
//  MOVE SPACES TO SF31-ISO-MERCHANT-ID
                  methodOut.setSf31IsoMerchantId(CONSTANTS.SPACE_16);
              }
          }

// *
// ***** Seperate and process de120.
//  IF SI583-DE-LENGTH-1 (120) > ZERO
          if (	( methodOut.getSi583DeLength1(119) > 0 ) ) { 
//  MOVE SI583-DE-LENGTH-1 (120) TO SEPR-DATA-LENGTH
              methodOut.setSeprDataLength(methodOut.getSi583DeLength1(119));
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (120) : SEPR-DATA-LENGTH ) TO 500-DE120-DATA (1 : SEPR-DATA-LENGTH )
              methodOut.getDe120DataGroup500().replace(methodIn.getDataGroup1000()/*parent*/,0+methodIn.getSi583DeStartingPos1(119) - 1/*fromOffset - (de120Data500) */,methodOut.getSeprDataLength()/*fromLen*/,0/*toOffset - (data1000) */,methodOut.getSeprDataLength()/*toLen*/);
//  PERFORM 8030-PROCESS-DE120
              processDe120(programCtx.getProcessDe120InCtx());/*8030-PROCESS-DE120*/
          }
//  ELSE
          else { 
//  IF SI583-DE-LENGTH-2 (120) > ZERO
              if (	( methodOut.getSi583DeLength2(119) > 0 ) ) { 
//  MOVE SI583-DE-LENGTH-2 (120) TO SEPR-DATA-LENGTH
                  methodOut.setSeprDataLength(methodOut.getSi583DeLength2(119));
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (120) : SEPR-DATA-LENGTH ) TO 500-DE120-DATA (1 : SEPR-DATA-LENGTH )
                  methodOut.getDe120DataGroup500().replace(methodIn.getDataGroup1000()/*parent*/,0+methodIn.getSi583DeStartingPos2(119) - 1/*fromOffset - (de120Data500) */,methodOut.getSeprDataLength()/*fromLen*/,0/*toOffset - (data1000) */,methodOut.getSeprDataLength()/*toLen*/);
//  PERFORM 8030-PROCESS-DE120
                  processDe120(programCtx.getProcessDe120InCtx());/*8030-PROCESS-DE120*/
              }
          }

// *
//  IF SF31-ISO-PROCESSING-CODE = 300-LIT-380000
          if (		compareChars(methodOut.getSf31IsoProcessingCode(),methodIn.getLit380000300()) == 0 ) { 
//  ADD 300-ONE TO 400-AVS2-REC-COUNT
              methodOut.setAvs2RecCount400(methodOut.getAvs2RecCount400()+(int) methodOut.getOne300());
          }
//  PERFORM 3493-10-COMMON-CC-MOVES
          _10CommonCcMoves(programCtx.get_10CommonCcMovesInCtx());/*3493-10-COMMON-CC-MOVES*/
//  PERFORM 3493-20-CHECK-DE125
          _20CheckDe125(programCtx.get_20CheckDe125InCtx());/*3493-20-CHECK-DE125*/
          ;
      
      return methodOut;
      }
      /**
      * _10CommonCcMoves 
      *   This method is derived from 
  *   COBOL Paragraph - 3493-10-COMMON-CC-MOVES COBOL Cyclomatic complexity - 23
      * Input  :  

      * - tranAmt100860                  COBOL Name: 860-TRAN-AMT-100
      * - currencyCode860                COBOL Name: 860-CURRENCY-CODE
      * - tranAmt100d860                 COBOL Name: 860-TRAN-AMT-100D
      * - transactionAmount860           COBOL Name: 860-TRANSACTION-AMOUNT
      * - avsCurrCode110860              COBOL Name: 860-AVS-CURR-CODE-110
      * - transactionAmt860              COBOL Name: 860-TRANSACTION-AMT
      * - setlAmt100860                  COBOL Name: 860-SETL-AMT-100
      * - crncyCdeSetl100860             COBOL Name: 860-CRNCY-CDE-SETL-100
      * - setlAmt100d860                 COBOL Name: 860-SETL-AMT-100D
      * - setlAmount110860               COBOL Name: 860-SETL-AMOUNT-110
      * - crncyCdeSetl110860             COBOL Name: 860-CRNCY-CDE-SETL-110
      * - setlAmt110d860                 COBOL Name: 860-SETL-AMT-110D
      * - crdhldrBillAmt100860           COBOL Name: 860-CRDHLDR-BILL-AMT-100
      * - crdhldrBillAmt110860           COBOL Name: 860-CRDHLDR-BILL-AMT-110
      * - setlConvRte100860              COBOL Name: 860-SETL-CONV-RTE-100
      * - setlConvRte110860              COBOL Name: 860-SETL-CONV-RTE-110
      * - crdhldrConvRte100860           COBOL Name: 860-CRDHLDR-CONV-RTE-100
      * - crdhldrConvRte110860           COBOL Name: 860-CRDHLDR-CONV-RTE-110
      * - conv100Mmdd860                 COBOL Name: 860-CONV-100-MMDD
      * - conv110Mmdd860                 COBOL Name: 860-CONV-110-MMDD
      * - crncyCrdhldr100860             COBOL Name: 860-CRNCY-CRDHLDR-100
      * - crncyCrdhldr110860             COBOL Name: 860-CRNCY-CRDHLDR-110
      *
      * Output :  

      * - sf31IsoAvs2CurrencyCode        COBOL Name: SF31-ISO-AVS2-CURRENCY-CODE
      * - currencyCode860                COBOL Name: 860-CURRENCY-CODE
      * - sf31IsoTransactionAmt          COBOL Name: SF31-ISO-TRANSACTION-AMT
      * - tranAmt100d860                 COBOL Name: 860-TRAN-AMT-100D
      * - avsCurrCode110860              COBOL Name: 860-AVS-CURR-CODE-110
      * - transactionAmt860              COBOL Name: 860-TRANSACTION-AMT
      * - crncyCdeSetl100860             COBOL Name: 860-CRNCY-CDE-SETL-100
      * - setlAmt100d860                 COBOL Name: 860-SETL-AMT-100D
      * - crncyCdeSetl110860             COBOL Name: 860-CRNCY-CDE-SETL-110
      * - setlAmt110d860                 COBOL Name: 860-SETL-AMT-110D
      * - sf31IsoDe4TrnAmt               COBOL Name: SF31-ISO-DE4-TRN-AMT
      * - tranAmt100860                  COBOL Name: 860-TRAN-AMT-100
      * - transactionAmount860           COBOL Name: 860-TRANSACTION-AMOUNT
      * - sf31IsoDe5SetlAmt              COBOL Name: SF31-ISO-DE5-SETL-AMT
      * - setlAmt100860                  COBOL Name: 860-SETL-AMT-100
      * - setlAmount110860               COBOL Name: 860-SETL-AMOUNT-110
      * - sf31IsoDe6CrdhldBillAmt        COBOL Name: SF31-ISO-DE6-CRDHLD-BILL-AMT
      * - crdhldrBillAmt100860           COBOL Name: 860-CRDHLDR-BILL-AMT-100
      * - crdhldrBillAmt110860           COBOL Name: 860-CRDHLDR-BILL-AMT-110
      * - sf31IsoDe9SetlCnvRte           COBOL Name: SF31-ISO-DE9-SETL-CNV-RTE
      * - setlConvRte100860              COBOL Name: 860-SETL-CONV-RTE-100
      * - setlConvRte110860              COBOL Name: 860-SETL-CONV-RTE-110
      * - sf31IsoDe10CrdhldCnvRte        COBOL Name: SF31-ISO-DE10-CRDHLD-CNV-RTE
      * - crdhldrConvRte100860           COBOL Name: 860-CRDHLDR-CONV-RTE-100
      * - crdhldrConvRte110860           COBOL Name: 860-CRDHLDR-CONV-RTE-110
      * - sf31IsoDe16CnvDteMmdd          COBOL Name: SF31-ISO-DE16-CNV-DTE-MMDD
      * - conv100Mmdd860                 COBOL Name: 860-CONV-100-MMDD
      * - sf31IsoCnvDteCc                COBOL Name: SF31-ISO-CNV-DTE-CC
      * - sf31IsoCnvDteYy                COBOL Name: SF31-ISO-CNV-DTE-YY
      * - conv110Mmdd860                 COBOL Name: 860-CONV-110-MMDD
      * - sf31IsoCnvDteCcyymmdd          COBOL Name: SF31-ISO-CNV-DTE-CCYYMMDD
      * - sf31IsoDe49TrnCurCde           COBOL Name: SF31-ISO-DE49-TRN-CUR-CDE
      * - sf31IsoDe50SetlCurCde          COBOL Name: SF31-ISO-DE50-SETL-CUR-CDE
      * - sf31IsoDe51CrdhldCurCde        COBOL Name: SF31-ISO-DE51-CRDHLD-CUR-CDE
      * - crncyCrdhldr100860             COBOL Name: 860-CRNCY-CRDHLDR-100
      * - crncyCrdhldr110860             COBOL Name: 860-CRNCY-CRDHLDR-110
      *
      * @throws CFException
      */
      @Override
      public _10CommonCcMovesOutCtx _10CommonCcMoves(_10CommonCcMovesInCtx methodIn) throws Exception {
      
// *

// *
Sf311010Ctx programCtx = methodIn.getSf311010Ctx();
_10CommonCcMovesOutCtx methodOut = methodIn.get_10CommonCcMovesOutCtx();
//  IF 860-TRAN-AMT-100 (1 : 1) > LOW-VALUES
          if (		( isGreaterThanLowValue(substring(methodOut.getTranAmt100860String(),0,1)) ) ) { 
//  MOVE 860-CURRENCY-CODE TO SF31-ISO-AVS2-CURRENCY-CODE
              methodOut.setSf31IsoAvs2CurrencyCode(methodOut.getCurrencyCode860());
//  MOVE 860-TRAN-AMT-100D TO SF31-ISO-TRANSACTION-AMT
              methodOut.setSf31IsoTransactionAmt(methodOut.getTranAmt100d860());
          }
//  ELSE
          else { 
//  IF 860-TRANSACTION-AMOUNT (1 : 1) > LOW-VALUES
              if (		( isGreaterThanLowValue(substring(methodOut.getTransactionAmount860String(),0,1)) ) ) { 
//  MOVE 860-AVS-CURR-CODE-110 TO SF31-ISO-AVS2-CURRENCY-CODE
                  methodOut.setSf31IsoAvs2CurrencyCode(methodOut.getAvsCurrCode110860());
//  MOVE 860-TRANSACTION-AMT TO SF31-ISO-TRANSACTION-AMT
                  methodOut.setSf31IsoTransactionAmt(methodOut.getTransactionAmt860());
              }
//  ELSE
              else { 
//  IF 860-SETL-AMT-100 (1 : 1) > LOW-VALUES
                  if (		( isGreaterThanLowValue(substring(methodOut.getSetlAmt100860String(),0,1)) ) ) { 
//  MOVE 860-CRNCY-CDE-SETL-100 TO SF31-ISO-AVS2-CURRENCY-CODE
                      methodOut.setSf31IsoAvs2CurrencyCode(String.valueOf(methodOut.getCrncyCdeSetl100860String()).toCharArray());
//  MOVE 860-SETL-AMT-100D TO SF31-ISO-TRANSACTION-AMT
                      methodOut.setSf31IsoTransactionAmt(methodOut.getSetlAmt100d860());
                  }
//  ELSE
                  else { 
//  IF 860-SETL-AMOUNT-110 (1 : 1) > LOW-VALUES
                      if (		( isGreaterThanLowValue(substring(methodOut.getSetlAmount110860String(),0,1)) ) ) { 
//  MOVE 860-CRNCY-CDE-SETL-110 TO SF31-ISO-AVS2-CURRENCY-CODE
                          methodOut.setSf31IsoAvs2CurrencyCode(String.valueOf(methodOut.getCrncyCdeSetl110860String()).toCharArray());
//  MOVE 860-SETL-AMT-110D TO SF31-ISO-TRANSACTION-AMT
                          methodOut.setSf31IsoTransactionAmt(methodOut.getSetlAmt110d860());
                      }
//  ELSE
                      else { 
//  MOVE ZEROS TO SF31-ISO-TRANSACTION-AMT
                          methodOut.setSf31IsoTransactionAmt(BigDecimal.ZERO);
//  MOVE SPACES TO SF31-ISO-AVS2-CURRENCY-CODE
                          methodOut.setSf31IsoAvs2CurrencyCode(CONSTANTS.SPACE_3);
                      }
                  }
              }
          }
//  IF 860-TRAN-AMT-100 (1 : 1) > LOW-VALUES
          if (		( isGreaterThanLowValue(substring(methodOut.getTranAmt100860String(),0,1)) ) ) { 
//  MOVE 860-TRAN-AMT-100 TO SF31-ISO-DE4-TRN-AMT
              methodOut.setSf31IsoDe4TrnAmt(methodOut.getTranAmt100860());
          }
//  ELSE
          else { 
//  IF 860-TRANSACTION-AMOUNT (1 : 1) > LOW-VALUES
              if (		( isGreaterThanLowValue(substring(methodOut.getTransactionAmount860String(),0,1)) ) ) { 
//  MOVE 860-TRANSACTION-AMOUNT TO SF31-ISO-DE4-TRN-AMT
                  methodOut.setSf31IsoDe4TrnAmt(methodOut.getTransactionAmount860());
              }
//  ELSE
              else { 
//  MOVE ZEROS TO SF31-ISO-DE4-TRN-AMT
                  methodOut.setSf31IsoDe4TrnAmt(0);
              }
          }

// *
//  IF 860-SETL-AMT-100 (1 : 1) > LOW-VALUES
          if (		( isGreaterThanLowValue(substring(methodOut.getSetlAmt100860String(),0,1)) ) ) { 
//  MOVE 860-SETL-AMT-100 TO SF31-ISO-DE5-SETL-AMT
              methodOut.setSf31IsoDe5SetlAmt(methodOut.getSetlAmt100860());
          }
//  ELSE
          else { 
//  IF 860-SETL-AMOUNT-110 (1 : 1) > LOW-VALUES
              if (		( isGreaterThanLowValue(substring(methodOut.getSetlAmount110860String(),0,1)) ) ) { 
//  MOVE 860-SETL-AMOUNT-110 TO SF31-ISO-DE5-SETL-AMT
                  methodOut.setSf31IsoDe5SetlAmt(methodOut.getSetlAmount110860());
              }
//  ELSE
              else { 
//  MOVE ZEROS TO SF31-ISO-DE5-SETL-AMT
                  methodOut.setSf31IsoDe5SetlAmt(0);
              }
          }

// *
//  IF 860-CRDHLDR-BILL-AMT-100 (1 : 1) > LOW-VALUES
          if (		( isGreaterThanLowValue(substring(methodOut.getCrdhldrBillAmt100860String(),0,1)) ) ) { 
//  MOVE 860-CRDHLDR-BILL-AMT-100 TO SF31-ISO-DE6-CRDHLD-BILL-AMT
              methodOut.setSf31IsoDe6CrdhldBillAmt(methodOut.getCrdhldrBillAmt100860());
          }
//  ELSE
          else { 
//  IF 860-CRDHLDR-BILL-AMT-110 (1 : 1) > LOW-VALUES
              if (		( isGreaterThanLowValue(substring(methodOut.getCrdhldrBillAmt110860String(),0,1)) ) ) { 
//  MOVE 860-CRDHLDR-BILL-AMT-110 TO SF31-ISO-DE6-CRDHLD-BILL-AMT
                  methodOut.setSf31IsoDe6CrdhldBillAmt(methodOut.getCrdhldrBillAmt110860());
              }
//  ELSE
              else { 
//  MOVE ZEROS TO SF31-ISO-DE6-CRDHLD-BILL-AMT
                  methodOut.setSf31IsoDe6CrdhldBillAmt(0);
              }
          }

// *
//  IF 860-SETL-CONV-RTE-100 (1 : 1) > LOW-VALUES
          if (		( isGreaterThanLowValue(substring(methodOut.getSetlConvRte100860String(),0,1)) ) ) { 
//  MOVE 860-SETL-CONV-RTE-100 TO SF31-ISO-DE9-SETL-CNV-RTE
              methodOut.setSf31IsoDe9SetlCnvRte(String.valueOf(methodOut.getSetlConvRte100860String()).toCharArray());
          }
//  ELSE
          else { 
//  IF 860-SETL-CONV-RTE-110 (1 : 1) > LOW-VALUES
              if (		( isGreaterThanLowValue(substring(methodOut.getSetlConvRte110860String(),0,1)) ) ) { 
//  MOVE 860-SETL-CONV-RTE-110 TO SF31-ISO-DE9-SETL-CNV-RTE
                  methodOut.setSf31IsoDe9SetlCnvRte(String.valueOf(methodOut.getSetlConvRte110860String()).toCharArray());
              }
//  ELSE
              else { 
//  MOVE ZEROS TO SF31-ISO-DE9-SETL-CNV-RTE
                  methodOut.setSf31IsoDe9SetlCnvRte(CONSTANTS.ZERO_8);
              }
          }

// *
//  IF 860-CRDHLDR-CONV-RTE-100 (1 : 1) > LOW-VALUES
          if (		( isGreaterThanLowValue(substring(methodOut.getCrdhldrConvRte100860String(),0,1)) ) ) { 
//  MOVE 860-CRDHLDR-CONV-RTE-100 TO SF31-ISO-DE10-CRDHLD-CNV-RTE
              methodOut.setSf31IsoDe10CrdhldCnvRte(String.valueOf(methodOut.getCrdhldrConvRte100860String()).toCharArray());
          }
//  ELSE
          else { 
//  IF 860-CRDHLDR-CONV-RTE-110 (1 : 1) > LOW-VALUES
              if (		( isGreaterThanLowValue(substring(methodOut.getCrdhldrConvRte110860String(),0,1)) ) ) { 
//  MOVE 860-CRDHLDR-CONV-RTE-110 TO SF31-ISO-DE10-CRDHLD-CNV-RTE
                  methodOut.setSf31IsoDe10CrdhldCnvRte(String.valueOf(methodOut.getCrdhldrConvRte110860String()).toCharArray());
              }
//  ELSE
              else { 
//  MOVE ZEROS TO SF31-ISO-DE10-CRDHLD-CNV-RTE
                  methodOut.setSf31IsoDe10CrdhldCnvRte(CONSTANTS.ZERO_8);
              }
          }

// *
//  IF 860-CONV-100-MMDD > LOW-VALUES
          if (		( isGreaterThanLowValue(methodOut.getConv100Mmdd860String()) ) ) { 
//  MOVE 860-CONV-100-MMDD TO SF31-ISO-DE16-CNV-DTE-MMDD
              methodOut.setSf31IsoDe16CnvDteMmdd(String.valueOf(methodOut.getConv100Mmdd860String()).toCharArray());
//  MOVE ZEROS TO SF31-ISO-CNV-DTE-CC SF31-ISO-CNV-DTE-YY
              methodOut.setSf31IsoCnvDteCc(CONSTANTS.ZERO_2);
              methodOut.setSf31IsoCnvDteYy(CONSTANTS.ZERO_2);
          }
//  ELSE
          else { 
//  IF 860-CONV-110-MMDD (1 : 1) > LOW-VALUES
              if (		( isGreaterThanLowValue(substring(methodOut.getConv110Mmdd860String(),0,1)) ) ) { 
//  MOVE 860-CONV-110-MMDD TO SF31-ISO-DE16-CNV-DTE-MMDD
                  methodOut.setSf31IsoDe16CnvDteMmdd(String.valueOf(methodOut.getConv110Mmdd860String()).toCharArray());
//  MOVE ZEROS TO SF31-ISO-CNV-DTE-CC SF31-ISO-CNV-DTE-YY
                  methodOut.setSf31IsoCnvDteCc(CONSTANTS.ZERO_2);
                  methodOut.setSf31IsoCnvDteYy(CONSTANTS.ZERO_2);
              }
//  ELSE
              else { 
//  MOVE ZEROS TO SF31-ISO-CNV-DTE-CCYYMMDD
                  methodOut.getSf31IsoCnvDteCcyymmdd().setString(CONSTANTS.ZERO_8);
              }
          }

// *
//  IF 860-CURRENCY-CODE (1 : 1) > LOW-VALUES
          if (		( isGreaterThanLowValue(substring(methodOut.getCurrencyCode860(),0,1)) ) ) { 
//  MOVE 860-CURRENCY-CODE TO SF31-ISO-DE49-TRN-CUR-CDE
              methodOut.setSf31IsoDe49TrnCurCde(methodOut.getCurrencyCode860());
          }
//  ELSE
          else { 
//  IF 860-AVS-CURR-CODE-110 (1 : 1) > LOW-VALUES
              if (		( isGreaterThanLowValue(substring(methodOut.getAvsCurrCode110860(),0,1)) ) ) { 
//  MOVE 860-AVS-CURR-CODE-110 TO SF31-ISO-DE49-TRN-CUR-CDE
                  methodOut.setSf31IsoDe49TrnCurCde(methodOut.getAvsCurrCode110860());
              }
//  ELSE
              else { 
//  MOVE ZEROS TO SF31-ISO-DE49-TRN-CUR-CDE
                  methodOut.setSf31IsoDe49TrnCurCde(CONSTANTS.ZERO_3);
              }
          }

// *
//  IF 860-CRNCY-CDE-SETL-100 (1 : 1) > LOW-VALUES
          if (		( isGreaterThanLowValue(substring(methodOut.getCrncyCdeSetl100860String(),0,1)) ) ) { 
//  MOVE 860-CRNCY-CDE-SETL-100 TO SF31-ISO-DE50-SETL-CUR-CDE
              methodOut.setSf31IsoDe50SetlCurCde(String.valueOf(methodOut.getCrncyCdeSetl100860String()).toCharArray());
          }
//  ELSE
          else { 
//  IF 860-CRNCY-CDE-SETL-110 (1 : 1) > LOW-VALUES
              if (		( isGreaterThanLowValue(substring(methodOut.getCrncyCdeSetl110860String(),0,1)) ) ) { 
//  MOVE 860-CRNCY-CDE-SETL-110 TO SF31-ISO-DE50-SETL-CUR-CDE
                  methodOut.setSf31IsoDe50SetlCurCde(String.valueOf(methodOut.getCrncyCdeSetl110860String()).toCharArray());
              }
//  ELSE
              else { 
//  MOVE ZEROS TO SF31-ISO-DE50-SETL-CUR-CDE
                  methodOut.setSf31IsoDe50SetlCurCde(CONSTANTS.ZERO_3);
              }
          }

// *
//  IF 860-CRNCY-CRDHLDR-100 (1 : 1) > LOW-VALUES
          if (		( isGreaterThanLowValue(substring(methodOut.getCrncyCrdhldr100860String(),0,1)) ) ) { 
//  MOVE 860-CRNCY-CRDHLDR-100 TO SF31-ISO-DE51-CRDHLD-CUR-CDE
              methodOut.setSf31IsoDe51CrdhldCurCde(String.valueOf(methodOut.getCrncyCrdhldr100860String()).toCharArray());
          }
//  ELSE
          else { 
//  IF 860-CRNCY-CRDHLDR-110 (1 : 1) > LOW-VALUES
              if (		( isGreaterThanLowValue(substring(methodOut.getCrncyCrdhldr110860String(),0,1)) ) ) { 
//  MOVE 860-CRNCY-CRDHLDR-110 TO SF31-ISO-DE51-CRDHLD-CUR-CDE
                  methodOut.setSf31IsoDe51CrdhldCurCde(String.valueOf(methodOut.getCrncyCrdhldr110860String()).toCharArray());
              }
//  ELSE
              else { 
//  MOVE ZEROS TO SF31-ISO-DE51-CRDHLD-CUR-CDE
                  methodOut.setSf31IsoDe51CrdhldCurCde(CONSTANTS.ZERO_3);
              }
          }
      
      return methodOut;
      }
      /**
      * _20CheckDe125 
      *   This method is derived from 
  *   COBOL Paragraph - 3493-20-CHECK-DE125 COBOL Cyclomatic complexity - 25
      * Input  :  

      * - crncyConv100860                COBOL Name: 860-CRNCY-CONV-100
      * - sf31IsoDe5SetlAmt              COBOL Name: SF31-ISO-DE5-SETL-AMT
      * - lit05300                       COBOL Name: 300-LIT-05
      * - sf31IsoDe6CrdhldBillAmt        COBOL Name: SF31-ISO-DE6-CRDHLD-BILL-AMT
      * - lit06300                       COBOL Name: 300-LIT-06
      * - bytes516891                    COBOL Name: 891-BYTES-5-16
      * - sf31IsoDe9SetlCnvRte           COBOL Name: SF31-ISO-DE9-SETL-CNV-RTE
      * - lit09300                       COBOL Name: 300-LIT-09
      * - bytes1718891                   COBOL Name: 891-BYTES-17-18
      * - bytes2128891                   COBOL Name: 891-BYTES-21-28
      * - sf31IsoDe10CrdhldCnvRte        COBOL Name: SF31-ISO-DE10-CRDHLD-CNV-RTE
      * - lit10300                       COBOL Name: 300-LIT-10
      * - sf31IsoDe16CnvDteMmdd          COBOL Name: SF31-ISO-DE16-CNV-DTE-MMDD
      * - lit16300                       COBOL Name: 300-LIT-16
      * - bytes2930891                   COBOL Name: 891-BYTES-29-30
      * - bytes3336891                   COBOL Name: 891-BYTES-33-36
      * - sf31IsoDe50SetlCurCde          COBOL Name: SF31-ISO-DE50-SETL-CUR-CDE
      * - lit50300                       COBOL Name: 300-LIT-50
      * - bytes3738891                   COBOL Name: 891-BYTES-37-38
      * - bytes4143891                   COBOL Name: 891-BYTES-41-43
      * - sf31IsoDe51CrdhldCurCde        COBOL Name: SF31-ISO-DE51-CRDHLD-CUR-CDE
      * - lit51300                       COBOL Name: 300-LIT-51
      * - sf31IsoDe4TrnAmt               COBOL Name: SF31-ISO-DE4-TRN-AMT
      * - sf31IsoDe49TrnCurCde           COBOL Name: SF31-ISO-DE49-TRN-CUR-CDE
      *
      * Output :  

      * - de125WorkAreaA890              COBOL Name: 890-DE125-WORK-AREA-A
      * - crncyConv100860                COBOL Name: 860-CRNCY-CONV-100
      * - bytes12890                     COBOL Name: 890-BYTES-1-2
      * - bytes516890                    COBOL Name: 890-BYTES-5-16
      * - sf31IsoDe5SetlAmt              COBOL Name: SF31-ISO-DE5-SETL-AMT
      * - sf31IsoDe6CrdhldBillAmt        COBOL Name: SF31-ISO-DE6-CRDHLD-BILL-AMT
      * - bytes516891                    COBOL Name: 891-BYTES-5-16
      * - bytes1718890                   COBOL Name: 890-BYTES-17-18
      * - bytes2132890                   COBOL Name: 890-BYTES-21-32
      * - bytes3334890                   COBOL Name: 890-BYTES-33-34
      * - bytes3744890                   COBOL Name: 890-BYTES-37-44
      * - sf31IsoDe9SetlCnvRte           COBOL Name: SF31-ISO-DE9-SETL-CNV-RTE
      * - bytes2128891                   COBOL Name: 891-BYTES-21-28
      * - bytes4546890                   COBOL Name: 890-BYTES-45-46
      * - bytes4956890                   COBOL Name: 890-BYTES-49-56
      * - sf31IsoDe10CrdhldCnvRte        COBOL Name: SF31-ISO-DE10-CRDHLD-CNV-RTE
      * - bytes5758890                   COBOL Name: 890-BYTES-57-58
      * - bytes6164890                   COBOL Name: 890-BYTES-61-64
      * - sf31IsoDe16CnvDteMmdd          COBOL Name: SF31-ISO-DE16-CNV-DTE-MMDD
      * - sf31IsoCnvDteCc                COBOL Name: SF31-ISO-CNV-DTE-CC
      * - sf31IsoCnvDteYy                COBOL Name: SF31-ISO-CNV-DTE-YY
      * - bytes3336891                   COBOL Name: 891-BYTES-33-36
      * - bytes6566890                   COBOL Name: 890-BYTES-65-66
      * - bytes6971890                   COBOL Name: 890-BYTES-69-71
      * - sf31IsoDe50SetlCurCde          COBOL Name: SF31-ISO-DE50-SETL-CUR-CDE
      * - bytes4143891                   COBOL Name: 891-BYTES-41-43
      * - bytes7273890                   COBOL Name: 890-BYTES-72-73
      * - bytes7678890                   COBOL Name: 890-BYTES-76-78
      * - sf31IsoDe51CrdhldCurCde        COBOL Name: SF31-ISO-DE51-CRDHLD-CUR-CDE
      * - sf31IsoDe4TrnAmt               COBOL Name: SF31-ISO-DE4-TRN-AMT
      * - sf31IsoDe49TrnCurCde           COBOL Name: SF31-ISO-DE49-TRN-CUR-CDE
      *
      * @throws CFException
      */
      @Override
      public _20CheckDe125OutCtx _20CheckDe125(_20CheckDe125InCtx methodIn) throws Exception {
      
// *

// *****************************************************************
// *   Two storage areas are used one is when there are both de5   *
// *   and de6 on de125 - the second is when only de5 or de6 is on *
// *   the de125.  de16 will always be on either layout.  if de5 is*
// *   present, then de9 and de50 should also be there.  it de6 is *
// *   present, then de10 and de51 should also be present.  the    *
// *   storage areas are 890-de125-work-area-a and 891-de125-work- *
// *   area-b which redefines the other.                           *
// *****************************************************************
// *
Sf311010Ctx programCtx = methodIn.getSf311010Ctx();
_20CheckDe125OutCtx methodOut = methodIn.get_20CheckDe125OutCtx();
//  MOVE 860-CRNCY-CONV-100 TO 890-DE125-WORK-AREA-A
          methodOut.setDe125WorkAreaA890(methodOut.getCrncyConv100860());
//  IF SF31-ISO-DE5-SETL-AMT = ZEROS AND 890-BYTES-1-2 = 300-LIT-05
          if (	( methodOut.getSf31IsoDe5SetlAmt() == 0 )  && 		compareChars(methodOut.getBytes12890(),methodIn.getLit05300()) == 0 ) { 
//  MOVE 890-BYTES-5-16 TO SF31-ISO-DE5-SETL-AMT
              methodOut.setSf31IsoDe5SetlAmt(methodOut.getBytes516890());
          }

// *
//  IF SF31-ISO-DE6-CRDHLD-BILL-AMT = ZEROS
          if (	( methodOut.getSf31IsoDe6CrdhldBillAmt() == 0 ) ) { 
//  IF 890-BYTES-1-2 = 300-LIT-06
              if (		compareChars(methodOut.getBytes12890(),methodIn.getLit06300()) == 0 ) { 
//  MOVE 891-BYTES-5-16 TO SF31-ISO-DE6-CRDHLD-BILL-AMT
                  methodOut.setSf31IsoDe6CrdhldBillAmt(methodOut.getBytes516891());
              }
//  ELSE
              else { 
//  IF 890-BYTES-17-18 = 300-LIT-06
                  if (		compareChars(methodOut.getBytes1718890(),methodIn.getLit06300()) == 0 ) { 
//  MOVE 890-BYTES-21-32 TO SF31-ISO-DE6-CRDHLD-BILL-AMT
                      methodOut.setSf31IsoDe6CrdhldBillAmt(methodOut.getBytes2132890());
                  }
              }
          }

// *
//  IF SF31-ISO-DE9-SETL-CNV-RTE = ZEROS
          if (( allZeros(methodOut.getSf31IsoDe9SetlCnvRte()) ) /*  ==  zeros*/) { 
//  IF 890-BYTES-33-34 = 300-LIT-09
              if (		compareChars(methodOut.getBytes3334890(),methodIn.getLit09300()) == 0 ) { 
//  MOVE 890-BYTES-37-44 TO SF31-ISO-DE9-SETL-CNV-RTE
                  methodOut.setSf31IsoDe9SetlCnvRte(String.valueOf(methodOut.getBytes3744890String()).toCharArray());
              }
//  ELSE
              else { 
//  IF 891-BYTES-17-18 = 300-LIT-09
                  if (		compareChars(methodIn.getBytes1718891(),methodIn.getLit09300()) == 0 ) { 
//  MOVE 891-BYTES-21-28 TO SF31-ISO-DE9-SETL-CNV-RTE
                      methodOut.setSf31IsoDe9SetlCnvRte(String.valueOf(methodOut.getBytes2128891String()).toCharArray());
                  }
              }
          }

// *
//  IF SF31-ISO-DE10-CRDHLD-CNV-RTE = ZEROS
          if (( allZeros(methodOut.getSf31IsoDe10CrdhldCnvRte()) ) /*  ==  zeros*/) { 
//  IF 890-BYTES-45-46 = 300-LIT-10
              if (		compareChars(methodOut.getBytes4546890(),methodIn.getLit10300()) == 0 ) { 
//  MOVE 890-BYTES-49-56 TO SF31-ISO-DE10-CRDHLD-CNV-RTE
                  methodOut.setSf31IsoDe10CrdhldCnvRte(String.valueOf(methodOut.getBytes4956890String()).toCharArray());
              }
//  ELSE
              else { 
//  IF 891-BYTES-17-18 = 300-LIT-10
                  if (		compareChars(methodIn.getBytes1718891(),methodIn.getLit10300()) == 0 ) { 
//  MOVE 891-BYTES-21-28 TO SF31-ISO-DE10-CRDHLD-CNV-RTE
                      methodOut.setSf31IsoDe10CrdhldCnvRte(String.valueOf(methodOut.getBytes2128891String()).toCharArray());
                  }
              }
          }

// *
//  IF SF31-ISO-DE16-CNV-DTE-MMDD = ZEROS
          if (( allZeros(methodOut.getSf31IsoDe16CnvDteMmdd()) ) /*  ==  zeros*/) { 
//  IF 890-BYTES-57-58 = 300-LIT-16
              if (		compareChars(methodOut.getBytes5758890(),methodIn.getLit16300()) == 0 ) { 
//  MOVE 890-BYTES-61-64 TO SF31-ISO-DE16-CNV-DTE-MMDD
                  methodOut.setSf31IsoDe16CnvDteMmdd(String.valueOf(methodOut.getBytes6164890String()).toCharArray());
//  MOVE ZEROS TO SF31-ISO-CNV-DTE-CC SF31-ISO-CNV-DTE-YY
                  methodOut.setSf31IsoCnvDteCc(CONSTANTS.ZERO_2);
                  methodOut.setSf31IsoCnvDteYy(CONSTANTS.ZERO_2);
              }
//  ELSE
              else { 
//  IF 891-BYTES-29-30 = 300-LIT-16
                  if (		compareChars(methodIn.getBytes2930891(),methodIn.getLit16300()) == 0 ) { 
//  MOVE 891-BYTES-33-36 TO SF31-ISO-DE16-CNV-DTE-MMDD
                      methodOut.setSf31IsoDe16CnvDteMmdd(String.valueOf(methodOut.getBytes3336891String()).toCharArray());
//  MOVE ZEROS TO SF31-ISO-CNV-DTE-CC SF31-ISO-CNV-DTE-YY
                      methodOut.setSf31IsoCnvDteCc(CONSTANTS.ZERO_2);
                      methodOut.setSf31IsoCnvDteYy(CONSTANTS.ZERO_2);
                  }
              }
          }

// *
//  IF SF31-ISO-DE50-SETL-CUR-CDE = ZEROS
          if (( allZeros(methodOut.getSf31IsoDe50SetlCurCde()) ) /*  ==  zeros*/) { 
//  IF 890-BYTES-65-66 = 300-LIT-50
              if (		compareChars(methodOut.getBytes6566890(),methodIn.getLit50300()) == 0 ) { 
//  MOVE 890-BYTES-69-71 TO SF31-ISO-DE50-SETL-CUR-CDE
                  methodOut.setSf31IsoDe50SetlCurCde(String.valueOf(methodOut.getBytes6971890String()).toCharArray());
              }
//  ELSE
              else { 
//  IF 891-BYTES-37-38 = 300-LIT-50
                  if (		compareChars(methodIn.getBytes3738891(),methodIn.getLit50300()) == 0 ) { 
//  MOVE 891-BYTES-41-43 TO SF31-ISO-DE50-SETL-CUR-CDE
                      methodOut.setSf31IsoDe50SetlCurCde(String.valueOf(methodOut.getBytes4143891String()).toCharArray());
                  }
              }
          }

// *
//  IF SF31-ISO-DE51-CRDHLD-CUR-CDE = ZEROS
          if (( allZeros(methodOut.getSf31IsoDe51CrdhldCurCde()) ) /*  ==  zeros*/) { 
//  IF 890-BYTES-72-73 = 300-LIT-51
              if (		compareChars(methodOut.getBytes7273890(),methodIn.getLit51300()) == 0 ) { 
//  MOVE 890-BYTES-76-78 TO SF31-ISO-DE51-CRDHLD-CUR-CDE
                  methodOut.setSf31IsoDe51CrdhldCurCde(String.valueOf(methodOut.getBytes7678890String()).toCharArray());
              }
//  ELSE
              else { 
//  IF 891-BYTES-37-38 = 300-LIT-51
                  if (		compareChars(methodIn.getBytes3738891(),methodIn.getLit51300()) == 0 ) { 
//  MOVE 891-BYTES-41-43 TO SF31-ISO-DE51-CRDHLD-CUR-CDE
                      methodOut.setSf31IsoDe51CrdhldCurCde(String.valueOf(methodOut.getBytes4143891String()).toCharArray());
                  }
              }
          }

// *
//  IF SF31-ISO-DE5-SETL-AMT = ZEROS
          if (	( methodOut.getSf31IsoDe5SetlAmt() == 0 ) ) { 
//  MOVE SF31-ISO-DE4-TRN-AMT TO SF31-ISO-DE5-SETL-AMT
              methodOut.setSf31IsoDe5SetlAmt(methodOut.getSf31IsoDe4TrnAmt());
          }

// *
//  IF SF31-ISO-DE50-SETL-CUR-CDE = ZEROS
          if (( allZeros(methodOut.getSf31IsoDe50SetlCurCde()) ) /*  ==  zeros*/) { 
//  MOVE SF31-ISO-DE49-TRN-CUR-CDE TO SF31-ISO-DE50-SETL-CUR-CDE
              methodOut.setSf31IsoDe50SetlCurCde(methodOut.getSf31IsoDe49TrnCurCde());
          }

// *
//  IF SF31-ISO-DE6-CRDHLD-BILL-AMT = ZEROS
          if (	( methodOut.getSf31IsoDe6CrdhldBillAmt() == 0 ) ) { 
//  MOVE SF31-ISO-DE4-TRN-AMT TO SF31-ISO-DE6-CRDHLD-BILL-AMT
              methodOut.setSf31IsoDe6CrdhldBillAmt(methodOut.getSf31IsoDe4TrnAmt());
          }

// *
//  IF SF31-ISO-DE51-CRDHLD-CUR-CDE = ZEROS
          if (( allZeros(methodOut.getSf31IsoDe51CrdhldCurCde()) ) /*  ==  zeros*/) { 
//  MOVE SF31-ISO-DE49-TRN-CUR-CDE TO SF31-ISO-DE51-CRDHLD-CUR-CDE
              methodOut.setSf31IsoDe51CrdhldCurCde(methodOut.getSf31IsoDe49TrnCurCde());
          }
      
      return methodOut;
      }
      /**
      * callParser 
      *   This method is derived from 
  *   COBOL Paragraph - 5000-CALL-PARSER COBOL Cyclomatic complexity - 4
      * Input  :  

      * - litY300                        COBOL Name: 300-LIT-Y
      * - si583DataPtr                   COBOL Name: SI583-DATA-PTR
      * - two300                         COBOL Name: 300-TWO
      * - litN300                        COBOL Name: 300-LIT-N
      * - totalParseErrors400            COBOL Name: 400-TOTAL-PARSE-ERRORS
      * - billlogMsg1600                 COBOL Name: 600-BILLLOG-MSG1
      * - si583ReturnCode                COBOL Name: SI583-RETURN-CODE
      * - billlogMsg2600                 COBOL Name: 600-BILLLOG-MSG2
      * - sf501Class                     COBOL Name: SF501-CLASS
      * - billlogMsg3600                 COBOL Name: 600-BILLLOG-MSG3
      * - sf501Type                      COBOL Name: SF501-TYPE
      * - billlogMsg4600                 COBOL Name: 600-BILLLOG-MSG4
      * - sf501BkntRefNo                 COBOL Name: SF501-BKNT-REF-NO
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      * - parseSw100                     COBOL Name: 100-PARSE-SW
      * - litY300                        COBOL Name: 300-LIT-Y
      * - data1000                       COBOL Name: 1000-DATA
      * - logDecompressedData860         COBOL Name: 860-LOG-DECOMPRESSED-DATA
      * - litN300                        COBOL Name: 300-LIT-N
      * - totalParseErrors400            COBOL Name: 400-TOTAL-PARSE-ERRORS
      *
      * @throws CFException
      */
      @Override
      public CallParserOutCtx callParser(CallParserInCtx methodIn) throws Exception {
      
// *
// ***********************************************************
// *    This routine sets up parameters for and calls the    *
// *    iso log message parser program. set our linkage area *
// *    work field to the address of the parsed data.        *
// ***********************************************************
Sf311010Ctx programCtx = methodIn.getSf311010Ctx();
CallParserOutCtx methodOut = methodIn.getCallParserOutCtx();
//  CALL 800-PTR-SI994010
          // CALL 800-PTR-SI994010
          	programCtx.setRc( si994010.process(programCtx.getGlobalCtx().getContext("SI994010")));
//  EVALUATE SI583-RETURN-CODE
          if  (	( methodIn.getSi583ReturnCode() == 0 ) ) { 
//  MOVE 300-LIT-Y TO 100-PARSE-SW
              methodOut.setParseSw100(methodOut.getLitY300());
//  SET ADDRESS OF 1000-DATA TO SI583-DATA-PTR
              methodIn.getDataGroup1000().set(getObject(methodIn.getSi583DataPtr())); 
              
              // MOVE LOW-VALUES TO 860-LOG-DECOMPRESSED-DATA
              methodOut.getLogDecompressedData860().setString(CONSTANTS.LOW_VALUE_215539513);
//  PERFORM 5100-MOVE-MTI-1
              moveMti1(programCtx.getMoveMti1InCtx());/*5100-MOVE-MTI-1*/
//  PERFORM 5200-MOVE-MTI-2
              moveMti2(programCtx.getMoveMti2InCtx());/*5200-MOVE-MTI-2*/
          }
          else if  (	( methodIn.getSi583ReturnCode() == methodIn.getTwo300() ) ) { 
//  MOVE 300-LIT-Y TO 100-PARSE-SW
              methodOut.setParseSw100(methodOut.getLitY300());
//  SET ADDRESS OF 1000-DATA TO SI583-DATA-PTR
              methodIn.getDataGroup1000().set(getObject(methodIn.getSi583DataPtr())); 
              
              // MOVE LOW-VALUES TO 860-LOG-DECOMPRESSED-DATA
              methodOut.getLogDecompressedData860().setString(CONSTANTS.LOW_VALUE_215539513);
//  PERFORM 5100-MOVE-MTI-1
              moveMti1(programCtx.getMoveMti1InCtx());/*5100-MOVE-MTI-1*/
          }
          else   { 
//  MOVE 300-LIT-N TO 100-PARSE-SW
              methodOut.setParseSw100(methodOut.getLitN300());
//  ADD +1 TO 400-TOTAL-PARSE-ERRORS
              methodOut.setTotalParseErrors400(methodOut.getTotalParseErrors400()+(long)1);
//  DISPLAY 600-BILLLOG-MSG1 SPACE SI583-RETURN-CODE SPACE 600-BILLLOG-MSG2 SPACE SF501-CLASS SPACE 600-BILLLOG-MSG3 SPACE SPACE SF501-TYPE SPACE 600-BILLLOG-MSG4 SPACE SF501-BKNT-REF-NO
              logger.info("{}{}{}{}{}{}{}{}", new String(methodIn.getBilllogMsg1600()), String.valueOf(methodIn.getSi583ReturnCode()), new String(methodIn.getBilllogMsg2600()), new String(methodIn.getSf501Class()), new String(methodIn.getBilllogMsg3600()), new String(methodIn.getSf501Type()), new String(methodIn.getBilllogMsg4600()), new String(methodIn.getSf501BkntRefNo())); 
          }
      
      return methodOut;
      }
      /**
      * moveMti1 
      *   This method is derived from 
  *   COBOL Paragraph - 5100-MOVE-MTI-1 COBOL Cyclomatic complexity - 30
      * Input  :  

      * - si583DePresentInd1             COBOL Name: SI583-DE-PRESENT-IND-1
      * - data1000                       COBOL Name: 1000-DATA
      *
      * Output :  

      * - cardholderNbr860               COBOL Name: 860-CARDHOLDER-NBR
      * - data1000                       COBOL Name: 1000-DATA
      * - processingCode110860           COBOL Name: 860-PROCESSING-CODE-110
      * - transactionAmount860           COBOL Name: 860-TRANSACTION-AMOUNT
      * - setlAmount110860               COBOL Name: 860-SETL-AMOUNT-110
      * - crdhldrBillAmt110860           COBOL Name: 860-CRDHLDR-BILL-AMT-110
      * - dateTimeXmit110860             COBOL Name: 860-DATE-TIME-XMIT-110
      * - setlConvRte110860              COBOL Name: 860-SETL-CONV-RTE-110
      * - crdhldrConvRte110860           COBOL Name: 860-CRDHLDR-CONV-RTE-110
      * - sysTraceAudit860               COBOL Name: 860-SYS-TRACE-AUDIT
      * - transMmdd110860                COBOL Name: 860-TRANS-MMDD-110
      * - conv110Mmdd860                 COBOL Name: 860-CONV-110-MMDD
      * - merchantType110860             COBOL Name: 860-MERCHANT-TYPE-110
      * - countryCode110860              COBOL Name: 860-COUNTRY-CODE-110
      * - posEntry110860                 COBOL Name: 860-POS-ENTRY-110
      * - posPinCapture110860            COBOL Name: 860-POS-PIN-CAPTURE-110
      * - acquirerIca860                 COBOL Name: 860-ACQUIRER-ICA
      * - forwardInstId860               COBOL Name: 860-FORWARD-INST-ID
      * - retrievalRefno110860           COBOL Name: 860-RETRIEVAL-REFNO-110
      * - authNumber860                  COBOL Name: 860-AUTH-NUMBER
      * - authResponse860                COBOL Name: 860-AUTH-RESPONSE
      * - idTerminal110860               COBOL Name: 860-ID-TERMINAL-110
      * - cardAcceptor110860             COBOL Name: 860-CARD-ACCEPTOR-110
      * - authMrchNmctst110860           COBOL Name: 860-AUTH-MRCH-NMCTST-110
      * - authAddlData860                COBOL Name: 860-AUTH-ADDL-DATA
      * - avsCurrCode110860              COBOL Name: 860-AVS-CURR-CODE-110
      * - crncyCdeSetl110860             COBOL Name: 860-CRNCY-CDE-SETL-110
      * - crncyCrdhldr110860             COBOL Name: 860-CRNCY-CRDHLDR-110
      * - bkntData110860                 COBOL Name: 860-BKNT-DATA-110
      * - de112110860                    COBOL Name: 860-DE112-110
      *
      * @throws CFException
      */
      @Override
      public MoveMti1OutCtx moveMti1(MoveMti1InCtx methodIn) throws Exception {
Sf311010Ctx programCtx = methodIn.getSf311010Ctx();
MoveMti1OutCtx methodOut = methodIn.getMoveMti1OutCtx();
//  IF 88-SI583-DE-PRESENT-1 (2)
          if ( methodIn.isSi583DePresent188(1)  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (2) : SI583-DE-LENGTH-1 (2)) TO 860-CARDHOLDER-NBR
              methodIn.getLogDecompressedData860().replace(methodIn.getDataGroup1000()/*parent*/,0+methodIn.getSi583DeStartingPos1(1) - 1/*fromOffset - (cardholderNbr860) */,methodIn.getSi583DeLength1(1)/*fromLen*/,0/*toOffset - (data1000) */,19/*toLen*/);
          }
//  IF 88-SI583-DE-PRESENT-1 (3)
          if ( methodIn.isSi583DePresent188(2)  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (3) : SI583-DE-LENGTH-1 (3)) TO 860-PROCESSING-CODE-110
              try {
              methodOut.setProcessingCode110860(CFUtil.getLong(substring(methodOut.getData1000(),(methodIn.getSi583DeStartingPos1(2)-1), (methodIn.getSi583DeLength1(2) + (methodIn.getSi583DeStartingPos1(2) - 1)) )));
              } catch(NumberFormatException e) {}
          }
//  IF 88-SI583-DE-PRESENT-1 (4)
          if ( methodIn.isSi583DePresent188(3)  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (4) : SI583-DE-LENGTH-1 (4)) TO 860-TRANSACTION-AMOUNT
              try {
              methodOut.setTransactionAmount860(CFUtil.getLong(substring(methodOut.getData1000(),(methodIn.getSi583DeStartingPos1(3)-1), (methodIn.getSi583DeLength1(3) + (methodIn.getSi583DeStartingPos1(3) - 1)) )));
              } catch(NumberFormatException e) {}
          }
//  IF 88-SI583-DE-PRESENT-1 (5)
          if ( methodIn.isSi583DePresent188(4)  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (5) : SI583-DE-LENGTH-1 (5)) TO 860-SETL-AMOUNT-110
              try {
              methodOut.setSetlAmount110860(CFUtil.getLong(substring(methodOut.getData1000(),(methodIn.getSi583DeStartingPos1(4)-1), (methodIn.getSi583DeLength1(4) + (methodIn.getSi583DeStartingPos1(4) - 1)) )));
              } catch(NumberFormatException e) {}
          }
//  IF 88-SI583-DE-PRESENT-1 (6)
          if ( methodIn.isSi583DePresent188(5)  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (6) : SI583-DE-LENGTH-1 (6)) TO 860-CRDHLDR-BILL-AMT-110
              try {
              methodOut.setCrdhldrBillAmt110860(CFUtil.getLong(substring(methodOut.getData1000(),(methodIn.getSi583DeStartingPos1(5)-1), (methodIn.getSi583DeLength1(5) + (methodIn.getSi583DeStartingPos1(5) - 1)) )));
              } catch(NumberFormatException e) {}
          }
//  IF 88-SI583-DE-PRESENT-1 (7)
          if ( methodIn.isSi583DePresent188(6)  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (7) : SI583-DE-LENGTH-1 (7)) TO 860-DATE-TIME-XMIT-110
              try {
              methodOut.setDateTimeXmit110860(CFUtil.getLong(substring(methodOut.getData1000(),(methodIn.getSi583DeStartingPos1(6)-1), (methodIn.getSi583DeLength1(6) + (methodIn.getSi583DeStartingPos1(6) - 1)) )));
              } catch(NumberFormatException e) {}
          }
//  IF 88-SI583-DE-PRESENT-1 (9)
          if ( methodIn.isSi583DePresent188(8)  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (9) : SI583-DE-LENGTH-1 (9)) TO 860-SETL-CONV-RTE-110
              try {
              methodOut.setSetlConvRte110860(CFUtil.getLong(substring(methodOut.getData1000(),(methodIn.getSi583DeStartingPos1(8)-1), (methodIn.getSi583DeLength1(8) + (methodIn.getSi583DeStartingPos1(8) - 1)) )));
              } catch(NumberFormatException e) {}
          }
//  IF 88-SI583-DE-PRESENT-1 (10)
          if ( methodIn.isSi583DePresent188(9)  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (10) : SI583-DE-LENGTH-1 (10)) TO 860-CRDHLDR-CONV-RTE-110
              try {
              methodOut.setCrdhldrConvRte110860(CFUtil.getLong(substring(methodOut.getData1000(),(methodIn.getSi583DeStartingPos1(9)-1), (methodIn.getSi583DeLength1(9) + (methodIn.getSi583DeStartingPos1(9) - 1)) )));
              } catch(NumberFormatException e) {}
          }
//  IF 88-SI583-DE-PRESENT-1 (11)
          if ( methodIn.isSi583DePresent188(10)  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (11) : SI583-DE-LENGTH-1 (11)) TO 860-SYS-TRACE-AUDIT
              methodIn.getLogDecompressedData860().replace(methodIn.getDataGroup1000()/*parent*/,0+methodIn.getSi583DeStartingPos1(10) - 1/*fromOffset - (sysTraceAudit860) */,methodIn.getSi583DeLength1(10)/*fromLen*/,87/*toOffset - (data1000) */,6/*toLen*/);
          }
//  IF 88-SI583-DE-PRESENT-1 (15)
          if ( methodIn.isSi583DePresent188(14)  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (15) : SI583-DE-LENGTH-1 (15)) TO 860-TRANS-MMDD-110
              methodOut.setTransMmdd110860(CFUtil.getInt(substring(methodOut.getData1000(),(methodIn.getSi583DeStartingPos1(14)-1), (methodIn.getSi583DeLength1(14) + (methodIn.getSi583DeStartingPos1(14) - 1)) )));
          }
//  IF 88-SI583-DE-PRESENT-1 (16)
          if ( methodIn.isSi583DePresent188(15)  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (16) : SI583-DE-LENGTH-1 (16)) TO 860-CONV-110-MMDD
              methodOut.setConv110Mmdd860(CFUtil.getInt(substring(methodOut.getData1000(),(methodIn.getSi583DeStartingPos1(15)-1), (methodIn.getSi583DeLength1(15) + (methodIn.getSi583DeStartingPos1(15) - 1)) )));
          }
//  IF 88-SI583-DE-PRESENT-1 (18)
          if ( methodIn.isSi583DePresent188(17)  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (18) : SI583-DE-LENGTH-1 (18)) TO 860-MERCHANT-TYPE-110
              methodOut.setMerchantType110860(CFUtil.getInt(substring(methodOut.getData1000(),(methodIn.getSi583DeStartingPos1(17)-1), (methodIn.getSi583DeLength1(17) + (methodIn.getSi583DeStartingPos1(17) - 1)) )));
          }
//  IF 88-SI583-DE-PRESENT-1 (20)
          if ( methodIn.isSi583DePresent188(19)  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (20) : SI583-DE-LENGTH-1 (20)) TO 860-COUNTRY-CODE-110
              methodIn.getLogDecompressedData860().replace(methodIn.getDataGroup1000()/*parent*/,0+methodIn.getSi583DeStartingPos1(19) - 1/*fromOffset - (countryCode110860) */,methodIn.getSi583DeLength1(19)/*fromLen*/,105/*toOffset - (data1000) */,3/*toLen*/);
          }
//  IF 88-SI583-DE-PRESENT-1 (22)
          if ( methodIn.isSi583DePresent188(21)  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (22) : SI583-DE-LENGTH-1 (22)) TO 860-POS-ENTRY-110
              methodOut.setPosEntry110860(CFUtil.getInt(substring(methodOut.getData1000(),(methodIn.getSi583DeStartingPos1(21)-1), (methodIn.getSi583DeLength1(21) + (methodIn.getSi583DeStartingPos1(21) - 1)) )));
          }
//  IF 88-SI583-DE-PRESENT-1 (26)
          if ( methodIn.isSi583DePresent188(25)  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (26) : SI583-DE-LENGTH-1 (26)) TO 860-POS-PIN-CAPTURE-110
              methodOut.setPosPinCapture110860(CFUtil.getInt(substring(methodOut.getData1000(),(methodIn.getSi583DeStartingPos1(25)-1), (methodIn.getSi583DeLength1(25) + (methodIn.getSi583DeStartingPos1(25) - 1)) )));
          }
//  IF 88-SI583-DE-PRESENT-1 (32)
          if ( methodIn.isSi583DePresent188(31)  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (32) : SI583-DE-LENGTH-1 (32)) TO 860-ACQUIRER-ICA
              methodIn.getLogDecompressedData860().replace(methodIn.getDataGroup1000()/*parent*/,0+methodIn.getSi583DeStartingPos1(31) - 1/*fromOffset - (acquirerIca860) */,methodIn.getSi583DeLength1(31)/*fromLen*/,113/*toOffset - (data1000) */,6/*toLen*/);
          }
//  IF 88-SI583-DE-PRESENT-1 (33)
          if ( methodIn.isSi583DePresent188(32)  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (33) : SI583-DE-LENGTH-1 (33)) TO 860-FORWARD-INST-ID
              methodIn.getLogDecompressedData860().replace(methodIn.getDataGroup1000()/*parent*/,0+methodIn.getSi583DeStartingPos1(32) - 1/*fromOffset - (forwardInstId860) */,methodIn.getSi583DeLength1(32)/*fromLen*/,119/*toOffset - (data1000) */,6/*toLen*/);
          }
//  IF 88-SI583-DE-PRESENT-1 (37)
          if ( methodIn.isSi583DePresent188(36)  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (37) : SI583-DE-LENGTH-1 (37)) TO 860-RETRIEVAL-REFNO-110
              methodIn.getLogDecompressedData860().replace(methodIn.getDataGroup1000()/*parent*/,0+methodIn.getSi583DeStartingPos1(36) - 1/*fromOffset - (retrievalRefno110860) */,methodIn.getSi583DeLength1(36)/*fromLen*/,125/*toOffset - (data1000) */,12/*toLen*/);
          }
//  IF 88-SI583-DE-PRESENT-1 (38)
          if ( methodIn.isSi583DePresent188(37)  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (38) : SI583-DE-LENGTH-1 (38)) TO 860-AUTH-NUMBER
              methodIn.getLogDecompressedData860().replace(methodIn.getDataGroup1000()/*parent*/,0+methodIn.getSi583DeStartingPos1(37) - 1/*fromOffset - (authNumber860) */,methodIn.getSi583DeLength1(37)/*fromLen*/,137/*toOffset - (data1000) */,6/*toLen*/);
          }
//  IF 88-SI583-DE-PRESENT-1 (39)
          if ( methodIn.isSi583DePresent188(38)  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (39) : SI583-DE-LENGTH-1 (39)) TO 860-AUTH-RESPONSE
              methodIn.getLogDecompressedData860().replace(methodIn.getDataGroup1000()/*parent*/,0+methodIn.getSi583DeStartingPos1(38) - 1/*fromOffset - (authResponse860) */,methodIn.getSi583DeLength1(38)/*fromLen*/,143/*toOffset - (data1000) */,2/*toLen*/);
          }
//  IF 88-SI583-DE-PRESENT-1 (41)
          if ( methodIn.isSi583DePresent188(40)  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (41) : SI583-DE-LENGTH-1 (41)) TO 860-ID-TERMINAL-110
              methodIn.getLogDecompressedData860().replace(methodIn.getDataGroup1000()/*parent*/,0+methodIn.getSi583DeStartingPos1(40) - 1/*fromOffset - (idTerminal110860) */,methodIn.getSi583DeLength1(40)/*fromLen*/,145/*toOffset - (data1000) */,8/*toLen*/);
          }
//  IF 88-SI583-DE-PRESENT-1 (42)
          if ( methodIn.isSi583DePresent188(41)  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (42) : SI583-DE-LENGTH-1 (42)) TO 860-CARD-ACCEPTOR-110
              methodIn.getLogDecompressedData860().replace(methodIn.getDataGroup1000()/*parent*/,0+methodIn.getSi583DeStartingPos1(41) - 1/*fromOffset - (cardAcceptor110860) */,methodIn.getSi583DeLength1(41)/*fromLen*/,153/*toOffset - (data1000) */,15/*toLen*/);
          }
//  IF 88-SI583-DE-PRESENT-1 (43)
          if ( methodIn.isSi583DePresent188(42)  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (43) : SI583-DE-LENGTH-1 (43)) TO 860-AUTH-MRCH-NMCTST-110
              methodIn.getLogDecompressedData860().replace(methodIn.getDataGroup1000()/*parent*/,0+methodIn.getSi583DeStartingPos1(42) - 1/*fromOffset - (authMrchNmctst110860) */,methodIn.getSi583DeLength1(42)/*fromLen*/,168/*toOffset - (data1000) */,40/*toLen*/);
          }
//  IF 88-SI583-DE-PRESENT-1 (44)
          if ( methodIn.isSi583DePresent188(43)  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (44) : SI583-DE-LENGTH-1 (44)) TO 860-AUTH-ADDL-DATA
              methodIn.getLogDecompressedData860().replace(methodIn.getDataGroup1000()/*parent*/,0+methodIn.getSi583DeStartingPos1(43) - 1/*fromOffset - (authAddlData860) */,methodIn.getSi583DeLength1(43)/*fromLen*/,208/*toOffset - (data1000) */,25/*toLen*/);
          }

// *    If 88-si583-de-present-1 (48)
// *       de48 handled elsewhere
//  IF 88-SI583-DE-PRESENT-1 (49)
          if ( methodIn.isSi583DePresent188(48)  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (49) : SI583-DE-LENGTH-1 (49)) TO 860-AVS-CURR-CODE-110
              methodIn.getLogDecompressedData860().replace(methodIn.getDataGroup1000()/*parent*/,0+methodIn.getSi583DeStartingPos1(48) - 1/*fromOffset - (avsCurrCode110860) */,methodIn.getSi583DeLength1(48)/*fromLen*/,233/*toOffset - (data1000) */,3/*toLen*/);
          }
//  IF 88-SI583-DE-PRESENT-1 (50)
          if ( methodIn.isSi583DePresent188(49)  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (50) : SI583-DE-LENGTH-1 (50)) TO 860-CRNCY-CDE-SETL-110
              methodOut.setCrncyCdeSetl110860(CFUtil.getInt(substring(methodOut.getData1000(),(methodIn.getSi583DeStartingPos1(49)-1), (methodIn.getSi583DeLength1(49) + (methodIn.getSi583DeStartingPos1(49) - 1)) )));
          }
//  IF 88-SI583-DE-PRESENT-1 (51)
          if ( methodIn.isSi583DePresent188(50)  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (51) : SI583-DE-LENGTH-1 (51)) TO 860-CRNCY-CRDHLDR-110
              methodOut.setCrncyCrdhldr110860(CFUtil.getInt(substring(methodOut.getData1000(),(methodIn.getSi583DeStartingPos1(50)-1), (methodIn.getSi583DeLength1(50) + (methodIn.getSi583DeStartingPos1(50) - 1)) )));
          }
//  IF 88-SI583-DE-PRESENT-1 (63)
          if ( methodIn.isSi583DePresent188(62)  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (63) : SI583-DE-LENGTH-1 (63)) TO 860-BKNT-DATA-110
              methodIn.getLogDecompressedData860().replace(methodIn.getDataGroup1000()/*parent*/,0+methodIn.getSi583DeStartingPos1(62) - 1/*fromOffset - (bkntData110860) */,methodIn.getSi583DeLength1(62)/*fromLen*/,242/*toOffset - (data1000) */,12/*toLen*/);
          }
//  IF 88-SI583-DE-PRESENT-1 (112)
          if ( methodIn.isSi583DePresent188(111)  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (112) : SI583-DE-LENGTH-1 (112)) TO 860-DE112-110
              methodIn.getLogDecompressedData860().replace(methodIn.getDataGroup1000()/*parent*/,0+methodIn.getSi583DeStartingPos1(111) - 1/*fromOffset - (de112110860) */,methodIn.getSi583DeLength1(111)/*fromLen*/,254/*toOffset - (data1000) */,103/*toLen*/);
          }
      
      return methodOut;
      }
      /**
      * moveMti2 
      *   This method is derived from 
  *   COBOL Paragraph - 5200-MOVE-MTI-2 COBOL Cyclomatic complexity - 28
      * Input  :  

      * - si583DePresentInd2             COBOL Name: SI583-DE-PRESENT-IND-2
      * - data1000                       COBOL Name: 1000-DATA
      * - si583DeLength2                 COBOL Name: SI583-DE-LENGTH-2
      *
      * Output :  

      * - processingCode100860           COBOL Name: 860-PROCESSING-CODE-100
      * - data1000                       COBOL Name: 1000-DATA
      * - tranAmt100860                  COBOL Name: 860-TRAN-AMT-100
      * - setlAmt100860                  COBOL Name: 860-SETL-AMT-100
      * - crdhldrBillAmt100860           COBOL Name: 860-CRDHLDR-BILL-AMT-100
      * - dateTimeXmit100860             COBOL Name: 860-DATE-TIME-XMIT-100
      * - setlConvRte100860              COBOL Name: 860-SETL-CONV-RTE-100
      * - crdhldrConvRte100860           COBOL Name: 860-CRDHLDR-CONV-RTE-100
      * - cardholderExpdt860             COBOL Name: 860-CARDHOLDER-EXPDT
      * - transMmdd860                   COBOL Name: 860-TRANS-MMDD
      * - conv100Mmdd860                 COBOL Name: 860-CONV-100-MMDD
      * - merchantType860                COBOL Name: 860-MERCHANT-TYPE
      * - countryCode860                 COBOL Name: 860-COUNTRY-CODE
      * - posDeviceType860               COBOL Name: 860-POS-DEVICE-TYPE
      * - posPinCapture860               COBOL Name: 860-POS-PIN-CAPTURE
      * - bkntData860                    COBOL Name: 860-BKNT-DATA
      * - obscureEndPos800               COBOL Name: 800-OBSCURE-END-POS
      * - si583DeLength2                 COBOL Name: SI583-DE-LENGTH-2
      * - obscureData800                 COBOL Name: 800-OBSCURE-DATA
      * - trackTwoData860                COBOL Name: 860-TRACK-TWO-DATA
      * - retrievalRefno860              COBOL Name: 860-RETRIEVAL-REFNO
      * - idTerminal860                  COBOL Name: 860-ID-TERMINAL
      * - cardAcceptor860                COBOL Name: 860-CARD-ACCEPTOR
      * - authMrchNmctst860              COBOL Name: 860-AUTH-MRCH-NMCTST
      * - trackOneData860                COBOL Name: 860-TRACK-ONE-DATA
      * - currencyCode860                COBOL Name: 860-CURRENCY-CODE
      * - crncyCdeSetl100860             COBOL Name: 860-CRNCY-CDE-SETL-100
      * - crncyCrdhldr100860             COBOL Name: 860-CRNCY-CRDHLDR-100
      * - posData860                     COBOL Name: 860-POS-DATA
      * - de112100860                    COBOL Name: 860-DE112-100
      * - crncyConv100860                COBOL Name: 860-CRNCY-CONV-100
      *
      * @throws CFException
      */
      @Override
      public MoveMti2OutCtx moveMti2(MoveMti2InCtx methodIn) throws Exception {
      
// *    If 88-si583-de-present-1 (120)
// *       de120 handled elsewhere
// *    if 88-si583-de-present-1 (126)
// *       de126 handled elsewhere
Sf311010Ctx programCtx = methodIn.getSf311010Ctx();
MoveMti2OutCtx methodOut = methodIn.getMoveMti2OutCtx();
//  IF 88-SI583-DE-PRESENT-2 (3)
          if ( methodIn.isSi583DePresent288(2)  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (3) : SI583-DE-LENGTH-2 (3)) TO 860-PROCESSING-CODE-100
              try {
              methodOut.setProcessingCode100860(CFUtil.getLong(substring(methodOut.getData1000(),(methodIn.getSi583DeStartingPos2(2)-1), (methodOut.getSi583DeLength2(2) + (methodIn.getSi583DeStartingPos2(2) - 1)) )));
              } catch(NumberFormatException e) {}
          }
//  IF 88-SI583-DE-PRESENT-2 (4)
          if ( methodIn.isSi583DePresent288(3)  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (4) : SI583-DE-LENGTH-2 (4)) TO 860-TRAN-AMT-100
              try {
              methodOut.setTranAmt100860(CFUtil.getLong(substring(methodOut.getData1000(),(methodIn.getSi583DeStartingPos2(3)-1), (methodOut.getSi583DeLength2(3) + (methodIn.getSi583DeStartingPos2(3) - 1)) )));
              } catch(NumberFormatException e) {}
          }
//  IF 88-SI583-DE-PRESENT-2 (5)
          if ( methodIn.isSi583DePresent288(4)  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (5) : SI583-DE-LENGTH-2 (5)) TO 860-SETL-AMT-100
              try {
              methodOut.setSetlAmt100860(CFUtil.getLong(substring(methodOut.getData1000(),(methodIn.getSi583DeStartingPos2(4)-1), (methodOut.getSi583DeLength2(4) + (methodIn.getSi583DeStartingPos2(4) - 1)) )));
              } catch(NumberFormatException e) {}
          }
//  IF 88-SI583-DE-PRESENT-2 (6)
          if ( methodIn.isSi583DePresent288(5)  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (6) : SI583-DE-LENGTH-2 (6)) TO 860-CRDHLDR-BILL-AMT-100
              try {
              methodOut.setCrdhldrBillAmt100860(CFUtil.getLong(substring(methodOut.getData1000(),(methodIn.getSi583DeStartingPos2(5)-1), (methodOut.getSi583DeLength2(5) + (methodIn.getSi583DeStartingPos2(5) - 1)) )));
              } catch(NumberFormatException e) {}
          }
//  IF 88-SI583-DE-PRESENT-2 (7)
          if ( methodIn.isSi583DePresent288(6)  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (7) : SI583-DE-LENGTH-2 (7)) TO 860-DATE-TIME-XMIT-100
              try {
              methodOut.setDateTimeXmit100860(CFUtil.getLong(substring(methodOut.getData1000(),(methodIn.getSi583DeStartingPos2(6)-1), (methodOut.getSi583DeLength2(6) + (methodIn.getSi583DeStartingPos2(6) - 1)) )));
              } catch(NumberFormatException e) {}
          }
//  IF 88-SI583-DE-PRESENT-2 (9)
          if ( methodIn.isSi583DePresent288(8)  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (9) : SI583-DE-LENGTH-2 (9)) TO 860-SETL-CONV-RTE-100
              try {
              methodOut.setSetlConvRte100860(CFUtil.getLong(substring(methodOut.getData1000(),(methodIn.getSi583DeStartingPos2(8)-1), (methodOut.getSi583DeLength2(8) + (methodIn.getSi583DeStartingPos2(8) - 1)) )));
              } catch(NumberFormatException e) {}
          }
//  IF 88-SI583-DE-PRESENT-2 (10)
          if ( methodIn.isSi583DePresent288(9)  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (10) : SI583-DE-LENGTH-2 (10)) TO 860-CRDHLDR-CONV-RTE-100
              try {
              methodOut.setCrdhldrConvRte100860(CFUtil.getLong(substring(methodOut.getData1000(),(methodIn.getSi583DeStartingPos2(9)-1), (methodOut.getSi583DeLength2(9) + (methodIn.getSi583DeStartingPos2(9) - 1)) )));
              } catch(NumberFormatException e) {}
          }
//  IF 88-SI583-DE-PRESENT-2 (14)
          if ( methodIn.isSi583DePresent288(13)  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (14) : SI583-DE-LENGTH-2 (14)) TO 860-CARDHOLDER-EXPDT
              methodIn.getLogDecompressedData860().replace(methodIn.getDataGroup1000()/*parent*/,0+methodIn.getSi583DeStartingPos2(13) - 1/*fromOffset - (cardholderExpdt860) */,methodOut.getSi583DeLength2(13)/*fromLen*/,435/*toOffset - (data1000) */,4/*toLen*/);
          }
//  IF 88-SI583-DE-PRESENT-2 (15)
          if ( methodIn.isSi583DePresent288(14)  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (15) : SI583-DE-LENGTH-2 (15)) TO 860-TRANS-MMDD
              methodOut.setTransMmdd860(CFUtil.getInt(substring(methodOut.getData1000(),(methodIn.getSi583DeStartingPos2(14)-1), (methodOut.getSi583DeLength2(14) + (methodIn.getSi583DeStartingPos2(14) - 1)) )));
          }
//  IF 88-SI583-DE-PRESENT-2 (16)
          if ( methodIn.isSi583DePresent288(15)  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (16) : SI583-DE-LENGTH-2 (16)) TO 860-CONV-100-MMDD
              methodOut.setConv100Mmdd860(CFUtil.getInt(substring(methodOut.getData1000(),(methodIn.getSi583DeStartingPos2(15)-1), (methodOut.getSi583DeLength2(15) + (methodIn.getSi583DeStartingPos2(15) - 1)) )));
          }
//  IF 88-SI583-DE-PRESENT-2 (18)
          if ( methodIn.isSi583DePresent288(17)  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (18) : SI583-DE-LENGTH-2 (18)) TO 860-MERCHANT-TYPE
              methodOut.setMerchantType860(CFUtil.getInt(substring(methodOut.getData1000(),(methodIn.getSi583DeStartingPos2(17)-1), (methodOut.getSi583DeLength2(17) + (methodIn.getSi583DeStartingPos2(17) - 1)) )));
          }
//  IF 88-SI583-DE-PRESENT-2 (20)
          if ( methodIn.isSi583DePresent288(19)  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (20) : SI583-DE-LENGTH-2 (20)) TO 860-COUNTRY-CODE
              methodIn.getLogDecompressedData860().replace(methodIn.getDataGroup1000()/*parent*/,0+methodIn.getSi583DeStartingPos2(19) - 1/*fromOffset - (countryCode860) */,methodOut.getSi583DeLength2(19)/*fromLen*/,451/*toOffset - (data1000) */,3/*toLen*/);
          }
//  IF 88-SI583-DE-PRESENT-2 (22)
          if ( methodIn.isSi583DePresent288(21)  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (22) : SI583-DE-LENGTH-2 (22)) TO 860-POS-DEVICE-TYPE
              methodIn.getLogDecompressedData860().replace(methodIn.getDataGroup1000()/*parent*/,0+methodIn.getSi583DeStartingPos2(21) - 1/*fromOffset - (posDeviceType860) */,methodOut.getSi583DeLength2(21)/*fromLen*/,454/*toOffset - (data1000) */,3/*toLen*/);
          }
//  IF 88-SI583-DE-PRESENT-2 (26)
          if ( methodIn.isSi583DePresent288(25)  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (26) : SI583-DE-LENGTH-2 (26)) TO 860-POS-PIN-CAPTURE
              methodOut.setPosPinCapture860(CFUtil.getInt(substring(methodOut.getData1000(),(methodIn.getSi583DeStartingPos2(25)-1), (methodOut.getSi583DeLength2(25) + (methodIn.getSi583DeStartingPos2(25) - 1)) )));
          }

// **** If present we need this value for obscuring de-035 or de-045
// **** so move it now.
//  IF 88-SI583-DE-PRESENT-2 (63)
          if ( methodIn.isSi583DePresent288(62)  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (63) : SI583-DE-LENGTH-2 (63)) TO 860-BKNT-DATA
              methodIn.getLogDecompressedData860().replace(methodIn.getDataGroup1000()/*parent*/,0+methodIn.getSi583DeStartingPos2(62) - 1/*fromOffset - (bkntData860) */,methodOut.getSi583DeLength2(62)/*fromLen*/,682/*toOffset - (data1000) */,12/*toLen*/);
          }
//  IF 88-SI583-DE-PRESENT-2 (35)
          if ( methodIn.isSi583DePresent288(34)  ) { 
//  MOVE SI583-DE-LENGTH-2 (35) TO 800-OBSCURE-END-POS
              methodOut.setObscureEndPos800(methodOut.getSi583DeLength2(34));
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (35) : SI583-DE-LENGTH-2 (35)) TO 800-OBSCURE-DATA
              methodOut.setObscureData800(substring(methodOut.getData1000(),(methodIn.getSi583DeStartingPos2(34)-1), (methodOut.getSi583DeLength2(34) + (methodIn.getSi583DeStartingPos2(34) - 1)) ));
//  PERFORM 5300-OBSCURE-DATA
              obscureData(programCtx.getObscureDataInCtx());/*5300-OBSCURE-DATA*/
//  MOVE 800-OBSCURE-DATA TO 860-TRACK-TWO-DATA
              methodOut.setTrackTwoData860(methodOut.getObscureData800());
          }
//  IF 88-SI583-DE-PRESENT-2 (37)
          if ( methodIn.isSi583DePresent288(36)  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (37) : SI583-DE-LENGTH-2 (37)) TO 860-RETRIEVAL-REFNO
              methodIn.getLogDecompressedData860().replace(methodIn.getDataGroup1000()/*parent*/,0+methodIn.getSi583DeStartingPos2(36) - 1/*fromOffset - (retrievalRefno860) */,methodOut.getSi583DeLength2(36)/*fromLen*/,496/*toOffset - (data1000) */,12/*toLen*/);
          }
//  IF 88-SI583-DE-PRESENT-2 (41)
          if ( methodIn.isSi583DePresent288(40)  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (41) : SI583-DE-LENGTH-2 (41)) TO 860-ID-TERMINAL
              methodIn.getLogDecompressedData860().replace(methodIn.getDataGroup1000()/*parent*/,0+methodIn.getSi583DeStartingPos2(40) - 1/*fromOffset - (idTerminal860) */,methodOut.getSi583DeLength2(40)/*fromLen*/,508/*toOffset - (data1000) */,8/*toLen*/);
          }
//  IF 88-SI583-DE-PRESENT-2 (42)
          if ( methodIn.isSi583DePresent288(41)  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (42) : SI583-DE-LENGTH-2 (42)) TO 860-CARD-ACCEPTOR
              methodIn.getLogDecompressedData860().replace(methodIn.getDataGroup1000()/*parent*/,0+methodIn.getSi583DeStartingPos2(41) - 1/*fromOffset - (cardAcceptor860) */,methodOut.getSi583DeLength2(41)/*fromLen*/,516/*toOffset - (data1000) */,15/*toLen*/);
          }
//  IF 88-SI583-DE-PRESENT-2 (43)
          if ( methodIn.isSi583DePresent288(42)  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (43) : SI583-DE-LENGTH-2 (43)) TO 860-AUTH-MRCH-NMCTST
              methodIn.getLogDecompressedData860().replace(methodIn.getDataGroup1000()/*parent*/,0+methodIn.getSi583DeStartingPos2(42) - 1/*fromOffset - (authMrchNmctst860) */,methodOut.getSi583DeLength2(42)/*fromLen*/,531/*toOffset - (data1000) */,40/*toLen*/);
          }
//  IF 88-SI583-DE-PRESENT-2 (45)
          if ( methodIn.isSi583DePresent288(44)  ) { 
//  MOVE SI583-DE-LENGTH-2 (45) TO 800-OBSCURE-END-POS
              methodOut.setObscureEndPos800(methodOut.getSi583DeLength2(44));
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (45) : SI583-DE-LENGTH-2 (45)) TO 800-OBSCURE-DATA
              methodOut.setObscureData800(substring(methodOut.getData1000(),(methodIn.getSi583DeStartingPos2(44)-1), (methodOut.getSi583DeLength2(44) + (methodIn.getSi583DeStartingPos2(44) - 1)) ));
//  PERFORM 5300-OBSCURE-DATA
              obscureData(programCtx.getObscureDataInCtx());/*5300-OBSCURE-DATA*/
//  MOVE 800-OBSCURE-DATA TO 860-TRACK-ONE-DATA
              methodOut.setTrackOneData860(methodOut.getObscureData800());
          }

// *    If 88-si583-de-present-2 (48)
// *       de48 handled elsewhere
//  IF 88-SI583-DE-PRESENT-2 (49)
          if ( methodIn.isSi583DePresent288(48)  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (49) : SI583-DE-LENGTH-2 (49)) TO 860-CURRENCY-CODE
              methodIn.getLogDecompressedData860().replace(methodIn.getDataGroup1000()/*parent*/,0+methodIn.getSi583DeStartingPos2(48) - 1/*fromOffset - (currencyCode860) */,methodOut.getSi583DeLength2(48)/*fromLen*/,647/*toOffset - (data1000) */,3/*toLen*/);
          }
//  IF 88-SI583-DE-PRESENT-2 (50)
          if ( methodIn.isSi583DePresent288(49)  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (50) : SI583-DE-LENGTH-2 (50)) TO 860-CRNCY-CDE-SETL-100
              methodOut.setCrncyCdeSetl100860(CFUtil.getInt(substring(methodOut.getData1000(),(methodIn.getSi583DeStartingPos2(49)-1), (methodOut.getSi583DeLength2(49) + (methodIn.getSi583DeStartingPos2(49) - 1)) )));
          }
//  IF 88-SI583-DE-PRESENT-2 (51)
          if ( methodIn.isSi583DePresent288(50)  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (51) : SI583-DE-LENGTH-2 (51)) TO 860-CRNCY-CRDHLDR-100
              methodOut.setCrncyCrdhldr100860(CFUtil.getInt(substring(methodOut.getData1000(),(methodIn.getSi583DeStartingPos2(50)-1), (methodOut.getSi583DeLength2(50) + (methodIn.getSi583DeStartingPos2(50) - 1)) )));
          }
//  IF 88-SI583-DE-PRESENT-2 (61)
          if ( methodIn.isSi583DePresent288(60)  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (61) : SI583-DE-LENGTH-2 (61)) TO 860-POS-DATA
              methodIn.getLogDecompressedData860().replace(methodIn.getDataGroup1000()/*parent*/,0+methodIn.getSi583DeStartingPos2(60) - 1/*fromOffset - (posData860) */,methodOut.getSi583DeLength2(60)/*fromLen*/,656/*toOffset - (data1000) */,26/*toLen*/);
          }
//  IF 88-SI583-DE-PRESENT-2 (112)
          if ( methodIn.isSi583DePresent288(111)  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (112) : SI583-DE-LENGTH-2 (112)) TO 860-DE112-100
              methodIn.getLogDecompressedData860().replace(methodIn.getDataGroup1000()/*parent*/,0+methodIn.getSi583DeStartingPos2(111) - 1/*fromOffset - (de112100860) */,methodOut.getSi583DeLength2(111)/*fromLen*/,694/*toOffset - (data1000) */,103/*toLen*/);
          }

// *    If 88-si583-de-present-2 (120)
// *       de120 handled elsewhere
//  IF 88-SI583-DE-PRESENT-2 (125)
          if ( methodIn.isSi583DePresent288(124)  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (125) : SI583-DE-LENGTH-2 (125)) TO 860-CRNCY-CONV-100
              methodIn.getLogDecompressedData860().replace(methodIn.getDataGroup1000()/*parent*/,0+methodIn.getSi583DeStartingPos2(124) - 1/*fromOffset - (crncyConv100860) */,methodOut.getSi583DeLength2(124)/*fromLen*/,797/*toOffset - (data1000) */,78/*toLen*/);
          }
      
      return methodOut;
      }
      /**
      * obscureData 
      *   This method is derived from 
  *   COBOL Paragraph - 5300-OBSCURE-DATA COBOL Cyclomatic complexity - 17
      * Input  :  

      * - one300                         COBOL Name: 300-ONE
      * - twelve300                      COBOL Name: 300-TWELVE
      * - obscurePos800                  COBOL Name: 800-OBSCURE-POS
      * - obscureEndPos800               COBOL Name: 800-OBSCURE-END-POS
      * - obscureData800                 COBOL Name: 800-OBSCURE-DATA
      * - obscurePos2800                 COBOL Name: 800-OBSCURE-POS2
      * - eight300                       COBOL Name: 300-EIGHT
      * - max300                         COBOL Name: 300-MAX
      * - finNetworkCode860              COBOL Name: 860-FIN-NETWORK-CODE
      * - two300                         COBOL Name: 300-TWO
      *
      * Output :  

      * - obscureStartPos800             COBOL Name: 800-OBSCURE-START-POS
      * - one300                         COBOL Name: 300-ONE
      * - obscurePos800                  COBOL Name: 800-OBSCURE-POS
      * - obscurePos2800                 COBOL Name: 800-OBSCURE-POS2
      * - max300                         COBOL Name: 300-MAX
      * - obscureLgth800                 COBOL Name: 800-OBSCURE-LGTH
      * - obscureData800                 COBOL Name: 800-OBSCURE-DATA
      *
      * @throws CFException
      */
      @Override
      public ObscureDataOutCtx obscureData(ObscureDataInCtx methodIn) throws Exception {
      
// *    If 88-si583-de-present-2 (126)
// *       de120 handled elsewhere
// *
// *****************************************************************
// * 5 3 0 0 - o b s c u r e - d a t a                             *
// * we are not looking for se92 data to obscure because we do not *
// * use that data in this program.                                *
// *****************************************************************
Sf311010Ctx programCtx = methodIn.getSf311010Ctx();
ObscureDataOutCtx methodOut = methodIn.getObscureDataOutCtx();
//  MOVE 300-ONE TO 800-OBSCURE-START-POS
          methodOut.setObscureStartPos800(methodOut.getOne300());
//  PERFORM VARYING 800-OBSCURE-POS FROM 300-TWELVE BY 300-ONE UNTIL 800-OBSCURE-POS > 800-OBSCURE-END-POS
          for (methodOut.setObscurePos800(methodIn.getTwelve300()); (	( methodOut.getObscurePos800() <= methodIn.getObscureEndPos800() )) ; methodOut.setObscurePos800(methodOut.getObscurePos800() + methodOut.getOne300()) ) {
//  IF 800-OBSCURE-DATA ( 800-OBSCURE-POS : 300-ONE ) = '�' OR '^'
              if (methodOut.getObscurePos800() > 0 && methodOut.getObscureData800()[getIndex(methodOut.getObscurePos800())] == '�' || methodOut.getObscurePos800() > 0 && methodOut.getObscureData800()[getIndex(methodOut.getObscurePos800())] == '^') { 
//  ADD 300-ONE TO 800-OBSCURE-POS
                  methodOut.setObscurePos800(methodOut.getObscurePos800()+methodOut.getOne300());
//  PERFORM VARYING 800-OBSCURE-POS2 FROM 800-OBSCURE-POS BY 300-ONE UNTIL 800-OBSCURE-POS2 > 800-OBSCURE-END-POS
                  for (methodOut.setObscurePos2800(methodOut.getObscurePos800()); (	( methodOut.getObscurePos2800() <= methodIn.getObscureEndPos800() )) ; methodOut.setObscurePos2800(methodOut.getObscurePos2800() + methodOut.getOne300()) ) {
//  MOVE 800-OBSCURE-POS2 TO 800-OBSCURE-POS
                      methodOut.setObscurePos800(methodOut.getObscurePos2800());
//  IF 800-OBSCURE-DATA ( 800-OBSCURE-POS2 : 300-ONE ) = '�' OR '^'
                      if (methodOut.getObscurePos2800() > 0 && methodOut.getObscureData800()[getIndex(methodOut.getObscurePos2800())] == '�' || methodOut.getObscurePos2800() > 0 && methodOut.getObscureData800()[getIndex(methodOut.getObscurePos2800())] == '^') { 
                          methodOut.setObscureStartPos800((int)Math.abs(methodOut.getObscurePos2800() + methodIn.getEight300()));
//  MOVE 300-MAX TO 800-OBSCURE-POS2 800-OBSCURE-POS
                          methodOut.setObscurePos2800(methodOut.getMax300());
                          methodOut.setObscurePos800(methodOut.getMax300());
                      }
                  }
              }
//  ELSE
              else { 
//  IF 800-OBSCURE-DATA ( 800-OBSCURE-POS : 300-ONE ) = 'D' OR ';' OR '='
                  if (methodOut.getObscurePos800() > 0 && methodOut.getObscureData800()[getIndex(methodOut.getObscurePos800())] == 'D' || methodOut.getObscurePos800() > 0 && methodOut.getObscureData800()[getIndex(methodOut.getObscurePos800())] == ';' || methodOut.getObscurePos800() > 0 && methodOut.getObscureData800()[getIndex(methodOut.getObscurePos800())] == '=') { 
                      methodOut.setObscureStartPos800((int)Math.abs(methodOut.getObscurePos800() + methodIn.getEight300()));
//  MOVE 300-MAX TO 800-OBSCURE-POS
                      methodOut.setObscurePos800(methodOut.getMax300());
                  }
              }
          }
//  IF 800-OBSCURE-START-POS > 300-ONE
          if (	( methodOut.getObscureStartPos800() > methodOut.getOne300() )) { 
              methodOut.setObscureLgth800((int)Math.abs(methodIn.getObscureEndPos800() - methodOut.getObscureStartPos800() + methodOut.getOne300()));
//  IF 860-FIN-NETWORK-CODE = 'MCF' OR 'MGF' OR 'MNF' OR 'MPK'
//  LITERAL_MPK = 'MPK'
              if (compareChars(methodIn.getFinNetworkCode860(),CONSTANTS.LITERAL_MCF) == 0 || compareChars(methodIn.getFinNetworkCode860(),CONSTANTS.LITERAL_MGF) == 0 || compareChars(methodIn.getFinNetworkCode860(),CONSTANTS.LITERAL_MNF) == 0 || compareChars(methodIn.getFinNetworkCode860(),CONSTANTS.LITERAL_MPK) == 0) { 
//  SUBTRACT 300-TWO FROM 800-OBSCURE-LGTH
                  methodOut.setObscureLgth800(Math.abs(methodOut.getObscureLgth800()-methodIn.getTwo300()));
              }
//  MOVE ALL '*' TO 800-OBSCURE-DATA ( 800-OBSCURE-START-POS : 800-OBSCURE-LGTH )
              methodOut.setObscureData800(replace(methodOut.getObscureData800(),CONSTANTS.LITERAL_STR_,(methodOut.getObscureStartPos800()-1), (methodOut.getObscureLgth800() + (methodOut.getObscureStartPos800() - 1)) ));
          }
      
      return methodOut;
      }
      /**
      * generateControlReport 
      *   This method is derived from 
  *   COBOL Paragraph - 6000-GENERATE-CONTROL-REPORT COBOL Cyclomatic complexity - 2
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void generateControlReport(Sf311010Ctx programCtx) throws Exception {
      
// ***************************************************************
// *  This routine formats the lines for the record count by     *
// *  class report.                                              *
// ***************************************************************
//  PERFORM 6000-GENERATE-CONTROL-REPORT-SPLIT0
          generateControlReportSplit0(programCtx.getGenerateControlReportSplit0InCtx());/*6000-GENERATE-CONTROL-REPORT-SPLIT0*/
//  PERFORM 6000-GENERATE-CONTROL-REPORT-SPLIT1
          generateControlReportSplit1(programCtx.getGenerateControlReportSplit1InCtx());/*6000-GENERATE-CONTROL-REPORT-SPLIT1*/
      
      }
      /**
      * generateControlReportSplit0 
      *   This method is derived from 
  *   COBOL Paragraph - 6000-GENERATE-CONTROL-REPORT-SPLIT0 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - totalRecs400                   COBOL Name: 400-TOTAL-RECS
      * - litA300                        COBOL Name: 300-LIT-A
      * - doubleSpace300                 COBOL Name: 300-DOUBLE-SPACE
      * - lineCount400                   COBOL Name: 400-LINE-COUNT
      * - two300                         COBOL Name: 300-TWO
      * - totalIsoAuth400                COBOL Name: 400-TOTAL-ISO-AUTH
      * - totalIaDropped400              COBOL Name: 400-TOTAL-IA-DROPPED
      * - totalBadPan400                 COBOL Name: 400-TOTAL-BAD-PAN
      * - totalParseErrors400            COBOL Name: 400-TOTAL-PARSE-ERRORS
      * - one300                         COBOL Name: 300-ONE
      * - totalType2400                  COBOL Name: 400-TOTAL-TYPE-2
      * - totalType3400                  COBOL Name: 400-TOTAL-TYPE-3
      *
      * Output :  

      * - detailLogType362               COBOL Name: 362-DETAIL-LOG-TYPE
      * - detailLogClass362              COBOL Name: 362-DETAIL-LOG-CLASS
      * - detailRecordTotal362           COBOL Name: 362-DETAIL-RECORD-TOTAL
      * - totalRecs400                   COBOL Name: 400-TOTAL-RECS
      * - detailReportId362              COBOL Name: 362-DETAIL-REPORT-ID
      * - litA300                        COBOL Name: 300-LIT-A
      * - detailCarCon362                COBOL Name: 362-DETAIL-CAR-CON
      * - doubleSpace300                 COBOL Name: 300-DOUBLE-SPACE
      * - lineCount400                   COBOL Name: 400-LINE-COUNT
      * - totalIsoAuth400                COBOL Name: 400-TOTAL-ISO-AUTH
      * - totalIaDropped400              COBOL Name: 400-TOTAL-IA-DROPPED
      * - totalBadPan400                 COBOL Name: 400-TOTAL-BAD-PAN
      * - totalParseErrors400            COBOL Name: 400-TOTAL-PARSE-ERRORS
      * - totalType2400                  COBOL Name: 400-TOTAL-TYPE-2
      * - totalType3400                  COBOL Name: 400-TOTAL-TYPE-3
      *
      * @throws CFException
      */
      @Override
      public GenerateControlReportSplit0OutCtx generateControlReportSplit0(GenerateControlReportSplit0InCtx methodIn) throws Exception {
Sf311010Ctx programCtx = methodIn.getSf311010Ctx();
GenerateControlReportSplit0OutCtx methodOut = methodIn.getGenerateControlReportSplit0OutCtx();
//  PERFORM 6200-WRITE-REPORT-HEADINGS
          writeReportHeadings(programCtx.getWriteReportHeadingsInCtx());/*6200-WRITE-REPORT-HEADINGS*/

// *
//  MOVE 'TOTAL INPUT PROCESSED' TO 362-DETAIL-LOG-TYPE
          methodOut.setDetailLogType362(CONSTANTS.LITERAL_TOTAL_B8_INPUTPROCESSED);
//  MOVE SPACE TO 362-DETAIL-LOG-CLASS
          methodOut.setDetailLogClass362(CONSTANTS.SPACE);
//  MOVE 400-TOTAL-RECS TO 362-DETAIL-RECORD-TOTAL
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          methodOut.setDetailRecordTotal362(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(methodOut.getTotalRecs400()).toCharArray()));
//  MOVE 300-LIT-A TO 362-DETAIL-REPORT-ID
          methodOut.setDetailReportId362(methodOut.getLitA300());
//  MOVE 300-DOUBLE-SPACE TO 362-DETAIL-CAR-CON
          methodOut.setDetailCarCon362(methodOut.getDoubleSpace300());
//  ADD 300-TWO TO 400-LINE-COUNT
          methodOut.setLineCount400(methodOut.getLineCount400()+methodIn.getTwo300());
//  PERFORM 6100-WRITE-REPORT-DETAIL-LINE
          writeReportDetailLine(programCtx.getWriteReportDetailLineInCtx());/*6100-WRITE-REPORT-DETAIL-LINE*/

// *
//  MOVE 'ISO AUTHORIZATION IN' TO 362-DETAIL-LOG-TYPE
          methodOut.setDetailLogType362(CONSTANTS.LITERAL_ISO_B9_AUTHORIZATIONIN);
//  MOVE 'J' TO 362-DETAIL-LOG-CLASS
//  LITERAL_J = 'J'
          methodOut.setDetailLogClass362(CONSTANTS.LITERAL_J);
//  MOVE 400-TOTAL-ISO-AUTH TO 362-DETAIL-RECORD-TOTAL
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          methodOut.setDetailRecordTotal362(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(methodOut.getTotalIsoAuth400()).toCharArray()));
//  MOVE 300-LIT-A TO 362-DETAIL-REPORT-ID
          methodOut.setDetailReportId362(methodOut.getLitA300());
//  MOVE 300-DOUBLE-SPACE TO 362-DETAIL-CAR-CON
          methodOut.setDetailCarCon362(methodOut.getDoubleSpace300());
//  ADD 300-TWO TO 400-LINE-COUNT
          methodOut.setLineCount400(methodOut.getLineCount400()+methodIn.getTwo300());
//  PERFORM 6100-WRITE-REPORT-DETAIL-LINE
          writeReportDetailLine(programCtx.getWriteReportDetailLineInCtx());/*6100-WRITE-REPORT-DETAIL-LINE*/
//  MOVE ZEROS TO 362-DETAIL-RECORD-TOTAL
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          methodOut.setDetailRecordTotal362(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,CONSTANTS.ZERO_11));

// *
//  MOVE 'INAS AUTH DROPPED ' TO 362-DETAIL-LOG-TYPE
          methodOut.setDetailLogType362(CONSTANTS.LITERAL_INAS_B12_AUTHDROPPED);
//  MOVE 'J' TO 362-DETAIL-LOG-CLASS
//  LITERAL_J = 'J'
          methodOut.setDetailLogClass362(CONSTANTS.LITERAL_J);
//  MOVE 400-TOTAL-IA-DROPPED TO 362-DETAIL-RECORD-TOTAL
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          methodOut.setDetailRecordTotal362(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(methodOut.getTotalIaDropped400()).toCharArray()));
//  MOVE 300-LIT-A TO 362-DETAIL-REPORT-ID
          methodOut.setDetailReportId362(methodOut.getLitA300());
//  MOVE 300-DOUBLE-SPACE TO 362-DETAIL-CAR-CON
          methodOut.setDetailCarCon362(methodOut.getDoubleSpace300());
//  ADD 300-TWO TO 400-LINE-COUNT
          methodOut.setLineCount400(methodOut.getLineCount400()+methodIn.getTwo300());
//  PERFORM 6100-WRITE-REPORT-DETAIL-LINE
          writeReportDetailLine(programCtx.getWriteReportDetailLineInCtx());/*6100-WRITE-REPORT-DETAIL-LINE*/
//  MOVE ZEROS TO 362-DETAIL-RECORD-TOTAL
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          methodOut.setDetailRecordTotal362(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,CONSTANTS.ZERO_11));

// *
//  MOVE 'INVALID PAN DROPPED  ' TO 362-DETAIL-LOG-TYPE
          methodOut.setDetailLogType362(CONSTANTS.LITERAL_INVALID_B10_PANDROPPED);
//  MOVE SPACE TO 362-DETAIL-LOG-CLASS
          methodOut.setDetailLogClass362(CONSTANTS.SPACE);
//  MOVE 400-TOTAL-BAD-PAN TO 362-DETAIL-RECORD-TOTAL
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          methodOut.setDetailRecordTotal362(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(methodOut.getTotalBadPan400()).toCharArray()));
//  MOVE 300-LIT-A TO 362-DETAIL-REPORT-ID
          methodOut.setDetailReportId362(methodOut.getLitA300());
//  MOVE 300-DOUBLE-SPACE TO 362-DETAIL-CAR-CON
          methodOut.setDetailCarCon362(methodOut.getDoubleSpace300());
//  ADD 300-TWO TO 400-LINE-COUNT
          methodOut.setLineCount400(methodOut.getLineCount400()+methodIn.getTwo300());
//  PERFORM 6100-WRITE-REPORT-DETAIL-LINE
          writeReportDetailLine(programCtx.getWriteReportDetailLineInCtx());/*6100-WRITE-REPORT-DETAIL-LINE*/

// *
//  MOVE 'PARSE ERRORS         ' TO 362-DETAIL-LOG-TYPE
          methodOut.setDetailLogType362(CONSTANTS.LITERAL_PARSE_B16_ERRORS);
//  MOVE SPACE TO 362-DETAIL-LOG-CLASS
          methodOut.setDetailLogClass362(CONSTANTS.SPACE);
//  MOVE 400-TOTAL-PARSE-ERRORS TO 362-DETAIL-RECORD-TOTAL
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          methodOut.setDetailRecordTotal362(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(methodOut.getTotalParseErrors400()).toCharArray()));
//  MOVE 300-LIT-A TO 362-DETAIL-REPORT-ID
          methodOut.setDetailReportId362(methodOut.getLitA300());
//  MOVE SPACE TO 362-DETAIL-CAR-CON
          methodOut.setDetailCarCon362(CONSTANTS.SPACE);
//  ADD 300-ONE TO 400-LINE-COUNT
          methodOut.setLineCount400(methodOut.getLineCount400()+methodIn.getOne300());
//  PERFORM 6100-WRITE-REPORT-DETAIL-LINE
          writeReportDetailLine(programCtx.getWriteReportDetailLineInCtx());/*6100-WRITE-REPORT-DETAIL-LINE*/

// *
//  MOVE 'TOTAL TYPE J2 RECS  ' TO 362-DETAIL-LOG-TYPE
          methodOut.setDetailLogType362(CONSTANTS.LITERAL_TOTAL_B12_TYPEJ2RECS);
//  MOVE SPACE TO 362-DETAIL-LOG-CLASS
          methodOut.setDetailLogClass362(CONSTANTS.SPACE);
//  MOVE 400-TOTAL-TYPE-2 TO 362-DETAIL-RECORD-TOTAL
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          methodOut.setDetailRecordTotal362(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(methodOut.getTotalType2400()).toCharArray()));
//  MOVE 300-LIT-A TO 362-DETAIL-REPORT-ID
          methodOut.setDetailReportId362(methodOut.getLitA300());
//  MOVE SPACE TO 362-DETAIL-CAR-CON
          methodOut.setDetailCarCon362(CONSTANTS.SPACE);
//  ADD 300-ONE TO 400-LINE-COUNT
          methodOut.setLineCount400(methodOut.getLineCount400()+methodIn.getOne300());
//  PERFORM 6100-WRITE-REPORT-DETAIL-LINE
          writeReportDetailLine(programCtx.getWriteReportDetailLineInCtx());/*6100-WRITE-REPORT-DETAIL-LINE*/

// *
//  MOVE 'TOTAL TYPE J3 RECS  ' TO 362-DETAIL-LOG-TYPE
          methodOut.setDetailLogType362(CONSTANTS.LITERAL_TOTAL_B12_TYPEJ3RECS);
//  MOVE SPACE TO 362-DETAIL-LOG-CLASS
          methodOut.setDetailLogClass362(CONSTANTS.SPACE);
//  MOVE 400-TOTAL-TYPE-3 TO 362-DETAIL-RECORD-TOTAL
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          methodOut.setDetailRecordTotal362(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(methodOut.getTotalType3400()).toCharArray()));
//  MOVE 300-LIT-A TO 362-DETAIL-REPORT-ID
          methodOut.setDetailReportId362(methodOut.getLitA300());
//  MOVE SPACE TO 362-DETAIL-CAR-CON
          methodOut.setDetailCarCon362(CONSTANTS.SPACE);
//  ADD 300-ONE TO 400-LINE-COUNT
          methodOut.setLineCount400(methodOut.getLineCount400()+methodIn.getOne300());
      
      return methodOut;
      }
      /**
      * generateControlReportSplit1 
      *   This method is derived from 
  *   COBOL Paragraph - 6000-GENERATE-CONTROL-REPORT-SPLIT1 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - total0120Adv400                COBOL Name: 400-TOTAL-0120-ADV
      * - litA300                        COBOL Name: 300-LIT-A
      * - lineCount400                   COBOL Name: 400-LINE-COUNT
      * - one300                         COBOL Name: 300-ONE
      * - totalRevAdv400                 COBOL Name: 400-TOTAL-REV-ADV
      * - totalVer2400                   COBOL Name: 400-TOTAL-VER2
      * - doubleSpace300                 COBOL Name: 300-DOUBLE-SPACE
      * - two300                         COBOL Name: 300-TWO
      * - avs2RecCount400                COBOL Name: 400-AVS2-REC-COUNT
      * - tripleSpace300                 COBOL Name: 300-TRIPLE-SPACE
      * - reportRecord                   COBOL Name: REPORT-RECORD
      *
      * Output :  

      * - detailLogType362               COBOL Name: 362-DETAIL-LOG-TYPE
      * - detailLogClass362              COBOL Name: 362-DETAIL-LOG-CLASS
      * - detailRecordTotal362           COBOL Name: 362-DETAIL-RECORD-TOTAL
      * - total0120Adv400                COBOL Name: 400-TOTAL-0120-ADV
      * - detailReportId362              COBOL Name: 362-DETAIL-REPORT-ID
      * - litA300                        COBOL Name: 300-LIT-A
      * - detailCarCon362                COBOL Name: 362-DETAIL-CAR-CON
      * - lineCount400                   COBOL Name: 400-LINE-COUNT
      * - totalRevAdv400                 COBOL Name: 400-TOTAL-REV-ADV
      * - totalVer2400                   COBOL Name: 400-TOTAL-VER2
      * - doubleSpace300                 COBOL Name: 300-DOUBLE-SPACE
      * - avs2RecCount400                COBOL Name: 400-AVS2-REC-COUNT
      * - endofrptReportId366            COBOL Name: 366-ENDOFRPT-REPORT-ID
      * - endofrptCarCon366              COBOL Name: 366-ENDOFRPT-CAR-CON
      * - tripleSpace300                 COBOL Name: 300-TRIPLE-SPACE
      *
      * @throws CFException
      */
      @Override
      public GenerateControlReportSplit1OutCtx generateControlReportSplit1(GenerateControlReportSplit1InCtx methodIn) throws Exception {
Sf311010Ctx programCtx = methodIn.getSf311010Ctx();
GenerateControlReportSplit1OutCtx methodOut = methodIn.getGenerateControlReportSplit1OutCtx();
//  PERFORM 6100-WRITE-REPORT-DETAIL-LINE
          writeReportDetailLine(programCtx.getWriteReportDetailLineInCtx());/*6100-WRITE-REPORT-DETAIL-LINE*/

// *
//  MOVE 'TOTAL 0120 ADVICES  ' TO 362-DETAIL-LOG-TYPE
          methodOut.setDetailLogType362(CONSTANTS.LITERAL_TOTAL_B11_0120ADVICES);
//  MOVE SPACE TO 362-DETAIL-LOG-CLASS
          methodOut.setDetailLogClass362(CONSTANTS.SPACE);
//  MOVE 400-TOTAL-0120-ADV TO 362-DETAIL-RECORD-TOTAL
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          methodOut.setDetailRecordTotal362(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(methodOut.getTotal0120Adv400()).toCharArray()));
//  MOVE 300-LIT-A TO 362-DETAIL-REPORT-ID
          methodOut.setDetailReportId362(methodOut.getLitA300());
//  MOVE SPACE TO 362-DETAIL-CAR-CON
          methodOut.setDetailCarCon362(CONSTANTS.SPACE);
//  ADD 300-ONE TO 400-LINE-COUNT
          methodOut.setLineCount400(methodOut.getLineCount400()+methodIn.getOne300());
//  PERFORM 6100-WRITE-REPORT-DETAIL-LINE
          writeReportDetailLine(programCtx.getWriteReportDetailLineInCtx());/*6100-WRITE-REPORT-DETAIL-LINE*/

// *
//  MOVE 'TOTAL REV ADVICES   ' TO 362-DETAIL-LOG-TYPE
          methodOut.setDetailLogType362(CONSTANTS.LITERAL_TOTAL_B12_REVADVICES);
//  MOVE SPACE TO 362-DETAIL-LOG-CLASS
          methodOut.setDetailLogClass362(CONSTANTS.SPACE);
//  MOVE 400-TOTAL-REV-ADV TO 362-DETAIL-RECORD-TOTAL
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          methodOut.setDetailRecordTotal362(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(methodOut.getTotalRevAdv400()).toCharArray()));
//  MOVE 300-LIT-A TO 362-DETAIL-REPORT-ID
          methodOut.setDetailReportId362(methodOut.getLitA300());
//  MOVE SPACE TO 362-DETAIL-CAR-CON
          methodOut.setDetailCarCon362(CONSTANTS.SPACE);
//  ADD 300-ONE TO 400-LINE-COUNT
          methodOut.setLineCount400(methodOut.getLineCount400()+methodIn.getOne300());
//  PERFORM 6100-WRITE-REPORT-DETAIL-LINE
          writeReportDetailLine(programCtx.getWriteReportDetailLineInCtx());/*6100-WRITE-REPORT-DETAIL-LINE*/

// *
//  MOVE 'TOTAL VER2 CREATED   ' TO 362-DETAIL-LOG-TYPE
          methodOut.setDetailLogType362(CONSTANTS.LITERAL_TOTAL_B11_VER2CREATED);
//  MOVE SPACE TO 362-DETAIL-LOG-CLASS
          methodOut.setDetailLogClass362(CONSTANTS.SPACE);
//  MOVE 400-TOTAL-VER2 TO 362-DETAIL-RECORD-TOTAL
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          methodOut.setDetailRecordTotal362(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(methodOut.getTotalVer2400()).toCharArray()));
//  MOVE 300-LIT-A TO 362-DETAIL-REPORT-ID
          methodOut.setDetailReportId362(methodOut.getLitA300());
//  MOVE 300-DOUBLE-SPACE TO 362-DETAIL-CAR-CON
          methodOut.setDetailCarCon362(methodOut.getDoubleSpace300());
//  ADD 300-TWO TO 400-LINE-COUNT
          methodOut.setLineCount400(methodOut.getLineCount400()+methodIn.getTwo300());
//  PERFORM 6100-WRITE-REPORT-DETAIL-LINE
          writeReportDetailLine(programCtx.getWriteReportDetailLineInCtx());/*6100-WRITE-REPORT-DETAIL-LINE*/

// *
//  MOVE 'TOTAL AVS2 FOUND     ' TO 362-DETAIL-LOG-TYPE
          methodOut.setDetailLogType362(CONSTANTS.LITERAL_TOTAL_B13_AVS2FOUND);
//  MOVE SPACE TO 362-DETAIL-LOG-CLASS
          methodOut.setDetailLogClass362(CONSTANTS.SPACE);
//  MOVE 400-AVS2-REC-COUNT TO 362-DETAIL-RECORD-TOTAL
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          methodOut.setDetailRecordTotal362(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(methodOut.getAvs2RecCount400()).toCharArray()));
//  MOVE 300-LIT-A TO 362-DETAIL-REPORT-ID
          methodOut.setDetailReportId362(methodOut.getLitA300());
//  MOVE 300-DOUBLE-SPACE TO 362-DETAIL-CAR-CON
          methodOut.setDetailCarCon362(methodOut.getDoubleSpace300());
//  ADD 300-TWO TO 400-LINE-COUNT
          methodOut.setLineCount400(methodOut.getLineCount400()+methodIn.getTwo300());
//  PERFORM 6100-WRITE-REPORT-DETAIL-LINE
          writeReportDetailLine(programCtx.getWriteReportDetailLineInCtx());/*6100-WRITE-REPORT-DETAIL-LINE*/

// *
//  MOVE 300-LIT-A TO 366-ENDOFRPT-REPORT-ID
          methodOut.setEndofrptReportId366(methodOut.getLitA300());
//  MOVE 300-TRIPLE-SPACE TO 366-ENDOFRPT-CAR-CON
          methodOut.setEndofrptCarCon366(methodOut.getTripleSpace300());
//  WRITE REPORT-RECORD FROM 366-END-OF-REPORT-LINE
          logStatisticsReport.write(methodIn.getEndOfReportLine366().toCharArray()); 
          methodOut.getReportRecord().setString(CONSTANTS.LOW_VALUE_215750933);
      
      return methodOut;
      }
      /**
      * writeReportDetailLine 
      *   This method is derived from 
  *   COBOL Paragraph - 6100-WRITE-REPORT-DETAIL-LINE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - reportRecord                   COBOL Name: REPORT-RECORD
      * - lineCount400                   COBOL Name: 400-LINE-COUNT
      * - maxLines400                    COBOL Name: 400-MAX-LINES
      *
      * Output : None 

      * @throws CFException
      */
      @Override
      public WriteReportDetailLineOutCtx writeReportDetailLine(WriteReportDetailLineInCtx methodIn) throws Exception {
      
// *
// ***************************************************************
// *  This routine writes the report detail line                 *
// ***************************************************************
Sf311010Ctx programCtx = methodIn.getSf311010Ctx();
WriteReportDetailLineOutCtx methodOut = methodIn.getWriteReportDetailLineOutCtx();
//  WRITE REPORT-RECORD FROM 362-DETAIL-LINE
          logStatisticsReport.write(methodIn.getDetailLine362().toCharArray()); 
          methodOut.getReportRecord().setString(CONSTANTS.LOW_VALUE_215750933);
//  IF 400-LINE-COUNT > 400-MAX-LINES
          if (	( methodIn.getLineCount400() > methodIn.getMaxLines400() )) { 
//  PERFORM 6200-WRITE-REPORT-HEADINGS
              writeReportHeadings(programCtx.getWriteReportHeadingsInCtx());/*6200-WRITE-REPORT-HEADINGS*/
          }
      
      return methodOut;
      }
      /**
      * writeReportHeadings 
      *   This method is derived from 
  *   COBOL Paragraph - 6200-WRITE-REPORT-HEADINGS COBOL Cyclomatic complexity - 1
      * Input  :  

      * - pageCount400                   COBOL Name: 400-PAGE-COUNT
      * - one300                         COBOL Name: 300-ONE
      * - litA300                        COBOL Name: 300-LIT-A
      * - newPage300                     COBOL Name: 300-NEW-PAGE
      * - reportRecord                   COBOL Name: REPORT-RECORD
      * - doubleSpace300                 COBOL Name: 300-DOUBLE-SPACE
      * - seven300                       COBOL Name: 300-SEVEN
      *
      * Output :  

      * - pageCount400                   COBOL Name: 400-PAGE-COUNT
      * - head3Page354                   COBOL Name: 354-HEAD3-PAGE
      * - head1ReportId350               COBOL Name: 350-HEAD1-REPORT-ID
      * - litA300                        COBOL Name: 300-LIT-A
      * - head1CarCon350                 COBOL Name: 350-HEAD1-CAR-CON
      * - newPage300                     COBOL Name: 300-NEW-PAGE
      * - head2ReportId352               COBOL Name: 352-HEAD2-REPORT-ID
      * - head2CarCon352                 COBOL Name: 352-HEAD2-CAR-CON
      * - head3ReportId354               COBOL Name: 354-HEAD3-REPORT-ID
      * - head3CarCon354                 COBOL Name: 354-HEAD3-CAR-CON
      * - head4ReportId356               COBOL Name: 356-HEAD4-REPORT-ID
      * - head4CarCon356                 COBOL Name: 356-HEAD4-CAR-CON
      * - doubleSpace300                 COBOL Name: 300-DOUBLE-SPACE
      * - head5ReportId358               COBOL Name: 358-HEAD5-REPORT-ID
      * - head5CarCon358                 COBOL Name: 358-HEAD5-CAR-CON
      * - head6ReportId360               COBOL Name: 360-HEAD6-REPORT-ID
      * - head6CarCon360                 COBOL Name: 360-HEAD6-CAR-CON
      * - lineCount400                   COBOL Name: 400-LINE-COUNT
      * - seven300                       COBOL Name: 300-SEVEN
      *
      * @throws CFException
      */
      @Override
      public WriteReportHeadingsOutCtx writeReportHeadings(WriteReportHeadingsInCtx methodIn) throws Exception {
      
// *
// ***************************************************************
// *  This routine writes the report headings                    *
// ***************************************************************
Sf311010Ctx programCtx = methodIn.getSf311010Ctx();
WriteReportHeadingsOutCtx methodOut = methodIn.getWriteReportHeadingsOutCtx();
//  ADD 300-ONE TO 400-PAGE-COUNT
          methodOut.setPageCount400(methodOut.getPageCount400()+methodIn.getOne300());
//  MOVE 400-PAGE-COUNT TO 354-HEAD3-PAGE
//  FORMAT_34169195 = "ZZ9"
          methodOut.setHead3Page354(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_34169195,String.valueOf(methodOut.getPageCount400()).toCharArray()));

// *
//  MOVE 300-LIT-A TO 350-HEAD1-REPORT-ID
          methodOut.setHead1ReportId350(methodOut.getLitA300());
//  MOVE 300-NEW-PAGE TO 350-HEAD1-CAR-CON
          methodOut.setHead1CarCon350(methodOut.getNewPage300());
//  WRITE REPORT-RECORD FROM 350-HEAD-1
          logStatisticsReport.write(methodIn.getHead1350().toCharArray()); 
          methodOut.getReportRecord().setString(CONSTANTS.LOW_VALUE_215750933);

// *
//  MOVE 300-LIT-A TO 352-HEAD2-REPORT-ID
          methodOut.setHead2ReportId352(methodOut.getLitA300());
//  MOVE SPACE TO 352-HEAD2-CAR-CON
          methodOut.setHead2CarCon352(CONSTANTS.SPACE);
//  WRITE REPORT-RECORD FROM 352-HEAD-2
          logStatisticsReport.write(methodIn.getHead2352().toCharArray()); 
          methodOut.getReportRecord().setString(CONSTANTS.LOW_VALUE_215750933);

// *
//  MOVE 300-LIT-A TO 354-HEAD3-REPORT-ID
          methodOut.setHead3ReportId354(methodOut.getLitA300());
//  MOVE SPACE TO 354-HEAD3-CAR-CON
          methodOut.setHead3CarCon354(CONSTANTS.SPACE);
//  WRITE REPORT-RECORD FROM 354-HEAD-3
          logStatisticsReport.write(methodIn.getHead3354().toCharArray()); 
          methodOut.getReportRecord().setString(CONSTANTS.LOW_VALUE_215750933);

// *
//  MOVE 300-LIT-A TO 356-HEAD4-REPORT-ID
          methodOut.setHead4ReportId356(methodOut.getLitA300());
//  MOVE 300-DOUBLE-SPACE TO 356-HEAD4-CAR-CON
          methodOut.setHead4CarCon356(methodOut.getDoubleSpace300());
//  WRITE REPORT-RECORD FROM 356-HEAD-4
          logStatisticsReport.write(methodIn.getHead4356().toCharArray()); 
          methodOut.getReportRecord().setString(CONSTANTS.LOW_VALUE_215750933);

// *
//  MOVE 300-LIT-A TO 358-HEAD5-REPORT-ID
          methodOut.setHead5ReportId358(methodOut.getLitA300());
//  MOVE SPACE TO 358-HEAD5-CAR-CON
          methodOut.setHead5CarCon358(CONSTANTS.SPACE);
//  WRITE REPORT-RECORD FROM 358-HEAD-5
          logStatisticsReport.write(methodIn.getHead5358().toCharArray()); 
          methodOut.getReportRecord().setString(CONSTANTS.LOW_VALUE_215750933);

// *
//  MOVE 300-LIT-A TO 360-HEAD6-REPORT-ID
          methodOut.setHead6ReportId360(methodOut.getLitA300());
//  MOVE SPACE TO 360-HEAD6-CAR-CON
          methodOut.setHead6CarCon360(CONSTANTS.SPACE);
//  WRITE REPORT-RECORD FROM 360-HEAD-6
          logStatisticsReport.write(methodIn.getHead6360().toCharArray()); 
          methodOut.getReportRecord().setString(CONSTANTS.LOW_VALUE_215750933);

// *

// *
// ****************************************************************
// * This paragraph controls processing of de48 data. set the     *
// * address pointer to the data to be parsed.                    *
// ****************************************************************
//  MOVE 300-SEVEN TO 400-LINE-COUNT
          methodOut.setLineCount400(methodOut.getSeven300());
      
      return methodOut;
      }
      /**
      * processDe48 
      *   This method is derived from 
  *   COBOL Paragraph - 8000-PROCESS-DE48 COBOL Cyclomatic complexity - 2
      * Input  :  

      * - de48Data500                    COBOL Name: 500-DE48-DATA
      * - seprReturnCode                 COBOL Name: SEPR-RETURN-CODE
      *
      * Output :  

      * - seprDe48Sw                     COBOL Name: SEPR-DE48-SW
      * - seprDataPtr                    COBOL Name: SEPR-DATA-PTR
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public ProcessDe48OutCtx processDe48(ProcessDe48InCtx methodIn) throws Exception {
Sf311010Ctx programCtx = methodIn.getSf311010Ctx();
ProcessDe48OutCtx methodOut = methodIn.getProcessDe48OutCtx();
//  SET 88-SEPR-DE48 TO TRUE
          methodOut.setSeprDe4888True(); 
          
//  SET SEPR-DATA-PTR TO ADDRESS OF 500-DE48-DATA
          methodOut.setSeprDataPtr(setObject(methodIn.getDe48DataGroup500())); 
          
//  CALL SEPR-PTR-SI994020
          // CALL SEPR-PTR-SI994020
          	programCtx.setRc( si994020.process(programCtx.getGlobalCtx().getContext("SI994020")));
//  IF 88-SEPR-RC-0000
          if ( methodIn.isSeprRc000088()  ) { 
//  PERFORM 8020-PROCESS-DE48-SEXX
              processDe48Sexx(programCtx.getProcessDe48SexxInCtx());/*8020-PROCESS-DE48-SEXX*/
          }
      
      return methodOut;
      }
      /**
      * processDe48Sexx 
      *   This method is derived from 
  *   COBOL Paragraph - 8020-PROCESS-DE48-SEXX COBOL Cyclomatic complexity - 44
      * Input  :  

      * - seprLength                     COBOL Name: SEPR-LENGTH
      * - de48Data500                    COBOL Name: 500-DE48-DATA
      * - four300                        COBOL Name: 300-FOUR
      * - lit03300                       COBOL Name: 300-LIT-03
      * - seprOffset                     COBOL Name: SEPR-OFFSET
      * - de48Se42500                    COBOL Name: 500-DE48-SE42
      * - seven300                       COBOL Name: 300-SEVEN
      * - messageType100                 COBOL Name: 100-MESSAGE-TYPE
      * - lit02300                       COBOL Name: 300-LIT-02
      * - two300                         COBOL Name: 300-TWO
      * - de48Se24SfLen9500              COBOL Name: 500-DE48-SE24-SF-LEN-9
      * - de48Se66SfLen9500              COBOL Name: 500-DE48-SE66-SF-LEN-9
      * - sf31IsoBkntRefNo               COBOL Name: SF31-ISO-BKNT-REF-NO
      * - sf31IsoCardholderNbr           COBOL Name: SF31-ISO-CARDHOLDER-NBR
      * - lit51300                       COBOL Name: 300-LIT-51
      * - lit52300                       COBOL Name: 300-LIT-52
      * - lit82300                       COBOL Name: 300-LIT-82
      * - lit83300                       COBOL Name: 300-LIT-83
      * - lit01300                       COBOL Name: 300-LIT-01
      * - litY300                        COBOL Name: 300-LIT-Y
      * - authResponse860                COBOL Name: 860-AUTH-RESPONSE
      * - lit85300                       COBOL Name: 300-LIT-85
      *
      * Output :  

      * - sf31IsoDe48Se42Sf2Sf3          COBOL Name: SF31-ISO-DE48-SE42-SF2-SF3
      * - sf31IsoDe48Se42Len3            COBOL Name: SF31-ISO-DE48-SE42-LEN3
      * - se42Pos400                     COBOL Name: 400-SE42-POS
      * - se42Lnth400                    COBOL Name: 400-SE42-LNTH
      * - se4212500                      COBOL Name: 500-SE42-1-2
      * - sf31IsoDe48Tag42Fld1           COBOL Name: SF31-ISO-DE48-TAG42-FLD1
      * - de48Data500                    COBOL Name: 500-DE48-DATA
      * - se423500                       COBOL Name: 500-SE42-3
      * - de48Se42500                    COBOL Name: 500-DE48-SE42
      * - de48Se42SfLen500               COBOL Name: 500-DE48-SE42-SF-LEN
      * - de48Se42Sf2Sf3500              COBOL Name: 500-DE48-SE42-SF2-SF3
      * - de48Se42SfLen1500              COBOL Name: 500-DE48-SE42-SF-LEN1
      * - sf31IsoDe48Se33Sf1             COBOL Name: SF31-ISO-DE48-SE33-SF1
      * - sf31IsoDe48Se33Sf2             COBOL Name: SF31-ISO-DE48-SE33-SF2
      * - sf31IsoDe48Se33Sf5             COBOL Name: SF31-ISO-DE48-SE33-SF5
      * - sf31IsoDe48Se33Sf6             COBOL Name: SF31-ISO-DE48-SE33-SF6
      * - se33Pos400                     COBOL Name: 400-SE33-POS
      * - de48Se33SfId500                COBOL Name: 500-DE48-SE33-SF-ID
      * - de48Se33SfLen500               COBOL Name: 500-DE48-SE33-SF-LEN
      * - sf31IsoDe48Se52Tic             COBOL Name: SF31-ISO-DE48-SE52-TIC
      * - sf31IsoDe48Se24Sf1             COBOL Name: SF31-ISO-DE48-SE24-SF1
      * - sf31IsoDe48Se24Sf2             COBOL Name: SF31-ISO-DE48-SE24-SF2
      * - sf31IsoDe48Se24Sf3             COBOL Name: SF31-ISO-DE48-SE24-SF3
      * - sf31IsoDe48Se24Sf4             COBOL Name: SF31-ISO-DE48-SE24-SF4
      * - sf31IsoDe48Se43Aav             COBOL Name: SF31-ISO-DE48-SE43-AAV
      * - sf31IsoDe48Se66Sf1             COBOL Name: SF31-ISO-DE48-SE66-SF1
      * - sf31IsoDe48Se66Sf2             COBOL Name: SF31-ISO-DE48-SE66-SF2
      * - se24Pos400                     COBOL Name: 400-SE24-POS
      * - de48Se24SfId500                COBOL Name: 500-DE48-SE24-SF-ID
      * - de48Se24SfLen500               COBOL Name: 500-DE48-SE24-SF-LEN
      * - se66Pos400                     COBOL Name: 400-SE66-POS
      * - de48Se66SfId500                COBOL Name: 500-DE48-SE66-SF-ID
      * - de48Se66SfLen500               COBOL Name: 500-DE48-SE66-SF-LEN
      * - sf31IsoAvsRequestCode          COBOL Name: SF31-ISO-AVS-REQUEST-CODE
      * - sf31IsoAvsRequestTag           COBOL Name: SF31-ISO-AVS-REQUEST-TAG
      * - lit82300                       COBOL Name: 300-LIT-82
      * - sf31IsoAvsRequestLgth          COBOL Name: SF31-ISO-AVS-REQUEST-LGTH
      * - lit02300                       COBOL Name: 300-LIT-02
      * - sf31IsoAvsResponseCode         COBOL Name: SF31-ISO-AVS-RESPONSE-CODE
      * - sf31IsoAvsResponseTag          COBOL Name: SF31-ISO-AVS-RESPONSE-TAG
      * - lit83300                       COBOL Name: 300-LIT-83
      * - sf31IsoAvsResponseLgth         COBOL Name: SF31-ISO-AVS-RESPONSE-LGTH
      * - lit01300                       COBOL Name: 300-LIT-01
      * - sf31IsoDe48Tag84               COBOL Name: SF31-ISO-DE48-TAG84
      * - sf31IsoAvs2FraudAlert          COBOL Name: SF31-ISO-AVS2-FRAUD-ALERT
      * - sf31IsoAvs2RushOrder           COBOL Name: SF31-ISO-AVS2-RUSH-ORDER
      * - sf31IsoDe48Tag87Present        COBOL Name: SF31-ISO-DE48-TAG87-PRESENT
      * - sf31IsoDe48Tag88Present        COBOL Name: SF31-ISO-DE48-TAG88-PRESENT
      * - litY300                        COBOL Name: 300-LIT-Y
      * - de48Se89500                    COBOL Name: 500-DE48-SE89
      * - sf31IsoDe48Tag89Value          COBOL Name: SF31-ISO-DE48-TAG89-VALUE
      * - sf31IsoIcMagCc                 COBOL Name: SF31-ISO-IC-MAG-CC
      * - sf31IsoAvs2RespCode            COBOL Name: SF31-ISO-AVS2-RESP-CODE
      *
      * @throws CFException
      */
      @Override
      public ProcessDe48SexxOutCtx processDe48Sexx(ProcessDe48SexxInCtx methodIn) throws Exception {
      
// ****************************************************************
// * This paragraph finds ver2 values within the de48 se data.    *
// * use the offset to find the se's position in the de.          *
// ****************************************************************
Sf311010Ctx programCtx = methodIn.getSf311010Ctx();
ProcessDe48SexxOutCtx methodOut = methodIn.getProcessDe48SexxOutCtx();
//  INITIALIZE SF31-ISO-DE48-SE42-SF2-SF3 SF31-ISO-DE48-SE42-LEN3
          methodOut.setSf31IsoDe48Se42Sf2Sf3(CONSTANTS.SPACE_4 /* Fill 4 Spaces*/);
          methodOut.setSf31IsoDe48Se42Len3(CONSTANTS.SPACE_3 /* Fill 3 Spaces*/);
//  IF SEPR-LENGTH (42) > ZERO
          if (	( methodIn.getSeprLength(41) > 0 )) { 
//  INITIALIZE 400-SE42-POS 400-SE42-LNTH
              methodOut.setSe42Pos400(0);
              methodOut.setSe42Lnth400(0);
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (42) + 4 : 2) TO 500-SE42-1-2 SF31-ISO-DE48-TAG42-FLD1
              methodOut.getDe48Se42500().replace(methodIn.getDe48DataGroup500()/*parent*/,0+methodIn.getSeprOffset(41) + 4 - 1/*fromOffset - (se4212500) */,2/*fromLen*/,0/*toOffset - (de48Data500) */,2/*toLen*/);
              methodIn.getSf31IsoExtractRec().replace(methodIn.getDe48DataGroup500()/*parent*/,0+methodIn.getSeprOffset(41) + 4 - 1/*fromOffset - (sf31IsoDe48Tag42Fld1) */,2/*fromLen*/,578/*toOffset - (de48Data500) */,2/*toLen*/);
//  ADD 300-FOUR TO 400-SE42-POS
              methodOut.setSe42Pos400(methodOut.getSe42Pos400()+methodIn.getFour300());
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (42) + 2 : 2) TO 400-SE42-LNTH
              methodOut.setSe42Lnth400(CFUtil.getInt(substring(methodOut.getDe48Data500(),(methodIn.getSeprOffset(41) + 2-1), (methodIn.getSeprOffset(41) + 2 + 1) )));

// ******************************************************************
// * Check length of se42 sf1 to find sf1 3rd byte is present or not*
// ******************************************************************
//  IF 500-DE48-DATA ( SEPR-OFFSET (42) + 2 : 2) EQUAL 300-LIT-03
              if (Field.compareChar(methodOut.getDe48Data500() , methodIn.getLit03300() , ( (methodIn.getSeprOffset(41) + 2 - 1) /*start*/ ), 2 /*left len*/ , 2 /*right len*/)) { 
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (42) + 6 : 1) TO 500-SE42-3
                  methodOut.getDe48Se42500().replace(methodIn.getDe48DataGroup500()/*parent*/,0+methodIn.getSeprOffset(41) + 6 - 1/*fromOffset - (se423500) */,1/*fromLen*/,2/*toOffset - (de48Data500) */,1/*toLen*/);
              }
//  ELSE
              else { 
//  MOVE SPACE TO 500-SE42-3
                  methodOut.setSe423500(CONSTANTS.SPACE);
              }
              // MOVE 500-DE48-SE42 TO SF31-ISO-DE48-SE42-LEN3
              methodOut.setSf31IsoDe48Se42Len3(methodOut.getDe48Se42500().toCharArray());
              methodOut.setSe42Pos400((int)Math.abs(methodOut.getSe42Lnth400() + methodOut.getSe42Pos400()));

// ******************************************************************
// * Check whether length of se42 is greater than seven if greater, *
// * then populate sf2 and sf3 when it is in o110 message otherwise *
// * populate spaces.                                               *
// ******************************************************************
//  IF SEPR-LENGTH (42) GREATER 300-SEVEN AND ( 88-100-MTI1-0110 OR 88-100-MTI2-0110 )
              if (	( methodIn.getSeprLength(41) > methodIn.getSeven300() ) && ( methodIn.isMti1011088100()   ||  methodIn.isMti2011088100()  )) { 
//  IF 500-DE48-DATA ( SEPR-OFFSET (42) + 400-SE42-POS : 2) EQUAL 300-LIT-02
                  if (Field.compareChar(methodOut.getDe48Data500() , methodOut.getLit02300() , ( (methodIn.getSeprOffset(41) + methodOut.getSe42Pos400() - 1) /*start*/ ), 2 /*left len*/ , 2 /*right len*/)) { 
//  ADD 300-TWO TO 400-SE42-POS
                      methodOut.setSe42Pos400(methodOut.getSe42Pos400()+methodIn.getTwo300());
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (42) + 400-SE42-POS : 2) TO 500-DE48-SE42-SF-LEN
                      methodOut.setDe48Se42SfLen500(CFUtil.getInt(substring(methodOut.getDe48Data500(),(methodIn.getSeprOffset(41) + methodOut.getSe42Pos400()-1), (methodIn.getSeprOffset(41) + methodOut.getSe42Pos400() + 1) )));
//  ADD 300-TWO TO 400-SE42-POS
                      methodOut.setSe42Pos400(methodOut.getSe42Pos400()+methodIn.getTwo300());
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (42) + 400-SE42-POS : 500-DE48-SE42-SF-LEN ) TO 500-DE48-SE42-SF2-SF3 (1 : 500-DE48-SE42-SF-LEN )
                      methodOut.setDe48Se42Sf2Sf3500(replace(methodOut.getDe48Se42Sf2Sf3500(),substring(methodOut.getDe48Data500(),(methodIn.getSeprOffset(41) + methodOut.getSe42Pos400()-1), (methodOut.getDe48Se42SfLen500() + (methodIn.getSeprOffset(41) + methodOut.getSe42Pos400() - 1)) ),0,methodOut.getDe48Se42SfLen500()));
//  ADD 500-DE48-SE42-SF-LEN TO 400-SE42-POS
                      methodOut.setSe42Pos400(methodOut.getSe42Pos400()+methodOut.getDe48Se42SfLen500());
                  }
//  IF 500-DE48-DATA ( SEPR-OFFSET (42) + 400-SE42-POS : 2) EQUAL 300-LIT-03
                  if (Field.compareChar(methodOut.getDe48Data500() , methodIn.getLit03300() , ( (methodIn.getSeprOffset(41) + methodOut.getSe42Pos400() - 1) /*start*/ ), 2 /*left len*/ , 2 /*right len*/)) { 
//  ADD 300-TWO TO 400-SE42-POS
                      methodOut.setSe42Pos400(methodOut.getSe42Pos400()+methodIn.getTwo300());
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (42) + 400-SE42-POS : 2) TO 500-DE48-SE42-SF-LEN1
                      methodOut.setDe48Se42SfLen1500(CFUtil.getInt(substring(methodOut.getDe48Data500(),(methodIn.getSeprOffset(41) + methodOut.getSe42Pos400()-1), (methodIn.getSeprOffset(41) + methodOut.getSe42Pos400() + 1) )));
//  ADD 300-TWO TO 400-SE42-POS
                      methodOut.setSe42Pos400(methodOut.getSe42Pos400()+methodIn.getTwo300());
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (42) + 400-SE42-POS : 500-DE48-SE42-SF-LEN1 ) TO 500-DE48-SE42-SF2-SF3 ( 500-DE48-SE42-SF-LEN + 1 : 500-DE48-SE42-SF-LEN1 )
                      methodOut.setDe48Se42Sf2Sf3500(replace(methodOut.getDe48Se42Sf2Sf3500(),substring(methodOut.getDe48Data500(),(methodIn.getSeprOffset(41) + methodOut.getSe42Pos400()-1), (methodOut.getDe48Se42SfLen1500() + (methodIn.getSeprOffset(41) + methodOut.getSe42Pos400() - 1)) ),(methodOut.getDe48Se42SfLen500() + 1-1), (methodOut.getDe48Se42SfLen1500() + (methodOut.getDe48Se42SfLen500() + 1 - 1)) ));
                  }
//  MOVE 500-DE48-SE42-SF2-SF3 TO SF31-ISO-DE48-SE42-SF2-SF3
                  methodOut.setSf31IsoDe48Se42Sf2Sf3(methodOut.getDe48Se42Sf2Sf3500());
              }
          }
//  INITIALIZE SF31-ISO-DE48-SE33-SF1 SF31-ISO-DE48-SE33-SF2 SF31-ISO-DE48-SE33-SF5 SF31-ISO-DE48-SE33-SF6
          methodOut.setSf31IsoDe48Se33Sf1(CONSTANTS.SPACE /* Fill 1 Spaces*/);
          methodOut.setSf31IsoDe48Se33Sf2(CONSTANTS.SPACE_19 /* Fill 19 Spaces*/);
          methodOut.setSf31IsoDe48Se33Sf5(CONSTANTS.SPACE_2 /* Fill 2 Spaces*/);
          methodOut.setSf31IsoDe48Se33Sf6(CONSTANTS.SPACE_11 /* Fill 11 Spaces*/);
//  IF SEPR-LENGTH (33) > ZERO
          if (	( methodIn.getSeprLength(32) > 0 )) { 
//  INITIALIZE 400-SE33-POS
              methodOut.setSe33Pos400(0);
//  PERFORM UNTIL 400-SE33-POS GREATER THAN SEPR-LENGTH (33)
              while ((	( methodOut.getSe33Pos400() <= methodIn.getSeprLength(32) ))) {
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (33) + 400-SE33-POS : 2) TO 500-DE48-SE33-SF-ID
                  methodOut.setDe48Se33SfId500(substring(methodOut.getDe48Data500(),(methodIn.getSeprOffset(32) + methodOut.getSe33Pos400()-1), (methodIn.getSeprOffset(32) + methodOut.getSe33Pos400() + 1) ));
//  ADD 300-TWO TO 400-SE33-POS
                  methodOut.setSe33Pos400(methodOut.getSe33Pos400()+methodIn.getTwo300());
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (33) + 400-SE33-POS : 2) TO 500-DE48-SE33-SF-LEN
                  methodOut.setDe48Se33SfLen500(CFUtil.getInt(substring(methodOut.getDe48Data500(),(methodIn.getSeprOffset(32) + methodOut.getSe33Pos400()-1), (methodIn.getSeprOffset(32) + methodOut.getSe33Pos400() + 1) )));
//  ADD 300-TWO TO 400-SE33-POS
                  methodOut.setSe33Pos400(methodOut.getSe33Pos400()+methodIn.getTwo300());
//  EVALUATE TRUE
                  if  ( methodOut.isDe48Se33Sf0188500()  ) { 
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (33) + 400-SE33-POS : 500-DE48-SE33-SF-LEN ) TO SF31-ISO-DE48-SE33-SF1
                      methodIn.getSf31IsoExtractRec().replace(methodIn.getDe48DataGroup500()/*parent*/,0+methodIn.getSeprOffset(32) + methodOut.getSe33Pos400() - 1/*fromOffset - (sf31IsoDe48Se33Sf1) */,methodOut.getDe48Se33SfLen500()/*fromLen*/,838/*toOffset - (de48Data500) */,1/*toLen*/);
                  }
                  else if  ( methodOut.isDe48Se33Sf0288500()  ) { 
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (33) + 400-SE33-POS : 500-DE48-SE33-SF-LEN ) TO SF31-ISO-DE48-SE33-SF2
                      methodIn.getSf31IsoExtractRec().replace(methodIn.getDe48DataGroup500()/*parent*/,0+methodIn.getSeprOffset(32) + methodOut.getSe33Pos400() - 1/*fromOffset - (sf31IsoDe48Se33Sf2) */,methodOut.getDe48Se33SfLen500()/*fromLen*/,839/*toOffset - (de48Data500) */,19/*toLen*/);
                  }
                  else if  ( methodOut.isDe48Se33Sf0588500()  ) { 
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (33) + 400-SE33-POS : 500-DE48-SE33-SF-LEN ) TO SF31-ISO-DE48-SE33-SF5
                      methodIn.getSf31IsoExtractRec().replace(methodIn.getDe48DataGroup500()/*parent*/,0+methodIn.getSeprOffset(32) + methodOut.getSe33Pos400() - 1/*fromOffset - (sf31IsoDe48Se33Sf5) */,methodOut.getDe48Se33SfLen500()/*fromLen*/,858/*toOffset - (de48Data500) */,2/*toLen*/);
                  }
                  else if  ( methodOut.isDe48Se33Sf0688500()  ) { 
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (33) + 400-SE33-POS : 500-DE48-SE33-SF-LEN ) TO SF31-ISO-DE48-SE33-SF6
                      methodIn.getSf31IsoExtractRec().replace(methodIn.getDe48DataGroup500()/*parent*/,0+methodIn.getSeprOffset(32) + methodOut.getSe33Pos400() - 1/*fromOffset - (sf31IsoDe48Se33Sf6) */,methodOut.getDe48Se33SfLen500()/*fromLen*/,860/*toOffset - (de48Data500) */,11/*toLen*/);
                  }
                  else   { 
                      ;
                  }
//  ADD 500-DE48-SE33-SF-LEN TO 400-SE33-POS
                  methodOut.setSe33Pos400(methodOut.getSe33Pos400()+methodOut.getDe48Se33SfLen500());
              }
          }
//  IF SEPR-LENGTH (52) > ZERO
          if (	( methodIn.getSeprLength(51) > 0 )) { 
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (52) : 2) TO SF31-ISO-DE48-SE52-TIC
              methodIn.getSf31IsoExtractRec().replace(methodIn.getDe48DataGroup500()/*parent*/,0+methodIn.getSeprOffset(51) - 1/*fromOffset - (sf31IsoDe48Se52Tic) */,2/*fromLen*/,871/*toOffset - (de48Data500) */,2/*toLen*/);
          }
//  ELSE
          else { 
//  MOVE SPACE TO SF31-ISO-DE48-SE52-TIC
              methodOut.setSf31IsoDe48Se52Tic(CONSTANTS.SPACE_2);
          }
//  INITIALIZE SF31-ISO-DE48-SE24-SF1 SF31-ISO-DE48-SE24-SF2 SF31-ISO-DE48-SE24-SF3 SF31-ISO-DE48-SE24-SF4 SF31-ISO-DE48-SE43-AAV SF31-ISO-DE48-SE66-SF1 SF31-ISO-DE48-SE66-SF2
          methodOut.setSf31IsoDe48Se24Sf1(CONSTANTS.SPACE_5 /* Fill 5 Spaces*/);
          methodOut.setSf31IsoDe48Se24Sf2(CONSTANTS.SPACE_3 /* Fill 3 Spaces*/);
          methodOut.setSf31IsoDe48Se24Sf3(CONSTANTS.SPACE_3 /* Fill 3 Spaces*/);
          methodOut.setSf31IsoDe48Se24Sf4(CONSTANTS.SPACE_3 /* Fill 3 Spaces*/);
          methodOut.setSf31IsoDe48Se43Aav(CONSTANTS.SPACE_32 /* Fill 32 Spaces*/);
          methodOut.setSf31IsoDe48Se66Sf1(CONSTANTS.SPACE /* Fill 1 Spaces*/);
          methodOut.setSf31IsoDe48Se66Sf2(CONSTANTS.SPACE_36 /* Fill 36 Spaces*/);
//  IF SEPR-LENGTH (24) GREATER ZERO
          if (	( methodIn.getSeprLength(23) > 0 )) { 
//  INITIALIZE 400-SE24-POS
              methodOut.setSe24Pos400((short)0);
//  PERFORM UNTIL 400-SE24-POS GREATER THAN SEPR-LENGTH (24)
              while ((	( methodOut.getSe24Pos400() <= methodIn.getSeprLength(23) ) )) {
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (24) + 400-SE24-POS : 2) TO 500-DE48-SE24-SF-ID
                  methodOut.setDe48Se24SfId500(substring(methodOut.getDe48Data500(),(methodIn.getSeprOffset(23) + methodOut.getSe24Pos400()-1), (methodIn.getSeprOffset(23) + methodOut.getSe24Pos400() + 1) ));
//  ADD 300-TWO TO 400-SE24-POS
                  methodOut.setSe24Pos400( (short) (methodOut.getSe24Pos400()+(short) methodIn.getTwo300()));
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (24) + 400-SE24-POS : 2) TO 500-DE48-SE24-SF-LEN
                  methodIn.getDe48Se24SfLenGroup500().replace(methodIn.getDe48DataGroup500()/*parent*/,0+methodIn.getSeprOffset(23) + methodOut.getSe24Pos400() - 1/*fromOffset - (de48Se24SfLen500) */,2/*fromLen*/,0/*toOffset - (de48Data500) */,2/*toLen*/);
//  ADD 300-TWO TO 400-SE24-POS
                  methodOut.setSe24Pos400( (short) (methodOut.getSe24Pos400()+(short) methodIn.getTwo300()));
//  EVALUATE TRUE
                  if  ( methodOut.isDe48Se24Sf0188500()  ) { 
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (24) + 400-SE24-POS : 500-DE48-SE24-SF-LEN-9 ) TO SF31-ISO-DE48-SE24-SF1
                      methodIn.getSf31IsoExtractRec().replace(methodIn.getDe48DataGroup500()/*parent*/,0+methodIn.getSeprOffset(23) + methodOut.getSe24Pos400() - 1/*fromOffset - (sf31IsoDe48Se24Sf1) */,methodIn.getDe48Se24SfLen9500()/*fromLen*/,721/*toOffset - (de48Data500) */,5/*toLen*/);
                  }
                  else if  ( methodOut.isDe48Se24Sf0288500()  ) { 
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (24) + 400-SE24-POS : 500-DE48-SE24-SF-LEN-9 ) TO SF31-ISO-DE48-SE24-SF2
                      methodIn.getSf31IsoExtractRec().replace(methodIn.getDe48DataGroup500()/*parent*/,0+methodIn.getSeprOffset(23) + methodOut.getSe24Pos400() - 1/*fromOffset - (sf31IsoDe48Se24Sf2) */,methodIn.getDe48Se24SfLen9500()/*fromLen*/,726/*toOffset - (de48Data500) */,3/*toLen*/);
                  }
                  else if  ( methodOut.isDe48Se24Sf0388500()  ) { 
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (24) + 400-SE24-POS : 500-DE48-SE24-SF-LEN-9 ) TO SF31-ISO-DE48-SE24-SF3
                      methodIn.getSf31IsoExtractRec().replace(methodIn.getDe48DataGroup500()/*parent*/,0+methodIn.getSeprOffset(23) + methodOut.getSe24Pos400() - 1/*fromOffset - (sf31IsoDe48Se24Sf3) */,methodIn.getDe48Se24SfLen9500()/*fromLen*/,729/*toOffset - (de48Data500) */,3/*toLen*/);
                  }
                  else if  ( methodOut.isDe48Se24Sf0488500()  ) { 
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (24) + 400-SE24-POS : 500-DE48-SE24-SF-LEN-9 ) TO SF31-ISO-DE48-SE24-SF4
                      methodIn.getSf31IsoExtractRec().replace(methodIn.getDe48DataGroup500()/*parent*/,0+methodIn.getSeprOffset(23) + methodOut.getSe24Pos400() - 1/*fromOffset - (sf31IsoDe48Se24Sf4) */,methodIn.getDe48Se24SfLen9500()/*fromLen*/,732/*toOffset - (de48Data500) */,3/*toLen*/);
                  }
                  else   { 
                      ;
                  }
//  ADD 500-DE48-SE24-SF-LEN-9 TO 400-SE24-POS
                  methodOut.setSe24Pos400( (short) (methodOut.getSe24Pos400()+(short) methodIn.getDe48Se24SfLen9500()));
              }
          }
//  ELSE
          else { 
//  MOVE SPACES TO SF31-ISO-DE48-SE24-SF1
              methodOut.setSf31IsoDe48Se24Sf1(CONSTANTS.SPACE_5);
//  MOVE SPACES TO SF31-ISO-DE48-SE24-SF2
              methodOut.setSf31IsoDe48Se24Sf2(CONSTANTS.SPACE_3);
//  MOVE SPACES TO SF31-ISO-DE48-SE24-SF3
              methodOut.setSf31IsoDe48Se24Sf3(CONSTANTS.SPACE_3);
//  MOVE SPACES TO SF31-ISO-DE48-SE24-SF4
              methodOut.setSf31IsoDe48Se24Sf4(CONSTANTS.SPACE_3);
          }
//  IF SEPR-LENGTH (43) GREATER ZERO
          if (	( methodIn.getSeprLength(42) > 0 )) { 
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (43) : SEPR-LENGTH (43)) TO SF31-ISO-DE48-SE43-AAV
              methodIn.getSf31IsoExtractRec().replace(methodIn.getDe48DataGroup500()/*parent*/,0+methodIn.getSeprOffset(42) - 1/*fromOffset - (sf31IsoDe48Se43Aav) */,methodIn.getSeprLength(42)/*fromLen*/,735/*toOffset - (de48Data500) */,32/*toLen*/);
          }
//  ELSE
          else { 
//  MOVE SPACE TO SF31-ISO-DE48-SE43-AAV
              methodOut.setSf31IsoDe48Se43Aav(CONSTANTS.SPACE_32);
          }
//  IF SEPR-LENGTH (66) GREATER ZERO
          if (	( methodIn.getSeprLength(65) > 0 )) { 
//  INITIALIZE 400-SE66-POS
              methodOut.setSe66Pos400((short)0);
//  PERFORM UNTIL 400-SE66-POS GREATER THAN SEPR-LENGTH (66)
              while ((	( methodOut.getSe66Pos400() <= methodIn.getSeprLength(65) ) )) {
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (66) + 400-SE66-POS : 2) TO 500-DE48-SE66-SF-ID
                  methodOut.setDe48Se66SfId500(substring(methodOut.getDe48Data500(),(methodIn.getSeprOffset(65) + methodOut.getSe66Pos400()-1), (methodIn.getSeprOffset(65) + methodOut.getSe66Pos400() + 1) ));
//  ADD 300-TWO TO 400-SE66-POS
                  methodOut.setSe66Pos400( (short) (methodOut.getSe66Pos400()+(short) methodIn.getTwo300()));
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (66) + 400-SE66-POS : 2) TO 500-DE48-SE66-SF-LEN
                  methodIn.getDe48Se66SfLenGroup500().replace(methodIn.getDe48DataGroup500()/*parent*/,0+methodIn.getSeprOffset(65) + methodOut.getSe66Pos400() - 1/*fromOffset - (de48Se66SfLen500) */,2/*fromLen*/,0/*toOffset - (de48Data500) */,2/*toLen*/);
//  ADD 300-TWO TO 400-SE66-POS
                  methodOut.setSe66Pos400( (short) (methodOut.getSe66Pos400()+(short) methodIn.getTwo300()));
//  EVALUATE TRUE
                  if  ( methodOut.isDe48Se66Sf0188500()  ) { 
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (66) + 400-SE66-POS : 500-DE48-SE66-SF-LEN-9 ) TO SF31-ISO-DE48-SE66-SF1
                      methodIn.getSf31IsoExtractRec().replace(methodIn.getDe48DataGroup500()/*parent*/,0+methodIn.getSeprOffset(65) + methodOut.getSe66Pos400() - 1/*fromOffset - (sf31IsoDe48Se66Sf1) */,methodIn.getDe48Se66SfLen9500()/*fromLen*/,767/*toOffset - (de48Data500) */,1/*toLen*/);
                  }
                  else if  ( methodOut.isDe48Se66Sf0288500()  ) { 
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (66) + 400-SE66-POS : 500-DE48-SE66-SF-LEN-9 ) TO SF31-ISO-DE48-SE66-SF2
                      methodIn.getSf31IsoExtractRec().replace(methodIn.getDe48DataGroup500()/*parent*/,0+methodIn.getSeprOffset(65) + methodOut.getSe66Pos400() - 1/*fromOffset - (sf31IsoDe48Se66Sf2) */,methodIn.getDe48Se66SfLen9500()/*fromLen*/,768/*toOffset - (de48Data500) */,36/*toLen*/);
                  }
                  else   { 
                      ;
                  }
//  IF 500-DE48-SE66-SF-LEN-9 GREATER ZERO
                  if (	( methodIn.getDe48Se66SfLen9500() > 0 )) { 
//  ADD 500-DE48-SE66-SF-LEN-9 TO 400-SE66-POS
                      methodOut.setSe66Pos400( (short) (methodOut.getSe66Pos400()+(short) methodIn.getDe48Se66SfLen9500()));
                  }
//  ELSE
                  else { 
//  DISPLAY 'DE48-SE66-SF-LEN-9 IS SPACE:' SF31-ISO-BKNT-REF-NO SPACE SF31-ISO-CARDHOLDER-NBR (1 : 11)
                      logger.info("DE48-SE66-SF-LEN-9 IS SPACE:{}{}", new String(methodIn.getSf31IsoBkntRefNo()), new String(substring(methodIn.getSf31IsoCardholderNbr(),0,11))); 
                  }
              }
          }
//  ELSE
          else { 
//  MOVE SPACES TO SF31-ISO-DE48-SE66-SF1
              methodOut.setSf31IsoDe48Se66Sf1(CONSTANTS.SPACE);
//  MOVE SPACES TO SF31-ISO-DE48-SE66-SF2
              methodOut.setSf31IsoDe48Se66Sf2(CONSTANTS.SPACE_36);
          }
//  IF SEPR-LENGTH (82) > ZERO
          if (	( methodIn.getSeprLength(81) > 0 )) { 
//  IF 500-DE48-DATA ( SEPR-OFFSET (82) : 2) = 300-LIT-51 OR 300-LIT-52
              if (Field.compareChar(methodOut.getDe48Data500() , methodIn.getLit51300() , ( (methodIn.getSeprOffset(81) - 1) /*start*/ ), 2 /*left len*/ , 2 /*right len*/) || Field.compareChar(methodOut.getDe48Data500() , methodIn.getLit52300() , ( (methodIn.getSeprOffset(81) - 1) /*start*/ ), 2 /*left len*/ , 2 /*right len*/)) { 
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (82) : 2) TO SF31-ISO-AVS-REQUEST-CODE
                  methodIn.getSf31IsoExtractRec().replace(methodIn.getDe48DataGroup500()/*parent*/,0+methodIn.getSeprOffset(81) - 1/*fromOffset - (sf31IsoAvsRequestCode) */,2/*fromLen*/,201/*toOffset - (de48Data500) */,2/*toLen*/);
//  MOVE 300-LIT-82 TO SF31-ISO-AVS-REQUEST-TAG
                  methodOut.setSf31IsoAvsRequestTag(methodOut.getLit82300());
//  MOVE 300-LIT-02 TO SF31-ISO-AVS-REQUEST-LGTH
                  methodOut.setSf31IsoAvsRequestLgth(methodOut.getLit02300());
              }
          }
//  IF SEPR-LENGTH (83) > ZERO
          if (	( methodIn.getSeprLength(82) > 0 )) { 
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (83) : 1) TO SF31-ISO-AVS-RESPONSE-CODE
              methodIn.getSf31IsoExtractRec().replace(methodIn.getDe48DataGroup500()/*parent*/,0+methodIn.getSeprOffset(82) - 1/*fromOffset - (sf31IsoAvsResponseCode) */,1/*fromLen*/,207/*toOffset - (de48Data500) */,1/*toLen*/);
//  MOVE 300-LIT-83 TO SF31-ISO-AVS-RESPONSE-TAG
              methodOut.setSf31IsoAvsResponseTag(methodOut.getLit83300());
//  MOVE 300-LIT-01 TO SF31-ISO-AVS-RESPONSE-LGTH
              methodOut.setSf31IsoAvsResponseLgth(methodOut.getLit01300());
          }
//  IF SEPR-LENGTH (84) > ZERO
          if (	( methodIn.getSeprLength(83) > 0 )) { 
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (84) : 2) TO SF31-ISO-DE48-TAG84
              methodIn.getSf31IsoExtractRec().replace(methodIn.getDe48DataGroup500()/*parent*/,0+methodIn.getSeprOffset(83) - 1/*fromOffset - (sf31IsoDe48Tag84) */,2/*fromLen*/,620/*toOffset - (de48Data500) */,2/*toLen*/);
          }
//  IF SEPR-LENGTH (85) > ZERO
          if (	( methodIn.getSeprLength(84) > 0 )) { 
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (85) : 1) TO SF31-ISO-AVS2-FRAUD-ALERT
              methodIn.getSf31IsoExtractRec().replace(methodIn.getDe48DataGroup500()/*parent*/,0+methodIn.getSeprOffset(84) - 1/*fromOffset - (sf31IsoAvs2FraudAlert) */,1/*fromLen*/,511/*toOffset - (de48Data500) */,1/*toLen*/);
          }
//  IF SEPR-LENGTH (86) > ZERO
          if (	( methodIn.getSeprLength(85) > 0 )) { 
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (86) : 1) TO SF31-ISO-AVS2-RUSH-ORDER
              methodIn.getSf31IsoExtractRec().replace(methodIn.getDe48DataGroup500()/*parent*/,0+methodIn.getSeprOffset(85) - 1/*fromOffset - (sf31IsoAvs2RushOrder) */,1/*fromLen*/,512/*toOffset - (de48Data500) */,1/*toLen*/);
          }
//  IF SEPR-LENGTH (87) > ZERO
          if (	( methodIn.getSeprLength(86) > 0 )) { 
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (87) : 1) TO SF31-ISO-DE48-TAG87-PRESENT
              methodIn.getSf31IsoExtractRec().replace(methodIn.getDe48DataGroup500()/*parent*/,0+methodIn.getSeprOffset(86) - 1/*fromOffset - (sf31IsoDe48Tag87Present) */,1/*fromLen*/,346/*toOffset - (de48Data500) */,1/*toLen*/);
          }
//  ELSE
          else { 
//  MOVE SPACE TO SF31-ISO-DE48-TAG87-PRESENT
              methodOut.setSf31IsoDe48Tag87Present(CONSTANTS.SPACE);
          }
//  IF SEPR-LENGTH (88) > ZERO
          if (	( methodIn.getSeprLength(87) > 0 )) { 
//  IF 500-DE48-DATA ( SEPR-OFFSET (88) : 1) = 300-LIT-Y
              if (Field.compareChar(methodOut.getDe48Data500() , methodOut.getLitY300() , ( (methodIn.getSeprOffset(87) - 1) /*start*/ ), 1 /*left len*/ , 1 /*right len*/)) { 
//  MOVE 300-LIT-Y TO SF31-ISO-DE48-TAG88-PRESENT
                  methodOut.setSf31IsoDe48Tag88Present(methodOut.getLitY300());
              }
          }
//  IF SEPR-LENGTH (89) > ZERO
          if (	( methodIn.getSeprLength(88) > 0 )) { 
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (89) : 1) TO 500-DE48-SE89
              methodOut.setDe48Se89500(substring(methodOut.getDe48Data500(),(methodIn.getSeprOffset(88)-1), (methodIn.getSeprOffset(88) + 0) ));
//  IF 88-500-MAG-LGTH
              if ( methodOut.isMagLgth88500()  ) { 
//  MOVE 500-DE48-SE89 TO SF31-ISO-DE48-TAG89-VALUE SF31-ISO-IC-MAG-CC
                  methodOut.setSf31IsoDe48Tag89Value(methodOut.getDe48Se89500());
                  methodOut.setSf31IsoIcMagCc(methodOut.getDe48Se89500());
              }
          }
//  IF SEPR-LENGTH (93) > ZERO
          if (	( methodIn.getSeprLength(92) > 0 )) { 
//  IF 860-AUTH-RESPONSE = 300-LIT-85
              if (		compareChars(methodIn.getAuthResponse860(),methodIn.getLit85300()) == 0 ) { 
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (93) : 2) TO SF31-ISO-AVS2-RESP-CODE
                  methodIn.getSf31IsoExtractRec().replace(methodIn.getDe48DataGroup500()/*parent*/,0+methodIn.getSeprOffset(92) - 1/*fromOffset - (sf31IsoAvs2RespCode) */,2/*fromLen*/,499/*toOffset - (de48Data500) */,2/*toLen*/);
              }
          }
      
      return methodOut;
      }
      /**
      * processDe120 
      *   This method is derived from 
  *   COBOL Paragraph - 8030-PROCESS-DE120 COBOL Cyclomatic complexity - 11
      * Input  :  

      * - de120Data500                   COBOL Name: 500-DE120-DATA
      * - seprReturnCode                 COBOL Name: SEPR-RETURN-CODE
      * - seprLength                     COBOL Name: SEPR-LENGTH
      *
      * Output :  

      * - seprDe48Sw                     COBOL Name: SEPR-DE48-SW
      * - seprDataPtr                    COBOL Name: SEPR-DATA-PTR
      * - rc                             COBOL Name: RETURN-CODE
      * - sf31IsoAvs2Ship2Name           COBOL Name: SF31-ISO-AVS2-SHIP2-NAME
      * - de120Data500                   COBOL Name: 500-DE120-DATA
      * - sf31IsoAvs2Ship2CoName         COBOL Name: SF31-ISO-AVS2-SHIP2-CO-NAME
      * - sf31IsoAvs2Ship2Add1           COBOL Name: SF31-ISO-AVS2-SHIP2-ADD-1
      * - sf31IsoAvs2Ship2Add2           COBOL Name: SF31-ISO-AVS2-SHIP2-ADD-2
      * - sf31IsoAvs2Ship2City           COBOL Name: SF31-ISO-AVS2-SHIP2-CITY
      * - sf31IsoAvs2Ship2State          COBOL Name: SF31-ISO-AVS2-SHIP2-STATE
      * - sf31IsoAvs2Ship2Postal         COBOL Name: SF31-ISO-AVS2-SHIP2-POSTAL
      * - sf31IsoAvs2Ship2Country        COBOL Name: SF31-ISO-AVS2-SHIP2-COUNTRY
      * - sf31IsoAvs2PhoneNum            COBOL Name: SF31-ISO-AVS2-PHONE-NUM
      *
      * @throws CFException
      */
      @Override
      public ProcessDe120OutCtx processDe120(ProcessDe120InCtx methodIn) throws Exception {
      
// *****************************************************************
// *        8 0 3 0 - P r o c e s s - d e 1 2 0                    *
// *****************************************************************
Sf311010Ctx programCtx = methodIn.getSf311010Ctx();
ProcessDe120OutCtx methodOut = methodIn.getProcessDe120OutCtx();
//  SET 88-SEPR-NO-DE48 TO TRUE
          methodOut.setSeprNoDe4888True(); 
          
//  SET SEPR-DATA-PTR TO ADDRESS OF 500-DE120-DATA
          methodOut.setSeprDataPtr(setObject(methodIn.getDe120DataGroup500())); 
          
//  CALL SEPR-PTR-SI994020
          // CALL SEPR-PTR-SI994020
          	programCtx.setRc( si994020.process(programCtx.getGlobalCtx().getContext("SI994020")));
//  IF 88-SEPR-RC-0000
          if ( methodIn.isSeprRc000088()  ) { 
//  IF SEPR-LENGTH (2) > 0
              if (	( methodIn.getSeprLength(1) > 0 )) { 
//  MOVE 500-DE120-DATA ( SEPR-OFFSET (2) : SEPR-LENGTH (2)) TO SF31-ISO-AVS2-SHIP2-NAME
                  methodIn.getSf31IsoExtractRec().replace(methodIn.getDe120DataGroup500()/*parent*/,0+methodIn.getSeprOffset(1) - 1/*fromOffset - (sf31IsoAvs2Ship2Name) */,methodIn.getSeprLength(1)/*fromLen*/,349/*toOffset - (de120Data500) */,27/*toLen*/);
              }
//  IF SEPR-LENGTH (3) > 0
              if (	( methodIn.getSeprLength(2) > 0 )) { 
//  MOVE 500-DE120-DATA ( SEPR-OFFSET (3) : SEPR-LENGTH (3)) TO SF31-ISO-AVS2-SHIP2-CO-NAME
                  methodIn.getSf31IsoExtractRec().replace(methodIn.getDe120DataGroup500()/*parent*/,0+methodIn.getSeprOffset(2) - 1/*fromOffset - (sf31IsoAvs2Ship2CoName) */,methodIn.getSeprLength(2)/*fromLen*/,376/*toOffset - (de120Data500) */,27/*toLen*/);
              }
//  IF SEPR-LENGTH (4) > 0
              if (	( methodIn.getSeprLength(3) > 0 )) { 
//  MOVE 500-DE120-DATA ( SEPR-OFFSET (4) : SEPR-LENGTH (4)) TO SF31-ISO-AVS2-SHIP2-ADD-1
                  methodIn.getSf31IsoExtractRec().replace(methodIn.getDe120DataGroup500()/*parent*/,0+methodIn.getSeprOffset(3) - 1/*fromOffset - (sf31IsoAvs2Ship2Add1) */,methodIn.getSeprLength(3)/*fromLen*/,403/*toOffset - (de120Data500) */,32/*toLen*/);
              }
//  IF SEPR-LENGTH (5) > 0
              if (	( methodIn.getSeprLength(4) > 0 )) { 
//  MOVE 500-DE120-DATA ( SEPR-OFFSET (5) : SEPR-LENGTH (5)) TO SF31-ISO-AVS2-SHIP2-ADD-2
                  methodIn.getSf31IsoExtractRec().replace(methodIn.getDe120DataGroup500()/*parent*/,0+methodIn.getSeprOffset(4) - 1/*fromOffset - (sf31IsoAvs2Ship2Add2) */,methodIn.getSeprLength(4)/*fromLen*/,435/*toOffset - (de120Data500) */,32/*toLen*/);
              }
//  IF SEPR-LENGTH (6) > 0
              if (	( methodIn.getSeprLength(5) > 0 )) { 
//  MOVE 500-DE120-DATA ( SEPR-OFFSET (6) : SEPR-LENGTH (6)) TO SF31-ISO-AVS2-SHIP2-CITY
                  methodIn.getSf31IsoExtractRec().replace(methodIn.getDe120DataGroup500()/*parent*/,0+methodIn.getSeprOffset(5) - 1/*fromOffset - (sf31IsoAvs2Ship2City) */,methodIn.getSeprLength(5)/*fromLen*/,467/*toOffset - (de120Data500) */,15/*toLen*/);
              }
//  IF SEPR-LENGTH (7) > 0
              if (	( methodIn.getSeprLength(6) > 0 )) { 
//  MOVE 500-DE120-DATA ( SEPR-OFFSET (7) : SEPR-LENGTH (7)) TO SF31-ISO-AVS2-SHIP2-STATE
                  methodIn.getSf31IsoExtractRec().replace(methodIn.getDe120DataGroup500()/*parent*/,0+methodIn.getSeprOffset(6) - 1/*fromOffset - (sf31IsoAvs2Ship2State) */,methodIn.getSeprLength(6)/*fromLen*/,482/*toOffset - (de120Data500) */,2/*toLen*/);
              }
//  IF SEPR-LENGTH (8) > 0
              if (	( methodIn.getSeprLength(7) > 0 )) { 
//  MOVE 500-DE120-DATA ( SEPR-OFFSET (8) : SEPR-LENGTH (8)) TO SF31-ISO-AVS2-SHIP2-POSTAL
                  methodIn.getSf31IsoExtractRec().replace(methodIn.getDe120DataGroup500()/*parent*/,0+methodIn.getSeprOffset(7) - 1/*fromOffset - (sf31IsoAvs2Ship2Postal) */,methodIn.getSeprLength(7)/*fromLen*/,484/*toOffset - (de120Data500) */,9/*toLen*/);
              }
//  IF SEPR-LENGTH (9) > 0
              if (	( methodIn.getSeprLength(8) > 0 )) { 
//  MOVE 500-DE120-DATA ( SEPR-OFFSET (9) : SEPR-LENGTH (9)) TO SF31-ISO-AVS2-SHIP2-COUNTRY
                  methodIn.getSf31IsoExtractRec().replace(methodIn.getDe120DataGroup500()/*parent*/,0+methodIn.getSeprOffset(8) - 1/*fromOffset - (sf31IsoAvs2Ship2Country) */,methodIn.getSeprLength(8)/*fromLen*/,493/*toOffset - (de120Data500) */,3/*toLen*/);
              }
//  IF SEPR-LENGTH (10) > 0
              if (	( methodIn.getSeprLength(9) > 0 )) { 
//  MOVE 500-DE120-DATA ( SEPR-OFFSET (10) : SEPR-LENGTH (10)) TO SF31-ISO-AVS2-PHONE-NUM
                  methodIn.getSf31IsoExtractRec().replace(methodIn.getDe120DataGroup500()/*parent*/,0+methodIn.getSeprOffset(9) - 1/*fromOffset - (sf31IsoAvs2PhoneNum) */,methodIn.getSeprLength(9)/*fromLen*/,501/*toOffset - (de120Data500) */,10/*toLen*/);
              }
          }
      
      return methodOut;
      }
      /**
      * eojRoutine 
      *   This method is derived from 
  *   COBOL Paragraph - 9900-EOJ-ROUTINE COBOL Cyclomatic complexity - 1
      * Input  :  

      * - totalRecs400                   COBOL Name: 400-TOTAL-RECS
      * - totalMessage650                COBOL Name: 650-TOTAL-MESSAGE
      * - totalVer2400                   COBOL Name: 400-TOTAL-VER2
      * - eojMessage650                  COBOL Name: 650-EOJ-MESSAGE
      *
      * Output :  

      * - totalDescription650            COBOL Name: 650-TOTAL-DESCRIPTION
      * - total650                       COBOL Name: 650-TOTAL
      * - totalRecs400                   COBOL Name: 400-TOTAL-RECS
      * - totalVer2400                   COBOL Name: 400-TOTAL-VER2
      *
      * @throws CFException
      */
      @Override
      public EojRoutineOutCtx eojRoutine(EojRoutineInCtx methodIn) throws Exception {
      
// ****************************************************************
// *   This paragraph closes all the files                        *
// ****************************************************************
Sf311010Ctx programCtx = methodIn.getSf311010Ctx();
EojRoutineOutCtx methodOut = methodIn.getEojRoutineOutCtx();
//  DISPLAY SPACES
          logger.info(" "); 
//  MOVE 'SYS001 INPUT BDLOG LOG RECORDS' TO 650-TOTAL-DESCRIPTION
          methodOut.setTotalDescription650(CONSTANTS.LITERAL_2099255690);
//  MOVE 400-TOTAL-RECS TO 650-TOTAL
//  FORMAT_397784695 = "ZZ,ZZZ,ZZZ,ZZ9"
          methodOut.setTotal650(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_397784695,String.valueOf(methodOut.getTotalRecs400()).toCharArray()));
//  DISPLAY 650-TOTAL-MESSAGE
          logger.info(methodIn.getTotalMessage650().toString()); 

// *
//  DISPLAY SPACES
          logger.info(" "); 
//  MOVE 'SYS201 OUTPUT VER2 RECORDS' TO 650-TOTAL-DESCRIPTION
          methodOut.setTotalDescription650(CONSTANTS.LITERAL_31980010);
//  MOVE 400-TOTAL-VER2 TO 650-TOTAL
//  FORMAT_397784695 = "ZZ,ZZZ,ZZZ,ZZ9"
          methodOut.setTotal650(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_397784695,String.valueOf(methodOut.getTotalVer2400()).toCharArray()));
//  DISPLAY 650-TOTAL-MESSAGE
          logger.info(methodIn.getTotalMessage650().toString()); 

// *
//  CLOSE CENTRAL-SITE-BDLOGS ISS-ACQ-VER2-FILE-OUT LOG-STATISTICS-REPORT
          centralSiteBdlogs.close(); 
          issAcqVer2FileOut.close(); 
          logStatisticsReport.close(); 

// *
//  DISPLAY SPACES
          logger.info(" "); 
//  DISPLAY 650-EOJ-MESSAGE
          logger.info(new String(methodIn.getEojMessage650())); 
      
      return methodOut;
      }
  
  
  
      public int call(ProgramContext ctx, Object[] params) throws Exception {
      Sf311010Ctx programCtx = (Sf311010Ctx) ctx;
      
      int len = params.length;
         if (len > 0 && params[0] != null )
            programCtx.getA01PassedParm().set((Field)params[0]);
         // invoke the process and return rc
         return process(programCtx);
         
      }
      
      public int call(ProgramContext ctx, Field... parameters) throws Exception {
      Sf311010Ctx programCtx = (Sf311010Ctx) ctx;
         for (int index = 0; index < parameters.length;index++) {
             switch(index) {
              case 0:
                      if(parameters[index] != null ) {
              		if (parameters[index] instanceof A01PassedParm) {
                       	programCtx.setA01PassedParm((A01PassedParm) parameters[index]);
                  	} else {
                       	programCtx.getA01PassedParm().set(parameters[index]);
                  	}
                  }
                
                  break;
            }
         }
      	return process(programCtx);
      }
      
      
      public void setFromMcwin(Sf311010Ctx programCtx, Object[] params) {
      int len = params.length;
         if (len > 0)
         if(params[0] instanceof Field) 
   programCtx.getMciwinYearToWindow().setString(((Field)params[0] ).toCharArray());
 else    programCtx.getMciwinYearToWindow().setString((char[])params[0] );
         if (len > 1)
         if(params[1] instanceof Field) 
   programCtx.getMciwinReturnedYear().setString(((Field)params[1] ).toCharArray());
 else    programCtx.getMciwinReturnedYear().setString((char[])params[1] );
         if (len > 2)
         if(params[2] instanceof Field) 
   programCtx.getMciwinNewWindowYearGroup().setString(((Field)params[2] ).toCharArray());
 else    programCtx.getMciwinNewWindowYearGroup().setString((char[])params[2] );
      }
      public void setFromMcabend(Sf311010Ctx programCtx, Object[] params) {
      int len = params.length;
         if (len > 0)
         if(params[0] instanceof Field) 
   programCtx.getMciabendParms().getMciabendParm1().setString(((Field)params[0] ).toCharArray());
 else    programCtx.getMciabendParms().getMciabendParm1().setString((char[])params[0] );
      }
      public void setFromSf910020(Sf311010Ctx programCtx, Object[] params) {
      int len = params.length;
         if (len > 0)
         if(params[0] instanceof Field) 
   programCtx.getAsmSf910020Parms880().setString(((Field)params[0] ).toCharArray());
 else    programCtx.getAsmSf910020Parms880().setString((char[])params[0] );
      }
  
      /**
       * Returns String value currentTime in hhmmssSS format
       * @return time as String and formatted as hhmmssSS
       */
      private char[] getCurrentTimeString() {
      	Calendar cal = getLocalTime();
      	String hh = cal.get(Calendar.HOUR_OF_DAY)+""; if (hh.length() < 2) hh = "0"+hh;
      	String mm = cal.get(Calendar.MINUTE)+""; if (mm.length() < 2) mm = "0"+mm;
      	String ss = cal.get(Calendar.SECOND)+""; if (ss.length() < 2) ss = "0"+ss;
      	String millis = cal.get(Calendar.MILLISECOND)+""; 
      	String millisFinal = "00";
      	if (millis.length() > 0)
      	{
      		if (millis.length() < 2) millisFinal = "0"+millis;
      		else millisFinal = millis.substring(0,2);
      	}
      	String tm = hh+mm+ss+millisFinal;
      	return tm.toCharArray();
      }
       /**
        * This function set calendar to use the local timezone
        * It is used to get date or time
        * @return zoned calendar
        */
      private Calendar getLocalTime()	{
       	// find the zone offset
      	TimeZone zone = null;
      	// check to see if timeZoneOffset override is set via application.properties
            	if (timeZoneId.length() > 0)
            		zone = TimeZone.getTimeZone(timeZoneId);
      	else
      		zone = TimeZone.getDefault(); 		
      	Calendar zonedCal = Calendar.getInstance();
      	zonedCal.setTimeZone(zone);
      	zonedCal.setTime(new java.util.Date());
      	return zonedCal;
      }
  
  
  
  
  }
  /* 
****************************************************************
*author.         distributed support systems.
*installation.   mastercard international (st. louis).
*date-written.   january 2004.
*security.       company private.
****************************************************************
*    this program will split the logs into various log types.
*    the program receives various log records it will check them
*    and process only j2 j3 & ja records. each valid record is
*    parsed and the resulting values are used to create the
*    output ver2 record.
*
*****************************************************************
*  m  a  i  n  t  e  n  a  n  c  e     h  i  s  t  o  r  y      *
*****************************************************************
*  project: crf-8033 date: 2004/01                              *
*  version: 00       programmer: max bradshaw                   *
*  modification: new program                                    *
*---------------------------------------------------------------*
*  project: crf-7759 date: 2004/05                              *
*  version: 01       programmer: a. jakir hussain               *
*  modification: 840-blocked-mti added                          *
*---------------------------------------------------------------*
*  project: crf-8033 date: 2004/08                              *
*  version: 02       programmer: russ ball                      *
*  modification: add de 12 and de 13                            *
*---------------------------------------------------------------*
*  project: crf-8193 date: apr. 2005                            *
*  version: 03       programmer: a. jakir hussain               *
*  modification: modified to check new header records coming    *
*                from bdlog file along with j logs (auth 5.1)   *
*---------------------------------------------------------------*
*  project: rel 5.2  date: 2005/05                              *
*  version: 04       programmer: f. schwamle                    *
*  modification: recompiled for rel 5.2                         *
*---------------------------------------------------------------*
*  project: rel 6.1  date: 2005/07                              *
*  version: 05       programmer: purushoth kumar                *
*  modification: removed 100-auth-response-code which is unused *
*---------------------------------------------------------------*
*  project: apsup05  date: 09/01/2005                           *
*  version: 06       programmer: arnold j. trembley             *
*  modification:     rename sf311010 copybook to sf511010.      *
*                    add new output field containing 3-byte     *
*                    de-048/subtag-42, for the merchant         *
*                    connect direct ad hoc project.             *
*---------------------------------------------------------------*
*  project: scr#3459 date: 05/23/2006                           *
*  version: 07       programmer: thanikachalam d s              *
*  modification:     modified the program to remove the references
*                    for sys003,sys198 and sys203 files         *
*                    also removed the diagnostic message for    *
*                    subtag parsing,,like 690-8000-message-1 thru
*                    690-8000-message-8.                        *
*---------------------------------------------------------------*
*  project: scr#3??? date: 08/18/2006                           *
*  version: 08       programmer: arnold j. trembley             *
*  modification:     modified to improve the totals for audit   *
*                    purposes.                                  *
*---------------------------------------------------------------*
*  project: rel 8.2  date: 03/05/2008                           *
*  version: 09       programmer: frd m. schwamle ii             *
*  modification:     modified to replace sf parser with improved*
*                    si parser and to add obscuring routines    *
*---------------------------------------------------------------*
*  project: rel 8.2  date: 04/20/2008                           *
*  version: 10       programmer: mike lanter                    *
*  modification:     eliminate trace file. eliminate sf127-     *
*                    fields and use new parser fields.          *
*---------------------------------------------------------------*
*  project: apsup08  date: 07/22/2008                           *
*  version: 11       programmer: arnold j. trembley             *
*  modification:     scr#3679 correct the building of the       *
*                    sf31-iso-cardholder-nbr field in the       *
*                    output auth log.                           *
*                    see paragraph 3120-move-data.              *
*---------------------------------------------------------------*
*  project: apsup08  date: 08/14/2008                           *
*  version: 12       programmer: arnold j. trembley             *
*  modification:     scr#3679 correct the use of 300-lit-a and  *
*                    100-cycle-id, found by mike lanter.        *
*---------------------------------------------------------------*
*  project: apsup08  date: 10/02/2008                           *
*  version: 13       programmer: arnold j. trembley             *
*  modification:     include emergency 8.2 changes to prevent   *
*                    s0c7 abend for non-numeric subelement      *
*                    length in paragraph 5110-check-for-se92.   *
*---------------------------------------------------------------*
*  project: c12010   date: 08/10/2009                           *
*  version: 14       programmer: magesh                         *
*  modification:     program recompiled for copybook changes in *
*                    auth message expansion.                    *
*---------------------------------------------------------------*
*  project: c12172   date: 08/19/2009                           *
*  version: 15       programmer: vidhya lakshmi.a               *
*  modification:     removed the copybook se001010 which is     *
*                    unused for pvl bundling project.           *
*---------------------------------------------------------------*
*  project: c124428  date: 01/21/2010   rel: 10.2               *
*  version: 16       programmer: lanter                         *
*  modification:     rewrite program using sf310010 as a model. *
*---------------------------------------------------------------*
*  project: c12442   date: 04/05/2010   rel: 10.2               *
*  version: 17       programmer: prabeesh mc                    *
*  modification:     auth message expansion- modified the lrecl *
*                    for bdlog file                             *
*---------------------------------------------------------------*
*  project: c12442   date: 04/06/2010   rel: 10.2               *
*  version: 18       programmer: janakiram thumati              *
*  modification:     the program is recompiled to pick up the   *
*---------------------------------------------------------------*
*  project: c12442   date: 09/20/2010   rel: 10.2               *
*  version: 19       programmer: russ ball                      *
*  modification:     para 8020-, correct how de42 is being      *
*                    populated to the ver 2.                    *
*---------------------------------------------------------------*
*  project:          date: 12/07/2010   sf310010 changes        *
*  version: 20       programmer: russ ball                      *
*  modification:     recompile for change to si894010 copybook  *
*---------------------------------------------------------------*
*  project:          date: 02/07/2011   sf311010 changes        *
*  version: 20       programmer: arnold trembley                *
*  modification:     bypass writing sys202 acq.avs2 records if  *
*                    pan invalid (format error de002)           *
*---------------------------------------------------------------*
*  project:          date: 01/30/2012   sf311010 changes        *
*  version: 21       programmer: arnold trembley                *
*  modification:     bypass all 0120/0130 messages when         *
*                    building t960 data (see paragraph 3100-)   *
*                    in order to prevent rb01 rebate billing    *
*                    for 0120 authorization advices.            *
*---------------------------------------------------------------*
*  project:          date: 11/14/2012   sf311010 changes        *
*  version: 22       programmer: r jones                        *
*  modification:     c31338 member id expansion                 *
*                    expanded member id from 3 bytes to 4 bytes *
*---------------------------------------------------------------*
*  project: c32224   date: 09/14/2013   rel 14.q2               *
*  version: 23       programmer: durga s                        *
*  modification:     member id expansion post migration code    *
*                    cleanup:                                   *
*                    removed code added to process the old      *
*                    layout of class j records.                 *
*                    modified para(s):                          *
*                    3000-process-log                           *
*                    3100-process-j-logs                        *
*                    3120-move-data.                            *
*---------------------------------------------------------------*
*  project: prb64852 date: 06/19/2014   rel 14.q2               *
*  version: 24       programmer: arnold trembley                *
*  modification:     move de042 card acceptor id into           *
*                    sf31-iso-merchant-id.                      *
*---------------------------------------------------------------*
*  project: prb66137 date: 06/04/2015   rel 15.q4 prodfix       *
*  version: 25       programmer: a.sravani                      *
*  modification:     prodfix - sf311010 currency of de004:      *
*                    always move de004 to transaction amount,   *
*                    even if it is not in us dollars.always     *
*                    pass the true contents of de004,de005,     *
*                    de006,de049,de050 and de051.               *
*                    modified para(s):                          *
*                    3493-10-common-cc-moves.                   *
*---------------------------------------------------------------*
*  project: prb83046 date: 12/30/2016   rel 17.q2 prodfix       *
*  version: 26       programmer: p.vasanthi                     *
*  modification:     prodfix - sf511010 file rec update         *
*                    modified to move sf2 and sf3 of se42 and   *
*                    sf1 sf2 sf5 and sf6 of se33 into           *
*                    sf31-iso-de48-se42-sf2-sf3,                *
*                    sf31-iso-de48-se33-sf1,                    *
*                    sf31-iso-de48-se33-sf2,                    *
*                    sf31-iso-de48-se33-sf5,                    *
*                    sf31-iso-de48-se33-sf6 accordingly         *
*                    whenever present in 0110 message.          *
*                    modified para(s):                          *
*                    3120-move-data                             *
*                    8020-process-de48-sexx.                    *
*---------------------------------------------------------------*
*  project: prb85706 date: 04/10/2017   rel 17.q1               *
*  version: 27       programmer: rohit cherian                  *
*  modification:     prodfix - populate de048 se87 in t960.     *
*                    modified to move the value in de048 se87 to*
*                    sf31-iso-de48-tag87-present.               *
*                    modified para(s):                          *
*                    8020-.                                     *
*---------------------------------------------------------------*
*  project: i10869 tic mandate for us interchange               *
*  date   : 06/03/2019  rel 20.q1
*  version: 28       programmer: karabi ghanta                  *
*  modification:     populate de048 se52 in t960.               *
*                    modified to move the value of de048 se52 to*
*                    sf31-iso-de48-se52-tic.                    *
*                    modified para(s):                          *
*                    8020-.                                     *
*---------------------------------------------------------------*
*  project: i11106 alm transaction processing - regionalization *
*  date   : 09/22/2020  rel 21.q2                               *
*  version: 29       programmer: shobana jayalakshmi m          *
*  modification:     populate the value of de048 se66, de48 se43*
*                    and de48 se24 to t960 file.removed the     *
*                    movement of values to t960 file field      *
*                    sf31-iso-private-data.                     *
*                                                               *
*                    modified para(s):                          *
*                    8020-process-de48-sexx                     *
*                    3120-move-data                             *
*                                                               *
*---------------------------------------------------------------*
*  project: xxxxxx   date: xx/xx/xxxx   rel xx.xx               *
*  version: xx       programmer: xxxxxxx                        *
*  modification:     xxxxxxxxxx xxxxxxx xxxxxxxxxx              *
*                    xxxxxxxx                                   *
*---------------------------------------------------------------*
*****************************************************************
*/
