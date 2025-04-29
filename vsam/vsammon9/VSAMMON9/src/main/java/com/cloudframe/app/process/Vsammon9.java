  package com.cloudframe.app.process;
  /* 
*
*usecase for testing invalid key & not invalid key on vsam apis
*
*/
  
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.vsammon9.file.*;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import java.util.ArrayList;
  import com.cloudframe.app.data.Field;
  import java.util.Map;
  import java.util.HashMap;
  import com.cloudframe.app.vsammon9.file.records.MonPriKey;
  import com.cloudframe.app.utility.CFConstants;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.vsammon9.dto.*;
  import com.cloudframe.app.vsammon9.file.records.Reprec;
  import com.cloudframe.app.vsammon9.file.records.MonitorRecord;
  import com.cloudframe.app.vsammon9.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.utility.CFUtil;
  
  @Component("vsammon9")
  
  public class Vsammon9 extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Vsammon9.class);
  
  private Reprec reprec = new Reprec() ;
  private MonitorRecord monitorRecord = new MonitorRecord() ;
  private Work work = new Work() ;
  
  
  
  @Autowired 
  @Qualifier("vsammon9_monitor")
  Monitor monitor;
  @Autowired 
  @Qualifier("vsammon9_repout")
  Repout repout;
  
  
  private boolean doNotSkipVsamOperations = true;
  private boolean doNotSkipVsamStartApi = true;
  private boolean doNotSkipVsamReadApi = true;
  private boolean doNotSkipVsamWriteApi = true;
  private boolean doNotSkipVsamWriteApiSplit0 = true;
  private boolean doNotSkipVsamWriteApiSplit1 = true;
  private boolean doNotSkipVsamRewriteApi = true;
  private boolean doNotSkipVsamRewriteApiSplit2 = true;
  private boolean doNotSkipVsamRewriteApiSplit3 = true;
  private boolean doNotSkipVsamDeleteApi = true;
  private boolean doNotSkipCloseFiles = true;
  
  
  
  
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
      		if(monitor.hasOpened() && !monitor.isReadOnly()) { 
      			monitor.flush(); 
      		}
      		if(repout.hasOpened() && !repout.isReadOnly()) { 
      			repout.flush(); 
      		}
      }
      
       return getRc(); // Exit with return code
      // end of process method
      }
      /**
      * mainline 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAINLINE COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void mainline() throws Exception {
//  PERFORM 1000-OPEN-FILES THRU 1000-EXIT
          openFiles();/*1000-OPEN-FILES*/
          if (this.isProgramEnded()) {
              return ;
          }
//  PERFORM 2000-VSAM-OPERATIONS THRU 2000-EXIT
          vsamOperations();/*2000-VSAM-OPERATIONS*/
          if (this.isProgramEnded()) {
              return ;
          }
//  PERFORM 3000-CLOSE-FILES THRU 3000-EXIT
          closeFiles();/*3000-CLOSE-FILES*/
          if (this.isProgramEnded()) {
              return ;
          }
//cobolCode::GO TO 9999-EXIT-PROGRAM
exitProgram();
 return ;
//cobolCodeEnds::GO TO 9999-EXIT-PROGRAM
      
      }
      /**
      * openFiles 
      *   This method is derived from 
  *   COBOL Paragraph - 1000-OPEN-FILES COBOL Cyclomatic complexity - 3
      * Input  : None 

      * Output :  

      * - monitorFileStatus              COBOL Name: MONITOR-FILE-STATUS
      * - reprec                         COBOL Name: REPREC
      *
      * @throws CFException
      */
      private void openFiles() throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			char[] monitorFileStatus = null;
			Map<String,Object> updated = null;
			// End of variable declaration

      
// *----------------------------------------------------------------*

// *----------------------------------------------------------------*
//  OPEN OUTPUT REPOUT
          repout.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),repout.getFileName(),repout.getRepoutCharSet(),repout.getRepoutCrlfFlag());
//  OPEN I-O MONITOR
          	monitor.setVsamCluster("VSAMMON9" /*program name*/);
          monitor.open("rw"); 
          work.setMonitorFileStatus(monitor.getStatusString() );
          monitorFileStatus = work.getMonitorFileStatus();
//  IF MONITOR-FILE-STATUS NOT = '00'
//  LITERAL_00 = '00'
          if (		compareChars(monitorFileStatus,CONSTANTS.LITERAL_00) != 0 ) { 
//  MOVE SPACES TO REPREC
              reprec.setString(CONSTANTS.SPACE_300);
//  STRING 'Error opening Monitor: ' MONITOR-FILE-STATUS DELIMITED BY SIZE INTO REPREC END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_Error_B3_openingMonitor_CL_);
                 charArray.add(work.getMonitorFileStatus());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(reprec.toCharArray() ,joinCharArray);
              reprec.setString(  (char[])updated.get("string"));
//  WRITE REPREC END-WRITE
              repout.write(reprec.toCharArray()); 
              reprec.setString(CONSTANTS.LOW_VALUE_215695350);
//cobolCode::GO TO 9999-EXIT-PROGRAM
exitProgram();
 return ;
//cobolCodeEnds::GO TO 9999-EXIT-PROGRAM
          }
  
          ;
      
      }
      /**
      * vsamOperations 
      *   This method is derived from 
  *   COBOL Paragraph - 2000-VSAM-OPERATIONS COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void vsamOperations() throws Exception {
//  PERFORM 2001-VSAM-START-API THRU 2001-EXIT
          vsamStartApi();/*2001-VSAM-START-API*/
//  PERFORM 2002-VSAM-READ-API THRU 2002-EXIT
          vsamReadApi();/*2002-VSAM-READ-API*/
//  PERFORM 2003-VSAM-WRITE-API THRU 2003-EXIT
          vsamWriteApi();/*2003-VSAM-WRITE-API*/
//  PERFORM 2004-VSAM-REWRITE-API THRU 2004-EXIT
          vsamRewriteApi();/*2004-VSAM-REWRITE-API*/
