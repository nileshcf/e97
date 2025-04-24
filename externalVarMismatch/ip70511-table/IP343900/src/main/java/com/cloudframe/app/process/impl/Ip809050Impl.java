  package com.cloudframe.app.process.impl;
  /* 
* element ip809050 as of 01/21/22 01:27:46                    [vc]
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
*author.        gcmsps.
*date written   july 2016.
*date compiled  agu  2016.
*
*security.    property of mastercard international, inc
*
*-----------------------------------------------------------------
*program functionality
*-----------------------------------------------------------------
*this program reads the outbound ipm clearing back-up file and
*provides the activities of chip liability
*-----------------------------------------------------------------
*revision history:
*-----------------------------------------------------------------
*    project         :chip liability monitoring
*    date            :2016/06/08
*    version         :intial version
*    programmer      :ramki subramani
*-----------------------------------------------------------------
*    project         :18q102 - prb89673
*    date            :28/02/2018
*    programmer      :wipro
*    modification    :added logic to include the pan in the report
*----------------------------------------------------------------
* project            :gcms release 21q4 pbi45784                 *
* date               :2021/10/16                                 *
* programmer         :shankar subramanian                        *
* modification       :included copybook ip004005                 *
*----------------------------------------------------------------*
*/
  
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.ip809050.file.*;
  import com.cloudframe.app.ip809050.Ip809050Ctx.*;
  import com.cloudframe.app.ip809050.Ip809050Ctx;
  import com.cloudframe.app.process.Ip809050;
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
  import com.cloudframe.app.process.Ip752010;
  import com.cloudframe.app.process.Ip670010;
  import com.cloudframe.app.global.sharedvar.SortKey800;
  import com.cloudframe.app.process.Ip662010;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.process.Ip288010;
  import com.cloudframe.app.process.Ip783510;
  import com.cloudframe.app.process.Ip281010;
  import java.math.BigDecimal;
  import java.math.RoundingMode;
  import com.cloudframe.app.process.Ip610010;
  import com.cloudframe.app.ip809050.dto.*;
  import com.cloudframe.app.ip809050.dto.AmtE1850TemGroup800;
  import com.cloudframe.app.ip809050.dto.AmtE1754TemGroup800;
  import com.cloudframe.app.ip809050.dto.AmtE1750TemGroup800;
  import com.cloudframe.app.ip809050.dto.AmtE1849TemGroup800;
  import com.cloudframe.app.ip809050.dto.AmtE1848TemGroup800;
  import com.cloudframe.app.ip809050.dto.AmtE1852TemGroup800;
  import com.cloudframe.app.ip809050.dto.ChipLiabVariables800;
  import com.cloudframe.app.ip809050.dto.AmtE1851TemGroup800;
  import com.cloudframe.app.ip809050.file.records.Sys206OutputIpmOtbndRec;
  import com.cloudframe.app.global.sharedvar.Ip30671OutboundMessageArea;
  import com.cloudframe.app.ip809050.dto.L1CtlValues800;
  import com.cloudframe.app.ip809050.dto.Sys213RecordCount600;
  import com.cloudframe.app.ip809050.dto.Sys206RecordCount600;
  import com.cloudframe.app.ip809050.dto.Sys215RecordCount600;
  import com.cloudframe.app.ip809050.dto.Sys203RecordCount600;
  import com.cloudframe.app.ip809050.file.records.Sys012RunControlRec;
  import com.cloudframe.app.ip809050.file.records.Sys202OutputIpmOtbndRec;
  import com.cloudframe.app.ip809050.dto.RunControlErrMsgTxt600;
  import com.cloudframe.app.global.sharedvar.Ip08101RunControlRecord;
  import com.cloudframe.app.ip809050.dto.Sys207RecordCount600;
  import com.cloudframe.app.ip809050.dto.InputOutboundErrMsgTxt600;
  import com.cloudframe.app.ip809050.dto.Sys001RecordCount600;
  import com.cloudframe.app.global.sharedvar.Ip66102IpmMsg;
  import com.cloudframe.app.ip809050.dto.Sys204RecordCount600;
  import com.cloudframe.app.ip809050.dto.Sys210RecordCount600;
  import com.cloudframe.app.ip809050.dto.ReadParserErrMsgTxt600;
  import com.cloudframe.app.ip809050.dto.Sys216RecordCount600;
  import com.cloudframe.app.ip809050.dto.Sys214RecordCount600;
  import com.cloudframe.app.ip809050.file.records.Sys207OutputIpmOtbndRec;
  import com.cloudframe.app.ip809050.file.records.Sys204OutputIpmOtbndRec;
  import com.cloudframe.app.ip809050.file.records.Sys205OutputIpmOtbndRec;
  import com.cloudframe.app.ip809050.dto.Sys212RecordCount600;
  import com.cloudframe.app.ip809050.dto.OutputOtbndErrMsgTxt600;
  import com.cloudframe.app.ip809050.dto.Sys205RecordCount600;
  import com.cloudframe.app.ip809050.dto.Sys209RecordCount600;
  import com.cloudframe.app.ip809050.dto.Sys201RecordCount600;
  import com.cloudframe.app.ip809050.dto.Sys202RecordCount600;
  import com.cloudframe.app.ip809050.dto.AbendMessage900;
  import com.cloudframe.app.ip809050.file.records.Sys001InputIpmOutboundRec;
  import com.cloudframe.app.ip809050.file.records.Sys201OutputIpmOtbndRec;
  import com.cloudframe.app.ip809050.dto.AbendParaName900;
  import com.cloudframe.app.ip809050.dto.Sys211RecordCount600;
  import com.cloudframe.app.ip809050.file.records.Sys203OutputIpmOtbndRec;
  import com.cloudframe.app.ip809050.dto.DateCcyymmdd800;
  import com.cloudframe.app.ip809050.dto.Pds05DataGroup800;
  import com.cloudframe.app.ip809050.dto.Pds841ValuesGroup800;
  import com.cloudframe.app.global.sharedvar.Ip67002DateParm;
  import com.cloudframe.app.global.sharedvar.Ip00724TableEntry;
  import com.cloudframe.app.global.sharedvar.Ip00724EntryFoundYGroup;
  import com.cloudframe.app.global.sharedvar.Ip50005OneDayRecLthGroup;
  import com.cloudframe.app.global.sharedvar.Ip50005OneDayRec;
  import com.cloudframe.app.global.sharedvar.Ip50005OneDayReadStatusGroup;
  import com.cloudframe.app.global.sharedvar.Ip50005ClearingDtTm;
  import com.cloudframe.app.global.sharedvar.Ip60001EventLogWorkArea;
  import com.cloudframe.app.global.sharedvar.Ip65504CurrentTagTable;
  import com.cloudframe.app.global.sharedvar.Ip65504TcntGroup;
  import com.cloudframe.app.global.sharedvar.Ip65504MessageStatusGroup;
  import com.cloudframe.app.global.sharedvar.Ip65504SelElemEntriesAll;
  import com.cloudframe.app.global.sharedvar.Ip65504TaggedRecordInfo;
  import com.cloudframe.app.global.sharedvar.Ip65504DeMapGroup;
  import com.cloudframe.app.global.sharedvar.Ip65504SelPdsEntriesAll;
  import com.cloudframe.app.global.sharedvar.Ip65504PdsMapGroup;
  import com.cloudframe.app.global.sharedvar.Ip00702CaTable;
  import com.cloudframe.app.global.sharedvar.Ip00702CaStringGroup;
  import com.cloudframe.app.global.sharedvar.Ip66102IpmFileInformation;
  import com.cloudframe.app.global.sharedvar.Ip33701CurrConvInterface;
  import com.cloudframe.app.global.sharedvar.Ip00174TableEntry;
  import com.cloudframe.app.global.sharedvar.Ip00174EntryFoundGroup;
  import com.cloudframe.app.global.sharedvar.Ip00694TableEntry;
  import com.cloudframe.app.global.sharedvar.Ip00694EntryFoundGroup;
  import com.cloudframe.app.global.sharedvar.Ip00404Table;
  import com.cloudframe.app.global.sharedvar.Ip0040iAccountRangeInfo;
  import com.cloudframe.app.global.sharedvar.Ip996011ProgramStartMessage;
  import com.cloudframe.app.ip809050.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("ip809050")
  
  public class Ip809050Impl extends CommonProcess implements Ip809050 {
  
  Logger logger = LoggerFactory.getLogger(Ip809050Impl.class);
  
  
  
  
  @Autowired 
  @Qualifier("ip809050_sys012RunControlFile")
  Sys012RunControlFile sys012RunControlFile;
  @Autowired 
  @Qualifier("ip809050_sys001InputIpmOutboundFile")
  Sys001InputIpmOutboundFile sys001InputIpmOutboundFile;
  @Autowired 
  @Qualifier("ip752010")
  Ip752010 ip752010;
  @Autowired 
  @Qualifier("ip670010")
  Ip670010 ip670010;
  @Autowired 
  @Qualifier("ip809050_sys201OutputIpmOtbndFile")
  Sys201OutputIpmOtbndFile sys201OutputIpmOtbndFile;
  @Autowired 
  @Qualifier("ip809050_sys202OutputIpmOtbndFile")
  Sys202OutputIpmOtbndFile sys202OutputIpmOtbndFile;
  @Autowired 
  @Qualifier("ip809050_sys203OutputIpmOtbndFile")
  Sys203OutputIpmOtbndFile sys203OutputIpmOtbndFile;
  @Autowired 
  @Qualifier("ip809050_sys204OutputIpmOtbndFile")
  Sys204OutputIpmOtbndFile sys204OutputIpmOtbndFile;
  @Autowired 
  @Qualifier("ip809050_sys205OutputIpmOtbndFile")
  Sys205OutputIpmOtbndFile sys205OutputIpmOtbndFile;
  @Autowired 
  @Qualifier("ip809050_sys206OutputIpmOtbndFile")
  Sys206OutputIpmOtbndFile sys206OutputIpmOtbndFile;
  @Autowired 
  @Qualifier("ip809050_sys207OutputIpmOtbndFile")
  Sys207OutputIpmOtbndFile sys207OutputIpmOtbndFile;
  @Autowired 
  @Qualifier("ip662010")
  Ip662010 ip662010;
  @Autowired 
  @Qualifier("ip288010")
  Ip288010 ip288010;
  @Autowired 
  @Qualifier("ip783510")
  Ip783510 ip783510;
  @Autowired 
  @Qualifier("ip281010")
  Ip281010 ip281010;
  
  
  
  
  
  
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      public int process(Ip809050Ctx programCtx) throws Exception {
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
      		if(sys012RunControlFile.hasOpened() && !sys012RunControlFile.isReadOnly()) { 
      			sys012RunControlFile.flush(); 
      		}
      		if(sys001InputIpmOutboundFile.hasOpened() && !sys001InputIpmOutboundFile.isReadOnly()) { 
      			sys001InputIpmOutboundFile.flush(); 
      		}
      		if(sys201OutputIpmOtbndFile.hasOpened() && !sys201OutputIpmOtbndFile.isReadOnly()) { 
      			sys201OutputIpmOtbndFile.flush(); 
      		}
      		if(sys202OutputIpmOtbndFile.hasOpened() && !sys202OutputIpmOtbndFile.isReadOnly()) { 
      			sys202OutputIpmOtbndFile.flush(); 
      		}
      		if(sys203OutputIpmOtbndFile.hasOpened() && !sys203OutputIpmOtbndFile.isReadOnly()) { 
      			sys203OutputIpmOtbndFile.flush(); 
      		}
      		if(sys204OutputIpmOtbndFile.hasOpened() && !sys204OutputIpmOtbndFile.isReadOnly()) { 
      			sys204OutputIpmOtbndFile.flush(); 
      		}
      		if(sys205OutputIpmOtbndFile.hasOpened() && !sys205OutputIpmOtbndFile.isReadOnly()) { 
      			sys205OutputIpmOtbndFile.flush(); 
      		}
      		if(sys206OutputIpmOtbndFile.hasOpened() && !sys206OutputIpmOtbndFile.isReadOnly()) { 
      			sys206OutputIpmOtbndFile.flush(); 
      		}
      		if(sys207OutputIpmOtbndFile.hasOpened() && !sys207OutputIpmOtbndFile.isReadOnly()) { 
      			sys207OutputIpmOtbndFile.flush(); 
      		}
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
      public void mainline(Ip809050Ctx programCtx) throws Exception {
      
// *----------------------------------------------------------------*
// * The program ip809050 starts here                               *
// *----------------------------------------------------------------*
//  PERFORM 1000-DO-INITIALIZATION
          doInitialization(programCtx.getDoInitializationInCtx());/*1000-DO-INITIALIZATION*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  PERFORM 2000-PROCESS-INPUT-FILE
          processInputFile(programCtx.getProcessInputFileInCtx());/*2000-PROCESS-INPUT-FILE*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  PERFORM 3000-CLOSE-FILES
          closeFiles(programCtx.getCloseFilesInCtx());/*3000-CLOSE-FILES*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return ;
      
      }
      /**
      * doInitialization 
      *   This method is derived from 
  *   COBOL Paragraph - 1000-DO-INITIALIZATION COBOL Cyclomatic complexity - 2
      * Input  :  

      * - pgmIp281010300                 COBOL Name: 300-PGM-IP281010
      *
      * Output :  

      * - ptrIp281010800                 COBOL Name: 800-PTR-IP281010
      * - isItTheFirstTime100            COBOL Name: 100-IS-IT-THE-FIRST-TIME
      *
      * @throws CFException
      */
      @Override
      public DoInitializationOutCtx doInitialization(DoInitializationInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *  This para displays the execution messages and intializes the  *
// *  program pointers and opens the input and output files         *
// *----------------------------------------------------------------*
Ip809050Ctx programCtx = methodIn.getIp809050Ctx();
DoInitializationOutCtx methodOut = methodIn.getDoInitializationOutCtx();
//  PERFORM 1100-DISPLAY-EXEC-MSGS
          displayExecMsgs(programCtx.getDisplayExecMsgsInCtx());/*1100-DISPLAY-EXEC-MSGS*/
//  PERFORM 1200-SET-PROCEDURE-POINTERS
          setProcedurePointers(programCtx.getSetProcedurePointersInCtx());/*1200-SET-PROCEDURE-POINTERS*/
//  PERFORM 1300-PROCESS-RUN-CONTROL-FILE
          processRunControlFile(programCtx);/*1300-PROCESS-RUN-CONTROL-FILE*/
//  SET 800-PTR-IP281010 TO ENTRY 300-PGM-IP281010
          methodOut.setPtrIp281010800(methodIn.getPgmIp281010300()); 
          
//  SET 88-100-IT-IS-NOT-FIRST-TIME TO TRUE
          methodOut.setItIsNotFirstTime88100True(); 
          
//  PERFORM 1400-OPEN-FILES
          openFiles(programCtx);/*1400-OPEN-FILES*/
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
      
// *----------------------------------------------------------------*
// * This paragraph displays the program execution messages by      *
// * calling ip996010.                                              *
// *----------------------------------------------------------------*
Ip809050Ctx programCtx = methodIn.getIp809050Ctx();
DisplayExecMsgsOutCtx methodOut = methodIn.getDisplayExecMsgsOutCtx();
//  SET 800-PTR-IP996010 TO ENTRY 300-PGM-IP996010
          methodOut.setPtrIp996010800(methodIn.getPgmIp996010300()); 
          
//  MOVE 300-PGM-ID TO IP996011-PGM-ID
          methodOut.setIp996011PgmId(methodOut.getPgmId300());
//  MOVE 300-PGM-VERSION TO IP996011-PGM-VERSION
          methodOut.setIp996011PgmVersion(methodOut.getPgmVersion300());
          // MOVE WHEN-COMPILED TO IP996011-WHEN-COMPILED
          //  FORMAT1311677340 = "X(08)BX(08)"
          methodOut.setIp996011WhenCompiled(CFUtil.cobolAnEditFormatter(CONSTANTS.FORMAT1311677340,CONSTANTS.LITERAL_1765656414));
//  CALL 800-PTR-IP996010
          // CALL 800-PTR-IP996010
          	programCtx.setRc( ip996010.process(programCtx.getGlobalCtx().getContext("IP996010")));
      
      return methodOut;
      }
      /**
      * setProcedurePointers 
      *   This method is derived from 
  *   COBOL Paragraph - 1200-SET-PROCEDURE-POINTERS COBOL Cyclomatic complexity - 16
      * Input  :  

      * - abendRoutine300                COBOL Name: 300-ABEND-ROUTINE
      * - pgmIp280310300                 COBOL Name: 300-PGM-IP280310
      * - pgmIp280010300                 COBOL Name: 300-PGM-IP280010
      * - readParser300                  COBOL Name: 300-READ-PARSER
      * - pgmIp343230300                 COBOL Name: 300-PGM-IP343230
      * - pgmIp218480300                 COBOL Name: 300-PGM-IP218480
      * - pgmIp218490300                 COBOL Name: 300-PGM-IP218490
      * - pgmIp218500300                 COBOL Name: 300-PGM-IP218500
      * - pgmIp218510300                 COBOL Name: 300-PGM-IP218510
      * - pgmIp218520300                 COBOL Name: 300-PGM-IP218520
      * - pgmIp217540300                 COBOL Name: 300-PGM-IP217540
      * - pgmIp288010300                 COBOL Name: 300-PGM-IP288010
      * - pgmIp670010300                 COBOL Name: 300-PGM-IP670010
      * - pgmIp752010300                 COBOL Name: 300-PGM-IP752010
      * - pgmIp783510300                 COBOL Name: 300-PGM-IP783510
      *
      * Output :  

      * - abendPtr800                    COBOL Name: 800-ABEND-PTR
      * - ptrIp280310800                 COBOL Name: 800-PTR-IP280310
      * - ptrIp280010800                 COBOL Name: 800-PTR-IP280010
      * - ptrIp662010800                 COBOL Name: 800-PTR-IP662010
      * - ptrIp343230800                 COBOL Name: 800-PTR-IP343230
      * - ptrIp218480800                 COBOL Name: 800-PTR-IP218480
      * - ptrIp218490800                 COBOL Name: 800-PTR-IP218490
      * - ptrIp218500800                 COBOL Name: 800-PTR-IP218500
      * - ptrIp218510800                 COBOL Name: 800-PTR-IP218510
      * - ptrIp218520800                 COBOL Name: 800-PTR-IP218520
      * - ptrIp217540800                 COBOL Name: 800-PTR-IP217540
      * - ptrIp288010800                 COBOL Name: 800-PTR-IP288010
      * - ptrIp670010800                 COBOL Name: 800-PTR-IP670010
      * - ptrIp752010800                 COBOL Name: 800-PTR-IP752010
      * - ptrIp783510800                 COBOL Name: 800-PTR-IP783510
      *
      * @throws CFException
      */
      @Override
      public SetProcedurePointersOutCtx setProcedurePointers(SetProcedurePointersInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// * This paragraph sets procedure pointers
// *-----------------------------------------------------------------
Ip809050Ctx programCtx = methodIn.getIp809050Ctx();
SetProcedurePointersOutCtx methodOut = methodIn.getSetProcedurePointersOutCtx();
//  SET 800-ABEND-PTR TO ENTRY 300-ABEND-ROUTINE
          methodOut.setAbendPtr800(methodIn.getAbendRoutine300()); 
          
//  SET 800-PTR-IP280310 TO ENTRY 300-PGM-IP280310
          methodOut.setPtrIp280310800(methodIn.getPgmIp280310300()); 
          
//  SET 800-PTR-IP280010 TO ENTRY 300-PGM-IP280010
          methodOut.setPtrIp280010800(methodIn.getPgmIp280010300()); 
          
//  SET 800-PTR-IP662010 TO ENTRY 300-READ-PARSER
          methodOut.setPtrIp662010800(methodIn.getReadParser300()); 
          
//  SET 800-PTR-IP343230 TO ENTRY 300-PGM-IP343230
          methodOut.setPtrIp343230800(methodIn.getPgmIp343230300()); 
          
//  SET 800-PTR-IP218480 TO ENTRY 300-PGM-IP218480
          methodOut.setPtrIp218480800(methodIn.getPgmIp218480300()); 
          
//  SET 800-PTR-IP218490 TO ENTRY 300-PGM-IP218490
          methodOut.setPtrIp218490800(methodIn.getPgmIp218490300()); 
          
//  SET 800-PTR-IP218500 TO ENTRY 300-PGM-IP218500
          methodOut.setPtrIp218500800(methodIn.getPgmIp218500300()); 
          
//  SET 800-PTR-IP218510 TO ENTRY 300-PGM-IP218510
          methodOut.setPtrIp218510800(methodIn.getPgmIp218510300()); 
          
//  SET 800-PTR-IP218520 TO ENTRY 300-PGM-IP218520
          methodOut.setPtrIp218520800(methodIn.getPgmIp218520300()); 
          
//  SET 800-PTR-IP217540 TO ENTRY 300-PGM-IP217540
          methodOut.setPtrIp217540800(methodIn.getPgmIp217540300()); 
          
//  SET 800-PTR-IP288010 TO ENTRY 300-PGM-IP288010
          methodOut.setPtrIp288010800(methodIn.getPgmIp288010300()); 
          
//  SET 800-PTR-IP670010 TO ENTRY 300-PGM-IP670010
          methodOut.setPtrIp670010800(methodIn.getPgmIp670010300()); 
          
//  SET 800-PTR-IP752010 TO ENTRY 300-PGM-IP752010
          methodOut.setPtrIp752010800(methodIn.getPgmIp752010300()); 
          
//  SET 800-PTR-IP783510 TO ENTRY 300-PGM-IP783510
          methodOut.setPtrIp783510800(methodIn.getPgmIp783510300()); 
          
      
      return methodOut;
      }
      /**
      * processRunControlFile 
      *   This method is derived from 
  *   COBOL Paragraph - 1300-PROCESS-RUN-CONTROL-FILE COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void processRunControlFile(Ip809050Ctx programCtx) throws Exception {
      
// *-----------------------------------------------------------------
// * This paragraph processes run control file to update event log. *
// *-----------------------------------------------------------------
//  PERFORM 1310-OPEN-RUN-CONTROL-FILE
          openRunControlFile(programCtx.getOpenRunControlFileInCtx());/*1310-OPEN-RUN-CONTROL-FILE*/
//  PERFORM 1320-READ-RUN-CONTROL-FILE
          readRunControlFile(programCtx.getReadRunControlFileInCtx());/*1320-READ-RUN-CONTROL-FILE*/
//  PERFORM 1330-CLOSE-RUN-CONTROL-FILE
          closeRunControlFile(programCtx.getCloseRunControlFileInCtx());/*1330-CLOSE-RUN-CONTROL-FILE*/
          ;
      
      }
      /**
      * openRunControlFile 
      *   This method is derived from 
  *   COBOL Paragraph - 1310-OPEN-RUN-CONTROL-FILE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - para1310300                    COBOL Name: 300-PARA-1310
      * - sys012OpenAbendCode300         COBOL Name: 300-SYS012-OPEN-ABEND-CODE
      * - runControlErrMsgTxt600         COBOL Name: 600-RUN-CONTROL-ERR-MSG-TXT
      *
      * Output :  

      * - sys001FileStatus200            COBOL Name: 200-SYS001-FILE-STATUS
      * - sys012FileStatus200            COBOL Name: 200-SYS012-FILE-STATUS
      * - outputOtbndFileStatus201       COBOL Name: 201-OUTPUT-OTBND-FILE-STATUS
      * - outputOtbndFileStatus202       COBOL Name: 202-OUTPUT-OTBND-FILE-STATUS
      * - outputOtbndFileStatus203       COBOL Name: 203-OUTPUT-OTBND-FILE-STATUS
      * - outputOtbndFileStatus204       COBOL Name: 204-OUTPUT-OTBND-FILE-STATUS
      * - outputOtbndFileStatus205       COBOL Name: 205-OUTPUT-OTBND-FILE-STATUS
      * - outputOtbndFileStatus206       COBOL Name: 206-OUTPUT-OTBND-FILE-STATUS
      * - outputOtbndFileStatus207       COBOL Name: 207-OUTPUT-OTBND-FILE-STATUS
      * - runControlMsgDtl600            COBOL Name: 600-RUN-CONTROL-MSG-DTL
      * - runCtrlFileStatus600           COBOL Name: 600-RUN-CTRL-FILE-STATUS
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para1310300                    COBOL Name: 300-PARA-1310
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - sys012OpenAbendCode300         COBOL Name: 300-SYS012-OPEN-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - runControlErrMsgTxt600         COBOL Name: 600-RUN-CONTROL-ERR-MSG-TXT
      *
      * @throws CFException
      */
      @Override
      public OpenRunControlFileOutCtx openRunControlFile(OpenRunControlFileInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// * This paragraph opens run control file.                         *
// *-----------------------------------------------------------------
Ip809050Ctx programCtx = methodIn.getIp809050Ctx();
OpenRunControlFileOutCtx methodOut = methodIn.getOpenRunControlFileOutCtx();
//  OPEN INPUT SYS012-RUN-CONTROL-FILE
          sys012RunControlFile.open(new String(CONSTANTS.MODE_READ_ONLY_36242),sys012RunControlFile.getFileName(),sys012RunControlFile.getSys012RunControlFileCharSet(),sys012RunControlFile.getSys012RunControlFileCrlfFlag());
          methodOut.setSys012FileStatus200(sys012RunControlFile.getStatusString() );
//  IF 88-200-SYS012-STATUS-GOOD
//  ELSE
          if (!(methodOut.isSys012StatusGood88200()) ) { 
//  SET 88-600-RUN-CTRL-OPEN-ERR-TXT TO TRUE
              methodOut.setRunCtrlOpenErrTxt88600True(); 
              
//  MOVE 200-SYS012-FILE-STATUS TO 600-RUN-CTRL-FILE-STATUS
              methodOut.setRunCtrlFileStatus600(methodOut.getSys012FileStatus200());
//  MOVE 300-PARA-1310 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara1310300());
//  MOVE 300-SYS012-OPEN-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getSys012OpenAbendCode300());
              // MOVE 600-RUN-CONTROL-ERR-MSG-TXT TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getRunControlErrMsgTxt600().toCharArray());
//  PERFORM 9000-TERMINATE-PROCESS
              terminateProcess(programCtx.getTerminateProcessInCtx());/*9000-TERMINATE-PROCESS*/
          }
      
      return methodOut;
      }
      /**
      * readRunControlFile 
      *   This method is derived from 
  *   COBOL Paragraph - 1320-READ-RUN-CONTROL-FILE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ip08101ProcessDate             COBOL Name: IP08101-PROCESS-DATE
      * - ip08101RptProcessTime          COBOL Name: IP08101-RPT-PROCESS-TIME
      * - ip67002Date                    COBOL Name: IP67002-DATE
      * - ip67002Yyddd                   COBOL Name: IP67002-YYDDD
      * - para1320300                    COBOL Name: 300-PARA-1320
      * - sys012EmptyAbendCode300        COBOL Name: 300-SYS012-EMPTY-ABEND-CODE
      * - outputOtbndErrMsgTxt600        COBOL Name: 600-OUTPUT-OTBND-ERR-MSG-TXT
      *
      * Output :  

      * - sys012RunControlRec            COBOL Name: SYS012-RUN-CONTROL-REC
      * - sys012FileStatus200            COBOL Name: 200-SYS012-FILE-STATUS
      * - ip50005ClearingDt              COBOL Name: IP50005-CLEARING-DT
      * - dateCcyymmdd800                COBOL Name: 800-DATE-CCYYMMDD
      * - ip08101ProcessDate             COBOL Name: IP08101-PROCESS-DATE
      * - ip50005ClearingTm              COBOL Name: IP50005-CLEARING-TM
      * - ip08101RptProcessTime          COBOL Name: IP08101-RPT-PROCESS-TIME
      * - rc                             COBOL Name: RETURN-CODE
      * - dateYymmdd800                  COBOL Name: 800-DATE-YYMMDD
      * - ip67002Yymmdd                  COBOL Name: IP67002-YYMMDD
      * - ip67002Cntl                    COBOL Name: IP67002-CNTL
      * - ip67002Date                    COBOL Name: IP67002-DATE
      * - fxDateYyddd800                 COBOL Name: 800-FX-DATE-YYDDD
      * - ip67002Yyddd                   COBOL Name: IP67002-YYDDD
      * - runControlMsgDtl600            COBOL Name: 600-RUN-CONTROL-MSG-DTL
      * - runCtrlFileStatus600           COBOL Name: 600-RUN-CTRL-FILE-STATUS
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para1320300                    COBOL Name: 300-PARA-1320
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - sys012EmptyAbendCode300        COBOL Name: 300-SYS012-EMPTY-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - outputOtbndErrMsgTxt600        COBOL Name: 600-OUTPUT-OTBND-ERR-MSG-TXT
      *
      * @throws CFException
      */
      @Override
      public ReadRunControlFileOutCtx readRunControlFile(ReadRunControlFileInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// * This paragraph reads run control file to update event log      *
// *-----------------------------------------------------------------
Ip809050Ctx programCtx = methodIn.getIp809050Ctx();
ReadRunControlFileOutCtx methodOut = methodIn.getReadRunControlFileOutCtx();
//  READ SYS012-RUN-CONTROL-FILE INTO IP08101-RUN-CONTROL-RECORD END-READ
          	sys012RunControlFile.read();
          methodOut.setSys012FileStatus200(sys012RunControlFile.getStatusString() );
          if (!sys012RunControlFile.hasEnded()) {
             methodOut.getSys012RunControlRec().setString(sys012RunControlFile.getRecord());
             methodIn.getIp08101RunControlRecord().setString(methodOut.getSys012RunControlRec().toCharArray());
          }
//  IF 88-200-SYS012-STATUS-GOOD
          if ( methodOut.isSys012StatusGood88200()  ) { 
//  MOVE IP08101-PROCESS-DATE TO IP50005-CLEARING-DT 800-DATE-CCYYMMDD
              methodOut.setIp50005ClearingDt(String.valueOf(methodOut.getIp08101ProcessDateString()).toCharArray());
              methodOut.getDateCcyymmdd800().setString(String.valueOf(methodOut.getIp08101ProcessDateString()).toCharArray());
//  MOVE IP08101-RPT-PROCESS-TIME TO IP50005-CLEARING-TM
              methodOut.setIp50005ClearingTm(methodOut.getIp08101RptProcessTime());
//  PERFORM 1321-CHECK-EVENT-LOG-SW
              checkEventLogSw(programCtx.getCheckEventLogSwInCtx());/*1321-CHECK-EVENT-LOG-SW*/
//  CALL 800-PTR-IP752010
              // CALL 800-PTR-IP752010
              	programCtx.setRc( ip752010.process(programCtx.getGlobalCtx().getContext("IP752010")));
//  MOVE 800-DATE-YYMMDD TO IP67002-YYMMDD
              methodOut.setIp67002Yymmdd(methodOut.getDateYymmdd800());
//  SET 88-IP67002-GET-ABS-OF-GREG-DT TO TRUE
              methodOut.setIp67002GetAbsOfGregDt88True(); 
              
//  CALL 800-PTR-IP670010
              // CALL 800-PTR-IP670010
              	programCtx.setRc( ip670010.process(programCtx.getGlobalCtx().getContext("IP670010")));
//  SUBTRACT 1 FROM IP67002-DATE
              methodOut.setIp67002Date(Math.abs(methodOut.getIp67002Date()-(long)1));
//  SET 88-IP67002-GET-JUL-OF-ABS-DT TO TRUE
              methodOut.setIp67002GetJulOfAbsDt88True(); 
              
//  CALL 800-PTR-IP670010
              // CALL 800-PTR-IP670010
              	programCtx.setRc( ip670010.process(programCtx.getGlobalCtx().getContext("IP670010")));
              // MOVE IP67002-YYDDD TO 800-FX-DATE-YYDDD
              methodOut.getWork().replace(padSpaces(5,methodOut.getIp67002Yyddd().toCharArray()), /* beginIndex */0, /* length */5);
          }
//  ELSE
          else { 
//  SET 88-600-RUN-CTRL-EMTY-ERR-TXT TO TRUE
              methodOut.setRunCtrlEmtyErrTxt88600True(); 
              
//  MOVE 200-SYS012-FILE-STATUS TO 600-RUN-CTRL-FILE-STATUS
              methodOut.setRunCtrlFileStatus600(methodOut.getSys012FileStatus200());
//  MOVE 300-PARA-1320 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara1320300());
//  MOVE 300-SYS012-EMPTY-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getSys012EmptyAbendCode300());
              // MOVE 600-OUTPUT-OTBND-ERR-MSG-TXT TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getOutputOtbndErrMsgTxt600().toCharArray());
//  PERFORM 8400-CLOSE-SYS012
              closeSys012(programCtx);/*8400-CLOSE-SYS012*/
//  PERFORM 9000-TERMINATE-PROCESS
              terminateProcess(programCtx.getTerminateProcessInCtx());/*9000-TERMINATE-PROCESS*/
          }
      
      return methodOut;
      }
      /**
      * checkEventLogSw 
      *   This method is derived from 
  *   COBOL Paragraph - 1321-CHECK-EVENT-LOG-SW COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ip08101RunIndicator            COBOL Name: IP08101-RUN-INDICATOR
      * - valueTest300                   COBOL Name: 300-VALUE-TEST
      *
      * Output :  

      * - ip60001EventLogControl         COBOL Name: IP60001-EVENT-LOG-CONTROL
      *
      * @throws CFException
      */
      @Override
      public CheckEventLogSwOutCtx checkEventLogSw(CheckEventLogSwInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// * This paragraph checks run indicator for production. if it is   *
// * set, updates event log.                                        *
// *-----------------------------------------------------------------
Ip809050Ctx programCtx = methodIn.getIp809050Ctx();
CheckEventLogSwOutCtx methodOut = methodIn.getCheckEventLogSwOutCtx();
//  IF IP08101-RUN-INDICATOR EQUAL 300-VALUE-TEST
          if (		compareChars(methodIn.getIp08101RunIndicator(),methodIn.getValueTest300()) == 0 ) { 
//  SET 88-IP60001-LOG-EVENT TO TRUE
              methodOut.setIp60001LogEvent88True(); 
              
//  PERFORM 9950-UPDATE-EVENT-LOG
              updateEventLog(programCtx.getUpdateEventLogInCtx());/*9950-UPDATE-EVENT-LOG*/
          }
      
      return methodOut;
      }
      /**
      * closeRunControlFile 
      *   This method is derived from 
  *   COBOL Paragraph - 1330-CLOSE-RUN-CONTROL-FILE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sys012FileStatus200            COBOL Name: 200-SYS012-FILE-STATUS
      * - para1330300                    COBOL Name: 300-PARA-1330
      * - sys012CloseAbendCode300        COBOL Name: 300-SYS012-CLOSE-ABEND-CODE
      * - runControlErrMsgTxt600         COBOL Name: 600-RUN-CONTROL-ERR-MSG-TXT
      *
      * Output :  

      * - runControlMsgDtl600            COBOL Name: 600-RUN-CONTROL-MSG-DTL
      * - runCtrlFileStatus600           COBOL Name: 600-RUN-CTRL-FILE-STATUS
      * - sys012FileStatus200            COBOL Name: 200-SYS012-FILE-STATUS
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para1330300                    COBOL Name: 300-PARA-1330
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - sys012CloseAbendCode300        COBOL Name: 300-SYS012-CLOSE-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - runControlErrMsgTxt600         COBOL Name: 600-RUN-CONTROL-ERR-MSG-TXT
      *
      * @throws CFException
      */
      @Override
      public CloseRunControlFileOutCtx closeRunControlFile(CloseRunControlFileInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph closes run control file and checks for the file  *
// *status. if it is not good it performs terminate process         *
// *-----------------------------------------------------------------
Ip809050Ctx programCtx = methodIn.getIp809050Ctx();
CloseRunControlFileOutCtx methodOut = methodIn.getCloseRunControlFileOutCtx();
//  PERFORM 8400-CLOSE-SYS012
          closeSys012(programCtx);/*8400-CLOSE-SYS012*/
//  IF 88-200-SYS012-STATUS-GOOD
//  ELSE
          if (!(methodIn.isSys012StatusGood88200()) ) { 
//  SET 88-600-RUN-CTRL-CLOSE-ERR-TXT TO TRUE
              methodOut.setRunCtrlCloseErrTxt88600True(); 
              
//  MOVE 200-SYS012-FILE-STATUS TO 600-RUN-CTRL-FILE-STATUS
              methodOut.setRunCtrlFileStatus600(methodOut.getSys012FileStatus200());
//  MOVE 300-PARA-1330 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara1330300());
//  MOVE 300-SYS012-CLOSE-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getSys012CloseAbendCode300());
              // MOVE 600-RUN-CONTROL-ERR-MSG-TXT TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getRunControlErrMsgTxt600().toCharArray());
//  PERFORM 9000-TERMINATE-PROCESS
              terminateProcess(programCtx.getTerminateProcessInCtx());/*9000-TERMINATE-PROCESS*/
          }
      
      return methodOut;
      }
      /**
      * openFiles 
      *   This method is derived from 
  *   COBOL Paragraph - 1400-OPEN-FILES COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void openFiles(Ip809050Ctx programCtx) throws Exception {
      
// *-----------------------------------------------------------------
// * This paragraph opens input ipm outbound file, output outbound
// * extract file.
// *-----------------------------------------------------------------
//  PERFORM 1410-OPEN-USCRB-IPM-OTBND-FILE
          openUscrbIpmOtbndFile(programCtx.getOpenUscrbIpmOtbndFileInCtx());/*1410-OPEN-USCRB-IPM-OTBND-FILE*/
//  PERFORM 1420-OPEN-SCRB-OTBND-FILE
          openScrbOtbndFile(programCtx.getOpenScrbOtbndFileInCtx());/*1420-OPEN-SCRB-OTBND-FILE*/
          ;
      
      }
      /**
      * openUscrbIpmOtbndFile 
      *   This method is derived from 
  *   COBOL Paragraph - 1410-OPEN-USCRB-IPM-OTBND-FILE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - para1410300                    COBOL Name: 300-PARA-1410
      * - sys001OpenAbendCode300         COBOL Name: 300-SYS001-OPEN-ABEND-CODE
      * - inputOutboundErrMsgTxt600      COBOL Name: 600-INPUT-OUTBOUND-ERR-MSG-TXT
      *
      * Output :  

      * - sys001FileStatus200            COBOL Name: 200-SYS001-FILE-STATUS
      * - sys012FileStatus200            COBOL Name: 200-SYS012-FILE-STATUS
      * - outputOtbndFileStatus201       COBOL Name: 201-OUTPUT-OTBND-FILE-STATUS
      * - outputOtbndFileStatus202       COBOL Name: 202-OUTPUT-OTBND-FILE-STATUS
      * - outputOtbndFileStatus203       COBOL Name: 203-OUTPUT-OTBND-FILE-STATUS
      * - outputOtbndFileStatus204       COBOL Name: 204-OUTPUT-OTBND-FILE-STATUS
      * - outputOtbndFileStatus205       COBOL Name: 205-OUTPUT-OTBND-FILE-STATUS
      * - outputOtbndFileStatus206       COBOL Name: 206-OUTPUT-OTBND-FILE-STATUS
      * - outputOtbndFileStatus207       COBOL Name: 207-OUTPUT-OTBND-FILE-STATUS
      * - inputOutboundMsgDtl600         COBOL Name: 600-INPUT-OUTBOUND-MSG-DTL
      * - inputOtbndFileStatus600        COBOL Name: 600-INPUT-OTBND-FILE-STATUS
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para1410300                    COBOL Name: 300-PARA-1410
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - sys001OpenAbendCode300         COBOL Name: 300-SYS001-OPEN-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - inputOutboundErrMsgTxt600      COBOL Name: 600-INPUT-OUTBOUND-ERR-MSG-TXT
      *
      * @throws CFException
      */
      @Override
      public OpenUscrbIpmOtbndFileOutCtx openUscrbIpmOtbndFile(OpenUscrbIpmOtbndFileInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// * This paragraph opens unscrubbed ipm outbound file
// *-----------------------------------------------------------------
Ip809050Ctx programCtx = methodIn.getIp809050Ctx();
OpenUscrbIpmOtbndFileOutCtx methodOut = methodIn.getOpenUscrbIpmOtbndFileOutCtx();
//  OPEN INPUT SYS001-INPUT-IPM-OUTBOUND-FILE
          sys001InputIpmOutboundFile.open(new String(CONSTANTS.MODE_READ_ONLY_36242),sys001InputIpmOutboundFile.getFileName(),sys001InputIpmOutboundFile.getSys001InputIpmOutboundFileCharSet(),sys001InputIpmOutboundFile.getSys001InputIpmOutboundFileCrlfFlag());
          methodOut.setSys001FileStatus200(sys001InputIpmOutboundFile.getStatusString() );
//  IF 88-200-SYS001-STATUS-GOOD
//  ELSE
          if (!(methodOut.isSys001StatusGood88200()) ) { 
//  SET 88-600-INPUT-FILE-OPEN-ERR-TXT TO TRUE
              methodOut.setInputFileOpenErrTxt88600True(); 
              
//  MOVE 200-SYS001-FILE-STATUS TO 600-INPUT-OTBND-FILE-STATUS
              methodOut.setInputOtbndFileStatus600(methodOut.getSys001FileStatus200());
//  MOVE 300-PARA-1410 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara1410300());
//  MOVE 300-SYS001-OPEN-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getSys001OpenAbendCode300());
              // MOVE 600-INPUT-OUTBOUND-ERR-MSG-TXT TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getInputOutboundErrMsgTxt600().toCharArray());
//  PERFORM 9000-TERMINATE-PROCESS
              terminateProcess(programCtx.getTerminateProcessInCtx());/*9000-TERMINATE-PROCESS*/
          }
      
      return methodOut;
      }
      /**
      * openScrbOtbndFile 
      *   This method is derived from 
  *   COBOL Paragraph - 1420-OPEN-SCRB-OTBND-FILE COBOL Cyclomatic complexity - 8
      * Input  :  

      * - para1420300                    COBOL Name: 300-PARA-1420
      * - sys201OpenAbendCode300         COBOL Name: 300-SYS201-OPEN-ABEND-CODE
      * - outputOtbndErrMsgTxt600        COBOL Name: 600-OUTPUT-OTBND-ERR-MSG-TXT
      *
      * Output :  

      * - sys001FileStatus200            COBOL Name: 200-SYS001-FILE-STATUS
      * - sys012FileStatus200            COBOL Name: 200-SYS012-FILE-STATUS
      * - outputOtbndFileStatus201       COBOL Name: 201-OUTPUT-OTBND-FILE-STATUS
      * - outputOtbndFileStatus202       COBOL Name: 202-OUTPUT-OTBND-FILE-STATUS
      * - outputOtbndFileStatus203       COBOL Name: 203-OUTPUT-OTBND-FILE-STATUS
      * - outputOtbndFileStatus204       COBOL Name: 204-OUTPUT-OTBND-FILE-STATUS
      * - outputOtbndFileStatus205       COBOL Name: 205-OUTPUT-OTBND-FILE-STATUS
      * - outputOtbndFileStatus206       COBOL Name: 206-OUTPUT-OTBND-FILE-STATUS
      * - outputOtbndFileStatus207       COBOL Name: 207-OUTPUT-OTBND-FILE-STATUS
      * - isSys201Open100                COBOL Name: 100-IS-SYS201-OPEN
      * - outputOutboundMsgDtl600        COBOL Name: 600-OUTPUT-OUTBOUND-MSG-DTL
      * - outputOtbndFileStatus600       COBOL Name: 600-OUTPUT-OTBND-FILE-STATUS
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para1420300                    COBOL Name: 300-PARA-1420
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - sys201OpenAbendCode300         COBOL Name: 300-SYS201-OPEN-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - outputOtbndErrMsgTxt600        COBOL Name: 600-OUTPUT-OTBND-ERR-MSG-TXT
      *
      * @throws CFException
      */
      @Override
      public OpenScrbOtbndFileOutCtx openScrbOtbndFile(OpenScrbOtbndFileInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// * This paragraph opens output outbound extract file
// *-----------------------------------------------------------------
Ip809050Ctx programCtx = methodIn.getIp809050Ctx();
OpenScrbOtbndFileOutCtx methodOut = methodIn.getOpenScrbOtbndFileOutCtx();
//  OPEN OUTPUT SYS201-OUTPUT-IPM-OTBND-FILE
          sys201OutputIpmOtbndFile.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),sys201OutputIpmOtbndFile.getFileName(),sys201OutputIpmOtbndFile.getSys201OutputIpmOtbndFileCharSet(),sys201OutputIpmOtbndFile.getSys201OutputIpmOtbndFileCrlfFlag());
          methodOut.setOutputOtbndFileStatus201(sys201OutputIpmOtbndFile.getStatusString() );
