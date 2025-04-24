  package com.cloudframe.app.process.impl;
  /* 
* element ip343690 as of 08/13/20 03:56:26                    [vc]
*----------------------------------------------------------------*
*          -- -- -- c o n f i d e n t i a l -- -- --             *
*    this item contains information and procedures which are     *
*    proprietary to mastercard international, incorporated,      *
*    and which are confidential.  it is provided with the        *
*    express understanding that it is to be used only for the    *
*    benefit of interbank card association, and is not to be     *
*    used, copied, or disclosed for any other purpose.  any      *
*    authorized reproduction (in whole or in part) of this       *
*    material must be marked  ith this legend.                   *
*-----------------------------------------------------------------
* author.          wipro.                                        *
* date-written.    november,2017.                                *
* date-compiled.   november,2017.                                *
* security.        property of mastercard international, inc.    *
*----------------------------------------------------------------*
* program functionality:                                         *
* this program used to update pma table sequence number to null  *
* value if the pan number is not opted in table 40               *
*----------------------------------------------------------------*
*revision history:                                               *
*----------------------------------------------------------------*
*    project         :gcms release 18.q3 - i2657 - mdes pre-work *
*                     rev1 dsrp ucaf (card sequence number)      *
*    date            :2018/07/13                                 *
*    version         :001.00                                     *
*    programmer      :wipro                                      *
*    modification    :initial version                            *
*----------------------------------------------------------------*
*    project        :gcms release 18.q3 - prb90937               *
*                    the blockers were created in 18q2 release   *
*                    for the new modules and it needs to be      *
*                    removed.                                    *
*    date           :2018/07/13                                  *
*    programmer     :wipro                                       *
*    modification   :checking the count of dead-lock occurring   *
*                    and setting the dead-lock switch while gets *
*                    -911 sql code and then performs dead-lock.  *
*----------------------------------------------------------------*
*/
  
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.ip343690.file.*;
  import com.cloudframe.app.ip343690.Ip343690Ctx.*;
  import com.cloudframe.app.ip343690.Ip343690Ctx;
  import com.cloudframe.app.process.Ip343690;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import org.springframework.web.bind.annotation.RequestParam;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.process.Ip996010;
  import com.cloudframe.app.process.*;
  import com.cloudframe.app.process.Ip081110;
  import com.cloudframe.app.process.Ip280010;
  import com.cloudframe.app.repository.Ip343690Repository;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.process.Ip599810;
  import java.util.Calendar;
  import java.util.TimeZone;
  import java.util.Date;
  import org.springframework.beans.factory.annotation.Value;
  import com.cloudframe.app.process.Mcwait;
  import com.cloudframe.app.process.Ip610010;
  import com.cloudframe.app.process.Db200020;
  import com.cloudframe.app.dto.ProgramContext;
  import com.cloudframe.app.ip343690.dto.*;
  import com.cloudframe.app.ip343690.dto.Itipapma;
  import com.cloudframe.app.ip343690.dto.Parms1000;
  import com.cloudframe.app.ip343690.dto.Sqlca;
  import com.cloudframe.app.ip343690.dto.DbUpdateError8023010;
  import com.cloudframe.app.global.sharedvar.Db85102dWorkFields;
  import com.cloudframe.app.ip343690.dto.DbConnectError8023005;
  import com.cloudframe.app.ip343690.dto.Msg3001a600;
  import com.cloudframe.app.ip343690.dto.SqlAbendMsg900;
  import com.cloudframe.app.ip343690.dto.Db2Workarea800;
  import com.cloudframe.app.global.sharedvar.Ip50005ClearingDtTm;
  import com.cloudframe.app.ip343690.dto.DbSelectError8023006;
  import com.cloudframe.app.ip343690.file.records.Sys001InputPmaUnldRec;
  import com.cloudframe.app.ip343690.dto.Constants300;
  import com.cloudframe.app.ip343690.dto.TipapmaLayout800;
  import com.cloudframe.app.ip343690.file.records.Db2cloneRec;
  import com.cloudframe.app.ip343690.dto.Db85102dDb2cloneRec;
  import com.cloudframe.app.ip343690.dto.Sys001ErrMsgTxt600;
  import com.cloudframe.app.ip343690.dto.AbendParaName900;
  import com.cloudframe.app.ip343690.dto.AbendMessage900;
  import com.cloudframe.app.ip343690.dto.Tipapma;
  import com.cloudframe.app.ip343690.dto.SleepMessage600;
  import com.cloudframe.app.global.sharedvar.Ip08101RunControlRecord;
  import com.cloudframe.app.global.sharedvar.Ip50005OneDayRecLthGroup;
  import com.cloudframe.app.global.sharedvar.Ip50005OneDayRec;
  import com.cloudframe.app.global.sharedvar.Ip50005OneDayReadStatusGroup;
  import com.cloudframe.app.global.sharedvar.ApiLayout;
  import com.cloudframe.app.global.sharedvar.Ip30881Db2McwaitInputValue;
  import com.cloudframe.app.global.sharedvar.Ip60001EventLogWorkArea;
  import com.cloudframe.app.global.sharedvar.Ip996011ProgramStartMessage;
  import com.cloudframe.app.global.sharedvar.Ip00404Table;
  import com.cloudframe.app.ip343690.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.common.SQLS;
  import com.cloudframe.app.dao.Db2Base;
  import java.sql.SQLException;
  
  @Component("ip343690")
  
  public class Ip343690Impl extends CommonProcess implements Ip343690 {
  
  Logger logger = LoggerFactory.getLogger(Ip343690Impl.class);
  
  
  @Value("${timeZoneId:Etc/GMT}")
  private String timeZoneId;
  @Value("${IP343690.dbQualifier:}")
  private String dbQualifier;
  
  
  @Autowired 
  @Qualifier("ip343690_db2cloneFile")
  Db2cloneFile db2cloneFile;
  @Autowired 
  @Qualifier("ip343690_sys001InputPmaUnload")
  Sys001InputPmaUnload sys001InputPmaUnload;
  @Autowired 
  @Qualifier("db2Base")
  Db2Base db2Base;
  @Autowired 
  @Qualifier("ip343690Repository")
  Ip343690Repository ip343690Repository;
  @Autowired 
  @Qualifier("ip599810")
  Ip599810 ip599810;
  @Autowired 
  @Qualifier("mcwait")
  Mcwait mcwait;
  @Autowired 
  @Qualifier("db200020")
  Db200020 db200020;
  
  
  
  
  
  
      @Override
      public int setParameter(Ip343690Ctx programCtx, String parms1000) throws Exception {
      		if(parms1000 != null)
      		    programCtx.getParms1000().setString(com.cloudframe.app.data.Field.getParm(parms1000),new String(CONSTANTS.EBCDIC_ENCODING));
      		setInitDone(false);
      		process(programCtx);
      		return programCtx.getRc();
      }
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      public int process(Ip343690Ctx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
      	db2Base.reset("IP343690" ,dbQualifier, true/*use Dynamic SQL*/);
ProcessInCtx methodIn = programCtx.getProcessInCtx();
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
      		if(db2cloneFile.hasOpened() && !db2cloneFile.isReadOnly()) { 
      			db2cloneFile.flush(); 
      		}
      		if(sys001InputPmaUnload.hasOpened() && !sys001InputPmaUnload.isReadOnly()) { 
      			sys001InputPmaUnload.flush(); 
      		}
		handleDbAtEnd(db2Base); 
      

      }
      
       return programCtx.getRc(); // Exit with return code
      // end of process method
      }
      /**
      * mainline 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAINLINE COBOL Cyclomatic complexity - 2
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void mainline(Ip343690Ctx programCtx) throws Exception {
//  PERFORM 1000-BEGIN-PROCESS
          beginProcess(programCtx.getBeginProcessInCtx());/*1000-BEGIN-PROCESS*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  PERFORM 2000-CONNECT-TO-DB2
          connectToDb2(programCtx.getConnectToDb2InCtx());/*2000-CONNECT-TO-DB2*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  PERFORM 3000-PROCESS-INPUT-SYS001
          processInputSys001(programCtx.getProcessInputSys001InCtx());/*3000-PROCESS-INPUT-SYS001*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return ;
      
      }
      /**
      * beginProcess 
      *   This method is derived from 
  *   COBOL Paragraph - 1000-BEGIN-PROCESS COBOL Cyclomatic complexity - 2
      * Input  :  

      * - pgmIp343690300                 COBOL Name: 300-PGM-IP343690
      * - isItTheFirstTime100            COBOL Name: 100-IS-IT-THE-FIRST-TIME
      *
      * Output :  

      * - isItSqlError100                COBOL Name: 100-IS-IT-SQL-ERROR
      * - ip60001HoldPgmName             COBOL Name: IP60001-HOLD-PGM-NAME
      * - pgmIp343690300                 COBOL Name: 300-PGM-IP343690
      * - isItTheFirstTime100            COBOL Name: 100-IS-IT-THE-FIRST-TIME
      *
      * @throws CFException
      */
      @Override
      public BeginProcessOutCtx beginProcess(BeginProcessInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph checks for first time entry, updates  event log *
// * and display exectuion messages.                                *
// *----------------------------------------------------------------*
Ip343690Ctx programCtx = methodIn.getIp343690Ctx();
BeginProcessOutCtx methodOut = methodIn.getBeginProcessOutCtx();
//  MOVE SPACES TO 100-IS-IT-SQL-ERROR
          methodOut.setIsItSqlError100(CONSTANTS.SPACE);
//  MOVE 300-PGM-IP343690 TO IP60001-HOLD-PGM-NAME
          methodOut.setIp60001HoldPgmName(methodOut.getPgmIp343690300());
//  PERFORM 9950-UPDATE-EVENT-LOG
          updateEventLog(programCtx.getUpdateEventLogInCtx());/*9950-UPDATE-EVENT-LOG*/
//  IF 88-100-IT-IS-FIRST-TIME
          if ( methodIn.isItIsFirstTime88100()  ) { 
//  PERFORM 1100-DISPLAY-EXEC-MSGS
              displayExecMsgs(programCtx.getDisplayExecMsgsInCtx());/*1100-DISPLAY-EXEC-MSGS*/
//  PERFORM 1200-SET-PROCEDURE-POINTERS
              setProcedurePointers(programCtx.getSetProcedurePointersInCtx());/*1200-SET-PROCEDURE-POINTERS*/
//  PERFORM 1300-PROCESS-RUNCNTL-FILE
              processRuncntlFile(programCtx.getProcessRuncntlFileInCtx());/*1300-PROCESS-RUNCNTL-FILE*/
//  PERFORM 1400-OPEN-INPUT-SYS001
              openInputSys001(programCtx.getOpenInputSys001InCtx());/*1400-OPEN-INPUT-SYS001*/
//  SET 88-100-IT-IS-NOT-FIRST-TIME TO TRUE
              methodOut.setItIsNotFirstTime88100True(); 
              
          }
      
      return methodOut;
      }
      /**
      * displayExecMsgs 
      *   This method is derived from 
  *   COBOL Paragraph - 1100-DISPLAY-EXEC-MSGS COBOL Cyclomatic complexity - 2
      * Input  :  

      * - pgmIp996010300                 COBOL Name: 300-PGM-IP996010
      * - pgmIp343690300                 COBOL Name: 300-PGM-IP343690
      * - pgmVersion300                  COBOL Name: 300-PGM-VERSION
      *
      * Output :  

      * - ptrIp996010800                 COBOL Name: 800-PTR-IP996010
      * - ip996011PgmId                  COBOL Name: IP996011-PGM-ID
      * - pgmIp343690300                 COBOL Name: 300-PGM-IP343690
      * - ip996011PgmVersion             COBOL Name: IP996011-PGM-VERSION
      * - pgmVersion300                  COBOL Name: 300-PGM-VERSION
      * - ip996011WhenCompiled           COBOL Name: IP996011-WHEN-COMPILED
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public DisplayExecMsgsOutCtx displayExecMsgs(DisplayExecMsgsInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph displays the program execution messages by      *
// * calling ip996010.                                              *
// *----------------------------------------------------------------*
Ip343690Ctx programCtx = methodIn.getIp343690Ctx();
DisplayExecMsgsOutCtx methodOut = methodIn.getDisplayExecMsgsOutCtx();
//  SET 800-PTR-IP996010 TO ENTRY 300-PGM-IP996010
          methodOut.setPtrIp996010800(methodIn.getPgmIp996010300()); 
          
//  MOVE 300-PGM-IP343690 TO IP996011-PGM-ID
          methodOut.setIp996011PgmId(methodOut.getPgmIp343690300());
//  MOVE 300-PGM-VERSION TO IP996011-PGM-VERSION
          methodOut.setIp996011PgmVersion(methodOut.getPgmVersion300());
          // MOVE WHEN-COMPILED TO IP996011-WHEN-COMPILED
          //  FORMAT1311677340 = "X(08)BX(08)"
          methodOut.setIp996011WhenCompiled(CFUtil.cobolAnEditFormatter(CONSTANTS.FORMAT1311677340,CONSTANTS.LITERAL_2073358900));
//  CALL 800-PTR-IP996010
          // CALL 800-PTR-IP996010
          	programCtx.setRc( ip996010.process(programCtx.getGlobalCtx().getContext("IP996010")));
      
      return methodOut;
      }
      /**
      * setProcedurePointers 
      *   This method is derived from 
  *   COBOL Paragraph - 1200-SET-PROCEDURE-POINTERS COBOL Cyclomatic complexity - 6
      * Input  :  

      * - pgmIp599810300                 COBOL Name: 300-PGM-IP599810
      * - pgmIp081110300                 COBOL Name: 300-PGM-IP081110
      * - pgmIp280010300                 COBOL Name: 300-PGM-IP280010
      * - pgmIp610010300                 COBOL Name: 300-PGM-IP610010
      * - pgmMcwait300                   COBOL Name: 300-PGM-MCWAIT
      *
      * Output :  

      * - ptrIp599810800                 COBOL Name: 800-PTR-IP599810
      * - ptrIp081110800                 COBOL Name: 800-PTR-IP081110
      * - ptrIp280010800                 COBOL Name: 800-PTR-IP280010
      * - ptrIp610010800                 COBOL Name: 800-PTR-IP610010
      * - ptrMcwait800                   COBOL Name: 800-PTR-MCWAIT
      *
      * @throws CFException
      */
      @Override
      public SetProcedurePointersOutCtx setProcedurePointers(SetProcedurePointersInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph sets procedure pointers.                        *
// *----------------------------------------------------------------*
Ip343690Ctx programCtx = methodIn.getIp343690Ctx();
SetProcedurePointersOutCtx methodOut = methodIn.getSetProcedurePointersOutCtx();
//  SET 800-PTR-IP599810 TO ENTRY 300-PGM-IP599810
          methodOut.setPtrIp599810800(methodIn.getPgmIp599810300()); 
          
//  SET 800-PTR-IP081110 TO ENTRY 300-PGM-IP081110
          methodOut.setPtrIp081110800(methodIn.getPgmIp081110300()); 
          
//  SET 800-PTR-IP280010 TO ENTRY 300-PGM-IP280010
          methodOut.setPtrIp280010800(methodIn.getPgmIp280010300()); 
          
//  SET 800-PTR-IP610010 TO ENTRY 300-PGM-IP610010
          methodOut.setPtrIp610010800(methodIn.getPgmIp610010300()); 
          
//  SET 800-PTR-MCWAIT TO ENTRY 300-PGM-MCWAIT
          methodOut.setPtrMcwait800(methodIn.getPgmMcwait300()); 
          
      
      return methodOut;
      }
      /**
      * processRuncntlFile 
      *   This method is derived from 
  *   COBOL Paragraph - 1300-PROCESS-RUNCNTL-FILE COBOL Cyclomatic complexity - 3
      * Input  :  

      * - ip08101ProcessDate             COBOL Name: IP08101-PROCESS-DATE
      * - ip08101RptProcessTime          COBOL Name: IP08101-RPT-PROCESS-TIME
      * - value14300                     COBOL Name: 300-VALUE-14
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      * - ip50005ClearingDtTm            COBOL Name: IP50005-CLEARING-DT-TM
      * - ip08101ProcessDate             COBOL Name: IP08101-PROCESS-DATE
      * - ip08101RptProcessTime          COBOL Name: IP08101-RPT-PROCESS-TIME
      * - value14300                     COBOL Name: 300-VALUE-14
      *
      * @throws CFException
      */
      @Override
      public ProcessRuncntlFileOutCtx processRuncntlFile(ProcessRuncntlFileInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph calls routine to process run control file.      *
// *----------------------------------------------------------------*
Ip343690Ctx programCtx = methodIn.getIp343690Ctx();
ProcessRuncntlFileOutCtx methodOut = methodIn.getProcessRuncntlFileOutCtx();
//  CALL 800-PTR-IP081110
          // CALL 800-PTR-IP081110
          	programCtx.setRc( ip081110.process(programCtx.getGlobalCtx().getContext("IP081110")));
//  IF IP08101-PROCESS-DATE NUMERIC
          if (        methodIn.getIp08101RunControlRecord().ip08101ProcessDateIsNumeric() ) { 
//  MOVE IP08101-PROCESS-DATE TO IP50005-CLEARING-DT-TM (1 : 8)
              methodOut.getIp50005ClearingDtTm().replace(String.valueOf(methodOut.getIp08101ProcessDateString()).toCharArray(),0,String.valueOf(methodOut.getIp08101ProcessDateString()).length(),0,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  IF IP08101-RPT-PROCESS-TIME (1 : 2) NUMERIC
              if (    isNumeric(substring(methodOut.getIp08101RptProcessTime(),0,2))) { 
//  MOVE IP08101-RPT-PROCESS-TIME (1 : 2) TO IP50005-CLEARING-DT-TM (9 : 2)
                  methodOut.getIp50005ClearingDtTm().replace(methodIn.getIp08101RunControlRecord()/*parent*/,44/*fromOffset - (ip50005ClearingDtTm) */,2/*fromLen*/,0+9 - 1/*toOffset - (ip08101RptProcessTime) */,2/*toLen*/);
              }
//  ELSE
              else { 
//  MOVE 300-VALUE-14 TO IP50005-CLEARING-DT-TM (9 : 2)
                  methodOut.getIp50005ClearingDtTm().replace(String.valueOf(methodOut.getValue14300String()).toCharArray(),0,String.valueOf(methodOut.getValue14300String()).length(),8,2 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
              }
          }
      
      return methodOut;
      }
      /**
      * openInputSys001 
      *   This method is derived from 
  *   COBOL Paragraph - 1400-OPEN-INPUT-SYS001 COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sys001OpAbendCode300           COBOL Name: 300-SYS001-OP-ABEND-CODE
      * - para1400300                    COBOL Name: 300-PARA-1400
      * - sys001ErrMsgTxt600             COBOL Name: 600-SYS001-ERR-MSG-TXT
      *
      * Output :  

      * - sys001FileStatus200            COBOL Name: 200-SYS001-FILE-STATUS
      * - db85102dDb2cloneStatus         COBOL Name: DB85102D-DB2CLONE-STATUS
      * - pmmWorkFileMsgDetail600        COBOL Name: 600-PMM-WORK-FILE-MSG-DETAIL
      * - sys001Status600                COBOL Name: 600-SYS001-STATUS
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - sys001OpAbendCode300           COBOL Name: 300-SYS001-OP-ABEND-CODE
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para1400300                    COBOL Name: 300-PARA-1400
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - sys001ErrMsgTxt600             COBOL Name: 600-SYS001-ERR-MSG-TXT
      *
      * @throws CFException
      */
      @Override
      public OpenInputSys001OutCtx openInputSys001(OpenInputSys001InCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph opens the input file sys001.                    *
// *----------------------------------------------------------------*
Ip343690Ctx programCtx = methodIn.getIp343690Ctx();
OpenInputSys001OutCtx methodOut = methodIn.getOpenInputSys001OutCtx();
//  OPEN INPUT SYS001-INPUT-PMA-UNLOAD
          sys001InputPmaUnload.open(new String(CONSTANTS.MODE_READ_ONLY_36242),sys001InputPmaUnload.getFileName(),sys001InputPmaUnload.getSys001InputPmaUnloadCharSet(),sys001InputPmaUnload.getSys001InputPmaUnloadCrlfFlag());
          methodOut.setSys001FileStatus200(sys001InputPmaUnload.getStatusString() );
//  IF 88-200-SYS001-STATUS-GOOD
//  ELSE
          if (!(methodOut.isSys001StatusGood88200()) ) { 
//  SET 88-600-SYS001-OPEN-ERR-TXT TO TRUE
              methodOut.setSys001OpenErrTxt88600True(); 
              
//  MOVE 200-SYS001-FILE-STATUS TO 600-SYS001-STATUS
              methodOut.setSys001Status600(methodOut.getSys001FileStatus200());
//  MOVE 300-SYS001-OP-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getSys001OpAbendCode300());
//  MOVE 300-PARA-1400 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara1400300());
              // MOVE 600-SYS001-ERR-MSG-TXT TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getSys001ErrMsgTxt600().toCharArray());
//  PERFORM 9500-ABEND-THE-PROGRAM
              abendTheProgram(programCtx.getAbendTheProgramInCtx());/*9500-ABEND-THE-PROGRAM*/
          }
      
      return methodOut;
      }
      /**
      * connectToDb2 
      *   This method is derived from 
  *   COBOL Paragraph - 2000-CONNECT-TO-DB2 COBOL Cyclomatic complexity - 2
      * Input  :  

      * - abendSwitch100                 COBOL Name: 100-ABEND-SWITCH
      *
      * Output :  

      * - apiStatus100                   COBOL Name: 100-API-STATUS
      * - isItSqlError100                COBOL Name: 100-IS-IT-SQL-ERROR
      * - abendPara300                   COBOL Name: 300-ABEND-PARA
      * - abendCode300                   COBOL Name: 300-ABEND-CODE
      * - abendMessage600                COBOL Name: 600-ABEND-MESSAGE
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - abendCode800                   COBOL Name: 800-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      *
      * @throws CFException
      */
      @Override
      public ConnectToDb2OutCtx connectToDb2(ConnectToDb2InCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph establishes the connection to db2 and checks the*
// * collection id.                                                 *
// *----------------------------------------------------------------*
Ip343690Ctx programCtx = methodIn.getIp343690Ctx();
ConnectToDb2OutCtx methodOut = methodIn.getConnectToDb2OutCtx();
//  PERFORM 8000-CHECK-DB2-CONNECTION
          checkDb2Connection(programCtx.getCheckDb2ConnectionInCtx());/*8000-CHECK-DB2-CONNECTION*/
//  PERFORM 8100-CHECK-STATUS-MAP
          checkStatusMap(programCtx.getCheckStatusMapInCtx());/*8100-CHECK-STATUS-MAP*/
//  IF 88-100-IT-IS-ABEND
          if ( methodIn.isItIsAbend88100()  ) { 
//  SET 88-100-NEGATIVE-CODE TO TRUE
              methodOut.setNegativeCode88100True(); 
              
//  SET 88-100-IT-IS-SQL-ERROR TO TRUE
              methodOut.setItIsSqlError88100True(); 
              
//  SET 88-300-DB2-ABEND-2000-PARA TO TRUE
              methodOut.setDb2Abend2000Para88300True(); 
              
//  SET 88-300-DB2-UNSUCESS-CONNECT TO TRUE
              methodOut.setDb2UnsucessConnect88300True(); 
              
//  SET 88-600-ABEND-DB2-CONN-ERROR TO TRUE
              methodOut.setAbendDb2ConnError88600True(); 
              
//  MOVE 300-ABEND-PARA TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getAbendPara300());
//  MOVE 300-ABEND-CODE TO 800-ABEND-CODE
              methodOut.getAbendCode800().setString(methodOut.getAbendCode300());
//  MOVE 600-ABEND-MESSAGE TO 900-ABEND-TEXT
              methodOut.setAbendText900(pad(66,methodOut.getAbendMessage600(),SPACE_CHAR,RIGHT_PAD));
//  PERFORM 9500-ABEND-THE-PROGRAM
              abendTheProgram(programCtx.getAbendTheProgramInCtx());/*9500-ABEND-THE-PROGRAM*/
          }
      
      return methodOut;
      }
      /**
      * processInputSys001 
      *   This method is derived from 
  *   COBOL Paragraph - 3000-PROCESS-INPUT-SYS001 COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sys001FileStatus200            COBOL Name: 200-SYS001-FILE-STATUS
      *
      * Output : None 

      * @throws CFException
      */
      @Override
      public void processInputSys001(ProcessInputSys001InCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph processes ia for matching virtual pan number.   *
// *----------------------------------------------------------------*
Ip343690Ctx programCtx = methodIn.getIp343690Ctx();
//  PERFORM 8200-READ-INPUT-SYS001
          readInputSys001(programCtx.getReadInputSys001InCtx());/*8200-READ-INPUT-SYS001*/
//  PERFORM UNTIL 88-200-SYS001-STATUS-EOF
          while ((!(methodIn.isSys001StatusEof88200()) )) {
//  PERFORM 3100-PROCESS-TABLE40-LOOKUP
              processTable40Lookup(programCtx.getProcessTable40LookupInCtx());/*3100-PROCESS-TABLE40-LOOKUP*/
//  PERFORM 3200-UPDATE-TIPAPMA
              updateTipapma(programCtx.getUpdateTipapmaInCtx());/*3200-UPDATE-TIPAPMA*/
//  PERFORM 8200-READ-INPUT-SYS001
              readInputSys001(programCtx.getReadInputSys001InCtx());/*8200-READ-INPUT-SYS001*/
          }
//  PERFORM 3300-DO-END-PROCESS
          doEndProcess(programCtx.getDoEndProcessInCtx());/*3300-DO-END-PROCESS*/
          ;
      
      }
      /**
      * processTable40Lookup 
      *   This method is derived from 
  *   COBOL Paragraph - 3100-PROCESS-TABLE40-LOOKUP COBOL Cyclomatic complexity - 7
      * Input  :  

      * - virtualAccountNbr800           COBOL Name: 800-VIRTUAL-ACCOUNT-NBR
      * - value19300                     COBOL Name: 300-VALUE-19
      * - value01300                     COBOL Name: 300-VALUE-01
      * - ip00404EntriesFoundCount       COBOL Name: IP00404-ENTRIES-FOUND-COUNT
      * - ip00404SeqServiceInd           COBOL Name: IP00404-SEQ-SERVICE-IND
      *
      * Output :  

      * - nonSpaceFound800               COBOL Name: 800-NON-SPACE-FOUND
      * - seqNumberOpt100                COBOL Name: 100-SEQ-NUMBER-OPT
      * - justifyIn800                   COBOL Name: 800-JUSTIFY-IN
      * - justifyOut800                  COBOL Name: 800-JUSTIFY-OUT
      * - ip00404Tbl40ArH                COBOL Name: IP00404-TBL-40-AR-H
      * - virtualAccountNbr800           COBOL Name: 800-VIRTUAL-ACCOUNT-NBR
      * - actualLen800                   COBOL Name: 800-ACTUAL-LEN
      * - value19300                     COBOL Name: 300-VALUE-19
      * - rc                             COBOL Name: RETURN-CODE
      * - ip00404AcctRngIndex            COBOL Name: IP00404-ACCT-RNG-INDEX
      *
      * @throws CFException
      */
      @Override
      public ProcessTable40LookupOutCtx processTable40Lookup(ProcessTable40LookupInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph check the table40 for the funding pan number    *
// * to find the sequence number opt in or out                      *
// *----------------------------------------------------------------*
Ip343690Ctx programCtx = methodIn.getIp343690Ctx();
ProcessTable40LookupOutCtx methodOut = methodIn.getProcessTable40LookupOutCtx();
//  SET 88-800-NON-SPACE-FOUND-N TO TRUE
          methodOut.setNonSpaceFoundN88800True(); 
          
//  SET 88-100-SEQ-OPT-OUT TO TRUE
          methodOut.setSeqOptOut88100True(); 
          
          // MOVE SPACES TO 800-JUSTIFY-IN 800-JUSTIFY-OUT
          methodOut.setJustifyIn800(CONSTANTS.SPACE_19);
          methodOut.setJustifyOut800(CONSTANTS.SPACE_19);
//  MOVE ZEROES TO IP00404-TBL-40-AR-H
          methodOut.setIp00404Tbl40ArH(CONSTANTS.ZERO_19);
          // MOVE 800-VIRTUAL-ACCOUNT-NBR TO 800-JUSTIFY-IN
          methodOut.setJustifyIn800(methodOut.getVirtualAccountNbr800());
//  MOVE 300-VALUE-19 TO 800-ACTUAL-LEN
          methodOut.setActualLen800((short) methodOut.getValue19300());
//  PERFORM UNTIL 88-800-NON-SPACE-FOUND-Y OR 800-ACTUAL-LEN LESS THAN OR EQUAL 300-VALUE-01
          while ((!(methodOut.isNonSpaceFoundY88800())  && 	( methodOut.getActualLen800() > methodIn.getValue01300() ))) {
//  IF 800-JUSTIFY-IN ( 800-ACTUAL-LEN : 1) NOT EQUAL SPACES
              if (methodOut.getJustifyIn800()[(methodOut.getActualLen800() - 1)] != ' ') { 
//  SET 88-800-NON-SPACE-FOUND-Y TO TRUE
                  methodOut.setNonSpaceFoundY88800True(); 
                  
//  MOVE 800-JUSTIFY-IN TO 800-JUSTIFY-OUT (1 : 800-ACTUAL-LEN )
                  methodOut.setJustifyOut800(replace(methodOut.getJustifyOut800(),methodOut.getJustifyIn800(),0,methodOut.getActualLen800()));
              }
//  ELSE
              else { 
//  SUBTRACT 1 FROM 800-ACTUAL-LEN
                  methodOut.setActualLen800( (short) (methodOut.getActualLen800()-(short)1));
              }
          }
//  MOVE 800-JUSTIFY-OUT TO IP00404-TBL-40-AR-H (1 : 800-ACTUAL-LEN )
          methodOut.setIp00404Tbl40ArH(methodOut.getJustifyOut800(),0,methodOut.getJustifyOut800().length,0/* ip00404Tbl40ArH */ ,methodOut.getActualLen800() /* field,targetIndex,targetLen */);
//  CALL 800-PTR-IP280010
          // CALL 800-PTR-IP280010
          	programCtx.setRc( ip280010.process(programCtx.getGlobalCtx().getContext("IP280010")));
//  IF IP00404-ENTRIES-FOUND-COUNT GREATER THAN ZEROES
          if (	( methodIn.getIp00404EntriesFoundCount() > 0 )) { 
//  SET IP00404-ACCT-RNG-INDEX TO 1
              methodOut.setIp00404AcctRngIndex(1); 
              
//  IF 88-IP00404-SEQ-OPT-IN ( IP00404-ACCT-RNG-INDEX )
              if ( methodIn.isIp00404SeqOptIn88(methodOut.getIp00404AcctRngIndex() - 1)  ) { 
//  SET 88-100-SEQ-OPT-IN TO TRUE
                  methodOut.setSeqOptIn88100True(); 
                  
              }
          }
      
      return methodOut;
      }
      /**
      * updateTipapma 
      *   This method is derived from 
  *   COBOL Paragraph - 3200-UPDATE-TIPAPMA COBOL Cyclomatic complexity - 3
      * Input  :  

      * - seqNumberOpt100                COBOL Name: 100-SEQ-NUMBER-OPT
      * - nullValue300                   COBOL Name: 300-NULL-VALUE
      * - virtualAccountNbr800           COBOL Name: 800-VIRTUAL-ACCOUNT-NBR
      * - primAccountNbr800              COBOL Name: 800-PRIM-ACCOUNT-NBR
      * - eofPmaCursor100                COBOL Name: 100-EOF-PMA-CURSOR
      *
      * Output :  

      * - tipapmaPrimAcctSeqNumN         COBOL Name: TIPAPMA-PRIM-ACCT-SEQ-NUM-N
      * - nullValue300                   COBOL Name: 300-NULL-VALUE
      * - tipapmaPrimAcctSeqNum          COBOL Name: TIPAPMA-PRIM-ACCT-SEQ-NUM
      * - tipapmaVrtlAcctNum             COBOL Name: TIPAPMA-VRTL-ACCT-NUM
      * - virtualAccountNbr800           COBOL Name: 800-VIRTUAL-ACCOUNT-NBR
      * - tipapmaPrimAcctNum             COBOL Name: TIPAPMA-PRIM-ACCT-NUM
      * - primAccountNbr800              COBOL Name: 800-PRIM-ACCOUNT-NBR
      *
      * @throws CFException
      */
      @Override
      public UpdateTipapmaOutCtx updateTipapma(UpdateTipapmaInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph updates the tipapma table.                      *
// *----------------------------------------------------------------*
Ip343690Ctx programCtx = methodIn.getIp343690Ctx();
UpdateTipapmaOutCtx methodOut = methodIn.getUpdateTipapmaOutCtx();
//  IF 88-100-SEQ-OPT-IN
//  ELSE
          if (!(methodIn.isSeqOptIn88100()) ) { 
//  MOVE 300-NULL-VALUE TO TIPAPMA-PRIM-ACCT-SEQ-NUM-N
              methodOut.setTipapmaPrimAcctSeqNumN(methodOut.getNullValue300());
//  MOVE ZEROES TO TIPAPMA-PRIM-ACCT-SEQ-NUM
              methodOut.setTipapmaPrimAcctSeqNum(CONSTANTS.ZERO_3);
//  MOVE 800-VIRTUAL-ACCOUNT-NBR TO TIPAPMA-VRTL-ACCT-NUM
              methodOut.setTipapmaVrtlAcctNum(methodOut.getVirtualAccountNbr800());
//  MOVE 800-PRIM-ACCOUNT-NBR TO TIPAPMA-PRIM-ACCT-NUM
              methodOut.setTipapmaPrimAcctNum(methodOut.getPrimAccountNbr800());
//  PERFORM 3210-OPEN-PMA-CURSOR
              openPmaCursor(programCtx.getOpenPmaCursorInCtx());/*3210-OPEN-PMA-CURSOR*/
//  PERFORM 3220-FETCH-UPDATE-PMA-CURSOR UNTIL 88-100-EOF-PMA-CURSOR
              while (!(methodIn.isEofPmaCursor88100()) ) {
                 fetchUpdatePmaCursor(programCtx.getFetchUpdatePmaCursorInCtx());/*3220-FETCH-UPDATE-PMA-CURSOR*/
              }
//  PERFORM 3230-CLOSE-PMA-CURSOR
              closePmaCursor(programCtx.getClosePmaCursorInCtx());/*3230-CLOSE-PMA-CURSOR*/
          }
      
      return methodOut;
      }
      /**
      * openPmaCursor 
      *   This method is derived from 
  *   COBOL Paragraph - 3210-OPEN-PMA-CURSOR COBOL Cyclomatic complexity - 4
      * Input  :  

      * - valueZero300                   COBOL Name: 300-VALUE-ZERO
      * - openTipapmaCursor300           COBOL Name: 300-OPEN-TIPAPMA-CURSOR
      * - para3210300                    COBOL Name: 300-PARA-3210
      * - sqlcode                        COBOL Name: SQLCODE
      * - sqlerrmc                       COBOL Name: SQLERRMC
      *
      * Output :  

      * - eofPmaCursor100                COBOL Name: 100-EOF-PMA-CURSOR
      * - isItSqlError100                COBOL Name: 100-IS-IT-SQL-ERROR
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - openTipapmaCursor300           COBOL Name: 300-OPEN-TIPAPMA-CURSOR
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para3210300                    COBOL Name: 300-PARA-3210
      * - abendSqlCode900                COBOL Name: 900-ABEND-SQL-CODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - abendSqlerrmc900               COBOL Name: 900-ABEND-SQLERRMC
      * - sqlerrmc                       COBOL Name: SQLERRMC
      *
      * @throws CFException
      */
      @Override
      public OpenPmaCursorOutCtx openPmaCursor(OpenPmaCursorInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph opens tipapma cursor.                           *
// *----------------------------------------------------------------*
Ip343690Ctx programCtx = methodIn.getIp343690Ctx();
OpenPmaCursorOutCtx methodOut = methodIn.getOpenPmaCursorOutCtx();
//  MOVE SPACES TO 100-EOF-PMA-CURSOR
          methodOut.setEofPmaCursor100(CONSTANTS.SPACE);
//  SELECT VRTL_ACCT_NUM , PRIM_ACCT_NUM , PRIM_ACCT_SEQ_NUM FROM TIPAPMA WHERE VRTL_ACCT_NUM = ? AND PRIM_ACCT_NUM = ? AND SUBSTR ( ? , LENGTH ( TRIM ( ? ) ) -2 , 3 ) = PARTN_ID FOR UPDATE OF PRIM_ACCT_SEQ_NUM
          programCtx.setPmaCursorResultSet(ip343690Repository.openPmaCursorIp343690(methodIn.getTipapma(),programCtx.getSqlca()));
//  EVALUATE SQLCODE
          if  (	( methodOut.getSqlcode() == methodIn.getValueZero300() ) ) { 
              ;
          }
          else   { 
//  SET 88-100-IT-IS-SQL-ERROR TO TRUE
              methodOut.setItIsSqlError88100True(); 
              
//  MOVE 300-OPEN-TIPAPMA-CURSOR TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getOpenTipapmaCursor300());
//  MOVE 300-PARA-3210 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara3210300());
              // MOVE SQLCODE TO 900-ABEND-SQL-CODE
              //  FORMAT431311340 = "-999999999"
              methodOut.setAbendSqlCode900(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT431311340,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  MOVE SQLERRMC TO 900-ABEND-SQLERRMC
              methodOut.setAbendSqlerrmc900(methodOut.getSqlerrmc());
//  PERFORM 9500-ABEND-THE-PROGRAM
              abendTheProgram(programCtx.getAbendTheProgramInCtx());/*9500-ABEND-THE-PROGRAM*/
          }
      
      return methodOut;
      }
      /**
      * fetchUpdatePmaCursor 
      *   This method is derived from 
  *   COBOL Paragraph - 3220-FETCH-UPDATE-PMA-CURSOR COBOL Cyclomatic complexity - 6
      * Input  :  

      * - valueZero300                   COBOL Name: 300-VALUE-ZERO
      * - value100300                    COBOL Name: 300-VALUE-100
      * - fetchPmaAbendCode300           COBOL Name: 300-FETCH-PMA-ABEND-CODE
      * - para3220300                    COBOL Name: 300-PARA-3220
      * - sqlcode                        COBOL Name: SQLCODE
      * - sqlerrmc                       COBOL Name: SQLERRMC
      *
      * Output :  

      * - isItDeadLock100                COBOL Name: 100-IS-IT-DEAD-LOCK
      * - eofPmaCursor100                COBOL Name: 100-EOF-PMA-CURSOR
      * - isItSqlError100                COBOL Name: 100-IS-IT-SQL-ERROR
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - fetchPmaAbendCode300           COBOL Name: 300-FETCH-PMA-ABEND-CODE
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para3220300                    COBOL Name: 300-PARA-3220
      * - abendSqlCode900                COBOL Name: 900-ABEND-SQL-CODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - abendSqlerrmc900               COBOL Name: 900-ABEND-SQLERRMC
      * - sqlerrmc                       COBOL Name: SQLERRMC
      *
      * @throws CFException
      */
      @Override
      public FetchUpdatePmaCursorOutCtx fetchUpdatePmaCursor(FetchUpdatePmaCursorInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph fetches tipapma cursor.                         *
// *----------------------------------------------------------------*
Ip343690Ctx programCtx = methodIn.getIp343690Ctx();
FetchUpdatePmaCursorOutCtx methodOut = methodIn.getFetchUpdatePmaCursorOutCtx();
//  FETCH PMA_CURSOR INTO ? , ?
          ip343690Repository.fetchPmaCursorIp343690(programCtx.getPmaCursorResultSet(),methodOut.getTipapma(),programCtx.getSqlca());
//  EVALUATE SQLCODE
          if  (	( methodOut.getSqlcode() == methodIn.getValueZero300() ) ) { 
//  SET 88-IT-IS-DEAD-LOCK-Y TO TRUE
              methodOut.setItIsDeadLockY88True(); 
              
//  PERFORM 8300-UPDATE-PMA-CURSOR UNTIL 88-IT-IS-DEAD-LOCK-N
              while (!(methodOut.isItIsDeadLockN88()) ) {
                 updatePmaCursor(programCtx.getUpdatePmaCursorInCtx());/*8300-UPDATE-PMA-CURSOR*/
              }
          }
          else if  (	( methodOut.getSqlcode() == methodIn.getValue100300() ) ) { 
//  SET 88-100-EOF-PMA-CURSOR TO TRUE
              methodOut.setEofPmaCursor88100True(); 
              
          }
          else   { 
//  SET 88-100-IT-IS-SQL-ERROR TO TRUE
              methodOut.setItIsSqlError88100True(); 
              
//  MOVE 300-FETCH-PMA-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getFetchPmaAbendCode300());
//  MOVE 300-PARA-3220 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara3220300());
              // MOVE SQLCODE TO 900-ABEND-SQL-CODE
              //  FORMAT431311340 = "-999999999"
              methodOut.setAbendSqlCode900(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT431311340,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  MOVE SQLERRMC TO 900-ABEND-SQLERRMC
              methodOut.setAbendSqlerrmc900(methodOut.getSqlerrmc());
//  PERFORM 9500-ABEND-THE-PROGRAM
              abendTheProgram(programCtx.getAbendTheProgramInCtx());/*9500-ABEND-THE-PROGRAM*/
          }
      
      return methodOut;
      }
      /**
      * closePmaCursor 
      *   This method is derived from 
  *   COBOL Paragraph - 3230-CLOSE-PMA-CURSOR COBOL Cyclomatic complexity - 4
      * Input  :  

      * - valueZero300                   COBOL Name: 300-VALUE-ZERO
      * - closeTipapmaCursor300          COBOL Name: 300-CLOSE-TIPAPMA-CURSOR
      * - para3230300                    COBOL Name: 300-PARA-3230
      * - sqlcode                        COBOL Name: SQLCODE
      * - sqlerrmc                       COBOL Name: SQLERRMC
      *
      * Output :  

      * - isItSqlError100                COBOL Name: 100-IS-IT-SQL-ERROR
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - closeTipapmaCursor300          COBOL Name: 300-CLOSE-TIPAPMA-CURSOR
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para3230300                    COBOL Name: 300-PARA-3230
      * - abendSqlCode900                COBOL Name: 900-ABEND-SQL-CODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - abendSqlerrmc900               COBOL Name: 900-ABEND-SQLERRMC
      * - sqlerrmc                       COBOL Name: SQLERRMC
      *
      * @throws CFException
      */
      @Override
      public ClosePmaCursorOutCtx closePmaCursor(ClosePmaCursorInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph close pma_cursor                                *
// *----------------------------------------------------------------*
Ip343690Ctx programCtx = methodIn.getIp343690Ctx();
ClosePmaCursorOutCtx methodOut = methodIn.getClosePmaCursorOutCtx();
//  CLOSE PMA_CURSOR
          ip343690Repository.closePmaCursorIp343690(programCtx.getPmaCursorResultSet(),programCtx.getSqlca());
//  EVALUATE SQLCODE
          if  (	( methodOut.getSqlcode() == methodIn.getValueZero300() ) ) { 
              ;
          }
          else   { 
//  SET 88-100-IT-IS-SQL-ERROR TO TRUE
              methodOut.setItIsSqlError88100True(); 
              
//  MOVE 300-CLOSE-TIPAPMA-CURSOR TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getCloseTipapmaCursor300());
//  MOVE 300-PARA-3230 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara3230300());
              // MOVE SQLCODE TO 900-ABEND-SQL-CODE
              //  FORMAT431311340 = "-999999999"
              methodOut.setAbendSqlCode900(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT431311340,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  MOVE SQLERRMC TO 900-ABEND-SQLERRMC
              methodOut.setAbendSqlerrmc900(methodOut.getSqlerrmc());
//  PERFORM 9500-ABEND-THE-PROGRAM
              abendTheProgram(programCtx.getAbendTheProgramInCtx());/*9500-ABEND-THE-PROGRAM*/
          }
      
      return methodOut;
      }
      /**
      * doEndProcess 
      *   This method is derived from 
  *   COBOL Paragraph - 3300-DO-END-PROCESS COBOL Cyclomatic complexity - 1
      * Input  :  

      * - recsReadMsg600                 COBOL Name: 600-RECS-READ-MSG
      * - recsRead400                    COBOL Name: 400-RECS-READ
      * - recsUpdatedMsg600              COBOL Name: 600-RECS-UPDATED-MSG
      * - noOfRows800                    COBOL Name: 800-NO-OF-ROWS
      *
      * Output :  

      * - isEndOfProcess100              COBOL Name: 100-IS-END-OF-PROCESS
      *
      * @throws CFException
      */
      @Override
      public DoEndProcessOutCtx doEndProcess(DoEndProcessInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// * This paragraph closes all the files and checks for the status. *
// * if it is not good performs terminate process.                  *
// *-----------------------------------------------------------------
Ip343690Ctx programCtx = methodIn.getIp343690Ctx();
DoEndProcessOutCtx methodOut = methodIn.getDoEndProcessOutCtx();
//  SET 88-100-END-OF-PROCESS TO TRUE
          methodOut.setEndOfProcess88100True(); 
          
//  PERFORM 8400-DO-COMMIT
          doCommit(programCtx.getDoCommitInCtx());/*8400-DO-COMMIT*/
//  PERFORM 8210-CLOSE-INPUT-SYS001
          closeInputSys001(programCtx.getCloseInputSys001InCtx());/*8210-CLOSE-INPUT-SYS001*/
//  DISPLAY 600-RECS-READ-MSG 400-RECS-READ
          logger.info("{}{}", new String(methodIn.getRecsReadMsg600()), String.valueOf(methodIn.getRecsRead400())); 
//  DISPLAY 600-RECS-UPDATED-MSG 800-NO-OF-ROWS
          logger.info("{}{}", new String(methodIn.getRecsUpdatedMsg600()), String.valueOf(methodIn.getNoOfRows800())); 
      
      return methodOut;
      }
      /**
      * checkDb2Connection 
      *   This method is derived from 
  *   COBOL Paragraph - 8000-CHECK-DB2-CONNECTION COBOL Cyclomatic complexity - 19
      * Input  :  

      * - sqlcode                        COBOL Name: SQLCODE
      * - db85102dCurrCollId             COBOL Name: DB85102D-CURR-COLL-ID
      * - thisPgmDb2CollIdBase300        COBOL Name: 300-THIS-PGM-DB2-COLL-ID-BASE
      * - db85102dDb2CloneNum            COBOL Name: DB85102D-DB2-CLONE-NUM
      *
      * Output :  

      * - db85102dConnectStatusMap       COBOL Name: DB85102D-CONNECT-STATUS-MAP
      * - sqlTemp                        COBOL Name: SQL-TEMP
      * - db85102dPrevCollId             COBOL Name: DB85102D-PREV-COLL-ID
      * - db85102dCurrCollId             COBOL Name: DB85102D-CURR-COLL-ID
      * - db85102dTempCollId             COBOL Name: DB85102D-TEMP-COLL-ID
      * - sys001FileStatus200            COBOL Name: 200-SYS001-FILE-STATUS
      * - db85102dDb2cloneStatus         COBOL Name: DB85102D-DB2CLONE-STATUS
      * - db2cloneRec                    COBOL Name: DB2CLONE-REC
      * - db85102dDb2CloneNum            COBOL Name: DB85102D-DB2-CLONE-NUM
      * - thisPgmDb2CollIdBase300        COBOL Name: 300-THIS-PGM-DB2-COLL-ID-BASE
      *
      * @throws CFException
      */
      @Override
      public CheckDb2ConnectionOutCtx checkDb2Connection(CheckDb2ConnectionInCtx methodIn) throws Exception {
      
// *****************************************************************

// *****************************************************************
// *    This paragraph basically does the following:               *
// *                                                               *
// *    reset the status-map to indicate a good execution.         *
// *    check to see if the currently-set collection-id is the one *
// *    we need to use for this program.  if so, bypass everything *
// *    else.  but if not, build and set the collection-id in db2  *
// *    to the correct one for this program.  also, if the program *
// *    wasn't previously connected to db2, read the db2 clone     *
// *    number before setting the collection-id, then after setting*
// *    it (which automatically performs the connect to db2),      *
// *    retrieve the server name, user id and sqlid from db2.      *
// *    anywhere along the way, if any step gets a bad return code,*
// *    then set a flag for the failing step in the status-map,    *
// *    bypass all the remaining steps and exit the paragraph.     *
// *                                                               *
// *    note:                                                      *
// *        the 8-char collection-id is made up of the following:  *
// *        the program's 7-char collection-id-base constant and   *
// *        the 1-char db2clone number read from the flat-file.    *
// *****************************************************************
// *    display '8000-check-db2-connection'
// SELECT CURRENT PACKAGESET  FROM SYSIBM.SYSDUMMY1 
Ip343690Ctx programCtx = methodIn.getIp343690Ctx();
CheckDb2ConnectionOutCtx methodOut = methodIn.getCheckDb2ConnectionOutCtx();
          // MOVE '00000' TO DB85102D-CONNECT-STATUS-MAP
          //  LITERAL_00000 = '00000'
          methodOut.setDb85102dConnectStatusMap(CONSTANTS.LITERAL_00000);
          // MOVE 'CURRENT PACKAGESET' TO SQL-TEMP
          methodOut.setSqlTemp(CONSTANTS.LITERAL_2007672260);
//  SELECT CURRENT PACKAGESET FROM SYSIBM.SYSDUMMY1
          
/**
******   SET :DB85102D-CURR-COLL-ID = CURRENT PACKAGESET           
**/
          methodOut.setSqlcode(0);
          methodOut.setDb85102dCurrCollId(db2Base.getCollectionId()); 
//  IF SQLCODE NOT = ZERO
          if (	( methodOut.getSqlcode() != 0 )) { 
//  MOVE '2' TO DB85102D-CONNECT-STATUS-MAP (2 : 1)
//  LITERAL_2 = '2'
              methodOut.setDb85102dConnectStatusMap(replace(methodOut.getDb85102dConnectStatusMap(),CONSTANTS.LITERAL_2,1,2));
//  DISPLAY '  DB85102L RECEIVED NON-ZERO SQLCODE ' 'TRYING TO RETRIEVE COLLECTION-ID ' '''' DB85102D-CURR-COLL-ID '''.'
              logger.info("  DB85102L RECEIVED NON-ZERO SQLCODE TRYING TO RETRIEVE COLLECTION-ID \'{}\'.", new String(methodOut.getDb85102dCurrCollId())); 
//  DISPLAY ' THE SQLCODE RETURNED WAS : ' SQLCODE
              logger.info(" THE SQLCODE RETURNED WAS : {}", String.valueOf(methodOut.getSqlcode())); 
          }
//  ELSE
          else { 
//  MOVE DB85102D-CURR-COLL-ID TO DB85102D-PREV-COLL-ID
              methodOut.setDb85102dPrevCollId(methodOut.getDb85102dCurrCollId());
//  MOVE DB85102D-CURR-COLL-ID TO DB85102D-TEMP-COLL-ID
              methodOut.setDb85102dTempCollId(methodOut.getDb85102dCurrCollId());
          }

// *    Need to switch to the correct coll-id for this program.    *
// *    if they do match, then we can bypass everything else.      *
// *****************************************************************
//  IF DB85102D-CURR-COLL-ID (1 : 7) NOT = 300-THIS-PGM-DB2-COLL-ID-BASE
          if (!(Field.compareChar(methodOut.getDb85102dCurrCollId() , methodOut.getThisPgmDb2CollIdBase300() , ( 0 /*start*/ ), 7 /*left len*/ , 7 /*right len*/))) { 

// *****************************************************************
// *        If not yet connected to db2, then read the db2 clone   *
// *        number from the flat file and plug it into the 8th     *
// *        position of the collection-id.                         *
// *****************************************************************
//  IF DB85102D-CURR-COLL-ID = SPACES OR LOW-VALUES
              if (        ( allSpaces(methodOut.getDb85102dCurrCollId())   ) || 			( checkLowValue(methodOut.getDb85102dCurrCollId()) ) ) { 
//  MOVE SPACES TO DB85102D-TEMP-COLL-ID
                  methodOut.setDb85102dTempCollId(CONSTANTS.SPACE_18);
//  OPEN INPUT DB2CLONE-FILE
                  db2cloneFile.open(new String(CONSTANTS.MODE_READ_ONLY_36242),db2cloneFile.getFileName(),db2cloneFile.getDb2cloneFileCharSet(),db2cloneFile.getDb2cloneFileCrlfFlag());
                  methodOut.setDb85102dDb2cloneStatus(db2cloneFile.getStatusString() );
//  IF 88-DB85102D-DB2CLONE-IO-GOOD
                  if ( methodOut.isDb85102dDb2cloneIoGood88()  ) { 
//  READ DB2CLONE-FILE INTO DB85102D-DB2CLONE-REC END-READ
                      	db2cloneFile.read();
                      methodOut.setDb85102dDb2cloneStatus(db2cloneFile.getStatusString() );
                      if (!db2cloneFile.hasEnded()) {
                         methodOut.getDb2cloneRec().setString(db2cloneFile.getRecord());
                         methodIn.getDb85102dDb2cloneRec().setString(methodOut.getDb2cloneRec().toCharArray());
                      }
//  IF 88-DB85102D-DB2CLONE-IO-GOOD
                      if ( methodOut.isDb85102dDb2cloneIoGood88()  ) { 
//  MOVE DB85102D-DB2-CLONE-NUM TO DB85102D-TEMP-COLL-ID (8 : 3)
                          methodOut.getDb85102dWorkFields().replace(methodIn.getDb85102dDb2cloneRec()/*parent*/,0/*fromOffset - (db85102dTempCollId) */,3/*fromLen*/,23+8 - 1/*toOffset - (db85102dDb2CloneNum) */,3/*toLen*/);
//  DISPLAY 'DB85102D-DB2-CLONE-NUM = ' DB85102D-DB2-CLONE-NUM
                          logger.info("DB85102D-DB2-CLONE-NUM = {}", new String(methodOut.getDb85102dDb2CloneNum())); 
                      }
//  ELSE
                      else { 
//  MOVE '1' TO DB85102D-CONNECT-STATUS-MAP (1 : 1)
//  LITERAL_1 = '1'
                          methodOut.setDb85102dConnectStatusMap(replace(methodOut.getDb85102dConnectStatusMap(),CONSTANTS.LITERAL_1,0,1));
                      }
                  }
//  ELSE
                  else { 
//  MOVE '1' TO DB85102D-CONNECT-STATUS-MAP (1 : 1)
//  LITERAL_1 = '1'
                      methodOut.setDb85102dConnectStatusMap(replace(methodOut.getDb85102dConnectStatusMap(),CONSTANTS.LITERAL_1,0,1));
                  }
//  CLOSE DB2CLONE-FILE
                  db2cloneFile.close(); 
                  methodOut.setDb85102dDb2cloneStatus(db2cloneFile.getStatusString() );
//  IF DB85102D-CONNECT-STATUS-MAP (1 : 1) = '1'
//  LITERAL_1 = '1'
                  if ( methodOut.getDb85102dConnectStatusMap()[0] == '1') { 
//cobolCode::GO TO 8000-CHECK-DB2-EXIT
checkStatusMap(programCtx.getCheckStatusMapInCtx());
readInputSys001(programCtx.getReadInputSys001InCtx());
closeInputSys001(programCtx.getCloseInputSys001InCtx());
updatePmaCursor(programCtx.getUpdatePmaCursorInCtx());
doCommit(programCtx.getDoCommitInCtx());
deadLock(programCtx.getDeadLockInCtx());
callMcwaitForSleep(programCtx.getCallMcwaitForSleepInCtx());
abendTheProgram(programCtx.getAbendTheProgramInCtx());
executeDb2errRotuine(programCtx.getExecuteDb2errRotuineInCtx());
updateEventLog(programCtx.getUpdateEventLogInCtx());
return methodOut;
//cobolCodeEnds::GO TO 8000-CHECK-DB2-EXIT
                  }
              }

// *****************************************************************
// *        Finish building the collection-id by plugging the      *
// *        program's coll-id-base into the first 7 positions. then*
// *        set the collection-id in db2 by doing a "set current   *
// *        packageset" statement. (note: this statement will also *
// *        cause the implicit caf connection to db2 to occur.)    *
// *****************************************************************
//  MOVE 300-THIS-PGM-DB2-COLL-ID-BASE TO DB85102D-TEMP-COLL-ID (1 : 7)
              methodOut.getDb85102dWorkFields().replace(methodIn.getConstants300()/*parent*/,65/*fromOffset - (db85102dTempCollId) */,7/*fromLen*/,23/*toOffset - (thisPgmDb2CollIdBase300) */,7/*toLen*/);
//  SET CURRENT PACKAGESET = ?
              
/**
******      SET CURRENT PACKAGESET  = :DB85102D-TEMP-COLL-ID       
**/
              db2Base.setCollectionId(methodOut.getDb85102dTempCollId()); 
//  IF SQLCODE NOT = ZERO
              if (	( methodOut.getSqlcode() != 0 )) { 
//  MOVE '1' TO DB85102D-CONNECT-STATUS-MAP (2 : 1)
//  LITERAL_1 = '1'
                  methodOut.setDb85102dConnectStatusMap(replace(methodOut.getDb85102dConnectStatusMap(),CONSTANTS.LITERAL_1,1,2));
//  DISPLAY '  DB85102L RECEIVED NON-ZERO SQLCODE ' 'TRYING TO SET COLLECTION-ID TO ' '''' DB85102D-TEMP-COLL-ID '''.'
                  logger.info("  DB85102L RECEIVED NON-ZERO SQLCODE TRYING TO SET COLLECTION-ID TO \'{}\'.", new String(methodOut.getDb85102dTempCollId())); 
//  DISPLAY ' THE SQLCODE RETURNED WAS : ' SQLCODE
                  logger.info(" THE SQLCODE RETURNED WAS : {}", String.valueOf(methodOut.getSqlcode())); 
              }
//  ELSE
              else { 
//  MOVE DB85102D-TEMP-COLL-ID TO DB85102D-CURR-COLL-ID
                  methodOut.setDb85102dCurrCollId(methodOut.getDb85102dTempCollId());

// *****************************************************************
// *          If db2 was just connected to for the first time,     *
// *          retrieve some of the connection info for future      *
// *          reference.                                           *
// *****************************************************************
// SELECT CURRENT SERVER  FROM SYSIBM.SYSDUMMY1 
//  IF DB85102D-PREV-COLL-ID = SPACES OR LOW-VALUES
                  if (        ( allSpaces(methodOut.getDb85102dPrevCollId())   ) || 			( checkLowValue(methodOut.getDb85102dPrevCollId()) ) ) { 
                      // MOVE 'CURRENT SERVER' TO SQL-TEMP
                      methodOut.setSqlTemp(CONSTANTS.LITERAL_1275506723);
//  SELECT CURRENT SERVER FROM SYSIBM.SYSDUMMY1
                      
/**
******          SET :DB85102D-DB2-CURR-SERVER = CURRENT SERVER     
**/
                      methodOut.setSqlcode(0);
                      methodIn.setDb85102dDb2CurrServer(db2Base.getCurrentServer()); 
//  IF SQLCODE NOT = ZERO
                      if (	( methodOut.getSqlcode() != 0 )) { 
//  MOVE '1' TO DB85102D-CONNECT-STATUS-MAP (3 : 1)
//  LITERAL_1 = '1'
                          methodOut.setDb85102dConnectStatusMap(replace(methodOut.getDb85102dConnectStatusMap(),CONSTANTS.LITERAL_1,2,3));
//  DISPLAY '  DB85102L RECEIVED NON-ZERO SQLCODE ' 'TRYING TO RETRIEVE THE DB2 CURRENT ' 'SERVER.'
                          logger.info("  DB85102L RECEIVED NON-ZERO SQLCODE TRYING TO RETRIEVE THE DB2 CURRENT SERVER."); 
//  DISPLAY '    THE CURRENT COLLECTION-ID WAS ' '''' DB85102D-CURR-COLL-ID '''.'
                          logger.info("    THE CURRENT COLLECTION-ID WAS \'{}\'.", new String(methodOut.getDb85102dCurrCollId())); 
//  DISPLAY ' THE SQLCODE RETURNED WAS : ' SQLCODE
                          logger.info(" THE SQLCODE RETURNED WAS : {}", String.valueOf(methodOut.getSqlcode())); 
                      }
//  ELSE
                      else { 
//  SELECT USER FROM SYSIBM.SYSDUMMY1
                          
/**
******            SET :DB85102D-DB2-USER  = USER                   
**/
                          methodOut.setSqlcode(0);
                          methodIn.setDb85102dDb2User(db2Base.getCurrentUser()); 
//  IF SQLCODE NOT = ZERO
                          if (	( methodOut.getSqlcode() != 0 )) { 
//  MOVE '1' TO DB85102D-CONNECT-STATUS-MAP (4 : 1)
//  LITERAL_1 = '1'
                              methodOut.setDb85102dConnectStatusMap(replace(methodOut.getDb85102dConnectStatusMap(),CONSTANTS.LITERAL_1,3,4));
                          }
//  ELSE
                          else { 
//  SELECT CURRENT SQLID FROM SYSIBM.SYSDUMMY1
                              
/**
******              SET :DB85102D-DB2-CURR-SQLID  = CURRENT SQLID  
**/
                              methodOut.setSqlcode(0);
                              methodIn.setDb85102dDb2CurrSqlid(db2Base.getCurrentSqlId()); 
//  IF SQLCODE NOT = ZERO
                              if (	( methodOut.getSqlcode() != 0 )) { 
//  MOVE '1' TO DB85102D-CONNECT-STATUS-MAP (5 : 1)
//  LITERAL_1 = '1'
                                  methodOut.setDb85102dConnectStatusMap(replace(methodOut.getDb85102dConnectStatusMap(),CONSTANTS.LITERAL_1,4,5));
                              }
                          }
                      }
                  }
              }
          }
      
      return methodOut;
      }
      /**
      * checkStatusMap 
      *   This method is derived from 
  *   COBOL Paragraph - 8100-CHECK-STATUS-MAP COBOL Cyclomatic complexity - 6
      * Input  :  

      * - db85102dConnectStatusMap       COBOL Name: DB85102D-CONNECT-STATUS-MAP
      * - errorValue300                  COBOL Name: 300-ERROR-VALUE
      * - para8100300                    COBOL Name: 300-PARA-8100
      * - dbConnectError8023005          COBOL Name: 802-3005-DB-CONNECT-ERROR
      * - db85102dDb2cloneStatus         COBOL Name: DB85102D-DB2CLONE-STATUS
      * - msg3001a600                    COBOL Name: 600-MSG-3001A
      * - msg3005b600                    COBOL Name: 600-MSG-3005B
      * - msg3005c600                    COBOL Name: 600-MSG-3005C
      * - msg3005d600                    COBOL Name: 600-MSG-3005D
      * - msg3005e600                    COBOL Name: 600-MSG-3005E
      *
      * Output :  

      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para8100300                    COBOL Name: 300-PARA-8100
      * - abendCode800                   COBOL Name: 800-ABEND-CODE
      * - ip60001EventErrorCode          COBOL Name: IP60001-EVENT-ERROR-CODE
      * - dbConnectError8023005          COBOL Name: 802-3005-DB-CONNECT-ERROR
      * - msg3001aFileStatus600          COBOL Name: 600-MSG-3001A-FILE-STATUS
      * - db85102dDb2cloneStatus         COBOL Name: DB85102D-DB2CLONE-STATUS
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - ip60001EventErrorMsg           COBOL Name: IP60001-EVENT-ERROR-MSG
      * - msg3001a600                    COBOL Name: 600-MSG-3001A
      * - isItSqlError100                COBOL Name: 100-IS-IT-SQL-ERROR
      * - msg3005b600                    COBOL Name: 600-MSG-3005B
      * - msg3005c600                    COBOL Name: 600-MSG-3005C
      * - msg3005d600                    COBOL Name: 600-MSG-3005D
      * - msg3005e600                    COBOL Name: 600-MSG-3005E
      * - isItConnectedToDb2100          COBOL Name: 100-IS-IT-CONNECTED-TO-DB2
      *
      * @throws CFException
      */
      @Override
      public CheckStatusMapOutCtx checkStatusMap(CheckStatusMapInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * 8100-Check-status-map.                                         *
// * procedure division copybook to check the status of connection  *
// * sql's.                                                         *
// *----------------------------------------------------------------*
Ip343690Ctx programCtx = methodIn.getIp343690Ctx();
CheckStatusMapOutCtx methodOut = methodIn.getCheckStatusMapOutCtx();
//  IF DB85102D-CONNECT-STATUS-MAP (1 : 1) = 300-ERROR-VALUE
          if (Field.compareChar(methodIn.getDb85102dConnectStatusMap() , methodIn.getErrorValue300() , ( 0 /*start*/ ), 1 /*left len*/ , 1 /*right len*/)) { 
//  MOVE 300-PARA-8100 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara8100300());
              // MOVE 802-3005-DB-CONNECT-ERROR TO 800-ABEND-CODE IP60001-EVENT-ERROR-CODE
              methodOut.getAbendCode800().setString(methodOut.getDbConnectError8023005().getCharArray());
              methodOut.setIp60001EventErrorCode(methodOut.getDbConnectError8023005().toCharArray());
//  MOVE DB85102D-DB2CLONE-STATUS TO 600-MSG-3001A-FILE-STATUS
              methodOut.setMsg3001aFileStatus600(methodOut.getDb85102dDb2cloneStatus());
              // MOVE 600-MSG-3001A TO 900-ABEND-TEXT IP60001-EVENT-ERROR-MSG
              methodOut.setAbendText900(methodOut.getMsg3001a600().toCharArray());
              methodOut.setIp60001EventErrorMsg(methodOut.getMsg3001a600().toCharArray());
//  SET 88-100-IT-IS-SQL-ERROR TO TRUE
              methodOut.setItIsSqlError88100True(); 
              
//  PERFORM 9500-ABEND-THE-PROGRAM
              abendTheProgram(programCtx.getAbendTheProgramInCtx());/*9500-ABEND-THE-PROGRAM*/
          }
//  IF DB85102D-CONNECT-STATUS-MAP (2 : 1) = 300-ERROR-VALUE
          if (Field.compareChar(methodIn.getDb85102dConnectStatusMap() , methodIn.getErrorValue300() , ( 1 /*start*/ ), 1 /*left len*/ , 1 /*right len*/)) { 
//  MOVE 300-PARA-8100 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara8100300());
              // MOVE 802-3005-DB-CONNECT-ERROR TO 800-ABEND-CODE IP60001-EVENT-ERROR-CODE
              methodOut.getAbendCode800().setString(methodOut.getDbConnectError8023005().getCharArray());
              methodOut.setIp60001EventErrorCode(methodOut.getDbConnectError8023005().toCharArray());
//  MOVE 600-MSG-3005B TO 900-ABEND-TEXT IP60001-EVENT-ERROR-MSG
              methodOut.setAbendText900(pad(66,methodOut.getMsg3005b600(),SPACE_CHAR,RIGHT_PAD));
              methodOut.setIp60001EventErrorMsg(methodOut.getMsg3005b600());
//  SET 88-100-IT-IS-SQL-ERROR TO TRUE
              methodOut.setItIsSqlError88100True(); 
              
//  PERFORM 9500-ABEND-THE-PROGRAM
              abendTheProgram(programCtx.getAbendTheProgramInCtx());/*9500-ABEND-THE-PROGRAM*/
          }
//  IF DB85102D-CONNECT-STATUS-MAP (3 : 1) = 300-ERROR-VALUE
          if (Field.compareChar(methodIn.getDb85102dConnectStatusMap() , methodIn.getErrorValue300() , ( 2 /*start*/ ), 1 /*left len*/ , 1 /*right len*/)) { 
//  MOVE 300-PARA-8100 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara8100300());
              // MOVE 802-3005-DB-CONNECT-ERROR TO 800-ABEND-CODE IP60001-EVENT-ERROR-CODE
              methodOut.getAbendCode800().setString(methodOut.getDbConnectError8023005().getCharArray());
              methodOut.setIp60001EventErrorCode(methodOut.getDbConnectError8023005().toCharArray());
//  MOVE 600-MSG-3005C TO 900-ABEND-TEXT IP60001-EVENT-ERROR-MSG
              methodOut.setAbendText900(pad(66,methodOut.getMsg3005c600(),SPACE_CHAR,RIGHT_PAD));
              methodOut.setIp60001EventErrorMsg(methodOut.getMsg3005c600());
//  SET 88-100-IT-IS-SQL-ERROR TO TRUE
              methodOut.setItIsSqlError88100True(); 
              
//  PERFORM 9500-ABEND-THE-PROGRAM
              abendTheProgram(programCtx.getAbendTheProgramInCtx());/*9500-ABEND-THE-PROGRAM*/
          }
//  IF DB85102D-CONNECT-STATUS-MAP (4 : 1) = 300-ERROR-VALUE
          if (Field.compareChar(methodIn.getDb85102dConnectStatusMap() , methodIn.getErrorValue300() , ( 3 /*start*/ ), 1 /*left len*/ , 1 /*right len*/)) { 
//  MOVE 300-PARA-8100 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara8100300());
              // MOVE 802-3005-DB-CONNECT-ERROR TO 800-ABEND-CODE IP60001-EVENT-ERROR-CODE
              methodOut.getAbendCode800().setString(methodOut.getDbConnectError8023005().getCharArray());
              methodOut.setIp60001EventErrorCode(methodOut.getDbConnectError8023005().toCharArray());
//  MOVE 600-MSG-3005D TO 900-ABEND-TEXT IP60001-EVENT-ERROR-MSG
              methodOut.setAbendText900(pad(66,methodOut.getMsg3005d600(),SPACE_CHAR,RIGHT_PAD));
              methodOut.setIp60001EventErrorMsg(methodOut.getMsg3005d600());
//  SET 88-100-IT-IS-SQL-ERROR TO TRUE
              methodOut.setItIsSqlError88100True(); 
              
//  PERFORM 9500-ABEND-THE-PROGRAM
              abendTheProgram(programCtx.getAbendTheProgramInCtx());/*9500-ABEND-THE-PROGRAM*/
          }
//  IF DB85102D-CONNECT-STATUS-MAP (5 : 1) = 300-ERROR-VALUE
          if (Field.compareChar(methodIn.getDb85102dConnectStatusMap() , methodIn.getErrorValue300() , ( 4 /*start*/ ), 1 /*left len*/ , 1 /*right len*/)) { 
//  MOVE 300-PARA-8100 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara8100300());
              // MOVE 802-3005-DB-CONNECT-ERROR TO 800-ABEND-CODE IP60001-EVENT-ERROR-CODE
              methodOut.getAbendCode800().setString(methodOut.getDbConnectError8023005().getCharArray());
              methodOut.setIp60001EventErrorCode(methodOut.getDbConnectError8023005().toCharArray());
//  MOVE 600-MSG-3005E TO 900-ABEND-TEXT IP60001-EVENT-ERROR-MSG
              methodOut.setAbendText900(pad(66,methodOut.getMsg3005e600(),SPACE_CHAR,RIGHT_PAD));
              methodOut.setIp60001EventErrorMsg(methodOut.getMsg3005e600());
//  SET 88-100-IT-IS-SQL-ERROR TO TRUE
              methodOut.setItIsSqlError88100True(); 
              
//  PERFORM 9500-ABEND-THE-PROGRAM
              abendTheProgram(programCtx.getAbendTheProgramInCtx());/*9500-ABEND-THE-PROGRAM*/
          }
//  SET 88-100-IT-IS-CONNECTED-TO-DB2 TO TRUE
          methodOut.setItIsConnectedToDb288100True(); 
          
      
      return methodOut;
      }
      /**
      * readInputSys001 
      *   This method is derived from 
  *   COBOL Paragraph - 8200-READ-INPUT-SYS001 COBOL Cyclomatic complexity - 3
      * Input  :  

      * - recsRead400                    COBOL Name: 400-RECS-READ
      * - sys001RdAbendCode300           COBOL Name: 300-SYS001-RD-ABEND-CODE
      * - para8200300                    COBOL Name: 300-PARA-8200
      * - sys001ErrMsgTxt600             COBOL Name: 600-SYS001-ERR-MSG-TXT
      *
      * Output :  

      * - sys001InputPmaUnldRec          COBOL Name: SYS001-INPUT-PMA-UNLD-REC
      * - sys001FileStatus200            COBOL Name: 200-SYS001-FILE-STATUS
      * - recsRead400                    COBOL Name: 400-RECS-READ
      * - pmmWorkFileMsgDetail600        COBOL Name: 600-PMM-WORK-FILE-MSG-DETAIL
      * - sys001Status600                COBOL Name: 600-SYS001-STATUS
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - sys001RdAbendCode300           COBOL Name: 300-SYS001-RD-ABEND-CODE
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para8200300                    COBOL Name: 300-PARA-8200
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - sys001ErrMsgTxt600             COBOL Name: 600-SYS001-ERR-MSG-TXT
      *
      * @throws CFException
      */
      @Override
      public ReadInputSys001OutCtx readInputSys001(ReadInputSys001InCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------
// *This paragraph reads the pmm work file into am182010
// *and checks the file status.
// *----------------------------------------------------------------
Ip343690Ctx programCtx = methodIn.getIp343690Ctx();
ReadInputSys001OutCtx methodOut = methodIn.getReadInputSys001OutCtx();
//  READ SYS001-INPUT-PMA-UNLOAD INTO 800-TIPAPMA-LAYOUT END-READ
          	sys001InputPmaUnload.read();
          methodOut.setSys001FileStatus200(sys001InputPmaUnload.getStatusString() );
          if (!sys001InputPmaUnload.hasEnded()) {
             methodOut.getSys001InputPmaUnldRec().setString(sys001InputPmaUnload.getRecord());
             methodIn.getTipapmaLayout800().setString(methodOut.getSys001InputPmaUnldRec().toCharArray());
          }
//  IF 88-200-SYS001-STATUS-GOOD
          if ( methodOut.isSys001StatusGood88200()  ) { 
//  ADD 1 TO 400-RECS-READ
              methodOut.setRecsRead400(methodOut.getRecsRead400()+(long)1);
          }
//  ELSE
          else { 
//  IF 88-200-SYS001-STATUS-EOF
//  ELSE
              if (!(methodOut.isSys001StatusEof88200()) ) { 
//  SET 88-600-SYS001-READ-ERR-TXT TO TRUE
                  methodOut.setSys001ReadErrTxt88600True(); 
                  
//  MOVE 200-SYS001-FILE-STATUS TO 600-SYS001-STATUS
                  methodOut.setSys001Status600(methodOut.getSys001FileStatus200());
//  MOVE 300-SYS001-RD-ABEND-CODE TO 900-ABEND-CODE
                  methodOut.setAbendCode900(methodOut.getSys001RdAbendCode300());
//  MOVE 300-PARA-8200 TO 900-ABEND-PARA
                  methodOut.setAbendPara900(methodOut.getPara8200300());
                  // MOVE 600-SYS001-ERR-MSG-TXT TO 900-ABEND-TEXT
                  methodOut.setAbendText900(methodOut.getSys001ErrMsgTxt600().toCharArray());
//  PERFORM 8210-CLOSE-INPUT-SYS001
                  closeInputSys001(programCtx.getCloseInputSys001InCtx());/*8210-CLOSE-INPUT-SYS001*/
//  PERFORM 9500-ABEND-THE-PROGRAM
                  abendTheProgram(programCtx.getAbendTheProgramInCtx());/*9500-ABEND-THE-PROGRAM*/
              }
          }
      
      return methodOut;
      }
      /**
      * closeInputSys001 
      *   This method is derived from 
  *   COBOL Paragraph - 8210-CLOSE-INPUT-SYS001 COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sys001FileStatus200            COBOL Name: 200-SYS001-FILE-STATUS
      * - para8210300                    COBOL Name: 300-PARA-8210
      * - sys001ClAbendCode300           COBOL Name: 300-SYS001-CL-ABEND-CODE
      * - sys001ErrMsgTxt600             COBOL Name: 600-SYS001-ERR-MSG-TXT
      *
      * Output :  

      * - pmmWorkFileMsgDetail600        COBOL Name: 600-PMM-WORK-FILE-MSG-DETAIL
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para8210300                    COBOL Name: 300-PARA-8210
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - sys001ClAbendCode300           COBOL Name: 300-SYS001-CL-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - sys001ErrMsgTxt600             COBOL Name: 600-SYS001-ERR-MSG-TXT
      *
      * @throws CFException
      */
      @Override
      public CloseInputSys001OutCtx closeInputSys001(CloseInputSys001InCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph closes sys001 input file.                        *
// *----------------------------------------------------------------*
Ip343690Ctx programCtx = methodIn.getIp343690Ctx();
CloseInputSys001OutCtx methodOut = methodIn.getCloseInputSys001OutCtx();
//  CLOSE SYS001-INPUT-PMA-UNLOAD
          sys001InputPmaUnload.close(); 
          methodOut.setSys001FileStatus200(sys001InputPmaUnload.getStatusString() );
//  IF 88-200-SYS001-STATUS-GOOD
//  ELSE
          if (!(methodIn.isSys001StatusGood88200()) ) { 
//  SET 88-600-SYS001-CLOSE-ERR-TXT TO TRUE
              methodOut.setSys001CloseErrTxt88600True(); 
              
//  MOVE 300-PARA-8210 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara8210300());
//  MOVE 300-SYS001-CL-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getSys001ClAbendCode300());
              // MOVE 600-SYS001-ERR-MSG-TXT TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getSys001ErrMsgTxt600().toCharArray());
//  PERFORM 9500-ABEND-THE-PROGRAM
              abendTheProgram(programCtx.getAbendTheProgramInCtx());/*9500-ABEND-THE-PROGRAM*/
          }
      
      return methodOut;
      }
      /**
      * updatePmaCursor 
      *   This method is derived from 
  *   COBOL Paragraph - 8300-UPDATE-PMA-CURSOR COBOL Cyclomatic complexity - 11
      * Input  :  

      * - noOfRows800                    COBOL Name: 800-NO-OF-ROWS
      * - commitRows800                  COBOL Name: 800-COMMIT-ROWS
      * - sqlerrd                        COBOL Name: SQLERRD
      * - sql100300                      COBOL Name: 300-SQL-100
      * - sql904300                      COBOL Name: 300-SQL-904
      * - sql911300                      COBOL Name: 300-SQL-911
      * - noTimes911Try800               COBOL Name: 800-NO-TIMES-911-TRY
      * - valueRetry300                  COBOL Name: 300-VALUE-RETRY
      * - tipapmaCrteUpdtTs              COBOL Name: TIPAPMA-CRTE-UPDT-TS
      * - tipapmaPrimAcctNum             COBOL Name: TIPAPMA-PRIM-ACCT-NUM
      * - dbUpdateError8023010           COBOL Name: 802-3010-DB-UPDATE-ERROR
      * - msg3010600                     COBOL Name: 600-MSG-3010
      * - db2DeadlockRel600              COBOL Name: 600-DB2-DEADLOCK-REL
      *
      * Output :  

      * - apiStatus100                   COBOL Name: 100-API-STATUS
      * - noOfRows800                    COBOL Name: 800-NO-OF-ROWS
      * - commitRows800                  COBOL Name: 800-COMMIT-ROWS
      * - isItDeadLock100                COBOL Name: 100-IS-IT-DEAD-LOCK
      * - abendPara300                   COBOL Name: 300-ABEND-PARA
      * - isItSqlError100                COBOL Name: 100-IS-IT-SQL-ERROR
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - abendCode800                   COBOL Name: 800-ABEND-CODE
      * - dbUpdateError8023010           COBOL Name: 802-3010-DB-UPDATE-ERROR
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - msg3010600                     COBOL Name: 600-MSG-3010
      * - noTimes911Try800               COBOL Name: 800-NO-TIMES-911-TRY
      *
      * @throws CFException
      */
      @Override
      public UpdatePmaCursorOutCtx updatePmaCursor(UpdatePmaCursorInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph update the current record                       *
// *----------------------------------------------------------------*
Ip343690Ctx programCtx = methodIn.getIp343690Ctx();
UpdatePmaCursorOutCtx methodOut = methodIn.getUpdatePmaCursorOutCtx();
//  UPDATE TIPAPMA SET PRIM_ACCT_SEQ_NUM = ? WHERE CURRENT OF PMA_CURSOR
          ip343690Repository.updateTipapma1(programCtx.getPmaCursorResultSet(),methodIn.getTipapma(),methodOut.getItipapma(),programCtx.getSqlca());
//  EVALUATE SQLCODE
          if  (	( methodOut.getSqlcode() == 0 )) { 
//  SET 88-100-ROWS-FOUND TO TRUE
              methodOut.setRowsFound88100True(); 
              
//  ADD SQLERRD (3) TO 800-NO-OF-ROWS 800-COMMIT-ROWS
              methodOut.setNoOfRows800(methodOut.getNoOfRows800()+(int) methodIn.getSqlerrd(2));
              methodOut.setCommitRows800(methodOut.getCommitRows800()+(int) methodIn.getSqlerrd(2));
//  PERFORM 8400-DO-COMMIT
              doCommit(programCtx.getDoCommitInCtx());/*8400-DO-COMMIT*/
//  SET 88-IT-IS-DEAD-LOCK-N TO TRUE
              methodOut.setItIsDeadLockN88True(); 
              
          }
          else if  (	( methodOut.getSqlcode() == methodIn.getSql100300() )) { 
//  SET 88-100-ROWS-NOT-FND TO TRUE
              methodOut.setRowsNotFnd88100True(); 
              
//  SET 88-IT-IS-DEAD-LOCK-N TO TRUE
              methodOut.setItIsDeadLockN88True(); 
              
          }
          else if  ((	( methodOut.getSqlcode() == methodIn.getSql904300() )) || (	( methodOut.getSqlcode() == methodIn.getSql911300() ))) { 
//  IF 800-NO-TIMES-911-TRY LESS THAN OR EQUAL 300-VALUE-RETRY
              if (	( methodOut.getNoTimes911Try800() <= methodIn.getValueRetry300() )) { 
//  PERFORM 9100-DEAD-LOCK
                  deadLock(programCtx.getDeadLockInCtx());/*9100-DEAD-LOCK*/
              }
//  ELSE
              else { 
//  SET 88-IT-IS-DEAD-LOCK-N TO TRUE
                  methodOut.setItIsDeadLockN88True(); 
                  
//  PERFORM 9100-DEAD-LOCK
                  deadLock(programCtx.getDeadLockInCtx());/*9100-DEAD-LOCK*/
              }
          }
          else   { 
//  DISPLAY 'CRTE_UPDT_TS  : ' TIPAPMA-CRTE-UPDT-TS
              logger.info("CRTE_UPDT_TS  : {}", new String(methodIn.getTipapmaCrteUpdtTs())); 
//  DISPLAY 'PRIM_ACCT_NUM : ' TIPAPMA-PRIM-ACCT-NUM
              logger.info("PRIM_ACCT_NUM : {}", new String(methodIn.getTipapmaPrimAcctNum())); 
//  SET 88-100-NEGATIVE-CODE TO TRUE
              methodOut.setNegativeCode88100True(); 
              
//  SET 88-300-DB2-UPDATE-PARA TO TRUE
              methodOut.setDb2UpdatePara88300True(); 
              
//  SET 88-100-IT-IS-SQL-ERROR TO TRUE
              methodOut.setItIsSqlError88100True(); 
              
//  MOVE 300-ABEND-PARA TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getAbendPara300());
              // MOVE 802-3010-DB-UPDATE-ERROR TO 800-ABEND-CODE
              methodOut.getAbendCode800().setString(methodOut.getDbUpdateError8023010().getCharArray());
//  MOVE 600-MSG-3010 TO 900-ABEND-TEXT
              methodOut.setAbendText900(pad(66,methodOut.getMsg3010600(),SPACE_CHAR,RIGHT_PAD));
//  PERFORM 9500-ABEND-THE-PROGRAM
              abendTheProgram(programCtx.getAbendTheProgramInCtx());/*9500-ABEND-THE-PROGRAM*/
          }
//  IF 800-NO-TIMES-911-TRY GREATER THAN ZEROES AND 88-IT-IS-DEAD-LOCK-N
          if (	( methodOut.getNoTimes911Try800() > 0 ) &&  methodOut.isItIsDeadLockN88()  ) { 
//  DISPLAY 600-DB2-DEADLOCK-REL
              logger.info(new String(methodIn.getDb2DeadlockRel600())); 
//  MOVE ZEROES TO 800-NO-TIMES-911-TRY
              methodOut.setNoTimes911Try800(0);
          }
      
      return methodOut;
      }
      /**
      * doCommit 
      *   This method is derived from 
  *   COBOL Paragraph - 8400-DO-COMMIT COBOL Cyclomatic complexity - 3
      * Input  :  

      * - commitRows800                  COBOL Name: 800-COMMIT-ROWS
      * - commitFreq1000                 COBOL Name: 1000-COMMIT-FREQ
      * - isEndOfProcess100              COBOL Name: 100-IS-END-OF-PROCESS
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      * - commitRows800                  COBOL Name: 800-COMMIT-ROWS
      *
      * @throws CFException
      */
      @Override
      public DoCommitOutCtx doCommit(DoCommitInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// * This paragraph issues commit.                                  *
// *-----------------------------------------------------------------
Ip343690Ctx programCtx = methodIn.getIp343690Ctx();
DoCommitOutCtx methodOut = methodIn.getDoCommitOutCtx();
//  IF 800-COMMIT-ROWS >= 1000-COMMIT-FREQ OR 88-100-END-OF-PROCESS
          if (	( methodOut.getCommitRows800() >= methodIn.getCommitFreq1000() ) ||  methodIn.isEndOfProcess88100()  ) { 
//  CALL 800-PTR-IP599810
              // CALL 800-PTR-IP599810
              	programCtx.setRc( ip599810.process(programCtx.getGlobalCtx().getContext("IP599810")));
//  MOVE ZEROES TO 800-COMMIT-ROWS
              methodOut.setCommitRows800(0);
          }
      
      return methodOut;
      }
      /**
      * deadLock 
      *   This method is derived from 
  *   COBOL Paragraph - 9100-DEAD-LOCK COBOL Cyclomatic complexity - 4
      * Input  :  

      * - db2Deadlock600                 COBOL Name: 600-DB2-DEADLOCK
      * - sqlcode                        COBOL Name: SQLCODE
      * - sql904300                      COBOL Name: 300-SQL-904
      * - sql911300                      COBOL Name: 300-SQL-911
      * - isItDeadLock100                COBOL Name: 100-IS-IT-DEAD-LOCK
      * - noTimes911Try800               COBOL Name: 800-NO-TIMES-911-TRY
      * - value1300                      COBOL Name: 300-VALUE-1
      * - dbSelectError8023006           COBOL Name: 802-3006-DB-SELECT-ERROR
      *
      * Output :  

      * - noTimes911Try800               COBOL Name: 800-NO-TIMES-911-TRY
      * - apiStatus100                   COBOL Name: 100-API-STATUS
      * - isItSqlError100                COBOL Name: 100-IS-IT-SQL-ERROR
      * - abendPara300                   COBOL Name: 300-ABEND-PARA
      * - abendMessage600                COBOL Name: 600-ABEND-MESSAGE
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - abendCode800                   COBOL Name: 800-ABEND-CODE
      * - dbSelectError8023006           COBOL Name: 802-3006-DB-SELECT-ERROR
      *
      * @throws CFException
      */
      @Override
      public DeadLockOutCtx deadLock(DeadLockInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph tries to initiate contact to the pac table      *
// * multiple times based upon a parameter.after each try ,mcwait is*
// * called to issue a short sleep.abend the program if still -911  *
// * or -904                                                        *
// *----------------------------------------------------------------*
Ip343690Ctx programCtx = methodIn.getIp343690Ctx();
DeadLockOutCtx methodOut = methodIn.getDeadLockOutCtx();
//  DISPLAY 600-DB2-DEADLOCK
          logger.info(new String(methodIn.getDb2Deadlock600())); 
//  IF SQLCODE = 300-SQL-904 OR SQLCODE = 300-SQL-911
          if (	( methodOut.getSqlcode() == methodIn.getSql904300() ) || 	( methodOut.getSqlcode() == methodIn.getSql911300() )) { 
//  IF 88-IT-IS-DEAD-LOCK-Y
              if ( methodIn.isItIsDeadLockY88()  ) { 
//  PERFORM 9200-CALL-MCWAIT-FOR-SLEEP
                  callMcwaitForSleep(programCtx.getCallMcwaitForSleepInCtx());/*9200-CALL-MCWAIT-FOR-SLEEP*/
//  ADD 300-VALUE-1 TO 800-NO-TIMES-911-TRY
                  methodOut.setNoTimes911Try800(methodOut.getNoTimes911Try800()+methodIn.getValue1300());
              }
//  ELSE
              else { 
//  SET 88-100-NEGATIVE-CODE TO TRUE
                  methodOut.setNegativeCode88100True(); 
                  
//  SET 88-100-IT-IS-SQL-ERROR TO TRUE
                  methodOut.setItIsSqlError88100True(); 
                  
//  SET 88-300-DB2-DEAD-LOCK-PARA TO TRUE
                  methodOut.setDb2DeadLockPara88300True(); 
                  
//  SET 88-600-ABEND-DB2-911-ERROR TO TRUE
                  methodOut.setAbendDb2911Error88600True(); 
                  
//  MOVE 300-ABEND-PARA TO 900-ABEND-PARA
                  methodOut.setAbendPara900(methodOut.getAbendPara300());
//  MOVE 600-ABEND-MESSAGE TO 900-ABEND-TEXT
                  methodOut.setAbendText900(pad(66,methodOut.getAbendMessage600(),SPACE_CHAR,RIGHT_PAD));
                  // MOVE 802-3006-DB-SELECT-ERROR TO 800-ABEND-CODE
                  methodOut.getAbendCode800().setString(methodOut.getDbSelectError8023006().getCharArray());
//  PERFORM 9500-ABEND-THE-PROGRAM
                  abendTheProgram(programCtx.getAbendTheProgramInCtx());/*9500-ABEND-THE-PROGRAM*/
              }
          }
      
      return methodOut;
      }
      /**
      * callMcwaitForSleep 
      *   This method is derived from 
  *   COBOL Paragraph - 9200-CALL-MCWAIT-FOR-SLEEP COBOL Cyclomatic complexity - 1
      * Input  :  

      * - sleepTime800                   COBOL Name: 800-SLEEP-TIME
      * - sleepMessage600                COBOL Name: 600-SLEEP-MESSAGE
      *
      * Output :  

      * - currTime800                    COBOL Name: 800-CURR-TIME
      * - sleepTime600                   COBOL Name: 600-SLEEP-TIME
      * - sleepTime800                   COBOL Name: 800-SLEEP-TIME
      * - currTime600                    COBOL Name: 600-CURR-TIME
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public CallMcwaitForSleepOutCtx callMcwaitForSleep(CallMcwaitForSleepInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph calls a routine to sleep for definite interval   *
// *so that the select can be tried after the interval.             *
// *----------------------------------------------------------------*
Ip343690Ctx programCtx = methodIn.getIp343690Ctx();
CallMcwaitForSleepOutCtx methodOut = methodIn.getCallMcwaitForSleepOutCtx();
//  ACCEPT 800-CURR-TIME FROM TIME
          methodOut.setCurrTime800(getCurrentTimeString()); 
          // MOVE 800-SLEEP-TIME TO 600-SLEEP-TIME
          methodOut.setSleepTime600(methodOut.getSleepTime800());
//  MOVE 800-CURR-TIME TO 600-CURR-TIME
          methodOut.setCurrTime600(methodOut.getCurrTime800());
//  DISPLAY 600-SLEEP-MESSAGE
          logger.info(methodIn.getSleepMessage600().toString()); 
//  CALL 800-PTR-MCWAIT USING 800-SLEEP-TIME
          // CALL 800-PTR-MCWAIT USING 800-SLEEP-TIME
               programCtx.setRc( mcwait.call(programCtx.getGlobalCtx().getContext("MCWAIT"),methodOut.getSleepTimeGroup800()));
      
      return methodOut;
      }
      /**
      * abendTheProgram 
      *   This method is derived from 
  *   COBOL Paragraph - 9500-ABEND-THE-PROGRAM COBOL Cyclomatic complexity - 5
      * Input  :  

      * - astriskLine900                 COBOL Name: 900-ASTRISK-LINE
      * - abendAbend900                  COBOL Name: 900-ABEND-ABEND
      * - abendAbendPgm900               COBOL Name: 900-ABEND-ABEND-PGM
      * - isItSqlError100                COBOL Name: 100-IS-IT-SQL-ERROR
      * - abendParaName900               COBOL Name: 900-ABEND-PARA-NAME
      * - abend800                       COBOL Name: 800-ABEND
      * - abendMessage900                COBOL Name: 900-ABEND-MESSAGE
      * - sqlcode                        COBOL Name: SQLCODE
      * - sqlerrmc                       COBOL Name: SQLERRMC
      * - sqlAbendMsg900                 COBOL Name: 900-SQL-ABEND-MSG
      * - isItConnectedToDb2100          COBOL Name: 100-IS-IT-CONNECTED-TO-DB2
      *
      * Output :  

      * - abendCd800                     COBOL Name: 800-ABEND-CD
      * - abend800                       COBOL Name: 800-ABEND
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - ip60001EventErrorCode          COBOL Name: IP60001-EVENT-ERROR-CODE
      * - ip60001EventErrorMsg           COBOL Name: IP60001-EVENT-ERROR-MSG
      * - abendMessage900                COBOL Name: 900-ABEND-MESSAGE
      * - abendSqlCode900                COBOL Name: 900-ABEND-SQL-CODE
      * - sqlcode                        COBOL Name: SQLCODE
      * - abendSqlerrmc900               COBOL Name: 900-ABEND-SQLERRMC
      * - sqlerrmc                       COBOL Name: SQLERRMC
      * - abendCode300                   COBOL Name: 300-ABEND-CODE
      * - abendMessage600                COBOL Name: 600-ABEND-MESSAGE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public AbendTheProgramOutCtx abendTheProgram(AbendTheProgramInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph is to perform whenever abend occurs.            *
// *----------------------------------------------------------------*
Ip343690Ctx programCtx = methodIn.getIp343690Ctx();
AbendTheProgramOutCtx methodOut = methodIn.getAbendTheProgramOutCtx();
//  DISPLAY 900-ASTRISK-LINE
          logger.info(new String(methodIn.getAstriskLine900())); 
//  DISPLAY 900-ABEND-ABEND
          logger.info(new String(methodIn.getAbendAbend900())); 
//  DISPLAY 900-ABEND-ABEND-PGM
          logger.info(new String(methodIn.getAbendAbendPgm900())); 
//  DISPLAY 900-ASTRISK-LINE
          logger.info(new String(methodIn.getAstriskLine900())); 
//  IF 88-100-IT-IS-SQL-ERROR
          if ( methodIn.isItIsSqlError88100()  ) { 
//  DISPLAY 900-ABEND-PARA-NAME
              logger.info(methodIn.getAbendParaName900().toString()); 
//  MOVE 800-ABEND TO 800-ABEND-CD
              methodOut.setAbendCd800(methodOut.getAbend800());
//  MOVE 800-ABEND-CD TO 900-ABEND-CODE IP60001-EVENT-ERROR-CODE
              methodOut.setAbendCode900(String.valueOf(methodOut.getAbendCd800String()).toCharArray());
              methodOut.setIp60001EventErrorCode(String.valueOf(methodOut.getAbendCd800String()).toCharArray());
              // MOVE 900-ABEND-MESSAGE TO IP60001-EVENT-ERROR-MSG
              methodOut.setIp60001EventErrorMsg(methodOut.getAbendMessage900().toCharArray());
//  DISPLAY 900-ABEND-MESSAGE
              logger.info(methodOut.getAbendMessage900().toString()); 
              // MOVE SQLCODE OF SQLCA TO 900-ABEND-SQL-CODE
              //  FORMAT431311340 = "-999999999"
              methodOut.setAbendSqlCode900(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT431311340,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  MOVE SQLERRMC TO 900-ABEND-SQLERRMC
              methodOut.setAbendSqlerrmc900(methodOut.getSqlerrmc());
//  DISPLAY 900-SQL-ABEND-MSG
              logger.info(methodIn.getSqlAbendMsg900().toString()); 
//  PERFORM 9510-EXECUTE-DB2ERR-ROTUINE
              executeDb2errRotuine(programCtx.getExecuteDb2errRotuineInCtx());/*9510-EXECUTE-DB2ERR-ROTUINE*/
          }
//  ELSE
          else { 
//  DISPLAY 900-ABEND-PARA-NAME
              logger.info(methodIn.getAbendParaName900().toString()); 
//  MOVE 900-ABEND-CODE TO IP60001-EVENT-ERROR-CODE
              methodOut.setIp60001EventErrorCode(methodOut.getAbendCode900());
              // MOVE 900-ABEND-MESSAGE TO IP60001-EVENT-ERROR-MSG
              methodOut.setIp60001EventErrorMsg(methodOut.getAbendMessage900().toCharArray());
//  DISPLAY 900-ABEND-MESSAGE
              logger.info(methodOut.getAbendMessage900().toString()); 
          }
//  IF 88-100-IT-IS-CONNECTED-TO-DB2
          if ( methodIn.isItIsConnectedToDb288100()  ) { 
//  ROLLBACK
              try {
              	// COMMIT
              	// reset SQLCODE
              	methodOut.setSqlcode(0);
                 // execute jdbc commit
                 db2Base.rollback();
              }
               catch (SQLException e) {
                         methodOut.setSqlcode(Db2Base.fillSQLCode(e.getMessage()));
                     }
               catch(Exception e) {
                handleErrorCode(e);
              }
//  IF SQLCODE OF SQLCA EQUAL ZERO
//  ELSE
              if (	( methodOut.getSqlcode() != 0 )) { 
//  DISPLAY SPACE
                  logger.info(" "); 
//  DISPLAY 900-ABEND-PARA-NAME
                  logger.info(methodIn.getAbendParaName900().toString()); 
//  MOVE SQLERRMC TO 900-ABEND-SQLERRMC
                  methodOut.setAbendSqlerrmc900(methodOut.getSqlerrmc());
                  // MOVE SQLCODE OF SQLCA TO 900-ABEND-SQL-CODE
                  //  FORMAT431311340 = "-999999999"
                  methodOut.setAbendSqlCode900(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT431311340,String.valueOf(methodOut.getSqlcode()).toCharArray()));
//  DISPLAY 900-SQL-ABEND-MSG
                  logger.info(methodIn.getSqlAbendMsg900().toString()); 
//  SET 88-300-DB2-UNSUCESS-ROLLBACK TO TRUE
                  methodOut.setDb2UnsucessRollback88300True(); 
                  
//  SET 88-600-ABEND-DB2-RBACK-ERROR TO TRUE
                  methodOut.setAbendDb2RbackError88600True(); 
                  
//  MOVE 300-ABEND-CODE TO 900-ABEND-CODE
                  methodOut.setAbendCode900(methodOut.getAbendCode300());
//  MOVE 600-ABEND-MESSAGE TO 900-ABEND-TEXT
                  methodOut.setAbendText900(pad(66,methodOut.getAbendMessage600(),SPACE_CHAR,RIGHT_PAD));
//  DISPLAY 900-ABEND-MESSAGE
                  logger.info(methodOut.getAbendMessage900().toString()); 
//  PERFORM 9510-EXECUTE-DB2ERR-ROTUINE
                  executeDb2errRotuine(programCtx.getExecuteDb2errRotuineInCtx());/*9510-EXECUTE-DB2ERR-ROTUINE*/
              }
          }
//  CALL 800-PTR-IP610010
          // CALL 800-PTR-IP610010
          	programCtx.setRc( ip610010.process(programCtx.getGlobalCtx().getContext("IP610010")));
      
      return methodOut;
      }
      /**
      * executeDb2errRotuine 
      *   This method is derived from 
  *   COBOL Paragraph - 9510-EXECUTE-DB2ERR-ROTUINE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - blankSpace600                  COBOL Name: 600-BLANK-SPACE
      * - asteriskLine600                COBOL Name: 600-ASTERISK-LINE
      * - cond0000300                    COBOL Name: 300-COND-0000
      * - db2ErrModuleMsg600             COBOL Name: 600-DB2-ERR-MODULE-MSG
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public ExecuteDb2errRotuineOutCtx executeDb2errRotuine(ExecuteDb2errRotuineInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * Db2 error routine.                                             *
// *----------------------------------------------------------------*
Ip343690Ctx programCtx = methodIn.getIp343690Ctx();
ExecuteDb2errRotuineOutCtx methodOut = methodIn.getExecuteDb2errRotuineOutCtx();
//  DISPLAY 600-BLANK-SPACE
          logger.info(new String(methodIn.getBlankSpace600())); 
//  DISPLAY 600-ASTERISK-LINE
          logger.info(new String(methodIn.getAsteriskLine600())); 
//  DISPLAY 600-BLANK-SPACE
          logger.info(new String(methodIn.getBlankSpace600())); 
//  CALL DB85102C-DB2-BATCH-ERROR-RTN USING SQLCA 300-PGM-IP343690
          // CALL DB85102C-DB2-BATCH-ERROR-RTN USING SQLCA 300-PGM-IP343690
               programCtx.setRc( db200020.call(programCtx.getGlobalCtx().getContext("DB200020"),programCtx.getSqlca(),methodOut.getPgmIp343690Group300()));
//  IF RETURN-CODE EQUAL 300-COND-0000
//  ELSE
          if (	( programCtx.getRc() != methodIn.getCond0000300() ) ) { 
//  DISPLAY 600-DB2-ERR-MODULE-MSG
              logger.info(new String(methodIn.getDb2ErrModuleMsg600())); 
          }
      
      return methodOut;
      }
      /**
      * updateEventLog 
      *   This method is derived from 
  *   COBOL Paragraph - 9950-UPDATE-EVENT-LOG COBOL Cyclomatic complexity - 3
      * Input  :  

      * - ip60001EventLogControl         COBOL Name: IP60001-EVENT-LOG-CONTROL
      * - ip60001Subscript               COBOL Name: IP60001-SUBSCRIPT
      * - ip60001HoldPgmName             COBOL Name: IP60001-HOLD-PGM-NAME
      *
      * Output :  

      * - ip60001Subscript               COBOL Name: IP60001-SUBSCRIPT
      * - ip60001PgmName                 COBOL Name: IP60001-PGM-NAME
      * - ip60001HoldPgmName             COBOL Name: IP60001-HOLD-PGM-NAME
      *
      * @throws CFException
      */
      @Override
      public UpdateEventLogOutCtx updateEventLog(UpdateEventLogInCtx methodIn) throws Exception {
      
// * Element ip601011 as of 10/31/02 04:53:52                    [vc]
// ******************************************************************
// *   description: this is the procedure division copybook to      *
// *                fill the event log table.  move the current     *
// *                program name to ip60001-hold-pgm-name and       *
// *                the current paragraph name to                   *
// *                ip60001-hold-para-name.  then perform paragraph *
// *                9950-update-event-log.                          *
// ******************************************************************
// *   modifications history                                        *
// *   date             project     modifications                   *
// *   07/30/99         2526        created                         *
// *   mm/dd/yy         xxxxxxx     description                     *
// ******************************************************************
// *  layout description:  event log update                         *
// ******************************************************************
// *  start copybook member ip601011 - event log update             *
// ******************************************************************
Ip343690Ctx programCtx = methodIn.getIp343690Ctx();
UpdateEventLogOutCtx methodOut = methodIn.getUpdateEventLogOutCtx();
//  IF 88-IP60001-LOG-EVENT
          if ( methodIn.isIp60001LogEvent88()  ) { 
//  IF IP60001-SUBSCRIPT = 500
              if (	( methodOut.getIp60001Subscript() == 500 ) ) { 
//  MOVE 1 TO IP60001-SUBSCRIPT
//  LITERAL_1 = 1
                  methodOut.setIp60001Subscript((long)1);
              }
//  ELSE
              else { 
//  ADD 1 TO IP60001-SUBSCRIPT
                  methodOut.setIp60001Subscript(methodOut.getIp60001Subscript()+(long)1);
              }
//  MOVE IP60001-HOLD-PGM-NAME TO IP60001-PGM-NAME ( IP60001-SUBSCRIPT )
              methodOut.setIp60001PgmName((int) methodOut.getIp60001Subscript() - 1,methodOut.getIp60001HoldPgmName());
          }
      
      return methodOut;
      }
  
  
  
      public int call(ProgramContext ctx, Object[] params) throws Exception {
      Ip343690Ctx programCtx = (Ip343690Ctx) ctx;
      
      int len = params.length;
         if (len > 0 && params[0] != null )
            programCtx.getParms1000().set((Field)params[0]);
         // invoke the process and return rc
         return process(programCtx);
         
      }
      
      public int call(ProgramContext ctx, Field... parameters) throws Exception {
      Ip343690Ctx programCtx = (Ip343690Ctx) ctx;
         for (int index = 0; index < parameters.length;index++) {
             switch(index) {
              case 0:
                      if(parameters[index] != null ) {
              		if (parameters[index] instanceof Parms1000) {
                       	programCtx.setParms1000((Parms1000) parameters[index]);
                  	} else {
                       	programCtx.getParms1000().set(parameters[index]);
                  	}
                  }
                
                  break;
            }
         }
      	return process(programCtx);
      }
      
      
      public void setFromMcwait(Ip343690Ctx programCtx, Object[] params) {
      int len = params.length;
         if (len > 0)
         if(params[0] instanceof Field) 
   programCtx.getDb2Workarea800().getSleepTimeGroup800().setString(((Field)params[0] ).toCharArray());
 else    programCtx.getDb2Workarea800().getSleepTimeGroup800().setString((char[])params[0] );
      }
      public void setFromDb200020(Ip343690Ctx programCtx, Object[] params) {
      int len = params.length;
         if (len > 0)
         if(params[0] instanceof Field) 
   programCtx.getSqlca().setString(((Field)params[0] ).toCharArray());
 else    programCtx.getSqlca().setString((char[])params[0] );
         if (len > 1)
         if(params[1] instanceof Field) 
   programCtx.getConstants300().getPgmIp343690Group300().setString(((Field)params[1] ).toCharArray());
 else    programCtx.getConstants300().getPgmIp343690Group300().setString((char[])params[1] );
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
