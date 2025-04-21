  package com.cloudframe.app.process;
  /* 
*---------------------------------------------
* mcfile1 - aggregate balance for credit card
*           to output file
*--------------------------------------------
*/
  
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import java.math.BigDecimal;
  import java.math.RoundingMode;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.mcfile1.file.*;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.mcfile1.dto.*;
  import com.cloudframe.app.mcfile1.file.records.WfOutput;
  import com.cloudframe.app.global.sharedvar.Output;
  import com.cloudframe.app.mcfile1.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.utility.CFUtil;
  
  @Component("mcfile1")
  
  public class Mcfile1 extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Mcfile1.class);
  
  private WfOutput wfOutput = new WfOutput() ;
  private Work work = new Work() ;
  
  
  
  @Autowired 
  @Qualifier("mcfile1_flOutputFile")
  FlOutputFile flOutputFile;
  
  
  
  
  
  
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
      		if(flOutputFile.hasOpened() && !flOutputFile.isReadOnly()) { 
      			flOutputFile.flush(); 
      		}
      }
      
       return getRc(); // Exit with return code
      // end of process method
      }
      /**
      * mainline 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAINLINE COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void mainline() throws Exception {

// *
//  PERFORM 0100-INITIALIZE THRU 0100-EXIT
          initialize();/*0100-INITIALIZE*/
          if (this.isProgramEnded()) {
              return ;
          }

// *
//  PERFORM 0200-WRITE-RECORD THRU 0200-EXIT
          writeRecord();/*0200-WRITE-RECORD*/
          if (this.isProgramEnded()) {
              return ;
          }

// *
//  PERFORM 0300-TERMINATE THRU 0300-EXIT
          terminate();/*0300-TERMINATE*/
          if (this.isProgramEnded()) {
              return ;
          }
          ;
      
      }
      /**
      * initialize 
      *   This method is derived from 
  *   COBOL Paragraph - 0100-INITIALIZE COBOL Cyclomatic complexity - 3
      * Input  :  

      * - firsttimeFlag                  COBOL Name: FIRSTTIME-FLAG
      *
      * Output :  

      * - outCardNumber                  COBOL Name: WS-OUT-CARD-NUMBER
      * - outServiceMm                   COBOL Name: WS-OUT-SERVICE-MM
      * - outTotal                       COBOL Name: WS-OUT-TOTAL
      * - outpStatus                     COBOL Name: WS-OUTP-STATUS
      * - firsttimeFlag                  COBOL Name: FIRSTTIME-FLAG
      *
      * @throws CFException
      */
      private void initialize() throws Exception {
			// Declare local variables used in the method
			char[] outpStatus = null;
			// End of variable declaration

      
// *

// *
//  IF FIRSTTIME
          if ( work.isFirsttime()  ) { 
              // MOVE '1234567890123456' TO WS-OUT-CARD-NUMBER
              //  LITERAL_1234567890123456 = '1234567890123456'
              output.setOutCardNumber(CONSTANTS.LITERAL_1234567890123456);
              // MOVE 0 TO WS-OUT-SERVICE-MM
              output.setOutServiceMm(0);
              // MOVE 0.0 TO WS-OUT-TOTAL
              output.setOutTotal(BigDecimal.valueOf(0.0).setScale(3,RoundingMode.DOWN));
//  OPEN OUTPUT FL-OUTPUT-FILE
              flOutputFile.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),flOutputFile.getFileName(),flOutputFile.getFlOutputFileCharSet(),flOutputFile.getFlOutputFileCrlfFlag());
              work.setOutpStatus(flOutputFile.getStatusString() );
              // MOVE 'N' TO FIRSTTIME-FLAG
              //  LITERAL_N = 'N'
              work.setFirsttimeFlag(CONSTANTS.LITERAL_N);
          }
//  ELSE
          else { 
//  OPEN EXTEND FL-OUTPUT-FILE
              flOutputFile.setAppendOnWrite(true);
              flOutputFile.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),flOutputFile.getFileName(),flOutputFile.getFlOutputFileCharSet(),flOutputFile.getFlOutputFileCrlfFlag());
              work.setOutpStatus(flOutputFile.getStatusString() );
          }
          outpStatus = work.getOutpStatus();