//  OPEN OUTPUT SYS202-OUTPUT-IPM-OTBND-FILE
          sys202OutputIpmOtbndFile.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),sys202OutputIpmOtbndFile.getFileName(),sys202OutputIpmOtbndFile.getSys202OutputIpmOtbndFileCharSet(),sys202OutputIpmOtbndFile.getSys202OutputIpmOtbndFileCrlfFlag());
          methodOut.setOutputOtbndFileStatus202(sys202OutputIpmOtbndFile.getStatusString() );
//  OPEN OUTPUT SYS203-OUTPUT-IPM-OTBND-FILE
          sys203OutputIpmOtbndFile.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),sys203OutputIpmOtbndFile.getFileName(),sys203OutputIpmOtbndFile.getSys203OutputIpmOtbndFileCharSet(),sys203OutputIpmOtbndFile.getSys203OutputIpmOtbndFileCrlfFlag());
          methodOut.setOutputOtbndFileStatus203(sys203OutputIpmOtbndFile.getStatusString() );
//  OPEN OUTPUT SYS204-OUTPUT-IPM-OTBND-FILE
          sys204OutputIpmOtbndFile.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),sys204OutputIpmOtbndFile.getFileName(),sys204OutputIpmOtbndFile.getSys204OutputIpmOtbndFileCharSet(),sys204OutputIpmOtbndFile.getSys204OutputIpmOtbndFileCrlfFlag());
          methodOut.setOutputOtbndFileStatus204(sys204OutputIpmOtbndFile.getStatusString() );
