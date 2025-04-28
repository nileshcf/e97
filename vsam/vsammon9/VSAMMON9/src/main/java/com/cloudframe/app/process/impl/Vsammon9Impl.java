  package com.cloudframe.app.process.impl;
  /* 
*
*usecase for testing invalid key & not invalid key on vsam apis
*
*/
  
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.vsammon9.file.*;
  import com.cloudframe.app.vsammon9.Vsammon9Ctx.*;
  import com.cloudframe.app.vsammon9.Vsammon9Ctx;
  import com.cloudframe.app.process.Vsammon9;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import java.util.ArrayList;
  import com.cloudframe.app.data.Field;
  import java.util.Map;
  import java.util.HashMap;
  import com.cloudframe.app.utility.CFConstants;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.vsammon9.dto.*;
  import com.cloudframe.app.vsammon9.file.records.MonitorRecord;
  import com.cloudframe.app.vsammon9.file.records.Reprec;
  import com.cloudframe.app.vsammon9.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.utility.CFUtil;
  
  @Component("vsammon9")
  
  public class Vsammon9Impl extends CommonProcess implements Vsammon9 {
  
  Logger logger = LoggerFactory.getLogger(Vsammon9Impl.class);
  
  
  
  
  @Autowired 
  @Qualifier("vsammon9_monitor")
  Monitor monitor;
  @Autowired 
  @Qualifier("vsammon9_repout")
  Repout repout;
  
  
  
  
  
  
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      public int process(Vsammon9Ctx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
          ;
//  PERFORM 0000-MAINLINE
          mainline(programCtx);/*0000-MAINLINE*/
          if (programCtx.isProgramEnded()) {
              return programCtx.getRc();
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
      
       return programCtx.getRc(); // Exit with return code
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
      @Override
      public void mainline(Vsammon9Ctx programCtx) throws Exception {
//  PERFORM 1000-OPEN-FILES THRU 1000-EXIT
          openFiles(programCtx.getOpenFilesInCtx());/*1000-OPEN-FILES*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  PERFORM 2000-VSAM-OPERATIONS THRU 2000-EXIT
          vsamOperations(programCtx);/*2000-VSAM-OPERATIONS*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  PERFORM 3000-CLOSE-FILES THRU 3000-EXIT
          closeFiles(programCtx);/*3000-CLOSE-FILES*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//cobolCode::GO TO 9999-EXIT-PROGRAM
exitProgram(programCtx);
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
      @Override
      public OpenFilesOutCtx openFiles(OpenFilesInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			// End of variable declaration

      
// *----------------------------------------------------------------*

// *----------------------------------------------------------------*
Vsammon9Ctx programCtx = methodIn.getVsammon9Ctx();
OpenFilesOutCtx methodOut = methodIn.getOpenFilesOutCtx();
//  OPEN OUTPUT REPOUT
          repout.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),repout.getFileName(),repout.getRepoutCharSet(),repout.getRepoutCrlfFlag());
//  OPEN I-O MONITOR
          	monitor.setVsamCluster("VSAMMON9" /*program name*/);
          monitor.open("rw"); 
          methodOut.setMonitorFileStatus(monitor.getStatusString() );
//  IF MONITOR-FILE-STATUS NOT = '00'
//  LITERAL_00 = '00'
          if (		compareChars(methodOut.getMonitorFileStatus(),CONSTANTS.LITERAL_00) != 0 ) { 
//  MOVE SPACES TO REPREC
              methodOut.getReprec().setString(CONSTANTS.SPACE_300);
//  STRING 'Error opening Monitor: ' MONITOR-FILE-STATUS DELIMITED BY SIZE INTO REPREC END-STRING
              charArray = new ArrayList<char[]>();
                 charArray.add(CONSTANTS.LITERAL_Error_B3_openingMonitor_CL_);
                 charArray.add(methodOut.getMonitorFileStatus());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getReprec().toCharArray() ,joinCharArray);
              methodOut.getReprec().setString(  (char[])updated.get("string"));
//  WRITE REPREC END-WRITE
              repout.write(methodOut.getReprec().toCharArray()); 
              methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);
//cobolCode::GO TO 9999-EXIT-PROGRAM
exitProgram(programCtx);
 return methodOut;
//cobolCodeEnds::GO TO 9999-EXIT-PROGRAM
          }
          ;
      
      return methodOut;
      }
      /**
      * vsamOperations 
      *   This method is derived from 
  *   COBOL Paragraph - 2000-VSAM-OPERATIONS COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void vsamOperations(Vsammon9Ctx programCtx) throws Exception {
//  PERFORM 2001-VSAM-START-API THRU 2001-EXIT
          vsamStartApi(programCtx.getVsamStartApiInCtx());/*2001-VSAM-START-API*/
//  PERFORM 2002-VSAM-READ-API THRU 2002-EXIT
          vsamReadApi(programCtx.getVsamReadApiInCtx());/*2002-VSAM-READ-API*/
//  PERFORM 2003-VSAM-WRITE-API THRU 2003-EXIT
          vsamWriteApi(programCtx);/*2003-VSAM-WRITE-API*/
//  PERFORM 2004-VSAM-REWRITE-API THRU 2004-EXIT
          vsamRewriteApi(programCtx);/*2004-VSAM-REWRITE-API*/
//  PERFORM 2005-VSAM-DELETE-API THRU 2005-EXIT
          vsamDeleteApi(programCtx.getVsamDeleteApiInCtx());/*2005-VSAM-DELETE-API*/
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
      @Override
      public VsamStartApiOutCtx vsamStartApi(VsamStartApiInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			boolean invalidKey = false;
			// End of variable declaration

Vsammon9Ctx programCtx = methodIn.getVsammon9Ctx();
VsamStartApiOutCtx methodOut = methodIn.getVsamStartApiOutCtx();

// *
// * Valid key start scenario
// *
//  MOVE '2012-09-24' TO MON-XCDT-TSK-STRT-DT
//  LITERAL_2012_MN2_0924 = '2012-09-24'
          methodOut.setMonXcdtTskStrtDt(CONSTANTS.LITERAL_2012_MN2_0924);
//  MOVE '10.30.04' TO MON-XCDT-TSK-STRT-TM
//  LITERAL_674400346 = '10.30.04'
          methodOut.setMonXcdtTskStrtTm(CONSTANTS.LITERAL_674400346);
//  MOVE 'CASEIM02' TO MON-XCDT-PROG-NM
//  LITERAL_CASEIM02 = 'CASEIM02'
          methodOut.setMonXcdtProgNm(CONSTANTS.LITERAL_CASEIM02);
//  MOVE 'imsTestCase2' TO MON-XCDT-MTHD-NM
          methodOut.setMonXcdtMthdNm(CONSTANTS.LITERAL_133936805);
//  MOVE 0 TO MON-XCTOR-TSK-NO
//  LITERAL_0 = 0
          methodOut.setMonXctorTskNo(0);

// *
          // MOVE '**********' TO REPREC
          methodOut.getReprec().setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC END-WRITE
          repout.write(methodOut.getReprec().toCharArray()); 
          methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);
