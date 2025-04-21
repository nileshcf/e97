  package com.cloudframe.app.process;
   /* The comment section is too large, 
	 * hence added at the end of the java code 
	 * please scroll all the way to the bottom to see complete comments 
	 */
  
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.sf311010.file.*;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import org.springframework.web.bind.annotation.RequestParam;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.process.Mcwin;
  import com.cloudframe.app.sf311010.dto.MciabendParm1;
  import com.cloudframe.app.process.Mcabend;
  import java.util.Calendar;
  import java.util.TimeZone;
  import java.util.Date;
  import org.springframework.beans.factory.annotation.Value;
  import com.cloudframe.app.sf311010.dto.Sf501RecordRedefined;
  import com.cloudframe.app.sf311010.dto.Sf501Header;
  import com.cloudframe.app.sf311010.dto.Sf501JIsoDataRedefined;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.sf311010.dto.Sf501HdrTime;
  import com.cloudframe.app.sf311010.dto.Sf501HdrDate;
  import com.cloudframe.app.process.Sf910020;
  import com.cloudframe.app.sf311010.dto.AsmBitSw880;
  import com.cloudframe.app.sf311010.dto.AcquirerIcaOnly5800;
  import com.cloudframe.app.sf311010.dto.AcqIcaOnly5800;
  import com.cloudframe.app.sf311010.dto.ForwardIcaOnly5800;
  import com.cloudframe.app.sf311010.dto.FwdIcaOnly5800;
  import com.cloudframe.app.global.sharedvar.Si583DataElementWorkArea1;
  import com.cloudframe.app.global.sharedvar.Si583DataElementWorkArea2;
  import com.cloudframe.app.sf311010.dto.BkntData110860;
  import com.cloudframe.app.sf311010.dto.BkntData860;
  import com.cloudframe.app.sf311010.dto.Sf31IsoTransDate;
  import com.cloudframe.app.sf311010.dto.Sf31IsoCrncyConvFields;
  import com.cloudframe.app.sf311010.dto.Sf31IsoAddlAvsii;
  import com.cloudframe.app.sf311010.dto.TransactionAmt100860;
  import com.cloudframe.app.sf311010.dto.TransactionAmt1860;
  import com.cloudframe.app.sf311010.dto.SetlAmnt100860;
  import com.cloudframe.app.sf311010.dto.SetlAmt110860;
  import java.math.BigDecimal;
  import com.cloudframe.app.sf311010.dto.Sf31IsoCnvDteCcyymmdd;
  import com.cloudframe.app.process.Si994010;
  import com.cloudframe.app.process.Si994020;
  import com.cloudframe.app.sf311010.dto.*;
  import com.cloudframe.app.sf311010.dto.Head5358;
  import com.cloudframe.app.sf311010.dto.A01PassedParm;
  import com.cloudframe.app.sf311010.dto.EndOfReportLine366;
  import com.cloudframe.app.sf311010.dto.Head3354;
  import com.cloudframe.app.sf311010.dto.Head6360;
  import com.cloudframe.app.sf311010.dto.Head1350;
  import com.cloudframe.app.sf311010.dto.DetailLine362;
  import com.cloudframe.app.sf311010.dto.Head4356;
  import com.cloudframe.app.sf311010.dto.Head2352;
  import com.cloudframe.app.sf311010.dto.TotalMessage650;
  import com.cloudframe.app.sf311010.dto.De11TraceAudit800;
  import com.cloudframe.app.sf311010.file.records.CentralSiteRecord;
  import com.cloudframe.app.sf311010.dto.LogDecompressedData860;
  import com.cloudframe.app.sf311010.dto.MciabendParms;
  import com.cloudframe.app.sf311010.file.records.IssAcqVer2Record;
  import com.cloudframe.app.sf311010.dto.MciwinNewWindowYearGroup;
  import com.cloudframe.app.sf311010.file.records.ReportRecord;
  import com.cloudframe.app.sf311010.dto.TimeHhmmss801;
  import com.cloudframe.app.sf311010.dto.De120DataGroup500;
  import com.cloudframe.app.sf311010.dto.DataGroup1000;
  import com.cloudframe.app.sf311010.dto.Date800;
  import com.cloudframe.app.sf311010.dto.ForwardIca800;
  import com.cloudframe.app.sf311010.dto.DateYymmdd800;
  import com.cloudframe.app.sf311010.dto.Sf31IsoExtractRec;
  import com.cloudframe.app.sf311010.dto.HoldCurrentDate800;
  import com.cloudframe.app.sf311010.dto.Time801;
  import com.cloudframe.app.sf311010.dto.AsmSf910020Parms880;
  import com.cloudframe.app.sf311010.dto.WhenCompiled804;
  import com.cloudframe.app.sf311010.dto.MciwinYearToWindow;
  import com.cloudframe.app.sf311010.dto.MciwinReturnedYear;
  import com.cloudframe.app.sf311010.dto.De48Se42500;
  import com.cloudframe.app.sf311010.dto.De48DataGroup500;
  import com.cloudframe.app.sf311010.dto.AcquirerIca800;
  import com.cloudframe.app.sf311010.dto.Sf501LogRecord;
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
  
  public class Sf311010 extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Sf311010.class);
  
  private Head5358 head5358 = new Head5358() ;
  private A01PassedParm a01PassedParm = new A01PassedParm() ;
  private EndOfReportLine366 endOfReportLine366 = new EndOfReportLine366() ;
  private Head3354 head3354 = new Head3354() ;
  private Head6360 head6360 = new Head6360() ;
  private Head1350 head1350 = new Head1350() ;
  private DetailLine362 detailLine362 = new DetailLine362() ;
  private Head4356 head4356 = new Head4356() ;
  private Head2352 head2352 = new Head2352() ;
  private TotalMessage650 totalMessage650 = new TotalMessage650() ;
  private De11TraceAudit800 de11TraceAudit800 = new De11TraceAudit800() ;
  private CentralSiteRecord centralSiteRecord = new CentralSiteRecord() ;
  private LogDecompressedData860 logDecompressedData860 = new LogDecompressedData860() ;
  private MciabendParms mciabendParms = new MciabendParms() ;
  private IssAcqVer2Record issAcqVer2Record = new IssAcqVer2Record() ;
  private MciwinNewWindowYearGroup mciwinNewWindowYearGroup = new MciwinNewWindowYearGroup() ;
  private ReportRecord reportRecord = new ReportRecord() ;
  private TimeHhmmss801 timeHhmmss801 = new TimeHhmmss801() ;
  private De120DataGroup500 de120DataGroup500 = new De120DataGroup500() ;
  private DataGroup1000 dataGroup1000 = new DataGroup1000() ;
  private Date800 date800 = new Date800() ;
  private ForwardIca800 forwardIca800 = new ForwardIca800() ;
  private DateYymmdd800 dateYymmdd800 = new DateYymmdd800() ;
  private Sf31IsoExtractRec sf31IsoExtractRec = new Sf31IsoExtractRec() ;
  private HoldCurrentDate800 holdCurrentDate800 = new HoldCurrentDate800() ;
  private Time801 time801 = new Time801() ;
  private AsmSf910020Parms880 asmSf910020Parms880 = new AsmSf910020Parms880() ;
  private WhenCompiled804 whenCompiled804 = new WhenCompiled804() ;
  private MciwinYearToWindow mciwinYearToWindow = new MciwinYearToWindow() ;
  private MciwinReturnedYear mciwinReturnedYear = new MciwinReturnedYear() ;
  private De48Se42500 de48Se42500 = new De48Se42500() ;
  private De48DataGroup500 de48DataGroup500 = new De48DataGroup500() ;
  private AcquirerIca800 acquirerIca800 = new AcquirerIca800() ;
  private Sf501LogRecord sf501LogRecord = new Sf501LogRecord() ;
  private De48Se66SfLenGroup500 de48Se66SfLenGroup500 = new De48Se66SfLenGroup500() ;
  private De48Se24SfLenGroup500 de48Se24SfLenGroup500 = new De48Se24SfLenGroup500() ;
  private BiaDataConvGroup800 biaDataConvGroup800 = new BiaDataConvGroup800() ;
  private WorkAcqIcaGroup800 workAcqIcaGroup800 = new WorkAcqIcaGroup800() ;
  private WorkFwdIcaGroup800 workFwdIcaGroup800 = new WorkFwdIcaGroup800() ;
  private WorkCompTwoGroup808 workCompTwoGroup808 = new WorkCompTwoGroup808() ;
  private De125WorkAreaAGroup890 de125WorkAreaAGroup890 = new De125WorkAreaAGroup890() ;
  private Work work = new Work() ;
  
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
  @Autowired 
  @Qualifier("global_ptrSf910020Group800")
  PtrSf910020Group800 ptrSf910020Group800;
  @Autowired 
  @Qualifier("global_ptrSi994010Group800")
  PtrSi994010Group800 ptrSi994010Group800;
  @Autowired 
  @Qualifier("global_seprControlBlock")
  SeprControlBlock seprControlBlock;
  @Autowired 
  @Qualifier("global_seprTableGroup")
  SeprTableGroup seprTableGroup;
  
  
  
  
  
  
      public int setParameter(String a01PassedParm) throws Exception {
      		if(a01PassedParm != null)
      		    this.a01PassedParm.setString(com.cloudframe.app.data.Field.getParm(a01PassedParm),new String(CONSTANTS.EBCDIC_ENCODING));
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
      
       return getRc(); // Exit with return code
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
      private void mainline() throws Exception {
//  PERFORM 1000-INITIALIZE
          initialize();/*1000-INITIALIZE*/
          if (this.isProgramEnded()) {
              return ;
          }
//  PERFORM 2000-READ-CENTRAL-SITE-BDLOGS UNTIL 88-100-CENTRAL-SITE-EOF
          while (!(work.isCentralSiteEof88100()) ) {
             readCentralSiteBdlogs();/*2000-READ-CENTRAL-SITE-BDLOGS*/
             if (this.isProgramEnded()) {
                 return ;
             }
          }
//  PERFORM 6000-GENERATE-CONTROL-REPORT
          generateControlReport();/*6000-GENERATE-CONTROL-REPORT*/
          if (this.isProgramEnded()) {
              return ;
          }
//  PERFORM 9900-EOJ-ROUTINE
          eojRoutine();/*9900-EOJ-ROUTINE*/
          if (this.isProgramEnded()) {
              return ;
          }
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          this.setProgramEnded(true);
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
      private void initialize() throws Exception {
			// Declare local variables used in the method
			MciabendParm1 mciabendParm1 = mciabendParms.getMciabendParm1();
			short a01PassedParmLength = 0;
			int seven300 = 0;
			char[] a01PassedCycleId = null;
			char[] litA300 = null;
			char[] litB300 = null;
			char[] litC300 = null;
			char[] a01PassedVoiceIca = null;
			// End of variable declaration

      
// *
// ***********************************************************
// *    This is the initial paragraph that performs all      *
// *    set-ups in this program                              *
// ***********************************************************

// *
//  INITIALIZE 500-DE48-SE66-SF-LEN-9
          de48Se66SfLenGroup500.getDe48Se66SfLen500Redefined().setDe48Se66SfLen9500(0);
          // MOVE WHEN-COMPILED TO 804-WHEN-COMPILED
          whenCompiled804.setString(CONSTANTS.LITERAL_704083453);

// *
//  ACCEPT 800-DATE-YYMMDD FROM DATE
          dateYymmdd800.setString(CFUtil.getCurrentDateStr()); 
          // MOVE '211006' TO 800-DATE-YYMMDD
          //  LITERAL_211006 = '211006'
          dateYymmdd800.setString(CONSTANTS.LITERAL_211006);
//  MOVE 800-DATE-MM TO 800-DATE-MONTH
          date800.setDateMonth800(dateYymmdd800.getDateMm800());
//  MOVE 800-DATE-DD TO 800-DATE-DAY
          date800.setDateDay800(dateYymmdd800.getDateDd800());
//  MOVE 800-DATE-YY TO 800-DATE-YEAR
          date800.setDateYear800(dateYymmdd800.getDateYy800());

// *
          // MOVE 800-DATE-YYMMDD TO 800-HOLD-CURRENT-DATE
          holdCurrentDate800.setString(dateYymmdd800.getCharArray());
//  MOVE 800-HOLD-CURR-YY TO MCIWIN-YEAR-TO-WINDOW
          mciwinYearToWindow.setString(String.valueOf(holdCurrentDate800.getHoldCurrYy800String()).toCharArray());
//  CALL MCWIN-PROGRAM USING MCIWIN-YEAR-TO-WINDOW MCIWIN-RETURNED-YEAR MCIWIN-NEW-WINDOW-YEAR
          // CALL MCWIN-PROGRAM USING MCIWIN-YEAR-TO-WINDOW MCIWIN-RETURNED-YEAR MCIWIN-NEW-WINDOW-YEAR
               this.setRc( mcwin.call(mciwinYearToWindow,mciwinReturnedYear,mciwinNewWindowYearGroup));
//  IF RETURN-CODE = ZERO
          if (	( getRc() == 0 )) { 
//  MOVE MCIWIN-RET-CENTURY TO 800-HOLD-CURR-CC
              work.setHoldCurrCc800(mciwinReturnedYear.getMciwinRetCentury());
          }
//  ELSE
          else { 
//  MOVE RETURN-CODE TO MCIWIN-RETURN-CODE MCIABEND-ABEND-CODE
              work.setMciwinReturnCode(getRc());
              mciabendParm1.setMciabendAbendCode(getRc());
  
//  DISPLAY 600-MCWIN-MSG1
              logger.info(new String(work.getMcwinMsg1600())); 
//  DISPLAY 600-MCWIN-MSG2 MCIWIN-RETURN-CODE
              logger.info("{}{}", new String(work.getMcwinMsg2600()), String.valueOf(work.getMciwinReturnCode())); 
//  MOVE MCIABEND-NODUMP TO MCIABEND-DUMP-OPT
              mciabendParm1.setMciabendDumpOpt(work.getMciabendNodump());
  
//  CALL MCABEND-MODULE USING MCIABEND-PARM1
              // CALL MCABEND-MODULE USING MCIABEND-PARM1
                   this.setRc( mcabend.call(mciabendParms.getMciabendParm1()));
          }

// *
//  ACCEPT 801-TIME-HHMMSS FROM TIME
          timeHhmmss801.setString(getCurrentTimeString()); 
          // MOVE '07462500' TO 801-TIME-HHMMSS
          //  LITERAL_07462500 = '07462500'
          timeHhmmss801.setString(CONSTANTS.LITERAL_07462500);
//  MOVE 801-TIME-HH TO 801-TIME-HOURS
          time801.setTimeHours801(timeHhmmss801.getTimeHh801());
//  MOVE 801-TIME-MM TO 801-TIME-MINUTES
          time801.setTimeMinutes801(timeHhmmss801.getTimeMm801());
//  MOVE 801-TIME-SS TO 801-TIME-SECONDS
          time801.setTimeSeconds801(timeHhmmss801.getTimeSs801());

// *
          // MOVE 800-DATE TO 350-HEAD1-DATE
          head1350.setHead1Date350(date800.toCharArray());
//  MOVE '07:46:25' TO 352-HEAD2-TIME
//  LITERAL_07_CL2_4625 = '07:46:25'
          head2352.setHead2Time352(CONSTANTS.LITERAL_07_CL2_4625);

// *
//  DISPLAY 'SF311010  SPLIT BANKNET LOG FILE TYPES'
          logger.info("SF311010  SPLIT BANKNET LOG FILE TYPES"); 
//  DISPLAY 'SF311010  PROGRAM COMPILED ' 804-COMPILE-DATE ' AT ' 804-COMPILE-TIME
          logger.info("SF311010  PROGRAM COMPILED {} AT {}", new String(whenCompiled804.getCompileDate804()), new String(whenCompiled804.getCompileTime804())); 
//  DISPLAY 'SF311010  PROGRAM EXECUTED ' 800-DATE ' AT ' 801-TIME
          logger.info("SF311010  PROGRAM EXECUTED {} AT {}", date800.toString(), time801.toString()); 
//  DISPLAY ' '
          logger.info(" "); 

// *
//  IF A01-PASSED-PARM-LENGTH = 300-SEVEN
          a01PassedParmLength = a01PassedParm.getA01PassedParmLength();
          seven300 = work.getSeven300();
//  ELSE
          if (	( a01PassedParmLength != seven300 ) ) { 
//  DISPLAY 600-PARMS-MSG
              logger.info(new String(work.getParmsMsg600())); 
          }
  
          litB300 = work.getLitB300();
          a01PassedCycleId = a01PassedParm.getA01PassedCycleId();
          litC300 = work.getLitC300();
          litA300 = work.getLitA300();
//  IF A01-PASSED-CYCLE-ID = 300-LIT-A OR A01-PASSED-CYCLE-ID = 300-LIT-B OR A01-PASSED-CYCLE-ID = 300-LIT-C
          if (		compareChars(a01PassedCycleId,litA300) == 0  || 		compareChars(a01PassedCycleId,litB300) == 0  || 		compareChars(a01PassedCycleId,litC300) == 0 ) { 
              // MOVE A01-PASSED-CYCLE-ID TO 100-CYCLE-ID
              work.setCycleId100(a01PassedParm.getA01PassedCycleId());
          }
  
//  ELSE
          else { 
//  DISPLAY 600-CYCLE-MSG
              logger.info(new String(work.getCycleMsg600())); 
          }
//  IF A01-PASSED-VOICE-ICA NUMERIC
          a01PassedVoiceIca = a01PassedParm.getA01PassedVoiceIca();
//  ELSE
          if (    !( isNumeric(a01PassedVoiceIca) )) { 
//  DISPLAY 600-VOICE-MSG
              logger.info(new String(work.getVoiceMsg600())); 
          }
  

// *
//  SET 800-PTR-SF910020 TO ENTRY 300-SF910020
          ptrSf910020Group800.setPtrSf910020800(work.getSf910020300()); 
          
//  SET 800-PTR-SI994010 TO ENTRY 300-SI994010
          ptrSi994010Group800.setPtrSi994010800(work.getSi994010300()); 
          

// *
//  SET SEPR-PTR-SI994020 TO ENTRY SEPR-CALL-SI994020
          work.setSeprPtrSi994020(work.getSeprCallSi994020()); 
          
//  OPEN INPUT CENTRAL-SITE-BDLOGS
          centralSiteBdlogs.open(new String(CONSTANTS.MODE_READ_ONLY_36242),centralSiteBdlogs.getFileName(),centralSiteBdlogs.getCentralSiteBdlogsCharSet(),centralSiteBdlogs.getCentralSiteBdlogsCrlfFlag());

// *
//  OPEN OUTPUT ISS-ACQ-VER2-FILE-OUT LOG-STATISTICS-REPORT
          issAcqVer2FileOut.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),issAcqVer2FileOut.getFileName(),issAcqVer2FileOut.getIssAcqVer2FileOutCharSet(),issAcqVer2FileOut.getIssAcqVer2FileOutCrlfFlag());
          logStatisticsReport.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),logStatisticsReport.getFileName(),logStatisticsReport.getLogStatisticsReportCharSet(),logStatisticsReport.getLogStatisticsReportCrlfFlag());
      
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
      private void readCentralSiteBdlogs() throws Exception {
      
// *
//  READ CENTRAL-SITE-BDLOGS
          	centralSiteBdlogs.read();
          work.setLogLen800(centralSiteBdlogs.getRecLen());
          if (!centralSiteBdlogs.hasEnded()) {
          	centralSiteRecord.setString(centralSiteBdlogs.getRecord());
          }
//  AT END
          if (centralSiteBdlogs.hasEnded()) {  
//  SET 88-100-CENTRAL-SITE-EOF TO TRUE
              work.setCentralSiteEof88100True(); 
              
//  DISPLAY 'CENTRAL SITE LOG PROCESSING COMPLETED'
              logger.info("CENTRAL SITE LOG PROCESSING COMPLETED"); 
            }
//  NOT AT END
          else  {
//  PERFORM 3000-PROCESS-LOG
              processLog();/*3000-PROCESS-LOG*/
            }
      
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
      private void processLog() throws Exception {
			// Declare local variables used in the method
			Sf501RecordRedefined sf501RecordRedefined = sf501LogRecord.getSf501RecordRedefined();
			Sf501Header sf501Header = sf501LogRecord.getSf501RecordRedefined().getSf501Header();
			char[] sf501JPosEntryPoint = null;
			char[] litIa300 = null;
			// End of variable declaration

      
// ***********************************************************
// *    This paragraph will separate the banknet logs and    *
// *    process only j2, j3 & ja.                            *
// ***********************************************************
//  ADD 300-PACKED-ONE TO 400-TOTAL-RECS
          work.setTotalRecs400(work.getTotalRecs400()+(short) work.getPackedOne300());
//  MOVE CENTRAL-SITE-RECORD (1 : 800-LOG-LEN ) TO SF501-LOG-RECORD (1 : 800-LOG-LEN )
          sf501LogRecord.replace(centralSiteRecord,0,work.getLogLen800(),0,work.getLogLen800() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE SF501-CLASS TO 100-LOG-CLASS
          work.setLogClass100(sf501RecordRedefined.getSf501Class());
  
//  MOVE SF501-TYPE TO 100-LOG-TYPE
          work.setLogType100(sf501RecordRedefined.getSf501Type());
  
//  SET 88-100-NOT-PARSED TO TRUE
          work.setNotParsed88100True(); 
          

// * Ia is not valid in production, drop them at this point.
//  IF 88-100-LOG-CLASS-J AND 88-100-LOG-TYPE-2-3-A
          if ( work.isLogClassJ88100()   &&  work.isLogType23A88100()  ) { 
//  ADD 300-PACKED-ONE TO 400-TOTAL-ISO-AUTH
              work.setTotalIsoAuth400(work.getTotalIsoAuth400()+(short) work.getPackedOne300());
              sf501JPosEntryPoint = sf501Header.getSf501JPosEntryPoint();
              litIa300 = work.getLitIa300();
//  IF SF501-J-POS-ENTRY-POINT = 300-LIT-IA
              if (		compareChars(sf501JPosEntryPoint,litIa300) == 0 ) { 
//  ADD 300-ONE TO 400-TOTAL-IA-DROPPED
                  work.setTotalIaDropped400(work.getTotalIaDropped400()+(int) work.getOne300());
              }
  
//  ELSE
              else { 
//  PERFORM 3100-PROCESS-J-LOGS
                  processJLogs();/*3100-PROCESS-J-LOGS*/
              }
          }
      
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
      private void processJLogs() throws Exception {
			// Declare local variables used in the method
			Sf501RecordRedefined sf501RecordRedefined = sf501LogRecord.getSf501RecordRedefined();
			Sf501JIsoDataRedefined sf501JIsoDataRedefined = sf501LogRecord.getSf501RecordRedefined().getSf501JIsoDataRedefined();
			char[] mti800 = null;
			char[] lit0420300 = null;
			char[] lit0430300 = null;
			char[] lit0120300 = null;
			char[] lit0130300 = null;
			char[] sf31IsoAuthResponse = null;
			char[] lit30300 = null;
			char[] sf31IsoAuthAddlData = null;
			char[] lit002300 = null;
			// End of variable declaration

      
// *
// **************************************************************
// *    This paragraph decides what type iso log to process.    *
// *    set the address pointer to the start of the data to     *
// *    be parsed.                                              *
// **************************************************************
//  IF 88-100-LOG-TYPE-2-A
          if ( work.isLogType2A88100()  ) { 
//  ADD 300-ONE TO 400-TOTAL-TYPE-2
              work.setTotalType2400(work.getTotalType2400()+(int) work.getOne300());
              si583ParserArea.setSi583DataLength(work.getLogLen800() - work.getBinary61300());
//  SET SI583-DATA-PTR TO ADDRESS OF SF501-J-ISO-DATA
              si583ParserArea.setSi583DataPtr(setObject(sf501RecordRedefined,61,7939)); 
              
  
//  DISPLAY '*2-A-LOG * ' SF501-J-ISO-DATA (101 : 100)
              logger.info("*2-A-LOG * {}", new String(substring(sf501LogRecord.getSf501RecordRedefined().getSf501JIsoData(),100,200))); 
//  MOVE SF501-J-ISO-DATA (1 : 4) TO 800-MTI
              work.setMti800(substring(sf501LogRecord.getSf501RecordRedefined().getSf501JIsoData(),0,4));
          }
//  IF 88-100-LOG-TYPE-3
          if ( work.isLogType388100()  ) { 
//  ADD 300-ONE TO 400-TOTAL-TYPE-3
              work.setTotalType3400(work.getTotalType3400()+(int) work.getOne300());
              si583ParserArea.setSi583DataLength(work.getLogLen800() - work.getBinary88300());
//  SET SI583-DATA-PTR TO ADDRESS OF SF501-J3-DATA
              si583ParserArea.setSi583DataPtr(setObject(sf501JIsoDataRedefined,88,7912)); 
              
  
//  DISPLAY '*3---LOG * ' SF501-J3-DATA (101 : 100)
              logger.info("*3---LOG * {}", new String(substring(sf501LogRecord.getSf501RecordRedefined().getSf501JIsoDataRedefined().getSf501J3Data(),100,200))); 
//  MOVE SF501-J3-DATA (1 : 4) TO 800-MTI
              work.setMti800(substring(sf501LogRecord.getSf501RecordRedefined().getSf501JIsoDataRedefined().getSf501J3Data(),0,4));
          }

// **** Bypass reversal advices                                 *
// ****    bypass 0120 authorization advices.                      *
          mti800 = work.getMti800();
          lit0430300 = work.getLit0430300();
          lit0120300 = work.getLit0120300();
          lit0420300 = work.getLit0420300();
          lit0130300 = work.getLit0130300();
//  IF 800-MTI = 300-LIT-0420 OR 300-LIT-0430 OR 800-MTI = 300-LIT-0120 OR 300-LIT-0130
          if (		compareChars(mti800,lit0420300) == 0  || 		compareChars(mti800,lit0430300) == 0  || 		compareChars(mti800,lit0120300) == 0  || 		compareChars(mti800,lit0130300) == 0 ) { 
              mti800 = work.getMti800();
              lit0430300 = work.getLit0430300();
              lit0420300 = work.getLit0420300();
//  IF 800-MTI = 300-LIT-0420 OR 300-LIT-0430
              if (		compareChars(mti800,lit0420300) == 0  || 		compareChars(mti800,lit0430300) == 0 ) { 
//  ADD 300-ONE TO 400-TOTAL-REV-ADV
                  work.setTotalRevAdv400(work.getTotalRevAdv400()+(int) work.getOne300());
              }
  
//  ELSE
              else { 
//  ADD 300-ONE TO 400-TOTAL-0120-ADV
                  work.setTotal0120Adv400(work.getTotal0120Adv400()+(int) work.getOne300());
              }
          }
  
//  ELSE
          else { 
//  PERFORM 5000-CALL-PARSER
              callParser();/*5000-CALL-PARSER*/
//  IF 88-100-PARSED
              if ( work.isParsed88100()  ) { 
//  PERFORM 3120-MOVE-DATA
                  moveData();/*3120-MOVE-DATA*/
                  lit002300 = work.getLit002300();
                  sf31IsoAuthAddlData = sf31IsoExtractRec.getSf31IsoAuthAddlData();
                  lit30300 = work.getLit30300();
                  sf31IsoAuthResponse = sf31IsoExtractRec.getSf31IsoAuthResponse();
//  IF ( SF31-ISO-AUTH-RESPONSE = 300-LIT-30 AND SF31-ISO-AUTH-ADDL-DATA (1 : 3) = 300-LIT-002 )
                  if ((		compareChars(sf31IsoAuthResponse,lit30300) == 0  && Field.compareChar(sf31IsoAuthAddlData , lit002300 , ( 0 /*start*/ ), 3 /*left len*/ , 3 /*right len*/))) { 
//  ADD 300-ONE TO 400-TOTAL-BAD-PAN
                      work.setTotalBadPan400(work.getTotalBadPan400()+(int) work.getOne300());
//  DISPLAY 'FORMAT ERROR, INVALID PAN ' SF31-ISO-BKNT-REF-NO SPACE SF31-ISO-CARDHOLDER-NBR (1 : 11)
                      logger.info("FORMAT ERROR, INVALID PAN {}{}", new String(sf31IsoExtractRec.getSf31IsoBkntData().getSf31IsoBkntTraceData().getSf31IsoBkntRefNo()), new String(substring(sf31IsoExtractRec.getSf31IsoCardholderNbr(),0,11))); 
                  }
  
//  ELSE
                  else { 
//  ADD 300-ONE TO 400-TOTAL-VER2
                      work.setTotalVer2400(work.getTotalVer2400()+(int) work.getOne300());
//  WRITE ISS-ACQ-VER2-RECORD FROM SF31-ISO-EXTRACT-REC
                      issAcqVer2FileOut.write(sf31IsoExtractRec.toCharArray()); 
                      issAcqVer2Record.setString(CONSTANTS.LOW_VALUE_215516604);
                  }
              }
          }
      
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
      private void moveData() throws Exception {
			// Declare local variables used in the method
			Sf501HdrTime sf501HdrTime = sf501LogRecord.getSf501RecordRedefined().getSf501Header().getSf501HdrTime();
			Sf501HdrDate sf501HdrDate = sf501LogRecord.getSf501RecordRedefined().getSf501Header().getSf501HdrDate();
			Sf501Header sf501Header = sf501LogRecord.getSf501RecordRedefined().getSf501Header();
			AsmBitSw880 asmBitSw880 = asmSf910020Parms880.getAsmBitSw880();
			AcquirerIcaOnly5800 acquirerIcaOnly5800 = acquirerIca800.getAcquirerIcaOnly5800();
			AcqIcaOnly5800 acqIcaOnly5800 = workAcqIcaGroup800.getWorkAcqIca800Redefined().getAcqIcaOnly5800();
			char[] acqFiller1800 = null;
			char[] acqFiller2800 = null;
			char[] forwardInstId860 = null;
			char[] fwdFiller1800 = null;
			char[] fwdFiller2800 = null;
			char[] posDeviceType860 = null;
			char[] si583Mti1 = null;
			char[] si583Mti2 = null;
			char[] finNetwork110860 = null;
			char[] finNetworkCode860 = null;
			char[] countryCode110860 = null;
			char[] countryCode860 = null;
			char[] retrievalRefno110860 = null;
			char[] retrievalRefno860 = null;
			char[] idTerminal110860 = null;
			char[] idTerminal860 = null;
			char[] cardAcceptor110860 = null;
			char[] cardAcceptor860 = null;
			char[] authMrchNmctst110860 = null;
			char[] authMrchNmctst860 = null;
			char[] sf31IsoProcessingCode = null;
			char[] lit380000300 = null;
			ForwardIcaOnly5800 forwardIcaOnly5800 = forwardIca800.getForwardIcaOnly5800();
			FwdIcaOnly5800 fwdIcaOnly5800 = workFwdIcaGroup800.getWorkFwdIca800Redefined().getFwdIcaOnly5800();
			long timeLocalTrans100860 = 0;
			long processingCode110860 = 0;
			long processingCode100860 = 0;
			long dateTimeXmit110860 = 0;
			long dateTimeXmit100860 = 0;
			int dateLocalTrans100860 = 0;
			int posEntry110860 = 0;
			int mti0110300 = 0;
			int mti0100300 = 0;
			int transMmdd110860 = 0;
			int transMmdd860 = 0;
			int merchantType110860 = 0;
			int merchantType860 = 0;
			int posPinCapture110860 = 0;
			int posPinCapture860 = 0;
			Si583DataElementWorkArea1 si583DataElementWorkArea1 = si583ParserArea.getSi583DataElementWorkArea1();
			Si583DataElementWorkArea2 si583DataElementWorkArea2 = si583ParserArea.getSi583DataElementWorkArea2();
			BkntData110860 bkntData110860 = logDecompressedData860.getBkntData110860();
			BkntData860 bkntData860 = logDecompressedData860.getBkntData860();
			Sf31IsoTransDate sf31IsoTransDate = sf31IsoExtractRec.getSf31IsoTransDate();
			Sf31IsoCrncyConvFields sf31IsoCrncyConvFields = sf31IsoExtractRec.getSf31IsoCrncyConvFields();
			// End of variable declaration

      
// *
          // MOVE LOW-VALUES TO SF31-ISO-EXTRACT-REC
          sf31IsoExtractRec.setString(CONSTANTS.LOW_VALUE_215516604);

// *
//  MOVE SF501-HDR-HOUR TO 800-BIA-BYTE
          biaDataConvGroup800.getBiaDataConv800().setBiaByte800(sf501HdrTime.getSf501HdrHour());
  
//  MOVE 800-CONV-DATA TO 800-HOUR
          work.setHour800(biaDataConvGroup800.getBiaDataConv800Redefined().getConvData800());
//  MOVE SF501-HDR-MIN TO 800-BIA-BYTE
          biaDataConvGroup800.getBiaDataConv800().setBiaByte800(sf501HdrTime.getSf501HdrMin());
  
//  MOVE 800-CONV-DATA TO 800-MIN
          work.setMin800(biaDataConvGroup800.getBiaDataConv800Redefined().getConvData800());
//  MOVE SF501-HDR-SEC TO 800-BIA-BYTE
          biaDataConvGroup800.getBiaDataConv800().setBiaByte800(sf501HdrTime.getSf501HdrSec());
  
//  MOVE 800-CONV-DATA TO 800-SEC
          work.setSec800(biaDataConvGroup800.getBiaDataConv800Redefined().getConvData800());
//  MOVE ZEROS TO 808-WORK-COMP-TWO
          workCompTwoGroup808.setWorkCompTwo808(0);
//  MOVE SF501-HDR-MON TO 808-WORK-COMP-ONE-BYTE
          workCompTwoGroup808.getWorkCompTwo808Redefined().setWorkCompOneByte808(sf501HdrDate.getSf501HdrMon());
  
//  MOVE SF501-HDR-DAY TO 808-WORK-COMP-ONE-BYTE
          workCompTwoGroup808.getWorkCompTwo808Redefined().setWorkCompOneByte808(sf501HdrDate.getSf501HdrDay());
  
//  MOVE SF501-HDR-YEAR TO 808-WORK-COMP-ONE-BYTE
          workCompTwoGroup808.getWorkCompTwo808Redefined().setWorkCompOneByte808(sf501HdrDate.getSf501HdrYear());
  

// *
//  MOVE SF501-J-RESPONSE-IND TO 880-ASM-TRAN-BYTE
          asmSf910020Parms880.setAsmTranByte880(sf501Header.getSf501JResponseInd());
  
//  CALL 800-PTR-SF910020 USING 880-ASM-SF910020-PARMS
          // CALL 800-PTR-SF910020 USING 880-ASM-SF910020-PARMS
               this.setRc( sf910020.call(asmSf910020Parms880));
          asmBitSw880 = asmSf910020Parms880.getAsmBitSw880();
//  EVALUATE 88-880-BIT0-ON ALSO 88-880-BIT1-ON ALSO 88-880-BIT2-ON ALSO 88-880-BIT3-ON
          if  (( asmBitSw880.isBit0On88880()  )     && (!(asmBitSw880.isBit1On88880()) )     && (!(asmBitSw880.isBit2On88880()) )     && ( asmBitSw880.isBit3On88880()  )) { 
//  MOVE 300-NINE TO 800-ISO-BL-RESPONSE-1
              work.setIsoBlResponse1800(work.getNine300());
          }
          else if  (( asmBitSw880.isBit0On88880()  )     && (!(asmBitSw880.isBit1On88880()) )     && (!(asmBitSw880.isBit2On88880()) )     && (!(asmBitSw880.isBit3On88880()) )) { 
//  MOVE 300-EIGHT TO 800-ISO-BL-RESPONSE-1
              work.setIsoBlResponse1800(work.getEight300());
          }
          else if  ((!(asmBitSw880.isBit0On88880()) )     && ( asmBitSw880.isBit1On88880()  )     && ( asmBitSw880.isBit2On88880()  )     && ( asmBitSw880.isBit3On88880()  )) { 
//  MOVE 300-SEVEN TO 800-ISO-BL-RESPONSE-1
              work.setIsoBlResponse1800(work.getSeven300());
          }
          else if  ((!(asmBitSw880.isBit0On88880()) )     && ( asmBitSw880.isBit1On88880()  )     && ( asmBitSw880.isBit2On88880()  )     && (!(asmBitSw880.isBit3On88880()) )) { 
//  MOVE 300-SIX TO 800-ISO-BL-RESPONSE-1
              work.setIsoBlResponse1800(work.getSix300());
          }
          else if  ((!(asmBitSw880.isBit0On88880()) )     && ( asmBitSw880.isBit1On88880()  )     && (!(asmBitSw880.isBit2On88880()) )     && ( asmBitSw880.isBit3On88880()  )) { 
//  MOVE 300-FIVE TO 800-ISO-BL-RESPONSE-1
              work.setIsoBlResponse1800(work.getFive300());
          }
          else if  ((!(asmBitSw880.isBit0On88880()) )     && ( asmBitSw880.isBit1On88880()  )     && (!(asmBitSw880.isBit2On88880()) )     && (!(asmBitSw880.isBit3On88880()) )) { 
//  MOVE 300-FOUR TO 800-ISO-BL-RESPONSE-1
              work.setIsoBlResponse1800(work.getFour300());
          }
          else if  ((!(asmBitSw880.isBit0On88880()) )     && (!(asmBitSw880.isBit1On88880()) )     && ( asmBitSw880.isBit2On88880()  )     && ( asmBitSw880.isBit3On88880()  )) { 
//  MOVE 300-THREE TO 800-ISO-BL-RESPONSE-1
              work.setIsoBlResponse1800(work.getThree300());
          }
          else if  ((!(asmBitSw880.isBit0On88880()) )     && (!(asmBitSw880.isBit1On88880()) )     && ( asmBitSw880.isBit2On88880()  )     && (!(asmBitSw880.isBit3On88880()) )) { 
//  MOVE 300-TWO TO 800-ISO-BL-RESPONSE-1
              work.setIsoBlResponse1800(work.getTwo300());
          }
          else if  ((!(asmBitSw880.isBit0On88880()) )     && (!(asmBitSw880.isBit1On88880()) )     && (!(asmBitSw880.isBit2On88880()) )     && ( asmBitSw880.isBit3On88880()  )) { 
//  MOVE 300-ONE TO 800-ISO-BL-RESPONSE-1
              work.setIsoBlResponse1800(work.getOne300());
          }
  
          asmBitSw880 = asmSf910020Parms880.getAsmBitSw880();
//  EVALUATE 88-880-BIT4-ON ALSO 88-880-BIT5-ON ALSO 88-880-BIT6-ON ALSO 88-880-BIT7-ON
          if  (( asmBitSw880.isBit4On88880()  )     && (!(asmBitSw880.isBit5On88880()) )     && (!(asmBitSw880.isBit6On88880()) )     && ( asmBitSw880.isBit7On88880()  )) { 
//  MOVE 300-NINE TO 800-ISO-BL-RESPONSE-2
              work.setIsoBlResponse2800(work.getNine300());
          }
          else if  (( asmBitSw880.isBit4On88880()  )     && (!(asmBitSw880.isBit5On88880()) )     && (!(asmBitSw880.isBit6On88880()) )     && (!(asmBitSw880.isBit7On88880()) )) { 
//  MOVE 300-EIGHT TO 800-ISO-BL-RESPONSE-2
              work.setIsoBlResponse2800(work.getEight300());
          }
          else if  ((!(asmBitSw880.isBit4On88880()) )     && ( asmBitSw880.isBit5On88880()  )     && ( asmBitSw880.isBit6On88880()  )     && ( asmBitSw880.isBit7On88880()  )) { 
//  MOVE 300-SEVEN TO 800-ISO-BL-RESPONSE-2
              work.setIsoBlResponse2800(work.getSeven300());
          }
          else if  ((!(asmBitSw880.isBit4On88880()) )     && ( asmBitSw880.isBit5On88880()  )     && ( asmBitSw880.isBit6On88880()  )     && (!(asmBitSw880.isBit7On88880()) )) { 
//  MOVE 300-SIX TO 800-ISO-BL-RESPONSE-2
              work.setIsoBlResponse2800(work.getSix300());
          }
          else if  ((!(asmBitSw880.isBit4On88880()) )     && ( asmBitSw880.isBit5On88880()  )     && (!(asmBitSw880.isBit6On88880()) )     && ( asmBitSw880.isBit7On88880()  )) { 
//  MOVE 300-FIVE TO 800-ISO-BL-RESPONSE-2
              work.setIsoBlResponse2800(work.getFive300());
          }
          else if  ((!(asmBitSw880.isBit4On88880()) )     && ( asmBitSw880.isBit5On88880()  )     && (!(asmBitSw880.isBit6On88880()) )     && (!(asmBitSw880.isBit7On88880()) )) { 
//  MOVE 300-FOUR TO 800-ISO-BL-RESPONSE-2
              work.setIsoBlResponse2800(work.getFour300());
          }
          else if  ((!(asmBitSw880.isBit4On88880()) )     && (!(asmBitSw880.isBit5On88880()) )     && ( asmBitSw880.isBit6On88880()  )     && ( asmBitSw880.isBit7On88880()  )) { 
//  MOVE 300-THREE TO 800-ISO-BL-RESPONSE-2
              work.setIsoBlResponse2800(work.getThree300());
          }
          else if  ((!(asmBitSw880.isBit4On88880()) )     && (!(asmBitSw880.isBit5On88880()) )     && ( asmBitSw880.isBit6On88880()  )     && (!(asmBitSw880.isBit7On88880()) )) { 
//  MOVE 300-TWO TO 800-ISO-BL-RESPONSE-2
              work.setIsoBlResponse2800(work.getTwo300());
          }
          else if  ((!(asmBitSw880.isBit4On88880()) )     && (!(asmBitSw880.isBit5On88880()) )     && (!(asmBitSw880.isBit6On88880()) )     && ( asmBitSw880.isBit7On88880()  )) { 
//  MOVE 300-ONE TO 800-ISO-BL-RESPONSE-2
              work.setIsoBlResponse2800(work.getOne300());
          }
  
//  MOVE SF501-J-DOWN-OPTION TO 880-ASM-TRAN-BYTE
          asmSf910020Parms880.setAsmTranByte880(sf501Header.getSf501JDownOption());
  
//  MOVE ZEROS TO 880-ASM-BIT-SW
          asmSf910020Parms880.getAsmBitSw880().setString(CONSTANTS.ZERO_8);
//  CALL 800-PTR-SF910020 USING 880-ASM-SF910020-PARMS
          // CALL 800-PTR-SF910020 USING 880-ASM-SF910020-PARMS
               this.setRc( sf910020.call(asmSf910020Parms880));
          asmBitSw880 = asmSf910020Parms880.getAsmBitSw880();
//  EVALUATE 88-880-BIT0-ON ALSO 88-880-BIT1-ON ALSO 88-880-BIT2-ON ALSO 88-880-BIT3-ON
          if  (( asmBitSw880.isBit0On88880()  )     && (!(asmBitSw880.isBit1On88880()) )     && (!(asmBitSw880.isBit2On88880()) )     && ( asmBitSw880.isBit3On88880()  )) { 
//  MOVE 300-NINE TO 800-ISO-BL-DOWN-1
              work.setIsoBlDown1800(work.getNine300());
          }
          else if  (( asmBitSw880.isBit0On88880()  )     && (!(asmBitSw880.isBit1On88880()) )     && (!(asmBitSw880.isBit2On88880()) )     && (!(asmBitSw880.isBit3On88880()) )) { 
//  MOVE 300-EIGHT TO 800-ISO-BL-DOWN-1
              work.setIsoBlDown1800(work.getEight300());
          }
          else if  ((!(asmBitSw880.isBit0On88880()) )     && ( asmBitSw880.isBit1On88880()  )     && ( asmBitSw880.isBit2On88880()  )     && ( asmBitSw880.isBit3On88880()  )) { 
//  MOVE 300-SEVEN TO 800-ISO-BL-DOWN-1
              work.setIsoBlDown1800(work.getSeven300());
          }
          else if  ((!(asmBitSw880.isBit0On88880()) )     && ( asmBitSw880.isBit1On88880()  )     && ( asmBitSw880.isBit2On88880()  )     && (!(asmBitSw880.isBit3On88880()) )) { 
//  MOVE 300-SIX TO 800-ISO-BL-DOWN-1
              work.setIsoBlDown1800(work.getSix300());
          }
          else if  ((!(asmBitSw880.isBit0On88880()) )     && ( asmBitSw880.isBit1On88880()  )     && (!(asmBitSw880.isBit2On88880()) )     && ( asmBitSw880.isBit3On88880()  )) { 
//  MOVE 300-FIVE TO 800-ISO-BL-DOWN-1
              work.setIsoBlDown1800(work.getFive300());
          }
          else if  ((!(asmBitSw880.isBit0On88880()) )     && ( asmBitSw880.isBit1On88880()  )     && (!(asmBitSw880.isBit2On88880()) )     && (!(asmBitSw880.isBit3On88880()) )) { 
//  MOVE 300-FOUR TO 800-ISO-BL-DOWN-1
              work.setIsoBlDown1800(work.getFour300());
          }
          else if  ((!(asmBitSw880.isBit0On88880()) )     && (!(asmBitSw880.isBit1On88880()) )     && ( asmBitSw880.isBit2On88880()  )     && ( asmBitSw880.isBit3On88880()  )) { 
//  MOVE 300-THREE TO 800-ISO-BL-DOWN-1
              work.setIsoBlDown1800(work.getThree300());
          }
          else if  ((!(asmBitSw880.isBit0On88880()) )     && (!(asmBitSw880.isBit1On88880()) )     && ( asmBitSw880.isBit2On88880()  )     && (!(asmBitSw880.isBit3On88880()) )) { 
//  MOVE 300-TWO TO 800-ISO-BL-DOWN-1
              work.setIsoBlDown1800(work.getTwo300());
          }
          else if  ((!(asmBitSw880.isBit0On88880()) )     && (!(asmBitSw880.isBit1On88880()) )     && (!(asmBitSw880.isBit2On88880()) )     && ( asmBitSw880.isBit3On88880()  )) { 
//  MOVE 300-ONE TO 800-ISO-BL-DOWN-1
              work.setIsoBlDown1800(work.getOne300());
          }
          else if  ((!(asmBitSw880.isBit0On88880()) )     && (!(asmBitSw880.isBit1On88880()) )     && (!(asmBitSw880.isBit2On88880()) )     && (!(asmBitSw880.isBit3On88880()) )) { 
//  MOVE ZERO TO 800-ISO-BL-DOWN-1
              work.setIsoBlDown1800(0);
          }
  
          asmBitSw880 = asmSf910020Parms880.getAsmBitSw880();
//  EVALUATE 88-880-BIT4-ON ALSO 88-880-BIT5-ON ALSO 88-880-BIT6-ON ALSO 88-880-BIT7-ON
          if  (( asmBitSw880.isBit4On88880()  )     && (!(asmBitSw880.isBit5On88880()) )     && (!(asmBitSw880.isBit6On88880()) )     && ( asmBitSw880.isBit7On88880()  )) { 
//  MOVE 300-NINE TO 800-ISO-BL-DOWN-2
              work.setIsoBlDown2800(work.getNine300());
          }
          else if  (( asmBitSw880.isBit4On88880()  )     && (!(asmBitSw880.isBit5On88880()) )     && (!(asmBitSw880.isBit6On88880()) )     && (!(asmBitSw880.isBit7On88880()) )) { 
//  MOVE 300-EIGHT TO 800-ISO-BL-DOWN-2
              work.setIsoBlDown2800(work.getEight300());
          }
          else if  ((!(asmBitSw880.isBit4On88880()) )     && ( asmBitSw880.isBit5On88880()  )     && ( asmBitSw880.isBit6On88880()  )     && ( asmBitSw880.isBit7On88880()  )) { 
//  MOVE 300-SEVEN TO 800-ISO-BL-DOWN-2
              work.setIsoBlDown2800(work.getSeven300());
          }
          else if  ((!(asmBitSw880.isBit4On88880()) )     && ( asmBitSw880.isBit5On88880()  )     && ( asmBitSw880.isBit6On88880()  )     && (!(asmBitSw880.isBit7On88880()) )) { 
//  MOVE 300-SIX TO 800-ISO-BL-DOWN-2
              work.setIsoBlDown2800(work.getSix300());
          }
          else if  ((!(asmBitSw880.isBit4On88880()) )     && ( asmBitSw880.isBit5On88880()  )     && (!(asmBitSw880.isBit6On88880()) )     && ( asmBitSw880.isBit7On88880()  )) { 
//  MOVE 300-FIVE TO 800-ISO-BL-DOWN-2
              work.setIsoBlDown2800(work.getFive300());
          }
          else if  ((!(asmBitSw880.isBit4On88880()) )     && ( asmBitSw880.isBit5On88880()  )     && (!(asmBitSw880.isBit6On88880()) )     && (!(asmBitSw880.isBit7On88880()) )) { 
//  MOVE 300-FOUR TO 800-ISO-BL-DOWN-2
              work.setIsoBlDown2800(work.getFour300());
          }
          else if  ((!(asmBitSw880.isBit4On88880()) )     && (!(asmBitSw880.isBit5On88880()) )     && ( asmBitSw880.isBit6On88880()  )     && ( asmBitSw880.isBit7On88880()  )) { 
//  MOVE 300-THREE TO 800-ISO-BL-DOWN-2
              work.setIsoBlDown2800(work.getThree300());
          }
          else if  ((!(asmBitSw880.isBit4On88880()) )     && (!(asmBitSw880.isBit5On88880()) )     && ( asmBitSw880.isBit6On88880()  )     && (!(asmBitSw880.isBit7On88880()) )) { 
//  MOVE 300-TWO TO 800-ISO-BL-DOWN-2
              work.setIsoBlDown2800(work.getTwo300());
          }
          else if  ((!(asmBitSw880.isBit4On88880()) )     && (!(asmBitSw880.isBit5On88880()) )     && (!(asmBitSw880.isBit6On88880()) )     && ( asmBitSw880.isBit7On88880()  )) { 
//  MOVE 300-ONE TO 800-ISO-BL-DOWN-2
              work.setIsoBlDown2800(work.getOne300());
          }
          else if  ((!(asmBitSw880.isBit4On88880()) )     && (!(asmBitSw880.isBit5On88880()) )     && (!(asmBitSw880.isBit6On88880()) )     && (!(asmBitSw880.isBit7On88880()) )) { 
//  MOVE ZERO TO 800-ISO-BL-DOWN-2
              work.setIsoBlDown2800(0);
          }
  

// ****************************************************************
// * Meg-304 start  made changes to the moto-option to work with
// *                the assembler routine used for iss and acq
// *                currency certified as well as moto.
//  MOVE SF501-J-MOTO-OPTION TO 880-ASM-TRAN-BYTE
          asmSf910020Parms880.setAsmTranByte880(sf501Header.getSf501JMotoOption());
  
//  MOVE ZEROS TO 880-ASM-BIT-SW
          asmSf910020Parms880.getAsmBitSw880().setString(CONSTANTS.ZERO_8);
//  CALL 800-PTR-SF910020 USING 880-ASM-SF910020-PARMS
          // CALL 800-PTR-SF910020 USING 880-ASM-SF910020-PARMS
               this.setRc( sf910020.call(asmSf910020Parms880));
          asmBitSw880 = asmSf910020Parms880.getAsmBitSw880();
//  EVALUATE 88-880-BIT0-ON ALSO 88-880-BIT1-ON ALSO 88-880-BIT2-ON ALSO 88-880-BIT3-ON
          if  (( asmBitSw880.isBit0On88880()  )     && (!(asmBitSw880.isBit1On88880()) )     && (!(asmBitSw880.isBit2On88880()) )     && ( asmBitSw880.isBit3On88880()  )) { 
//  MOVE 300-NINE TO 800-ISO-BL-MOTO-1
              work.setIsoBlMoto1800(work.getNine300());
          }
          else if  (( asmBitSw880.isBit0On88880()  )     && (!(asmBitSw880.isBit1On88880()) )     && (!(asmBitSw880.isBit2On88880()) )     && (!(asmBitSw880.isBit3On88880()) )) { 
//  MOVE 300-EIGHT TO 800-ISO-BL-MOTO-1
              work.setIsoBlMoto1800(work.getEight300());
          }
          else if  ((!(asmBitSw880.isBit0On88880()) )     && ( asmBitSw880.isBit1On88880()  )     && ( asmBitSw880.isBit2On88880()  )     && ( asmBitSw880.isBit3On88880()  )) { 
//  MOVE 300-SEVEN TO 800-ISO-BL-MOTO-1
              work.setIsoBlMoto1800(work.getSeven300());
          }
          else if  ((!(asmBitSw880.isBit0On88880()) )     && ( asmBitSw880.isBit1On88880()  )     && ( asmBitSw880.isBit2On88880()  )     && (!(asmBitSw880.isBit3On88880()) )) { 
//  MOVE 300-SIX TO 800-ISO-BL-MOTO-1
              work.setIsoBlMoto1800(work.getSix300());
          }
          else if  ((!(asmBitSw880.isBit0On88880()) )     && ( asmBitSw880.isBit1On88880()  )     && (!(asmBitSw880.isBit2On88880()) )     && ( asmBitSw880.isBit3On88880()  )) { 
//  MOVE 300-FIVE TO 800-ISO-BL-MOTO-1
              work.setIsoBlMoto1800(work.getFive300());
          }
          else if  ((!(asmBitSw880.isBit0On88880()) )     && ( asmBitSw880.isBit1On88880()  )     && (!(asmBitSw880.isBit2On88880()) )     && (!(asmBitSw880.isBit3On88880()) )) { 
//  MOVE 300-FOUR TO 800-ISO-BL-MOTO-1
              work.setIsoBlMoto1800(work.getFour300());
          }
          else if  ((!(asmBitSw880.isBit0On88880()) )     && (!(asmBitSw880.isBit1On88880()) )     && ( asmBitSw880.isBit2On88880()  )     && ( asmBitSw880.isBit3On88880()  )) { 
//  MOVE 300-THREE TO 800-ISO-BL-MOTO-1
              work.setIsoBlMoto1800(work.getThree300());
          }
          else if  ((!(asmBitSw880.isBit0On88880()) )     && (!(asmBitSw880.isBit1On88880()) )     && ( asmBitSw880.isBit2On88880()  )     && (!(asmBitSw880.isBit3On88880()) )) { 
//  MOVE 300-TWO TO 800-ISO-BL-MOTO-1
              work.setIsoBlMoto1800(work.getTwo300());
          }
          else if  ((!(asmBitSw880.isBit0On88880()) )     && (!(asmBitSw880.isBit1On88880()) )     && (!(asmBitSw880.isBit2On88880()) )     && ( asmBitSw880.isBit3On88880()  )) { 
//  MOVE 300-ONE TO 800-ISO-BL-MOTO-1
              work.setIsoBlMoto1800(work.getOne300());
          }
          else if  ((!(asmBitSw880.isBit0On88880()) )     && (!(asmBitSw880.isBit1On88880()) )     && (!(asmBitSw880.isBit2On88880()) )     && (!(asmBitSw880.isBit3On88880()) )) { 
//  MOVE ZERO TO 800-ISO-BL-MOTO-1
              work.setIsoBlMoto1800(0);
          }
  

// ****************************************************************
//  MOVE 860-CARDHOLDER-NBR TO SF31-ISO-CARDHOLDER-NBR
          sf31IsoExtractRec.setSf31IsoCardholderNbr(logDecompressedData860.getCardholderNbr860());
//  MOVE 860-AUTH-NUMBER TO SF31-ISO-AUTH-NUMBER
          sf31IsoExtractRec.setSf31IsoAuthNumber(logDecompressedData860.getAuthNumber860());
//  MOVE 860-AUTH-RESPONSE TO SF31-ISO-AUTH-RESPONSE
          sf31IsoExtractRec.setSf31IsoAuthResponse(logDecompressedData860.getAuthResponse860());
//  MOVE 860-AUTH-ADDL-DATA TO SF31-ISO-AUTH-ADDL-DATA
          sf31IsoExtractRec.setSf31IsoAuthAddlData(logDecompressedData860.getAuthAddlData860());
//  MOVE 860-CARDHOLDER-EXPDT TO SF31-ISO-CARDHOLDER-EXPDT
          sf31IsoExtractRec.setSf31IsoCardholderExpdt(logDecompressedData860.getCardholderExpdt860());
//  MOVE 860-TRACK-TWO-DATA TO SF31-ISO-TRACK-TWO-DATA
          sf31IsoExtractRec.setSf31IsoTrackTwoData(logDecompressedData860.getTrackTwoData860());
//  MOVE 860-TRACK-ONE-DATA TO SF31-ISO-TRACK-ONE-DATA
          sf31IsoExtractRec.setSf31IsoTrackOneData(logDecompressedData860.getTrackOneData860());
          // MOVE 860-SYS-TRACE-AUDIT TO 800-TRACE-AUDIT
          de11TraceAudit800.setTraceAudit800(padLeftZeros(6,logDecompressedData860.getSysTraceAudit860(),false));
          // MOVE 800-DE11-TRACE-AUDIT TO SF31-ISO-BL-IC-SEQ-NO
          sf31IsoExtractRec.setSf31IsoBlIcSeqNo(de11TraceAudit800.toCharArray());
//  MOVE 860-POS-DATA TO SF31-ISO-POS-DATA
          sf31IsoExtractRec.setSf31IsoPosData(logDecompressedData860.getPosData860());

// ****************************************************************
//  MOVE ZEROS TO 800-WORK-ACQ-ICA
          workAcqIcaGroup800.setWorkAcqIca800(0);
//  MOVE 860-ACQUIRER-ICA TO 800-ACQUIRER-ICA
          acquirerIca800.setString(logDecompressedData860.getAcquirerIca860());
          acqFiller1800 = acquirerIcaOnly5800.getAcqFiller1800();
//  IF 800-ACQ-FILLER-1 = LOW-VALUES OR 800-ACQ-FILLER-1 = SPACES
          if (			( checkLowValue(acqFiller1800) )  ||         ( allSpaces(acqFiller1800)   )) { 
//  MOVE 800-ACQUIRER-ICA-ONLY4 TO 800-ACQ-ICA-ONLY4
              acqIcaOnly5800.setAcqIcaOnly4800(acquirerIcaOnly5800.getAcquirerIcaOnly4800());
  
//  MOVE 800-WORK-ACQ-ICA TO SF31-ISO-ACQUIRER-ICA
              sf31IsoExtractRec.setSf31IsoAcquirerIca(String.valueOf(workAcqIcaGroup800.getWorkAcqIca800String()).toCharArray());
          }
  
//  ELSE
          else { 
              acqFiller2800 = acquirerIca800.getAcqFiller2800();
//  IF 800-ACQ-FILLER-2 = LOW-VALUES OR 800-ACQ-FILLER-2 = SPACES
              if (			( checkLowValue(acqFiller2800) )  ||         ( allSpaces(acqFiller2800)   )) { 
                  // MOVE 800-ACQUIRER-ICA-ONLY5 TO 800-ACQ-ICA-ONLY5
                  workAcqIcaGroup800.getWorkAcqIca800Redefined().getAcqIcaOnly5800().setString(acquirerIca800.getAcquirerIcaOnly5800().getCharArray());
//  MOVE 800-WORK-ACQ-ICA TO SF31-ISO-ACQUIRER-ICA
                  sf31IsoExtractRec.setSf31IsoAcquirerIca(String.valueOf(workAcqIcaGroup800.getWorkAcqIca800String()).toCharArray());
              }
  
//  ELSE
              else { 
//  MOVE 860-ACQUIRER-ICA TO SF31-ISO-ACQUIRER-ICA
                  sf31IsoExtractRec.setSf31IsoAcquirerIca(logDecompressedData860.getAcquirerIca860());
              }
          }

// *
//  MOVE ZEROS TO 800-WORK-FWD-ICA
          workFwdIcaGroup800.setWorkFwdIca800(0);
//  MOVE 860-FORWARD-INST-ID TO 800-FORWARD-ICA
          forwardIca800.setString(logDecompressedData860.getForwardInstId860());
          forwardInstId860 = logDecompressedData860.getForwardInstId860();
//  IF 860-FORWARD-INST-ID = LOW-VALUES
          if (			( checkLowValue(forwardInstId860) ) ) { 
//  MOVE 860-FORWARD-INST-ID TO SF31-ISO-FORWARD-INST-ID-ONLY
              sf31IsoExtractRec.setSf31IsoForwardInstIdOnly(logDecompressedData860.getForwardInstId860());
          }
  
//  ELSE
          else { 
              fwdFiller1800 = forwardIcaOnly5800.getFwdFiller1800();
//  IF 800-FWD-FILLER-1 = LOW-VALUES OR 800-FWD-FILLER-1 = SPACES
              if (			( checkLowValue(fwdFiller1800) )  ||         ( allSpaces(fwdFiller1800)   )) { 
//  MOVE 800-FORWARD-ICA-ONLY4 TO 800-FWD-ICA-ONLY4
                  fwdIcaOnly5800.setFwdIcaOnly4800(forwardIcaOnly5800.getForwardIcaOnly4800());
  
//  MOVE 800-WORK-FWD-ICA TO SF31-ISO-FORWARD-INST-ID-ONLY
                  sf31IsoExtractRec.setSf31IsoForwardInstIdOnly(String.valueOf(workFwdIcaGroup800.getWorkFwdIca800String()).toCharArray());
              }
  
//  ELSE
              else { 
                  fwdFiller2800 = forwardIca800.getFwdFiller2800();
//  IF 800-FWD-FILLER-2 = LOW-VALUES OR 800-FWD-FILLER-2 = SPACES
                  if (			( checkLowValue(fwdFiller2800) )  ||         ( allSpaces(fwdFiller2800)   )) { 
                      // MOVE 800-FORWARD-ICA-ONLY5 TO 800-FWD-ICA-ONLY5
                      workFwdIcaGroup800.getWorkFwdIca800Redefined().getFwdIcaOnly5800().setString(forwardIca800.getForwardIcaOnly5800().getCharArray());
//  MOVE 800-WORK-FWD-ICA TO SF31-ISO-FORWARD-INST-ID-ONLY
                      sf31IsoExtractRec.setSf31IsoForwardInstIdOnly(String.valueOf(workFwdIcaGroup800.getWorkFwdIca800String()).toCharArray());
                  }
  
//  ELSE
                  else { 
//  MOVE 860-FORWARD-INST-ID TO SF31-ISO-FORWARD-INST-ID-ONLY
                      sf31IsoExtractRec.setSf31IsoForwardInstIdOnly(logDecompressedData860.getForwardInstId860());
                  }
              }
          }

// *
          timeLocalTrans100860 = logDecompressedData860.getTimeLocalTrans100860();
//  IF 860-TIME-LOCAL-TRANS-100 (1 : 1) > LOW-VALUES
          if (		( isGreaterThanLowValue(substring(logDecompressedData860.getTimeLocalTrans100860String(),0,1)) ) ) { 
              // MOVE 860-TIME-LOCAL-TRANS-100 TO SF31-ISO-TIME-LOCAL-TRANS
              sf31IsoExtractRec.setSf31IsoTimeLocalTrans(logDecompressedData860.getTimeLocalTrans100860());
          }
  

// *
          dateLocalTrans100860 = logDecompressedData860.getDateLocalTrans100860();
//  IF 860-DATE-LOCAL-TRANS-100 (1 : 1) > LOW-VALUES
          if (		( isGreaterThanLowValue(substring(logDecompressedData860.getDateLocalTrans100860String(),0,1)) ) ) { 
//  MOVE 860-DATE-LOCAL-TRANS-100 TO SF31-ISO-DATE-LOCAL-TRANS
              sf31IsoExtractRec.setSf31IsoDateLocalTrans(logDecompressedData860.getDateLocalTrans100860());
          }
  

// *
          posDeviceType860 = logDecompressedData860.getPosDeviceType860();
//  IF 860-POS-DEVICE-TYPE (1 : 1) > LOW-VALUES
          if (		( isGreaterThanLowValue(substring(posDeviceType860,0,1)) ) ) { 
//  MOVE 860-POS-DEVICE-TYPE TO SF31-ISO-POS-DEVICE-TYPE
              sf31IsoExtractRec.setSf31IsoPosDeviceType(logDecompressedData860.getPosDeviceType860());
          }
  
//  ELSE
          else { 
              posEntry110860 = logDecompressedData860.getPosEntry110860();
//  IF 860-POS-ENTRY-110 (1 : 1) > LOW-VALUES
              if (		( isGreaterThanLowValue(substring(logDecompressedData860.getPosEntry110860String(),0,1)) ) ) { 
//  MOVE 860-POS-ENTRY-110 TO SF31-ISO-POS-DEVICE-TYPE
                  sf31IsoExtractRec.setSf31IsoPosDeviceType(String.valueOf(logDecompressedData860.getPosEntry110860String()).toCharArray());
              }
  
          }

// *
//  IF SI583-DE-LENGTH-1 (48) > ZERO
          if (	( si583DataElementWorkArea1.getSi583Filler1(47).getSi583DeLength1() > 0 ) ) { 
//  MOVE SPACE TO 500-DE48-DATA
              de48DataGroup500.setDe48Data500(CONSTANTS.SPACE_999);
              si583Mti1 = si583ParserArea.getSi583Mti1();
              mti0110300 = work.getMti0110300();
//  IF SI583-MTI-1 EQUAL 300-MTI-0110
              if (compareChars(si583Mti1,String.valueOf(work.getMti0110300String()).toCharArray()) == 0) { 
//  SET 88-100-MTI1-0110 TO TRUE
                  work.setMti1011088100True(); 
                  
              }
  
//  ELSE
              else { 
//  SET 88-100-MTI1-0100 TO TRUE
                  work.setMti1010088100True(); 
                  
              }
//  MOVE SI583-DE-LENGTH-1 (48) TO SEPR-DATA-LENGTH
              seprControlBlock.setSeprDataLength(si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(47).getSi583DeLength1());
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (48) : SEPR-DATA-LENGTH ) TO 500-DE48-DATA (1 : SEPR-DATA-LENGTH )
              de48DataGroup500.replace(dataGroup1000/*parent*/,0+si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(47).getSi583DeStartingPos1() - 1/*fromOffset - (de48Data500) */,seprControlBlock.getSeprDataLength()/*fromLen*/,0/*toOffset - (data1000) */,seprControlBlock.getSeprDataLength()/*toLen*/);
//  MOVE 500-DE48-DATA (1 : 1) TO SF31-ISO-TRANSACTION-TYPE
              sf31IsoExtractRec.setSf31IsoTransactionType(de48DataGroup500.getDe48Data500());
//  MOVE 500-DE48-DATA (1 : 3) TO SF31-ISO-ADDTL-DATA
              sf31IsoExtractRec.setSf31IsoAddtlData(de48DataGroup500.getDe48Data500());
//  PERFORM 8000-PROCESS-DE48
              processDe48();/*8000-PROCESS-DE48*/
          }
  
//  ELSE
          else { 
//  IF SI583-DE-LENGTH-2 (48) > ZERO
              if (	( si583DataElementWorkArea2.getSi583Filler2(47).getSi583DeLength2() > 0 ) ) { 
//  MOVE SPACE TO 500-DE48-DATA
                  de48DataGroup500.setDe48Data500(CONSTANTS.SPACE_999);
                  mti0100300 = work.getMti0100300();
                  si583Mti2 = si583ParserArea.getSi583Mti2();
//  IF SI583-MTI-2 EQUAL 300-MTI-0100
                  if (compareChars(si583Mti2,String.valueOf(work.getMti0100300String()).toCharArray()) == 0) { 
//  SET 88-100-MTI2-0100 TO TRUE
                      work.setMti2010088100True(); 
                      
                  }
  
//  ELSE
                  else { 
//  SET 88-100-MTI2-0110 TO TRUE
                      work.setMti2011088100True(); 
                      
                  }
//  MOVE SI583-DE-LENGTH-2 (48) TO SEPR-DATA-LENGTH
                  seprControlBlock.setSeprDataLength(si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(47).getSi583DeLength2());
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (48) : SEPR-DATA-LENGTH ) TO 500-DE48-DATA (1 : SEPR-DATA-LENGTH )
                  de48DataGroup500.replace(dataGroup1000/*parent*/,0+si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(47).getSi583DeStartingPos2() - 1/*fromOffset - (de48Data500) */,seprControlBlock.getSeprDataLength()/*fromLen*/,0/*toOffset - (data1000) */,seprControlBlock.getSeprDataLength()/*toLen*/);
//  MOVE 500-DE48-DATA (1 : 1) TO SF31-ISO-TRANSACTION-TYPE
                  sf31IsoExtractRec.setSf31IsoTransactionType(de48DataGroup500.getDe48Data500());
//  MOVE 500-DE48-DATA (1 : 3) TO SF31-ISO-ADDTL-DATA
                  sf31IsoExtractRec.setSf31IsoAddtlData(de48DataGroup500.getDe48Data500());
//  PERFORM 8000-PROCESS-DE48
                  processDe48();/*8000-PROCESS-DE48*/
              }
  
          }

// *
          finNetwork110860 = bkntData110860.getFinNetwork110860();
//  IF 860-FIN-NETWORK-110 (1 : 1) > LOW-VALUES
          if (		( isGreaterThanLowValue(substring(finNetwork110860,0,1)) ) ) { 
//  MOVE 860-FIN-NETWORK-110 TO SF31-ISO-FIN-NETWORK-CODE
              sf31IsoExtractRec.setSf31IsoFinNetworkCode(bkntData110860.getFinNetwork110860());
  
          }
  
//  ELSE
          else { 
              finNetworkCode860 = bkntData860.getFinNetworkCode860();
//  IF 860-FIN-NETWORK-CODE (1 : 1) > LOW-VALUES
              if (		( isGreaterThanLowValue(substring(finNetworkCode860,0,1)) ) ) { 
//  MOVE 860-FIN-NETWORK-CODE TO SF31-ISO-FIN-NETWORK-CODE
                  sf31IsoExtractRec.setSf31IsoFinNetworkCode(bkntData860.getFinNetworkCode860());
  
              }
  
          }

// *
          processingCode110860 = logDecompressedData860.getProcessingCode110860();
//  IF 860-PROCESSING-CODE-110 (1 : 1) > LOW-VALUES
          if (		( isGreaterThanLowValue(substring(logDecompressedData860.getProcessingCode110860String(),0,1)) ) ) { 
//  MOVE 860-PROCESSING-CODE-110 TO SF31-ISO-PROCESSING-CODE
              sf31IsoExtractRec.setSf31IsoProcessingCode(String.valueOf(logDecompressedData860.getProcessingCode110860String()).toCharArray());
          }
  
//  ELSE
          else { 
              processingCode100860 = logDecompressedData860.getProcessingCode100860();
//  IF 860-PROCESSING-CODE-100 (1 : 1) > LOW-VALUES
              if (		( isGreaterThanLowValue(substring(logDecompressedData860.getProcessingCode100860String(),0,1)) ) ) { 
//  MOVE 860-PROCESSING-CODE-100 TO SF31-ISO-PROCESSING-CODE
                  sf31IsoExtractRec.setSf31IsoProcessingCode(String.valueOf(logDecompressedData860.getProcessingCode100860String()).toCharArray());
              }
  
          }

// *
          dateTimeXmit110860 = logDecompressedData860.getDateTimeXmit110860();
//  IF 860-DATE-TIME-XMIT-110 (1 : 1) > LOW-VALUES
          if (		( isGreaterThanLowValue(substring(logDecompressedData860.getDateTimeXmit110860String(),0,1)) ) ) { 
//  MOVE 860-DATE-TIME-XMIT-110 TO SF31-ISO-DATE-TIME-XMIT
              sf31IsoExtractRec.setSf31IsoDateTimeXmit(String.valueOf(logDecompressedData860.getDateTimeXmit110860String()).toCharArray());
          }
  
//  ELSE
          else { 
              dateTimeXmit100860 = logDecompressedData860.getDateTimeXmit100860();
//  IF 860-DATE-TIME-XMIT-100 (1 : 1) > LOW-VALUES
              if (		( isGreaterThanLowValue(substring(logDecompressedData860.getDateTimeXmit100860String(),0,1)) ) ) { 
//  MOVE 860-DATE-TIME-XMIT-100 TO SF31-ISO-DATE-TIME-XMIT
                  sf31IsoExtractRec.setSf31IsoDateTimeXmit(String.valueOf(logDecompressedData860.getDateTimeXmit100860String()).toCharArray());
              }
  
          }

// *
          transMmdd110860 = logDecompressedData860.getTransMmdd110860();
//  IF 860-TRANS-MMDD-110 (1 : 1) > LOW-VALUES
          if (		( isGreaterThanLowValue(substring(logDecompressedData860.getTransMmdd110860String(),0,1)) ) ) { 
//  MOVE 860-TRANS-MMDD-110 TO SF31-ISO-TRANS-MMDD
              sf31IsoTransDate.setSf31IsoTransMmdd(String.valueOf(logDecompressedData860.getTransMmdd110860String()).toCharArray());
  
          }
  
//  ELSE
          else { 
              transMmdd860 = logDecompressedData860.getTransMmdd860();
//  IF 860-TRANS-MMDD (1 : 1) > LOW-VALUES
              if (		( isGreaterThanLowValue(substring(logDecompressedData860.getTransMmdd860String(),0,1)) ) ) { 
//  MOVE 860-TRANS-MMDD TO SF31-ISO-TRANS-MMDD
                  sf31IsoTransDate.setSf31IsoTransMmdd(String.valueOf(logDecompressedData860.getTransMmdd860String()).toCharArray());
  
              }
  
          }

// *
          merchantType110860 = logDecompressedData860.getMerchantType110860();
//  IF 860-MERCHANT-TYPE-110 (1 : 1) > LOW-VALUES
          if (		( isGreaterThanLowValue(substring(logDecompressedData860.getMerchantType110860String(),0,1)) ) ) { 
//  MOVE 860-MERCHANT-TYPE-110 TO SF31-ISO-MERCHANT-TYPE
              sf31IsoExtractRec.setSf31IsoMerchantType(String.valueOf(logDecompressedData860.getMerchantType110860String()).toCharArray());
          }
  
//  ELSE
          else { 
              merchantType860 = logDecompressedData860.getMerchantType860();
//  IF 860-MERCHANT-TYPE (1 : 1) > LOW-VALUES
              if (		( isGreaterThanLowValue(substring(logDecompressedData860.getMerchantType860String(),0,1)) ) ) { 
//  MOVE 860-MERCHANT-TYPE TO SF31-ISO-MERCHANT-TYPE
                  sf31IsoExtractRec.setSf31IsoMerchantType(String.valueOf(logDecompressedData860.getMerchantType860String()).toCharArray());
              }
  
          }

// *
          countryCode110860 = logDecompressedData860.getCountryCode110860();
//  IF 860-COUNTRY-CODE-110 (1 : 1) > LOW-VALUES
          if (		( isGreaterThanLowValue(substring(countryCode110860,0,1)) ) ) { 
//  MOVE 860-COUNTRY-CODE-110 TO SF31-ISO-COUNTRY-CODE
              sf31IsoExtractRec.setSf31IsoCountryCode(logDecompressedData860.getCountryCode110860());
          }
  
//  ELSE
          else { 
              countryCode860 = logDecompressedData860.getCountryCode860();
//  IF 860-COUNTRY-CODE (1 : 1) > LOW-VALUES
              if (		( isGreaterThanLowValue(substring(countryCode860,0,1)) ) ) { 
//  MOVE 860-COUNTRY-CODE TO SF31-ISO-COUNTRY-CODE
                  sf31IsoExtractRec.setSf31IsoCountryCode(logDecompressedData860.getCountryCode860());
              }
  
          }

// *
          posPinCapture110860 = logDecompressedData860.getPosPinCapture110860();
//  IF 860-POS-PIN-CAPTURE-110 (1 : 1) > LOW-VALUES
          if (		( isGreaterThanLowValue(substring(logDecompressedData860.getPosPinCapture110860String(),0,1)) ) ) { 
//  MOVE 860-POS-PIN-CAPTURE-110 TO SF31-ISO-POS-PIN-CAPTURE
              sf31IsoExtractRec.setSf31IsoPosPinCapture(String.valueOf(logDecompressedData860.getPosPinCapture110860String()).toCharArray());
          }
  
//  ELSE
          else { 
              posPinCapture860 = logDecompressedData860.getPosPinCapture860();
//  IF 860-POS-PIN-CAPTURE (1 : 1) > LOW-VALUES
              if (		( isGreaterThanLowValue(substring(logDecompressedData860.getPosPinCapture860String(),0,1)) ) ) { 
//  MOVE 860-POS-PIN-CAPTURE TO SF31-ISO-POS-PIN-CAPTURE
                  sf31IsoExtractRec.setSf31IsoPosPinCapture(String.valueOf(logDecompressedData860.getPosPinCapture860String()).toCharArray());
              }
  
          }

// *
          retrievalRefno110860 = logDecompressedData860.getRetrievalRefno110860();
//  IF 860-RETRIEVAL-REFNO-110 (1 : 1) > LOW-VALUES
          if (		( isGreaterThanLowValue(substring(retrievalRefno110860,0,1)) ) ) { 
//  MOVE 860-RETRIEVAL-REFNO-110 TO SF31-ISO-RETRIEVAL-REFNO
              sf31IsoExtractRec.setSf31IsoRetrievalRefno(logDecompressedData860.getRetrievalRefno110860());
          }
  
//  ELSE
          else { 
              retrievalRefno860 = logDecompressedData860.getRetrievalRefno860();
//  IF 860-RETRIEVAL-REFNO (1 : 1) > LOW-VALUES
              if (		( isGreaterThanLowValue(substring(retrievalRefno860,0,1)) ) ) { 
//  MOVE 860-RETRIEVAL-REFNO TO SF31-ISO-RETRIEVAL-REFNO
                  sf31IsoExtractRec.setSf31IsoRetrievalRefno(logDecompressedData860.getRetrievalRefno860());
              }
  
          }

// *
          idTerminal110860 = logDecompressedData860.getIdTerminal110860();
//  IF 860-ID-TERMINAL-110 (1 : 1) > LOW-VALUES
          if (		( isGreaterThanLowValue(substring(idTerminal110860,0,1)) ) ) { 
//  MOVE 860-ID-TERMINAL-110 TO SF31-ISO-ID-TERMINAL
              sf31IsoExtractRec.setSf31IsoIdTerminal(logDecompressedData860.getIdTerminal110860());
          }
  
//  ELSE
          else { 
              idTerminal860 = logDecompressedData860.getIdTerminal860();
//  IF 860-ID-TERMINAL (1 : 1) > LOW-VALUES
              if (		( isGreaterThanLowValue(substring(idTerminal860,0,1)) ) ) { 
//  MOVE 860-ID-TERMINAL TO SF31-ISO-ID-TERMINAL
                  sf31IsoExtractRec.setSf31IsoIdTerminal(logDecompressedData860.getIdTerminal860());
              }
  
          }

// *
          cardAcceptor110860 = logDecompressedData860.getCardAcceptor110860();
//  IF 860-CARD-ACCEPTOR-110 (1 : 1) > LOW-VALUES
          if (		( isGreaterThanLowValue(substring(cardAcceptor110860,0,1)) ) ) { 
//  MOVE 860-CARD-ACCEPTOR-110 TO SF31-ISO-CARD-ACCEPTOR
              sf31IsoExtractRec.setSf31IsoCardAcceptor(logDecompressedData860.getCardAcceptor110860());
          }
  
//  ELSE
          else { 
              cardAcceptor860 = logDecompressedData860.getCardAcceptor860();
//  IF 860-CARD-ACCEPTOR (1 : 1) > LOW-VALUES
              if (		( isGreaterThanLowValue(substring(cardAcceptor860,0,1)) ) ) { 
//  MOVE 860-CARD-ACCEPTOR TO SF31-ISO-CARD-ACCEPTOR
                  sf31IsoExtractRec.setSf31IsoCardAcceptor(logDecompressedData860.getCardAcceptor860());
              }
  
          }

// *
          authMrchNmctst110860 = logDecompressedData860.getAuthMrchNmctst110860();
//  IF 860-AUTH-MRCH-NMCTST-110 (1 : 1) > LOW-VALUES
          if (		( isGreaterThanLowValue(substring(authMrchNmctst110860,0,1)) ) ) { 
//  MOVE 860-AUTH-MRCH-NMCTST-110 TO SF31-ISO-DE43-MRCH-NMCTST
              sf31IsoCrncyConvFields.setSf31IsoDe43MrchNmctst(logDecompressedData860.getAuthMrchNmctst110860());
  
          }
  
//  ELSE
          else { 
              authMrchNmctst860 = logDecompressedData860.getAuthMrchNmctst860();
//  IF 860-AUTH-MRCH-NMCTST (1 : 1) > LOW-VALUES
              if (		( isGreaterThanLowValue(substring(authMrchNmctst860,0,1)) ) ) { 
//  MOVE 860-AUTH-MRCH-NMCTST TO SF31-ISO-DE43-MRCH-NMCTST
                  sf31IsoCrncyConvFields.setSf31IsoDe43MrchNmctst(logDecompressedData860.getAuthMrchNmctst860());
  
              }
  
//  ELSE
              else { 
//  MOVE SPACES TO SF31-ISO-DE43-MRCH-NMCTST
                  sf31IsoCrncyConvFields.setSf31IsoDe43MrchNmctst(CONSTANTS.SPACE_40);
  
              }
          }

// *
          bkntData110860 = logDecompressedData860.getBkntData110860();
//  IF 860-BKNT-DATA-110 (1 : 1) > LOW-VALUES
          if (		( isGreaterThanLowValue(substring(bkntData110860.toCharArray(),0,1)) ) ) { 
              // MOVE 860-BKNT-DATA-110 TO SF31-ISO-BKNT-DATA
              sf31IsoExtractRec.getSf31IsoBkntData().setString(logDecompressedData860.getBkntData110860().getCharArray());
          }
  
//  ELSE
          else { 
              bkntData860 = logDecompressedData860.getBkntData860();
//  IF 860-BKNT-DATA (1 : 1) > LOW-VALUES
              if (		( isGreaterThanLowValue(substring(bkntData860.toCharArray(),0,1)) ) ) { 
                  // MOVE 860-BKNT-DATA TO SF31-ISO-BKNT-DATA
                  sf31IsoExtractRec.getSf31IsoBkntData().setString(logDecompressedData860.getBkntData860().getCharArray());
              }
  
          }

// *
// ***** Repurposed the use of sf31-iso-private-data 100 bytes as   *
// ***** part of rel21q2 i11106 project.                            *
// *
// ***** sf31-iso-merchant-id is 16 bytes (de042 is 15 bytes)
//  IF 88-SI583-DE-PRESENT-2 (42)
          if ( si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(41).isSi583DePresent288()  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (42) : SI583-DE-LENGTH-2 (42)) TO SF31-ISO-MERCHANT-ID
              sf31IsoExtractRec.replace(dataGroup1000/*parent*/,0+si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(41).getSi583DeStartingPos2() - 1/*fromOffset - (sf31IsoMerchantId) */,si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(41).getSi583DeLength2()/*fromLen*/,309/*toOffset - (data1000) */,16/*toLen*/);
          }
//  ELSE
          else { 
//  IF 88-SI583-DE-PRESENT-1 (42)
              if ( si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(41).isSi583DePresent188()  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (42) : SI583-DE-LENGTH-2 (42)) TO SF31-ISO-MERCHANT-ID
                  sf31IsoExtractRec.replace(dataGroup1000/*parent*/,0+si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(41).getSi583DeStartingPos2() - 1/*fromOffset - (sf31IsoMerchantId) */,si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(41).getSi583DeLength2()/*fromLen*/,309/*toOffset - (data1000) */,16/*toLen*/);
              }
//  ELSE
              else { 
//  MOVE SPACES TO SF31-ISO-MERCHANT-ID
                  sf31IsoExtractRec.setSf31IsoMerchantId(CONSTANTS.SPACE_16);
              }
          }

// *
// ***** Seperate and process de120.
//  IF SI583-DE-LENGTH-1 (120) > ZERO
          if (	( si583DataElementWorkArea1.getSi583Filler1(119).getSi583DeLength1() > 0 ) ) { 
//  MOVE SI583-DE-LENGTH-1 (120) TO SEPR-DATA-LENGTH
              seprControlBlock.setSeprDataLength(si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(119).getSi583DeLength1());
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (120) : SEPR-DATA-LENGTH ) TO 500-DE120-DATA (1 : SEPR-DATA-LENGTH )
              de120DataGroup500.replace(dataGroup1000/*parent*/,0+si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(119).getSi583DeStartingPos1() - 1/*fromOffset - (de120Data500) */,seprControlBlock.getSeprDataLength()/*fromLen*/,0/*toOffset - (data1000) */,seprControlBlock.getSeprDataLength()/*toLen*/);
//  PERFORM 8030-PROCESS-DE120
              processDe120();/*8030-PROCESS-DE120*/
          }
  
