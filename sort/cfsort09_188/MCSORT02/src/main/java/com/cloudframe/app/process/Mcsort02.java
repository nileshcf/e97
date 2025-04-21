  package com.cloudframe.app.process;
  /* 
*
*/
  
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.mcsort02.file.*;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.mcsort02.file.Scanner;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.mcsort02.file.records.SortTableIdKeys;
  import java.util.List;
  import java.util.ArrayList;
  import java.util.Comparator;
  import java.util.stream.Collectors;
  import com.cloudframe.app.mcsort02.file.records.SortRec1;
  import com.cloudframe.app.mcsort02.file.records.SortRec4;
  import com.cloudframe.app.mcsort02.file.records.SortRec5;
  import com.cloudframe.app.mcsort02.dto.*;
  import com.cloudframe.app.mcsort02.file.records.Sys004IpmParmMasterRecord;
  import com.cloudframe.app.mcsort02.file.records.Sys002IpmParmMasterRecord;
  import com.cloudframe.app.mcsort02.file.records.Sys005IpmParmMasterRecord;
  import com.cloudframe.app.mcsort02.file.records.SortRec;
  import com.cloudframe.app.mcsort02.dto.AcceptInput;
  import com.cloudframe.app.mcsort02.file.records.OutRecord;
  import com.cloudframe.app.mcsort02.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.utility.CFUtil;
  import org.springframework.beans.factory.InitializingBean;
  import org.springframework.beans.factory.DisposableBean;
  import org.springframework.beans.factory.annotation.Value;
  import com.cloudframe.app.sort.SortProperties;
  import com.cloudframe.app.sort.strategy.SortPathStrategy;
  import com.cloudframe.app.sort.strategy.decider.SortStrategyDecider;
  import com.cloudframe.app.sort.model.SortKeyObject;
  import org.springframework.context.annotation.Lazy;
  
  @Component("mcsort02")
  
  public class Mcsort02 extends CommonProcess implements InitializingBean, DisposableBean {
  
  Logger logger = LoggerFactory.getLogger(Mcsort02.class);
  
  private Sys004IpmParmMasterRecord sys004IpmParmMasterRecord = new Sys004IpmParmMasterRecord() ;
  private Sys002IpmParmMasterRecord sys002IpmParmMasterRecord = new Sys002IpmParmMasterRecord() ;
  private Sys005IpmParmMasterRecord sys005IpmParmMasterRecord = new Sys005IpmParmMasterRecord() ;
  private SortRec sortRec = new SortRec() ;
  private AcceptInput acceptInput = new AcceptInput() ;
  private OutRecord outRecord = new OutRecord() ;
  private Work work = new Work() ;
  
  
  
  @Autowired 
  @Qualifier("mcsort02_sys002IpmParmMaster")
  Sys002IpmParmMaster sys002IpmParmMaster;
  @Autowired 
  @Qualifier("mcsort02_sys004IpmParmMaster")
  Sys004IpmParmMaster sys004IpmParmMaster;
  @Autowired 
  @Qualifier("mcsort02_sys005IpmParmMaster")
  Sys005IpmParmMaster sys005IpmParmMaster;
  @Autowired 
  @Qualifier("mcsort02_sortOut")
  SortOut sortOut;
  @Autowired 
  @Qualifier("mcsort02_sortFileInternIn")
  SortFileInternIn sortFileInternIn;
  @Autowired 
  @Qualifier("mcsort02_sortFileInternOut")
  SortFileInternOut sortFileInternOut;
  
  @Autowired
  @Lazy
  SortStrategyDecider sortDecider;
  
  SortPathStrategy sortProcesser;
  
  @Value("${cf.sort.using.file.strategy:no}")
  private String usingSortFileStrategy;  
  
  @Value("${cf.sort.useTempFile:yes}")
  private String useTempFile;
  
  
  private static final int SORTTABLEID_OFFSET = 0;
  private static final int SORTTABLEID_LENGTH = 8;
  private static final int SORTTABLEEFFDATE_OFFSET = 8;
  private static final int SORTTABLEEFFDATE_LENGTH = 10;
  private static final int SORTTABLEKEYDATA_OFFSET = 18;
  private static final int SORTTABLEKEYDATA_LENGTH = 99;
  private static final int SORT4TABLEID_OFFSET = 0;
  private static final int SORT4TABLEID_LENGTH = 8;
  private static final int SORT4KEY_OFFSET = 8;
  private static final int SORT4KEY_LENGTH = 99;
  private static final int SORT4TABLEEFFDATE_OFFSET = 107;
  private static final int SORT4TABLEEFFDATE_LENGTH = 10;
  private static final int SORT5TABLEID_OFFSET = 0;
  private static final int SORT5TABLEID_LENGTH = 8;
  private static final int SORT5KEY_OFFSET = 8;
  private static final int SORT5KEY_LENGTH = 99;
  private static final int SORT5TABLEEFFDATE_OFFSET = 107;
  private static final int SORT5TABLEEFFDATE_LENGTH = 10;
  private int sortKeysCaseId = 1;
  private List<SortTableIdKeys> sortRecKeys = new ArrayList<>();
  private Comparator<SortTableIdKeys> sortComp = null;
  
  
    @Autowired
    @Qualifier("mcsort02_scanner")
    Scanner scanner;
  
  
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
//  PERFORM MAINLINE
          mainline();/*MAINLINE*/
          if (this.isProgramEnded()) {
              return getRc();
          }
       } catch(Exception e) {
            handleErrorCode(e);
            throw e;
       }
        finally {
      		if(sys002IpmParmMaster.hasOpened() && !sys002IpmParmMaster.isReadOnly()) { 
      			sys002IpmParmMaster.flush(); 
      		}
      		if(sys004IpmParmMaster.hasOpened() && !sys004IpmParmMaster.isReadOnly()) { 
      			sys004IpmParmMaster.flush(); 
      		}
      		if(sys005IpmParmMaster.hasOpened() && !sys005IpmParmMaster.isReadOnly()) { 
      			sys005IpmParmMaster.flush(); 
      		}
      		if(sortOut.hasOpened() && !sortOut.isReadOnly()) { 
      			sortOut.flush(); 
      		}
      		if(sortFileInternIn.hasOpened() && !sortFileInternIn.isReadOnly()) { 
      			sortFileInternIn.flush(); 
      		}
      		if(sortFileInternOut.hasOpened() && !sortFileInternOut.isReadOnly()) { 
      			sortFileInternOut.flush(); 
      		}
      		if(scanner.hasOpened()) { 
      			scanner.close();
      		}
      }
      
       return getRc(); // Exit with return code
      // end of process method
      }
      /**
      * mainline 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE COBOL Cyclomatic complexity - 5
      * Input  : None 

      * Output :  

      * - acceptInput                    COBOL Name: WS-ACCEPT-INPUT
      * - ddname                         COBOL Name: WS-DDNAME
      *
      * @throws CFException
      */
      private void mainline() throws Exception {
			// Declare local variables used in the method
			char[] consoleInput = null;
			// End of variable declaration

      
// *
//  ACCEPT WS-ACCEPT-INPUT
          consoleInput = scanner.nextLine();
          if (!scanner.hasEnded()) {
             acceptInput.setString(consoleInput);  // read from console and assign
          }
//  DISPLAY ' '
          logger.info(" "); 
//  DISPLAY '>>>>>> PROCESSING >>>>>>' WS-ACCEPT-INPUT (1 : 8)
          logger.info(">>>>>> PROCESSING >>>>>>{}", new String(substring(acceptInput.getCharArray(),0,8))); 
//  DISPLAY ' '
          logger.info(" "); 
//  EVALUATE TRUE
          if  ( acceptInput.isSys002()  ) { 
//  PERFORM 1000-SORT-SYS002 THRU 1000-EXIT
              sortSys002();/*1000-SORT-SYS002*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
          else if  ( acceptInput.isSys004()  ) { 
//  PERFORM 2000-SORT-SYS004 THRU 2000-EXIT
              sortSys004();/*2000-SORT-SYS004*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
          else if  ( acceptInput.isSys005()  ) { 
//  PERFORM 3000-SORT-SYS005 THRU 3000-EXIT
              sortSys005();/*3000-SORT-SYS005*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
//  DISPLAY ' '
          logger.info(" "); 
//  DISPLAY '<<<<<< FINSISHED  <<<<<<'
          logger.info("<<<<<< FINSISHED  <<<<<<"); 
//  DISPLAY ' '
          logger.info(" "); 
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          this.setProgramEnded(true);
          return ;
      
      }
      /**
      * sortSys002 
      *   This method is derived from 
  *   COBOL Paragraph - 1000-SORT-SYS002 COBOL Cyclomatic complexity - 5
      * Input  : None 

      * Output :  

      * - sys002Status                   COBOL Name: WS-SYS002-STATUS
      * - sys004Status                   COBOL Name: WS-SYS004-STATUS
      * - sys005Status                   COBOL Name: WS-SYS005-STATUS
      * - sortOutStatus                  COBOL Name: WS-SORT-OUT-STATUS
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      private void sortSys002() throws Exception {
			// Declare local variables used in the method
			char[] sys002Status = null;
			char[] sortOutStatus = null;
			SortRec1 sortRec1 = sortRec.getSortRec1();
			// End of variable declaration

      
// *----------------------------------
//  OPEN INPUT SYS002-IPM-PARM-MASTER
          sys002IpmParmMaster.open(new String(CONSTANTS.MODE_READ_ONLY_36242),sys002IpmParmMaster.getFileName(),sys002IpmParmMaster.getSys002IpmParmMasterCharSet(),sys002IpmParmMaster.getSys002IpmParmMasterCrlfFlag());
          work.setSys002Status(sys002IpmParmMaster.getStatusString() );

// *
          sys002Status = work.getSys002Status();
//  IF NOT ( WS-SYS002-STATUS = '00' )
//  LITERAL_00 = '00'
          if ((		compareChars(sys002Status,CONSTANTS.LITERAL_00) != 0 )) { 
//  DISPLAY 'OPEN SYS002 ERROR ' WS-SYS002-STATUS
              logger.info("OPEN SYS002 ERROR {}", new String(work.getSys002Status())); 
//  DISPLAY 'MCSORT02 ABENDED '
              logger.info("MCSORT02 ABENDED "); 
              // MOVE 12 TO RETURN-CODE
              this.setRc( 12);
//  GOBACK
              setNotLogged(false); // no need to log, it is a normal termination
              this.setProgramEnded(true);
              return ;
          }
  

// *

// *
//  OPEN OUTPUT SORT-OUT
          sortOut.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),sortOut.getFileName(),sortOut.getSortOutCharSet(),sortOut.getSortOutCrlfFlag());
          work.setSortOutStatus(sortOut.getStatusString() );
          sortOutStatus = work.getSortOutStatus();
//  IF NOT ( WS-SORT-OUT-STATUS = '00' )
//  LITERAL_00 = '00'
          if ((		compareChars(sortOutStatus,CONSTANTS.LITERAL_00) != 0 )) { 
//  DISPLAY 'OPEN SORT-OUT ERROR ' WS-SORT-OUT-STATUS
              logger.info("OPEN SORT-OUT ERROR {}", new String(work.getSortOutStatus())); 
//  DISPLAY 'MCSORT02 ABENDED '
              logger.info("MCSORT02 ABENDED "); 
              // MOVE 12 TO RETURN-CODE
              this.setRc( 12);
//  GOBACK
              setNotLogged(false); // no need to log, it is a normal termination
              this.setProgramEnded(true);
              return ;
          }
  

// *                      Ascending  key sort-rdw-fld
//  SORT SORT-FILE ON ASCENDING KEY SORT-TABLE-ID DESCENDING KEY SORT-TABLE-EFF-DATE ASCENDING KEY SORT-TABLE-KEY-DATA COLLATING SEQUENCE IS EBCDIC INPUT PROCEDURE IS 1001-FORMAT-SORT-REC OUTPUT PROCEDURE IS 1002-FORMAT-OP-REC
          try {
               //SORT sortFileInternIn input procedure temp file opened in write mode
               sortFileInternIn.open("w", sortFileInternIn.getFileName(), sortFileInternIn.getSortFileInternInCharSet(),sortFileInternIn.getSortFileInternInCrlfFlag());
             sortRecKeys = new ArrayList<>();
             doSortPresets();
              sortKeysCaseId = 1;
                formatSortRec();
              if(sortFileInternIn.hasOpened()) {
                 sortFileInternIn.close();
              }
              if(useSortFileStrategy()) {
              	// implement code here
                   sortDecider.setInFileDetails(sortFileInternIn.getAccessFileName(sortFileInternIn.getFileName()),sortFileInternIn.getRecLen(),sortFileInternIn.isFixedBlock());
                   sortDecider.setOutFileName(sortFileInternOut.getAccessFileName(sortFileInternOut.getFileName()),sortFileInternOut.getRecLen());
          		 SortProperties sortProperties = new SortProperties();
          		 // SORT key information
                   sortDecider.addSortKeysInfo("SORTTABLEID"/*name*/,SORTTABLEID_OFFSET + 4/*pos*/,SORTTABLEID_LENGTH/*len*/,false/*descending*/,"CH"/*type*/,sortProperties);
                   sortDecider.addSortKeysInfo("SORTTABLEEFFDATE"/*name*/,SORTTABLEEFFDATE_OFFSET + 4/*pos*/,SORTTABLEEFFDATE_LENGTH/*len*/,true/*descending*/,"CH"/*type*/,sortProperties);
                   sortDecider.addSortKeysInfo("SORTTABLEKEYDATA"/*name*/,SORTTABLEKEYDATA_OFFSET + 4/*pos*/,SORTTABLEKEYDATA_LENGTH/*len*/,false/*descending*/,"CH"/*type*/,sortProperties);
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
          		 sortFileInternOut.open("r", sortFileInternOut.getFileName(), sortFileInternOut.getSortFileInternOutCharSet(),sortFileInternOut.getSortFileInternOutCrlfFlag());
              } else {
              sortComp = SortTableIdKeys.getSortTableIdComparator(true/*isAscending*/)
                .thenComparing(SortTableIdKeys.getSortTableEffDateComparator(false/*isAscending*/))
                .thenComparing(SortTableIdKeys.getSortTableKeyDataComparator(true/*isAscending*/));
          
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
                formatOpRec();
               if(sortFileInternOut.hasOpened()) {
          	    sortFileInternOut.close(); 
               }
          } catch(Exception e) {
              logger.error("",e);
          } finally {
              removeTempFile();
              sortRecKeys.clear();
              removeInternFile();
          }
  

