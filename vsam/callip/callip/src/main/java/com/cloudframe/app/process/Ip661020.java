  package com.cloudframe.app.process;
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
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.ip661020.dto.*;
  import com.cloudframe.app.ip661020.file.records.IpmMessage;
  import com.cloudframe.app.global.sharedvar.Ip66102IpmMsg;
  import com.cloudframe.app.ip661020.dto.ErrorMessage600;
  import com.cloudframe.app.global.sharedvar.Ip66102IpmFileInformation;
  import com.cloudframe.app.ip661020.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.utility.CFUtil;
  
  @Component("ip661020")
  
  public class Ip661020 extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Ip661020.class);
  
  private IpmMessage ipmMessage = new IpmMessage() ;
  private ErrorMessage600 errorMessage600 = new ErrorMessage600() ;
  private Work work = new Work() ;
  
  
  
  @Autowired 
  @Qualifier("ip661020_ipmFile")
  IpmFile ipmFile;
  
  
  
  
  
  
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
      		if(ipmFile.hasOpened() && !ipmFile.isReadOnly()) { 
      			ipmFile.flush(); 
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

      * - isInputFileOpen100             COBOL Name: 100-IS-INPUT-FILE-OPEN
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      private void mainline() throws Exception {
//  IF 100-INPUT-FILE-IS-CLOSED
          if ( work.isInputFileIsClosed100()  ) { 
//  PERFORM 2000-OPEN-IPM-FILE
              openIpmFile();/*2000-OPEN-IPM-FILE*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
//  MOVE ZERO TO RETURN-CODE
          this.setRc(0);
//  PERFORM 3000-READ-A-MESSAGE
          readAMessage();/*3000-READ-A-MESSAGE*/
          if (this.isProgramEnded()) {
              return ;
          }
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          this.setProgramEnded(true);
          return ;
      
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
      private void openIpmFile() throws Exception {
//  OPEN INPUT IPM-FILE
          ipmFile.open(new String(CONSTANTS.MODE_READ_ONLY_36242),ipmFile.getFileName(),ipmFile.getIpmFileCharSet(),ipmFile.getIpmFileCrlfFlag());
          ip66102IpmFileInformation.setIp66102IpmFileStatus(ipmFile.getStatusString() );
//  IF IP66102-IPM-IO-WAS-GOOD OR IP66102-IPM-FILE-ALREADY-OPEN
          if ( ip66102IpmFileInformation.isIp66102IpmIoWasGood()   ||  ip66102IpmFileInformation.isIp66102IpmFileAlreadyOpen()  ) { 
//  SET 100-INPUT-FILE-IS-OPEN TO TRUE
              work.setInputFileIsOpen100True(); 
              
              // MOVE ZERO TO IP66102-IPM-MSGS-READ
              ip66102IpmFileInformation.setIp66102IpmMsgsRead(0);
          }
//  ELSE
          else { 
              // MOVE '2000' TO 600-ERROR-PARAGRAPH
              //  LITERAL_2000 = '2000'
              errorMessage600.setErrorParagraph600(CONSTANTS.LITERAL_2000);
//  MOVE 'OPEN' TO 600-FAILING-ACTION
              errorMessage600.setFailingAction600(CONSTANTS.LITERAL_OPEN_B_);
//  PERFORM 9500-TERMINATE-WITH-ERROR
              terminateWithError();/*9500-TERMINATE-WITH-ERROR*/
          }
      
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
      private void readAMessage() throws Exception {

// *    Initialize message areas

// *    Read ipm-file into ip66102-ipm-msg
//  MOVE ZERO TO IP66102-IPM-MSG-LNGTH
          ip66102IpmFileInformation.setIp66102IpmMsgLngth(0);
//  READ IPM-FILE
          	ipmFile.read();
          ip66102IpmFileInformation.setIp66102IpmMsgLngth(ipmFile.getRecLen());
          ip66102IpmFileInformation.setIp66102IpmFileStatus(ipmFile.getStatusString() );
          if (!ipmFile.hasEnded()) {
          	ipmMessage.setString(ipmFile.getRecord());
          }
//  EVALUATE TRUE
          if  ( ip66102IpmFileInformation.isIp66102IpmIoWasGood()  ) { 
//  MOVE IPM-MESSAGE (1 : IP66102-IPM-MSG-LNGTH ) TO IP66102-IPM-MSG (1 : IP66102-IPM-MSG-LNGTH )
              ip66102IpmMsg.replace(ipmMessage,0,(int) ip66102IpmFileInformation.getIp66102IpmMsgLngth(),0,(int) ip66102IpmFileInformation.getIp66102IpmMsgLngth() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  ADD 1 TO IP66102-IPM-MSGS-READ
              ip66102IpmFileInformation.setIp66102IpmMsgsRead(ip66102IpmFileInformation.getIp66102IpmMsgsRead()+1);
//  SET IP66102-WE-GOT-A-MSG TO TRUE
              ip66102IpmFileInformation.setIp66102WeGotAMsgTrue(); 
              
          }
          else if  ( ip66102IpmFileInformation.isIp66102WeHitEndOfFile()  ) { 

// *          We automatically close the file on eof
//  PERFORM 3100-CLOSE-IPM-FILE
              closeIpmFile();/*3100-CLOSE-IPM-FILE*/
//  SET IP66102-IPM-FILE-IS-FINISHED TO TRUE
              ip66102IpmFileInformation.setIp66102IpmFileIsFinishedTrue(); 
              
          }
          else   { 
              // MOVE '1100' TO 600-ERROR-PARAGRAPH
              //  LITERAL_1100 = '1100'
              errorMessage600.setErrorParagraph600(CONSTANTS.LITERAL_1100);
//  MOVE 'READ' TO 600-FAILING-ACTION
              errorMessage600.setFailingAction600(CONSTANTS.LITERAL_READ_B_);
//  PERFORM 9500-TERMINATE-WITH-ERROR
              terminateWithError();/*9500-TERMINATE-WITH-ERROR*/
          }
      
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
      private void closeIpmFile() throws Exception {
//  CLOSE IPM-FILE
          ipmFile.close(); 
          ip66102IpmFileInformation.setIp66102IpmFileStatus(ipmFile.getStatusString() );
//  IF IP66102-IPM-IO-WAS-GOOD OR IP66102-IPM-FILE-IS-CLOSED
          if ( ip66102IpmFileInformation.isIp66102IpmIoWasGood()   ||  ip66102IpmFileInformation.isIp66102IpmFileIsClosed()  ) { 

// *       Reset 'file-is-open' switch
//  SET 100-INPUT-FILE-IS-CLOSED TO TRUE
              work.setInputFileIsClosed100True(); 
              
          }
//  ELSE
          else { 
              // MOVE '1200' TO 600-ERROR-PARAGRAPH
              //  LITERAL_1200 = '1200'
              errorMessage600.setErrorParagraph600(CONSTANTS.LITERAL_1200);
//  MOVE 'CLOSE' TO 600-FAILING-ACTION
//  LITERAL_CLOSE = 'CLOSE'
              errorMessage600.setFailingAction600(CONSTANTS.LITERAL_CLOSE);
//  PERFORM 9500-TERMINATE-WITH-ERROR
              terminateWithError();/*9500-TERMINATE-WITH-ERROR*/
          }
      
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
      private void terminateWithError() throws Exception {
//  MOVE IP66102-IPM-FILE-STATUS TO 600-BAD-STATUS-CODE
          errorMessage600.setBadStatusCode600(ip66102IpmFileInformation.getIp66102IpmFileStatus());
          // MOVE 8 TO RETURN-CODE
          this.setRc( 8);
//  DISPLAY 600-ERROR-MESSAGE
          logger.info(errorMessage600.toString()); 
//  DISPLAY 600-TERMINATING-MESSAGE
          logger.info(new String(work.getTerminatingMessage600())); 
//  MOVE RETURN-CODE TO 900-ABEND-CODE
          work.setAbendCode900((short) getRc());
//  DISPLAY '**********************************'
          logger.info("**********************************"); 
//  DISPLAY 'A B E N D  A B E N D  A B E N D   '
          logger.info("A B E N D  A B E N D  A B E N D   "); 
//  DISPLAY 'A B E N D  IP661020               '
          logger.info("A B E N D  IP661020               "); 
//  DISPLAY '**********************************'
          logger.info("**********************************"); 
      
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
