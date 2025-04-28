  package com.cloudframe.app.process;
  /* 
* element ip989010 as of 06/21/21 09:43:58                    [vc]
******************************************************************
*          -- -- -- c o n f i d e n t i a l -- -- --
*    this item contains information and procedures which are
*    proprietary to mastercard international, incorporated, and
*    which are confidential.  it is provided with the express
*    understanding that it is to be used only for the benefit of
*    interbank card association, and is not to be used, copied, or
*    disclosed for any other purpose.  any authorized reproduction
*    (in whole or in part) of this material must be marked with
*    this legend.
******************************************************************
* program functionality:
******************************************************************
*
* ipm formatter
*
* this program reads in a purchase file and a registration file
* and caluclates the donation amount and creates an output file in
* in several different formats depending upon jcl parms passed.
*
*
* files used:
* sys001 - input purchase file
* sys002 - input registration file
* sys003 - default data elements file(ccip9899)
* sys004 - default data elements file(ccip1696)
* sys005 - brand product ird list
* sys101 - output xml file
* sys201 - output pseudo ipm file
* sys202 - output file id's file
* sys203 - output ipm file (written by write parser ip666010)
* sys204 - audit file
*=================================================================
* revision history log :
*=================================================================
* project     : mastercard purchase with purpose
* date        : 2012-23-07
* version     : 001.00
* programmer  : daniel samuel
* modification: initial program.
*=================================================================
* project            :gcms release 21q4 pbi45784                 *
* date               :2021/10/16                                 *
* programmer         :shankar subramanian                        *
* modification       :included copybook ip004005                 *
*----------------------------------------------------------------*
*/
  
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.ip989010.file.*;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import org.springframework.web.bind.annotation.RequestParam;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.utility.CFUtil;
  import org.springframework.beans.factory.annotation.Value;
  import com.cloudframe.app.process.Ip996010;
  import com.cloudframe.app.ip989010.dto.ParmData1000;
  import com.cloudframe.app.ip989010.file.records.Sys004TagData;
  import com.cloudframe.app.ip989010.dto.NewElemData800;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.ip989010.dto.CurrentDate800;
  import com.cloudframe.app.global.sharedvar.Ip67002DateRedefined02;
  import com.cloudframe.app.global.sharedvar.Ip67002Ccyyddd;
  import com.cloudframe.app.ip989010.dto.ComnTagKey500;
  import java.util.Random;
  import java.math.BigDecimal;
  import com.cloudframe.app.ip989010.dto.RandomX800;
  import com.cloudframe.app.global.sharedvar.Ip00404ArRangeGrp;
  import com.cloudframe.app.process.Ip280010;
  import com.cloudframe.app.ip989010.dto.CurDtYymmdd800;
  import com.cloudframe.app.ip989010.dto.De31S1S2S3S4800;
  import com.cloudframe.app.ip989010.dto.De31800;
  import com.cloudframe.app.ip989010.dto.LuhnsWorkArea800;
  import com.cloudframe.app.ip989010.dto.EvenValue800;
  import java.util.ArrayList;
  import java.util.Map;
  import java.util.HashMap;
  import com.cloudframe.app.ip989010.dto.Tag800;
  import com.cloudframe.app.process.Ip666010;
  import com.cloudframe.app.process.Ip670010;
  import com.cloudframe.app.process.Ip610010;
  import com.cloudframe.app.global.sharedvar.Ip66601UserTagTable;
  import com.cloudframe.app.ip989010.dto.*;
  import com.cloudframe.app.ip989010.dto.WorkAreas800;
  import com.cloudframe.app.ip989010.dto.Parms1000;
  import com.cloudframe.app.ip989010.file.records.Sys201OutRec;
  import com.cloudframe.app.ip989010.file.records.Sys002InRec;
  import com.cloudframe.app.ip989010.file.records.Sys204OutRec;
  import com.cloudframe.app.ip989010.file.records.Sys205OutRec;
  import com.cloudframe.app.ip989010.file.records.Sys005InRec;
  import com.cloudframe.app.ip989010.dto.Ip98901PaymentFileData;
  import com.cloudframe.app.ip989010.dto.Sys002Table500;
  import com.cloudframe.app.ip989010.dto.TotalRecsReadMsg600;
  import com.cloudframe.app.ip989010.dto.MsgStrTag300;
  import com.cloudframe.app.ip989010.dto.ErrorMsg6003002;
  import com.cloudframe.app.ip989010.dto.ErrorMsg6003005;
  import com.cloudframe.app.ip989010.dto.ErrorMsg6003009;
  import com.cloudframe.app.ip989010.dto.ErrorMsg6003006;
  import com.cloudframe.app.ip989010.file.records.Sys202OutRec;
  import com.cloudframe.app.ip989010.file.records.Sys003InRec;
  import com.cloudframe.app.ip989010.dto.ErrorMsg6003004;
  import com.cloudframe.app.ip989010.dto.AbendParaName900;
  import com.cloudframe.app.ip989010.dto.Ip9890hPaymentFileData;
  import com.cloudframe.app.ip989010.dto.PdsStrTag300;
  import com.cloudframe.app.ip989010.dto.DeStrTag300;
  import com.cloudframe.app.ip989010.dto.Sys005Table502;
  import com.cloudframe.app.ip989010.file.records.Sys101OutRec;
  import com.cloudframe.app.ip989010.dto.Ip98902RegistrationFileData;
  import com.cloudframe.app.ip989010.dto.ErrorMsg6003014;
  import com.cloudframe.app.ip989010.dto.AbendMessage900;
  import com.cloudframe.app.ip989010.dto.DetailText600;
  import com.cloudframe.app.ip989010.dto.Ip16911RewardFileIdRecord;
  import com.cloudframe.app.ip989010.dto.ErrorMsg6003003;
  import com.cloudframe.app.ip989010.file.records.Sys004InRec;
  import com.cloudframe.app.ip989010.file.records.Sys001InRec;
  import com.cloudframe.app.ip989010.dto.TotalRecsWrittenMsg600;
  import com.cloudframe.app.ip989010.dto.ErrorMsg6003008;
  import com.cloudframe.app.ip989010.dto.Sys201CntGroup400;
  import com.cloudframe.app.global.sharedvar.Ip16901RewardsParm;
  import com.cloudframe.app.global.sharedvar.Ip16901EntryFoundYGroup;
  import com.cloudframe.app.global.sharedvar.Ip66601UserTagInformation;
  import com.cloudframe.app.global.sharedvar.Ip66102IpmMsg;
  import com.cloudframe.app.global.sharedvar.Ip66102IpmFileInformation;
  import com.cloudframe.app.global.sharedvar.Ip66605MessageInfo;
  import com.cloudframe.app.global.sharedvar.Ip67002DateParm;
  import com.cloudframe.app.global.sharedvar.Ip00404Table;
  import com.cloudframe.app.global.sharedvar.PtrIp280010Group800;
  import com.cloudframe.app.global.sharedvar.Ip996011ProgramStartMessage;
  import com.cloudframe.app.ip989010.dto.ComnElementsTable500;
  import com.cloudframe.app.ip989010.dto.ElementsTable5001240200;
  import com.cloudframe.app.ip989010.dto.ElementsTable5001644695;
  import com.cloudframe.app.ip989010.dto.ElementsTable5001644697;
  import com.cloudframe.app.ip989010.dto.DisplayTable501;
  import com.cloudframe.app.ip989010.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("ip989010")
  
  public class Ip989010 extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Ip989010.class);
  
  private WorkAreas800 workAreas800 = new WorkAreas800() ;
  private Parms1000 parms1000 = new Parms1000() ;
  private Sys201OutRec sys201OutRec = new Sys201OutRec() ;
  private Sys002InRec sys002InRec = new Sys002InRec() ;
  private Sys204OutRec sys204OutRec = new Sys204OutRec() ;
  private Sys205OutRec sys205OutRec = new Sys205OutRec() ;
  private Sys005InRec sys005InRec = new Sys005InRec() ;
  private Ip98901PaymentFileData ip98901PaymentFileData = new Ip98901PaymentFileData() ;
  private Sys002Table500 sys002Table500 = new Sys002Table500() ;
  private TotalRecsReadMsg600 totalRecsReadMsg600 = new TotalRecsReadMsg600() ;
  private MsgStrTag300 msgStrTag300 = new MsgStrTag300() ;
  private ErrorMsg6003002 errorMsg6003002 = new ErrorMsg6003002() ;
  private ErrorMsg6003005 errorMsg6003005 = new ErrorMsg6003005() ;
  private ErrorMsg6003009 errorMsg6003009 = new ErrorMsg6003009() ;
  private ErrorMsg6003006 errorMsg6003006 = new ErrorMsg6003006() ;
  private Sys202OutRec sys202OutRec = new Sys202OutRec() ;
  private Sys003InRec sys003InRec = new Sys003InRec() ;
  private ErrorMsg6003004 errorMsg6003004 = new ErrorMsg6003004() ;
  private AbendParaName900 abendParaName900 = new AbendParaName900() ;
  private Ip9890hPaymentFileData ip9890hPaymentFileData = new Ip9890hPaymentFileData() ;
  private PdsStrTag300 pdsStrTag300 = new PdsStrTag300() ;
  private DeStrTag300 deStrTag300 = new DeStrTag300() ;
  private Sys005Table502 sys005Table502 = new Sys005Table502() ;
  private Sys101OutRec sys101OutRec = new Sys101OutRec() ;
  private Ip98902RegistrationFileData ip98902RegistrationFileData = new Ip98902RegistrationFileData() ;
  private ErrorMsg6003014 errorMsg6003014 = new ErrorMsg6003014() ;
  private AbendMessage900 abendMessage900 = new AbendMessage900() ;
  private DetailText600 detailText600 = new DetailText600() ;
  private Ip16911RewardFileIdRecord ip16911RewardFileIdRecord = new Ip16911RewardFileIdRecord() ;
  private ErrorMsg6003003 errorMsg6003003 = new ErrorMsg6003003() ;
  private Sys004InRec sys004InRec = new Sys004InRec() ;
  private Sys001InRec sys001InRec = new Sys001InRec() ;
  private TotalRecsWrittenMsg600 totalRecsWrittenMsg600 = new TotalRecsWrittenMsg600() ;
  private ErrorMsg6003008 errorMsg6003008 = new ErrorMsg6003008() ;
  private Sys201CntGroup400 sys201CntGroup400 = new Sys201CntGroup400() ;
  private ComnElementsTable500 comnElementsTable500 = new ComnElementsTable500() ;
  private ElementsTable5001240200 elementsTable5001240200 = new ElementsTable5001240200() ;
  private ElementsTable5001644695 elementsTable5001644695 = new ElementsTable5001644695() ;
  private ElementsTable5001644697 elementsTable5001644697 = new ElementsTable5001644697() ;
  private DisplayTable501 displayTable501 = new DisplayTable501() ;
  private Work work = new Work() ;
  
  @Value("${timeZoneId:Etc/GMT}")
  private String timeZoneId;
  
  
  @Autowired 
  @Qualifier("ip989010_sys004In")
  Sys004In sys004In;
  @Autowired 
  @Qualifier("ip989010_sys002In")
  Sys002In sys002In;
  @Autowired 
  @Qualifier("ip989010_sys005In")
  Sys005In sys005In;
  @Autowired 
  @Qualifier("ip989010_sys001In")
  Sys001In sys001In;
  @Autowired 
  @Qualifier("ip989010_sys003In")
  Sys003In sys003In;
  @Autowired 
  @Qualifier("ip989010_sys101Out")
  Sys101Out sys101Out;
  @Autowired 
  @Qualifier("ip989010_sys201Out")
  Sys201Out sys201Out;
  @Autowired 
  @Qualifier("ip989010_sys202Out")
  Sys202Out sys202Out;
  @Autowired 
  @Qualifier("ip989010_sys204Out")
  Sys204Out sys204Out;
  @Autowired 
  @Qualifier("ip989010_sys205Out")
  Sys205Out sys205Out;
  @Autowired 
  @Qualifier("ip666010")
  Ip666010 ip666010;
  @Autowired 
  @Qualifier("ip670010")
  Ip670010 ip670010;
  @Autowired 
  @Qualifier("global_ip16901RewardsParm")
  Ip16901RewardsParm ip16901RewardsParm;
  @Autowired 
  @Qualifier("global_ip16901EntryFoundYGroup")
  Ip16901EntryFoundYGroup ip16901EntryFoundYGroup;
  @Autowired 
  @Qualifier("global_ip66601UserTagInformation")
  Ip66601UserTagInformation ip66601UserTagInformation;
  @Autowired 
  @Qualifier("global_ip66102IpmMsg")
  Ip66102IpmMsg ip66102IpmMsg;
  @Autowired 
  @Qualifier("global_ip66102IpmFileInformation")
  Ip66102IpmFileInformation ip66102IpmFileInformation;
  @Autowired 
  @Qualifier("global_ip66605MessageInfo")
  Ip66605MessageInfo ip66605MessageInfo;
  @Autowired 
  @Qualifier("global_ip67002DateParm")
  Ip67002DateParm ip67002DateParm;
  @Autowired 
  @Qualifier("global_ptrIp280010Group800")
  PtrIp280010Group800 ptrIp280010Group800;
  
  
  
  int ndx25001240200;
  int comnNdx2500;
  int ip00404AcctRngIndex;
  int sys002Idx500;
  int ndx5001644697;
  int ndx5001644695;
  int ip66601UserP;
  int ndx5001240200;
  int comnNdx500;
  int displayIdx501;
  int ip66601UserT;
  int sys005Idx502;
  int ndx25001644697;
  int ndx25001644695;
  
  
  
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
      		if(sys004In.hasOpened() && !sys004In.isReadOnly()) { 
      			sys004In.flush(); 
      		}
      		if(sys002In.hasOpened() && !sys002In.isReadOnly()) { 
      			sys002In.flush(); 
      		}
      		if(sys005In.hasOpened() && !sys005In.isReadOnly()) { 
      			sys005In.flush(); 
      		}
      		if(sys001In.hasOpened() && !sys001In.isReadOnly()) { 
      			sys001In.flush(); 
      		}
      		if(sys003In.hasOpened() && !sys003In.isReadOnly()) { 
      			sys003In.flush(); 
      		}
      		if(sys101Out.hasOpened() && !sys101Out.isReadOnly()) { 
      			sys101Out.flush(); 
      		}
      		if(sys201Out.hasOpened() && !sys201Out.isReadOnly()) { 
      			sys201Out.flush(); 
      		}
      		if(sys202Out.hasOpened() && !sys202Out.isReadOnly()) { 
      			sys202Out.flush(); 
      		}
      		if(sys204Out.hasOpened() && !sys204Out.isReadOnly()) { 
      			sys204Out.flush(); 
      		}
      		if(sys205Out.hasOpened() && !sys205Out.isReadOnly()) { 
      			sys205Out.flush(); 
      		}
      }
      
       return getRc(); // Exit with return code
      // end of process method
      }
      /**
      * mainline 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAINLINE COBOL Cyclomatic complexity - 3
      * Input  :  

      * - sys205RecsWrit400              COBOL Name: 400-SYS205-RECS-WRIT
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      private void mainline() throws Exception {
			// Declare local variables used in the method
			int sys205RecsWrit400 = 0;
			// End of variable declaration

      
// ******************************************************************
// * Mainline
// ******************************************************************
//  PERFORM 1000-INITIALIZE
          initialize();/*1000-INITIALIZE*/
          if (this.isProgramEnded()) {
              return ;
          }
//  PERFORM 2000-PROCESS
          process2000();/*2000-PROCESS*/
          if (this.isProgramEnded()) {
              return ;
          }
//  PERFORM 3000-WRAP-UP
          wrapUp();/*3000-WRAP-UP*/
          if (this.isProgramEnded()) {
              return ;
          }
//  IF 400-SYS205-RECS-WRIT GREATER THAN ZEROES
          if (	( work.getSys205RecsWrit400() > 0 )) { 
//  MOVE '0005' TO RETURN-CODE
              this.setRc(5);
          }
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          this.setProgramEnded(true);
          return ;
      
      }
      /**
      * initialize 
      *   This method is derived from 
  *   COBOL Paragraph - 1000-INITIALIZE COBOL Cyclomatic complexity - 7
      * Input  :  

      * - firstTimeSw100                 COBOL Name: 100-FIRST-TIME-SW
      * - pgmIp169410300                 COBOL Name: 300-PGM-IP169410
      * - pgmIp280010300                 COBOL Name: 300-PGM-IP280010
      * - pgmIp666010300                 COBOL Name: 300-PGM-IP666010
      * - pgmIp666030300                 COBOL Name: 300-PGM-IP666030
      * - pgmIp670010300                 COBOL Name: 300-PGM-IP670010
      *
      * Output :  

      * - ptrIp169410800                 COBOL Name: 800-PTR-IP169410
      * - ptrIp280010800                 COBOL Name: 800-PTR-IP280010
      * - ptrIp666010800                 COBOL Name: 800-PTR-IP666010
      * - ptrIp666030800                 COBOL Name: 800-PTR-IP666030
      * - ptrIp670010800                 COBOL Name: 800-PTR-IP670010
      * - firstTimeSw100                 COBOL Name: 100-FIRST-TIME-SW
      * - ip66601UserT                   COBOL Name: IP66601-USER-T
      * - ip66102IpmMsgLngth             COBOL Name: IP66102-IPM-MSG-LNGTH
      * - fldStrt800                     COBOL Name: 800-FLD-STRT
      *
      * @throws CFException
      */
      private void initialize() throws Exception {
      
// ******************************************************************
// * Initialize
// ******************************************************************
//  IF 100-FIRST-TIME
          if ( work.isFirstTime100()  ) { 
//  PERFORM 1100-STARTUP-MESSAGES
              startupMessages();/*1100-STARTUP-MESSAGES*/
//  PERFORM 1150-VALIDATE-PARMS
              validateParms();/*1150-VALIDATE-PARMS*/
//  PERFORM 1200-OPEN-FILES
              openFiles();/*1200-OPEN-FILES*/
//  PERFORM 1300-INIT-TEMPLATES
              initTemplates();/*1300-INIT-TEMPLATES*/
//  PERFORM 1500-LOAD-REGISTRATION-FILE
              loadRegistrationFile();/*1500-LOAD-REGISTRATION-FILE*/
//  PERFORM 1600-LOAD-BRANDPRD-IRD-FILE
              loadBrandprdIrdFile();/*1600-LOAD-BRANDPRD-IRD-FILE*/
//  SET 800-PTR-IP169410 TO ENTRY 300-PGM-IP169410
              work.setPtrIp169410800(work.getPgmIp169410300()); 
              
//  SET 800-PTR-IP280010 TO ENTRY 300-PGM-IP280010
              ptrIp280010Group800.setPtrIp280010800(work.getPgmIp280010300()); 
              
//  SET 800-PTR-IP666010 TO ENTRY 300-PGM-IP666010
              work.setPtrIp666010800(work.getPgmIp666010300()); 
              
//  SET 800-PTR-IP666030 TO ENTRY 300-PGM-IP666030
              work.setPtrIp666030800(work.getPgmIp666030300()); 
              
//  SET 800-PTR-IP670010 TO ENTRY 300-PGM-IP670010
              work.setPtrIp670010800(work.getPgmIp670010300()); 
              
//  SET 100-NOT-FIRST-TIME TO TRUE
              work.setNotFirstTime100True(); 
              
          }
//  SET IP66601-USER-T TO 1
          ip66601UserT = 1; 
          
//  MOVE 0 TO IP66102-IPM-MSG-LNGTH
          ip66102IpmFileInformation.setIp66102IpmMsgLngth((long)0);
          // MOVE ZERO TO 800-FLD-STRT
          workAreas800.setFldStrt800(0);
      
      }
      /**
      * startupMessages 
      *   This method is derived from 
  *   COBOL Paragraph - 1100-STARTUP-MESSAGES COBOL Cyclomatic complexity - 2
      * Input  :  

      * - pgmIp989010300                 COBOL Name: 300-PGM-IP989010
      * - pgmVersion300                  COBOL Name: 300-PGM-VERSION
      * - pgmIp996010300                 COBOL Name: 300-PGM-IP996010
      *
      * Output :  

      * - ip996011PgmId                  COBOL Name: IP996011-PGM-ID
      * - pgmIp989010300                 COBOL Name: 300-PGM-IP989010
      * - ip996011PgmVersion             COBOL Name: IP996011-PGM-VERSION
      * - pgmVersion300                  COBOL Name: 300-PGM-VERSION
      * - ip996011WhenCompiled           COBOL Name: IP996011-WHEN-COMPILED
      * - currentDate800                 COBOL Name: 800-CURRENT-DATE
      * - ptrIp996010800                 COBOL Name: 800-PTR-IP996010
      * - displayIdx501                  COBOL Name: 501-DISPLAY-IDX
      * - rowCount501                    COBOL Name: 501-ROW-COUNT
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      private void startupMessages() throws Exception {
      
// ******************************************************************
// * Display startup messages
// ******************************************************************
//  MOVE 300-PGM-IP989010 TO IP996011-PGM-ID
          ip996011ProgramStartMessage.setIp996011PgmId(work.getPgmIp989010300());
//  MOVE 300-PGM-VERSION TO IP996011-PGM-VERSION
          ip996011ProgramStartMessage.setIp996011PgmVersion(work.getPgmVersion300());
          // MOVE WHEN-COMPILED TO IP996011-WHEN-COMPILED
          //  FORMAT1311677340 = "X(08)BX(08)"
          ip996011ProgramStartMessage.setIp996011WhenCompiled(CFUtil.cobolAnEditFormatter(CONSTANTS.FORMAT1311677340,CONSTANTS.LITERAL_545580847));
//  MOVE FUNCTION CURRENT-DATE TO 800-CURRENT-DATE
          workAreas800.getCurrentDate800().setString( substring(CFUtil.getCurrentDate(timeZoneId),0,8));
//  SET 800-PTR-IP996010 TO ENTRY 300-PGM-IP996010
          work.setPtrIp996010800(work.getPgmIp996010300()); 
          
//  SET 501-DISPLAY-IDX TO 1
          displayIdx501 = 1; 
          
//  MOVE ZEROES TO 501-ROW-COUNT
          work.setRowCount501(0);
//  CALL 800-PTR-IP996010
          // CALL 800-PTR-IP996010
          	this.setRc( ip996010.process());
      
      }
      /**
      * validateParms 
      *   This method is derived from 
  *   COBOL Paragraph - 1150-VALIDATE-PARMS COBOL Cyclomatic complexity - 6
      * Input  :  

      * - parmLength1000                 COBOL Name: 1000-PARM-LENGTH
      * - abendCode3003015               COBOL Name: 300-3015-ABEND-CODE
      * - errorMsg6003015                COBOL Name: 600-3015-ERROR-MSG
      * - para1150300                    COBOL Name: 300-PARA-1150
      * - displayMsgTblsSw1000           COBOL Name: 1000-DISPLAY-MSG-TBLS-SW
      * - writeXmlSw1000                 COBOL Name: 1000-WRITE-XML-SW
      * - writePsipmSw1000               COBOL Name: 1000-WRITE-PSIPM-SW
      * - writeIpmSw1000                 COBOL Name: 1000-WRITE-IPM-SW
      *
      * Output :  

      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - abendCode3003015               COBOL Name: 300-3015-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - errorMsg6003015                COBOL Name: 600-3015-ERROR-MSG
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para1150300                    COBOL Name: 300-PARA-1150
      *
      * @throws CFException
      */
      private void validateParms() throws Exception {
			// Declare local variables used in the method
			short parmLength1000 = 0;
			ParmData1000 parmData1000 = parms1000.getParmData1000();
			// End of variable declaration

      
// ******************************************************************
// * Validate program parametes
// ******************************************************************
          parmLength1000 = parms1000.getParmLength1000();
//  IF 1000-PARM-LENGTH NOT EQUAL 04
          if (	( parmLength1000 != 4 ) ) { 
//  MOVE 300-3015-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(String.valueOf(work.getAbendCode3003015String()).toCharArray());
//  MOVE 600-3015-ERROR-MSG TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(pad(99,work.getErrorMsg6003015(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-1150 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara1150300());
//  PERFORM 9100-ABEND-PROGRAM
              abendProgram();/*9100-ABEND-PROGRAM*/
          }
  
//  IF 1000-PARM1-VALID AND 1000-PARM2-VALID AND 1000-PARM3-VALID AND 1000-PARM4-VALID
          parmData1000 = parms1000.getParmData1000();
//  ELSE
          if (!(parmData1000.isParm1Valid1000())  || !(parmData1000.isParm2Valid1000())  || !(parmData1000.isParm3Valid1000())  || !(parmData1000.isParm4Valid1000()) ) { 
//  MOVE 300-3015-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(String.valueOf(work.getAbendCode3003015String()).toCharArray());
//  MOVE 600-3015-ERROR-MSG TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(pad(99,work.getErrorMsg6003015(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-1150 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara1150300());
//  PERFORM 9100-ABEND-PROGRAM
              abendProgram();/*9100-ABEND-PROGRAM*/
          }
  
      
      }
      /**
      * openFiles 
      *   This method is derived from 
  *   COBOL Paragraph - 1200-OPEN-FILES COBOL Cyclomatic complexity - 13
      * Input  :  

      * - sys001300                      COBOL Name: 300-SYS001
      * - abendCode3003002               COBOL Name: 300-3002-ABEND-CODE
      * - errorMsg6003002                COBOL Name: 600-3002-ERROR-MSG
      * - para1200300                    COBOL Name: 300-PARA-1200
      * - sys002300                      COBOL Name: 300-SYS002
      * - sys003300                      COBOL Name: 300-SYS003
      * - sys004300                      COBOL Name: 300-SYS004
      * - sys005300                      COBOL Name: 300-SYS005
      * - writeXmlSw1000                 COBOL Name: 1000-WRITE-XML-SW
      * - sys101300                      COBOL Name: 300-SYS101
      * - abendCode3003003               COBOL Name: 300-3003-ABEND-CODE
      * - errorMsg6003003                COBOL Name: 600-3003-ERROR-MSG
      * - writePsipmSw1000               COBOL Name: 1000-WRITE-PSIPM-SW
      * - sys201300                      COBOL Name: 300-SYS201
      * - sys202300                      COBOL Name: 300-SYS202
      * - sys204300                      COBOL Name: 300-SYS204
      * - sys205300                      COBOL Name: 300-SYS205
      *
      * Output :  

      * - sys001Status800                COBOL Name: 800-SYS001-STATUS
      * - sys002Status800                COBOL Name: 800-SYS002-STATUS
      * - sys003Status800                COBOL Name: 800-SYS003-STATUS
      * - sys004Status800                COBOL Name: 800-SYS004-STATUS
      * - sys005Status800                COBOL Name: 800-SYS005-STATUS
      * - sys101Status800                COBOL Name: 800-SYS101-STATUS
      * - sys201Status800                COBOL Name: 800-SYS201-STATUS
      * - sys202Status800                COBOL Name: 800-SYS202-STATUS
      * - sys204Status800                COBOL Name: 800-SYS204-STATUS
      * - sys205Status800                COBOL Name: 800-SYS205-STATUS
      * - sys001StatusSw100              COBOL Name: 100-SYS001-STATUS-SW
      * - fileDd6003002                  COBOL Name: 600-3002-FILE-DD
      * - sys001300                      COBOL Name: 300-SYS001
      * - fileStat6003002                COBOL Name: 600-3002-FILE-STAT
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - abendCode3003002               COBOL Name: 300-3002-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - errorMsg6003002                COBOL Name: 600-3002-ERROR-MSG
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para1200300                    COBOL Name: 300-PARA-1200
      * - sys002StatusSw100              COBOL Name: 100-SYS002-STATUS-SW
      * - sys002300                      COBOL Name: 300-SYS002
      * - sys003StatusSw100              COBOL Name: 100-SYS003-STATUS-SW
      * - sys003300                      COBOL Name: 300-SYS003
      * - sys004StatusSw100              COBOL Name: 100-SYS004-STATUS-SW
      * - sys004300                      COBOL Name: 300-SYS004
      * - sys005StatusSw100              COBOL Name: 100-SYS005-STATUS-SW
      * - sys005300                      COBOL Name: 300-SYS005
      * - sys101StatusSw100              COBOL Name: 100-SYS101-STATUS-SW
      * - fileDd6003003                  COBOL Name: 600-3003-FILE-DD
      * - sys101300                      COBOL Name: 300-SYS101
      * - fileStat6003003                COBOL Name: 600-3003-FILE-STAT
      * - abendCode3003003               COBOL Name: 300-3003-ABEND-CODE
      * - errorMsg6003003                COBOL Name: 600-3003-ERROR-MSG
      * - sys201StatusSw100              COBOL Name: 100-SYS201-STATUS-SW
      * - sys201300                      COBOL Name: 300-SYS201
      * - sys202StatusSw100              COBOL Name: 100-SYS202-STATUS-SW
      * - sys202300                      COBOL Name: 300-SYS202
      * - sys204StatusSw100              COBOL Name: 100-SYS204-STATUS-SW
      * - sys204300                      COBOL Name: 300-SYS204
      * - sys205StatusSw100              COBOL Name: 100-SYS205-STATUS-SW
      * - sys205300                      COBOL Name: 300-SYS205
      *
      * @throws CFException
      */
      private void openFiles() throws Exception {
			// Declare local variables used in the method
			char[] sys001Status800 = null;
			char[] sys002Status800 = null;
			char[] sys003Status800 = null;
			char[] sys004Status800 = null;
			char[] sys005Status800 = null;
			char[] sys101Status800 = null;
			char[] sys201Status800 = null;
			char[] sys202Status800 = null;
			char[] sys204Status800 = null;
			char[] sys205Status800 = null;
			ParmData1000 parmData1000 = parms1000.getParmData1000();
			// End of variable declaration

      
// ******************************************************************
// * Open files
// ******************************************************************

// * Sys001
//  OPEN INPUT SYS001-IN
          sys001In.open(new String(CONSTANTS.MODE_READ_ONLY_36242),sys001In.getFileName(),sys001In.getSys001InCharSet(),sys001In.getSys001InCrlfFlag());
          workAreas800.setSys001Status800(sys001In.getStatusString() );
          sys001Status800 = workAreas800.getSys001Status800();
//  IF 800-SYS001-STATUS EQUAL ZERO
          if (( allZeros(sys001Status800) ) /*  ==  zeros*/) { 
//  SET 100-SYS001-OPEN TO TRUE
              work.setSys001Open100True(); 
              
          }
  
//  ELSE
          else { 
//  MOVE 300-SYS001 TO 600-3002-FILE-DD
              errorMsg6003002.setFileDd6003002(work.getSys001300());
//  MOVE 800-SYS001-STATUS TO 600-3002-FILE-STAT
              errorMsg6003002.setFileStat6003002(workAreas800.getSys001Status800());
//  MOVE 300-3002-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(String.valueOf(work.getAbendCode3003002String()).toCharArray());
              // MOVE 600-3002-ERROR-MSG TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(errorMsg6003002.toCharArray());
//  MOVE 300-PARA-1200 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara1200300());
//  PERFORM 9100-ABEND-PROGRAM
              abendProgram();/*9100-ABEND-PROGRAM*/
          }

// * Sys002
//  OPEN INPUT SYS002-IN
          sys002In.open(new String(CONSTANTS.MODE_READ_ONLY_36242),sys002In.getFileName(),sys002In.getSys002InCharSet(),sys002In.getSys002InCrlfFlag());
          workAreas800.setSys002Status800(sys002In.getStatusString() );
          sys002Status800 = workAreas800.getSys002Status800();
//  IF 800-SYS002-STATUS EQUAL ZERO
          if (( allZeros(sys002Status800) ) /*  ==  zeros*/) { 
//  SET 100-SYS002-OPEN TO TRUE
              work.setSys002Open100True(); 
              
          }
  
//  ELSE
          else { 
//  MOVE 300-SYS002 TO 600-3002-FILE-DD
              errorMsg6003002.setFileDd6003002(work.getSys002300());
//  MOVE 800-SYS002-STATUS TO 600-3002-FILE-STAT
              errorMsg6003002.setFileStat6003002(workAreas800.getSys002Status800());
//  MOVE 300-3002-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(String.valueOf(work.getAbendCode3003002String()).toCharArray());
              // MOVE 600-3002-ERROR-MSG TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(errorMsg6003002.toCharArray());
//  MOVE 300-PARA-1200 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara1200300());
//  PERFORM 9100-ABEND-PROGRAM
              abendProgram();/*9100-ABEND-PROGRAM*/
          }

// * Sys003
//  OPEN INPUT SYS003-IN
          sys003In.open(new String(CONSTANTS.MODE_READ_ONLY_36242),sys003In.getFileName(),sys003In.getSys003InCharSet(),sys003In.getSys003InCrlfFlag());
          workAreas800.setSys003Status800(sys003In.getStatusString() );
          sys003Status800 = workAreas800.getSys003Status800();
//  IF 800-SYS003-STATUS EQUAL ZERO
          if (( allZeros(sys003Status800) ) /*  ==  zeros*/) { 
//  SET 100-SYS003-OPEN TO TRUE
              work.setSys003Open100True(); 
              
          }
  
//  ELSE
          else { 
//  MOVE 300-SYS003 TO 600-3002-FILE-DD
              errorMsg6003002.setFileDd6003002(work.getSys003300());
//  MOVE 800-SYS003-STATUS TO 600-3002-FILE-STAT
              errorMsg6003002.setFileStat6003002(workAreas800.getSys003Status800());
//  MOVE 300-3002-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(String.valueOf(work.getAbendCode3003002String()).toCharArray());
              // MOVE 600-3002-ERROR-MSG TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(errorMsg6003002.toCharArray());
//  MOVE 300-PARA-1200 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara1200300());
//  PERFORM 9100-ABEND-PROGRAM
              abendProgram();/*9100-ABEND-PROGRAM*/
          }

// * Sys004
//  OPEN INPUT SYS004-IN
          sys004In.open(new String(CONSTANTS.MODE_READ_ONLY_36242),sys004In.getFileName(),sys004In.getSys004InCharSet(),sys004In.getSys004InCrlfFlag());
          workAreas800.setSys004Status800(sys004In.getStatusString() );
          sys004Status800 = workAreas800.getSys004Status800();
//  IF 800-SYS004-STATUS EQUAL ZERO
          if (( allZeros(sys004Status800) ) /*  ==  zeros*/) { 
//  SET 100-SYS004-OPEN TO TRUE
              work.setSys004Open100True(); 
              
          }
  
//  ELSE
          else { 
//  MOVE 300-SYS004 TO 600-3002-FILE-DD
              errorMsg6003002.setFileDd6003002(work.getSys004300());
//  MOVE 800-SYS004-STATUS TO 600-3002-FILE-STAT
              errorMsg6003002.setFileStat6003002(workAreas800.getSys004Status800());
//  MOVE 300-3002-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(String.valueOf(work.getAbendCode3003002String()).toCharArray());
              // MOVE 600-3002-ERROR-MSG TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(errorMsg6003002.toCharArray());
//  MOVE 300-PARA-1200 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara1200300());
//  PERFORM 9100-ABEND-PROGRAM
              abendProgram();/*9100-ABEND-PROGRAM*/
          }

// * Sys005
//  OPEN INPUT SYS005-IN
          sys005In.open(new String(CONSTANTS.MODE_READ_ONLY_36242),sys005In.getFileName(),sys005In.getSys005InCharSet(),sys005In.getSys005InCrlfFlag());
          workAreas800.setSys005Status800(sys005In.getStatusString() );
          sys005Status800 = workAreas800.getSys005Status800();
//  IF 800-SYS005-STATUS EQUAL ZERO
          if (( allZeros(sys005Status800) ) /*  ==  zeros*/) { 
//  SET 100-SYS005-OPEN TO TRUE
              work.setSys005Open100True(); 
              
          }
  
//  ELSE
          else { 
//  MOVE 300-SYS005 TO 600-3002-FILE-DD
              errorMsg6003002.setFileDd6003002(work.getSys005300());
//  MOVE 800-SYS005-STATUS TO 600-3002-FILE-STAT
              errorMsg6003002.setFileStat6003002(workAreas800.getSys005Status800());
//  MOVE 300-3002-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(String.valueOf(work.getAbendCode3003002String()).toCharArray());
              // MOVE 600-3002-ERROR-MSG TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(errorMsg6003002.toCharArray());
//  MOVE 300-PARA-1200 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara1200300());
//  PERFORM 9100-ABEND-PROGRAM
              abendProgram();/*9100-ABEND-PROGRAM*/
          }

// * Sys101
          parmData1000 = parms1000.getParmData1000();
//  IF 1000-WRITE-XML-MSGS
          if ( parmData1000.isWriteXmlMsgs1000()  ) { 
//  OPEN OUTPUT SYS101-OUT
              sys101Out.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),sys101Out.getFileName(),sys101Out.getSys101OutCharSet(),sys101Out.getSys101OutCrlfFlag());
              workAreas800.setSys101Status800(sys101Out.getStatusString() );
              sys101Status800 = workAreas800.getSys101Status800();
//  IF 800-SYS101-STATUS EQUAL ZERO
              if (( allZeros(sys101Status800) ) /*  ==  zeros*/) { 
//  SET 100-SYS101-OPEN TO TRUE
                  work.setSys101Open100True(); 
                  
              }
  
//  ELSE
              else { 
//  MOVE 300-SYS101 TO 600-3003-FILE-DD
                  errorMsg6003003.setFileDd6003003(work.getSys101300());
//  MOVE 800-SYS101-STATUS TO 600-3003-FILE-STAT
                  errorMsg6003003.setFileStat6003003(workAreas800.getSys101Status800());
//  MOVE 300-3003-ABEND-CODE TO 900-ABEND-CODE
                  abendMessage900.setAbendCode900(String.valueOf(work.getAbendCode3003003String()).toCharArray());
                  // MOVE 600-3003-ERROR-MSG TO 900-ABEND-TEXT
                  abendMessage900.setAbendText900(errorMsg6003003.toCharArray());
//  MOVE 300-PARA-1200 TO 900-ABEND-PARA
                  abendParaName900.setAbendPara900(work.getPara1200300());
//  PERFORM 9100-ABEND-PROGRAM
                  abendProgram();/*9100-ABEND-PROGRAM*/
              }
          }
  

// * Sys201
          parmData1000 = parms1000.getParmData1000();
//  IF 1000-WRITE-PSIPM-MSGS
          if ( parmData1000.isWritePsipmMsgs1000()  ) { 
//  OPEN OUTPUT SYS201-OUT
              sys201Out.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),sys201Out.getFileName(),sys201Out.getSys201OutCharSet(),sys201Out.getSys201OutCrlfFlag());
              workAreas800.setSys201Status800(sys201Out.getStatusString() );
              sys201Status800 = workAreas800.getSys201Status800();
//  IF 800-SYS201-STATUS EQUAL ZERO
              if (( allZeros(sys201Status800) ) /*  ==  zeros*/) { 
//  SET 100-SYS201-OPEN TO TRUE
                  work.setSys201Open100True(); 
                  
              }
  
//  ELSE
              else { 
//  MOVE 300-SYS201 TO 600-3003-FILE-DD
                  errorMsg6003003.setFileDd6003003(work.getSys201300());
//  MOVE 800-SYS201-STATUS TO 600-3003-FILE-STAT
                  errorMsg6003003.setFileStat6003003(workAreas800.getSys201Status800());
//  MOVE 300-3003-ABEND-CODE TO 900-ABEND-CODE
                  abendMessage900.setAbendCode900(String.valueOf(work.getAbendCode3003003String()).toCharArray());
                  // MOVE 600-3003-ERROR-MSG TO 900-ABEND-TEXT
                  abendMessage900.setAbendText900(errorMsg6003003.toCharArray());
//  MOVE 300-PARA-1200 TO 900-ABEND-PARA
                  abendParaName900.setAbendPara900(work.getPara1200300());
//  PERFORM 9100-ABEND-PROGRAM
                  abendProgram();/*9100-ABEND-PROGRAM*/
              }
          }
  

// * Sys202
//  OPEN OUTPUT SYS202-OUT
          sys202Out.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),sys202Out.getFileName(),sys202Out.getSys202OutCharSet(),sys202Out.getSys202OutCrlfFlag());
          workAreas800.setSys202Status800(sys202Out.getStatusString() );
          sys202Status800 = workAreas800.getSys202Status800();
//  IF 800-SYS202-STATUS EQUAL ZERO
          if (( allZeros(sys202Status800) ) /*  ==  zeros*/) { 
//  SET 100-SYS202-OPEN TO TRUE
              work.setSys202Open100True(); 
              
          }
  
//  ELSE
          else { 
//  MOVE 300-SYS202 TO 600-3003-FILE-DD
              errorMsg6003003.setFileDd6003003(work.getSys202300());
//  MOVE 800-SYS202-STATUS TO 600-3003-FILE-STAT
              errorMsg6003003.setFileStat6003003(workAreas800.getSys202Status800());
//  MOVE 300-3003-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(String.valueOf(work.getAbendCode3003003String()).toCharArray());
              // MOVE 600-3003-ERROR-MSG TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(errorMsg6003003.toCharArray());
//  MOVE 300-PARA-1200 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara1200300());
//  PERFORM 9100-ABEND-PROGRAM
              abendProgram();/*9100-ABEND-PROGRAM*/
          }

// * Sys204
//  OPEN OUTPUT SYS204-OUT
          sys204Out.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),sys204Out.getFileName(),sys204Out.getSys204OutCharSet(),sys204Out.getSys204OutCrlfFlag());
          workAreas800.setSys204Status800(sys204Out.getStatusString() );
          sys204Status800 = workAreas800.getSys204Status800();
//  IF 800-SYS204-STATUS EQUAL ZERO
          if (( allZeros(sys204Status800) ) /*  ==  zeros*/) { 
//  SET 100-SYS204-OPEN TO TRUE
              work.setSys204Open100True(); 
              
          }
  
//  ELSE
          else { 
//  MOVE 300-SYS204 TO 600-3003-FILE-DD
              errorMsg6003003.setFileDd6003003(work.getSys204300());
//  MOVE 800-SYS204-STATUS TO 600-3003-FILE-STAT
              errorMsg6003003.setFileStat6003003(workAreas800.getSys204Status800());
//  MOVE 300-3003-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(String.valueOf(work.getAbendCode3003003String()).toCharArray());
              // MOVE 600-3003-ERROR-MSG TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(errorMsg6003003.toCharArray());
//  MOVE 300-PARA-1200 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara1200300());
//  PERFORM 9100-ABEND-PROGRAM
              abendProgram();/*9100-ABEND-PROGRAM*/
          }

// * Sys205
//  OPEN OUTPUT SYS205-OUT
          sys205Out.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),sys205Out.getFileName(),sys205Out.getSys205OutCharSet(),sys205Out.getSys205OutCrlfFlag());
          workAreas800.setSys205Status800(sys205Out.getStatusString() );
          sys205Status800 = workAreas800.getSys205Status800();
//  IF 800-SYS205-STATUS EQUAL ZERO
          if (( allZeros(sys205Status800) ) /*  ==  zeros*/) { 
//  SET 100-SYS205-OPEN TO TRUE
              work.setSys205Open100True(); 
              
          }
  
//  ELSE
          else { 
//  MOVE 300-SYS205 TO 600-3003-FILE-DD
              errorMsg6003003.setFileDd6003003(work.getSys205300());
//  MOVE 800-SYS205-STATUS TO 600-3003-FILE-STAT
              errorMsg6003003.setFileStat6003003(workAreas800.getSys205Status800());
//  MOVE 300-3003-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(String.valueOf(work.getAbendCode3003003String()).toCharArray());
              // MOVE 600-3003-ERROR-MSG TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(errorMsg6003003.toCharArray());
//  MOVE 300-PARA-1200 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara1200300());
//  PERFORM 9100-ABEND-PROGRAM
              abendProgram();/*9100-ABEND-PROGRAM*/
          }
      
      }
      /**
      * initTemplates 
      *   This method is derived from 
  *   COBOL Paragraph - 1300-INIT-TEMPLATES COBOL Cyclomatic complexity - 6
      * Input  :  

      * - eofSys004Sw100                 COBOL Name: 100-EOF-SYS004-SW
      * - sys004TagKey                   COBOL Name: SYS004-TAG-KEY
      * - sys004TagLen                   COBOL Name: SYS004-TAG-LEN
      * - dfltMaxLen300                  COBOL Name: 300-DFLT-MAX-LEN
      * - sys004TagValue                 COBOL Name: SYS004-TAG-VALUE
      *
      * Output :  

      * - newElem800                     COBOL Name: 800-NEW-ELEM
      * - sys004TagKey                   COBOL Name: SYS004-TAG-KEY
      * - newElemLen800                  COBOL Name: 800-NEW-ELEM-LEN
      * - sys004TagLen                   COBOL Name: SYS004-TAG-LEN
      * - newElemValue800                COBOL Name: 800-NEW-ELEM-VALUE
      * - sys004TagValue                 COBOL Name: SYS004-TAG-VALUE
      *
      * @throws CFException
      */
      private void initTemplates() throws Exception {
			// Declare local variables used in the method
			Sys004TagData sys004TagData = sys004InRec.getSys004TagData();
			NewElemData800 newElemData800 = workAreas800.getNewElemData800();
			int sys004TagLen = 0;
			int dfltMaxLen300 = 0;
			// End of variable declaration

      
// ******************************************************************
// * Initialize templates with default values
// ******************************************************************
//  PERFORM 1310-READ-SYS004
          readSys004();/*1310-READ-SYS004*/
//  PERFORM UNTIL 100-EOF-SYS004
          while ((!(work.isEofSys004100()) )) {
//  MOVE SYS004-TAG-KEY TO 800-NEW-ELEM
              workAreas800.setNewElem800(sys004InRec.getSys004TagKey());
//  MOVE SYS004-TAG-LEN TO 800-NEW-ELEM-LEN
              newElemData800.setNewElemLen800(sys004TagData.getSys004TagLen());
  
              dfltMaxLen300 = work.getDfltMaxLen300();
              sys004TagLen = sys004TagData.getSys004TagLen();
//  IF SYS004-TAG-LEN <= 300-DFLT-MAX-LEN
              if (	( sys004TagLen <= dfltMaxLen300 )) { 
//  MOVE SYS004-TAG-VALUE (1 : SYS004-TAG-LEN ) TO 800-NEW-ELEM-VALUE (1 : SYS004-TAG-LEN )
                  workAreas800.replace(sys004InRec/*parent*/,23/*fromOffset - (newElemValue800) */,sys004InRec.getSys004TagData().getSys004TagLen()/*fromLen*/,1349/*toOffset - (sys004TagValue) */,sys004InRec.getSys004TagData().getSys004TagLen()/*toLen*/);
              }
  
//  ELSE
              else { 
//  MOVE ALL SPACES TO 800-NEW-ELEM-VALUE (1 : SYS004-TAG-LEN )
                  workAreas800.getNewElemData800().setNewElemValue800(replace(workAreas800.getNewElemData800().getNewElemValue800(),CONSTANTS.SPACE,0,sys004InRec.getSys004TagData().getSys004TagLen()));
//  MOVE SYS004-TAG-VALUE (1 : 300-DFLT-MAX-LEN ) TO 800-NEW-ELEM-VALUE (1 : 300-DFLT-MAX-LEN )
                  workAreas800.replace(sys004InRec/*parent*/,23/*fromOffset - (newElemValue800) */,work.getDfltMaxLen300()/*fromLen*/,1349/*toOffset - (sys004TagValue) */,work.getDfltMaxLen300()/*toLen*/);
              }
//  EVALUATE SYS004-MTI-FC
              switch(new String(sys004InRec.getSys004MtiFc())){
              	case "1240200":
//  PERFORM 8000-ADD-1240200-FIELD
                  add1240200Field();/*8000-ADD-1240200-FIELD*/
              break;
              	case "1644695":
//  PERFORM 8000-ADD-1644695-FIELD
                  add1644695Field();/*8000-ADD-1644695-FIELD*/
              break;
              	case "1644697":
//  PERFORM 8000-ADD-1644697-FIELD
                  add1644697Field();/*8000-ADD-1644697-FIELD*/
              break;
              }
//  PERFORM 1310-READ-SYS004
              readSys004();/*1310-READ-SYS004*/
          }
      
      }
      /**
      * readSys004 
      *   This method is derived from 
  *   COBOL Paragraph - 1310-READ-SYS004 COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sys004FirstRecSw100            COBOL Name: 100-SYS004-FIRST-REC-SW
      * - abendCode3003005               COBOL Name: 300-3005-ABEND-CODE
      * - sys004300                      COBOL Name: 300-SYS004
      * - errorMsg6003005                COBOL Name: 600-3005-ERROR-MSG
      * - sys004RecsRead400              COBOL Name: 400-SYS004-RECS-READ
      *
      * Output :  

      * - sys004InRec                    COBOL Name: SYS004-IN-REC
      * - sys004Status800                COBOL Name: 800-SYS004-STATUS
      * - errorCode600                   COBOL Name: 600-ERROR-CODE
      * - abendCode3003005               COBOL Name: 300-3005-ABEND-CODE
      * - fileDd6003005                  COBOL Name: 600-3005-FILE-DD
      * - sys004300                      COBOL Name: 300-SYS004
      * - eofSys004Sw100                 COBOL Name: 100-EOF-SYS004-SW
      * - sys004FirstRecSw100            COBOL Name: 100-SYS004-FIRST-REC-SW
      * - sys004RecsRead400              COBOL Name: 400-SYS004-RECS-READ
      *
      * @throws CFException
      */
      private void readSys004() throws Exception {
      
// ******************************************************************
// * Read record from sys004
// ******************************************************************
//  READ SYS004-IN
          	sys004In.read();
          workAreas800.setSys004Status800(sys004In.getStatusString() );
          if (!sys004In.hasEnded()) {
          	sys004InRec.setString(sys004In.getRecord());
          }
//  AT END
          if (sys004In.hasEnded()) {  
//  IF 100-SYS004-FIRST-REC
              if ( work.isSys004FirstRec100()  ) { 
//  MOVE 300-3005-ABEND-CODE TO 600-ERROR-CODE
                  work.setErrorCode600(work.getAbendCode3003005());
//  MOVE 300-SYS004 TO 600-3005-FILE-DD
                  errorMsg6003005.setFileDd6003005(work.getSys004300());
//  DISPLAY 600-3005-ERROR-MSG
                  logger.info(errorMsg6003005.toString()); 
              }
//  SET 100-EOF-SYS004 TO TRUE
              work.setEofSys004100True(); 
              
            }
//  NOT AT END
          else  {
//  SET 100-SYS004-NOT-FIRST-REC TO TRUE
              work.setSys004NotFirstRec100True(); 
              
//  ADD 1 TO 400-SYS004-RECS-READ
              work.setSys004RecsRead400(work.getSys004RecsRead400()+1);
            }
      
      }
      /**
      * loadRegistrationFile 
      *   This method is derived from 
  *   COBOL Paragraph - 1500-LOAD-REGISTRATION-FILE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sys002Status800                COBOL Name: 800-SYS002-STATUS
      * - rowCount500                    COBOL Name: 500-ROW-COUNT
      *
      * Output :  

      * - sys002Table500                 COBOL Name: 500-SYS002-TABLE
      * - sys002Idx500                   COBOL Name: 500-SYS002-IDX
      *
      * @throws CFException
      */
      private void loadRegistrationFile() throws Exception {
      
// ******************************************************************
// * Load registration file into internal table
// ******************************************************************
//  MOVE HIGH-VALUES TO 500-SYS002-TABLE
          sys002Table500.setString(CONSTANTS.HIGH_VALUE_584214599);
//  SET 500-SYS002-IDX TO 1
          sys002Idx500 = 1; 
          
//  PERFORM 1510-READ-LOAD-REGISTN-FILE UNTIL 88-800-SYS002-EOF
          while (!(workAreas800.isSys002Eof88800()) ) {
             readLoadRegistnFile();/*1510-READ-LOAD-REGISTN-FILE*/
          }
//  DISPLAY '500-ROW-COUNT: ' 500-ROW-COUNT
          logger.info("500-ROW-COUNT: {}", String.valueOf(work.getRowCount500())); 
      
      }
      /**
      * loadBrandprdIrdFile 
      *   This method is derived from 
  *   COBOL Paragraph - 1600-LOAD-BRANDPRD-IRD-FILE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sys005Status800                COBOL Name: 800-SYS005-STATUS
      * - rowCount502                    COBOL Name: 502-ROW-COUNT
      *
      * Output :  

      * - sys005Table502                 COBOL Name: 502-SYS005-TABLE
      * - sys005Idx502                   COBOL Name: 502-SYS005-IDX
      *
      * @throws CFException
      */
      private void loadBrandprdIrdFile() throws Exception {
      
// *    Perform 1520-close-load-registn-file.
//  MOVE HIGH-VALUES TO 502-SYS005-TABLE
          sys005Table502.setString(CONSTANTS.HIGH_VALUE_1749248865);
//  SET 502-SYS005-IDX TO 1
          sys005Idx502 = 1; 
          
//  PERFORM 1610-READ-LOAD-BP-IRD-FILE UNTIL 88-800-SYS005-EOF
          while (!(workAreas800.isSys005Eof88800()) ) {
             readLoadBpIrdFile();/*1610-READ-LOAD-BP-IRD-FILE*/
          }
//  DISPLAY '502-ROW-COUNT: ' 502-ROW-COUNT
          logger.info("502-ROW-COUNT: {}", String.valueOf(work.getRowCount502())); 
      
      }
      /**
      * readLoadRegistnFile 
      *   This method is derived from 
  *   COBOL Paragraph - 1510-READ-LOAD-REGISTN-FILE COBOL Cyclomatic complexity - 7
      * Input  :  

      * - sys002Idx500                   COBOL Name: 500-SYS002-IDX
      * - rowCount500                    COBOL Name: 500-ROW-COUNT
      * - abendCode3003016               COBOL Name: 300-3016-ABEND-CODE
      * - errorMsg6003016                COBOL Name: 600-3016-ERROR-MSG
      * - para1510300                    COBOL Name: 300-PARA-1510
      * - sys002300                      COBOL Name: 300-SYS002
      * - abendCode3003005               COBOL Name: 300-3005-ABEND-CODE
      * - errorMsg6003005                COBOL Name: 600-3005-ERROR-MSG
      * - abendCode3003006               COBOL Name: 300-3006-ABEND-CODE
      * - errorMsg6003006                COBOL Name: 600-3006-ERROR-MSG
      *
      * Output :  

      * - sys002InRec                    COBOL Name: SYS002-IN-REC
      * - sys002Status800                COBOL Name: 800-SYS002-STATUS
      * - sys002FirstRecSw100            COBOL Name: 100-SYS002-FIRST-REC-SW
      * - sys002Data500                  COBOL Name: 500-SYS002-DATA
      * - sys002Idx500                   COBOL Name: 500-SYS002-IDX
      * - rowCount500                    COBOL Name: 500-ROW-COUNT
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - abendCode3003016               COBOL Name: 300-3016-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - errorMsg6003016                COBOL Name: 600-3016-ERROR-MSG
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para1510300                    COBOL Name: 300-PARA-1510
      * - fileDd6003005                  COBOL Name: 600-3005-FILE-DD
      * - sys002300                      COBOL Name: 300-SYS002
      * - abendCode3003005               COBOL Name: 300-3005-ABEND-CODE
      * - errorMsg6003005                COBOL Name: 600-3005-ERROR-MSG
      * - fileDd6003006                  COBOL Name: 600-3006-FILE-DD
      * - abendCode3003006               COBOL Name: 300-3006-ABEND-CODE
      * - errorMsg6003006                COBOL Name: 600-3006-ERROR-MSG
      *
      * @throws CFException
      */
      private void readLoadRegistnFile() throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph reads the registration file. after every        *
// * successful read, the record is loaded into an internal table.  *
// *----------------------------------------------------------------*
//  READ SYS002-IN
          	sys002In.read();
          workAreas800.setSys002Status800(sys002In.getStatusString() );
          if (!sys002In.hasEnded()) {
          	sys002InRec.setString(sys002In.getRecord());
          }
//  IF 88-800-SYS002-GOOD
          if ( workAreas800.isSys002Good88800()  ) { 
//  SET 100-SYS002-NOT-FIRST-REC TO TRUE
              work.setSys002NotFirstRec100True(); 
              
//  IF 500-SYS002-IDX IS LESS THAN OR EQUAL 10000
              if (	( sys002Idx500 <= 10000 )) { 
//  MOVE SYS002-IN-REC TO 500-SYS002-DATA ( 500-SYS002-IDX )
                  sys002Table500.setSys002Data500((sys002Idx500 - 1),sys002InRec.getCharArray());
//  SET 500-SYS002-IDX UP BY 1
                  sys002Idx500++; 
                  
//  ADD 1 TO 500-ROW-COUNT
                  work.setRowCount500(work.getRowCount500()+1);
              }
//  ELSE
              else { 
//  DISPLAY 'ABEND FOR LIMIT'
                  logger.info("ABEND FOR LIMIT"); 
//  MOVE 300-3016-ABEND-CODE TO 900-ABEND-CODE
                  abendMessage900.setAbendCode900(String.valueOf(work.getAbendCode3003016String()).toCharArray());
//  MOVE 600-3016-ERROR-MSG TO 900-ABEND-TEXT
                  abendMessage900.setAbendText900(pad(99,work.getErrorMsg6003016(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-1510 TO 900-ABEND-PARA
                  abendParaName900.setAbendPara900(work.getPara1510300());
//  PERFORM 9100-ABEND-PROGRAM
                  abendProgram();/*9100-ABEND-PROGRAM*/
              }
          }
//  ELSE
          else { 
//  IF 88-800-SYS002-EOF AND 100-SYS002-FIRST-REC
              if ( workAreas800.isSys002Eof88800()   &&  work.isSys002FirstRec100()  ) { 
//  DISPLAY 'SYS002 - EMPTY ABEND'
                  logger.info("SYS002 - EMPTY ABEND"); 
//  MOVE 300-SYS002 TO 600-3005-FILE-DD
                  errorMsg6003005.setFileDd6003005(work.getSys002300());
//  MOVE 300-3005-ABEND-CODE TO 900-ABEND-CODE
                  abendMessage900.setAbendCode900(String.valueOf(work.getAbendCode3003005String()).toCharArray());
                  // MOVE 600-3005-ERROR-MSG TO 900-ABEND-TEXT
                  abendMessage900.setAbendText900(errorMsg6003005.toCharArray());
//  MOVE 300-PARA-1510 TO 900-ABEND-PARA
                  abendParaName900.setAbendPara900(work.getPara1510300());
//  PERFORM 9100-ABEND-PROGRAM
                  abendProgram();/*9100-ABEND-PROGRAM*/
              }
//  ELSE
              else { 
//  IF 88-800-SYS002-EOF
//  ELSE
                  if (!(workAreas800.isSys002Eof88800()) ) { 
//  DISPLAY 'SYS002 - READ ABEND'
                      logger.info("SYS002 - READ ABEND"); 
//  MOVE 300-SYS002 TO 600-3006-FILE-DD
                      errorMsg6003006.setFileDd6003006(work.getSys002300());
//  MOVE 300-3006-ABEND-CODE TO 900-ABEND-CODE
                      abendMessage900.setAbendCode900(String.valueOf(work.getAbendCode3003006String()).toCharArray());
                      // MOVE 600-3006-ERROR-MSG TO 900-ABEND-TEXT
                      abendMessage900.setAbendText900(errorMsg6003006.toCharArray());
//  MOVE 300-PARA-1510 TO 900-ABEND-PARA
                      abendParaName900.setAbendPara900(work.getPara1510300());
//  PERFORM 9100-ABEND-PROGRAM
                      abendProgram();/*9100-ABEND-PROGRAM*/
                  }
              }
          }
      
      }
      /**
      * readLoadBpIrdFile 
      *   This method is derived from 
  *   COBOL Paragraph - 1610-READ-LOAD-BP-IRD-FILE COBOL Cyclomatic complexity - 5
      * Input  :  

      * - sys005Idx502                   COBOL Name: 502-SYS005-IDX
      * - rowCount502                    COBOL Name: 502-ROW-COUNT
      * - abendCode3003016               COBOL Name: 300-3016-ABEND-CODE
      * - errorMsg6003016                COBOL Name: 600-3016-ERROR-MSG
      * - para1610300                    COBOL Name: 300-PARA-1610
      * - sys005300                      COBOL Name: 300-SYS005
      * - abendCode3003006               COBOL Name: 300-3006-ABEND-CODE
      * - errorMsg6003006                COBOL Name: 600-3006-ERROR-MSG
      *
      * Output :  

      * - sys005InRec                    COBOL Name: SYS005-IN-REC
      * - sys005Status800                COBOL Name: 800-SYS005-STATUS
      * - sys005Data502                  COBOL Name: 502-SYS005-DATA
      * - sys005Idx502                   COBOL Name: 502-SYS005-IDX
      * - rowCount502                    COBOL Name: 502-ROW-COUNT
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - abendCode3003016               COBOL Name: 300-3016-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - errorMsg6003016                COBOL Name: 600-3016-ERROR-MSG
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para1610300                    COBOL Name: 300-PARA-1610
      * - fileDd6003006                  COBOL Name: 600-3006-FILE-DD
      * - sys005300                      COBOL Name: 300-SYS005
      * - abendCode3003006               COBOL Name: 300-3006-ABEND-CODE
      * - errorMsg6003006                COBOL Name: 600-3006-ERROR-MSG
      *
      * @throws CFException
      */
      private void readLoadBpIrdFile() throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph reads the registration file. after every        *
// * successful read, the record is loaded into an internal table.  *
// *----------------------------------------------------------------*
//  READ SYS005-IN
          	sys005In.read();
          workAreas800.setSys005Status800(sys005In.getStatusString() );
          if (!sys005In.hasEnded()) {
          	sys005InRec.setString(sys005In.getRecord());
          }
//  IF 88-800-SYS005-GOOD
          if ( workAreas800.isSys005Good88800()  ) { 
//  IF 502-SYS005-IDX IS LESS THAN OR EQUAL 10000
              if (	( sys005Idx502 <= 10000 )) { 
//  MOVE SYS005-IN-REC (1 : 5) TO 502-SYS005-DATA ( 502-SYS005-IDX )
                  sys005Table502.setSys005Data502((sys005Idx502 - 1),pad(6,substring(sys005InRec.getCharArray(),0,5),SPACE_CHAR,RIGHT_PAD));
//  SET 502-SYS005-IDX UP BY 1
                  sys005Idx502++; 
                  
//  ADD 1 TO 502-ROW-COUNT
                  work.setRowCount502(work.getRowCount502()+1);
              }
//  ELSE
              else { 
//  DISPLAY 'ABEND FOR LIMIT'
                  logger.info("ABEND FOR LIMIT"); 
//  MOVE 300-3016-ABEND-CODE TO 900-ABEND-CODE
                  abendMessage900.setAbendCode900(String.valueOf(work.getAbendCode3003016String()).toCharArray());
//  MOVE 600-3016-ERROR-MSG TO 900-ABEND-TEXT
                  abendMessage900.setAbendText900(pad(99,work.getErrorMsg6003016(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-1610 TO 900-ABEND-PARA
                  abendParaName900.setAbendPara900(work.getPara1610300());
//  PERFORM 9100-ABEND-PROGRAM
                  abendProgram();/*9100-ABEND-PROGRAM*/
              }
          }
//  ELSE
          else { 
//  IF 88-800-SYS005-EOF
//  ELSE
              if (!(workAreas800.isSys005Eof88800()) ) { 
//  DISPLAY 'SYS005 - READ ABEND'
                  logger.info("SYS005 - READ ABEND"); 
//  MOVE 300-SYS005 TO 600-3006-FILE-DD
                  errorMsg6003006.setFileDd6003006(work.getSys005300());
//  MOVE 300-3006-ABEND-CODE TO 900-ABEND-CODE
                  abendMessage900.setAbendCode900(String.valueOf(work.getAbendCode3003006String()).toCharArray());
                  // MOVE 600-3006-ERROR-MSG TO 900-ABEND-TEXT
                  abendMessage900.setAbendText900(errorMsg6003006.toCharArray());
//  MOVE 300-PARA-1610 TO 900-ABEND-PARA
                  abendParaName900.setAbendPara900(work.getPara1610300());
//  PERFORM 9100-ABEND-PROGRAM
                  abendProgram();/*9100-ABEND-PROGRAM*/
              }
          }
      
      }
      /**
      * process2000 
      *   This method is derived from 
  *   COBOL Paragraph - 2000-PROCESS COBOL Cyclomatic complexity - 3
      * Input  :  

      * - eofSys003Sw100                 COBOL Name: 100-EOF-SYS003-SW
      * - allRecordsPrcd100              COBOL Name: 100-ALL-RECORDS-PRCD
      *
      * Output : None 

      * @throws CFException
      */
      private void process2000() throws Exception {
      
// ******************************************************************
// * Process
// ******************************************************************

// *    Process default values
//  PERFORM 2100-READ-SYS003
          readSys003();/*2100-READ-SYS003*/
//  PERFORM 2200-PROCESS-COMN-FIELDS UNTIL 100-EOF-SYS003
          while (!(work.isEofSys003100()) ) {
             processComnFields();/*2200-PROCESS-COMN-FIELDS*/
          }
//  PERFORM 2300-COPY-COMN-FLDS-TO-1240200
          copyComnFldsTo1240200();/*2300-COPY-COMN-FLDS-TO-1240200*/

// *    Build file header
//  PERFORM 2400-BUILD-1644697
          build1644697();/*2400-BUILD-1644697*/
//  PERFORM 8550-WRITE-1644697
          write1644697();/*8550-WRITE-1644697*/

// *    Process detail fields
//  PERFORM 8000-READ-SYS001
          readSys001();/*8000-READ-SYS001*/
//  PERFORM 2500-PROCESS-DETAIL-FIELDS UNTIL 88-100-ALL-RECORDS-PRCD-Y
          while (!(work.isAllRecordsPrcdY88100()) ) {
             processDetailFields();/*2500-PROCESS-DETAIL-FIELDS*/
          }

// *    Build file trailer
//  PERFORM 2600-BUILD-1644695
          build1644695();/*2600-BUILD-1644695*/
//  PERFORM 8550-WRITE-1644695
          write1644695();/*8550-WRITE-1644695*/
          ;
      
      }
      /**
      * readSys001 
      *   This method is derived from 
  *   COBOL Paragraph - 8000-READ-SYS001 COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sys001FirstRecSw100            COBOL Name: 100-SYS001-FIRST-REC-SW
      * - sys001300                      COBOL Name: 300-SYS001
      * - abendCode3003005               COBOL Name: 300-3005-ABEND-CODE
      * - errorMsg6003005                COBOL Name: 600-3005-ERROR-MSG
      * - para8000300                    COBOL Name: 300-PARA-8000
      * - sys001RecsRead400              COBOL Name: 400-SYS001-RECS-READ
      *
      * Output :  

      * - sys001InRec                    COBOL Name: SYS001-IN-REC
      * - sys001Status800                COBOL Name: 800-SYS001-STATUS
      * - fileDd6003005                  COBOL Name: 600-3005-FILE-DD
      * - sys001300                      COBOL Name: 300-SYS001
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - abendCode3003005               COBOL Name: 300-3005-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - errorMsg6003005                COBOL Name: 600-3005-ERROR-MSG
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para8000300                    COBOL Name: 300-PARA-8000
      * - eofSys001Sw100                 COBOL Name: 100-EOF-SYS001-SW
      * - ip98901PaymentFileData         COBOL Name: IP98901-PAYMENT-FILE-DATA
      * - sys001FirstRecSw100            COBOL Name: 100-SYS001-FIRST-REC-SW
      * - sys001RecsRead400              COBOL Name: 400-SYS001-RECS-READ
      *
      * @throws CFException
      */
      private void readSys001() throws Exception {
      
// ******************************************************************
// * Read record from sys001
// ******************************************************************
//  READ SYS001-IN
          	sys001In.read();
          workAreas800.setSys001Status800(sys001In.getStatusString() );
          if (!sys001In.hasEnded()) {
          	sys001InRec.setString(sys001In.getRecord());
          }
//  AT END
          if (sys001In.hasEnded()) {  
//  IF 100-SYS001-FIRST-REC
              if ( work.isSys001FirstRec100()  ) { 
//  MOVE 300-SYS001 TO 600-3005-FILE-DD
                  errorMsg6003005.setFileDd6003005(work.getSys001300());
//  MOVE 300-3005-ABEND-CODE TO 900-ABEND-CODE
                  abendMessage900.setAbendCode900(String.valueOf(work.getAbendCode3003005String()).toCharArray());
                  // MOVE 600-3005-ERROR-MSG TO 900-ABEND-TEXT
                  abendMessage900.setAbendText900(errorMsg6003005.toCharArray());
//  MOVE 300-PARA-8000 TO 900-ABEND-PARA
                  abendParaName900.setAbendPara900(work.getPara8000300());
//  PERFORM 9100-ABEND-PROGRAM
                  abendProgram();/*9100-ABEND-PROGRAM*/
              }
//  SET 100-EOF-SYS001 TO TRUE
              work.setEofSys001100True(); 
              
//  INITIALIZE IP98901-PAYMENT-FILE-DATA
              ip98901PaymentFileData.initialize();
            }
//  NOT AT END
          else  {
              // MOVE SYS001-IN-REC TO IP98901-PAYMENT-FILE-DATA
              ip98901PaymentFileData.setString(sys001InRec.getCharArray());
//  SET 100-SYS001-NOT-FIRST-REC TO TRUE
              work.setSys001NotFirstRec100True(); 
              
//  ADD 1 TO 400-SYS001-RECS-READ
              work.setSys001RecsRead400(work.getSys001RecsRead400()+1);
            }
      
      }
      /**
      * readSys003 
      *   This method is derived from 
  *   COBOL Paragraph - 2100-READ-SYS003 COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sys003FirstRecSw100            COBOL Name: 100-SYS003-FIRST-REC-SW
      * - sys003300                      COBOL Name: 300-SYS003
      * - abendCode3003005               COBOL Name: 300-3005-ABEND-CODE
      * - errorMsg6003005                COBOL Name: 600-3005-ERROR-MSG
      * - para2100300                    COBOL Name: 300-PARA-2100
      * - sys003RecsRead400              COBOL Name: 400-SYS003-RECS-READ
      *
      * Output :  

      * - sys003InRec                    COBOL Name: SYS003-IN-REC
      * - sys003Status800                COBOL Name: 800-SYS003-STATUS
      * - fileDd6003005                  COBOL Name: 600-3005-FILE-DD
      * - sys003300                      COBOL Name: 300-SYS003
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - abendCode3003005               COBOL Name: 300-3005-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - errorMsg6003005                COBOL Name: 600-3005-ERROR-MSG
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para2100300                    COBOL Name: 300-PARA-2100
      * - eofSys003Sw100                 COBOL Name: 100-EOF-SYS003-SW
      * - sys003FirstRecSw100            COBOL Name: 100-SYS003-FIRST-REC-SW
      * - sys003RecsRead400              COBOL Name: 400-SYS003-RECS-READ
      *
      * @throws CFException
      */
      private void readSys003() throws Exception {
      
// ******************************************************************
// * Read records from sys003
// ******************************************************************
//  READ SYS003-IN
          	sys003In.read();
          workAreas800.setSys003Status800(sys003In.getStatusString() );
          if (!sys003In.hasEnded()) {
          	sys003InRec.setString(sys003In.getRecord());
          }
//  AT END
          if (sys003In.hasEnded()) {  
//  IF 100-SYS003-FIRST-REC
              if ( work.isSys003FirstRec100()  ) { 
//  MOVE 300-SYS003 TO 600-3005-FILE-DD
                  errorMsg6003005.setFileDd6003005(work.getSys003300());
//  MOVE 300-3005-ABEND-CODE TO 900-ABEND-CODE
                  abendMessage900.setAbendCode900(String.valueOf(work.getAbendCode3003005String()).toCharArray());
                  // MOVE 600-3005-ERROR-MSG TO 900-ABEND-TEXT
                  abendMessage900.setAbendText900(errorMsg6003005.toCharArray());
//  MOVE 300-PARA-2100 TO 900-ABEND-PARA
                  abendParaName900.setAbendPara900(work.getPara2100300());
//  PERFORM 9100-ABEND-PROGRAM
                  abendProgram();/*9100-ABEND-PROGRAM*/
              }
//  SET 100-EOF-SYS003 TO TRUE
              work.setEofSys003100True(); 
              
            }
//  NOT AT END
          else  {
//  SET 100-SYS003-NOT-FIRST-REC TO TRUE
              work.setSys003NotFirstRec100True(); 
              
//  ADD 1 TO 400-SYS003-RECS-READ
              work.setSys003RecsRead400(work.getSys003RecsRead400()+1);
            }
      
      }
      /**
      * writeSys101 
      *   This method is derived from 
  *   COBOL Paragraph - 2200-WRITE-SYS101 COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sys101OutRec                   COBOL Name: SYS101-OUT-REC
      * - sys101Rdw800                   COBOL Name: 800-SYS101-RDW
      * - sys101RecsWrit400              COBOL Name: 400-SYS101-RECS-WRIT
      * - sys101300                      COBOL Name: 300-SYS101
      * - abendCode3003004               COBOL Name: 300-3004-ABEND-CODE
      * - errorMsg6003004                COBOL Name: 600-3004-ERROR-MSG
      * - para2200300                    COBOL Name: 300-PARA-2200
      *
      * Output :  

      * - sys101Status800                COBOL Name: 800-SYS101-STATUS
      * - sys101RecsWrit400              COBOL Name: 400-SYS101-RECS-WRIT
      * - fileDd6003004                  COBOL Name: 600-3004-FILE-DD
      * - sys101300                      COBOL Name: 300-SYS101
      * - fileStat6003004                COBOL Name: 600-3004-FILE-STAT
      * - errorCode600                   COBOL Name: 600-ERROR-CODE
      * - abendCode3003004               COBOL Name: 300-3004-ABEND-CODE
      * - errorText600                   COBOL Name: 600-ERROR-TEXT
      * - errorMsg6003004                COBOL Name: 600-3004-ERROR-MSG
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para2200300                    COBOL Name: 300-PARA-2200
      *
      * @throws CFException
      */
      private void writeSys101() throws Exception {
      
// ******************************************************************
// * Write sys101
// ******************************************************************
//  WRITE SYS101-OUT-REC
          sys101Out.setRecord(substring(sys101OutRec.toCharArray(),0,(int) workAreas800.getSys101Rdw800()));
          sys101Out.write((int) workAreas800.getSys101Rdw800()); 
          workAreas800.setSys101Status800(sys101Out.getStatusString() );
//  IF 88-800-SYS101-GOOD
          if ( workAreas800.isSys101Good88800()  ) { 
//  ADD 1 TO 400-SYS101-RECS-WRIT
              work.setSys101RecsWrit400(work.getSys101RecsWrit400()+1);
          }
//  ELSE
          else { 
//  MOVE 300-SYS101 TO 600-3004-FILE-DD
              errorMsg6003004.setFileDd6003004(work.getSys101300());
//  MOVE 800-SYS101-STATUS TO 600-3004-FILE-STAT
              errorMsg6003004.setFileStat6003004(workAreas800.getSys101Status800());
//  MOVE 300-3004-ABEND-CODE TO 600-ERROR-CODE
              work.setErrorCode600(work.getAbendCode3003004());
              // MOVE 600-3004-ERROR-MSG TO 600-ERROR-TEXT
              work.setErrorText600(errorMsg6003004.toCharArray());
//  MOVE 300-PARA-2200 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara2200300());
//  PERFORM 9100-ABEND-PROGRAM
              abendProgram();/*9100-ABEND-PROGRAM*/
          }
      
      }
      /**
      * processComnFields 
      *   This method is derived from 
  *   COBOL Paragraph - 2200-PROCESS-COMN-FIELDS COBOL Cyclomatic complexity - 1
      * Input  :  

      * - sys003Field                    COBOL Name: SYS003-FIELD
      * - sys003FieldLen                 COBOL Name: SYS003-FIELD-LEN
      * - sys003FieldVal                 COBOL Name: SYS003-FIELD-VAL
      *
      * Output :  

      * - fldName800                     COBOL Name: 800-FLD-NAME
      * - fldValue800                    COBOL Name: 800-FLD-VALUE
      * - fldNameLen800                  COBOL Name: 800-FLD-NAME-LEN
      * - sys003Field                    COBOL Name: SYS003-FIELD
      * - fldLen800                      COBOL Name: 800-FLD-LEN
      * - sys003FieldLen                 COBOL Name: SYS003-FIELD-LEN
      * - sys003FieldVal                 COBOL Name: SYS003-FIELD-VAL
      *
      * @throws CFException
      */
      private void processComnFields() throws Exception {
      
// ******************************************************************
// * Process common fields
// ******************************************************************
          // MOVE SPACES TO 800-FLD-NAME
          work.setFldName800(CONSTANTS.SPACE_10);
//  MOVE ZEROES TO 800-FLD-VALUE 800-FLD-NAME-LEN
          work.setFldValue800(CONSTANTS.ZERO_65);
          work.setFldNameLen800(0);
          // MOVE SYS003-FIELD TO 800-FLD-NAME
          work.setFldName800(sys003InRec.getSys003Field());
          // MOVE SYS003-FIELD-LEN TO 800-FLD-LEN
          work.setFldLen800(padLeftZeros(3,sys003InRec.getSys003FieldLen(),false));
          // MOVE SYS003-FIELD-VAL TO 800-FLD-VALUE
          work.setFldValue800(sys003InRec.getSys003FieldVal());
//  PERFORM 2320-STORE-COMN-FIELD
          storeComnField();/*2320-STORE-COMN-FIELD*/
//  PERFORM 2100-READ-SYS003
          readSys003();/*2100-READ-SYS003*/
          ;
      
      }
      /**
      * storeComnField 
      *   This method is derived from 
  *   COBOL Paragraph - 2320-STORE-COMN-FIELD COBOL Cyclomatic complexity - 26
      * Input  :  

      * - pds0023300                     COBOL Name: 300-PDS0023
      * - fldLen800                      COBOL Name: 800-FLD-LEN
      * - fldValue800                    COBOL Name: 800-FLD-VALUE
      * - pds0148300                     COBOL Name: 300-PDS0148
      * - pds0122300                     COBOL Name: 300-PDS0122
      * - de3s1300                       COBOL Name: 300-DE3S1
      * - de42300                        COBOL Name: 300-DE42
      * - de43s2300                      COBOL Name: 300-DE43S2
      * - de43s3300                      COBOL Name: 300-DE43S3
      * - de43s4300                      COBOL Name: 300-DE43S4
      * - de43s5300                      COBOL Name: 300-DE43S5
      * - de43s6300                      COBOL Name: 300-DE43S6
      * - de49300                        COBOL Name: 300-DE49
      * - de26300                        COBOL Name: 300-DE26
      * - de22300                        COBOL Name: 300-DE22
      * - type1300                       COBOL Name: 300-TYPE1
      * - ica1300                        COBOL Name: 300-ICA1
      * - bin1300                        COBOL Name: 300-BIN1
      * - maid1300                       COBOL Name: 300-MAID1
      * - endpoint1300                   COBOL Name: 300-ENDPOINT1
      * - type2300                       COBOL Name: 300-TYPE2
      * - ica2300                        COBOL Name: 300-ICA2
      * - bin2300                        COBOL Name: 300-BIN2
      * - maid2300                       COBOL Name: 300-MAID2
      * - endpoint2300                   COBOL Name: 300-ENDPOINT2
      * - date300                        COBOL Name: 300-DATE
      * - curDtYymmdd800                 COBOL Name: 800-CUR-DT-YYMMDD
      * - ip67002Yyddd                   COBOL Name: IP67002-YYDDD
      * - fldName800                     COBOL Name: 800-FLD-NAME
      * - sys003300                      COBOL Name: 300-SYS003
      * - sys003RecsRead400              COBOL Name: 400-SYS003-RECS-READ
      * - abendCode3003006               COBOL Name: 300-3006-ABEND-CODE
      * - errorMsg6003006                COBOL Name: 600-3006-ERROR-MSG
      * - para2310300                    COBOL Name: 300-PARA-2310
      *
      * Output :  

      * - newElem800                     COBOL Name: 800-NEW-ELEM
      * - newElemLen800                  COBOL Name: 800-NEW-ELEM-LEN
      * - fldLen800                      COBOL Name: 800-FLD-LEN
      * - newElemValue800                COBOL Name: 800-NEW-ELEM-VALUE
      * - fldValue800                    COBOL Name: 800-FLD-VALUE
      * - type1800                       COBOL Name: 800-TYPE1
      * - ica1800                        COBOL Name: 800-ICA1
      * - bin1800                        COBOL Name: 800-BIN1
      * - maid1800                       COBOL Name: 800-MAID1
      * - endpoint1800                   COBOL Name: 800-ENDPOINT1
      * - type2800                       COBOL Name: 800-TYPE2
      * - ica2800                        COBOL Name: 800-ICA2
      * - bin2800                        COBOL Name: 800-BIN2
      * - maid2800                       COBOL Name: 800-MAID2
      * - endpoint2800                   COBOL Name: 800-ENDPOINT2
      * - curDtYymmdd800                 COBOL Name: 800-CUR-DT-YYMMDD
      * - ip67002Yymmdd                  COBOL Name: IP67002-YYMMDD
      * - ip67002Cntl                    COBOL Name: IP67002-CNTL
      * - julianDate800                  COBOL Name: 800-JULIAN-DATE
      * - ip67002Yyddd                   COBOL Name: IP67002-YYDDD
      * - fileDd6003006                  COBOL Name: 600-3006-FILE-DD
      * - sys003300                      COBOL Name: 300-SYS003
      * - recNum6003006                  COBOL Name: 600-3006-REC-NUM
      * - sys003RecsRead400              COBOL Name: 400-SYS003-RECS-READ
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - abendCode3003006               COBOL Name: 300-3006-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - errorMsg6003006                COBOL Name: 600-3006-ERROR-MSG
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para2310300                    COBOL Name: 300-PARA-2310
      *
      * @throws CFException
      */
      private void storeComnField() throws Exception {
			// Declare local variables used in the method
			NewElemData800 newElemData800 = workAreas800.getNewElemData800();
			CurrentDate800 currentDate800 = workAreas800.getCurrentDate800();
			Ip67002DateRedefined02 ip67002DateRedefined02 = ip67002DateParm.getIp67002DateRedefined02();
			Ip67002Ccyyddd ip67002Ccyyddd = ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd();
			char[] fldName800 = null;
			char[] date300 = null;
			// End of variable declaration

      
// ******************************************************************
// * Store common fields
// ******************************************************************
          fldName800 = work.getFldName800();
          date300 = work.getDate300();
//  EVALUATE 800-FLD-NAME
          if  (		compareChars(fldName800,work.getPds0023300()) == 0 ) { 
//  MOVE 'P002300000000' TO 800-NEW-ELEM
//  LITERAL_P002300000000 = 'P002300000000'
              workAreas800.setNewElem800(CONSTANTS.LITERAL_P002300000000);
//  MOVE 800-FLD-LEN TO 800-NEW-ELEM-LEN
              newElemData800.setNewElemLen800(work.getFldLen800());
  
//  MOVE 800-FLD-VALUE (1 : 800-FLD-LEN ) TO 800-NEW-ELEM-VALUE
              newElemData800.setNewElemValue800(work.getFldValue800(),0/* fldValue800 */,work.getFldLen800(),0 /* newElemValue800 */,newElemData800.getNewElemValue800().length /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
  
//  PERFORM 8000-ADD-COMN-FIELD
              addComnField();/*8000-ADD-COMN-FIELD*/
          }
          else if  (		compareChars(fldName800,work.getPds0148300()) == 0 ) { 
//  MOVE 'P014800000000' TO 800-NEW-ELEM
//  LITERAL_P014800000000 = 'P014800000000'
              workAreas800.setNewElem800(CONSTANTS.LITERAL_P014800000000);
//  MOVE 800-FLD-LEN TO 800-NEW-ELEM-LEN
              newElemData800.setNewElemLen800(work.getFldLen800());
  
//  MOVE 800-FLD-VALUE (1 : 800-FLD-LEN ) TO 800-NEW-ELEM-VALUE
              newElemData800.setNewElemValue800(work.getFldValue800(),0/* fldValue800 */,work.getFldLen800(),0 /* newElemValue800 */,newElemData800.getNewElemValue800().length /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
  
//  PERFORM 8000-ADD-COMN-FIELD
              addComnField();/*8000-ADD-COMN-FIELD*/
          }
          else if  (		compareChars(fldName800,work.getPds0122300()) == 0 ) { 
//  MOVE 'P012200000000' TO 800-NEW-ELEM
//  LITERAL_P012200000000 = 'P012200000000'
              workAreas800.setNewElem800(CONSTANTS.LITERAL_P012200000000);
//  MOVE 800-FLD-LEN TO 800-NEW-ELEM-LEN
              newElemData800.setNewElemLen800(work.getFldLen800());
  
//  MOVE 800-FLD-VALUE (1 : 800-FLD-LEN ) TO 800-NEW-ELEM-VALUE
              newElemData800.setNewElemValue800(work.getFldValue800(),0/* fldValue800 */,work.getFldLen800(),0 /* newElemValue800 */,newElemData800.getNewElemValue800().length /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
  
//  PERFORM 8000-ADD-COMN-FIELD
              addComnField();/*8000-ADD-COMN-FIELD*/
          }
          else if  (		compareChars(fldName800,work.getDe3s1300()) == 0 ) { 
//  MOVE 'D000300010000' TO 800-NEW-ELEM
//  LITERAL_D000300010000 = 'D000300010000'
              workAreas800.setNewElem800(CONSTANTS.LITERAL_D000300010000);
//  MOVE 800-FLD-LEN TO 800-NEW-ELEM-LEN
              newElemData800.setNewElemLen800(work.getFldLen800());
  
//  MOVE 800-FLD-VALUE (1 : 800-FLD-LEN ) TO 800-NEW-ELEM-VALUE
              newElemData800.setNewElemValue800(work.getFldValue800(),0/* fldValue800 */,work.getFldLen800(),0 /* newElemValue800 */,newElemData800.getNewElemValue800().length /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
  
//  PERFORM 8000-ADD-COMN-FIELD
              addComnField();/*8000-ADD-COMN-FIELD*/
          }
          else if  (		compareChars(fldName800,work.getDe42300()) == 0 ) { 
//  MOVE 'D004200000000' TO 800-NEW-ELEM
//  LITERAL_D004200000000 = 'D004200000000'
              workAreas800.setNewElem800(CONSTANTS.LITERAL_D004200000000);
//  MOVE 800-FLD-LEN TO 800-NEW-ELEM-LEN
              newElemData800.setNewElemLen800(work.getFldLen800());
  
//  MOVE 800-FLD-VALUE (1 : 800-FLD-LEN ) TO 800-NEW-ELEM-VALUE
              newElemData800.setNewElemValue800(work.getFldValue800(),0/* fldValue800 */,work.getFldLen800(),0 /* newElemValue800 */,newElemData800.getNewElemValue800().length /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
  
//  PERFORM 8000-ADD-COMN-FIELD
              addComnField();/*8000-ADD-COMN-FIELD*/
          }
          else if  (		compareChars(fldName800,work.getDe43s2300()) == 0 ) { 
//  MOVE 'D004300020000' TO 800-NEW-ELEM
//  LITERAL_D004300020000 = 'D004300020000'
              workAreas800.setNewElem800(CONSTANTS.LITERAL_D004300020000);
//  MOVE 800-FLD-LEN TO 800-NEW-ELEM-LEN
              newElemData800.setNewElemLen800(work.getFldLen800());
  
//  MOVE 800-FLD-VALUE (1 : 800-FLD-LEN ) TO 800-NEW-ELEM-VALUE
              newElemData800.setNewElemValue800(work.getFldValue800(),0/* fldValue800 */,work.getFldLen800(),0 /* newElemValue800 */,newElemData800.getNewElemValue800().length /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
  
//  PERFORM 8000-ADD-COMN-FIELD
              addComnField();/*8000-ADD-COMN-FIELD*/
          }
          else if  (		compareChars(fldName800,work.getDe43s3300()) == 0 ) { 
//  MOVE 'D004300030000' TO 800-NEW-ELEM
//  LITERAL_D004300030000 = 'D004300030000'
              workAreas800.setNewElem800(CONSTANTS.LITERAL_D004300030000);
//  MOVE 800-FLD-LEN TO 800-NEW-ELEM-LEN
              newElemData800.setNewElemLen800(work.getFldLen800());
  
//  MOVE 800-FLD-VALUE (1 : 800-FLD-LEN ) TO 800-NEW-ELEM-VALUE
              newElemData800.setNewElemValue800(work.getFldValue800(),0/* fldValue800 */,work.getFldLen800(),0 /* newElemValue800 */,newElemData800.getNewElemValue800().length /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
  
//  PERFORM 8000-ADD-COMN-FIELD
              addComnField();/*8000-ADD-COMN-FIELD*/
          }
          else if  (		compareChars(fldName800,work.getDe43s4300()) == 0 ) { 
//  MOVE 'D004300040000' TO 800-NEW-ELEM
//  LITERAL_D004300040000 = 'D004300040000'
              workAreas800.setNewElem800(CONSTANTS.LITERAL_D004300040000);
//  MOVE 800-FLD-LEN TO 800-NEW-ELEM-LEN
              newElemData800.setNewElemLen800(work.getFldLen800());
  
//  MOVE 800-FLD-VALUE (1 : 800-FLD-LEN ) TO 800-NEW-ELEM-VALUE
              newElemData800.setNewElemValue800(work.getFldValue800(),0/* fldValue800 */,work.getFldLen800(),0 /* newElemValue800 */,newElemData800.getNewElemValue800().length /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
  
//  PERFORM 8000-ADD-COMN-FIELD
              addComnField();/*8000-ADD-COMN-FIELD*/
          }
          else if  (		compareChars(fldName800,work.getDe43s5300()) == 0 ) { 
//  MOVE 'D004300050000' TO 800-NEW-ELEM
//  LITERAL_D004300050000 = 'D004300050000'
              workAreas800.setNewElem800(CONSTANTS.LITERAL_D004300050000);
//  MOVE 800-FLD-LEN TO 800-NEW-ELEM-LEN
              newElemData800.setNewElemLen800(work.getFldLen800());
  
//  MOVE 800-FLD-VALUE (1 : 800-FLD-LEN ) TO 800-NEW-ELEM-VALUE
              newElemData800.setNewElemValue800(work.getFldValue800(),0/* fldValue800 */,work.getFldLen800(),0 /* newElemValue800 */,newElemData800.getNewElemValue800().length /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
  
//  PERFORM 8000-ADD-COMN-FIELD
              addComnField();/*8000-ADD-COMN-FIELD*/
          }
          else if  (		compareChars(fldName800,work.getDe43s6300()) == 0 ) { 
//  MOVE 'D004300060000' TO 800-NEW-ELEM
//  LITERAL_D004300060000 = 'D004300060000'
              workAreas800.setNewElem800(CONSTANTS.LITERAL_D004300060000);
//  MOVE 800-FLD-LEN TO 800-NEW-ELEM-LEN
              newElemData800.setNewElemLen800(work.getFldLen800());
  
//  MOVE 800-FLD-VALUE (1 : 800-FLD-LEN ) TO 800-NEW-ELEM-VALUE
              newElemData800.setNewElemValue800(work.getFldValue800(),0/* fldValue800 */,work.getFldLen800(),0 /* newElemValue800 */,newElemData800.getNewElemValue800().length /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
  
//  PERFORM 8000-ADD-COMN-FIELD
              addComnField();/*8000-ADD-COMN-FIELD*/
          }
          else if  (		compareChars(fldName800,work.getDe49300()) == 0 ) { 
//  MOVE 'D004900000000' TO 800-NEW-ELEM
//  LITERAL_D004900000000 = 'D004900000000'
              workAreas800.setNewElem800(CONSTANTS.LITERAL_D004900000000);
//  MOVE 800-FLD-LEN TO 800-NEW-ELEM-LEN
              newElemData800.setNewElemLen800(work.getFldLen800());
  
//  MOVE 800-FLD-VALUE (1 : 800-FLD-LEN ) TO 800-NEW-ELEM-VALUE
              newElemData800.setNewElemValue800(work.getFldValue800(),0/* fldValue800 */,work.getFldLen800(),0 /* newElemValue800 */,newElemData800.getNewElemValue800().length /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
  
//  PERFORM 8000-ADD-COMN-FIELD
              addComnField();/*8000-ADD-COMN-FIELD*/
          }
          else if  (		compareChars(fldName800,work.getDe26300()) == 0 ) { 
//  MOVE 'D002600000000' TO 800-NEW-ELEM
//  LITERAL_D002600000000 = 'D002600000000'
              workAreas800.setNewElem800(CONSTANTS.LITERAL_D002600000000);
//  MOVE 800-FLD-LEN TO 800-NEW-ELEM-LEN
              newElemData800.setNewElemLen800(work.getFldLen800());
  
//  MOVE 800-FLD-VALUE (1 : 800-FLD-LEN ) TO 800-NEW-ELEM-VALUE
              newElemData800.setNewElemValue800(work.getFldValue800(),0/* fldValue800 */,work.getFldLen800(),0 /* newElemValue800 */,newElemData800.getNewElemValue800().length /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
  
//  PERFORM 8000-ADD-COMN-FIELD
              addComnField();/*8000-ADD-COMN-FIELD*/
          }
          else if  (		compareChars(fldName800,work.getDe22300()) == 0 ) { 
//  MOVE 'D002200000000' TO 800-NEW-ELEM
//  LITERAL_D002200000000 = 'D002200000000'
              workAreas800.setNewElem800(CONSTANTS.LITERAL_D002200000000);
//  MOVE 800-FLD-LEN TO 800-NEW-ELEM-LEN
              newElemData800.setNewElemLen800(work.getFldLen800());
  
//  MOVE 800-FLD-VALUE (1 : 800-FLD-LEN ) TO 800-NEW-ELEM-VALUE
              newElemData800.setNewElemValue800(work.getFldValue800(),0/* fldValue800 */,work.getFldLen800(),0 /* newElemValue800 */,newElemData800.getNewElemValue800().length /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
  
//  PERFORM 8000-ADD-COMN-FIELD
              addComnField();/*8000-ADD-COMN-FIELD*/
          }
          else if  (		compareChars(fldName800,work.getType1300()) == 0 ) { 
//  MOVE 800-FLD-VALUE (1 : 800-FLD-LEN ) TO 800-TYPE1
              workAreas800.setType1800(work.getFldValue800(),0/* fldValue800 */,work.getFldLen800(),0 /* type1800 */,workAreas800.getType1800().length /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
          }
          else if  (		compareChars(fldName800,work.getIca1300()) == 0 ) { 
//  MOVE 800-FLD-VALUE (1 : 800-FLD-LEN ) TO 800-ICA1
              try {
              workAreas800.setIca1800(CFUtil.getLong(substring(work.getFldValue800(),0,work.getFldLen800())));
              } catch(NumberFormatException e) {}
          }
          else if  (		compareChars(fldName800,work.getBin1300()) == 0 ) { 
//  MOVE 800-FLD-VALUE (1 : 800-FLD-LEN ) TO 800-BIN1
              try {
              workAreas800.setBin1800(CFUtil.getLong(substring(work.getFldValue800(),0,work.getFldLen800())));
              } catch(NumberFormatException e) {}
          }
          else if  (		compareChars(fldName800,work.getMaid1300()) == 0 ) { 
//  MOVE 800-FLD-VALUE (1 : 800-FLD-LEN ) TO 800-MAID1
              try {
              workAreas800.setMaid1800(CFUtil.getLong(substring(work.getFldValue800(),0,work.getFldLen800())));
              } catch(NumberFormatException e) {}
          }
          else if  (		compareChars(fldName800,work.getEndpoint1300()) == 0 ) { 
//  MOVE 800-FLD-VALUE (1 : 800-FLD-LEN ) TO 800-ENDPOINT1
              try {
              workAreas800.setEndpoint1800(CFUtil.getLong(substring(work.getFldValue800(),0,work.getFldLen800())));
              } catch(NumberFormatException e) {}
          }
          else if  (		compareChars(fldName800,work.getType2300()) == 0 ) { 
//  MOVE 800-FLD-VALUE (1 : 800-FLD-LEN ) TO 800-TYPE2
              workAreas800.setType2800(work.getFldValue800(),0/* fldValue800 */,work.getFldLen800(),0 /* type2800 */,workAreas800.getType2800().length /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
          }
          else if  (		compareChars(fldName800,work.getIca2300()) == 0 ) { 
//  MOVE 800-FLD-VALUE (1 : 800-FLD-LEN ) TO 800-ICA2
              try {
              workAreas800.setIca2800(CFUtil.getLong(substring(work.getFldValue800(),0,work.getFldLen800())));
              } catch(NumberFormatException e) {}
          }
          else if  (		compareChars(fldName800,work.getBin2300()) == 0 ) { 
//  MOVE 800-FLD-VALUE (1 : 800-FLD-LEN ) TO 800-BIN2
              try {
              workAreas800.setBin2800(CFUtil.getLong(substring(work.getFldValue800(),0,work.getFldLen800())));
              } catch(NumberFormatException e) {}
          }
          else if  (		compareChars(fldName800,work.getMaid2300()) == 0 ) { 
//  MOVE 800-FLD-VALUE (1 : 800-FLD-LEN ) TO 800-MAID2
              try {
              workAreas800.setMaid2800(CFUtil.getLong(substring(work.getFldValue800(),0,work.getFldLen800())));
              } catch(NumberFormatException e) {}
          }
          else if  (		compareChars(fldName800,work.getEndpoint2300()) == 0 ) { 
//  MOVE 800-FLD-VALUE (1 : 800-FLD-LEN ) TO 800-ENDPOINT2
              try {
              workAreas800.setEndpoint2800(CFUtil.getLong(substring(work.getFldValue800(),0,work.getFldLen800())));
              } catch(NumberFormatException e) {}
          }
          else if  (		compareChars(fldName800,date300) == 0 ) { 
//  MOVE 'D001200010000' TO 800-NEW-ELEM
//  LITERAL_D001200010000 = 'D001200010000'
              workAreas800.setNewElem800(CONSTANTS.LITERAL_D001200010000);
//  MOVE 800-FLD-LEN TO 800-NEW-ELEM-LEN
              newElemData800.setNewElemLen800(work.getFldLen800());
  
//  MOVE 800-CUR-DT-YYMMDD TO 800-NEW-ELEM-VALUE (1 : 6)
              workAreas800.replace(workAreas800/*parent*/,1266/*fromOffset - (newElemValue800) */,6/*fromLen*/,1349/*toOffset - (curDtYymmdd800) */,6/*toLen*/);
  
//  PERFORM 8000-ADD-COMN-FIELD
              addComnField();/*8000-ADD-COMN-FIELD*/

// * Get julian version of process date
              // MOVE 800-CUR-DT-YYMMDD TO IP67002-YYMMDD
              ip67002DateParm.getIp67002DateRedefined02().setIp67002Yymmdd(workAreas800.getCurrentDate800().getCurDtYymmdd800().toCharArray());
  
//  SET 88-IP67002-CONVERT-TO-JULIAN TO TRUE
              ip67002DateParm.setIp67002ConvertToJulian88True(); 
              
//  PERFORM 8800-CALL-DATE-ROUTINE
              callDateRoutine();/*8800-CALL-DATE-ROUTINE*/
              // MOVE IP67002-YYDDD TO 800-JULIAN-DATE
              workAreas800.replace(padSpaces(5,ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().getIp67002Yyddd().toCharArray()), /* beginIndex */1297, /* length */5);
  
          }
          else   { 
//  DISPLAY 'IP989010:FIELDNAME=' 800-FLD-NAME
              logger.info("IP989010:FIELDNAME={}", new String(work.getFldName800())); 
//  MOVE 300-SYS003 TO 600-3006-FILE-DD
              errorMsg6003006.setFileDd6003006(work.getSys003300());
//  MOVE 400-SYS003-RECS-READ TO 600-3006-REC-NUM
              errorMsg6003006.setRecNum6003006( work.getSys003RecsRead400());
//  MOVE 300-3006-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(String.valueOf(work.getAbendCode3003006String()).toCharArray());
              // MOVE 600-3006-ERROR-MSG TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(errorMsg6003006.toCharArray());
//  MOVE 300-PARA-2310 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara2310300());
//  PERFORM 9100-ABEND-PROGRAM
              abendProgram();/*9100-ABEND-PROGRAM*/
          }
  
      
      }
      /**
      * copyComnFldsTo1240200 
      *   This method is derived from 
  *   COBOL Paragraph - 2300-COPY-COMN-FLDS-TO-1240200 COBOL Cyclomatic complexity - 5
      * Input  :  

      * - comnNdx500                     COBOL Name: 500-COMN-NDX
      * - comnTblItems500                COBOL Name: 500-COMN-TBL-ITEMS
      * - comnTagKey500                  COBOL Name: 500-COMN-TAG-KEY
      * - comnTagLen500                  COBOL Name: 500-COMN-TAG-LEN
      * - comnTagValue500                COBOL Name: 500-COMN-TAG-VALUE
      *
      * Output :  

      * - comnNdx500                     COBOL Name: 500-COMN-NDX
      * - newElem800                     COBOL Name: 800-NEW-ELEM
      * - comnTagKey500                  COBOL Name: 500-COMN-TAG-KEY
      * - newElemLen800                  COBOL Name: 800-NEW-ELEM-LEN
      * - comnTagLen500                  COBOL Name: 500-COMN-TAG-LEN
      * - newElemValue800                COBOL Name: 800-NEW-ELEM-VALUE
      * - comnTagValue500                COBOL Name: 500-COMN-TAG-VALUE
      *
      * @throws CFException
      */
      private void copyComnFldsTo1240200() throws Exception {
			// Declare local variables used in the method
			NewElemData800 newElemData800 = workAreas800.getNewElemData800();
			ComnTagKey500 comnTagKey500 = comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagKey500();
			// End of variable declaration

      
// ******************************************************************
// * Copy common field so to 1240 200 template
// ******************************************************************
//  PERFORM VARYING 500-COMN-NDX FROM 1 BY 1 UNTIL 500-COMN-NDX > 500-COMN-TBL-ITEMS
          for (comnNdx500 = 1; (	( comnNdx500 <= work.getComnTblItems500() )) ; comnNdx500 = comnNdx500 + 1 ) {
              comnTagKey500 = comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagKey500();
//  IF 500-COMN-TAG-KEY ( 500-COMN-NDX ) (1 : 5) NOT EQUAL 'P0122'
//  LITERAL_P0122 = 'P0122'
              if (!(Field.compareChar(comnTagKey500.toCharArray() , CONSTANTS.LITERAL_P0122 , ( 0 /*start*/ ), 5 /*left len*/ , 5 /*right len*/))) { 
//  MOVE 500-COMN-TAG-KEY ( 500-COMN-NDX ) TO 800-NEW-ELEM
                  workAreas800.setNewElem800(comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagKey500().toCharArray());
//  MOVE 500-COMN-TAG-LEN ( 500-COMN-NDX ) TO 800-NEW-ELEM-LEN
                  newElemData800.setNewElemLen800(comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagData500().getComnTagLen500());
  
//  IF 500-COMN-TAG-LEN ( 500-COMN-NDX ) > 0
                  if (	( comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagData500().getComnTagLen500() > 0 )) { 
//  MOVE 500-COMN-TAG-VALUE ( 500-COMN-NDX ) (1 : 500-COMN-TAG-LEN ( 500-COMN-NDX )) TO 800-NEW-ELEM-VALUE
                      newElemData800.setNewElemValue800(substring(comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagData500().getComnTagValue500(),0,comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagData500().getComnTagLen500()));
  
                  }
//  ELSE
                  else { 
//  MOVE SPACES TO 800-NEW-ELEM-VALUE
                      newElemData800.setNewElemValue800(CONSTANTS.SPACE_999);
  
                  }
//  PERFORM 8200-UPDATE-1240200-FIELD
                  update1240200Field();/*8200-UPDATE-1240200-FIELD*/
              }
  
          }
      
      }
      /**
      * trimField 
      *   This method is derived from 
  *   COBOL Paragraph - 2335-TRIM-FIELD COBOL Cyclomatic complexity - 4
      * Input  :  

      * - fldLen800                      COBOL Name: 800-FLD-LEN
      * - fldValue800                    COBOL Name: 800-FLD-VALUE
      *
      * Output :  

      * - oldFldLen800                   COBOL Name: 800-OLD-FLD-LEN
      * - fldLen800                      COBOL Name: 800-FLD-LEN
      *
      * @throws CFException
      */
      private void trimField() throws Exception {
      
// ******************************************************************
// * Trim trailing spaces from field
// ******************************************************************
//  MOVE 800-FLD-LEN TO 800-OLD-FLD-LEN
          work.setOldFldLen800(work.getFldLen800());
//  PERFORM VARYING 800-OLD-FLD-LEN FROM 800-FLD-LEN BY -1 UNTIL 800-FLD-VALUE ( 800-OLD-FLD-LEN : 1) NOT EQUAL SPACE OR 800-OLD-FLD-LEN = 0 END-PERFORM
          for (work.setOldFldLen800(work.getFldLen800()); (work.getFldValue800()[(work.getOldFldLen800() - 1)] == ' ' && 	( work.getOldFldLen800() != 0 )) ; work.setOldFldLen800(work.getOldFldLen800() + -1) ) {
          }
//  MOVE 800-OLD-FLD-LEN TO 800-FLD-LEN
          work.setFldLen800(work.getOldFldLen800());
      
      }
      /**
      * padFieldWithSpaces 
      *   This method is derived from 
  *   COBOL Paragraph - 2340-PAD-FIELD-WITH-SPACES COBOL Cyclomatic complexity - 1
      * Input  :  

      * - fldLen800                      COBOL Name: 800-FLD-LEN
      * - padLen800                      COBOL Name: 800-PAD-LEN
      *
      * Output :  

      * - oldFldLen800                   COBOL Name: 800-OLD-FLD-LEN
      * - fldLen800                      COBOL Name: 800-FLD-LEN
      * - padLen800                      COBOL Name: 800-PAD-LEN
      * - fldValue800                    COBOL Name: 800-FLD-VALUE
      *
      * @throws CFException
      */
      private void padFieldWithSpaces() throws Exception {
      
// ******************************************************************
// * Pad field with trailing spaces
// ******************************************************************
//  MOVE 800-FLD-LEN TO 800-OLD-FLD-LEN
          work.setOldFldLen800(work.getFldLen800());
//  MOVE 800-PAD-LEN TO 800-FLD-LEN
          work.setFldLen800(work.getPadLen800());
//  MOVE SPACES TO 800-FLD-VALUE ( 800-OLD-FLD-LEN + 1 : 800-PAD-LEN - 800-OLD-FLD-LEN )
          work.setFldValue800(replace(work.getFldValue800(),CONSTANTS.SPACE,(work.getOldFldLen800() + 1-1), (work.getPadLen800() - work.getOldFldLen800() + (work.getOldFldLen800() + 1 - 1)) ));
      
      }
      /**
      * padFieldWithZeroes 
      *   This method is derived from 
  *   COBOL Paragraph - 2350-PAD-FIELD-WITH-ZEROES COBOL Cyclomatic complexity - 1
      * Input  :  

      * - fldLen800                      COBOL Name: 800-FLD-LEN
      * - padLen800                      COBOL Name: 800-PAD-LEN
      * - fldValue800                    COBOL Name: 800-FLD-VALUE
      *
      * Output :  

      * - oldFldLen800                   COBOL Name: 800-OLD-FLD-LEN
      * - fldLen800                      COBOL Name: 800-FLD-LEN
      * - padLen800                      COBOL Name: 800-PAD-LEN
      * - fldStrt800                     COBOL Name: 800-FLD-STRT
      * - newElemValue800                COBOL Name: 800-NEW-ELEM-VALUE
      * - fldValue800                    COBOL Name: 800-FLD-VALUE
      *
      * @throws CFException
      */
      private void padFieldWithZeroes() throws Exception {
      
// ******************************************************************
// * Pad field with leading zeroes
// ******************************************************************
//  MOVE 800-FLD-LEN TO 800-OLD-FLD-LEN
          work.setOldFldLen800(work.getFldLen800());
//  MOVE 800-PAD-LEN TO 800-FLD-LEN
          work.setFldLen800(work.getPadLen800());
          workAreas800.setFldStrt800((long)Math.abs(work.getPadLen800() - work.getOldFldLen800() + 1));
//  MOVE 800-FLD-VALUE (1 : 800-OLD-FLD-LEN ) TO 800-NEW-ELEM-VALUE (1 : 800-OLD-FLD-LEN )
          workAreas800.getNewElemData800().setNewElemValue800(work.getFldValue800(),0/* fldValue800 */ ,work.getOldFldLen800(),0,work.getOldFldLen800() /* field,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE 800-NEW-ELEM-VALUE (1 : 800-OLD-FLD-LEN ) TO 800-FLD-VALUE ( 800-FLD-STRT : 800-OLD-FLD-LEN )
          work.setFldValue800(replace(work.getFldValue800(),substring(workAreas800.getNewElemData800().getNewElemValue800(),0,work.getOldFldLen800()),((int) workAreas800.getFldStrt800()-1), (work.getOldFldLen800() + ((int) workAreas800.getFldStrt800() - 1)) ));
//  MOVE ALL ZEROES TO 800-FLD-VALUE (1 : 800-FLD-STRT - 1)
          work.setFldValue800(replace(work.getFldValue800(),CONSTANTS.ZERO_65,0,(int) (workAreas800.getFldStrt800() - 1)));
      
      }
      /**
      * build1644697 
      *   This method is derived from 
  *   COBOL Paragraph - 2400-BUILD-1644697 COBOL Cyclomatic complexity - 3
      * Input  :  

      * - comnSrchKeyFndSw500            COBOL Name: 500-COMN-SRCH-KEY-FND-SW
      * - comnTagLen500                  COBOL Name: 500-COMN-TAG-LEN
      * - comnTagValue500                COBOL Name: 500-COMN-TAG-VALUE
      * - displayMsgTblsSw1000           COBOL Name: 1000-DISPLAY-MSG-TBLS-SW
      *
      * Output :  

      * - seqNum8800                     COBOL Name: 800-SEQ-NUM-8
      * - newElem800                     COBOL Name: 800-NEW-ELEM
      * - newElemLen800                  COBOL Name: 800-NEW-ELEM-LEN
      * - newElemValue800                COBOL Name: 800-NEW-ELEM-VALUE
      * - comnTblSrchKey500              COBOL Name: 500-COMN-TBL-SRCH-KEY
      * - comnTagLen500                  COBOL Name: 500-COMN-TAG-LEN
      * - comnTagValue500                COBOL Name: 500-COMN-TAG-VALUE
      *
      * @throws CFException
      */
      private void build1644697() throws Exception {
			// Declare local variables used in the method
			NewElemData800 newElemData800 = workAreas800.getNewElemData800();
			ParmData1000 parmData1000 = parms1000.getParmData1000();
			// End of variable declaration

      
// ******************************************************************

// * De071 sequence number
          // MOVE 1 TO 800-SEQ-NUM-8
          workAreas800.setSeqNum8800((long)1);
//  MOVE 'D007100000000' TO 800-NEW-ELEM
//  LITERAL_D007100000000 = 'D007100000000'
          workAreas800.setNewElem800(CONSTANTS.LITERAL_D007100000000);
          // MOVE 8 TO 800-NEW-ELEM-LEN
          workAreas800.getNewElemData800().setNewElemLen800(8);
  
//  MOVE 800-SEQ-NUM-8 TO 800-NEW-ELEM-VALUE
          newElemData800.setNewElemValue800(padSpaces(999, String.valueOf(workAreas800.getSeqNum8800String()).toCharArray()));
  
//  PERFORM 8200-UPDATE-1644697-FIELD
          update1644697Field();/*8200-UPDATE-1644697-FIELD*/

// * Pds0105 fileid

// * Pds0122
//  PERFORM 2420-GENERATE-FILEID
          generateFileid();/*2420-GENERATE-FILEID*/
          // MOVE 'P012200000000' TO 500-COMN-TBL-SRCH-KEY
          //  LITERAL_P012200000000 = 'P012200000000'
          work.setComnTblSrchKey500(CONSTANTS.LITERAL_P012200000000);
//  PERFORM 8300-LOOKUP-COMN-FIELD
          lookupComnField();/*8300-LOOKUP-COMN-FIELD*/
//  IF 500-COMN-SRCH-KEY-FND
          if ( work.isComnSrchKeyFnd500()  ) { 
//  MOVE 500-COMN-TBL-SRCH-KEY TO 800-NEW-ELEM
              workAreas800.setNewElem800(work.getComnTblSrchKey500());
//  MOVE 500-COMN-TAG-LEN ( 500-COMN-NDX ) TO 800-NEW-ELEM-LEN
              newElemData800.setNewElemLen800(comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagData500().getComnTagLen500());
  
//  MOVE 500-COMN-TAG-VALUE ( 500-COMN-NDX ) TO 800-NEW-ELEM-VALUE
              newElemData800.setNewElemValue800(comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagData500().getComnTagValue500());
  
//  PERFORM 8200-UPDATE-1644697-FIELD
              update1644697Field();/*8200-UPDATE-1644697-FIELD*/
          }
          parmData1000 = parms1000.getParmData1000();
//  IF 1000-DISPLAY-MSG-TBLS
          if ( parmData1000.isDisplayMsgTbls1000()  ) { 
//  DISPLAY '1000-DISPLAY-MSG-TBLS'
              logger.info("1000-DISPLAY-MSG-TBLS"); 
//  PERFORM 8400-DISPLAY-1644697-TABLE
              display1644697Table();/*8400-DISPLAY-1644697-TABLE*/
          }
  
      
      }
      /**
      * generateFileid 
      *   This method is derived from 
  *   COBOL Paragraph - 2420-GENERATE-FILEID COBOL Cyclomatic complexity - 1
      * Input  :  

      * - curDtYymmdd800                 COBOL Name: 800-CUR-DT-YYMMDD
      * - randomP4P8800                  COBOL Name: 800-RANDOM-P4-P8
      * - fieldVal800                    COBOL Name: 800-FIELD-VAL
      *
      * Output :  

      * - newElem800                     COBOL Name: 800-NEW-ELEM
      * - newElemLen800                  COBOL Name: 800-NEW-ELEM-LEN
      * - newElemValue800                COBOL Name: 800-NEW-ELEM-VALUE
      * - curDtYymmdd800                 COBOL Name: 800-CUR-DT-YYMMDD
      * - seed800                        COBOL Name: 800-SEED
      * - random800                      COBOL Name: 800-RANDOM
      * - randomP4P8800                  COBOL Name: 800-RANDOM-P4-P8
      * - tblSrchKey5001644697           COBOL Name: 500-1644697-TBL-SRCH-KEY
      * - fileid800                      COBOL Name: 800-FILEID
      * - fieldVal800                    COBOL Name: 800-FIELD-VAL
      *
      * @throws CFException
      */
      private void generateFileid() throws Exception {
			// Declare local variables used in the method
			NewElemData800 newElemData800 = workAreas800.getNewElemData800();
			CurrentDate800 currentDate800 = workAreas800.getCurrentDate800();
			Random random = new Random(123);
			RandomX800 randomX800 = workAreas800.getRandomX800();
			// End of variable declaration

      
// ******************************************************************
// * Generate a "unique" logical file id
// ******************************************************************

// * P0105s3 processor id
//  MOVE 'P010500020000' TO 800-NEW-ELEM
//  LITERAL_P010500020000 = 'P010500020000'
          workAreas800.setNewElem800(CONSTANTS.LITERAL_P010500020000);
          // MOVE 6 TO 800-NEW-ELEM-LEN
          workAreas800.getNewElemData800().setNewElemLen800(6);
  
//  MOVE 800-CUR-DT-YYMMDD TO 800-NEW-ELEM-VALUE (1 : 800-NEW-ELEM-LEN )
          workAreas800.replace(workAreas800/*parent*/,1266/*fromOffset - (newElemValue800) */,6/*fromLen*/,1349/*toOffset - (curDtYymmdd800) */,workAreas800.getNewElemData800().getNewElemLen800()/*toLen*/);
  
//  PERFORM 8200-UPDATE-1644697-FIELD
          update1644697Field();/*8200-UPDATE-1644697-FIELD*/
//  PERFORM 8200-UPDATE-1644695-FIELD
          update1644695Field();/*8200-UPDATE-1644695-FIELD*/

// * P0105s3 processor id
//  MOVE 'P010500030000' TO 800-NEW-ELEM
//  LITERAL_P010500030000 = 'P010500030000'
          workAreas800.setNewElem800(CONSTANTS.LITERAL_P010500030000);
          // MOVE 11 TO 800-NEW-ELEM-LEN
          workAreas800.getNewElemData800().setNewElemLen800(11);
  
//  MOVE '00000001662' TO 800-NEW-ELEM-VALUE (1 : 800-NEW-ELEM-LEN )
//  LITERAL_00000001662 = '00000001662'
          workAreas800.getNewElemData800().setNewElemValue800(replace(workAreas800.getNewElemData800().getNewElemValue800(),CONSTANTS.LITERAL_00000001662,0,workAreas800.getNewElemData800().getNewElemLen800()));
//  PERFORM 8200-UPDATE-1644697-FIELD
          update1644697Field();/*8200-UPDATE-1644697-FIELD*/
//  PERFORM 8200-UPDATE-1644695-FIELD
          update1644695Field();/*8200-UPDATE-1644695-FIELD*/

// * P0105s4 file sequence number
//  MOVE FUNCTION CURRENT-DATE (9 : 8) TO 800-SEED
          workAreas800.setSeed800(CFUtil.getCurrentDate(timeZoneId));
          workAreas800.setRandom800(BigDecimal.valueOf((new Random(workAreas800.getSeed800())).nextDouble()));
//  MOVE 'P010500040000' TO 800-NEW-ELEM
//  LITERAL_P010500040000 = 'P010500040000'
          workAreas800.setNewElem800(CONSTANTS.LITERAL_P010500040000);
          // MOVE 5 TO 800-NEW-ELEM-LEN
          workAreas800.getNewElemData800().setNewElemLen800(5);
  
//  MOVE 800-RANDOM-P4-P8 TO 800-NEW-ELEM-VALUE (1 : 5)
          workAreas800.replace(workAreas800/*parent*/,2378/*fromOffset - (newElemValue800) */,5/*fromLen*/,1349/*toOffset - (randomP4P8800) */,5/*toLen*/);
  
//  PERFORM 8200-UPDATE-1644697-FIELD
          update1644697Field();/*8200-UPDATE-1644697-FIELD*/
//  PERFORM 8200-UPDATE-1644695-FIELD
          update1644695Field();/*8200-UPDATE-1644695-FIELD*/
          // MOVE 'P010500000000' TO 500-1644697-TBL-SRCH-KEY
          //  LITERAL_P010500000000 = 'P010500000000'
          work.setTblSrchKey5001644697(CONSTANTS.LITERAL_P010500000000);
//  PERFORM 8500-GET-1644697-FIELD
          get1644697Field();/*8500-GET-1644697-FIELD*/
//  MOVE 800-FIELD-VAL (1 : 800-FIELD-LEN ) TO 800-FILEID
          workAreas800.replace(workAreas800/*parent*/,239/*fromOffset - (fileid800) */,workAreas800.getFieldLen800()/*fromLen*/,1238/*toOffset - (fieldVal800) */,25/*toLen*/);
      
      }
      /**
      * build1644695 
      *   This method is derived from 
  *   COBOL Paragraph - 2600-BUILD-1644695 COBOL Cyclomatic complexity - 2
      * Input  :  

      * - seqNum8800                     COBOL Name: 800-SEQ-NUM-8
      * - displayMsgTblsSw1000           COBOL Name: 1000-DISPLAY-MSG-TBLS-SW
      *
      * Output :  

      * - seqNum8800                     COBOL Name: 800-SEQ-NUM-8
      * - newElem800                     COBOL Name: 800-NEW-ELEM
      * - newElemLen800                  COBOL Name: 800-NEW-ELEM-LEN
      * - newElemValue800                COBOL Name: 800-NEW-ELEM-VALUE
      *
      * @throws CFException
      */
      private void build1644695() throws Exception {
			// Declare local variables used in the method
			NewElemData800 newElemData800 = workAreas800.getNewElemData800();
			ParmData1000 parmData1000 = parms1000.getParmData1000();
			// End of variable declaration

      
// ******************************************************************
// * Build 1644 695 trailer record
// ******************************************************************

// * De071 sequence number
//  ADD 1 TO 800-SEQ-NUM-8
          workAreas800.setSeqNum8800(workAreas800.getSeqNum8800()+(long)1);
//  MOVE 'D007100000000' TO 800-NEW-ELEM
//  LITERAL_D007100000000 = 'D007100000000'
          workAreas800.setNewElem800(CONSTANTS.LITERAL_D007100000000);
          // MOVE 8 TO 800-NEW-ELEM-LEN
          workAreas800.getNewElemData800().setNewElemLen800(8);
  
//  MOVE 800-SEQ-NUM-8 TO 800-NEW-ELEM-VALUE
          newElemData800.setNewElemValue800(padSpaces(999, String.valueOf(workAreas800.getSeqNum8800String()).toCharArray()));
  
//  PERFORM 8200-UPDATE-1644695-FIELD
          update1644695Field();/*8200-UPDATE-1644695-FIELD*/
          parmData1000 = parms1000.getParmData1000();
//  IF 1000-DISPLAY-MSG-TBLS
          if ( parmData1000.isDisplayMsgTbls1000()  ) { 
//  PERFORM 8400-DISPLAY-1644695-TABLE
              display1644695Table();/*8400-DISPLAY-1644695-TABLE*/
          }
  
      
      }
      /**
      * processDetailFields 
      *   This method is derived from 
  *   COBOL Paragraph - 2500-PROCESS-DETAIL-FIELDS COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void processDetailFields() throws Exception {
      
// ******************************************************************
// * Process detail fields
// ******************************************************************
//  PERFORM 2510-MATCH-PAN-ALIAS
          matchPanAlias();/*2510-MATCH-PAN-ALIAS*/
//  PERFORM 2520-ACCUMULATE-AMOUNT
          accumulateAmount();/*2520-ACCUMULATE-AMOUNT*/
          ;
      
      }
      /**
      * matchPanAlias 
      *   This method is derived from 
  *   COBOL Paragraph - 2510-MATCH-PAN-ALIAS COBOL Cyclomatic complexity - 9
      * Input  :  

      * - ip98901PanAlias                COBOL Name: IP98901-PAN-ALIAS
      * - ip98902PanAlias                COBOL Name: IP98902-PAN-ALIAS
      * - ip98902Pan                     COBOL Name: IP98902-PAN
      * - donationAmount800              COBOL Name: 800-DONATION-AMOUNT
      * - ip98902DonationUpperLimit      COBOL Name: IP98902-DONATION-UPPER-LIMIT
      * - ird800                         COBOL Name: 800-IRD
      * - value75300                     COBOL Name: 300-VALUE-75
      * - value01300                     COBOL Name: 300-VALUE-01
      * - valueWa300                     COBOL Name: 300-VALUE-WA
      * - eofSys001Sw100                 COBOL Name: 100-EOF-SYS001-SW
      *
      * Output :  

      * - pan800                         COBOL Name: 800-PAN
      * - ip98902Pan                     COBOL Name: IP98902-PAN
      * - trnAmt8001240                  COBOL Name: 800-1240-TRN-AMT
      * - donationAmount800              COBOL Name: 800-DONATION-AMOUNT
      * - ip9890hPaymentFileData         COBOL Name: IP9890H-PAYMENT-FILE-DATA
      * - allRecordsPrcd100              COBOL Name: 100-ALL-RECORDS-PRCD
      *
      * @throws CFException
      */
      private void matchPanAlias() throws Exception {
			// Declare local variables used in the method
			char[] ip98901PanAlias = null;
			char[] ip98902PanAlias = null;
			char[] ird800 = null;
			char[] value75300 = null;
			char[] value01300 = null;
			char[] valueWa300 = null;
			long donationAmount800 = 0;
			long trnAmt8001240 = 0;
			int ip98902DonationUpperLimit = 0;
			// End of variable declaration

//  IF IP98901-PAN-ALIAS = IP98902-PAN-ALIAS
          ip98901PanAlias = ip98901PaymentFileData.getIp98901PanAlias();
          ip98902PanAlias = ip98902RegistrationFileData.getIp98902PanAlias();
//  ELSE
          if (		compareChars(ip98901PanAlias,ip98902PanAlias) != 0 ) { 
//  MOVE IP98902-PAN TO 800-PAN
              workAreas800.setPan800(ip98902RegistrationFileData.getIp98902Pan());
              ip98902DonationUpperLimit = ip98902RegistrationFileData.getIp98902DonationUpperLimit();
              donationAmount800 = workAreas800.getDonationAmount800();
//  IF 800-DONATION-AMOUNT GREATER THAN OR EQUAL IP98902-DONATION-UPPER-LIMIT
              if (	( donationAmount800 >= ip98902DonationUpperLimit ) ) { 
                  workAreas800.setTrnAmt8001240((long)Math.abs(ip98902RegistrationFileData.getIp98902DonationUpperLimit()));
              }
  
//  ELSE
              else { 
                  workAreas800.setTrnAmt8001240((long)Math.abs(workAreas800.getDonationAmount800()));
              }
//  PERFORM 2510-DETERMINE-IRD
              determineIrd();/*2510-DETERMINE-IRD*/

// *** If final donation amount is zeroes, 1240 will not be built
// *** if ird is not determined          , 1240 will not be built
// *** above exception records will be written in separate file sys20
              trnAmt8001240 = workAreas800.getTrnAmt8001240();
//  IF 800-1240-TRN-AMT NOT EQUAL TO ZEROES
              if (	( trnAmt8001240 != 0 ) ) { 
                  value75300 = work.getValue75300();
                  valueWa300 = work.getValueWa300();
                  ird800 = workAreas800.getIrd800();
                  value01300 = work.getValue01300();
//  IF 800-IRD EQUAL TO 300-VALUE-75 OR 300-VALUE-01 OR 300-VALUE-WA
                  if (		compareChars(ird800,value75300) == 0  || 		compareChars(ird800,value01300) == 0  || 		compareChars(ird800,valueWa300) == 0 ) { 
//  PERFORM 2511-BUILD-1240200
                      build1240200();/*2511-BUILD-1240200*/
//  PERFORM 8550-WRITE-1240200
                      write1240200();/*8550-WRITE-1240200*/
//  PERFORM 2513-ACCUMULATE-COUNTS
                      accumulateCounts();/*2513-ACCUMULATE-COUNTS*/
                  }
  
//  ELSE
                  else { 
//  PERFORM 8600-WRITE-EXCEPTION-RECORDS
                      writeExceptionRecords();/*8600-WRITE-EXCEPTION-RECORDS*/
                  }
              }
  
              // MOVE ZEROES TO 800-DONATION-AMOUNT
              workAreas800.setDonationAmount800(0);
//  INITIALIZE IP9890H-PAYMENT-FILE-DATA
              ip9890hPaymentFileData.initialize();
              // MOVE ZEROES TO 800-1240-TRN-AMT
              workAreas800.setTrnAmt8001240(0);
//  MOVE SPACES TO 800-PAN
              workAreas800.setPan800(CONSTANTS.SPACE_16);
//  IF 100-EOF-SYS001
              if ( work.isEofSys001100()  ) { 
//  SET 88-100-ALL-RECORDS-PRCD-Y TO TRUE
                  work.setAllRecordsPrcdY88100True(); 
                  
              }
//  ELSE
              else { 
//  PERFORM 2512-SEARCH-REGISTRATIN-TABLE
                  searchRegistratinTable();/*2512-SEARCH-REGISTRATIN-TABLE*/
              }
          }
  
      
      }
      /**
      * accumulateCounts 
      *   This method is derived from 
  *   COBOL Paragraph - 2513-ACCUMULATE-COUNTS COBOL Cyclomatic complexity - 1
      * Input  :  

      * - ip98902PanAlias                COBOL Name: IP98902-PAN-ALIAS
      * - ip98902DonationUpperLimit      COBOL Name: IP98902-DONATION-UPPER-LIMIT
      * - donationAmount800              COBOL Name: 800-DONATION-AMOUNT
      * - trnAmt8001240                  COBOL Name: 800-1240-TRN-AMT
      * - rowCount501                    COBOL Name: 501-ROW-COUNT
      *
      * Output :  

      * - panAlias501                    COBOL Name: 501-PAN-ALIAS
      * - ip98902PanAlias                COBOL Name: IP98902-PAN-ALIAS
      * - donationLimit501               COBOL Name: 501-DONATION-LIMIT
      * - ip98902DonationUpperLimit      COBOL Name: IP98902-DONATION-UPPER-LIMIT
      * - calcDonationAmt501             COBOL Name: 501-CALC-DONATION-AMT
      * - donationAmount800              COBOL Name: 800-DONATION-AMOUNT
      * - builtDonationAmt501            COBOL Name: 501-BUILT-DONATION-AMT
      * - trnAmt8001240                  COBOL Name: 800-1240-TRN-AMT
      * - displayIdx501                  COBOL Name: 501-DISPLAY-IDX
      * - rowCount501                    COBOL Name: 501-ROW-COUNT
      *
      * @throws CFException
      */
      private void accumulateCounts() throws Exception {
//  MOVE IP98902-PAN-ALIAS TO 501-PAN-ALIAS ( 501-DISPLAY-IDX )
          displayTable501.getDisplayData501(displayIdx501 - 1).setPanAlias501(ip98902RegistrationFileData.getIp98902PanAlias());
//  MOVE IP98902-DONATION-UPPER-LIMIT TO 501-DONATION-LIMIT ( 501-DISPLAY-IDX )
          displayTable501.getDisplayData501(displayIdx501 - 1).setDonationLimit501( ip98902RegistrationFileData.getIp98902DonationUpperLimit());
//  MOVE 800-DONATION-AMOUNT TO 501-CALC-DONATION-AMT ( 501-DISPLAY-IDX )
          displayTable501.getDisplayData501(displayIdx501 - 1).setCalcDonationAmt501(workAreas800.getDonationAmount800());
//  MOVE 800-1240-TRN-AMT TO 501-BUILT-DONATION-AMT ( 501-DISPLAY-IDX )
          displayTable501.getDisplayData501(displayIdx501 - 1).setBuiltDonationAmt501(workAreas800.getTrnAmt8001240());
//  SET 501-DISPLAY-IDX UP BY 1
          displayIdx501++; 
          
//  ADD 1 TO 501-ROW-COUNT
          work.setRowCount501(work.getRowCount501()+1);
      
      }
      /**
      * searchRegistratinTable 
      *   This method is derived from 
  *   COBOL Paragraph - 2512-SEARCH-REGISTRATIN-TABLE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sys002Data500                  COBOL Name: 500-SYS002-DATA
      * - ip98901PanAlias                COBOL Name: IP98901-PAN-ALIAS
      * - abendCode3003017               COBOL Name: 300-3017-ABEND-CODE
      * - errorMsg6003017                COBOL Name: 600-3017-ERROR-MSG
      * - para2512300                    COBOL Name: 300-PARA-2512
      * - panAlias500                    COBOL Name: 500-PAN-ALIAS
      * - registrationFileData500        COBOL Name: 500-REGISTRATION-FILE-DATA
      * - ip98901PaymentFileData         COBOL Name: IP98901-PAYMENT-FILE-DATA
      *
      * Output :  

      * - sys002Idx500                   COBOL Name: 500-SYS002-IDX
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - abendCode3003017               COBOL Name: 300-3017-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - errorMsg6003017                COBOL Name: 600-3017-ERROR-MSG
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para2512300                    COBOL Name: 300-PARA-2512
      * - ip98902RegistrationFileData    COBOL Name: IP98902-REGISTRATION-FILE-DATA
      * - registrationFileData500        COBOL Name: 500-REGISTRATION-FILE-DATA
      * - ip9890hPaymentFileData         COBOL Name: IP9890H-PAYMENT-FILE-DATA
      * - ip98901PaymentFileData         COBOL Name: IP98901-PAYMENT-FILE-DATA
      *
      * @throws CFException
      */
      private void searchRegistratinTable() throws Exception {
			// Declare local variables used in the method
			boolean keepSearching = true;
			int[] searchIndexes = null;
			int searchLowPoint = 0;
			int searchMidPoint = 0;
			int searchHighPoint = 0;
			int searchCompare = 0;
			char[] ip98901PanAlias = null;
			// End of variable declaration

//  SET 500-SYS002-IDX TO 1
          sys002Idx500 = 1; 
          
          ip98901PanAlias = ip98901PaymentFileData.getIp98901PanAlias();
//  SEARCH ALL 500-SYS002-DATA
          // Binary Search through sys002Table500.sys002Data500
          searchLowPoint = 0; //prevLowValue
          searchHighPoint = work.getRowCount500(); //prevHighValue
          searchMidPoint = searchHighPoint / 2; //starting at mid point
          searchIndexes = new int[]{searchLowPoint,searchMidPoint,searchHighPoint};
          keepSearching = true;
          while (keepSearching) {
          // compare logic below
             searchCompare = compareAscending(sys002Table500.getSys002Data500(searchMidPoint).getRegistrationFileData500().getPanAlias500(),ip98901PanAlias);
          // end of compare logic
          	if (searchCompare == 0 ) { // if search found
          	      keepSearching = false;
          	     sys002Idx500 = searchMidPoint	 + 1;
//  MOVE 500-REGISTRATION-FILE-DATA ( 500-SYS002-IDX ) TO IP98902-REGISTRATION-FILE-DATA
              ip98902RegistrationFileData.setString(sys002Table500.getSys002Data500(sys002Idx500 - 1).getRegistrationFileData500().toCharArray());
              // MOVE IP98901-PAYMENT-FILE-DATA TO IP9890H-PAYMENT-FILE-DATA
              ip9890hPaymentFileData.setString(ip98901PaymentFileData.getCharArray());
          	} else  {
          		adjustSearchIndex(searchCompare,searchIndexes);
          		searchLowPoint  = searchIndexes[0];
           		searchMidPoint  = searchIndexes[1];
           		searchHighPoint = searchIndexes[2];
           		if (searchMidPoint == -1) { // search exhausted
           		    keepSearching = false; 

// **** Pan not matched abend
//  DISPLAY 'MISSING PAN ALIAS : ' IP98901-PAN-ALIAS
              logger.info("MISSING PAN ALIAS : {}", new String(ip98901PaymentFileData.getIp98901PanAlias())); 
//  MOVE 300-3017-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(String.valueOf(work.getAbendCode3003017String()).toCharArray());
//  MOVE 600-3017-ERROR-MSG TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(pad(99,work.getErrorMsg6003017(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-2512 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara2512300());
//  PERFORM 9100-ABEND-PROGRAM
              abendProgram();/*9100-ABEND-PROGRAM*/
           		}
          	}
          }
  
      
      }
      /**
      * determineIrd 
      *   This method is derived from 
  *   COBOL Paragraph - 2510-DETERMINE-IRD COBOL Cyclomatic complexity - 10
      * Input  :  

      * - pan800                         COBOL Name: 800-PAN
      * - ip00404EntriesFoundCount       COBOL Name: IP00404-ENTRIES-FOUND-COUNT
      * - ip00404AcctRngIndex            COBOL Name: IP00404-ACCT-RNG-INDEX
      * - ip00404LicensedProdId          COBOL Name: IP00404-LICENSED-PROD-ID
      * - value75300                     COBOL Name: 300-VALUE-75
      * - value01300                     COBOL Name: 300-VALUE-01
      * - valueWa300                     COBOL Name: 300-VALUE-WA
      * - value65300                     COBOL Name: 300-VALUE-65
      *
      * Output :  

      * - ird800                         COBOL Name: 800-IRD
      * - irdSelected100                 COBOL Name: 100-IRD-SELECTED
      * - brandProduct800                COBOL Name: 800-BRAND-PRODUCT
      * - ip00404Tbl40ArH                COBOL Name: IP00404-TBL-40-AR-H
      * - pan800                         COBOL Name: 800-PAN
      * - rc                             COBOL Name: RETURN-CODE
      * - ip00404AcctRngIndex            COBOL Name: IP00404-ACCT-RNG-INDEX
      * - ip00404LicensedProdId          COBOL Name: IP00404-LICENSED-PROD-ID
      * - value75300                     COBOL Name: 300-VALUE-75
      * - value01300                     COBOL Name: 300-VALUE-01
      * - valueWa300                     COBOL Name: 300-VALUE-WA
      * - value65300                     COBOL Name: 300-VALUE-65
      *
      * @throws CFException
      */
      private void determineIrd() throws Exception {
			// Declare local variables used in the method
			Ip00404ArRangeGrp ip00404ArRangeGrp = ip00404Table.getIp00404ArRangeGrp();
			int ip00404EntriesFoundCount = 0;
			// End of variable declaration


// * Pds158s4 - ird (based on brand product)
//  MOVE SPACES TO 800-IRD
          workAreas800.setIrd800(CONSTANTS.SPACE_2);
//  SET 88-100-IRD-SELECTED-N TO TRUE
          work.setIrdSelectedN88100True(); 
          
//  MOVE SPACES TO 800-BRAND-PRODUCT
          work.setBrandProduct800(CONSTANTS.SPACE_3);
//  MOVE ZEROES TO IP00404-TBL-40-AR-H
          ip00404ArRangeGrp.setIp00404Tbl40ArH(CONSTANTS.ZERO_19);
  
//  MOVE 800-PAN (1 : 16) TO IP00404-TBL-40-AR-H (1 : 16)
          ip00404Table.replace(workAreas800/*parent*/,2348/*fromOffset - (ip00404Tbl40ArH) */,16/*fromLen*/,4/*toOffset - (pan800) */,16/*toLen*/);
//  CALL 800-PTR-IP280010
          // CALL 800-PTR-IP280010
          	this.setRc( ip280010.process());
          ip00404EntriesFoundCount = ip00404Table.getIp00404EntriesFoundCount();
//  IF IP00404-ENTRIES-FOUND-COUNT IS GREATER THAN ZERO
          if (	( ip00404EntriesFoundCount > 0 )) { 
//  PERFORM VARYING IP00404-ACCT-RNG-INDEX FROM 1 BY 1 UNTIL IP00404-ACCT-RNG-INDEX GREATER THAN IP00404-ENTRIES-FOUND-COUNT OR 88-100-IRD-SELECTED-Y
              for (ip00404AcctRngIndex = 1; (	( ip00404AcctRngIndex <= ip00404Table.getIp00404EntriesFoundCount() ) && !(work.isIrdSelectedY88100()) ) ; ip00404AcctRngIndex = ip00404AcctRngIndex + 1 ) {
//  MOVE IP00404-LICENSED-PROD-ID ( IP00404-ACCT-RNG-INDEX ) TO 800-BRAND-PRODUCT
                  work.setBrandProduct800(ip00404Table.getIp00404ArRangeEntries().getIp00404Entry(ip00404AcctRngIndex - 1).getIp00404MpePeRecDataCs().getIp00404LicensedProdId());
//  EVALUATE TRUE
                  if  ( work.isIrd75ValidBp88800()  ) { 
//  MOVE 300-VALUE-75 TO 800-IRD
                      workAreas800.setIrd800(work.getValue75300());
//  SET 88-100-IRD-SELECTED-Y TO TRUE
                      work.setIrdSelectedY88100True(); 
                      
                  }
                  else if  ( work.isIrd01ValidBp88800()  ) { 
//  MOVE 300-VALUE-01 TO 800-IRD
                      workAreas800.setIrd800(work.getValue01300());
//  SET 88-100-IRD-SELECTED-Y TO TRUE
                      work.setIrdSelectedY88100True(); 
                      
                  }
                  else if  ( work.isIrdwaValidBp88800()  ) { 
//  MOVE 300-VALUE-WA TO 800-IRD
                      workAreas800.setIrd800(work.getValueWa300());
//  SET 88-100-IRD-SELECTED-Y TO TRUE
                      work.setIrdSelectedY88100True(); 
                      
                  }
                  else if  ( work.isIrd65ValidBp88800()  ) { 
//  MOVE 300-VALUE-65 TO 800-IRD
                      workAreas800.setIrd800(work.getValue65300());
//  SET 88-100-IRD-SELECTED-Y TO TRUE
                      work.setIrdSelectedY88100True(); 
                      
                  }
                  else   { 
//  MOVE SPACES TO 800-IRD
                      workAreas800.setIrd800(CONSTANTS.SPACE_2);
                  }
              }
          }
  
      
      }
      /**
      * accumulateAmount 
      *   This method is derived from 
  *   COBOL Paragraph - 2520-ACCUMULATE-AMOUNT COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ip98902Status                  COBOL Name: IP98902-STATUS
      * - donationAmount800              COBOL Name: 800-DONATION-AMOUNT
      * - ip98902DonationAmount          COBOL Name: IP98902-DONATION-AMOUNT
      *
      * Output :  

      * - donationAmount800              COBOL Name: 800-DONATION-AMOUNT
      *
      * @throws CFException
      */
      private void accumulateAmount() throws Exception {
//  IF 88-IP98902-STATUS-ACTIVE
          if ( ip98902RegistrationFileData.isIp98902StatusActive88()  ) { 
//  ADD IP98902-DONATION-AMOUNT TO 800-DONATION-AMOUNT
              workAreas800.setDonationAmount800(workAreas800.getDonationAmount800()+(int) ip98902RegistrationFileData.getIp98902DonationAmount());
          }
//  ELSE
          else { 
//  DISPLAY 'INACTIVE RECORDS - SKIPPED'
              logger.info("INACTIVE RECORDS - SKIPPED"); 
          }
//  PERFORM 8000-READ-SYS001
          readSys001();/*8000-READ-SYS001*/
          ;
      
      }
      /**
      * build1240200 
      *   This method is derived from 
  *   COBOL Paragraph - 2511-BUILD-1240200 COBOL Cyclomatic complexity - 4
      * Input  :  

      * - seqNum8800                     COBOL Name: 800-SEQ-NUM-8
      * - ip98902CharityIca              COBOL Name: IP98902-CHARITY-ICA
      * - curDtMm800                     COBOL Name: 800-CUR-DT-MM
      * - curDtDd800                     COBOL Name: 800-CUR-DT-DD
      * - ip9890hIssuerIca               COBOL Name: IP9890H-ISSUER-ICA
      * - ica1800                        COBOL Name: 800-ICA1
      * - maid1800                       COBOL Name: 800-MAID1
      * - ica2800                        COBOL Name: 800-ICA2
      * - maid2800                       COBOL Name: 800-MAID2
      * - ird800                         COBOL Name: 800-IRD
      * - displayMsgTblsSw1000           COBOL Name: 1000-DISPLAY-MSG-TBLS-SW
      *
      * Output :  

      * - seqNum8800                     COBOL Name: 800-SEQ-NUM-8
      * - newElem800                     COBOL Name: 800-NEW-ELEM
      * - newElemLen800                  COBOL Name: 800-NEW-ELEM-LEN
      * - newElemValue800                COBOL Name: 800-NEW-ELEM-VALUE
      * - ip98902CharityIca              COBOL Name: IP98902-CHARITY-ICA
      * - de63s2800                      COBOL Name: 800-DE63S2
      * - curDtMm800                     COBOL Name: 800-CUR-DT-MM
      * - curDtDd800                     COBOL Name: 800-CUR-DT-DD
      * - ip9890hIssuerIca               COBOL Name: IP9890H-ISSUER-ICA
      * - fldValue800                    COBOL Name: 800-FLD-VALUE
      * - maid1800                       COBOL Name: 800-MAID1
      * - maid2800                       COBOL Name: 800-MAID2
      * - ird800                         COBOL Name: 800-IRD
      *
      * @throws CFException
      */
      private void build1240200() throws Exception {
			// Declare local variables used in the method
			NewElemData800 newElemData800 = workAreas800.getNewElemData800();
			CurDtYymmdd800 curDtYymmdd800 = workAreas800.getCurrentDate800().getCurDtYymmdd800();
			long ip98902CharityIca = 0;
			long ica1800 = 0;
			long ica2800 = 0;
			ParmData1000 parmData1000 = parms1000.getParmData1000();
			// End of variable declaration

      
// ******************************************************************
// * Build 1240 200 message
// ******************************************************************
//  ADD 1 TO 800-SEQ-NUM-8
          workAreas800.setSeqNum8800(workAreas800.getSeqNum8800()+(long)1);

// * Detail fields

// * Arn

// * De033 transaction originator
//  PERFORM 2520-POPULATE-DETAIL-FIELDS
          populateDetailFields();/*2520-POPULATE-DETAIL-FIELDS*/
//  PERFORM 2530-POPULATE-ARN
          populateArn();/*2530-POPULATE-ARN*/
//  MOVE 'D003300000000' TO 800-NEW-ELEM
//  LITERAL_D003300000000 = 'D003300000000'
          workAreas800.setNewElem800(CONSTANTS.LITERAL_D003300000000);
          // MOVE 11 TO 800-NEW-ELEM-LEN
          workAreas800.getNewElemData800().setNewElemLen800(11);
  
//  MOVE IP98902-CHARITY-ICA TO 800-NEW-ELEM-VALUE
          newElemData800.setNewElemValue800(padSpaces(999, String.valueOf(ip98902RegistrationFileData.getIp98902CharityIcaString()).toCharArray()));
  
//  PERFORM 8200-UPDATE-1240200-FIELD
          update1240200Field();/*8200-UPDATE-1240200-FIELD*/

// * De063s2 life cycle trace id
//  MOVE 800-CUR-DT-MM TO 800-DE63S2 (10 : 2)
          workAreas800.replace(workAreas800/*parent*/,1268/*fromOffset - (de63s2800) */,2/*fromLen*/,213+10 - 1/*toOffset - (curDtMm800) */,2/*toLen*/);
  
//  MOVE 800-CUR-DT-DD TO 800-DE63S2 (12 : 2)
          workAreas800.replace(workAreas800/*parent*/,1270/*fromOffset - (de63s2800) */,2/*fromLen*/,213+12 - 1/*toOffset - (curDtDd800) */,2/*toLen*/);
  
//  MOVE 'D006300020000' TO 800-NEW-ELEM
//  LITERAL_D006300020000 = 'D006300020000'
          workAreas800.setNewElem800(CONSTANTS.LITERAL_D006300020000);
          // MOVE 15 TO 800-NEW-ELEM-LEN
          workAreas800.getNewElemData800().setNewElemLen800(15);
  
//  MOVE 800-DE63S2 TO 800-NEW-ELEM-VALUE
          newElemData800.setNewElemValue800(workAreas800.getDe63s2800());
  
//  PERFORM 8200-UPDATE-1240200-FIELD
          update1240200Field();/*8200-UPDATE-1240200-FIELD*/

// * De071 sequence number
//  MOVE 'D007100000000' TO 800-NEW-ELEM
//  LITERAL_D007100000000 = 'D007100000000'
          workAreas800.setNewElem800(CONSTANTS.LITERAL_D007100000000);
          // MOVE 8 TO 800-NEW-ELEM-LEN
          workAreas800.getNewElemData800().setNewElemLen800(8);
  
//  MOVE 800-SEQ-NUM-8 TO 800-NEW-ELEM-VALUE
          newElemData800.setNewElemValue800(padSpaces(999, String.valueOf(workAreas800.getSeqNum8800String()).toCharArray()));
  
//  PERFORM 8200-UPDATE-1240200-FIELD
          update1240200Field();/*8200-UPDATE-1240200-FIELD*/

// * De093 transaction receiver
//  MOVE 'D009300000000' TO 800-NEW-ELEM
//  LITERAL_D009300000000 = 'D009300000000'
          workAreas800.setNewElem800(CONSTANTS.LITERAL_D009300000000);
          // MOVE 11 TO 800-NEW-ELEM-LEN
          workAreas800.getNewElemData800().setNewElemLen800(11);
  
//  MOVE IP9890H-ISSUER-ICA TO 800-NEW-ELEM-VALUE
          newElemData800.setNewElemValue800(padSpaces(999, String.valueOf(ip9890hPaymentFileData.getIp9890hIssuerIcaString()).toCharArray()));
  
//  PERFORM 8200-UPDATE-1240200-FIELD
          update1240200Field();/*8200-UPDATE-1240200-FIELD*/

// * De094 transaction sender
//  MOVE 'D009400000000' TO 800-NEW-ELEM
//  LITERAL_D009400000000 = 'D009400000000'
          workAreas800.setNewElem800(CONSTANTS.LITERAL_D009400000000);
          // MOVE 11 TO 800-NEW-ELEM-LEN
          workAreas800.getNewElemData800().setNewElemLen800(11);
  
//  MOVE IP98902-CHARITY-ICA TO 800-NEW-ELEM-VALUE
          newElemData800.setNewElemValue800(padSpaces(999, String.valueOf(ip98902RegistrationFileData.getIp98902CharityIcaString()).toCharArray()));
  
//  PERFORM 8200-UPDATE-1240200-FIELD
          update1240200Field();/*8200-UPDATE-1240200-FIELD*/
//  MOVE 'P017600000000' TO 800-NEW-ELEM
//  LITERAL_P017600000000 = 'P017600000000'
          workAreas800.setNewElem800(CONSTANTS.LITERAL_P017600000000);
          // MOVE 6 TO 800-NEW-ELEM-LEN
          workAreas800.getNewElemData800().setNewElemLen800(6);
  
          ica1800 = workAreas800.getIca1800();
          ip98902CharityIca = ip98902RegistrationFileData.getIp98902CharityIca();
//  IF IP98902-CHARITY-ICA EQUAL 800-ICA1
          if (	( ip98902CharityIca == ica1800 )) { 
//  MOVE 800-MAID1 TO 800-FLD-VALUE (1 : 6)
              work.setFldValue800(replace(work.getFldValue800(),String.valueOf(workAreas800.getMaid1800String()).toCharArray(),0,6));
              // MOVE 800-FLD-VALUE (1 : 6) TO 800-NEW-ELEM-VALUE
              workAreas800.getNewElemData800().setNewElemValue800(work.getFldValue800()/* fldValue800 */,0,6,0/* newElemValue800 */,workAreas800.getNewElemData800().getNewElemValue800().length);
  
          }
  
//  ELSE
          else { 
              ica2800 = workAreas800.getIca2800();
              ip98902CharityIca = ip98902RegistrationFileData.getIp98902CharityIca();
//  IF IP98902-CHARITY-ICA EQUAL 800-ICA2
              if (	( ip98902CharityIca == ica2800 )) { 
//  MOVE 800-MAID2 TO 800-FLD-VALUE (1 : 6)
                  work.setFldValue800(replace(work.getFldValue800(),String.valueOf(workAreas800.getMaid2800String()).toCharArray(),0,6));
                  // MOVE 800-FLD-VALUE (1 : 6) TO 800-NEW-ELEM-VALUE
                  workAreas800.getNewElemData800().setNewElemValue800(work.getFldValue800()/* fldValue800 */,0,6,0/* newElemValue800 */,workAreas800.getNewElemData800().getNewElemValue800().length);
  
              }
  
          }
//  PERFORM 8200-UPDATE-1240200-FIELD
          update1240200Field();/*8200-UPDATE-1240200-FIELD*/

// * Pds158s4 - ird (based on brand product)
//  MOVE 'P015800040000' TO 800-NEW-ELEM
//  LITERAL_P015800040000 = 'P015800040000'
          workAreas800.setNewElem800(CONSTANTS.LITERAL_P015800040000);
          // MOVE 2 TO 800-NEW-ELEM-LEN
          workAreas800.getNewElemData800().setNewElemLen800(2);
  
//  MOVE 800-IRD (1 : 2) TO 800-NEW-ELEM-VALUE
          workAreas800.replace(workAreas800/*parent*/,4632/*fromOffset - (newElemValue800) */,2/*fromLen*/,1349/*toOffset - (ird800) */,999/*toLen*/);
  
//  PERFORM 8200-UPDATE-1240200-FIELD
          update1240200Field();/*8200-UPDATE-1240200-FIELD*/
          parmData1000 = parms1000.getParmData1000();
//  IF 1000-DISPLAY-MSG-TBLS
          if ( parmData1000.isDisplayMsgTbls1000()  ) { 
//  PERFORM 8400-DISPLAY-1240200-TABLE
              display1240200Table();/*8400-DISPLAY-1240200-TABLE*/
          }
  
      
      }
      /**
      * populateDetailFields 
      *   This method is derived from 
  *   COBOL Paragraph - 2520-POPULATE-DETAIL-FIELDS COBOL Cyclomatic complexity - 3
      * Input  :  

      * - pan800                         COBOL Name: 800-PAN
      * - trnAmt8001240                  COBOL Name: 800-1240-TRN-AMT
      * - ip98902CharityIca              COBOL Name: IP98902-CHARITY-ICA
      * - ica1800                        COBOL Name: 800-ICA1
      * - type1800                       COBOL Name: 800-TYPE1
      * - ica2800                        COBOL Name: 800-ICA2
      * - type2800                       COBOL Name: 800-TYPE2
      *
      * Output :  

      * - newElem800                     COBOL Name: 800-NEW-ELEM
      * - newElemLen800                  COBOL Name: 800-NEW-ELEM-LEN
      * - newElemValue800                COBOL Name: 800-NEW-ELEM-VALUE
      * - pan800                         COBOL Name: 800-PAN
      * - trnAmt8001240                  COBOL Name: 800-1240-TRN-AMT
      * - fldValue800                    COBOL Name: 800-FLD-VALUE
      * - type1800                       COBOL Name: 800-TYPE1
      * - type2800                       COBOL Name: 800-TYPE2
      *
      * @throws CFException
      */
      private void populateDetailFields() throws Exception {
			// Declare local variables used in the method
			NewElemData800 newElemData800 = workAreas800.getNewElemData800();
			long ip98902CharityIca = 0;
			long ica1800 = 0;
			long ica2800 = 0;
			// End of variable declaration

      
// ******************************************************************
// * Populate detail fields
// ******************************************************************

// * De002 pan
//  MOVE 'D000200000000' TO 800-NEW-ELEM
//  LITERAL_D000200000000 = 'D000200000000'
          workAreas800.setNewElem800(CONSTANTS.LITERAL_D000200000000);
          // MOVE 16 TO 800-NEW-ELEM-LEN
          workAreas800.getNewElemData800().setNewElemLen800(16);
  
//  MOVE 800-PAN TO 800-NEW-ELEM-VALUE
          newElemData800.setNewElemValue800(workAreas800.getPan800());
  
//  PERFORM 8200-UPDATE-1240200-FIELD
          update1240200Field();/*8200-UPDATE-1240200-FIELD*/

// * De004 transaction amount
//  MOVE 'D000400000000' TO 800-NEW-ELEM
//  LITERAL_D000400000000 = 'D000400000000'
          workAreas800.setNewElem800(CONSTANTS.LITERAL_D000400000000);
          // MOVE 12 TO 800-NEW-ELEM-LEN
          workAreas800.getNewElemData800().setNewElemLen800(12);
  
//  MOVE 800-1240-TRN-AMT TO 800-NEW-ELEM-VALUE
          newElemData800.setNewElemValue800(padSpaces(999, String.valueOf(workAreas800.getTrnAmt8001240String()).toCharArray()));
  
//  PERFORM 8200-UPDATE-1240200-FIELD
          update1240200Field();/*8200-UPDATE-1240200-FIELD*/

// * De43s1 card acceptor name
//  MOVE 'D004300010000' TO 800-NEW-ELEM
//  LITERAL_D004300010000 = 'D004300010000'
          workAreas800.setNewElem800(CONSTANTS.LITERAL_D004300010000);
          // MOVE 22 TO 800-NEW-ELEM-LEN
          workAreas800.getNewElemData800().setNewElemLen800(22);
  
          ica1800 = workAreas800.getIca1800();
          ip98902CharityIca = ip98902RegistrationFileData.getIp98902CharityIca();
//  IF IP98902-CHARITY-ICA EQUAL 800-ICA1
          if (	( ip98902CharityIca == ica1800 )) { 
//  MOVE 800-TYPE1 TO 800-FLD-VALUE (1 : 22)
              work.setFldValue800(replace(work.getFldValue800(),workAreas800.getType1800(),0,22));
              // MOVE 800-FLD-VALUE (1 : 22) TO 800-NEW-ELEM-VALUE
              workAreas800.getNewElemData800().setNewElemValue800(work.getFldValue800()/* fldValue800 */,0,22,0/* newElemValue800 */,workAreas800.getNewElemData800().getNewElemValue800().length);
  
          }
  
//  ELSE
          else { 
              ica2800 = workAreas800.getIca2800();
              ip98902CharityIca = ip98902RegistrationFileData.getIp98902CharityIca();
//  IF IP98902-CHARITY-ICA EQUAL 800-ICA2
              if (	( ip98902CharityIca == ica2800 )) { 
//  MOVE 800-TYPE2 TO 800-FLD-VALUE (1 : 22)
                  work.setFldValue800(replace(work.getFldValue800(),workAreas800.getType2800(),0,22));
                  // MOVE 800-FLD-VALUE (1 : 22) TO 800-NEW-ELEM-VALUE
                  workAreas800.getNewElemData800().setNewElemValue800(work.getFldValue800()/* fldValue800 */,0,22,0/* newElemValue800 */,workAreas800.getNewElemData800().getNewElemValue800().length);
  
              }
  
          }
//  PERFORM 8200-UPDATE-1240200-FIELD
          update1240200Field();/*8200-UPDATE-1240200-FIELD*/
          ;
      
      }
      /**
      * populateArn 
      *   This method is derived from 
  *   COBOL Paragraph - 2530-POPULATE-ARN COBOL Cyclomatic complexity - 3
      * Input  :  

      * - ip98902CharityIca              COBOL Name: IP98902-CHARITY-ICA
      * - ica1800                        COBOL Name: 800-ICA1
      * - bin1800                        COBOL Name: 800-BIN1
      * - ica2800                        COBOL Name: 800-ICA2
      * - bin2800                        COBOL Name: 800-BIN2
      * - julianDate800                  COBOL Name: 800-JULIAN-DATE
      * - seqNum8800                     COBOL Name: 800-SEQ-NUM-8
      * - de31S5800                      COBOL Name: 800-DE31-S5
      *
      * Output :  

      * - newElem800                     COBOL Name: 800-NEW-ELEM
      * - newElemLen800                  COBOL Name: 800-NEW-ELEM-LEN
      * - fldValue800                    COBOL Name: 800-FLD-VALUE
      * - bin1800                        COBOL Name: 800-BIN1
      * - newElemValue800                COBOL Name: 800-NEW-ELEM-VALUE
      * - de31S2800                      COBOL Name: 800-DE31-S2
      * - bin2800                        COBOL Name: 800-BIN2
      * - de31S3800                      COBOL Name: 800-DE31-S3
      * - julianDate800                  COBOL Name: 800-JULIAN-DATE
      * - de31S4800                      COBOL Name: 800-DE31-S4
      * - seqNum8800                     COBOL Name: 800-SEQ-NUM-8
      * - de31S5800                      COBOL Name: 800-DE31-S5
      *
      * @throws CFException
      */
      private void populateArn() throws Exception {
			// Declare local variables used in the method
			NewElemData800 newElemData800 = workAreas800.getNewElemData800();
			De31S1S2S3S4800 de31S1S2S3S4800 = workAreas800.getDe31800().getDe31S1S2S3S4800();
			long ip98902CharityIca = 0;
			long ica1800 = 0;
			long ica2800 = 0;
			De31800 de31800 = workAreas800.getDe31800();
			// End of variable declaration

      
// ******************************************************************
// * Populate arn (aquirer's reference number)
// *
// * de031s1 is populated from defaults file
// * de031s2 is populated from common fields
// ******************************************************************
//  MOVE 'D003100020000' TO 800-NEW-ELEM
//  LITERAL_D003100020000 = 'D003100020000'
          workAreas800.setNewElem800(CONSTANTS.LITERAL_D003100020000);
          // MOVE 6 TO 800-NEW-ELEM-LEN
          workAreas800.getNewElemData800().setNewElemLen800(6);
  
          ica1800 = workAreas800.getIca1800();
          ip98902CharityIca = ip98902RegistrationFileData.getIp98902CharityIca();
//  IF IP98902-CHARITY-ICA EQUAL 800-ICA1
          if (	( ip98902CharityIca == ica1800 )) { 
//  MOVE 800-BIN1 TO 800-FLD-VALUE (1 : 6)
              work.setFldValue800(replace(work.getFldValue800(),String.valueOf(workAreas800.getBin1800String()).toCharArray(),0,6));
//  MOVE 800-FLD-VALUE (1 : 6) TO 800-NEW-ELEM-VALUE 800-DE31-S2
              try {
              newElemData800.setNewElemValue800(work.getFldValue800(),0/* fldValue800 */,6,0 /* newElemValue800 */,newElemData800.getNewElemValue800().length /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
              } catch(NumberFormatException e) {}
              try {
              de31S1S2S3S4800.setDe31S2800(CFUtil.getLong(substring(work.getFldValue800(),0,6)));
              } catch(NumberFormatException e) {}
  
          }
  
//  ELSE
          else { 
              ica2800 = workAreas800.getIca2800();
              ip98902CharityIca = ip98902RegistrationFileData.getIp98902CharityIca();
//  IF IP98902-CHARITY-ICA EQUAL 800-ICA2
              if (	( ip98902CharityIca == ica2800 )) { 
//  MOVE 800-BIN2 TO 800-FLD-VALUE (1 : 6)
                  work.setFldValue800(replace(work.getFldValue800(),String.valueOf(workAreas800.getBin2800String()).toCharArray(),0,6));
//  MOVE 800-FLD-VALUE (1 : 6) TO 800-NEW-ELEM-VALUE 800-DE31-S2
                  try {
                  newElemData800.setNewElemValue800(work.getFldValue800(),0/* fldValue800 */,6,0 /* newElemValue800 */,newElemData800.getNewElemValue800().length /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
                  } catch(NumberFormatException e) {}
                  try {
                  de31S1S2S3S4800.setDe31S2800(CFUtil.getLong(substring(work.getFldValue800(),0,6)));
                  } catch(NumberFormatException e) {}
  
              }
  
          }
//  PERFORM 8200-UPDATE-1240200-FIELD
          update1240200Field();/*8200-UPDATE-1240200-FIELD*/

// * De031s3 julian process date
//  MOVE 800-JULIAN-DATE (2 : 4) TO 800-DE31-S3
          de31S1S2S3S4800.setDe31S3800( CFUtil.getInt(substring(workAreas800.getJulianDate800String(),1,5)));
  
//  MOVE 'D003100030000' TO 800-NEW-ELEM
//  LITERAL_D003100030000 = 'D003100030000'
          workAreas800.setNewElem800(CONSTANTS.LITERAL_D003100030000);
          // MOVE 4 TO 800-NEW-ELEM-LEN
          workAreas800.getNewElemData800().setNewElemLen800(4);
  
//  MOVE 800-DE31-S3 TO 800-NEW-ELEM-VALUE
          newElemData800.setNewElemValue800(padSpaces(999, String.valueOf(de31S1S2S3S4800.getDe31S3800String()).toCharArray()));
  
//  PERFORM 8200-UPDATE-1240200-FIELD
          update1240200Field();/*8200-UPDATE-1240200-FIELD*/

// * De031s4 acq sequence number
          // MOVE 800-SEQ-NUM-8 TO 800-DE31-S4
          workAreas800.getDe31800().getDe31S1S2S3S4800().setDe31S4800(workAreas800.getSeqNum8800());
  
//  MOVE 'D003100040000' TO 800-NEW-ELEM
//  LITERAL_D003100040000 = 'D003100040000'
          workAreas800.setNewElem800(CONSTANTS.LITERAL_D003100040000);
          // MOVE 11 TO 800-NEW-ELEM-LEN
          workAreas800.getNewElemData800().setNewElemLen800(11);
  
//  MOVE 800-DE31-S4 TO 800-NEW-ELEM-VALUE
          newElemData800.setNewElemValue800(padSpaces(999, String.valueOf(de31S1S2S3S4800.getDe31S4800String()).toCharArray()));
  
//  PERFORM 8200-UPDATE-1240200-FIELD
          update1240200Field();/*8200-UPDATE-1240200-FIELD*/

// * De031s5 check digit
//  PERFORM 2535-CALC-CHECK-DIGIT
          calcCheckDigit();/*2535-CALC-CHECK-DIGIT*/
//  MOVE 'D003100050000' TO 800-NEW-ELEM
//  LITERAL_D003100050000 = 'D003100050000'
          workAreas800.setNewElem800(CONSTANTS.LITERAL_D003100050000);
          // MOVE 1 TO 800-NEW-ELEM-LEN
          workAreas800.getNewElemData800().setNewElemLen800(1);
  
//  MOVE 800-DE31-S5 TO 800-NEW-ELEM-VALUE
          newElemData800.setNewElemValue800(padSpaces(999, String.valueOf(de31800.getDe31S5800String()).toCharArray()));
  
//  PERFORM 8200-UPDATE-1240200-FIELD
          update1240200Field();/*8200-UPDATE-1240200-FIELD*/
          ;
      
      }
      /**
      * calcCheckDigit 
      *   This method is derived from 
  *   COBOL Paragraph - 2535-CALC-CHECK-DIGIT COBOL Cyclomatic complexity - 4
      * Input  :  

      * - loopCntr400                    COBOL Name: 400-LOOP-CNTR
      * - de31S1S2S3S4800                COBOL Name: 800-DE31-S1-S2-S3-S4
      * - evenMsb800                     COBOL Name: 800-EVEN-MSB
      * - evenLsb800                     COBOL Name: 800-EVEN-LSB
      *
      * Output :  

      * - isItOddOrEvenByte100           COBOL Name: 100-IS-IT-ODD-OR-EVEN-BYTE
      * - oddEvenTotal800                COBOL Name: 800-ODD-EVEN-TOTAL
      * - loopCntr400                    COBOL Name: 400-LOOP-CNTR
      * - currentByte800                 COBOL Name: 800-CURRENT-BYTE
      * - de31S1S2S3S4800                COBOL Name: 800-DE31-S1-S2-S3-S4
      * - evenValueDoubled800            COBOL Name: 800-EVEN-VALUE-DOUBLED
      * - de31S5800                      COBOL Name: 800-DE31-S5
      *
      * @throws CFException
      */
      private void calcCheckDigit() throws Exception {
			// Declare local variables used in the method
			LuhnsWorkArea800 luhnsWorkArea800 = workAreas800.getLuhnsWorkArea800();
			EvenValue800 evenValue800 = workAreas800.getLuhnsWorkArea800().getEvenValue800();
			De31800 de31800 = workAreas800.getDe31800();
			// End of variable declaration

      
// ******************************************************************
// * Calculate check digit for arn
// ******************************************************************
//  SET 88-100-IT-IS-ODD-BYTE TO TRUE
          work.setItIsOddByte88100True(); 
          
//  MOVE ZEROS TO 800-ODD-EVEN-TOTAL
          luhnsWorkArea800.setOddEvenTotal800(0);
  
//  PERFORM VARYING 400-LOOP-CNTR FROM 1 BY 1 UNTIL 400-LOOP-CNTR GREATER 22
          for (work.setLoopCntr400(1); (	( work.getLoopCntr400() <= 22 )) ; work.setLoopCntr400(work.getLoopCntr400() + 1) ) {
//  IF 88-100-IT-IS-ODD-BYTE
              if ( work.isItIsOddByte88100()  ) { 
//  MOVE 800-DE31-S1-S2-S3-S4 ( 400-LOOP-CNTR : 1) TO 800-CURRENT-BYTE
                  luhnsWorkArea800.setCurrentByte800(CFUtil.getInt(substring(workAreas800.getDe31800().getDe31S1S2S3S4800().toCharArray(),(work.getLoopCntr400()-1), (work.getLoopCntr400() + 0) )));
  
//  ADD 800-CURRENT-BYTE TO 800-ODD-EVEN-TOTAL
                  luhnsWorkArea800.setOddEvenTotal800(luhnsWorkArea800.getOddEvenTotal800()+luhnsWorkArea800.getCurrentByte800());
  
//  SET 88-100-IT-IS-EVEN-BYTE TO TRUE
                  work.setItIsEvenByte88100True(); 
                  
              }
//  ELSE
              else { 
//  MOVE 800-DE31-S1-S2-S3-S4 ( 400-LOOP-CNTR : 1) TO 800-CURRENT-BYTE
                  luhnsWorkArea800.setCurrentByte800(CFUtil.getInt(substring(workAreas800.getDe31800().getDe31S1S2S3S4800().toCharArray(),(work.getLoopCntr400()-1), (work.getLoopCntr400() + 0) )));
  
//  MULTIPLY 800-CURRENT-BYTE BY 2 GIVING 800-EVEN-VALUE-DOUBLED
                  luhnsWorkArea800.setEvenValueDoubled800(luhnsWorkArea800.getCurrentByte800()*2);
  
//  ADD 800-EVEN-MSB 800-EVEN-LSB TO 800-ODD-EVEN-TOTAL
                  luhnsWorkArea800.setOddEvenTotal800(luhnsWorkArea800.getOddEvenTotal800()+evenValue800.getEvenMsb800()+evenValue800.getEvenLsb800());
  
//  SET 88-100-IT-IS-ODD-BYTE TO TRUE
                  work.setItIsOddByte88100True(); 
                  
              }
          }
//  MOVE 800-ODD-EVEN-TOTAL (3 : 1) TO 800-CURRENT-BYTE
          luhnsWorkArea800.setCurrentByte800(CFUtil.getInt(substring(luhnsWorkArea800.getOddEvenTotal800String(),2,3)));
  
//  SUBTRACT 800-CURRENT-BYTE FROM 10 GIVING 800-DE31-S5
          de31800.setDe31S5800(Math.abs(10-luhnsWorkArea800.getCurrentByte800()));
  
      
      }
      /**
      * wrapUp 
      *   This method is derived from 
  *   COBOL Paragraph - 3000-WRAP-UP COBOL Cyclomatic complexity - 1
      * Input  :  

      * - c300                           COBOL Name: 300-C
      * - sys201RecsWrit400              COBOL Name: 400-SYS201-RECS-WRIT
      * - sys001300                      COBOL Name: 300-SYS001
      * - sys001RecsRead400              COBOL Name: 400-SYS001-RECS-READ
      * - totalRecsReadMsg600            COBOL Name: 600-TOTAL-RECS-READ-MSG
      * - sys003300                      COBOL Name: 300-SYS003
      * - sys003RecsRead400              COBOL Name: 400-SYS003-RECS-READ
      * - sys004300                      COBOL Name: 300-SYS004
      * - sys004RecsRead400              COBOL Name: 400-SYS004-RECS-READ
      * - sys101300                      COBOL Name: 300-SYS101
      * - sys101RecsWrit400              COBOL Name: 400-SYS101-RECS-WRIT
      * - totalRecsWrittenMsg600         COBOL Name: 600-TOTAL-RECS-WRITTEN-MSG
      * - sys201300                      COBOL Name: 300-SYS201
      * - sys202300                      COBOL Name: 300-SYS202
      * - sys202RecsWrit400              COBOL Name: 400-SYS202-RECS-WRIT
      * - sys204300                      COBOL Name: 300-SYS204
      * - sys204RecsWrit400              COBOL Name: 400-SYS204-RECS-WRIT
      * - sys205300                      COBOL Name: 300-SYS205
      * - sys205RecsWrit400              COBOL Name: 400-SYS205-RECS-WRIT
      *
      * Output :  

      * - sys204StatusCd                 COBOL Name: SYS204-STATUS-CD
      * - c300                           COBOL Name: 300-C
      * - sys204InRecCnt                 COBOL Name: SYS204-IN-REC-CNT
      * - sys204OutRecCnt                COBOL Name: SYS204-OUT-REC-CNT
      * - sys201RecsWrit400              COBOL Name: 400-SYS201-RECS-WRIT
      * - recsReadDd600                  COBOL Name: 600-RECS-READ-DD
      * - sys001300                      COBOL Name: 300-SYS001
      * - recsReadCount600               COBOL Name: 600-RECS-READ-COUNT
      * - sys001RecsRead400              COBOL Name: 400-SYS001-RECS-READ
      * - sys003300                      COBOL Name: 300-SYS003
      * - sys003RecsRead400              COBOL Name: 400-SYS003-RECS-READ
      * - sys004300                      COBOL Name: 300-SYS004
      * - sys004RecsRead400              COBOL Name: 400-SYS004-RECS-READ
      * - recsWritDd600                  COBOL Name: 600-RECS-WRIT-DD
      * - sys101300                      COBOL Name: 300-SYS101
      * - recsWritCount600               COBOL Name: 600-RECS-WRIT-COUNT
      * - sys101RecsWrit400              COBOL Name: 400-SYS101-RECS-WRIT
      * - sys201300                      COBOL Name: 300-SYS201
      * - sys202300                      COBOL Name: 300-SYS202
      * - sys202RecsWrit400              COBOL Name: 400-SYS202-RECS-WRIT
      * - sys204300                      COBOL Name: 300-SYS204
      * - sys204RecsWrit400              COBOL Name: 400-SYS204-RECS-WRIT
      * - sys205300                      COBOL Name: 300-SYS205
      * - sys205RecsWrit400              COBOL Name: 400-SYS205-RECS-WRIT
      *
      * @throws CFException
      */
      private void wrapUp() throws Exception {
      
// ******************************************************************
// * Wrap up
// ******************************************************************

// * Write audit file
//  MOVE 300-C TO SYS204-STATUS-CD
          sys204OutRec.setSys204StatusCd(work.getC300());
//  MOVE 400-SYS201-RECS-WRIT TO SYS204-IN-REC-CNT SYS204-OUT-REC-CNT
          sys204OutRec.setSys204InRecCnt( work.getSys201RecsWrit400());
          sys204OutRec.setSys204OutRecCnt( work.getSys201RecsWrit400());
//  PERFORM 3120-WRITE-SYS204
          writeSys204();/*3120-WRITE-SYS204*/

// * Write file id file

// * Close files

// * Display file i-o counts
//  PERFORM 3100-UPDATE-FILEID-FILE
          updateFileidFile();/*3100-UPDATE-FILEID-FILE*/
//  PERFORM 3200-CLOSE-FILES
          closeFiles();/*3200-CLOSE-FILES*/
//  MOVE 300-SYS001 TO 600-RECS-READ-DD
          totalRecsReadMsg600.setRecsReadDd600(work.getSys001300());
//  MOVE 400-SYS001-RECS-READ TO 600-RECS-READ-COUNT
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          totalRecsReadMsg600.setRecsReadCount600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(work.getSys001RecsRead400()).toCharArray()));
//  DISPLAY 600-TOTAL-RECS-READ-MSG
          logger.info(totalRecsReadMsg600.toString()); 
//  MOVE 300-SYS003 TO 600-RECS-READ-DD
          totalRecsReadMsg600.setRecsReadDd600(work.getSys003300());
//  MOVE 400-SYS003-RECS-READ TO 600-RECS-READ-COUNT
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          totalRecsReadMsg600.setRecsReadCount600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(work.getSys003RecsRead400()).toCharArray()));
//  DISPLAY 600-TOTAL-RECS-READ-MSG
          logger.info(totalRecsReadMsg600.toString()); 
//  MOVE 300-SYS004 TO 600-RECS-READ-DD
          totalRecsReadMsg600.setRecsReadDd600(work.getSys004300());
//  MOVE 400-SYS004-RECS-READ TO 600-RECS-READ-COUNT
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          totalRecsReadMsg600.setRecsReadCount600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(work.getSys004RecsRead400()).toCharArray()));
//  DISPLAY 600-TOTAL-RECS-READ-MSG
          logger.info(totalRecsReadMsg600.toString()); 
//  MOVE 300-SYS101 TO 600-RECS-WRIT-DD
          totalRecsWrittenMsg600.setRecsWritDd600(work.getSys101300());
//  MOVE 400-SYS101-RECS-WRIT TO 600-RECS-WRIT-COUNT
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          totalRecsWrittenMsg600.setRecsWritCount600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(work.getSys101RecsWrit400()).toCharArray()));
//  DISPLAY 600-TOTAL-RECS-WRITTEN-MSG
          logger.info(totalRecsWrittenMsg600.toString()); 
//  MOVE 300-SYS201 TO 600-RECS-WRIT-DD
          totalRecsWrittenMsg600.setRecsWritDd600(work.getSys201300());
//  MOVE 400-SYS201-RECS-WRIT TO 600-RECS-WRIT-COUNT
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          totalRecsWrittenMsg600.setRecsWritCount600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(work.getSys201RecsWrit400()).toCharArray()));
//  DISPLAY 600-TOTAL-RECS-WRITTEN-MSG
          logger.info(totalRecsWrittenMsg600.toString()); 
//  MOVE 300-SYS202 TO 600-RECS-WRIT-DD
          totalRecsWrittenMsg600.setRecsWritDd600(work.getSys202300());
//  MOVE 400-SYS202-RECS-WRIT TO 600-RECS-WRIT-COUNT
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          totalRecsWrittenMsg600.setRecsWritCount600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(work.getSys202RecsWrit400()).toCharArray()));
//  DISPLAY 600-TOTAL-RECS-WRITTEN-MSG
          logger.info(totalRecsWrittenMsg600.toString()); 
//  MOVE 300-SYS202 TO 600-RECS-WRIT-DD
          totalRecsWrittenMsg600.setRecsWritDd600(work.getSys202300());
//  MOVE 400-SYS202-RECS-WRIT TO 600-RECS-WRIT-COUNT
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          totalRecsWrittenMsg600.setRecsWritCount600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(work.getSys202RecsWrit400()).toCharArray()));
//  DISPLAY 600-TOTAL-RECS-WRITTEN-MSG
          logger.info(totalRecsWrittenMsg600.toString()); 
//  MOVE 300-SYS204 TO 600-RECS-WRIT-DD
          totalRecsWrittenMsg600.setRecsWritDd600(work.getSys204300());
//  MOVE 400-SYS204-RECS-WRIT TO 600-RECS-WRIT-COUNT
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          totalRecsWrittenMsg600.setRecsWritCount600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(work.getSys204RecsWrit400()).toCharArray()));
//  DISPLAY 600-TOTAL-RECS-WRITTEN-MSG
          logger.info(totalRecsWrittenMsg600.toString()); 
//  MOVE 300-SYS205 TO 600-RECS-WRIT-DD
          totalRecsWrittenMsg600.setRecsWritDd600(work.getSys205300());
//  MOVE 400-SYS205-RECS-WRIT TO 600-RECS-WRIT-COUNT
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          totalRecsWrittenMsg600.setRecsWritCount600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(work.getSys205RecsWrit400()).toCharArray()));
//  DISPLAY 600-TOTAL-RECS-WRITTEN-MSG
          logger.info(totalRecsWrittenMsg600.toString()); 
//  PERFORM 3200-DISPLAY-STATISTICS
          displayStatistics();/*3200-DISPLAY-STATISTICS*/
          ;
      
      }
      /**
      * displayStatistics 
      *   This method is derived from 
  *   COBOL Paragraph - 3200-DISPLAY-STATISTICS COBOL Cyclomatic complexity - 3
      * Input  :  

      * - allLineText600                 COBOL Name: 600-ALL-LINE-TEXT
      * - headerText600                  COBOL Name: 600-HEADER-TEXT
      * - lineText600                    COBOL Name: 600-LINE-TEXT
      * - rowCount501                    COBOL Name: 501-ROW-COUNT
      * - panAlias501                    COBOL Name: 501-PAN-ALIAS
      * - donationLimit501               COBOL Name: 501-DONATION-LIMIT
      * - calcDonationAmt501             COBOL Name: 501-CALC-DONATION-AMT
      * - builtDonationAmt501            COBOL Name: 501-BUILT-DONATION-AMT
      * - detailText600                  COBOL Name: 600-DETAIL-TEXT
      *
      * Output :  

      * - displayIdx501                  COBOL Name: 501-DISPLAY-IDX
      * - panAlias600                    COBOL Name: 600-PAN-ALIAS
      * - panAlias501                    COBOL Name: 501-PAN-ALIAS
      * - donationLimt600                COBOL Name: 600-DONATION-LIMT
      * - donationLimit501               COBOL Name: 501-DONATION-LIMIT
      * - calcDonationAmt600             COBOL Name: 600-CALC-DONATION-AMT
      * - calcDonationAmt501             COBOL Name: 501-CALC-DONATION-AMT
      * - bultDonationAmt600             COBOL Name: 600-BULT-DONATION-AMT
      * - builtDonationAmt501            COBOL Name: 501-BUILT-DONATION-AMT
      *
      * @throws CFException
      */
      private void displayStatistics() throws Exception {
      
// ******************************************************************
// * Update rewards file-id file
// ******************************************************************
//  DISPLAY 600-ALL-LINE-TEXT
          logger.info(new String(work.getAllLineText600())); 
//  DISPLAY 600-HEADER-TEXT
          logger.info(new String(work.getHeaderText600())); 
//  DISPLAY 600-LINE-TEXT
          logger.info(new String(work.getLineText600())); 
//  SET 501-DISPLAY-IDX TO 1
          displayIdx501 = 1; 
          
//  PERFORM VARYING 501-DISPLAY-IDX FROM 1 BY 1 UNTIL 501-DISPLAY-IDX > 501-ROW-COUNT
          for (displayIdx501 = 1; (	( displayIdx501 <= work.getRowCount501() )) ; displayIdx501 = displayIdx501 + 1 ) {
//  MOVE 501-PAN-ALIAS ( 501-DISPLAY-IDX ) TO 600-PAN-ALIAS
              detailText600.setPanAlias600(displayTable501.getDisplayData501(displayIdx501 - 1).getPanAlias501());
//  MOVE 501-DONATION-LIMIT ( 501-DISPLAY-IDX ) TO 600-DONATION-LIMT
//  FORMAT_1977136933 = "ZZ,ZZZ,ZZ9"
              detailText600.setDonationLimt600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1977136933,String.valueOf(displayTable501.getDisplayData501(displayIdx501 - 1).getDonationLimit501()).toCharArray()));
//  MOVE 501-CALC-DONATION-AMT ( 501-DISPLAY-IDX ) TO 600-CALC-DONATION-AMT
//  FORMAT_1977136933 = "ZZ,ZZZ,ZZ9"
              detailText600.setCalcDonationAmt600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1977136933,String.valueOf(displayTable501.getDisplayData501(displayIdx501 - 1).getCalcDonationAmt501()).toCharArray()));
//  MOVE 501-BUILT-DONATION-AMT ( 501-DISPLAY-IDX ) TO 600-BULT-DONATION-AMT
//  FORMAT_640531297 = "ZZZ,ZZZ,ZZZ,ZZ9"
              detailText600.setBultDonationAmt600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_640531297,String.valueOf(displayTable501.getDisplayData501(displayIdx501 - 1).getBuiltDonationAmt501()).toCharArray()));
//  DISPLAY 600-DETAIL-TEXT
              logger.info(detailText600.toString()); 
          }
//  DISPLAY 600-LINE-TEXT
          logger.info(new String(work.getLineText600())); 
      
      }
      /**
      * updateFileidFile 
      *   This method is derived from 
  *   COBOL Paragraph - 3100-UPDATE-FILEID-FILE COBOL Cyclomatic complexity - 1
      * Input  :  

      * - fileid800                      COBOL Name: 800-FILEID
      * - sys201RecsWrit400              COBOL Name: 400-SYS201-RECS-WRIT
      * - sys201CntX400                  COBOL Name: 400-SYS201-CNT-X
      * - ip16911RewardFileIdRecord      COBOL Name: IP16911-REWARD-FILE-ID-RECORD
      *
      * Output :  

      * - ip16911FileCreateDate          COBOL Name: IP16911-FILE-CREATE-DATE
      * - ip16911RewardFileId            COBOL Name: IP16911-REWARD-FILE-ID
      * - fileid800                      COBOL Name: 800-FILEID
      * - sys201Cnt400                   COBOL Name: 400-SYS201-CNT
      * - sys201RecsWrit400              COBOL Name: 400-SYS201-RECS-WRIT
      * - ip16911FileMsgCnt              COBOL Name: IP16911-FILE-MSG-CNT
      * - sys201CntX400                  COBOL Name: 400-SYS201-CNT-X
      * - sys202OutRec                   COBOL Name: SYS202-OUT-REC
      * - ip16911RewardFileIdRecord      COBOL Name: IP16911-REWARD-FILE-ID-RECORD
      *
      * @throws CFException
      */
      private void updateFileidFile() throws Exception {
      
// ******************************************************************
// * Update rewards file-id file
// ******************************************************************
//  MOVE FUNCTION CURRENT-DATE TO IP16911-FILE-CREATE-DATE
          ip16911RewardFileIdRecord.setIp16911FileCreateDate( substring(CFUtil.getCurrentDate(timeZoneId),0,8));
//  MOVE 800-FILEID TO IP16911-REWARD-FILE-ID
          ip16911RewardFileIdRecord.setIp16911RewardFileId(workAreas800.getFileid800());
//  MOVE 400-SYS201-RECS-WRIT TO 400-SYS201-CNT
          sys201CntGroup400.setSys201Cnt400( work.getSys201RecsWrit400());

// *    Subtract header and trailer from count
//  SUBTRACT 2 FROM 400-SYS201-CNT
          sys201CntGroup400.setSys201Cnt400(Math.abs(sys201CntGroup400.getSys201Cnt400()-(long)2));
//  MOVE 400-SYS201-CNT-X TO IP16911-FILE-MSG-CNT
          ip16911RewardFileIdRecord.setIp16911FileMsgCnt(sys201CntGroup400.getSys201CntX400());
          // MOVE IP16911-REWARD-FILE-ID-RECORD TO SYS202-OUT-REC
          sys202OutRec.setString(ip16911RewardFileIdRecord.getCharArray());
//  PERFORM 3110-WRITE-SYS202
          writeSys202();/*3110-WRITE-SYS202*/
          ;
      
      }
      /**
      * writeSys201 
      *   This method is derived from 
  *   COBOL Paragraph - 3110-WRITE-SYS201 COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sys201OutRec                   COBOL Name: SYS201-OUT-REC
      * - sys201Rdw800                   COBOL Name: 800-SYS201-RDW
      * - sys201RecsWrit400              COBOL Name: 400-SYS201-RECS-WRIT
      * - sys201300                      COBOL Name: 300-SYS201
      * - abendCode3003004               COBOL Name: 300-3004-ABEND-CODE
      * - errorMsg6003004                COBOL Name: 600-3004-ERROR-MSG
      * - para3110300                    COBOL Name: 300-PARA-3110
      *
      * Output :  

      * - sys201Status800                COBOL Name: 800-SYS201-STATUS
      * - sys201RecsWrit400              COBOL Name: 400-SYS201-RECS-WRIT
      * - fileDd6003004                  COBOL Name: 600-3004-FILE-DD
      * - sys201300                      COBOL Name: 300-SYS201
      * - fileStat6003004                COBOL Name: 600-3004-FILE-STAT
      * - errorCode600                   COBOL Name: 600-ERROR-CODE
      * - abendCode3003004               COBOL Name: 300-3004-ABEND-CODE
      * - errorText600                   COBOL Name: 600-ERROR-TEXT
      * - errorMsg6003004                COBOL Name: 600-3004-ERROR-MSG
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para3110300                    COBOL Name: 300-PARA-3110
      *
      * @throws CFException
      */
      private void writeSys201() throws Exception {
      
// ******************************************************************
//  WRITE SYS201-OUT-REC
          sys201Out.setRecord(substring(sys201OutRec.toCharArray(),0,(int) workAreas800.getSys201Rdw800()));
          sys201Out.write((int) workAreas800.getSys201Rdw800()); 
          workAreas800.setSys201Status800(sys201Out.getStatusString() );
//  IF 88-800-SYS201-GOOD
          if ( workAreas800.isSys201Good88800()  ) { 
//  ADD 1 TO 400-SYS201-RECS-WRIT
              work.setSys201RecsWrit400(work.getSys201RecsWrit400()+1);
          }
//  ELSE
          else { 
//  MOVE 300-SYS201 TO 600-3004-FILE-DD
              errorMsg6003004.setFileDd6003004(work.getSys201300());
//  MOVE 800-SYS201-STATUS TO 600-3004-FILE-STAT
              errorMsg6003004.setFileStat6003004(workAreas800.getSys201Status800());
//  MOVE 300-3004-ABEND-CODE TO 600-ERROR-CODE
              work.setErrorCode600(work.getAbendCode3003004());
              // MOVE 600-3004-ERROR-MSG TO 600-ERROR-TEXT
              work.setErrorText600(errorMsg6003004.toCharArray());
//  MOVE 300-PARA-3110 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara3110300());
//  PERFORM 9100-ABEND-PROGRAM
              abendProgram();/*9100-ABEND-PROGRAM*/
          }
      
      }
      /**
      * writeSys202 
      *   This method is derived from 
  *   COBOL Paragraph - 3110-WRITE-SYS202 COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sys202OutRec                   COBOL Name: SYS202-OUT-REC
      * - sys202RecsWrit400              COBOL Name: 400-SYS202-RECS-WRIT
      * - sys202300                      COBOL Name: 300-SYS202
      * - abendCode3003004               COBOL Name: 300-3004-ABEND-CODE
      * - errorMsg6003004                COBOL Name: 600-3004-ERROR-MSG
      * - para3110300                    COBOL Name: 300-PARA-3110
      *
      * Output :  

      * - sys202Status800                COBOL Name: 800-SYS202-STATUS
      * - sys202RecsWrit400              COBOL Name: 400-SYS202-RECS-WRIT
      * - fileDd6003004                  COBOL Name: 600-3004-FILE-DD
      * - sys202300                      COBOL Name: 300-SYS202
      * - fileStat6003004                COBOL Name: 600-3004-FILE-STAT
      * - errorCode600                   COBOL Name: 600-ERROR-CODE
      * - abendCode3003004               COBOL Name: 300-3004-ABEND-CODE
      * - errorText600                   COBOL Name: 600-ERROR-TEXT
      * - errorMsg6003004                COBOL Name: 600-3004-ERROR-MSG
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para3110300                    COBOL Name: 300-PARA-3110
      *
      * @throws CFException
      */
      private void writeSys202() throws Exception {
      
// ******************************************************************
// * Write sys202
// ******************************************************************
//  WRITE SYS202-OUT-REC
          sys202Out.write(sys202OutRec.toCharArray()); 
          sys202OutRec.setString(CONSTANTS.LOW_VALUE_1253882920);
          workAreas800.setSys202Status800(sys202Out.getStatusString() );
//  IF 88-800-SYS202-GOOD
          if ( workAreas800.isSys202Good88800()  ) { 
//  ADD 1 TO 400-SYS202-RECS-WRIT
              work.setSys202RecsWrit400(work.getSys202RecsWrit400()+1);
          }
//  ELSE
          else { 
//  MOVE 300-SYS202 TO 600-3004-FILE-DD
              errorMsg6003004.setFileDd6003004(work.getSys202300());
//  MOVE 800-SYS202-STATUS TO 600-3004-FILE-STAT
              errorMsg6003004.setFileStat6003004(workAreas800.getSys202Status800());
//  MOVE 300-3004-ABEND-CODE TO 600-ERROR-CODE
              work.setErrorCode600(work.getAbendCode3003004());
              // MOVE 600-3004-ERROR-MSG TO 600-ERROR-TEXT
              work.setErrorText600(errorMsg6003004.toCharArray());
//  MOVE 300-PARA-3110 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara3110300());
//  PERFORM 9100-ABEND-PROGRAM
              abendProgram();/*9100-ABEND-PROGRAM*/
          }
      
      }
      /**
      * writeSys204 
      *   This method is derived from 
  *   COBOL Paragraph - 3120-WRITE-SYS204 COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sys204OutRec                   COBOL Name: SYS204-OUT-REC
      * - sys204RecsWrit400              COBOL Name: 400-SYS204-RECS-WRIT
      * - sys204300                      COBOL Name: 300-SYS204
      * - abendCode3003004               COBOL Name: 300-3004-ABEND-CODE
      * - errorMsg6003004                COBOL Name: 600-3004-ERROR-MSG
      * - para3120300                    COBOL Name: 300-PARA-3120
      *
      * Output :  

      * - sys204Status800                COBOL Name: 800-SYS204-STATUS
      * - sys204RecsWrit400              COBOL Name: 400-SYS204-RECS-WRIT
      * - fileDd6003004                  COBOL Name: 600-3004-FILE-DD
      * - sys204300                      COBOL Name: 300-SYS204
      * - fileStat6003004                COBOL Name: 600-3004-FILE-STAT
      * - errorCode600                   COBOL Name: 600-ERROR-CODE
      * - abendCode3003004               COBOL Name: 300-3004-ABEND-CODE
      * - errorText600                   COBOL Name: 600-ERROR-TEXT
      * - errorMsg6003004                COBOL Name: 600-3004-ERROR-MSG
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para3120300                    COBOL Name: 300-PARA-3120
      *
      * @throws CFException
      */
      private void writeSys204() throws Exception {
      
// ******************************************************************
// * Write sys204
// ******************************************************************
//  WRITE SYS204-OUT-REC
          sys204Out.write(sys204OutRec.toCharArray()); 
          sys204OutRec.setString(CONSTANTS.LOW_VALUE_1253885555);
          workAreas800.setSys204Status800(sys204Out.getStatusString() );
//  IF 88-800-SYS204-GOOD
          if ( workAreas800.isSys204Good88800()  ) { 
//  ADD 1 TO 400-SYS204-RECS-WRIT
              work.setSys204RecsWrit400(work.getSys204RecsWrit400()+1);
          }
//  ELSE
          else { 
//  MOVE 300-SYS204 TO 600-3004-FILE-DD
              errorMsg6003004.setFileDd6003004(work.getSys204300());
//  MOVE 800-SYS204-STATUS TO 600-3004-FILE-STAT
              errorMsg6003004.setFileStat6003004(workAreas800.getSys204Status800());
//  MOVE 300-3004-ABEND-CODE TO 600-ERROR-CODE
              work.setErrorCode600(work.getAbendCode3003004());
              // MOVE 600-3004-ERROR-MSG TO 600-ERROR-TEXT
              work.setErrorText600(errorMsg6003004.toCharArray());
//  MOVE 300-PARA-3120 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara3120300());
//  PERFORM 9100-ABEND-PROGRAM
              abendProgram();/*9100-ABEND-PROGRAM*/
          }
      
      }
      /**
      * writeExceptionRecords 
      *   This method is derived from 
  *   COBOL Paragraph - 8600-WRITE-EXCEPTION-RECORDS COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sys205OutRec                   COBOL Name: SYS205-OUT-REC
      * - sys205RecsWrit400              COBOL Name: 400-SYS205-RECS-WRIT
      * - sys205300                      COBOL Name: 300-SYS205
      * - abendCode3003004               COBOL Name: 300-3004-ABEND-CODE
      * - errorMsg6003004                COBOL Name: 600-3004-ERROR-MSG
      * - para8600300                    COBOL Name: 300-PARA-8600
      *
      * Output :  

      * - sys205Status800                COBOL Name: 800-SYS205-STATUS
      * - sys205RecsWrit400              COBOL Name: 400-SYS205-RECS-WRIT
      * - fileDd6003004                  COBOL Name: 600-3004-FILE-DD
      * - sys205300                      COBOL Name: 300-SYS205
      * - fileStat6003004                COBOL Name: 600-3004-FILE-STAT
      * - errorCode600                   COBOL Name: 600-ERROR-CODE
      * - abendCode3003004               COBOL Name: 300-3004-ABEND-CODE
      * - errorText600                   COBOL Name: 600-ERROR-TEXT
      * - errorMsg6003004                COBOL Name: 600-3004-ERROR-MSG
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para8600300                    COBOL Name: 300-PARA-8600
      *
      * @throws CFException
      */
      private void writeExceptionRecords() throws Exception {
      
// ******************************************************************
// * Write sys205
// ******************************************************************
//  WRITE SYS205-OUT-REC FROM IP9890H-PAYMENT-FILE-DATA
          sys205Out.write(ip9890hPaymentFileData.toCharArray()); 
          sys205OutRec.setString(CONSTANTS.LOW_VALUE_215725141);
          workAreas800.setSys205Status800(sys205Out.getStatusString() );
//  IF 88-800-SYS205-GOOD
          if ( workAreas800.isSys205Good88800()  ) { 
//  ADD 1 TO 400-SYS205-RECS-WRIT
              work.setSys205RecsWrit400(work.getSys205RecsWrit400()+1);
          }
//  ELSE
          else { 
//  MOVE 300-SYS205 TO 600-3004-FILE-DD
              errorMsg6003004.setFileDd6003004(work.getSys205300());
//  MOVE 800-SYS205-STATUS TO 600-3004-FILE-STAT
              errorMsg6003004.setFileStat6003004(workAreas800.getSys205Status800());
//  MOVE 300-3004-ABEND-CODE TO 600-ERROR-CODE
              work.setErrorCode600(work.getAbendCode3003004());
              // MOVE 600-3004-ERROR-MSG TO 600-ERROR-TEXT
              work.setErrorText600(errorMsg6003004.toCharArray());
//  MOVE 300-PARA-8600 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara8600300());
//  PERFORM 9100-ABEND-PROGRAM
              abendProgram();/*9100-ABEND-PROGRAM*/
          }
      
      }
      /**
      * closeFiles 
      *   This method is derived from 
  *   COBOL Paragraph - 3200-CLOSE-FILES COBOL Cyclomatic complexity - 17
      * Input  :  

      * - sys001StatusSw100              COBOL Name: 100-SYS001-STATUS-SW
      * - sys001Status800                COBOL Name: 800-SYS001-STATUS
      * - sys002StatusSw100              COBOL Name: 100-SYS002-STATUS-SW
      * - sys002Status800                COBOL Name: 800-SYS002-STATUS
      * - sys003StatusSw100              COBOL Name: 100-SYS003-STATUS-SW
      * - sys003Status800                COBOL Name: 800-SYS003-STATUS
      * - sys004StatusSw100              COBOL Name: 100-SYS004-STATUS-SW
      * - sys004Status800                COBOL Name: 800-SYS004-STATUS
      * - sys101StatusSw100              COBOL Name: 100-SYS101-STATUS-SW
      * - sys101Status800                COBOL Name: 800-SYS101-STATUS
      * - sys201StatusSw100              COBOL Name: 100-SYS201-STATUS-SW
      * - sys201Status800                COBOL Name: 800-SYS201-STATUS
      * - sys202StatusSw100              COBOL Name: 100-SYS202-STATUS-SW
      * - sys202Status800                COBOL Name: 800-SYS202-STATUS
      * - sys204StatusSw100              COBOL Name: 100-SYS204-STATUS-SW
      * - sys204Status800                COBOL Name: 800-SYS204-STATUS
      *
      * Output :  

      * - sys001StatusSw100              COBOL Name: 100-SYS001-STATUS-SW
      * - sys002StatusSw100              COBOL Name: 100-SYS002-STATUS-SW
      * - sys003StatusSw100              COBOL Name: 100-SYS003-STATUS-SW
      * - sys004StatusSw100              COBOL Name: 100-SYS004-STATUS-SW
      * - sys101StatusSw100              COBOL Name: 100-SYS101-STATUS-SW
      * - sys201StatusSw100              COBOL Name: 100-SYS201-STATUS-SW
      * - sys202StatusSw100              COBOL Name: 100-SYS202-STATUS-SW
      * - sys204StatusSw100              COBOL Name: 100-SYS204-STATUS-SW
      *
      * @throws CFException
      */
      private void closeFiles() throws Exception {
      
// ******************************************************************
// * Close files
// ******************************************************************
//  IF 100-SYS001-OPEN
          if ( work.isSys001Open100()  ) { 
//  CLOSE SYS001-IN
              sys001In.close(); 
              workAreas800.setSys001Status800(sys001In.getStatusString() );
//  IF 88-800-SYS001-GOOD
              if ( workAreas800.isSys001Good88800()  ) { 
//  SET 100-SYS001-CLOSED TO TRUE
                  work.setSys001Closed100True(); 
                  
              }
          }
//  IF 100-SYS002-OPEN
          if ( work.isSys002Open100()  ) { 
//  CLOSE SYS002-IN
              sys002In.close(); 
              workAreas800.setSys002Status800(sys002In.getStatusString() );
//  IF 88-800-SYS002-GOOD
              if ( workAreas800.isSys002Good88800()  ) { 
//  SET 100-SYS002-CLOSED TO TRUE
                  work.setSys002Closed100True(); 
                  
              }
          }
//  IF 100-SYS003-OPEN
          if ( work.isSys003Open100()  ) { 
//  CLOSE SYS003-IN
              sys003In.close(); 
              workAreas800.setSys003Status800(sys003In.getStatusString() );
//  IF 88-800-SYS003-GOOD
              if ( workAreas800.isSys003Good88800()  ) { 
//  SET 100-SYS003-CLOSED TO TRUE
                  work.setSys003Closed100True(); 
                  
              }
          }
//  IF 100-SYS004-OPEN
          if ( work.isSys004Open100()  ) { 
//  CLOSE SYS004-IN
              sys004In.close(); 
              workAreas800.setSys004Status800(sys004In.getStatusString() );
//  IF 88-800-SYS004-GOOD
              if ( workAreas800.isSys004Good88800()  ) { 
//  SET 100-SYS004-CLOSED TO TRUE
                  work.setSys004Closed100True(); 
                  
              }
          }
//  IF 100-SYS101-OPEN
          if ( work.isSys101Open100()  ) { 
//  CLOSE SYS101-OUT
              sys101Out.close(); 
              workAreas800.setSys101Status800(sys101Out.getStatusString() );
//  IF 88-800-SYS101-GOOD
              if ( workAreas800.isSys101Good88800()  ) { 
//  SET 100-SYS101-CLOSED TO TRUE
                  work.setSys101Closed100True(); 
                  
              }
          }
//  IF 100-SYS201-OPEN
          if ( work.isSys201Open100()  ) { 
//  CLOSE SYS201-OUT
              sys201Out.close(); 
              workAreas800.setSys201Status800(sys201Out.getStatusString() );
//  IF 88-800-SYS201-GOOD
              if ( workAreas800.isSys201Good88800()  ) { 
//  SET 100-SYS201-CLOSED TO TRUE
                  work.setSys201Closed100True(); 
                  
              }
          }
//  IF 100-SYS202-OPEN
          if ( work.isSys202Open100()  ) { 
//  CLOSE SYS202-OUT
              sys202Out.close(); 
              workAreas800.setSys202Status800(sys202Out.getStatusString() );
//  IF 88-800-SYS202-GOOD
              if ( workAreas800.isSys202Good88800()  ) { 
//  SET 100-SYS202-CLOSED TO TRUE
                  work.setSys202Closed100True(); 
                  
              }
          }
//  IF 100-SYS204-OPEN
          if ( work.isSys204Open100()  ) { 
//  CLOSE SYS204-OUT
              sys204Out.close(); 
              workAreas800.setSys204Status800(sys204Out.getStatusString() );
//  IF 88-800-SYS204-GOOD
              if ( workAreas800.isSys204Good88800()  ) { 
//  SET 100-SYS204-CLOSED TO TRUE
                  work.setSys204Closed100True(); 
                  
              }
          }
      
      }
      /**
      * add1240200Field 
      *   This method is derived from 
  *   COBOL Paragraph - 8000-ADD-1240200-FIELD COBOL Cyclomatic complexity - 4
      * Input  :  

      * - tblItems5001240200             COBOL Name: 500-1240200-TBL-ITEMS
      * - tblMax5001240200               COBOL Name: 500-1240200-TBL-MAX
      * - newElem800                     COBOL Name: 800-NEW-ELEM
      * - newElemLen800                  COBOL Name: 800-NEW-ELEM-LEN
      * - newElemValue800                COBOL Name: 800-NEW-ELEM-VALUE
      * - abendCode3003008               COBOL Name: 300-3008-ABEND-CODE
      * - errorMsg6003008                COBOL Name: 600-3008-ERROR-MSG
      * - para80001240200300             COBOL Name: 300-PARA-8000-1240200
      *
      * Output :  

      * - tblItems5001240200             COBOL Name: 500-1240200-TBL-ITEMS
      * - ndx5001240200                  COBOL Name: 500-1240200-NDX
      * - tagKey5001240200               COBOL Name: 500-1240200-TAG-KEY
      * - newElem800                     COBOL Name: 800-NEW-ELEM
      * - tagLen5001240200               COBOL Name: 500-1240200-TAG-LEN
      * - newElemLen800                  COBOL Name: 800-NEW-ELEM-LEN
      * - tagValue5001240200             COBOL Name: 500-1240200-TAG-VALUE
      * - newElemValue800                COBOL Name: 800-NEW-ELEM-VALUE
      * - ndx25001240200                 COBOL Name: 500-1240200-NDX2
      * - table6003008                   COBOL Name: 600-3008-TABLE
      * - maxSize6003008                 COBOL Name: 600-3008-MAX-SIZE
      * - tblMax5001240200               COBOL Name: 500-1240200-TBL-MAX
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - abendCode3003008               COBOL Name: 300-3008-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - errorMsg6003008                COBOL Name: 600-3008-ERROR-MSG
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para80001240200300             COBOL Name: 300-PARA-8000-1240200
      *
      * @throws CFException
      */
      private void add1240200Field() throws Exception {
			// Declare local variables used in the method
			NewElemData800 newElemData800 = workAreas800.getNewElemData800();
			int tblItems5001240200 = 0;
			int tblMax5001240200 = 0;
			// End of variable declaration

      
// * Element ip169502 as of 07/28/20 06:14:49                    [vc]
// ******************************************************************
// * add a field to the :t: element table
// *
// * note:
// * the following fields should be populated before this paragragh
// * is called.
// *
// * 800-new-elem
// * 800-new-elem-len
// * 800-new-elem-value
// ******************************************************************
          tblMax5001240200 = work.getTblMax5001240200();
          tblItems5001240200 = work.getTblItems5001240200();
//  IF 500-1240200-TBL-ITEMS < 500-1240200-TBL-MAX
          if (	( tblItems5001240200 < tblMax5001240200 )) { 
//  ADD 1 TO 500-1240200-TBL-ITEMS
              work.setTblItems5001240200(work.getTblItems5001240200()+1);
//  SET 500-1240200-NDX TO 500-1240200-TBL-ITEMS
              ndx5001240200 = work.getTblItems5001240200(); 
              
//  MOVE 800-NEW-ELEM TO 500-1240200-TAG-KEY ( 500-1240200-NDX )
              elementsTable5001240200.getTblEntry5001240200(ndx5001240200 - 1).getTagKey5001240200().setString(workAreas800.getNewElem800());
//  MOVE 800-NEW-ELEM-LEN TO 500-1240200-TAG-LEN ( 500-1240200-NDX )
              elementsTable5001240200.getTblEntry5001240200(ndx5001240200 - 1).getTagData5001240200().setTagLen5001240200(newElemData800.getNewElemLen800());
  
//  MOVE 800-NEW-ELEM-VALUE TO 500-1240200-TAG-VALUE ( 500-1240200-NDX )
              elementsTable5001240200.getTblEntry5001240200(ndx5001240200 - 1).getTagData5001240200().setTagValue5001240200(newElemData800.getNewElemValue800());
  
              tblItems5001240200 = work.getTblItems5001240200();
//  IF 500-1240200-TBL-ITEMS > 1
              if (	( tblItems5001240200 > 1 )) { 
//  SET 500-1240200-NDX2 TO 500-1240200-NDX
                  ndx25001240200 = ndx5001240200; 
                  
//  SET 500-1240200-NDX2 DOWN BY 1
                  ndx25001240200--; 
                  
//  IF 500-1240200-TAG-KEY ( 500-1240200-NDX ) < 500-1240200-TAG-KEY ( 500-1240200-NDX2 )
                  if (		compareChars(elementsTable5001240200.getTblEntry5001240200(ndx5001240200 - 1).getTagKey5001240200(),elementsTable5001240200.getTblEntry5001240200(ndx25001240200 - 1).getTagKey5001240200()) < 0 ) { 
//  PERFORM 8100-SORT-1240200-FIELDS
                      sort1240200Fields();/*8100-SORT-1240200-FIELDS*/
                  }
              }
  
          }
  
//  ELSE
          else { 
//  SET 600-3008-TABLE-1240200 TO TRUE
              errorMsg6003008.setTable12402006003008True(); 
              
//  MOVE 500-1240200-TBL-MAX TO 600-3008-MAX-SIZE
              errorMsg6003008.setMaxSize6003008(String.valueOf(CFUtil.pad(8,String.valueOf(work.getTblMax5001240200()),"0",CFUtil.LEFT_PAD)).toCharArray());
//  MOVE 300-3008-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(String.valueOf(work.getAbendCode3003008String()).toCharArray());
              // MOVE 600-3008-ERROR-MSG TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(errorMsg6003008.toCharArray());
//  MOVE 300-PARA-8000-1240200 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara80001240200300());
//  PERFORM 9100-ABEND-PROGRAM
              abendProgram();/*9100-ABEND-PROGRAM*/
          }
      
      }
      /**
      * sort1240200Fields 
      *   This method is derived from 
  *   COBOL Paragraph - 8100-SORT-1240200-FIELDS COBOL Cyclomatic complexity - 6
      * Input  :  

      * - tblItems5001240200             COBOL Name: 500-1240200-TBL-ITEMS
      * - ndx5001240200                  COBOL Name: 500-1240200-NDX
      * - ndx25001240200                 COBOL Name: 500-1240200-NDX2
      * - tagKey5001240200               COBOL Name: 500-1240200-TAG-KEY
      * - tblEntry5001240200             COBOL Name: 500-1240200-TBL-ENTRY
      *
      * Output :  

      * - ndx5001240200                  COBOL Name: 500-1240200-NDX
      * - ndx25001240200                 COBOL Name: 500-1240200-NDX2
      * - saveEntry800                   COBOL Name: 800-SAVE-ENTRY
      * - tblEntry5001240200             COBOL Name: 500-1240200-TBL-ENTRY
      *
      * @throws CFException
      */
      private void sort1240200Fields() throws Exception {
      
// ******************************************************************
// * Sort the :t: element table
// ******************************************************************
//  PERFORM VARYING 500-1240200-NDX FROM 500-1240200-TBL-ITEMS BY -1 UNTIL 500-1240200-NDX <= 1
          for (ndx5001240200 = work.getTblItems5001240200(); (	( ndx5001240200 > 1 )) ; ndx5001240200 = ndx5001240200 + -1 ) {
//  PERFORM VARYING 500-1240200-NDX2 FROM 1 BY 1 UNTIL 500-1240200-NDX2 >= 500-1240200-NDX
              for (ndx25001240200 = 1; (	( ndx25001240200 < ndx5001240200 )) ; ndx25001240200 = ndx25001240200 + 1 ) {
//  IF 500-1240200-TAG-KEY ( 500-1240200-NDX ) < 500-1240200-TAG-KEY ( 500-1240200-NDX2 )
                  if (		compareChars(elementsTable5001240200.getTblEntry5001240200(ndx5001240200 - 1).getTagKey5001240200(),elementsTable5001240200.getTblEntry5001240200(ndx25001240200 - 1).getTagKey5001240200()) < 0 ) { 
//  MOVE 500-1240200-TBL-ENTRY ( 500-1240200-NDX ) TO 800-SAVE-ENTRY
                      workAreas800.setSaveEntry800(elementsTable5001240200.getTblEntry5001240200(ndx5001240200 - 1).toCharArray());
//  MOVE 500-1240200-TBL-ENTRY ( 500-1240200-NDX2 ) TO 500-1240200-TBL-ENTRY ( 500-1240200-NDX )
                      elementsTable5001240200.setTblEntry5001240200((ndx5001240200 - 1),elementsTable5001240200.getTblEntry5001240200(ndx25001240200 - 1).toCharArray());
//  MOVE 800-SAVE-ENTRY TO 500-1240200-TBL-ENTRY ( 500-1240200-NDX2 )
                      elementsTable5001240200.setTblEntry5001240200((ndx25001240200 - 1),workAreas800.getSaveEntry800());
                  }
              }
          }
      
      }
      /**
      * update1240200Field 
      *   This method is derived from 
  *   COBOL Paragraph - 8200-UPDATE-1240200-FIELD COBOL Cyclomatic complexity - 2
      * Input  :  

      * - newElem800                     COBOL Name: 800-NEW-ELEM
      * - srchKeyFndSw5001240200         COBOL Name: 500-1240200-SRCH-KEY-FND-SW
      * - newElemLen800                  COBOL Name: 800-NEW-ELEM-LEN
      * - newElemValue800                COBOL Name: 800-NEW-ELEM-VALUE
      *
      * Output :  

      * - tblSrchKey5001240200           COBOL Name: 500-1240200-TBL-SRCH-KEY
      * - newElem800                     COBOL Name: 800-NEW-ELEM
      * - tagKey5001240200               COBOL Name: 500-1240200-TAG-KEY
      * - tagLen5001240200               COBOL Name: 500-1240200-TAG-LEN
      * - newElemLen800                  COBOL Name: 800-NEW-ELEM-LEN
      * - tagValue5001240200             COBOL Name: 500-1240200-TAG-VALUE
      * - newElemValue800                COBOL Name: 800-NEW-ELEM-VALUE
      *
      * @throws CFException
      */
      private void update1240200Field() throws Exception {
			// Declare local variables used in the method
			NewElemData800 newElemData800 = workAreas800.getNewElemData800();
			// End of variable declaration

      
// ******************************************************************
// * Update a field in to the :t: element table
// *
// * note:
// * the following fields should be populated before this paragragh
// * is called.
// * 800-new-elem        - element to be updated
// * 800-new-elem-len    - new length
// * 800-new-elem-value  - new value
// ******************************************************************
          // MOVE 800-NEW-ELEM TO 500-1240200-TBL-SRCH-KEY
          work.setTblSrchKey5001240200(workAreas800.getNewElem800());
//  PERFORM 8300-LOOKUP-1240200-FIELD
          lookup1240200Field();/*8300-LOOKUP-1240200-FIELD*/
//  IF 500-1240200-SRCH-KEY-FND
          if ( work.isSrchKeyFnd5001240200()  ) { 
//  MOVE 800-NEW-ELEM TO 500-1240200-TAG-KEY ( 500-1240200-NDX )
              elementsTable5001240200.getTblEntry5001240200(ndx5001240200 - 1).getTagKey5001240200().setString(workAreas800.getNewElem800());
//  MOVE 800-NEW-ELEM-LEN TO 500-1240200-TAG-LEN ( 500-1240200-NDX )
              elementsTable5001240200.getTblEntry5001240200(ndx5001240200 - 1).getTagData5001240200().setTagLen5001240200(newElemData800.getNewElemLen800());
  
//  MOVE 800-NEW-ELEM-VALUE TO 500-1240200-TAG-VALUE ( 500-1240200-NDX )
              elementsTable5001240200.getTblEntry5001240200(ndx5001240200 - 1).getTagData5001240200().setTagValue5001240200(newElemData800.getNewElemValue800());
  
          }
//  ELSE
          else { 
//  PERFORM 8000-ADD-1240200-FIELD
              add1240200Field();/*8000-ADD-1240200-FIELD*/
          }
      
      }
      /**
      * lookup1240200Field 
      *   This method is derived from 
  *   COBOL Paragraph - 8300-LOOKUP-1240200-FIELD COBOL Cyclomatic complexity - 2
      * Input  :  

      * - tblEntry5001240200             COBOL Name: 500-1240200-TBL-ENTRY
      * - tagKey5001240200               COBOL Name: 500-1240200-TAG-KEY
      * - tblSrchKey5001240200           COBOL Name: 500-1240200-TBL-SRCH-KEY
      *
      * Output :  

      * - ndx5001240200                  COBOL Name: 500-1240200-NDX
      * - srchKeyFndSw5001240200         COBOL Name: 500-1240200-SRCH-KEY-FND-SW
      *
      * @throws CFException
      */
      private void lookup1240200Field() throws Exception {
			// Declare local variables used in the method
			boolean keepSearching = true;
			int[] searchIndexes = null;
			int searchLowPoint = 0;
			int searchMidPoint = 0;
			int searchHighPoint = 0;
			int searchCompare = 0;
			char[] tblSrchKey5001240200 = null;
			// End of variable declaration

      
// ******************************************************************
// * Lookup a field in to the :t: element table
// *
// * note:
// * 500-:t:-srch-key should be populated with proper
// * search key before this paragraph is called
// ******************************************************************
//  SET 500-1240200-NDX TO 1
          ndx5001240200 = 1; 
          
          tblSrchKey5001240200 = work.getTblSrchKey5001240200();
//  SEARCH ALL 500-1240200-TBL-ENTRY
          // Binary Search through elementsTable5001240200.tblEntry5001240200
          searchLowPoint = 0; //prevLowValue
          searchHighPoint = work.getTblItems5001240200(); //prevHighValue
          searchMidPoint = searchHighPoint / 2; //starting at mid point
          searchIndexes = new int[]{searchLowPoint,searchMidPoint,searchHighPoint};
          keepSearching = true;
          while (keepSearching) {
          // compare logic below
             searchCompare = compareAscending(elementsTable5001240200.getTblEntry5001240200(searchMidPoint).getTagKey5001240200(),tblSrchKey5001240200);
          // end of compare logic
          	if (searchCompare == 0 ) { // if search found
          	      keepSearching = false;
          	     ndx5001240200 = searchMidPoint	 + 1;
//  SET 500-1240200-SRCH-KEY-FND TO TRUE
              work.setSrchKeyFnd5001240200True(); 
              
          	} else  {
          		adjustSearchIndex(searchCompare,searchIndexes);
          		searchLowPoint  = searchIndexes[0];
           		searchMidPoint  = searchIndexes[1];
           		searchHighPoint = searchIndexes[2];
           		if (searchMidPoint == -1) { // search exhausted
           		    keepSearching = false; 
//  SET 500-1240200-SRCH-KEY-NOT-FND TO TRUE
              work.setSrchKeyNotFnd5001240200True(); 
              
           		}
          	}
          }
  
      
      }
      /**
      * display1240200Table 
      *   This method is derived from 
  *   COBOL Paragraph - 8400-DISPLAY-1240200-TABLE COBOL Cyclomatic complexity - 6
      * Input  :  

      * - srchKeyFndSw5001240200         COBOL Name: 500-1240200-SRCH-KEY-FND-SW
      * - tagValue5001240200             COBOL Name: 500-1240200-TAG-VALUE
      * - ndx5001240200                  COBOL Name: 500-1240200-NDX
      * - tblItems5001240200             COBOL Name: 500-1240200-TBL-ITEMS
      * - tagLen5001240200               COBOL Name: 500-1240200-TAG-LEN
      * - tagType5001240200              COBOL Name: 500-1240200-TAG-TYPE
      * - tagNum5001240200               COBOL Name: 500-1240200-TAG-NUM
      * - tagSubfldNo5001240200          COBOL Name: 500-1240200-TAG-SUBFLD-NO
      * - tagOccur5001240200             COBOL Name: 500-1240200-TAG-OCCUR
      *
      * Output :  

      * - tblSrchKey5001240200           COBOL Name: 500-1240200-TBL-SRCH-KEY
      * - ndx5001240200                  COBOL Name: 500-1240200-NDX
      * - ptrVal800                      COBOL Name: 800-PTR-VAL
      *
      * @throws CFException
      */
      private void display1240200Table() throws Exception {
      
// *    If 500-:t:-srch-key-fnd
// *       display 500-:t:-tbl-srch-key ' found'
// *       move 500-:t:-tbl-srch-key          to 800-new-elem
// *       move 500-:t:-tag-len(500-:t:-ndx)  to 800-new-elem-len
// *       move 500-:t:-tag-value(500-:t:-ndx)
// *         to 800-new-elem-value
// *    else
// *       display 500-:t:-tbl-srch-key ' not found'
// *       move 500-:t:-tbl-srch-key          to 800-new-elem
// *       move 0                             to 800-new-elem-len
// *       move spaces                        to 800-new-elem-value
// *    end-if

// ******************************************************************
// * Display the :t: element table
// ******************************************************************
//  DISPLAY '================================================'
          logger.info("================================================"); 
          // MOVE 'M000000000000' TO 500-1240200-TBL-SRCH-KEY
          //  LITERAL_M000000000000 = 'M000000000000'
          work.setTblSrchKey5001240200(CONSTANTS.LITERAL_M000000000000);
//  PERFORM 8300-LOOKUP-1240200-FIELD
          lookup1240200Field();/*8300-LOOKUP-1240200-FIELD*/
//  IF 500-1240200-SRCH-KEY-FND
          if ( work.isSrchKeyFnd5001240200()  ) { 
//  DISPLAY '= ' 500-1240200-TAG-VALUE ( 500-1240200-NDX ) (1 : 500-1240200-TAG-LEN ( 500-1240200-NDX ))
              logger.info("= {}", new String(substring(elementsTable5001240200.getTblEntry5001240200(ndx5001240200 - 1).getTagData5001240200().getTagValue5001240200(),0,elementsTable5001240200.getTblEntry5001240200(ndx5001240200 - 1).getTagData5001240200().getTagLen5001240200()))); 
          }
          // MOVE 'D002400000000' TO 500-1240200-TBL-SRCH-KEY
          //  LITERAL_D002400000000 = 'D002400000000'
          work.setTblSrchKey5001240200(CONSTANTS.LITERAL_D002400000000);
//  PERFORM 8300-LOOKUP-1240200-FIELD
          lookup1240200Field();/*8300-LOOKUP-1240200-FIELD*/
//  IF 500-1240200-SRCH-KEY-FND
          if ( work.isSrchKeyFnd5001240200()  ) { 
//  DISPLAY '= ' 500-1240200-TAG-VALUE ( 500-1240200-NDX ) (1 : 500-1240200-TAG-LEN ( 500-1240200-NDX ))
              logger.info("= {}", new String(substring(elementsTable5001240200.getTblEntry5001240200(ndx5001240200 - 1).getTagData5001240200().getTagValue5001240200(),0,elementsTable5001240200.getTblEntry5001240200(ndx5001240200 - 1).getTagData5001240200().getTagLen5001240200()))); 
          }
//  DISPLAY '= TABLE ELEMENTS'
          logger.info("= TABLE ELEMENTS"); 
//  DISPLAY '================================================'
          logger.info("================================================"); 
//  DISPLAY '     #   ' ' T' ' CODE' ' SUBF' ' OCCR' ' LEN' ' VALUE'
          logger.info("     #    T CODE SUBF OCCR LEN VALUE"); 
//  PERFORM VARYING 500-1240200-NDX FROM 1 BY 1 UNTIL 500-1240200-NDX > 500-1240200-TBL-ITEMS
          for (ndx5001240200 = 1; (	( ndx5001240200 <= work.getTblItems5001240200() )) ; ndx5001240200 = ndx5001240200 + 1 ) {
//  SET 800-PTR-VAL TO 500-1240200-NDX
              workAreas800.setPtrVal800(ndx5001240200); 
              
//  IF 500-1240200-TAG-LEN ( 500-1240200-NDX ) > 0
              if (	( elementsTable5001240200.getTblEntry5001240200(ndx5001240200 - 1).getTagData5001240200().getTagLen5001240200() > 0 )) { 
//  DISPLAY ' ' 800-PTR-VAL ' ' 500-1240200-TAG-TYPE ( 500-1240200-NDX ) ' ' 500-1240200-TAG-NUM ( 500-1240200-NDX ) ' ' 500-1240200-TAG-SUBFLD-NO ( 500-1240200-NDX ) ' ' 500-1240200-TAG-OCCUR ( 500-1240200-NDX ) ' ' 500-1240200-TAG-LEN ( 500-1240200-NDX ) ' ' 500-1240200-TAG-VALUE ( 500-1240200-NDX ) (1 : 500-1240200-TAG-LEN ( 500-1240200-NDX ))
                  logger.info(" {} {} {} {} {} {} {}", String.valueOf(workAreas800.getPtrVal800()), new String(elementsTable5001240200.getTblEntry5001240200(ndx5001240200 - 1).getTagKey5001240200().getTagType5001240200()), String.valueOf(elementsTable5001240200.getTblEntry5001240200(ndx5001240200 - 1).getTagKey5001240200().getTagNum5001240200()), String.valueOf(elementsTable5001240200.getTblEntry5001240200(ndx5001240200 - 1).getTagKey5001240200().getTagSubfldNo5001240200()), String.valueOf(elementsTable5001240200.getTblEntry5001240200(ndx5001240200 - 1).getTagKey5001240200().getTagOccur5001240200()), String.valueOf(elementsTable5001240200.getTblEntry5001240200(ndx5001240200 - 1).getTagData5001240200().getTagLen5001240200()), new String(substring(elementsTable5001240200.getTblEntry5001240200(ndx5001240200 - 1).getTagData5001240200().getTagValue5001240200(),0,elementsTable5001240200.getTblEntry5001240200(ndx5001240200 - 1).getTagData5001240200().getTagLen5001240200()))); 
              }
//  ELSE
              else { 
//  DISPLAY ' ' 800-PTR-VAL ' ' 500-1240200-TAG-TYPE ( 500-1240200-NDX ) ' ' 500-1240200-TAG-NUM ( 500-1240200-NDX ) ' ' 500-1240200-TAG-SUBFLD-NO ( 500-1240200-NDX ) ' ' 500-1240200-TAG-OCCUR ( 500-1240200-NDX ) ' ' 500-1240200-TAG-LEN ( 500-1240200-NDX ) ' ???'
                  logger.info(" {} {} {} {} {} {} ???", String.valueOf(workAreas800.getPtrVal800()), new String(elementsTable5001240200.getTblEntry5001240200(ndx5001240200 - 1).getTagKey5001240200().getTagType5001240200()), String.valueOf(elementsTable5001240200.getTblEntry5001240200(ndx5001240200 - 1).getTagKey5001240200().getTagNum5001240200()), String.valueOf(elementsTable5001240200.getTblEntry5001240200(ndx5001240200 - 1).getTagKey5001240200().getTagSubfldNo5001240200()), String.valueOf(elementsTable5001240200.getTblEntry5001240200(ndx5001240200 - 1).getTagKey5001240200().getTagOccur5001240200()), String.valueOf(elementsTable5001240200.getTblEntry5001240200(ndx5001240200 - 1).getTagData5001240200().getTagLen5001240200())); 
              }
          }
//  DISPLAY '================================================'
          logger.info("================================================"); 
      
      }
      /**
      * get1240200Field 
      *   This method is derived from 
  *   COBOL Paragraph - 8500-GET-1240200-FIELD COBOL Cyclomatic complexity - 6
      * Input  :  

      * - srchKeyFndSw5001240200         COBOL Name: 500-1240200-SRCH-KEY-FND-SW
      * - ndx5001240200                  COBOL Name: 500-1240200-NDX
      * - tagKey5001240200               COBOL Name: 500-1240200-TAG-KEY
      * - ndx25001240200                 COBOL Name: 500-1240200-NDX2
      * - tblItems5001240200             COBOL Name: 500-1240200-TBL-ITEMS
      * - tagValue5001240200             COBOL Name: 500-1240200-TAG-VALUE
      * - tagLen5001240200               COBOL Name: 500-1240200-TAG-LEN
      *
      * Output :  

      * - tblSrchKey5001240200           COBOL Name: 500-1240200-TBL-SRCH-KEY
      * - fieldPtr800                    COBOL Name: 800-FIELD-PTR
      * - fieldLen800                    COBOL Name: 800-FIELD-LEN
      * - ndx25001240200                 COBOL Name: 500-1240200-NDX2
      * - fieldVal800                    COBOL Name: 800-FIELD-VAL
      * - tagValue5001240200             COBOL Name: 500-1240200-TAG-VALUE
      *
      * @throws CFException
      */
      private void get1240200Field() throws Exception {
      
// ******************************************************************
// * Get a field value consisting of concatenated data element
// * subfields.
// *
// * note:
// * 500-:t:-srch-key should be populated with proper
// * search key before this paragraph is called
// *
// * field data   is stored in 800-field-val
// * field length is stored in 800-field-len
// ******************************************************************
//  PERFORM 8300-LOOKUP-1240200-FIELD
          lookup1240200Field();/*8300-LOOKUP-1240200-FIELD*/

// *    If data element has subfields; find first one
//  IF 500-1240200-SRCH-KEY-NOT-FND
          if ( work.isSrchKeyNotFnd5001240200()  ) { 
//  MOVE '0001' TO 500-1240200-TBL-SRCH-KEY (6 : 4)
//  LITERAL_0001 = '0001'
              work.setTblSrchKey5001240200(replace(work.getTblSrchKey5001240200(),CONSTANTS.LITERAL_0001,5,9));
//  PERFORM 8300-LOOKUP-1240200-FIELD
              lookup1240200Field();/*8300-LOOKUP-1240200-FIELD*/
          }
//  IF 500-1240200-SRCH-KEY-FND
          if ( work.isSrchKeyFnd5001240200()  ) { 
              // MOVE 1 TO 800-FIELD-PTR
              workAreas800.setFieldPtr800(1);
              // MOVE 0 TO 800-FIELD-LEN
              workAreas800.setFieldLen800(0);
//  PERFORM VARYING 500-1240200-NDX2 FROM 500-1240200-NDX BY 1 UNTIL 500-1240200-TAG-KEY ( 500-1240200-NDX2 ) (1 : 5) NOT EQUAL 500-1240200-TBL-SRCH-KEY (1 : 5) OR 500-1240200-NDX2 > 500-1240200-TBL-ITEMS
              for (ndx25001240200 = ndx5001240200; (		compareChars(substring(elementsTable5001240200.getTblEntry5001240200(ndx25001240200 - 1).getTagKey5001240200().toCharArray(),0,5),substring(work.getTblSrchKey5001240200(),0,5)) == 0  && 	( ndx25001240200 <= work.getTblItems5001240200() )) ; ndx25001240200 = ndx25001240200 + 1 ) {
//  MOVE 500-1240200-TAG-VALUE ( 500-1240200-NDX2 ) (1 : 500-1240200-TAG-LEN ( 500-1240200-NDX2 )) TO 800-FIELD-VAL ( 800-FIELD-PTR : 500-1240200-TAG-LEN ( 500-1240200-NDX2 ))
                  workAreas800.setFieldVal800(replace(workAreas800.getFieldVal800(),substring(elementsTable5001240200.getTblEntry5001240200(ndx25001240200 - 1).getTagData5001240200().getTagValue5001240200(),0,elementsTable5001240200.getTblEntry5001240200(ndx25001240200 - 1).getTagData5001240200().getTagLen5001240200()),(workAreas800.getFieldPtr800()-1), (elementsTable5001240200.getTblEntry5001240200(ndx25001240200 - 1).getTagData5001240200().getTagLen5001240200() + (workAreas800.getFieldPtr800() - 1)) ));
//  ADD 500-1240200-TAG-LEN ( 500-1240200-NDX2 ) TO 800-FIELD-PTR 800-FIELD-LEN
                  workAreas800.setFieldPtr800(workAreas800.getFieldPtr800()+elementsTable5001240200.getTblEntry5001240200(ndx25001240200 - 1).getTagData5001240200().getTagLen5001240200());
                  workAreas800.setFieldLen800(workAreas800.getFieldLen800()+elementsTable5001240200.getTblEntry5001240200(ndx25001240200 - 1).getTagData5001240200().getTagLen5001240200());
              }
          }
//  ELSE
          else { 
//  MOVE SPACES TO 800-FIELD-VAL
              workAreas800.setFieldVal800(CONSTANTS.SPACE_999);
              // MOVE 0 TO 800-FIELD-LEN
              workAreas800.setFieldLen800(0);
          }
      
      }
      /**
      * write1240200 
      *   This method is derived from 
  *   COBOL Paragraph - 8550-WRITE-1240200 COBOL Cyclomatic complexity - 4
      * Input  :  

      * - writeXmlSw1000                 COBOL Name: 1000-WRITE-XML-SW
      * - writePsipmSw1000               COBOL Name: 1000-WRITE-PSIPM-SW
      * - writeIpmSw1000                 COBOL Name: 1000-WRITE-IPM-SW
      *
      * Output : None 

      * @throws CFException
      */
      private void write1240200() throws Exception {
			// Declare local variables used in the method
			ParmData1000 parmData1000 = parms1000.getParmData1000();
			// End of variable declaration

      
// ******************************************************************
// * Write message
// ******************************************************************
          parmData1000 = parms1000.getParmData1000();
//  IF 1000-WRITE-XML-MSGS
          if ( parmData1000.isWriteXmlMsgs1000()  ) { 
//  PERFORM 8600-WRITE-1240200-XML
              write1240200Xml();/*8600-WRITE-1240200-XML*/
          }
  
          parmData1000 = parms1000.getParmData1000();
//  IF 1000-WRITE-PSIPM-MSGS
          if ( parmData1000.isWritePsipmMsgs1000()  ) { 
//  PERFORM 8700-WRITE-1240200-PSIPM
              write1240200Psipm();/*8700-WRITE-1240200-PSIPM*/
          }
  
          parmData1000 = parms1000.getParmData1000();
//  IF 1000-WRITE-IPM-MSGS
          if ( parmData1000.isWriteIpmMsgs1000()  ) { 
//  PERFORM 8800-WRITE-1240200-IPM
              write1240200Ipm();/*8800-WRITE-1240200-IPM*/
          }
  
      
      }
      /**
      * write1240200Xml 
      *   This method is derived from 
  *   COBOL Paragraph - 8600-WRITE-1240200-XML COBOL Cyclomatic complexity - 8
      * Input  :  

      * - fieldVal800                    COBOL Name: 800-FIELD-VAL
      * - indent800                      COBOL Name: 800-INDENT
      * - msgStrTag300                   COBOL Name: 300-MSG-STR-TAG
      * - tblItems5001240200             COBOL Name: 500-1240200-TBL-ITEMS
      * - m300                           COBOL Name: 300-M
      * - d300                           COBOL Name: 300-D
      * - p300                           COBOL Name: 300-P
      * - comnTagType500                 COBOL Name: 500-COMN-TAG-TYPE
      * - abendCode3003009               COBOL Name: 300-3009-ABEND-CODE
      * - errorMsg6003009                COBOL Name: 600-3009-ERROR-MSG
      * - msgEndTag300                   COBOL Name: 300-MSG-END-TAG
      *
      * Output :  

      * - ilvl800                        COBOL Name: 800-ILVL
      * - sys101Rdw800                   COBOL Name: 800-SYS101-RDW
      * - tblSrchKey5001240200           COBOL Name: 500-1240200-TBL-SRCH-KEY
      * - msgStrMti300                   COBOL Name: 300-MSG-STR-MTI
      * - fieldVal800                    COBOL Name: 800-FIELD-VAL
      * - sys101OutRec                   COBOL Name: SYS101-OUT-REC
      * - ndx5001240200                  COBOL Name: 500-1240200-NDX
      * - tag6003009                     COBOL Name: 600-3009-TAG
      * - comnTagType500                 COBOL Name: 500-COMN-TAG-TYPE
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - abendCode3003009               COBOL Name: 300-3009-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - errorMsg6003009                COBOL Name: 600-3009-ERROR-MSG
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      *
      * @throws CFException
      */
      private void write1240200Xml() throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			char[] p300 = null;
			Map<String,Object> updated = null;
			 final int MSG_END_TAG_300_LENGTH = 6;
			// End of variable declaration

      
// ******************************************************************
// * Write xml message
// ******************************************************************

// * Message header
//  SET 800-ILVL-1 TO TRUE
          workAreas800.setIlvl1800True(); 
          
          workAreas800.setSys101Rdw800((long)Math.abs(workAreas800.getIlvl800() + MsgStrTag300.getMsgStrTag300FieldLength()));
          // MOVE 'M000000000000' TO 500-1240200-TBL-SRCH-KEY
          //  LITERAL_M000000000000 = 'M000000000000'
          work.setTblSrchKey5001240200(CONSTANTS.LITERAL_M000000000000);
//  PERFORM 8500-GET-1240200-FIELD
          get1240200Field();/*8500-GET-1240200-FIELD*/
//  MOVE 800-FIELD-VAL (1 : 800-FIELD-LEN ) TO 300-MSG-STR-MTI
          msgStrTag300.setMsgStrMti300(CFUtil.getInt(substring(workAreas800.getFieldVal800(),0,workAreas800.getFieldLen800())));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-MSG-STR-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
          charArray = new ArrayList<char[]>();
             charArray.add(substring(workAreas800.getIndent800(),0,workAreas800.getIlvl800()));
             charArray.add(msgStrTag300.toCharArray());
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
          updated = updateString(sys101OutRec.toCharArray() ,joinCharArray);
          sys101OutRec.setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
          writeSys101();/*2200-WRITE-SYS101*/

// * Message details
//  SET 500-1240200-NDX TO 1
          ndx5001240200 = 1; 
          
//  PERFORM UNTIL 500-1240200-NDX > 500-1240200-TBL-ITEMS
          while ((	( ndx5001240200 <= work.getTblItems5001240200() ))) {
              p300 = work.getP300();
//  EVALUATE 500-1240200-TAG-TYPE ( 500-1240200-NDX )
              if  (		compareChars(elementsTable5001240200.getTblEntry5001240200(ndx5001240200 - 1).getTagKey5001240200().getTagType5001240200(),work.getM300()) == 0 ) { 

// *            Skip tag since we already wrote message header
//  SET 500-1240200-NDX UP BY 1
                  ndx5001240200++; 
                  
              }
              else if  (		compareChars(elementsTable5001240200.getTblEntry5001240200(ndx5001240200 - 1).getTagKey5001240200().getTagType5001240200(),work.getD300()) == 0 ) { 
//  PERFORM 8610-PROCESS-1240200-DE
                  process1240200De();/*8610-PROCESS-1240200-DE*/
              }
              else if  (		compareChars(elementsTable5001240200.getTblEntry5001240200(ndx5001240200 - 1).getTagKey5001240200().getTagType5001240200(),p300) == 0 ) { 
//  PERFORM 8620-PROCESS-1240200-PDS
                  process1240200Pds();/*8620-PROCESS-1240200-PDS*/
              }
              else   { 
//  MOVE 500-COMN-TAG-TYPE ( 500-COMN-NDX ) TO 600-3009-TAG
                  errorMsg6003009.setTag6003009(comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagKey500().getComnTagType500());
//  MOVE 300-3009-ABEND-CODE TO 900-ABEND-CODE
                  abendMessage900.setAbendCode900(String.valueOf(work.getAbendCode3003009String()).toCharArray());
                  // MOVE 600-3009-ERROR-MSG TO 900-ABEND-TEXT
                  abendMessage900.setAbendText900(errorMsg6003009.toCharArray());
//  MOVE '8600-WRITE-:T:-XML' TO 900-ABEND-PARA
                  abendParaName900.setAbendPara900(CONSTANTS.LITERAL_1572256913);
//  PERFORM 9100-ABEND-PROGRAM
                  abendProgram();/*9100-ABEND-PROGRAM*/
              }
  
          }

// * Message trailer
//  SET 800-ILVL-1 TO TRUE
          workAreas800.setIlvl1800True(); 
          
          workAreas800.setSys101Rdw800((long)Math.abs(workAreas800.getIlvl800() + MSG_END_TAG_300_LENGTH));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-MSG-END-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
          charArray = new ArrayList<char[]>();
             charArray.add(substring(workAreas800.getIndent800(),0,workAreas800.getIlvl800()));
             charArray.add(work.getMsgEndTag300());
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
          updated = updateString(sys101OutRec.toCharArray() ,joinCharArray);
          sys101OutRec.setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
          writeSys101();/*2200-WRITE-SYS101*/
          ;
      
      }
      /**
      * process1240200De 
      *   This method is derived from 
  *   COBOL Paragraph - 8610-PROCESS-1240200-DE COBOL Cyclomatic complexity - 6
      * Input  :  

      * - tagSubfldNo5001240200          COBOL Name: 500-1240200-TAG-SUBFLD-NO
      * - ndx5001240200                  COBOL Name: 500-1240200-NDX
      * - tagNum5001240200               COBOL Name: 500-1240200-TAG-NUM
      * - indent800                      COBOL Name: 800-INDENT
      * - deStrTag300                    COBOL Name: 300-DE-STR-TAG
      * - deEndTag300                    COBOL Name: 300-DE-END-TAG
      * - tagLen5001240200               COBOL Name: 500-1240200-TAG-LEN
      * - tagValue5001240200             COBOL Name: 500-1240200-TAG-VALUE
      *
      * Output :  

      * - deStrCd300                     COBOL Name: 300-DE-STR-CD
      * - tagNum5001240200               COBOL Name: 500-1240200-TAG-NUM
      * - ilvl800                        COBOL Name: 800-ILVL
      * - sys101Rdw800                   COBOL Name: 800-SYS101-RDW
      * - sys101OutRec                   COBOL Name: SYS101-OUT-REC
      * - saveTagNum800                  COBOL Name: 800-SAVE-TAG-NUM
      * - ndx5001240200                  COBOL Name: 500-1240200-NDX
      *
      * @throws CFException
      */
      private void process1240200De() throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			 final int DE_END_TAG_300_LENGTH = 5;
			// End of variable declaration

      
// ******************************************************************
// * Process de
// ******************************************************************
//  IF 500-1240200-TAG-SUBFLD-NO ( 500-1240200-NDX ) > 0
          if (	( elementsTable5001240200.getTblEntry5001240200(ndx5001240200 - 1).getTagKey5001240200().getTagSubfldNo5001240200() > 0 )) { 
//  MOVE 500-1240200-TAG-NUM ( 500-1240200-NDX ) TO 300-DE-STR-CD
              deStrTag300.setDeStrCd300(elementsTable5001240200.getTblEntry5001240200(ndx5001240200 - 1).getTagKey5001240200().getTagNum5001240200());
//  SET 800-ILVL-2 TO TRUE
              workAreas800.setIlvl2800True(); 
              
              workAreas800.setSys101Rdw800((long)Math.abs(workAreas800.getIlvl800() + DeStrTag300.getDeStrTag300FieldLength()));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-DE-STR-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(workAreas800.getIndent800(),0,workAreas800.getIlvl800()));
                 charArray.add(deStrTag300.toCharArray());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(sys101OutRec.toCharArray() ,joinCharArray);
              sys101OutRec.setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
              writeSys101();/*2200-WRITE-SYS101*/
//  MOVE 500-1240200-TAG-NUM ( 500-1240200-NDX ) TO 800-SAVE-TAG-NUM
              workAreas800.setSaveTagNum800(elementsTable5001240200.getTblEntry5001240200(ndx5001240200 - 1).getTagKey5001240200().getTagNum5001240200());
//  PERFORM 8630-PROCESS-1240200-SUBFLD UNTIL 500-1240200-TAG-NUM ( 500-1240200-NDX ) NOT EQUAL 800-SAVE-TAG-NUM
              while (	( elementsTable5001240200.getTblEntry5001240200(ndx5001240200 - 1).getTagKey5001240200().getTagNum5001240200() == workAreas800.getSaveTagNum800() )) {
                 process1240200Subfld();/*8630-PROCESS-1240200-SUBFLD*/
              }
//  SET 800-ILVL-2 TO TRUE
              workAreas800.setIlvl2800True(); 
              
              workAreas800.setSys101Rdw800((long)Math.abs(workAreas800.getIlvl800() + DE_END_TAG_300_LENGTH));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-DE-END-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(workAreas800.getIndent800(),0,workAreas800.getIlvl800()));
                 charArray.add(work.getDeEndTag300());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(sys101OutRec.toCharArray() ,joinCharArray);
              sys101OutRec.setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
              writeSys101();/*2200-WRITE-SYS101*/
          }
//  ELSE
          else { 
//  MOVE 500-1240200-TAG-NUM ( 500-1240200-NDX ) TO 300-DE-STR-CD
              deStrTag300.setDeStrCd300(elementsTable5001240200.getTblEntry5001240200(ndx5001240200 - 1).getTagKey5001240200().getTagNum5001240200());
//  SET 800-ILVL-2 TO TRUE
              workAreas800.setIlvl2800True(); 
              
              workAreas800.setSys101Rdw800((long)Math.abs(workAreas800.getIlvl800() + DeStrTag300.getDeStrTag300FieldLength() + elementsTable5001240200.getTblEntry5001240200(ndx5001240200 - 1).getTagData5001240200().getTagLen5001240200() + DE_END_TAG_300_LENGTH));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-DE-STR-TAG 500-1240200-TAG-VALUE ( 500-1240200-NDX ) (1 : 500-1240200-TAG-LEN ( 500-1240200-NDX )) 300-DE-END-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(workAreas800.getIndent800(),0,workAreas800.getIlvl800()));
                 charArray.add(deStrTag300.toCharArray());
                 charArray.add(substring(elementsTable5001240200.getTblEntry5001240200(ndx5001240200 - 1).getTagData5001240200().getTagValue5001240200(),0,elementsTable5001240200.getTblEntry5001240200(ndx5001240200 - 1).getTagData5001240200().getTagLen5001240200()));
                 charArray.add(work.getDeEndTag300());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3));
              updated = updateString(sys101OutRec.toCharArray() ,joinCharArray);
              sys101OutRec.setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
              writeSys101();/*2200-WRITE-SYS101*/
//  SET 500-1240200-NDX UP BY 1
              ndx5001240200++; 
              
          }
      
      }
      /**
      * process1240200Pds 
      *   This method is derived from 
  *   COBOL Paragraph - 8620-PROCESS-1240200-PDS COBOL Cyclomatic complexity - 6
      * Input  :  

      * - tagSubfldNo5001240200          COBOL Name: 500-1240200-TAG-SUBFLD-NO
      * - ndx5001240200                  COBOL Name: 500-1240200-NDX
      * - tagNum5001240200               COBOL Name: 500-1240200-TAG-NUM
      * - indent800                      COBOL Name: 800-INDENT
      * - pdsStrTag300                   COBOL Name: 300-PDS-STR-TAG
      * - pdsEndTag300                   COBOL Name: 300-PDS-END-TAG
      * - tagLen5001240200               COBOL Name: 500-1240200-TAG-LEN
      * - tagValue5001240200             COBOL Name: 500-1240200-TAG-VALUE
      *
      * Output :  

      * - pdsStrCd300                    COBOL Name: 300-PDS-STR-CD
      * - tagNum5001240200               COBOL Name: 500-1240200-TAG-NUM
      * - ilvl800                        COBOL Name: 800-ILVL
      * - sys101Rdw800                   COBOL Name: 800-SYS101-RDW
      * - sys101OutRec                   COBOL Name: SYS101-OUT-REC
      * - saveTagNum800                  COBOL Name: 800-SAVE-TAG-NUM
      * - ndx5001240200                  COBOL Name: 500-1240200-NDX
      *
      * @throws CFException
      */
      private void process1240200Pds() throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			 final int PDS_END_TAG_300_LENGTH = 6;
			// End of variable declaration

      
// ******************************************************************
// * Process pds
// ******************************************************************
//  IF 500-1240200-TAG-SUBFLD-NO ( 500-1240200-NDX ) > 0
          if (	( elementsTable5001240200.getTblEntry5001240200(ndx5001240200 - 1).getTagKey5001240200().getTagSubfldNo5001240200() > 0 )) { 
//  MOVE 500-1240200-TAG-NUM ( 500-1240200-NDX ) TO 300-PDS-STR-CD
              pdsStrTag300.setPdsStrCd300(elementsTable5001240200.getTblEntry5001240200(ndx5001240200 - 1).getTagKey5001240200().getTagNum5001240200());
//  SET 800-ILVL-2 TO TRUE
              workAreas800.setIlvl2800True(); 
              
              workAreas800.setSys101Rdw800((long)Math.abs(workAreas800.getIlvl800() + PdsStrTag300.getPdsStrTag300FieldLength()));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-PDS-STR-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(workAreas800.getIndent800(),0,workAreas800.getIlvl800()));
                 charArray.add(pdsStrTag300.toCharArray());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(sys101OutRec.toCharArray() ,joinCharArray);
              sys101OutRec.setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
              writeSys101();/*2200-WRITE-SYS101*/
//  MOVE 500-1240200-TAG-NUM ( 500-1240200-NDX ) TO 800-SAVE-TAG-NUM
              workAreas800.setSaveTagNum800(elementsTable5001240200.getTblEntry5001240200(ndx5001240200 - 1).getTagKey5001240200().getTagNum5001240200());
//  PERFORM 8630-PROCESS-1240200-SUBFLD UNTIL 500-1240200-TAG-NUM ( 500-1240200-NDX ) NOT EQUAL 800-SAVE-TAG-NUM
              while (	( elementsTable5001240200.getTblEntry5001240200(ndx5001240200 - 1).getTagKey5001240200().getTagNum5001240200() == workAreas800.getSaveTagNum800() )) {
                 process1240200Subfld();/*8630-PROCESS-1240200-SUBFLD*/
              }
//  SET 800-ILVL-2 TO TRUE
              workAreas800.setIlvl2800True(); 
              
              workAreas800.setSys101Rdw800((long)Math.abs(workAreas800.getIlvl800() + PDS_END_TAG_300_LENGTH));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-PDS-END-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(workAreas800.getIndent800(),0,workAreas800.getIlvl800()));
                 charArray.add(work.getPdsEndTag300());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(sys101OutRec.toCharArray() ,joinCharArray);
              sys101OutRec.setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
              writeSys101();/*2200-WRITE-SYS101*/
          }
//  ELSE
          else { 
//  MOVE 500-1240200-TAG-NUM ( 500-1240200-NDX ) TO 300-PDS-STR-CD
              pdsStrTag300.setPdsStrCd300(elementsTable5001240200.getTblEntry5001240200(ndx5001240200 - 1).getTagKey5001240200().getTagNum5001240200());
//  SET 800-ILVL-2 TO TRUE
              workAreas800.setIlvl2800True(); 
              
              workAreas800.setSys101Rdw800((long)Math.abs(workAreas800.getIlvl800() + PdsStrTag300.getPdsStrTag300FieldLength() + elementsTable5001240200.getTblEntry5001240200(ndx5001240200 - 1).getTagData5001240200().getTagLen5001240200() + PDS_END_TAG_300_LENGTH));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-PDS-STR-TAG 500-1240200-TAG-VALUE ( 500-1240200-NDX ) (1 : 500-1240200-TAG-LEN ( 500-1240200-NDX )) 300-PDS-END-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(workAreas800.getIndent800(),0,workAreas800.getIlvl800()));
                 charArray.add(pdsStrTag300.toCharArray());
                 charArray.add(substring(elementsTable5001240200.getTblEntry5001240200(ndx5001240200 - 1).getTagData5001240200().getTagValue5001240200(),0,elementsTable5001240200.getTblEntry5001240200(ndx5001240200 - 1).getTagData5001240200().getTagLen5001240200()));
                 charArray.add(work.getPdsEndTag300());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3));
              updated = updateString(sys101OutRec.toCharArray() ,joinCharArray);
              sys101OutRec.setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
              writeSys101();/*2200-WRITE-SYS101*/
//  SET 500-1240200-NDX UP BY 1
              ndx5001240200++; 
              
          }
      
      }
      /**
      * process1240200Subfld 
      *   This method is derived from 
  *   COBOL Paragraph - 8630-PROCESS-1240200-SUBFLD COBOL Cyclomatic complexity - 4
      * Input  :  

      * - tagLen5001240200               COBOL Name: 500-1240200-TAG-LEN
      * - ndx5001240200                  COBOL Name: 500-1240200-NDX
      * - indent800                      COBOL Name: 800-INDENT
      * - subfldTagStr300                COBOL Name: 300-SUBFLD-TAG-STR
      * - tagValue5001240200             COBOL Name: 500-1240200-TAG-VALUE
      * - subfldTagEnd300                COBOL Name: 300-SUBFLD-TAG-END
      *
      * Output :  

      * - ilvl800                        COBOL Name: 800-ILVL
      * - sys101Rdw800                   COBOL Name: 800-SYS101-RDW
      * - sys101OutRec                   COBOL Name: SYS101-OUT-REC
      * - ndx5001240200                  COBOL Name: 500-1240200-NDX
      *
      * @throws CFException
      */
      private void process1240200Subfld() throws Exception {
			// Declare local variables used in the method
			 final int SUBFLD_TAG_STR_300_LENGTH = 3;
			 final int SUBFLD_TAG_END_300_LENGTH = 4;
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			// End of variable declaration

      
// ******************************************************************
// * Process subfields
// ******************************************************************
//  SET 800-ILVL-3 TO TRUE
          workAreas800.setIlvl3800True(); 
          
          workAreas800.setSys101Rdw800((long)Math.abs(workAreas800.getIlvl800() + SUBFLD_TAG_STR_300_LENGTH + elementsTable5001240200.getTblEntry5001240200(ndx5001240200 - 1).getTagData5001240200().getTagLen5001240200() + SUBFLD_TAG_END_300_LENGTH));
//  IF 500-1240200-TAG-LEN ( 500-1240200-NDX ) > 0
          if (	( elementsTable5001240200.getTblEntry5001240200(ndx5001240200 - 1).getTagData5001240200().getTagLen5001240200() > 0 )) { 
//  STRING 800-INDENT (1 : 800-ILVL ) 300-SUBFLD-TAG-STR 500-1240200-TAG-VALUE ( 500-1240200-NDX ) (1 : 500-1240200-TAG-LEN ( 500-1240200-NDX )) 300-SUBFLD-TAG-END DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(workAreas800.getIndent800(),0,workAreas800.getIlvl800()));
                 charArray.add(work.getSubfldTagStr300());
                 charArray.add(substring(elementsTable5001240200.getTblEntry5001240200(ndx5001240200 - 1).getTagData5001240200().getTagValue5001240200(),0,elementsTable5001240200.getTblEntry5001240200(ndx5001240200 - 1).getTagData5001240200().getTagLen5001240200()));
                 charArray.add(work.getSubfldTagEnd300());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3));
              updated = updateString(sys101OutRec.toCharArray() ,joinCharArray);
              sys101OutRec.setString(  (char[])updated.get("string"));
          }
//  ELSE
          else { 
//  STRING 800-INDENT (1 : 800-ILVL ) 300-SUBFLD-TAG-STR 300-SUBFLD-TAG-END DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(workAreas800.getIndent800(),0,workAreas800.getIlvl800()));
                 charArray.add(work.getSubfldTagStr300());
                 charArray.add(work.getSubfldTagEnd300());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2));
              updated = updateString(sys101OutRec.toCharArray() ,joinCharArray);
              sys101OutRec.setString(  (char[])updated.get("string"));
          }
//  PERFORM 2200-WRITE-SYS101
          writeSys101();/*2200-WRITE-SYS101*/
//  SET 500-1240200-NDX UP BY 1
          ndx5001240200++; 
          
      
      }
      /**
      * write1240200Psipm 
      *   This method is derived from 
  *   COBOL Paragraph - 8700-WRITE-1240200-PSIPM COBOL Cyclomatic complexity - 9
      * Input  :  

      * - ndx5001240200                  COBOL Name: 500-1240200-NDX
      * - tblItems5001240200             COBOL Name: 500-1240200-TBL-ITEMS
      * - tagNum5001240200               COBOL Name: 500-1240200-TAG-NUM
      * - tagOccur5001240200             COBOL Name: 500-1240200-TAG-OCCUR
      * - tagSubfldNo5001240200          COBOL Name: 500-1240200-TAG-SUBFLD-NO
      * - tagLen5001240200               COBOL Name: 500-1240200-TAG-LEN
      * - tagValue5001240200             COBOL Name: 500-1240200-TAG-VALUE
      * - tag800                         COBOL Name: 800-TAG
      *
      * Output :  

      * - ip66601UserT                   COBOL Name: IP66601-USER-T
      * - ip66601UserTcnt                COBOL Name: IP66601-USER-TCNT
      * - fldStrt800                     COBOL Name: 800-FLD-STRT
      * - ndx5001240200                  COBOL Name: 500-1240200-NDX
      * - ip66601UserTagType             COBOL Name: IP66601-USER-TAG-TYPE
      * - ip66601UserTagNo               COBOL Name: IP66601-USER-TAG-NO
      * - tagNum5001240200               COBOL Name: 500-1240200-TAG-NUM
      * - ip66601UserTagOccurrence       COBOL Name: IP66601-USER-TAG-OCCURRENCE
      * - tagOccur5001240200             COBOL Name: 500-1240200-TAG-OCCUR
      * - ip66601UserTagSubfldNo         COBOL Name: IP66601-USER-TAG-SUBFLD-NO
      * - tagSubfldNo5001240200          COBOL Name: 500-1240200-TAG-SUBFLD-NO
      * - ip66601UserTagStart            COBOL Name: IP66601-USER-TAG-START
      * - ip66601UserTagLngth            COBOL Name: IP66601-USER-TAG-LNGTH
      * - tagLen5001240200               COBOL Name: 500-1240200-TAG-LEN
      * - ip66102NormalIpmMsg            COBOL Name: IP66102-NORMAL-IPM-MSG
      * - tagValue5001240200             COBOL Name: 500-1240200-TAG-VALUE
      * - sys201Rdw800                   COBOL Name: 800-SYS201-RDW
      * - tagTblPtr800                   COBOL Name: 800-TAG-TBL-PTR
      * - sys201OutRec                   COBOL Name: SYS201-OUT-REC
      * - tagType800                     COBOL Name: 800-TAG-TYPE
      * - tagNum800                      COBOL Name: 800-TAG-NUM
      * - tagOccur800                    COBOL Name: 800-TAG-OCCUR
      * - tagSubfldNo800                 COBOL Name: 800-TAG-SUBFLD-NO
      * - tagStart800                    COBOL Name: 800-TAG-START
      * - tagLngth800                    COBOL Name: 800-TAG-LNGTH
      * - tag800                         COBOL Name: 800-TAG
      *
      * @throws CFException
      */
      private void write1240200Psipm() throws Exception {
			// Declare local variables used in the method
			Tag800 tag800 = workAreas800.getTag800();
			// End of variable declaration

      
// ******************************************************************
// * Write pseudo ipm message
// ******************************************************************
//  SET IP66601-USER-T TO 1
          ip66601UserT = 1; 
          
//  MOVE 1 TO IP66601-USER-TCNT 800-FLD-STRT
          ip66601UserTagInformation.setIp66601UserTcnt((short)1);
          workAreas800.setFldStrt800((long)1);

// *    Write element tags to user tag table
//  PERFORM VARYING 500-1240200-NDX FROM 1 BY 1 UNTIL 500-1240200-NDX > 500-1240200-TBL-ITEMS
          for (ndx5001240200 = 1; (	( ndx5001240200 <= work.getTblItems5001240200() )) ; ndx5001240200 = ndx5001240200 + 1 ) {
//  SET IP66601-USER-T TO 500-1240200-NDX
              ip66601UserT = ndx5001240200; 
              
//  EVALUATE 500-1240200-TAG-TYPE ( 500-1240200-NDX )
              switch(new String(elementsTable5001240200.getTblEntry5001240200(ndx5001240200 - 1).getTagKey5001240200().getTagType5001240200())){
              	case "M":
//  SET IP66601-USER-MTI-TAG ( IP66601-USER-T ) TO TRUE
                  ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserMtiTagTrue(); 
                  
              break;
              	case "D":
//  SET IP66601-USER-DE-TAG ( IP66601-USER-T ) TO TRUE
                  ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserDeTagTrue(); 
                  
              break;
              	case "P":
//  SET IP66601-USER-PDS-TAG ( IP66601-USER-T ) TO TRUE
                  ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserPdsTagTrue(); 
                  
              break;
              }
//  MOVE 500-1240200-TAG-NUM ( 500-1240200-NDX ) TO IP66601-USER-TAG-NO ( IP66601-USER-T )
              ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagNo((short) elementsTable5001240200.getTblEntry5001240200(ndx5001240200 - 1).getTagKey5001240200().getTagNum5001240200());
//  MOVE 500-1240200-TAG-OCCUR ( 500-1240200-NDX ) TO IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-T )
              ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().setIp66601UserTagOccurrence((short) elementsTable5001240200.getTblEntry5001240200(ndx5001240200 - 1).getTagKey5001240200().getTagOccur5001240200());
//  MOVE 500-1240200-TAG-SUBFLD-NO ( 500-1240200-NDX ) TO IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-T )
              ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().setIp66601UserTagSubfldNo((short) elementsTable5001240200.getTblEntry5001240200(ndx5001240200 - 1).getTagKey5001240200().getTagSubfldNo5001240200());
//  MOVE 800-FLD-STRT TO IP66601-USER-TAG-START ( IP66601-USER-T )
              ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).setIp66601UserTagStart((short) workAreas800.getFldStrt800());
//  MOVE 500-1240200-TAG-LEN ( 500-1240200-NDX ) TO IP66601-USER-TAG-LNGTH ( IP66601-USER-T )
              ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).setIp66601UserTagLngth((short) elementsTable5001240200.getTblEntry5001240200(ndx5001240200 - 1).getTagData5001240200().getTagLen5001240200());

// *    Write element content to message string
//  IF 500-1240200-TAG-LEN ( 500-1240200-NDX ) > 0
              if (	( elementsTable5001240200.getTblEntry5001240200(ndx5001240200 - 1).getTagData5001240200().getTagLen5001240200() > 0 )) { 
//  MOVE 500-1240200-TAG-VALUE ( 500-1240200-NDX ) (1 : 500-1240200-TAG-LEN ( 500-1240200-NDX )) TO IP66102-NORMAL-IPM-MSG ( 800-FLD-STRT : IP66601-USER-TAG-LNGTH ( IP66601-USER-T ))
                  ip66102IpmMsg.setIp66102NormalIpmMsg(replace(ip66102IpmMsg.getIp66102NormalIpmMsg().toCharArray(),substring(elementsTable5001240200.getTblEntry5001240200(ndx5001240200 - 1).getTagData5001240200().getTagValue5001240200(),0,elementsTable5001240200.getTblEntry5001240200(ndx5001240200 - 1).getTagData5001240200().getTagLen5001240200()),((int) workAreas800.getFldStrt800()-1), (ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagLngth() + ((int) workAreas800.getFldStrt800() - 1)) ));
              }
//  ADD IP66601-USER-TAG-LNGTH ( IP66601-USER-T ) TO 800-FLD-STRT
              workAreas800.setFldStrt800(workAreas800.getFldStrt800()+(short) ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagLngth());
          }

// *    Set ip66601-user-t     down by 1
//  SET IP66601-USER-TCNT TO IP66601-USER-T
          ip66601UserTagInformation.setIp66601UserTcnt((short) ip66601UserT); 
          
          workAreas800.setSys201Rdw800((long) (Math.abs(5 + workAreas800.getFldStrt800() - 1 +  ( 24 * ip66601UserTagInformation.getIp66601UserTcnt() ) )));
          workAreas800.setTagTblPtr800((long) (Math.abs(5 + workAreas800.getFldStrt800())));

// *    Write tag table pointer to sys201 record

// *    Write message string to sys201 record
//  MOVE 800-TAG-TBL-PTR TO SYS201-OUT-REC (1 : 5)
          sys201OutRec.replace(String.valueOf(workAreas800.getTagTblPtr800String()).toCharArray(),0,String.valueOf(workAreas800.getTagTblPtr800String()).length(),0,5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE IP66102-NORMAL-IPM-MSG (1 : 800-FLD-STRT ) TO SYS201-OUT-REC (6 : 800-FLD-STRT )
          sys201OutRec.replace(ip66102IpmMsg/*parent*/,0/*fromOffset - (sys201OutRec) */,(int) workAreas800.getFldStrt800()/*fromLen*/,0+6 - 1/*toOffset - (ip66102NormalIpmMsg) */,(int) workAreas800.getFldStrt800()/*toLen*/);
          // MOVE 800-TAG-TBL-PTR TO 800-FLD-STRT
          workAreas800.setFldStrt800(workAreas800.getTagTblPtr800());

// *    Write tag table to sys201 record
//  PERFORM VARYING IP66601-USER-T FROM 1 BY 1 UNTIL IP66601-USER-T > IP66601-USER-TCNT
          for (ip66601UserT = 1; (	( ip66601UserT <= ip66601UserTagInformation.getIp66601UserTcnt() ) ) ; ip66601UserT = ip66601UserT + 1 ) {
//  MOVE IP66601-USER-TAG-TYPE ( IP66601-USER-T ) TO 800-TAG-TYPE
              tag800.setTagType800(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagType());
  
//  MOVE IP66601-USER-TAG-NO ( IP66601-USER-T ) TO 800-TAG-NUM
              tag800.setTagNum800(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagNo());
  
//  MOVE IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-T ) TO 800-TAG-OCCUR
              tag800.setTagOccur800(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserTagOccurrence());
  
//  MOVE IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-T ) TO 800-TAG-SUBFLD-NO
              tag800.setTagSubfldNo800(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserTagSubfldNo());
  
//  MOVE IP66601-USER-TAG-START ( IP66601-USER-T ) TO 800-TAG-START
              tag800.setTagStart800(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagStart());
  
//  MOVE IP66601-USER-TAG-LNGTH ( IP66601-USER-T ) TO 800-TAG-LNGTH
              tag800.setTagLngth800(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagLngth());
  
//  MOVE 800-TAG (1 : 24) TO SYS201-OUT-REC ( 800-FLD-STRT : 24)
              sys201OutRec.replace(workAreas800/*parent*/,0/*fromOffset - (sys201OutRec) */,24/*fromLen*/,0+(int) workAreas800.getFldStrt800() - 1/*toOffset - (tag800) */,24/*toLen*/);
//  ADD 24 TO 800-FLD-STRT
              workAreas800.setFldStrt800(workAreas800.getFldStrt800()+(long)24);
          }
//  PERFORM 3110-WRITE-SYS201
          writeSys201();/*3110-WRITE-SYS201*/
          ;
      
      }
      /**
      * write1240200Ipm 
      *   This method is derived from 
  *   COBOL Paragraph - 8800-WRITE-1240200-IPM COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      private void write1240200Ipm() throws Exception {
      
// ******************************************************************
// * Write ipm message
// ******************************************************************
//  CALL 800-PTR-IP666010
          // CALL 800-PTR-IP666010
          	this.setRc( ip666010.process());
      
      }
      /**
      * add1644695Field 
      *   This method is derived from 
  *   COBOL Paragraph - 8000-ADD-1644695-FIELD COBOL Cyclomatic complexity - 4
      * Input  :  

      * - tblItems5001644695             COBOL Name: 500-1644695-TBL-ITEMS
      * - tblMax5001644695               COBOL Name: 500-1644695-TBL-MAX
      * - newElem800                     COBOL Name: 800-NEW-ELEM
      * - newElemLen800                  COBOL Name: 800-NEW-ELEM-LEN
      * - newElemValue800                COBOL Name: 800-NEW-ELEM-VALUE
      * - abendCode3003008               COBOL Name: 300-3008-ABEND-CODE
      * - errorMsg6003008                COBOL Name: 600-3008-ERROR-MSG
      * - para80001644695300             COBOL Name: 300-PARA-8000-1644695
      *
      * Output :  

      * - tblItems5001644695             COBOL Name: 500-1644695-TBL-ITEMS
      * - ndx5001644695                  COBOL Name: 500-1644695-NDX
      * - tagKey5001644695               COBOL Name: 500-1644695-TAG-KEY
      * - newElem800                     COBOL Name: 800-NEW-ELEM
      * - tagLen5001644695               COBOL Name: 500-1644695-TAG-LEN
      * - newElemLen800                  COBOL Name: 800-NEW-ELEM-LEN
      * - tagValue5001644695             COBOL Name: 500-1644695-TAG-VALUE
      * - newElemValue800                COBOL Name: 800-NEW-ELEM-VALUE
      * - ndx25001644695                 COBOL Name: 500-1644695-NDX2
      * - table6003008                   COBOL Name: 600-3008-TABLE
      * - maxSize6003008                 COBOL Name: 600-3008-MAX-SIZE
      * - tblMax5001644695               COBOL Name: 500-1644695-TBL-MAX
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - abendCode3003008               COBOL Name: 300-3008-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - errorMsg6003008                COBOL Name: 600-3008-ERROR-MSG
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para80001644695300             COBOL Name: 300-PARA-8000-1644695
      *
      * @throws CFException
      */
      private void add1644695Field() throws Exception {
			// Declare local variables used in the method
			NewElemData800 newElemData800 = workAreas800.getNewElemData800();
			int tblItems5001644695 = 0;
			int tblMax5001644695 = 0;
			// End of variable declaration

      
// * Element ip169502 as of 07/28/20 06:14:49                    [vc]
// ******************************************************************
// * add a field to the :t: element table
// *
// * note:
// * the following fields should be populated before this paragragh
// * is called.
// *
// * 800-new-elem
// * 800-new-elem-len
// * 800-new-elem-value
// ******************************************************************
          tblMax5001644695 = work.getTblMax5001644695();
          tblItems5001644695 = work.getTblItems5001644695();
//  IF 500-1644695-TBL-ITEMS < 500-1644695-TBL-MAX
          if (	( tblItems5001644695 < tblMax5001644695 )) { 
//  ADD 1 TO 500-1644695-TBL-ITEMS
              work.setTblItems5001644695(work.getTblItems5001644695()+1);
//  SET 500-1644695-NDX TO 500-1644695-TBL-ITEMS
              ndx5001644695 = work.getTblItems5001644695(); 
              
//  MOVE 800-NEW-ELEM TO 500-1644695-TAG-KEY ( 500-1644695-NDX )
              elementsTable5001644695.getTblEntry5001644695(ndx5001644695 - 1).getTagKey5001644695().setString(workAreas800.getNewElem800());
//  MOVE 800-NEW-ELEM-LEN TO 500-1644695-TAG-LEN ( 500-1644695-NDX )
              elementsTable5001644695.getTblEntry5001644695(ndx5001644695 - 1).getTagData5001644695().setTagLen5001644695(newElemData800.getNewElemLen800());
  
//  MOVE 800-NEW-ELEM-VALUE TO 500-1644695-TAG-VALUE ( 500-1644695-NDX )
              elementsTable5001644695.getTblEntry5001644695(ndx5001644695 - 1).getTagData5001644695().setTagValue5001644695(newElemData800.getNewElemValue800());
  
              tblItems5001644695 = work.getTblItems5001644695();
//  IF 500-1644695-TBL-ITEMS > 1
              if (	( tblItems5001644695 > 1 )) { 
//  SET 500-1644695-NDX2 TO 500-1644695-NDX
                  ndx25001644695 = ndx5001644695; 
                  
//  SET 500-1644695-NDX2 DOWN BY 1
                  ndx25001644695--; 
                  
//  IF 500-1644695-TAG-KEY ( 500-1644695-NDX ) < 500-1644695-TAG-KEY ( 500-1644695-NDX2 )
                  if (		compareChars(elementsTable5001644695.getTblEntry5001644695(ndx5001644695 - 1).getTagKey5001644695(),elementsTable5001644695.getTblEntry5001644695(ndx25001644695 - 1).getTagKey5001644695()) < 0 ) { 
//  PERFORM 8100-SORT-1644695-FIELDS
                      sort1644695Fields();/*8100-SORT-1644695-FIELDS*/
                  }
              }
  
          }
  
//  ELSE
          else { 
//  SET 600-3008-TABLE-1644695 TO TRUE
              errorMsg6003008.setTable16446956003008True(); 
              
//  MOVE 500-1644695-TBL-MAX TO 600-3008-MAX-SIZE
              errorMsg6003008.setMaxSize6003008(String.valueOf(CFUtil.pad(8,String.valueOf(work.getTblMax5001644695()),"0",CFUtil.LEFT_PAD)).toCharArray());
//  MOVE 300-3008-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(String.valueOf(work.getAbendCode3003008String()).toCharArray());
              // MOVE 600-3008-ERROR-MSG TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(errorMsg6003008.toCharArray());
//  MOVE 300-PARA-8000-1644695 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara80001644695300());
//  PERFORM 9100-ABEND-PROGRAM
              abendProgram();/*9100-ABEND-PROGRAM*/
          }
      
      }
      /**
      * sort1644695Fields 
      *   This method is derived from 
  *   COBOL Paragraph - 8100-SORT-1644695-FIELDS COBOL Cyclomatic complexity - 6
      * Input  :  

      * - tblItems5001644695             COBOL Name: 500-1644695-TBL-ITEMS
      * - ndx5001644695                  COBOL Name: 500-1644695-NDX
      * - ndx25001644695                 COBOL Name: 500-1644695-NDX2
      * - tagKey5001644695               COBOL Name: 500-1644695-TAG-KEY
      * - tblEntry5001644695             COBOL Name: 500-1644695-TBL-ENTRY
      *
      * Output :  

      * - ndx5001644695                  COBOL Name: 500-1644695-NDX
      * - ndx25001644695                 COBOL Name: 500-1644695-NDX2
      * - saveEntry800                   COBOL Name: 800-SAVE-ENTRY
      * - tblEntry5001644695             COBOL Name: 500-1644695-TBL-ENTRY
      *
      * @throws CFException
      */
      private void sort1644695Fields() throws Exception {
      
// ******************************************************************
// * Sort the :t: element table
// ******************************************************************
//  PERFORM VARYING 500-1644695-NDX FROM 500-1644695-TBL-ITEMS BY -1 UNTIL 500-1644695-NDX <= 1
          for (ndx5001644695 = work.getTblItems5001644695(); (	( ndx5001644695 > 1 )) ; ndx5001644695 = ndx5001644695 + -1 ) {
//  PERFORM VARYING 500-1644695-NDX2 FROM 1 BY 1 UNTIL 500-1644695-NDX2 >= 500-1644695-NDX
              for (ndx25001644695 = 1; (	( ndx25001644695 < ndx5001644695 )) ; ndx25001644695 = ndx25001644695 + 1 ) {
//  IF 500-1644695-TAG-KEY ( 500-1644695-NDX ) < 500-1644695-TAG-KEY ( 500-1644695-NDX2 )
                  if (		compareChars(elementsTable5001644695.getTblEntry5001644695(ndx5001644695 - 1).getTagKey5001644695(),elementsTable5001644695.getTblEntry5001644695(ndx25001644695 - 1).getTagKey5001644695()) < 0 ) { 
//  MOVE 500-1644695-TBL-ENTRY ( 500-1644695-NDX ) TO 800-SAVE-ENTRY
                      workAreas800.setSaveEntry800(elementsTable5001644695.getTblEntry5001644695(ndx5001644695 - 1).toCharArray());
//  MOVE 500-1644695-TBL-ENTRY ( 500-1644695-NDX2 ) TO 500-1644695-TBL-ENTRY ( 500-1644695-NDX )
                      elementsTable5001644695.setTblEntry5001644695((ndx5001644695 - 1),elementsTable5001644695.getTblEntry5001644695(ndx25001644695 - 1).toCharArray());
//  MOVE 800-SAVE-ENTRY TO 500-1644695-TBL-ENTRY ( 500-1644695-NDX2 )
                      elementsTable5001644695.setTblEntry5001644695((ndx25001644695 - 1),workAreas800.getSaveEntry800());
                  }
              }
          }
      
      }
      /**
      * update1644695Field 
      *   This method is derived from 
  *   COBOL Paragraph - 8200-UPDATE-1644695-FIELD COBOL Cyclomatic complexity - 2
      * Input  :  

      * - newElem800                     COBOL Name: 800-NEW-ELEM
      * - srchKeyFndSw5001644695         COBOL Name: 500-1644695-SRCH-KEY-FND-SW
      * - newElemLen800                  COBOL Name: 800-NEW-ELEM-LEN
      * - newElemValue800                COBOL Name: 800-NEW-ELEM-VALUE
      *
      * Output :  

      * - tblSrchKey5001644695           COBOL Name: 500-1644695-TBL-SRCH-KEY
      * - newElem800                     COBOL Name: 800-NEW-ELEM
      * - tagKey5001644695               COBOL Name: 500-1644695-TAG-KEY
      * - tagLen5001644695               COBOL Name: 500-1644695-TAG-LEN
      * - newElemLen800                  COBOL Name: 800-NEW-ELEM-LEN
      * - tagValue5001644695             COBOL Name: 500-1644695-TAG-VALUE
      * - newElemValue800                COBOL Name: 800-NEW-ELEM-VALUE
      *
      * @throws CFException
      */
      private void update1644695Field() throws Exception {
			// Declare local variables used in the method
			NewElemData800 newElemData800 = workAreas800.getNewElemData800();
			// End of variable declaration

      
// ******************************************************************
// * Update a field in to the :t: element table
// *
// * note:
// * the following fields should be populated before this paragragh
// * is called.
// * 800-new-elem        - element to be updated
// * 800-new-elem-len    - new length
// * 800-new-elem-value  - new value
// ******************************************************************
          // MOVE 800-NEW-ELEM TO 500-1644695-TBL-SRCH-KEY
          work.setTblSrchKey5001644695(workAreas800.getNewElem800());
//  PERFORM 8300-LOOKUP-1644695-FIELD
          lookup1644695Field();/*8300-LOOKUP-1644695-FIELD*/
//  IF 500-1644695-SRCH-KEY-FND
          if ( work.isSrchKeyFnd5001644695()  ) { 
//  MOVE 800-NEW-ELEM TO 500-1644695-TAG-KEY ( 500-1644695-NDX )
              elementsTable5001644695.getTblEntry5001644695(ndx5001644695 - 1).getTagKey5001644695().setString(workAreas800.getNewElem800());
//  MOVE 800-NEW-ELEM-LEN TO 500-1644695-TAG-LEN ( 500-1644695-NDX )
              elementsTable5001644695.getTblEntry5001644695(ndx5001644695 - 1).getTagData5001644695().setTagLen5001644695(newElemData800.getNewElemLen800());
  
//  MOVE 800-NEW-ELEM-VALUE TO 500-1644695-TAG-VALUE ( 500-1644695-NDX )
              elementsTable5001644695.getTblEntry5001644695(ndx5001644695 - 1).getTagData5001644695().setTagValue5001644695(newElemData800.getNewElemValue800());
  
          }
//  ELSE
          else { 
//  PERFORM 8000-ADD-1644695-FIELD
              add1644695Field();/*8000-ADD-1644695-FIELD*/
          }
      
      }
      /**
      * lookup1644695Field 
      *   This method is derived from 
  *   COBOL Paragraph - 8300-LOOKUP-1644695-FIELD COBOL Cyclomatic complexity - 2
      * Input  :  

      * - tblEntry5001644695             COBOL Name: 500-1644695-TBL-ENTRY
      * - tagKey5001644695               COBOL Name: 500-1644695-TAG-KEY
      * - tblSrchKey5001644695           COBOL Name: 500-1644695-TBL-SRCH-KEY
      *
      * Output :  

      * - ndx5001644695                  COBOL Name: 500-1644695-NDX
      * - srchKeyFndSw5001644695         COBOL Name: 500-1644695-SRCH-KEY-FND-SW
      *
      * @throws CFException
      */
      private void lookup1644695Field() throws Exception {
			// Declare local variables used in the method
			boolean keepSearching = true;
			int[] searchIndexes = null;
			int searchLowPoint = 0;
			int searchMidPoint = 0;
			int searchHighPoint = 0;
			int searchCompare = 0;
			char[] tblSrchKey5001644695 = null;
			// End of variable declaration

      
// ******************************************************************
// * Lookup a field in to the :t: element table
// *
// * note:
// * 500-:t:-srch-key should be populated with proper
// * search key before this paragraph is called
// ******************************************************************
//  SET 500-1644695-NDX TO 1
          ndx5001644695 = 1; 
          
          tblSrchKey5001644695 = work.getTblSrchKey5001644695();
//  SEARCH ALL 500-1644695-TBL-ENTRY
          // Binary Search through elementsTable5001644695.tblEntry5001644695
          searchLowPoint = 0; //prevLowValue
          searchHighPoint = work.getTblItems5001644695(); //prevHighValue
          searchMidPoint = searchHighPoint / 2; //starting at mid point
          searchIndexes = new int[]{searchLowPoint,searchMidPoint,searchHighPoint};
          keepSearching = true;
          while (keepSearching) {
          // compare logic below
             searchCompare = compareAscending(elementsTable5001644695.getTblEntry5001644695(searchMidPoint).getTagKey5001644695(),tblSrchKey5001644695);
          // end of compare logic
          	if (searchCompare == 0 ) { // if search found
          	      keepSearching = false;
          	     ndx5001644695 = searchMidPoint	 + 1;
//  SET 500-1644695-SRCH-KEY-FND TO TRUE
              work.setSrchKeyFnd5001644695True(); 
              
          	} else  {
          		adjustSearchIndex(searchCompare,searchIndexes);
          		searchLowPoint  = searchIndexes[0];
           		searchMidPoint  = searchIndexes[1];
           		searchHighPoint = searchIndexes[2];
           		if (searchMidPoint == -1) { // search exhausted
           		    keepSearching = false; 
//  SET 500-1644695-SRCH-KEY-NOT-FND TO TRUE
              work.setSrchKeyNotFnd5001644695True(); 
              
           		}
          	}
          }
  
      
      }
      /**
      * display1644695Table 
      *   This method is derived from 
  *   COBOL Paragraph - 8400-DISPLAY-1644695-TABLE COBOL Cyclomatic complexity - 6
      * Input  :  

      * - srchKeyFndSw5001644695         COBOL Name: 500-1644695-SRCH-KEY-FND-SW
      * - tagValue5001644695             COBOL Name: 500-1644695-TAG-VALUE
      * - ndx5001644695                  COBOL Name: 500-1644695-NDX
      * - tblItems5001644695             COBOL Name: 500-1644695-TBL-ITEMS
      * - tagLen5001644695               COBOL Name: 500-1644695-TAG-LEN
      * - tagType5001644695              COBOL Name: 500-1644695-TAG-TYPE
      * - tagNum5001644695               COBOL Name: 500-1644695-TAG-NUM
      * - tagSubfldNo5001644695          COBOL Name: 500-1644695-TAG-SUBFLD-NO
      * - tagOccur5001644695             COBOL Name: 500-1644695-TAG-OCCUR
      *
      * Output :  

      * - tblSrchKey5001644695           COBOL Name: 500-1644695-TBL-SRCH-KEY
      * - ndx5001644695                  COBOL Name: 500-1644695-NDX
      * - ptrVal800                      COBOL Name: 800-PTR-VAL
      *
      * @throws CFException
      */
      private void display1644695Table() throws Exception {
      
// *    If 500-:t:-srch-key-fnd
// *       display 500-:t:-tbl-srch-key ' found'
// *       move 500-:t:-tbl-srch-key          to 800-new-elem
// *       move 500-:t:-tag-len(500-:t:-ndx)  to 800-new-elem-len
// *       move 500-:t:-tag-value(500-:t:-ndx)
// *         to 800-new-elem-value
// *    else
// *       display 500-:t:-tbl-srch-key ' not found'
// *       move 500-:t:-tbl-srch-key          to 800-new-elem
// *       move 0                             to 800-new-elem-len
// *       move spaces                        to 800-new-elem-value
// *    end-if

// ******************************************************************
// * Display the :t: element table
// ******************************************************************
//  DISPLAY '================================================'
          logger.info("================================================"); 
          // MOVE 'M000000000000' TO 500-1644695-TBL-SRCH-KEY
          //  LITERAL_M000000000000 = 'M000000000000'
          work.setTblSrchKey5001644695(CONSTANTS.LITERAL_M000000000000);
//  PERFORM 8300-LOOKUP-1644695-FIELD
          lookup1644695Field();/*8300-LOOKUP-1644695-FIELD*/
//  IF 500-1644695-SRCH-KEY-FND
          if ( work.isSrchKeyFnd5001644695()  ) { 
//  DISPLAY '= ' 500-1644695-TAG-VALUE ( 500-1644695-NDX ) (1 : 500-1644695-TAG-LEN ( 500-1644695-NDX ))
              logger.info("= {}", new String(substring(elementsTable5001644695.getTblEntry5001644695(ndx5001644695 - 1).getTagData5001644695().getTagValue5001644695(),0,elementsTable5001644695.getTblEntry5001644695(ndx5001644695 - 1).getTagData5001644695().getTagLen5001644695()))); 
          }
          // MOVE 'D002400000000' TO 500-1644695-TBL-SRCH-KEY
          //  LITERAL_D002400000000 = 'D002400000000'
          work.setTblSrchKey5001644695(CONSTANTS.LITERAL_D002400000000);
//  PERFORM 8300-LOOKUP-1644695-FIELD
          lookup1644695Field();/*8300-LOOKUP-1644695-FIELD*/
//  IF 500-1644695-SRCH-KEY-FND
          if ( work.isSrchKeyFnd5001644695()  ) { 
//  DISPLAY '= ' 500-1644695-TAG-VALUE ( 500-1644695-NDX ) (1 : 500-1644695-TAG-LEN ( 500-1644695-NDX ))
              logger.info("= {}", new String(substring(elementsTable5001644695.getTblEntry5001644695(ndx5001644695 - 1).getTagData5001644695().getTagValue5001644695(),0,elementsTable5001644695.getTblEntry5001644695(ndx5001644695 - 1).getTagData5001644695().getTagLen5001644695()))); 
          }
//  DISPLAY '= TABLE ELEMENTS'
          logger.info("= TABLE ELEMENTS"); 
//  DISPLAY '================================================'
          logger.info("================================================"); 
//  DISPLAY '     #   ' ' T' ' CODE' ' SUBF' ' OCCR' ' LEN' ' VALUE'
          logger.info("     #    T CODE SUBF OCCR LEN VALUE"); 
//  PERFORM VARYING 500-1644695-NDX FROM 1 BY 1 UNTIL 500-1644695-NDX > 500-1644695-TBL-ITEMS
          for (ndx5001644695 = 1; (	( ndx5001644695 <= work.getTblItems5001644695() )) ; ndx5001644695 = ndx5001644695 + 1 ) {
//  SET 800-PTR-VAL TO 500-1644695-NDX
              workAreas800.setPtrVal800(ndx5001644695); 
              
//  IF 500-1644695-TAG-LEN ( 500-1644695-NDX ) > 0
              if (	( elementsTable5001644695.getTblEntry5001644695(ndx5001644695 - 1).getTagData5001644695().getTagLen5001644695() > 0 )) { 
//  DISPLAY ' ' 800-PTR-VAL ' ' 500-1644695-TAG-TYPE ( 500-1644695-NDX ) ' ' 500-1644695-TAG-NUM ( 500-1644695-NDX ) ' ' 500-1644695-TAG-SUBFLD-NO ( 500-1644695-NDX ) ' ' 500-1644695-TAG-OCCUR ( 500-1644695-NDX ) ' ' 500-1644695-TAG-LEN ( 500-1644695-NDX ) ' ' 500-1644695-TAG-VALUE ( 500-1644695-NDX ) (1 : 500-1644695-TAG-LEN ( 500-1644695-NDX ))
                  logger.info(" {} {} {} {} {} {} {}", String.valueOf(workAreas800.getPtrVal800()), new String(elementsTable5001644695.getTblEntry5001644695(ndx5001644695 - 1).getTagKey5001644695().getTagType5001644695()), String.valueOf(elementsTable5001644695.getTblEntry5001644695(ndx5001644695 - 1).getTagKey5001644695().getTagNum5001644695()), String.valueOf(elementsTable5001644695.getTblEntry5001644695(ndx5001644695 - 1).getTagKey5001644695().getTagSubfldNo5001644695()), String.valueOf(elementsTable5001644695.getTblEntry5001644695(ndx5001644695 - 1).getTagKey5001644695().getTagOccur5001644695()), String.valueOf(elementsTable5001644695.getTblEntry5001644695(ndx5001644695 - 1).getTagData5001644695().getTagLen5001644695()), new String(substring(elementsTable5001644695.getTblEntry5001644695(ndx5001644695 - 1).getTagData5001644695().getTagValue5001644695(),0,elementsTable5001644695.getTblEntry5001644695(ndx5001644695 - 1).getTagData5001644695().getTagLen5001644695()))); 
              }
//  ELSE
              else { 
//  DISPLAY ' ' 800-PTR-VAL ' ' 500-1644695-TAG-TYPE ( 500-1644695-NDX ) ' ' 500-1644695-TAG-NUM ( 500-1644695-NDX ) ' ' 500-1644695-TAG-SUBFLD-NO ( 500-1644695-NDX ) ' ' 500-1644695-TAG-OCCUR ( 500-1644695-NDX ) ' ' 500-1644695-TAG-LEN ( 500-1644695-NDX ) ' ???'
                  logger.info(" {} {} {} {} {} {} ???", String.valueOf(workAreas800.getPtrVal800()), new String(elementsTable5001644695.getTblEntry5001644695(ndx5001644695 - 1).getTagKey5001644695().getTagType5001644695()), String.valueOf(elementsTable5001644695.getTblEntry5001644695(ndx5001644695 - 1).getTagKey5001644695().getTagNum5001644695()), String.valueOf(elementsTable5001644695.getTblEntry5001644695(ndx5001644695 - 1).getTagKey5001644695().getTagSubfldNo5001644695()), String.valueOf(elementsTable5001644695.getTblEntry5001644695(ndx5001644695 - 1).getTagKey5001644695().getTagOccur5001644695()), String.valueOf(elementsTable5001644695.getTblEntry5001644695(ndx5001644695 - 1).getTagData5001644695().getTagLen5001644695())); 
              }
          }
//  DISPLAY '================================================'
          logger.info("================================================"); 
      
      }
      /**
      * get1644695Field 
      *   This method is derived from 
  *   COBOL Paragraph - 8500-GET-1644695-FIELD COBOL Cyclomatic complexity - 6
      * Input  :  

      * - srchKeyFndSw5001644695         COBOL Name: 500-1644695-SRCH-KEY-FND-SW
      * - ndx5001644695                  COBOL Name: 500-1644695-NDX
      * - tagKey5001644695               COBOL Name: 500-1644695-TAG-KEY
      * - ndx25001644695                 COBOL Name: 500-1644695-NDX2
      * - tblItems5001644695             COBOL Name: 500-1644695-TBL-ITEMS
      * - tagValue5001644695             COBOL Name: 500-1644695-TAG-VALUE
      * - tagLen5001644695               COBOL Name: 500-1644695-TAG-LEN
      *
      * Output :  

      * - tblSrchKey5001644695           COBOL Name: 500-1644695-TBL-SRCH-KEY
      * - fieldPtr800                    COBOL Name: 800-FIELD-PTR
      * - fieldLen800                    COBOL Name: 800-FIELD-LEN
      * - ndx25001644695                 COBOL Name: 500-1644695-NDX2
      * - fieldVal800                    COBOL Name: 800-FIELD-VAL
      * - tagValue5001644695             COBOL Name: 500-1644695-TAG-VALUE
      *
      * @throws CFException
      */
      private void get1644695Field() throws Exception {
      
// ******************************************************************
// * Get a field value consisting of concatenated data element
// * subfields.
// *
// * note:
// * 500-:t:-srch-key should be populated with proper
// * search key before this paragraph is called
// *
// * field data   is stored in 800-field-val
// * field length is stored in 800-field-len
// ******************************************************************
//  PERFORM 8300-LOOKUP-1644695-FIELD
          lookup1644695Field();/*8300-LOOKUP-1644695-FIELD*/

// *    If data element has subfields; find first one
//  IF 500-1644695-SRCH-KEY-NOT-FND
          if ( work.isSrchKeyNotFnd5001644695()  ) { 
//  MOVE '0001' TO 500-1644695-TBL-SRCH-KEY (6 : 4)
//  LITERAL_0001 = '0001'
              work.setTblSrchKey5001644695(replace(work.getTblSrchKey5001644695(),CONSTANTS.LITERAL_0001,5,9));
//  PERFORM 8300-LOOKUP-1644695-FIELD
              lookup1644695Field();/*8300-LOOKUP-1644695-FIELD*/
          }
//  IF 500-1644695-SRCH-KEY-FND
          if ( work.isSrchKeyFnd5001644695()  ) { 
              // MOVE 1 TO 800-FIELD-PTR
              workAreas800.setFieldPtr800(1);
              // MOVE 0 TO 800-FIELD-LEN
              workAreas800.setFieldLen800(0);
//  PERFORM VARYING 500-1644695-NDX2 FROM 500-1644695-NDX BY 1 UNTIL 500-1644695-TAG-KEY ( 500-1644695-NDX2 ) (1 : 5) NOT EQUAL 500-1644695-TBL-SRCH-KEY (1 : 5) OR 500-1644695-NDX2 > 500-1644695-TBL-ITEMS
              for (ndx25001644695 = ndx5001644695; (		compareChars(substring(elementsTable5001644695.getTblEntry5001644695(ndx25001644695 - 1).getTagKey5001644695().toCharArray(),0,5),substring(work.getTblSrchKey5001644695(),0,5)) == 0  && 	( ndx25001644695 <= work.getTblItems5001644695() )) ; ndx25001644695 = ndx25001644695 + 1 ) {
//  MOVE 500-1644695-TAG-VALUE ( 500-1644695-NDX2 ) (1 : 500-1644695-TAG-LEN ( 500-1644695-NDX2 )) TO 800-FIELD-VAL ( 800-FIELD-PTR : 500-1644695-TAG-LEN ( 500-1644695-NDX2 ))
                  workAreas800.setFieldVal800(replace(workAreas800.getFieldVal800(),substring(elementsTable5001644695.getTblEntry5001644695(ndx25001644695 - 1).getTagData5001644695().getTagValue5001644695(),0,elementsTable5001644695.getTblEntry5001644695(ndx25001644695 - 1).getTagData5001644695().getTagLen5001644695()),(workAreas800.getFieldPtr800()-1), (elementsTable5001644695.getTblEntry5001644695(ndx25001644695 - 1).getTagData5001644695().getTagLen5001644695() + (workAreas800.getFieldPtr800() - 1)) ));
//  ADD 500-1644695-TAG-LEN ( 500-1644695-NDX2 ) TO 800-FIELD-PTR 800-FIELD-LEN
                  workAreas800.setFieldPtr800(workAreas800.getFieldPtr800()+elementsTable5001644695.getTblEntry5001644695(ndx25001644695 - 1).getTagData5001644695().getTagLen5001644695());
                  workAreas800.setFieldLen800(workAreas800.getFieldLen800()+elementsTable5001644695.getTblEntry5001644695(ndx25001644695 - 1).getTagData5001644695().getTagLen5001644695());
              }
          }
//  ELSE
          else { 
//  MOVE SPACES TO 800-FIELD-VAL
              workAreas800.setFieldVal800(CONSTANTS.SPACE_999);
              // MOVE 0 TO 800-FIELD-LEN
              workAreas800.setFieldLen800(0);
          }
      
      }
      /**
      * write1644695 
      *   This method is derived from 
  *   COBOL Paragraph - 8550-WRITE-1644695 COBOL Cyclomatic complexity - 4
      * Input  :  

      * - writeXmlSw1000                 COBOL Name: 1000-WRITE-XML-SW
      * - writePsipmSw1000               COBOL Name: 1000-WRITE-PSIPM-SW
      * - writeIpmSw1000                 COBOL Name: 1000-WRITE-IPM-SW
      *
      * Output : None 

      * @throws CFException
      */
      private void write1644695() throws Exception {
			// Declare local variables used in the method
			ParmData1000 parmData1000 = parms1000.getParmData1000();
			// End of variable declaration

      
// ******************************************************************
// * Write message
// ******************************************************************
          parmData1000 = parms1000.getParmData1000();
//  IF 1000-WRITE-XML-MSGS
          if ( parmData1000.isWriteXmlMsgs1000()  ) { 
//  PERFORM 8600-WRITE-1644695-XML
              write1644695Xml();/*8600-WRITE-1644695-XML*/
          }
  
          parmData1000 = parms1000.getParmData1000();
//  IF 1000-WRITE-PSIPM-MSGS
          if ( parmData1000.isWritePsipmMsgs1000()  ) { 
//  PERFORM 8700-WRITE-1644695-PSIPM
              write1644695Psipm();/*8700-WRITE-1644695-PSIPM*/
          }
  
          parmData1000 = parms1000.getParmData1000();
//  IF 1000-WRITE-IPM-MSGS
          if ( parmData1000.isWriteIpmMsgs1000()  ) { 
//  PERFORM 8800-WRITE-1644695-IPM
              write1644695Ipm();/*8800-WRITE-1644695-IPM*/
          }
  
      
      }
      /**
      * write1644695Xml 
      *   This method is derived from 
  *   COBOL Paragraph - 8600-WRITE-1644695-XML COBOL Cyclomatic complexity - 8
      * Input  :  

      * - fieldVal800                    COBOL Name: 800-FIELD-VAL
      * - indent800                      COBOL Name: 800-INDENT
      * - msgStrTag300                   COBOL Name: 300-MSG-STR-TAG
      * - tblItems5001644695             COBOL Name: 500-1644695-TBL-ITEMS
      * - m300                           COBOL Name: 300-M
      * - d300                           COBOL Name: 300-D
      * - p300                           COBOL Name: 300-P
      * - comnTagType500                 COBOL Name: 500-COMN-TAG-TYPE
      * - abendCode3003009               COBOL Name: 300-3009-ABEND-CODE
      * - errorMsg6003009                COBOL Name: 600-3009-ERROR-MSG
      * - msgEndTag300                   COBOL Name: 300-MSG-END-TAG
      *
      * Output :  

      * - ilvl800                        COBOL Name: 800-ILVL
      * - sys101Rdw800                   COBOL Name: 800-SYS101-RDW
      * - tblSrchKey5001644695           COBOL Name: 500-1644695-TBL-SRCH-KEY
      * - msgStrMti300                   COBOL Name: 300-MSG-STR-MTI
      * - fieldVal800                    COBOL Name: 800-FIELD-VAL
      * - sys101OutRec                   COBOL Name: SYS101-OUT-REC
      * - ndx5001644695                  COBOL Name: 500-1644695-NDX
      * - tag6003009                     COBOL Name: 600-3009-TAG
      * - comnTagType500                 COBOL Name: 500-COMN-TAG-TYPE
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - abendCode3003009               COBOL Name: 300-3009-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - errorMsg6003009                COBOL Name: 600-3009-ERROR-MSG
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      *
      * @throws CFException
      */
      private void write1644695Xml() throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			char[] p300 = null;
			Map<String,Object> updated = null;
			 final int MSG_END_TAG_300_LENGTH = 6;
			// End of variable declaration

      
// ******************************************************************
// * Write xml message
// ******************************************************************

// * Message header
//  SET 800-ILVL-1 TO TRUE
          workAreas800.setIlvl1800True(); 
          
          workAreas800.setSys101Rdw800((long)Math.abs(workAreas800.getIlvl800() + MsgStrTag300.getMsgStrTag300FieldLength()));
          // MOVE 'M000000000000' TO 500-1644695-TBL-SRCH-KEY
          //  LITERAL_M000000000000 = 'M000000000000'
          work.setTblSrchKey5001644695(CONSTANTS.LITERAL_M000000000000);
//  PERFORM 8500-GET-1644695-FIELD
          get1644695Field();/*8500-GET-1644695-FIELD*/
//  MOVE 800-FIELD-VAL (1 : 800-FIELD-LEN ) TO 300-MSG-STR-MTI
          msgStrTag300.setMsgStrMti300(CFUtil.getInt(substring(workAreas800.getFieldVal800(),0,workAreas800.getFieldLen800())));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-MSG-STR-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
          charArray = new ArrayList<char[]>();
             charArray.add(substring(workAreas800.getIndent800(),0,workAreas800.getIlvl800()));
             charArray.add(msgStrTag300.toCharArray());
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
          updated = updateString(sys101OutRec.toCharArray() ,joinCharArray);
          sys101OutRec.setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
          writeSys101();/*2200-WRITE-SYS101*/

// * Message details
//  SET 500-1644695-NDX TO 1
          ndx5001644695 = 1; 
          
//  PERFORM UNTIL 500-1644695-NDX > 500-1644695-TBL-ITEMS
          while ((	( ndx5001644695 <= work.getTblItems5001644695() ))) {
              p300 = work.getP300();
//  EVALUATE 500-1644695-TAG-TYPE ( 500-1644695-NDX )
              if  (		compareChars(elementsTable5001644695.getTblEntry5001644695(ndx5001644695 - 1).getTagKey5001644695().getTagType5001644695(),work.getM300()) == 0 ) { 

// *            Skip tag since we already wrote message header
//  SET 500-1644695-NDX UP BY 1
                  ndx5001644695++; 
                  
              }
              else if  (		compareChars(elementsTable5001644695.getTblEntry5001644695(ndx5001644695 - 1).getTagKey5001644695().getTagType5001644695(),work.getD300()) == 0 ) { 
//  PERFORM 8610-PROCESS-1644695-DE
                  process1644695De();/*8610-PROCESS-1644695-DE*/
              }
              else if  (		compareChars(elementsTable5001644695.getTblEntry5001644695(ndx5001644695 - 1).getTagKey5001644695().getTagType5001644695(),p300) == 0 ) { 
//  PERFORM 8620-PROCESS-1644695-PDS
                  process1644695Pds();/*8620-PROCESS-1644695-PDS*/
              }
              else   { 
//  MOVE 500-COMN-TAG-TYPE ( 500-COMN-NDX ) TO 600-3009-TAG
                  errorMsg6003009.setTag6003009(comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagKey500().getComnTagType500());
//  MOVE 300-3009-ABEND-CODE TO 900-ABEND-CODE
                  abendMessage900.setAbendCode900(String.valueOf(work.getAbendCode3003009String()).toCharArray());
                  // MOVE 600-3009-ERROR-MSG TO 900-ABEND-TEXT
                  abendMessage900.setAbendText900(errorMsg6003009.toCharArray());
//  MOVE '8600-WRITE-:T:-XML' TO 900-ABEND-PARA
                  abendParaName900.setAbendPara900(CONSTANTS.LITERAL_1572256913);
//  PERFORM 9100-ABEND-PROGRAM
                  abendProgram();/*9100-ABEND-PROGRAM*/
              }
  
          }

// * Message trailer
//  SET 800-ILVL-1 TO TRUE
          workAreas800.setIlvl1800True(); 
          
          workAreas800.setSys101Rdw800((long)Math.abs(workAreas800.getIlvl800() + MSG_END_TAG_300_LENGTH));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-MSG-END-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
          charArray = new ArrayList<char[]>();
             charArray.add(substring(workAreas800.getIndent800(),0,workAreas800.getIlvl800()));
             charArray.add(work.getMsgEndTag300());
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
          updated = updateString(sys101OutRec.toCharArray() ,joinCharArray);
          sys101OutRec.setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
          writeSys101();/*2200-WRITE-SYS101*/
          ;
      
      }
      /**
      * process1644695De 
      *   This method is derived from 
  *   COBOL Paragraph - 8610-PROCESS-1644695-DE COBOL Cyclomatic complexity - 6
      * Input  :  

      * - tagSubfldNo5001644695          COBOL Name: 500-1644695-TAG-SUBFLD-NO
      * - ndx5001644695                  COBOL Name: 500-1644695-NDX
      * - tagNum5001644695               COBOL Name: 500-1644695-TAG-NUM
      * - indent800                      COBOL Name: 800-INDENT
      * - deStrTag300                    COBOL Name: 300-DE-STR-TAG
      * - deEndTag300                    COBOL Name: 300-DE-END-TAG
      * - tagLen5001644695               COBOL Name: 500-1644695-TAG-LEN
      * - tagValue5001644695             COBOL Name: 500-1644695-TAG-VALUE
      *
      * Output :  

      * - deStrCd300                     COBOL Name: 300-DE-STR-CD
      * - tagNum5001644695               COBOL Name: 500-1644695-TAG-NUM
      * - ilvl800                        COBOL Name: 800-ILVL
      * - sys101Rdw800                   COBOL Name: 800-SYS101-RDW
      * - sys101OutRec                   COBOL Name: SYS101-OUT-REC
      * - saveTagNum800                  COBOL Name: 800-SAVE-TAG-NUM
      * - ndx5001644695                  COBOL Name: 500-1644695-NDX
      *
      * @throws CFException
      */
      private void process1644695De() throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			 final int DE_END_TAG_300_LENGTH = 5;
			// End of variable declaration

      
// ******************************************************************
// * Process de
// ******************************************************************
//  IF 500-1644695-TAG-SUBFLD-NO ( 500-1644695-NDX ) > 0
          if (	( elementsTable5001644695.getTblEntry5001644695(ndx5001644695 - 1).getTagKey5001644695().getTagSubfldNo5001644695() > 0 )) { 
//  MOVE 500-1644695-TAG-NUM ( 500-1644695-NDX ) TO 300-DE-STR-CD
              deStrTag300.setDeStrCd300(elementsTable5001644695.getTblEntry5001644695(ndx5001644695 - 1).getTagKey5001644695().getTagNum5001644695());
//  SET 800-ILVL-2 TO TRUE
              workAreas800.setIlvl2800True(); 
              
              workAreas800.setSys101Rdw800((long)Math.abs(workAreas800.getIlvl800() + DeStrTag300.getDeStrTag300FieldLength()));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-DE-STR-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(workAreas800.getIndent800(),0,workAreas800.getIlvl800()));
                 charArray.add(deStrTag300.toCharArray());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(sys101OutRec.toCharArray() ,joinCharArray);
              sys101OutRec.setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
              writeSys101();/*2200-WRITE-SYS101*/
//  MOVE 500-1644695-TAG-NUM ( 500-1644695-NDX ) TO 800-SAVE-TAG-NUM
              workAreas800.setSaveTagNum800(elementsTable5001644695.getTblEntry5001644695(ndx5001644695 - 1).getTagKey5001644695().getTagNum5001644695());
//  PERFORM 8630-PROCESS-1644695-SUBFLD UNTIL 500-1644695-TAG-NUM ( 500-1644695-NDX ) NOT EQUAL 800-SAVE-TAG-NUM
              while (	( elementsTable5001644695.getTblEntry5001644695(ndx5001644695 - 1).getTagKey5001644695().getTagNum5001644695() == workAreas800.getSaveTagNum800() )) {
                 process1644695Subfld();/*8630-PROCESS-1644695-SUBFLD*/
              }
//  SET 800-ILVL-2 TO TRUE
              workAreas800.setIlvl2800True(); 
              
              workAreas800.setSys101Rdw800((long)Math.abs(workAreas800.getIlvl800() + DE_END_TAG_300_LENGTH));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-DE-END-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(workAreas800.getIndent800(),0,workAreas800.getIlvl800()));
                 charArray.add(work.getDeEndTag300());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(sys101OutRec.toCharArray() ,joinCharArray);
              sys101OutRec.setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
              writeSys101();/*2200-WRITE-SYS101*/
          }
//  ELSE
          else { 
//  MOVE 500-1644695-TAG-NUM ( 500-1644695-NDX ) TO 300-DE-STR-CD
              deStrTag300.setDeStrCd300(elementsTable5001644695.getTblEntry5001644695(ndx5001644695 - 1).getTagKey5001644695().getTagNum5001644695());
//  SET 800-ILVL-2 TO TRUE
              workAreas800.setIlvl2800True(); 
              
              workAreas800.setSys101Rdw800((long)Math.abs(workAreas800.getIlvl800() + DeStrTag300.getDeStrTag300FieldLength() + elementsTable5001644695.getTblEntry5001644695(ndx5001644695 - 1).getTagData5001644695().getTagLen5001644695() + DE_END_TAG_300_LENGTH));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-DE-STR-TAG 500-1644695-TAG-VALUE ( 500-1644695-NDX ) (1 : 500-1644695-TAG-LEN ( 500-1644695-NDX )) 300-DE-END-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(workAreas800.getIndent800(),0,workAreas800.getIlvl800()));
                 charArray.add(deStrTag300.toCharArray());
                 charArray.add(substring(elementsTable5001644695.getTblEntry5001644695(ndx5001644695 - 1).getTagData5001644695().getTagValue5001644695(),0,elementsTable5001644695.getTblEntry5001644695(ndx5001644695 - 1).getTagData5001644695().getTagLen5001644695()));
                 charArray.add(work.getDeEndTag300());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3));
              updated = updateString(sys101OutRec.toCharArray() ,joinCharArray);
              sys101OutRec.setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
              writeSys101();/*2200-WRITE-SYS101*/
//  SET 500-1644695-NDX UP BY 1
              ndx5001644695++; 
              
          }
      
      }
      /**
      * process1644695Pds 
      *   This method is derived from 
  *   COBOL Paragraph - 8620-PROCESS-1644695-PDS COBOL Cyclomatic complexity - 6
      * Input  :  

      * - tagSubfldNo5001644695          COBOL Name: 500-1644695-TAG-SUBFLD-NO
      * - ndx5001644695                  COBOL Name: 500-1644695-NDX
      * - tagNum5001644695               COBOL Name: 500-1644695-TAG-NUM
      * - indent800                      COBOL Name: 800-INDENT
      * - pdsStrTag300                   COBOL Name: 300-PDS-STR-TAG
      * - pdsEndTag300                   COBOL Name: 300-PDS-END-TAG
      * - tagLen5001644695               COBOL Name: 500-1644695-TAG-LEN
      * - tagValue5001644695             COBOL Name: 500-1644695-TAG-VALUE
      *
      * Output :  

      * - pdsStrCd300                    COBOL Name: 300-PDS-STR-CD
      * - tagNum5001644695               COBOL Name: 500-1644695-TAG-NUM
      * - ilvl800                        COBOL Name: 800-ILVL
      * - sys101Rdw800                   COBOL Name: 800-SYS101-RDW
      * - sys101OutRec                   COBOL Name: SYS101-OUT-REC
      * - saveTagNum800                  COBOL Name: 800-SAVE-TAG-NUM
      * - ndx5001644695                  COBOL Name: 500-1644695-NDX
      *
      * @throws CFException
      */
      private void process1644695Pds() throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			 final int PDS_END_TAG_300_LENGTH = 6;
			// End of variable declaration

      
// ******************************************************************
// * Process pds
// ******************************************************************
//  IF 500-1644695-TAG-SUBFLD-NO ( 500-1644695-NDX ) > 0
          if (	( elementsTable5001644695.getTblEntry5001644695(ndx5001644695 - 1).getTagKey5001644695().getTagSubfldNo5001644695() > 0 )) { 
//  MOVE 500-1644695-TAG-NUM ( 500-1644695-NDX ) TO 300-PDS-STR-CD
              pdsStrTag300.setPdsStrCd300(elementsTable5001644695.getTblEntry5001644695(ndx5001644695 - 1).getTagKey5001644695().getTagNum5001644695());
//  SET 800-ILVL-2 TO TRUE
              workAreas800.setIlvl2800True(); 
              
              workAreas800.setSys101Rdw800((long)Math.abs(workAreas800.getIlvl800() + PdsStrTag300.getPdsStrTag300FieldLength()));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-PDS-STR-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(workAreas800.getIndent800(),0,workAreas800.getIlvl800()));
                 charArray.add(pdsStrTag300.toCharArray());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(sys101OutRec.toCharArray() ,joinCharArray);
              sys101OutRec.setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
              writeSys101();/*2200-WRITE-SYS101*/
//  MOVE 500-1644695-TAG-NUM ( 500-1644695-NDX ) TO 800-SAVE-TAG-NUM
              workAreas800.setSaveTagNum800(elementsTable5001644695.getTblEntry5001644695(ndx5001644695 - 1).getTagKey5001644695().getTagNum5001644695());
//  PERFORM 8630-PROCESS-1644695-SUBFLD UNTIL 500-1644695-TAG-NUM ( 500-1644695-NDX ) NOT EQUAL 800-SAVE-TAG-NUM
              while (	( elementsTable5001644695.getTblEntry5001644695(ndx5001644695 - 1).getTagKey5001644695().getTagNum5001644695() == workAreas800.getSaveTagNum800() )) {
                 process1644695Subfld();/*8630-PROCESS-1644695-SUBFLD*/
              }
//  SET 800-ILVL-2 TO TRUE
              workAreas800.setIlvl2800True(); 
              
              workAreas800.setSys101Rdw800((long)Math.abs(workAreas800.getIlvl800() + PDS_END_TAG_300_LENGTH));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-PDS-END-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(workAreas800.getIndent800(),0,workAreas800.getIlvl800()));
                 charArray.add(work.getPdsEndTag300());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(sys101OutRec.toCharArray() ,joinCharArray);
              sys101OutRec.setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
              writeSys101();/*2200-WRITE-SYS101*/
          }
//  ELSE
          else { 
//  MOVE 500-1644695-TAG-NUM ( 500-1644695-NDX ) TO 300-PDS-STR-CD
              pdsStrTag300.setPdsStrCd300(elementsTable5001644695.getTblEntry5001644695(ndx5001644695 - 1).getTagKey5001644695().getTagNum5001644695());
//  SET 800-ILVL-2 TO TRUE
              workAreas800.setIlvl2800True(); 
              
              workAreas800.setSys101Rdw800((long)Math.abs(workAreas800.getIlvl800() + PdsStrTag300.getPdsStrTag300FieldLength() + elementsTable5001644695.getTblEntry5001644695(ndx5001644695 - 1).getTagData5001644695().getTagLen5001644695() + PDS_END_TAG_300_LENGTH));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-PDS-STR-TAG 500-1644695-TAG-VALUE ( 500-1644695-NDX ) (1 : 500-1644695-TAG-LEN ( 500-1644695-NDX )) 300-PDS-END-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(workAreas800.getIndent800(),0,workAreas800.getIlvl800()));
                 charArray.add(pdsStrTag300.toCharArray());
                 charArray.add(substring(elementsTable5001644695.getTblEntry5001644695(ndx5001644695 - 1).getTagData5001644695().getTagValue5001644695(),0,elementsTable5001644695.getTblEntry5001644695(ndx5001644695 - 1).getTagData5001644695().getTagLen5001644695()));
                 charArray.add(work.getPdsEndTag300());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3));
              updated = updateString(sys101OutRec.toCharArray() ,joinCharArray);
              sys101OutRec.setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
              writeSys101();/*2200-WRITE-SYS101*/
//  SET 500-1644695-NDX UP BY 1
              ndx5001644695++; 
              
          }
      
      }
      /**
      * process1644695Subfld 
      *   This method is derived from 
  *   COBOL Paragraph - 8630-PROCESS-1644695-SUBFLD COBOL Cyclomatic complexity - 4
      * Input  :  

      * - tagLen5001644695               COBOL Name: 500-1644695-TAG-LEN
      * - ndx5001644695                  COBOL Name: 500-1644695-NDX
      * - indent800                      COBOL Name: 800-INDENT
      * - subfldTagStr300                COBOL Name: 300-SUBFLD-TAG-STR
      * - tagValue5001644695             COBOL Name: 500-1644695-TAG-VALUE
      * - subfldTagEnd300                COBOL Name: 300-SUBFLD-TAG-END
      *
      * Output :  

      * - ilvl800                        COBOL Name: 800-ILVL
      * - sys101Rdw800                   COBOL Name: 800-SYS101-RDW
      * - sys101OutRec                   COBOL Name: SYS101-OUT-REC
      * - ndx5001644695                  COBOL Name: 500-1644695-NDX
      *
      * @throws CFException
      */
      private void process1644695Subfld() throws Exception {
			// Declare local variables used in the method
			 final int SUBFLD_TAG_STR_300_LENGTH = 3;
			 final int SUBFLD_TAG_END_300_LENGTH = 4;
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			// End of variable declaration

      
// ******************************************************************
// * Process subfields
// ******************************************************************
//  SET 800-ILVL-3 TO TRUE
          workAreas800.setIlvl3800True(); 
          
          workAreas800.setSys101Rdw800((long)Math.abs(workAreas800.getIlvl800() + SUBFLD_TAG_STR_300_LENGTH + elementsTable5001644695.getTblEntry5001644695(ndx5001644695 - 1).getTagData5001644695().getTagLen5001644695() + SUBFLD_TAG_END_300_LENGTH));
//  IF 500-1644695-TAG-LEN ( 500-1644695-NDX ) > 0
          if (	( elementsTable5001644695.getTblEntry5001644695(ndx5001644695 - 1).getTagData5001644695().getTagLen5001644695() > 0 )) { 
//  STRING 800-INDENT (1 : 800-ILVL ) 300-SUBFLD-TAG-STR 500-1644695-TAG-VALUE ( 500-1644695-NDX ) (1 : 500-1644695-TAG-LEN ( 500-1644695-NDX )) 300-SUBFLD-TAG-END DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(workAreas800.getIndent800(),0,workAreas800.getIlvl800()));
                 charArray.add(work.getSubfldTagStr300());
                 charArray.add(substring(elementsTable5001644695.getTblEntry5001644695(ndx5001644695 - 1).getTagData5001644695().getTagValue5001644695(),0,elementsTable5001644695.getTblEntry5001644695(ndx5001644695 - 1).getTagData5001644695().getTagLen5001644695()));
                 charArray.add(work.getSubfldTagEnd300());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3));
              updated = updateString(sys101OutRec.toCharArray() ,joinCharArray);
              sys101OutRec.setString(  (char[])updated.get("string"));
          }
//  ELSE
          else { 
//  STRING 800-INDENT (1 : 800-ILVL ) 300-SUBFLD-TAG-STR 300-SUBFLD-TAG-END DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(workAreas800.getIndent800(),0,workAreas800.getIlvl800()));
                 charArray.add(work.getSubfldTagStr300());
                 charArray.add(work.getSubfldTagEnd300());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2));
              updated = updateString(sys101OutRec.toCharArray() ,joinCharArray);
              sys101OutRec.setString(  (char[])updated.get("string"));
          }
//  PERFORM 2200-WRITE-SYS101
          writeSys101();/*2200-WRITE-SYS101*/
//  SET 500-1644695-NDX UP BY 1
          ndx5001644695++; 
          
      
      }
      /**
      * write1644695Psipm 
      *   This method is derived from 
  *   COBOL Paragraph - 8700-WRITE-1644695-PSIPM COBOL Cyclomatic complexity - 9
      * Input  :  

      * - ndx5001644695                  COBOL Name: 500-1644695-NDX
      * - tblItems5001644695             COBOL Name: 500-1644695-TBL-ITEMS
      * - tagNum5001644695               COBOL Name: 500-1644695-TAG-NUM
      * - tagOccur5001644695             COBOL Name: 500-1644695-TAG-OCCUR
      * - tagSubfldNo5001644695          COBOL Name: 500-1644695-TAG-SUBFLD-NO
      * - tagLen5001644695               COBOL Name: 500-1644695-TAG-LEN
      * - tagValue5001644695             COBOL Name: 500-1644695-TAG-VALUE
      * - tag800                         COBOL Name: 800-TAG
      *
      * Output :  

      * - ip66601UserT                   COBOL Name: IP66601-USER-T
      * - ip66601UserTcnt                COBOL Name: IP66601-USER-TCNT
      * - fldStrt800                     COBOL Name: 800-FLD-STRT
      * - ndx5001644695                  COBOL Name: 500-1644695-NDX
      * - ip66601UserTagType             COBOL Name: IP66601-USER-TAG-TYPE
      * - ip66601UserTagNo               COBOL Name: IP66601-USER-TAG-NO
      * - tagNum5001644695               COBOL Name: 500-1644695-TAG-NUM
      * - ip66601UserTagOccurrence       COBOL Name: IP66601-USER-TAG-OCCURRENCE
      * - tagOccur5001644695             COBOL Name: 500-1644695-TAG-OCCUR
      * - ip66601UserTagSubfldNo         COBOL Name: IP66601-USER-TAG-SUBFLD-NO
      * - tagSubfldNo5001644695          COBOL Name: 500-1644695-TAG-SUBFLD-NO
      * - ip66601UserTagStart            COBOL Name: IP66601-USER-TAG-START
      * - ip66601UserTagLngth            COBOL Name: IP66601-USER-TAG-LNGTH
      * - tagLen5001644695               COBOL Name: 500-1644695-TAG-LEN
      * - ip66102NormalIpmMsg            COBOL Name: IP66102-NORMAL-IPM-MSG
      * - tagValue5001644695             COBOL Name: 500-1644695-TAG-VALUE
      * - sys201Rdw800                   COBOL Name: 800-SYS201-RDW
      * - tagTblPtr800                   COBOL Name: 800-TAG-TBL-PTR
      * - sys201OutRec                   COBOL Name: SYS201-OUT-REC
      * - tagType800                     COBOL Name: 800-TAG-TYPE
      * - tagNum800                      COBOL Name: 800-TAG-NUM
      * - tagOccur800                    COBOL Name: 800-TAG-OCCUR
      * - tagSubfldNo800                 COBOL Name: 800-TAG-SUBFLD-NO
      * - tagStart800                    COBOL Name: 800-TAG-START
      * - tagLngth800                    COBOL Name: 800-TAG-LNGTH
      * - tag800                         COBOL Name: 800-TAG
      *
      * @throws CFException
      */
      private void write1644695Psipm() throws Exception {
			// Declare local variables used in the method
			Tag800 tag800 = workAreas800.getTag800();
			// End of variable declaration

      
// ******************************************************************
// * Write pseudo ipm message
// ******************************************************************
//  SET IP66601-USER-T TO 1
          ip66601UserT = 1; 
          
//  MOVE 1 TO IP66601-USER-TCNT 800-FLD-STRT
          ip66601UserTagInformation.setIp66601UserTcnt((short)1);
          workAreas800.setFldStrt800((long)1);

// *    Write element tags to user tag table
//  PERFORM VARYING 500-1644695-NDX FROM 1 BY 1 UNTIL 500-1644695-NDX > 500-1644695-TBL-ITEMS
          for (ndx5001644695 = 1; (	( ndx5001644695 <= work.getTblItems5001644695() )) ; ndx5001644695 = ndx5001644695 + 1 ) {
//  SET IP66601-USER-T TO 500-1644695-NDX
              ip66601UserT = ndx5001644695; 
              
//  EVALUATE 500-1644695-TAG-TYPE ( 500-1644695-NDX )
              switch(new String(elementsTable5001644695.getTblEntry5001644695(ndx5001644695 - 1).getTagKey5001644695().getTagType5001644695())){
              	case "M":
//  SET IP66601-USER-MTI-TAG ( IP66601-USER-T ) TO TRUE
                  ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserMtiTagTrue(); 
                  
              break;
              	case "D":
//  SET IP66601-USER-DE-TAG ( IP66601-USER-T ) TO TRUE
                  ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserDeTagTrue(); 
                  
              break;
              	case "P":
//  SET IP66601-USER-PDS-TAG ( IP66601-USER-T ) TO TRUE
                  ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserPdsTagTrue(); 
                  
              break;
              }
//  MOVE 500-1644695-TAG-NUM ( 500-1644695-NDX ) TO IP66601-USER-TAG-NO ( IP66601-USER-T )
              ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagNo((short) elementsTable5001644695.getTblEntry5001644695(ndx5001644695 - 1).getTagKey5001644695().getTagNum5001644695());
//  MOVE 500-1644695-TAG-OCCUR ( 500-1644695-NDX ) TO IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-T )
              ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().setIp66601UserTagOccurrence((short) elementsTable5001644695.getTblEntry5001644695(ndx5001644695 - 1).getTagKey5001644695().getTagOccur5001644695());
//  MOVE 500-1644695-TAG-SUBFLD-NO ( 500-1644695-NDX ) TO IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-T )
              ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().setIp66601UserTagSubfldNo((short) elementsTable5001644695.getTblEntry5001644695(ndx5001644695 - 1).getTagKey5001644695().getTagSubfldNo5001644695());
//  MOVE 800-FLD-STRT TO IP66601-USER-TAG-START ( IP66601-USER-T )
              ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).setIp66601UserTagStart((short) workAreas800.getFldStrt800());
//  MOVE 500-1644695-TAG-LEN ( 500-1644695-NDX ) TO IP66601-USER-TAG-LNGTH ( IP66601-USER-T )
              ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).setIp66601UserTagLngth((short) elementsTable5001644695.getTblEntry5001644695(ndx5001644695 - 1).getTagData5001644695().getTagLen5001644695());

// *    Write element content to message string
//  IF 500-1644695-TAG-LEN ( 500-1644695-NDX ) > 0
              if (	( elementsTable5001644695.getTblEntry5001644695(ndx5001644695 - 1).getTagData5001644695().getTagLen5001644695() > 0 )) { 
//  MOVE 500-1644695-TAG-VALUE ( 500-1644695-NDX ) (1 : 500-1644695-TAG-LEN ( 500-1644695-NDX )) TO IP66102-NORMAL-IPM-MSG ( 800-FLD-STRT : IP66601-USER-TAG-LNGTH ( IP66601-USER-T ))
                  ip66102IpmMsg.setIp66102NormalIpmMsg(replace(ip66102IpmMsg.getIp66102NormalIpmMsg().toCharArray(),substring(elementsTable5001644695.getTblEntry5001644695(ndx5001644695 - 1).getTagData5001644695().getTagValue5001644695(),0,elementsTable5001644695.getTblEntry5001644695(ndx5001644695 - 1).getTagData5001644695().getTagLen5001644695()),((int) workAreas800.getFldStrt800()-1), (ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagLngth() + ((int) workAreas800.getFldStrt800() - 1)) ));
              }
//  ADD IP66601-USER-TAG-LNGTH ( IP66601-USER-T ) TO 800-FLD-STRT
              workAreas800.setFldStrt800(workAreas800.getFldStrt800()+(short) ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagLngth());
          }

// *    Set ip66601-user-t     down by 1
//  SET IP66601-USER-TCNT TO IP66601-USER-T
          ip66601UserTagInformation.setIp66601UserTcnt((short) ip66601UserT); 
          
          workAreas800.setSys201Rdw800((long) (Math.abs(5 + workAreas800.getFldStrt800() - 1 +  ( 24 * ip66601UserTagInformation.getIp66601UserTcnt() ) )));
          workAreas800.setTagTblPtr800((long) (Math.abs(5 + workAreas800.getFldStrt800())));

// *    Write tag table pointer to sys201 record

// *    Write message string to sys201 record
//  MOVE 800-TAG-TBL-PTR TO SYS201-OUT-REC (1 : 5)
          sys201OutRec.replace(String.valueOf(workAreas800.getTagTblPtr800String()).toCharArray(),0,String.valueOf(workAreas800.getTagTblPtr800String()).length(),0,5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE IP66102-NORMAL-IPM-MSG (1 : 800-FLD-STRT ) TO SYS201-OUT-REC (6 : 800-FLD-STRT )
          sys201OutRec.replace(ip66102IpmMsg/*parent*/,0/*fromOffset - (sys201OutRec) */,(int) workAreas800.getFldStrt800()/*fromLen*/,0+6 - 1/*toOffset - (ip66102NormalIpmMsg) */,(int) workAreas800.getFldStrt800()/*toLen*/);
          // MOVE 800-TAG-TBL-PTR TO 800-FLD-STRT
          workAreas800.setFldStrt800(workAreas800.getTagTblPtr800());

// *    Write tag table to sys201 record
//  PERFORM VARYING IP66601-USER-T FROM 1 BY 1 UNTIL IP66601-USER-T > IP66601-USER-TCNT
          for (ip66601UserT = 1; (	( ip66601UserT <= ip66601UserTagInformation.getIp66601UserTcnt() ) ) ; ip66601UserT = ip66601UserT + 1 ) {
//  MOVE IP66601-USER-TAG-TYPE ( IP66601-USER-T ) TO 800-TAG-TYPE
              tag800.setTagType800(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagType());
  
//  MOVE IP66601-USER-TAG-NO ( IP66601-USER-T ) TO 800-TAG-NUM
              tag800.setTagNum800(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagNo());
  
//  MOVE IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-T ) TO 800-TAG-OCCUR
              tag800.setTagOccur800(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserTagOccurrence());
  
//  MOVE IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-T ) TO 800-TAG-SUBFLD-NO
              tag800.setTagSubfldNo800(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserTagSubfldNo());
  
//  MOVE IP66601-USER-TAG-START ( IP66601-USER-T ) TO 800-TAG-START
              tag800.setTagStart800(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagStart());
  
//  MOVE IP66601-USER-TAG-LNGTH ( IP66601-USER-T ) TO 800-TAG-LNGTH
              tag800.setTagLngth800(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagLngth());
  
//  MOVE 800-TAG (1 : 24) TO SYS201-OUT-REC ( 800-FLD-STRT : 24)
              sys201OutRec.replace(workAreas800/*parent*/,0/*fromOffset - (sys201OutRec) */,24/*fromLen*/,0+(int) workAreas800.getFldStrt800() - 1/*toOffset - (tag800) */,24/*toLen*/);
//  ADD 24 TO 800-FLD-STRT
              workAreas800.setFldStrt800(workAreas800.getFldStrt800()+(long)24);
          }
//  PERFORM 3110-WRITE-SYS201
          writeSys201();/*3110-WRITE-SYS201*/
          ;
      
      }
      /**
      * write1644695Ipm 
      *   This method is derived from 
  *   COBOL Paragraph - 8800-WRITE-1644695-IPM COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      private void write1644695Ipm() throws Exception {
      
// ******************************************************************
// * Write ipm message
// ******************************************************************
//  CALL 800-PTR-IP666010
          // CALL 800-PTR-IP666010
          	this.setRc( ip666010.process());
      
      }
      /**
      * add1644697Field 
      *   This method is derived from 
  *   COBOL Paragraph - 8000-ADD-1644697-FIELD COBOL Cyclomatic complexity - 4
      * Input  :  

      * - tblItems5001644697             COBOL Name: 500-1644697-TBL-ITEMS
      * - tblMax5001644697               COBOL Name: 500-1644697-TBL-MAX
      * - newElem800                     COBOL Name: 800-NEW-ELEM
      * - newElemLen800                  COBOL Name: 800-NEW-ELEM-LEN
      * - newElemValue800                COBOL Name: 800-NEW-ELEM-VALUE
      * - abendCode3003008               COBOL Name: 300-3008-ABEND-CODE
      * - errorMsg6003008                COBOL Name: 600-3008-ERROR-MSG
      * - para80001644697300             COBOL Name: 300-PARA-8000-1644697
      *
      * Output :  

      * - tblItems5001644697             COBOL Name: 500-1644697-TBL-ITEMS
      * - ndx5001644697                  COBOL Name: 500-1644697-NDX
      * - tagKey5001644697               COBOL Name: 500-1644697-TAG-KEY
      * - newElem800                     COBOL Name: 800-NEW-ELEM
      * - tagLen5001644697               COBOL Name: 500-1644697-TAG-LEN
      * - newElemLen800                  COBOL Name: 800-NEW-ELEM-LEN
      * - tagValue5001644697             COBOL Name: 500-1644697-TAG-VALUE
      * - newElemValue800                COBOL Name: 800-NEW-ELEM-VALUE
      * - ndx25001644697                 COBOL Name: 500-1644697-NDX2
      * - table6003008                   COBOL Name: 600-3008-TABLE
      * - maxSize6003008                 COBOL Name: 600-3008-MAX-SIZE
      * - tblMax5001644697               COBOL Name: 500-1644697-TBL-MAX
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - abendCode3003008               COBOL Name: 300-3008-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - errorMsg6003008                COBOL Name: 600-3008-ERROR-MSG
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para80001644697300             COBOL Name: 300-PARA-8000-1644697
      *
      * @throws CFException
      */
      private void add1644697Field() throws Exception {
			// Declare local variables used in the method
			NewElemData800 newElemData800 = workAreas800.getNewElemData800();
			int tblItems5001644697 = 0;
			int tblMax5001644697 = 0;
			// End of variable declaration

      
// * 800-New-elem-len
// * 800-new-elem-value
// ******************************************************************
          tblMax5001644697 = work.getTblMax5001644697();
          tblItems5001644697 = work.getTblItems5001644697();
//  IF 500-1644697-TBL-ITEMS < 500-1644697-TBL-MAX
          if (	( tblItems5001644697 < tblMax5001644697 )) { 
//  ADD 1 TO 500-1644697-TBL-ITEMS
              work.setTblItems5001644697(work.getTblItems5001644697()+1);
//  SET 500-1644697-NDX TO 500-1644697-TBL-ITEMS
              ndx5001644697 = work.getTblItems5001644697(); 
              
//  MOVE 800-NEW-ELEM TO 500-1644697-TAG-KEY ( 500-1644697-NDX )
              elementsTable5001644697.getTblEntry5001644697(ndx5001644697 - 1).getTagKey5001644697().setString(workAreas800.getNewElem800());
//  MOVE 800-NEW-ELEM-LEN TO 500-1644697-TAG-LEN ( 500-1644697-NDX )
              elementsTable5001644697.getTblEntry5001644697(ndx5001644697 - 1).getTagData5001644697().setTagLen5001644697(newElemData800.getNewElemLen800());
  
//  MOVE 800-NEW-ELEM-VALUE TO 500-1644697-TAG-VALUE ( 500-1644697-NDX )
              elementsTable5001644697.getTblEntry5001644697(ndx5001644697 - 1).getTagData5001644697().setTagValue5001644697(newElemData800.getNewElemValue800());
  
              tblItems5001644697 = work.getTblItems5001644697();
//  IF 500-1644697-TBL-ITEMS > 1
              if (	( tblItems5001644697 > 1 )) { 
//  SET 500-1644697-NDX2 TO 500-1644697-NDX
                  ndx25001644697 = ndx5001644697; 
                  
//  SET 500-1644697-NDX2 DOWN BY 1
                  ndx25001644697--; 
                  
//  IF 500-1644697-TAG-KEY ( 500-1644697-NDX ) < 500-1644697-TAG-KEY ( 500-1644697-NDX2 )
                  if (		compareChars(elementsTable5001644697.getTblEntry5001644697(ndx5001644697 - 1).getTagKey5001644697(),elementsTable5001644697.getTblEntry5001644697(ndx25001644697 - 1).getTagKey5001644697()) < 0 ) { 
//  PERFORM 8100-SORT-1644697-FIELDS
                      sort1644697Fields();/*8100-SORT-1644697-FIELDS*/
                  }
              }
  
          }
  
//  ELSE
          else { 
//  SET 600-3008-TABLE-1644697 TO TRUE
              errorMsg6003008.setTable16446976003008True(); 
              
//  MOVE 500-1644697-TBL-MAX TO 600-3008-MAX-SIZE
              errorMsg6003008.setMaxSize6003008(String.valueOf(CFUtil.pad(8,String.valueOf(work.getTblMax5001644697()),"0",CFUtil.LEFT_PAD)).toCharArray());
//  MOVE 300-3008-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(String.valueOf(work.getAbendCode3003008String()).toCharArray());
              // MOVE 600-3008-ERROR-MSG TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(errorMsg6003008.toCharArray());
//  MOVE 300-PARA-8000-1644697 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara80001644697300());
//  PERFORM 9100-ABEND-PROGRAM
              abendProgram();/*9100-ABEND-PROGRAM*/
          }
      
      }
      /**
      * sort1644697Fields 
      *   This method is derived from 
  *   COBOL Paragraph - 8100-SORT-1644697-FIELDS COBOL Cyclomatic complexity - 6
      * Input  :  

      * - tblItems5001644697             COBOL Name: 500-1644697-TBL-ITEMS
      * - ndx5001644697                  COBOL Name: 500-1644697-NDX
      * - ndx25001644697                 COBOL Name: 500-1644697-NDX2
      * - tagKey5001644697               COBOL Name: 500-1644697-TAG-KEY
      * - tblEntry5001644697             COBOL Name: 500-1644697-TBL-ENTRY
      *
      * Output :  

      * - ndx5001644697                  COBOL Name: 500-1644697-NDX
      * - ndx25001644697                 COBOL Name: 500-1644697-NDX2
      * - saveEntry800                   COBOL Name: 800-SAVE-ENTRY
      * - tblEntry5001644697             COBOL Name: 500-1644697-TBL-ENTRY
      *
      * @throws CFException
      */
      private void sort1644697Fields() throws Exception {
      
// ******************************************************************
// * Sort the :t: element table
// ******************************************************************
//  PERFORM VARYING 500-1644697-NDX FROM 500-1644697-TBL-ITEMS BY -1 UNTIL 500-1644697-NDX <= 1
          for (ndx5001644697 = work.getTblItems5001644697(); (	( ndx5001644697 > 1 )) ; ndx5001644697 = ndx5001644697 + -1 ) {
//  PERFORM VARYING 500-1644697-NDX2 FROM 1 BY 1 UNTIL 500-1644697-NDX2 >= 500-1644697-NDX
              for (ndx25001644697 = 1; (	( ndx25001644697 < ndx5001644697 )) ; ndx25001644697 = ndx25001644697 + 1 ) {
//  IF 500-1644697-TAG-KEY ( 500-1644697-NDX ) < 500-1644697-TAG-KEY ( 500-1644697-NDX2 )
                  if (		compareChars(elementsTable5001644697.getTblEntry5001644697(ndx5001644697 - 1).getTagKey5001644697(),elementsTable5001644697.getTblEntry5001644697(ndx25001644697 - 1).getTagKey5001644697()) < 0 ) { 
//  MOVE 500-1644697-TBL-ENTRY ( 500-1644697-NDX ) TO 800-SAVE-ENTRY
                      workAreas800.setSaveEntry800(elementsTable5001644697.getTblEntry5001644697(ndx5001644697 - 1).toCharArray());
//  MOVE 500-1644697-TBL-ENTRY ( 500-1644697-NDX2 ) TO 500-1644697-TBL-ENTRY ( 500-1644697-NDX )
                      elementsTable5001644697.setTblEntry5001644697((ndx5001644697 - 1),elementsTable5001644697.getTblEntry5001644697(ndx25001644697 - 1).toCharArray());
//  MOVE 800-SAVE-ENTRY TO 500-1644697-TBL-ENTRY ( 500-1644697-NDX2 )
                      elementsTable5001644697.setTblEntry5001644697((ndx25001644697 - 1),workAreas800.getSaveEntry800());
                  }
              }
          }
      
      }
      /**
      * update1644697Field 
      *   This method is derived from 
  *   COBOL Paragraph - 8200-UPDATE-1644697-FIELD COBOL Cyclomatic complexity - 2
      * Input  :  

      * - newElem800                     COBOL Name: 800-NEW-ELEM
      * - srchKeyFndSw5001644697         COBOL Name: 500-1644697-SRCH-KEY-FND-SW
      * - newElemLen800                  COBOL Name: 800-NEW-ELEM-LEN
      * - newElemValue800                COBOL Name: 800-NEW-ELEM-VALUE
      *
      * Output :  

      * - tblSrchKey5001644697           COBOL Name: 500-1644697-TBL-SRCH-KEY
      * - newElem800                     COBOL Name: 800-NEW-ELEM
      * - tagKey5001644697               COBOL Name: 500-1644697-TAG-KEY
      * - tagLen5001644697               COBOL Name: 500-1644697-TAG-LEN
      * - newElemLen800                  COBOL Name: 800-NEW-ELEM-LEN
      * - tagValue5001644697             COBOL Name: 500-1644697-TAG-VALUE
      * - newElemValue800                COBOL Name: 800-NEW-ELEM-VALUE
      *
      * @throws CFException
      */
      private void update1644697Field() throws Exception {
			// Declare local variables used in the method
			NewElemData800 newElemData800 = workAreas800.getNewElemData800();
			// End of variable declaration

      
// ******************************************************************
// * Update a field in to the :t: element table
// *
// * note:
// * the following fields should be populated before this paragragh
// * is called.
// * 800-new-elem        - element to be updated
// * 800-new-elem-len    - new length
// * 800-new-elem-value  - new value
// ******************************************************************
          // MOVE 800-NEW-ELEM TO 500-1644697-TBL-SRCH-KEY
          work.setTblSrchKey5001644697(workAreas800.getNewElem800());
//  PERFORM 8300-LOOKUP-1644697-FIELD
          lookup1644697Field();/*8300-LOOKUP-1644697-FIELD*/
//  IF 500-1644697-SRCH-KEY-FND
          if ( work.isSrchKeyFnd5001644697()  ) { 
//  MOVE 800-NEW-ELEM TO 500-1644697-TAG-KEY ( 500-1644697-NDX )
              elementsTable5001644697.getTblEntry5001644697(ndx5001644697 - 1).getTagKey5001644697().setString(workAreas800.getNewElem800());
//  MOVE 800-NEW-ELEM-LEN TO 500-1644697-TAG-LEN ( 500-1644697-NDX )
              elementsTable5001644697.getTblEntry5001644697(ndx5001644697 - 1).getTagData5001644697().setTagLen5001644697(newElemData800.getNewElemLen800());
  
//  MOVE 800-NEW-ELEM-VALUE TO 500-1644697-TAG-VALUE ( 500-1644697-NDX )
              elementsTable5001644697.getTblEntry5001644697(ndx5001644697 - 1).getTagData5001644697().setTagValue5001644697(newElemData800.getNewElemValue800());
  
          }
//  ELSE
          else { 
//  PERFORM 8000-ADD-1644697-FIELD
              add1644697Field();/*8000-ADD-1644697-FIELD*/
          }
      
      }
      /**
      * lookup1644697Field 
      *   This method is derived from 
  *   COBOL Paragraph - 8300-LOOKUP-1644697-FIELD COBOL Cyclomatic complexity - 2
      * Input  :  

      * - tblEntry5001644697             COBOL Name: 500-1644697-TBL-ENTRY
      * - tagKey5001644697               COBOL Name: 500-1644697-TAG-KEY
      * - tblSrchKey5001644697           COBOL Name: 500-1644697-TBL-SRCH-KEY
      *
      * Output :  

      * - ndx5001644697                  COBOL Name: 500-1644697-NDX
      * - srchKeyFndSw5001644697         COBOL Name: 500-1644697-SRCH-KEY-FND-SW
      *
      * @throws CFException
      */
      private void lookup1644697Field() throws Exception {
			// Declare local variables used in the method
			boolean keepSearching = true;
			int[] searchIndexes = null;
			int searchLowPoint = 0;
			int searchMidPoint = 0;
			int searchHighPoint = 0;
			int searchCompare = 0;
			char[] tblSrchKey5001644697 = null;
			// End of variable declaration

      
// ******************************************************************
// * Lookup a field in to the :t: element table
// *
// * note:
// * 500-:t:-srch-key should be populated with proper
// * search key before this paragraph is called
// ******************************************************************
//  SET 500-1644697-NDX TO 1
          ndx5001644697 = 1; 
          
          tblSrchKey5001644697 = work.getTblSrchKey5001644697();
//  SEARCH ALL 500-1644697-TBL-ENTRY
          // Binary Search through elementsTable5001644697.tblEntry5001644697
          searchLowPoint = 0; //prevLowValue
          searchHighPoint = work.getTblItems5001644697(); //prevHighValue
          searchMidPoint = searchHighPoint / 2; //starting at mid point
          searchIndexes = new int[]{searchLowPoint,searchMidPoint,searchHighPoint};
          keepSearching = true;
          while (keepSearching) {
          // compare logic below
             searchCompare = compareAscending(elementsTable5001644697.getTblEntry5001644697(searchMidPoint).getTagKey5001644697(),tblSrchKey5001644697);
          // end of compare logic
          	if (searchCompare == 0 ) { // if search found
          	      keepSearching = false;
          	     ndx5001644697 = searchMidPoint	 + 1;
//  SET 500-1644697-SRCH-KEY-FND TO TRUE
              work.setSrchKeyFnd5001644697True(); 
              
          	} else  {
          		adjustSearchIndex(searchCompare,searchIndexes);
          		searchLowPoint  = searchIndexes[0];
           		searchMidPoint  = searchIndexes[1];
           		searchHighPoint = searchIndexes[2];
           		if (searchMidPoint == -1) { // search exhausted
           		    keepSearching = false; 
//  SET 500-1644697-SRCH-KEY-NOT-FND TO TRUE
              work.setSrchKeyNotFnd5001644697True(); 
              
           		}
          	}
          }
  
      
      }
      /**
      * display1644697Table 
      *   This method is derived from 
  *   COBOL Paragraph - 8400-DISPLAY-1644697-TABLE COBOL Cyclomatic complexity - 6
      * Input  :  

      * - srchKeyFndSw5001644697         COBOL Name: 500-1644697-SRCH-KEY-FND-SW
      * - tagValue5001644697             COBOL Name: 500-1644697-TAG-VALUE
      * - ndx5001644697                  COBOL Name: 500-1644697-NDX
      * - tblItems5001644697             COBOL Name: 500-1644697-TBL-ITEMS
      * - tagLen5001644697               COBOL Name: 500-1644697-TAG-LEN
      * - tagType5001644697              COBOL Name: 500-1644697-TAG-TYPE
      * - tagNum5001644697               COBOL Name: 500-1644697-TAG-NUM
      * - tagSubfldNo5001644697          COBOL Name: 500-1644697-TAG-SUBFLD-NO
      * - tagOccur5001644697             COBOL Name: 500-1644697-TAG-OCCUR
      *
      * Output :  

      * - tblSrchKey5001644697           COBOL Name: 500-1644697-TBL-SRCH-KEY
      * - ndx5001644697                  COBOL Name: 500-1644697-NDX
      * - ptrVal800                      COBOL Name: 800-PTR-VAL
      *
      * @throws CFException
      */
      private void display1644697Table() throws Exception {
      
// *    If 500-:t:-srch-key-fnd
// *       display 500-:t:-tbl-srch-key ' found'
// *       move 500-:t:-tbl-srch-key          to 800-new-elem
// *       move 500-:t:-tag-len(500-:t:-ndx)  to 800-new-elem-len
// *       move 500-:t:-tag-value(500-:t:-ndx)
// *         to 800-new-elem-value
// *    else
// *       display 500-:t:-tbl-srch-key ' not found'
// *       move 500-:t:-tbl-srch-key          to 800-new-elem
// *       move 0                             to 800-new-elem-len
// *       move spaces                        to 800-new-elem-value
// *    end-if

// ******************************************************************
// * Display the :t: element table
// ******************************************************************
//  DISPLAY '================================================'
          logger.info("================================================"); 
          // MOVE 'M000000000000' TO 500-1644697-TBL-SRCH-KEY
          //  LITERAL_M000000000000 = 'M000000000000'
          work.setTblSrchKey5001644697(CONSTANTS.LITERAL_M000000000000);
//  PERFORM 8300-LOOKUP-1644697-FIELD
          lookup1644697Field();/*8300-LOOKUP-1644697-FIELD*/
//  IF 500-1644697-SRCH-KEY-FND
          if ( work.isSrchKeyFnd5001644697()  ) { 
//  DISPLAY '= ' 500-1644697-TAG-VALUE ( 500-1644697-NDX ) (1 : 500-1644697-TAG-LEN ( 500-1644697-NDX ))
              logger.info("= {}", new String(substring(elementsTable5001644697.getTblEntry5001644697(ndx5001644697 - 1).getTagData5001644697().getTagValue5001644697(),0,elementsTable5001644697.getTblEntry5001644697(ndx5001644697 - 1).getTagData5001644697().getTagLen5001644697()))); 
          }
          // MOVE 'D002400000000' TO 500-1644697-TBL-SRCH-KEY
          //  LITERAL_D002400000000 = 'D002400000000'
          work.setTblSrchKey5001644697(CONSTANTS.LITERAL_D002400000000);
//  PERFORM 8300-LOOKUP-1644697-FIELD
          lookup1644697Field();/*8300-LOOKUP-1644697-FIELD*/
//  IF 500-1644697-SRCH-KEY-FND
          if ( work.isSrchKeyFnd5001644697()  ) { 
//  DISPLAY '= ' 500-1644697-TAG-VALUE ( 500-1644697-NDX ) (1 : 500-1644697-TAG-LEN ( 500-1644697-NDX ))
              logger.info("= {}", new String(substring(elementsTable5001644697.getTblEntry5001644697(ndx5001644697 - 1).getTagData5001644697().getTagValue5001644697(),0,elementsTable5001644697.getTblEntry5001644697(ndx5001644697 - 1).getTagData5001644697().getTagLen5001644697()))); 
          }
//  DISPLAY '= TABLE ELEMENTS'
          logger.info("= TABLE ELEMENTS"); 
//  DISPLAY '================================================'
          logger.info("================================================"); 
//  DISPLAY '     #   ' ' T' ' CODE' ' SUBF' ' OCCR' ' LEN' ' VALUE'
          logger.info("     #    T CODE SUBF OCCR LEN VALUE"); 
//  PERFORM VARYING 500-1644697-NDX FROM 1 BY 1 UNTIL 500-1644697-NDX > 500-1644697-TBL-ITEMS
          for (ndx5001644697 = 1; (	( ndx5001644697 <= work.getTblItems5001644697() )) ; ndx5001644697 = ndx5001644697 + 1 ) {
//  SET 800-PTR-VAL TO 500-1644697-NDX
              workAreas800.setPtrVal800(ndx5001644697); 
              
//  IF 500-1644697-TAG-LEN ( 500-1644697-NDX ) > 0
              if (	( elementsTable5001644697.getTblEntry5001644697(ndx5001644697 - 1).getTagData5001644697().getTagLen5001644697() > 0 )) { 
//  DISPLAY ' ' 800-PTR-VAL ' ' 500-1644697-TAG-TYPE ( 500-1644697-NDX ) ' ' 500-1644697-TAG-NUM ( 500-1644697-NDX ) ' ' 500-1644697-TAG-SUBFLD-NO ( 500-1644697-NDX ) ' ' 500-1644697-TAG-OCCUR ( 500-1644697-NDX ) ' ' 500-1644697-TAG-LEN ( 500-1644697-NDX ) ' ' 500-1644697-TAG-VALUE ( 500-1644697-NDX ) (1 : 500-1644697-TAG-LEN ( 500-1644697-NDX ))
                  logger.info(" {} {} {} {} {} {} {}", String.valueOf(workAreas800.getPtrVal800()), new String(elementsTable5001644697.getTblEntry5001644697(ndx5001644697 - 1).getTagKey5001644697().getTagType5001644697()), String.valueOf(elementsTable5001644697.getTblEntry5001644697(ndx5001644697 - 1).getTagKey5001644697().getTagNum5001644697()), String.valueOf(elementsTable5001644697.getTblEntry5001644697(ndx5001644697 - 1).getTagKey5001644697().getTagSubfldNo5001644697()), String.valueOf(elementsTable5001644697.getTblEntry5001644697(ndx5001644697 - 1).getTagKey5001644697().getTagOccur5001644697()), String.valueOf(elementsTable5001644697.getTblEntry5001644697(ndx5001644697 - 1).getTagData5001644697().getTagLen5001644697()), new String(substring(elementsTable5001644697.getTblEntry5001644697(ndx5001644697 - 1).getTagData5001644697().getTagValue5001644697(),0,elementsTable5001644697.getTblEntry5001644697(ndx5001644697 - 1).getTagData5001644697().getTagLen5001644697()))); 
              }
//  ELSE
              else { 
//  DISPLAY ' ' 800-PTR-VAL ' ' 500-1644697-TAG-TYPE ( 500-1644697-NDX ) ' ' 500-1644697-TAG-NUM ( 500-1644697-NDX ) ' ' 500-1644697-TAG-SUBFLD-NO ( 500-1644697-NDX ) ' ' 500-1644697-TAG-OCCUR ( 500-1644697-NDX ) ' ' 500-1644697-TAG-LEN ( 500-1644697-NDX ) ' ???'
                  logger.info(" {} {} {} {} {} {} ???", String.valueOf(workAreas800.getPtrVal800()), new String(elementsTable5001644697.getTblEntry5001644697(ndx5001644697 - 1).getTagKey5001644697().getTagType5001644697()), String.valueOf(elementsTable5001644697.getTblEntry5001644697(ndx5001644697 - 1).getTagKey5001644697().getTagNum5001644697()), String.valueOf(elementsTable5001644697.getTblEntry5001644697(ndx5001644697 - 1).getTagKey5001644697().getTagSubfldNo5001644697()), String.valueOf(elementsTable5001644697.getTblEntry5001644697(ndx5001644697 - 1).getTagKey5001644697().getTagOccur5001644697()), String.valueOf(elementsTable5001644697.getTblEntry5001644697(ndx5001644697 - 1).getTagData5001644697().getTagLen5001644697())); 
              }
          }
//  DISPLAY '================================================'
          logger.info("================================================"); 
      
      }
      /**
      * get1644697Field 
      *   This method is derived from 
  *   COBOL Paragraph - 8500-GET-1644697-FIELD COBOL Cyclomatic complexity - 6
      * Input  :  

      * - srchKeyFndSw5001644697         COBOL Name: 500-1644697-SRCH-KEY-FND-SW
      * - ndx5001644697                  COBOL Name: 500-1644697-NDX
      * - tagKey5001644697               COBOL Name: 500-1644697-TAG-KEY
      * - ndx25001644697                 COBOL Name: 500-1644697-NDX2
      * - tblItems5001644697             COBOL Name: 500-1644697-TBL-ITEMS
      * - tagValue5001644697             COBOL Name: 500-1644697-TAG-VALUE
      * - tagLen5001644697               COBOL Name: 500-1644697-TAG-LEN
      *
      * Output :  

      * - tblSrchKey5001644697           COBOL Name: 500-1644697-TBL-SRCH-KEY
      * - fieldPtr800                    COBOL Name: 800-FIELD-PTR
      * - fieldLen800                    COBOL Name: 800-FIELD-LEN
      * - ndx25001644697                 COBOL Name: 500-1644697-NDX2
      * - fieldVal800                    COBOL Name: 800-FIELD-VAL
      * - tagValue5001644697             COBOL Name: 500-1644697-TAG-VALUE
      *
      * @throws CFException
      */
      private void get1644697Field() throws Exception {
      
// ******************************************************************
// * Get a field value consisting of concatenated data element
// * subfields.
// *
// * note:
// * 500-:t:-srch-key should be populated with proper
// * search key before this paragraph is called
// *
// * field data   is stored in 800-field-val
// * field length is stored in 800-field-len
// ******************************************************************
//  PERFORM 8300-LOOKUP-1644697-FIELD
          lookup1644697Field();/*8300-LOOKUP-1644697-FIELD*/

// *    If data element has subfields; find first one
//  IF 500-1644697-SRCH-KEY-NOT-FND
          if ( work.isSrchKeyNotFnd5001644697()  ) { 
//  MOVE '0001' TO 500-1644697-TBL-SRCH-KEY (6 : 4)
//  LITERAL_0001 = '0001'
              work.setTblSrchKey5001644697(replace(work.getTblSrchKey5001644697(),CONSTANTS.LITERAL_0001,5,9));
//  PERFORM 8300-LOOKUP-1644697-FIELD
              lookup1644697Field();/*8300-LOOKUP-1644697-FIELD*/
          }
//  IF 500-1644697-SRCH-KEY-FND
          if ( work.isSrchKeyFnd5001644697()  ) { 
              // MOVE 1 TO 800-FIELD-PTR
              workAreas800.setFieldPtr800(1);
              // MOVE 0 TO 800-FIELD-LEN
              workAreas800.setFieldLen800(0);
//  PERFORM VARYING 500-1644697-NDX2 FROM 500-1644697-NDX BY 1 UNTIL 500-1644697-TAG-KEY ( 500-1644697-NDX2 ) (1 : 5) NOT EQUAL 500-1644697-TBL-SRCH-KEY (1 : 5) OR 500-1644697-NDX2 > 500-1644697-TBL-ITEMS
              for (ndx25001644697 = ndx5001644697; (		compareChars(substring(elementsTable5001644697.getTblEntry5001644697(ndx25001644697 - 1).getTagKey5001644697().toCharArray(),0,5),substring(work.getTblSrchKey5001644697(),0,5)) == 0  && 	( ndx25001644697 <= work.getTblItems5001644697() )) ; ndx25001644697 = ndx25001644697 + 1 ) {
//  MOVE 500-1644697-TAG-VALUE ( 500-1644697-NDX2 ) (1 : 500-1644697-TAG-LEN ( 500-1644697-NDX2 )) TO 800-FIELD-VAL ( 800-FIELD-PTR : 500-1644697-TAG-LEN ( 500-1644697-NDX2 ))
                  workAreas800.setFieldVal800(replace(workAreas800.getFieldVal800(),substring(elementsTable5001644697.getTblEntry5001644697(ndx25001644697 - 1).getTagData5001644697().getTagValue5001644697(),0,elementsTable5001644697.getTblEntry5001644697(ndx25001644697 - 1).getTagData5001644697().getTagLen5001644697()),(workAreas800.getFieldPtr800()-1), (elementsTable5001644697.getTblEntry5001644697(ndx25001644697 - 1).getTagData5001644697().getTagLen5001644697() + (workAreas800.getFieldPtr800() - 1)) ));
//  ADD 500-1644697-TAG-LEN ( 500-1644697-NDX2 ) TO 800-FIELD-PTR 800-FIELD-LEN
                  workAreas800.setFieldPtr800(workAreas800.getFieldPtr800()+elementsTable5001644697.getTblEntry5001644697(ndx25001644697 - 1).getTagData5001644697().getTagLen5001644697());
                  workAreas800.setFieldLen800(workAreas800.getFieldLen800()+elementsTable5001644697.getTblEntry5001644697(ndx25001644697 - 1).getTagData5001644697().getTagLen5001644697());
              }
          }
//  ELSE
          else { 
//  MOVE SPACES TO 800-FIELD-VAL
              workAreas800.setFieldVal800(CONSTANTS.SPACE_999);
              // MOVE 0 TO 800-FIELD-LEN
              workAreas800.setFieldLen800(0);
          }
      
      }
      /**
      * write1644697 
      *   This method is derived from 
  *   COBOL Paragraph - 8550-WRITE-1644697 COBOL Cyclomatic complexity - 4
      * Input  :  

      * - writeXmlSw1000                 COBOL Name: 1000-WRITE-XML-SW
      * - writePsipmSw1000               COBOL Name: 1000-WRITE-PSIPM-SW
      * - writeIpmSw1000                 COBOL Name: 1000-WRITE-IPM-SW
      *
      * Output : None 

      * @throws CFException
      */
      private void write1644697() throws Exception {
			// Declare local variables used in the method
			ParmData1000 parmData1000 = parms1000.getParmData1000();
			// End of variable declaration

      
// ******************************************************************
// * Write message
// ******************************************************************
          parmData1000 = parms1000.getParmData1000();
//  IF 1000-WRITE-XML-MSGS
          if ( parmData1000.isWriteXmlMsgs1000()  ) { 
//  PERFORM 8600-WRITE-1644697-XML
              write1644697Xml();/*8600-WRITE-1644697-XML*/
          }
  
          parmData1000 = parms1000.getParmData1000();
//  IF 1000-WRITE-PSIPM-MSGS
          if ( parmData1000.isWritePsipmMsgs1000()  ) { 
//  PERFORM 8700-WRITE-1644697-PSIPM
              write1644697Psipm();/*8700-WRITE-1644697-PSIPM*/
          }
  
          parmData1000 = parms1000.getParmData1000();
//  IF 1000-WRITE-IPM-MSGS
          if ( parmData1000.isWriteIpmMsgs1000()  ) { 
//  PERFORM 8800-WRITE-1644697-IPM
              write1644697Ipm();/*8800-WRITE-1644697-IPM*/
          }
  
      
      }
      /**
      * write1644697Xml 
      *   This method is derived from 
  *   COBOL Paragraph - 8600-WRITE-1644697-XML COBOL Cyclomatic complexity - 8
      * Input  :  

      * - fieldVal800                    COBOL Name: 800-FIELD-VAL
      * - indent800                      COBOL Name: 800-INDENT
      * - msgStrTag300                   COBOL Name: 300-MSG-STR-TAG
      * - tblItems5001644697             COBOL Name: 500-1644697-TBL-ITEMS
      * - m300                           COBOL Name: 300-M
      * - d300                           COBOL Name: 300-D
      * - p300                           COBOL Name: 300-P
      * - comnTagType500                 COBOL Name: 500-COMN-TAG-TYPE
      * - abendCode3003009               COBOL Name: 300-3009-ABEND-CODE
      * - errorMsg6003009                COBOL Name: 600-3009-ERROR-MSG
      * - msgEndTag300                   COBOL Name: 300-MSG-END-TAG
      *
      * Output :  

      * - ilvl800                        COBOL Name: 800-ILVL
      * - sys101Rdw800                   COBOL Name: 800-SYS101-RDW
      * - tblSrchKey5001644697           COBOL Name: 500-1644697-TBL-SRCH-KEY
      * - msgStrMti300                   COBOL Name: 300-MSG-STR-MTI
      * - fieldVal800                    COBOL Name: 800-FIELD-VAL
      * - sys101OutRec                   COBOL Name: SYS101-OUT-REC
      * - ndx5001644697                  COBOL Name: 500-1644697-NDX
      * - tag6003009                     COBOL Name: 600-3009-TAG
      * - comnTagType500                 COBOL Name: 500-COMN-TAG-TYPE
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - abendCode3003009               COBOL Name: 300-3009-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - errorMsg6003009                COBOL Name: 600-3009-ERROR-MSG
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      *
      * @throws CFException
      */
      private void write1644697Xml() throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			char[] p300 = null;
			Map<String,Object> updated = null;
			 final int MSG_END_TAG_300_LENGTH = 6;
			// End of variable declaration

      
// ******************************************************************
// * Write xml message
// ******************************************************************

// * Message header
//  SET 800-ILVL-1 TO TRUE
          workAreas800.setIlvl1800True(); 
          
          workAreas800.setSys101Rdw800((long)Math.abs(workAreas800.getIlvl800() + MsgStrTag300.getMsgStrTag300FieldLength()));
          // MOVE 'M000000000000' TO 500-1644697-TBL-SRCH-KEY
          //  LITERAL_M000000000000 = 'M000000000000'
          work.setTblSrchKey5001644697(CONSTANTS.LITERAL_M000000000000);
//  PERFORM 8500-GET-1644697-FIELD
          get1644697Field();/*8500-GET-1644697-FIELD*/
//  MOVE 800-FIELD-VAL (1 : 800-FIELD-LEN ) TO 300-MSG-STR-MTI
          msgStrTag300.setMsgStrMti300(CFUtil.getInt(substring(workAreas800.getFieldVal800(),0,workAreas800.getFieldLen800())));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-MSG-STR-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
          charArray = new ArrayList<char[]>();
             charArray.add(substring(workAreas800.getIndent800(),0,workAreas800.getIlvl800()));
             charArray.add(msgStrTag300.toCharArray());
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
          updated = updateString(sys101OutRec.toCharArray() ,joinCharArray);
          sys101OutRec.setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
          writeSys101();/*2200-WRITE-SYS101*/

// * Message details
//  SET 500-1644697-NDX TO 1
          ndx5001644697 = 1; 
          
//  PERFORM UNTIL 500-1644697-NDX > 500-1644697-TBL-ITEMS
          while ((	( ndx5001644697 <= work.getTblItems5001644697() ))) {
              p300 = work.getP300();
//  EVALUATE 500-1644697-TAG-TYPE ( 500-1644697-NDX )
              if  (		compareChars(elementsTable5001644697.getTblEntry5001644697(ndx5001644697 - 1).getTagKey5001644697().getTagType5001644697(),work.getM300()) == 0 ) { 

// *            Skip tag since we already wrote message header
//  SET 500-1644697-NDX UP BY 1
                  ndx5001644697++; 
                  
              }
              else if  (		compareChars(elementsTable5001644697.getTblEntry5001644697(ndx5001644697 - 1).getTagKey5001644697().getTagType5001644697(),work.getD300()) == 0 ) { 
//  PERFORM 8610-PROCESS-1644697-DE
                  process1644697De();/*8610-PROCESS-1644697-DE*/
              }
              else if  (		compareChars(elementsTable5001644697.getTblEntry5001644697(ndx5001644697 - 1).getTagKey5001644697().getTagType5001644697(),p300) == 0 ) { 
//  PERFORM 8620-PROCESS-1644697-PDS
                  process1644697Pds();/*8620-PROCESS-1644697-PDS*/
              }
              else   { 
//  MOVE 500-COMN-TAG-TYPE ( 500-COMN-NDX ) TO 600-3009-TAG
                  errorMsg6003009.setTag6003009(comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagKey500().getComnTagType500());
//  MOVE 300-3009-ABEND-CODE TO 900-ABEND-CODE
                  abendMessage900.setAbendCode900(String.valueOf(work.getAbendCode3003009String()).toCharArray());
                  // MOVE 600-3009-ERROR-MSG TO 900-ABEND-TEXT
                  abendMessage900.setAbendText900(errorMsg6003009.toCharArray());
//  MOVE '8600-WRITE-:T:-XML' TO 900-ABEND-PARA
                  abendParaName900.setAbendPara900(CONSTANTS.LITERAL_1572256913);
//  PERFORM 9100-ABEND-PROGRAM
                  abendProgram();/*9100-ABEND-PROGRAM*/
              }
  
          }

// * Message trailer
//  SET 800-ILVL-1 TO TRUE
          workAreas800.setIlvl1800True(); 
          
          workAreas800.setSys101Rdw800((long)Math.abs(workAreas800.getIlvl800() + MSG_END_TAG_300_LENGTH));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-MSG-END-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
          charArray = new ArrayList<char[]>();
             charArray.add(substring(workAreas800.getIndent800(),0,workAreas800.getIlvl800()));
             charArray.add(work.getMsgEndTag300());
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
          updated = updateString(sys101OutRec.toCharArray() ,joinCharArray);
          sys101OutRec.setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
          writeSys101();/*2200-WRITE-SYS101*/
          ;
      
      }
      /**
      * process1644697De 
      *   This method is derived from 
  *   COBOL Paragraph - 8610-PROCESS-1644697-DE COBOL Cyclomatic complexity - 6
      * Input  :  

      * - tagSubfldNo5001644697          COBOL Name: 500-1644697-TAG-SUBFLD-NO
      * - ndx5001644697                  COBOL Name: 500-1644697-NDX
      * - tagNum5001644697               COBOL Name: 500-1644697-TAG-NUM
      * - indent800                      COBOL Name: 800-INDENT
      * - deStrTag300                    COBOL Name: 300-DE-STR-TAG
      * - deEndTag300                    COBOL Name: 300-DE-END-TAG
      * - tagLen5001644697               COBOL Name: 500-1644697-TAG-LEN
      * - tagValue5001644697             COBOL Name: 500-1644697-TAG-VALUE
      *
      * Output :  

      * - deStrCd300                     COBOL Name: 300-DE-STR-CD
      * - tagNum5001644697               COBOL Name: 500-1644697-TAG-NUM
      * - ilvl800                        COBOL Name: 800-ILVL
      * - sys101Rdw800                   COBOL Name: 800-SYS101-RDW
      * - sys101OutRec                   COBOL Name: SYS101-OUT-REC
      * - saveTagNum800                  COBOL Name: 800-SAVE-TAG-NUM
      * - ndx5001644697                  COBOL Name: 500-1644697-NDX
      *
      * @throws CFException
      */
      private void process1644697De() throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			 final int DE_END_TAG_300_LENGTH = 5;
			// End of variable declaration

      
// ******************************************************************
// * Process de
// ******************************************************************
//  IF 500-1644697-TAG-SUBFLD-NO ( 500-1644697-NDX ) > 0
          if (	( elementsTable5001644697.getTblEntry5001644697(ndx5001644697 - 1).getTagKey5001644697().getTagSubfldNo5001644697() > 0 )) { 
//  MOVE 500-1644697-TAG-NUM ( 500-1644697-NDX ) TO 300-DE-STR-CD
              deStrTag300.setDeStrCd300(elementsTable5001644697.getTblEntry5001644697(ndx5001644697 - 1).getTagKey5001644697().getTagNum5001644697());
//  SET 800-ILVL-2 TO TRUE
              workAreas800.setIlvl2800True(); 
              
              workAreas800.setSys101Rdw800((long)Math.abs(workAreas800.getIlvl800() + DeStrTag300.getDeStrTag300FieldLength()));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-DE-STR-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(workAreas800.getIndent800(),0,workAreas800.getIlvl800()));
                 charArray.add(deStrTag300.toCharArray());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(sys101OutRec.toCharArray() ,joinCharArray);
              sys101OutRec.setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
              writeSys101();/*2200-WRITE-SYS101*/
//  MOVE 500-1644697-TAG-NUM ( 500-1644697-NDX ) TO 800-SAVE-TAG-NUM
              workAreas800.setSaveTagNum800(elementsTable5001644697.getTblEntry5001644697(ndx5001644697 - 1).getTagKey5001644697().getTagNum5001644697());
//  PERFORM 8630-PROCESS-1644697-SUBFLD UNTIL 500-1644697-TAG-NUM ( 500-1644697-NDX ) NOT EQUAL 800-SAVE-TAG-NUM
              while (	( elementsTable5001644697.getTblEntry5001644697(ndx5001644697 - 1).getTagKey5001644697().getTagNum5001644697() == workAreas800.getSaveTagNum800() )) {
                 process1644697Subfld();/*8630-PROCESS-1644697-SUBFLD*/
              }
//  SET 800-ILVL-2 TO TRUE
              workAreas800.setIlvl2800True(); 
              
              workAreas800.setSys101Rdw800((long)Math.abs(workAreas800.getIlvl800() + DE_END_TAG_300_LENGTH));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-DE-END-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(workAreas800.getIndent800(),0,workAreas800.getIlvl800()));
                 charArray.add(work.getDeEndTag300());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(sys101OutRec.toCharArray() ,joinCharArray);
              sys101OutRec.setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
              writeSys101();/*2200-WRITE-SYS101*/
          }
//  ELSE
          else { 
//  MOVE 500-1644697-TAG-NUM ( 500-1644697-NDX ) TO 300-DE-STR-CD
              deStrTag300.setDeStrCd300(elementsTable5001644697.getTblEntry5001644697(ndx5001644697 - 1).getTagKey5001644697().getTagNum5001644697());
//  SET 800-ILVL-2 TO TRUE
              workAreas800.setIlvl2800True(); 
              
              workAreas800.setSys101Rdw800((long)Math.abs(workAreas800.getIlvl800() + DeStrTag300.getDeStrTag300FieldLength() + elementsTable5001644697.getTblEntry5001644697(ndx5001644697 - 1).getTagData5001644697().getTagLen5001644697() + DE_END_TAG_300_LENGTH));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-DE-STR-TAG 500-1644697-TAG-VALUE ( 500-1644697-NDX ) (1 : 500-1644697-TAG-LEN ( 500-1644697-NDX )) 300-DE-END-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(workAreas800.getIndent800(),0,workAreas800.getIlvl800()));
                 charArray.add(deStrTag300.toCharArray());
                 charArray.add(substring(elementsTable5001644697.getTblEntry5001644697(ndx5001644697 - 1).getTagData5001644697().getTagValue5001644697(),0,elementsTable5001644697.getTblEntry5001644697(ndx5001644697 - 1).getTagData5001644697().getTagLen5001644697()));
                 charArray.add(work.getDeEndTag300());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3));
              updated = updateString(sys101OutRec.toCharArray() ,joinCharArray);
              sys101OutRec.setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
              writeSys101();/*2200-WRITE-SYS101*/
//  SET 500-1644697-NDX UP BY 1
              ndx5001644697++; 
              
          }
      
      }
      /**
      * process1644697Pds 
      *   This method is derived from 
  *   COBOL Paragraph - 8620-PROCESS-1644697-PDS COBOL Cyclomatic complexity - 6
      * Input  :  

      * - tagSubfldNo5001644697          COBOL Name: 500-1644697-TAG-SUBFLD-NO
      * - ndx5001644697                  COBOL Name: 500-1644697-NDX
      * - tagNum5001644697               COBOL Name: 500-1644697-TAG-NUM
      * - indent800                      COBOL Name: 800-INDENT
      * - pdsStrTag300                   COBOL Name: 300-PDS-STR-TAG
      * - pdsEndTag300                   COBOL Name: 300-PDS-END-TAG
      * - tagLen5001644697               COBOL Name: 500-1644697-TAG-LEN
      * - tagValue5001644697             COBOL Name: 500-1644697-TAG-VALUE
      *
      * Output :  

      * - pdsStrCd300                    COBOL Name: 300-PDS-STR-CD
      * - tagNum5001644697               COBOL Name: 500-1644697-TAG-NUM
      * - ilvl800                        COBOL Name: 800-ILVL
      * - sys101Rdw800                   COBOL Name: 800-SYS101-RDW
      * - sys101OutRec                   COBOL Name: SYS101-OUT-REC
      * - saveTagNum800                  COBOL Name: 800-SAVE-TAG-NUM
      * - ndx5001644697                  COBOL Name: 500-1644697-NDX
      *
      * @throws CFException
      */
      private void process1644697Pds() throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			 final int PDS_END_TAG_300_LENGTH = 6;
			// End of variable declaration

      
// ******************************************************************
// * Process pds
// ******************************************************************
//  IF 500-1644697-TAG-SUBFLD-NO ( 500-1644697-NDX ) > 0
          if (	( elementsTable5001644697.getTblEntry5001644697(ndx5001644697 - 1).getTagKey5001644697().getTagSubfldNo5001644697() > 0 )) { 
//  MOVE 500-1644697-TAG-NUM ( 500-1644697-NDX ) TO 300-PDS-STR-CD
              pdsStrTag300.setPdsStrCd300(elementsTable5001644697.getTblEntry5001644697(ndx5001644697 - 1).getTagKey5001644697().getTagNum5001644697());
//  SET 800-ILVL-2 TO TRUE
              workAreas800.setIlvl2800True(); 
              
              workAreas800.setSys101Rdw800((long)Math.abs(workAreas800.getIlvl800() + PdsStrTag300.getPdsStrTag300FieldLength()));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-PDS-STR-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(workAreas800.getIndent800(),0,workAreas800.getIlvl800()));
                 charArray.add(pdsStrTag300.toCharArray());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(sys101OutRec.toCharArray() ,joinCharArray);
              sys101OutRec.setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
              writeSys101();/*2200-WRITE-SYS101*/
//  MOVE 500-1644697-TAG-NUM ( 500-1644697-NDX ) TO 800-SAVE-TAG-NUM
              workAreas800.setSaveTagNum800(elementsTable5001644697.getTblEntry5001644697(ndx5001644697 - 1).getTagKey5001644697().getTagNum5001644697());
//  PERFORM 8630-PROCESS-1644697-SUBFLD UNTIL 500-1644697-TAG-NUM ( 500-1644697-NDX ) NOT EQUAL 800-SAVE-TAG-NUM
              while (	( elementsTable5001644697.getTblEntry5001644697(ndx5001644697 - 1).getTagKey5001644697().getTagNum5001644697() == workAreas800.getSaveTagNum800() )) {
                 process1644697Subfld();/*8630-PROCESS-1644697-SUBFLD*/
              }
//  SET 800-ILVL-2 TO TRUE
              workAreas800.setIlvl2800True(); 
              
              workAreas800.setSys101Rdw800((long)Math.abs(workAreas800.getIlvl800() + PDS_END_TAG_300_LENGTH));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-PDS-END-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(workAreas800.getIndent800(),0,workAreas800.getIlvl800()));
                 charArray.add(work.getPdsEndTag300());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(sys101OutRec.toCharArray() ,joinCharArray);
              sys101OutRec.setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
              writeSys101();/*2200-WRITE-SYS101*/
          }
//  ELSE
          else { 
//  MOVE 500-1644697-TAG-NUM ( 500-1644697-NDX ) TO 300-PDS-STR-CD
              pdsStrTag300.setPdsStrCd300(elementsTable5001644697.getTblEntry5001644697(ndx5001644697 - 1).getTagKey5001644697().getTagNum5001644697());
//  SET 800-ILVL-2 TO TRUE
              workAreas800.setIlvl2800True(); 
              
              workAreas800.setSys101Rdw800((long)Math.abs(workAreas800.getIlvl800() + PdsStrTag300.getPdsStrTag300FieldLength() + elementsTable5001644697.getTblEntry5001644697(ndx5001644697 - 1).getTagData5001644697().getTagLen5001644697() + PDS_END_TAG_300_LENGTH));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-PDS-STR-TAG 500-1644697-TAG-VALUE ( 500-1644697-NDX ) (1 : 500-1644697-TAG-LEN ( 500-1644697-NDX )) 300-PDS-END-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(workAreas800.getIndent800(),0,workAreas800.getIlvl800()));
                 charArray.add(pdsStrTag300.toCharArray());
                 charArray.add(substring(elementsTable5001644697.getTblEntry5001644697(ndx5001644697 - 1).getTagData5001644697().getTagValue5001644697(),0,elementsTable5001644697.getTblEntry5001644697(ndx5001644697 - 1).getTagData5001644697().getTagLen5001644697()));
                 charArray.add(work.getPdsEndTag300());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3));
              updated = updateString(sys101OutRec.toCharArray() ,joinCharArray);
              sys101OutRec.setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
              writeSys101();/*2200-WRITE-SYS101*/
//  SET 500-1644697-NDX UP BY 1
              ndx5001644697++; 
              
          }
      
      }
      /**
      * process1644697Subfld 
      *   This method is derived from 
  *   COBOL Paragraph - 8630-PROCESS-1644697-SUBFLD COBOL Cyclomatic complexity - 4
      * Input  :  

      * - tagLen5001644697               COBOL Name: 500-1644697-TAG-LEN
      * - ndx5001644697                  COBOL Name: 500-1644697-NDX
      * - indent800                      COBOL Name: 800-INDENT
      * - subfldTagStr300                COBOL Name: 300-SUBFLD-TAG-STR
      * - tagValue5001644697             COBOL Name: 500-1644697-TAG-VALUE
      * - subfldTagEnd300                COBOL Name: 300-SUBFLD-TAG-END
      *
      * Output :  

      * - ilvl800                        COBOL Name: 800-ILVL
      * - sys101Rdw800                   COBOL Name: 800-SYS101-RDW
      * - sys101OutRec                   COBOL Name: SYS101-OUT-REC
      * - ndx5001644697                  COBOL Name: 500-1644697-NDX
      *
      * @throws CFException
      */
      private void process1644697Subfld() throws Exception {
			// Declare local variables used in the method
			 final int SUBFLD_TAG_STR_300_LENGTH = 3;
			 final int SUBFLD_TAG_END_300_LENGTH = 4;
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			// End of variable declaration

      
// ******************************************************************
// * Process subfields
// ******************************************************************
//  SET 800-ILVL-3 TO TRUE
          workAreas800.setIlvl3800True(); 
          
          workAreas800.setSys101Rdw800((long)Math.abs(workAreas800.getIlvl800() + SUBFLD_TAG_STR_300_LENGTH + elementsTable5001644697.getTblEntry5001644697(ndx5001644697 - 1).getTagData5001644697().getTagLen5001644697() + SUBFLD_TAG_END_300_LENGTH));
//  IF 500-1644697-TAG-LEN ( 500-1644697-NDX ) > 0
          if (	( elementsTable5001644697.getTblEntry5001644697(ndx5001644697 - 1).getTagData5001644697().getTagLen5001644697() > 0 )) { 
//  STRING 800-INDENT (1 : 800-ILVL ) 300-SUBFLD-TAG-STR 500-1644697-TAG-VALUE ( 500-1644697-NDX ) (1 : 500-1644697-TAG-LEN ( 500-1644697-NDX )) 300-SUBFLD-TAG-END DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(workAreas800.getIndent800(),0,workAreas800.getIlvl800()));
                 charArray.add(work.getSubfldTagStr300());
                 charArray.add(substring(elementsTable5001644697.getTblEntry5001644697(ndx5001644697 - 1).getTagData5001644697().getTagValue5001644697(),0,elementsTable5001644697.getTblEntry5001644697(ndx5001644697 - 1).getTagData5001644697().getTagLen5001644697()));
                 charArray.add(work.getSubfldTagEnd300());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3));
              updated = updateString(sys101OutRec.toCharArray() ,joinCharArray);
              sys101OutRec.setString(  (char[])updated.get("string"));
          }
//  ELSE
          else { 
//  STRING 800-INDENT (1 : 800-ILVL ) 300-SUBFLD-TAG-STR 300-SUBFLD-TAG-END DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(workAreas800.getIndent800(),0,workAreas800.getIlvl800()));
                 charArray.add(work.getSubfldTagStr300());
                 charArray.add(work.getSubfldTagEnd300());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2));
              updated = updateString(sys101OutRec.toCharArray() ,joinCharArray);
              sys101OutRec.setString(  (char[])updated.get("string"));
          }
//  PERFORM 2200-WRITE-SYS101
          writeSys101();/*2200-WRITE-SYS101*/
//  SET 500-1644697-NDX UP BY 1
          ndx5001644697++; 
          
      
      }
      /**
      * write1644697Psipm 
      *   This method is derived from 
  *   COBOL Paragraph - 8700-WRITE-1644697-PSIPM COBOL Cyclomatic complexity - 9
      * Input  :  

      * - ndx5001644697                  COBOL Name: 500-1644697-NDX
      * - tblItems5001644697             COBOL Name: 500-1644697-TBL-ITEMS
      * - tagNum5001644697               COBOL Name: 500-1644697-TAG-NUM
      * - tagOccur5001644697             COBOL Name: 500-1644697-TAG-OCCUR
      * - tagSubfldNo5001644697          COBOL Name: 500-1644697-TAG-SUBFLD-NO
      * - tagLen5001644697               COBOL Name: 500-1644697-TAG-LEN
      * - tagValue5001644697             COBOL Name: 500-1644697-TAG-VALUE
      * - tag800                         COBOL Name: 800-TAG
      *
      * Output :  

      * - ip66601UserT                   COBOL Name: IP66601-USER-T
      * - ip66601UserTcnt                COBOL Name: IP66601-USER-TCNT
      * - fldStrt800                     COBOL Name: 800-FLD-STRT
      * - ndx5001644697                  COBOL Name: 500-1644697-NDX
      * - ip66601UserTagType             COBOL Name: IP66601-USER-TAG-TYPE
      * - ip66601UserTagNo               COBOL Name: IP66601-USER-TAG-NO
      * - tagNum5001644697               COBOL Name: 500-1644697-TAG-NUM
      * - ip66601UserTagOccurrence       COBOL Name: IP66601-USER-TAG-OCCURRENCE
      * - tagOccur5001644697             COBOL Name: 500-1644697-TAG-OCCUR
      * - ip66601UserTagSubfldNo         COBOL Name: IP66601-USER-TAG-SUBFLD-NO
      * - tagSubfldNo5001644697          COBOL Name: 500-1644697-TAG-SUBFLD-NO
      * - ip66601UserTagStart            COBOL Name: IP66601-USER-TAG-START
      * - ip66601UserTagLngth            COBOL Name: IP66601-USER-TAG-LNGTH
      * - tagLen5001644697               COBOL Name: 500-1644697-TAG-LEN
      * - ip66102NormalIpmMsg            COBOL Name: IP66102-NORMAL-IPM-MSG
      * - tagValue5001644697             COBOL Name: 500-1644697-TAG-VALUE
      * - sys201Rdw800                   COBOL Name: 800-SYS201-RDW
      * - tagTblPtr800                   COBOL Name: 800-TAG-TBL-PTR
      * - sys201OutRec                   COBOL Name: SYS201-OUT-REC
      * - tagType800                     COBOL Name: 800-TAG-TYPE
      * - tagNum800                      COBOL Name: 800-TAG-NUM
      * - tagOccur800                    COBOL Name: 800-TAG-OCCUR
      * - tagSubfldNo800                 COBOL Name: 800-TAG-SUBFLD-NO
      * - tagStart800                    COBOL Name: 800-TAG-START
      * - tagLngth800                    COBOL Name: 800-TAG-LNGTH
      * - tag800                         COBOL Name: 800-TAG
      *
      * @throws CFException
      */
      private void write1644697Psipm() throws Exception {
			// Declare local variables used in the method
			Tag800 tag800 = workAreas800.getTag800();
			// End of variable declaration

      
// ******************************************************************
// * Write pseudo ipm message
// ******************************************************************
//  SET IP66601-USER-T TO 1
          ip66601UserT = 1; 
          
//  MOVE 1 TO IP66601-USER-TCNT 800-FLD-STRT
          ip66601UserTagInformation.setIp66601UserTcnt((short)1);
          workAreas800.setFldStrt800((long)1);

// *    Write element tags to user tag table
//  PERFORM VARYING 500-1644697-NDX FROM 1 BY 1 UNTIL 500-1644697-NDX > 500-1644697-TBL-ITEMS
          for (ndx5001644697 = 1; (	( ndx5001644697 <= work.getTblItems5001644697() )) ; ndx5001644697 = ndx5001644697 + 1 ) {
//  SET IP66601-USER-T TO 500-1644697-NDX
              ip66601UserT = ndx5001644697; 
              
//  EVALUATE 500-1644697-TAG-TYPE ( 500-1644697-NDX )
              switch(new String(elementsTable5001644697.getTblEntry5001644697(ndx5001644697 - 1).getTagKey5001644697().getTagType5001644697())){
              	case "M":
//  SET IP66601-USER-MTI-TAG ( IP66601-USER-T ) TO TRUE
                  ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserMtiTagTrue(); 
                  
              break;
              	case "D":
//  SET IP66601-USER-DE-TAG ( IP66601-USER-T ) TO TRUE
                  ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserDeTagTrue(); 
                  
              break;
              	case "P":
//  SET IP66601-USER-PDS-TAG ( IP66601-USER-T ) TO TRUE
                  ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserPdsTagTrue(); 
                  
              break;
              }
//  MOVE 500-1644697-TAG-NUM ( 500-1644697-NDX ) TO IP66601-USER-TAG-NO ( IP66601-USER-T )
              ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagNo((short) elementsTable5001644697.getTblEntry5001644697(ndx5001644697 - 1).getTagKey5001644697().getTagNum5001644697());
//  MOVE 500-1644697-TAG-OCCUR ( 500-1644697-NDX ) TO IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-T )
              ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().setIp66601UserTagOccurrence((short) elementsTable5001644697.getTblEntry5001644697(ndx5001644697 - 1).getTagKey5001644697().getTagOccur5001644697());
//  MOVE 500-1644697-TAG-SUBFLD-NO ( 500-1644697-NDX ) TO IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-T )
              ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().setIp66601UserTagSubfldNo((short) elementsTable5001644697.getTblEntry5001644697(ndx5001644697 - 1).getTagKey5001644697().getTagSubfldNo5001644697());
//  MOVE 800-FLD-STRT TO IP66601-USER-TAG-START ( IP66601-USER-T )
              ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).setIp66601UserTagStart((short) workAreas800.getFldStrt800());
//  MOVE 500-1644697-TAG-LEN ( 500-1644697-NDX ) TO IP66601-USER-TAG-LNGTH ( IP66601-USER-T )
              ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).setIp66601UserTagLngth((short) elementsTable5001644697.getTblEntry5001644697(ndx5001644697 - 1).getTagData5001644697().getTagLen5001644697());

// *    Write element content to message string
//  IF 500-1644697-TAG-LEN ( 500-1644697-NDX ) > 0
              if (	( elementsTable5001644697.getTblEntry5001644697(ndx5001644697 - 1).getTagData5001644697().getTagLen5001644697() > 0 )) { 
//  MOVE 500-1644697-TAG-VALUE ( 500-1644697-NDX ) (1 : 500-1644697-TAG-LEN ( 500-1644697-NDX )) TO IP66102-NORMAL-IPM-MSG ( 800-FLD-STRT : IP66601-USER-TAG-LNGTH ( IP66601-USER-T ))
                  ip66102IpmMsg.setIp66102NormalIpmMsg(replace(ip66102IpmMsg.getIp66102NormalIpmMsg().toCharArray(),substring(elementsTable5001644697.getTblEntry5001644697(ndx5001644697 - 1).getTagData5001644697().getTagValue5001644697(),0,elementsTable5001644697.getTblEntry5001644697(ndx5001644697 - 1).getTagData5001644697().getTagLen5001644697()),((int) workAreas800.getFldStrt800()-1), (ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagLngth() + ((int) workAreas800.getFldStrt800() - 1)) ));
              }
//  ADD IP66601-USER-TAG-LNGTH ( IP66601-USER-T ) TO 800-FLD-STRT
              workAreas800.setFldStrt800(workAreas800.getFldStrt800()+(short) ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagLngth());
          }

// *    Set ip66601-user-t     down by 1
//  SET IP66601-USER-TCNT TO IP66601-USER-T
          ip66601UserTagInformation.setIp66601UserTcnt((short) ip66601UserT); 
          
          workAreas800.setSys201Rdw800((long) (Math.abs(5 + workAreas800.getFldStrt800() - 1 +  ( 24 * ip66601UserTagInformation.getIp66601UserTcnt() ) )));
          workAreas800.setTagTblPtr800((long) (Math.abs(5 + workAreas800.getFldStrt800())));

// *    Write tag table pointer to sys201 record

// *    Write message string to sys201 record
//  MOVE 800-TAG-TBL-PTR TO SYS201-OUT-REC (1 : 5)
          sys201OutRec.replace(String.valueOf(workAreas800.getTagTblPtr800String()).toCharArray(),0,String.valueOf(workAreas800.getTagTblPtr800String()).length(),0,5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE IP66102-NORMAL-IPM-MSG (1 : 800-FLD-STRT ) TO SYS201-OUT-REC (6 : 800-FLD-STRT )
          sys201OutRec.replace(ip66102IpmMsg/*parent*/,0/*fromOffset - (sys201OutRec) */,(int) workAreas800.getFldStrt800()/*fromLen*/,0+6 - 1/*toOffset - (ip66102NormalIpmMsg) */,(int) workAreas800.getFldStrt800()/*toLen*/);
          // MOVE 800-TAG-TBL-PTR TO 800-FLD-STRT
          workAreas800.setFldStrt800(workAreas800.getTagTblPtr800());

// *    Write tag table to sys201 record
//  PERFORM VARYING IP66601-USER-T FROM 1 BY 1 UNTIL IP66601-USER-T > IP66601-USER-TCNT
          for (ip66601UserT = 1; (	( ip66601UserT <= ip66601UserTagInformation.getIp66601UserTcnt() ) ) ; ip66601UserT = ip66601UserT + 1 ) {
//  MOVE IP66601-USER-TAG-TYPE ( IP66601-USER-T ) TO 800-TAG-TYPE
              tag800.setTagType800(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagType());
  
//  MOVE IP66601-USER-TAG-NO ( IP66601-USER-T ) TO 800-TAG-NUM
              tag800.setTagNum800(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagNo());
  
//  MOVE IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-T ) TO 800-TAG-OCCUR
              tag800.setTagOccur800(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserTagOccurrence());
  
//  MOVE IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-T ) TO 800-TAG-SUBFLD-NO
              tag800.setTagSubfldNo800(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserTagSubfldNo());
  
//  MOVE IP66601-USER-TAG-START ( IP66601-USER-T ) TO 800-TAG-START
              tag800.setTagStart800(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagStart());
  
//  MOVE IP66601-USER-TAG-LNGTH ( IP66601-USER-T ) TO 800-TAG-LNGTH
              tag800.setTagLngth800(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagLngth());
  
//  MOVE 800-TAG (1 : 24) TO SYS201-OUT-REC ( 800-FLD-STRT : 24)
              sys201OutRec.replace(workAreas800/*parent*/,0/*fromOffset - (sys201OutRec) */,24/*fromLen*/,0+(int) workAreas800.getFldStrt800() - 1/*toOffset - (tag800) */,24/*toLen*/);
//  ADD 24 TO 800-FLD-STRT
              workAreas800.setFldStrt800(workAreas800.getFldStrt800()+(long)24);
          }
//  PERFORM 3110-WRITE-SYS201
          writeSys201();/*3110-WRITE-SYS201*/
          ;
      
      }
      /**
      * write1644697Ipm 
      *   This method is derived from 
  *   COBOL Paragraph - 8800-WRITE-1644697-IPM COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      private void write1644697Ipm() throws Exception {
      
// ******************************************************************
// * Write ipm message
// ******************************************************************
//  CALL 800-PTR-IP666010
          // CALL 800-PTR-IP666010
          	this.setRc( ip666010.process());
      
      }
      /**
      * addComnField 
      *   This method is derived from 
  *   COBOL Paragraph - 8000-ADD-COMN-FIELD COBOL Cyclomatic complexity - 4
      * Input  :  

      * - comnTblItems500                COBOL Name: 500-COMN-TBL-ITEMS
      * - comnTblMax500                  COBOL Name: 500-COMN-TBL-MAX
      * - newElem800                     COBOL Name: 800-NEW-ELEM
      * - newElemLen800                  COBOL Name: 800-NEW-ELEM-LEN
      * - newElemValue800                COBOL Name: 800-NEW-ELEM-VALUE
      * - abendCode3003008               COBOL Name: 300-3008-ABEND-CODE
      * - errorMsg6003008                COBOL Name: 600-3008-ERROR-MSG
      * - para8000Comn300                COBOL Name: 300-PARA-8000-COMN
      *
      * Output :  

      * - comnTblItems500                COBOL Name: 500-COMN-TBL-ITEMS
      * - comnNdx500                     COBOL Name: 500-COMN-NDX
      * - comnTagKey500                  COBOL Name: 500-COMN-TAG-KEY
      * - newElem800                     COBOL Name: 800-NEW-ELEM
      * - comnTagLen500                  COBOL Name: 500-COMN-TAG-LEN
      * - newElemLen800                  COBOL Name: 800-NEW-ELEM-LEN
      * - comnTagValue500                COBOL Name: 500-COMN-TAG-VALUE
      * - newElemValue800                COBOL Name: 800-NEW-ELEM-VALUE
      * - comnNdx2500                    COBOL Name: 500-COMN-NDX2
      * - table6003008                   COBOL Name: 600-3008-TABLE
      * - maxSize6003008                 COBOL Name: 600-3008-MAX-SIZE
      * - comnTblMax500                  COBOL Name: 500-COMN-TBL-MAX
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - abendCode3003008               COBOL Name: 300-3008-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - errorMsg6003008                COBOL Name: 600-3008-ERROR-MSG
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para8000Comn300                COBOL Name: 300-PARA-8000-COMN
      *
      * @throws CFException
      */
      private void addComnField() throws Exception {
			// Declare local variables used in the method
			NewElemData800 newElemData800 = workAreas800.getNewElemData800();
			int comnTblItems500 = 0;
			int comnTblMax500 = 0;
			// End of variable declaration

      
// * Element ip169502 as of 07/28/20 06:14:49                    [vc]
// ******************************************************************
// * add a field to the :t: element table
// *
// * note:
// * the following fields should be populated before this paragragh
// * is called.
// *
// * 800-new-elem
// * 800-new-elem-len
// * 800-new-elem-value
// ******************************************************************
          comnTblItems500 = work.getComnTblItems500();
          comnTblMax500 = work.getComnTblMax500();
//  IF 500-COMN-TBL-ITEMS < 500-COMN-TBL-MAX
          if (	( comnTblItems500 < comnTblMax500 )) { 
//  ADD 1 TO 500-COMN-TBL-ITEMS
              work.setComnTblItems500(work.getComnTblItems500()+1);
//  SET 500-COMN-NDX TO 500-COMN-TBL-ITEMS
              comnNdx500 = work.getComnTblItems500(); 
              
//  MOVE 800-NEW-ELEM TO 500-COMN-TAG-KEY ( 500-COMN-NDX )
              comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagKey500().setString(workAreas800.getNewElem800());
//  MOVE 800-NEW-ELEM-LEN TO 500-COMN-TAG-LEN ( 500-COMN-NDX )
              comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagData500().setComnTagLen500(newElemData800.getNewElemLen800());
  
//  MOVE 800-NEW-ELEM-VALUE TO 500-COMN-TAG-VALUE ( 500-COMN-NDX )
              comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagData500().setComnTagValue500(newElemData800.getNewElemValue800());
  
              comnTblItems500 = work.getComnTblItems500();
//  IF 500-COMN-TBL-ITEMS > 1
              if (	( comnTblItems500 > 1 )) { 
//  SET 500-COMN-NDX2 TO 500-COMN-NDX
                  comnNdx2500 = comnNdx500; 
                  
//  SET 500-COMN-NDX2 DOWN BY 1
                  comnNdx2500--; 
                  
//  IF 500-COMN-TAG-KEY ( 500-COMN-NDX ) < 500-COMN-TAG-KEY ( 500-COMN-NDX2 )
                  if (		compareChars(comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagKey500(),comnElementsTable500.getComnTblEntry500(comnNdx2500 - 1).getComnTagKey500()) < 0 ) { 
//  PERFORM 8100-SORT-COMN-FIELDS
                      sortComnFields();/*8100-SORT-COMN-FIELDS*/
                  }
              }
  
          }
  
//  ELSE
          else { 
//  SET 600-3008-TABLE-COMN TO TRUE
              errorMsg6003008.setTableComn6003008True(); 
              
//  MOVE 500-COMN-TBL-MAX TO 600-3008-MAX-SIZE
              errorMsg6003008.setMaxSize6003008(String.valueOf(CFUtil.pad(8,String.valueOf(work.getComnTblMax500()),"0",CFUtil.LEFT_PAD)).toCharArray());
//  MOVE 300-3008-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(String.valueOf(work.getAbendCode3003008String()).toCharArray());
              // MOVE 600-3008-ERROR-MSG TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(errorMsg6003008.toCharArray());
//  MOVE 300-PARA-8000-COMN TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara8000Comn300());
//  PERFORM 9100-ABEND-PROGRAM
              abendProgram();/*9100-ABEND-PROGRAM*/
          }
      
      }
      /**
      * sortComnFields 
      *   This method is derived from 
  *   COBOL Paragraph - 8100-SORT-COMN-FIELDS COBOL Cyclomatic complexity - 6
      * Input  :  

      * - comnTblItems500                COBOL Name: 500-COMN-TBL-ITEMS
      * - comnNdx500                     COBOL Name: 500-COMN-NDX
      * - comnNdx2500                    COBOL Name: 500-COMN-NDX2
      * - comnTagKey500                  COBOL Name: 500-COMN-TAG-KEY
      * - comnTblEntry500                COBOL Name: 500-COMN-TBL-ENTRY
      *
      * Output :  

      * - comnNdx500                     COBOL Name: 500-COMN-NDX
      * - comnNdx2500                    COBOL Name: 500-COMN-NDX2
      * - saveEntry800                   COBOL Name: 800-SAVE-ENTRY
      * - comnTblEntry500                COBOL Name: 500-COMN-TBL-ENTRY
      *
      * @throws CFException
      */
      private void sortComnFields() throws Exception {
      
// ******************************************************************
// * Sort the :t: element table
// ******************************************************************
//  PERFORM VARYING 500-COMN-NDX FROM 500-COMN-TBL-ITEMS BY -1 UNTIL 500-COMN-NDX <= 1
          for (comnNdx500 = work.getComnTblItems500(); (	( comnNdx500 > 1 )) ; comnNdx500 = comnNdx500 + -1 ) {
//  PERFORM VARYING 500-COMN-NDX2 FROM 1 BY 1 UNTIL 500-COMN-NDX2 >= 500-COMN-NDX
              for (comnNdx2500 = 1; (	( comnNdx2500 < comnNdx500 )) ; comnNdx2500 = comnNdx2500 + 1 ) {
//  IF 500-COMN-TAG-KEY ( 500-COMN-NDX ) < 500-COMN-TAG-KEY ( 500-COMN-NDX2 )
                  if (		compareChars(comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagKey500(),comnElementsTable500.getComnTblEntry500(comnNdx2500 - 1).getComnTagKey500()) < 0 ) { 
//  MOVE 500-COMN-TBL-ENTRY ( 500-COMN-NDX ) TO 800-SAVE-ENTRY
                      workAreas800.setSaveEntry800(comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).toCharArray());
//  MOVE 500-COMN-TBL-ENTRY ( 500-COMN-NDX2 ) TO 500-COMN-TBL-ENTRY ( 500-COMN-NDX )
                      comnElementsTable500.setComnTblEntry500((comnNdx500 - 1),comnElementsTable500.getComnTblEntry500(comnNdx2500 - 1).toCharArray());
//  MOVE 800-SAVE-ENTRY TO 500-COMN-TBL-ENTRY ( 500-COMN-NDX2 )
                      comnElementsTable500.setComnTblEntry500((comnNdx2500 - 1),workAreas800.getSaveEntry800());
                  }
              }
          }
      
      }
      /**
      * updateComnField 
      *   This method is derived from 
  *   COBOL Paragraph - 8200-UPDATE-COMN-FIELD COBOL Cyclomatic complexity - 2
      * Input  :  

      * - newElem800                     COBOL Name: 800-NEW-ELEM
      * - comnSrchKeyFndSw500            COBOL Name: 500-COMN-SRCH-KEY-FND-SW
      * - newElemLen800                  COBOL Name: 800-NEW-ELEM-LEN
      * - newElemValue800                COBOL Name: 800-NEW-ELEM-VALUE
      *
      * Output :  

      * - comnTblSrchKey500              COBOL Name: 500-COMN-TBL-SRCH-KEY
      * - newElem800                     COBOL Name: 800-NEW-ELEM
      * - comnTagKey500                  COBOL Name: 500-COMN-TAG-KEY
      * - comnTagLen500                  COBOL Name: 500-COMN-TAG-LEN
      * - newElemLen800                  COBOL Name: 800-NEW-ELEM-LEN
      * - comnTagValue500                COBOL Name: 500-COMN-TAG-VALUE
      * - newElemValue800                COBOL Name: 800-NEW-ELEM-VALUE
      *
      * @throws CFException
      */
      private void updateComnField() throws Exception {
			// Declare local variables used in the method
			NewElemData800 newElemData800 = workAreas800.getNewElemData800();
			// End of variable declaration

      
// ******************************************************************
// * Update a field in to the :t: element table
// *
// * note:
// * the following fields should be populated before this paragragh
// * is called.
// * 800-new-elem        - element to be updated
// * 800-new-elem-len    - new length
// * 800-new-elem-value  - new value
// ******************************************************************
          // MOVE 800-NEW-ELEM TO 500-COMN-TBL-SRCH-KEY
          work.setComnTblSrchKey500(workAreas800.getNewElem800());
//  PERFORM 8300-LOOKUP-COMN-FIELD
          lookupComnField();/*8300-LOOKUP-COMN-FIELD*/
//  IF 500-COMN-SRCH-KEY-FND
          if ( work.isComnSrchKeyFnd500()  ) { 
//  MOVE 800-NEW-ELEM TO 500-COMN-TAG-KEY ( 500-COMN-NDX )
              comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagKey500().setString(workAreas800.getNewElem800());
//  MOVE 800-NEW-ELEM-LEN TO 500-COMN-TAG-LEN ( 500-COMN-NDX )
              comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagData500().setComnTagLen500(newElemData800.getNewElemLen800());
  
//  MOVE 800-NEW-ELEM-VALUE TO 500-COMN-TAG-VALUE ( 500-COMN-NDX )
              comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagData500().setComnTagValue500(newElemData800.getNewElemValue800());
  
          }
//  ELSE
          else { 
//  PERFORM 8000-ADD-COMN-FIELD
              addComnField();/*8000-ADD-COMN-FIELD*/
          }
      
      }
      /**
      * lookupComnField 
      *   This method is derived from 
  *   COBOL Paragraph - 8300-LOOKUP-COMN-FIELD COBOL Cyclomatic complexity - 2
      * Input  :  

      * - comnTblEntry500                COBOL Name: 500-COMN-TBL-ENTRY
      * - comnTagKey500                  COBOL Name: 500-COMN-TAG-KEY
      * - comnTblSrchKey500              COBOL Name: 500-COMN-TBL-SRCH-KEY
      *
      * Output :  

      * - comnNdx500                     COBOL Name: 500-COMN-NDX
      * - comnSrchKeyFndSw500            COBOL Name: 500-COMN-SRCH-KEY-FND-SW
      *
      * @throws CFException
      */
      private void lookupComnField() throws Exception {
			// Declare local variables used in the method
			boolean keepSearching = true;
			int[] searchIndexes = null;
			int searchLowPoint = 0;
			int searchMidPoint = 0;
			int searchHighPoint = 0;
			int searchCompare = 0;
			char[] comnTblSrchKey500 = null;
			// End of variable declaration

      
// ******************************************************************
// * Lookup a field in to the :t: element table
// *
// * note:
// * 500-:t:-srch-key should be populated with proper
// * search key before this paragraph is called
// ******************************************************************
//  SET 500-COMN-NDX TO 1
          comnNdx500 = 1; 
          
          comnTblSrchKey500 = work.getComnTblSrchKey500();
//  SEARCH ALL 500-COMN-TBL-ENTRY
          // Binary Search through comnElementsTable500.comnTblEntry500
          searchLowPoint = 0; //prevLowValue
          searchHighPoint = work.getComnTblItems500(); //prevHighValue
          searchMidPoint = searchHighPoint / 2; //starting at mid point
          searchIndexes = new int[]{searchLowPoint,searchMidPoint,searchHighPoint};
          keepSearching = true;
          while (keepSearching) {
          // compare logic below
             searchCompare = compareAscending(comnElementsTable500.getComnTblEntry500(searchMidPoint).getComnTagKey500(),comnTblSrchKey500);
          // end of compare logic
          	if (searchCompare == 0 ) { // if search found
          	      keepSearching = false;
          	     comnNdx500 = searchMidPoint	 + 1;
//  SET 500-COMN-SRCH-KEY-FND TO TRUE
              work.setComnSrchKeyFnd500True(); 
              
          	} else  {
          		adjustSearchIndex(searchCompare,searchIndexes);
          		searchLowPoint  = searchIndexes[0];
           		searchMidPoint  = searchIndexes[1];
           		searchHighPoint = searchIndexes[2];
           		if (searchMidPoint == -1) { // search exhausted
           		    keepSearching = false; 
//  SET 500-COMN-SRCH-KEY-NOT-FND TO TRUE
              work.setComnSrchKeyNotFnd500True(); 
              
           		}
          	}
          }
  
      
      }
      /**
      * displayComnTable 
      *   This method is derived from 
  *   COBOL Paragraph - 8400-DISPLAY-COMN-TABLE COBOL Cyclomatic complexity - 6
      * Input  :  

      * - comnSrchKeyFndSw500            COBOL Name: 500-COMN-SRCH-KEY-FND-SW
      * - comnTagValue500                COBOL Name: 500-COMN-TAG-VALUE
      * - comnNdx500                     COBOL Name: 500-COMN-NDX
      * - comnTblItems500                COBOL Name: 500-COMN-TBL-ITEMS
      * - comnTagLen500                  COBOL Name: 500-COMN-TAG-LEN
      * - comnTagType500                 COBOL Name: 500-COMN-TAG-TYPE
      * - comnTagNum500                  COBOL Name: 500-COMN-TAG-NUM
      * - comnTagSubfldNo500             COBOL Name: 500-COMN-TAG-SUBFLD-NO
      * - comnTagOccur500                COBOL Name: 500-COMN-TAG-OCCUR
      *
      * Output :  

      * - comnTblSrchKey500              COBOL Name: 500-COMN-TBL-SRCH-KEY
      * - comnNdx500                     COBOL Name: 500-COMN-NDX
      * - ptrVal800                      COBOL Name: 800-PTR-VAL
      *
      * @throws CFException
      */
      private void displayComnTable() throws Exception {
      
// *    If 500-:t:-srch-key-fnd
// *       display 500-:t:-tbl-srch-key ' found'
// *       move 500-:t:-tbl-srch-key          to 800-new-elem
// *       move 500-:t:-tag-len(500-:t:-ndx)  to 800-new-elem-len
// *       move 500-:t:-tag-value(500-:t:-ndx)
// *         to 800-new-elem-value
// *    else
// *       display 500-:t:-tbl-srch-key ' not found'
// *       move 500-:t:-tbl-srch-key          to 800-new-elem
// *       move 0                             to 800-new-elem-len
// *       move spaces                        to 800-new-elem-value
// *    end-if

// ******************************************************************
// * Display the :t: element table
// ******************************************************************
//  DISPLAY '================================================'
          logger.info("================================================"); 
          // MOVE 'M000000000000' TO 500-COMN-TBL-SRCH-KEY
          //  LITERAL_M000000000000 = 'M000000000000'
          work.setComnTblSrchKey500(CONSTANTS.LITERAL_M000000000000);
//  PERFORM 8300-LOOKUP-COMN-FIELD
          lookupComnField();/*8300-LOOKUP-COMN-FIELD*/
//  IF 500-COMN-SRCH-KEY-FND
          if ( work.isComnSrchKeyFnd500()  ) { 
//  DISPLAY '= ' 500-COMN-TAG-VALUE ( 500-COMN-NDX ) (1 : 500-COMN-TAG-LEN ( 500-COMN-NDX ))
              logger.info("= {}", new String(substring(comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagData500().getComnTagValue500(),0,comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagData500().getComnTagLen500()))); 
          }
          // MOVE 'D002400000000' TO 500-COMN-TBL-SRCH-KEY
          //  LITERAL_D002400000000 = 'D002400000000'
          work.setComnTblSrchKey500(CONSTANTS.LITERAL_D002400000000);
//  PERFORM 8300-LOOKUP-COMN-FIELD
          lookupComnField();/*8300-LOOKUP-COMN-FIELD*/
//  IF 500-COMN-SRCH-KEY-FND
          if ( work.isComnSrchKeyFnd500()  ) { 
//  DISPLAY '= ' 500-COMN-TAG-VALUE ( 500-COMN-NDX ) (1 : 500-COMN-TAG-LEN ( 500-COMN-NDX ))
              logger.info("= {}", new String(substring(comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagData500().getComnTagValue500(),0,comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagData500().getComnTagLen500()))); 
          }
//  DISPLAY '= TABLE ELEMENTS'
          logger.info("= TABLE ELEMENTS"); 
//  DISPLAY '================================================'
          logger.info("================================================"); 
//  DISPLAY '     #   ' ' T' ' CODE' ' SUBF' ' OCCR' ' LEN' ' VALUE'
          logger.info("     #    T CODE SUBF OCCR LEN VALUE"); 
//  PERFORM VARYING 500-COMN-NDX FROM 1 BY 1 UNTIL 500-COMN-NDX > 500-COMN-TBL-ITEMS
          for (comnNdx500 = 1; (	( comnNdx500 <= work.getComnTblItems500() )) ; comnNdx500 = comnNdx500 + 1 ) {
//  SET 800-PTR-VAL TO 500-COMN-NDX
              workAreas800.setPtrVal800(comnNdx500); 
              
//  IF 500-COMN-TAG-LEN ( 500-COMN-NDX ) > 0
              if (	( comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagData500().getComnTagLen500() > 0 )) { 
//  DISPLAY ' ' 800-PTR-VAL ' ' 500-COMN-TAG-TYPE ( 500-COMN-NDX ) ' ' 500-COMN-TAG-NUM ( 500-COMN-NDX ) ' ' 500-COMN-TAG-SUBFLD-NO ( 500-COMN-NDX ) ' ' 500-COMN-TAG-OCCUR ( 500-COMN-NDX ) ' ' 500-COMN-TAG-LEN ( 500-COMN-NDX ) ' ' 500-COMN-TAG-VALUE ( 500-COMN-NDX ) (1 : 500-COMN-TAG-LEN ( 500-COMN-NDX ))
                  logger.info(" {} {} {} {} {} {} {}", String.valueOf(workAreas800.getPtrVal800()), new String(comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagKey500().getComnTagType500()), String.valueOf(comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagKey500().getComnTagNum500()), String.valueOf(comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagKey500().getComnTagSubfldNo500()), String.valueOf(comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagKey500().getComnTagOccur500()), String.valueOf(comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagData500().getComnTagLen500()), new String(substring(comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagData500().getComnTagValue500(),0,comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagData500().getComnTagLen500()))); 
              }
//  ELSE
              else { 
//  DISPLAY ' ' 800-PTR-VAL ' ' 500-COMN-TAG-TYPE ( 500-COMN-NDX ) ' ' 500-COMN-TAG-NUM ( 500-COMN-NDX ) ' ' 500-COMN-TAG-SUBFLD-NO ( 500-COMN-NDX ) ' ' 500-COMN-TAG-OCCUR ( 500-COMN-NDX ) ' ' 500-COMN-TAG-LEN ( 500-COMN-NDX ) ' ???'
                  logger.info(" {} {} {} {} {} {} ???", String.valueOf(workAreas800.getPtrVal800()), new String(comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagKey500().getComnTagType500()), String.valueOf(comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagKey500().getComnTagNum500()), String.valueOf(comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagKey500().getComnTagSubfldNo500()), String.valueOf(comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagKey500().getComnTagOccur500()), String.valueOf(comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagData500().getComnTagLen500())); 
              }
          }
//  DISPLAY '================================================'
          logger.info("================================================"); 
      
      }
      /**
      * getComnField 
      *   This method is derived from 
  *   COBOL Paragraph - 8500-GET-COMN-FIELD COBOL Cyclomatic complexity - 6
      * Input  :  

      * - comnSrchKeyFndSw500            COBOL Name: 500-COMN-SRCH-KEY-FND-SW
      * - comnNdx500                     COBOL Name: 500-COMN-NDX
      * - comnTagKey500                  COBOL Name: 500-COMN-TAG-KEY
      * - comnNdx2500                    COBOL Name: 500-COMN-NDX2
      * - comnTblItems500                COBOL Name: 500-COMN-TBL-ITEMS
      * - comnTagValue500                COBOL Name: 500-COMN-TAG-VALUE
      * - comnTagLen500                  COBOL Name: 500-COMN-TAG-LEN
      *
      * Output :  

      * - comnTblSrchKey500              COBOL Name: 500-COMN-TBL-SRCH-KEY
      * - fieldPtr800                    COBOL Name: 800-FIELD-PTR
      * - fieldLen800                    COBOL Name: 800-FIELD-LEN
      * - comnNdx2500                    COBOL Name: 500-COMN-NDX2
      * - fieldVal800                    COBOL Name: 800-FIELD-VAL
      * - comnTagValue500                COBOL Name: 500-COMN-TAG-VALUE
      *
      * @throws CFException
      */
      private void getComnField() throws Exception {
      
// * Field length is stored in 800-field-len
// ******************************************************************
//  PERFORM 8300-LOOKUP-COMN-FIELD
          lookupComnField();/*8300-LOOKUP-COMN-FIELD*/

// *    If data element has subfields; find first one
//  IF 500-COMN-SRCH-KEY-NOT-FND
          if ( work.isComnSrchKeyNotFnd500()  ) { 
//  MOVE '0001' TO 500-COMN-TBL-SRCH-KEY (6 : 4)
//  LITERAL_0001 = '0001'
              work.setComnTblSrchKey500(replace(work.getComnTblSrchKey500(),CONSTANTS.LITERAL_0001,5,9));
//  PERFORM 8300-LOOKUP-COMN-FIELD
              lookupComnField();/*8300-LOOKUP-COMN-FIELD*/
          }
//  IF 500-COMN-SRCH-KEY-FND
          if ( work.isComnSrchKeyFnd500()  ) { 
              // MOVE 1 TO 800-FIELD-PTR
              workAreas800.setFieldPtr800(1);
              // MOVE 0 TO 800-FIELD-LEN
              workAreas800.setFieldLen800(0);
//  PERFORM VARYING 500-COMN-NDX2 FROM 500-COMN-NDX BY 1 UNTIL 500-COMN-TAG-KEY ( 500-COMN-NDX2 ) (1 : 5) NOT EQUAL 500-COMN-TBL-SRCH-KEY (1 : 5) OR 500-COMN-NDX2 > 500-COMN-TBL-ITEMS
              for (comnNdx2500 = comnNdx500; (		compareChars(substring(comnElementsTable500.getComnTblEntry500(comnNdx2500 - 1).getComnTagKey500().toCharArray(),0,5),substring(work.getComnTblSrchKey500(),0,5)) == 0  && 	( comnNdx2500 <= work.getComnTblItems500() )) ; comnNdx2500 = comnNdx2500 + 1 ) {
//  MOVE 500-COMN-TAG-VALUE ( 500-COMN-NDX2 ) (1 : 500-COMN-TAG-LEN ( 500-COMN-NDX2 )) TO 800-FIELD-VAL ( 800-FIELD-PTR : 500-COMN-TAG-LEN ( 500-COMN-NDX2 ))
                  workAreas800.setFieldVal800(replace(workAreas800.getFieldVal800(),substring(comnElementsTable500.getComnTblEntry500(comnNdx2500 - 1).getComnTagData500().getComnTagValue500(),0,comnElementsTable500.getComnTblEntry500(comnNdx2500 - 1).getComnTagData500().getComnTagLen500()),(workAreas800.getFieldPtr800()-1), (comnElementsTable500.getComnTblEntry500(comnNdx2500 - 1).getComnTagData500().getComnTagLen500() + (workAreas800.getFieldPtr800() - 1)) ));
//  ADD 500-COMN-TAG-LEN ( 500-COMN-NDX2 ) TO 800-FIELD-PTR 800-FIELD-LEN
                  workAreas800.setFieldPtr800(workAreas800.getFieldPtr800()+comnElementsTable500.getComnTblEntry500(comnNdx2500 - 1).getComnTagData500().getComnTagLen500());
                  workAreas800.setFieldLen800(workAreas800.getFieldLen800()+comnElementsTable500.getComnTblEntry500(comnNdx2500 - 1).getComnTagData500().getComnTagLen500());
              }
          }
//  ELSE
          else { 
//  MOVE SPACES TO 800-FIELD-VAL
              workAreas800.setFieldVal800(CONSTANTS.SPACE_999);
              // MOVE 0 TO 800-FIELD-LEN
              workAreas800.setFieldLen800(0);
          }
      
      }
      /**
      * writeComn 
      *   This method is derived from 
  *   COBOL Paragraph - 8550-WRITE-COMN COBOL Cyclomatic complexity - 4
      * Input  :  

      * - writeXmlSw1000                 COBOL Name: 1000-WRITE-XML-SW
      * - writePsipmSw1000               COBOL Name: 1000-WRITE-PSIPM-SW
      * - writeIpmSw1000                 COBOL Name: 1000-WRITE-IPM-SW
      *
      * Output : None 

      * @throws CFException
      */
      private void writeComn() throws Exception {
			// Declare local variables used in the method
			ParmData1000 parmData1000 = parms1000.getParmData1000();
			// End of variable declaration

      
// ******************************************************************
// * Write message
// ******************************************************************
          parmData1000 = parms1000.getParmData1000();
//  IF 1000-WRITE-XML-MSGS
          if ( parmData1000.isWriteXmlMsgs1000()  ) { 
//  PERFORM 8600-WRITE-COMN-XML
              writeComnXml();/*8600-WRITE-COMN-XML*/
          }
  
          parmData1000 = parms1000.getParmData1000();
//  IF 1000-WRITE-PSIPM-MSGS
          if ( parmData1000.isWritePsipmMsgs1000()  ) { 
//  PERFORM 8700-WRITE-COMN-PSIPM
              writeComnPsipm();/*8700-WRITE-COMN-PSIPM*/
          }
  
          parmData1000 = parms1000.getParmData1000();
//  IF 1000-WRITE-IPM-MSGS
          if ( parmData1000.isWriteIpmMsgs1000()  ) { 
//  PERFORM 8800-WRITE-COMN-IPM
              writeComnIpm();/*8800-WRITE-COMN-IPM*/
          }
  
      
      }
      /**
      * writeComnXml 
      *   This method is derived from 
  *   COBOL Paragraph - 8600-WRITE-COMN-XML COBOL Cyclomatic complexity - 8
      * Input  :  

      * - fieldVal800                    COBOL Name: 800-FIELD-VAL
      * - indent800                      COBOL Name: 800-INDENT
      * - msgStrTag300                   COBOL Name: 300-MSG-STR-TAG
      * - comnTblItems500                COBOL Name: 500-COMN-TBL-ITEMS
      * - m300                           COBOL Name: 300-M
      * - d300                           COBOL Name: 300-D
      * - p300                           COBOL Name: 300-P
      * - comnTagType500                 COBOL Name: 500-COMN-TAG-TYPE
      * - abendCode3003009               COBOL Name: 300-3009-ABEND-CODE
      * - errorMsg6003009                COBOL Name: 600-3009-ERROR-MSG
      * - msgEndTag300                   COBOL Name: 300-MSG-END-TAG
      *
      * Output :  

      * - ilvl800                        COBOL Name: 800-ILVL
      * - sys101Rdw800                   COBOL Name: 800-SYS101-RDW
      * - comnTblSrchKey500              COBOL Name: 500-COMN-TBL-SRCH-KEY
      * - msgStrMti300                   COBOL Name: 300-MSG-STR-MTI
      * - fieldVal800                    COBOL Name: 800-FIELD-VAL
      * - sys101OutRec                   COBOL Name: SYS101-OUT-REC
      * - comnNdx500                     COBOL Name: 500-COMN-NDX
      * - tag6003009                     COBOL Name: 600-3009-TAG
      * - comnTagType500                 COBOL Name: 500-COMN-TAG-TYPE
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - abendCode3003009               COBOL Name: 300-3009-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - errorMsg6003009                COBOL Name: 600-3009-ERROR-MSG
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      *
      * @throws CFException
      */
      private void writeComnXml() throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			char[] p300 = null;
			Map<String,Object> updated = null;
			 final int MSG_END_TAG_300_LENGTH = 6;
			// End of variable declaration

      
// ******************************************************************
// * Write xml message
// ******************************************************************

// * Message header
//  SET 800-ILVL-1 TO TRUE
          workAreas800.setIlvl1800True(); 
          
          workAreas800.setSys101Rdw800((long)Math.abs(workAreas800.getIlvl800() + MsgStrTag300.getMsgStrTag300FieldLength()));
          // MOVE 'M000000000000' TO 500-COMN-TBL-SRCH-KEY
          //  LITERAL_M000000000000 = 'M000000000000'
          work.setComnTblSrchKey500(CONSTANTS.LITERAL_M000000000000);
//  PERFORM 8500-GET-COMN-FIELD
          getComnField();/*8500-GET-COMN-FIELD*/
//  MOVE 800-FIELD-VAL (1 : 800-FIELD-LEN ) TO 300-MSG-STR-MTI
          msgStrTag300.setMsgStrMti300(CFUtil.getInt(substring(workAreas800.getFieldVal800(),0,workAreas800.getFieldLen800())));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-MSG-STR-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
          charArray = new ArrayList<char[]>();
             charArray.add(substring(workAreas800.getIndent800(),0,workAreas800.getIlvl800()));
             charArray.add(msgStrTag300.toCharArray());
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
          updated = updateString(sys101OutRec.toCharArray() ,joinCharArray);
          sys101OutRec.setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
          writeSys101();/*2200-WRITE-SYS101*/

// * Message details
//  SET 500-COMN-NDX TO 1
          comnNdx500 = 1; 
          
//  PERFORM UNTIL 500-COMN-NDX > 500-COMN-TBL-ITEMS
          while ((	( comnNdx500 <= work.getComnTblItems500() ))) {
              p300 = work.getP300();
//  EVALUATE 500-COMN-TAG-TYPE ( 500-COMN-NDX )
              if  (		compareChars(comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagKey500().getComnTagType500(),work.getM300()) == 0 ) { 

// *            Skip tag since we already wrote message header
//  SET 500-COMN-NDX UP BY 1
                  comnNdx500++; 
                  
              }
              else if  (		compareChars(comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagKey500().getComnTagType500(),work.getD300()) == 0 ) { 
//  PERFORM 8610-PROCESS-COMN-DE
                  processComnDe();/*8610-PROCESS-COMN-DE*/
              }
              else if  (		compareChars(comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagKey500().getComnTagType500(),p300) == 0 ) { 
//  PERFORM 8620-PROCESS-COMN-PDS
                  processComnPds();/*8620-PROCESS-COMN-PDS*/
              }
              else   { 
//  MOVE 500-COMN-TAG-TYPE ( 500-COMN-NDX ) TO 600-3009-TAG
                  errorMsg6003009.setTag6003009(comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagKey500().getComnTagType500());
//  MOVE 300-3009-ABEND-CODE TO 900-ABEND-CODE
                  abendMessage900.setAbendCode900(String.valueOf(work.getAbendCode3003009String()).toCharArray());
                  // MOVE 600-3009-ERROR-MSG TO 900-ABEND-TEXT
                  abendMessage900.setAbendText900(errorMsg6003009.toCharArray());
//  MOVE '8600-WRITE-:T:-XML' TO 900-ABEND-PARA
                  abendParaName900.setAbendPara900(CONSTANTS.LITERAL_1572256913);
//  PERFORM 9100-ABEND-PROGRAM
                  abendProgram();/*9100-ABEND-PROGRAM*/
              }
  
          }

// * Message trailer
//  SET 800-ILVL-1 TO TRUE
          workAreas800.setIlvl1800True(); 
          
          workAreas800.setSys101Rdw800((long)Math.abs(workAreas800.getIlvl800() + MSG_END_TAG_300_LENGTH));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-MSG-END-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
          charArray = new ArrayList<char[]>();
             charArray.add(substring(workAreas800.getIndent800(),0,workAreas800.getIlvl800()));
             charArray.add(work.getMsgEndTag300());
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
          updated = updateString(sys101OutRec.toCharArray() ,joinCharArray);
          sys101OutRec.setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
          writeSys101();/*2200-WRITE-SYS101*/
          ;
      
      }
      /**
      * processComnDe 
      *   This method is derived from 
  *   COBOL Paragraph - 8610-PROCESS-COMN-DE COBOL Cyclomatic complexity - 6
      * Input  :  

      * - comnTagSubfldNo500             COBOL Name: 500-COMN-TAG-SUBFLD-NO
      * - comnNdx500                     COBOL Name: 500-COMN-NDX
      * - comnTagNum500                  COBOL Name: 500-COMN-TAG-NUM
      * - indent800                      COBOL Name: 800-INDENT
      * - deStrTag300                    COBOL Name: 300-DE-STR-TAG
      * - deEndTag300                    COBOL Name: 300-DE-END-TAG
      * - comnTagLen500                  COBOL Name: 500-COMN-TAG-LEN
      * - comnTagValue500                COBOL Name: 500-COMN-TAG-VALUE
      *
      * Output :  

      * - deStrCd300                     COBOL Name: 300-DE-STR-CD
      * - comnTagNum500                  COBOL Name: 500-COMN-TAG-NUM
      * - ilvl800                        COBOL Name: 800-ILVL
      * - sys101Rdw800                   COBOL Name: 800-SYS101-RDW
      * - sys101OutRec                   COBOL Name: SYS101-OUT-REC
      * - saveTagNum800                  COBOL Name: 800-SAVE-TAG-NUM
      * - comnNdx500                     COBOL Name: 500-COMN-NDX
      *
      * @throws CFException
      */
      private void processComnDe() throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			 final int DE_END_TAG_300_LENGTH = 5;
			// End of variable declaration

      
// ******************************************************************
// * Process de
// ******************************************************************
//  IF 500-COMN-TAG-SUBFLD-NO ( 500-COMN-NDX ) > 0
          if (	( comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagKey500().getComnTagSubfldNo500() > 0 )) { 
//  MOVE 500-COMN-TAG-NUM ( 500-COMN-NDX ) TO 300-DE-STR-CD
              deStrTag300.setDeStrCd300(comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagKey500().getComnTagNum500());
//  SET 800-ILVL-2 TO TRUE
              workAreas800.setIlvl2800True(); 
              
              workAreas800.setSys101Rdw800((long)Math.abs(workAreas800.getIlvl800() + DeStrTag300.getDeStrTag300FieldLength()));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-DE-STR-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(workAreas800.getIndent800(),0,workAreas800.getIlvl800()));
                 charArray.add(deStrTag300.toCharArray());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(sys101OutRec.toCharArray() ,joinCharArray);
              sys101OutRec.setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
              writeSys101();/*2200-WRITE-SYS101*/
//  MOVE 500-COMN-TAG-NUM ( 500-COMN-NDX ) TO 800-SAVE-TAG-NUM
              workAreas800.setSaveTagNum800(comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagKey500().getComnTagNum500());
//  PERFORM 8630-PROCESS-COMN-SUBFLD UNTIL 500-COMN-TAG-NUM ( 500-COMN-NDX ) NOT EQUAL 800-SAVE-TAG-NUM
              while (	( comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagKey500().getComnTagNum500() == workAreas800.getSaveTagNum800() )) {
                 processComnSubfld();/*8630-PROCESS-COMN-SUBFLD*/
              }
//  SET 800-ILVL-2 TO TRUE
              workAreas800.setIlvl2800True(); 
              
              workAreas800.setSys101Rdw800((long)Math.abs(workAreas800.getIlvl800() + DE_END_TAG_300_LENGTH));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-DE-END-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(workAreas800.getIndent800(),0,workAreas800.getIlvl800()));
                 charArray.add(work.getDeEndTag300());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(sys101OutRec.toCharArray() ,joinCharArray);
              sys101OutRec.setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
              writeSys101();/*2200-WRITE-SYS101*/
          }
//  ELSE
          else { 
//  MOVE 500-COMN-TAG-NUM ( 500-COMN-NDX ) TO 300-DE-STR-CD
              deStrTag300.setDeStrCd300(comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagKey500().getComnTagNum500());
//  SET 800-ILVL-2 TO TRUE
              workAreas800.setIlvl2800True(); 
              
              workAreas800.setSys101Rdw800((long)Math.abs(workAreas800.getIlvl800() + DeStrTag300.getDeStrTag300FieldLength() + comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagData500().getComnTagLen500() + DE_END_TAG_300_LENGTH));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-DE-STR-TAG 500-COMN-TAG-VALUE ( 500-COMN-NDX ) (1 : 500-COMN-TAG-LEN ( 500-COMN-NDX )) 300-DE-END-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(workAreas800.getIndent800(),0,workAreas800.getIlvl800()));
                 charArray.add(deStrTag300.toCharArray());
                 charArray.add(substring(comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagData500().getComnTagValue500(),0,comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagData500().getComnTagLen500()));
                 charArray.add(work.getDeEndTag300());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3));
              updated = updateString(sys101OutRec.toCharArray() ,joinCharArray);
              sys101OutRec.setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
              writeSys101();/*2200-WRITE-SYS101*/
//  SET 500-COMN-NDX UP BY 1
              comnNdx500++; 
              
          }
      
      }
      /**
      * processComnPds 
      *   This method is derived from 
  *   COBOL Paragraph - 8620-PROCESS-COMN-PDS COBOL Cyclomatic complexity - 6
      * Input  :  

      * - comnTagSubfldNo500             COBOL Name: 500-COMN-TAG-SUBFLD-NO
      * - comnNdx500                     COBOL Name: 500-COMN-NDX
      * - comnTagNum500                  COBOL Name: 500-COMN-TAG-NUM
      * - indent800                      COBOL Name: 800-INDENT
      * - pdsStrTag300                   COBOL Name: 300-PDS-STR-TAG
      * - pdsEndTag300                   COBOL Name: 300-PDS-END-TAG
      * - comnTagLen500                  COBOL Name: 500-COMN-TAG-LEN
      * - comnTagValue500                COBOL Name: 500-COMN-TAG-VALUE
      *
      * Output :  

      * - pdsStrCd300                    COBOL Name: 300-PDS-STR-CD
      * - comnTagNum500                  COBOL Name: 500-COMN-TAG-NUM
      * - ilvl800                        COBOL Name: 800-ILVL
      * - sys101Rdw800                   COBOL Name: 800-SYS101-RDW
      * - sys101OutRec                   COBOL Name: SYS101-OUT-REC
      * - saveTagNum800                  COBOL Name: 800-SAVE-TAG-NUM
      * - comnNdx500                     COBOL Name: 500-COMN-NDX
      *
      * @throws CFException
      */
      private void processComnPds() throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			 final int PDS_END_TAG_300_LENGTH = 6;
			// End of variable declaration

      
// ******************************************************************
// * Process pds
// ******************************************************************
//  IF 500-COMN-TAG-SUBFLD-NO ( 500-COMN-NDX ) > 0
          if (	( comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagKey500().getComnTagSubfldNo500() > 0 )) { 
//  MOVE 500-COMN-TAG-NUM ( 500-COMN-NDX ) TO 300-PDS-STR-CD
              pdsStrTag300.setPdsStrCd300(comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagKey500().getComnTagNum500());
//  SET 800-ILVL-2 TO TRUE
              workAreas800.setIlvl2800True(); 
              
              workAreas800.setSys101Rdw800((long)Math.abs(workAreas800.getIlvl800() + PdsStrTag300.getPdsStrTag300FieldLength()));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-PDS-STR-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(workAreas800.getIndent800(),0,workAreas800.getIlvl800()));
                 charArray.add(pdsStrTag300.toCharArray());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(sys101OutRec.toCharArray() ,joinCharArray);
              sys101OutRec.setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
              writeSys101();/*2200-WRITE-SYS101*/
//  MOVE 500-COMN-TAG-NUM ( 500-COMN-NDX ) TO 800-SAVE-TAG-NUM
              workAreas800.setSaveTagNum800(comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagKey500().getComnTagNum500());
//  PERFORM 8630-PROCESS-COMN-SUBFLD UNTIL 500-COMN-TAG-NUM ( 500-COMN-NDX ) NOT EQUAL 800-SAVE-TAG-NUM
              while (	( comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagKey500().getComnTagNum500() == workAreas800.getSaveTagNum800() )) {
                 processComnSubfld();/*8630-PROCESS-COMN-SUBFLD*/
              }
//  SET 800-ILVL-2 TO TRUE
              workAreas800.setIlvl2800True(); 
              
              workAreas800.setSys101Rdw800((long)Math.abs(workAreas800.getIlvl800() + PDS_END_TAG_300_LENGTH));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-PDS-END-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(workAreas800.getIndent800(),0,workAreas800.getIlvl800()));
                 charArray.add(work.getPdsEndTag300());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(sys101OutRec.toCharArray() ,joinCharArray);
              sys101OutRec.setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
              writeSys101();/*2200-WRITE-SYS101*/
          }
//  ELSE
          else { 
//  MOVE 500-COMN-TAG-NUM ( 500-COMN-NDX ) TO 300-PDS-STR-CD
              pdsStrTag300.setPdsStrCd300(comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagKey500().getComnTagNum500());
//  SET 800-ILVL-2 TO TRUE
              workAreas800.setIlvl2800True(); 
              
              workAreas800.setSys101Rdw800((long)Math.abs(workAreas800.getIlvl800() + PdsStrTag300.getPdsStrTag300FieldLength() + comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagData500().getComnTagLen500() + PDS_END_TAG_300_LENGTH));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-PDS-STR-TAG 500-COMN-TAG-VALUE ( 500-COMN-NDX ) (1 : 500-COMN-TAG-LEN ( 500-COMN-NDX )) 300-PDS-END-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(workAreas800.getIndent800(),0,workAreas800.getIlvl800()));
                 charArray.add(pdsStrTag300.toCharArray());
                 charArray.add(substring(comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagData500().getComnTagValue500(),0,comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagData500().getComnTagLen500()));
                 charArray.add(work.getPdsEndTag300());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3));
              updated = updateString(sys101OutRec.toCharArray() ,joinCharArray);
              sys101OutRec.setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
              writeSys101();/*2200-WRITE-SYS101*/
//  SET 500-COMN-NDX UP BY 1
              comnNdx500++; 
              
          }
      
      }
      /**
      * processComnSubfld 
      *   This method is derived from 
  *   COBOL Paragraph - 8630-PROCESS-COMN-SUBFLD COBOL Cyclomatic complexity - 4
      * Input  :  

      * - comnTagLen500                  COBOL Name: 500-COMN-TAG-LEN
      * - comnNdx500                     COBOL Name: 500-COMN-NDX
      * - indent800                      COBOL Name: 800-INDENT
      * - subfldTagStr300                COBOL Name: 300-SUBFLD-TAG-STR
      * - comnTagValue500                COBOL Name: 500-COMN-TAG-VALUE
      * - subfldTagEnd300                COBOL Name: 300-SUBFLD-TAG-END
      *
      * Output :  

      * - ilvl800                        COBOL Name: 800-ILVL
      * - sys101Rdw800                   COBOL Name: 800-SYS101-RDW
      * - sys101OutRec                   COBOL Name: SYS101-OUT-REC
      * - comnNdx500                     COBOL Name: 500-COMN-NDX
      *
      * @throws CFException
      */
      private void processComnSubfld() throws Exception {
			// Declare local variables used in the method
			 final int SUBFLD_TAG_STR_300_LENGTH = 3;
			 final int SUBFLD_TAG_END_300_LENGTH = 4;
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			// End of variable declaration

      
// ******************************************************************
// * Process subfields
// ******************************************************************
//  SET 800-ILVL-3 TO TRUE
          workAreas800.setIlvl3800True(); 
          
          workAreas800.setSys101Rdw800((long)Math.abs(workAreas800.getIlvl800() + SUBFLD_TAG_STR_300_LENGTH + comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagData500().getComnTagLen500() + SUBFLD_TAG_END_300_LENGTH));
//  IF 500-COMN-TAG-LEN ( 500-COMN-NDX ) > 0
          if (	( comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagData500().getComnTagLen500() > 0 )) { 
//  STRING 800-INDENT (1 : 800-ILVL ) 300-SUBFLD-TAG-STR 500-COMN-TAG-VALUE ( 500-COMN-NDX ) (1 : 500-COMN-TAG-LEN ( 500-COMN-NDX )) 300-SUBFLD-TAG-END DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(workAreas800.getIndent800(),0,workAreas800.getIlvl800()));
                 charArray.add(work.getSubfldTagStr300());
                 charArray.add(substring(comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagData500().getComnTagValue500(),0,comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagData500().getComnTagLen500()));
                 charArray.add(work.getSubfldTagEnd300());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3));
              updated = updateString(sys101OutRec.toCharArray() ,joinCharArray);
              sys101OutRec.setString(  (char[])updated.get("string"));
          }
//  ELSE
          else { 
//  STRING 800-INDENT (1 : 800-ILVL ) 300-SUBFLD-TAG-STR 300-SUBFLD-TAG-END DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(workAreas800.getIndent800(),0,workAreas800.getIlvl800()));
                 charArray.add(work.getSubfldTagStr300());
                 charArray.add(work.getSubfldTagEnd300());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2));
              updated = updateString(sys101OutRec.toCharArray() ,joinCharArray);
              sys101OutRec.setString(  (char[])updated.get("string"));
          }
//  PERFORM 2200-WRITE-SYS101
          writeSys101();/*2200-WRITE-SYS101*/
//  SET 500-COMN-NDX UP BY 1
          comnNdx500++; 
          
      
      }
      /**
      * writeComnPsipm 
      *   This method is derived from 
  *   COBOL Paragraph - 8700-WRITE-COMN-PSIPM COBOL Cyclomatic complexity - 9
      * Input  :  

      * - comnNdx500                     COBOL Name: 500-COMN-NDX
      * - comnTblItems500                COBOL Name: 500-COMN-TBL-ITEMS
      * - comnTagNum500                  COBOL Name: 500-COMN-TAG-NUM
      * - comnTagOccur500                COBOL Name: 500-COMN-TAG-OCCUR
      * - comnTagSubfldNo500             COBOL Name: 500-COMN-TAG-SUBFLD-NO
      * - comnTagLen500                  COBOL Name: 500-COMN-TAG-LEN
      * - comnTagValue500                COBOL Name: 500-COMN-TAG-VALUE
      * - tag800                         COBOL Name: 800-TAG
      *
      * Output :  

      * - ip66601UserT                   COBOL Name: IP66601-USER-T
      * - ip66601UserTcnt                COBOL Name: IP66601-USER-TCNT
      * - fldStrt800                     COBOL Name: 800-FLD-STRT
      * - comnNdx500                     COBOL Name: 500-COMN-NDX
      * - ip66601UserTagType             COBOL Name: IP66601-USER-TAG-TYPE
      * - ip66601UserTagNo               COBOL Name: IP66601-USER-TAG-NO
      * - comnTagNum500                  COBOL Name: 500-COMN-TAG-NUM
      * - ip66601UserTagOccurrence       COBOL Name: IP66601-USER-TAG-OCCURRENCE
      * - comnTagOccur500                COBOL Name: 500-COMN-TAG-OCCUR
      * - ip66601UserTagSubfldNo         COBOL Name: IP66601-USER-TAG-SUBFLD-NO
      * - comnTagSubfldNo500             COBOL Name: 500-COMN-TAG-SUBFLD-NO
      * - ip66601UserTagStart            COBOL Name: IP66601-USER-TAG-START
      * - ip66601UserTagLngth            COBOL Name: IP66601-USER-TAG-LNGTH
      * - comnTagLen500                  COBOL Name: 500-COMN-TAG-LEN
      * - ip66102NormalIpmMsg            COBOL Name: IP66102-NORMAL-IPM-MSG
      * - comnTagValue500                COBOL Name: 500-COMN-TAG-VALUE
      * - sys201Rdw800                   COBOL Name: 800-SYS201-RDW
      * - tagTblPtr800                   COBOL Name: 800-TAG-TBL-PTR
      * - sys201OutRec                   COBOL Name: SYS201-OUT-REC
      * - tagType800                     COBOL Name: 800-TAG-TYPE
      * - tagNum800                      COBOL Name: 800-TAG-NUM
      * - tagOccur800                    COBOL Name: 800-TAG-OCCUR
      * - tagSubfldNo800                 COBOL Name: 800-TAG-SUBFLD-NO
      * - tagStart800                    COBOL Name: 800-TAG-START
      * - tagLngth800                    COBOL Name: 800-TAG-LNGTH
      * - tag800                         COBOL Name: 800-TAG
      *
      * @throws CFException
      */
      private void writeComnPsipm() throws Exception {
			// Declare local variables used in the method
			Tag800 tag800 = workAreas800.getTag800();
			// End of variable declaration

      
// ******************************************************************
// * Write pseudo ipm message
// ******************************************************************
//  SET IP66601-USER-T TO 1
          ip66601UserT = 1; 
          
//  MOVE 1 TO IP66601-USER-TCNT 800-FLD-STRT
          ip66601UserTagInformation.setIp66601UserTcnt((short)1);
          workAreas800.setFldStrt800((long)1);

// *    Write element tags to user tag table
//  PERFORM VARYING 500-COMN-NDX FROM 1 BY 1 UNTIL 500-COMN-NDX > 500-COMN-TBL-ITEMS
          for (comnNdx500 = 1; (	( comnNdx500 <= work.getComnTblItems500() )) ; comnNdx500 = comnNdx500 + 1 ) {
//  SET IP66601-USER-T TO 500-COMN-NDX
              ip66601UserT = comnNdx500; 
              
//  EVALUATE 500-COMN-TAG-TYPE ( 500-COMN-NDX )
              switch(new String(comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagKey500().getComnTagType500())){
              	case "M":
//  SET IP66601-USER-MTI-TAG ( IP66601-USER-T ) TO TRUE
                  ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserMtiTagTrue(); 
                  
              break;
              	case "D":
//  SET IP66601-USER-DE-TAG ( IP66601-USER-T ) TO TRUE
                  ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserDeTagTrue(); 
                  
              break;
              	case "P":
//  SET IP66601-USER-PDS-TAG ( IP66601-USER-T ) TO TRUE
                  ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserPdsTagTrue(); 
                  
              break;
              }
//  MOVE 500-COMN-TAG-NUM ( 500-COMN-NDX ) TO IP66601-USER-TAG-NO ( IP66601-USER-T )
              ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagNo((short) comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagKey500().getComnTagNum500());
//  MOVE 500-COMN-TAG-OCCUR ( 500-COMN-NDX ) TO IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-T )
              ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().setIp66601UserTagOccurrence((short) comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagKey500().getComnTagOccur500());
//  MOVE 500-COMN-TAG-SUBFLD-NO ( 500-COMN-NDX ) TO IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-T )
              ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().setIp66601UserTagSubfldNo((short) comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagKey500().getComnTagSubfldNo500());
//  MOVE 800-FLD-STRT TO IP66601-USER-TAG-START ( IP66601-USER-T )
              ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).setIp66601UserTagStart((short) workAreas800.getFldStrt800());
//  MOVE 500-COMN-TAG-LEN ( 500-COMN-NDX ) TO IP66601-USER-TAG-LNGTH ( IP66601-USER-T )
              ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).setIp66601UserTagLngth((short) comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagData500().getComnTagLen500());

// *    Write element content to message string
//  IF 500-COMN-TAG-LEN ( 500-COMN-NDX ) > 0
              if (	( comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagData500().getComnTagLen500() > 0 )) { 
//  MOVE 500-COMN-TAG-VALUE ( 500-COMN-NDX ) (1 : 500-COMN-TAG-LEN ( 500-COMN-NDX )) TO IP66102-NORMAL-IPM-MSG ( 800-FLD-STRT : IP66601-USER-TAG-LNGTH ( IP66601-USER-T ))
                  ip66102IpmMsg.setIp66102NormalIpmMsg(replace(ip66102IpmMsg.getIp66102NormalIpmMsg().toCharArray(),substring(comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagData500().getComnTagValue500(),0,comnElementsTable500.getComnTblEntry500(comnNdx500 - 1).getComnTagData500().getComnTagLen500()),((int) workAreas800.getFldStrt800()-1), (ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagLngth() + ((int) workAreas800.getFldStrt800() - 1)) ));
              }
//  ADD IP66601-USER-TAG-LNGTH ( IP66601-USER-T ) TO 800-FLD-STRT
              workAreas800.setFldStrt800(workAreas800.getFldStrt800()+(short) ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagLngth());
          }

// *    Set ip66601-user-t     down by 1
//  SET IP66601-USER-TCNT TO IP66601-USER-T
          ip66601UserTagInformation.setIp66601UserTcnt((short) ip66601UserT); 
          
          workAreas800.setSys201Rdw800((long) (Math.abs(5 + workAreas800.getFldStrt800() - 1 +  ( 24 * ip66601UserTagInformation.getIp66601UserTcnt() ) )));
          workAreas800.setTagTblPtr800((long) (Math.abs(5 + workAreas800.getFldStrt800())));

// *    Write tag table pointer to sys201 record

// *    Write message string to sys201 record
//  MOVE 800-TAG-TBL-PTR TO SYS201-OUT-REC (1 : 5)
          sys201OutRec.replace(String.valueOf(workAreas800.getTagTblPtr800String()).toCharArray(),0,String.valueOf(workAreas800.getTagTblPtr800String()).length(),0,5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE IP66102-NORMAL-IPM-MSG (1 : 800-FLD-STRT ) TO SYS201-OUT-REC (6 : 800-FLD-STRT )
          sys201OutRec.replace(ip66102IpmMsg/*parent*/,0/*fromOffset - (sys201OutRec) */,(int) workAreas800.getFldStrt800()/*fromLen*/,0+6 - 1/*toOffset - (ip66102NormalIpmMsg) */,(int) workAreas800.getFldStrt800()/*toLen*/);
          // MOVE 800-TAG-TBL-PTR TO 800-FLD-STRT
          workAreas800.setFldStrt800(workAreas800.getTagTblPtr800());

// *    Write tag table to sys201 record
//  PERFORM VARYING IP66601-USER-T FROM 1 BY 1 UNTIL IP66601-USER-T > IP66601-USER-TCNT
          for (ip66601UserT = 1; (	( ip66601UserT <= ip66601UserTagInformation.getIp66601UserTcnt() ) ) ; ip66601UserT = ip66601UserT + 1 ) {
//  MOVE IP66601-USER-TAG-TYPE ( IP66601-USER-T ) TO 800-TAG-TYPE
              tag800.setTagType800(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagType());
  
//  MOVE IP66601-USER-TAG-NO ( IP66601-USER-T ) TO 800-TAG-NUM
              tag800.setTagNum800(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagNo());
  
//  MOVE IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-T ) TO 800-TAG-OCCUR
              tag800.setTagOccur800(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserTagOccurrence());
  
//  MOVE IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-T ) TO 800-TAG-SUBFLD-NO
              tag800.setTagSubfldNo800(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserTagSubfldNo());
  
//  MOVE IP66601-USER-TAG-START ( IP66601-USER-T ) TO 800-TAG-START
              tag800.setTagStart800(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagStart());
  
//  MOVE IP66601-USER-TAG-LNGTH ( IP66601-USER-T ) TO 800-TAG-LNGTH
              tag800.setTagLngth800(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagLngth());
  
//  MOVE 800-TAG (1 : 24) TO SYS201-OUT-REC ( 800-FLD-STRT : 24)
              sys201OutRec.replace(workAreas800/*parent*/,0/*fromOffset - (sys201OutRec) */,24/*fromLen*/,0+(int) workAreas800.getFldStrt800() - 1/*toOffset - (tag800) */,24/*toLen*/);
//  ADD 24 TO 800-FLD-STRT
              workAreas800.setFldStrt800(workAreas800.getFldStrt800()+(long)24);
          }
//  PERFORM 3110-WRITE-SYS201
          writeSys201();/*3110-WRITE-SYS201*/
          ;
      
      }
      /**
      * writeComnIpm 
      *   This method is derived from 
  *   COBOL Paragraph - 8800-WRITE-COMN-IPM COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      private void writeComnIpm() throws Exception {
      
// ******************************************************************
// * Write ipm message
// ******************************************************************
//  CALL 800-PTR-IP666010
          // CALL 800-PTR-IP666010
          	this.setRc( ip666010.process());
      
      }
      /**
      * callDateRoutine 
      *   This method is derived from 
  *   COBOL Paragraph - 8800-CALL-DATE-ROUTINE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - abendCode3003014               COBOL Name: 300-3014-ABEND-CODE
      * - errorMsg6003014                COBOL Name: 600-3014-ERROR-MSG
      * - para8800300                    COBOL Name: 300-PARA-8800
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      * - rtnCd6003014                   COBOL Name: 600-3014-RTN-CD
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - abendCode3003014               COBOL Name: 300-3014-ABEND-CODE
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - errorMsg6003014                COBOL Name: 600-3014-ERROR-MSG
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para8800300                    COBOL Name: 300-PARA-8800
      *
      * @throws CFException
      */
      private void callDateRoutine() throws Exception {
      
// ******************************************************************
// * Call date conversion routine
// ******************************************************************
//  CALL 800-PTR-IP670010
          // CALL 800-PTR-IP670010
          	this.setRc( ip670010.process());
//  IF RETURN-CODE IS ZERO
//  ELSE
          if (        ( getRc() != 0 )) { 
//  MOVE RETURN-CODE TO 600-3014-RTN-CD
              errorMsg6003014.setRtnCd6003014(String.valueOf(CFUtil.pad(4,String.valueOf(getRc()),"0",CFUtil.LEFT_PAD)).toCharArray());
//  MOVE 300-3014-ABEND-CODE TO 900-ABEND-CODE
              abendMessage900.setAbendCode900(String.valueOf(work.getAbendCode3003014String()).toCharArray());
              // MOVE 600-3014-ERROR-MSG TO 900-ABEND-TEXT
              abendMessage900.setAbendText900(errorMsg6003014.toCharArray());
//  MOVE 300-PARA-8800 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara8800300());
          }
      
      }
      /**
      * abendProgram 
      *   This method is derived from 
  *   COBOL Paragraph - 9100-ABEND-PROGRAM COBOL Cyclomatic complexity - 2
      * Input  :  

      * - abendParaName900               COBOL Name: 900-ABEND-PARA-NAME
      * - abendMessage900                COBOL Name: 900-ABEND-MESSAGE
      * - pgmIp610010300                 COBOL Name: 300-PGM-IP610010
      *
      * Output :  

      * - ptrAbend800                    COBOL Name: 800-PTR-ABEND
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      private void abendProgram() throws Exception {
      
// ******************************************************************
// * Abend routine
// ******************************************************************
//  DISPLAY '***********************************'
          logger.info("***********************************"); 
//  DISPLAY 'A B E N D   A B E N D   A B E N D  '
          logger.info("A B E N D   A B E N D   A B E N D  "); 
//  DISPLAY 'A B E N D   I P 9 8 9 0 1 0        '
          logger.info("A B E N D   I P 9 8 9 0 1 0        "); 
//  DISPLAY '***********************************'
          logger.info("***********************************"); 
//  DISPLAY 900-ABEND-PARA-NAME
          logger.info(abendParaName900.toString()); 
//  DISPLAY 900-ABEND-MESSAGE
          logger.info(abendMessage900.toString()); 
//  SET 800-PTR-ABEND TO ENTRY 300-PGM-IP610010
          work.setPtrAbend800(work.getPgmIp610010300()); 
          
//  CALL 800-PTR-ABEND
          // CALL 800-PTR-ABEND
          	this.setRc( ip610010.process());
      
      }
      /**
      * dumpTagTable 
      *   This method is derived from 
  *   COBOL Paragraph - 9200-DUMP-TAG-TABLE COBOL Cyclomatic complexity - 5
      * Input  :  

      * - ip66601UserT                   COBOL Name: IP66601-USER-T
      * - ip66601UserP                   COBOL Name: IP66601-USER-P
      * - ip66601UserTagStart            COBOL Name: IP66601-USER-TAG-START
      * - ip66601UserTagType             COBOL Name: IP66601-USER-TAG-TYPE
      * - ip66601UserTagNo               COBOL Name: IP66601-USER-TAG-NO
      * - ip66601UserTagOccurrence       COBOL Name: IP66601-USER-TAG-OCCURRENCE
      * - ip66601UserTagSubfldNo         COBOL Name: IP66601-USER-TAG-SUBFLD-NO
      * - ip66601UserTagLngth            COBOL Name: IP66601-USER-TAG-LNGTH
      * - ip66102NormalIpmMsg            COBOL Name: IP66102-NORMAL-IPM-MSG
      *
      * Output :  

      * - ip66601UserP                   COBOL Name: IP66601-USER-P
      * - ptrVal800                      COBOL Name: 800-PTR-VAL
      *
      * @throws CFException
      */
      private void dumpTagTable() throws Exception {
			// Declare local variables used in the method
			Ip66601UserTagTable ip66601UserTagTable = ip66601UserTagInformation.getIp66601UserTagTable();
			// End of variable declaration

      
// ******************************************************************
// * Dump tag table
// ******************************************************************
//  IF IP66601-USER-T > 0
          if (	( ip66601UserT > 0 )) { 
//  DISPLAY '================================================'
              logger.info("================================================"); 
//  DISPLAY '=                 TAG TABLE                    ='
              logger.info("=                 TAG TABLE                    ="); 
//  DISPLAY '================================================'
              logger.info("================================================"); 
//  DISPLAY '   TAG#  ' ' TYPE' ' CODE' ' OCCR' ' SUBF' ' STRT' ' LENG' ' VALUE'
              logger.info("   TAG#   TYPE CODE OCCR SUBF STRT LENG VALUE"); 
//  PERFORM VARYING IP66601-USER-P FROM 1 BY 1 UNTIL IP66601-USER-P = IP66601-USER-T
              for (ip66601UserP = 1; (	( ip66601UserP != ip66601UserT )) ; ip66601UserP = ip66601UserP + 1 ) {
//  SET 800-PTR-VAL TO IP66601-USER-P
                  workAreas800.setPtrVal800(ip66601UserP); 
                  
//  IF IP66601-USER-TAG-START ( IP66601-USER-P ) > 0
                  if (	( ip66601UserTagTable.getIp66601UserTag(ip66601UserP - 1).getIp66601UserTagStart() > 0 ) ) { 
//  DISPLAY ' ' 800-PTR-VAL ' ' IP66601-USER-TAG-TYPE ( IP66601-USER-P ) ' ' IP66601-USER-TAG-NO ( IP66601-USER-P ) ' ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-P ) ' ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-P ) ' ' IP66601-USER-TAG-START ( IP66601-USER-P ) ' ' IP66601-USER-TAG-LNGTH ( IP66601-USER-P ) ' ' IP66102-NORMAL-IPM-MSG ( IP66601-USER-TAG-START ( IP66601-USER-P ) : IP66601-USER-TAG-LNGTH ( IP66601-USER-P ))
                      logger.info(" {} {} {} {} {} {} {} {}", String.valueOf(workAreas800.getPtrVal800()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserP - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagType()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserP - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserP - 1).getIp66601UserTagId().getIp66601UserTagOccurrence()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserP - 1).getIp66601UserTagId().getIp66601UserTagSubfldNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserP - 1).getIp66601UserTagStart()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserP - 1).getIp66601UserTagLngth()), new String(substring(ip66102IpmMsg.getIp66102NormalIpmMsg().toCharArray(),(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserP - 1).getIp66601UserTagStart()-1), (ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserP - 1).getIp66601UserTagLngth() + (ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserP - 1).getIp66601UserTagStart() - 1)) ))); 
                  }
  
//  ELSE
                  else { 
//  DISPLAY ' ' 800-PTR-VAL ' ' IP66601-USER-TAG-TYPE ( IP66601-USER-P ) ' ' IP66601-USER-TAG-NO ( IP66601-USER-P ) ' ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-P ) ' ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-P ) ' ' IP66601-USER-TAG-START ( IP66601-USER-P ) ' ' IP66601-USER-TAG-LNGTH ( IP66601-USER-P ) ' ' '???'
                      logger.info(" {} {} {} {} {} {} {} ???", String.valueOf(workAreas800.getPtrVal800()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserP - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagType()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserP - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserP - 1).getIp66601UserTagId().getIp66601UserTagOccurrence()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserP - 1).getIp66601UserTagId().getIp66601UserTagSubfldNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserP - 1).getIp66601UserTagStart()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserP - 1).getIp66601UserTagLngth())); 
                  }
              }
//  DISPLAY '================================================'
              logger.info("================================================"); 
          }
//  ELSE
          else { 
//  DISPLAY 'TAG TABLE IS EMPTY'
              logger.info("TAG TABLE IS EMPTY"); 
          }
      
      }
      /**
      * dumpMsgString 
      *   This method is derived from 
  *   COBOL Paragraph - 9300-DUMP-MSG-STRING COBOL Cyclomatic complexity - 1
      * Input  :  

      * - ip66102NormalIpmMsg            COBOL Name: IP66102-NORMAL-IPM-MSG
      *
      * Output : None 

      * @throws CFException
      */
      private void dumpMsgString() throws Exception {
      
// ******************************************************************
// * Dump message string
// ******************************************************************
//  DISPLAY 'MESSAGE STRING:' IP66102-NORMAL-IPM-MSG (1 : IP66102-IPM-MSG-LNGTH )
          logger.info("MESSAGE STRING:{}", new String(substring(ip66102IpmMsg.getIp66102NormalIpmMsg().toCharArray(),0,(int) ip66102IpmFileInformation.getIp66102IpmMsgLngth()))); 
      
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
      
      
  
  
  
  
  
  }