//  PERFORM 2005-VSAM-DELETE-API THRU 2005-EXIT
          vsamDeleteApi();/*2005-VSAM-DELETE-API*/
          ;
      
      }
      /**
      * vsamStartApi 
      *   This method is derived from 
  *   COBOL Paragraph - 2001-VSAM-START-API COBOL Cyclomatic complexity - 7
      * Input  :  

      * - monPriKey                      COBOL Name: MON-PRI-KEY
      *
      * Output :  

      * - monXcdtTskStrtDt               COBOL Name: MON-XCDT-TSK-STRT-DT
      * - monXcdtTskStrtTm               COBOL Name: MON-XCDT-TSK-STRT-TM
      * - monXcdtProgNm                  COBOL Name: MON-XCDT-PROG-NM
      * - monXcdtMthdNm                  COBOL Name: MON-XCDT-MTHD-NM
      * - monXctorTskNo                  COBOL Name: MON-XCTOR-TSK-NO
      * - reprec                         COBOL Name: REPREC
      * - eofSw                          COBOL Name: WS-EOF-SW
      * - monitorRecord                  COBOL Name: MONITOR-RECORD
      * - monitorFileStatus              COBOL Name: MONITOR-FILE-STATUS
      * - monPriKey                      COBOL Name: MON-PRI-KEY
      *
      * @throws CFException
      */
      private void vsamStartApi() throws Exception {
			// Declare local variables used in the method
			MonPriKey monPriKey = monitorRecord.getMonPriKey();
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			boolean invalidKey = false;
			// End of variable declaration


// *
// * Valid key start scenario
// *
//  MOVE '2012-09-24' TO MON-XCDT-TSK-STRT-DT
//  LITERAL_2012_MN2_0924 = '2012-09-24'
          monPriKey.setMonXcdtTskStrtDt(CONSTANTS.LITERAL_2012_MN2_0924);
  
//  MOVE '10.30.04' TO MON-XCDT-TSK-STRT-TM
//  LITERAL_674400346 = '10.30.04'
          monPriKey.setMonXcdtTskStrtTm(CONSTANTS.LITERAL_674400346);
  
//  MOVE 'CASEIM02' TO MON-XCDT-PROG-NM
//  LITERAL_CASEIM02 = 'CASEIM02'
          monPriKey.setMonXcdtProgNm(CONSTANTS.LITERAL_CASEIM02);
  
//  MOVE 'imsTestCase2' TO MON-XCDT-MTHD-NM
          monPriKey.setMonXcdtMthdNm(CONSTANTS.LITERAL_133936805);
  
//  MOVE 0 TO MON-XCTOR-TSK-NO
//  LITERAL_0 = 0
          monPriKey.setMonXctorTskNo(0);
  

// *
          // MOVE '**********' TO REPREC
          reprec.setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC END-WRITE
          repout.write(reprec.toCharArray()); 
          reprec.setString(CONSTANTS.LOW_VALUE_215695350);
//  MOVE SPACES TO REPREC
          reprec.setString(CONSTANTS.SPACE_300);
//  STRING 'START >  PRIMARY KEY :  ' MON-PRI-KEY DELIMITED BY SIZE INTO REPREC END-STRING
          charArray = new ArrayList<char[]>();
             charArray.add(CONSTANTS.LITERAL_391649637);
             charArray.add(monitorRecord.getMonPriKey().toCharArray());
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
          updated = updateString(reprec.toCharArray() ,joinCharArray);
          reprec.setString(  (char[])updated.get("string"));
//  WRITE REPREC END-WRITE
          repout.write(reprec.toCharArray()); 
          reprec.setString(CONSTANTS.LOW_VALUE_215695350);
          // MOVE '**********' TO REPREC
          reprec.setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC END-WRITE
          repout.write(reprec.toCharArray()); 
          reprec.setString(CONSTANTS.LOW_VALUE_215695350);
//  MOVE SPACES TO WS-EOF-SW
          work.setEofSw(CONSTANTS.SPACE);
//  START MONITOR KEY IS GREATER THAN MON-PRI-KEY
          monitor.seek(monitorRecord.toCharArray(),CFConstants.CONDITION_GREATER_THAN,monitor.getKeyInfo().getMonPriKey()); 
          work.setMonitorFileStatus(monitor.getStatusString() );
//  INVALID KEY
          invalidKey = monitor.isInvalidKey();
          if (invalidKey) {
           // MOVE '*Failure* VSAM API Invalid Key' TO REPREC
           reprec.setString(CONSTANTS.LITERAL_1311842444);
          //  WRITE REPREC END-WRITE
           repout.write(reprec.toCharArray()); 
           reprec.setString(CONSTANTS.LOW_VALUE_215695350);
           }
//  NOT INVALID KEY
          else {
          //  READ MONITOR NEXT
           monitor.readNext();
           work.setMonitorFileStatus(monitor.getStatusString() );
           if (!monitor.hasEnded()) {
           	monitorRecord.setString(monitor.getRecord());
           }
           // MOVE MONITOR-RECORD TO REPREC
           reprec.setString(monitorRecord.getCharArray());
          //  WRITE REPREC END-WRITE
           repout.write(reprec.toCharArray()); 
           reprec.setString(CONSTANTS.LOW_VALUE_215695350);
           }
          // MOVE '**********' TO REPREC
          reprec.setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC END-WRITE
          repout.write(reprec.toCharArray()); 
          reprec.setString(CONSTANTS.LOW_VALUE_215695350);

// *
// * Invalid key start scenario
// *
//  MOVE '9999-12-31' TO MON-XCDT-TSK-STRT-DT
//  LITERAL_9999_MN2_1231 = '9999-12-31'
          monPriKey.setMonXcdtTskStrtDt(CONSTANTS.LITERAL_9999_MN2_1231);
  
//  MOVE '10.30.04' TO MON-XCDT-TSK-STRT-TM
//  LITERAL_674400346 = '10.30.04'
          monPriKey.setMonXcdtTskStrtTm(CONSTANTS.LITERAL_674400346);
  
//  MOVE 'CASEIM02' TO MON-XCDT-PROG-NM
//  LITERAL_CASEIM02 = 'CASEIM02'
          monPriKey.setMonXcdtProgNm(CONSTANTS.LITERAL_CASEIM02);
  
//  MOVE 'imsTestCase2' TO MON-XCDT-MTHD-NM
          monPriKey.setMonXcdtMthdNm(CONSTANTS.LITERAL_133936805);
  
//  MOVE 0 TO MON-XCTOR-TSK-NO
//  LITERAL_0 = 0
          monPriKey.setMonXctorTskNo(0);
  

// *
          // MOVE '**********' TO REPREC
          reprec.setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC END-WRITE
          repout.write(reprec.toCharArray()); 
          reprec.setString(CONSTANTS.LOW_VALUE_215695350);
//  MOVE SPACES TO REPREC
          reprec.setString(CONSTANTS.SPACE_300);
//  STRING 'START >  PRIMARY KEY :  ' MON-PRI-KEY DELIMITED BY SIZE INTO REPREC END-STRING
          charArray = new ArrayList<char[]>();
             charArray.add(CONSTANTS.LITERAL_391649637);
             charArray.add(monitorRecord.getMonPriKey().toCharArray());
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
          updated = updateString(reprec.toCharArray() ,joinCharArray);
          reprec.setString(  (char[])updated.get("string"));
//  WRITE REPREC END-WRITE
          repout.write(reprec.toCharArray()); 
          reprec.setString(CONSTANTS.LOW_VALUE_215695350);
          // MOVE '**********' TO REPREC
          reprec.setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC END-WRITE
          repout.write(reprec.toCharArray()); 
          reprec.setString(CONSTANTS.LOW_VALUE_215695350);
//  MOVE SPACES TO WS-EOF-SW
          work.setEofSw(CONSTANTS.SPACE);
//  START MONITOR KEY IS GREATER THAN MON-PRI-KEY
          monitor.seek(monitorRecord.toCharArray(),CFConstants.CONDITION_GREATER_THAN,monitor.getKeyInfo().getMonPriKey()); 
          work.setMonitorFileStatus(monitor.getStatusString() );
//  INVALID KEY
          invalidKey = monitor.isInvalidKey();
          if (invalidKey) {
           // MOVE '*Success* VSAM API Invalid Key' TO REPREC
           reprec.setString(CONSTANTS.LITERAL_1463958715);
          //  WRITE REPREC END-WRITE
           repout.write(reprec.toCharArray()); 
           reprec.setString(CONSTANTS.LOW_VALUE_215695350);
           }
//  NOT INVALID KEY
          else {
           // MOVE '*Failure* VSAM API NOT Invalid Key' TO REPREC
           reprec.setString(CONSTANTS.LITERAL_1880771425);
          //  WRITE REPREC END-WRITE
           repout.write(reprec.toCharArray()); 
           reprec.setString(CONSTANTS.LOW_VALUE_215695350);
           }
          // MOVE '**********' TO REPREC
          reprec.setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC
          repout.write(reprec.toCharArray()); 
          reprec.setString(CONSTANTS.LOW_VALUE_215695350);
          ;
      
      }
      /**
      * vsamReadApi 
      *   This method is derived from 
  *   COBOL Paragraph - 2002-VSAM-READ-API COBOL Cyclomatic complexity - 7
      * Input  :  

      * - monPriKey                      COBOL Name: MON-PRI-KEY
      *
      * Output :  

      * - monXcdtTskStrtDt               COBOL Name: MON-XCDT-TSK-STRT-DT
      * - monXcdtTskStrtTm               COBOL Name: MON-XCDT-TSK-STRT-TM
      * - monXcdtProgNm                  COBOL Name: MON-XCDT-PROG-NM
      * - monXcdtMthdNm                  COBOL Name: MON-XCDT-MTHD-NM
      * - monXctorTskNo                  COBOL Name: MON-XCTOR-TSK-NO
      * - reprec                         COBOL Name: REPREC
      * - eofSw                          COBOL Name: WS-EOF-SW
      * - monitorRecord                  COBOL Name: MONITOR-RECORD
      * - monitorFileStatus              COBOL Name: MONITOR-FILE-STATUS
      * - monPriKey                      COBOL Name: MON-PRI-KEY
      *
      * @throws CFException
      */
      private void vsamReadApi() throws Exception {
			// Declare local variables used in the method
			MonPriKey monPriKey = monitorRecord.getMonPriKey();
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			boolean invalidKey = false;
			// End of variable declaration


// *
// * Valid key read scenario
// *
//  MOVE '2012-09-24' TO MON-XCDT-TSK-STRT-DT
//  LITERAL_2012_MN2_0924 = '2012-09-24'
          monPriKey.setMonXcdtTskStrtDt(CONSTANTS.LITERAL_2012_MN2_0924);
  
//  MOVE '10.30.04' TO MON-XCDT-TSK-STRT-TM
//  LITERAL_674400346 = '10.30.04'
          monPriKey.setMonXcdtTskStrtTm(CONSTANTS.LITERAL_674400346);
  
//  MOVE 'CASEIM02' TO MON-XCDT-PROG-NM
//  LITERAL_CASEIM02 = 'CASEIM02'
          monPriKey.setMonXcdtProgNm(CONSTANTS.LITERAL_CASEIM02);
  
//  MOVE 'imsTestCase2' TO MON-XCDT-MTHD-NM
          monPriKey.setMonXcdtMthdNm(CONSTANTS.LITERAL_133936805);
  
//  MOVE 220 TO MON-XCTOR-TSK-NO
          monPriKey.setMonXctorTskNo(220);
  

// *
          // MOVE '**********' TO REPREC
          reprec.setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC END-WRITE
          repout.write(reprec.toCharArray()); 
          reprec.setString(CONSTANTS.LOW_VALUE_215695350);
//  MOVE SPACES TO REPREC
          reprec.setString(CONSTANTS.SPACE_300);
//  STRING 'READ  PRIMARY KEY :  ' MON-PRI-KEY DELIMITED BY SIZE INTO REPREC END-STRING
          charArray = new ArrayList<char[]>();
             charArray.add(CONSTANTS.LITERAL_READ_B6_PRIMARYKEYCL_);
             charArray.add(monitorRecord.getMonPriKey().toCharArray());
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
          updated = updateString(reprec.toCharArray() ,joinCharArray);
          reprec.setString(  (char[])updated.get("string"));
//  WRITE REPREC END-WRITE
          repout.write(reprec.toCharArray()); 
          reprec.setString(CONSTANTS.LOW_VALUE_215695350);
          // MOVE '**********' TO REPREC
          reprec.setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC END-WRITE
          repout.write(reprec.toCharArray()); 
          reprec.setString(CONSTANTS.LOW_VALUE_215695350);
//  MOVE SPACES TO WS-EOF-SW
          work.setEofSw(CONSTANTS.SPACE);
//  READ MONITOR
          	monitor.readDirect(monitorRecord.getMonPriKey().toCharArray(),monitor.getKeyInfo().getMonPriKey());
          work.setMonitorFileStatus(monitor.getStatusString() );
          if (!monitor.hasEnded()) {
          	monitorRecord.setString(monitor.getRecord());
          }
//  INVALID KEY
          invalidKey = monitor.isInvalidKey();
          if (invalidKey) {
           // MOVE '*Failure* VSAM API Invalid Key' TO REPREC
           reprec.setString(CONSTANTS.LITERAL_1311842444);
          //  WRITE REPREC END-WRITE
           repout.write(reprec.toCharArray()); 
           reprec.setString(CONSTANTS.LOW_VALUE_215695350);
           }
//  NOT INVALID KEY
          else {
           // MOVE MONITOR-RECORD TO REPREC
           reprec.setString(monitorRecord.getCharArray());
          //  WRITE REPREC END-WRITE
           repout.write(reprec.toCharArray()); 
           reprec.setString(CONSTANTS.LOW_VALUE_215695350);
           }
          // MOVE '**********' TO REPREC
          reprec.setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC END-WRITE
          repout.write(reprec.toCharArray()); 
          reprec.setString(CONSTANTS.LOW_VALUE_215695350);

// *
// * Invalid key read scenario
// *
//  MOVE '9999-12-31' TO MON-XCDT-TSK-STRT-DT
//  LITERAL_9999_MN2_1231 = '9999-12-31'
          monPriKey.setMonXcdtTskStrtDt(CONSTANTS.LITERAL_9999_MN2_1231);
  
//  MOVE '10.30.04' TO MON-XCDT-TSK-STRT-TM
//  LITERAL_674400346 = '10.30.04'
          monPriKey.setMonXcdtTskStrtTm(CONSTANTS.LITERAL_674400346);
  
//  MOVE 'CASEIM02' TO MON-XCDT-PROG-NM
//  LITERAL_CASEIM02 = 'CASEIM02'
          monPriKey.setMonXcdtProgNm(CONSTANTS.LITERAL_CASEIM02);
  
//  MOVE 'imsTestCase2' TO MON-XCDT-MTHD-NM
          monPriKey.setMonXcdtMthdNm(CONSTANTS.LITERAL_133936805);
  
//  MOVE 0 TO MON-XCTOR-TSK-NO
//  LITERAL_0 = 0
          monPriKey.setMonXctorTskNo(0);
  

// *
          // MOVE '**********' TO REPREC
          reprec.setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC END-WRITE
          repout.write(reprec.toCharArray()); 
          reprec.setString(CONSTANTS.LOW_VALUE_215695350);
//  MOVE SPACES TO REPREC
          reprec.setString(CONSTANTS.SPACE_300);
//  STRING 'READ  PRIMARY KEY :  ' MON-PRI-KEY DELIMITED BY SIZE INTO REPREC END-STRING
          charArray = new ArrayList<char[]>();
             charArray.add(CONSTANTS.LITERAL_READ_B6_PRIMARYKEYCL_);
             charArray.add(monitorRecord.getMonPriKey().toCharArray());
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
          updated = updateString(reprec.toCharArray() ,joinCharArray);
          reprec.setString(  (char[])updated.get("string"));
//  WRITE REPREC END-WRITE
          repout.write(reprec.toCharArray()); 
          reprec.setString(CONSTANTS.LOW_VALUE_215695350);
          // MOVE '**********' TO REPREC
          reprec.setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC END-WRITE
          repout.write(reprec.toCharArray()); 
          reprec.setString(CONSTANTS.LOW_VALUE_215695350);
//  MOVE SPACES TO WS-EOF-SW
          work.setEofSw(CONSTANTS.SPACE);
//  READ MONITOR
          	monitor.readDirect(monitorRecord.getMonPriKey().toCharArray(),monitor.getKeyInfo().getMonPriKey());
          work.setMonitorFileStatus(monitor.getStatusString() );
          if (!monitor.hasEnded()) {
          	monitorRecord.setString(monitor.getRecord());
          }
//  INVALID KEY
          invalidKey = monitor.isInvalidKey();
          if (invalidKey) {
           // MOVE '*Success* VSAM API Invalid Key' TO REPREC
           reprec.setString(CONSTANTS.LITERAL_1463958715);
          //  WRITE REPREC END-WRITE
           repout.write(reprec.toCharArray()); 
           reprec.setString(CONSTANTS.LOW_VALUE_215695350);
           }
//  NOT INVALID KEY
          else {
           // MOVE '*Failure* VSAM API NOT Invalid Key' TO REPREC
           reprec.setString(CONSTANTS.LITERAL_1880771425);
          //  WRITE REPREC END-WRITE
           repout.write(reprec.toCharArray()); 
           reprec.setString(CONSTANTS.LOW_VALUE_215695350);
           }
          // MOVE '**********' TO REPREC
          reprec.setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC
          repout.write(reprec.toCharArray()); 
          reprec.setString(CONSTANTS.LOW_VALUE_215695350);
          ;
      
      }
      /**
      * vsamWriteApi 
      *   This method is derived from 
  *   COBOL Paragraph - 2003-VSAM-WRITE-API COBOL Cyclomatic complexity - 7
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void vsamWriteApi() throws Exception {
//  PERFORM 2003-VSAM-WRITE-API-SPLIT0
          vsamWriteApiSplit0();/*2003-VSAM-WRITE-API-SPLIT0*/