//  OPEN OUTPUT SYS205-OUTPUT-IPM-OTBND-FILE
          sys205OutputIpmOtbndFile.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),sys205OutputIpmOtbndFile.getFileName(),sys205OutputIpmOtbndFile.getSys205OutputIpmOtbndFileCharSet(),sys205OutputIpmOtbndFile.getSys205OutputIpmOtbndFileCrlfFlag());
          methodOut.setOutputOtbndFileStatus205(sys205OutputIpmOtbndFile.getStatusString() );
//  OPEN OUTPUT SYS206-OUTPUT-IPM-OTBND-FILE
          sys206OutputIpmOtbndFile.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),sys206OutputIpmOtbndFile.getFileName(),sys206OutputIpmOtbndFile.getSys206OutputIpmOtbndFileCharSet(),sys206OutputIpmOtbndFile.getSys206OutputIpmOtbndFileCrlfFlag());
          methodOut.setOutputOtbndFileStatus206(sys206OutputIpmOtbndFile.getStatusString() );
//  OPEN OUTPUT SYS207-OUTPUT-IPM-OTBND-FILE
          sys207OutputIpmOtbndFile.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),sys207OutputIpmOtbndFile.getFileName(),sys207OutputIpmOtbndFile.getSys207OutputIpmOtbndFileCharSet(),sys207OutputIpmOtbndFile.getSys207OutputIpmOtbndFileCrlfFlag());
          methodOut.setOutputOtbndFileStatus207(sys207OutputIpmOtbndFile.getStatusString() );
//  IF ( 88-200-SYS201-STATUS-GOOD AND 88-200-SYS202-STATUS-GOOD AND 88-200-SYS203-STATUS-GOOD AND 88-200-SYS204-STATUS-GOOD AND 88-200-SYS205-STATUS-GOOD AND 88-200-SYS206-STATUS-GOOD AND 88-200-SYS207-STATUS-GOOD )
          if (( methodOut.isSys201StatusGood88200()   &&  methodOut.isSys202StatusGood88200()   &&  methodOut.isSys203StatusGood88200()   &&  methodOut.isSys204StatusGood88200()   &&  methodOut.isSys205StatusGood88200()   &&  methodOut.isSys206StatusGood88200()   &&  methodOut.isSys207StatusGood88200()  )) { 
//  SET 88-100-SYS201-IS-OPEN TO TRUE
              methodOut.setSys201IsOpen88100True(); 
              
          }
//  ELSE
          else { 
//  SET 88-600-OUTPUT-OPEN-ERR-TXT TO TRUE
              methodOut.setOutputOpenErrTxt88600True(); 
              
//  MOVE 201-OUTPUT-OTBND-FILE-STATUS TO 600-OUTPUT-OTBND-FILE-STATUS
              methodOut.setOutputOtbndFileStatus600(methodOut.getOutputOtbndFileStatus201());
//  MOVE 300-PARA-1420 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara1420300());
//  MOVE 300-SYS201-OPEN-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getSys201OpenAbendCode300());
              // MOVE 600-OUTPUT-OTBND-ERR-MSG-TXT TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getOutputOtbndErrMsgTxt600().toCharArray());
//  PERFORM 9000-TERMINATE-PROCESS
              terminateProcess(programCtx.getTerminateProcessInCtx());/*9000-TERMINATE-PROCESS*/
          }
      
      return methodOut;
      }
      /**
      * processInputFile 
      *   This method is derived from 
  *   COBOL Paragraph - 2000-PROCESS-INPUT-FILE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sys001FileStatus200            COBOL Name: 200-SYS001-FILE-STATUS
      *
      * Output : None 

      * @throws CFException
      */
      @Override
      public void processInputFile(ProcessInputFileInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph reads the input file and process unscrub        *
// * outbound data.                                                 *
// *----------------------------------------------------------------*
Ip809050Ctx programCtx = methodIn.getIp809050Ctx();
//  PERFORM 8100-READ-INPUT-OUTBOUND-FILE
          readInputOutboundFile(programCtx.getReadInputOutboundFileInCtx());/*8100-READ-INPUT-OUTBOUND-FILE*/
//  PERFORM 2100-PROCESS-UNSCRUB-OUTBOUND UNTIL 88-200-SYS001-END-OF-FILE
          while (!(methodIn.isSys001EndOfFile88200()) ) {
             processUnscrubOutbound(programCtx);/*2100-PROCESS-UNSCRUB-OUTBOUND*/
          }
          ;
      
      }
      /**
      * processUnscrubOutbound 
      *   This method is derived from 
  *   COBOL Paragraph - 2100-PROCESS-UNSCRUB-OUTBOUND COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void processUnscrubOutbound(Ip809050Ctx programCtx) throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph calls read parser to parse ipm messages.        *
// *----------------------------------------------------------------*
//  PERFORM 2110-CALL-READ-PARSER
          callReadParser(programCtx.getCallReadParserInCtx());/*2110-CALL-READ-PARSER*/
//  PERFORM 2120-PROCESS-OUTPUT-OTBND-FILE
          processOutputOtbndFile(programCtx.getProcessOutputOtbndFileInCtx());/*2120-PROCESS-OUTPUT-OTBND-FILE*/
