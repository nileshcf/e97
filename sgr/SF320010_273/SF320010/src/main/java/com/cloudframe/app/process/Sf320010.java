  package com.cloudframe.app.process;
   /* The comment section is too large, 
	 * hence added at the end of the java code 
	 * please scroll all the way to the bottom to see complete comments 
	 */
  
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.sf320010.file.*;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.sf320010.file.records.SdSortKeyKeys;
  import java.util.List;
  import java.util.ArrayList;
  import java.util.Comparator;
  import java.util.stream.Collectors;
  import com.cloudframe.app.sf320010.file.records.SdSortKey2;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.sf320010.file.records.SdSortKey;
  import com.cloudframe.app.process.Mcwin;
  import com.cloudframe.app.sf320010.dto.MciabendParm1;
  import com.cloudframe.app.process.Mcabend;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.sf320010.dto.Sf503SortFields;
  import com.cloudframe.app.sf320010.dto.Sf503RemoteConsoleLog;
  import com.cloudframe.app.sf320010.dto.Sf503Bd32BulkId;
  import com.cloudframe.app.sf320010.dto.Sf503BdBulkDataTranLog;
  import com.cloudframe.app.sf320010.dto.Sf503OpOperatorTranLog;
  import com.cloudframe.app.sf320010.dto.Sf503MpMipProfileLog;
  import com.cloudframe.app.sf320010.dto.Sf503MpMipId;
  import com.cloudframe.app.sf320010.dto.Sf503PsPosTranLog;
  import java.math.BigDecimal;
  import com.cloudframe.app.sf320010.dto.Sf503PsTransAmountX;
  import com.cloudframe.app.sf320010.dto.RpPsTransAmountX;
  import com.cloudframe.app.sf320010.dto.Sf503PsTimeInSystem;
  import com.cloudframe.app.sf320010.dto.Sf503TypeIiTranLog;
  import com.cloudframe.app.sf320010.dto.Sf503X92ActivityLog;
  import com.cloudframe.app.sf320010.dto.Sf503RcTime;
  import com.cloudframe.app.sf320010.dto.RecTime800;
  import com.cloudframe.app.sf320010.dto.Sf503RcDate;
  import com.cloudframe.app.sf320010.dto.RecDate800;
  import com.cloudframe.app.sf320010.dto.MsgPos216X;
  import com.cloudframe.app.sf320010.dto.MsgPos1722;
  import java.util.Calendar;
  import java.util.TimeZone;
  import java.util.Date;
  import org.springframework.beans.factory.annotation.Value;
  import com.cloudframe.app.sf320010.dto.*;
  import com.cloudframe.app.sf320010.dto.GeneralSortArea;
  import com.cloudframe.app.sf320010.dto.InfoSecRcd800;
  import com.cloudframe.app.sf320010.dto.RpReportPrintLine;
  import com.cloudframe.app.sf320010.dto.Sf50301;
  import com.cloudframe.app.sf320010.dto.RpCoHeading2;
  import com.cloudframe.app.sf320010.dto.RpMpDetail5;
  import com.cloudframe.app.sf320010.dto.WaDate;
  import com.cloudframe.app.sf320010.dto.MciwinReturnedYear;
  import com.cloudframe.app.sf320010.file.records.Sys203EmailFileOutRcd;
  import com.cloudframe.app.sf320010.dto.RpPsDetail;
  import com.cloudframe.app.sf320010.dto.RpMpHeading2;
  import com.cloudframe.app.sf320010.dto.RpC7Heading4;
  import com.cloudframe.app.sf320010.dto.MciabendParms;
  import com.cloudframe.app.sf320010.dto.RpCoEoj15;
  import com.cloudframe.app.sf320010.dto.RpPsHeading2;
  import com.cloudframe.app.sf320010.dto.RpCoEoj4;
  import com.cloudframe.app.sf320010.dto.WaDateYmd;
  import com.cloudframe.app.sf320010.dto.RpCoEoj7;
  import com.cloudframe.app.sf320010.dto.RpMpDetail6;
  import com.cloudframe.app.sf320010.dto.RpMpDetail1;
  import com.cloudframe.app.sf320010.dto.RpC8Detail1;
  import com.cloudframe.app.sf320010.dto.WaTimeHmsh;
  import com.cloudframe.app.sf320010.dto.RpC8Heading6;
  import com.cloudframe.app.sf320010.file.records.SdSortWorkFileRcd;
  import com.cloudframe.app.sf320010.dto.RpC9Detail;
  import com.cloudframe.app.sf320010.dto.WaTime;
  import com.cloudframe.app.sf320010.dto.RpCoEoj6;
  import com.cloudframe.app.sf320010.dto.RpEmailHeading1200;
  import com.cloudframe.app.sf320010.dto.RpHeading1;
  import com.cloudframe.app.sf320010.dto.RpMpDetail2;
  import com.cloudframe.app.sf320010.file.records.FdGeneralLogFileInRcd;
  import com.cloudframe.app.sf320010.dto.RpEmailOpHeading2200;
  import com.cloudframe.app.sf320010.dto.RpC7Heading3;
  import com.cloudframe.app.sf320010.dto.RpCoEoj5;
  import com.cloudframe.app.sf320010.dto.RpCoEoj12;
  import com.cloudframe.app.sf320010.dto.RpC7Detail;
  import com.cloudframe.app.sf320010.dto.MciwinNewWindowYearGroup;
  import com.cloudframe.app.sf320010.dto.RpCoEoj13;
  import com.cloudframe.app.sf320010.dto.RpOpDetail;
  import com.cloudframe.app.sf320010.dto.RpOpHeading2;
  import com.cloudframe.app.sf320010.dto.RpCoEoj9;
  import com.cloudframe.app.sf320010.dto.GeneralWorkArea;
  import com.cloudframe.app.sf320010.dto.RpCoEoj14;
  import com.cloudframe.app.sf320010.file.records.FdInfoSecFileOutRcd;
  import com.cloudframe.app.sf320010.dto.MciwinYearToWindow;
  import com.cloudframe.app.sf320010.dto.RpBdDetail;
  import com.cloudframe.app.sf320010.dto.RpCoEoj8;
  import com.cloudframe.app.sf320010.dto.OperMsgArea;
  import com.cloudframe.app.sf320010.dto.WaDateMdy;
  import com.cloudframe.app.sf320010.dto.RpCoEoj10;
  import com.cloudframe.app.sf320010.file.records.FdTempWorkFileRcd;
  import com.cloudframe.app.sf320010.dto.RpC9Heading3;
  import com.cloudframe.app.sf320010.dto.RpBdHeading2;
  import com.cloudframe.app.sf320010.file.records.FdReportFileOutRcd;
  import com.cloudframe.app.sf320010.dto.RpMpDetail4;
  import com.cloudframe.app.sf320010.dto.RpC9Heading4;
  import com.cloudframe.app.sf320010.dto.RpC8Heading3;
  import com.cloudframe.app.sf320010.dto.RpCoEoj3;
  import com.cloudframe.app.sf320010.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import org.springframework.beans.factory.InitializingBean;
  import org.springframework.beans.factory.DisposableBean;
  import com.cloudframe.app.sort.SortProperties;
  import com.cloudframe.app.sort.strategy.SortPathStrategy;
  import com.cloudframe.app.sort.strategy.decider.SortStrategyDecider;
  import com.cloudframe.app.sort.model.SortKeyObject;
  import org.springframework.context.annotation.Lazy;
  
  @Component("sf320010")
  
  public class Sf320010 extends CommonProcess implements InitializingBean, DisposableBean {
  
  Logger logger = LoggerFactory.getLogger(Sf320010.class);
  
  private GeneralSortArea generalSortArea = new GeneralSortArea() ;
  private InfoSecRcd800 infoSecRcd800 = new InfoSecRcd800() ;
  private RpReportPrintLine rpReportPrintLine = new RpReportPrintLine() ;
  private Sf50301 sf50301 = new Sf50301() ;
  private RpCoHeading2 rpCoHeading2 = new RpCoHeading2() ;
  private RpMpDetail5 rpMpDetail5 = new RpMpDetail5() ;
  private WaDate waDate = new WaDate() ;
  private MciwinReturnedYear mciwinReturnedYear = new MciwinReturnedYear() ;
  private Sys203EmailFileOutRcd sys203EmailFileOutRcd = new Sys203EmailFileOutRcd() ;
  private RpPsDetail rpPsDetail = new RpPsDetail() ;
  private RpMpHeading2 rpMpHeading2 = new RpMpHeading2() ;
  private RpC7Heading4 rpC7Heading4 = new RpC7Heading4() ;
  private MciabendParms mciabendParms = new MciabendParms() ;
  private RpCoEoj15 rpCoEoj15 = new RpCoEoj15() ;
  private RpPsHeading2 rpPsHeading2 = new RpPsHeading2() ;
  private RpCoEoj4 rpCoEoj4 = new RpCoEoj4() ;
  private WaDateYmd waDateYmd = new WaDateYmd() ;
  private RpCoEoj7 rpCoEoj7 = new RpCoEoj7() ;
  private RpMpDetail6 rpMpDetail6 = new RpMpDetail6() ;
  private RpMpDetail1 rpMpDetail1 = new RpMpDetail1() ;
  private RpC8Detail1 rpC8Detail1 = new RpC8Detail1() ;
  private WaTimeHmsh waTimeHmsh = new WaTimeHmsh() ;
  private RpC8Heading6 rpC8Heading6 = new RpC8Heading6() ;
  private SdSortWorkFileRcd sdSortWorkFileRcd = new SdSortWorkFileRcd() ;
  private RpC9Detail rpC9Detail = new RpC9Detail() ;
  private WaTime waTime = new WaTime() ;
  private RpCoEoj6 rpCoEoj6 = new RpCoEoj6() ;
  private RpEmailHeading1200 rpEmailHeading1200 = new RpEmailHeading1200() ;
  private RpHeading1 rpHeading1 = new RpHeading1() ;
  private RpMpDetail2 rpMpDetail2 = new RpMpDetail2() ;
  private FdGeneralLogFileInRcd fdGeneralLogFileInRcd = new FdGeneralLogFileInRcd() ;
  private RpEmailOpHeading2200 rpEmailOpHeading2200 = new RpEmailOpHeading2200() ;
  private RpC7Heading3 rpC7Heading3 = new RpC7Heading3() ;
  private RpCoEoj5 rpCoEoj5 = new RpCoEoj5() ;
  private RpCoEoj12 rpCoEoj12 = new RpCoEoj12() ;
  private RpC7Detail rpC7Detail = new RpC7Detail() ;
  private MciwinNewWindowYearGroup mciwinNewWindowYearGroup = new MciwinNewWindowYearGroup() ;
  private RpCoEoj13 rpCoEoj13 = new RpCoEoj13() ;
  private RpOpDetail rpOpDetail = new RpOpDetail() ;
  private RpOpHeading2 rpOpHeading2 = new RpOpHeading2() ;
  private RpCoEoj9 rpCoEoj9 = new RpCoEoj9() ;
  private GeneralWorkArea generalWorkArea = new GeneralWorkArea() ;
  private RpCoEoj14 rpCoEoj14 = new RpCoEoj14() ;
  private FdInfoSecFileOutRcd fdInfoSecFileOutRcd = new FdInfoSecFileOutRcd() ;
  private MciwinYearToWindow mciwinYearToWindow = new MciwinYearToWindow() ;
  private RpBdDetail rpBdDetail = new RpBdDetail() ;
  private RpCoEoj8 rpCoEoj8 = new RpCoEoj8() ;
  private OperMsgArea operMsgArea = new OperMsgArea() ;
  private WaDateMdy waDateMdy = new WaDateMdy() ;
  private RpCoEoj10 rpCoEoj10 = new RpCoEoj10() ;
  private FdTempWorkFileRcd fdTempWorkFileRcd = new FdTempWorkFileRcd() ;
  private RpC9Heading3 rpC9Heading3 = new RpC9Heading3() ;
  private RpBdHeading2 rpBdHeading2 = new RpBdHeading2() ;
  private FdReportFileOutRcd fdReportFileOutRcd = new FdReportFileOutRcd() ;
  private RpMpDetail4 rpMpDetail4 = new RpMpDetail4() ;
  private RpC9Heading4 rpC9Heading4 = new RpC9Heading4() ;
  private RpC8Heading3 rpC8Heading3 = new RpC8Heading3() ;
  private RpCoEoj3 rpCoEoj3 = new RpCoEoj3() ;
  private Work work = new Work() ;
  
  @Value("${timeZoneId:Etc/GMT}")
  private String timeZoneId;
  
  
  @Autowired 
  @Qualifier("sf320010_generalLogFileIn")
  GeneralLogFileIn generalLogFileIn;
  @Autowired 
  @Qualifier("sf320010_tempWorkFile")
  TempWorkFile tempWorkFile;
  @Autowired 
  @Qualifier("sf320010_reportFileOut")
  ReportFileOut reportFileOut;
  @Autowired 
  @Qualifier("sf320010_infoSecFileOut")
  InfoSecFileOut infoSecFileOut;
  @Autowired 
  @Qualifier("sf320010_sys203EmailFileOut")
  Sys203EmailFileOut sys203EmailFileOut;
  @Autowired 
  @Qualifier("sf320010_sortWorkFileInternIn")
  SortWorkFileInternIn sortWorkFileInternIn;
  @Autowired 
  @Qualifier("sf320010_sortWorkFileInternOut")
  SortWorkFileInternOut sortWorkFileInternOut;
  @Autowired 
  @Qualifier("mcwin")
  Mcwin mcwin;
  @Autowired 
  @Qualifier("mcabend")
  Mcabend mcabend;
  
  @Autowired
  @Lazy
  SortStrategyDecider sortDecider;
  
  SortPathStrategy sortProcesser;
  
  @Value("${cf.sort.using.file.strategy:no}")
  private String usingSortFileStrategy;  
  
  @Value("${cf.sort.useTempFile:yes}")
  private String useTempFile;
  
  
  private static final int SDSORTKEY_OFFSET = 0;
  private static final int SDSORTKEY_LENGTH = 17;
  private static final int SDSK2REMMIPID_OFFSET = 22;
  private static final int SDSK2REMMIPID_LENGTH = 3;
  private static final int SDSK2OPERATORID_OFFSET = 25;
  private static final int SDSK2OPERATORID_LENGTH = 7;
  private static final int SDSK2DATESTAMP_OFFSET = 38;
  private static final int SDSK2DATESTAMP_LENGTH = 6;
  private static final int SDSK2TIMESTAMP_OFFSET = 32;
  private static final int SDSK2TIMESTAMP_LENGTH = 6;
  private int sortKeysCaseId = 1;
  private List<SdSortKeyKeys> sortRecKeys = new ArrayList<>();
  private Comparator<SdSortKeyKeys> sortComp = null;
  
  
  
  /**
   * Executor Service Initialize is used for SORT statements
   * Creates an Executor that uses a single worker thread operating off an unbounded queue.
   */
  @Override
  public void afterPropertiesSet() throws Exception {
  	startExecutorServ();
  }
  
  /**
   * ExecutorService shutdown is used for SORT statements  
   * Initiates an orderly shutdown in which previously submitted tasks are executed.
   */
  @Override 
  public void destroy() {
  	stopExecutorServ();
  }
  
      /**
      * process 
      * Input  :  

      * - tempRecsWrittenCnt             COBOL Name: TEMP-RECS-WRITTEN-CNT
      * - emailRecsWriteCnt400           COBOL Name: 400-EMAIL-RECS-WRITE-CNT
      * - numOne300                      COBOL Name: 300-NUM-ONE
      * - lit04300                       COBOL Name: 300-LIT-04
      *
      * Output :  

      * - compileDate                    COBOL Name: COMPILE-DATE
      * - firstT2RcdInd                  COBOL Name: FIRST-T2-RCD-IND
      * - firstX92RcdInd                 COBOL Name: FIRST-X92-RCD-IND
      * - rc                             COBOL Name: RETURN-CODE
      * - lit04300                       COBOL Name: 300-LIT-04
      *
      * @throws CFException
      */
      @Override
      public int process() throws Exception {
       initVars();
			// Declare local variables used in the method
			SdSortKey2 sdSortKey2 = sdSortWorkFileRcd.getSdSortKey2();
			long tempRecsWrittenCnt = 0;
			int emailRecsWriteCnt400 = 0;
			int numOne300 = 0;
			// End of variable declaration

       try {
       setCodePage("1047");
          // MOVE WHEN-COMPILED TO COMPILE-DATE
          work.setCompileDate(CONSTANTS.LITERAL_74527497);
//  DISPLAY 'SF320010 COMPILE DATE  ' COMPILE-DATE
          logger.info("SF320010 COMPILE DATE  {}", new String(work.getCompileDate())); 
//  MOVE '0' TO FIRST-T2-RCD-IND
//  LITERAL_0 = '0'
          work.setFirstT2RcdInd(CONSTANTS.LITERAL_0);
//  MOVE '0' TO FIRST-X92-RCD-IND
//  LITERAL_0 = '0'
          work.setFirstX92RcdInd(CONSTANTS.LITERAL_0);
//  OPEN OUTPUT TEMP-WORK-FILE
          tempWorkFile.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),tempWorkFile.getFileName(),tempWorkFile.getTempWorkFileCharSet(),tempWorkFile.getTempWorkFileCrlfFlag());
//  OPEN OUTPUT REPORT-FILE-OUT INFO-SEC-FILE-OUT SYS203-EMAIL-FILE-OUT
          reportFileOut.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),reportFileOut.getFileName(),reportFileOut.getReportFileOutCharSet(),reportFileOut.getReportFileOutCrlfFlag());
          infoSecFileOut.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),infoSecFileOut.getFileName(),infoSecFileOut.getInfoSecFileOutCharSet(),infoSecFileOut.getInfoSecFileOutCrlfFlag());
          sys203EmailFileOut.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),sys203EmailFileOut.getFileName(),sys203EmailFileOut.getSys203EmailFileOutCharSet(),sys203EmailFileOut.getSys203EmailFileOutCrlfFlag());
//  SORT SORT-WORK-FILE ASCENDING KEY SD-SORT-KEY INPUT PROCEDURE IS 0000-SORT-IN-PROCEDURE OUTPUT PROCEDURE IS 0000-SORT-OUT-PROCEDURE
          try {
               //SORT sortWorkFileInternIn input procedure temp file opened in write mode
               sortWorkFileInternIn.open("w", sortWorkFileInternIn.getFileName(), sortWorkFileInternIn.getSortWorkFileInternInCharSet(),sortWorkFileInternIn.getSortWorkFileInternInCrlfFlag());
             sortRecKeys = new ArrayList<>();
             doSortPresets();
              sortKeysCaseId = 1;
                sortInProcedure();
              if(sortWorkFileInternIn.hasOpened()) {
                 sortWorkFileInternIn.close();
              }
              if(useSortFileStrategy()) {
              	// implement code here
                   sortDecider.setInFileDetails(sortWorkFileInternIn.getAccessFileName(sortWorkFileInternIn.getFileName()),sortWorkFileInternIn.getRecLen(),sortWorkFileInternIn.isFixedBlock());
                   sortDecider.setOutFileName(sortWorkFileInternOut.getAccessFileName(sortWorkFileInternOut.getFileName()),sortWorkFileInternOut.getRecLen());
          		 SortProperties sortProperties = new SortProperties();
          		 // SORT key information
                   sortDecider.addSortKeysInfo("SDSORTKEY"/*name*/,SDSORTKEY_OFFSET/*pos*/,SDSORTKEY_LENGTH/*len*/,false/*descending*/,"CH"/*type*/,sortProperties);
          		 logger.info("Start reading SORT INPUT file Information ...");
          		 //Pre-process input file details and read sort keys information
          		 sortProcesser = sortDecider.decideSortStrategy(sortProperties);
          
          		 logger.info("Start process SORT using fetched SORT keys...");
          		 //Perform SORT based on sort keys information
          		 sortProcesser.sort();
          		 logger.info("Start process the sorted record to GIVING out file...");
          		 //Perform output file write by merging the sorted file(s)
          		 sortProcesser.merge();
          		 logger.info("SORT process using file strategy ends.");
          		 sortWorkFileInternOut.open("r", sortWorkFileInternOut.getFileName(), sortWorkFileInternOut.getSortWorkFileInternOutCharSet(),sortWorkFileInternOut.getSortWorkFileInternOutCrlfFlag());
              } else {
              sortComp = SdSortKeyKeys.getSdSortKeyComparator(true/*isAscending*/);
          
              sortRecKeys = sortRecKeys.stream().sorted(sortComp).collect(Collectors.toList());
          
              if (isWriteInTempFile()){
                     boolean isCountMatches = true;
                     int recordKeyCount = sortRecKeys.size();
                     while (isCountMatches) {
                             isCountMatches = recordKeyCount != getWriteCounter().get();
                     }
              }
              doPresetForRead();
              }
                sortOutProcedure();
               if(sortWorkFileInternOut.hasOpened()) {
          	    sortWorkFileInternOut.close(); 
               }
          } catch(Exception e) {
              logger.error("",e);
          } finally {
              removeTempFile();
              sortRecKeys.clear();
              removeInternFile();
          }
//  CLOSE TEMP-WORK-FILE
          tempWorkFile.close(); 
          tempRecsWrittenCnt = work.getTempRecsWrittenCnt();
//  IF TEMP-RECS-WRITTEN-CNT GREATER THAN ZEROS
          if (	( tempRecsWrittenCnt > 0 ) ) { 
//  SORT SORT-WORK-FILE ASCENDING KEY SD-SORT-KEY SD-SK2-REM-MIP-ID SD-SK2-OPERATOR-ID SD-SK2-DATE-STAMP SD-SK2-TIME-STAMP INPUT PROCEDURE IS 0100-SORT-IN-PROCEDURE OUTPUT PROCEDURE IS 0100-SORT-OUT-PROCEDURE
              try {
                   //SORT sortWorkFileInternIn input procedure temp file opened in write mode
                   sortWorkFileInternIn.open("w", sortWorkFileInternIn.getFileName(), sortWorkFileInternIn.getSortWorkFileInternInCharSet(),sortWorkFileInternIn.getSortWorkFileInternInCrlfFlag());
                 sortRecKeys = new ArrayList<>();
                 doSortPresets();
                  sortKeysCaseId = 2;
                    sortInProcedure0100();
                  if(sortWorkFileInternIn.hasOpened()) {
                     sortWorkFileInternIn.close();
                  }
                  if(useSortFileStrategy()) {
                  	// implement code here
                       sortDecider.setInFileDetails(sortWorkFileInternIn.getAccessFileName(sortWorkFileInternIn.getFileName()),sortWorkFileInternIn.getRecLen(),sortWorkFileInternIn.isFixedBlock());
                       sortDecider.setOutFileName(sortWorkFileInternOut.getAccessFileName(sortWorkFileInternOut.getFileName()),sortWorkFileInternOut.getRecLen());
              		 SortProperties sortProperties = new SortProperties();
              		 // SORT key information
                       sortDecider.addSortKeysInfo("SDSORTKEY"/*name*/,SDSORTKEY_OFFSET/*pos*/,SDSORTKEY_LENGTH/*len*/,false/*descending*/,"CH"/*type*/,sortProperties);
                       sortDecider.addSortKeysInfo("SDSK2REMMIPID"/*name*/,SDSK2REMMIPID_OFFSET/*pos*/,SDSK2REMMIPID_LENGTH/*len*/,false/*descending*/,"CH"/*type*/,sortProperties);
                       sortDecider.addSortKeysInfo("SDSK2OPERATORID"/*name*/,SDSK2OPERATORID_OFFSET/*pos*/,SDSK2OPERATORID_LENGTH/*len*/,false/*descending*/,"CH"/*type*/,sortProperties);
                       sortDecider.addSortKeysInfo("SDSK2DATESTAMP"/*name*/,SDSK2DATESTAMP_OFFSET/*pos*/,SDSK2DATESTAMP_LENGTH/*len*/,false/*descending*/,"CH"/*type*/,sortProperties);
                       sortDecider.addSortKeysInfo("SDSK2TIMESTAMP"/*name*/,SDSK2TIMESTAMP_OFFSET/*pos*/,SDSK2TIMESTAMP_LENGTH/*len*/,false/*descending*/,"CH"/*type*/,sortProperties);
              		 logger.info("Start reading SORT INPUT file Information ...");
              		 //Pre-process input file details and read sort keys information
              		 sortProcesser = sortDecider.decideSortStrategy(sortProperties);
              
              		 logger.info("Start process SORT using fetched SORT keys...");
              		 //Perform SORT based on sort keys information
              		 sortProcesser.sort();
              		 logger.info("Start process the sorted record to GIVING out file...");
              		 //Perform output file write by merging the sorted file(s)
              		 sortProcesser.merge();
              		 logger.info("SORT process using file strategy ends.");
              		 sortWorkFileInternOut.open("r", sortWorkFileInternOut.getFileName(), sortWorkFileInternOut.getSortWorkFileInternOutCharSet(),sortWorkFileInternOut.getSortWorkFileInternOutCrlfFlag());
                  } else {
                  sortComp = SdSortKeyKeys.getSdSortKeyComparator(true/*isAscending*/)
                    .thenComparing(SdSortKeyKeys.getSdSk2RemMipIdComparator(true/*isAscending*/))
                    .thenComparing(SdSortKeyKeys.getSdSk2OperatorIdComparator(true/*isAscending*/))
                    .thenComparing(SdSortKeyKeys.getSdSk2DateStampComparator(true/*isAscending*/))
                    .thenComparing(SdSortKeyKeys.getSdSk2TimeStampComparator(true/*isAscending*/));
              
                  sortRecKeys = sortRecKeys.stream().sorted(sortComp).collect(Collectors.toList());
              
                  if (isWriteInTempFile()){
                         boolean isCountMatches = true;
                         int recordKeyCount = sortRecKeys.size();
                         while (isCountMatches) {
                                 isCountMatches = recordKeyCount != getWriteCounter().get();
                         }
                  }
                  doPresetForRead();
                  }
                    sortOutProcedure0100();
                   if(sortWorkFileInternOut.hasOpened()) {
              	    sortWorkFileInternOut.close(); 
                   }
              } catch(Exception e) {
                  logger.error("",e);
              } finally {
                  removeTempFile();
                  sortRecKeys.clear();
                  removeInternFile();
              }
  
          }
  

// *         Using temp-work-file
//  PERFORM 2200-FORMAT-REM-CONS-TOTALS
          formatRemConsTotals();/*2200-FORMAT-REM-CONS-TOTALS*/
          if (this.isProgramEnded()) {
              return getRc();
          }
//  PERFORM 4000-PRODUCE-CONTROL-REPORT
          produceControlReport();/*4000-PRODUCE-CONTROL-REPORT*/
          if (this.isProgramEnded()) {
              return getRc();
          }
          numOne300 = work.getNumOne300();
          emailRecsWriteCnt400 = work.getEmailRecsWriteCnt400();
//  IF 400-EMAIL-RECS-WRITE-CNT LESS THAN 300-NUM-ONE
          if (	( emailRecsWriteCnt400 < numOne300 )) { 
//  MOVE 300-LIT-04 TO RETURN-CODE
              this.setRc(CFUtil.getInt(work.getLit04300()));
          }
  
//  CLOSE REPORT-FILE-OUT INFO-SEC-FILE-OUT SYS203-EMAIL-FILE-OUT
          reportFileOut.close(); 
          infoSecFileOut.close(); 
          sys203EmailFileOut.close(); 