//  ELSE
          else { 
//  IF SI583-DE-LENGTH-2 (120) > ZERO
              if (	( si583DataElementWorkArea2.getSi583Filler2(119).getSi583DeLength2() > 0 ) ) { 
//  MOVE SI583-DE-LENGTH-2 (120) TO SEPR-DATA-LENGTH
                  seprControlBlock.setSeprDataLength(si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(119).getSi583DeLength2());
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (120) : SEPR-DATA-LENGTH ) TO 500-DE120-DATA (1 : SEPR-DATA-LENGTH )
                  de120DataGroup500.replace(dataGroup1000/*parent*/,0+si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(119).getSi583DeStartingPos2() - 1/*fromOffset - (de120Data500) */,seprControlBlock.getSeprDataLength()/*fromLen*/,0/*toOffset - (data1000) */,seprControlBlock.getSeprDataLength()/*toLen*/);
//  PERFORM 8030-PROCESS-DE120
                  processDe120();/*8030-PROCESS-DE120*/
              }
  
          }

// *
          sf31IsoProcessingCode = sf31IsoExtractRec.getSf31IsoProcessingCode();
          lit380000300 = work.getLit380000300();
//  IF SF31-ISO-PROCESSING-CODE = 300-LIT-380000
          if (		compareChars(sf31IsoProcessingCode,lit380000300) == 0 ) { 
//  ADD 300-ONE TO 400-AVS2-REC-COUNT
              work.setAvs2RecCount400(work.getAvs2RecCount400()+(int) work.getOne300());
          }
  