// *

// *
//  CLOSE SYS002-IPM-PARM-MASTER SORT-OUT
          sys002IpmParmMaster.close(); 
          work.setSys002Status(sys002IpmParmMaster.getStatusString() );
          sortOut.close(); 
          work.setSortOutStatus(sortOut.getStatusString() );
      
      }
      /**
      * formatSortRec 
      *   This method is derived from 
  *   COBOL Paragraph - 1001-FORMAT-SORT-REC COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ipmRdw410                      COBOL Name: 410-IPM-RDW
      *
      * Output :  

      * - eofFlag                        COBOL Name: EOF-FLAG
      * - sys002IpmParmMasterRecord      COBOL Name: SYS002-IPM-PARM-MASTER-RECORD
      * - sys002Status                   COBOL Name: WS-SYS002-STATUS
      * - sortRdw                        COBOL Name: SORT-RDW
      * - ipmRdw410                      COBOL Name: 410-IPM-RDW
      * - sortRec                        COBOL Name: SORT-REC
      *
      * @throws CFException
      */
      private void formatSortRec() throws Exception {
      
// *

// *
//  MOVE SPACE TO EOF-FLAG
          work.setEofFlag(CONSTANTS.SPACE);
//  PERFORM UNTIL EOF-INPUT
          while ((!(work.isEofInput()) )) {
//  READ SYS002-IPM-PARM-MASTER
              	sys002IpmParmMaster.read();
              work.setIpmRdw410(sys002IpmParmMaster.getRecLen());
              work.setSys002Status(sys002IpmParmMaster.getStatusString() );
              if (!sys002IpmParmMaster.hasEnded()) {
              	sys002IpmParmMasterRecord.setString(sys002IpmParmMaster.getRecord());
              }
//  AT END
              if (sys002IpmParmMaster.hasEnded()) {  
//  SET EOF-INPUT TO TRUE
                  work.setEofInputTrue(); 
                  
                }
//  NOT AT END
              else  {
//  MOVE 410-IPM-RDW TO SORT-RDW
                  work.setSortRdw(work.getIpmRdw410());
//  MOVE SYS002-IPM-PARM-MASTER-RECORD (1 : 410-IPM-RDW ) TO SORT-REC (1 : SORT-RDW )
                  sortRec.replace(sys002IpmParmMasterRecord,0,(int) work.getIpmRdw410(),0,(int) work.getSortRdw() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  RELEASE SORT-REC
                  if(useSortFileStrategy()) {
                  sortFileInternIn.write(sortRec.toCharArray(),(int) work.getSortRdw());
                  } else
                    addReleaseRecord(sortRec.toCharArray(),(int) work.getSortRdw());
                }
          }
          ;
      
      }
      /**
      * formatOpRec 
      *   This method is derived from 
  *   COBOL Paragraph - 1002-FORMAT-OP-REC COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sortRdw                        COBOL Name: SORT-RDW
      * - sortRec                        COBOL Name: SORT-REC
      *
      * Output :  

      * - noRecords                      COBOL Name: NO-RECORDS
      * - sortOutRecLen                  COBOL Name: WS-SORT-OUT-REC-LEN
      * - sortRdw                        COBOL Name: SORT-RDW
      * - outRecord                      COBOL Name: OUT-RECORD
      * - sortRec                        COBOL Name: SORT-REC
      * - sortOutStatus                  COBOL Name: WS-SORT-OUT-STATUS
      *
      * @throws CFException
      */
      private void formatOpRec() throws Exception {
      
// *

// *
//  MOVE SPACES TO NO-RECORDS
          work.setNoRecords(CONSTANTS.SPACE);
//  PERFORM UNTIL RECORDS-ENDED
          while ((!(work.isRecordsEnded()) )) {
//  RETURN SORT-FILE RECORD
                    if(useSortFileStrategy()) {
                      sortFileInternOut.read();
                      if (!sortFileInternOut.hasEnded()) {
                      	sortRec.setString(sortFileInternOut.getRecord());
                      	work.setSortRdw(sortFileInternOut.getRecord().length); //for VB
                      }    
                  } else {
              setRecIndex(getRecIndex()+1);
              if (getRecIndex() < sortRecKeys.size() ) { 
                 byte[] tmpBytes = getReturnRecord(getRecIndex());
                 work.setSortRdw(tmpBytes.length);
                 sortRec.setString(tmpBytes); 
              }
              }
//  AT END
                  if (isSortRecordsEnded()) { 
//  SET RECORDS-ENDED TO TRUE
                      work.setRecordsEndedTrue(); 
                      
                    }
//  NOT AT END
                  if (isSortRecordsNotEnded()) { 
//  MOVE SORT-RDW TO WS-SORT-OUT-REC-LEN
                      work.setSortOutRecLen(work.getSortRdw());
//  MOVE SORT-REC (1 : SORT-RDW ) TO OUT-RECORD (1 : WS-SORT-OUT-REC-LEN )
                      outRecord.replace(sortRec,0,(int) work.getSortRdw(),0,(int) work.getSortOutRecLen() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  WRITE OUT-RECORD
                      sortOut.setRecord(substring(outRecord.toCharArray(),0,(int) work.getSortOutRecLen()));
                      sortOut.write((int) work.getSortOutRecLen()); 
                      work.setSortOutStatus(sortOut.getStatusString() );
                    }
          }
          ;
      
      }
      /**
      * sortSys004 
      *   This method is derived from 
  *   COBOL Paragraph - 2000-SORT-SYS004 COBOL Cyclomatic complexity - 5
      * Input  : None 

      * Output :  

      * - sys002Status                   COBOL Name: WS-SYS002-STATUS
      * - sys004Status                   COBOL Name: WS-SYS004-STATUS
      * - sys005Status                   COBOL Name: WS-SYS005-STATUS
      * - sortOutStatus                  COBOL Name: WS-SORT-OUT-STATUS
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      private void sortSys004() throws Exception {
			// Declare local variables used in the method
			char[] sys004Status = null;
			char[] sortOutStatus = null;
			SortRec4 sortRec4 = sortRec.getSortRec4();
			// End of variable declaration

      
// *----------------------------------
//  OPEN INPUT SYS004-IPM-PARM-MASTER
          sys004IpmParmMaster.open(new String(CONSTANTS.MODE_READ_ONLY_36242),sys004IpmParmMaster.getFileName(),sys004IpmParmMaster.getSys004IpmParmMasterCharSet(),sys004IpmParmMaster.getSys004IpmParmMasterCrlfFlag());
          work.setSys004Status(sys004IpmParmMaster.getStatusString() );

// *
          sys004Status = work.getSys004Status();
//  IF NOT ( WS-SYS004-STATUS = '00' )
//  LITERAL_00 = '00'
          if ((		compareChars(sys004Status,CONSTANTS.LITERAL_00) != 0 )) { 
//  DISPLAY 'OPEN SYS004 ERROR ' WS-SYS004-STATUS
              logger.info("OPEN SYS004 ERROR {}", new String(work.getSys004Status())); 
//  DISPLAY 'MCSORT02 ABENDED '
              logger.info("MCSORT02 ABENDED "); 
              // MOVE 12 TO RETURN-CODE
              this.setRc( 12);
//  GOBACK
              setNotLogged(false); // no need to log, it is a normal termination
              this.setProgramEnded(true);
              return ;
          }
  

// *

// *
//  OPEN OUTPUT SORT-OUT
          sortOut.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),sortOut.getFileName(),sortOut.getSortOutCharSet(),sortOut.getSortOutCrlfFlag());
          work.setSortOutStatus(sortOut.getStatusString() );
          sortOutStatus = work.getSortOutStatus();
//  IF NOT ( WS-SORT-OUT-STATUS = '00' )
//  LITERAL_00 = '00'
          if ((		compareChars(sortOutStatus,CONSTANTS.LITERAL_00) != 0 )) { 
//  DISPLAY 'OPEN SORT-OUT ERROR ' WS-SORT-OUT-STATUS
              logger.info("OPEN SORT-OUT ERROR {}", new String(work.getSortOutStatus())); 
//  DISPLAY 'MCSORT02 ABENDED '
              logger.info("MCSORT02 ABENDED "); 
              // MOVE 12 TO RETURN-CODE
              this.setRc( 12);
//  GOBACK
              setNotLogged(false); // no need to log, it is a normal termination
              this.setProgramEnded(true);
              return ;
          }
  

// *
//  SORT SORT-FILE ON ASCENDING KEY SORT4-TABLE-ID ASCENDING KEY SORT4-KEY DESCENDING KEY SORT4-TABLE-EFF-DATE COLLATING SEQUENCE IS EBCDIC INPUT PROCEDURE IS 2001-FORMAT-SORT-REC OUTPUT PROCEDURE IS 2002-FORMAT-OP-REC
          try {
               //SORT sortFileInternIn input procedure temp file opened in write mode
               sortFileInternIn.open("w", sortFileInternIn.getFileName(), sortFileInternIn.getSortFileInternInCharSet(),sortFileInternIn.getSortFileInternInCrlfFlag());
             sortRecKeys = new ArrayList<>();
             doSortPresets();
              sortKeysCaseId = 2;
                formatSortRec2001();
              if(sortFileInternIn.hasOpened()) {
                 sortFileInternIn.close();
              }
              if(useSortFileStrategy()) {
              	// implement code here
                   sortDecider.setInFileDetails(sortFileInternIn.getAccessFileName(sortFileInternIn.getFileName()),sortFileInternIn.getRecLen(),sortFileInternIn.isFixedBlock());
                   sortDecider.setOutFileName(sortFileInternOut.getAccessFileName(sortFileInternOut.getFileName()),sortFileInternOut.getRecLen());
          		 SortProperties sortProperties = new SortProperties();
          		 // SORT key information
                   sortDecider.addSortKeysInfo("SORT4TABLEID"/*name*/,SORT4TABLEID_OFFSET + 4/*pos*/,SORT4TABLEID_LENGTH/*len*/,false/*descending*/,"CH"/*type*/,sortProperties);
                   sortDecider.addSortKeysInfo("SORT4KEY"/*name*/,SORT4KEY_OFFSET + 4/*pos*/,SORT4KEY_LENGTH/*len*/,false/*descending*/,"CH"/*type*/,sortProperties);
                   sortDecider.addSortKeysInfo("SORT4TABLEEFFDATE"/*name*/,SORT4TABLEEFFDATE_OFFSET + 4/*pos*/,SORT4TABLEEFFDATE_LENGTH/*len*/,true/*descending*/,"CH"/*type*/,sortProperties);
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
          		 sortFileInternOut.open("r", sortFileInternOut.getFileName(), sortFileInternOut.getSortFileInternOutCharSet(),sortFileInternOut.getSortFileInternOutCrlfFlag());
              } else {
              sortComp = SortTableIdKeys.getSort4TableIdComparator(true/*isAscending*/)
                .thenComparing(SortTableIdKeys.getSort4KeyComparator(true/*isAscending*/))
                .thenComparing(SortTableIdKeys.getSort4TableEffDateComparator(false/*isAscending*/));
          
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
                formatOpRec2002();
               if(sortFileInternOut.hasOpened()) {
          	    sortFileInternOut.close(); 
               }
          } catch(Exception e) {
              logger.error("",e);
          } finally {
              removeTempFile();
              sortRecKeys.clear();
              removeInternFile();
          }
  