//  MOVE SPACES TO REPREC
          methodOut.getReprec().setString(CONSTANTS.SPACE_300);
//  STRING 'START >  PRIMARY KEY :  ' MON-PRI-KEY DELIMITED BY SIZE INTO REPREC END-STRING
          charArray = new ArrayList<char[]>();
             charArray.add(CONSTANTS.LITERAL_391649637);
             charArray.add(methodOut.getMonPriKey().toCharArray());
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
          updated = updateString(methodOut.getReprec().toCharArray() ,joinCharArray);
          methodOut.getReprec().setString(  (char[])updated.get("string"));
//  WRITE REPREC END-WRITE
          repout.write(methodOut.getReprec().toCharArray()); 
          methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);
          // MOVE '**********' TO REPREC
          methodOut.getReprec().setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC END-WRITE
          repout.write(methodOut.getReprec().toCharArray()); 
          methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);
//  MOVE SPACES TO WS-EOF-SW
          methodOut.setEofSw(CONSTANTS.SPACE);
//  START MONITOR KEY IS GREATER THAN MON-PRI-KEY
          monitor.seek(methodOut.getMonitorRecord().toCharArray(),CFConstants.CONDITION_GREATER_THAN,monitor.getKeyInfo().getMonPriKey()); 
          methodOut.setMonitorFileStatus(monitor.getStatusString() );
//  INVALID KEY
          invalidKey = monitor.isInvalidKey();
          if (invalidKey) {
           // MOVE '*Failure* VSAM API Invalid Key' TO REPREC
           methodOut.getReprec().setString(CONSTANTS.LITERAL_1311842444);
          //  WRITE REPREC END-WRITE
           repout.write(methodOut.getReprec().toCharArray()); 
           methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);
           }
//  NOT INVALID KEY
          else {
          //  READ MONITOR NEXT
           monitor.readNext();
           methodOut.setMonitorFileStatus(monitor.getStatusString() );
           if (!monitor.hasEnded()) {
           	methodOut.getMonitorRecord().setString(monitor.getRecord());
           }
           // MOVE MONITOR-RECORD TO REPREC
           methodOut.getReprec().setString(methodOut.getMonitorRecord().getCharArray());
          //  WRITE REPREC END-WRITE
           repout.write(methodOut.getReprec().toCharArray()); 
           methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);
           }
          // MOVE '**********' TO REPREC
          methodOut.getReprec().setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC END-WRITE
          repout.write(methodOut.getReprec().toCharArray()); 
          methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);

// *
// * Invalid key start scenario
// *
//  MOVE '9999-12-31' TO MON-XCDT-TSK-STRT-DT
//  LITERAL_9999_MN2_1231 = '9999-12-31'
          methodOut.setMonXcdtTskStrtDt(CONSTANTS.LITERAL_9999_MN2_1231);
//  MOVE '10.30.04' TO MON-XCDT-TSK-STRT-TM
//  LITERAL_674400346 = '10.30.04'
          methodOut.setMonXcdtTskStrtTm(CONSTANTS.LITERAL_674400346);
//  MOVE 'CASEIM02' TO MON-XCDT-PROG-NM
//  LITERAL_CASEIM02 = 'CASEIM02'
          methodOut.setMonXcdtProgNm(CONSTANTS.LITERAL_CASEIM02);
//  MOVE 'imsTestCase2' TO MON-XCDT-MTHD-NM
          methodOut.setMonXcdtMthdNm(CONSTANTS.LITERAL_133936805);
//  MOVE 0 TO MON-XCTOR-TSK-NO
//  LITERAL_0 = 0
          methodOut.setMonXctorTskNo(0);

// *
          // MOVE '**********' TO REPREC
          methodOut.getReprec().setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC END-WRITE
          repout.write(methodOut.getReprec().toCharArray()); 
          methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);
//  MOVE SPACES TO REPREC
          methodOut.getReprec().setString(CONSTANTS.SPACE_300);
//  STRING 'START >  PRIMARY KEY :  ' MON-PRI-KEY DELIMITED BY SIZE INTO REPREC END-STRING
          charArray = new ArrayList<char[]>();
             charArray.add(CONSTANTS.LITERAL_391649637);
             charArray.add(methodOut.getMonPriKey().toCharArray());
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
          updated = updateString(methodOut.getReprec().toCharArray() ,joinCharArray);
          methodOut.getReprec().setString(  (char[])updated.get("string"));
//  WRITE REPREC END-WRITE
          repout.write(methodOut.getReprec().toCharArray()); 
          methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);
          // MOVE '**********' TO REPREC
          methodOut.getReprec().setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC END-WRITE
          repout.write(methodOut.getReprec().toCharArray()); 
          methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);
//  MOVE SPACES TO WS-EOF-SW
          methodOut.setEofSw(CONSTANTS.SPACE);
//  START MONITOR KEY IS GREATER THAN MON-PRI-KEY
          monitor.seek(methodOut.getMonitorRecord().toCharArray(),CFConstants.CONDITION_GREATER_THAN,monitor.getKeyInfo().getMonPriKey()); 
          methodOut.setMonitorFileStatus(monitor.getStatusString() );
//  INVALID KEY
          invalidKey = monitor.isInvalidKey();
          if (invalidKey) {
           // MOVE '*Success* VSAM API Invalid Key' TO REPREC
           methodOut.getReprec().setString(CONSTANTS.LITERAL_1463958715);
          //  WRITE REPREC END-WRITE
           repout.write(methodOut.getReprec().toCharArray()); 
           methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);
           }
