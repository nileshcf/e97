  package com.cloudframe.app.process.impl;
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
  import com.cloudframe.app.ip989010.Ip989010Ctx.*;
  import com.cloudframe.app.ip989010.Ip989010Ctx;
  import com.cloudframe.app.process.Ip989010;
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
  import org.springframework.beans.factory.annotation.Value;
  import com.cloudframe.app.process.Ip996010;
  import com.cloudframe.app.process.*;
  import com.cloudframe.app.data.Field;
  import java.util.Random;
  import java.math.BigDecimal;
  import com.cloudframe.app.process.Ip280010;
  import java.util.ArrayList;
  import java.util.Map;
  import java.util.HashMap;
  import com.cloudframe.app.process.Ip666010;
  import com.cloudframe.app.process.Ip670010;
  import com.cloudframe.app.process.Ip610010;
  import com.cloudframe.app.dto.ProgramContext;
  import com.cloudframe.app.ip989010.dto.*;
  import com.cloudframe.app.ip989010.dto.Parms1000;
  import com.cloudframe.app.ip989010.dto.WorkAreas800;
  import com.cloudframe.app.ip989010.dto.ErrorMsg6003004;
  import com.cloudframe.app.ip989010.dto.Ip98901PaymentFileData;
  import com.cloudframe.app.ip989010.file.records.Sys005InRec;
  import com.cloudframe.app.ip989010.file.records.Sys001InRec;
  import com.cloudframe.app.ip989010.file.records.Sys002InRec;
  import com.cloudframe.app.ip989010.dto.AbendMessage900;
  import com.cloudframe.app.ip989010.dto.MsgStrTag300;
  import com.cloudframe.app.ip989010.dto.PdsStrTag300;
  import com.cloudframe.app.ip989010.dto.Sys005Table502;
  import com.cloudframe.app.ip989010.file.records.Sys205OutRec;
  import com.cloudframe.app.ip989010.file.records.Sys003InRec;
  import com.cloudframe.app.ip989010.file.records.Sys202OutRec;
  import com.cloudframe.app.ip989010.dto.AbendParaName900;
  import com.cloudframe.app.ip989010.dto.DeStrTag300;
  import com.cloudframe.app.ip989010.dto.Ip16911RewardFileIdRecord;
  import com.cloudframe.app.ip989010.dto.Sys002Table500;
  import com.cloudframe.app.ip989010.dto.DetailText600;
  import com.cloudframe.app.ip989010.file.records.Sys101OutRec;
  import com.cloudframe.app.ip989010.dto.ErrorMsg6003008;
  import com.cloudframe.app.ip989010.dto.TotalRecsReadMsg600;
  import com.cloudframe.app.ip989010.dto.ErrorMsg6003014;
  import com.cloudframe.app.ip989010.dto.ErrorMsg6003005;
  import com.cloudframe.app.ip989010.dto.ErrorMsg6003006;
  import com.cloudframe.app.ip989010.file.records.Sys004InRec;
  import com.cloudframe.app.ip989010.dto.Ip9890hPaymentFileData;
  import com.cloudframe.app.ip989010.dto.Ip98902RegistrationFileData;
  import com.cloudframe.app.ip989010.dto.TotalRecsWrittenMsg600;
  import com.cloudframe.app.ip989010.dto.ErrorMsg6003002;
  import com.cloudframe.app.ip989010.file.records.Sys204OutRec;
  import com.cloudframe.app.ip989010.file.records.Sys201OutRec;
  import com.cloudframe.app.ip989010.dto.ErrorMsg6003009;
  import com.cloudframe.app.ip989010.dto.ErrorMsg6003003;
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
  
  public class Ip989010Impl extends CommonProcess implements Ip989010 {
  
  Logger logger = LoggerFactory.getLogger(Ip989010Impl.class);
  
  
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
  
  
  
  
  
  
      @Override
      public int setParameter(Ip989010Ctx programCtx, String parms1000) throws Exception {
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
      public int process(Ip989010Ctx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
ProcessInCtx methodIn = programCtx.getProcessInCtx();
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
      
       return programCtx.getRc(); // Exit with return code
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
      @Override
      public MainlineOutCtx mainline(MainlineInCtx methodIn) throws Exception {
      
// ******************************************************************
// * Mainline
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
MainlineOutCtx methodOut = methodIn.getMainlineOutCtx();
//  PERFORM 1000-INITIALIZE
          initialize(programCtx.getInitializeInCtx());/*1000-INITIALIZE*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }
//  PERFORM 2000-PROCESS
          process2000(programCtx.getProcess2000InCtx());/*2000-PROCESS*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }
//  PERFORM 3000-WRAP-UP
          wrapUp(programCtx.getWrapUpInCtx());/*3000-WRAP-UP*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }
//  IF 400-SYS205-RECS-WRIT GREATER THAN ZEROES
          if (	( methodIn.getSys205RecsWrit400() > 0 )) { 
//  MOVE '0005' TO RETURN-CODE
              programCtx.setRc(5);
          }
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return methodOut;
      
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
      @Override
      public InitializeOutCtx initialize(InitializeInCtx methodIn) throws Exception {
      
// ******************************************************************
// * Initialize
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
InitializeOutCtx methodOut = methodIn.getInitializeOutCtx();
//  IF 100-FIRST-TIME
          if ( methodIn.isFirstTime100()  ) { 
//  PERFORM 1100-STARTUP-MESSAGES
              startupMessages(programCtx.getStartupMessagesInCtx());/*1100-STARTUP-MESSAGES*/
//  PERFORM 1150-VALIDATE-PARMS
              validateParms(programCtx.getValidateParmsInCtx());/*1150-VALIDATE-PARMS*/
//  PERFORM 1200-OPEN-FILES
              openFiles(programCtx.getOpenFilesInCtx());/*1200-OPEN-FILES*/
//  PERFORM 1300-INIT-TEMPLATES
              initTemplates(programCtx.getInitTemplatesInCtx());/*1300-INIT-TEMPLATES*/
//  PERFORM 1500-LOAD-REGISTRATION-FILE
              loadRegistrationFile(programCtx.getLoadRegistrationFileInCtx());/*1500-LOAD-REGISTRATION-FILE*/
//  PERFORM 1600-LOAD-BRANDPRD-IRD-FILE
              loadBrandprdIrdFile(programCtx.getLoadBrandprdIrdFileInCtx());/*1600-LOAD-BRANDPRD-IRD-FILE*/
//  SET 800-PTR-IP169410 TO ENTRY 300-PGM-IP169410
              methodOut.setPtrIp169410800(methodIn.getPgmIp169410300()); 
              
//  SET 800-PTR-IP280010 TO ENTRY 300-PGM-IP280010
              methodOut.setPtrIp280010800(methodIn.getPgmIp280010300()); 
              
//  SET 800-PTR-IP666010 TO ENTRY 300-PGM-IP666010
              methodOut.setPtrIp666010800(methodIn.getPgmIp666010300()); 
              
//  SET 800-PTR-IP666030 TO ENTRY 300-PGM-IP666030
              methodOut.setPtrIp666030800(methodIn.getPgmIp666030300()); 
              
//  SET 800-PTR-IP670010 TO ENTRY 300-PGM-IP670010
              methodOut.setPtrIp670010800(methodIn.getPgmIp670010300()); 
              
//  SET 100-NOT-FIRST-TIME TO TRUE
              methodOut.setNotFirstTime100True(); 
              
          }
//  SET IP66601-USER-T TO 1
          methodOut.setIp66601UserT(1); 
          
//  MOVE 0 TO IP66102-IPM-MSG-LNGTH
          methodOut.setIp66102IpmMsgLngth((long)0);
          // MOVE ZERO TO 800-FLD-STRT
          methodOut.setFldStrt800(0);
      
      return methodOut;
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
      @Override
      public StartupMessagesOutCtx startupMessages(StartupMessagesInCtx methodIn) throws Exception {
      
// ******************************************************************
// * Display startup messages
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
StartupMessagesOutCtx methodOut = methodIn.getStartupMessagesOutCtx();
//  MOVE 300-PGM-IP989010 TO IP996011-PGM-ID
          methodOut.setIp996011PgmId(methodOut.getPgmIp989010300());
//  MOVE 300-PGM-VERSION TO IP996011-PGM-VERSION
          methodOut.setIp996011PgmVersion(methodOut.getPgmVersion300());
          // MOVE WHEN-COMPILED TO IP996011-WHEN-COMPILED
          //  FORMAT1311677340 = "X(08)BX(08)"
          methodOut.setIp996011WhenCompiled(CFUtil.cobolAnEditFormatter(CONSTANTS.FORMAT1311677340,CONSTANTS.LITERAL_545580847));
//  MOVE FUNCTION CURRENT-DATE TO 800-CURRENT-DATE
          methodOut.getCurrentDate800().setString( substring(CFUtil.getCurrentDate(timeZoneId),0,8));
//  SET 800-PTR-IP996010 TO ENTRY 300-PGM-IP996010
          methodOut.setPtrIp996010800(methodIn.getPgmIp996010300()); 
          
//  SET 501-DISPLAY-IDX TO 1
          methodOut.setDisplayIdx501(1); 
          
//  MOVE ZEROES TO 501-ROW-COUNT
          methodOut.setRowCount501(0);
//  CALL 800-PTR-IP996010
          // CALL 800-PTR-IP996010
          	programCtx.setRc( ip996010.process(programCtx.getGlobalCtx().getContext("IP996010")));
      
      return methodOut;
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
      @Override
      public ValidateParmsOutCtx validateParms(ValidateParmsInCtx methodIn) throws Exception {
      
// ******************************************************************
// * Validate program parametes
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
ValidateParmsOutCtx methodOut = methodIn.getValidateParmsOutCtx();
//  IF 1000-PARM-LENGTH NOT EQUAL 04
          if (	( methodIn.getParmLength1000() != 4 ) ) { 
//  MOVE 300-3015-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(String.valueOf(methodOut.getAbendCode3003015String()).toCharArray());
//  MOVE 600-3015-ERROR-MSG TO 900-ABEND-TEXT
              methodOut.setAbendText900(pad(99,methodOut.getErrorMsg6003015(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-1150 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara1150300());
//  PERFORM 9100-ABEND-PROGRAM
              abendProgram(programCtx.getAbendProgramInCtx());/*9100-ABEND-PROGRAM*/
          }
//  IF 1000-PARM1-VALID AND 1000-PARM2-VALID AND 1000-PARM3-VALID AND 1000-PARM4-VALID
//  ELSE
          if (!(methodIn.isParm1Valid1000())  || !(methodIn.isParm2Valid1000())  || !(methodIn.isParm3Valid1000())  || !(methodIn.isParm4Valid1000()) ) { 
//  MOVE 300-3015-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(String.valueOf(methodOut.getAbendCode3003015String()).toCharArray());
//  MOVE 600-3015-ERROR-MSG TO 900-ABEND-TEXT
              methodOut.setAbendText900(pad(99,methodOut.getErrorMsg6003015(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-1150 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara1150300());
//  PERFORM 9100-ABEND-PROGRAM
              abendProgram(programCtx.getAbendProgramInCtx());/*9100-ABEND-PROGRAM*/
          }
      
      return methodOut;
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
      @Override
      public OpenFilesOutCtx openFiles(OpenFilesInCtx methodIn) throws Exception {
      
// ******************************************************************
// * Open files
// ******************************************************************

// * Sys001
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
OpenFilesOutCtx methodOut = methodIn.getOpenFilesOutCtx();
//  OPEN INPUT SYS001-IN
          sys001In.open(new String(CONSTANTS.MODE_READ_ONLY_36242),sys001In.getFileName(),sys001In.getSys001InCharSet(),sys001In.getSys001InCrlfFlag());
          methodOut.setSys001Status800(sys001In.getStatusString() );
//  IF 800-SYS001-STATUS EQUAL ZERO
          if (( allZeros(methodOut.getSys001Status800()) ) /*  ==  zeros*/) { 
//  SET 100-SYS001-OPEN TO TRUE
              methodOut.setSys001Open100True(); 
              
          }
//  ELSE
          else { 
//  MOVE 300-SYS001 TO 600-3002-FILE-DD
              methodOut.setFileDd6003002(methodOut.getSys001300());
//  MOVE 800-SYS001-STATUS TO 600-3002-FILE-STAT
              methodOut.setFileStat6003002(methodOut.getSys001Status800());
//  MOVE 300-3002-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(String.valueOf(methodOut.getAbendCode3003002String()).toCharArray());
              // MOVE 600-3002-ERROR-MSG TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getErrorMsg6003002().toCharArray());
//  MOVE 300-PARA-1200 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara1200300());
//  PERFORM 9100-ABEND-PROGRAM
              abendProgram(programCtx.getAbendProgramInCtx());/*9100-ABEND-PROGRAM*/
          }

// * Sys002
//  OPEN INPUT SYS002-IN
          sys002In.open(new String(CONSTANTS.MODE_READ_ONLY_36242),sys002In.getFileName(),sys002In.getSys002InCharSet(),sys002In.getSys002InCrlfFlag());
          methodOut.setSys002Status800(sys002In.getStatusString() );
//  IF 800-SYS002-STATUS EQUAL ZERO
          if (( allZeros(methodOut.getSys002Status800()) ) /*  ==  zeros*/) { 
//  SET 100-SYS002-OPEN TO TRUE
              methodOut.setSys002Open100True(); 
              
          }
//  ELSE
          else { 
//  MOVE 300-SYS002 TO 600-3002-FILE-DD
              methodOut.setFileDd6003002(methodOut.getSys002300());
//  MOVE 800-SYS002-STATUS TO 600-3002-FILE-STAT
              methodOut.setFileStat6003002(methodOut.getSys002Status800());
//  MOVE 300-3002-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(String.valueOf(methodOut.getAbendCode3003002String()).toCharArray());
              // MOVE 600-3002-ERROR-MSG TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getErrorMsg6003002().toCharArray());
//  MOVE 300-PARA-1200 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara1200300());
//  PERFORM 9100-ABEND-PROGRAM
              abendProgram(programCtx.getAbendProgramInCtx());/*9100-ABEND-PROGRAM*/
          }

// * Sys003
//  OPEN INPUT SYS003-IN
          sys003In.open(new String(CONSTANTS.MODE_READ_ONLY_36242),sys003In.getFileName(),sys003In.getSys003InCharSet(),sys003In.getSys003InCrlfFlag());
          methodOut.setSys003Status800(sys003In.getStatusString() );
//  IF 800-SYS003-STATUS EQUAL ZERO
          if (( allZeros(methodOut.getSys003Status800()) ) /*  ==  zeros*/) { 
//  SET 100-SYS003-OPEN TO TRUE
              methodOut.setSys003Open100True(); 
              
          }
//  ELSE
          else { 
//  MOVE 300-SYS003 TO 600-3002-FILE-DD
              methodOut.setFileDd6003002(methodOut.getSys003300());
//  MOVE 800-SYS003-STATUS TO 600-3002-FILE-STAT
              methodOut.setFileStat6003002(methodOut.getSys003Status800());
//  MOVE 300-3002-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(String.valueOf(methodOut.getAbendCode3003002String()).toCharArray());
              // MOVE 600-3002-ERROR-MSG TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getErrorMsg6003002().toCharArray());
//  MOVE 300-PARA-1200 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara1200300());
//  PERFORM 9100-ABEND-PROGRAM
              abendProgram(programCtx.getAbendProgramInCtx());/*9100-ABEND-PROGRAM*/
          }

// * Sys004
//  OPEN INPUT SYS004-IN
          sys004In.open(new String(CONSTANTS.MODE_READ_ONLY_36242),sys004In.getFileName(),sys004In.getSys004InCharSet(),sys004In.getSys004InCrlfFlag());
          methodOut.setSys004Status800(sys004In.getStatusString() );
//  IF 800-SYS004-STATUS EQUAL ZERO
          if (( allZeros(methodOut.getSys004Status800()) ) /*  ==  zeros*/) { 
//  SET 100-SYS004-OPEN TO TRUE
              methodOut.setSys004Open100True(); 
              
          }
//  ELSE
          else { 
//  MOVE 300-SYS004 TO 600-3002-FILE-DD
              methodOut.setFileDd6003002(methodOut.getSys004300());
//  MOVE 800-SYS004-STATUS TO 600-3002-FILE-STAT
              methodOut.setFileStat6003002(methodOut.getSys004Status800());
//  MOVE 300-3002-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(String.valueOf(methodOut.getAbendCode3003002String()).toCharArray());
              // MOVE 600-3002-ERROR-MSG TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getErrorMsg6003002().toCharArray());
//  MOVE 300-PARA-1200 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara1200300());
//  PERFORM 9100-ABEND-PROGRAM
              abendProgram(programCtx.getAbendProgramInCtx());/*9100-ABEND-PROGRAM*/
          }

// * Sys005
//  OPEN INPUT SYS005-IN
          sys005In.open(new String(CONSTANTS.MODE_READ_ONLY_36242),sys005In.getFileName(),sys005In.getSys005InCharSet(),sys005In.getSys005InCrlfFlag());
          methodOut.setSys005Status800(sys005In.getStatusString() );
//  IF 800-SYS005-STATUS EQUAL ZERO
          if (( allZeros(methodOut.getSys005Status800()) ) /*  ==  zeros*/) { 
//  SET 100-SYS005-OPEN TO TRUE
              methodOut.setSys005Open100True(); 
              
          }
//  ELSE
          else { 
//  MOVE 300-SYS005 TO 600-3002-FILE-DD
              methodOut.setFileDd6003002(methodOut.getSys005300());
//  MOVE 800-SYS005-STATUS TO 600-3002-FILE-STAT
              methodOut.setFileStat6003002(methodOut.getSys005Status800());
//  MOVE 300-3002-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(String.valueOf(methodOut.getAbendCode3003002String()).toCharArray());
              // MOVE 600-3002-ERROR-MSG TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getErrorMsg6003002().toCharArray());
//  MOVE 300-PARA-1200 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara1200300());
//  PERFORM 9100-ABEND-PROGRAM
              abendProgram(programCtx.getAbendProgramInCtx());/*9100-ABEND-PROGRAM*/
          }

// * Sys101
//  IF 1000-WRITE-XML-MSGS
          if ( methodIn.isWriteXmlMsgs1000()  ) { 
//  OPEN OUTPUT SYS101-OUT
              sys101Out.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),sys101Out.getFileName(),sys101Out.getSys101OutCharSet(),sys101Out.getSys101OutCrlfFlag());
              methodOut.setSys101Status800(sys101Out.getStatusString() );
//  IF 800-SYS101-STATUS EQUAL ZERO
              if (( allZeros(methodOut.getSys101Status800()) ) /*  ==  zeros*/) { 
//  SET 100-SYS101-OPEN TO TRUE
                  methodOut.setSys101Open100True(); 
                  
              }
//  ELSE
              else { 
//  MOVE 300-SYS101 TO 600-3003-FILE-DD
                  methodOut.setFileDd6003003(methodOut.getSys101300());
//  MOVE 800-SYS101-STATUS TO 600-3003-FILE-STAT
                  methodOut.setFileStat6003003(methodOut.getSys101Status800());
//  MOVE 300-3003-ABEND-CODE TO 900-ABEND-CODE
                  methodOut.setAbendCode900(String.valueOf(methodOut.getAbendCode3003003String()).toCharArray());
                  // MOVE 600-3003-ERROR-MSG TO 900-ABEND-TEXT
                  methodOut.setAbendText900(methodOut.getErrorMsg6003003().toCharArray());
//  MOVE 300-PARA-1200 TO 900-ABEND-PARA
                  methodOut.setAbendPara900(methodOut.getPara1200300());
//  PERFORM 9100-ABEND-PROGRAM
                  abendProgram(programCtx.getAbendProgramInCtx());/*9100-ABEND-PROGRAM*/
              }
          }

// * Sys201
//  IF 1000-WRITE-PSIPM-MSGS
          if ( methodIn.isWritePsipmMsgs1000()  ) { 
//  OPEN OUTPUT SYS201-OUT
              sys201Out.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),sys201Out.getFileName(),sys201Out.getSys201OutCharSet(),sys201Out.getSys201OutCrlfFlag());
              methodOut.setSys201Status800(sys201Out.getStatusString() );
//  IF 800-SYS201-STATUS EQUAL ZERO
              if (( allZeros(methodOut.getSys201Status800()) ) /*  ==  zeros*/) { 
//  SET 100-SYS201-OPEN TO TRUE
                  methodOut.setSys201Open100True(); 
                  
              }
//  ELSE
              else { 
//  MOVE 300-SYS201 TO 600-3003-FILE-DD
                  methodOut.setFileDd6003003(methodOut.getSys201300());
//  MOVE 800-SYS201-STATUS TO 600-3003-FILE-STAT
                  methodOut.setFileStat6003003(methodOut.getSys201Status800());
//  MOVE 300-3003-ABEND-CODE TO 900-ABEND-CODE
                  methodOut.setAbendCode900(String.valueOf(methodOut.getAbendCode3003003String()).toCharArray());
                  // MOVE 600-3003-ERROR-MSG TO 900-ABEND-TEXT
                  methodOut.setAbendText900(methodOut.getErrorMsg6003003().toCharArray());
//  MOVE 300-PARA-1200 TO 900-ABEND-PARA
                  methodOut.setAbendPara900(methodOut.getPara1200300());
//  PERFORM 9100-ABEND-PROGRAM
                  abendProgram(programCtx.getAbendProgramInCtx());/*9100-ABEND-PROGRAM*/
              }
          }

// * Sys202
//  OPEN OUTPUT SYS202-OUT
          sys202Out.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),sys202Out.getFileName(),sys202Out.getSys202OutCharSet(),sys202Out.getSys202OutCrlfFlag());
          methodOut.setSys202Status800(sys202Out.getStatusString() );
//  IF 800-SYS202-STATUS EQUAL ZERO
          if (( allZeros(methodOut.getSys202Status800()) ) /*  ==  zeros*/) { 
//  SET 100-SYS202-OPEN TO TRUE
              methodOut.setSys202Open100True(); 
              
          }
//  ELSE
          else { 
//  MOVE 300-SYS202 TO 600-3003-FILE-DD
              methodOut.setFileDd6003003(methodOut.getSys202300());
//  MOVE 800-SYS202-STATUS TO 600-3003-FILE-STAT
              methodOut.setFileStat6003003(methodOut.getSys202Status800());
//  MOVE 300-3003-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(String.valueOf(methodOut.getAbendCode3003003String()).toCharArray());
              // MOVE 600-3003-ERROR-MSG TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getErrorMsg6003003().toCharArray());
//  MOVE 300-PARA-1200 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara1200300());
//  PERFORM 9100-ABEND-PROGRAM
              abendProgram(programCtx.getAbendProgramInCtx());/*9100-ABEND-PROGRAM*/
          }

// * Sys204
//  OPEN OUTPUT SYS204-OUT
          sys204Out.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),sys204Out.getFileName(),sys204Out.getSys204OutCharSet(),sys204Out.getSys204OutCrlfFlag());
          methodOut.setSys204Status800(sys204Out.getStatusString() );
//  IF 800-SYS204-STATUS EQUAL ZERO
          if (( allZeros(methodOut.getSys204Status800()) ) /*  ==  zeros*/) { 
//  SET 100-SYS204-OPEN TO TRUE
              methodOut.setSys204Open100True(); 
              
          }
//  ELSE
          else { 
//  MOVE 300-SYS204 TO 600-3003-FILE-DD
              methodOut.setFileDd6003003(methodOut.getSys204300());
//  MOVE 800-SYS204-STATUS TO 600-3003-FILE-STAT
              methodOut.setFileStat6003003(methodOut.getSys204Status800());
//  MOVE 300-3003-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(String.valueOf(methodOut.getAbendCode3003003String()).toCharArray());
              // MOVE 600-3003-ERROR-MSG TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getErrorMsg6003003().toCharArray());
//  MOVE 300-PARA-1200 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara1200300());
//  PERFORM 9100-ABEND-PROGRAM
              abendProgram(programCtx.getAbendProgramInCtx());/*9100-ABEND-PROGRAM*/
          }

// * Sys205
//  OPEN OUTPUT SYS205-OUT
          sys205Out.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),sys205Out.getFileName(),sys205Out.getSys205OutCharSet(),sys205Out.getSys205OutCrlfFlag());
          methodOut.setSys205Status800(sys205Out.getStatusString() );
//  IF 800-SYS205-STATUS EQUAL ZERO
          if (( allZeros(methodOut.getSys205Status800()) ) /*  ==  zeros*/) { 
//  SET 100-SYS205-OPEN TO TRUE
              methodOut.setSys205Open100True(); 
              
          }
//  ELSE
          else { 
//  MOVE 300-SYS205 TO 600-3003-FILE-DD
              methodOut.setFileDd6003003(methodOut.getSys205300());
//  MOVE 800-SYS205-STATUS TO 600-3003-FILE-STAT
              methodOut.setFileStat6003003(methodOut.getSys205Status800());
//  MOVE 300-3003-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(String.valueOf(methodOut.getAbendCode3003003String()).toCharArray());
              // MOVE 600-3003-ERROR-MSG TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getErrorMsg6003003().toCharArray());
//  MOVE 300-PARA-1200 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara1200300());
//  PERFORM 9100-ABEND-PROGRAM
              abendProgram(programCtx.getAbendProgramInCtx());/*9100-ABEND-PROGRAM*/
          }
      
      return methodOut;
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
      @Override
      public InitTemplatesOutCtx initTemplates(InitTemplatesInCtx methodIn) throws Exception {
      
// ******************************************************************
// * Initialize templates with default values
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
InitTemplatesOutCtx methodOut = methodIn.getInitTemplatesOutCtx();
//  PERFORM 1310-READ-SYS004
          readSys004(programCtx.getReadSys004InCtx());/*1310-READ-SYS004*/
//  PERFORM UNTIL 100-EOF-SYS004
          while ((!(methodIn.isEofSys004100()) )) {
//  MOVE SYS004-TAG-KEY TO 800-NEW-ELEM
              methodOut.setNewElem800(methodOut.getSys004TagKey());
//  MOVE SYS004-TAG-LEN TO 800-NEW-ELEM-LEN
              methodOut.setNewElemLen800(methodOut.getSys004TagLen());
//  IF SYS004-TAG-LEN <= 300-DFLT-MAX-LEN
              if (	( methodOut.getSys004TagLen() <= methodIn.getDfltMaxLen300() )) { 
//  MOVE SYS004-TAG-VALUE (1 : SYS004-TAG-LEN ) TO 800-NEW-ELEM-VALUE (1 : SYS004-TAG-LEN )
                  methodOut.getWorkAreas800().replace(methodIn.getSys004InRec()/*parent*/,23/*fromOffset - (newElemValue800) */,methodOut.getSys004TagLen()/*fromLen*/,1349/*toOffset - (sys004TagValue) */,methodOut.getSys004TagLen()/*toLen*/);
              }
//  ELSE
              else { 
//  MOVE ALL SPACES TO 800-NEW-ELEM-VALUE (1 : SYS004-TAG-LEN )
                  methodOut.setNewElemValue800(replace(methodOut.getNewElemValue800(),CONSTANTS.SPACE,0,methodOut.getSys004TagLen()));
//  MOVE SYS004-TAG-VALUE (1 : 300-DFLT-MAX-LEN ) TO 800-NEW-ELEM-VALUE (1 : 300-DFLT-MAX-LEN )
                  methodOut.getWorkAreas800().replace(methodIn.getSys004InRec()/*parent*/,23/*fromOffset - (newElemValue800) */,methodIn.getDfltMaxLen300()/*fromLen*/,1349/*toOffset - (sys004TagValue) */,methodIn.getDfltMaxLen300()/*toLen*/);
              }
//  EVALUATE SYS004-MTI-FC
              switch(new String(methodIn.getSys004MtiFc())){
              	case "1240200":
//  PERFORM 8000-ADD-1240200-FIELD
                  add1240200Field(programCtx.getAdd1240200FieldInCtx());/*8000-ADD-1240200-FIELD*/
              break;
              	case "1644695":
//  PERFORM 8000-ADD-1644695-FIELD
                  add1644695Field(programCtx.getAdd1644695FieldInCtx());/*8000-ADD-1644695-FIELD*/
              break;
              	case "1644697":
//  PERFORM 8000-ADD-1644697-FIELD
                  add1644697Field(programCtx.getAdd1644697FieldInCtx());/*8000-ADD-1644697-FIELD*/
              break;
              }
//  PERFORM 1310-READ-SYS004
              readSys004(programCtx.getReadSys004InCtx());/*1310-READ-SYS004*/
          }
      
      return methodOut;
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
      @Override
      public ReadSys004OutCtx readSys004(ReadSys004InCtx methodIn) throws Exception {
      
// ******************************************************************
// * Read record from sys004
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
ReadSys004OutCtx methodOut = methodIn.getReadSys004OutCtx();
//  READ SYS004-IN
          	sys004In.read();
          methodOut.setSys004Status800(sys004In.getStatusString() );
          if (!sys004In.hasEnded()) {
          	methodOut.getSys004InRec().setString(sys004In.getRecord());
          }
//  AT END
          if (sys004In.hasEnded()) {  
//  IF 100-SYS004-FIRST-REC
              if ( methodIn.isSys004FirstRec100()  ) { 
//  MOVE 300-3005-ABEND-CODE TO 600-ERROR-CODE
                  methodOut.setErrorCode600(methodOut.getAbendCode3003005());
//  MOVE 300-SYS004 TO 600-3005-FILE-DD
                  methodOut.setFileDd6003005(methodOut.getSys004300());
//  DISPLAY 600-3005-ERROR-MSG
                  logger.info(methodIn.getErrorMsg6003005().toString()); 
              }
//  SET 100-EOF-SYS004 TO TRUE
              methodOut.setEofSys004100True(); 
              
            }
//  NOT AT END
          else  {
//  SET 100-SYS004-NOT-FIRST-REC TO TRUE
              methodOut.setSys004NotFirstRec100True(); 
              
//  ADD 1 TO 400-SYS004-RECS-READ
              methodOut.setSys004RecsRead400(methodOut.getSys004RecsRead400()+1);
            }
      
      return methodOut;
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
      @Override
      public LoadRegistrationFileOutCtx loadRegistrationFile(LoadRegistrationFileInCtx methodIn) throws Exception {
      
// ******************************************************************
// * Load registration file into internal table
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
LoadRegistrationFileOutCtx methodOut = methodIn.getLoadRegistrationFileOutCtx();
//  MOVE HIGH-VALUES TO 500-SYS002-TABLE
          methodOut.getSys002Table500().setString(CONSTANTS.HIGH_VALUE_584214599);
//  SET 500-SYS002-IDX TO 1
          methodOut.setSys002Idx500(1); 
          
//  PERFORM 1510-READ-LOAD-REGISTN-FILE UNTIL 88-800-SYS002-EOF
          while (!(methodIn.isSys002Eof88800()) ) {
             readLoadRegistnFile(programCtx.getReadLoadRegistnFileInCtx());/*1510-READ-LOAD-REGISTN-FILE*/
          }
//  DISPLAY '500-ROW-COUNT: ' 500-ROW-COUNT
          logger.info("500-ROW-COUNT: {}", String.valueOf(methodIn.getRowCount500())); 
      
      return methodOut;
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
      @Override
      public LoadBrandprdIrdFileOutCtx loadBrandprdIrdFile(LoadBrandprdIrdFileInCtx methodIn) throws Exception {
      
// *    Perform 1520-close-load-registn-file.
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
LoadBrandprdIrdFileOutCtx methodOut = methodIn.getLoadBrandprdIrdFileOutCtx();
//  MOVE HIGH-VALUES TO 502-SYS005-TABLE
          methodOut.getSys005Table502().setString(CONSTANTS.HIGH_VALUE_1749248865);
//  SET 502-SYS005-IDX TO 1
          methodOut.setSys005Idx502(1); 
          
//  PERFORM 1610-READ-LOAD-BP-IRD-FILE UNTIL 88-800-SYS005-EOF
          while (!(methodIn.isSys005Eof88800()) ) {
             readLoadBpIrdFile(programCtx.getReadLoadBpIrdFileInCtx());/*1610-READ-LOAD-BP-IRD-FILE*/
          }
//  DISPLAY '502-ROW-COUNT: ' 502-ROW-COUNT
          logger.info("502-ROW-COUNT: {}", String.valueOf(methodIn.getRowCount502())); 
      
      return methodOut;
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
      @Override
      public ReadLoadRegistnFileOutCtx readLoadRegistnFile(ReadLoadRegistnFileInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph reads the registration file. after every        *
// * successful read, the record is loaded into an internal table.  *
// *----------------------------------------------------------------*
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
ReadLoadRegistnFileOutCtx methodOut = methodIn.getReadLoadRegistnFileOutCtx();
//  READ SYS002-IN
          	sys002In.read();
          methodOut.setSys002Status800(sys002In.getStatusString() );
          if (!sys002In.hasEnded()) {
          	methodOut.getSys002InRec().setString(sys002In.getRecord());
          }
//  IF 88-800-SYS002-GOOD
          if ( methodOut.isSys002Good88800()  ) { 
//  SET 100-SYS002-NOT-FIRST-REC TO TRUE
              methodOut.setSys002NotFirstRec100True(); 
              
//  IF 500-SYS002-IDX IS LESS THAN OR EQUAL 10000
              if (	( methodOut.getSys002Idx500() <= 10000 )) { 
//  MOVE SYS002-IN-REC TO 500-SYS002-DATA ( 500-SYS002-IDX )
                  methodOut.setSys002Data500(methodOut.getSys002Idx500() - 1,methodOut.getSys002InRec().getCharArray());
//  SET 500-SYS002-IDX UP BY 1
                  methodOut.setSys002Idx500(methodOut.getSys002Idx500() + 1); 
                  
//  ADD 1 TO 500-ROW-COUNT
                  methodOut.setRowCount500(methodOut.getRowCount500()+1);
              }
//  ELSE
              else { 
//  DISPLAY 'ABEND FOR LIMIT'
                  logger.info("ABEND FOR LIMIT"); 
//  MOVE 300-3016-ABEND-CODE TO 900-ABEND-CODE
                  methodOut.setAbendCode900(String.valueOf(methodOut.getAbendCode3003016String()).toCharArray());
//  MOVE 600-3016-ERROR-MSG TO 900-ABEND-TEXT
                  methodOut.setAbendText900(pad(99,methodOut.getErrorMsg6003016(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-1510 TO 900-ABEND-PARA
                  methodOut.setAbendPara900(methodOut.getPara1510300());
//  PERFORM 9100-ABEND-PROGRAM
                  abendProgram(programCtx.getAbendProgramInCtx());/*9100-ABEND-PROGRAM*/
              }
          }
//  ELSE
          else { 
//  IF 88-800-SYS002-EOF AND 100-SYS002-FIRST-REC
              if ( methodOut.isSys002Eof88800()   &&  methodOut.isSys002FirstRec100()  ) { 
//  DISPLAY 'SYS002 - EMPTY ABEND'
                  logger.info("SYS002 - EMPTY ABEND"); 
//  MOVE 300-SYS002 TO 600-3005-FILE-DD
                  methodOut.setFileDd6003005(methodOut.getSys002300());
//  MOVE 300-3005-ABEND-CODE TO 900-ABEND-CODE
                  methodOut.setAbendCode900(String.valueOf(methodOut.getAbendCode3003005String()).toCharArray());
                  // MOVE 600-3005-ERROR-MSG TO 900-ABEND-TEXT
                  methodOut.setAbendText900(methodOut.getErrorMsg6003005().toCharArray());
//  MOVE 300-PARA-1510 TO 900-ABEND-PARA
                  methodOut.setAbendPara900(methodOut.getPara1510300());
//  PERFORM 9100-ABEND-PROGRAM
                  abendProgram(programCtx.getAbendProgramInCtx());/*9100-ABEND-PROGRAM*/
              }
//  ELSE
              else { 
//  IF 88-800-SYS002-EOF
//  ELSE
                  if (!(methodOut.isSys002Eof88800()) ) { 
//  DISPLAY 'SYS002 - READ ABEND'
                      logger.info("SYS002 - READ ABEND"); 
//  MOVE 300-SYS002 TO 600-3006-FILE-DD
                      methodOut.setFileDd6003006(methodOut.getSys002300());
//  MOVE 300-3006-ABEND-CODE TO 900-ABEND-CODE
                      methodOut.setAbendCode900(String.valueOf(methodOut.getAbendCode3003006String()).toCharArray());
                      // MOVE 600-3006-ERROR-MSG TO 900-ABEND-TEXT
                      methodOut.setAbendText900(methodOut.getErrorMsg6003006().toCharArray());
//  MOVE 300-PARA-1510 TO 900-ABEND-PARA
                      methodOut.setAbendPara900(methodOut.getPara1510300());
//  PERFORM 9100-ABEND-PROGRAM
                      abendProgram(programCtx.getAbendProgramInCtx());/*9100-ABEND-PROGRAM*/
                  }
              }
          }
      
      return methodOut;
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
      @Override
      public ReadLoadBpIrdFileOutCtx readLoadBpIrdFile(ReadLoadBpIrdFileInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// * This paragraph reads the registration file. after every        *
// * successful read, the record is loaded into an internal table.  *
// *----------------------------------------------------------------*
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
ReadLoadBpIrdFileOutCtx methodOut = methodIn.getReadLoadBpIrdFileOutCtx();
//  READ SYS005-IN
          	sys005In.read();
          methodOut.setSys005Status800(sys005In.getStatusString() );
          if (!sys005In.hasEnded()) {
          	methodOut.getSys005InRec().setString(sys005In.getRecord());
          }
//  IF 88-800-SYS005-GOOD
          if ( methodOut.isSys005Good88800()  ) { 
//  IF 502-SYS005-IDX IS LESS THAN OR EQUAL 10000
              if (	( methodOut.getSys005Idx502() <= 10000 )) { 
//  MOVE SYS005-IN-REC (1 : 5) TO 502-SYS005-DATA ( 502-SYS005-IDX )
                  methodOut.setSys005Data502(methodOut.getSys005Idx502() - 1,pad(6,substring(methodOut.getSys005InRec().getCharArray(),0,5),SPACE_CHAR,RIGHT_PAD));
//  SET 502-SYS005-IDX UP BY 1
                  methodOut.setSys005Idx502(methodOut.getSys005Idx502() + 1); 
                  
//  ADD 1 TO 502-ROW-COUNT
                  methodOut.setRowCount502(methodOut.getRowCount502()+1);
              }
//  ELSE
              else { 
//  DISPLAY 'ABEND FOR LIMIT'
                  logger.info("ABEND FOR LIMIT"); 
//  MOVE 300-3016-ABEND-CODE TO 900-ABEND-CODE
                  methodOut.setAbendCode900(String.valueOf(methodOut.getAbendCode3003016String()).toCharArray());
//  MOVE 600-3016-ERROR-MSG TO 900-ABEND-TEXT
                  methodOut.setAbendText900(pad(99,methodOut.getErrorMsg6003016(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-1610 TO 900-ABEND-PARA
                  methodOut.setAbendPara900(methodOut.getPara1610300());
//  PERFORM 9100-ABEND-PROGRAM
                  abendProgram(programCtx.getAbendProgramInCtx());/*9100-ABEND-PROGRAM*/
              }
          }
//  ELSE
          else { 
//  IF 88-800-SYS005-EOF
//  ELSE
              if (!(methodOut.isSys005Eof88800()) ) { 
//  DISPLAY 'SYS005 - READ ABEND'
                  logger.info("SYS005 - READ ABEND"); 
//  MOVE 300-SYS005 TO 600-3006-FILE-DD
                  methodOut.setFileDd6003006(methodOut.getSys005300());
//  MOVE 300-3006-ABEND-CODE TO 900-ABEND-CODE
                  methodOut.setAbendCode900(String.valueOf(methodOut.getAbendCode3003006String()).toCharArray());
                  // MOVE 600-3006-ERROR-MSG TO 900-ABEND-TEXT
                  methodOut.setAbendText900(methodOut.getErrorMsg6003006().toCharArray());
//  MOVE 300-PARA-1610 TO 900-ABEND-PARA
                  methodOut.setAbendPara900(methodOut.getPara1610300());
//  PERFORM 9100-ABEND-PROGRAM
                  abendProgram(programCtx.getAbendProgramInCtx());/*9100-ABEND-PROGRAM*/
              }
          }
      
      return methodOut;
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
      @Override
      public void process2000(Process2000InCtx methodIn) throws Exception {
      
// ******************************************************************
// * Process
// ******************************************************************

// *    Process default values
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
//  PERFORM 2100-READ-SYS003
          readSys003(programCtx.getReadSys003InCtx());/*2100-READ-SYS003*/
//  PERFORM 2200-PROCESS-COMN-FIELDS UNTIL 100-EOF-SYS003
          while (!(methodIn.isEofSys003100()) ) {
             processComnFields(programCtx.getProcessComnFieldsInCtx());/*2200-PROCESS-COMN-FIELDS*/
          }
//  PERFORM 2300-COPY-COMN-FLDS-TO-1240200
          copyComnFldsTo1240200(programCtx.getCopyComnFldsTo1240200InCtx());/*2300-COPY-COMN-FLDS-TO-1240200*/

// *    Build file header
//  PERFORM 2400-BUILD-1644697
          build1644697(programCtx.getBuild1644697InCtx());/*2400-BUILD-1644697*/
//  PERFORM 8550-WRITE-1644697
          write1644697(programCtx.getWrite1644697InCtx());/*8550-WRITE-1644697*/

// *    Process detail fields
//  PERFORM 8000-READ-SYS001
          readSys001(programCtx.getReadSys001InCtx());/*8000-READ-SYS001*/
//  PERFORM 2500-PROCESS-DETAIL-FIELDS UNTIL 88-100-ALL-RECORDS-PRCD-Y
          while (!(methodIn.isAllRecordsPrcdY88100()) ) {
             processDetailFields(programCtx);/*2500-PROCESS-DETAIL-FIELDS*/
          }

// *    Build file trailer
//  PERFORM 2600-BUILD-1644695
          build1644695(programCtx.getBuild1644695InCtx());/*2600-BUILD-1644695*/
//  PERFORM 8550-WRITE-1644695
          write1644695(programCtx.getWrite1644695InCtx());/*8550-WRITE-1644695*/
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
      @Override
      public ReadSys001OutCtx readSys001(ReadSys001InCtx methodIn) throws Exception {
      
// ******************************************************************
// * Read record from sys001
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
ReadSys001OutCtx methodOut = methodIn.getReadSys001OutCtx();
//  READ SYS001-IN
          	sys001In.read();
          methodOut.setSys001Status800(sys001In.getStatusString() );
          if (!sys001In.hasEnded()) {
          	methodOut.getSys001InRec().setString(sys001In.getRecord());
          }
//  AT END
          if (sys001In.hasEnded()) {  
//  IF 100-SYS001-FIRST-REC
              if ( methodIn.isSys001FirstRec100()  ) { 
//  MOVE 300-SYS001 TO 600-3005-FILE-DD
                  methodOut.setFileDd6003005(methodOut.getSys001300());
//  MOVE 300-3005-ABEND-CODE TO 900-ABEND-CODE
                  methodOut.setAbendCode900(String.valueOf(methodOut.getAbendCode3003005String()).toCharArray());
                  // MOVE 600-3005-ERROR-MSG TO 900-ABEND-TEXT
                  methodOut.setAbendText900(methodOut.getErrorMsg6003005().toCharArray());
//  MOVE 300-PARA-8000 TO 900-ABEND-PARA
                  methodOut.setAbendPara900(methodOut.getPara8000300());
//  PERFORM 9100-ABEND-PROGRAM
                  abendProgram(programCtx.getAbendProgramInCtx());/*9100-ABEND-PROGRAM*/
              }
//  SET 100-EOF-SYS001 TO TRUE
              methodOut.setEofSys001100True(); 
              
//  INITIALIZE IP98901-PAYMENT-FILE-DATA
              methodOut.getIp98901PaymentFileData().initialize();
            }
//  NOT AT END
          else  {
              // MOVE SYS001-IN-REC TO IP98901-PAYMENT-FILE-DATA
              methodOut.getIp98901PaymentFileData().setString(methodOut.getSys001InRec().getCharArray());
//  SET 100-SYS001-NOT-FIRST-REC TO TRUE
              methodOut.setSys001NotFirstRec100True(); 
              
//  ADD 1 TO 400-SYS001-RECS-READ
              methodOut.setSys001RecsRead400(methodOut.getSys001RecsRead400()+1);
            }
      
      return methodOut;
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
      @Override
      public ReadSys003OutCtx readSys003(ReadSys003InCtx methodIn) throws Exception {
      
// ******************************************************************
// * Read records from sys003
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
ReadSys003OutCtx methodOut = methodIn.getReadSys003OutCtx();
//  READ SYS003-IN
          	sys003In.read();
          methodOut.setSys003Status800(sys003In.getStatusString() );
          if (!sys003In.hasEnded()) {
          	methodOut.getSys003InRec().setString(sys003In.getRecord());
          }
//  AT END
          if (sys003In.hasEnded()) {  
//  IF 100-SYS003-FIRST-REC
              if ( methodIn.isSys003FirstRec100()  ) { 
//  MOVE 300-SYS003 TO 600-3005-FILE-DD
                  methodOut.setFileDd6003005(methodOut.getSys003300());
//  MOVE 300-3005-ABEND-CODE TO 900-ABEND-CODE
                  methodOut.setAbendCode900(String.valueOf(methodOut.getAbendCode3003005String()).toCharArray());
                  // MOVE 600-3005-ERROR-MSG TO 900-ABEND-TEXT
                  methodOut.setAbendText900(methodOut.getErrorMsg6003005().toCharArray());
//  MOVE 300-PARA-2100 TO 900-ABEND-PARA
                  methodOut.setAbendPara900(methodOut.getPara2100300());
//  PERFORM 9100-ABEND-PROGRAM
                  abendProgram(programCtx.getAbendProgramInCtx());/*9100-ABEND-PROGRAM*/
              }
//  SET 100-EOF-SYS003 TO TRUE
              methodOut.setEofSys003100True(); 
              
            }
//  NOT AT END
          else  {
//  SET 100-SYS003-NOT-FIRST-REC TO TRUE
              methodOut.setSys003NotFirstRec100True(); 
              
//  ADD 1 TO 400-SYS003-RECS-READ
              methodOut.setSys003RecsRead400(methodOut.getSys003RecsRead400()+1);
            }
      
      return methodOut;
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
      @Override
      public WriteSys101OutCtx writeSys101(WriteSys101InCtx methodIn) throws Exception {
      
// ******************************************************************
// * Write sys101
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
WriteSys101OutCtx methodOut = methodIn.getWriteSys101OutCtx();
//  WRITE SYS101-OUT-REC
          sys101Out.setRecord(substring(methodOut.getSys101OutRec().toCharArray(),0,(int) methodIn.getSys101Rdw800()));
          sys101Out.write((int) methodIn.getSys101Rdw800()); 
          methodOut.setSys101Status800(sys101Out.getStatusString() );
//  IF 88-800-SYS101-GOOD
          if ( methodOut.isSys101Good88800()  ) { 
//  ADD 1 TO 400-SYS101-RECS-WRIT
              methodOut.setSys101RecsWrit400(methodOut.getSys101RecsWrit400()+1);
          }
//  ELSE
          else { 
//  MOVE 300-SYS101 TO 600-3004-FILE-DD
              methodOut.setFileDd6003004(methodOut.getSys101300());
//  MOVE 800-SYS101-STATUS TO 600-3004-FILE-STAT
              methodOut.setFileStat6003004(methodOut.getSys101Status800());
//  MOVE 300-3004-ABEND-CODE TO 600-ERROR-CODE
              methodOut.setErrorCode600(methodOut.getAbendCode3003004());
              // MOVE 600-3004-ERROR-MSG TO 600-ERROR-TEXT
              methodOut.setErrorText600(methodOut.getErrorMsg6003004().toCharArray());
//  MOVE 300-PARA-2200 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara2200300());
//  PERFORM 9100-ABEND-PROGRAM
              abendProgram(programCtx.getAbendProgramInCtx());/*9100-ABEND-PROGRAM*/
          }
      
      return methodOut;
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
      @Override
      public ProcessComnFieldsOutCtx processComnFields(ProcessComnFieldsInCtx methodIn) throws Exception {
      
// ******************************************************************
// * Process common fields
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
ProcessComnFieldsOutCtx methodOut = methodIn.getProcessComnFieldsOutCtx();
          // MOVE SPACES TO 800-FLD-NAME
          methodOut.setFldName800(CONSTANTS.SPACE_10);
//  MOVE ZEROES TO 800-FLD-VALUE 800-FLD-NAME-LEN
          methodOut.setFldValue800(CONSTANTS.ZERO_65);
          methodOut.setFldNameLen800(0);
          // MOVE SYS003-FIELD TO 800-FLD-NAME
          methodOut.setFldName800(methodOut.getSys003Field());
          // MOVE SYS003-FIELD-LEN TO 800-FLD-LEN
          methodOut.setFldLen800(padLeftZeros(3,methodOut.getSys003FieldLen(),false));
          // MOVE SYS003-FIELD-VAL TO 800-FLD-VALUE
          methodOut.setFldValue800(methodOut.getSys003FieldVal());
//  PERFORM 2320-STORE-COMN-FIELD
          storeComnField(programCtx.getStoreComnFieldInCtx());/*2320-STORE-COMN-FIELD*/
//  PERFORM 2100-READ-SYS003
          readSys003(programCtx.getReadSys003InCtx());/*2100-READ-SYS003*/
          ;
      
      return methodOut;
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
      @Override
      public StoreComnFieldOutCtx storeComnField(StoreComnFieldInCtx methodIn) throws Exception {
      
// ******************************************************************
// * Store common fields
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
StoreComnFieldOutCtx methodOut = methodIn.getStoreComnFieldOutCtx();
//  EVALUATE 800-FLD-NAME
          if  (		compareChars(methodIn.getFldName800(),methodIn.getPds0023300()) == 0 ) { 
//  MOVE 'P002300000000' TO 800-NEW-ELEM
//  LITERAL_P002300000000 = 'P002300000000'
              methodOut.setNewElem800(CONSTANTS.LITERAL_P002300000000);
//  MOVE 800-FLD-LEN TO 800-NEW-ELEM-LEN
              methodOut.setNewElemLen800(methodOut.getFldLen800());
//  MOVE 800-FLD-VALUE (1 : 800-FLD-LEN ) TO 800-NEW-ELEM-VALUE
              methodOut.setNewElemValue800(methodOut.getFldValue800(),0/* fldValue800 */,methodOut.getFldLen800(),0 /* newElemValue800 */,methodOut.getNewElemValue800().length /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  PERFORM 8000-ADD-COMN-FIELD
              addComnField(programCtx.getAddComnFieldInCtx());/*8000-ADD-COMN-FIELD*/
          }
          else if  (		compareChars(methodIn.getFldName800(),methodIn.getPds0148300()) == 0 ) { 
//  MOVE 'P014800000000' TO 800-NEW-ELEM
//  LITERAL_P014800000000 = 'P014800000000'
              methodOut.setNewElem800(CONSTANTS.LITERAL_P014800000000);
//  MOVE 800-FLD-LEN TO 800-NEW-ELEM-LEN
              methodOut.setNewElemLen800(methodOut.getFldLen800());
//  MOVE 800-FLD-VALUE (1 : 800-FLD-LEN ) TO 800-NEW-ELEM-VALUE
              methodOut.setNewElemValue800(methodOut.getFldValue800(),0/* fldValue800 */,methodOut.getFldLen800(),0 /* newElemValue800 */,methodOut.getNewElemValue800().length /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  PERFORM 8000-ADD-COMN-FIELD
              addComnField(programCtx.getAddComnFieldInCtx());/*8000-ADD-COMN-FIELD*/
          }
          else if  (		compareChars(methodIn.getFldName800(),methodIn.getPds0122300()) == 0 ) { 
//  MOVE 'P012200000000' TO 800-NEW-ELEM
//  LITERAL_P012200000000 = 'P012200000000'
              methodOut.setNewElem800(CONSTANTS.LITERAL_P012200000000);
//  MOVE 800-FLD-LEN TO 800-NEW-ELEM-LEN
              methodOut.setNewElemLen800(methodOut.getFldLen800());
//  MOVE 800-FLD-VALUE (1 : 800-FLD-LEN ) TO 800-NEW-ELEM-VALUE
              methodOut.setNewElemValue800(methodOut.getFldValue800(),0/* fldValue800 */,methodOut.getFldLen800(),0 /* newElemValue800 */,methodOut.getNewElemValue800().length /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  PERFORM 8000-ADD-COMN-FIELD
              addComnField(programCtx.getAddComnFieldInCtx());/*8000-ADD-COMN-FIELD*/
          }
          else if  (		compareChars(methodIn.getFldName800(),methodIn.getDe3s1300()) == 0 ) { 
//  MOVE 'D000300010000' TO 800-NEW-ELEM
//  LITERAL_D000300010000 = 'D000300010000'
              methodOut.setNewElem800(CONSTANTS.LITERAL_D000300010000);
//  MOVE 800-FLD-LEN TO 800-NEW-ELEM-LEN
              methodOut.setNewElemLen800(methodOut.getFldLen800());
//  MOVE 800-FLD-VALUE (1 : 800-FLD-LEN ) TO 800-NEW-ELEM-VALUE
              methodOut.setNewElemValue800(methodOut.getFldValue800(),0/* fldValue800 */,methodOut.getFldLen800(),0 /* newElemValue800 */,methodOut.getNewElemValue800().length /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  PERFORM 8000-ADD-COMN-FIELD
              addComnField(programCtx.getAddComnFieldInCtx());/*8000-ADD-COMN-FIELD*/
          }
          else if  (		compareChars(methodIn.getFldName800(),methodIn.getDe42300()) == 0 ) { 
//  MOVE 'D004200000000' TO 800-NEW-ELEM
//  LITERAL_D004200000000 = 'D004200000000'
              methodOut.setNewElem800(CONSTANTS.LITERAL_D004200000000);
//  MOVE 800-FLD-LEN TO 800-NEW-ELEM-LEN
              methodOut.setNewElemLen800(methodOut.getFldLen800());
//  MOVE 800-FLD-VALUE (1 : 800-FLD-LEN ) TO 800-NEW-ELEM-VALUE
              methodOut.setNewElemValue800(methodOut.getFldValue800(),0/* fldValue800 */,methodOut.getFldLen800(),0 /* newElemValue800 */,methodOut.getNewElemValue800().length /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  PERFORM 8000-ADD-COMN-FIELD
              addComnField(programCtx.getAddComnFieldInCtx());/*8000-ADD-COMN-FIELD*/
          }
          else if  (		compareChars(methodIn.getFldName800(),methodIn.getDe43s2300()) == 0 ) { 
//  MOVE 'D004300020000' TO 800-NEW-ELEM
//  LITERAL_D004300020000 = 'D004300020000'
              methodOut.setNewElem800(CONSTANTS.LITERAL_D004300020000);
//  MOVE 800-FLD-LEN TO 800-NEW-ELEM-LEN
              methodOut.setNewElemLen800(methodOut.getFldLen800());
//  MOVE 800-FLD-VALUE (1 : 800-FLD-LEN ) TO 800-NEW-ELEM-VALUE
              methodOut.setNewElemValue800(methodOut.getFldValue800(),0/* fldValue800 */,methodOut.getFldLen800(),0 /* newElemValue800 */,methodOut.getNewElemValue800().length /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  PERFORM 8000-ADD-COMN-FIELD
              addComnField(programCtx.getAddComnFieldInCtx());/*8000-ADD-COMN-FIELD*/
          }
          else if  (		compareChars(methodIn.getFldName800(),methodIn.getDe43s3300()) == 0 ) { 
//  MOVE 'D004300030000' TO 800-NEW-ELEM
//  LITERAL_D004300030000 = 'D004300030000'
              methodOut.setNewElem800(CONSTANTS.LITERAL_D004300030000);
//  MOVE 800-FLD-LEN TO 800-NEW-ELEM-LEN
              methodOut.setNewElemLen800(methodOut.getFldLen800());
//  MOVE 800-FLD-VALUE (1 : 800-FLD-LEN ) TO 800-NEW-ELEM-VALUE
              methodOut.setNewElemValue800(methodOut.getFldValue800(),0/* fldValue800 */,methodOut.getFldLen800(),0 /* newElemValue800 */,methodOut.getNewElemValue800().length /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  PERFORM 8000-ADD-COMN-FIELD
              addComnField(programCtx.getAddComnFieldInCtx());/*8000-ADD-COMN-FIELD*/
          }
          else if  (		compareChars(methodIn.getFldName800(),methodIn.getDe43s4300()) == 0 ) { 
//  MOVE 'D004300040000' TO 800-NEW-ELEM
//  LITERAL_D004300040000 = 'D004300040000'
              methodOut.setNewElem800(CONSTANTS.LITERAL_D004300040000);
//  MOVE 800-FLD-LEN TO 800-NEW-ELEM-LEN
              methodOut.setNewElemLen800(methodOut.getFldLen800());
//  MOVE 800-FLD-VALUE (1 : 800-FLD-LEN ) TO 800-NEW-ELEM-VALUE
              methodOut.setNewElemValue800(methodOut.getFldValue800(),0/* fldValue800 */,methodOut.getFldLen800(),0 /* newElemValue800 */,methodOut.getNewElemValue800().length /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  PERFORM 8000-ADD-COMN-FIELD
              addComnField(programCtx.getAddComnFieldInCtx());/*8000-ADD-COMN-FIELD*/
          }
          else if  (		compareChars(methodIn.getFldName800(),methodIn.getDe43s5300()) == 0 ) { 
//  MOVE 'D004300050000' TO 800-NEW-ELEM
//  LITERAL_D004300050000 = 'D004300050000'
              methodOut.setNewElem800(CONSTANTS.LITERAL_D004300050000);
//  MOVE 800-FLD-LEN TO 800-NEW-ELEM-LEN
              methodOut.setNewElemLen800(methodOut.getFldLen800());
//  MOVE 800-FLD-VALUE (1 : 800-FLD-LEN ) TO 800-NEW-ELEM-VALUE
              methodOut.setNewElemValue800(methodOut.getFldValue800(),0/* fldValue800 */,methodOut.getFldLen800(),0 /* newElemValue800 */,methodOut.getNewElemValue800().length /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  PERFORM 8000-ADD-COMN-FIELD
              addComnField(programCtx.getAddComnFieldInCtx());/*8000-ADD-COMN-FIELD*/
          }
          else if  (		compareChars(methodIn.getFldName800(),methodIn.getDe43s6300()) == 0 ) { 
//  MOVE 'D004300060000' TO 800-NEW-ELEM
//  LITERAL_D004300060000 = 'D004300060000'
              methodOut.setNewElem800(CONSTANTS.LITERAL_D004300060000);
//  MOVE 800-FLD-LEN TO 800-NEW-ELEM-LEN
              methodOut.setNewElemLen800(methodOut.getFldLen800());
//  MOVE 800-FLD-VALUE (1 : 800-FLD-LEN ) TO 800-NEW-ELEM-VALUE
              methodOut.setNewElemValue800(methodOut.getFldValue800(),0/* fldValue800 */,methodOut.getFldLen800(),0 /* newElemValue800 */,methodOut.getNewElemValue800().length /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  PERFORM 8000-ADD-COMN-FIELD
              addComnField(programCtx.getAddComnFieldInCtx());/*8000-ADD-COMN-FIELD*/
          }
          else if  (		compareChars(methodIn.getFldName800(),methodIn.getDe49300()) == 0 ) { 
//  MOVE 'D004900000000' TO 800-NEW-ELEM
//  LITERAL_D004900000000 = 'D004900000000'
              methodOut.setNewElem800(CONSTANTS.LITERAL_D004900000000);
//  MOVE 800-FLD-LEN TO 800-NEW-ELEM-LEN
              methodOut.setNewElemLen800(methodOut.getFldLen800());
//  MOVE 800-FLD-VALUE (1 : 800-FLD-LEN ) TO 800-NEW-ELEM-VALUE
              methodOut.setNewElemValue800(methodOut.getFldValue800(),0/* fldValue800 */,methodOut.getFldLen800(),0 /* newElemValue800 */,methodOut.getNewElemValue800().length /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  PERFORM 8000-ADD-COMN-FIELD
              addComnField(programCtx.getAddComnFieldInCtx());/*8000-ADD-COMN-FIELD*/
          }
          else if  (		compareChars(methodIn.getFldName800(),methodIn.getDe26300()) == 0 ) { 
//  MOVE 'D002600000000' TO 800-NEW-ELEM
//  LITERAL_D002600000000 = 'D002600000000'
              methodOut.setNewElem800(CONSTANTS.LITERAL_D002600000000);
//  MOVE 800-FLD-LEN TO 800-NEW-ELEM-LEN
              methodOut.setNewElemLen800(methodOut.getFldLen800());
//  MOVE 800-FLD-VALUE (1 : 800-FLD-LEN ) TO 800-NEW-ELEM-VALUE
              methodOut.setNewElemValue800(methodOut.getFldValue800(),0/* fldValue800 */,methodOut.getFldLen800(),0 /* newElemValue800 */,methodOut.getNewElemValue800().length /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  PERFORM 8000-ADD-COMN-FIELD
              addComnField(programCtx.getAddComnFieldInCtx());/*8000-ADD-COMN-FIELD*/
          }
          else if  (		compareChars(methodIn.getFldName800(),methodIn.getDe22300()) == 0 ) { 
//  MOVE 'D002200000000' TO 800-NEW-ELEM
//  LITERAL_D002200000000 = 'D002200000000'
              methodOut.setNewElem800(CONSTANTS.LITERAL_D002200000000);
//  MOVE 800-FLD-LEN TO 800-NEW-ELEM-LEN
              methodOut.setNewElemLen800(methodOut.getFldLen800());
//  MOVE 800-FLD-VALUE (1 : 800-FLD-LEN ) TO 800-NEW-ELEM-VALUE
              methodOut.setNewElemValue800(methodOut.getFldValue800(),0/* fldValue800 */,methodOut.getFldLen800(),0 /* newElemValue800 */,methodOut.getNewElemValue800().length /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  PERFORM 8000-ADD-COMN-FIELD
              addComnField(programCtx.getAddComnFieldInCtx());/*8000-ADD-COMN-FIELD*/
          }
          else if  (		compareChars(methodIn.getFldName800(),methodIn.getType1300()) == 0 ) { 
//  MOVE 800-FLD-VALUE (1 : 800-FLD-LEN ) TO 800-TYPE1
              methodOut.setType1800(methodOut.getFldValue800(),0/* fldValue800 */,methodOut.getFldLen800(),0 /* type1800 */,methodOut.getType1800().length /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
          }
          else if  (		compareChars(methodIn.getFldName800(),methodIn.getIca1300()) == 0 ) { 
//  MOVE 800-FLD-VALUE (1 : 800-FLD-LEN ) TO 800-ICA1
              try {
              methodOut.setIca1800(CFUtil.getLong(substring(methodOut.getFldValue800(),0,methodOut.getFldLen800())));
              } catch(NumberFormatException e) {}
          }
          else if  (		compareChars(methodIn.getFldName800(),methodIn.getBin1300()) == 0 ) { 
//  MOVE 800-FLD-VALUE (1 : 800-FLD-LEN ) TO 800-BIN1
              try {
              methodOut.setBin1800(CFUtil.getLong(substring(methodOut.getFldValue800(),0,methodOut.getFldLen800())));
              } catch(NumberFormatException e) {}
          }
          else if  (		compareChars(methodIn.getFldName800(),methodIn.getMaid1300()) == 0 ) { 
//  MOVE 800-FLD-VALUE (1 : 800-FLD-LEN ) TO 800-MAID1
              try {
              methodOut.setMaid1800(CFUtil.getLong(substring(methodOut.getFldValue800(),0,methodOut.getFldLen800())));
              } catch(NumberFormatException e) {}
          }
          else if  (		compareChars(methodIn.getFldName800(),methodIn.getEndpoint1300()) == 0 ) { 
//  MOVE 800-FLD-VALUE (1 : 800-FLD-LEN ) TO 800-ENDPOINT1
              try {
              methodOut.setEndpoint1800(CFUtil.getLong(substring(methodOut.getFldValue800(),0,methodOut.getFldLen800())));
              } catch(NumberFormatException e) {}
          }
          else if  (		compareChars(methodIn.getFldName800(),methodIn.getType2300()) == 0 ) { 
//  MOVE 800-FLD-VALUE (1 : 800-FLD-LEN ) TO 800-TYPE2
              methodOut.setType2800(methodOut.getFldValue800(),0/* fldValue800 */,methodOut.getFldLen800(),0 /* type2800 */,methodOut.getType2800().length /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
          }
          else if  (		compareChars(methodIn.getFldName800(),methodIn.getIca2300()) == 0 ) { 
//  MOVE 800-FLD-VALUE (1 : 800-FLD-LEN ) TO 800-ICA2
              try {
              methodOut.setIca2800(CFUtil.getLong(substring(methodOut.getFldValue800(),0,methodOut.getFldLen800())));
              } catch(NumberFormatException e) {}
          }
          else if  (		compareChars(methodIn.getFldName800(),methodIn.getBin2300()) == 0 ) { 
//  MOVE 800-FLD-VALUE (1 : 800-FLD-LEN ) TO 800-BIN2
              try {
              methodOut.setBin2800(CFUtil.getLong(substring(methodOut.getFldValue800(),0,methodOut.getFldLen800())));
              } catch(NumberFormatException e) {}
          }
          else if  (		compareChars(methodIn.getFldName800(),methodIn.getMaid2300()) == 0 ) { 
//  MOVE 800-FLD-VALUE (1 : 800-FLD-LEN ) TO 800-MAID2
              try {
              methodOut.setMaid2800(CFUtil.getLong(substring(methodOut.getFldValue800(),0,methodOut.getFldLen800())));
              } catch(NumberFormatException e) {}
          }
          else if  (		compareChars(methodIn.getFldName800(),methodIn.getEndpoint2300()) == 0 ) { 
//  MOVE 800-FLD-VALUE (1 : 800-FLD-LEN ) TO 800-ENDPOINT2
              try {
              methodOut.setEndpoint2800(CFUtil.getLong(substring(methodOut.getFldValue800(),0,methodOut.getFldLen800())));
              } catch(NumberFormatException e) {}
          }
          else if  (		compareChars(methodIn.getFldName800(),methodIn.getDate300()) == 0 ) { 
//  MOVE 'D001200010000' TO 800-NEW-ELEM
//  LITERAL_D001200010000 = 'D001200010000'
              methodOut.setNewElem800(CONSTANTS.LITERAL_D001200010000);
//  MOVE 800-FLD-LEN TO 800-NEW-ELEM-LEN
              methodOut.setNewElemLen800(methodOut.getFldLen800());
//  MOVE 800-CUR-DT-YYMMDD TO 800-NEW-ELEM-VALUE (1 : 6)
              methodOut.getWorkAreas800().replace(methodOut.getWorkAreas800()/*parent*/,1266/*fromOffset - (newElemValue800) */,6/*fromLen*/,1349/*toOffset - (curDtYymmdd800) */,6/*toLen*/);
//  PERFORM 8000-ADD-COMN-FIELD
              addComnField(programCtx.getAddComnFieldInCtx());/*8000-ADD-COMN-FIELD*/

// * Get julian version of process date
              // MOVE 800-CUR-DT-YYMMDD TO IP67002-YYMMDD
              methodOut.setIp67002Yymmdd(methodOut.getCurDtYymmdd800().toCharArray());
//  SET 88-IP67002-CONVERT-TO-JULIAN TO TRUE
              methodOut.setIp67002ConvertToJulian88True(); 
              
//  PERFORM 8800-CALL-DATE-ROUTINE
              callDateRoutine(programCtx.getCallDateRoutineInCtx());/*8800-CALL-DATE-ROUTINE*/
              // MOVE IP67002-YYDDD TO 800-JULIAN-DATE
              methodOut.getWorkAreas800().replace(padSpaces(5,methodOut.getIp67002Yyddd().toCharArray()), /* beginIndex */1297, /* length */5);
          }
          else   { 
//  DISPLAY 'IP989010:FIELDNAME=' 800-FLD-NAME
              logger.info("IP989010:FIELDNAME={}", new String(methodIn.getFldName800())); 
//  MOVE 300-SYS003 TO 600-3006-FILE-DD
              methodOut.setFileDd6003006(methodOut.getSys003300());
//  MOVE 400-SYS003-RECS-READ TO 600-3006-REC-NUM
              methodOut.setRecNum6003006( methodOut.getSys003RecsRead400());
//  MOVE 300-3006-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(String.valueOf(methodOut.getAbendCode3003006String()).toCharArray());
              // MOVE 600-3006-ERROR-MSG TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getErrorMsg6003006().toCharArray());
//  MOVE 300-PARA-2310 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara2310300());
//  PERFORM 9100-ABEND-PROGRAM
              abendProgram(programCtx.getAbendProgramInCtx());/*9100-ABEND-PROGRAM*/
          }
      
      return methodOut;
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
      @Override
      public CopyComnFldsTo1240200OutCtx copyComnFldsTo1240200(CopyComnFldsTo1240200InCtx methodIn) throws Exception {
      
// ******************************************************************
// * Copy common field so to 1240 200 template
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
CopyComnFldsTo1240200OutCtx methodOut = methodIn.getCopyComnFldsTo1240200OutCtx();
//  PERFORM VARYING 500-COMN-NDX FROM 1 BY 1 UNTIL 500-COMN-NDX > 500-COMN-TBL-ITEMS
          for (methodOut.setComnNdx500(1); (	( methodOut.getComnNdx500() <= methodIn.getComnTblItems500() )) ; methodOut.setComnNdx500(methodOut.getComnNdx500() + 1) ) {
//  IF 500-COMN-TAG-KEY ( 500-COMN-NDX ) (1 : 5) NOT EQUAL 'P0122'
//  LITERAL_P0122 = 'P0122'
              if (!(Field.compareChar(methodOut.getComnTagKey500(methodOut.getComnNdx500() - 1).toCharArray() , CONSTANTS.LITERAL_P0122 , ( 0 /*start*/ ), 5 /*left len*/ , 5 /*right len*/))) { 
//  MOVE 500-COMN-TAG-KEY ( 500-COMN-NDX ) TO 800-NEW-ELEM
                  methodOut.setNewElem800(methodOut.getComnTagKey500(methodOut.getComnNdx500() - 1).toCharArray());
//  MOVE 500-COMN-TAG-LEN ( 500-COMN-NDX ) TO 800-NEW-ELEM-LEN
                  methodOut.setNewElemLen800(methodOut.getComnTagLen500(methodOut.getComnNdx500() - 1));
//  IF 500-COMN-TAG-LEN ( 500-COMN-NDX ) > 0
                  if (	( methodOut.getComnTagLen500(methodOut.getComnNdx500() - 1) > 0 )) { 
//  MOVE 500-COMN-TAG-VALUE ( 500-COMN-NDX ) (1 : 500-COMN-TAG-LEN ( 500-COMN-NDX )) TO 800-NEW-ELEM-VALUE
                      methodOut.setNewElemValue800(substring(methodOut.getComnTagValue500(methodOut.getComnNdx500() - 1),0,methodOut.getComnTagLen500(methodOut.getComnNdx500() - 1)));
                  }
//  ELSE
                  else { 
//  MOVE SPACES TO 800-NEW-ELEM-VALUE
                      methodOut.setNewElemValue800(CONSTANTS.SPACE_999);
                  }
//  PERFORM 8200-UPDATE-1240200-FIELD
                  update1240200Field(programCtx.getUpdate1240200FieldInCtx());/*8200-UPDATE-1240200-FIELD*/
              }
          }
      
      return methodOut;
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
      @Override
      public TrimFieldOutCtx trimField(TrimFieldInCtx methodIn) throws Exception {
      
// ******************************************************************
// * Trim trailing spaces from field
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
TrimFieldOutCtx methodOut = methodIn.getTrimFieldOutCtx();
//  MOVE 800-FLD-LEN TO 800-OLD-FLD-LEN
          methodOut.setOldFldLen800(methodOut.getFldLen800());
//  PERFORM VARYING 800-OLD-FLD-LEN FROM 800-FLD-LEN BY -1 UNTIL 800-FLD-VALUE ( 800-OLD-FLD-LEN : 1) NOT EQUAL SPACE OR 800-OLD-FLD-LEN = 0 END-PERFORM
          for (methodOut.setOldFldLen800(methodOut.getFldLen800()); (methodIn.getFldValue800()[(methodOut.getOldFldLen800() - 1)] == ' ' && 	( methodOut.getOldFldLen800() != 0 )) ; methodOut.setOldFldLen800(methodOut.getOldFldLen800() + -1) ) {
          }
//  MOVE 800-OLD-FLD-LEN TO 800-FLD-LEN
          methodOut.setFldLen800(methodOut.getOldFldLen800());
      
      return methodOut;
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
      @Override
      public PadFieldWithSpacesOutCtx padFieldWithSpaces(PadFieldWithSpacesInCtx methodIn) throws Exception {
      
// ******************************************************************
// * Pad field with trailing spaces
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
PadFieldWithSpacesOutCtx methodOut = methodIn.getPadFieldWithSpacesOutCtx();
//  MOVE 800-FLD-LEN TO 800-OLD-FLD-LEN
          methodOut.setOldFldLen800(methodOut.getFldLen800());
//  MOVE 800-PAD-LEN TO 800-FLD-LEN
          methodOut.setFldLen800(methodOut.getPadLen800());
//  MOVE SPACES TO 800-FLD-VALUE ( 800-OLD-FLD-LEN + 1 : 800-PAD-LEN - 800-OLD-FLD-LEN )
          methodOut.setFldValue800(replace(methodOut.getFldValue800(),CONSTANTS.SPACE,(methodOut.getOldFldLen800() + 1-1), (methodOut.getPadLen800() - methodOut.getOldFldLen800() + (methodOut.getOldFldLen800() + 1 - 1)) ));
      
      return methodOut;
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
      @Override
      public PadFieldWithZeroesOutCtx padFieldWithZeroes(PadFieldWithZeroesInCtx methodIn) throws Exception {
      
// ******************************************************************
// * Pad field with leading zeroes
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
PadFieldWithZeroesOutCtx methodOut = methodIn.getPadFieldWithZeroesOutCtx();
//  MOVE 800-FLD-LEN TO 800-OLD-FLD-LEN
          methodOut.setOldFldLen800(methodOut.getFldLen800());
//  MOVE 800-PAD-LEN TO 800-FLD-LEN
          methodOut.setFldLen800(methodOut.getPadLen800());
          methodOut.setFldStrt800((long)Math.abs(methodOut.getPadLen800() - methodOut.getOldFldLen800() + 1));
//  MOVE 800-FLD-VALUE (1 : 800-OLD-FLD-LEN ) TO 800-NEW-ELEM-VALUE (1 : 800-OLD-FLD-LEN )
          methodOut.setNewElemValue800(methodOut.getFldValue800(),0/* fldValue800 */ ,methodOut.getOldFldLen800(),0,methodOut.getOldFldLen800() /* field,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE 800-NEW-ELEM-VALUE (1 : 800-OLD-FLD-LEN ) TO 800-FLD-VALUE ( 800-FLD-STRT : 800-OLD-FLD-LEN )
          methodOut.setFldValue800(replace(methodOut.getFldValue800(),substring(methodOut.getNewElemValue800(),0,methodOut.getOldFldLen800()),((int) methodOut.getFldStrt800()-1), (methodOut.getOldFldLen800() + ((int) methodOut.getFldStrt800() - 1)) ));
//  MOVE ALL ZEROES TO 800-FLD-VALUE (1 : 800-FLD-STRT - 1)
          methodOut.setFldValue800(replace(methodOut.getFldValue800(),CONSTANTS.ZERO_65,0,(int) (methodOut.getFldStrt800() - 1)));
      
      return methodOut;
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
      @Override
      public Build1644697OutCtx build1644697(Build1644697InCtx methodIn) throws Exception {
      
// ******************************************************************

// * De071 sequence number
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
Build1644697OutCtx methodOut = methodIn.getBuild1644697OutCtx();
          // MOVE 1 TO 800-SEQ-NUM-8
          methodOut.setSeqNum8800((long)1);
//  MOVE 'D007100000000' TO 800-NEW-ELEM
//  LITERAL_D007100000000 = 'D007100000000'
          methodOut.setNewElem800(CONSTANTS.LITERAL_D007100000000);
          // MOVE 8 TO 800-NEW-ELEM-LEN
          methodOut.setNewElemLen800(8);
//  MOVE 800-SEQ-NUM-8 TO 800-NEW-ELEM-VALUE
          methodOut.setNewElemValue800(padSpaces(999, String.valueOf(methodOut.getSeqNum8800String()).toCharArray()));
//  PERFORM 8200-UPDATE-1644697-FIELD
          update1644697Field(programCtx.getUpdate1644697FieldInCtx());/*8200-UPDATE-1644697-FIELD*/

// * Pds0105 fileid

// * Pds0122
//  PERFORM 2420-GENERATE-FILEID
          generateFileid(programCtx.getGenerateFileidInCtx());/*2420-GENERATE-FILEID*/
          // MOVE 'P012200000000' TO 500-COMN-TBL-SRCH-KEY
          //  LITERAL_P012200000000 = 'P012200000000'
          methodOut.setComnTblSrchKey500(CONSTANTS.LITERAL_P012200000000);
//  PERFORM 8300-LOOKUP-COMN-FIELD
          lookupComnField(programCtx.getLookupComnFieldInCtx());/*8300-LOOKUP-COMN-FIELD*/
//  IF 500-COMN-SRCH-KEY-FND
          if ( methodIn.isComnSrchKeyFnd500()  ) { 
//  MOVE 500-COMN-TBL-SRCH-KEY TO 800-NEW-ELEM
              methodOut.setNewElem800(methodOut.getComnTblSrchKey500());
//  MOVE 500-COMN-TAG-LEN ( 500-COMN-NDX ) TO 800-NEW-ELEM-LEN
              methodOut.setNewElemLen800(methodOut.getComnTagLen500(methodIn.getComnNdx500() - 1));
//  MOVE 500-COMN-TAG-VALUE ( 500-COMN-NDX ) TO 800-NEW-ELEM-VALUE
              methodOut.setNewElemValue800(methodOut.getComnTagValue500(methodIn.getComnNdx500() - 1));
//  PERFORM 8200-UPDATE-1644697-FIELD
              update1644697Field(programCtx.getUpdate1644697FieldInCtx());/*8200-UPDATE-1644697-FIELD*/
          }
//  IF 1000-DISPLAY-MSG-TBLS
          if ( methodIn.isDisplayMsgTbls1000()  ) { 
//  DISPLAY '1000-DISPLAY-MSG-TBLS'
              logger.info("1000-DISPLAY-MSG-TBLS"); 
//  PERFORM 8400-DISPLAY-1644697-TABLE
              display1644697Table(programCtx.getDisplay1644697TableInCtx());/*8400-DISPLAY-1644697-TABLE*/
          }
      
      return methodOut;
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
      @Override
      public GenerateFileidOutCtx generateFileid(GenerateFileidInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			Random random = new Random(123);
			// End of variable declaration

      
// ******************************************************************
// * Generate a "unique" logical file id
// ******************************************************************

// * P0105s3 processor id
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
GenerateFileidOutCtx methodOut = methodIn.getGenerateFileidOutCtx();
//  MOVE 'P010500020000' TO 800-NEW-ELEM
//  LITERAL_P010500020000 = 'P010500020000'
          methodOut.setNewElem800(CONSTANTS.LITERAL_P010500020000);
          // MOVE 6 TO 800-NEW-ELEM-LEN
          methodOut.setNewElemLen800(6);
//  MOVE 800-CUR-DT-YYMMDD TO 800-NEW-ELEM-VALUE (1 : 800-NEW-ELEM-LEN )
          methodOut.getWorkAreas800().replace(methodOut.getWorkAreas800()/*parent*/,1266/*fromOffset - (newElemValue800) */,6/*fromLen*/,1349/*toOffset - (curDtYymmdd800) */,methodOut.getNewElemLen800()/*toLen*/);
//  PERFORM 8200-UPDATE-1644697-FIELD
          update1644697Field(programCtx.getUpdate1644697FieldInCtx());/*8200-UPDATE-1644697-FIELD*/
//  PERFORM 8200-UPDATE-1644695-FIELD
          update1644695Field(programCtx.getUpdate1644695FieldInCtx());/*8200-UPDATE-1644695-FIELD*/

// * P0105s3 processor id
//  MOVE 'P010500030000' TO 800-NEW-ELEM
//  LITERAL_P010500030000 = 'P010500030000'
          methodOut.setNewElem800(CONSTANTS.LITERAL_P010500030000);
          // MOVE 11 TO 800-NEW-ELEM-LEN
          methodOut.setNewElemLen800(11);
//  MOVE '00000001662' TO 800-NEW-ELEM-VALUE (1 : 800-NEW-ELEM-LEN )
//  LITERAL_00000001662 = '00000001662'
          methodOut.setNewElemValue800(replace(methodOut.getNewElemValue800(),CONSTANTS.LITERAL_00000001662,0,methodOut.getNewElemLen800()));
//  PERFORM 8200-UPDATE-1644697-FIELD
          update1644697Field(programCtx.getUpdate1644697FieldInCtx());/*8200-UPDATE-1644697-FIELD*/
//  PERFORM 8200-UPDATE-1644695-FIELD
          update1644695Field(programCtx.getUpdate1644695FieldInCtx());/*8200-UPDATE-1644695-FIELD*/

// * P0105s4 file sequence number
//  MOVE FUNCTION CURRENT-DATE (9 : 8) TO 800-SEED
          methodOut.setSeed800(CFUtil.getCurrentDate(timeZoneId));
          methodOut.setRandom800(BigDecimal.valueOf((new Random(methodOut.getSeed800())).nextDouble()));
//  MOVE 'P010500040000' TO 800-NEW-ELEM
//  LITERAL_P010500040000 = 'P010500040000'
          methodOut.setNewElem800(CONSTANTS.LITERAL_P010500040000);
          // MOVE 5 TO 800-NEW-ELEM-LEN
          methodOut.setNewElemLen800(5);
//  MOVE 800-RANDOM-P4-P8 TO 800-NEW-ELEM-VALUE (1 : 5)
          methodOut.getWorkAreas800().replace(methodOut.getWorkAreas800()/*parent*/,2378/*fromOffset - (newElemValue800) */,5/*fromLen*/,1349/*toOffset - (randomP4P8800) */,5/*toLen*/);
//  PERFORM 8200-UPDATE-1644697-FIELD
          update1644697Field(programCtx.getUpdate1644697FieldInCtx());/*8200-UPDATE-1644697-FIELD*/
//  PERFORM 8200-UPDATE-1644695-FIELD
          update1644695Field(programCtx.getUpdate1644695FieldInCtx());/*8200-UPDATE-1644695-FIELD*/
          // MOVE 'P010500000000' TO 500-1644697-TBL-SRCH-KEY
          //  LITERAL_P010500000000 = 'P010500000000'
          methodOut.setTblSrchKey5001644697(CONSTANTS.LITERAL_P010500000000);
//  PERFORM 8500-GET-1644697-FIELD
          get1644697Field(programCtx.getGet1644697FieldInCtx());/*8500-GET-1644697-FIELD*/
//  MOVE 800-FIELD-VAL (1 : 800-FIELD-LEN ) TO 800-FILEID
          methodOut.getWorkAreas800().replace(methodOut.getWorkAreas800()/*parent*/,239/*fromOffset - (fileid800) */,methodIn.getFieldLen800()/*fromLen*/,1238/*toOffset - (fieldVal800) */,25/*toLen*/);
      
      return methodOut;
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
      @Override
      public Build1644695OutCtx build1644695(Build1644695InCtx methodIn) throws Exception {
      
// ******************************************************************
// * Build 1644 695 trailer record
// ******************************************************************

// * De071 sequence number
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
Build1644695OutCtx methodOut = methodIn.getBuild1644695OutCtx();
//  ADD 1 TO 800-SEQ-NUM-8
          methodOut.setSeqNum8800(methodOut.getSeqNum8800()+(long)1);
//  MOVE 'D007100000000' TO 800-NEW-ELEM
//  LITERAL_D007100000000 = 'D007100000000'
          methodOut.setNewElem800(CONSTANTS.LITERAL_D007100000000);
          // MOVE 8 TO 800-NEW-ELEM-LEN
          methodOut.setNewElemLen800(8);
//  MOVE 800-SEQ-NUM-8 TO 800-NEW-ELEM-VALUE
          methodOut.setNewElemValue800(padSpaces(999, String.valueOf(methodOut.getSeqNum8800String()).toCharArray()));
//  PERFORM 8200-UPDATE-1644695-FIELD
          update1644695Field(programCtx.getUpdate1644695FieldInCtx());/*8200-UPDATE-1644695-FIELD*/
//  IF 1000-DISPLAY-MSG-TBLS
          if ( methodIn.isDisplayMsgTbls1000()  ) { 
//  PERFORM 8400-DISPLAY-1644695-TABLE
              display1644695Table(programCtx.getDisplay1644695TableInCtx());/*8400-DISPLAY-1644695-TABLE*/
          }
      
      return methodOut;
      }
      /**
      * processDetailFields 
      *   This method is derived from 
  *   COBOL Paragraph - 2500-PROCESS-DETAIL-FIELDS COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void processDetailFields(Ip989010Ctx programCtx) throws Exception {
      
// ******************************************************************
// * Process detail fields
// ******************************************************************
//  PERFORM 2510-MATCH-PAN-ALIAS
          matchPanAlias(programCtx.getMatchPanAliasInCtx());/*2510-MATCH-PAN-ALIAS*/
//  PERFORM 2520-ACCUMULATE-AMOUNT
          accumulateAmount(programCtx.getAccumulateAmountInCtx());/*2520-ACCUMULATE-AMOUNT*/
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
      @Override
      public MatchPanAliasOutCtx matchPanAlias(MatchPanAliasInCtx methodIn) throws Exception {
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
MatchPanAliasOutCtx methodOut = methodIn.getMatchPanAliasOutCtx();
//  IF IP98901-PAN-ALIAS = IP98902-PAN-ALIAS
//  ELSE
          if (		compareChars(methodIn.getIp98901PanAlias(),methodIn.getIp98902PanAlias()) != 0 ) { 
//  MOVE IP98902-PAN TO 800-PAN
              methodOut.setPan800(methodOut.getIp98902Pan());
//  IF 800-DONATION-AMOUNT GREATER THAN OR EQUAL IP98902-DONATION-UPPER-LIMIT
              if (	( methodOut.getDonationAmount800() >= methodIn.getIp98902DonationUpperLimit() ) ) { 
                  methodOut.setTrnAmt8001240((long)Math.abs(methodIn.getIp98902DonationUpperLimit()));
              }
//  ELSE
              else { 
                  methodOut.setTrnAmt8001240((long)Math.abs(methodOut.getDonationAmount800()));
              }
//  PERFORM 2510-DETERMINE-IRD
              determineIrd(programCtx.getDetermineIrdInCtx());/*2510-DETERMINE-IRD*/

// *** If final donation amount is zeroes, 1240 will not be built
// *** if ird is not determined          , 1240 will not be built
// *** above exception records will be written in separate file sys20
//  IF 800-1240-TRN-AMT NOT EQUAL TO ZEROES
              if (	( methodOut.getTrnAmt8001240() != 0 ) ) { 
//  IF 800-IRD EQUAL TO 300-VALUE-75 OR 300-VALUE-01 OR 300-VALUE-WA
                  if (		compareChars(methodIn.getIrd800(),methodIn.getValue75300()) == 0  || 		compareChars(methodIn.getIrd800(),methodIn.getValue01300()) == 0  || 		compareChars(methodIn.getIrd800(),methodIn.getValueWa300()) == 0 ) { 
//  PERFORM 2511-BUILD-1240200
                      build1240200(programCtx.getBuild1240200InCtx());/*2511-BUILD-1240200*/
//  PERFORM 8550-WRITE-1240200
                      write1240200(programCtx.getWrite1240200InCtx());/*8550-WRITE-1240200*/
//  PERFORM 2513-ACCUMULATE-COUNTS
                      accumulateCounts(programCtx.getAccumulateCountsInCtx());/*2513-ACCUMULATE-COUNTS*/
                  }
//  ELSE
                  else { 
//  PERFORM 8600-WRITE-EXCEPTION-RECORDS
                      writeExceptionRecords(programCtx.getWriteExceptionRecordsInCtx());/*8600-WRITE-EXCEPTION-RECORDS*/
                  }
              }
              // MOVE ZEROES TO 800-DONATION-AMOUNT
              methodOut.setDonationAmount800(0);
//  INITIALIZE IP9890H-PAYMENT-FILE-DATA
              methodOut.getIp9890hPaymentFileData().initialize();
              // MOVE ZEROES TO 800-1240-TRN-AMT
              methodOut.setTrnAmt8001240(0);
//  MOVE SPACES TO 800-PAN
              methodOut.setPan800(CONSTANTS.SPACE_16);
//  IF 100-EOF-SYS001
              if ( methodIn.isEofSys001100()  ) { 
//  SET 88-100-ALL-RECORDS-PRCD-Y TO TRUE
                  methodOut.setAllRecordsPrcdY88100True(); 
                  
              }
//  ELSE
              else { 
//  PERFORM 2512-SEARCH-REGISTRATIN-TABLE
                  searchRegistratinTable(programCtx.getSearchRegistratinTableInCtx());/*2512-SEARCH-REGISTRATIN-TABLE*/
              }
          }
      
      return methodOut;
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
      @Override
      public AccumulateCountsOutCtx accumulateCounts(AccumulateCountsInCtx methodIn) throws Exception {
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
AccumulateCountsOutCtx methodOut = methodIn.getAccumulateCountsOutCtx();
//  MOVE IP98902-PAN-ALIAS TO 501-PAN-ALIAS ( 501-DISPLAY-IDX )
          methodOut.setPanAlias501(methodOut.getDisplayIdx501() - 1,methodOut.getIp98902PanAlias());
//  MOVE IP98902-DONATION-UPPER-LIMIT TO 501-DONATION-LIMIT ( 501-DISPLAY-IDX )
          methodOut.setDonationLimit501(methodOut.getDisplayIdx501() - 1, methodOut.getIp98902DonationUpperLimit());
//  MOVE 800-DONATION-AMOUNT TO 501-CALC-DONATION-AMT ( 501-DISPLAY-IDX )
          methodOut.setCalcDonationAmt501(methodOut.getDisplayIdx501() - 1,methodOut.getDonationAmount800());
//  MOVE 800-1240-TRN-AMT TO 501-BUILT-DONATION-AMT ( 501-DISPLAY-IDX )
          methodOut.setBuiltDonationAmt501(methodOut.getDisplayIdx501() - 1,methodOut.getTrnAmt8001240());
//  SET 501-DISPLAY-IDX UP BY 1
          methodOut.setDisplayIdx501(methodOut.getDisplayIdx501() + 1); 
          
//  ADD 1 TO 501-ROW-COUNT
          methodOut.setRowCount501(methodOut.getRowCount501()+1);
      
      return methodOut;
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
      @Override
      public SearchRegistratinTableOutCtx searchRegistratinTable(SearchRegistratinTableInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			boolean keepSearching = true;
			int[] searchIndexes = null;
			int searchLowPoint = 0;
			int searchMidPoint = 0;
			int searchHighPoint = 0;
			int searchCompare = 0;
			// End of variable declaration

Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
SearchRegistratinTableOutCtx methodOut = methodIn.getSearchRegistratinTableOutCtx();
//  SET 500-SYS002-IDX TO 1
          methodOut.setSys002Idx500(1); 
          
//  SEARCH ALL 500-SYS002-DATA
          // Binary Search through methodIn.getSys002Table500().sys002Data500
          searchLowPoint = 0; //prevLowValue
          searchHighPoint = methodIn.getRowCount500(); //prevHighValue
          searchMidPoint = searchHighPoint / 2; //starting at mid point
          searchIndexes = new int[]{searchLowPoint,searchMidPoint,searchHighPoint};
          keepSearching = true;
          while (keepSearching) {
          // compare logic below
             searchCompare = compareAscending(methodIn.getPanAlias500(searchMidPoint),methodIn.getIp98901PanAlias());
          // end of compare logic
          	if (searchCompare == 0 ) { // if search found
          	      keepSearching = false;
          	     methodOut.setSys002Idx500(searchMidPoint + 1);
//  MOVE 500-REGISTRATION-FILE-DATA ( 500-SYS002-IDX ) TO IP98902-REGISTRATION-FILE-DATA
              methodOut.getIp98902RegistrationFileData().setString(methodOut.getRegistrationFileData500(methodOut.getSys002Idx500() - 1).toCharArray());
              // MOVE IP98901-PAYMENT-FILE-DATA TO IP9890H-PAYMENT-FILE-DATA
              methodOut.getIp9890hPaymentFileData().setString(methodOut.getIp98901PaymentFileData().getCharArray());
          	} else  {
          		adjustSearchIndex(searchCompare,searchIndexes);
          		searchLowPoint  = searchIndexes[0];
           		searchMidPoint  = searchIndexes[1];
           		searchHighPoint = searchIndexes[2];
           		if (searchMidPoint == -1) { // search exhausted
           		    keepSearching = false; 

// **** Pan not matched abend
//  DISPLAY 'MISSING PAN ALIAS : ' IP98901-PAN-ALIAS
              logger.info("MISSING PAN ALIAS : {}", new String(methodIn.getIp98901PanAlias())); 
//  MOVE 300-3017-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(String.valueOf(methodOut.getAbendCode3003017String()).toCharArray());
//  MOVE 600-3017-ERROR-MSG TO 900-ABEND-TEXT
              methodOut.setAbendText900(pad(99,methodOut.getErrorMsg6003017(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 300-PARA-2512 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara2512300());
//  PERFORM 9100-ABEND-PROGRAM
              abendProgram(programCtx.getAbendProgramInCtx());/*9100-ABEND-PROGRAM*/
           		}
          	}
          }
      
      return methodOut;
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
      @Override
      public DetermineIrdOutCtx determineIrd(DetermineIrdInCtx methodIn) throws Exception {
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
DetermineIrdOutCtx methodOut = methodIn.getDetermineIrdOutCtx();

// * Pds158s4 - ird (based on brand product)
//  MOVE SPACES TO 800-IRD
          methodOut.setIrd800(CONSTANTS.SPACE_2);
//  SET 88-100-IRD-SELECTED-N TO TRUE
          methodOut.setIrdSelectedN88100True(); 
          
//  MOVE SPACES TO 800-BRAND-PRODUCT
          methodOut.setBrandProduct800(CONSTANTS.SPACE_3);
//  MOVE ZEROES TO IP00404-TBL-40-AR-H
          methodOut.setIp00404Tbl40ArH(CONSTANTS.ZERO_19);
//  MOVE 800-PAN (1 : 16) TO IP00404-TBL-40-AR-H (1 : 16)
          methodOut.getIp00404Table().replace(methodIn.getWorkAreas800()/*parent*/,2348/*fromOffset - (ip00404Tbl40ArH) */,16/*fromLen*/,4/*toOffset - (pan800) */,16/*toLen*/);
//  CALL 800-PTR-IP280010
          // CALL 800-PTR-IP280010
          	programCtx.setRc( ip280010.process(programCtx.getGlobalCtx().getContext("IP280010")));
//  IF IP00404-ENTRIES-FOUND-COUNT IS GREATER THAN ZERO
          if (	( methodIn.getIp00404EntriesFoundCount() > 0 )) { 
//  PERFORM VARYING IP00404-ACCT-RNG-INDEX FROM 1 BY 1 UNTIL IP00404-ACCT-RNG-INDEX GREATER THAN IP00404-ENTRIES-FOUND-COUNT OR 88-100-IRD-SELECTED-Y
              for (methodOut.setIp00404AcctRngIndex(1); (	( methodOut.getIp00404AcctRngIndex() <= methodIn.getIp00404EntriesFoundCount() ) && !(methodOut.isIrdSelectedY88100()) ) ; methodOut.setIp00404AcctRngIndex(methodOut.getIp00404AcctRngIndex() + 1) ) {
//  MOVE IP00404-LICENSED-PROD-ID ( IP00404-ACCT-RNG-INDEX ) TO 800-BRAND-PRODUCT
                  methodOut.setBrandProduct800(methodOut.getIp00404LicensedProdId(methodOut.getIp00404AcctRngIndex() - 1));
//  EVALUATE TRUE
                  if  ( methodOut.isIrd75ValidBp88800()  ) { 
//  MOVE 300-VALUE-75 TO 800-IRD
                      methodOut.setIrd800(methodOut.getValue75300());
//  SET 88-100-IRD-SELECTED-Y TO TRUE
                      methodOut.setIrdSelectedY88100True(); 
                      
                  }
                  else if  ( methodOut.isIrd01ValidBp88800()  ) { 
//  MOVE 300-VALUE-01 TO 800-IRD
                      methodOut.setIrd800(methodOut.getValue01300());
//  SET 88-100-IRD-SELECTED-Y TO TRUE
                      methodOut.setIrdSelectedY88100True(); 
                      
                  }
                  else if  ( methodOut.isIrdwaValidBp88800()  ) { 
//  MOVE 300-VALUE-WA TO 800-IRD
                      methodOut.setIrd800(methodOut.getValueWa300());
//  SET 88-100-IRD-SELECTED-Y TO TRUE
                      methodOut.setIrdSelectedY88100True(); 
                      
                  }
                  else if  ( methodOut.isIrd65ValidBp88800()  ) { 
//  MOVE 300-VALUE-65 TO 800-IRD
                      methodOut.setIrd800(methodOut.getValue65300());
//  SET 88-100-IRD-SELECTED-Y TO TRUE
                      methodOut.setIrdSelectedY88100True(); 
                      
                  }
                  else   { 
//  MOVE SPACES TO 800-IRD
                      methodOut.setIrd800(CONSTANTS.SPACE_2);
                  }
              }
          }
      
      return methodOut;
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
      @Override
      public AccumulateAmountOutCtx accumulateAmount(AccumulateAmountInCtx methodIn) throws Exception {
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
AccumulateAmountOutCtx methodOut = methodIn.getAccumulateAmountOutCtx();
//  IF 88-IP98902-STATUS-ACTIVE
          if ( methodIn.isIp98902StatusActive88()  ) { 
//  ADD IP98902-DONATION-AMOUNT TO 800-DONATION-AMOUNT
              methodOut.setDonationAmount800(methodOut.getDonationAmount800()+(int) methodIn.getIp98902DonationAmount());
          }
//  ELSE
          else { 
//  DISPLAY 'INACTIVE RECORDS - SKIPPED'
              logger.info("INACTIVE RECORDS - SKIPPED"); 
          }
//  PERFORM 8000-READ-SYS001
          readSys001(programCtx.getReadSys001InCtx());/*8000-READ-SYS001*/
          ;
      
      return methodOut;
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
      @Override
      public Build1240200OutCtx build1240200(Build1240200InCtx methodIn) throws Exception {
      
// ******************************************************************
// * Build 1240 200 message
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
Build1240200OutCtx methodOut = methodIn.getBuild1240200OutCtx();
//  ADD 1 TO 800-SEQ-NUM-8
          methodOut.setSeqNum8800(methodOut.getSeqNum8800()+(long)1);

// * Detail fields

// * Arn

// * De033 transaction originator
//  PERFORM 2520-POPULATE-DETAIL-FIELDS
          populateDetailFields(programCtx.getPopulateDetailFieldsInCtx());/*2520-POPULATE-DETAIL-FIELDS*/
//  PERFORM 2530-POPULATE-ARN
          populateArn(programCtx.getPopulateArnInCtx());/*2530-POPULATE-ARN*/
//  MOVE 'D003300000000' TO 800-NEW-ELEM
//  LITERAL_D003300000000 = 'D003300000000'
          methodOut.setNewElem800(CONSTANTS.LITERAL_D003300000000);
          // MOVE 11 TO 800-NEW-ELEM-LEN
          methodOut.setNewElemLen800(11);
//  MOVE IP98902-CHARITY-ICA TO 800-NEW-ELEM-VALUE
          methodOut.setNewElemValue800(padSpaces(999, String.valueOf(methodOut.getIp98902CharityIcaString()).toCharArray()));
//  PERFORM 8200-UPDATE-1240200-FIELD
          update1240200Field(programCtx.getUpdate1240200FieldInCtx());/*8200-UPDATE-1240200-FIELD*/

// * De063s2 life cycle trace id
//  MOVE 800-CUR-DT-MM TO 800-DE63S2 (10 : 2)
          methodOut.getWorkAreas800().replace(methodOut.getWorkAreas800()/*parent*/,1268/*fromOffset - (de63s2800) */,2/*fromLen*/,213+10 - 1/*toOffset - (curDtMm800) */,2/*toLen*/);
//  MOVE 800-CUR-DT-DD TO 800-DE63S2 (12 : 2)
          methodOut.getWorkAreas800().replace(methodOut.getWorkAreas800()/*parent*/,1270/*fromOffset - (de63s2800) */,2/*fromLen*/,213+12 - 1/*toOffset - (curDtDd800) */,2/*toLen*/);
//  MOVE 'D006300020000' TO 800-NEW-ELEM
//  LITERAL_D006300020000 = 'D006300020000'
          methodOut.setNewElem800(CONSTANTS.LITERAL_D006300020000);
          // MOVE 15 TO 800-NEW-ELEM-LEN
          methodOut.setNewElemLen800(15);
//  MOVE 800-DE63S2 TO 800-NEW-ELEM-VALUE
          methodOut.setNewElemValue800(methodOut.getDe63s2800());
//  PERFORM 8200-UPDATE-1240200-FIELD
          update1240200Field(programCtx.getUpdate1240200FieldInCtx());/*8200-UPDATE-1240200-FIELD*/

// * De071 sequence number
//  MOVE 'D007100000000' TO 800-NEW-ELEM
//  LITERAL_D007100000000 = 'D007100000000'
          methodOut.setNewElem800(CONSTANTS.LITERAL_D007100000000);
          // MOVE 8 TO 800-NEW-ELEM-LEN
          methodOut.setNewElemLen800(8);
//  MOVE 800-SEQ-NUM-8 TO 800-NEW-ELEM-VALUE
          methodOut.setNewElemValue800(padSpaces(999, String.valueOf(methodOut.getSeqNum8800String()).toCharArray()));
//  PERFORM 8200-UPDATE-1240200-FIELD
          update1240200Field(programCtx.getUpdate1240200FieldInCtx());/*8200-UPDATE-1240200-FIELD*/

// * De093 transaction receiver
//  MOVE 'D009300000000' TO 800-NEW-ELEM
//  LITERAL_D009300000000 = 'D009300000000'
          methodOut.setNewElem800(CONSTANTS.LITERAL_D009300000000);
          // MOVE 11 TO 800-NEW-ELEM-LEN
          methodOut.setNewElemLen800(11);
//  MOVE IP9890H-ISSUER-ICA TO 800-NEW-ELEM-VALUE
          methodOut.setNewElemValue800(padSpaces(999, String.valueOf(methodOut.getIp9890hIssuerIcaString()).toCharArray()));
//  PERFORM 8200-UPDATE-1240200-FIELD
          update1240200Field(programCtx.getUpdate1240200FieldInCtx());/*8200-UPDATE-1240200-FIELD*/

// * De094 transaction sender
//  MOVE 'D009400000000' TO 800-NEW-ELEM
//  LITERAL_D009400000000 = 'D009400000000'
          methodOut.setNewElem800(CONSTANTS.LITERAL_D009400000000);
          // MOVE 11 TO 800-NEW-ELEM-LEN
          methodOut.setNewElemLen800(11);
//  MOVE IP98902-CHARITY-ICA TO 800-NEW-ELEM-VALUE
          methodOut.setNewElemValue800(padSpaces(999, String.valueOf(methodOut.getIp98902CharityIcaString()).toCharArray()));
//  PERFORM 8200-UPDATE-1240200-FIELD
          update1240200Field(programCtx.getUpdate1240200FieldInCtx());/*8200-UPDATE-1240200-FIELD*/
//  MOVE 'P017600000000' TO 800-NEW-ELEM
//  LITERAL_P017600000000 = 'P017600000000'
          methodOut.setNewElem800(CONSTANTS.LITERAL_P017600000000);
          // MOVE 6 TO 800-NEW-ELEM-LEN
          methodOut.setNewElemLen800(6);
//  IF IP98902-CHARITY-ICA EQUAL 800-ICA1
          if (	( methodOut.getIp98902CharityIca() == methodIn.getIca1800() )) { 
//  MOVE 800-MAID1 TO 800-FLD-VALUE (1 : 6)
              methodOut.setFldValue800(replace(methodOut.getFldValue800(),String.valueOf(methodOut.getMaid1800String()).toCharArray(),0,6));
              // MOVE 800-FLD-VALUE (1 : 6) TO 800-NEW-ELEM-VALUE
              methodOut.setNewElemValue800(methodOut.getFldValue800()/* fldValue800 */,0,6,0/* newElemValue800 */,methodOut.getNewElemValue800().length);
          }
//  ELSE
          else { 
//  IF IP98902-CHARITY-ICA EQUAL 800-ICA2
              if (	( methodOut.getIp98902CharityIca() == methodIn.getIca2800() )) { 
//  MOVE 800-MAID2 TO 800-FLD-VALUE (1 : 6)
                  methodOut.setFldValue800(replace(methodOut.getFldValue800(),String.valueOf(methodOut.getMaid2800String()).toCharArray(),0,6));
                  // MOVE 800-FLD-VALUE (1 : 6) TO 800-NEW-ELEM-VALUE
                  methodOut.setNewElemValue800(methodOut.getFldValue800()/* fldValue800 */,0,6,0/* newElemValue800 */,methodOut.getNewElemValue800().length);
              }
          }
//  PERFORM 8200-UPDATE-1240200-FIELD
          update1240200Field(programCtx.getUpdate1240200FieldInCtx());/*8200-UPDATE-1240200-FIELD*/

// * Pds158s4 - ird (based on brand product)
//  MOVE 'P015800040000' TO 800-NEW-ELEM
//  LITERAL_P015800040000 = 'P015800040000'
          methodOut.setNewElem800(CONSTANTS.LITERAL_P015800040000);
          // MOVE 2 TO 800-NEW-ELEM-LEN
          methodOut.setNewElemLen800(2);
//  MOVE 800-IRD (1 : 2) TO 800-NEW-ELEM-VALUE
          methodOut.getWorkAreas800().replace(methodOut.getWorkAreas800()/*parent*/,4632/*fromOffset - (newElemValue800) */,2/*fromLen*/,1349/*toOffset - (ird800) */,999/*toLen*/);
//  PERFORM 8200-UPDATE-1240200-FIELD
          update1240200Field(programCtx.getUpdate1240200FieldInCtx());/*8200-UPDATE-1240200-FIELD*/
//  IF 1000-DISPLAY-MSG-TBLS
          if ( methodIn.isDisplayMsgTbls1000()  ) { 
//  PERFORM 8400-DISPLAY-1240200-TABLE
              display1240200Table(programCtx.getDisplay1240200TableInCtx());/*8400-DISPLAY-1240200-TABLE*/
          }
      
      return methodOut;
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
      @Override
      public PopulateDetailFieldsOutCtx populateDetailFields(PopulateDetailFieldsInCtx methodIn) throws Exception {
      
// ******************************************************************
// * Populate detail fields
// ******************************************************************

// * De002 pan
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
PopulateDetailFieldsOutCtx methodOut = methodIn.getPopulateDetailFieldsOutCtx();
//  MOVE 'D000200000000' TO 800-NEW-ELEM
//  LITERAL_D000200000000 = 'D000200000000'
          methodOut.setNewElem800(CONSTANTS.LITERAL_D000200000000);
          // MOVE 16 TO 800-NEW-ELEM-LEN
          methodOut.setNewElemLen800(16);
//  MOVE 800-PAN TO 800-NEW-ELEM-VALUE
          methodOut.setNewElemValue800(methodOut.getPan800());
//  PERFORM 8200-UPDATE-1240200-FIELD
          update1240200Field(programCtx.getUpdate1240200FieldInCtx());/*8200-UPDATE-1240200-FIELD*/

// * De004 transaction amount
//  MOVE 'D000400000000' TO 800-NEW-ELEM
//  LITERAL_D000400000000 = 'D000400000000'
          methodOut.setNewElem800(CONSTANTS.LITERAL_D000400000000);
          // MOVE 12 TO 800-NEW-ELEM-LEN
          methodOut.setNewElemLen800(12);
//  MOVE 800-1240-TRN-AMT TO 800-NEW-ELEM-VALUE
          methodOut.setNewElemValue800(padSpaces(999, String.valueOf(methodOut.getTrnAmt8001240String()).toCharArray()));
//  PERFORM 8200-UPDATE-1240200-FIELD
          update1240200Field(programCtx.getUpdate1240200FieldInCtx());/*8200-UPDATE-1240200-FIELD*/

// * De43s1 card acceptor name
//  MOVE 'D004300010000' TO 800-NEW-ELEM
//  LITERAL_D004300010000 = 'D004300010000'
          methodOut.setNewElem800(CONSTANTS.LITERAL_D004300010000);
          // MOVE 22 TO 800-NEW-ELEM-LEN
          methodOut.setNewElemLen800(22);
//  IF IP98902-CHARITY-ICA EQUAL 800-ICA1
          if (	( methodIn.getIp98902CharityIca() == methodIn.getIca1800() )) { 
//  MOVE 800-TYPE1 TO 800-FLD-VALUE (1 : 22)
              methodOut.setFldValue800(replace(methodOut.getFldValue800(),methodOut.getType1800(),0,22));
              // MOVE 800-FLD-VALUE (1 : 22) TO 800-NEW-ELEM-VALUE
              methodOut.setNewElemValue800(methodOut.getFldValue800()/* fldValue800 */,0,22,0/* newElemValue800 */,methodOut.getNewElemValue800().length);
          }
//  ELSE
          else { 
//  IF IP98902-CHARITY-ICA EQUAL 800-ICA2
              if (	( methodIn.getIp98902CharityIca() == methodIn.getIca2800() )) { 
//  MOVE 800-TYPE2 TO 800-FLD-VALUE (1 : 22)
                  methodOut.setFldValue800(replace(methodOut.getFldValue800(),methodOut.getType2800(),0,22));
                  // MOVE 800-FLD-VALUE (1 : 22) TO 800-NEW-ELEM-VALUE
                  methodOut.setNewElemValue800(methodOut.getFldValue800()/* fldValue800 */,0,22,0/* newElemValue800 */,methodOut.getNewElemValue800().length);
              }
          }
//  PERFORM 8200-UPDATE-1240200-FIELD
          update1240200Field(programCtx.getUpdate1240200FieldInCtx());/*8200-UPDATE-1240200-FIELD*/
          ;
      
      return methodOut;
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
      @Override
      public PopulateArnOutCtx populateArn(PopulateArnInCtx methodIn) throws Exception {
      
// ******************************************************************
// * Populate arn (aquirer's reference number)
// *
// * de031s1 is populated from defaults file
// * de031s2 is populated from common fields
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
PopulateArnOutCtx methodOut = methodIn.getPopulateArnOutCtx();
//  MOVE 'D003100020000' TO 800-NEW-ELEM
//  LITERAL_D003100020000 = 'D003100020000'
          methodOut.setNewElem800(CONSTANTS.LITERAL_D003100020000);
          // MOVE 6 TO 800-NEW-ELEM-LEN
          methodOut.setNewElemLen800(6);
//  IF IP98902-CHARITY-ICA EQUAL 800-ICA1
          if (	( methodIn.getIp98902CharityIca() == methodIn.getIca1800() )) { 
//  MOVE 800-BIN1 TO 800-FLD-VALUE (1 : 6)
              methodOut.setFldValue800(replace(methodOut.getFldValue800(),String.valueOf(methodOut.getBin1800String()).toCharArray(),0,6));
//  MOVE 800-FLD-VALUE (1 : 6) TO 800-NEW-ELEM-VALUE 800-DE31-S2
              try {
              methodOut.setNewElemValue800(methodOut.getFldValue800(),0/* fldValue800 */,6,0 /* newElemValue800 */,methodOut.getNewElemValue800().length /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
              } catch(NumberFormatException e) {}
              try {
              methodOut.setDe31S2800(CFUtil.getLong(substring(methodOut.getFldValue800(),0,6)));
              } catch(NumberFormatException e) {}
          }
//  ELSE
          else { 
//  IF IP98902-CHARITY-ICA EQUAL 800-ICA2
              if (	( methodIn.getIp98902CharityIca() == methodIn.getIca2800() )) { 
//  MOVE 800-BIN2 TO 800-FLD-VALUE (1 : 6)
                  methodOut.setFldValue800(replace(methodOut.getFldValue800(),String.valueOf(methodOut.getBin2800String()).toCharArray(),0,6));
//  MOVE 800-FLD-VALUE (1 : 6) TO 800-NEW-ELEM-VALUE 800-DE31-S2
                  try {
                  methodOut.setNewElemValue800(methodOut.getFldValue800(),0/* fldValue800 */,6,0 /* newElemValue800 */,methodOut.getNewElemValue800().length /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
                  } catch(NumberFormatException e) {}
                  try {
                  methodOut.setDe31S2800(CFUtil.getLong(substring(methodOut.getFldValue800(),0,6)));
                  } catch(NumberFormatException e) {}
              }
          }
//  PERFORM 8200-UPDATE-1240200-FIELD
          update1240200Field(programCtx.getUpdate1240200FieldInCtx());/*8200-UPDATE-1240200-FIELD*/

// * De031s3 julian process date
//  MOVE 800-JULIAN-DATE (2 : 4) TO 800-DE31-S3
          methodOut.setDe31S3800( CFUtil.getInt(substring(methodOut.getJulianDate800String(),1,5)));
//  MOVE 'D003100030000' TO 800-NEW-ELEM
//  LITERAL_D003100030000 = 'D003100030000'
          methodOut.setNewElem800(CONSTANTS.LITERAL_D003100030000);
          // MOVE 4 TO 800-NEW-ELEM-LEN
          methodOut.setNewElemLen800(4);
//  MOVE 800-DE31-S3 TO 800-NEW-ELEM-VALUE
          methodOut.setNewElemValue800(padSpaces(999, String.valueOf(methodOut.getDe31S3800String()).toCharArray()));
//  PERFORM 8200-UPDATE-1240200-FIELD
          update1240200Field(programCtx.getUpdate1240200FieldInCtx());/*8200-UPDATE-1240200-FIELD*/

// * De031s4 acq sequence number
          // MOVE 800-SEQ-NUM-8 TO 800-DE31-S4
          methodOut.setDe31S4800(methodOut.getSeqNum8800());
//  MOVE 'D003100040000' TO 800-NEW-ELEM
//  LITERAL_D003100040000 = 'D003100040000'
          methodOut.setNewElem800(CONSTANTS.LITERAL_D003100040000);
          // MOVE 11 TO 800-NEW-ELEM-LEN
          methodOut.setNewElemLen800(11);
//  MOVE 800-DE31-S4 TO 800-NEW-ELEM-VALUE
          methodOut.setNewElemValue800(padSpaces(999, String.valueOf(methodOut.getDe31S4800String()).toCharArray()));
//  PERFORM 8200-UPDATE-1240200-FIELD
          update1240200Field(programCtx.getUpdate1240200FieldInCtx());/*8200-UPDATE-1240200-FIELD*/

// * De031s5 check digit
//  PERFORM 2535-CALC-CHECK-DIGIT
          calcCheckDigit(programCtx.getCalcCheckDigitInCtx());/*2535-CALC-CHECK-DIGIT*/
//  MOVE 'D003100050000' TO 800-NEW-ELEM
//  LITERAL_D003100050000 = 'D003100050000'
          methodOut.setNewElem800(CONSTANTS.LITERAL_D003100050000);
          // MOVE 1 TO 800-NEW-ELEM-LEN
          methodOut.setNewElemLen800(1);
//  MOVE 800-DE31-S5 TO 800-NEW-ELEM-VALUE
          methodOut.setNewElemValue800(padSpaces(999, String.valueOf(methodOut.getDe31S5800String()).toCharArray()));
//  PERFORM 8200-UPDATE-1240200-FIELD
          update1240200Field(programCtx.getUpdate1240200FieldInCtx());/*8200-UPDATE-1240200-FIELD*/
          ;
      
      return methodOut;
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
      @Override
      public CalcCheckDigitOutCtx calcCheckDigit(CalcCheckDigitInCtx methodIn) throws Exception {
      
// ******************************************************************
// * Calculate check digit for arn
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
CalcCheckDigitOutCtx methodOut = methodIn.getCalcCheckDigitOutCtx();
//  SET 88-100-IT-IS-ODD-BYTE TO TRUE
          methodOut.setItIsOddByte88100True(); 
          
//  MOVE ZEROS TO 800-ODD-EVEN-TOTAL
          methodOut.setOddEvenTotal800(0);
//  PERFORM VARYING 400-LOOP-CNTR FROM 1 BY 1 UNTIL 400-LOOP-CNTR GREATER 22
          for (methodOut.setLoopCntr400(1); (	( methodOut.getLoopCntr400() <= 22 )) ; methodOut.setLoopCntr400(methodOut.getLoopCntr400() + 1) ) {
//  IF 88-100-IT-IS-ODD-BYTE
              if ( methodOut.isItIsOddByte88100()  ) { 
//  MOVE 800-DE31-S1-S2-S3-S4 ( 400-LOOP-CNTR : 1) TO 800-CURRENT-BYTE
                  methodOut.setCurrentByte800(CFUtil.getInt(substring(methodOut.getDe31S1S2S3S4800().toCharArray(),(methodOut.getLoopCntr400()-1), (methodOut.getLoopCntr400() + 0) )));
//  ADD 800-CURRENT-BYTE TO 800-ODD-EVEN-TOTAL
                  methodOut.setOddEvenTotal800(methodOut.getOddEvenTotal800()+methodOut.getCurrentByte800());
//  SET 88-100-IT-IS-EVEN-BYTE TO TRUE
                  methodOut.setItIsEvenByte88100True(); 
                  
              }
//  ELSE
              else { 
//  MOVE 800-DE31-S1-S2-S3-S4 ( 400-LOOP-CNTR : 1) TO 800-CURRENT-BYTE
                  methodOut.setCurrentByte800(CFUtil.getInt(substring(methodOut.getDe31S1S2S3S4800().toCharArray(),(methodOut.getLoopCntr400()-1), (methodOut.getLoopCntr400() + 0) )));
//  MULTIPLY 800-CURRENT-BYTE BY 2 GIVING 800-EVEN-VALUE-DOUBLED
                  methodOut.setEvenValueDoubled800(methodOut.getCurrentByte800()*2);
//  ADD 800-EVEN-MSB 800-EVEN-LSB TO 800-ODD-EVEN-TOTAL
                  methodOut.setOddEvenTotal800(methodOut.getOddEvenTotal800()+methodIn.getEvenMsb800()+methodIn.getEvenLsb800());
//  SET 88-100-IT-IS-ODD-BYTE TO TRUE
                  methodOut.setItIsOddByte88100True(); 
                  
              }
          }
//  MOVE 800-ODD-EVEN-TOTAL (3 : 1) TO 800-CURRENT-BYTE
          methodOut.setCurrentByte800(CFUtil.getInt(substring(methodOut.getOddEvenTotal800String(),2,3)));
//  SUBTRACT 800-CURRENT-BYTE FROM 10 GIVING 800-DE31-S5
          methodOut.setDe31S5800(Math.abs(10-methodOut.getCurrentByte800()));
      
      return methodOut;
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
      @Override
      public WrapUpOutCtx wrapUp(WrapUpInCtx methodIn) throws Exception {
      
// ******************************************************************
// * Wrap up
// ******************************************************************

// * Write audit file
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
WrapUpOutCtx methodOut = methodIn.getWrapUpOutCtx();
//  MOVE 300-C TO SYS204-STATUS-CD
          methodOut.setSys204StatusCd(methodOut.getC300());
//  MOVE 400-SYS201-RECS-WRIT TO SYS204-IN-REC-CNT SYS204-OUT-REC-CNT
          methodOut.setSys204InRecCnt( methodOut.getSys201RecsWrit400());
          methodOut.setSys204OutRecCnt( methodOut.getSys201RecsWrit400());
//  PERFORM 3120-WRITE-SYS204
          writeSys204(programCtx.getWriteSys204InCtx());/*3120-WRITE-SYS204*/

// * Write file id file

// * Close files

// * Display file i-o counts
//  PERFORM 3100-UPDATE-FILEID-FILE
          updateFileidFile(programCtx.getUpdateFileidFileInCtx());/*3100-UPDATE-FILEID-FILE*/
//  PERFORM 3200-CLOSE-FILES
          closeFiles(programCtx.getCloseFilesInCtx());/*3200-CLOSE-FILES*/
//  MOVE 300-SYS001 TO 600-RECS-READ-DD
          methodOut.setRecsReadDd600(methodOut.getSys001300());
//  MOVE 400-SYS001-RECS-READ TO 600-RECS-READ-COUNT
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          methodOut.setRecsReadCount600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(methodOut.getSys001RecsRead400()).toCharArray()));
//  DISPLAY 600-TOTAL-RECS-READ-MSG
          logger.info(methodIn.getTotalRecsReadMsg600().toString()); 
//  MOVE 300-SYS003 TO 600-RECS-READ-DD
          methodOut.setRecsReadDd600(methodOut.getSys003300());
//  MOVE 400-SYS003-RECS-READ TO 600-RECS-READ-COUNT
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          methodOut.setRecsReadCount600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(methodOut.getSys003RecsRead400()).toCharArray()));
//  DISPLAY 600-TOTAL-RECS-READ-MSG
          logger.info(methodIn.getTotalRecsReadMsg600().toString()); 
//  MOVE 300-SYS004 TO 600-RECS-READ-DD
          methodOut.setRecsReadDd600(methodOut.getSys004300());
//  MOVE 400-SYS004-RECS-READ TO 600-RECS-READ-COUNT
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          methodOut.setRecsReadCount600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(methodOut.getSys004RecsRead400()).toCharArray()));
//  DISPLAY 600-TOTAL-RECS-READ-MSG
          logger.info(methodIn.getTotalRecsReadMsg600().toString()); 
//  MOVE 300-SYS101 TO 600-RECS-WRIT-DD
          methodOut.setRecsWritDd600(methodOut.getSys101300());
//  MOVE 400-SYS101-RECS-WRIT TO 600-RECS-WRIT-COUNT
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          methodOut.setRecsWritCount600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(methodOut.getSys101RecsWrit400()).toCharArray()));
//  DISPLAY 600-TOTAL-RECS-WRITTEN-MSG
          logger.info(methodIn.getTotalRecsWrittenMsg600().toString()); 
//  MOVE 300-SYS201 TO 600-RECS-WRIT-DD
          methodOut.setRecsWritDd600(methodOut.getSys201300());
//  MOVE 400-SYS201-RECS-WRIT TO 600-RECS-WRIT-COUNT
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          methodOut.setRecsWritCount600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(methodOut.getSys201RecsWrit400()).toCharArray()));
//  DISPLAY 600-TOTAL-RECS-WRITTEN-MSG
          logger.info(methodIn.getTotalRecsWrittenMsg600().toString()); 
//  MOVE 300-SYS202 TO 600-RECS-WRIT-DD
          methodOut.setRecsWritDd600(methodOut.getSys202300());
//  MOVE 400-SYS202-RECS-WRIT TO 600-RECS-WRIT-COUNT
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          methodOut.setRecsWritCount600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(methodOut.getSys202RecsWrit400()).toCharArray()));
//  DISPLAY 600-TOTAL-RECS-WRITTEN-MSG
          logger.info(methodIn.getTotalRecsWrittenMsg600().toString()); 
//  MOVE 300-SYS202 TO 600-RECS-WRIT-DD
          methodOut.setRecsWritDd600(methodOut.getSys202300());
//  MOVE 400-SYS202-RECS-WRIT TO 600-RECS-WRIT-COUNT
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          methodOut.setRecsWritCount600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(methodOut.getSys202RecsWrit400()).toCharArray()));
//  DISPLAY 600-TOTAL-RECS-WRITTEN-MSG
          logger.info(methodIn.getTotalRecsWrittenMsg600().toString()); 
//  MOVE 300-SYS204 TO 600-RECS-WRIT-DD
          methodOut.setRecsWritDd600(methodOut.getSys204300());
//  MOVE 400-SYS204-RECS-WRIT TO 600-RECS-WRIT-COUNT
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          methodOut.setRecsWritCount600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(methodOut.getSys204RecsWrit400()).toCharArray()));
//  DISPLAY 600-TOTAL-RECS-WRITTEN-MSG
          logger.info(methodIn.getTotalRecsWrittenMsg600().toString()); 
//  MOVE 300-SYS205 TO 600-RECS-WRIT-DD
          methodOut.setRecsWritDd600(methodOut.getSys205300());
//  MOVE 400-SYS205-RECS-WRIT TO 600-RECS-WRIT-COUNT
//  FORMAT_769933041 = "ZZZ,ZZZ,ZZ9"
          methodOut.setRecsWritCount600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_769933041,String.valueOf(methodOut.getSys205RecsWrit400()).toCharArray()));
//  DISPLAY 600-TOTAL-RECS-WRITTEN-MSG
          logger.info(methodIn.getTotalRecsWrittenMsg600().toString()); 
//  PERFORM 3200-DISPLAY-STATISTICS
          displayStatistics(programCtx.getDisplayStatisticsInCtx());/*3200-DISPLAY-STATISTICS*/
          ;
      
      return methodOut;
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
      @Override
      public DisplayStatisticsOutCtx displayStatistics(DisplayStatisticsInCtx methodIn) throws Exception {
      
// ******************************************************************
// * Update rewards file-id file
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
DisplayStatisticsOutCtx methodOut = methodIn.getDisplayStatisticsOutCtx();
//  DISPLAY 600-ALL-LINE-TEXT
          logger.info(new String(methodIn.getAllLineText600())); 
//  DISPLAY 600-HEADER-TEXT
          logger.info(new String(methodIn.getHeaderText600())); 
//  DISPLAY 600-LINE-TEXT
          logger.info(new String(methodIn.getLineText600())); 
//  SET 501-DISPLAY-IDX TO 1
          methodOut.setDisplayIdx501(1); 
          
//  PERFORM VARYING 501-DISPLAY-IDX FROM 1 BY 1 UNTIL 501-DISPLAY-IDX > 501-ROW-COUNT
          for (methodOut.setDisplayIdx501(1); (	( methodOut.getDisplayIdx501() <= methodIn.getRowCount501() )) ; methodOut.setDisplayIdx501(methodOut.getDisplayIdx501() + 1) ) {
//  MOVE 501-PAN-ALIAS ( 501-DISPLAY-IDX ) TO 600-PAN-ALIAS
              methodOut.setPanAlias600(methodOut.getPanAlias501(methodOut.getDisplayIdx501() - 1));
//  MOVE 501-DONATION-LIMIT ( 501-DISPLAY-IDX ) TO 600-DONATION-LIMT
//  FORMAT_1977136933 = "ZZ,ZZZ,ZZ9"
              methodOut.setDonationLimt600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1977136933,String.valueOf(methodOut.getDonationLimit501(methodOut.getDisplayIdx501() - 1)).toCharArray()));
//  MOVE 501-CALC-DONATION-AMT ( 501-DISPLAY-IDX ) TO 600-CALC-DONATION-AMT
//  FORMAT_1977136933 = "ZZ,ZZZ,ZZ9"
              methodOut.setCalcDonationAmt600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1977136933,String.valueOf(methodOut.getCalcDonationAmt501(methodOut.getDisplayIdx501() - 1)).toCharArray()));
//  MOVE 501-BUILT-DONATION-AMT ( 501-DISPLAY-IDX ) TO 600-BULT-DONATION-AMT
//  FORMAT_640531297 = "ZZZ,ZZZ,ZZZ,ZZ9"
              methodOut.setBultDonationAmt600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_640531297,String.valueOf(methodOut.getBuiltDonationAmt501(methodOut.getDisplayIdx501() - 1)).toCharArray()));
//  DISPLAY 600-DETAIL-TEXT
              logger.info(methodIn.getDetailText600().toString()); 
          }
//  DISPLAY 600-LINE-TEXT
          logger.info(new String(methodIn.getLineText600())); 
      
      return methodOut;
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
      @Override
      public UpdateFileidFileOutCtx updateFileidFile(UpdateFileidFileInCtx methodIn) throws Exception {
      
// ******************************************************************
// * Update rewards file-id file
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
UpdateFileidFileOutCtx methodOut = methodIn.getUpdateFileidFileOutCtx();
//  MOVE FUNCTION CURRENT-DATE TO IP16911-FILE-CREATE-DATE
          methodOut.setIp16911FileCreateDate( substring(CFUtil.getCurrentDate(timeZoneId),0,8));
//  MOVE 800-FILEID TO IP16911-REWARD-FILE-ID
          methodOut.setIp16911RewardFileId(methodOut.getFileid800());
//  MOVE 400-SYS201-RECS-WRIT TO 400-SYS201-CNT
          methodOut.setSys201Cnt400( methodOut.getSys201RecsWrit400());

// *    Subtract header and trailer from count
//  SUBTRACT 2 FROM 400-SYS201-CNT
          methodOut.setSys201Cnt400(Math.abs(methodOut.getSys201Cnt400()-(long)2));
//  MOVE 400-SYS201-CNT-X TO IP16911-FILE-MSG-CNT
          methodOut.setIp16911FileMsgCnt(methodOut.getSys201CntX400());
          // MOVE IP16911-REWARD-FILE-ID-RECORD TO SYS202-OUT-REC
          methodOut.getSys202OutRec().setString(methodOut.getIp16911RewardFileIdRecord().getCharArray());
//  PERFORM 3110-WRITE-SYS202
          writeSys202(programCtx.getWriteSys202InCtx());/*3110-WRITE-SYS202*/
          ;
      
      return methodOut;
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
      @Override
      public WriteSys201OutCtx writeSys201(WriteSys201InCtx methodIn) throws Exception {
      
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
WriteSys201OutCtx methodOut = methodIn.getWriteSys201OutCtx();
//  WRITE SYS201-OUT-REC
          sys201Out.setRecord(substring(methodOut.getSys201OutRec().toCharArray(),0,(int) methodIn.getSys201Rdw800()));
          sys201Out.write((int) methodIn.getSys201Rdw800()); 
          methodOut.setSys201Status800(sys201Out.getStatusString() );
//  IF 88-800-SYS201-GOOD
          if ( methodOut.isSys201Good88800()  ) { 
//  ADD 1 TO 400-SYS201-RECS-WRIT
              methodOut.setSys201RecsWrit400(methodOut.getSys201RecsWrit400()+1);
          }
//  ELSE
          else { 
//  MOVE 300-SYS201 TO 600-3004-FILE-DD
              methodOut.setFileDd6003004(methodOut.getSys201300());
//  MOVE 800-SYS201-STATUS TO 600-3004-FILE-STAT
              methodOut.setFileStat6003004(methodOut.getSys201Status800());
//  MOVE 300-3004-ABEND-CODE TO 600-ERROR-CODE
              methodOut.setErrorCode600(methodOut.getAbendCode3003004());
              // MOVE 600-3004-ERROR-MSG TO 600-ERROR-TEXT
              methodOut.setErrorText600(methodOut.getErrorMsg6003004().toCharArray());
//  MOVE 300-PARA-3110 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara3110300());
//  PERFORM 9100-ABEND-PROGRAM
              abendProgram(programCtx.getAbendProgramInCtx());/*9100-ABEND-PROGRAM*/
          }
      
      return methodOut;
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
      @Override
      public WriteSys202OutCtx writeSys202(WriteSys202InCtx methodIn) throws Exception {
      
// ******************************************************************
// * Write sys202
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
WriteSys202OutCtx methodOut = methodIn.getWriteSys202OutCtx();
//  WRITE SYS202-OUT-REC
          sys202Out.write(methodOut.getSys202OutRec().toCharArray()); 
          methodOut.getSys202OutRec().setString(CONSTANTS.LOW_VALUE_1253882920);
          methodOut.setSys202Status800(sys202Out.getStatusString() );
//  IF 88-800-SYS202-GOOD
          if ( methodOut.isSys202Good88800()  ) { 
//  ADD 1 TO 400-SYS202-RECS-WRIT
              methodOut.setSys202RecsWrit400(methodOut.getSys202RecsWrit400()+1);
          }
//  ELSE
          else { 
//  MOVE 300-SYS202 TO 600-3004-FILE-DD
              methodOut.setFileDd6003004(methodOut.getSys202300());
//  MOVE 800-SYS202-STATUS TO 600-3004-FILE-STAT
              methodOut.setFileStat6003004(methodOut.getSys202Status800());
//  MOVE 300-3004-ABEND-CODE TO 600-ERROR-CODE
              methodOut.setErrorCode600(methodOut.getAbendCode3003004());
              // MOVE 600-3004-ERROR-MSG TO 600-ERROR-TEXT
              methodOut.setErrorText600(methodOut.getErrorMsg6003004().toCharArray());
//  MOVE 300-PARA-3110 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara3110300());
//  PERFORM 9100-ABEND-PROGRAM
              abendProgram(programCtx.getAbendProgramInCtx());/*9100-ABEND-PROGRAM*/
          }
      
      return methodOut;
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
      @Override
      public WriteSys204OutCtx writeSys204(WriteSys204InCtx methodIn) throws Exception {
      
// ******************************************************************
// * Write sys204
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
WriteSys204OutCtx methodOut = methodIn.getWriteSys204OutCtx();
//  WRITE SYS204-OUT-REC
          sys204Out.write(methodOut.getSys204OutRec().toCharArray()); 
          methodOut.getSys204OutRec().setString(CONSTANTS.LOW_VALUE_1253885555);
          methodOut.setSys204Status800(sys204Out.getStatusString() );
//  IF 88-800-SYS204-GOOD
          if ( methodOut.isSys204Good88800()  ) { 
//  ADD 1 TO 400-SYS204-RECS-WRIT
              methodOut.setSys204RecsWrit400(methodOut.getSys204RecsWrit400()+1);
          }
//  ELSE
          else { 
//  MOVE 300-SYS204 TO 600-3004-FILE-DD
              methodOut.setFileDd6003004(methodOut.getSys204300());
//  MOVE 800-SYS204-STATUS TO 600-3004-FILE-STAT
              methodOut.setFileStat6003004(methodOut.getSys204Status800());
//  MOVE 300-3004-ABEND-CODE TO 600-ERROR-CODE
              methodOut.setErrorCode600(methodOut.getAbendCode3003004());
              // MOVE 600-3004-ERROR-MSG TO 600-ERROR-TEXT
              methodOut.setErrorText600(methodOut.getErrorMsg6003004().toCharArray());
//  MOVE 300-PARA-3120 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara3120300());
//  PERFORM 9100-ABEND-PROGRAM
              abendProgram(programCtx.getAbendProgramInCtx());/*9100-ABEND-PROGRAM*/
          }
      
      return methodOut;
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
      @Override
      public WriteExceptionRecordsOutCtx writeExceptionRecords(WriteExceptionRecordsInCtx methodIn) throws Exception {
      
// ******************************************************************
// * Write sys205
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
WriteExceptionRecordsOutCtx methodOut = methodIn.getWriteExceptionRecordsOutCtx();
//  WRITE SYS205-OUT-REC FROM IP9890H-PAYMENT-FILE-DATA
          sys205Out.write(methodIn.getIp9890hPaymentFileData().toCharArray()); 
          methodOut.getSys205OutRec().setString(CONSTANTS.LOW_VALUE_215725141);
          methodOut.setSys205Status800(sys205Out.getStatusString() );
//  IF 88-800-SYS205-GOOD
          if ( methodOut.isSys205Good88800()  ) { 
//  ADD 1 TO 400-SYS205-RECS-WRIT
              methodOut.setSys205RecsWrit400(methodOut.getSys205RecsWrit400()+1);
          }
//  ELSE
          else { 
//  MOVE 300-SYS205 TO 600-3004-FILE-DD
              methodOut.setFileDd6003004(methodOut.getSys205300());
//  MOVE 800-SYS205-STATUS TO 600-3004-FILE-STAT
              methodOut.setFileStat6003004(methodOut.getSys205Status800());
//  MOVE 300-3004-ABEND-CODE TO 600-ERROR-CODE
              methodOut.setErrorCode600(methodOut.getAbendCode3003004());
              // MOVE 600-3004-ERROR-MSG TO 600-ERROR-TEXT
              methodOut.setErrorText600(methodOut.getErrorMsg6003004().toCharArray());
//  MOVE 300-PARA-8600 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara8600300());
//  PERFORM 9100-ABEND-PROGRAM
              abendProgram(programCtx.getAbendProgramInCtx());/*9100-ABEND-PROGRAM*/
          }
      
      return methodOut;
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
      @Override
      public CloseFilesOutCtx closeFiles(CloseFilesInCtx methodIn) throws Exception {
      
// ******************************************************************
// * Close files
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
CloseFilesOutCtx methodOut = methodIn.getCloseFilesOutCtx();
//  IF 100-SYS001-OPEN
          if ( methodIn.isSys001Open100()  ) { 
//  CLOSE SYS001-IN
              sys001In.close(); 
              methodOut.setSys001Status800(sys001In.getStatusString() );
//  IF 88-800-SYS001-GOOD
              if ( methodIn.isSys001Good88800()  ) { 
//  SET 100-SYS001-CLOSED TO TRUE
                  methodOut.setSys001Closed100True(); 
                  
              }
          }
//  IF 100-SYS002-OPEN
          if ( methodIn.isSys002Open100()  ) { 
//  CLOSE SYS002-IN
              sys002In.close(); 
              methodOut.setSys002Status800(sys002In.getStatusString() );
//  IF 88-800-SYS002-GOOD
              if ( methodIn.isSys002Good88800()  ) { 
//  SET 100-SYS002-CLOSED TO TRUE
                  methodOut.setSys002Closed100True(); 
                  
              }
          }
//  IF 100-SYS003-OPEN
          if ( methodIn.isSys003Open100()  ) { 
//  CLOSE SYS003-IN
              sys003In.close(); 
              methodOut.setSys003Status800(sys003In.getStatusString() );
//  IF 88-800-SYS003-GOOD
              if ( methodIn.isSys003Good88800()  ) { 
//  SET 100-SYS003-CLOSED TO TRUE
                  methodOut.setSys003Closed100True(); 
                  
              }
          }
//  IF 100-SYS004-OPEN
          if ( methodIn.isSys004Open100()  ) { 
//  CLOSE SYS004-IN
              sys004In.close(); 
              methodOut.setSys004Status800(sys004In.getStatusString() );
//  IF 88-800-SYS004-GOOD
              if ( methodIn.isSys004Good88800()  ) { 
//  SET 100-SYS004-CLOSED TO TRUE
                  methodOut.setSys004Closed100True(); 
                  
              }
          }
//  IF 100-SYS101-OPEN
          if ( methodIn.isSys101Open100()  ) { 
//  CLOSE SYS101-OUT
              sys101Out.close(); 
              methodOut.setSys101Status800(sys101Out.getStatusString() );
//  IF 88-800-SYS101-GOOD
              if ( methodIn.isSys101Good88800()  ) { 
//  SET 100-SYS101-CLOSED TO TRUE
                  methodOut.setSys101Closed100True(); 
                  
              }
          }
//  IF 100-SYS201-OPEN
          if ( methodIn.isSys201Open100()  ) { 
//  CLOSE SYS201-OUT
              sys201Out.close(); 
              methodOut.setSys201Status800(sys201Out.getStatusString() );
//  IF 88-800-SYS201-GOOD
              if ( methodIn.isSys201Good88800()  ) { 
//  SET 100-SYS201-CLOSED TO TRUE
                  methodOut.setSys201Closed100True(); 
                  
              }
          }
//  IF 100-SYS202-OPEN
          if ( methodIn.isSys202Open100()  ) { 
//  CLOSE SYS202-OUT
              sys202Out.close(); 
              methodOut.setSys202Status800(sys202Out.getStatusString() );
//  IF 88-800-SYS202-GOOD
              if ( methodIn.isSys202Good88800()  ) { 
//  SET 100-SYS202-CLOSED TO TRUE
                  methodOut.setSys202Closed100True(); 
                  
              }
          }
//  IF 100-SYS204-OPEN
          if ( methodIn.isSys204Open100()  ) { 
//  CLOSE SYS204-OUT
              sys204Out.close(); 
              methodOut.setSys204Status800(sys204Out.getStatusString() );
//  IF 88-800-SYS204-GOOD
              if ( methodIn.isSys204Good88800()  ) { 
//  SET 100-SYS204-CLOSED TO TRUE
                  methodOut.setSys204Closed100True(); 
                  
              }
          }
      
      return methodOut;
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
      @Override
      public Add1240200FieldOutCtx add1240200Field(Add1240200FieldInCtx methodIn) throws Exception {
      
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
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
Add1240200FieldOutCtx methodOut = methodIn.getAdd1240200FieldOutCtx();
//  IF 500-1240200-TBL-ITEMS < 500-1240200-TBL-MAX
          if (	( methodOut.getTblItems5001240200() < methodOut.getTblMax5001240200() )) { 
//  ADD 1 TO 500-1240200-TBL-ITEMS
              methodOut.setTblItems5001240200(methodOut.getTblItems5001240200()+1);
//  SET 500-1240200-NDX TO 500-1240200-TBL-ITEMS
              methodOut.setNdx5001240200(methodOut.getTblItems5001240200()); 
              
//  MOVE 800-NEW-ELEM TO 500-1240200-TAG-KEY ( 500-1240200-NDX )
              methodOut.setTagKey5001240200(methodOut.getNdx5001240200() - 1,methodOut.getNewElem800());
//  MOVE 800-NEW-ELEM-LEN TO 500-1240200-TAG-LEN ( 500-1240200-NDX )
              methodOut.setTagLen5001240200(methodOut.getNdx5001240200() - 1,methodOut.getNewElemLen800());
//  MOVE 800-NEW-ELEM-VALUE TO 500-1240200-TAG-VALUE ( 500-1240200-NDX )
              methodOut.setTagValue5001240200(methodOut.getNdx5001240200() - 1,methodOut.getNewElemValue800());
//  IF 500-1240200-TBL-ITEMS > 1
              if (	( methodOut.getTblItems5001240200() > 1 )) { 
//  SET 500-1240200-NDX2 TO 500-1240200-NDX
                  methodOut.setNdx25001240200(methodOut.getNdx5001240200()); 
                  
//  SET 500-1240200-NDX2 DOWN BY 1
                  methodOut.setNdx25001240200(methodOut.getNdx25001240200() - 1); 
                  
//  IF 500-1240200-TAG-KEY ( 500-1240200-NDX ) < 500-1240200-TAG-KEY ( 500-1240200-NDX2 )
                  if (		compareChars(methodOut.getTagKey5001240200(methodOut.getNdx5001240200() - 1),methodOut.getTagKey5001240200(methodOut.getNdx25001240200() - 1)) < 0 ) { 
//  PERFORM 8100-SORT-1240200-FIELDS
                      sort1240200Fields(programCtx.getSort1240200FieldsInCtx());/*8100-SORT-1240200-FIELDS*/
                  }
              }
          }
//  ELSE
          else { 
//  SET 600-3008-TABLE-1240200 TO TRUE
              methodOut.setTable12402006003008True(); 
              
//  MOVE 500-1240200-TBL-MAX TO 600-3008-MAX-SIZE
              methodOut.setMaxSize6003008(String.valueOf(CFUtil.pad(8,String.valueOf(methodOut.getTblMax5001240200()),"0",CFUtil.LEFT_PAD)).toCharArray());
//  MOVE 300-3008-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(String.valueOf(methodOut.getAbendCode3003008String()).toCharArray());
              // MOVE 600-3008-ERROR-MSG TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getErrorMsg6003008().toCharArray());
//  MOVE 300-PARA-8000-1240200 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara80001240200300());
//  PERFORM 9100-ABEND-PROGRAM
              abendProgram(programCtx.getAbendProgramInCtx());/*9100-ABEND-PROGRAM*/
          }
      
      return methodOut;
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
      @Override
      public Sort1240200FieldsOutCtx sort1240200Fields(Sort1240200FieldsInCtx methodIn) throws Exception {
      
// ******************************************************************
// * Sort the :t: element table
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
Sort1240200FieldsOutCtx methodOut = methodIn.getSort1240200FieldsOutCtx();
//  PERFORM VARYING 500-1240200-NDX FROM 500-1240200-TBL-ITEMS BY -1 UNTIL 500-1240200-NDX <= 1
          for (methodOut.setNdx5001240200(methodIn.getTblItems5001240200()); (	( methodOut.getNdx5001240200() > 1 )) ; methodOut.setNdx5001240200(methodOut.getNdx5001240200() + -1) ) {
//  PERFORM VARYING 500-1240200-NDX2 FROM 1 BY 1 UNTIL 500-1240200-NDX2 >= 500-1240200-NDX
              for (methodOut.setNdx25001240200(1); (	( methodOut.getNdx25001240200() < methodOut.getNdx5001240200() )) ; methodOut.setNdx25001240200(methodOut.getNdx25001240200() + 1) ) {
//  IF 500-1240200-TAG-KEY ( 500-1240200-NDX ) < 500-1240200-TAG-KEY ( 500-1240200-NDX2 )
                  if (		compareChars(methodIn.getTagKey5001240200(methodOut.getNdx5001240200() - 1),methodIn.getTagKey5001240200(methodOut.getNdx25001240200() - 1)) < 0 ) { 
//  MOVE 500-1240200-TBL-ENTRY ( 500-1240200-NDX ) TO 800-SAVE-ENTRY
                      methodOut.setSaveEntry800(methodOut.getTblEntry5001240200(methodOut.getNdx5001240200() - 1).toCharArray());
//  MOVE 500-1240200-TBL-ENTRY ( 500-1240200-NDX2 ) TO 500-1240200-TBL-ENTRY ( 500-1240200-NDX )
                      methodOut.setTblEntry5001240200(methodOut.getNdx5001240200() - 1,methodOut.getTblEntry5001240200(methodOut.getNdx25001240200() - 1).toCharArray());
//  MOVE 800-SAVE-ENTRY TO 500-1240200-TBL-ENTRY ( 500-1240200-NDX2 )
                      methodOut.setTblEntry5001240200(methodOut.getNdx25001240200() - 1,methodOut.getSaveEntry800());
                  }
              }
          }
      
      return methodOut;
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
      @Override
      public Update1240200FieldOutCtx update1240200Field(Update1240200FieldInCtx methodIn) throws Exception {
      
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
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
Update1240200FieldOutCtx methodOut = methodIn.getUpdate1240200FieldOutCtx();
          // MOVE 800-NEW-ELEM TO 500-1240200-TBL-SRCH-KEY
          methodOut.setTblSrchKey5001240200(methodOut.getNewElem800());
//  PERFORM 8300-LOOKUP-1240200-FIELD
          lookup1240200Field(programCtx.getLookup1240200FieldInCtx());/*8300-LOOKUP-1240200-FIELD*/
//  IF 500-1240200-SRCH-KEY-FND
          if ( methodIn.isSrchKeyFnd5001240200()  ) { 
//  MOVE 800-NEW-ELEM TO 500-1240200-TAG-KEY ( 500-1240200-NDX )
              methodOut.setTagKey5001240200(methodIn.getNdx5001240200() - 1,methodOut.getNewElem800());
//  MOVE 800-NEW-ELEM-LEN TO 500-1240200-TAG-LEN ( 500-1240200-NDX )
              methodOut.setTagLen5001240200(methodIn.getNdx5001240200() - 1,methodOut.getNewElemLen800());
//  MOVE 800-NEW-ELEM-VALUE TO 500-1240200-TAG-VALUE ( 500-1240200-NDX )
              methodOut.setTagValue5001240200(methodIn.getNdx5001240200() - 1,methodOut.getNewElemValue800());
          }
//  ELSE
          else { 
//  PERFORM 8000-ADD-1240200-FIELD
              add1240200Field(programCtx.getAdd1240200FieldInCtx());/*8000-ADD-1240200-FIELD*/
          }
      
      return methodOut;
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
      @Override
      public Lookup1240200FieldOutCtx lookup1240200Field(Lookup1240200FieldInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			boolean keepSearching = true;
			int[] searchIndexes = null;
			int searchLowPoint = 0;
			int searchMidPoint = 0;
			int searchHighPoint = 0;
			int searchCompare = 0;
			// End of variable declaration

      
// ******************************************************************
// * Lookup a field in to the :t: element table
// *
// * note:
// * 500-:t:-srch-key should be populated with proper
// * search key before this paragraph is called
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
Lookup1240200FieldOutCtx methodOut = methodIn.getLookup1240200FieldOutCtx();
//  SET 500-1240200-NDX TO 1
          methodOut.setNdx5001240200(1); 
          
//  SEARCH ALL 500-1240200-TBL-ENTRY
          // Binary Search through methodIn.getElementsTable5001240200().tblEntry5001240200
          searchLowPoint = 0; //prevLowValue
          searchHighPoint = methodIn.getTblItems5001240200(); //prevHighValue
          searchMidPoint = searchHighPoint / 2; //starting at mid point
          searchIndexes = new int[]{searchLowPoint,searchMidPoint,searchHighPoint};
          keepSearching = true;
          while (keepSearching) {
          // compare logic below
             searchCompare = compareAscending(methodIn.getTagKey5001240200(searchMidPoint),methodIn.getTblSrchKey5001240200());
          // end of compare logic
          	if (searchCompare == 0 ) { // if search found
          	      keepSearching = false;
          	     methodOut.setNdx5001240200(searchMidPoint + 1);
//  SET 500-1240200-SRCH-KEY-FND TO TRUE
              methodOut.setSrchKeyFnd5001240200True(); 
              
          	} else  {
          		adjustSearchIndex(searchCompare,searchIndexes);
          		searchLowPoint  = searchIndexes[0];
           		searchMidPoint  = searchIndexes[1];
           		searchHighPoint = searchIndexes[2];
           		if (searchMidPoint == -1) { // search exhausted
           		    keepSearching = false; 
//  SET 500-1240200-SRCH-KEY-NOT-FND TO TRUE
              methodOut.setSrchKeyNotFnd5001240200True(); 
              
           		}
          	}
          }
      
      return methodOut;
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
      @Override
      public Display1240200TableOutCtx display1240200Table(Display1240200TableInCtx methodIn) throws Exception {
      
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
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
Display1240200TableOutCtx methodOut = methodIn.getDisplay1240200TableOutCtx();
//  DISPLAY '================================================'
          logger.info("================================================"); 
          // MOVE 'M000000000000' TO 500-1240200-TBL-SRCH-KEY
          //  LITERAL_M000000000000 = 'M000000000000'
          methodOut.setTblSrchKey5001240200(CONSTANTS.LITERAL_M000000000000);
//  PERFORM 8300-LOOKUP-1240200-FIELD
          lookup1240200Field(programCtx.getLookup1240200FieldInCtx());/*8300-LOOKUP-1240200-FIELD*/
//  IF 500-1240200-SRCH-KEY-FND
          if ( methodIn.isSrchKeyFnd5001240200()  ) { 
//  DISPLAY '= ' 500-1240200-TAG-VALUE ( 500-1240200-NDX ) (1 : 500-1240200-TAG-LEN ( 500-1240200-NDX ))
              logger.info("= {}", new String(substring(methodIn.getTagValue5001240200(methodOut.getNdx5001240200() - 1),0,methodIn.getTagLen5001240200(methodOut.getNdx5001240200() - 1)))); 
          }
          // MOVE 'D002400000000' TO 500-1240200-TBL-SRCH-KEY
          //  LITERAL_D002400000000 = 'D002400000000'
          methodOut.setTblSrchKey5001240200(CONSTANTS.LITERAL_D002400000000);
//  PERFORM 8300-LOOKUP-1240200-FIELD
          lookup1240200Field(programCtx.getLookup1240200FieldInCtx());/*8300-LOOKUP-1240200-FIELD*/
//  IF 500-1240200-SRCH-KEY-FND
          if ( methodIn.isSrchKeyFnd5001240200()  ) { 
//  DISPLAY '= ' 500-1240200-TAG-VALUE ( 500-1240200-NDX ) (1 : 500-1240200-TAG-LEN ( 500-1240200-NDX ))
              logger.info("= {}", new String(substring(methodIn.getTagValue5001240200(methodOut.getNdx5001240200() - 1),0,methodIn.getTagLen5001240200(methodOut.getNdx5001240200() - 1)))); 
          }
//  DISPLAY '= TABLE ELEMENTS'
          logger.info("= TABLE ELEMENTS"); 
//  DISPLAY '================================================'
          logger.info("================================================"); 
//  DISPLAY '     #   ' ' T' ' CODE' ' SUBF' ' OCCR' ' LEN' ' VALUE'
          logger.info("     #    T CODE SUBF OCCR LEN VALUE"); 
//  PERFORM VARYING 500-1240200-NDX FROM 1 BY 1 UNTIL 500-1240200-NDX > 500-1240200-TBL-ITEMS
          for (methodOut.setNdx5001240200(1); (	( methodOut.getNdx5001240200() <= methodIn.getTblItems5001240200() )) ; methodOut.setNdx5001240200(methodOut.getNdx5001240200() + 1) ) {
//  SET 800-PTR-VAL TO 500-1240200-NDX
              methodOut.setPtrVal800((int) methodOut.getNdx5001240200()); 
              
//  IF 500-1240200-TAG-LEN ( 500-1240200-NDX ) > 0
              if (	( methodIn.getTagLen5001240200(methodOut.getNdx5001240200() - 1) > 0 )) { 
//  DISPLAY ' ' 800-PTR-VAL ' ' 500-1240200-TAG-TYPE ( 500-1240200-NDX ) ' ' 500-1240200-TAG-NUM ( 500-1240200-NDX ) ' ' 500-1240200-TAG-SUBFLD-NO ( 500-1240200-NDX ) ' ' 500-1240200-TAG-OCCUR ( 500-1240200-NDX ) ' ' 500-1240200-TAG-LEN ( 500-1240200-NDX ) ' ' 500-1240200-TAG-VALUE ( 500-1240200-NDX ) (1 : 500-1240200-TAG-LEN ( 500-1240200-NDX ))
                  logger.info(" {} {} {} {} {} {} {}", String.valueOf(methodOut.getPtrVal800()), new String(methodIn.getTagType5001240200(methodOut.getNdx5001240200() - 1)), String.valueOf(methodIn.getTagNum5001240200(methodOut.getNdx5001240200() - 1)), String.valueOf(methodIn.getTagSubfldNo5001240200(methodOut.getNdx5001240200() - 1)), String.valueOf(methodIn.getTagOccur5001240200(methodOut.getNdx5001240200() - 1)), String.valueOf(methodIn.getTagLen5001240200(methodOut.getNdx5001240200() - 1)), new String(substring(methodIn.getTagValue5001240200(methodOut.getNdx5001240200() - 1),0,methodIn.getTagLen5001240200(methodOut.getNdx5001240200() - 1)))); 
              }
//  ELSE
              else { 
//  DISPLAY ' ' 800-PTR-VAL ' ' 500-1240200-TAG-TYPE ( 500-1240200-NDX ) ' ' 500-1240200-TAG-NUM ( 500-1240200-NDX ) ' ' 500-1240200-TAG-SUBFLD-NO ( 500-1240200-NDX ) ' ' 500-1240200-TAG-OCCUR ( 500-1240200-NDX ) ' ' 500-1240200-TAG-LEN ( 500-1240200-NDX ) ' ???'
                  logger.info(" {} {} {} {} {} {} ???", String.valueOf(methodOut.getPtrVal800()), new String(methodIn.getTagType5001240200(methodOut.getNdx5001240200() - 1)), String.valueOf(methodIn.getTagNum5001240200(methodOut.getNdx5001240200() - 1)), String.valueOf(methodIn.getTagSubfldNo5001240200(methodOut.getNdx5001240200() - 1)), String.valueOf(methodIn.getTagOccur5001240200(methodOut.getNdx5001240200() - 1)), String.valueOf(methodIn.getTagLen5001240200(methodOut.getNdx5001240200() - 1))); 
              }
          }
//  DISPLAY '================================================'
          logger.info("================================================"); 
      
      return methodOut;
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
      @Override
      public Get1240200FieldOutCtx get1240200Field(Get1240200FieldInCtx methodIn) throws Exception {
      
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
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
Get1240200FieldOutCtx methodOut = methodIn.getGet1240200FieldOutCtx();
//  PERFORM 8300-LOOKUP-1240200-FIELD
          lookup1240200Field(programCtx.getLookup1240200FieldInCtx());/*8300-LOOKUP-1240200-FIELD*/

// *    If data element has subfields; find first one
//  IF 500-1240200-SRCH-KEY-NOT-FND
          if ( methodIn.isSrchKeyNotFnd5001240200()  ) { 
//  MOVE '0001' TO 500-1240200-TBL-SRCH-KEY (6 : 4)
//  LITERAL_0001 = '0001'
              methodOut.setTblSrchKey5001240200(replace(methodOut.getTblSrchKey5001240200(),CONSTANTS.LITERAL_0001,5,9));
//  PERFORM 8300-LOOKUP-1240200-FIELD
              lookup1240200Field(programCtx.getLookup1240200FieldInCtx());/*8300-LOOKUP-1240200-FIELD*/
          }
//  IF 500-1240200-SRCH-KEY-FND
          if ( methodIn.isSrchKeyFnd5001240200()  ) { 
              // MOVE 1 TO 800-FIELD-PTR
              methodOut.setFieldPtr800(1);
              // MOVE 0 TO 800-FIELD-LEN
              methodOut.setFieldLen800(0);
//  PERFORM VARYING 500-1240200-NDX2 FROM 500-1240200-NDX BY 1 UNTIL 500-1240200-TAG-KEY ( 500-1240200-NDX2 ) (1 : 5) NOT EQUAL 500-1240200-TBL-SRCH-KEY (1 : 5) OR 500-1240200-NDX2 > 500-1240200-TBL-ITEMS
              for (methodOut.setNdx25001240200(methodIn.getNdx5001240200()); (		compareChars(substring(methodIn.getTagKey5001240200(methodOut.getNdx25001240200() - 1).toCharArray(),0,5),substring(methodOut.getTblSrchKey5001240200(),0,5)) == 0  && 	( methodOut.getNdx25001240200() <= methodIn.getTblItems5001240200() )) ; methodOut.setNdx25001240200(methodOut.getNdx25001240200() + 1) ) {
//  MOVE 500-1240200-TAG-VALUE ( 500-1240200-NDX2 ) (1 : 500-1240200-TAG-LEN ( 500-1240200-NDX2 )) TO 800-FIELD-VAL ( 800-FIELD-PTR : 500-1240200-TAG-LEN ( 500-1240200-NDX2 ))
                  methodOut.setFieldVal800(replace(methodOut.getFieldVal800(),substring(methodOut.getTagValue5001240200(methodOut.getNdx25001240200() - 1),0,methodIn.getTagLen5001240200(methodOut.getNdx25001240200() - 1)),(methodOut.getFieldPtr800()-1), (methodIn.getTagLen5001240200(methodOut.getNdx25001240200() - 1) + (methodOut.getFieldPtr800() - 1)) ));
//  ADD 500-1240200-TAG-LEN ( 500-1240200-NDX2 ) TO 800-FIELD-PTR 800-FIELD-LEN
                  methodOut.setFieldPtr800(methodOut.getFieldPtr800()+methodIn.getTagLen5001240200(methodOut.getNdx25001240200() - 1));
                  methodOut.setFieldLen800(methodOut.getFieldLen800()+methodIn.getTagLen5001240200(methodOut.getNdx25001240200() - 1));
              }
          }
//  ELSE
          else { 
//  MOVE SPACES TO 800-FIELD-VAL
              methodOut.setFieldVal800(CONSTANTS.SPACE_999);
              // MOVE 0 TO 800-FIELD-LEN
              methodOut.setFieldLen800(0);
          }
      
      return methodOut;
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
      @Override
      public void write1240200(Write1240200InCtx methodIn) throws Exception {
      
// ******************************************************************
// * Write message
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
//  IF 1000-WRITE-XML-MSGS
          if ( methodIn.isWriteXmlMsgs1000()  ) { 
//  PERFORM 8600-WRITE-1240200-XML
              write1240200Xml(programCtx.getWrite1240200XmlInCtx());/*8600-WRITE-1240200-XML*/
          }
//  IF 1000-WRITE-PSIPM-MSGS
          if ( methodIn.isWritePsipmMsgs1000()  ) { 
//  PERFORM 8700-WRITE-1240200-PSIPM
              write1240200Psipm(programCtx.getWrite1240200PsipmInCtx());/*8700-WRITE-1240200-PSIPM*/
          }
//  IF 1000-WRITE-IPM-MSGS
          if ( methodIn.isWriteIpmMsgs1000()  ) { 
//  PERFORM 8800-WRITE-1240200-IPM
              write1240200Ipm(programCtx.getWrite1240200IpmInCtx());/*8800-WRITE-1240200-IPM*/
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
      @Override
      public Write1240200XmlOutCtx write1240200Xml(Write1240200XmlInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			 final int MSG_END_TAG_300_LENGTH = 6;
			// End of variable declaration

      
// ******************************************************************
// * Write xml message
// ******************************************************************

// * Message header
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
Write1240200XmlOutCtx methodOut = methodIn.getWrite1240200XmlOutCtx();
//  SET 800-ILVL-1 TO TRUE
          methodOut.setIlvl1800True(); 
          
          methodOut.setSys101Rdw800((long)Math.abs(methodOut.getIlvl800() + MsgStrTag300.getMsgStrTag300FieldLength()));
          // MOVE 'M000000000000' TO 500-1240200-TBL-SRCH-KEY
          //  LITERAL_M000000000000 = 'M000000000000'
          methodOut.setTblSrchKey5001240200(CONSTANTS.LITERAL_M000000000000);
//  PERFORM 8500-GET-1240200-FIELD
          get1240200Field(programCtx.getGet1240200FieldInCtx());/*8500-GET-1240200-FIELD*/
//  MOVE 800-FIELD-VAL (1 : 800-FIELD-LEN ) TO 300-MSG-STR-MTI
          methodOut.setMsgStrMti300(CFUtil.getInt(substring(methodOut.getFieldVal800(),0,methodIn.getFieldLen800())));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-MSG-STR-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
          charArray = new ArrayList<char[]>();
             charArray.add(substring(methodIn.getIndent800(),0,methodOut.getIlvl800()));
             charArray.add(methodIn.getMsgStrTag300().toCharArray());
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
          updated = updateString(methodOut.getSys101OutRec().toCharArray() ,joinCharArray);
          methodOut.getSys101OutRec().setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
          writeSys101(programCtx.getWriteSys101InCtx());/*2200-WRITE-SYS101*/

// * Message details
//  SET 500-1240200-NDX TO 1
          methodOut.setNdx5001240200(1); 
          
//  PERFORM UNTIL 500-1240200-NDX > 500-1240200-TBL-ITEMS
          while ((	( methodOut.getNdx5001240200() <= methodIn.getTblItems5001240200() ))) {
//  EVALUATE 500-1240200-TAG-TYPE ( 500-1240200-NDX )
              if  (		compareChars(methodIn.getTagType5001240200(methodOut.getNdx5001240200() - 1),methodIn.getM300()) == 0 ) { 

// *            Skip tag since we already wrote message header
//  SET 500-1240200-NDX UP BY 1
                  methodOut.setNdx5001240200(methodOut.getNdx5001240200() + 1); 
                  
              }
              else if  (		compareChars(methodIn.getTagType5001240200(methodOut.getNdx5001240200() - 1),methodIn.getD300()) == 0 ) { 
//  PERFORM 8610-PROCESS-1240200-DE
                  process1240200De(programCtx.getProcess1240200DeInCtx());/*8610-PROCESS-1240200-DE*/
              }
              else if  (		compareChars(methodIn.getTagType5001240200(methodOut.getNdx5001240200() - 1),methodIn.getP300()) == 0 ) { 
//  PERFORM 8620-PROCESS-1240200-PDS
                  process1240200Pds(programCtx.getProcess1240200PdsInCtx());/*8620-PROCESS-1240200-PDS*/
              }
              else   { 
//  MOVE 500-COMN-TAG-TYPE ( 500-COMN-NDX ) TO 600-3009-TAG
                  methodOut.setTag6003009(methodOut.getComnTagType500(methodIn.getComnNdx500() - 1));
//  MOVE 300-3009-ABEND-CODE TO 900-ABEND-CODE
                  methodOut.setAbendCode900(String.valueOf(methodOut.getAbendCode3003009String()).toCharArray());
                  // MOVE 600-3009-ERROR-MSG TO 900-ABEND-TEXT
                  methodOut.setAbendText900(methodOut.getErrorMsg6003009().toCharArray());
//  MOVE '8600-WRITE-:T:-XML' TO 900-ABEND-PARA
                  methodOut.setAbendPara900(CONSTANTS.LITERAL_1572256913);
//  PERFORM 9100-ABEND-PROGRAM
                  abendProgram(programCtx.getAbendProgramInCtx());/*9100-ABEND-PROGRAM*/
              }
          }

// * Message trailer
//  SET 800-ILVL-1 TO TRUE
          methodOut.setIlvl1800True(); 
          
          methodOut.setSys101Rdw800((long)Math.abs(methodOut.getIlvl800() + MSG_END_TAG_300_LENGTH));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-MSG-END-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
          charArray = new ArrayList<char[]>();
             charArray.add(substring(methodIn.getIndent800(),0,methodOut.getIlvl800()));
             charArray.add(methodIn.getMsgEndTag300());
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
          updated = updateString(methodOut.getSys101OutRec().toCharArray() ,joinCharArray);
          methodOut.getSys101OutRec().setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
          writeSys101(programCtx.getWriteSys101InCtx());/*2200-WRITE-SYS101*/
          ;
      
      return methodOut;
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
      @Override
      public Process1240200DeOutCtx process1240200De(Process1240200DeInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			 final int DE_END_TAG_300_LENGTH = 5;
			// End of variable declaration

      
// ******************************************************************
// * Process de
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
Process1240200DeOutCtx methodOut = methodIn.getProcess1240200DeOutCtx();
//  IF 500-1240200-TAG-SUBFLD-NO ( 500-1240200-NDX ) > 0
          if (	( methodIn.getTagSubfldNo5001240200(methodOut.getNdx5001240200() - 1) > 0 )) { 
//  MOVE 500-1240200-TAG-NUM ( 500-1240200-NDX ) TO 300-DE-STR-CD
              methodOut.setDeStrCd300(methodOut.getTagNum5001240200(methodOut.getNdx5001240200() - 1));
//  SET 800-ILVL-2 TO TRUE
              methodOut.setIlvl2800True(); 
              
              methodOut.setSys101Rdw800((long)Math.abs(methodOut.getIlvl800() + DeStrTag300.getDeStrTag300FieldLength()));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-DE-STR-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(methodIn.getIndent800(),0,methodOut.getIlvl800()));
                 charArray.add(methodIn.getDeStrTag300().toCharArray());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getSys101OutRec().toCharArray() ,joinCharArray);
              methodOut.getSys101OutRec().setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
              writeSys101(programCtx.getWriteSys101InCtx());/*2200-WRITE-SYS101*/
//  MOVE 500-1240200-TAG-NUM ( 500-1240200-NDX ) TO 800-SAVE-TAG-NUM
              methodOut.setSaveTagNum800(methodOut.getTagNum5001240200(methodOut.getNdx5001240200() - 1));
//  PERFORM 8630-PROCESS-1240200-SUBFLD UNTIL 500-1240200-TAG-NUM ( 500-1240200-NDX ) NOT EQUAL 800-SAVE-TAG-NUM
              while (	( methodOut.getTagNum5001240200(methodOut.getNdx5001240200() - 1) == methodOut.getSaveTagNum800() )) {
                 process1240200Subfld(programCtx.getProcess1240200SubfldInCtx());/*8630-PROCESS-1240200-SUBFLD*/
              }
//  SET 800-ILVL-2 TO TRUE
              methodOut.setIlvl2800True(); 
              
              methodOut.setSys101Rdw800((long)Math.abs(methodOut.getIlvl800() + DE_END_TAG_300_LENGTH));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-DE-END-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(methodIn.getIndent800(),0,methodOut.getIlvl800()));
                 charArray.add(methodIn.getDeEndTag300());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getSys101OutRec().toCharArray() ,joinCharArray);
              methodOut.getSys101OutRec().setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
              writeSys101(programCtx.getWriteSys101InCtx());/*2200-WRITE-SYS101*/
          }
//  ELSE
          else { 
//  MOVE 500-1240200-TAG-NUM ( 500-1240200-NDX ) TO 300-DE-STR-CD
              methodOut.setDeStrCd300(methodOut.getTagNum5001240200(methodOut.getNdx5001240200() - 1));
//  SET 800-ILVL-2 TO TRUE
              methodOut.setIlvl2800True(); 
              
              methodOut.setSys101Rdw800((long)Math.abs(methodOut.getIlvl800() + DeStrTag300.getDeStrTag300FieldLength() + methodIn.getTagLen5001240200(methodOut.getNdx5001240200() - 1) + DE_END_TAG_300_LENGTH));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-DE-STR-TAG 500-1240200-TAG-VALUE ( 500-1240200-NDX ) (1 : 500-1240200-TAG-LEN ( 500-1240200-NDX )) 300-DE-END-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(methodIn.getIndent800(),0,methodOut.getIlvl800()));
                 charArray.add(methodIn.getDeStrTag300().toCharArray());
                 charArray.add(substring(methodIn.getTagValue5001240200(methodOut.getNdx5001240200() - 1),0,methodIn.getTagLen5001240200(methodOut.getNdx5001240200() - 1)));
                 charArray.add(methodIn.getDeEndTag300());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3));
              updated = updateString(methodOut.getSys101OutRec().toCharArray() ,joinCharArray);
              methodOut.getSys101OutRec().setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
              writeSys101(programCtx.getWriteSys101InCtx());/*2200-WRITE-SYS101*/
//  SET 500-1240200-NDX UP BY 1
              methodOut.setNdx5001240200(methodOut.getNdx5001240200() + 1); 
              
          }
      
      return methodOut;
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
      @Override
      public Process1240200PdsOutCtx process1240200Pds(Process1240200PdsInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			 final int PDS_END_TAG_300_LENGTH = 6;
			// End of variable declaration

      
// ******************************************************************
// * Process pds
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
Process1240200PdsOutCtx methodOut = methodIn.getProcess1240200PdsOutCtx();
//  IF 500-1240200-TAG-SUBFLD-NO ( 500-1240200-NDX ) > 0
          if (	( methodIn.getTagSubfldNo5001240200(methodOut.getNdx5001240200() - 1) > 0 )) { 
//  MOVE 500-1240200-TAG-NUM ( 500-1240200-NDX ) TO 300-PDS-STR-CD
              methodOut.setPdsStrCd300(methodOut.getTagNum5001240200(methodOut.getNdx5001240200() - 1));
//  SET 800-ILVL-2 TO TRUE
              methodOut.setIlvl2800True(); 
              
              methodOut.setSys101Rdw800((long)Math.abs(methodOut.getIlvl800() + PdsStrTag300.getPdsStrTag300FieldLength()));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-PDS-STR-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(methodIn.getIndent800(),0,methodOut.getIlvl800()));
                 charArray.add(methodIn.getPdsStrTag300().toCharArray());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getSys101OutRec().toCharArray() ,joinCharArray);
              methodOut.getSys101OutRec().setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
              writeSys101(programCtx.getWriteSys101InCtx());/*2200-WRITE-SYS101*/
//  MOVE 500-1240200-TAG-NUM ( 500-1240200-NDX ) TO 800-SAVE-TAG-NUM
              methodOut.setSaveTagNum800(methodOut.getTagNum5001240200(methodOut.getNdx5001240200() - 1));
//  PERFORM 8630-PROCESS-1240200-SUBFLD UNTIL 500-1240200-TAG-NUM ( 500-1240200-NDX ) NOT EQUAL 800-SAVE-TAG-NUM
              while (	( methodOut.getTagNum5001240200(methodOut.getNdx5001240200() - 1) == methodOut.getSaveTagNum800() )) {
                 process1240200Subfld(programCtx.getProcess1240200SubfldInCtx());/*8630-PROCESS-1240200-SUBFLD*/
              }
//  SET 800-ILVL-2 TO TRUE
              methodOut.setIlvl2800True(); 
              
              methodOut.setSys101Rdw800((long)Math.abs(methodOut.getIlvl800() + PDS_END_TAG_300_LENGTH));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-PDS-END-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(methodIn.getIndent800(),0,methodOut.getIlvl800()));
                 charArray.add(methodIn.getPdsEndTag300());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getSys101OutRec().toCharArray() ,joinCharArray);
              methodOut.getSys101OutRec().setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
              writeSys101(programCtx.getWriteSys101InCtx());/*2200-WRITE-SYS101*/
          }
//  ELSE
          else { 
//  MOVE 500-1240200-TAG-NUM ( 500-1240200-NDX ) TO 300-PDS-STR-CD
              methodOut.setPdsStrCd300(methodOut.getTagNum5001240200(methodOut.getNdx5001240200() - 1));
//  SET 800-ILVL-2 TO TRUE
              methodOut.setIlvl2800True(); 
              
              methodOut.setSys101Rdw800((long)Math.abs(methodOut.getIlvl800() + PdsStrTag300.getPdsStrTag300FieldLength() + methodIn.getTagLen5001240200(methodOut.getNdx5001240200() - 1) + PDS_END_TAG_300_LENGTH));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-PDS-STR-TAG 500-1240200-TAG-VALUE ( 500-1240200-NDX ) (1 : 500-1240200-TAG-LEN ( 500-1240200-NDX )) 300-PDS-END-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(methodIn.getIndent800(),0,methodOut.getIlvl800()));
                 charArray.add(methodIn.getPdsStrTag300().toCharArray());
                 charArray.add(substring(methodIn.getTagValue5001240200(methodOut.getNdx5001240200() - 1),0,methodIn.getTagLen5001240200(methodOut.getNdx5001240200() - 1)));
                 charArray.add(methodIn.getPdsEndTag300());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3));
              updated = updateString(methodOut.getSys101OutRec().toCharArray() ,joinCharArray);
              methodOut.getSys101OutRec().setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
              writeSys101(programCtx.getWriteSys101InCtx());/*2200-WRITE-SYS101*/
//  SET 500-1240200-NDX UP BY 1
              methodOut.setNdx5001240200(methodOut.getNdx5001240200() + 1); 
              
          }
      
      return methodOut;
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
      @Override
      public Process1240200SubfldOutCtx process1240200Subfld(Process1240200SubfldInCtx methodIn) throws Exception {
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
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
Process1240200SubfldOutCtx methodOut = methodIn.getProcess1240200SubfldOutCtx();
//  SET 800-ILVL-3 TO TRUE
          methodOut.setIlvl3800True(); 
          
          methodOut.setSys101Rdw800((long)Math.abs(methodOut.getIlvl800() + SUBFLD_TAG_STR_300_LENGTH + methodIn.getTagLen5001240200(methodOut.getNdx5001240200() - 1) + SUBFLD_TAG_END_300_LENGTH));
//  IF 500-1240200-TAG-LEN ( 500-1240200-NDX ) > 0
          if (	( methodIn.getTagLen5001240200(methodOut.getNdx5001240200() - 1) > 0 )) { 
//  STRING 800-INDENT (1 : 800-ILVL ) 300-SUBFLD-TAG-STR 500-1240200-TAG-VALUE ( 500-1240200-NDX ) (1 : 500-1240200-TAG-LEN ( 500-1240200-NDX )) 300-SUBFLD-TAG-END DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(methodIn.getIndent800(),0,methodOut.getIlvl800()));
                 charArray.add(methodIn.getSubfldTagStr300());
                 charArray.add(substring(methodIn.getTagValue5001240200(methodOut.getNdx5001240200() - 1),0,methodIn.getTagLen5001240200(methodOut.getNdx5001240200() - 1)));
                 charArray.add(methodIn.getSubfldTagEnd300());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3));
              updated = updateString(methodOut.getSys101OutRec().toCharArray() ,joinCharArray);
              methodOut.getSys101OutRec().setString(  (char[])updated.get("string"));
          }
//  ELSE
          else { 
//  STRING 800-INDENT (1 : 800-ILVL ) 300-SUBFLD-TAG-STR 300-SUBFLD-TAG-END DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(methodIn.getIndent800(),0,methodOut.getIlvl800()));
                 charArray.add(methodIn.getSubfldTagStr300());
                 charArray.add(methodIn.getSubfldTagEnd300());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2));
              updated = updateString(methodOut.getSys101OutRec().toCharArray() ,joinCharArray);
              methodOut.getSys101OutRec().setString(  (char[])updated.get("string"));
          }
//  PERFORM 2200-WRITE-SYS101
          writeSys101(programCtx.getWriteSys101InCtx());/*2200-WRITE-SYS101*/
//  SET 500-1240200-NDX UP BY 1
          methodOut.setNdx5001240200(methodOut.getNdx5001240200() + 1); 
          
      
      return methodOut;
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
      @Override
      public Write1240200PsipmOutCtx write1240200Psipm(Write1240200PsipmInCtx methodIn) throws Exception {
      
// ******************************************************************
// * Write pseudo ipm message
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
Write1240200PsipmOutCtx methodOut = methodIn.getWrite1240200PsipmOutCtx();
//  SET IP66601-USER-T TO 1
          methodOut.setIp66601UserT(1); 
          
//  MOVE 1 TO IP66601-USER-TCNT 800-FLD-STRT
          methodOut.setIp66601UserTcnt((short)1);
          methodOut.setFldStrt800((long)1);

// *    Write element tags to user tag table
//  PERFORM VARYING 500-1240200-NDX FROM 1 BY 1 UNTIL 500-1240200-NDX > 500-1240200-TBL-ITEMS
          for (methodOut.setNdx5001240200(1); (	( methodOut.getNdx5001240200() <= methodIn.getTblItems5001240200() )) ; methodOut.setNdx5001240200(methodOut.getNdx5001240200() + 1) ) {
//  SET IP66601-USER-T TO 500-1240200-NDX
              methodOut.setIp66601UserT(methodOut.getNdx5001240200()); 
              
//  EVALUATE 500-1240200-TAG-TYPE ( 500-1240200-NDX )
              switch(new String(methodIn.getTagType5001240200(methodOut.getNdx5001240200() - 1))){
              	case "M":
//  SET IP66601-USER-MTI-TAG ( IP66601-USER-T ) TO TRUE
                  methodOut.setIp66601UserMtiTagTrue(methodOut.getIp66601UserT() - 1); 
                  
              break;
              	case "D":
//  SET IP66601-USER-DE-TAG ( IP66601-USER-T ) TO TRUE
                  methodOut.setIp66601UserDeTagTrue(methodOut.getIp66601UserT() - 1); 
                  
              break;
              	case "P":
//  SET IP66601-USER-PDS-TAG ( IP66601-USER-T ) TO TRUE
                  methodOut.setIp66601UserPdsTagTrue(methodOut.getIp66601UserT() - 1); 
                  
              break;
              }
//  MOVE 500-1240200-TAG-NUM ( 500-1240200-NDX ) TO IP66601-USER-TAG-NO ( IP66601-USER-T )
              methodOut.setIp66601UserTagNo(methodOut.getIp66601UserT() - 1,(short) methodOut.getTagNum5001240200(methodOut.getNdx5001240200() - 1));
//  MOVE 500-1240200-TAG-OCCUR ( 500-1240200-NDX ) TO IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-T )
              methodOut.setIp66601UserTagOccurrence(methodOut.getIp66601UserT() - 1,(short) methodOut.getTagOccur5001240200(methodOut.getNdx5001240200() - 1));
//  MOVE 500-1240200-TAG-SUBFLD-NO ( 500-1240200-NDX ) TO IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-T )
              methodOut.setIp66601UserTagSubfldNo(methodOut.getIp66601UserT() - 1,(short) methodOut.getTagSubfldNo5001240200(methodOut.getNdx5001240200() - 1));
//  MOVE 800-FLD-STRT TO IP66601-USER-TAG-START ( IP66601-USER-T )
              methodOut.setIp66601UserTagStart(methodOut.getIp66601UserT() - 1,(short) methodOut.getFldStrt800());
//  MOVE 500-1240200-TAG-LEN ( 500-1240200-NDX ) TO IP66601-USER-TAG-LNGTH ( IP66601-USER-T )
              methodOut.setIp66601UserTagLngth(methodOut.getIp66601UserT() - 1,(short) methodOut.getTagLen5001240200(methodOut.getNdx5001240200() - 1));

// *    Write element content to message string
//  IF 500-1240200-TAG-LEN ( 500-1240200-NDX ) > 0
              if (	( methodOut.getTagLen5001240200(methodOut.getNdx5001240200() - 1) > 0 )) { 
//  MOVE 500-1240200-TAG-VALUE ( 500-1240200-NDX ) (1 : 500-1240200-TAG-LEN ( 500-1240200-NDX )) TO IP66102-NORMAL-IPM-MSG ( 800-FLD-STRT : IP66601-USER-TAG-LNGTH ( IP66601-USER-T ))
                  methodOut.setIp66102NormalIpmMsg(replace(methodOut.getIp66102NormalIpmMsg().toCharArray(),substring(methodOut.getTagValue5001240200(methodOut.getNdx5001240200() - 1),0,methodOut.getTagLen5001240200(methodOut.getNdx5001240200() - 1)),((int) methodOut.getFldStrt800()-1), (methodOut.getIp66601UserTagLngth(methodOut.getIp66601UserT() - 1) + ((int) methodOut.getFldStrt800() - 1)) ));
              }
//  ADD IP66601-USER-TAG-LNGTH ( IP66601-USER-T ) TO 800-FLD-STRT
              methodOut.setFldStrt800(methodOut.getFldStrt800()+(short) methodOut.getIp66601UserTagLngth(methodOut.getIp66601UserT() - 1));
          }

// *    Set ip66601-user-t     down by 1
//  SET IP66601-USER-TCNT TO IP66601-USER-T
          methodOut.setIp66601UserTcnt((short) (short) methodOut.getIp66601UserT()); 
          
          methodOut.setSys201Rdw800((long) (Math.abs(5 + methodOut.getFldStrt800() - 1 +  ( 24 * methodOut.getIp66601UserTcnt() ) )));
          methodOut.setTagTblPtr800((long) (Math.abs(5 + methodOut.getFldStrt800())));

// *    Write tag table pointer to sys201 record

// *    Write message string to sys201 record
//  MOVE 800-TAG-TBL-PTR TO SYS201-OUT-REC (1 : 5)
          methodOut.getSys201OutRec().replace(String.valueOf(methodOut.getTagTblPtr800String()).toCharArray(),0,String.valueOf(methodOut.getTagTblPtr800String()).length(),0,5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE IP66102-NORMAL-IPM-MSG (1 : 800-FLD-STRT ) TO SYS201-OUT-REC (6 : 800-FLD-STRT )
          methodOut.getSys201OutRec().replace(methodOut.getIp66102IpmMsg()/*parent*/,0/*fromOffset - (sys201OutRec) */,(int) methodOut.getFldStrt800()/*fromLen*/,0+6 - 1/*toOffset - (ip66102NormalIpmMsg) */,(int) methodOut.getFldStrt800()/*toLen*/);
          // MOVE 800-TAG-TBL-PTR TO 800-FLD-STRT
          methodOut.setFldStrt800(methodOut.getTagTblPtr800());

// *    Write tag table to sys201 record
//  PERFORM VARYING IP66601-USER-T FROM 1 BY 1 UNTIL IP66601-USER-T > IP66601-USER-TCNT
          for (methodOut.setIp66601UserT(1); (	( methodOut.getIp66601UserT() <= methodOut.getIp66601UserTcnt() ) ) ; methodOut.setIp66601UserT(methodOut.getIp66601UserT() + 1) ) {
//  MOVE IP66601-USER-TAG-TYPE ( IP66601-USER-T ) TO 800-TAG-TYPE
              methodOut.setTagType800(methodOut.getIp66601UserTagType(methodOut.getIp66601UserT() - 1));
//  MOVE IP66601-USER-TAG-NO ( IP66601-USER-T ) TO 800-TAG-NUM
              methodOut.setTagNum800(methodOut.getIp66601UserTagNo(methodOut.getIp66601UserT() - 1));
//  MOVE IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-T ) TO 800-TAG-OCCUR
              methodOut.setTagOccur800(methodOut.getIp66601UserTagOccurrence(methodOut.getIp66601UserT() - 1));
//  MOVE IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-T ) TO 800-TAG-SUBFLD-NO
              methodOut.setTagSubfldNo800(methodOut.getIp66601UserTagSubfldNo(methodOut.getIp66601UserT() - 1));
//  MOVE IP66601-USER-TAG-START ( IP66601-USER-T ) TO 800-TAG-START
              methodOut.setTagStart800(methodOut.getIp66601UserTagStart(methodOut.getIp66601UserT() - 1));
//  MOVE IP66601-USER-TAG-LNGTH ( IP66601-USER-T ) TO 800-TAG-LNGTH
              methodOut.setTagLngth800(methodOut.getIp66601UserTagLngth(methodOut.getIp66601UserT() - 1));
//  MOVE 800-TAG (1 : 24) TO SYS201-OUT-REC ( 800-FLD-STRT : 24)
              methodOut.getSys201OutRec().replace(methodIn.getWorkAreas800()/*parent*/,0/*fromOffset - (sys201OutRec) */,24/*fromLen*/,0+(int) methodOut.getFldStrt800() - 1/*toOffset - (tag800) */,24/*toLen*/);
//  ADD 24 TO 800-FLD-STRT
              methodOut.setFldStrt800(methodOut.getFldStrt800()+(long)24);
          }
//  PERFORM 3110-WRITE-SYS201
          writeSys201(programCtx.getWriteSys201InCtx());/*3110-WRITE-SYS201*/
          ;
      
      return methodOut;
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
      @Override
      public Write1240200IpmOutCtx write1240200Ipm(Write1240200IpmInCtx methodIn) throws Exception {
      
// ******************************************************************
// * Write ipm message
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
Write1240200IpmOutCtx methodOut = methodIn.getWrite1240200IpmOutCtx();
//  CALL 800-PTR-IP666010
          // CALL 800-PTR-IP666010
          	programCtx.setRc( ip666010.process(programCtx.getGlobalCtx().getContext("IP666010")));
      
      return methodOut;
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
      @Override
      public Add1644695FieldOutCtx add1644695Field(Add1644695FieldInCtx methodIn) throws Exception {
      
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
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
Add1644695FieldOutCtx methodOut = methodIn.getAdd1644695FieldOutCtx();
//  IF 500-1644695-TBL-ITEMS < 500-1644695-TBL-MAX
          if (	( methodOut.getTblItems5001644695() < methodOut.getTblMax5001644695() )) { 
//  ADD 1 TO 500-1644695-TBL-ITEMS
              methodOut.setTblItems5001644695(methodOut.getTblItems5001644695()+1);
//  SET 500-1644695-NDX TO 500-1644695-TBL-ITEMS
              methodOut.setNdx5001644695(methodOut.getTblItems5001644695()); 
              
//  MOVE 800-NEW-ELEM TO 500-1644695-TAG-KEY ( 500-1644695-NDX )
              methodOut.setTagKey5001644695(methodOut.getNdx5001644695() - 1,methodOut.getNewElem800());
//  MOVE 800-NEW-ELEM-LEN TO 500-1644695-TAG-LEN ( 500-1644695-NDX )
              methodOut.setTagLen5001644695(methodOut.getNdx5001644695() - 1,methodOut.getNewElemLen800());
//  MOVE 800-NEW-ELEM-VALUE TO 500-1644695-TAG-VALUE ( 500-1644695-NDX )
              methodOut.setTagValue5001644695(methodOut.getNdx5001644695() - 1,methodOut.getNewElemValue800());
//  IF 500-1644695-TBL-ITEMS > 1
              if (	( methodOut.getTblItems5001644695() > 1 )) { 
//  SET 500-1644695-NDX2 TO 500-1644695-NDX
                  methodOut.setNdx25001644695(methodOut.getNdx5001644695()); 
                  
//  SET 500-1644695-NDX2 DOWN BY 1
                  methodOut.setNdx25001644695(methodOut.getNdx25001644695() - 1); 
                  
//  IF 500-1644695-TAG-KEY ( 500-1644695-NDX ) < 500-1644695-TAG-KEY ( 500-1644695-NDX2 )
                  if (		compareChars(methodOut.getTagKey5001644695(methodOut.getNdx5001644695() - 1),methodOut.getTagKey5001644695(methodOut.getNdx25001644695() - 1)) < 0 ) { 
//  PERFORM 8100-SORT-1644695-FIELDS
                      sort1644695Fields(programCtx.getSort1644695FieldsInCtx());/*8100-SORT-1644695-FIELDS*/
                  }
              }
          }
//  ELSE
          else { 
//  SET 600-3008-TABLE-1644695 TO TRUE
              methodOut.setTable16446956003008True(); 
              
//  MOVE 500-1644695-TBL-MAX TO 600-3008-MAX-SIZE
              methodOut.setMaxSize6003008(String.valueOf(CFUtil.pad(8,String.valueOf(methodOut.getTblMax5001644695()),"0",CFUtil.LEFT_PAD)).toCharArray());
//  MOVE 300-3008-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(String.valueOf(methodOut.getAbendCode3003008String()).toCharArray());
              // MOVE 600-3008-ERROR-MSG TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getErrorMsg6003008().toCharArray());
//  MOVE 300-PARA-8000-1644695 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara80001644695300());
//  PERFORM 9100-ABEND-PROGRAM
              abendProgram(programCtx.getAbendProgramInCtx());/*9100-ABEND-PROGRAM*/
          }
      
      return methodOut;
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
      @Override
      public Sort1644695FieldsOutCtx sort1644695Fields(Sort1644695FieldsInCtx methodIn) throws Exception {
      
// ******************************************************************
// * Sort the :t: element table
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
Sort1644695FieldsOutCtx methodOut = methodIn.getSort1644695FieldsOutCtx();
//  PERFORM VARYING 500-1644695-NDX FROM 500-1644695-TBL-ITEMS BY -1 UNTIL 500-1644695-NDX <= 1
          for (methodOut.setNdx5001644695(methodIn.getTblItems5001644695()); (	( methodOut.getNdx5001644695() > 1 )) ; methodOut.setNdx5001644695(methodOut.getNdx5001644695() + -1) ) {
//  PERFORM VARYING 500-1644695-NDX2 FROM 1 BY 1 UNTIL 500-1644695-NDX2 >= 500-1644695-NDX
              for (methodOut.setNdx25001644695(1); (	( methodOut.getNdx25001644695() < methodOut.getNdx5001644695() )) ; methodOut.setNdx25001644695(methodOut.getNdx25001644695() + 1) ) {
//  IF 500-1644695-TAG-KEY ( 500-1644695-NDX ) < 500-1644695-TAG-KEY ( 500-1644695-NDX2 )
                  if (		compareChars(methodIn.getTagKey5001644695(methodOut.getNdx5001644695() - 1),methodIn.getTagKey5001644695(methodOut.getNdx25001644695() - 1)) < 0 ) { 
//  MOVE 500-1644695-TBL-ENTRY ( 500-1644695-NDX ) TO 800-SAVE-ENTRY
                      methodOut.setSaveEntry800(methodOut.getTblEntry5001644695(methodOut.getNdx5001644695() - 1).toCharArray());
//  MOVE 500-1644695-TBL-ENTRY ( 500-1644695-NDX2 ) TO 500-1644695-TBL-ENTRY ( 500-1644695-NDX )
                      methodOut.setTblEntry5001644695(methodOut.getNdx5001644695() - 1,methodOut.getTblEntry5001644695(methodOut.getNdx25001644695() - 1).toCharArray());
//  MOVE 800-SAVE-ENTRY TO 500-1644695-TBL-ENTRY ( 500-1644695-NDX2 )
                      methodOut.setTblEntry5001644695(methodOut.getNdx25001644695() - 1,methodOut.getSaveEntry800());
                  }
              }
          }
      
      return methodOut;
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
      @Override
      public Update1644695FieldOutCtx update1644695Field(Update1644695FieldInCtx methodIn) throws Exception {
      
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
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
Update1644695FieldOutCtx methodOut = methodIn.getUpdate1644695FieldOutCtx();
          // MOVE 800-NEW-ELEM TO 500-1644695-TBL-SRCH-KEY
          methodOut.setTblSrchKey5001644695(methodOut.getNewElem800());
//  PERFORM 8300-LOOKUP-1644695-FIELD
          lookup1644695Field(programCtx.getLookup1644695FieldInCtx());/*8300-LOOKUP-1644695-FIELD*/
//  IF 500-1644695-SRCH-KEY-FND
          if ( methodIn.isSrchKeyFnd5001644695()  ) { 
//  MOVE 800-NEW-ELEM TO 500-1644695-TAG-KEY ( 500-1644695-NDX )
              methodOut.setTagKey5001644695(methodIn.getNdx5001644695() - 1,methodOut.getNewElem800());
//  MOVE 800-NEW-ELEM-LEN TO 500-1644695-TAG-LEN ( 500-1644695-NDX )
              methodOut.setTagLen5001644695(methodIn.getNdx5001644695() - 1,methodOut.getNewElemLen800());
//  MOVE 800-NEW-ELEM-VALUE TO 500-1644695-TAG-VALUE ( 500-1644695-NDX )
              methodOut.setTagValue5001644695(methodIn.getNdx5001644695() - 1,methodOut.getNewElemValue800());
          }
//  ELSE
          else { 
//  PERFORM 8000-ADD-1644695-FIELD
              add1644695Field(programCtx.getAdd1644695FieldInCtx());/*8000-ADD-1644695-FIELD*/
          }
      
      return methodOut;
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
      @Override
      public Lookup1644695FieldOutCtx lookup1644695Field(Lookup1644695FieldInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			boolean keepSearching = true;
			int[] searchIndexes = null;
			int searchLowPoint = 0;
			int searchMidPoint = 0;
			int searchHighPoint = 0;
			int searchCompare = 0;
			// End of variable declaration

      
// ******************************************************************
// * Lookup a field in to the :t: element table
// *
// * note:
// * 500-:t:-srch-key should be populated with proper
// * search key before this paragraph is called
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
Lookup1644695FieldOutCtx methodOut = methodIn.getLookup1644695FieldOutCtx();
//  SET 500-1644695-NDX TO 1
          methodOut.setNdx5001644695(1); 
          
//  SEARCH ALL 500-1644695-TBL-ENTRY
          // Binary Search through methodIn.getElementsTable5001644695().tblEntry5001644695
          searchLowPoint = 0; //prevLowValue
          searchHighPoint = methodIn.getTblItems5001644695(); //prevHighValue
          searchMidPoint = searchHighPoint / 2; //starting at mid point
          searchIndexes = new int[]{searchLowPoint,searchMidPoint,searchHighPoint};
          keepSearching = true;
          while (keepSearching) {
          // compare logic below
             searchCompare = compareAscending(methodIn.getTagKey5001644695(searchMidPoint),methodIn.getTblSrchKey5001644695());
          // end of compare logic
          	if (searchCompare == 0 ) { // if search found
          	      keepSearching = false;
          	     methodOut.setNdx5001644695(searchMidPoint + 1);
//  SET 500-1644695-SRCH-KEY-FND TO TRUE
              methodOut.setSrchKeyFnd5001644695True(); 
              
          	} else  {
          		adjustSearchIndex(searchCompare,searchIndexes);
          		searchLowPoint  = searchIndexes[0];
           		searchMidPoint  = searchIndexes[1];
           		searchHighPoint = searchIndexes[2];
           		if (searchMidPoint == -1) { // search exhausted
           		    keepSearching = false; 
//  SET 500-1644695-SRCH-KEY-NOT-FND TO TRUE
              methodOut.setSrchKeyNotFnd5001644695True(); 
              
           		}
          	}
          }
      
      return methodOut;
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
      @Override
      public Display1644695TableOutCtx display1644695Table(Display1644695TableInCtx methodIn) throws Exception {
      
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
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
Display1644695TableOutCtx methodOut = methodIn.getDisplay1644695TableOutCtx();
//  DISPLAY '================================================'
          logger.info("================================================"); 
          // MOVE 'M000000000000' TO 500-1644695-TBL-SRCH-KEY
          //  LITERAL_M000000000000 = 'M000000000000'
          methodOut.setTblSrchKey5001644695(CONSTANTS.LITERAL_M000000000000);
//  PERFORM 8300-LOOKUP-1644695-FIELD
          lookup1644695Field(programCtx.getLookup1644695FieldInCtx());/*8300-LOOKUP-1644695-FIELD*/
//  IF 500-1644695-SRCH-KEY-FND
          if ( methodIn.isSrchKeyFnd5001644695()  ) { 
//  DISPLAY '= ' 500-1644695-TAG-VALUE ( 500-1644695-NDX ) (1 : 500-1644695-TAG-LEN ( 500-1644695-NDX ))
              logger.info("= {}", new String(substring(methodIn.getTagValue5001644695(methodOut.getNdx5001644695() - 1),0,methodIn.getTagLen5001644695(methodOut.getNdx5001644695() - 1)))); 
          }
          // MOVE 'D002400000000' TO 500-1644695-TBL-SRCH-KEY
          //  LITERAL_D002400000000 = 'D002400000000'
          methodOut.setTblSrchKey5001644695(CONSTANTS.LITERAL_D002400000000);
//  PERFORM 8300-LOOKUP-1644695-FIELD
          lookup1644695Field(programCtx.getLookup1644695FieldInCtx());/*8300-LOOKUP-1644695-FIELD*/
//  IF 500-1644695-SRCH-KEY-FND
          if ( methodIn.isSrchKeyFnd5001644695()  ) { 
//  DISPLAY '= ' 500-1644695-TAG-VALUE ( 500-1644695-NDX ) (1 : 500-1644695-TAG-LEN ( 500-1644695-NDX ))
              logger.info("= {}", new String(substring(methodIn.getTagValue5001644695(methodOut.getNdx5001644695() - 1),0,methodIn.getTagLen5001644695(methodOut.getNdx5001644695() - 1)))); 
          }
//  DISPLAY '= TABLE ELEMENTS'
          logger.info("= TABLE ELEMENTS"); 
//  DISPLAY '================================================'
          logger.info("================================================"); 
//  DISPLAY '     #   ' ' T' ' CODE' ' SUBF' ' OCCR' ' LEN' ' VALUE'
          logger.info("     #    T CODE SUBF OCCR LEN VALUE"); 
//  PERFORM VARYING 500-1644695-NDX FROM 1 BY 1 UNTIL 500-1644695-NDX > 500-1644695-TBL-ITEMS
          for (methodOut.setNdx5001644695(1); (	( methodOut.getNdx5001644695() <= methodIn.getTblItems5001644695() )) ; methodOut.setNdx5001644695(methodOut.getNdx5001644695() + 1) ) {
//  SET 800-PTR-VAL TO 500-1644695-NDX
              methodOut.setPtrVal800((int) methodOut.getNdx5001644695()); 
              
//  IF 500-1644695-TAG-LEN ( 500-1644695-NDX ) > 0
              if (	( methodIn.getTagLen5001644695(methodOut.getNdx5001644695() - 1) > 0 )) { 
//  DISPLAY ' ' 800-PTR-VAL ' ' 500-1644695-TAG-TYPE ( 500-1644695-NDX ) ' ' 500-1644695-TAG-NUM ( 500-1644695-NDX ) ' ' 500-1644695-TAG-SUBFLD-NO ( 500-1644695-NDX ) ' ' 500-1644695-TAG-OCCUR ( 500-1644695-NDX ) ' ' 500-1644695-TAG-LEN ( 500-1644695-NDX ) ' ' 500-1644695-TAG-VALUE ( 500-1644695-NDX ) (1 : 500-1644695-TAG-LEN ( 500-1644695-NDX ))
                  logger.info(" {} {} {} {} {} {} {}", String.valueOf(methodOut.getPtrVal800()), new String(methodIn.getTagType5001644695(methodOut.getNdx5001644695() - 1)), String.valueOf(methodIn.getTagNum5001644695(methodOut.getNdx5001644695() - 1)), String.valueOf(methodIn.getTagSubfldNo5001644695(methodOut.getNdx5001644695() - 1)), String.valueOf(methodIn.getTagOccur5001644695(methodOut.getNdx5001644695() - 1)), String.valueOf(methodIn.getTagLen5001644695(methodOut.getNdx5001644695() - 1)), new String(substring(methodIn.getTagValue5001644695(methodOut.getNdx5001644695() - 1),0,methodIn.getTagLen5001644695(methodOut.getNdx5001644695() - 1)))); 
              }
//  ELSE
              else { 
//  DISPLAY ' ' 800-PTR-VAL ' ' 500-1644695-TAG-TYPE ( 500-1644695-NDX ) ' ' 500-1644695-TAG-NUM ( 500-1644695-NDX ) ' ' 500-1644695-TAG-SUBFLD-NO ( 500-1644695-NDX ) ' ' 500-1644695-TAG-OCCUR ( 500-1644695-NDX ) ' ' 500-1644695-TAG-LEN ( 500-1644695-NDX ) ' ???'
                  logger.info(" {} {} {} {} {} {} ???", String.valueOf(methodOut.getPtrVal800()), new String(methodIn.getTagType5001644695(methodOut.getNdx5001644695() - 1)), String.valueOf(methodIn.getTagNum5001644695(methodOut.getNdx5001644695() - 1)), String.valueOf(methodIn.getTagSubfldNo5001644695(methodOut.getNdx5001644695() - 1)), String.valueOf(methodIn.getTagOccur5001644695(methodOut.getNdx5001644695() - 1)), String.valueOf(methodIn.getTagLen5001644695(methodOut.getNdx5001644695() - 1))); 
              }
          }
//  DISPLAY '================================================'
          logger.info("================================================"); 
      
      return methodOut;
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
      @Override
      public Get1644695FieldOutCtx get1644695Field(Get1644695FieldInCtx methodIn) throws Exception {
      
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
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
Get1644695FieldOutCtx methodOut = methodIn.getGet1644695FieldOutCtx();
//  PERFORM 8300-LOOKUP-1644695-FIELD
          lookup1644695Field(programCtx.getLookup1644695FieldInCtx());/*8300-LOOKUP-1644695-FIELD*/

// *    If data element has subfields; find first one
//  IF 500-1644695-SRCH-KEY-NOT-FND
          if ( methodIn.isSrchKeyNotFnd5001644695()  ) { 
//  MOVE '0001' TO 500-1644695-TBL-SRCH-KEY (6 : 4)
//  LITERAL_0001 = '0001'
              methodOut.setTblSrchKey5001644695(replace(methodOut.getTblSrchKey5001644695(),CONSTANTS.LITERAL_0001,5,9));
//  PERFORM 8300-LOOKUP-1644695-FIELD
              lookup1644695Field(programCtx.getLookup1644695FieldInCtx());/*8300-LOOKUP-1644695-FIELD*/
          }
//  IF 500-1644695-SRCH-KEY-FND
          if ( methodIn.isSrchKeyFnd5001644695()  ) { 
              // MOVE 1 TO 800-FIELD-PTR
              methodOut.setFieldPtr800(1);
              // MOVE 0 TO 800-FIELD-LEN
              methodOut.setFieldLen800(0);
//  PERFORM VARYING 500-1644695-NDX2 FROM 500-1644695-NDX BY 1 UNTIL 500-1644695-TAG-KEY ( 500-1644695-NDX2 ) (1 : 5) NOT EQUAL 500-1644695-TBL-SRCH-KEY (1 : 5) OR 500-1644695-NDX2 > 500-1644695-TBL-ITEMS
              for (methodOut.setNdx25001644695(methodIn.getNdx5001644695()); (		compareChars(substring(methodIn.getTagKey5001644695(methodOut.getNdx25001644695() - 1).toCharArray(),0,5),substring(methodOut.getTblSrchKey5001644695(),0,5)) == 0  && 	( methodOut.getNdx25001644695() <= methodIn.getTblItems5001644695() )) ; methodOut.setNdx25001644695(methodOut.getNdx25001644695() + 1) ) {
//  MOVE 500-1644695-TAG-VALUE ( 500-1644695-NDX2 ) (1 : 500-1644695-TAG-LEN ( 500-1644695-NDX2 )) TO 800-FIELD-VAL ( 800-FIELD-PTR : 500-1644695-TAG-LEN ( 500-1644695-NDX2 ))
                  methodOut.setFieldVal800(replace(methodOut.getFieldVal800(),substring(methodOut.getTagValue5001644695(methodOut.getNdx25001644695() - 1),0,methodIn.getTagLen5001644695(methodOut.getNdx25001644695() - 1)),(methodOut.getFieldPtr800()-1), (methodIn.getTagLen5001644695(methodOut.getNdx25001644695() - 1) + (methodOut.getFieldPtr800() - 1)) ));
//  ADD 500-1644695-TAG-LEN ( 500-1644695-NDX2 ) TO 800-FIELD-PTR 800-FIELD-LEN
                  methodOut.setFieldPtr800(methodOut.getFieldPtr800()+methodIn.getTagLen5001644695(methodOut.getNdx25001644695() - 1));
                  methodOut.setFieldLen800(methodOut.getFieldLen800()+methodIn.getTagLen5001644695(methodOut.getNdx25001644695() - 1));
              }
          }
//  ELSE
          else { 
//  MOVE SPACES TO 800-FIELD-VAL
              methodOut.setFieldVal800(CONSTANTS.SPACE_999);
              // MOVE 0 TO 800-FIELD-LEN
              methodOut.setFieldLen800(0);
          }
      
      return methodOut;
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
      @Override
      public void write1644695(Write1644695InCtx methodIn) throws Exception {
      
// ******************************************************************
// * Write message
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
//  IF 1000-WRITE-XML-MSGS
          if ( methodIn.isWriteXmlMsgs1000()  ) { 
//  PERFORM 8600-WRITE-1644695-XML
              write1644695Xml(programCtx.getWrite1644695XmlInCtx());/*8600-WRITE-1644695-XML*/
          }
//  IF 1000-WRITE-PSIPM-MSGS
          if ( methodIn.isWritePsipmMsgs1000()  ) { 
//  PERFORM 8700-WRITE-1644695-PSIPM
              write1644695Psipm(programCtx.getWrite1644695PsipmInCtx());/*8700-WRITE-1644695-PSIPM*/
          }
//  IF 1000-WRITE-IPM-MSGS
          if ( methodIn.isWriteIpmMsgs1000()  ) { 
//  PERFORM 8800-WRITE-1644695-IPM
              write1644695Ipm(programCtx.getWrite1644695IpmInCtx());/*8800-WRITE-1644695-IPM*/
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
      @Override
      public Write1644695XmlOutCtx write1644695Xml(Write1644695XmlInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			 final int MSG_END_TAG_300_LENGTH = 6;
			// End of variable declaration

      
// ******************************************************************
// * Write xml message
// ******************************************************************

// * Message header
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
Write1644695XmlOutCtx methodOut = methodIn.getWrite1644695XmlOutCtx();
//  SET 800-ILVL-1 TO TRUE
          methodOut.setIlvl1800True(); 
          
          methodOut.setSys101Rdw800((long)Math.abs(methodOut.getIlvl800() + MsgStrTag300.getMsgStrTag300FieldLength()));
          // MOVE 'M000000000000' TO 500-1644695-TBL-SRCH-KEY
          //  LITERAL_M000000000000 = 'M000000000000'
          methodOut.setTblSrchKey5001644695(CONSTANTS.LITERAL_M000000000000);
//  PERFORM 8500-GET-1644695-FIELD
          get1644695Field(programCtx.getGet1644695FieldInCtx());/*8500-GET-1644695-FIELD*/
//  MOVE 800-FIELD-VAL (1 : 800-FIELD-LEN ) TO 300-MSG-STR-MTI
          methodOut.setMsgStrMti300(CFUtil.getInt(substring(methodOut.getFieldVal800(),0,methodIn.getFieldLen800())));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-MSG-STR-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
          charArray = new ArrayList<char[]>();
             charArray.add(substring(methodIn.getIndent800(),0,methodOut.getIlvl800()));
             charArray.add(methodIn.getMsgStrTag300().toCharArray());
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
          updated = updateString(methodOut.getSys101OutRec().toCharArray() ,joinCharArray);
          methodOut.getSys101OutRec().setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
          writeSys101(programCtx.getWriteSys101InCtx());/*2200-WRITE-SYS101*/

// * Message details
//  SET 500-1644695-NDX TO 1
          methodOut.setNdx5001644695(1); 
          
//  PERFORM UNTIL 500-1644695-NDX > 500-1644695-TBL-ITEMS
          while ((	( methodOut.getNdx5001644695() <= methodIn.getTblItems5001644695() ))) {
//  EVALUATE 500-1644695-TAG-TYPE ( 500-1644695-NDX )
              if  (		compareChars(methodIn.getTagType5001644695(methodOut.getNdx5001644695() - 1),methodIn.getM300()) == 0 ) { 

// *            Skip tag since we already wrote message header
//  SET 500-1644695-NDX UP BY 1
                  methodOut.setNdx5001644695(methodOut.getNdx5001644695() + 1); 
                  
              }
              else if  (		compareChars(methodIn.getTagType5001644695(methodOut.getNdx5001644695() - 1),methodIn.getD300()) == 0 ) { 
//  PERFORM 8610-PROCESS-1644695-DE
                  process1644695De(programCtx.getProcess1644695DeInCtx());/*8610-PROCESS-1644695-DE*/
              }
              else if  (		compareChars(methodIn.getTagType5001644695(methodOut.getNdx5001644695() - 1),methodIn.getP300()) == 0 ) { 
//  PERFORM 8620-PROCESS-1644695-PDS
                  process1644695Pds(programCtx.getProcess1644695PdsInCtx());/*8620-PROCESS-1644695-PDS*/
              }
              else   { 
//  MOVE 500-COMN-TAG-TYPE ( 500-COMN-NDX ) TO 600-3009-TAG
                  methodOut.setTag6003009(methodOut.getComnTagType500(methodIn.getComnNdx500() - 1));
//  MOVE 300-3009-ABEND-CODE TO 900-ABEND-CODE
                  methodOut.setAbendCode900(String.valueOf(methodOut.getAbendCode3003009String()).toCharArray());
                  // MOVE 600-3009-ERROR-MSG TO 900-ABEND-TEXT
                  methodOut.setAbendText900(methodOut.getErrorMsg6003009().toCharArray());
//  MOVE '8600-WRITE-:T:-XML' TO 900-ABEND-PARA
                  methodOut.setAbendPara900(CONSTANTS.LITERAL_1572256913);
//  PERFORM 9100-ABEND-PROGRAM
                  abendProgram(programCtx.getAbendProgramInCtx());/*9100-ABEND-PROGRAM*/
              }
          }

// * Message trailer
//  SET 800-ILVL-1 TO TRUE
          methodOut.setIlvl1800True(); 
          
          methodOut.setSys101Rdw800((long)Math.abs(methodOut.getIlvl800() + MSG_END_TAG_300_LENGTH));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-MSG-END-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
          charArray = new ArrayList<char[]>();
             charArray.add(substring(methodIn.getIndent800(),0,methodOut.getIlvl800()));
             charArray.add(methodIn.getMsgEndTag300());
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
          updated = updateString(methodOut.getSys101OutRec().toCharArray() ,joinCharArray);
          methodOut.getSys101OutRec().setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
          writeSys101(programCtx.getWriteSys101InCtx());/*2200-WRITE-SYS101*/
          ;
      
      return methodOut;
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
      @Override
      public Process1644695DeOutCtx process1644695De(Process1644695DeInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			 final int DE_END_TAG_300_LENGTH = 5;
			// End of variable declaration

      
// ******************************************************************
// * Process de
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
Process1644695DeOutCtx methodOut = methodIn.getProcess1644695DeOutCtx();
//  IF 500-1644695-TAG-SUBFLD-NO ( 500-1644695-NDX ) > 0
          if (	( methodIn.getTagSubfldNo5001644695(methodOut.getNdx5001644695() - 1) > 0 )) { 
//  MOVE 500-1644695-TAG-NUM ( 500-1644695-NDX ) TO 300-DE-STR-CD
              methodOut.setDeStrCd300(methodOut.getTagNum5001644695(methodOut.getNdx5001644695() - 1));
//  SET 800-ILVL-2 TO TRUE
              methodOut.setIlvl2800True(); 
              
              methodOut.setSys101Rdw800((long)Math.abs(methodOut.getIlvl800() + DeStrTag300.getDeStrTag300FieldLength()));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-DE-STR-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(methodIn.getIndent800(),0,methodOut.getIlvl800()));
                 charArray.add(methodIn.getDeStrTag300().toCharArray());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getSys101OutRec().toCharArray() ,joinCharArray);
              methodOut.getSys101OutRec().setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
              writeSys101(programCtx.getWriteSys101InCtx());/*2200-WRITE-SYS101*/
//  MOVE 500-1644695-TAG-NUM ( 500-1644695-NDX ) TO 800-SAVE-TAG-NUM
              methodOut.setSaveTagNum800(methodOut.getTagNum5001644695(methodOut.getNdx5001644695() - 1));
//  PERFORM 8630-PROCESS-1644695-SUBFLD UNTIL 500-1644695-TAG-NUM ( 500-1644695-NDX ) NOT EQUAL 800-SAVE-TAG-NUM
              while (	( methodOut.getTagNum5001644695(methodOut.getNdx5001644695() - 1) == methodOut.getSaveTagNum800() )) {
                 process1644695Subfld(programCtx.getProcess1644695SubfldInCtx());/*8630-PROCESS-1644695-SUBFLD*/
              }
//  SET 800-ILVL-2 TO TRUE
              methodOut.setIlvl2800True(); 
              
              methodOut.setSys101Rdw800((long)Math.abs(methodOut.getIlvl800() + DE_END_TAG_300_LENGTH));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-DE-END-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(methodIn.getIndent800(),0,methodOut.getIlvl800()));
                 charArray.add(methodIn.getDeEndTag300());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getSys101OutRec().toCharArray() ,joinCharArray);
              methodOut.getSys101OutRec().setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
              writeSys101(programCtx.getWriteSys101InCtx());/*2200-WRITE-SYS101*/
          }
//  ELSE
          else { 
//  MOVE 500-1644695-TAG-NUM ( 500-1644695-NDX ) TO 300-DE-STR-CD
              methodOut.setDeStrCd300(methodOut.getTagNum5001644695(methodOut.getNdx5001644695() - 1));
//  SET 800-ILVL-2 TO TRUE
              methodOut.setIlvl2800True(); 
              
              methodOut.setSys101Rdw800((long)Math.abs(methodOut.getIlvl800() + DeStrTag300.getDeStrTag300FieldLength() + methodIn.getTagLen5001644695(methodOut.getNdx5001644695() - 1) + DE_END_TAG_300_LENGTH));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-DE-STR-TAG 500-1644695-TAG-VALUE ( 500-1644695-NDX ) (1 : 500-1644695-TAG-LEN ( 500-1644695-NDX )) 300-DE-END-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(methodIn.getIndent800(),0,methodOut.getIlvl800()));
                 charArray.add(methodIn.getDeStrTag300().toCharArray());
                 charArray.add(substring(methodIn.getTagValue5001644695(methodOut.getNdx5001644695() - 1),0,methodIn.getTagLen5001644695(methodOut.getNdx5001644695() - 1)));
                 charArray.add(methodIn.getDeEndTag300());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3));
              updated = updateString(methodOut.getSys101OutRec().toCharArray() ,joinCharArray);
              methodOut.getSys101OutRec().setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
              writeSys101(programCtx.getWriteSys101InCtx());/*2200-WRITE-SYS101*/
//  SET 500-1644695-NDX UP BY 1
              methodOut.setNdx5001644695(methodOut.getNdx5001644695() + 1); 
              
          }
      
      return methodOut;
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
      @Override
      public Process1644695PdsOutCtx process1644695Pds(Process1644695PdsInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			 final int PDS_END_TAG_300_LENGTH = 6;
			// End of variable declaration

      
// ******************************************************************
// * Process pds
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
Process1644695PdsOutCtx methodOut = methodIn.getProcess1644695PdsOutCtx();
//  IF 500-1644695-TAG-SUBFLD-NO ( 500-1644695-NDX ) > 0
          if (	( methodIn.getTagSubfldNo5001644695(methodOut.getNdx5001644695() - 1) > 0 )) { 
//  MOVE 500-1644695-TAG-NUM ( 500-1644695-NDX ) TO 300-PDS-STR-CD
              methodOut.setPdsStrCd300(methodOut.getTagNum5001644695(methodOut.getNdx5001644695() - 1));
//  SET 800-ILVL-2 TO TRUE
              methodOut.setIlvl2800True(); 
              
              methodOut.setSys101Rdw800((long)Math.abs(methodOut.getIlvl800() + PdsStrTag300.getPdsStrTag300FieldLength()));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-PDS-STR-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(methodIn.getIndent800(),0,methodOut.getIlvl800()));
                 charArray.add(methodIn.getPdsStrTag300().toCharArray());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getSys101OutRec().toCharArray() ,joinCharArray);
              methodOut.getSys101OutRec().setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
              writeSys101(programCtx.getWriteSys101InCtx());/*2200-WRITE-SYS101*/
//  MOVE 500-1644695-TAG-NUM ( 500-1644695-NDX ) TO 800-SAVE-TAG-NUM
              methodOut.setSaveTagNum800(methodOut.getTagNum5001644695(methodOut.getNdx5001644695() - 1));
//  PERFORM 8630-PROCESS-1644695-SUBFLD UNTIL 500-1644695-TAG-NUM ( 500-1644695-NDX ) NOT EQUAL 800-SAVE-TAG-NUM
              while (	( methodOut.getTagNum5001644695(methodOut.getNdx5001644695() - 1) == methodOut.getSaveTagNum800() )) {
                 process1644695Subfld(programCtx.getProcess1644695SubfldInCtx());/*8630-PROCESS-1644695-SUBFLD*/
              }
//  SET 800-ILVL-2 TO TRUE
              methodOut.setIlvl2800True(); 
              
              methodOut.setSys101Rdw800((long)Math.abs(methodOut.getIlvl800() + PDS_END_TAG_300_LENGTH));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-PDS-END-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(methodIn.getIndent800(),0,methodOut.getIlvl800()));
                 charArray.add(methodIn.getPdsEndTag300());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getSys101OutRec().toCharArray() ,joinCharArray);
              methodOut.getSys101OutRec().setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
              writeSys101(programCtx.getWriteSys101InCtx());/*2200-WRITE-SYS101*/
          }
//  ELSE
          else { 
//  MOVE 500-1644695-TAG-NUM ( 500-1644695-NDX ) TO 300-PDS-STR-CD
              methodOut.setPdsStrCd300(methodOut.getTagNum5001644695(methodOut.getNdx5001644695() - 1));
//  SET 800-ILVL-2 TO TRUE
              methodOut.setIlvl2800True(); 
              
              methodOut.setSys101Rdw800((long)Math.abs(methodOut.getIlvl800() + PdsStrTag300.getPdsStrTag300FieldLength() + methodIn.getTagLen5001644695(methodOut.getNdx5001644695() - 1) + PDS_END_TAG_300_LENGTH));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-PDS-STR-TAG 500-1644695-TAG-VALUE ( 500-1644695-NDX ) (1 : 500-1644695-TAG-LEN ( 500-1644695-NDX )) 300-PDS-END-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(methodIn.getIndent800(),0,methodOut.getIlvl800()));
                 charArray.add(methodIn.getPdsStrTag300().toCharArray());
                 charArray.add(substring(methodIn.getTagValue5001644695(methodOut.getNdx5001644695() - 1),0,methodIn.getTagLen5001644695(methodOut.getNdx5001644695() - 1)));
                 charArray.add(methodIn.getPdsEndTag300());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3));
              updated = updateString(methodOut.getSys101OutRec().toCharArray() ,joinCharArray);
              methodOut.getSys101OutRec().setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
              writeSys101(programCtx.getWriteSys101InCtx());/*2200-WRITE-SYS101*/
//  SET 500-1644695-NDX UP BY 1
              methodOut.setNdx5001644695(methodOut.getNdx5001644695() + 1); 
              
          }
      
      return methodOut;
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
      @Override
      public Process1644695SubfldOutCtx process1644695Subfld(Process1644695SubfldInCtx methodIn) throws Exception {
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
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
Process1644695SubfldOutCtx methodOut = methodIn.getProcess1644695SubfldOutCtx();
//  SET 800-ILVL-3 TO TRUE
          methodOut.setIlvl3800True(); 
          
          methodOut.setSys101Rdw800((long)Math.abs(methodOut.getIlvl800() + SUBFLD_TAG_STR_300_LENGTH + methodIn.getTagLen5001644695(methodOut.getNdx5001644695() - 1) + SUBFLD_TAG_END_300_LENGTH));
//  IF 500-1644695-TAG-LEN ( 500-1644695-NDX ) > 0
          if (	( methodIn.getTagLen5001644695(methodOut.getNdx5001644695() - 1) > 0 )) { 
//  STRING 800-INDENT (1 : 800-ILVL ) 300-SUBFLD-TAG-STR 500-1644695-TAG-VALUE ( 500-1644695-NDX ) (1 : 500-1644695-TAG-LEN ( 500-1644695-NDX )) 300-SUBFLD-TAG-END DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(methodIn.getIndent800(),0,methodOut.getIlvl800()));
                 charArray.add(methodIn.getSubfldTagStr300());
                 charArray.add(substring(methodIn.getTagValue5001644695(methodOut.getNdx5001644695() - 1),0,methodIn.getTagLen5001644695(methodOut.getNdx5001644695() - 1)));
                 charArray.add(methodIn.getSubfldTagEnd300());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3));
              updated = updateString(methodOut.getSys101OutRec().toCharArray() ,joinCharArray);
              methodOut.getSys101OutRec().setString(  (char[])updated.get("string"));
          }
//  ELSE
          else { 
//  STRING 800-INDENT (1 : 800-ILVL ) 300-SUBFLD-TAG-STR 300-SUBFLD-TAG-END DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(methodIn.getIndent800(),0,methodOut.getIlvl800()));
                 charArray.add(methodIn.getSubfldTagStr300());
                 charArray.add(methodIn.getSubfldTagEnd300());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2));
              updated = updateString(methodOut.getSys101OutRec().toCharArray() ,joinCharArray);
              methodOut.getSys101OutRec().setString(  (char[])updated.get("string"));
          }
//  PERFORM 2200-WRITE-SYS101
          writeSys101(programCtx.getWriteSys101InCtx());/*2200-WRITE-SYS101*/
//  SET 500-1644695-NDX UP BY 1
          methodOut.setNdx5001644695(methodOut.getNdx5001644695() + 1); 
          
      
      return methodOut;
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
      @Override
      public Write1644695PsipmOutCtx write1644695Psipm(Write1644695PsipmInCtx methodIn) throws Exception {
      
// ******************************************************************
// * Write pseudo ipm message
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
Write1644695PsipmOutCtx methodOut = methodIn.getWrite1644695PsipmOutCtx();
//  SET IP66601-USER-T TO 1
          methodOut.setIp66601UserT(1); 
          
//  MOVE 1 TO IP66601-USER-TCNT 800-FLD-STRT
          methodOut.setIp66601UserTcnt((short)1);
          methodOut.setFldStrt800((long)1);

// *    Write element tags to user tag table
//  PERFORM VARYING 500-1644695-NDX FROM 1 BY 1 UNTIL 500-1644695-NDX > 500-1644695-TBL-ITEMS
          for (methodOut.setNdx5001644695(1); (	( methodOut.getNdx5001644695() <= methodIn.getTblItems5001644695() )) ; methodOut.setNdx5001644695(methodOut.getNdx5001644695() + 1) ) {
//  SET IP66601-USER-T TO 500-1644695-NDX
              methodOut.setIp66601UserT(methodOut.getNdx5001644695()); 
              
//  EVALUATE 500-1644695-TAG-TYPE ( 500-1644695-NDX )
              switch(new String(methodIn.getTagType5001644695(methodOut.getNdx5001644695() - 1))){
              	case "M":
//  SET IP66601-USER-MTI-TAG ( IP66601-USER-T ) TO TRUE
                  methodOut.setIp66601UserMtiTagTrue(methodOut.getIp66601UserT() - 1); 
                  
              break;
              	case "D":
//  SET IP66601-USER-DE-TAG ( IP66601-USER-T ) TO TRUE
                  methodOut.setIp66601UserDeTagTrue(methodOut.getIp66601UserT() - 1); 
                  
              break;
              	case "P":
//  SET IP66601-USER-PDS-TAG ( IP66601-USER-T ) TO TRUE
                  methodOut.setIp66601UserPdsTagTrue(methodOut.getIp66601UserT() - 1); 
                  
              break;
              }
//  MOVE 500-1644695-TAG-NUM ( 500-1644695-NDX ) TO IP66601-USER-TAG-NO ( IP66601-USER-T )
              methodOut.setIp66601UserTagNo(methodOut.getIp66601UserT() - 1,(short) methodOut.getTagNum5001644695(methodOut.getNdx5001644695() - 1));
//  MOVE 500-1644695-TAG-OCCUR ( 500-1644695-NDX ) TO IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-T )
              methodOut.setIp66601UserTagOccurrence(methodOut.getIp66601UserT() - 1,(short) methodOut.getTagOccur5001644695(methodOut.getNdx5001644695() - 1));
//  MOVE 500-1644695-TAG-SUBFLD-NO ( 500-1644695-NDX ) TO IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-T )
              methodOut.setIp66601UserTagSubfldNo(methodOut.getIp66601UserT() - 1,(short) methodOut.getTagSubfldNo5001644695(methodOut.getNdx5001644695() - 1));
//  MOVE 800-FLD-STRT TO IP66601-USER-TAG-START ( IP66601-USER-T )
              methodOut.setIp66601UserTagStart(methodOut.getIp66601UserT() - 1,(short) methodOut.getFldStrt800());
//  MOVE 500-1644695-TAG-LEN ( 500-1644695-NDX ) TO IP66601-USER-TAG-LNGTH ( IP66601-USER-T )
              methodOut.setIp66601UserTagLngth(methodOut.getIp66601UserT() - 1,(short) methodOut.getTagLen5001644695(methodOut.getNdx5001644695() - 1));

// *    Write element content to message string
//  IF 500-1644695-TAG-LEN ( 500-1644695-NDX ) > 0
              if (	( methodOut.getTagLen5001644695(methodOut.getNdx5001644695() - 1) > 0 )) { 
//  MOVE 500-1644695-TAG-VALUE ( 500-1644695-NDX ) (1 : 500-1644695-TAG-LEN ( 500-1644695-NDX )) TO IP66102-NORMAL-IPM-MSG ( 800-FLD-STRT : IP66601-USER-TAG-LNGTH ( IP66601-USER-T ))
                  methodOut.setIp66102NormalIpmMsg(replace(methodOut.getIp66102NormalIpmMsg().toCharArray(),substring(methodOut.getTagValue5001644695(methodOut.getNdx5001644695() - 1),0,methodOut.getTagLen5001644695(methodOut.getNdx5001644695() - 1)),((int) methodOut.getFldStrt800()-1), (methodOut.getIp66601UserTagLngth(methodOut.getIp66601UserT() - 1) + ((int) methodOut.getFldStrt800() - 1)) ));
              }
//  ADD IP66601-USER-TAG-LNGTH ( IP66601-USER-T ) TO 800-FLD-STRT
              methodOut.setFldStrt800(methodOut.getFldStrt800()+(short) methodOut.getIp66601UserTagLngth(methodOut.getIp66601UserT() - 1));
          }

// *    Set ip66601-user-t     down by 1
//  SET IP66601-USER-TCNT TO IP66601-USER-T
          methodOut.setIp66601UserTcnt((short) (short) methodOut.getIp66601UserT()); 
          
          methodOut.setSys201Rdw800((long) (Math.abs(5 + methodOut.getFldStrt800() - 1 +  ( 24 * methodOut.getIp66601UserTcnt() ) )));
          methodOut.setTagTblPtr800((long) (Math.abs(5 + methodOut.getFldStrt800())));

// *    Write tag table pointer to sys201 record

// *    Write message string to sys201 record
//  MOVE 800-TAG-TBL-PTR TO SYS201-OUT-REC (1 : 5)
          methodOut.getSys201OutRec().replace(String.valueOf(methodOut.getTagTblPtr800String()).toCharArray(),0,String.valueOf(methodOut.getTagTblPtr800String()).length(),0,5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE IP66102-NORMAL-IPM-MSG (1 : 800-FLD-STRT ) TO SYS201-OUT-REC (6 : 800-FLD-STRT )
          methodOut.getSys201OutRec().replace(methodOut.getIp66102IpmMsg()/*parent*/,0/*fromOffset - (sys201OutRec) */,(int) methodOut.getFldStrt800()/*fromLen*/,0+6 - 1/*toOffset - (ip66102NormalIpmMsg) */,(int) methodOut.getFldStrt800()/*toLen*/);
          // MOVE 800-TAG-TBL-PTR TO 800-FLD-STRT
          methodOut.setFldStrt800(methodOut.getTagTblPtr800());

// *    Write tag table to sys201 record
//  PERFORM VARYING IP66601-USER-T FROM 1 BY 1 UNTIL IP66601-USER-T > IP66601-USER-TCNT
          for (methodOut.setIp66601UserT(1); (	( methodOut.getIp66601UserT() <= methodOut.getIp66601UserTcnt() ) ) ; methodOut.setIp66601UserT(methodOut.getIp66601UserT() + 1) ) {
//  MOVE IP66601-USER-TAG-TYPE ( IP66601-USER-T ) TO 800-TAG-TYPE
              methodOut.setTagType800(methodOut.getIp66601UserTagType(methodOut.getIp66601UserT() - 1));
//  MOVE IP66601-USER-TAG-NO ( IP66601-USER-T ) TO 800-TAG-NUM
              methodOut.setTagNum800(methodOut.getIp66601UserTagNo(methodOut.getIp66601UserT() - 1));
//  MOVE IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-T ) TO 800-TAG-OCCUR
              methodOut.setTagOccur800(methodOut.getIp66601UserTagOccurrence(methodOut.getIp66601UserT() - 1));
//  MOVE IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-T ) TO 800-TAG-SUBFLD-NO
              methodOut.setTagSubfldNo800(methodOut.getIp66601UserTagSubfldNo(methodOut.getIp66601UserT() - 1));
//  MOVE IP66601-USER-TAG-START ( IP66601-USER-T ) TO 800-TAG-START
              methodOut.setTagStart800(methodOut.getIp66601UserTagStart(methodOut.getIp66601UserT() - 1));
//  MOVE IP66601-USER-TAG-LNGTH ( IP66601-USER-T ) TO 800-TAG-LNGTH
              methodOut.setTagLngth800(methodOut.getIp66601UserTagLngth(methodOut.getIp66601UserT() - 1));
//  MOVE 800-TAG (1 : 24) TO SYS201-OUT-REC ( 800-FLD-STRT : 24)
              methodOut.getSys201OutRec().replace(methodIn.getWorkAreas800()/*parent*/,0/*fromOffset - (sys201OutRec) */,24/*fromLen*/,0+(int) methodOut.getFldStrt800() - 1/*toOffset - (tag800) */,24/*toLen*/);
//  ADD 24 TO 800-FLD-STRT
              methodOut.setFldStrt800(methodOut.getFldStrt800()+(long)24);
          }
//  PERFORM 3110-WRITE-SYS201
          writeSys201(programCtx.getWriteSys201InCtx());/*3110-WRITE-SYS201*/
          ;
      
      return methodOut;
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
      @Override
      public Write1644695IpmOutCtx write1644695Ipm(Write1644695IpmInCtx methodIn) throws Exception {
      
// ******************************************************************
// * Write ipm message
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
Write1644695IpmOutCtx methodOut = methodIn.getWrite1644695IpmOutCtx();
//  CALL 800-PTR-IP666010
          // CALL 800-PTR-IP666010
          	programCtx.setRc( ip666010.process(programCtx.getGlobalCtx().getContext("IP666010")));
      
      return methodOut;
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
      @Override
      public Add1644697FieldOutCtx add1644697Field(Add1644697FieldInCtx methodIn) throws Exception {
      
// * 800-New-elem-len
// * 800-new-elem-value
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
Add1644697FieldOutCtx methodOut = methodIn.getAdd1644697FieldOutCtx();
//  IF 500-1644697-TBL-ITEMS < 500-1644697-TBL-MAX
          if (	( methodOut.getTblItems5001644697() < methodOut.getTblMax5001644697() )) { 
//  ADD 1 TO 500-1644697-TBL-ITEMS
              methodOut.setTblItems5001644697(methodOut.getTblItems5001644697()+1);
//  SET 500-1644697-NDX TO 500-1644697-TBL-ITEMS
              methodOut.setNdx5001644697(methodOut.getTblItems5001644697()); 
              
//  MOVE 800-NEW-ELEM TO 500-1644697-TAG-KEY ( 500-1644697-NDX )
              methodOut.setTagKey5001644697(methodOut.getNdx5001644697() - 1,methodOut.getNewElem800());
//  MOVE 800-NEW-ELEM-LEN TO 500-1644697-TAG-LEN ( 500-1644697-NDX )
              methodOut.setTagLen5001644697(methodOut.getNdx5001644697() - 1,methodOut.getNewElemLen800());
//  MOVE 800-NEW-ELEM-VALUE TO 500-1644697-TAG-VALUE ( 500-1644697-NDX )
              methodOut.setTagValue5001644697(methodOut.getNdx5001644697() - 1,methodOut.getNewElemValue800());
//  IF 500-1644697-TBL-ITEMS > 1
              if (	( methodOut.getTblItems5001644697() > 1 )) { 
//  SET 500-1644697-NDX2 TO 500-1644697-NDX
                  methodOut.setNdx25001644697(methodOut.getNdx5001644697()); 
                  
//  SET 500-1644697-NDX2 DOWN BY 1
                  methodOut.setNdx25001644697(methodOut.getNdx25001644697() - 1); 
                  
//  IF 500-1644697-TAG-KEY ( 500-1644697-NDX ) < 500-1644697-TAG-KEY ( 500-1644697-NDX2 )
                  if (		compareChars(methodOut.getTagKey5001644697(methodOut.getNdx5001644697() - 1),methodOut.getTagKey5001644697(methodOut.getNdx25001644697() - 1)) < 0 ) { 
//  PERFORM 8100-SORT-1644697-FIELDS
                      sort1644697Fields(programCtx.getSort1644697FieldsInCtx());/*8100-SORT-1644697-FIELDS*/
                  }
              }
          }
//  ELSE
          else { 
//  SET 600-3008-TABLE-1644697 TO TRUE
              methodOut.setTable16446976003008True(); 
              
//  MOVE 500-1644697-TBL-MAX TO 600-3008-MAX-SIZE
              methodOut.setMaxSize6003008(String.valueOf(CFUtil.pad(8,String.valueOf(methodOut.getTblMax5001644697()),"0",CFUtil.LEFT_PAD)).toCharArray());
//  MOVE 300-3008-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(String.valueOf(methodOut.getAbendCode3003008String()).toCharArray());
              // MOVE 600-3008-ERROR-MSG TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getErrorMsg6003008().toCharArray());
//  MOVE 300-PARA-8000-1644697 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara80001644697300());
//  PERFORM 9100-ABEND-PROGRAM
              abendProgram(programCtx.getAbendProgramInCtx());/*9100-ABEND-PROGRAM*/
          }
      
      return methodOut;
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
      @Override
      public Sort1644697FieldsOutCtx sort1644697Fields(Sort1644697FieldsInCtx methodIn) throws Exception {
      
// ******************************************************************
// * Sort the :t: element table
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
Sort1644697FieldsOutCtx methodOut = methodIn.getSort1644697FieldsOutCtx();
//  PERFORM VARYING 500-1644697-NDX FROM 500-1644697-TBL-ITEMS BY -1 UNTIL 500-1644697-NDX <= 1
          for (methodOut.setNdx5001644697(methodIn.getTblItems5001644697()); (	( methodOut.getNdx5001644697() > 1 )) ; methodOut.setNdx5001644697(methodOut.getNdx5001644697() + -1) ) {
//  PERFORM VARYING 500-1644697-NDX2 FROM 1 BY 1 UNTIL 500-1644697-NDX2 >= 500-1644697-NDX
              for (methodOut.setNdx25001644697(1); (	( methodOut.getNdx25001644697() < methodOut.getNdx5001644697() )) ; methodOut.setNdx25001644697(methodOut.getNdx25001644697() + 1) ) {
//  IF 500-1644697-TAG-KEY ( 500-1644697-NDX ) < 500-1644697-TAG-KEY ( 500-1644697-NDX2 )
                  if (		compareChars(methodIn.getTagKey5001644697(methodOut.getNdx5001644697() - 1),methodIn.getTagKey5001644697(methodOut.getNdx25001644697() - 1)) < 0 ) { 
//  MOVE 500-1644697-TBL-ENTRY ( 500-1644697-NDX ) TO 800-SAVE-ENTRY
                      methodOut.setSaveEntry800(methodOut.getTblEntry5001644697(methodOut.getNdx5001644697() - 1).toCharArray());
//  MOVE 500-1644697-TBL-ENTRY ( 500-1644697-NDX2 ) TO 500-1644697-TBL-ENTRY ( 500-1644697-NDX )
                      methodOut.setTblEntry5001644697(methodOut.getNdx5001644697() - 1,methodOut.getTblEntry5001644697(methodOut.getNdx25001644697() - 1).toCharArray());
//  MOVE 800-SAVE-ENTRY TO 500-1644697-TBL-ENTRY ( 500-1644697-NDX2 )
                      methodOut.setTblEntry5001644697(methodOut.getNdx25001644697() - 1,methodOut.getSaveEntry800());
                  }
              }
          }
      
      return methodOut;
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
      @Override
      public Update1644697FieldOutCtx update1644697Field(Update1644697FieldInCtx methodIn) throws Exception {
      
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
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
Update1644697FieldOutCtx methodOut = methodIn.getUpdate1644697FieldOutCtx();
          // MOVE 800-NEW-ELEM TO 500-1644697-TBL-SRCH-KEY
          methodOut.setTblSrchKey5001644697(methodOut.getNewElem800());
//  PERFORM 8300-LOOKUP-1644697-FIELD
          lookup1644697Field(programCtx.getLookup1644697FieldInCtx());/*8300-LOOKUP-1644697-FIELD*/
//  IF 500-1644697-SRCH-KEY-FND
          if ( methodIn.isSrchKeyFnd5001644697()  ) { 
//  MOVE 800-NEW-ELEM TO 500-1644697-TAG-KEY ( 500-1644697-NDX )
              methodOut.setTagKey5001644697(methodIn.getNdx5001644697() - 1,methodOut.getNewElem800());
//  MOVE 800-NEW-ELEM-LEN TO 500-1644697-TAG-LEN ( 500-1644697-NDX )
              methodOut.setTagLen5001644697(methodIn.getNdx5001644697() - 1,methodOut.getNewElemLen800());
//  MOVE 800-NEW-ELEM-VALUE TO 500-1644697-TAG-VALUE ( 500-1644697-NDX )
              methodOut.setTagValue5001644697(methodIn.getNdx5001644697() - 1,methodOut.getNewElemValue800());
          }
//  ELSE
          else { 
//  PERFORM 8000-ADD-1644697-FIELD
              add1644697Field(programCtx.getAdd1644697FieldInCtx());/*8000-ADD-1644697-FIELD*/
          }
      
      return methodOut;
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
      @Override
      public Lookup1644697FieldOutCtx lookup1644697Field(Lookup1644697FieldInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			boolean keepSearching = true;
			int[] searchIndexes = null;
			int searchLowPoint = 0;
			int searchMidPoint = 0;
			int searchHighPoint = 0;
			int searchCompare = 0;
			// End of variable declaration

      
// ******************************************************************
// * Lookup a field in to the :t: element table
// *
// * note:
// * 500-:t:-srch-key should be populated with proper
// * search key before this paragraph is called
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
Lookup1644697FieldOutCtx methodOut = methodIn.getLookup1644697FieldOutCtx();
//  SET 500-1644697-NDX TO 1
          methodOut.setNdx5001644697(1); 
          
//  SEARCH ALL 500-1644697-TBL-ENTRY
          // Binary Search through methodIn.getElementsTable5001644697().tblEntry5001644697
          searchLowPoint = 0; //prevLowValue
          searchHighPoint = methodIn.getTblItems5001644697(); //prevHighValue
          searchMidPoint = searchHighPoint / 2; //starting at mid point
          searchIndexes = new int[]{searchLowPoint,searchMidPoint,searchHighPoint};
          keepSearching = true;
          while (keepSearching) {
          // compare logic below
             searchCompare = compareAscending(methodIn.getTagKey5001644697(searchMidPoint),methodIn.getTblSrchKey5001644697());
          // end of compare logic
          	if (searchCompare == 0 ) { // if search found
          	      keepSearching = false;
          	     methodOut.setNdx5001644697(searchMidPoint + 1);
//  SET 500-1644697-SRCH-KEY-FND TO TRUE
              methodOut.setSrchKeyFnd5001644697True(); 
              
          	} else  {
          		adjustSearchIndex(searchCompare,searchIndexes);
          		searchLowPoint  = searchIndexes[0];
           		searchMidPoint  = searchIndexes[1];
           		searchHighPoint = searchIndexes[2];
           		if (searchMidPoint == -1) { // search exhausted
           		    keepSearching = false; 
//  SET 500-1644697-SRCH-KEY-NOT-FND TO TRUE
              methodOut.setSrchKeyNotFnd5001644697True(); 
              
           		}
          	}
          }
      
      return methodOut;
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
      @Override
      public Display1644697TableOutCtx display1644697Table(Display1644697TableInCtx methodIn) throws Exception {
      
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
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
Display1644697TableOutCtx methodOut = methodIn.getDisplay1644697TableOutCtx();
//  DISPLAY '================================================'
          logger.info("================================================"); 
          // MOVE 'M000000000000' TO 500-1644697-TBL-SRCH-KEY
          //  LITERAL_M000000000000 = 'M000000000000'
          methodOut.setTblSrchKey5001644697(CONSTANTS.LITERAL_M000000000000);
//  PERFORM 8300-LOOKUP-1644697-FIELD
          lookup1644697Field(programCtx.getLookup1644697FieldInCtx());/*8300-LOOKUP-1644697-FIELD*/
//  IF 500-1644697-SRCH-KEY-FND
          if ( methodIn.isSrchKeyFnd5001644697()  ) { 
//  DISPLAY '= ' 500-1644697-TAG-VALUE ( 500-1644697-NDX ) (1 : 500-1644697-TAG-LEN ( 500-1644697-NDX ))
              logger.info("= {}", new String(substring(methodIn.getTagValue5001644697(methodOut.getNdx5001644697() - 1),0,methodIn.getTagLen5001644697(methodOut.getNdx5001644697() - 1)))); 
          }
          // MOVE 'D002400000000' TO 500-1644697-TBL-SRCH-KEY
          //  LITERAL_D002400000000 = 'D002400000000'
          methodOut.setTblSrchKey5001644697(CONSTANTS.LITERAL_D002400000000);
//  PERFORM 8300-LOOKUP-1644697-FIELD
          lookup1644697Field(programCtx.getLookup1644697FieldInCtx());/*8300-LOOKUP-1644697-FIELD*/
//  IF 500-1644697-SRCH-KEY-FND
          if ( methodIn.isSrchKeyFnd5001644697()  ) { 
//  DISPLAY '= ' 500-1644697-TAG-VALUE ( 500-1644697-NDX ) (1 : 500-1644697-TAG-LEN ( 500-1644697-NDX ))
              logger.info("= {}", new String(substring(methodIn.getTagValue5001644697(methodOut.getNdx5001644697() - 1),0,methodIn.getTagLen5001644697(methodOut.getNdx5001644697() - 1)))); 
          }
//  DISPLAY '= TABLE ELEMENTS'
          logger.info("= TABLE ELEMENTS"); 
//  DISPLAY '================================================'
          logger.info("================================================"); 
//  DISPLAY '     #   ' ' T' ' CODE' ' SUBF' ' OCCR' ' LEN' ' VALUE'
          logger.info("     #    T CODE SUBF OCCR LEN VALUE"); 
//  PERFORM VARYING 500-1644697-NDX FROM 1 BY 1 UNTIL 500-1644697-NDX > 500-1644697-TBL-ITEMS
          for (methodOut.setNdx5001644697(1); (	( methodOut.getNdx5001644697() <= methodIn.getTblItems5001644697() )) ; methodOut.setNdx5001644697(methodOut.getNdx5001644697() + 1) ) {
//  SET 800-PTR-VAL TO 500-1644697-NDX
              methodOut.setPtrVal800((int) methodOut.getNdx5001644697()); 
              
//  IF 500-1644697-TAG-LEN ( 500-1644697-NDX ) > 0
              if (	( methodIn.getTagLen5001644697(methodOut.getNdx5001644697() - 1) > 0 )) { 
//  DISPLAY ' ' 800-PTR-VAL ' ' 500-1644697-TAG-TYPE ( 500-1644697-NDX ) ' ' 500-1644697-TAG-NUM ( 500-1644697-NDX ) ' ' 500-1644697-TAG-SUBFLD-NO ( 500-1644697-NDX ) ' ' 500-1644697-TAG-OCCUR ( 500-1644697-NDX ) ' ' 500-1644697-TAG-LEN ( 500-1644697-NDX ) ' ' 500-1644697-TAG-VALUE ( 500-1644697-NDX ) (1 : 500-1644697-TAG-LEN ( 500-1644697-NDX ))
                  logger.info(" {} {} {} {} {} {} {}", String.valueOf(methodOut.getPtrVal800()), new String(methodIn.getTagType5001644697(methodOut.getNdx5001644697() - 1)), String.valueOf(methodIn.getTagNum5001644697(methodOut.getNdx5001644697() - 1)), String.valueOf(methodIn.getTagSubfldNo5001644697(methodOut.getNdx5001644697() - 1)), String.valueOf(methodIn.getTagOccur5001644697(methodOut.getNdx5001644697() - 1)), String.valueOf(methodIn.getTagLen5001644697(methodOut.getNdx5001644697() - 1)), new String(substring(methodIn.getTagValue5001644697(methodOut.getNdx5001644697() - 1),0,methodIn.getTagLen5001644697(methodOut.getNdx5001644697() - 1)))); 
              }
//  ELSE
              else { 
//  DISPLAY ' ' 800-PTR-VAL ' ' 500-1644697-TAG-TYPE ( 500-1644697-NDX ) ' ' 500-1644697-TAG-NUM ( 500-1644697-NDX ) ' ' 500-1644697-TAG-SUBFLD-NO ( 500-1644697-NDX ) ' ' 500-1644697-TAG-OCCUR ( 500-1644697-NDX ) ' ' 500-1644697-TAG-LEN ( 500-1644697-NDX ) ' ???'
                  logger.info(" {} {} {} {} {} {} ???", String.valueOf(methodOut.getPtrVal800()), new String(methodIn.getTagType5001644697(methodOut.getNdx5001644697() - 1)), String.valueOf(methodIn.getTagNum5001644697(methodOut.getNdx5001644697() - 1)), String.valueOf(methodIn.getTagSubfldNo5001644697(methodOut.getNdx5001644697() - 1)), String.valueOf(methodIn.getTagOccur5001644697(methodOut.getNdx5001644697() - 1)), String.valueOf(methodIn.getTagLen5001644697(methodOut.getNdx5001644697() - 1))); 
              }
          }
//  DISPLAY '================================================'
          logger.info("================================================"); 
      
      return methodOut;
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
      @Override
      public Get1644697FieldOutCtx get1644697Field(Get1644697FieldInCtx methodIn) throws Exception {
      
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
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
Get1644697FieldOutCtx methodOut = methodIn.getGet1644697FieldOutCtx();
//  PERFORM 8300-LOOKUP-1644697-FIELD
          lookup1644697Field(programCtx.getLookup1644697FieldInCtx());/*8300-LOOKUP-1644697-FIELD*/

// *    If data element has subfields; find first one
//  IF 500-1644697-SRCH-KEY-NOT-FND
          if ( methodIn.isSrchKeyNotFnd5001644697()  ) { 
//  MOVE '0001' TO 500-1644697-TBL-SRCH-KEY (6 : 4)
//  LITERAL_0001 = '0001'
              methodOut.setTblSrchKey5001644697(replace(methodOut.getTblSrchKey5001644697(),CONSTANTS.LITERAL_0001,5,9));
//  PERFORM 8300-LOOKUP-1644697-FIELD
              lookup1644697Field(programCtx.getLookup1644697FieldInCtx());/*8300-LOOKUP-1644697-FIELD*/
          }
//  IF 500-1644697-SRCH-KEY-FND
          if ( methodIn.isSrchKeyFnd5001644697()  ) { 
              // MOVE 1 TO 800-FIELD-PTR
              methodOut.setFieldPtr800(1);
              // MOVE 0 TO 800-FIELD-LEN
              methodOut.setFieldLen800(0);
//  PERFORM VARYING 500-1644697-NDX2 FROM 500-1644697-NDX BY 1 UNTIL 500-1644697-TAG-KEY ( 500-1644697-NDX2 ) (1 : 5) NOT EQUAL 500-1644697-TBL-SRCH-KEY (1 : 5) OR 500-1644697-NDX2 > 500-1644697-TBL-ITEMS
              for (methodOut.setNdx25001644697(methodIn.getNdx5001644697()); (		compareChars(substring(methodIn.getTagKey5001644697(methodOut.getNdx25001644697() - 1).toCharArray(),0,5),substring(methodOut.getTblSrchKey5001644697(),0,5)) == 0  && 	( methodOut.getNdx25001644697() <= methodIn.getTblItems5001644697() )) ; methodOut.setNdx25001644697(methodOut.getNdx25001644697() + 1) ) {
//  MOVE 500-1644697-TAG-VALUE ( 500-1644697-NDX2 ) (1 : 500-1644697-TAG-LEN ( 500-1644697-NDX2 )) TO 800-FIELD-VAL ( 800-FIELD-PTR : 500-1644697-TAG-LEN ( 500-1644697-NDX2 ))
                  methodOut.setFieldVal800(replace(methodOut.getFieldVal800(),substring(methodOut.getTagValue5001644697(methodOut.getNdx25001644697() - 1),0,methodIn.getTagLen5001644697(methodOut.getNdx25001644697() - 1)),(methodOut.getFieldPtr800()-1), (methodIn.getTagLen5001644697(methodOut.getNdx25001644697() - 1) + (methodOut.getFieldPtr800() - 1)) ));
//  ADD 500-1644697-TAG-LEN ( 500-1644697-NDX2 ) TO 800-FIELD-PTR 800-FIELD-LEN
                  methodOut.setFieldPtr800(methodOut.getFieldPtr800()+methodIn.getTagLen5001644697(methodOut.getNdx25001644697() - 1));
                  methodOut.setFieldLen800(methodOut.getFieldLen800()+methodIn.getTagLen5001644697(methodOut.getNdx25001644697() - 1));
              }
          }
//  ELSE
          else { 
//  MOVE SPACES TO 800-FIELD-VAL
              methodOut.setFieldVal800(CONSTANTS.SPACE_999);
              // MOVE 0 TO 800-FIELD-LEN
              methodOut.setFieldLen800(0);
          }
      
      return methodOut;
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
      @Override
      public void write1644697(Write1644697InCtx methodIn) throws Exception {
      
// ******************************************************************
// * Write message
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
//  IF 1000-WRITE-XML-MSGS
          if ( methodIn.isWriteXmlMsgs1000()  ) { 
//  PERFORM 8600-WRITE-1644697-XML
              write1644697Xml(programCtx.getWrite1644697XmlInCtx());/*8600-WRITE-1644697-XML*/
          }
//  IF 1000-WRITE-PSIPM-MSGS
          if ( methodIn.isWritePsipmMsgs1000()  ) { 
//  PERFORM 8700-WRITE-1644697-PSIPM
              write1644697Psipm(programCtx.getWrite1644697PsipmInCtx());/*8700-WRITE-1644697-PSIPM*/
          }
//  IF 1000-WRITE-IPM-MSGS
          if ( methodIn.isWriteIpmMsgs1000()  ) { 
//  PERFORM 8800-WRITE-1644697-IPM
              write1644697Ipm(programCtx.getWrite1644697IpmInCtx());/*8800-WRITE-1644697-IPM*/
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
      @Override
      public Write1644697XmlOutCtx write1644697Xml(Write1644697XmlInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			 final int MSG_END_TAG_300_LENGTH = 6;
			// End of variable declaration

      
// ******************************************************************
// * Write xml message
// ******************************************************************

// * Message header
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
Write1644697XmlOutCtx methodOut = methodIn.getWrite1644697XmlOutCtx();
//  SET 800-ILVL-1 TO TRUE
          methodOut.setIlvl1800True(); 
          
          methodOut.setSys101Rdw800((long)Math.abs(methodOut.getIlvl800() + MsgStrTag300.getMsgStrTag300FieldLength()));
          // MOVE 'M000000000000' TO 500-1644697-TBL-SRCH-KEY
          //  LITERAL_M000000000000 = 'M000000000000'
          methodOut.setTblSrchKey5001644697(CONSTANTS.LITERAL_M000000000000);
//  PERFORM 8500-GET-1644697-FIELD
          get1644697Field(programCtx.getGet1644697FieldInCtx());/*8500-GET-1644697-FIELD*/
//  MOVE 800-FIELD-VAL (1 : 800-FIELD-LEN ) TO 300-MSG-STR-MTI
          methodOut.setMsgStrMti300(CFUtil.getInt(substring(methodOut.getFieldVal800(),0,methodIn.getFieldLen800())));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-MSG-STR-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
          charArray = new ArrayList<char[]>();
             charArray.add(substring(methodIn.getIndent800(),0,methodOut.getIlvl800()));
             charArray.add(methodIn.getMsgStrTag300().toCharArray());
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
          updated = updateString(methodOut.getSys101OutRec().toCharArray() ,joinCharArray);
          methodOut.getSys101OutRec().setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
          writeSys101(programCtx.getWriteSys101InCtx());/*2200-WRITE-SYS101*/

// * Message details
//  SET 500-1644697-NDX TO 1
          methodOut.setNdx5001644697(1); 
          
//  PERFORM UNTIL 500-1644697-NDX > 500-1644697-TBL-ITEMS
          while ((	( methodOut.getNdx5001644697() <= methodIn.getTblItems5001644697() ))) {
//  EVALUATE 500-1644697-TAG-TYPE ( 500-1644697-NDX )
              if  (		compareChars(methodIn.getTagType5001644697(methodOut.getNdx5001644697() - 1),methodIn.getM300()) == 0 ) { 

// *            Skip tag since we already wrote message header
//  SET 500-1644697-NDX UP BY 1
                  methodOut.setNdx5001644697(methodOut.getNdx5001644697() + 1); 
                  
              }
              else if  (		compareChars(methodIn.getTagType5001644697(methodOut.getNdx5001644697() - 1),methodIn.getD300()) == 0 ) { 
//  PERFORM 8610-PROCESS-1644697-DE
                  process1644697De(programCtx.getProcess1644697DeInCtx());/*8610-PROCESS-1644697-DE*/
              }
              else if  (		compareChars(methodIn.getTagType5001644697(methodOut.getNdx5001644697() - 1),methodIn.getP300()) == 0 ) { 
//  PERFORM 8620-PROCESS-1644697-PDS
                  process1644697Pds(programCtx.getProcess1644697PdsInCtx());/*8620-PROCESS-1644697-PDS*/
              }
              else   { 
//  MOVE 500-COMN-TAG-TYPE ( 500-COMN-NDX ) TO 600-3009-TAG
                  methodOut.setTag6003009(methodOut.getComnTagType500(methodIn.getComnNdx500() - 1));
//  MOVE 300-3009-ABEND-CODE TO 900-ABEND-CODE
                  methodOut.setAbendCode900(String.valueOf(methodOut.getAbendCode3003009String()).toCharArray());
                  // MOVE 600-3009-ERROR-MSG TO 900-ABEND-TEXT
                  methodOut.setAbendText900(methodOut.getErrorMsg6003009().toCharArray());
//  MOVE '8600-WRITE-:T:-XML' TO 900-ABEND-PARA
                  methodOut.setAbendPara900(CONSTANTS.LITERAL_1572256913);
//  PERFORM 9100-ABEND-PROGRAM
                  abendProgram(programCtx.getAbendProgramInCtx());/*9100-ABEND-PROGRAM*/
              }
          }

// * Message trailer
//  SET 800-ILVL-1 TO TRUE
          methodOut.setIlvl1800True(); 
          
          methodOut.setSys101Rdw800((long)Math.abs(methodOut.getIlvl800() + MSG_END_TAG_300_LENGTH));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-MSG-END-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
          charArray = new ArrayList<char[]>();
             charArray.add(substring(methodIn.getIndent800(),0,methodOut.getIlvl800()));
             charArray.add(methodIn.getMsgEndTag300());
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
          updated = updateString(methodOut.getSys101OutRec().toCharArray() ,joinCharArray);
          methodOut.getSys101OutRec().setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
          writeSys101(programCtx.getWriteSys101InCtx());/*2200-WRITE-SYS101*/
          ;
      
      return methodOut;
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
      @Override
      public Process1644697DeOutCtx process1644697De(Process1644697DeInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			 final int DE_END_TAG_300_LENGTH = 5;
			// End of variable declaration

      
// ******************************************************************
// * Process de
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
Process1644697DeOutCtx methodOut = methodIn.getProcess1644697DeOutCtx();
//  IF 500-1644697-TAG-SUBFLD-NO ( 500-1644697-NDX ) > 0
          if (	( methodIn.getTagSubfldNo5001644697(methodOut.getNdx5001644697() - 1) > 0 )) { 
//  MOVE 500-1644697-TAG-NUM ( 500-1644697-NDX ) TO 300-DE-STR-CD
              methodOut.setDeStrCd300(methodOut.getTagNum5001644697(methodOut.getNdx5001644697() - 1));
//  SET 800-ILVL-2 TO TRUE
              methodOut.setIlvl2800True(); 
              
              methodOut.setSys101Rdw800((long)Math.abs(methodOut.getIlvl800() + DeStrTag300.getDeStrTag300FieldLength()));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-DE-STR-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(methodIn.getIndent800(),0,methodOut.getIlvl800()));
                 charArray.add(methodIn.getDeStrTag300().toCharArray());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getSys101OutRec().toCharArray() ,joinCharArray);
              methodOut.getSys101OutRec().setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
              writeSys101(programCtx.getWriteSys101InCtx());/*2200-WRITE-SYS101*/
//  MOVE 500-1644697-TAG-NUM ( 500-1644697-NDX ) TO 800-SAVE-TAG-NUM
              methodOut.setSaveTagNum800(methodOut.getTagNum5001644697(methodOut.getNdx5001644697() - 1));
//  PERFORM 8630-PROCESS-1644697-SUBFLD UNTIL 500-1644697-TAG-NUM ( 500-1644697-NDX ) NOT EQUAL 800-SAVE-TAG-NUM
              while (	( methodOut.getTagNum5001644697(methodOut.getNdx5001644697() - 1) == methodOut.getSaveTagNum800() )) {
                 process1644697Subfld(programCtx.getProcess1644697SubfldInCtx());/*8630-PROCESS-1644697-SUBFLD*/
              }
//  SET 800-ILVL-2 TO TRUE
              methodOut.setIlvl2800True(); 
              
              methodOut.setSys101Rdw800((long)Math.abs(methodOut.getIlvl800() + DE_END_TAG_300_LENGTH));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-DE-END-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(methodIn.getIndent800(),0,methodOut.getIlvl800()));
                 charArray.add(methodIn.getDeEndTag300());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getSys101OutRec().toCharArray() ,joinCharArray);
              methodOut.getSys101OutRec().setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
              writeSys101(programCtx.getWriteSys101InCtx());/*2200-WRITE-SYS101*/
          }
//  ELSE
          else { 
//  MOVE 500-1644697-TAG-NUM ( 500-1644697-NDX ) TO 300-DE-STR-CD
              methodOut.setDeStrCd300(methodOut.getTagNum5001644697(methodOut.getNdx5001644697() - 1));
//  SET 800-ILVL-2 TO TRUE
              methodOut.setIlvl2800True(); 
              
              methodOut.setSys101Rdw800((long)Math.abs(methodOut.getIlvl800() + DeStrTag300.getDeStrTag300FieldLength() + methodIn.getTagLen5001644697(methodOut.getNdx5001644697() - 1) + DE_END_TAG_300_LENGTH));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-DE-STR-TAG 500-1644697-TAG-VALUE ( 500-1644697-NDX ) (1 : 500-1644697-TAG-LEN ( 500-1644697-NDX )) 300-DE-END-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(methodIn.getIndent800(),0,methodOut.getIlvl800()));
                 charArray.add(methodIn.getDeStrTag300().toCharArray());
                 charArray.add(substring(methodIn.getTagValue5001644697(methodOut.getNdx5001644697() - 1),0,methodIn.getTagLen5001644697(methodOut.getNdx5001644697() - 1)));
                 charArray.add(methodIn.getDeEndTag300());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3));
              updated = updateString(methodOut.getSys101OutRec().toCharArray() ,joinCharArray);
              methodOut.getSys101OutRec().setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
              writeSys101(programCtx.getWriteSys101InCtx());/*2200-WRITE-SYS101*/
//  SET 500-1644697-NDX UP BY 1
              methodOut.setNdx5001644697(methodOut.getNdx5001644697() + 1); 
              
          }
      
      return methodOut;
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
      @Override
      public Process1644697PdsOutCtx process1644697Pds(Process1644697PdsInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			 final int PDS_END_TAG_300_LENGTH = 6;
			// End of variable declaration

      
// ******************************************************************
// * Process pds
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
Process1644697PdsOutCtx methodOut = methodIn.getProcess1644697PdsOutCtx();
//  IF 500-1644697-TAG-SUBFLD-NO ( 500-1644697-NDX ) > 0
          if (	( methodIn.getTagSubfldNo5001644697(methodOut.getNdx5001644697() - 1) > 0 )) { 
//  MOVE 500-1644697-TAG-NUM ( 500-1644697-NDX ) TO 300-PDS-STR-CD
              methodOut.setPdsStrCd300(methodOut.getTagNum5001644697(methodOut.getNdx5001644697() - 1));
//  SET 800-ILVL-2 TO TRUE
              methodOut.setIlvl2800True(); 
              
              methodOut.setSys101Rdw800((long)Math.abs(methodOut.getIlvl800() + PdsStrTag300.getPdsStrTag300FieldLength()));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-PDS-STR-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(methodIn.getIndent800(),0,methodOut.getIlvl800()));
                 charArray.add(methodIn.getPdsStrTag300().toCharArray());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getSys101OutRec().toCharArray() ,joinCharArray);
              methodOut.getSys101OutRec().setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
              writeSys101(programCtx.getWriteSys101InCtx());/*2200-WRITE-SYS101*/
//  MOVE 500-1644697-TAG-NUM ( 500-1644697-NDX ) TO 800-SAVE-TAG-NUM
              methodOut.setSaveTagNum800(methodOut.getTagNum5001644697(methodOut.getNdx5001644697() - 1));
//  PERFORM 8630-PROCESS-1644697-SUBFLD UNTIL 500-1644697-TAG-NUM ( 500-1644697-NDX ) NOT EQUAL 800-SAVE-TAG-NUM
              while (	( methodOut.getTagNum5001644697(methodOut.getNdx5001644697() - 1) == methodOut.getSaveTagNum800() )) {
                 process1644697Subfld(programCtx.getProcess1644697SubfldInCtx());/*8630-PROCESS-1644697-SUBFLD*/
              }
//  SET 800-ILVL-2 TO TRUE
              methodOut.setIlvl2800True(); 
              
              methodOut.setSys101Rdw800((long)Math.abs(methodOut.getIlvl800() + PDS_END_TAG_300_LENGTH));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-PDS-END-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(methodIn.getIndent800(),0,methodOut.getIlvl800()));
                 charArray.add(methodIn.getPdsEndTag300());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getSys101OutRec().toCharArray() ,joinCharArray);
              methodOut.getSys101OutRec().setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
              writeSys101(programCtx.getWriteSys101InCtx());/*2200-WRITE-SYS101*/
          }
//  ELSE
          else { 
//  MOVE 500-1644697-TAG-NUM ( 500-1644697-NDX ) TO 300-PDS-STR-CD
              methodOut.setPdsStrCd300(methodOut.getTagNum5001644697(methodOut.getNdx5001644697() - 1));
//  SET 800-ILVL-2 TO TRUE
              methodOut.setIlvl2800True(); 
              
              methodOut.setSys101Rdw800((long)Math.abs(methodOut.getIlvl800() + PdsStrTag300.getPdsStrTag300FieldLength() + methodIn.getTagLen5001644697(methodOut.getNdx5001644697() - 1) + PDS_END_TAG_300_LENGTH));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-PDS-STR-TAG 500-1644697-TAG-VALUE ( 500-1644697-NDX ) (1 : 500-1644697-TAG-LEN ( 500-1644697-NDX )) 300-PDS-END-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(methodIn.getIndent800(),0,methodOut.getIlvl800()));
                 charArray.add(methodIn.getPdsStrTag300().toCharArray());
                 charArray.add(substring(methodIn.getTagValue5001644697(methodOut.getNdx5001644697() - 1),0,methodIn.getTagLen5001644697(methodOut.getNdx5001644697() - 1)));
                 charArray.add(methodIn.getPdsEndTag300());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3));
              updated = updateString(methodOut.getSys101OutRec().toCharArray() ,joinCharArray);
              methodOut.getSys101OutRec().setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
              writeSys101(programCtx.getWriteSys101InCtx());/*2200-WRITE-SYS101*/
//  SET 500-1644697-NDX UP BY 1
              methodOut.setNdx5001644697(methodOut.getNdx5001644697() + 1); 
              
          }
      
      return methodOut;
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
      @Override
      public Process1644697SubfldOutCtx process1644697Subfld(Process1644697SubfldInCtx methodIn) throws Exception {
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
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
Process1644697SubfldOutCtx methodOut = methodIn.getProcess1644697SubfldOutCtx();
//  SET 800-ILVL-3 TO TRUE
          methodOut.setIlvl3800True(); 
          
          methodOut.setSys101Rdw800((long)Math.abs(methodOut.getIlvl800() + SUBFLD_TAG_STR_300_LENGTH + methodIn.getTagLen5001644697(methodOut.getNdx5001644697() - 1) + SUBFLD_TAG_END_300_LENGTH));
//  IF 500-1644697-TAG-LEN ( 500-1644697-NDX ) > 0
          if (	( methodIn.getTagLen5001644697(methodOut.getNdx5001644697() - 1) > 0 )) { 
//  STRING 800-INDENT (1 : 800-ILVL ) 300-SUBFLD-TAG-STR 500-1644697-TAG-VALUE ( 500-1644697-NDX ) (1 : 500-1644697-TAG-LEN ( 500-1644697-NDX )) 300-SUBFLD-TAG-END DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(methodIn.getIndent800(),0,methodOut.getIlvl800()));
                 charArray.add(methodIn.getSubfldTagStr300());
                 charArray.add(substring(methodIn.getTagValue5001644697(methodOut.getNdx5001644697() - 1),0,methodIn.getTagLen5001644697(methodOut.getNdx5001644697() - 1)));
                 charArray.add(methodIn.getSubfldTagEnd300());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3));
              updated = updateString(methodOut.getSys101OutRec().toCharArray() ,joinCharArray);
              methodOut.getSys101OutRec().setString(  (char[])updated.get("string"));
          }
//  ELSE
          else { 
//  STRING 800-INDENT (1 : 800-ILVL ) 300-SUBFLD-TAG-STR 300-SUBFLD-TAG-END DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(methodIn.getIndent800(),0,methodOut.getIlvl800()));
                 charArray.add(methodIn.getSubfldTagStr300());
                 charArray.add(methodIn.getSubfldTagEnd300());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2));
              updated = updateString(methodOut.getSys101OutRec().toCharArray() ,joinCharArray);
              methodOut.getSys101OutRec().setString(  (char[])updated.get("string"));
          }
//  PERFORM 2200-WRITE-SYS101
          writeSys101(programCtx.getWriteSys101InCtx());/*2200-WRITE-SYS101*/
//  SET 500-1644697-NDX UP BY 1
          methodOut.setNdx5001644697(methodOut.getNdx5001644697() + 1); 
          
      
      return methodOut;
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
      @Override
      public Write1644697PsipmOutCtx write1644697Psipm(Write1644697PsipmInCtx methodIn) throws Exception {
      
// ******************************************************************
// * Write pseudo ipm message
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
Write1644697PsipmOutCtx methodOut = methodIn.getWrite1644697PsipmOutCtx();
//  SET IP66601-USER-T TO 1
          methodOut.setIp66601UserT(1); 
          
//  MOVE 1 TO IP66601-USER-TCNT 800-FLD-STRT
          methodOut.setIp66601UserTcnt((short)1);
          methodOut.setFldStrt800((long)1);

// *    Write element tags to user tag table
//  PERFORM VARYING 500-1644697-NDX FROM 1 BY 1 UNTIL 500-1644697-NDX > 500-1644697-TBL-ITEMS
          for (methodOut.setNdx5001644697(1); (	( methodOut.getNdx5001644697() <= methodIn.getTblItems5001644697() )) ; methodOut.setNdx5001644697(methodOut.getNdx5001644697() + 1) ) {
//  SET IP66601-USER-T TO 500-1644697-NDX
              methodOut.setIp66601UserT(methodOut.getNdx5001644697()); 
              
//  EVALUATE 500-1644697-TAG-TYPE ( 500-1644697-NDX )
              switch(new String(methodIn.getTagType5001644697(methodOut.getNdx5001644697() - 1))){
              	case "M":
//  SET IP66601-USER-MTI-TAG ( IP66601-USER-T ) TO TRUE
                  methodOut.setIp66601UserMtiTagTrue(methodOut.getIp66601UserT() - 1); 
                  
              break;
              	case "D":
//  SET IP66601-USER-DE-TAG ( IP66601-USER-T ) TO TRUE
                  methodOut.setIp66601UserDeTagTrue(methodOut.getIp66601UserT() - 1); 
                  
              break;
              	case "P":
//  SET IP66601-USER-PDS-TAG ( IP66601-USER-T ) TO TRUE
                  methodOut.setIp66601UserPdsTagTrue(methodOut.getIp66601UserT() - 1); 
                  
              break;
              }
//  MOVE 500-1644697-TAG-NUM ( 500-1644697-NDX ) TO IP66601-USER-TAG-NO ( IP66601-USER-T )
              methodOut.setIp66601UserTagNo(methodOut.getIp66601UserT() - 1,(short) methodOut.getTagNum5001644697(methodOut.getNdx5001644697() - 1));
//  MOVE 500-1644697-TAG-OCCUR ( 500-1644697-NDX ) TO IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-T )
              methodOut.setIp66601UserTagOccurrence(methodOut.getIp66601UserT() - 1,(short) methodOut.getTagOccur5001644697(methodOut.getNdx5001644697() - 1));
//  MOVE 500-1644697-TAG-SUBFLD-NO ( 500-1644697-NDX ) TO IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-T )
              methodOut.setIp66601UserTagSubfldNo(methodOut.getIp66601UserT() - 1,(short) methodOut.getTagSubfldNo5001644697(methodOut.getNdx5001644697() - 1));
//  MOVE 800-FLD-STRT TO IP66601-USER-TAG-START ( IP66601-USER-T )
              methodOut.setIp66601UserTagStart(methodOut.getIp66601UserT() - 1,(short) methodOut.getFldStrt800());
//  MOVE 500-1644697-TAG-LEN ( 500-1644697-NDX ) TO IP66601-USER-TAG-LNGTH ( IP66601-USER-T )
              methodOut.setIp66601UserTagLngth(methodOut.getIp66601UserT() - 1,(short) methodOut.getTagLen5001644697(methodOut.getNdx5001644697() - 1));

// *    Write element content to message string
//  IF 500-1644697-TAG-LEN ( 500-1644697-NDX ) > 0
              if (	( methodOut.getTagLen5001644697(methodOut.getNdx5001644697() - 1) > 0 )) { 
//  MOVE 500-1644697-TAG-VALUE ( 500-1644697-NDX ) (1 : 500-1644697-TAG-LEN ( 500-1644697-NDX )) TO IP66102-NORMAL-IPM-MSG ( 800-FLD-STRT : IP66601-USER-TAG-LNGTH ( IP66601-USER-T ))
                  methodOut.setIp66102NormalIpmMsg(replace(methodOut.getIp66102NormalIpmMsg().toCharArray(),substring(methodOut.getTagValue5001644697(methodOut.getNdx5001644697() - 1),0,methodOut.getTagLen5001644697(methodOut.getNdx5001644697() - 1)),((int) methodOut.getFldStrt800()-1), (methodOut.getIp66601UserTagLngth(methodOut.getIp66601UserT() - 1) + ((int) methodOut.getFldStrt800() - 1)) ));
              }
//  ADD IP66601-USER-TAG-LNGTH ( IP66601-USER-T ) TO 800-FLD-STRT
              methodOut.setFldStrt800(methodOut.getFldStrt800()+(short) methodOut.getIp66601UserTagLngth(methodOut.getIp66601UserT() - 1));
          }

// *    Set ip66601-user-t     down by 1
//  SET IP66601-USER-TCNT TO IP66601-USER-T
          methodOut.setIp66601UserTcnt((short) (short) methodOut.getIp66601UserT()); 
          
          methodOut.setSys201Rdw800((long) (Math.abs(5 + methodOut.getFldStrt800() - 1 +  ( 24 * methodOut.getIp66601UserTcnt() ) )));
          methodOut.setTagTblPtr800((long) (Math.abs(5 + methodOut.getFldStrt800())));

// *    Write tag table pointer to sys201 record

// *    Write message string to sys201 record
//  MOVE 800-TAG-TBL-PTR TO SYS201-OUT-REC (1 : 5)
          methodOut.getSys201OutRec().replace(String.valueOf(methodOut.getTagTblPtr800String()).toCharArray(),0,String.valueOf(methodOut.getTagTblPtr800String()).length(),0,5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE IP66102-NORMAL-IPM-MSG (1 : 800-FLD-STRT ) TO SYS201-OUT-REC (6 : 800-FLD-STRT )
          methodOut.getSys201OutRec().replace(methodOut.getIp66102IpmMsg()/*parent*/,0/*fromOffset - (sys201OutRec) */,(int) methodOut.getFldStrt800()/*fromLen*/,0+6 - 1/*toOffset - (ip66102NormalIpmMsg) */,(int) methodOut.getFldStrt800()/*toLen*/);
          // MOVE 800-TAG-TBL-PTR TO 800-FLD-STRT
          methodOut.setFldStrt800(methodOut.getTagTblPtr800());

// *    Write tag table to sys201 record
//  PERFORM VARYING IP66601-USER-T FROM 1 BY 1 UNTIL IP66601-USER-T > IP66601-USER-TCNT
          for (methodOut.setIp66601UserT(1); (	( methodOut.getIp66601UserT() <= methodOut.getIp66601UserTcnt() ) ) ; methodOut.setIp66601UserT(methodOut.getIp66601UserT() + 1) ) {
//  MOVE IP66601-USER-TAG-TYPE ( IP66601-USER-T ) TO 800-TAG-TYPE
              methodOut.setTagType800(methodOut.getIp66601UserTagType(methodOut.getIp66601UserT() - 1));
//  MOVE IP66601-USER-TAG-NO ( IP66601-USER-T ) TO 800-TAG-NUM
              methodOut.setTagNum800(methodOut.getIp66601UserTagNo(methodOut.getIp66601UserT() - 1));
//  MOVE IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-T ) TO 800-TAG-OCCUR
              methodOut.setTagOccur800(methodOut.getIp66601UserTagOccurrence(methodOut.getIp66601UserT() - 1));
//  MOVE IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-T ) TO 800-TAG-SUBFLD-NO
              methodOut.setTagSubfldNo800(methodOut.getIp66601UserTagSubfldNo(methodOut.getIp66601UserT() - 1));
//  MOVE IP66601-USER-TAG-START ( IP66601-USER-T ) TO 800-TAG-START
              methodOut.setTagStart800(methodOut.getIp66601UserTagStart(methodOut.getIp66601UserT() - 1));
//  MOVE IP66601-USER-TAG-LNGTH ( IP66601-USER-T ) TO 800-TAG-LNGTH
              methodOut.setTagLngth800(methodOut.getIp66601UserTagLngth(methodOut.getIp66601UserT() - 1));
//  MOVE 800-TAG (1 : 24) TO SYS201-OUT-REC ( 800-FLD-STRT : 24)
              methodOut.getSys201OutRec().replace(methodIn.getWorkAreas800()/*parent*/,0/*fromOffset - (sys201OutRec) */,24/*fromLen*/,0+(int) methodOut.getFldStrt800() - 1/*toOffset - (tag800) */,24/*toLen*/);
//  ADD 24 TO 800-FLD-STRT
              methodOut.setFldStrt800(methodOut.getFldStrt800()+(long)24);
          }
//  PERFORM 3110-WRITE-SYS201
          writeSys201(programCtx.getWriteSys201InCtx());/*3110-WRITE-SYS201*/
          ;
      
      return methodOut;
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
      @Override
      public Write1644697IpmOutCtx write1644697Ipm(Write1644697IpmInCtx methodIn) throws Exception {
      
// ******************************************************************
// * Write ipm message
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
Write1644697IpmOutCtx methodOut = methodIn.getWrite1644697IpmOutCtx();
//  CALL 800-PTR-IP666010
          // CALL 800-PTR-IP666010
          	programCtx.setRc( ip666010.process(programCtx.getGlobalCtx().getContext("IP666010")));
      
      return methodOut;
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
      @Override
      public AddComnFieldOutCtx addComnField(AddComnFieldInCtx methodIn) throws Exception {
      
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
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
AddComnFieldOutCtx methodOut = methodIn.getAddComnFieldOutCtx();
//  IF 500-COMN-TBL-ITEMS < 500-COMN-TBL-MAX
          if (	( methodOut.getComnTblItems500() < methodOut.getComnTblMax500() )) { 
//  ADD 1 TO 500-COMN-TBL-ITEMS
              methodOut.setComnTblItems500(methodOut.getComnTblItems500()+1);
//  SET 500-COMN-NDX TO 500-COMN-TBL-ITEMS
              methodOut.setComnNdx500(methodOut.getComnTblItems500()); 
              
//  MOVE 800-NEW-ELEM TO 500-COMN-TAG-KEY ( 500-COMN-NDX )
              methodOut.setComnTagKey500(methodOut.getComnNdx500() - 1,methodOut.getNewElem800());
//  MOVE 800-NEW-ELEM-LEN TO 500-COMN-TAG-LEN ( 500-COMN-NDX )
              methodOut.setComnTagLen500(methodOut.getComnNdx500() - 1,methodOut.getNewElemLen800());
//  MOVE 800-NEW-ELEM-VALUE TO 500-COMN-TAG-VALUE ( 500-COMN-NDX )
              methodOut.setComnTagValue500(methodOut.getComnNdx500() - 1,methodOut.getNewElemValue800());
//  IF 500-COMN-TBL-ITEMS > 1
              if (	( methodOut.getComnTblItems500() > 1 )) { 
//  SET 500-COMN-NDX2 TO 500-COMN-NDX
                  methodOut.setComnNdx2500(methodOut.getComnNdx500()); 
                  
//  SET 500-COMN-NDX2 DOWN BY 1
                  methodOut.setComnNdx2500(methodOut.getComnNdx2500() - 1); 
                  
//  IF 500-COMN-TAG-KEY ( 500-COMN-NDX ) < 500-COMN-TAG-KEY ( 500-COMN-NDX2 )
                  if (		compareChars(methodOut.getComnTagKey500(methodOut.getComnNdx500() - 1),methodOut.getComnTagKey500(methodOut.getComnNdx2500() - 1)) < 0 ) { 
//  PERFORM 8100-SORT-COMN-FIELDS
                      sortComnFields(programCtx.getSortComnFieldsInCtx());/*8100-SORT-COMN-FIELDS*/
                  }
              }
          }
//  ELSE
          else { 
//  SET 600-3008-TABLE-COMN TO TRUE
              methodOut.setTableComn6003008True(); 
              
//  MOVE 500-COMN-TBL-MAX TO 600-3008-MAX-SIZE
              methodOut.setMaxSize6003008(String.valueOf(CFUtil.pad(8,String.valueOf(methodOut.getComnTblMax500()),"0",CFUtil.LEFT_PAD)).toCharArray());
//  MOVE 300-3008-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(String.valueOf(methodOut.getAbendCode3003008String()).toCharArray());
              // MOVE 600-3008-ERROR-MSG TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getErrorMsg6003008().toCharArray());
//  MOVE 300-PARA-8000-COMN TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara8000Comn300());
//  PERFORM 9100-ABEND-PROGRAM
              abendProgram(programCtx.getAbendProgramInCtx());/*9100-ABEND-PROGRAM*/
          }
      
      return methodOut;
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
      @Override
      public SortComnFieldsOutCtx sortComnFields(SortComnFieldsInCtx methodIn) throws Exception {
      
// ******************************************************************
// * Sort the :t: element table
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
SortComnFieldsOutCtx methodOut = methodIn.getSortComnFieldsOutCtx();
//  PERFORM VARYING 500-COMN-NDX FROM 500-COMN-TBL-ITEMS BY -1 UNTIL 500-COMN-NDX <= 1
          for (methodOut.setComnNdx500(methodIn.getComnTblItems500()); (	( methodOut.getComnNdx500() > 1 )) ; methodOut.setComnNdx500(methodOut.getComnNdx500() + -1) ) {
//  PERFORM VARYING 500-COMN-NDX2 FROM 1 BY 1 UNTIL 500-COMN-NDX2 >= 500-COMN-NDX
              for (methodOut.setComnNdx2500(1); (	( methodOut.getComnNdx2500() < methodOut.getComnNdx500() )) ; methodOut.setComnNdx2500(methodOut.getComnNdx2500() + 1) ) {
//  IF 500-COMN-TAG-KEY ( 500-COMN-NDX ) < 500-COMN-TAG-KEY ( 500-COMN-NDX2 )
                  if (		compareChars(methodIn.getComnTagKey500(methodOut.getComnNdx500() - 1),methodIn.getComnTagKey500(methodOut.getComnNdx2500() - 1)) < 0 ) { 
//  MOVE 500-COMN-TBL-ENTRY ( 500-COMN-NDX ) TO 800-SAVE-ENTRY
                      methodOut.setSaveEntry800(methodOut.getComnTblEntry500(methodOut.getComnNdx500() - 1).toCharArray());
//  MOVE 500-COMN-TBL-ENTRY ( 500-COMN-NDX2 ) TO 500-COMN-TBL-ENTRY ( 500-COMN-NDX )
                      methodOut.setComnTblEntry500(methodOut.getComnNdx500() - 1,methodOut.getComnTblEntry500(methodOut.getComnNdx2500() - 1).toCharArray());
//  MOVE 800-SAVE-ENTRY TO 500-COMN-TBL-ENTRY ( 500-COMN-NDX2 )
                      methodOut.setComnTblEntry500(methodOut.getComnNdx2500() - 1,methodOut.getSaveEntry800());
                  }
              }
          }
      
      return methodOut;
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
      @Override
      public UpdateComnFieldOutCtx updateComnField(UpdateComnFieldInCtx methodIn) throws Exception {
      
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
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
UpdateComnFieldOutCtx methodOut = methodIn.getUpdateComnFieldOutCtx();
          // MOVE 800-NEW-ELEM TO 500-COMN-TBL-SRCH-KEY
          methodOut.setComnTblSrchKey500(methodOut.getNewElem800());
//  PERFORM 8300-LOOKUP-COMN-FIELD
          lookupComnField(programCtx.getLookupComnFieldInCtx());/*8300-LOOKUP-COMN-FIELD*/
//  IF 500-COMN-SRCH-KEY-FND
          if ( methodIn.isComnSrchKeyFnd500()  ) { 
//  MOVE 800-NEW-ELEM TO 500-COMN-TAG-KEY ( 500-COMN-NDX )
              methodOut.setComnTagKey500(methodIn.getComnNdx500() - 1,methodOut.getNewElem800());
//  MOVE 800-NEW-ELEM-LEN TO 500-COMN-TAG-LEN ( 500-COMN-NDX )
              methodOut.setComnTagLen500(methodIn.getComnNdx500() - 1,methodOut.getNewElemLen800());
//  MOVE 800-NEW-ELEM-VALUE TO 500-COMN-TAG-VALUE ( 500-COMN-NDX )
              methodOut.setComnTagValue500(methodIn.getComnNdx500() - 1,methodOut.getNewElemValue800());
          }
//  ELSE
          else { 
//  PERFORM 8000-ADD-COMN-FIELD
              addComnField(programCtx.getAddComnFieldInCtx());/*8000-ADD-COMN-FIELD*/
          }
      
      return methodOut;
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
      @Override
      public LookupComnFieldOutCtx lookupComnField(LookupComnFieldInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			boolean keepSearching = true;
			int[] searchIndexes = null;
			int searchLowPoint = 0;
			int searchMidPoint = 0;
			int searchHighPoint = 0;
			int searchCompare = 0;
			// End of variable declaration

      
// ******************************************************************
// * Lookup a field in to the :t: element table
// *
// * note:
// * 500-:t:-srch-key should be populated with proper
// * search key before this paragraph is called
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
LookupComnFieldOutCtx methodOut = methodIn.getLookupComnFieldOutCtx();
//  SET 500-COMN-NDX TO 1
          methodOut.setComnNdx500(1); 
          
//  SEARCH ALL 500-COMN-TBL-ENTRY
          // Binary Search through methodIn.getComnElementsTable500().comnTblEntry500
          searchLowPoint = 0; //prevLowValue
          searchHighPoint = methodIn.getComnTblItems500(); //prevHighValue
          searchMidPoint = searchHighPoint / 2; //starting at mid point
          searchIndexes = new int[]{searchLowPoint,searchMidPoint,searchHighPoint};
          keepSearching = true;
          while (keepSearching) {
          // compare logic below
             searchCompare = compareAscending(methodIn.getComnTagKey500(searchMidPoint),methodIn.getComnTblSrchKey500());
          // end of compare logic
          	if (searchCompare == 0 ) { // if search found
          	      keepSearching = false;
          	     methodOut.setComnNdx500(searchMidPoint + 1);
//  SET 500-COMN-SRCH-KEY-FND TO TRUE
              methodOut.setComnSrchKeyFnd500True(); 
              
          	} else  {
          		adjustSearchIndex(searchCompare,searchIndexes);
          		searchLowPoint  = searchIndexes[0];
           		searchMidPoint  = searchIndexes[1];
           		searchHighPoint = searchIndexes[2];
           		if (searchMidPoint == -1) { // search exhausted
           		    keepSearching = false; 
//  SET 500-COMN-SRCH-KEY-NOT-FND TO TRUE
              methodOut.setComnSrchKeyNotFnd500True(); 
              
           		}
          	}
          }
      
      return methodOut;
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
      @Override
      public DisplayComnTableOutCtx displayComnTable(DisplayComnTableInCtx methodIn) throws Exception {
      
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
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
DisplayComnTableOutCtx methodOut = methodIn.getDisplayComnTableOutCtx();
//  DISPLAY '================================================'
          logger.info("================================================"); 
          // MOVE 'M000000000000' TO 500-COMN-TBL-SRCH-KEY
          //  LITERAL_M000000000000 = 'M000000000000'
          methodOut.setComnTblSrchKey500(CONSTANTS.LITERAL_M000000000000);
//  PERFORM 8300-LOOKUP-COMN-FIELD
          lookupComnField(programCtx.getLookupComnFieldInCtx());/*8300-LOOKUP-COMN-FIELD*/
//  IF 500-COMN-SRCH-KEY-FND
          if ( methodIn.isComnSrchKeyFnd500()  ) { 
//  DISPLAY '= ' 500-COMN-TAG-VALUE ( 500-COMN-NDX ) (1 : 500-COMN-TAG-LEN ( 500-COMN-NDX ))
              logger.info("= {}", new String(substring(methodIn.getComnTagValue500(methodOut.getComnNdx500() - 1),0,methodIn.getComnTagLen500(methodOut.getComnNdx500() - 1)))); 
          }
          // MOVE 'D002400000000' TO 500-COMN-TBL-SRCH-KEY
          //  LITERAL_D002400000000 = 'D002400000000'
          methodOut.setComnTblSrchKey500(CONSTANTS.LITERAL_D002400000000);
//  PERFORM 8300-LOOKUP-COMN-FIELD
          lookupComnField(programCtx.getLookupComnFieldInCtx());/*8300-LOOKUP-COMN-FIELD*/
//  IF 500-COMN-SRCH-KEY-FND
          if ( methodIn.isComnSrchKeyFnd500()  ) { 
//  DISPLAY '= ' 500-COMN-TAG-VALUE ( 500-COMN-NDX ) (1 : 500-COMN-TAG-LEN ( 500-COMN-NDX ))
              logger.info("= {}", new String(substring(methodIn.getComnTagValue500(methodOut.getComnNdx500() - 1),0,methodIn.getComnTagLen500(methodOut.getComnNdx500() - 1)))); 
          }
//  DISPLAY '= TABLE ELEMENTS'
          logger.info("= TABLE ELEMENTS"); 
//  DISPLAY '================================================'
          logger.info("================================================"); 
//  DISPLAY '     #   ' ' T' ' CODE' ' SUBF' ' OCCR' ' LEN' ' VALUE'
          logger.info("     #    T CODE SUBF OCCR LEN VALUE"); 
//  PERFORM VARYING 500-COMN-NDX FROM 1 BY 1 UNTIL 500-COMN-NDX > 500-COMN-TBL-ITEMS
          for (methodOut.setComnNdx500(1); (	( methodOut.getComnNdx500() <= methodIn.getComnTblItems500() )) ; methodOut.setComnNdx500(methodOut.getComnNdx500() + 1) ) {
//  SET 800-PTR-VAL TO 500-COMN-NDX
              methodOut.setPtrVal800((int) methodOut.getComnNdx500()); 
              
//  IF 500-COMN-TAG-LEN ( 500-COMN-NDX ) > 0
              if (	( methodIn.getComnTagLen500(methodOut.getComnNdx500() - 1) > 0 )) { 
//  DISPLAY ' ' 800-PTR-VAL ' ' 500-COMN-TAG-TYPE ( 500-COMN-NDX ) ' ' 500-COMN-TAG-NUM ( 500-COMN-NDX ) ' ' 500-COMN-TAG-SUBFLD-NO ( 500-COMN-NDX ) ' ' 500-COMN-TAG-OCCUR ( 500-COMN-NDX ) ' ' 500-COMN-TAG-LEN ( 500-COMN-NDX ) ' ' 500-COMN-TAG-VALUE ( 500-COMN-NDX ) (1 : 500-COMN-TAG-LEN ( 500-COMN-NDX ))
                  logger.info(" {} {} {} {} {} {} {}", String.valueOf(methodOut.getPtrVal800()), new String(methodIn.getComnTagType500(methodOut.getComnNdx500() - 1)), String.valueOf(methodIn.getComnTagNum500(methodOut.getComnNdx500() - 1)), String.valueOf(methodIn.getComnTagSubfldNo500(methodOut.getComnNdx500() - 1)), String.valueOf(methodIn.getComnTagOccur500(methodOut.getComnNdx500() - 1)), String.valueOf(methodIn.getComnTagLen500(methodOut.getComnNdx500() - 1)), new String(substring(methodIn.getComnTagValue500(methodOut.getComnNdx500() - 1),0,methodIn.getComnTagLen500(methodOut.getComnNdx500() - 1)))); 
              }
//  ELSE
              else { 
//  DISPLAY ' ' 800-PTR-VAL ' ' 500-COMN-TAG-TYPE ( 500-COMN-NDX ) ' ' 500-COMN-TAG-NUM ( 500-COMN-NDX ) ' ' 500-COMN-TAG-SUBFLD-NO ( 500-COMN-NDX ) ' ' 500-COMN-TAG-OCCUR ( 500-COMN-NDX ) ' ' 500-COMN-TAG-LEN ( 500-COMN-NDX ) ' ???'
                  logger.info(" {} {} {} {} {} {} ???", String.valueOf(methodOut.getPtrVal800()), new String(methodIn.getComnTagType500(methodOut.getComnNdx500() - 1)), String.valueOf(methodIn.getComnTagNum500(methodOut.getComnNdx500() - 1)), String.valueOf(methodIn.getComnTagSubfldNo500(methodOut.getComnNdx500() - 1)), String.valueOf(methodIn.getComnTagOccur500(methodOut.getComnNdx500() - 1)), String.valueOf(methodIn.getComnTagLen500(methodOut.getComnNdx500() - 1))); 
              }
          }
//  DISPLAY '================================================'
          logger.info("================================================"); 
      
      return methodOut;
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
      @Override
      public GetComnFieldOutCtx getComnField(GetComnFieldInCtx methodIn) throws Exception {
      
// * Field length is stored in 800-field-len
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
GetComnFieldOutCtx methodOut = methodIn.getGetComnFieldOutCtx();
//  PERFORM 8300-LOOKUP-COMN-FIELD
          lookupComnField(programCtx.getLookupComnFieldInCtx());/*8300-LOOKUP-COMN-FIELD*/

// *    If data element has subfields; find first one
//  IF 500-COMN-SRCH-KEY-NOT-FND
          if ( methodIn.isComnSrchKeyNotFnd500()  ) { 
//  MOVE '0001' TO 500-COMN-TBL-SRCH-KEY (6 : 4)
//  LITERAL_0001 = '0001'
              methodOut.setComnTblSrchKey500(replace(methodOut.getComnTblSrchKey500(),CONSTANTS.LITERAL_0001,5,9));
//  PERFORM 8300-LOOKUP-COMN-FIELD
              lookupComnField(programCtx.getLookupComnFieldInCtx());/*8300-LOOKUP-COMN-FIELD*/
          }
//  IF 500-COMN-SRCH-KEY-FND
          if ( methodIn.isComnSrchKeyFnd500()  ) { 
              // MOVE 1 TO 800-FIELD-PTR
              methodOut.setFieldPtr800(1);
              // MOVE 0 TO 800-FIELD-LEN
              methodOut.setFieldLen800(0);
//  PERFORM VARYING 500-COMN-NDX2 FROM 500-COMN-NDX BY 1 UNTIL 500-COMN-TAG-KEY ( 500-COMN-NDX2 ) (1 : 5) NOT EQUAL 500-COMN-TBL-SRCH-KEY (1 : 5) OR 500-COMN-NDX2 > 500-COMN-TBL-ITEMS
              for (methodOut.setComnNdx2500(methodIn.getComnNdx500()); (		compareChars(substring(methodIn.getComnTagKey500(methodOut.getComnNdx2500() - 1).toCharArray(),0,5),substring(methodOut.getComnTblSrchKey500(),0,5)) == 0  && 	( methodOut.getComnNdx2500() <= methodIn.getComnTblItems500() )) ; methodOut.setComnNdx2500(methodOut.getComnNdx2500() + 1) ) {
//  MOVE 500-COMN-TAG-VALUE ( 500-COMN-NDX2 ) (1 : 500-COMN-TAG-LEN ( 500-COMN-NDX2 )) TO 800-FIELD-VAL ( 800-FIELD-PTR : 500-COMN-TAG-LEN ( 500-COMN-NDX2 ))
                  methodOut.setFieldVal800(replace(methodOut.getFieldVal800(),substring(methodOut.getComnTagValue500(methodOut.getComnNdx2500() - 1),0,methodIn.getComnTagLen500(methodOut.getComnNdx2500() - 1)),(methodOut.getFieldPtr800()-1), (methodIn.getComnTagLen500(methodOut.getComnNdx2500() - 1) + (methodOut.getFieldPtr800() - 1)) ));
//  ADD 500-COMN-TAG-LEN ( 500-COMN-NDX2 ) TO 800-FIELD-PTR 800-FIELD-LEN
                  methodOut.setFieldPtr800(methodOut.getFieldPtr800()+methodIn.getComnTagLen500(methodOut.getComnNdx2500() - 1));
                  methodOut.setFieldLen800(methodOut.getFieldLen800()+methodIn.getComnTagLen500(methodOut.getComnNdx2500() - 1));
              }
          }
//  ELSE
          else { 
//  MOVE SPACES TO 800-FIELD-VAL
              methodOut.setFieldVal800(CONSTANTS.SPACE_999);
              // MOVE 0 TO 800-FIELD-LEN
              methodOut.setFieldLen800(0);
          }
      
      return methodOut;
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
      @Override
      public void writeComn(WriteComnInCtx methodIn) throws Exception {
      
// ******************************************************************
// * Write message
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
//  IF 1000-WRITE-XML-MSGS
          if ( methodIn.isWriteXmlMsgs1000()  ) { 
//  PERFORM 8600-WRITE-COMN-XML
              writeComnXml(programCtx.getWriteComnXmlInCtx());/*8600-WRITE-COMN-XML*/
          }
//  IF 1000-WRITE-PSIPM-MSGS
          if ( methodIn.isWritePsipmMsgs1000()  ) { 
//  PERFORM 8700-WRITE-COMN-PSIPM
              writeComnPsipm(programCtx.getWriteComnPsipmInCtx());/*8700-WRITE-COMN-PSIPM*/
          }
//  IF 1000-WRITE-IPM-MSGS
          if ( methodIn.isWriteIpmMsgs1000()  ) { 
//  PERFORM 8800-WRITE-COMN-IPM
              writeComnIpm(programCtx.getWriteComnIpmInCtx());/*8800-WRITE-COMN-IPM*/
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
      @Override
      public WriteComnXmlOutCtx writeComnXml(WriteComnXmlInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			 final int MSG_END_TAG_300_LENGTH = 6;
			// End of variable declaration

      
// ******************************************************************
// * Write xml message
// ******************************************************************

// * Message header
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
WriteComnXmlOutCtx methodOut = methodIn.getWriteComnXmlOutCtx();
//  SET 800-ILVL-1 TO TRUE
          methodOut.setIlvl1800True(); 
          
          methodOut.setSys101Rdw800((long)Math.abs(methodOut.getIlvl800() + MsgStrTag300.getMsgStrTag300FieldLength()));
          // MOVE 'M000000000000' TO 500-COMN-TBL-SRCH-KEY
          //  LITERAL_M000000000000 = 'M000000000000'
          methodOut.setComnTblSrchKey500(CONSTANTS.LITERAL_M000000000000);
//  PERFORM 8500-GET-COMN-FIELD
          getComnField(programCtx.getGetComnFieldInCtx());/*8500-GET-COMN-FIELD*/
//  MOVE 800-FIELD-VAL (1 : 800-FIELD-LEN ) TO 300-MSG-STR-MTI
          methodOut.setMsgStrMti300(CFUtil.getInt(substring(methodOut.getFieldVal800(),0,methodIn.getFieldLen800())));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-MSG-STR-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
          charArray = new ArrayList<char[]>();
             charArray.add(substring(methodIn.getIndent800(),0,methodOut.getIlvl800()));
             charArray.add(methodIn.getMsgStrTag300().toCharArray());
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
          updated = updateString(methodOut.getSys101OutRec().toCharArray() ,joinCharArray);
          methodOut.getSys101OutRec().setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
          writeSys101(programCtx.getWriteSys101InCtx());/*2200-WRITE-SYS101*/

// * Message details
//  SET 500-COMN-NDX TO 1
          methodOut.setComnNdx500(1); 
          
//  PERFORM UNTIL 500-COMN-NDX > 500-COMN-TBL-ITEMS
          while ((	( methodOut.getComnNdx500() <= methodIn.getComnTblItems500() ))) {
//  EVALUATE 500-COMN-TAG-TYPE ( 500-COMN-NDX )
              if  (		compareChars(methodOut.getComnTagType500(methodOut.getComnNdx500() - 1),methodIn.getM300()) == 0 ) { 

// *            Skip tag since we already wrote message header
//  SET 500-COMN-NDX UP BY 1
                  methodOut.setComnNdx500(methodOut.getComnNdx500() + 1); 
                  
              }
              else if  (		compareChars(methodOut.getComnTagType500(methodOut.getComnNdx500() - 1),methodIn.getD300()) == 0 ) { 
//  PERFORM 8610-PROCESS-COMN-DE
                  processComnDe(programCtx.getProcessComnDeInCtx());/*8610-PROCESS-COMN-DE*/
              }
              else if  (		compareChars(methodOut.getComnTagType500(methodOut.getComnNdx500() - 1),methodIn.getP300()) == 0 ) { 
//  PERFORM 8620-PROCESS-COMN-PDS
                  processComnPds(programCtx.getProcessComnPdsInCtx());/*8620-PROCESS-COMN-PDS*/
              }
              else   { 
//  MOVE 500-COMN-TAG-TYPE ( 500-COMN-NDX ) TO 600-3009-TAG
                  methodOut.setTag6003009(methodOut.getComnTagType500(methodOut.getComnNdx500() - 1));
//  MOVE 300-3009-ABEND-CODE TO 900-ABEND-CODE
                  methodOut.setAbendCode900(String.valueOf(methodOut.getAbendCode3003009String()).toCharArray());
                  // MOVE 600-3009-ERROR-MSG TO 900-ABEND-TEXT
                  methodOut.setAbendText900(methodOut.getErrorMsg6003009().toCharArray());
//  MOVE '8600-WRITE-:T:-XML' TO 900-ABEND-PARA
                  methodOut.setAbendPara900(CONSTANTS.LITERAL_1572256913);
//  PERFORM 9100-ABEND-PROGRAM
                  abendProgram(programCtx.getAbendProgramInCtx());/*9100-ABEND-PROGRAM*/
              }
          }

// * Message trailer
//  SET 800-ILVL-1 TO TRUE
          methodOut.setIlvl1800True(); 
          
          methodOut.setSys101Rdw800((long)Math.abs(methodOut.getIlvl800() + MSG_END_TAG_300_LENGTH));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-MSG-END-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
          charArray = new ArrayList<char[]>();
             charArray.add(substring(methodIn.getIndent800(),0,methodOut.getIlvl800()));
             charArray.add(methodIn.getMsgEndTag300());
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
          updated = updateString(methodOut.getSys101OutRec().toCharArray() ,joinCharArray);
          methodOut.getSys101OutRec().setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
          writeSys101(programCtx.getWriteSys101InCtx());/*2200-WRITE-SYS101*/
          ;
      
      return methodOut;
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
      @Override
      public ProcessComnDeOutCtx processComnDe(ProcessComnDeInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			 final int DE_END_TAG_300_LENGTH = 5;
			// End of variable declaration

      
// ******************************************************************
// * Process de
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
ProcessComnDeOutCtx methodOut = methodIn.getProcessComnDeOutCtx();
//  IF 500-COMN-TAG-SUBFLD-NO ( 500-COMN-NDX ) > 0
          if (	( methodIn.getComnTagSubfldNo500(methodOut.getComnNdx500() - 1) > 0 )) { 
//  MOVE 500-COMN-TAG-NUM ( 500-COMN-NDX ) TO 300-DE-STR-CD
              methodOut.setDeStrCd300(methodOut.getComnTagNum500(methodOut.getComnNdx500() - 1));
//  SET 800-ILVL-2 TO TRUE
              methodOut.setIlvl2800True(); 
              
              methodOut.setSys101Rdw800((long)Math.abs(methodOut.getIlvl800() + DeStrTag300.getDeStrTag300FieldLength()));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-DE-STR-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(methodIn.getIndent800(),0,methodOut.getIlvl800()));
                 charArray.add(methodIn.getDeStrTag300().toCharArray());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getSys101OutRec().toCharArray() ,joinCharArray);
              methodOut.getSys101OutRec().setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
              writeSys101(programCtx.getWriteSys101InCtx());/*2200-WRITE-SYS101*/
//  MOVE 500-COMN-TAG-NUM ( 500-COMN-NDX ) TO 800-SAVE-TAG-NUM
              methodOut.setSaveTagNum800(methodOut.getComnTagNum500(methodOut.getComnNdx500() - 1));
//  PERFORM 8630-PROCESS-COMN-SUBFLD UNTIL 500-COMN-TAG-NUM ( 500-COMN-NDX ) NOT EQUAL 800-SAVE-TAG-NUM
              while (	( methodOut.getComnTagNum500(methodOut.getComnNdx500() - 1) == methodOut.getSaveTagNum800() )) {
                 processComnSubfld(programCtx.getProcessComnSubfldInCtx());/*8630-PROCESS-COMN-SUBFLD*/
              }
//  SET 800-ILVL-2 TO TRUE
              methodOut.setIlvl2800True(); 
              
              methodOut.setSys101Rdw800((long)Math.abs(methodOut.getIlvl800() + DE_END_TAG_300_LENGTH));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-DE-END-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(methodIn.getIndent800(),0,methodOut.getIlvl800()));
                 charArray.add(methodIn.getDeEndTag300());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getSys101OutRec().toCharArray() ,joinCharArray);
              methodOut.getSys101OutRec().setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
              writeSys101(programCtx.getWriteSys101InCtx());/*2200-WRITE-SYS101*/
          }
//  ELSE
          else { 
//  MOVE 500-COMN-TAG-NUM ( 500-COMN-NDX ) TO 300-DE-STR-CD
              methodOut.setDeStrCd300(methodOut.getComnTagNum500(methodOut.getComnNdx500() - 1));
//  SET 800-ILVL-2 TO TRUE
              methodOut.setIlvl2800True(); 
              
              methodOut.setSys101Rdw800((long)Math.abs(methodOut.getIlvl800() + DeStrTag300.getDeStrTag300FieldLength() + methodIn.getComnTagLen500(methodOut.getComnNdx500() - 1) + DE_END_TAG_300_LENGTH));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-DE-STR-TAG 500-COMN-TAG-VALUE ( 500-COMN-NDX ) (1 : 500-COMN-TAG-LEN ( 500-COMN-NDX )) 300-DE-END-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(methodIn.getIndent800(),0,methodOut.getIlvl800()));
                 charArray.add(methodIn.getDeStrTag300().toCharArray());
                 charArray.add(substring(methodIn.getComnTagValue500(methodOut.getComnNdx500() - 1),0,methodIn.getComnTagLen500(methodOut.getComnNdx500() - 1)));
                 charArray.add(methodIn.getDeEndTag300());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3));
              updated = updateString(methodOut.getSys101OutRec().toCharArray() ,joinCharArray);
              methodOut.getSys101OutRec().setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
              writeSys101(programCtx.getWriteSys101InCtx());/*2200-WRITE-SYS101*/
//  SET 500-COMN-NDX UP BY 1
              methodOut.setComnNdx500(methodOut.getComnNdx500() + 1); 
              
          }
      
      return methodOut;
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
      @Override
      public ProcessComnPdsOutCtx processComnPds(ProcessComnPdsInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			 final int PDS_END_TAG_300_LENGTH = 6;
			// End of variable declaration

      
// ******************************************************************
// * Process pds
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
ProcessComnPdsOutCtx methodOut = methodIn.getProcessComnPdsOutCtx();
//  IF 500-COMN-TAG-SUBFLD-NO ( 500-COMN-NDX ) > 0
          if (	( methodIn.getComnTagSubfldNo500(methodOut.getComnNdx500() - 1) > 0 )) { 
//  MOVE 500-COMN-TAG-NUM ( 500-COMN-NDX ) TO 300-PDS-STR-CD
              methodOut.setPdsStrCd300(methodOut.getComnTagNum500(methodOut.getComnNdx500() - 1));
//  SET 800-ILVL-2 TO TRUE
              methodOut.setIlvl2800True(); 
              
              methodOut.setSys101Rdw800((long)Math.abs(methodOut.getIlvl800() + PdsStrTag300.getPdsStrTag300FieldLength()));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-PDS-STR-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(methodIn.getIndent800(),0,methodOut.getIlvl800()));
                 charArray.add(methodIn.getPdsStrTag300().toCharArray());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getSys101OutRec().toCharArray() ,joinCharArray);
              methodOut.getSys101OutRec().setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
              writeSys101(programCtx.getWriteSys101InCtx());/*2200-WRITE-SYS101*/
//  MOVE 500-COMN-TAG-NUM ( 500-COMN-NDX ) TO 800-SAVE-TAG-NUM
              methodOut.setSaveTagNum800(methodOut.getComnTagNum500(methodOut.getComnNdx500() - 1));
//  PERFORM 8630-PROCESS-COMN-SUBFLD UNTIL 500-COMN-TAG-NUM ( 500-COMN-NDX ) NOT EQUAL 800-SAVE-TAG-NUM
              while (	( methodOut.getComnTagNum500(methodOut.getComnNdx500() - 1) == methodOut.getSaveTagNum800() )) {
                 processComnSubfld(programCtx.getProcessComnSubfldInCtx());/*8630-PROCESS-COMN-SUBFLD*/
              }
//  SET 800-ILVL-2 TO TRUE
              methodOut.setIlvl2800True(); 
              
              methodOut.setSys101Rdw800((long)Math.abs(methodOut.getIlvl800() + PDS_END_TAG_300_LENGTH));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-PDS-END-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(methodIn.getIndent800(),0,methodOut.getIlvl800()));
                 charArray.add(methodIn.getPdsEndTag300());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
              updated = updateString(methodOut.getSys101OutRec().toCharArray() ,joinCharArray);
              methodOut.getSys101OutRec().setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
              writeSys101(programCtx.getWriteSys101InCtx());/*2200-WRITE-SYS101*/
          }
//  ELSE
          else { 
//  MOVE 500-COMN-TAG-NUM ( 500-COMN-NDX ) TO 300-PDS-STR-CD
              methodOut.setPdsStrCd300(methodOut.getComnTagNum500(methodOut.getComnNdx500() - 1));
//  SET 800-ILVL-2 TO TRUE
              methodOut.setIlvl2800True(); 
              
              methodOut.setSys101Rdw800((long)Math.abs(methodOut.getIlvl800() + PdsStrTag300.getPdsStrTag300FieldLength() + methodIn.getComnTagLen500(methodOut.getComnNdx500() - 1) + PDS_END_TAG_300_LENGTH));
//  STRING 800-INDENT (1 : 800-ILVL ) 300-PDS-STR-TAG 500-COMN-TAG-VALUE ( 500-COMN-NDX ) (1 : 500-COMN-TAG-LEN ( 500-COMN-NDX )) 300-PDS-END-TAG DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(methodIn.getIndent800(),0,methodOut.getIlvl800()));
                 charArray.add(methodIn.getPdsStrTag300().toCharArray());
                 charArray.add(substring(methodIn.getComnTagValue500(methodOut.getComnNdx500() - 1),0,methodIn.getComnTagLen500(methodOut.getComnNdx500() - 1)));
                 charArray.add(methodIn.getPdsEndTag300());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3));
              updated = updateString(methodOut.getSys101OutRec().toCharArray() ,joinCharArray);
              methodOut.getSys101OutRec().setString(  (char[])updated.get("string"));
//  PERFORM 2200-WRITE-SYS101
              writeSys101(programCtx.getWriteSys101InCtx());/*2200-WRITE-SYS101*/
//  SET 500-COMN-NDX UP BY 1
              methodOut.setComnNdx500(methodOut.getComnNdx500() + 1); 
              
          }
      
      return methodOut;
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
      @Override
      public ProcessComnSubfldOutCtx processComnSubfld(ProcessComnSubfldInCtx methodIn) throws Exception {
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
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
ProcessComnSubfldOutCtx methodOut = methodIn.getProcessComnSubfldOutCtx();
//  SET 800-ILVL-3 TO TRUE
          methodOut.setIlvl3800True(); 
          
          methodOut.setSys101Rdw800((long)Math.abs(methodOut.getIlvl800() + SUBFLD_TAG_STR_300_LENGTH + methodIn.getComnTagLen500(methodOut.getComnNdx500() - 1) + SUBFLD_TAG_END_300_LENGTH));
//  IF 500-COMN-TAG-LEN ( 500-COMN-NDX ) > 0
          if (	( methodIn.getComnTagLen500(methodOut.getComnNdx500() - 1) > 0 )) { 
//  STRING 800-INDENT (1 : 800-ILVL ) 300-SUBFLD-TAG-STR 500-COMN-TAG-VALUE ( 500-COMN-NDX ) (1 : 500-COMN-TAG-LEN ( 500-COMN-NDX )) 300-SUBFLD-TAG-END DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(methodIn.getIndent800(),0,methodOut.getIlvl800()));
                 charArray.add(methodIn.getSubfldTagStr300());
                 charArray.add(substring(methodIn.getComnTagValue500(methodOut.getComnNdx500() - 1),0,methodIn.getComnTagLen500(methodOut.getComnNdx500() - 1)));
                 charArray.add(methodIn.getSubfldTagEnd300());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3));
              updated = updateString(methodOut.getSys101OutRec().toCharArray() ,joinCharArray);
              methodOut.getSys101OutRec().setString(  (char[])updated.get("string"));
          }
//  ELSE
          else { 
//  STRING 800-INDENT (1 : 800-ILVL ) 300-SUBFLD-TAG-STR 300-SUBFLD-TAG-END DELIMITED BY SIZE INTO SYS101-OUT-REC
              charArray = new ArrayList<char[]>();
                 charArray.add(substring(methodIn.getIndent800(),0,methodOut.getIlvl800()));
                 charArray.add(methodIn.getSubfldTagStr300());
                 charArray.add(methodIn.getSubfldTagEnd300());
              joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2));
              updated = updateString(methodOut.getSys101OutRec().toCharArray() ,joinCharArray);
              methodOut.getSys101OutRec().setString(  (char[])updated.get("string"));
          }
//  PERFORM 2200-WRITE-SYS101
          writeSys101(programCtx.getWriteSys101InCtx());/*2200-WRITE-SYS101*/
//  SET 500-COMN-NDX UP BY 1
          methodOut.setComnNdx500(methodOut.getComnNdx500() + 1); 
          
      
      return methodOut;
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
      @Override
      public WriteComnPsipmOutCtx writeComnPsipm(WriteComnPsipmInCtx methodIn) throws Exception {
      
// ******************************************************************
// * Write pseudo ipm message
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
WriteComnPsipmOutCtx methodOut = methodIn.getWriteComnPsipmOutCtx();
//  SET IP66601-USER-T TO 1
          methodOut.setIp66601UserT(1); 
          
//  MOVE 1 TO IP66601-USER-TCNT 800-FLD-STRT
          methodOut.setIp66601UserTcnt((short)1);
          methodOut.setFldStrt800((long)1);

// *    Write element tags to user tag table
//  PERFORM VARYING 500-COMN-NDX FROM 1 BY 1 UNTIL 500-COMN-NDX > 500-COMN-TBL-ITEMS
          for (methodOut.setComnNdx500(1); (	( methodOut.getComnNdx500() <= methodIn.getComnTblItems500() )) ; methodOut.setComnNdx500(methodOut.getComnNdx500() + 1) ) {
//  SET IP66601-USER-T TO 500-COMN-NDX
              methodOut.setIp66601UserT(methodOut.getComnNdx500()); 
              
//  EVALUATE 500-COMN-TAG-TYPE ( 500-COMN-NDX )
              switch(new String(methodIn.getComnTagType500(methodOut.getComnNdx500() - 1))){
              	case "M":
//  SET IP66601-USER-MTI-TAG ( IP66601-USER-T ) TO TRUE
                  methodOut.setIp66601UserMtiTagTrue(methodOut.getIp66601UserT() - 1); 
                  
              break;
              	case "D":
//  SET IP66601-USER-DE-TAG ( IP66601-USER-T ) TO TRUE
                  methodOut.setIp66601UserDeTagTrue(methodOut.getIp66601UserT() - 1); 
                  
              break;
              	case "P":
//  SET IP66601-USER-PDS-TAG ( IP66601-USER-T ) TO TRUE
                  methodOut.setIp66601UserPdsTagTrue(methodOut.getIp66601UserT() - 1); 
                  
              break;
              }
//  MOVE 500-COMN-TAG-NUM ( 500-COMN-NDX ) TO IP66601-USER-TAG-NO ( IP66601-USER-T )
              methodOut.setIp66601UserTagNo(methodOut.getIp66601UserT() - 1,(short) methodOut.getComnTagNum500(methodOut.getComnNdx500() - 1));
//  MOVE 500-COMN-TAG-OCCUR ( 500-COMN-NDX ) TO IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-T )
              methodOut.setIp66601UserTagOccurrence(methodOut.getIp66601UserT() - 1,(short) methodOut.getComnTagOccur500(methodOut.getComnNdx500() - 1));
//  MOVE 500-COMN-TAG-SUBFLD-NO ( 500-COMN-NDX ) TO IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-T )
              methodOut.setIp66601UserTagSubfldNo(methodOut.getIp66601UserT() - 1,(short) methodOut.getComnTagSubfldNo500(methodOut.getComnNdx500() - 1));
//  MOVE 800-FLD-STRT TO IP66601-USER-TAG-START ( IP66601-USER-T )
              methodOut.setIp66601UserTagStart(methodOut.getIp66601UserT() - 1,(short) methodOut.getFldStrt800());
//  MOVE 500-COMN-TAG-LEN ( 500-COMN-NDX ) TO IP66601-USER-TAG-LNGTH ( IP66601-USER-T )
              methodOut.setIp66601UserTagLngth(methodOut.getIp66601UserT() - 1,(short) methodOut.getComnTagLen500(methodOut.getComnNdx500() - 1));

// *    Write element content to message string
//  IF 500-COMN-TAG-LEN ( 500-COMN-NDX ) > 0
              if (	( methodOut.getComnTagLen500(methodOut.getComnNdx500() - 1) > 0 )) { 
//  MOVE 500-COMN-TAG-VALUE ( 500-COMN-NDX ) (1 : 500-COMN-TAG-LEN ( 500-COMN-NDX )) TO IP66102-NORMAL-IPM-MSG ( 800-FLD-STRT : IP66601-USER-TAG-LNGTH ( IP66601-USER-T ))
                  methodOut.setIp66102NormalIpmMsg(replace(methodOut.getIp66102NormalIpmMsg().toCharArray(),substring(methodOut.getComnTagValue500(methodOut.getComnNdx500() - 1),0,methodOut.getComnTagLen500(methodOut.getComnNdx500() - 1)),((int) methodOut.getFldStrt800()-1), (methodOut.getIp66601UserTagLngth(methodOut.getIp66601UserT() - 1) + ((int) methodOut.getFldStrt800() - 1)) ));
              }
//  ADD IP66601-USER-TAG-LNGTH ( IP66601-USER-T ) TO 800-FLD-STRT
              methodOut.setFldStrt800(methodOut.getFldStrt800()+(short) methodOut.getIp66601UserTagLngth(methodOut.getIp66601UserT() - 1));
          }

// *    Set ip66601-user-t     down by 1
//  SET IP66601-USER-TCNT TO IP66601-USER-T
          methodOut.setIp66601UserTcnt((short) (short) methodOut.getIp66601UserT()); 
          
          methodOut.setSys201Rdw800((long) (Math.abs(5 + methodOut.getFldStrt800() - 1 +  ( 24 * methodOut.getIp66601UserTcnt() ) )));
          methodOut.setTagTblPtr800((long) (Math.abs(5 + methodOut.getFldStrt800())));

// *    Write tag table pointer to sys201 record

// *    Write message string to sys201 record
//  MOVE 800-TAG-TBL-PTR TO SYS201-OUT-REC (1 : 5)
          methodOut.getSys201OutRec().replace(String.valueOf(methodOut.getTagTblPtr800String()).toCharArray(),0,String.valueOf(methodOut.getTagTblPtr800String()).length(),0,5 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE IP66102-NORMAL-IPM-MSG (1 : 800-FLD-STRT ) TO SYS201-OUT-REC (6 : 800-FLD-STRT )
          methodOut.getSys201OutRec().replace(methodOut.getIp66102IpmMsg()/*parent*/,0/*fromOffset - (sys201OutRec) */,(int) methodOut.getFldStrt800()/*fromLen*/,0+6 - 1/*toOffset - (ip66102NormalIpmMsg) */,(int) methodOut.getFldStrt800()/*toLen*/);
          // MOVE 800-TAG-TBL-PTR TO 800-FLD-STRT
          methodOut.setFldStrt800(methodOut.getTagTblPtr800());

// *    Write tag table to sys201 record
//  PERFORM VARYING IP66601-USER-T FROM 1 BY 1 UNTIL IP66601-USER-T > IP66601-USER-TCNT
          for (methodOut.setIp66601UserT(1); (	( methodOut.getIp66601UserT() <= methodOut.getIp66601UserTcnt() ) ) ; methodOut.setIp66601UserT(methodOut.getIp66601UserT() + 1) ) {
//  MOVE IP66601-USER-TAG-TYPE ( IP66601-USER-T ) TO 800-TAG-TYPE
              methodOut.setTagType800(methodOut.getIp66601UserTagType(methodOut.getIp66601UserT() - 1));
//  MOVE IP66601-USER-TAG-NO ( IP66601-USER-T ) TO 800-TAG-NUM
              methodOut.setTagNum800(methodOut.getIp66601UserTagNo(methodOut.getIp66601UserT() - 1));
//  MOVE IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-T ) TO 800-TAG-OCCUR
              methodOut.setTagOccur800(methodOut.getIp66601UserTagOccurrence(methodOut.getIp66601UserT() - 1));
//  MOVE IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-T ) TO 800-TAG-SUBFLD-NO
              methodOut.setTagSubfldNo800(methodOut.getIp66601UserTagSubfldNo(methodOut.getIp66601UserT() - 1));
//  MOVE IP66601-USER-TAG-START ( IP66601-USER-T ) TO 800-TAG-START
              methodOut.setTagStart800(methodOut.getIp66601UserTagStart(methodOut.getIp66601UserT() - 1));
//  MOVE IP66601-USER-TAG-LNGTH ( IP66601-USER-T ) TO 800-TAG-LNGTH
              methodOut.setTagLngth800(methodOut.getIp66601UserTagLngth(methodOut.getIp66601UserT() - 1));
//  MOVE 800-TAG (1 : 24) TO SYS201-OUT-REC ( 800-FLD-STRT : 24)
              methodOut.getSys201OutRec().replace(methodIn.getWorkAreas800()/*parent*/,0/*fromOffset - (sys201OutRec) */,24/*fromLen*/,0+(int) methodOut.getFldStrt800() - 1/*toOffset - (tag800) */,24/*toLen*/);
//  ADD 24 TO 800-FLD-STRT
              methodOut.setFldStrt800(methodOut.getFldStrt800()+(long)24);
          }
//  PERFORM 3110-WRITE-SYS201
          writeSys201(programCtx.getWriteSys201InCtx());/*3110-WRITE-SYS201*/
          ;
      
      return methodOut;
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
      @Override
      public WriteComnIpmOutCtx writeComnIpm(WriteComnIpmInCtx methodIn) throws Exception {
      
// ******************************************************************
// * Write ipm message
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
WriteComnIpmOutCtx methodOut = methodIn.getWriteComnIpmOutCtx();
//  CALL 800-PTR-IP666010
          // CALL 800-PTR-IP666010
          	programCtx.setRc( ip666010.process(programCtx.getGlobalCtx().getContext("IP666010")));
      
      return methodOut;
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
      @Override
      public CallDateRoutineOutCtx callDateRoutine(CallDateRoutineInCtx methodIn) throws Exception {
      
// ******************************************************************
// * Call date conversion routine
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
CallDateRoutineOutCtx methodOut = methodIn.getCallDateRoutineOutCtx();
//  CALL 800-PTR-IP670010
          // CALL 800-PTR-IP670010
          	programCtx.setRc( ip670010.process(programCtx.getGlobalCtx().getContext("IP670010")));
//  IF RETURN-CODE IS ZERO
//  ELSE
          if (        ( programCtx.getRc() != 0 )) { 
//  MOVE RETURN-CODE TO 600-3014-RTN-CD
              methodOut.setRtnCd6003014(CFUtil.pad(4,String.valueOf(programCtx.getRc()),"0",CFUtil.LEFT_PAD));
//  MOVE 300-3014-ABEND-CODE TO 900-ABEND-CODE
              methodOut.setAbendCode900(String.valueOf(methodOut.getAbendCode3003014String()).toCharArray());
              // MOVE 600-3014-ERROR-MSG TO 900-ABEND-TEXT
              methodOut.setAbendText900(methodOut.getErrorMsg6003014().toCharArray());
//  MOVE 300-PARA-8800 TO 900-ABEND-PARA
              methodOut.setAbendPara900(methodOut.getPara8800300());
          }
      
      return methodOut;
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
      @Override
      public AbendProgramOutCtx abendProgram(AbendProgramInCtx methodIn) throws Exception {
      
// ******************************************************************
// * Abend routine
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
AbendProgramOutCtx methodOut = methodIn.getAbendProgramOutCtx();
//  DISPLAY '***********************************'
          logger.info("***********************************"); 
//  DISPLAY 'A B E N D   A B E N D   A B E N D  '
          logger.info("A B E N D   A B E N D   A B E N D  "); 
//  DISPLAY 'A B E N D   I P 9 8 9 0 1 0        '
          logger.info("A B E N D   I P 9 8 9 0 1 0        "); 
//  DISPLAY '***********************************'
          logger.info("***********************************"); 
//  DISPLAY 900-ABEND-PARA-NAME
          logger.info(methodIn.getAbendParaName900().toString()); 
//  DISPLAY 900-ABEND-MESSAGE
          logger.info(methodIn.getAbendMessage900().toString()); 
//  SET 800-PTR-ABEND TO ENTRY 300-PGM-IP610010
          methodOut.setPtrAbend800(methodIn.getPgmIp610010300()); 
          
//  CALL 800-PTR-ABEND
          // CALL 800-PTR-ABEND
          	programCtx.setRc( ip610010.process(programCtx.getGlobalCtx().getContext("IP610010")));
      
      return methodOut;
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
      @Override
      public void dumpMsgString(DumpMsgStringInCtx methodIn) throws Exception {
      
// ******************************************************************
// * Dump message string
// ******************************************************************
Ip989010Ctx programCtx = methodIn.getIp989010Ctx();
//  DISPLAY 'MESSAGE STRING:' IP66102-NORMAL-IPM-MSG (1 : IP66102-IPM-MSG-LNGTH )
          logger.info("MESSAGE STRING:{}", new String(substring(methodIn.getIp66102NormalIpmMsg().toCharArray(),0,(int) methodIn.getIp66102IpmMsgLngth()))); 
      
      }
  
  
  
      public int call(ProgramContext ctx, Object[] params) throws Exception {
      Ip989010Ctx programCtx = (Ip989010Ctx) ctx;
      
      int len = params.length;
         if (len > 0 && params[0] != null )
            programCtx.getParms1000().set((Field)params[0]);
         // invoke the process and return rc
         return process(programCtx);
         
      }
      
      public int call(ProgramContext ctx, Field... parameters) throws Exception {
      Ip989010Ctx programCtx = (Ip989010Ctx) ctx;
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
      
      
  
  
  
  
  
  }