//  IF NOT ( WS-OUTP-STATUS = '00' )
//  LITERAL_00 = '00'
          if ((		compareChars(outpStatus,CONSTANTS.LITERAL_00) != 0 )) { 
//  DISPLAY 'OPEN OUTP-FILE ERROR ' WS-OUTP-STATUS
              logger.info("OPEN OUTP-FILE ERROR {}", new String(work.getOutpStatus())); 
//  PERFORM 9100-ABEND THRU 9100-ABEND-EXIT
              abend();/*9100-ABEND*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
  
          ;
      
      }
      /**
      * writeRecord 
      *   This method is derived from 
  *   COBOL Paragraph - 0200-WRITE-RECORD COBOL Cyclomatic complexity - 3
      * Input  :  

      * - outServiceMm                   COBOL Name: WS-OUT-SERVICE-MM
      * - outTotal                       COBOL Name: WS-OUT-TOTAL
      * - outCardNumber                  COBOL Name: WS-OUT-CARD-NUMBER
      * - wfOutput                       COBOL Name: WF-OUTPUT
      *
      * Output :  

      * - outServiceMm                   COBOL Name: WS-OUT-SERVICE-MM
      * - outTotal                       COBOL Name: WS-OUT-TOTAL
      * - wfOutCardNumber                COBOL Name: WF-OUT-CARD-NUMBER
      * - outCardNumber                  COBOL Name: WS-OUT-CARD-NUMBER
      * - wfOutServiceMm                 COBOL Name: WF-OUT-SERVICE-MM
      * - wfOutTotal                     COBOL Name: WF-OUT-TOTAL
      * - outpStatus                     COBOL Name: WS-OUTP-STATUS
      *
      * @throws CFException
      */
      private void writeRecord() throws Exception {
			// Declare local variables used in the method
			BigDecimal tempDecimal = BigDecimal.ZERO;
			char[] outpStatus = null;
			// End of variable declaration

      
// *

// *
//  ADD 1 TO WS-OUT-SERVICE-MM
          output.setOutServiceMm(output.getOutServiceMm()+1);
//  ADD 100.12 TO WS-OUT-TOTAL
          tempDecimal = output.getOutTotal().add(BigDecimal.valueOf(100.12)).setScale(3,RoundingMode.DOWN);
          output.setOutTotal(tempDecimal);
          //

// *
//  MOVE WS-OUT-CARD-NUMBER TO WF-OUT-CARD-NUMBER
          wfOutput.setWfOutCardNumber(output.getOutCardNumber());
//  MOVE WS-OUT-SERVICE-MM TO WF-OUT-SERVICE-MM
          wfOutput.setWfOutServiceMm(output.getOutServiceMm());
//  MOVE WS-OUT-TOTAL TO WF-OUT-TOTAL
          wfOutput.setWfOutTotal(output.getOutTotal());

// *

// *
//  WRITE WF-OUTPUT
          flOutputFile.write(wfOutput.toCharArray()); 
          wfOutput.setString(CONSTANTS.LOW_VALUE_1253883881);
          work.setOutpStatus(flOutputFile.getStatusString() );
          outpStatus = work.getOutpStatus();
//  IF NOT ( WS-OUTP-STATUS = '00' OR '22' )
//  LITERAL_22 = '22'
          if ((		compareChars(outpStatus,CONSTANTS.LITERAL_00) != 0  && 		compareChars(outpStatus,CONSTANTS.LITERAL_22) != 0 )) { 
//  DISPLAY 'WRITE OUTP-FILE ERROR ' WS-OUTP-STATUS WF-OUTPUT
              logger.info("WRITE OUTP-FILE ERROR {}{}", new String(work.getOutpStatus()), wfOutput.toString()); 
//  PERFORM 9100-ABEND THRU 9100-ABEND-EXIT
              abend();/*9100-ABEND*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
  
      
      }
      /**
      * terminate 
      *   This method is derived from 
  *   COBOL Paragraph - 0300-TERMINATE COBOL Cyclomatic complexity - 3
      * Input  :  

      * - outpStatus                     COBOL Name: WS-OUTP-STATUS
      *
      * Output : None 

      * @throws CFException
      */
      private void terminate() throws Exception {
			// Declare local variables used in the method
			char[] outpStatus = null;
			// End of variable declaration

      
// *

// *
//  CLOSE FL-OUTPUT-FILE
          flOutputFile.close(); 
          work.setOutpStatus(flOutputFile.getStatusString() );
          outpStatus = work.getOutpStatus();
//  IF NOT ( WS-OUTP-STATUS = '00' )
//  LITERAL_00 = '00'
          if ((		compareChars(outpStatus,CONSTANTS.LITERAL_00) != 0 )) { 
//  DISPLAY 'CLOSE OUTP-FILE ERROR ' WS-OUTP-STATUS
              logger.info("CLOSE OUTP-FILE ERROR {}", new String(work.getOutpStatus())); 
//  PERFORM 9100-ABEND THRU 9100-ABEND-EXIT
              abend();/*9100-ABEND*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
  
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          this.setProgramEnded(true);
          return ;
      
      }
      /**
      * abend 
      *   This method is derived from 
  *   COBOL Paragraph - 9100-ABEND COBOL Cyclomatic complexity - 2
      * Input  : None 

      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      private void abend() throws Exception {
//  DISPLAY 'PROGRAM MCFILE1  ENDED UNSUCCESSFULLY'
          logger.info("PROGRAM MCFILE1  ENDED UNSUCCESSFULLY"); 
          // MOVE 12 TO RETURN-CODE
          this.setRc( 12);
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          this.setProgramEnded(true);
          return ;
      
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
