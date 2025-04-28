  package com.cloudframe.app.process;
  /* 
*
* this program is designed to generate it's own test data
* for unit testing internal sort with numeric key values.
*
* it will either generate the testdata output file or perform
* an internal sort, depending upon the passed parameter.
*
*/
  
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import org.springframework.web.bind.annotation.RequestParam;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.cfsort09.file.*;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.cfsort09.file.records.SortworkKeyBinaryKeys;
  import java.util.List;
  import java.util.ArrayList;
  import java.util.Comparator;
  import java.util.stream.Collectors;
  import java.util.Map;
  import java.util.HashMap;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.cfsort09.dto.*;
  import com.cloudframe.app.cfsort09.file.records.DisplayRecord;
  import com.cloudframe.app.cfsort09.dto.LParmG;
  import com.cloudframe.app.cfsort09.dto.WSortdataRecord;
  import com.cloudframe.app.cfsort09.file.records.TestdataRecord;
  import com.cloudframe.app.cfsort09.file.records.SortworkRecord;
  import com.cloudframe.app.cfsort09.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import org.springframework.beans.factory.InitializingBean;
  import org.springframework.beans.factory.DisposableBean;
  import org.springframework.beans.factory.annotation.Value;
  import com.cloudframe.app.sort.SortProperties;
  import com.cloudframe.app.sort.strategy.SortPathStrategy;
  import com.cloudframe.app.sort.strategy.decider.SortStrategyDecider;
  import com.cloudframe.app.sort.model.SortKeyObject;
  import org.springframework.context.annotation.Lazy;
  
  @Component("cfsort09")
  
  public class Cfsort09 extends CommonProcess implements InitializingBean, DisposableBean {
  
  Logger logger = LoggerFactory.getLogger(Cfsort09.class);
  
  private DisplayRecord displayRecord = new DisplayRecord() ;
  private LParmG lParmG = new LParmG() ;
  private WSortdataRecord wSortdataRecord = new WSortdataRecord() ;
  private TestdataRecord testdataRecord = new TestdataRecord() ;
  private SortworkRecord sortworkRecord = new SortworkRecord() ;
  private Work work = new Work() ;
  
  
  
  @Autowired 
  @Qualifier("cfsort09_displayFile")
  DisplayFile displayFile;
  @Autowired 
  @Qualifier("cfsort09_testdataFile")
  TestdataFile testdataFile;
  @Autowired 
  @Qualifier("cfsort09_sortworkFileInternOut")
  SortworkFileInternOut sortworkFileInternOut;
  
  @Autowired
  @Lazy
  SortStrategyDecider sortDecider;
  
  SortPathStrategy sortProcesser;
  
  @Value("${cf.sort.using.file.strategy:no}")
  private String usingSortFileStrategy;  
  
  @Value("${cf.sort.useTempFile:yes}")
  private String useTempFile;
  
  
  private static final int SORTWORKKEYBINARY_OFFSET = 34;
  private static final int SORTWORKKEYBINARY_LENGTH = 4;
  private static final int SORTWORKKEYCOMP_OFFSET = 41;
  private static final int SORTWORKKEYCOMP_LENGTH = 4;
  private static final int SORTWORKKEYCOMP4_OFFSET = 48;
  private static final int SORTWORKKEYCOMP4_LENGTH = 4;
  private static final int SORTWORKKEYCOMP5_OFFSET = 55;
  private static final int SORTWORKKEYCOMP5_LENGTH = 4;
  private static final int SORTWORKKEYCOMP3_OFFSET = 21;
  private static final int SORTWORKKEYCOMP3_LENGTH = 10;
  private static final int SORTWORKKEYZONEDEC_OFFSET = 0;
  private static final int SORTWORKKEYZONEDEC_LENGTH = 18;
  private int sortKeysCaseId = 1;
  private List<SortworkKeyBinaryKeys> sortRecKeys = new ArrayList<>();
  private Comparator<SortworkKeyBinaryKeys> sortComp = null;
  
  
  
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
  
      public int setParameter(String lParmG) throws Exception {
      		if(lParmG != null)
      		    this.lParmG.setString(com.cloudframe.app.data.Field.getParm(lParmG),new String(CONSTANTS.EBCDIC_ENCODING));
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
      		if(displayFile.hasOpened() && !displayFile.isReadOnly()) { 
      			displayFile.flush(); 
      		}
      		if(testdataFile.hasOpened() && !testdataFile.isReadOnly()) { 
      			testdataFile.flush(); 
      		}
      		if(sortworkFileInternOut.hasOpened() && !sortworkFileInternOut.isReadOnly()) { 
      			sortworkFileInternOut.flush(); 
      		}
      }
      
       return getRc(); // Exit with return code
      // end of process method
      }
      /**
      * mainline 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAINLINE COBOL Cyclomatic complexity - 12
      * Input  :  

      * - lParmSortKey                   COBOL Name: L-PARM-SORT-KEY
      *
      * Output :  

      * - displayFileStatus              COBOL Name: WS-DISPLAY-FILE-STATUS
      * - displayRecord                  COBOL Name: DISPLAY-RECORD
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      private void mainline() throws Exception {
			// Declare local variables used in the method
			char[] displayFileStatus = null;
			// End of variable declaration

      
// *
//  OPEN OUTPUT DISPLAY-FILE
          displayFile.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),displayFile.getFileName(),displayFile.getDisplayFileCharSet(),displayFile.getDisplayFileCrlfFlag());
          work.setDisplayFileStatus(displayFile.getStatusString() );
          displayFileStatus = work.getDisplayFileStatus();
//  IF NOT ( WS-DISPLAY-FILE-STATUS = '00' )
//  LITERAL_00 = '00'
          if ((		compareChars(displayFileStatus,CONSTANTS.LITERAL_00) != 0 )) { 
//  DISPLAY 'OPEN DISPLAY-FILE ERROR ' WS-DISPLAY-FILE-STATUS
              logger.info("OPEN DISPLAY-FILE ERROR {}", new String(work.getDisplayFileStatus())); 
//  GOBACK
              setNotLogged(false); // no need to log, it is a normal termination
              this.setProgramEnded(true);
              return ;
          }
  

// *
          // MOVE 'PROGRAM CFSORT09 HAS BEGUN' TO DISPLAY-RECORD
          displayRecord.setString(CONSTANTS.LITERAL_5360028);
//  WRITE DISPLAY-RECORD
          displayFile.write(displayRecord.toCharArray()); 
          displayRecord.setString(CONSTANTS.LOW_VALUE_215751956);
          work.setDisplayFileStatus(displayFile.getStatusString() );

// *
//  MOVE SPACES TO DISPLAY-RECORD
          displayRecord.setString(CONSTANTS.SPACE_133);
//  WRITE DISPLAY-RECORD
          displayFile.write(displayRecord.toCharArray()); 
          displayRecord.setString(CONSTANTS.LOW_VALUE_215751956);
          work.setDisplayFileStatus(displayFile.getStatusString() );
//  MOVE ZERO TO RETURN-CODE
          this.setRc(0);
//  PERFORM 0010-INIT THRU 0010-INIT-X
          init();/*0010-INIT*/
          if (this.isProgramEnded()) {
              return ;
          }
