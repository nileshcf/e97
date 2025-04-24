  package com.cloudframe.app.process.impl;
  /* 
*
*/
  
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.mcsort01.file.*;
  import com.cloudframe.app.mcsort01.Mcsort01Ctx.*;
  import com.cloudframe.app.mcsort01.Mcsort01Ctx;
  import com.cloudframe.app.process.Mcsort01;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.mcsort01.file.records.Sort5TableIdKeys;
  import java.util.List;
  import java.util.ArrayList;
  import java.util.Comparator;
  import java.util.stream.Collectors;
  import com.cloudframe.app.mcsort01.dto.*;
  import com.cloudframe.app.mcsort01.file.records.OutRecord;
  import com.cloudframe.app.mcsort01.file.records.InRecord;
  import com.cloudframe.app.mcsort01.file.records.SortRec;
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
  
  public class Mcsort01Impl extends CommonProcess implements Mcsort01, InitializingBean, DisposableBean {
  
  Logger logger = LoggerFactory.getLogger(Mcsort01Impl.class);
  
  
  
  
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
      public int process(Mcsort01Ctx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
ProcessInCtx methodIn = programCtx.getProcessInCtx();
ProcessOutCtx methodOut = methodIn.getProcessOutCtx();

// *

// *
//  OPEN INPUT SORT-IN
          sortIn.open(new String(CONSTANTS.MODE_READ_ONLY_36242),sortIn.getFileName(),sortIn.getSortInCharSet(),sortIn.getSortInCrlfFlag());
          methodOut.setSortInStatus(sortIn.getStatusString() );
//  IF NOT ( WS-SORT-IN-STATUS = '00' )
//  LITERAL_00 = '00'
          if ((		compareChars(methodOut.getSortInStatus(),CONSTANTS.LITERAL_00) != 0 )) { 
//  DISPLAY 'OPEN SORT-IN ERROR ' WS-SORT-IN-STATUS
              logger.info("OPEN SORT-IN ERROR {}", new String(methodOut.getSortInStatus())); 
//  DISPLAY 'MC028 ABENDED '
              logger.info("MC028 ABENDED "); 
              // MOVE 12 TO RETURN-CODE
              programCtx.setRc( 12);
//  GOBACK
              setNotLogged(false); // no need to log, it is a normal termination
              programCtx.setProgramEnded(true);
              return programCtx.getRc();
          }

// *

// *
//  OPEN OUTPUT SORT-OUT
          sortOut.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),sortOut.getFileName(),sortOut.getSortOutCharSet(),sortOut.getSortOutCrlfFlag());
          methodOut.setSortOutStatus(sortOut.getStatusString() );
//  IF NOT ( WS-SORT-OUT-STATUS = '00' )
//  LITERAL_00 = '00'
          if ((		compareChars(methodOut.getSortOutStatus(),CONSTANTS.LITERAL_00) != 0 )) { 
//  DISPLAY 'OPEN SORT-OUT ERROR ' WS-SORT-OUT-STATUS
              logger.info("OPEN SORT-OUT ERROR {}", new String(methodOut.getSortOutStatus())); 
//  DISPLAY 'MC028 ABENDED '
              logger.info("MC028 ABENDED "); 
              // MOVE 12 TO RETURN-CODE
              programCtx.setRc( 12);
//  GOBACK
              setNotLogged(false); // no need to log, it is a normal termination
              programCtx.setProgramEnded(true);
              return programCtx.getRc();
          }

