  package com.cloudframe.app.process.impl;
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
  import com.cloudframe.app.ip088030.Ip088030Ctx.*;
  import com.cloudframe.app.ip088030.Ip088030Ctx;
  import com.cloudframe.app.process.Ip088030;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.process.Ip996010;
  import com.cloudframe.app.process.*;
  import com.cloudframe.app.process.Ip081110;
  import org.springframework.beans.factory.annotation.Value;
  import com.cloudframe.app.process.Ip288010;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.process.Ip280010;
  import com.cloudframe.app.process.Ip280510;
  import com.cloudframe.app.process.Ip783510;
  import java.math.BigDecimal;
  import com.cloudframe.app.process.Ip282010;
  import java.math.RoundingMode;
  import com.cloudframe.app.process.Ip610010;
  import com.cloudframe.app.ip088030.dto.*;
  import com.cloudframe.app.ip088030.dto.MsgsRead600;
  import com.cloudframe.app.ip088030.dto.InternalTblCnt600;
  import com.cloudframe.app.ip088030.file.records.Sys001TjfIp370Rec;
  import com.cloudframe.app.ip088030.dto.HoldVariables800;
  import com.cloudframe.app.ip088030.file.records.Sys002CntlIchgRec;
  import com.cloudframe.app.ip088030.dto.SrceTrgCurExpErr0rMsg600;
  import com.cloudframe.app.ip088030.dto.AbendPara900;
  import com.cloudframe.app.ip088030.file.records.Sys201OutputRecord;
  import com.cloudframe.app.ip088030.dto.IchgCalcVars800;
  import com.cloudframe.app.ip088030.dto.AbendMessage900;
  import com.cloudframe.app.global.sharedvar.Ip0040iAccountRangeInfo;
  import com.cloudframe.app.ip088030.dto.AbendMessage600;
  import com.cloudframe.app.ip088030.dto.MsgsWrite600;
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
  
  public class Ip088030Impl extends CommonProcess implements Ip088030 {
  
  Logger logger = LoggerFactory.getLogger(Ip088030Impl.class);
  
  
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
  
  
  
  
  
  
      /**
      * process 
      * Input  :  

      * - sys001FileStatus200            COBOL Name: 200-SYS001-FILE-STATUS
      *
      * Output : None 

      * @throws CFException
      */
      public int process(Ip088030Ctx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
ProcessInCtx methodIn = programCtx.getProcessInCtx();
//  PERFORM 1000-DO-INITIALIZATION
          doInitialization(programCtx.getDoInitializationInCtx());/*1000-DO-INITIALIZATION*/
          if (programCtx.isProgramEnded()) {
              return programCtx.getRc();
          }
//  PERFORM 8000-READ-SYS001-FILE
          readSys001File(programCtx.getReadSys001FileInCtx());/*8000-READ-SYS001-FILE*/
          if (programCtx.isProgramEnded()) {
              return programCtx.getRc();
          }
//  PERFORM 2000-PROCESS-INPUT-FILE UNTIL 88-200-SYS001-EOF
          while (!(methodIn.isSys001Eof88200()) ) {
             processInputFile(programCtx.getProcessInputFileInCtx());/*2000-PROCESS-INPUT-FILE*/
             if (programCtx.isProgramEnded()) {
                 return programCtx.getRc();
             }
          }
//  PERFORM 3000-CLOSE-FILES
          closeFiles(programCtx.getCloseFilesInCtx());/*3000-CLOSE-FILES*/
          if (programCtx.isProgramEnded()) {
              return programCtx.getRc();
          }
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return programCtx.getRc();
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
      @Override
      public DoInitializationOutCtx doInitialization(DoInitializationInCtx methodIn) throws Exception {
      
// *--------------------------------------------------------------*
// *Startup routine to perform initialization
// *--------------------------------------------------------------*
Ip088030Ctx programCtx = methodIn.getIp088030Ctx();
DoInitializationOutCtx methodOut = methodIn.getDoInitializationOutCtx();
//  MOVE ZEROES TO 500-ICHG-ENTRIES-CNT
          methodOut.setIchgEntriesCnt500((short) 0);
//  PERFORM 1100-DISPLAY-EXEC-MSGS
          displayExecMsgs(programCtx.getDisplayExecMsgsInCtx());/*1100-DISPLAY-EXEC-MSGS*/
//  PERFORM 1200-SET-PROCEDURE-POINTERS
          setProcedurePointers(programCtx.getSetProcedurePointersInCtx());/*1200-SET-PROCEDURE-POINTERS*/
//  PERFORM 1300-OPEN-ALL-FILES
          openAllFiles(programCtx);/*1300-OPEN-ALL-FILES*/
//  PERFORM 1400-CALL-RUNCNTL-API
          callRuncntlApi(programCtx.getCallRuncntlApiInCtx());/*1400-CALL-RUNCNTL-API*/
//  PERFORM 8100-READ-SYS002-FILE
          readSys002File(programCtx.getReadSys002FileInCtx());/*8100-READ-SYS002-FILE*/
//  PERFORM 1500-LOAD-ICHG-FEE-TABLE UNTIL 88-200-SYS002-EOF
          while (!(methodIn.isSys002Eof88200()) ) {
             loadIchgFeeTable(programCtx.getLoadIchgFeeTableInCtx());/*1500-LOAD-ICHG-FEE-TABLE*/
          }
          ;
      
      return methodOut;
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
      @Override
      public DisplayExecMsgsOutCtx displayExecMsgs(DisplayExecMsgsInCtx methodIn) throws Exception {
      
// *--------------------------------------------------------------*
// *This paragraph displays execution messages.                   *
// *--------------------------------------------------------------*
Ip088030Ctx programCtx = methodIn.getIp088030Ctx();
DisplayExecMsgsOutCtx methodOut = methodIn.getDisplayExecMsgsOutCtx();
//  SET 800-PTR-IP996010 TO ENTRY 300-PGM-IP996010
          methodOut.setPtrIp996010800(methodIn.getPgmIp996010300()); 
          
//  MOVE 300-PGM-ID TO IP996011-PGM-ID
          methodOut.setIp996011PgmId(methodOut.getPgmId300());
//  MOVE 300-PGM-VERSION TO IP996011-PGM-VERSION
          methodOut.setIp996011PgmVersion(methodOut.getPgmVersion300());
          // MOVE WHEN-COMPILED TO IP996011-WHEN-COMPILED
          //  FORMAT1311677340 = "X(08)BX(08)"
          methodOut.setIp996011WhenCompiled(CFUtil.cobolAnEditFormatter(CONSTANTS.FORMAT1311677340,CONSTANTS.LITERAL_1821800699));
//  CALL 800-PTR-IP996010
          // CALL 800-PTR-IP996010
          	programCtx.setRc( ip996010.process(programCtx.getGlobalCtx().getContext("IP996010")));
      
      return methodOut;
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
      @Override
      public SetProcedurePointersOutCtx setProcedurePointers(SetProcedurePointersInCtx methodIn) throws Exception {
      
// *--------------------------------------------------------------*
// *This paragraph sets procedure pointers.
// *--------------------------------------------------------------*
Ip088030Ctx programCtx = methodIn.getIp088030Ctx();
SetProcedurePointersOutCtx methodOut = methodIn.getSetProcedurePointersOutCtx();
//  SET 800-PTR-IP610010 TO ENTRY 300-PGM-IP610010
          methodOut.setPtrIp610010800(methodIn.getPgmIp610010300()); 
          
//  SET 800-PTR-IP081110 TO ENTRY 300-PGM-IP081110
          methodOut.setPtrIp081110800(methodIn.getPgmIp081110300()); 
          
//  SET 800-PTR-IP280010 TO ENTRY 300-PGM-IP280010
          methodOut.setPtrIp280010800(methodIn.getPgmIp280010300()); 
          
//  SET 800-PTR-IP280510 TO ENTRY 300-PGM-IP280510
          methodOut.setPtrIp280510800(methodIn.getPgmIp280510300()); 
          
//  SET 800-PTR-IP282010 TO ENTRY 300-PGM-IP282010
          methodOut.setPtrIp282010800(methodIn.getPgmIp282010300()); 
          
//  SET 800-PTR-IP288010 TO ENTRY 300-PGM-IP288010
          methodOut.setPtrIp288010800(methodIn.getPgmIp288010300()); 
          
//  SET 800-PTR-IP783510 TO ENTRY 300-PGM-IP783510
          methodOut.setPtrIp783510800(methodIn.getPgmIp783510300()); 
          
      
      return methodOut;
      }
      /**
      * openAllFiles 
      *   This method is derived from 
  *   COBOL Paragraph - 1300-OPEN-ALL-FILES COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void openAllFiles(Ip088030Ctx programCtx) throws Exception {
      
// *--------------------------------------------------------------*
// *This paragraph opens the input and output file.
// *--------------------------------------------------------------*
//  PERFORM 1310-OPEN-INPUT-SYS001
          openInputSys001(programCtx.getOpenInputSys001InCtx());/*1310-OPEN-INPUT-SYS001*/
//  PERFORM 1320-OPEN-INPUT-SYS002
          openInputSys002(programCtx.getOpenInputSys002InCtx());/*1320-OPEN-INPUT-SYS002*/
//  PERFORM 1330-OPEN-OUTPUT-SYS201
          openOutputSys201(programCtx.getOpenOutputSys201InCtx());/*1330-OPEN-OUTPUT-SYS201*/
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
      @Override
      public OpenInputSys001OutCtx openInputSys001(OpenInputSys001InCtx methodIn) throws Exception {
      
// *--------------------------------------------------------------*
// *This paragraph opens the input sys001.
// *--------------------------------------------------------------*
Ip088030Ctx programCtx = methodIn.getIp088030Ctx();
OpenInputSys001OutCtx methodOut = methodIn.getOpenInputSys001OutCtx();
//  OPEN INPUT SYS001-TJF-IP370-FILE
          sys001TjfIp370File.open(new String(CONSTANTS.MODE_READ_ONLY_36242),sys001TjfIp370File.getFileName(),sys001TjfIp370File.getSys001TjfIp370FileCharSet(),sys001TjfIp370File.getSys001TjfIp370FileCrlfFlag());
          methodOut.setSys001FileStatus200(sys001TjfIp370File.getStatusString() );
//  IF 88-200-SYS001-IO-GOOD
//  ELSE
          if (!(methodOut.isSys001IoGood88200()) ) { 
//  SET 88-300-OPEN-ABEND-CODE TO TRUE
              methodOut.setOpenAbendCode88300True(); 
              
//  SET 88-300-ABEND-PARA-1310 TO TRUE
              methodOut.setAbendPara131088300True(); 
              
//  SET 88-600-ABEND-OPEN-SYS001 TO TRUE
              methodOut.setAbendOpenSys00188600True(); 
              
//  MOVE 200-SYS001-FILE-STATUS TO 600-FILE-STATUS
              methodOut.setFileStatus600(methodOut.getSys001FileStatus200());
              // MOVE 600-ABEND-MESSAGE TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getAbendMessage600().toCharArray());
//  MOVE 300-ABEND-PARA-NAME TO 900-ABEND-PARA-NAME
              methodOut.setAbendParaName900(methodOut.getAbendParaName300());
//  MOVE 300-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(String.valueOf(methodOut.getAbendCode300String()).toCharArray());
//  PERFORM 9500-ABEND-PROGRAM
              abendProgram(programCtx.getAbendProgramInCtx());/*9500-ABEND-PROGRAM*/
          }
      
      return methodOut;
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
      @Override
      public OpenInputSys002OutCtx openInputSys002(OpenInputSys002InCtx methodIn) throws Exception {
      
// *--------------------------------------------------------------*
// *This paragraph opens the input sys002.
// *--------------------------------------------------------------*
Ip088030Ctx programCtx = methodIn.getIp088030Ctx();
OpenInputSys002OutCtx methodOut = methodIn.getOpenInputSys002OutCtx();
//  OPEN INPUT SYS002-CNTL-ICHG-FILE
          sys002CntlIchgFile.open(new String(CONSTANTS.MODE_READ_ONLY_36242),sys002CntlIchgFile.getFileName(),sys002CntlIchgFile.getSys002CntlIchgFileCharSet(),sys002CntlIchgFile.getSys002CntlIchgFileCrlfFlag());
          methodOut.setSys002FileStatus200(sys002CntlIchgFile.getStatusString() );
//  IF 88-200-SYS002-IO-GOOD
//  ELSE
          if (!(methodOut.isSys002IoGood88200()) ) { 
//  SET 88-300-OPEN-ABEND-CODE TO TRUE
              methodOut.setOpenAbendCode88300True(); 
              
//  SET 88-300-ABEND-PARA-1320 TO TRUE
              methodOut.setAbendPara132088300True(); 
              
//  SET 88-600-ABEND-OPEN-SYS002 TO TRUE
              methodOut.setAbendOpenSys00288600True(); 
              
//  MOVE 200-SYS002-FILE-STATUS TO 600-FILE-STATUS
              methodOut.setFileStatus600(methodOut.getSys002FileStatus200());
              // MOVE 600-ABEND-MESSAGE TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getAbendMessage600().toCharArray());
//  MOVE 300-ABEND-PARA-NAME TO 900-ABEND-PARA-NAME
              methodOut.setAbendParaName900(methodOut.getAbendParaName300());
//  MOVE 300-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(String.valueOf(methodOut.getAbendCode300String()).toCharArray());
//  PERFORM 9500-ABEND-PROGRAM
              abendProgram(programCtx.getAbendProgramInCtx());/*9500-ABEND-PROGRAM*/
          }
      
      return methodOut;
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
      @Override
      public OpenOutputSys201OutCtx openOutputSys201(OpenOutputSys201InCtx methodIn) throws Exception {
      
// *--------------------------------------------------------------*
// *This paragraph opens the output sys201.
// *--------------------------------------------------------------*
Ip088030Ctx programCtx = methodIn.getIp088030Ctx();
OpenOutputSys201OutCtx methodOut = methodIn.getOpenOutputSys201OutCtx();
//  OPEN OUTPUT SYS201-OUTPUT-FILE
          sys201OutputFile.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),sys201OutputFile.getFileName(),sys201OutputFile.getSys201OutputFileCharSet(),sys201OutputFile.getSys201OutputFileCrlfFlag());
          methodOut.setSys201FileStatus200(sys201OutputFile.getStatusString() );
//  IF 88-200-SYS201-IO-GOOD
//  ELSE
          if (!(methodOut.isSys201IoGood88200()) ) { 
//  SET 88-300-OPEN-ABEND-CODE TO TRUE
              methodOut.setOpenAbendCode88300True(); 
              
//  SET 88-300-ABEND-PARA-1330 TO TRUE
              methodOut.setAbendPara133088300True(); 
              
//  SET 88-600-ABEND-OPEN-SYS201 TO TRUE
              methodOut.setAbendOpenSys20188600True(); 
              
//  MOVE 200-SYS201-FILE-STATUS TO 600-FILE-STATUS
              methodOut.setFileStatus600(methodOut.getSys201FileStatus200());
              // MOVE 600-ABEND-MESSAGE TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getAbendMessage600().toCharArray());
//  MOVE 300-ABEND-PARA-NAME TO 900-ABEND-PARA-NAME
              methodOut.setAbendParaName900(methodOut.getAbendParaName300());
//  MOVE 300-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(String.valueOf(methodOut.getAbendCode300String()).toCharArray());
//  PERFORM 9500-ABEND-PROGRAM
              abendProgram(programCtx.getAbendProgramInCtx());/*9500-ABEND-PROGRAM*/
          }
      
      return methodOut;
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
      @Override
      public CallRuncntlApiOutCtx callRuncntlApi(CallRuncntlApiInCtx methodIn) throws Exception {
      
// *--------------------------------------------------------------*
// *This paragraph calls runcontrol api.
// *--------------------------------------------------------------*
Ip088030Ctx programCtx = methodIn.getIp088030Ctx();
CallRuncntlApiOutCtx methodOut = methodIn.getCallRuncntlApiOutCtx();
//  CALL 800-PTR-IP081110
          // CALL 800-PTR-IP081110
          	programCtx.setRc( ip081110.process(programCtx.getGlobalCtx().getContext("IP081110")));
//  IF RETURN-CODE EQUAL ZEROES
          if (	( programCtx.getRc() == 0 )) { 
//  MOVE IP08101-PROCESS-DATE TO IP50005-CLEARING-DT
              methodOut.setIp50005ClearingDt(String.valueOf(methodOut.getIp08101ProcessDateString()).toCharArray());
              // MOVE 14 TO IP50005-CLEARING-TM
              //  LITERAL_14 = 14
              methodOut.setIp50005ClearingTm(CONSTANTS.LITERAL_14);
          }
//  ELSE
          else { 
//  MOVE FUNCTION CURRENT-DATE TO IP50005-CLEARING-DT
              methodOut.setIp50005ClearingDt( substring(CFUtil.getCurrentDate(timeZoneId),0,8));
              // MOVE 14 TO IP50005-CLEARING-TM
              //  LITERAL_14 = 14
              methodOut.setIp50005ClearingTm(CONSTANTS.LITERAL_14);
          }
      
      return methodOut;
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
      @Override
      public LoadIchgFeeTableOutCtx loadIchgFeeTable(LoadIchgFeeTableInCtx methodIn) throws Exception {
      
// *--------------------------------------------------------------*
// *Loads all internal table entries                              *
// *--------------------------------------------------------------*
Ip088030Ctx programCtx = methodIn.getIp088030Ctx();
LoadIchgFeeTableOutCtx methodOut = methodIn.getLoadIchgFeeTableOutCtx();
//  IF 500-ICHG-ENTRIES-CNT LESS THAN 500-ICHG-ENTRIES-MAX
          if (	( methodOut.getIchgEntriesCnt500() < methodIn.getIchgEntriesMax500() )) { 
//  ADD 1 TO 500-ICHG-ENTRIES-CNT
              methodOut.setIchgEntriesCnt500( (short) (methodOut.getIchgEntriesCnt500()+(short)1));
//  SET 500-ICHG-IDX TO 500-ICHG-ENTRIES-CNT
              methodOut.setIchgIdx500(methodOut.getIchgEntriesCnt500()); 
              
//  IF IP98153-88-VALID-REC-TYPE
              if ( methodIn.isIp9815388ValidRecType()  ) { 
//  MOVE SYS002-CNTL-ICHG-REC TO 500-ICHG-ENTRY ( 500-ICHG-IDX )
                  methodOut.setIchgEntry500(methodOut.getIchgIdx500() - 1,methodOut.getSys002CntlIchgRec().getCharArray());
              }
          }
//  ELSE
          else { 
//  SET 88-300-TBL-ABEND-CODE TO TRUE
              methodOut.setTblAbendCode88300True(); 
              
//  SET 88-300-ABEND-PARA-1500 TO TRUE
              methodOut.setAbendPara150088300True(); 
              
//  MOVE 300-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(String.valueOf(methodOut.getAbendCode300String()).toCharArray());
//  MOVE 600-ABEND-MSG-TBL-ERR TO 900-ABEND-TEXT
              methodOut.setAbendText900(pad(66,methodOut.getAbendMsgTblErr600(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-ABEND-PARA-NAME TO 900-ABEND-PARA-NAME
              methodOut.setAbendParaName900(methodOut.getAbendParaName300());
//  PERFORM 9500-ABEND-PROGRAM
              abendProgram(programCtx.getAbendProgramInCtx());/*9500-ABEND-PROGRAM*/
          }
//  PERFORM 8100-READ-SYS002-FILE
          readSys002File(programCtx.getReadSys002FileInCtx());/*8100-READ-SYS002-FILE*/
          ;
      
      return methodOut;
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
      @Override
      public ProcessInputFileOutCtx processInputFile(ProcessInputFileInCtx methodIn) throws Exception {
      
// *--------------------------------------------------------------*
// *This paragraph processes the input file.                      *
// *--------------------------------------------------------------*
Ip088030Ctx programCtx = methodIn.getIp088030Ctx();
ProcessInputFileOutCtx methodOut = methodIn.getProcessInputFileOutCtx();
//  MOVE ZEROES TO 800-ICHG-CALC-VARS
          methodOut.getIchgCalcVars800().setString(CONSTANTS.ZERO_183);
//  MOVE SPACES TO 800-HOLD-VARIABLES
          methodOut.getHoldVariables800().setString(CONSTANTS.SPACE_30);
//  SET 88-100-TXN-QUALIFY-N 88-100-AR-REC-NOT-FOUND 88-100-ICHG-CALCULATED-N TO TRUE
          methodOut.setTxnQualifyN88100True(); 
          
          methodOut.setArRecNotFound88100True(); 
          
          methodOut.setIchgCalculatedN88100True(); 
          
//  IF IP98151-TJF-MRCH-ADDR (01 : 10) IS NUMERIC
          if (    isNumeric(substring(methodOut.getIp98151TjfMrchAddr(),0,10))) { 
//  MOVE IP98151-TJF-MRCH-ADDR (01 : 10) TO 800-FUND-PAN
              methodOut.getHoldVariables800().replace(methodIn.getSys001TjfIp370Rec()/*parent*/,95/*fromOffset - (fundPan800) */,10/*fromLen*/,0/*toOffset - (ip98151TjfMrchAddr) */,10/*toLen*/);
//  MOVE IP98151-TJF-MRCH-ADDR (11 : 04) TO 800-MCC-CODE 800-MCC-CODE-X
              methodOut.getHoldVariables800().replace(methodIn.getSys001TjfIp370Rec()/*parent*/,95+11 - 1/*fromOffset - (mccCode800) */,4/*fromLen*/,10/*toOffset - (ip98151TjfMrchAddr) */,4/*toLen*/);
              methodOut.getHoldVariables800().replace(methodIn.getSys001TjfIp370Rec()/*parent*/,95+11 - 1/*fromOffset - (mccCodeX800) */,4/*fromLen*/,20/*toOffset - (ip98151TjfMrchAddr) */,4/*toLen*/);
//  MOVE IP98151-TJF-MRCH-ADDR (15 : 06) TO 800-MAID
              methodOut.getHoldVariables800().replace(methodIn.getSys001TjfIp370Rec()/*parent*/,95+15 - 1/*fromOffset - (maid800) */,6/*fromLen*/,24/*toOffset - (ip98151TjfMrchAddr) */,6/*toLen*/);
//  PERFORM 8200-DETERMINE-TXN-TYPE
              determineTxnType(programCtx.getDetermineTxnTypeInCtx());/*8200-DETERMINE-TXN-TYPE*/
          }
//  IF 88-100-ICHG-CALCULATED-N
          if ( methodOut.isIchgCalculatedN88100()  ) { 
//  MOVE 300-VALUE-D TO IP00164-PROD-CAT-CD
              methodOut.setIp00164ProdCatCd(methodOut.getValueD300());
//  PERFORM 2200-SEARCH-DEFAULT-RATE
              searchDefaultRate(programCtx.getSearchDefaultRateInCtx());/*2200-SEARCH-DEFAULT-RATE*/
//  PERFORM 8600-CALCULATE-ICHG-AMT
              calculateIchgAmt(programCtx.getCalculateIchgAmtInCtx());/*8600-CALCULATE-ICHG-AMT*/
          }
//  PERFORM 2100-WRITE-SYS201
          writeSys201(programCtx.getWriteSys201InCtx());/*2100-WRITE-SYS201*/
//  PERFORM 8000-READ-SYS001-FILE
          readSys001File(programCtx.getReadSys001FileInCtx());/*8000-READ-SYS001-FILE*/
          ;
      
      return methodOut;
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
      @Override
      public WriteSys201OutCtx writeSys201(WriteSys201InCtx methodIn) throws Exception {
      
// *--------------------------------------------------------------*
// *This paragraph writes to sys201                               *
// *--------------------------------------------------------------*
Ip088030Ctx programCtx = methodIn.getIp088030Ctx();
WriteSys201OutCtx methodOut = methodIn.getWriteSys201OutCtx();
//  MOVE 800-FUND-PROD-ID TO IP98152-FUND-PROD-ID
          methodOut.setIp98152FundProdId(methodOut.getFundProdId800());
//  MOVE 800-FUND-PAN TO IP98152-FUND-ACCT-NUM
          methodOut.setIp98152FundAcctNum(methodOut.getFundPan800());
//  MOVE 800-MCC-CODE-X TO IP98152-ACTUAL-MCC
          methodOut.setIp98152ActualMcc(methodOut.getMccCodeX800());
//  PERFORM 2110-POPULATE-NEW-FEE-INFO
          populateNewFeeInfo(programCtx);/*2110-POPULATE-NEW-FEE-INFO*/
//  PERFORM 2120-WRITE-OUTPUT-SYS201
          writeOutputSys201(programCtx.getWriteOutputSys201InCtx());/*2120-WRITE-OUTPUT-SYS201*/
          ;
      
      return methodOut;
      }
      /**
      * populateNewFeeInfo 
      *   This method is derived from 
  *   COBOL Paragraph - 2110-POPULATE-NEW-FEE-INFO COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void populateNewFeeInfo(Ip088030Ctx programCtx) throws Exception {
      
// *--------------------------------------------------------------*
// *This paragraph populates new fee info to ip981504 layout      *
// *--------------------------------------------------------------*
//  PERFORM 2111-DETERMINE-FEE-ACQ
          determineFeeAcq(programCtx.getDetermineFeeAcqInCtx());/*2111-DETERMINE-FEE-ACQ*/
//  PERFORM 2112-DETERMINE-FEE-ISS
          determineFeeIss(programCtx.getDetermineFeeIssInCtx());/*2112-DETERMINE-FEE-ISS*/
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
      @Override
      public DetermineFeeAcqOutCtx determineFeeAcq(DetermineFeeAcqInCtx methodIn) throws Exception {
      
// *--------------------------------------------------------------*
// *This paragraph populates fee layout for acquier setting it to *
// *have interchange debit.                                       *
// *--------------------------------------------------------------*
Ip088030Ctx programCtx = methodIn.getIp088030Ctx();
DetermineFeeAcqOutCtx methodOut = methodIn.getDetermineFeeAcqOutCtx();
//  SET SYS201-CALC-F-IDX TO 1
          methodOut.setSys201CalcFIdx(1); 
          
//  SET SYS201-88-PAY-PARTY-ACQ ( SYS201-CALC-F-IDX ) TO TRUE
          methodOut.setSys20188PayPartyAcqTrue(methodOut.getSys201CalcFIdx() - 1); 
          
//  SET SYS201-88-FEE-IND-DR ( SYS201-CALC-F-IDX ) TO TRUE
          methodOut.setSys20188FeeIndDrTrue(methodOut.getSys201CalcFIdx() - 1); 
          
//  MOVE IP98152-CLR-MBR-CUR-CD (1) TO SYS201-CALC-FEE-SETL-CUR ( SYS201-CALC-F-IDX )
          methodOut.setSys201CalcFeeSetlCur(methodOut.getSys201CalcFIdx() - 1,CFUtil.getInt(methodOut.getIp98152ClrMbrCurCd(0)));
//  IF IP98152-CLR-MBR-CUR-CD (1) EQUAL IP98152-CLR-TXN-CURR-CD
          if (		compareChars(methodOut.getIp98152ClrMbrCurCd(0),methodOut.getIp98152ClrTxnCurrCd()) == 0 ) { 
//  MOVE 800-NET-AMT TO IP33701-SRC-AMT-6-DECIMALS
              methodOut.setIp33701SrcAmt6Decimals(methodOut.getNetAmt800());
//  MOVE IP98152-CLR-MBR-CUR-EXP (1) TO IP33701-TARGET-CUR-EXP
              methodOut.setIp33701TargetCurExp(methodOut.getIp98152ClrMbrCurExp(0));
//  PERFORM 8400-ALIGN-AMT-TO-EXP
              alignAmtToExp(programCtx.getAlignAmtToExpInCtx());/*8400-ALIGN-AMT-TO-EXP*/
              methodOut.setSys201CalcFeeSetlAmt(methodOut.getSys201CalcFIdx() - 1,methodIn.getIp33701TargetAmount() * methodIn.getMinus1300());
          }
//  ELSE
          else { 
//  MOVE 800-NET-AMT TO IP33701-SOURCE-AMOUNT
              methodOut.setIp33701SourceAmount(methodOut.getNetAmt800().longValue());
//  MOVE IP98152-CLR-TXN-CURR-CD TO IP33701-SOURCE-CUR-CODE IP00174-CURR-CD-KEY
              methodOut.setIp33701SourceCurCode(padLeftZeros(3,methodOut.getIp98152ClrTxnCurrCd(),false));
              methodOut.getIp00174CurrCdKey().setString(methodOut.getIp98152ClrTxnCurrCd());
//  CALL 800-PTR-IP288010
              // CALL 800-PTR-IP288010
              	programCtx.setRc( ip288010.process(programCtx.getGlobalCtx().getContext("IP288010")));
//  MOVE IP00174-CUR-EXP-CODE TO IP33701-SOURCE-CUR-EXP
              methodOut.setIp33701SourceCurExp(String.valueOf(methodOut.getIp00174CurExpCodeString()).toCharArray());
//  MOVE IP98152-CLR-MBR-CUR-CD (1) TO IP33701-TARGET-CUR-CODE
              methodOut.setIp33701TargetCurCode(CFUtil.getInt(methodOut.getIp98152ClrMbrCurCd(0)));
//  MOVE IP98152-CLR-MBR-CUR-EXP (1) TO IP33701-TARGET-CUR-EXP
              methodOut.setIp33701TargetCurExp(methodOut.getIp98152ClrMbrCurExp(0));
//  PERFORM 8300-CALL-CURR-CONV-API
              callCurrConvApi(programCtx.getCallCurrConvApiInCtx());/*8300-CALL-CURR-CONV-API*/
              methodOut.setSys201CalcFeeSetlAmt(methodOut.getSys201CalcFIdx() - 1,methodIn.getIp33701TargetAmount() * methodIn.getMinus1300());
          }
      
      return methodOut;
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
      @Override
      public DetermineFeeIssOutCtx determineFeeIss(DetermineFeeIssInCtx methodIn) throws Exception {
      
// *--------------------------------------------------------------*
// *This paragraph populates fee layout for issuer setting it to  *
// *have interchange credit.                                      *
// *--------------------------------------------------------------*
Ip088030Ctx programCtx = methodIn.getIp088030Ctx();
DetermineFeeIssOutCtx methodOut = methodIn.getDetermineFeeIssOutCtx();
//  SET SYS201-CALC-F-IDX TO 2
          methodOut.setSys201CalcFIdx(2); 
          
//  SET SYS201-88-PAY-PARTY-ISS ( SYS201-CALC-F-IDX ) TO TRUE
          methodOut.setSys20188PayPartyIssTrue(methodOut.getSys201CalcFIdx() - 1); 
          
//  SET SYS201-88-FEE-IND-CR ( SYS201-CALC-F-IDX ) TO TRUE
          methodOut.setSys20188FeeIndCrTrue(methodOut.getSys201CalcFIdx() - 1); 
          
//  MOVE IP98152-CLR-MBR-CUR-CD (2) TO SYS201-CALC-FEE-SETL-CUR ( SYS201-CALC-F-IDX )
          methodOut.setSys201CalcFeeSetlCur(methodOut.getSys201CalcFIdx() - 1,CFUtil.getInt(methodOut.getIp98152ClrMbrCurCd(1)));
//  IF IP98152-CLR-MBR-CUR-CD (2) EQUAL IP98152-CLR-TXN-CURR-CD
          if (		compareChars(methodOut.getIp98152ClrMbrCurCd(1),methodOut.getIp98152ClrTxnCurrCd()) == 0 ) { 
//  MOVE 800-NET-AMT TO IP33701-SRC-AMT-6-DECIMALS
              methodOut.setIp33701SrcAmt6Decimals(methodOut.getNetAmt800());
//  MOVE IP98152-CLR-MBR-CUR-EXP (2) TO IP33701-TARGET-CUR-EXP
              methodOut.setIp33701TargetCurExp(methodOut.getIp98152ClrMbrCurExp(1));
//  PERFORM 8400-ALIGN-AMT-TO-EXP
              alignAmtToExp(programCtx.getAlignAmtToExpInCtx());/*8400-ALIGN-AMT-TO-EXP*/
              methodOut.setSys201CalcFeeSetlAmt(methodOut.getSys201CalcFIdx() - 1,methodIn.getIp33701TargetAmount() * methodIn.getVal1300());
          }
//  ELSE
          else { 
//  MOVE 800-NET-AMT TO IP33701-SOURCE-AMOUNT
              methodOut.setIp33701SourceAmount(methodOut.getNetAmt800().longValue());
//  MOVE IP98152-CLR-TXN-CURR-CD TO IP33701-SOURCE-CUR-CODE IP00174-CURR-CD-KEY
              methodOut.setIp33701SourceCurCode(padLeftZeros(3,methodOut.getIp98152ClrTxnCurrCd(),false));
              methodOut.getIp00174CurrCdKey().setString(methodOut.getIp98152ClrTxnCurrCd());
//  CALL 800-PTR-IP288010
              // CALL 800-PTR-IP288010
              	programCtx.setRc( ip288010.process(programCtx.getGlobalCtx().getContext("IP288010")));
//  MOVE IP00174-CUR-EXP-CODE TO IP33701-SOURCE-CUR-EXP
              methodOut.setIp33701SourceCurExp(String.valueOf(methodOut.getIp00174CurExpCodeString()).toCharArray());
//  MOVE IP98152-CLR-MBR-CUR-CD (2) TO IP33701-TARGET-CUR-CODE
              methodOut.setIp33701TargetCurCode(CFUtil.getInt(methodOut.getIp98152ClrMbrCurCd(1)));
//  MOVE IP98152-CLR-MBR-CUR-EXP (2) TO IP33701-TARGET-CUR-EXP
              methodOut.setIp33701TargetCurExp(methodOut.getIp98152ClrMbrCurExp(1));
//  PERFORM 8300-CALL-CURR-CONV-API
              callCurrConvApi(programCtx.getCallCurrConvApiInCtx());/*8300-CALL-CURR-CONV-API*/
              methodOut.setSys201CalcFeeSetlAmt(methodOut.getSys201CalcFIdx() - 1,methodIn.getIp33701TargetAmount() * methodIn.getVal1300());
          }
      
      return methodOut;
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
      @Override
      public WriteOutputSys201OutCtx writeOutputSys201(WriteOutputSys201InCtx methodIn) throws Exception {
      
// *Status.                                                       *
// *--------------------------------------------------------------*
Ip088030Ctx programCtx = methodIn.getIp088030Ctx();
WriteOutputSys201OutCtx methodOut = methodIn.getWriteOutputSys201OutCtx();
          // MOVE IP98151-RECORD-PART-1 TO SYS201-RECORD-PART-1
          methodOut.setSys201RecordPart1(methodOut.getIp98151RecordPart1().toCharArray());
          // MOVE IP98152-RECORD-PART-2 TO SYS201-RECORD-PART-2
          methodOut.getSys201RecordPart2().setString(methodOut.getIp98152RecordPart2().getCharArray());
//  MOVE 800-MAID TO SYS201-MAID
          methodOut.setSys201Maid(methodOut.getMaid800());
//  WRITE SYS201-OUTPUT-RECORD
          sys201OutputFile.write(methodOut.getSys201OutputRecord().toCharArray()); 
          methodOut.getSys201OutputRecord().setString(CONSTANTS.LOW_VALUE_215567537);
          methodOut.setSys201FileStatus200(sys201OutputFile.getStatusString() );
//  IF 88-200-SYS201-IO-GOOD
          if ( methodOut.isSys201IoGood88200()  ) { 
//  ADD 1 TO 400-WRITE-CNT
              methodOut.setWriteCnt400(methodOut.getWriteCnt400()+(long)1);
          }
//  ELSE
          else { 
//  SET 88-300-WRITE-ABEND-CODE TO TRUE
              methodOut.setWriteAbendCode88300True(); 
              
//  SET 88-300-ABEND-PARA-2120 TO TRUE
              methodOut.setAbendPara212088300True(); 
              
//  SET 88-600-ABEND-WRITE-SYS201 TO TRUE
              methodOut.setAbendWriteSys20188600True(); 
              
//  MOVE 200-SYS201-FILE-STATUS TO 600-FILE-STATUS
              methodOut.setFileStatus600(methodOut.getSys201FileStatus200());
              // MOVE 600-ABEND-MESSAGE TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getAbendMessage600().toCharArray());
//  MOVE 300-ABEND-PARA-NAME TO 900-ABEND-PARA-NAME
              methodOut.setAbendParaName900(methodOut.getAbendParaName300());
//  MOVE 300-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(String.valueOf(methodOut.getAbendCode300String()).toCharArray());
//  PERFORM 9500-ABEND-PROGRAM
              abendProgram(programCtx.getAbendProgramInCtx());/*9500-ABEND-PROGRAM*/
          }
      
      return methodOut;
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
      @Override
      public SearchDefaultRateOutCtx searchDefaultRate(SearchDefaultRateInCtx methodIn) throws Exception {
      
// *--------------------------------------------------------------*
// *This paragraph used to search with txn. amount.               *
// *--------------------------------------------------------------*
Ip088030Ctx programCtx = methodIn.getIp088030Ctx();
SearchDefaultRateOutCtx methodOut = methodIn.getSearchDefaultRateOutCtx();
//  SET 88-100-IT-IS-NOT-END-LOOP TO TRUE
          methodOut.setItIsNotEndLoop88100True(); 
          
//  PERFORM VARYING 500-ICHG-IDX FROM 1 BY 1 UNTIL 500-ICHG-IDX GREATER 500-ICHG-ENTRIES-CNT OR 88-100-IT-IS-END-OF-LOOP
          for (methodOut.setIchgIdx500(1); (	( methodOut.getIchgIdx500() <= methodIn.getIchgEntriesCnt500() )  && !(methodOut.isItIsEndOfLoop88100()) ) ; methodOut.setIchgIdx500(methodOut.getIchgIdx500() + 1) ) {
//  IF IP00164-PROD-CAT-CD EQUAL 500-REC-TYPE ( 500-ICHG-IDX ) AND 500-TXN-LOW-AMT-U ( 500-ICHG-IDX ) EQUAL ZEROES AND 500-TXN-HIGH-AMT-U ( 500-ICHG-IDX ) EQUAL ZEROES AND 500-MAID ( 500-ICHG-IDX ) EQUAL SPACES
              if (		compareChars(methodIn.getIp00164ProdCatCd(),methodIn.getRecType500(methodOut.getIchgIdx500() - 1)) == 0  && 	( methodIn.getTxnLowAmtU500(methodOut.getIchgIdx500() - 1) == 0 )  && 	( methodIn.getTxnHighAmtU500(methodOut.getIchgIdx500() - 1) == 0 )  &&         ( allSpaces(methodIn.getMaid500(methodOut.getIchgIdx500() - 1))   )) { 
//  SET 88-100-IT-IS-END-OF-LOOP TO TRUE
                  methodOut.setItIsEndOfLoop88100True(); 
                  
//  MOVE 500-VIA-RATE ( 500-ICHG-IDX ) TO 800-VIA-RATE
                  methodOut.setViaRate800(methodOut.getViaRate500(methodOut.getIchgIdx500() - 1));
//  MOVE 500-FIA-AMT ( 500-ICHG-IDX ) TO 800-FIA-AMT
                  methodOut.setFiaAmt800(methodOut.getFiaAmt500(methodOut.getIchgIdx500() - 1));
//  MOVE 500-MIN-AMT ( 500-ICHG-IDX ) TO 800-MIN-AMT
                  methodOut.setMinAmt800(methodOut.getMinAmt500(methodOut.getIchgIdx500() - 1));
//  MOVE 500-MAX-AMT ( 500-ICHG-IDX ) TO 800-MAX-AMT
                  methodOut.setMaxAmt800(methodOut.getMaxAmt500(methodOut.getIchgIdx500() - 1));
              }
          }
      
      return methodOut;
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
      @Override
      public CloseFilesOutCtx closeFiles(CloseFilesInCtx methodIn) throws Exception {
      
// *--------------------------------------------------------------*
// *This paragraph closes all the input and output files.         *
// *--------------------------------------------------------------*
Ip088030Ctx programCtx = methodIn.getIp088030Ctx();
CloseFilesOutCtx methodOut = methodIn.getCloseFilesOutCtx();
//  MOVE 500-ICHG-ENTRIES-CNT TO 600-ICHG-FEE-CNT
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          methodOut.setIchgFeeCnt600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(methodOut.getIchgEntriesCnt500()).toCharArray()));
//  MOVE 400-READ-CNT TO 600-READ-CNT
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          methodOut.setReadCnt600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(methodOut.getReadCnt400()).toCharArray()));
//  MOVE 400-WRITE-CNT TO 600-WRITE-CNT
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          methodOut.setWriteCnt600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(methodOut.getWriteCnt400()).toCharArray()));
//  DISPLAY 600-INTERNAL-TBL-CNT
          logger.info(methodIn.getInternalTblCnt600().toString()); 
//  DISPLAY 600-MSGS-READ
          logger.info(methodIn.getMsgsRead600().toString()); 
//  DISPLAY 600-MSGS-WRITE
          logger.info(methodIn.getMsgsWrite600().toString()); 
//  PERFORM 3100-CLOSE-SYS001
          closeSys001(programCtx.getCloseSys001InCtx());/*3100-CLOSE-SYS001*/
//  PERFORM 3200-CLOSE-SYS002
          closeSys002(programCtx.getCloseSys002InCtx());/*3200-CLOSE-SYS002*/
//  PERFORM 3300-CLOSE-SYS201
          closeSys201(programCtx.getCloseSys201InCtx());/*3300-CLOSE-SYS201*/
          ;
      
      return methodOut;
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
      @Override
      public CloseSys001OutCtx closeSys001(CloseSys001InCtx methodIn) throws Exception {
      
// *--------------------------------------------------------------*
// *This para closes sys001                                       *
// *--------------------------------------------------------------*
Ip088030Ctx programCtx = methodIn.getIp088030Ctx();
CloseSys001OutCtx methodOut = methodIn.getCloseSys001OutCtx();
//  CLOSE SYS001-TJF-IP370-FILE
          sys001TjfIp370File.close(); 
          methodOut.setSys001FileStatus200(sys001TjfIp370File.getStatusString() );
//  IF 88-200-SYS001-IO-GOOD
//  ELSE
          if (!(methodIn.isSys001IoGood88200()) ) { 
//  SET 88-300-CLOSE-ABEND-CODE TO TRUE
              methodOut.setCloseAbendCode88300True(); 
              
//  SET 88-300-ABEND-PARA-3100 TO TRUE
              methodOut.setAbendPara310088300True(); 
              
//  SET 88-600-ABEND-CLOSE-SYS001 TO TRUE
              methodOut.setAbendCloseSys00188600True(); 
              
//  MOVE 200-SYS001-FILE-STATUS TO 600-FILE-STATUS
              methodOut.setFileStatus600(methodOut.getSys001FileStatus200());
              // MOVE 600-ABEND-MESSAGE TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getAbendMessage600().toCharArray());
//  MOVE 300-ABEND-PARA-NAME TO 900-ABEND-PARA-NAME
              methodOut.setAbendParaName900(methodOut.getAbendParaName300());
//  MOVE 300-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(String.valueOf(methodOut.getAbendCode300String()).toCharArray());
//  PERFORM 9500-ABEND-PROGRAM
              abendProgram(programCtx.getAbendProgramInCtx());/*9500-ABEND-PROGRAM*/
          }
      
      return methodOut;
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
      @Override
      public CloseSys002OutCtx closeSys002(CloseSys002InCtx methodIn) throws Exception {
      
// *--------------------------------------------------------------*
// *This para closes sys002                                       *
// *--------------------------------------------------------------*
Ip088030Ctx programCtx = methodIn.getIp088030Ctx();
CloseSys002OutCtx methodOut = methodIn.getCloseSys002OutCtx();
//  CLOSE SYS002-CNTL-ICHG-FILE
          sys002CntlIchgFile.close(); 
          methodOut.setSys002FileStatus200(sys002CntlIchgFile.getStatusString() );
//  IF 88-200-SYS002-IO-GOOD
//  ELSE
          if (!(methodIn.isSys002IoGood88200()) ) { 
//  SET 88-300-CLOSE-ABEND-CODE TO TRUE
              methodOut.setCloseAbendCode88300True(); 
              
//  SET 88-300-ABEND-PARA-3200 TO TRUE
              methodOut.setAbendPara320088300True(); 
              
//  SET 88-600-ABEND-CLOSE-SYS002 TO TRUE
              methodOut.setAbendCloseSys00288600True(); 
              
//  MOVE 200-SYS002-FILE-STATUS TO 600-FILE-STATUS
              methodOut.setFileStatus600(methodOut.getSys002FileStatus200());
              // MOVE 600-ABEND-MESSAGE TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getAbendMessage600().toCharArray());
//  MOVE 300-ABEND-PARA-NAME TO 900-ABEND-PARA-NAME
              methodOut.setAbendParaName900(methodOut.getAbendParaName300());
//  MOVE 300-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(String.valueOf(methodOut.getAbendCode300String()).toCharArray());
//  PERFORM 9500-ABEND-PROGRAM
              abendProgram(programCtx.getAbendProgramInCtx());/*9500-ABEND-PROGRAM*/
          }
      
      return methodOut;
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
      @Override
      public CloseSys201OutCtx closeSys201(CloseSys201InCtx methodIn) throws Exception {
      
// *--------------------------------------------------------------*
// *This para closes sys201                                       *
// *--------------------------------------------------------------*
Ip088030Ctx programCtx = methodIn.getIp088030Ctx();
CloseSys201OutCtx methodOut = methodIn.getCloseSys201OutCtx();
//  CLOSE SYS201-OUTPUT-FILE
          sys201OutputFile.close(); 
          methodOut.setSys201FileStatus200(sys201OutputFile.getStatusString() );
//  IF 88-200-SYS201-IO-GOOD
//  ELSE
          if (!(methodIn.isSys201IoGood88200()) ) { 
//  SET 88-300-CLOSE-ABEND-CODE TO TRUE
              methodOut.setCloseAbendCode88300True(); 
              
//  SET 88-300-ABEND-PARA-3300 TO TRUE
              methodOut.setAbendPara330088300True(); 
              
//  SET 88-600-ABEND-CLOSE-SYS201 TO TRUE
              methodOut.setAbendCloseSys20188600True(); 
              
//  MOVE 200-SYS201-FILE-STATUS TO 600-FILE-STATUS
              methodOut.setFileStatus600(methodOut.getSys201FileStatus200());
              // MOVE 600-ABEND-MESSAGE TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getAbendMessage600().toCharArray());
//  MOVE 300-ABEND-PARA-NAME TO 900-ABEND-PARA-NAME
              methodOut.setAbendParaName900(methodOut.getAbendParaName300());
//  MOVE 300-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(String.valueOf(methodOut.getAbendCode300String()).toCharArray());
//  PERFORM 9500-ABEND-PROGRAM
              abendProgram(programCtx.getAbendProgramInCtx());/*9500-ABEND-PROGRAM*/
          }
      
      return methodOut;
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
      @Override
      public ReadSys001FileOutCtx readSys001File(ReadSys001FileInCtx methodIn) throws Exception {
      
// *--------------------------------------------------------------*
// *This paragraph reads input merged tjf + ip370 extract.        *
// *--------------------------------------------------------------*
Ip088030Ctx programCtx = methodIn.getIp088030Ctx();
ReadSys001FileOutCtx methodOut = methodIn.getReadSys001FileOutCtx();
//  READ SYS001-TJF-IP370-FILE
          	sys001TjfIp370File.read();
          methodOut.setSys001FileStatus200(sys001TjfIp370File.getStatusString() );
          if (!sys001TjfIp370File.hasEnded()) {
          	methodOut.getSys001TjfIp370Rec().setString(sys001TjfIp370File.getRecord());
          }
//  EVALUATE TRUE
          if  ( methodOut.isSys001IoGood88200()  ) { 
//  ADD 1 TO 400-READ-CNT
              methodOut.setReadCnt400(methodOut.getReadCnt400()+(long)1);
          }
          else if  ( methodOut.isSys001Eof88200()  ) { 
              ;
          }
          else   { 
//  SET 88-600-ABEND-READ-SYS001 TO TRUE
              methodOut.setAbendReadSys00188600True(); 
              
//  SET 88-300-READ-ABEND-CODE TO TRUE
              methodOut.setReadAbendCode88300True(); 
              
//  SET 88-300-ABEND-PARA-8000 TO TRUE
              methodOut.setAbendPara800088300True(); 
              
//  MOVE 200-SYS001-FILE-STATUS TO 600-FILE-STATUS
              methodOut.setFileStatus600(methodOut.getSys001FileStatus200());
              // MOVE 600-ABEND-MESSAGE TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getAbendMessage600().toCharArray());
//  MOVE 300-ABEND-PARA-NAME TO 900-ABEND-PARA-NAME
              methodOut.setAbendParaName900(methodOut.getAbendParaName300());
//  MOVE 300-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(String.valueOf(methodOut.getAbendCode300String()).toCharArray());
//  PERFORM 9500-ABEND-PROGRAM
              abendProgram(programCtx.getAbendProgramInCtx());/*9500-ABEND-PROGRAM*/
          }
      
      return methodOut;
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
      @Override
      public ReadSys002FileOutCtx readSys002File(ReadSys002FileInCtx methodIn) throws Exception {
      
// *--------------------------------------------------------------*
// *This paragraph reads control card input file containing all   *
// *defined interchange rates and amounts.                        *
// *--------------------------------------------------------------*
Ip088030Ctx programCtx = methodIn.getIp088030Ctx();
ReadSys002FileOutCtx methodOut = methodIn.getReadSys002FileOutCtx();
//  READ SYS002-CNTL-ICHG-FILE
          	sys002CntlIchgFile.read();
          methodOut.setSys002FileStatus200(sys002CntlIchgFile.getStatusString() );
          if (!sys002CntlIchgFile.hasEnded()) {
          	methodOut.getSys002CntlIchgRec().setString(sys002CntlIchgFile.getRecord());
          }
//  EVALUATE TRUE
          if  ( methodOut.isSys002IoGood88200()  ) { 
              ;
          }
          else if  ( methodOut.isSys002Eof88200()  ) { 
              ;
          }
          else   { 
//  SET 88-600-ABEND-READ-SYS002 TO TRUE
              methodOut.setAbendReadSys00288600True(); 
              
//  SET 88-300-READ-ABEND-CODE TO TRUE
              methodOut.setReadAbendCode88300True(); 
              
//  SET 88-300-ABEND-PARA-8100 TO TRUE
              methodOut.setAbendPara810088300True(); 
              
//  MOVE 200-SYS002-FILE-STATUS TO 600-FILE-STATUS
              methodOut.setFileStatus600(methodOut.getSys002FileStatus200());
              // MOVE 600-ABEND-MESSAGE TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getAbendMessage600().toCharArray());
//  MOVE 300-ABEND-PARA-NAME TO 900-ABEND-PARA-NAME
              methodOut.setAbendParaName900(methodOut.getAbendParaName300());
//  MOVE 300-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(String.valueOf(methodOut.getAbendCode300String()).toCharArray());
//  PERFORM 9500-ABEND-PROGRAM
              abendProgram(programCtx.getAbendProgramInCtx());/*9500-ABEND-PROGRAM*/
          }
      
      return methodOut;
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
      @Override
      public DetermineTxnTypeOutCtx determineTxnType(DetermineTxnTypeInCtx methodIn) throws Exception {
      
// *--------------------------------------------------------------*
// *This paragraph would intercept funding acct number 11 digits  *
// *submitted in de42/de43 in tjf and go against table 40 to      *
// *obtain product id. check this product id against table 16 to  *
// *confirm if the product is credit or debit.                    *
// *--------------------------------------------------------------*
Ip088030Ctx programCtx = methodIn.getIp088030Ctx();
DetermineTxnTypeOutCtx methodOut = methodIn.getDetermineTxnTypeOutCtx();
//  MOVE SPACES TO 800-PROD-ID
          methodOut.setProdId800(CONSTANTS.SPACE_3);
//  MOVE ZEROES TO IP00404-TBL-40-AR-H
          methodOut.setIp00404Tbl40ArH(CONSTANTS.ZERO_19);
//  MOVE 800-FUND-PAN TO IP00404-TBL-40-AR-H (1 : 10)
          methodOut.getIp00404Table().replace(methodIn.getHoldVariables800()/*parent*/,0/*fromOffset - (ip00404Tbl40ArH) */,10/*fromLen*/,4/*toOffset - (fundPan800) */,10/*toLen*/);
//  PERFORM 8210-CALL-TBL40-API
          callTbl40Api(programCtx.getCallTbl40ApiInCtx());/*8210-CALL-TBL40-API*/
//  IF 88-100-AR-REC-FOUND
          if ( methodIn.isArRecFound88100()  ) { 
//  PERFORM 8220-CALL-TBL16-API
              callTbl16Api(programCtx.getCallTbl16ApiInCtx());/*8220-CALL-TBL16-API*/
//  IF 88-100-TXN-QUALIFY-Y
              if ( methodIn.isTxnQualifyY88100()  ) { 
//  PERFORM 8500-DETERMINE-INTERCHANGE
                  determineInterchange(programCtx.getDetermineInterchangeInCtx());/*8500-DETERMINE-INTERCHANGE*/
              }
          }
      
      return methodOut;
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
      @Override
      public CallTbl40ApiOutCtx callTbl40Api(CallTbl40ApiInCtx methodIn) throws Exception {
      
// *--------------------------------------------------------------*
// *This paragraph calls table 40 api to check if funding acct.
// *range submitted is valid and it has matching acceptance brand
// *mcc or dmc. if found, populate them to external copybook
// *ip0040i.
// *--------------------------------------------------------------*
Ip088030Ctx programCtx = methodIn.getIp088030Ctx();
CallTbl40ApiOutCtx methodOut = methodIn.getCallTbl40ApiOutCtx();
//  CALL 800-PTR-IP280010
          // CALL 800-PTR-IP280010
          	programCtx.setRc( ip280010.process(programCtx.getGlobalCtx().getContext("IP280010")));
//  PERFORM VARYING IP00404-ACCT-RNG-INDEX FROM 1 BY 1 UNTIL 88-100-AR-REC-FOUND OR IP00404-ACCT-RNG-INDEX GREATER THAN IP00404-ENTRIES-FOUND-COUNT
          for (methodOut.setIp00404AcctRngIndex(1); (!(methodOut.isArRecFound88100())  && 	( methodOut.getIp00404AcctRngIndex() <= methodIn.getIp00404EntriesFoundCount() )) ; methodOut.setIp00404AcctRngIndex(methodOut.getIp00404AcctRngIndex() + 1) ) {
//  IF IP00404-AB ( IP00404-ACCT-RNG-INDEX ) EQUAL 'DMC' OR IP00404-AB ( IP00404-ACCT-RNG-INDEX ) EQUAL 'MCC'
//  LITERAL_MCC = 'MCC'
              if (		compareChars(methodIn.getIp00404Ab(methodOut.getIp00404AcctRngIndex() - 1),CONSTANTS.LITERAL_DMC) == 0  || 		compareChars(methodIn.getIp00404Ab(methodOut.getIp00404AcctRngIndex() - 1),CONSTANTS.LITERAL_MCC) == 0 ) { 
//  SET 88-100-AR-REC-FOUND TO TRUE
                  methodOut.setArRecFound88100True(); 
                  
//  MOVE IP00404-ENTRY ( IP00404-ACCT-RNG-INDEX ) TO IP0040I-ACCOUNT-RANGE-INFO
                  methodOut.getIp0040iAccountRangeInfo().setString(methodOut.getIp00404Entry(methodOut.getIp00404AcctRngIndex() - 1).toCharArray());
//  MOVE IP0040I-PROD-ID TO 800-PROD-ID 800-FUND-PROD-ID
                  methodOut.setProdId800(methodOut.getIp0040iProdId());
                  methodOut.setFundProdId800(methodOut.getIp0040iProdId());
              }
          }
      
      return methodOut;
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
      @Override
      public CallTbl16ApiOutCtx callTbl16Api(CallTbl16ApiInCtx methodIn) throws Exception {
      
// *--------------------------------------------------------------*
// *This paragraph calls table 16 api to check if licensed prod
// *id obtained from table 40 is of credit or debit. if true, set
// *the switch for further processing.
// *--------------------------------------------------------------*
Ip088030Ctx programCtx = methodIn.getIp088030Ctx();
CallTbl16ApiOutCtx methodOut = methodIn.getCallTbl16ApiOutCtx();
//  MOVE IP0040I-LICENSED-PROD-ID TO IP00164-LICENSED-PROD-ID
          methodOut.setIp00164LicensedProdId(methodOut.getIp0040iLicensedProdId());
//  CALL 800-PTR-IP280510
          // CALL 800-PTR-IP280510
          	programCtx.setRc( ip280510.process(programCtx.getGlobalCtx().getContext("IP280510")));
//  IF 88-IP00164-ENTRY-FOUND-Y
          if ( methodIn.isIp00164EntryFoundY88()  ) { 
//  MOVE IP00164-PROD-CAT-CD TO IP98152-FUND-PROD-TYPE
              methodOut.setIp98152FundProdType(methodOut.getIp00164ProdCatCd());
//  EVALUATE IP00164-PROD-CAT-CD
              if  (		compareChars(methodOut.getIp00164ProdCatCd(),methodIn.getValueC300()) == 0 ) { 
//  SET 88-100-TXN-QUALIFY-Y TO TRUE
                  methodOut.setTxnQualifyY88100True(); 
                  
              }
              else if  (		compareChars(methodOut.getIp00164ProdCatCd(),methodIn.getValueD300()) == 0 ) { 
//  SET 88-100-TXN-QUALIFY-Y TO TRUE
                  methodOut.setTxnQualifyY88100True(); 
                  
//  MOVE SPACES TO 800-PROD-ID
                  methodOut.setProdId800(CONSTANTS.SPACE_3);
              }
          }
      
      return methodOut;
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
      @Override
      public CallCurrConvApiOutCtx callCurrConvApi(CallCurrConvApiInCtx methodIn) throws Exception {
      
// *--------------------------------------------------------------*
// *This paragraph calls currency conversion api.                 *
// *--------------------------------------------------------------*
Ip088030Ctx programCtx = methodIn.getIp088030Ctx();
CallCurrConvApiOutCtx methodOut = methodIn.getCallCurrConvApiOutCtx();
          // MOVE IP98152-CLR-FX-DATE TO IP33701-FX-DATE-YYDDD
          methodOut.setIp33701FxDateYyddd(methodOut.getIp98152ClrFxDate());
//  SET 88-IP33701-XRATE1-MID-RT-INV TO TRUE
          methodOut.setIp33701Xrate1MidRtInv88True(); 
          
//  SET 88-IP33701-XRATE2-MID-RT TO TRUE
          methodOut.setIp33701Xrate2MidRt88True(); 
          
//  SET 88-IP33701-MULTIPLY-BY-RATE TO TRUE
          methodOut.setIp33701MultiplyByRate88True(); 
          
//  SET 88-IP33701-S-TO-B-MID-RT TO TRUE
          methodOut.setIp33701SToBMidRt88True(); 
          
//  SET 88-IP33701-T-TO-B-MID-RT TO TRUE
          methodOut.setIp33701TToBMidRt88True(); 
          
//  SET 88-IP33701-NO-CROSS-RATE TO TRUE
          methodOut.setIp33701NoCrossRate88True(); 
          
//  CALL 800-PTR-IP783510
          // CALL 800-PTR-IP783510
          	programCtx.setRc( ip783510.process(programCtx.getGlobalCtx().getContext("IP783510")));
//  IF IP33701-RETURN-CODE EQUAL ZEROES
//  ELSE
          if (	( methodIn.getIp33701ReturnCode() != 0 ) ) { 
//  SET 88-300-CONV-ABEND-CODE TO TRUE
              methodOut.setConvAbendCode88300True(); 
              
//  SET 88-300-ABEND-PARA-8300 TO TRUE
              methodOut.setAbendPara830088300True(); 
              
//  MOVE IP33701-SOURCE-CUR-CODE TO 600-SRCE-CURR-VALUE
              methodOut.setSrceCurrValue600(String.valueOf(methodOut.getIp33701SourceCurCodeString()).toCharArray());
//  MOVE IP33701-SOURCE-CUR-EXP TO 600-SRCE-EXP-VALUE
              methodOut.setSrceExpValue600(methodOut.getIp33701SourceCurExp());
//  MOVE IP33701-TARGET-CUR-CODE TO 600-TRG-CURR-VALUE
              methodOut.setTrgCurrValue600(String.valueOf(methodOut.getIp33701TargetCurCodeString()).toCharArray());
//  MOVE IP33701-TARGET-CUR-EXP TO 600-TRG-EXP-VALUE
              methodOut.setTrgExpValue600(methodOut.getIp33701TargetCurExp());
              // MOVE 600-SRCE-TRG-CUR-EXP-ERR0R-MSG TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getSrceTrgCurExpErr0rMsg600().toCharArray());
//  MOVE 300-ABEND-PARA-NAME TO 900-ABEND-PARA-NAME
              methodOut.setAbendParaName900(methodOut.getAbendParaName300());
//  MOVE 300-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(String.valueOf(methodOut.getAbendCode300String()).toCharArray());
//  PERFORM 9500-ABEND-PROGRAM
              abendProgram(programCtx.getAbendProgramInCtx());/*9500-ABEND-PROGRAM*/
          }
      
      return methodOut;
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
      @Override
      public AlignAmtToExpOutCtx alignAmtToExp(AlignAmtToExpInCtx methodIn) throws Exception {
      
// *--------------------------------------------------------------*
// *This paragraph aligns amount to respecitve decimals
// *--------------------------------------------------------------*
Ip088030Ctx programCtx = methodIn.getIp088030Ctx();
AlignAmtToExpOutCtx methodOut = methodIn.getAlignAmtToExpOutCtx();
//  EVALUATE IP33701-TARGET-CUR-EXP
          switch(new String(methodIn.getIp33701TargetCurExp())){
          	case "0":
              methodOut.setIp33701TargetAmount(methodIn.getIp33701SrcAmt6Decimals().setScale(0,BigDecimal.ROUND_HALF_UP).longValue());
          break;
          	case "1":
              methodOut.setIp33701TargetAmount(methodIn.getIp33701SrcAmt6Decimals().multiply(BigDecimal.TEN).setScale(0,BigDecimal.ROUND_HALF_UP).longValue());
          break;
          	case "2":
              methodOut.setIp33701TargetAmount(methodIn.getIp33701SrcAmt6Decimals().multiply(BigDecimal.valueOf(100)).setScale(0,BigDecimal.ROUND_HALF_UP).longValue());
          break;
          	case "3":
              methodOut.setIp33701TargetAmount(methodIn.getIp33701SrcAmt6Decimals().multiply(BigDecimal.valueOf(1000)).setScale(0,BigDecimal.ROUND_HALF_UP).longValue());
          break;
          	case "4":
              methodOut.setIp33701TargetAmount(methodIn.getIp33701SrcAmt6Decimals().multiply(BigDecimal.valueOf(10000)).setScale(0,BigDecimal.ROUND_HALF_UP).longValue());
          break;
          	case "5":
              methodOut.setIp33701TargetAmount(methodIn.getIp33701SrcAmt6Decimals().multiply(BigDecimal.valueOf(100000)).setScale(0,BigDecimal.ROUND_HALF_UP).longValue());
          break;
          	case "6":
              methodOut.setIp33701TargetAmount(methodIn.getIp33701SrcAmt6Decimals().multiply(BigDecimal.valueOf(1000000)).setScale(0,BigDecimal.ROUND_HALF_UP).longValue());
          break;
          }
      
      return methodOut;
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
      @Override
      public void determineInterchange(DetermineInterchangeInCtx methodIn) throws Exception {
      
// *--------------------------------------------------------------*
// *This paragraph used to process debit flow
// *--------------------------------------------------------------*
Ip088030Ctx programCtx = methodIn.getIp088030Ctx();
//  IF IP98151-TJF-DE48SE32 NOT EQUAL SPACES OR IP98151-TJF-TLR-MRCH-ID NOT EQUAL SPACES OR IP98151-TJF-TLR-P176-ID NOT EQUAL SPACES OR 800-MAID NOT EQUAL SPACES
          if (        ( !allSpaces(methodIn.getIp98151TjfDe48se32())  ) ||         ( !allSpaces(methodIn.getIp98151TjfTlrMrchId())  ) ||         ( !allSpaces(methodIn.getIp98151TjfTlrP176Id())  ) ||         ( !allSpaces(methodIn.getMaid800())  )) { 
//  PERFORM 8510-SEARCH-MAID-ID
              searchMaidId(programCtx.getSearchMaidIdInCtx());/*8510-SEARCH-MAID-ID*/
//  IF 88-100-IT-IS-MAID-FND-N
              if ( methodIn.isItIsMaidFndN88100()  ) { 
//  PERFORM 8540-SEARCH-OTHERS-GRP
                  searchOthersGrp(programCtx.getSearchOthersGrpInCtx());/*8540-SEARCH-OTHERS-GRP*/
              }
          }
//  ELSE
          else { 
//  PERFORM 8520-CHECK-MCC-CODE
              checkMccCode(programCtx.getCheckMccCodeInCtx());/*8520-CHECK-MCC-CODE*/
//  PERFORM 8530-SEARCH-TXN-MCC-AMT
              searchTxnMccAmt(programCtx.getSearchTxnMccAmtInCtx());/*8530-SEARCH-TXN-MCC-AMT*/
//  IF 88-100-ICHG-CALCULATED-N
              if ( methodIn.isIchgCalculatedN88100()  ) { 
//  PERFORM 8540-SEARCH-OTHERS-GRP
                  searchOthersGrp(programCtx.getSearchOthersGrpInCtx());/*8540-SEARCH-OTHERS-GRP*/
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
      @Override
      public SearchMaidIdOutCtx searchMaidId(SearchMaidIdInCtx methodIn) throws Exception {
      
// *--------------------------------------------------------------*
// *This paragraph used to search maid identifier
// *--------------------------------------------------------------*
Ip088030Ctx programCtx = methodIn.getIp088030Ctx();
SearchMaidIdOutCtx methodOut = methodIn.getSearchMaidIdOutCtx();
//  SET 88-100-IT-IS-NOT-END-LOOP TO TRUE
          methodOut.setItIsNotEndLoop88100True(); 
          
//  SET 88-100-IT-IS-MAID-FND-N TO TRUE
          methodOut.setItIsMaidFndN88100True(); 
          
//  PERFORM VARYING 500-ICHG-IDX FROM 1 BY 1 UNTIL 500-ICHG-IDX GREATER 500-ICHG-ENTRIES-CNT OR 88-100-IT-IS-END-OF-LOOP
          for (methodOut.setIchgIdx500(1); (	( methodOut.getIchgIdx500() <= methodIn.getIchgEntriesCnt500() )  && !(methodOut.isItIsEndOfLoop88100()) ) ; methodOut.setIchgIdx500(methodOut.getIchgIdx500() + 1) ) {
//  IF ( IP00164-PROD-CAT-CD EQUAL 500-REC-TYPE ( 500-ICHG-IDX ) AND IP98152-CLR-TXN-AMT GREATER THAN OR EQUAL 500-TXN-LOW-AMT-U ( 500-ICHG-IDX ) AND IP98152-CLR-TXN-AMT LESS THAN 500-TXN-HIGH-AMT-U ( 500-ICHG-IDX )) AND ( 500-MAID ( 500-ICHG-IDX ) NOT EQUAL SPACES AND ( 500-MAID ( 500-ICHG-IDX ) EQUAL IP98151-TJF-DE48SE32 OR 500-MAID ( 500-ICHG-IDX ) EQUAL IP98151-TJF-TLR-MRCH-ID OR 500-MAID ( 500-ICHG-IDX ) EQUAL IP98151-TJF-TLR-P176-ID OR 500-MAID ( 500-ICHG-IDX ) EQUAL 800-MAID ))
              if ((		compareChars(methodIn.getIp00164ProdCatCd(),methodIn.getRecType500(methodOut.getIchgIdx500() - 1)) == 0  && 	( methodIn.getIp98152ClrTxnAmt() >= methodIn.getTxnLowAmtU500(methodOut.getIchgIdx500() - 1) ) && 	( methodIn.getIp98152ClrTxnAmt() < methodIn.getTxnHighAmtU500(methodOut.getIchgIdx500() - 1) )) && (        ( !allSpaces(methodIn.getMaid500(methodOut.getIchgIdx500() - 1))  ) && ((		compareChars(methodIn.getMaid500(methodOut.getIchgIdx500() - 1),methodIn.getIp98151TjfDe48se32()) == 0  || 		compareChars(methodIn.getMaid500(methodOut.getIchgIdx500() - 1),methodIn.getIp98151TjfTlrMrchId()) == 0  || 		compareChars(methodIn.getMaid500(methodOut.getIchgIdx500() - 1),methodIn.getIp98151TjfTlrP176Id()) == 0  || 		compareChars(methodIn.getMaid500(methodOut.getIchgIdx500() - 1),methodIn.getMaid800()) == 0 )))) { 
//  SET 88-100-IT-IS-END-OF-LOOP TO TRUE
                  methodOut.setItIsEndOfLoop88100True(); 
                  
//  SET 88-100-IT-IS-MAID-FND-Y TO TRUE
                  methodOut.setItIsMaidFndY88100True(); 
                  
//  MOVE 500-VIA-RATE ( 500-ICHG-IDX ) TO 800-VIA-RATE
                  methodOut.setViaRate800(methodOut.getViaRate500(methodOut.getIchgIdx500() - 1));
//  MOVE 500-FIA-AMT ( 500-ICHG-IDX ) TO 800-FIA-AMT
                  methodOut.setFiaAmt800(methodOut.getFiaAmt500(methodOut.getIchgIdx500() - 1));
//  MOVE 500-MIN-AMT ( 500-ICHG-IDX ) TO 800-MIN-AMT
                  methodOut.setMinAmt800(methodOut.getMinAmt500(methodOut.getIchgIdx500() - 1));
//  MOVE 500-MAX-AMT ( 500-ICHG-IDX ) TO 800-MAX-AMT
                  methodOut.setMaxAmt800(methodOut.getMaxAmt500(methodOut.getIchgIdx500() - 1));
//  PERFORM 8600-CALCULATE-ICHG-AMT
                  calculateIchgAmt(programCtx.getCalculateIchgAmtInCtx());/*8600-CALCULATE-ICHG-AMT*/
              }
          }
      
      return methodOut;
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
      @Override
      public CheckMccCodeOutCtx checkMccCode(CheckMccCodeInCtx methodIn) throws Exception {
      
// *--------------------------------------------------------------*
// *This paragraph calls table 75 api to check if mcc code is
// *valid or not for credit product type in order to apply
// *differential interchange. if entry is not found, the mcc code
// *is forced to override with value all '9's.
// *--------------------------------------------------------------*
Ip088030Ctx programCtx = methodIn.getIp088030Ctx();
CheckMccCodeOutCtx methodOut = methodIn.getCheckMccCodeOutCtx();
//  SET 88-IP00754-ENTRY-FOUND-N TO TRUE
          methodOut.setIp00754EntryFoundN88True(); 
          
//  MOVE 800-MCC-CODE TO IP00754-MCC-VALS
          methodOut.setIp00754MccVals(padLeftZeros(4,methodOut.getMccCode800(),false));
//  CALL 800-PTR-IP282010
          // CALL 800-PTR-IP282010
          	programCtx.setRc( ip282010.process(programCtx.getGlobalCtx().getContext("IP282010")));
//  IF 88-IP00754-ENTRY-FOUND-N
          if ( methodOut.isIp00754EntryFoundN88()  ) { 
//  SET 88-800-INVALID-MCC TO TRUE
              methodOut.setInvalidMcc88800True(); 
              
          }
      
      return methodOut;
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
      @Override
      public SearchTxnMccAmtOutCtx searchTxnMccAmt(SearchTxnMccAmtInCtx methodIn) throws Exception {
      
// *--------------------------------------------------------------*
// *This paragraph search by mcc code as lookup to retrieve       *
// *appropriate interchange rate.                                 *
// *--------------------------------------------------------------*
Ip088030Ctx programCtx = methodIn.getIp088030Ctx();
SearchTxnMccAmtOutCtx methodOut = methodIn.getSearchTxnMccAmtOutCtx();
//  SET 88-100-IT-IS-NOT-END-LOOP TO TRUE
          methodOut.setItIsNotEndLoop88100True(); 
          
//  SET 88-100-IT-IS-MCC-FND-N TO TRUE
          methodOut.setItIsMccFndN88100True(); 
          
//  PERFORM VARYING 500-ICHG-IDX FROM 1 BY 1 UNTIL 500-ICHG-IDX GREATER 500-ICHG-ENTRIES-CNT OR 88-100-IT-IS-END-OF-LOOP
          for (methodOut.setIchgIdx500(1); (	( methodOut.getIchgIdx500() <= methodIn.getIchgEntriesCnt500() )  && !(methodOut.isItIsEndOfLoop88100()) ) ; methodOut.setIchgIdx500(methodOut.getIchgIdx500() + 1) ) {
//  IF IP00164-PROD-CAT-CD EQUAL 500-REC-TYPE ( 500-ICHG-IDX ) AND IP98152-CLR-TXN-AMT GREATER THAN OR EQUAL 500-TXN-LOW-AMT-U ( 500-ICHG-IDX ) AND IP98152-CLR-TXN-AMT LESS THAN 500-TXN-HIGH-AMT-U ( 500-ICHG-IDX ) AND 500-MAID ( 500-ICHG-IDX ) EQUAL SPACES AND 500-MCC ( 500-ICHG-IDX ) EQUAL 800-MCC-CODE
              if (		compareChars(methodIn.getIp00164ProdCatCd(),methodIn.getRecType500(methodOut.getIchgIdx500() - 1)) == 0  && 	( methodIn.getIp98152ClrTxnAmt() >= methodIn.getTxnLowAmtU500(methodOut.getIchgIdx500() - 1) ) && 	( methodIn.getIp98152ClrTxnAmt() < methodIn.getTxnHighAmtU500(methodOut.getIchgIdx500() - 1) ) &&         ( allSpaces(methodIn.getMaid500(methodOut.getIchgIdx500() - 1))   ) && 		compareChars(methodIn.getMcc500(methodOut.getIchgIdx500() - 1),methodIn.getMccCode800()) == 0 ) { 
//  SET 88-100-IT-IS-END-OF-LOOP TO TRUE
                  methodOut.setItIsEndOfLoop88100True(); 
                  
//  SET 88-100-IT-IS-MCC-FND-Y TO TRUE
                  methodOut.setItIsMccFndY88100True(); 
                  
//  MOVE 500-VIA-RATE ( 500-ICHG-IDX ) TO 800-VIA-RATE
                  methodOut.setViaRate800(methodOut.getViaRate500(methodOut.getIchgIdx500() - 1));
//  MOVE 500-FIA-AMT ( 500-ICHG-IDX ) TO 800-FIA-AMT
                  methodOut.setFiaAmt800(methodOut.getFiaAmt500(methodOut.getIchgIdx500() - 1));
//  MOVE 500-MIN-AMT ( 500-ICHG-IDX ) TO 800-MIN-AMT
                  methodOut.setMinAmt800(methodOut.getMinAmt500(methodOut.getIchgIdx500() - 1));
//  MOVE 500-MAX-AMT ( 500-ICHG-IDX ) TO 800-MAX-AMT
                  methodOut.setMaxAmt800(methodOut.getMaxAmt500(methodOut.getIchgIdx500() - 1));
//  PERFORM 8600-CALCULATE-ICHG-AMT
                  calculateIchgAmt(programCtx.getCalculateIchgAmtInCtx());/*8600-CALCULATE-ICHG-AMT*/
              }
          }
      
      return methodOut;
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
      @Override
      public SearchOthersGrpOutCtx searchOthersGrp(SearchOthersGrpInCtx methodIn) throws Exception {
      
// *--------------------------------------------------------------*
// *This paragraph used to search with txn. amount where mcc code *
// *is valid but it doesn't find any matching lookup entries.     *
// *i.e. it falls under all other merchant group.                 *
// *--------------------------------------------------------------*
Ip088030Ctx programCtx = methodIn.getIp088030Ctx();
SearchOthersGrpOutCtx methodOut = methodIn.getSearchOthersGrpOutCtx();
//  SET 88-100-IT-IS-NOT-END-LOOP TO TRUE
          methodOut.setItIsNotEndLoop88100True(); 
          
//  PERFORM VARYING 500-ICHG-IDX FROM 1 BY 1 UNTIL 500-ICHG-IDX GREATER 500-ICHG-ENTRIES-CNT OR 88-100-IT-IS-END-OF-LOOP
          for (methodOut.setIchgIdx500(1); (	( methodOut.getIchgIdx500() <= methodIn.getIchgEntriesCnt500() )  && !(methodOut.isItIsEndOfLoop88100()) ) ; methodOut.setIchgIdx500(methodOut.getIchgIdx500() + 1) ) {
//  IF ( IP00164-PROD-CAT-CD EQUAL 500-REC-TYPE ( 500-ICHG-IDX ) AND IP98152-CLR-TXN-AMT GREATER THAN OR EQUAL 500-TXN-LOW-AMT-U ( 500-ICHG-IDX ) AND IP98152-CLR-TXN-AMT LESS THAN 500-TXN-HIGH-AMT-U ( 500-ICHG-IDX ) AND 500-MAID ( 500-ICHG-IDX ) EQUAL SPACES AND 500-MCC ( 500-ICHG-IDX ) EQUAL SPACES AND 800-PROD-ID EQUAL 500-PROD-ID ( 500-ICHG-IDX ))
              if ((		compareChars(methodIn.getIp00164ProdCatCd(),methodIn.getRecType500(methodOut.getIchgIdx500() - 1)) == 0  && 	( methodIn.getIp98152ClrTxnAmt() >= methodIn.getTxnLowAmtU500(methodOut.getIchgIdx500() - 1) ) && 	( methodIn.getIp98152ClrTxnAmt() < methodIn.getTxnHighAmtU500(methodOut.getIchgIdx500() - 1) ) &&         ( allSpaces(methodIn.getMaid500(methodOut.getIchgIdx500() - 1))   ) &&         ( allSpaces(methodIn.getMcc500(methodOut.getIchgIdx500() - 1))   ) && 		compareChars(methodIn.getProdId800(),methodIn.getProdId500(methodOut.getIchgIdx500() - 1)) == 0 )) { 
//  SET 88-100-IT-IS-END-OF-LOOP TO TRUE
                  methodOut.setItIsEndOfLoop88100True(); 
                  
//  MOVE 500-VIA-RATE ( 500-ICHG-IDX ) TO 800-VIA-RATE
                  methodOut.setViaRate800(methodOut.getViaRate500(methodOut.getIchgIdx500() - 1));
//  MOVE 500-FIA-AMT ( 500-ICHG-IDX ) TO 800-FIA-AMT
                  methodOut.setFiaAmt800(methodOut.getFiaAmt500(methodOut.getIchgIdx500() - 1));
//  MOVE 500-MIN-AMT ( 500-ICHG-IDX ) TO 800-MIN-AMT
                  methodOut.setMinAmt800(methodOut.getMinAmt500(methodOut.getIchgIdx500() - 1));
//  MOVE 500-MAX-AMT ( 500-ICHG-IDX ) TO 800-MAX-AMT
                  methodOut.setMaxAmt800(methodOut.getMaxAmt500(methodOut.getIchgIdx500() - 1));
//  PERFORM 8600-CALCULATE-ICHG-AMT
                  calculateIchgAmt(programCtx.getCalculateIchgAmtInCtx());/*8600-CALCULATE-ICHG-AMT*/
              }
          }
      
      return methodOut;
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
      @Override
      public CalculateIchgAmtOutCtx calculateIchgAmt(CalculateIchgAmtInCtx methodIn) throws Exception {
      
// *--------------------------------------------------------------*
// *This paragraph calculates interchange amount based on determined
// *via rate and fia amount.
// *--------------------------------------------------------------*
Ip088030Ctx programCtx = methodIn.getIp088030Ctx();
CalculateIchgAmtOutCtx methodOut = methodIn.getCalculateIchgAmtOutCtx();
//  SET 88-100-ICHG-CALCULATED-Y TO TRUE
          methodOut.setIchgCalculatedY88100True(); 
          
//  PERFORM 8610-ALIGN-TXN-AMT-DECIMAL
          alignTxnAmtDecimal(programCtx.getAlignTxnAmtDecimalInCtx());/*8610-ALIGN-TXN-AMT-DECIMAL*/
          methodOut.setViaAmt800(methodIn.getViaRate800().divide(BigDecimal.valueOf(100),18,RoundingMode.DOWN).setScale(7,BigDecimal.ROUND_DOWN).multiply(methodIn.getClrTxnAmt6800()).setScale(6,RoundingMode.HALF_UP));
          if(methodOut.getViaAmt800().signum() < 0 )  methodOut.setViaAmt800(methodOut.getViaAmt800().negate());
          methodOut.setNetAmt800(methodOut.getViaAmt800().add(methodIn.getFiaAmt800()).setScale(7,BigDecimal.ROUND_DOWN).setScale(6,RoundingMode.HALF_UP));
          if(methodOut.getNetAmt800().signum() < 0 )  methodOut.setNetAmt800(methodOut.getNetAmt800().negate());
//  IF 800-MAX-AMT GREATER THAN ZERO
          if (	( methodOut.getMaxAmt800().compareTo(BigDecimal.valueOf(0)) > 0)) { 
//  IF 800-NET-AMT GREATER THAN 800-MAX-AMT
              if (			( methodOut.getNetAmt800().compareTo(methodOut.getMaxAmt800()) > 0) ) { 
//  MOVE 800-MAX-AMT TO 800-NET-AMT
                  methodOut.setNetAmt800(methodOut.getMaxAmt800());
              }
          }
//  PERFORM 8620-ALIGN-ICHG-FEE-AMT
          alignIchgFeeAmt(programCtx.getAlignIchgFeeAmtInCtx());/*8620-ALIGN-ICHG-FEE-AMT*/
          ;
      
      return methodOut;
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
      @Override
      public AlignTxnAmtDecimalOutCtx alignTxnAmtDecimal(AlignTxnAmtDecimalInCtx methodIn) throws Exception {
      
// *--------------------------------------------------------------*
// *This paragraph aligns transaction amount to respecitve decimals
// *--------------------------------------------------------------*
Ip088030Ctx programCtx = methodIn.getIp088030Ctx();
AlignTxnAmtDecimalOutCtx methodOut = methodIn.getAlignTxnAmtDecimalOutCtx();
//  MOVE IP98152-CLR-TXN-CURR-CD TO IP00174-CURR-CD-KEY
          methodOut.getIp00174CurrCdKey().setString(methodOut.getIp98152ClrTxnCurrCd());
//  CALL 800-PTR-IP288010
          // CALL 800-PTR-IP288010
          	programCtx.setRc( ip288010.process(programCtx.getGlobalCtx().getContext("IP288010")));
//  EVALUATE IP00174-CUR-EXP-CODE
          switch(methodIn.getIp00174CurExpCode()){
          	case 0:
              methodOut.setClrTxnAmt6800(BigDecimal.valueOf(methodIn.getIp98152ClrTxnAmt()));
              if(methodOut.getClrTxnAmt6800().signum() < 0 )  methodOut.setClrTxnAmt6800(methodOut.getClrTxnAmt6800().negate());
          break;
          	case 1:
              methodOut.setClrTxnAmt6800(BigDecimal.valueOf(methodIn.getIp98152ClrTxnAmt()).divide(BigDecimal.TEN,18,RoundingMode.DOWN).setScale(6,BigDecimal.ROUND_DOWN));
              if(methodOut.getClrTxnAmt6800().signum() < 0 )  methodOut.setClrTxnAmt6800(methodOut.getClrTxnAmt6800().negate());
          break;
          	case 2:
              methodOut.setClrTxnAmt6800(BigDecimal.valueOf(methodIn.getIp98152ClrTxnAmt()).divide(BigDecimal.valueOf(100),18,RoundingMode.DOWN).setScale(6,BigDecimal.ROUND_DOWN));
              if(methodOut.getClrTxnAmt6800().signum() < 0 )  methodOut.setClrTxnAmt6800(methodOut.getClrTxnAmt6800().negate());
          break;
          	case 3:
              methodOut.setClrTxnAmt6800(BigDecimal.valueOf(methodIn.getIp98152ClrTxnAmt()).divide(BigDecimal.valueOf(1000),18,RoundingMode.DOWN).setScale(6,BigDecimal.ROUND_DOWN));
              if(methodOut.getClrTxnAmt6800().signum() < 0 )  methodOut.setClrTxnAmt6800(methodOut.getClrTxnAmt6800().negate());
          break;
          	case 4:
              methodOut.setClrTxnAmt6800(BigDecimal.valueOf(methodIn.getIp98152ClrTxnAmt()).divide(BigDecimal.valueOf(10000),18,RoundingMode.DOWN).setScale(6,BigDecimal.ROUND_DOWN));
              if(methodOut.getClrTxnAmt6800().signum() < 0 )  methodOut.setClrTxnAmt6800(methodOut.getClrTxnAmt6800().negate());
          break;
          	case 5:
              methodOut.setClrTxnAmt6800(BigDecimal.valueOf(methodIn.getIp98152ClrTxnAmt()).divide(BigDecimal.valueOf(100000),18,RoundingMode.DOWN).setScale(6,BigDecimal.ROUND_DOWN));
              if(methodOut.getClrTxnAmt6800().signum() < 0 )  methodOut.setClrTxnAmt6800(methodOut.getClrTxnAmt6800().negate());
          break;
          	case 6:
              methodOut.setClrTxnAmt6800(BigDecimal.valueOf(methodIn.getIp98152ClrTxnAmt()).divide(BigDecimal.valueOf(1000000),18,RoundingMode.DOWN).setScale(6,BigDecimal.ROUND_DOWN));
              if(methodOut.getClrTxnAmt6800().signum() < 0 )  methodOut.setClrTxnAmt6800(methodOut.getClrTxnAmt6800().negate());
          break;
          }
      
      return methodOut;
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
      @Override
      public AlignIchgFeeAmtOutCtx alignIchgFeeAmt(AlignIchgFeeAmtInCtx methodIn) throws Exception {
      
// *--------------------------------------------------------------*
// *This paragraph aligns calculated ichg fee amt to its respective
// *currency exponent.
// *--------------------------------------------------------------*
Ip088030Ctx programCtx = methodIn.getIp088030Ctx();
AlignIchgFeeAmtOutCtx methodOut = methodIn.getAlignIchgFeeAmtOutCtx();
//  EVALUATE IP00174-CUR-EXP-CODE
          switch(methodIn.getIp00174CurExpCode()){
          	case 0:
              methodOut.setIp33701TargetAmount(methodOut.getNetAmt800().setScale(0,BigDecimal.ROUND_HALF_UP).longValue());
//  MOVE IP33701-TARGET-AMOUNT TO 800-NET-AMT
              methodOut.setNetAmt800(BigDecimal.valueOf(methodOut.getIp33701TargetAmount()));
          break;
          	case 1:
              methodOut.setIp33701TargetAmount1(methodOut.getNetAmt800().setScale(1,RoundingMode.HALF_UP));
//  MOVE IP33701-TARGET-AMOUNT-1 TO 800-NET-AMT
              methodOut.setNetAmt800(methodOut.getIp33701TargetAmount1());
          break;
          	case 2:
              methodOut.setIp33701TargetAmount2(methodOut.getNetAmt800().setScale(2,RoundingMode.HALF_UP));
//  MOVE IP33701-TARGET-AMOUNT-2 TO 800-NET-AMT
              methodOut.setNetAmt800(methodOut.getIp33701TargetAmount2());
          break;
          	case 3:
              methodOut.setIp33701TargetAmount3(methodOut.getNetAmt800().setScale(3,RoundingMode.HALF_UP));
//  MOVE IP33701-TARGET-AMOUNT-3 TO 800-NET-AMT
              methodOut.setNetAmt800(methodOut.getIp33701TargetAmount3());
          break;
          	case 4:
              methodOut.setIp33701TargetAmount4(methodOut.getNetAmt800().setScale(4,RoundingMode.HALF_UP));
//  MOVE IP33701-TARGET-AMOUNT-4 TO 800-NET-AMT
              methodOut.setNetAmt800(methodOut.getIp33701TargetAmount4());
          break;
          	case 5:
              methodOut.setIp33701TargetAmount5(methodOut.getNetAmt800().setScale(5,RoundingMode.HALF_UP));
//  MOVE IP33701-TARGET-AMOUNT-5 TO 800-NET-AMT
              methodOut.setNetAmt800(methodOut.getIp33701TargetAmount5());
          break;
          	case 6:
              methodOut.setIp33701TargetAmount6(methodOut.getNetAmt800().setScale(6,RoundingMode.HALF_UP));
//  MOVE IP33701-TARGET-AMOUNT-6 TO 800-NET-AMT
              methodOut.setNetAmt800(methodOut.getIp33701TargetAmount6());
          break;
          }
      
      return methodOut;
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
      @Override
      public AbendProgramOutCtx abendProgram(AbendProgramInCtx methodIn) throws Exception {
      
// *--------------------------------------------------------------*
// *Abend routine.                                                *
// *--------------------------------------------------------------*
Ip088030Ctx programCtx = methodIn.getIp088030Ctx();
AbendProgramOutCtx methodOut = methodIn.getAbendProgramOutCtx();
//  MOVE 900-ABEND-TEXT TO IP60001-EVENT-ERROR-MSG
          methodOut.setIp60001EventErrorMsg(methodOut.getAbendText900());
//  MOVE 900-ABEND-CODE TO IP60001-EVENT-ERROR-CODE
          methodOut.setIp60001EventErrorCode(methodOut.getAbendCode900());
//  DISPLAY '***********************************'
          logger.info("***********************************"); 
//  DISPLAY 'A B E N D   A B E N D   A B E N D  '
          logger.info("A B E N D   A B E N D   A B E N D  "); 
//  DISPLAY 'A B E N D   I P 0 8 8 0 3 0        '
          logger.info("A B E N D   I P 0 8 8 0 3 0        "); 
//  DISPLAY '***********************************'
          logger.info("***********************************"); 
//  DISPLAY 900-ABEND-PARA
          logger.info(methodIn.getAbendPara900().toString()); 
//  DISPLAY 900-ABEND-MESSAGE
          logger.info(methodIn.getAbendMessage900().toString()); 
//  CALL 300-PGM-IP610010
          // CALL 300-PGM-IP610010
          	programCtx.setRc( ip610010.process(programCtx.getGlobalCtx().getContext("IP610010")));
      
      return methodOut;
      }
  
  
  
  
  
  
  
  
  }
