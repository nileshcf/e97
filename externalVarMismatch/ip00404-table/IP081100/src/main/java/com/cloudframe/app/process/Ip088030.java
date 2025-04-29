  package com.cloudframe.app.process;
  /* 
* element ip088030 as of 12/06/21 06:27:54                    [vc]
*--------------------------------------------------------------*
*          -- -- -- c o n f i d e n t i a l -- -- --           *
*    this item contains information and procedures which are   *
*    proprietary to mastercard international, incorporated,    *
*    and which are confidential.  it is provided with the      *
*    express understanding that it is to be used only for the  *
*    benefit of interbank card association, and is not to be   *
*    used, copied, or disclosed for any other purpose.  any    *
*    authorized reproduction (in whole or in part) of this     *
*    material must be marked with this legend.                 *
*--------------------------------------------------------------*
* purpose     : main driver program to determine interchange to*
*               be applied on mpqr transactions.               *
*--------------------------------------------------------------*
*/
  
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.ip088030.file.*;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.process.Ip996010;
  import com.cloudframe.app.process.Ip081110;
  import org.springframework.beans.factory.annotation.Value;
  import com.cloudframe.app.ip088030.file.records.Ip98151RecordPart1;
  import com.cloudframe.app.global.sharedvar.Ip00164TableData;
  import com.cloudframe.app.ip088030.file.records.Ip98152RecordPart2;
  import com.cloudframe.app.global.sharedvar.Ip33701CurrConvOutput;
  import com.cloudframe.app.global.sharedvar.Ip33701CurrConvInput;
  import com.cloudframe.app.process.Ip288010;
  import com.cloudframe.app.ip088030.file.records.Sys201RecordPart2;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.global.sharedvar.Ip00404ArRangeGrp;
  import com.cloudframe.app.process.Ip280010;
  import com.cloudframe.app.global.sharedvar.Ip0040iMpePeRecData;
  import com.cloudframe.app.global.sharedvar.Ip00404ArRangeEntries;
  import com.cloudframe.app.global.sharedvar.Ip0040iMpePeRecDataCs;
  import com.cloudframe.app.process.Ip280510;
  import com.cloudframe.app.process.Ip783510;
  import java.math.BigDecimal;
  import com.cloudframe.app.global.sharedvar.Ip00754MccValsKey;
  import com.cloudframe.app.process.Ip282010;
  import java.math.RoundingMode;
  import com.cloudframe.app.process.Ip610010;
  import com.cloudframe.app.ip088030.dto.*;
  import com.cloudframe.app.ip088030.dto.InternalTblCnt600;
  import com.cloudframe.app.ip088030.dto.HoldVariables800;
  import com.cloudframe.app.ip088030.file.records.Sys002CntlIchgRec;
  import com.cloudframe.app.ip088030.file.records.Sys001TjfIp370Rec;
  import com.cloudframe.app.ip088030.dto.AbendPara900;
  import com.cloudframe.app.ip088030.dto.IchgCalcVars800;
  import com.cloudframe.app.ip088030.dto.MsgsRead600;
  import com.cloudframe.app.ip088030.file.records.Sys201OutputRecord;
  import com.cloudframe.app.ip088030.dto.AbendMessage600;
  import com.cloudframe.app.global.sharedvar.Ip0040iAccountRangeInfo;
  import com.cloudframe.app.ip088030.dto.MsgsWrite600;
  import com.cloudframe.app.ip088030.dto.AbendMessage900;
  import com.cloudframe.app.ip088030.dto.SrceTrgCurExpErr0rMsg600;
  import com.cloudframe.app.global.sharedvar.Ip08101RunControlRecord;
  import com.cloudframe.app.global.sharedvar.Ip00164TableEntry;
  import com.cloudframe.app.global.sharedvar.Ip00164EntryFoundGroup;
  import com.cloudframe.app.global.sharedvar.Ip00174TableEntry;
  import com.cloudframe.app.global.sharedvar.Ip00174EntryFoundGroup;
  import com.cloudframe.app.global.sharedvar.Ip00404Table;
  import com.cloudframe.app.global.sharedvar.Ip00754TableEntry;
  import com.cloudframe.app.global.sharedvar.Ip00754EntryFoundGroup;
  import com.cloudframe.app.global.sharedvar.Ip00754SearchCriteriaGroup;
  import com.cloudframe.app.global.sharedvar.Ip33701CurrConvInterface;
  import com.cloudframe.app.global.sharedvar.Ip50005OneDayRecLthGroup;
  import com.cloudframe.app.global.sharedvar.Ip50005OneDayRec;
  import com.cloudframe.app.global.sharedvar.Ip50005OneDayReadStatusGroup;
  import com.cloudframe.app.global.sharedvar.Ip50005ClearingDtTm;
  import com.cloudframe.app.global.sharedvar.Ip60001EventLogWorkArea;
  import com.cloudframe.app.global.sharedvar.Ip996011ProgramStartMessage;
  import com.cloudframe.app.ip088030.dto.IchgFeeRecords500;
  import com.cloudframe.app.ip088030.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("ip088030")
  
  public class Ip088030 extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Ip088030.class);
  
  private InternalTblCnt600 internalTblCnt600 = new InternalTblCnt600() ;
  private HoldVariables800 holdVariables800 = new HoldVariables800() ;
  private Sys002CntlIchgRec sys002CntlIchgRec = new Sys002CntlIchgRec() ;
  private Sys001TjfIp370Rec sys001TjfIp370Rec = new Sys001TjfIp370Rec() ;
  private AbendPara900 abendPara900 = new AbendPara900() ;
  private IchgCalcVars800 ichgCalcVars800 = new IchgCalcVars800() ;
  private MsgsRead600 msgsRead600 = new MsgsRead600() ;
  private Sys201OutputRecord sys201OutputRecord = new Sys201OutputRecord() ;
  private AbendMessage600 abendMessage600 = new AbendMessage600() ;
  private MsgsWrite600 msgsWrite600 = new MsgsWrite600() ;
  private AbendMessage900 abendMessage900 = new AbendMessage900() ;
  private SrceTrgCurExpErr0rMsg600 srceTrgCurExpErr0rMsg600 = new SrceTrgCurExpErr0rMsg600() ;
  private IchgFeeRecords500 ichgFeeRecords500 = new IchgFeeRecords500() ;
  private Work work = new Work() ;
  
  @Value("${timeZoneId:Etc/GMT}")
  private String timeZoneId;
  
  
  @Autowired 
  @Qualifier("ip088030_sys001TjfIp370File")
  Sys001TjfIp370File sys001TjfIp370File;
  @Autowired 
  @Qualifier("ip088030_sys002CntlIchgFile")
  Sys002CntlIchgFile sys002CntlIchgFile;
  @Autowired 
  @Qualifier("ip088030_sys201OutputFile")
  Sys201OutputFile sys201OutputFile;
  @Autowired 
  @Qualifier("ip288010")
  Ip288010 ip288010;
  @Autowired 
  @Qualifier("ip280510")
  Ip280510 ip280510;
  @Autowired 
  @Qualifier("ip783510")
  Ip783510 ip783510;
  @Autowired 
  @Qualifier("ip282010")
  Ip282010 ip282010;
  @Autowired 
  @Qualifier("global_ip0040iAccountRangeInfo")
  Ip0040iAccountRangeInfo ip0040iAccountRangeInfo;
  @Autowired 
  @Qualifier("global_ip00164TableEntry")
  Ip00164TableEntry ip00164TableEntry;
  @Autowired 
  @Qualifier("global_ip00164EntryFoundGroup")
  Ip00164EntryFoundGroup ip00164EntryFoundGroup;
  @Autowired 
  @Qualifier("global_ip00174TableEntry")
  Ip00174TableEntry ip00174TableEntry;
  @Autowired 
  @Qualifier("global_ip00174EntryFoundGroup")
  Ip00174EntryFoundGroup ip00174EntryFoundGroup;
  @Autowired 
  @Qualifier("global_ip00754TableEntry")
  Ip00754TableEntry ip00754TableEntry;
  @Autowired 
  @Qualifier("global_ip00754EntryFoundGroup")
  Ip00754EntryFoundGroup ip00754EntryFoundGroup;
  @Autowired 
  @Qualifier("global_ip00754SearchCriteriaGroup")
  Ip00754SearchCriteriaGroup ip00754SearchCriteriaGroup;
  @Autowired 
  @Qualifier("global_ip33701CurrConvInterface")
  Ip33701CurrConvInterface ip33701CurrConvInterface;
  
  
  
  int ichgIdx500;
  int sys201CalcFIdx;
  int ip00404AcctRngIndex;
  
  
  
      /**
      * process 
      * Input  :  

      * - sys001FileStatus200            COBOL Name: 200-SYS001-FILE-STATUS
      *
      * Output : None 

      * @throws CFException
      */
      @Override
      public int process() throws Exception {
       initVars();
       try {
       setCodePage("1047");
//  PERFORM 1000-DO-INITIALIZATION
          doInitialization();/*1000-DO-INITIALIZATION*/
          if (this.isProgramEnded()) {
              return getRc();
          }
//  PERFORM 8000-READ-SYS001-FILE
          readSys001File();/*8000-READ-SYS001-FILE*/
          if (this.isProgramEnded()) {
              return getRc();
          }
//  PERFORM 2000-PROCESS-INPUT-FILE UNTIL 88-200-SYS001-EOF
          while (!(work.isSys001Eof88200()) ) {
             processInputFile();/*2000-PROCESS-INPUT-FILE*/
             if (this.isProgramEnded()) {
                 return getRc();
             }
          }
//  PERFORM 3000-CLOSE-FILES
          closeFiles();/*3000-CLOSE-FILES*/
          if (this.isProgramEnded()) {
              return getRc();
          }
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          this.setProgramEnded(true);
          return getRc();
       } catch(Exception e) {
            handleErrorCode(e);
            throw e;
       }
        finally {
      		if(sys001TjfIp370File.hasOpened() && !sys001TjfIp370File.isReadOnly()) { 
      			sys001TjfIp370File.flush(); 
      		}
      		if(sys002CntlIchgFile.hasOpened() && !sys002CntlIchgFile.isReadOnly()) { 
      			sys002CntlIchgFile.flush(); 
      		}
      		if(sys201OutputFile.hasOpened() && !sys201OutputFile.isReadOnly()) { 
      			sys201OutputFile.flush(); 
      		}
      }
      
      // end of process method
      }
      /**
      * doInitialization 
      *   This method is derived from 
  *   COBOL Paragraph - 1000-DO-INITIALIZATION COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sys002FileStatus200            COBOL Name: 200-SYS002-FILE-STATUS
      *
      * Output :  

      * - ichgEntriesCnt500              COBOL Name: 500-ICHG-ENTRIES-CNT
      *
      * @throws CFException
      */
      private void doInitialization() throws Exception {
      
// *--------------------------------------------------------------*
// *Startup routine to perform initialization
// *--------------------------------------------------------------*
//  MOVE ZEROES TO 500-ICHG-ENTRIES-CNT
          ichgFeeRecords500.setIchgEntriesCnt500((short) 0);
//  PERFORM 1100-DISPLAY-EXEC-MSGS
          displayExecMsgs();/*1100-DISPLAY-EXEC-MSGS*/
//  PERFORM 1200-SET-PROCEDURE-POINTERS
          setProcedurePointers();/*1200-SET-PROCEDURE-POINTERS*/
//  PERFORM 1300-OPEN-ALL-FILES
          openAllFiles();/*1300-OPEN-ALL-FILES*/
//  PERFORM 1400-CALL-RUNCNTL-API
          callRuncntlApi();/*1400-CALL-RUNCNTL-API*/
//  PERFORM 8100-READ-SYS002-FILE
          readSys002File();/*8100-READ-SYS002-FILE*/
//  PERFORM 1500-LOAD-ICHG-FEE-TABLE UNTIL 88-200-SYS002-EOF
          while (!(work.isSys002Eof88200()) ) {
             loadIchgFeeTable();/*1500-LOAD-ICHG-FEE-TABLE*/
          }
          ;
      
      }
      /**
      * displayExecMsgs 
      *   This method is derived from 
  *   COBOL Paragraph - 1100-DISPLAY-EXEC-MSGS COBOL Cyclomatic complexity - 2
      * Input  :  

      * - pgmIp996010300                 COBOL Name: 300-PGM-IP996010
      * - pgmId300                       COBOL Name: 300-PGM-ID
      * - pgmVersion300                  COBOL Name: 300-PGM-VERSION
      *
      * Output :  

      * - ptrIp996010800                 COBOL Name: 800-PTR-IP996010
      * - ip996011PgmId                  COBOL Name: IP996011-PGM-ID
      * - pgmId300                       COBOL Name: 300-PGM-ID
      * - ip996011PgmVersion             COBOL Name: IP996011-PGM-VERSION
      * - pgmVersion300                  COBOL Name: 300-PGM-VERSION
      * - ip996011WhenCompiled           COBOL Name: IP996011-WHEN-COMPILED
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      private void displayExecMsgs() throws Exception {
      
// *--------------------------------------------------------------*
// *This paragraph displays execution messages.                   *
// *--------------------------------------------------------------*
//  SET 800-PTR-IP996010 TO ENTRY 300-PGM-IP996010
          work.setPtrIp996010800(work.getPgmIp996010300()); 
          
//  MOVE 300-PGM-ID TO IP996011-PGM-ID
          ip996011ProgramStartMessage.setIp996011PgmId(work.getPgmId300());
//  MOVE 300-PGM-VERSION TO IP996011-PGM-VERSION
          ip996011ProgramStartMessage.setIp996011PgmVersion(work.getPgmVersion300());
          // MOVE WHEN-COMPILED TO IP996011-WHEN-COMPILED
          //  FORMAT1311677340 = "X(08)BX(08)"
          ip996011ProgramStartMessage.setIp996011WhenCompiled(CFUtil.cobolAnEditFormatter(CONSTANTS.FORMAT1311677340,CONSTANTS.LITERAL_1821800699));
//  CALL 800-PTR-IP996010
          // CALL 800-PTR-IP996010
          	this.setRc( ip996010.process());
      
      }
      /**
      * setProcedurePointers 
      *   This method is derived from 
  *   COBOL Paragraph - 1200-SET-PROCEDURE-POINTERS COBOL Cyclomatic complexity - 8
      * Input  :  

      * - pgmIp610010300                 COBOL Name: 300-PGM-IP610010
      * - pgmIp081110300                 COBOL Name: 300-PGM-IP081110
      * - pgmIp280010300                 COBOL Name: 300-PGM-IP280010
      * - pgmIp280510300                 COBOL Name: 300-PGM-IP280510
      * - pgmIp282010300                 COBOL Name: 300-PGM-IP282010
      * - pgmIp288010300                 COBOL Name: 300-PGM-IP288010
      * - pgmIp783510300                 COBOL Name: 300-PGM-IP783510
      *
      * Output :  

      * - ptrIp610010800                 COBOL Name: 800-PTR-IP610010
      * - ptrIp081110800                 COBOL Name: 800-PTR-IP081110
      * - ptrIp280010800                 COBOL Name: 800-PTR-IP280010
      * - ptrIp280510800                 COBOL Name: 800-PTR-IP280510
      * - ptrIp282010800                 COBOL Name: 800-PTR-IP282010
      * - ptrIp288010800                 COBOL Name: 800-PTR-IP288010
      * - ptrIp783510800                 COBOL Name: 800-PTR-IP783510
      *
      * @throws CFException
      */
      private void setProcedurePointers() throws Exception {
      
// *--------------------------------------------------------------*
// *This paragraph sets procedure pointers.
// *--------------------------------------------------------------*
//  SET 800-PTR-IP610010 TO ENTRY 300-PGM-IP610010
          work.setPtrIp610010800(work.getPgmIp610010300()); 
          
//  SET 800-PTR-IP081110 TO ENTRY 300-PGM-IP081110
          work.setPtrIp081110800(work.getPgmIp081110300()); 
          
//  SET 800-PTR-IP280010 TO ENTRY 300-PGM-IP280010
          work.setPtrIp280010800(work.getPgmIp280010300()); 
          
//  SET 800-PTR-IP280510 TO ENTRY 300-PGM-IP280510
          work.setPtrIp280510800(work.getPgmIp280510300()); 
          
//  SET 800-PTR-IP282010 TO ENTRY 300-PGM-IP282010
          work.setPtrIp282010800(work.getPgmIp282010300()); 
          
//  SET 800-PTR-IP288010 TO ENTRY 300-PGM-IP288010
          work.setPtrIp288010800(work.getPgmIp288010300()); 
          
//  SET 800-PTR-IP783510 TO ENTRY 300-PGM-IP783510
          work.setPtrIp783510800(work.getPgmIp783510300()); 
          
      
      }
      /**
      * openAllFiles 
      *   This method is derived from 
  *   COBOL Paragraph - 1300-OPEN-ALL-FILES COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void openAllFiles() throws Exception {
      
// *--------------------------------------------------------------*
// *This paragraph opens the input and output file.
// *--------------------------------------------------------------*
//  PERFORM 1310-OPEN-INPUT-SYS001
          openInputSys001();/*1310-OPEN-INPUT-SYS001*/
//  PERFORM 1320-OPEN-INPUT-SYS002
          openInputSys002();/*1320-OPEN-INPUT-SYS002*/
