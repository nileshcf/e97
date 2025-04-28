  package com.cloudframe.app.process.impl;
  /* 
****************************************************************
*          -- -- -- c o n f i d e n t i a l -- -- --           *
*    this item contains information and procedures which are   *
*    proprietary to mastercard international, incorporated,    *
*    and which are confidential.  it is provided with the      *
*    express understanding that it is to be used only for the  *
*    benefit of interbank card association, and is not to be   *
*    used, copied, or disclosed for any other purpose.  any    *
*    authorized reproduction (in whole or in part) of this     *
*    material must be marked with this legend.                 *
****************************************************************
*author.       steve callahan.
*installation. mastercard international inc.
*date-written. october, 1998.
*=================================================================
* this program reads the next ipm record.  it returns three items
* to the caller:
*    1. an end-of-file indicator (y or n)
*    2. the length of the ipm message
*    3. the ipm message itself
*
* opening the file is done implicitly on the first call.
* closing the file is done implicitly when end-of-file is
* encountered.
*=================================================================
* revision history log
*-----------------------------------------------------------------
* project      : xxx-xxx
* date         : 1999-10-01
* version      : 001.02
* programmer   : p flor
* modification : eliminate 32k block moves. instead, use reference
*              : modification.
*              : add logic to call 'ip610010' in case of i/o error
*-----------------------------------------------------------------
* project      : ses-clearing
* date         : 2000-06-02
* version      : 001.03
* programmer   : isc - rajdatta eksambe.
* modification : added logic to reset the 'first-time' switch to
*              : 'y', once current input ipm file is finished.
*              : this modification will enhance the read-api's
*              : functionality to read multiple physical files.
*-----------------------------------------------------------------
* project      : ses-clearing
* date         : 2001-07-09
* version      : 001.03
* programmer   : steve callahan
* modification : 1. added 100-is-input-file-open switch to
*              :    eliminate redundant "program started"
*              :    messages.
*              : 2. reset ip66102-ipm-msgs-read to zero upon
*              :    opening the input file.
*              : 3. replaced old starting msgs with ip996010.
*-----------------------------------------------------------------
* project      :gcms release 3.1
* date         :2003/04/04
* modification :recompile for ip996010
*--------------------------------------------------------------*
*    project         :gcms 14.q2 - prb54902                    *
*    date            :2014/04/11                               *
*    programmer      :wipro                                    *
*    modification    :decreased ipm-message occur clause from  *
*                     23 to 1 byte.                            *
*--------------------------------------------------------------*
*/
  
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.ip661020.file.*;
  import com.cloudframe.app.ip661020.Ip661020Ctx.*;
  import com.cloudframe.app.ip661020.Ip661020Ctx;
  import com.cloudframe.app.process.Ip661020;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.global.sharedvar.Ip66102IpmMsg;
  import com.cloudframe.app.ip661020.dto.*;
  import com.cloudframe.app.ip661020.dto.ErrorMessage600;
  import com.cloudframe.app.ip661020.file.records.IpmMessage;
  import com.cloudframe.app.global.sharedvar.Ip66102IpmFileInformation;
  import com.cloudframe.app.ip661020.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.utility.CFUtil;
  
  @Component("ip661020")
  
  public class Ip661020Impl extends CommonProcess implements Ip661020 {
  
  Logger logger = LoggerFactory.getLogger(Ip661020Impl.class);
  
  
  
  
  @Autowired 
  @Qualifier("ip661020_ipmFile")
  IpmFile ipmFile;
  
  
  
  
  
  
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      public int process(Ip661020Ctx programCtx) throws Exception {
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
      		if(ipmFile.hasOpened() && !ipmFile.isReadOnly()) { 
      			ipmFile.flush(); 
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

      * - isInputFileOpen100             COBOL Name: 100-IS-INPUT-FILE-OPEN
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public MainlineOutCtx mainline(MainlineInCtx methodIn) throws Exception {
Ip661020Ctx programCtx = methodIn.getIp661020Ctx();
MainlineOutCtx methodOut = methodIn.getMainlineOutCtx();
//  IF 100-INPUT-FILE-IS-CLOSED
          if ( methodIn.isInputFileIsClosed100()  ) { 
//  PERFORM 2000-OPEN-IPM-FILE
              openIpmFile(programCtx.getOpenIpmFileInCtx());/*2000-OPEN-IPM-FILE*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
//  MOVE ZERO TO RETURN-CODE
          programCtx.setRc(0);
//  PERFORM 3000-READ-A-MESSAGE
          readAMessage(programCtx.getReadAMessageInCtx());/*3000-READ-A-MESSAGE*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return methodOut;
      
      }
      /**
      * openIpmFile 
      *   This method is derived from 
  *   COBOL Paragraph - 2000-OPEN-IPM-FILE COBOL Cyclomatic complexity - 3
      * Input  : None 

      * Output :  

      * - ip66102IpmFileStatus           COBOL Name: IP66102-IPM-FILE-STATUS
      * - isInputFileOpen100             COBOL Name: 100-IS-INPUT-FILE-OPEN
      * - ip66102IpmMsgsRead             COBOL Name: IP66102-IPM-MSGS-READ
      * - errorParagraph600              COBOL Name: 600-ERROR-PARAGRAPH
      * - failingAction600               COBOL Name: 600-FAILING-ACTION
      *
      * @throws CFException
      */
      @Override
      public OpenIpmFileOutCtx openIpmFile(OpenIpmFileInCtx methodIn) throws Exception {
Ip661020Ctx programCtx = methodIn.getIp661020Ctx();
OpenIpmFileOutCtx methodOut = methodIn.getOpenIpmFileOutCtx();
//  OPEN INPUT IPM-FILE
          ipmFile.open(new String(CONSTANTS.MODE_READ_ONLY_36242),ipmFile.getFileName(),ipmFile.getIpmFileCharSet(),ipmFile.getIpmFileCrlfFlag());
          methodOut.setIp66102IpmFileStatus(ipmFile.getStatusString() );
//  IF IP66102-IPM-IO-WAS-GOOD OR IP66102-IPM-FILE-ALREADY-OPEN
          if ( methodOut.isIp66102IpmIoWasGood()   ||  methodOut.isIp66102IpmFileAlreadyOpen()  ) { 
//  SET 100-INPUT-FILE-IS-OPEN TO TRUE
              methodOut.setInputFileIsOpen100True(); 
              
              // MOVE ZERO TO IP66102-IPM-MSGS-READ
              methodOut.setIp66102IpmMsgsRead(0);
          }
//  ELSE
          else { 
              // MOVE '2000' TO 600-ERROR-PARAGRAPH
              //  LITERAL_2000 = '2000'
              methodOut.setErrorParagraph600(CONSTANTS.LITERAL_2000);
//  MOVE 'OPEN' TO 600-FAILING-ACTION
              methodOut.setFailingAction600(CONSTANTS.LITERAL_OPEN_B_);
//  PERFORM 9500-TERMINATE-WITH-ERROR
              terminateWithError(programCtx.getTerminateWithErrorInCtx());/*9500-TERMINATE-WITH-ERROR*/
          }
      
      return methodOut;
      }
      /**
      * readAMessage 
      *   This method is derived from 
  *   COBOL Paragraph - 3000-READ-A-MESSAGE COBOL Cyclomatic complexity - 4
      * Input  :  

      * - ip66102IpmMsgsRead             COBOL Name: IP66102-IPM-MSGS-READ
      *
      * Output :  

      * - ip66102IpmMsgLngth             COBOL Name: IP66102-IPM-MSG-LNGTH
      * - ipmMessage                     COBOL Name: IPM-MESSAGE
      * - ip66102IpmFileStatus           COBOL Name: IP66102-IPM-FILE-STATUS
      * - ip66102IpmMsg                  COBOL Name: IP66102-IPM-MSG
      * - ip66102IpmMsgsRead             COBOL Name: IP66102-IPM-MSGS-READ
      * - ip66102IsIpmFileFinished       COBOL Name: IP66102-IS-IPM-FILE-FINISHED
      * - errorParagraph600              COBOL Name: 600-ERROR-PARAGRAPH
      * - failingAction600               COBOL Name: 600-FAILING-ACTION
      *
      * @throws CFException
      */
      @Override
      public ReadAMessageOutCtx readAMessage(ReadAMessageInCtx methodIn) throws Exception {
Ip661020Ctx programCtx = methodIn.getIp661020Ctx();
ReadAMessageOutCtx methodOut = methodIn.getReadAMessageOutCtx();

// *    Initialize message areas

// *    Read ipm-file into ip66102-ipm-msg
//  MOVE ZERO TO IP66102-IPM-MSG-LNGTH
          methodOut.setIp66102IpmMsgLngth(0);
//  READ IPM-FILE
          	ipmFile.read();
          methodOut.setIp66102IpmMsgLngth(ipmFile.getRecLen());
          methodOut.setIp66102IpmFileStatus(ipmFile.getStatusString() );
          if (!ipmFile.hasEnded()) {
          	methodOut.getIpmMessage().setString(ipmFile.getRecord());
          }
//  EVALUATE TRUE
          if  ( methodOut.isIp66102IpmIoWasGood()  ) { 
//  MOVE IPM-MESSAGE (1 : IP66102-IPM-MSG-LNGTH ) TO IP66102-IPM-MSG (1 : IP66102-IPM-MSG-LNGTH )
              methodOut.getIp66102IpmMsg().replace(methodOut.getIpmMessage(),0,(int) methodOut.getIp66102IpmMsgLngth(),0,(int) methodOut.getIp66102IpmMsgLngth() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  ADD 1 TO IP66102-IPM-MSGS-READ
              methodOut.setIp66102IpmMsgsRead(methodOut.getIp66102IpmMsgsRead()+1);
//  SET IP66102-WE-GOT-A-MSG TO TRUE
              methodOut.setIp66102WeGotAMsgTrue(); 
              
          }
          else if  ( methodOut.isIp66102WeHitEndOfFile()  ) { 

// *          We automatically close the file on eof
//  PERFORM 3100-CLOSE-IPM-FILE
              closeIpmFile(programCtx.getCloseIpmFileInCtx());/*3100-CLOSE-IPM-FILE*/
//  SET IP66102-IPM-FILE-IS-FINISHED TO TRUE
              methodOut.setIp66102IpmFileIsFinishedTrue(); 
              
          }
          else   { 
              // MOVE '1100' TO 600-ERROR-PARAGRAPH
              //  LITERAL_1100 = '1100'
              methodOut.setErrorParagraph600(CONSTANTS.LITERAL_1100);
//  MOVE 'READ' TO 600-FAILING-ACTION
              methodOut.setFailingAction600(CONSTANTS.LITERAL_READ_B_);
//  PERFORM 9500-TERMINATE-WITH-ERROR
              terminateWithError(programCtx.getTerminateWithErrorInCtx());/*9500-TERMINATE-WITH-ERROR*/
          }
      
      return methodOut;
      }
      /**
      * closeIpmFile 
      *   This method is derived from 
  *   COBOL Paragraph - 3100-CLOSE-IPM-FILE COBOL Cyclomatic complexity - 3
      * Input  :  

      * - ip66102IpmFileStatus           COBOL Name: IP66102-IPM-FILE-STATUS
      *
      * Output :  

      * - isInputFileOpen100             COBOL Name: 100-IS-INPUT-FILE-OPEN
      * - errorParagraph600              COBOL Name: 600-ERROR-PARAGRAPH
      * - failingAction600               COBOL Name: 600-FAILING-ACTION
      *
      * @throws CFException
      */
      @Override
      public CloseIpmFileOutCtx closeIpmFile(CloseIpmFileInCtx methodIn) throws Exception {
Ip661020Ctx programCtx = methodIn.getIp661020Ctx();
CloseIpmFileOutCtx methodOut = methodIn.getCloseIpmFileOutCtx();
//  CLOSE IPM-FILE
          ipmFile.close(); 
          methodOut.setIp66102IpmFileStatus(ipmFile.getStatusString() );
//  IF IP66102-IPM-IO-WAS-GOOD OR IP66102-IPM-FILE-IS-CLOSED
          if ( methodIn.isIp66102IpmIoWasGood()   ||  methodIn.isIp66102IpmFileIsClosed()  ) { 

// *       Reset 'file-is-open' switch
//  SET 100-INPUT-FILE-IS-CLOSED TO TRUE
              methodOut.setInputFileIsClosed100True(); 
              
          }
//  ELSE
          else { 
              // MOVE '1200' TO 600-ERROR-PARAGRAPH
              //  LITERAL_1200 = '1200'
              methodOut.setErrorParagraph600(CONSTANTS.LITERAL_1200);
//  MOVE 'CLOSE' TO 600-FAILING-ACTION
//  LITERAL_CLOSE = 'CLOSE'
              methodOut.setFailingAction600(CONSTANTS.LITERAL_CLOSE);
//  PERFORM 9500-TERMINATE-WITH-ERROR
              terminateWithError(programCtx.getTerminateWithErrorInCtx());/*9500-TERMINATE-WITH-ERROR*/
          }
      
      return methodOut;
      }
      /**
      * terminateWithError 
      *   This method is derived from 
  *   COBOL Paragraph - 9500-TERMINATE-WITH-ERROR COBOL Cyclomatic complexity - 1
      * Input  :  

      * - ip66102IpmFileStatus           COBOL Name: IP66102-IPM-FILE-STATUS
      * - errorMessage600                COBOL Name: 600-ERROR-MESSAGE
      * - terminatingMessage600          COBOL Name: 600-TERMINATING-MESSAGE
      *
      * Output :  

      * - badStatusCode600               COBOL Name: 600-BAD-STATUS-CODE
      * - ip66102IpmFileStatus           COBOL Name: IP66102-IPM-FILE-STATUS
      * - rc                             COBOL Name: RETURN-CODE
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      *
      * @throws CFException
      */
      @Override
      public TerminateWithErrorOutCtx terminateWithError(TerminateWithErrorInCtx methodIn) throws Exception {
Ip661020Ctx programCtx = methodIn.getIp661020Ctx();
TerminateWithErrorOutCtx methodOut = methodIn.getTerminateWithErrorOutCtx();
//  MOVE IP66102-IPM-FILE-STATUS TO 600-BAD-STATUS-CODE
          methodOut.setBadStatusCode600(methodOut.getIp66102IpmFileStatus());
          // MOVE 8 TO RETURN-CODE
          programCtx.setRc( 8);
//  DISPLAY 600-ERROR-MESSAGE
          logger.info(methodIn.getErrorMessage600().toString()); 
//  DISPLAY 600-TERMINATING-MESSAGE
          logger.info(new String(methodIn.getTerminatingMessage600())); 
//  MOVE RETURN-CODE TO 900-ABEND-CODE
          methodOut.setAbendCode900(programCtx.getRc());
//  DISPLAY '**********************************'
          logger.info("**********************************"); 
//  DISPLAY 'A B E N D  A B E N D  A B E N D   '
          logger.info("A B E N D  A B E N D  A B E N D   "); 
//  DISPLAY 'A B E N D  IP661020               '
          logger.info("A B E N D  IP661020               "); 
//  DISPLAY '**********************************'
          logger.info("**********************************"); 
      
      return methodOut;
      }
  
  
  
  
  
  
  
  
  }