//  PERFORM 3493-10-COMMON-CC-MOVES
          _10CommonCcMoves();/*3493-10-COMMON-CC-MOVES*/
//  PERFORM 3493-20-CHECK-DE125
          _20CheckDe125();/*3493-20-CHECK-DE125*/
          ;
      
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
      private void _10CommonCcMoves() throws Exception {
			// Declare local variables used in the method
			Sf31IsoAddlAvsii sf31IsoAddlAvsii = sf31IsoExtractRec.getSf31IsoAddlAvsii();
			TransactionAmt100860 transactionAmt100860 = logDecompressedData860.getTransactionAmt100860();
			long tranAmt100860 = 0;
			long transactionAmount860 = 0;
			long setlAmt100860 = 0;
			long setlAmount110860 = 0;
			long crdhldrBillAmt100860 = 0;
			long crdhldrBillAmt110860 = 0;
			long setlConvRte100860 = 0;
			long setlConvRte110860 = 0;
			long crdhldrConvRte100860 = 0;
			long crdhldrConvRte110860 = 0;
			TransactionAmt1860 transactionAmt1860 = logDecompressedData860.getTransactionAmt1860();
			SetlAmnt100860 setlAmnt100860 = logDecompressedData860.getSetlAmnt100860();
			SetlAmt110860 setlAmt110860 = logDecompressedData860.getSetlAmt110860();
			Sf31IsoCrncyConvFields sf31IsoCrncyConvFields = sf31IsoExtractRec.getSf31IsoCrncyConvFields();
			Sf31IsoCnvDteCcyymmdd sf31IsoCnvDteCcyymmdd = sf31IsoExtractRec.getSf31IsoCrncyConvFields().getSf31IsoCnvDteCcyymmdd();
			int conv100Mmdd860 = 0;
			int conv110Mmdd860 = 0;
			int crncyCdeSetl100860 = 0;
			int crncyCdeSetl110860 = 0;
			int crncyCrdhldr100860 = 0;
			int crncyCrdhldr110860 = 0;
			char[] currencyCode860 = null;
			char[] avsCurrCode110860 = null;
			// End of variable declaration

      
// *

// *
          tranAmt100860 = logDecompressedData860.getTranAmt100860();
//  IF 860-TRAN-AMT-100 (1 : 1) > LOW-VALUES
          if (		( isGreaterThanLowValue(substring(logDecompressedData860.getTranAmt100860String(),0,1)) ) ) { 
//  MOVE 860-CURRENCY-CODE TO SF31-ISO-AVS2-CURRENCY-CODE
              sf31IsoAddlAvsii.setSf31IsoAvs2CurrencyCode(logDecompressedData860.getCurrencyCode860());
  
//  MOVE 860-TRAN-AMT-100D TO SF31-ISO-TRANSACTION-AMT
              sf31IsoExtractRec.setSf31IsoTransactionAmt(transactionAmt100860.getTranAmt100d860());
  
          }
  
//  ELSE
          else { 
              transactionAmount860 = logDecompressedData860.getTransactionAmount860();
//  IF 860-TRANSACTION-AMOUNT (1 : 1) > LOW-VALUES
              if (		( isGreaterThanLowValue(substring(logDecompressedData860.getTransactionAmount860String(),0,1)) ) ) { 
//  MOVE 860-AVS-CURR-CODE-110 TO SF31-ISO-AVS2-CURRENCY-CODE
                  sf31IsoAddlAvsii.setSf31IsoAvs2CurrencyCode(logDecompressedData860.getAvsCurrCode110860());
  
//  MOVE 860-TRANSACTION-AMT TO SF31-ISO-TRANSACTION-AMT
                  sf31IsoExtractRec.setSf31IsoTransactionAmt(transactionAmt1860.getTransactionAmt860());
  
              }
  
//  ELSE
              else { 
                  setlAmt100860 = logDecompressedData860.getSetlAmt100860();
//  IF 860-SETL-AMT-100 (1 : 1) > LOW-VALUES
                  if (		( isGreaterThanLowValue(substring(logDecompressedData860.getSetlAmt100860String(),0,1)) ) ) { 
//  MOVE 860-CRNCY-CDE-SETL-100 TO SF31-ISO-AVS2-CURRENCY-CODE
                      sf31IsoAddlAvsii.setSf31IsoAvs2CurrencyCode(String.valueOf(logDecompressedData860.getCrncyCdeSetl100860String()).toCharArray());
  
//  MOVE 860-SETL-AMT-100D TO SF31-ISO-TRANSACTION-AMT
                      sf31IsoExtractRec.setSf31IsoTransactionAmt(setlAmnt100860.getSetlAmt100d860());
  
                  }
  
//  ELSE
                  else { 
                      setlAmount110860 = logDecompressedData860.getSetlAmount110860();
//  IF 860-SETL-AMOUNT-110 (1 : 1) > LOW-VALUES
                      if (		( isGreaterThanLowValue(substring(logDecompressedData860.getSetlAmount110860String(),0,1)) ) ) { 
//  MOVE 860-CRNCY-CDE-SETL-110 TO SF31-ISO-AVS2-CURRENCY-CODE
                          sf31IsoAddlAvsii.setSf31IsoAvs2CurrencyCode(String.valueOf(logDecompressedData860.getCrncyCdeSetl110860String()).toCharArray());
  
//  MOVE 860-SETL-AMT-110D TO SF31-ISO-TRANSACTION-AMT
                          sf31IsoExtractRec.setSf31IsoTransactionAmt(setlAmt110860.getSetlAmt110d860());
  
                      }
  
//  ELSE
                      else { 
//  MOVE ZEROS TO SF31-ISO-TRANSACTION-AMT
                          sf31IsoExtractRec.setSf31IsoTransactionAmt(BigDecimal.ZERO);
//  MOVE SPACES TO SF31-ISO-AVS2-CURRENCY-CODE
                          sf31IsoAddlAvsii.setSf31IsoAvs2CurrencyCode(CONSTANTS.SPACE_3);
  
                      }
                  }
              }
          }
          tranAmt100860 = logDecompressedData860.getTranAmt100860();
//  IF 860-TRAN-AMT-100 (1 : 1) > LOW-VALUES
          if (		( isGreaterThanLowValue(substring(logDecompressedData860.getTranAmt100860String(),0,1)) ) ) { 
//  MOVE 860-TRAN-AMT-100 TO SF31-ISO-DE4-TRN-AMT
              sf31IsoCrncyConvFields.setSf31IsoDe4TrnAmt(logDecompressedData860.getTranAmt100860());
  
          }
  
//  ELSE
          else { 
              transactionAmount860 = logDecompressedData860.getTransactionAmount860();
//  IF 860-TRANSACTION-AMOUNT (1 : 1) > LOW-VALUES
              if (		( isGreaterThanLowValue(substring(logDecompressedData860.getTransactionAmount860String(),0,1)) ) ) { 
//  MOVE 860-TRANSACTION-AMOUNT TO SF31-ISO-DE4-TRN-AMT
                  sf31IsoCrncyConvFields.setSf31IsoDe4TrnAmt(logDecompressedData860.getTransactionAmount860());
  
              }
  
//  ELSE
              else { 
//  MOVE ZEROS TO SF31-ISO-DE4-TRN-AMT
                  sf31IsoCrncyConvFields.setSf31IsoDe4TrnAmt(0);
  
              }
          }

// *
          setlAmt100860 = logDecompressedData860.getSetlAmt100860();
//  IF 860-SETL-AMT-100 (1 : 1) > LOW-VALUES
          if (		( isGreaterThanLowValue(substring(logDecompressedData860.getSetlAmt100860String(),0,1)) ) ) { 
//  MOVE 860-SETL-AMT-100 TO SF31-ISO-DE5-SETL-AMT
              sf31IsoCrncyConvFields.setSf31IsoDe5SetlAmt(logDecompressedData860.getSetlAmt100860());
  
          }
  
//  ELSE
          else { 
              setlAmount110860 = logDecompressedData860.getSetlAmount110860();
//  IF 860-SETL-AMOUNT-110 (1 : 1) > LOW-VALUES
              if (		( isGreaterThanLowValue(substring(logDecompressedData860.getSetlAmount110860String(),0,1)) ) ) { 
//  MOVE 860-SETL-AMOUNT-110 TO SF31-ISO-DE5-SETL-AMT
                  sf31IsoCrncyConvFields.setSf31IsoDe5SetlAmt(logDecompressedData860.getSetlAmount110860());
  
              }
  
//  ELSE
              else { 
//  MOVE ZEROS TO SF31-ISO-DE5-SETL-AMT
                  sf31IsoCrncyConvFields.setSf31IsoDe5SetlAmt(0);
  
              }
          }

// *
          crdhldrBillAmt100860 = logDecompressedData860.getCrdhldrBillAmt100860();
//  IF 860-CRDHLDR-BILL-AMT-100 (1 : 1) > LOW-VALUES
          if (		( isGreaterThanLowValue(substring(logDecompressedData860.getCrdhldrBillAmt100860String(),0,1)) ) ) { 
//  MOVE 860-CRDHLDR-BILL-AMT-100 TO SF31-ISO-DE6-CRDHLD-BILL-AMT
              sf31IsoCrncyConvFields.setSf31IsoDe6CrdhldBillAmt(logDecompressedData860.getCrdhldrBillAmt100860());
  
          }
  
//  ELSE
          else { 
              crdhldrBillAmt110860 = logDecompressedData860.getCrdhldrBillAmt110860();
//  IF 860-CRDHLDR-BILL-AMT-110 (1 : 1) > LOW-VALUES
              if (		( isGreaterThanLowValue(substring(logDecompressedData860.getCrdhldrBillAmt110860String(),0,1)) ) ) { 
//  MOVE 860-CRDHLDR-BILL-AMT-110 TO SF31-ISO-DE6-CRDHLD-BILL-AMT
                  sf31IsoCrncyConvFields.setSf31IsoDe6CrdhldBillAmt(logDecompressedData860.getCrdhldrBillAmt110860());
  
              }
  
//  ELSE
              else { 
//  MOVE ZEROS TO SF31-ISO-DE6-CRDHLD-BILL-AMT
                  sf31IsoCrncyConvFields.setSf31IsoDe6CrdhldBillAmt(0);
  
              }
          }

// *
          setlConvRte100860 = logDecompressedData860.getSetlConvRte100860();
//  IF 860-SETL-CONV-RTE-100 (1 : 1) > LOW-VALUES
          if (		( isGreaterThanLowValue(substring(logDecompressedData860.getSetlConvRte100860String(),0,1)) ) ) { 
//  MOVE 860-SETL-CONV-RTE-100 TO SF31-ISO-DE9-SETL-CNV-RTE
              sf31IsoCrncyConvFields.setSf31IsoDe9SetlCnvRte(String.valueOf(logDecompressedData860.getSetlConvRte100860String()).toCharArray());
  
          }
  
//  ELSE
          else { 
              setlConvRte110860 = logDecompressedData860.getSetlConvRte110860();
//  IF 860-SETL-CONV-RTE-110 (1 : 1) > LOW-VALUES
              if (		( isGreaterThanLowValue(substring(logDecompressedData860.getSetlConvRte110860String(),0,1)) ) ) { 
//  MOVE 860-SETL-CONV-RTE-110 TO SF31-ISO-DE9-SETL-CNV-RTE
                  sf31IsoCrncyConvFields.setSf31IsoDe9SetlCnvRte(String.valueOf(logDecompressedData860.getSetlConvRte110860String()).toCharArray());
  
              }
  
//  ELSE
              else { 
//  MOVE ZEROS TO SF31-ISO-DE9-SETL-CNV-RTE
                  sf31IsoCrncyConvFields.setSf31IsoDe9SetlCnvRte(CONSTANTS.ZERO_8);
  
              }
          }

// *
          crdhldrConvRte100860 = logDecompressedData860.getCrdhldrConvRte100860();
//  IF 860-CRDHLDR-CONV-RTE-100 (1 : 1) > LOW-VALUES
          if (		( isGreaterThanLowValue(substring(logDecompressedData860.getCrdhldrConvRte100860String(),0,1)) ) ) { 
//  MOVE 860-CRDHLDR-CONV-RTE-100 TO SF31-ISO-DE10-CRDHLD-CNV-RTE
              sf31IsoCrncyConvFields.setSf31IsoDe10CrdhldCnvRte(String.valueOf(logDecompressedData860.getCrdhldrConvRte100860String()).toCharArray());
  
          }
  
//  ELSE
          else { 
              crdhldrConvRte110860 = logDecompressedData860.getCrdhldrConvRte110860();
//  IF 860-CRDHLDR-CONV-RTE-110 (1 : 1) > LOW-VALUES
              if (		( isGreaterThanLowValue(substring(logDecompressedData860.getCrdhldrConvRte110860String(),0,1)) ) ) { 
//  MOVE 860-CRDHLDR-CONV-RTE-110 TO SF31-ISO-DE10-CRDHLD-CNV-RTE
                  sf31IsoCrncyConvFields.setSf31IsoDe10CrdhldCnvRte(String.valueOf(logDecompressedData860.getCrdhldrConvRte110860String()).toCharArray());
  
              }
  
//  ELSE
              else { 
//  MOVE ZEROS TO SF31-ISO-DE10-CRDHLD-CNV-RTE
                  sf31IsoCrncyConvFields.setSf31IsoDe10CrdhldCnvRte(CONSTANTS.ZERO_8);
  
              }
          }

// *
          conv100Mmdd860 = logDecompressedData860.getConv100Mmdd860();
//  IF 860-CONV-100-MMDD > LOW-VALUES
          if (		( isGreaterThanLowValue(logDecompressedData860.getConv100Mmdd860String()) ) ) { 
//  MOVE 860-CONV-100-MMDD TO SF31-ISO-DE16-CNV-DTE-MMDD
              sf31IsoCnvDteCcyymmdd.setSf31IsoDe16CnvDteMmdd(String.valueOf(logDecompressedData860.getConv100Mmdd860String()).toCharArray());
  
//  MOVE ZEROS TO SF31-ISO-CNV-DTE-CC SF31-ISO-CNV-DTE-YY
              sf31IsoCnvDteCcyymmdd.setSf31IsoCnvDteCc(CONSTANTS.ZERO_2);
              sf31IsoCnvDteCcyymmdd.setSf31IsoCnvDteYy(CONSTANTS.ZERO_2);
  
          }
  
//  ELSE
          else { 
              conv110Mmdd860 = logDecompressedData860.getConv110Mmdd860();
//  IF 860-CONV-110-MMDD (1 : 1) > LOW-VALUES
              if (		( isGreaterThanLowValue(substring(logDecompressedData860.getConv110Mmdd860String(),0,1)) ) ) { 
//  MOVE 860-CONV-110-MMDD TO SF31-ISO-DE16-CNV-DTE-MMDD
                  sf31IsoCnvDteCcyymmdd.setSf31IsoDe16CnvDteMmdd(String.valueOf(logDecompressedData860.getConv110Mmdd860String()).toCharArray());
  
//  MOVE ZEROS TO SF31-ISO-CNV-DTE-CC SF31-ISO-CNV-DTE-YY
                  sf31IsoCnvDteCcyymmdd.setSf31IsoCnvDteCc(CONSTANTS.ZERO_2);
                  sf31IsoCnvDteCcyymmdd.setSf31IsoCnvDteYy(CONSTANTS.ZERO_2);
  
              }
  
//  ELSE
              else { 
//  MOVE ZEROS TO SF31-ISO-CNV-DTE-CCYYMMDD
                  sf31IsoCrncyConvFields.getSf31IsoCnvDteCcyymmdd().setString(CONSTANTS.ZERO_8);
  
              }
          }

// *
          currencyCode860 = logDecompressedData860.getCurrencyCode860();
//  IF 860-CURRENCY-CODE (1 : 1) > LOW-VALUES
          if (		( isGreaterThanLowValue(substring(currencyCode860,0,1)) ) ) { 
//  MOVE 860-CURRENCY-CODE TO SF31-ISO-DE49-TRN-CUR-CDE
              sf31IsoCrncyConvFields.setSf31IsoDe49TrnCurCde(logDecompressedData860.getCurrencyCode860());
  
          }
  
//  ELSE
          else { 
              avsCurrCode110860 = logDecompressedData860.getAvsCurrCode110860();
//  IF 860-AVS-CURR-CODE-110 (1 : 1) > LOW-VALUES
              if (		( isGreaterThanLowValue(substring(avsCurrCode110860,0,1)) ) ) { 
//  MOVE 860-AVS-CURR-CODE-110 TO SF31-ISO-DE49-TRN-CUR-CDE
                  sf31IsoCrncyConvFields.setSf31IsoDe49TrnCurCde(logDecompressedData860.getAvsCurrCode110860());
  
              }
  
//  ELSE
              else { 
//  MOVE ZEROS TO SF31-ISO-DE49-TRN-CUR-CDE
                  sf31IsoCrncyConvFields.setSf31IsoDe49TrnCurCde(CONSTANTS.ZERO_3);
  
              }
          }

// *
          crncyCdeSetl100860 = logDecompressedData860.getCrncyCdeSetl100860();
//  IF 860-CRNCY-CDE-SETL-100 (1 : 1) > LOW-VALUES
          if (		( isGreaterThanLowValue(substring(logDecompressedData860.getCrncyCdeSetl100860String(),0,1)) ) ) { 
//  MOVE 860-CRNCY-CDE-SETL-100 TO SF31-ISO-DE50-SETL-CUR-CDE
              sf31IsoCrncyConvFields.setSf31IsoDe50SetlCurCde(String.valueOf(logDecompressedData860.getCrncyCdeSetl100860String()).toCharArray());
  
          }
  
//  ELSE
          else { 
              crncyCdeSetl110860 = logDecompressedData860.getCrncyCdeSetl110860();
//  IF 860-CRNCY-CDE-SETL-110 (1 : 1) > LOW-VALUES
              if (		( isGreaterThanLowValue(substring(logDecompressedData860.getCrncyCdeSetl110860String(),0,1)) ) ) { 
//  MOVE 860-CRNCY-CDE-SETL-110 TO SF31-ISO-DE50-SETL-CUR-CDE
                  sf31IsoCrncyConvFields.setSf31IsoDe50SetlCurCde(String.valueOf(logDecompressedData860.getCrncyCdeSetl110860String()).toCharArray());
  
              }
  
//  ELSE
              else { 
//  MOVE ZEROS TO SF31-ISO-DE50-SETL-CUR-CDE
                  sf31IsoCrncyConvFields.setSf31IsoDe50SetlCurCde(CONSTANTS.ZERO_3);
  
              }
          }

// *
          crncyCrdhldr100860 = logDecompressedData860.getCrncyCrdhldr100860();
//  IF 860-CRNCY-CRDHLDR-100 (1 : 1) > LOW-VALUES
          if (		( isGreaterThanLowValue(substring(logDecompressedData860.getCrncyCrdhldr100860String(),0,1)) ) ) { 
//  MOVE 860-CRNCY-CRDHLDR-100 TO SF31-ISO-DE51-CRDHLD-CUR-CDE
              sf31IsoCrncyConvFields.setSf31IsoDe51CrdhldCurCde(String.valueOf(logDecompressedData860.getCrncyCrdhldr100860String()).toCharArray());
  
          }
  
//  ELSE
          else { 
              crncyCrdhldr110860 = logDecompressedData860.getCrncyCrdhldr110860();
//  IF 860-CRNCY-CRDHLDR-110 (1 : 1) > LOW-VALUES
              if (		( isGreaterThanLowValue(substring(logDecompressedData860.getCrncyCrdhldr110860String(),0,1)) ) ) { 
//  MOVE 860-CRNCY-CRDHLDR-110 TO SF31-ISO-DE51-CRDHLD-CUR-CDE
                  sf31IsoCrncyConvFields.setSf31IsoDe51CrdhldCurCde(String.valueOf(logDecompressedData860.getCrncyCrdhldr110860String()).toCharArray());
  
              }
  
//  ELSE
              else { 
//  MOVE ZEROS TO SF31-ISO-DE51-CRDHLD-CUR-CDE
                  sf31IsoCrncyConvFields.setSf31IsoDe51CrdhldCurCde(CONSTANTS.ZERO_3);
  
              }
          }
      
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
      private void _20CheckDe125() throws Exception {
			// Declare local variables used in the method
			Sf31IsoCrncyConvFields sf31IsoCrncyConvFields = sf31IsoExtractRec.getSf31IsoCrncyConvFields();
			long sf31IsoDe5SetlAmt = 0;
			long sf31IsoDe6CrdhldBillAmt = 0;
			char[] bytes12890 = null;
			char[] lit05300 = null;
			char[] lit06300 = null;
			char[] bytes1718890 = null;
			char[] bytes3334890 = null;
			char[] lit09300 = null;
			char[] bytes1718891 = null;
			char[] sf31IsoDe9SetlCnvRte = null;
			char[] bytes4546890 = null;
			char[] lit10300 = null;
			char[] sf31IsoDe10CrdhldCnvRte = null;
			char[] bytes5758890 = null;
			char[] lit16300 = null;
			char[] bytes2930891 = null;
			char[] sf31IsoDe16CnvDteMmdd = null;
			char[] bytes6566890 = null;
			char[] lit50300 = null;
			char[] bytes3738891 = null;
			char[] sf31IsoDe50SetlCurCde = null;
			char[] bytes7273890 = null;
			char[] lit51300 = null;
			char[] sf31IsoDe51CrdhldCurCde = null;
			Sf31IsoCnvDteCcyymmdd sf31IsoCnvDteCcyymmdd = sf31IsoExtractRec.getSf31IsoCrncyConvFields().getSf31IsoCnvDteCcyymmdd();
			// End of variable declaration

      
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
//  MOVE 860-CRNCY-CONV-100 TO 890-DE125-WORK-AREA-A
          de125WorkAreaAGroup890.setDe125WorkAreaA890(logDecompressedData860.getCrncyConv100860());
          lit05300 = work.getLit05300();
          bytes12890 = de125WorkAreaAGroup890.getDe125WorkAreaA890().getBytes12890();
//  IF SF31-ISO-DE5-SETL-AMT = ZEROS AND 890-BYTES-1-2 = 300-LIT-05
          if (	( sf31IsoCrncyConvFields.getSf31IsoDe5SetlAmt() == 0 )  && 		compareChars(bytes12890,lit05300) == 0 ) { 
//  MOVE 890-BYTES-5-16 TO SF31-ISO-DE5-SETL-AMT
              sf31IsoCrncyConvFields.setSf31IsoDe5SetlAmt(de125WorkAreaAGroup890.getDe125WorkAreaA890().getBytes516890());
  
          }
  

// *
//  IF SF31-ISO-DE6-CRDHLD-BILL-AMT = ZEROS
          if (	( sf31IsoCrncyConvFields.getSf31IsoDe6CrdhldBillAmt() == 0 ) ) { 
              lit06300 = work.getLit06300();
              bytes12890 = de125WorkAreaAGroup890.getDe125WorkAreaA890().getBytes12890();
//  IF 890-BYTES-1-2 = 300-LIT-06
              if (		compareChars(bytes12890,lit06300) == 0 ) { 
//  MOVE 891-BYTES-5-16 TO SF31-ISO-DE6-CRDHLD-BILL-AMT
                  sf31IsoCrncyConvFields.setSf31IsoDe6CrdhldBillAmt(de125WorkAreaAGroup890.getDe125WorkAreaB891().getBytes516891());
  
              }
  
//  ELSE
              else { 
                  bytes1718890 = de125WorkAreaAGroup890.getDe125WorkAreaA890().getBytes1718890();
                  lit06300 = work.getLit06300();
//  IF 890-BYTES-17-18 = 300-LIT-06
                  if (		compareChars(bytes1718890,lit06300) == 0 ) { 
//  MOVE 890-BYTES-21-32 TO SF31-ISO-DE6-CRDHLD-BILL-AMT
                      sf31IsoCrncyConvFields.setSf31IsoDe6CrdhldBillAmt(de125WorkAreaAGroup890.getDe125WorkAreaA890().getBytes2132890());
  
                  }
  
              }
          }
  

// *
          sf31IsoDe9SetlCnvRte = sf31IsoCrncyConvFields.getSf31IsoDe9SetlCnvRte();
//  IF SF31-ISO-DE9-SETL-CNV-RTE = ZEROS
          if (( allZeros(sf31IsoDe9SetlCnvRte) ) /*  ==  zeros*/) { 
              lit09300 = work.getLit09300();
              bytes3334890 = de125WorkAreaAGroup890.getDe125WorkAreaA890().getBytes3334890();
//  IF 890-BYTES-33-34 = 300-LIT-09
              if (		compareChars(bytes3334890,lit09300) == 0 ) { 
//  MOVE 890-BYTES-37-44 TO SF31-ISO-DE9-SETL-CNV-RTE
                  sf31IsoCrncyConvFields.setSf31IsoDe9SetlCnvRte(String.valueOf(de125WorkAreaAGroup890.getDe125WorkAreaA890().getBytes3744890String()).toCharArray());
  
              }
  
//  ELSE
              else { 
                  lit09300 = work.getLit09300();
                  bytes1718891 = de125WorkAreaAGroup890.getDe125WorkAreaB891().getBytes1718891();
//  IF 891-BYTES-17-18 = 300-LIT-09
                  if (		compareChars(bytes1718891,lit09300) == 0 ) { 
//  MOVE 891-BYTES-21-28 TO SF31-ISO-DE9-SETL-CNV-RTE
                      sf31IsoCrncyConvFields.setSf31IsoDe9SetlCnvRte(String.valueOf(de125WorkAreaAGroup890.getDe125WorkAreaB891().getBytes2128891String()).toCharArray());
  
                  }
  
              }
          }
  

// *
          sf31IsoDe10CrdhldCnvRte = sf31IsoCrncyConvFields.getSf31IsoDe10CrdhldCnvRte();
//  IF SF31-ISO-DE10-CRDHLD-CNV-RTE = ZEROS
          if (( allZeros(sf31IsoDe10CrdhldCnvRte) ) /*  ==  zeros*/) { 
              lit10300 = work.getLit10300();
              bytes4546890 = de125WorkAreaAGroup890.getDe125WorkAreaA890().getBytes4546890();
//  IF 890-BYTES-45-46 = 300-LIT-10
              if (		compareChars(bytes4546890,lit10300) == 0 ) { 
//  MOVE 890-BYTES-49-56 TO SF31-ISO-DE10-CRDHLD-CNV-RTE
                  sf31IsoCrncyConvFields.setSf31IsoDe10CrdhldCnvRte(String.valueOf(de125WorkAreaAGroup890.getDe125WorkAreaA890().getBytes4956890String()).toCharArray());
  
              }
  
//  ELSE
              else { 
                  lit10300 = work.getLit10300();
                  bytes1718891 = de125WorkAreaAGroup890.getDe125WorkAreaB891().getBytes1718891();
//  IF 891-BYTES-17-18 = 300-LIT-10
                  if (		compareChars(bytes1718891,lit10300) == 0 ) { 
//  MOVE 891-BYTES-21-28 TO SF31-ISO-DE10-CRDHLD-CNV-RTE
                      sf31IsoCrncyConvFields.setSf31IsoDe10CrdhldCnvRte(String.valueOf(de125WorkAreaAGroup890.getDe125WorkAreaB891().getBytes2128891String()).toCharArray());
  
                  }
  
              }
          }
  

// *
          sf31IsoDe16CnvDteMmdd = sf31IsoCnvDteCcyymmdd.getSf31IsoDe16CnvDteMmdd();
//  IF SF31-ISO-DE16-CNV-DTE-MMDD = ZEROS
          if (( allZeros(sf31IsoDe16CnvDteMmdd) ) /*  ==  zeros*/) { 
              lit16300 = work.getLit16300();
              bytes5758890 = de125WorkAreaAGroup890.getDe125WorkAreaA890().getBytes5758890();
//  IF 890-BYTES-57-58 = 300-LIT-16
              if (		compareChars(bytes5758890,lit16300) == 0 ) { 
//  MOVE 890-BYTES-61-64 TO SF31-ISO-DE16-CNV-DTE-MMDD
                  sf31IsoCnvDteCcyymmdd.setSf31IsoDe16CnvDteMmdd(String.valueOf(de125WorkAreaAGroup890.getDe125WorkAreaA890().getBytes6164890String()).toCharArray());
  
//  MOVE ZEROS TO SF31-ISO-CNV-DTE-CC SF31-ISO-CNV-DTE-YY
                  sf31IsoCnvDteCcyymmdd.setSf31IsoCnvDteCc(CONSTANTS.ZERO_2);
                  sf31IsoCnvDteCcyymmdd.setSf31IsoCnvDteYy(CONSTANTS.ZERO_2);
  
              }
  
//  ELSE
              else { 
                  lit16300 = work.getLit16300();
                  bytes2930891 = de125WorkAreaAGroup890.getDe125WorkAreaB891().getBytes2930891();
//  IF 891-BYTES-29-30 = 300-LIT-16
                  if (		compareChars(bytes2930891,lit16300) == 0 ) { 
//  MOVE 891-BYTES-33-36 TO SF31-ISO-DE16-CNV-DTE-MMDD
                      sf31IsoCnvDteCcyymmdd.setSf31IsoDe16CnvDteMmdd(String.valueOf(de125WorkAreaAGroup890.getDe125WorkAreaB891().getBytes3336891String()).toCharArray());
  
//  MOVE ZEROS TO SF31-ISO-CNV-DTE-CC SF31-ISO-CNV-DTE-YY
                      sf31IsoCnvDteCcyymmdd.setSf31IsoCnvDteCc(CONSTANTS.ZERO_2);
                      sf31IsoCnvDteCcyymmdd.setSf31IsoCnvDteYy(CONSTANTS.ZERO_2);
  
                  }
  
              }
          }
  

// *
          sf31IsoDe50SetlCurCde = sf31IsoCrncyConvFields.getSf31IsoDe50SetlCurCde();
//  IF SF31-ISO-DE50-SETL-CUR-CDE = ZEROS
          if (( allZeros(sf31IsoDe50SetlCurCde) ) /*  ==  zeros*/) { 
              bytes6566890 = de125WorkAreaAGroup890.getDe125WorkAreaA890().getBytes6566890();
              lit50300 = work.getLit50300();
//  IF 890-BYTES-65-66 = 300-LIT-50
              if (		compareChars(bytes6566890,lit50300) == 0 ) { 
//  MOVE 890-BYTES-69-71 TO SF31-ISO-DE50-SETL-CUR-CDE
                  sf31IsoCrncyConvFields.setSf31IsoDe50SetlCurCde(String.valueOf(de125WorkAreaAGroup890.getDe125WorkAreaA890().getBytes6971890String()).toCharArray());
  
              }
  
//  ELSE
              else { 
                  bytes3738891 = de125WorkAreaAGroup890.getDe125WorkAreaB891().getBytes3738891();
                  lit50300 = work.getLit50300();
//  IF 891-BYTES-37-38 = 300-LIT-50
                  if (		compareChars(bytes3738891,lit50300) == 0 ) { 
//  MOVE 891-BYTES-41-43 TO SF31-ISO-DE50-SETL-CUR-CDE
                      sf31IsoCrncyConvFields.setSf31IsoDe50SetlCurCde(String.valueOf(de125WorkAreaAGroup890.getDe125WorkAreaB891().getBytes4143891String()).toCharArray());
  
                  }
  
              }
          }
  

// *
          sf31IsoDe51CrdhldCurCde = sf31IsoCrncyConvFields.getSf31IsoDe51CrdhldCurCde();
//  IF SF31-ISO-DE51-CRDHLD-CUR-CDE = ZEROS
          if (( allZeros(sf31IsoDe51CrdhldCurCde) ) /*  ==  zeros*/) { 
              bytes7273890 = de125WorkAreaAGroup890.getDe125WorkAreaA890().getBytes7273890();
              lit51300 = work.getLit51300();
//  IF 890-BYTES-72-73 = 300-LIT-51
              if (		compareChars(bytes7273890,lit51300) == 0 ) { 
//  MOVE 890-BYTES-76-78 TO SF31-ISO-DE51-CRDHLD-CUR-CDE
                  sf31IsoCrncyConvFields.setSf31IsoDe51CrdhldCurCde(String.valueOf(de125WorkAreaAGroup890.getDe125WorkAreaA890().getBytes7678890String()).toCharArray());
  
              }
  
//  ELSE
              else { 
                  bytes3738891 = de125WorkAreaAGroup890.getDe125WorkAreaB891().getBytes3738891();
                  lit51300 = work.getLit51300();
//  IF 891-BYTES-37-38 = 300-LIT-51
                  if (		compareChars(bytes3738891,lit51300) == 0 ) { 
//  MOVE 891-BYTES-41-43 TO SF31-ISO-DE51-CRDHLD-CUR-CDE
                      sf31IsoCrncyConvFields.setSf31IsoDe51CrdhldCurCde(String.valueOf(de125WorkAreaAGroup890.getDe125WorkAreaB891().getBytes4143891String()).toCharArray());
  
                  }
  
              }
          }
  

// *
//  IF SF31-ISO-DE5-SETL-AMT = ZEROS
          if (	( sf31IsoCrncyConvFields.getSf31IsoDe5SetlAmt() == 0 ) ) { 
//  MOVE SF31-ISO-DE4-TRN-AMT TO SF31-ISO-DE5-SETL-AMT
              sf31IsoCrncyConvFields.setSf31IsoDe5SetlAmt(sf31IsoCrncyConvFields.getSf31IsoDe4TrnAmt());
  
          }
  

// *
          sf31IsoDe50SetlCurCde = sf31IsoCrncyConvFields.getSf31IsoDe50SetlCurCde();
//  IF SF31-ISO-DE50-SETL-CUR-CDE = ZEROS
          if (( allZeros(sf31IsoDe50SetlCurCde) ) /*  ==  zeros*/) { 
//  MOVE SF31-ISO-DE49-TRN-CUR-CDE TO SF31-ISO-DE50-SETL-CUR-CDE
              sf31IsoCrncyConvFields.setSf31IsoDe50SetlCurCde(sf31IsoCrncyConvFields.getSf31IsoDe49TrnCurCde());
  
          }
  

// *
//  IF SF31-ISO-DE6-CRDHLD-BILL-AMT = ZEROS
          if (	( sf31IsoCrncyConvFields.getSf31IsoDe6CrdhldBillAmt() == 0 ) ) { 
//  MOVE SF31-ISO-DE4-TRN-AMT TO SF31-ISO-DE6-CRDHLD-BILL-AMT
              sf31IsoCrncyConvFields.setSf31IsoDe6CrdhldBillAmt(sf31IsoCrncyConvFields.getSf31IsoDe4TrnAmt());
  
          }
  

// *
          sf31IsoDe51CrdhldCurCde = sf31IsoCrncyConvFields.getSf31IsoDe51CrdhldCurCde();
//  IF SF31-ISO-DE51-CRDHLD-CUR-CDE = ZEROS
          if (( allZeros(sf31IsoDe51CrdhldCurCde) ) /*  ==  zeros*/) { 
//  MOVE SF31-ISO-DE49-TRN-CUR-CDE TO SF31-ISO-DE51-CRDHLD-CUR-CDE
              sf31IsoCrncyConvFields.setSf31IsoDe51CrdhldCurCde(sf31IsoCrncyConvFields.getSf31IsoDe49TrnCurCde());
  
          }
  
      
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
      private void callParser() throws Exception {
			// Declare local variables used in the method
			Sf501Header sf501Header = sf501LogRecord.getSf501RecordRedefined().getSf501Header();
			short si583ReturnCode = 0;
			int two300 = 0;
			// End of variable declaration

      
// *
// ***********************************************************
// *    This routine sets up parameters for and calls the    *
// *    iso log message parser program. set our linkage area *
// *    work field to the address of the parsed data.        *
// ***********************************************************
//  CALL 800-PTR-SI994010
          // CALL 800-PTR-SI994010
          	this.setRc( si994010.process());
          two300 = work.getTwo300();
          si583ReturnCode = si583ParserArea.getSi583ReturnCode();
//  EVALUATE SI583-RETURN-CODE
          if  (	( si583ReturnCode == 0 ) ) { 
//  MOVE 300-LIT-Y TO 100-PARSE-SW
              work.setParseSw100(work.getLitY300());
//  SET ADDRESS OF 1000-DATA TO SI583-DATA-PTR
              dataGroup1000.set(getObject(si583ParserArea.getSi583DataPtr())); 
              
              // MOVE LOW-VALUES TO 860-LOG-DECOMPRESSED-DATA
              logDecompressedData860.setString(CONSTANTS.LOW_VALUE_215539513);
//  PERFORM 5100-MOVE-MTI-1
              moveMti1();/*5100-MOVE-MTI-1*/
//  PERFORM 5200-MOVE-MTI-2
              moveMti2();/*5200-MOVE-MTI-2*/
          }
          else if  (	( si583ReturnCode == two300 ) ) { 
//  MOVE 300-LIT-Y TO 100-PARSE-SW
              work.setParseSw100(work.getLitY300());
//  SET ADDRESS OF 1000-DATA TO SI583-DATA-PTR
              dataGroup1000.set(getObject(si583ParserArea.getSi583DataPtr())); 
              
              // MOVE LOW-VALUES TO 860-LOG-DECOMPRESSED-DATA
              logDecompressedData860.setString(CONSTANTS.LOW_VALUE_215539513);
//  PERFORM 5100-MOVE-MTI-1
              moveMti1();/*5100-MOVE-MTI-1*/
          }
          else   { 
//  MOVE 300-LIT-N TO 100-PARSE-SW
              work.setParseSw100(work.getLitN300());
//  ADD +1 TO 400-TOTAL-PARSE-ERRORS
              work.setTotalParseErrors400(work.getTotalParseErrors400()+(long)1);
//  DISPLAY 600-BILLLOG-MSG1 SPACE SI583-RETURN-CODE SPACE 600-BILLLOG-MSG2 SPACE SF501-CLASS SPACE 600-BILLLOG-MSG3 SPACE SPACE SF501-TYPE SPACE 600-BILLLOG-MSG4 SPACE SF501-BKNT-REF-NO
              logger.info("{}{}{}{}{}{}{}{}", new String(work.getBilllogMsg1600()), String.valueOf(si583ParserArea.getSi583ReturnCode()), new String(work.getBilllogMsg2600()), new String(sf501LogRecord.getSf501RecordRedefined().getSf501Class()), new String(work.getBilllogMsg3600()), new String(sf501LogRecord.getSf501RecordRedefined().getSf501Type()), new String(work.getBilllogMsg4600()), new String(sf501Header.getSf501BkntRefNo())); 
  
          }
  
      
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
      private void moveMti1() throws Exception {
//  IF 88-SI583-DE-PRESENT-1 (2)
          if ( si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(1).isSi583DePresent188()  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (2) : SI583-DE-LENGTH-1 (2)) TO 860-CARDHOLDER-NBR
              logDecompressedData860.replace(dataGroup1000/*parent*/,0+si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(1).getSi583DeStartingPos1() - 1/*fromOffset - (cardholderNbr860) */,si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(1).getSi583DeLength1()/*fromLen*/,0/*toOffset - (data1000) */,19/*toLen*/);
          }
//  IF 88-SI583-DE-PRESENT-1 (3)
          if ( si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(2).isSi583DePresent188()  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (3) : SI583-DE-LENGTH-1 (3)) TO 860-PROCESSING-CODE-110
              try {
              logDecompressedData860.setProcessingCode110860(CFUtil.getLong(substring(dataGroup1000.getData1000(),(si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(2).getSi583DeStartingPos1()-1), (si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(2).getSi583DeLength1() + (si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(2).getSi583DeStartingPos1() - 1)) )));
              } catch(NumberFormatException e) {}
          }
//  IF 88-SI583-DE-PRESENT-1 (4)
          if ( si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(3).isSi583DePresent188()  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (4) : SI583-DE-LENGTH-1 (4)) TO 860-TRANSACTION-AMOUNT
              try {
              logDecompressedData860.setTransactionAmount860(CFUtil.getLong(substring(dataGroup1000.getData1000(),(si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(3).getSi583DeStartingPos1()-1), (si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(3).getSi583DeLength1() + (si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(3).getSi583DeStartingPos1() - 1)) )));
              } catch(NumberFormatException e) {}
          }
//  IF 88-SI583-DE-PRESENT-1 (5)
          if ( si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(4).isSi583DePresent188()  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (5) : SI583-DE-LENGTH-1 (5)) TO 860-SETL-AMOUNT-110
              try {
              logDecompressedData860.setSetlAmount110860(CFUtil.getLong(substring(dataGroup1000.getData1000(),(si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(4).getSi583DeStartingPos1()-1), (si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(4).getSi583DeLength1() + (si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(4).getSi583DeStartingPos1() - 1)) )));
              } catch(NumberFormatException e) {}
          }