//  PERFORM 1330-OPEN-OUTPUT-SYS201
          openOutputSys201();/*1330-OPEN-OUTPUT-SYS201*/
          ;
      
      }
      /**
      * openInputSys001 
      *   This method is derived from 
  *   COBOL Paragraph - 1310-OPEN-INPUT-SYS001 COBOL Cyclomatic complexity - 2
      * Input  :  

      * - abendMessage600                COBOL Name: 600-ABEND-MESSAGE
      *
      * Output :  

      * - sys001FileStatus200            COBOL Name: 200-SYS001-FILE-STATUS
      * - sys002FileStatus200            COBOL Name: 200-SYS002-FILE-STATUS
      * - sys201FileStatus200            COBOL Name: 200-SYS201-FILE-STATUS
      * - abendCode300                   COBOL Name: 300-ABEND-CODE
      * - abendParaName300               COBOL Name: 300-ABEND-PARA-NAME
      * - abendDescription600            COBOL Name: 600-ABEND-DESCRIPTION
      * - fileStatus600                  COBOL Name: 600-FILE-STATUS
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - abendMessage600                COBOL Name: 600-ABEND-MESSAGE
      * - abendParaName900               COBOL Name: 900-ABEND-PARA-NAME
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      *
      * @throws CFException
      */
      private void openInputSys001() throws Exception {
      
// *--------------------------------------------------------------*
// *This paragraph opens the input sys001.
// *--------------------------------------------------------------*
//  OPEN INPUT SYS001-TJF-IP370-FILE
          sys001TjfIp370File.open(new String(CONSTANTS.MODE_READ_ONLY_36242),sys001TjfIp370File.getFileName(),sys001TjfIp370File.getSys001TjfIp370FileCharSet(),sys001TjfIp370File.getSys001TjfIp370FileCrlfFlag());
          work.setSys001FileStatus200(sys001TjfIp370File.getStatusString() );
//  IF 88-200-SYS001-IO-GOOD
//  ELSE
          if (!(work.isSys001IoGood88200()) ) { 
//  SET 88-300-OPEN-ABEND-CODE TO TRUE
              work.setOpenAbendCode88300True(); 
              
//  SET 88-300-ABEND-PARA-1310 TO TRUE
              work.setAbendPara131088300True(); 
              
//  SET 88-600-ABEND-OPEN-SYS001 TO TRUE
              abendMessage600.setAbendOpenSys00188600True(); 
              
//  MOVE 200-SYS001-FILE-STATUS TO 600-FILE-STATUS
              abendMessage600.setFileStatus600(work.getSys001FileStatus200());
              // MOVE 600-ABEND-MESSAGE TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(abendMessage600.toCharArray());
//  MOVE 300-ABEND-PARA-NAME TO 900-ABEND-PARA-NAME
              abendPara900.setAbendParaName900(work.getAbendParaName300());
//  MOVE 300-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(String.valueOf(work.getAbendCode300String()).toCharArray());
//  PERFORM 9500-ABEND-PROGRAM
              abendProgram();/*9500-ABEND-PROGRAM*/
          }
      
      }
      /**
      * openInputSys002 
      *   This method is derived from 
  *   COBOL Paragraph - 1320-OPEN-INPUT-SYS002 COBOL Cyclomatic complexity - 2
      * Input  :  

      * - abendMessage600                COBOL Name: 600-ABEND-MESSAGE
      *
      * Output :  

      * - sys001FileStatus200            COBOL Name: 200-SYS001-FILE-STATUS
      * - sys002FileStatus200            COBOL Name: 200-SYS002-FILE-STATUS
      * - sys201FileStatus200            COBOL Name: 200-SYS201-FILE-STATUS
      * - abendCode300                   COBOL Name: 300-ABEND-CODE
      * - abendParaName300               COBOL Name: 300-ABEND-PARA-NAME
      * - abendDescription600            COBOL Name: 600-ABEND-DESCRIPTION
      * - fileStatus600                  COBOL Name: 600-FILE-STATUS
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - abendMessage600                COBOL Name: 600-ABEND-MESSAGE
      * - abendParaName900               COBOL Name: 900-ABEND-PARA-NAME
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      *
      * @throws CFException
      */
      private void openInputSys002() throws Exception {
      
// *--------------------------------------------------------------*
// *This paragraph opens the input sys002.
// *--------------------------------------------------------------*
//  OPEN INPUT SYS002-CNTL-ICHG-FILE
          sys002CntlIchgFile.open(new String(CONSTANTS.MODE_READ_ONLY_36242),sys002CntlIchgFile.getFileName(),sys002CntlIchgFile.getSys002CntlIchgFileCharSet(),sys002CntlIchgFile.getSys002CntlIchgFileCrlfFlag());
          work.setSys002FileStatus200(sys002CntlIchgFile.getStatusString() );
//  IF 88-200-SYS002-IO-GOOD
//  ELSE
          if (!(work.isSys002IoGood88200()) ) { 
//  SET 88-300-OPEN-ABEND-CODE TO TRUE
              work.setOpenAbendCode88300True(); 
              
//  SET 88-300-ABEND-PARA-1320 TO TRUE
              work.setAbendPara132088300True(); 
              
//  SET 88-600-ABEND-OPEN-SYS002 TO TRUE
              abendMessage600.setAbendOpenSys00288600True(); 
              
//  MOVE 200-SYS002-FILE-STATUS TO 600-FILE-STATUS
              abendMessage600.setFileStatus600(work.getSys002FileStatus200());
              // MOVE 600-ABEND-MESSAGE TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(abendMessage600.toCharArray());
//  MOVE 300-ABEND-PARA-NAME TO 900-ABEND-PARA-NAME
              abendPara900.setAbendParaName900(work.getAbendParaName300());
//  MOVE 300-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(String.valueOf(work.getAbendCode300String()).toCharArray());
//  PERFORM 9500-ABEND-PROGRAM
              abendProgram();/*9500-ABEND-PROGRAM*/
          }
      
      }
      /**
      * openOutputSys201 
      *   This method is derived from 
  *   COBOL Paragraph - 1330-OPEN-OUTPUT-SYS201 COBOL Cyclomatic complexity - 2
      * Input  :  

      * - abendMessage600                COBOL Name: 600-ABEND-MESSAGE
      *
      * Output :  

      * - sys001FileStatus200            COBOL Name: 200-SYS001-FILE-STATUS
      * - sys002FileStatus200            COBOL Name: 200-SYS002-FILE-STATUS
      * - sys201FileStatus200            COBOL Name: 200-SYS201-FILE-STATUS
      * - abendCode300                   COBOL Name: 300-ABEND-CODE
      * - abendParaName300               COBOL Name: 300-ABEND-PARA-NAME
      * - abendDescription600            COBOL Name: 600-ABEND-DESCRIPTION
      * - fileStatus600                  COBOL Name: 600-FILE-STATUS
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - abendMessage600                COBOL Name: 600-ABEND-MESSAGE
      * - abendParaName900               COBOL Name: 900-ABEND-PARA-NAME
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      *
      * @throws CFException
      */
      private void openOutputSys201() throws Exception {
      
// *--------------------------------------------------------------*
// *This paragraph opens the output sys201.
// *--------------------------------------------------------------*
//  OPEN OUTPUT SYS201-OUTPUT-FILE
          sys201OutputFile.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),sys201OutputFile.getFileName(),sys201OutputFile.getSys201OutputFileCharSet(),sys201OutputFile.getSys201OutputFileCrlfFlag());
          work.setSys201FileStatus200(sys201OutputFile.getStatusString() );
//  IF 88-200-SYS201-IO-GOOD
//  ELSE
          if (!(work.isSys201IoGood88200()) ) { 
//  SET 88-300-OPEN-ABEND-CODE TO TRUE
              work.setOpenAbendCode88300True(); 
              
//  SET 88-300-ABEND-PARA-1330 TO TRUE
              work.setAbendPara133088300True(); 
              
//  SET 88-600-ABEND-OPEN-SYS201 TO TRUE
              abendMessage600.setAbendOpenSys20188600True(); 
              
//  MOVE 200-SYS201-FILE-STATUS TO 600-FILE-STATUS
              abendMessage600.setFileStatus600(work.getSys201FileStatus200());
              // MOVE 600-ABEND-MESSAGE TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(abendMessage600.toCharArray());
//  MOVE 300-ABEND-PARA-NAME TO 900-ABEND-PARA-NAME
              abendPara900.setAbendParaName900(work.getAbendParaName300());
//  MOVE 300-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(String.valueOf(work.getAbendCode300String()).toCharArray());
//  PERFORM 9500-ABEND-PROGRAM
              abendProgram();/*9500-ABEND-PROGRAM*/
          }
      
      }
      /**
      * callRuncntlApi 
      *   This method is derived from 
  *   COBOL Paragraph - 1400-CALL-RUNCNTL-API COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ip08101ProcessDate             COBOL Name: IP08101-PROCESS-DATE
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      * - ip50005ClearingDt              COBOL Name: IP50005-CLEARING-DT
      * - ip08101ProcessDate             COBOL Name: IP08101-PROCESS-DATE
      * - ip50005ClearingTm              COBOL Name: IP50005-CLEARING-TM
      *
      * @throws CFException
      */
      private void callRuncntlApi() throws Exception {
      
// *--------------------------------------------------------------*
// *This paragraph calls runcontrol api.
// *--------------------------------------------------------------*
//  CALL 800-PTR-IP081110
          // CALL 800-PTR-IP081110
          	this.setRc( ip081110.process());
//  IF RETURN-CODE EQUAL ZEROES
          if (	( getRc() == 0 )) { 
//  MOVE IP08101-PROCESS-DATE TO IP50005-CLEARING-DT
              ip50005ClearingDtTm.setIp50005ClearingDt(String.valueOf(ip08101RunControlRecord.getIp08101ProcessDateString()).toCharArray());
              // MOVE 14 TO IP50005-CLEARING-TM
              //  LITERAL_14 = 14
              ip50005ClearingDtTm.setIp50005ClearingTm(CONSTANTS.LITERAL_14);
          }
//  ELSE
          else { 
//  MOVE FUNCTION CURRENT-DATE TO IP50005-CLEARING-DT
              ip50005ClearingDtTm.setIp50005ClearingDt( substring(CFUtil.getCurrentDate(timeZoneId),0,8));
              // MOVE 14 TO IP50005-CLEARING-TM
              //  LITERAL_14 = 14
              ip50005ClearingDtTm.setIp50005ClearingTm(CONSTANTS.LITERAL_14);
          }
      
      }
      /**
      * loadIchgFeeTable 
      *   This method is derived from 
  *   COBOL Paragraph - 1500-LOAD-ICHG-FEE-TABLE COBOL Cyclomatic complexity - 3
      * Input  :  

      * - ichgEntriesCnt500              COBOL Name: 500-ICHG-ENTRIES-CNT
      * - ichgEntriesMax500              COBOL Name: 500-ICHG-ENTRIES-MAX
      * - ip98153RecType                 COBOL Name: IP98153-REC-TYPE
      * - sys002CntlIchgRec              COBOL Name: SYS002-CNTL-ICHG-REC
      * - abendMsgTblErr600              COBOL Name: 600-ABEND-MSG-TBL-ERR
      *
      * Output :  

      * - ichgEntriesCnt500              COBOL Name: 500-ICHG-ENTRIES-CNT
      * - ichgIdx500                     COBOL Name: 500-ICHG-IDX
      * - ichgEntry500                   COBOL Name: 500-ICHG-ENTRY
      * - sys002CntlIchgRec              COBOL Name: SYS002-CNTL-ICHG-REC
      * - abendCode300                   COBOL Name: 300-ABEND-CODE
      * - abendParaName300               COBOL Name: 300-ABEND-PARA-NAME
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - abendMsgTblErr600              COBOL Name: 600-ABEND-MSG-TBL-ERR
      * - abendParaName900               COBOL Name: 900-ABEND-PARA-NAME
      *
      * @throws CFException
      */
      private void loadIchgFeeTable() throws Exception {
			// Declare local variables used in the method
			short ichgEntriesCnt500 = 0;
			short ichgEntriesMax500 = 0;
			// End of variable declaration

      
// *--------------------------------------------------------------*
// *Loads all internal table entries                              *
// *--------------------------------------------------------------*
          ichgEntriesMax500 = ichgFeeRecords500.getIchgEntriesMax500();
          ichgEntriesCnt500 = ichgFeeRecords500.getIchgEntriesCnt500();
//  IF 500-ICHG-ENTRIES-CNT LESS THAN 500-ICHG-ENTRIES-MAX
          if (	( ichgEntriesCnt500 < ichgEntriesMax500 )) { 
//  ADD 1 TO 500-ICHG-ENTRIES-CNT
              ichgFeeRecords500.setIchgEntriesCnt500( (short) (ichgFeeRecords500.getIchgEntriesCnt500()+(short)1));
//  SET 500-ICHG-IDX TO 500-ICHG-ENTRIES-CNT
              ichgIdx500 = ichgFeeRecords500.getIchgEntriesCnt500(); 
              
//  IF IP98153-88-VALID-REC-TYPE
              if ( sys002CntlIchgRec.isIp9815388ValidRecType()  ) { 
//  MOVE SYS002-CNTL-ICHG-REC TO 500-ICHG-ENTRY ( 500-ICHG-IDX )
                  ichgFeeRecords500.setIchgEntry500((ichgIdx500 - 1),sys002CntlIchgRec.getCharArray());
              }
          }
  
//  ELSE
          else { 
//  SET 88-300-TBL-ABEND-CODE TO TRUE
              work.setTblAbendCode88300True(); 
              
//  SET 88-300-ABEND-PARA-1500 TO TRUE
              work.setAbendPara150088300True(); 
              
//  MOVE 300-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(String.valueOf(work.getAbendCode300String()).toCharArray());
//  MOVE 600-ABEND-MSG-TBL-ERR TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(pad(66,work.getAbendMsgTblErr600(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-ABEND-PARA-NAME TO 900-ABEND-PARA-NAME
              abendPara900.setAbendParaName900(work.getAbendParaName300());
//  PERFORM 9500-ABEND-PROGRAM
              abendProgram();/*9500-ABEND-PROGRAM*/
          }
//  PERFORM 8100-READ-SYS002-FILE
          readSys002File();/*8100-READ-SYS002-FILE*/
          ;
      
      }
      /**
      * processInputFile 
      *   This method is derived from 
  *   COBOL Paragraph - 2000-PROCESS-INPUT-FILE COBOL Cyclomatic complexity - 3
      * Input  :  

      * - ip98151TjfMrchAddr             COBOL Name: IP98151-TJF-MRCH-ADDR
      * - valueD300                      COBOL Name: 300-VALUE-D
      *
      * Output :  

      * - ichgCalcVars800                COBOL Name: 800-ICHG-CALC-VARS
      * - holdVariables800               COBOL Name: 800-HOLD-VARIABLES
      * - isTxnQualify100                COBOL Name: 100-IS-TXN-QUALIFY
      * - isArRecFound100                COBOL Name: 100-IS-AR-REC-FOUND
      * - isIchgCalculated100            COBOL Name: 100-IS-ICHG-CALCULATED
      * - fundPan800                     COBOL Name: 800-FUND-PAN
      * - ip98151TjfMrchAddr             COBOL Name: IP98151-TJF-MRCH-ADDR
      * - mccCode800                     COBOL Name: 800-MCC-CODE
      * - mccCodeX800                    COBOL Name: 800-MCC-CODE-X
      * - maid800                        COBOL Name: 800-MAID
      * - ip00164ProdCatCd               COBOL Name: IP00164-PROD-CAT-CD
      * - valueD300                      COBOL Name: 300-VALUE-D
      *
      * @throws CFException
      */
      private void processInputFile() throws Exception {
			// Declare local variables used in the method
			Ip98151RecordPart1 ip98151RecordPart1 = sys001TjfIp370Rec.getIp98151RecordPart1();
			char[] ip98151TjfMrchAddr = null;
			Ip00164TableData ip00164TableData = ip00164TableEntry.getIp00164TableData();
			// End of variable declaration

      
// *--------------------------------------------------------------*
// *This paragraph processes the input file.                      *
// *--------------------------------------------------------------*
//  MOVE ZEROES TO 800-ICHG-CALC-VARS
          ichgCalcVars800.setString(CONSTANTS.ZERO_183);
//  MOVE SPACES TO 800-HOLD-VARIABLES
          holdVariables800.setString(CONSTANTS.SPACE_30);
//  SET 88-100-TXN-QUALIFY-N 88-100-AR-REC-NOT-FOUND 88-100-ICHG-CALCULATED-N TO TRUE
          work.setTxnQualifyN88100True(); 
          
          work.setArRecNotFound88100True(); 
          
          work.setIchgCalculatedN88100True(); 
          
          ip98151TjfMrchAddr = ip98151RecordPart1.getIp98151TjfMrchAddr();
//  IF IP98151-TJF-MRCH-ADDR (01 : 10) IS NUMERIC
          if (    isNumeric(substring(ip98151TjfMrchAddr,0,10))) { 
//  MOVE IP98151-TJF-MRCH-ADDR (01 : 10) TO 800-FUND-PAN
              holdVariables800.replace(sys001TjfIp370Rec/*parent*/,95/*fromOffset - (fundPan800) */,10/*fromLen*/,0/*toOffset - (ip98151TjfMrchAddr) */,10/*toLen*/);
//  MOVE IP98151-TJF-MRCH-ADDR (11 : 04) TO 800-MCC-CODE 800-MCC-CODE-X
              holdVariables800.replace(sys001TjfIp370Rec/*parent*/,95+11 - 1/*fromOffset - (mccCode800) */,4/*fromLen*/,10/*toOffset - (ip98151TjfMrchAddr) */,4/*toLen*/);
              holdVariables800.replace(sys001TjfIp370Rec/*parent*/,95+11 - 1/*fromOffset - (mccCodeX800) */,4/*fromLen*/,20/*toOffset - (ip98151TjfMrchAddr) */,4/*toLen*/);
//  MOVE IP98151-TJF-MRCH-ADDR (15 : 06) TO 800-MAID
              holdVariables800.replace(sys001TjfIp370Rec/*parent*/,95+15 - 1/*fromOffset - (maid800) */,6/*fromLen*/,24/*toOffset - (ip98151TjfMrchAddr) */,6/*toLen*/);
//  PERFORM 8200-DETERMINE-TXN-TYPE
              determineTxnType();/*8200-DETERMINE-TXN-TYPE*/
          }
  
//  IF 88-100-ICHG-CALCULATED-N
          if ( work.isIchgCalculatedN88100()  ) { 
//  MOVE 300-VALUE-D TO IP00164-PROD-CAT-CD
              ip00164TableData.setIp00164ProdCatCd(work.getValueD300());
  
//  PERFORM 2200-SEARCH-DEFAULT-RATE
              searchDefaultRate();/*2200-SEARCH-DEFAULT-RATE*/
//  PERFORM 8600-CALCULATE-ICHG-AMT
              calculateIchgAmt();/*8600-CALCULATE-ICHG-AMT*/
          }
//  PERFORM 2100-WRITE-SYS201
          writeSys201();/*2100-WRITE-SYS201*/
//  PERFORM 8000-READ-SYS001-FILE
          readSys001File();/*8000-READ-SYS001-FILE*/
          ;
      
      }
      /**
      * writeSys201 
      *   This method is derived from 
  *   COBOL Paragraph - 2100-WRITE-SYS201 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - fundProdId800                  COBOL Name: 800-FUND-PROD-ID
      * - fundPan800                     COBOL Name: 800-FUND-PAN
      * - mccCodeX800                    COBOL Name: 800-MCC-CODE-X
      *
      * Output :  

      * - ip98152FundProdId              COBOL Name: IP98152-FUND-PROD-ID
      * - fundProdId800                  COBOL Name: 800-FUND-PROD-ID
      * - ip98152FundAcctNum             COBOL Name: IP98152-FUND-ACCT-NUM
      * - fundPan800                     COBOL Name: 800-FUND-PAN
      * - ip98152ActualMcc               COBOL Name: IP98152-ACTUAL-MCC
      * - mccCodeX800                    COBOL Name: 800-MCC-CODE-X
      *
      * @throws CFException
      */
      private void writeSys201() throws Exception {
			// Declare local variables used in the method
			Ip98152RecordPart2 ip98152RecordPart2 = sys001TjfIp370Rec.getIp98152RecordPart2();
			// End of variable declaration

      
// *--------------------------------------------------------------*
// *This paragraph writes to sys201                               *
// *--------------------------------------------------------------*
//  MOVE 800-FUND-PROD-ID TO IP98152-FUND-PROD-ID
          ip98152RecordPart2.setIp98152FundProdId(holdVariables800.getFundProdId800());
  
//  MOVE 800-FUND-PAN TO IP98152-FUND-ACCT-NUM
          ip98152RecordPart2.setIp98152FundAcctNum(holdVariables800.getFundPan800());
  
//  MOVE 800-MCC-CODE-X TO IP98152-ACTUAL-MCC
          ip98152RecordPart2.setIp98152ActualMcc(holdVariables800.getMccCodeX800());
  
//  PERFORM 2110-POPULATE-NEW-FEE-INFO
          populateNewFeeInfo();/*2110-POPULATE-NEW-FEE-INFO*/
//  PERFORM 2120-WRITE-OUTPUT-SYS201
          writeOutputSys201();/*2120-WRITE-OUTPUT-SYS201*/
          ;
      
      }
      /**
      * populateNewFeeInfo 
      *   This method is derived from 
  *   COBOL Paragraph - 2110-POPULATE-NEW-FEE-INFO COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void populateNewFeeInfo() throws Exception {
      
// *--------------------------------------------------------------*
// *This paragraph populates new fee info to ip981504 layout      *
// *--------------------------------------------------------------*
//  PERFORM 2111-DETERMINE-FEE-ACQ
          determineFeeAcq();/*2111-DETERMINE-FEE-ACQ*/