//  STOP RUN
          throw Terminate.TERMINATE;
       } catch(Exception e) {
            handleErrorCode(e);
            throw e;
       }
        finally {
      		if(generalLogFileIn.hasOpened() && !generalLogFileIn.isReadOnly()) { 
      			generalLogFileIn.flush(); 
      		}
      		if(tempWorkFile.hasOpened() && !tempWorkFile.isReadOnly()) { 
      			tempWorkFile.flush(); 
      		}
      		if(reportFileOut.hasOpened() && !reportFileOut.isReadOnly()) { 
      			reportFileOut.flush(); 
      		}
      		if(infoSecFileOut.hasOpened() && !infoSecFileOut.isReadOnly()) { 
      			infoSecFileOut.flush(); 
      		}
      		if(sys203EmailFileOut.hasOpened() && !sys203EmailFileOut.isReadOnly()) { 
      			sys203EmailFileOut.flush(); 
      		}
      		if(sortWorkFileInternIn.hasOpened() && !sortWorkFileInternIn.isReadOnly()) { 
      			sortWorkFileInternIn.flush(); 
      		}
      		if(sortWorkFileInternOut.hasOpened() && !sortWorkFileInternOut.isReadOnly()) { 
      			sortWorkFileInternOut.flush(); 
      		}
      }
      
      // end of process method
      }
      /**
      * sortInProcedure 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-SORT-IN-PROCEDURE SECTION COBOL Cyclomatic complexity - 5
      * Input  :  

      * - generalLogEofSw                COBOL Name: GENERAL-LOG-EOF-SW
      * - sys001Lrecl400                 COBOL Name: 400-SYS001-LRECL
      * - generalWorkId                  COBOL Name: GENERAL-WORK-ID
      * - generalWorkDate                COBOL Name: GENERAL-WORK-DATE
      * - generalWorkTime                COBOL Name: GENERAL-WORK-TIME
      * - generalWorkClass               COBOL Name: GENERAL-WORK-CLASS
      * - generalWorkRest                COBOL Name: GENERAL-WORK-REST
      * - mciwinRetCentury               COBOL Name: MCIWIN-RET-CENTURY
      *
      * Output :  

      * - fdGeneralLogFileInRcd          COBOL Name: FD-GENERAL-LOG-FILE-IN-RCD
      * - generalLogEofSw                COBOL Name: GENERAL-LOG-EOF-SW
      * - sdSortId                       COBOL Name: SD-SORT-ID
      * - generalWorkId                  COBOL Name: GENERAL-WORK-ID
      * - sdSortDate                     COBOL Name: SD-SORT-DATE
      * - waDateYmd                      COBOL Name: WA-DATE-YMD
      * - generalWorkDate                COBOL Name: GENERAL-WORK-DATE
      * - sdSortTime                     COBOL Name: SD-SORT-TIME
      * - generalWorkTime                COBOL Name: GENERAL-WORK-TIME
      * - sdSortClass                    COBOL Name: SD-SORT-CLASS
      * - generalWorkClass               COBOL Name: GENERAL-WORK-CLASS
      * - sdSortKey2                     COBOL Name: SD-SORT-KEY-2
      * - generalWorkRest                COBOL Name: GENERAL-WORK-REST
      * - waDateYy                       COBOL Name: WA-DATE-YY
      * - mciwinYearToWindow             COBOL Name: MCIWIN-YEAR-TO-WINDOW
      * - rc                             COBOL Name: RETURN-CODE
      * - sdSortCc                       COBOL Name: SD-SORT-CC
      * - mciwinRetCentury               COBOL Name: MCIWIN-RET-CENTURY
      * - mciwinReturnCode               COBOL Name: MCIWIN-RETURN-CODE
      * - mciabendAbendCode              COBOL Name: MCIABEND-ABEND-CODE
      *
      * @throws CFException
      */
      private void sortInProcedure() throws Exception {
			// Declare local variables used in the method
			SdSortKey sdSortKey = sdSortWorkFileRcd.getSdSortKey();
			MciabendParm1 mciabendParm1 = mciabendParms.getMciabendParm1();
			char[] waDateYy = null;
			char[] generalLogEofSw = null;
			// End of variable declaration

//  OPEN INPUT GENERAL-LOG-FILE-IN
          generalLogFileIn.open(new String(CONSTANTS.MODE_READ_ONLY_36242),generalLogFileIn.getFileName(),generalLogFileIn.getGeneralLogFileInCharSet(),generalLogFileIn.getGeneralLogFileInCrlfFlag());
//  PERFORM WITH TEST BEFORE UNTIL GENERAL-LOG-EOF-SW EQUAL 'E'
          while ((work.getGeneralLogEofSw()[0] != 'E')) {

// *****************************************************************
// ***                    Syntel changes                         ***
// *   changed perform read statements to in-line read statements  *
// *   avoiding an if condition check on every iteration           *
// *****************************************************************
//  READ GENERAL-LOG-FILE-IN INTO GENERAL-WORK-AREA
              	generalLogFileIn.read();
              work.setSys001Lrecl400(generalLogFileIn.getRecLen());
              if (!generalLogFileIn.hasEnded()) {
                 fdGeneralLogFileInRcd.setString(generalLogFileIn.getRecord());
                 generalWorkArea.setString(replace(generalWorkArea.toCharArray(),substring(fdGeneralLogFileInRcd.toCharArray(),0,generalLogFileIn.getRecLen()),0,generalWorkArea.length()));
              }
//  AT END
              if (generalLogFileIn.hasEnded()) {  
                  // MOVE 'E' TO GENERAL-LOG-EOF-SW
                  //  LITERAL_E = 'E'
                  work.setGeneralLogEofSw(CONSTANTS.LITERAL_E);
                }
              generalLogEofSw = work.getGeneralLogEofSw();
//  IF GENERAL-LOG-EOF-SW EQUAL 'N'
//  LITERAL_N = 'N'
              if (compareChars(generalLogEofSw, CONSTANTS.LITERAL_N) == 0) { 

// *            If general-work-class equal 300-lit-8
// *               if general-work-area(24:1) is alphabetic
// *                  continue
// *               else
// *                  move general-work-area
// *                                    to 800-hold-work-area
// *                  move spaces       to general-work-area(28:3)
// *                  move 800-hold-work-area(28:)
// *                                    to general-work-area(31:)
// *               end-if
// *            end-if
//  MOVE GENERAL-WORK-ID TO SD-SORT-ID
                  sdSortKey.setSdSortId(generalWorkArea.getGeneralWorkId());
  
//  MOVE GENERAL-WORK-DATE TO SD-SORT-DATE WA-DATE-YMD
                  sdSortKey.setSdSortDate(generalWorkArea.getGeneralWorkDate());
                  waDateYmd.setString(generalWorkArea.getGeneralWorkDate());
  
//  MOVE GENERAL-WORK-TIME TO SD-SORT-TIME
                  sdSortKey.setSdSortTime(generalWorkArea.getGeneralWorkTime());
  
//  MOVE GENERAL-WORK-CLASS TO SD-SORT-CLASS
                  sdSortWorkFileRcd.setSdSortClass(generalWorkArea.getGeneralWorkClass());
//  MOVE GENERAL-WORK-REST TO SD-SORT-KEY-2
                  sdSortWorkFileRcd.getSdSortKey2().setString(generalWorkArea.getGeneralWorkRest());
//  MOVE WA-DATE-YY TO MCIWIN-YEAR-TO-WINDOW
                  mciwinYearToWindow.setString(waDateYmd.getWaDateYy());
                  waDateYy = waDateYmd.getWaDateYy();
//  IF WA-DATE-YY NUMERIC
                  if (    isNumeric(waDateYy)) { 
//  CALL MCWIN-PROGRAM USING MCIWIN-YEAR-TO-WINDOW MCIWIN-RETURNED-YEAR MCIWIN-NEW-WINDOW-YEAR
                      // CALL MCWIN-PROGRAM USING MCIWIN-YEAR-TO-WINDOW MCIWIN-RETURNED-YEAR MCIWIN-NEW-WINDOW-YEAR
                           this.setRc( mcwin.call(mciwinYearToWindow,mciwinReturnedYear,mciwinNewWindowYearGroup));
//  IF RETURN-CODE EQUAL ZEROS
                      if (	( getRc() == 0 )) { 
//  MOVE MCIWIN-RET-CENTURY TO SD-SORT-CC
                          sdSortKey.setSdSortCc(String.valueOf(mciwinReturnedYear.getMciwinRetCenturyString()).toCharArray());
  
//  RELEASE SD-SORT-WORK-FILE-RCD
                          if(useSortFileStrategy()) {
                          sortWorkFileInternIn.write(sdSortWorkFileRcd.toCharArray(),sdSortWorkFileRcd.length());
                          } else
                            addReleaseRecord(sdSortWorkFileRcd.toCharArray(),sdSortWorkFileRcd.length());
                      }
//  ELSE
                      else { 
//  MOVE RETURN-CODE TO MCIWIN-RETURN-CODE MCIABEND-ABEND-CODE
                          work.setMciwinReturnCode(getRc());
                          mciabendParm1.setMciabendAbendCode(getRc());
  
//  DISPLAY 'MCIWIN CALL FAILED'
                          logger.info("MCIWIN CALL FAILED"); 
//  DISPLAY 'RETURN CODE = ' MCIWIN-RETURN-CODE
                          logger.info("RETURN CODE = {}", String.valueOf(work.getMciwinReturnCode())); 
//  CALL MCABEND-MODULE USING MCIABEND-PARM1
                          // CALL MCABEND-MODULE USING MCIABEND-PARM1
                               this.setRc( mcabend.call(mciabendParms.getMciabendParm1()));
                      }
                  }
  
//  ELSE
                  else { 
//  MOVE SPACES TO SD-SORT-CC
                      sdSortKey.setSdSortCc(CONSTANTS.SPACE_2);
  
//  RELEASE SD-SORT-WORK-FILE-RCD
                      if(useSortFileStrategy()) {
                      sortWorkFileInternIn.write(sdSortWorkFileRcd.toCharArray(),sdSortWorkFileRcd.length());
                      } else
                        addReleaseRecord(sdSortWorkFileRcd.toCharArray(),sdSortWorkFileRcd.length());
                  }
              }
  
          }
//  CLOSE GENERAL-LOG-FILE-IN
          generalLogFileIn.close(); 
      
      }
      /**
      * sortOutProcedure 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-SORT-OUT-PROCEDURE SECTION COBOL Cyclomatic complexity - 40
      * Input  :  

      * - ctC7LogType1                   COBOL Name: CT-C7-LOG-TYPE-1
      * - ctC7LogType2                   COBOL Name: CT-C7-LOG-TYPE-2
      * - ctC7LogType3                   COBOL Name: CT-C7-LOG-TYPE-3
      * - ctC7LogType4                   COBOL Name: CT-C7-LOG-TYPE-4
      * - ctC7LogType5                   COBOL Name: CT-C7-LOG-TYPE-5
      * - ctC7LogType6                   COBOL Name: CT-C7-LOG-TYPE-6
      * - ctC7LogType7                   COBOL Name: CT-C7-LOG-TYPE-7
      * - ctC7LogType8                   COBOL Name: CT-C7-LOG-TYPE-8
      * - ctC7LogType9                   COBOL Name: CT-C7-LOG-TYPE-9
      * - ctC7LogTypeA                   COBOL Name: CT-C7-LOG-TYPE-A
      * - ctC7UndefLogType               COBOL Name: CT-C7-UNDEF-LOG-TYPE
      * - ctC9LogType1                   COBOL Name: CT-C9-LOG-TYPE-1
      * - ctC9LogType2                   COBOL Name: CT-C9-LOG-TYPE-2
      * - ctC9LogType3                   COBOL Name: CT-C9-LOG-TYPE-3
      * - ctC9LogType4                   COBOL Name: CT-C9-LOG-TYPE-4
      * - ctC9LogType5                   COBOL Name: CT-C9-LOG-TYPE-5
      * - ctC9LogType6                   COBOL Name: CT-C9-LOG-TYPE-6
      * - ctC9LogType7                   COBOL Name: CT-C9-LOG-TYPE-7
      * - ctC9LogType8                   COBOL Name: CT-C9-LOG-TYPE-8
      * - ctC9LogType9                   COBOL Name: CT-C9-LOG-TYPE-9
      * - ctC9LogType10                  COBOL Name: CT-C9-LOG-TYPE-10
      * - ctC9LogType11                  COBOL Name: CT-C9-LOG-TYPE-11
      * - ctC9LogType12                  COBOL Name: CT-C9-LOG-TYPE-12
      * - ctC9LogType13                  COBOL Name: CT-C9-LOG-TYPE-13
      * - ctC9LogType14                  COBOL Name: CT-C9-LOG-TYPE-14
      * - ctC9LogType15                  COBOL Name: CT-C9-LOG-TYPE-15
      * - ctC9LogType16                  COBOL Name: CT-C9-LOG-TYPE-16
      * - ctC9LogType17                  COBOL Name: CT-C9-LOG-TYPE-17
      * - ctC9LogType18                  COBOL Name: CT-C9-LOG-TYPE-18
      * - ctC9LogType19                  COBOL Name: CT-C9-LOG-TYPE-19
      * - ctC9LogType20                  COBOL Name: CT-C9-LOG-TYPE-20
      * - ctC9LogType21                  COBOL Name: CT-C9-LOG-TYPE-21
      * - ctC9LogType22                  COBOL Name: CT-C9-LOG-TYPE-22
      * - ctC9LogType23                  COBOL Name: CT-C9-LOG-TYPE-23
      * - ctC9LogType24                  COBOL Name: CT-C9-LOG-TYPE-24
      * - ctC9LogType25                  COBOL Name: CT-C9-LOG-TYPE-25
      * - ctC9LogType26                  COBOL Name: CT-C9-LOG-TYPE-26
      * - ctC9UndefLogType               COBOL Name: CT-C9-UNDEF-LOG-TYPE
      *
      * Output :  

      * - sf503SortMipId                 COBOL Name: SF503-SORT-MIP-ID
      *
      * @throws CFException
      */
      private void sortOutProcedure() throws Exception {
			// Declare local variables used in the method
			Sf503SortFields sf503SortFields = sf50301.getSf503SortFields();
			long ctC7UndefLogType = 0;
			long ctC9UndefLogType = 0;
			// End of variable declaration

//  PERFORM 6000-SET-DATE-TIME
          setDateTime();/*6000-SET-DATE-TIME*/
//  RETURN SORT-WORK-FILE RECORD INTO GENERAL-SORT-AREA
                if(useSortFileStrategy()) {
                  sortWorkFileInternOut.read();
                  if (!sortWorkFileInternOut.hasEnded()) {
                  	generalSortArea.setString(sortWorkFileInternOut.getRecord());
                  }    
              } else {
          setRecIndex(getRecIndex()+1);
          if (getRecIndex() < sortRecKeys.size() ) { 
             if (isUsingSortInFile()) generalSortArea.setString(convertEbcdicBytes2Char(getReturnRecord(getRecIndex())));
             else generalSortArea.setString(getReturnRecord(getRecIndex())); 
          }
          }
//  AT END
              if (isSortRecordsEnded()) { 
//  MOVE HIGH-VALUES TO SF503-SORT-MIP-ID
                  sf503SortFields.setSf503SortMipId(CONSTANTS.HIGH_VALUE_1986603238);
  
                }
//  PERFORM 1000-FORMAT-REPORTS UNTIL SF503-SORT-MIP-ID EQUAL HIGH-VALUES
          while (!( isHighValue(sf503SortFields.getSf503SortMipId()) ) ) {
             formatReports();/*1000-FORMAT-REPORTS*/
          }
  
//  IF ( ( CT-C7-LOG-TYPE-1 = ZEROS) AND ( CT-C7-LOG-TYPE-2 = ZEROS) AND ( CT-C7-LOG-TYPE-3 = ZEROS) AND ( CT-C7-LOG-TYPE-4 = ZEROS) AND ( CT-C7-LOG-TYPE-5 = ZEROS) AND ( CT-C7-LOG-TYPE-6 = ZEROS) AND ( CT-C7-LOG-TYPE-7 = ZEROS) AND ( CT-C7-LOG-TYPE-8 = ZEROS) AND ( CT-C7-LOG-TYPE-9 = ZEROS) AND ( CT-C7-LOG-TYPE-A = ZEROS) AND ( CT-C7-UNDEF-LOG-TYPE = ZEROS))
          ctC7UndefLogType = work.getCtC7UndefLogType();
//  ELSE
          if ((((	( work.getCtC7LogType1() != 0 ) )) || ((	( work.getCtC7LogType2() != 0 ) )) || ((	( work.getCtC7LogType3() != 0 ) )) || ((	( work.getCtC7LogType4() != 0 ) )) || ((	( work.getCtC7LogType5() != 0 ) )) || ((	( work.getCtC7LogType6() != 0 ) )) || ((	( work.getCtC7LogType7() != 0 ) )) || ((	( work.getCtC7LogType8() != 0 ) )) || ((	( work.getCtC7LogType9() != 0 ) )) || ((	( work.getCtC7LogTypeA() != 0 ) )) || ((	( ctC7UndefLogType != 0 ) )))) { 
//  PERFORM 1610-FORMAT-TYPE-II-LOG-RPT
              formatTypeIiLogRpt();/*1610-FORMAT-TYPE-II-LOG-RPT*/
          }
  
//  IF ( ( CT-C9-LOG-TYPE-1 = ZEROS) AND ( CT-C9-LOG-TYPE-2 = ZEROS) AND ( CT-C9-LOG-TYPE-3 = ZEROS) AND ( CT-C9-LOG-TYPE-4 = ZEROS) AND ( CT-C9-LOG-TYPE-5 = ZEROS) AND ( CT-C9-LOG-TYPE-6 = ZEROS) AND ( CT-C9-LOG-TYPE-7 = ZEROS) AND ( CT-C9-LOG-TYPE-8 = ZEROS) AND ( CT-C9-LOG-TYPE-9 = ZEROS) AND ( CT-C9-LOG-TYPE-10 = ZEROS) AND ( CT-C9-LOG-TYPE-11 = ZEROS) AND ( CT-C9-LOG-TYPE-12 = ZEROS) AND ( CT-C9-LOG-TYPE-13 = ZEROS) AND ( CT-C9-LOG-TYPE-14 = ZEROS) AND ( CT-C9-LOG-TYPE-15 = ZEROS) AND ( CT-C9-LOG-TYPE-16 = ZEROS) AND ( CT-C9-LOG-TYPE-17 = ZEROS) AND ( CT-C9-LOG-TYPE-18 = ZEROS) AND ( CT-C9-LOG-TYPE-19 = ZEROS) AND ( CT-C9-LOG-TYPE-20 = ZEROS) AND ( CT-C9-LOG-TYPE-21 = ZEROS) AND ( CT-C9-LOG-TYPE-22 = ZEROS) AND ( CT-C9-LOG-TYPE-23 = ZEROS) AND ( CT-C9-LOG-TYPE-24 = ZEROS) AND ( CT-C9-LOG-TYPE-25 = ZEROS) AND ( CT-C9-LOG-TYPE-26 = ZEROS) AND ( CT-C9-UNDEF-LOG-TYPE = ZEROS))
          ctC9UndefLogType = work.getCtC9UndefLogType();
//  ELSE
          if ((((	( work.getCtC9LogType1() != 0 ) )) || ((	( work.getCtC9LogType2() != 0 ) )) || ((	( work.getCtC9LogType3() != 0 ) )) || ((	( work.getCtC9LogType4() != 0 ) )) || ((	( work.getCtC9LogType5() != 0 ) )) || ((	( work.getCtC9LogType6() != 0 ) )) || ((	( work.getCtC9LogType7() != 0 ) )) || ((	( work.getCtC9LogType8() != 0 ) )) || ((	( work.getCtC9LogType9() != 0 ) )) || ((	( work.getCtC9LogType10() != 0 ) )) || ((	( work.getCtC9LogType11() != 0 ) )) || ((	( work.getCtC9LogType12() != 0 ) )) || ((	( work.getCtC9LogType13() != 0 ) )) || ((	( work.getCtC9LogType14() != 0 ) )) || ((	( work.getCtC9LogType15() != 0 ) )) || ((	( work.getCtC9LogType16() != 0 ) )) || ((	( work.getCtC9LogType17() != 0 ) )) || ((	( work.getCtC9LogType18() != 0 ) )) || ((	( work.getCtC9LogType19() != 0 ) )) || ((	( work.getCtC9LogType20() != 0 ) )) || ((	( work.getCtC9LogType21() != 0 ) )) || ((	( work.getCtC9LogType22() != 0 ) )) || ((	( work.getCtC9LogType23() != 0 ) )) || ((	( work.getCtC9LogType24() != 0 ) )) || ((	( work.getCtC9LogType25() != 0 ) )) || ((	( work.getCtC9LogType26() != 0 ) )) || ((	( ctC9UndefLogType != 0 ) )))) { 
//  PERFORM 1710-FORMAT-X92-ACTIVITY-RPT
              formatX92ActivityRpt();/*1710-FORMAT-X92-ACTIVITY-RPT*/
          }
  
      
      }
      /**
      * sortInProcedure0100 
      *   This method is derived from 
  *   COBOL Paragraph - 0100-SORT-IN-PROCEDURE SECTION COBOL Cyclomatic complexity - 5
      * Input  :  

      * - tempFileEofSw                  COBOL Name: TEMP-FILE-EOF-SW
      * - generalWorkId                  COBOL Name: GENERAL-WORK-ID
      * - generalWorkDate                COBOL Name: GENERAL-WORK-DATE
      * - generalWorkTime                COBOL Name: GENERAL-WORK-TIME
      * - generalWorkClass               COBOL Name: GENERAL-WORK-CLASS
      * - generalWorkRest                COBOL Name: GENERAL-WORK-REST
      * - mciwinRetCentury               COBOL Name: MCIWIN-RET-CENTURY
      *
      * Output :  

      * - fdTempWorkFileRcd              COBOL Name: FD-TEMP-WORK-FILE-RCD
      * - tempFileEofSw                  COBOL Name: TEMP-FILE-EOF-SW
      * - sdSortId                       COBOL Name: SD-SORT-ID
      * - generalWorkId                  COBOL Name: GENERAL-WORK-ID
      * - sdSortDate                     COBOL Name: SD-SORT-DATE
      * - waDateYmd                      COBOL Name: WA-DATE-YMD
      * - generalWorkDate                COBOL Name: GENERAL-WORK-DATE
      * - sdSortTime                     COBOL Name: SD-SORT-TIME
      * - generalWorkTime                COBOL Name: GENERAL-WORK-TIME
      * - sdSortClass                    COBOL Name: SD-SORT-CLASS
      * - generalWorkClass               COBOL Name: GENERAL-WORK-CLASS
      * - sdSortKey2                     COBOL Name: SD-SORT-KEY-2
      * - generalWorkRest                COBOL Name: GENERAL-WORK-REST
      * - waDateYy                       COBOL Name: WA-DATE-YY
      * - mciwinYearToWindow             COBOL Name: MCIWIN-YEAR-TO-WINDOW
      * - rc                             COBOL Name: RETURN-CODE
      * - sdSortCc                       COBOL Name: SD-SORT-CC
      * - mciwinRetCentury               COBOL Name: MCIWIN-RET-CENTURY
      * - mciwinReturnCode               COBOL Name: MCIWIN-RETURN-CODE
      * - mciabendAbendCode              COBOL Name: MCIABEND-ABEND-CODE
      *
      * @throws CFException
      */
      private void sortInProcedure0100() throws Exception {
			// Declare local variables used in the method
			SdSortKey sdSortKey = sdSortWorkFileRcd.getSdSortKey();
			MciabendParm1 mciabendParm1 = mciabendParms.getMciabendParm1();
			char[] waDateYy = null;
			char[] tempFileEofSw = null;
			// End of variable declaration

//  OPEN INPUT TEMP-WORK-FILE
          tempWorkFile.open(new String(CONSTANTS.MODE_READ_ONLY_36242),tempWorkFile.getFileName(),tempWorkFile.getTempWorkFileCharSet(),tempWorkFile.getTempWorkFileCrlfFlag());
//  PERFORM WITH TEST BEFORE UNTIL TEMP-FILE-EOF-SW EQUAL 'E'
          while ((work.getTempFileEofSw()[0] != 'E')) {

// *****************************************************************
// ***                    Syntel changes                         ***
// *   changed perform read statements to in-line read statements  *
// *   saving an if condition check on every iteration             *
// *****************************************************************
              // READ TEMP-WORK-FILE INTO GENERAL-WORK-AREA
              tempWorkFile.read();
              if (!tempWorkFile.hasEnded()) {
                generalWorkArea.setString(tempWorkFile.getRecord());
                fdTempWorkFileRcd.setString(tempWorkFile.getRecord());
              }
//  AT END
              if (tempWorkFile.hasEnded()) {  
                  // MOVE 'E' TO TEMP-FILE-EOF-SW
                  //  LITERAL_E = 'E'
                  work.setTempFileEofSw(CONSTANTS.LITERAL_E);
                }
              tempFileEofSw = work.getTempFileEofSw();
//  IF TEMP-FILE-EOF-SW EQUAL 'N'
//  LITERAL_N = 'N'
              if (compareChars(tempFileEofSw, CONSTANTS.LITERAL_N) == 0) { 
//  MOVE GENERAL-WORK-ID TO SD-SORT-ID
                  sdSortKey.setSdSortId(generalWorkArea.getGeneralWorkId());
  
//  MOVE GENERAL-WORK-DATE TO SD-SORT-DATE WA-DATE-YMD
                  sdSortKey.setSdSortDate(generalWorkArea.getGeneralWorkDate());
                  waDateYmd.setString(generalWorkArea.getGeneralWorkDate());
  
//  MOVE GENERAL-WORK-TIME TO SD-SORT-TIME
                  sdSortKey.setSdSortTime(generalWorkArea.getGeneralWorkTime());
  
//  MOVE GENERAL-WORK-CLASS TO SD-SORT-CLASS
                  sdSortWorkFileRcd.setSdSortClass(generalWorkArea.getGeneralWorkClass());
//  MOVE GENERAL-WORK-REST TO SD-SORT-KEY-2
                  sdSortWorkFileRcd.getSdSortKey2().setString(generalWorkArea.getGeneralWorkRest());
//  MOVE WA-DATE-YY TO MCIWIN-YEAR-TO-WINDOW
                  mciwinYearToWindow.setString(waDateYmd.getWaDateYy());
                  waDateYy = waDateYmd.getWaDateYy();
//  IF WA-DATE-YY NUMERIC
                  if (    isNumeric(waDateYy)) { 
//  CALL MCWIN-PROGRAM USING MCIWIN-YEAR-TO-WINDOW MCIWIN-RETURNED-YEAR MCIWIN-NEW-WINDOW-YEAR
                      // CALL MCWIN-PROGRAM USING MCIWIN-YEAR-TO-WINDOW MCIWIN-RETURNED-YEAR MCIWIN-NEW-WINDOW-YEAR
                           this.setRc( mcwin.call(mciwinYearToWindow,mciwinReturnedYear,mciwinNewWindowYearGroup));
//  IF RETURN-CODE EQUAL ZEROS
                      if (	( getRc() == 0 )) { 
//  MOVE MCIWIN-RET-CENTURY TO SD-SORT-CC
                          sdSortKey.setSdSortCc(String.valueOf(mciwinReturnedYear.getMciwinRetCenturyString()).toCharArray());
  
//  RELEASE SD-SORT-WORK-FILE-RCD
                          if(useSortFileStrategy()) {
                          sortWorkFileInternIn.write(sdSortWorkFileRcd.toCharArray(),sdSortWorkFileRcd.length());
                          } else
                            addReleaseRecord(sdSortWorkFileRcd.toCharArray(),sdSortWorkFileRcd.length());
                      }
//  ELSE
                      else { 
//  MOVE RETURN-CODE TO MCIWIN-RETURN-CODE MCIABEND-ABEND-CODE
                          work.setMciwinReturnCode(getRc());
                          mciabendParm1.setMciabendAbendCode(getRc());
  
//  DISPLAY 'MCIWIN CALL FAILED'
                          logger.info("MCIWIN CALL FAILED"); 
//  DISPLAY 'RETURN CODE = ' MCIWIN-RETURN-CODE
                          logger.info("RETURN CODE = {}", String.valueOf(work.getMciwinReturnCode())); 
//  CALL MCABEND-MODULE USING MCIABEND-PARM1
                          // CALL MCABEND-MODULE USING MCIABEND-PARM1
                               this.setRc( mcabend.call(mciabendParms.getMciabendParm1()));
                      }
                  }
  
//  ELSE
                  else { 
//  MOVE SPACES TO SD-SORT-CC
                      sdSortKey.setSdSortCc(CONSTANTS.SPACE_2);
  
//  RELEASE SD-SORT-WORK-FILE-RCD
                      if(useSortFileStrategy()) {
                      sortWorkFileInternIn.write(sdSortWorkFileRcd.toCharArray(),sdSortWorkFileRcd.length());
                      } else
                        addReleaseRecord(sdSortWorkFileRcd.toCharArray(),sdSortWorkFileRcd.length());
                  }
              }
  
          }
//  CLOSE TEMP-WORK-FILE
          tempWorkFile.close(); 
      
      }
      /**
      * sortOutProcedure0100 
      *   This method is derived from 
  *   COBOL Paragraph - 0100-SORT-OUT-PROCEDURE SECTION COBOL Cyclomatic complexity - 2
      * Input  :  

      * - generalSortId                  COBOL Name: GENERAL-SORT-ID
      * - generalSortDate                COBOL Name: GENERAL-SORT-DATE
      * - generalSortTime                COBOL Name: GENERAL-SORT-TIME
      * - generalSortClass               COBOL Name: GENERAL-SORT-CLASS
      * - generalSortRest                COBOL Name: GENERAL-SORT-REST
      * - sf503RcRemoteMipId             COBOL Name: SF503-RC-REMOTE-MIP-ID
      *
      * Output :  

      * - sf503SortMipId                 COBOL Name: SF503-SORT-MIP-ID
      * - generalSortId                  COBOL Name: GENERAL-SORT-ID
      * - sf503SortDate                  COBOL Name: SF503-SORT-DATE
      * - generalSortDate                COBOL Name: GENERAL-SORT-DATE
      * - sf503SortTime                  COBOL Name: SF503-SORT-TIME
      * - generalSortTime                COBOL Name: GENERAL-SORT-TIME
      * - sf503LogRecord                 COBOL Name: SF503-LOG-RECORD
      * - generalSortClass               COBOL Name: GENERAL-SORT-CLASS
      * - generalSortRest                COBOL Name: GENERAL-SORT-REST
      * - prevRcRemoteMipId              COBOL Name: PREV-RC-REMOTE-MIP-ID
      * - sf503RcRemoteMipId             COBOL Name: SF503-RC-REMOTE-MIP-ID
      *
      * @throws CFException
      */
      private void sortOutProcedure0100() throws Exception {
			// Declare local variables used in the method
			Sf503SortFields sf503SortFields = sf50301.getSf503SortFields();
			Sf503RemoteConsoleLog sf503RemoteConsoleLog = sf50301.getSf503RemoteConsoleLog();
			// End of variable declaration

//  RETURN SORT-WORK-FILE RECORD INTO GENERAL-SORT-AREA
                if(useSortFileStrategy()) {
                  sortWorkFileInternOut.read();
                  if (!sortWorkFileInternOut.hasEnded()) {
                  	generalSortArea.setString(sortWorkFileInternOut.getRecord());
                  }    
              } else {
          setRecIndex(getRecIndex()+1);
          if (getRecIndex() < sortRecKeys.size() ) { 
             if (isUsingSortInFile()) generalSortArea.setString(convertEbcdicBytes2Char(getReturnRecord(getRecIndex())));
             else generalSortArea.setString(getReturnRecord(getRecIndex())); 
          }
          }
//  AT END
              if (isSortRecordsEnded()) { 
//  MOVE HIGH-VALUES TO SF503-SORT-MIP-ID
                  sf503SortFields.setSf503SortMipId(CONSTANTS.HIGH_VALUE_1986603238);
  
                }
//  MOVE GENERAL-SORT-ID TO SF503-SORT-MIP-ID
          sf503SortFields.setSf503SortMipId(generalSortArea.getGeneralSortId());
  
//  MOVE GENERAL-SORT-DATE TO SF503-SORT-DATE
          sf503SortFields.setSf503SortDate(generalSortArea.getGeneralSortDate());
  
//  MOVE GENERAL-SORT-TIME TO SF503-SORT-TIME
          sf503SortFields.setSf503SortTime(generalSortArea.getGeneralSortTime());
  
//  MOVE GENERAL-SORT-CLASS TO SF503-LOG-RECORD ( 300-NUM-ONE : 300-NUM-ONE )
          sf50301.replace(generalSortArea/*parent*/,17/*fromOffset - (sf503LogRecord) */,1/*fromLen*/,15+work.getNumOne300() - 1/*toOffset - (generalSortClass) */,work.getNumOne300()/*toLen*/);
//  MOVE GENERAL-SORT-REST TO SF503-LOG-RECORD ( 300-NUM-TWO : )
          sf50301.replace(generalSortArea/*parent*/,18/*fromOffset - (sf503LogRecord) */,8176/*fromLen*/,15+work.getNumTwo300() - 1/*toOffset - (generalSortRest) */,32737/*toLen*/);
          // MOVE SF503-RC-REMOTE-MIP-ID TO PREV-RC-REMOTE-MIP-ID
          work.setPrevRcRemoteMipId(sf50301.getSf503RemoteConsoleLog().getSf503RcRemoteMipId());
  
//  PERFORM 2000-FORMAT-REM-CONS-RPT UNTIL SF503-SORT-MIP-ID EQUAL HIGH-VALUES
          while (!( isHighValue(sf503SortFields.getSf503SortMipId()) ) ) {
             formatRemConsRpt();/*2000-FORMAT-REM-CONS-RPT*/
          }
  
          ;
      
      }
      /**
      * formatReports 
      *   This method is derived from 
  *   COBOL Paragraph - 1000-FORMAT-REPORTS COBOL Cyclomatic complexity - 14
      * Input  :  

      * - generalSortId                  COBOL Name: GENERAL-SORT-ID
      * - generalSortDate                COBOL Name: GENERAL-SORT-DATE
      * - generalSortTime                COBOL Name: GENERAL-SORT-TIME
      * - generalSortClass               COBOL Name: GENERAL-SORT-CLASS
      * - generalSortRest                COBOL Name: GENERAL-SORT-REST
      * - numOne300                      COBOL Name: 300-NUM-ONE
      * - sf503Bd32Type                  COBOL Name: SF503-BD32-TYPE
      * - ctLogBulkData32                COBOL Name: CT-LOG-BULK-DATA32
      * - ctLogStats                     COBOL Name: CT-LOG-STATS
      * - fdTempWorkFileRcd              COBOL Name: FD-TEMP-WORK-FILE-RCD
      * - tempRecsWrittenCnt             COBOL Name: TEMP-RECS-WRITTEN-CNT
      * - ctLogEdc                       COBOL Name: CT-LOG-EDC
      * - ctLogChk                       COBOL Name: CT-LOG-CHK
      * - ctLogOther                     COBOL Name: CT-LOG-OTHER
      *
      * Output :  

      * - sf503SortMipId                 COBOL Name: SF503-SORT-MIP-ID
      * - generalSortId                  COBOL Name: GENERAL-SORT-ID
      * - sf503SortDate                  COBOL Name: SF503-SORT-DATE
      * - generalSortDate                COBOL Name: GENERAL-SORT-DATE
      * - sf503SortTime                  COBOL Name: SF503-SORT-TIME
      * - generalSortTime                COBOL Name: GENERAL-SORT-TIME
      * - sf503LogRecord                 COBOL Name: SF503-LOG-RECORD
      * - generalSortClass               COBOL Name: GENERAL-SORT-CLASS
      * - generalSortRest                COBOL Name: GENERAL-SORT-REST
      * - ctLogBulkData32                COBOL Name: CT-LOG-BULK-DATA32
      * - ctLogStats                     COBOL Name: CT-LOG-STATS
      * - tempRecsWrittenCnt             COBOL Name: TEMP-RECS-WRITTEN-CNT
      * - ctLogEdc                       COBOL Name: CT-LOG-EDC
      * - ctLogChk                       COBOL Name: CT-LOG-CHK
      * - otherGlogClass100              COBOL Name: 100-OTHER-GLOG-CLASS
      * - ctLogOther                     COBOL Name: CT-LOG-OTHER
      *
      * @throws CFException
      */
      private void formatReports() throws Exception {
			// Declare local variables used in the method
			Sf503SortFields sf503SortFields = sf50301.getSf503SortFields();
			Sf503Bd32BulkId sf503Bd32BulkId = sf50301.getSf503Bd32BulkDataTranLog().getSf503Bd32BulkId();
			char[] sf503Bd32Type = null;
			char[] sf503LogRecord = null;
			// End of variable declaration

//  MOVE GENERAL-SORT-ID TO SF503-SORT-MIP-ID
          sf503SortFields.setSf503SortMipId(generalSortArea.getGeneralSortId());
  
//  MOVE GENERAL-SORT-DATE TO SF503-SORT-DATE
          sf503SortFields.setSf503SortDate(generalSortArea.getGeneralSortDate());
  
//  MOVE GENERAL-SORT-TIME TO SF503-SORT-TIME
          sf503SortFields.setSf503SortTime(generalSortArea.getGeneralSortTime());
  
//  MOVE GENERAL-SORT-CLASS TO SF503-LOG-RECORD ( 300-NUM-ONE : 300-NUM-ONE )
          sf50301.replace(generalSortArea/*parent*/,17/*fromOffset - (sf503LogRecord) */,1/*fromLen*/,15+work.getNumOne300() - 1/*toOffset - (generalSortClass) */,work.getNumOne300()/*toLen*/);
//  MOVE GENERAL-SORT-REST TO SF503-LOG-RECORD ( 300-NUM-TWO : )
          sf50301.replace(generalSortArea/*parent*/,18/*fromOffset - (sf503LogRecord) */,8176/*fromLen*/,15+work.getNumTwo300() - 1/*toOffset - (generalSortRest) */,32737/*toLen*/);
          sf503LogRecord = sf50301.getSf503LogRecord();
//  IF SF503-LOG-RECORD ( 300-NUM-ONE : 300-NUM-ONE ) EQUAL '2' OR 'B'
//  LITERAL_B = 'B'
          if (work.getNumOne300() > 0 && sf503LogRecord[getIndex(work.getNumOne300())] == '2' || work.getNumOne300() > 0 && sf503LogRecord[getIndex(work.getNumOne300())] == 'B') { 
              sf503Bd32Type = sf503Bd32BulkId.getSf503Bd32Type();
//  IF SF503-BD32-TYPE EQUAL 'A'
//  LITERAL_A = 'A'
              if (compareChars(sf503Bd32Type, CONSTANTS.LITERAL_A) == 0) { 
//  ADD 1 TO CT-LOG-BULK-DATA32
                  work.setCtLogBulkData32(work.getCtLogBulkData32()+(long)1);
              }
  
//  ELSE
              else { 
//  PERFORM 1100-FORMAT-BULK-DATA-REPORT
                  formatBulkDataReport();/*1100-FORMAT-BULK-DATA-REPORT*/
              }
          }
  
//  ELSE
          else { 
              sf503LogRecord = sf50301.getSf503LogRecord();
//  IF SF503-LOG-RECORD ( 300-NUM-ONE : 300-NUM-ONE ) EQUAL '5'
//  LITERAL_5 = '5'
              if (work.getNumOne300() > 0 && sf503LogRecord[getIndex(work.getNumOne300())] == '5') { 
//  PERFORM 1200-FORMAT-OPERATOR-LOG-RPT
                  formatOperatorLogRpt();/*1200-FORMAT-OPERATOR-LOG-RPT*/
              }
  
//  ELSE
              else { 
                  sf503LogRecord = sf50301.getSf503LogRecord();
//  IF SF503-LOG-RECORD ( 300-NUM-ONE : 300-NUM-ONE ) EQUAL '4'
//  LITERAL_4 = '4'
                  if (work.getNumOne300() > 0 && sf503LogRecord[getIndex(work.getNumOne300())] == '4') { 
//  ADD 1 TO CT-LOG-STATS
                      work.setCtLogStats(work.getCtLogStats()+(long)1);
                  }
  
//  ELSE
                  else { 
                      sf503LogRecord = sf50301.getSf503LogRecord();
//  IF SF503-LOG-RECORD ( 300-NUM-ONE : 300-NUM-ONE ) EQUAL '6'
//  LITERAL_6 = '6'
                      if (work.getNumOne300() > 0 && sf503LogRecord[getIndex(work.getNumOne300())] == '6') { 
//  PERFORM 1400-FORMAT-MIP-PROFILE-REPORT
                          formatMipProfileReport();/*1400-FORMAT-MIP-PROFILE-REPORT*/
                      }
  
//  ELSE
                      else { 
                          sf503LogRecord = sf50301.getSf503LogRecord();
//  IF SF503-LOG-RECORD ( 300-NUM-ONE : 300-NUM-ONE ) EQUAL '3'
//  LITERAL_3 = '3'
                          if (work.getNumOne300() > 0 && sf503LogRecord[getIndex(work.getNumOne300())] == '3') { 
//  PERFORM 1500-FORMAT-POS-TRANS-LOG-RPT
                              formatPosTransLogRpt();/*1500-FORMAT-POS-TRANS-LOG-RPT*/
                          }
  
//  ELSE
                          else { 
                              sf503LogRecord = sf50301.getSf503LogRecord();
//  IF SF503-LOG-RECORD ( 300-NUM-ONE : 300-NUM-ONE ) EQUAL '7'
//  LITERAL_7 = '7'
                              if (work.getNumOne300() > 0 && sf503LogRecord[getIndex(work.getNumOne300())] == '7') { 
//  PERFORM 1600-FORMAT-TYPE-II-ACTIVITY
                                  formatTypeIiActivity();/*1600-FORMAT-TYPE-II-ACTIVITY*/
                              }
  
//  ELSE
                              else { 
                                  sf503LogRecord = sf50301.getSf503LogRecord();
//  IF SF503-LOG-RECORD ( 300-NUM-ONE : 300-NUM-ONE ) EQUAL '9'
//  LITERAL_9 = '9'
                                  if (work.getNumOne300() > 0 && sf503LogRecord[getIndex(work.getNumOne300())] == '9') { 
//  PERFORM 1700-FORMAT-X92-ACTIVITY
                                      formatX92Activity();/*1700-FORMAT-X92-ACTIVITY*/
                                  }
  
//  ELSE
                                  else { 
                                      sf503LogRecord = sf50301.getSf503LogRecord();
//  IF SF503-LOG-RECORD ( 300-NUM-ONE : 300-NUM-ONE ) EQUAL '8'
//  LITERAL_8 = '8'
                                      if (work.getNumOne300() > 0 && sf503LogRecord[getIndex(work.getNumOne300())] == '8') { 
//  WRITE FD-TEMP-WORK-FILE-RCD FROM SF50301
                                          tempWorkFile.write(sf50301.toCharArray()); 
                                          fdTempWorkFileRcd.setString(CONSTANTS.LOW_VALUE_215686484);
//  ADD 1 TO TEMP-RECS-WRITTEN-CNT
                                          work.setTempRecsWrittenCnt(work.getTempRecsWrittenCnt()+(long)1);
                                      }
  
//  ELSE
                                      else { 
                                          sf503LogRecord = sf50301.getSf503LogRecord();
//  IF SF503-LOG-RECORD ( 300-NUM-ONE : 300-NUM-ONE ) EQUAL 'E'
//  LITERAL_E = 'E'
                                          if (work.getNumOne300() > 0 && sf503LogRecord[getIndex(work.getNumOne300())] == 'E') { 
//  ADD 1 TO CT-LOG-EDC
                                              work.setCtLogEdc(work.getCtLogEdc()+(long)1);
                                          }
  
//  ELSE
                                          else { 
                                              sf503LogRecord = sf50301.getSf503LogRecord();
//  IF SF503-LOG-RECORD ( 300-NUM-ONE : 300-NUM-ONE ) EQUAL 'C'
                                              if (work.getNumOne300() > 0 && sf503LogRecord[getIndex(work.getNumOne300())] == 'C') { 
//  ADD 1 TO CT-LOG-CHK
                                                  work.setCtLogChk(work.getCtLogChk()+(long)1);
                                              }
  
//  ELSE
                                              else { 
//  MOVE SF503-LOG-RECORD ( 300-NUM-ONE : 300-NUM-ONE ) TO 100-OTHER-GLOG-CLASS
                                                  work.setOtherGlogClass100(substring(sf50301.getSf503LogRecord(),(work.getNumOne300()-1), (work.getNumOne300() + (work.getNumOne300() - 1)) ));
//  IF OTHER-LOG-TYPE
                                                  if ( work.isOtherLogType()  ) { 
//  ADD 1 TO CT-LOG-OTHER
                                                      work.setCtLogOther(work.getCtLogOther()+(long)1);
                                                  }
                                              }
                                          }
                                      }
                                  }
                              }
                          }
                      }
                  }
              }
          }
//  RETURN SORT-WORK-FILE RECORD INTO GENERAL-SORT-AREA
                if(useSortFileStrategy()) {
                  sortWorkFileInternOut.read();
                  if (!sortWorkFileInternOut.hasEnded()) {
                  	generalSortArea.setString(sortWorkFileInternOut.getRecord());
                  }    
              } else {
          setRecIndex(getRecIndex()+1);
          if (getRecIndex() < sortRecKeys.size() ) { 
             if (isUsingSortInFile()) generalSortArea.setString(convertEbcdicBytes2Char(getReturnRecord(getRecIndex())));
             else generalSortArea.setString(getReturnRecord(getRecIndex())); 
          }
          }
//  AT END
              if (isSortRecordsEnded()) { 
//  MOVE HIGH-VALUES TO SF503-SORT-MIP-ID
                  sf503SortFields.setSf503SortMipId(CONSTANTS.HIGH_VALUE_1986603238);
  
                }
      
      }
      /**
      * formatBulkDataReport 
      *   This method is derived from 
  *   COBOL Paragraph - 1100-FORMAT-BULK-DATA-REPORT COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sf503BdBulkId                  COBOL Name: SF503-BD-BULK-ID
      * - sf503BdMipId                   COBOL Name: SF503-BD-MIP-ID
      * - sf503BdPathId                  COBOL Name: SF503-BD-PATH-ID
      * - sf503BdStatus                  COBOL Name: SF503-BD-STATUS
      * - sf503BdErrorCode               COBOL Name: SF503-BD-ERROR-CODE
      * - sf503BdJulianDay               COBOL Name: SF503-BD-JULIAN-DAY
      * - sf503BdTime                    COBOL Name: SF503-BD-TIME
      * - sf503BdNbr1kSpoolRcds          COBOL Name: SF503-BD-NBR-1K-SPOOL-RCDS
      * - sf503BdNbrBytesTrans           COBOL Name: SF503-BD-NBR-BYTES-TRANS
      * - sf503BdNbrBlocksTrans          COBOL Name: SF503-BD-NBR-BLOCKS-TRANS
      * - ctRptBdLineNo                  COBOL Name: CT-RPT-BD-LINE-NO
      * - rpBdDetail                     COBOL Name: RP-BD-DETAIL
      * - ctLogBulkData                  COBOL Name: CT-LOG-BULK-DATA
      *
      * Output :  

      * - rpReportCode                   COBOL Name: RP-REPORT-CODE
      * - rpBdBulkId                     COBOL Name: RP-BD-BULK-ID
      * - sf503BdBulkId                  COBOL Name: SF503-BD-BULK-ID
      * - rpBdMipId                      COBOL Name: RP-BD-MIP-ID
      * - sf503BdMipId                   COBOL Name: SF503-BD-MIP-ID
      * - rpBdPathId                     COBOL Name: RP-BD-PATH-ID
      * - sf503BdPathId                  COBOL Name: SF503-BD-PATH-ID
      * - rpBdStatus                     COBOL Name: RP-BD-STATUS
      * - sf503BdStatus                  COBOL Name: SF503-BD-STATUS
      * - rpBdErrorCode                  COBOL Name: RP-BD-ERROR-CODE
      * - sf503BdErrorCode               COBOL Name: SF503-BD-ERROR-CODE
      * - rpBdJulianDay                  COBOL Name: RP-BD-JULIAN-DAY
      * - sf503BdJulianDay               COBOL Name: SF503-BD-JULIAN-DAY
      * - rpBdTime                       COBOL Name: RP-BD-TIME
      * - sf503BdTime                    COBOL Name: SF503-BD-TIME
      * - rpBdNbr1kSpoolRcds             COBOL Name: RP-BD-NBR-1K-SPOOL-RCDS
      * - sf503BdNbr1kSpoolRcds          COBOL Name: SF503-BD-NBR-1K-SPOOL-RCDS
      * - rpBdNbrBytesTrans              COBOL Name: RP-BD-NBR-BYTES-TRANS
      * - sf503BdNbrBytesTrans           COBOL Name: SF503-BD-NBR-BYTES-TRANS
      * - rpBdNbrBlocksTrans             COBOL Name: RP-BD-NBR-BLOCKS-TRANS
      * - sf503BdNbrBlocksTrans          COBOL Name: SF503-BD-NBR-BLOCKS-TRANS
      * - rpPrintLine                    COBOL Name: RP-PRINT-LINE
      * - rpBdDetail                     COBOL Name: RP-BD-DETAIL
      * - ctRptBdLineNo                  COBOL Name: CT-RPT-BD-LINE-NO
      * - ctLogBulkData                  COBOL Name: CT-LOG-BULK-DATA
      * - rpBdCc                         COBOL Name: RP-BD-CC
      *
      * @throws CFException
      */
      private void formatBulkDataReport() throws Exception {
			// Declare local variables used in the method
			Sf503BdBulkDataTranLog sf503BdBulkDataTranLog = sf50301.getSf503BdBulkDataTranLog();
			int ctRptBdLineNo = 0;
			// End of variable declaration

//  MOVE 'A' TO RP-REPORT-CODE
//  LITERAL_A = 'A'
          rpReportPrintLine.setRpReportCode(CONSTANTS.LITERAL_A);
//  MOVE SF503-BD-BULK-ID TO RP-BD-BULK-ID
          rpBdDetail.setRpBdBulkId(sf503BdBulkDataTranLog.getSf503BdBulkId());
  
//  MOVE SF503-BD-MIP-ID TO RP-BD-MIP-ID
          rpBdDetail.setRpBdMipId(sf503BdBulkDataTranLog.getSf503BdMipId());
  
//  MOVE SF503-BD-PATH-ID TO RP-BD-PATH-ID
          rpBdDetail.setRpBdPathId(sf503BdBulkDataTranLog.getSf503BdPathId());
  
//  MOVE SF503-BD-STATUS TO RP-BD-STATUS
          rpBdDetail.setRpBdStatus(sf503BdBulkDataTranLog.getSf503BdStatus());
  
//  MOVE SF503-BD-ERROR-CODE TO RP-BD-ERROR-CODE
          rpBdDetail.setRpBdErrorCode(sf503BdBulkDataTranLog.getSf503BdErrorCode());
  
//  MOVE SF503-BD-JULIAN-DAY TO RP-BD-JULIAN-DAY
          rpBdDetail.setRpBdJulianDay(sf503BdBulkDataTranLog.getSf503BdJulianDay());
  
//  MOVE SF503-BD-TIME TO RP-BD-TIME
          rpBdDetail.setRpBdTime(sf503BdBulkDataTranLog.getSf503BdTime());
  
//  MOVE SF503-BD-NBR-1K-SPOOL-RCDS TO RP-BD-NBR-1K-SPOOL-RCDS
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          rpBdDetail.setRpBdNbr1kSpoolRcds(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(sf503BdBulkDataTranLog.getSf503BdNbr1kSpoolRcds()).toCharArray()));
  
