  package com.cloudframe.app.process.impl;
   /* The comment section is too large, 
	 * hence added at the end of the java code 
	 * please scroll all the way to the bottom to see complete comments 
	 */
  
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.sf320010.file.*;
  import com.cloudframe.app.sf320010.Sf320010Ctx.*;
  import com.cloudframe.app.sf320010.Sf320010Ctx;
  import com.cloudframe.app.process.Sf320010;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import com.cloudframe.app.sf320010.file.records.SdSortKeyKeys;
  import java.util.List;
  import java.util.ArrayList;
  import java.util.Comparator;
  import java.util.stream.Collectors;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.process.Mcwin;
  import com.cloudframe.app.process.*;
  import com.cloudframe.app.process.Mcabend;
  import com.cloudframe.app.data.Field;
  import java.math.BigDecimal;
  import java.util.Calendar;
  import java.util.TimeZone;
  import java.util.Date;
  import org.springframework.beans.factory.annotation.Value;
  import com.cloudframe.app.sf320010.dto.*;
  import com.cloudframe.app.sf320010.dto.InfoSecRcd800;
  import com.cloudframe.app.sf320010.dto.RpReportPrintLine;
  import com.cloudframe.app.sf320010.dto.GeneralSortArea;
  import com.cloudframe.app.sf320010.dto.Sf50301;
  import com.cloudframe.app.sf320010.dto.WaTimeHmsh;
  import com.cloudframe.app.sf320010.dto.RpMpDetail2;
  import com.cloudframe.app.sf320010.dto.RpCoEoj4;
  import com.cloudframe.app.sf320010.dto.RpMpDetail4;
  import com.cloudframe.app.sf320010.dto.RpC7Detail;
  import com.cloudframe.app.sf320010.dto.RpCoEoj6;
  import com.cloudframe.app.sf320010.file.records.FdReportFileOutRcd;
  import com.cloudframe.app.sf320010.dto.MciwinReturnedYear;
  import com.cloudframe.app.sf320010.dto.RpC8Heading6;
  import com.cloudframe.app.sf320010.dto.RpPsHeading2;
  import com.cloudframe.app.sf320010.dto.RpC7Heading4;
  import com.cloudframe.app.sf320010.dto.WaTime;
  import com.cloudframe.app.sf320010.dto.MciwinNewWindowYearGroup;
  import com.cloudframe.app.sf320010.dto.RpMpHeading2;
  import com.cloudframe.app.sf320010.dto.RpCoEoj12;
  import com.cloudframe.app.sf320010.file.records.SdSortWorkFileRcd;
  import com.cloudframe.app.sf320010.dto.RpCoEoj7;
  import com.cloudframe.app.sf320010.dto.RpPsDetail;
  import com.cloudframe.app.sf320010.dto.WaDateYmd;
  import com.cloudframe.app.sf320010.file.records.Sys203EmailFileOutRcd;
  import com.cloudframe.app.sf320010.dto.RpCoEoj10;
  import com.cloudframe.app.sf320010.dto.MciwinYearToWindow;
  import com.cloudframe.app.sf320010.dto.OperMsgArea;
  import com.cloudframe.app.sf320010.dto.RpC7Heading3;
  import com.cloudframe.app.sf320010.file.records.FdInfoSecFileOutRcd;
  import com.cloudframe.app.sf320010.dto.RpMpDetail6;
  import com.cloudframe.app.sf320010.dto.RpCoEoj9;
  import com.cloudframe.app.sf320010.dto.RpC9Detail;
  import com.cloudframe.app.sf320010.dto.WaDate;
  import com.cloudframe.app.sf320010.dto.RpMpDetail1;
  import com.cloudframe.app.sf320010.dto.RpC9Heading3;
  import com.cloudframe.app.sf320010.dto.RpOpDetail;
  import com.cloudframe.app.sf320010.dto.MciabendParms;
  import com.cloudframe.app.sf320010.dto.RpCoEoj8;
  import com.cloudframe.app.sf320010.file.records.FdGeneralLogFileInRcd;
  import com.cloudframe.app.sf320010.dto.RpCoEoj13;
  import com.cloudframe.app.sf320010.dto.RpMpDetail5;
  import com.cloudframe.app.sf320010.dto.RpC9Heading4;
  import com.cloudframe.app.sf320010.dto.RpBdHeading2;
  import com.cloudframe.app.sf320010.dto.RpEmailHeading1200;
  import com.cloudframe.app.sf320010.dto.RpCoEoj15;
  import com.cloudframe.app.sf320010.dto.RpBdDetail;
  import com.cloudframe.app.sf320010.dto.RpCoHeading2;
  import com.cloudframe.app.sf320010.dto.RpCoEoj5;
  import com.cloudframe.app.sf320010.dto.WaDateMdy;
  import com.cloudframe.app.sf320010.dto.GeneralWorkArea;
  import com.cloudframe.app.sf320010.dto.RpCoEoj3;
  import com.cloudframe.app.sf320010.dto.RpC8Detail1;
  import com.cloudframe.app.sf320010.dto.RpEmailOpHeading2200;
  import com.cloudframe.app.sf320010.dto.RpOpHeading2;
  import com.cloudframe.app.sf320010.dto.RpC8Heading3;
  import com.cloudframe.app.sf320010.dto.RpCoEoj14;
  import com.cloudframe.app.sf320010.dto.RpHeading1;
  import com.cloudframe.app.sf320010.file.records.FdTempWorkFileRcd;
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
  
  public class Sf320010Impl extends CommonProcess implements Sf320010, InitializingBean, DisposableBean {
  
  Logger logger = LoggerFactory.getLogger(Sf320010Impl.class);
  
  
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
      public int process(Sf320010Ctx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
ProcessInCtx methodIn = programCtx.getProcessInCtx();
ProcessOutCtx methodOut = methodIn.getProcessOutCtx();
          // MOVE WHEN-COMPILED TO COMPILE-DATE
          methodOut.setCompileDate(CONSTANTS.LITERAL_74527497);
//  DISPLAY 'SF320010 COMPILE DATE  ' COMPILE-DATE
          logger.info("SF320010 COMPILE DATE  {}", new String(methodOut.getCompileDate())); 
//  MOVE '0' TO FIRST-T2-RCD-IND
//  LITERAL_0 = '0'
          methodOut.setFirstT2RcdInd(CONSTANTS.LITERAL_0);
//  MOVE '0' TO FIRST-X92-RCD-IND
//  LITERAL_0 = '0'
          methodOut.setFirstX92RcdInd(CONSTANTS.LITERAL_0);
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
                sortInProcedure(programCtx.getSortInProcedureInCtx());
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
                sortOutProcedure(programCtx.getSortOutProcedureInCtx());
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
//  IF TEMP-RECS-WRITTEN-CNT GREATER THAN ZEROS
          if (	( methodIn.getTempRecsWrittenCnt() > 0 ) ) { 
//  SORT SORT-WORK-FILE ASCENDING KEY SD-SORT-KEY SD-SK2-REM-MIP-ID SD-SK2-OPERATOR-ID SD-SK2-DATE-STAMP SD-SK2-TIME-STAMP INPUT PROCEDURE IS 0100-SORT-IN-PROCEDURE OUTPUT PROCEDURE IS 0100-SORT-OUT-PROCEDURE
              try {
                   //SORT sortWorkFileInternIn input procedure temp file opened in write mode
                   sortWorkFileInternIn.open("w", sortWorkFileInternIn.getFileName(), sortWorkFileInternIn.getSortWorkFileInternInCharSet(),sortWorkFileInternIn.getSortWorkFileInternInCrlfFlag());
                 sortRecKeys = new ArrayList<>();
                 doSortPresets();
                  sortKeysCaseId = 2;
                    sortInProcedure0100(programCtx.getSortInProcedure0100InCtx());
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
                    sortOutProcedure0100(programCtx.getSortOutProcedure0100InCtx());
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
          formatRemConsTotals(programCtx);/*2200-FORMAT-REM-CONS-TOTALS*/
          if (programCtx.isProgramEnded()) {
              return programCtx.getRc();
          }
//  PERFORM 4000-PRODUCE-CONTROL-REPORT
          produceControlReport(programCtx.getProduceControlReportInCtx());/*4000-PRODUCE-CONTROL-REPORT*/
          if (programCtx.isProgramEnded()) {
              return programCtx.getRc();
          }
//  IF 400-EMAIL-RECS-WRITE-CNT LESS THAN 300-NUM-ONE
          if (	( methodIn.getEmailRecsWriteCnt400() < methodIn.getNumOne300() )) { 
//  MOVE 300-LIT-04 TO RETURN-CODE
              programCtx.setRc(CFUtil.getInt(methodOut.getLit04300()));
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
      @Override
      public SortInProcedureOutCtx sortInProcedure(SortInProcedureInCtx methodIn) throws Exception {
Sf320010Ctx programCtx = methodIn.getSf320010Ctx();
SortInProcedureOutCtx methodOut = methodIn.getSortInProcedureOutCtx();
//  OPEN INPUT GENERAL-LOG-FILE-IN
          generalLogFileIn.open(new String(CONSTANTS.MODE_READ_ONLY_36242),generalLogFileIn.getFileName(),generalLogFileIn.getGeneralLogFileInCharSet(),generalLogFileIn.getGeneralLogFileInCrlfFlag());
//  PERFORM WITH TEST BEFORE UNTIL GENERAL-LOG-EOF-SW EQUAL 'E'
          while ((methodOut.getGeneralLogEofSw()[0] != 'E')) {

// *****************************************************************
// ***                    Syntel changes                         ***
// *   changed perform read statements to in-line read statements  *
// *   avoiding an if condition check on every iteration           *
// *****************************************************************
//  READ GENERAL-LOG-FILE-IN INTO GENERAL-WORK-AREA
              	generalLogFileIn.read();
              methodIn.setSys001Lrecl400(generalLogFileIn.getRecLen());
              if (!generalLogFileIn.hasEnded()) {
                 methodOut.getFdGeneralLogFileInRcd().setString(generalLogFileIn.getRecord());
                 methodIn.getGeneralWorkArea().setString(replace(methodIn.getGeneralWorkArea().toCharArray(),substring(methodOut.getFdGeneralLogFileInRcd().toCharArray(),0,generalLogFileIn.getRecLen()),0,methodIn.getGeneralWorkArea().length()));
              }
//  AT END
              if (generalLogFileIn.hasEnded()) {  
                  // MOVE 'E' TO GENERAL-LOG-EOF-SW
                  //  LITERAL_E = 'E'
                  methodOut.setGeneralLogEofSw(CONSTANTS.LITERAL_E);
                }
//  IF GENERAL-LOG-EOF-SW EQUAL 'N'
//  LITERAL_N = 'N'
              if (compareChars(methodOut.getGeneralLogEofSw(), CONSTANTS.LITERAL_N) == 0) { 

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
                  methodOut.setSdSortId(methodOut.getGeneralWorkId());
//  MOVE GENERAL-WORK-DATE TO SD-SORT-DATE WA-DATE-YMD
                  methodOut.setSdSortDate(methodOut.getGeneralWorkDate());
                  methodOut.getWaDateYmd().setString(methodOut.getGeneralWorkDate());
//  MOVE GENERAL-WORK-TIME TO SD-SORT-TIME
                  methodOut.setSdSortTime(methodOut.getGeneralWorkTime());
//  MOVE GENERAL-WORK-CLASS TO SD-SORT-CLASS
                  methodOut.setSdSortClass(methodOut.getGeneralWorkClass());
//  MOVE GENERAL-WORK-REST TO SD-SORT-KEY-2
                  methodOut.getSdSortKey2().setString(methodOut.getGeneralWorkRest());
//  MOVE WA-DATE-YY TO MCIWIN-YEAR-TO-WINDOW
                  methodOut.getMciwinYearToWindow().setString(methodOut.getWaDateYy());
//  IF WA-DATE-YY NUMERIC
                  if (    isNumeric(methodOut.getWaDateYy())) { 
//  CALL MCWIN-PROGRAM USING MCIWIN-YEAR-TO-WINDOW MCIWIN-RETURNED-YEAR MCIWIN-NEW-WINDOW-YEAR
                      // CALL MCWIN-PROGRAM USING MCIWIN-YEAR-TO-WINDOW MCIWIN-RETURNED-YEAR MCIWIN-NEW-WINDOW-YEAR
                           programCtx.setRc( mcwin.call(programCtx.getGlobalCtx().getContext("MCWIN"),methodOut.getMciwinYearToWindow(),methodOut.getMciwinReturnedYear(),methodOut.getMciwinNewWindowYearGroup()));
//  IF RETURN-CODE EQUAL ZEROS
                      if (	( programCtx.getRc() == 0 )) { 
//  MOVE MCIWIN-RET-CENTURY TO SD-SORT-CC
                          methodOut.setSdSortCc(String.valueOf(methodOut.getMciwinRetCenturyString()).toCharArray());
//  RELEASE SD-SORT-WORK-FILE-RCD
                          if(useSortFileStrategy()) {
                          sortWorkFileInternIn.write(methodOut.getSdSortWorkFileRcd().toCharArray(),methodOut.getSdSortWorkFileRcd().length());
                          } else
                            addReleaseRecord(methodOut.getSdSortWorkFileRcd().toCharArray(),methodOut.getSdSortWorkFileRcd().length());
                      }
//  ELSE
                      else { 
//  MOVE RETURN-CODE TO MCIWIN-RETURN-CODE MCIABEND-ABEND-CODE
                          methodOut.setMciwinReturnCode(programCtx.getRc());
                          methodOut.setMciabendAbendCode(programCtx.getRc());
//  DISPLAY 'MCIWIN CALL FAILED'
                          logger.info("MCIWIN CALL FAILED"); 
//  DISPLAY 'RETURN CODE = ' MCIWIN-RETURN-CODE
                          logger.info("RETURN CODE = {}", String.valueOf(methodOut.getMciwinReturnCode())); 
//  CALL MCABEND-MODULE USING MCIABEND-PARM1
                          // CALL MCABEND-MODULE USING MCIABEND-PARM1
                               programCtx.setRc( mcabend.call(programCtx.getGlobalCtx().getContext("MCABEND"),methodOut.getMciabendParm1()));
                      }
                  }
//  ELSE
                  else { 
//  MOVE SPACES TO SD-SORT-CC
                      methodOut.setSdSortCc(CONSTANTS.SPACE_2);
//  RELEASE SD-SORT-WORK-FILE-RCD
                      if(useSortFileStrategy()) {
                      sortWorkFileInternIn.write(methodOut.getSdSortWorkFileRcd().toCharArray(),methodOut.getSdSortWorkFileRcd().length());
                      } else
                        addReleaseRecord(methodOut.getSdSortWorkFileRcd().toCharArray(),methodOut.getSdSortWorkFileRcd().length());
                  }
              }
          }
//  CLOSE GENERAL-LOG-FILE-IN
          generalLogFileIn.close(); 
      
      return methodOut;
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
      @Override
      public SortOutProcedureOutCtx sortOutProcedure(SortOutProcedureInCtx methodIn) throws Exception {
Sf320010Ctx programCtx = methodIn.getSf320010Ctx();
SortOutProcedureOutCtx methodOut = methodIn.getSortOutProcedureOutCtx();
//  PERFORM 6000-SET-DATE-TIME
          setDateTime(programCtx.getSetDateTimeInCtx());/*6000-SET-DATE-TIME*/
//  RETURN SORT-WORK-FILE RECORD INTO GENERAL-SORT-AREA
                if(useSortFileStrategy()) {
                  sortWorkFileInternOut.read();
                  if (!sortWorkFileInternOut.hasEnded()) {
                  	methodIn.getGeneralSortArea().setString(sortWorkFileInternOut.getRecord());
                  }    
              } else {
          setRecIndex(getRecIndex()+1);
          if (getRecIndex() < sortRecKeys.size() ) { 
             if (isUsingSortInFile()) methodIn.getGeneralSortArea().setString(convertEbcdicBytes2Char(getReturnRecord(getRecIndex())));
             else methodIn.getGeneralSortArea().setString(getReturnRecord(getRecIndex())); 
          }
          }
//  AT END
              if (isSortRecordsEnded()) { 
//  MOVE HIGH-VALUES TO SF503-SORT-MIP-ID
                  methodOut.setSf503SortMipId(CONSTANTS.HIGH_VALUE_1986603238);
                }
//  PERFORM 1000-FORMAT-REPORTS UNTIL SF503-SORT-MIP-ID EQUAL HIGH-VALUES
          while (!( isHighValue(methodOut.getSf503SortMipId()) ) ) {
             formatReports(programCtx.getFormatReportsInCtx());/*1000-FORMAT-REPORTS*/
          }
//  IF ( ( CT-C7-LOG-TYPE-1 = ZEROS) AND ( CT-C7-LOG-TYPE-2 = ZEROS) AND ( CT-C7-LOG-TYPE-3 = ZEROS) AND ( CT-C7-LOG-TYPE-4 = ZEROS) AND ( CT-C7-LOG-TYPE-5 = ZEROS) AND ( CT-C7-LOG-TYPE-6 = ZEROS) AND ( CT-C7-LOG-TYPE-7 = ZEROS) AND ( CT-C7-LOG-TYPE-8 = ZEROS) AND ( CT-C7-LOG-TYPE-9 = ZEROS) AND ( CT-C7-LOG-TYPE-A = ZEROS) AND ( CT-C7-UNDEF-LOG-TYPE = ZEROS))
//  ELSE
          if ((((	( methodIn.getCtC7LogType1() != 0 ) )) || ((	( methodIn.getCtC7LogType2() != 0 ) )) || ((	( methodIn.getCtC7LogType3() != 0 ) )) || ((	( methodIn.getCtC7LogType4() != 0 ) )) || ((	( methodIn.getCtC7LogType5() != 0 ) )) || ((	( methodIn.getCtC7LogType6() != 0 ) )) || ((	( methodIn.getCtC7LogType7() != 0 ) )) || ((	( methodIn.getCtC7LogType8() != 0 ) )) || ((	( methodIn.getCtC7LogType9() != 0 ) )) || ((	( methodIn.getCtC7LogTypeA() != 0 ) )) || ((	( methodIn.getCtC7UndefLogType() != 0 ) )))) { 
//  PERFORM 1610-FORMAT-TYPE-II-LOG-RPT
              formatTypeIiLogRpt(programCtx);/*1610-FORMAT-TYPE-II-LOG-RPT*/
          }
//  IF ( ( CT-C9-LOG-TYPE-1 = ZEROS) AND ( CT-C9-LOG-TYPE-2 = ZEROS) AND ( CT-C9-LOG-TYPE-3 = ZEROS) AND ( CT-C9-LOG-TYPE-4 = ZEROS) AND ( CT-C9-LOG-TYPE-5 = ZEROS) AND ( CT-C9-LOG-TYPE-6 = ZEROS) AND ( CT-C9-LOG-TYPE-7 = ZEROS) AND ( CT-C9-LOG-TYPE-8 = ZEROS) AND ( CT-C9-LOG-TYPE-9 = ZEROS) AND ( CT-C9-LOG-TYPE-10 = ZEROS) AND ( CT-C9-LOG-TYPE-11 = ZEROS) AND ( CT-C9-LOG-TYPE-12 = ZEROS) AND ( CT-C9-LOG-TYPE-13 = ZEROS) AND ( CT-C9-LOG-TYPE-14 = ZEROS) AND ( CT-C9-LOG-TYPE-15 = ZEROS) AND ( CT-C9-LOG-TYPE-16 = ZEROS) AND ( CT-C9-LOG-TYPE-17 = ZEROS) AND ( CT-C9-LOG-TYPE-18 = ZEROS) AND ( CT-C9-LOG-TYPE-19 = ZEROS) AND ( CT-C9-LOG-TYPE-20 = ZEROS) AND ( CT-C9-LOG-TYPE-21 = ZEROS) AND ( CT-C9-LOG-TYPE-22 = ZEROS) AND ( CT-C9-LOG-TYPE-23 = ZEROS) AND ( CT-C9-LOG-TYPE-24 = ZEROS) AND ( CT-C9-LOG-TYPE-25 = ZEROS) AND ( CT-C9-LOG-TYPE-26 = ZEROS) AND ( CT-C9-UNDEF-LOG-TYPE = ZEROS))
//  ELSE
          if ((((	( methodIn.getCtC9LogType1() != 0 ) )) || ((	( methodIn.getCtC9LogType2() != 0 ) )) || ((	( methodIn.getCtC9LogType3() != 0 ) )) || ((	( methodIn.getCtC9LogType4() != 0 ) )) || ((	( methodIn.getCtC9LogType5() != 0 ) )) || ((	( methodIn.getCtC9LogType6() != 0 ) )) || ((	( methodIn.getCtC9LogType7() != 0 ) )) || ((	( methodIn.getCtC9LogType8() != 0 ) )) || ((	( methodIn.getCtC9LogType9() != 0 ) )) || ((	( methodIn.getCtC9LogType10() != 0 ) )) || ((	( methodIn.getCtC9LogType11() != 0 ) )) || ((	( methodIn.getCtC9LogType12() != 0 ) )) || ((	( methodIn.getCtC9LogType13() != 0 ) )) || ((	( methodIn.getCtC9LogType14() != 0 ) )) || ((	( methodIn.getCtC9LogType15() != 0 ) )) || ((	( methodIn.getCtC9LogType16() != 0 ) )) || ((	( methodIn.getCtC9LogType17() != 0 ) )) || ((	( methodIn.getCtC9LogType18() != 0 ) )) || ((	( methodIn.getCtC9LogType19() != 0 ) )) || ((	( methodIn.getCtC9LogType20() != 0 ) )) || ((	( methodIn.getCtC9LogType21() != 0 ) )) || ((	( methodIn.getCtC9LogType22() != 0 ) )) || ((	( methodIn.getCtC9LogType23() != 0 ) )) || ((	( methodIn.getCtC9LogType24() != 0 ) )) || ((	( methodIn.getCtC9LogType25() != 0 ) )) || ((	( methodIn.getCtC9LogType26() != 0 ) )) || ((	( methodIn.getCtC9UndefLogType() != 0 ) )))) { 
//  PERFORM 1710-FORMAT-X92-ACTIVITY-RPT
              formatX92ActivityRpt(programCtx);/*1710-FORMAT-X92-ACTIVITY-RPT*/
          }
      
      return methodOut;
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
      @Override
      public SortInProcedure0100OutCtx sortInProcedure0100(SortInProcedure0100InCtx methodIn) throws Exception {
Sf320010Ctx programCtx = methodIn.getSf320010Ctx();
SortInProcedure0100OutCtx methodOut = methodIn.getSortInProcedure0100OutCtx();
//  OPEN INPUT TEMP-WORK-FILE
          tempWorkFile.open(new String(CONSTANTS.MODE_READ_ONLY_36242),tempWorkFile.getFileName(),tempWorkFile.getTempWorkFileCharSet(),tempWorkFile.getTempWorkFileCrlfFlag());
//  PERFORM WITH TEST BEFORE UNTIL TEMP-FILE-EOF-SW EQUAL 'E'
          while ((methodOut.getTempFileEofSw()[0] != 'E')) {

// *****************************************************************
// ***                    Syntel changes                         ***
// *   changed perform read statements to in-line read statements  *
// *   saving an if condition check on every iteration             *
// *****************************************************************
              // READ TEMP-WORK-FILE INTO GENERAL-WORK-AREA
              tempWorkFile.read();
              if (!tempWorkFile.hasEnded()) {
                methodIn.getGeneralWorkArea().setString(tempWorkFile.getRecord());
                methodOut.getFdTempWorkFileRcd().setString(tempWorkFile.getRecord());
              }
//  AT END
              if (tempWorkFile.hasEnded()) {  
                  // MOVE 'E' TO TEMP-FILE-EOF-SW
                  //  LITERAL_E = 'E'
                  methodOut.setTempFileEofSw(CONSTANTS.LITERAL_E);
                }
//  IF TEMP-FILE-EOF-SW EQUAL 'N'
//  LITERAL_N = 'N'
              if (compareChars(methodOut.getTempFileEofSw(), CONSTANTS.LITERAL_N) == 0) { 
//  MOVE GENERAL-WORK-ID TO SD-SORT-ID
                  methodOut.setSdSortId(methodOut.getGeneralWorkId());
//  MOVE GENERAL-WORK-DATE TO SD-SORT-DATE WA-DATE-YMD
                  methodOut.setSdSortDate(methodOut.getGeneralWorkDate());
                  methodOut.getWaDateYmd().setString(methodOut.getGeneralWorkDate());
//  MOVE GENERAL-WORK-TIME TO SD-SORT-TIME
                  methodOut.setSdSortTime(methodOut.getGeneralWorkTime());
//  MOVE GENERAL-WORK-CLASS TO SD-SORT-CLASS
                  methodOut.setSdSortClass(methodOut.getGeneralWorkClass());
//  MOVE GENERAL-WORK-REST TO SD-SORT-KEY-2
                  methodOut.getSdSortKey2().setString(methodOut.getGeneralWorkRest());
//  MOVE WA-DATE-YY TO MCIWIN-YEAR-TO-WINDOW
                  methodOut.getMciwinYearToWindow().setString(methodOut.getWaDateYy());
//  IF WA-DATE-YY NUMERIC
                  if (    isNumeric(methodOut.getWaDateYy())) { 
//  CALL MCWIN-PROGRAM USING MCIWIN-YEAR-TO-WINDOW MCIWIN-RETURNED-YEAR MCIWIN-NEW-WINDOW-YEAR
                      // CALL MCWIN-PROGRAM USING MCIWIN-YEAR-TO-WINDOW MCIWIN-RETURNED-YEAR MCIWIN-NEW-WINDOW-YEAR
                           programCtx.setRc( mcwin.call(programCtx.getGlobalCtx().getContext("MCWIN"),methodOut.getMciwinYearToWindow(),methodOut.getMciwinReturnedYear(),methodOut.getMciwinNewWindowYearGroup()));
//  IF RETURN-CODE EQUAL ZEROS
                      if (	( programCtx.getRc() == 0 )) { 
//  MOVE MCIWIN-RET-CENTURY TO SD-SORT-CC
                          methodOut.setSdSortCc(String.valueOf(methodOut.getMciwinRetCenturyString()).toCharArray());
//  RELEASE SD-SORT-WORK-FILE-RCD
                          if(useSortFileStrategy()) {
                          sortWorkFileInternIn.write(methodOut.getSdSortWorkFileRcd().toCharArray(),methodOut.getSdSortWorkFileRcd().length());
                          } else
                            addReleaseRecord(methodOut.getSdSortWorkFileRcd().toCharArray(),methodOut.getSdSortWorkFileRcd().length());
                      }
//  ELSE
                      else { 
//  MOVE RETURN-CODE TO MCIWIN-RETURN-CODE MCIABEND-ABEND-CODE
                          methodOut.setMciwinReturnCode(programCtx.getRc());
                          methodOut.setMciabendAbendCode(programCtx.getRc());
//  DISPLAY 'MCIWIN CALL FAILED'
                          logger.info("MCIWIN CALL FAILED"); 
//  DISPLAY 'RETURN CODE = ' MCIWIN-RETURN-CODE
                          logger.info("RETURN CODE = {}", String.valueOf(methodOut.getMciwinReturnCode())); 
//  CALL MCABEND-MODULE USING MCIABEND-PARM1
                          // CALL MCABEND-MODULE USING MCIABEND-PARM1
                               programCtx.setRc( mcabend.call(programCtx.getGlobalCtx().getContext("MCABEND"),methodOut.getMciabendParm1()));
                      }
                  }
//  ELSE
                  else { 
//  MOVE SPACES TO SD-SORT-CC
                      methodOut.setSdSortCc(CONSTANTS.SPACE_2);
//  RELEASE SD-SORT-WORK-FILE-RCD
                      if(useSortFileStrategy()) {
                      sortWorkFileInternIn.write(methodOut.getSdSortWorkFileRcd().toCharArray(),methodOut.getSdSortWorkFileRcd().length());
                      } else
                        addReleaseRecord(methodOut.getSdSortWorkFileRcd().toCharArray(),methodOut.getSdSortWorkFileRcd().length());
                  }
              }
          }
//  CLOSE TEMP-WORK-FILE
          tempWorkFile.close(); 
      
      return methodOut;
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
      @Override
      public SortOutProcedure0100OutCtx sortOutProcedure0100(SortOutProcedure0100InCtx methodIn) throws Exception {
Sf320010Ctx programCtx = methodIn.getSf320010Ctx();
SortOutProcedure0100OutCtx methodOut = methodIn.getSortOutProcedure0100OutCtx();
//  RETURN SORT-WORK-FILE RECORD INTO GENERAL-SORT-AREA
                if(useSortFileStrategy()) {
                  sortWorkFileInternOut.read();
                  if (!sortWorkFileInternOut.hasEnded()) {
                  	methodIn.getGeneralSortArea().setString(sortWorkFileInternOut.getRecord());
                  }    
              } else {
          setRecIndex(getRecIndex()+1);
          if (getRecIndex() < sortRecKeys.size() ) { 
             if (isUsingSortInFile()) methodIn.getGeneralSortArea().setString(convertEbcdicBytes2Char(getReturnRecord(getRecIndex())));
             else methodIn.getGeneralSortArea().setString(getReturnRecord(getRecIndex())); 
          }
          }
//  AT END
              if (isSortRecordsEnded()) { 
//  MOVE HIGH-VALUES TO SF503-SORT-MIP-ID
                  methodOut.setSf503SortMipId(CONSTANTS.HIGH_VALUE_1986603238);
                }
//  MOVE GENERAL-SORT-ID TO SF503-SORT-MIP-ID
          methodOut.setSf503SortMipId(methodOut.getGeneralSortId());
//  MOVE GENERAL-SORT-DATE TO SF503-SORT-DATE
          methodOut.setSf503SortDate(methodOut.getGeneralSortDate());
//  MOVE GENERAL-SORT-TIME TO SF503-SORT-TIME
          methodOut.setSf503SortTime(methodOut.getGeneralSortTime());
//  MOVE GENERAL-SORT-CLASS TO SF503-LOG-RECORD ( 300-NUM-ONE : 300-NUM-ONE )
          methodOut.getSf50301().replace(methodIn.getGeneralSortArea()/*parent*/,17/*fromOffset - (sf503LogRecord) */,1/*fromLen*/,15+methodIn.getNumOne300() - 1/*toOffset - (generalSortClass) */,methodIn.getNumOne300()/*toLen*/);
//  MOVE GENERAL-SORT-REST TO SF503-LOG-RECORD ( 300-NUM-TWO : )
          methodOut.getSf50301().replace(methodIn.getGeneralSortArea()/*parent*/,18/*fromOffset - (sf503LogRecord) */,8176/*fromLen*/,15+methodIn.getNumTwo300() - 1/*toOffset - (generalSortRest) */,32737/*toLen*/);
          // MOVE SF503-RC-REMOTE-MIP-ID TO PREV-RC-REMOTE-MIP-ID
          methodOut.setPrevRcRemoteMipId(methodOut.getSf503RcRemoteMipId());
//  PERFORM 2000-FORMAT-REM-CONS-RPT UNTIL SF503-SORT-MIP-ID EQUAL HIGH-VALUES
          while (!( isHighValue(methodOut.getSf503SortMipId()) ) ) {
             formatRemConsRpt(programCtx.getFormatRemConsRptInCtx());/*2000-FORMAT-REM-CONS-RPT*/
          }
          ;
      
      return methodOut;
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
      @Override
      public FormatReportsOutCtx formatReports(FormatReportsInCtx methodIn) throws Exception {
Sf320010Ctx programCtx = methodIn.getSf320010Ctx();
FormatReportsOutCtx methodOut = methodIn.getFormatReportsOutCtx();
//  MOVE GENERAL-SORT-ID TO SF503-SORT-MIP-ID
          methodOut.setSf503SortMipId(methodOut.getGeneralSortId());
//  MOVE GENERAL-SORT-DATE TO SF503-SORT-DATE
          methodOut.setSf503SortDate(methodOut.getGeneralSortDate());
//  MOVE GENERAL-SORT-TIME TO SF503-SORT-TIME
          methodOut.setSf503SortTime(methodOut.getGeneralSortTime());
//  MOVE GENERAL-SORT-CLASS TO SF503-LOG-RECORD ( 300-NUM-ONE : 300-NUM-ONE )
          methodOut.getSf50301().replace(methodIn.getGeneralSortArea()/*parent*/,17/*fromOffset - (sf503LogRecord) */,1/*fromLen*/,15+methodIn.getNumOne300() - 1/*toOffset - (generalSortClass) */,methodIn.getNumOne300()/*toLen*/);
//  MOVE GENERAL-SORT-REST TO SF503-LOG-RECORD ( 300-NUM-TWO : )
          methodOut.getSf50301().replace(methodIn.getGeneralSortArea()/*parent*/,18/*fromOffset - (sf503LogRecord) */,8176/*fromLen*/,15+methodIn.getNumTwo300() - 1/*toOffset - (generalSortRest) */,32737/*toLen*/);
//  IF SF503-LOG-RECORD ( 300-NUM-ONE : 300-NUM-ONE ) EQUAL '2' OR 'B'
//  LITERAL_B = 'B'
          if (methodIn.getNumOne300() > 0 && methodOut.getSf503LogRecord()[getIndex(methodIn.getNumOne300())] == '2' || methodIn.getNumOne300() > 0 && methodOut.getSf503LogRecord()[getIndex(methodIn.getNumOne300())] == 'B') { 
//  IF SF503-BD32-TYPE EQUAL 'A'
//  LITERAL_A = 'A'
              if (compareChars(methodIn.getSf503Bd32Type(), CONSTANTS.LITERAL_A) == 0) { 
//  ADD 1 TO CT-LOG-BULK-DATA32
                  methodOut.setCtLogBulkData32(methodOut.getCtLogBulkData32()+(long)1);
              }
//  ELSE
              else { 
//  PERFORM 1100-FORMAT-BULK-DATA-REPORT
                  formatBulkDataReport(programCtx.getFormatBulkDataReportInCtx());/*1100-FORMAT-BULK-DATA-REPORT*/
              }
          }
//  ELSE
          else { 
//  IF SF503-LOG-RECORD ( 300-NUM-ONE : 300-NUM-ONE ) EQUAL '5'
//  LITERAL_5 = '5'
              if (methodIn.getNumOne300() > 0 && methodOut.getSf503LogRecord()[getIndex(methodIn.getNumOne300())] == '5') { 
//  PERFORM 1200-FORMAT-OPERATOR-LOG-RPT
                  formatOperatorLogRpt(programCtx.getFormatOperatorLogRptInCtx());/*1200-FORMAT-OPERATOR-LOG-RPT*/
              }
//  ELSE
              else { 
//  IF SF503-LOG-RECORD ( 300-NUM-ONE : 300-NUM-ONE ) EQUAL '4'
//  LITERAL_4 = '4'
                  if (methodIn.getNumOne300() > 0 && methodOut.getSf503LogRecord()[getIndex(methodIn.getNumOne300())] == '4') { 
//  ADD 1 TO CT-LOG-STATS
                      methodOut.setCtLogStats(methodOut.getCtLogStats()+(long)1);
                  }
//  ELSE
                  else { 
//  IF SF503-LOG-RECORD ( 300-NUM-ONE : 300-NUM-ONE ) EQUAL '6'
//  LITERAL_6 = '6'
                      if (methodIn.getNumOne300() > 0 && methodOut.getSf503LogRecord()[getIndex(methodIn.getNumOne300())] == '6') { 
//  PERFORM 1400-FORMAT-MIP-PROFILE-REPORT
                          formatMipProfileReport(programCtx.getFormatMipProfileReportInCtx());/*1400-FORMAT-MIP-PROFILE-REPORT*/
                      }
//  ELSE
                      else { 
//  IF SF503-LOG-RECORD ( 300-NUM-ONE : 300-NUM-ONE ) EQUAL '3'
//  LITERAL_3 = '3'
                          if (methodIn.getNumOne300() > 0 && methodOut.getSf503LogRecord()[getIndex(methodIn.getNumOne300())] == '3') { 
//  PERFORM 1500-FORMAT-POS-TRANS-LOG-RPT
                              formatPosTransLogRpt(programCtx.getFormatPosTransLogRptInCtx());/*1500-FORMAT-POS-TRANS-LOG-RPT*/
                          }
//  ELSE
                          else { 
//  IF SF503-LOG-RECORD ( 300-NUM-ONE : 300-NUM-ONE ) EQUAL '7'
//  LITERAL_7 = '7'
                              if (methodIn.getNumOne300() > 0 && methodOut.getSf503LogRecord()[getIndex(methodIn.getNumOne300())] == '7') { 
//  PERFORM 1600-FORMAT-TYPE-II-ACTIVITY
                                  formatTypeIiActivity(programCtx.getFormatTypeIiActivityInCtx());/*1600-FORMAT-TYPE-II-ACTIVITY*/
                              }
//  ELSE
                              else { 
//  IF SF503-LOG-RECORD ( 300-NUM-ONE : 300-NUM-ONE ) EQUAL '9'
//  LITERAL_9 = '9'
                                  if (methodIn.getNumOne300() > 0 && methodOut.getSf503LogRecord()[getIndex(methodIn.getNumOne300())] == '9') { 
//  PERFORM 1700-FORMAT-X92-ACTIVITY
                                      formatX92Activity(programCtx.getFormatX92ActivityInCtx());/*1700-FORMAT-X92-ACTIVITY*/
                                  }
//  ELSE
                                  else { 
//  IF SF503-LOG-RECORD ( 300-NUM-ONE : 300-NUM-ONE ) EQUAL '8'
//  LITERAL_8 = '8'
                                      if (methodIn.getNumOne300() > 0 && methodOut.getSf503LogRecord()[getIndex(methodIn.getNumOne300())] == '8') { 
//  WRITE FD-TEMP-WORK-FILE-RCD FROM SF50301
                                          tempWorkFile.write(methodOut.getSf50301().toCharArray()); 
                                          methodOut.getFdTempWorkFileRcd().setString(CONSTANTS.LOW_VALUE_215686484);
//  ADD 1 TO TEMP-RECS-WRITTEN-CNT
                                          methodOut.setTempRecsWrittenCnt(methodOut.getTempRecsWrittenCnt()+(long)1);
                                      }
//  ELSE
                                      else { 
//  IF SF503-LOG-RECORD ( 300-NUM-ONE : 300-NUM-ONE ) EQUAL 'E'
//  LITERAL_E = 'E'
                                          if (methodIn.getNumOne300() > 0 && methodOut.getSf503LogRecord()[getIndex(methodIn.getNumOne300())] == 'E') { 
//  ADD 1 TO CT-LOG-EDC
                                              methodOut.setCtLogEdc(methodOut.getCtLogEdc()+(long)1);
                                          }
//  ELSE
                                          else { 
//  IF SF503-LOG-RECORD ( 300-NUM-ONE : 300-NUM-ONE ) EQUAL 'C'
                                              if (methodIn.getNumOne300() > 0 && methodOut.getSf503LogRecord()[getIndex(methodIn.getNumOne300())] == 'C') { 
//  ADD 1 TO CT-LOG-CHK
                                                  methodOut.setCtLogChk(methodOut.getCtLogChk()+(long)1);
                                              }
//  ELSE
                                              else { 
//  MOVE SF503-LOG-RECORD ( 300-NUM-ONE : 300-NUM-ONE ) TO 100-OTHER-GLOG-CLASS
                                                  methodOut.setOtherGlogClass100(substring(methodOut.getSf503LogRecord(),(methodIn.getNumOne300()-1), (methodIn.getNumOne300() + (methodIn.getNumOne300() - 1)) ));
//  IF OTHER-LOG-TYPE
                                                  if ( methodOut.isOtherLogType()  ) { 
//  ADD 1 TO CT-LOG-OTHER
                                                      methodOut.setCtLogOther(methodOut.getCtLogOther()+(long)1);
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
                  	methodIn.getGeneralSortArea().setString(sortWorkFileInternOut.getRecord());
                  }    
              } else {
          setRecIndex(getRecIndex()+1);
          if (getRecIndex() < sortRecKeys.size() ) { 
             if (isUsingSortInFile()) methodIn.getGeneralSortArea().setString(convertEbcdicBytes2Char(getReturnRecord(getRecIndex())));
             else methodIn.getGeneralSortArea().setString(getReturnRecord(getRecIndex())); 
          }
          }
//  AT END
              if (isSortRecordsEnded()) { 
//  MOVE HIGH-VALUES TO SF503-SORT-MIP-ID
                  methodOut.setSf503SortMipId(CONSTANTS.HIGH_VALUE_1986603238);
                }
      
      return methodOut;
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
      @Override
      public FormatBulkDataReportOutCtx formatBulkDataReport(FormatBulkDataReportInCtx methodIn) throws Exception {
Sf320010Ctx programCtx = methodIn.getSf320010Ctx();
FormatBulkDataReportOutCtx methodOut = methodIn.getFormatBulkDataReportOutCtx();
//  MOVE 'A' TO RP-REPORT-CODE
//  LITERAL_A = 'A'
          methodOut.setRpReportCode(CONSTANTS.LITERAL_A);
//  MOVE SF503-BD-BULK-ID TO RP-BD-BULK-ID
          methodOut.setRpBdBulkId(methodOut.getSf503BdBulkId());
//  MOVE SF503-BD-MIP-ID TO RP-BD-MIP-ID
          methodOut.setRpBdMipId(methodOut.getSf503BdMipId());
//  MOVE SF503-BD-PATH-ID TO RP-BD-PATH-ID
          methodOut.setRpBdPathId(methodOut.getSf503BdPathId());
//  MOVE SF503-BD-STATUS TO RP-BD-STATUS
          methodOut.setRpBdStatus(methodOut.getSf503BdStatus());
//  MOVE SF503-BD-ERROR-CODE TO RP-BD-ERROR-CODE
          methodOut.setRpBdErrorCode(methodOut.getSf503BdErrorCode());
//  MOVE SF503-BD-JULIAN-DAY TO RP-BD-JULIAN-DAY
          methodOut.setRpBdJulianDay(methodOut.getSf503BdJulianDay());
//  MOVE SF503-BD-TIME TO RP-BD-TIME
          methodOut.setRpBdTime(methodOut.getSf503BdTime());
//  MOVE SF503-BD-NBR-1K-SPOOL-RCDS TO RP-BD-NBR-1K-SPOOL-RCDS
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          methodOut.setRpBdNbr1kSpoolRcds(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(methodOut.getSf503BdNbr1kSpoolRcds()).toCharArray()));
//  MOVE SF503-BD-NBR-BYTES-TRANS TO RP-BD-NBR-BYTES-TRANS
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          methodOut.setRpBdNbrBytesTrans(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(methodOut.getSf503BdNbrBytesTrans()).toCharArray()));
//  MOVE SF503-BD-NBR-BLOCKS-TRANS TO RP-BD-NBR-BLOCKS-TRANS
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          methodOut.setRpBdNbrBlocksTrans(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(methodOut.getSf503BdNbrBlocksTrans()).toCharArray()));
//  IF CT-RPT-BD-LINE-NO GREATER THAN 56
          if (	( methodOut.getCtRptBdLineNo() > 56 )) { 
//  PERFORM 1110-FORMAT-BULK-DATA-HEADER
              formatBulkDataHeader(programCtx.getFormatBulkDataHeaderInCtx());/*1110-FORMAT-BULK-DATA-HEADER*/
          }
//  ELSE
          // MOVE RP-BD-DETAIL TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpBdDetail().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
//  ADD 1 TO CT-RPT-BD-LINE-NO CT-LOG-BULK-DATA
          methodOut.setCtRptBdLineNo(methodOut.getCtRptBdLineNo()+1);
          methodOut.setCtLogBulkData(methodOut.getCtLogBulkData()+(long)1);
//  MOVE SPACE TO RP-BD-CC
          methodOut.setRpBdCc(CONSTANTS.SPACE);
      
      return methodOut;
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
      @Override
      public FormatBulkDataHeaderOutCtx formatBulkDataHeader(FormatBulkDataHeaderInCtx methodIn) throws Exception {
Sf320010Ctx programCtx = methodIn.getSf320010Ctx();
FormatBulkDataHeaderOutCtx methodOut = methodIn.getFormatBulkDataHeaderOutCtx();
//  MOVE 'AA' TO RP-H1-RPT-CODE
//  LITERAL_AA = 'AA'
          methodOut.setRpH1RptCode(CONSTANTS.LITERAL_AA);
          // MOVE RP-HEADING-1 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpHeading1().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
//  ADD 1 TO CT-RPT-BD-PAGE-NO
          methodOut.setCtRptBdPageNo(methodOut.getCtRptBdPageNo()+1);
//  MOVE CT-RPT-BD-PAGE-NO TO RP-BD-H2-PAGENUMBER
//  FORMAT_1059277505 = "ZZZ9"
          methodOut.setRpBdH2Pagenumber(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(methodOut.getCtRptBdPageNo()).toCharArray()));
          // MOVE RP-BD-HEADING-2 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpBdHeading2().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
//  MOVE RP-BD-HEADING-3 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpBdHeading3());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
          // MOVE '0' TO RP-BD-CC
          //  LITERAL_0 = '0'
          methodOut.setRpBdCc(CONSTANTS.LITERAL_0);
//  MOVE 6 TO CT-RPT-BD-LINE-NO
//  LITERAL_6 = 6
          methodOut.setCtRptBdLineNo(6);
      
      return methodOut;
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
      @Override
      public FormatOperatorLogRptOutCtx formatOperatorLogRpt(FormatOperatorLogRptInCtx methodIn) throws Exception {
Sf320010Ctx programCtx = methodIn.getSf320010Ctx();
FormatOperatorLogRptOutCtx methodOut = methodIn.getFormatOperatorLogRptOutCtx();
//  MOVE 'B' TO RP-REPORT-CODE
//  LITERAL_B = 'B'
          methodOut.setRpReportCode(CONSTANTS.LITERAL_B);
//  MOVE SF503-OP-RECORD-TYPE TO RP-OP-RECORD-TYPE
          methodOut.setRpOpRecordType(methodOut.getSf503OpRecordType());
//  MOVE SF503-SORT-MIP-ID TO RP-OP-MIP-ID
          methodOut.setRpOpMipId(methodOut.getSf503SortMipId());
//  MOVE SF503-SORT-DATE TO WA-DATE-YMD
          methodOut.getWaDateYmd().setString(methodOut.getSf503SortDate());
//  MOVE WA-DATE-MM TO WA-DATE-MN
          methodOut.setWaDateMn(methodOut.getWaDateMm());
//  MOVE WA-DATE-DD TO WA-DATE-DY
          methodOut.setWaDateDy(methodOut.getWaDateDd());
//  MOVE WA-DATE-YY TO WA-DATE-YR
          methodOut.setWaDateYr(methodOut.getWaDateYy());
          // MOVE WA-DATE-MDY TO RP-OP-LOG-DATE
          methodOut.setRpOpLogDate(methodOut.getWaDateMdy().toCharArray());
//  MOVE SF503-SORT-TIME TO RP-OP-LOG-TIME
          methodOut.setRpOpLogTime(methodOut.getSf503SortTime());
//  MOVE SF503-OP-MSG-HDR TO RP-OP-HEADER
          methodOut.setRpOpHeader(methodOut.getSf503OpMsgHdr());
//  MOVE '-' TO RP-OP-DELIMITER
//  LITERAL_MN_ = '-'
          methodOut.setRpOpDelimiter(CONSTANTS.LITERAL_MN_);
//  MOVE SF503-OP-OPERATOR-MESSAGE TO RP-OP-OPERATOR-MESSAGE
          methodOut.setRpOpOperatorMessage(methodOut.getSf503OpOperatorMessage());
//  IF CT-RPT-OP-LINE-NO GREATER THAN 56
          if (	( methodOut.getCtRptOpLineNo() > 56 )) { 
//  PERFORM 1210-FORMAT-OPERATOR-LOG-HDR
              formatOperatorLogHdr(programCtx.getFormatOperatorLogHdrInCtx());/*1210-FORMAT-OPERATOR-LOG-HDR*/
          }
//  ELSE
          // MOVE RP-OP-DETAIL TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpOpDetail().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
//  ADD 1 TO CT-RPT-OP-LINE-NO CT-LOG-OPERATOR
          methodOut.setCtRptOpLineNo(methodOut.getCtRptOpLineNo()+1);
          methodOut.setCtLogOperator(methodOut.getCtLogOperator()+(long)1);
//  MOVE SPACE TO RP-OP-CC
          methodOut.setRpOpCc(CONSTANTS.SPACE);
//  IF SF503-OP-OPERATOR-MESSAGE (23 : 5) EQUAL 300-CHAR-9134A OR SF503-OP-OPERATOR-MESSAGE (30 : 5) EQUAL 300-CHAR-9134A
          if (Field.compareChar(methodOut.getSf503OpOperatorMessage() , methodIn.getChar9134a300() , ( 22 /*start*/ ), 5 /*left len*/ , 5 /*right len*/) || Field.compareChar(methodOut.getSf503OpOperatorMessage() , methodIn.getChar9134a300() , ( 29 /*start*/ ), 5 /*left len*/ , 5 /*right len*/)) { 
//  ADD 300-NUM-ONE TO 400-EMAIL-RECS-WRITE-CNT
              methodOut.setEmailRecsWriteCnt400(methodOut.getEmailRecsWriteCnt400()+methodIn.getNumOne300());
//  IF 400-EMAIL-RPT-OP-LINE-NO GREATER 300-NUM-56
              if (	( methodOut.getEmailRptOpLineNo400() > methodIn.getNum56300() ) ) { 
//  MOVE SPACES TO RP-REPORT-CODE
                  methodOut.setRpReportCode(CONSTANTS.SPACE);
//  PERFORM 1220-FORMAT-EMAIL-OP-LOG-HDR
                  formatEmailOpLogHdr(programCtx.getFormatEmailOpLogHdrInCtx());/*1220-FORMAT-EMAIL-OP-LOG-HDR*/
              }
//  MOVE SPACES TO RP-REPORT-CODE
              methodOut.setRpReportCode(CONSTANTS.SPACE);
              // MOVE RP-OP-DETAIL TO RP-PRINT-LINE
              methodOut.setRpPrintLine(methodOut.getRpOpDetail().toCharArray());
//  PERFORM 8100-WRITE-EMAIL-RECORD
              writeEmailRecord(programCtx.getWriteEmailRecordInCtx());/*8100-WRITE-EMAIL-RECORD*/
//  ADD 300-NUM-ONE TO 400-EMAIL-RPT-OP-LINE-NO
              methodOut.setEmailRptOpLineNo400( (short) (methodOut.getEmailRptOpLineNo400()+(short) methodIn.getNumOne300()));
          }
      
      return methodOut;
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
      @Override
      public FormatOperatorLogHdrOutCtx formatOperatorLogHdr(FormatOperatorLogHdrInCtx methodIn) throws Exception {
Sf320010Ctx programCtx = methodIn.getSf320010Ctx();
FormatOperatorLogHdrOutCtx methodOut = methodIn.getFormatOperatorLogHdrOutCtx();
//  MOVE 'BB' TO RP-H1-RPT-CODE
//  LITERAL_BB = 'BB'
          methodOut.setRpH1RptCode(CONSTANTS.LITERAL_BB);
          // MOVE RP-HEADING-1 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpHeading1().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
//  ADD 1 TO CT-RPT-OP-PAGE-NO
          methodOut.setCtRptOpPageNo(methodOut.getCtRptOpPageNo()+1);
//  MOVE CT-RPT-OP-PAGE-NO TO RP-OP-H2-PAGENUMBER
//  FORMAT_1059277505 = "ZZZ9"
          methodOut.setRpOpH2Pagenumber(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(methodOut.getCtRptOpPageNo()).toCharArray()));
          // MOVE RP-OP-HEADING-2 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpOpHeading2().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
//  MOVE RP-OP-HEADING-3 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpOpHeading3());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
          // MOVE '0' TO RP-OP-CC
          //  LITERAL_0 = '0'
          methodOut.setRpOpCc(CONSTANTS.LITERAL_0);
//  MOVE 6 TO CT-RPT-OP-LINE-NO
//  LITERAL_6 = 6
          methodOut.setCtRptOpLineNo(6);
      
      return methodOut;
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
      @Override
      public FormatEmailOpLogHdrOutCtx formatEmailOpLogHdr(FormatEmailOpLogHdrInCtx methodIn) throws Exception {
      
// ******************************************************************
// *    1 2 2 0 - F o r m a t - e m a i l - o p - l o g - h d r     *
// ******************************************************************
// *    1. format the header messages.                              *
// ******************************************************************
Sf320010Ctx programCtx = methodIn.getSf320010Ctx();
FormatEmailOpLogHdrOutCtx methodOut = methodIn.getFormatEmailOpLogHdrOutCtx();
//  MOVE SPACES TO RP-PRINT-LINE
          methodOut.setRpPrintLine(CONSTANTS.SPACE_133);
//  PERFORM 8100-WRITE-EMAIL-RECORD
          writeEmailRecord(programCtx.getWriteEmailRecordInCtx());/*8100-WRITE-EMAIL-RECORD*/
//  MOVE 300-CHAR-BB TO 200-RP-H1-RPT-CODE1
          methodOut.setRpH1RptCode1200(methodOut.getCharBb300());
          // MOVE 200-RP-EMAIL-HEADING-1 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpEmailHeading1200().toCharArray());
//  PERFORM 8100-WRITE-EMAIL-RECORD
          writeEmailRecord(programCtx.getWriteEmailRecordInCtx());/*8100-WRITE-EMAIL-RECORD*/
//  ADD 300-NUM-ONE TO 400-EMAIL-RPT-OP-PAGE-NO
          methodOut.setEmailRptOpPageNo400( (short) (methodOut.getEmailRptOpPageNo400()+(short) methodIn.getNumOne300()));
//  MOVE 400-EMAIL-RPT-OP-PAGE-NO TO 200-RP-OP-PAGENUMBER1
//  FORMAT_1059277505 = "ZZZ9"
          methodOut.setRpOpPagenumber1200(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(methodOut.getEmailRptOpPageNo400()).toCharArray()));
          // MOVE 200-RP-EMAIL-OP-HEADING-2 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpEmailOpHeading2200().toCharArray());
//  PERFORM 8100-WRITE-EMAIL-RECORD
          writeEmailRecord(programCtx.getWriteEmailRecordInCtx());/*8100-WRITE-EMAIL-RECORD*/
//  MOVE SPACES TO RP-PRINT-LINE
          methodOut.setRpPrintLine(CONSTANTS.SPACE_133);
//  PERFORM 8100-WRITE-EMAIL-RECORD
          writeEmailRecord(programCtx.getWriteEmailRecordInCtx());/*8100-WRITE-EMAIL-RECORD*/
//  MOVE 200-RP-EMAIL-OP-HEADING-3 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(pad(133,methodOut.getRpEmailOpHeading3200(),SPACE_CHAR,RIGHT_PAD));
//  PERFORM 8100-WRITE-EMAIL-RECORD
          writeEmailRecord(programCtx.getWriteEmailRecordInCtx());/*8100-WRITE-EMAIL-RECORD*/
//  MOVE 300-NUM-6 TO 400-EMAIL-RPT-OP-LINE-NO
          methodOut.setEmailRptOpLineNo400( methodOut.getNum6300());
      
      return methodOut;
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
      @Override
      public FormatMipProfileReportOutCtx formatMipProfileReport(FormatMipProfileReportInCtx methodIn) throws Exception {
Sf320010Ctx programCtx = methodIn.getSf320010Ctx();
FormatMipProfileReportOutCtx methodOut = methodIn.getFormatMipProfileReportOutCtx();
//  MOVE 'D' TO RP-REPORT-CODE
//  LITERAL_D = 'D'
          methodOut.setRpReportCode(CONSTANTS.LITERAL_D);
//  MOVE SF503-MP-LOG-DATE TO RP-MP-LOG-DATE
          methodOut.setRpMpLogDate(methodOut.getSf503MpLogDate());
//  MOVE SF503-MP-LOG-TIME TO RP-MP-LOG-TIME
          methodOut.setRpMpLogTime(methodOut.getSf503MpLogTime());
//  MOVE SF503-MP-MID TO RP-MP-MIP-ID
          methodOut.setRpMpMipId(methodOut.getSf503MpMid());
//  MOVE SF503-MP-ISS-FLOOR-LIM2-RETAIL TO RP-MP-ISS-FLOOR-LIM2-RETAIL
//  FORMAT_1059277505 = "ZZZ9"
          methodOut.setRpMpIssFloorLim2Retail(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(methodOut.getSf503MpIssFloorLim2Retail()).toCharArray()));
//  MOVE SF503-MP-ISS-FLOOR-LIM2-TRAVEL TO RP-MP-ISS-FLOOR-LIM2-TRAVEL
//  FORMAT_1059277505 = "ZZZ9"
          methodOut.setRpMpIssFloorLim2Travel(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(methodOut.getSf503MpIssFloorLim2Travel()).toCharArray()));
//  MOVE SF503-MP-ISS-FLOOR-LIM2-CASH TO RP-MP-ISS-FLOOR-LIM2-CASH
//  FORMAT_1059277505 = "ZZZ9"
          methodOut.setRpMpIssFloorLim2Cash(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(methodOut.getSf503MpIssFloorLim2Cash()).toCharArray()));
//  MOVE SF503-MP-POS-RETAIL-LIMIT TO RP-MP-POS-RETAIL-LIMIT
//  FORMAT_1059277505 = "ZZZ9"
          methodOut.setRpMpPosRetailLimit(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(methodOut.getSf503MpPosRetailLimit()).toCharArray()));
//  MOVE SF503-MP-POS-TRAVEL-LIMIT TO RP-MP-POS-TRAVEL-LIMIT
//  FORMAT_1059277505 = "ZZZ9"
          methodOut.setRpMpPosTravelLimit(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(methodOut.getSf503MpPosTravelLimit()).toCharArray()));
//  MOVE SF503-MP-POS-CASH-LIMIT TO RP-MP-POS-CASH-LIMIT
//  FORMAT_1059277505 = "ZZZ9"
          methodOut.setRpMpPosCashLimit(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(methodOut.getSf503MpPosCashLimit()).toCharArray()));
//  MOVE SF503-MP-X-CODE-LIMIT TO RP-MP-X-CODE-LIMIT
//  FORMAT_1059277505 = "ZZZ9"
          methodOut.setRpMpXCodeLimit(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(methodOut.getSf503MpXCodeLimit()).toCharArray()));
//  MOVE SF503-MP-RCL-FILE-IND TO RP-MP-RCL-FILE-IND
          methodOut.setRpMpRclFileInd(methodOut.getSf503MpRclFileInd());
//  MOVE SF503-MP-NEG-FILE-AVAIL-IND TO RP-MP-NEG-FILE-AVAIL-IND
          methodOut.setRpMpNegFileAvailInd(methodOut.getSf503MpNegFileAvailInd());
//  MOVE SF503-MP-MBR-DELAY-FILE-IND TO RP-MP-MBR-DELAY-FILE-IND
          methodOut.setRpMpMbrDelayFileInd(methodOut.getSf503MpMbrDelayFileInd());
//  MOVE SF503-MP-LOCAL-NEG-FILE-IND TO RP-MP-LOCAL-NEG-FILE-IND
          methodOut.setRpMpLocalNegFileInd(methodOut.getSf503MpLocalNegFileInd());
//  MOVE SF503-MP-IPQ-TIMES (1) TO RP-MP-IPQ1
//  FORMAT_1059277505 = "ZZZ9"
          methodOut.setRpMpIpq1(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(methodOut.getSf503MpIpqTimes(0)).toCharArray()));
//  MOVE SF503-MP-IPQ-TIMES (2) TO RP-MP-IPQ2
//  FORMAT_1059277505 = "ZZZ9"
          methodOut.setRpMpIpq2(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(methodOut.getSf503MpIpqTimes(1)).toCharArray()));
//  MOVE SF503-MP-IPQ-TIMES (3) TO RP-MP-IPQ3
//  FORMAT_1059277505 = "ZZZ9"
          methodOut.setRpMpIpq3(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(methodOut.getSf503MpIpqTimes(2)).toCharArray()));
//  MOVE SF503-MP-IPQ-TIMES (4) TO RP-MP-IPQ4
//  FORMAT_1059277505 = "ZZZ9"
          methodOut.setRpMpIpq4(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(methodOut.getSf503MpIpqTimes(3)).toCharArray()));
//  MOVE SF503-MP-IPQ-TIMES (5) TO RP-MP-IPQ5
//  FORMAT_1059277505 = "ZZZ9"
          methodOut.setRpMpIpq5(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(methodOut.getSf503MpIpqTimes(4)).toCharArray()));
//  MOVE SF503-MP-IPQ-TIMES (6) TO RP-MP-IPQ6
//  FORMAT_1059277505 = "ZZZ9"
          methodOut.setRpMpIpq6(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(methodOut.getSf503MpIpqTimes(5)).toCharArray()));
//  MOVE SF503-MP-IPQ-TIMES (7) TO RP-MP-IPQ7
//  FORMAT_1059277505 = "ZZZ9"
          methodOut.setRpMpIpq7(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(methodOut.getSf503MpIpqTimes(6)).toCharArray()));
//  MOVE SF503-MP-IPQ-TIMES (8) TO RP-MP-IPQ8
//  FORMAT_1059277505 = "ZZZ9"
          methodOut.setRpMpIpq8(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(methodOut.getSf503MpIpqTimes(7)).toCharArray()));
//  MOVE SF503-MP-IPQ-TIMES (9) TO RP-MP-IPQ9
//  FORMAT_1059277505 = "ZZZ9"
          methodOut.setRpMpIpq9(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(methodOut.getSf503MpIpqTimes(8)).toCharArray()));
//  MOVE SF503-MP-IPQ-TIMES (10) TO RP-MP-IPQ10
//  FORMAT_1059277505 = "ZZZ9"
          methodOut.setRpMpIpq10(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(methodOut.getSf503MpIpqTimes(9)).toCharArray()));
//  MOVE SF503-MP-IPQ-TIMES (11) TO RP-MP-IPQ11
//  FORMAT_1059277505 = "ZZZ9"
          methodOut.setRpMpIpq11(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(methodOut.getSf503MpIpqTimes(10)).toCharArray()));
//  MOVE SF503-MP-IPQ-TIMES (12) TO RP-MP-IPQ12
//  FORMAT_1059277505 = "ZZZ9"
          methodOut.setRpMpIpq12(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(methodOut.getSf503MpIpqTimes(11)).toCharArray()));