//  EVALUATE TRUE
          if  ( lParmG.isLParmSortBinary()  ) { 
//  SORT SORTWORK-FILE ON ASCENDING KEY SORTWORK-KEY-BINARY USING TESTDATA-FILE OUTPUT PROCEDURE IS 2000-RETURN-RECORDS
              try {
                  sortKeysCaseId = 1;
                  if(useSortFileStrategy()) {
                  	// implement code here
                       sortDecider.setInFileDetails(testdataFile.getAccessFileName(testdataFile.getFileName()),testdataFile.getRecLen(),testdataFile.isFixedBlock());
                       sortDecider.setOutFileName(sortworkFileInternOut.getAccessFileName(sortworkFileInternOut.getFileName()),sortworkFileInternOut.getRecLen());
              		 SortProperties sortProperties = new SortProperties();
              		 // SORT key information
                       sortDecider.addSortKeysInfo("SORTWORKKEYBINARY"/*name*/,SORTWORKKEYBINARY_OFFSET/*pos*/,SORTWORKKEYBINARY_LENGTH/*len*/,false/*descending*/,"BI"/*type*/,sortProperties);
              		 logger.info("Start reading SORT TEMP INPUT file Information ...");
              		 //Pre-process input file details and read sort keys information
              		 sortProcesser = sortDecider.decideSortStrategy(sortProperties);
              
              		 logger.info("Start process SORT using fetched SORT keys...");
              		 //Perform SORT based on sort keys information
              		 sortProcesser.sort();
              		 logger.info("Start process the sorted record to GIVING out file...");
              		 //Perform output file write by merging the sorted file(s)
              		 sortProcesser.merge();
              		 logger.info("SORT process using file strategy ends.");
                     sortworkFileInternOut.open("r", sortworkFileInternOut.getFileName(), sortworkFileInternOut.getSortworkFileInternOutCharSet(),sortworkFileInternOut.getSortworkFileInternOutCrlfFlag());
                  } else {
                  byte[] record = null;
                  useSortTempFile(useTempFile);
                  sortRecKeys = new ArrayList<>();
                  doSortPresets();
                  //  USING testdataFile read process begin
                  testdataFile.open("r",testdataFile.getFileName(),testdataFile.getTestdataFileCharSet(),testdataFile.getTestdataFileCrlfFlag());
                  setVBSortInFile(!testdataFile.isFixedBlock());
                  
              	record = testdataFile.readRecord();
              	while (!testdataFile.hasEnded() && record != null) {
                      addReleaseRecord(getRecordChar(record,testdataFile.getFileCharSet()),record.length);
                      record = testdataFile.readRecord();
                  }
                  testdataFile.close();
              
                  sortComp = Comparator.comparingInt(SortworkKeyBinaryKeys::getSortworkKeyBinary);
              
                  sortRecKeys = sortRecKeys.stream().sorted(sortComp).collect(Collectors.toList());
              
                  if (isWriteInTempFile()){
                         boolean isCountMatches = true;
                         int recordKeyCount = sortRecKeys.size();
                         while (isCountMatches) {
                                 isCountMatches = recordKeyCount != getWriteCounter().get();
                         }
                  }
                  if (isUsingSortInFile())
                      createRAFile(testdataFile.getFileName());
              
                  doPresetForRead();
                  }
                    returnRecords();
                   if(sortworkFileInternOut.hasOpened()) {
              	    sortworkFileInternOut.close(); 
                   }
              } catch(Exception e) {
                  logger.error("",e);
              } finally {
                  removeTempFile();
                  sortRecKeys.clear();
                  removeInternFile();
              }
          }
          else if  ( lParmG.isLParmSortComp()  ) { 
//  SORT SORTWORK-FILE ON ASCENDING KEY SORTWORK-KEY-COMP USING TESTDATA-FILE OUTPUT PROCEDURE IS 2000-RETURN-RECORDS
              try {
                  sortKeysCaseId = 2;
                  if(useSortFileStrategy()) {
                  	// implement code here
                       sortDecider.setInFileDetails(testdataFile.getAccessFileName(testdataFile.getFileName()),testdataFile.getRecLen(),testdataFile.isFixedBlock());
                       sortDecider.setOutFileName(sortworkFileInternOut.getAccessFileName(sortworkFileInternOut.getFileName()),sortworkFileInternOut.getRecLen());
              		 SortProperties sortProperties = new SortProperties();
              		 // SORT key information
                       sortDecider.addSortKeysInfo("SORTWORKKEYCOMP"/*name*/,SORTWORKKEYCOMP_OFFSET/*pos*/,SORTWORKKEYCOMP_LENGTH/*len*/,false/*descending*/,"BI"/*type*/,sortProperties);
              		 logger.info("Start reading SORT TEMP INPUT file Information ...");
              		 //Pre-process input file details and read sort keys information
              		 sortProcesser = sortDecider.decideSortStrategy(sortProperties);
              
              		 logger.info("Start process SORT using fetched SORT keys...");
              		 //Perform SORT based on sort keys information
              		 sortProcesser.sort();
              		 logger.info("Start process the sorted record to GIVING out file...");
              		 //Perform output file write by merging the sorted file(s)
              		 sortProcesser.merge();
              		 logger.info("SORT process using file strategy ends.");
                     sortworkFileInternOut.open("r", sortworkFileInternOut.getFileName(), sortworkFileInternOut.getSortworkFileInternOutCharSet(),sortworkFileInternOut.getSortworkFileInternOutCrlfFlag());
                  } else {
                  byte[] record = null;
                  useSortTempFile(useTempFile);
                  sortRecKeys = new ArrayList<>();
                  doSortPresets();
                  //  USING testdataFile read process begin
                  testdataFile.open("r",testdataFile.getFileName(),testdataFile.getTestdataFileCharSet(),testdataFile.getTestdataFileCrlfFlag());
                  setVBSortInFile(!testdataFile.isFixedBlock());
                  
              	record = testdataFile.readRecord();
              	while (!testdataFile.hasEnded() && record != null) {
                      addReleaseRecord(getRecordChar(record,testdataFile.getFileCharSet()),record.length);
                      record = testdataFile.readRecord();
                  }
                  testdataFile.close();
              
                  sortComp = Comparator.comparingInt(SortworkKeyBinaryKeys::getSortworkKeyComp);
              
                  sortRecKeys = sortRecKeys.stream().sorted(sortComp).collect(Collectors.toList());
              
                  if (isWriteInTempFile()){
                         boolean isCountMatches = true;
                         int recordKeyCount = sortRecKeys.size();
                         while (isCountMatches) {
                                 isCountMatches = recordKeyCount != getWriteCounter().get();
                         }
                  }
                  if (isUsingSortInFile())
                      createRAFile(testdataFile.getFileName());
              
                  doPresetForRead();
                  }
                    returnRecords();
                   if(sortworkFileInternOut.hasOpened()) {
              	    sortworkFileInternOut.close(); 
                   }
              } catch(Exception e) {
                  logger.error("",e);
              } finally {
                  removeTempFile();
                  sortRecKeys.clear();
                  removeInternFile();
              }
          }
          else if  ( lParmG.isLParmSortComp4()  ) { 
//  SORT SORTWORK-FILE ON ASCENDING KEY SORTWORK-KEY-COMP-4 USING TESTDATA-FILE OUTPUT PROCEDURE IS 2000-RETURN-RECORDS
              try {
                  sortKeysCaseId = 3;
                  if(useSortFileStrategy()) {
                  	// implement code here
                       sortDecider.setInFileDetails(testdataFile.getAccessFileName(testdataFile.getFileName()),testdataFile.getRecLen(),testdataFile.isFixedBlock());
                       sortDecider.setOutFileName(sortworkFileInternOut.getAccessFileName(sortworkFileInternOut.getFileName()),sortworkFileInternOut.getRecLen());
              		 SortProperties sortProperties = new SortProperties();
              		 // SORT key information
                       sortDecider.addSortKeysInfo("SORTWORKKEYCOMP4"/*name*/,SORTWORKKEYCOMP4_OFFSET/*pos*/,SORTWORKKEYCOMP4_LENGTH/*len*/,false/*descending*/,"BI"/*type*/,sortProperties);
              		 logger.info("Start reading SORT TEMP INPUT file Information ...");
              		 //Pre-process input file details and read sort keys information
              		 sortProcesser = sortDecider.decideSortStrategy(sortProperties);
              
              		 logger.info("Start process SORT using fetched SORT keys...");
              		 //Perform SORT based on sort keys information
              		 sortProcesser.sort();
              		 logger.info("Start process the sorted record to GIVING out file...");
              		 //Perform output file write by merging the sorted file(s)
              		 sortProcesser.merge();
              		 logger.info("SORT process using file strategy ends.");
                     sortworkFileInternOut.open("r", sortworkFileInternOut.getFileName(), sortworkFileInternOut.getSortworkFileInternOutCharSet(),sortworkFileInternOut.getSortworkFileInternOutCrlfFlag());
                  } else {
                  byte[] record = null;
                  useSortTempFile(useTempFile);
                  sortRecKeys = new ArrayList<>();
                  doSortPresets();
                  //  USING testdataFile read process begin
                  testdataFile.open("r",testdataFile.getFileName(),testdataFile.getTestdataFileCharSet(),testdataFile.getTestdataFileCrlfFlag());
                  setVBSortInFile(!testdataFile.isFixedBlock());
                  
              	record = testdataFile.readRecord();
              	while (!testdataFile.hasEnded() && record != null) {
                      addReleaseRecord(getRecordChar(record,testdataFile.getFileCharSet()),record.length);
                      record = testdataFile.readRecord();
                  }
                  testdataFile.close();
              
                  sortComp = Comparator.comparingInt(SortworkKeyBinaryKeys::getSortworkKeyComp4);
              
                  sortRecKeys = sortRecKeys.stream().sorted(sortComp).collect(Collectors.toList());
              
                  if (isWriteInTempFile()){
                         boolean isCountMatches = true;
                         int recordKeyCount = sortRecKeys.size();
                         while (isCountMatches) {
                                 isCountMatches = recordKeyCount != getWriteCounter().get();
                         }
                  }
                  if (isUsingSortInFile())
                      createRAFile(testdataFile.getFileName());
              
                  doPresetForRead();
                  }
                    returnRecords();
                   if(sortworkFileInternOut.hasOpened()) {
              	    sortworkFileInternOut.close(); 
                   }
              } catch(Exception e) {
                  logger.error("",e);
              } finally {
                  removeTempFile();
                  sortRecKeys.clear();
                  removeInternFile();
              }
          }
          else if  ( lParmG.isLParmSortComp5()  ) { 
//  SORT SORTWORK-FILE ON ASCENDING KEY SORTWORK-KEY-COMP-5 USING TESTDATA-FILE OUTPUT PROCEDURE IS 2000-RETURN-RECORDS
              try {
                  sortKeysCaseId = 4;
                  if(useSortFileStrategy()) {
                  	// implement code here
                       sortDecider.setInFileDetails(testdataFile.getAccessFileName(testdataFile.getFileName()),testdataFile.getRecLen(),testdataFile.isFixedBlock());
                       sortDecider.setOutFileName(sortworkFileInternOut.getAccessFileName(sortworkFileInternOut.getFileName()),sortworkFileInternOut.getRecLen());
              		 SortProperties sortProperties = new SortProperties();
              		 // SORT key information
                       sortDecider.addSortKeysInfo("SORTWORKKEYCOMP5"/*name*/,SORTWORKKEYCOMP5_OFFSET/*pos*/,SORTWORKKEYCOMP5_LENGTH/*len*/,false/*descending*/,"BI"/*type*/,sortProperties);
              		 logger.info("Start reading SORT TEMP INPUT file Information ...");
              		 //Pre-process input file details and read sort keys information
              		 sortProcesser = sortDecider.decideSortStrategy(sortProperties);
              
              		 logger.info("Start process SORT using fetched SORT keys...");
              		 //Perform SORT based on sort keys information
              		 sortProcesser.sort();
              		 logger.info("Start process the sorted record to GIVING out file...");
              		 //Perform output file write by merging the sorted file(s)
              		 sortProcesser.merge();
              		 logger.info("SORT process using file strategy ends.");
                     sortworkFileInternOut.open("r", sortworkFileInternOut.getFileName(), sortworkFileInternOut.getSortworkFileInternOutCharSet(),sortworkFileInternOut.getSortworkFileInternOutCrlfFlag());
                  } else {
                  byte[] record = null;
                  useSortTempFile(useTempFile);
                  sortRecKeys = new ArrayList<>();
                  doSortPresets();
                  //  USING testdataFile read process begin
                  testdataFile.open("r",testdataFile.getFileName(),testdataFile.getTestdataFileCharSet(),testdataFile.getTestdataFileCrlfFlag());
                  setVBSortInFile(!testdataFile.isFixedBlock());
                  
              	record = testdataFile.readRecord();
              	while (!testdataFile.hasEnded() && record != null) {
                      addReleaseRecord(getRecordChar(record,testdataFile.getFileCharSet()),record.length);
                      record = testdataFile.readRecord();
                  }
                  testdataFile.close();
              
                  sortComp = Comparator.comparingInt(SortworkKeyBinaryKeys::getSortworkKeyComp5);
              
                  sortRecKeys = sortRecKeys.stream().sorted(sortComp).collect(Collectors.toList());
              
                  if (isWriteInTempFile()){
                         boolean isCountMatches = true;
                         int recordKeyCount = sortRecKeys.size();
                         while (isCountMatches) {
                                 isCountMatches = recordKeyCount != getWriteCounter().get();
                         }
                  }
                  if (isUsingSortInFile())
                      createRAFile(testdataFile.getFileName());
              
                  doPresetForRead();
                  }
                    returnRecords();
                   if(sortworkFileInternOut.hasOpened()) {
              	    sortworkFileInternOut.close(); 
                   }
              } catch(Exception e) {
                  logger.error("",e);
              } finally {
                  removeTempFile();
                  sortRecKeys.clear();
                  removeInternFile();
              }
          }
          else if  ( lParmG.isLParmSortComp3()  ) { 
//  SORT SORTWORK-FILE ON ASCENDING KEY SORTWORK-KEY-COMP-3 USING TESTDATA-FILE OUTPUT PROCEDURE IS 2000-RETURN-RECORDS
              try {
                  sortKeysCaseId = 5;
                  if(useSortFileStrategy()) {
                  	// implement code here
                       sortDecider.setInFileDetails(testdataFile.getAccessFileName(testdataFile.getFileName()),testdataFile.getRecLen(),testdataFile.isFixedBlock());
                       sortDecider.setOutFileName(sortworkFileInternOut.getAccessFileName(sortworkFileInternOut.getFileName()),sortworkFileInternOut.getRecLen());
              		 SortProperties sortProperties = new SortProperties();
              		 // SORT key information
                       sortDecider.addSortKeysInfo("SORTWORKKEYCOMP3"/*name*/,SORTWORKKEYCOMP3_OFFSET/*pos*/,SORTWORKKEYCOMP3_LENGTH/*len*/,false/*descending*/,"PD"/*type*/,sortProperties);
              		 logger.info("Start reading SORT TEMP INPUT file Information ...");
              		 //Pre-process input file details and read sort keys information
              		 sortProcesser = sortDecider.decideSortStrategy(sortProperties);
              
              		 logger.info("Start process SORT using fetched SORT keys...");
              		 //Perform SORT based on sort keys information
              		 sortProcesser.sort();
              		 logger.info("Start process the sorted record to GIVING out file...");
              		 //Perform output file write by merging the sorted file(s)
              		 sortProcesser.merge();
              		 logger.info("SORT process using file strategy ends.");
                     sortworkFileInternOut.open("r", sortworkFileInternOut.getFileName(), sortworkFileInternOut.getSortworkFileInternOutCharSet(),sortworkFileInternOut.getSortworkFileInternOutCrlfFlag());
                  } else {
                  byte[] record = null;
                  useSortTempFile(useTempFile);
                  sortRecKeys = new ArrayList<>();
                  doSortPresets();
                  //  USING testdataFile read process begin
                  testdataFile.open("r",testdataFile.getFileName(),testdataFile.getTestdataFileCharSet(),testdataFile.getTestdataFileCrlfFlag());
                  setVBSortInFile(!testdataFile.isFixedBlock());
                  
              	record = testdataFile.readRecord();
              	while (!testdataFile.hasEnded() && record != null) {
                      addReleaseRecord(getRecordChar(record,testdataFile.getFileCharSet()),record.length);
                      record = testdataFile.readRecord();
                  }
                  testdataFile.close();
              
                  sortComp = Comparator.comparingLong(SortworkKeyBinaryKeys::getSortworkKeyComp3);
              
                  sortRecKeys = sortRecKeys.stream().sorted(sortComp).collect(Collectors.toList());
              
                  if (isWriteInTempFile()){
                         boolean isCountMatches = true;
                         int recordKeyCount = sortRecKeys.size();
                         while (isCountMatches) {
                                 isCountMatches = recordKeyCount != getWriteCounter().get();
                         }
                  }
                  if (isUsingSortInFile())
                      createRAFile(testdataFile.getFileName());
              
                  doPresetForRead();
                  }
                    returnRecords();
                   if(sortworkFileInternOut.hasOpened()) {
              	    sortworkFileInternOut.close(); 
                   }
              } catch(Exception e) {
                  logger.error("",e);
              } finally {
                  removeTempFile();
                  sortRecKeys.clear();
                  removeInternFile();
              }
          }
          else if  ( lParmG.isLParmSortZoneDecimal()  ) { 
//  SORT SORTWORK-FILE ON ASCENDING KEY SORTWORK-KEY-ZONE-DEC USING TESTDATA-FILE OUTPUT PROCEDURE IS 2000-RETURN-RECORDS
              try {
                  sortKeysCaseId = 6;
                  if(useSortFileStrategy()) {
                  	// implement code here
                       sortDecider.setInFileDetails(testdataFile.getAccessFileName(testdataFile.getFileName()),testdataFile.getRecLen(),testdataFile.isFixedBlock());
                       sortDecider.setOutFileName(sortworkFileInternOut.getAccessFileName(sortworkFileInternOut.getFileName()),sortworkFileInternOut.getRecLen());
              		 SortProperties sortProperties = new SortProperties();
              		 // SORT key information
                       sortDecider.addSortKeysInfo("SORTWORKKEYZONEDEC"/*name*/,SORTWORKKEYZONEDEC_OFFSET/*pos*/,SORTWORKKEYZONEDEC_LENGTH/*len*/,false/*descending*/,"CH"/*type*/,sortProperties);
              		 logger.info("Start reading SORT TEMP INPUT file Information ...");
              		 //Pre-process input file details and read sort keys information
              		 sortProcesser = sortDecider.decideSortStrategy(sortProperties);
              
              		 logger.info("Start process SORT using fetched SORT keys...");
              		 //Perform SORT based on sort keys information
              		 sortProcesser.sort();
              		 logger.info("Start process the sorted record to GIVING out file...");
              		 //Perform output file write by merging the sorted file(s)
              		 sortProcesser.merge();
              		 logger.info("SORT process using file strategy ends.");
                     sortworkFileInternOut.open("r", sortworkFileInternOut.getFileName(), sortworkFileInternOut.getSortworkFileInternOutCharSet(),sortworkFileInternOut.getSortworkFileInternOutCrlfFlag());
                  } else {
                  byte[] record = null;
                  useSortTempFile(useTempFile);
                  sortRecKeys = new ArrayList<>();
                  doSortPresets();
                  //  USING testdataFile read process begin
                  testdataFile.open("r",testdataFile.getFileName(),testdataFile.getTestdataFileCharSet(),testdataFile.getTestdataFileCrlfFlag());
                  setVBSortInFile(!testdataFile.isFixedBlock());
                  
              	record = testdataFile.readRecord();
              	while (!testdataFile.hasEnded() && record != null) {
                      addReleaseRecord(getRecordChar(record,testdataFile.getFileCharSet()),record.length);
                      record = testdataFile.readRecord();
                  }
                  testdataFile.close();
              
                  sortComp = Comparator.comparingLong(SortworkKeyBinaryKeys::getSortworkKeyZoneDec);
              
                  sortRecKeys = sortRecKeys.stream().sorted(sortComp).collect(Collectors.toList());
              
                  if (isWriteInTempFile()){
                         boolean isCountMatches = true;
                         int recordKeyCount = sortRecKeys.size();
                         while (isCountMatches) {
                                 isCountMatches = recordKeyCount != getWriteCounter().get();
                         }
                  }
                  if (isUsingSortInFile())
                      createRAFile(testdataFile.getFileName());
              
                  doPresetForRead();
                  }
                    returnRecords();
                   if(sortworkFileInternOut.hasOpened()) {
              	    sortworkFileInternOut.close(); 
                   }
              } catch(Exception e) {
                  logger.error("",e);
              } finally {
                  removeTempFile();
                  sortRecKeys.clear();
                  removeInternFile();
              }
          }
          else   { 
              // MOVE 'UNEXPECTED ERROR, TERMINATING' TO DISPLAY-RECORD
              displayRecord.setString(CONSTANTS.LITERAL_49171558);
//  WRITE DISPLAY-RECORD
              displayFile.write(displayRecord.toCharArray()); 
              displayRecord.setString(CONSTANTS.LOW_VALUE_215751956);
              work.setDisplayFileStatus(displayFile.getStatusString() );
//  MOVE SPACES TO DISPLAY-RECORD
              displayRecord.setString(CONSTANTS.SPACE_133);
//  WRITE DISPLAY-RECORD
              displayFile.write(displayRecord.toCharArray()); 
              displayRecord.setString(CONSTANTS.LOW_VALUE_215751956);
              work.setDisplayFileStatus(displayFile.getStatusString() );
              // MOVE 16 TO RETURN-CODE
              this.setRc( 16);
//  GOBACK
              setNotLogged(false); // no need to log, it is a normal termination
              this.setProgramEnded(true);
              return ;
          }