//  MOVE SF503-BD-NBR-BYTES-TRANS TO RP-BD-NBR-BYTES-TRANS
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          rpBdDetail.setRpBdNbrBytesTrans(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(sf503BdBulkDataTranLog.getSf503BdNbrBytesTrans()).toCharArray()));
  
//  MOVE SF503-BD-NBR-BLOCKS-TRANS TO RP-BD-NBR-BLOCKS-TRANS
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          rpBdDetail.setRpBdNbrBlocksTrans(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(sf503BdBulkDataTranLog.getSf503BdNbrBlocksTrans()).toCharArray()));
  
          ctRptBdLineNo = work.getCtRptBdLineNo();
//  IF CT-RPT-BD-LINE-NO GREATER THAN 56
          if (	( ctRptBdLineNo > 56 )) { 
//  PERFORM 1110-FORMAT-BULK-DATA-HEADER
              formatBulkDataHeader();/*1110-FORMAT-BULK-DATA-HEADER*/
          }
  
//  ELSE
          // MOVE RP-BD-DETAIL TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpBdDetail.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
//  ADD 1 TO CT-RPT-BD-LINE-NO CT-LOG-BULK-DATA
          work.setCtRptBdLineNo(work.getCtRptBdLineNo()+1);
          work.setCtLogBulkData(work.getCtLogBulkData()+(long)1);
//  MOVE SPACE TO RP-BD-CC
          rpBdDetail.setRpBdCc(CONSTANTS.SPACE);
      
      }
      /**
      * formatBulkDataHeader 
      *   This method is derived from 
  *   COBOL Paragraph - 1110-FORMAT-BULK-DATA-HEADER COBOL Cyclomatic complexity - 1
      * Input  :  

      * - rpHeading1                     COBOL Name: RP-HEADING-1
      * - ctRptBdPageNo                  COBOL Name: CT-RPT-BD-PAGE-NO
      * - rpBdHeading2                   COBOL Name: RP-BD-HEADING-2
      * - rpBdHeading3                   COBOL Name: RP-BD-HEADING-3
      *
      * Output :  

      * - rpH1RptCode                    COBOL Name: RP-H1-RPT-CODE
      * - rpPrintLine                    COBOL Name: RP-PRINT-LINE
      * - rpHeading1                     COBOL Name: RP-HEADING-1
      * - ctRptBdPageNo                  COBOL Name: CT-RPT-BD-PAGE-NO
      * - rpBdH2Pagenumber               COBOL Name: RP-BD-H2-PAGENUMBER
      * - rpBdHeading2                   COBOL Name: RP-BD-HEADING-2
      * - rpBdHeading3                   COBOL Name: RP-BD-HEADING-3
      * - rpBdCc                         COBOL Name: RP-BD-CC
      * - ctRptBdLineNo                  COBOL Name: CT-RPT-BD-LINE-NO
      *
      * @throws CFException
      */
      private void formatBulkDataHeader() throws Exception {
//  MOVE 'AA' TO RP-H1-RPT-CODE
//  LITERAL_AA = 'AA'
          rpHeading1.setRpH1RptCode(CONSTANTS.LITERAL_AA);
          // MOVE RP-HEADING-1 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpHeading1.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
//  ADD 1 TO CT-RPT-BD-PAGE-NO
          work.setCtRptBdPageNo(work.getCtRptBdPageNo()+1);
//  MOVE CT-RPT-BD-PAGE-NO TO RP-BD-H2-PAGENUMBER
//  FORMAT_1059277505 = "ZZZ9"
          rpBdHeading2.setRpBdH2Pagenumber(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(work.getCtRptBdPageNo()).toCharArray()));
          // MOVE RP-BD-HEADING-2 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpBdHeading2.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
//  MOVE RP-BD-HEADING-3 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(work.getRpBdHeading3());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
          // MOVE '0' TO RP-BD-CC
          //  LITERAL_0 = '0'
          rpBdDetail.setRpBdCc(CONSTANTS.LITERAL_0);
//  MOVE 6 TO CT-RPT-BD-LINE-NO
//  LITERAL_6 = 6
          work.setCtRptBdLineNo(6);
      
      }
      /**
      * formatOperatorLogRpt 
      *   This method is derived from 
  *   COBOL Paragraph - 1200-FORMAT-OPERATOR-LOG-RPT COBOL Cyclomatic complexity - 5
      * Input  :  

      * - sf503OpRecordType              COBOL Name: SF503-OP-RECORD-TYPE
      * - sf503SortMipId                 COBOL Name: SF503-SORT-MIP-ID
      * - sf503SortDate                  COBOL Name: SF503-SORT-DATE
      * - waDateMdy                      COBOL Name: WA-DATE-MDY
      * - sf503SortTime                  COBOL Name: SF503-SORT-TIME
      * - sf503OpMsgHdr                  COBOL Name: SF503-OP-MSG-HDR
      * - sf503OpOperatorMessage         COBOL Name: SF503-OP-OPERATOR-MESSAGE
      * - ctRptOpLineNo                  COBOL Name: CT-RPT-OP-LINE-NO
      * - rpOpDetail                     COBOL Name: RP-OP-DETAIL
      * - ctLogOperator                  COBOL Name: CT-LOG-OPERATOR
      * - char9134a300                   COBOL Name: 300-CHAR-9134A
      * - emailRecsWriteCnt400           COBOL Name: 400-EMAIL-RECS-WRITE-CNT
      * - numOne300                      COBOL Name: 300-NUM-ONE
      * - emailRptOpLineNo400            COBOL Name: 400-EMAIL-RPT-OP-LINE-NO
      * - num56300                       COBOL Name: 300-NUM-56
      *
      * Output :  

      * - rpReportCode                   COBOL Name: RP-REPORT-CODE
      * - rpOpRecordType                 COBOL Name: RP-OP-RECORD-TYPE
      * - sf503OpRecordType              COBOL Name: SF503-OP-RECORD-TYPE
      * - rpOpMipId                      COBOL Name: RP-OP-MIP-ID
      * - sf503SortMipId                 COBOL Name: SF503-SORT-MIP-ID
      * - waDateYmd                      COBOL Name: WA-DATE-YMD
      * - sf503SortDate                  COBOL Name: SF503-SORT-DATE
      * - waDateMm                       COBOL Name: WA-DATE-MM
      * - waDateMn                       COBOL Name: WA-DATE-MN
      * - waDateDd                       COBOL Name: WA-DATE-DD
      * - waDateDy                       COBOL Name: WA-DATE-DY
      * - waDateYy                       COBOL Name: WA-DATE-YY
      * - waDateYr                       COBOL Name: WA-DATE-YR
      * - rpOpLogDate                    COBOL Name: RP-OP-LOG-DATE
      * - waDateMdy                      COBOL Name: WA-DATE-MDY
      * - rpOpLogTime                    COBOL Name: RP-OP-LOG-TIME
      * - sf503SortTime                  COBOL Name: SF503-SORT-TIME
      * - rpOpHeader                     COBOL Name: RP-OP-HEADER
      * - sf503OpMsgHdr                  COBOL Name: SF503-OP-MSG-HDR
      * - rpOpDelimiter                  COBOL Name: RP-OP-DELIMITER
      * - rpOpOperatorMessage            COBOL Name: RP-OP-OPERATOR-MESSAGE
      * - sf503OpOperatorMessage         COBOL Name: SF503-OP-OPERATOR-MESSAGE
      * - rpPrintLine                    COBOL Name: RP-PRINT-LINE
      * - rpOpDetail                     COBOL Name: RP-OP-DETAIL
      * - ctRptOpLineNo                  COBOL Name: CT-RPT-OP-LINE-NO
      * - ctLogOperator                  COBOL Name: CT-LOG-OPERATOR
      * - rpOpCc                         COBOL Name: RP-OP-CC
      * - emailRecsWriteCnt400           COBOL Name: 400-EMAIL-RECS-WRITE-CNT
      * - emailRptOpLineNo400            COBOL Name: 400-EMAIL-RPT-OP-LINE-NO
      *
      * @throws CFException
      */
      private void formatOperatorLogRpt() throws Exception {
			// Declare local variables used in the method
			Sf503OpOperatorTranLog sf503OpOperatorTranLog = sf50301.getSf503OpOperatorTranLog();
			Sf503SortFields sf503SortFields = sf50301.getSf503SortFields();
			int ctRptOpLineNo = 0;
			int num56300 = 0;
			short emailRptOpLineNo400 = 0;
			char[] sf503OpOperatorMessage = null;
			char[] char9134a300 = null;
			// End of variable declaration

//  MOVE 'B' TO RP-REPORT-CODE
//  LITERAL_B = 'B'
          rpReportPrintLine.setRpReportCode(CONSTANTS.LITERAL_B);
//  MOVE SF503-OP-RECORD-TYPE TO RP-OP-RECORD-TYPE
          rpOpDetail.setRpOpRecordType(sf503OpOperatorTranLog.getSf503OpRecordType());
  
//  MOVE SF503-SORT-MIP-ID TO RP-OP-MIP-ID
          rpOpDetail.setRpOpMipId(sf503SortFields.getSf503SortMipId());
  
//  MOVE SF503-SORT-DATE TO WA-DATE-YMD
          waDateYmd.setString(sf503SortFields.getSf503SortDate());
  
//  MOVE WA-DATE-MM TO WA-DATE-MN
          waDateMdy.setWaDateMn(waDateYmd.getWaDateMm());
//  MOVE WA-DATE-DD TO WA-DATE-DY
          waDateMdy.setWaDateDy(waDateYmd.getWaDateDd());
//  MOVE WA-DATE-YY TO WA-DATE-YR
          waDateMdy.setWaDateYr(waDateYmd.getWaDateYy());
          // MOVE WA-DATE-MDY TO RP-OP-LOG-DATE
          rpOpDetail.setRpOpLogDate(waDateMdy.toCharArray());
//  MOVE SF503-SORT-TIME TO RP-OP-LOG-TIME
          rpOpDetail.setRpOpLogTime(sf503SortFields.getSf503SortTime());
  
//  MOVE SF503-OP-MSG-HDR TO RP-OP-HEADER
          rpOpDetail.setRpOpHeader(sf503OpOperatorTranLog.getSf503OpMsgHdr());
  
//  MOVE '-' TO RP-OP-DELIMITER
//  LITERAL_MN_ = '-'
          rpOpDetail.setRpOpDelimiter(CONSTANTS.LITERAL_MN_);
//  MOVE SF503-OP-OPERATOR-MESSAGE TO RP-OP-OPERATOR-MESSAGE
          rpOpDetail.setRpOpOperatorMessage(sf503OpOperatorTranLog.getSf503OpOperatorMessage());
  
          ctRptOpLineNo = work.getCtRptOpLineNo();
//  IF CT-RPT-OP-LINE-NO GREATER THAN 56
          if (	( ctRptOpLineNo > 56 )) { 
//  PERFORM 1210-FORMAT-OPERATOR-LOG-HDR
              formatOperatorLogHdr();/*1210-FORMAT-OPERATOR-LOG-HDR*/
          }
  
//  ELSE
          // MOVE RP-OP-DETAIL TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpOpDetail.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
//  ADD 1 TO CT-RPT-OP-LINE-NO CT-LOG-OPERATOR
          work.setCtRptOpLineNo(work.getCtRptOpLineNo()+1);
          work.setCtLogOperator(work.getCtLogOperator()+(long)1);
//  MOVE SPACE TO RP-OP-CC
          rpOpDetail.setRpOpCc(CONSTANTS.SPACE);
          sf503OpOperatorMessage = sf503OpOperatorTranLog.getSf503OpOperatorMessage();
          char9134a300 = work.getChar9134a300();
//  IF SF503-OP-OPERATOR-MESSAGE (23 : 5) EQUAL 300-CHAR-9134A OR SF503-OP-OPERATOR-MESSAGE (30 : 5) EQUAL 300-CHAR-9134A
          if (Field.compareChar(sf503OpOperatorMessage , char9134a300 , ( 22 /*start*/ ), 5 /*left len*/ , 5 /*right len*/) || Field.compareChar(sf503OpOperatorMessage , char9134a300 , ( 29 /*start*/ ), 5 /*left len*/ , 5 /*right len*/)) { 
//  ADD 300-NUM-ONE TO 400-EMAIL-RECS-WRITE-CNT
              work.setEmailRecsWriteCnt400(work.getEmailRecsWriteCnt400()+work.getNumOne300());
              emailRptOpLineNo400 = work.getEmailRptOpLineNo400();
              num56300 = work.getNum56300();
//  IF 400-EMAIL-RPT-OP-LINE-NO GREATER 300-NUM-56
              if (	( emailRptOpLineNo400 > num56300 ) ) { 
//  MOVE SPACES TO RP-REPORT-CODE
                  rpReportPrintLine.setRpReportCode(CONSTANTS.SPACE);
//  PERFORM 1220-FORMAT-EMAIL-OP-LOG-HDR
                  formatEmailOpLogHdr();/*1220-FORMAT-EMAIL-OP-LOG-HDR*/
              }
  
//  MOVE SPACES TO RP-REPORT-CODE
              rpReportPrintLine.setRpReportCode(CONSTANTS.SPACE);
              // MOVE RP-OP-DETAIL TO RP-PRINT-LINE
              rpReportPrintLine.setRpPrintLine(rpOpDetail.toCharArray());
//  PERFORM 8100-WRITE-EMAIL-RECORD
              writeEmailRecord();/*8100-WRITE-EMAIL-RECORD*/
//  ADD 300-NUM-ONE TO 400-EMAIL-RPT-OP-LINE-NO
              work.setEmailRptOpLineNo400( (short) (work.getEmailRptOpLineNo400()+(short) work.getNumOne300()));
          }
  
      
      }
      /**
      * formatOperatorLogHdr 
      *   This method is derived from 
  *   COBOL Paragraph - 1210-FORMAT-OPERATOR-LOG-HDR COBOL Cyclomatic complexity - 1
      * Input  :  

      * - rpHeading1                     COBOL Name: RP-HEADING-1
      * - ctRptOpPageNo                  COBOL Name: CT-RPT-OP-PAGE-NO
      * - rpOpHeading2                   COBOL Name: RP-OP-HEADING-2
      * - rpOpHeading3                   COBOL Name: RP-OP-HEADING-3
      *
      * Output :  

      * - rpH1RptCode                    COBOL Name: RP-H1-RPT-CODE
      * - rpPrintLine                    COBOL Name: RP-PRINT-LINE
      * - rpHeading1                     COBOL Name: RP-HEADING-1
      * - ctRptOpPageNo                  COBOL Name: CT-RPT-OP-PAGE-NO
      * - rpOpH2Pagenumber               COBOL Name: RP-OP-H2-PAGENUMBER
      * - rpOpHeading2                   COBOL Name: RP-OP-HEADING-2
      * - rpOpHeading3                   COBOL Name: RP-OP-HEADING-3
      * - rpOpCc                         COBOL Name: RP-OP-CC
      * - ctRptOpLineNo                  COBOL Name: CT-RPT-OP-LINE-NO
      *
      * @throws CFException
      */
      private void formatOperatorLogHdr() throws Exception {
//  MOVE 'BB' TO RP-H1-RPT-CODE
//  LITERAL_BB = 'BB'
          rpHeading1.setRpH1RptCode(CONSTANTS.LITERAL_BB);
          // MOVE RP-HEADING-1 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpHeading1.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
//  ADD 1 TO CT-RPT-OP-PAGE-NO
          work.setCtRptOpPageNo(work.getCtRptOpPageNo()+1);
//  MOVE CT-RPT-OP-PAGE-NO TO RP-OP-H2-PAGENUMBER
//  FORMAT_1059277505 = "ZZZ9"
          rpOpHeading2.setRpOpH2Pagenumber(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(work.getCtRptOpPageNo()).toCharArray()));
          // MOVE RP-OP-HEADING-2 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpOpHeading2.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
//  MOVE RP-OP-HEADING-3 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(work.getRpOpHeading3());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
          // MOVE '0' TO RP-OP-CC
          //  LITERAL_0 = '0'
          rpOpDetail.setRpOpCc(CONSTANTS.LITERAL_0);
//  MOVE 6 TO CT-RPT-OP-LINE-NO
//  LITERAL_6 = 6
          work.setCtRptOpLineNo(6);
      
      }
      /**
      * formatEmailOpLogHdr 
      *   This method is derived from 
  *   COBOL Paragraph - 1220-FORMAT-EMAIL-OP-LOG-HDR COBOL Cyclomatic complexity - 1
      * Input  :  

      * - charBb300                      COBOL Name: 300-CHAR-BB
      * - rpEmailHeading1200             COBOL Name: 200-RP-EMAIL-HEADING-1
      * - emailRptOpPageNo400            COBOL Name: 400-EMAIL-RPT-OP-PAGE-NO
      * - numOne300                      COBOL Name: 300-NUM-ONE
      * - rpEmailOpHeading2200           COBOL Name: 200-RP-EMAIL-OP-HEADING-2
      * - rpEmailOpHeading3200           COBOL Name: 200-RP-EMAIL-OP-HEADING-3
      * - num6300                        COBOL Name: 300-NUM-6
      *
      * Output :  

      * - rpPrintLine                    COBOL Name: RP-PRINT-LINE
      * - rpH1RptCode1200                COBOL Name: 200-RP-H1-RPT-CODE1
      * - charBb300                      COBOL Name: 300-CHAR-BB
      * - rpEmailHeading1200             COBOL Name: 200-RP-EMAIL-HEADING-1
      * - emailRptOpPageNo400            COBOL Name: 400-EMAIL-RPT-OP-PAGE-NO
      * - rpOpPagenumber1200             COBOL Name: 200-RP-OP-PAGENUMBER1
      * - rpEmailOpHeading2200           COBOL Name: 200-RP-EMAIL-OP-HEADING-2
      * - rpEmailOpHeading3200           COBOL Name: 200-RP-EMAIL-OP-HEADING-3
      * - emailRptOpLineNo400            COBOL Name: 400-EMAIL-RPT-OP-LINE-NO
      * - num6300                        COBOL Name: 300-NUM-6
      *
      * @throws CFException
      */
      private void formatEmailOpLogHdr() throws Exception {
      
// ******************************************************************
// *    1 2 2 0 - F o r m a t - e m a i l - o p - l o g - h d r     *
// ******************************************************************
// *    1. format the header messages.                              *
// ******************************************************************
//  MOVE SPACES TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(CONSTANTS.SPACE_133);
//  PERFORM 8100-WRITE-EMAIL-RECORD
          writeEmailRecord();/*8100-WRITE-EMAIL-RECORD*/
//  MOVE 300-CHAR-BB TO 200-RP-H1-RPT-CODE1
          rpEmailHeading1200.setRpH1RptCode1200(work.getCharBb300());
          // MOVE 200-RP-EMAIL-HEADING-1 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpEmailHeading1200.toCharArray());
//  PERFORM 8100-WRITE-EMAIL-RECORD
          writeEmailRecord();/*8100-WRITE-EMAIL-RECORD*/
//  ADD 300-NUM-ONE TO 400-EMAIL-RPT-OP-PAGE-NO
          work.setEmailRptOpPageNo400( (short) (work.getEmailRptOpPageNo400()+(short) work.getNumOne300()));
//  MOVE 400-EMAIL-RPT-OP-PAGE-NO TO 200-RP-OP-PAGENUMBER1
//  FORMAT_1059277505 = "ZZZ9"
          rpEmailOpHeading2200.setRpOpPagenumber1200(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(work.getEmailRptOpPageNo400()).toCharArray()));
          // MOVE 200-RP-EMAIL-OP-HEADING-2 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpEmailOpHeading2200.toCharArray());
//  PERFORM 8100-WRITE-EMAIL-RECORD
          writeEmailRecord();/*8100-WRITE-EMAIL-RECORD*/
//  MOVE SPACES TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(CONSTANTS.SPACE_133);
//  PERFORM 8100-WRITE-EMAIL-RECORD
          writeEmailRecord();/*8100-WRITE-EMAIL-RECORD*/
//  MOVE 200-RP-EMAIL-OP-HEADING-3 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(pad(133,work.getRpEmailOpHeading3200(),SPACE_CHAR,RIGHT_PAD));
//  PERFORM 8100-WRITE-EMAIL-RECORD
          writeEmailRecord();/*8100-WRITE-EMAIL-RECORD*/
//  MOVE 300-NUM-6 TO 400-EMAIL-RPT-OP-LINE-NO
          work.setEmailRptOpLineNo400( work.getNum6300());
      
      }
      /**
      * formatMipProfileReport 
      *   This method is derived from 
  *   COBOL Paragraph - 1400-FORMAT-MIP-PROFILE-REPORT COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sf503MpLogDate                 COBOL Name: SF503-MP-LOG-DATE
      * - sf503MpLogTime                 COBOL Name: SF503-MP-LOG-TIME
      * - sf503MpMid                     COBOL Name: SF503-MP-MID
      * - sf503MpIssFloorLim2Retail      COBOL Name: SF503-MP-ISS-FLOOR-LIM2-RETAIL
      * - sf503MpIssFloorLim2Travel      COBOL Name: SF503-MP-ISS-FLOOR-LIM2-TRAVEL
      * - sf503MpIssFloorLim2Cash        COBOL Name: SF503-MP-ISS-FLOOR-LIM2-CASH
      * - sf503MpPosRetailLimit          COBOL Name: SF503-MP-POS-RETAIL-LIMIT
      * - sf503MpPosTravelLimit          COBOL Name: SF503-MP-POS-TRAVEL-LIMIT
      * - sf503MpPosCashLimit            COBOL Name: SF503-MP-POS-CASH-LIMIT
      * - sf503MpXCodeLimit              COBOL Name: SF503-MP-X-CODE-LIMIT
      * - sf503MpRclFileInd              COBOL Name: SF503-MP-RCL-FILE-IND
      * - sf503MpNegFileAvailInd         COBOL Name: SF503-MP-NEG-FILE-AVAIL-IND
      * - sf503MpMbrDelayFileInd         COBOL Name: SF503-MP-MBR-DELAY-FILE-IND
      * - sf503MpLocalNegFileInd         COBOL Name: SF503-MP-LOCAL-NEG-FILE-IND
      * - sf503MpIpqTimes                COBOL Name: SF503-MP-IPQ-TIMES
      * - ctRptMpLineNo                  COBOL Name: CT-RPT-MP-LINE-NO
      * - rpMpDetail1                    COBOL Name: RP-MP-DETAIL-1
      * - rpMpDetail2                    COBOL Name: RP-MP-DETAIL-2
      * - rpMpDetail3                    COBOL Name: RP-MP-DETAIL-3
      * - rpMpDetail4                    COBOL Name: RP-MP-DETAIL-4
      * - rpMpDetail5                    COBOL Name: RP-MP-DETAIL-5
      * - rpMpDetail6                    COBOL Name: RP-MP-DETAIL-6
      * - ctLogMipProfile                COBOL Name: CT-LOG-MIP-PROFILE
      *
      * Output :  

      * - rpReportCode                   COBOL Name: RP-REPORT-CODE
      * - rpMpLogDate                    COBOL Name: RP-MP-LOG-DATE
      * - sf503MpLogDate                 COBOL Name: SF503-MP-LOG-DATE
      * - rpMpLogTime                    COBOL Name: RP-MP-LOG-TIME
      * - sf503MpLogTime                 COBOL Name: SF503-MP-LOG-TIME
      * - rpMpMipId                      COBOL Name: RP-MP-MIP-ID
      * - sf503MpMid                     COBOL Name: SF503-MP-MID
      * - rpMpIssFloorLim2Retail         COBOL Name: RP-MP-ISS-FLOOR-LIM2-RETAIL
      * - sf503MpIssFloorLim2Retail      COBOL Name: SF503-MP-ISS-FLOOR-LIM2-RETAIL
      * - rpMpIssFloorLim2Travel         COBOL Name: RP-MP-ISS-FLOOR-LIM2-TRAVEL
      * - sf503MpIssFloorLim2Travel      COBOL Name: SF503-MP-ISS-FLOOR-LIM2-TRAVEL
      * - rpMpIssFloorLim2Cash           COBOL Name: RP-MP-ISS-FLOOR-LIM2-CASH
      * - sf503MpIssFloorLim2Cash        COBOL Name: SF503-MP-ISS-FLOOR-LIM2-CASH
      * - rpMpPosRetailLimit             COBOL Name: RP-MP-POS-RETAIL-LIMIT
      * - sf503MpPosRetailLimit          COBOL Name: SF503-MP-POS-RETAIL-LIMIT
      * - rpMpPosTravelLimit             COBOL Name: RP-MP-POS-TRAVEL-LIMIT
      * - sf503MpPosTravelLimit          COBOL Name: SF503-MP-POS-TRAVEL-LIMIT
      * - rpMpPosCashLimit               COBOL Name: RP-MP-POS-CASH-LIMIT
      * - sf503MpPosCashLimit            COBOL Name: SF503-MP-POS-CASH-LIMIT
      * - rpMpXCodeLimit                 COBOL Name: RP-MP-X-CODE-LIMIT
      * - sf503MpXCodeLimit              COBOL Name: SF503-MP-X-CODE-LIMIT
      * - rpMpRclFileInd                 COBOL Name: RP-MP-RCL-FILE-IND
      * - sf503MpRclFileInd              COBOL Name: SF503-MP-RCL-FILE-IND
      * - rpMpNegFileAvailInd            COBOL Name: RP-MP-NEG-FILE-AVAIL-IND
      * - sf503MpNegFileAvailInd         COBOL Name: SF503-MP-NEG-FILE-AVAIL-IND
      * - rpMpMbrDelayFileInd            COBOL Name: RP-MP-MBR-DELAY-FILE-IND
      * - sf503MpMbrDelayFileInd         COBOL Name: SF503-MP-MBR-DELAY-FILE-IND
      * - rpMpLocalNegFileInd            COBOL Name: RP-MP-LOCAL-NEG-FILE-IND
      * - sf503MpLocalNegFileInd         COBOL Name: SF503-MP-LOCAL-NEG-FILE-IND
      * - rpMpIpq1                       COBOL Name: RP-MP-IPQ1
      * - sf503MpIpqTimes                COBOL Name: SF503-MP-IPQ-TIMES
      * - rpMpIpq2                       COBOL Name: RP-MP-IPQ2
      * - rpMpIpq3                       COBOL Name: RP-MP-IPQ3
      * - rpMpIpq4                       COBOL Name: RP-MP-IPQ4
      * - rpMpIpq5                       COBOL Name: RP-MP-IPQ5
      * - rpMpIpq6                       COBOL Name: RP-MP-IPQ6
      * - rpMpIpq7                       COBOL Name: RP-MP-IPQ7
      * - rpMpIpq8                       COBOL Name: RP-MP-IPQ8
      * - rpMpIpq9                       COBOL Name: RP-MP-IPQ9
      * - rpMpIpq10                      COBOL Name: RP-MP-IPQ10
      * - rpMpIpq11                      COBOL Name: RP-MP-IPQ11
      * - rpMpIpq12                      COBOL Name: RP-MP-IPQ12
      * - rpMpIpq13                      COBOL Name: RP-MP-IPQ13
      * - rpMpIpq14                      COBOL Name: RP-MP-IPQ14
      * - rpMpIpq15                      COBOL Name: RP-MP-IPQ15
      * - rpMpIpq16                      COBOL Name: RP-MP-IPQ16
      * - rpMpIpq17                      COBOL Name: RP-MP-IPQ17
      * - rpMpIpq18                      COBOL Name: RP-MP-IPQ18
      * - rpMpIpq19                      COBOL Name: RP-MP-IPQ19
      * - rpMpIpq20                      COBOL Name: RP-MP-IPQ20
      * - rpPrintLine                    COBOL Name: RP-PRINT-LINE
      * - rpMpDetail1                    COBOL Name: RP-MP-DETAIL-1
      * - rpMpDetail2                    COBOL Name: RP-MP-DETAIL-2
      * - rpMpDetail3                    COBOL Name: RP-MP-DETAIL-3
      * - rpMpDetail4                    COBOL Name: RP-MP-DETAIL-4
      * - rpMpDetail5                    COBOL Name: RP-MP-DETAIL-5
      * - rpMpDetail6                    COBOL Name: RP-MP-DETAIL-6
      * - ctRptMpLineNo                  COBOL Name: CT-RPT-MP-LINE-NO
      * - ctLogMipProfile                COBOL Name: CT-LOG-MIP-PROFILE
      *
      * @throws CFException
      */
      private void formatMipProfileReport() throws Exception {
			// Declare local variables used in the method
			Sf503MpMipProfileLog sf503MpMipProfileLog = sf50301.getSf503MpMipProfileLog();
			Sf503MpMipId sf503MpMipId = sf50301.getSf503MpMipProfileLog().getSf503MpMipId();
			int ctRptMpLineNo = 0;
			// End of variable declaration

//  MOVE 'D' TO RP-REPORT-CODE
//  LITERAL_D = 'D'
          rpReportPrintLine.setRpReportCode(CONSTANTS.LITERAL_D);
//  MOVE SF503-MP-LOG-DATE TO RP-MP-LOG-DATE
          rpMpDetail1.setRpMpLogDate(sf503MpMipProfileLog.getSf503MpLogDate());
  
//  MOVE SF503-MP-LOG-TIME TO RP-MP-LOG-TIME
          rpMpDetail1.setRpMpLogTime(sf503MpMipProfileLog.getSf503MpLogTime());
  
//  MOVE SF503-MP-MID TO RP-MP-MIP-ID
          rpMpDetail1.setRpMpMipId(sf503MpMipId.getSf503MpMid());
  
//  MOVE SF503-MP-ISS-FLOOR-LIM2-RETAIL TO RP-MP-ISS-FLOOR-LIM2-RETAIL
//  FORMAT_1059277505 = "ZZZ9"
          rpMpDetail2.setRpMpIssFloorLim2Retail(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(sf503MpMipProfileLog.getSf503MpIssFloorLim2Retail()).toCharArray()));
  
//  MOVE SF503-MP-ISS-FLOOR-LIM2-TRAVEL TO RP-MP-ISS-FLOOR-LIM2-TRAVEL
//  FORMAT_1059277505 = "ZZZ9"
          rpMpDetail2.setRpMpIssFloorLim2Travel(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(sf503MpMipProfileLog.getSf503MpIssFloorLim2Travel()).toCharArray()));
  
//  MOVE SF503-MP-ISS-FLOOR-LIM2-CASH TO RP-MP-ISS-FLOOR-LIM2-CASH
//  FORMAT_1059277505 = "ZZZ9"
          rpMpDetail2.setRpMpIssFloorLim2Cash(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(sf503MpMipProfileLog.getSf503MpIssFloorLim2Cash()).toCharArray()));
  
//  MOVE SF503-MP-POS-RETAIL-LIMIT TO RP-MP-POS-RETAIL-LIMIT
//  FORMAT_1059277505 = "ZZZ9"
          rpMpDetail2.setRpMpPosRetailLimit(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(sf503MpMipProfileLog.getSf503MpPosRetailLimit()).toCharArray()));
  
//  MOVE SF503-MP-POS-TRAVEL-LIMIT TO RP-MP-POS-TRAVEL-LIMIT
//  FORMAT_1059277505 = "ZZZ9"
          rpMpDetail2.setRpMpPosTravelLimit(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(sf503MpMipProfileLog.getSf503MpPosTravelLimit()).toCharArray()));
  
//  MOVE SF503-MP-POS-CASH-LIMIT TO RP-MP-POS-CASH-LIMIT
//  FORMAT_1059277505 = "ZZZ9"
          rpMpDetail2.setRpMpPosCashLimit(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(sf503MpMipProfileLog.getSf503MpPosCashLimit()).toCharArray()));
  
//  MOVE SF503-MP-X-CODE-LIMIT TO RP-MP-X-CODE-LIMIT
//  FORMAT_1059277505 = "ZZZ9"
          rpMpDetail2.setRpMpXCodeLimit(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(sf503MpMipProfileLog.getSf503MpXCodeLimit()).toCharArray()));
  
//  MOVE SF503-MP-RCL-FILE-IND TO RP-MP-RCL-FILE-IND
          rpMpDetail1.setRpMpRclFileInd(sf503MpMipProfileLog.getSf503MpRclFileInd());
  
//  MOVE SF503-MP-NEG-FILE-AVAIL-IND TO RP-MP-NEG-FILE-AVAIL-IND
          rpMpDetail1.setRpMpNegFileAvailInd(sf503MpMipProfileLog.getSf503MpNegFileAvailInd());
  
//  MOVE SF503-MP-MBR-DELAY-FILE-IND TO RP-MP-MBR-DELAY-FILE-IND
          rpMpDetail1.setRpMpMbrDelayFileInd(sf503MpMipProfileLog.getSf503MpMbrDelayFileInd());
  
//  MOVE SF503-MP-LOCAL-NEG-FILE-IND TO RP-MP-LOCAL-NEG-FILE-IND
          rpMpDetail1.setRpMpLocalNegFileInd(sf503MpMipProfileLog.getSf503MpLocalNegFileInd());
  
//  MOVE SF503-MP-IPQ-TIMES (1) TO RP-MP-IPQ1
//  FORMAT_1059277505 = "ZZZ9"
          rpMpDetail4.setRpMpIpq1(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(sf50301.getSf503MpMipProfileLog().getSf503MpIpqTimes(0)).toCharArray()));
//  MOVE SF503-MP-IPQ-TIMES (2) TO RP-MP-IPQ2
//  FORMAT_1059277505 = "ZZZ9"
          rpMpDetail4.setRpMpIpq2(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(sf50301.getSf503MpMipProfileLog().getSf503MpIpqTimes(1)).toCharArray()));
//  MOVE SF503-MP-IPQ-TIMES (3) TO RP-MP-IPQ3
//  FORMAT_1059277505 = "ZZZ9"
          rpMpDetail4.setRpMpIpq3(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(sf50301.getSf503MpMipProfileLog().getSf503MpIpqTimes(2)).toCharArray()));
//  MOVE SF503-MP-IPQ-TIMES (4) TO RP-MP-IPQ4
//  FORMAT_1059277505 = "ZZZ9"
          rpMpDetail4.setRpMpIpq4(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(sf50301.getSf503MpMipProfileLog().getSf503MpIpqTimes(3)).toCharArray()));
//  MOVE SF503-MP-IPQ-TIMES (5) TO RP-MP-IPQ5
//  FORMAT_1059277505 = "ZZZ9"
          rpMpDetail4.setRpMpIpq5(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(sf50301.getSf503MpMipProfileLog().getSf503MpIpqTimes(4)).toCharArray()));
//  MOVE SF503-MP-IPQ-TIMES (6) TO RP-MP-IPQ6
//  FORMAT_1059277505 = "ZZZ9"
          rpMpDetail4.setRpMpIpq6(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(sf50301.getSf503MpMipProfileLog().getSf503MpIpqTimes(5)).toCharArray()));
//  MOVE SF503-MP-IPQ-TIMES (7) TO RP-MP-IPQ7
//  FORMAT_1059277505 = "ZZZ9"
          rpMpDetail4.setRpMpIpq7(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(sf50301.getSf503MpMipProfileLog().getSf503MpIpqTimes(6)).toCharArray()));
//  MOVE SF503-MP-IPQ-TIMES (8) TO RP-MP-IPQ8
//  FORMAT_1059277505 = "ZZZ9"
          rpMpDetail5.setRpMpIpq8(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(sf50301.getSf503MpMipProfileLog().getSf503MpIpqTimes(7)).toCharArray()));
//  MOVE SF503-MP-IPQ-TIMES (9) TO RP-MP-IPQ9
//  FORMAT_1059277505 = "ZZZ9"
          rpMpDetail5.setRpMpIpq9(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(sf50301.getSf503MpMipProfileLog().getSf503MpIpqTimes(8)).toCharArray()));
//  MOVE SF503-MP-IPQ-TIMES (10) TO RP-MP-IPQ10
//  FORMAT_1059277505 = "ZZZ9"
          rpMpDetail5.setRpMpIpq10(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(sf50301.getSf503MpMipProfileLog().getSf503MpIpqTimes(9)).toCharArray()));
//  MOVE SF503-MP-IPQ-TIMES (11) TO RP-MP-IPQ11
//  FORMAT_1059277505 = "ZZZ9"
          rpMpDetail5.setRpMpIpq11(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(sf50301.getSf503MpMipProfileLog().getSf503MpIpqTimes(10)).toCharArray()));
//  MOVE SF503-MP-IPQ-TIMES (12) TO RP-MP-IPQ12
//  FORMAT_1059277505 = "ZZZ9"
          rpMpDetail5.setRpMpIpq12(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(sf50301.getSf503MpMipProfileLog().getSf503MpIpqTimes(11)).toCharArray()));
//  MOVE SF503-MP-IPQ-TIMES (13) TO RP-MP-IPQ13
//  FORMAT_1059277505 = "ZZZ9"
          rpMpDetail5.setRpMpIpq13(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(sf50301.getSf503MpMipProfileLog().getSf503MpIpqTimes(12)).toCharArray()));
//  MOVE SF503-MP-IPQ-TIMES (14) TO RP-MP-IPQ14
//  FORMAT_1059277505 = "ZZZ9"
          rpMpDetail5.setRpMpIpq14(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(sf50301.getSf503MpMipProfileLog().getSf503MpIpqTimes(13)).toCharArray()));
//  MOVE SF503-MP-IPQ-TIMES (15) TO RP-MP-IPQ15
//  FORMAT_1059277505 = "ZZZ9"
          rpMpDetail6.setRpMpIpq15(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(sf50301.getSf503MpMipProfileLog().getSf503MpIpqTimes(14)).toCharArray()));
//  MOVE SF503-MP-IPQ-TIMES (16) TO RP-MP-IPQ16
//  FORMAT_1059277505 = "ZZZ9"
          rpMpDetail6.setRpMpIpq16(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(sf50301.getSf503MpMipProfileLog().getSf503MpIpqTimes(15)).toCharArray()));
//  MOVE SF503-MP-IPQ-TIMES (17) TO RP-MP-IPQ17
//  FORMAT_1059277505 = "ZZZ9"
          rpMpDetail6.setRpMpIpq17(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(sf50301.getSf503MpMipProfileLog().getSf503MpIpqTimes(16)).toCharArray()));
//  MOVE SF503-MP-IPQ-TIMES (18) TO RP-MP-IPQ18
//  FORMAT_1059277505 = "ZZZ9"
          rpMpDetail6.setRpMpIpq18(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(sf50301.getSf503MpMipProfileLog().getSf503MpIpqTimes(17)).toCharArray()));
//  MOVE SF503-MP-IPQ-TIMES (19) TO RP-MP-IPQ19
//  FORMAT_1059277505 = "ZZZ9"
          rpMpDetail6.setRpMpIpq19(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(sf50301.getSf503MpMipProfileLog().getSf503MpIpqTimes(18)).toCharArray()));
//  MOVE SF503-MP-IPQ-TIMES (20) TO RP-MP-IPQ20
//  FORMAT_1059277505 = "ZZZ9"
          rpMpDetail6.setRpMpIpq20(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(sf50301.getSf503MpMipProfileLog().getSf503MpIpqTimes(19)).toCharArray()));
          ctRptMpLineNo = work.getCtRptMpLineNo();
//  IF CT-RPT-MP-LINE-NO GREATER THAN 56
          if (	( ctRptMpLineNo > 56 )) { 
//  PERFORM 1410-FORMAT-MIP-PROFILE-HDR
              formatMipProfileHdr();/*1410-FORMAT-MIP-PROFILE-HDR*/
          }
  
//  ELSE
          // MOVE RP-MP-DETAIL-1 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpMpDetail1.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
          // MOVE RP-MP-DETAIL-2 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpMpDetail2.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