//  PERFORM 8100-READ-INPUT-OUTBOUND-FILE
          readInputOutboundFile(programCtx.getReadInputOutboundFileInCtx());/*8100-READ-INPUT-OUTBOUND-FILE*/
          ;
      
      }
      /**
      * callReadParser 
      *   This method is derived from 
  *   COBOL Paragraph - 2110-CALL-READ-PARSER COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ipmOutbndUnscrubRdw400         COBOL Name: 400-IPM-OUTBND-UNSCRUB-RDW
      * - ip30671MessageArea             COBOL Name: IP30671-MESSAGE-AREA
      * - para2110300                    COBOL Name: 300-PARA-2110
      * - readParserAbendCode300         COBOL Name: 300-READ-PARSER-ABEND-CODE
      * - readParserErrMsgTxt600         COBOL Name: 600-READ-PARSER-ERR-MSG-TXT
      *
      * Output :  

      * - sortKeyLength800               COBOL Name: 800-SORT-KEY-LENGTH
      * - ip66102IpmMsgLngth             COBOL Name: IP66102-IPM-MSG-LNGTH
      * - ip66102NormalIpmMsg            COBOL Name: IP66102-NORMAL-IPM-MSG
      * - ip30671MessageArea             COBOL Name: IP30671-MESSAGE-AREA
      * - ip66102IpmFileStatus           COBOL Name: IP66102-IPM-FILE-STATUS
      * - rc                             COBOL Name: RETURN-CODE
      * - readParserMsgDtl600            COBOL Name: 600-READ-PARSER-MSG-DTL
      * - readParserReturnCode600        COBOL Name: 600-READ-PARSER-RETURN-CODE
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para2110300                    COBOL Name: 300-PARA-2110
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - readParserAbendCode300         COBOL Name: 300-READ-PARSER-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - readParserErrMsgTxt600         COBOL Name: 600-READ-PARSER-ERR-MSG-TXT
      *
      * @throws CFException
      */
      @Override
      public CallReadParserOutCtx callReadParser(CallReadParserInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// * This paragraph calls read parser after setting record already  *
// * read switch to true.                                           *
// *-----------------------------------------------------------------
Ip809050Ctx programCtx = methodIn.getIp809050Ctx();
CallReadParserOutCtx methodOut = methodIn.getCallReadParserOutCtx();
//  MOVE LENGTH OF 800-SORT-KEY TO 800-SORT-KEY-LENGTH
          methodOut.setSortKeyLength800(SortKey800.getSortKey800FieldLength());
//  SUBTRACT 800-SORT-KEY-LENGTH FROM 400-IPM-OUTBND-UNSCRUB-RDW GIVING IP66102-IPM-MSG-LNGTH
          methodOut.setIp66102IpmMsgLngth(Math.abs((int) methodIn.getIpmOutbndUnscrubRdw400()-(int) methodOut.getSortKeyLength800()));
//  MOVE IP30671-MESSAGE-AREA (1 : IP66102-IPM-MSG-LNGTH ) TO IP66102-NORMAL-IPM-MSG (1 : IP66102-IPM-MSG-LNGTH )
          methodOut.getIp66102IpmMsg().replace(methodIn.getIp30671OutboundMessageArea()/*parent*/,212/*fromOffset - (ip66102NormalIpmMsg) */,(int) methodOut.getIp66102IpmMsgLngth()/*fromLen*/,0/*toOffset - (ip30671MessageArea) */,(int) methodOut.getIp66102IpmMsgLngth()/*toLen*/);
//  SET IP66102-RECORD-ALREADY-READ TO TRUE
          methodOut.setIp66102RecordAlreadyReadTrue(); 
          
//  CALL 800-PTR-IP662010
          // CALL 800-PTR-IP662010
          	programCtx.setRc( ip662010.process(programCtx.getGlobalCtx().getContext("IP662010")));
//  IF RETURN-CODE EQUAL ZEROS
//  ELSE
          if (	( programCtx.getRc() != 0 )) { 
//  SET 88-600-READ-PARSER-ERR-TXT TO TRUE
              methodOut.setReadParserErrTxt88600True(); 
              
//  MOVE RETURN-CODE TO 600-READ-PARSER-RETURN-CODE
              methodOut.setReadParserReturnCode600(CFUtil.pad(4,String.valueOf(programCtx.getRc()),"0",CFUtil.LEFT_PAD));
//  MOVE 300-PARA-2110 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara2110300());
//  MOVE 300-READ-PARSER-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getReadParserAbendCode300());
              // MOVE 600-READ-PARSER-ERR-MSG-TXT TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getReadParserErrMsgTxt600().toCharArray());
//  PERFORM 9000-TERMINATE-PROCESS
              terminateProcess(programCtx.getTerminateProcessInCtx());/*9000-TERMINATE-PROCESS*/
          }
      
      return methodOut;
      }
      /**
      * processOutputOtbndFile 
      *   This method is derived from 
  *   COBOL Paragraph - 2120-PROCESS-OUTPUT-OTBND-FILE COBOL Cyclomatic complexity - 8
      * Input  :  

      * - write1800                      COBOL Name: 800-WRITE1
      * - write2800                      COBOL Name: 800-WRITE2
      * - write3800                      COBOL Name: 800-WRITE3
      * - write4800                      COBOL Name: 800-WRITE4
      * - write5800                      COBOL Name: 800-WRITE5
      * - write6800                      COBOL Name: 800-WRITE6
      * - write7800                      COBOL Name: 800-WRITE7
      *
      * Output : None 

      * @throws CFException
      */
      @Override
      public void processOutputOtbndFile(ProcessOutputOtbndFileInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *This para writes the output in corresponding files based on the
// *write flag
// *-----------------------------------------------------------------
Ip809050Ctx programCtx = methodIn.getIp809050Ctx();
//  PERFORM 2121-CHECK-ACTIVITY
          checkActivity(programCtx.getCheckActivityInCtx());/*2121-CHECK-ACTIVITY*/
//  IF 88-800-WRITE1-Y
          if ( methodIn.isWrite1Y88800()  ) { 
//  PERFORM 8200-WRITE-OUTBOUND-FILE1
              writeOutboundFile1(programCtx.getWriteOutboundFile1InCtx());/*8200-WRITE-OUTBOUND-FILE1*/
          }
//  IF 88-800-WRITE2-Y
          if ( methodIn.isWrite2Y88800()  ) { 
//  PERFORM 8200-WRITE-OUTBOUND-FILE2
              writeOutboundFile2(programCtx.getWriteOutboundFile2InCtx());/*8200-WRITE-OUTBOUND-FILE2*/
          }
//  IF 88-800-WRITE3-Y
          if ( methodIn.isWrite3Y88800()  ) { 
//  PERFORM 8200-WRITE-OUTBOUND-FILE3
              writeOutboundFile3(programCtx.getWriteOutboundFile3InCtx());/*8200-WRITE-OUTBOUND-FILE3*/
          }
//  IF 88-800-WRITE4-Y
          if ( methodIn.isWrite4Y88800()  ) { 
//  PERFORM 8200-WRITE-OUTBOUND-FILE4
              writeOutboundFile4(programCtx.getWriteOutboundFile4InCtx());/*8200-WRITE-OUTBOUND-FILE4*/
          }
//  IF 88-800-WRITE5-Y
          if ( methodIn.isWrite5Y88800()  ) { 
//  PERFORM 8200-WRITE-OUTBOUND-FILE5
              writeOutboundFile5(programCtx.getWriteOutboundFile5InCtx());/*8200-WRITE-OUTBOUND-FILE5*/
          }
//  IF 88-800-WRITE6-Y
          if ( methodIn.isWrite6Y88800()  ) { 
//  PERFORM 8200-WRITE-OUTBOUND-FILE6
              writeOutboundFile6(programCtx.getWriteOutboundFile6InCtx());/*8200-WRITE-OUTBOUND-FILE6*/
          }
//  IF 88-800-WRITE7-Y
          if ( methodIn.isWrite7Y88800()  ) { 
//  PERFORM 8200-WRITE-OUTBOUND-FILE7
              writeOutboundFile7(programCtx.getWriteOutboundFile7InCtx());/*8200-WRITE-OUTBOUND-FILE7*/
          }
      
      }
      /**
      * checkActivity 
      *   This method is derived from 
  *   COBOL Paragraph - 2121-CHECK-ACTIVITY COBOL Cyclomatic complexity - 91
      * Input  :  

      * - ip65504SelPdsEnt               COBOL Name: IP65504-SEL-PDS-ENT
      * - valueX300                      COBOL Name: 300-VALUE-X
      * - ip66102NormalIpmMsg            COBOL Name: IP66102-NORMAL-IPM-MSG
      * - ip65504D24FuncCdS              COBOL Name: IP65504-D24-FUNC-CD-S
      * - ip65504D24FuncCdL              COBOL Name: IP65504-D24-FUNC-CD-L
      * - pds841S1800                    COBOL Name: 800-PDS841-S1
      * - pds005S3ErrCde800              COBOL Name: 800-PDS005-S3-ERR-CDE
      * - desc18001750                   COBOL Name: 800-1750-DESC1
      * - desc28001750                   COBOL Name: 800-1750-DESC2
      * - amtE1750800                    COBOL Name: 800-AMT-E1750
      * - transAmount800                 COBOL Name: 800-TRANS-AMOUNT
      * - desc18001754                   COBOL Name: 800-1754-DESC1
      * - desc28001754                   COBOL Name: 800-1754-DESC2
      * - amtE1754800                    COBOL Name: 800-AMT-E1754
      * - desc18001848                   COBOL Name: 800-1848-DESC1
      * - desc28001848                   COBOL Name: 800-1848-DESC2
      * - amtE1848800                    COBOL Name: 800-AMT-E1848
      * - desc18001849                   COBOL Name: 800-1849-DESC1
      * - desc28001849                   COBOL Name: 800-1849-DESC2
      * - amtE1849800                    COBOL Name: 800-AMT-E1849
      * - desc18001850                   COBOL Name: 800-1850-DESC1
      * - desc28001850                   COBOL Name: 800-1850-DESC2
      * - amtE1850800                    COBOL Name: 800-AMT-E1850
      * - desc18001851                   COBOL Name: 800-1851-DESC1
      * - amtE1851800                    COBOL Name: 800-AMT-E1851
      * - desc18001852                   COBOL Name: 800-1852-DESC1
      * - amtE1852800                    COBOL Name: 800-AMT-E1852
      *
      * Output :  

      * - write1800                      COBOL Name: 800-WRITE1
      * - write2800                      COBOL Name: 800-WRITE2
      * - write3800                      COBOL Name: 800-WRITE3
      * - write4800                      COBOL Name: 800-WRITE4
      * - write5800                      COBOL Name: 800-WRITE5
      * - write6800                      COBOL Name: 800-WRITE6
      * - write7800                      COBOL Name: 800-WRITE7
      * - l1CtlValues800                 COBOL Name: 800-L1-CTL-VALUES
      * - pds05Data800                   COBOL Name: 800-PDS05-DATA
      * - pds841Values800                COBOL Name: 800-PDS841-VALUES
      * - tranCur800                     COBOL Name: 800-TRAN-CUR
      * - amtE1848Tem800                 COBOL Name: 800-AMT-E1848-TEM
      * - amtE1849Tem800                 COBOL Name: 800-AMT-E1849-TEM
      * - amtE1850Tem800                 COBOL Name: 800-AMT-E1850-TEM
      * - amtE1851Tem800                 COBOL Name: 800-AMT-E1851-TEM
      * - amtE1852Tem800                 COBOL Name: 800-AMT-E1852-TEM
      * - amtE1750Tem800                 COBOL Name: 800-AMT-E1750-TEM
      * - amtE1754Tem800                 COBOL Name: 800-AMT-E1754-TEM
      * - tranAmt800                     COBOL Name: 800-TRAN-AMT
      * - tranCurTmp800                  COBOL Name: 800-TRAN-CUR-TMP
      * - tranCurExp800                  COBOL Name: 800-TRAN-CUR-EXP
      * - tranAmtTmp800                  COBOL Name: 800-TRAN-AMT-TMP
      * - pds165s1800                    COBOL Name: 800-PDS165S1
      * - p0165800                       COBOL Name: 800-P0165
      * - ip66102NormalIpmMsg            COBOL Name: IP66102-NORMAL-IPM-MSG
      * - ip66102Mti                     COBOL Name: IP66102-MTI
      * - l1CtlMti800                    COBOL Name: 800-L1-CTL-MTI
      * - errorNum800                    COBOL Name: 800-ERROR-NUM
      * - editNum800                     COBOL Name: 800-EDIT-NUM
      * - errDesc1800                    COBOL Name: 800-ERR-DESC1
      * - desc18001750                   COBOL Name: 800-1750-DESC1
      * - errDesc2800                    COBOL Name: 800-ERR-DESC2
      * - desc28001750                   COBOL Name: 800-1750-DESC2
      * - usdAmt800                      COBOL Name: 800-USD-AMT
      * - usdAmtDec800                   COBOL Name: 800-USD-AMT-DEC
      * - amtE1750800                    COBOL Name: 800-AMT-E1750
      * - transAmount800                 COBOL Name: 800-TRANS-AMOUNT
      * - desc18001754                   COBOL Name: 800-1754-DESC1
      * - desc28001754                   COBOL Name: 800-1754-DESC2
      * - amtE1754800                    COBOL Name: 800-AMT-E1754
      * - desc18001848                   COBOL Name: 800-1848-DESC1
      * - desc28001848                   COBOL Name: 800-1848-DESC2
      * - amtE1848800                    COBOL Name: 800-AMT-E1848
      * - desc18001849                   COBOL Name: 800-1849-DESC1
      * - desc28001849                   COBOL Name: 800-1849-DESC2
      * - amtE1849800                    COBOL Name: 800-AMT-E1849
      * - desc18001850                   COBOL Name: 800-1850-DESC1
      * - desc28001850                   COBOL Name: 800-1850-DESC2
      * - amtE1850800                    COBOL Name: 800-AMT-E1850
      * - desc18001851                   COBOL Name: 800-1851-DESC1
      * - amtE1851800                    COBOL Name: 800-AMT-E1851
      * - desc18001852                   COBOL Name: 800-1852-DESC1
      * - amtE1852800                    COBOL Name: 800-AMT-E1852
      *
      * @throws CFException
      */
      @Override
      public CheckActivityOutCtx checkActivity(CheckActivityInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This para checks the error and edit activity and sets the      *
// * corresponding write flag to true                               *
// *-----------------------------------------------------------------
Ip809050Ctx programCtx = methodIn.getIp809050Ctx();
CheckActivityOutCtx methodOut = methodIn.getCheckActivityOutCtx();
//  SET 88-800-WRITE1-N TO TRUE
          methodOut.setWrite1N88800True(); 
          
//  SET 88-800-WRITE2-N TO TRUE
          methodOut.setWrite2N88800True(); 
          
//  SET 88-800-WRITE3-N TO TRUE
          methodOut.setWrite3N88800True(); 
          
//  SET 88-800-WRITE4-N TO TRUE
          methodOut.setWrite4N88800True(); 
          
//  SET 88-800-WRITE5-N TO TRUE
          methodOut.setWrite5N88800True(); 
          
//  SET 88-800-WRITE6-N TO TRUE
          methodOut.setWrite6N88800True(); 
          
//  SET 88-800-WRITE7-N TO TRUE
          methodOut.setWrite7N88800True(); 
          
//  MOVE SPACES TO 800-L1-CTL-VALUES 800-PDS05-DATA 800-PDS841-VALUES
          methodOut.getL1CtlValues800().setString(CONSTANTS.SPACE_33);
          methodOut.setPds05Data800(CONSTANTS.SPACE_140);
          methodOut.setPds841Values800(CONSTANTS.SPACE_8);
//  MOVE ZEROES TO 800-TRAN-CUR 800-AMT-E1848-TEM 800-AMT-E1849-TEM 800-AMT-E1850-TEM 800-AMT-E1851-TEM 800-AMT-E1852-TEM 800-AMT-E1750-TEM 800-AMT-E1754-TEM 800-TRAN-AMT 800-TRAN-CUR-TMP 800-TRAN-CUR-EXP 800-TRAN-AMT-TMP
          methodOut.setTranCur800(0);
          methodOut.setAmtE1848Tem800(0);
          methodOut.setAmtE1849Tem800(0);
          methodOut.setAmtE1850Tem800(0);
          methodOut.setAmtE1851Tem800(0);
          methodOut.setAmtE1852Tem800(0);
          methodOut.setAmtE1750Tem800(0);
          methodOut.setAmtE1754Tem800(0);
          methodOut.setTranAmt800(0);
          methodOut.setTranCurTmp800(0);
          methodOut.setTranCurExp800(0);
          methodOut.setTranAmtTmp800(0);
          // MOVE SPACES TO 800-PDS165S1 800-P0165
          methodOut.setPds165s1800(CONSTANTS.SPACE);
          methodOut.setP0165800(CONSTANTS.SPACE_30);
//  IF IP65504-SEL-PDS-ENT (165) EQUAL 300-VALUE-X
          if (		compareChars(methodIn.getIp65504SelPdsEnt(164),methodIn.getValueX300()) == 0 ) { 
//  MOVE IP66102-NORMAL-IPM-MSG ( IP65504-P165-SETL-ID-S : IP65504-P165-SETL-ID-L ) TO 800-P0165
              methodOut.setP0165800(substring(methodOut.getIp66102NormalIpmMsg().toCharArray(),(methodIn.getIp65504P165SetlIdS()-1), (methodIn.getIp65504P165SetlIdL() + (methodIn.getIp65504P165SetlIdS() - 1)) ));
//  MOVE 800-P0165 (1 : 1) TO 800-PDS165S1
              methodOut.setPds165s1800(substring(methodOut.getP0165800(),0,1));
          }
//  IF IP65504-SEL-PDS-ENT (830) EQUAL 300-VALUE-X
          if (		compareChars(methodIn.getIp65504SelPdsEnt(829),methodIn.getValueX300()) == 0 ) { 
//  MOVE IP66102-NORMAL-IPM-MSG ( IP65504-P830-RESERVD-S : IP65504-P830-RESERVD-L ) TO 800-L1-CTL-VALUES
              methodOut.getL1CtlValues800().replace(methodIn.getIp66102IpmMsg()/*parent*/,0+methodIn.getIp65504P830ReservdS() - 1/*fromOffset - (l1CtlValues800) */,methodIn.getIp65504P830ReservdL()/*fromLen*/,0/*toOffset - (ip66102NormalIpmMsg) */,33/*toLen*/);
          }
//  IF IP65504-SEL-PDS-ENT (841) EQUAL 300-VALUE-X
          if (		compareChars(methodIn.getIp65504SelPdsEnt(840),methodIn.getValueX300()) == 0 ) { 
//  MOVE IP66102-NORMAL-IPM-MSG ( IP65504-P841-RESERVD-S : IP65504-P830-RESERVD-L ) TO 800-PDS841-VALUES
              methodIn.getPds841ValuesGroup800().replace(methodIn.getIp66102IpmMsg()/*parent*/,0+methodIn.getIp65504P841ReservdS() - 1/*fromOffset - (pds841Values800) */,methodIn.getIp65504P830ReservdL()/*fromLen*/,0/*toOffset - (ip66102NormalIpmMsg) */,8/*toLen*/);
          }
//  IF IP65504-SEL-PDS-ENT (5) EQUAL 300-VALUE-X
          if (		compareChars(methodIn.getIp65504SelPdsEnt(4),methodIn.getValueX300()) == 0 ) { 
//  MOVE IP66102-NORMAL-IPM-MSG ( IP65504-P005-MSGERID-S : IP65504-P005-MSGERID-L ) TO 800-PDS05-DATA
              methodIn.getPds05DataGroup800().replace(methodIn.getIp66102IpmMsg()/*parent*/,0+methodIn.getIp65504P005MsgeridS() - 1/*fromOffset - (pds05Data800) */,methodIn.getIp65504P005MsgeridL()/*fromLen*/,0/*toOffset - (ip66102NormalIpmMsg) */,140/*toLen*/);
          }

// *****  Monitor error codes
//  IF ( IP66102-MTI = '1644' ) AND ( IP66102-NORMAL-IPM-MSG ( IP65504-D24-FUNC-CD-S : IP65504-D24-FUNC-CD-L )) EQUAL '691'
//  LITERAL_691 = '691'
          if ((		compareChars(methodOut.getIp66102Mti(),CONSTANTS.LITERAL_1644) == 0 ) && Field.compareChar(methodOut.getIp66102NormalIpmMsg().toCharArray() , CONSTANTS.LITERAL_691 , ( (methodIn.getIp65504D24FuncCdS() - 1) /*start*/ ), methodIn.getIp65504D24FuncCdL() /*left len*/ , 3 /*right len*/)) { 

// *---------------------------------------------------------------*
// * This condition checks for the edit #1750. if the transaction  *
// * got failed for the errr code 2267 and edit number 1750, then  *
// * the transaction wrriten into sys207 file                      *
// *---------------------------------------------------------------*
//  IF ( 800-L1-CTL-MTI EQUAL '1442' ) AND ( 88-800-PDS841-1750-Y )
//  LITERAL_1442 = '1442'
              if ((compareChars(methodOut.getL1CtlValues800().getL1CtlMti800String(),CONSTANTS.LITERAL_1442) == 0) && ( methodIn.isPds8411750Y88800()  )) { 
//  IF ( 800-PDS005-S3-ERR-CDE (01) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (02) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (03) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (04) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (05) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (06) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (07) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (08) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (09) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (10) = '2267' )
//  LITERAL_2267 = '2267'
                  if ((compareChars(methodIn.getPds005S3ErrCde800(0),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(1),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(2),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(3),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(4),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(5),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(6),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(7),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(8),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(9),CONSTANTS.LITERAL_2267) == 0)) { 
//  SET 88-800-WRITE7-Y TO TRUE
                      methodOut.setWrite7Y88800True(); 
                      
                      // MOVE "2267" TO 800-ERROR-NUM
                      //  LITERAL_2267 = "2267"
                      methodOut.setErrorNum800(CONSTANTS.LITERAL_2267);
                      // MOVE "1750" TO 800-EDIT-NUM
                      //  LITERAL_1750 = "1750"
                      methodOut.setEditNum800(CONSTANTS.LITERAL_1750);
//  MOVE 800-1750-DESC1 TO 800-ERR-DESC1
                      methodOut.setErrDesc1800(pad(106,methodOut.getDesc18001750(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 800-1750-DESC2 TO 800-ERR-DESC2
                      methodOut.setErrDesc2800(pad(100,methodOut.getDesc28001750(),SPACE_CHAR,RIGHT_PAD));
//  PERFORM 2190-GET-TRAN-AMT
                      getTranAmt(programCtx.getGetTranAmtInCtx());/*2190-GET-TRAN-AMT*/
//  PERFORM 2500-EXTRACT-FIELDS
                      extractFields(programCtx.getExtractFieldsInCtx());/*2500-EXTRACT-FIELDS*/
                      // MOVE 800-TRAN-AMT TO 800-AMT-E1750-TEM
                      methodOut.setAmtE1750Tem800(methodOut.getTranAmt800());
//  MOVE 800-AMT-E1750-TEM (1 : 10) TO 800-USD-AMT
                      methodOut.setUsdAmt800(String.valueOf(substring(methodOut.getAmtE1750Tem800String(),0,10)).toCharArray());
//  MOVE 800-AMT-E1750-TEM (11 : 2) TO 800-USD-AMT-DEC
                      methodOut.setUsdAmtDec800(String.valueOf(substring(methodOut.getAmtE1750Tem800String(),10,12)).toCharArray());
//  ADD 800-AMT-E1750-TEM TO 800-AMT-E1750
                      methodOut.setAmtE1750800(methodOut.getAmtE1750800()+methodOut.getAmtE1750Tem800());
//  ADD 800-TRAN-AMT TO 800-TRANS-AMOUNT
                      methodOut.setTransAmount800(methodOut.getTransAmount800()+methodOut.getTranAmt800());
                  }
              }

// *---------------------------------------------------------------*
// * This condition checks for the edit #1754. if the transaction  *
// * got failed for the errr code 2267 and edit number 1754, then  *
// * the transaction wrriten into sys206 file                      *
// *---------------------------------------------------------------*
//  IF ( 800-L1-CTL-MTI EQUAL '1442' ) AND ( 88-800-PDS841-1754-Y )
//  LITERAL_1442 = '1442'
              if ((compareChars(methodOut.getL1CtlValues800().getL1CtlMti800String(),CONSTANTS.LITERAL_1442) == 0) && ( methodIn.isPds8411754Y88800()  )) { 
//  IF ( 800-PDS005-S3-ERR-CDE (01) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (02) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (03) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (04) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (05) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (06) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (07) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (08) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (09) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (10) = '2267' )
//  LITERAL_2267 = '2267'
                  if ((compareChars(methodIn.getPds005S3ErrCde800(0),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(1),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(2),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(3),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(4),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(5),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(6),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(7),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(8),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(9),CONSTANTS.LITERAL_2267) == 0)) { 
//  SET 88-800-WRITE6-Y TO TRUE
                      methodOut.setWrite6Y88800True(); 
                      
                      // MOVE "2267" TO 800-ERROR-NUM
                      //  LITERAL_2267 = "2267"
                      methodOut.setErrorNum800(CONSTANTS.LITERAL_2267);
                      // MOVE "1754" TO 800-EDIT-NUM
                      //  LITERAL_1754 = "1754"
                      methodOut.setEditNum800(CONSTANTS.LITERAL_1754);
//  MOVE 800-1754-DESC1 TO 800-ERR-DESC1
                      methodOut.setErrDesc1800(pad(106,methodOut.getDesc18001754(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 800-1754-DESC2 TO 800-ERR-DESC2
                      methodOut.setErrDesc2800(pad(100,methodOut.getDesc28001754(),SPACE_CHAR,RIGHT_PAD));
//  PERFORM 2190-GET-TRAN-AMT
                      getTranAmt(programCtx.getGetTranAmtInCtx());/*2190-GET-TRAN-AMT*/
//  PERFORM 2500-EXTRACT-FIELDS
                      extractFields(programCtx.getExtractFieldsInCtx());/*2500-EXTRACT-FIELDS*/
                      // MOVE 800-TRAN-AMT TO 800-AMT-E1754-TEM
                      methodOut.setAmtE1754Tem800(methodOut.getTranAmt800());
//  MOVE 800-AMT-E1754-TEM (1 : 10) TO 800-USD-AMT
                      methodOut.setUsdAmt800(String.valueOf(substring(methodOut.getAmtE1754Tem800String(),0,10)).toCharArray());
//  MOVE 800-AMT-E1754-TEM (11 : 2) TO 800-USD-AMT-DEC
                      methodOut.setUsdAmtDec800(String.valueOf(substring(methodOut.getAmtE1754Tem800String(),10,12)).toCharArray());
//  ADD 800-AMT-E1754-TEM TO 800-AMT-E1754
                      methodOut.setAmtE1754800(methodOut.getAmtE1754800()+methodOut.getAmtE1754Tem800());
//  ADD 800-TRAN-AMT TO 800-TRANS-AMOUNT
                      methodOut.setTransAmount800(methodOut.getTransAmount800()+methodOut.getTranAmt800());
                  }
              }

// *---------------------------------------------------------------*
// * This condition checks for the edit #1848. if the transaction  *
// * got failed for the errr code 2267 and edit number 1848, then  *
// * the transaction wrriten into sys201 file                      *
// *---------------------------------------------------------------*
//  IF ( 800-L1-CTL-MTI EQUAL '1442' ) AND ( 88-800-PDS841-1848-Y )
//  LITERAL_1442 = '1442'
              if ((compareChars(methodOut.getL1CtlValues800().getL1CtlMti800String(),CONSTANTS.LITERAL_1442) == 0) && ( methodIn.isPds8411848Y88800()  )) { 
//  IF ( 800-PDS005-S3-ERR-CDE (01) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (02) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (03) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (04) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (05) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (06) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (07) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (08) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (09) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (10) = '2267' )
//  LITERAL_2267 = '2267'
                  if ((compareChars(methodIn.getPds005S3ErrCde800(0),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(1),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(2),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(3),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(4),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(5),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(6),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(7),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(8),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(9),CONSTANTS.LITERAL_2267) == 0)) { 
//  SET 88-800-WRITE1-Y TO TRUE
                      methodOut.setWrite1Y88800True(); 
                      
                      // MOVE "2267" TO 800-ERROR-NUM
                      //  LITERAL_2267 = "2267"
                      methodOut.setErrorNum800(CONSTANTS.LITERAL_2267);
                      // MOVE "1848" TO 800-EDIT-NUM
                      //  LITERAL_1848 = "1848"
                      methodOut.setEditNum800(CONSTANTS.LITERAL_1848);
//  MOVE 800-1848-DESC1 TO 800-ERR-DESC1
                      methodOut.setErrDesc1800(pad(106,methodOut.getDesc18001848(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 800-1848-DESC2 TO 800-ERR-DESC2
                      methodOut.setErrDesc2800(pad(100,methodOut.getDesc28001848(),SPACE_CHAR,RIGHT_PAD));
//  PERFORM 2190-GET-TRAN-AMT
                      getTranAmt(programCtx.getGetTranAmtInCtx());/*2190-GET-TRAN-AMT*/
//  PERFORM 2500-EXTRACT-FIELDS
                      extractFields(programCtx.getExtractFieldsInCtx());/*2500-EXTRACT-FIELDS*/
                      // MOVE 800-TRAN-AMT TO 800-AMT-E1848-TEM
                      methodOut.setAmtE1848Tem800(methodOut.getTranAmt800());
//  MOVE 800-AMT-E1848-TEM (1 : 10) TO 800-USD-AMT
                      methodOut.setUsdAmt800(String.valueOf(substring(methodOut.getAmtE1848Tem800String(),0,10)).toCharArray());
//  MOVE 800-AMT-E1848-TEM (11 : 2) TO 800-USD-AMT-DEC
                      methodOut.setUsdAmtDec800(String.valueOf(substring(methodOut.getAmtE1848Tem800String(),10,12)).toCharArray());
//  ADD 800-AMT-E1848-TEM TO 800-AMT-E1848
                      methodOut.setAmtE1848800(methodOut.getAmtE1848800()+methodOut.getAmtE1848Tem800());
//  ADD 800-TRAN-AMT TO 800-TRANS-AMOUNT
                      methodOut.setTransAmount800(methodOut.getTransAmount800()+methodOut.getTranAmt800());
                  }
              }

// *---------------------------------------------------------------*
// * This condition checks for the edit #1849. if the transaction  *
// * got failed for the errr code 2267 and edit number 1849, then  *
// * the transaction wrriten into sys202 file                      *
// *---------------------------------------------------------------*
//  IF ( 800-L1-CTL-MTI EQUAL '1442' ) AND ( 88-800-PDS841-1849-Y )
//  LITERAL_1442 = '1442'
              if ((compareChars(methodOut.getL1CtlValues800().getL1CtlMti800String(),CONSTANTS.LITERAL_1442) == 0) && ( methodIn.isPds8411849Y88800()  )) { 
//  IF ( 800-PDS005-S3-ERR-CDE (01) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (02) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (03) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (04) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (05) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (06) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (07) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (08) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (09) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (10) = '2267' )
//  LITERAL_2267 = '2267'
                  if ((compareChars(methodIn.getPds005S3ErrCde800(0),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(1),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(2),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(3),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(4),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(5),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(6),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(7),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(8),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(9),CONSTANTS.LITERAL_2267) == 0)) { 
//  SET 88-800-WRITE2-Y TO TRUE
                      methodOut.setWrite2Y88800True(); 
                      
                      // MOVE "2267" TO 800-ERROR-NUM
                      //  LITERAL_2267 = "2267"
                      methodOut.setErrorNum800(CONSTANTS.LITERAL_2267);
                      // MOVE "1849" TO 800-EDIT-NUM
                      //  LITERAL_1849 = "1849"
                      methodOut.setEditNum800(CONSTANTS.LITERAL_1849);
//  MOVE 800-1849-DESC1 TO 800-ERR-DESC1
                      methodOut.setErrDesc1800(pad(106,methodOut.getDesc18001849(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 800-1849-DESC2 TO 800-ERR-DESC2
                      methodOut.setErrDesc2800(pad(100,methodOut.getDesc28001849(),SPACE_CHAR,RIGHT_PAD));
//  PERFORM 2190-GET-TRAN-AMT
                      getTranAmt(programCtx.getGetTranAmtInCtx());/*2190-GET-TRAN-AMT*/
//  PERFORM 2500-EXTRACT-FIELDS
                      extractFields(programCtx.getExtractFieldsInCtx());/*2500-EXTRACT-FIELDS*/
                      // MOVE 800-TRAN-AMT TO 800-AMT-E1849-TEM
                      methodOut.setAmtE1849Tem800(methodOut.getTranAmt800());
//  MOVE 800-AMT-E1849-TEM (1 : 10) TO 800-USD-AMT
                      methodOut.setUsdAmt800(String.valueOf(substring(methodOut.getAmtE1849Tem800String(),0,10)).toCharArray());
//  MOVE 800-AMT-E1849-TEM (11 : 2) TO 800-USD-AMT-DEC
                      methodOut.setUsdAmtDec800(String.valueOf(substring(methodOut.getAmtE1849Tem800String(),10,12)).toCharArray());
//  ADD 800-AMT-E1849-TEM TO 800-AMT-E1849
                      methodOut.setAmtE1849800(methodOut.getAmtE1849800()+methodOut.getAmtE1849Tem800());
//  ADD 800-TRAN-AMT TO 800-TRANS-AMOUNT
                      methodOut.setTransAmount800(methodOut.getTransAmount800()+methodOut.getTranAmt800());
                  }
              }

// *---------------------------------------------------------------*
// * This condition checks for the edit #1850. if the transaction  *
// * got failed for the errr code 2267 and edit number 1850, then  *
// * the transaction wrriten into sys203 file                      *
// *---------------------------------------------------------------*
//  IF ( 800-L1-CTL-MTI EQUAL '1442' ) AND ( 88-800-PDS841-1850-Y )
//  LITERAL_1442 = '1442'
              if ((compareChars(methodOut.getL1CtlValues800().getL1CtlMti800String(),CONSTANTS.LITERAL_1442) == 0) && ( methodIn.isPds8411850Y88800()  )) { 
//  IF ( 800-PDS005-S3-ERR-CDE (01) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (02) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (03) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (04) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (05) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (06) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (07) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (08) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (09) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (10) = '2267' )
//  LITERAL_2267 = '2267'
                  if ((compareChars(methodIn.getPds005S3ErrCde800(0),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(1),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(2),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(3),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(4),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(5),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(6),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(7),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(8),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(9),CONSTANTS.LITERAL_2267) == 0)) { 
//  SET 88-800-WRITE3-Y TO TRUE
                      methodOut.setWrite3Y88800True(); 
                      
                      // MOVE "2267" TO 800-ERROR-NUM
                      //  LITERAL_2267 = "2267"
                      methodOut.setErrorNum800(CONSTANTS.LITERAL_2267);
                      // MOVE "1850" TO 800-EDIT-NUM
                      //  LITERAL_1850 = "1850"
                      methodOut.setEditNum800(CONSTANTS.LITERAL_1850);
//  MOVE 800-1850-DESC1 TO 800-ERR-DESC1
                      methodOut.setErrDesc1800(methodOut.getDesc18001850());
//  MOVE 800-1850-DESC2 TO 800-ERR-DESC2
                      methodOut.setErrDesc2800(pad(100,methodOut.getDesc28001850(),SPACE_CHAR,RIGHT_PAD));
//  PERFORM 2190-GET-TRAN-AMT
                      getTranAmt(programCtx.getGetTranAmtInCtx());/*2190-GET-TRAN-AMT*/
//  PERFORM 2500-EXTRACT-FIELDS
                      extractFields(programCtx.getExtractFieldsInCtx());/*2500-EXTRACT-FIELDS*/
                      // MOVE 800-TRAN-AMT TO 800-AMT-E1850-TEM
                      methodOut.setAmtE1850Tem800(methodOut.getTranAmt800());
//  MOVE 800-AMT-E1850-TEM (1 : 10) TO 800-USD-AMT
                      methodOut.setUsdAmt800(String.valueOf(substring(methodOut.getAmtE1850Tem800String(),0,10)).toCharArray());
//  MOVE 800-AMT-E1850-TEM (11 : 2) TO 800-USD-AMT-DEC
                      methodOut.setUsdAmtDec800(String.valueOf(substring(methodOut.getAmtE1850Tem800String(),10,12)).toCharArray());
//  ADD 800-AMT-E1850-TEM TO 800-AMT-E1850
                      methodOut.setAmtE1850800(methodOut.getAmtE1850800()+methodOut.getAmtE1850Tem800());
//  ADD 800-TRAN-AMT TO 800-TRANS-AMOUNT
                      methodOut.setTransAmount800(methodOut.getTransAmount800()+methodOut.getTranAmt800());
                  }
              }

// *---------------------------------------------------------------*
// * This condition checks for the edit #1851. if the transaction  *
// * got failed for the errr code 2267 and edit number 1851, then  *
// * the transaction wrriten into sys204 file                      *
// *---------------------------------------------------------------*
//  IF ( 800-L1-CTL-MTI EQUAL '1442' ) AND ( 88-800-PDS841-1851-Y )
//  LITERAL_1442 = '1442'
              if ((compareChars(methodOut.getL1CtlValues800().getL1CtlMti800String(),CONSTANTS.LITERAL_1442) == 0) && ( methodIn.isPds8411851Y88800()  )) { 
//  IF ( 800-PDS005-S3-ERR-CDE (01) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (02) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (03) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (04) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (05) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (06) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (07) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (08) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (09) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (10) = '2267' )
//  LITERAL_2267 = '2267'
                  if ((compareChars(methodIn.getPds005S3ErrCde800(0),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(1),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(2),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(3),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(4),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(5),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(6),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(7),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(8),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(9),CONSTANTS.LITERAL_2267) == 0)) { 
//  SET 88-800-WRITE4-Y TO TRUE
                      methodOut.setWrite4Y88800True(); 
                      
                      // MOVE "2267" TO 800-ERROR-NUM
                      //  LITERAL_2267 = "2267"
                      methodOut.setErrorNum800(CONSTANTS.LITERAL_2267);
                      // MOVE "1851" TO 800-EDIT-NUM
                      //  LITERAL_1851 = "1851"
                      methodOut.setEditNum800(CONSTANTS.LITERAL_1851);
//  MOVE 800-1851-DESC1 TO 800-ERR-DESC1
                      methodOut.setErrDesc1800(pad(106,methodOut.getDesc18001851(),SPACE_CHAR,RIGHT_PAD));
//  MOVE SPACES TO 800-ERR-DESC2
                      methodOut.setErrDesc2800(CONSTANTS.SPACE_100);
//  PERFORM 2190-GET-TRAN-AMT
                      getTranAmt(programCtx.getGetTranAmtInCtx());/*2190-GET-TRAN-AMT*/
//  PERFORM 2500-EXTRACT-FIELDS
                      extractFields(programCtx.getExtractFieldsInCtx());/*2500-EXTRACT-FIELDS*/
                      // MOVE 800-TRAN-AMT TO 800-AMT-E1851-TEM
                      methodOut.setAmtE1851Tem800(methodOut.getTranAmt800());
//  MOVE 800-AMT-E1851-TEM (1 : 10) TO 800-USD-AMT
                      methodOut.setUsdAmt800(String.valueOf(substring(methodOut.getAmtE1851Tem800String(),0,10)).toCharArray());
//  MOVE 800-AMT-E1851-TEM (11 : 2) TO 800-USD-AMT-DEC
                      methodOut.setUsdAmtDec800(String.valueOf(substring(methodOut.getAmtE1851Tem800String(),10,12)).toCharArray());
//  ADD 800-AMT-E1851-TEM TO 800-AMT-E1851
                      methodOut.setAmtE1851800(methodOut.getAmtE1851800()+methodOut.getAmtE1851Tem800());
//  ADD 800-TRAN-AMT TO 800-TRANS-AMOUNT
                      methodOut.setTransAmount800(methodOut.getTransAmount800()+methodOut.getTranAmt800());
                  }
              }

// *---------------------------------------------------------------*
// * This condition checks for the edit #1852. if the transaction  *
// * got failed for the errr code 2267 and edit number 1852, then  *
// * the transaction wrriten into sys205 file                      *
// *---------------------------------------------------------------*
//  IF ( 800-L1-CTL-MTI EQUAL '1442' ) AND ( 88-800-PDS841-1852-Y )
//  LITERAL_1442 = '1442'
              if ((compareChars(methodOut.getL1CtlValues800().getL1CtlMti800String(),CONSTANTS.LITERAL_1442) == 0) && ( methodIn.isPds8411852Y88800()  )) { 
//  IF ( 800-PDS005-S3-ERR-CDE (01) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (02) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (03) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (04) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (05) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (06) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (07) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (08) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (09) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (10) = '2267' )
//  LITERAL_2267 = '2267'
                  if ((compareChars(methodIn.getPds005S3ErrCde800(0),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(1),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(2),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(3),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(4),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(5),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(6),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(7),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(8),CONSTANTS.LITERAL_2267) == 0) || (compareChars(methodIn.getPds005S3ErrCde800(9),CONSTANTS.LITERAL_2267) == 0)) { 
//  SET 88-800-WRITE5-Y TO TRUE
                      methodOut.setWrite5Y88800True(); 
                      
                      // MOVE "2267" TO 800-ERROR-NUM
                      //  LITERAL_2267 = "2267"
                      methodOut.setErrorNum800(CONSTANTS.LITERAL_2267);
                      // MOVE "1852" TO 800-EDIT-NUM
                      //  LITERAL_1852 = "1852"
                      methodOut.setEditNum800(CONSTANTS.LITERAL_1852);
//  MOVE 800-1852-DESC1 TO 800-ERR-DESC1
                      methodOut.setErrDesc1800(pad(106,methodOut.getDesc18001852(),SPACE_CHAR,RIGHT_PAD));
//  MOVE SPACES TO 800-ERR-DESC2
                      methodOut.setErrDesc2800(CONSTANTS.SPACE_100);
//  PERFORM 2190-GET-TRAN-AMT
                      getTranAmt(programCtx.getGetTranAmtInCtx());/*2190-GET-TRAN-AMT*/
//  PERFORM 2500-EXTRACT-FIELDS
                      extractFields(programCtx.getExtractFieldsInCtx());/*2500-EXTRACT-FIELDS*/
                      // MOVE 800-TRAN-AMT TO 800-AMT-E1852-TEM
                      methodOut.setAmtE1852Tem800(methodOut.getTranAmt800());
//  MOVE 800-AMT-E1852-TEM (1 : 10) TO 800-USD-AMT
                      methodOut.setUsdAmt800(String.valueOf(substring(methodOut.getAmtE1852Tem800String(),0,10)).toCharArray());
//  MOVE 800-AMT-E1852-TEM (11 : 2) TO 800-USD-AMT-DEC
                      methodOut.setUsdAmtDec800(String.valueOf(substring(methodOut.getAmtE1852Tem800String(),10,12)).toCharArray());
//  ADD 800-AMT-E1852-TEM TO 800-AMT-E1852
                      methodOut.setAmtE1852800(methodOut.getAmtE1852800()+methodOut.getAmtE1852Tem800());
//  ADD 800-TRAN-AMT TO 800-TRANS-AMOUNT
                      methodOut.setTransAmount800(methodOut.getTransAmount800()+methodOut.getTranAmt800());
                  }
              }
          }
      
      return methodOut;
      }
      /**
      * getTranAmt 
      *   This method is derived from 
  *   COBOL Paragraph - 2190-GET-TRAN-AMT COBOL Cyclomatic complexity - 4
      * Input  :  

      * - ip65504SelElemEnt              COBOL Name: IP65504-SEL-ELEM-ENT
      * - valueX300                      COBOL Name: 300-VALUE-X
      * - ip66102IpmMsg                  COBOL Name: IP66102-IPM-MSG
      *
      * Output :  

      * - tranCurTmp800                  COBOL Name: 800-TRAN-CUR-TMP
      * - ip66102IpmMsg                  COBOL Name: IP66102-IPM-MSG
      * - tranAmtTmp800                  COBOL Name: 800-TRAN-AMT-TMP
      * - tranCur800                     COBOL Name: 800-TRAN-CUR
      * - tranAmt800                     COBOL Name: 800-TRAN-AMT
      *
      * @throws CFException
      */
      @Override
      public GetTranAmtOutCtx getTranAmt(GetTranAmtInCtx methodIn) throws Exception {
      
// *---------------------------------------------------------------*
Ip809050Ctx programCtx = methodIn.getIp809050Ctx();
GetTranAmtOutCtx methodOut = methodIn.getGetTranAmtOutCtx();
//  PERFORM 8100-READ-INPUT-OUTBOUND-FILE
          readInputOutboundFile(programCtx.getReadInputOutboundFileInCtx());/*8100-READ-INPUT-OUTBOUND-FILE*/
//  PERFORM 2110-CALL-READ-PARSER
          callReadParser(programCtx.getCallReadParserInCtx());/*2110-CALL-READ-PARSER*/
//  IF IP65504-SEL-ELEM-ENT (49) = 300-VALUE-X
          if (		compareChars(methodIn.getIp65504SelElemEnt(48),methodIn.getValueX300()) == 0 ) { 
//  MOVE IP66102-IPM-MSG ( IP65504-D49-TRX-CUR-S : IP65504-D49-TRX-CUR-L ) TO 800-TRAN-CUR-TMP
              methodOut.setTranCurTmp800(CFUtil.getInt(substring(methodOut.getIp66102IpmMsg().getCharArray(),(methodIn.getIp65504D49TrxCurS()-1), (methodIn.getIp65504D49TrxCurL() + (methodIn.getIp65504D49TrxCurS() - 1)) )));
          }
//  IF IP65504-SEL-ELEM-ENT (4) = 300-VALUE-X
          if (		compareChars(methodIn.getIp65504SelElemEnt(3),methodIn.getValueX300()) == 0 ) { 
//  MOVE IP66102-IPM-MSG ( IP65504-D04-TRX-AMT-S : IP65504-D04-TRX-AMT-L ) TO 800-TRAN-AMT-TMP
              try {
              methodOut.setTranAmtTmp800(CFUtil.getLong(substring(methodOut.getIp66102IpmMsg().getCharArray(),(methodIn.getIp65504D04TrxAmtS()-1), (methodIn.getIp65504D04TrxAmtL() + (methodIn.getIp65504D04TrxAmtS() - 1)) )));
              } catch(NumberFormatException e) {}
          }
//  IF 800-TRAN-CUR-TMP = '840'
//  LITERAL_840 = '840'
          if (compareChars(methodIn.getWork().getTranCurTmp800String(),CONSTANTS.LITERAL_840) == 0) { 
//  MOVE 800-TRAN-CUR-TMP TO 800-TRAN-CUR
              methodOut.setTranCur800(methodOut.getTranCurTmp800());
              // MOVE 800-TRAN-AMT-TMP TO 800-TRAN-AMT
              methodOut.setTranAmt800(methodOut.getTranAmtTmp800());
          }
//  ELSE
          else { 
//  PERFORM 2200-GET-CUR-EXP
              getCurExp(programCtx.getGetCurExpInCtx());/*2200-GET-CUR-EXP*/
          }
      
      return methodOut;
      }
      /**
      * getCurExp 
      *   This method is derived from 
  *   COBOL Paragraph - 2200-GET-CUR-EXP COBOL Cyclomatic complexity - 2
      * Input  :  

      * - tranCurTmp800                  COBOL Name: 800-TRAN-CUR-TMP
      * - ip00174EntryFound              COBOL Name: IP00174-ENTRY-FOUND
      * - ip00174CurExpCode              COBOL Name: IP00174-CUR-EXP-CODE
      * - tranAmtTmp800                  COBOL Name: 800-TRAN-AMT-TMP
      *
      * Output :  

      * - ip00174CurrCdCode              COBOL Name: IP00174-CURR-CD-CODE
      * - tranCurTmp800                  COBOL Name: 800-TRAN-CUR-TMP
      * - rc                             COBOL Name: RETURN-CODE
      * - tranCurExp800                  COBOL Name: 800-TRAN-CUR-EXP
      * - ip00174CurExpCode              COBOL Name: IP00174-CUR-EXP-CODE
      * - tranCur800                     COBOL Name: 800-TRAN-CUR
      * - tranAmt800                     COBOL Name: 800-TRAN-AMT
      * - tranAmtTmp800                  COBOL Name: 800-TRAN-AMT-TMP
      *
      * @throws CFException
      */
      @Override
      public GetCurExpOutCtx getCurExp(GetCurExpInCtx methodIn) throws Exception {
      
// *---------------------------------------------------------------*
// * This para call the table 17 load api and gets the currency    *
// * exponent for the transaction currency                         *
// *---------------------------------------------------------------*
Ip809050Ctx programCtx = methodIn.getIp809050Ctx();
GetCurExpOutCtx methodOut = methodIn.getGetCurExpOutCtx();
//  MOVE 800-TRAN-CUR-TMP TO IP00174-CURR-CD-CODE
          methodOut.setIp00174CurrCdCode(methodOut.getTranCurTmp800());
//  CALL 800-PTR-IP288010
          // CALL 800-PTR-IP288010
          	programCtx.setRc( ip288010.process(programCtx.getGlobalCtx().getContext("IP288010")));
//  IF 88-IP00174-ENTRY-FOUND-Y
          if ( methodIn.isIp00174EntryFoundY88()  ) { 
//  MOVE IP00174-CUR-EXP-CODE TO 800-TRAN-CUR-EXP
              methodOut.setTranCurExp800(methodOut.getIp00174CurExpCode());
//  PERFORM 2210-CUR-CONV-LOGIC
              curConvLogic(programCtx.getCurConvLogicInCtx());/*2210-CUR-CONV-LOGIC*/
          }
//  ELSE
          else { 
//  DISPLAY 'CURRENCY EXPONENT NOT FOUND FOR THE CURRENCY ' 800-TRAN-CUR-TMP
              logger.info("CURRENCY EXPONENT NOT FOUND FOR THE CURRENCY {}", String.valueOf(methodOut.getTranCurTmp800())); 
//  DISPLAY 'MOVING ORIGINAL CUR & AMT'
              logger.info("MOVING ORIGINAL CUR & AMT"); 
//  MOVE 800-TRAN-CUR-TMP TO 800-TRAN-CUR
              methodOut.setTranCur800(methodOut.getTranCurTmp800());
              // MOVE 800-TRAN-AMT-TMP TO 800-TRAN-AMT
              methodOut.setTranAmt800(methodOut.getTranAmtTmp800());
          }
      
      return methodOut;
      }
      /**
      * curConvLogic 
      *   This method is derived from 
  *   COBOL Paragraph - 2210-CUR-CONV-LOGIC COBOL Cyclomatic complexity - 1
      * Input  :  

      * - fxDateYyddd800                 COBOL Name: 800-FX-DATE-YYDDD
      * - ip00694GlobalCurrCode          COBOL Name: IP00694-GLOBAL-CURR-CODE
      * - ip00694GlobalCurrExp           COBOL Name: IP00694-GLOBAL-CURR-EXP
      * - tranAmtTmp800                  COBOL Name: 800-TRAN-AMT-TMP
      * - tranCurTmp800                  COBOL Name: 800-TRAN-CUR-TMP
      * - tranCurExp800                  COBOL Name: 800-TRAN-CUR-EXP
      *
      * Output :  

      * - ip33701ConvRateTrgAsRef        COBOL Name: IP33701-CONV-RATE-TRG-AS-REF
      * - ip33701ApplyConvRate           COBOL Name: IP33701-APPLY-CONV-RATE
      * - ip33701ApplyCrossRate          COBOL Name: IP33701-APPLY-CROSS-RATE
      * - ip33701FxDateYyddd             COBOL Name: IP33701-FX-DATE-YYDDD
      * - fxDateYyddd800                 COBOL Name: 800-FX-DATE-YYDDD
      * - ip33701TargetCurCode           COBOL Name: IP33701-TARGET-CUR-CODE
      * - ip00694GlobalCurrCode          COBOL Name: IP00694-GLOBAL-CURR-CODE
      * - ip33701TargetCurExp            COBOL Name: IP33701-TARGET-CUR-EXP
      * - ip00694GlobalCurrExp           COBOL Name: IP00694-GLOBAL-CURR-EXP
      * - ip33701SourceAmount            COBOL Name: IP33701-SOURCE-AMOUNT
      * - tranAmtTmp800                  COBOL Name: 800-TRAN-AMT-TMP
      * - ip33701SourceCurCode           COBOL Name: IP33701-SOURCE-CUR-CODE
      * - tranCurTmp800                  COBOL Name: 800-TRAN-CUR-TMP
      * - ip33701SourceCurExp            COBOL Name: IP33701-SOURCE-CUR-EXP
      * - tranCurExp800                  COBOL Name: 800-TRAN-CUR-EXP
      *
      * @throws CFException
      */
      @Override
      public CurConvLogicOutCtx curConvLogic(CurConvLogicInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This para will move the transaction currency code and the      *
// * currency code exponents and call the currency conversion para  *
// *----------------------------------------------------------------*
Ip809050Ctx programCtx = methodIn.getIp809050Ctx();
CurConvLogicOutCtx methodOut = methodIn.getCurConvLogicOutCtx();
//  SET 88-IP33701-XRATE1-MID-RT TO TRUE
          methodOut.setIp33701Xrate1MidRt88True(); 
          
//  SET 88-IP33701-DIVIDE-BY-RATE TO TRUE
          methodOut.setIp33701DivideByRate88True(); 
          
//  SET 88-IP33701-NO-CROSS-RATE TO TRUE
          methodOut.setIp33701NoCrossRate88True(); 
          
          // MOVE 800-FX-DATE-YYDDD TO IP33701-FX-DATE-YYDDD
          methodOut.setIp33701FxDateYyddd(methodOut.getFxDateYyddd800());
//  MOVE IP00694-GLOBAL-CURR-CODE TO IP33701-TARGET-CUR-CODE
          methodOut.setIp33701TargetCurCode(methodOut.getIp00694GlobalCurrCode());
//  MOVE IP00694-GLOBAL-CURR-EXP TO IP33701-TARGET-CUR-EXP
          methodOut.setIp33701TargetCurExp(String.valueOf(methodOut.getIp00694GlobalCurrExpString()).toCharArray());
//  MOVE 800-TRAN-AMT-TMP TO IP33701-SOURCE-AMOUNT
          methodOut.setIp33701SourceAmount(methodOut.getTranAmtTmp800());
//  MOVE 800-TRAN-CUR-TMP TO IP33701-SOURCE-CUR-CODE
          methodOut.setIp33701SourceCurCode(methodOut.getTranCurTmp800());
//  MOVE 800-TRAN-CUR-EXP TO IP33701-SOURCE-CUR-EXP
          methodOut.setIp33701SourceCurExp(String.valueOf(methodOut.getTranCurExp800String()).toCharArray());
//  PERFORM 8400-DO-CURRENCY-CONVERSION
          doCurrencyConversion(programCtx.getDoCurrencyConversionInCtx());/*8400-DO-CURRENCY-CONVERSION*/
          ;
      
      return methodOut;
      }
      /**
      * doCurrencyConversion 
      *   This method is derived from 
  *   COBOL Paragraph - 8400-DO-CURRENCY-CONVERSION COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ip33701ReturnCode              COBOL Name: IP33701-RETURN-CODE
      * - ip33701TargetAmount            COBOL Name: IP33701-TARGET-AMOUNT
      * - ip33701TargetCurCode           COBOL Name: IP33701-TARGET-CUR-CODE
      * - tranCurTmp800                  COBOL Name: 800-TRAN-CUR-TMP
      * - tranAmtTmp800                  COBOL Name: 800-TRAN-AMT-TMP
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      * - tranAmt800                     COBOL Name: 800-TRAN-AMT
      * - ip33701TargetAmount            COBOL Name: IP33701-TARGET-AMOUNT
      * - tranCur800                     COBOL Name: 800-TRAN-CUR
      * - ip33701TargetCurCode           COBOL Name: IP33701-TARGET-CUR-CODE
      * - tranCurTmp800                  COBOL Name: 800-TRAN-CUR-TMP
      * - tranAmtTmp800                  COBOL Name: 800-TRAN-AMT-TMP
      *
      * @throws CFException
      */
      @Override
      public DoCurrencyConversionOutCtx doCurrencyConversion(DoCurrencyConversionInCtx methodIn) throws Exception {
      
// *---------------------------------------------------------------*
// * This para calls the currency conversion module                *
// *---------------------------------------------------------------*
Ip809050Ctx programCtx = methodIn.getIp809050Ctx();
DoCurrencyConversionOutCtx methodOut = methodIn.getDoCurrencyConversionOutCtx();
//  CALL 800-PTR-IP783510
          // CALL 800-PTR-IP783510
          	programCtx.setRc( ip783510.process(programCtx.getGlobalCtx().getContext("IP783510")));
//  IF IP33701-RETURN-CODE EQUAL ZEROES
          if (	( methodIn.getIp33701ReturnCode() == 0 ) ) { 
//  MOVE IP33701-TARGET-AMOUNT TO 800-TRAN-AMT
              methodOut.setTranAmt800(methodOut.getIp33701TargetAmount());
//  MOVE IP33701-TARGET-CUR-CODE TO 800-TRAN-CUR
              methodOut.setTranCur800(methodOut.getIp33701TargetCurCode());
          }
//  ELSE
          else { 
//  DISPLAY 'CURRNCY CONVERSION FAILED FOR THE CURRENCY ' 800-TRAN-CUR-TMP
              logger.info("CURRNCY CONVERSION FAILED FOR THE CURRENCY {}", String.valueOf(methodOut.getTranCurTmp800())); 
//  DISPLAY 'MOVING THE ORIGINAL CUR & AMT'
              logger.info("MOVING THE ORIGINAL CUR & AMT"); 
//  MOVE 800-TRAN-CUR-TMP TO 800-TRAN-CUR
              methodOut.setTranCur800(methodOut.getTranCurTmp800());
              // MOVE 800-TRAN-AMT-TMP TO 800-TRAN-AMT
              methodOut.setTranAmt800(methodOut.getTranAmtTmp800());
          }
      
      return methodOut;
      }
      /**
      * writeOutboundFile1 
      *   This method is derived from 
  *   COBOL Paragraph - 8200-WRITE-OUTBOUND-FILE1 COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sys201OutputIpmOtbndRec        COBOL Name: SYS201-OUTPUT-IPM-OTBND-REC
      * - ipmRecordsPds1400              COBOL Name: 400-IPM-RECORDS-PDS1
      *
      * Output :  

      * - outputOtbndFileStatus201       COBOL Name: 201-OUTPUT-OTBND-FILE-STATUS
      * - ipmRecordsPds1400              COBOL Name: 400-IPM-RECORDS-PDS1
      *
      * @throws CFException
      */
      @Override
      public WriteOutboundFile1OutCtx writeOutboundFile1(WriteOutboundFile1InCtx methodIn) throws Exception {
      
// *---------------------------------------------------------------*
// * Writes outbound file (sys201)                                 *
// *---------------------------------------------------------------*
Ip809050Ctx programCtx = methodIn.getIp809050Ctx();
WriteOutboundFile1OutCtx methodOut = methodIn.getWriteOutboundFile1OutCtx();
//  WRITE SYS201-OUTPUT-IPM-OTBND-REC FROM 800-CHIP-LIAB-VARIABLES
          sys201OutputIpmOtbndFile.write(methodIn.getChipLiabVariables800().toCharArray()); 
          methodOut.getSys201OutputIpmOtbndRec().setString(CONSTANTS.LOW_VALUE_215605977);
          methodOut.setOutputOtbndFileStatus201(sys201OutputIpmOtbndFile.getStatusString() );
//  ADD 1 TO 400-IPM-RECORDS-PDS1
          methodOut.setIpmRecordsPds1400(methodOut.getIpmRecordsPds1400()+1);
//  IF 88-200-SYS201-STATUS-GOOD
//  ELSE
          if (!(methodOut.isSys201StatusGood88200()) ) { 
//  DISPLAY 'SYS201 WRITE ERROR !! '
              logger.info("SYS201 WRITE ERROR !! "); 
          }
      
      return methodOut;
      }
      /**
      * writeOutboundFile2 
      *   This method is derived from 
  *   COBOL Paragraph - 8200-WRITE-OUTBOUND-FILE2 COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sys202OutputIpmOtbndRec        COBOL Name: SYS202-OUTPUT-IPM-OTBND-REC
      * - ipmRecordsPds2400              COBOL Name: 400-IPM-RECORDS-PDS2
      *
      * Output :  

      * - outputOtbndFileStatus202       COBOL Name: 202-OUTPUT-OTBND-FILE-STATUS
      * - ipmRecordsPds2400              COBOL Name: 400-IPM-RECORDS-PDS2
      *
      * @throws CFException
      */
      @Override
      public WriteOutboundFile2OutCtx writeOutboundFile2(WriteOutboundFile2InCtx methodIn) throws Exception {
      
// *---------------------------------------------------------------*
// * Writes outbound file (sys202)                                 *
// *---------------------------------------------------------------*
Ip809050Ctx programCtx = methodIn.getIp809050Ctx();
WriteOutboundFile2OutCtx methodOut = methodIn.getWriteOutboundFile2OutCtx();
//  WRITE SYS202-OUTPUT-IPM-OTBND-REC FROM 800-CHIP-LIAB-VARIABLES
          sys202OutputIpmOtbndFile.write(methodIn.getChipLiabVariables800().toCharArray()); 
          methodOut.getSys202OutputIpmOtbndRec().setString(CONSTANTS.LOW_VALUE_215605977);
          methodOut.setOutputOtbndFileStatus202(sys202OutputIpmOtbndFile.getStatusString() );
//  ADD 1 TO 400-IPM-RECORDS-PDS2
          methodOut.setIpmRecordsPds2400(methodOut.getIpmRecordsPds2400()+1);
//  IF 88-200-SYS202-STATUS-GOOD
//  ELSE
          if (!(methodOut.isSys202StatusGood88200()) ) { 
//  DISPLAY 'SYS202 WRITE ERROR !! '
              logger.info("SYS202 WRITE ERROR !! "); 
          }
      
      return methodOut;
      }
      /**
      * writeOutboundFile3 
      *   This method is derived from 
  *   COBOL Paragraph - 8200-WRITE-OUTBOUND-FILE3 COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sys203OutputIpmOtbndRec        COBOL Name: SYS203-OUTPUT-IPM-OTBND-REC
      * - ipmRecordsPds3400              COBOL Name: 400-IPM-RECORDS-PDS3
      *
      * Output :  

      * - outputOtbndFileStatus203       COBOL Name: 203-OUTPUT-OTBND-FILE-STATUS
      * - ipmRecordsPds3400              COBOL Name: 400-IPM-RECORDS-PDS3
      *
      * @throws CFException
      */
      @Override
      public WriteOutboundFile3OutCtx writeOutboundFile3(WriteOutboundFile3InCtx methodIn) throws Exception {
      
// *---------------------------------------------------------------*
// * Writes outbound file (sys203)                                 *
// *---------------------------------------------------------------*
Ip809050Ctx programCtx = methodIn.getIp809050Ctx();
WriteOutboundFile3OutCtx methodOut = methodIn.getWriteOutboundFile3OutCtx();
//  WRITE SYS203-OUTPUT-IPM-OTBND-REC FROM 800-CHIP-LIAB-VARIABLES
          sys203OutputIpmOtbndFile.write(methodIn.getChipLiabVariables800().toCharArray()); 
          methodOut.getSys203OutputIpmOtbndRec().setString(CONSTANTS.LOW_VALUE_215605977);
          methodOut.setOutputOtbndFileStatus203(sys203OutputIpmOtbndFile.getStatusString() );
//  ADD 1 TO 400-IPM-RECORDS-PDS3
          methodOut.setIpmRecordsPds3400(methodOut.getIpmRecordsPds3400()+1);
//  IF 88-200-SYS203-STATUS-GOOD
//  ELSE
          if (!(methodOut.isSys203StatusGood88200()) ) { 
//  DISPLAY 'SYS203 WRITE ERROR !! '
              logger.info("SYS203 WRITE ERROR !! "); 
          }
      
      return methodOut;
      }
      /**
      * writeOutboundFile4 
      *   This method is derived from 
  *   COBOL Paragraph - 8200-WRITE-OUTBOUND-FILE4 COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sys204OutputIpmOtbndRec        COBOL Name: SYS204-OUTPUT-IPM-OTBND-REC
      * - ipmRecordsPds4400              COBOL Name: 400-IPM-RECORDS-PDS4
      *
      * Output :  

      * - outputOtbndFileStatus204       COBOL Name: 204-OUTPUT-OTBND-FILE-STATUS
      * - ipmRecordsPds4400              COBOL Name: 400-IPM-RECORDS-PDS4
      *
      * @throws CFException
      */
      @Override
      public WriteOutboundFile4OutCtx writeOutboundFile4(WriteOutboundFile4InCtx methodIn) throws Exception {
      
// *---------------------------------------------------------------*
// * Writes outbound file (sys204)                                 *
// *---------------------------------------------------------------*
Ip809050Ctx programCtx = methodIn.getIp809050Ctx();
WriteOutboundFile4OutCtx methodOut = methodIn.getWriteOutboundFile4OutCtx();
//  WRITE SYS204-OUTPUT-IPM-OTBND-REC FROM 800-CHIP-LIAB-VARIABLES
          sys204OutputIpmOtbndFile.write(methodIn.getChipLiabVariables800().toCharArray()); 
          methodOut.getSys204OutputIpmOtbndRec().setString(CONSTANTS.LOW_VALUE_215605977);
          methodOut.setOutputOtbndFileStatus204(sys204OutputIpmOtbndFile.getStatusString() );
//  ADD 1 TO 400-IPM-RECORDS-PDS4
          methodOut.setIpmRecordsPds4400(methodOut.getIpmRecordsPds4400()+1);
//  IF 88-200-SYS204-STATUS-GOOD
//  ELSE
          if (!(methodOut.isSys204StatusGood88200()) ) { 
//  DISPLAY 'SYS204 WRITE ERROR !! '
              logger.info("SYS204 WRITE ERROR !! "); 
          }
      
      return methodOut;
      }
      /**
      * writeOutboundFile5 
      *   This method is derived from 
  *   COBOL Paragraph - 8200-WRITE-OUTBOUND-FILE5 COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sys205OutputIpmOtbndRec        COBOL Name: SYS205-OUTPUT-IPM-OTBND-REC
      * - ipmRecordsPds5400              COBOL Name: 400-IPM-RECORDS-PDS5
      *
      * Output :  

      * - outputOtbndFileStatus205       COBOL Name: 205-OUTPUT-OTBND-FILE-STATUS
      * - ipmRecordsPds5400              COBOL Name: 400-IPM-RECORDS-PDS5
      *
      * @throws CFException
      */
      @Override
      public WriteOutboundFile5OutCtx writeOutboundFile5(WriteOutboundFile5InCtx methodIn) throws Exception {
      
// *---------------------------------------------------------------*
// * Writes outbound file (sys205)                                 *
// *---------------------------------------------------------------*
Ip809050Ctx programCtx = methodIn.getIp809050Ctx();
WriteOutboundFile5OutCtx methodOut = methodIn.getWriteOutboundFile5OutCtx();
//  WRITE SYS205-OUTPUT-IPM-OTBND-REC FROM 800-CHIP-LIAB-VARIABLES
          sys205OutputIpmOtbndFile.write(methodIn.getChipLiabVariables800().toCharArray()); 
          methodOut.getSys205OutputIpmOtbndRec().setString(CONSTANTS.LOW_VALUE_215605977);
          methodOut.setOutputOtbndFileStatus205(sys205OutputIpmOtbndFile.getStatusString() );
//  ADD 1 TO 400-IPM-RECORDS-PDS5
          methodOut.setIpmRecordsPds5400(methodOut.getIpmRecordsPds5400()+1);
//  IF 88-200-SYS205-STATUS-GOOD
//  ELSE
          if (!(methodOut.isSys205StatusGood88200()) ) { 
//  DISPLAY 'SYS205 WRITE ERROR !! '
              logger.info("SYS205 WRITE ERROR !! "); 
          }
      
      return methodOut;
      }
      /**
      * writeOutboundFile6 
      *   This method is derived from 
  *   COBOL Paragraph - 8200-WRITE-OUTBOUND-FILE6 COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sys206OutputIpmOtbndRec        COBOL Name: SYS206-OUTPUT-IPM-OTBND-REC
      * - ipmRecordsPds6400              COBOL Name: 400-IPM-RECORDS-PDS6
      *
      * Output :  

      * - outputOtbndFileStatus206       COBOL Name: 206-OUTPUT-OTBND-FILE-STATUS
      * - ipmRecordsPds6400              COBOL Name: 400-IPM-RECORDS-PDS6
      *
      * @throws CFException
      */
      @Override
      public WriteOutboundFile6OutCtx writeOutboundFile6(WriteOutboundFile6InCtx methodIn) throws Exception {
      
// *---------------------------------------------------------------*
// * Writes outbound file (sys206)                                 *
// *---------------------------------------------------------------*
Ip809050Ctx programCtx = methodIn.getIp809050Ctx();
WriteOutboundFile6OutCtx methodOut = methodIn.getWriteOutboundFile6OutCtx();
//  WRITE SYS206-OUTPUT-IPM-OTBND-REC FROM 800-CHIP-LIAB-VARIABLES
          sys206OutputIpmOtbndFile.write(methodIn.getChipLiabVariables800().toCharArray()); 
          methodOut.getSys206OutputIpmOtbndRec().setString(CONSTANTS.LOW_VALUE_215605977);
          methodOut.setOutputOtbndFileStatus206(sys206OutputIpmOtbndFile.getStatusString() );
//  ADD 1 TO 400-IPM-RECORDS-PDS6
          methodOut.setIpmRecordsPds6400(methodOut.getIpmRecordsPds6400()+1);
//  IF 88-200-SYS206-STATUS-GOOD
//  ELSE
          if (!(methodOut.isSys206StatusGood88200()) ) { 
//  DISPLAY 'SYS206 WRITE ERROR !! '
              logger.info("SYS206 WRITE ERROR !! "); 
          }
      
      return methodOut;
      }
      /**
      * writeOutboundFile7 
      *   This method is derived from 
  *   COBOL Paragraph - 8200-WRITE-OUTBOUND-FILE7 COBOL Cyclomatic complexity - 4
      * Input  :  

      * - l1CtlMti800                    COBOL Name: 800-L1-CTL-MTI
      * - pds841S1800                    COBOL Name: 800-PDS841-S1
      * - sys207OutputIpmOtbndRec        COBOL Name: SYS207-OUTPUT-IPM-OTBND-REC
      * - ipmRecordsPds7400              COBOL Name: 400-IPM-RECORDS-PDS7
      *
      * Output :  

      * - outputOtbndFileStatus207       COBOL Name: 207-OUTPUT-OTBND-FILE-STATUS
      * - ipmRecordsPds7400              COBOL Name: 400-IPM-RECORDS-PDS7
      *
      * @throws CFException
      */
      @Override
      public WriteOutboundFile7OutCtx writeOutboundFile7(WriteOutboundFile7InCtx methodIn) throws Exception {
      
// *---------------------------------------------------------------*
// * Writes outbound file (sys207)                                 *
// *---------------------------------------------------------------*
Ip809050Ctx programCtx = methodIn.getIp809050Ctx();
WriteOutboundFile7OutCtx methodOut = methodIn.getWriteOutboundFile7OutCtx();
//  IF ( 800-L1-CTL-MTI EQUAL '1442' ) AND ( 88-800-PDS841-1750-Y )
//  LITERAL_1442 = '1442'
          if ((compareChars(methodIn.getL1CtlValues800().getL1CtlMti800String(),CONSTANTS.LITERAL_1442) == 0) && ( methodIn.isPds8411750Y88800()  )) { 
//  WRITE SYS207-OUTPUT-IPM-OTBND-REC FROM 800-CHIP-LIAB-VARIABLES
              sys207OutputIpmOtbndFile.write(methodIn.getChipLiabVariables800().toCharArray()); 
              methodOut.getSys207OutputIpmOtbndRec().setString(CONSTANTS.LOW_VALUE_215605977);
              methodOut.setOutputOtbndFileStatus207(sys207OutputIpmOtbndFile.getStatusString() );
//  ADD 1 TO 400-IPM-RECORDS-PDS7
              methodOut.setIpmRecordsPds7400(methodOut.getIpmRecordsPds7400()+1);
          }
//  IF 88-200-SYS207-STATUS-GOOD
//  ELSE
          if (!(methodOut.isSys207StatusGood88200()) ) { 
//  DISPLAY 'SYS207 WRITE ERROR !! '
              logger.info("SYS207 WRITE ERROR !! "); 
          }
      
      return methodOut;
      }
      /**
      * extractFields 
      *   This method is derived from 
  *   COBOL Paragraph - 2500-EXTRACT-FIELDS COBOL Cyclomatic complexity - 12
      * Input  :  

      * - ip65504SelElemEnt              COBOL Name: IP65504-SEL-ELEM-ENT
      * - valueX300                      COBOL Name: 300-VALUE-X
      * - ip66102NormalIpmMsg            COBOL Name: IP66102-NORMAL-IPM-MSG
      * - ip65504D02PanNbrS              COBOL Name: IP65504-D02-PAN-NBR-S
      * - ip65504D02PanNbrL              COBOL Name: IP65504-D02-PAN-NBR-L
      * - ip65504D04TrxAmtS              COBOL Name: IP65504-D04-TRX-AMT-S
      * - ip65504D04TrxAmtL              COBOL Name: IP65504-D04-TRX-AMT-L
      * - ip66102IpmMsg                  COBOL Name: IP66102-IPM-MSG
      * - ip00724EntryFoundY             COBOL Name: IP00724-ENTRY-FOUND-Y
      * - ip00724MemberName              COBOL Name: IP00724-MEMBER-NAME
      * - ip00724CountryCode             COBOL Name: IP00724-COUNTRY-CODE
      * - ip08101ProcessDate             COBOL Name: IP08101-PROCESS-DATE
      *
      * Output :  

      * - txnPrimAcctNbr800              COBOL Name: 800-TXN-PRIM-ACCT-NBR
      * - ip66102NormalIpmMsg            COBOL Name: IP66102-NORMAL-IPM-MSG
      * - txnAmt2800                     COBOL Name: 800-TXN-AMT2
      * - txnAmt800                      COBOL Name: 800-TXN-AMT
      * - txnAmtDec800                   COBOL Name: 800-TXN-AMT-DEC
      * - de022800                       COBOL Name: 800-DE022
      * - de031800                       COBOL Name: 800-DE031
      * - txnCurr800                     COBOL Name: 800-TXN-CURR
      * - ip66102IpmMsg                  COBOL Name: IP66102-IPM-MSG
      * - sndrMbrId800                   COBOL Name: 800-SNDR-MBR-ID
      * - ip00724Ica                     COBOL Name: IP00724-ICA
      * - rc                             COBOL Name: RETURN-CODE
      * - custName800                    COBOL Name: 800-CUST-NAME
      * - ip00724MemberName              COBOL Name: IP00724-MEMBER-NAME
      * - countryCode800                 COBOL Name: 800-COUNTRY-CODE
      * - ip00724CountryCode             COBOL Name: IP00724-COUNTRY-CODE
      * - cbhRefNum800                   COBOL Name: 800-CBH-REF-NUM
      * - cbhDate800                     COBOL Name: 800-CBH-DATE
      * - ip08101ProcessDate             COBOL Name: IP08101-PROCESS-DATE
      *
      * @throws CFException
      */
      @Override
      public ExtractFieldsOutCtx extractFields(ExtractFieldsInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// * This paragraph extracts all the required values for the        *
// * output file.                                                   *
// *-----------------------------------------------------------------

// * Extract de002
Ip809050Ctx programCtx = methodIn.getIp809050Ctx();
ExtractFieldsOutCtx methodOut = methodIn.getExtractFieldsOutCtx();
//  MOVE ZEROES TO 800-TXN-PRIM-ACCT-NBR
          methodOut.setTxnPrimAcctNbr800(CONSTANTS.ZERO_19);
//  IF IP65504-SEL-ELEM-ENT (02) EQUAL 300-VALUE-X
          if (		compareChars(methodIn.getIp65504SelElemEnt(1),methodIn.getValueX300()) == 0 ) { 
//  IF IP66102-NORMAL-IPM-MSG ( IP65504-D02-PAN-NBR-S : IP65504-D02-PAN-NBR-L ) IS NUMERIC
              if (    isNumeric(substring(methodOut.getIp66102NormalIpmMsg().toCharArray(),(methodIn.getIp65504D02PanNbrS()-1), (methodIn.getIp65504D02PanNbrL() + (methodIn.getIp65504D02PanNbrS() - 1)) ))) { 
//  MOVE IP66102-NORMAL-IPM-MSG ( IP65504-D02-PAN-NBR-S : IP65504-D02-PAN-NBR-L ) TO 800-TXN-PRIM-ACCT-NBR
                  methodIn.getChipLiabVariables800().replace(methodOut.getIp66102IpmMsg()/*parent*/,0+methodIn.getIp65504D02PanNbrS() - 1/*fromOffset - (txnPrimAcctNbr800) */,methodIn.getIp65504D02PanNbrL()/*fromLen*/,0/*toOffset - (ip66102NormalIpmMsg) */,19/*toLen*/);
              }
          }

// * Extract de004
//  IF IP65504-SEL-ELEM-ENT (04) EQUAL 300-VALUE-X
          if (		compareChars(methodIn.getIp65504SelElemEnt(3),methodIn.getValueX300()) == 0 ) { 
//  IF IP66102-NORMAL-IPM-MSG ( IP65504-D04-TRX-AMT-S : IP65504-D04-TRX-AMT-L ) IS NUMERIC
              if (    isNumeric(substring(methodOut.getIp66102NormalIpmMsg().toCharArray(),(methodIn.getIp65504D04TrxAmtS()-1), (methodIn.getIp65504D04TrxAmtL() + (methodIn.getIp65504D04TrxAmtS() - 1)) ))) { 
//  MOVE IP66102-NORMAL-IPM-MSG ( IP65504-D04-TRX-AMT-S : IP65504-D04-TRX-AMT-L ) TO 800-TXN-AMT2
                  methodOut.setTxnAmt2800(substring(methodOut.getIp66102NormalIpmMsg().toCharArray(),(methodIn.getIp65504D04TrxAmtS()-1), (methodIn.getIp65504D04TrxAmtL() + (methodIn.getIp65504D04TrxAmtS() - 1)) ));
                  // MOVE 800-TXN-AMT2 (1 : 10) TO 800-TXN-AMT
                  methodOut.setTxnAmt800(methodOut.getTxnAmt2800()/* txnAmt2800 */,0,10,0/* txnAmt800 */,methodOut.getTxnAmt800().length);
                  // MOVE 800-TXN-AMT2 (11 : 2) TO 800-TXN-AMT-DEC
                  methodOut.setTxnAmtDec800(methodOut.getTxnAmt2800()/* txnAmt2800 */,10,2,0/* txnAmtDec800 */,methodOut.getTxnAmtDec800().length);
              }
          }

// * Extract de022
//  IF IP65504-SEL-ELEM-ENT (22) EQUAL 300-VALUE-X
          if (		compareChars(methodIn.getIp65504SelElemEnt(21),methodIn.getValueX300()) == 0 ) { 
//  MOVE IP66102-NORMAL-IPM-MSG ( IP65504-D22-POI-DCD-S : IP65504-D22-POI-DCD-L ) TO 800-DE022
              methodIn.getChipLiabVariables800().replace(methodOut.getIp66102IpmMsg()/*parent*/,0+methodIn.getIp65504D22PoiDcdS() - 1/*fromOffset - (de022800) */,methodIn.getIp65504D22PoiDcdL()/*fromLen*/,344/*toOffset - (ip66102NormalIpmMsg) */,12/*toLen*/);
          }
//  ELSE
          else { 
//  MOVE SPACES TO 800-DE022
              methodOut.setDe022800(CONSTANTS.SPACE_12);
          }

// * Extract de031
//  IF IP65504-SEL-ELEM-ENT (31) EQUAL 300-VALUE-X
          if (		compareChars(methodIn.getIp65504SelElemEnt(30),methodIn.getValueX300()) == 0 ) { 
//  MOVE IP66102-NORMAL-IPM-MSG ( IP65504-D31-ACQ-REF-S : IP65504-D31-ACQ-REF-L ) TO 800-DE031
              methodIn.getChipLiabVariables800().replace(methodOut.getIp66102IpmMsg()/*parent*/,0+methodIn.getIp65504D31AcqRefS() - 1/*fromOffset - (de031800) */,methodIn.getIp65504D31AcqRefL()/*fromLen*/,296/*toOffset - (ip66102NormalIpmMsg) */,23/*toLen*/);
          }
//  ELSE
          else { 
//  MOVE SPACES TO 800-DE031
              methodOut.setDe031800(CONSTANTS.SPACE_23);
          }

// * Extract de049
//  IF IP65504-SEL-ELEM-ENT (49) = 300-VALUE-X
          if (		compareChars(methodIn.getIp65504SelElemEnt(48),methodIn.getValueX300()) == 0 ) { 
//  MOVE IP66102-IPM-MSG ( IP65504-D49-TRX-CUR-S : IP65504-D49-TRX-CUR-L ) TO 800-TXN-CURR
              methodOut.setTxnCurr800(substring(methodOut.getIp66102IpmMsg().getCharArray(),(methodIn.getIp65504D49TrxCurS()-1), (methodIn.getIp65504D49TrxCurL() + (methodIn.getIp65504D49TrxCurS() - 1)) ));
          }

// * Extract de94 value  outbound message
//  IF IP65504-SEL-ELEM-ENT (94) EQUAL 'X'
          if (methodIn.getIp65504SelElemEnt(93)[0] == 'X') { 
//  MOVE IP66102-NORMAL-IPM-MSG ( IP65504-D94-TRX-OID-S : IP65504-D94-TRX-OID-L ) TO 800-SNDR-MBR-ID IP00724-ICA
              try {
              methodIn.getChipLiabVariables800().replace(methodOut.getIp66102IpmMsg()/*parent*/,0+methodIn.getIp65504D94TrxOidS() - 1/*fromOffset - (sndrMbrId800) */,methodIn.getIp65504D94TrxOidL()/*fromLen*/,20/*toOffset - (ip66102NormalIpmMsg) */,11/*toLen*/);
              } catch(NumberFormatException e) {}
              try {
              methodOut.setIp00724Ica(CFUtil.getLong(substring(methodOut.getIp66102NormalIpmMsg().toCharArray(),(methodIn.getIp65504D94TrxOidS()-1), (methodIn.getIp65504D94TrxOidL() + (methodIn.getIp65504D94TrxOidS() - 1)) )));
              } catch(NumberFormatException e) {}
//  CALL 800-PTR-IP281010
              // CALL 800-PTR-IP281010
              	programCtx.setRc( ip281010.process(programCtx.getGlobalCtx().getContext("IP281010")));
//  IF 88-IP00724-ENTRY-FOUND-Y
              if ( methodIn.isIp00724EntryFoundY88()  ) { 
//  MOVE IP00724-MEMBER-NAME TO 800-CUST-NAME
                  methodOut.setCustName800(methodOut.getIp00724MemberName());
//  INSPECT 800-CUST-NAME REPLACING ALL ',' BY SPACE
                  methodOut.setCustName800(  replaceAll(methodOut.getCustName800(),CONSTANTS.LITERAL_34072,CONSTANTS.SPACE)  );
//  MOVE IP00724-COUNTRY-CODE TO 800-COUNTRY-CODE
                  methodOut.setCountryCode800(methodOut.getIp00724CountryCode());
//  PERFORM 8000-GET-REGION-NAME
                  getRegionName(programCtx.getGetRegionNameInCtx());/*8000-GET-REGION-NAME*/
              }
//  ELSE
          }
//  ELSE
          else { 
//  MOVE ZEROES TO 800-SNDR-MBR-ID
              methodOut.setSndrMbrId800(CONSTANTS.ZERO_11);
          }

// * Extract de95 value  outbound message
//  IF IP65504-SEL-ELEM-ENT (95) EQUAL 300-VALUE-X
          if (		compareChars(methodIn.getIp65504SelElemEnt(94),methodIn.getValueX300()) == 0 ) { 
//  MOVE IP66102-NORMAL-IPM-MSG ( IP65504-D95-CARD-IS-S : IP65504-D95-CARD-IS-L ) TO 800-CBH-REF-NUM
              methodIn.getChipLiabVariables800().replace(methodOut.getIp66102IpmMsg()/*parent*/,0+methodIn.getIp65504D95CardIsS() - 1/*fromOffset - (cbhRefNum800) */,methodIn.getIp65504D95CardIsL()/*fromLen*/,322/*toOffset - (ip66102NormalIpmMsg) */,10/*toLen*/);
          }
//  ELSE
          else { 
//  MOVE ZEROES TO 800-CBH-REF-NUM
              methodOut.setCbhRefNum800(CONSTANTS.ZERO_10);
          }

// * Extract de95 value  outbound message
//  IF IP65504-SEL-ELEM-ENT (95) EQUAL 300-VALUE-X
          if (		compareChars(methodIn.getIp65504SelElemEnt(94),methodIn.getValueX300()) == 0 ) { 
//  MOVE IP08101-PROCESS-DATE TO 800-CBH-DATE
              methodOut.setCbhDate800(String.valueOf(methodOut.getIp08101ProcessDateString()).toCharArray());
          }
//  ELSE
          else { 
//  MOVE ZEROES TO 800-CBH-DATE
              methodOut.setCbhDate800(CONSTANTS.ZERO_8);
          }
      
      return methodOut;
      }
      /**
      * closeFiles 
      *   This method is derived from 
  *   COBOL Paragraph - 3000-CLOSE-FILES COBOL Cyclomatic complexity - 1
      * Input  :  

      * - ipmCountReadCnt400             COBOL Name: 400-IPM-COUNT-READ-CNT
      * - ipmRecordsPds1400              COBOL Name: 400-IPM-RECORDS-PDS1
      * - ipmRecordsPds2400              COBOL Name: 400-IPM-RECORDS-PDS2
      * - ipmRecordsPds3400              COBOL Name: 400-IPM-RECORDS-PDS3
      * - ipmRecordsPds4400              COBOL Name: 400-IPM-RECORDS-PDS4
      * - ipmRecordsPds5400              COBOL Name: 400-IPM-RECORDS-PDS5
      * - ipmRecordsPds6400              COBOL Name: 400-IPM-RECORDS-PDS6
      * - ipmRecordsPds7400              COBOL Name: 400-IPM-RECORDS-PDS7
      * - transAmount800                 COBOL Name: 800-TRANS-AMOUNT
      * - amtE1848800                    COBOL Name: 800-AMT-E1848
      * - amtE1849800                    COBOL Name: 800-AMT-E1849
      * - amtE1850800                    COBOL Name: 800-AMT-E1850
      * - amtE1851800                    COBOL Name: 800-AMT-E1851
      * - amtE1852800                    COBOL Name: 800-AMT-E1852
      * - amtE1754800                    COBOL Name: 800-AMT-E1754
      * - amtE1750800                    COBOL Name: 800-AMT-E1750
      * - sys001RecordCount600           COBOL Name: 600-SYS001-RECORD-COUNT
      * - sys201RecordCount600           COBOL Name: 600-SYS201-RECORD-COUNT
      * - sys202RecordCount600           COBOL Name: 600-SYS202-RECORD-COUNT
      * - sys203RecordCount600           COBOL Name: 600-SYS203-RECORD-COUNT
      * - sys204RecordCount600           COBOL Name: 600-SYS204-RECORD-COUNT
      * - sys205RecordCount600           COBOL Name: 600-SYS205-RECORD-COUNT
      * - sys206RecordCount600           COBOL Name: 600-SYS206-RECORD-COUNT
      * - sys207RecordCount600           COBOL Name: 600-SYS207-RECORD-COUNT
      * - sys210RecordCount600           COBOL Name: 600-SYS210-RECORD-COUNT
      * - sys211RecordCount600           COBOL Name: 600-SYS211-RECORD-COUNT
      * - sys212RecordCount600           COBOL Name: 600-SYS212-RECORD-COUNT
      * - sys213RecordCount600           COBOL Name: 600-SYS213-RECORD-COUNT
      * - sys214RecordCount600           COBOL Name: 600-SYS214-RECORD-COUNT
      * - sys215RecordCount600           COBOL Name: 600-SYS215-RECORD-COUNT
      * - sys216RecordCount600           COBOL Name: 600-SYS216-RECORD-COUNT
      * - sys209RecordCount600           COBOL Name: 600-SYS209-RECORD-COUNT
      *
      * Output :  

      * - sys001Count600                 COBOL Name: 600-SYS001-COUNT
      * - ipmCountReadCnt400             COBOL Name: 400-IPM-COUNT-READ-CNT
      * - sys201Count600                 COBOL Name: 600-SYS201-COUNT
      * - ipmRecordsPds1400              COBOL Name: 400-IPM-RECORDS-PDS1
      * - sys202Count600                 COBOL Name: 600-SYS202-COUNT
      * - ipmRecordsPds2400              COBOL Name: 400-IPM-RECORDS-PDS2
      * - sys203Count600                 COBOL Name: 600-SYS203-COUNT
      * - ipmRecordsPds3400              COBOL Name: 400-IPM-RECORDS-PDS3
      * - sys204Count600                 COBOL Name: 600-SYS204-COUNT
      * - ipmRecordsPds4400              COBOL Name: 400-IPM-RECORDS-PDS4
      * - sys205Count600                 COBOL Name: 600-SYS205-COUNT
      * - ipmRecordsPds5400              COBOL Name: 400-IPM-RECORDS-PDS5
      * - sys206Count600                 COBOL Name: 600-SYS206-COUNT
      * - ipmRecordsPds6400              COBOL Name: 400-IPM-RECORDS-PDS6
      * - sys207Count600                 COBOL Name: 600-SYS207-COUNT
      * - ipmRecordsPds7400              COBOL Name: 400-IPM-RECORDS-PDS7
      * - sys209Count600                 COBOL Name: 600-SYS209-COUNT
      * - transAmount800                 COBOL Name: 800-TRANS-AMOUNT
      * - sys210Count600                 COBOL Name: 600-SYS210-COUNT
      * - amtE1848800                    COBOL Name: 800-AMT-E1848
      * - sys211Count600                 COBOL Name: 600-SYS211-COUNT
      * - amtE1849800                    COBOL Name: 800-AMT-E1849
      * - sys212Count600                 COBOL Name: 600-SYS212-COUNT
      * - amtE1850800                    COBOL Name: 800-AMT-E1850
      * - sys213Count600                 COBOL Name: 600-SYS213-COUNT
      * - amtE1851800                    COBOL Name: 800-AMT-E1851
      * - sys214Count600                 COBOL Name: 600-SYS214-COUNT
      * - amtE1852800                    COBOL Name: 800-AMT-E1852
      * - sys215Count600                 COBOL Name: 600-SYS215-COUNT
      * - amtE1754800                    COBOL Name: 800-AMT-E1754
      * - sys216Count600                 COBOL Name: 600-SYS216-COUNT
      * - amtE1750800                    COBOL Name: 800-AMT-E1750
      * - sys209Count1600                COBOL Name: 600-SYS209-COUNT1
      * - sys210Count1600                COBOL Name: 600-SYS210-COUNT1
      * - sys211Count1600                COBOL Name: 600-SYS211-COUNT1
      * - sys212Count1600                COBOL Name: 600-SYS212-COUNT1
      * - sys213Count1600                COBOL Name: 600-SYS213-COUNT1
      * - sys214Count1600                COBOL Name: 600-SYS214-COUNT1
      * - sys215Count1600                COBOL Name: 600-SYS215-COUNT1
      * - sys216Count1600                COBOL Name: 600-SYS216-COUNT1
      *
      * @throws CFException
      */
      @Override
      public CloseFilesOutCtx closeFiles(CloseFilesInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			BigDecimal tempDecimal = BigDecimal.ZERO;
			// End of variable declaration

      
// *-----------------------------------------------------------------
Ip809050Ctx programCtx = methodIn.getIp809050Ctx();
CloseFilesOutCtx methodOut = methodIn.getCloseFilesOutCtx();
//  MOVE 400-IPM-COUNT-READ-CNT TO 600-SYS001-COUNT
//  FORMAT_1977136933 = "ZZ,ZZZ,ZZ9"
          methodOut.setSys001Count600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1977136933,String.valueOf(methodOut.getIpmCountReadCnt400()).toCharArray()));
//  MOVE 400-IPM-RECORDS-PDS1 TO 600-SYS201-COUNT
//  FORMAT_1977136933 = "ZZ,ZZZ,ZZ9"
          methodOut.setSys201Count600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1977136933,String.valueOf(methodOut.getIpmRecordsPds1400()).toCharArray()));
//  MOVE 400-IPM-RECORDS-PDS2 TO 600-SYS202-COUNT
//  FORMAT_1977136933 = "ZZ,ZZZ,ZZ9"
          methodOut.setSys202Count600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1977136933,String.valueOf(methodOut.getIpmRecordsPds2400()).toCharArray()));
//  MOVE 400-IPM-RECORDS-PDS3 TO 600-SYS203-COUNT
//  FORMAT_1977136933 = "ZZ,ZZZ,ZZ9"
          methodOut.setSys203Count600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1977136933,String.valueOf(methodOut.getIpmRecordsPds3400()).toCharArray()));
//  MOVE 400-IPM-RECORDS-PDS4 TO 600-SYS204-COUNT
//  FORMAT_1977136933 = "ZZ,ZZZ,ZZ9"
          methodOut.setSys204Count600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1977136933,String.valueOf(methodOut.getIpmRecordsPds4400()).toCharArray()));
//  MOVE 400-IPM-RECORDS-PDS5 TO 600-SYS205-COUNT
//  FORMAT_1977136933 = "ZZ,ZZZ,ZZ9"
          methodOut.setSys205Count600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1977136933,String.valueOf(methodOut.getIpmRecordsPds5400()).toCharArray()));
//  MOVE 400-IPM-RECORDS-PDS6 TO 600-SYS206-COUNT
//  FORMAT_1977136933 = "ZZ,ZZZ,ZZ9"
          methodOut.setSys206Count600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1977136933,String.valueOf(methodOut.getIpmRecordsPds6400()).toCharArray()));