//  NOT INVALID KEY
          else {
           // MOVE '*Failure* VSAM API NOT Invalid Key' TO REPREC
           methodOut.getReprec().setString(CONSTANTS.LITERAL_1880771425);
          //  WRITE REPREC END-WRITE
           repout.write(methodOut.getReprec().toCharArray()); 
           methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);
           }
          // MOVE '**********' TO REPREC
          methodOut.getReprec().setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC
          repout.write(methodOut.getReprec().toCharArray()); 
          methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);
          ;
      
      return methodOut;
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
      @Override
      public VsamReadApiOutCtx vsamReadApi(VsamReadApiInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			boolean invalidKey = false;
			// End of variable declaration

Vsammon9Ctx programCtx = methodIn.getVsammon9Ctx();
VsamReadApiOutCtx methodOut = methodIn.getVsamReadApiOutCtx();

// *
// * Valid key read scenario
// *
//  MOVE '2012-09-24' TO MON-XCDT-TSK-STRT-DT
//  LITERAL_2012_MN2_0924 = '2012-09-24'
          methodOut.setMonXcdtTskStrtDt(CONSTANTS.LITERAL_2012_MN2_0924);
//  MOVE '10.30.04' TO MON-XCDT-TSK-STRT-TM
//  LITERAL_674400346 = '10.30.04'
          methodOut.setMonXcdtTskStrtTm(CONSTANTS.LITERAL_674400346);
//  MOVE 'CASEIM02' TO MON-XCDT-PROG-NM
//  LITERAL_CASEIM02 = 'CASEIM02'
          methodOut.setMonXcdtProgNm(CONSTANTS.LITERAL_CASEIM02);
//  MOVE 'imsTestCase2' TO MON-XCDT-MTHD-NM
          methodOut.setMonXcdtMthdNm(CONSTANTS.LITERAL_133936805);
//  MOVE 220 TO MON-XCTOR-TSK-NO
          methodOut.setMonXctorTskNo(220);

// *
          // MOVE '**********' TO REPREC
          methodOut.getReprec().setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC END-WRITE
          repout.write(methodOut.getReprec().toCharArray()); 
          methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);
//  MOVE SPACES TO REPREC
          methodOut.getReprec().setString(CONSTANTS.SPACE_300);
//  STRING 'READ  PRIMARY KEY :  ' MON-PRI-KEY DELIMITED BY SIZE INTO REPREC END-STRING
          charArray = new ArrayList<char[]>();
             charArray.add(CONSTANTS.LITERAL_READ_B6_PRIMARYKEYCL_);
             charArray.add(methodOut.getMonPriKey().toCharArray());
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
          updated = updateString(methodOut.getReprec().toCharArray() ,joinCharArray);
          methodOut.getReprec().setString(  (char[])updated.get("string"));
//  WRITE REPREC END-WRITE
          repout.write(methodOut.getReprec().toCharArray()); 
          methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);
          // MOVE '**********' TO REPREC
          methodOut.getReprec().setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC END-WRITE
          repout.write(methodOut.getReprec().toCharArray()); 
          methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);
//  MOVE SPACES TO WS-EOF-SW
          methodOut.setEofSw(CONSTANTS.SPACE);
//  READ MONITOR
          	monitor.readDirect(methodOut.getMonPriKey().toCharArray(),monitor.getKeyInfo().getMonPriKey());
          methodOut.setMonitorFileStatus(monitor.getStatusString() );
          if (!monitor.hasEnded()) {
          	methodOut.getMonitorRecord().setString(monitor.getRecord());
          }
//  INVALID KEY
          invalidKey = monitor.isInvalidKey();
          if (invalidKey) {
           // MOVE '*Failure* VSAM API Invalid Key' TO REPREC
           methodOut.getReprec().setString(CONSTANTS.LITERAL_1311842444);
          //  WRITE REPREC END-WRITE
           repout.write(methodOut.getReprec().toCharArray()); 
           methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);
           }
//  NOT INVALID KEY
          else {
           // MOVE MONITOR-RECORD TO REPREC
           methodOut.getReprec().setString(methodOut.getMonitorRecord().getCharArray());
          //  WRITE REPREC END-WRITE
           repout.write(methodOut.getReprec().toCharArray()); 
           methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);
           }
          // MOVE '**********' TO REPREC
          methodOut.getReprec().setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC END-WRITE
          repout.write(methodOut.getReprec().toCharArray()); 
          methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);

// *
// * Invalid key read scenario
// *
//  MOVE '9999-12-31' TO MON-XCDT-TSK-STRT-DT
//  LITERAL_9999_MN2_1231 = '9999-12-31'
          methodOut.setMonXcdtTskStrtDt(CONSTANTS.LITERAL_9999_MN2_1231);
//  MOVE '10.30.04' TO MON-XCDT-TSK-STRT-TM
//  LITERAL_674400346 = '10.30.04'
          methodOut.setMonXcdtTskStrtTm(CONSTANTS.LITERAL_674400346);
//  MOVE 'CASEIM02' TO MON-XCDT-PROG-NM
//  LITERAL_CASEIM02 = 'CASEIM02'
          methodOut.setMonXcdtProgNm(CONSTANTS.LITERAL_CASEIM02);
//  MOVE 'imsTestCase2' TO MON-XCDT-MTHD-NM
          methodOut.setMonXcdtMthdNm(CONSTANTS.LITERAL_133936805);
//  MOVE 0 TO MON-XCTOR-TSK-NO
//  LITERAL_0 = 0
          methodOut.setMonXctorTskNo(0);

// *
          // MOVE '**********' TO REPREC
          methodOut.getReprec().setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC END-WRITE
          repout.write(methodOut.getReprec().toCharArray()); 
          methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);
//  MOVE SPACES TO REPREC
          methodOut.getReprec().setString(CONSTANTS.SPACE_300);
//  STRING 'READ  PRIMARY KEY :  ' MON-PRI-KEY DELIMITED BY SIZE INTO REPREC END-STRING
          charArray = new ArrayList<char[]>();
             charArray.add(CONSTANTS.LITERAL_READ_B6_PRIMARYKEYCL_);
             charArray.add(methodOut.getMonPriKey().toCharArray());
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
          updated = updateString(methodOut.getReprec().toCharArray() ,joinCharArray);
          methodOut.getReprec().setString(  (char[])updated.get("string"));
//  WRITE REPREC END-WRITE
          repout.write(methodOut.getReprec().toCharArray()); 
          methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);
          // MOVE '**********' TO REPREC
          methodOut.getReprec().setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC END-WRITE
          repout.write(methodOut.getReprec().toCharArray()); 
          methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);
//  MOVE SPACES TO WS-EOF-SW
          methodOut.setEofSw(CONSTANTS.SPACE);
//  READ MONITOR
          	monitor.readDirect(methodOut.getMonPriKey().toCharArray(),monitor.getKeyInfo().getMonPriKey());
          methodOut.setMonitorFileStatus(monitor.getStatusString() );
          if (!monitor.hasEnded()) {
          	methodOut.getMonitorRecord().setString(monitor.getRecord());
          }
//  INVALID KEY
          invalidKey = monitor.isInvalidKey();
          if (invalidKey) {
           // MOVE '*Success* VSAM API Invalid Key' TO REPREC
           methodOut.getReprec().setString(CONSTANTS.LITERAL_1463958715);
          //  WRITE REPREC END-WRITE
           repout.write(methodOut.getReprec().toCharArray()); 
           methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);
           }