//  IF 88-SI583-DE-PRESENT-1 (6)
          if ( si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(5).isSi583DePresent188()  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (6) : SI583-DE-LENGTH-1 (6)) TO 860-CRDHLDR-BILL-AMT-110
              try {
              logDecompressedData860.setCrdhldrBillAmt110860(CFUtil.getLong(substring(dataGroup1000.getData1000(),(si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(5).getSi583DeStartingPos1()-1), (si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(5).getSi583DeLength1() + (si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(5).getSi583DeStartingPos1() - 1)) )));
              } catch(NumberFormatException e) {}
          }
//  IF 88-SI583-DE-PRESENT-1 (7)
          if ( si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(6).isSi583DePresent188()  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (7) : SI583-DE-LENGTH-1 (7)) TO 860-DATE-TIME-XMIT-110
              try {
              logDecompressedData860.setDateTimeXmit110860(CFUtil.getLong(substring(dataGroup1000.getData1000(),(si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(6).getSi583DeStartingPos1()-1), (si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(6).getSi583DeLength1() + (si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(6).getSi583DeStartingPos1() - 1)) )));
              } catch(NumberFormatException e) {}
          }
//  IF 88-SI583-DE-PRESENT-1 (9)
          if ( si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(8).isSi583DePresent188()  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (9) : SI583-DE-LENGTH-1 (9)) TO 860-SETL-CONV-RTE-110
              try {
              logDecompressedData860.setSetlConvRte110860(CFUtil.getLong(substring(dataGroup1000.getData1000(),(si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(8).getSi583DeStartingPos1()-1), (si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(8).getSi583DeLength1() + (si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(8).getSi583DeStartingPos1() - 1)) )));
              } catch(NumberFormatException e) {}
          }