// *
//  SORT SORT-FILE ON ASCENDING KEY SORT5-TABLE-ID ASCENDING KEY SORT5-KEY DESCENDING KEY SORT5-TABLE-EFF-DATE COLLATING SEQUENCE IS EBCDIC INPUT PROCEDURE IS 6100-FORMAT-SORT-REC OUTPUT PROCEDURE IS 6500-FORMAT-OP-REC
          try {
               //SORT sortFileInternIn input procedure temp file opened in write mode
               sortFileInternIn.open("w", sortFileInternIn.getFileName(), sortFileInternIn.getSortFileInternInCharSet(),sortFileInternIn.getSortFileInternInCrlfFlag());
             sortRecKeys = new ArrayList<>();
             doSortPresets();
                formatSortRec(programCtx.getFormatSortRecInCtx());
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
                formatOpRec(programCtx.getFormatOpRecInCtx());
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
          methodOut.setSortInStatus(sortIn.getStatusString() );
          sortOut.close(); 
          methodOut.setSortOutStatus(sortOut.getStatusString() );
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return programCtx.getRc();
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
      @Override
      public FormatSortRecOutCtx formatSortRec(FormatSortRecInCtx methodIn) throws Exception {
Mcsort01Ctx programCtx = methodIn.getMcsort01Ctx();
FormatSortRecOutCtx methodOut = methodIn.getFormatSortRecOutCtx();
//  MOVE SPACE TO EOF-FLAG
          methodOut.setEofFlag(CONSTANTS.SPACE);
//  PERFORM UNTIL EOF-INPUT
          while ((!(methodOut.isEofInput()) )) {
//  READ SORT-IN
              	sortIn.read();
              methodOut.setSortInRecLen(sortIn.getRecLen());
              methodOut.setSortInStatus(sortIn.getStatusString() );
              if (!sortIn.hasEnded()) {
              	methodOut.getInRecord().setString(sortIn.getRecord());
              }
//  AT END
              if (sortIn.hasEnded()) {  
//  SET EOF-INPUT TO TRUE
                  methodOut.setEofInputTrue(); 
                  
                }
//  NOT AT END
              else  {
//  MOVE WS-SORT-IN-REC-LEN TO SORT-RDW
                  methodOut.setSortRdw(methodOut.getSortInRecLen());
//  MOVE IN-RECORD (1 : WS-SORT-IN-REC-LEN ) TO SORT-REC (1 : SORT-RDW )
                  methodOut.getSortRec().replace(methodOut.getInRecord(),0,(int) methodOut.getSortInRecLen(),0,(int) methodOut.getSortRdw() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  RELEASE SORT-REC
                  if(useSortFileStrategy()) {
                  sortFileInternIn.write(methodOut.getSortRec().toCharArray(),(int) methodOut.getSortRdw());
                  } else
                    addReleaseRecord(methodOut.getSortRec().toCharArray(),(int) methodOut.getSortRdw());
                }
          }
          ;
      
      return methodOut;
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
      @Override
      public FormatOpRecOutCtx formatOpRec(FormatOpRecInCtx methodIn) throws Exception {
      
// *

// *
Mcsort01Ctx programCtx = methodIn.getMcsort01Ctx();
FormatOpRecOutCtx methodOut = methodIn.getFormatOpRecOutCtx();
//  MOVE SPACES TO NO-RECORDS
          methodOut.setNoRecords(CONSTANTS.SPACE);
//  PERFORM UNTIL RECORDS-ENDED
          while ((!(methodOut.isRecordsEnded()) )) {
//  RETURN SORT-FILE RECORD
                    if(useSortFileStrategy()) {
                      sortFileInternOut.read();
                      if (!sortFileInternOut.hasEnded()) {
                      	methodOut.getSortRec().setString(sortFileInternOut.getRecord());
                      	methodOut.setSortRdw(sortFileInternOut.getRecord().length); //for VB
                      }    
                  } else {
              setRecIndex(getRecIndex()+1);
              if (getRecIndex() < sortRecKeys.size() ) { 
                 byte[] tmpBytes = getReturnRecord(getRecIndex());
                 methodOut.setSortRdw(tmpBytes.length);
                 methodOut.getSortRec().setString(tmpBytes); 
              }
              }
//  AT END
                  if (isSortRecordsEnded()) { 
//  SET RECORDS-ENDED TO TRUE
                      methodOut.setRecordsEndedTrue(); 
                      
                    }
//  NOT AT END
                  if (isSortRecordsNotEnded()) { 
//  MOVE SORT-RDW TO WS-SORT-OUT-REC-LEN
                      methodOut.setSortOutRecLen(methodOut.getSortRdw());
//  MOVE SORT-REC (1 : SORT-RDW ) TO OUT-RECORD (1 : WS-SORT-OUT-REC-LEN )
                      methodOut.getOutRecord().replace(methodOut.getSortRec(),0,(int) methodOut.getSortRdw(),0,(int) methodOut.getSortOutRecLen() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  WRITE OUT-RECORD
                      sortOut.setRecord(substring(methodOut.getOutRecord().toCharArray(),0,(int) methodOut.getSortOutRecLen()));
                      sortOut.write((int) methodOut.getSortOutRecLen()); 
                      methodOut.setSortOutStatus(sortOut.getStatusString() );
                    }
          }
          ;
      
      return methodOut;
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