//  MOVE 400-IPM-RECORDS-PDS7 TO 600-SYS207-COUNT
//  FORMAT_1977136933 = "ZZ,ZZZ,ZZ9"
          methodOut.setSys207Count600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1977136933,String.valueOf(methodOut.getIpmRecordsPds7400()).toCharArray()));
//  MOVE 800-TRANS-AMOUNT TO 600-SYS209-COUNT
          methodOut.setSys209Count600(BigDecimal.valueOf(methodOut.getTransAmount800()));
//  MOVE 800-AMT-E1848 TO 600-SYS210-COUNT
          methodOut.setSys210Count600(BigDecimal.valueOf(methodOut.getAmtE1848800()));
//  MOVE 800-AMT-E1849 TO 600-SYS211-COUNT
          methodOut.setSys211Count600(BigDecimal.valueOf(methodOut.getAmtE1849800()));
//  MOVE 800-AMT-E1850 TO 600-SYS212-COUNT
          methodOut.setSys212Count600(BigDecimal.valueOf(methodOut.getAmtE1850800()));
//  MOVE 800-AMT-E1851 TO 600-SYS213-COUNT
          methodOut.setSys213Count600(BigDecimal.valueOf(methodOut.getAmtE1851800()));
//  MOVE 800-AMT-E1852 TO 600-SYS214-COUNT
          methodOut.setSys214Count600(BigDecimal.valueOf(methodOut.getAmtE1852800()));
