  package com.cloudframe.app.process;
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
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.process.Ip996010;
  import com.cloudframe.app.process.Ip752010;
  import com.cloudframe.app.global.sharedvar.Ip67002DateRedefined02;
  import com.cloudframe.app.process.Ip670010;
  import com.cloudframe.app.global.sharedvar.Ip67002Ccyyddd;
  import com.cloudframe.app.global.sharedvar.Ip08101RptInds;
  import com.cloudframe.app.global.sharedvar.SortKey800;
  import com.cloudframe.app.process.Ip662010;
  import com.cloudframe.app.ip809050.dto.ErrorDesc800;
  import com.cloudframe.app.ip809050.dto.UsdAmt1800;
  import com.cloudframe.app.ip809050.dto.Pds841800;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.global.sharedvar.Ip66102NormalIpmMsg;
  import com.cloudframe.app.global.sharedvar.Ip65504DeNamesLargeGroup1;
  import com.cloudframe.app.global.sharedvar.Ip00174CurrCdKey;
  import com.cloudframe.app.process.Ip288010;
  import com.cloudframe.app.global.sharedvar.Ip33701CurrConvInput;
  import com.cloudframe.app.global.sharedvar.Ip00694TableData;
  import com.cloudframe.app.process.Ip783510;
  import com.cloudframe.app.global.sharedvar.Ip33701CurrConvOutput;
  import com.cloudframe.app.ip809050.dto.TxnAmt1800;
  import com.cloudframe.app.ip809050.dto.De0221800;
  import com.cloudframe.app.ip809050.dto.De0311800;
  import com.cloudframe.app.global.sharedvar.Ip00724Key;
  import com.cloudframe.app.process.Ip281010;
  import com.cloudframe.app.ip809050.dto.CbhRefNum1800;
  import java.math.BigDecimal;
  import java.math.RoundingMode;
  import com.cloudframe.app.global.sharedvar.Ip00724Ichg;
  import com.cloudframe.app.process.Ip610010;
  import com.cloudframe.app.ip809050.dto.*;
  import com.cloudframe.app.ip809050.dto.AmtE1850TemGroup800;
  import com.cloudframe.app.ip809050.dto.AmtE1754TemGroup800;
  import com.cloudframe.app.ip809050.dto.AmtE1852TemGroup800;
  import com.cloudframe.app.ip809050.dto.AmtE1750TemGroup800;
  import com.cloudframe.app.ip809050.dto.AmtE1848TemGroup800;
  import com.cloudframe.app.ip809050.dto.AmtE1851TemGroup800;
  import com.cloudframe.app.ip809050.dto.AmtE1849TemGroup800;
  import com.cloudframe.app.ip809050.dto.ChipLiabVariables800;
  import com.cloudframe.app.ip809050.dto.Sys206RecordCount600;
  import com.cloudframe.app.ip809050.file.records.Sys205OutputIpmOtbndRec;
  import com.cloudframe.app.ip809050.dto.Sys215RecordCount600;
  import com.cloudframe.app.ip809050.file.records.Sys202OutputIpmOtbndRec;
  import com.cloudframe.app.ip809050.file.records.Sys206OutputIpmOtbndRec;
  import com.cloudframe.app.ip809050.file.records.Sys203OutputIpmOtbndRec;
  import com.cloudframe.app.ip809050.file.records.Sys001InputIpmOutboundRec;
  import com.cloudframe.app.ip809050.file.records.Sys204OutputIpmOtbndRec;
  import com.cloudframe.app.ip809050.dto.Sys203RecordCount600;
  import com.cloudframe.app.ip809050.dto.Sys204RecordCount600;
  import com.cloudframe.app.ip809050.dto.Sys202RecordCount600;
  import com.cloudframe.app.ip809050.dto.ReadParserErrMsgTxt600;
  import com.cloudframe.app.ip809050.dto.Sys207RecordCount600;
  import com.cloudframe.app.ip809050.dto.AbendMessage900;
  import com.cloudframe.app.ip809050.dto.Sys001RecordCount600;
  import com.cloudframe.app.ip809050.dto.Sys209RecordCount600;
  import com.cloudframe.app.ip809050.dto.InputOutboundErrMsgTxt600;
  import com.cloudframe.app.ip809050.dto.DateCcyymmdd800;
  import com.cloudframe.app.ip809050.dto.AbendParaName900;
  import com.cloudframe.app.global.sharedvar.Ip30671OutboundMessageArea;
  import com.cloudframe.app.ip809050.dto.Sys211RecordCount600;
  import com.cloudframe.app.ip809050.file.records.Sys201OutputIpmOtbndRec;
  import com.cloudframe.app.ip809050.dto.OutputOtbndErrMsgTxt600;
  import com.cloudframe.app.ip809050.file.records.Sys012RunControlRec;
  import com.cloudframe.app.ip809050.dto.Sys212RecordCount600;
  import com.cloudframe.app.ip809050.dto.Sys216RecordCount600;
  import com.cloudframe.app.ip809050.dto.Sys213RecordCount600;
  import com.cloudframe.app.ip809050.dto.RunControlErrMsgTxt600;
  import com.cloudframe.app.ip809050.dto.Sys214RecordCount600;
  import com.cloudframe.app.ip809050.dto.Sys210RecordCount600;
  import com.cloudframe.app.ip809050.file.records.Sys207OutputIpmOtbndRec;
  import com.cloudframe.app.global.sharedvar.Ip08101RunControlRecord;
  import com.cloudframe.app.ip809050.dto.Sys205RecordCount600;
  import com.cloudframe.app.global.sharedvar.Ip66102IpmMsg;
  import com.cloudframe.app.ip809050.dto.Sys201RecordCount600;
  import com.cloudframe.app.ip809050.dto.L1CtlValues800;
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
  
  public class Ip809050 extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Ip809050.class);
  
  private AmtE1850TemGroup800 amtE1850TemGroup800 = new AmtE1850TemGroup800() ;
  private AmtE1754TemGroup800 amtE1754TemGroup800 = new AmtE1754TemGroup800() ;
  private AmtE1852TemGroup800 amtE1852TemGroup800 = new AmtE1852TemGroup800() ;
  private AmtE1750TemGroup800 amtE1750TemGroup800 = new AmtE1750TemGroup800() ;
  private AmtE1848TemGroup800 amtE1848TemGroup800 = new AmtE1848TemGroup800() ;
  private AmtE1851TemGroup800 amtE1851TemGroup800 = new AmtE1851TemGroup800() ;
  private AmtE1849TemGroup800 amtE1849TemGroup800 = new AmtE1849TemGroup800() ;
  private ChipLiabVariables800 chipLiabVariables800 = new ChipLiabVariables800() ;
  private Sys206RecordCount600 sys206RecordCount600 = new Sys206RecordCount600() ;
  private Sys205OutputIpmOtbndRec sys205OutputIpmOtbndRec = new Sys205OutputIpmOtbndRec() ;
  private Sys215RecordCount600 sys215RecordCount600 = new Sys215RecordCount600() ;
  private Sys202OutputIpmOtbndRec sys202OutputIpmOtbndRec = new Sys202OutputIpmOtbndRec() ;
  private Sys206OutputIpmOtbndRec sys206OutputIpmOtbndRec = new Sys206OutputIpmOtbndRec() ;
  private Sys203OutputIpmOtbndRec sys203OutputIpmOtbndRec = new Sys203OutputIpmOtbndRec() ;
  private Sys001InputIpmOutboundRec sys001InputIpmOutboundRec = new Sys001InputIpmOutboundRec() ;
  private Sys204OutputIpmOtbndRec sys204OutputIpmOtbndRec = new Sys204OutputIpmOtbndRec() ;
  private Sys203RecordCount600 sys203RecordCount600 = new Sys203RecordCount600() ;
  private Sys204RecordCount600 sys204RecordCount600 = new Sys204RecordCount600() ;
  private Sys202RecordCount600 sys202RecordCount600 = new Sys202RecordCount600() ;
  private ReadParserErrMsgTxt600 readParserErrMsgTxt600 = new ReadParserErrMsgTxt600() ;
  private Sys207RecordCount600 sys207RecordCount600 = new Sys207RecordCount600() ;
  private AbendMessage900 abendMessage900 = new AbendMessage900() ;
  private Sys001RecordCount600 sys001RecordCount600 = new Sys001RecordCount600() ;
  private Sys209RecordCount600 sys209RecordCount600 = new Sys209RecordCount600() ;
  private InputOutboundErrMsgTxt600 inputOutboundErrMsgTxt600 = new InputOutboundErrMsgTxt600() ;
  private DateCcyymmdd800 dateCcyymmdd800 = new DateCcyymmdd800() ;
  private AbendParaName900 abendParaName900 = new AbendParaName900() ;
  private Sys211RecordCount600 sys211RecordCount600 = new Sys211RecordCount600() ;
  private Sys201OutputIpmOtbndRec sys201OutputIpmOtbndRec = new Sys201OutputIpmOtbndRec() ;
  private OutputOtbndErrMsgTxt600 outputOtbndErrMsgTxt600 = new OutputOtbndErrMsgTxt600() ;
  private Sys012RunControlRec sys012RunControlRec = new Sys012RunControlRec() ;
  private Sys212RecordCount600 sys212RecordCount600 = new Sys212RecordCount600() ;
  private Sys216RecordCount600 sys216RecordCount600 = new Sys216RecordCount600() ;
  private Sys213RecordCount600 sys213RecordCount600 = new Sys213RecordCount600() ;
  private RunControlErrMsgTxt600 runControlErrMsgTxt600 = new RunControlErrMsgTxt600() ;
  private Sys214RecordCount600 sys214RecordCount600 = new Sys214RecordCount600() ;
  private Sys210RecordCount600 sys210RecordCount600 = new Sys210RecordCount600() ;
  private Sys207OutputIpmOtbndRec sys207OutputIpmOtbndRec = new Sys207OutputIpmOtbndRec() ;
  private Sys205RecordCount600 sys205RecordCount600 = new Sys205RecordCount600() ;
  private Sys201RecordCount600 sys201RecordCount600 = new Sys201RecordCount600() ;
  private L1CtlValues800 l1CtlValues800 = new L1CtlValues800() ;
  private Pds05DataGroup800 pds05DataGroup800 = new Pds05DataGroup800() ;
  private Pds841ValuesGroup800 pds841ValuesGroup800 = new Pds841ValuesGroup800() ;
  private Work work = new Work() ;
  
  
  
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
  @Autowired 
  @Qualifier("global_sortKey800")
  SortKey800 sortKey800;
  @Autowired 
  @Qualifier("global_ip30671OutboundMessageArea")
  Ip30671OutboundMessageArea ip30671OutboundMessageArea;
  @Autowired 
  @Qualifier("global_ip66102IpmMsg")
  Ip66102IpmMsg ip66102IpmMsg;
  @Autowired 
  @Qualifier("global_ip67002DateParm")
  Ip67002DateParm ip67002DateParm;
  @Autowired 
  @Qualifier("global_ip00724TableEntry")
  Ip00724TableEntry ip00724TableEntry;
  @Autowired 
  @Qualifier("global_ip00724EntryFoundYGroup")
  Ip00724EntryFoundYGroup ip00724EntryFoundYGroup;
  @Autowired 
  @Qualifier("global_ip65504CurrentTagTable")
  Ip65504CurrentTagTable ip65504CurrentTagTable;
  @Autowired 
  @Qualifier("global_ip65504TcntGroup")
  Ip65504TcntGroup ip65504TcntGroup;
  @Autowired 
  @Qualifier("global_ip65504MessageStatusGroup")
  Ip65504MessageStatusGroup ip65504MessageStatusGroup;
  @Autowired 
  @Qualifier("global_ip65504SelElemEntriesAll")
  Ip65504SelElemEntriesAll ip65504SelElemEntriesAll;
  @Autowired 
  @Qualifier("global_ip65504TaggedRecordInfo")
  Ip65504TaggedRecordInfo ip65504TaggedRecordInfo;
  @Autowired 
  @Qualifier("global_ip65504DeMapGroup")
  Ip65504DeMapGroup ip65504DeMapGroup;
  @Autowired 
  @Qualifier("global_ip65504SelPdsEntriesAll")
  Ip65504SelPdsEntriesAll ip65504SelPdsEntriesAll;
  @Autowired 
  @Qualifier("global_ip65504PdsMapGroup")
  Ip65504PdsMapGroup ip65504PdsMapGroup;
  @Autowired 
  @Qualifier("global_ip00702CaTable")
  Ip00702CaTable ip00702CaTable;
  @Autowired 
  @Qualifier("global_ip00702CaStringGroup")
  Ip00702CaStringGroup ip00702CaStringGroup;
  @Autowired 
  @Qualifier("global_ip66102IpmFileInformation")
  Ip66102IpmFileInformation ip66102IpmFileInformation;
  @Autowired 
  @Qualifier("global_ip33701CurrConvInterface")
  Ip33701CurrConvInterface ip33701CurrConvInterface;
  @Autowired 
  @Qualifier("global_ip00174TableEntry")
  Ip00174TableEntry ip00174TableEntry;
  @Autowired 
  @Qualifier("global_ip00174EntryFoundGroup")
  Ip00174EntryFoundGroup ip00174EntryFoundGroup;
  @Autowired 
  @Qualifier("global_ip00694TableEntry")
  Ip00694TableEntry ip00694TableEntry;
  @Autowired 
  @Qualifier("global_ip00694EntryFoundGroup")
  Ip00694EntryFoundGroup ip00694EntryFoundGroup;
  @Autowired 
  @Qualifier("global_ip00404Table")
  Ip00404Table ip00404Table;
  @Autowired 
  @Qualifier("global_ip0040iAccountRangeInfo")
  Ip0040iAccountRangeInfo ip0040iAccountRangeInfo;
  
  
  
  
  
  
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
      
// *----------------------------------------------------------------*
// * The program ip809050 starts here                               *
// *----------------------------------------------------------------*
//  PERFORM 1000-DO-INITIALIZATION
          doInitialization();/*1000-DO-INITIALIZATION*/
          if (this.isProgramEnded()) {
              return ;
          }
//  PERFORM 2000-PROCESS-INPUT-FILE
          processInputFile();/*2000-PROCESS-INPUT-FILE*/
          if (this.isProgramEnded()) {
              return ;
          }