//  NOT INVALID KEY
          else {
           // MOVE '*Failure* VSAM API NOT Invalid Key' TO REPREC
           methodOut.getReprec().setString(CONSTANTS.LITERAL_1880771425);
          //  WRITE REPREC END-WRITE
           repout.write(methodOut.getReprec().toCharArray()); 
           methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);
           }
          // MOVE '**********' TO REPREC
          methodOut.getReprec().setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC
          repout.write(methodOut.getReprec().toCharArray()); 
          methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);
          ;
      
      return methodOut;
      }
      /**
      * vsamWriteApi 
      *   This method is derived from 
  *   COBOL Paragraph - 2003-VSAM-WRITE-API COBOL Cyclomatic complexity - 7
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void vsamWriteApi(Vsammon9Ctx programCtx) throws Exception {
//  PERFORM 2003-VSAM-WRITE-API-SPLIT0
          vsamWriteApiSplit0(programCtx.getVsamWriteApiSplit0InCtx());/*2003-VSAM-WRITE-API-SPLIT0*/
//  PERFORM 2003-VSAM-WRITE-API-SPLIT1
          vsamWriteApiSplit1(programCtx.getVsamWriteApiSplit1InCtx());/*2003-VSAM-WRITE-API-SPLIT1*/
      
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
      @Override
      public VsamWriteApiSplit0OutCtx vsamWriteApiSplit0(VsamWriteApiSplit0InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			boolean invalidKey = false;
			// End of variable declaration

Vsammon9Ctx programCtx = methodIn.getVsammon9Ctx();
VsamWriteApiSplit0OutCtx methodOut = methodIn.getVsamWriteApiSplit0OutCtx();

// *
// * Valid key write scenario
// *
//  MOVE '2050-09-24' TO MON-XCDT-TSK-STRT-DT
//  LITERAL_2050_MN2_0924 = '2050-09-24'
          methodOut.setMonXcdtTskStrtDt(CONSTANTS.LITERAL_2050_MN2_0924);
//  MOVE '10.30.04' TO MON-XCDT-TSK-STRT-TM
//  LITERAL_674400346 = '10.30.04'
          methodOut.setMonXcdtTskStrtTm(CONSTANTS.LITERAL_674400346);
//  MOVE 'CASEIM02' TO MON-XCDT-PROG-NM
//  LITERAL_CASEIM02 = 'CASEIM02'
          methodOut.setMonXcdtProgNm(CONSTANTS.LITERAL_CASEIM02);
//  MOVE 'imsTestCase2' TO MON-XCDT-MTHD-NM
          methodOut.setMonXcdtMthdNm(CONSTANTS.LITERAL_133936805);
//  MOVE 220 TO MON-XCTOR-TSK-NO
          methodOut.setMonXctorTskNo(220);
//  MOVE 'T60P' TO MON-XCTOR-SYS-ID
//  LITERAL_T60P = 'T60P'
          methodOut.setMonXctorSysId(CONSTANTS.LITERAL_T60P);
//  MOVE 'XML' TO MON-XCTOR-TRAN-ID
          methodOut.setMonXctorTranId(CONSTANTS.LITERAL_XML_B_);
//  MOVE 'A60P' TO MON-XCAOR-SYS-ID
//  LITERAL_A60P = 'A60P'
          methodOut.setMonXcaorSysId(CONSTANTS.LITERAL_A60P);
//  MOVE 221 TO MON-XCAOR-TSK-NO
          methodOut.setMonXcaorTskNo(221);
//  MOVE 'CA' TO MON-XCDT-PGM-TY-CD
          methodOut.setMonXcdtPgmTyCd(CONSTANTS.LITERAL_673788926);
//  MOVE '1.1.1.1' TO MON-XCDT-REQR-IP-AD
          methodOut.setMonXcdtReqrIpAd(CONSTANTS.LITERAL_1979067146);
          // MOVE 12 TO MON-XCDT-TSK-AOR-TM
          methodOut.setMonXcdtTskAorTm(12);
          // MOVE 14 TO MON-XCDT-TSK-ELPS-TM
          methodOut.setMonXcdtTskElpsTm(14);
//  MOVE 200 TO MON-XCDT-TSK-CMP-CD
          methodOut.setMonXcdtTskCmpCd((short)200);
          // MOVE 0 TO MON-XCDT-TSK-ABND-CD
          //  LITERAL_0 = 0
          methodOut.setMonXcdtTskAbndCd(CONSTANTS.LITERAL_0);
          // MOVE 1234 TO MON-XCDT-REQ-SZ
          methodOut.setMonXcdtReqSz(1234);
          // MOVE 5678 TO MON-XCDT-RESP-SZ
          methodOut.setMonXcdtRespSz(5678);
//  MOVE 'CLOUDFRAME' TO MON-USERTOKEN
          methodOut.setMonUsertoken(CONSTANTS.LITERAL_699011823);

// *
          // MOVE '**********' TO REPREC
          methodOut.getReprec().setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC END-WRITE
          repout.write(methodOut.getReprec().toCharArray()); 
          methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);
//  MOVE SPACES TO REPREC
          methodOut.getReprec().setString(CONSTANTS.SPACE_300);
//  STRING 'WRITE  PRIMARY KEY :  ' MON-PRI-KEY DELIMITED BY SIZE INTO REPREC END-STRING
          charArray = new ArrayList<char[]>();
             charArray.add(CONSTANTS.LITERAL_WRITE_B6_PRIMARYKEYCL_);
             charArray.add(methodIn.getMonPriKey().toCharArray());
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
          updated = updateString(methodOut.getReprec().toCharArray() ,joinCharArray);
          methodOut.getReprec().setString(  (char[])updated.get("string"));
//  WRITE REPREC END-WRITE
          repout.write(methodOut.getReprec().toCharArray()); 
          methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);
          // MOVE '**********' TO REPREC
          methodOut.getReprec().setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC END-WRITE
          repout.write(methodOut.getReprec().toCharArray()); 
          methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);
//  MOVE SPACES TO WS-EOF-SW
          methodOut.setEofSw(CONSTANTS.SPACE);
//  WRITE MONITOR-RECORD
          monitor.write(methodOut.getMonitorRecord().toCharArray()); 
          methodOut.setMonitorFileStatus(monitor.getStatusString() );
//  INVALID KEY
          invalidKey = monitor.isInvalidKey();
          if (invalidKey) {
           // MOVE '*Failure* VSAM API Invalid Key' TO REPREC
           methodOut.getReprec().setString(CONSTANTS.LITERAL_1311842444);
          //  WRITE REPREC END-WRITE
           repout.write(methodOut.getReprec().toCharArray()); 
           methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);
           }
//  NOT INVALID KEY
          else {
           // MOVE MONITOR-RECORD TO REPREC
           methodOut.getReprec().setString(methodOut.getMonitorRecord().getCharArray());
          //  WRITE REPREC END-WRITE
           repout.write(methodOut.getReprec().toCharArray()); 
           methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);
           }
          // MOVE '**********' TO REPREC
          methodOut.getReprec().setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC END-WRITE
          repout.write(methodOut.getReprec().toCharArray()); 
          methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);