//  IF 88-SI583-DE-PRESENT-1 (10)
          if ( si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(9).isSi583DePresent188()  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (10) : SI583-DE-LENGTH-1 (10)) TO 860-CRDHLDR-CONV-RTE-110
              try {
              logDecompressedData860.setCrdhldrConvRte110860(CFUtil.getLong(substring(dataGroup1000.getData1000(),(si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(9).getSi583DeStartingPos1()-1), (si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(9).getSi583DeLength1() + (si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(9).getSi583DeStartingPos1() - 1)) )));
              } catch(NumberFormatException e) {}
          }
//  IF 88-SI583-DE-PRESENT-1 (11)
          if ( si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(10).isSi583DePresent188()  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (11) : SI583-DE-LENGTH-1 (11)) TO 860-SYS-TRACE-AUDIT
              logDecompressedData860.replace(dataGroup1000/*parent*/,0+si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(10).getSi583DeStartingPos1() - 1/*fromOffset - (sysTraceAudit860) */,si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(10).getSi583DeLength1()/*fromLen*/,87/*toOffset - (data1000) */,6/*toLen*/);
          }
//  IF 88-SI583-DE-PRESENT-1 (15)
          if ( si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(14).isSi583DePresent188()  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (15) : SI583-DE-LENGTH-1 (15)) TO 860-TRANS-MMDD-110
              logDecompressedData860.setTransMmdd110860(CFUtil.getInt(substring(dataGroup1000.getData1000(),(si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(14).getSi583DeStartingPos1()-1), (si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(14).getSi583DeLength1() + (si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(14).getSi583DeStartingPos1() - 1)) )));
          }
//  IF 88-SI583-DE-PRESENT-1 (16)
          if ( si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(15).isSi583DePresent188()  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (16) : SI583-DE-LENGTH-1 (16)) TO 860-CONV-110-MMDD
              logDecompressedData860.setConv110Mmdd860(CFUtil.getInt(substring(dataGroup1000.getData1000(),(si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(15).getSi583DeStartingPos1()-1), (si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(15).getSi583DeLength1() + (si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(15).getSi583DeStartingPos1() - 1)) )));
          }
//  IF 88-SI583-DE-PRESENT-1 (18)
          if ( si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(17).isSi583DePresent188()  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (18) : SI583-DE-LENGTH-1 (18)) TO 860-MERCHANT-TYPE-110
              logDecompressedData860.setMerchantType110860(CFUtil.getInt(substring(dataGroup1000.getData1000(),(si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(17).getSi583DeStartingPos1()-1), (si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(17).getSi583DeLength1() + (si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(17).getSi583DeStartingPos1() - 1)) )));
          }
//  IF 88-SI583-DE-PRESENT-1 (20)
          if ( si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(19).isSi583DePresent188()  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (20) : SI583-DE-LENGTH-1 (20)) TO 860-COUNTRY-CODE-110
              logDecompressedData860.replace(dataGroup1000/*parent*/,0+si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(19).getSi583DeStartingPos1() - 1/*fromOffset - (countryCode110860) */,si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(19).getSi583DeLength1()/*fromLen*/,105/*toOffset - (data1000) */,3/*toLen*/);
          }
//  IF 88-SI583-DE-PRESENT-1 (22)
          if ( si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(21).isSi583DePresent188()  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (22) : SI583-DE-LENGTH-1 (22)) TO 860-POS-ENTRY-110
              logDecompressedData860.setPosEntry110860(CFUtil.getInt(substring(dataGroup1000.getData1000(),(si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(21).getSi583DeStartingPos1()-1), (si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(21).getSi583DeLength1() + (si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(21).getSi583DeStartingPos1() - 1)) )));
          }
//  IF 88-SI583-DE-PRESENT-1 (26)
          if ( si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(25).isSi583DePresent188()  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (26) : SI583-DE-LENGTH-1 (26)) TO 860-POS-PIN-CAPTURE-110
              logDecompressedData860.setPosPinCapture110860(CFUtil.getInt(substring(dataGroup1000.getData1000(),(si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(25).getSi583DeStartingPos1()-1), (si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(25).getSi583DeLength1() + (si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(25).getSi583DeStartingPos1() - 1)) )));
          }
//  IF 88-SI583-DE-PRESENT-1 (32)
          if ( si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(31).isSi583DePresent188()  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (32) : SI583-DE-LENGTH-1 (32)) TO 860-ACQUIRER-ICA
              logDecompressedData860.replace(dataGroup1000/*parent*/,0+si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(31).getSi583DeStartingPos1() - 1/*fromOffset - (acquirerIca860) */,si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(31).getSi583DeLength1()/*fromLen*/,113/*toOffset - (data1000) */,6/*toLen*/);
          }
//  IF 88-SI583-DE-PRESENT-1 (33)
          if ( si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(32).isSi583DePresent188()  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (33) : SI583-DE-LENGTH-1 (33)) TO 860-FORWARD-INST-ID
              logDecompressedData860.replace(dataGroup1000/*parent*/,0+si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(32).getSi583DeStartingPos1() - 1/*fromOffset - (forwardInstId860) */,si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(32).getSi583DeLength1()/*fromLen*/,119/*toOffset - (data1000) */,6/*toLen*/);
          }
//  IF 88-SI583-DE-PRESENT-1 (37)
          if ( si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(36).isSi583DePresent188()  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (37) : SI583-DE-LENGTH-1 (37)) TO 860-RETRIEVAL-REFNO-110
              logDecompressedData860.replace(dataGroup1000/*parent*/,0+si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(36).getSi583DeStartingPos1() - 1/*fromOffset - (retrievalRefno110860) */,si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(36).getSi583DeLength1()/*fromLen*/,125/*toOffset - (data1000) */,12/*toLen*/);
          }
//  IF 88-SI583-DE-PRESENT-1 (38)
          if ( si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(37).isSi583DePresent188()  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (38) : SI583-DE-LENGTH-1 (38)) TO 860-AUTH-NUMBER
              logDecompressedData860.replace(dataGroup1000/*parent*/,0+si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(37).getSi583DeStartingPos1() - 1/*fromOffset - (authNumber860) */,si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(37).getSi583DeLength1()/*fromLen*/,137/*toOffset - (data1000) */,6/*toLen*/);
          }
//  IF 88-SI583-DE-PRESENT-1 (39)
          if ( si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(38).isSi583DePresent188()  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (39) : SI583-DE-LENGTH-1 (39)) TO 860-AUTH-RESPONSE
              logDecompressedData860.replace(dataGroup1000/*parent*/,0+si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(38).getSi583DeStartingPos1() - 1/*fromOffset - (authResponse860) */,si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(38).getSi583DeLength1()/*fromLen*/,143/*toOffset - (data1000) */,2/*toLen*/);
          }
//  IF 88-SI583-DE-PRESENT-1 (41)
          if ( si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(40).isSi583DePresent188()  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (41) : SI583-DE-LENGTH-1 (41)) TO 860-ID-TERMINAL-110
              logDecompressedData860.replace(dataGroup1000/*parent*/,0+si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(40).getSi583DeStartingPos1() - 1/*fromOffset - (idTerminal110860) */,si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(40).getSi583DeLength1()/*fromLen*/,145/*toOffset - (data1000) */,8/*toLen*/);
          }
//  IF 88-SI583-DE-PRESENT-1 (42)
          if ( si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(41).isSi583DePresent188()  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (42) : SI583-DE-LENGTH-1 (42)) TO 860-CARD-ACCEPTOR-110
              logDecompressedData860.replace(dataGroup1000/*parent*/,0+si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(41).getSi583DeStartingPos1() - 1/*fromOffset - (cardAcceptor110860) */,si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(41).getSi583DeLength1()/*fromLen*/,153/*toOffset - (data1000) */,15/*toLen*/);
          }
//  IF 88-SI583-DE-PRESENT-1 (43)
          if ( si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(42).isSi583DePresent188()  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (43) : SI583-DE-LENGTH-1 (43)) TO 860-AUTH-MRCH-NMCTST-110
              logDecompressedData860.replace(dataGroup1000/*parent*/,0+si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(42).getSi583DeStartingPos1() - 1/*fromOffset - (authMrchNmctst110860) */,si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(42).getSi583DeLength1()/*fromLen*/,168/*toOffset - (data1000) */,40/*toLen*/);
          }
//  IF 88-SI583-DE-PRESENT-1 (44)
          if ( si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(43).isSi583DePresent188()  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (44) : SI583-DE-LENGTH-1 (44)) TO 860-AUTH-ADDL-DATA
              logDecompressedData860.replace(dataGroup1000/*parent*/,0+si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(43).getSi583DeStartingPos1() - 1/*fromOffset - (authAddlData860) */,si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(43).getSi583DeLength1()/*fromLen*/,208/*toOffset - (data1000) */,25/*toLen*/);
          }

// *    If 88-si583-de-present-1 (48)
// *       de48 handled elsewhere
//  IF 88-SI583-DE-PRESENT-1 (49)
          if ( si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(48).isSi583DePresent188()  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (49) : SI583-DE-LENGTH-1 (49)) TO 860-AVS-CURR-CODE-110
              logDecompressedData860.replace(dataGroup1000/*parent*/,0+si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(48).getSi583DeStartingPos1() - 1/*fromOffset - (avsCurrCode110860) */,si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(48).getSi583DeLength1()/*fromLen*/,233/*toOffset - (data1000) */,3/*toLen*/);
          }
//  IF 88-SI583-DE-PRESENT-1 (50)
          if ( si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(49).isSi583DePresent188()  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (50) : SI583-DE-LENGTH-1 (50)) TO 860-CRNCY-CDE-SETL-110
              logDecompressedData860.setCrncyCdeSetl110860(CFUtil.getInt(substring(dataGroup1000.getData1000(),(si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(49).getSi583DeStartingPos1()-1), (si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(49).getSi583DeLength1() + (si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(49).getSi583DeStartingPos1() - 1)) )));
          }
//  IF 88-SI583-DE-PRESENT-1 (51)
          if ( si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(50).isSi583DePresent188()  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (51) : SI583-DE-LENGTH-1 (51)) TO 860-CRNCY-CRDHLDR-110
              logDecompressedData860.setCrncyCrdhldr110860(CFUtil.getInt(substring(dataGroup1000.getData1000(),(si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(50).getSi583DeStartingPos1()-1), (si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(50).getSi583DeLength1() + (si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(50).getSi583DeStartingPos1() - 1)) )));
          }
//  IF 88-SI583-DE-PRESENT-1 (63)
          if ( si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(62).isSi583DePresent188()  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (63) : SI583-DE-LENGTH-1 (63)) TO 860-BKNT-DATA-110
              logDecompressedData860.replace(dataGroup1000/*parent*/,0+si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(62).getSi583DeStartingPos1() - 1/*fromOffset - (bkntData110860) */,si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(62).getSi583DeLength1()/*fromLen*/,242/*toOffset - (data1000) */,12/*toLen*/);
          }
//  IF 88-SI583-DE-PRESENT-1 (112)
          if ( si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(111).isSi583DePresent188()  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-1 (112) : SI583-DE-LENGTH-1 (112)) TO 860-DE112-110
              logDecompressedData860.replace(dataGroup1000/*parent*/,0+si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(111).getSi583DeStartingPos1() - 1/*fromOffset - (de112110860) */,si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(111).getSi583DeLength1()/*fromLen*/,254/*toOffset - (data1000) */,103/*toLen*/);
          }
      
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
      private void moveMti2() throws Exception {
      
// *    If 88-si583-de-present-1 (120)
// *       de120 handled elsewhere
// *    if 88-si583-de-present-1 (126)
// *       de126 handled elsewhere
//  IF 88-SI583-DE-PRESENT-2 (3)
          if ( si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(2).isSi583DePresent288()  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (3) : SI583-DE-LENGTH-2 (3)) TO 860-PROCESSING-CODE-100
              try {
              logDecompressedData860.setProcessingCode100860(CFUtil.getLong(substring(dataGroup1000.getData1000(),(si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(2).getSi583DeStartingPos2()-1), (si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(2).getSi583DeLength2() + (si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(2).getSi583DeStartingPos2() - 1)) )));
              } catch(NumberFormatException e) {}
          }
//  IF 88-SI583-DE-PRESENT-2 (4)
          if ( si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(3).isSi583DePresent288()  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (4) : SI583-DE-LENGTH-2 (4)) TO 860-TRAN-AMT-100
              try {
              logDecompressedData860.setTranAmt100860(CFUtil.getLong(substring(dataGroup1000.getData1000(),(si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(3).getSi583DeStartingPos2()-1), (si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(3).getSi583DeLength2() + (si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(3).getSi583DeStartingPos2() - 1)) )));
              } catch(NumberFormatException e) {}
          }
//  IF 88-SI583-DE-PRESENT-2 (5)
          if ( si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(4).isSi583DePresent288()  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (5) : SI583-DE-LENGTH-2 (5)) TO 860-SETL-AMT-100
              try {
              logDecompressedData860.setSetlAmt100860(CFUtil.getLong(substring(dataGroup1000.getData1000(),(si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(4).getSi583DeStartingPos2()-1), (si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(4).getSi583DeLength2() + (si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(4).getSi583DeStartingPos2() - 1)) )));
              } catch(NumberFormatException e) {}
          }
//  IF 88-SI583-DE-PRESENT-2 (6)
          if ( si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(5).isSi583DePresent288()  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (6) : SI583-DE-LENGTH-2 (6)) TO 860-CRDHLDR-BILL-AMT-100
              try {
              logDecompressedData860.setCrdhldrBillAmt100860(CFUtil.getLong(substring(dataGroup1000.getData1000(),(si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(5).getSi583DeStartingPos2()-1), (si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(5).getSi583DeLength2() + (si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(5).getSi583DeStartingPos2() - 1)) )));
              } catch(NumberFormatException e) {}
          }
//  IF 88-SI583-DE-PRESENT-2 (7)
          if ( si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(6).isSi583DePresent288()  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (7) : SI583-DE-LENGTH-2 (7)) TO 860-DATE-TIME-XMIT-100
              try {
              logDecompressedData860.setDateTimeXmit100860(CFUtil.getLong(substring(dataGroup1000.getData1000(),(si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(6).getSi583DeStartingPos2()-1), (si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(6).getSi583DeLength2() + (si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(6).getSi583DeStartingPos2() - 1)) )));
              } catch(NumberFormatException e) {}
          }