//  MOVE RP-MP-DETAIL-3 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(work.getRpMpDetail3());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
          // MOVE RP-MP-DETAIL-4 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpMpDetail4.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
          // MOVE RP-MP-DETAIL-5 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpMpDetail5.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
          // MOVE RP-MP-DETAIL-6 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpMpDetail6.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
//  ADD 7 TO CT-RPT-MP-LINE-NO
          work.setCtRptMpLineNo(work.getCtRptMpLineNo()+7);
//  ADD 1 TO CT-LOG-MIP-PROFILE
          work.setCtLogMipProfile(work.getCtLogMipProfile()+(long)1);
      
      }
      /**
      * formatMipProfileHdr 
      *   This method is derived from 
  *   COBOL Paragraph - 1410-FORMAT-MIP-PROFILE-HDR COBOL Cyclomatic complexity - 1
      * Input  :  

      * - rpHeading1                     COBOL Name: RP-HEADING-1
      * - ctRptMpPageNo                  COBOL Name: CT-RPT-MP-PAGE-NO
      * - rpMpHeading2                   COBOL Name: RP-MP-HEADING-2
      *
      * Output :  

      * - rpH1RptCode                    COBOL Name: RP-H1-RPT-CODE
      * - rpPrintLine                    COBOL Name: RP-PRINT-LINE
      * - rpHeading1                     COBOL Name: RP-HEADING-1
      * - ctRptMpPageNo                  COBOL Name: CT-RPT-MP-PAGE-NO
      * - rpMpH2Pagenumber               COBOL Name: RP-MP-H2-PAGENUMBER
      * - rpMpHeading2                   COBOL Name: RP-MP-HEADING-2
      * - ctRptMpLineNo                  COBOL Name: CT-RPT-MP-LINE-NO
      *
      * @throws CFException
      */
      private void formatMipProfileHdr() throws Exception {
//  MOVE 'DD' TO RP-H1-RPT-CODE
//  LITERAL_DD = 'DD'
          rpHeading1.setRpH1RptCode(CONSTANTS.LITERAL_DD);
          // MOVE RP-HEADING-1 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpHeading1.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
//  ADD 1 TO CT-RPT-MP-PAGE-NO
          work.setCtRptMpPageNo(work.getCtRptMpPageNo()+1);
//  MOVE CT-RPT-MP-PAGE-NO TO RP-MP-H2-PAGENUMBER
//  FORMAT_1059277505 = "ZZZ9"
          rpMpHeading2.setRpMpH2Pagenumber(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(work.getCtRptMpPageNo()).toCharArray()));
          // MOVE RP-MP-HEADING-2 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpMpHeading2.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
//  MOVE 3 TO CT-RPT-MP-LINE-NO
//  LITERAL_3 = 3
          work.setCtRptMpLineNo(3);
      
      }
      /**
      * formatPosTransLogRpt 
      *   This method is derived from 
  *   COBOL Paragraph - 1500-FORMAT-POS-TRANS-LOG-RPT COBOL Cyclomatic complexity - 3
      * Input  :  

      * - sf503PsRecordType              COBOL Name: SF503-PS-RECORD-TYPE
      * - sf503PsReferenceNbr            COBOL Name: SF503-PS-REFERENCE-NBR
      * - sf503PsTime                    COBOL Name: SF503-PS-TIME
      * - waTimeHmsh                     COBOL Name: WA-TIME-HMSH
      * - sf503PsTransDate               COBOL Name: SF503-PS-TRANS-DATE
      * - waDateMdy                      COBOL Name: WA-DATE-MDY
      * - sf503PsFloorLimInd             COBOL Name: SF503-PS-FLOOR-LIM-IND
      * - sf503PsFloorLimAmt             COBOL Name: SF503-PS-FLOOR-LIM-AMT
      * - sf503PsPosResponse             COBOL Name: SF503-PS-POS-RESPONSE
      * - sf503PsRejectReason            COBOL Name: SF503-PS-REJECT-REASON
      * - sf503PsInasTransCode           COBOL Name: SF503-PS-INAS-TRANS-CODE
      * - sf503PsInasResponse            COBOL Name: SF503-PS-INAS-RESPONSE
      * - sf503PsAuthorizationCode       COBOL Name: SF503-PS-AUTHORIZATION-CODE
      * - sf503PsIcaNumber               COBOL Name: SF503-PS-ICA-NUMBER
      * - sf503PsTerminalId              COBOL Name: SF503-PS-TERMINAL-ID
      * - sf503PsCardholderNbr           COBOL Name: SF503-PS-CARDHOLDER-NBR
      * - sf503PsExpirationDate          COBOL Name: SF503-PS-EXPIRATION-DATE
      * - sf503PsTransAmountX            COBOL Name: SF503-PS-TRANS-AMOUNT-X
      * - sf503PsTransAmount             COBOL Name: SF503-PS-TRANS-AMOUNT
      * - sf503PsMagneticStripeInd       COBOL Name: SF503-PS-MAGNETIC-STRIPE-IND
      * - sf503PsMessageStatus           COBOL Name: SF503-PS-MESSAGE-STATUS
      * - sf503PsNetworkType             COBOL Name: SF503-PS-NETWORK-TYPE
      * - sf503PsQueueIdInputPort        COBOL Name: SF503-PS-QUEUE-ID-INPUT-PORT
      * - sf503PsTimeInSystemHh          COBOL Name: SF503-PS-TIME-IN-SYSTEM-HH
      * - sf503PsTimeInSystemMm          COBOL Name: SF503-PS-TIME-IN-SYSTEM-MM
      * - sf503PsTimeInSystemSs          COBOL Name: SF503-PS-TIME-IN-SYSTEM-SS
      * - sf503PsTerminalAuthCode        COBOL Name: SF503-PS-TERMINAL-AUTH-CODE
      * - ctRptPsLineNo                  COBOL Name: CT-RPT-PS-LINE-NO
      * - rpPsDetail                     COBOL Name: RP-PS-DETAIL
      * - ctLogPos                       COBOL Name: CT-LOG-POS
      *
      * Output :  

      * - rpReportCode                   COBOL Name: RP-REPORT-CODE
      * - rpPsDCc                        COBOL Name: RP-PS-D-CC
      * - rpPsRecordType                 COBOL Name: RP-PS-RECORD-TYPE
      * - sf503PsRecordType              COBOL Name: SF503-PS-RECORD-TYPE
      * - rpPsReferenceNbr               COBOL Name: RP-PS-REFERENCE-NBR
      * - sf503PsReferenceNbr            COBOL Name: SF503-PS-REFERENCE-NBR
      * - waTime                         COBOL Name: WA-TIME
      * - sf503PsTime                    COBOL Name: SF503-PS-TIME
      * - waTimeHours                    COBOL Name: WA-TIME-HOURS
      * - waTimeHh                       COBOL Name: WA-TIME-HH
      * - waTimeMinutes                  COBOL Name: WA-TIME-MINUTES
      * - waTimeMm                       COBOL Name: WA-TIME-MM
      * - waTimeSeconds                  COBOL Name: WA-TIME-SECONDS
      * - waTimeSs                       COBOL Name: WA-TIME-SS
      * - rpPsTime                       COBOL Name: RP-PS-TIME
      * - waTimeHmsh                     COBOL Name: WA-TIME-HMSH
      * - waDate                         COBOL Name: WA-DATE
      * - sf503PsTransDate               COBOL Name: SF503-PS-TRANS-DATE
      * - waDateMonth                    COBOL Name: WA-DATE-MONTH
      * - waDateMn                       COBOL Name: WA-DATE-MN
      * - waDateDay                      COBOL Name: WA-DATE-DAY
      * - waDateDy                       COBOL Name: WA-DATE-DY
      * - waDateYear                     COBOL Name: WA-DATE-YEAR
      * - waDateYr                       COBOL Name: WA-DATE-YR
      * - rpPsTransDate                  COBOL Name: RP-PS-TRANS-DATE
      * - waDateMdy                      COBOL Name: WA-DATE-MDY
      * - rpPsFloorLimInd                COBOL Name: RP-PS-FLOOR-LIM-IND
      * - sf503PsFloorLimInd             COBOL Name: SF503-PS-FLOOR-LIM-IND
      * - rpPsFloorLimAmt                COBOL Name: RP-PS-FLOOR-LIM-AMT
      * - sf503PsFloorLimAmt             COBOL Name: SF503-PS-FLOOR-LIM-AMT
      * - rpPsPosResponse                COBOL Name: RP-PS-POS-RESPONSE
      * - sf503PsPosResponse             COBOL Name: SF503-PS-POS-RESPONSE
      * - rpPsRejectReason               COBOL Name: RP-PS-REJECT-REASON
      * - sf503PsRejectReason            COBOL Name: SF503-PS-REJECT-REASON
      * - rpPsInasTransCode              COBOL Name: RP-PS-INAS-TRANS-CODE
      * - sf503PsInasTransCode           COBOL Name: SF503-PS-INAS-TRANS-CODE
      * - rpPsInasResponse               COBOL Name: RP-PS-INAS-RESPONSE
      * - sf503PsInasResponse            COBOL Name: SF503-PS-INAS-RESPONSE
      * - rpPsAuthorizationCode          COBOL Name: RP-PS-AUTHORIZATION-CODE
      * - sf503PsAuthorizationCode       COBOL Name: SF503-PS-AUTHORIZATION-CODE
      * - rpPsIcaNumber                  COBOL Name: RP-PS-ICA-NUMBER
      * - sf503PsIcaNumber               COBOL Name: SF503-PS-ICA-NUMBER
      * - rpPsTerminalId                 COBOL Name: RP-PS-TERMINAL-ID
      * - sf503PsTerminalId              COBOL Name: SF503-PS-TERMINAL-ID
      * - rpPsCardholderNbr              COBOL Name: RP-PS-CARDHOLDER-NBR
      * - sf503PsCardholderNbr           COBOL Name: SF503-PS-CARDHOLDER-NBR
      * - rpPsExpirationDate             COBOL Name: RP-PS-EXPIRATION-DATE
      * - sf503PsExpirationDate          COBOL Name: SF503-PS-EXPIRATION-DATE
      * - rpPsTransAmount                COBOL Name: RP-PS-TRANS-AMOUNT
      * - sf503PsTransAmount             COBOL Name: SF503-PS-TRANS-AMOUNT
      * - rpPsTransAmountX               COBOL Name: RP-PS-TRANS-AMOUNT-X
      * - sf503PsTransAmountX            COBOL Name: SF503-PS-TRANS-AMOUNT-X
      * - rpPsMagneticStripeInd          COBOL Name: RP-PS-MAGNETIC-STRIPE-IND
      * - sf503PsMagneticStripeInd       COBOL Name: SF503-PS-MAGNETIC-STRIPE-IND
      * - rpPsMessageStatus              COBOL Name: RP-PS-MESSAGE-STATUS
      * - sf503PsMessageStatus           COBOL Name: SF503-PS-MESSAGE-STATUS
      * - rpPsNetworkType                COBOL Name: RP-PS-NETWORK-TYPE
      * - sf503PsNetworkType             COBOL Name: SF503-PS-NETWORK-TYPE
      * - rpPsQueueIdInputPort           COBOL Name: RP-PS-QUEUE-ID-INPUT-PORT
      * - sf503PsQueueIdInputPort        COBOL Name: SF503-PS-QUEUE-ID-INPUT-PORT
      * - rpPsTimeInSystemHh             COBOL Name: RP-PS-TIME-IN-SYSTEM-HH
      * - sf503PsTimeInSystemHh          COBOL Name: SF503-PS-TIME-IN-SYSTEM-HH
      * - rpPsTimeInSystemMm             COBOL Name: RP-PS-TIME-IN-SYSTEM-MM
      * - sf503PsTimeInSystemMm          COBOL Name: SF503-PS-TIME-IN-SYSTEM-MM
      * - rpPsTimeInSystemSs             COBOL Name: RP-PS-TIME-IN-SYSTEM-SS
      * - sf503PsTimeInSystemSs          COBOL Name: SF503-PS-TIME-IN-SYSTEM-SS
      * - rpPsTerminalAuthCode           COBOL Name: RP-PS-TERMINAL-AUTH-CODE
      * - sf503PsTerminalAuthCode        COBOL Name: SF503-PS-TERMINAL-AUTH-CODE
      * - rpPrintLine                    COBOL Name: RP-PRINT-LINE
      * - rpPsDetail                     COBOL Name: RP-PS-DETAIL
      * - ctRptPsLineNo                  COBOL Name: CT-RPT-PS-LINE-NO
      * - ctLogPos                       COBOL Name: CT-LOG-POS
      *
      * @throws CFException
      */
      private void formatPosTransLogRpt() throws Exception {
			// Declare local variables used in the method
			Sf503PsPosTranLog sf503PsPosTranLog = sf50301.getSf503PsPosTranLog();
			Sf503PsTransAmountX sf503PsTransAmountX = sf50301.getSf503PsPosTranLog().getSf503PsTransAmountX();
			RpPsTransAmountX rpPsTransAmountX = rpPsDetail.getRpPsTransAmountX();
			Sf503PsTimeInSystem sf503PsTimeInSystem = sf50301.getSf503PsPosTranLog().getSf503PsTimeInSystem();
			int ctRptPsLineNo = 0;
			// End of variable declaration

//  MOVE 'E' TO RP-REPORT-CODE
//  LITERAL_E = 'E'
          rpReportPrintLine.setRpReportCode(CONSTANTS.LITERAL_E);
//  MOVE SPACE TO RP-PS-D-CC
          rpPsDetail.setRpPsDCc(CONSTANTS.SPACE);
//  MOVE SF503-PS-RECORD-TYPE TO RP-PS-RECORD-TYPE
          rpPsDetail.setRpPsRecordType(sf503PsPosTranLog.getSf503PsRecordType());
  
//  MOVE SF503-PS-REFERENCE-NBR TO RP-PS-REFERENCE-NBR
          rpPsDetail.setRpPsReferenceNbr(sf503PsPosTranLog.getSf503PsReferenceNbr());
  
//  MOVE SF503-PS-TIME TO WA-TIME
          waTime.setString(sf503PsPosTranLog.getSf503PsTime());
  
//  MOVE WA-TIME-HOURS TO WA-TIME-HH
          waTimeHmsh.setWaTimeHh(waTime.getWaTimeHours());
//  MOVE WA-TIME-MINUTES TO WA-TIME-MM
          waTimeHmsh.setWaTimeMm(waTime.getWaTimeMinutes());
//  MOVE WA-TIME-SECONDS TO WA-TIME-SS
          waTimeHmsh.setWaTimeSs(waTime.getWaTimeSeconds());
          // MOVE WA-TIME-HMSH TO RP-PS-TIME
          rpPsDetail.setRpPsTime(waTimeHmsh.toCharArray());
//  MOVE SF503-PS-TRANS-DATE TO WA-DATE
          waDate.setString(sf503PsPosTranLog.getSf503PsTransDate());
  
//  MOVE WA-DATE-MONTH TO WA-DATE-MN
          waDateMdy.setWaDateMn(waDate.getWaDateMonth());
//  MOVE WA-DATE-DAY TO WA-DATE-DY
          waDateMdy.setWaDateDy(waDate.getWaDateDay());
//  MOVE WA-DATE-YEAR TO WA-DATE-YR
          waDateMdy.setWaDateYr(waDate.getWaDateYear());
          // MOVE WA-DATE-MDY TO RP-PS-TRANS-DATE
          rpPsDetail.setRpPsTransDate(waDateMdy.toCharArray());
//  MOVE SF503-PS-FLOOR-LIM-IND TO RP-PS-FLOOR-LIM-IND
          rpPsDetail.setRpPsFloorLimInd(sf503PsPosTranLog.getSf503PsFloorLimInd());
  
          // MOVE SF503-PS-FLOOR-LIM-AMT TO RP-PS-FLOOR-LIM-AMT
          rpPsDetail.setRpPsFloorLimAmt(sf50301.getSf503PsPosTranLog().getSf503PsFloorLimAmt());
  
//  MOVE SF503-PS-POS-RESPONSE TO RP-PS-POS-RESPONSE
          rpPsDetail.setRpPsPosResponse(sf503PsPosTranLog.getSf503PsPosResponse());
  
//  MOVE SF503-PS-REJECT-REASON TO RP-PS-REJECT-REASON
          rpPsDetail.setRpPsRejectReason(sf503PsPosTranLog.getSf503PsRejectReason());
  
//  MOVE SF503-PS-INAS-TRANS-CODE TO RP-PS-INAS-TRANS-CODE
          rpPsDetail.setRpPsInasTransCode(sf503PsPosTranLog.getSf503PsInasTransCode());
  
//  MOVE SF503-PS-INAS-RESPONSE TO RP-PS-INAS-RESPONSE
          rpPsDetail.setRpPsInasResponse(sf503PsPosTranLog.getSf503PsInasResponse());
  
//  MOVE SF503-PS-AUTHORIZATION-CODE TO RP-PS-AUTHORIZATION-CODE
          rpPsDetail.setRpPsAuthorizationCode(sf503PsPosTranLog.getSf503PsAuthorizationCode());
  
//  MOVE SF503-PS-ICA-NUMBER TO RP-PS-ICA-NUMBER
          rpPsDetail.setRpPsIcaNumber(sf503PsPosTranLog.getSf503PsIcaNumber());
  
//  MOVE SF503-PS-TERMINAL-ID TO RP-PS-TERMINAL-ID
          rpPsDetail.setRpPsTerminalId(sf503PsPosTranLog.getSf503PsTerminalId());
  
//  MOVE SF503-PS-CARDHOLDER-NBR TO RP-PS-CARDHOLDER-NBR
          rpPsDetail.setRpPsCardholderNbr(sf503PsPosTranLog.getSf503PsCardholderNbr());
  
//  MOVE SF503-PS-EXPIRATION-DATE TO RP-PS-EXPIRATION-DATE
          rpPsDetail.setRpPsExpirationDate(sf503PsPosTranLog.getSf503PsExpirationDate());
  
          sf503PsTransAmountX = sf503PsPosTranLog.getSf503PsTransAmountX();
//  IF SF503-PS-TRANS-AMOUNT-X IS NUMERIC
          if (    isNumeric(sf503PsTransAmountX)) { 
              // MOVE SF503-PS-TRANS-AMOUNT TO RP-PS-TRANS-AMOUNT
              //  FORMAT_1287115115 = "ZZZZ9.99"
              rpPsDetail.getRpPsTransAmountX().setRpPsTransAmount(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1287115115,sf50301.getSf503PsPosTranLog().getSf503PsTransAmountX().getSf503PsTransAmount().toPlainString().toCharArray()));
  
          }
  
//  ELSE
          else { 
              // MOVE SF503-PS-TRANS-AMOUNT-X TO RP-PS-TRANS-AMOUNT-X
              rpPsDetail.getRpPsTransAmountX().setString(sf50301.getSf503PsPosTranLog().getSf503PsTransAmountX().getCharArray());
  
          }
//  MOVE SF503-PS-MAGNETIC-STRIPE-IND TO RP-PS-MAGNETIC-STRIPE-IND
          rpPsDetail.setRpPsMagneticStripeInd(sf503PsPosTranLog.getSf503PsMagneticStripeInd());
  
//  MOVE SF503-PS-MESSAGE-STATUS TO RP-PS-MESSAGE-STATUS
          rpPsDetail.setRpPsMessageStatus(sf503PsPosTranLog.getSf503PsMessageStatus());
  
//  MOVE SF503-PS-NETWORK-TYPE TO RP-PS-NETWORK-TYPE
          rpPsDetail.setRpPsNetworkType(sf503PsPosTranLog.getSf503PsNetworkType());
  
//  MOVE SF503-PS-QUEUE-ID-INPUT-PORT TO RP-PS-QUEUE-ID-INPUT-PORT
          rpPsDetail.setRpPsQueueIdInputPort(sf503PsPosTranLog.getSf503PsQueueIdInputPort());
  
//  MOVE SF503-PS-TIME-IN-SYSTEM-HH TO RP-PS-TIME-IN-SYSTEM-HH
          rpPsDetail.setRpPsTimeInSystemHh(sf503PsTimeInSystem.getSf503PsTimeInSystemHh());
  
//  MOVE SF503-PS-TIME-IN-SYSTEM-MM TO RP-PS-TIME-IN-SYSTEM-MM
          rpPsDetail.setRpPsTimeInSystemMm(sf503PsTimeInSystem.getSf503PsTimeInSystemMm());
  
//  MOVE SF503-PS-TIME-IN-SYSTEM-SS TO RP-PS-TIME-IN-SYSTEM-SS
          rpPsDetail.setRpPsTimeInSystemSs(sf503PsTimeInSystem.getSf503PsTimeInSystemSs());
  
//  MOVE SF503-PS-TERMINAL-AUTH-CODE TO RP-PS-TERMINAL-AUTH-CODE
          rpPsDetail.setRpPsTerminalAuthCode(sf503PsPosTranLog.getSf503PsTerminalAuthCode());
  
          ctRptPsLineNo = work.getCtRptPsLineNo();
//  IF CT-RPT-PS-LINE-NO GREATER THAN 56
          if (	( ctRptPsLineNo > 56 )) { 
//  PERFORM 1510-FORMAT-POS-REPORT-HDR
              formatPosReportHdr();/*1510-FORMAT-POS-REPORT-HDR*/
          }
  
//  ELSE
          // MOVE RP-PS-DETAIL TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpPsDetail.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
//  ADD 1 TO CT-RPT-PS-LINE-NO CT-LOG-POS
          work.setCtRptPsLineNo(work.getCtRptPsLineNo()+1);
          work.setCtLogPos(work.getCtLogPos()+(long)1);
      
      }
      /**
      * formatPosReportHdr 
      *   This method is derived from 
  *   COBOL Paragraph - 1510-FORMAT-POS-REPORT-HDR COBOL Cyclomatic complexity - 1
      * Input  :  

      * - rpHeading1                     COBOL Name: RP-HEADING-1
      * - ctRptPsPageNo                  COBOL Name: CT-RPT-PS-PAGE-NO
      * - rpPsHeading2                   COBOL Name: RP-PS-HEADING-2
      * - rpPsHeading3                   COBOL Name: RP-PS-HEADING-3
      * - rpPsHeading4                   COBOL Name: RP-PS-HEADING-4
      *
      * Output :  

      * - rpH1RptCode                    COBOL Name: RP-H1-RPT-CODE
      * - rpPrintLine                    COBOL Name: RP-PRINT-LINE
      * - rpHeading1                     COBOL Name: RP-HEADING-1
      * - ctRptPsPageNo                  COBOL Name: CT-RPT-PS-PAGE-NO
      * - rpPsH2Pagenumber               COBOL Name: RP-PS-H2-PAGENUMBER
      * - rpPsHeading2                   COBOL Name: RP-PS-HEADING-2
      * - rpPsHeading3                   COBOL Name: RP-PS-HEADING-3
      * - rpPsHeading4                   COBOL Name: RP-PS-HEADING-4
      * - rpPsDCc                        COBOL Name: RP-PS-D-CC
      * - ctRptPsLineNo                  COBOL Name: CT-RPT-PS-LINE-NO
      *
      * @throws CFException
      */
      private void formatPosReportHdr() throws Exception {
//  MOVE 'EE' TO RP-H1-RPT-CODE
//  LITERAL_EE = 'EE'
          rpHeading1.setRpH1RptCode(CONSTANTS.LITERAL_EE);
          // MOVE RP-HEADING-1 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpHeading1.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
//  ADD 1 TO CT-RPT-PS-PAGE-NO
          work.setCtRptPsPageNo(work.getCtRptPsPageNo()+1);
//  MOVE CT-RPT-PS-PAGE-NO TO RP-PS-H2-PAGENUMBER
//  FORMAT_1059277505 = "ZZZ9"
          rpPsHeading2.setRpPsH2Pagenumber(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(work.getCtRptPsPageNo()).toCharArray()));
          // MOVE RP-PS-HEADING-2 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpPsHeading2.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
//  MOVE RP-PS-HEADING-3 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(work.getRpPsHeading3());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
//  MOVE RP-PS-HEADING-4 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(work.getRpPsHeading4());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
//  MOVE ZERO TO RP-PS-D-CC
          rpPsDetail.setRpPsDCc(CONSTANTS.ZERO_1);
//  MOVE 7 TO CT-RPT-PS-LINE-NO
//  LITERAL_7 = 7
          work.setCtRptPsLineNo(7);
      
      }
      /**
      * formatTypeIiActivity 
      *   This method is derived from 
  *   COBOL Paragraph - 1600-FORMAT-TYPE-II-ACTIVITY COBOL Cyclomatic complexity - 13
      * Input  :  

      * - firstT2RcdInd                  COBOL Name: FIRST-T2-RCD-IND
      * - sf503SortDate                  COBOL Name: SF503-SORT-DATE
      * - sf503SortMipId                 COBOL Name: SF503-SORT-MIP-ID
      * - sf503T2RecordType              COBOL Name: SF503-T2-RECORD-TYPE
      * - ctC7LogType1                   COBOL Name: CT-C7-LOG-TYPE-1
      * - ctC7LogType2                   COBOL Name: CT-C7-LOG-TYPE-2
      * - ctC7LogType3                   COBOL Name: CT-C7-LOG-TYPE-3
      * - ctC7LogType4                   COBOL Name: CT-C7-LOG-TYPE-4
      * - ctC7LogType5                   COBOL Name: CT-C7-LOG-TYPE-5
      * - ctC7LogType6                   COBOL Name: CT-C7-LOG-TYPE-6
      * - ctC7LogType7                   COBOL Name: CT-C7-LOG-TYPE-7
      * - ctC7LogType8                   COBOL Name: CT-C7-LOG-TYPE-8
      * - ctC7LogType9                   COBOL Name: CT-C7-LOG-TYPE-9
      * - ctC7LogTypeA                   COBOL Name: CT-C7-LOG-TYPE-A
      * - ctC7UndefLogType               COBOL Name: CT-C7-UNDEF-LOG-TYPE
      * - ctLogTypeii                    COBOL Name: CT-LOG-TYPEII
      *
      * Output :  

      * - firstT2RcdInd                  COBOL Name: FIRST-T2-RCD-IND
      * - prevT2SortDate                 COBOL Name: PREV-T2-SORT-DATE
      * - sf503SortDate                  COBOL Name: SF503-SORT-DATE
      * - prevT2SortMipId                COBOL Name: PREV-T2-SORT-MIP-ID
      * - sf503SortMipId                 COBOL Name: SF503-SORT-MIP-ID
      * - ctC7LogType1                   COBOL Name: CT-C7-LOG-TYPE-1
      * - ctC7LogType2                   COBOL Name: CT-C7-LOG-TYPE-2
      * - ctC7LogType3                   COBOL Name: CT-C7-LOG-TYPE-3
      * - ctC7LogType4                   COBOL Name: CT-C7-LOG-TYPE-4
      * - ctC7LogType5                   COBOL Name: CT-C7-LOG-TYPE-5
      * - ctC7LogType6                   COBOL Name: CT-C7-LOG-TYPE-6
      * - ctC7LogType7                   COBOL Name: CT-C7-LOG-TYPE-7
      * - ctC7LogType8                   COBOL Name: CT-C7-LOG-TYPE-8
      * - ctC7LogType9                   COBOL Name: CT-C7-LOG-TYPE-9
      * - ctC7LogTypeA                   COBOL Name: CT-C7-LOG-TYPE-A
      * - ctC7UndefLogType               COBOL Name: CT-C7-UNDEF-LOG-TYPE
      * - ctLogTypeii                    COBOL Name: CT-LOG-TYPEII
      *
      * @throws CFException
      */
      private void formatTypeIiActivity() throws Exception {
			// Declare local variables used in the method
			Sf503SortFields sf503SortFields = sf50301.getSf503SortFields();
			Sf503TypeIiTranLog sf503TypeIiTranLog = sf50301.getSf503TypeIiTranLog();
			char[] sf503T2RecordType = null;
			char[] sf503SortMipId = null;
			char[] prevT2SortMipId = null;
			// End of variable declaration

//  IF FIRST-T2-RECORD
          if ( work.isFirstT2Record()  ) { 
//  MOVE '1' TO FIRST-T2-RCD-IND
//  LITERAL_1 = '1'
              work.setFirstT2RcdInd(CONSTANTS.LITERAL_1);
              // MOVE SF503-SORT-DATE TO PREV-T2-SORT-DATE
              work.setPrevT2SortDate(sf50301.getSf503SortFields().getSf503SortDate());
  
              // MOVE SF503-SORT-MIP-ID TO PREV-T2-SORT-MIP-ID
              work.setPrevT2SortMipId(sf50301.getSf503SortFields().getSf503SortMipId());
  
          }
//  ELSE
          sf503T2RecordType = sf503TypeIiTranLog.getSf503T2RecordType();
//  IF SF503-T2-RECORD-TYPE = '1'
//  LITERAL_1 = '1'
          if (compareChars(sf503T2RecordType, CONSTANTS.LITERAL_1) == 0) { 
//  ADD 1 TO CT-C7-LOG-TYPE-1
              work.setCtC7LogType1(work.getCtC7LogType1()+(long)1);
          }
  
//  ELSE
          else { 
              sf503T2RecordType = sf503TypeIiTranLog.getSf503T2RecordType();
//  IF SF503-T2-RECORD-TYPE = '2'
//  LITERAL_2 = '2'
              if (compareChars(sf503T2RecordType, CONSTANTS.LITERAL_2) == 0) { 
//  ADD 1 TO CT-C7-LOG-TYPE-2
                  work.setCtC7LogType2(work.getCtC7LogType2()+(long)1);
              }
  
//  ELSE
              else { 
                  sf503T2RecordType = sf503TypeIiTranLog.getSf503T2RecordType();
//  IF SF503-T2-RECORD-TYPE = '3'
//  LITERAL_3 = '3'
                  if (compareChars(sf503T2RecordType, CONSTANTS.LITERAL_3) == 0) { 
//  ADD 1 TO CT-C7-LOG-TYPE-3
                      work.setCtC7LogType3(work.getCtC7LogType3()+(long)1);
                  }
  
//  ELSE
                  else { 
                      sf503T2RecordType = sf503TypeIiTranLog.getSf503T2RecordType();
//  IF SF503-T2-RECORD-TYPE = '4'
//  LITERAL_4 = '4'
                      if (compareChars(sf503T2RecordType, CONSTANTS.LITERAL_4) == 0) { 
//  ADD 1 TO CT-C7-LOG-TYPE-4
                          work.setCtC7LogType4(work.getCtC7LogType4()+(long)1);
                      }
  
//  ELSE
                      else { 
                          sf503T2RecordType = sf503TypeIiTranLog.getSf503T2RecordType();
//  IF SF503-T2-RECORD-TYPE = '5'
//  LITERAL_5 = '5'
                          if (compareChars(sf503T2RecordType, CONSTANTS.LITERAL_5) == 0) { 
//  ADD 1 TO CT-C7-LOG-TYPE-5
                              work.setCtC7LogType5(work.getCtC7LogType5()+(long)1);
                          }
  
//  ELSE
                          else { 
                              sf503T2RecordType = sf503TypeIiTranLog.getSf503T2RecordType();
//  IF SF503-T2-RECORD-TYPE = '6'
//  LITERAL_6 = '6'
                              if (compareChars(sf503T2RecordType, CONSTANTS.LITERAL_6) == 0) { 
//  ADD 1 TO CT-C7-LOG-TYPE-6
                                  work.setCtC7LogType6(work.getCtC7LogType6()+(long)1);
                              }
  
//  ELSE
                              else { 
                                  sf503T2RecordType = sf503TypeIiTranLog.getSf503T2RecordType();
//  IF SF503-T2-RECORD-TYPE = '7'
//  LITERAL_7 = '7'
                                  if (compareChars(sf503T2RecordType, CONSTANTS.LITERAL_7) == 0) { 
//  ADD 1 TO CT-C7-LOG-TYPE-7
                                      work.setCtC7LogType7(work.getCtC7LogType7()+(long)1);
                                  }
  
//  ELSE
                                  else { 
                                      sf503T2RecordType = sf503TypeIiTranLog.getSf503T2RecordType();
//  IF SF503-T2-RECORD-TYPE = '8'
//  LITERAL_8 = '8'
                                      if (compareChars(sf503T2RecordType, CONSTANTS.LITERAL_8) == 0) { 
//  ADD 1 TO CT-C7-LOG-TYPE-8
                                          work.setCtC7LogType8(work.getCtC7LogType8()+(long)1);
                                      }
  
//  ELSE
                                      else { 
                                          sf503T2RecordType = sf503TypeIiTranLog.getSf503T2RecordType();
//  IF SF503-T2-RECORD-TYPE = '9'
//  LITERAL_9 = '9'
                                          if (compareChars(sf503T2RecordType, CONSTANTS.LITERAL_9) == 0) { 
//  ADD 1 TO CT-C7-LOG-TYPE-9
                                              work.setCtC7LogType9(work.getCtC7LogType9()+(long)1);
                                          }
  
//  ELSE
                                          else { 
                                              sf503T2RecordType = sf503TypeIiTranLog.getSf503T2RecordType();
//  IF SF503-T2-RECORD-TYPE = 'A'
//  LITERAL_A = 'A'
                                              if (compareChars(sf503T2RecordType, CONSTANTS.LITERAL_A) == 0) { 
//  ADD 1 TO CT-C7-LOG-TYPE-A
                                                  work.setCtC7LogTypeA(work.getCtC7LogTypeA()+(long)1);
                                              }
  
//  ELSE
                                              else { 
//  ADD 1 TO CT-C7-UNDEF-LOG-TYPE
                                                  work.setCtC7UndefLogType(work.getCtC7UndefLogType()+(long)1);
                                              }
                                          }
                                      }
                                  }
                              }
                          }
                      }
                  }
              }
          }
//  ADD 1 TO CT-LOG-TYPEII
          work.setCtLogTypeii(work.getCtLogTypeii()+(long)1);
//  IF SF503-SORT-MIP-ID = PREV-T2-SORT-MIP-ID
          sf503SortMipId = sf503SortFields.getSf503SortMipId();
          prevT2SortMipId = work.getPrevT2SortMipId();
//  ELSE
          if (		compareChars(sf503SortMipId,prevT2SortMipId) != 0 ) { 
//  PERFORM 1610-FORMAT-TYPE-II-LOG-RPT
              formatTypeIiLogRpt();/*1610-FORMAT-TYPE-II-LOG-RPT*/
              // MOVE SF503-SORT-DATE TO PREV-T2-SORT-DATE
              work.setPrevT2SortDate(sf50301.getSf503SortFields().getSf503SortDate());
  
              // MOVE SF503-SORT-MIP-ID TO PREV-T2-SORT-MIP-ID
              work.setPrevT2SortMipId(sf50301.getSf503SortFields().getSf503SortMipId());
  
          }
  
      
      }
      /**
      * formatTypeIiLogRpt 
      *   This method is derived from 
  *   COBOL Paragraph - 1610-FORMAT-TYPE-II-LOG-RPT COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void formatTypeIiLogRpt() throws Exception {
//  PERFORM 1610-FORMAT-TYPE-II-LOG-RPT-SPLIT0
          formatTypeIiLogRptSplit0();/*1610-FORMAT-TYPE-II-LOG-RPT-SPLIT0*/
//  PERFORM 1610-FORMAT-TYPE-II-LOG-RPT-SPLIT1
          formatTypeIiLogRptSplit1();/*1610-FORMAT-TYPE-II-LOG-RPT-SPLIT1*/
      
      }
      /**
      * formatTypeIiLogRptSplit0 
      *   This method is derived from 
  *   COBOL Paragraph - 1610-FORMAT-TYPE-II-LOG-RPT-SPLIT0 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - rpHeading1                     COBOL Name: RP-HEADING-1
      * - ctRptT2PageNo                  COBOL Name: CT-RPT-T2-PAGE-NO
      * - rpC7Heading2                   COBOL Name: RP-C7-HEADING-2
      * - rpC7Heading3                   COBOL Name: RP-C7-HEADING-3
      * - prevT2SortDate                 COBOL Name: PREV-T2-SORT-DATE
      * - prevT2SortMipId                COBOL Name: PREV-T2-SORT-MIP-ID
      * - rpC7Heading4                   COBOL Name: RP-C7-HEADING-4
      * - rpC7Heading5                   COBOL Name: RP-C7-HEADING-5
      * - rpC7LogDesc1                   COBOL Name: RP-C7-LOG-DESC-1
      * - ctC7LogType1                   COBOL Name: CT-C7-LOG-TYPE-1
      * - rpC7Detail                     COBOL Name: RP-C7-DETAIL
      * - rpC7LogDesc2                   COBOL Name: RP-C7-LOG-DESC-2
      * - ctC7LogType2                   COBOL Name: CT-C7-LOG-TYPE-2
      * - rpC7LogDesc3                   COBOL Name: RP-C7-LOG-DESC-3
      * - ctC7LogType3                   COBOL Name: CT-C7-LOG-TYPE-3
      * - rpC7LogDesc4                   COBOL Name: RP-C7-LOG-DESC-4
      * - ctC7LogType4                   COBOL Name: CT-C7-LOG-TYPE-4
      * - rpC7LogDesc5                   COBOL Name: RP-C7-LOG-DESC-5
      * - ctC7LogType5                   COBOL Name: CT-C7-LOG-TYPE-5
      * - rpC7LogDesc6                   COBOL Name: RP-C7-LOG-DESC-6
      * - ctC7LogType6                   COBOL Name: CT-C7-LOG-TYPE-6
      * - rpC7LogDesc7                   COBOL Name: RP-C7-LOG-DESC-7
      * - ctC7LogType7                   COBOL Name: CT-C7-LOG-TYPE-7
      *
      * Output :  

      * - rpH1RptCode                    COBOL Name: RP-H1-RPT-CODE
      * - rpReportCode                   COBOL Name: RP-REPORT-CODE
      * - rpPrintLine                    COBOL Name: RP-PRINT-LINE
      * - rpHeading1                     COBOL Name: RP-HEADING-1
      * - ctRptT2PageNo                  COBOL Name: CT-RPT-T2-PAGE-NO
      * - rpC7Heading2                   COBOL Name: RP-C7-HEADING-2
      * - rpC7H3Pagenumber               COBOL Name: RP-C7-H3-PAGENUMBER
      * - rpC7Heading3                   COBOL Name: RP-C7-HEADING-3
      * - rpC7H4DtStamp                  COBOL Name: RP-C7-H4-DT-STAMP
      * - prevT2SortDate                 COBOL Name: PREV-T2-SORT-DATE
      * - rpC7H4MipId                    COBOL Name: RP-C7-H4-MIP-ID
      * - prevT2SortMipId                COBOL Name: PREV-T2-SORT-MIP-ID
      * - rpC7Heading4                   COBOL Name: RP-C7-HEADING-4
      * - rpC7Heading5                   COBOL Name: RP-C7-HEADING-5
      * - rpC7DetCc                      COBOL Name: RP-C7-DET-CC
      * - rpC7DetLogType                 COBOL Name: RP-C7-DET-LOG-TYPE
      * - rpC7DetLogDesc                 COBOL Name: RP-C7-DET-LOG-DESC
      * - rpC7LogDesc1                   COBOL Name: RP-C7-LOG-DESC-1
      * - rpC7DetTotal                   COBOL Name: RP-C7-DET-TOTAL
      * - ctC7LogType1                   COBOL Name: CT-C7-LOG-TYPE-1
      * - rpC7Detail                     COBOL Name: RP-C7-DETAIL
      * - rpC7LogDesc2                   COBOL Name: RP-C7-LOG-DESC-2
      * - ctC7LogType2                   COBOL Name: CT-C7-LOG-TYPE-2
      * - rpC7LogDesc3                   COBOL Name: RP-C7-LOG-DESC-3
      * - ctC7LogType3                   COBOL Name: CT-C7-LOG-TYPE-3
      * - rpC7LogDesc4                   COBOL Name: RP-C7-LOG-DESC-4
      * - ctC7LogType4                   COBOL Name: CT-C7-LOG-TYPE-4
      * - rpC7LogDesc5                   COBOL Name: RP-C7-LOG-DESC-5
      * - ctC7LogType5                   COBOL Name: CT-C7-LOG-TYPE-5
      * - rpC7LogDesc6                   COBOL Name: RP-C7-LOG-DESC-6
      * - ctC7LogType6                   COBOL Name: CT-C7-LOG-TYPE-6
      * - rpC7LogDesc7                   COBOL Name: RP-C7-LOG-DESC-7
      * - ctC7LogType7                   COBOL Name: CT-C7-LOG-TYPE-7
      *
      * @throws CFException
      */
      private void formatTypeIiLogRptSplit0() throws Exception {
//  MOVE 'GG' TO RP-H1-RPT-CODE
//  LITERAL_GG = 'GG'
          rpHeading1.setRpH1RptCode(CONSTANTS.LITERAL_GG);
//  MOVE 'G' TO RP-REPORT-CODE
//  LITERAL_G = 'G'
          rpReportPrintLine.setRpReportCode(CONSTANTS.LITERAL_G);
          // MOVE RP-HEADING-1 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpHeading1.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
//  ADD 1 TO CT-RPT-T2-PAGE-NO
          work.setCtRptT2PageNo(work.getCtRptT2PageNo()+1);
//  MOVE RP-C7-HEADING-2 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(pad(133,work.getRpC7Heading2(),SPACE_CHAR,RIGHT_PAD));
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
//  MOVE CT-RPT-T2-PAGE-NO TO RP-C7-H3-PAGENUMBER
//  FORMAT_1059277505 = "ZZZ9"
          rpC7Heading3.setRpC7H3Pagenumber(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(work.getCtRptT2PageNo()).toCharArray()));
          // MOVE RP-C7-HEADING-3 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC7Heading3.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