//  MOVE SPACES TO DISPLAY-RECORD
          displayRecord.setString(CONSTANTS.SPACE_133);
//  WRITE DISPLAY-RECORD
          displayFile.write(displayRecord.toCharArray()); 
          displayRecord.setString(CONSTANTS.LOW_VALUE_215751956);
          work.setDisplayFileStatus(displayFile.getStatusString() );
          // MOVE 'PROGRAM CFSORT09 NORMAL END' TO DISPLAY-RECORD
          displayRecord.setString(CONSTANTS.LITERAL_1411716699);
//  WRITE DISPLAY-RECORD
          displayFile.write(displayRecord.toCharArray()); 
          displayRecord.setString(CONSTANTS.LOW_VALUE_215751956);
          work.setDisplayFileStatus(displayFile.getStatusString() );
//  CLOSE DISPLAY-FILE
          displayFile.close(); 
          work.setDisplayFileStatus(displayFile.getStatusString() );
//  STOP RUN
          setNotLogged(false); // no need to log, it is a normal termination
          this.setProgramEnded(true);
          return ;
      
      }
      /**
      * init 
      *   This method is derived from 
  *   COBOL Paragraph - 0010-INIT COBOL Cyclomatic complexity - 18
      * Input  :  

      * - lParmLen                       COBOL Name: L-PARM-LEN
      * - lParmG                         COBOL Name: L-PARM-G
      * - lParmSortKey                   COBOL Name: L-PARM-SORT-KEY
      *
      * Output :  

      * - displayRecord                  COBOL Name: DISPLAY-RECORD
      * - displayFileStatus              COBOL Name: WS-DISPLAY-FILE-STATUS
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      private void init() throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			short lParmLen = 0;
			// End of variable declaration

      
// *

// *
          lParmLen = lParmG.getLParmLen();
//  IF L-PARM-LEN < LENGTH OF L-PARM-G
          if (	( lParmLen < LParmG.getLParmGFieldLength() ) ) { 
//  MOVE SPACES TO DISPLAY-RECORD
              displayRecord.setString(CONSTANTS.SPACE_133);
//  STRING 'INVALID OR MISSING PARAMETER PASSED, VALID ' 'VALUES ARE: BINARY, COMP, COMP-3, COMP-4, ' 'COMP-5, ZONE-DEC.' DELIMITED BY SIZE INTO DISPLAY-RECORD END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_117311401);
                 charArray.add(CONSTANTS.LITERAL_402730631);
                 charArray.add(CONSTANTS.LITERAL_1965655618);
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2));
              updated = updateString(displayRecord.toCharArray() ,joinCharArray);
              displayRecord.setString(  (char[])updated.get("string"));
//  WRITE DISPLAY-RECORD
              displayFile.write(displayRecord.toCharArray()); 
              displayRecord.setString(CONSTANTS.LOW_VALUE_215751956);
              work.setDisplayFileStatus(displayFile.getStatusString() );
//  MOVE SPACES TO DISPLAY-RECORD
              displayRecord.setString(CONSTANTS.SPACE_133);
//  WRITE DISPLAY-RECORD
              displayFile.write(displayRecord.toCharArray()); 
              displayRecord.setString(CONSTANTS.LOW_VALUE_215751956);
              work.setDisplayFileStatus(displayFile.getStatusString() );
              // MOVE 16 TO RETURN-CODE
              this.setRc( 16);
//  GOBACK
              setNotLogged(false); // no need to log, it is a normal termination
              this.setProgramEnded(true);
              return ;
          }
  
//  MOVE SPACES TO DISPLAY-RECORD
          displayRecord.setString(CONSTANTS.SPACE_133);
//  STRING 'SORT RECORD BYTES WILL BE DISPLAYED AS FOLLOWS' ' IN BINARY FORM' DELIMITED BY SIZE INTO DISPLAY-RECORD END-STRING
          charArray = new ArrayList<char[]>();
             charArray.add(CONSTANTS.LITERAL_1428927324);
             charArray.add(CONSTANTS.LITERAL_B3_INBINARYFORM);
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
          updated = updateString(displayRecord.toCharArray() ,joinCharArray);
          displayRecord.setString(  (char[])updated.get("string"));
//  WRITE DISPLAY-RECORD
          displayFile.write(displayRecord.toCharArray()); 
          displayRecord.setString(CONSTANTS.LOW_VALUE_215751956);
          work.setDisplayFileStatus(displayFile.getStatusString() );
          // MOVE '111111111 | 22222 | 3333 | 4444 | 5555 | 6666' TO DISPLAY-RECORD
          displayRecord.setString(CONSTANTS.LITERAL_103454680);
//  WRITE DISPLAY-RECORD
          displayFile.write(displayRecord.toCharArray()); 
          displayRecord.setString(CONSTANTS.LOW_VALUE_215751956);
          work.setDisplayFileStatus(displayFile.getStatusString() );
          // MOVE '1. ZONE-DECIMAL' TO DISPLAY-RECORD
          displayRecord.setString(CONSTANTS.LITERAL_537374076);
//  WRITE DISPLAY-RECORD
          displayFile.write(displayRecord.toCharArray()); 
          displayRecord.setString(CONSTANTS.LOW_VALUE_215751956);
          work.setDisplayFileStatus(displayFile.getStatusString() );
          // MOVE '2. COMP-3' TO DISPLAY-RECORD
          displayRecord.setString(CONSTANTS.LITERAL_861811554);
//  WRITE DISPLAY-RECORD
          displayFile.write(displayRecord.toCharArray()); 
          displayRecord.setString(CONSTANTS.LOW_VALUE_215751956);
          work.setDisplayFileStatus(displayFile.getStatusString() );
          // MOVE '3. BINARY' TO DISPLAY-RECORD
          displayRecord.setString(CONSTANTS.LITERAL_827287151);
//  WRITE DISPLAY-RECORD
          displayFile.write(displayRecord.toCharArray()); 
          displayRecord.setString(CONSTANTS.LOW_VALUE_215751956);
          work.setDisplayFileStatus(displayFile.getStatusString() );
          // MOVE '4. COMP  ' TO DISPLAY-RECORD
          displayRecord.setString(CONSTANTS.LITERAL_1198439358);
//  WRITE DISPLAY-RECORD
          displayFile.write(displayRecord.toCharArray()); 
          displayRecord.setString(CONSTANTS.LOW_VALUE_215751956);
          work.setDisplayFileStatus(displayFile.getStatusString() );
          // MOVE '5. COMP-4' TO DISPLAY-RECORD
          displayRecord.setString(CONSTANTS.LITERAL_823506022);
//  WRITE DISPLAY-RECORD
          displayFile.write(displayRecord.toCharArray()); 
          displayRecord.setString(CONSTANTS.LOW_VALUE_215751956);
          work.setDisplayFileStatus(displayFile.getStatusString() );
          // MOVE '6. COMP-5' TO DISPLAY-RECORD
          displayRecord.setString(CONSTANTS.LITERAL_857587048);
//  WRITE DISPLAY-RECORD
          displayFile.write(displayRecord.toCharArray()); 
          displayRecord.setString(CONSTANTS.LOW_VALUE_215751956);
          work.setDisplayFileStatus(displayFile.getStatusString() );
          // MOVE ' ' TO DISPLAY-RECORD
          displayRecord.setString(CONSTANTS.LITERAL_576124969);
//  WRITE DISPLAY-RECORD
          displayFile.write(displayRecord.toCharArray()); 
          displayRecord.setString(CONSTANTS.LOW_VALUE_215751956);
          work.setDisplayFileStatus(displayFile.getStatusString() );
//  EVALUATE TRUE
          if  ( lParmG.isLParmSortBinary()  ) { 
              // MOVE 'USING BINARY SORT KEY' TO DISPLAY-RECORD
              displayRecord.setString(CONSTANTS.LITERAL_402884151);
//  WRITE DISPLAY-RECORD
              displayFile.write(displayRecord.toCharArray()); 
              displayRecord.setString(CONSTANTS.LOW_VALUE_215751956);
              work.setDisplayFileStatus(displayFile.getStatusString() );
              // MOVE ' ' TO DISPLAY-RECORD
              displayRecord.setString(CONSTANTS.LITERAL_576124969);
//  WRITE DISPLAY-RECORD
              displayFile.write(displayRecord.toCharArray()); 
              displayRecord.setString(CONSTANTS.LOW_VALUE_215751956);
              work.setDisplayFileStatus(displayFile.getStatusString() );
          }
          else if  ( lParmG.isLParmSortComp()  ) { 
              // MOVE 'USING COMP SORT KEY' TO DISPLAY-RECORD
              displayRecord.setString(CONSTANTS.LITERAL_1043406149);
//  WRITE DISPLAY-RECORD
              displayFile.write(displayRecord.toCharArray()); 
              displayRecord.setString(CONSTANTS.LOW_VALUE_215751956);
              work.setDisplayFileStatus(displayFile.getStatusString() );
              // MOVE ' ' TO DISPLAY-RECORD
              displayRecord.setString(CONSTANTS.LITERAL_576124969);
//  WRITE DISPLAY-RECORD
              displayFile.write(displayRecord.toCharArray()); 
              displayRecord.setString(CONSTANTS.LOW_VALUE_215751956);
              work.setDisplayFileStatus(displayFile.getStatusString() );
          }
          else if  ( lParmG.isLParmSortComp4()  ) { 
              // MOVE 'USING COMP-4 SORT KEY' TO DISPLAY-RECORD
              displayRecord.setString(CONSTANTS.LITERAL_34506612);
//  WRITE DISPLAY-RECORD
              displayFile.write(displayRecord.toCharArray()); 
              displayRecord.setString(CONSTANTS.LOW_VALUE_215751956);
              work.setDisplayFileStatus(displayFile.getStatusString() );
              // MOVE ' ' TO DISPLAY-RECORD
              displayRecord.setString(CONSTANTS.LITERAL_576124969);
//  WRITE DISPLAY-RECORD
              displayFile.write(displayRecord.toCharArray()); 
              displayRecord.setString(CONSTANTS.LOW_VALUE_215751956);
              work.setDisplayFileStatus(displayFile.getStatusString() );
          }
          else if  ( lParmG.isLParmSortComp5()  ) { 
              // MOVE 'USING COMP-5 SORT KEY' TO DISPLAY-RECORD
              displayRecord.setString(CONSTANTS.LITERAL_1059998611);
//  WRITE DISPLAY-RECORD
              displayFile.write(displayRecord.toCharArray()); 
              displayRecord.setString(CONSTANTS.LOW_VALUE_215751956);
              work.setDisplayFileStatus(displayFile.getStatusString() );
              // MOVE ' ' TO DISPLAY-RECORD
              displayRecord.setString(CONSTANTS.LITERAL_576124969);
//  WRITE DISPLAY-RECORD
              displayFile.write(displayRecord.toCharArray()); 
              displayRecord.setString(CONSTANTS.LOW_VALUE_215751956);
              work.setDisplayFileStatus(displayFile.getStatusString() );
          }
          else if  ( lParmG.isLParmSortComp3()  ) { 
              // MOVE 'USING PACKED-DECIMAL SORT KEY' TO DISPLAY-RECORD
              displayRecord.setString(CONSTANTS.LITERAL_1768784562);
//  WRITE DISPLAY-RECORD
              displayFile.write(displayRecord.toCharArray()); 
              displayRecord.setString(CONSTANTS.LOW_VALUE_215751956);
              work.setDisplayFileStatus(displayFile.getStatusString() );
              // MOVE ' ' TO DISPLAY-RECORD
              displayRecord.setString(CONSTANTS.LITERAL_576124969);
//  WRITE DISPLAY-RECORD
              displayFile.write(displayRecord.toCharArray()); 
              displayRecord.setString(CONSTANTS.LOW_VALUE_215751956);
              work.setDisplayFileStatus(displayFile.getStatusString() );
          }
          else if  ( lParmG.isLParmSortZoneDecimal()  ) { 
              // MOVE 'USING ZONE-DECIMAL SORT KEY' TO DISPLAY-RECORD
              displayRecord.setString(CONSTANTS.LITERAL_1830681894);
//  WRITE DISPLAY-RECORD
              displayFile.write(displayRecord.toCharArray()); 
              displayRecord.setString(CONSTANTS.LOW_VALUE_215751956);
              work.setDisplayFileStatus(displayFile.getStatusString() );
              // MOVE ' ' TO DISPLAY-RECORD
              displayRecord.setString(CONSTANTS.LITERAL_576124969);
//  WRITE DISPLAY-RECORD
              displayFile.write(displayRecord.toCharArray()); 
              displayRecord.setString(CONSTANTS.LOW_VALUE_215751956);
              work.setDisplayFileStatus(displayFile.getStatusString() );
          }
          else   { 
//  MOVE SPACES TO DISPLAY-RECORD
              displayRecord.setString(CONSTANTS.SPACE_133);
//  STRING 'INVALID OR MISSING PARAMETER PASSED,' ' VALID VALUES ARE: BINARY, COMP, COMP-3, ' 'COMP-4, COMP-5, ZONE-DEC.' DELIMITED BY SIZE INTO DISPLAY-RECORD END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_703341225);
                 charArray.add(CONSTANTS.LITERAL_1071008963);
                 charArray.add(CONSTANTS.LITERAL_1111629140);
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2));
              updated = updateString(displayRecord.toCharArray() ,joinCharArray);
              displayRecord.setString(  (char[])updated.get("string"));
//  WRITE DISPLAY-RECORD
              displayFile.write(displayRecord.toCharArray()); 
              displayRecord.setString(CONSTANTS.LOW_VALUE_215751956);
              work.setDisplayFileStatus(displayFile.getStatusString() );
              // MOVE ' ' TO DISPLAY-RECORD
              displayRecord.setString(CONSTANTS.LITERAL_576124969);
//  WRITE DISPLAY-RECORD
              displayFile.write(displayRecord.toCharArray()); 
              displayRecord.setString(CONSTANTS.LOW_VALUE_215751956);
              work.setDisplayFileStatus(displayFile.getStatusString() );
              // MOVE 16 TO RETURN-CODE
              this.setRc( 16);
//  GOBACK
              setNotLogged(false); // no need to log, it is a normal termination
              this.setProgramEnded(true);
              return ;
          }
      
      }
      /**
      * returnRecords 
      *   This method is derived from 
  *   COBOL Paragraph - 2000-RETURN-RECORDS COBOL Cyclomatic complexity - 4
      * Input  :  

      * - wSortdataKeyZoneDec            COBOL Name: W-SORTDATA-KEY-ZONE-DEC
      * - wSortdataRecord                COBOL Name: W-SORTDATA-RECORD
      *
      * Output :  

      * - i                              COBOL Name: I
      * - j                              COBOL Name: J
      * - dispJ                          COBOL Name: DISP-J
      * - dispI                          COBOL Name: DISP-I
      * - wSortdataKeyZoneDec            COBOL Name: W-SORTDATA-KEY-ZONE-DEC
      * - displayRecord                  COBOL Name: DISPLAY-RECORD
      * - displayFileStatus              COBOL Name: WS-DISPLAY-FILE-STATUS
      *
      * @throws CFException
      */
      private void returnRecords() throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			// End of variable declaration

      