//  IF 88-SI583-DE-PRESENT-2 (9)
          if ( si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(8).isSi583DePresent288()  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (9) : SI583-DE-LENGTH-2 (9)) TO 860-SETL-CONV-RTE-100
              try {
              logDecompressedData860.setSetlConvRte100860(CFUtil.getLong(substring(dataGroup1000.getData1000(),(si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(8).getSi583DeStartingPos2()-1), (si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(8).getSi583DeLength2() + (si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(8).getSi583DeStartingPos2() - 1)) )));
              } catch(NumberFormatException e) {}
          }
//  IF 88-SI583-DE-PRESENT-2 (10)
          if ( si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(9).isSi583DePresent288()  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (10) : SI583-DE-LENGTH-2 (10)) TO 860-CRDHLDR-CONV-RTE-100
              try {
              logDecompressedData860.setCrdhldrConvRte100860(CFUtil.getLong(substring(dataGroup1000.getData1000(),(si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(9).getSi583DeStartingPos2()-1), (si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(9).getSi583DeLength2() + (si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(9).getSi583DeStartingPos2() - 1)) )));
              } catch(NumberFormatException e) {}
          }
//  IF 88-SI583-DE-PRESENT-2 (14)
          if ( si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(13).isSi583DePresent288()  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (14) : SI583-DE-LENGTH-2 (14)) TO 860-CARDHOLDER-EXPDT
              logDecompressedData860.replace(dataGroup1000/*parent*/,0+si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(13).getSi583DeStartingPos2() - 1/*fromOffset - (cardholderExpdt860) */,si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(13).getSi583DeLength2()/*fromLen*/,435/*toOffset - (data1000) */,4/*toLen*/);
          }
//  IF 88-SI583-DE-PRESENT-2 (15)
          if ( si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(14).isSi583DePresent288()  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (15) : SI583-DE-LENGTH-2 (15)) TO 860-TRANS-MMDD
              logDecompressedData860.setTransMmdd860(CFUtil.getInt(substring(dataGroup1000.getData1000(),(si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(14).getSi583DeStartingPos2()-1), (si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(14).getSi583DeLength2() + (si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(14).getSi583DeStartingPos2() - 1)) )));
          }
//  IF 88-SI583-DE-PRESENT-2 (16)
          if ( si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(15).isSi583DePresent288()  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (16) : SI583-DE-LENGTH-2 (16)) TO 860-CONV-100-MMDD
              logDecompressedData860.setConv100Mmdd860(CFUtil.getInt(substring(dataGroup1000.getData1000(),(si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(15).getSi583DeStartingPos2()-1), (si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(15).getSi583DeLength2() + (si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(15).getSi583DeStartingPos2() - 1)) )));
          }
//  IF 88-SI583-DE-PRESENT-2 (18)
          if ( si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(17).isSi583DePresent288()  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (18) : SI583-DE-LENGTH-2 (18)) TO 860-MERCHANT-TYPE
              logDecompressedData860.setMerchantType860(CFUtil.getInt(substring(dataGroup1000.getData1000(),(si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(17).getSi583DeStartingPos2()-1), (si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(17).getSi583DeLength2() + (si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(17).getSi583DeStartingPos2() - 1)) )));
          }
//  IF 88-SI583-DE-PRESENT-2 (20)
          if ( si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(19).isSi583DePresent288()  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (20) : SI583-DE-LENGTH-2 (20)) TO 860-COUNTRY-CODE
              logDecompressedData860.replace(dataGroup1000/*parent*/,0+si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(19).getSi583DeStartingPos2() - 1/*fromOffset - (countryCode860) */,si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(19).getSi583DeLength2()/*fromLen*/,451/*toOffset - (data1000) */,3/*toLen*/);
          }
//  IF 88-SI583-DE-PRESENT-2 (22)
          if ( si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(21).isSi583DePresent288()  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (22) : SI583-DE-LENGTH-2 (22)) TO 860-POS-DEVICE-TYPE
              logDecompressedData860.replace(dataGroup1000/*parent*/,0+si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(21).getSi583DeStartingPos2() - 1/*fromOffset - (posDeviceType860) */,si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(21).getSi583DeLength2()/*fromLen*/,454/*toOffset - (data1000) */,3/*toLen*/);
          }
//  IF 88-SI583-DE-PRESENT-2 (26)
          if ( si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(25).isSi583DePresent288()  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (26) : SI583-DE-LENGTH-2 (26)) TO 860-POS-PIN-CAPTURE
              logDecompressedData860.setPosPinCapture860(CFUtil.getInt(substring(dataGroup1000.getData1000(),(si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(25).getSi583DeStartingPos2()-1), (si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(25).getSi583DeLength2() + (si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(25).getSi583DeStartingPos2() - 1)) )));
          }

// **** If present we need this value for obscuring de-035 or de-045
// **** so move it now.
//  IF 88-SI583-DE-PRESENT-2 (63)
          if ( si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(62).isSi583DePresent288()  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (63) : SI583-DE-LENGTH-2 (63)) TO 860-BKNT-DATA
              logDecompressedData860.replace(dataGroup1000/*parent*/,0+si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(62).getSi583DeStartingPos2() - 1/*fromOffset - (bkntData860) */,si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(62).getSi583DeLength2()/*fromLen*/,682/*toOffset - (data1000) */,12/*toLen*/);
          }
//  IF 88-SI583-DE-PRESENT-2 (35)
          if ( si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(34).isSi583DePresent288()  ) { 
//  MOVE SI583-DE-LENGTH-2 (35) TO 800-OBSCURE-END-POS
              work.setObscureEndPos800(si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(34).getSi583DeLength2());
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (35) : SI583-DE-LENGTH-2 (35)) TO 800-OBSCURE-DATA
              work.setObscureData800(substring(dataGroup1000.getData1000(),(si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(34).getSi583DeStartingPos2()-1), (si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(34).getSi583DeLength2() + (si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(34).getSi583DeStartingPos2() - 1)) ));
//  PERFORM 5300-OBSCURE-DATA
              obscureData();/*5300-OBSCURE-DATA*/
//  MOVE 800-OBSCURE-DATA TO 860-TRACK-TWO-DATA
              logDecompressedData860.setTrackTwoData860(work.getObscureData800());
          }
//  IF 88-SI583-DE-PRESENT-2 (37)
          if ( si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(36).isSi583DePresent288()  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (37) : SI583-DE-LENGTH-2 (37)) TO 860-RETRIEVAL-REFNO
              logDecompressedData860.replace(dataGroup1000/*parent*/,0+si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(36).getSi583DeStartingPos2() - 1/*fromOffset - (retrievalRefno860) */,si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(36).getSi583DeLength2()/*fromLen*/,496/*toOffset - (data1000) */,12/*toLen*/);
          }
//  IF 88-SI583-DE-PRESENT-2 (41)
          if ( si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(40).isSi583DePresent288()  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (41) : SI583-DE-LENGTH-2 (41)) TO 860-ID-TERMINAL
              logDecompressedData860.replace(dataGroup1000/*parent*/,0+si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(40).getSi583DeStartingPos2() - 1/*fromOffset - (idTerminal860) */,si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(40).getSi583DeLength2()/*fromLen*/,508/*toOffset - (data1000) */,8/*toLen*/);
          }
//  IF 88-SI583-DE-PRESENT-2 (42)
          if ( si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(41).isSi583DePresent288()  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (42) : SI583-DE-LENGTH-2 (42)) TO 860-CARD-ACCEPTOR
              logDecompressedData860.replace(dataGroup1000/*parent*/,0+si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(41).getSi583DeStartingPos2() - 1/*fromOffset - (cardAcceptor860) */,si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(41).getSi583DeLength2()/*fromLen*/,516/*toOffset - (data1000) */,15/*toLen*/);
          }
//  IF 88-SI583-DE-PRESENT-2 (43)
          if ( si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(42).isSi583DePresent288()  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (43) : SI583-DE-LENGTH-2 (43)) TO 860-AUTH-MRCH-NMCTST
              logDecompressedData860.replace(dataGroup1000/*parent*/,0+si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(42).getSi583DeStartingPos2() - 1/*fromOffset - (authMrchNmctst860) */,si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(42).getSi583DeLength2()/*fromLen*/,531/*toOffset - (data1000) */,40/*toLen*/);
          }
//  IF 88-SI583-DE-PRESENT-2 (45)
          if ( si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(44).isSi583DePresent288()  ) { 
//  MOVE SI583-DE-LENGTH-2 (45) TO 800-OBSCURE-END-POS
              work.setObscureEndPos800(si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(44).getSi583DeLength2());
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (45) : SI583-DE-LENGTH-2 (45)) TO 800-OBSCURE-DATA
              work.setObscureData800(substring(dataGroup1000.getData1000(),(si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(44).getSi583DeStartingPos2()-1), (si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(44).getSi583DeLength2() + (si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(44).getSi583DeStartingPos2() - 1)) ));
//  PERFORM 5300-OBSCURE-DATA
              obscureData();/*5300-OBSCURE-DATA*/
//  MOVE 800-OBSCURE-DATA TO 860-TRACK-ONE-DATA
              logDecompressedData860.setTrackOneData860(work.getObscureData800());
          }

// *    If 88-si583-de-present-2 (48)
// *       de48 handled elsewhere
//  IF 88-SI583-DE-PRESENT-2 (49)
          if ( si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(48).isSi583DePresent288()  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (49) : SI583-DE-LENGTH-2 (49)) TO 860-CURRENCY-CODE
              logDecompressedData860.replace(dataGroup1000/*parent*/,0+si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(48).getSi583DeStartingPos2() - 1/*fromOffset - (currencyCode860) */,si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(48).getSi583DeLength2()/*fromLen*/,647/*toOffset - (data1000) */,3/*toLen*/);
          }
//  IF 88-SI583-DE-PRESENT-2 (50)
          if ( si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(49).isSi583DePresent288()  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (50) : SI583-DE-LENGTH-2 (50)) TO 860-CRNCY-CDE-SETL-100
              logDecompressedData860.setCrncyCdeSetl100860(CFUtil.getInt(substring(dataGroup1000.getData1000(),(si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(49).getSi583DeStartingPos2()-1), (si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(49).getSi583DeLength2() + (si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(49).getSi583DeStartingPos2() - 1)) )));
          }
//  IF 88-SI583-DE-PRESENT-2 (51)
          if ( si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(50).isSi583DePresent288()  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (51) : SI583-DE-LENGTH-2 (51)) TO 860-CRNCY-CRDHLDR-100
              logDecompressedData860.setCrncyCrdhldr100860(CFUtil.getInt(substring(dataGroup1000.getData1000(),(si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(50).getSi583DeStartingPos2()-1), (si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(50).getSi583DeLength2() + (si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(50).getSi583DeStartingPos2() - 1)) )));
          }
//  IF 88-SI583-DE-PRESENT-2 (61)
          if ( si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(60).isSi583DePresent288()  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (61) : SI583-DE-LENGTH-2 (61)) TO 860-POS-DATA
              logDecompressedData860.replace(dataGroup1000/*parent*/,0+si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(60).getSi583DeStartingPos2() - 1/*fromOffset - (posData860) */,si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(60).getSi583DeLength2()/*fromLen*/,656/*toOffset - (data1000) */,26/*toLen*/);
          }
//  IF 88-SI583-DE-PRESENT-2 (112)
          if ( si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(111).isSi583DePresent288()  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (112) : SI583-DE-LENGTH-2 (112)) TO 860-DE112-100
              logDecompressedData860.replace(dataGroup1000/*parent*/,0+si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(111).getSi583DeStartingPos2() - 1/*fromOffset - (de112100860) */,si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(111).getSi583DeLength2()/*fromLen*/,694/*toOffset - (data1000) */,103/*toLen*/);
          }

// *    If 88-si583-de-present-2 (120)
// *       de120 handled elsewhere
//  IF 88-SI583-DE-PRESENT-2 (125)
          if ( si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(124).isSi583DePresent288()  ) { 
//  MOVE 1000-DATA ( SI583-DE-STARTING-POS-2 (125) : SI583-DE-LENGTH-2 (125)) TO 860-CRNCY-CONV-100
              logDecompressedData860.replace(dataGroup1000/*parent*/,0+si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(124).getSi583DeStartingPos2() - 1/*fromOffset - (crncyConv100860) */,si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(124).getSi583DeLength2()/*fromLen*/,797/*toOffset - (data1000) */,78/*toLen*/);
          }
      
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
      private void obscureData() throws Exception {
			// Declare local variables used in the method
			char[] obscureData800 = null;
			char[] finNetworkCode860 = null;
			BkntData860 bkntData860 = logDecompressedData860.getBkntData860();
			int obscureStartPos800 = 0;
			int one300 = 0;
			// End of variable declaration

      
// *    If 88-si583-de-present-2 (126)
// *       de120 handled elsewhere
// *
// *****************************************************************
// * 5 3 0 0 - o b s c u r e - d a t a                             *
// * we are not looking for se92 data to obscure because we do not *
// * use that data in this program.                                *
// *****************************************************************
//  MOVE 300-ONE TO 800-OBSCURE-START-POS
          work.setObscureStartPos800(work.getOne300());
//  PERFORM VARYING 800-OBSCURE-POS FROM 300-TWELVE BY 300-ONE UNTIL 800-OBSCURE-POS > 800-OBSCURE-END-POS
          for (work.setObscurePos800(work.getTwelve300()); (	( work.getObscurePos800() <= work.getObscureEndPos800() )) ; work.setObscurePos800(work.getObscurePos800() + work.getOne300()) ) {
              obscureData800 = work.getObscureData800();
//  IF 800-OBSCURE-DATA ( 800-OBSCURE-POS : 300-ONE ) = '�' OR '^'
              if (work.getObscurePos800() > 0 && obscureData800[getIndex(work.getObscurePos800())] == '�' || work.getObscurePos800() > 0 && obscureData800[getIndex(work.getObscurePos800())] == '^') { 
//  ADD 300-ONE TO 800-OBSCURE-POS
                  work.setObscurePos800(work.getObscurePos800()+work.getOne300());
//  PERFORM VARYING 800-OBSCURE-POS2 FROM 800-OBSCURE-POS BY 300-ONE UNTIL 800-OBSCURE-POS2 > 800-OBSCURE-END-POS
                  for (work.setObscurePos2800(work.getObscurePos800()); (	( work.getObscurePos2800() <= work.getObscureEndPos800() )) ; work.setObscurePos2800(work.getObscurePos2800() + work.getOne300()) ) {
//  MOVE 800-OBSCURE-POS2 TO 800-OBSCURE-POS
                      work.setObscurePos800(work.getObscurePos2800());
                      obscureData800 = work.getObscureData800();
//  IF 800-OBSCURE-DATA ( 800-OBSCURE-POS2 : 300-ONE ) = '�' OR '^'
                      if (work.getObscurePos2800() > 0 && obscureData800[getIndex(work.getObscurePos2800())] == '�' || work.getObscurePos2800() > 0 && obscureData800[getIndex(work.getObscurePos2800())] == '^') { 
                          work.setObscureStartPos800((int)Math.abs(work.getObscurePos2800() + work.getEight300()));
//  MOVE 300-MAX TO 800-OBSCURE-POS2 800-OBSCURE-POS
                          work.setObscurePos2800(work.getMax300());
                          work.setObscurePos800(work.getMax300());
                      }
  
                  }
              }
  
//  ELSE
              else { 
                  obscureData800 = work.getObscureData800();
//  IF 800-OBSCURE-DATA ( 800-OBSCURE-POS : 300-ONE ) = 'D' OR ';' OR '='
                  if (work.getObscurePos800() > 0 && obscureData800[getIndex(work.getObscurePos800())] == 'D' || work.getObscurePos800() > 0 && obscureData800[getIndex(work.getObscurePos800())] == ';' || work.getObscurePos800() > 0 && obscureData800[getIndex(work.getObscurePos800())] == '=') { 
                      work.setObscureStartPos800((int)Math.abs(work.getObscurePos800() + work.getEight300()));
//  MOVE 300-MAX TO 800-OBSCURE-POS
                      work.setObscurePos800(work.getMax300());
                  }
  
              }
          }
          one300 = work.getOne300();
          obscureStartPos800 = work.getObscureStartPos800();
//  IF 800-OBSCURE-START-POS > 300-ONE
          if (	( obscureStartPos800 > one300 )) { 
              work.setObscureLgth800((int)Math.abs(work.getObscureEndPos800() - work.getObscureStartPos800() + work.getOne300()));
              finNetworkCode860 = bkntData860.getFinNetworkCode860();
//  IF 860-FIN-NETWORK-CODE = 'MCF' OR 'MGF' OR 'MNF' OR 'MPK'
//  LITERAL_MPK = 'MPK'
              if (compareChars(finNetworkCode860,CONSTANTS.LITERAL_MCF) == 0 || compareChars(finNetworkCode860,CONSTANTS.LITERAL_MGF) == 0 || compareChars(finNetworkCode860,CONSTANTS.LITERAL_MNF) == 0 || compareChars(finNetworkCode860,CONSTANTS.LITERAL_MPK) == 0) { 
//  SUBTRACT 300-TWO FROM 800-OBSCURE-LGTH
                  work.setObscureLgth800(Math.abs(work.getObscureLgth800()-work.getTwo300()));
              }
  
//  MOVE ALL '*' TO 800-OBSCURE-DATA ( 800-OBSCURE-START-POS : 800-OBSCURE-LGTH )
              work.setObscureData800(replace(work.getObscureData800(),CONSTANTS.LITERAL_STR_,(work.getObscureStartPos800()-1), (work.getObscureLgth800() + (work.getObscureStartPos800() - 1)) ));
          }
  
      
      }
      /**
      * generateControlReport 
      *   This method is derived from 
  *   COBOL Paragraph - 6000-GENERATE-CONTROL-REPORT COBOL Cyclomatic complexity - 2
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void generateControlReport() throws Exception {
      
// ***************************************************************
// *  This routine formats the lines for the record count by     *
// *  class report.                                              *
// ***************************************************************
//  PERFORM 6000-GENERATE-CONTROL-REPORT-SPLIT0
          generateControlReportSplit0();/*6000-GENERATE-CONTROL-REPORT-SPLIT0*/
//  PERFORM 6000-GENERATE-CONTROL-REPORT-SPLIT1
          generateControlReportSplit1();/*6000-GENERATE-CONTROL-REPORT-SPLIT1*/
      
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
      private void generateControlReportSplit0() throws Exception {
//  PERFORM 6200-WRITE-REPORT-HEADINGS
          writeReportHeadings();/*6200-WRITE-REPORT-HEADINGS*/

// *
//  MOVE 'TOTAL INPUT PROCESSED' TO 362-DETAIL-LOG-TYPE
          detailLine362.setDetailLogType362(CONSTANTS.LITERAL_TOTAL_B8_INPUTPROCESSED);
//  MOVE SPACE TO 362-DETAIL-LOG-CLASS
          detailLine362.setDetailLogClass362(CONSTANTS.SPACE);
//  MOVE 400-TOTAL-RECS TO 362-DETAIL-RECORD-TOTAL
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          detailLine362.setDetailRecordTotal362(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(work.getTotalRecs400()).toCharArray()));
//  MOVE 300-LIT-A TO 362-DETAIL-REPORT-ID
          detailLine362.setDetailReportId362(work.getLitA300());
//  MOVE 300-DOUBLE-SPACE TO 362-DETAIL-CAR-CON
          detailLine362.setDetailCarCon362(work.getDoubleSpace300());
//  ADD 300-TWO TO 400-LINE-COUNT
          work.setLineCount400(work.getLineCount400()+work.getTwo300());
//  PERFORM 6100-WRITE-REPORT-DETAIL-LINE
          writeReportDetailLine();/*6100-WRITE-REPORT-DETAIL-LINE*/

// *
//  MOVE 'ISO AUTHORIZATION IN' TO 362-DETAIL-LOG-TYPE
          detailLine362.setDetailLogType362(CONSTANTS.LITERAL_ISO_B9_AUTHORIZATIONIN);
//  MOVE 'J' TO 362-DETAIL-LOG-CLASS
//  LITERAL_J = 'J'
          detailLine362.setDetailLogClass362(CONSTANTS.LITERAL_J);
//  MOVE 400-TOTAL-ISO-AUTH TO 362-DETAIL-RECORD-TOTAL
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          detailLine362.setDetailRecordTotal362(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(work.getTotalIsoAuth400()).toCharArray()));
//  MOVE 300-LIT-A TO 362-DETAIL-REPORT-ID
          detailLine362.setDetailReportId362(work.getLitA300());
//  MOVE 300-DOUBLE-SPACE TO 362-DETAIL-CAR-CON
          detailLine362.setDetailCarCon362(work.getDoubleSpace300());
//  ADD 300-TWO TO 400-LINE-COUNT
          work.setLineCount400(work.getLineCount400()+work.getTwo300());
//  PERFORM 6100-WRITE-REPORT-DETAIL-LINE
          writeReportDetailLine();/*6100-WRITE-REPORT-DETAIL-LINE*/
//  MOVE ZEROS TO 362-DETAIL-RECORD-TOTAL
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          detailLine362.setDetailRecordTotal362(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,CONSTANTS.ZERO_11));

// *
//  MOVE 'INAS AUTH DROPPED ' TO 362-DETAIL-LOG-TYPE
          detailLine362.setDetailLogType362(CONSTANTS.LITERAL_INAS_B12_AUTHDROPPED);
//  MOVE 'J' TO 362-DETAIL-LOG-CLASS
//  LITERAL_J = 'J'
          detailLine362.setDetailLogClass362(CONSTANTS.LITERAL_J);
//  MOVE 400-TOTAL-IA-DROPPED TO 362-DETAIL-RECORD-TOTAL
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          detailLine362.setDetailRecordTotal362(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(work.getTotalIaDropped400()).toCharArray()));
//  MOVE 300-LIT-A TO 362-DETAIL-REPORT-ID
          detailLine362.setDetailReportId362(work.getLitA300());
//  MOVE 300-DOUBLE-SPACE TO 362-DETAIL-CAR-CON
          detailLine362.setDetailCarCon362(work.getDoubleSpace300());
//  ADD 300-TWO TO 400-LINE-COUNT
          work.setLineCount400(work.getLineCount400()+work.getTwo300());
//  PERFORM 6100-WRITE-REPORT-DETAIL-LINE
          writeReportDetailLine();/*6100-WRITE-REPORT-DETAIL-LINE*/
//  MOVE ZEROS TO 362-DETAIL-RECORD-TOTAL
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          detailLine362.setDetailRecordTotal362(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,CONSTANTS.ZERO_11));

// *
//  MOVE 'INVALID PAN DROPPED  ' TO 362-DETAIL-LOG-TYPE
          detailLine362.setDetailLogType362(CONSTANTS.LITERAL_INVALID_B10_PANDROPPED);
//  MOVE SPACE TO 362-DETAIL-LOG-CLASS
          detailLine362.setDetailLogClass362(CONSTANTS.SPACE);
//  MOVE 400-TOTAL-BAD-PAN TO 362-DETAIL-RECORD-TOTAL
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          detailLine362.setDetailRecordTotal362(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(work.getTotalBadPan400()).toCharArray()));
//  MOVE 300-LIT-A TO 362-DETAIL-REPORT-ID
          detailLine362.setDetailReportId362(work.getLitA300());
//  MOVE 300-DOUBLE-SPACE TO 362-DETAIL-CAR-CON
          detailLine362.setDetailCarCon362(work.getDoubleSpace300());
//  ADD 300-TWO TO 400-LINE-COUNT
          work.setLineCount400(work.getLineCount400()+work.getTwo300());
//  PERFORM 6100-WRITE-REPORT-DETAIL-LINE
          writeReportDetailLine();/*6100-WRITE-REPORT-DETAIL-LINE*/

// *
//  MOVE 'PARSE ERRORS         ' TO 362-DETAIL-LOG-TYPE
          detailLine362.setDetailLogType362(CONSTANTS.LITERAL_PARSE_B16_ERRORS);
//  MOVE SPACE TO 362-DETAIL-LOG-CLASS
          detailLine362.setDetailLogClass362(CONSTANTS.SPACE);
//  MOVE 400-TOTAL-PARSE-ERRORS TO 362-DETAIL-RECORD-TOTAL
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          detailLine362.setDetailRecordTotal362(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(work.getTotalParseErrors400()).toCharArray()));
//  MOVE 300-LIT-A TO 362-DETAIL-REPORT-ID
          detailLine362.setDetailReportId362(work.getLitA300());
//  MOVE SPACE TO 362-DETAIL-CAR-CON
          detailLine362.setDetailCarCon362(CONSTANTS.SPACE);
//  ADD 300-ONE TO 400-LINE-COUNT
          work.setLineCount400(work.getLineCount400()+work.getOne300());
//  PERFORM 6100-WRITE-REPORT-DETAIL-LINE
          writeReportDetailLine();/*6100-WRITE-REPORT-DETAIL-LINE*/

// *
//  MOVE 'TOTAL TYPE J2 RECS  ' TO 362-DETAIL-LOG-TYPE
          detailLine362.setDetailLogType362(CONSTANTS.LITERAL_TOTAL_B12_TYPEJ2RECS);
//  MOVE SPACE TO 362-DETAIL-LOG-CLASS
          detailLine362.setDetailLogClass362(CONSTANTS.SPACE);
//  MOVE 400-TOTAL-TYPE-2 TO 362-DETAIL-RECORD-TOTAL
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          detailLine362.setDetailRecordTotal362(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(work.getTotalType2400()).toCharArray()));
//  MOVE 300-LIT-A TO 362-DETAIL-REPORT-ID
          detailLine362.setDetailReportId362(work.getLitA300());
//  MOVE SPACE TO 362-DETAIL-CAR-CON
          detailLine362.setDetailCarCon362(CONSTANTS.SPACE);
//  ADD 300-ONE TO 400-LINE-COUNT
          work.setLineCount400(work.getLineCount400()+work.getOne300());
//  PERFORM 6100-WRITE-REPORT-DETAIL-LINE
          writeReportDetailLine();/*6100-WRITE-REPORT-DETAIL-LINE*/

// *
//  MOVE 'TOTAL TYPE J3 RECS  ' TO 362-DETAIL-LOG-TYPE
          detailLine362.setDetailLogType362(CONSTANTS.LITERAL_TOTAL_B12_TYPEJ3RECS);
//  MOVE SPACE TO 362-DETAIL-LOG-CLASS
          detailLine362.setDetailLogClass362(CONSTANTS.SPACE);
//  MOVE 400-TOTAL-TYPE-3 TO 362-DETAIL-RECORD-TOTAL
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          detailLine362.setDetailRecordTotal362(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(work.getTotalType3400()).toCharArray()));
//  MOVE 300-LIT-A TO 362-DETAIL-REPORT-ID
          detailLine362.setDetailReportId362(work.getLitA300());
//  MOVE SPACE TO 362-DETAIL-CAR-CON
          detailLine362.setDetailCarCon362(CONSTANTS.SPACE);
//  ADD 300-ONE TO 400-LINE-COUNT
          work.setLineCount400(work.getLineCount400()+work.getOne300());
      
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
      private void generateControlReportSplit1() throws Exception {
//  PERFORM 6100-WRITE-REPORT-DETAIL-LINE
          writeReportDetailLine();/*6100-WRITE-REPORT-DETAIL-LINE*/

// *
//  MOVE 'TOTAL 0120 ADVICES  ' TO 362-DETAIL-LOG-TYPE
          detailLine362.setDetailLogType362(CONSTANTS.LITERAL_TOTAL_B11_0120ADVICES);
//  MOVE SPACE TO 362-DETAIL-LOG-CLASS
          detailLine362.setDetailLogClass362(CONSTANTS.SPACE);
//  MOVE 400-TOTAL-0120-ADV TO 362-DETAIL-RECORD-TOTAL
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          detailLine362.setDetailRecordTotal362(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(work.getTotal0120Adv400()).toCharArray()));
//  MOVE 300-LIT-A TO 362-DETAIL-REPORT-ID
          detailLine362.setDetailReportId362(work.getLitA300());
//  MOVE SPACE TO 362-DETAIL-CAR-CON
          detailLine362.setDetailCarCon362(CONSTANTS.SPACE);
//  ADD 300-ONE TO 400-LINE-COUNT
          work.setLineCount400(work.getLineCount400()+work.getOne300());
//  PERFORM 6100-WRITE-REPORT-DETAIL-LINE
          writeReportDetailLine();/*6100-WRITE-REPORT-DETAIL-LINE*/