//  MOVE 800-AMT-E1754 TO 600-SYS215-COUNT
          methodOut.setSys215Count600(BigDecimal.valueOf(methodOut.getAmtE1754800()));
//  MOVE 800-AMT-E1750 TO 600-SYS216-COUNT
          methodOut.setSys216Count600(BigDecimal.valueOf(methodOut.getAmtE1750800()));
//  DIVIDE 600-SYS209-COUNT BY 100 GIVING 600-SYS209-COUNT1
          methodOut.setSys209Count1600(CFUtil.cobolNumberFormatter("9999999999.99", String.valueOf(methodOut.getSys209Count600().divide(BigDecimal.valueOf(100),0,RoundingMode.DOWN).intValue())).toCharArray());
//  DIVIDE 600-SYS210-COUNT BY 100 GIVING 600-SYS210-COUNT1
          methodOut.setSys210Count1600(CFUtil.cobolNumberFormatter("9999999999.99", String.valueOf(methodOut.getSys210Count600().divide(BigDecimal.valueOf(100),0,RoundingMode.DOWN).intValue())).toCharArray());
//  DIVIDE 600-SYS211-COUNT BY 100 GIVING 600-SYS211-COUNT1
          methodOut.setSys211Count1600(CFUtil.cobolNumberFormatter("9999999999.99", String.valueOf(methodOut.getSys211Count600().divide(BigDecimal.valueOf(100),0,RoundingMode.DOWN).intValue())).toCharArray());