//  MOVE PREV-T2-SORT-DATE TO RP-C7-H4-DT-STAMP
          rpC7Heading4.setRpC7H4DtStamp(pad(8,work.getPrevT2SortDate(),SPACE_CHAR,RIGHT_PAD));
//  MOVE PREV-T2-SORT-MIP-ID TO RP-C7-H4-MIP-ID
          rpC7Heading4.setRpC7H4MipId(work.getPrevT2SortMipId());
          // MOVE RP-C7-HEADING-4 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC7Heading4.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
//  MOVE RP-C7-HEADING-5 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(work.getRpC7Heading5());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
          // MOVE '0' TO RP-C7-DET-CC
          //  LITERAL_0 = '0'
          rpC7Detail.setRpC7DetCc(CONSTANTS.LITERAL_0);
          // MOVE '1' TO RP-C7-DET-LOG-TYPE
          //  LITERAL_1 = '1'
          rpC7Detail.setRpC7DetLogType(CONSTANTS.LITERAL_1);
//  MOVE RP-C7-LOG-DESC-1 TO RP-C7-DET-LOG-DESC
          rpC7Detail.setRpC7DetLogDesc(work.getRpC7LogDesc1());
//  MOVE CT-C7-LOG-TYPE-1 TO RP-C7-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          rpC7Detail.setRpC7DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(work.getCtC7LogType1()).toCharArray()));
          // MOVE RP-C7-DETAIL TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC7Detail.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
          // MOVE '2' TO RP-C7-DET-LOG-TYPE
          //  LITERAL_2 = '2'
          rpC7Detail.setRpC7DetLogType(CONSTANTS.LITERAL_2);
//  MOVE RP-C7-LOG-DESC-2 TO RP-C7-DET-LOG-DESC
          rpC7Detail.setRpC7DetLogDesc(work.getRpC7LogDesc2());
//  MOVE CT-C7-LOG-TYPE-2 TO RP-C7-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          rpC7Detail.setRpC7DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(work.getCtC7LogType2()).toCharArray()));
          // MOVE RP-C7-DETAIL TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC7Detail.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
          // MOVE '3' TO RP-C7-DET-LOG-TYPE
          //  LITERAL_3 = '3'
          rpC7Detail.setRpC7DetLogType(CONSTANTS.LITERAL_3);
//  MOVE RP-C7-LOG-DESC-3 TO RP-C7-DET-LOG-DESC
          rpC7Detail.setRpC7DetLogDesc(work.getRpC7LogDesc3());
//  MOVE CT-C7-LOG-TYPE-3 TO RP-C7-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          rpC7Detail.setRpC7DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(work.getCtC7LogType3()).toCharArray()));
          // MOVE RP-C7-DETAIL TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC7Detail.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
          // MOVE '4' TO RP-C7-DET-LOG-TYPE
          //  LITERAL_4 = '4'
          rpC7Detail.setRpC7DetLogType(CONSTANTS.LITERAL_4);
//  MOVE RP-C7-LOG-DESC-4 TO RP-C7-DET-LOG-DESC
          rpC7Detail.setRpC7DetLogDesc(work.getRpC7LogDesc4());
//  MOVE CT-C7-LOG-TYPE-4 TO RP-C7-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          rpC7Detail.setRpC7DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(work.getCtC7LogType4()).toCharArray()));
          // MOVE RP-C7-DETAIL TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC7Detail.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
          // MOVE '5' TO RP-C7-DET-LOG-TYPE
          //  LITERAL_5 = '5'
          rpC7Detail.setRpC7DetLogType(CONSTANTS.LITERAL_5);
//  MOVE RP-C7-LOG-DESC-5 TO RP-C7-DET-LOG-DESC
          rpC7Detail.setRpC7DetLogDesc(work.getRpC7LogDesc5());
//  MOVE CT-C7-LOG-TYPE-5 TO RP-C7-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          rpC7Detail.setRpC7DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(work.getCtC7LogType5()).toCharArray()));
          // MOVE RP-C7-DETAIL TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC7Detail.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
          // MOVE '6' TO RP-C7-DET-LOG-TYPE
          //  LITERAL_6 = '6'
          rpC7Detail.setRpC7DetLogType(CONSTANTS.LITERAL_6);
//  MOVE RP-C7-LOG-DESC-6 TO RP-C7-DET-LOG-DESC
          rpC7Detail.setRpC7DetLogDesc(work.getRpC7LogDesc6());
//  MOVE CT-C7-LOG-TYPE-6 TO RP-C7-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          rpC7Detail.setRpC7DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(work.getCtC7LogType6()).toCharArray()));
          // MOVE RP-C7-DETAIL TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC7Detail.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
          // MOVE '7' TO RP-C7-DET-LOG-TYPE
          //  LITERAL_7 = '7'
          rpC7Detail.setRpC7DetLogType(CONSTANTS.LITERAL_7);
//  MOVE RP-C7-LOG-DESC-7 TO RP-C7-DET-LOG-DESC
          rpC7Detail.setRpC7DetLogDesc(work.getRpC7LogDesc7());
//  MOVE CT-C7-LOG-TYPE-7 TO RP-C7-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          rpC7Detail.setRpC7DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(work.getCtC7LogType7()).toCharArray()));
          // MOVE RP-C7-DETAIL TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC7Detail.toCharArray());
      
      }
      /**
      * formatTypeIiLogRptSplit1 
      *   This method is derived from 
  *   COBOL Paragraph - 1610-FORMAT-TYPE-II-LOG-RPT-SPLIT1 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - rpC7LogDesc8                   COBOL Name: RP-C7-LOG-DESC-8
      * - ctC7LogType8                   COBOL Name: CT-C7-LOG-TYPE-8
      * - rpC7Detail                     COBOL Name: RP-C7-DETAIL
      * - rpC7LogDesc9                   COBOL Name: RP-C7-LOG-DESC-9
      * - ctC7LogType9                   COBOL Name: CT-C7-LOG-TYPE-9
      * - rpC7LogDescA                   COBOL Name: RP-C7-LOG-DESC-A
      * - ctC7LogTypeA                   COBOL Name: CT-C7-LOG-TYPE-A
      * - rpUndefLogDesc                 COBOL Name: RP-UNDEF-LOG-DESC
      * - ctC7UndefLogType               COBOL Name: CT-C7-UNDEF-LOG-TYPE
      *
      * Output :  

      * - rpC7DetLogType                 COBOL Name: RP-C7-DET-LOG-TYPE
      * - rpC7DetLogDesc                 COBOL Name: RP-C7-DET-LOG-DESC
      * - rpC7LogDesc8                   COBOL Name: RP-C7-LOG-DESC-8
      * - rpC7DetTotal                   COBOL Name: RP-C7-DET-TOTAL
      * - ctC7LogType8                   COBOL Name: CT-C7-LOG-TYPE-8
      * - rpPrintLine                    COBOL Name: RP-PRINT-LINE
      * - rpC7Detail                     COBOL Name: RP-C7-DETAIL
      * - rpC7LogDesc9                   COBOL Name: RP-C7-LOG-DESC-9
      * - ctC7LogType9                   COBOL Name: CT-C7-LOG-TYPE-9
      * - rpC7LogDescA                   COBOL Name: RP-C7-LOG-DESC-A
      * - ctC7LogTypeA                   COBOL Name: CT-C7-LOG-TYPE-A
      * - rpUndefLogDesc                 COBOL Name: RP-UNDEF-LOG-DESC
      * - ctC7UndefLogType               COBOL Name: CT-C7-UNDEF-LOG-TYPE
      * - ctC7LogType1                   COBOL Name: CT-C7-LOG-TYPE-1
      * - ctC7LogType2                   COBOL Name: CT-C7-LOG-TYPE-2
      * - ctC7LogType3                   COBOL Name: CT-C7-LOG-TYPE-3
      * - ctC7LogType4                   COBOL Name: CT-C7-LOG-TYPE-4
      * - ctC7LogType5                   COBOL Name: CT-C7-LOG-TYPE-5
      * - ctC7LogType6                   COBOL Name: CT-C7-LOG-TYPE-6
      * - ctC7LogType7                   COBOL Name: CT-C7-LOG-TYPE-7
      *
      * @throws CFException
      */
      private void formatTypeIiLogRptSplit1() throws Exception {
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
          // MOVE '8' TO RP-C7-DET-LOG-TYPE
          //  LITERAL_8 = '8'
          rpC7Detail.setRpC7DetLogType(CONSTANTS.LITERAL_8);
//  MOVE RP-C7-LOG-DESC-8 TO RP-C7-DET-LOG-DESC
          rpC7Detail.setRpC7DetLogDesc(work.getRpC7LogDesc8());
//  MOVE CT-C7-LOG-TYPE-8 TO RP-C7-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          rpC7Detail.setRpC7DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(work.getCtC7LogType8()).toCharArray()));
          // MOVE RP-C7-DETAIL TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC7Detail.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
          // MOVE '9' TO RP-C7-DET-LOG-TYPE
          //  LITERAL_9 = '9'
          rpC7Detail.setRpC7DetLogType(CONSTANTS.LITERAL_9);
//  MOVE RP-C7-LOG-DESC-9 TO RP-C7-DET-LOG-DESC
          rpC7Detail.setRpC7DetLogDesc(work.getRpC7LogDesc9());
//  MOVE CT-C7-LOG-TYPE-9 TO RP-C7-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          rpC7Detail.setRpC7DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(work.getCtC7LogType9()).toCharArray()));
          // MOVE RP-C7-DETAIL TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC7Detail.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
//  MOVE 'A' TO RP-C7-DET-LOG-TYPE
//  LITERAL_A = 'A'
          rpC7Detail.setRpC7DetLogType(CONSTANTS.LITERAL_A);
//  MOVE RP-C7-LOG-DESC-A TO RP-C7-DET-LOG-DESC
          rpC7Detail.setRpC7DetLogDesc(work.getRpC7LogDescA());
//  MOVE CT-C7-LOG-TYPE-A TO RP-C7-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          rpC7Detail.setRpC7DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(work.getCtC7LogTypeA()).toCharArray()));
          // MOVE RP-C7-DETAIL TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC7Detail.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
//  MOVE '-' TO RP-C7-DET-LOG-TYPE
//  LITERAL_MN_ = '-'
          rpC7Detail.setRpC7DetLogType(CONSTANTS.LITERAL_MN_);
//  MOVE RP-UNDEF-LOG-DESC TO RP-C7-DET-LOG-DESC
          rpC7Detail.setRpC7DetLogDesc(work.getRpUndefLogDesc());
//  MOVE CT-C7-UNDEF-LOG-TYPE TO RP-C7-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          rpC7Detail.setRpC7DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(work.getCtC7UndefLogType()).toCharArray()));
          // MOVE RP-C7-DETAIL TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC7Detail.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
//  MOVE ZEROS TO CT-C7-LOG-TYPE-1 CT-C7-LOG-TYPE-2 CT-C7-LOG-TYPE-3 CT-C7-LOG-TYPE-4 CT-C7-LOG-TYPE-5 CT-C7-LOG-TYPE-6 CT-C7-LOG-TYPE-7 CT-C7-LOG-TYPE-8 CT-C7-LOG-TYPE-9 CT-C7-LOG-TYPE-A CT-C7-UNDEF-LOG-TYPE
          work.setCtC7LogType1(0);
          work.setCtC7LogType2(0);
          work.setCtC7LogType3(0);
          work.setCtC7LogType4(0);
          work.setCtC7LogType5(0);
          work.setCtC7LogType6(0);
          work.setCtC7LogType7(0);
          work.setCtC7LogType8(0);
          work.setCtC7LogType9(0);
          work.setCtC7LogTypeA(0);
          work.setCtC7UndefLogType(0);
      
      }
      /**
      * formatX92Activity 
      *   This method is derived from 
  *   COBOL Paragraph - 1700-FORMAT-X92-ACTIVITY COBOL Cyclomatic complexity - 29
      * Input  :  

      * - firstX92RcdInd                 COBOL Name: FIRST-X92-RCD-IND
      * - sf503SortDate                  COBOL Name: SF503-SORT-DATE
      * - sf503SortMipId                 COBOL Name: SF503-SORT-MIP-ID
      * - sf503X92RecordType             COBOL Name: SF503-X92-RECORD-TYPE
      * - ctC9LogType1                   COBOL Name: CT-C9-LOG-TYPE-1
      * - ctC9LogType2                   COBOL Name: CT-C9-LOG-TYPE-2
      * - ctC9LogType3                   COBOL Name: CT-C9-LOG-TYPE-3
      * - ctC9LogType4                   COBOL Name: CT-C9-LOG-TYPE-4
      * - ctC9LogType5                   COBOL Name: CT-C9-LOG-TYPE-5
      * - ctC9LogType6                   COBOL Name: CT-C9-LOG-TYPE-6
      * - ctC9LogType7                   COBOL Name: CT-C9-LOG-TYPE-7
      * - ctC9LogType8                   COBOL Name: CT-C9-LOG-TYPE-8
      * - ctC9LogType9                   COBOL Name: CT-C9-LOG-TYPE-9
      * - ctC9LogType10                  COBOL Name: CT-C9-LOG-TYPE-10
      * - ctC9LogType11                  COBOL Name: CT-C9-LOG-TYPE-11
      * - ctC9LogType12                  COBOL Name: CT-C9-LOG-TYPE-12
      * - ctC9LogType13                  COBOL Name: CT-C9-LOG-TYPE-13
      * - ctC9LogType14                  COBOL Name: CT-C9-LOG-TYPE-14
      * - ctC9LogType15                  COBOL Name: CT-C9-LOG-TYPE-15
      * - ctC9LogType16                  COBOL Name: CT-C9-LOG-TYPE-16
      * - ctC9LogType17                  COBOL Name: CT-C9-LOG-TYPE-17
      * - ctC9LogType18                  COBOL Name: CT-C9-LOG-TYPE-18
      * - ctC9LogType19                  COBOL Name: CT-C9-LOG-TYPE-19
      * - ctC9LogType20                  COBOL Name: CT-C9-LOG-TYPE-20
      * - ctC9LogType21                  COBOL Name: CT-C9-LOG-TYPE-21
      * - ctC9LogType22                  COBOL Name: CT-C9-LOG-TYPE-22
      * - ctC9LogType23                  COBOL Name: CT-C9-LOG-TYPE-23
      * - ctC9LogType24                  COBOL Name: CT-C9-LOG-TYPE-24
      * - ctC9LogType25                  COBOL Name: CT-C9-LOG-TYPE-25
      * - ctC9LogType26                  COBOL Name: CT-C9-LOG-TYPE-26
      * - ctC9UndefLogType               COBOL Name: CT-C9-UNDEF-LOG-TYPE
      * - ctLogX92                       COBOL Name: CT-LOG-X92
      *
      * Output :  

      * - firstX92RcdInd                 COBOL Name: FIRST-X92-RCD-IND
      * - prevX92SortDate                COBOL Name: PREV-X92-SORT-DATE
      * - sf503SortDate                  COBOL Name: SF503-SORT-DATE
      * - prevX92SortMipId               COBOL Name: PREV-X92-SORT-MIP-ID
      * - sf503SortMipId                 COBOL Name: SF503-SORT-MIP-ID
      * - ctC9LogType1                   COBOL Name: CT-C9-LOG-TYPE-1
      * - ctC9LogType2                   COBOL Name: CT-C9-LOG-TYPE-2
      * - ctC9LogType3                   COBOL Name: CT-C9-LOG-TYPE-3
      * - ctC9LogType4                   COBOL Name: CT-C9-LOG-TYPE-4
      * - ctC9LogType5                   COBOL Name: CT-C9-LOG-TYPE-5
      * - ctC9LogType6                   COBOL Name: CT-C9-LOG-TYPE-6
      * - ctC9LogType7                   COBOL Name: CT-C9-LOG-TYPE-7
      * - ctC9LogType8                   COBOL Name: CT-C9-LOG-TYPE-8
      * - ctC9LogType9                   COBOL Name: CT-C9-LOG-TYPE-9
      * - ctC9LogType10                  COBOL Name: CT-C9-LOG-TYPE-10
      * - ctC9LogType11                  COBOL Name: CT-C9-LOG-TYPE-11
      * - ctC9LogType12                  COBOL Name: CT-C9-LOG-TYPE-12
      * - ctC9LogType13                  COBOL Name: CT-C9-LOG-TYPE-13
      * - ctC9LogType14                  COBOL Name: CT-C9-LOG-TYPE-14
      * - ctC9LogType15                  COBOL Name: CT-C9-LOG-TYPE-15
      * - ctC9LogType16                  COBOL Name: CT-C9-LOG-TYPE-16
      * - ctC9LogType17                  COBOL Name: CT-C9-LOG-TYPE-17
      * - ctC9LogType18                  COBOL Name: CT-C9-LOG-TYPE-18
      * - ctC9LogType19                  COBOL Name: CT-C9-LOG-TYPE-19
      * - ctC9LogType20                  COBOL Name: CT-C9-LOG-TYPE-20
      * - ctC9LogType21                  COBOL Name: CT-C9-LOG-TYPE-21
      * - ctC9LogType22                  COBOL Name: CT-C9-LOG-TYPE-22
      * - ctC9LogType23                  COBOL Name: CT-C9-LOG-TYPE-23
      * - ctC9LogType24                  COBOL Name: CT-C9-LOG-TYPE-24
      * - ctC9LogType25                  COBOL Name: CT-C9-LOG-TYPE-25
      * - ctC9LogType26                  COBOL Name: CT-C9-LOG-TYPE-26
      * - ctC9UndefLogType               COBOL Name: CT-C9-UNDEF-LOG-TYPE
      * - ctLogX92                       COBOL Name: CT-LOG-X92
      *
      * @throws CFException
      */
      private void formatX92Activity() throws Exception {
			// Declare local variables used in the method
			Sf503SortFields sf503SortFields = sf50301.getSf503SortFields();
			Sf503X92ActivityLog sf503X92ActivityLog = sf50301.getSf503X92ActivityLog();
			char[] sf503X92RecordType = null;
			char[] sf503SortMipId = null;
			char[] prevX92SortMipId = null;
			// End of variable declaration

//  IF FIRST-X92-RECORD
          if ( work.isFirstX92Record()  ) { 
//  MOVE '1' TO FIRST-X92-RCD-IND
//  LITERAL_1 = '1'
              work.setFirstX92RcdInd(CONSTANTS.LITERAL_1);
              // MOVE SF503-SORT-DATE TO PREV-X92-SORT-DATE
              work.setPrevX92SortDate(sf50301.getSf503SortFields().getSf503SortDate());
  
              // MOVE SF503-SORT-MIP-ID TO PREV-X92-SORT-MIP-ID
              work.setPrevX92SortMipId(sf50301.getSf503SortFields().getSf503SortMipId());
  
          }
//  ELSE
          sf503X92RecordType = sf503X92ActivityLog.getSf503X92RecordType();
//  IF SF503-X92-RECORD-TYPE = '01'
//  LITERAL_01 = '01'
          if (		compareChars(sf503X92RecordType,CONSTANTS.LITERAL_01) == 0 ) { 
//  ADD 1 TO CT-C9-LOG-TYPE-1
              work.setCtC9LogType1(work.getCtC9LogType1()+(long)1);
          }
  
//  ELSE
          else { 
              sf503X92RecordType = sf503X92ActivityLog.getSf503X92RecordType();
//  IF SF503-X92-RECORD-TYPE = '02'
//  LITERAL_02 = '02'
              if (		compareChars(sf503X92RecordType,CONSTANTS.LITERAL_02) == 0 ) { 
//  ADD 1 TO CT-C9-LOG-TYPE-2
                  work.setCtC9LogType2(work.getCtC9LogType2()+(long)1);
              }
  
//  ELSE
              else { 
                  sf503X92RecordType = sf503X92ActivityLog.getSf503X92RecordType();
//  IF SF503-X92-RECORD-TYPE = '03'
//  LITERAL_03 = '03'
                  if (		compareChars(sf503X92RecordType,CONSTANTS.LITERAL_03) == 0 ) { 
//  ADD 1 TO CT-C9-LOG-TYPE-3
                      work.setCtC9LogType3(work.getCtC9LogType3()+(long)1);
                  }
  
//  ELSE
                  else { 
                      sf503X92RecordType = sf503X92ActivityLog.getSf503X92RecordType();
//  IF SF503-X92-RECORD-TYPE = '04'
//  LITERAL_04 = '04'
                      if (		compareChars(sf503X92RecordType,CONSTANTS.LITERAL_04) == 0 ) { 
//  ADD 1 TO CT-C9-LOG-TYPE-4
                          work.setCtC9LogType4(work.getCtC9LogType4()+(long)1);
                      }
  
//  ELSE
                      else { 
                          sf503X92RecordType = sf503X92ActivityLog.getSf503X92RecordType();
//  IF SF503-X92-RECORD-TYPE = '05'
//  LITERAL_05 = '05'
                          if (		compareChars(sf503X92RecordType,CONSTANTS.LITERAL_05) == 0 ) { 
//  ADD 1 TO CT-C9-LOG-TYPE-5
                              work.setCtC9LogType5(work.getCtC9LogType5()+(long)1);
                          }
  
//  ELSE
                          else { 
                              sf503X92RecordType = sf503X92ActivityLog.getSf503X92RecordType();
//  IF SF503-X92-RECORD-TYPE = '06'
//  LITERAL_06 = '06'
                              if (		compareChars(sf503X92RecordType,CONSTANTS.LITERAL_06) == 0 ) { 
//  ADD 1 TO CT-C9-LOG-TYPE-6
                                  work.setCtC9LogType6(work.getCtC9LogType6()+(long)1);
                              }
  
//  ELSE
                              else { 
                                  sf503X92RecordType = sf503X92ActivityLog.getSf503X92RecordType();
//  IF SF503-X92-RECORD-TYPE = '07'
//  LITERAL_07 = '07'
                                  if (		compareChars(sf503X92RecordType,CONSTANTS.LITERAL_07) == 0 ) { 
//  ADD 1 TO CT-C9-LOG-TYPE-7
                                      work.setCtC9LogType7(work.getCtC9LogType7()+(long)1);
                                  }
  
//  ELSE
                                  else { 
                                      sf503X92RecordType = sf503X92ActivityLog.getSf503X92RecordType();
//  IF SF503-X92-RECORD-TYPE = '08'
//  LITERAL_08 = '08'
                                      if (		compareChars(sf503X92RecordType,CONSTANTS.LITERAL_08) == 0 ) { 
//  ADD 1 TO CT-C9-LOG-TYPE-8
                                          work.setCtC9LogType8(work.getCtC9LogType8()+(long)1);
                                      }
  
//  ELSE
                                      else { 
                                          sf503X92RecordType = sf503X92ActivityLog.getSf503X92RecordType();
//  IF SF503-X92-RECORD-TYPE = '09'
//  LITERAL_09 = '09'
                                          if (		compareChars(sf503X92RecordType,CONSTANTS.LITERAL_09) == 0 ) { 
//  ADD 1 TO CT-C9-LOG-TYPE-9
                                              work.setCtC9LogType9(work.getCtC9LogType9()+(long)1);
                                          }
  
//  ELSE
                                          else { 
                                              sf503X92RecordType = sf503X92ActivityLog.getSf503X92RecordType();
//  IF SF503-X92-RECORD-TYPE = '10'
//  LITERAL_10 = '10'
                                              if (		compareChars(sf503X92RecordType,CONSTANTS.LITERAL_10) == 0 ) { 
//  ADD 1 TO CT-C9-LOG-TYPE-10
                                                  work.setCtC9LogType10(work.getCtC9LogType10()+(long)1);
                                              }
  
//  ELSE
                                              else { 
                                                  sf503X92RecordType = sf503X92ActivityLog.getSf503X92RecordType();
//  IF SF503-X92-RECORD-TYPE = '11'
//  LITERAL_11 = '11'
                                                  if (		compareChars(sf503X92RecordType,CONSTANTS.LITERAL_11) == 0 ) { 
//  ADD 1 TO CT-C9-LOG-TYPE-11
                                                      work.setCtC9LogType11(work.getCtC9LogType11()+(long)1);
                                                  }
  
//  ELSE
                                                  else { 
                                                      sf503X92RecordType = sf503X92ActivityLog.getSf503X92RecordType();
//  IF SF503-X92-RECORD-TYPE = '12'
//  LITERAL_12 = '12'
                                                      if (		compareChars(sf503X92RecordType,CONSTANTS.LITERAL_12) == 0 ) { 
//  ADD 1 TO CT-C9-LOG-TYPE-12
                                                          work.setCtC9LogType12(work.getCtC9LogType12()+(long)1);
                                                      }
  
//  ELSE
                                                      else { 
                                                          sf503X92RecordType = sf503X92ActivityLog.getSf503X92RecordType();
//  IF SF503-X92-RECORD-TYPE = '13'
//  LITERAL_13 = '13'
                                                          if (		compareChars(sf503X92RecordType,CONSTANTS.LITERAL_13) == 0 ) { 
//  ADD 1 TO CT-C9-LOG-TYPE-13
                                                              work.setCtC9LogType13(work.getCtC9LogType13()+(long)1);
                                                          }
  
//  ELSE
                                                          else { 
                                                              sf503X92RecordType = sf503X92ActivityLog.getSf503X92RecordType();
//  IF SF503-X92-RECORD-TYPE = '14'
//  LITERAL_14 = '14'
                                                              if (		compareChars(sf503X92RecordType,CONSTANTS.LITERAL_14) == 0 ) { 
//  ADD 1 TO CT-C9-LOG-TYPE-14
                                                                  work.setCtC9LogType14(work.getCtC9LogType14()+(long)1);
                                                              }
  
//  ELSE
                                                              else { 
                                                                  sf503X92RecordType = sf503X92ActivityLog.getSf503X92RecordType();
//  IF SF503-X92-RECORD-TYPE = '15'
//  LITERAL_15 = '15'
                                                                  if (		compareChars(sf503X92RecordType,CONSTANTS.LITERAL_15) == 0 ) { 
//  ADD 1 TO CT-C9-LOG-TYPE-15
                                                                      work.setCtC9LogType15(work.getCtC9LogType15()+(long)1);
                                                                  }
  
//  ELSE
                                                                  else { 
                                                                      sf503X92RecordType = sf503X92ActivityLog.getSf503X92RecordType();
//  IF SF503-X92-RECORD-TYPE = '16'
//  LITERAL_16 = '16'
                                                                      if (		compareChars(sf503X92RecordType,CONSTANTS.LITERAL_16) == 0 ) { 
//  ADD 1 TO CT-C9-LOG-TYPE-16
                                                                          work.setCtC9LogType16(work.getCtC9LogType16()+(long)1);
                                                                      }
  
//  ELSE
                                                                      else { 
                                                                          sf503X92RecordType = sf503X92ActivityLog.getSf503X92RecordType();
//  IF SF503-X92-RECORD-TYPE = '17'
//  LITERAL_17 = '17'
                                                                          if (		compareChars(sf503X92RecordType,CONSTANTS.LITERAL_17) == 0 ) { 
//  ADD 1 TO CT-C9-LOG-TYPE-17
                                                                              work.setCtC9LogType17(work.getCtC9LogType17()+(long)1);
                                                                          }
  
//  ELSE
                                                                          else { 
                                                                              sf503X92RecordType = sf503X92ActivityLog.getSf503X92RecordType();
//  IF SF503-X92-RECORD-TYPE = '18'
//  LITERAL_18 = '18'
                                                                              if (		compareChars(sf503X92RecordType,CONSTANTS.LITERAL_18) == 0 ) { 
//  ADD 1 TO CT-C9-LOG-TYPE-18
                                                                                  work.setCtC9LogType18(work.getCtC9LogType18()+(long)1);
                                                                              }
  
//  ELSE
                                                                              else { 
                                                                                  sf503X92RecordType = sf503X92ActivityLog.getSf503X92RecordType();
//  IF SF503-X92-RECORD-TYPE = '19'
//  LITERAL_19 = '19'
                                                                                  if (		compareChars(sf503X92RecordType,CONSTANTS.LITERAL_19) == 0 ) { 
//  ADD 1 TO CT-C9-LOG-TYPE-19
                                                                                      work.setCtC9LogType19(work.getCtC9LogType19()+(long)1);
                                                                                  }
  
//  ELSE
                                                                                  else { 
                                                                                      sf503X92RecordType = sf503X92ActivityLog.getSf503X92RecordType();
//  IF SF503-X92-RECORD-TYPE = '20'
//  LITERAL_20 = '20'
                                                                                      if (		compareChars(sf503X92RecordType,CONSTANTS.LITERAL_20) == 0 ) { 
//  ADD 1 TO CT-C9-LOG-TYPE-20
                                                                                          work.setCtC9LogType20(work.getCtC9LogType20()+(long)1);
                                                                                      }
  
//  ELSE
                                                                                      else { 
                                                                                          sf503X92RecordType = sf503X92ActivityLog.getSf503X92RecordType();
//  IF SF503-X92-RECORD-TYPE = '21'
//  LITERAL_21 = '21'
                                                                                          if (		compareChars(sf503X92RecordType,CONSTANTS.LITERAL_21) == 0 ) { 
//  ADD 1 TO CT-C9-LOG-TYPE-21
                                                                                              work.setCtC9LogType21(work.getCtC9LogType21()+(long)1);
                                                                                          }
  
//  ELSE
                                                                                          else { 
                                                                                              sf503X92RecordType = sf503X92ActivityLog.getSf503X92RecordType();
//  IF SF503-X92-RECORD-TYPE = '22'
//  LITERAL_22 = '22'
                                                                                              if (		compareChars(sf503X92RecordType,CONSTANTS.LITERAL_22) == 0 ) { 
//  ADD 1 TO CT-C9-LOG-TYPE-22
                                                                                                  work.setCtC9LogType22(work.getCtC9LogType22()+(long)1);
                                                                                              }
  
//  ELSE
                                                                                              else { 
                                                                                                  sf503X92RecordType = sf503X92ActivityLog.getSf503X92RecordType();
//  IF SF503-X92-RECORD-TYPE = '23'
//  LITERAL_23 = '23'
                                                                                                  if (		compareChars(sf503X92RecordType,CONSTANTS.LITERAL_23) == 0 ) { 
//  ADD 1 TO CT-C9-LOG-TYPE-23
                                                                                                      work.setCtC9LogType23(work.getCtC9LogType23()+(long)1);
                                                                                                  }
  
//  ELSE
                                                                                                  else { 
                                                                                                      sf503X92RecordType = sf503X92ActivityLog.getSf503X92RecordType();
//  IF SF503-X92-RECORD-TYPE = '24'
//  LITERAL_24 = '24'
                                                                                                      if (		compareChars(sf503X92RecordType,CONSTANTS.LITERAL_24) == 0 ) { 
//  ADD 1 TO CT-C9-LOG-TYPE-24
                                                                                                          work.setCtC9LogType24(work.getCtC9LogType24()+(long)1);
                                                                                                      }
  
//  ELSE
                                                                                                      else { 
                                                                                                          sf503X92RecordType = sf503X92ActivityLog.getSf503X92RecordType();
//  IF SF503-X92-RECORD-TYPE = '25'
//  LITERAL_25 = '25'
                                                                                                          if (		compareChars(sf503X92RecordType,CONSTANTS.LITERAL_25) == 0 ) { 
//  ADD 1 TO CT-C9-LOG-TYPE-25
                                                                                                              work.setCtC9LogType25(work.getCtC9LogType25()+(long)1);
                                                                                                          }
  
//  ELSE
                                                                                                          else { 
                                                                                                              sf503X92RecordType = sf503X92ActivityLog.getSf503X92RecordType();
//  IF SF503-X92-RECORD-TYPE = '26'
//  LITERAL_26 = '26'
                                                                                                              if (		compareChars(sf503X92RecordType,CONSTANTS.LITERAL_26) == 0 ) { 
//  ADD 1 TO CT-C9-LOG-TYPE-26
                                                                                                                  work.setCtC9LogType26(work.getCtC9LogType26()+(long)1);
                                                                                                              }
  
//  ELSE
                                                                                                              else { 
//  ADD 1 TO CT-C9-UNDEF-LOG-TYPE
                                                                                                                  work.setCtC9UndefLogType(work.getCtC9UndefLogType()+(long)1);
                                                                                                              }
                                                                                                          }
                                                                                                      }
                                                                                                  }
                                                                                              }
                                                                                          }
                                                                                      }
                                                                                  }
                                                                              }
                                                                          }
                                                                      }
                                                                  }
                                                              }
                                                          }
                                                      }
                                                  }
                                              }
                                          }
                                      }
                                  }
                              }
                          }
                      }
                  }
              }
          }
//  IF SF503-SORT-MIP-ID = PREV-X92-SORT-MIP-ID
          sf503SortMipId = sf503SortFields.getSf503SortMipId();
          prevX92SortMipId = work.getPrevX92SortMipId();
//  ELSE
          if (		compareChars(sf503SortMipId,prevX92SortMipId) != 0 ) { 
//  PERFORM 1710-FORMAT-X92-ACTIVITY-RPT
              formatX92ActivityRpt();/*1710-FORMAT-X92-ACTIVITY-RPT*/
              // MOVE SF503-SORT-DATE TO PREV-X92-SORT-DATE
              work.setPrevX92SortDate(sf50301.getSf503SortFields().getSf503SortDate());
  
              // MOVE SF503-SORT-MIP-ID TO PREV-X92-SORT-MIP-ID
              work.setPrevX92SortMipId(sf50301.getSf503SortFields().getSf503SortMipId());
  
          }
  
//  ADD 1 TO CT-LOG-X92
          work.setCtLogX92(work.getCtLogX92()+(long)1);
      
      }
      /**
      * formatX92ActivityRpt 
      *   This method is derived from 
  *   COBOL Paragraph - 1710-FORMAT-X92-ACTIVITY-RPT COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void formatX92ActivityRpt() throws Exception {
//  PERFORM 1710-FORMAT-X92-ACTIVITY-RPT-SPLIT2
          formatX92ActivityRptSplit2();/*1710-FORMAT-X92-ACTIVITY-RPT-SPLIT2*/
//  PERFORM 1710-FORMAT-X92-ACTIVITY-RPT-SPLIT3
          formatX92ActivityRptSplit3();/*1710-FORMAT-X92-ACTIVITY-RPT-SPLIT3*/
//  PERFORM 1710-FORMAT-X92-ACTIVITY-RPT-SPLIT4
          formatX92ActivityRptSplit4();/*1710-FORMAT-X92-ACTIVITY-RPT-SPLIT4*/
//  PERFORM 1710-FORMAT-X92-ACTIVITY-RPT-SPLIT5
          formatX92ActivityRptSplit5();/*1710-FORMAT-X92-ACTIVITY-RPT-SPLIT5*/
      
      }
      /**
      * formatX92ActivityRptSplit2 
      *   This method is derived from 
  *   COBOL Paragraph - 1710-FORMAT-X92-ACTIVITY-RPT-SPLIT2 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - rpHeading1                     COBOL Name: RP-HEADING-1
      * - ctRptC9PageNo                  COBOL Name: CT-RPT-C9-PAGE-NO
      * - rpC9Heading2                   COBOL Name: RP-C9-HEADING-2
      * - rpC9Heading3                   COBOL Name: RP-C9-HEADING-3
      * - prevX92SortDate                COBOL Name: PREV-X92-SORT-DATE
      * - prevX92SortMipId               COBOL Name: PREV-X92-SORT-MIP-ID
      * - rpC9Heading4                   COBOL Name: RP-C9-HEADING-4
      * - rpC9Heading5                   COBOL Name: RP-C9-HEADING-5
      * - rpC9LogDesc1                   COBOL Name: RP-C9-LOG-DESC-1
      * - ctC9LogType1                   COBOL Name: CT-C9-LOG-TYPE-1
      * - rpC9Detail                     COBOL Name: RP-C9-DETAIL
      * - rpC9LogDesc2                   COBOL Name: RP-C9-LOG-DESC-2
      * - ctC9LogType2                   COBOL Name: CT-C9-LOG-TYPE-2
      * - rpC9LogDesc3                   COBOL Name: RP-C9-LOG-DESC-3
      * - ctC9LogType3                   COBOL Name: CT-C9-LOG-TYPE-3
      * - rpC9LogDesc4                   COBOL Name: RP-C9-LOG-DESC-4
      * - ctC9LogType4                   COBOL Name: CT-C9-LOG-TYPE-4
      * - rpC9LogDesc5                   COBOL Name: RP-C9-LOG-DESC-5
      * - ctC9LogType5                   COBOL Name: CT-C9-LOG-TYPE-5
      * - rpC9LogDesc6                   COBOL Name: RP-C9-LOG-DESC-6
      * - ctC9LogType6                   COBOL Name: CT-C9-LOG-TYPE-6
      * - rpC9LogDesc7                   COBOL Name: RP-C9-LOG-DESC-7
      * - ctC9LogType7                   COBOL Name: CT-C9-LOG-TYPE-7
      *
      * Output :  

      * - rpH1RptCode                    COBOL Name: RP-H1-RPT-CODE
      * - rpReportCode                   COBOL Name: RP-REPORT-CODE
      * - rpPrintLine                    COBOL Name: RP-PRINT-LINE
      * - rpHeading1                     COBOL Name: RP-HEADING-1
      * - ctRptC9PageNo                  COBOL Name: CT-RPT-C9-PAGE-NO
      * - rpC9Heading2                   COBOL Name: RP-C9-HEADING-2
      * - rpC9H3Pagenumber               COBOL Name: RP-C9-H3-PAGENUMBER
      * - rpC9Heading3                   COBOL Name: RP-C9-HEADING-3
      * - rpC9H4DtStamp                  COBOL Name: RP-C9-H4-DT-STAMP
      * - prevX92SortDate                COBOL Name: PREV-X92-SORT-DATE
      * - rpC9H4MipId                    COBOL Name: RP-C9-H4-MIP-ID
      * - prevX92SortMipId               COBOL Name: PREV-X92-SORT-MIP-ID
      * - rpC9Heading4                   COBOL Name: RP-C9-HEADING-4
      * - rpC9Heading5                   COBOL Name: RP-C9-HEADING-5
      * - rpC9DetCc                      COBOL Name: RP-C9-DET-CC
      * - rpC9DetLogType                 COBOL Name: RP-C9-DET-LOG-TYPE
      * - rpC9DetLogDesc                 COBOL Name: RP-C9-DET-LOG-DESC
      * - rpC9LogDesc1                   COBOL Name: RP-C9-LOG-DESC-1
      * - rpC9DetTotal                   COBOL Name: RP-C9-DET-TOTAL
      * - ctC9LogType1                   COBOL Name: CT-C9-LOG-TYPE-1
      * - rpC9Detail                     COBOL Name: RP-C9-DETAIL
      * - rpC9LogDesc2                   COBOL Name: RP-C9-LOG-DESC-2
      * - ctC9LogType2                   COBOL Name: CT-C9-LOG-TYPE-2
      * - rpC9LogDesc3                   COBOL Name: RP-C9-LOG-DESC-3
      * - ctC9LogType3                   COBOL Name: CT-C9-LOG-TYPE-3
      * - rpC9LogDesc4                   COBOL Name: RP-C9-LOG-DESC-4
      * - ctC9LogType4                   COBOL Name: CT-C9-LOG-TYPE-4
      * - rpC9LogDesc5                   COBOL Name: RP-C9-LOG-DESC-5
      * - ctC9LogType5                   COBOL Name: CT-C9-LOG-TYPE-5
      * - rpC9LogDesc6                   COBOL Name: RP-C9-LOG-DESC-6
      * - ctC9LogType6                   COBOL Name: CT-C9-LOG-TYPE-6
      * - rpC9LogDesc7                   COBOL Name: RP-C9-LOG-DESC-7
      * - ctC9LogType7                   COBOL Name: CT-C9-LOG-TYPE-7
      *
      * @throws CFException
      */
      private void formatX92ActivityRptSplit2() throws Exception {
//  MOVE 'II' TO RP-H1-RPT-CODE
//  LITERAL_II = 'II'
          rpHeading1.setRpH1RptCode(CONSTANTS.LITERAL_II);
//  MOVE 'I' TO RP-REPORT-CODE
//  LITERAL_I = 'I'
          rpReportPrintLine.setRpReportCode(CONSTANTS.LITERAL_I);
          // MOVE RP-HEADING-1 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpHeading1.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
//  ADD 1 TO CT-RPT-C9-PAGE-NO
          work.setCtRptC9PageNo(work.getCtRptC9PageNo()+1);
//  MOVE RP-C9-HEADING-2 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(pad(133,work.getRpC9Heading2(),SPACE_CHAR,RIGHT_PAD));
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
//  MOVE CT-RPT-C9-PAGE-NO TO RP-C9-H3-PAGENUMBER
//  FORMAT_1059277505 = "ZZZ9"
          rpC9Heading3.setRpC9H3Pagenumber(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(work.getCtRptC9PageNo()).toCharArray()));
          // MOVE RP-C9-HEADING-3 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC9Heading3.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