//  PERFORM 2003-VSAM-WRITE-API-SPLIT1
          vsamWriteApiSplit1();/*2003-VSAM-WRITE-API-SPLIT1*/
      
      }
      /**
      * vsamWriteApiSplit0 
      *   This method is derived from 
  *   COBOL Paragraph - 2003-VSAM-WRITE-API-SPLIT0 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - monPriKey                      COBOL Name: MON-PRI-KEY
      * - monitorRecord                  COBOL Name: MONITOR-RECORD
      *
      * Output :  

      * - monXcdtTskStrtDt               COBOL Name: MON-XCDT-TSK-STRT-DT
      * - monXcdtTskStrtTm               COBOL Name: MON-XCDT-TSK-STRT-TM
      * - monXcdtProgNm                  COBOL Name: MON-XCDT-PROG-NM
      * - monXcdtMthdNm                  COBOL Name: MON-XCDT-MTHD-NM
      * - monXctorTskNo                  COBOL Name: MON-XCTOR-TSK-NO
      * - monXctorSysId                  COBOL Name: MON-XCTOR-SYS-ID
      * - monXctorTranId                 COBOL Name: MON-XCTOR-TRAN-ID
      * - monXcaorSysId                  COBOL Name: MON-XCAOR-SYS-ID
      * - monXcaorTskNo                  COBOL Name: MON-XCAOR-TSK-NO
      * - monXcdtPgmTyCd                 COBOL Name: MON-XCDT-PGM-TY-CD
      * - monXcdtReqrIpAd                COBOL Name: MON-XCDT-REQR-IP-AD
      * - monXcdtTskAorTm                COBOL Name: MON-XCDT-TSK-AOR-TM
      * - monXcdtTskElpsTm               COBOL Name: MON-XCDT-TSK-ELPS-TM
      * - monXcdtTskCmpCd                COBOL Name: MON-XCDT-TSK-CMP-CD
      * - monXcdtTskAbndCd               COBOL Name: MON-XCDT-TSK-ABND-CD
      * - monXcdtReqSz                   COBOL Name: MON-XCDT-REQ-SZ
      * - monXcdtRespSz                  COBOL Name: MON-XCDT-RESP-SZ
      * - monUsertoken                   COBOL Name: MON-USERTOKEN
      * - reprec                         COBOL Name: REPREC
      * - eofSw                          COBOL Name: WS-EOF-SW
      * - monitorFileStatus              COBOL Name: MONITOR-FILE-STATUS
      * - monitorRecord                  COBOL Name: MONITOR-RECORD
      *
      * @throws CFException
      */
      private void vsamWriteApiSplit0() throws Exception {
			// Declare local variables used in the method
			MonPriKey monPriKey = monitorRecord.getMonPriKey();
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			boolean invalidKey = false;
			// End of variable declaration


// *
// * Valid key write scenario
// *
//  MOVE '2050-09-24' TO MON-XCDT-TSK-STRT-DT
//  LITERAL_2050_MN2_0924 = '2050-09-24'
          monPriKey.setMonXcdtTskStrtDt(CONSTANTS.LITERAL_2050_MN2_0924);
  
//  MOVE '10.30.04' TO MON-XCDT-TSK-STRT-TM
//  LITERAL_674400346 = '10.30.04'
          monPriKey.setMonXcdtTskStrtTm(CONSTANTS.LITERAL_674400346);
  
//  MOVE 'CASEIM02' TO MON-XCDT-PROG-NM
//  LITERAL_CASEIM02 = 'CASEIM02'
          monPriKey.setMonXcdtProgNm(CONSTANTS.LITERAL_CASEIM02);
  
//  MOVE 'imsTestCase2' TO MON-XCDT-MTHD-NM
          monPriKey.setMonXcdtMthdNm(CONSTANTS.LITERAL_133936805);
  
//  MOVE 220 TO MON-XCTOR-TSK-NO
          monPriKey.setMonXctorTskNo(220);
  
//  MOVE 'T60P' TO MON-XCTOR-SYS-ID
//  LITERAL_T60P = 'T60P'
          monitorRecord.setMonXctorSysId(CONSTANTS.LITERAL_T60P);
//  MOVE 'XML' TO MON-XCTOR-TRAN-ID
          monitorRecord.setMonXctorTranId(CONSTANTS.LITERAL_XML_B_);
//  MOVE 'A60P' TO MON-XCAOR-SYS-ID
//  LITERAL_A60P = 'A60P'
          monitorRecord.setMonXcaorSysId(CONSTANTS.LITERAL_A60P);
//  MOVE 221 TO MON-XCAOR-TSK-NO
          monitorRecord.setMonXcaorTskNo(221);
//  MOVE 'CA' TO MON-XCDT-PGM-TY-CD
          monitorRecord.setMonXcdtPgmTyCd(CONSTANTS.LITERAL_673788926);
//  MOVE '1.1.1.1' TO MON-XCDT-REQR-IP-AD
          monitorRecord.setMonXcdtReqrIpAd(CONSTANTS.LITERAL_1979067146);
          // MOVE 12 TO MON-XCDT-TSK-AOR-TM
          monitorRecord.setMonXcdtTskAorTm(12);
          // MOVE 14 TO MON-XCDT-TSK-ELPS-TM
          monitorRecord.setMonXcdtTskElpsTm(14);
//  MOVE 200 TO MON-XCDT-TSK-CMP-CD
          monitorRecord.setMonXcdtTskCmpCd((short)200);
          // MOVE 0 TO MON-XCDT-TSK-ABND-CD
          //  LITERAL_0 = 0
          monitorRecord.setMonXcdtTskAbndCd(CONSTANTS.LITERAL_0);
          // MOVE 1234 TO MON-XCDT-REQ-SZ
          monitorRecord.setMonXcdtReqSz(1234);
          // MOVE 5678 TO MON-XCDT-RESP-SZ
          monitorRecord.setMonXcdtRespSz(5678);
//  MOVE 'CLOUDFRAME' TO MON-USERTOKEN
          monitorRecord.setMonUsertoken(CONSTANTS.LITERAL_699011823);

// *
          // MOVE '**********' TO REPREC
          reprec.setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC END-WRITE
          repout.write(reprec.toCharArray()); 
          reprec.setString(CONSTANTS.LOW_VALUE_215695350);
//  MOVE SPACES TO REPREC
          reprec.setString(CONSTANTS.SPACE_300);
//  STRING 'WRITE  PRIMARY KEY :  ' MON-PRI-KEY DELIMITED BY SIZE INTO REPREC END-STRING
          charArray = new ArrayList<char[]>();
             charArray.add(CONSTANTS.LITERAL_WRITE_B6_PRIMARYKEYCL_);
             charArray.add(monitorRecord.getMonPriKey().toCharArray());
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
          updated = updateString(reprec.toCharArray() ,joinCharArray);
          reprec.setString(  (char[])updated.get("string"));
//  WRITE REPREC END-WRITE
          repout.write(reprec.toCharArray()); 
          reprec.setString(CONSTANTS.LOW_VALUE_215695350);
          // MOVE '**********' TO REPREC
          reprec.setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC END-WRITE
          repout.write(reprec.toCharArray()); 
          reprec.setString(CONSTANTS.LOW_VALUE_215695350);
//  MOVE SPACES TO WS-EOF-SW
          work.setEofSw(CONSTANTS.SPACE);
//  WRITE MONITOR-RECORD
          monitor.write(monitorRecord.toCharArray()); 
          work.setMonitorFileStatus(monitor.getStatusString() );
//  INVALID KEY
          invalidKey = monitor.isInvalidKey();
          if (invalidKey) {
           // MOVE '*Failure* VSAM API Invalid Key' TO REPREC
           reprec.setString(CONSTANTS.LITERAL_1311842444);
          //  WRITE REPREC END-WRITE
           repout.write(reprec.toCharArray()); 
           reprec.setString(CONSTANTS.LOW_VALUE_215695350);
           }
//  NOT INVALID KEY
          else {
           // MOVE MONITOR-RECORD TO REPREC
           reprec.setString(monitorRecord.getCharArray());
          //  WRITE REPREC END-WRITE
           repout.write(reprec.toCharArray()); 
           reprec.setString(CONSTANTS.LOW_VALUE_215695350);
           }
          // MOVE '**********' TO REPREC
          reprec.setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC END-WRITE
          repout.write(reprec.toCharArray()); 
          reprec.setString(CONSTANTS.LOW_VALUE_215695350);

// *
// * Invalid key write scenario
// *
//  MOVE '2012-09-24' TO MON-XCDT-TSK-STRT-DT
//  LITERAL_2012_MN2_0924 = '2012-09-24'
          monPriKey.setMonXcdtTskStrtDt(CONSTANTS.LITERAL_2012_MN2_0924);
  
//  MOVE '10.30.04' TO MON-XCDT-TSK-STRT-TM
//  LITERAL_674400346 = '10.30.04'
          monPriKey.setMonXcdtTskStrtTm(CONSTANTS.LITERAL_674400346);
  
//  MOVE 'CASEIM02' TO MON-XCDT-PROG-NM
//  LITERAL_CASEIM02 = 'CASEIM02'
          monPriKey.setMonXcdtProgNm(CONSTANTS.LITERAL_CASEIM02);
  
//  MOVE 'imsTestCase2' TO MON-XCDT-MTHD-NM
          monPriKey.setMonXcdtMthdNm(CONSTANTS.LITERAL_133936805);
  
//  MOVE 220 TO MON-XCTOR-TSK-NO
          monPriKey.setMonXctorTskNo(220);
  
//  MOVE 'T60P' TO MON-XCTOR-SYS-ID
//  LITERAL_T60P = 'T60P'
          monitorRecord.setMonXctorSysId(CONSTANTS.LITERAL_T60P);
//  MOVE 'XML' TO MON-XCTOR-TRAN-ID
          monitorRecord.setMonXctorTranId(CONSTANTS.LITERAL_XML_B_);
//  MOVE 'A60P' TO MON-XCAOR-SYS-ID
//  LITERAL_A60P = 'A60P'
          monitorRecord.setMonXcaorSysId(CONSTANTS.LITERAL_A60P);
//  MOVE 221 TO MON-XCAOR-TSK-NO
          monitorRecord.setMonXcaorTskNo(221);
//  MOVE 'CA' TO MON-XCDT-PGM-TY-CD
          monitorRecord.setMonXcdtPgmTyCd(CONSTANTS.LITERAL_673788926);
//  MOVE '1.1.1.1' TO MON-XCDT-REQR-IP-AD
          monitorRecord.setMonXcdtReqrIpAd(CONSTANTS.LITERAL_1979067146);
          // MOVE 12 TO MON-XCDT-TSK-AOR-TM
          monitorRecord.setMonXcdtTskAorTm(12);
          // MOVE 14 TO MON-XCDT-TSK-ELPS-TM
          monitorRecord.setMonXcdtTskElpsTm(14);
//  MOVE 200 TO MON-XCDT-TSK-CMP-CD
          monitorRecord.setMonXcdtTskCmpCd((short)200);
          // MOVE 0 TO MON-XCDT-TSK-ABND-CD
          //  LITERAL_0 = 0
          monitorRecord.setMonXcdtTskAbndCd(CONSTANTS.LITERAL_0);
          // MOVE 1234 TO MON-XCDT-REQ-SZ
          monitorRecord.setMonXcdtReqSz(1234);
          // MOVE 5678 TO MON-XCDT-RESP-SZ
          monitorRecord.setMonXcdtRespSz(5678);
//  MOVE 'CLOUDFRAME' TO MON-USERTOKEN
          monitorRecord.setMonUsertoken(CONSTANTS.LITERAL_699011823);

// *
          // MOVE '**********' TO REPREC
          reprec.setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC END-WRITE
          repout.write(reprec.toCharArray()); 
          reprec.setString(CONSTANTS.LOW_VALUE_215695350);
      
      }
      /**
      * vsamWriteApiSplit1 
      *   This method is derived from 
  *   COBOL Paragraph - 2003-VSAM-WRITE-API-SPLIT1 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - monPriKey                      COBOL Name: MON-PRI-KEY
      * - monitorRecord                  COBOL Name: MONITOR-RECORD
      *
      * Output :  

      * - reprec                         COBOL Name: REPREC
      * - eofSw                          COBOL Name: WS-EOF-SW
      * - monitorFileStatus              COBOL Name: MONITOR-FILE-STATUS
      *
      * @throws CFException
      */
      private void vsamWriteApiSplit1() throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			boolean invalidKey = false;
			// End of variable declaration