// *
// *

// *
//  MOVE 1 TO I
          work.setI(1);
//  PERFORM VARYING J FROM 0 BY 1 UNTIL I = -1
          for (work.setJ(0); (	( work.getI() != -1 )) ; work.setJ(work.getJ() + 1) ) {
//  RETURN SORTWORK-FILE RECORD INTO W-SORTDATA-RECORD
                    if(useSortFileStrategy()) {
                      sortworkFileInternOut.read();
                      if (!sortworkFileInternOut.hasEnded()) {
                      	wSortdataRecord.setString(sortworkFileInternOut.getRecord());
                      }    
                  } else {
              setRecIndex(getRecIndex()+1);
              if (getRecIndex() < sortRecKeys.size() ) { 
                 if (isUsingSortInFile()) wSortdataRecord.setString(convertEbcdicBytes2Char(getReturnRecord(getRecIndex())));
                 else wSortdataRecord.setString(getReturnRecord(getRecIndex())); 
              }
              }
//  AT END
                  if (isSortRecordsEnded()) { 
//  MOVE -1 TO I
                      work.setI(-1);
                    }
              // MOVE J TO DISP-J
              work.setDispJ(work.getJ());
//  MOVE W-SORTDATA-KEY-ZONE-DEC TO DISP-I
//  FORMAT_467480023 = "-999999999999999999"
              work.setDispI(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_467480023,String.valueOf(wSortdataRecord.getWSortdataKeyZoneDec()).toCharArray()));