//  MOVE SF503-MP-IPQ-TIMES (13) TO RP-MP-IPQ13
//  FORMAT_1059277505 = "ZZZ9"
          methodOut.setRpMpIpq13(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(methodOut.getSf503MpIpqTimes(12)).toCharArray()));
//  MOVE SF503-MP-IPQ-TIMES (14) TO RP-MP-IPQ14
//  FORMAT_1059277505 = "ZZZ9"
          methodOut.setRpMpIpq14(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(methodOut.getSf503MpIpqTimes(13)).toCharArray()));
//  MOVE SF503-MP-IPQ-TIMES (15) TO RP-MP-IPQ15
//  FORMAT_1059277505 = "ZZZ9"
          methodOut.setRpMpIpq15(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(methodOut.getSf503MpIpqTimes(14)).toCharArray()));
//  MOVE SF503-MP-IPQ-TIMES (16) TO RP-MP-IPQ16
//  FORMAT_1059277505 = "ZZZ9"
          methodOut.setRpMpIpq16(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(methodOut.getSf503MpIpqTimes(15)).toCharArray()));
//  MOVE SF503-MP-IPQ-TIMES (17) TO RP-MP-IPQ17
//  FORMAT_1059277505 = "ZZZ9"
          methodOut.setRpMpIpq17(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(methodOut.getSf503MpIpqTimes(16)).toCharArray()));