// *

// *
//  CLOSE SYS004-IPM-PARM-MASTER SORT-OUT
          sys004IpmParmMaster.close(); 
          work.setSys004Status(sys004IpmParmMaster.getStatusString() );
          sortOut.close(); 
          work.setSortOutStatus(sortOut.getStatusString() );
      
      }
      /**
      * formatSortRec2001 
      *   This method is derived from 
  *   COBOL Paragraph - 2001-FORMAT-SORT-REC COBOL Cyclomatic complexity - 2
      * Input  : None 

      * Output :  

      * - eofFlag                        COBOL Name: EOF-FLAG
      * - sys004IpmParmMasterRecord      COBOL Name: SYS004-IPM-PARM-MASTER-RECORD
      * - sys004Status                   COBOL Name: WS-SYS004-STATUS
      * - ipmRdw410                      COBOL Name: 410-IPM-RDW
      * - sortRdw                        COBOL Name: SORT-RDW
      * - sortRec                        COBOL Name: SORT-REC
      *
      * @throws CFException
      */
      private void formatSortRec2001() throws Exception {
      
// *

// *
//  MOVE SPACE TO EOF-FLAG
          work.setEofFlag(CONSTANTS.SPACE);
//  PERFORM UNTIL EOF-INPUT
          while ((!(work.isEofInput()) )) {
//  READ SYS004-IPM-PARM-MASTER
              	sys004IpmParmMaster.read();
              work.setIpmRdw410(sys004IpmParmMaster.getRecLen());
              work.setSys004Status(sys004IpmParmMaster.getStatusString() );
              if (!sys004IpmParmMaster.hasEnded()) {
              	sys004IpmParmMasterRecord.setString(sys004IpmParmMaster.getRecord());
              }
//  AT END
              if (sys004IpmParmMaster.hasEnded()) {  
//  SET EOF-INPUT TO TRUE
                  work.setEofInputTrue(); 
                  
                }
//  NOT AT END
              else  {
//  MOVE 410-IPM-RDW TO SORT-RDW
                  work.setSortRdw(work.getIpmRdw410());
//  MOVE SYS004-IPM-PARM-MASTER-RECORD (1 : 410-IPM-RDW ) TO SORT-REC (1 : SORT-RDW )
                  sortRec.replace(sys004IpmParmMasterRecord,0,(int) work.getIpmRdw410(),0,(int) work.getSortRdw() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  RELEASE SORT-REC
                  if(useSortFileStrategy()) {
                  sortFileInternIn.write(sortRec.toCharArray(),(int) work.getSortRdw());
                  } else
                    addReleaseRecord(sortRec.toCharArray(),(int) work.getSortRdw());
                }
          }
          ;
      
      }
      /**
      * formatOpRec2002 
      *   This method is derived from 
  *   COBOL Paragraph - 2002-FORMAT-OP-REC COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sortRdw                        COBOL Name: SORT-RDW
      * - sortRec                        COBOL Name: SORT-REC
      *
      * Output :  

      * - noRecords                      COBOL Name: NO-RECORDS
      * - sortOutRecLen                  COBOL Name: WS-SORT-OUT-REC-LEN
      * - sortRdw                        COBOL Name: SORT-RDW
      * - outRecord                      COBOL Name: OUT-RECORD
      * - sortRec                        COBOL Name: SORT-REC
      * - sortOutStatus                  COBOL Name: WS-SORT-OUT-STATUS
      *
      * @throws CFException
      */
      private void formatOpRec2002() throws Exception {
      
// *

// *
//  MOVE SPACES TO NO-RECORDS
          work.setNoRecords(CONSTANTS.SPACE);
//  PERFORM UNTIL RECORDS-ENDED
          while ((!(work.isRecordsEnded()) )) {
//  RETURN SORT-FILE RECORD
                    if(useSortFileStrategy()) {
                      sortFileInternOut.read();
                      if (!sortFileInternOut.hasEnded()) {
                      	sortRec.setString(sortFileInternOut.getRecord());
                      	work.setSortRdw(sortFileInternOut.getRecord().length); //for VB
                      }    
                  } else {
              setRecIndex(getRecIndex()+1);
              if (getRecIndex() < sortRecKeys.size() ) { 
                 byte[] tmpBytes = getReturnRecord(getRecIndex());
                 work.setSortRdw(tmpBytes.length);
                 sortRec.setString(tmpBytes); 
              }
              }
//  AT END
                  if (isSortRecordsEnded()) { 
//  SET RECORDS-ENDED TO TRUE
                      work.setRecordsEndedTrue(); 
                      
                    }
//  NOT AT END
                  if (isSortRecordsNotEnded()) { 
//  MOVE SORT-RDW TO WS-SORT-OUT-REC-LEN
                      work.setSortOutRecLen(work.getSortRdw());
//  MOVE SORT-REC (1 : SORT-RDW ) TO OUT-RECORD (1 : WS-SORT-OUT-REC-LEN )
                      outRecord.replace(sortRec,0,(int) work.getSortRdw(),0,(int) work.getSortOutRecLen() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  WRITE OUT-RECORD
                      sortOut.setRecord(substring(outRecord.toCharArray(),0,(int) work.getSortOutRecLen()));
                      sortOut.write((int) work.getSortOutRecLen()); 
                      work.setSortOutStatus(sortOut.getStatusString() );
                    }
          }
          ;
      
      }
      /**
      * sortSys005 
      *   This method is derived from 
  *   COBOL Paragraph - 3000-SORT-SYS005 COBOL Cyclomatic complexity - 5
      * Input  : None 

      * Output :  

      * - sys002Status                   COBOL Name: WS-SYS002-STATUS
      * - sys004Status                   COBOL Name: WS-SYS004-STATUS
      * - sys005Status                   COBOL Name: WS-SYS005-STATUS
      * - sortOutStatus                  COBOL Name: WS-SORT-OUT-STATUS
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      private void sortSys005() throws Exception {
			// Declare local variables used in the method
			char[] sys005Status = null;
			char[] sortOutStatus = null;
			SortRec5 sortRec5 = sortRec.getSortRec5();
			// End of variable declaration

      
// *
// *----------------------------------
//  OPEN INPUT SYS005-IPM-PARM-MASTER
          sys005IpmParmMaster.open(new String(CONSTANTS.MODE_READ_ONLY_36242),sys005IpmParmMaster.getFileName(),sys005IpmParmMaster.getSys005IpmParmMasterCharSet(),sys005IpmParmMaster.getSys005IpmParmMasterCrlfFlag());
          work.setSys005Status(sys005IpmParmMaster.getStatusString() );

// *
          sys005Status = work.getSys005Status();
//  IF NOT ( WS-SYS005-STATUS = '00' )
//  LITERAL_00 = '00'
          if ((		compareChars(sys005Status,CONSTANTS.LITERAL_00) != 0 )) { 
//  DISPLAY 'OPEN SYS005 ERROR ' WS-SYS005-STATUS
              logger.info("OPEN SYS005 ERROR {}", new String(work.getSys005Status())); 
//  DISPLAY 'MCSORT02 ABENDED '
              logger.info("MCSORT02 ABENDED "); 
              // MOVE 12 TO RETURN-CODE
              this.setRc( 12);
//  GOBACK
              setNotLogged(false); // no need to log, it is a normal termination
              this.setProgramEnded(true);
              return ;
          }
  

// *

// *
//  OPEN OUTPUT SORT-OUT
          sortOut.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),sortOut.getFileName(),sortOut.getSortOutCharSet(),sortOut.getSortOutCrlfFlag());
          work.setSortOutStatus(sortOut.getStatusString() );
          sortOutStatus = work.getSortOutStatus();
//  IF NOT ( WS-SORT-OUT-STATUS = '00' )
//  LITERAL_00 = '00'
          if ((		compareChars(sortOutStatus,CONSTANTS.LITERAL_00) != 0 )) { 
//  DISPLAY 'OPEN SORT-OUT ERROR ' WS-SORT-OUT-STATUS
              logger.info("OPEN SORT-OUT ERROR {}", new String(work.getSortOutStatus())); 
//  DISPLAY 'MCSORT02 ABENDED '
              logger.info("MCSORT02 ABENDED "); 
              // MOVE 12 TO RETURN-CODE
              this.setRc( 12);
//  GOBACK
              setNotLogged(false); // no need to log, it is a normal termination
              this.setProgramEnded(true);
              return ;
          }
  

// *
//  SORT SORT-FILE ON ASCENDING KEY SORT5-TABLE-ID ASCENDING KEY SORT5-KEY ASCENDING KEY SORT5-TABLE-EFF-DATE COLLATING SEQUENCE IS EBCDIC INPUT PROCEDURE IS 3001-FORMAT-SORT-REC OUTPUT PROCEDURE IS 3002-FORMAT-OP-REC
          try {
               //SORT sortFileInternIn input procedure temp file opened in write mode
               sortFileInternIn.open("w", sortFileInternIn.getFileName(), sortFileInternIn.getSortFileInternInCharSet(),sortFileInternIn.getSortFileInternInCrlfFlag());
             sortRecKeys = new ArrayList<>();
             doSortPresets();
              sortKeysCaseId = 3;
                formatSortRec3001();
              if(sortFileInternIn.hasOpened()) {
                 sortFileInternIn.close();
              }
              if(useSortFileStrategy()) {
              	// implement code here
                   sortDecider.setInFileDetails(sortFileInternIn.getAccessFileName(sortFileInternIn.getFileName()),sortFileInternIn.getRecLen(),sortFileInternIn.isFixedBlock());
                   sortDecider.setOutFileName(sortFileInternOut.getAccessFileName(sortFileInternOut.getFileName()),sortFileInternOut.getRecLen());
          		 SortProperties sortProperties = new SortProperties();
          		 // SORT key information
                   sortDecider.addSortKeysInfo("SORT5TABLEID"/*name*/,SORT5TABLEID_OFFSET + 4/*pos*/,SORT5TABLEID_LENGTH/*len*/,false/*descending*/,"CH"/*type*/,sortProperties);
                   sortDecider.addSortKeysInfo("SORT5KEY"/*name*/,SORT5KEY_OFFSET + 4/*pos*/,SORT5KEY_LENGTH/*len*/,false/*descending*/,"CH"/*type*/,sortProperties);
                   sortDecider.addSortKeysInfo("SORT5TABLEEFFDATE"/*name*/,SORT5TABLEEFFDATE_OFFSET + 4/*pos*/,SORT5TABLEEFFDATE_LENGTH/*len*/,false/*descending*/,"CH"/*type*/,sortProperties);
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
          		 sortFileInternOut.open("r", sortFileInternOut.getFileName(), sortFileInternOut.getSortFileInternOutCharSet(),sortFileInternOut.getSortFileInternOutCrlfFlag());
              } else {
              sortComp = SortTableIdKeys.getSort5TableIdComparator(true/*isAscending*/)
                .thenComparing(SortTableIdKeys.getSort5KeyComparator(true/*isAscending*/))
                .thenComparing(SortTableIdKeys.getSort5TableEffDateComparator(true/*isAscending*/));
          
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
                formatOpRec3002();
               if(sortFileInternOut.hasOpened()) {
          	    sortFileInternOut.close(); 
               }
          } catch(Exception e) {
              logger.error("",e);
          } finally {
              removeTempFile();
              sortRecKeys.clear();
              removeInternFile();
          }
  

