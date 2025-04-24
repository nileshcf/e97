  package com.cloudframe.app.process.impl;
  /* 
*-----------------------------------------------------------------
*          -- -- -- c o n f i d e n t i a l -- -- --
*    this item contains information and procedures which are
*    proprietary to mastercard international, incorporated,
*    and which are confidential.  it is provided with the
*    express understanding that it is to be used only for the
*    benefit of interbank card association, and is not to be
*    used, copied, or disclosed for any other purpose.  any
*    authorized reproduction (in whole or in part) of this
*    material must be marked with this legend.
*-----------------------------------------------------------------
* author.        gopinath joshi
* date-written.  october, 2000.
* security.      property of mastercard international, inc.
*-----------------------------------------------------------------
* program function:
*-----------------------------------------------------------------
*
* this api reads the optimized parameter file, a vsam ksds file.
*
*-----------------------------------------------------------------
* revision history:
*-----------------------------------------------------------------
*
*    project         :ses ipm pre-edit
*    date            :1999/12/07
*    version         :001.00
*    programmer      :joshi gopinath - isc
*    modification    :initial version
*-----------------------------------------------------------------
*    project         :ses clearing
*    date            :2000/10/02
*    version         :002.00
*    programmer      :steve callahan
*    modification    :one-day file changed from sequential file
*                    :to vsam (ksds).
*-----------------------------------------------------------------
*    project         :ses clearing
*    date            :2001/04/03
*    version         :002.00
*    programmer      :steve callahan
*    modification    :correct end-of-file handling
*-----------------------------------------------------------------
*    project         :gcms release 3.1                           *
*    date            :2002/05/03                                 *
*    version         :001.02                                     *
*    programmer      :isc                                        *
*    modification    :modified to call ip996010 to display       *
*                     execution messages.                        *
*-----------------------------------------------------------------
* project      :gcms release 3.1
* date         :2003/04/04
* modification :recompile for ip996010
*----------------------------------------------------------------*
* project      :gcms release 10.1 - scr07039
* date         :2010/04/16
* programmer   :wipro
* modification :modified to eliminate compiler warning
*               messages.
*----------------------------------------------------------------*
* project      :asi12q411 release - scr08136
* date         :2012/11/07
* programmer   :wipro
* modification :removed 'process' statement from first line.
*----------------------------------------------------------------*
*----------------------------------------------------------------*
*    project         :gcms release 18.q4                         *
*                     lcms and mds batch on-soil migration       *
*    date            :2018/06/06                                 *
*    programmer      :wipro                                      *
*    modification    :program modified to include the compiler   *
*                     directives to support in linux             *
*----------------------------------------------------------------*
*/
  
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.ip650010.file.*;
  import com.cloudframe.app.ip650010.Ip650010Ctx.*;
  import com.cloudframe.app.ip650010.Ip650010Ctx;
  import com.cloudframe.app.process.Ip650010;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.utility.CFConstants;
  import com.cloudframe.app.ip650010.file.records.Sys007TableKeyAll;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.ip650010.dto.*;
  import com.cloudframe.app.ip650010.dto.RecordsReadMessage640;
  import com.cloudframe.app.ip650010.dto.FileOpenError600;
  import com.cloudframe.app.ip650010.dto.FileReadError620;
  import com.cloudframe.app.global.sharedvar.Ip50005OneDayRec;
  import com.cloudframe.app.global.sharedvar.CurrentTableKey800;
  import com.cloudframe.app.ip650010.dto.FileStartError610;
  import com.cloudframe.app.ip650010.dto.AbendParaName900;
  import com.cloudframe.app.ip650010.dto.FileCloseError630;
  import com.cloudframe.app.ip650010.dto.AbendMessage900;
  import com.cloudframe.app.ip650010.file.records.Sys007OptimizedParmRecGroup;
  import com.cloudframe.app.global.sharedvar.Ip50005OneDayRecLthGroup;
  import com.cloudframe.app.global.sharedvar.Ip50005OneDayReadStatusGroup;
  import com.cloudframe.app.global.sharedvar.Ip50005ClearingDtTm;
  import com.cloudframe.app.global.sharedvar.Ip60001EventLogWorkArea;
  import com.cloudframe.app.global.sharedvar.Ip996011ProgramStartMessage;
  import com.cloudframe.app.ip650010.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("ip650010")
  
  public class Ip650010Impl extends CommonProcess implements Ip650010 {
  
  Logger logger = LoggerFactory.getLogger(Ip650010Impl.class);
  
  
  
  
  @Autowired 
  @Qualifier("ip650010_sys007OptimizedParmFile")
  Sys007OptimizedParmFile sys007OptimizedParmFile;
  
  
  
  
  
  
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      public int process(Ip650010Ctx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
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
      		if(sys007OptimizedParmFile.hasOpened() && !sys007OptimizedParmFile.isReadOnly()) { 
      			sys007OptimizedParmFile.flush(); 
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

      * - ip50005ReadTableId             COBOL Name: IP50005-READ-TABLE-ID
      *
      * Output : None 

      * @throws CFException
      */
      @Override
      public void mainline(MainlineInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// * When this program is called for first time, it does
// * initializations.
// * then it reads the optimized parm file. the return
// *-----------------------------------------------------------------
Ip650010Ctx programCtx = methodIn.getIp650010Ctx();
//  PERFORM 1000-INITIALIZE
          initialize(programCtx.getInitializeInCtx());/*1000-INITIALIZE*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  IF 88-IP50005-CLOSE-INDICATOR
          if ( methodIn.isIp50005CloseIndicator88()  ) { 
//  PERFORM 8200-CLOSE-FILE-CHECK-STATUS
              closeFileCheckStatus(programCtx.getCloseFileCheckStatusInCtx());/*8200-CLOSE-FILE-CHECK-STATUS*/
              if (programCtx.isProgramEnded()) {
                  return ;
              }
          }
//  ELSE
          else { 
//  PERFORM 2000-READ-BUILD-RETURN-DATA
              readBuildReturnData(programCtx.getReadBuildReturnDataInCtx());/*2000-READ-BUILD-RETURN-DATA*/
              if (programCtx.isProgramEnded()) {
                  return ;
              }
          }
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return ;
      
      }
      /**
      * initialize 
      *   This method is derived from 
  *   COBOL Paragraph - 1000-INITIALIZE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - isItTheFirstTime100            COBOL Name: 100-IS-IT-THE-FIRST-TIME
      *
      * Output :  

      * - isItTheFirstTime100            COBOL Name: 100-IS-IT-THE-FIRST-TIME
      *
      * @throws CFException
      */
      @Override
      public InitializeOutCtx initialize(InitializeInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// * The event log is filled and the optimized parm file is opened if
// * necessary.
// *-----------------------------------------------------------------
Ip650010Ctx programCtx = methodIn.getIp650010Ctx();
InitializeOutCtx methodOut = methodIn.getInitializeOutCtx();
//  IF 88-100-IT-IS-FIRST-TIME
          if ( methodIn.isItIsFirstTime88100()  ) { 
//  PERFORM 1200-OPEN-OPT-PARM-FILE
              openOptParmFile(programCtx.getOpenOptParmFileInCtx());/*1200-OPEN-OPT-PARM-FILE*/
//  SET 88-100-IT-IS-NOT-FIRST-TIME TO TRUE
              methodOut.setItIsNotFirstTime88100True(); 
              
          }
      
      return methodOut;
      }
      /**
      * openOptParmFile 
      *   This method is derived from 
  *   COBOL Paragraph - 1200-OPEN-OPT-PARM-FILE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - fileOpenError600               COBOL Name: 600-FILE-OPEN-ERROR
      * - fileOpenAbendCode300           COBOL Name: 300-FILE-OPEN-ABEND-CODE
      *
      * Output :  

      * - optParmFileStatus200           COBOL Name: 200-OPT-PARM-FILE-STATUS
      * - isOptParmFileClosed100         COBOL Name: 100-IS-OPT-PARM-FILE-CLOSED
      * - badStatusCode600               COBOL Name: 600-BAD-STATUS-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - ip60001EventErrorMsg           COBOL Name: IP60001-EVENT-ERROR-MSG
      * - fileOpenError600               COBOL Name: 600-FILE-OPEN-ERROR
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - ip60001EventErrorCode          COBOL Name: IP60001-EVENT-ERROR-CODE
      * - fileOpenAbendCode300           COBOL Name: 300-FILE-OPEN-ABEND-CODE
      *
      * @throws CFException
      */
      @Override
      public OpenOptParmFileOutCtx openOptParmFile(OpenOptParmFileInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// * This opens opt-parm-file and checks for i/o errors.  if
// * there is an opt-parm-file opening error, appropriate abend text
// * is filled in abend message and the abend routine is performed.
// *-----------------------------------------------------------------
Ip650010Ctx programCtx = methodIn.getIp650010Ctx();
OpenOptParmFileOutCtx methodOut = methodIn.getOpenOptParmFileOutCtx();
//  OPEN INPUT SYS007-OPTIMIZED-PARM-FILE
          	sys007OptimizedParmFile.setVsamCluster("IP650010" /*program name*/);
          sys007OptimizedParmFile.open("r"); 
          methodOut.setOptParmFileStatus200(sys007OptimizedParmFile.getStatusString() );
//  IF 88-200-OPT-PARM-IO-GOOD
          if ( methodOut.isOptParmIoGood88200()  ) { 
//  SET 88-100-FILE-IS-OPEN TO TRUE
              methodOut.setFileIsOpen88100True(); 
              
          }
//  ELSE
          else { 
//  MOVE 200-OPT-PARM-FILE-STATUS TO 600-BAD-STATUS-CODE
              methodOut.setBadStatusCode600(methodOut.getOptParmFileStatus200());
              // MOVE 600-FILE-OPEN-ERROR TO 900-ABEND-TEXT IP60001-EVENT-ERROR-MSG
              methodOut.setAbendText900(methodOut.getFileOpenError600().toCharArray());
              methodOut.setIp60001EventErrorMsg(methodOut.getFileOpenError600().toCharArray());
//  SET 88-900-PARA-1200 TO TRUE
              methodOut.setPara120088900True(); 
              
//  MOVE 300-FILE-OPEN-ABEND-CODE TO 900-ABEND-CODE IP60001-EVENT-ERROR-CODE
              methodOut.setAbendCode900(methodOut.getFileOpenAbendCode300());
              methodOut.setIp60001EventErrorCode(methodOut.getFileOpenAbendCode300());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError(programCtx.getTerminateOnErrorInCtx());/*9000-TERMINATE-ON-ERROR*/
          }
      
      return methodOut;
      }
      /**
      * readBuildReturnData 
      *   This method is derived from 
  *   COBOL Paragraph - 2000-READ-BUILD-RETURN-DATA COBOL Cyclomatic complexity - 4
      * Input  :  

      * - currentTableKey800             COBOL Name: 800-CURRENT-TABLE-KEY
      * - ip50005TableKey                COBOL Name: IP50005-TABLE-KEY
      * - ip50005OneDayReadStatus        COBOL Name: IP50005-ONE-DAY-READ-STATUS
      * - optParmFileStatus200           COBOL Name: 200-OPT-PARM-FILE-STATUS
      *
      * Output :  

      * - currentTableKey800             COBOL Name: 800-CURRENT-TABLE-KEY
      * - ip50005TableKey                COBOL Name: IP50005-TABLE-KEY
      *
      * @throws CFException
      */
      @Override
      public ReadBuildReturnDataOutCtx readBuildReturnData(ReadBuildReturnDataInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// * This paragraph based on the table id requested makes a decision
// * whether to read a record or not and then returns the data.
// *-----------------------------------------------------------------
Ip650010Ctx programCtx = methodIn.getIp650010Ctx();
ReadBuildReturnDataOutCtx methodOut = methodIn.getReadBuildReturnDataOutCtx();
//  IF 800-CURRENT-TABLE-KEY EQUAL IP50005-TABLE-KEY AND 88-IP50005-TBL-LAST-REC-N
          if (		compareChars(methodOut.getCurrentTableKey800(),methodOut.getIp50005TableKey()) == 0  &&  methodIn.isIp50005TblLastRecN88()  ) { 
//  PERFORM 2300-RETURN-SEG-TO-CALLER
              returnSegToCaller(programCtx.getReturnSegToCallerInCtx());/*2300-RETURN-SEG-TO-CALLER*/
//  PERFORM 2200-READ-OPT-PARM-FILE
              readOptParmFile(programCtx.getReadOptParmFileInCtx());/*2200-READ-OPT-PARM-FILE*/
          }
//  ELSE
          else { 
              // MOVE IP50005-TABLE-KEY TO 800-CURRENT-TABLE-KEY
              methodOut.getCurrentTableKey800().setString(methodOut.getIp50005TableKey().getCharArray());
//  PERFORM 2100-POSITION-OPT-PARM-FILE
              positionOptParmFile(programCtx.getPositionOptParmFileInCtx());/*2100-POSITION-OPT-PARM-FILE*/
//  IF 88-200-OPT-PARM-IO-GOOD
              if ( methodIn.isOptParmIoGood88200()  ) { 
//  PERFORM 2200-READ-OPT-PARM-FILE
                  readOptParmFile(programCtx.getReadOptParmFileInCtx());/*2200-READ-OPT-PARM-FILE*/
//  PERFORM 2300-RETURN-SEG-TO-CALLER
                  returnSegToCaller(programCtx.getReturnSegToCallerInCtx());/*2300-RETURN-SEG-TO-CALLER*/
//  PERFORM 2200-READ-OPT-PARM-FILE
                  readOptParmFile(programCtx.getReadOptParmFileInCtx());/*2200-READ-OPT-PARM-FILE*/
              }
          }
      
      return methodOut;
      }
      /**
      * positionOptParmFile 
      *   This method is derived from 
  *   COBOL Paragraph - 2100-POSITION-OPT-PARM-FILE COBOL Cyclomatic complexity - 4
      * Input  :  

      * - ip50005TableKeyAll             COBOL Name: IP50005-TABLE-KEY-ALL
      * - optParmFileStatus200           COBOL Name: 200-OPT-PARM-FILE-STATUS
      * - fileStartError610              COBOL Name: 610-FILE-START-ERROR
      * - fileStartAbendCode300          COBOL Name: 300-FILE-START-ABEND-CODE
      *
      * Output :  

      * - ip50005Seq                     COBOL Name: IP50005-SEQ
      * - sys007TableKeyAll              COBOL Name: SYS007-TABLE-KEY-ALL
      * - ip50005TableKeyAll             COBOL Name: IP50005-TABLE-KEY-ALL
      * - ip50005OneDayReadStatus        COBOL Name: IP50005-ONE-DAY-READ-STATUS
      * - badStatusCode610               COBOL Name: 610-BAD-STATUS-CODE
      * - optParmFileStatus200           COBOL Name: 200-OPT-PARM-FILE-STATUS
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - ip60001EventErrorMsg           COBOL Name: IP60001-EVENT-ERROR-MSG
      * - fileStartError610              COBOL Name: 610-FILE-START-ERROR
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - ip60001EventErrorCode          COBOL Name: IP60001-EVENT-ERROR-CODE
      * - fileStartAbendCode300          COBOL Name: 300-FILE-START-ABEND-CODE
      *
      * @throws CFException
      */
      @Override
      public PositionOptParmFileOutCtx positionOptParmFile(PositionOptParmFileInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// * Read a record from the optimized parameter file.
// *-----------------------------------------------------------------
Ip650010Ctx programCtx = methodIn.getIp650010Ctx();
PositionOptParmFileOutCtx methodOut = methodIn.getPositionOptParmFileOutCtx();
//  MOVE ZEROS TO IP50005-SEQ
          methodOut.setIp50005Seq(0);
          // MOVE IP50005-TABLE-KEY-ALL TO SYS007-TABLE-KEY-ALL
          methodOut.getSys007TableKeyAll().setString(methodOut.getIp50005TableKeyAll().getCharArray());
//  START SYS007-OPTIMIZED-PARM-FILE KEY EQUAL SYS007-TABLE-KEY-ALL
          sys007OptimizedParmFile.seek(methodOut.getSys007OptimizedParmRec().toCharArray(),CFConstants.CONDITION_EQUAL,sys007OptimizedParmFile.getKeyInfo().getSys007TableKeyAll()); 
          methodOut.setOptParmFileStatus200(sys007OptimizedParmFile.getStatusString() );
//  EVALUATE TRUE
          if  ( methodIn.isOptParmIoGood88200()  ) { 
              ;
          }
          else if  ( methodIn.isNoTblRecords88200()  ) { 
//  SET 88-IP50005-NO-REQ-TBL-RECS TO TRUE
              methodOut.setIp50005NoReqTblRecs88True(); 
              
          }
          else   { 
//  MOVE 200-OPT-PARM-FILE-STATUS TO 610-BAD-STATUS-CODE
              methodOut.setBadStatusCode610(methodOut.getOptParmFileStatus200());
//  PERFORM 8300-CLOSE-ONE-DAY-FILE
              closeOneDayFile(programCtx.getCloseOneDayFileInCtx());/*8300-CLOSE-ONE-DAY-FILE*/
              // MOVE 610-FILE-START-ERROR TO 900-ABEND-TEXT IP60001-EVENT-ERROR-MSG
              methodOut.setAbendText900(methodOut.getFileStartError610().toCharArray());
              methodOut.setIp60001EventErrorMsg(methodOut.getFileStartError610().toCharArray());
//  MOVE 300-FILE-START-ABEND-CODE TO 900-ABEND-CODE IP60001-EVENT-ERROR-CODE
              methodOut.setAbendCode900(methodOut.getFileStartAbendCode300());
              methodOut.setIp60001EventErrorCode(methodOut.getFileStartAbendCode300());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError(programCtx.getTerminateOnErrorInCtx());/*9000-TERMINATE-ON-ERROR*/
          }
      
      return methodOut;
      }
      /**
      * readOptParmFile 
      *   This method is derived from 
  *   COBOL Paragraph - 2200-READ-OPT-PARM-FILE COBOL Cyclomatic complexity - 5
      * Input  :  

      * - optParmRecLngth400             COBOL Name: 400-OPT-PARM-REC-LNGTH
      * - currentTableKey800             COBOL Name: 800-CURRENT-TABLE-KEY
      * - recordsRead400                 COBOL Name: 400-RECORDS-READ
      * - valueOne300                    COBOL Name: 300-VALUE-ONE
      * - fileReadError620               COBOL Name: 620-FILE-READ-ERROR
      * - fileReadAbendCode300           COBOL Name: 300-FILE-READ-ABEND-CODE
      *
      * Output :  

      * - sys007OptimizedParmRec         COBOL Name: SYS007-OPTIMIZED-PARM-REC
      * - optParmFileStatus200           COBOL Name: 200-OPT-PARM-FILE-STATUS
      * - sys007TableKeyAll              COBOL Name: SYS007-TABLE-KEY-ALL
      * - sys007TableKey                 COBOL Name: SYS007-TABLE-KEY
      * - recordsRead400                 COBOL Name: 400-RECORDS-READ
      * - ip50005OneDayReadStatus        COBOL Name: IP50005-ONE-DAY-READ-STATUS
      * - badStatusCode620               COBOL Name: 620-BAD-STATUS-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - ip60001EventErrorMsg           COBOL Name: IP60001-EVENT-ERROR-MSG
      * - fileReadError620               COBOL Name: 620-FILE-READ-ERROR
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - ip60001EventErrorCode          COBOL Name: IP60001-EVENT-ERROR-CODE
      * - fileReadAbendCode300           COBOL Name: 300-FILE-READ-ABEND-CODE
      *
      * @throws CFException
      */
      @Override
      public ReadOptParmFileOutCtx readOptParmFile(ReadOptParmFileInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// * Read the optimized parameter file.
// *-----------------------------------------------------------------
Ip650010Ctx programCtx = methodIn.getIp650010Ctx();
ReadOptParmFileOutCtx methodOut = methodIn.getReadOptParmFileOutCtx();
//  READ SYS007-OPTIMIZED-PARM-FILE NEXT
          sys007OptimizedParmFile.readNext();
          methodIn.setOptParmRecLngth400(sys007OptimizedParmFile.getRecLen());
          methodOut.setOptParmFileStatus200(sys007OptimizedParmFile.getStatusString() );
          if (!sys007OptimizedParmFile.hasEnded()) {
          	methodOut.getSys007OptimizedParmRec().setString(sys007OptimizedParmFile.getRecord());
          }
//  EVALUATE TRUE
          if  ( methodOut.isOptParmIoGood88200()  ) { 
//  IF SYS007-TABLE-KEY EQUAL 800-CURRENT-TABLE-KEY
              if (		compareChars(methodOut.getSys007TableKey(),methodIn.getCurrentTableKey800()) == 0 ) { 
//  ADD 300-VALUE-ONE TO 400-RECORDS-READ
                  methodOut.setRecordsRead400(methodOut.getRecordsRead400()+methodIn.getValueOne300());
//  SET 88-IP50005-TBL-LAST-REC-N TO TRUE
                  methodOut.setIp50005TblLastRecN88True(); 
                  
              }
//  ELSE
              else { 
//  SET 88-IP50005-TBL-LAST-REC-Y TO TRUE
                  methodOut.setIp50005TblLastRecY88True(); 
                  
//  PERFORM 8400-DISPLAY-COUNT
                  displayCount(programCtx.getDisplayCountInCtx());/*8400-DISPLAY-COUNT*/
              }
          }
          else if  ( methodOut.isEndOfFile88200()  ) { 
//  SET 88-IP50005-TBL-LAST-REC-Y TO TRUE
              methodOut.setIp50005TblLastRecY88True(); 
              
//  PERFORM 8400-DISPLAY-COUNT
              displayCount(programCtx.getDisplayCountInCtx());/*8400-DISPLAY-COUNT*/
          }
          else   { 
//  MOVE 200-OPT-PARM-FILE-STATUS TO 620-BAD-STATUS-CODE
              methodOut.setBadStatusCode620(methodOut.getOptParmFileStatus200());
//  PERFORM 8300-CLOSE-ONE-DAY-FILE
              closeOneDayFile(programCtx.getCloseOneDayFileInCtx());/*8300-CLOSE-ONE-DAY-FILE*/
              // MOVE 620-FILE-READ-ERROR TO 900-ABEND-TEXT IP60001-EVENT-ERROR-MSG
              methodOut.setAbendText900(methodOut.getFileReadError620().toCharArray());
              methodOut.setIp60001EventErrorMsg(methodOut.getFileReadError620().toCharArray());
//  MOVE 300-FILE-READ-ABEND-CODE TO 900-ABEND-CODE IP60001-EVENT-ERROR-CODE
              methodOut.setAbendCode900(methodOut.getFileReadAbendCode300());
              methodOut.setIp60001EventErrorCode(methodOut.getFileReadAbendCode300());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError(programCtx.getTerminateOnErrorInCtx());/*9000-TERMINATE-ON-ERROR*/
          }
      
      return methodOut;
      }
      /**
      * returnSegToCaller 
      *   This method is derived from 
  *   COBOL Paragraph - 2300-RETURN-SEG-TO-CALLER COBOL Cyclomatic complexity - 1
      * Input  :  

      * - sys007OneDayRec                COBOL Name: SYS007-ONE-DAY-REC
      * - optParmRecLngth400             COBOL Name: 400-OPT-PARM-REC-LNGTH
      *
      * Output :  

      * - ip50005OneDayRec               COBOL Name: IP50005-ONE-DAY-REC
      * - sys007OneDayRec                COBOL Name: SYS007-ONE-DAY-REC
      * - ip50005TableDataLength         COBOL Name: IP50005-TABLE-DATA-LENGTH
      *
      * @throws CFException
      */
      @Override
      public ReturnSegToCallerOutCtx returnSegToCaller(ReturnSegToCallerInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// * Pass the read data back to calling program.
// *-----------------------------------------------------------------

// *    Move spaces to ip50005-one-day-rec
Ip650010Ctx programCtx = methodIn.getIp650010Ctx();
ReturnSegToCallerOutCtx methodOut = methodIn.getReturnSegToCallerOutCtx();
//  MOVE SYS007-ONE-DAY-REC TO IP50005-ONE-DAY-REC ( 300-VALUE-ONE : 400-OPT-PARM-REC-LNGTH )
          methodOut.getIp50005OneDayRec().replace(methodIn.getSys007OptimizedParmRecGroup()/*parent*/,0/*fromOffset - (ip50005OneDayRec) */,32756/*fromLen*/,0+methodIn.getValueOne300() - 1/*toOffset - (sys007OneDayRec) */,(int) methodIn.getOptParmRecLngth400()/*toLen*/);
//  SUBTRACT LENGTH OF SYS007-TABLE-KEY-ALL FROM 400-OPT-PARM-REC-LNGTH GIVING IP50005-TABLE-DATA-LENGTH
          methodOut.setIp50005TableDataLength(Math.abs(methodIn.getOptParmRecLngth400()-Sys007TableKeyAll.getSys007TableKeyAllFieldLength()));
      
      return methodOut;
      }
      /**
      * closeFileCheckStatus 
      *   This method is derived from 
  *   COBOL Paragraph - 8200-CLOSE-FILE-CHECK-STATUS COBOL Cyclomatic complexity - 2
      * Input  :  

      * - optParmFileStatus200           COBOL Name: 200-OPT-PARM-FILE-STATUS
      * - fileCloseError630              COBOL Name: 630-FILE-CLOSE-ERROR
      * - fileCloseAbendCode300          COBOL Name: 300-FILE-CLOSE-ABEND-CODE
      *
      * Output :  

      * - isOptParmFileClosed100         COBOL Name: 100-IS-OPT-PARM-FILE-CLOSED
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - badStatusCode630               COBOL Name: 630-BAD-STATUS-CODE
      * - optParmFileStatus200           COBOL Name: 200-OPT-PARM-FILE-STATUS
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - ip60001EventErrorMsg           COBOL Name: IP60001-EVENT-ERROR-MSG
      * - fileCloseError630              COBOL Name: 630-FILE-CLOSE-ERROR
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - ip60001EventErrorCode          COBOL Name: IP60001-EVENT-ERROR-CODE
      * - fileCloseAbendCode300          COBOL Name: 300-FILE-CLOSE-ABEND-CODE
      *
      * @throws CFException
      */
      @Override
      public CloseFileCheckStatusOutCtx closeFileCheckStatus(CloseFileCheckStatusInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// * Close the optimized parm file and then check for any file
// * closing error.  if there is a file closing error, appropriate
// * abend message is displayed and abend routine is performed.
// *-----------------------------------------------------------------
Ip650010Ctx programCtx = methodIn.getIp650010Ctx();
CloseFileCheckStatusOutCtx methodOut = methodIn.getCloseFileCheckStatusOutCtx();
//  PERFORM 8300-CLOSE-ONE-DAY-FILE
          closeOneDayFile(programCtx.getCloseOneDayFileInCtx());/*8300-CLOSE-ONE-DAY-FILE*/
//  IF 88-200-OPT-PARM-IO-GOOD
          if ( methodIn.isOptParmIoGood88200()  ) { 
//  SET 88-100-FILE-IS-CLOSED TO TRUE
              methodOut.setFileIsClosed88100True(); 
              
          }
//  ELSE
          else { 
//  SET 88-900-PARA-8300 TO TRUE
              methodOut.setPara830088900True(); 
              
//  MOVE 200-OPT-PARM-FILE-STATUS TO 630-BAD-STATUS-CODE
              methodOut.setBadStatusCode630(methodOut.getOptParmFileStatus200());
              // MOVE 630-FILE-CLOSE-ERROR TO 900-ABEND-TEXT IP60001-EVENT-ERROR-MSG
              methodOut.setAbendText900(methodOut.getFileCloseError630().toCharArray());
              methodOut.setIp60001EventErrorMsg(methodOut.getFileCloseError630().toCharArray());
//  MOVE 300-FILE-CLOSE-ABEND-CODE TO 900-ABEND-CODE IP60001-EVENT-ERROR-CODE
              methodOut.setAbendCode900(methodOut.getFileCloseAbendCode300());
              methodOut.setIp60001EventErrorCode(methodOut.getFileCloseAbendCode300());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError(programCtx.getTerminateOnErrorInCtx());/*9000-TERMINATE-ON-ERROR*/
          }
      
      return methodOut;
      }
      /**
      * closeOneDayFile 
      *   This method is derived from 
  *   COBOL Paragraph - 8300-CLOSE-ONE-DAY-FILE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - isOptParmFileClosed100         COBOL Name: 100-IS-OPT-PARM-FILE-CLOSED
      *
      * Output :  

      * - optParmFileStatus200           COBOL Name: 200-OPT-PARM-FILE-STATUS
      *
      * @throws CFException
      */
      @Override
      public CloseOneDayFileOutCtx closeOneDayFile(CloseOneDayFileInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// * Closes the one-day file.
// *-----------------------------------------------------------------
Ip650010Ctx programCtx = methodIn.getIp650010Ctx();
CloseOneDayFileOutCtx methodOut = methodIn.getCloseOneDayFileOutCtx();
//  IF 88-100-FILE-IS-OPEN
          if ( methodIn.isFileIsOpen88100()  ) { 
//  CLOSE SYS007-OPTIMIZED-PARM-FILE
              sys007OptimizedParmFile.close(); 
              methodOut.setOptParmFileStatus200(sys007OptimizedParmFile.getStatusString() );
          }
//  ELSE
          else { 
//  SET 88-200-OPT-PARM-IO-GOOD TO TRUE
              methodOut.setOptParmIoGood88200True(); 
              
          }
      
      return methodOut;
      }
      /**
      * displayCount 
      *   This method is derived from 
  *   COBOL Paragraph - 8400-DISPLAY-COUNT COBOL Cyclomatic complexity - 2
      * Input  :  

      * - recordsRead400                 COBOL Name: 400-RECORDS-READ
      * - ip50005ReadTableId             COBOL Name: IP50005-READ-TABLE-ID
      * - ip50005EffDate                 COBOL Name: IP50005-EFF-DATE
      * - ip60001EventLogControl         COBOL Name: IP60001-EVENT-LOG-CONTROL
      * - recordsReadMessage640          COBOL Name: 640-RECORDS-READ-MESSAGE
      *
      * Output :  

      * - recReadCnt640                  COBOL Name: 640-REC-READ-CNT
      * - tableId640                     COBOL Name: 640-TABLE-ID
      * - ip50005ReadTableId             COBOL Name: IP50005-READ-TABLE-ID
      * - effDate640                     COBOL Name: 640-EFF-DATE
      * - ip50005EffDate                 COBOL Name: IP50005-EFF-DATE
      * - recordsRead400                 COBOL Name: 400-RECORDS-READ
      *
      * @throws CFException
      */
      @Override
      public DisplayCountOutCtx displayCount(DisplayCountInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// * This paragraph displays number of one-day-file records read
// * for a table id. since an extra read is made to determine end of
// * table records the table records read count is decremented here
// * by one.
// *-----------------------------------------------------------------
Ip650010Ctx programCtx = methodIn.getIp650010Ctx();
DisplayCountOutCtx methodOut = methodIn.getDisplayCountOutCtx();
          methodOut.setRecReadCnt640(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1522103253,String.valueOf(methodOut.getRecordsRead400())));
//  MOVE IP50005-READ-TABLE-ID TO 640-TABLE-ID
          methodOut.setTableId640(methodOut.getIp50005ReadTableId());
//  MOVE IP50005-EFF-DATE TO 640-EFF-DATE
          methodOut.setEffDate640(String.valueOf(methodOut.getIp50005EffDateString()).toCharArray());
//  MOVE ZEROS TO 400-RECORDS-READ
          methodOut.setRecordsRead400(0);
//  IF 88-IP60001-LOG-EVENT
          if ( methodIn.isIp60001LogEvent88()  ) { 
//  DISPLAY 640-RECORDS-READ-MESSAGE
              logger.info(methodIn.getRecordsReadMessage640().toString()); 
          }
      
      return methodOut;
      }
      /**
      * terminateOnError 
      *   This method is derived from 
  *   COBOL Paragraph - 9000-TERMINATE-ON-ERROR COBOL Cyclomatic complexity - 1
      * Input  :  

      * - abendParaName900               COBOL Name: 900-ABEND-PARA-NAME
      * - abendMessage900                COBOL Name: 900-ABEND-MESSAGE
      *
      * Output : None 

      * @throws CFException
      */
      @Override
      public void terminateOnError(TerminateOnErrorInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// * Display abend message and call abend routine.
// *-----------------------------------------------------------------
Ip650010Ctx programCtx = methodIn.getIp650010Ctx();
//  DISPLAY '***********************************'
          logger.info("***********************************"); 
//  DISPLAY 'A B E N D   A B E N D   A B E N D  '
          logger.info("A B E N D   A B E N D   A B E N D  "); 
//  DISPLAY 'A B E N D   I P 6 5 0 0 1 0        '
          logger.info("A B E N D   I P 6 5 0 0 1 0        "); 
//  DISPLAY '***********************************'
          logger.info("***********************************"); 
//  DISPLAY 900-ABEND-PARA-NAME
          logger.info(methodIn.getAbendParaName900().toString()); 
//  DISPLAY 900-ABEND-MESSAGE
          logger.info(methodIn.getAbendMessage900().toString()); 
      
      }
  
  
  
  
  
  
  
  
  }