//  DIVIDE 600-SYS212-COUNT BY 100 GIVING 600-SYS212-COUNT1
          methodOut.setSys212Count1600(CFUtil.cobolNumberFormatter("9999999999.99", String.valueOf(methodOut.getSys212Count600().divide(BigDecimal.valueOf(100),0,RoundingMode.DOWN).intValue())).toCharArray());
//  DIVIDE 600-SYS213-COUNT BY 100 GIVING 600-SYS213-COUNT1
          methodOut.setSys213Count1600(CFUtil.cobolNumberFormatter("9999999999.99", String.valueOf(methodOut.getSys213Count600().divide(BigDecimal.valueOf(100),0,RoundingMode.DOWN).intValue())).toCharArray());
//  DIVIDE 600-SYS214-COUNT BY 100 GIVING 600-SYS214-COUNT1
          methodOut.setSys214Count1600(CFUtil.cobolNumberFormatter("9999999999.99", String.valueOf(methodOut.getSys214Count600().divide(BigDecimal.valueOf(100),0,RoundingMode.DOWN).intValue())).toCharArray());
//  DIVIDE 600-SYS215-COUNT BY 100 GIVING 600-SYS215-COUNT1
          methodOut.setSys215Count1600(CFUtil.cobolNumberFormatter("9999999999.99", String.valueOf(methodOut.getSys215Count600().divide(BigDecimal.valueOf(100),0,RoundingMode.DOWN).intValue())).toCharArray());
//  DIVIDE 600-SYS216-COUNT BY 100 GIVING 600-SYS216-COUNT1
          methodOut.setSys216Count1600(CFUtil.cobolNumberFormatter("9999999999.99", String.valueOf(methodOut.getSys216Count600().divide(BigDecimal.valueOf(100),0,RoundingMode.DOWN).intValue())).toCharArray());
//  DISPLAY 600-SYS001-RECORD-COUNT
          logger.info(methodIn.getSys001RecordCount600().toString()); 
//  DISPLAY 600-SYS201-RECORD-COUNT
          logger.info(methodIn.getSys201RecordCount600().toString()); 
//  DISPLAY 600-SYS202-RECORD-COUNT
          logger.info(methodIn.getSys202RecordCount600().toString()); 
//  DISPLAY 600-SYS203-RECORD-COUNT
          logger.info(methodIn.getSys203RecordCount600().toString()); 
//  DISPLAY 600-SYS204-RECORD-COUNT
          logger.info(methodIn.getSys204RecordCount600().toString()); 
//  DISPLAY 600-SYS205-RECORD-COUNT
          logger.info(methodIn.getSys205RecordCount600().toString()); 
//  DISPLAY 600-SYS206-RECORD-COUNT
          logger.info(methodIn.getSys206RecordCount600().toString()); 
//  DISPLAY 600-SYS207-RECORD-COUNT
          logger.info(methodIn.getSys207RecordCount600().toString()); 
//  DISPLAY 600-SYS210-RECORD-COUNT
          logger.info(methodIn.getSys210RecordCount600().toString()); 
//  DISPLAY 600-SYS211-RECORD-COUNT
          logger.info(methodIn.getSys211RecordCount600().toString()); 
//  DISPLAY 600-SYS212-RECORD-COUNT
          logger.info(methodIn.getSys212RecordCount600().toString()); 
//  DISPLAY 600-SYS213-RECORD-COUNT
          logger.info(methodIn.getSys213RecordCount600().toString()); 
//  DISPLAY 600-SYS214-RECORD-COUNT
          logger.info(methodIn.getSys214RecordCount600().toString()); 
//  DISPLAY 600-SYS215-RECORD-COUNT
          logger.info(methodIn.getSys215RecordCount600().toString()); 
//  DISPLAY 600-SYS216-RECORD-COUNT
          logger.info(methodIn.getSys216RecordCount600().toString()); 