//  PERFORM 3000-CLOSE-FILES
          closeFiles();/*3000-CLOSE-FILES*/
          if (this.isProgramEnded()) {
              return ;
          }
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          this.setProgramEnded(true);
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
      private void doInitialization() throws Exception {
      
// *----------------------------------------------------------------*
// *  This para displays the execution messages and intializes the  *
// *  program pointers and opens the input and output files         *
// *----------------------------------------------------------------*
//  PERFORM 1100-DISPLAY-EXEC-MSGS
          displayExecMsgs();/*1100-DISPLAY-EXEC-MSGS*/
//  PERFORM 1200-SET-PROCEDURE-POINTERS
          setProcedurePointers();/*1200-SET-PROCEDURE-POINTERS*/
//  PERFORM 1300-PROCESS-RUN-CONTROL-FILE
          processRunControlFile();/*1300-PROCESS-RUN-CONTROL-FILE*/
//  SET 800-PTR-IP281010 TO ENTRY 300-PGM-IP281010
          work.setPtrIp281010800(work.getPgmIp281010300()); 
          
//  SET 88-100-IT-IS-NOT-FIRST-TIME TO TRUE
          work.setItIsNotFirstTime88100True(); 
          
//  PERFORM 1400-OPEN-FILES
          openFiles();/*1400-OPEN-FILES*/
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
      
// *----------------------------------------------------------------*
// * This paragraph displays the program execution messages by      *
// * calling ip996010.                                              *
// *----------------------------------------------------------------*
//  SET 800-PTR-IP996010 TO ENTRY 300-PGM-IP996010
          work.setPtrIp996010800(work.getPgmIp996010300()); 
          
//  MOVE 300-PGM-ID TO IP996011-PGM-ID
          ip996011ProgramStartMessage.setIp996011PgmId(work.getPgmId300());
//  MOVE 300-PGM-VERSION TO IP996011-PGM-VERSION
          ip996011ProgramStartMessage.setIp996011PgmVersion(work.getPgmVersion300());
          // MOVE WHEN-COMPILED TO IP996011-WHEN-COMPILED
          //  FORMAT1311677340 = "X(08)BX(08)"
          ip996011ProgramStartMessage.setIp996011WhenCompiled(CFUtil.cobolAnEditFormatter(CONSTANTS.FORMAT1311677340,CONSTANTS.LITERAL_1765656414));
//  CALL 800-PTR-IP996010
          // CALL 800-PTR-IP996010
          	this.setRc( ip996010.process());
      
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
      private void setProcedurePointers() throws Exception {
      
// *-----------------------------------------------------------------
// * This paragraph sets procedure pointers
// *-----------------------------------------------------------------
//  SET 800-ABEND-PTR TO ENTRY 300-ABEND-ROUTINE
          work.setAbendPtr800(work.getAbendRoutine300()); 
          
//  SET 800-PTR-IP280310 TO ENTRY 300-PGM-IP280310
          work.setPtrIp280310800(work.getPgmIp280310300()); 
          
//  SET 800-PTR-IP280010 TO ENTRY 300-PGM-IP280010
          work.setPtrIp280010800(work.getPgmIp280010300()); 
          
//  SET 800-PTR-IP662010 TO ENTRY 300-READ-PARSER
          work.setPtrIp662010800(work.getReadParser300()); 
          
//  SET 800-PTR-IP343230 TO ENTRY 300-PGM-IP343230
          work.setPtrIp343230800(work.getPgmIp343230300()); 
          
//  SET 800-PTR-IP218480 TO ENTRY 300-PGM-IP218480
          work.setPtrIp218480800(work.getPgmIp218480300()); 
          
//  SET 800-PTR-IP218490 TO ENTRY 300-PGM-IP218490
          work.setPtrIp218490800(work.getPgmIp218490300()); 
          
//  SET 800-PTR-IP218500 TO ENTRY 300-PGM-IP218500
          work.setPtrIp218500800(work.getPgmIp218500300()); 
          
//  SET 800-PTR-IP218510 TO ENTRY 300-PGM-IP218510
          work.setPtrIp218510800(work.getPgmIp218510300()); 
          
//  SET 800-PTR-IP218520 TO ENTRY 300-PGM-IP218520
          work.setPtrIp218520800(work.getPgmIp218520300()); 
          
//  SET 800-PTR-IP217540 TO ENTRY 300-PGM-IP217540
          work.setPtrIp217540800(work.getPgmIp217540300()); 
          
//  SET 800-PTR-IP288010 TO ENTRY 300-PGM-IP288010
          work.setPtrIp288010800(work.getPgmIp288010300()); 
          
//  SET 800-PTR-IP670010 TO ENTRY 300-PGM-IP670010
          work.setPtrIp670010800(work.getPgmIp670010300()); 
          
//  SET 800-PTR-IP752010 TO ENTRY 300-PGM-IP752010
          work.setPtrIp752010800(work.getPgmIp752010300()); 
          
//  SET 800-PTR-IP783510 TO ENTRY 300-PGM-IP783510
          work.setPtrIp783510800(work.getPgmIp783510300()); 
          
      
      }
      /**
      * processRunControlFile 
      *   This method is derived from 
  *   COBOL Paragraph - 1300-PROCESS-RUN-CONTROL-FILE COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void processRunControlFile() throws Exception {
      
// *-----------------------------------------------------------------
// * This paragraph processes run control file to update event log. *
// *-----------------------------------------------------------------
//  PERFORM 1310-OPEN-RUN-CONTROL-FILE
          openRunControlFile();/*1310-OPEN-RUN-CONTROL-FILE*/
//  PERFORM 1320-READ-RUN-CONTROL-FILE
          readRunControlFile();/*1320-READ-RUN-CONTROL-FILE*/
//  PERFORM 1330-CLOSE-RUN-CONTROL-FILE
          closeRunControlFile();/*1330-CLOSE-RUN-CONTROL-FILE*/
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
      private void openRunControlFile() throws Exception {
      
// *-----------------------------------------------------------------
// * This paragraph opens run control file.                         *
// *-----------------------------------------------------------------
//  OPEN INPUT SYS012-RUN-CONTROL-FILE
          sys012RunControlFile.open(new String(CONSTANTS.MODE_READ_ONLY_36242),sys012RunControlFile.getFileName(),sys012RunControlFile.getSys012RunControlFileCharSet(),sys012RunControlFile.getSys012RunControlFileCrlfFlag());
          work.setSys012FileStatus200(sys012RunControlFile.getStatusString() );
//  IF 88-200-SYS012-STATUS-GOOD
//  ELSE
          if (!(work.isSys012StatusGood88200()) ) { 
//  SET 88-600-RUN-CTRL-OPEN-ERR-TXT TO TRUE
              runControlErrMsgTxt600.setRunCtrlOpenErrTxt88600True(); 
              
//  MOVE 200-SYS012-FILE-STATUS TO 600-RUN-CTRL-FILE-STATUS
              runControlErrMsgTxt600.setRunCtrlFileStatus600(work.getSys012FileStatus200());
//  MOVE 300-PARA-1310 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara1310300());
//  MOVE 300-SYS012-OPEN-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getSys012OpenAbendCode300());
              // MOVE 600-RUN-CONTROL-ERR-MSG-TXT TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(runControlErrMsgTxt600.toCharArray());
//  PERFORM 9000-TERMINATE-PROCESS
              terminateProcess();/*9000-TERMINATE-PROCESS*/
          }
      
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
      private void readRunControlFile() throws Exception {
			// Declare local variables used in the method
			Ip67002DateRedefined02 ip67002DateRedefined02 = ip67002DateParm.getIp67002DateRedefined02();
			Ip67002Ccyyddd ip67002Ccyyddd = ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd();
			// End of variable declaration

      
// *-----------------------------------------------------------------
// * This paragraph reads run control file to update event log      *
// *-----------------------------------------------------------------
//  READ SYS012-RUN-CONTROL-FILE INTO IP08101-RUN-CONTROL-RECORD END-READ
          	sys012RunControlFile.read();
          work.setSys012FileStatus200(sys012RunControlFile.getStatusString() );
          if (!sys012RunControlFile.hasEnded()) {
             sys012RunControlRec.setString(sys012RunControlFile.getRecord());
             ip08101RunControlRecord.setString(sys012RunControlRec.toCharArray());
          }
//  IF 88-200-SYS012-STATUS-GOOD
          if ( work.isSys012StatusGood88200()  ) { 
//  MOVE IP08101-PROCESS-DATE TO IP50005-CLEARING-DT 800-DATE-CCYYMMDD
              ip50005ClearingDtTm.setIp50005ClearingDt(String.valueOf(ip08101RunControlRecord.getIp08101ProcessDateString()).toCharArray());
              dateCcyymmdd800.setString(String.valueOf(ip08101RunControlRecord.getIp08101ProcessDateString()).toCharArray());
//  MOVE IP08101-RPT-PROCESS-TIME TO IP50005-CLEARING-TM
              ip50005ClearingDtTm.setIp50005ClearingTm(ip08101RunControlRecord.getIp08101RptProcessTime());
//  PERFORM 1321-CHECK-EVENT-LOG-SW
              checkEventLogSw();/*1321-CHECK-EVENT-LOG-SW*/
//  CALL 800-PTR-IP752010
              // CALL 800-PTR-IP752010
              	this.setRc( ip752010.process());
//  MOVE 800-DATE-YYMMDD TO IP67002-YYMMDD
              ip67002DateRedefined02.setIp67002Yymmdd(dateCcyymmdd800.getDateYymmdd800());
  
//  SET 88-IP67002-GET-ABS-OF-GREG-DT TO TRUE
              ip67002DateParm.setIp67002GetAbsOfGregDt88True(); 
              
//  CALL 800-PTR-IP670010
              // CALL 800-PTR-IP670010
              	this.setRc( ip670010.process());
//  SUBTRACT 1 FROM IP67002-DATE
              ip67002DateParm.setIp67002Date(Math.abs(ip67002DateParm.getIp67002Date()-(long)1));
//  SET 88-IP67002-GET-JUL-OF-ABS-DT TO TRUE
              ip67002DateParm.setIp67002GetJulOfAbsDt88True(); 
              
//  CALL 800-PTR-IP670010
              // CALL 800-PTR-IP670010
              	this.setRc( ip670010.process());
              // MOVE IP67002-YYDDD TO 800-FX-DATE-YYDDD
              work.replace(padSpaces(5,ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().getIp67002Yyddd().toCharArray()), /* beginIndex */0, /* length */5);
  
          }
//  ELSE
          else { 
//  SET 88-600-RUN-CTRL-EMTY-ERR-TXT TO TRUE
              runControlErrMsgTxt600.setRunCtrlEmtyErrTxt88600True(); 
              
//  MOVE 200-SYS012-FILE-STATUS TO 600-RUN-CTRL-FILE-STATUS
              runControlErrMsgTxt600.setRunCtrlFileStatus600(work.getSys012FileStatus200());
//  MOVE 300-PARA-1320 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara1320300());
//  MOVE 300-SYS012-EMPTY-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getSys012EmptyAbendCode300());
              // MOVE 600-OUTPUT-OTBND-ERR-MSG-TXT TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(outputOtbndErrMsgTxt600.toCharArray());
//  PERFORM 8400-CLOSE-SYS012
              closeSys012();/*8400-CLOSE-SYS012*/
//  PERFORM 9000-TERMINATE-PROCESS
              terminateProcess();/*9000-TERMINATE-PROCESS*/
          }
      
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
      private void checkEventLogSw() throws Exception {
			// Declare local variables used in the method
			Ip08101RptInds ip08101RptInds = ip08101RunControlRecord.getIp08101RptInds();
			char[] ip08101RunIndicator = null;
			char[] valueTest300 = null;
			// End of variable declaration

      
// *-----------------------------------------------------------------
// * This paragraph checks run indicator for production. if it is   *
// * set, updates event log.                                        *
// *-----------------------------------------------------------------
          valueTest300 = work.getValueTest300();
          ip08101RunIndicator = ip08101RptInds.getIp08101RunIndicator();
//  IF IP08101-RUN-INDICATOR EQUAL 300-VALUE-TEST
          if (		compareChars(ip08101RunIndicator,valueTest300) == 0 ) { 
//  SET 88-IP60001-LOG-EVENT TO TRUE
              ip60001EventLogWorkArea.setIp60001LogEvent88True(); 
              
//  PERFORM 9950-UPDATE-EVENT-LOG
              updateEventLog();/*9950-UPDATE-EVENT-LOG*/
          }
  
      
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
      private void closeRunControlFile() throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph closes run control file and checks for the file  *
// *status. if it is not good it performs terminate process         *
// *-----------------------------------------------------------------
//  PERFORM 8400-CLOSE-SYS012
          closeSys012();/*8400-CLOSE-SYS012*/
//  IF 88-200-SYS012-STATUS-GOOD
//  ELSE
          if (!(work.isSys012StatusGood88200()) ) { 
//  SET 88-600-RUN-CTRL-CLOSE-ERR-TXT TO TRUE
              runControlErrMsgTxt600.setRunCtrlCloseErrTxt88600True(); 
              
//  MOVE 200-SYS012-FILE-STATUS TO 600-RUN-CTRL-FILE-STATUS
              runControlErrMsgTxt600.setRunCtrlFileStatus600(work.getSys012FileStatus200());
//  MOVE 300-PARA-1330 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara1330300());
//  MOVE 300-SYS012-CLOSE-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getSys012CloseAbendCode300());
              // MOVE 600-RUN-CONTROL-ERR-MSG-TXT TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(runControlErrMsgTxt600.toCharArray());
//  PERFORM 9000-TERMINATE-PROCESS
              terminateProcess();/*9000-TERMINATE-PROCESS*/
          }
      
      }
      /**
      * openFiles 
      *   This method is derived from 
  *   COBOL Paragraph - 1400-OPEN-FILES COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void openFiles() throws Exception {
      
// *-----------------------------------------------------------------
// * This paragraph opens input ipm outbound file, output outbound
// * extract file.
// *-----------------------------------------------------------------
//  PERFORM 1410-OPEN-USCRB-IPM-OTBND-FILE
          openUscrbIpmOtbndFile();/*1410-OPEN-USCRB-IPM-OTBND-FILE*/
//  PERFORM 1420-OPEN-SCRB-OTBND-FILE
          openScrbOtbndFile();/*1420-OPEN-SCRB-OTBND-FILE*/
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
      private void openUscrbIpmOtbndFile() throws Exception {
      
// *-----------------------------------------------------------------
// * This paragraph opens unscrubbed ipm outbound file
// *-----------------------------------------------------------------
//  OPEN INPUT SYS001-INPUT-IPM-OUTBOUND-FILE
          sys001InputIpmOutboundFile.open(new String(CONSTANTS.MODE_READ_ONLY_36242),sys001InputIpmOutboundFile.getFileName(),sys001InputIpmOutboundFile.getSys001InputIpmOutboundFileCharSet(),sys001InputIpmOutboundFile.getSys001InputIpmOutboundFileCrlfFlag());
          work.setSys001FileStatus200(sys001InputIpmOutboundFile.getStatusString() );
//  IF 88-200-SYS001-STATUS-GOOD
//  ELSE
          if (!(work.isSys001StatusGood88200()) ) { 
//  SET 88-600-INPUT-FILE-OPEN-ERR-TXT TO TRUE
              inputOutboundErrMsgTxt600.setInputFileOpenErrTxt88600True(); 
              
//  MOVE 200-SYS001-FILE-STATUS TO 600-INPUT-OTBND-FILE-STATUS
              inputOutboundErrMsgTxt600.setInputOtbndFileStatus600(work.getSys001FileStatus200());
//  MOVE 300-PARA-1410 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara1410300());
//  MOVE 300-SYS001-OPEN-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getSys001OpenAbendCode300());
              // MOVE 600-INPUT-OUTBOUND-ERR-MSG-TXT TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(inputOutboundErrMsgTxt600.toCharArray());
//  PERFORM 9000-TERMINATE-PROCESS
              terminateProcess();/*9000-TERMINATE-PROCESS*/
          }
      
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
      private void openScrbOtbndFile() throws Exception {
      
// *-----------------------------------------------------------------
// * This paragraph opens output outbound extract file
// *-----------------------------------------------------------------
//  OPEN OUTPUT SYS201-OUTPUT-IPM-OTBND-FILE
          sys201OutputIpmOtbndFile.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),sys201OutputIpmOtbndFile.getFileName(),sys201OutputIpmOtbndFile.getSys201OutputIpmOtbndFileCharSet(),sys201OutputIpmOtbndFile.getSys201OutputIpmOtbndFileCrlfFlag());
          work.setOutputOtbndFileStatus201(sys201OutputIpmOtbndFile.getStatusString() );
//  OPEN OUTPUT SYS202-OUTPUT-IPM-OTBND-FILE
          sys202OutputIpmOtbndFile.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),sys202OutputIpmOtbndFile.getFileName(),sys202OutputIpmOtbndFile.getSys202OutputIpmOtbndFileCharSet(),sys202OutputIpmOtbndFile.getSys202OutputIpmOtbndFileCrlfFlag());
          work.setOutputOtbndFileStatus202(sys202OutputIpmOtbndFile.getStatusString() );
//  OPEN OUTPUT SYS203-OUTPUT-IPM-OTBND-FILE
          sys203OutputIpmOtbndFile.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),sys203OutputIpmOtbndFile.getFileName(),sys203OutputIpmOtbndFile.getSys203OutputIpmOtbndFileCharSet(),sys203OutputIpmOtbndFile.getSys203OutputIpmOtbndFileCrlfFlag());
          work.setOutputOtbndFileStatus203(sys203OutputIpmOtbndFile.getStatusString() );