// *
// * Invalid key write scenario
// *
//  MOVE '2012-09-24' TO MON-XCDT-TSK-STRT-DT
//  LITERAL_2012_MN2_0924 = '2012-09-24'
          methodOut.setMonXcdtTskStrtDt(CONSTANTS.LITERAL_2012_MN2_0924);
//  MOVE '10.30.04' TO MON-XCDT-TSK-STRT-TM
//  LITERAL_674400346 = '10.30.04'
          methodOut.setMonXcdtTskStrtTm(CONSTANTS.LITERAL_674400346);
//  MOVE 'CASEIM02' TO MON-XCDT-PROG-NM
//  LITERAL_CASEIM02 = 'CASEIM02'
          methodOut.setMonXcdtProgNm(CONSTANTS.LITERAL_CASEIM02);
//  MOVE 'imsTestCase2' TO MON-XCDT-MTHD-NM
          methodOut.setMonXcdtMthdNm(CONSTANTS.LITERAL_133936805);
//  MOVE 220 TO MON-XCTOR-TSK-NO
          methodOut.setMonXctorTskNo(220);
//  MOVE 'T60P' TO MON-XCTOR-SYS-ID
//  LITERAL_T60P = 'T60P'
          methodOut.setMonXctorSysId(CONSTANTS.LITERAL_T60P);
//  MOVE 'XML' TO MON-XCTOR-TRAN-ID
          methodOut.setMonXctorTranId(CONSTANTS.LITERAL_XML_B_);
//  MOVE 'A60P' TO MON-XCAOR-SYS-ID
//  LITERAL_A60P = 'A60P'
          methodOut.setMonXcaorSysId(CONSTANTS.LITERAL_A60P);
//  MOVE 221 TO MON-XCAOR-TSK-NO
          methodOut.setMonXcaorTskNo(221);
//  MOVE 'CA' TO MON-XCDT-PGM-TY-CD
          methodOut.setMonXcdtPgmTyCd(CONSTANTS.LITERAL_673788926);
//  MOVE '1.1.1.1' TO MON-XCDT-REQR-IP-AD
          methodOut.setMonXcdtReqrIpAd(CONSTANTS.LITERAL_1979067146);
          // MOVE 12 TO MON-XCDT-TSK-AOR-TM
          methodOut.setMonXcdtTskAorTm(12);
          // MOVE 14 TO MON-XCDT-TSK-ELPS-TM
          methodOut.setMonXcdtTskElpsTm(14);
//  MOVE 200 TO MON-XCDT-TSK-CMP-CD
          methodOut.setMonXcdtTskCmpCd((short)200);
          // MOVE 0 TO MON-XCDT-TSK-ABND-CD
          //  LITERAL_0 = 0
          methodOut.setMonXcdtTskAbndCd(CONSTANTS.LITERAL_0);
          // MOVE 1234 TO MON-XCDT-REQ-SZ
          methodOut.setMonXcdtReqSz(1234);
          // MOVE 5678 TO MON-XCDT-RESP-SZ
          methodOut.setMonXcdtRespSz(5678);
//  MOVE 'CLOUDFRAME' TO MON-USERTOKEN
          methodOut.setMonUsertoken(CONSTANTS.LITERAL_699011823);

// *
          // MOVE '**********' TO REPREC
          methodOut.getReprec().setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC END-WRITE
          repout.write(methodOut.getReprec().toCharArray()); 
          methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);
      
      return methodOut;
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
      @Override
      public VsamWriteApiSplit1OutCtx vsamWriteApiSplit1(VsamWriteApiSplit1InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			boolean invalidKey = false;
			// End of variable declaration

Vsammon9Ctx programCtx = methodIn.getVsammon9Ctx();
VsamWriteApiSplit1OutCtx methodOut = methodIn.getVsamWriteApiSplit1OutCtx();
//  MOVE SPACES TO REPREC
          methodOut.getReprec().setString(CONSTANTS.SPACE_300);
//  STRING 'WRITE  PRIMARY KEY :  ' MON-PRI-KEY DELIMITED BY SIZE INTO REPREC END-STRING
          charArray = new ArrayList<char[]>();
             charArray.add(CONSTANTS.LITERAL_WRITE_B6_PRIMARYKEYCL_);
             charArray.add(methodIn.getMonPriKey().toCharArray());
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
          updated = updateString(methodOut.getReprec().toCharArray() ,joinCharArray);
          methodOut.getReprec().setString(  (char[])updated.get("string"));
//  WRITE REPREC END-WRITE
          repout.write(methodOut.getReprec().toCharArray()); 
          methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);
          // MOVE '**********' TO REPREC
          methodOut.getReprec().setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC END-WRITE
          repout.write(methodOut.getReprec().toCharArray()); 
          methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);
//  MOVE SPACES TO WS-EOF-SW
          methodOut.setEofSw(CONSTANTS.SPACE);
//  WRITE MONITOR-RECORD
          monitor.write(methodOut.getMonitorRecord().toCharArray()); 
          methodOut.setMonitorFileStatus(monitor.getStatusString() );
//  INVALID KEY
          invalidKey = monitor.isInvalidKey();
          if (invalidKey) {
           // MOVE '*Success* VSAM API Invalid Key' TO REPREC
           methodOut.getReprec().setString(CONSTANTS.LITERAL_1463958715);
          //  WRITE REPREC END-WRITE
           repout.write(methodOut.getReprec().toCharArray()); 
           methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);
           }
//  NOT INVALID KEY
          else {
           // MOVE '*Failure* VSAM API NOT Invalid Key' TO REPREC
           methodOut.getReprec().setString(CONSTANTS.LITERAL_1880771425);
          //  WRITE REPREC END-WRITE
           repout.write(methodOut.getReprec().toCharArray()); 
           methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);
           }
          // MOVE '**********' TO REPREC
          methodOut.getReprec().setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC
          repout.write(methodOut.getReprec().toCharArray()); 
          methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);
          ;
      
      return methodOut;
      }
      /**
      * vsamRewriteApi 
      *   This method is derived from 
  *   COBOL Paragraph - 2004-VSAM-REWRITE-API COBOL Cyclomatic complexity - 7
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void vsamRewriteApi(Vsammon9Ctx programCtx) throws Exception {
//  PERFORM 2004-VSAM-REWRITE-API-SPLIT2
          vsamRewriteApiSplit2(programCtx.getVsamRewriteApiSplit2InCtx());/*2004-VSAM-REWRITE-API-SPLIT2*/