//  MOVE SPACES TO REPREC
          reprec.setString(CONSTANTS.SPACE_300);
//  STRING 'WRITE  PRIMARY KEY :  ' MON-PRI-KEY DELIMITED BY SIZE INTO REPREC END-STRING
          charArray = new ArrayList<char[]>();
             charArray.add(CONSTANTS.LITERAL_WRITE_B6_PRIMARYKEYCL_);
             charArray.add(monitorRecord.getMonPriKey().toCharArray());
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
          updated = updateString(reprec.toCharArray() ,joinCharArray);
          reprec.setString(  (char[])updated.get("string"));
//  WRITE REPREC END-WRITE
          repout.write(reprec.toCharArray()); 
          reprec.setString(CONSTANTS.LOW_VALUE_215695350);
          // MOVE '**********' TO REPREC
          reprec.setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC END-WRITE
          repout.write(reprec.toCharArray()); 
          reprec.setString(CONSTANTS.LOW_VALUE_215695350);
//  MOVE SPACES TO WS-EOF-SW
          work.setEofSw(CONSTANTS.SPACE);
//  WRITE MONITOR-RECORD
          monitor.write(monitorRecord.toCharArray()); 
          work.setMonitorFileStatus(monitor.getStatusString() );
//  INVALID KEY
          invalidKey = monitor.isInvalidKey();
          if (invalidKey) {
           // MOVE '*Success* VSAM API Invalid Key' TO REPREC
           reprec.setString(CONSTANTS.LITERAL_1463958715);
          //  WRITE REPREC END-WRITE
           repout.write(reprec.toCharArray()); 
           reprec.setString(CONSTANTS.LOW_VALUE_215695350);
           }