//  MOVE SF503-MP-IPQ-TIMES (18) TO RP-MP-IPQ18
//  FORMAT_1059277505 = "ZZZ9"
          methodOut.setRpMpIpq18(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(methodOut.getSf503MpIpqTimes(17)).toCharArray()));
//  MOVE SF503-MP-IPQ-TIMES (19) TO RP-MP-IPQ19
//  FORMAT_1059277505 = "ZZZ9"
          methodOut.setRpMpIpq19(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(methodOut.getSf503MpIpqTimes(18)).toCharArray()));
//  MOVE SF503-MP-IPQ-TIMES (20) TO RP-MP-IPQ20
//  FORMAT_1059277505 = "ZZZ9"
          methodOut.setRpMpIpq20(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(methodOut.getSf503MpIpqTimes(19)).toCharArray()));
//  IF CT-RPT-MP-LINE-NO GREATER THAN 56
          if (	( methodOut.getCtRptMpLineNo() > 56 )) { 
//  PERFORM 1410-FORMAT-MIP-PROFILE-HDR
              formatMipProfileHdr(programCtx.getFormatMipProfileHdrInCtx());/*1410-FORMAT-MIP-PROFILE-HDR*/
          }
//  ELSE
          // MOVE RP-MP-DETAIL-1 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpMpDetail1().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
          // MOVE RP-MP-DETAIL-2 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpMpDetail2().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
//  MOVE RP-MP-DETAIL-3 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpMpDetail3());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
          // MOVE RP-MP-DETAIL-4 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpMpDetail4().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
          // MOVE RP-MP-DETAIL-5 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpMpDetail5().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
          // MOVE RP-MP-DETAIL-6 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpMpDetail6().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
//  ADD 7 TO CT-RPT-MP-LINE-NO
          methodOut.setCtRptMpLineNo(methodOut.getCtRptMpLineNo()+7);