//  PERFORM 2004-VSAM-REWRITE-API-SPLIT3
          vsamRewriteApiSplit3(programCtx.getVsamRewriteApiSplit3InCtx());/*2004-VSAM-REWRITE-API-SPLIT3*/
      
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
      @Override
      public VsamRewriteApiSplit2OutCtx vsamRewriteApiSplit2(VsamRewriteApiSplit2InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			boolean invalidKey = false;
			// End of variable declaration

Vsammon9Ctx programCtx = methodIn.getVsammon9Ctx();
VsamRewriteApiSplit2OutCtx methodOut = methodIn.getVsamRewriteApiSplit2OutCtx();

// *
// * Valid key rewrite scenario
// *
//  MOVE '2050-09-24' TO MON-XCDT-TSK-STRT-DT
//  LITERAL_2050_MN2_0924 = '2050-09-24'
          methodOut.setMonXcdtTskStrtDt(CONSTANTS.LITERAL_2050_MN2_0924);
//  MOVE '10.30.04' TO MON-XCDT-TSK-STRT-TM
//  LITERAL_674400346 = '10.30.04'
          methodOut.setMonXcdtTskStrtTm(CONSTANTS.LITERAL_674400346);
//  MOVE 'CASEIM02' TO MON-XCDT-PROG-NM
//  LITERAL_CASEIM02 = 'CASEIM02'
          methodOut.setMonXcdtProgNm(CONSTANTS.LITERAL_CASEIM02);
//  MOVE 'imsTestCase2' TO MON-XCDT-MTHD-NM
          methodOut.setMonXcdtMthdNm(CONSTANTS.LITERAL_133936805);
//  MOVE 220 TO MON-XCTOR-TSK-NO
          methodOut.setMonXctorTskNo(220);
//  MOVE 'TORP' TO MON-XCTOR-SYS-ID
//  LITERAL_TORP = 'TORP'
          methodOut.setMonXctorSysId(CONSTANTS.LITERAL_TORP);
//  MOVE 'XML' TO MON-XCTOR-TRAN-ID
          methodOut.setMonXctorTranId(CONSTANTS.LITERAL_XML_B_);
//  MOVE 'AORP' TO MON-XCAOR-SYS-ID
//  LITERAL_AORP = 'AORP'
          methodOut.setMonXcaorSysId(CONSTANTS.LITERAL_AORP);
//  MOVE 221 TO MON-XCAOR-TSK-NO
          methodOut.setMonXcaorTskNo(221);
//  MOVE 'CA' TO MON-XCDT-PGM-TY-CD
          methodOut.setMonXcdtPgmTyCd(CONSTANTS.LITERAL_673788926);
//  MOVE '2.2.2.2' TO MON-XCDT-REQR-IP-AD
          methodOut.setMonXcdtReqrIpAd(CONSTANTS.LITERAL_895543558);
          // MOVE 12 TO MON-XCDT-TSK-AOR-TM
          methodOut.setMonXcdtTskAorTm(12);
          // MOVE 14 TO MON-XCDT-TSK-ELPS-TM
          methodOut.setMonXcdtTskElpsTm(14);
//  MOVE 200 TO MON-XCDT-TSK-CMP-CD
          methodOut.setMonXcdtTskCmpCd((short)200);
          // MOVE 0 TO MON-XCDT-TSK-ABND-CD
          //  LITERAL_0 = 0
          methodOut.setMonXcdtTskAbndCd(CONSTANTS.LITERAL_0);
          // MOVE 1234 TO MON-XCDT-REQ-SZ
          methodOut.setMonXcdtReqSz(1234);
          // MOVE 5678 TO MON-XCDT-RESP-SZ
          methodOut.setMonXcdtRespSz(5678);
//  MOVE 'CLOUDFRAME' TO MON-USERTOKEN
          methodOut.setMonUsertoken(CONSTANTS.LITERAL_699011823);

// *
          // MOVE '**********' TO REPREC
          methodOut.getReprec().setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC END-WRITE
          repout.write(methodOut.getReprec().toCharArray()); 
          methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);
//  MOVE SPACES TO REPREC
          methodOut.getReprec().setString(CONSTANTS.SPACE_300);
//  STRING 'REWRITE  PRIMARY KEY :  ' MON-PRI-KEY DELIMITED BY SIZE INTO REPREC END-STRING
          charArray = new ArrayList<char[]>();
             charArray.add(CONSTANTS.LITERAL_REWRITE_B6_PRIMARYKEYCL_);
             charArray.add(methodIn.getMonPriKey().toCharArray());
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
          updated = updateString(methodOut.getReprec().toCharArray() ,joinCharArray);
          methodOut.getReprec().setString(  (char[])updated.get("string"));
//  WRITE REPREC END-WRITE
          repout.write(methodOut.getReprec().toCharArray()); 
          methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);
          // MOVE '**********' TO REPREC
          methodOut.getReprec().setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC END-WRITE
          repout.write(methodOut.getReprec().toCharArray()); 
          methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);
//  MOVE SPACES TO WS-EOF-SW
          methodOut.setEofSw(CONSTANTS.SPACE);
//  REWRITE MONITOR-RECORD
          monitor.rewrite(methodOut.getMonitorRecord().toCharArray());
          methodOut.setMonitorFileStatus(monitor.getStatusString() );
//  INVALID KEY
          invalidKey = monitor.isInvalidKey();
          if (invalidKey) {
           // MOVE '*Failure* VSAM API Invalid Key' TO REPREC
           methodOut.getReprec().setString(CONSTANTS.LITERAL_1311842444);
          //  WRITE REPREC END-WRITE
           repout.write(methodOut.getReprec().toCharArray()); 
           methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);
           }
//  NOT INVALID KEY
          else {
           // MOVE MONITOR-RECORD TO REPREC
           methodOut.getReprec().setString(methodOut.getMonitorRecord().getCharArray());
          //  WRITE REPREC END-WRITE
           repout.write(methodOut.getReprec().toCharArray()); 
           methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);
           }
          // MOVE '**********' TO REPREC
          methodOut.getReprec().setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC END-WRITE
          repout.write(methodOut.getReprec().toCharArray()); 
          methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);

// *
// * Invalid key write scenario
// *
//  MOVE '2012-09-24' TO MON-XCDT-TSK-STRT-DT
//  LITERAL_2012_MN2_0924 = '2012-09-24'
          methodOut.setMonXcdtTskStrtDt(CONSTANTS.LITERAL_2012_MN2_0924);
//  MOVE '11.30.04' TO MON-XCDT-TSK-STRT-TM
//  LITERAL_1877756615 = '11.30.04'
          methodOut.setMonXcdtTskStrtTm(CONSTANTS.LITERAL_1877756615);
//  MOVE 'CASEIM02' TO MON-XCDT-PROG-NM
//  LITERAL_CASEIM02 = 'CASEIM02'
          methodOut.setMonXcdtProgNm(CONSTANTS.LITERAL_CASEIM02);