// *

// *
//  CLOSE SYS005-IPM-PARM-MASTER SORT-OUT
          sys005IpmParmMaster.close(); 
          work.setSys005Status(sys005IpmParmMaster.getStatusString() );
          sortOut.close(); 
          work.setSortOutStatus(sortOut.getStatusString() );
      
      }
      /**
      * formatSortRec3001 
      *   This method is derived from 
  *   COBOL Paragraph - 3001-FORMAT-SORT-REC COBOL Cyclomatic complexity - 2
      * Input  : None 

      * Output :  

      * - eofFlag                        COBOL Name: EOF-FLAG
      * - sys005IpmParmMasterRecord      COBOL Name: SYS005-IPM-PARM-MASTER-RECORD
      * - sys005Status                   COBOL Name: WS-SYS005-STATUS
      * - ipmRdw410                      COBOL Name: 410-IPM-RDW
      * - sortRdw                        COBOL Name: SORT-RDW
      * - sortRec                        COBOL Name: SORT-REC
      *
      * @throws CFException
      */
      private void formatSortRec3001() throws Exception {
      
// *

// *
//  MOVE SPACE TO EOF-FLAG
          work.setEofFlag(CONSTANTS.SPACE);
//  PERFORM UNTIL EOF-INPUT
          while ((!(work.isEofInput()) )) {
//  READ SYS005-IPM-PARM-MASTER
              	sys005IpmParmMaster.read();
              work.setIpmRdw410(sys005IpmParmMaster.getRecLen());
              work.setSys005Status(sys005IpmParmMaster.getStatusString() );
              if (!sys005IpmParmMaster.hasEnded()) {
              	sys005IpmParmMasterRecord.setString(sys005IpmParmMaster.getRecord());
              }
//  AT END
              if (sys005IpmParmMaster.hasEnded()) {  
//  SET EOF-INPUT TO TRUE
                  work.setEofInputTrue(); 
                  
                }
//  NOT AT END
              else  {
//  MOVE 410-IPM-RDW TO SORT-RDW
                  work.setSortRdw(work.getIpmRdw410());
//  MOVE SYS005-IPM-PARM-MASTER-RECORD (1 : 410-IPM-RDW ) TO SORT-REC (1 : SORT-RDW )
                  sortRec.replace(sys005IpmParmMasterRecord,0,(int) work.getIpmRdw410(),0,(int) work.getSortRdw() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  RELEASE SORT-REC
                  if(useSortFileStrategy()) {
                  sortFileInternIn.write(sortRec.toCharArray(),(int) work.getSortRdw());
                  } else
                    addReleaseRecord(sortRec.toCharArray(),(int) work.getSortRdw());
                }
          }
          ;
      
      }
      /**
      * formatOpRec3002 
      *   This method is derived from 
  *   COBOL Paragraph - 3002-FORMAT-OP-REC COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sortRdw                        COBOL Name: SORT-RDW
      * - sortRec                        COBOL Name: SORT-REC
      *
      * Output :  

      * - noRecords                      COBOL Name: NO-RECORDS
      * - sortOutRecLen                  COBOL Name: WS-SORT-OUT-REC-LEN
      * - sortRdw                        COBOL Name: SORT-RDW
      * - outRecord                      COBOL Name: OUT-RECORD
      * - sortRec                        COBOL Name: SORT-REC
      * - sortOutStatus                  COBOL Name: WS-SORT-OUT-STATUS
      *
      * @throws CFException
      */
      private void formatOpRec3002() throws Exception {
      
// *

// *
//  MOVE SPACES TO NO-RECORDS
          work.setNoRecords(CONSTANTS.SPACE);
//  PERFORM UNTIL RECORDS-ENDED
          while ((!(work.isRecordsEnded()) )) {
//  RETURN SORT-FILE RECORD
                    if(useSortFileStrategy()) {
                      sortFileInternOut.read();
                      if (!sortFileInternOut.hasEnded()) {
                      	sortRec.setString(sortFileInternOut.getRecord());
                      	work.setSortRdw(sortFileInternOut.getRecord().length); //for VB
                      }    
                  } else {
              setRecIndex(getRecIndex()+1);
              if (getRecIndex() < sortRecKeys.size() ) { 
                 byte[] tmpBytes = getReturnRecord(getRecIndex());
                 work.setSortRdw(tmpBytes.length);
                 sortRec.setString(tmpBytes); 
              }
              }
//  AT END
                  if (isSortRecordsEnded()) { 
//  SET RECORDS-ENDED TO TRUE
                      work.setRecordsEndedTrue(); 
                      
                    }
//  NOT AT END
                  if (isSortRecordsNotEnded()) { 
//  MOVE SORT-RDW TO WS-SORT-OUT-REC-LEN
                      work.setSortOutRecLen(work.getSortRdw());
//  MOVE SORT-REC (1 : SORT-RDW ) TO OUT-RECORD (1 : WS-SORT-OUT-REC-LEN )
                      outRecord.replace(sortRec,0,(int) work.getSortRdw(),0,(int) work.getSortOutRecLen() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  WRITE OUT-RECORD
                      sortOut.setRecord(substring(outRecord.toCharArray(),0,(int) work.getSortOutRecLen()));
                      sortOut.write((int) work.getSortOutRecLen()); 
                      work.setSortOutStatus(sortOut.getStatusString() );
                    }
          }
          ;
      
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
  
  
      /**
       * Method is used to collect SortTableId sort keys 
       * from each record to perform COBOL sort statement. 
       *  
       * @param record
       * @param recLen    
       */
      public void addReleaseRecord(char[] record, int recLen) throws Exception {
      	if(recLen > record.length)  recLen = record.length;
      	SortTableIdKeys relKey = new SortTableIdKeys();
      	switch (sortKeysCaseId) {
              case 1:{
                  char[] keySortTableId = new char[SORTTABLEID_LENGTH];
    System.arraycopy(record,SORTTABLEID_OFFSET,keySortTableId,0,SORTTABLEID_LENGTH);
    relKey.setSortTableId(convertChar2EbcdicBytes(keySortTableId)); 
                  char[] keySortTableEffDate = new char[SORTTABLEEFFDATE_LENGTH];
    System.arraycopy(record,SORTTABLEEFFDATE_OFFSET,keySortTableEffDate,0,SORTTABLEEFFDATE_LENGTH);
    relKey.setSortTableEffDate(convertChar2EbcdicBytes(keySortTableEffDate)); 
                  char[] keySortTableKeyData = new char[SORTTABLEKEYDATA_LENGTH];
    System.arraycopy(record,SORTTABLEKEYDATA_OFFSET,keySortTableKeyData,0,SORTTABLEKEYDATA_LENGTH);
    relKey.setSortTableKeyData(convertChar2EbcdicBytes(keySortTableKeyData)); 
              }   break; 
              case 2:{  
                  char[] keySort4TableId = new char[SORT4TABLEID_LENGTH];
    System.arraycopy(record,SORT4TABLEID_OFFSET,keySort4TableId,0,SORT4TABLEID_LENGTH);
    relKey.setSort4TableId(convertChar2EbcdicBytes(keySort4TableId)); 
                  char[] keySort4Key = new char[SORT4KEY_LENGTH];
    System.arraycopy(record,SORT4KEY_OFFSET,keySort4Key,0,SORT4KEY_LENGTH);
    relKey.setSort4Key(convertChar2EbcdicBytes(keySort4Key)); 
                  char[] keySort4TableEffDate = new char[SORT4TABLEEFFDATE_LENGTH];
    System.arraycopy(record,SORT4TABLEEFFDATE_OFFSET,keySort4TableEffDate,0,SORT4TABLEEFFDATE_LENGTH);
    relKey.setSort4TableEffDate(convertChar2EbcdicBytes(keySort4TableEffDate)); 
              }   break; 
              case 3:{  
                  char[] keySort5TableId = new char[SORT5TABLEID_LENGTH];
    System.arraycopy(record,SORT5TABLEID_OFFSET,keySort5TableId,0,SORT5TABLEID_LENGTH);
    relKey.setSort5TableId(convertChar2EbcdicBytes(keySort5TableId)); 
                  char[] keySort5Key = new char[SORT5KEY_LENGTH];
    System.arraycopy(record,SORT5KEY_OFFSET,keySort5Key,0,SORT5KEY_LENGTH);
    relKey.setSort5Key(convertChar2EbcdicBytes(keySort5Key)); 
                  char[] keySort5TableEffDate = new char[SORT5TABLEEFFDATE_LENGTH];
    System.arraycopy(record,SORT5TABLEEFFDATE_OFFSET,keySort5TableEffDate,0,SORT5TABLEEFFDATE_LENGTH);
    relKey.setSort5TableEffDate(convertChar2EbcdicBytes(keySort5TableEffDate)); 
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
       * Method is used to return sorted records using SortTableIdKeys object.
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
      		SortTableIdKeys k = sortRecKeys.get(index);
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
            return (sortFileInternOut.hasEnded());
          }
      	return (sortRecKeys.size() <= getRecIndex());
      }
      
      /**
        * Sort record array has not ended or sort-return code has not modified
        * @return boolean flag
        */
      private boolean isSortRecordsNotEnded() {
          if(useSortFileStrategy()) {
            return (!sortFileInternOut.hasEnded());
          }
      	return (sortRecKeys.size()>getRecIndex());
      
      }
  
  
  
  
  }