//  ADD 1 TO CT-LOG-MIP-PROFILE
          methodOut.setCtLogMipProfile(methodOut.getCtLogMipProfile()+(long)1);
      
      return methodOut;
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
      @Override
      public FormatMipProfileHdrOutCtx formatMipProfileHdr(FormatMipProfileHdrInCtx methodIn) throws Exception {
Sf320010Ctx programCtx = methodIn.getSf320010Ctx();
FormatMipProfileHdrOutCtx methodOut = methodIn.getFormatMipProfileHdrOutCtx();
//  MOVE 'DD' TO RP-H1-RPT-CODE
//  LITERAL_DD = 'DD'
          methodOut.setRpH1RptCode(CONSTANTS.LITERAL_DD);
          // MOVE RP-HEADING-1 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpHeading1().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
//  ADD 1 TO CT-RPT-MP-PAGE-NO
          methodOut.setCtRptMpPageNo(methodOut.getCtRptMpPageNo()+1);
//  MOVE CT-RPT-MP-PAGE-NO TO RP-MP-H2-PAGENUMBER
//  FORMAT_1059277505 = "ZZZ9"
          methodOut.setRpMpH2Pagenumber(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(methodOut.getCtRptMpPageNo()).toCharArray()));
          // MOVE RP-MP-HEADING-2 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpMpHeading2().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
//  MOVE 3 TO CT-RPT-MP-LINE-NO
//  LITERAL_3 = 3
          methodOut.setCtRptMpLineNo(3);
      
      return methodOut;
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
      @Override
      public FormatPosTransLogRptOutCtx formatPosTransLogRpt(FormatPosTransLogRptInCtx methodIn) throws Exception {
Sf320010Ctx programCtx = methodIn.getSf320010Ctx();
FormatPosTransLogRptOutCtx methodOut = methodIn.getFormatPosTransLogRptOutCtx();
//  MOVE 'E' TO RP-REPORT-CODE
//  LITERAL_E = 'E'
          methodOut.setRpReportCode(CONSTANTS.LITERAL_E);
//  MOVE SPACE TO RP-PS-D-CC
          methodOut.setRpPsDCc(CONSTANTS.SPACE);
//  MOVE SF503-PS-RECORD-TYPE TO RP-PS-RECORD-TYPE
          methodOut.setRpPsRecordType(methodOut.getSf503PsRecordType());
//  MOVE SF503-PS-REFERENCE-NBR TO RP-PS-REFERENCE-NBR
          methodOut.setRpPsReferenceNbr(methodOut.getSf503PsReferenceNbr());
//  MOVE SF503-PS-TIME TO WA-TIME
          methodOut.getWaTime().setString(methodOut.getSf503PsTime());
//  MOVE WA-TIME-HOURS TO WA-TIME-HH
          methodOut.setWaTimeHh(methodOut.getWaTimeHours());
//  MOVE WA-TIME-MINUTES TO WA-TIME-MM
          methodOut.setWaTimeMm(methodOut.getWaTimeMinutes());
//  MOVE WA-TIME-SECONDS TO WA-TIME-SS
          methodOut.setWaTimeSs(methodOut.getWaTimeSeconds());
          // MOVE WA-TIME-HMSH TO RP-PS-TIME
          methodOut.setRpPsTime(methodOut.getWaTimeHmsh().toCharArray());
//  MOVE SF503-PS-TRANS-DATE TO WA-DATE
          methodOut.getWaDate().setString(methodOut.getSf503PsTransDate());
//  MOVE WA-DATE-MONTH TO WA-DATE-MN
          methodOut.setWaDateMn(methodOut.getWaDateMonth());
//  MOVE WA-DATE-DAY TO WA-DATE-DY
          methodOut.setWaDateDy(methodOut.getWaDateDay());
//  MOVE WA-DATE-YEAR TO WA-DATE-YR
          methodOut.setWaDateYr(methodOut.getWaDateYear());
          // MOVE WA-DATE-MDY TO RP-PS-TRANS-DATE
          methodOut.setRpPsTransDate(methodOut.getWaDateMdy().toCharArray());
//  MOVE SF503-PS-FLOOR-LIM-IND TO RP-PS-FLOOR-LIM-IND
          methodOut.setRpPsFloorLimInd(methodOut.getSf503PsFloorLimInd());
          // MOVE SF503-PS-FLOOR-LIM-AMT TO RP-PS-FLOOR-LIM-AMT
          methodOut.setRpPsFloorLimAmt(methodOut.getSf503PsFloorLimAmt());
//  MOVE SF503-PS-POS-RESPONSE TO RP-PS-POS-RESPONSE
          methodOut.setRpPsPosResponse(methodOut.getSf503PsPosResponse());
//  MOVE SF503-PS-REJECT-REASON TO RP-PS-REJECT-REASON
          methodOut.setRpPsRejectReason(methodOut.getSf503PsRejectReason());
//  MOVE SF503-PS-INAS-TRANS-CODE TO RP-PS-INAS-TRANS-CODE
          methodOut.setRpPsInasTransCode(methodOut.getSf503PsInasTransCode());
//  MOVE SF503-PS-INAS-RESPONSE TO RP-PS-INAS-RESPONSE
          methodOut.setRpPsInasResponse(methodOut.getSf503PsInasResponse());
//  MOVE SF503-PS-AUTHORIZATION-CODE TO RP-PS-AUTHORIZATION-CODE
          methodOut.setRpPsAuthorizationCode(methodOut.getSf503PsAuthorizationCode());
//  MOVE SF503-PS-ICA-NUMBER TO RP-PS-ICA-NUMBER
          methodOut.setRpPsIcaNumber(methodOut.getSf503PsIcaNumber());
//  MOVE SF503-PS-TERMINAL-ID TO RP-PS-TERMINAL-ID
          methodOut.setRpPsTerminalId(methodOut.getSf503PsTerminalId());
//  MOVE SF503-PS-CARDHOLDER-NBR TO RP-PS-CARDHOLDER-NBR
          methodOut.setRpPsCardholderNbr(methodOut.getSf503PsCardholderNbr());
//  MOVE SF503-PS-EXPIRATION-DATE TO RP-PS-EXPIRATION-DATE
          methodOut.setRpPsExpirationDate(methodOut.getSf503PsExpirationDate());
//  IF SF503-PS-TRANS-AMOUNT-X IS NUMERIC
          if (    isNumeric(methodOut.getSf503PsTransAmountX())) { 
              // MOVE SF503-PS-TRANS-AMOUNT TO RP-PS-TRANS-AMOUNT
              //  FORMAT_1287115115 = "ZZZZ9.99"
              methodOut.setRpPsTransAmount(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1287115115,methodOut.getSf503PsTransAmount().toPlainString().toCharArray()));
          }
//  ELSE
          else { 
              // MOVE SF503-PS-TRANS-AMOUNT-X TO RP-PS-TRANS-AMOUNT-X
              methodOut.getRpPsTransAmountX().setString(methodOut.getSf503PsTransAmountX().getCharArray());
          }
//  MOVE SF503-PS-MAGNETIC-STRIPE-IND TO RP-PS-MAGNETIC-STRIPE-IND
          methodOut.setRpPsMagneticStripeInd(methodOut.getSf503PsMagneticStripeInd());
//  MOVE SF503-PS-MESSAGE-STATUS TO RP-PS-MESSAGE-STATUS
          methodOut.setRpPsMessageStatus(methodOut.getSf503PsMessageStatus());
//  MOVE SF503-PS-NETWORK-TYPE TO RP-PS-NETWORK-TYPE
          methodOut.setRpPsNetworkType(methodOut.getSf503PsNetworkType());
//  MOVE SF503-PS-QUEUE-ID-INPUT-PORT TO RP-PS-QUEUE-ID-INPUT-PORT
          methodOut.setRpPsQueueIdInputPort(methodOut.getSf503PsQueueIdInputPort());
//  MOVE SF503-PS-TIME-IN-SYSTEM-HH TO RP-PS-TIME-IN-SYSTEM-HH
          methodOut.setRpPsTimeInSystemHh(methodOut.getSf503PsTimeInSystemHh());
//  MOVE SF503-PS-TIME-IN-SYSTEM-MM TO RP-PS-TIME-IN-SYSTEM-MM
          methodOut.setRpPsTimeInSystemMm(methodOut.getSf503PsTimeInSystemMm());
//  MOVE SF503-PS-TIME-IN-SYSTEM-SS TO RP-PS-TIME-IN-SYSTEM-SS
          methodOut.setRpPsTimeInSystemSs(methodOut.getSf503PsTimeInSystemSs());
//  MOVE SF503-PS-TERMINAL-AUTH-CODE TO RP-PS-TERMINAL-AUTH-CODE
          methodOut.setRpPsTerminalAuthCode(methodOut.getSf503PsTerminalAuthCode());
//  IF CT-RPT-PS-LINE-NO GREATER THAN 56
          if (	( methodOut.getCtRptPsLineNo() > 56 )) { 
//  PERFORM 1510-FORMAT-POS-REPORT-HDR
              formatPosReportHdr(programCtx.getFormatPosReportHdrInCtx());/*1510-FORMAT-POS-REPORT-HDR*/
          }
//  ELSE
          // MOVE RP-PS-DETAIL TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpPsDetail().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
//  ADD 1 TO CT-RPT-PS-LINE-NO CT-LOG-POS
          methodOut.setCtRptPsLineNo(methodOut.getCtRptPsLineNo()+1);
          methodOut.setCtLogPos(methodOut.getCtLogPos()+(long)1);
      
      return methodOut;
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
      @Override
      public FormatPosReportHdrOutCtx formatPosReportHdr(FormatPosReportHdrInCtx methodIn) throws Exception {
Sf320010Ctx programCtx = methodIn.getSf320010Ctx();
FormatPosReportHdrOutCtx methodOut = methodIn.getFormatPosReportHdrOutCtx();
//  MOVE 'EE' TO RP-H1-RPT-CODE
//  LITERAL_EE = 'EE'
          methodOut.setRpH1RptCode(CONSTANTS.LITERAL_EE);
          // MOVE RP-HEADING-1 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpHeading1().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
//  ADD 1 TO CT-RPT-PS-PAGE-NO
          methodOut.setCtRptPsPageNo(methodOut.getCtRptPsPageNo()+1);
//  MOVE CT-RPT-PS-PAGE-NO TO RP-PS-H2-PAGENUMBER
//  FORMAT_1059277505 = "ZZZ9"
          methodOut.setRpPsH2Pagenumber(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(methodOut.getCtRptPsPageNo()).toCharArray()));
          // MOVE RP-PS-HEADING-2 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpPsHeading2().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
//  MOVE RP-PS-HEADING-3 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpPsHeading3());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
//  MOVE RP-PS-HEADING-4 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpPsHeading4());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
//  MOVE ZERO TO RP-PS-D-CC
          methodOut.setRpPsDCc(CONSTANTS.ZERO_1);