//  OPEN OUTPUT SYS204-OUTPUT-IPM-OTBND-FILE
          sys204OutputIpmOtbndFile.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),sys204OutputIpmOtbndFile.getFileName(),sys204OutputIpmOtbndFile.getSys204OutputIpmOtbndFileCharSet(),sys204OutputIpmOtbndFile.getSys204OutputIpmOtbndFileCrlfFlag());
          work.setOutputOtbndFileStatus204(sys204OutputIpmOtbndFile.getStatusString() );
//  OPEN OUTPUT SYS205-OUTPUT-IPM-OTBND-FILE
          sys205OutputIpmOtbndFile.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),sys205OutputIpmOtbndFile.getFileName(),sys205OutputIpmOtbndFile.getSys205OutputIpmOtbndFileCharSet(),sys205OutputIpmOtbndFile.getSys205OutputIpmOtbndFileCrlfFlag());
          work.setOutputOtbndFileStatus205(sys205OutputIpmOtbndFile.getStatusString() );
//  OPEN OUTPUT SYS206-OUTPUT-IPM-OTBND-FILE
          sys206OutputIpmOtbndFile.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),sys206OutputIpmOtbndFile.getFileName(),sys206OutputIpmOtbndFile.getSys206OutputIpmOtbndFileCharSet(),sys206OutputIpmOtbndFile.getSys206OutputIpmOtbndFileCrlfFlag());
          work.setOutputOtbndFileStatus206(sys206OutputIpmOtbndFile.getStatusString() );
//  OPEN OUTPUT SYS207-OUTPUT-IPM-OTBND-FILE
          sys207OutputIpmOtbndFile.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),sys207OutputIpmOtbndFile.getFileName(),sys207OutputIpmOtbndFile.getSys207OutputIpmOtbndFileCharSet(),sys207OutputIpmOtbndFile.getSys207OutputIpmOtbndFileCrlfFlag());
          work.setOutputOtbndFileStatus207(sys207OutputIpmOtbndFile.getStatusString() );
//  IF ( 88-200-SYS201-STATUS-GOOD AND 88-200-SYS202-STATUS-GOOD AND 88-200-SYS203-STATUS-GOOD AND 88-200-SYS204-STATUS-GOOD AND 88-200-SYS205-STATUS-GOOD AND 88-200-SYS206-STATUS-GOOD AND 88-200-SYS207-STATUS-GOOD )
          if (( work.isSys201StatusGood88200()   &&  work.isSys202StatusGood88200()   &&  work.isSys203StatusGood88200()   &&  work.isSys204StatusGood88200()   &&  work.isSys205StatusGood88200()   &&  work.isSys206StatusGood88200()   &&  work.isSys207StatusGood88200()  )) { 
//  SET 88-100-SYS201-IS-OPEN TO TRUE
              work.setSys201IsOpen88100True(); 
              
          }
//  ELSE
          else { 
//  SET 88-600-OUTPUT-OPEN-ERR-TXT TO TRUE
              outputOtbndErrMsgTxt600.setOutputOpenErrTxt88600True(); 
              
//  MOVE 201-OUTPUT-OTBND-FILE-STATUS TO 600-OUTPUT-OTBND-FILE-STATUS
              outputOtbndErrMsgTxt600.setOutputOtbndFileStatus600(work.getOutputOtbndFileStatus201());
//  MOVE 300-PARA-1420 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara1420300());
//  MOVE 300-SYS201-OPEN-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getSys201OpenAbendCode300());
              // MOVE 600-OUTPUT-OTBND-ERR-MSG-TXT TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(outputOtbndErrMsgTxt600.toCharArray());
//  PERFORM 9000-TERMINATE-PROCESS
              terminateProcess();/*9000-TERMINATE-PROCESS*/
          }
      
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
      private void processInputFile() throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph reads the input file and process unscrub        *
// * outbound data.                                                 *
// *----------------------------------------------------------------*
//  PERFORM 8100-READ-INPUT-OUTBOUND-FILE
          readInputOutboundFile();/*8100-READ-INPUT-OUTBOUND-FILE*/