//  PERFORM 2112-DETERMINE-FEE-ISS
          determineFeeIss();/*2112-DETERMINE-FEE-ISS*/
          ;
      
      }
      /**
      * determineFeeAcq 
      *   This method is derived from 
  *   COBOL Paragraph - 2111-DETERMINE-FEE-ACQ COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ip98152ClrMbrCurCd             COBOL Name: IP98152-CLR-MBR-CUR-CD
      * - ip98152ClrTxnCurrCd            COBOL Name: IP98152-CLR-TXN-CURR-CD
      * - netAmt800                      COBOL Name: 800-NET-AMT
      * - ip98152ClrMbrCurExp            COBOL Name: IP98152-CLR-MBR-CUR-EXP
      * - ip33701TargetAmount            COBOL Name: IP33701-TARGET-AMOUNT
      * - minus1300                      COBOL Name: 300-MINUS-1
      * - ip00174CurExpCode              COBOL Name: IP00174-CUR-EXP-CODE
      *
      * Output :  

      * - sys201CalcFIdx                 COBOL Name: SYS201-CALC-F-IDX
      * - sys201CalcPayParty             COBOL Name: SYS201-CALC-PAY-PARTY
      * - sys201CalcFeeDrCrInd           COBOL Name: SYS201-CALC-FEE-DR-CR-IND
      * - sys201CalcFeeSetlCur           COBOL Name: SYS201-CALC-FEE-SETL-CUR
      * - ip98152ClrMbrCurCd             COBOL Name: IP98152-CLR-MBR-CUR-CD
      * - ip33701SrcAmt6Decimals         COBOL Name: IP33701-SRC-AMT-6-DECIMALS
      * - netAmt800                      COBOL Name: 800-NET-AMT
      * - ip33701TargetCurExp            COBOL Name: IP33701-TARGET-CUR-EXP
      * - ip98152ClrMbrCurExp            COBOL Name: IP98152-CLR-MBR-CUR-EXP
      * - sys201CalcFeeSetlAmt           COBOL Name: SYS201-CALC-FEE-SETL-AMT
      * - ip33701SourceAmount            COBOL Name: IP33701-SOURCE-AMOUNT
      * - ip33701SourceCurCode           COBOL Name: IP33701-SOURCE-CUR-CODE
      * - ip00174CurrCdKey               COBOL Name: IP00174-CURR-CD-KEY
      * - ip98152ClrTxnCurrCd            COBOL Name: IP98152-CLR-TXN-CURR-CD
      * - rc                             COBOL Name: RETURN-CODE
      * - ip33701SourceCurExp            COBOL Name: IP33701-SOURCE-CUR-EXP
      * - ip00174CurExpCode              COBOL Name: IP00174-CUR-EXP-CODE
      * - ip33701TargetCurCode           COBOL Name: IP33701-TARGET-CUR-CODE
      *
      * @throws CFException
      */
      private void determineFeeAcq() throws Exception {
			// Declare local variables used in the method
			Ip33701CurrConvOutput ip33701CurrConvOutput = ip33701CurrConvInterface.getIp33701CurrConvOutput();
			Ip33701CurrConvInput ip33701CurrConvInput = ip33701CurrConvInterface.getIp33701CurrConvInput();
			Ip98152RecordPart2 ip98152RecordPart2 = sys001TjfIp370Rec.getIp98152RecordPart2();
			char[] ip98152ClrTxnCurrCd = null;
			// End of variable declaration

      
// *--------------------------------------------------------------*
// *This paragraph populates fee layout for acquier setting it to *
// *have interchange debit.                                       *
// *--------------------------------------------------------------*
//  SET SYS201-CALC-F-IDX TO 1
          sys201CalcFIdx = 1; 
          
//  SET SYS201-88-PAY-PARTY-ACQ ( SYS201-CALC-F-IDX ) TO TRUE
          sys201OutputRecord.getSys201RecordPart3().getSys201CalcFeeInfo(sys201CalcFIdx - 1).setSys20188PayPartyAcqTrue(); 
          
//  SET SYS201-88-FEE-IND-DR ( SYS201-CALC-F-IDX ) TO TRUE
          sys201OutputRecord.getSys201RecordPart3().getSys201CalcFeeInfo(sys201CalcFIdx - 1).setSys20188FeeIndDrTrue(); 
          
//  MOVE IP98152-CLR-MBR-CUR-CD (1) TO SYS201-CALC-FEE-SETL-CUR ( SYS201-CALC-F-IDX )
          sys201OutputRecord.getSys201RecordPart3().getSys201CalcFeeInfo(sys201CalcFIdx - 1).setSys201CalcFeeSetlCur(CFUtil.getInt(sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(0).getIp98152ClrMbrCurCd()));
          ip98152ClrTxnCurrCd = ip98152RecordPart2.getIp98152ClrTxnCurrCd();
//  IF IP98152-CLR-MBR-CUR-CD (1) EQUAL IP98152-CLR-TXN-CURR-CD
          if (		compareChars(ip98152RecordPart2.getIp98152ClrSetlInfo(0).getIp98152ClrMbrCurCd(),ip98152ClrTxnCurrCd) == 0 ) { 
//  MOVE 800-NET-AMT TO IP33701-SRC-AMT-6-DECIMALS
              ip33701CurrConvOutput.setIp33701SrcAmt6Decimals(ichgCalcVars800.getNetAmt800());
  
//  MOVE IP98152-CLR-MBR-CUR-EXP (1) TO IP33701-TARGET-CUR-EXP
              ip33701CurrConvInput.setIp33701TargetCurExp(sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(0).getIp98152ClrMbrCurExp());
  
//  PERFORM 8400-ALIGN-AMT-TO-EXP
              alignAmtToExp();/*8400-ALIGN-AMT-TO-EXP*/
              sys201OutputRecord.getSys201RecordPart3().getSys201CalcFeeInfo(sys201CalcFIdx - 1).setSys201CalcFeeSetlAmt(ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701TargetAmount() * work.getMinus1300());
          }
  
//  ELSE
          else { 
//  MOVE 800-NET-AMT TO IP33701-SOURCE-AMOUNT
              ip33701CurrConvInput.setIp33701SourceAmount(ichgCalcVars800.getNetAmt800().longValue());
  
//  MOVE IP98152-CLR-TXN-CURR-CD TO IP33701-SOURCE-CUR-CODE IP00174-CURR-CD-KEY
              ip33701CurrConvInput.setIp33701SourceCurCode(padLeftZeros(3,ip98152RecordPart2.getIp98152ClrTxnCurrCd(),false));
              ip00174TableEntry.getIp00174CurrCdKey().setString(ip98152RecordPart2.getIp98152ClrTxnCurrCd());
  
//  CALL 800-PTR-IP288010
              // CALL 800-PTR-IP288010
              	this.setRc( ip288010.process());
//  MOVE IP00174-CUR-EXP-CODE TO IP33701-SOURCE-CUR-EXP
              ip33701CurrConvInput.setIp33701SourceCurExp(String.valueOf(ip00174TableEntry.getIp00174CurExpCodeString()).toCharArray());
  
//  MOVE IP98152-CLR-MBR-CUR-CD (1) TO IP33701-TARGET-CUR-CODE
              ip33701CurrConvInput.setIp33701TargetCurCode(CFUtil.getInt(sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(0).getIp98152ClrMbrCurCd()));
  
//  MOVE IP98152-CLR-MBR-CUR-EXP (1) TO IP33701-TARGET-CUR-EXP
              ip33701CurrConvInput.setIp33701TargetCurExp(sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(0).getIp98152ClrMbrCurExp());
  
//  PERFORM 8300-CALL-CURR-CONV-API
              callCurrConvApi();/*8300-CALL-CURR-CONV-API*/
              sys201OutputRecord.getSys201RecordPart3().getSys201CalcFeeInfo(sys201CalcFIdx - 1).setSys201CalcFeeSetlAmt(ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701TargetAmount() * work.getMinus1300());
          }
      
      }
      /**
      * determineFeeIss 
      *   This method is derived from 
  *   COBOL Paragraph - 2112-DETERMINE-FEE-ISS COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ip98152ClrMbrCurCd             COBOL Name: IP98152-CLR-MBR-CUR-CD
      * - ip98152ClrTxnCurrCd            COBOL Name: IP98152-CLR-TXN-CURR-CD
      * - netAmt800                      COBOL Name: 800-NET-AMT
      * - ip98152ClrMbrCurExp            COBOL Name: IP98152-CLR-MBR-CUR-EXP
      * - ip33701TargetAmount            COBOL Name: IP33701-TARGET-AMOUNT
      * - val1300                        COBOL Name: 300-VAL-1
      * - ip00174CurExpCode              COBOL Name: IP00174-CUR-EXP-CODE
      *
      * Output :  

      * - sys201CalcFIdx                 COBOL Name: SYS201-CALC-F-IDX
      * - sys201CalcPayParty             COBOL Name: SYS201-CALC-PAY-PARTY
      * - sys201CalcFeeDrCrInd           COBOL Name: SYS201-CALC-FEE-DR-CR-IND
      * - sys201CalcFeeSetlCur           COBOL Name: SYS201-CALC-FEE-SETL-CUR
      * - ip98152ClrMbrCurCd             COBOL Name: IP98152-CLR-MBR-CUR-CD
      * - ip33701SrcAmt6Decimals         COBOL Name: IP33701-SRC-AMT-6-DECIMALS
      * - netAmt800                      COBOL Name: 800-NET-AMT
      * - ip33701TargetCurExp            COBOL Name: IP33701-TARGET-CUR-EXP
      * - ip98152ClrMbrCurExp            COBOL Name: IP98152-CLR-MBR-CUR-EXP
      * - sys201CalcFeeSetlAmt           COBOL Name: SYS201-CALC-FEE-SETL-AMT
      * - ip33701SourceAmount            COBOL Name: IP33701-SOURCE-AMOUNT
      * - ip33701SourceCurCode           COBOL Name: IP33701-SOURCE-CUR-CODE
      * - ip00174CurrCdKey               COBOL Name: IP00174-CURR-CD-KEY
      * - ip98152ClrTxnCurrCd            COBOL Name: IP98152-CLR-TXN-CURR-CD
      * - rc                             COBOL Name: RETURN-CODE
      * - ip33701SourceCurExp            COBOL Name: IP33701-SOURCE-CUR-EXP
      * - ip00174CurExpCode              COBOL Name: IP00174-CUR-EXP-CODE
      * - ip33701TargetCurCode           COBOL Name: IP33701-TARGET-CUR-CODE
      *
      * @throws CFException
      */
      private void determineFeeIss() throws Exception {
			// Declare local variables used in the method
			Ip33701CurrConvOutput ip33701CurrConvOutput = ip33701CurrConvInterface.getIp33701CurrConvOutput();
			Ip33701CurrConvInput ip33701CurrConvInput = ip33701CurrConvInterface.getIp33701CurrConvInput();
			Ip98152RecordPart2 ip98152RecordPart2 = sys001TjfIp370Rec.getIp98152RecordPart2();
			char[] ip98152ClrTxnCurrCd = null;
			// End of variable declaration

      
// *--------------------------------------------------------------*
// *This paragraph populates fee layout for issuer setting it to  *
// *have interchange credit.                                      *
// *--------------------------------------------------------------*
//  SET SYS201-CALC-F-IDX TO 2
          sys201CalcFIdx = 2; 
          
//  SET SYS201-88-PAY-PARTY-ISS ( SYS201-CALC-F-IDX ) TO TRUE
          sys201OutputRecord.getSys201RecordPart3().getSys201CalcFeeInfo(sys201CalcFIdx - 1).setSys20188PayPartyIssTrue(); 
          
//  SET SYS201-88-FEE-IND-CR ( SYS201-CALC-F-IDX ) TO TRUE
          sys201OutputRecord.getSys201RecordPart3().getSys201CalcFeeInfo(sys201CalcFIdx - 1).setSys20188FeeIndCrTrue(); 
          
//  MOVE IP98152-CLR-MBR-CUR-CD (2) TO SYS201-CALC-FEE-SETL-CUR ( SYS201-CALC-F-IDX )
          sys201OutputRecord.getSys201RecordPart3().getSys201CalcFeeInfo(sys201CalcFIdx - 1).setSys201CalcFeeSetlCur(CFUtil.getInt(sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(1).getIp98152ClrMbrCurCd()));
          ip98152ClrTxnCurrCd = ip98152RecordPart2.getIp98152ClrTxnCurrCd();
//  IF IP98152-CLR-MBR-CUR-CD (2) EQUAL IP98152-CLR-TXN-CURR-CD
          if (		compareChars(ip98152RecordPart2.getIp98152ClrSetlInfo(1).getIp98152ClrMbrCurCd(),ip98152ClrTxnCurrCd) == 0 ) { 
//  MOVE 800-NET-AMT TO IP33701-SRC-AMT-6-DECIMALS
              ip33701CurrConvOutput.setIp33701SrcAmt6Decimals(ichgCalcVars800.getNetAmt800());
  
//  MOVE IP98152-CLR-MBR-CUR-EXP (2) TO IP33701-TARGET-CUR-EXP
              ip33701CurrConvInput.setIp33701TargetCurExp(sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(1).getIp98152ClrMbrCurExp());
  
//  PERFORM 8400-ALIGN-AMT-TO-EXP
              alignAmtToExp();/*8400-ALIGN-AMT-TO-EXP*/
              sys201OutputRecord.getSys201RecordPart3().getSys201CalcFeeInfo(sys201CalcFIdx - 1).setSys201CalcFeeSetlAmt(ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701TargetAmount() * work.getVal1300());
          }
  
//  ELSE
          else { 
//  MOVE 800-NET-AMT TO IP33701-SOURCE-AMOUNT
              ip33701CurrConvInput.setIp33701SourceAmount(ichgCalcVars800.getNetAmt800().longValue());
  
//  MOVE IP98152-CLR-TXN-CURR-CD TO IP33701-SOURCE-CUR-CODE IP00174-CURR-CD-KEY
              ip33701CurrConvInput.setIp33701SourceCurCode(padLeftZeros(3,ip98152RecordPart2.getIp98152ClrTxnCurrCd(),false));
              ip00174TableEntry.getIp00174CurrCdKey().setString(ip98152RecordPart2.getIp98152ClrTxnCurrCd());
  
//  CALL 800-PTR-IP288010
              // CALL 800-PTR-IP288010
              	this.setRc( ip288010.process());
//  MOVE IP00174-CUR-EXP-CODE TO IP33701-SOURCE-CUR-EXP
              ip33701CurrConvInput.setIp33701SourceCurExp(String.valueOf(ip00174TableEntry.getIp00174CurExpCodeString()).toCharArray());
  
//  MOVE IP98152-CLR-MBR-CUR-CD (2) TO IP33701-TARGET-CUR-CODE
              ip33701CurrConvInput.setIp33701TargetCurCode(CFUtil.getInt(sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(1).getIp98152ClrMbrCurCd()));
  
//  MOVE IP98152-CLR-MBR-CUR-EXP (2) TO IP33701-TARGET-CUR-EXP
              ip33701CurrConvInput.setIp33701TargetCurExp(sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(1).getIp98152ClrMbrCurExp());
  
//  PERFORM 8300-CALL-CURR-CONV-API
              callCurrConvApi();/*8300-CALL-CURR-CONV-API*/
              sys201OutputRecord.getSys201RecordPart3().getSys201CalcFeeInfo(sys201CalcFIdx - 1).setSys201CalcFeeSetlAmt(ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701TargetAmount() * work.getVal1300());
          }
      
      }
      /**
      * writeOutputSys201 
      *   This method is derived from 
  *   COBOL Paragraph - 2120-WRITE-OUTPUT-SYS201 COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ip98151RecordPart1             COBOL Name: IP98151-RECORD-PART-1
      * - ip98152RecordPart2             COBOL Name: IP98152-RECORD-PART-2
      * - maid800                        COBOL Name: 800-MAID
      * - sys201OutputRecord             COBOL Name: SYS201-OUTPUT-RECORD
      * - writeCnt400                    COBOL Name: 400-WRITE-CNT
      * - abendMessage600                COBOL Name: 600-ABEND-MESSAGE
      *
      * Output :  

      * - sys201RecordPart1              COBOL Name: SYS201-RECORD-PART-1
      * - ip98151RecordPart1             COBOL Name: IP98151-RECORD-PART-1
      * - sys201RecordPart2              COBOL Name: SYS201-RECORD-PART-2
      * - ip98152RecordPart2             COBOL Name: IP98152-RECORD-PART-2
      * - sys201Maid                     COBOL Name: SYS201-MAID
      * - maid800                        COBOL Name: 800-MAID
      * - sys201FileStatus200            COBOL Name: 200-SYS201-FILE-STATUS
      * - writeCnt400                    COBOL Name: 400-WRITE-CNT
      * - abendCode300                   COBOL Name: 300-ABEND-CODE
      * - abendParaName300               COBOL Name: 300-ABEND-PARA-NAME
      * - abendDescription600            COBOL Name: 600-ABEND-DESCRIPTION
      * - fileStatus600                  COBOL Name: 600-FILE-STATUS
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - abendMessage600                COBOL Name: 600-ABEND-MESSAGE
      * - abendParaName900               COBOL Name: 900-ABEND-PARA-NAME
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      *
      * @throws CFException
      */
      private void writeOutputSys201() throws Exception {
			// Declare local variables used in the method
			Sys201RecordPart2 sys201RecordPart2 = sys201OutputRecord.getSys201RecordPart2();
			// End of variable declaration

      
// *Status.                                                       *
// *--------------------------------------------------------------*
          // MOVE IP98151-RECORD-PART-1 TO SYS201-RECORD-PART-1
          sys201OutputRecord.setSys201RecordPart1(sys001TjfIp370Rec.getIp98151RecordPart1().toCharArray());
          // MOVE IP98152-RECORD-PART-2 TO SYS201-RECORD-PART-2
          sys201OutputRecord.getSys201RecordPart2().setString(sys001TjfIp370Rec.getIp98152RecordPart2().getCharArray());
//  MOVE 800-MAID TO SYS201-MAID
          sys201RecordPart2.setSys201Maid(holdVariables800.getMaid800());
  
//  WRITE SYS201-OUTPUT-RECORD
          sys201OutputFile.write(sys201OutputRecord.toCharArray()); 
          sys201OutputRecord.setString(CONSTANTS.LOW_VALUE_215567537);
          work.setSys201FileStatus200(sys201OutputFile.getStatusString() );
//  IF 88-200-SYS201-IO-GOOD
          if ( work.isSys201IoGood88200()  ) { 
//  ADD 1 TO 400-WRITE-CNT
              work.setWriteCnt400(work.getWriteCnt400()+(long)1);
          }
//  ELSE
          else { 
//  SET 88-300-WRITE-ABEND-CODE TO TRUE
              work.setWriteAbendCode88300True(); 
              
//  SET 88-300-ABEND-PARA-2120 TO TRUE
              work.setAbendPara212088300True(); 
              
//  SET 88-600-ABEND-WRITE-SYS201 TO TRUE
              abendMessage600.setAbendWriteSys20188600True(); 
              
//  MOVE 200-SYS201-FILE-STATUS TO 600-FILE-STATUS
              abendMessage600.setFileStatus600(work.getSys201FileStatus200());
              // MOVE 600-ABEND-MESSAGE TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(abendMessage600.toCharArray());
//  MOVE 300-ABEND-PARA-NAME TO 900-ABEND-PARA-NAME
              abendPara900.setAbendParaName900(work.getAbendParaName300());
//  MOVE 300-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(String.valueOf(work.getAbendCode300String()).toCharArray());
//  PERFORM 9500-ABEND-PROGRAM
              abendProgram();/*9500-ABEND-PROGRAM*/
          }
      
      }
      /**
      * searchDefaultRate 
      *   This method is derived from 
  *   COBOL Paragraph - 2200-SEARCH-DEFAULT-RATE COBOL Cyclomatic complexity - 8
      * Input  :  

      * - ichgIdx500                     COBOL Name: 500-ICHG-IDX
      * - ichgEntriesCnt500              COBOL Name: 500-ICHG-ENTRIES-CNT
      * - ip00164ProdCatCd               COBOL Name: IP00164-PROD-CAT-CD
      * - recType500                     COBOL Name: 500-REC-TYPE
      * - txnLowAmtU500                  COBOL Name: 500-TXN-LOW-AMT-U
      * - txnHighAmtU500                 COBOL Name: 500-TXN-HIGH-AMT-U
      * - maid500                        COBOL Name: 500-MAID
      * - viaRate500                     COBOL Name: 500-VIA-RATE
      * - fiaAmt500                      COBOL Name: 500-FIA-AMT
      * - minAmt500                      COBOL Name: 500-MIN-AMT
      * - maxAmt500                      COBOL Name: 500-MAX-AMT
      *
      * Output :  

      * - isEndOfLoop100                 COBOL Name: 100-IS-END-OF-LOOP
      * - ichgIdx500                     COBOL Name: 500-ICHG-IDX
      * - viaRate800                     COBOL Name: 800-VIA-RATE
      * - viaRate500                     COBOL Name: 500-VIA-RATE
      * - fiaAmt800                      COBOL Name: 800-FIA-AMT
      * - fiaAmt500                      COBOL Name: 500-FIA-AMT
      * - minAmt800                      COBOL Name: 800-MIN-AMT
      * - minAmt500                      COBOL Name: 500-MIN-AMT
      * - maxAmt800                      COBOL Name: 800-MAX-AMT
      * - maxAmt500                      COBOL Name: 500-MAX-AMT
      *
      * @throws CFException
      */
      private void searchDefaultRate() throws Exception {
			// Declare local variables used in the method
			Ip00164TableData ip00164TableData = ip00164TableEntry.getIp00164TableData();
			char[] ip00164ProdCatCd = null;
			// End of variable declaration

      
// *--------------------------------------------------------------*
// *This paragraph used to search with txn. amount.               *
// *--------------------------------------------------------------*
//  SET 88-100-IT-IS-NOT-END-LOOP TO TRUE
          work.setItIsNotEndLoop88100True(); 
          
//  PERFORM VARYING 500-ICHG-IDX FROM 1 BY 1 UNTIL 500-ICHG-IDX GREATER 500-ICHG-ENTRIES-CNT OR 88-100-IT-IS-END-OF-LOOP
          for (ichgIdx500 = 1; (	( ichgIdx500 <= ichgFeeRecords500.getIchgEntriesCnt500() )  && !(work.isItIsEndOfLoop88100()) ) ; ichgIdx500 = ichgIdx500 + 1 ) {
              ip00164ProdCatCd = ip00164TableData.getIp00164ProdCatCd();
//  IF IP00164-PROD-CAT-CD EQUAL 500-REC-TYPE ( 500-ICHG-IDX ) AND 500-TXN-LOW-AMT-U ( 500-ICHG-IDX ) EQUAL ZEROES AND 500-TXN-HIGH-AMT-U ( 500-ICHG-IDX ) EQUAL ZEROES AND 500-MAID ( 500-ICHG-IDX ) EQUAL SPACES
              if (		compareChars(ip00164ProdCatCd,ichgFeeRecords500.getIchgEntry500(ichgIdx500 - 1).getRecType500()) == 0  && 	( ichgFeeRecords500.getIchgEntry500(ichgIdx500 - 1).getTxnLowAmtU500() == 0 )  && 	( ichgFeeRecords500.getIchgEntry500(ichgIdx500 - 1).getTxnHighAmtU500() == 0 )  &&         ( allSpaces(ichgFeeRecords500.getIchgEntry500(ichgIdx500 - 1).getMaid500())   )) { 
//  SET 88-100-IT-IS-END-OF-LOOP TO TRUE
                  work.setItIsEndOfLoop88100True(); 
                  
//  MOVE 500-VIA-RATE ( 500-ICHG-IDX ) TO 800-VIA-RATE
                  ichgCalcVars800.setViaRate800(ichgFeeRecords500.getIchgEntry500(ichgIdx500 - 1).getViaRate500());
//  MOVE 500-FIA-AMT ( 500-ICHG-IDX ) TO 800-FIA-AMT
                  ichgCalcVars800.setFiaAmt800(ichgFeeRecords500.getIchgEntry500(ichgIdx500 - 1).getFiaAmt500());
//  MOVE 500-MIN-AMT ( 500-ICHG-IDX ) TO 800-MIN-AMT
                  ichgCalcVars800.setMinAmt800(ichgFeeRecords500.getIchgEntry500(ichgIdx500 - 1).getMinAmt500());
//  MOVE 500-MAX-AMT ( 500-ICHG-IDX ) TO 800-MAX-AMT
                  ichgCalcVars800.setMaxAmt800(ichgFeeRecords500.getIchgEntry500(ichgIdx500 - 1).getMaxAmt500());
              }
  
          }
      
      }
      /**
      * closeFiles 
      *   This method is derived from 
  *   COBOL Paragraph - 3000-CLOSE-FILES COBOL Cyclomatic complexity - 1
      * Input  :  

      * - ichgEntriesCnt500              COBOL Name: 500-ICHG-ENTRIES-CNT
      * - readCnt400                     COBOL Name: 400-READ-CNT
      * - writeCnt400                    COBOL Name: 400-WRITE-CNT
      * - internalTblCnt600              COBOL Name: 600-INTERNAL-TBL-CNT
      * - msgsRead600                    COBOL Name: 600-MSGS-READ
      * - msgsWrite600                   COBOL Name: 600-MSGS-WRITE
      *
      * Output :  

      * - ichgFeeCnt600                  COBOL Name: 600-ICHG-FEE-CNT
      * - ichgEntriesCnt500              COBOL Name: 500-ICHG-ENTRIES-CNT
      * - readCnt600                     COBOL Name: 600-READ-CNT
      * - readCnt400                     COBOL Name: 400-READ-CNT
      * - writeCnt600                    COBOL Name: 600-WRITE-CNT
      * - writeCnt400                    COBOL Name: 400-WRITE-CNT
      *
      * @throws CFException
      */
      private void closeFiles() throws Exception {
      
// *--------------------------------------------------------------*
// *This paragraph closes all the input and output files.         *
// *--------------------------------------------------------------*
//  MOVE 500-ICHG-ENTRIES-CNT TO 600-ICHG-FEE-CNT
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          internalTblCnt600.setIchgFeeCnt600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(ichgFeeRecords500.getIchgEntriesCnt500()).toCharArray()));
//  MOVE 400-READ-CNT TO 600-READ-CNT
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          msgsRead600.setReadCnt600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(work.getReadCnt400()).toCharArray()));
//  MOVE 400-WRITE-CNT TO 600-WRITE-CNT
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          msgsWrite600.setWriteCnt600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(work.getWriteCnt400()).toCharArray()));
//  DISPLAY 600-INTERNAL-TBL-CNT
          logger.info(internalTblCnt600.toString()); 
