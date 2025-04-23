  package com.cloudframe.app.process;
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
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import org.springframework.web.bind.annotation.RequestParam;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.ip343690.dto.PgmIp343690Group300;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.process.Ip996010;
  import com.cloudframe.app.process.Ip081110;
  import com.cloudframe.app.global.sharedvar.Ip00404ArRangeGrp;
  import com.cloudframe.app.process.Ip280010;
  import com.cloudframe.app.repository.Ip343690Repository;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.process.Ip599810;
  import java.util.Calendar;
  import java.util.TimeZone;
  import java.util.Date;
  import org.springframework.beans.factory.annotation.Value;
  import com.cloudframe.app.ip343690.dto.SleepTimeGroup800;
  import com.cloudframe.app.process.Mcwait;
  import com.cloudframe.app.ip343690.dto.AbendCode800;
  import com.cloudframe.app.process.Ip610010;
  import com.cloudframe.app.process.Db200020;
  import com.cloudframe.app.ip343690.dto.*;
  import com.cloudframe.app.ip343690.dto.Itipapma;
  import com.cloudframe.app.ip343690.dto.Parms1000;
  import com.cloudframe.app.ip343690.dto.DbSelectError8023006;
  import com.cloudframe.app.ip343690.dto.Sys001ErrMsgTxt600;
  import com.cloudframe.app.ip343690.dto.TipapmaLayout800;
  import com.cloudframe.app.ip343690.file.records.Db2cloneRec;
  import com.cloudframe.app.ip343690.dto.DbConnectError8023005;
  import com.cloudframe.app.ip343690.file.records.Sys001InputPmaUnldRec;
  import com.cloudframe.app.ip343690.dto.SleepMessage600;
  import com.cloudframe.app.ip343690.dto.DbUpdateError8023010;
  import com.cloudframe.app.ip343690.dto.Constants300;
  import com.cloudframe.app.global.sharedvar.Db85102dWorkFields;
  import com.cloudframe.app.ip343690.dto.Db85102dDb2cloneRec;
  import com.cloudframe.app.ip343690.dto.Tipapma;
  import com.cloudframe.app.ip343690.dto.AbendMessage900;
  import com.cloudframe.app.ip343690.dto.SqlAbendMsg900;
  import com.cloudframe.app.ip343690.dto.Db2Workarea800;
  import com.cloudframe.app.ip343690.dto.Msg3001a600;
  import com.cloudframe.app.ip343690.dto.AbendParaName900;
  import com.cloudframe.app.ip343690.dto.Sqlca;
  import com.cloudframe.app.global.sharedvar.Ip50005ClearingDtTm;
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
  
  public class Ip343690 extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Ip343690.class);
  
  private Itipapma itipapma = new Itipapma() ;
  private Parms1000 parms1000 = new Parms1000() ;
  private DbSelectError8023006 dbSelectError8023006 = new DbSelectError8023006() ;
  private Sys001ErrMsgTxt600 sys001ErrMsgTxt600 = new Sys001ErrMsgTxt600() ;
  private TipapmaLayout800 tipapmaLayout800 = new TipapmaLayout800() ;
  private Db2cloneRec db2cloneRec = new Db2cloneRec() ;
  private DbConnectError8023005 dbConnectError8023005 = new DbConnectError8023005() ;
  private Sys001InputPmaUnldRec sys001InputPmaUnldRec = new Sys001InputPmaUnldRec() ;
  private SleepMessage600 sleepMessage600 = new SleepMessage600() ;
  private DbUpdateError8023010 dbUpdateError8023010 = new DbUpdateError8023010() ;
  private Constants300 constants300 = new Constants300() ;
  private Db85102dDb2cloneRec db85102dDb2cloneRec = new Db85102dDb2cloneRec() ;
  private Tipapma tipapma = new Tipapma() ;
  private AbendMessage900 abendMessage900 = new AbendMessage900() ;
  private SqlAbendMsg900 sqlAbendMsg900 = new SqlAbendMsg900() ;
  private Db2Workarea800 db2Workarea800 = new Db2Workarea800() ;
  private Msg3001a600 msg3001a600 = new Msg3001a600() ;
  private AbendParaName900 abendParaName900 = new AbendParaName900() ;
  private Sqlca sqlca = new Sqlca() ;
  private Work work = new Work() ;
  
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
  @Autowired 
  @Qualifier("global_db85102dWorkFields")
  Db85102dWorkFields db85102dWorkFields;
  @Autowired 
  @Qualifier("global_apiLayout")
  ApiLayout apiLayout;
  @Autowired 
  @Qualifier("global_ip30881Db2McwaitInputValue")
  Ip30881Db2McwaitInputValue ip30881Db2McwaitInputValue;
  
  
  
  int ip00404AcctRngIndex;
  
  
  
      public int setParameter(String parms1000) throws Exception {
      		if(parms1000 != null)
      		    this.parms1000.setString(com.cloudframe.app.data.Field.getParm(parms1000),new String(CONSTANTS.EBCDIC_ENCODING));
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
      		if(db2cloneFile.hasOpened() && !db2cloneFile.isReadOnly()) { 
      			db2cloneFile.flush(); 
      		}
      		if(sys001InputPmaUnload.hasOpened() && !sys001InputPmaUnload.isReadOnly()) { 
      			sys001InputPmaUnload.flush(); 
      		}
		handleDbAtEnd(db2Base); 
      

      }
      
       return getRc(); // Exit with return code
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
      private void mainline() throws Exception {
//  PERFORM 1000-BEGIN-PROCESS
          beginProcess();/*1000-BEGIN-PROCESS*/
          if (this.isProgramEnded()) {
              return ;
          }
//  PERFORM 2000-CONNECT-TO-DB2
          connectToDb2();/*2000-CONNECT-TO-DB2*/
          if (this.isProgramEnded()) {
              return ;
          }
//  PERFORM 3000-PROCESS-INPUT-SYS001
          processInputSys001();/*3000-PROCESS-INPUT-SYS001*/
          if (this.isProgramEnded()) {
              return ;
          }
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          this.setProgramEnded(true);
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
      private void beginProcess() throws Exception {
			// Declare local variables used in the method
			PgmIp343690Group300 pgmIp343690Group300 = constants300.getPgmIp343690Group300();
			// End of variable declaration

      
// *----------------------------------------------------------------*
// * This paragraph checks for first time entry, updates  event log *
// * and display exectuion messages.                                *
// *----------------------------------------------------------------*
//  MOVE SPACES TO 100-IS-IT-SQL-ERROR
          work.setIsItSqlError100(CONSTANTS.SPACE);
//  MOVE 300-PGM-IP343690 TO IP60001-HOLD-PGM-NAME
          ip60001EventLogWorkArea.setIp60001HoldPgmName(pgmIp343690Group300.getPgmIp343690300());
  
//  PERFORM 9950-UPDATE-EVENT-LOG
          updateEventLog();/*9950-UPDATE-EVENT-LOG*/
//  IF 88-100-IT-IS-FIRST-TIME
          if ( work.isItIsFirstTime88100()  ) { 
//  PERFORM 1100-DISPLAY-EXEC-MSGS
              displayExecMsgs();/*1100-DISPLAY-EXEC-MSGS*/
//  PERFORM 1200-SET-PROCEDURE-POINTERS
              setProcedurePointers();/*1200-SET-PROCEDURE-POINTERS*/
//  PERFORM 1300-PROCESS-RUNCNTL-FILE
              processRuncntlFile();/*1300-PROCESS-RUNCNTL-FILE*/
//  PERFORM 1400-OPEN-INPUT-SYS001
              openInputSys001();/*1400-OPEN-INPUT-SYS001*/
//  SET 88-100-IT-IS-NOT-FIRST-TIME TO TRUE
              work.setItIsNotFirstTime88100True(); 
              
          }
      
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
      private void displayExecMsgs() throws Exception {
			// Declare local variables used in the method
			PgmIp343690Group300 pgmIp343690Group300 = constants300.getPgmIp343690Group300();
			// End of variable declaration

      
// *----------------------------------------------------------------*
// * This paragraph displays the program execution messages by      *
// * calling ip996010.                                              *
// *----------------------------------------------------------------*
//  SET 800-PTR-IP996010 TO ENTRY 300-PGM-IP996010
          work.setPtrIp996010800(constants300.getPgmIp996010300()); 
          
//  MOVE 300-PGM-IP343690 TO IP996011-PGM-ID
          ip996011ProgramStartMessage.setIp996011PgmId(pgmIp343690Group300.getPgmIp343690300());
  
//  MOVE 300-PGM-VERSION TO IP996011-PGM-VERSION
          ip996011ProgramStartMessage.setIp996011PgmVersion(constants300.getPgmVersion300());
          // MOVE WHEN-COMPILED TO IP996011-WHEN-COMPILED
          //  FORMAT1311677340 = "X(08)BX(08)"
          ip996011ProgramStartMessage.setIp996011WhenCompiled(CFUtil.cobolAnEditFormatter(CONSTANTS.FORMAT1311677340,CONSTANTS.LITERAL_2073358900));
//  CALL 800-PTR-IP996010
          // CALL 800-PTR-IP996010
          	this.setRc( ip996010.process());
      
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
      private void setProcedurePointers() throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph sets procedure pointers.                        *
// *----------------------------------------------------------------*
//  SET 800-PTR-IP599810 TO ENTRY 300-PGM-IP599810
          work.setPtrIp599810800(constants300.getPgmIp599810300()); 
          
//  SET 800-PTR-IP081110 TO ENTRY 300-PGM-IP081110
          work.setPtrIp081110800(constants300.getPgmIp081110300()); 
          
//  SET 800-PTR-IP280010 TO ENTRY 300-PGM-IP280010
          work.setPtrIp280010800(constants300.getPgmIp280010300()); 
          
//  SET 800-PTR-IP610010 TO ENTRY 300-PGM-IP610010
          work.setPtrIp610010800(constants300.getPgmIp610010300()); 
          
//  SET 800-PTR-MCWAIT TO ENTRY 300-PGM-MCWAIT
          work.setPtrMcwait800(constants300.getPgmMcwait300()); 
          
      
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
      private void processRuncntlFile() throws Exception {
			// Declare local variables used in the method
			char[] ip08101RptProcessTime = null;
			long ip08101ProcessDate = 0;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// * This paragraph calls routine to process run control file.      *
// *----------------------------------------------------------------*
//  CALL 800-PTR-IP081110
          // CALL 800-PTR-IP081110
          	this.setRc( ip081110.process());
          ip08101ProcessDate = ip08101RunControlRecord.getIp08101ProcessDate();
//  IF IP08101-PROCESS-DATE NUMERIC
          if (        ip08101RunControlRecord.ip08101ProcessDateIsNumeric() ) { 
//  MOVE IP08101-PROCESS-DATE TO IP50005-CLEARING-DT-TM (1 : 8)
              ip50005ClearingDtTm.replace(String.valueOf(ip08101RunControlRecord.getIp08101ProcessDateString()).toCharArray(),0,String.valueOf(ip08101RunControlRecord.getIp08101ProcessDateString()).length(),0,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
              ip08101RptProcessTime = ip08101RunControlRecord.getIp08101RptProcessTime();
//  IF IP08101-RPT-PROCESS-TIME (1 : 2) NUMERIC
              if (    isNumeric(substring(ip08101RptProcessTime,0,2))) { 
//  MOVE IP08101-RPT-PROCESS-TIME (1 : 2) TO IP50005-CLEARING-DT-TM (9 : 2)
                  ip50005ClearingDtTm.replace(ip08101RunControlRecord/*parent*/,44/*fromOffset - (ip50005ClearingDtTm) */,2/*fromLen*/,0+9 - 1/*toOffset - (ip08101RptProcessTime) */,2/*toLen*/);
              }
  
//  ELSE
              else { 
//  MOVE 300-VALUE-14 TO IP50005-CLEARING-DT-TM (9 : 2)
                  ip50005ClearingDtTm.replace(String.valueOf(constants300.getValue14300String()).toCharArray(),0,String.valueOf(constants300.getValue14300String()).length(),8,2 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
              }
          }
  
      
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
      private void openInputSys001() throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph opens the input file sys001.                    *
// *----------------------------------------------------------------*
//  OPEN INPUT SYS001-INPUT-PMA-UNLOAD
          sys001InputPmaUnload.open(new String(CONSTANTS.MODE_READ_ONLY_36242),sys001InputPmaUnload.getFileName(),sys001InputPmaUnload.getSys001InputPmaUnloadCharSet(),sys001InputPmaUnload.getSys001InputPmaUnloadCrlfFlag());
          work.setSys001FileStatus200(sys001InputPmaUnload.getStatusString() );
//  IF 88-200-SYS001-STATUS-GOOD
//  ELSE
          if (!(work.isSys001StatusGood88200()) ) { 
//  SET 88-600-SYS001-OPEN-ERR-TXT TO TRUE
              sys001ErrMsgTxt600.setSys001OpenErrTxt88600True(); 
              
//  MOVE 200-SYS001-FILE-STATUS TO 600-SYS001-STATUS
              sys001ErrMsgTxt600.setSys001Status600(work.getSys001FileStatus200());
//  MOVE 300-SYS001-OP-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(constants300.getSys001OpAbendCode300());
//  MOVE 300-PARA-1400 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara1400300());
              // MOVE 600-SYS001-ERR-MSG-TXT TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(sys001ErrMsgTxt600.toCharArray());
//  PERFORM 9500-ABEND-THE-PROGRAM
              abendTheProgram();/*9500-ABEND-THE-PROGRAM*/
          }
      
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
      private void connectToDb2() throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph establishes the connection to db2 and checks the*
// * collection id.                                                 *
// *----------------------------------------------------------------*
//  PERFORM 8000-CHECK-DB2-CONNECTION
          checkDb2Connection();/*8000-CHECK-DB2-CONNECTION*/
//  PERFORM 8100-CHECK-STATUS-MAP
          checkStatusMap();/*8100-CHECK-STATUS-MAP*/
//  IF 88-100-IT-IS-ABEND
          if ( apiLayout.isItIsAbend88100()  ) { 
//  SET 88-100-NEGATIVE-CODE TO TRUE
              apiLayout.setNegativeCode88100True(); 
              
//  SET 88-100-IT-IS-SQL-ERROR TO TRUE
              work.setItIsSqlError88100True(); 
              
//  SET 88-300-DB2-ABEND-2000-PARA TO TRUE
              work.setDb2Abend2000Para88300True(); 
              
//  SET 88-300-DB2-UNSUCESS-CONNECT TO TRUE
              work.setDb2UnsucessConnect88300True(); 
              
//  SET 88-600-ABEND-DB2-CONN-ERROR TO TRUE
              work.setAbendDb2ConnError88600True(); 
              
//  MOVE 300-ABEND-PARA TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getAbendPara300());
//  MOVE 300-ABEND-CODE TO 800-ABEND-CODE
              db2Workarea800.getAbendCode800().setString(work.getAbendCode300());
//  MOVE 600-ABEND-MESSAGE TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(pad(66,work.getAbendMessage600(),SPACE_CHAR,RIGHT_PAD));
//  PERFORM 9500-ABEND-THE-PROGRAM
              abendTheProgram();/*9500-ABEND-THE-PROGRAM*/
          }
      
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
      private void processInputSys001() throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph processes ia for matching virtual pan number.   *
// *----------------------------------------------------------------*
//  PERFORM 8200-READ-INPUT-SYS001
          readInputSys001();/*8200-READ-INPUT-SYS001*/
//  PERFORM UNTIL 88-200-SYS001-STATUS-EOF
          while ((!(work.isSys001StatusEof88200()) )) {
//  PERFORM 3100-PROCESS-TABLE40-LOOKUP
              processTable40Lookup();/*3100-PROCESS-TABLE40-LOOKUP*/
//  PERFORM 3200-UPDATE-TIPAPMA
              updateTipapma();/*3200-UPDATE-TIPAPMA*/
//  PERFORM 8200-READ-INPUT-SYS001
              readInputSys001();/*8200-READ-INPUT-SYS001*/
          }
//  PERFORM 3300-DO-END-PROCESS
          doEndProcess();/*3300-DO-END-PROCESS*/
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
      private void processTable40Lookup() throws Exception {
			// Declare local variables used in the method
			Ip00404ArRangeGrp ip00404ArRangeGrp = ip00404Table.getIp00404ArRangeGrp();
			char[] justifyIn800 = null;
			int ip00404EntriesFoundCount = 0;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// * This paragraph check the table40 for the funding pan number    *
// * to find the sequence number opt in or out                      *
// *----------------------------------------------------------------*
//  SET 88-800-NON-SPACE-FOUND-N TO TRUE
          work.setNonSpaceFoundN88800True(); 
          
//  SET 88-100-SEQ-OPT-OUT TO TRUE
          work.setSeqOptOut88100True(); 
          
          // MOVE SPACES TO 800-JUSTIFY-IN 800-JUSTIFY-OUT
          work.setJustifyIn800(CONSTANTS.SPACE_19);
          work.setJustifyOut800(CONSTANTS.SPACE_19);
//  MOVE ZEROES TO IP00404-TBL-40-AR-H
          ip00404ArRangeGrp.setIp00404Tbl40ArH(CONSTANTS.ZERO_19);
  
          // MOVE 800-VIRTUAL-ACCOUNT-NBR TO 800-JUSTIFY-IN
          work.setJustifyIn800(tipapmaLayout800.getVirtualAccountNbr800());
//  MOVE 300-VALUE-19 TO 800-ACTUAL-LEN
          work.setActualLen800((short) constants300.getValue19300());
//  PERFORM UNTIL 88-800-NON-SPACE-FOUND-Y OR 800-ACTUAL-LEN LESS THAN OR EQUAL 300-VALUE-01
          while ((!(work.isNonSpaceFoundY88800())  && 	( work.getActualLen800() > constants300.getValue01300() ))) {
              justifyIn800 = work.getJustifyIn800();
//  IF 800-JUSTIFY-IN ( 800-ACTUAL-LEN : 1) NOT EQUAL SPACES
              if (justifyIn800[(work.getActualLen800() - 1)] != ' ') { 
//  SET 88-800-NON-SPACE-FOUND-Y TO TRUE
                  work.setNonSpaceFoundY88800True(); 
                  
//  MOVE 800-JUSTIFY-IN TO 800-JUSTIFY-OUT (1 : 800-ACTUAL-LEN )
                  work.setJustifyOut800(replace(work.getJustifyOut800(),work.getJustifyIn800(),0,work.getActualLen800()));
              }
  
//  ELSE
              else { 
//  SUBTRACT 1 FROM 800-ACTUAL-LEN
                  work.setActualLen800( (short) (work.getActualLen800()-(short)1));
              }
          }
//  MOVE 800-JUSTIFY-OUT TO IP00404-TBL-40-AR-H (1 : 800-ACTUAL-LEN )
          ip00404Table.getIp00404ArRangeGrp().setIp00404Tbl40ArH(work.getJustifyOut800(),0,work.getJustifyOut800().length,0/* ip00404Tbl40ArH */ ,work.getActualLen800() /* field,targetIndex,targetLen */);
//  CALL 800-PTR-IP280010
          // CALL 800-PTR-IP280010
          	this.setRc( ip280010.process());
          ip00404EntriesFoundCount = ip00404Table.getIp00404EntriesFoundCount();
//  IF IP00404-ENTRIES-FOUND-COUNT GREATER THAN ZEROES
          if (	( ip00404EntriesFoundCount > 0 )) { 
//  SET IP00404-ACCT-RNG-INDEX TO 1
              ip00404AcctRngIndex = 1; 
              
//  IF 88-IP00404-SEQ-OPT-IN ( IP00404-ACCT-RNG-INDEX )
              if ( ip00404Table.getIp00404ArRangeEntries().getIp00404Entry(ip00404AcctRngIndex - 1).getIp00404MpePeRecDataCs().isIp00404SeqOptIn88()  ) { 
//  SET 88-100-SEQ-OPT-IN TO TRUE
                  work.setSeqOptIn88100True(); 
                  
              }
          }
  
      
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
      private void updateTipapma() throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph updates the tipapma table.                      *
// *----------------------------------------------------------------*
//  IF 88-100-SEQ-OPT-IN
//  ELSE
          if (!(work.isSeqOptIn88100()) ) { 
//  MOVE 300-NULL-VALUE TO TIPAPMA-PRIM-ACCT-SEQ-NUM-N
              itipapma.setTipapmaPrimAcctSeqNumN(constants300.getNullValue300());
//  MOVE ZEROES TO TIPAPMA-PRIM-ACCT-SEQ-NUM
              tipapma.setTipapmaPrimAcctSeqNum(CONSTANTS.ZERO_3);
//  MOVE 800-VIRTUAL-ACCOUNT-NBR TO TIPAPMA-VRTL-ACCT-NUM
              tipapma.setTipapmaVrtlAcctNum(tipapmaLayout800.getVirtualAccountNbr800());
//  MOVE 800-PRIM-ACCOUNT-NBR TO TIPAPMA-PRIM-ACCT-NUM
              tipapma.setTipapmaPrimAcctNum(tipapmaLayout800.getPrimAccountNbr800());
//  PERFORM 3210-OPEN-PMA-CURSOR
              openPmaCursor();/*3210-OPEN-PMA-CURSOR*/
//  PERFORM 3220-FETCH-UPDATE-PMA-CURSOR UNTIL 88-100-EOF-PMA-CURSOR
              while (!(work.isEofPmaCursor88100()) ) {
                 fetchUpdatePmaCursor();/*3220-FETCH-UPDATE-PMA-CURSOR*/
              }
//  PERFORM 3230-CLOSE-PMA-CURSOR
              closePmaCursor();/*3230-CLOSE-PMA-CURSOR*/
          }
      
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
      private void openPmaCursor() throws Exception {
			// Declare local variables used in the method
			int sqlcode = 0;
			short valueZero300 = 0;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// * This paragraph opens tipapma cursor.                           *
// *----------------------------------------------------------------*
//  MOVE SPACES TO 100-EOF-PMA-CURSOR
          work.setEofPmaCursor100(CONSTANTS.SPACE);
//  SELECT VRTL_ACCT_NUM , PRIM_ACCT_NUM , PRIM_ACCT_SEQ_NUM FROM TIPAPMA WHERE VRTL_ACCT_NUM = ? AND PRIM_ACCT_NUM = ? AND SUBSTR ( ? , LENGTH ( TRIM ( ? ) ) -2 , 3 ) = PARTN_ID FOR UPDATE OF PRIM_ACCT_SEQ_NUM
          ip343690Repository.openPmaCursorIp343690(tipapma,sqlca);
          sqlcode = sqlca.getSqlcode();
          valueZero300 = constants300.getValueZero300();
//  EVALUATE SQLCODE
          if  (	( sqlcode == valueZero300 ) ) { 
              ;
          }
          else   { 
//  SET 88-100-IT-IS-SQL-ERROR TO TRUE
              work.setItIsSqlError88100True(); 
              
//  MOVE 300-OPEN-TIPAPMA-CURSOR TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(constants300.getOpenTipapmaCursor300());
//  MOVE 300-PARA-3210 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara3210300());
              // MOVE SQLCODE TO 900-ABEND-SQL-CODE
              //  FORMAT431311340 = "-999999999"
              sqlAbendMsg900.setAbendSqlCode900(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT431311340,String.valueOf(sqlca.getSqlcode()).toCharArray()));
//  MOVE SQLERRMC TO 900-ABEND-SQLERRMC
              sqlAbendMsg900.setAbendSqlerrmc900(sqlca.getSqlerrm().getSqlerrmc());
//  PERFORM 9500-ABEND-THE-PROGRAM
              abendTheProgram();/*9500-ABEND-THE-PROGRAM*/
          }
  
      
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
      private void fetchUpdatePmaCursor() throws Exception {
			// Declare local variables used in the method
			int sqlcode = 0;
			short value100300 = 0;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// * This paragraph fetches tipapma cursor.                         *
// *----------------------------------------------------------------*
//  FETCH PMA_CURSOR INTO ? , ?
          ip343690Repository.fetchPmaCursorIp343690(tipapma,sqlca);
          sqlcode = sqlca.getSqlcode();
          value100300 = constants300.getValue100300();
//  EVALUATE SQLCODE
          if  (	( sqlcode == constants300.getValueZero300() ) ) { 
//  SET 88-IT-IS-DEAD-LOCK-Y TO TRUE
              work.setItIsDeadLockY88True(); 
              
//  PERFORM 8300-UPDATE-PMA-CURSOR UNTIL 88-IT-IS-DEAD-LOCK-N
              while (!(work.isItIsDeadLockN88()) ) {
                 updatePmaCursor();/*8300-UPDATE-PMA-CURSOR*/
              }
          }
          else if  (	( sqlcode == value100300 ) ) { 
//  SET 88-100-EOF-PMA-CURSOR TO TRUE
              work.setEofPmaCursor88100True(); 
              
          }
          else   { 
//  SET 88-100-IT-IS-SQL-ERROR TO TRUE
              work.setItIsSqlError88100True(); 
              
//  MOVE 300-FETCH-PMA-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(constants300.getFetchPmaAbendCode300());
//  MOVE 300-PARA-3220 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara3220300());
              // MOVE SQLCODE TO 900-ABEND-SQL-CODE
              //  FORMAT431311340 = "-999999999"
              sqlAbendMsg900.setAbendSqlCode900(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT431311340,String.valueOf(sqlca.getSqlcode()).toCharArray()));
//  MOVE SQLERRMC TO 900-ABEND-SQLERRMC
              sqlAbendMsg900.setAbendSqlerrmc900(sqlca.getSqlerrm().getSqlerrmc());
//  PERFORM 9500-ABEND-THE-PROGRAM
              abendTheProgram();/*9500-ABEND-THE-PROGRAM*/
          }
  
      
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
      private void closePmaCursor() throws Exception {
			// Declare local variables used in the method
			int sqlcode = 0;
			short valueZero300 = 0;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// * This paragraph close pma_cursor                                *
// *----------------------------------------------------------------*
//  CLOSE PMA_CURSOR
          ip343690Repository.closePmaCursorIp343690(sqlca);
          sqlcode = sqlca.getSqlcode();
          valueZero300 = constants300.getValueZero300();
//  EVALUATE SQLCODE
          if  (	( sqlcode == valueZero300 ) ) { 
              ;
          }
          else   { 
//  SET 88-100-IT-IS-SQL-ERROR TO TRUE
              work.setItIsSqlError88100True(); 
              
//  MOVE 300-CLOSE-TIPAPMA-CURSOR TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(constants300.getCloseTipapmaCursor300());
//  MOVE 300-PARA-3230 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara3230300());
              // MOVE SQLCODE TO 900-ABEND-SQL-CODE
              //  FORMAT431311340 = "-999999999"
              sqlAbendMsg900.setAbendSqlCode900(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT431311340,String.valueOf(sqlca.getSqlcode()).toCharArray()));
//  MOVE SQLERRMC TO 900-ABEND-SQLERRMC
              sqlAbendMsg900.setAbendSqlerrmc900(sqlca.getSqlerrm().getSqlerrmc());
//  PERFORM 9500-ABEND-THE-PROGRAM
              abendTheProgram();/*9500-ABEND-THE-PROGRAM*/
          }
  
      
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
      private void doEndProcess() throws Exception {
      
// *-----------------------------------------------------------------
// * This paragraph closes all the files and checks for the status. *
// * if it is not good performs terminate process.                  *
// *-----------------------------------------------------------------
//  SET 88-100-END-OF-PROCESS TO TRUE
          work.setEndOfProcess88100True(); 
          
//  PERFORM 8400-DO-COMMIT
          doCommit();/*8400-DO-COMMIT*/
//  PERFORM 8210-CLOSE-INPUT-SYS001
          closeInputSys001();/*8210-CLOSE-INPUT-SYS001*/
//  DISPLAY 600-RECS-READ-MSG 400-RECS-READ
          logger.info("{}{}", new String(work.getRecsReadMsg600()), String.valueOf(work.getRecsRead400())); 
//  DISPLAY 600-RECS-UPDATED-MSG 800-NO-OF-ROWS
          logger.info("{}{}", new String(work.getRecsUpdatedMsg600()), String.valueOf(work.getNoOfRows800())); 
      
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
      private void checkDb2Connection() throws Exception {
			// Declare local variables used in the method
			int sqlcode = 0;
			char[] db85102dConnectStatusMap = null;
			char[] db85102dCurrCollId = null;
			char[] db85102dPrevCollId = null;
			char[] thisPgmDb2CollIdBase300 = null;
			// End of variable declaration

      
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
          // MOVE '00000' TO DB85102D-CONNECT-STATUS-MAP
          //  LITERAL_00000 = '00000'
          db85102dWorkFields.setDb85102dConnectStatusMap(CONSTANTS.LITERAL_00000);
          // MOVE 'CURRENT PACKAGESET' TO SQL-TEMP
          work.setSqlTemp(CONSTANTS.LITERAL_2007672260);
//  SELECT CURRENT PACKAGESET FROM SYSIBM.SYSDUMMY1
          
/**
******   SET :DB85102D-CURR-COLL-ID = CURRENT PACKAGESET           
**/
          sqlca.setSqlcode(0);
          db85102dWorkFields.setDb85102dCurrCollId(db2Base.getCollectionId()); 
          sqlcode = sqlca.getSqlcode();
//  IF SQLCODE NOT = ZERO
          if (	( sqlcode != 0 )) { 
//  MOVE '2' TO DB85102D-CONNECT-STATUS-MAP (2 : 1)
//  LITERAL_2 = '2'
              db85102dWorkFields.setDb85102dConnectStatusMap(replace(db85102dWorkFields.getDb85102dConnectStatusMap(),CONSTANTS.LITERAL_2,1,2));
//  DISPLAY '  DB85102L RECEIVED NON-ZERO SQLCODE ' 'TRYING TO RETRIEVE COLLECTION-ID ' '''' DB85102D-CURR-COLL-ID '''.'
              logger.info("  DB85102L RECEIVED NON-ZERO SQLCODE TRYING TO RETRIEVE COLLECTION-ID \'{}\'.", new String(db85102dWorkFields.getDb85102dCurrCollId())); 
//  DISPLAY ' THE SQLCODE RETURNED WAS : ' SQLCODE
              logger.info(" THE SQLCODE RETURNED WAS : {}", String.valueOf(sqlca.getSqlcode())); 
          }
  
//  ELSE
          else { 
//  MOVE DB85102D-CURR-COLL-ID TO DB85102D-PREV-COLL-ID
              db85102dWorkFields.setDb85102dPrevCollId(db85102dWorkFields.getDb85102dCurrCollId());
//  MOVE DB85102D-CURR-COLL-ID TO DB85102D-TEMP-COLL-ID
              db85102dWorkFields.setDb85102dTempCollId(db85102dWorkFields.getDb85102dCurrCollId());
          }

// *    Need to switch to the correct coll-id for this program.    *
// *    if they do match, then we can bypass everything else.      *
// *****************************************************************
          thisPgmDb2CollIdBase300 = constants300.getThisPgmDb2CollIdBase300();
          db85102dCurrCollId = db85102dWorkFields.getDb85102dCurrCollId();
//  IF DB85102D-CURR-COLL-ID (1 : 7) NOT = 300-THIS-PGM-DB2-COLL-ID-BASE
          if (!(Field.compareChar(db85102dCurrCollId , thisPgmDb2CollIdBase300 , ( 0 /*start*/ ), 7 /*left len*/ , 7 /*right len*/))) { 

// *****************************************************************
// *        If not yet connected to db2, then read the db2 clone   *
// *        number from the flat file and plug it into the 8th     *
// *        position of the collection-id.                         *
// *****************************************************************
              db85102dCurrCollId = db85102dWorkFields.getDb85102dCurrCollId();
//  IF DB85102D-CURR-COLL-ID = SPACES OR LOW-VALUES
              if (        ( allSpaces(db85102dCurrCollId)   ) || 			( checkLowValue(db85102dCurrCollId) ) ) { 
//  MOVE SPACES TO DB85102D-TEMP-COLL-ID
                  db85102dWorkFields.setDb85102dTempCollId(CONSTANTS.SPACE_18);
//  OPEN INPUT DB2CLONE-FILE
                  db2cloneFile.open(new String(CONSTANTS.MODE_READ_ONLY_36242),db2cloneFile.getFileName(),db2cloneFile.getDb2cloneFileCharSet(),db2cloneFile.getDb2cloneFileCrlfFlag());
                  db85102dWorkFields.setDb85102dDb2cloneStatus(db2cloneFile.getStatusString() );
//  IF 88-DB85102D-DB2CLONE-IO-GOOD
                  if ( db85102dWorkFields.isDb85102dDb2cloneIoGood88()  ) { 
//  READ DB2CLONE-FILE INTO DB85102D-DB2CLONE-REC END-READ
                      	db2cloneFile.read();
                      db85102dWorkFields.setDb85102dDb2cloneStatus(db2cloneFile.getStatusString() );
                      if (!db2cloneFile.hasEnded()) {
                         db2cloneRec.setString(db2cloneFile.getRecord());
                         db85102dDb2cloneRec.setString(db2cloneRec.toCharArray());
                      }
//  IF 88-DB85102D-DB2CLONE-IO-GOOD
                      if ( db85102dWorkFields.isDb85102dDb2cloneIoGood88()  ) { 
//  MOVE DB85102D-DB2-CLONE-NUM TO DB85102D-TEMP-COLL-ID (8 : 3)
                          db85102dWorkFields.replace(db85102dDb2cloneRec/*parent*/,0/*fromOffset - (db85102dTempCollId) */,3/*fromLen*/,23+8 - 1/*toOffset - (db85102dDb2CloneNum) */,3/*toLen*/);
//  DISPLAY 'DB85102D-DB2-CLONE-NUM = ' DB85102D-DB2-CLONE-NUM
                          logger.info("DB85102D-DB2-CLONE-NUM = {}", new String(db85102dDb2cloneRec.getDb85102dDb2CloneNum())); 
                      }
//  ELSE
                      else { 
//  MOVE '1' TO DB85102D-CONNECT-STATUS-MAP (1 : 1)
//  LITERAL_1 = '1'
                          db85102dWorkFields.setDb85102dConnectStatusMap(replace(db85102dWorkFields.getDb85102dConnectStatusMap(),CONSTANTS.LITERAL_1,0,1));
                      }
                  }
//  ELSE
                  else { 
//  MOVE '1' TO DB85102D-CONNECT-STATUS-MAP (1 : 1)
//  LITERAL_1 = '1'
                      db85102dWorkFields.setDb85102dConnectStatusMap(replace(db85102dWorkFields.getDb85102dConnectStatusMap(),CONSTANTS.LITERAL_1,0,1));
                  }
//  CLOSE DB2CLONE-FILE
                  db2cloneFile.close(); 
                  db85102dWorkFields.setDb85102dDb2cloneStatus(db2cloneFile.getStatusString() );
                  db85102dConnectStatusMap = db85102dWorkFields.getDb85102dConnectStatusMap();
//  IF DB85102D-CONNECT-STATUS-MAP (1 : 1) = '1'
//  LITERAL_1 = '1'
                  if ( db85102dConnectStatusMap[0] == '1') { 
//cobolCode::GO TO 8000-CHECK-DB2-EXIT
checkStatusMap();
readInputSys001();
closeInputSys001();
updatePmaCursor();
doCommit();
deadLock();
callMcwaitForSleep();
abendTheProgram();
executeDb2errRotuine();
updateEventLog();
return ;
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
              db85102dWorkFields.replace(constants300/*parent*/,65/*fromOffset - (db85102dTempCollId) */,7/*fromLen*/,23/*toOffset - (thisPgmDb2CollIdBase300) */,7/*toLen*/);
//  SET CURRENT PACKAGESET = ?
              
/**
******      SET CURRENT PACKAGESET  = :DB85102D-TEMP-COLL-ID       
**/
              db2Base.setCollectionId(db85102dWorkFields.getDb85102dTempCollId()); 
              sqlcode = sqlca.getSqlcode();
//  IF SQLCODE NOT = ZERO
              if (	( sqlcode != 0 )) { 
//  MOVE '1' TO DB85102D-CONNECT-STATUS-MAP (2 : 1)
//  LITERAL_1 = '1'
                  db85102dWorkFields.setDb85102dConnectStatusMap(replace(db85102dWorkFields.getDb85102dConnectStatusMap(),CONSTANTS.LITERAL_1,1,2));
//  DISPLAY '  DB85102L RECEIVED NON-ZERO SQLCODE ' 'TRYING TO SET COLLECTION-ID TO ' '''' DB85102D-TEMP-COLL-ID '''.'
                  logger.info("  DB85102L RECEIVED NON-ZERO SQLCODE TRYING TO SET COLLECTION-ID TO \'{}\'.", new String(db85102dWorkFields.getDb85102dTempCollId())); 
//  DISPLAY ' THE SQLCODE RETURNED WAS : ' SQLCODE
                  logger.info(" THE SQLCODE RETURNED WAS : {}", String.valueOf(sqlca.getSqlcode())); 
              }
  
//  ELSE
              else { 
//  MOVE DB85102D-TEMP-COLL-ID TO DB85102D-CURR-COLL-ID
                  db85102dWorkFields.setDb85102dCurrCollId(db85102dWorkFields.getDb85102dTempCollId());

// *****************************************************************
// *          If db2 was just connected to for the first time,     *
// *          retrieve some of the connection info for future      *
// *          reference.                                           *
// *****************************************************************
// SELECT CURRENT SERVER  FROM SYSIBM.SYSDUMMY1 
                  db85102dPrevCollId = db85102dWorkFields.getDb85102dPrevCollId();
//  IF DB85102D-PREV-COLL-ID = SPACES OR LOW-VALUES
                  if (        ( allSpaces(db85102dPrevCollId)   ) || 			( checkLowValue(db85102dPrevCollId) ) ) { 
                      // MOVE 'CURRENT SERVER' TO SQL-TEMP
                      work.setSqlTemp(CONSTANTS.LITERAL_1275506723);
//  SELECT CURRENT SERVER FROM SYSIBM.SYSDUMMY1
                      
/**
******          SET :DB85102D-DB2-CURR-SERVER = CURRENT SERVER     
**/
                      sqlca.setSqlcode(0);
                      db85102dWorkFields.setDb85102dDb2CurrServer(db2Base.getCurrentServer()); 
                      sqlcode = sqlca.getSqlcode();
//  IF SQLCODE NOT = ZERO
                      if (	( sqlcode != 0 )) { 
//  MOVE '1' TO DB85102D-CONNECT-STATUS-MAP (3 : 1)
//  LITERAL_1 = '1'
                          db85102dWorkFields.setDb85102dConnectStatusMap(replace(db85102dWorkFields.getDb85102dConnectStatusMap(),CONSTANTS.LITERAL_1,2,3));
//  DISPLAY '  DB85102L RECEIVED NON-ZERO SQLCODE ' 'TRYING TO RETRIEVE THE DB2 CURRENT ' 'SERVER.'
                          logger.info("  DB85102L RECEIVED NON-ZERO SQLCODE TRYING TO RETRIEVE THE DB2 CURRENT SERVER."); 
//  DISPLAY '    THE CURRENT COLLECTION-ID WAS ' '''' DB85102D-CURR-COLL-ID '''.'
                          logger.info("    THE CURRENT COLLECTION-ID WAS \'{}\'.", new String(db85102dWorkFields.getDb85102dCurrCollId())); 
//  DISPLAY ' THE SQLCODE RETURNED WAS : ' SQLCODE
                          logger.info(" THE SQLCODE RETURNED WAS : {}", String.valueOf(sqlca.getSqlcode())); 
                      }
  
//  ELSE
                      else { 
//  SELECT USER FROM SYSIBM.SYSDUMMY1
                          
/**
******            SET :DB85102D-DB2-USER  = USER                   
**/
                          sqlca.setSqlcode(0);
                          db85102dWorkFields.setDb85102dDb2User(db2Base.getCurrentUser()); 
                          sqlcode = sqlca.getSqlcode();
//  IF SQLCODE NOT = ZERO
                          if (	( sqlcode != 0 )) { 
//  MOVE '1' TO DB85102D-CONNECT-STATUS-MAP (4 : 1)
//  LITERAL_1 = '1'
                              db85102dWorkFields.setDb85102dConnectStatusMap(replace(db85102dWorkFields.getDb85102dConnectStatusMap(),CONSTANTS.LITERAL_1,3,4));
                          }
  
//  ELSE
                          else { 
//  SELECT CURRENT SQLID FROM SYSIBM.SYSDUMMY1
                              
/**
******              SET :DB85102D-DB2-CURR-SQLID  = CURRENT SQLID  
**/
                              sqlca.setSqlcode(0);
                              db85102dWorkFields.setDb85102dDb2CurrSqlid(db2Base.getCurrentSqlId()); 
                              sqlcode = sqlca.getSqlcode();
//  IF SQLCODE NOT = ZERO
                              if (	( sqlcode != 0 )) { 
//  MOVE '1' TO DB85102D-CONNECT-STATUS-MAP (5 : 1)
//  LITERAL_1 = '1'
                                  db85102dWorkFields.setDb85102dConnectStatusMap(replace(db85102dWorkFields.getDb85102dConnectStatusMap(),CONSTANTS.LITERAL_1,4,5));
                              }
  
                          }
                      }
                  }
  
              }
          }
  
      
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
      private void checkStatusMap() throws Exception {
			// Declare local variables used in the method
			char[] db85102dConnectStatusMap = null;
			char[] errorValue300 = null;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// * 8100-Check-status-map.                                         *
// * procedure division copybook to check the status of connection  *
// * sql's.                                                         *
// *----------------------------------------------------------------*
          errorValue300 = constants300.getErrorValue300();
          db85102dConnectStatusMap = db85102dWorkFields.getDb85102dConnectStatusMap();
//  IF DB85102D-CONNECT-STATUS-MAP (1 : 1) = 300-ERROR-VALUE
          if (Field.compareChar(db85102dConnectStatusMap , errorValue300 , ( 0 /*start*/ ), 1 /*left len*/ , 1 /*right len*/)) { 
//  MOVE 300-PARA-8100 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara8100300());
              // MOVE 802-3005-DB-CONNECT-ERROR TO 800-ABEND-CODE IP60001-EVENT-ERROR-CODE
              db2Workarea800.getAbendCode800().setString(dbConnectError8023005.getCharArray());
              ip60001EventLogWorkArea.setIp60001EventErrorCode(dbConnectError8023005.toCharArray());
//  MOVE DB85102D-DB2CLONE-STATUS TO 600-MSG-3001A-FILE-STATUS
              msg3001a600.setMsg3001aFileStatus600(db85102dWorkFields.getDb85102dDb2cloneStatus());
              // MOVE 600-MSG-3001A TO 900-ABEND-TEXT IP60001-EVENT-ERROR-MSG
              abendMessage900.setAbendText900(msg3001a600.toCharArray());
              ip60001EventLogWorkArea.setIp60001EventErrorMsg(msg3001a600.toCharArray());
//  SET 88-100-IT-IS-SQL-ERROR TO TRUE
              work.setItIsSqlError88100True(); 
              
//  PERFORM 9500-ABEND-THE-PROGRAM
              abendTheProgram();/*9500-ABEND-THE-PROGRAM*/
          }
  
          errorValue300 = constants300.getErrorValue300();
          db85102dConnectStatusMap = db85102dWorkFields.getDb85102dConnectStatusMap();
//  IF DB85102D-CONNECT-STATUS-MAP (2 : 1) = 300-ERROR-VALUE
          if (Field.compareChar(db85102dConnectStatusMap , errorValue300 , ( 1 /*start*/ ), 1 /*left len*/ , 1 /*right len*/)) { 
//  MOVE 300-PARA-8100 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara8100300());
              // MOVE 802-3005-DB-CONNECT-ERROR TO 800-ABEND-CODE IP60001-EVENT-ERROR-CODE
              db2Workarea800.getAbendCode800().setString(dbConnectError8023005.getCharArray());
              ip60001EventLogWorkArea.setIp60001EventErrorCode(dbConnectError8023005.toCharArray());
//  MOVE 600-MSG-3005B TO 900-ABEND-TEXT IP60001-EVENT-ERROR-MSG
              abendMessage900.setAbendText900(pad(66,work.getMsg3005b600(),SPACE_CHAR,RIGHT_PAD));
              ip60001EventLogWorkArea.setIp60001EventErrorMsg(work.getMsg3005b600());
//  SET 88-100-IT-IS-SQL-ERROR TO TRUE
              work.setItIsSqlError88100True(); 
              
//  PERFORM 9500-ABEND-THE-PROGRAM
              abendTheProgram();/*9500-ABEND-THE-PROGRAM*/
          }
  
          errorValue300 = constants300.getErrorValue300();
          db85102dConnectStatusMap = db85102dWorkFields.getDb85102dConnectStatusMap();
//  IF DB85102D-CONNECT-STATUS-MAP (3 : 1) = 300-ERROR-VALUE
          if (Field.compareChar(db85102dConnectStatusMap , errorValue300 , ( 2 /*start*/ ), 1 /*left len*/ , 1 /*right len*/)) { 
//  MOVE 300-PARA-8100 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara8100300());
              // MOVE 802-3005-DB-CONNECT-ERROR TO 800-ABEND-CODE IP60001-EVENT-ERROR-CODE
              db2Workarea800.getAbendCode800().setString(dbConnectError8023005.getCharArray());
              ip60001EventLogWorkArea.setIp60001EventErrorCode(dbConnectError8023005.toCharArray());
//  MOVE 600-MSG-3005C TO 900-ABEND-TEXT IP60001-EVENT-ERROR-MSG
              abendMessage900.setAbendText900(pad(66,work.getMsg3005c600(),SPACE_CHAR,RIGHT_PAD));
              ip60001EventLogWorkArea.setIp60001EventErrorMsg(work.getMsg3005c600());
//  SET 88-100-IT-IS-SQL-ERROR TO TRUE
              work.setItIsSqlError88100True(); 
              
//  PERFORM 9500-ABEND-THE-PROGRAM
              abendTheProgram();/*9500-ABEND-THE-PROGRAM*/
          }
  
          errorValue300 = constants300.getErrorValue300();
          db85102dConnectStatusMap = db85102dWorkFields.getDb85102dConnectStatusMap();
//  IF DB85102D-CONNECT-STATUS-MAP (4 : 1) = 300-ERROR-VALUE
          if (Field.compareChar(db85102dConnectStatusMap , errorValue300 , ( 3 /*start*/ ), 1 /*left len*/ , 1 /*right len*/)) { 
//  MOVE 300-PARA-8100 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara8100300());
              // MOVE 802-3005-DB-CONNECT-ERROR TO 800-ABEND-CODE IP60001-EVENT-ERROR-CODE
              db2Workarea800.getAbendCode800().setString(dbConnectError8023005.getCharArray());
              ip60001EventLogWorkArea.setIp60001EventErrorCode(dbConnectError8023005.toCharArray());
//  MOVE 600-MSG-3005D TO 900-ABEND-TEXT IP60001-EVENT-ERROR-MSG
              abendMessage900.setAbendText900(pad(66,work.getMsg3005d600(),SPACE_CHAR,RIGHT_PAD));
              ip60001EventLogWorkArea.setIp60001EventErrorMsg(work.getMsg3005d600());
//  SET 88-100-IT-IS-SQL-ERROR TO TRUE
              work.setItIsSqlError88100True(); 
              
//  PERFORM 9500-ABEND-THE-PROGRAM
              abendTheProgram();/*9500-ABEND-THE-PROGRAM*/
          }
  
          errorValue300 = constants300.getErrorValue300();
          db85102dConnectStatusMap = db85102dWorkFields.getDb85102dConnectStatusMap();
//  IF DB85102D-CONNECT-STATUS-MAP (5 : 1) = 300-ERROR-VALUE
          if (Field.compareChar(db85102dConnectStatusMap , errorValue300 , ( 4 /*start*/ ), 1 /*left len*/ , 1 /*right len*/)) { 
//  MOVE 300-PARA-8100 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara8100300());
              // MOVE 802-3005-DB-CONNECT-ERROR TO 800-ABEND-CODE IP60001-EVENT-ERROR-CODE
              db2Workarea800.getAbendCode800().setString(dbConnectError8023005.getCharArray());
              ip60001EventLogWorkArea.setIp60001EventErrorCode(dbConnectError8023005.toCharArray());
//  MOVE 600-MSG-3005E TO 900-ABEND-TEXT IP60001-EVENT-ERROR-MSG
              abendMessage900.setAbendText900(pad(66,work.getMsg3005e600(),SPACE_CHAR,RIGHT_PAD));
              ip60001EventLogWorkArea.setIp60001EventErrorMsg(work.getMsg3005e600());
//  SET 88-100-IT-IS-SQL-ERROR TO TRUE
              work.setItIsSqlError88100True(); 
              
//  PERFORM 9500-ABEND-THE-PROGRAM
              abendTheProgram();/*9500-ABEND-THE-PROGRAM*/
          }
  
//  SET 88-100-IT-IS-CONNECTED-TO-DB2 TO TRUE
          apiLayout.setItIsConnectedToDb288100True(); 
          
      
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
      private void readInputSys001() throws Exception {
      
// *----------------------------------------------------------------
// *This paragraph reads the pmm work file into am182010
// *and checks the file status.
// *----------------------------------------------------------------
//  READ SYS001-INPUT-PMA-UNLOAD INTO 800-TIPAPMA-LAYOUT END-READ
          	sys001InputPmaUnload.read();
          work.setSys001FileStatus200(sys001InputPmaUnload.getStatusString() );
          if (!sys001InputPmaUnload.hasEnded()) {
             sys001InputPmaUnldRec.setString(sys001InputPmaUnload.getRecord());
             tipapmaLayout800.setString(sys001InputPmaUnldRec.toCharArray());
          }
//  IF 88-200-SYS001-STATUS-GOOD
          if ( work.isSys001StatusGood88200()  ) { 
//  ADD 1 TO 400-RECS-READ
              work.setRecsRead400(work.getRecsRead400()+(long)1);
          }
//  ELSE
          else { 
//  IF 88-200-SYS001-STATUS-EOF
//  ELSE
              if (!(work.isSys001StatusEof88200()) ) { 
//  SET 88-600-SYS001-READ-ERR-TXT TO TRUE
                  sys001ErrMsgTxt600.setSys001ReadErrTxt88600True(); 
                  
//  MOVE 200-SYS001-FILE-STATUS TO 600-SYS001-STATUS
                  sys001ErrMsgTxt600.setSys001Status600(work.getSys001FileStatus200());
//  MOVE 300-SYS001-RD-ABEND-CODE TO 900-ABEND-CODE
                  abendMessage900.setAbendCode900(constants300.getSys001RdAbendCode300());
//  MOVE 300-PARA-8200 TO 900-ABEND-PARA
                  abendParaName900.setAbendPara900(work.getPara8200300());
                  // MOVE 600-SYS001-ERR-MSG-TXT TO 900-ABEND-TEXT
                  abendMessage900.setAbendText900(sys001ErrMsgTxt600.toCharArray());
//  PERFORM 8210-CLOSE-INPUT-SYS001
                  closeInputSys001();/*8210-CLOSE-INPUT-SYS001*/
//  PERFORM 9500-ABEND-THE-PROGRAM
                  abendTheProgram();/*9500-ABEND-THE-PROGRAM*/
              }
          }
      
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
      private void closeInputSys001() throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph closes sys001 input file.                        *
// *----------------------------------------------------------------*
//  CLOSE SYS001-INPUT-PMA-UNLOAD
          sys001InputPmaUnload.close(); 
          work.setSys001FileStatus200(sys001InputPmaUnload.getStatusString() );
//  IF 88-200-SYS001-STATUS-GOOD
//  ELSE
          if (!(work.isSys001StatusGood88200()) ) { 
//  SET 88-600-SYS001-CLOSE-ERR-TXT TO TRUE
              sys001ErrMsgTxt600.setSys001CloseErrTxt88600True(); 
              
//  MOVE 300-PARA-8210 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara8210300());
//  MOVE 300-SYS001-CL-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(constants300.getSys001ClAbendCode300());
              // MOVE 600-SYS001-ERR-MSG-TXT TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(sys001ErrMsgTxt600.toCharArray());
//  PERFORM 9500-ABEND-THE-PROGRAM
              abendTheProgram();/*9500-ABEND-THE-PROGRAM*/
          }
      
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
      private void updatePmaCursor() throws Exception {
			// Declare local variables used in the method
			int noTimes911Try800 = 0;
			int valueRetry300 = 0;
			int sqlcode = 0;
			int sql911300 = 0;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// * This paragraph update the current record                       *
// *----------------------------------------------------------------*
//  UPDATE TIPAPMA SET PRIM_ACCT_SEQ_NUM = ? WHERE CURRENT OF PMA_CURSOR
          ip343690Repository.updateTipapma1(tipapma,itipapma,sqlca);
          sqlcode = sqlca.getSqlcode();
          sql911300 = constants300.getSql911300();
//  EVALUATE SQLCODE
          if  (	( sqlcode == 0 )) { 
//  SET 88-100-ROWS-FOUND TO TRUE
              apiLayout.setRowsFound88100True(); 
              
//  ADD SQLERRD (3) TO 800-NO-OF-ROWS 800-COMMIT-ROWS
              work.setNoOfRows800(work.getNoOfRows800()+(int) sqlca.getSqlerrd(2));
              work.setCommitRows800(work.getCommitRows800()+(int) sqlca.getSqlerrd(2));
//  PERFORM 8400-DO-COMMIT
              doCommit();/*8400-DO-COMMIT*/
//  SET 88-IT-IS-DEAD-LOCK-N TO TRUE
              work.setItIsDeadLockN88True(); 
              
          }
          else if  (	( sqlcode == constants300.getSql100300() )) { 
//  SET 88-100-ROWS-NOT-FND TO TRUE
              apiLayout.setRowsNotFnd88100True(); 
              
//  SET 88-IT-IS-DEAD-LOCK-N TO TRUE
              work.setItIsDeadLockN88True(); 
              
          }
          else if  ((	( sqlcode == constants300.getSql904300() )) || (	( sqlcode == sql911300 ))) { 
              noTimes911Try800 = db2Workarea800.getNoTimes911Try800();
              valueRetry300 = constants300.getValueRetry300();
//  IF 800-NO-TIMES-911-TRY LESS THAN OR EQUAL 300-VALUE-RETRY
              if (	( noTimes911Try800 <= valueRetry300 )) { 
//  PERFORM 9100-DEAD-LOCK
                  deadLock();/*9100-DEAD-LOCK*/
              }
  
//  ELSE
              else { 
//  SET 88-IT-IS-DEAD-LOCK-N TO TRUE
                  work.setItIsDeadLockN88True(); 
                  
//  PERFORM 9100-DEAD-LOCK
                  deadLock();/*9100-DEAD-LOCK*/
              }
          }
          else   { 
//  DISPLAY 'CRTE_UPDT_TS  : ' TIPAPMA-CRTE-UPDT-TS
              logger.info("CRTE_UPDT_TS  : {}", new String(tipapma.getTipapmaCrteUpdtTs())); 
//  DISPLAY 'PRIM_ACCT_NUM : ' TIPAPMA-PRIM-ACCT-NUM
              logger.info("PRIM_ACCT_NUM : {}", new String(tipapma.getTipapmaPrimAcctNum())); 
//  SET 88-100-NEGATIVE-CODE TO TRUE
              apiLayout.setNegativeCode88100True(); 
              
//  SET 88-300-DB2-UPDATE-PARA TO TRUE
              work.setDb2UpdatePara88300True(); 
              
//  SET 88-100-IT-IS-SQL-ERROR TO TRUE
              work.setItIsSqlError88100True(); 
              
//  MOVE 300-ABEND-PARA TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getAbendPara300());
              // MOVE 802-3010-DB-UPDATE-ERROR TO 800-ABEND-CODE
              db2Workarea800.getAbendCode800().setString(dbUpdateError8023010.getCharArray());
//  MOVE 600-MSG-3010 TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(pad(66,work.getMsg3010600(),SPACE_CHAR,RIGHT_PAD));
//  PERFORM 9500-ABEND-THE-PROGRAM
              abendTheProgram();/*9500-ABEND-THE-PROGRAM*/
          }
  
          noTimes911Try800 = db2Workarea800.getNoTimes911Try800();
//  IF 800-NO-TIMES-911-TRY GREATER THAN ZEROES AND 88-IT-IS-DEAD-LOCK-N
          if (	( noTimes911Try800 > 0 ) &&  work.isItIsDeadLockN88()  ) { 
//  DISPLAY 600-DB2-DEADLOCK-REL
              logger.info(new String(work.getDb2DeadlockRel600())); 
//  MOVE ZEROES TO 800-NO-TIMES-911-TRY
              db2Workarea800.setNoTimes911Try800(0);
          }
  
      
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
      private void doCommit() throws Exception {
			// Declare local variables used in the method
			long commitRows800 = 0;
			long commitFreq1000 = 0;
			// End of variable declaration

      
// *-----------------------------------------------------------------
// * This paragraph issues commit.                                  *
// *-----------------------------------------------------------------
          commitFreq1000 = parms1000.getCommitFreq1000();
          commitRows800 = work.getCommitRows800();
//  IF 800-COMMIT-ROWS >= 1000-COMMIT-FREQ OR 88-100-END-OF-PROCESS
          if (	( commitRows800 >= commitFreq1000 ) ||  work.isEndOfProcess88100()  ) { 
//  CALL 800-PTR-IP599810
              // CALL 800-PTR-IP599810
              	this.setRc( ip599810.process());
//  MOVE ZEROES TO 800-COMMIT-ROWS
              work.setCommitRows800(0);
          }
  
      
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
      private void deadLock() throws Exception {
			// Declare local variables used in the method
			int sqlcode = 0;
			int sql904300 = 0;
			int sql911300 = 0;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// * This paragraph tries to initiate contact to the pac table      *
// * multiple times based upon a parameter.after each try ,mcwait is*
// * called to issue a short sleep.abend the program if still -911  *
// * or -904                                                        *
// *----------------------------------------------------------------*
//  DISPLAY 600-DB2-DEADLOCK
          logger.info(new String(work.getDb2Deadlock600())); 
          sqlcode = sqlca.getSqlcode();
          sql904300 = constants300.getSql904300();
          sql911300 = constants300.getSql911300();
//  IF SQLCODE = 300-SQL-904 OR SQLCODE = 300-SQL-911
          if (	( sqlcode == sql904300 ) || 	( sqlcode == sql911300 )) { 
//  IF 88-IT-IS-DEAD-LOCK-Y
              if ( work.isItIsDeadLockY88()  ) { 
//  PERFORM 9200-CALL-MCWAIT-FOR-SLEEP
                  callMcwaitForSleep();/*9200-CALL-MCWAIT-FOR-SLEEP*/
//  ADD 300-VALUE-1 TO 800-NO-TIMES-911-TRY
                  db2Workarea800.setNoTimes911Try800(db2Workarea800.getNoTimes911Try800()+constants300.getValue1300());
              }
//  ELSE
              else { 
//  SET 88-100-NEGATIVE-CODE TO TRUE
                  apiLayout.setNegativeCode88100True(); 
                  
//  SET 88-100-IT-IS-SQL-ERROR TO TRUE
                  work.setItIsSqlError88100True(); 
                  
//  SET 88-300-DB2-DEAD-LOCK-PARA TO TRUE
                  work.setDb2DeadLockPara88300True(); 
                  
//  SET 88-600-ABEND-DB2-911-ERROR TO TRUE
                  work.setAbendDb2911Error88600True(); 
                  
//  MOVE 300-ABEND-PARA TO 900-ABEND-PARA
                  abendParaName900.setAbendPara900(work.getAbendPara300());
//  MOVE 600-ABEND-MESSAGE TO 900-ABEND-TEXT
                  abendMessage900.setAbendText900(pad(66,work.getAbendMessage600(),SPACE_CHAR,RIGHT_PAD));
                  // MOVE 802-3006-DB-SELECT-ERROR TO 800-ABEND-CODE
                  db2Workarea800.getAbendCode800().setString(dbSelectError8023006.getCharArray());
//  PERFORM 9500-ABEND-THE-PROGRAM
                  abendTheProgram();/*9500-ABEND-THE-PROGRAM*/
              }
          }
  
      
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
      private void callMcwaitForSleep() throws Exception {
			// Declare local variables used in the method
			SleepTimeGroup800 sleepTimeGroup800 = db2Workarea800.getSleepTimeGroup800();
			// End of variable declaration

      
// *----------------------------------------------------------------*
// *This paragraph calls a routine to sleep for definite interval   *
// *so that the select can be tried after the interval.             *
// *----------------------------------------------------------------*
//  ACCEPT 800-CURR-TIME FROM TIME
          db2Workarea800.setCurrTime800(getCurrentTimeString()); 
          // MOVE 800-SLEEP-TIME TO 600-SLEEP-TIME
          sleepMessage600.setSleepTime600(db2Workarea800.getSleepTimeGroup800().getSleepTime800());
  
//  MOVE 800-CURR-TIME TO 600-CURR-TIME
          sleepMessage600.setCurrTime600(db2Workarea800.getCurrTime800());
//  DISPLAY 600-SLEEP-MESSAGE
          logger.info(sleepMessage600.toString()); 
//  CALL 800-PTR-MCWAIT USING 800-SLEEP-TIME
          // CALL 800-PTR-MCWAIT USING 800-SLEEP-TIME
               this.setRc( mcwait.call(db2Workarea800.getSleepTimeGroup800()));
      
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
      private void abendTheProgram() throws Exception {
			// Declare local variables used in the method
			AbendCode800 abendCode800 = db2Workarea800.getAbendCode800();
			int sqlcode = 0;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// * This paragraph is to perform whenever abend occurs.            *
// *----------------------------------------------------------------*
//  DISPLAY 900-ASTRISK-LINE
          logger.info(new String(work.getAstriskLine900())); 
//  DISPLAY 900-ABEND-ABEND
          logger.info(new String(work.getAbendAbend900())); 
//  DISPLAY 900-ABEND-ABEND-PGM
          logger.info(new String(work.getAbendAbendPgm900())); 
//  DISPLAY 900-ASTRISK-LINE
          logger.info(new String(work.getAstriskLine900())); 
//  IF 88-100-IT-IS-SQL-ERROR
          if ( work.isItIsSqlError88100()  ) { 
//  DISPLAY 900-ABEND-PARA-NAME
              logger.info(abendParaName900.toString()); 
//  MOVE 800-ABEND TO 800-ABEND-CD
              db2Workarea800.setAbendCd800(abendCode800.getAbend800());
  
//  MOVE 800-ABEND-CD TO 900-ABEND-CODE IP60001-EVENT-ERROR-CODE
              abendMessage900.setAbendCode900(String.valueOf(db2Workarea800.getAbendCd800String()).toCharArray());
              ip60001EventLogWorkArea.setIp60001EventErrorCode(String.valueOf(db2Workarea800.getAbendCd800String()).toCharArray());
              // MOVE 900-ABEND-MESSAGE TO IP60001-EVENT-ERROR-MSG
              ip60001EventLogWorkArea.setIp60001EventErrorMsg(abendMessage900.toCharArray());
//  DISPLAY 900-ABEND-MESSAGE
              logger.info(abendMessage900.toString()); 
              // MOVE SQLCODE OF SQLCA TO 900-ABEND-SQL-CODE
              //  FORMAT431311340 = "-999999999"
              sqlAbendMsg900.setAbendSqlCode900(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT431311340,String.valueOf(sqlca.getSqlcode()).toCharArray()));
//  MOVE SQLERRMC TO 900-ABEND-SQLERRMC
              sqlAbendMsg900.setAbendSqlerrmc900(sqlca.getSqlerrm().getSqlerrmc());
//  DISPLAY 900-SQL-ABEND-MSG
              logger.info(sqlAbendMsg900.toString()); 
//  PERFORM 9510-EXECUTE-DB2ERR-ROTUINE
              executeDb2errRotuine();/*9510-EXECUTE-DB2ERR-ROTUINE*/
          }
//  ELSE
          else { 
//  DISPLAY 900-ABEND-PARA-NAME
              logger.info(abendParaName900.toString()); 
//  MOVE 900-ABEND-CODE TO IP60001-EVENT-ERROR-CODE
              ip60001EventLogWorkArea.setIp60001EventErrorCode(abendMessage900.getAbendCode900());
              // MOVE 900-ABEND-MESSAGE TO IP60001-EVENT-ERROR-MSG
              ip60001EventLogWorkArea.setIp60001EventErrorMsg(abendMessage900.toCharArray());
//  DISPLAY 900-ABEND-MESSAGE
              logger.info(abendMessage900.toString()); 
          }
//  IF 88-100-IT-IS-CONNECTED-TO-DB2
          if ( apiLayout.isItIsConnectedToDb288100()  ) { 
//  ROLLBACK
              try {
              	// COMMIT
              	// reset SQLCODE
              	sqlca.setSqlcode(0);
                 // execute jdbc commit
                 db2Base.rollback();
              }
               catch (SQLException e) {
                         sqlca.setSqlcode(Db2Base.fillSQLCode(e.getMessage()));
                     }
               catch(Exception e) {
                handleErrorCode(e);
              }
//  IF SQLCODE OF SQLCA EQUAL ZERO
              sqlcode = sqlca.getSqlcode();
//  ELSE
              if (	( sqlcode != 0 )) { 
//  DISPLAY SPACE
                  logger.info(" "); 
//  DISPLAY 900-ABEND-PARA-NAME
                  logger.info(abendParaName900.toString()); 
//  MOVE SQLERRMC TO 900-ABEND-SQLERRMC
                  sqlAbendMsg900.setAbendSqlerrmc900(sqlca.getSqlerrm().getSqlerrmc());
                  // MOVE SQLCODE OF SQLCA TO 900-ABEND-SQL-CODE
                  //  FORMAT431311340 = "-999999999"
                  sqlAbendMsg900.setAbendSqlCode900(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT431311340,String.valueOf(sqlca.getSqlcode()).toCharArray()));
//  DISPLAY 900-SQL-ABEND-MSG
                  logger.info(sqlAbendMsg900.toString()); 
//  SET 88-300-DB2-UNSUCESS-ROLLBACK TO TRUE
                  work.setDb2UnsucessRollback88300True(); 
                  
//  SET 88-600-ABEND-DB2-RBACK-ERROR TO TRUE
                  work.setAbendDb2RbackError88600True(); 
                  
//  MOVE 300-ABEND-CODE TO 900-ABEND-CODE
                  abendMessage900.setAbendCode900(work.getAbendCode300());
//  MOVE 600-ABEND-MESSAGE TO 900-ABEND-TEXT
                  abendMessage900.setAbendText900(pad(66,work.getAbendMessage600(),SPACE_CHAR,RIGHT_PAD));
//  DISPLAY 900-ABEND-MESSAGE
                  logger.info(abendMessage900.toString()); 
//  PERFORM 9510-EXECUTE-DB2ERR-ROTUINE
                  executeDb2errRotuine();/*9510-EXECUTE-DB2ERR-ROTUINE*/
              }
  
          }
//  CALL 800-PTR-IP610010
          // CALL 800-PTR-IP610010
          	this.setRc( ip610010.process());
      
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
      private void executeDb2errRotuine() throws Exception {
			// Declare local variables used in the method
			PgmIp343690Group300 pgmIp343690Group300 = constants300.getPgmIp343690Group300();
			short cond0000300 = 0;
			// End of variable declaration

      
// *----------------------------------------------------------------*
// * Db2 error routine.                                             *
// *----------------------------------------------------------------*
//  DISPLAY 600-BLANK-SPACE
          logger.info(new String(work.getBlankSpace600())); 
//  DISPLAY 600-ASTERISK-LINE
          logger.info(new String(work.getAsteriskLine600())); 
//  DISPLAY 600-BLANK-SPACE
          logger.info(new String(work.getBlankSpace600())); 
//  CALL DB85102C-DB2-BATCH-ERROR-RTN USING SQLCA 300-PGM-IP343690
          // CALL DB85102C-DB2-BATCH-ERROR-RTN USING SQLCA 300-PGM-IP343690
               this.setRc( db200020.call(sqlca,constants300.getPgmIp343690Group300()));
//  IF RETURN-CODE EQUAL 300-COND-0000
          cond0000300 = constants300.getCond0000300();
//  ELSE
          if (	( getRc() != cond0000300 ) ) { 
//  DISPLAY 600-DB2-ERR-MODULE-MSG
              logger.info(new String(work.getDb2ErrModuleMsg600())); 
          }
  
      
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
      private void updateEventLog() throws Exception {
			// Declare local variables used in the method
			long ip60001Subscript = 0;
			// End of variable declaration

      
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
//  IF 88-IP60001-LOG-EVENT
          if ( ip60001EventLogWorkArea.isIp60001LogEvent88()  ) { 
              ip60001Subscript = ip60001EventLogWorkArea.getIp60001Subscript();
//  IF IP60001-SUBSCRIPT = 500
              if (	( ip60001Subscript == 500 ) ) { 
//  MOVE 1 TO IP60001-SUBSCRIPT
//  LITERAL_1 = 1
                  ip60001EventLogWorkArea.setIp60001Subscript((long)1);
              }
  
//  ELSE
              else { 
//  ADD 1 TO IP60001-SUBSCRIPT
                  ip60001EventLogWorkArea.setIp60001Subscript(ip60001EventLogWorkArea.getIp60001Subscript()+(long)1);
              }
//  MOVE IP60001-HOLD-PGM-NAME TO IP60001-PGM-NAME ( IP60001-SUBSCRIPT )
              ip60001EventLogWorkArea.getIp60001EventEntry((int) ip60001EventLogWorkArea.getIp60001Subscript() - 1).setIp60001PgmName(ip60001EventLogWorkArea.getIp60001HoldPgmName());
          }
      
      }
  
  
      /**
* This method pre-initializes variables consistent with
* what a mainframe program would have done at the start of a program
*/
      @Override
      public void initVars() throws CFException {
      setProgramEnded(false);
          db2Base.reset("IP343690" ,dbQualifier, true/*use Dynamic SQL*/);
          if(!isInitDone()) {
          	this.setRc(0);
          	setInitDone(true);
          }
        CFUtil.resetDecimalAsComma();
       }
  
      public int call(Object[] params) throws Exception {
      
      int len = params.length;
         if (len > 0 && params[0] != null )
            parms1000.set((Field)params[0]);
         // invoke the process and return rc
         return process();
         
      }
      
      public int call(Field... parameters) throws Exception {
         for (int index = 0; index < parameters.length;index++) {
             switch(index) {
              case 0:
                      if(parameters[index] != null ) {
              		if (parameters[index] instanceof Parms1000) {
                       	this.parms1000 = ((Parms1000) parameters[index]);
                  	} else {
                       	this.parms1000.set(parameters[index]);
                  	}
                  }
                
                  break;
            }
         }
          return process();
      }
      
      
      public void setFromMcwait(Object[] params) {
      int len = params.length;
         if (len > 0)
         if(params[0] instanceof Field) 
   db2Workarea800.getSleepTimeGroup800().setString(((Field)params[0] ).toCharArray());
 else    db2Workarea800.getSleepTimeGroup800().setString((char[])params[0] );
      }
      public void setFromDb200020(Object[] params) {
      int len = params.length;
         if (len > 0)
         if(params[0] instanceof Field) 
   sqlca.setString(((Field)params[0] ).toCharArray());
 else    sqlca.setString((char[])params[0] );
         if (len > 1)
         if(params[1] instanceof Field) 
   constants300.getPgmIp343690Group300().setString(((Field)params[1] ).toCharArray());
 else    constants300.getPgmIp343690Group300().setString((char[])params[1] );
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