//  MOVE PREV-X92-SORT-DATE TO RP-C9-H4-DT-STAMP
          rpC9Heading4.setRpC9H4DtStamp(pad(8,work.getPrevX92SortDate(),SPACE_CHAR,RIGHT_PAD));
//  MOVE PREV-X92-SORT-MIP-ID TO RP-C9-H4-MIP-ID
          rpC9Heading4.setRpC9H4MipId(work.getPrevX92SortMipId());
          // MOVE RP-C9-HEADING-4 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC9Heading4.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
//  MOVE RP-C9-HEADING-5 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(work.getRpC9Heading5());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
          // MOVE '0' TO RP-C9-DET-CC
          //  LITERAL_0 = '0'
          rpC9Detail.setRpC9DetCc(CONSTANTS.LITERAL_0);
//  MOVE ' 1' TO RP-C9-DET-LOG-TYPE
//  LITERAL_B_1 = ' 1'
          rpC9Detail.setRpC9DetLogType(CONSTANTS.LITERAL_B_1);
//  MOVE RP-C9-LOG-DESC-1 TO RP-C9-DET-LOG-DESC
          rpC9Detail.setRpC9DetLogDesc(work.getRpC9LogDesc1());
//  MOVE CT-C9-LOG-TYPE-1 TO RP-C9-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          rpC9Detail.setRpC9DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(work.getCtC9LogType1()).toCharArray()));
          // MOVE RP-C9-DETAIL TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC9Detail.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
//  MOVE ' 2' TO RP-C9-DET-LOG-TYPE
//  LITERAL_B_2 = ' 2'
          rpC9Detail.setRpC9DetLogType(CONSTANTS.LITERAL_B_2);
//  MOVE RP-C9-LOG-DESC-2 TO RP-C9-DET-LOG-DESC
          rpC9Detail.setRpC9DetLogDesc(work.getRpC9LogDesc2());
//  MOVE CT-C9-LOG-TYPE-2 TO RP-C9-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          rpC9Detail.setRpC9DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(work.getCtC9LogType2()).toCharArray()));
          // MOVE RP-C9-DETAIL TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC9Detail.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
//  MOVE ' 3' TO RP-C9-DET-LOG-TYPE
//  LITERAL_B_3 = ' 3'
          rpC9Detail.setRpC9DetLogType(CONSTANTS.LITERAL_B_3);
//  MOVE RP-C9-LOG-DESC-3 TO RP-C9-DET-LOG-DESC
          rpC9Detail.setRpC9DetLogDesc(work.getRpC9LogDesc3());
//  MOVE CT-C9-LOG-TYPE-3 TO RP-C9-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          rpC9Detail.setRpC9DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(work.getCtC9LogType3()).toCharArray()));
          // MOVE RP-C9-DETAIL TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC9Detail.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
//  MOVE ' 4' TO RP-C9-DET-LOG-TYPE
//  LITERAL_B_4 = ' 4'
          rpC9Detail.setRpC9DetLogType(CONSTANTS.LITERAL_B_4);
//  MOVE RP-C9-LOG-DESC-4 TO RP-C9-DET-LOG-DESC
          rpC9Detail.setRpC9DetLogDesc(work.getRpC9LogDesc4());
//  MOVE CT-C9-LOG-TYPE-4 TO RP-C9-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          rpC9Detail.setRpC9DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(work.getCtC9LogType4()).toCharArray()));
          // MOVE RP-C9-DETAIL TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC9Detail.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
//  MOVE ' 5' TO RP-C9-DET-LOG-TYPE
//  LITERAL_B_5 = ' 5'
          rpC9Detail.setRpC9DetLogType(CONSTANTS.LITERAL_B_5);
//  MOVE RP-C9-LOG-DESC-5 TO RP-C9-DET-LOG-DESC
          rpC9Detail.setRpC9DetLogDesc(work.getRpC9LogDesc5());
//  MOVE CT-C9-LOG-TYPE-5 TO RP-C9-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          rpC9Detail.setRpC9DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(work.getCtC9LogType5()).toCharArray()));
          // MOVE RP-C9-DETAIL TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC9Detail.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
//  MOVE ' 6' TO RP-C9-DET-LOG-TYPE
//  LITERAL_B_6 = ' 6'
          rpC9Detail.setRpC9DetLogType(CONSTANTS.LITERAL_B_6);
//  MOVE RP-C9-LOG-DESC-6 TO RP-C9-DET-LOG-DESC
          rpC9Detail.setRpC9DetLogDesc(work.getRpC9LogDesc6());
//  MOVE CT-C9-LOG-TYPE-6 TO RP-C9-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          rpC9Detail.setRpC9DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(work.getCtC9LogType6()).toCharArray()));
          // MOVE RP-C9-DETAIL TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC9Detail.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
//  MOVE ' 7' TO RP-C9-DET-LOG-TYPE
//  LITERAL_B_7 = ' 7'
          rpC9Detail.setRpC9DetLogType(CONSTANTS.LITERAL_B_7);
//  MOVE RP-C9-LOG-DESC-7 TO RP-C9-DET-LOG-DESC
          rpC9Detail.setRpC9DetLogDesc(work.getRpC9LogDesc7());
//  MOVE CT-C9-LOG-TYPE-7 TO RP-C9-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          rpC9Detail.setRpC9DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(work.getCtC9LogType7()).toCharArray()));
          // MOVE RP-C9-DETAIL TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC9Detail.toCharArray());
      
      }
      /**
      * formatX92ActivityRptSplit3 
      *   This method is derived from 
  *   COBOL Paragraph - 1710-FORMAT-X92-ACTIVITY-RPT-SPLIT3 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - rpC9LogDesc8                   COBOL Name: RP-C9-LOG-DESC-8
      * - ctC9LogType8                   COBOL Name: CT-C9-LOG-TYPE-8
      * - rpC9Detail                     COBOL Name: RP-C9-DETAIL
      * - rpC9LogDesc9                   COBOL Name: RP-C9-LOG-DESC-9
      * - ctC9LogType9                   COBOL Name: CT-C9-LOG-TYPE-9
      * - rpC9LogDesc10                  COBOL Name: RP-C9-LOG-DESC-10
      * - ctC9LogType10                  COBOL Name: CT-C9-LOG-TYPE-10
      * - rpC9LogDesc11                  COBOL Name: RP-C9-LOG-DESC-11
      * - ctC9LogType11                  COBOL Name: CT-C9-LOG-TYPE-11
      * - rpC9LogDesc12                  COBOL Name: RP-C9-LOG-DESC-12
      * - ctC9LogType12                  COBOL Name: CT-C9-LOG-TYPE-12
      * - rpC9LogDesc13                  COBOL Name: RP-C9-LOG-DESC-13
      * - ctC9LogType13                  COBOL Name: CT-C9-LOG-TYPE-13
      * - rpC9LogDesc14                  COBOL Name: RP-C9-LOG-DESC-14
      * - ctC9LogType14                  COBOL Name: CT-C9-LOG-TYPE-14
      * - rpC9LogDesc15                  COBOL Name: RP-C9-LOG-DESC-15
      * - ctC9LogType15                  COBOL Name: CT-C9-LOG-TYPE-15
      * - rpC9LogDesc16                  COBOL Name: RP-C9-LOG-DESC-16
      * - ctC9LogType16                  COBOL Name: CT-C9-LOG-TYPE-16
      * - rpC9LogDesc17                  COBOL Name: RP-C9-LOG-DESC-17
      * - ctC9LogType17                  COBOL Name: CT-C9-LOG-TYPE-17
      *
      * Output :  

      * - rpC9DetLogType                 COBOL Name: RP-C9-DET-LOG-TYPE
      * - rpC9DetLogDesc                 COBOL Name: RP-C9-DET-LOG-DESC
      * - rpC9LogDesc8                   COBOL Name: RP-C9-LOG-DESC-8
      * - rpC9DetTotal                   COBOL Name: RP-C9-DET-TOTAL
      * - ctC9LogType8                   COBOL Name: CT-C9-LOG-TYPE-8
      * - rpPrintLine                    COBOL Name: RP-PRINT-LINE
      * - rpC9Detail                     COBOL Name: RP-C9-DETAIL
      * - rpC9LogDesc9                   COBOL Name: RP-C9-LOG-DESC-9
      * - ctC9LogType9                   COBOL Name: CT-C9-LOG-TYPE-9
      * - rpC9LogDesc10                  COBOL Name: RP-C9-LOG-DESC-10
      * - ctC9LogType10                  COBOL Name: CT-C9-LOG-TYPE-10
      * - rpC9LogDesc11                  COBOL Name: RP-C9-LOG-DESC-11
      * - ctC9LogType11                  COBOL Name: CT-C9-LOG-TYPE-11
      * - rpC9LogDesc12                  COBOL Name: RP-C9-LOG-DESC-12
      * - ctC9LogType12                  COBOL Name: CT-C9-LOG-TYPE-12
      * - rpC9LogDesc13                  COBOL Name: RP-C9-LOG-DESC-13
      * - ctC9LogType13                  COBOL Name: CT-C9-LOG-TYPE-13
      * - rpC9LogDesc14                  COBOL Name: RP-C9-LOG-DESC-14
      * - ctC9LogType14                  COBOL Name: CT-C9-LOG-TYPE-14
      * - rpC9LogDesc15                  COBOL Name: RP-C9-LOG-DESC-15
      * - ctC9LogType15                  COBOL Name: CT-C9-LOG-TYPE-15
      * - rpC9LogDesc16                  COBOL Name: RP-C9-LOG-DESC-16
      * - ctC9LogType16                  COBOL Name: CT-C9-LOG-TYPE-16
      * - rpC9LogDesc17                  COBOL Name: RP-C9-LOG-DESC-17
      * - ctC9LogType17                  COBOL Name: CT-C9-LOG-TYPE-17
      *
      * @throws CFException
      */
      private void formatX92ActivityRptSplit3() throws Exception {
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
//  MOVE ' 8' TO RP-C9-DET-LOG-TYPE
//  LITERAL_B_8 = ' 8'
          rpC9Detail.setRpC9DetLogType(CONSTANTS.LITERAL_B_8);
//  MOVE RP-C9-LOG-DESC-8 TO RP-C9-DET-LOG-DESC
          rpC9Detail.setRpC9DetLogDesc(work.getRpC9LogDesc8());
//  MOVE CT-C9-LOG-TYPE-8 TO RP-C9-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          rpC9Detail.setRpC9DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(work.getCtC9LogType8()).toCharArray()));
          // MOVE RP-C9-DETAIL TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC9Detail.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
//  MOVE ' 9' TO RP-C9-DET-LOG-TYPE
//  LITERAL_B_9 = ' 9'
          rpC9Detail.setRpC9DetLogType(CONSTANTS.LITERAL_B_9);
//  MOVE RP-C9-LOG-DESC-9 TO RP-C9-DET-LOG-DESC
          rpC9Detail.setRpC9DetLogDesc(work.getRpC9LogDesc9());
//  MOVE CT-C9-LOG-TYPE-9 TO RP-C9-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          rpC9Detail.setRpC9DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(work.getCtC9LogType9()).toCharArray()));
          // MOVE RP-C9-DETAIL TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC9Detail.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
          // MOVE '10' TO RP-C9-DET-LOG-TYPE
          //  LITERAL_10 = '10'
          rpC9Detail.setRpC9DetLogType(CONSTANTS.LITERAL_10);
//  MOVE RP-C9-LOG-DESC-10 TO RP-C9-DET-LOG-DESC
          rpC9Detail.setRpC9DetLogDesc(work.getRpC9LogDesc10());
//  MOVE CT-C9-LOG-TYPE-10 TO RP-C9-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          rpC9Detail.setRpC9DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(work.getCtC9LogType10()).toCharArray()));
          // MOVE RP-C9-DETAIL TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC9Detail.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
          // MOVE '11' TO RP-C9-DET-LOG-TYPE
          //  LITERAL_11 = '11'
          rpC9Detail.setRpC9DetLogType(CONSTANTS.LITERAL_11);
//  MOVE RP-C9-LOG-DESC-11 TO RP-C9-DET-LOG-DESC
          rpC9Detail.setRpC9DetLogDesc(work.getRpC9LogDesc11());
//  MOVE CT-C9-LOG-TYPE-11 TO RP-C9-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          rpC9Detail.setRpC9DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(work.getCtC9LogType11()).toCharArray()));
          // MOVE RP-C9-DETAIL TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC9Detail.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
          // MOVE '12' TO RP-C9-DET-LOG-TYPE
          //  LITERAL_12 = '12'
          rpC9Detail.setRpC9DetLogType(CONSTANTS.LITERAL_12);
//  MOVE RP-C9-LOG-DESC-12 TO RP-C9-DET-LOG-DESC
          rpC9Detail.setRpC9DetLogDesc(work.getRpC9LogDesc12());
//  MOVE CT-C9-LOG-TYPE-12 TO RP-C9-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          rpC9Detail.setRpC9DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(work.getCtC9LogType12()).toCharArray()));
          // MOVE RP-C9-DETAIL TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC9Detail.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
          // MOVE '13' TO RP-C9-DET-LOG-TYPE
          //  LITERAL_13 = '13'
          rpC9Detail.setRpC9DetLogType(CONSTANTS.LITERAL_13);
//  MOVE RP-C9-LOG-DESC-13 TO RP-C9-DET-LOG-DESC
          rpC9Detail.setRpC9DetLogDesc(work.getRpC9LogDesc13());
//  MOVE CT-C9-LOG-TYPE-13 TO RP-C9-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          rpC9Detail.setRpC9DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(work.getCtC9LogType13()).toCharArray()));
          // MOVE RP-C9-DETAIL TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC9Detail.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
          // MOVE '14' TO RP-C9-DET-LOG-TYPE
          //  LITERAL_14 = '14'
          rpC9Detail.setRpC9DetLogType(CONSTANTS.LITERAL_14);
//  MOVE RP-C9-LOG-DESC-14 TO RP-C9-DET-LOG-DESC
          rpC9Detail.setRpC9DetLogDesc(work.getRpC9LogDesc14());
//  MOVE CT-C9-LOG-TYPE-14 TO RP-C9-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          rpC9Detail.setRpC9DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(work.getCtC9LogType14()).toCharArray()));
          // MOVE RP-C9-DETAIL TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC9Detail.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
          // MOVE '15' TO RP-C9-DET-LOG-TYPE
          //  LITERAL_15 = '15'
          rpC9Detail.setRpC9DetLogType(CONSTANTS.LITERAL_15);
//  MOVE RP-C9-LOG-DESC-15 TO RP-C9-DET-LOG-DESC
          rpC9Detail.setRpC9DetLogDesc(work.getRpC9LogDesc15());
//  MOVE CT-C9-LOG-TYPE-15 TO RP-C9-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          rpC9Detail.setRpC9DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(work.getCtC9LogType15()).toCharArray()));
          // MOVE RP-C9-DETAIL TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC9Detail.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
          // MOVE '16' TO RP-C9-DET-LOG-TYPE
          //  LITERAL_16 = '16'
          rpC9Detail.setRpC9DetLogType(CONSTANTS.LITERAL_16);
//  MOVE RP-C9-LOG-DESC-16 TO RP-C9-DET-LOG-DESC
          rpC9Detail.setRpC9DetLogDesc(work.getRpC9LogDesc16());
//  MOVE CT-C9-LOG-TYPE-16 TO RP-C9-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          rpC9Detail.setRpC9DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(work.getCtC9LogType16()).toCharArray()));
          // MOVE RP-C9-DETAIL TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC9Detail.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
          // MOVE '17' TO RP-C9-DET-LOG-TYPE
          //  LITERAL_17 = '17'
          rpC9Detail.setRpC9DetLogType(CONSTANTS.LITERAL_17);
//  MOVE RP-C9-LOG-DESC-17 TO RP-C9-DET-LOG-DESC
          rpC9Detail.setRpC9DetLogDesc(work.getRpC9LogDesc17());
//  MOVE CT-C9-LOG-TYPE-17 TO RP-C9-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          rpC9Detail.setRpC9DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(work.getCtC9LogType17()).toCharArray()));
          // MOVE RP-C9-DETAIL TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC9Detail.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
      
      }
      /**
      * formatX92ActivityRptSplit4 
      *   This method is derived from 
  *   COBOL Paragraph - 1710-FORMAT-X92-ACTIVITY-RPT-SPLIT4 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - rpC9LogDesc18                  COBOL Name: RP-C9-LOG-DESC-18
      * - ctC9LogType18                  COBOL Name: CT-C9-LOG-TYPE-18
      * - rpC9Detail                     COBOL Name: RP-C9-DETAIL
      * - rpHeading1                     COBOL Name: RP-HEADING-1
      * - ctRptC9PageNo                  COBOL Name: CT-RPT-C9-PAGE-NO
      * - rpC9Heading2                   COBOL Name: RP-C9-HEADING-2
      * - rpC9Heading3                   COBOL Name: RP-C9-HEADING-3
      * - rpC9Heading4                   COBOL Name: RP-C9-HEADING-4
      * - rpC9Heading5                   COBOL Name: RP-C9-HEADING-5
      * - rpC9LogDesc19                  COBOL Name: RP-C9-LOG-DESC-19
      * - ctC9LogType19                  COBOL Name: CT-C9-LOG-TYPE-19
      * - rpC9LogDesc20                  COBOL Name: RP-C9-LOG-DESC-20
      * - ctC9LogType20                  COBOL Name: CT-C9-LOG-TYPE-20
      * - rpC9LogDesc21                  COBOL Name: RP-C9-LOG-DESC-21
      * - ctC9LogType21                  COBOL Name: CT-C9-LOG-TYPE-21
      * - rpC9LogDesc22                  COBOL Name: RP-C9-LOG-DESC-22
      * - ctC9LogType22                  COBOL Name: CT-C9-LOG-TYPE-22
      * - rpC9LogDesc23                  COBOL Name: RP-C9-LOG-DESC-23
      * - ctC9LogType23                  COBOL Name: CT-C9-LOG-TYPE-23
      * - rpC9LogDesc24                  COBOL Name: RP-C9-LOG-DESC-24
      * - ctC9LogType24                  COBOL Name: CT-C9-LOG-TYPE-24
      * - rpC9LogDesc25                  COBOL Name: RP-C9-LOG-DESC-25
      * - ctC9LogType25                  COBOL Name: CT-C9-LOG-TYPE-25
      *
      * Output :  

      * - rpC9DetLogType                 COBOL Name: RP-C9-DET-LOG-TYPE
      * - rpC9DetLogDesc                 COBOL Name: RP-C9-DET-LOG-DESC
      * - rpC9LogDesc18                  COBOL Name: RP-C9-LOG-DESC-18
      * - rpC9DetTotal                   COBOL Name: RP-C9-DET-TOTAL
      * - ctC9LogType18                  COBOL Name: CT-C9-LOG-TYPE-18
      * - rpPrintLine                    COBOL Name: RP-PRINT-LINE
      * - rpC9Detail                     COBOL Name: RP-C9-DETAIL
      * - rpHeading1                     COBOL Name: RP-HEADING-1
      * - ctRptC9PageNo                  COBOL Name: CT-RPT-C9-PAGE-NO
      * - rpC9Heading2                   COBOL Name: RP-C9-HEADING-2
      * - rpC9H3Pagenumber               COBOL Name: RP-C9-H3-PAGENUMBER
      * - rpC9Heading3                   COBOL Name: RP-C9-HEADING-3
      * - rpC9Heading4                   COBOL Name: RP-C9-HEADING-4
      * - rpC9Heading5                   COBOL Name: RP-C9-HEADING-5
      * - rpC9DetCc                      COBOL Name: RP-C9-DET-CC
      * - rpC9LogDesc19                  COBOL Name: RP-C9-LOG-DESC-19
      * - ctC9LogType19                  COBOL Name: CT-C9-LOG-TYPE-19
      * - rpC9LogDesc20                  COBOL Name: RP-C9-LOG-DESC-20
      * - ctC9LogType20                  COBOL Name: CT-C9-LOG-TYPE-20
      * - rpC9LogDesc21                  COBOL Name: RP-C9-LOG-DESC-21
      * - ctC9LogType21                  COBOL Name: CT-C9-LOG-TYPE-21
      * - rpC9LogDesc22                  COBOL Name: RP-C9-LOG-DESC-22
      * - ctC9LogType22                  COBOL Name: CT-C9-LOG-TYPE-22
      * - rpC9LogDesc23                  COBOL Name: RP-C9-LOG-DESC-23
      * - ctC9LogType23                  COBOL Name: CT-C9-LOG-TYPE-23
      * - rpC9LogDesc24                  COBOL Name: RP-C9-LOG-DESC-24
      * - ctC9LogType24                  COBOL Name: CT-C9-LOG-TYPE-24
      * - rpC9LogDesc25                  COBOL Name: RP-C9-LOG-DESC-25
      * - ctC9LogType25                  COBOL Name: CT-C9-LOG-TYPE-25
      *
      * @throws CFException
      */
      private void formatX92ActivityRptSplit4() throws Exception {
          // MOVE '18' TO RP-C9-DET-LOG-TYPE
          //  LITERAL_18 = '18'
          rpC9Detail.setRpC9DetLogType(CONSTANTS.LITERAL_18);
//  MOVE RP-C9-LOG-DESC-18 TO RP-C9-DET-LOG-DESC
          rpC9Detail.setRpC9DetLogDesc(work.getRpC9LogDesc18());
//  MOVE CT-C9-LOG-TYPE-18 TO RP-C9-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          rpC9Detail.setRpC9DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(work.getCtC9LogType18()).toCharArray()));
          // MOVE RP-C9-DETAIL TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC9Detail.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
          // MOVE RP-HEADING-1 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpHeading1.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
//  ADD 1 TO CT-RPT-C9-PAGE-NO
          work.setCtRptC9PageNo(work.getCtRptC9PageNo()+1);
//  MOVE RP-C9-HEADING-2 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(pad(133,work.getRpC9Heading2(),SPACE_CHAR,RIGHT_PAD));
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
//  MOVE CT-RPT-C9-PAGE-NO TO RP-C9-H3-PAGENUMBER
//  FORMAT_1059277505 = "ZZZ9"
          rpC9Heading3.setRpC9H3Pagenumber(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(work.getCtRptC9PageNo()).toCharArray()));
          // MOVE RP-C9-HEADING-3 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC9Heading3.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
          // MOVE RP-C9-HEADING-4 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC9Heading4.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
//  MOVE RP-C9-HEADING-5 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(work.getRpC9Heading5());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
          // MOVE '0' TO RP-C9-DET-CC
          //  LITERAL_0 = '0'
          rpC9Detail.setRpC9DetCc(CONSTANTS.LITERAL_0);
          // MOVE '19' TO RP-C9-DET-LOG-TYPE
          //  LITERAL_19 = '19'
          rpC9Detail.setRpC9DetLogType(CONSTANTS.LITERAL_19);
//  MOVE RP-C9-LOG-DESC-19 TO RP-C9-DET-LOG-DESC
          rpC9Detail.setRpC9DetLogDesc(work.getRpC9LogDesc19());
//  MOVE CT-C9-LOG-TYPE-19 TO RP-C9-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          rpC9Detail.setRpC9DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(work.getCtC9LogType19()).toCharArray()));
          // MOVE RP-C9-DETAIL TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC9Detail.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
          // MOVE '20' TO RP-C9-DET-LOG-TYPE
          //  LITERAL_20 = '20'
          rpC9Detail.setRpC9DetLogType(CONSTANTS.LITERAL_20);
//  MOVE RP-C9-LOG-DESC-20 TO RP-C9-DET-LOG-DESC
          rpC9Detail.setRpC9DetLogDesc(work.getRpC9LogDesc20());
//  MOVE CT-C9-LOG-TYPE-20 TO RP-C9-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          rpC9Detail.setRpC9DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(work.getCtC9LogType20()).toCharArray()));
          // MOVE RP-C9-DETAIL TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC9Detail.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
          // MOVE '21' TO RP-C9-DET-LOG-TYPE
          //  LITERAL_21 = '21'
          rpC9Detail.setRpC9DetLogType(CONSTANTS.LITERAL_21);
//  MOVE RP-C9-LOG-DESC-21 TO RP-C9-DET-LOG-DESC
          rpC9Detail.setRpC9DetLogDesc(work.getRpC9LogDesc21());
//  MOVE CT-C9-LOG-TYPE-21 TO RP-C9-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          rpC9Detail.setRpC9DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(work.getCtC9LogType21()).toCharArray()));
          // MOVE RP-C9-DETAIL TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC9Detail.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
          // MOVE '22' TO RP-C9-DET-LOG-TYPE
          //  LITERAL_22 = '22'
          rpC9Detail.setRpC9DetLogType(CONSTANTS.LITERAL_22);
//  MOVE RP-C9-LOG-DESC-22 TO RP-C9-DET-LOG-DESC
          rpC9Detail.setRpC9DetLogDesc(work.getRpC9LogDesc22());
//  MOVE CT-C9-LOG-TYPE-22 TO RP-C9-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          rpC9Detail.setRpC9DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(work.getCtC9LogType22()).toCharArray()));
          // MOVE RP-C9-DETAIL TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC9Detail.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
          // MOVE '23' TO RP-C9-DET-LOG-TYPE
          //  LITERAL_23 = '23'
          rpC9Detail.setRpC9DetLogType(CONSTANTS.LITERAL_23);
//  MOVE RP-C9-LOG-DESC-23 TO RP-C9-DET-LOG-DESC
          rpC9Detail.setRpC9DetLogDesc(work.getRpC9LogDesc23());
//  MOVE CT-C9-LOG-TYPE-23 TO RP-C9-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          rpC9Detail.setRpC9DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(work.getCtC9LogType23()).toCharArray()));
          // MOVE RP-C9-DETAIL TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC9Detail.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
          // MOVE '24' TO RP-C9-DET-LOG-TYPE
          //  LITERAL_24 = '24'
          rpC9Detail.setRpC9DetLogType(CONSTANTS.LITERAL_24);
//  MOVE RP-C9-LOG-DESC-24 TO RP-C9-DET-LOG-DESC
          rpC9Detail.setRpC9DetLogDesc(work.getRpC9LogDesc24());
//  MOVE CT-C9-LOG-TYPE-24 TO RP-C9-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          rpC9Detail.setRpC9DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(work.getCtC9LogType24()).toCharArray()));
          // MOVE RP-C9-DETAIL TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC9Detail.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
          // MOVE '25' TO RP-C9-DET-LOG-TYPE
          //  LITERAL_25 = '25'
          rpC9Detail.setRpC9DetLogType(CONSTANTS.LITERAL_25);
//  MOVE RP-C9-LOG-DESC-25 TO RP-C9-DET-LOG-DESC
          rpC9Detail.setRpC9DetLogDesc(work.getRpC9LogDesc25());
