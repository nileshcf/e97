  package com.cloudframe.app.process;
  /* 
*------------------------
*------------------------
*---------------------
*/
  
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import java.math.BigDecimal;
  import com.cloudframe.app.utility.CFUtil;
  import java.math.RoundingMode;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.multi0.dto.*;
  import com.cloudframe.app.multi0.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("multi0")
  
  public class Multi0 extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Multi0.class);
  
  private Work work = new Work() ;
  
  
  
  
  
  
  
  
  
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
//  PERFORM 0000-MAIN
          main();/*0000-MAIN*/
          if (this.isProgramEnded()) {
              return getRc();
          }
       } catch(Exception e) {
            handleErrorCode(e);
            throw e;
       }
      
       return getRc(); // Exit with return code
      // end of process method
      }
      /**
      * main 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAIN COBOL Cyclomatic complexity - 2
      * Input  : None 

      * Output :  

      * - wrkDb1dayFlt                   COBOL Name: WRK-DB-1DAY-FLT
      * - wrkDb1dayFltDisp               COBOL Name: WRK-DB-1DAY-FLT-DISP
      * - axisWpCoiAccum                 COBOL Name: AXIS-WP-COI-ACCUM
      * - axisWpCoiRound                 COBOL Name: AXIS-WP-COI-ROUND
      * - axisWpCoiRoundDisp             COBOL Name: AXIS-WP-COI-ROUND-DISP
      *
      * @throws CFException
      */
      private void main() throws Exception {
			// Declare local variables used in the method
			BigDecimal tempDecimal = BigDecimal.ZERO;
			// End of variable declaration


// *
//  MOVE 123.45 TO WRK-DB-1DAY-FLT
          work.setWrkDb1dayFlt(BigDecimal.valueOf(123.45).setScale(4));
//  MOVE WRK-DB-1DAY-FLT TO WRK-DB-1DAY-FLT-DISP
//  FORMAT_361692278 = "------.9999"
          work.setWrkDb1dayFltDisp(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_361692278,work.getWrkDb1dayFlt().toPlainString().toCharArray()));
//  DISPLAY '* 1* WRK-DB-1DAY-FLT  = ' WRK-DB-1DAY-FLT-DISP
          logger.info("* 1* WRK-DB-1DAY-FLT  = {}", new String(work.getWrkDb1dayFltDisp())); 

// *

// *
//  MULTIPLY .65 BY WRK-DB-1DAY-FLT
          tempDecimal = BigDecimal.valueOf(.65).multiply(work.getWrkDb1dayFlt()).setScale(4,RoundingMode.DOWN);
          work.setWrkDb1dayFlt(tempDecimal);
          //
          //
//  MOVE WRK-DB-1DAY-FLT TO WRK-DB-1DAY-FLT-DISP
//  FORMAT_361692278 = "------.9999"
          work.setWrkDb1dayFltDisp(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_361692278,work.getWrkDb1dayFlt().toPlainString().toCharArray()));
//  DISPLAY '* 2* WRK-DB-1DAY-FLT  = ' WRK-DB-1DAY-FLT-DISP
          logger.info("* 2* WRK-DB-1DAY-FLT  = {}", new String(work.getWrkDb1dayFltDisp())); 

// *
//  MOVE 20.96 TO AXIS-WP-COI-ACCUM
          work.setAxisWpCoiAccum(BigDecimal.valueOf(20.96).setScale(2));
//  MULTIPLY AXIS-WP-COI-ACCUM BY 1 GIVING AXIS-WP-COI-ROUND ROUNDED
          work.setAxisWpCoiRound(work.getAxisWpCoiAccum().multiply(BigDecimal.ONE).setScale(0,RoundingMode.HALF_UP).intValue());
//  MOVE AXIS-WP-COI-ROUND TO AXIS-WP-COI-ROUND-DISP
//  FORMAT_287469216 = "----------"
          work.setAxisWpCoiRoundDisp(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_287469216,String.valueOf(work.getAxisWpCoiRound()).toCharArray()));
//  DISPLAY '* 3* AXIS-WP-COI-ROUND-DISP   = ' AXIS-WP-COI-ROUND-DISP
          logger.info("* 3* AXIS-WP-COI-ROUND-DISP   = {}", new String(work.getAxisWpCoiRoundDisp())); 
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
