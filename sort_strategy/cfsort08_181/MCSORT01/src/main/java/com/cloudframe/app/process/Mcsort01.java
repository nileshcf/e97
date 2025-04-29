  package com.cloudframe.app.process;
  /* 
*
*/
  
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.mcsort01.file.*;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.mcsort01.file.records.Sort5TableIdKeys;
  import java.util.List;
  import java.util.ArrayList;
  import java.util.Comparator;
  import java.util.stream.Collectors;
  import com.cloudframe.app.mcsort01.file.records.SortRec5;
  import com.cloudframe.app.mcsort01.dto.*;
  import com.cloudframe.app.mcsort01.file.records.SortRec;
  import com.cloudframe.app.mcsort01.file.records.InRecord;
  import com.cloudframe.app.mcsort01.file.records.OutRecord;
  import com.cloudframe.app.global.sharedvar.Ip500041OneDayRecLthGroup;
  import com.cloudframe.app.global.sharedvar.Ip500041OneDayRec;
  import com.cloudframe.app.global.sharedvar.Ip500041ReadTableIdGroup;
  import com.cloudframe.app.global.sharedvar.Ip500041OneDayReadStatusGroup;
  import com.cloudframe.app.mcsort01.dto.SortKeyLthTable700;
  import com.cloudframe.app.mcsort01.dto.Work;
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
  
  @Component("mcsort01")
  
  public class Mcsort01 extends CommonProcess implements InitializingBean, DisposableBean {
  
  Logger logger = LoggerFactory.getLogger(Mcsort01.class);
  
  private SortRec sortRec = new SortRec() ;
  private InRecord inRecord = new InRecord() ;
  private OutRecord outRecord = new OutRecord() ;
  private SortKeyLthTable700 sortKeyLthTable700 = new SortKeyLthTable700() ;
  private Work work = new Work() ;
  
  
  
  @Autowired 
  @Qualifier("mcsort01_sortIn")
  SortIn sortIn;
  @Autowired 
  @Qualifier("mcsort01_sortOut")
  SortOut sortOut;
  @Autowired 
  @Qualifier("mcsort01_sortFileInternIn")
  SortFileInternIn sortFileInternIn;
  @Autowired 
  @Qualifier("mcsort01_sortFileInternOut")
  SortFileInternOut sortFileInternOut;
  @Autowired 
  @Qualifier("global_ip500041OneDayRecLthGroup")
  Ip500041OneDayRecLthGroup ip500041OneDayRecLthGroup;
  @Autowired 
  @Qualifier("global_ip500041OneDayRec")
  Ip500041OneDayRec ip500041OneDayRec;
  @Autowired 
  @Qualifier("global_ip500041ReadTableIdGroup")
  Ip500041ReadTableIdGroup ip500041ReadTableIdGroup;
  @Autowired 
  @Qualifier("global_ip500041OneDayReadStatusGroup")
  Ip500041OneDayReadStatusGroup ip500041OneDayReadStatusGroup;
  
  @Autowired
  @Lazy
  SortStrategyDecider sortDecider;
  
  SortPathStrategy sortProcesser;
  
  @Value("${cf.sort.using.file.strategy:no}")
  private String usingSortFileStrategy;  
  
  @Value("${cf.sort.useTempFile:yes}")
  private String useTempFile;
  
  
  private static final int SORT5TABLEID_OFFSET = 0;
  private static final int SORT5TABLEID_LENGTH = 8;
  private static final int SORT5KEY_OFFSET = 8;
  private static final int SORT5KEY_LENGTH = 99;
  private static final int SORT5TABLEEFFDATE_OFFSET = 107;
  private static final int SORT5TABLEEFFDATE_LENGTH = 10;
  private List<Sort5TableIdKeys> sortRecKeys = new ArrayList<>();
  private Comparator<Sort5TableIdKeys> sortComp = null;
  
  
  
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

      * Output :  

      * - sortInStatus                   COBOL Name: WS-SORT-IN-STATUS
      * - sortOutStatus                  COBOL Name: WS-SORT-OUT-STATUS
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public int process() throws Exception {
       initVars();
			// Declare local variables used in the method
			char[] sortInStatus = null;
			char[] sortOutStatus = null;
			SortRec5 sortRec5 = sortRec.getSortRec5();
			// End of variable declaration

       try {
       setCodePage("1047");

// *

// *
//  OPEN INPUT SORT-IN
          sortIn.open(new String(CONSTANTS.MODE_READ_ONLY_36242),sortIn.getFileName(),sortIn.getSortInCharSet(),sortIn.getSortInCrlfFlag());
          work.setSortInStatus(sortIn.getStatusString() );
          sortInStatus = work.getSortInStatus();
//  IF NOT ( WS-SORT-IN-STATUS = '00' )
//  LITERAL_00 = '00'
          if ((		compareChars(sortInStatus,CONSTANTS.LITERAL_00) != 0 )) { 
//  DISPLAY 'OPEN SORT-IN ERROR ' WS-SORT-IN-STATUS
              logger.info("OPEN SORT-IN ERROR {}", new String(work.getSortInStatus())); 
//  DISPLAY 'MC028 ABENDED '
              logger.info("MC028 ABENDED "); 
              // MOVE 12 TO RETURN-CODE
              this.setRc( 12);
//  GOBACK
              setNotLogged(false); // no need to log, it is a normal termination
              this.setProgramEnded(true);
              return getRc();
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
//  DISPLAY 'MC028 ABENDED '
              logger.info("MC028 ABENDED "); 
              // MOVE 12 TO RETURN-CODE
              this.setRc( 12);
//  GOBACK
              setNotLogged(false); // no need to log, it is a normal termination
              this.setProgramEnded(true);
              return getRc();
          }
  

// *
//  SORT SORT-FILE ON ASCENDING KEY SORT5-TABLE-ID ASCENDING KEY SORT5-KEY DESCENDING KEY SORT5-TABLE-EFF-DATE COLLATING SEQUENCE IS EBCDIC INPUT PROCEDURE IS 6100-FORMAT-SORT-REC OUTPUT PROCEDURE IS 6500-FORMAT-OP-REC
          try {
               //SORT sortFileInternIn input procedure temp file opened in write mode
               sortFileInternIn.open("w", sortFileInternIn.getFileName(), sortFileInternIn.getSortFileInternInCharSet(),sortFileInternIn.getSortFileInternInCrlfFlag());
             sortRecKeys = new ArrayList<>();
             doSortPresets();
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
                   sortDecider.addSortKeysInfo("SORT5TABLEID"/*name*/,SORT5TABLEID_OFFSET + 4/*pos*/,SORT5TABLEID_LENGTH/*len*/,false/*descending*/,"CH"/*type*/,sortProperties);
                   sortDecider.addSortKeysInfo("SORT5KEY"/*name*/,SORT5KEY_OFFSET + 4/*pos*/,SORT5KEY_LENGTH/*len*/,false/*descending*/,"CH"/*type*/,sortProperties);
                   sortDecider.addSortKeysInfo("SORT5TABLEEFFDATE"/*name*/,SORT5TABLEEFFDATE_OFFSET + 4/*pos*/,SORT5TABLEEFFDATE_LENGTH/*len*/,true/*descending*/,"CH"/*type*/,sortProperties);
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
              sortComp = Sort5TableIdKeys.getSort5TableIdComparator(true/*isAscending*/)
                .thenComparing(Sort5TableIdKeys.getSort5KeyComparator(true/*isAscending*/))
                .thenComparing(Sort5TableIdKeys.getSort5TableEffDateComparator(false/*isAscending*/));
          
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

// *

// *
//  CLOSE SORT-IN SORT-OUT
          sortIn.close(); 
          work.setSortInStatus(sortIn.getStatusString() );
          sortOut.close(); 
          work.setSortOutStatus(sortOut.getStatusString() );
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          this.setProgramEnded(true);
          return getRc();
       } catch(Exception e) {
            handleErrorCode(e);
            throw e;
       }
        finally {
      		if(sortIn.hasOpened() && !sortIn.isReadOnly()) { 
      			sortIn.flush(); 
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
      }
      
      // end of process method
      }
      /**
      * formatSortRec 
      *   This method is derived from 
  *   COBOL Paragraph - 6100-FORMAT-SORT-REC COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sortInRecLen                   COBOL Name: WS-SORT-IN-REC-LEN
      *
      * Output :  

      * - eofFlag                        COBOL Name: EOF-FLAG
      * - inRecord                       COBOL Name: IN-RECORD
      * - sortInStatus                   COBOL Name: WS-SORT-IN-STATUS
      * - sortRdw                        COBOL Name: SORT-RDW
      * - sortInRecLen                   COBOL Name: WS-SORT-IN-REC-LEN
      * - sortRec                        COBOL Name: SORT-REC
      *
      * @throws CFException
      */
      private void formatSortRec() throws Exception {
//  MOVE SPACE TO EOF-FLAG
          work.setEofFlag(CONSTANTS.SPACE);
//  PERFORM UNTIL EOF-INPUT
          while ((!(work.isEofInput()) )) {
//  READ SORT-IN
              	sortIn.read();
              work.setSortInRecLen(sortIn.getRecLen());
              work.setSortInStatus(sortIn.getStatusString() );
              if (!sortIn.hasEnded()) {
              	inRecord.setString(sortIn.getRecord());
              }
//  AT END
              if (sortIn.hasEnded()) {  
//  SET EOF-INPUT TO TRUE
                  work.setEofInputTrue(); 
                  
                }
//  NOT AT END
              else  {
//  MOVE WS-SORT-IN-REC-LEN TO SORT-RDW
                  work.setSortRdw(work.getSortInRecLen());
//  MOVE IN-RECORD (1 : WS-SORT-IN-REC-LEN ) TO SORT-REC (1 : SORT-RDW )
                  sortRec.replace(inRecord,0,(int) work.getSortInRecLen(),0,(int) work.getSortRdw() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
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
  *   COBOL Paragraph - 6500-FORMAT-OP-REC COBOL Cyclomatic complexity - 2
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
       * Method is used to collect Sort5TableId sort keys 
       * from each record to perform COBOL sort statement. 
       *  
       * @param record
       * @param recLen    
       */
      public void addReleaseRecord(char[] record, int recLen) throws Exception {
      	if(recLen > record.length)  recLen = record.length;
      	Sort5TableIdKeys relKey = new Sort5TableIdKeys();
                  char[] keySort5TableId = new char[SORT5TABLEID_LENGTH];
    System.arraycopy(record,SORT5TABLEID_OFFSET,keySort5TableId,0,SORT5TABLEID_LENGTH);
    relKey.setSort5TableId(convertChar2EbcdicBytes(keySort5TableId)); 
                  char[] keySort5Key = new char[SORT5KEY_LENGTH];
    System.arraycopy(record,SORT5KEY_OFFSET,keySort5Key,0,SORT5KEY_LENGTH);
    relKey.setSort5Key(convertChar2EbcdicBytes(keySort5Key)); 
                  char[] keySort5TableEffDate = new char[SORT5TABLEEFFDATE_LENGTH];
    System.arraycopy(record,SORT5TABLEEFFDATE_OFFSET,keySort5TableEffDate,0,SORT5TABLEEFFDATE_LENGTH);
    relKey.setSort5TableEffDate(convertChar2EbcdicBytes(keySort5TableEffDate)); 
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
       * Method is used to return sorted records using Sort5TableIdKeys object.
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
      		Sort5TableIdKeys k = sortRecKeys.get(index);
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