// *
//  MOVE 'TOTAL REV ADVICES   ' TO 362-DETAIL-LOG-TYPE
          detailLine362.setDetailLogType362(CONSTANTS.LITERAL_TOTAL_B12_REVADVICES);
//  MOVE SPACE TO 362-DETAIL-LOG-CLASS
          detailLine362.setDetailLogClass362(CONSTANTS.SPACE);
//  MOVE 400-TOTAL-REV-ADV TO 362-DETAIL-RECORD-TOTAL
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          detailLine362.setDetailRecordTotal362(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(work.getTotalRevAdv400()).toCharArray()));
//  MOVE 300-LIT-A TO 362-DETAIL-REPORT-ID
          detailLine362.setDetailReportId362(work.getLitA300());
//  MOVE SPACE TO 362-DETAIL-CAR-CON
          detailLine362.setDetailCarCon362(CONSTANTS.SPACE);
//  ADD 300-ONE TO 400-LINE-COUNT
          work.setLineCount400(work.getLineCount400()+work.getOne300());
//  PERFORM 6100-WRITE-REPORT-DETAIL-LINE
          writeReportDetailLine();/*6100-WRITE-REPORT-DETAIL-LINE*/

// *
//  MOVE 'TOTAL VER2 CREATED   ' TO 362-DETAIL-LOG-TYPE
          detailLine362.setDetailLogType362(CONSTANTS.LITERAL_TOTAL_B11_VER2CREATED);
//  MOVE SPACE TO 362-DETAIL-LOG-CLASS
          detailLine362.setDetailLogClass362(CONSTANTS.SPACE);
//  MOVE 400-TOTAL-VER2 TO 362-DETAIL-RECORD-TOTAL
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          detailLine362.setDetailRecordTotal362(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(work.getTotalVer2400()).toCharArray()));
//  MOVE 300-LIT-A TO 362-DETAIL-REPORT-ID
          detailLine362.setDetailReportId362(work.getLitA300());
//  MOVE 300-DOUBLE-SPACE TO 362-DETAIL-CAR-CON
          detailLine362.setDetailCarCon362(work.getDoubleSpace300());
//  ADD 300-TWO TO 400-LINE-COUNT
          work.setLineCount400(work.getLineCount400()+work.getTwo300());
//  PERFORM 6100-WRITE-REPORT-DETAIL-LINE
          writeReportDetailLine();/*6100-WRITE-REPORT-DETAIL-LINE*/

// *
//  MOVE 'TOTAL AVS2 FOUND     ' TO 362-DETAIL-LOG-TYPE
          detailLine362.setDetailLogType362(CONSTANTS.LITERAL_TOTAL_B13_AVS2FOUND);
//  MOVE SPACE TO 362-DETAIL-LOG-CLASS
          detailLine362.setDetailLogClass362(CONSTANTS.SPACE);
//  MOVE 400-AVS2-REC-COUNT TO 362-DETAIL-RECORD-TOTAL
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          detailLine362.setDetailRecordTotal362(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(work.getAvs2RecCount400()).toCharArray()));
//  MOVE 300-LIT-A TO 362-DETAIL-REPORT-ID
          detailLine362.setDetailReportId362(work.getLitA300());
//  MOVE 300-DOUBLE-SPACE TO 362-DETAIL-CAR-CON
          detailLine362.setDetailCarCon362(work.getDoubleSpace300());
//  ADD 300-TWO TO 400-LINE-COUNT
          work.setLineCount400(work.getLineCount400()+work.getTwo300());
//  PERFORM 6100-WRITE-REPORT-DETAIL-LINE
          writeReportDetailLine();/*6100-WRITE-REPORT-DETAIL-LINE*/

// *
//  MOVE 300-LIT-A TO 366-ENDOFRPT-REPORT-ID
          endOfReportLine366.setEndofrptReportId366(work.getLitA300());
//  MOVE 300-TRIPLE-SPACE TO 366-ENDOFRPT-CAR-CON
          endOfReportLine366.setEndofrptCarCon366(work.getTripleSpace300());
//  WRITE REPORT-RECORD FROM 366-END-OF-REPORT-LINE
          logStatisticsReport.write(endOfReportLine366.toCharArray()); 
          reportRecord.setString(CONSTANTS.LOW_VALUE_215750933);
      
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
      private void writeReportDetailLine() throws Exception {
			// Declare local variables used in the method
			int lineCount400 = 0;
			int maxLines400 = 0;
			// End of variable declaration

      
// *
// ***************************************************************
// *  This routine writes the report detail line                 *
// ***************************************************************
//  WRITE REPORT-RECORD FROM 362-DETAIL-LINE
          logStatisticsReport.write(detailLine362.toCharArray()); 
          reportRecord.setString(CONSTANTS.LOW_VALUE_215750933);
//  IF 400-LINE-COUNT > 400-MAX-LINES
          if (	( work.getLineCount400() > work.getMaxLines400() )) { 
//  PERFORM 6200-WRITE-REPORT-HEADINGS
              writeReportHeadings();/*6200-WRITE-REPORT-HEADINGS*/
          }
      
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
      private void writeReportHeadings() throws Exception {
      
// *
// ***************************************************************
// *  This routine writes the report headings                    *
// ***************************************************************
//  ADD 300-ONE TO 400-PAGE-COUNT
          work.setPageCount400(work.getPageCount400()+work.getOne300());
//  MOVE 400-PAGE-COUNT TO 354-HEAD3-PAGE
//  FORMAT_34169195 = "ZZ9"
          head3354.setHead3Page354(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_34169195,String.valueOf(work.getPageCount400()).toCharArray()));

// *
//  MOVE 300-LIT-A TO 350-HEAD1-REPORT-ID
          head1350.setHead1ReportId350(work.getLitA300());
//  MOVE 300-NEW-PAGE TO 350-HEAD1-CAR-CON
          head1350.setHead1CarCon350(work.getNewPage300());
//  WRITE REPORT-RECORD FROM 350-HEAD-1
          logStatisticsReport.write(head1350.toCharArray()); 
          reportRecord.setString(CONSTANTS.LOW_VALUE_215750933);

// *
//  MOVE 300-LIT-A TO 352-HEAD2-REPORT-ID
          head2352.setHead2ReportId352(work.getLitA300());
//  MOVE SPACE TO 352-HEAD2-CAR-CON
          head2352.setHead2CarCon352(CONSTANTS.SPACE);
//  WRITE REPORT-RECORD FROM 352-HEAD-2
          logStatisticsReport.write(head2352.toCharArray()); 
          reportRecord.setString(CONSTANTS.LOW_VALUE_215750933);

// *
//  MOVE 300-LIT-A TO 354-HEAD3-REPORT-ID
          head3354.setHead3ReportId354(work.getLitA300());
//  MOVE SPACE TO 354-HEAD3-CAR-CON
          head3354.setHead3CarCon354(CONSTANTS.SPACE);
//  WRITE REPORT-RECORD FROM 354-HEAD-3
          logStatisticsReport.write(head3354.toCharArray()); 
          reportRecord.setString(CONSTANTS.LOW_VALUE_215750933);

// *
//  MOVE 300-LIT-A TO 356-HEAD4-REPORT-ID
          head4356.setHead4ReportId356(work.getLitA300());
//  MOVE 300-DOUBLE-SPACE TO 356-HEAD4-CAR-CON
          head4356.setHead4CarCon356(work.getDoubleSpace300());
//  WRITE REPORT-RECORD FROM 356-HEAD-4
          logStatisticsReport.write(head4356.toCharArray()); 
          reportRecord.setString(CONSTANTS.LOW_VALUE_215750933);

// *
//  MOVE 300-LIT-A TO 358-HEAD5-REPORT-ID
          head5358.setHead5ReportId358(work.getLitA300());
//  MOVE SPACE TO 358-HEAD5-CAR-CON
          head5358.setHead5CarCon358(CONSTANTS.SPACE);
//  WRITE REPORT-RECORD FROM 358-HEAD-5
          logStatisticsReport.write(head5358.toCharArray()); 
          reportRecord.setString(CONSTANTS.LOW_VALUE_215750933);

// *
//  MOVE 300-LIT-A TO 360-HEAD6-REPORT-ID
          head6360.setHead6ReportId360(work.getLitA300());
//  MOVE SPACE TO 360-HEAD6-CAR-CON
          head6360.setHead6CarCon360(CONSTANTS.SPACE);
//  WRITE REPORT-RECORD FROM 360-HEAD-6
          logStatisticsReport.write(head6360.toCharArray()); 
          reportRecord.setString(CONSTANTS.LOW_VALUE_215750933);

// *

// *
// ****************************************************************
// * This paragraph controls processing of de48 data. set the     *
// * address pointer to the data to be parsed.                    *
// ****************************************************************
//  MOVE 300-SEVEN TO 400-LINE-COUNT
          work.setLineCount400(work.getSeven300());
      
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
      private void processDe48() throws Exception {
//  SET 88-SEPR-DE48 TO TRUE
          seprControlBlock.setSeprDe4888True(); 
          
//  SET SEPR-DATA-PTR TO ADDRESS OF 500-DE48-DATA
          seprControlBlock.setSeprDataPtr(setObject(de48DataGroup500)); 
          
//  CALL SEPR-PTR-SI994020
          // CALL SEPR-PTR-SI994020
          	this.setRc( si994020.process());
//  IF 88-SEPR-RC-0000
          if ( seprControlBlock.isSeprRc000088()  ) { 
//  PERFORM 8020-PROCESS-DE48-SEXX
              processDe48Sexx();/*8020-PROCESS-DE48-SEXX*/
          }
      
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
      private void processDe48Sexx() throws Exception {
			// Declare local variables used in the method
			Sf31IsoCrncyConvFields sf31IsoCrncyConvFields = sf31IsoExtractRec.getSf31IsoCrncyConvFields();
			char[] de48Data500 = null;
			char[] lit03300 = null;
			char[] lit02300 = null;
			char[] lit51300 = null;
			char[] lit52300 = null;
			char[] litY300 = null;
			char[] authResponse860 = null;
			char[] lit85300 = null;
			int de48Se66SfLen9500 = 0;
			Sf31IsoAddlAvsii sf31IsoAddlAvsii = sf31IsoExtractRec.getSf31IsoAddlAvsii();
			// End of variable declaration

      
// ****************************************************************
// * This paragraph finds ver2 values within the de48 se data.    *
// * use the offset to find the se's position in the de.          *
// ****************************************************************
//  INITIALIZE SF31-ISO-DE48-SE42-SF2-SF3 SF31-ISO-DE48-SE42-LEN3
          sf31IsoExtractRec.setSf31IsoDe48Se42Sf2Sf3(CONSTANTS.SPACE_4 /* Fill 4 Spaces*/);
          sf31IsoExtractRec.setSf31IsoDe48Se42Len3(CONSTANTS.SPACE_3 /* Fill 3 Spaces*/);
//  IF SEPR-LENGTH (42) > ZERO
          if (	( seprTableGroup.getSeprTableRedefined().getSeprEntry(41).getSeprLength() > 0 )) { 
//  INITIALIZE 400-SE42-POS 400-SE42-LNTH
              work.setSe42Pos400(0);
              work.setSe42Lnth400(0);
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (42) + 4 : 2) TO 500-SE42-1-2 SF31-ISO-DE48-TAG42-FLD1
              de48Se42500.replace(de48DataGroup500/*parent*/,0+seprTableGroup.getSeprTableRedefined().getSeprEntry(41).getSeprOffset() + 4 - 1/*fromOffset - (se4212500) */,2/*fromLen*/,0/*toOffset - (de48Data500) */,2/*toLen*/);
              sf31IsoExtractRec.replace(de48DataGroup500/*parent*/,0+seprTableGroup.getSeprTableRedefined().getSeprEntry(41).getSeprOffset() + 4 - 1/*fromOffset - (sf31IsoDe48Tag42Fld1) */,2/*fromLen*/,578/*toOffset - (de48Data500) */,2/*toLen*/);
  
//  ADD 300-FOUR TO 400-SE42-POS
              work.setSe42Pos400(work.getSe42Pos400()+work.getFour300());
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (42) + 2 : 2) TO 400-SE42-LNTH
              work.setSe42Lnth400(CFUtil.getInt(substring(de48DataGroup500.getDe48Data500(),(seprTableGroup.getSeprTableRedefined().getSeprEntry(41).getSeprOffset() + 2-1), (seprTableGroup.getSeprTableRedefined().getSeprEntry(41).getSeprOffset() + 2 + 1) )));

// ******************************************************************
// * Check length of se42 sf1 to find sf1 3rd byte is present or not*
// ******************************************************************
              de48Data500 = de48DataGroup500.getDe48Data500();
              lit03300 = work.getLit03300();
//  IF 500-DE48-DATA ( SEPR-OFFSET (42) + 2 : 2) EQUAL 300-LIT-03
              if (Field.compareChar(de48Data500 , lit03300 , ( (seprTableGroup.getSeprTableRedefined().getSeprEntry(41).getSeprOffset() + 2 - 1) /*start*/ ), 2 /*left len*/ , 2 /*right len*/)) { 
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (42) + 6 : 1) TO 500-SE42-3
                  de48Se42500.replace(de48DataGroup500/*parent*/,0+seprTableGroup.getSeprTableRedefined().getSeprEntry(41).getSeprOffset() + 6 - 1/*fromOffset - (se423500) */,1/*fromLen*/,2/*toOffset - (de48Data500) */,1/*toLen*/);
              }
  
//  ELSE
              else { 
//  MOVE SPACE TO 500-SE42-3
                  de48Se42500.setSe423500(CONSTANTS.SPACE);
              }
              // MOVE 500-DE48-SE42 TO SF31-ISO-DE48-SE42-LEN3
              sf31IsoExtractRec.setSf31IsoDe48Se42Len3(de48Se42500.toCharArray());
              work.setSe42Pos400((int)Math.abs(work.getSe42Lnth400() + work.getSe42Pos400()));

// ******************************************************************
// * Check whether length of se42 is greater than seven if greater, *
// * then populate sf2 and sf3 when it is in o110 message otherwise *
// * populate spaces.                                               *
// ******************************************************************
//  IF SEPR-LENGTH (42) GREATER 300-SEVEN AND ( 88-100-MTI1-0110 OR 88-100-MTI2-0110 )
              if (	( seprTableGroup.getSeprTableRedefined().getSeprEntry(41).getSeprLength() > work.getSeven300() ) && ( work.isMti1011088100()   ||  work.isMti2011088100()  )) { 
                  de48Data500 = de48DataGroup500.getDe48Data500();
                  lit02300 = work.getLit02300();
//  IF 500-DE48-DATA ( SEPR-OFFSET (42) + 400-SE42-POS : 2) EQUAL 300-LIT-02
                  if (Field.compareChar(de48Data500 , lit02300 , ( (seprTableGroup.getSeprTableRedefined().getSeprEntry(41).getSeprOffset() + work.getSe42Pos400() - 1) /*start*/ ), 2 /*left len*/ , 2 /*right len*/)) { 
//  ADD 300-TWO TO 400-SE42-POS
                      work.setSe42Pos400(work.getSe42Pos400()+work.getTwo300());
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (42) + 400-SE42-POS : 2) TO 500-DE48-SE42-SF-LEN
                      work.setDe48Se42SfLen500(CFUtil.getInt(substring(de48DataGroup500.getDe48Data500(),(seprTableGroup.getSeprTableRedefined().getSeprEntry(41).getSeprOffset() + work.getSe42Pos400()-1), (seprTableGroup.getSeprTableRedefined().getSeprEntry(41).getSeprOffset() + work.getSe42Pos400() + 1) )));
//  ADD 300-TWO TO 400-SE42-POS
                      work.setSe42Pos400(work.getSe42Pos400()+work.getTwo300());
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (42) + 400-SE42-POS : 500-DE48-SE42-SF-LEN ) TO 500-DE48-SE42-SF2-SF3 (1 : 500-DE48-SE42-SF-LEN )
                      work.setDe48Se42Sf2Sf3500(replace(work.getDe48Se42Sf2Sf3500(),substring(de48DataGroup500.getDe48Data500(),(seprTableGroup.getSeprTableRedefined().getSeprEntry(41).getSeprOffset() + work.getSe42Pos400()-1), (work.getDe48Se42SfLen500() + (seprTableGroup.getSeprTableRedefined().getSeprEntry(41).getSeprOffset() + work.getSe42Pos400() - 1)) ),0,work.getDe48Se42SfLen500()));
//  ADD 500-DE48-SE42-SF-LEN TO 400-SE42-POS
                      work.setSe42Pos400(work.getSe42Pos400()+work.getDe48Se42SfLen500());
                  }
  
                  de48Data500 = de48DataGroup500.getDe48Data500();
                  lit03300 = work.getLit03300();
//  IF 500-DE48-DATA ( SEPR-OFFSET (42) + 400-SE42-POS : 2) EQUAL 300-LIT-03
                  if (Field.compareChar(de48Data500 , lit03300 , ( (seprTableGroup.getSeprTableRedefined().getSeprEntry(41).getSeprOffset() + work.getSe42Pos400() - 1) /*start*/ ), 2 /*left len*/ , 2 /*right len*/)) { 
//  ADD 300-TWO TO 400-SE42-POS
                      work.setSe42Pos400(work.getSe42Pos400()+work.getTwo300());
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (42) + 400-SE42-POS : 2) TO 500-DE48-SE42-SF-LEN1
                      work.setDe48Se42SfLen1500(CFUtil.getInt(substring(de48DataGroup500.getDe48Data500(),(seprTableGroup.getSeprTableRedefined().getSeprEntry(41).getSeprOffset() + work.getSe42Pos400()-1), (seprTableGroup.getSeprTableRedefined().getSeprEntry(41).getSeprOffset() + work.getSe42Pos400() + 1) )));
//  ADD 300-TWO TO 400-SE42-POS
                      work.setSe42Pos400(work.getSe42Pos400()+work.getTwo300());
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (42) + 400-SE42-POS : 500-DE48-SE42-SF-LEN1 ) TO 500-DE48-SE42-SF2-SF3 ( 500-DE48-SE42-SF-LEN + 1 : 500-DE48-SE42-SF-LEN1 )
                      work.setDe48Se42Sf2Sf3500(replace(work.getDe48Se42Sf2Sf3500(),substring(de48DataGroup500.getDe48Data500(),(seprTableGroup.getSeprTableRedefined().getSeprEntry(41).getSeprOffset() + work.getSe42Pos400()-1), (work.getDe48Se42SfLen1500() + (seprTableGroup.getSeprTableRedefined().getSeprEntry(41).getSeprOffset() + work.getSe42Pos400() - 1)) ),(work.getDe48Se42SfLen500() + 1-1), (work.getDe48Se42SfLen1500() + (work.getDe48Se42SfLen500() + 1 - 1)) ));
                  }
  
//  MOVE 500-DE48-SE42-SF2-SF3 TO SF31-ISO-DE48-SE42-SF2-SF3
                  sf31IsoExtractRec.setSf31IsoDe48Se42Sf2Sf3(work.getDe48Se42Sf2Sf3500());
              }
          }
//  INITIALIZE SF31-ISO-DE48-SE33-SF1 SF31-ISO-DE48-SE33-SF2 SF31-ISO-DE48-SE33-SF5 SF31-ISO-DE48-SE33-SF6
          sf31IsoExtractRec.setSf31IsoDe48Se33Sf1(CONSTANTS.SPACE /* Fill 1 Spaces*/);
          sf31IsoExtractRec.setSf31IsoDe48Se33Sf2(CONSTANTS.SPACE_19 /* Fill 19 Spaces*/);
          sf31IsoExtractRec.setSf31IsoDe48Se33Sf5(CONSTANTS.SPACE_2 /* Fill 2 Spaces*/);
          sf31IsoExtractRec.setSf31IsoDe48Se33Sf6(CONSTANTS.SPACE_11 /* Fill 11 Spaces*/);
//  IF SEPR-LENGTH (33) > ZERO
          if (	( seprTableGroup.getSeprTableRedefined().getSeprEntry(32).getSeprLength() > 0 )) { 
//  INITIALIZE 400-SE33-POS
              work.setSe33Pos400(0);
//  PERFORM UNTIL 400-SE33-POS GREATER THAN SEPR-LENGTH (33)
              while ((	( work.getSe33Pos400() <= seprTableGroup.getSeprTableRedefined().getSeprEntry(32).getSeprLength() ))) {
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (33) + 400-SE33-POS : 2) TO 500-DE48-SE33-SF-ID
                  work.setDe48Se33SfId500(substring(de48DataGroup500.getDe48Data500(),(seprTableGroup.getSeprTableRedefined().getSeprEntry(32).getSeprOffset() + work.getSe33Pos400()-1), (seprTableGroup.getSeprTableRedefined().getSeprEntry(32).getSeprOffset() + work.getSe33Pos400() + 1) ));
//  ADD 300-TWO TO 400-SE33-POS
                  work.setSe33Pos400(work.getSe33Pos400()+work.getTwo300());
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (33) + 400-SE33-POS : 2) TO 500-DE48-SE33-SF-LEN
                  work.setDe48Se33SfLen500(CFUtil.getInt(substring(de48DataGroup500.getDe48Data500(),(seprTableGroup.getSeprTableRedefined().getSeprEntry(32).getSeprOffset() + work.getSe33Pos400()-1), (seprTableGroup.getSeprTableRedefined().getSeprEntry(32).getSeprOffset() + work.getSe33Pos400() + 1) )));
//  ADD 300-TWO TO 400-SE33-POS
                  work.setSe33Pos400(work.getSe33Pos400()+work.getTwo300());
//  EVALUATE TRUE
                  if  ( work.isDe48Se33Sf0188500()  ) { 
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (33) + 400-SE33-POS : 500-DE48-SE33-SF-LEN ) TO SF31-ISO-DE48-SE33-SF1
                      sf31IsoExtractRec.replace(de48DataGroup500/*parent*/,0+seprTableGroup.getSeprTableRedefined().getSeprEntry(32).getSeprOffset() + work.getSe33Pos400() - 1/*fromOffset - (sf31IsoDe48Se33Sf1) */,work.getDe48Se33SfLen500()/*fromLen*/,838/*toOffset - (de48Data500) */,1/*toLen*/);
                  }
                  else if  ( work.isDe48Se33Sf0288500()  ) { 
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (33) + 400-SE33-POS : 500-DE48-SE33-SF-LEN ) TO SF31-ISO-DE48-SE33-SF2
                      sf31IsoExtractRec.replace(de48DataGroup500/*parent*/,0+seprTableGroup.getSeprTableRedefined().getSeprEntry(32).getSeprOffset() + work.getSe33Pos400() - 1/*fromOffset - (sf31IsoDe48Se33Sf2) */,work.getDe48Se33SfLen500()/*fromLen*/,839/*toOffset - (de48Data500) */,19/*toLen*/);
                  }
                  else if  ( work.isDe48Se33Sf0588500()  ) { 
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (33) + 400-SE33-POS : 500-DE48-SE33-SF-LEN ) TO SF31-ISO-DE48-SE33-SF5
                      sf31IsoExtractRec.replace(de48DataGroup500/*parent*/,0+seprTableGroup.getSeprTableRedefined().getSeprEntry(32).getSeprOffset() + work.getSe33Pos400() - 1/*fromOffset - (sf31IsoDe48Se33Sf5) */,work.getDe48Se33SfLen500()/*fromLen*/,858/*toOffset - (de48Data500) */,2/*toLen*/);
                  }
                  else if  ( work.isDe48Se33Sf0688500()  ) { 
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (33) + 400-SE33-POS : 500-DE48-SE33-SF-LEN ) TO SF31-ISO-DE48-SE33-SF6
                      sf31IsoExtractRec.replace(de48DataGroup500/*parent*/,0+seprTableGroup.getSeprTableRedefined().getSeprEntry(32).getSeprOffset() + work.getSe33Pos400() - 1/*fromOffset - (sf31IsoDe48Se33Sf6) */,work.getDe48Se33SfLen500()/*fromLen*/,860/*toOffset - (de48Data500) */,11/*toLen*/);
                  }
                  else   { 
                      ;
                  }
//  ADD 500-DE48-SE33-SF-LEN TO 400-SE33-POS
                  work.setSe33Pos400(work.getSe33Pos400()+work.getDe48Se33SfLen500());
              }
          }
//  IF SEPR-LENGTH (52) > ZERO
          if (	( seprTableGroup.getSeprTableRedefined().getSeprEntry(51).getSeprLength() > 0 )) { 
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (52) : 2) TO SF31-ISO-DE48-SE52-TIC
              sf31IsoExtractRec.replace(de48DataGroup500/*parent*/,0+seprTableGroup.getSeprTableRedefined().getSeprEntry(51).getSeprOffset() - 1/*fromOffset - (sf31IsoDe48Se52Tic) */,2/*fromLen*/,871/*toOffset - (de48Data500) */,2/*toLen*/);
          }
//  ELSE
          else { 
//  MOVE SPACE TO SF31-ISO-DE48-SE52-TIC
              sf31IsoExtractRec.setSf31IsoDe48Se52Tic(CONSTANTS.SPACE_2);
          }
//  INITIALIZE SF31-ISO-DE48-SE24-SF1 SF31-ISO-DE48-SE24-SF2 SF31-ISO-DE48-SE24-SF3 SF31-ISO-DE48-SE24-SF4 SF31-ISO-DE48-SE43-AAV SF31-ISO-DE48-SE66-SF1 SF31-ISO-DE48-SE66-SF2
          sf31IsoExtractRec.setSf31IsoDe48Se24Sf1(CONSTANTS.SPACE_5 /* Fill 5 Spaces*/);
          sf31IsoExtractRec.setSf31IsoDe48Se24Sf2(CONSTANTS.SPACE_3 /* Fill 3 Spaces*/);
          sf31IsoExtractRec.setSf31IsoDe48Se24Sf3(CONSTANTS.SPACE_3 /* Fill 3 Spaces*/);
          sf31IsoExtractRec.setSf31IsoDe48Se24Sf4(CONSTANTS.SPACE_3 /* Fill 3 Spaces*/);
          sf31IsoExtractRec.setSf31IsoDe48Se43Aav(CONSTANTS.SPACE_32 /* Fill 32 Spaces*/);
          sf31IsoExtractRec.setSf31IsoDe48Se66Sf1(CONSTANTS.SPACE /* Fill 1 Spaces*/);
          sf31IsoExtractRec.setSf31IsoDe48Se66Sf2(CONSTANTS.SPACE_36 /* Fill 36 Spaces*/);
//  IF SEPR-LENGTH (24) GREATER ZERO
          if (	( seprTableGroup.getSeprTableRedefined().getSeprEntry(23).getSeprLength() > 0 )) { 
//  INITIALIZE 400-SE24-POS
              work.setSe24Pos400((short)0);
//  PERFORM UNTIL 400-SE24-POS GREATER THAN SEPR-LENGTH (24)
              while ((	( work.getSe24Pos400() <= seprTableGroup.getSeprTableRedefined().getSeprEntry(23).getSeprLength() ) )) {
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (24) + 400-SE24-POS : 2) TO 500-DE48-SE24-SF-ID
                  work.setDe48Se24SfId500(substring(de48DataGroup500.getDe48Data500(),(seprTableGroup.getSeprTableRedefined().getSeprEntry(23).getSeprOffset() + work.getSe24Pos400()-1), (seprTableGroup.getSeprTableRedefined().getSeprEntry(23).getSeprOffset() + work.getSe24Pos400() + 1) ));
//  ADD 300-TWO TO 400-SE24-POS
                  work.setSe24Pos400( (short) (work.getSe24Pos400()+(short) work.getTwo300()));
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (24) + 400-SE24-POS : 2) TO 500-DE48-SE24-SF-LEN
                  de48Se24SfLenGroup500.replace(de48DataGroup500/*parent*/,0+seprTableGroup.getSeprTableRedefined().getSeprEntry(23).getSeprOffset() + work.getSe24Pos400() - 1/*fromOffset - (de48Se24SfLen500) */,2/*fromLen*/,0/*toOffset - (de48Data500) */,2/*toLen*/);
//  ADD 300-TWO TO 400-SE24-POS
                  work.setSe24Pos400( (short) (work.getSe24Pos400()+(short) work.getTwo300()));