//  DISPLAY 600-SYS209-RECORD-COUNT
          logger.info(methodIn.getSys209RecordCount600().toString()); 
//  PERFORM 3100-CLOSE-INPUT-IPM-OUTBOUND
          closeInputIpmOutbound(programCtx.getCloseInputIpmOutboundInCtx());/*3100-CLOSE-INPUT-IPM-OUTBOUND*/
//  PERFORM 3200-CLOSE-OUTPUT-IPM-OUTBOUND
          closeOutputIpmOutbound(programCtx.getCloseOutputIpmOutboundInCtx());/*3200-CLOSE-OUTPUT-IPM-OUTBOUND*/
          ;
      
      return methodOut;
      }
      /**
      * closeInputIpmOutbound 
      *   This method is derived from 
  *   COBOL Paragraph - 3100-CLOSE-INPUT-IPM-OUTBOUND COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sys001FileStatus200            COBOL Name: 200-SYS001-FILE-STATUS
      * - para3100300                    COBOL Name: 300-PARA-3100
      * - sys001CloseAbendCode300        COBOL Name: 300-SYS001-CLOSE-ABEND-CODE
      * - inputOutboundErrMsgTxt600      COBOL Name: 600-INPUT-OUTBOUND-ERR-MSG-TXT
      *
      * Output :  

      * - inputOutboundMsgDtl600         COBOL Name: 600-INPUT-OUTBOUND-MSG-DTL
      * - inputOtbndFileStatus600        COBOL Name: 600-INPUT-OTBND-FILE-STATUS
      * - sys001FileStatus200            COBOL Name: 200-SYS001-FILE-STATUS
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para3100300                    COBOL Name: 300-PARA-3100
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - sys001CloseAbendCode300        COBOL Name: 300-SYS001-CLOSE-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - inputOutboundErrMsgTxt600      COBOL Name: 600-INPUT-OUTBOUND-ERR-MSG-TXT
      *
      * @throws CFException
      */
      @Override
      public CloseInputIpmOutboundOutCtx closeInputIpmOutbound(CloseInputIpmOutboundInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph closes input ipm outbound file and checks for the*
// *file status if it is not good it performs terminate process     *
// *-----------------------------------------------------------------
Ip809050Ctx programCtx = methodIn.getIp809050Ctx();
CloseInputIpmOutboundOutCtx methodOut = methodIn.getCloseInputIpmOutboundOutCtx();
//  PERFORM 8200-CLOSE-SYS001
          closeSys001(programCtx);/*8200-CLOSE-SYS001*/
//  IF 88-200-SYS001-STATUS-GOOD
//  ELSE
          if (!(methodIn.isSys001StatusGood88200()) ) { 
//  SET 88-600-INPUT-FILE-CLOS-ERR-TXT TO TRUE
              methodOut.setInputFileClosErrTxt88600True(); 
              
//  MOVE 200-SYS001-FILE-STATUS TO 600-INPUT-OTBND-FILE-STATUS
              methodOut.setInputOtbndFileStatus600(methodOut.getSys001FileStatus200());
//  MOVE 300-PARA-3100 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara3100300());
//  MOVE 300-SYS001-CLOSE-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getSys001CloseAbendCode300());
              // MOVE 600-INPUT-OUTBOUND-ERR-MSG-TXT TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getInputOutboundErrMsgTxt600().toCharArray());
//  PERFORM 9000-TERMINATE-PROCESS
              terminateProcess(programCtx.getTerminateProcessInCtx());/*9000-TERMINATE-PROCESS*/
          }
      
      return methodOut;
      }
      /**
      * closeOutputIpmOutbound 
      *   This method is derived from 
  *   COBOL Paragraph - 3200-CLOSE-OUTPUT-IPM-OUTBOUND COBOL Cyclomatic complexity - 2
      * Input  :  

      * - outputOtbndFileStatus201       COBOL Name: 201-OUTPUT-OTBND-FILE-STATUS
      * - para3200300                    COBOL Name: 300-PARA-3200
      * - sys201CloseAbendCode300        COBOL Name: 300-SYS201-CLOSE-ABEND-CODE
      * - outputOtbndErrMsgTxt600        COBOL Name: 600-OUTPUT-OTBND-ERR-MSG-TXT
      *
      * Output :  

      * - outputOutboundMsgDtl600        COBOL Name: 600-OUTPUT-OUTBOUND-MSG-DTL
      * - outputOtbndFileStatus600       COBOL Name: 600-OUTPUT-OTBND-FILE-STATUS
      * - outputOtbndFileStatus201       COBOL Name: 201-OUTPUT-OTBND-FILE-STATUS
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para3200300                    COBOL Name: 300-PARA-3200
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - sys201CloseAbendCode300        COBOL Name: 300-SYS201-CLOSE-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - outputOtbndErrMsgTxt600        COBOL Name: 600-OUTPUT-OTBND-ERR-MSG-TXT
      *
      * @throws CFException
      */
      @Override
      public CloseOutputIpmOutboundOutCtx closeOutputIpmOutbound(CloseOutputIpmOutboundInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph closes scrubbed ipm outbound file and checks for *
// * the file status if it is not good it performs terminate process*
// *-----------------------------------------------------------------
Ip809050Ctx programCtx = methodIn.getIp809050Ctx();
CloseOutputIpmOutboundOutCtx methodOut = methodIn.getCloseOutputIpmOutboundOutCtx();
//  PERFORM 8300-CLOSE-SYS201
          closeSys201(programCtx);/*8300-CLOSE-SYS201*/
//  IF 88-200-SYS201-STATUS-GOOD
//  ELSE
          if (!(methodIn.isSys201StatusGood88200()) ) { 
//  SET 88-600-OUTPUT-CLOSE-ERR-TXT TO TRUE
              methodOut.setOutputCloseErrTxt88600True(); 
              
//  MOVE 201-OUTPUT-OTBND-FILE-STATUS TO 600-OUTPUT-OTBND-FILE-STATUS
              methodOut.setOutputOtbndFileStatus600(methodOut.getOutputOtbndFileStatus201());
//  MOVE 300-PARA-3200 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara3200300());
//  MOVE 300-SYS201-CLOSE-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getSys201CloseAbendCode300());
              // MOVE 600-OUTPUT-OTBND-ERR-MSG-TXT TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getOutputOtbndErrMsgTxt600().toCharArray());
//  PERFORM 9000-TERMINATE-PROCESS
              terminateProcess(programCtx.getTerminateProcessInCtx());/*9000-TERMINATE-PROCESS*/
          }
      
      return methodOut;
      }
      /**
      * getRegionName 
      *   This method is derived from 
  *   COBOL Paragraph - 8000-GET-REGION-NAME COBOL Cyclomatic complexity - 8
      * Input  :  

      * - ip00724IchgRegion              COBOL Name: IP00724-ICHG-REGION
      * - regionA600                     COBOL Name: 600-REGION-A
      * - regionB600                     COBOL Name: 600-REGION-B
      * - regionC600                     COBOL Name: 600-REGION-C
      * - regionD600                     COBOL Name: 600-REGION-D
      * - regionE600                     COBOL Name: 600-REGION-E
      * - region1600                     COBOL Name: 600-REGION-1
      *
      * Output :  

      * - region800                      COBOL Name: 800-REGION
      * - regionA600                     COBOL Name: 600-REGION-A
      * - regionB600                     COBOL Name: 600-REGION-B
      * - regionC600                     COBOL Name: 600-REGION-C
      * - regionD600                     COBOL Name: 600-REGION-D
      * - regionE600                     COBOL Name: 600-REGION-E
      * - region1600                     COBOL Name: 600-REGION-1
      *
      * @throws CFException
      */
      @Override
      public GetRegionNameOutCtx getRegionName(GetRegionNameInCtx methodIn) throws Exception {
      
// *---------------------------------------------------------------*
// * This para will add the region name to the output file based on*
// * the region from table#72                                      *
// *---------------------------------------------------------------*
Ip809050Ctx programCtx = methodIn.getIp809050Ctx();
GetRegionNameOutCtx methodOut = methodIn.getGetRegionNameOutCtx();
//  EVALUATE TRUE
          if  (compareChars(methodIn.getIp00724IchgRegion(), CONSTANTS.LITERAL_A) == 0) { 
//  MOVE 600-REGION-A TO 800-REGION
              methodOut.setRegion800(methodOut.getRegionA600());
          }
          else if  (compareChars(methodIn.getIp00724IchgRegion(), CONSTANTS.LITERAL_B) == 0) { 
//  MOVE 600-REGION-B TO 800-REGION
              methodOut.setRegion800(methodOut.getRegionB600());
          }
          else if  (compareChars(methodIn.getIp00724IchgRegion(), CONSTANTS.LITERAL_C) == 0) { 
//  MOVE 600-REGION-C TO 800-REGION
              methodOut.setRegion800(methodOut.getRegionC600());
          }
          else if  (compareChars(methodIn.getIp00724IchgRegion(), CONSTANTS.LITERAL_D) == 0) { 
//  MOVE 600-REGION-D TO 800-REGION
              methodOut.setRegion800(methodOut.getRegionD600());
          }
          else if  (compareChars(methodIn.getIp00724IchgRegion(), CONSTANTS.LITERAL_E) == 0) { 
//  MOVE 600-REGION-E TO 800-REGION
              methodOut.setRegion800(methodOut.getRegionE600());
          }
          else if  (compareChars(methodIn.getIp00724IchgRegion(), CONSTANTS.LITERAL_1) == 0) { 
//  MOVE 600-REGION-1 TO 800-REGION
              methodOut.setRegion800(methodOut.getRegion1600());
          }
          else   { 
              ;
          }
      
      return methodOut;
      }
      /**
      * readInputOutboundFile 
      *   This method is derived from 
  *   COBOL Paragraph - 8100-READ-INPUT-OUTBOUND-FILE COBOL Cyclomatic complexity - 5
      * Input  :  

      * - ipmCountReadCnt400             COBOL Name: 400-IPM-COUNT-READ-CNT
      * - valueOne300                    COBOL Name: 300-VALUE-ONE
      * - para8100300                    COBOL Name: 300-PARA-8100
      * - sys001ReadAbendCode300         COBOL Name: 300-SYS001-READ-ABEND-CODE
      * - inputOutboundErrMsgTxt600      COBOL Name: 600-INPUT-OUTBOUND-ERR-MSG-TXT
      * - isSys201Open100                COBOL Name: 100-IS-SYS201-OPEN
      *
      * Output :  

      * - sys001InputIpmOutboundRec      COBOL Name: SYS001-INPUT-IPM-OUTBOUND-REC
      * - sys001FileStatus200            COBOL Name: 200-SYS001-FILE-STATUS
      * - ipmOutbndUnscrubRdw400         COBOL Name: 400-IPM-OUTBND-UNSCRUB-RDW
      * - ip30671OutboundMessageArea     COBOL Name: IP30671-OUTBOUND-MESSAGE-AREA
      * - isItTheFirstTime100            COBOL Name: 100-IS-IT-THE-FIRST-TIME
      * - ipmCountReadCnt400             COBOL Name: 400-IPM-COUNT-READ-CNT
      * - inputOutboundMsgDtl600         COBOL Name: 600-INPUT-OUTBOUND-MSG-DTL
      * - inputOtbndFileStatus600        COBOL Name: 600-INPUT-OTBND-FILE-STATUS
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para8100300                    COBOL Name: 300-PARA-8100
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - sys001ReadAbendCode300         COBOL Name: 300-SYS001-READ-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - inputOutboundErrMsgTxt600      COBOL Name: 600-INPUT-OUTBOUND-ERR-MSG-TXT
      *
      * @throws CFException
      */
      @Override
      public ReadInputOutboundFileOutCtx readInputOutboundFile(ReadInputOutboundFileInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// * This paragraph reads unscrubbed ipm outbound file              *
// *-----------------------------------------------------------------
Ip809050Ctx programCtx = methodIn.getIp809050Ctx();
ReadInputOutboundFileOutCtx methodOut = methodIn.getReadInputOutboundFileOutCtx();
//  READ SYS001-INPUT-IPM-OUTBOUND-FILE
          	sys001InputIpmOutboundFile.read();
          methodOut.setIpmOutbndUnscrubRdw400(sys001InputIpmOutboundFile.getRecLen());
          methodOut.setSys001FileStatus200(sys001InputIpmOutboundFile.getStatusString() );
          if (!sys001InputIpmOutboundFile.hasEnded()) {
          	methodOut.getSys001InputIpmOutboundRec().setString(sys001InputIpmOutboundFile.getRecord());
          }
//  IF 88-200-SYS001-STATUS-GOOD
          if ( methodOut.isSys001StatusGood88200()  ) { 
//  MOVE SYS001-INPUT-IPM-OUTBOUND-REC TO IP30671-OUTBOUND-MESSAGE-AREA (1 : 400-IPM-OUTBND-UNSCRUB-RDW )
              methodOut.getIp30671OutboundMessageArea().replace(methodOut.getSys001InputIpmOutboundRec().getCharArray(),0,methodOut.getSys001InputIpmOutboundRec().length(),0,methodOut.getIpmOutbndUnscrubRdw400() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  SET 88-100-IT-IS-NOT-FIRST-TIME TO TRUE
              methodOut.setItIsNotFirstTime88100True(); 
              
//  ADD 300-VALUE-ONE TO 400-IPM-COUNT-READ-CNT
              methodOut.setIpmCountReadCnt400(methodOut.getIpmCountReadCnt400()+methodIn.getValueOne300());
          }
//  ELSE
          else { 
//  IF 88-200-SYS001-END-OF-FILE
              if ( methodOut.isSys001EndOfFile88200()  ) { 
//  IF 88-100-IT-IS-FIRST-TIME
                  if ( methodOut.isItIsFirstTime88100()  ) { 
//  SET 88-600-INPUT-FILE-EMTY-ERR-TXT TO TRUE
                      methodOut.setInputFileEmtyErrTxt88600True(); 
                      
                  }
              }
//  ELSE
              else { 
//  SET 88-600-INPUT-FILE-READ-ERR-TXT TO TRUE
                  methodOut.setInputFileReadErrTxt88600True(); 
                  
//  MOVE 200-SYS001-FILE-STATUS TO 600-INPUT-OTBND-FILE-STATUS
                  methodOut.setInputOtbndFileStatus600(methodOut.getSys001FileStatus200());
//  MOVE 300-PARA-8100 TO 900-ABEND-PARA
                  methodOut.setAbendPara900(methodOut.getPara8100300());
//  MOVE 300-SYS001-READ-ABEND-CODE TO 900-ABEND-CODE
                  methodOut.setAbendCode900(methodOut.getSys001ReadAbendCode300());
                  // MOVE 600-INPUT-OUTBOUND-ERR-MSG-TXT TO 900-ABEND-TEXT
                  methodOut.setAbendText900(methodOut.getInputOutboundErrMsgTxt600().toCharArray());
//  PERFORM 8200-CLOSE-SYS001
                  closeSys001(programCtx);/*8200-CLOSE-SYS001*/
//  IF 88-100-SYS201-IS-OPEN
                  if ( methodIn.isSys201IsOpen88100()  ) { 
//  PERFORM 8300-CLOSE-SYS201
                      closeSys201(programCtx);/*8300-CLOSE-SYS201*/
                  }
//  PERFORM 9000-TERMINATE-PROCESS
                  terminateProcess(programCtx.getTerminateProcessInCtx());/*9000-TERMINATE-PROCESS*/
              }
          }
      
      return methodOut;
      }
      /**
      * closeSys001 
      *   This method is derived from 
  *   COBOL Paragraph - 8200-CLOSE-SYS001 COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public CloseSys001OutCtx closeSys001(Ip809050Ctx programCtx) throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph closes input ipm outbound                        *
// *-----------------------------------------------------------------
CloseSys001OutCtx methodOut = programCtx.getCloseSys001OutCtx();
//  CLOSE SYS001-INPUT-IPM-OUTBOUND-FILE
          sys001InputIpmOutboundFile.close(); 
          methodOut.setSys001FileStatus200(sys001InputIpmOutboundFile.getStatusString() );
      
      return methodOut;
      }
      /**
      * closeSys201 
      *   This method is derived from 
  *   COBOL Paragraph - 8300-CLOSE-SYS201 COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public CloseSys201OutCtx closeSys201(Ip809050Ctx programCtx) throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph closes scrubbed ipm outbound file                *
// *-----------------------------------------------------------------
CloseSys201OutCtx methodOut = programCtx.getCloseSys201OutCtx();
//  CLOSE SYS201-OUTPUT-IPM-OTBND-FILE
          sys201OutputIpmOtbndFile.close(); 
          methodOut.setOutputOtbndFileStatus201(sys201OutputIpmOtbndFile.getStatusString() );
//  CLOSE SYS202-OUTPUT-IPM-OTBND-FILE
          sys202OutputIpmOtbndFile.close(); 
          methodOut.setOutputOtbndFileStatus202(sys202OutputIpmOtbndFile.getStatusString() );
//  CLOSE SYS203-OUTPUT-IPM-OTBND-FILE
          sys203OutputIpmOtbndFile.close(); 
          methodOut.setOutputOtbndFileStatus203(sys203OutputIpmOtbndFile.getStatusString() );
//  CLOSE SYS204-OUTPUT-IPM-OTBND-FILE
          sys204OutputIpmOtbndFile.close(); 
          methodOut.setOutputOtbndFileStatus204(sys204OutputIpmOtbndFile.getStatusString() );
//  CLOSE SYS205-OUTPUT-IPM-OTBND-FILE
          sys205OutputIpmOtbndFile.close(); 
          methodOut.setOutputOtbndFileStatus205(sys205OutputIpmOtbndFile.getStatusString() );
//  CLOSE SYS206-OUTPUT-IPM-OTBND-FILE
          sys206OutputIpmOtbndFile.close(); 
          methodOut.setOutputOtbndFileStatus206(sys206OutputIpmOtbndFile.getStatusString() );
//  CLOSE SYS207-OUTPUT-IPM-OTBND-FILE
          sys207OutputIpmOtbndFile.close(); 
          methodOut.setOutputOtbndFileStatus207(sys207OutputIpmOtbndFile.getStatusString() );
      
      return methodOut;
      }
      /**
      * closeSys012 
      *   This method is derived from 
  *   COBOL Paragraph - 8400-CLOSE-SYS012 COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public CloseSys012OutCtx closeSys012(Ip809050Ctx programCtx) throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph closes run control file                          *
// *-----------------------------------------------------------------
CloseSys012OutCtx methodOut = programCtx.getCloseSys012OutCtx();
//  CLOSE SYS012-RUN-CONTROL-FILE
          sys012RunControlFile.close(); 
          methodOut.setSys012FileStatus200(sys012RunControlFile.getStatusString() );
      
      return methodOut;
      }
      /**
      * terminateProcess 
      *   This method is derived from 
  *   COBOL Paragraph - 9000-TERMINATE-PROCESS COBOL Cyclomatic complexity - 1
      * Input  :  

      * - outputOutboundExtrCount400     COBOL Name: 400-OUTPUT-OUTBOUND-EXTR-COUNT
      * - outputOutboundExtrCnt2400      COBOL Name: 400-OUTPUT-OUTBOUND-EXTR-CNT2
      * - pgmId300                       COBOL Name: 300-PGM-ID
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - abendMessage900                COBOL Name: 900-ABEND-MESSAGE
      * - displayAbendMsgTxt600          COBOL Name: 600-DISPLAY-ABEND-MSG-TXT
      * - abendParaName900               COBOL Name: 900-ABEND-PARA-NAME
      *
      * Output :  

      * - ip60001HoldPgmName             COBOL Name: IP60001-HOLD-PGM-NAME
      * - pgmId300                       COBOL Name: 300-PGM-ID
      * - ip60001EventErrorCode          COBOL Name: IP60001-EVENT-ERROR-CODE
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - ip60001EventErrorMsg           COBOL Name: IP60001-EVENT-ERROR-MSG
      * - abendMessage900                COBOL Name: 900-ABEND-MESSAGE
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public TerminateProcessOutCtx terminateProcess(TerminateProcessInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------
// *This paragraph displays abend messages                         *
// *----------------------------------------------------------------
Ip809050Ctx programCtx = methodIn.getIp809050Ctx();
TerminateProcessOutCtx methodOut = methodIn.getTerminateProcessOutCtx();
//  DISPLAY 400-OUTPUT-OUTBOUND-EXTR-COUNT
          logger.info(String.valueOf(methodIn.getOutputOutboundExtrCount400())); 
//  DISPLAY 400-OUTPUT-OUTBOUND-EXTR-CNT2
          logger.info(String.valueOf(methodIn.getOutputOutboundExtrCnt2400())); 
//  MOVE 300-PGM-ID TO IP60001-HOLD-PGM-NAME
          methodOut.setIp60001HoldPgmName(methodOut.getPgmId300());
//  MOVE 900-ABEND-CODE TO IP60001-EVENT-ERROR-CODE
          methodOut.setIp60001EventErrorCode(methodOut.getAbendCode900());
          // MOVE 900-ABEND-MESSAGE TO IP60001-EVENT-ERROR-MSG
          methodOut.setIp60001EventErrorMsg(methodOut.getAbendMessage900().toCharArray());
//  DISPLAY 600-DISPLAY-ABEND-MSG-TXT
          logger.info(new String(methodIn.getDisplayAbendMsgTxt600())); 
//  DISPLAY 900-ABEND-PARA-NAME
          logger.info(methodIn.getAbendParaName900().toString()); 
//  DISPLAY 900-ABEND-MESSAGE
          logger.info(methodOut.getAbendMessage900().toString()); 
//  CALL 800-ABEND-PTR
          // CALL 800-ABEND-PTR
          	programCtx.setRc( ip610010.process(programCtx.getGlobalCtx().getContext("IP610010")));
      
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
Ip809050Ctx programCtx = methodIn.getIp809050Ctx();
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
  
  
  
  
  
  
  
  
  }