//  NOT INVALID KEY
          else {
           // MOVE '*Failure* VSAM API NOT Invalid Key' TO REPREC
           reprec.setString(CONSTANTS.LITERAL_1880771425);
          //  WRITE REPREC END-WRITE
           repout.write(reprec.toCharArray()); 
           reprec.setString(CONSTANTS.LOW_VALUE_215695350);
           }
          // MOVE '**********' TO REPREC
          reprec.setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC
          repout.write(reprec.toCharArray()); 
          reprec.setString(CONSTANTS.LOW_VALUE_215695350);
          ;
      
      }
      /**
      * vsamRewriteApi 
      *   This method is derived from 
  *   COBOL Paragraph - 2004-VSAM-REWRITE-API COBOL Cyclomatic complexity - 7
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void vsamRewriteApi() throws Exception {
//  PERFORM 2004-VSAM-REWRITE-API-SPLIT2
          vsamRewriteApiSplit2();/*2004-VSAM-REWRITE-API-SPLIT2*/
//  PERFORM 2004-VSAM-REWRITE-API-SPLIT3
          vsamRewriteApiSplit3();/*2004-VSAM-REWRITE-API-SPLIT3*/
      
      }
      /**
      * vsamRewriteApiSplit2 
      *   This method is derived from 
  *   COBOL Paragraph - 2004-VSAM-REWRITE-API-SPLIT2 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - monPriKey                      COBOL Name: MON-PRI-KEY
      * - monitorRecord                  COBOL Name: MONITOR-RECORD
      *
      * Output :  

      * - monXcdtTskStrtDt               COBOL Name: MON-XCDT-TSK-STRT-DT
      * - monXcdtTskStrtTm               COBOL Name: MON-XCDT-TSK-STRT-TM
      * - monXcdtProgNm                  COBOL Name: MON-XCDT-PROG-NM
      * - monXcdtMthdNm                  COBOL Name: MON-XCDT-MTHD-NM
      * - monXctorTskNo                  COBOL Name: MON-XCTOR-TSK-NO
      * - monXctorSysId                  COBOL Name: MON-XCTOR-SYS-ID
      * - monXctorTranId                 COBOL Name: MON-XCTOR-TRAN-ID
      * - monXcaorSysId                  COBOL Name: MON-XCAOR-SYS-ID
      * - monXcaorTskNo                  COBOL Name: MON-XCAOR-TSK-NO
      * - monXcdtPgmTyCd                 COBOL Name: MON-XCDT-PGM-TY-CD
      * - monXcdtReqrIpAd                COBOL Name: MON-XCDT-REQR-IP-AD
      * - monXcdtTskAorTm                COBOL Name: MON-XCDT-TSK-AOR-TM
      * - monXcdtTskElpsTm               COBOL Name: MON-XCDT-TSK-ELPS-TM
      * - monXcdtTskCmpCd                COBOL Name: MON-XCDT-TSK-CMP-CD
      * - monXcdtTskAbndCd               COBOL Name: MON-XCDT-TSK-ABND-CD
      * - monXcdtReqSz                   COBOL Name: MON-XCDT-REQ-SZ
      * - monXcdtRespSz                  COBOL Name: MON-XCDT-RESP-SZ
      * - monUsertoken                   COBOL Name: MON-USERTOKEN
      * - reprec                         COBOL Name: REPREC
      * - eofSw                          COBOL Name: WS-EOF-SW
      * - monitorRecord                  COBOL Name: MONITOR-RECORD
      *
      * @throws CFException
      */
      private void vsamRewriteApiSplit2() throws Exception {
			// Declare local variables used in the method
			MonPriKey monPriKey = monitorRecord.getMonPriKey();
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			boolean invalidKey = false;
			// End of variable declaration


// *
// * Valid key rewrite scenario
// *
//  MOVE '2050-09-24' TO MON-XCDT-TSK-STRT-DT
//  LITERAL_2050_MN2_0924 = '2050-09-24'
          monPriKey.setMonXcdtTskStrtDt(CONSTANTS.LITERAL_2050_MN2_0924);
  
//  MOVE '10.30.04' TO MON-XCDT-TSK-STRT-TM
//  LITERAL_674400346 = '10.30.04'
          monPriKey.setMonXcdtTskStrtTm(CONSTANTS.LITERAL_674400346);
  
//  MOVE 'CASEIM02' TO MON-XCDT-PROG-NM
//  LITERAL_CASEIM02 = 'CASEIM02'
          monPriKey.setMonXcdtProgNm(CONSTANTS.LITERAL_CASEIM02);
  
//  MOVE 'imsTestCase2' TO MON-XCDT-MTHD-NM
          monPriKey.setMonXcdtMthdNm(CONSTANTS.LITERAL_133936805);
  
//  MOVE 220 TO MON-XCTOR-TSK-NO
          monPriKey.setMonXctorTskNo(220);
  
//  MOVE 'TORP' TO MON-XCTOR-SYS-ID
//  LITERAL_TORP = 'TORP'
          monitorRecord.setMonXctorSysId(CONSTANTS.LITERAL_TORP);
//  MOVE 'XML' TO MON-XCTOR-TRAN-ID
          monitorRecord.setMonXctorTranId(CONSTANTS.LITERAL_XML_B_);
//  MOVE 'AORP' TO MON-XCAOR-SYS-ID
//  LITERAL_AORP = 'AORP'
          monitorRecord.setMonXcaorSysId(CONSTANTS.LITERAL_AORP);
//  MOVE 221 TO MON-XCAOR-TSK-NO
          monitorRecord.setMonXcaorTskNo(221);
//  MOVE 'CA' TO MON-XCDT-PGM-TY-CD
          monitorRecord.setMonXcdtPgmTyCd(CONSTANTS.LITERAL_673788926);
//  MOVE '2.2.2.2' TO MON-XCDT-REQR-IP-AD
          monitorRecord.setMonXcdtReqrIpAd(CONSTANTS.LITERAL_895543558);
          // MOVE 12 TO MON-XCDT-TSK-AOR-TM
          monitorRecord.setMonXcdtTskAorTm(12);
          // MOVE 14 TO MON-XCDT-TSK-ELPS-TM
          monitorRecord.setMonXcdtTskElpsTm(14);
//  MOVE 200 TO MON-XCDT-TSK-CMP-CD
          monitorRecord.setMonXcdtTskCmpCd((short)200);
          // MOVE 0 TO MON-XCDT-TSK-ABND-CD
          //  LITERAL_0 = 0
          monitorRecord.setMonXcdtTskAbndCd(CONSTANTS.LITERAL_0);
          // MOVE 1234 TO MON-XCDT-REQ-SZ
          monitorRecord.setMonXcdtReqSz(1234);
          // MOVE 5678 TO MON-XCDT-RESP-SZ
          monitorRecord.setMonXcdtRespSz(5678);
//  MOVE 'CLOUDFRAME' TO MON-USERTOKEN
          monitorRecord.setMonUsertoken(CONSTANTS.LITERAL_699011823);

// *
          // MOVE '**********' TO REPREC
          reprec.setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC END-WRITE
          repout.write(reprec.toCharArray()); 
          reprec.setString(CONSTANTS.LOW_VALUE_215695350);
//  MOVE SPACES TO REPREC
          reprec.setString(CONSTANTS.SPACE_300);
//  STRING 'REWRITE  PRIMARY KEY :  ' MON-PRI-KEY DELIMITED BY SIZE INTO REPREC END-STRING
          charArray = new ArrayList<char[]>();
             charArray.add(CONSTANTS.LITERAL_REWRITE_B6_PRIMARYKEYCL_);
             charArray.add(monitorRecord.getMonPriKey().toCharArray());
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
          updated = updateString(reprec.toCharArray() ,joinCharArray);
          reprec.setString(  (char[])updated.get("string"));
//  WRITE REPREC END-WRITE
          repout.write(reprec.toCharArray()); 
          reprec.setString(CONSTANTS.LOW_VALUE_215695350);
          // MOVE '**********' TO REPREC
          reprec.setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC END-WRITE
          repout.write(reprec.toCharArray()); 
          reprec.setString(CONSTANTS.LOW_VALUE_215695350);
//  MOVE SPACES TO WS-EOF-SW
          work.setEofSw(CONSTANTS.SPACE);
//  REWRITE MONITOR-RECORD
          monitor.rewrite(monitorRecord.toCharArray());
          work.setMonitorFileStatus(monitor.getStatusString() );
//  INVALID KEY
          invalidKey = monitor.isInvalidKey();
          if (invalidKey) {
           // MOVE '*Failure* VSAM API Invalid Key' TO REPREC
           reprec.setString(CONSTANTS.LITERAL_1311842444);
          //  WRITE REPREC END-WRITE
           repout.write(reprec.toCharArray()); 
           reprec.setString(CONSTANTS.LOW_VALUE_215695350);
           }
//  NOT INVALID KEY
          else {
           // MOVE MONITOR-RECORD TO REPREC
           reprec.setString(monitorRecord.getCharArray());
          //  WRITE REPREC END-WRITE
           repout.write(reprec.toCharArray()); 
           reprec.setString(CONSTANTS.LOW_VALUE_215695350);
           }
          // MOVE '**********' TO REPREC
          reprec.setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC END-WRITE
          repout.write(reprec.toCharArray()); 
          reprec.setString(CONSTANTS.LOW_VALUE_215695350);

// *
// * Invalid key write scenario
// *
//  MOVE '2012-09-24' TO MON-XCDT-TSK-STRT-DT
//  LITERAL_2012_MN2_0924 = '2012-09-24'
          monPriKey.setMonXcdtTskStrtDt(CONSTANTS.LITERAL_2012_MN2_0924);
  
//  MOVE '11.30.04' TO MON-XCDT-TSK-STRT-TM
//  LITERAL_1877756615 = '11.30.04'
          monPriKey.setMonXcdtTskStrtTm(CONSTANTS.LITERAL_1877756615);
  
//  MOVE 'CASEIM02' TO MON-XCDT-PROG-NM
//  LITERAL_CASEIM02 = 'CASEIM02'
          monPriKey.setMonXcdtProgNm(CONSTANTS.LITERAL_CASEIM02);
  
//  MOVE 'imsTestCase2' TO MON-XCDT-MTHD-NM
          monPriKey.setMonXcdtMthdNm(CONSTANTS.LITERAL_133936805);
  
//  MOVE 220 TO MON-XCTOR-TSK-NO
          monPriKey.setMonXctorTskNo(220);
  
//  MOVE 'T60P' TO MON-XCTOR-SYS-ID
//  LITERAL_T60P = 'T60P'
          monitorRecord.setMonXctorSysId(CONSTANTS.LITERAL_T60P);
//  MOVE 'XML' TO MON-XCTOR-TRAN-ID
          monitorRecord.setMonXctorTranId(CONSTANTS.LITERAL_XML_B_);
//  MOVE 'A60P' TO MON-XCAOR-SYS-ID
//  LITERAL_A60P = 'A60P'
          monitorRecord.setMonXcaorSysId(CONSTANTS.LITERAL_A60P);
//  MOVE 221 TO MON-XCAOR-TSK-NO
          monitorRecord.setMonXcaorTskNo(221);
//  MOVE 'CA' TO MON-XCDT-PGM-TY-CD
          monitorRecord.setMonXcdtPgmTyCd(CONSTANTS.LITERAL_673788926);
//  MOVE '1.1.1.1' TO MON-XCDT-REQR-IP-AD
          monitorRecord.setMonXcdtReqrIpAd(CONSTANTS.LITERAL_1979067146);
          // MOVE 12 TO MON-XCDT-TSK-AOR-TM
          monitorRecord.setMonXcdtTskAorTm(12);
          // MOVE 14 TO MON-XCDT-TSK-ELPS-TM
          monitorRecord.setMonXcdtTskElpsTm(14);
//  MOVE 200 TO MON-XCDT-TSK-CMP-CD
          monitorRecord.setMonXcdtTskCmpCd((short)200);
          // MOVE 0 TO MON-XCDT-TSK-ABND-CD
          //  LITERAL_0 = 0
          monitorRecord.setMonXcdtTskAbndCd(CONSTANTS.LITERAL_0);
          // MOVE 1234 TO MON-XCDT-REQ-SZ
          monitorRecord.setMonXcdtReqSz(1234);
          // MOVE 5678 TO MON-XCDT-RESP-SZ
          monitorRecord.setMonXcdtRespSz(5678);
//  MOVE 'CLOUDFRAME' TO MON-USERTOKEN
          monitorRecord.setMonUsertoken(CONSTANTS.LITERAL_699011823);

// *
          // MOVE '**********' TO REPREC
          reprec.setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC END-WRITE
          repout.write(reprec.toCharArray()); 
          reprec.setString(CONSTANTS.LOW_VALUE_215695350);
      
      }
      /**
      * vsamRewriteApiSplit3 
      *   This method is derived from 
  *   COBOL Paragraph - 2004-VSAM-REWRITE-API-SPLIT3 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - monPriKey                      COBOL Name: MON-PRI-KEY
      *
      * Output :  

      * - reprec                         COBOL Name: REPREC
      * - eofSw                          COBOL Name: WS-EOF-SW
      *
      * @throws CFException
      */
      private void vsamRewriteApiSplit3() throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			boolean invalidKey = false;
			// End of variable declaration