//  EVALUATE TRUE
                  if  ( work.isDe48Se24Sf0188500()  ) { 
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (24) + 400-SE24-POS : 500-DE48-SE24-SF-LEN-9 ) TO SF31-ISO-DE48-SE24-SF1
                      sf31IsoExtractRec.replace(de48DataGroup500/*parent*/,0+seprTableGroup.getSeprTableRedefined().getSeprEntry(23).getSeprOffset() + work.getSe24Pos400() - 1/*fromOffset - (sf31IsoDe48Se24Sf1) */,de48Se24SfLenGroup500.getDe48Se24SfLen9500()/*fromLen*/,721/*toOffset - (de48Data500) */,5/*toLen*/);
                  }
                  else if  ( work.isDe48Se24Sf0288500()  ) { 
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (24) + 400-SE24-POS : 500-DE48-SE24-SF-LEN-9 ) TO SF31-ISO-DE48-SE24-SF2
                      sf31IsoExtractRec.replace(de48DataGroup500/*parent*/,0+seprTableGroup.getSeprTableRedefined().getSeprEntry(23).getSeprOffset() + work.getSe24Pos400() - 1/*fromOffset - (sf31IsoDe48Se24Sf2) */,de48Se24SfLenGroup500.getDe48Se24SfLen9500()/*fromLen*/,726/*toOffset - (de48Data500) */,3/*toLen*/);
                  }
                  else if  ( work.isDe48Se24Sf0388500()  ) { 
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (24) + 400-SE24-POS : 500-DE48-SE24-SF-LEN-9 ) TO SF31-ISO-DE48-SE24-SF3
                      sf31IsoExtractRec.replace(de48DataGroup500/*parent*/,0+seprTableGroup.getSeprTableRedefined().getSeprEntry(23).getSeprOffset() + work.getSe24Pos400() - 1/*fromOffset - (sf31IsoDe48Se24Sf3) */,de48Se24SfLenGroup500.getDe48Se24SfLen9500()/*fromLen*/,729/*toOffset - (de48Data500) */,3/*toLen*/);
                  }
                  else if  ( work.isDe48Se24Sf0488500()  ) { 
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (24) + 400-SE24-POS : 500-DE48-SE24-SF-LEN-9 ) TO SF31-ISO-DE48-SE24-SF4
                      sf31IsoExtractRec.replace(de48DataGroup500/*parent*/,0+seprTableGroup.getSeprTableRedefined().getSeprEntry(23).getSeprOffset() + work.getSe24Pos400() - 1/*fromOffset - (sf31IsoDe48Se24Sf4) */,de48Se24SfLenGroup500.getDe48Se24SfLen9500()/*fromLen*/,732/*toOffset - (de48Data500) */,3/*toLen*/);
                  }
                  else   { 
                      ;
                  }
//  ADD 500-DE48-SE24-SF-LEN-9 TO 400-SE24-POS
                  work.setSe24Pos400( (short) (work.getSe24Pos400()+(short) de48Se24SfLenGroup500.getDe48Se24SfLen9500()));
              }
          }
//  ELSE
          else { 
//  MOVE SPACES TO SF31-ISO-DE48-SE24-SF1
              sf31IsoExtractRec.setSf31IsoDe48Se24Sf1(CONSTANTS.SPACE_5);
//  MOVE SPACES TO SF31-ISO-DE48-SE24-SF2
              sf31IsoExtractRec.setSf31IsoDe48Se24Sf2(CONSTANTS.SPACE_3);
//  MOVE SPACES TO SF31-ISO-DE48-SE24-SF3
              sf31IsoExtractRec.setSf31IsoDe48Se24Sf3(CONSTANTS.SPACE_3);
//  MOVE SPACES TO SF31-ISO-DE48-SE24-SF4
              sf31IsoExtractRec.setSf31IsoDe48Se24Sf4(CONSTANTS.SPACE_3);
          }
//  IF SEPR-LENGTH (43) GREATER ZERO
          if (	( seprTableGroup.getSeprTableRedefined().getSeprEntry(42).getSeprLength() > 0 )) { 
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (43) : SEPR-LENGTH (43)) TO SF31-ISO-DE48-SE43-AAV
              sf31IsoExtractRec.replace(de48DataGroup500/*parent*/,0+seprTableGroup.getSeprTableRedefined().getSeprEntry(42).getSeprOffset() - 1/*fromOffset - (sf31IsoDe48Se43Aav) */,seprTableGroup.getSeprTableRedefined().getSeprEntry(42).getSeprLength()/*fromLen*/,735/*toOffset - (de48Data500) */,32/*toLen*/);
          }
//  ELSE
          else { 
//  MOVE SPACE TO SF31-ISO-DE48-SE43-AAV
              sf31IsoExtractRec.setSf31IsoDe48Se43Aav(CONSTANTS.SPACE_32);
          }
//  IF SEPR-LENGTH (66) GREATER ZERO
          if (	( seprTableGroup.getSeprTableRedefined().getSeprEntry(65).getSeprLength() > 0 )) { 
//  INITIALIZE 400-SE66-POS
              work.setSe66Pos400((short)0);
//  PERFORM UNTIL 400-SE66-POS GREATER THAN SEPR-LENGTH (66)
              while ((	( work.getSe66Pos400() <= seprTableGroup.getSeprTableRedefined().getSeprEntry(65).getSeprLength() ) )) {
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (66) + 400-SE66-POS : 2) TO 500-DE48-SE66-SF-ID
                  work.setDe48Se66SfId500(substring(de48DataGroup500.getDe48Data500(),(seprTableGroup.getSeprTableRedefined().getSeprEntry(65).getSeprOffset() + work.getSe66Pos400()-1), (seprTableGroup.getSeprTableRedefined().getSeprEntry(65).getSeprOffset() + work.getSe66Pos400() + 1) ));
//  ADD 300-TWO TO 400-SE66-POS
                  work.setSe66Pos400( (short) (work.getSe66Pos400()+(short) work.getTwo300()));
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (66) + 400-SE66-POS : 2) TO 500-DE48-SE66-SF-LEN
                  de48Se66SfLenGroup500.replace(de48DataGroup500/*parent*/,0+seprTableGroup.getSeprTableRedefined().getSeprEntry(65).getSeprOffset() + work.getSe66Pos400() - 1/*fromOffset - (de48Se66SfLen500) */,2/*fromLen*/,0/*toOffset - (de48Data500) */,2/*toLen*/);
//  ADD 300-TWO TO 400-SE66-POS
                  work.setSe66Pos400( (short) (work.getSe66Pos400()+(short) work.getTwo300()));
//  EVALUATE TRUE
                  if  ( work.isDe48Se66Sf0188500()  ) { 
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (66) + 400-SE66-POS : 500-DE48-SE66-SF-LEN-9 ) TO SF31-ISO-DE48-SE66-SF1
                      sf31IsoExtractRec.replace(de48DataGroup500/*parent*/,0+seprTableGroup.getSeprTableRedefined().getSeprEntry(65).getSeprOffset() + work.getSe66Pos400() - 1/*fromOffset - (sf31IsoDe48Se66Sf1) */,de48Se66SfLenGroup500.getDe48Se66SfLen500Redefined().getDe48Se66SfLen9500()/*fromLen*/,767/*toOffset - (de48Data500) */,1/*toLen*/);
                  }
                  else if  ( work.isDe48Se66Sf0288500()  ) { 
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (66) + 400-SE66-POS : 500-DE48-SE66-SF-LEN-9 ) TO SF31-ISO-DE48-SE66-SF2
                      sf31IsoExtractRec.replace(de48DataGroup500/*parent*/,0+seprTableGroup.getSeprTableRedefined().getSeprEntry(65).getSeprOffset() + work.getSe66Pos400() - 1/*fromOffset - (sf31IsoDe48Se66Sf2) */,de48Se66SfLenGroup500.getDe48Se66SfLen500Redefined().getDe48Se66SfLen9500()/*fromLen*/,768/*toOffset - (de48Data500) */,36/*toLen*/);
                  }
                  else   { 
                      ;
                  }
                  de48Se66SfLen9500 = de48Se66SfLenGroup500.getDe48Se66SfLen500Redefined().getDe48Se66SfLen9500();
//  IF 500-DE48-SE66-SF-LEN-9 GREATER ZERO
                  if (	( de48Se66SfLen9500 > 0 )) { 
//  ADD 500-DE48-SE66-SF-LEN-9 TO 400-SE66-POS
                      work.setSe66Pos400( (short) (work.getSe66Pos400()+(short) de48Se66SfLenGroup500.getDe48Se66SfLen500Redefined().getDe48Se66SfLen9500()));
                  }
  
//  ELSE
                  else { 
//  DISPLAY 'DE48-SE66-SF-LEN-9 IS SPACE:' SF31-ISO-BKNT-REF-NO SPACE SF31-ISO-CARDHOLDER-NBR (1 : 11)
                      logger.info("DE48-SE66-SF-LEN-9 IS SPACE:{}{}", new String(sf31IsoExtractRec.getSf31IsoBkntData().getSf31IsoBkntTraceData().getSf31IsoBkntRefNo()), new String(substring(sf31IsoExtractRec.getSf31IsoCardholderNbr(),0,11))); 
                  }
              }
          }
//  ELSE
          else { 
//  MOVE SPACES TO SF31-ISO-DE48-SE66-SF1
              sf31IsoExtractRec.setSf31IsoDe48Se66Sf1(CONSTANTS.SPACE);
//  MOVE SPACES TO SF31-ISO-DE48-SE66-SF2
              sf31IsoExtractRec.setSf31IsoDe48Se66Sf2(CONSTANTS.SPACE_36);
          }
//  IF SEPR-LENGTH (82) > ZERO
          if (	( seprTableGroup.getSeprTableRedefined().getSeprEntry(81).getSeprLength() > 0 )) { 
              de48Data500 = de48DataGroup500.getDe48Data500();
              lit52300 = work.getLit52300();
              lit51300 = work.getLit51300();
//  IF 500-DE48-DATA ( SEPR-OFFSET (82) : 2) = 300-LIT-51 OR 300-LIT-52
              if (Field.compareChar(de48Data500 , lit51300 , ( (seprTableGroup.getSeprTableRedefined().getSeprEntry(81).getSeprOffset() - 1) /*start*/ ), 2 /*left len*/ , 2 /*right len*/) || Field.compareChar(de48Data500 , lit52300 , ( (seprTableGroup.getSeprTableRedefined().getSeprEntry(81).getSeprOffset() - 1) /*start*/ ), 2 /*left len*/ , 2 /*right len*/)) { 
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (82) : 2) TO SF31-ISO-AVS-REQUEST-CODE
                  sf31IsoExtractRec.replace(de48DataGroup500/*parent*/,0+seprTableGroup.getSeprTableRedefined().getSeprEntry(81).getSeprOffset() - 1/*fromOffset - (sf31IsoAvsRequestCode) */,2/*fromLen*/,201/*toOffset - (de48Data500) */,2/*toLen*/);
//  MOVE 300-LIT-82 TO SF31-ISO-AVS-REQUEST-TAG
                  sf31IsoExtractRec.setSf31IsoAvsRequestTag(work.getLit82300());
//  MOVE 300-LIT-02 TO SF31-ISO-AVS-REQUEST-LGTH
                  sf31IsoExtractRec.setSf31IsoAvsRequestLgth(work.getLit02300());
              }
  
          }
//  IF SEPR-LENGTH (83) > ZERO
          if (	( seprTableGroup.getSeprTableRedefined().getSeprEntry(82).getSeprLength() > 0 )) { 
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (83) : 1) TO SF31-ISO-AVS-RESPONSE-CODE
              sf31IsoExtractRec.replace(de48DataGroup500/*parent*/,0+seprTableGroup.getSeprTableRedefined().getSeprEntry(82).getSeprOffset() - 1/*fromOffset - (sf31IsoAvsResponseCode) */,1/*fromLen*/,207/*toOffset - (de48Data500) */,1/*toLen*/);
//  MOVE 300-LIT-83 TO SF31-ISO-AVS-RESPONSE-TAG
              sf31IsoExtractRec.setSf31IsoAvsResponseTag(work.getLit83300());
//  MOVE 300-LIT-01 TO SF31-ISO-AVS-RESPONSE-LGTH
              sf31IsoExtractRec.setSf31IsoAvsResponseLgth(work.getLit01300());
          }
//  IF SEPR-LENGTH (84) > ZERO
          if (	( seprTableGroup.getSeprTableRedefined().getSeprEntry(83).getSeprLength() > 0 )) { 
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (84) : 2) TO SF31-ISO-DE48-TAG84
              sf31IsoExtractRec.replace(de48DataGroup500/*parent*/,0+seprTableGroup.getSeprTableRedefined().getSeprEntry(83).getSeprOffset() - 1/*fromOffset - (sf31IsoDe48Tag84) */,2/*fromLen*/,620/*toOffset - (de48Data500) */,2/*toLen*/);
  
          }
//  IF SEPR-LENGTH (85) > ZERO
          if (	( seprTableGroup.getSeprTableRedefined().getSeprEntry(84).getSeprLength() > 0 )) { 
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (85) : 1) TO SF31-ISO-AVS2-FRAUD-ALERT
              sf31IsoExtractRec.replace(de48DataGroup500/*parent*/,0+seprTableGroup.getSeprTableRedefined().getSeprEntry(84).getSeprOffset() - 1/*fromOffset - (sf31IsoAvs2FraudAlert) */,1/*fromLen*/,511/*toOffset - (de48Data500) */,1/*toLen*/);
  
          }
//  IF SEPR-LENGTH (86) > ZERO
          if (	( seprTableGroup.getSeprTableRedefined().getSeprEntry(85).getSeprLength() > 0 )) { 
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (86) : 1) TO SF31-ISO-AVS2-RUSH-ORDER
              sf31IsoExtractRec.replace(de48DataGroup500/*parent*/,0+seprTableGroup.getSeprTableRedefined().getSeprEntry(85).getSeprOffset() - 1/*fromOffset - (sf31IsoAvs2RushOrder) */,1/*fromLen*/,512/*toOffset - (de48Data500) */,1/*toLen*/);
  
          }
//  IF SEPR-LENGTH (87) > ZERO
          if (	( seprTableGroup.getSeprTableRedefined().getSeprEntry(86).getSeprLength() > 0 )) { 
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (87) : 1) TO SF31-ISO-DE48-TAG87-PRESENT
              sf31IsoExtractRec.replace(de48DataGroup500/*parent*/,0+seprTableGroup.getSeprTableRedefined().getSeprEntry(86).getSeprOffset() - 1/*fromOffset - (sf31IsoDe48Tag87Present) */,1/*fromLen*/,346/*toOffset - (de48Data500) */,1/*toLen*/);
          }
//  ELSE
          else { 
//  MOVE SPACE TO SF31-ISO-DE48-TAG87-PRESENT
              sf31IsoExtractRec.setSf31IsoDe48Tag87Present(CONSTANTS.SPACE);
          }
//  IF SEPR-LENGTH (88) > ZERO
          if (	( seprTableGroup.getSeprTableRedefined().getSeprEntry(87).getSeprLength() > 0 )) { 
              de48Data500 = de48DataGroup500.getDe48Data500();
              litY300 = work.getLitY300();
//  IF 500-DE48-DATA ( SEPR-OFFSET (88) : 1) = 300-LIT-Y
              if (Field.compareChar(de48Data500 , litY300 , ( (seprTableGroup.getSeprTableRedefined().getSeprEntry(87).getSeprOffset() - 1) /*start*/ ), 1 /*left len*/ , 1 /*right len*/)) { 
//  MOVE 300-LIT-Y TO SF31-ISO-DE48-TAG88-PRESENT
                  sf31IsoExtractRec.setSf31IsoDe48Tag88Present(work.getLitY300());
              }
  
          }
//  IF SEPR-LENGTH (89) > ZERO
          if (	( seprTableGroup.getSeprTableRedefined().getSeprEntry(88).getSeprLength() > 0 )) { 
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (89) : 1) TO 500-DE48-SE89
              work.setDe48Se89500(substring(de48DataGroup500.getDe48Data500(),(seprTableGroup.getSeprTableRedefined().getSeprEntry(88).getSeprOffset()-1), (seprTableGroup.getSeprTableRedefined().getSeprEntry(88).getSeprOffset() + 0) ));
//  IF 88-500-MAG-LGTH
              if ( work.isMagLgth88500()  ) { 
//  MOVE 500-DE48-SE89 TO SF31-ISO-DE48-TAG89-VALUE SF31-ISO-IC-MAG-CC
                  sf31IsoExtractRec.setSf31IsoDe48Tag89Value(work.getDe48Se89500());
                  sf31IsoExtractRec.setSf31IsoIcMagCc(work.getDe48Se89500());
              }
          }
//  IF SEPR-LENGTH (93) > ZERO
          if (	( seprTableGroup.getSeprTableRedefined().getSeprEntry(92).getSeprLength() > 0 )) { 
              lit85300 = work.getLit85300();
              authResponse860 = logDecompressedData860.getAuthResponse860();
//  IF 860-AUTH-RESPONSE = 300-LIT-85
              if (		compareChars(authResponse860,lit85300) == 0 ) { 
//  MOVE 500-DE48-DATA ( SEPR-OFFSET (93) : 2) TO SF31-ISO-AVS2-RESP-CODE
                  sf31IsoExtractRec.replace(de48DataGroup500/*parent*/,0+seprTableGroup.getSeprTableRedefined().getSeprEntry(92).getSeprOffset() - 1/*fromOffset - (sf31IsoAvs2RespCode) */,2/*fromLen*/,499/*toOffset - (de48Data500) */,2/*toLen*/);
  
              }
  
          }
      
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
      private void processDe120() throws Exception {
			// Declare local variables used in the method
			Sf31IsoAddlAvsii sf31IsoAddlAvsii = sf31IsoExtractRec.getSf31IsoAddlAvsii();
			// End of variable declaration

      
// *****************************************************************
// *        8 0 3 0 - P r o c e s s - d e 1 2 0                    *
// *****************************************************************
//  SET 88-SEPR-NO-DE48 TO TRUE
          seprControlBlock.setSeprNoDe4888True(); 
          
//  SET SEPR-DATA-PTR TO ADDRESS OF 500-DE120-DATA
          seprControlBlock.setSeprDataPtr(setObject(de120DataGroup500)); 
          
//  CALL SEPR-PTR-SI994020
          // CALL SEPR-PTR-SI994020
          	this.setRc( si994020.process());
//  IF 88-SEPR-RC-0000
          if ( seprControlBlock.isSeprRc000088()  ) { 
//  IF SEPR-LENGTH (2) > 0
              if (	( seprTableGroup.getSeprTableRedefined().getSeprEntry(1).getSeprLength() > 0 )) { 
//  MOVE 500-DE120-DATA ( SEPR-OFFSET (2) : SEPR-LENGTH (2)) TO SF31-ISO-AVS2-SHIP2-NAME
                  sf31IsoExtractRec.replace(de120DataGroup500/*parent*/,0+seprTableGroup.getSeprTableRedefined().getSeprEntry(1).getSeprOffset() - 1/*fromOffset - (sf31IsoAvs2Ship2Name) */,seprTableGroup.getSeprTableRedefined().getSeprEntry(1).getSeprLength()/*fromLen*/,349/*toOffset - (de120Data500) */,27/*toLen*/);
  
              }
//  IF SEPR-LENGTH (3) > 0
              if (	( seprTableGroup.getSeprTableRedefined().getSeprEntry(2).getSeprLength() > 0 )) { 
//  MOVE 500-DE120-DATA ( SEPR-OFFSET (3) : SEPR-LENGTH (3)) TO SF31-ISO-AVS2-SHIP2-CO-NAME
                  sf31IsoExtractRec.replace(de120DataGroup500/*parent*/,0+seprTableGroup.getSeprTableRedefined().getSeprEntry(2).getSeprOffset() - 1/*fromOffset - (sf31IsoAvs2Ship2CoName) */,seprTableGroup.getSeprTableRedefined().getSeprEntry(2).getSeprLength()/*fromLen*/,376/*toOffset - (de120Data500) */,27/*toLen*/);
  
              }
//  IF SEPR-LENGTH (4) > 0
              if (	( seprTableGroup.getSeprTableRedefined().getSeprEntry(3).getSeprLength() > 0 )) { 
//  MOVE 500-DE120-DATA ( SEPR-OFFSET (4) : SEPR-LENGTH (4)) TO SF31-ISO-AVS2-SHIP2-ADD-1
                  sf31IsoExtractRec.replace(de120DataGroup500/*parent*/,0+seprTableGroup.getSeprTableRedefined().getSeprEntry(3).getSeprOffset() - 1/*fromOffset - (sf31IsoAvs2Ship2Add1) */,seprTableGroup.getSeprTableRedefined().getSeprEntry(3).getSeprLength()/*fromLen*/,403/*toOffset - (de120Data500) */,32/*toLen*/);
  
              }
//  IF SEPR-LENGTH (5) > 0
              if (	( seprTableGroup.getSeprTableRedefined().getSeprEntry(4).getSeprLength() > 0 )) { 
//  MOVE 500-DE120-DATA ( SEPR-OFFSET (5) : SEPR-LENGTH (5)) TO SF31-ISO-AVS2-SHIP2-ADD-2
                  sf31IsoExtractRec.replace(de120DataGroup500/*parent*/,0+seprTableGroup.getSeprTableRedefined().getSeprEntry(4).getSeprOffset() - 1/*fromOffset - (sf31IsoAvs2Ship2Add2) */,seprTableGroup.getSeprTableRedefined().getSeprEntry(4).getSeprLength()/*fromLen*/,435/*toOffset - (de120Data500) */,32/*toLen*/);
  
              }
//  IF SEPR-LENGTH (6) > 0
              if (	( seprTableGroup.getSeprTableRedefined().getSeprEntry(5).getSeprLength() > 0 )) { 
//  MOVE 500-DE120-DATA ( SEPR-OFFSET (6) : SEPR-LENGTH (6)) TO SF31-ISO-AVS2-SHIP2-CITY
                  sf31IsoExtractRec.replace(de120DataGroup500/*parent*/,0+seprTableGroup.getSeprTableRedefined().getSeprEntry(5).getSeprOffset() - 1/*fromOffset - (sf31IsoAvs2Ship2City) */,seprTableGroup.getSeprTableRedefined().getSeprEntry(5).getSeprLength()/*fromLen*/,467/*toOffset - (de120Data500) */,15/*toLen*/);
  
              }
//  IF SEPR-LENGTH (7) > 0
              if (	( seprTableGroup.getSeprTableRedefined().getSeprEntry(6).getSeprLength() > 0 )) { 
//  MOVE 500-DE120-DATA ( SEPR-OFFSET (7) : SEPR-LENGTH (7)) TO SF31-ISO-AVS2-SHIP2-STATE
                  sf31IsoExtractRec.replace(de120DataGroup500/*parent*/,0+seprTableGroup.getSeprTableRedefined().getSeprEntry(6).getSeprOffset() - 1/*fromOffset - (sf31IsoAvs2Ship2State) */,seprTableGroup.getSeprTableRedefined().getSeprEntry(6).getSeprLength()/*fromLen*/,482/*toOffset - (de120Data500) */,2/*toLen*/);
  
              }
//  IF SEPR-LENGTH (8) > 0
              if (	( seprTableGroup.getSeprTableRedefined().getSeprEntry(7).getSeprLength() > 0 )) { 
//  MOVE 500-DE120-DATA ( SEPR-OFFSET (8) : SEPR-LENGTH (8)) TO SF31-ISO-AVS2-SHIP2-POSTAL
                  sf31IsoExtractRec.replace(de120DataGroup500/*parent*/,0+seprTableGroup.getSeprTableRedefined().getSeprEntry(7).getSeprOffset() - 1/*fromOffset - (sf31IsoAvs2Ship2Postal) */,seprTableGroup.getSeprTableRedefined().getSeprEntry(7).getSeprLength()/*fromLen*/,484/*toOffset - (de120Data500) */,9/*toLen*/);
  
              }
//  IF SEPR-LENGTH (9) > 0
              if (	( seprTableGroup.getSeprTableRedefined().getSeprEntry(8).getSeprLength() > 0 )) { 
//  MOVE 500-DE120-DATA ( SEPR-OFFSET (9) : SEPR-LENGTH (9)) TO SF31-ISO-AVS2-SHIP2-COUNTRY
                  sf31IsoExtractRec.replace(de120DataGroup500/*parent*/,0+seprTableGroup.getSeprTableRedefined().getSeprEntry(8).getSeprOffset() - 1/*fromOffset - (sf31IsoAvs2Ship2Country) */,seprTableGroup.getSeprTableRedefined().getSeprEntry(8).getSeprLength()/*fromLen*/,493/*toOffset - (de120Data500) */,3/*toLen*/);
  
              }
//  IF SEPR-LENGTH (10) > 0
              if (	( seprTableGroup.getSeprTableRedefined().getSeprEntry(9).getSeprLength() > 0 )) { 
//  MOVE 500-DE120-DATA ( SEPR-OFFSET (10) : SEPR-LENGTH (10)) TO SF31-ISO-AVS2-PHONE-NUM
                  sf31IsoExtractRec.replace(de120DataGroup500/*parent*/,0+seprTableGroup.getSeprTableRedefined().getSeprEntry(9).getSeprOffset() - 1/*fromOffset - (sf31IsoAvs2PhoneNum) */,seprTableGroup.getSeprTableRedefined().getSeprEntry(9).getSeprLength()/*fromLen*/,501/*toOffset - (de120Data500) */,10/*toLen*/);
  
              }
          }
      
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
      private void eojRoutine() throws Exception {
      
// ****************************************************************
// *   This paragraph closes all the files                        *
// ****************************************************************
//  DISPLAY SPACES
          logger.info(" "); 
//  MOVE 'SYS001 INPUT BDLOG LOG RECORDS' TO 650-TOTAL-DESCRIPTION
          totalMessage650.setTotalDescription650(CONSTANTS.LITERAL_2099255690);
//  MOVE 400-TOTAL-RECS TO 650-TOTAL
//  FORMAT_397784695 = "ZZ,ZZZ,ZZZ,ZZ9"
          totalMessage650.setTotal650(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_397784695,String.valueOf(work.getTotalRecs400()).toCharArray()));
//  DISPLAY 650-TOTAL-MESSAGE
          logger.info(totalMessage650.toString()); 

// *
//  DISPLAY SPACES
          logger.info(" "); 
//  MOVE 'SYS201 OUTPUT VER2 RECORDS' TO 650-TOTAL-DESCRIPTION
          totalMessage650.setTotalDescription650(CONSTANTS.LITERAL_31980010);
//  MOVE 400-TOTAL-VER2 TO 650-TOTAL
//  FORMAT_397784695 = "ZZ,ZZZ,ZZZ,ZZ9"
          totalMessage650.setTotal650(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_397784695,String.valueOf(work.getTotalVer2400()).toCharArray()));
//  DISPLAY 650-TOTAL-MESSAGE
          logger.info(totalMessage650.toString()); 

// *
//  CLOSE CENTRAL-SITE-BDLOGS ISS-ACQ-VER2-FILE-OUT LOG-STATISTICS-REPORT
          centralSiteBdlogs.close(); 
          issAcqVer2FileOut.close(); 
          logStatisticsReport.close(); 

// *
//  DISPLAY SPACES
          logger.info(" "); 
//  DISPLAY 650-EOJ-MESSAGE
          logger.info(new String(work.getEojMessage650())); 
      
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
            a01PassedParm.set((Field)params[0]);
         // invoke the process and return rc
         return process();
         
      }
      
      public int call(Field... parameters) throws Exception {
         for (int index = 0; index < parameters.length;index++) {
             switch(index) {
              case 0:
                      if(parameters[index] != null ) {
              		if (parameters[index] instanceof A01PassedParm) {
                       	this.a01PassedParm = ((A01PassedParm) parameters[index]);
                  	} else {
                       	this.a01PassedParm.set(parameters[index]);
                  	}
                  }
                
                  break;
            }
         }
          return process();
      }
      
      
      public void setFromMcwin(Object[] params) {
      int len = params.length;
         if (len > 0)
         if(params[0] instanceof Field) 
   mciwinYearToWindow.setString(((Field)params[0] ).toCharArray());
 else    mciwinYearToWindow.setString((char[])params[0] );
         if (len > 1)
         if(params[1] instanceof Field) 
   mciwinReturnedYear.setString(((Field)params[1] ).toCharArray());
 else    mciwinReturnedYear.setString((char[])params[1] );
         if (len > 2)
         if(params[2] instanceof Field) 
   mciwinNewWindowYearGroup.setString(((Field)params[2] ).toCharArray());
 else    mciwinNewWindowYearGroup.setString((char[])params[2] );
      }
      public void setFromMcabend(Object[] params) {
      int len = params.length;
         if (len > 0)
         if(params[0] instanceof Field) 
   mciabendParms.getMciabendParm1().setString(((Field)params[0] ).toCharArray());
 else    mciabendParms.getMciabendParm1().setString((char[])params[0] );
      }
      public void setFromSf910020(Object[] params) {
      int len = params.length;
         if (len > 0)
         if(params[0] instanceof Field) 
   asmSf910020Parms880.setString(((Field)params[0] ).toCharArray());
 else    asmSf910020Parms880.setString((char[])params[0] );
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
