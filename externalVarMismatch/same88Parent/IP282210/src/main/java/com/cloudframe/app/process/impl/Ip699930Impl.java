  package com.cloudframe.app.process.impl;
  /* 
* element ip699930 as of 06/03/21 10:27:27                    [vc]
*----------------------------------------------------------------*
*          -- -- -- c o n f i d e n t i a l -- -- --             *
*    this item  contains information and procedures which are    *
*    proprietary to mastercard international, incorporated,      *
*    and which are confidential.  it is provided with the        *
*    express understanding that it is to be used only for the    *
*    benefit of interbank card association, and is not to be     *
*    used, copied, or disclosed for any other purpose.  any      *
*    authorized reproduction (in whole or in part) of this       *
*    material must be marked with this legend.                   *
*----------------------------------------------------------------*
*author.        wipro.                                           *
*date-written.  august 2012.                                     *
*date-compiled. august 2012.                                     *
*security.      property of mastercard international, inc.       *
*----------------------------------------------------------------*
*program functionality:                                          *
*----------------------------------------------------------------*
*the purpose of this program is to return system application     *
*specific information for a requested processing agreement and   *
*system application id.                                          *
*                                                                *
*starting with the russia on soil project, countries may require *
*clearing transactions to be processed on soil                   *
*                                                                *
*countries that choose to do this will enter into a local        *
*processing agreement with mastercard.  each country's           *
*processing agreement will be designated by an eight-character id*
*calling programs must pass this eight-character id to this      *
*program.                                                        *
*                                                                *
*each clearing application has a three character system          *
*application id.programs must pass this three-character id to    *
*this program.                                                   *
*                                                                *
*in return, this program will return application-specific        *
*information for the required requested processing agreement     *
*and system application to the calling program                   *
*----------------------------------------------------------------*
*revision history:                                               *
*----------------------------------------------------------------*
*    project         :gcms 13.q3 - #c20243                       *
*                     russia on-soil solution                    *
*    date            :2013/07/19                                 *
*    programmer      :wipro                                      *
*    modification    :initial version                            *
*----------------------------------------------------------------*
*    project         :gcms 15.q2 - #c76142                       *
*                     russia on-soil solution - nspk             *
*    date            :2015/02/17                                 *
*    programmer      :wipro                                      *
*    modification    :modified to handle regional processing     *
*----------------------------------------------------------------*
*    project         :gcms release 17.q1 - c81979                *
*                     china on-soil clearing cycles less than 7  *
*    date            :2017/01/20                                 *
*    programmer      :wipro                                      *
*    modification    :removed para 4500-check-for-regional       *
*----------------------------------------------------------------*
*    project         :gcms release 18.q4 - i8682                 *
*                     indonesia on soil                          *
*    date            :2018/10/12                                 *
*    programmer      :wipro                                      *
*    modification    :updated the code to move db-id from        *
*                     ip020105 to ip020104.                      *
*----------------------------------------------------------------*
*/
  
  import com.cloudframe.app.ip699930.Ip699930Ctx.*;
  import com.cloudframe.app.ip699930.Ip699930Ctx;
  import com.cloudframe.app.process.Ip699930;
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
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.process.*;
  import com.cloudframe.app.process.Ip282210;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.ip699930.dto.*;
  import com.cloudframe.app.ip699930.dto.Ip28221PaTableRestart;
  import com.cloudframe.app.ip699930.dto.SystemApplNotFoundMsg600;
  import com.cloudframe.app.ip699930.dto.ProcessAgrmntNotFndMsg600;
  import com.cloudframe.app.global.sharedvar.Ip02015PrcssAgrmtTable;
  import com.cloudframe.app.global.sharedvar.Ip02014PrcssAgrmtTable;
  import com.cloudframe.app.global.sharedvar.Ip69931Linkage;
  import com.cloudframe.app.global.sharedvar.Ip996011ProgramStartMessage;
  import com.cloudframe.app.ip699930.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("ip699930")
  
  public class Ip699930Impl extends CommonProcess implements Ip699930 {
  
  Logger logger = LoggerFactory.getLogger(Ip699930Impl.class);
  
  
  
  
  
  
  
  
  
  
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      public int process(Ip699930Ctx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
          ;
//  PERFORM 0000-DO-MAINLINE
          doMainline(programCtx);/*0000-DO-MAINLINE*/
          if (programCtx.isProgramEnded()) {
              return programCtx.getRc();
          }
       } catch(Exception e) {
            handleErrorCode(e);
            throw e;
       }
      
       return programCtx.getRc(); // Exit with return code
      // end of process method
      }
      /**
      * doMainline 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-DO-MAINLINE COBOL Cyclomatic complexity - 2
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void doMainline(Ip699930Ctx programCtx) throws Exception {
      
// *----------------------------------------------------------------*
// *The main paragraph perform the initialization ,to get processing*
// *agreements from the one day file, to see where processing       *
// *agreement is processed , to get the desired processing agreement*
// *and to get the desired system application.                      *
// *----------------------------------------------------------------*
//  PERFORM 1000-PROCESS-INITIALIZATION
          processInitialization(programCtx);/*1000-PROCESS-INITIALIZATION*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  PERFORM 2000-GET-PAS-FROM-ONE-DAY-FILE
          getPasFromOneDayFile(programCtx.getGetPasFromOneDayFileInCtx());/*2000-GET-PAS-FROM-ONE-DAY-FILE*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  PERFORM 3000-GET-WHERE-PA-IS-PROCESSED
          getWherePaIsProcessed(programCtx.getGetWherePaIsProcessedInCtx());/*3000-GET-WHERE-PA-IS-PROCESSED*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  PERFORM 4000-GET-DESIRED-PRCSSNG-AGRMT
          getDesiredPrcssngAgrmt(programCtx.getGetDesiredPrcssngAgrmtInCtx());/*4000-GET-DESIRED-PRCSSNG-AGRMT*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  PERFORM 5000-GET-DESIRED-SYSTEM-APPL
          getDesiredSystemAppl(programCtx.getGetDesiredSystemApplInCtx());/*5000-GET-DESIRED-SYSTEM-APPL*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return ;
      
      }
      /**
      * processInitialization 
      *   This method is derived from 
  *   COBOL Paragraph - 1000-PROCESS-INITIALIZATION COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void processInitialization(Ip699930Ctx programCtx) throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph sets the procedure pointer,displays the execution*
// *messages,initialize fields and edit incoming values.            *
// *----------------------------------------------------------------*
//  PERFORM 1100-SET-PROCEDURE-POINTERS
          setProcedurePointers(programCtx.getSetProcedurePointersInCtx());/*1100-SET-PROCEDURE-POINTERS*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  PERFORM 1200-DISPLAY-EXECUTION-MESSAGE
          displayExecutionMessage(programCtx.getDisplayExecutionMessageInCtx());/*1200-DISPLAY-EXECUTION-MESSAGE*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  PERFORM 1300-INITIALIZE-FIELDS
          initializeFields(programCtx);/*1300-INITIALIZE-FIELDS*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  PERFORM 1400-EDIT-INCOMING-VALUES
          editIncomingValues(programCtx.getEditIncomingValuesInCtx());/*1400-EDIT-INCOMING-VALUES*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
          ;
      
      }
      /**
      * setProcedurePointers 
      *   This method is derived from 
  *   COBOL Paragraph - 1100-SET-PROCEDURE-POINTERS COBOL Cyclomatic complexity - 3
      * Input  :  

      * - pgmIp282210300                 COBOL Name: 300-PGM-IP282210
      * - pgmIp996010300                 COBOL Name: 300-PGM-IP996010
      *
      * Output :  

      * - ptrIp282210800                 COBOL Name: 800-PTR-IP282210
      * - ptrIp996010800                 COBOL Name: 800-PTR-IP996010
      *
      * @throws CFException
      */
      @Override
      public SetProcedurePointersOutCtx setProcedurePointers(SetProcedurePointersInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph sets the procedure pointer.                      *
// *----------------------------------------------------------------*
Ip699930Ctx programCtx = methodIn.getIp699930Ctx();
SetProcedurePointersOutCtx methodOut = methodIn.getSetProcedurePointersOutCtx();
//  SET 800-PTR-IP282210 TO ENTRY 300-PGM-IP282210
          methodOut.setPtrIp282210800(methodIn.getPgmIp282210300()); 
          
//  SET 800-PTR-IP996010 TO ENTRY 300-PGM-IP996010
          methodOut.setPtrIp996010800(methodIn.getPgmIp996010300()); 
          
      
      return methodOut;
      }
      /**
      * displayExecutionMessage 
      *   This method is derived from 
  *   COBOL Paragraph - 1200-DISPLAY-EXECUTION-MESSAGE COBOL Cyclomatic complexity - 1
      * Input  :  

      * - pgmIp699930300                 COBOL Name: 300-PGM-IP699930
      * - pgmVersion300                  COBOL Name: 300-PGM-VERSION
      *
      * Output :  

      * - ip996011PgmId                  COBOL Name: IP996011-PGM-ID
      * - pgmIp699930300                 COBOL Name: 300-PGM-IP699930
      * - ip996011PgmVersion             COBOL Name: IP996011-PGM-VERSION
      * - pgmVersion300                  COBOL Name: 300-PGM-VERSION
      * - ip996011WhenCompiled           COBOL Name: IP996011-WHEN-COMPILED
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public DisplayExecutionMessageOutCtx displayExecutionMessage(DisplayExecutionMessageInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph displays the execution message.                  *
// *----------------------------------------------------------------*
Ip699930Ctx programCtx = methodIn.getIp699930Ctx();
DisplayExecutionMessageOutCtx methodOut = methodIn.getDisplayExecutionMessageOutCtx();
//  MOVE 300-PGM-IP699930 TO IP996011-PGM-ID
          methodOut.setIp996011PgmId(methodOut.getPgmIp699930300());
//  MOVE 300-PGM-VERSION TO IP996011-PGM-VERSION
          methodOut.setIp996011PgmVersion(methodOut.getPgmVersion300());
          // MOVE WHEN-COMPILED TO IP996011-WHEN-COMPILED
          //  FORMAT1311677340 = "X(08)BX(08)"
          methodOut.setIp996011WhenCompiled(CFUtil.cobolAnEditFormatter(CONSTANTS.FORMAT1311677340,CONSTANTS.LITERAL_658858103));
//  CALL 800-PTR-IP996010
          // CALL 800-PTR-IP996010
          	programCtx.setRc( ip996010.process(programCtx.getGlobalCtx().getContext("IP996010")));
      
      return methodOut;
      }
      /**
      * initializeFields 
      *   This method is derived from 
  *   COBOL Paragraph - 1300-INITIALIZE-FIELDS COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output :  

      * - ip69931ResponseStatus          COBOL Name: IP69931-RESPONSE-STATUS
      * - ip69931WherePaProcessedSw      COBOL Name: IP69931-WHERE-PA-PROCESSED-SW
      * - ip69931DatabaseId              COBOL Name: IP69931-DATABASE-ID
      * - ip69931CollectionId            COBOL Name: IP69931-COLLECTION-ID
      * - ip69931ErrorMsg                COBOL Name: IP69931-ERROR-MSG
      *
      * @throws CFException
      */
      @Override
      public InitializeFieldsOutCtx initializeFields(Ip699930Ctx programCtx) throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph initialize fields.                               *