//  MOVE 7 TO CT-RPT-PS-LINE-NO
//  LITERAL_7 = 7
          methodOut.setCtRptPsLineNo(7);
      
      return methodOut;
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
      @Override
      public FormatTypeIiActivityOutCtx formatTypeIiActivity(FormatTypeIiActivityInCtx methodIn) throws Exception {
Sf320010Ctx programCtx = methodIn.getSf320010Ctx();
FormatTypeIiActivityOutCtx methodOut = methodIn.getFormatTypeIiActivityOutCtx();
//  IF FIRST-T2-RECORD
          if ( methodIn.isFirstT2Record()  ) { 
//  MOVE '1' TO FIRST-T2-RCD-IND
//  LITERAL_1 = '1'
              methodOut.setFirstT2RcdInd(CONSTANTS.LITERAL_1);
              // MOVE SF503-SORT-DATE TO PREV-T2-SORT-DATE
              methodOut.setPrevT2SortDate(methodOut.getSf503SortDate());
              // MOVE SF503-SORT-MIP-ID TO PREV-T2-SORT-MIP-ID
              methodOut.setPrevT2SortMipId(methodOut.getSf503SortMipId());
          }
//  ELSE
//  IF SF503-T2-RECORD-TYPE = '1'
//  LITERAL_1 = '1'
          if (compareChars(methodIn.getSf503T2RecordType(), CONSTANTS.LITERAL_1) == 0) { 
//  ADD 1 TO CT-C7-LOG-TYPE-1
              methodOut.setCtC7LogType1(methodOut.getCtC7LogType1()+(long)1);
          }
//  ELSE
          else { 
//  IF SF503-T2-RECORD-TYPE = '2'
//  LITERAL_2 = '2'
              if (compareChars(methodIn.getSf503T2RecordType(), CONSTANTS.LITERAL_2) == 0) { 
//  ADD 1 TO CT-C7-LOG-TYPE-2
                  methodOut.setCtC7LogType2(methodOut.getCtC7LogType2()+(long)1);
              }
//  ELSE
              else { 
//  IF SF503-T2-RECORD-TYPE = '3'
//  LITERAL_3 = '3'
                  if (compareChars(methodIn.getSf503T2RecordType(), CONSTANTS.LITERAL_3) == 0) { 
//  ADD 1 TO CT-C7-LOG-TYPE-3
                      methodOut.setCtC7LogType3(methodOut.getCtC7LogType3()+(long)1);
                  }
//  ELSE
                  else { 
//  IF SF503-T2-RECORD-TYPE = '4'
//  LITERAL_4 = '4'
                      if (compareChars(methodIn.getSf503T2RecordType(), CONSTANTS.LITERAL_4) == 0) { 
//  ADD 1 TO CT-C7-LOG-TYPE-4
                          methodOut.setCtC7LogType4(methodOut.getCtC7LogType4()+(long)1);
                      }
//  ELSE
                      else { 
//  IF SF503-T2-RECORD-TYPE = '5'
//  LITERAL_5 = '5'
                          if (compareChars(methodIn.getSf503T2RecordType(), CONSTANTS.LITERAL_5) == 0) { 
//  ADD 1 TO CT-C7-LOG-TYPE-5
                              methodOut.setCtC7LogType5(methodOut.getCtC7LogType5()+(long)1);
                          }
//  ELSE
                          else { 
//  IF SF503-T2-RECORD-TYPE = '6'
//  LITERAL_6 = '6'
                              if (compareChars(methodIn.getSf503T2RecordType(), CONSTANTS.LITERAL_6) == 0) { 
//  ADD 1 TO CT-C7-LOG-TYPE-6
                                  methodOut.setCtC7LogType6(methodOut.getCtC7LogType6()+(long)1);
                              }
//  ELSE
                              else { 
//  IF SF503-T2-RECORD-TYPE = '7'
//  LITERAL_7 = '7'
                                  if (compareChars(methodIn.getSf503T2RecordType(), CONSTANTS.LITERAL_7) == 0) { 
//  ADD 1 TO CT-C7-LOG-TYPE-7
                                      methodOut.setCtC7LogType7(methodOut.getCtC7LogType7()+(long)1);
                                  }
//  ELSE
                                  else { 
//  IF SF503-T2-RECORD-TYPE = '8'
//  LITERAL_8 = '8'
                                      if (compareChars(methodIn.getSf503T2RecordType(), CONSTANTS.LITERAL_8) == 0) { 
//  ADD 1 TO CT-C7-LOG-TYPE-8
                                          methodOut.setCtC7LogType8(methodOut.getCtC7LogType8()+(long)1);
                                      }
//  ELSE
                                      else { 
//  IF SF503-T2-RECORD-TYPE = '9'
//  LITERAL_9 = '9'
                                          if (compareChars(methodIn.getSf503T2RecordType(), CONSTANTS.LITERAL_9) == 0) { 
//  ADD 1 TO CT-C7-LOG-TYPE-9
                                              methodOut.setCtC7LogType9(methodOut.getCtC7LogType9()+(long)1);
                                          }
//  ELSE
                                          else { 
//  IF SF503-T2-RECORD-TYPE = 'A'
//  LITERAL_A = 'A'
                                              if (compareChars(methodIn.getSf503T2RecordType(), CONSTANTS.LITERAL_A) == 0) { 
//  ADD 1 TO CT-C7-LOG-TYPE-A
                                                  methodOut.setCtC7LogTypeA(methodOut.getCtC7LogTypeA()+(long)1);
                                              }
//  ELSE
                                              else { 
//  ADD 1 TO CT-C7-UNDEF-LOG-TYPE
                                                  methodOut.setCtC7UndefLogType(methodOut.getCtC7UndefLogType()+(long)1);
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
          methodOut.setCtLogTypeii(methodOut.getCtLogTypeii()+(long)1);
//  IF SF503-SORT-MIP-ID = PREV-T2-SORT-MIP-ID
//  ELSE
          if (		compareChars(methodOut.getSf503SortMipId(),methodOut.getPrevT2SortMipId()) != 0 ) { 
//  PERFORM 1610-FORMAT-TYPE-II-LOG-RPT
              formatTypeIiLogRpt(programCtx);/*1610-FORMAT-TYPE-II-LOG-RPT*/
              // MOVE SF503-SORT-DATE TO PREV-T2-SORT-DATE
              methodOut.setPrevT2SortDate(methodOut.getSf503SortDate());
              // MOVE SF503-SORT-MIP-ID TO PREV-T2-SORT-MIP-ID
              methodOut.setPrevT2SortMipId(methodOut.getSf503SortMipId());
          }
      
      return methodOut;
      }
      /**
      * formatTypeIiLogRpt 
      *   This method is derived from 
  *   COBOL Paragraph - 1610-FORMAT-TYPE-II-LOG-RPT COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void formatTypeIiLogRpt(Sf320010Ctx programCtx) throws Exception {
//  PERFORM 1610-FORMAT-TYPE-II-LOG-RPT-SPLIT0
          formatTypeIiLogRptSplit0(programCtx.getFormatTypeIiLogRptSplit0InCtx());/*1610-FORMAT-TYPE-II-LOG-RPT-SPLIT0*/
//  PERFORM 1610-FORMAT-TYPE-II-LOG-RPT-SPLIT1
          formatTypeIiLogRptSplit1(programCtx.getFormatTypeIiLogRptSplit1InCtx());/*1610-FORMAT-TYPE-II-LOG-RPT-SPLIT1*/
      
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
      @Override
      public FormatTypeIiLogRptSplit0OutCtx formatTypeIiLogRptSplit0(FormatTypeIiLogRptSplit0InCtx methodIn) throws Exception {
Sf320010Ctx programCtx = methodIn.getSf320010Ctx();
FormatTypeIiLogRptSplit0OutCtx methodOut = methodIn.getFormatTypeIiLogRptSplit0OutCtx();
//  MOVE 'GG' TO RP-H1-RPT-CODE
//  LITERAL_GG = 'GG'
          methodOut.setRpH1RptCode(CONSTANTS.LITERAL_GG);
//  MOVE 'G' TO RP-REPORT-CODE
//  LITERAL_G = 'G'
          methodOut.setRpReportCode(CONSTANTS.LITERAL_G);
          // MOVE RP-HEADING-1 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpHeading1().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
//  ADD 1 TO CT-RPT-T2-PAGE-NO
          methodOut.setCtRptT2PageNo(methodOut.getCtRptT2PageNo()+1);
//  MOVE RP-C7-HEADING-2 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(pad(133,methodOut.getRpC7Heading2(),SPACE_CHAR,RIGHT_PAD));
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
//  MOVE CT-RPT-T2-PAGE-NO TO RP-C7-H3-PAGENUMBER
//  FORMAT_1059277505 = "ZZZ9"
          methodOut.setRpC7H3Pagenumber(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(methodOut.getCtRptT2PageNo()).toCharArray()));
          // MOVE RP-C7-HEADING-3 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC7Heading3().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
//  MOVE PREV-T2-SORT-DATE TO RP-C7-H4-DT-STAMP
          methodOut.setRpC7H4DtStamp(pad(8,methodOut.getPrevT2SortDate(),SPACE_CHAR,RIGHT_PAD));
//  MOVE PREV-T2-SORT-MIP-ID TO RP-C7-H4-MIP-ID
          methodOut.setRpC7H4MipId(methodOut.getPrevT2SortMipId());
          // MOVE RP-C7-HEADING-4 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC7Heading4().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
//  MOVE RP-C7-HEADING-5 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC7Heading5());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
          // MOVE '0' TO RP-C7-DET-CC
          //  LITERAL_0 = '0'
          methodOut.setRpC7DetCc(CONSTANTS.LITERAL_0);
          // MOVE '1' TO RP-C7-DET-LOG-TYPE
          //  LITERAL_1 = '1'
          methodOut.setRpC7DetLogType(CONSTANTS.LITERAL_1);
//  MOVE RP-C7-LOG-DESC-1 TO RP-C7-DET-LOG-DESC
          methodOut.setRpC7DetLogDesc(methodOut.getRpC7LogDesc1());
//  MOVE CT-C7-LOG-TYPE-1 TO RP-C7-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          methodOut.setRpC7DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(methodOut.getCtC7LogType1()).toCharArray()));
          // MOVE RP-C7-DETAIL TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC7Detail().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
          // MOVE '2' TO RP-C7-DET-LOG-TYPE
          //  LITERAL_2 = '2'
          methodOut.setRpC7DetLogType(CONSTANTS.LITERAL_2);
//  MOVE RP-C7-LOG-DESC-2 TO RP-C7-DET-LOG-DESC
          methodOut.setRpC7DetLogDesc(methodOut.getRpC7LogDesc2());
//  MOVE CT-C7-LOG-TYPE-2 TO RP-C7-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          methodOut.setRpC7DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(methodOut.getCtC7LogType2()).toCharArray()));
          // MOVE RP-C7-DETAIL TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC7Detail().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
          // MOVE '3' TO RP-C7-DET-LOG-TYPE
          //  LITERAL_3 = '3'
          methodOut.setRpC7DetLogType(CONSTANTS.LITERAL_3);
//  MOVE RP-C7-LOG-DESC-3 TO RP-C7-DET-LOG-DESC
          methodOut.setRpC7DetLogDesc(methodOut.getRpC7LogDesc3());
//  MOVE CT-C7-LOG-TYPE-3 TO RP-C7-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          methodOut.setRpC7DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(methodOut.getCtC7LogType3()).toCharArray()));
          // MOVE RP-C7-DETAIL TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC7Detail().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
          // MOVE '4' TO RP-C7-DET-LOG-TYPE
          //  LITERAL_4 = '4'
          methodOut.setRpC7DetLogType(CONSTANTS.LITERAL_4);
//  MOVE RP-C7-LOG-DESC-4 TO RP-C7-DET-LOG-DESC
          methodOut.setRpC7DetLogDesc(methodOut.getRpC7LogDesc4());
//  MOVE CT-C7-LOG-TYPE-4 TO RP-C7-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          methodOut.setRpC7DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(methodOut.getCtC7LogType4()).toCharArray()));
          // MOVE RP-C7-DETAIL TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC7Detail().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
          // MOVE '5' TO RP-C7-DET-LOG-TYPE
          //  LITERAL_5 = '5'
          methodOut.setRpC7DetLogType(CONSTANTS.LITERAL_5);
//  MOVE RP-C7-LOG-DESC-5 TO RP-C7-DET-LOG-DESC
          methodOut.setRpC7DetLogDesc(methodOut.getRpC7LogDesc5());
//  MOVE CT-C7-LOG-TYPE-5 TO RP-C7-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          methodOut.setRpC7DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(methodOut.getCtC7LogType5()).toCharArray()));
          // MOVE RP-C7-DETAIL TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC7Detail().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
          // MOVE '6' TO RP-C7-DET-LOG-TYPE
          //  LITERAL_6 = '6'
          methodOut.setRpC7DetLogType(CONSTANTS.LITERAL_6);
//  MOVE RP-C7-LOG-DESC-6 TO RP-C7-DET-LOG-DESC
          methodOut.setRpC7DetLogDesc(methodOut.getRpC7LogDesc6());
//  MOVE CT-C7-LOG-TYPE-6 TO RP-C7-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          methodOut.setRpC7DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(methodOut.getCtC7LogType6()).toCharArray()));
          // MOVE RP-C7-DETAIL TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC7Detail().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
          // MOVE '7' TO RP-C7-DET-LOG-TYPE
          //  LITERAL_7 = '7'
          methodOut.setRpC7DetLogType(CONSTANTS.LITERAL_7);
//  MOVE RP-C7-LOG-DESC-7 TO RP-C7-DET-LOG-DESC
          methodOut.setRpC7DetLogDesc(methodOut.getRpC7LogDesc7());
//  MOVE CT-C7-LOG-TYPE-7 TO RP-C7-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          methodOut.setRpC7DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(methodOut.getCtC7LogType7()).toCharArray()));
          // MOVE RP-C7-DETAIL TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC7Detail().toCharArray());
      
      return methodOut;
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
      @Override
      public FormatTypeIiLogRptSplit1OutCtx formatTypeIiLogRptSplit1(FormatTypeIiLogRptSplit1InCtx methodIn) throws Exception {
Sf320010Ctx programCtx = methodIn.getSf320010Ctx();
FormatTypeIiLogRptSplit1OutCtx methodOut = methodIn.getFormatTypeIiLogRptSplit1OutCtx();
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
          // MOVE '8' TO RP-C7-DET-LOG-TYPE
          //  LITERAL_8 = '8'
          methodOut.setRpC7DetLogType(CONSTANTS.LITERAL_8);
//  MOVE RP-C7-LOG-DESC-8 TO RP-C7-DET-LOG-DESC
          methodOut.setRpC7DetLogDesc(methodOut.getRpC7LogDesc8());
//  MOVE CT-C7-LOG-TYPE-8 TO RP-C7-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          methodOut.setRpC7DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(methodOut.getCtC7LogType8()).toCharArray()));
          // MOVE RP-C7-DETAIL TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC7Detail().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
          // MOVE '9' TO RP-C7-DET-LOG-TYPE
          //  LITERAL_9 = '9'
          methodOut.setRpC7DetLogType(CONSTANTS.LITERAL_9);
//  MOVE RP-C7-LOG-DESC-9 TO RP-C7-DET-LOG-DESC
          methodOut.setRpC7DetLogDesc(methodOut.getRpC7LogDesc9());
//  MOVE CT-C7-LOG-TYPE-9 TO RP-C7-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          methodOut.setRpC7DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(methodOut.getCtC7LogType9()).toCharArray()));
          // MOVE RP-C7-DETAIL TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC7Detail().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
//  MOVE 'A' TO RP-C7-DET-LOG-TYPE
//  LITERAL_A = 'A'
          methodOut.setRpC7DetLogType(CONSTANTS.LITERAL_A);
//  MOVE RP-C7-LOG-DESC-A TO RP-C7-DET-LOG-DESC
          methodOut.setRpC7DetLogDesc(methodOut.getRpC7LogDescA());
//  MOVE CT-C7-LOG-TYPE-A TO RP-C7-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          methodOut.setRpC7DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(methodOut.getCtC7LogTypeA()).toCharArray()));
          // MOVE RP-C7-DETAIL TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC7Detail().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
//  MOVE '-' TO RP-C7-DET-LOG-TYPE
//  LITERAL_MN_ = '-'
          methodOut.setRpC7DetLogType(CONSTANTS.LITERAL_MN_);
//  MOVE RP-UNDEF-LOG-DESC TO RP-C7-DET-LOG-DESC
          methodOut.setRpC7DetLogDesc(methodOut.getRpUndefLogDesc());
//  MOVE CT-C7-UNDEF-LOG-TYPE TO RP-C7-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          methodOut.setRpC7DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(methodOut.getCtC7UndefLogType()).toCharArray()));
          // MOVE RP-C7-DETAIL TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC7Detail().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
//  MOVE ZEROS TO CT-C7-LOG-TYPE-1 CT-C7-LOG-TYPE-2 CT-C7-LOG-TYPE-3 CT-C7-LOG-TYPE-4 CT-C7-LOG-TYPE-5 CT-C7-LOG-TYPE-6 CT-C7-LOG-TYPE-7 CT-C7-LOG-TYPE-8 CT-C7-LOG-TYPE-9 CT-C7-LOG-TYPE-A CT-C7-UNDEF-LOG-TYPE
          methodOut.setCtC7LogType1(0);
          methodOut.setCtC7LogType2(0);
          methodOut.setCtC7LogType3(0);
          methodOut.setCtC7LogType4(0);
          methodOut.setCtC7LogType5(0);
          methodOut.setCtC7LogType6(0);
          methodOut.setCtC7LogType7(0);
          methodOut.setCtC7LogType8(0);
          methodOut.setCtC7LogType9(0);
          methodOut.setCtC7LogTypeA(0);
          methodOut.setCtC7UndefLogType(0);
      
      return methodOut;
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
      @Override
      public FormatX92ActivityOutCtx formatX92Activity(FormatX92ActivityInCtx methodIn) throws Exception {
Sf320010Ctx programCtx = methodIn.getSf320010Ctx();
FormatX92ActivityOutCtx methodOut = methodIn.getFormatX92ActivityOutCtx();
//  IF FIRST-X92-RECORD
          if ( methodIn.isFirstX92Record()  ) { 
//  MOVE '1' TO FIRST-X92-RCD-IND
//  LITERAL_1 = '1'
              methodOut.setFirstX92RcdInd(CONSTANTS.LITERAL_1);
              // MOVE SF503-SORT-DATE TO PREV-X92-SORT-DATE
              methodOut.setPrevX92SortDate(methodOut.getSf503SortDate());
              // MOVE SF503-SORT-MIP-ID TO PREV-X92-SORT-MIP-ID
              methodOut.setPrevX92SortMipId(methodOut.getSf503SortMipId());
          }
//  ELSE
//  IF SF503-X92-RECORD-TYPE = '01'
//  LITERAL_01 = '01'
          if (		compareChars(methodIn.getSf503X92RecordType(),CONSTANTS.LITERAL_01) == 0 ) { 
//  ADD 1 TO CT-C9-LOG-TYPE-1
              methodOut.setCtC9LogType1(methodOut.getCtC9LogType1()+(long)1);
          }
//  ELSE
          else { 
//  IF SF503-X92-RECORD-TYPE = '02'
//  LITERAL_02 = '02'
              if (		compareChars(methodIn.getSf503X92RecordType(),CONSTANTS.LITERAL_02) == 0 ) { 
//  ADD 1 TO CT-C9-LOG-TYPE-2
                  methodOut.setCtC9LogType2(methodOut.getCtC9LogType2()+(long)1);
              }
//  ELSE
              else { 
//  IF SF503-X92-RECORD-TYPE = '03'
//  LITERAL_03 = '03'
                  if (		compareChars(methodIn.getSf503X92RecordType(),CONSTANTS.LITERAL_03) == 0 ) { 
//  ADD 1 TO CT-C9-LOG-TYPE-3
                      methodOut.setCtC9LogType3(methodOut.getCtC9LogType3()+(long)1);
                  }
//  ELSE
                  else { 
//  IF SF503-X92-RECORD-TYPE = '04'
//  LITERAL_04 = '04'
                      if (		compareChars(methodIn.getSf503X92RecordType(),CONSTANTS.LITERAL_04) == 0 ) { 
//  ADD 1 TO CT-C9-LOG-TYPE-4
                          methodOut.setCtC9LogType4(methodOut.getCtC9LogType4()+(long)1);
                      }
//  ELSE
                      else { 
//  IF SF503-X92-RECORD-TYPE = '05'
//  LITERAL_05 = '05'
                          if (		compareChars(methodIn.getSf503X92RecordType(),CONSTANTS.LITERAL_05) == 0 ) { 
//  ADD 1 TO CT-C9-LOG-TYPE-5
                              methodOut.setCtC9LogType5(methodOut.getCtC9LogType5()+(long)1);
                          }
//  ELSE
                          else { 
//  IF SF503-X92-RECORD-TYPE = '06'
//  LITERAL_06 = '06'
                              if (		compareChars(methodIn.getSf503X92RecordType(),CONSTANTS.LITERAL_06) == 0 ) { 
//  ADD 1 TO CT-C9-LOG-TYPE-6
                                  methodOut.setCtC9LogType6(methodOut.getCtC9LogType6()+(long)1);
                              }
//  ELSE
                              else { 
//  IF SF503-X92-RECORD-TYPE = '07'
//  LITERAL_07 = '07'
                                  if (		compareChars(methodIn.getSf503X92RecordType(),CONSTANTS.LITERAL_07) == 0 ) { 
//  ADD 1 TO CT-C9-LOG-TYPE-7
                                      methodOut.setCtC9LogType7(methodOut.getCtC9LogType7()+(long)1);
                                  }
//  ELSE
                                  else { 
//  IF SF503-X92-RECORD-TYPE = '08'
//  LITERAL_08 = '08'
                                      if (		compareChars(methodIn.getSf503X92RecordType(),CONSTANTS.LITERAL_08) == 0 ) { 
//  ADD 1 TO CT-C9-LOG-TYPE-8
                                          methodOut.setCtC9LogType8(methodOut.getCtC9LogType8()+(long)1);
                                      }
//  ELSE
                                      else { 
//  IF SF503-X92-RECORD-TYPE = '09'
//  LITERAL_09 = '09'
                                          if (		compareChars(methodIn.getSf503X92RecordType(),CONSTANTS.LITERAL_09) == 0 ) { 
//  ADD 1 TO CT-C9-LOG-TYPE-9
                                              methodOut.setCtC9LogType9(methodOut.getCtC9LogType9()+(long)1);
                                          }
//  ELSE
                                          else { 
//  IF SF503-X92-RECORD-TYPE = '10'
//  LITERAL_10 = '10'
                                              if (		compareChars(methodIn.getSf503X92RecordType(),CONSTANTS.LITERAL_10) == 0 ) { 
//  ADD 1 TO CT-C9-LOG-TYPE-10
                                                  methodOut.setCtC9LogType10(methodOut.getCtC9LogType10()+(long)1);
                                              }
//  ELSE
                                              else { 
//  IF SF503-X92-RECORD-TYPE = '11'
//  LITERAL_11 = '11'
                                                  if (		compareChars(methodIn.getSf503X92RecordType(),CONSTANTS.LITERAL_11) == 0 ) { 
//  ADD 1 TO CT-C9-LOG-TYPE-11
                                                      methodOut.setCtC9LogType11(methodOut.getCtC9LogType11()+(long)1);
                                                  }
//  ELSE
                                                  else { 
//  IF SF503-X92-RECORD-TYPE = '12'
//  LITERAL_12 = '12'
                                                      if (		compareChars(methodIn.getSf503X92RecordType(),CONSTANTS.LITERAL_12) == 0 ) { 
//  ADD 1 TO CT-C9-LOG-TYPE-12
                                                          methodOut.setCtC9LogType12(methodOut.getCtC9LogType12()+(long)1);
                                                      }
//  ELSE
                                                      else { 
//  IF SF503-X92-RECORD-TYPE = '13'
//  LITERAL_13 = '13'
                                                          if (		compareChars(methodIn.getSf503X92RecordType(),CONSTANTS.LITERAL_13) == 0 ) { 
//  ADD 1 TO CT-C9-LOG-TYPE-13
                                                              methodOut.setCtC9LogType13(methodOut.getCtC9LogType13()+(long)1);
                                                          }
//  ELSE
                                                          else { 
//  IF SF503-X92-RECORD-TYPE = '14'
//  LITERAL_14 = '14'
                                                              if (		compareChars(methodIn.getSf503X92RecordType(),CONSTANTS.LITERAL_14) == 0 ) { 
//  ADD 1 TO CT-C9-LOG-TYPE-14
                                                                  methodOut.setCtC9LogType14(methodOut.getCtC9LogType14()+(long)1);
                                                              }
//  ELSE
                                                              else { 
//  IF SF503-X92-RECORD-TYPE = '15'
//  LITERAL_15 = '15'
                                                                  if (		compareChars(methodIn.getSf503X92RecordType(),CONSTANTS.LITERAL_15) == 0 ) { 
//  ADD 1 TO CT-C9-LOG-TYPE-15
                                                                      methodOut.setCtC9LogType15(methodOut.getCtC9LogType15()+(long)1);
                                                                  }
//  ELSE
                                                                  else { 
//  IF SF503-X92-RECORD-TYPE = '16'
//  LITERAL_16 = '16'
                                                                      if (		compareChars(methodIn.getSf503X92RecordType(),CONSTANTS.LITERAL_16) == 0 ) { 
//  ADD 1 TO CT-C9-LOG-TYPE-16
                                                                          methodOut.setCtC9LogType16(methodOut.getCtC9LogType16()+(long)1);
                                                                      }
//  ELSE
                                                                      else { 
//  IF SF503-X92-RECORD-TYPE = '17'
//  LITERAL_17 = '17'
                                                                          if (		compareChars(methodIn.getSf503X92RecordType(),CONSTANTS.LITERAL_17) == 0 ) { 
//  ADD 1 TO CT-C9-LOG-TYPE-17
                                                                              methodOut.setCtC9LogType17(methodOut.getCtC9LogType17()+(long)1);
                                                                          }
//  ELSE
                                                                          else { 
//  IF SF503-X92-RECORD-TYPE = '18'
//  LITERAL_18 = '18'
                                                                              if (		compareChars(methodIn.getSf503X92RecordType(),CONSTANTS.LITERAL_18) == 0 ) { 
//  ADD 1 TO CT-C9-LOG-TYPE-18
                                                                                  methodOut.setCtC9LogType18(methodOut.getCtC9LogType18()+(long)1);
                                                                              }
//  ELSE
                                                                              else { 
//  IF SF503-X92-RECORD-TYPE = '19'
//  LITERAL_19 = '19'
                                                                                  if (		compareChars(methodIn.getSf503X92RecordType(),CONSTANTS.LITERAL_19) == 0 ) { 
//  ADD 1 TO CT-C9-LOG-TYPE-19
                                                                                      methodOut.setCtC9LogType19(methodOut.getCtC9LogType19()+(long)1);
                                                                                  }
//  ELSE
                                                                                  else { 
//  IF SF503-X92-RECORD-TYPE = '20'
//  LITERAL_20 = '20'
                                                                                      if (		compareChars(methodIn.getSf503X92RecordType(),CONSTANTS.LITERAL_20) == 0 ) { 
//  ADD 1 TO CT-C9-LOG-TYPE-20
                                                                                          methodOut.setCtC9LogType20(methodOut.getCtC9LogType20()+(long)1);
                                                                                      }
//  ELSE
                                                                                      else { 
//  IF SF503-X92-RECORD-TYPE = '21'
//  LITERAL_21 = '21'
                                                                                          if (		compareChars(methodIn.getSf503X92RecordType(),CONSTANTS.LITERAL_21) == 0 ) { 
//  ADD 1 TO CT-C9-LOG-TYPE-21
                                                                                              methodOut.setCtC9LogType21(methodOut.getCtC9LogType21()+(long)1);
                                                                                          }
//  ELSE
                                                                                          else { 
//  IF SF503-X92-RECORD-TYPE = '22'
//  LITERAL_22 = '22'
                                                                                              if (		compareChars(methodIn.getSf503X92RecordType(),CONSTANTS.LITERAL_22) == 0 ) { 
//  ADD 1 TO CT-C9-LOG-TYPE-22
                                                                                                  methodOut.setCtC9LogType22(methodOut.getCtC9LogType22()+(long)1);
                                                                                              }
//  ELSE
                                                                                              else { 
//  IF SF503-X92-RECORD-TYPE = '23'
//  LITERAL_23 = '23'
                                                                                                  if (		compareChars(methodIn.getSf503X92RecordType(),CONSTANTS.LITERAL_23) == 0 ) { 
//  ADD 1 TO CT-C9-LOG-TYPE-23
                                                                                                      methodOut.setCtC9LogType23(methodOut.getCtC9LogType23()+(long)1);
                                                                                                  }
//  ELSE
                                                                                                  else { 
//  IF SF503-X92-RECORD-TYPE = '24'
//  LITERAL_24 = '24'
                                                                                                      if (		compareChars(methodIn.getSf503X92RecordType(),CONSTANTS.LITERAL_24) == 0 ) { 
//  ADD 1 TO CT-C9-LOG-TYPE-24
                                                                                                          methodOut.setCtC9LogType24(methodOut.getCtC9LogType24()+(long)1);
                                                                                                      }
//  ELSE
                                                                                                      else { 
//  IF SF503-X92-RECORD-TYPE = '25'
//  LITERAL_25 = '25'
                                                                                                          if (		compareChars(methodIn.getSf503X92RecordType(),CONSTANTS.LITERAL_25) == 0 ) { 
//  ADD 1 TO CT-C9-LOG-TYPE-25
                                                                                                              methodOut.setCtC9LogType25(methodOut.getCtC9LogType25()+(long)1);
                                                                                                          }
//  ELSE
                                                                                                          else { 
//  IF SF503-X92-RECORD-TYPE = '26'
//  LITERAL_26 = '26'
                                                                                                              if (		compareChars(methodIn.getSf503X92RecordType(),CONSTANTS.LITERAL_26) == 0 ) { 
//  ADD 1 TO CT-C9-LOG-TYPE-26
                                                                                                                  methodOut.setCtC9LogType26(methodOut.getCtC9LogType26()+(long)1);
                                                                                                              }
//  ELSE
                                                                                                              else { 
//  ADD 1 TO CT-C9-UNDEF-LOG-TYPE
                                                                                                                  methodOut.setCtC9UndefLogType(methodOut.getCtC9UndefLogType()+(long)1);
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
//  ELSE
          if (		compareChars(methodOut.getSf503SortMipId(),methodOut.getPrevX92SortMipId()) != 0 ) { 
//  PERFORM 1710-FORMAT-X92-ACTIVITY-RPT
              formatX92ActivityRpt(programCtx);/*1710-FORMAT-X92-ACTIVITY-RPT*/
              // MOVE SF503-SORT-DATE TO PREV-X92-SORT-DATE
              methodOut.setPrevX92SortDate(methodOut.getSf503SortDate());
              // MOVE SF503-SORT-MIP-ID TO PREV-X92-SORT-MIP-ID
              methodOut.setPrevX92SortMipId(methodOut.getSf503SortMipId());
          }
//  ADD 1 TO CT-LOG-X92
          methodOut.setCtLogX92(methodOut.getCtLogX92()+(long)1);
      
      return methodOut;
      }
      /**
      * formatX92ActivityRpt 
      *   This method is derived from 
  *   COBOL Paragraph - 1710-FORMAT-X92-ACTIVITY-RPT COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void formatX92ActivityRpt(Sf320010Ctx programCtx) throws Exception {
//  PERFORM 1710-FORMAT-X92-ACTIVITY-RPT-SPLIT2
          formatX92ActivityRptSplit2(programCtx.getFormatX92ActivityRptSplit2InCtx());/*1710-FORMAT-X92-ACTIVITY-RPT-SPLIT2*/
//  PERFORM 1710-FORMAT-X92-ACTIVITY-RPT-SPLIT3
          formatX92ActivityRptSplit3(programCtx.getFormatX92ActivityRptSplit3InCtx());/*1710-FORMAT-X92-ACTIVITY-RPT-SPLIT3*/
//  PERFORM 1710-FORMAT-X92-ACTIVITY-RPT-SPLIT4
          formatX92ActivityRptSplit4(programCtx.getFormatX92ActivityRptSplit4InCtx());/*1710-FORMAT-X92-ACTIVITY-RPT-SPLIT4*/
//  PERFORM 1710-FORMAT-X92-ACTIVITY-RPT-SPLIT5
          formatX92ActivityRptSplit5(programCtx.getFormatX92ActivityRptSplit5InCtx());/*1710-FORMAT-X92-ACTIVITY-RPT-SPLIT5*/
      
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
      @Override
      public FormatX92ActivityRptSplit2OutCtx formatX92ActivityRptSplit2(FormatX92ActivityRptSplit2InCtx methodIn) throws Exception {
Sf320010Ctx programCtx = methodIn.getSf320010Ctx();
FormatX92ActivityRptSplit2OutCtx methodOut = methodIn.getFormatX92ActivityRptSplit2OutCtx();
//  MOVE 'II' TO RP-H1-RPT-CODE
//  LITERAL_II = 'II'
          methodOut.setRpH1RptCode(CONSTANTS.LITERAL_II);
//  MOVE 'I' TO RP-REPORT-CODE
//  LITERAL_I = 'I'
          methodOut.setRpReportCode(CONSTANTS.LITERAL_I);
          // MOVE RP-HEADING-1 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpHeading1().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
//  ADD 1 TO CT-RPT-C9-PAGE-NO
          methodOut.setCtRptC9PageNo(methodOut.getCtRptC9PageNo()+1);
//  MOVE RP-C9-HEADING-2 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(pad(133,methodOut.getRpC9Heading2(),SPACE_CHAR,RIGHT_PAD));
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
//  MOVE CT-RPT-C9-PAGE-NO TO RP-C9-H3-PAGENUMBER
//  FORMAT_1059277505 = "ZZZ9"
          methodOut.setRpC9H3Pagenumber(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(methodOut.getCtRptC9PageNo()).toCharArray()));
          // MOVE RP-C9-HEADING-3 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC9Heading3().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
//  MOVE PREV-X92-SORT-DATE TO RP-C9-H4-DT-STAMP
          methodOut.setRpC9H4DtStamp(pad(8,methodOut.getPrevX92SortDate(),SPACE_CHAR,RIGHT_PAD));
//  MOVE PREV-X92-SORT-MIP-ID TO RP-C9-H4-MIP-ID
          methodOut.setRpC9H4MipId(methodOut.getPrevX92SortMipId());
          // MOVE RP-C9-HEADING-4 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC9Heading4().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
//  MOVE RP-C9-HEADING-5 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC9Heading5());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
          // MOVE '0' TO RP-C9-DET-CC
          //  LITERAL_0 = '0'
          methodOut.setRpC9DetCc(CONSTANTS.LITERAL_0);
//  MOVE ' 1' TO RP-C9-DET-LOG-TYPE
//  LITERAL_B_1 = ' 1'
          methodOut.setRpC9DetLogType(CONSTANTS.LITERAL_B_1);
//  MOVE RP-C9-LOG-DESC-1 TO RP-C9-DET-LOG-DESC
          methodOut.setRpC9DetLogDesc(methodOut.getRpC9LogDesc1());
//  MOVE CT-C9-LOG-TYPE-1 TO RP-C9-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          methodOut.setRpC9DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(methodOut.getCtC9LogType1()).toCharArray()));
          // MOVE RP-C9-DETAIL TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC9Detail().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
//  MOVE ' 2' TO RP-C9-DET-LOG-TYPE
//  LITERAL_B_2 = ' 2'
          methodOut.setRpC9DetLogType(CONSTANTS.LITERAL_B_2);
//  MOVE RP-C9-LOG-DESC-2 TO RP-C9-DET-LOG-DESC
          methodOut.setRpC9DetLogDesc(methodOut.getRpC9LogDesc2());
//  MOVE CT-C9-LOG-TYPE-2 TO RP-C9-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          methodOut.setRpC9DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(methodOut.getCtC9LogType2()).toCharArray()));
          // MOVE RP-C9-DETAIL TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC9Detail().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
//  MOVE ' 3' TO RP-C9-DET-LOG-TYPE
//  LITERAL_B_3 = ' 3'
          methodOut.setRpC9DetLogType(CONSTANTS.LITERAL_B_3);
//  MOVE RP-C9-LOG-DESC-3 TO RP-C9-DET-LOG-DESC
          methodOut.setRpC9DetLogDesc(methodOut.getRpC9LogDesc3());
//  MOVE CT-C9-LOG-TYPE-3 TO RP-C9-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          methodOut.setRpC9DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(methodOut.getCtC9LogType3()).toCharArray()));
          // MOVE RP-C9-DETAIL TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC9Detail().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
//  MOVE ' 4' TO RP-C9-DET-LOG-TYPE
//  LITERAL_B_4 = ' 4'
          methodOut.setRpC9DetLogType(CONSTANTS.LITERAL_B_4);
//  MOVE RP-C9-LOG-DESC-4 TO RP-C9-DET-LOG-DESC
          methodOut.setRpC9DetLogDesc(methodOut.getRpC9LogDesc4());
//  MOVE CT-C9-LOG-TYPE-4 TO RP-C9-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          methodOut.setRpC9DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(methodOut.getCtC9LogType4()).toCharArray()));
          // MOVE RP-C9-DETAIL TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC9Detail().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
//  MOVE ' 5' TO RP-C9-DET-LOG-TYPE
//  LITERAL_B_5 = ' 5'
          methodOut.setRpC9DetLogType(CONSTANTS.LITERAL_B_5);
//  MOVE RP-C9-LOG-DESC-5 TO RP-C9-DET-LOG-DESC
          methodOut.setRpC9DetLogDesc(methodOut.getRpC9LogDesc5());
//  MOVE CT-C9-LOG-TYPE-5 TO RP-C9-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          methodOut.setRpC9DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(methodOut.getCtC9LogType5()).toCharArray()));
          // MOVE RP-C9-DETAIL TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC9Detail().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
//  MOVE ' 6' TO RP-C9-DET-LOG-TYPE
//  LITERAL_B_6 = ' 6'
          methodOut.setRpC9DetLogType(CONSTANTS.LITERAL_B_6);
//  MOVE RP-C9-LOG-DESC-6 TO RP-C9-DET-LOG-DESC
          methodOut.setRpC9DetLogDesc(methodOut.getRpC9LogDesc6());
//  MOVE CT-C9-LOG-TYPE-6 TO RP-C9-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          methodOut.setRpC9DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(methodOut.getCtC9LogType6()).toCharArray()));
          // MOVE RP-C9-DETAIL TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC9Detail().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
//  MOVE ' 7' TO RP-C9-DET-LOG-TYPE
//  LITERAL_B_7 = ' 7'
          methodOut.setRpC9DetLogType(CONSTANTS.LITERAL_B_7);
//  MOVE RP-C9-LOG-DESC-7 TO RP-C9-DET-LOG-DESC
          methodOut.setRpC9DetLogDesc(methodOut.getRpC9LogDesc7());
//  MOVE CT-C9-LOG-TYPE-7 TO RP-C9-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          methodOut.setRpC9DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(methodOut.getCtC9LogType7()).toCharArray()));
          // MOVE RP-C9-DETAIL TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC9Detail().toCharArray());
      
      return methodOut;
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
      @Override
      public FormatX92ActivityRptSplit3OutCtx formatX92ActivityRptSplit3(FormatX92ActivityRptSplit3InCtx methodIn) throws Exception {
Sf320010Ctx programCtx = methodIn.getSf320010Ctx();
FormatX92ActivityRptSplit3OutCtx methodOut = methodIn.getFormatX92ActivityRptSplit3OutCtx();
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
//  MOVE ' 8' TO RP-C9-DET-LOG-TYPE
//  LITERAL_B_8 = ' 8'
          methodOut.setRpC9DetLogType(CONSTANTS.LITERAL_B_8);
//  MOVE RP-C9-LOG-DESC-8 TO RP-C9-DET-LOG-DESC
          methodOut.setRpC9DetLogDesc(methodOut.getRpC9LogDesc8());
//  MOVE CT-C9-LOG-TYPE-8 TO RP-C9-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          methodOut.setRpC9DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(methodOut.getCtC9LogType8()).toCharArray()));
          // MOVE RP-C9-DETAIL TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC9Detail().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
//  MOVE ' 9' TO RP-C9-DET-LOG-TYPE
//  LITERAL_B_9 = ' 9'
          methodOut.setRpC9DetLogType(CONSTANTS.LITERAL_B_9);
//  MOVE RP-C9-LOG-DESC-9 TO RP-C9-DET-LOG-DESC
          methodOut.setRpC9DetLogDesc(methodOut.getRpC9LogDesc9());
//  MOVE CT-C9-LOG-TYPE-9 TO RP-C9-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          methodOut.setRpC9DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(methodOut.getCtC9LogType9()).toCharArray()));
          // MOVE RP-C9-DETAIL TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC9Detail().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
          // MOVE '10' TO RP-C9-DET-LOG-TYPE
          //  LITERAL_10 = '10'
          methodOut.setRpC9DetLogType(CONSTANTS.LITERAL_10);
//  MOVE RP-C9-LOG-DESC-10 TO RP-C9-DET-LOG-DESC
          methodOut.setRpC9DetLogDesc(methodOut.getRpC9LogDesc10());
//  MOVE CT-C9-LOG-TYPE-10 TO RP-C9-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          methodOut.setRpC9DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(methodOut.getCtC9LogType10()).toCharArray()));
          // MOVE RP-C9-DETAIL TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC9Detail().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
          // MOVE '11' TO RP-C9-DET-LOG-TYPE
          //  LITERAL_11 = '11'
          methodOut.setRpC9DetLogType(CONSTANTS.LITERAL_11);
//  MOVE RP-C9-LOG-DESC-11 TO RP-C9-DET-LOG-DESC
          methodOut.setRpC9DetLogDesc(methodOut.getRpC9LogDesc11());
//  MOVE CT-C9-LOG-TYPE-11 TO RP-C9-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          methodOut.setRpC9DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(methodOut.getCtC9LogType11()).toCharArray()));
          // MOVE RP-C9-DETAIL TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC9Detail().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
          // MOVE '12' TO RP-C9-DET-LOG-TYPE
          //  LITERAL_12 = '12'
          methodOut.setRpC9DetLogType(CONSTANTS.LITERAL_12);
//  MOVE RP-C9-LOG-DESC-12 TO RP-C9-DET-LOG-DESC
          methodOut.setRpC9DetLogDesc(methodOut.getRpC9LogDesc12());
//  MOVE CT-C9-LOG-TYPE-12 TO RP-C9-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          methodOut.setRpC9DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(methodOut.getCtC9LogType12()).toCharArray()));
          // MOVE RP-C9-DETAIL TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC9Detail().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
          // MOVE '13' TO RP-C9-DET-LOG-TYPE
          //  LITERAL_13 = '13'
          methodOut.setRpC9DetLogType(CONSTANTS.LITERAL_13);
//  MOVE RP-C9-LOG-DESC-13 TO RP-C9-DET-LOG-DESC
          methodOut.setRpC9DetLogDesc(methodOut.getRpC9LogDesc13());
//  MOVE CT-C9-LOG-TYPE-13 TO RP-C9-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          methodOut.setRpC9DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(methodOut.getCtC9LogType13()).toCharArray()));
          // MOVE RP-C9-DETAIL TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC9Detail().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
          // MOVE '14' TO RP-C9-DET-LOG-TYPE
          //  LITERAL_14 = '14'
          methodOut.setRpC9DetLogType(CONSTANTS.LITERAL_14);
//  MOVE RP-C9-LOG-DESC-14 TO RP-C9-DET-LOG-DESC
          methodOut.setRpC9DetLogDesc(methodOut.getRpC9LogDesc14());
//  MOVE CT-C9-LOG-TYPE-14 TO RP-C9-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          methodOut.setRpC9DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(methodOut.getCtC9LogType14()).toCharArray()));
          // MOVE RP-C9-DETAIL TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC9Detail().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
          // MOVE '15' TO RP-C9-DET-LOG-TYPE
          //  LITERAL_15 = '15'
          methodOut.setRpC9DetLogType(CONSTANTS.LITERAL_15);
//  MOVE RP-C9-LOG-DESC-15 TO RP-C9-DET-LOG-DESC
          methodOut.setRpC9DetLogDesc(methodOut.getRpC9LogDesc15());
//  MOVE CT-C9-LOG-TYPE-15 TO RP-C9-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          methodOut.setRpC9DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(methodOut.getCtC9LogType15()).toCharArray()));
          // MOVE RP-C9-DETAIL TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC9Detail().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
          // MOVE '16' TO RP-C9-DET-LOG-TYPE
          //  LITERAL_16 = '16'
          methodOut.setRpC9DetLogType(CONSTANTS.LITERAL_16);
//  MOVE RP-C9-LOG-DESC-16 TO RP-C9-DET-LOG-DESC
          methodOut.setRpC9DetLogDesc(methodOut.getRpC9LogDesc16());
//  MOVE CT-C9-LOG-TYPE-16 TO RP-C9-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          methodOut.setRpC9DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(methodOut.getCtC9LogType16()).toCharArray()));
          // MOVE RP-C9-DETAIL TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC9Detail().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
          // MOVE '17' TO RP-C9-DET-LOG-TYPE
          //  LITERAL_17 = '17'
          methodOut.setRpC9DetLogType(CONSTANTS.LITERAL_17);
//  MOVE RP-C9-LOG-DESC-17 TO RP-C9-DET-LOG-DESC
          methodOut.setRpC9DetLogDesc(methodOut.getRpC9LogDesc17());
//  MOVE CT-C9-LOG-TYPE-17 TO RP-C9-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          methodOut.setRpC9DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(methodOut.getCtC9LogType17()).toCharArray()));
          // MOVE RP-C9-DETAIL TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC9Detail().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
      
      return methodOut;
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
      @Override
      public FormatX92ActivityRptSplit4OutCtx formatX92ActivityRptSplit4(FormatX92ActivityRptSplit4InCtx methodIn) throws Exception {
Sf320010Ctx programCtx = methodIn.getSf320010Ctx();
FormatX92ActivityRptSplit4OutCtx methodOut = methodIn.getFormatX92ActivityRptSplit4OutCtx();
          // MOVE '18' TO RP-C9-DET-LOG-TYPE
          //  LITERAL_18 = '18'
          methodOut.setRpC9DetLogType(CONSTANTS.LITERAL_18);
//  MOVE RP-C9-LOG-DESC-18 TO RP-C9-DET-LOG-DESC
          methodOut.setRpC9DetLogDesc(methodOut.getRpC9LogDesc18());
//  MOVE CT-C9-LOG-TYPE-18 TO RP-C9-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          methodOut.setRpC9DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(methodOut.getCtC9LogType18()).toCharArray()));
          // MOVE RP-C9-DETAIL TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC9Detail().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
          // MOVE RP-HEADING-1 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpHeading1().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
//  ADD 1 TO CT-RPT-C9-PAGE-NO
          methodOut.setCtRptC9PageNo(methodOut.getCtRptC9PageNo()+1);
//  MOVE RP-C9-HEADING-2 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(pad(133,methodOut.getRpC9Heading2(),SPACE_CHAR,RIGHT_PAD));
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
//  MOVE CT-RPT-C9-PAGE-NO TO RP-C9-H3-PAGENUMBER
//  FORMAT_1059277505 = "ZZZ9"
          methodOut.setRpC9H3Pagenumber(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(methodOut.getCtRptC9PageNo()).toCharArray()));
          // MOVE RP-C9-HEADING-3 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC9Heading3().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
          // MOVE RP-C9-HEADING-4 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC9Heading4().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
//  MOVE RP-C9-HEADING-5 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC9Heading5());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
          // MOVE '0' TO RP-C9-DET-CC
          //  LITERAL_0 = '0'
          methodOut.setRpC9DetCc(CONSTANTS.LITERAL_0);
          // MOVE '19' TO RP-C9-DET-LOG-TYPE
          //  LITERAL_19 = '19'
          methodOut.setRpC9DetLogType(CONSTANTS.LITERAL_19);
//  MOVE RP-C9-LOG-DESC-19 TO RP-C9-DET-LOG-DESC
          methodOut.setRpC9DetLogDesc(methodOut.getRpC9LogDesc19());
//  MOVE CT-C9-LOG-TYPE-19 TO RP-C9-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          methodOut.setRpC9DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(methodOut.getCtC9LogType19()).toCharArray()));
          // MOVE RP-C9-DETAIL TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC9Detail().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
          // MOVE '20' TO RP-C9-DET-LOG-TYPE
          //  LITERAL_20 = '20'
          methodOut.setRpC9DetLogType(CONSTANTS.LITERAL_20);
//  MOVE RP-C9-LOG-DESC-20 TO RP-C9-DET-LOG-DESC
          methodOut.setRpC9DetLogDesc(methodOut.getRpC9LogDesc20());
//  MOVE CT-C9-LOG-TYPE-20 TO RP-C9-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          methodOut.setRpC9DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(methodOut.getCtC9LogType20()).toCharArray()));
          // MOVE RP-C9-DETAIL TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC9Detail().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
          // MOVE '21' TO RP-C9-DET-LOG-TYPE
          //  LITERAL_21 = '21'
          methodOut.setRpC9DetLogType(CONSTANTS.LITERAL_21);
//  MOVE RP-C9-LOG-DESC-21 TO RP-C9-DET-LOG-DESC
          methodOut.setRpC9DetLogDesc(methodOut.getRpC9LogDesc21());
//  MOVE CT-C9-LOG-TYPE-21 TO RP-C9-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          methodOut.setRpC9DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(methodOut.getCtC9LogType21()).toCharArray()));
          // MOVE RP-C9-DETAIL TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC9Detail().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
          // MOVE '22' TO RP-C9-DET-LOG-TYPE
          //  LITERAL_22 = '22'
          methodOut.setRpC9DetLogType(CONSTANTS.LITERAL_22);
//  MOVE RP-C9-LOG-DESC-22 TO RP-C9-DET-LOG-DESC
          methodOut.setRpC9DetLogDesc(methodOut.getRpC9LogDesc22());
//  MOVE CT-C9-LOG-TYPE-22 TO RP-C9-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          methodOut.setRpC9DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(methodOut.getCtC9LogType22()).toCharArray()));
          // MOVE RP-C9-DETAIL TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC9Detail().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
          // MOVE '23' TO RP-C9-DET-LOG-TYPE
          //  LITERAL_23 = '23'
          methodOut.setRpC9DetLogType(CONSTANTS.LITERAL_23);
//  MOVE RP-C9-LOG-DESC-23 TO RP-C9-DET-LOG-DESC
          methodOut.setRpC9DetLogDesc(methodOut.getRpC9LogDesc23());
//  MOVE CT-C9-LOG-TYPE-23 TO RP-C9-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          methodOut.setRpC9DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(methodOut.getCtC9LogType23()).toCharArray()));
          // MOVE RP-C9-DETAIL TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC9Detail().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
          // MOVE '24' TO RP-C9-DET-LOG-TYPE
          //  LITERAL_24 = '24'
          methodOut.setRpC9DetLogType(CONSTANTS.LITERAL_24);
//  MOVE RP-C9-LOG-DESC-24 TO RP-C9-DET-LOG-DESC
          methodOut.setRpC9DetLogDesc(methodOut.getRpC9LogDesc24());
//  MOVE CT-C9-LOG-TYPE-24 TO RP-C9-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          methodOut.setRpC9DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(methodOut.getCtC9LogType24()).toCharArray()));
          // MOVE RP-C9-DETAIL TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC9Detail().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
          // MOVE '25' TO RP-C9-DET-LOG-TYPE
          //  LITERAL_25 = '25'
          methodOut.setRpC9DetLogType(CONSTANTS.LITERAL_25);
//  MOVE RP-C9-LOG-DESC-25 TO RP-C9-DET-LOG-DESC
          methodOut.setRpC9DetLogDesc(methodOut.getRpC9LogDesc25());
//  MOVE CT-C9-LOG-TYPE-25 TO RP-C9-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          methodOut.setRpC9DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(methodOut.getCtC9LogType25()).toCharArray()));
      
      return methodOut;
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
      @Override
      public FormatX92ActivityRptSplit5OutCtx formatX92ActivityRptSplit5(FormatX92ActivityRptSplit5InCtx methodIn) throws Exception {
Sf320010Ctx programCtx = methodIn.getSf320010Ctx();
FormatX92ActivityRptSplit5OutCtx methodOut = methodIn.getFormatX92ActivityRptSplit5OutCtx();
          // MOVE RP-C9-DETAIL TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC9Detail().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
          // MOVE '26' TO RP-C9-DET-LOG-TYPE
          //  LITERAL_26 = '26'
          methodOut.setRpC9DetLogType(CONSTANTS.LITERAL_26);
//  MOVE RP-C9-LOG-DESC-26 TO RP-C9-DET-LOG-DESC
          methodOut.setRpC9DetLogDesc(methodOut.getRpC9LogDesc26());
//  MOVE CT-C9-LOG-TYPE-26 TO RP-C9-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          methodOut.setRpC9DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(methodOut.getCtC9LogType26()).toCharArray()));
          // MOVE RP-C9-DETAIL TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC9Detail().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
//  MOVE '--' TO RP-C9-DET-LOG-TYPE
//  LITERAL_MN2_ = '--'
          methodOut.setRpC9DetLogType(CONSTANTS.LITERAL_MN2_);
//  MOVE RP-UNDEF-LOG-DESC TO RP-C9-DET-LOG-DESC
          methodOut.setRpC9DetLogDesc(methodOut.getRpUndefLogDesc());
//  MOVE CT-C9-UNDEF-LOG-TYPE TO RP-C9-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          methodOut.setRpC9DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(methodOut.getCtC9UndefLogType()).toCharArray()));
          // MOVE RP-C9-DETAIL TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC9Detail().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
//  MOVE ZEROS TO CT-C9-LOG-TYPE-1 CT-C9-LOG-TYPE-2 CT-C9-LOG-TYPE-3 CT-C9-LOG-TYPE-4 CT-C9-LOG-TYPE-5 CT-C9-LOG-TYPE-6 CT-C9-LOG-TYPE-7 CT-C9-LOG-TYPE-8 CT-C9-LOG-TYPE-9 CT-C9-LOG-TYPE-10 CT-C9-LOG-TYPE-11 CT-C9-LOG-TYPE-12 CT-C9-LOG-TYPE-13 CT-C9-LOG-TYPE-14 CT-C9-LOG-TYPE-15 CT-C9-LOG-TYPE-16 CT-C9-LOG-TYPE-17 CT-C9-LOG-TYPE-18 CT-C9-LOG-TYPE-19 CT-C9-LOG-TYPE-20 CT-C9-LOG-TYPE-21 CT-C9-LOG-TYPE-22 CT-C9-LOG-TYPE-23 CT-C9-LOG-TYPE-24 CT-C9-LOG-TYPE-25 CT-C9-LOG-TYPE-26 CT-C9-UNDEF-LOG-TYPE
          methodOut.setCtC9LogType1(0);
          methodOut.setCtC9LogType2(0);
          methodOut.setCtC9LogType3(0);
          methodOut.setCtC9LogType4(0);
          methodOut.setCtC9LogType5(0);
          methodOut.setCtC9LogType6(0);
          methodOut.setCtC9LogType7(0);
          methodOut.setCtC9LogType8(0);
          methodOut.setCtC9LogType9(0);
          methodOut.setCtC9LogType10(0);
          methodOut.setCtC9LogType11(0);
          methodOut.setCtC9LogType12(0);
          methodOut.setCtC9LogType13(0);
          methodOut.setCtC9LogType14(0);
          methodOut.setCtC9LogType15(0);
          methodOut.setCtC9LogType16(0);
          methodOut.setCtC9LogType17(0);
          methodOut.setCtC9LogType18(0);
          methodOut.setCtC9LogType19(0);
          methodOut.setCtC9LogType20(0);
          methodOut.setCtC9LogType21(0);
          methodOut.setCtC9LogType22(0);
          methodOut.setCtC9LogType23(0);
          methodOut.setCtC9LogType24(0);
          methodOut.setCtC9LogType25(0);
          methodOut.setCtC9LogType26(0);
          methodOut.setCtC9UndefLogType(0);
      
      return methodOut;
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
      @Override
      public FormatRemConsRptOutCtx formatRemConsRpt(FormatRemConsRptInCtx methodIn) throws Exception {
Sf320010Ctx programCtx = methodIn.getSf320010Ctx();
FormatRemConsRptOutCtx methodOut = methodIn.getFormatRemConsRptOutCtx();
//  IF SF503-RC-RECORD-TYPE = '1' OR '2'
//  LITERAL_2 = '2'
          if (compareChars(methodOut.getSf503RcRecordType(), CONSTANTS.LITERAL_1) == 0 || compareChars(methodOut.getSf503RcRecordType(), CONSTANTS.LITERAL_2) == 0) { 
//  PERFORM 2020-CHECK-OPER-MSG-AREA
              checkOperMsgArea(programCtx.getCheckOperMsgAreaInCtx());/*2020-CHECK-OPER-MSG-AREA*/
          }
//  ELSE
          else { 
//  IF SF503-RC-RECORD-TYPE = '8'
//  LITERAL_8 = '8'
              if (compareChars(methodOut.getSf503RcRecordType(), CONSTANTS.LITERAL_8) == 0) { 
//  ADD 1 TO CT-C8-LOG-TYPE-ALERT
                  methodOut.setCtC8LogTypeAlert(methodOut.getCtC8LogTypeAlert()+(long)1);
//  MOVE '********' TO RP-C8-H6-ALERT
//  LITERAL_STR8_ = '********'
                  methodOut.setRpC8H6Alert(CONSTANTS.LITERAL_STR8_);
//  MOVE '********' TO RP-C8-DET-1-ALERT
//  LITERAL_STR8_ = '********'
                  methodOut.setRpC8Det1Alert(CONSTANTS.LITERAL_STR8_);
              }
//  ELSE
              else { 
//  MOVE SPACES TO RP-C8-H6-ALERT
                  methodOut.setRpC8H6Alert(CONSTANTS.SPACE_8);
//  MOVE SPACES TO RP-C8-DET-1-ALERT
                  methodOut.setRpC8Det1Alert(CONSTANTS.SPACE_8);
              }
          }
//  IF SF503-RC-RECORD-TYPE = '1'
//  LITERAL_1 = '1'
          if (compareChars(methodOut.getSf503RcRecordType(), CONSTANTS.LITERAL_1) == 0) { 
//  ADD 1 TO CT-C8-LOG-TYPE-4
              methodOut.setCtC8LogType4(methodOut.getCtC8LogType4()+(long)1);
//  MOVE RP-C8-LOG-DESC-1 TO RP-C8-DET-1-LOG-DESC
              methodOut.setRpC8Det1LogDesc(methodOut.getRpC8LogDesc1());
          }
//  ELSE
          else { 
//  IF SF503-RC-RECORD-TYPE = '2'
//  LITERAL_2 = '2'
              if (compareChars(methodOut.getSf503RcRecordType(), CONSTANTS.LITERAL_2) == 0) { 
//  ADD 1 TO CT-C8-LOG-TYPE-2
                  methodOut.setCtC8LogType2(methodOut.getCtC8LogType2()+(long)1);
//  MOVE RP-C8-LOG-DESC-2 TO RP-C8-DET-1-LOG-DESC
                  methodOut.setRpC8Det1LogDesc(methodOut.getRpC8LogDesc2());
              }
//  ELSE
              else { 
//  IF SF503-RC-RECORD-TYPE = '3'
//  LITERAL_3 = '3'
                  if (compareChars(methodOut.getSf503RcRecordType(), CONSTANTS.LITERAL_3) == 0) { 
//  ADD 1 TO CT-C8-LOG-TYPE-3
                      methodOut.setCtC8LogType3(methodOut.getCtC8LogType3()+(long)1);
//  MOVE RP-C8-LOG-DESC-3 TO RP-C8-DET-1-LOG-DESC
                      methodOut.setRpC8Det1LogDesc(methodOut.getRpC8LogDesc3());
                  }
//  ELSE
                  else { 
//  IF SF503-RC-RECORD-TYPE = '4'
//  LITERAL_4 = '4'
                      if (compareChars(methodOut.getSf503RcRecordType(), CONSTANTS.LITERAL_4) == 0) { 
//  ADD 1 TO CT-C8-LOG-TYPE-4
                          methodOut.setCtC8LogType4(methodOut.getCtC8LogType4()+(long)1);
//  MOVE RP-C8-LOG-DESC-4 TO RP-C8-DET-1-LOG-DESC
                          methodOut.setRpC8Det1LogDesc(methodOut.getRpC8LogDesc4());
                      }
//  ELSE
                      else { 
//  IF SF503-RC-RECORD-TYPE = '5'
//  LITERAL_5 = '5'
                          if (compareChars(methodOut.getSf503RcRecordType(), CONSTANTS.LITERAL_5) == 0) { 
//  ADD 1 TO CT-C8-LOG-TYPE-5
                              methodOut.setCtC8LogType5(methodOut.getCtC8LogType5()+(long)1);
//  MOVE RP-C8-LOG-DESC-5 TO RP-C8-DET-1-LOG-DESC
                              methodOut.setRpC8Det1LogDesc(methodOut.getRpC8LogDesc5());
                          }
//  ELSE
                          else { 
//  IF SF503-RC-RECORD-TYPE = '6'
//  LITERAL_6 = '6'
                              if (compareChars(methodOut.getSf503RcRecordType(), CONSTANTS.LITERAL_6) == 0) { 
//  ADD 1 TO CT-C8-LOG-TYPE-6
                                  methodOut.setCtC8LogType6(methodOut.getCtC8LogType6()+(long)1);
//  MOVE RP-C8-LOG-DESC-6 TO RP-C8-DET-1-LOG-DESC
                                  methodOut.setRpC8Det1LogDesc(methodOut.getRpC8LogDesc6());
                              }
//  ELSE
                              else { 
//  IF SF503-RC-RECORD-TYPE = '7'
//  LITERAL_7 = '7'
                                  if (compareChars(methodOut.getSf503RcRecordType(), CONSTANTS.LITERAL_7) == 0) { 
//  ADD 1 TO CT-C8-LOG-TYPE-7
                                      methodOut.setCtC8LogType7(methodOut.getCtC8LogType7()+(long)1);
//  MOVE RP-C8-LOG-DESC-7 TO RP-C8-DET-1-LOG-DESC
                                      methodOut.setRpC8Det1LogDesc(methodOut.getRpC8LogDesc7());
                                  }
//  ELSE
                                  else { 
//  IF SF503-RC-RECORD-TYPE = '8'
//  LITERAL_8 = '8'
                                      if (compareChars(methodOut.getSf503RcRecordType(), CONSTANTS.LITERAL_8) == 0) { 
//  ADD 1 TO CT-C8-LOG-TYPE-8
                                          methodOut.setCtC8LogType8(methodOut.getCtC8LogType8()+(long)1);
//  MOVE RP-C8-LOG-DESC-8 TO RP-C8-DET-1-LOG-DESC
                                          methodOut.setRpC8Det1LogDesc(methodOut.getRpC8LogDesc8());
                                      }
//  ELSE
                                      else { 
//  ADD 1 TO CT-C8-UNDEF-LOG-TYPE
                                          methodOut.setCtC8UndefLogType(methodOut.getCtC8UndefLogType()+(long)1);
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
          methodOut.setRpReportCode(CONSTANTS.LITERAL_H);
          // MOVE '0' TO RP-C8-DET-1-CC
          //  LITERAL_0 = '0'
          methodOut.setRpC8Det1Cc(CONSTANTS.LITERAL_0);
//  MOVE SF503-RC-TIME-HH TO WA-TIME-HH-9
          methodOut.setWaTimeHh9(methodOut.getSf503RcTimeHh());
//  MOVE SF503-RC-TIME-MM TO WA-TIME-MM-9
          methodOut.setWaTimeMm9(methodOut.getSf503RcTimeMm());
//  MOVE SF503-RC-TIME-SS TO WA-TIME-SS-9
          methodOut.setWaTimeSs9(methodOut.getSf503RcTimeSs());
//  MOVE WA-TIME-HH-9 TO WA-TIME-HOURS 800-REC-TIME-HH
          methodOut.setWaTimeHours(String.valueOf(methodOut.getWaTimeHh9String()).toCharArray());
          methodOut.setRecTimeHh800(String.valueOf(methodOut.getWaTimeHh9String()).toCharArray());
//  MOVE WA-TIME-MM-9 TO WA-TIME-MINUTES 800-REC-TIME-MM
          methodOut.setWaTimeMinutes(String.valueOf(methodOut.getWaTimeMm9String()).toCharArray());
          methodOut.setRecTimeMm800(String.valueOf(methodOut.getWaTimeMm9String()).toCharArray());
//  MOVE WA-TIME-SS-9 TO WA-TIME-SECONDS 800-REC-TIME-SS
          methodOut.setWaTimeSeconds(String.valueOf(methodOut.getWaTimeSs9String()).toCharArray());
          methodOut.setRecTimeSs800(String.valueOf(methodOut.getWaTimeSs9String()).toCharArray());
          // MOVE WA-TIME TO RP-C8-DET-1-LOG-TIME
          methodOut.setRpC8Det1LogTime(methodOut.getWaTime().toCharArray());
//  MOVE SF503-RC-DATE-MM TO WA-DATE-MN-9
          methodOut.setWaDateMn9(methodOut.getSf503RcDateMm());
//  MOVE SF503-RC-DATE-DD TO WA-DATE-DY-9
          methodOut.setWaDateDy9(methodOut.getSf503RcDateDd());
//  MOVE SF503-RC-DATE-YY TO WA-DATE-YR-9
          methodOut.setWaDateYr9(methodOut.getSf503RcDateYy());
//  MOVE WA-DATE-MN-9 TO WA-DATE-MONTH 800-REC-DATE-MM
          methodOut.setWaDateMonth(String.valueOf(methodOut.getWaDateMn9String()).toCharArray());
          methodOut.setRecDateMm800(String.valueOf(methodOut.getWaDateMn9String()).toCharArray());
//  MOVE WA-DATE-DY-9 TO WA-DATE-DAY 800-REC-DATE-DD
          methodOut.setWaDateDay(String.valueOf(methodOut.getWaDateDy9String()).toCharArray());
          methodOut.setRecDateDd800(String.valueOf(methodOut.getWaDateDy9String()).toCharArray());
//  MOVE WA-DATE-YR-9 TO WA-DATE-YEAR 800-REC-DATE-YY
          methodOut.setWaDateYear(String.valueOf(methodOut.getWaDateYr9String()).toCharArray());
          methodOut.setRecDateYy800(String.valueOf(methodOut.getWaDateYr9String()).toCharArray());
//  MOVE 300-LIT-20 TO 800-REC-DATE-CC
          methodOut.setRecDateCc800(methodOut.getLit20300());
          // MOVE WA-DATE TO RP-C8-DET-1-LOG-DATE
          methodOut.setRpC8Det1LogDate(methodOut.getWaDate().toCharArray());
//  MOVE SF503-RC-RECORD-TYPE TO RP-C8-DET-1-LOG-TYPE 800-REC-TYPE
          methodOut.setRpC8Det1LogType(methodOut.getSf503RcRecordType());
          methodOut.setRecType800(methodOut.getSf503RcRecordType());
//  MOVE SF503-RC-LOCAL-MIP-ID TO RP-C8-DET-1-LOC-MIP-ID 800-LOCAL-MIP-ID
          methodOut.setRpC8Det1LocMipId(methodOut.getSf503RcLocalMipId());
          methodOut.setLocalMipId800(methodOut.getSf503RcLocalMipId());
//  MOVE SF503-RC-REMOTE-MIP-ID TO RP-C8-DET-1-REM-MIP-ID 800-REM-MIP-ID
          methodOut.setRpC8Det1RemMipId(methodOut.getSf503RcRemoteMipId());
          methodOut.setRemMipId800(methodOut.getSf503RcRemoteMipId());
//  MOVE SF503-RC-OPERATOR-ID TO RP-C8-DET-1-OPER-ID 800-OPER-ID
          methodOut.setRpC8Det1OperId(methodOut.getSf503RcOperatorId());
          methodOut.setOperId800(methodOut.getSf503RcOperatorId());
//  MOVE 300-LIT-8 TO 800-REC-CLASS
          methodOut.setRecClass800(methodOut.getLit8300());
//  MOVE SF503-RC-MESSAGE-AREA TO 800-MESSAGE
          methodOut.setMessage800(methodOut.getSf503RcMessageArea());
//  PERFORM 2300-WRITE-INFO-SEC-RECORD
          writeInfoSecRecord(programCtx.getWriteInfoSecRecordInCtx());/*2300-WRITE-INFO-SEC-RECORD*/
//  IF SF503-RC-REMOTE-MIP-ID = PREV-RC-REMOTE-MIP-ID
//  ELSE
          if (		compareChars(methodOut.getSf503RcRemoteMipId(),methodOut.getPrevRcRemoteMipId()) != 0 ) { 
//  PERFORM 2010-FORMAT-REM-CONS-RPT-HDR
              formatRemConsRptHdr(programCtx.getFormatRemConsRptHdrInCtx());/*2010-FORMAT-REM-CONS-RPT-HDR*/
              // MOVE SF503-RC-REMOTE-MIP-ID TO PREV-RC-REMOTE-MIP-ID
              methodOut.setPrevRcRemoteMipId(methodOut.getSf503RcRemoteMipId());
          }
//  IF CT-RPT-RC-LINE-NO GREATER THAN 56
          if (	( methodOut.getCtRptRcLineNo() > 56 )) { 
//  PERFORM 2010-FORMAT-REM-CONS-RPT-HDR
              formatRemConsRptHdr(programCtx.getFormatRemConsRptHdrInCtx());/*2010-FORMAT-REM-CONS-RPT-HDR*/
          }
//  ELSE
          // MOVE RP-C8-DETAIL-1 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC8Detail1().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
//  MOVE SF503-RC-MESSAGE-AREA TO RP-C8-H6-MSG-AREA
          methodOut.setRpC8H6MsgArea(methodOut.getSf503RcMessageArea());
          // MOVE RP-C8-HEADING-6 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC8Heading6().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
//  ADD 3 TO CT-RPT-RC-LINE-NO
          methodOut.setCtRptRcLineNo(methodOut.getCtRptRcLineNo()+3);
//  ADD 1 TO CT-LOG-REM-CONS
          methodOut.setCtLogRemCons(methodOut.getCtLogRemCons()+(long)1);
//  RETURN SORT-WORK-FILE RECORD INTO GENERAL-SORT-AREA
                if(useSortFileStrategy()) {
                  sortWorkFileInternOut.read();
                  if (!sortWorkFileInternOut.hasEnded()) {
                  	methodIn.getGeneralSortArea().setString(sortWorkFileInternOut.getRecord());
                  }    
              } else {
          setRecIndex(getRecIndex()+1);
          if (getRecIndex() < sortRecKeys.size() ) { 
             if (isUsingSortInFile()) methodIn.getGeneralSortArea().setString(convertEbcdicBytes2Char(getReturnRecord(getRecIndex())));
             else methodIn.getGeneralSortArea().setString(getReturnRecord(getRecIndex())); 
          }
          }
//  AT END
              if (isSortRecordsEnded()) { 
//  MOVE HIGH-VALUES TO SF503-SORT-MIP-ID
                  methodOut.setSf503SortMipId(CONSTANTS.HIGH_VALUE_1986603238);
                }
//  IF SF503-SORT-MIP-ID NOT EQUAL HIGH-VALUES
          if (!( isHighValue(methodOut.getSf503SortMipId()) ) ) { 
//  MOVE GENERAL-SORT-ID TO SF503-SORT-MIP-ID
              methodOut.setSf503SortMipId(methodOut.getGeneralSortId());
//  MOVE GENERAL-SORT-DATE TO SF503-SORT-DATE
              methodOut.setSf503SortDate(methodOut.getGeneralSortDate());
//  MOVE GENERAL-SORT-TIME TO SF503-SORT-TIME
              methodOut.setSf503SortTime(methodOut.getGeneralSortTime());
//  MOVE GENERAL-SORT-CLASS TO SF503-LOG-RECORD ( 300-NUM-ONE : 300-NUM-ONE )
              methodOut.getSf50301().replace(methodIn.getGeneralSortArea()/*parent*/,17/*fromOffset - (sf503LogRecord) */,1/*fromLen*/,15+methodIn.getNumOne300() - 1/*toOffset - (generalSortClass) */,methodIn.getNumOne300()/*toLen*/);
//  MOVE GENERAL-SORT-REST TO SF503-LOG-RECORD ( 300-NUM-TWO : )
              methodOut.getSf50301().replace(methodIn.getGeneralSortArea()/*parent*/,18/*fromOffset - (sf503LogRecord) */,8176/*fromLen*/,15+methodIn.getNumTwo300() - 1/*toOffset - (generalSortRest) */,32737/*toLen*/);
          }
      
      return methodOut;
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
      @Override
      public FormatRemConsRptHdrOutCtx formatRemConsRptHdr(FormatRemConsRptHdrInCtx methodIn) throws Exception {
Sf320010Ctx programCtx = methodIn.getSf320010Ctx();
FormatRemConsRptHdrOutCtx methodOut = methodIn.getFormatRemConsRptHdrOutCtx();
//  MOVE 'H' TO RP-REPORT-CODE
//  LITERAL_H = 'H'
          methodOut.setRpReportCode(CONSTANTS.LITERAL_H);
//  MOVE 'HH' TO RP-H1-RPT-CODE
//  LITERAL_HH = 'HH'
          methodOut.setRpH1RptCode(CONSTANTS.LITERAL_HH);
          // MOVE RP-HEADING-1 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpHeading1().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
//  MOVE RP-C8-HEADING-2 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(pad(133,methodOut.getRpC8Heading2(),SPACE_CHAR,RIGHT_PAD));
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
//  ADD 1 TO CT-RPT-RC-PAGE-NO
          methodOut.setCtRptRcPageNo(methodOut.getCtRptRcPageNo()+1);
//  MOVE CT-RPT-RC-PAGE-NO TO RP-C8-H3-PAGENUMBER
//  FORMAT_1059277505 = "ZZZ9"
          methodOut.setRpC8H3Pagenumber(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(methodOut.getCtRptRcPageNo()).toCharArray()));
          // MOVE RP-C8-HEADING-3 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC8Heading3().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
//  MOVE RP-C8-HEADING-4 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(pad(133,methodOut.getRpC8Heading4(),SPACE_CHAR,RIGHT_PAD));
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
//  MOVE RP-C8-HEADING-5 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(pad(133,methodOut.getRpC8Heading5(),SPACE_CHAR,RIGHT_PAD));
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
//  MOVE 7 TO CT-RPT-RC-LINE-NO
//  LITERAL_7 = 7
          methodOut.setCtRptRcLineNo(7);
      
      return methodOut;
      }
      /**
      * formatRemConsTotals 
      *   This method is derived from 
  *   COBOL Paragraph - 2200-FORMAT-REM-CONS-TOTALS COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void formatRemConsTotals(Sf320010Ctx programCtx) throws Exception {
//  PERFORM 2200-FORMAT-REM-CONS-TOTALS-SPLIT6
          formatRemConsTotalsSplit6(programCtx.getFormatRemConsTotalsSplit6InCtx());/*2200-FORMAT-REM-CONS-TOTALS-SPLIT6*/
//  PERFORM 2200-FORMAT-REM-CONS-TOTALS-SPLIT7
          formatRemConsTotalsSplit7(programCtx.getFormatRemConsTotalsSplit7InCtx());/*2200-FORMAT-REM-CONS-TOTALS-SPLIT7*/
      
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
      @Override
      public FormatRemConsTotalsSplit6OutCtx formatRemConsTotalsSplit6(FormatRemConsTotalsSplit6InCtx methodIn) throws Exception {
Sf320010Ctx programCtx = methodIn.getSf320010Ctx();
FormatRemConsTotalsSplit6OutCtx methodOut = methodIn.getFormatRemConsTotalsSplit6OutCtx();
//  MOVE 'H' TO RP-REPORT-CODE
//  LITERAL_H = 'H'
          methodOut.setRpReportCode(CONSTANTS.LITERAL_H);
//  MOVE 'HH' TO RP-H1-RPT-CODE
//  LITERAL_HH = 'HH'
          methodOut.setRpH1RptCode(CONSTANTS.LITERAL_HH);
          // MOVE RP-HEADING-1 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpHeading1().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
//  MOVE RP-C8-HEADING-2 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(pad(133,methodOut.getRpC8Heading2(),SPACE_CHAR,RIGHT_PAD));
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
//  ADD 1 TO CT-RPT-RC-PAGE-NO
          methodOut.setCtRptRcPageNo(methodOut.getCtRptRcPageNo()+1);
//  MOVE CT-RPT-RC-PAGE-NO TO RP-C8-H3-PAGENUMBER
//  FORMAT_1059277505 = "ZZZ9"
          methodOut.setRpC8H3Pagenumber(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(methodOut.getCtRptRcPageNo()).toCharArray()));
          // MOVE RP-C8-HEADING-3 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC8Heading3().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
//  MOVE RP-C7-HEADING-5 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC7Heading5());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
          // MOVE '0' TO RP-C7-DET-CC
          //  LITERAL_0 = '0'
          methodOut.setRpC7DetCc(CONSTANTS.LITERAL_0);
          // MOVE '1' TO RP-C7-DET-LOG-TYPE
          //  LITERAL_1 = '1'
          methodOut.setRpC7DetLogType(CONSTANTS.LITERAL_1);
//  MOVE RP-C8-LOG-DESC-1 TO RP-C7-DET-LOG-DESC
          methodOut.setRpC7DetLogDesc(methodOut.getRpC8LogDesc1());
//  MOVE CT-C8-LOG-TYPE-1 TO RP-C7-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          methodOut.setRpC7DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(methodOut.getCtC8LogType1()).toCharArray()));
          // MOVE RP-C7-DETAIL TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC7Detail().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
          // MOVE '2' TO RP-C7-DET-LOG-TYPE
          //  LITERAL_2 = '2'
          methodOut.setRpC7DetLogType(CONSTANTS.LITERAL_2);
//  MOVE RP-C8-LOG-DESC-2 TO RP-C7-DET-LOG-DESC
          methodOut.setRpC7DetLogDesc(methodOut.getRpC8LogDesc2());
//  MOVE CT-C8-LOG-TYPE-2 TO RP-C7-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          methodOut.setRpC7DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(methodOut.getCtC8LogType2()).toCharArray()));
          // MOVE RP-C7-DETAIL TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC7Detail().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
          // MOVE '3' TO RP-C7-DET-LOG-TYPE
          //  LITERAL_3 = '3'
          methodOut.setRpC7DetLogType(CONSTANTS.LITERAL_3);
//  MOVE RP-C8-LOG-DESC-3 TO RP-C7-DET-LOG-DESC
          methodOut.setRpC7DetLogDesc(methodOut.getRpC8LogDesc3());
//  MOVE CT-C8-LOG-TYPE-3 TO RP-C7-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          methodOut.setRpC7DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(methodOut.getCtC8LogType3()).toCharArray()));
          // MOVE RP-C7-DETAIL TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC7Detail().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
          // MOVE '4' TO RP-C7-DET-LOG-TYPE
          //  LITERAL_4 = '4'
          methodOut.setRpC7DetLogType(CONSTANTS.LITERAL_4);
//  MOVE RP-C8-LOG-DESC-4 TO RP-C7-DET-LOG-DESC
          methodOut.setRpC7DetLogDesc(methodOut.getRpC8LogDesc4());
//  MOVE CT-C8-LOG-TYPE-4 TO RP-C7-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          methodOut.setRpC7DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(methodOut.getCtC8LogType4()).toCharArray()));
          // MOVE RP-C7-DETAIL TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC7Detail().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
          // MOVE '5' TO RP-C7-DET-LOG-TYPE
          //  LITERAL_5 = '5'
          methodOut.setRpC7DetLogType(CONSTANTS.LITERAL_5);
//  MOVE RP-C8-LOG-DESC-5 TO RP-C7-DET-LOG-DESC
          methodOut.setRpC7DetLogDesc(methodOut.getRpC8LogDesc5());
//  MOVE CT-C8-LOG-TYPE-5 TO RP-C7-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          methodOut.setRpC7DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(methodOut.getCtC8LogType5()).toCharArray()));
          // MOVE RP-C7-DETAIL TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC7Detail().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
          // MOVE '6' TO RP-C7-DET-LOG-TYPE
          //  LITERAL_6 = '6'
          methodOut.setRpC7DetLogType(CONSTANTS.LITERAL_6);
//  MOVE RP-C8-LOG-DESC-6 TO RP-C7-DET-LOG-DESC
          methodOut.setRpC7DetLogDesc(methodOut.getRpC8LogDesc6());
//  MOVE CT-C8-LOG-TYPE-6 TO RP-C7-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          methodOut.setRpC7DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(methodOut.getCtC8LogType6()).toCharArray()));
          // MOVE RP-C7-DETAIL TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC7Detail().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
          // MOVE '7' TO RP-C7-DET-LOG-TYPE
          //  LITERAL_7 = '7'
          methodOut.setRpC7DetLogType(CONSTANTS.LITERAL_7);
//  MOVE RP-C8-LOG-DESC-7 TO RP-C7-DET-LOG-DESC
          methodOut.setRpC7DetLogDesc(methodOut.getRpC8LogDesc7());
//  MOVE CT-C8-LOG-TYPE-7 TO RP-C7-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          methodOut.setRpC7DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(methodOut.getCtC8LogType7()).toCharArray()));
          // MOVE RP-C7-DETAIL TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC7Detail().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
          // MOVE '8' TO RP-C7-DET-LOG-TYPE
          //  LITERAL_8 = '8'
          methodOut.setRpC7DetLogType(CONSTANTS.LITERAL_8);
//  MOVE RP-C8-LOG-DESC-8 TO RP-C7-DET-LOG-DESC
          methodOut.setRpC7DetLogDesc(methodOut.getRpC8LogDesc8());
//  MOVE CT-C8-LOG-TYPE-8 TO RP-C7-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          methodOut.setRpC7DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(methodOut.getCtC8LogType8()).toCharArray()));
      
      return methodOut;
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
      @Override
      public FormatRemConsTotalsSplit7OutCtx formatRemConsTotalsSplit7(FormatRemConsTotalsSplit7InCtx methodIn) throws Exception {
Sf320010Ctx programCtx = methodIn.getSf320010Ctx();
FormatRemConsTotalsSplit7OutCtx methodOut = methodIn.getFormatRemConsTotalsSplit7OutCtx();
          // MOVE RP-C7-DETAIL TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC7Detail().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
//  MOVE '-' TO RP-C7-DET-LOG-TYPE
//  LITERAL_MN_ = '-'
          methodOut.setRpC7DetLogType(CONSTANTS.LITERAL_MN_);
//  MOVE RP-UNDEF-LOG-DESC TO RP-C7-DET-LOG-DESC
          methodOut.setRpC7DetLogDesc(methodOut.getRpUndefLogDesc());
//  MOVE CT-C8-UNDEF-LOG-TYPE TO RP-C7-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          methodOut.setRpC7DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(methodOut.getCtC8UndefLogType()).toCharArray()));
          // MOVE RP-C7-DETAIL TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC7Detail().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
//  MOVE '*' TO RP-C7-DET-LOG-TYPE
//  LITERAL_STR_ = '*'
          methodOut.setRpC7DetLogType(CONSTANTS.LITERAL_STR_);
//  MOVE RP-C8-LOG-DESC-ALERT TO RP-C7-DET-LOG-DESC
          methodOut.setRpC7DetLogDesc(methodOut.getRpC8LogDescAlert());
//  MOVE CT-C8-LOG-TYPE-ALERT TO RP-C7-DET-TOTAL
//  FORMAT_2062691925 = "ZZZZZZZZ9"
          methodOut.setRpC7DetTotal(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2062691925,String.valueOf(methodOut.getCtC8LogTypeAlert()).toCharArray()));
          // MOVE RP-C7-DETAIL TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpC7Detail().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
          ;
      
      return methodOut;
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
      @Override
      public CheckOperMsgAreaOutCtx checkOperMsgArea(CheckOperMsgAreaInCtx methodIn) throws Exception {
Sf320010Ctx programCtx = methodIn.getSf320010Ctx();
CheckOperMsgAreaOutCtx methodOut = methodIn.getCheckOperMsgAreaOutCtx();
          // MOVE SPACES TO WS-SECURITY-ALERT-FLAG
          methodOut.setSecurityAlertFlag(CONSTANTS.SPACE);
//  MOVE SF503-RC-MESSAGE-AREA TO WS-OPER-MSG-AREA
          methodOut.getOperMsgArea().setString(methodOut.getSf503RcMessageArea());
//  IF SF503-RC-RECORD-TYPE = '1'
//  LITERAL_1 = '1'
          if (compareChars(methodIn.getSf503RcRecordType(), CONSTANTS.LITERAL_1) == 0) { 
//  IF ( WS-MSG-POS-2-5 = '> #$' )
//  LITERAL_1031637533 = '> #$'
              if ((compareChars(methodOut.getMsgPos25(),CONSTANTS.LITERAL_1031637533) == 0)) { 
                  // MOVE '1' TO WS-SECURITY-ALERT-FLAG
                  //  LITERAL_1 = '1'
                  methodOut.setSecurityAlertFlag(CONSTANTS.LITERAL_1);
              }
//  ELSE
          }
//  ELSE
//  IF SF503-RC-RECORD-TYPE = '2'
//  LITERAL_2 = '2'
          if (compareChars(methodIn.getSf503RcRecordType(), CONSTANTS.LITERAL_2) == 0) { 
//  IF ( ( WS-MSG-POS-2-16 = 'REMOTE STRDR #=' ) AND ( WS-MSG-POS-17 = '$' OR '+' ))
              if ((((compareChars(methodOut.getMsgPos216(),CONSTANTS.LITERAL_2098939503) == 0)) && ((compareChars(methodOut.getMsgPos17(), CONSTANTS.LITERAL_33824) == 0 || methodOut.getMsgPos17()[0] == '+')))) { 
                  // MOVE '1' TO WS-SECURITY-ALERT-FLAG
                  //  LITERAL_1 = '1'
                  methodOut.setSecurityAlertFlag(CONSTANTS.LITERAL_1);
              }
//  ELSE
              else { 
//  IF ( ( WS-MSG-POS-2-16 = 'REMOTE STRDR #+' ) OR ( WS-MSG-POS-2-16 = 'REMOTE STRDR #%' ))
//  LITERAL_REMOTE_B2_STRDRHS_PR_ = 'REMOTE STRDR #%'
                  if ((((compareChars(methodOut.getMsgPos216(),CONSTANTS.LITERAL_REMOTE_B2_STRDRHS_PL_) == 0)) || ((compareChars(methodOut.getMsgPos216(),CONSTANTS.LITERAL_REMOTE_B2_STRDRHS_PR_) == 0)))) { 
                      // MOVE '1' TO WS-SECURITY-ALERT-FLAG
                      //  LITERAL_1 = '1'
                      methodOut.setSecurityAlertFlag(CONSTANTS.LITERAL_1);
                  }
//  ELSE
                  else { 
//  IF ( ( WS-MSG-POS-2-16 = 'REMOTE STRDR #=' ) AND ( WS-MSG-POS-17-22 = 'W0C010' ))
//  LITERAL_W0C010 = 'W0C010'
                      if ((((compareChars(methodOut.getMsgPos216(),CONSTANTS.LITERAL_2098939503) == 0)) && ((		compareChars(methodOut.getMsgPos1722(),CONSTANTS.LITERAL_W0C010) == 0 )))) { 
                          // MOVE '1' TO WS-SECURITY-ALERT-FLAG
                          //  LITERAL_1 = '1'
                          methodOut.setSecurityAlertFlag(CONSTANTS.LITERAL_1);
                      }
//  ELSE
                  }
              }
          }
//  ELSE
//  IF WS-SECURITY-ALERT-FLAG = '1'
//  LITERAL_1 = '1'
          if (compareChars(methodOut.getSecurityAlertFlag(), CONSTANTS.LITERAL_1) == 0) { 
//  ADD 1 TO CT-C8-LOG-TYPE-ALERT
              methodOut.setCtC8LogTypeAlert(methodOut.getCtC8LogTypeAlert()+(long)1);
//  MOVE '********' TO RP-C8-H6-ALERT
//  LITERAL_STR8_ = '********'
              methodOut.setRpC8H6Alert(CONSTANTS.LITERAL_STR8_);
//  MOVE '********' TO RP-C8-DET-1-ALERT
//  LITERAL_STR8_ = '********'
              methodOut.setRpC8Det1Alert(CONSTANTS.LITERAL_STR8_);
          }
//  ELSE
          else { 
//  MOVE SPACES TO RP-C8-H6-ALERT
              methodOut.setRpC8H6Alert(CONSTANTS.SPACE_8);
//  MOVE SPACES TO RP-C8-DET-1-ALERT
              methodOut.setRpC8Det1Alert(CONSTANTS.SPACE_8);
          }
      
      return methodOut;
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
      @Override
      public WriteInfoSecRecordOutCtx writeInfoSecRecord(WriteInfoSecRecordInCtx methodIn) throws Exception {
Sf320010Ctx programCtx = methodIn.getSf320010Ctx();
WriteInfoSecRecordOutCtx methodOut = methodIn.getWriteInfoSecRecordOutCtx();
//  WRITE FD-INFO-SEC-FILE-OUT-RCD FROM 800-INFO-SEC-RCD
          infoSecFileOut.write(methodIn.getInfoSecRcd800().toCharArray()); 
          methodOut.getFdInfoSecFileOutRcd().setString(CONSTANTS.LOW_VALUE_1253879107);
      
      return methodOut;
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
      @Override
      public ProduceControlReportOutCtx produceControlReport(ProduceControlReportInCtx methodIn) throws Exception {
Sf320010Ctx programCtx = methodIn.getSf320010Ctx();
ProduceControlReportOutCtx methodOut = methodIn.getProduceControlReportOutCtx();
//  MOVE 'F' TO RP-REPORT-CODE
//  LITERAL_F = 'F'
          methodOut.setRpReportCode(CONSTANTS.LITERAL_F);
//  MOVE 'FF' TO RP-H1-RPT-CODE
//  LITERAL_FF = 'FF'
          methodOut.setRpH1RptCode(CONSTANTS.LITERAL_FF);
//  MOVE CT-LOG-STATS TO RP-CO-EOJ3-TOTAL-STATS
//  FORMAT_59471873 = "ZZZZZ9"
          methodOut.setRpCoEoj3TotalStats(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_59471873,String.valueOf(methodOut.getCtLogStats()).toCharArray()));
//  MOVE CT-LOG-BULK-DATA TO RP-CO-EOJ4-TOTAL-BULK
//  FORMAT_59471873 = "ZZZZZ9"
          methodOut.setRpCoEoj4TotalBulk(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_59471873,String.valueOf(methodOut.getCtLogBulkData()).toCharArray()));
//  MOVE CT-LOG-OPERATOR TO RP-CO-EOJ5-TOTAL-OPER
//  FORMAT_59471873 = "ZZZZZ9"
          methodOut.setRpCoEoj5TotalOper(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_59471873,String.valueOf(methodOut.getCtLogOperator()).toCharArray()));
//  MOVE CT-LOG-POS TO RP-CO-EOJ6-TOTAL-POS
//  FORMAT_59471873 = "ZZZZZ9"
          methodOut.setRpCoEoj6TotalPos(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_59471873,String.valueOf(methodOut.getCtLogPos()).toCharArray()));
//  MOVE CT-LOG-MIP-PROFILE TO RP-CO-EOJ7-TOTAL-MIP
//  FORMAT_59471873 = "ZZZZZ9"
          methodOut.setRpCoEoj7TotalMip(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_59471873,String.valueOf(methodOut.getCtLogMipProfile()).toCharArray()));
//  MOVE CT-LOG-TYPEII TO RP-CO-EOJ8-TOTAL-TYPEII
//  FORMAT_59471873 = "ZZZZZ9"
          methodOut.setRpCoEoj8TotalTypeii(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_59471873,String.valueOf(methodOut.getCtLogTypeii()).toCharArray()));
//  MOVE CT-LOG-REM-CONS TO RP-CO-EOJ9-TOTAL-REM
//  FORMAT_59471873 = "ZZZZZ9"
          methodOut.setRpCoEoj9TotalRem(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_59471873,String.valueOf(methodOut.getCtLogRemCons()).toCharArray()));
//  MOVE CT-LOG-X92 TO RP-CO-EOJ10-TOTAL-X92
//  FORMAT_59471873 = "ZZZZZ9"
          methodOut.setRpCoEoj10TotalX92(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_59471873,String.valueOf(methodOut.getCtLogX92()).toCharArray()));
//  MOVE CT-LOG-EDC TO RP-CO-EOJ12-TOTAL-EDC
//  FORMAT_59471873 = "ZZZZZ9"
          methodOut.setRpCoEoj12TotalEdc(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_59471873,String.valueOf(methodOut.getCtLogEdc()).toCharArray()));
//  MOVE CT-LOG-CHK TO RP-CO-EOJ13-TOTAL-CHK
//  FORMAT_59471873 = "ZZZZZ9"
          methodOut.setRpCoEoj13TotalChk(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_59471873,String.valueOf(methodOut.getCtLogChk()).toCharArray()));
//  MOVE CT-LOG-BULK-DATA32 TO RP-CO-EOJ14-TTL-BULK32
//  FORMAT_59471873 = "ZZZZZ9"
          methodOut.setRpCoEoj14TtlBulk32(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_59471873,String.valueOf(methodOut.getCtLogBulkData32()).toCharArray()));
//  MOVE CT-LOG-OTHER TO RP-CO-EOJ15-TTL-OTHER
//  FORMAT_59471873 = "ZZZZZ9"
          methodOut.setRpCoEoj15TtlOther(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_59471873,String.valueOf(methodOut.getCtLogOther()).toCharArray()));
          // MOVE RP-HEADING-1 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpHeading1().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
//  MOVE 1 TO RP-CO-H2-PAGENUMBER
//  LITERAL_1 = 1, FORMAT_1059277505 = "ZZZ9"
          methodOut.setRpCoH2Pagenumber(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,CONSTANTS.LITERAL_1));
          // MOVE RP-CO-HEADING-2 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpCoHeading2().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
          // MOVE RP-CO-EOJ3 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpCoEoj3().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
          // MOVE RP-CO-EOJ4 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpCoEoj4().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
          // MOVE RP-CO-EOJ5 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpCoEoj5().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
          // MOVE RP-CO-EOJ6 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpCoEoj6().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
          // MOVE RP-CO-EOJ7 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpCoEoj7().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
          // MOVE RP-CO-EOJ8 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpCoEoj8().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
          // MOVE RP-CO-EOJ9 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpCoEoj9().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
          // MOVE RP-CO-EOJ10 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpCoEoj10().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
          // MOVE RP-CO-EOJ12 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpCoEoj12().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
          // MOVE RP-CO-EOJ13 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpCoEoj13().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
          // MOVE RP-CO-EOJ14 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpCoEoj14().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
          // MOVE RP-CO-EOJ15 TO RP-PRINT-LINE
          methodOut.setRpPrintLine(methodOut.getRpCoEoj15().toCharArray());
//  PERFORM 8000-WRITE-REPORT-RECORD
          writeReportRecord(programCtx.getWriteReportRecordInCtx());/*8000-WRITE-REPORT-RECORD*/
          ;
      
      return methodOut;
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
      @Override
      public SetDateTimeOutCtx setDateTime(SetDateTimeInCtx methodIn) throws Exception {
Sf320010Ctx programCtx = methodIn.getSf320010Ctx();
SetDateTimeOutCtx methodOut = methodIn.getSetDateTimeOutCtx();
//  ACCEPT WA-DATE-YMD FROM DATE
          methodOut.getWaDateYmd().setString(CFUtil.getCurrentDateStr()); 
          // MOVE '211006' TO WA-DATE-YMD
          //  LITERAL_211006 = '211006'
          methodOut.getWaDateYmd().setString(CONSTANTS.LITERAL_211006);
//  MOVE WA-DATE-MM TO WA-DATE-MONTH
          methodOut.setWaDateMonth(methodOut.getWaDateMm());
//  MOVE WA-DATE-DD TO WA-DATE-DAY
          methodOut.setWaDateDay(methodOut.getWaDateDd());
//  MOVE WA-DATE-YY TO WA-DATE-YEAR
          methodOut.setWaDateYear(methodOut.getWaDateYy());
//  ACCEPT WA-TIME-HMSH FROM TIME
          methodOut.getWaTimeHmsh().setString(getCurrentTimeString()); 
          // MOVE '07462500' TO WA-TIME-HMSH
          //  LITERAL_07462500 = '07462500'
          methodOut.getWaTimeHmsh().setString(CONSTANTS.LITERAL_07462500);
//  MOVE WA-TIME-HH TO WA-TIME-HOURS
          methodOut.setWaTimeHours(methodOut.getWaTimeHh());
//  MOVE WA-TIME-MM TO WA-TIME-MINUTES
          methodOut.setWaTimeMinutes(methodOut.getWaTimeMm());
//  MOVE WA-TIME-SS TO WA-TIME-SECONDS
          methodOut.setWaTimeSeconds(methodOut.getWaTimeSs());
          // MOVE WA-DATE TO RP-H1-CURRENT-DATE 200-RP-H1-CURRENT-DATE1
          methodOut.setRpH1CurrentDate(methodOut.getWaDate().toCharArray());
          methodOut.setRpH1CurrentDate1200(methodOut.getWaDate().toCharArray());
          // MOVE WA-TIME TO RP-H1-CURTIME 200-RP-H1-CURTIME1
          methodOut.setRpH1Curtime(methodOut.getWaTime().toCharArray());
          methodOut.setRpH1Curtime1200(methodOut.getWaTime().toCharArray());
      
      return methodOut;
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
      @Override
      public WriteReportRecordOutCtx writeReportRecord(WriteReportRecordInCtx methodIn) throws Exception {
Sf320010Ctx programCtx = methodIn.getSf320010Ctx();
WriteReportRecordOutCtx methodOut = methodIn.getWriteReportRecordOutCtx();
//  WRITE FD-REPORT-FILE-OUT-RCD FROM RP-REPORT-PRINT-LINE
          reportFileOut.write(methodIn.getRpReportPrintLine().toCharArray()); 
          methodOut.getFdReportFileOutRcd().setString(CONSTANTS.LOW_VALUE_215750933);
      
      return methodOut;
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
      @Override
      public WriteEmailRecordOutCtx writeEmailRecord(WriteEmailRecordInCtx methodIn) throws Exception {
      
// ******************************************************************
// *    8 1 0 0 - W r i t e - e m a i l - r e c o r d               *
// ******************************************************************
// *    1. write the records into email file.                       *
// ******************************************************************
Sf320010Ctx programCtx = methodIn.getSf320010Ctx();
WriteEmailRecordOutCtx methodOut = methodIn.getWriteEmailRecordOutCtx();
//  WRITE SYS203-EMAIL-FILE-OUT-RCD FROM RP-REPORT-PRINT-LINE
          sys203EmailFileOut.write(methodIn.getRpReportPrintLine().toCharArray()); 
          methodOut.getSys203EmailFileOutRcd().setString(CONSTANTS.LOW_VALUE_215750933);
      
      return methodOut;
      }
  
  
  
      public void setFromMcwin(Sf320010Ctx programCtx, Object[] params) {
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
      public void setFromMcabend(Sf320010Ctx programCtx, Object[] params) {
      int len = params.length;
         if (len > 0)
         if(params[0] instanceof Field) 
   programCtx.getMciabendParms().getMciabendParm1().setString(((Field)params[0] ).toCharArray());
 else    programCtx.getMciabendParms().getMciabendParm1().setString((char[])params[0] );
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