//  MOVE 'imsTestCase2' TO MON-XCDT-MTHD-NM
          methodOut.setMonXcdtMthdNm(CONSTANTS.LITERAL_133936805);
//  MOVE 220 TO MON-XCTOR-TSK-NO
          methodOut.setMonXctorTskNo(220);
//  MOVE 'T60P' TO MON-XCTOR-SYS-ID
//  LITERAL_T60P = 'T60P'
          methodOut.setMonXctorSysId(CONSTANTS.LITERAL_T60P);
//  MOVE 'XML' TO MON-XCTOR-TRAN-ID
          methodOut.setMonXctorTranId(CONSTANTS.LITERAL_XML_B_);
//  MOVE 'A60P' TO MON-XCAOR-SYS-ID
//  LITERAL_A60P = 'A60P'
          methodOut.setMonXcaorSysId(CONSTANTS.LITERAL_A60P);
//  MOVE 221 TO MON-XCAOR-TSK-NO
          methodOut.setMonXcaorTskNo(221);
//  MOVE 'CA' TO MON-XCDT-PGM-TY-CD
          methodOut.setMonXcdtPgmTyCd(CONSTANTS.LITERAL_673788926);
//  MOVE '1.1.1.1' TO MON-XCDT-REQR-IP-AD
          methodOut.setMonXcdtReqrIpAd(CONSTANTS.LITERAL_1979067146);
          // MOVE 12 TO MON-XCDT-TSK-AOR-TM
          methodOut.setMonXcdtTskAorTm(12);
          // MOVE 14 TO MON-XCDT-TSK-ELPS-TM
          methodOut.setMonXcdtTskElpsTm(14);
//  MOVE 200 TO MON-XCDT-TSK-CMP-CD
          methodOut.setMonXcdtTskCmpCd((short)200);
          // MOVE 0 TO MON-XCDT-TSK-ABND-CD
          //  LITERAL_0 = 0
          methodOut.setMonXcdtTskAbndCd(CONSTANTS.LITERAL_0);
          // MOVE 1234 TO MON-XCDT-REQ-SZ
          methodOut.setMonXcdtReqSz(1234);
          // MOVE 5678 TO MON-XCDT-RESP-SZ
          methodOut.setMonXcdtRespSz(5678);
//  MOVE 'CLOUDFRAME' TO MON-USERTOKEN
          methodOut.setMonUsertoken(CONSTANTS.LITERAL_699011823);

// *
          // MOVE '**********' TO REPREC
          methodOut.getReprec().setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC END-WRITE
          repout.write(methodOut.getReprec().toCharArray()); 
          methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);
      
      return methodOut;
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
      @Override
      public VsamRewriteApiSplit3OutCtx vsamRewriteApiSplit3(VsamRewriteApiSplit3InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			boolean invalidKey = false;
			// End of variable declaration

Vsammon9Ctx programCtx = methodIn.getVsammon9Ctx();
VsamRewriteApiSplit3OutCtx methodOut = methodIn.getVsamRewriteApiSplit3OutCtx();
//  MOVE SPACES TO REPREC
          methodOut.getReprec().setString(CONSTANTS.SPACE_300);
//  STRING 'REWRITE  PRIMARY KEY :  ' MON-PRI-KEY DELIMITED BY SIZE INTO REPREC END-STRING
          charArray = new ArrayList<char[]>();
             charArray.add(CONSTANTS.LITERAL_REWRITE_B6_PRIMARYKEYCL_);
             charArray.add(methodIn.getMonPriKey().toCharArray());
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
          updated = updateString(methodOut.getReprec().toCharArray() ,joinCharArray);
          methodOut.getReprec().setString(  (char[])updated.get("string"));
//  WRITE REPREC END-WRITE
          repout.write(methodOut.getReprec().toCharArray()); 
          methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);
          // MOVE '**********' TO REPREC
          methodOut.getReprec().setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC END-WRITE
          repout.write(methodOut.getReprec().toCharArray()); 
          methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);
//  MOVE SPACES TO WS-EOF-SW
          methodOut.setEofSw(CONSTANTS.SPACE);
//  REWRITE MONITOR-RECORD
          monitor.rewrite(methodOut.getMonitorRecord().toCharArray());
          methodOut.setMonitorFileStatus(monitor.getStatusString() );
//  INVALID KEY
          invalidKey = monitor.isInvalidKey();
          if (invalidKey) {
           // MOVE '*Success* VSAM API Invalid Key' TO REPREC
           methodOut.getReprec().setString(CONSTANTS.LITERAL_1463958715);
          //  WRITE REPREC END-WRITE
           repout.write(methodOut.getReprec().toCharArray()); 
           methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);
           }
//  NOT INVALID KEY
          else {
           // MOVE '*Failure* VSAM API NOT Invalid Key' TO REPREC
           methodOut.getReprec().setString(CONSTANTS.LITERAL_1880771425);
          //  WRITE REPREC END-WRITE
           repout.write(methodOut.getReprec().toCharArray()); 
           methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);
           }
          // MOVE '**********' TO REPREC
          methodOut.getReprec().setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC
          repout.write(methodOut.getReprec().toCharArray()); 
          methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);
          ;
      
      return methodOut;
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
      @Override
      public VsamDeleteApiOutCtx vsamDeleteApi(VsamDeleteApiInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			boolean invalidKey = false;
			// End of variable declaration

Vsammon9Ctx programCtx = methodIn.getVsammon9Ctx();
VsamDeleteApiOutCtx methodOut = methodIn.getVsamDeleteApiOutCtx();

// *
// * Valid key delete scenario
// *
//  MOVE '2050-09-24' TO MON-XCDT-TSK-STRT-DT
//  LITERAL_2050_MN2_0924 = '2050-09-24'
          methodOut.setMonXcdtTskStrtDt(CONSTANTS.LITERAL_2050_MN2_0924);
//  MOVE '10.30.04' TO MON-XCDT-TSK-STRT-TM
//  LITERAL_674400346 = '10.30.04'
          methodOut.setMonXcdtTskStrtTm(CONSTANTS.LITERAL_674400346);
//  MOVE 'CASEIM02' TO MON-XCDT-PROG-NM
//  LITERAL_CASEIM02 = 'CASEIM02'
          methodOut.setMonXcdtProgNm(CONSTANTS.LITERAL_CASEIM02);
//  MOVE 'imsTestCase2' TO MON-XCDT-MTHD-NM
          methodOut.setMonXcdtMthdNm(CONSTANTS.LITERAL_133936805);
//  MOVE 220 TO MON-XCTOR-TSK-NO
          methodOut.setMonXctorTskNo(220);

// *
          // MOVE '**********' TO REPREC
          methodOut.getReprec().setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC END-WRITE
          repout.write(methodOut.getReprec().toCharArray()); 
          methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);