// *----------------------------------------------------------------*
InitializeFieldsOutCtx methodOut = programCtx.getInitializeFieldsOutCtx();
//  SET 88-IP69931-REQUEST-SUCCESSFUL 88-IP69931-PA-PROCESS-UNKNOWN TO TRUE
          methodOut.setIp69931RequestSuccessful88True(); 
          
          methodOut.setIp69931PaProcessUnknown88True(); 
          
//  MOVE SPACES TO IP69931-DATABASE-ID IP69931-COLLECTION-ID IP69931-ERROR-MSG
          methodOut.setIp69931DatabaseId(CONSTANTS.SPACE_18);
          methodOut.setIp69931CollectionId(CONSTANTS.SPACE_18);
          methodOut.setIp69931ErrorMsg(CONSTANTS.SPACE_80);
      
      return methodOut;
      }
      /**
      * editIncomingValues 
      *   This method is derived from 
  *   COBOL Paragraph - 1400-EDIT-INCOMING-VALUES COBOL Cyclomatic complexity - 5
      * Input  :  

      * - ip69931ProcessingAgreement     COBOL Name: IP69931-PROCESSING-AGREEMENT
      * - missingProcessAgrmtMsg600      COBOL Name: 600-MISSING-PROCESS-AGRMT-MSG
      * - ip69931ApplicationSystemId     COBOL Name: IP69931-APPLICATION-SYSTEM-ID
      * - missingApplSystemIdMsg600      COBOL Name: 600-MISSING-APPL-SYSTEM-ID-MSG
      *
      * Output :  

      * - ip69931ResponseStatus          COBOL Name: IP69931-RESPONSE-STATUS
      * - ip69931ErrorMsg                COBOL Name: IP69931-ERROR-MSG
      * - missingProcessAgrmtMsg600      COBOL Name: 600-MISSING-PROCESS-AGRMT-MSG
      * - missingApplSystemIdMsg600      COBOL Name: 600-MISSING-APPL-SYSTEM-ID-MSG
      *
      * @throws CFException
      */
      @Override
      public EditIncomingValuesOutCtx editIncomingValues(EditIncomingValuesInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph edits the incoming values.                       *
// *----------------------------------------------------------------*
Ip699930Ctx programCtx = methodIn.getIp699930Ctx();
EditIncomingValuesOutCtx methodOut = methodIn.getEditIncomingValuesOutCtx();
//  IF IP69931-PROCESSING-AGREEMENT <= SPACES
          if (                   ( isLessOrEqualSpaces(methodIn.getIp69931ProcessingAgreement()) )) { 
//  SET 88-IP69931-REQUEST-FAILED TO TRUE
              methodOut.setIp69931RequestFailed88True(); 
              
//  MOVE 600-MISSING-PROCESS-AGRMT-MSG TO IP69931-ERROR-MSG
              methodOut.setIp69931ErrorMsg(pad(80,methodOut.getMissingProcessAgrmtMsg600(),SPACE_CHAR,RIGHT_PAD));
//  GOBACK
              setNotLogged(false); // no need to log, it is a normal termination
              programCtx.setProgramEnded(true);
              return methodOut;
          }
//  IF IP69931-APPLICATION-SYSTEM-ID <= SPACES
          if (                   ( isLessOrEqualSpaces(methodIn.getIp69931ApplicationSystemId()) )) { 
//  SET 88-IP69931-REQUEST-FAILED TO TRUE
              methodOut.setIp69931RequestFailed88True(); 
              
//  MOVE 600-MISSING-APPL-SYSTEM-ID-MSG TO IP69931-ERROR-MSG
              methodOut.setIp69931ErrorMsg(pad(80,methodOut.getMissingApplSystemIdMsg600(),SPACE_CHAR,RIGHT_PAD));
//  GOBACK
              setNotLogged(false); // no need to log, it is a normal termination
              programCtx.setProgramEnded(true);
              return methodOut;
          }
      
      return methodOut;
      }
      /**
      * getPasFromOneDayFile 
      *   This method is derived from 
  *   COBOL Paragraph - 2000-GET-PAS-FROM-ONE-DAY-FILE COBOL Cyclomatic complexity - 3
      * Input  :  

      * - ip02015PasFoundCount           COBOL Name: IP02015-PAS-FOUND-COUNT
      * - noProcessingAgrmntsMsg600      COBOL Name: 600-NO-PROCESSING-AGRMNTS-MSG
      *
      * Output :  

      * - ip28221Restart                 COBOL Name: IP28221-RESTART
      * - rc                             COBOL Name: RETURN-CODE
      * - ip69931ResponseStatus          COBOL Name: IP69931-RESPONSE-STATUS
      * - ip69931ErrorMsg                COBOL Name: IP69931-ERROR-MSG
      * - noProcessingAgrmntsMsg600      COBOL Name: 600-NO-PROCESSING-AGRMNTS-MSG
      *
      * @throws CFException
      */
      @Override
      public GetPasFromOneDayFileOutCtx getPasFromOneDayFile(GetPasFromOneDayFileInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph get the processing agreements from the one day   *
// *file.                                                           *
// *----------------------------------------------------------------*
Ip699930Ctx programCtx = methodIn.getIp699930Ctx();
GetPasFromOneDayFileOutCtx methodOut = methodIn.getGetPasFromOneDayFileOutCtx();
//  SET 88-IP28221-IP282210-NO-RESTRT TO TRUE
          methodOut.setIp28221Ip282210NoRestrt88True(); 
          
//  CALL 800-PTR-IP282210 USING IP28221-PA-TABLE-RESTART
          // CALL 800-PTR-IP282210 USING IP28221-PA-TABLE-RESTART
               programCtx.setRc( ip282210.call(programCtx.getGlobalCtx().getContext("IP282210"),methodOut.getIp28221PaTableRestart()));
//  IF IP02015-PAS-FOUND-COUNT <= 0
          if (	( methodIn.getIp02015PasFoundCount() <= 0 )) { 
//  SET 88-IP69931-REQUEST-FAILED TO TRUE
              methodOut.setIp69931RequestFailed88True(); 
              
//  MOVE 600-NO-PROCESSING-AGRMNTS-MSG TO IP69931-ERROR-MSG
              methodOut.setIp69931ErrorMsg(pad(80,methodOut.getNoProcessingAgrmntsMsg600(),SPACE_CHAR,RIGHT_PAD));
//  GOBACK
              setNotLogged(false); // no need to log, it is a normal termination
              programCtx.setProgramEnded(true);
              return methodOut;
          }
      
      return methodOut;
      }
      /**
      * getWherePaIsProcessed 
      *   This method is derived from 
  *   COBOL Paragraph - 3000-GET-WHERE-PA-IS-PROCESSED COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ip69931ProcessingAgreement     COBOL Name: IP69931-PROCESSING-AGREEMENT
      * - ip02015HostPrcssAgrmtId        COBOL Name: IP02015-HOST-PRCSS-AGRMT-ID
      *
      * Output :  

      * - ip69931WherePaProcessedSw      COBOL Name: IP69931-WHERE-PA-PROCESSED-SW
      *
      * @throws CFException
      */
      @Override
      public GetWherePaIsProcessedOutCtx getWherePaIsProcessed(GetWherePaIsProcessedInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph checks where the processing agreement is         *
// *processed.                                                      *
// *----------------------------------------------------------------*
Ip699930Ctx programCtx = methodIn.getIp699930Ctx();
GetWherePaIsProcessedOutCtx methodOut = methodIn.getGetWherePaIsProcessedOutCtx();
//  IF IP69931-PROCESSING-AGREEMENT = IP02015-HOST-PRCSS-AGRMT-ID
          if (		compareChars(methodIn.getIp69931ProcessingAgreement(),methodIn.getIp02015HostPrcssAgrmtId()) == 0 ) { 
//  SET 88-IP69931-PA-PROCESS-LOCALLY TO TRUE
              methodOut.setIp69931PaProcessLocally88True(); 
              
          }
//  ELSE
          else { 
//  SET 88-IP69931-PA-PROCES-REMOTELY TO TRUE
              methodOut.setIp69931PaProcesRemotely88True(); 
              
          }
      
      return methodOut;
      }
      /**
      * getDesiredPrcssngAgrmt 
      *   This method is derived from 
  *   COBOL Paragraph - 4000-GET-DESIRED-PRCSSNG-AGRMT COBOL Cyclomatic complexity - 6
      * Input  :  

      * - value1300                      COBOL Name: 300-VALUE-1
      * - ip02015PrcssAgrmtId            COBOL Name: IP02015-PRCSS-AGRMT-ID
      * - ip69931ProcessingAgreement     COBOL Name: IP69931-PROCESSING-AGREEMENT
      * - ip02015DbId                    COBOL Name: IP02015-DB-ID
      * - ip02015ClrPrcssCd              COBOL Name: IP02015-CLR-PRCSS-CD
      * - ip02015PasFoundCount           COBOL Name: IP02015-PAS-FOUND-COUNT
      * - processAgrmntNotFndMsg600      COBOL Name: 600-PROCESS-AGRMNT-NOT-FND-MSG
      *
      * Output :  

      * - ip02015PaIndex                 COBOL Name: IP02015-PA-INDEX
      * - startOfLoopSw100               COBOL Name: 100-START-OF-LOOP-SW
      * - processAgreementFoundSw100     COBOL Name: 100-PROCESS-AGREEMENT-FOUND-SW
      * - ip02014PrcssAgrmtId            COBOL Name: IP02014-PRCSS-AGRMT-ID
      * - ip02015PrcssAgrmtId            COBOL Name: IP02015-PRCSS-AGRMT-ID
      * - ip02014DbId                    COBOL Name: IP02014-DB-ID
      * - ip02015DbId                    COBOL Name: IP02015-DB-ID
      * - ip02014ClrPrcssCd              COBOL Name: IP02014-CLR-PRCSS-CD
      * - ip02015ClrPrcssCd              COBOL Name: IP02015-CLR-PRCSS-CD
      * - ip69931ResponseStatus          COBOL Name: IP69931-RESPONSE-STATUS
      * - processAgrmntNotFndPa600       COBOL Name: 600-PROCESS-AGRMNT-NOT-FND-PA
      * - ip69931ProcessingAgreement     COBOL Name: IP69931-PROCESSING-AGREEMENT
      * - ip69931ErrorMsg                COBOL Name: IP69931-ERROR-MSG
      * - processAgrmntNotFndMsg600      COBOL Name: 600-PROCESS-AGRMNT-NOT-FND-MSG
      *
      * @throws CFException
      */
      @Override
      public GetDesiredPrcssngAgrmtOutCtx getDesiredPrcssngAgrmt(GetDesiredPrcssngAgrmtInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *This paragraph will search the processing agreements returned   *
// *from the one day file for the specific processing agreement we  *
// *are looking for.                                                *
// *----------------------------------------------------------------*
Ip699930Ctx programCtx = methodIn.getIp699930Ctx();
GetDesiredPrcssngAgrmtOutCtx methodOut = methodIn.getGetDesiredPrcssngAgrmtOutCtx();
//  SET IP02015-PA-INDEX TO 300-VALUE-1
          methodOut.setIp02015PaIndex(methodIn.getValue1300()); 
          
//  SET 88-100-START-LOOP 88-100-PROCESS-AGRMT-NOT-FOUND TO TRUE
          methodOut.setStartLoop88100True(); 
          
          methodOut.setProcessAgrmtNotFound88100True(); 
          
//  PERFORM UNTIL 88-100-STOP-LOOP
          while ((!(methodOut.isStopLoop88100()) )) {
//  IF IP02015-PRCSS-AGRMT-ID ( IP02015-PA-INDEX ) = IP69931-PROCESSING-AGREEMENT
              if (		compareChars(methodOut.getIp02015PrcssAgrmtId(methodOut.getIp02015PaIndex() - 1),methodOut.getIp69931ProcessingAgreement()) == 0 ) { 
//  MOVE IP02015-PRCSS-AGRMT-ID ( IP02015-PA-INDEX ) TO IP02014-PRCSS-AGRMT-ID
                  methodOut.setIp02014PrcssAgrmtId(methodOut.getIp02015PrcssAgrmtId(methodOut.getIp02015PaIndex() - 1));
//  MOVE IP02015-DB-ID ( IP02015-PA-INDEX ) TO IP02014-DB-ID
                  methodOut.setIp02014DbId(methodOut.getIp02015DbId(methodOut.getIp02015PaIndex() - 1));
//  MOVE IP02015-CLR-PRCSS-CD ( IP02015-PA-INDEX ) TO IP02014-CLR-PRCSS-CD
                  methodOut.setIp02014ClrPrcssCd(methodOut.getIp02015ClrPrcssCd(methodOut.getIp02015PaIndex() - 1));
//  SET 88-100-STOP-LOOP 88-100-PROCESS-AGRMNT-FOUND TO TRUE
                  methodOut.setStopLoop88100True(); 
                  
                  methodOut.setProcessAgrmntFound88100True(); 
                  
              }
//  ELSE
              else { 
//  SET IP02015-PA-INDEX UP BY 300-VALUE-1
                  methodOut.setIp02015PaIndex(methodOut.getIp02015PaIndex() + methodIn.getValue1300()); 
                  
//  IF IP02015-PA-INDEX > IP02015-PAS-FOUND-COUNT
                  if (	( methodOut.getIp02015PaIndex() > methodIn.getIp02015PasFoundCount() )) { 
//  SET 88-100-STOP-LOOP TO TRUE
                      methodOut.setStopLoop88100True(); 
                      
                  }
              }
          }
//  IF 88-100-PROCESS-AGRMT-NOT-FOUND
          if ( methodOut.isProcessAgrmtNotFound88100()  ) { 
//  SET 88-IP69931-REQUEST-FAILED TO TRUE
              methodOut.setIp69931RequestFailed88True(); 
              
//  MOVE IP69931-PROCESSING-AGREEMENT TO 600-PROCESS-AGRMNT-NOT-FND-PA
              methodOut.setProcessAgrmntNotFndPa600(methodOut.getIp69931ProcessingAgreement());
              // MOVE 600-PROCESS-AGRMNT-NOT-FND-MSG TO IP69931-ERROR-MSG
              methodOut.setIp69931ErrorMsg(methodOut.getProcessAgrmntNotFndMsg600().toCharArray());
//  GOBACK
              setNotLogged(false); // no need to log, it is a normal termination
              programCtx.setProgramEnded(true);
              return methodOut;
          }
      
      return methodOut;
      }
      /**
      * getDesiredSystemAppl 
      *   This method is derived from 
  *   COBOL Paragraph - 5000-GET-DESIRED-SYSTEM-APPL COBOL Cyclomatic complexity - 5
      * Input  :  

      * - value1300                      COBOL Name: 300-VALUE-1
      * - ip02015ApplSysId               COBOL Name: IP02015-APPL-SYS-ID
      * - ip69931ApplicationSystemId     COBOL Name: IP69931-APPLICATION-SYSTEM-ID
      * - ip02015PaIndex                 COBOL Name: IP02015-PA-INDEX
      * - ip02015PkgSetNam               COBOL Name: IP02015-PKG-SET-NAM
      * - ip02015SrvrNam                 COBOL Name: IP02015-SRVR-NAM
      * - ip69931ProcessingAgreement     COBOL Name: IP69931-PROCESSING-AGREEMENT
      * - systemApplNotFoundMsg600       COBOL Name: 600-SYSTEM-APPL-NOT-FOUND-MSG
      *
      * Output :  

      * - startOfLoopSw100               COBOL Name: 100-START-OF-LOOP-SW
      * - systemApplFoundSw100           COBOL Name: 100-SYSTEM-APPL-FOUND-SW
      * - ip02015SysIndex                COBOL Name: IP02015-SYS-INDEX
      * - ip69931CollectionId            COBOL Name: IP69931-COLLECTION-ID
      * - ip02015PkgSetNam               COBOL Name: IP02015-PKG-SET-NAM
      * - ip69931DatabaseId              COBOL Name: IP69931-DATABASE-ID
      * - ip02015SrvrNam                 COBOL Name: IP02015-SRVR-NAM
      * - ip69931ResponseStatus          COBOL Name: IP69931-RESPONSE-STATUS
      * - noSystemApplIdsApplId600       COBOL Name: 600-NO-SYSTEM-APPL-IDS-APPL-ID
      * - ip69931ApplicationSystemId     COBOL Name: IP69931-APPLICATION-SYSTEM-ID
      * - noSystemApplIdsPa600           COBOL Name: 600-NO-SYSTEM-APPL-IDS-PA
      * - ip69931ProcessingAgreement     COBOL Name: IP69931-PROCESSING-AGREEMENT
      * - ip69931ErrorMsg                COBOL Name: IP69931-ERROR-MSG
      * - systemApplNotFoundMsg600       COBOL Name: 600-SYSTEM-APPL-NOT-FOUND-MSG
      *
      * @throws CFException
      */
      @Override
      public GetDesiredSystemApplOutCtx getDesiredSystemAppl(GetDesiredSystemApplInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *This paragaph will search through the list of system application*
// *ids for the current processing agreement for the system         *
// *application id we are looking for.                              *
// *----------------------------------------------------------------*
Ip699930Ctx programCtx = methodIn.getIp699930Ctx();
GetDesiredSystemApplOutCtx methodOut = methodIn.getGetDesiredSystemApplOutCtx();
//  SET 88-100-START-LOOP 88-100-SYSTEM-APPL-NOT-FOUND TO TRUE
          methodOut.setStartLoop88100True(); 
          
          methodOut.setSystemApplNotFound88100True(); 
          
//  SET IP02015-SYS-INDEX TO 300-VALUE-1
          methodOut.setIp02015SysIndex(methodIn.getValue1300()); 
          
//  PERFORM UNTIL 88-100-STOP-LOOP
          while ((!(methodOut.isStopLoop88100()) )) {
//  IF IP02015-APPL-SYS-ID ( IP02015-PA-INDEX , IP02015-SYS-INDEX ) = IP69931-APPLICATION-SYSTEM-ID
              if (		compareChars(methodIn.getIp02015ApplSysId(methodIn.getIp02015PaIndex() - 1,methodOut.getIp02015SysIndex() - 1),methodOut.getIp69931ApplicationSystemId()) == 0 ) { 
//  SET 88-100-STOP-LOOP 88-100-SYSTEM-APPL-FOUND TO TRUE
                  methodOut.setStopLoop88100True(); 
                  
                  methodOut.setSystemApplFound88100True(); 
                  
//  MOVE IP02015-PKG-SET-NAM ( IP02015-PA-INDEX , IP02015-SYS-INDEX ) TO IP69931-COLLECTION-ID
                  methodOut.setIp69931CollectionId(methodOut.getIp02015PkgSetNam(methodIn.getIp02015PaIndex() - 1,methodOut.getIp02015SysIndex() - 1));
//  MOVE IP02015-SRVR-NAM ( IP02015-PA-INDEX , IP02015-SYS-INDEX ) TO IP69931-DATABASE-ID
                  methodOut.setIp69931DatabaseId(methodOut.getIp02015SrvrNam(methodIn.getIp02015PaIndex() - 1,methodOut.getIp02015SysIndex() - 1));
              }
//  ELSE
              else { 
//  SET IP02015-SYS-INDEX UP BY 300-VALUE-1
                  methodOut.setIp02015SysIndex(methodOut.getIp02015SysIndex() + methodIn.getValue1300()); 
                  
//  IF IP02015-APPL-SYS-ID ( IP02015-PA-INDEX , IP02015-SYS-INDEX ) = SPACES
                  if (        ( allSpaces(methodIn.getIp02015ApplSysId(methodIn.getIp02015PaIndex() - 1,methodOut.getIp02015SysIndex() - 1))   )) { 
//  SET 88-100-STOP-LOOP TO TRUE
                      methodOut.setStopLoop88100True(); 
                      
                  }
              }
          }
//  IF 88-100-SYSTEM-APPL-NOT-FOUND
          if ( methodOut.isSystemApplNotFound88100()  ) { 
//  SET 88-IP69931-REQUEST-FAILED TO TRUE
              methodOut.setIp69931RequestFailed88True(); 
              
//  MOVE IP69931-APPLICATION-SYSTEM-ID TO 600-NO-SYSTEM-APPL-IDS-APPL-ID
              methodOut.setNoSystemApplIdsApplId600(methodOut.getIp69931ApplicationSystemId());
//  MOVE IP69931-PROCESSING-AGREEMENT TO 600-NO-SYSTEM-APPL-IDS-PA
              methodOut.setNoSystemApplIdsPa600(methodOut.getIp69931ProcessingAgreement());
              // MOVE 600-SYSTEM-APPL-NOT-FOUND-MSG TO IP69931-ERROR-MSG
              methodOut.setIp69931ErrorMsg(methodOut.getSystemApplNotFoundMsg600().toCharArray());
          }
      
      return methodOut;
      }
  
  
  
      public void setFromIp282210(Ip699930Ctx programCtx, Object[] params) {
      int len = params.length;
         if (len > 0)
         if(params[0] instanceof Field) 
   programCtx.getIp28221PaTableRestart().setString(((Field)params[0] ).toCharArray());
 else    programCtx.getIp28221PaTableRestart().setString((char[])params[0] );
      }
  
  
  
  
  
  }