//  MOVE SPACES TO REPREC
          reprec.setString(CONSTANTS.SPACE_300);
//  STRING 'REWRITE  PRIMARY KEY :  ' MON-PRI-KEY DELIMITED BY SIZE INTO REPREC END-STRING
          charArray = new ArrayList<char[]>();
             charArray.add(CONSTANTS.LITERAL_REWRITE_B6_PRIMARYKEYCL_);
             charArray.add(monitorRecord.getMonPriKey().toCharArray());
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
          updated = updateString(reprec.toCharArray() ,joinCharArray);
          reprec.setString(  (char[])updated.get("string"));
//  WRITE REPREC END-WRITE
          repout.write(reprec.toCharArray()); 
          reprec.setString(CONSTANTS.LOW_VALUE_215695350);
          // MOVE '**********' TO REPREC
          reprec.setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC END-WRITE
          repout.write(reprec.toCharArray()); 
          reprec.setString(CONSTANTS.LOW_VALUE_215695350);
//  MOVE SPACES TO WS-EOF-SW
          work.setEofSw(CONSTANTS.SPACE);
//  REWRITE MONITOR-RECORD
          monitor.rewrite(monitorRecord.toCharArray());
          work.setMonitorFileStatus(monitor.getStatusString() );
//  INVALID KEY
          invalidKey = monitor.isInvalidKey();
          if (invalidKey) {
           // MOVE '*Success* VSAM API Invalid Key' TO REPREC
           reprec.setString(CONSTANTS.LITERAL_1463958715);
          //  WRITE REPREC END-WRITE
           repout.write(reprec.toCharArray()); 
           reprec.setString(CONSTANTS.LOW_VALUE_215695350);
           }