//  MOVE SPACES TO REPREC
          methodOut.getReprec().setString(CONSTANTS.SPACE_300);
//  STRING 'DELETE  PRIMARY KEY :  ' MON-PRI-KEY DELIMITED BY SIZE INTO REPREC END-STRING
          charArray = new ArrayList<char[]>();
             charArray.add(CONSTANTS.LITERAL_DELETE_B6_PRIMARYKEYCL_);
             charArray.add(methodIn.getMonPriKey().toCharArray());
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
          updated = updateString(methodOut.getReprec().toCharArray() ,joinCharArray);
          methodOut.getReprec().setString(  (char[])updated.get("string"));
//  WRITE REPREC END-WRITE
          repout.write(methodOut.getReprec().toCharArray()); 
          methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);
          // MOVE '**********' TO REPREC
          methodOut.getReprec().setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC END-WRITE
          repout.write(methodOut.getReprec().toCharArray()); 
          methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);
//  MOVE SPACES TO WS-EOF-SW
          methodOut.setEofSw(CONSTANTS.SPACE);
//  DELETE MONITOR
          monitor.delete(methodIn.getMonPriKey().toCharArray());
          methodOut.setMonitorFileStatus(monitor.getStatusString() );
//  INVALID KEY
          invalidKey = monitor.isInvalidKey();
          if (invalidKey) {
           // MOVE '*Failure* VSAM API Invalid Key' TO REPREC
           methodOut.getReprec().setString(CONSTANTS.LITERAL_1311842444);
          //  WRITE REPREC END-WRITE
           repout.write(methodOut.getReprec().toCharArray()); 
           methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);
           }
//  NOT INVALID KEY
          else {
           // MOVE MONITOR-RECORD TO REPREC
           methodOut.getReprec().setString(methodOut.getMonitorRecord().getCharArray());
          //  WRITE REPREC END-WRITE
           repout.write(methodOut.getReprec().toCharArray()); 
           methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);
           }
          // MOVE '**********' TO REPREC
          methodOut.getReprec().setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC END-WRITE
          repout.write(methodOut.getReprec().toCharArray()); 
          methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);

// *
// * Invalid key delete scenario
// *
//  MOVE '9999-12-31' TO MON-XCDT-TSK-STRT-DT
//  LITERAL_9999_MN2_1231 = '9999-12-31'
          methodOut.setMonXcdtTskStrtDt(CONSTANTS.LITERAL_9999_MN2_1231);
//  MOVE '10.30.04' TO MON-XCDT-TSK-STRT-TM
//  LITERAL_674400346 = '10.30.04'
          methodOut.setMonXcdtTskStrtTm(CONSTANTS.LITERAL_674400346);
//  MOVE 'CASEIM02' TO MON-XCDT-PROG-NM
//  LITERAL_CASEIM02 = 'CASEIM02'
          methodOut.setMonXcdtProgNm(CONSTANTS.LITERAL_CASEIM02);
//  MOVE 'imsTestCase2' TO MON-XCDT-MTHD-NM
          methodOut.setMonXcdtMthdNm(CONSTANTS.LITERAL_133936805);
//  MOVE 0 TO MON-XCTOR-TSK-NO
//  LITERAL_0 = 0
          methodOut.setMonXctorTskNo(0);

// *
          // MOVE '**********' TO REPREC
          methodOut.getReprec().setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC END-WRITE
          repout.write(methodOut.getReprec().toCharArray()); 
          methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);
//  MOVE SPACES TO REPREC
          methodOut.getReprec().setString(CONSTANTS.SPACE_300);
//  STRING 'DELETE  PRIMARY KEY :  ' MON-PRI-KEY DELIMITED BY SIZE INTO REPREC END-STRING
          charArray = new ArrayList<char[]>();
             charArray.add(CONSTANTS.LITERAL_DELETE_B6_PRIMARYKEYCL_);
             charArray.add(methodIn.getMonPriKey().toCharArray());
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
          updated = updateString(methodOut.getReprec().toCharArray() ,joinCharArray);
          methodOut.getReprec().setString(  (char[])updated.get("string"));
//  WRITE REPREC END-WRITE
          repout.write(methodOut.getReprec().toCharArray()); 
          methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);
          // MOVE '**********' TO REPREC
          methodOut.getReprec().setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC END-WRITE
          repout.write(methodOut.getReprec().toCharArray()); 
          methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);
//  MOVE SPACES TO WS-EOF-SW
          methodOut.setEofSw(CONSTANTS.SPACE);
//  DELETE MONITOR
          monitor.delete(methodIn.getMonPriKey().toCharArray());
          methodOut.setMonitorFileStatus(monitor.getStatusString() );
//  INVALID KEY
          invalidKey = monitor.isInvalidKey();
          if (invalidKey) {
           // MOVE '*Success* VSAM API Invalid Key' TO REPREC
           methodOut.getReprec().setString(CONSTANTS.LITERAL_1463958715);
          //  WRITE REPREC END-WRITE
           repout.write(methodOut.getReprec().toCharArray()); 
           methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);
           }
//  NOT INVALID KEY
          else {
           // MOVE '*Failure* VSAM API NOT Invalid Key' TO REPREC
           methodOut.getReprec().setString(CONSTANTS.LITERAL_1880771425);
          //  WRITE REPREC END-WRITE
           repout.write(methodOut.getReprec().toCharArray()); 
           methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);
           }
          // MOVE '**********' TO REPREC
          methodOut.getReprec().setString(CONSTANTS.LITERAL_2015391037);
//  WRITE REPREC
          repout.write(methodOut.getReprec().toCharArray()); 
          methodOut.getReprec().setString(CONSTANTS.LOW_VALUE_215695350);
          ;
      
      return methodOut;
      }
      /**
      * closeFiles 
      *   This method is derived from 
  *   COBOL Paragraph - 3000-CLOSE-FILES COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public CloseFilesOutCtx closeFiles(Vsammon9Ctx programCtx) throws Exception {
      
// *----------------------------------------------------------------*

// *----------------------------------------------------------------*
CloseFilesOutCtx methodOut = programCtx.getCloseFilesOutCtx();
//  CLOSE MONITOR
          monitor.close(); 
          methodOut.setMonitorFileStatus(monitor.getStatusString() );
//  CLOSE REPOUT
          repout.close(); 
          ;
      
      return methodOut;
      }
      /**
      * exitProgram 
      *   This method is derived from 
  *   COBOL Paragraph - 9999-EXIT-PROGRAM COBOL Cyclomatic complexity - 2
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void exitProgram(Vsammon9Ctx programCtx) throws Exception {
      
// *----------------------------------------------------------------*

// *----------------------------------------------------------------*
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return ;
      
      }
  
  
  
  
  
  
  
  
  }