//  DISPLAY 600-MSGS-READ
          logger.info(msgsRead600.toString()); 
//  DISPLAY 600-MSGS-WRITE
          logger.info(msgsWrite600.toString()); 
//  PERFORM 3100-CLOSE-SYS001
          closeSys001();/*3100-CLOSE-SYS001*/
//  PERFORM 3200-CLOSE-SYS002
          closeSys002();/*3200-CLOSE-SYS002*/
//  PERFORM 3300-CLOSE-SYS201
          closeSys201();/*3300-CLOSE-SYS201*/
          ;
      
      }
      /**
      * closeSys001 
      *   This method is derived from 
  *   COBOL Paragraph - 3100-CLOSE-SYS001 COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sys001FileStatus200            COBOL Name: 200-SYS001-FILE-STATUS
      * - abendMessage600                COBOL Name: 600-ABEND-MESSAGE
      *
      * Output :  

      * - abendCode300                   COBOL Name: 300-ABEND-CODE
      * - abendParaName300               COBOL Name: 300-ABEND-PARA-NAME
      * - abendDescription600            COBOL Name: 600-ABEND-DESCRIPTION
      * - fileStatus600                  COBOL Name: 600-FILE-STATUS
      * - sys001FileStatus200            COBOL Name: 200-SYS001-FILE-STATUS
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - abendMessage600                COBOL Name: 600-ABEND-MESSAGE
      * - abendParaName900               COBOL Name: 900-ABEND-PARA-NAME
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      *
      * @throws CFException
      */
      private void closeSys001() throws Exception {
      
// *--------------------------------------------------------------*
// *This para closes sys001                                       *
// *--------------------------------------------------------------*
//  CLOSE SYS001-TJF-IP370-FILE
          sys001TjfIp370File.close(); 
          work.setSys001FileStatus200(sys001TjfIp370File.getStatusString() );
//  IF 88-200-SYS001-IO-GOOD
//  ELSE
          if (!(work.isSys001IoGood88200()) ) { 
//  SET 88-300-CLOSE-ABEND-CODE TO TRUE
              work.setCloseAbendCode88300True(); 
              
//  SET 88-300-ABEND-PARA-3100 TO TRUE
              work.setAbendPara310088300True(); 
              
//  SET 88-600-ABEND-CLOSE-SYS001 TO TRUE
              abendMessage600.setAbendCloseSys00188600True(); 
              
//  MOVE 200-SYS001-FILE-STATUS TO 600-FILE-STATUS
              abendMessage600.setFileStatus600(work.getSys001FileStatus200());
              // MOVE 600-ABEND-MESSAGE TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(abendMessage600.toCharArray());
//  MOVE 300-ABEND-PARA-NAME TO 900-ABEND-PARA-NAME
              abendPara900.setAbendParaName900(work.getAbendParaName300());
//  MOVE 300-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(String.valueOf(work.getAbendCode300String()).toCharArray());
//  PERFORM 9500-ABEND-PROGRAM
              abendProgram();/*9500-ABEND-PROGRAM*/
          }
      
      }
      /**
      * closeSys002 
      *   This method is derived from 
  *   COBOL Paragraph - 3200-CLOSE-SYS002 COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sys002FileStatus200            COBOL Name: 200-SYS002-FILE-STATUS
      * - abendMessage600                COBOL Name: 600-ABEND-MESSAGE
      *
      * Output :  

      * - abendCode300                   COBOL Name: 300-ABEND-CODE
      * - abendParaName300               COBOL Name: 300-ABEND-PARA-NAME
      * - abendDescription600            COBOL Name: 600-ABEND-DESCRIPTION
      * - fileStatus600                  COBOL Name: 600-FILE-STATUS
      * - sys002FileStatus200            COBOL Name: 200-SYS002-FILE-STATUS
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - abendMessage600                COBOL Name: 600-ABEND-MESSAGE
      * - abendParaName900               COBOL Name: 900-ABEND-PARA-NAME
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      *
      * @throws CFException
      */
      private void closeSys002() throws Exception {
      
// *--------------------------------------------------------------*
// *This para closes sys002                                       *
// *--------------------------------------------------------------*
//  CLOSE SYS002-CNTL-ICHG-FILE
          sys002CntlIchgFile.close(); 
          work.setSys002FileStatus200(sys002CntlIchgFile.getStatusString() );
//  IF 88-200-SYS002-IO-GOOD
//  ELSE
          if (!(work.isSys002IoGood88200()) ) { 
//  SET 88-300-CLOSE-ABEND-CODE TO TRUE
              work.setCloseAbendCode88300True(); 
              
//  SET 88-300-ABEND-PARA-3200 TO TRUE
              work.setAbendPara320088300True(); 
              
//  SET 88-600-ABEND-CLOSE-SYS002 TO TRUE
              abendMessage600.setAbendCloseSys00288600True(); 
              
//  MOVE 200-SYS002-FILE-STATUS TO 600-FILE-STATUS
              abendMessage600.setFileStatus600(work.getSys002FileStatus200());
              // MOVE 600-ABEND-MESSAGE TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(abendMessage600.toCharArray());
//  MOVE 300-ABEND-PARA-NAME TO 900-ABEND-PARA-NAME
              abendPara900.setAbendParaName900(work.getAbendParaName300());
//  MOVE 300-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(String.valueOf(work.getAbendCode300String()).toCharArray());
//  PERFORM 9500-ABEND-PROGRAM
              abendProgram();/*9500-ABEND-PROGRAM*/
          }
      
      }
      /**
      * closeSys201 
      *   This method is derived from 
  *   COBOL Paragraph - 3300-CLOSE-SYS201 COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sys201FileStatus200            COBOL Name: 200-SYS201-FILE-STATUS
      * - abendMessage600                COBOL Name: 600-ABEND-MESSAGE
      *
      * Output :  

      * - abendCode300                   COBOL Name: 300-ABEND-CODE
      * - abendParaName300               COBOL Name: 300-ABEND-PARA-NAME
      * - abendDescription600            COBOL Name: 600-ABEND-DESCRIPTION
      * - fileStatus600                  COBOL Name: 600-FILE-STATUS
      * - sys201FileStatus200            COBOL Name: 200-SYS201-FILE-STATUS
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - abendMessage600                COBOL Name: 600-ABEND-MESSAGE
      * - abendParaName900               COBOL Name: 900-ABEND-PARA-NAME
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      *
      * @throws CFException
      */
      private void closeSys201() throws Exception {
      
// *--------------------------------------------------------------*
// *This para closes sys201                                       *
// *--------------------------------------------------------------*
//  CLOSE SYS201-OUTPUT-FILE
          sys201OutputFile.close(); 
          work.setSys201FileStatus200(sys201OutputFile.getStatusString() );
//  IF 88-200-SYS201-IO-GOOD
//  ELSE
          if (!(work.isSys201IoGood88200()) ) { 
//  SET 88-300-CLOSE-ABEND-CODE TO TRUE
              work.setCloseAbendCode88300True(); 
              
//  SET 88-300-ABEND-PARA-3300 TO TRUE
              work.setAbendPara330088300True(); 
              
//  SET 88-600-ABEND-CLOSE-SYS201 TO TRUE
              abendMessage600.setAbendCloseSys20188600True(); 
              
//  MOVE 200-SYS201-FILE-STATUS TO 600-FILE-STATUS
              abendMessage600.setFileStatus600(work.getSys201FileStatus200());
              // MOVE 600-ABEND-MESSAGE TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(abendMessage600.toCharArray());
//  MOVE 300-ABEND-PARA-NAME TO 900-ABEND-PARA-NAME
              abendPara900.setAbendParaName900(work.getAbendParaName300());
//  MOVE 300-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(String.valueOf(work.getAbendCode300String()).toCharArray());
//  PERFORM 9500-ABEND-PROGRAM
              abendProgram();/*9500-ABEND-PROGRAM*/
          }
      
      }
      /**
      * readSys001File 
      *   This method is derived from 
  *   COBOL Paragraph - 8000-READ-SYS001-FILE COBOL Cyclomatic complexity - 4
      * Input  :  

      * - readCnt400                     COBOL Name: 400-READ-CNT
      * - abendMessage600                COBOL Name: 600-ABEND-MESSAGE
      *
      * Output :  

      * - sys001TjfIp370Rec              COBOL Name: SYS001-TJF-IP370-REC
      * - sys001FileStatus200            COBOL Name: 200-SYS001-FILE-STATUS
      * - readCnt400                     COBOL Name: 400-READ-CNT
      * - abendDescription600            COBOL Name: 600-ABEND-DESCRIPTION
      * - abendCode300                   COBOL Name: 300-ABEND-CODE
      * - abendParaName300               COBOL Name: 300-ABEND-PARA-NAME
      * - fileStatus600                  COBOL Name: 600-FILE-STATUS
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - abendMessage600                COBOL Name: 600-ABEND-MESSAGE
      * - abendParaName900               COBOL Name: 900-ABEND-PARA-NAME
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      *
      * @throws CFException
      */
      private void readSys001File() throws Exception {
      
// *--------------------------------------------------------------*
// *This paragraph reads input merged tjf + ip370 extract.        *
// *--------------------------------------------------------------*
//  READ SYS001-TJF-IP370-FILE
          	sys001TjfIp370File.read();
          work.setSys001FileStatus200(sys001TjfIp370File.getStatusString() );
          if (!sys001TjfIp370File.hasEnded()) {
          	sys001TjfIp370Rec.setString(sys001TjfIp370File.getRecord());
          }
//  EVALUATE TRUE
          if  ( work.isSys001IoGood88200()  ) { 
//  ADD 1 TO 400-READ-CNT
              work.setReadCnt400(work.getReadCnt400()+(long)1);
          }
          else if  ( work.isSys001Eof88200()  ) { 
              ;
          }
          else   { 
//  SET 88-600-ABEND-READ-SYS001 TO TRUE
              abendMessage600.setAbendReadSys00188600True(); 
              
//  SET 88-300-READ-ABEND-CODE TO TRUE
              work.setReadAbendCode88300True(); 
              
//  SET 88-300-ABEND-PARA-8000 TO TRUE
              work.setAbendPara800088300True(); 
              
//  MOVE 200-SYS001-FILE-STATUS TO 600-FILE-STATUS
              abendMessage600.setFileStatus600(work.getSys001FileStatus200());
              // MOVE 600-ABEND-MESSAGE TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(abendMessage600.toCharArray());
//  MOVE 300-ABEND-PARA-NAME TO 900-ABEND-PARA-NAME
              abendPara900.setAbendParaName900(work.getAbendParaName300());
//  MOVE 300-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(String.valueOf(work.getAbendCode300String()).toCharArray());
//  PERFORM 9500-ABEND-PROGRAM
              abendProgram();/*9500-ABEND-PROGRAM*/
          }
      
      }
      /**
      * readSys002File 
      *   This method is derived from 
  *   COBOL Paragraph - 8100-READ-SYS002-FILE COBOL Cyclomatic complexity - 4
      * Input  :  

      * - abendMessage600                COBOL Name: 600-ABEND-MESSAGE
      *
      * Output :  

      * - sys002CntlIchgRec              COBOL Name: SYS002-CNTL-ICHG-REC
      * - sys002FileStatus200            COBOL Name: 200-SYS002-FILE-STATUS
      * - abendDescription600            COBOL Name: 600-ABEND-DESCRIPTION
      * - abendCode300                   COBOL Name: 300-ABEND-CODE
      * - abendParaName300               COBOL Name: 300-ABEND-PARA-NAME
      * - fileStatus600                  COBOL Name: 600-FILE-STATUS
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - abendMessage600                COBOL Name: 600-ABEND-MESSAGE
      * - abendParaName900               COBOL Name: 900-ABEND-PARA-NAME
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      *
      * @throws CFException
      */
      private void readSys002File() throws Exception {
      
// *--------------------------------------------------------------*
// *This paragraph reads control card input file containing all   *
// *defined interchange rates and amounts.                        *
// *--------------------------------------------------------------*
//  READ SYS002-CNTL-ICHG-FILE
          	sys002CntlIchgFile.read();
          work.setSys002FileStatus200(sys002CntlIchgFile.getStatusString() );
          if (!sys002CntlIchgFile.hasEnded()) {
          	sys002CntlIchgRec.setString(sys002CntlIchgFile.getRecord());
          }
//  EVALUATE TRUE
          if  ( work.isSys002IoGood88200()  ) { 
              ;
          }
          else if  ( work.isSys002Eof88200()  ) { 
              ;
          }
          else   { 
//  SET 88-600-ABEND-READ-SYS002 TO TRUE
              abendMessage600.setAbendReadSys00288600True(); 
              
//  SET 88-300-READ-ABEND-CODE TO TRUE
              work.setReadAbendCode88300True(); 
              
//  SET 88-300-ABEND-PARA-8100 TO TRUE
              work.setAbendPara810088300True(); 
              
//  MOVE 200-SYS002-FILE-STATUS TO 600-FILE-STATUS
              abendMessage600.setFileStatus600(work.getSys002FileStatus200());
              // MOVE 600-ABEND-MESSAGE TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(abendMessage600.toCharArray());
//  MOVE 300-ABEND-PARA-NAME TO 900-ABEND-PARA-NAME
              abendPara900.setAbendParaName900(work.getAbendParaName300());
//  MOVE 300-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(String.valueOf(work.getAbendCode300String()).toCharArray());
//  PERFORM 9500-ABEND-PROGRAM
              abendProgram();/*9500-ABEND-PROGRAM*/
          }
      
      }
      /**
      * determineTxnType 
      *   This method is derived from 
  *   COBOL Paragraph - 8200-DETERMINE-TXN-TYPE COBOL Cyclomatic complexity - 3
      * Input  :  

      * - fundPan800                     COBOL Name: 800-FUND-PAN
      * - isArRecFound100                COBOL Name: 100-IS-AR-REC-FOUND
      * - isTxnQualify100                COBOL Name: 100-IS-TXN-QUALIFY
      *
      * Output :  

      * - prodId800                      COBOL Name: 800-PROD-ID
      * - ip00404Tbl40ArH                COBOL Name: IP00404-TBL-40-AR-H
      * - fundPan800                     COBOL Name: 800-FUND-PAN
      *
      * @throws CFException
      */
      private void determineTxnType() throws Exception {
			// Declare local variables used in the method
			Ip00404ArRangeGrp ip00404ArRangeGrp = ip00404Table.getIp00404ArRangeGrp();
			// End of variable declaration

      
// *--------------------------------------------------------------*
// *This paragraph would intercept funding acct number 11 digits  *
// *submitted in de42/de43 in tjf and go against table 40 to      *
// *obtain product id. check this product id against table 16 to  *
// *confirm if the product is credit or debit.                    *
// *--------------------------------------------------------------*
//  MOVE SPACES TO 800-PROD-ID
          holdVariables800.setProdId800(CONSTANTS.SPACE_3);
//  MOVE ZEROES TO IP00404-TBL-40-AR-H
          ip00404ArRangeGrp.setIp00404Tbl40ArH(CONSTANTS.ZERO_19);
  
//  MOVE 800-FUND-PAN TO IP00404-TBL-40-AR-H (1 : 10)
          ip00404Table.replace(holdVariables800/*parent*/,0/*fromOffset - (ip00404Tbl40ArH) */,10/*fromLen*/,4/*toOffset - (fundPan800) */,10/*toLen*/);
//  PERFORM 8210-CALL-TBL40-API
          callTbl40Api();/*8210-CALL-TBL40-API*/
//  IF 88-100-AR-REC-FOUND
          if ( work.isArRecFound88100()  ) { 
//  PERFORM 8220-CALL-TBL16-API
              callTbl16Api();/*8220-CALL-TBL16-API*/
//  IF 88-100-TXN-QUALIFY-Y
              if ( work.isTxnQualifyY88100()  ) { 
//  PERFORM 8500-DETERMINE-INTERCHANGE
                  determineInterchange();/*8500-DETERMINE-INTERCHANGE*/
              }
          }
      
      }
      /**
      * callTbl40Api 
      *   This method is derived from 
  *   COBOL Paragraph - 8210-CALL-TBL40-API COBOL Cyclomatic complexity - 6
      * Input  :  

      * - isArRecFound100                COBOL Name: 100-IS-AR-REC-FOUND
      * - ip00404AcctRngIndex            COBOL Name: IP00404-ACCT-RNG-INDEX
      * - ip00404EntriesFoundCount       COBOL Name: IP00404-ENTRIES-FOUND-COUNT
      * - ip00404Ab                      COBOL Name: IP00404-AB
      * - ip00404Entry                   COBOL Name: IP00404-ENTRY
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      * - ip00404AcctRngIndex            COBOL Name: IP00404-ACCT-RNG-INDEX
      * - isArRecFound100                COBOL Name: 100-IS-AR-REC-FOUND
      * - ip0040iAccountRangeInfo        COBOL Name: IP0040I-ACCOUNT-RANGE-INFO
      * - ip00404Entry                   COBOL Name: IP00404-ENTRY
      * - ip0040iProdId                  COBOL Name: IP0040I-PROD-ID
      * - prodId800                      COBOL Name: 800-PROD-ID
      * - fundProdId800                  COBOL Name: 800-FUND-PROD-ID
      *
      * @throws CFException
      */
      private void callTbl40Api() throws Exception {
			// Declare local variables used in the method
			Ip0040iMpePeRecData ip0040iMpePeRecData = ip0040iAccountRangeInfo.getIp0040iMpePeRecData();
			Ip00404ArRangeEntries ip00404ArRangeEntries = ip00404Table.getIp00404ArRangeEntries();
			// End of variable declaration

      
// *--------------------------------------------------------------*
// *This paragraph calls table 40 api to check if funding acct.
// *range submitted is valid and it has matching acceptance brand
// *mcc or dmc. if found, populate them to external copybook
// *ip0040i.
// *--------------------------------------------------------------*
//  CALL 800-PTR-IP280010
          // CALL 800-PTR-IP280010
          	this.setRc( ip280010.process());
//  PERFORM VARYING IP00404-ACCT-RNG-INDEX FROM 1 BY 1 UNTIL 88-100-AR-REC-FOUND OR IP00404-ACCT-RNG-INDEX GREATER THAN IP00404-ENTRIES-FOUND-COUNT
          for (ip00404AcctRngIndex = 1; (!(work.isArRecFound88100())  && 	( ip00404AcctRngIndex <= ip00404Table.getIp00404EntriesFoundCount() )) ; ip00404AcctRngIndex = ip00404AcctRngIndex + 1 ) {
//  IF IP00404-AB ( IP00404-ACCT-RNG-INDEX ) EQUAL 'DMC' OR IP00404-AB ( IP00404-ACCT-RNG-INDEX ) EQUAL 'MCC'
//  LITERAL_MCC = 'MCC'
              if (		compareChars(ip00404ArRangeEntries.getIp00404Entry(ip00404AcctRngIndex - 1).getIp00404MpePeRecData().getIp00404Ab(),CONSTANTS.LITERAL_DMC) == 0  || 		compareChars(ip00404ArRangeEntries.getIp00404Entry(ip00404AcctRngIndex - 1).getIp00404MpePeRecData().getIp00404Ab(),CONSTANTS.LITERAL_MCC) == 0 ) { 
//  SET 88-100-AR-REC-FOUND TO TRUE
                  work.setArRecFound88100True(); 
                  
//  MOVE IP00404-ENTRY ( IP00404-ACCT-RNG-INDEX ) TO IP0040I-ACCOUNT-RANGE-INFO
                  ip0040iAccountRangeInfo.setString(ip00404Table.getIp00404ArRangeEntries().getIp00404Entry(ip00404AcctRngIndex - 1).toCharArray());
//  MOVE IP0040I-PROD-ID TO 800-PROD-ID 800-FUND-PROD-ID
                  holdVariables800.setProdId800(ip0040iMpePeRecData.getIp0040iProdId());
                  holdVariables800.setFundProdId800(ip0040iMpePeRecData.getIp0040iProdId());
  
              }
  
          }
      
      }
      /**
      * callTbl16Api 
      *   This method is derived from 
  *   COBOL Paragraph - 8220-CALL-TBL16-API COBOL Cyclomatic complexity - 4
      * Input  :  

      * - ip0040iLicensedProdId          COBOL Name: IP0040I-LICENSED-PROD-ID
      * - ip00164EntryFound              COBOL Name: IP00164-ENTRY-FOUND
      * - ip00164ProdCatCd               COBOL Name: IP00164-PROD-CAT-CD
      * - valueC300                      COBOL Name: 300-VALUE-C
      * - valueD300                      COBOL Name: 300-VALUE-D
      *
      * Output :  

      * - ip00164LicensedProdId          COBOL Name: IP00164-LICENSED-PROD-ID
      * - ip0040iLicensedProdId          COBOL Name: IP0040I-LICENSED-PROD-ID
      * - rc                             COBOL Name: RETURN-CODE
      * - ip98152FundProdType            COBOL Name: IP98152-FUND-PROD-TYPE
      * - ip00164ProdCatCd               COBOL Name: IP00164-PROD-CAT-CD
      * - isTxnQualify100                COBOL Name: 100-IS-TXN-QUALIFY
      * - prodId800                      COBOL Name: 800-PROD-ID
      *
      * @throws CFException
      */
      private void callTbl16Api() throws Exception {
			// Declare local variables used in the method
			Ip0040iMpePeRecDataCs ip0040iMpePeRecDataCs = ip0040iAccountRangeInfo.getIp0040iMpePeRecDataCs();
			Ip00164TableData ip00164TableData = ip00164TableEntry.getIp00164TableData();
			Ip98152RecordPart2 ip98152RecordPart2 = sys001TjfIp370Rec.getIp98152RecordPart2();
			char[] ip00164ProdCatCd = null;
			char[] valueD300 = null;
			// End of variable declaration

      
// *--------------------------------------------------------------*
// *This paragraph calls table 16 api to check if licensed prod
// *id obtained from table 40 is of credit or debit. if true, set
// *the switch for further processing.
// *--------------------------------------------------------------*
//  MOVE IP0040I-LICENSED-PROD-ID TO IP00164-LICENSED-PROD-ID
          ip00164TableData.setIp00164LicensedProdId(ip0040iMpePeRecDataCs.getIp0040iLicensedProdId());
  
//  CALL 800-PTR-IP280510
          // CALL 800-PTR-IP280510
          	this.setRc( ip280510.process());
//  IF 88-IP00164-ENTRY-FOUND-Y
          if ( ip00164EntryFoundGroup.isIp00164EntryFoundY88()  ) { 
//  MOVE IP00164-PROD-CAT-CD TO IP98152-FUND-PROD-TYPE
              ip98152RecordPart2.setIp98152FundProdType(ip00164TableData.getIp00164ProdCatCd());
  
              valueD300 = work.getValueD300();
              ip00164ProdCatCd = ip00164TableData.getIp00164ProdCatCd();
//  EVALUATE IP00164-PROD-CAT-CD
              if  (		compareChars(ip00164ProdCatCd,work.getValueC300()) == 0 ) { 
//  SET 88-100-TXN-QUALIFY-Y TO TRUE
                  work.setTxnQualifyY88100True(); 
                  
              }
              else if  (		compareChars(ip00164ProdCatCd,valueD300) == 0 ) { 
//  SET 88-100-TXN-QUALIFY-Y TO TRUE
                  work.setTxnQualifyY88100True(); 
                  
//  MOVE SPACES TO 800-PROD-ID
                  holdVariables800.setProdId800(CONSTANTS.SPACE_3);
              }
  
          }
      
      }
      /**
      * callCurrConvApi 
      *   This method is derived from 
  *   COBOL Paragraph - 8300-CALL-CURR-CONV-API COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ip98152ClrFxDate               COBOL Name: IP98152-CLR-FX-DATE
      * - ip33701ReturnCode              COBOL Name: IP33701-RETURN-CODE
      * - ip33701SourceCurCode           COBOL Name: IP33701-SOURCE-CUR-CODE
      * - ip33701SourceCurExp            COBOL Name: IP33701-SOURCE-CUR-EXP
      * - ip33701TargetCurCode           COBOL Name: IP33701-TARGET-CUR-CODE
      * - ip33701TargetCurExp            COBOL Name: IP33701-TARGET-CUR-EXP
      * - srceTrgCurExpErr0rMsg600       COBOL Name: 600-SRCE-TRG-CUR-EXP-ERR0R-MSG
      *
      * Output :  

      * - ip33701FxDateYyddd             COBOL Name: IP33701-FX-DATE-YYDDD
      * - ip98152ClrFxDate               COBOL Name: IP98152-CLR-FX-DATE
      * - ip33701ConvRateTrgAsRef        COBOL Name: IP33701-CONV-RATE-TRG-AS-REF
      * - ip33701ConvRateTrgNotRef       COBOL Name: IP33701-CONV-RATE-TRG-NOT-REF
      * - ip33701ApplyConvRate           COBOL Name: IP33701-APPLY-CONV-RATE
      * - ip33701RateTypeSrcToBase       COBOL Name: IP33701-RATE-TYPE-SRC-TO-BASE
      * - ip33701RateTypeTrgToBase       COBOL Name: IP33701-RATE-TYPE-TRG-TO-BASE
      * - ip33701ApplyCrossRate          COBOL Name: IP33701-APPLY-CROSS-RATE
      * - rc                             COBOL Name: RETURN-CODE
      * - abendCode300                   COBOL Name: 300-ABEND-CODE
      * - abendParaName300               COBOL Name: 300-ABEND-PARA-NAME
      * - srceCurrValue600               COBOL Name: 600-SRCE-CURR-VALUE
      * - ip33701SourceCurCode           COBOL Name: IP33701-SOURCE-CUR-CODE
      * - srceExpValue600                COBOL Name: 600-SRCE-EXP-VALUE
      * - ip33701SourceCurExp            COBOL Name: IP33701-SOURCE-CUR-EXP
      * - trgCurrValue600                COBOL Name: 600-TRG-CURR-VALUE
      * - ip33701TargetCurCode           COBOL Name: IP33701-TARGET-CUR-CODE
      * - trgExpValue600                 COBOL Name: 600-TRG-EXP-VALUE
      * - ip33701TargetCurExp            COBOL Name: IP33701-TARGET-CUR-EXP
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - srceTrgCurExpErr0rMsg600       COBOL Name: 600-SRCE-TRG-CUR-EXP-ERR0R-MSG
      * - abendParaName900               COBOL Name: 900-ABEND-PARA-NAME
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      *
      * @throws CFException
      */
      private void callCurrConvApi() throws Exception {
			// Declare local variables used in the method
			Ip98152RecordPart2 ip98152RecordPart2 = sys001TjfIp370Rec.getIp98152RecordPart2();
			Ip33701CurrConvInput ip33701CurrConvInput = ip33701CurrConvInterface.getIp33701CurrConvInput();
			Ip33701CurrConvOutput ip33701CurrConvOutput = ip33701CurrConvInterface.getIp33701CurrConvOutput();
			short ip33701ReturnCode = 0;
			// End of variable declaration

      
// *--------------------------------------------------------------*
// *This paragraph calls currency conversion api.                 *
// *--------------------------------------------------------------*
          // MOVE IP98152-CLR-FX-DATE TO IP33701-FX-DATE-YYDDD
          ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701FxDateYyddd(sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrFxDate());
  
//  SET 88-IP33701-XRATE1-MID-RT-INV TO TRUE
          ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701Xrate1MidRtInv88True(); 
          
//  SET 88-IP33701-XRATE2-MID-RT TO TRUE
          ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701Xrate2MidRt88True(); 
          
//  SET 88-IP33701-MULTIPLY-BY-RATE TO TRUE
          ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701MultiplyByRate88True(); 
          
//  SET 88-IP33701-S-TO-B-MID-RT TO TRUE
          ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SToBMidRt88True(); 
          
//  SET 88-IP33701-T-TO-B-MID-RT TO TRUE
          ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TToBMidRt88True(); 
          
//  SET 88-IP33701-NO-CROSS-RATE TO TRUE
          ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701NoCrossRate88True(); 
          
//  CALL 800-PTR-IP783510
          // CALL 800-PTR-IP783510
          	this.setRc( ip783510.process());
//  IF IP33701-RETURN-CODE EQUAL ZEROES
          ip33701ReturnCode = ip33701CurrConvOutput.getIp33701ReturnCode();
//  ELSE
          if (	( ip33701ReturnCode != 0 ) ) { 
//  SET 88-300-CONV-ABEND-CODE TO TRUE
              work.setConvAbendCode88300True(); 
              
//  SET 88-300-ABEND-PARA-8300 TO TRUE
              work.setAbendPara830088300True(); 
              
//  MOVE IP33701-SOURCE-CUR-CODE TO 600-SRCE-CURR-VALUE
              srceTrgCurExpErr0rMsg600.setSrceCurrValue600(String.valueOf(ip33701CurrConvInput.getIp33701SourceCurCodeString()).toCharArray());
  
//  MOVE IP33701-SOURCE-CUR-EXP TO 600-SRCE-EXP-VALUE
              srceTrgCurExpErr0rMsg600.setSrceExpValue600(ip33701CurrConvInput.getIp33701SourceCurExp());
  
//  MOVE IP33701-TARGET-CUR-CODE TO 600-TRG-CURR-VALUE
              srceTrgCurExpErr0rMsg600.setTrgCurrValue600(String.valueOf(ip33701CurrConvInput.getIp33701TargetCurCodeString()).toCharArray());
  
//  MOVE IP33701-TARGET-CUR-EXP TO 600-TRG-EXP-VALUE
              srceTrgCurExpErr0rMsg600.setTrgExpValue600(ip33701CurrConvInput.getIp33701TargetCurExp());
  
              // MOVE 600-SRCE-TRG-CUR-EXP-ERR0R-MSG TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(srceTrgCurExpErr0rMsg600.toCharArray());
//  MOVE 300-ABEND-PARA-NAME TO 900-ABEND-PARA-NAME
              abendPara900.setAbendParaName900(work.getAbendParaName300());
//  MOVE 300-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(String.valueOf(work.getAbendCode300String()).toCharArray());
//  PERFORM 9500-ABEND-PROGRAM
              abendProgram();/*9500-ABEND-PROGRAM*/
          }
  
      
      }
      /**
      * alignAmtToExp 
      *   This method is derived from 
  *   COBOL Paragraph - 8400-ALIGN-AMT-TO-EXP COBOL Cyclomatic complexity - 8
      * Input  :  

      * - ip33701SrcAmt6Decimals         COBOL Name: IP33701-SRC-AMT-6-DECIMALS
      *
      * Output :  

      * - ip33701TargetAmount            COBOL Name: IP33701-TARGET-AMOUNT
      *
      * @throws CFException
      */
      private void alignAmtToExp() throws Exception {
			// Declare local variables used in the method
			Ip33701CurrConvOutput ip33701CurrConvOutput = ip33701CurrConvInterface.getIp33701CurrConvOutput();
			Ip33701CurrConvInput ip33701CurrConvInput = ip33701CurrConvInterface.getIp33701CurrConvInput();
			// End of variable declaration

      
// *--------------------------------------------------------------*
// *This paragraph aligns amount to respecitve decimals
// *--------------------------------------------------------------*
//  EVALUATE IP33701-TARGET-CUR-EXP
          switch(new String(ip33701CurrConvInput.getIp33701TargetCurExp())){
          	case "0":
              ip33701CurrConvInterface.getIp33701CurrConvOutput().setIp33701TargetAmount(ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701SrcAmt6Decimals().setScale(0,BigDecimal.ROUND_HALF_UP).longValue());
          break;
          	case "1":
              ip33701CurrConvInterface.getIp33701CurrConvOutput().setIp33701TargetAmount(ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701SrcAmt6Decimals().multiply(BigDecimal.TEN).setScale(0,BigDecimal.ROUND_HALF_UP).longValue());
          break;
          	case "2":
              ip33701CurrConvInterface.getIp33701CurrConvOutput().setIp33701TargetAmount(ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701SrcAmt6Decimals().multiply(BigDecimal.valueOf(100)).setScale(0,BigDecimal.ROUND_HALF_UP).longValue());
          break;
          	case "3":
              ip33701CurrConvInterface.getIp33701CurrConvOutput().setIp33701TargetAmount(ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701SrcAmt6Decimals().multiply(BigDecimal.valueOf(1000)).setScale(0,BigDecimal.ROUND_HALF_UP).longValue());
          break;
          	case "4":
              ip33701CurrConvInterface.getIp33701CurrConvOutput().setIp33701TargetAmount(ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701SrcAmt6Decimals().multiply(BigDecimal.valueOf(10000)).setScale(0,BigDecimal.ROUND_HALF_UP).longValue());
          break;
          	case "5":
              ip33701CurrConvInterface.getIp33701CurrConvOutput().setIp33701TargetAmount(ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701SrcAmt6Decimals().multiply(BigDecimal.valueOf(100000)).setScale(0,BigDecimal.ROUND_HALF_UP).longValue());
          break;
          	case "6":
              ip33701CurrConvInterface.getIp33701CurrConvOutput().setIp33701TargetAmount(ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701SrcAmt6Decimals().multiply(BigDecimal.valueOf(1000000)).setScale(0,BigDecimal.ROUND_HALF_UP).longValue());
          break;
          }
  
      
      }
      /**
      * determineInterchange 
      *   This method is derived from 
  *   COBOL Paragraph - 8500-DETERMINE-INTERCHANGE COBOL Cyclomatic complexity - 7
      * Input  :  

      * - ip98151TjfDe48se32             COBOL Name: IP98151-TJF-DE48SE32
      * - ip98151TjfTlrMrchId            COBOL Name: IP98151-TJF-TLR-MRCH-ID
      * - ip98151TjfTlrP176Id            COBOL Name: IP98151-TJF-TLR-P176-ID
      * - maid800                        COBOL Name: 800-MAID
      * - isMaidFound100                 COBOL Name: 100-IS-MAID-FOUND
      * - isIchgCalculated100            COBOL Name: 100-IS-ICHG-CALCULATED
      *
      * Output : None 

      * @throws CFException
      */
      private void determineInterchange() throws Exception {
			// Declare local variables used in the method
			Ip98151RecordPart1 ip98151RecordPart1 = sys001TjfIp370Rec.getIp98151RecordPart1();
			char[] ip98151TjfDe48se32 = null;
			char[] ip98151TjfTlrMrchId = null;
			char[] ip98151TjfTlrP176Id = null;
			char[] maid800 = null;
			// End of variable declaration

      
// *--------------------------------------------------------------*
// *This paragraph used to process debit flow
// *--------------------------------------------------------------*
          ip98151TjfDe48se32 = ip98151RecordPart1.getIp98151TjfDe48se32();
          ip98151TjfTlrMrchId = ip98151RecordPart1.getIp98151TjfTlrMrchId();
          maid800 = holdVariables800.getMaid800();
          ip98151TjfTlrP176Id = ip98151RecordPart1.getIp98151TjfTlrP176Id();
//  IF IP98151-TJF-DE48SE32 NOT EQUAL SPACES OR IP98151-TJF-TLR-MRCH-ID NOT EQUAL SPACES OR IP98151-TJF-TLR-P176-ID NOT EQUAL SPACES OR 800-MAID NOT EQUAL SPACES
          if (        ( !allSpaces(ip98151TjfDe48se32)  ) ||         ( !allSpaces(ip98151TjfTlrMrchId)  ) ||         ( !allSpaces(ip98151TjfTlrP176Id)  ) ||         ( !allSpaces(maid800)  )) { 
//  PERFORM 8510-SEARCH-MAID-ID
              searchMaidId();/*8510-SEARCH-MAID-ID*/
//  IF 88-100-IT-IS-MAID-FND-N
              if ( work.isItIsMaidFndN88100()  ) { 
//  PERFORM 8540-SEARCH-OTHERS-GRP
                  searchOthersGrp();/*8540-SEARCH-OTHERS-GRP*/
              }
          }
  
//  ELSE
          else { 
//  PERFORM 8520-CHECK-MCC-CODE
              checkMccCode();/*8520-CHECK-MCC-CODE*/
//  PERFORM 8530-SEARCH-TXN-MCC-AMT
              searchTxnMccAmt();/*8530-SEARCH-TXN-MCC-AMT*/
//  IF 88-100-ICHG-CALCULATED-N
              if ( work.isIchgCalculatedN88100()  ) { 
//  PERFORM 8540-SEARCH-OTHERS-GRP
                  searchOthersGrp();/*8540-SEARCH-OTHERS-GRP*/
              }
          }
      
      }
      /**
      * searchMaidId 
      *   This method is derived from 
  *   COBOL Paragraph - 8510-SEARCH-MAID-ID COBOL Cyclomatic complexity - 13
      * Input  :  

      * - ichgIdx500                     COBOL Name: 500-ICHG-IDX
      * - ichgEntriesCnt500              COBOL Name: 500-ICHG-ENTRIES-CNT
      * - ip00164ProdCatCd               COBOL Name: IP00164-PROD-CAT-CD
      * - recType500                     COBOL Name: 500-REC-TYPE
      * - ip98152ClrTxnAmt               COBOL Name: IP98152-CLR-TXN-AMT
      * - txnLowAmtU500                  COBOL Name: 500-TXN-LOW-AMT-U
      * - txnHighAmtU500                 COBOL Name: 500-TXN-HIGH-AMT-U
      * - maid500                        COBOL Name: 500-MAID
      * - ip98151TjfDe48se32             COBOL Name: IP98151-TJF-DE48SE32
      * - ip98151TjfTlrMrchId            COBOL Name: IP98151-TJF-TLR-MRCH-ID
      * - ip98151TjfTlrP176Id            COBOL Name: IP98151-TJF-TLR-P176-ID
      * - maid800                        COBOL Name: 800-MAID
      * - viaRate500                     COBOL Name: 500-VIA-RATE
      * - fiaAmt500                      COBOL Name: 500-FIA-AMT
      * - minAmt500                      COBOL Name: 500-MIN-AMT
      * - maxAmt500                      COBOL Name: 500-MAX-AMT
      *
      * Output :  

      * - isEndOfLoop100                 COBOL Name: 100-IS-END-OF-LOOP
      * - isMaidFound100                 COBOL Name: 100-IS-MAID-FOUND
      * - ichgIdx500                     COBOL Name: 500-ICHG-IDX
      * - viaRate800                     COBOL Name: 800-VIA-RATE
      * - viaRate500                     COBOL Name: 500-VIA-RATE
      * - fiaAmt800                      COBOL Name: 800-FIA-AMT
      * - fiaAmt500                      COBOL Name: 500-FIA-AMT
      * - minAmt800                      COBOL Name: 800-MIN-AMT
      * - minAmt500                      COBOL Name: 500-MIN-AMT
      * - maxAmt800                      COBOL Name: 800-MAX-AMT
      * - maxAmt500                      COBOL Name: 500-MAX-AMT
      *
      * @throws CFException
      */
      private void searchMaidId() throws Exception {
			// Declare local variables used in the method
			Ip00164TableData ip00164TableData = ip00164TableEntry.getIp00164TableData();
			Ip98152RecordPart2 ip98152RecordPart2 = sys001TjfIp370Rec.getIp98152RecordPart2();
			Ip98151RecordPart1 ip98151RecordPart1 = sys001TjfIp370Rec.getIp98151RecordPart1();
			char[] ip98151TjfDe48se32 = null;
			char[] ip98151TjfTlrMrchId = null;
			char[] ip98151TjfTlrP176Id = null;
			char[] maid800 = null;
			// End of variable declaration

      
// *--------------------------------------------------------------*
// *This paragraph used to search maid identifier
// *--------------------------------------------------------------*
//  SET 88-100-IT-IS-NOT-END-LOOP TO TRUE
          work.setItIsNotEndLoop88100True(); 
          
//  SET 88-100-IT-IS-MAID-FND-N TO TRUE
          work.setItIsMaidFndN88100True(); 
          
//  PERFORM VARYING 500-ICHG-IDX FROM 1 BY 1 UNTIL 500-ICHG-IDX GREATER 500-ICHG-ENTRIES-CNT OR 88-100-IT-IS-END-OF-LOOP
          for (ichgIdx500 = 1; (	( ichgIdx500 <= ichgFeeRecords500.getIchgEntriesCnt500() )  && !(work.isItIsEndOfLoop88100()) ) ; ichgIdx500 = ichgIdx500 + 1 ) {
              ip98151TjfDe48se32 = ip98151RecordPart1.getIp98151TjfDe48se32();
              ip98151TjfTlrMrchId = ip98151RecordPart1.getIp98151TjfTlrMrchId();
              maid800 = holdVariables800.getMaid800();
              ip98151TjfTlrP176Id = ip98151RecordPart1.getIp98151TjfTlrP176Id();
//  IF ( IP00164-PROD-CAT-CD EQUAL 500-REC-TYPE ( 500-ICHG-IDX ) AND IP98152-CLR-TXN-AMT GREATER THAN OR EQUAL 500-TXN-LOW-AMT-U ( 500-ICHG-IDX ) AND IP98152-CLR-TXN-AMT LESS THAN 500-TXN-HIGH-AMT-U ( 500-ICHG-IDX )) AND ( 500-MAID ( 500-ICHG-IDX ) NOT EQUAL SPACES AND ( 500-MAID ( 500-ICHG-IDX ) EQUAL IP98151-TJF-DE48SE32 OR 500-MAID ( 500-ICHG-IDX ) EQUAL IP98151-TJF-TLR-MRCH-ID OR 500-MAID ( 500-ICHG-IDX ) EQUAL IP98151-TJF-TLR-P176-ID OR 500-MAID ( 500-ICHG-IDX ) EQUAL 800-MAID ))
              if ((		compareChars(ip00164TableData.getIp00164ProdCatCd(),ichgFeeRecords500.getIchgEntry500(ichgIdx500 - 1).getRecType500()) == 0  && 	( ip98152RecordPart2.getIp98152ClrTxnAmt() >= ichgFeeRecords500.getIchgEntry500(ichgIdx500 - 1).getTxnLowAmtU500() ) && 	( ip98152RecordPart2.getIp98152ClrTxnAmt() < ichgFeeRecords500.getIchgEntry500(ichgIdx500 - 1).getTxnHighAmtU500() )) && (        ( !allSpaces(ichgFeeRecords500.getIchgEntry500(ichgIdx500 - 1).getMaid500())  ) && ((		compareChars(ichgFeeRecords500.getIchgEntry500(ichgIdx500 - 1).getMaid500(),ip98151TjfDe48se32) == 0  || 		compareChars(ichgFeeRecords500.getIchgEntry500(ichgIdx500 - 1).getMaid500(),ip98151TjfTlrMrchId) == 0  || 		compareChars(ichgFeeRecords500.getIchgEntry500(ichgIdx500 - 1).getMaid500(),ip98151TjfTlrP176Id) == 0  || 		compareChars(ichgFeeRecords500.getIchgEntry500(ichgIdx500 - 1).getMaid500(),maid800) == 0 )))) { 
//  SET 88-100-IT-IS-END-OF-LOOP TO TRUE
                  work.setItIsEndOfLoop88100True(); 
                  
//  SET 88-100-IT-IS-MAID-FND-Y TO TRUE
                  work.setItIsMaidFndY88100True(); 
                  
//  MOVE 500-VIA-RATE ( 500-ICHG-IDX ) TO 800-VIA-RATE
                  ichgCalcVars800.setViaRate800(ichgFeeRecords500.getIchgEntry500(ichgIdx500 - 1).getViaRate500());
//  MOVE 500-FIA-AMT ( 500-ICHG-IDX ) TO 800-FIA-AMT
                  ichgCalcVars800.setFiaAmt800(ichgFeeRecords500.getIchgEntry500(ichgIdx500 - 1).getFiaAmt500());
//  MOVE 500-MIN-AMT ( 500-ICHG-IDX ) TO 800-MIN-AMT
                  ichgCalcVars800.setMinAmt800(ichgFeeRecords500.getIchgEntry500(ichgIdx500 - 1).getMinAmt500());
//  MOVE 500-MAX-AMT ( 500-ICHG-IDX ) TO 800-MAX-AMT
                  ichgCalcVars800.setMaxAmt800(ichgFeeRecords500.getIchgEntry500(ichgIdx500 - 1).getMaxAmt500());
//  PERFORM 8600-CALCULATE-ICHG-AMT
                  calculateIchgAmt();/*8600-CALCULATE-ICHG-AMT*/
              }
  
          }
      
      }
      /**
      * checkMccCode 
      *   This method is derived from 
  *   COBOL Paragraph - 8520-CHECK-MCC-CODE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - mccCode800                     COBOL Name: 800-MCC-CODE
      *
      * Output :  

      * - ip00754EntryFound              COBOL Name: IP00754-ENTRY-FOUND
      * - ip00754MccVals                 COBOL Name: IP00754-MCC-VALS
      * - mccCode800                     COBOL Name: 800-MCC-CODE
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      private void checkMccCode() throws Exception {
			// Declare local variables used in the method
			Ip00754MccValsKey ip00754MccValsKey = ip00754TableEntry.getIp00754MccValsKey();
			// End of variable declaration

      
// *--------------------------------------------------------------*
// *This paragraph calls table 75 api to check if mcc code is
// *valid or not for credit product type in order to apply
// *differential interchange. if entry is not found, the mcc code
// *is forced to override with value all '9's.
// *--------------------------------------------------------------*
//  SET 88-IP00754-ENTRY-FOUND-N TO TRUE
          ip00754EntryFoundGroup.setIp00754EntryFoundN88True(); 
          
//  MOVE 800-MCC-CODE TO IP00754-MCC-VALS
          ip00754MccValsKey.setIp00754MccVals(padLeftZeros(4,holdVariables800.getMccCode800(),false));
  
//  CALL 800-PTR-IP282010
          // CALL 800-PTR-IP282010
          	this.setRc( ip282010.process());
//  IF 88-IP00754-ENTRY-FOUND-N
          if ( ip00754EntryFoundGroup.isIp00754EntryFoundN88()  ) { 
//  SET 88-800-INVALID-MCC TO TRUE
              holdVariables800.setInvalidMcc88800True(); 
              
          }
      
      }
      /**
      * searchTxnMccAmt 
      *   This method is derived from 
  *   COBOL Paragraph - 8530-SEARCH-TXN-MCC-AMT COBOL Cyclomatic complexity - 10
      * Input  :  

      * - ichgIdx500                     COBOL Name: 500-ICHG-IDX
      * - ichgEntriesCnt500              COBOL Name: 500-ICHG-ENTRIES-CNT
      * - ip00164ProdCatCd               COBOL Name: IP00164-PROD-CAT-CD
      * - recType500                     COBOL Name: 500-REC-TYPE
      * - ip98152ClrTxnAmt               COBOL Name: IP98152-CLR-TXN-AMT
      * - txnLowAmtU500                  COBOL Name: 500-TXN-LOW-AMT-U
      * - txnHighAmtU500                 COBOL Name: 500-TXN-HIGH-AMT-U
      * - maid500                        COBOL Name: 500-MAID
      * - mcc500                         COBOL Name: 500-MCC
      * - mccCode800                     COBOL Name: 800-MCC-CODE
      * - viaRate500                     COBOL Name: 500-VIA-RATE
      * - fiaAmt500                      COBOL Name: 500-FIA-AMT
      * - minAmt500                      COBOL Name: 500-MIN-AMT
      * - maxAmt500                      COBOL Name: 500-MAX-AMT
      *
      * Output :  

      * - isEndOfLoop100                 COBOL Name: 100-IS-END-OF-LOOP
      * - isMccFound100                  COBOL Name: 100-IS-MCC-FOUND
      * - ichgIdx500                     COBOL Name: 500-ICHG-IDX
      * - viaRate800                     COBOL Name: 800-VIA-RATE
      * - viaRate500                     COBOL Name: 500-VIA-RATE
      * - fiaAmt800                      COBOL Name: 800-FIA-AMT
      * - fiaAmt500                      COBOL Name: 500-FIA-AMT
      * - minAmt800                      COBOL Name: 800-MIN-AMT
      * - minAmt500                      COBOL Name: 500-MIN-AMT
      * - maxAmt800                      COBOL Name: 800-MAX-AMT
      * - maxAmt500                      COBOL Name: 500-MAX-AMT
      *
      * @throws CFException
      */
      private void searchTxnMccAmt() throws Exception {
			// Declare local variables used in the method
			Ip00164TableData ip00164TableData = ip00164TableEntry.getIp00164TableData();
			Ip98152RecordPart2 ip98152RecordPart2 = sys001TjfIp370Rec.getIp98152RecordPart2();
			char[] ip00164ProdCatCd = null;
			char[] mccCode800 = null;
			long ip98152ClrTxnAmt = 0;
			// End of variable declaration

      
// *--------------------------------------------------------------*
// *This paragraph search by mcc code as lookup to retrieve       *
// *appropriate interchange rate.                                 *
// *--------------------------------------------------------------*
//  SET 88-100-IT-IS-NOT-END-LOOP TO TRUE
          work.setItIsNotEndLoop88100True(); 
          
//  SET 88-100-IT-IS-MCC-FND-N TO TRUE
          work.setItIsMccFndN88100True(); 
          
//  PERFORM VARYING 500-ICHG-IDX FROM 1 BY 1 UNTIL 500-ICHG-IDX GREATER 500-ICHG-ENTRIES-CNT OR 88-100-IT-IS-END-OF-LOOP
          for (ichgIdx500 = 1; (	( ichgIdx500 <= ichgFeeRecords500.getIchgEntriesCnt500() )  && !(work.isItIsEndOfLoop88100()) ) ; ichgIdx500 = ichgIdx500 + 1 ) {
              mccCode800 = holdVariables800.getMccCode800();
              ip00164ProdCatCd = ip00164TableData.getIp00164ProdCatCd();
//  IF IP00164-PROD-CAT-CD EQUAL 500-REC-TYPE ( 500-ICHG-IDX ) AND IP98152-CLR-TXN-AMT GREATER THAN OR EQUAL 500-TXN-LOW-AMT-U ( 500-ICHG-IDX ) AND IP98152-CLR-TXN-AMT LESS THAN 500-TXN-HIGH-AMT-U ( 500-ICHG-IDX ) AND 500-MAID ( 500-ICHG-IDX ) EQUAL SPACES AND 500-MCC ( 500-ICHG-IDX ) EQUAL 800-MCC-CODE
              if (		compareChars(ip00164ProdCatCd,ichgFeeRecords500.getIchgEntry500(ichgIdx500 - 1).getRecType500()) == 0  && 	( ip98152RecordPart2.getIp98152ClrTxnAmt() >= ichgFeeRecords500.getIchgEntry500(ichgIdx500 - 1).getTxnLowAmtU500() ) && 	( ip98152RecordPart2.getIp98152ClrTxnAmt() < ichgFeeRecords500.getIchgEntry500(ichgIdx500 - 1).getTxnHighAmtU500() ) &&         ( allSpaces(ichgFeeRecords500.getIchgEntry500(ichgIdx500 - 1).getMaid500())   ) && 		compareChars(ichgFeeRecords500.getIchgEntry500(ichgIdx500 - 1).getMcc500(),mccCode800) == 0 ) { 
//  SET 88-100-IT-IS-END-OF-LOOP TO TRUE
                  work.setItIsEndOfLoop88100True(); 
                  
//  SET 88-100-IT-IS-MCC-FND-Y TO TRUE
                  work.setItIsMccFndY88100True(); 
                  
//  MOVE 500-VIA-RATE ( 500-ICHG-IDX ) TO 800-VIA-RATE
                  ichgCalcVars800.setViaRate800(ichgFeeRecords500.getIchgEntry500(ichgIdx500 - 1).getViaRate500());
//  MOVE 500-FIA-AMT ( 500-ICHG-IDX ) TO 800-FIA-AMT
                  ichgCalcVars800.setFiaAmt800(ichgFeeRecords500.getIchgEntry500(ichgIdx500 - 1).getFiaAmt500());
//  MOVE 500-MIN-AMT ( 500-ICHG-IDX ) TO 800-MIN-AMT
                  ichgCalcVars800.setMinAmt800(ichgFeeRecords500.getIchgEntry500(ichgIdx500 - 1).getMinAmt500());
//  MOVE 500-MAX-AMT ( 500-ICHG-IDX ) TO 800-MAX-AMT
                  ichgCalcVars800.setMaxAmt800(ichgFeeRecords500.getIchgEntry500(ichgIdx500 - 1).getMaxAmt500());
//  PERFORM 8600-CALCULATE-ICHG-AMT
                  calculateIchgAmt();/*8600-CALCULATE-ICHG-AMT*/
              }
  
          }
      
      }
      /**
      * searchOthersGrp 
      *   This method is derived from 
  *   COBOL Paragraph - 8540-SEARCH-OTHERS-GRP COBOL Cyclomatic complexity - 11
      * Input  :  

      * - ichgIdx500                     COBOL Name: 500-ICHG-IDX
      * - ichgEntriesCnt500              COBOL Name: 500-ICHG-ENTRIES-CNT
      * - ip00164ProdCatCd               COBOL Name: IP00164-PROD-CAT-CD
      * - recType500                     COBOL Name: 500-REC-TYPE
      * - ip98152ClrTxnAmt               COBOL Name: IP98152-CLR-TXN-AMT
      * - txnLowAmtU500                  COBOL Name: 500-TXN-LOW-AMT-U
      * - txnHighAmtU500                 COBOL Name: 500-TXN-HIGH-AMT-U
      * - maid500                        COBOL Name: 500-MAID
      * - mcc500                         COBOL Name: 500-MCC
      * - prodId800                      COBOL Name: 800-PROD-ID
      * - prodId500                      COBOL Name: 500-PROD-ID
      * - viaRate500                     COBOL Name: 500-VIA-RATE
      * - fiaAmt500                      COBOL Name: 500-FIA-AMT
      * - minAmt500                      COBOL Name: 500-MIN-AMT
      * - maxAmt500                      COBOL Name: 500-MAX-AMT
      *
      * Output :  

      * - isEndOfLoop100                 COBOL Name: 100-IS-END-OF-LOOP
      * - ichgIdx500                     COBOL Name: 500-ICHG-IDX
      * - viaRate800                     COBOL Name: 800-VIA-RATE
      * - viaRate500                     COBOL Name: 500-VIA-RATE
      * - fiaAmt800                      COBOL Name: 800-FIA-AMT
      * - fiaAmt500                      COBOL Name: 500-FIA-AMT
      * - minAmt800                      COBOL Name: 800-MIN-AMT
      * - minAmt500                      COBOL Name: 500-MIN-AMT
      * - maxAmt800                      COBOL Name: 800-MAX-AMT
      * - maxAmt500                      COBOL Name: 500-MAX-AMT
      *
      * @throws CFException
      */
      private void searchOthersGrp() throws Exception {
			// Declare local variables used in the method
			Ip00164TableData ip00164TableData = ip00164TableEntry.getIp00164TableData();
			Ip98152RecordPart2 ip98152RecordPart2 = sys001TjfIp370Rec.getIp98152RecordPart2();
			char[] ip00164ProdCatCd = null;
			char[] prodId800 = null;
			long ip98152ClrTxnAmt = 0;
			// End of variable declaration

      
// *--------------------------------------------------------------*
// *This paragraph used to search with txn. amount where mcc code *
// *is valid but it doesn't find any matching lookup entries.     *
// *i.e. it falls under all other merchant group.                 *
// *--------------------------------------------------------------*
//  SET 88-100-IT-IS-NOT-END-LOOP TO TRUE
          work.setItIsNotEndLoop88100True(); 
          
//  PERFORM VARYING 500-ICHG-IDX FROM 1 BY 1 UNTIL 500-ICHG-IDX GREATER 500-ICHG-ENTRIES-CNT OR 88-100-IT-IS-END-OF-LOOP
          for (ichgIdx500 = 1; (	( ichgIdx500 <= ichgFeeRecords500.getIchgEntriesCnt500() )  && !(work.isItIsEndOfLoop88100()) ) ; ichgIdx500 = ichgIdx500 + 1 ) {
              prodId800 = holdVariables800.getProdId800();
              ip00164ProdCatCd = ip00164TableData.getIp00164ProdCatCd();
//  IF ( IP00164-PROD-CAT-CD EQUAL 500-REC-TYPE ( 500-ICHG-IDX ) AND IP98152-CLR-TXN-AMT GREATER THAN OR EQUAL 500-TXN-LOW-AMT-U ( 500-ICHG-IDX ) AND IP98152-CLR-TXN-AMT LESS THAN 500-TXN-HIGH-AMT-U ( 500-ICHG-IDX ) AND 500-MAID ( 500-ICHG-IDX ) EQUAL SPACES AND 500-MCC ( 500-ICHG-IDX ) EQUAL SPACES AND 800-PROD-ID EQUAL 500-PROD-ID ( 500-ICHG-IDX ))
              if ((		compareChars(ip00164ProdCatCd,ichgFeeRecords500.getIchgEntry500(ichgIdx500 - 1).getRecType500()) == 0  && 	( ip98152RecordPart2.getIp98152ClrTxnAmt() >= ichgFeeRecords500.getIchgEntry500(ichgIdx500 - 1).getTxnLowAmtU500() ) && 	( ip98152RecordPart2.getIp98152ClrTxnAmt() < ichgFeeRecords500.getIchgEntry500(ichgIdx500 - 1).getTxnHighAmtU500() ) &&         ( allSpaces(ichgFeeRecords500.getIchgEntry500(ichgIdx500 - 1).getMaid500())   ) &&         ( allSpaces(ichgFeeRecords500.getIchgEntry500(ichgIdx500 - 1).getMcc500())   ) && 		compareChars(prodId800,ichgFeeRecords500.getIchgEntry500(ichgIdx500 - 1).getProdId500()) == 0 )) { 
//  SET 88-100-IT-IS-END-OF-LOOP TO TRUE
                  work.setItIsEndOfLoop88100True(); 
                  
//  MOVE 500-VIA-RATE ( 500-ICHG-IDX ) TO 800-VIA-RATE
                  ichgCalcVars800.setViaRate800(ichgFeeRecords500.getIchgEntry500(ichgIdx500 - 1).getViaRate500());
//  MOVE 500-FIA-AMT ( 500-ICHG-IDX ) TO 800-FIA-AMT
                  ichgCalcVars800.setFiaAmt800(ichgFeeRecords500.getIchgEntry500(ichgIdx500 - 1).getFiaAmt500());
//  MOVE 500-MIN-AMT ( 500-ICHG-IDX ) TO 800-MIN-AMT
                  ichgCalcVars800.setMinAmt800(ichgFeeRecords500.getIchgEntry500(ichgIdx500 - 1).getMinAmt500());
//  MOVE 500-MAX-AMT ( 500-ICHG-IDX ) TO 800-MAX-AMT
                  ichgCalcVars800.setMaxAmt800(ichgFeeRecords500.getIchgEntry500(ichgIdx500 - 1).getMaxAmt500());
//  PERFORM 8600-CALCULATE-ICHG-AMT
                  calculateIchgAmt();/*8600-CALCULATE-ICHG-AMT*/
              }
  
          }
      
      }
      /**
      * calculateIchgAmt 
      *   This method is derived from 
  *   COBOL Paragraph - 8600-CALCULATE-ICHG-AMT COBOL Cyclomatic complexity - 3
      * Input  :  

      * - viaRate800                     COBOL Name: 800-VIA-RATE
      * - clrTxnAmt6800                  COBOL Name: 800-CLR-TXN-AMT-6
      * - fiaAmt800                      COBOL Name: 800-FIA-AMT
      * - maxAmt800                      COBOL Name: 800-MAX-AMT
      *
      * Output :  

      * - isIchgCalculated100            COBOL Name: 100-IS-ICHG-CALCULATED
      * - viaAmt800                      COBOL Name: 800-VIA-AMT
      * - netAmt800                      COBOL Name: 800-NET-AMT
      * - maxAmt800                      COBOL Name: 800-MAX-AMT
      *
      * @throws CFException
      */
      private void calculateIchgAmt() throws Exception {
			// Declare local variables used in the method
			BigDecimal netAmt800 = BigDecimal.ZERO;
			BigDecimal maxAmt800 = BigDecimal.ZERO;
			// End of variable declaration

      
// *--------------------------------------------------------------*
// *This paragraph calculates interchange amount based on determined
// *via rate and fia amount.
// *--------------------------------------------------------------*
//  SET 88-100-ICHG-CALCULATED-Y TO TRUE
          work.setIchgCalculatedY88100True(); 
          
//  PERFORM 8610-ALIGN-TXN-AMT-DECIMAL
          alignTxnAmtDecimal();/*8610-ALIGN-TXN-AMT-DECIMAL*/
          ichgCalcVars800.setViaAmt800(ichgCalcVars800.getViaRate800().divide(BigDecimal.valueOf(100),18,RoundingMode.DOWN).setScale(7,BigDecimal.ROUND_DOWN).multiply(ichgCalcVars800.getClrTxnAmt6800()).setScale(6,RoundingMode.HALF_UP));
          if(ichgCalcVars800.getViaAmt800().signum() < 0 )  ichgCalcVars800.setViaAmt800(ichgCalcVars800.getViaAmt800().negate());
          ichgCalcVars800.setNetAmt800(ichgCalcVars800.getViaAmt800().add(ichgCalcVars800.getFiaAmt800()).setScale(7,BigDecimal.ROUND_DOWN).setScale(6,RoundingMode.HALF_UP));
          if(ichgCalcVars800.getNetAmt800().signum() < 0 )  ichgCalcVars800.setNetAmt800(ichgCalcVars800.getNetAmt800().negate());
          maxAmt800 = ichgCalcVars800.getMaxAmt800();
//  IF 800-MAX-AMT GREATER THAN ZERO
          if (	( maxAmt800.compareTo(BigDecimal.valueOf(0)) > 0)) { 
              netAmt800 = ichgCalcVars800.getNetAmt800();
              maxAmt800 = ichgCalcVars800.getMaxAmt800();
//  IF 800-NET-AMT GREATER THAN 800-MAX-AMT
              if (			( netAmt800.compareTo(maxAmt800) > 0) ) { 
//  MOVE 800-MAX-AMT TO 800-NET-AMT
                  ichgCalcVars800.setNetAmt800(ichgCalcVars800.getMaxAmt800());
              }
  
          }
  
//  PERFORM 8620-ALIGN-ICHG-FEE-AMT
          alignIchgFeeAmt();/*8620-ALIGN-ICHG-FEE-AMT*/
          ;
      
      }
      /**
      * alignTxnAmtDecimal 
      *   This method is derived from 
  *   COBOL Paragraph - 8610-ALIGN-TXN-AMT-DECIMAL COBOL Cyclomatic complexity - 8
      * Input  :  

      * - ip98152ClrTxnCurrCd            COBOL Name: IP98152-CLR-TXN-CURR-CD
      * - ip98152ClrTxnAmt               COBOL Name: IP98152-CLR-TXN-AMT
      *
      * Output :  

      * - ip00174CurrCdKey               COBOL Name: IP00174-CURR-CD-KEY
      * - ip98152ClrTxnCurrCd            COBOL Name: IP98152-CLR-TXN-CURR-CD
      * - rc                             COBOL Name: RETURN-CODE
      * - clrTxnAmt6800                  COBOL Name: 800-CLR-TXN-AMT-6
      *
      * @throws CFException
      */
      private void alignTxnAmtDecimal() throws Exception {
			// Declare local variables used in the method
			Ip98152RecordPart2 ip98152RecordPart2 = sys001TjfIp370Rec.getIp98152RecordPart2();
			// End of variable declaration

      
// *--------------------------------------------------------------*
// *This paragraph aligns transaction amount to respecitve decimals
// *--------------------------------------------------------------*
//  MOVE IP98152-CLR-TXN-CURR-CD TO IP00174-CURR-CD-KEY
          ip00174TableEntry.getIp00174CurrCdKey().setString(ip98152RecordPart2.getIp98152ClrTxnCurrCd());
  
//  CALL 800-PTR-IP288010
          // CALL 800-PTR-IP288010
          	this.setRc( ip288010.process());
//  EVALUATE IP00174-CUR-EXP-CODE
          switch(ip00174TableEntry.getIp00174CurExpCode()){
          	case 0:
              ichgCalcVars800.setClrTxnAmt6800(BigDecimal.valueOf(sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrTxnAmt()));
              if(ichgCalcVars800.getClrTxnAmt6800().signum() < 0 )  ichgCalcVars800.setClrTxnAmt6800(ichgCalcVars800.getClrTxnAmt6800().negate());
          break;
          	case 1:
              ichgCalcVars800.setClrTxnAmt6800(BigDecimal.valueOf(sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrTxnAmt()).divide(BigDecimal.TEN,18,RoundingMode.DOWN).setScale(6,BigDecimal.ROUND_DOWN));
              if(ichgCalcVars800.getClrTxnAmt6800().signum() < 0 )  ichgCalcVars800.setClrTxnAmt6800(ichgCalcVars800.getClrTxnAmt6800().negate());
          break;
          	case 2:
              ichgCalcVars800.setClrTxnAmt6800(BigDecimal.valueOf(sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrTxnAmt()).divide(BigDecimal.valueOf(100),18,RoundingMode.DOWN).setScale(6,BigDecimal.ROUND_DOWN));
              if(ichgCalcVars800.getClrTxnAmt6800().signum() < 0 )  ichgCalcVars800.setClrTxnAmt6800(ichgCalcVars800.getClrTxnAmt6800().negate());
          break;
          	case 3:
              ichgCalcVars800.setClrTxnAmt6800(BigDecimal.valueOf(sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrTxnAmt()).divide(BigDecimal.valueOf(1000),18,RoundingMode.DOWN).setScale(6,BigDecimal.ROUND_DOWN));
              if(ichgCalcVars800.getClrTxnAmt6800().signum() < 0 )  ichgCalcVars800.setClrTxnAmt6800(ichgCalcVars800.getClrTxnAmt6800().negate());
          break;
          	case 4:
              ichgCalcVars800.setClrTxnAmt6800(BigDecimal.valueOf(sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrTxnAmt()).divide(BigDecimal.valueOf(10000),18,RoundingMode.DOWN).setScale(6,BigDecimal.ROUND_DOWN));
              if(ichgCalcVars800.getClrTxnAmt6800().signum() < 0 )  ichgCalcVars800.setClrTxnAmt6800(ichgCalcVars800.getClrTxnAmt6800().negate());
          break;
          	case 5:
              ichgCalcVars800.setClrTxnAmt6800(BigDecimal.valueOf(sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrTxnAmt()).divide(BigDecimal.valueOf(100000),18,RoundingMode.DOWN).setScale(6,BigDecimal.ROUND_DOWN));
              if(ichgCalcVars800.getClrTxnAmt6800().signum() < 0 )  ichgCalcVars800.setClrTxnAmt6800(ichgCalcVars800.getClrTxnAmt6800().negate());
          break;
          	case 6:
              ichgCalcVars800.setClrTxnAmt6800(BigDecimal.valueOf(sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrTxnAmt()).divide(BigDecimal.valueOf(1000000),18,RoundingMode.DOWN).setScale(6,BigDecimal.ROUND_DOWN));
              if(ichgCalcVars800.getClrTxnAmt6800().signum() < 0 )  ichgCalcVars800.setClrTxnAmt6800(ichgCalcVars800.getClrTxnAmt6800().negate());
          break;
          }
      
      }
      /**
      * alignIchgFeeAmt 
      *   This method is derived from 
  *   COBOL Paragraph - 8620-ALIGN-ICHG-FEE-AMT COBOL Cyclomatic complexity - 8
      * Input  :  

      * - netAmt800                      COBOL Name: 800-NET-AMT
      *
      * Output :  

      * - ip33701TargetAmount            COBOL Name: IP33701-TARGET-AMOUNT
      * - netAmt800                      COBOL Name: 800-NET-AMT
      * - ip33701TargetAmount1           COBOL Name: IP33701-TARGET-AMOUNT-1
      * - ip33701TargetAmount2           COBOL Name: IP33701-TARGET-AMOUNT-2
      * - ip33701TargetAmount3           COBOL Name: IP33701-TARGET-AMOUNT-3
      * - ip33701TargetAmount4           COBOL Name: IP33701-TARGET-AMOUNT-4
      * - ip33701TargetAmount5           COBOL Name: IP33701-TARGET-AMOUNT-5
      * - ip33701TargetAmount6           COBOL Name: IP33701-TARGET-AMOUNT-6
      *
      * @throws CFException
      */
      private void alignIchgFeeAmt() throws Exception {
			// Declare local variables used in the method
			Ip33701CurrConvOutput ip33701CurrConvOutput = ip33701CurrConvInterface.getIp33701CurrConvOutput();
			// End of variable declaration

      
// *--------------------------------------------------------------*
// *This paragraph aligns calculated ichg fee amt to its respective
// *currency exponent.
// *--------------------------------------------------------------*
//  EVALUATE IP00174-CUR-EXP-CODE
          switch(ip00174TableEntry.getIp00174CurExpCode()){
          	case 0:
              ip33701CurrConvInterface.getIp33701CurrConvOutput().setIp33701TargetAmount(ichgCalcVars800.getNetAmt800().setScale(0,BigDecimal.ROUND_HALF_UP).longValue());
//  MOVE IP33701-TARGET-AMOUNT TO 800-NET-AMT
              ichgCalcVars800.setNetAmt800(BigDecimal.valueOf(ip33701CurrConvOutput.getIp33701TargetAmount()));
  
          break;
          	case 1:
              ip33701CurrConvInterface.getIp33701CurrConvOutput().setIp33701TargetAmount1(ichgCalcVars800.getNetAmt800().setScale(1,RoundingMode.HALF_UP));
//  MOVE IP33701-TARGET-AMOUNT-1 TO 800-NET-AMT
              ichgCalcVars800.setNetAmt800(ip33701CurrConvOutput.getIp33701TargetAmount1());
  
          break;
          	case 2:
              ip33701CurrConvInterface.getIp33701CurrConvOutput().setIp33701TargetAmount2(ichgCalcVars800.getNetAmt800().setScale(2,RoundingMode.HALF_UP));
//  MOVE IP33701-TARGET-AMOUNT-2 TO 800-NET-AMT
              ichgCalcVars800.setNetAmt800(ip33701CurrConvOutput.getIp33701TargetAmount2());
  
          break;
          	case 3:
              ip33701CurrConvInterface.getIp33701CurrConvOutput().setIp33701TargetAmount3(ichgCalcVars800.getNetAmt800().setScale(3,RoundingMode.HALF_UP));
//  MOVE IP33701-TARGET-AMOUNT-3 TO 800-NET-AMT
              ichgCalcVars800.setNetAmt800(ip33701CurrConvOutput.getIp33701TargetAmount3());
  
          break;
          	case 4:
              ip33701CurrConvInterface.getIp33701CurrConvOutput().setIp33701TargetAmount4(ichgCalcVars800.getNetAmt800().setScale(4,RoundingMode.HALF_UP));
//  MOVE IP33701-TARGET-AMOUNT-4 TO 800-NET-AMT
              ichgCalcVars800.setNetAmt800(ip33701CurrConvOutput.getIp33701TargetAmount4());
  
          break;
          	case 5:
              ip33701CurrConvInterface.getIp33701CurrConvOutput().setIp33701TargetAmount5(ichgCalcVars800.getNetAmt800().setScale(5,RoundingMode.HALF_UP));
//  MOVE IP33701-TARGET-AMOUNT-5 TO 800-NET-AMT
              ichgCalcVars800.setNetAmt800(ip33701CurrConvOutput.getIp33701TargetAmount5());
  
          break;
          	case 6:
              ip33701CurrConvInterface.getIp33701CurrConvOutput().setIp33701TargetAmount6(ichgCalcVars800.getNetAmt800().setScale(6,RoundingMode.HALF_UP));
//  MOVE IP33701-TARGET-AMOUNT-6 TO 800-NET-AMT
              ichgCalcVars800.setNetAmt800(ip33701CurrConvOutput.getIp33701TargetAmount6());
  
          break;
          }
      
      }
      /**
      * abendProgram 
      *   This method is derived from 
  *   COBOL Paragraph - 9500-ABEND-PROGRAM COBOL Cyclomatic complexity - 1
      * Input  :  

      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - abendMessage900                COBOL Name: 900-ABEND-MESSAGE
      *
      * Output :  

      * - ip60001EventErrorMsg           COBOL Name: IP60001-EVENT-ERROR-MSG
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - ip60001EventErrorCode          COBOL Name: IP60001-EVENT-ERROR-CODE
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      private void abendProgram() throws Exception {
      
// *--------------------------------------------------------------*
// *Abend routine.                                                *
// *--------------------------------------------------------------*
//  MOVE 900-ABEND-TEXT TO IP60001-EVENT-ERROR-MSG
          ip60001EventLogWorkArea.setIp60001EventErrorMsg(abendMessage900.getAbendText900());
//  MOVE 900-ABEND-CODE TO IP60001-EVENT-ERROR-CODE
          ip60001EventLogWorkArea.setIp60001EventErrorCode(abendMessage900.getAbendCode900());
//  DISPLAY '***********************************'
          logger.info("***********************************"); 
//  DISPLAY 'A B E N D   A B E N D   A B E N D  '
          logger.info("A B E N D   A B E N D   A B E N D  "); 
//  DISPLAY 'A B E N D   I P 0 8 8 0 3 0        '
          logger.info("A B E N D   I P 0 8 8 0 3 0        "); 
//  DISPLAY '***********************************'
          logger.info("***********************************"); 
//  DISPLAY 900-ABEND-PARA
          logger.info(abendPara900.toString()); 
//  DISPLAY 900-ABEND-MESSAGE
          logger.info(abendMessage900.toString()); 
//  CALL 300-PGM-IP610010
          // CALL 300-PGM-IP610010
          	this.setRc( ip610010.process());
      
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
  
  
  
  
  
  
  }
