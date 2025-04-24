  package com.cloudframe.app.process.impl;
  /* 
*---------------------------------------------
* mcfile2 - aggregate balance for credit card
*           to output file
*--------------------------------------------
*/
  
  import com.cloudframe.app.mcfile2.Mcfile2Ctx.*;
  import com.cloudframe.app.mcfile2.Mcfile2Ctx;
  import com.cloudframe.app.process.Mcfile2;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.mcfile2.file.*;
  import java.math.BigDecimal;
  import java.math.RoundingMode;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.mcfile2.dto.*;
  import com.cloudframe.app.mcfile2.file.records.WfOutput;
  import com.cloudframe.app.global.sharedvar.Output;
  import com.cloudframe.app.mcfile2.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.utility.CFUtil;
  
  @Component("mcfile2")
  
  public class Mcfile2Impl extends CommonProcess implements Mcfile2 {
  
  Logger logger = LoggerFactory.getLogger(Mcfile2Impl.class);
  
  
  
  
  @Autowired 
  @Qualifier("mcfile2_flOutputFile")
  FlOutputFile flOutputFile;
  
  
  
  
  
  
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      public int process(Mcfile2Ctx programCtx) throws Exception {
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
      		if(flOutputFile.hasOpened() && !flOutputFile.isReadOnly()) { 
      			flOutputFile.flush(); 
      		}
      }
      
       return programCtx.getRc(); // Exit with return code
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
      @Override
      public void mainline(Mcfile2Ctx programCtx) throws Exception {

// *
//  PERFORM 0100-INITIALIZE THRU 0100-EXIT
          initialize(programCtx.getInitializeInCtx());/*0100-INITIALIZE*/
          if (programCtx.isProgramEnded()) {
              return ;
          }

// *
//  PERFORM 0200-WRITE-RECORD THRU 0200-EXIT
          writeRecord(programCtx.getWriteRecordInCtx());/*0200-WRITE-RECORD*/
          if (programCtx.isProgramEnded()) {
              return ;
          }

// *
//  PERFORM 0300-TERMINATE THRU 0300-EXIT
          terminate(programCtx.getTerminateInCtx());/*0300-TERMINATE*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
          ;
      
      }
      /**
      * initialize 
      *   This method is derived from 
  *   COBOL Paragraph - 0100-INITIALIZE COBOL Cyclomatic complexity - 2
      * Input  : None 

      * Output :  

      * - outpStatus                     COBOL Name: WS-OUTP-STATUS
      *
      * @throws CFException
      */
      @Override
      public InitializeOutCtx initialize(InitializeInCtx methodIn) throws Exception {
      
// *

// *
Mcfile2Ctx programCtx = methodIn.getMcfile2Ctx();
InitializeOutCtx methodOut = methodIn.getInitializeOutCtx();
//  OPEN EXTEND FL-OUTPUT-FILE
          flOutputFile.setAppendOnWrite(true);
          flOutputFile.open(new String(CONSTANTS.MODE_WRITE_ONLY_36397),flOutputFile.getFileName(),flOutputFile.getFlOutputFileCharSet(),flOutputFile.getFlOutputFileCrlfFlag());
          methodOut.setOutpStatus(flOutputFile.getStatusString() );
//  IF NOT ( WS-OUTP-STATUS = '00' )
//  LITERAL_00 = '00'
          if ((		compareChars(methodOut.getOutpStatus(),CONSTANTS.LITERAL_00) != 0 )) { 
//  DISPLAY 'OPEN OUTP-FILE ERROR ' WS-OUTP-STATUS
              logger.info("OPEN OUTP-FILE ERROR {}", new String(methodOut.getOutpStatus())); 
//  PERFORM 9100-ABEND THRU 9100-ABEND-EXIT
              abend(programCtx);/*9100-ABEND*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
          ;
      
      return methodOut;
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
      @Override
      public WriteRecordOutCtx writeRecord(WriteRecordInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			BigDecimal tempDecimal = BigDecimal.ZERO;
			// End of variable declaration

      
// *

// *
Mcfile2Ctx programCtx = methodIn.getMcfile2Ctx();
WriteRecordOutCtx methodOut = methodIn.getWriteRecordOutCtx();
//  ADD 1 TO WS-OUT-SERVICE-MM
          methodOut.setOutServiceMm(methodOut.getOutServiceMm()+1);
//  ADD 100.12 TO WS-OUT-TOTAL
          tempDecimal = methodOut.getOutTotal().add(BigDecimal.valueOf(100.12)).setScale(3,RoundingMode.DOWN);
          methodOut.setOutTotal(tempDecimal);
          //

// *
//  MOVE WS-OUT-CARD-NUMBER TO WF-OUT-CARD-NUMBER
          methodOut.setWfOutCardNumber(methodOut.getOutCardNumber());
//  MOVE WS-OUT-SERVICE-MM TO WF-OUT-SERVICE-MM
          methodOut.setWfOutServiceMm(methodOut.getOutServiceMm());
//  MOVE WS-OUT-TOTAL TO WF-OUT-TOTAL
          methodOut.setWfOutTotal(methodOut.getOutTotal());

// *
// *

// *
//  WRITE WF-OUTPUT
          flOutputFile.write(methodOut.getWfOutput().toCharArray()); 
          methodOut.getWfOutput().setString(CONSTANTS.LOW_VALUE_1253883881);
          methodOut.setOutpStatus(flOutputFile.getStatusString() );
//  IF NOT ( WS-OUTP-STATUS = '00' OR '22' )
//  LITERAL_22 = '22'
          if ((		compareChars(methodOut.getOutpStatus(),CONSTANTS.LITERAL_00) != 0  && 		compareChars(methodOut.getOutpStatus(),CONSTANTS.LITERAL_22) != 0 )) { 
//  DISPLAY 'WRITE OUTP-FILE ERROR ' WS-OUTP-STATUS WF-OUTPUT
              logger.info("WRITE OUTP-FILE ERROR {}{}", new String(methodOut.getOutpStatus()), methodOut.getWfOutput().toString()); 
//  PERFORM 9100-ABEND THRU 9100-ABEND-EXIT
              abend(programCtx);/*9100-ABEND*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
      
      return methodOut;
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
      @Override
      public TerminateOutCtx terminate(TerminateInCtx methodIn) throws Exception {
      
// *

// *
Mcfile2Ctx programCtx = methodIn.getMcfile2Ctx();
TerminateOutCtx methodOut = methodIn.getTerminateOutCtx();
//  CLOSE FL-OUTPUT-FILE
          flOutputFile.close(); 
          methodOut.setOutpStatus(flOutputFile.getStatusString() );
//  IF NOT ( WS-OUTP-STATUS = '00' )
//  LITERAL_00 = '00'
          if ((		compareChars(methodOut.getOutpStatus(),CONSTANTS.LITERAL_00) != 0 )) { 
//  DISPLAY 'CLOSE OUTP-FILE ERROR ' WS-OUTP-STATUS
              logger.info("CLOSE OUTP-FILE ERROR {}", new String(methodOut.getOutpStatus())); 
//  PERFORM 9100-ABEND THRU 9100-ABEND-EXIT
              abend(programCtx);/*9100-ABEND*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return methodOut;
      
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
      @Override
      public AbendOutCtx abend(Mcfile2Ctx programCtx) throws Exception {
AbendOutCtx methodOut = programCtx.getAbendOutCtx();
//  DISPLAY 'PROGRAM MCFILE2  ENDED UNSUCCESSFULLY'
          logger.info("PROGRAM MCFILE2  ENDED UNSUCCESSFULLY"); 
          // MOVE 12 TO RETURN-CODE
          programCtx.setRc( 12);
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return methodOut;
      
      }
  
  
  
  
  
  
  
  
  }