//  MOVE CT-C9-LOG-TYPE-25 TO RP-C9-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          rpC9Detail.setRpC9DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(work.getCtC9LogType25()).toCharArray()));
      
      }
      /**
      * formatX92ActivityRptSplit5 
      *   This method is derived from 
  *   COBOL Paragraph - 1710-FORMAT-X92-ACTIVITY-RPT-SPLIT5 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - rpC9Detail                     COBOL Name: RP-C9-DETAIL
      * - rpC9LogDesc26                  COBOL Name: RP-C9-LOG-DESC-26
      * - ctC9LogType26                  COBOL Name: CT-C9-LOG-TYPE-26
      * - rpUndefLogDesc                 COBOL Name: RP-UNDEF-LOG-DESC
      * - ctC9UndefLogType               COBOL Name: CT-C9-UNDEF-LOG-TYPE
      *
      * Output :  

      * - rpPrintLine                    COBOL Name: RP-PRINT-LINE
      * - rpC9Detail                     COBOL Name: RP-C9-DETAIL
      * - rpC9DetLogType                 COBOL Name: RP-C9-DET-LOG-TYPE
      * - rpC9DetLogDesc                 COBOL Name: RP-C9-DET-LOG-DESC
      * - rpC9LogDesc26                  COBOL Name: RP-C9-LOG-DESC-26
      * - rpC9DetTotal                   COBOL Name: RP-C9-DET-TOTAL
      * - ctC9LogType26                  COBOL Name: CT-C9-LOG-TYPE-26
      * - rpUndefLogDesc                 COBOL Name: RP-UNDEF-LOG-DESC
      * - ctC9UndefLogType               COBOL Name: CT-C9-UNDEF-LOG-TYPE
      * - ctC9LogType1                   COBOL Name: CT-C9-LOG-TYPE-1
      * - ctC9LogType2                   COBOL Name: CT-C9-LOG-TYPE-2
      * - ctC9LogType3                   COBOL Name: CT-C9-LOG-TYPE-3
      * - ctC9LogType4                   COBOL Name: CT-C9-LOG-TYPE-4
      * - ctC9LogType5                   COBOL Name: CT-C9-LOG-TYPE-5
      * - ctC9LogType6                   COBOL Name: CT-C9-LOG-TYPE-6
      * - ctC9LogType7                   COBOL Name: CT-C9-LOG-TYPE-7
      * - ctC9LogType8                   COBOL Name: CT-C9-LOG-TYPE-8
      * - ctC9LogType9                   COBOL Name: CT-C9-LOG-TYPE-9
      * - ctC9LogType10                  COBOL Name: CT-C9-LOG-TYPE-10
      * - ctC9LogType11                  COBOL Name: CT-C9-LOG-TYPE-11
      * - ctC9LogType12                  COBOL Name: CT-C9-LOG-TYPE-12
      * - ctC9LogType13                  COBOL Name: CT-C9-LOG-TYPE-13
      * - ctC9LogType14                  COBOL Name: CT-C9-LOG-TYPE-14
      * - ctC9LogType15                  COBOL Name: CT-C9-LOG-TYPE-15
      * - ctC9LogType16                  COBOL Name: CT-C9-LOG-TYPE-16
      * - ctC9LogType17                  COBOL Name: CT-C9-LOG-TYPE-17
      * - ctC9LogType18                  COBOL Name: CT-C9-LOG-TYPE-18
      * - ctC9LogType19                  COBOL Name: CT-C9-LOG-TYPE-19
      * - ctC9LogType20                  COBOL Name: CT-C9-LOG-TYPE-20
      * - ctC9LogType21                  COBOL Name: CT-C9-LOG-TYPE-21
      * - ctC9LogType22                  COBOL Name: CT-C9-LOG-TYPE-22
      * - ctC9LogType23                  COBOL Name: CT-C9-LOG-TYPE-23
      * - ctC9LogType24                  COBOL Name: CT-C9-LOG-TYPE-24
      * - ctC9LogType25                  COBOL Name: CT-C9-LOG-TYPE-25
      *
      * @throws CFException
      */
      private void formatX92ActivityRptSplit5() throws Exception {
          // MOVE RP-C9-DETAIL TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC9Detail.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
          // MOVE '26' TO RP-C9-DET-LOG-TYPE
          //  LITERAL_26 = '26'
          rpC9Detail.setRpC9DetLogType(CONSTANTS.LITERAL_26);
//  MOVE RP-C9-LOG-DESC-26 TO RP-C9-DET-LOG-DESC
          rpC9Detail.setRpC9DetLogDesc(work.getRpC9LogDesc26());
//  MOVE CT-C9-LOG-TYPE-26 TO RP-C9-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          rpC9Detail.setRpC9DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(work.getCtC9LogType26()).toCharArray()));
          // MOVE RP-C9-DETAIL TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC9Detail.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
//  MOVE '--' TO RP-C9-DET-LOG-TYPE
//  LITERAL_MN2_ = '--'
          rpC9Detail.setRpC9DetLogType(CONSTANTS.LITERAL_MN2_);
//  MOVE RP-UNDEF-LOG-DESC TO RP-C9-DET-LOG-DESC
          rpC9Detail.setRpC9DetLogDesc(work.getRpUndefLogDesc());
//  MOVE CT-C9-UNDEF-LOG-TYPE TO RP-C9-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          rpC9Detail.setRpC9DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(work.getCtC9UndefLogType()).toCharArray()));
          // MOVE RP-C9-DETAIL TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC9Detail.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
//  MOVE ZEROS TO CT-C9-LOG-TYPE-1 CT-C9-LOG-TYPE-2 CT-C9-LOG-TYPE-3 CT-C9-LOG-TYPE-4 CT-C9-LOG-TYPE-5 CT-C9-LOG-TYPE-6 CT-C9-LOG-TYPE-7 CT-C9-LOG-TYPE-8 CT-C9-LOG-TYPE-9 CT-C9-LOG-TYPE-10 CT-C9-LOG-TYPE-11 CT-C9-LOG-TYPE-12 CT-C9-LOG-TYPE-13 CT-C9-LOG-TYPE-14 CT-C9-LOG-TYPE-15 CT-C9-LOG-TYPE-16 CT-C9-LOG-TYPE-17 CT-C9-LOG-TYPE-18 CT-C9-LOG-TYPE-19 CT-C9-LOG-TYPE-20 CT-C9-LOG-TYPE-21 CT-C9-LOG-TYPE-22 CT-C9-LOG-TYPE-23 CT-C9-LOG-TYPE-24 CT-C9-LOG-TYPE-25 CT-C9-LOG-TYPE-26 CT-C9-UNDEF-LOG-TYPE
          work.setCtC9LogType1(0);
          work.setCtC9LogType2(0);
          work.setCtC9LogType3(0);
          work.setCtC9LogType4(0);
          work.setCtC9LogType5(0);
          work.setCtC9LogType6(0);
          work.setCtC9LogType7(0);
          work.setCtC9LogType8(0);
          work.setCtC9LogType9(0);
          work.setCtC9LogType10(0);
          work.setCtC9LogType11(0);
          work.setCtC9LogType12(0);
          work.setCtC9LogType13(0);
          work.setCtC9LogType14(0);
          work.setCtC9LogType15(0);
          work.setCtC9LogType16(0);
          work.setCtC9LogType17(0);
          work.setCtC9LogType18(0);
          work.setCtC9LogType19(0);
          work.setCtC9LogType20(0);
          work.setCtC9LogType21(0);
          work.setCtC9LogType22(0);
          work.setCtC9LogType23(0);
          work.setCtC9LogType24(0);
          work.setCtC9LogType25(0);
          work.setCtC9LogType26(0);
          work.setCtC9UndefLogType(0);
      
      }
      /**
      * formatRemConsRpt 
      *   This method is derived from 
  *   COBOL Paragraph - 2000-FORMAT-REM-CONS-RPT COBOL Cyclomatic complexity - 15
      * Input  :  

      * - sf503RcRecordType              COBOL Name: SF503-RC-RECORD-TYPE
      * - ctC8LogTypeAlert               COBOL Name: CT-C8-LOG-TYPE-ALERT
      * - ctC8LogType4                   COBOL Name: CT-C8-LOG-TYPE-4
      * - rpC8LogDesc1                   COBOL Name: RP-C8-LOG-DESC-1
      * - ctC8LogType2                   COBOL Name: CT-C8-LOG-TYPE-2
      * - rpC8LogDesc2                   COBOL Name: RP-C8-LOG-DESC-2
      * - ctC8LogType3                   COBOL Name: CT-C8-LOG-TYPE-3
      * - rpC8LogDesc3                   COBOL Name: RP-C8-LOG-DESC-3
      * - rpC8LogDesc4                   COBOL Name: RP-C8-LOG-DESC-4
      * - ctC8LogType5                   COBOL Name: CT-C8-LOG-TYPE-5
      * - rpC8LogDesc5                   COBOL Name: RP-C8-LOG-DESC-5
      * - ctC8LogType6                   COBOL Name: CT-C8-LOG-TYPE-6
      * - rpC8LogDesc6                   COBOL Name: RP-C8-LOG-DESC-6
      * - ctC8LogType7                   COBOL Name: CT-C8-LOG-TYPE-7
      * - rpC8LogDesc7                   COBOL Name: RP-C8-LOG-DESC-7
      * - ctC8LogType8                   COBOL Name: CT-C8-LOG-TYPE-8
      * - rpC8LogDesc8                   COBOL Name: RP-C8-LOG-DESC-8
      * - ctC8UndefLogType               COBOL Name: CT-C8-UNDEF-LOG-TYPE
      * - sf503RcTimeHh                  COBOL Name: SF503-RC-TIME-HH
      * - sf503RcTimeMm                  COBOL Name: SF503-RC-TIME-MM
      * - sf503RcTimeSs                  COBOL Name: SF503-RC-TIME-SS
      * - waTime                         COBOL Name: WA-TIME
      * - sf503RcDateMm                  COBOL Name: SF503-RC-DATE-MM
      * - sf503RcDateDd                  COBOL Name: SF503-RC-DATE-DD
      * - sf503RcDateYy                  COBOL Name: SF503-RC-DATE-YY
      * - lit20300                       COBOL Name: 300-LIT-20
      * - waDate                         COBOL Name: WA-DATE
      * - sf503RcLocalMipId              COBOL Name: SF503-RC-LOCAL-MIP-ID
      * - sf503RcRemoteMipId             COBOL Name: SF503-RC-REMOTE-MIP-ID
      * - sf503RcOperatorId              COBOL Name: SF503-RC-OPERATOR-ID
      * - lit8300                        COBOL Name: 300-LIT-8
      * - sf503RcMessageArea             COBOL Name: SF503-RC-MESSAGE-AREA
      * - prevRcRemoteMipId              COBOL Name: PREV-RC-REMOTE-MIP-ID
      * - ctRptRcLineNo                  COBOL Name: CT-RPT-RC-LINE-NO
      * - rpC8Detail1                    COBOL Name: RP-C8-DETAIL-1
      * - rpC8Heading6                   COBOL Name: RP-C8-HEADING-6
      * - ctLogRemCons                   COBOL Name: CT-LOG-REM-CONS
      * - generalSortId                  COBOL Name: GENERAL-SORT-ID
      * - generalSortDate                COBOL Name: GENERAL-SORT-DATE
      * - generalSortTime                COBOL Name: GENERAL-SORT-TIME
      * - generalSortClass               COBOL Name: GENERAL-SORT-CLASS
      * - generalSortRest                COBOL Name: GENERAL-SORT-REST
      *
      * Output :  

      * - ctC8LogTypeAlert               COBOL Name: CT-C8-LOG-TYPE-ALERT
      * - rpC8H6Alert                    COBOL Name: RP-C8-H6-ALERT
      * - rpC8Det1Alert                  COBOL Name: RP-C8-DET-1-ALERT
      * - ctC8LogType4                   COBOL Name: CT-C8-LOG-TYPE-4
      * - rpC8Det1LogDesc                COBOL Name: RP-C8-DET-1-LOG-DESC
      * - rpC8LogDesc1                   COBOL Name: RP-C8-LOG-DESC-1
      * - ctC8LogType2                   COBOL Name: CT-C8-LOG-TYPE-2
      * - rpC8LogDesc2                   COBOL Name: RP-C8-LOG-DESC-2
      * - ctC8LogType3                   COBOL Name: CT-C8-LOG-TYPE-3
      * - rpC8LogDesc3                   COBOL Name: RP-C8-LOG-DESC-3
      * - rpC8LogDesc4                   COBOL Name: RP-C8-LOG-DESC-4
      * - ctC8LogType5                   COBOL Name: CT-C8-LOG-TYPE-5
      * - rpC8LogDesc5                   COBOL Name: RP-C8-LOG-DESC-5
      * - ctC8LogType6                   COBOL Name: CT-C8-LOG-TYPE-6
      * - rpC8LogDesc6                   COBOL Name: RP-C8-LOG-DESC-6
      * - ctC8LogType7                   COBOL Name: CT-C8-LOG-TYPE-7
      * - rpC8LogDesc7                   COBOL Name: RP-C8-LOG-DESC-7
      * - ctC8LogType8                   COBOL Name: CT-C8-LOG-TYPE-8
      * - rpC8LogDesc8                   COBOL Name: RP-C8-LOG-DESC-8
      * - ctC8UndefLogType               COBOL Name: CT-C8-UNDEF-LOG-TYPE
      * - rpReportCode                   COBOL Name: RP-REPORT-CODE
      * - rpC8Det1Cc                     COBOL Name: RP-C8-DET-1-CC
      * - waTimeHh9                      COBOL Name: WA-TIME-HH-9
      * - sf503RcTimeHh                  COBOL Name: SF503-RC-TIME-HH
      * - waTimeMm9                      COBOL Name: WA-TIME-MM-9
      * - sf503RcTimeMm                  COBOL Name: SF503-RC-TIME-MM
      * - waTimeSs9                      COBOL Name: WA-TIME-SS-9
      * - sf503RcTimeSs                  COBOL Name: SF503-RC-TIME-SS
      * - waTimeHours                    COBOL Name: WA-TIME-HOURS
      * - recTimeHh800                   COBOL Name: 800-REC-TIME-HH
      * - waTimeMinutes                  COBOL Name: WA-TIME-MINUTES
      * - recTimeMm800                   COBOL Name: 800-REC-TIME-MM
      * - waTimeSeconds                  COBOL Name: WA-TIME-SECONDS
      * - recTimeSs800                   COBOL Name: 800-REC-TIME-SS
      * - rpC8Det1LogTime                COBOL Name: RP-C8-DET-1-LOG-TIME
      * - waTime                         COBOL Name: WA-TIME
      * - waDateMn9                      COBOL Name: WA-DATE-MN-9
      * - sf503RcDateMm                  COBOL Name: SF503-RC-DATE-MM
      * - waDateDy9                      COBOL Name: WA-DATE-DY-9
      * - sf503RcDateDd                  COBOL Name: SF503-RC-DATE-DD
      * - waDateYr9                      COBOL Name: WA-DATE-YR-9
      * - sf503RcDateYy                  COBOL Name: SF503-RC-DATE-YY
      * - waDateMonth                    COBOL Name: WA-DATE-MONTH
      * - recDateMm800                   COBOL Name: 800-REC-DATE-MM
      * - waDateDay                      COBOL Name: WA-DATE-DAY
      * - recDateDd800                   COBOL Name: 800-REC-DATE-DD
      * - waDateYear                     COBOL Name: WA-DATE-YEAR
      * - recDateYy800                   COBOL Name: 800-REC-DATE-YY
      * - recDateCc800                   COBOL Name: 800-REC-DATE-CC
      * - lit20300                       COBOL Name: 300-LIT-20
      * - rpC8Det1LogDate                COBOL Name: RP-C8-DET-1-LOG-DATE
      * - waDate                         COBOL Name: WA-DATE
      * - rpC8Det1LogType                COBOL Name: RP-C8-DET-1-LOG-TYPE
      * - recType800                     COBOL Name: 800-REC-TYPE
      * - sf503RcRecordType              COBOL Name: SF503-RC-RECORD-TYPE
      * - rpC8Det1LocMipId               COBOL Name: RP-C8-DET-1-LOC-MIP-ID
      * - localMipId800                  COBOL Name: 800-LOCAL-MIP-ID
      * - sf503RcLocalMipId              COBOL Name: SF503-RC-LOCAL-MIP-ID
      * - rpC8Det1RemMipId               COBOL Name: RP-C8-DET-1-REM-MIP-ID
      * - remMipId800                    COBOL Name: 800-REM-MIP-ID
      * - sf503RcRemoteMipId             COBOL Name: SF503-RC-REMOTE-MIP-ID
      * - rpC8Det1OperId                 COBOL Name: RP-C8-DET-1-OPER-ID
      * - operId800                      COBOL Name: 800-OPER-ID
      * - sf503RcOperatorId              COBOL Name: SF503-RC-OPERATOR-ID
      * - recClass800                    COBOL Name: 800-REC-CLASS
      * - lit8300                        COBOL Name: 300-LIT-8
      * - message800                     COBOL Name: 800-MESSAGE
      * - sf503RcMessageArea             COBOL Name: SF503-RC-MESSAGE-AREA
      * - prevRcRemoteMipId              COBOL Name: PREV-RC-REMOTE-MIP-ID
      * - rpPrintLine                    COBOL Name: RP-PRINT-LINE
      * - rpC8Detail1                    COBOL Name: RP-C8-DETAIL-1
      * - rpC8H6MsgArea                  COBOL Name: RP-C8-H6-MSG-AREA
      * - rpC8Heading6                   COBOL Name: RP-C8-HEADING-6
      * - ctRptRcLineNo                  COBOL Name: CT-RPT-RC-LINE-NO
      * - ctLogRemCons                   COBOL Name: CT-LOG-REM-CONS
      * - sf503SortMipId                 COBOL Name: SF503-SORT-MIP-ID
      * - generalSortId                  COBOL Name: GENERAL-SORT-ID
      * - sf503SortDate                  COBOL Name: SF503-SORT-DATE
      * - generalSortDate                COBOL Name: GENERAL-SORT-DATE
      * - sf503SortTime                  COBOL Name: SF503-SORT-TIME
      * - generalSortTime                COBOL Name: GENERAL-SORT-TIME
      * - sf503LogRecord                 COBOL Name: SF503-LOG-RECORD
      * - generalSortClass               COBOL Name: GENERAL-SORT-CLASS
      * - generalSortRest                COBOL Name: GENERAL-SORT-REST
      *
      * @throws CFException
      */
      private void formatRemConsRpt() throws Exception {
			// Declare local variables used in the method
			Sf503RemoteConsoleLog sf503RemoteConsoleLog = sf50301.getSf503RemoteConsoleLog();
			char[] sf503RcRecordType = null;
			char[] sf503RcRemoteMipId = null;
			char[] prevRcRemoteMipId = null;
			char[] sf503SortMipId = null;
			Sf503RcTime sf503RcTime = sf50301.getSf503RemoteConsoleLog().getSf503RcTime();
			RecTime800 recTime800 = infoSecRcd800.getRecTime800();
			Sf503RcDate sf503RcDate = sf50301.getSf503RemoteConsoleLog().getSf503RcDate();
			RecDate800 recDate800 = infoSecRcd800.getRecDate800();
			int ctRptRcLineNo = 0;
			Sf503SortFields sf503SortFields = sf50301.getSf503SortFields();
			// End of variable declaration

          sf503RcRecordType = sf503RemoteConsoleLog.getSf503RcRecordType();
//  IF SF503-RC-RECORD-TYPE = '1' OR '2'
//  LITERAL_2 = '2'
          if (compareChars(sf503RcRecordType, CONSTANTS.LITERAL_1) == 0 || compareChars(sf503RcRecordType, CONSTANTS.LITERAL_2) == 0) { 
//  PERFORM 2020-CHECK-OPER-MSG-AREA
              checkOperMsgArea();/*2020-CHECK-OPER-MSG-AREA*/
          }
  
//  ELSE
          else { 
              sf503RcRecordType = sf503RemoteConsoleLog.getSf503RcRecordType();
//  IF SF503-RC-RECORD-TYPE = '8'
//  LITERAL_8 = '8'
              if (compareChars(sf503RcRecordType, CONSTANTS.LITERAL_8) == 0) { 
//  ADD 1 TO CT-C8-LOG-TYPE-ALERT
                  work.setCtC8LogTypeAlert(work.getCtC8LogTypeAlert()+(long)1);
//  MOVE '********' TO RP-C8-H6-ALERT
//  LITERAL_STR8_ = '********'
                  rpC8Heading6.setRpC8H6Alert(CONSTANTS.LITERAL_STR8_);
//  MOVE '********' TO RP-C8-DET-1-ALERT
//  LITERAL_STR8_ = '********'
                  rpC8Detail1.setRpC8Det1Alert(CONSTANTS.LITERAL_STR8_);
              }
  
//  ELSE
              else { 
//  MOVE SPACES TO RP-C8-H6-ALERT
                  rpC8Heading6.setRpC8H6Alert(CONSTANTS.SPACE_8);
//  MOVE SPACES TO RP-C8-DET-1-ALERT
                  rpC8Detail1.setRpC8Det1Alert(CONSTANTS.SPACE_8);
              }
          }
          sf503RcRecordType = sf503RemoteConsoleLog.getSf503RcRecordType();
//  IF SF503-RC-RECORD-TYPE = '1'
//  LITERAL_1 = '1'
          if (compareChars(sf503RcRecordType, CONSTANTS.LITERAL_1) == 0) { 
//  ADD 1 TO CT-C8-LOG-TYPE-4
              work.setCtC8LogType4(work.getCtC8LogType4()+(long)1);
//  MOVE RP-C8-LOG-DESC-1 TO RP-C8-DET-1-LOG-DESC
              rpC8Detail1.setRpC8Det1LogDesc(work.getRpC8LogDesc1());
          }
  
//  ELSE
          else { 
              sf503RcRecordType = sf503RemoteConsoleLog.getSf503RcRecordType();
//  IF SF503-RC-RECORD-TYPE = '2'
//  LITERAL_2 = '2'
              if (compareChars(sf503RcRecordType, CONSTANTS.LITERAL_2) == 0) { 
//  ADD 1 TO CT-C8-LOG-TYPE-2
                  work.setCtC8LogType2(work.getCtC8LogType2()+(long)1);
//  MOVE RP-C8-LOG-DESC-2 TO RP-C8-DET-1-LOG-DESC
                  rpC8Detail1.setRpC8Det1LogDesc(work.getRpC8LogDesc2());
              }
  
//  ELSE
              else { 
                  sf503RcRecordType = sf503RemoteConsoleLog.getSf503RcRecordType();
//  IF SF503-RC-RECORD-TYPE = '3'
//  LITERAL_3 = '3'
                  if (compareChars(sf503RcRecordType, CONSTANTS.LITERAL_3) == 0) { 
//  ADD 1 TO CT-C8-LOG-TYPE-3
                      work.setCtC8LogType3(work.getCtC8LogType3()+(long)1);
//  MOVE RP-C8-LOG-DESC-3 TO RP-C8-DET-1-LOG-DESC
                      rpC8Detail1.setRpC8Det1LogDesc(work.getRpC8LogDesc3());
                  }
  
//  ELSE
                  else { 
                      sf503RcRecordType = sf503RemoteConsoleLog.getSf503RcRecordType();
//  IF SF503-RC-RECORD-TYPE = '4'
//  LITERAL_4 = '4'
                      if (compareChars(sf503RcRecordType, CONSTANTS.LITERAL_4) == 0) { 
//  ADD 1 TO CT-C8-LOG-TYPE-4
                          work.setCtC8LogType4(work.getCtC8LogType4()+(long)1);
//  MOVE RP-C8-LOG-DESC-4 TO RP-C8-DET-1-LOG-DESC
                          rpC8Detail1.setRpC8Det1LogDesc(work.getRpC8LogDesc4());
                      }
  
//  ELSE
                      else { 
                          sf503RcRecordType = sf503RemoteConsoleLog.getSf503RcRecordType();
//  IF SF503-RC-RECORD-TYPE = '5'
//  LITERAL_5 = '5'
                          if (compareChars(sf503RcRecordType, CONSTANTS.LITERAL_5) == 0) { 
//  ADD 1 TO CT-C8-LOG-TYPE-5
                              work.setCtC8LogType5(work.getCtC8LogType5()+(long)1);
//  MOVE RP-C8-LOG-DESC-5 TO RP-C8-DET-1-LOG-DESC
                              rpC8Detail1.setRpC8Det1LogDesc(work.getRpC8LogDesc5());
                          }
  
//  ELSE
                          else { 
                              sf503RcRecordType = sf503RemoteConsoleLog.getSf503RcRecordType();
//  IF SF503-RC-RECORD-TYPE = '6'
//  LITERAL_6 = '6'
                              if (compareChars(sf503RcRecordType, CONSTANTS.LITERAL_6) == 0) { 
//  ADD 1 TO CT-C8-LOG-TYPE-6
                                  work.setCtC8LogType6(work.getCtC8LogType6()+(long)1);
//  MOVE RP-C8-LOG-DESC-6 TO RP-C8-DET-1-LOG-DESC
                                  rpC8Detail1.setRpC8Det1LogDesc(work.getRpC8LogDesc6());
                              }
  
//  ELSE
                              else { 
                                  sf503RcRecordType = sf503RemoteConsoleLog.getSf503RcRecordType();
//  IF SF503-RC-RECORD-TYPE = '7'
//  LITERAL_7 = '7'
                                  if (compareChars(sf503RcRecordType, CONSTANTS.LITERAL_7) == 0) { 
//  ADD 1 TO CT-C8-LOG-TYPE-7
                                      work.setCtC8LogType7(work.getCtC8LogType7()+(long)1);
//  MOVE RP-C8-LOG-DESC-7 TO RP-C8-DET-1-LOG-DESC
                                      rpC8Detail1.setRpC8Det1LogDesc(work.getRpC8LogDesc7());
                                  }
  
//  ELSE
                                  else { 
                                      sf503RcRecordType = sf503RemoteConsoleLog.getSf503RcRecordType();
//  IF SF503-RC-RECORD-TYPE = '8'
//  LITERAL_8 = '8'
                                      if (compareChars(sf503RcRecordType, CONSTANTS.LITERAL_8) == 0) { 
//  ADD 1 TO CT-C8-LOG-TYPE-8
                                          work.setCtC8LogType8(work.getCtC8LogType8()+(long)1);
//  MOVE RP-C8-LOG-DESC-8 TO RP-C8-DET-1-LOG-DESC
                                          rpC8Detail1.setRpC8Det1LogDesc(work.getRpC8LogDesc8());
                                      }
  
//  ELSE
                                      else { 
//  ADD 1 TO CT-C8-UNDEF-LOG-TYPE
                                          work.setCtC8UndefLogType(work.getCtC8UndefLogType()+(long)1);
                                      }
                                  }
                              }
                          }
                      }
                  }
              }
          }
//  MOVE 'H' TO RP-REPORT-CODE
//  LITERAL_H = 'H'
          rpReportPrintLine.setRpReportCode(CONSTANTS.LITERAL_H);
          // MOVE '0' TO RP-C8-DET-1-CC
          //  LITERAL_0 = '0'
          rpC8Detail1.setRpC8Det1Cc(CONSTANTS.LITERAL_0);
//  MOVE SF503-RC-TIME-HH TO WA-TIME-HH-9
          work.setWaTimeHh9(sf503RcTime.getSf503RcTimeHh());
  
//  MOVE SF503-RC-TIME-MM TO WA-TIME-MM-9
          work.setWaTimeMm9(sf503RcTime.getSf503RcTimeMm());
  
//  MOVE SF503-RC-TIME-SS TO WA-TIME-SS-9
          work.setWaTimeSs9(sf503RcTime.getSf503RcTimeSs());
  
//  MOVE WA-TIME-HH-9 TO WA-TIME-HOURS 800-REC-TIME-HH
          waTime.setWaTimeHours(String.valueOf(work.getWaTimeHh9String()).toCharArray());
          recTime800.setRecTimeHh800(String.valueOf(work.getWaTimeHh9String()).toCharArray());
  
//  MOVE WA-TIME-MM-9 TO WA-TIME-MINUTES 800-REC-TIME-MM
          waTime.setWaTimeMinutes(String.valueOf(work.getWaTimeMm9String()).toCharArray());
          recTime800.setRecTimeMm800(String.valueOf(work.getWaTimeMm9String()).toCharArray());
  
//  MOVE WA-TIME-SS-9 TO WA-TIME-SECONDS 800-REC-TIME-SS
          waTime.setWaTimeSeconds(String.valueOf(work.getWaTimeSs9String()).toCharArray());
          recTime800.setRecTimeSs800(String.valueOf(work.getWaTimeSs9String()).toCharArray());
  
          // MOVE WA-TIME TO RP-C8-DET-1-LOG-TIME
          rpC8Detail1.setRpC8Det1LogTime(waTime.toCharArray());
//  MOVE SF503-RC-DATE-MM TO WA-DATE-MN-9
          work.setWaDateMn9(sf503RcDate.getSf503RcDateMm());
  
//  MOVE SF503-RC-DATE-DD TO WA-DATE-DY-9
          work.setWaDateDy9(sf503RcDate.getSf503RcDateDd());
  
//  MOVE SF503-RC-DATE-YY TO WA-DATE-YR-9
          work.setWaDateYr9(sf503RcDate.getSf503RcDateYy());
  
//  MOVE WA-DATE-MN-9 TO WA-DATE-MONTH 800-REC-DATE-MM
          waDate.setWaDateMonth(String.valueOf(work.getWaDateMn9String()).toCharArray());
          recDate800.setRecDateMm800(String.valueOf(work.getWaDateMn9String()).toCharArray());
  
//  MOVE WA-DATE-DY-9 TO WA-DATE-DAY 800-REC-DATE-DD
          waDate.setWaDateDay(String.valueOf(work.getWaDateDy9String()).toCharArray());
          recDate800.setRecDateDd800(String.valueOf(work.getWaDateDy9String()).toCharArray());
  
//  MOVE WA-DATE-YR-9 TO WA-DATE-YEAR 800-REC-DATE-YY
          waDate.setWaDateYear(String.valueOf(work.getWaDateYr9String()).toCharArray());
          recDate800.setRecDateYy800(String.valueOf(work.getWaDateYr9String()).toCharArray());
  
//  MOVE 300-LIT-20 TO 800-REC-DATE-CC
          recDate800.setRecDateCc800(work.getLit20300());
  
          // MOVE WA-DATE TO RP-C8-DET-1-LOG-DATE
          rpC8Detail1.setRpC8Det1LogDate(waDate.toCharArray());
//  MOVE SF503-RC-RECORD-TYPE TO RP-C8-DET-1-LOG-TYPE 800-REC-TYPE
          rpC8Detail1.setRpC8Det1LogType(sf503RemoteConsoleLog.getSf503RcRecordType());
          infoSecRcd800.setRecType800(sf503RemoteConsoleLog.getSf503RcRecordType());
  
//  MOVE SF503-RC-LOCAL-MIP-ID TO RP-C8-DET-1-LOC-MIP-ID 800-LOCAL-MIP-ID
          rpC8Detail1.setRpC8Det1LocMipId(sf503RemoteConsoleLog.getSf503RcLocalMipId());
          infoSecRcd800.setLocalMipId800(sf503RemoteConsoleLog.getSf503RcLocalMipId());
  
//  MOVE SF503-RC-REMOTE-MIP-ID TO RP-C8-DET-1-REM-MIP-ID 800-REM-MIP-ID
          rpC8Detail1.setRpC8Det1RemMipId(sf503RemoteConsoleLog.getSf503RcRemoteMipId());
          infoSecRcd800.setRemMipId800(sf503RemoteConsoleLog.getSf503RcRemoteMipId());
  
//  MOVE SF503-RC-OPERATOR-ID TO RP-C8-DET-1-OPER-ID 800-OPER-ID
          rpC8Detail1.setRpC8Det1OperId(sf503RemoteConsoleLog.getSf503RcOperatorId());
          infoSecRcd800.setOperId800(sf503RemoteConsoleLog.getSf503RcOperatorId());
  
//  MOVE 300-LIT-8 TO 800-REC-CLASS
          infoSecRcd800.setRecClass800(work.getLit8300());
//  MOVE SF503-RC-MESSAGE-AREA TO 800-MESSAGE
          infoSecRcd800.setMessage800(sf503RemoteConsoleLog.getSf503RcMessageArea());
  
//  PERFORM 2300-WRITE-INFO-SEC-RECORD
          writeInfoSecRecord();/*2300-WRITE-INFO-SEC-RECORD*/
//  IF SF503-RC-REMOTE-MIP-ID = PREV-RC-REMOTE-MIP-ID
          prevRcRemoteMipId = work.getPrevRcRemoteMipId();
          sf503RcRemoteMipId = sf503RemoteConsoleLog.getSf503RcRemoteMipId();
//  ELSE
          if (		compareChars(sf503RcRemoteMipId,prevRcRemoteMipId) != 0 ) { 
//  PERFORM 2010-FORMAT-REM-CONS-RPT-HDR
              formatRemConsRptHdr();/*2010-FORMAT-REM-CONS-RPT-HDR*/
              // MOVE SF503-RC-REMOTE-MIP-ID TO PREV-RC-REMOTE-MIP-ID
              work.setPrevRcRemoteMipId(sf50301.getSf503RemoteConsoleLog().getSf503RcRemoteMipId());
  
          }
  
          ctRptRcLineNo = work.getCtRptRcLineNo();
//  IF CT-RPT-RC-LINE-NO GREATER THAN 56
          if (	( ctRptRcLineNo > 56 )) { 
//  PERFORM 2010-FORMAT-REM-CONS-RPT-HDR
              formatRemConsRptHdr();/*2010-FORMAT-REM-CONS-RPT-HDR*/
          }
  
//  ELSE
          // MOVE RP-C8-DETAIL-1 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC8Detail1.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
//  MOVE SF503-RC-MESSAGE-AREA TO RP-C8-H6-MSG-AREA
          rpC8Heading6.setRpC8H6MsgArea(sf503RemoteConsoleLog.getSf503RcMessageArea());
  
          // MOVE RP-C8-HEADING-6 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC8Heading6.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
//  ADD 3 TO CT-RPT-RC-LINE-NO
          work.setCtRptRcLineNo(work.getCtRptRcLineNo()+3);
//  ADD 1 TO CT-LOG-REM-CONS
          work.setCtLogRemCons(work.getCtLogRemCons()+(long)1);
//  RETURN SORT-WORK-FILE RECORD INTO GENERAL-SORT-AREA
                if(useSortFileStrategy()) {
                  sortWorkFileInternOut.read();
                  if (!sortWorkFileInternOut.hasEnded()) {
                  	generalSortArea.setString(sortWorkFileInternOut.getRecord());
                  }    
              } else {
          setRecIndex(getRecIndex()+1);
          if (getRecIndex() < sortRecKeys.size() ) { 
             if (isUsingSortInFile()) generalSortArea.setString(convertEbcdicBytes2Char(getReturnRecord(getRecIndex())));
             else generalSortArea.setString(getReturnRecord(getRecIndex())); 
          }
          }
//  AT END
              if (isSortRecordsEnded()) { 
//  MOVE HIGH-VALUES TO SF503-SORT-MIP-ID
                  sf503SortFields.setSf503SortMipId(CONSTANTS.HIGH_VALUE_1986603238);
  
                }
          sf503SortMipId = sf503SortFields.getSf503SortMipId();
//  IF SF503-SORT-MIP-ID NOT EQUAL HIGH-VALUES
          if (!( isHighValue(sf503SortMipId) ) ) { 
//  MOVE GENERAL-SORT-ID TO SF503-SORT-MIP-ID
              sf503SortFields.setSf503SortMipId(generalSortArea.getGeneralSortId());
  
//  MOVE GENERAL-SORT-DATE TO SF503-SORT-DATE
              sf503SortFields.setSf503SortDate(generalSortArea.getGeneralSortDate());
  
//  MOVE GENERAL-SORT-TIME TO SF503-SORT-TIME
              sf503SortFields.setSf503SortTime(generalSortArea.getGeneralSortTime());
  
//  MOVE GENERAL-SORT-CLASS TO SF503-LOG-RECORD ( 300-NUM-ONE : 300-NUM-ONE )
              sf50301.replace(generalSortArea/*parent*/,17/*fromOffset - (sf503LogRecord) */,1/*fromLen*/,15+work.getNumOne300() - 1/*toOffset - (generalSortClass) */,work.getNumOne300()/*toLen*/);
//  MOVE GENERAL-SORT-REST TO SF503-LOG-RECORD ( 300-NUM-TWO : )
              sf50301.replace(generalSortArea/*parent*/,18/*fromOffset - (sf503LogRecord) */,8176/*fromLen*/,15+work.getNumTwo300() - 1/*toOffset - (generalSortRest) */,32737/*toLen*/);
          }
  
      
      }
      /**
      * formatRemConsRptHdr 
      *   This method is derived from 
  *   COBOL Paragraph - 2010-FORMAT-REM-CONS-RPT-HDR COBOL Cyclomatic complexity - 1
      * Input  :  

      * - rpHeading1                     COBOL Name: RP-HEADING-1
      * - rpC8Heading2                   COBOL Name: RP-C8-HEADING-2
      * - ctRptRcPageNo                  COBOL Name: CT-RPT-RC-PAGE-NO
      * - rpC8Heading3                   COBOL Name: RP-C8-HEADING-3
      * - rpC8Heading4                   COBOL Name: RP-C8-HEADING-4
      * - rpC8Heading5                   COBOL Name: RP-C8-HEADING-5
      *
      * Output :  

      * - rpReportCode                   COBOL Name: RP-REPORT-CODE
      * - rpH1RptCode                    COBOL Name: RP-H1-RPT-CODE
      * - rpPrintLine                    COBOL Name: RP-PRINT-LINE
      * - rpHeading1                     COBOL Name: RP-HEADING-1
      * - rpC8Heading2                   COBOL Name: RP-C8-HEADING-2
      * - ctRptRcPageNo                  COBOL Name: CT-RPT-RC-PAGE-NO
      * - rpC8H3Pagenumber               COBOL Name: RP-C8-H3-PAGENUMBER
      * - rpC8Heading3                   COBOL Name: RP-C8-HEADING-3
      * - rpC8Heading4                   COBOL Name: RP-C8-HEADING-4
      * - rpC8Heading5                   COBOL Name: RP-C8-HEADING-5
      * - ctRptRcLineNo                  COBOL Name: CT-RPT-RC-LINE-NO
      *
      * @throws CFException
      */
      private void formatRemConsRptHdr() throws Exception {
//  MOVE 'H' TO RP-REPORT-CODE
//  LITERAL_H = 'H'
          rpReportPrintLine.setRpReportCode(CONSTANTS.LITERAL_H);
//  MOVE 'HH' TO RP-H1-RPT-CODE
//  LITERAL_HH = 'HH'
          rpHeading1.setRpH1RptCode(CONSTANTS.LITERAL_HH);
          // MOVE RP-HEADING-1 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpHeading1.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
//  MOVE RP-C8-HEADING-2 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(pad(133,work.getRpC8Heading2(),SPACE_CHAR,RIGHT_PAD));
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
//  ADD 1 TO CT-RPT-RC-PAGE-NO
          work.setCtRptRcPageNo(work.getCtRptRcPageNo()+1);
//  MOVE CT-RPT-RC-PAGE-NO TO RP-C8-H3-PAGENUMBER
//  FORMAT_1059277505 = "ZZZ9"
          rpC8Heading3.setRpC8H3Pagenumber(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(work.getCtRptRcPageNo()).toCharArray()));
          // MOVE RP-C8-HEADING-3 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC8Heading3.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
//  MOVE RP-C8-HEADING-4 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(pad(133,work.getRpC8Heading4(),SPACE_CHAR,RIGHT_PAD));
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
//  MOVE RP-C8-HEADING-5 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(pad(133,work.getRpC8Heading5(),SPACE_CHAR,RIGHT_PAD));
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
//  MOVE 7 TO CT-RPT-RC-LINE-NO
//  LITERAL_7 = 7
          work.setCtRptRcLineNo(7);
      
      }
      /**
      * formatRemConsTotals 
      *   This method is derived from 
  *   COBOL Paragraph - 2200-FORMAT-REM-CONS-TOTALS COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void formatRemConsTotals() throws Exception {
//  PERFORM 2200-FORMAT-REM-CONS-TOTALS-SPLIT6
          formatRemConsTotalsSplit6();/*2200-FORMAT-REM-CONS-TOTALS-SPLIT6*/
//  PERFORM 2200-FORMAT-REM-CONS-TOTALS-SPLIT7
          formatRemConsTotalsSplit7();/*2200-FORMAT-REM-CONS-TOTALS-SPLIT7*/
      
      }
      /**
      * formatRemConsTotalsSplit6 
      *   This method is derived from 
  *   COBOL Paragraph - 2200-FORMAT-REM-CONS-TOTALS-SPLIT6 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - rpHeading1                     COBOL Name: RP-HEADING-1
      * - rpC8Heading2                   COBOL Name: RP-C8-HEADING-2
      * - ctRptRcPageNo                  COBOL Name: CT-RPT-RC-PAGE-NO
      * - rpC8Heading3                   COBOL Name: RP-C8-HEADING-3
      * - rpC7Heading5                   COBOL Name: RP-C7-HEADING-5
      * - rpC8LogDesc1                   COBOL Name: RP-C8-LOG-DESC-1
      * - ctC8LogType1                   COBOL Name: CT-C8-LOG-TYPE-1
      * - rpC7Detail                     COBOL Name: RP-C7-DETAIL
      * - rpC8LogDesc2                   COBOL Name: RP-C8-LOG-DESC-2
      * - ctC8LogType2                   COBOL Name: CT-C8-LOG-TYPE-2
      * - rpC8LogDesc3                   COBOL Name: RP-C8-LOG-DESC-3
      * - ctC8LogType3                   COBOL Name: CT-C8-LOG-TYPE-3
      * - rpC8LogDesc4                   COBOL Name: RP-C8-LOG-DESC-4
      * - ctC8LogType4                   COBOL Name: CT-C8-LOG-TYPE-4
      * - rpC8LogDesc5                   COBOL Name: RP-C8-LOG-DESC-5
      * - ctC8LogType5                   COBOL Name: CT-C8-LOG-TYPE-5
      * - rpC8LogDesc6                   COBOL Name: RP-C8-LOG-DESC-6
      * - ctC8LogType6                   COBOL Name: CT-C8-LOG-TYPE-6
      * - rpC8LogDesc7                   COBOL Name: RP-C8-LOG-DESC-7
      * - ctC8LogType7                   COBOL Name: CT-C8-LOG-TYPE-7
      * - rpC8LogDesc8                   COBOL Name: RP-C8-LOG-DESC-8
      * - ctC8LogType8                   COBOL Name: CT-C8-LOG-TYPE-8
      *
      * Output :  

      * - rpReportCode                   COBOL Name: RP-REPORT-CODE
      * - rpH1RptCode                    COBOL Name: RP-H1-RPT-CODE
      * - rpPrintLine                    COBOL Name: RP-PRINT-LINE
      * - rpHeading1                     COBOL Name: RP-HEADING-1
      * - rpC8Heading2                   COBOL Name: RP-C8-HEADING-2
      * - ctRptRcPageNo                  COBOL Name: CT-RPT-RC-PAGE-NO
      * - rpC8H3Pagenumber               COBOL Name: RP-C8-H3-PAGENUMBER
      * - rpC8Heading3                   COBOL Name: RP-C8-HEADING-3
      * - rpC7Heading5                   COBOL Name: RP-C7-HEADING-5
      * - rpC7DetCc                      COBOL Name: RP-C7-DET-CC
      * - rpC7DetLogType                 COBOL Name: RP-C7-DET-LOG-TYPE
      * - rpC7DetLogDesc                 COBOL Name: RP-C7-DET-LOG-DESC
      * - rpC8LogDesc1                   COBOL Name: RP-C8-LOG-DESC-1
      * - rpC7DetTotal                   COBOL Name: RP-C7-DET-TOTAL
      * - ctC8LogType1                   COBOL Name: CT-C8-LOG-TYPE-1
      * - rpC7Detail                     COBOL Name: RP-C7-DETAIL
      * - rpC8LogDesc2                   COBOL Name: RP-C8-LOG-DESC-2
      * - ctC8LogType2                   COBOL Name: CT-C8-LOG-TYPE-2
      * - rpC8LogDesc3                   COBOL Name: RP-C8-LOG-DESC-3
      * - ctC8LogType3                   COBOL Name: CT-C8-LOG-TYPE-3
      * - rpC8LogDesc4                   COBOL Name: RP-C8-LOG-DESC-4
      * - ctC8LogType4                   COBOL Name: CT-C8-LOG-TYPE-4
      * - rpC8LogDesc5                   COBOL Name: RP-C8-LOG-DESC-5
      * - ctC8LogType5                   COBOL Name: CT-C8-LOG-TYPE-5
      * - rpC8LogDesc6                   COBOL Name: RP-C8-LOG-DESC-6
      * - ctC8LogType6                   COBOL Name: CT-C8-LOG-TYPE-6
      * - rpC8LogDesc7                   COBOL Name: RP-C8-LOG-DESC-7
      * - ctC8LogType7                   COBOL Name: CT-C8-LOG-TYPE-7
      * - rpC8LogDesc8                   COBOL Name: RP-C8-LOG-DESC-8
      * - ctC8LogType8                   COBOL Name: CT-C8-LOG-TYPE-8
      *
      * @throws CFException
      */
      private void formatRemConsTotalsSplit6() throws Exception {
//  MOVE 'H' TO RP-REPORT-CODE
//  LITERAL_H = 'H'
          rpReportPrintLine.setRpReportCode(CONSTANTS.LITERAL_H);
//  MOVE 'HH' TO RP-H1-RPT-CODE
//  LITERAL_HH = 'HH'
          rpHeading1.setRpH1RptCode(CONSTANTS.LITERAL_HH);
          // MOVE RP-HEADING-1 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpHeading1.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
//  MOVE RP-C8-HEADING-2 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(pad(133,work.getRpC8Heading2(),SPACE_CHAR,RIGHT_PAD));
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
//  ADD 1 TO CT-RPT-RC-PAGE-NO
          work.setCtRptRcPageNo(work.getCtRptRcPageNo()+1);
//  MOVE CT-RPT-RC-PAGE-NO TO RP-C8-H3-PAGENUMBER
//  FORMAT_1059277505 = "ZZZ9"
          rpC8Heading3.setRpC8H3Pagenumber(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(work.getCtRptRcPageNo()).toCharArray()));
          // MOVE RP-C8-HEADING-3 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC8Heading3.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
//  MOVE RP-C7-HEADING-5 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(work.getRpC7Heading5());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
          // MOVE '0' TO RP-C7-DET-CC
          //  LITERAL_0 = '0'
          rpC7Detail.setRpC7DetCc(CONSTANTS.LITERAL_0);
          // MOVE '1' TO RP-C7-DET-LOG-TYPE
          //  LITERAL_1 = '1'
          rpC7Detail.setRpC7DetLogType(CONSTANTS.LITERAL_1);
//  MOVE RP-C8-LOG-DESC-1 TO RP-C7-DET-LOG-DESC
          rpC7Detail.setRpC7DetLogDesc(work.getRpC8LogDesc1());
//  MOVE CT-C8-LOG-TYPE-1 TO RP-C7-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          rpC7Detail.setRpC7DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(work.getCtC8LogType1()).toCharArray()));
          // MOVE RP-C7-DETAIL TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC7Detail.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
          // MOVE '2' TO RP-C7-DET-LOG-TYPE
          //  LITERAL_2 = '2'
          rpC7Detail.setRpC7DetLogType(CONSTANTS.LITERAL_2);
//  MOVE RP-C8-LOG-DESC-2 TO RP-C7-DET-LOG-DESC
          rpC7Detail.setRpC7DetLogDesc(work.getRpC8LogDesc2());
//  MOVE CT-C8-LOG-TYPE-2 TO RP-C7-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          rpC7Detail.setRpC7DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(work.getCtC8LogType2()).toCharArray()));
          // MOVE RP-C7-DETAIL TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC7Detail.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
          // MOVE '3' TO RP-C7-DET-LOG-TYPE
          //  LITERAL_3 = '3'
          rpC7Detail.setRpC7DetLogType(CONSTANTS.LITERAL_3);
//  MOVE RP-C8-LOG-DESC-3 TO RP-C7-DET-LOG-DESC
          rpC7Detail.setRpC7DetLogDesc(work.getRpC8LogDesc3());
//  MOVE CT-C8-LOG-TYPE-3 TO RP-C7-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          rpC7Detail.setRpC7DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(work.getCtC8LogType3()).toCharArray()));
          // MOVE RP-C7-DETAIL TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC7Detail.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
          // MOVE '4' TO RP-C7-DET-LOG-TYPE
          //  LITERAL_4 = '4'
          rpC7Detail.setRpC7DetLogType(CONSTANTS.LITERAL_4);
//  MOVE RP-C8-LOG-DESC-4 TO RP-C7-DET-LOG-DESC
          rpC7Detail.setRpC7DetLogDesc(work.getRpC8LogDesc4());
//  MOVE CT-C8-LOG-TYPE-4 TO RP-C7-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          rpC7Detail.setRpC7DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(work.getCtC8LogType4()).toCharArray()));
          // MOVE RP-C7-DETAIL TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC7Detail.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
          // MOVE '5' TO RP-C7-DET-LOG-TYPE
          //  LITERAL_5 = '5'
          rpC7Detail.setRpC7DetLogType(CONSTANTS.LITERAL_5);