//  PERFORM 2100-PROCESS-UNSCRUB-OUTBOUND UNTIL 88-200-SYS001-END-OF-FILE
          while (!(work.isSys001EndOfFile88200()) ) {
             processUnscrubOutbound();/*2100-PROCESS-UNSCRUB-OUTBOUND*/
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
      private void processUnscrubOutbound() throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph calls read parser to parse ipm messages.        *
// *----------------------------------------------------------------*
//  PERFORM 2110-CALL-READ-PARSER
          callReadParser();/*2110-CALL-READ-PARSER*/
//  PERFORM 2120-PROCESS-OUTPUT-OTBND-FILE
          processOutputOtbndFile();/*2120-PROCESS-OUTPUT-OTBND-FILE*/
//  PERFORM 8100-READ-INPUT-OUTBOUND-FILE
          readInputOutboundFile();/*8100-READ-INPUT-OUTBOUND-FILE*/
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
      private void callReadParser() throws Exception {
      
// *-----------------------------------------------------------------
// * This paragraph calls read parser after setting record already  *
// * read switch to true.                                           *
// *-----------------------------------------------------------------
//  MOVE LENGTH OF 800-SORT-KEY TO 800-SORT-KEY-LENGTH
          work.setSortKeyLength800(SortKey800.getSortKey800FieldLength());
//  SUBTRACT 800-SORT-KEY-LENGTH FROM 400-IPM-OUTBND-UNSCRUB-RDW GIVING IP66102-IPM-MSG-LNGTH
          ip66102IpmFileInformation.setIp66102IpmMsgLngth(Math.abs((int) work.getIpmOutbndUnscrubRdw400()-(int) work.getSortKeyLength800()));
//  MOVE IP30671-MESSAGE-AREA (1 : IP66102-IPM-MSG-LNGTH ) TO IP66102-NORMAL-IPM-MSG (1 : IP66102-IPM-MSG-LNGTH )
          ip66102IpmMsg.replace(ip30671OutboundMessageArea/*parent*/,212/*fromOffset - (ip66102NormalIpmMsg) */,(int) ip66102IpmFileInformation.getIp66102IpmMsgLngth()/*fromLen*/,0/*toOffset - (ip30671MessageArea) */,(int) ip66102IpmFileInformation.getIp66102IpmMsgLngth()/*toLen*/);
//  SET IP66102-RECORD-ALREADY-READ TO TRUE
          ip66102IpmFileInformation.setIp66102RecordAlreadyReadTrue(); 
          
//  CALL 800-PTR-IP662010
          // CALL 800-PTR-IP662010
          	this.setRc( ip662010.process());
//  IF RETURN-CODE EQUAL ZEROS
//  ELSE
          if (	( getRc() != 0 )) { 
//  SET 88-600-READ-PARSER-ERR-TXT TO TRUE
              readParserErrMsgTxt600.setReadParserErrTxt88600True(); 
              
//  MOVE RETURN-CODE TO 600-READ-PARSER-RETURN-CODE
              readParserErrMsgTxt600.setReadParserReturnCode600(String.valueOf(CFUtil.pad(4,String.valueOf(getRc()),"0",CFUtil.LEFT_PAD)).toCharArray());
//  MOVE 300-PARA-2110 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara2110300());
//  MOVE 300-READ-PARSER-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getReadParserAbendCode300());
              // MOVE 600-READ-PARSER-ERR-MSG-TXT TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(readParserErrMsgTxt600.toCharArray());
//  PERFORM 9000-TERMINATE-PROCESS
              terminateProcess();/*9000-TERMINATE-PROCESS*/
          }
      
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
      private void processOutputOtbndFile() throws Exception {
      
// *-----------------------------------------------------------------
// *This para writes the output in corresponding files based on the
// *write flag
// *-----------------------------------------------------------------
//  PERFORM 2121-CHECK-ACTIVITY
          checkActivity();/*2121-CHECK-ACTIVITY*/
//  IF 88-800-WRITE1-Y
          if ( work.isWrite1Y88800()  ) { 
//  PERFORM 8200-WRITE-OUTBOUND-FILE1
              writeOutboundFile1();/*8200-WRITE-OUTBOUND-FILE1*/
          }
//  IF 88-800-WRITE2-Y
          if ( work.isWrite2Y88800()  ) { 
//  PERFORM 8200-WRITE-OUTBOUND-FILE2
              writeOutboundFile2();/*8200-WRITE-OUTBOUND-FILE2*/
          }
//  IF 88-800-WRITE3-Y
          if ( work.isWrite3Y88800()  ) { 
//  PERFORM 8200-WRITE-OUTBOUND-FILE3
              writeOutboundFile3();/*8200-WRITE-OUTBOUND-FILE3*/
          }
//  IF 88-800-WRITE4-Y
          if ( work.isWrite4Y88800()  ) { 
//  PERFORM 8200-WRITE-OUTBOUND-FILE4
              writeOutboundFile4();/*8200-WRITE-OUTBOUND-FILE4*/
          }
//  IF 88-800-WRITE5-Y
          if ( work.isWrite5Y88800()  ) { 
//  PERFORM 8200-WRITE-OUTBOUND-FILE5
              writeOutboundFile5();/*8200-WRITE-OUTBOUND-FILE5*/
          }
//  IF 88-800-WRITE6-Y
          if ( work.isWrite6Y88800()  ) { 
//  PERFORM 8200-WRITE-OUTBOUND-FILE6
              writeOutboundFile6();/*8200-WRITE-OUTBOUND-FILE6*/
          }
//  IF 88-800-WRITE7-Y
          if ( work.isWrite7Y88800()  ) { 
//  PERFORM 8200-WRITE-OUTBOUND-FILE7
              writeOutboundFile7();/*8200-WRITE-OUTBOUND-FILE7*/
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
      private void checkActivity() throws Exception {
			// Declare local variables used in the method
			char[] valueX300 = null;
			char[] ip66102Mti = null;
			ErrorDesc800 errorDesc800 = chipLiabVariables800.getErrorDesc800();
			UsdAmt1800 usdAmt1800 = chipLiabVariables800.getUsdAmt1800();
			Pds841800 pds841800 = pds841ValuesGroup800.getPds841800();
			Ip66102NormalIpmMsg ip66102NormalIpmMsg = ip66102IpmMsg.getIp66102NormalIpmMsg();
			Ip65504DeNamesLargeGroup1 ip65504DeNamesLargeGroup1 = ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1();
			// End of variable declaration

      
// *----------------------------------------------------------------*
// * This para checks the error and edit activity and sets the      *
// * corresponding write flag to true                               *
// *-----------------------------------------------------------------
//  SET 88-800-WRITE1-N TO TRUE
          work.setWrite1N88800True(); 
          
//  SET 88-800-WRITE2-N TO TRUE
          work.setWrite2N88800True(); 
          
//  SET 88-800-WRITE3-N TO TRUE
          work.setWrite3N88800True(); 
          
//  SET 88-800-WRITE4-N TO TRUE
          work.setWrite4N88800True(); 
          
//  SET 88-800-WRITE5-N TO TRUE
          work.setWrite5N88800True(); 
          
//  SET 88-800-WRITE6-N TO TRUE
          work.setWrite6N88800True(); 
          
//  SET 88-800-WRITE7-N TO TRUE
          work.setWrite7N88800True(); 
          
//  MOVE SPACES TO 800-L1-CTL-VALUES 800-PDS05-DATA 800-PDS841-VALUES
          l1CtlValues800.setString(CONSTANTS.SPACE_33);
          pds05DataGroup800.setPds05Data800(CONSTANTS.SPACE_140);
          pds841ValuesGroup800.setPds841Values800(CONSTANTS.SPACE_8);
//  MOVE ZEROES TO 800-TRAN-CUR 800-AMT-E1848-TEM 800-AMT-E1849-TEM 800-AMT-E1850-TEM 800-AMT-E1851-TEM 800-AMT-E1852-TEM 800-AMT-E1750-TEM 800-AMT-E1754-TEM 800-TRAN-AMT 800-TRAN-CUR-TMP 800-TRAN-CUR-EXP 800-TRAN-AMT-TMP
          work.setTranCur800(0);
          amtE1848TemGroup800.setAmtE1848Tem800(0);
          amtE1849TemGroup800.setAmtE1849Tem800(0);
          amtE1850TemGroup800.setAmtE1850Tem800(0);
          amtE1851TemGroup800.setAmtE1851Tem800(0);
          amtE1852TemGroup800.setAmtE1852Tem800(0);
          amtE1750TemGroup800.setAmtE1750Tem800(0);
          amtE1754TemGroup800.setAmtE1754Tem800(0);
          work.setTranAmt800(0);
          work.setTranCurTmp800(0);
          work.setTranCurExp800(0);
          work.setTranAmtTmp800(0);
          // MOVE SPACES TO 800-PDS165S1 800-P0165
          work.setPds165s1800(CONSTANTS.SPACE);
          work.setP0165800(CONSTANTS.SPACE_30);
          valueX300 = work.getValueX300();
//  IF IP65504-SEL-PDS-ENT (165) EQUAL 300-VALUE-X
          if (		compareChars(ip65504SelPdsEntriesAll.getIp65504SelPdsEnt(164),valueX300) == 0 ) { 
//  MOVE IP66102-NORMAL-IPM-MSG ( IP65504-P165-SETL-ID-S : IP65504-P165-SETL-ID-L ) TO 800-P0165
              work.setP0165800(substring(ip66102IpmMsg.getIp66102NormalIpmMsg().toCharArray(),(ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup6().getIp65504P165SetlIdS()-1), (ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup6().getIp65504P165SetlIdL() + (ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup6().getIp65504P165SetlIdS() - 1)) ));
//  MOVE 800-P0165 (1 : 1) TO 800-PDS165S1
              work.setPds165s1800(substring(work.getP0165800(),0,1));
          }
  
          valueX300 = work.getValueX300();
//  IF IP65504-SEL-PDS-ENT (830) EQUAL 300-VALUE-X
          if (		compareChars(ip65504SelPdsEntriesAll.getIp65504SelPdsEnt(829),valueX300) == 0 ) { 
//  MOVE IP66102-NORMAL-IPM-MSG ( IP65504-P830-RESERVD-S : IP65504-P830-RESERVD-L ) TO 800-L1-CTL-VALUES
              l1CtlValues800.replace(ip66102IpmMsg/*parent*/,0+ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup27().getIp65504P830ReservdS() - 1/*fromOffset - (l1CtlValues800) */,ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup27().getIp65504P830ReservdL()/*fromLen*/,0/*toOffset - (ip66102NormalIpmMsg) */,33/*toLen*/);
          }
  
          valueX300 = work.getValueX300();
//  IF IP65504-SEL-PDS-ENT (841) EQUAL 300-VALUE-X
          if (		compareChars(ip65504SelPdsEntriesAll.getIp65504SelPdsEnt(840),valueX300) == 0 ) { 
//  MOVE IP66102-NORMAL-IPM-MSG ( IP65504-P841-RESERVD-S : IP65504-P830-RESERVD-L ) TO 800-PDS841-VALUES
              pds841ValuesGroup800.replace(ip66102IpmMsg/*parent*/,0+ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup28().getIp65504P841ReservdS() - 1/*fromOffset - (pds841Values800) */,ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup27().getIp65504P830ReservdL()/*fromLen*/,0/*toOffset - (ip66102NormalIpmMsg) */,8/*toLen*/);
          }
  
          valueX300 = work.getValueX300();
//  IF IP65504-SEL-PDS-ENT (5) EQUAL 300-VALUE-X
          if (		compareChars(ip65504SelPdsEntriesAll.getIp65504SelPdsEnt(4),valueX300) == 0 ) { 
//  MOVE IP66102-NORMAL-IPM-MSG ( IP65504-P005-MSGERID-S : IP65504-P005-MSGERID-L ) TO 800-PDS05-DATA
              pds05DataGroup800.replace(ip66102IpmMsg/*parent*/,0+ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup1().getIp65504P005MsgeridS() - 1/*fromOffset - (pds05Data800) */,ip65504PdsMapGroup.getIp65504PdsNames().getIp65504PdsNamesLargeGroup1().getIp65504P005MsgeridL()/*fromLen*/,0/*toOffset - (ip66102NormalIpmMsg) */,140/*toLen*/);
          }
  

// *****  Monitor error codes
          ip66102Mti = ip66102NormalIpmMsg.getIp66102Mti();
          ip66102NormalIpmMsg = ip66102IpmMsg.getIp66102NormalIpmMsg();
//  IF ( IP66102-MTI = '1644' ) AND ( IP66102-NORMAL-IPM-MSG ( IP65504-D24-FUNC-CD-S : IP65504-D24-FUNC-CD-L )) EQUAL '691'
//  LITERAL_691 = '691'
          if ((		compareChars(ip66102Mti,CONSTANTS.LITERAL_1644) == 0 ) && Field.compareChar(ip66102NormalIpmMsg.toCharArray() , CONSTANTS.LITERAL_691 , ( (ip65504DeNamesLargeGroup1.getIp65504D24FuncCdS() - 1) /*start*/ ), ip65504DeNamesLargeGroup1.getIp65504D24FuncCdL() /*left len*/ , 3 /*right len*/)) { 

// *---------------------------------------------------------------*
// * This condition checks for the edit #1750. if the transaction  *
// * got failed for the errr code 2267 and edit number 1750, then  *
// * the transaction wrriten into sys207 file                      *
// *---------------------------------------------------------------*
              pds841800 = pds841ValuesGroup800.getPds841800();
//  IF ( 800-L1-CTL-MTI EQUAL '1442' ) AND ( 88-800-PDS841-1750-Y )
//  LITERAL_1442 = '1442'
              if ((compareChars(l1CtlValues800.getL1CtlMti800String(),CONSTANTS.LITERAL_1442) == 0) && ( pds841800.isPds8411750Y88800()  )) { 
//  IF ( 800-PDS005-S3-ERR-CDE (01) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (02) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (03) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (04) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (05) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (06) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (07) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (08) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (09) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (10) = '2267' )
//  LITERAL_2267 = '2267'
                  if ((compareChars(pds05DataGroup800.getPds05800(0).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(1).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(2).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(3).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(4).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(5).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(6).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(7).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(8).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(9).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0)) { 
//  SET 88-800-WRITE7-Y TO TRUE
                      work.setWrite7Y88800True(); 
                      
                      // MOVE "2267" TO 800-ERROR-NUM
                      //  LITERAL_2267 = "2267"
                      chipLiabVariables800.setErrorNum800(CONSTANTS.LITERAL_2267);
                      // MOVE "1750" TO 800-EDIT-NUM
                      //  LITERAL_1750 = "1750"
                      chipLiabVariables800.setEditNum800(CONSTANTS.LITERAL_1750);
//  MOVE 800-1750-DESC1 TO 800-ERR-DESC1
                      errorDesc800.setErrDesc1800(pad(106,work.getDesc18001750(),SPACE_CHAR,RIGHT_PAD));
  
//  MOVE 800-1750-DESC2 TO 800-ERR-DESC2
                      errorDesc800.setErrDesc2800(pad(100,work.getDesc28001750(),SPACE_CHAR,RIGHT_PAD));
  
//  PERFORM 2190-GET-TRAN-AMT
                      getTranAmt();/*2190-GET-TRAN-AMT*/
//  PERFORM 2500-EXTRACT-FIELDS
                      extractFields();/*2500-EXTRACT-FIELDS*/
                      // MOVE 800-TRAN-AMT TO 800-AMT-E1750-TEM
                      amtE1750TemGroup800.setAmtE1750Tem800(work.getTranAmt800());
//  MOVE 800-AMT-E1750-TEM (1 : 10) TO 800-USD-AMT
                      usdAmt1800.setUsdAmt800(String.valueOf(substring(amtE1750TemGroup800.getAmtE1750Tem800String(),0,10)).toCharArray());
  
//  MOVE 800-AMT-E1750-TEM (11 : 2) TO 800-USD-AMT-DEC
                      usdAmt1800.setUsdAmtDec800(String.valueOf(substring(amtE1750TemGroup800.getAmtE1750Tem800String(),10,12)).toCharArray());
  
//  ADD 800-AMT-E1750-TEM TO 800-AMT-E1750
                      work.setAmtE1750800(work.getAmtE1750800()+amtE1750TemGroup800.getAmtE1750Tem800());
//  ADD 800-TRAN-AMT TO 800-TRANS-AMOUNT
                      work.setTransAmount800(work.getTransAmount800()+work.getTranAmt800());
                  }
              }
  

// *---------------------------------------------------------------*
// * This condition checks for the edit #1754. if the transaction  *
// * got failed for the errr code 2267 and edit number 1754, then  *
// * the transaction wrriten into sys206 file                      *
// *---------------------------------------------------------------*
              pds841800 = pds841ValuesGroup800.getPds841800();
//  IF ( 800-L1-CTL-MTI EQUAL '1442' ) AND ( 88-800-PDS841-1754-Y )
//  LITERAL_1442 = '1442'
              if ((compareChars(l1CtlValues800.getL1CtlMti800String(),CONSTANTS.LITERAL_1442) == 0) && ( pds841800.isPds8411754Y88800()  )) { 
//  IF ( 800-PDS005-S3-ERR-CDE (01) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (02) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (03) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (04) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (05) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (06) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (07) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (08) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (09) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (10) = '2267' )
//  LITERAL_2267 = '2267'
                  if ((compareChars(pds05DataGroup800.getPds05800(0).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(1).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(2).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(3).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(4).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(5).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(6).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(7).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(8).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(9).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0)) { 
//  SET 88-800-WRITE6-Y TO TRUE
                      work.setWrite6Y88800True(); 
                      
                      // MOVE "2267" TO 800-ERROR-NUM
                      //  LITERAL_2267 = "2267"
                      chipLiabVariables800.setErrorNum800(CONSTANTS.LITERAL_2267);
                      // MOVE "1754" TO 800-EDIT-NUM
                      //  LITERAL_1754 = "1754"
                      chipLiabVariables800.setEditNum800(CONSTANTS.LITERAL_1754);
//  MOVE 800-1754-DESC1 TO 800-ERR-DESC1
                      errorDesc800.setErrDesc1800(pad(106,work.getDesc18001754(),SPACE_CHAR,RIGHT_PAD));
  
//  MOVE 800-1754-DESC2 TO 800-ERR-DESC2
                      errorDesc800.setErrDesc2800(pad(100,work.getDesc28001754(),SPACE_CHAR,RIGHT_PAD));
  
//  PERFORM 2190-GET-TRAN-AMT
                      getTranAmt();/*2190-GET-TRAN-AMT*/
//  PERFORM 2500-EXTRACT-FIELDS
                      extractFields();/*2500-EXTRACT-FIELDS*/
                      // MOVE 800-TRAN-AMT TO 800-AMT-E1754-TEM
                      amtE1754TemGroup800.setAmtE1754Tem800(work.getTranAmt800());
//  MOVE 800-AMT-E1754-TEM (1 : 10) TO 800-USD-AMT
                      usdAmt1800.setUsdAmt800(String.valueOf(substring(amtE1754TemGroup800.getAmtE1754Tem800String(),0,10)).toCharArray());
  
//  MOVE 800-AMT-E1754-TEM (11 : 2) TO 800-USD-AMT-DEC
                      usdAmt1800.setUsdAmtDec800(String.valueOf(substring(amtE1754TemGroup800.getAmtE1754Tem800String(),10,12)).toCharArray());
  
//  ADD 800-AMT-E1754-TEM TO 800-AMT-E1754
                      work.setAmtE1754800(work.getAmtE1754800()+amtE1754TemGroup800.getAmtE1754Tem800());
//  ADD 800-TRAN-AMT TO 800-TRANS-AMOUNT
                      work.setTransAmount800(work.getTransAmount800()+work.getTranAmt800());
                  }
              }
  

// *---------------------------------------------------------------*
// * This condition checks for the edit #1848. if the transaction  *
// * got failed for the errr code 2267 and edit number 1848, then  *
// * the transaction wrriten into sys201 file                      *
// *---------------------------------------------------------------*
              pds841800 = pds841ValuesGroup800.getPds841800();
//  IF ( 800-L1-CTL-MTI EQUAL '1442' ) AND ( 88-800-PDS841-1848-Y )
//  LITERAL_1442 = '1442'
              if ((compareChars(l1CtlValues800.getL1CtlMti800String(),CONSTANTS.LITERAL_1442) == 0) && ( pds841800.isPds8411848Y88800()  )) { 
//  IF ( 800-PDS005-S3-ERR-CDE (01) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (02) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (03) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (04) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (05) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (06) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (07) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (08) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (09) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (10) = '2267' )
//  LITERAL_2267 = '2267'
                  if ((compareChars(pds05DataGroup800.getPds05800(0).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(1).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(2).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(3).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(4).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(5).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(6).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(7).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(8).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(9).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0)) { 
//  SET 88-800-WRITE1-Y TO TRUE
                      work.setWrite1Y88800True(); 
                      
                      // MOVE "2267" TO 800-ERROR-NUM
                      //  LITERAL_2267 = "2267"
                      chipLiabVariables800.setErrorNum800(CONSTANTS.LITERAL_2267);
                      // MOVE "1848" TO 800-EDIT-NUM
                      //  LITERAL_1848 = "1848"
                      chipLiabVariables800.setEditNum800(CONSTANTS.LITERAL_1848);
//  MOVE 800-1848-DESC1 TO 800-ERR-DESC1
                      errorDesc800.setErrDesc1800(pad(106,work.getDesc18001848(),SPACE_CHAR,RIGHT_PAD));
  
//  MOVE 800-1848-DESC2 TO 800-ERR-DESC2
                      errorDesc800.setErrDesc2800(pad(100,work.getDesc28001848(),SPACE_CHAR,RIGHT_PAD));
  
//  PERFORM 2190-GET-TRAN-AMT
                      getTranAmt();/*2190-GET-TRAN-AMT*/
//  PERFORM 2500-EXTRACT-FIELDS
                      extractFields();/*2500-EXTRACT-FIELDS*/
                      // MOVE 800-TRAN-AMT TO 800-AMT-E1848-TEM
                      amtE1848TemGroup800.setAmtE1848Tem800(work.getTranAmt800());
//  MOVE 800-AMT-E1848-TEM (1 : 10) TO 800-USD-AMT
                      usdAmt1800.setUsdAmt800(String.valueOf(substring(amtE1848TemGroup800.getAmtE1848Tem800String(),0,10)).toCharArray());
  
//  MOVE 800-AMT-E1848-TEM (11 : 2) TO 800-USD-AMT-DEC
                      usdAmt1800.setUsdAmtDec800(String.valueOf(substring(amtE1848TemGroup800.getAmtE1848Tem800String(),10,12)).toCharArray());
  
//  ADD 800-AMT-E1848-TEM TO 800-AMT-E1848
                      work.setAmtE1848800(work.getAmtE1848800()+amtE1848TemGroup800.getAmtE1848Tem800());
//  ADD 800-TRAN-AMT TO 800-TRANS-AMOUNT
                      work.setTransAmount800(work.getTransAmount800()+work.getTranAmt800());
                  }
              }
  

// *---------------------------------------------------------------*
// * This condition checks for the edit #1849. if the transaction  *
// * got failed for the errr code 2267 and edit number 1849, then  *
// * the transaction wrriten into sys202 file                      *
// *---------------------------------------------------------------*
              pds841800 = pds841ValuesGroup800.getPds841800();
//  IF ( 800-L1-CTL-MTI EQUAL '1442' ) AND ( 88-800-PDS841-1849-Y )
//  LITERAL_1442 = '1442'
              if ((compareChars(l1CtlValues800.getL1CtlMti800String(),CONSTANTS.LITERAL_1442) == 0) && ( pds841800.isPds8411849Y88800()  )) { 
//  IF ( 800-PDS005-S3-ERR-CDE (01) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (02) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (03) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (04) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (05) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (06) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (07) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (08) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (09) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (10) = '2267' )
//  LITERAL_2267 = '2267'
                  if ((compareChars(pds05DataGroup800.getPds05800(0).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(1).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(2).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(3).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(4).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(5).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(6).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(7).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(8).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(9).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0)) { 
//  SET 88-800-WRITE2-Y TO TRUE
                      work.setWrite2Y88800True(); 
                      
                      // MOVE "2267" TO 800-ERROR-NUM
                      //  LITERAL_2267 = "2267"
                      chipLiabVariables800.setErrorNum800(CONSTANTS.LITERAL_2267);
                      // MOVE "1849" TO 800-EDIT-NUM
                      //  LITERAL_1849 = "1849"
                      chipLiabVariables800.setEditNum800(CONSTANTS.LITERAL_1849);
//  MOVE 800-1849-DESC1 TO 800-ERR-DESC1
                      errorDesc800.setErrDesc1800(pad(106,work.getDesc18001849(),SPACE_CHAR,RIGHT_PAD));
  
//  MOVE 800-1849-DESC2 TO 800-ERR-DESC2
                      errorDesc800.setErrDesc2800(pad(100,work.getDesc28001849(),SPACE_CHAR,RIGHT_PAD));
  
//  PERFORM 2190-GET-TRAN-AMT
                      getTranAmt();/*2190-GET-TRAN-AMT*/
//  PERFORM 2500-EXTRACT-FIELDS
                      extractFields();/*2500-EXTRACT-FIELDS*/
                      // MOVE 800-TRAN-AMT TO 800-AMT-E1849-TEM
                      amtE1849TemGroup800.setAmtE1849Tem800(work.getTranAmt800());
//  MOVE 800-AMT-E1849-TEM (1 : 10) TO 800-USD-AMT
                      usdAmt1800.setUsdAmt800(String.valueOf(substring(amtE1849TemGroup800.getAmtE1849Tem800String(),0,10)).toCharArray());
  
//  MOVE 800-AMT-E1849-TEM (11 : 2) TO 800-USD-AMT-DEC
                      usdAmt1800.setUsdAmtDec800(String.valueOf(substring(amtE1849TemGroup800.getAmtE1849Tem800String(),10,12)).toCharArray());
  
//  ADD 800-AMT-E1849-TEM TO 800-AMT-E1849
                      work.setAmtE1849800(work.getAmtE1849800()+amtE1849TemGroup800.getAmtE1849Tem800());
//  ADD 800-TRAN-AMT TO 800-TRANS-AMOUNT
                      work.setTransAmount800(work.getTransAmount800()+work.getTranAmt800());
                  }
              }
  

// *---------------------------------------------------------------*
// * This condition checks for the edit #1850. if the transaction  *
// * got failed for the errr code 2267 and edit number 1850, then  *
// * the transaction wrriten into sys203 file                      *
// *---------------------------------------------------------------*
              pds841800 = pds841ValuesGroup800.getPds841800();
//  IF ( 800-L1-CTL-MTI EQUAL '1442' ) AND ( 88-800-PDS841-1850-Y )
//  LITERAL_1442 = '1442'
              if ((compareChars(l1CtlValues800.getL1CtlMti800String(),CONSTANTS.LITERAL_1442) == 0) && ( pds841800.isPds8411850Y88800()  )) { 
//  IF ( 800-PDS005-S3-ERR-CDE (01) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (02) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (03) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (04) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (05) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (06) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (07) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (08) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (09) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (10) = '2267' )
//  LITERAL_2267 = '2267'
                  if ((compareChars(pds05DataGroup800.getPds05800(0).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(1).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(2).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(3).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(4).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(5).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(6).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(7).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(8).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(9).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0)) { 
//  SET 88-800-WRITE3-Y TO TRUE
                      work.setWrite3Y88800True(); 
                      
                      // MOVE "2267" TO 800-ERROR-NUM
                      //  LITERAL_2267 = "2267"
                      chipLiabVariables800.setErrorNum800(CONSTANTS.LITERAL_2267);
                      // MOVE "1850" TO 800-EDIT-NUM
                      //  LITERAL_1850 = "1850"
                      chipLiabVariables800.setEditNum800(CONSTANTS.LITERAL_1850);
//  MOVE 800-1850-DESC1 TO 800-ERR-DESC1
                      errorDesc800.setErrDesc1800(work.getDesc18001850());
  
//  MOVE 800-1850-DESC2 TO 800-ERR-DESC2
                      errorDesc800.setErrDesc2800(pad(100,work.getDesc28001850(),SPACE_CHAR,RIGHT_PAD));
  
//  PERFORM 2190-GET-TRAN-AMT
                      getTranAmt();/*2190-GET-TRAN-AMT*/
//  PERFORM 2500-EXTRACT-FIELDS
                      extractFields();/*2500-EXTRACT-FIELDS*/
                      // MOVE 800-TRAN-AMT TO 800-AMT-E1850-TEM
                      amtE1850TemGroup800.setAmtE1850Tem800(work.getTranAmt800());
//  MOVE 800-AMT-E1850-TEM (1 : 10) TO 800-USD-AMT
                      usdAmt1800.setUsdAmt800(String.valueOf(substring(amtE1850TemGroup800.getAmtE1850Tem800String(),0,10)).toCharArray());
  
//  MOVE 800-AMT-E1850-TEM (11 : 2) TO 800-USD-AMT-DEC
                      usdAmt1800.setUsdAmtDec800(String.valueOf(substring(amtE1850TemGroup800.getAmtE1850Tem800String(),10,12)).toCharArray());
  
//  ADD 800-AMT-E1850-TEM TO 800-AMT-E1850
                      work.setAmtE1850800(work.getAmtE1850800()+amtE1850TemGroup800.getAmtE1850Tem800());
//  ADD 800-TRAN-AMT TO 800-TRANS-AMOUNT
                      work.setTransAmount800(work.getTransAmount800()+work.getTranAmt800());
                  }
              }
  

// *---------------------------------------------------------------*
// * This condition checks for the edit #1851. if the transaction  *
// * got failed for the errr code 2267 and edit number 1851, then  *
// * the transaction wrriten into sys204 file                      *
// *---------------------------------------------------------------*
              pds841800 = pds841ValuesGroup800.getPds841800();
//  IF ( 800-L1-CTL-MTI EQUAL '1442' ) AND ( 88-800-PDS841-1851-Y )
//  LITERAL_1442 = '1442'
              if ((compareChars(l1CtlValues800.getL1CtlMti800String(),CONSTANTS.LITERAL_1442) == 0) && ( pds841800.isPds8411851Y88800()  )) { 
//  IF ( 800-PDS005-S3-ERR-CDE (01) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (02) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (03) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (04) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (05) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (06) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (07) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (08) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (09) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (10) = '2267' )
//  LITERAL_2267 = '2267'
                  if ((compareChars(pds05DataGroup800.getPds05800(0).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(1).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(2).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(3).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(4).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(5).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(6).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(7).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(8).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(9).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0)) { 
//  SET 88-800-WRITE4-Y TO TRUE
                      work.setWrite4Y88800True(); 
                      
                      // MOVE "2267" TO 800-ERROR-NUM
                      //  LITERAL_2267 = "2267"
                      chipLiabVariables800.setErrorNum800(CONSTANTS.LITERAL_2267);
                      // MOVE "1851" TO 800-EDIT-NUM
                      //  LITERAL_1851 = "1851"
                      chipLiabVariables800.setEditNum800(CONSTANTS.LITERAL_1851);
//  MOVE 800-1851-DESC1 TO 800-ERR-DESC1
                      errorDesc800.setErrDesc1800(pad(106,work.getDesc18001851(),SPACE_CHAR,RIGHT_PAD));
  
//  MOVE SPACES TO 800-ERR-DESC2
                      errorDesc800.setErrDesc2800(CONSTANTS.SPACE_100);
  
//  PERFORM 2190-GET-TRAN-AMT
                      getTranAmt();/*2190-GET-TRAN-AMT*/
//  PERFORM 2500-EXTRACT-FIELDS
                      extractFields();/*2500-EXTRACT-FIELDS*/
                      // MOVE 800-TRAN-AMT TO 800-AMT-E1851-TEM
                      amtE1851TemGroup800.setAmtE1851Tem800(work.getTranAmt800());
//  MOVE 800-AMT-E1851-TEM (1 : 10) TO 800-USD-AMT
                      usdAmt1800.setUsdAmt800(String.valueOf(substring(amtE1851TemGroup800.getAmtE1851Tem800String(),0,10)).toCharArray());
  
//  MOVE 800-AMT-E1851-TEM (11 : 2) TO 800-USD-AMT-DEC
                      usdAmt1800.setUsdAmtDec800(String.valueOf(substring(amtE1851TemGroup800.getAmtE1851Tem800String(),10,12)).toCharArray());
  
//  ADD 800-AMT-E1851-TEM TO 800-AMT-E1851
                      work.setAmtE1851800(work.getAmtE1851800()+amtE1851TemGroup800.getAmtE1851Tem800());
//  ADD 800-TRAN-AMT TO 800-TRANS-AMOUNT
                      work.setTransAmount800(work.getTransAmount800()+work.getTranAmt800());
                  }
              }
  

// *---------------------------------------------------------------*
// * This condition checks for the edit #1852. if the transaction  *
// * got failed for the errr code 2267 and edit number 1852, then  *
// * the transaction wrriten into sys205 file                      *
// *---------------------------------------------------------------*
              pds841800 = pds841ValuesGroup800.getPds841800();
//  IF ( 800-L1-CTL-MTI EQUAL '1442' ) AND ( 88-800-PDS841-1852-Y )
//  LITERAL_1442 = '1442'
              if ((compareChars(l1CtlValues800.getL1CtlMti800String(),CONSTANTS.LITERAL_1442) == 0) && ( pds841800.isPds8411852Y88800()  )) { 
//  IF ( 800-PDS005-S3-ERR-CDE (01) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (02) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (03) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (04) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (05) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (06) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (07) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (08) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (09) = '2267' ) OR ( 800-PDS005-S3-ERR-CDE (10) = '2267' )
//  LITERAL_2267 = '2267'
                  if ((compareChars(pds05DataGroup800.getPds05800(0).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(1).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(2).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(3).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(4).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(5).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(6).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(7).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(8).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0) || (compareChars(pds05DataGroup800.getPds05800(9).getPds005S3ErrCde800(),CONSTANTS.LITERAL_2267) == 0)) { 
//  SET 88-800-WRITE5-Y TO TRUE
                      work.setWrite5Y88800True(); 
                      
                      // MOVE "2267" TO 800-ERROR-NUM
                      //  LITERAL_2267 = "2267"
                      chipLiabVariables800.setErrorNum800(CONSTANTS.LITERAL_2267);
                      // MOVE "1852" TO 800-EDIT-NUM
                      //  LITERAL_1852 = "1852"
                      chipLiabVariables800.setEditNum800(CONSTANTS.LITERAL_1852);
//  MOVE 800-1852-DESC1 TO 800-ERR-DESC1
                      errorDesc800.setErrDesc1800(pad(106,work.getDesc18001852(),SPACE_CHAR,RIGHT_PAD));
  
//  MOVE SPACES TO 800-ERR-DESC2
                      errorDesc800.setErrDesc2800(CONSTANTS.SPACE_100);
  
//  PERFORM 2190-GET-TRAN-AMT
                      getTranAmt();/*2190-GET-TRAN-AMT*/
//  PERFORM 2500-EXTRACT-FIELDS
                      extractFields();/*2500-EXTRACT-FIELDS*/
                      // MOVE 800-TRAN-AMT TO 800-AMT-E1852-TEM
                      amtE1852TemGroup800.setAmtE1852Tem800(work.getTranAmt800());
//  MOVE 800-AMT-E1852-TEM (1 : 10) TO 800-USD-AMT
                      usdAmt1800.setUsdAmt800(String.valueOf(substring(amtE1852TemGroup800.getAmtE1852Tem800String(),0,10)).toCharArray());
  
//  MOVE 800-AMT-E1852-TEM (11 : 2) TO 800-USD-AMT-DEC
                      usdAmt1800.setUsdAmtDec800(String.valueOf(substring(amtE1852TemGroup800.getAmtE1852Tem800String(),10,12)).toCharArray());
  
//  ADD 800-AMT-E1852-TEM TO 800-AMT-E1852
                      work.setAmtE1852800(work.getAmtE1852800()+amtE1852TemGroup800.getAmtE1852Tem800());
//  ADD 800-TRAN-AMT TO 800-TRANS-AMOUNT
                      work.setTransAmount800(work.getTransAmount800()+work.getTranAmt800());
                  }
              }
  
          }
  
      
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
      private void getTranAmt() throws Exception {
			// Declare local variables used in the method
			char[] valueX300 = null;
			int tranCurTmp800 = 0;
			// End of variable declaration

      
// *---------------------------------------------------------------*
//  PERFORM 8100-READ-INPUT-OUTBOUND-FILE
          readInputOutboundFile();/*8100-READ-INPUT-OUTBOUND-FILE*/
//  PERFORM 2110-CALL-READ-PARSER
          callReadParser();/*2110-CALL-READ-PARSER*/
          valueX300 = work.getValueX300();
//  IF IP65504-SEL-ELEM-ENT (49) = 300-VALUE-X
          if (		compareChars(ip65504SelElemEntriesAll.getIp65504SelElemEnt(48),valueX300) == 0 ) { 
//  MOVE IP66102-IPM-MSG ( IP65504-D49-TRX-CUR-S : IP65504-D49-TRX-CUR-L ) TO 800-TRAN-CUR-TMP
              work.setTranCurTmp800(CFUtil.getInt(substring(ip66102IpmMsg.getCharArray(),(ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup2().getIp65504D49TrxCurS()-1), (ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup2().getIp65504D49TrxCurL() + (ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup2().getIp65504D49TrxCurS() - 1)) )));
          }
  
          valueX300 = work.getValueX300();
//  IF IP65504-SEL-ELEM-ENT (4) = 300-VALUE-X
          if (		compareChars(ip65504SelElemEntriesAll.getIp65504SelElemEnt(3),valueX300) == 0 ) { 
//  MOVE IP66102-IPM-MSG ( IP65504-D04-TRX-AMT-S : IP65504-D04-TRX-AMT-L ) TO 800-TRAN-AMT-TMP
              try {
              work.setTranAmtTmp800(CFUtil.getLong(substring(ip66102IpmMsg.getCharArray(),(ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().getIp65504D04TrxAmtS()-1), (ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().getIp65504D04TrxAmtL() + (ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().getIp65504D04TrxAmtS() - 1)) )));
              } catch(NumberFormatException e) {}
          }
  
          tranCurTmp800 = work.getTranCurTmp800();
//  IF 800-TRAN-CUR-TMP = '840'
//  LITERAL_840 = '840'
          if (compareChars(work.getTranCurTmp800String(),CONSTANTS.LITERAL_840) == 0) { 
//  MOVE 800-TRAN-CUR-TMP TO 800-TRAN-CUR
              work.setTranCur800(work.getTranCurTmp800());
              // MOVE 800-TRAN-AMT-TMP TO 800-TRAN-AMT
              work.setTranAmt800(work.getTranAmtTmp800());
          }
  
//  ELSE
          else { 
//  PERFORM 2200-GET-CUR-EXP
              getCurExp();/*2200-GET-CUR-EXP*/
          }
      
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
      private void getCurExp() throws Exception {
			// Declare local variables used in the method
			Ip00174CurrCdKey ip00174CurrCdKey = ip00174TableEntry.getIp00174CurrCdKey();
			// End of variable declaration

      
// *---------------------------------------------------------------*
// * This para call the table 17 load api and gets the currency    *
// * exponent for the transaction currency                         *
// *---------------------------------------------------------------*
//  MOVE 800-TRAN-CUR-TMP TO IP00174-CURR-CD-CODE
          ip00174CurrCdKey.setIp00174CurrCdCode(work.getTranCurTmp800());
  
//  CALL 800-PTR-IP288010
          // CALL 800-PTR-IP288010
          	this.setRc( ip288010.process());
//  IF 88-IP00174-ENTRY-FOUND-Y
          if ( ip00174EntryFoundGroup.isIp00174EntryFoundY88()  ) { 
//  MOVE IP00174-CUR-EXP-CODE TO 800-TRAN-CUR-EXP
              work.setTranCurExp800(ip00174TableEntry.getIp00174CurExpCode());
//  PERFORM 2210-CUR-CONV-LOGIC
              curConvLogic();/*2210-CUR-CONV-LOGIC*/
          }
//  ELSE
          else { 
//  DISPLAY 'CURRENCY EXPONENT NOT FOUND FOR THE CURRENCY ' 800-TRAN-CUR-TMP
              logger.info("CURRENCY EXPONENT NOT FOUND FOR THE CURRENCY {}", String.valueOf(work.getTranCurTmp800())); 
//  DISPLAY 'MOVING ORIGINAL CUR & AMT'
              logger.info("MOVING ORIGINAL CUR & AMT"); 
//  MOVE 800-TRAN-CUR-TMP TO 800-TRAN-CUR
              work.setTranCur800(work.getTranCurTmp800());
              // MOVE 800-TRAN-AMT-TMP TO 800-TRAN-AMT
              work.setTranAmt800(work.getTranAmtTmp800());
          }
      
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
      private void curConvLogic() throws Exception {
			// Declare local variables used in the method
			Ip33701CurrConvInput ip33701CurrConvInput = ip33701CurrConvInterface.getIp33701CurrConvInput();
			Ip00694TableData ip00694TableData = ip00694TableEntry.getIp00694TableData();
			// End of variable declaration

      
// *----------------------------------------------------------------*
// * This para will move the transaction currency code and the      *
// * currency code exponents and call the currency conversion para  *
// *----------------------------------------------------------------*
//  SET 88-IP33701-XRATE1-MID-RT TO TRUE
          ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701Xrate1MidRt88True(); 
          
//  SET 88-IP33701-DIVIDE-BY-RATE TO TRUE
          ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701DivideByRate88True(); 
          
//  SET 88-IP33701-NO-CROSS-RATE TO TRUE
          ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701NoCrossRate88True(); 
          
          // MOVE 800-FX-DATE-YYDDD TO IP33701-FX-DATE-YYDDD
          ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701FxDateYyddd(work.getFxDateYyddd800());
  
//  MOVE IP00694-GLOBAL-CURR-CODE TO IP33701-TARGET-CUR-CODE
          ip33701CurrConvInput.setIp33701TargetCurCode(ip00694TableData.getIp00694GlobalCurrCode());
  
//  MOVE IP00694-GLOBAL-CURR-EXP TO IP33701-TARGET-CUR-EXP
          ip33701CurrConvInput.setIp33701TargetCurExp(String.valueOf(ip00694TableData.getIp00694GlobalCurrExpString()).toCharArray());
  
//  MOVE 800-TRAN-AMT-TMP TO IP33701-SOURCE-AMOUNT
          ip33701CurrConvInput.setIp33701SourceAmount(work.getTranAmtTmp800());
  
//  MOVE 800-TRAN-CUR-TMP TO IP33701-SOURCE-CUR-CODE
          ip33701CurrConvInput.setIp33701SourceCurCode(work.getTranCurTmp800());
  
//  MOVE 800-TRAN-CUR-EXP TO IP33701-SOURCE-CUR-EXP
          ip33701CurrConvInput.setIp33701SourceCurExp(String.valueOf(work.getTranCurExp800String()).toCharArray());
  
//  PERFORM 8400-DO-CURRENCY-CONVERSION
          doCurrencyConversion();/*8400-DO-CURRENCY-CONVERSION*/
          ;
      
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
      private void doCurrencyConversion() throws Exception {
			// Declare local variables used in the method
			Ip33701CurrConvOutput ip33701CurrConvOutput = ip33701CurrConvInterface.getIp33701CurrConvOutput();
			Ip33701CurrConvInput ip33701CurrConvInput = ip33701CurrConvInterface.getIp33701CurrConvInput();
			short ip33701ReturnCode = 0;
			// End of variable declaration

      
// *---------------------------------------------------------------*
// * This para calls the currency conversion module                *
// *---------------------------------------------------------------*
//  CALL 800-PTR-IP783510
          // CALL 800-PTR-IP783510
          	this.setRc( ip783510.process());
          ip33701ReturnCode = ip33701CurrConvOutput.getIp33701ReturnCode();
//  IF IP33701-RETURN-CODE EQUAL ZEROES
          if (	( ip33701ReturnCode == 0 ) ) { 
//  MOVE IP33701-TARGET-AMOUNT TO 800-TRAN-AMT
              work.setTranAmt800(ip33701CurrConvOutput.getIp33701TargetAmount());
  
//  MOVE IP33701-TARGET-CUR-CODE TO 800-TRAN-CUR
              work.setTranCur800(ip33701CurrConvInput.getIp33701TargetCurCode());
  
          }
  
//  ELSE
          else { 
//  DISPLAY 'CURRNCY CONVERSION FAILED FOR THE CURRENCY ' 800-TRAN-CUR-TMP
              logger.info("CURRNCY CONVERSION FAILED FOR THE CURRENCY {}", String.valueOf(work.getTranCurTmp800())); 
//  DISPLAY 'MOVING THE ORIGINAL CUR & AMT'
              logger.info("MOVING THE ORIGINAL CUR & AMT"); 
//  MOVE 800-TRAN-CUR-TMP TO 800-TRAN-CUR
              work.setTranCur800(work.getTranCurTmp800());
              // MOVE 800-TRAN-AMT-TMP TO 800-TRAN-AMT
              work.setTranAmt800(work.getTranAmtTmp800());
          }
      
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
      private void writeOutboundFile1() throws Exception {
      
// *---------------------------------------------------------------*
// * Writes outbound file (sys201)                                 *
// *---------------------------------------------------------------*
//  WRITE SYS201-OUTPUT-IPM-OTBND-REC FROM 800-CHIP-LIAB-VARIABLES
          sys201OutputIpmOtbndFile.write(chipLiabVariables800.toCharArray()); 
          sys201OutputIpmOtbndRec.setString(CONSTANTS.LOW_VALUE_215605977);
          work.setOutputOtbndFileStatus201(sys201OutputIpmOtbndFile.getStatusString() );
//  ADD 1 TO 400-IPM-RECORDS-PDS1
          work.setIpmRecordsPds1400(work.getIpmRecordsPds1400()+1);
//  IF 88-200-SYS201-STATUS-GOOD
//  ELSE
          if (!(work.isSys201StatusGood88200()) ) { 
//  DISPLAY 'SYS201 WRITE ERROR !! '
              logger.info("SYS201 WRITE ERROR !! "); 
          }
      
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
      private void writeOutboundFile2() throws Exception {
      
// *---------------------------------------------------------------*
// * Writes outbound file (sys202)                                 *
// *---------------------------------------------------------------*
//  WRITE SYS202-OUTPUT-IPM-OTBND-REC FROM 800-CHIP-LIAB-VARIABLES
          sys202OutputIpmOtbndFile.write(chipLiabVariables800.toCharArray()); 
          sys202OutputIpmOtbndRec.setString(CONSTANTS.LOW_VALUE_215605977);
          work.setOutputOtbndFileStatus202(sys202OutputIpmOtbndFile.getStatusString() );
//  ADD 1 TO 400-IPM-RECORDS-PDS2
          work.setIpmRecordsPds2400(work.getIpmRecordsPds2400()+1);
//  IF 88-200-SYS202-STATUS-GOOD
//  ELSE
          if (!(work.isSys202StatusGood88200()) ) { 
//  DISPLAY 'SYS202 WRITE ERROR !! '
              logger.info("SYS202 WRITE ERROR !! "); 
          }
      
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
      private void writeOutboundFile3() throws Exception {
      
// *---------------------------------------------------------------*
// * Writes outbound file (sys203)                                 *
// *---------------------------------------------------------------*
//  WRITE SYS203-OUTPUT-IPM-OTBND-REC FROM 800-CHIP-LIAB-VARIABLES
          sys203OutputIpmOtbndFile.write(chipLiabVariables800.toCharArray()); 
          sys203OutputIpmOtbndRec.setString(CONSTANTS.LOW_VALUE_215605977);
          work.setOutputOtbndFileStatus203(sys203OutputIpmOtbndFile.getStatusString() );
//  ADD 1 TO 400-IPM-RECORDS-PDS3
          work.setIpmRecordsPds3400(work.getIpmRecordsPds3400()+1);
//  IF 88-200-SYS203-STATUS-GOOD
//  ELSE
          if (!(work.isSys203StatusGood88200()) ) { 
//  DISPLAY 'SYS203 WRITE ERROR !! '
              logger.info("SYS203 WRITE ERROR !! "); 
          }
      
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
      private void writeOutboundFile4() throws Exception {
      
// *---------------------------------------------------------------*
// * Writes outbound file (sys204)                                 *
// *---------------------------------------------------------------*
//  WRITE SYS204-OUTPUT-IPM-OTBND-REC FROM 800-CHIP-LIAB-VARIABLES
          sys204OutputIpmOtbndFile.write(chipLiabVariables800.toCharArray()); 
          sys204OutputIpmOtbndRec.setString(CONSTANTS.LOW_VALUE_215605977);
          work.setOutputOtbndFileStatus204(sys204OutputIpmOtbndFile.getStatusString() );
//  ADD 1 TO 400-IPM-RECORDS-PDS4
          work.setIpmRecordsPds4400(work.getIpmRecordsPds4400()+1);
//  IF 88-200-SYS204-STATUS-GOOD
//  ELSE
          if (!(work.isSys204StatusGood88200()) ) { 
//  DISPLAY 'SYS204 WRITE ERROR !! '
              logger.info("SYS204 WRITE ERROR !! "); 
          }
      
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
      private void writeOutboundFile5() throws Exception {
      
// *---------------------------------------------------------------*
// * Writes outbound file (sys205)                                 *
// *---------------------------------------------------------------*
//  WRITE SYS205-OUTPUT-IPM-OTBND-REC FROM 800-CHIP-LIAB-VARIABLES
          sys205OutputIpmOtbndFile.write(chipLiabVariables800.toCharArray()); 
          sys205OutputIpmOtbndRec.setString(CONSTANTS.LOW_VALUE_215605977);
          work.setOutputOtbndFileStatus205(sys205OutputIpmOtbndFile.getStatusString() );
//  ADD 1 TO 400-IPM-RECORDS-PDS5
          work.setIpmRecordsPds5400(work.getIpmRecordsPds5400()+1);
//  IF 88-200-SYS205-STATUS-GOOD
//  ELSE
          if (!(work.isSys205StatusGood88200()) ) { 
//  DISPLAY 'SYS205 WRITE ERROR !! '
              logger.info("SYS205 WRITE ERROR !! "); 
          }
      
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
      private void writeOutboundFile6() throws Exception {
      
// *---------------------------------------------------------------*
// * Writes outbound file (sys206)                                 *
// *---------------------------------------------------------------*
//  WRITE SYS206-OUTPUT-IPM-OTBND-REC FROM 800-CHIP-LIAB-VARIABLES
          sys206OutputIpmOtbndFile.write(chipLiabVariables800.toCharArray()); 
          sys206OutputIpmOtbndRec.setString(CONSTANTS.LOW_VALUE_215605977);
          work.setOutputOtbndFileStatus206(sys206OutputIpmOtbndFile.getStatusString() );
//  ADD 1 TO 400-IPM-RECORDS-PDS6
          work.setIpmRecordsPds6400(work.getIpmRecordsPds6400()+1);
//  IF 88-200-SYS206-STATUS-GOOD
//  ELSE
          if (!(work.isSys206StatusGood88200()) ) { 
//  DISPLAY 'SYS206 WRITE ERROR !! '
              logger.info("SYS206 WRITE ERROR !! "); 
          }
      
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
      private void writeOutboundFile7() throws Exception {
			// Declare local variables used in the method
			Pds841800 pds841800 = pds841ValuesGroup800.getPds841800();
			// End of variable declaration

      
// *---------------------------------------------------------------*
// * Writes outbound file (sys207)                                 *
// *---------------------------------------------------------------*
          pds841800 = pds841ValuesGroup800.getPds841800();
//  IF ( 800-L1-CTL-MTI EQUAL '1442' ) AND ( 88-800-PDS841-1750-Y )
//  LITERAL_1442 = '1442'
          if ((compareChars(l1CtlValues800.getL1CtlMti800String(),CONSTANTS.LITERAL_1442) == 0) && ( pds841800.isPds8411750Y88800()  )) { 
//  WRITE SYS207-OUTPUT-IPM-OTBND-REC FROM 800-CHIP-LIAB-VARIABLES
              sys207OutputIpmOtbndFile.write(chipLiabVariables800.toCharArray()); 
              sys207OutputIpmOtbndRec.setString(CONSTANTS.LOW_VALUE_215605977);
              work.setOutputOtbndFileStatus207(sys207OutputIpmOtbndFile.getStatusString() );
//  ADD 1 TO 400-IPM-RECORDS-PDS7
              work.setIpmRecordsPds7400(work.getIpmRecordsPds7400()+1);
          }
  
//  IF 88-200-SYS207-STATUS-GOOD
//  ELSE
          if (!(work.isSys207StatusGood88200()) ) { 
//  DISPLAY 'SYS207 WRITE ERROR !! '
              logger.info("SYS207 WRITE ERROR !! "); 
          }
      
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
      private void extractFields() throws Exception {
			// Declare local variables used in the method
			Ip65504DeNamesLargeGroup1 ip65504DeNamesLargeGroup1 = ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1();
			Ip66102NormalIpmMsg ip66102NormalIpmMsg = ip66102IpmMsg.getIp66102NormalIpmMsg();
			char[] valueX300 = null;
			TxnAmt1800 txnAmt1800 = chipLiabVariables800.getTxnAmt1800();
			De0221800 de0221800 = chipLiabVariables800.getDe0221800();
			De0311800 de0311800 = chipLiabVariables800.getDe0311800();
			Ip00724Key ip00724Key = ip00724TableEntry.getIp00724Key();
			CbhRefNum1800 cbhRefNum1800 = chipLiabVariables800.getCbhRefNum1800();
			// End of variable declaration

      
// *-----------------------------------------------------------------
// * This paragraph extracts all the required values for the        *
// * output file.                                                   *
// *-----------------------------------------------------------------

// * Extract de002
//  MOVE ZEROES TO 800-TXN-PRIM-ACCT-NBR
          chipLiabVariables800.setTxnPrimAcctNbr800(CONSTANTS.ZERO_19);
          valueX300 = work.getValueX300();
//  IF IP65504-SEL-ELEM-ENT (02) EQUAL 300-VALUE-X
          if (		compareChars(ip65504SelElemEntriesAll.getIp65504SelElemEnt(1),valueX300) == 0 ) { 
              ip66102NormalIpmMsg = ip66102IpmMsg.getIp66102NormalIpmMsg();
//  IF IP66102-NORMAL-IPM-MSG ( IP65504-D02-PAN-NBR-S : IP65504-D02-PAN-NBR-L ) IS NUMERIC
              if (    isNumeric(substring(ip66102NormalIpmMsg.toCharArray(),(ip65504DeNamesLargeGroup1.getIp65504D02PanNbrS()-1), (ip65504DeNamesLargeGroup1.getIp65504D02PanNbrL() + (ip65504DeNamesLargeGroup1.getIp65504D02PanNbrS() - 1)) ))) { 
//  MOVE IP66102-NORMAL-IPM-MSG ( IP65504-D02-PAN-NBR-S : IP65504-D02-PAN-NBR-L ) TO 800-TXN-PRIM-ACCT-NBR
                  chipLiabVariables800.replace(ip66102IpmMsg/*parent*/,0+ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().getIp65504D02PanNbrS() - 1/*fromOffset - (txnPrimAcctNbr800) */,ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().getIp65504D02PanNbrL()/*fromLen*/,0/*toOffset - (ip66102NormalIpmMsg) */,19/*toLen*/);
              }
  
          }
  

// * Extract de004
          valueX300 = work.getValueX300();
//  IF IP65504-SEL-ELEM-ENT (04) EQUAL 300-VALUE-X
          if (		compareChars(ip65504SelElemEntriesAll.getIp65504SelElemEnt(3),valueX300) == 0 ) { 
              ip66102NormalIpmMsg = ip66102IpmMsg.getIp66102NormalIpmMsg();
//  IF IP66102-NORMAL-IPM-MSG ( IP65504-D04-TRX-AMT-S : IP65504-D04-TRX-AMT-L ) IS NUMERIC
              if (    isNumeric(substring(ip66102NormalIpmMsg.toCharArray(),(ip65504DeNamesLargeGroup1.getIp65504D04TrxAmtS()-1), (ip65504DeNamesLargeGroup1.getIp65504D04TrxAmtL() + (ip65504DeNamesLargeGroup1.getIp65504D04TrxAmtS() - 1)) ))) { 
//  MOVE IP66102-NORMAL-IPM-MSG ( IP65504-D04-TRX-AMT-S : IP65504-D04-TRX-AMT-L ) TO 800-TXN-AMT2
                  work.setTxnAmt2800(substring(ip66102IpmMsg.getIp66102NormalIpmMsg().toCharArray(),(ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().getIp65504D04TrxAmtS()-1), (ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().getIp65504D04TrxAmtL() + (ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().getIp65504D04TrxAmtS() - 1)) ));
                  // MOVE 800-TXN-AMT2 (1 : 10) TO 800-TXN-AMT
                  chipLiabVariables800.getTxnAmt1800().setTxnAmt800(work.getTxnAmt2800()/* txnAmt2800 */,0,10,0/* txnAmt800 */,chipLiabVariables800.getTxnAmt1800().getTxnAmt800().length);
  
                  // MOVE 800-TXN-AMT2 (11 : 2) TO 800-TXN-AMT-DEC
                  chipLiabVariables800.getTxnAmt1800().setTxnAmtDec800(work.getTxnAmt2800()/* txnAmt2800 */,10,2,0/* txnAmtDec800 */,chipLiabVariables800.getTxnAmt1800().getTxnAmtDec800().length);
  
              }
  
          }
  

// * Extract de022
          valueX300 = work.getValueX300();
//  IF IP65504-SEL-ELEM-ENT (22) EQUAL 300-VALUE-X
          if (		compareChars(ip65504SelElemEntriesAll.getIp65504SelElemEnt(21),valueX300) == 0 ) { 
//  MOVE IP66102-NORMAL-IPM-MSG ( IP65504-D22-POI-DCD-S : IP65504-D22-POI-DCD-L ) TO 800-DE022
              chipLiabVariables800.replace(ip66102IpmMsg/*parent*/,0+ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().getIp65504D22PoiDcdS() - 1/*fromOffset - (de022800) */,ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().getIp65504D22PoiDcdL()/*fromLen*/,344/*toOffset - (ip66102NormalIpmMsg) */,12/*toLen*/);
  
          }
  
//  ELSE
          else { 
//  MOVE SPACES TO 800-DE022
              de0221800.setDe022800(CONSTANTS.SPACE_12);
  
          }

// * Extract de031
          valueX300 = work.getValueX300();
//  IF IP65504-SEL-ELEM-ENT (31) EQUAL 300-VALUE-X
          if (		compareChars(ip65504SelElemEntriesAll.getIp65504SelElemEnt(30),valueX300) == 0 ) { 
//  MOVE IP66102-NORMAL-IPM-MSG ( IP65504-D31-ACQ-REF-S : IP65504-D31-ACQ-REF-L ) TO 800-DE031
              chipLiabVariables800.replace(ip66102IpmMsg/*parent*/,0+ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().getIp65504D31AcqRefS() - 1/*fromOffset - (de031800) */,ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup1().getIp65504D31AcqRefL()/*fromLen*/,296/*toOffset - (ip66102NormalIpmMsg) */,23/*toLen*/);
  
          }
  
//  ELSE
          else { 
//  MOVE SPACES TO 800-DE031
              de0311800.setDe031800(CONSTANTS.SPACE_23);
  
          }

// * Extract de049
          valueX300 = work.getValueX300();
//  IF IP65504-SEL-ELEM-ENT (49) = 300-VALUE-X
          if (		compareChars(ip65504SelElemEntriesAll.getIp65504SelElemEnt(48),valueX300) == 0 ) { 
//  MOVE IP66102-IPM-MSG ( IP65504-D49-TRX-CUR-S : IP65504-D49-TRX-CUR-L ) TO 800-TXN-CURR
              chipLiabVariables800.setTxnCurr800(substring(ip66102IpmMsg.getCharArray(),(ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup2().getIp65504D49TrxCurS()-1), (ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup2().getIp65504D49TrxCurL() + (ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup2().getIp65504D49TrxCurS() - 1)) ));
          }
  

// * Extract de94 value  outbound message
//  IF IP65504-SEL-ELEM-ENT (94) EQUAL 'X'
          if (ip65504SelElemEntriesAll.getIp65504SelElemEnt(93)[0] == 'X') { 
//  MOVE IP66102-NORMAL-IPM-MSG ( IP65504-D94-TRX-OID-S : IP65504-D94-TRX-OID-L ) TO 800-SNDR-MBR-ID IP00724-ICA
              try {
              chipLiabVariables800.replace(ip66102IpmMsg/*parent*/,0+ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup4().getIp65504D94TrxOidS() - 1/*fromOffset - (sndrMbrId800) */,ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup4().getIp65504D94TrxOidL()/*fromLen*/,20/*toOffset - (ip66102NormalIpmMsg) */,11/*toLen*/);
              } catch(NumberFormatException e) {}
              try {
              ip00724Key.setIp00724Ica(CFUtil.getLong(substring(ip66102IpmMsg.getIp66102NormalIpmMsg().toCharArray(),(ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup4().getIp65504D94TrxOidS()-1), (ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup4().getIp65504D94TrxOidL() + (ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup4().getIp65504D94TrxOidS() - 1)) )));
              } catch(NumberFormatException e) {}
  
//  CALL 800-PTR-IP281010
              // CALL 800-PTR-IP281010
              	this.setRc( ip281010.process());
//  IF 88-IP00724-ENTRY-FOUND-Y
              if ( ip00724EntryFoundYGroup.isIp00724EntryFoundY88()  ) { 
//  MOVE IP00724-MEMBER-NAME TO 800-CUST-NAME
                  chipLiabVariables800.setCustName800(ip00724TableEntry.getIp00724MemberName());
//  INSPECT 800-CUST-NAME REPLACING ALL ',' BY SPACE
                  chipLiabVariables800.setCustName800(  replaceAll(chipLiabVariables800.getCustName800(),CONSTANTS.LITERAL_34072,CONSTANTS.SPACE)  );
//  MOVE IP00724-COUNTRY-CODE TO 800-COUNTRY-CODE
                  chipLiabVariables800.setCountryCode800(ip00724TableEntry.getIp00724CountryCode());
//  PERFORM 8000-GET-REGION-NAME
                  getRegionName();/*8000-GET-REGION-NAME*/
              }
//  ELSE
          }
//  ELSE
          else { 
//  MOVE ZEROES TO 800-SNDR-MBR-ID
              chipLiabVariables800.setSndrMbrId800(CONSTANTS.ZERO_11);
          }

// * Extract de95 value  outbound message
          valueX300 = work.getValueX300();
//  IF IP65504-SEL-ELEM-ENT (95) EQUAL 300-VALUE-X
          if (		compareChars(ip65504SelElemEntriesAll.getIp65504SelElemEnt(94),valueX300) == 0 ) { 
//  MOVE IP66102-NORMAL-IPM-MSG ( IP65504-D95-CARD-IS-S : IP65504-D95-CARD-IS-L ) TO 800-CBH-REF-NUM
              chipLiabVariables800.replace(ip66102IpmMsg/*parent*/,0+ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup4().getIp65504D95CardIsS() - 1/*fromOffset - (cbhRefNum800) */,ip65504DeMapGroup.getIp65504DeNames().getIp65504DeNamesLargeGroup4().getIp65504D95CardIsL()/*fromLen*/,322/*toOffset - (ip66102NormalIpmMsg) */,10/*toLen*/);
  
          }
  
//  ELSE
          else { 
//  MOVE ZEROES TO 800-CBH-REF-NUM
              cbhRefNum1800.setCbhRefNum800(CONSTANTS.ZERO_10);
  
          }

// * Extract de95 value  outbound message
          valueX300 = work.getValueX300();
//  IF IP65504-SEL-ELEM-ENT (95) EQUAL 300-VALUE-X
          if (		compareChars(ip65504SelElemEntriesAll.getIp65504SelElemEnt(94),valueX300) == 0 ) { 
//  MOVE IP08101-PROCESS-DATE TO 800-CBH-DATE
              chipLiabVariables800.setCbhDate800(String.valueOf(ip08101RunControlRecord.getIp08101ProcessDateString()).toCharArray());
          }
  
//  ELSE
          else { 
//  MOVE ZEROES TO 800-CBH-DATE
              chipLiabVariables800.setCbhDate800(CONSTANTS.ZERO_8);
          }
      
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
      private void closeFiles() throws Exception {
			// Declare local variables used in the method
			BigDecimal tempDecimal = BigDecimal.ZERO;
			// End of variable declaration

      
// *-----------------------------------------------------------------
//  MOVE 400-IPM-COUNT-READ-CNT TO 600-SYS001-COUNT
//  FORMAT_1977136933 = "ZZ,ZZZ,ZZ9"
          sys001RecordCount600.setSys001Count600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1977136933,String.valueOf(work.getIpmCountReadCnt400()).toCharArray()));
//  MOVE 400-IPM-RECORDS-PDS1 TO 600-SYS201-COUNT
//  FORMAT_1977136933 = "ZZ,ZZZ,ZZ9"
          sys201RecordCount600.setSys201Count600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1977136933,String.valueOf(work.getIpmRecordsPds1400()).toCharArray()));
//  MOVE 400-IPM-RECORDS-PDS2 TO 600-SYS202-COUNT
//  FORMAT_1977136933 = "ZZ,ZZZ,ZZ9"
          sys202RecordCount600.setSys202Count600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1977136933,String.valueOf(work.getIpmRecordsPds2400()).toCharArray()));
//  MOVE 400-IPM-RECORDS-PDS3 TO 600-SYS203-COUNT
//  FORMAT_1977136933 = "ZZ,ZZZ,ZZ9"
          sys203RecordCount600.setSys203Count600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1977136933,String.valueOf(work.getIpmRecordsPds3400()).toCharArray()));
//  MOVE 400-IPM-RECORDS-PDS4 TO 600-SYS204-COUNT
//  FORMAT_1977136933 = "ZZ,ZZZ,ZZ9"
          sys204RecordCount600.setSys204Count600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1977136933,String.valueOf(work.getIpmRecordsPds4400()).toCharArray()));
//  MOVE 400-IPM-RECORDS-PDS5 TO 600-SYS205-COUNT
//  FORMAT_1977136933 = "ZZ,ZZZ,ZZ9"
          sys205RecordCount600.setSys205Count600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1977136933,String.valueOf(work.getIpmRecordsPds5400()).toCharArray()));
//  MOVE 400-IPM-RECORDS-PDS6 TO 600-SYS206-COUNT
//  FORMAT_1977136933 = "ZZ,ZZZ,ZZ9"
          sys206RecordCount600.setSys206Count600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1977136933,String.valueOf(work.getIpmRecordsPds6400()).toCharArray()));
//  MOVE 400-IPM-RECORDS-PDS7 TO 600-SYS207-COUNT
//  FORMAT_1977136933 = "ZZ,ZZZ,ZZ9"
          sys207RecordCount600.setSys207Count600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1977136933,String.valueOf(work.getIpmRecordsPds7400()).toCharArray()));
//  MOVE 800-TRANS-AMOUNT TO 600-SYS209-COUNT
          work.setSys209Count600(BigDecimal.valueOf(work.getTransAmount800()));
//  MOVE 800-AMT-E1848 TO 600-SYS210-COUNT
          work.setSys210Count600(BigDecimal.valueOf(work.getAmtE1848800()));
//  MOVE 800-AMT-E1849 TO 600-SYS211-COUNT
          work.setSys211Count600(BigDecimal.valueOf(work.getAmtE1849800()));
//  MOVE 800-AMT-E1850 TO 600-SYS212-COUNT
          work.setSys212Count600(BigDecimal.valueOf(work.getAmtE1850800()));
//  MOVE 800-AMT-E1851 TO 600-SYS213-COUNT
          work.setSys213Count600(BigDecimal.valueOf(work.getAmtE1851800()));
//  MOVE 800-AMT-E1852 TO 600-SYS214-COUNT
          work.setSys214Count600(BigDecimal.valueOf(work.getAmtE1852800()));
//  MOVE 800-AMT-E1754 TO 600-SYS215-COUNT
          work.setSys215Count600(BigDecimal.valueOf(work.getAmtE1754800()));
//  MOVE 800-AMT-E1750 TO 600-SYS216-COUNT
          work.setSys216Count600(BigDecimal.valueOf(work.getAmtE1750800()));
//  DIVIDE 600-SYS209-COUNT BY 100 GIVING 600-SYS209-COUNT1
          sys209RecordCount600.setSys209Count1600(CFUtil.cobolNumberFormatter("9999999999.99", String.valueOf(work.getSys209Count600().divide(BigDecimal.valueOf(100),0,RoundingMode.DOWN).intValue())).toCharArray());
//  DIVIDE 600-SYS210-COUNT BY 100 GIVING 600-SYS210-COUNT1
          sys210RecordCount600.setSys210Count1600(CFUtil.cobolNumberFormatter("9999999999.99", String.valueOf(work.getSys210Count600().divide(BigDecimal.valueOf(100),0,RoundingMode.DOWN).intValue())).toCharArray());
//  DIVIDE 600-SYS211-COUNT BY 100 GIVING 600-SYS211-COUNT1
          sys211RecordCount600.setSys211Count1600(CFUtil.cobolNumberFormatter("9999999999.99", String.valueOf(work.getSys211Count600().divide(BigDecimal.valueOf(100),0,RoundingMode.DOWN).intValue())).toCharArray());
//  DIVIDE 600-SYS212-COUNT BY 100 GIVING 600-SYS212-COUNT1
          sys212RecordCount600.setSys212Count1600(CFUtil.cobolNumberFormatter("9999999999.99", String.valueOf(work.getSys212Count600().divide(BigDecimal.valueOf(100),0,RoundingMode.DOWN).intValue())).toCharArray());
//  DIVIDE 600-SYS213-COUNT BY 100 GIVING 600-SYS213-COUNT1
          sys213RecordCount600.setSys213Count1600(CFUtil.cobolNumberFormatter("9999999999.99", String.valueOf(work.getSys213Count600().divide(BigDecimal.valueOf(100),0,RoundingMode.DOWN).intValue())).toCharArray());
//  DIVIDE 600-SYS214-COUNT BY 100 GIVING 600-SYS214-COUNT1
          sys214RecordCount600.setSys214Count1600(CFUtil.cobolNumberFormatter("9999999999.99", String.valueOf(work.getSys214Count600().divide(BigDecimal.valueOf(100),0,RoundingMode.DOWN).intValue())).toCharArray());
//  DIVIDE 600-SYS215-COUNT BY 100 GIVING 600-SYS215-COUNT1
          sys215RecordCount600.setSys215Count1600(CFUtil.cobolNumberFormatter("9999999999.99", String.valueOf(work.getSys215Count600().divide(BigDecimal.valueOf(100),0,RoundingMode.DOWN).intValue())).toCharArray());
//  DIVIDE 600-SYS216-COUNT BY 100 GIVING 600-SYS216-COUNT1
          sys216RecordCount600.setSys216Count1600(CFUtil.cobolNumberFormatter("9999999999.99", String.valueOf(work.getSys216Count600().divide(BigDecimal.valueOf(100),0,RoundingMode.DOWN).intValue())).toCharArray());
//  DISPLAY 600-SYS001-RECORD-COUNT
          logger.info(sys001RecordCount600.toString()); 
//  DISPLAY 600-SYS201-RECORD-COUNT
          logger.info(sys201RecordCount600.toString()); 
//  DISPLAY 600-SYS202-RECORD-COUNT
          logger.info(sys202RecordCount600.toString()); 
//  DISPLAY 600-SYS203-RECORD-COUNT
          logger.info(sys203RecordCount600.toString()); 
//  DISPLAY 600-SYS204-RECORD-COUNT
          logger.info(sys204RecordCount600.toString()); 
//  DISPLAY 600-SYS205-RECORD-COUNT
          logger.info(sys205RecordCount600.toString()); 
//  DISPLAY 600-SYS206-RECORD-COUNT
          logger.info(sys206RecordCount600.toString()); 
//  DISPLAY 600-SYS207-RECORD-COUNT
          logger.info(sys207RecordCount600.toString()); 
//  DISPLAY 600-SYS210-RECORD-COUNT
          logger.info(sys210RecordCount600.toString()); 
//  DISPLAY 600-SYS211-RECORD-COUNT
          logger.info(sys211RecordCount600.toString()); 
//  DISPLAY 600-SYS212-RECORD-COUNT
          logger.info(sys212RecordCount600.toString()); 
//  DISPLAY 600-SYS213-RECORD-COUNT
          logger.info(sys213RecordCount600.toString()); 
//  DISPLAY 600-SYS214-RECORD-COUNT
          logger.info(sys214RecordCount600.toString()); 
//  DISPLAY 600-SYS215-RECORD-COUNT
          logger.info(sys215RecordCount600.toString()); 
//  DISPLAY 600-SYS216-RECORD-COUNT
          logger.info(sys216RecordCount600.toString()); 
//  DISPLAY 600-SYS209-RECORD-COUNT
          logger.info(sys209RecordCount600.toString()); 
//  PERFORM 3100-CLOSE-INPUT-IPM-OUTBOUND
          closeInputIpmOutbound();/*3100-CLOSE-INPUT-IPM-OUTBOUND*/
//  PERFORM 3200-CLOSE-OUTPUT-IPM-OUTBOUND
          closeOutputIpmOutbound();/*3200-CLOSE-OUTPUT-IPM-OUTBOUND*/
          ;
      
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
      private void closeInputIpmOutbound() throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph closes input ipm outbound file and checks for the*
// *file status if it is not good it performs terminate process     *
// *-----------------------------------------------------------------
//  PERFORM 8200-CLOSE-SYS001
          closeSys001();/*8200-CLOSE-SYS001*/
//  IF 88-200-SYS001-STATUS-GOOD
//  ELSE
          if (!(work.isSys001StatusGood88200()) ) { 
//  SET 88-600-INPUT-FILE-CLOS-ERR-TXT TO TRUE
              inputOutboundErrMsgTxt600.setInputFileClosErrTxt88600True(); 
              
//  MOVE 200-SYS001-FILE-STATUS TO 600-INPUT-OTBND-FILE-STATUS
              inputOutboundErrMsgTxt600.setInputOtbndFileStatus600(work.getSys001FileStatus200());
//  MOVE 300-PARA-3100 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara3100300());
//  MOVE 300-SYS001-CLOSE-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getSys001CloseAbendCode300());
              // MOVE 600-INPUT-OUTBOUND-ERR-MSG-TXT TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(inputOutboundErrMsgTxt600.toCharArray());
//  PERFORM 9000-TERMINATE-PROCESS
              terminateProcess();/*9000-TERMINATE-PROCESS*/
          }
      
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
      private void closeOutputIpmOutbound() throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph closes scrubbed ipm outbound file and checks for *
// * the file status if it is not good it performs terminate process*
// *-----------------------------------------------------------------
//  PERFORM 8300-CLOSE-SYS201
          closeSys201();/*8300-CLOSE-SYS201*/
//  IF 88-200-SYS201-STATUS-GOOD
//  ELSE
          if (!(work.isSys201StatusGood88200()) ) { 
//  SET 88-600-OUTPUT-CLOSE-ERR-TXT TO TRUE
              outputOtbndErrMsgTxt600.setOutputCloseErrTxt88600True(); 
              
//  MOVE 201-OUTPUT-OTBND-FILE-STATUS TO 600-OUTPUT-OTBND-FILE-STATUS
              outputOtbndErrMsgTxt600.setOutputOtbndFileStatus600(work.getOutputOtbndFileStatus201());
//  MOVE 300-PARA-3200 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara3200300());
//  MOVE 300-SYS201-CLOSE-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(work.getSys201CloseAbendCode300());
              // MOVE 600-OUTPUT-OTBND-ERR-MSG-TXT TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(outputOtbndErrMsgTxt600.toCharArray());
//  PERFORM 9000-TERMINATE-PROCESS
              terminateProcess();/*9000-TERMINATE-PROCESS*/
          }
      
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
      private void getRegionName() throws Exception {
			// Declare local variables used in the method
			Ip00724Ichg ip00724Ichg = ip00724TableEntry.getIp00724Ichg();
			char[] ip00724IchgRegion = null;
			// End of variable declaration

      
// *---------------------------------------------------------------*
// * This para will add the region name to the output file based on*
// * the region from table#72                                      *
// *---------------------------------------------------------------*
          ip00724IchgRegion = ip00724Ichg.getIp00724IchgRegion();
//  EVALUATE TRUE
          if  (compareChars(ip00724IchgRegion, CONSTANTS.LITERAL_A) == 0) { 
//  MOVE 600-REGION-A TO 800-REGION
              chipLiabVariables800.setRegion800(work.getRegionA600());
          }
          else if  (compareChars(ip00724IchgRegion, CONSTANTS.LITERAL_B) == 0) { 
//  MOVE 600-REGION-B TO 800-REGION
              chipLiabVariables800.setRegion800(work.getRegionB600());
          }
          else if  (compareChars(ip00724IchgRegion, CONSTANTS.LITERAL_C) == 0) { 
//  MOVE 600-REGION-C TO 800-REGION
              chipLiabVariables800.setRegion800(work.getRegionC600());
          }
          else if  (compareChars(ip00724IchgRegion, CONSTANTS.LITERAL_D) == 0) { 
//  MOVE 600-REGION-D TO 800-REGION
              chipLiabVariables800.setRegion800(work.getRegionD600());
          }
          else if  (compareChars(ip00724IchgRegion, CONSTANTS.LITERAL_E) == 0) { 
//  MOVE 600-REGION-E TO 800-REGION
              chipLiabVariables800.setRegion800(work.getRegionE600());
          }
          else if  (compareChars(ip00724IchgRegion, CONSTANTS.LITERAL_1) == 0) { 
//  MOVE 600-REGION-1 TO 800-REGION
              chipLiabVariables800.setRegion800(work.getRegion1600());
          }
          else   { 
              ;
          }
  
      
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
      private void readInputOutboundFile() throws Exception {
      
// *-----------------------------------------------------------------
// * This paragraph reads unscrubbed ipm outbound file              *
// *-----------------------------------------------------------------
//  READ SYS001-INPUT-IPM-OUTBOUND-FILE
          	sys001InputIpmOutboundFile.read();
          work.setIpmOutbndUnscrubRdw400(sys001InputIpmOutboundFile.getRecLen());
          work.setSys001FileStatus200(sys001InputIpmOutboundFile.getStatusString() );
          if (!sys001InputIpmOutboundFile.hasEnded()) {
          	sys001InputIpmOutboundRec.setString(sys001InputIpmOutboundFile.getRecord());
          }
//  IF 88-200-SYS001-STATUS-GOOD
          if ( work.isSys001StatusGood88200()  ) { 
//  MOVE SYS001-INPUT-IPM-OUTBOUND-REC TO IP30671-OUTBOUND-MESSAGE-AREA (1 : 400-IPM-OUTBND-UNSCRUB-RDW )
              ip30671OutboundMessageArea.replace(sys001InputIpmOutboundRec.getCharArray(),0,sys001InputIpmOutboundRec.length(),0,work.getIpmOutbndUnscrubRdw400() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  SET 88-100-IT-IS-NOT-FIRST-TIME TO TRUE
              work.setItIsNotFirstTime88100True(); 
              
//  ADD 300-VALUE-ONE TO 400-IPM-COUNT-READ-CNT
              work.setIpmCountReadCnt400(work.getIpmCountReadCnt400()+work.getValueOne300());
          }
//  ELSE
          else { 
//  IF 88-200-SYS001-END-OF-FILE
              if ( work.isSys001EndOfFile88200()  ) { 
//  IF 88-100-IT-IS-FIRST-TIME
                  if ( work.isItIsFirstTime88100()  ) { 
//  SET 88-600-INPUT-FILE-EMTY-ERR-TXT TO TRUE
                      inputOutboundErrMsgTxt600.setInputFileEmtyErrTxt88600True(); 
                      
                  }
              }
//  ELSE
              else { 
//  SET 88-600-INPUT-FILE-READ-ERR-TXT TO TRUE
                  inputOutboundErrMsgTxt600.setInputFileReadErrTxt88600True(); 
                  
//  MOVE 200-SYS001-FILE-STATUS TO 600-INPUT-OTBND-FILE-STATUS
                  inputOutboundErrMsgTxt600.setInputOtbndFileStatus600(work.getSys001FileStatus200());
//  MOVE 300-PARA-8100 TO 900-ABEND-PARA
                  abendParaName900.setAbendPara900(work.getPara8100300());
//  MOVE 300-SYS001-READ-ABEND-CODE TO 900-ABEND-CODE
                  abendMessage900.setAbendCode900(work.getSys001ReadAbendCode300());
                  // MOVE 600-INPUT-OUTBOUND-ERR-MSG-TXT TO 900-ABEND-TEXT
                  abendMessage900.setAbendText900(inputOutboundErrMsgTxt600.toCharArray());
//  PERFORM 8200-CLOSE-SYS001
                  closeSys001();/*8200-CLOSE-SYS001*/
//  IF 88-100-SYS201-IS-OPEN
                  if ( work.isSys201IsOpen88100()  ) { 
//  PERFORM 8300-CLOSE-SYS201
                      closeSys201();/*8300-CLOSE-SYS201*/
                  }
//  PERFORM 9000-TERMINATE-PROCESS
                  terminateProcess();/*9000-TERMINATE-PROCESS*/
              }
          }
      
      }
      /**
      * closeSys001 
      *   This method is derived from 
  *   COBOL Paragraph - 8200-CLOSE-SYS001 COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void closeSys001() throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph closes input ipm outbound                        *
// *-----------------------------------------------------------------
//  CLOSE SYS001-INPUT-IPM-OUTBOUND-FILE
          sys001InputIpmOutboundFile.close(); 
          work.setSys001FileStatus200(sys001InputIpmOutboundFile.getStatusString() );
      
      }
      /**
      * closeSys201 
      *   This method is derived from 
  *   COBOL Paragraph - 8300-CLOSE-SYS201 COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void closeSys201() throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph closes scrubbed ipm outbound file                *
// *-----------------------------------------------------------------
//  CLOSE SYS201-OUTPUT-IPM-OTBND-FILE
          sys201OutputIpmOtbndFile.close(); 
          work.setOutputOtbndFileStatus201(sys201OutputIpmOtbndFile.getStatusString() );
//  CLOSE SYS202-OUTPUT-IPM-OTBND-FILE
          sys202OutputIpmOtbndFile.close(); 
          work.setOutputOtbndFileStatus202(sys202OutputIpmOtbndFile.getStatusString() );
//  CLOSE SYS203-OUTPUT-IPM-OTBND-FILE
          sys203OutputIpmOtbndFile.close(); 
          work.setOutputOtbndFileStatus203(sys203OutputIpmOtbndFile.getStatusString() );
//  CLOSE SYS204-OUTPUT-IPM-OTBND-FILE
          sys204OutputIpmOtbndFile.close(); 
          work.setOutputOtbndFileStatus204(sys204OutputIpmOtbndFile.getStatusString() );
//  CLOSE SYS205-OUTPUT-IPM-OTBND-FILE
          sys205OutputIpmOtbndFile.close(); 
          work.setOutputOtbndFileStatus205(sys205OutputIpmOtbndFile.getStatusString() );
//  CLOSE SYS206-OUTPUT-IPM-OTBND-FILE
          sys206OutputIpmOtbndFile.close(); 
          work.setOutputOtbndFileStatus206(sys206OutputIpmOtbndFile.getStatusString() );
//  CLOSE SYS207-OUTPUT-IPM-OTBND-FILE
          sys207OutputIpmOtbndFile.close(); 
          work.setOutputOtbndFileStatus207(sys207OutputIpmOtbndFile.getStatusString() );
      
      }
      /**
      * closeSys012 
      *   This method is derived from 
  *   COBOL Paragraph - 8400-CLOSE-SYS012 COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void closeSys012() throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph closes run control file                          *
// *-----------------------------------------------------------------
//  CLOSE SYS012-RUN-CONTROL-FILE
          sys012RunControlFile.close(); 
          work.setSys012FileStatus200(sys012RunControlFile.getStatusString() );
      
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
      private void terminateProcess() throws Exception {
      
// *----------------------------------------------------------------
// *This paragraph displays abend messages                         *
// *----------------------------------------------------------------
//  DISPLAY 400-OUTPUT-OUTBOUND-EXTR-COUNT
          logger.info(String.valueOf(work.getOutputOutboundExtrCount400())); 
//  DISPLAY 400-OUTPUT-OUTBOUND-EXTR-CNT2
          logger.info(String.valueOf(work.getOutputOutboundExtrCnt2400())); 
//  MOVE 300-PGM-ID TO IP60001-HOLD-PGM-NAME
          ip60001EventLogWorkArea.setIp60001HoldPgmName(work.getPgmId300());
//  MOVE 900-ABEND-CODE TO IP60001-EVENT-ERROR-CODE
          ip60001EventLogWorkArea.setIp60001EventErrorCode(abendMessage900.getAbendCode900());
          // MOVE 900-ABEND-MESSAGE TO IP60001-EVENT-ERROR-MSG
          ip60001EventLogWorkArea.setIp60001EventErrorMsg(abendMessage900.toCharArray());
//  DISPLAY 600-DISPLAY-ABEND-MSG-TXT
          logger.info(new String(work.getDisplayAbendMsgTxt600())); 
//  DISPLAY 900-ABEND-PARA-NAME
          logger.info(abendParaName900.toString()); 
//  DISPLAY 900-ABEND-MESSAGE
          logger.info(abendMessage900.toString()); 
//  CALL 800-ABEND-PTR
          // CALL 800-ABEND-PTR
          	this.setRc( ip610010.process());
      
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
          if(!isInitDone()) {
          	this.setRc(0);
          	setInitDone(true);
          }
        CFUtil.resetDecimalAsComma();
       }
  
  
  
  
  
  
  }