//  STRING 'RETURNED REC: ' DISP-J ' | ' 'VALUE IS: ' DISP-I ' | ' W-SORTDATA-RECORD DELIMITED BY SIZE INTO DISPLAY-RECORD END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_RETURNED_B2_REC_CL_);
                 charArray.add(String.valueOf(work.getDispJString()).toCharArray());
                 charArray.add(CONSTANTS.LITERAL_32473216);
                 charArray.add(CONSTANTS.LITERAL_VALUE_B2_IS_CL_);
                 charArray.add(work.getDispI());
                 charArray.add(CONSTANTS.LITERAL_32473216);
                 charArray.add(wSortdataRecord.toCharArray());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3),charArray.get(4),charArray.get(5),charArray.get(6));
              updated = updateString(displayRecord.toCharArray() ,joinCharArray);
              displayRecord.setString(  (char[])updated.get("string"));
//  WRITE DISPLAY-RECORD
              displayFile.write(displayRecord.toCharArray()); 
              displayRecord.setString(CONSTANTS.LOW_VALUE_215751956);
              work.setDisplayFileStatus(displayFile.getStatusString() );
          }
      
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
            lParmG.set((Field)params[0]);
         // invoke the process and return rc
         return process();
         
      }
      
      public int call(Field... parameters) throws Exception {
         for (int index = 0; index < parameters.length;index++) {
             switch(index) {
              case 0:
                      if(parameters[index] != null ) {
              		if (parameters[index] instanceof LParmG) {
                       	this.lParmG = ((LParmG) parameters[index]);
                  	} else {
                       	this.lParmG.set(parameters[index]);
                  	}
                  }
                
                  break;
            }
         }
          return process();
      }
      
      
  
      /**
       * Method is used to collect SortworkKeyBinary sort keys 
       * from each record to perform COBOL sort statement. 
       *  
       * @param record
       * @param recLen    
       */
      public void addReleaseRecord(char[] record, int recLen) throws Exception {
      	if(recLen > record.length)  recLen = record.length;
      	SortworkKeyBinaryKeys relKey = new SortworkKeyBinaryKeys();
      	switch (sortKeysCaseId) {
              case 1:{
                  char[] keySortworkKeyBinary = new char[SORTWORKKEYBINARY_LENGTH];
    System.arraycopy(record,SORTWORKKEYBINARY_OFFSET,keySortworkKeyBinary,0,SORTWORKKEYBINARY_LENGTH);
    relKey.setSortworkKeyBinary(Field.getIntBinary(keySortworkKeyBinary)); 
              }   break; 
              case 2:{  
                  char[] keySortworkKeyComp = new char[SORTWORKKEYCOMP_LENGTH];
    System.arraycopy(record,SORTWORKKEYCOMP_OFFSET,keySortworkKeyComp,0,SORTWORKKEYCOMP_LENGTH);
    relKey.setSortworkKeyComp(Field.getIntBinary(keySortworkKeyComp)); 
              }   break; 
              case 3:{  
                  char[] keySortworkKeyComp4 = new char[SORTWORKKEYCOMP4_LENGTH];
    System.arraycopy(record,SORTWORKKEYCOMP4_OFFSET,keySortworkKeyComp4,0,SORTWORKKEYCOMP4_LENGTH);
    relKey.setSortworkKeyComp4(Field.getIntBinary(keySortworkKeyComp4)); 
              }   break; 
              case 4:{  
                  char[] keySortworkKeyComp5 = new char[SORTWORKKEYCOMP5_LENGTH];
    System.arraycopy(record,SORTWORKKEYCOMP5_OFFSET,keySortworkKeyComp5,0,SORTWORKKEYCOMP5_LENGTH);
    relKey.setSortworkKeyComp5(Field.getIntBinary(keySortworkKeyComp5)); 
              }   break; 
              case 5:{  
                  char[] keySortworkKeyComp3 = new char[SORTWORKKEYCOMP3_LENGTH];
    System.arraycopy(record,SORTWORKKEYCOMP3_OFFSET,keySortworkKeyComp3,0,SORTWORKKEYCOMP3_LENGTH);
    relKey.setSortworkKeyComp3(Field.getLongFromPackedData(new String(keySortworkKeyComp3), SORTWORKKEYCOMP3_LENGTH)); 
              }   break; 
              case 6:{  
                  char[] keySortworkKeyZoneDec = new char[SORTWORKKEYZONEDEC_LENGTH];
    System.arraycopy(record,SORTWORKKEYZONEDEC_OFFSET,keySortworkKeyZoneDec,0,SORTWORKKEYZONEDEC_LENGTH);
    relKey.setSortworkKeyZoneDec(Field.convertString2Number(keySortworkKeyZoneDec,true/*isSigned*/, true/*isSignTrailing*/, false/*isSignSeparate*/)); 
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
       * Method is used to return sorted records using SortworkKeyBinaryKeys object.
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
      		SortworkKeyBinaryKeys k = sortRecKeys.get(index);
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
            return (sortworkFileInternOut.hasEnded());
          }
      	return (sortRecKeys.size() <= getRecIndex());
      }
  
  
  
  
  }