//  MOVE RP-C8-LOG-DESC-5 TO RP-C7-DET-LOG-DESC
          rpC7Detail.setRpC7DetLogDesc(work.getRpC8LogDesc5());
//  MOVE CT-C8-LOG-TYPE-5 TO RP-C7-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          rpC7Detail.setRpC7DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(work.getCtC8LogType5()).toCharArray()));
          // MOVE RP-C7-DETAIL TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC7Detail.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
          // MOVE '6' TO RP-C7-DET-LOG-TYPE
          //  LITERAL_6 = '6'
          rpC7Detail.setRpC7DetLogType(CONSTANTS.LITERAL_6);
//  MOVE RP-C8-LOG-DESC-6 TO RP-C7-DET-LOG-DESC
          rpC7Detail.setRpC7DetLogDesc(work.getRpC8LogDesc6());
//  MOVE CT-C8-LOG-TYPE-6 TO RP-C7-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          rpC7Detail.setRpC7DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(work.getCtC8LogType6()).toCharArray()));
          // MOVE RP-C7-DETAIL TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC7Detail.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
          // MOVE '7' TO RP-C7-DET-LOG-TYPE
          //  LITERAL_7 = '7'
          rpC7Detail.setRpC7DetLogType(CONSTANTS.LITERAL_7);
//  MOVE RP-C8-LOG-DESC-7 TO RP-C7-DET-LOG-DESC
          rpC7Detail.setRpC7DetLogDesc(work.getRpC8LogDesc7());
//  MOVE CT-C8-LOG-TYPE-7 TO RP-C7-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          rpC7Detail.setRpC7DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(work.getCtC8LogType7()).toCharArray()));
          // MOVE RP-C7-DETAIL TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC7Detail.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
          // MOVE '8' TO RP-C7-DET-LOG-TYPE
          //  LITERAL_8 = '8'
          rpC7Detail.setRpC7DetLogType(CONSTANTS.LITERAL_8);
//  MOVE RP-C8-LOG-DESC-8 TO RP-C7-DET-LOG-DESC
          rpC7Detail.setRpC7DetLogDesc(work.getRpC8LogDesc8());
//  MOVE CT-C8-LOG-TYPE-8 TO RP-C7-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          rpC7Detail.setRpC7DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(work.getCtC8LogType8()).toCharArray()));
      
      }
      /**
      * formatRemConsTotalsSplit7 
      *   This method is derived from 
  *   COBOL Paragraph - 2200-FORMAT-REM-CONS-TOTALS-SPLIT7 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - rpC7Detail                     COBOL Name: RP-C7-DETAIL
      * - rpUndefLogDesc                 COBOL Name: RP-UNDEF-LOG-DESC
      * - ctC8UndefLogType               COBOL Name: CT-C8-UNDEF-LOG-TYPE
      * - rpC8LogDescAlert               COBOL Name: RP-C8-LOG-DESC-ALERT
      * - ctC8LogTypeAlert               COBOL Name: CT-C8-LOG-TYPE-ALERT
      *
      * Output :  

      * - rpPrintLine                    COBOL Name: RP-PRINT-LINE
      * - rpC7Detail                     COBOL Name: RP-C7-DETAIL
      * - rpC7DetLogType                 COBOL Name: RP-C7-DET-LOG-TYPE
      * - rpC7DetLogDesc                 COBOL Name: RP-C7-DET-LOG-DESC
      * - rpUndefLogDesc                 COBOL Name: RP-UNDEF-LOG-DESC
      * - rpC7DetTotal                   COBOL Name: RP-C7-DET-TOTAL
      * - ctC8UndefLogType               COBOL Name: CT-C8-UNDEF-LOG-TYPE
      * - rpC8LogDescAlert               COBOL Name: RP-C8-LOG-DESC-ALERT
      * - ctC8LogTypeAlert               COBOL Name: CT-C8-LOG-TYPE-ALERT
      *
      * @throws CFException
      */
      private void formatRemConsTotalsSplit7() throws Exception {
          // MOVE RP-C7-DETAIL TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC7Detail.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
//  MOVE '-' TO RP-C7-DET-LOG-TYPE
//  LITERAL_MN_ = '-'
          rpC7Detail.setRpC7DetLogType(CONSTANTS.LITERAL_MN_);
//  MOVE RP-UNDEF-LOG-DESC TO RP-C7-DET-LOG-DESC
          rpC7Detail.setRpC7DetLogDesc(work.getRpUndefLogDesc());
//  MOVE CT-C8-UNDEF-LOG-TYPE TO RP-C7-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          rpC7Detail.setRpC7DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(work.getCtC8UndefLogType()).toCharArray()));
          // MOVE RP-C7-DETAIL TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC7Detail.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
//  MOVE '*' TO RP-C7-DET-LOG-TYPE
//  LITERAL_STR_ = '*'
          rpC7Detail.setRpC7DetLogType(CONSTANTS.LITERAL_STR_);
//  MOVE RP-C8-LOG-DESC-ALERT TO RP-C7-DET-LOG-DESC
          rpC7Detail.setRpC7DetLogDesc(work.getRpC8LogDescAlert());
//  MOVE CT-C8-LOG-TYPE-ALERT TO RP-C7-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          rpC7Detail.setRpC7DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(work.getCtC8LogTypeAlert()).toCharArray()));
          // MOVE RP-C7-DETAIL TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpC7Detail.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
          ;
      
      }
      /**
      * checkOperMsgArea 
      *   This method is derived from 
  *   COBOL Paragraph - 2020-CHECK-OPER-MSG-AREA COBOL Cyclomatic complexity - 12
      * Input  :  

      * - sf503RcMessageArea             COBOL Name: SF503-RC-MESSAGE-AREA
      * - sf503RcRecordType              COBOL Name: SF503-RC-RECORD-TYPE
      * - ctC8LogTypeAlert               COBOL Name: CT-C8-LOG-TYPE-ALERT
      *
      * Output :  

      * - securityAlertFlag              COBOL Name: WS-SECURITY-ALERT-FLAG
      * - operMsgArea                    COBOL Name: WS-OPER-MSG-AREA
      * - sf503RcMessageArea             COBOL Name: SF503-RC-MESSAGE-AREA
      * - msgPos25                       COBOL Name: WS-MSG-POS-2-5
      * - msgPos216                      COBOL Name: WS-MSG-POS-2-16
      * - msgPos17                       COBOL Name: WS-MSG-POS-17
      * - msgPos1722                     COBOL Name: WS-MSG-POS-17-22
      * - ctC8LogTypeAlert               COBOL Name: CT-C8-LOG-TYPE-ALERT
      * - rpC8H6Alert                    COBOL Name: RP-C8-H6-ALERT
      * - rpC8Det1Alert                  COBOL Name: RP-C8-DET-1-ALERT
      *
      * @throws CFException
      */
      private void checkOperMsgArea() throws Exception {
			// Declare local variables used in the method
			Sf503RemoteConsoleLog sf503RemoteConsoleLog = sf50301.getSf503RemoteConsoleLog();
			MsgPos216X msgPos216X = operMsgArea.getMsgPos216X();
			char[] msgPos25 = null;
			char[] sf503RcRecordType = null;
			char[] msgPos17 = null;
			char[] msgPos216 = null;
			char[] securityAlertFlag = null;
			MsgPos1722 msgPos1722 = operMsgArea.getMsgPos1722();
			// End of variable declaration

          // MOVE SPACES TO WS-SECURITY-ALERT-FLAG
          work.setSecurityAlertFlag(CONSTANTS.SPACE);
//  MOVE SF503-RC-MESSAGE-AREA TO WS-OPER-MSG-AREA
          operMsgArea.setString(sf503RemoteConsoleLog.getSf503RcMessageArea());
  
          sf503RcRecordType = sf503RemoteConsoleLog.getSf503RcRecordType();
//  IF SF503-RC-RECORD-TYPE = '1'
//  LITERAL_1 = '1'
          if (compareChars(sf503RcRecordType, CONSTANTS.LITERAL_1) == 0) { 
              msgPos25 = msgPos216X.getMsgPos25();
//  IF ( WS-MSG-POS-2-5 = '> #$' )
//  LITERAL_1031637533 = '> #$'
              if ((compareChars(msgPos25,CONSTANTS.LITERAL_1031637533) == 0)) { 
                  // MOVE '1' TO WS-SECURITY-ALERT-FLAG
                  //  LITERAL_1 = '1'
                  work.setSecurityAlertFlag(CONSTANTS.LITERAL_1);
              }
  
//  ELSE
          }
  
//  ELSE
          sf503RcRecordType = sf503RemoteConsoleLog.getSf503RcRecordType();
//  IF SF503-RC-RECORD-TYPE = '2'
//  LITERAL_2 = '2'
          if (compareChars(sf503RcRecordType, CONSTANTS.LITERAL_2) == 0) { 
              msgPos17 = msgPos1722.getMsgPos17();
//  IF ( ( WS-MSG-POS-2-16 = 'REMOTE STRDR #=' ) AND ( WS-MSG-POS-17 = '$' OR '+' ))
              if ((((compareChars(operMsgArea.getMsgPos216(),CONSTANTS.LITERAL_2098939503) == 0)) && ((compareChars(msgPos17, CONSTANTS.LITERAL_33824) == 0 || msgPos17[0] == '+')))) { 
                  // MOVE '1' TO WS-SECURITY-ALERT-FLAG
                  //  LITERAL_1 = '1'
                  work.setSecurityAlertFlag(CONSTANTS.LITERAL_1);
              }
  
//  ELSE
              else { 
                  msgPos216 = operMsgArea.getMsgPos216();
//  IF ( ( WS-MSG-POS-2-16 = 'REMOTE STRDR #+' ) OR ( WS-MSG-POS-2-16 = 'REMOTE STRDR #%' ))
//  LITERAL_REMOTE_B2_STRDRHS_PR_ = 'REMOTE STRDR #%'
                  if ((((compareChars(msgPos216,CONSTANTS.LITERAL_REMOTE_B2_STRDRHS_PL_) == 0)) || ((compareChars(msgPos216,CONSTANTS.LITERAL_REMOTE_B2_STRDRHS_PR_) == 0)))) { 
                      // MOVE '1' TO WS-SECURITY-ALERT-FLAG
                      //  LITERAL_1 = '1'
                      work.setSecurityAlertFlag(CONSTANTS.LITERAL_1);
                  }
  
//  ELSE
                  else { 
                      msgPos1722 = operMsgArea.getMsgPos1722();
//  IF ( ( WS-MSG-POS-2-16 = 'REMOTE STRDR #=' ) AND ( WS-MSG-POS-17-22 = 'W0C010' ))
//  LITERAL_W0C010 = 'W0C010'
                      if ((((compareChars(operMsgArea.getMsgPos216(),CONSTANTS.LITERAL_2098939503) == 0)) && ((		compareChars(msgPos1722,CONSTANTS.LITERAL_W0C010) == 0 )))) { 
                          // MOVE '1' TO WS-SECURITY-ALERT-FLAG
                          //  LITERAL_1 = '1'
                          work.setSecurityAlertFlag(CONSTANTS.LITERAL_1);
                      }
  
//  ELSE
                  }
              }
          }
  
//  ELSE
          securityAlertFlag = work.getSecurityAlertFlag();
//  IF WS-SECURITY-ALERT-FLAG = '1'
//  LITERAL_1 = '1'
          if (compareChars(securityAlertFlag, CONSTANTS.LITERAL_1) == 0) { 
//  ADD 1 TO CT-C8-LOG-TYPE-ALERT
              work.setCtC8LogTypeAlert(work.getCtC8LogTypeAlert()+(long)1);
//  MOVE '********' TO RP-C8-H6-ALERT
//  LITERAL_STR8_ = '********'
              rpC8Heading6.setRpC8H6Alert(CONSTANTS.LITERAL_STR8_);
//  MOVE '********' TO RP-C8-DET-1-ALERT
//  LITERAL_STR8_ = '********'
              rpC8Detail1.setRpC8Det1Alert(CONSTANTS.LITERAL_STR8_);
          }
  
//  ELSE
          else { 
//  MOVE SPACES TO RP-C8-H6-ALERT
              rpC8Heading6.setRpC8H6Alert(CONSTANTS.SPACE_8);
//  MOVE SPACES TO RP-C8-DET-1-ALERT
              rpC8Detail1.setRpC8Det1Alert(CONSTANTS.SPACE_8);
          }
      
      }
      /**
      * writeInfoSecRecord 
      *   This method is derived from 
  *   COBOL Paragraph - 2300-WRITE-INFO-SEC-RECORD COBOL Cyclomatic complexity - 1
      * Input  :  

      * - fdInfoSecFileOutRcd            COBOL Name: FD-INFO-SEC-FILE-OUT-RCD
      *
      * Output : None 

      * @throws CFException
      */
      private void writeInfoSecRecord() throws Exception {
//  WRITE FD-INFO-SEC-FILE-OUT-RCD FROM 800-INFO-SEC-RCD
          infoSecFileOut.write(infoSecRcd800.toCharArray()); 
          fdInfoSecFileOutRcd.setString(CONSTANTS.LOW_VALUE_1253879107);
      
      }
      /**
      * produceControlReport 
      *   This method is derived from 
  *   COBOL Paragraph - 4000-PRODUCE-CONTROL-REPORT COBOL Cyclomatic complexity - 1
      * Input  :  

      * - ctLogStats                     COBOL Name: CT-LOG-STATS
      * - ctLogBulkData                  COBOL Name: CT-LOG-BULK-DATA
      * - ctLogOperator                  COBOL Name: CT-LOG-OPERATOR
      * - ctLogPos                       COBOL Name: CT-LOG-POS
      * - ctLogMipProfile                COBOL Name: CT-LOG-MIP-PROFILE
      * - ctLogTypeii                    COBOL Name: CT-LOG-TYPEII
      * - ctLogRemCons                   COBOL Name: CT-LOG-REM-CONS
      * - ctLogX92                       COBOL Name: CT-LOG-X92
      * - ctLogEdc                       COBOL Name: CT-LOG-EDC
      * - ctLogChk                       COBOL Name: CT-LOG-CHK
      * - ctLogBulkData32                COBOL Name: CT-LOG-BULK-DATA32
      * - ctLogOther                     COBOL Name: CT-LOG-OTHER
      * - rpHeading1                     COBOL Name: RP-HEADING-1
      * - rpCoHeading2                   COBOL Name: RP-CO-HEADING-2
      * - rpCoEoj3                       COBOL Name: RP-CO-EOJ3
      * - rpCoEoj4                       COBOL Name: RP-CO-EOJ4
      * - rpCoEoj5                       COBOL Name: RP-CO-EOJ5
      * - rpCoEoj6                       COBOL Name: RP-CO-EOJ6
      * - rpCoEoj7                       COBOL Name: RP-CO-EOJ7
      * - rpCoEoj8                       COBOL Name: RP-CO-EOJ8
      * - rpCoEoj9                       COBOL Name: RP-CO-EOJ9
      * - rpCoEoj10                      COBOL Name: RP-CO-EOJ10
      * - rpCoEoj12                      COBOL Name: RP-CO-EOJ12
      * - rpCoEoj13                      COBOL Name: RP-CO-EOJ13
      * - rpCoEoj14                      COBOL Name: RP-CO-EOJ14
      * - rpCoEoj15                      COBOL Name: RP-CO-EOJ15
      *
      * Output :  

      * - rpReportCode                   COBOL Name: RP-REPORT-CODE
      * - rpH1RptCode                    COBOL Name: RP-H1-RPT-CODE
      * - rpCoEoj3TotalStats             COBOL Name: RP-CO-EOJ3-TOTAL-STATS
      * - ctLogStats                     COBOL Name: CT-LOG-STATS
      * - rpCoEoj4TotalBulk              COBOL Name: RP-CO-EOJ4-TOTAL-BULK
      * - ctLogBulkData                  COBOL Name: CT-LOG-BULK-DATA
      * - rpCoEoj5TotalOper              COBOL Name: RP-CO-EOJ5-TOTAL-OPER
      * - ctLogOperator                  COBOL Name: CT-LOG-OPERATOR
      * - rpCoEoj6TotalPos               COBOL Name: RP-CO-EOJ6-TOTAL-POS
      * - ctLogPos                       COBOL Name: CT-LOG-POS
      * - rpCoEoj7TotalMip               COBOL Name: RP-CO-EOJ7-TOTAL-MIP
      * - ctLogMipProfile                COBOL Name: CT-LOG-MIP-PROFILE
      * - rpCoEoj8TotalTypeii            COBOL Name: RP-CO-EOJ8-TOTAL-TYPEII
      * - ctLogTypeii                    COBOL Name: CT-LOG-TYPEII
      * - rpCoEoj9TotalRem               COBOL Name: RP-CO-EOJ9-TOTAL-REM
      * - ctLogRemCons                   COBOL Name: CT-LOG-REM-CONS
      * - rpCoEoj10TotalX92              COBOL Name: RP-CO-EOJ10-TOTAL-X92
      * - ctLogX92                       COBOL Name: CT-LOG-X92
      * - rpCoEoj12TotalEdc              COBOL Name: RP-CO-EOJ12-TOTAL-EDC
      * - ctLogEdc                       COBOL Name: CT-LOG-EDC
      * - rpCoEoj13TotalChk              COBOL Name: RP-CO-EOJ13-TOTAL-CHK
      * - ctLogChk                       COBOL Name: CT-LOG-CHK
      * - rpCoEoj14TtlBulk32             COBOL Name: RP-CO-EOJ14-TTL-BULK32
      * - ctLogBulkData32                COBOL Name: CT-LOG-BULK-DATA32
      * - rpCoEoj15TtlOther              COBOL Name: RP-CO-EOJ15-TTL-OTHER
      * - ctLogOther                     COBOL Name: CT-LOG-OTHER
      * - rpPrintLine                    COBOL Name: RP-PRINT-LINE
      * - rpHeading1                     COBOL Name: RP-HEADING-1
      * - rpCoH2Pagenumber               COBOL Name: RP-CO-H2-PAGENUMBER
      * - rpCoHeading2                   COBOL Name: RP-CO-HEADING-2
      * - rpCoEoj3                       COBOL Name: RP-CO-EOJ3
      * - rpCoEoj4                       COBOL Name: RP-CO-EOJ4
      * - rpCoEoj5                       COBOL Name: RP-CO-EOJ5
      * - rpCoEoj6                       COBOL Name: RP-CO-EOJ6
      * - rpCoEoj7                       COBOL Name: RP-CO-EOJ7
      * - rpCoEoj8                       COBOL Name: RP-CO-EOJ8
      * - rpCoEoj9                       COBOL Name: RP-CO-EOJ9
      * - rpCoEoj10                      COBOL Name: RP-CO-EOJ10
      * - rpCoEoj12                      COBOL Name: RP-CO-EOJ12
      * - rpCoEoj13                      COBOL Name: RP-CO-EOJ13
      * - rpCoEoj14                      COBOL Name: RP-CO-EOJ14
      * - rpCoEoj15                      COBOL Name: RP-CO-EOJ15
      *
      * @throws CFException
      */
      private void produceControlReport() throws Exception {
//  MOVE 'F' TO RP-REPORT-CODE
//  LITERAL_F = 'F'
          rpReportPrintLine.setRpReportCode(CONSTANTS.LITERAL_F);
//  MOVE 'FF' TO RP-H1-RPT-CODE
//  LITERAL_FF = 'FF'
          rpHeading1.setRpH1RptCode(CONSTANTS.LITERAL_FF);
//  MOVE CT-LOG-STATS TO RP-CO-EOJ3-TOTAL-STATS
//  FORMAT_59471873 = "ZZZZZ9"
          rpCoEoj3.setRpCoEoj3TotalStats(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_59471873,String.valueOf(work.getCtLogStats()).toCharArray()));
//  MOVE CT-LOG-BULK-DATA TO RP-CO-EOJ4-TOTAL-BULK
//  FORMAT_59471873 = "ZZZZZ9"
          rpCoEoj4.setRpCoEoj4TotalBulk(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_59471873,String.valueOf(work.getCtLogBulkData()).toCharArray()));
//  MOVE CT-LOG-OPERATOR TO RP-CO-EOJ5-TOTAL-OPER
//  FORMAT_59471873 = "ZZZZZ9"
          rpCoEoj5.setRpCoEoj5TotalOper(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_59471873,String.valueOf(work.getCtLogOperator()).toCharArray()));
//  MOVE CT-LOG-POS TO RP-CO-EOJ6-TOTAL-POS
//  FORMAT_59471873 = "ZZZZZ9"
          rpCoEoj6.setRpCoEoj6TotalPos(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_59471873,String.valueOf(work.getCtLogPos()).toCharArray()));
//  MOVE CT-LOG-MIP-PROFILE TO RP-CO-EOJ7-TOTAL-MIP
//  FORMAT_59471873 = "ZZZZZ9"
          rpCoEoj7.setRpCoEoj7TotalMip(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_59471873,String.valueOf(work.getCtLogMipProfile()).toCharArray()));
//  MOVE CT-LOG-TYPEII TO RP-CO-EOJ8-TOTAL-TYPEII
//  FORMAT_59471873 = "ZZZZZ9"
          rpCoEoj8.setRpCoEoj8TotalTypeii(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_59471873,String.valueOf(work.getCtLogTypeii()).toCharArray()));
//  MOVE CT-LOG-REM-CONS TO RP-CO-EOJ9-TOTAL-REM
//  FORMAT_59471873 = "ZZZZZ9"
          rpCoEoj9.setRpCoEoj9TotalRem(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_59471873,String.valueOf(work.getCtLogRemCons()).toCharArray()));
//  MOVE CT-LOG-X92 TO RP-CO-EOJ10-TOTAL-X92
//  FORMAT_59471873 = "ZZZZZ9"
          rpCoEoj10.setRpCoEoj10TotalX92(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_59471873,String.valueOf(work.getCtLogX92()).toCharArray()));
//  MOVE CT-LOG-EDC TO RP-CO-EOJ12-TOTAL-EDC
//  FORMAT_59471873 = "ZZZZZ9"
          rpCoEoj12.setRpCoEoj12TotalEdc(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_59471873,String.valueOf(work.getCtLogEdc()).toCharArray()));
//  MOVE CT-LOG-CHK TO RP-CO-EOJ13-TOTAL-CHK
//  FORMAT_59471873 = "ZZZZZ9"
          rpCoEoj13.setRpCoEoj13TotalChk(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_59471873,String.valueOf(work.getCtLogChk()).toCharArray()));
//  MOVE CT-LOG-BULK-DATA32 TO RP-CO-EOJ14-TTL-BULK32
//  FORMAT_59471873 = "ZZZZZ9"
          rpCoEoj14.setRpCoEoj14TtlBulk32(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_59471873,String.valueOf(work.getCtLogBulkData32()).toCharArray()));
//  MOVE CT-LOG-OTHER TO RP-CO-EOJ15-TTL-OTHER
//  FORMAT_59471873 = "ZZZZZ9"
          rpCoEoj15.setRpCoEoj15TtlOther(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_59471873,String.valueOf(work.getCtLogOther()).toCharArray()));
          // MOVE RP-HEADING-1 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpHeading1.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
//  MOVE 1 TO RP-CO-H2-PAGENUMBER
//  LITERAL_1 = 1, FORMAT_1059277505 = "ZZZ9"
          rpCoHeading2.setRpCoH2Pagenumber(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,CONSTANTS.LITERAL_1));
          // MOVE RP-CO-HEADING-2 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpCoHeading2.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
          // MOVE RP-CO-EOJ3 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpCoEoj3.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
          // MOVE RP-CO-EOJ4 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpCoEoj4.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
          // MOVE RP-CO-EOJ5 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpCoEoj5.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
          // MOVE RP-CO-EOJ6 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpCoEoj6.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
          // MOVE RP-CO-EOJ7 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpCoEoj7.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
          // MOVE RP-CO-EOJ8 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpCoEoj8.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
          // MOVE RP-CO-EOJ9 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpCoEoj9.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
          // MOVE RP-CO-EOJ10 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpCoEoj10.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
          // MOVE RP-CO-EOJ12 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpCoEoj12.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
          // MOVE RP-CO-EOJ13 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpCoEoj13.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
          // MOVE RP-CO-EOJ14 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpCoEoj14.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
          // MOVE RP-CO-EOJ15 TO RP-PRINT-LINE
          rpReportPrintLine.setRpPrintLine(rpCoEoj15.toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord();/*8000-WRITE-REPORT-RECORD*/
          ;
      
      }
      /**
      * setDateTime 
      *   This method is derived from 
  *   COBOL Paragraph - 6000-SET-DATE-TIME COBOL Cyclomatic complexity - 1
      * Input  :  

      * - waDate                         COBOL Name: WA-DATE
      * - waTime                         COBOL Name: WA-TIME
      *
      * Output :  

      * - waDateYmd                      COBOL Name: WA-DATE-YMD
      * - waDateMm                       COBOL Name: WA-DATE-MM
      * - waDateMonth                    COBOL Name: WA-DATE-MONTH
      * - waDateDd                       COBOL Name: WA-DATE-DD
      * - waDateDay                      COBOL Name: WA-DATE-DAY
      * - waDateYy                       COBOL Name: WA-DATE-YY
      * - waDateYear                     COBOL Name: WA-DATE-YEAR
      * - waTimeHmsh                     COBOL Name: WA-TIME-HMSH
      * - waTimeHh                       COBOL Name: WA-TIME-HH
      * - waTimeHours                    COBOL Name: WA-TIME-HOURS
      * - waTimeMm                       COBOL Name: WA-TIME-MM
      * - waTimeMinutes                  COBOL Name: WA-TIME-MINUTES
      * - waTimeSs                       COBOL Name: WA-TIME-SS
      * - waTimeSeconds                  COBOL Name: WA-TIME-SECONDS
      * - rpH1CurrentDate                COBOL Name: RP-H1-CURRENT-DATE
      * - rpH1CurrentDate1200            COBOL Name: 200-RP-H1-CURRENT-DATE1
      * - waDate                         COBOL Name: WA-DATE
      * - rpH1Curtime                    COBOL Name: RP-H1-CURTIME
      * - rpH1Curtime1200                COBOL Name: 200-RP-H1-CURTIME1
      * - waTime                         COBOL Name: WA-TIME
      *
      * @throws CFException
      */
      private void setDateTime() throws Exception {
//  ACCEPT WA-DATE-YMD FROM DATE
          waDateYmd.setString(CFUtil.getCurrentDateStr()); 
          // MOVE '211006' TO WA-DATE-YMD
          //  LITERAL_211006 = '211006'
          waDateYmd.setString(CONSTANTS.LITERAL_211006);
//  MOVE WA-DATE-MM TO WA-DATE-MONTH
          waDate.setWaDateMonth(waDateYmd.getWaDateMm());
//  MOVE WA-DATE-DD TO WA-DATE-DAY
          waDate.setWaDateDay(waDateYmd.getWaDateDd());
//  MOVE WA-DATE-YY TO WA-DATE-YEAR
          waDate.setWaDateYear(waDateYmd.getWaDateYy());
//  ACCEPT WA-TIME-HMSH FROM TIME
          waTimeHmsh.setString(getCurrentTimeString()); 
          // MOVE '07462500' TO WA-TIME-HMSH
          //  LITERAL_07462500 = '07462500'
          waTimeHmsh.setString(CONSTANTS.LITERAL_07462500);
//  MOVE WA-TIME-HH TO WA-TIME-HOURS
          waTime.setWaTimeHours(waTimeHmsh.getWaTimeHh());
//  MOVE WA-TIME-MM TO WA-TIME-MINUTES
          waTime.setWaTimeMinutes(waTimeHmsh.getWaTimeMm());
//  MOVE WA-TIME-SS TO WA-TIME-SECONDS
          waTime.setWaTimeSeconds(waTimeHmsh.getWaTimeSs());
          // MOVE WA-DATE TO RP-H1-CURRENT-DATE 200-RP-H1-CURRENT-DATE1
          rpHeading1.setRpH1CurrentDate(waDate.toCharArray());
          rpEmailHeading1200.setRpH1CurrentDate1200(waDate.toCharArray());
          // MOVE WA-TIME TO RP-H1-CURTIME 200-RP-H1-CURTIME1
          rpHeading1.setRpH1Curtime(waTime.toCharArray());
          rpEmailHeading1200.setRpH1Curtime1200(waTime.toCharArray());
      
      }
      /**
      * writeReportRecord 
      *   This method is derived from 
  *   COBOL Paragraph - 8000-WRITE-REPORT-RECORD COBOL Cyclomatic complexity - 1
      * Input  :  

      * - fdReportFileOutRcd             COBOL Name: FD-REPORT-FILE-OUT-RCD
      *
      * Output : None 

      * @throws CFException
      */
      private void writeReportRecord() throws Exception {
//  WRITE FD-REPORT-FILE-OUT-RCD FROM RP-REPORT-PRINT-LINE
          reportFileOut.write(rpReportPrintLine.toCharArray()); 
          fdReportFileOutRcd.setString(CONSTANTS.LOW_VALUE_215750933);
      
      }
      /**
      * writeEmailRecord 
      *   This method is derived from 
  *   COBOL Paragraph - 8100-WRITE-EMAIL-RECORD COBOL Cyclomatic complexity - 1
      * Input  :  

      * - sys203EmailFileOutRcd          COBOL Name: SYS203-EMAIL-FILE-OUT-RCD
      *
      * Output : None 

      * @throws CFException
      */
      private void writeEmailRecord() throws Exception {
      
// ******************************************************************
// *    8 1 0 0 - W r i t e - e m a i l - r e c o r d               *
// ******************************************************************
// *    1. write the records into email file.                       *
// ******************************************************************
//  WRITE SYS203-EMAIL-FILE-OUT-RCD FROM RP-REPORT-PRINT-LINE
          sys203EmailFileOut.write(rpReportPrintLine.toCharArray()); 
          sys203EmailFileOutRcd.setString(CONSTANTS.LOW_VALUE_215750933);
      
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
  
      /**
       * Method is used to collect SdSortKey sort keys 
       * from each record to perform COBOL sort statement. 
       *  
       * @param record
       * @param recLen    
       */
      public void addReleaseRecord(char[] record, int recLen) throws Exception {
      	if(recLen > record.length)  recLen = record.length;
      	SdSortKeyKeys relKey = new SdSortKeyKeys();
      	switch (sortKeysCaseId) {
              case 1:{
                  char[] keySdSortKey = new char[SDSORTKEY_LENGTH];
    System.arraycopy(record,SDSORTKEY_OFFSET,keySdSortKey,0,SDSORTKEY_LENGTH);
    relKey.setSdSortKey(convertChar2EbcdicBytes(keySdSortKey)); 
              }   break; 
              case 2:{  
                  char[] keySdSortKey = new char[SDSORTKEY_LENGTH];
    System.arraycopy(record,SDSORTKEY_OFFSET,keySdSortKey,0,SDSORTKEY_LENGTH);
    relKey.setSdSortKey(convertChar2EbcdicBytes(keySdSortKey)); 
                  char[] keySdSk2RemMipId = new char[SDSK2REMMIPID_LENGTH];
    System.arraycopy(record,SDSK2REMMIPID_OFFSET,keySdSk2RemMipId,0,SDSK2REMMIPID_LENGTH);
    relKey.setSdSk2RemMipId(convertChar2EbcdicBytes(keySdSk2RemMipId)); 
                  char[] keySdSk2OperatorId = new char[SDSK2OPERATORID_LENGTH];
    System.arraycopy(record,SDSK2OPERATORID_OFFSET,keySdSk2OperatorId,0,SDSK2OPERATORID_LENGTH);
    relKey.setSdSk2OperatorId(convertChar2EbcdicBytes(keySdSk2OperatorId)); 
                  char[] keySdSk2DateStamp = new char[SDSK2DATESTAMP_LENGTH];
    System.arraycopy(record,SDSK2DATESTAMP_OFFSET,keySdSk2DateStamp,0,SDSK2DATESTAMP_LENGTH);
    relKey.setSdSk2DateStamp(convertChar2EbcdicBytes(keySdSk2DateStamp)); 
                  char[] keySdSk2TimeStamp = new char[SDSK2TIMESTAMP_LENGTH];
    System.arraycopy(record,SDSK2TIMESTAMP_OFFSET,keySdSk2TimeStamp,0,SDSK2TIMESTAMP_LENGTH);
    relKey.setSdSk2TimeStamp(convertChar2EbcdicBytes(keySdSk2TimeStamp)); 
              }    break;
          }
          // Record start Posting 
          if (isUsingSortInFile() && isVBSortInFile()) setRecPos(getRecPos()+4);	
      	relKey.setSortRecPos(getRecPos()); // current record start position
      	relKey.setSortRecLen(recLen);
      	relKey.setFileIndx(getFileIndex());
      	sortRecKeys.add(relKey);
      	setRecPos(getRecPos()+recLen); // current record end position
          if(isWriteInTempFile()) writeRecordToTempFile(record,recLen); 
      } 
      /**
       * Method is used to return sorted records using SdSortKeyKeys object.
       * By passing records start position and records length, each record will
       * seek from memory mapped file and return as byte array.
       *  
       * @param index
       * @return  
       */  
      private byte[] getReturnRecord(int index) {
          byte[] record = new byte[0];
           if (sortProcesser != null) {
              record = sortProcesser.getRecord(index);
           }else {
      	try {
      		SdSortKeyKeys k = sortRecKeys.get(index);
      		record = readFromBuffer(k.getSortRecPos(),k.getSortRecLen());
      	} catch (Exception e) {
      		logger.error("Error in return record : {}",e.getMessage()); 
      	}
      	}
      	return record;
      }
      /**
       * Method is used to set the sort file need to fetch process  
       * based on File size and system memory 
       * @param useSortFileStartegy
       */
      private boolean useSortFileStrategy() {
      	return usingSortFileStrategy.equals("yes");
      }
      
      /**
        * Sort record array has ended or sort-return code has modified
        * @return boolean flag
        */
      private boolean isSortRecordsEnded() {
          if(useSortFileStrategy()) {
            return (sortWorkFileInternOut.hasEnded());
          }
      	return (sortRecKeys.size() <= getRecIndex());
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
*remarks.
*    *************************************************
*    *****      macs format and print            *****
*    *****      statistics log reports           *****
*    *************************************************
*
*    this program reads the general log file created by
*    sf310010 and creates eight reports. they are the bulk
*    data transmission audit trail report, the operator log
*    audit trail report and the statistics and error log report,
*    the mip profile log report ,the pos transaction log, the
*    type ii log report, the remote console activity report, and
*    the x9.2 activity report.
*
*    the general log file is sorted into mip id, log date and
*    log time sequence for the report generation.  this in done
*    using an internal sort.
*
*    split code            report title                  log class
*        a      bulk data transmission log                2 or b
*        b      operator log                                 5
*        c      statistics & error report (pending)          4
*        d      mip profile log report                       6
*        e      point of sale transaction log                3
*        f      statistics & error log control totals       n/a
**new*   g      type ii pass-thru undelivered transactions   7
**new*   h      remote console activity logs                 8
**new*   i      x9.2 activity transactions                   9
*****************************************************************
*  -- -- -- m o d u l e   h i s t o r y  s e c t i o n -- -- -- *
*****************************************************************
*  07/03/86  tcd *                                              *
*   clr-215  .01 ************************************************
*  05/04/87  meb * modified the following:                      *
*   dis-003      * 1. up'd the record size on sd sort-work-file *
*                *    from 207 to 397.                          *
*                * 2. up'd the record size on fd general-log-   *
*                *    file-in from 207 to 397.                  *
*                * 3. up'd the record size of fd temp-work-file *
*                *    from 207 to 397.                          *
*                * 4. changed copybook level of sf503010 from   *
*                *    01 to 02.                                 *
*                * 5. modified para 1000-format-reports to      *
*                *    recognize edc logs ('e') as a valid class *
*                *    but to bypass generating reports.         *
*****************************************************************
*  05/04/87  jjs * modified the following:                      *
*   dis-006      * 1. changed copybook level of sf503010 from   *
*                *    02 to 03.                                 *
*                * 2. modified paragraph 1000-format-reports to *
*                *    recognize check quarantee log records     *
*                *    ('c') as a valid class but to bypass      *
*                *    generating reports.                       *
*****************************************************************
*****************************************************************
*  08/24/88  jjs * modified the following:                      *
*                * 1. changed copybook level of sf503010 from   *
*                *    03 to 04.                                 *
*                * 2. modified paragraph 1000-format-reports to *
*                *    recognize 32 position bulk id's as valid  *
*                *    but to bypass generating reports          *
*****************************************************************
*  10/22/97  dec * modified the following:                      *
*                * 1. changed copybook level of sf503010 from   *
*                *    04 to 05.                                 *
*                * 2. sf503-ps-time-in-system-hh, mm, ss refer  *
*                *    to seconds and thousands of a second.     *
*                * 3. rf-ps-time-in-system-hh, mm, ss refer     *
*                *    to seconds and thousands of a second.     *
*****************************************************************
*  06/09/98  mfb * year 2000 requirements.                      *
*                * 1. comment out remarks verb and following    *
*                *    text.                                     *
*                * 2. alter sort to include century value       *
*                * 3. add mciwin-program subroutine             *
*****************************************************************
*  10/01/03  mfb * crf-6565                                     *
*                * 1. increase pan field to 19 positions        *
*                * 2. increase ica field to 6  positions        *
*                * 3. recompile for copybook change sf503010    *
*                * 4. replace call to mciwin to mcwin for 31-bit*
*                * 5. replace call to mciabend to mciabend 31bit*
*****************************************************************
*  10/15/04  smk * crf-8193                                     *
*                * increase mip id 2 to 3 bytes                 *
*****************************************************************
*  02/11/08      * rel 8.2 pci remote console -                 *
*  anish pillai  * modified to process 7 bytes operator id.     *
*****************************************************************
*  04/04/08      * rel 8.2 pci remote console -                 *
*  anish pillai  * modified to include new file for infosec.    *
*****************************************************************
*  01/28/09      * qc#3213 - modified to read general log file  *
*sangeetha gopal * as variable length file.                     *
*****************************************************************
*  15/12/09      * rel 10.2  auth message.                       *
*  chandrasekaran* modified to increase the length of general   *
*                * log file and increased the length in the     *
*                * working storage area.                        *
*****************************************************************
*  04/13/10      * rel 10.2  auth message expansion             *
*  prabeesh mc   * the temp workfile length is modified to 397  *
*                * for 10.2 ame system testing                  *
*****************************************************************
*  08/24/12      * c31338 13q2                                  *
*  r jones       * recompile                                    *
*****************************************************************
*  06/15/17      * prb83038 enh - alerts on core dump for authps*
*  vinitha t s   * modified to extract records having message id*
*                * as '9134a' and write out to sys203.          *
*                * modified para(s): 1200-, 6000-.              *
*                * new para(s): 1220-, 8100-.                   *
*****************************************************************
*  10/16/20      * i21311 - mip virtualization - operator msglog*
*                * rel21q2                                      *
*  vasanthkumar  * modified to check message id in both new and *
*       g        * old locations of sf503-op-operator-message   *
*                * as '9134a' and to increase the length of     *
*                * rp-op-operator-message.                      *
*                * modified para(s): 1200-.                     *
*****************************************************************
*  12/14/20      * s1774500 - defect fix.                       *
*                * rel21q2                                      *
*  vasanthkumar  * modified to fix the alignment issue in the   *
*       g        * email file (sys203) for the operator header- *
*                * message field.                               *
*****************************************************************
*  mm/dd/yy      * xxxxxxxx xxxx xxxxxxxx                       *
*  xxxxxxx       * xxxxxxxx xxxx                                *
*                * xxxxxxxx xxxx xxxxxxxx                       *
*****************************************************************
*/