//  NOT INVALID KEY
          else {
           // MOVE '*Failure* VSAM API NOT Invalid Key' TO REPREC
           reprec.setString(CONSTANTS.LITERAL_1880771425);
          //  WRITE REPREC END-WRITE
           repout.write(reprec.toCharArray()); 
           reprec.setString(CONSTANTS.LOW_VALUE_215695350);
           }
          // MOVE '**********' TO REPREC
          reprec.setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC
          repout.write(reprec.toCharArray()); 
          reprec.setString(CONSTANTS.LOW_VALUE_215695350);
          ;
      
      }
      /**
      * vsamDeleteApi 
      *   This method is derived from 
  *   COBOL Paragraph - 2005-VSAM-DELETE-API COBOL Cyclomatic complexity - 7
      * Input  :  

      * - monPriKey                      COBOL Name: MON-PRI-KEY
      * - monitorRecord                  COBOL Name: MONITOR-RECORD
      *
      * Output :  

      * - monXcdtTskStrtDt               COBOL Name: MON-XCDT-TSK-STRT-DT
      * - monXcdtTskStrtTm               COBOL Name: MON-XCDT-TSK-STRT-TM
      * - monXcdtProgNm                  COBOL Name: MON-XCDT-PROG-NM
      * - monXcdtMthdNm                  COBOL Name: MON-XCDT-MTHD-NM
      * - monXctorTskNo                  COBOL Name: MON-XCTOR-TSK-NO
      * - reprec                         COBOL Name: REPREC
      * - eofSw                          COBOL Name: WS-EOF-SW
      * - monitorRecord                  COBOL Name: MONITOR-RECORD
      *
      * @throws CFException
      */
      private void vsamDeleteApi() throws Exception {
			// Declare local variables used in the method
			MonPriKey monPriKey = monitorRecord.getMonPriKey();
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			boolean invalidKey = false;
			// End of variable declaration


// *
// * Valid key delete scenario
// *
//  MOVE '2050-09-24' TO MON-XCDT-TSK-STRT-DT
//  LITERAL_2050_MN2_0924 = '2050-09-24'
          monPriKey.setMonXcdtTskStrtDt(CONSTANTS.LITERAL_2050_MN2_0924);
  
//  MOVE '10.30.04' TO MON-XCDT-TSK-STRT-TM
//  LITERAL_674400346 = '10.30.04'
          monPriKey.setMonXcdtTskStrtTm(CONSTANTS.LITERAL_674400346);
  
//  MOVE 'CASEIM02' TO MON-XCDT-PROG-NM
//  LITERAL_CASEIM02 = 'CASEIM02'
          monPriKey.setMonXcdtProgNm(CONSTANTS.LITERAL_CASEIM02);
  
//  MOVE 'imsTestCase2' TO MON-XCDT-MTHD-NM
          monPriKey.setMonXcdtMthdNm(CONSTANTS.LITERAL_133936805);
  
//  MOVE 220 TO MON-XCTOR-TSK-NO
          monPriKey.setMonXctorTskNo(220);
  

// *
          // MOVE '**********' TO REPREC
          reprec.setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC END-WRITE
          repout.write(reprec.toCharArray()); 
          reprec.setString(CONSTANTS.LOW_VALUE_215695350);
//  MOVE SPACES TO REPREC
          reprec.setString(CONSTANTS.SPACE_300);
//  STRING 'DELETE  PRIMARY KEY :  ' MON-PRI-KEY DELIMITED BY SIZE INTO REPREC END-STRING
          charArray = new ArrayList<char[]>();
             charArray.add(CONSTANTS.LITERAL_DELETE_B6_PRIMARYKEYCL_);
             charArray.add(monitorRecord.getMonPriKey().toCharArray());
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
          updated = updateString(reprec.toCharArray() ,joinCharArray);
          reprec.setString(  (char[])updated.get("string"));
//  WRITE REPREC END-WRITE
          repout.write(reprec.toCharArray()); 
          reprec.setString(CONSTANTS.LOW_VALUE_215695350);
          // MOVE '**********' TO REPREC
          reprec.setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC END-WRITE
          repout.write(reprec.toCharArray()); 
          reprec.setString(CONSTANTS.LOW_VALUE_215695350);
//  MOVE SPACES TO WS-EOF-SW
          work.setEofSw(CONSTANTS.SPACE);
//  DELETE MONITOR
          monitor.delete(monitorRecord.getMonPriKey().toCharArray());
          work.setMonitorFileStatus(monitor.getStatusString() );
//  INVALID KEY
          invalidKey = monitor.isInvalidKey();
          if (invalidKey) {
           // MOVE '*Failure* VSAM API Invalid Key' TO REPREC
           reprec.setString(CONSTANTS.LITERAL_1311842444);
          //  WRITE REPREC END-WRITE
           repout.write(reprec.toCharArray()); 
           reprec.setString(CONSTANTS.LOW_VALUE_215695350);
           }
//  NOT INVALID KEY
          else {
           // MOVE MONITOR-RECORD TO REPREC
           reprec.setString(monitorRecord.getCharArray());
          //  WRITE REPREC END-WRITE
           repout.write(reprec.toCharArray()); 
           reprec.setString(CONSTANTS.LOW_VALUE_215695350);
           }
          // MOVE '**********' TO REPREC
          reprec.setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC END-WRITE
          repout.write(reprec.toCharArray()); 
          reprec.setString(CONSTANTS.LOW_VALUE_215695350);

// *
// * Invalid key delete scenario
// *
//  MOVE '9999-12-31' TO MON-XCDT-TSK-STRT-DT
//  LITERAL_9999_MN2_1231 = '9999-12-31'
          monPriKey.setMonXcdtTskStrtDt(CONSTANTS.LITERAL_9999_MN2_1231);
  
//  MOVE '10.30.04' TO MON-XCDT-TSK-STRT-TM
//  LITERAL_674400346 = '10.30.04'
          monPriKey.setMonXcdtTskStrtTm(CONSTANTS.LITERAL_674400346);
  
//  MOVE 'CASEIM02' TO MON-XCDT-PROG-NM
//  LITERAL_CASEIM02 = 'CASEIM02'
          monPriKey.setMonXcdtProgNm(CONSTANTS.LITERAL_CASEIM02);
  
//  MOVE 'imsTestCase2' TO MON-XCDT-MTHD-NM
          monPriKey.setMonXcdtMthdNm(CONSTANTS.LITERAL_133936805);
  
//  MOVE 0 TO MON-XCTOR-TSK-NO
//  LITERAL_0 = 0
          monPriKey.setMonXctorTskNo(0);
  

// *
          // MOVE '**********' TO REPREC
          reprec.setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC END-WRITE
          repout.write(reprec.toCharArray()); 
          reprec.setString(CONSTANTS.LOW_VALUE_215695350);
//  MOVE SPACES TO REPREC
          reprec.setString(CONSTANTS.SPACE_300);
//  STRING 'DELETE  PRIMARY KEY :  ' MON-PRI-KEY DELIMITED BY SIZE INTO REPREC END-STRING
          charArray = new ArrayList<char[]>();
             charArray.add(CONSTANTS.LITERAL_DELETE_B6_PRIMARYKEYCL_);
             charArray.add(monitorRecord.getMonPriKey().toCharArray());
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
          updated = updateString(reprec.toCharArray() ,joinCharArray);
          reprec.setString(  (char[])updated.get("string"));
//  WRITE REPREC END-WRITE
          repout.write(reprec.toCharArray()); 
          reprec.setString(CONSTANTS.LOW_VALUE_215695350);
          // MOVE '**********' TO REPREC
          reprec.setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC END-WRITE
          repout.write(reprec.toCharArray()); 
          reprec.setString(CONSTANTS.LOW_VALUE_215695350);
//  MOVE SPACES TO WS-EOF-SW
          work.setEofSw(CONSTANTS.SPACE);
//  DELETE MONITOR
          monitor.delete(monitorRecord.getMonPriKey().toCharArray());
          work.setMonitorFileStatus(monitor.getStatusString() );
//  INVALID KEY
          invalidKey = monitor.isInvalidKey();
          if (invalidKey) {
           // MOVE '*Success* VSAM API Invalid Key' TO REPREC
           reprec.setString(CONSTANTS.LITERAL_1463958715);
          //  WRITE REPREC END-WRITE
           repout.write(reprec.toCharArray()); 
           reprec.setString(CONSTANTS.LOW_VALUE_215695350);
           }
//  NOT INVALID KEY
          else {
           // MOVE '*Failure* VSAM API NOT Invalid Key' TO REPREC
           reprec.setString(CONSTANTS.LITERAL_1880771425);
          //  WRITE REPREC END-WRITE
           repout.write(reprec.toCharArray()); 
           reprec.setString(CONSTANTS.LOW_VALUE_215695350);
           }
          // MOVE '**********' TO REPREC
          reprec.setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC
          repout.write(reprec.toCharArray()); 
          reprec.setString(CONSTANTS.LOW_VALUE_215695350);
          ;
      
      }
      /**
      * closeFiles 
      *   This method is derived from 
  *   COBOL Paragraph - 3000-CLOSE-FILES COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void closeFiles() throws Exception {
      
// *----------------------------------------------------------------*

// *----------------------------------------------------------------*
//  CLOSE MONITOR
          monitor.close(); 
          work.setMonitorFileStatus(monitor.getStatusString() );
//  CLOSE REPOUT
          repout.close(); 
          ;
      
      }
      /**
      * exitProgram 
      *   This method is derived from 
  *   COBOL Paragraph - 9999-EXIT-PROGRAM COBOL Cyclomatic complexity - 2
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void exitProgram() throws Exception {
      
// *----------------------------------------------------------------*

// *----------------------------------------------------------------*
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          this.setProgramEnded(true);
          return ;
      
      }
  
  
      /**
* This method pre-initializes variables consistent with
* what a mainframe program would have done at the start of a program
*/
      @Override
      public void initVars() throws CFException {
      setProgramEnded(false);
       doNotSkipVsamOperations = true;
       doNotSkipVsamStartApi = true;
       doNotSkipVsamReadApi = true;
       doNotSkipVsamWriteApi = true;
       doNotSkipVsamWriteApiSplit0 = true;
       doNotSkipVsamWriteApiSplit1 = true;
       doNotSkipVsamRewriteApi = true;
       doNotSkipVsamRewriteApiSplit2 = true;
       doNotSkipVsamRewriteApiSplit3 = true;
       doNotSkipVsamDeleteApi = true;
       doNotSkipCloseFiles = true;
          if(!isInitDone()) {
          	this.setRc(0);
          	setInitDone(true);
          }
        CFUtil.resetDecimalAsComma();
       }
  
  
  
  
  
  
  }
