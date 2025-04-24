  package com.cloudframe.app.process.impl;
  /* 
*------------------------
*------------------------
*---------------------
*/
  
  import com.cloudframe.app.multi0.Multi0Ctx.*;
  import com.cloudframe.app.multi0.Multi0Ctx;
  import com.cloudframe.app.process.Multi0;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import java.math.BigDecimal;
  import com.cloudframe.app.utility.CFUtil;
  import java.math.RoundingMode;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.multi0.dto.*;
  import com.cloudframe.app.multi0.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("multi0")
  
  public class Multi0Impl extends CommonProcess implements Multi0 {
  
  Logger logger = LoggerFactory.getLogger(Multi0Impl.class);
  
  
  
  
  
  
  
  
  
  
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      public int process(Multi0Ctx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
          ;
//  PERFORM 0000-MAIN
          main(programCtx);/*0000-MAIN*/
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
      @Override
      public MainOutCtx main(Multi0Ctx programCtx) throws Exception {
			// Declare local variables used in the method
			BigDecimal tempDecimal = BigDecimal.ZERO;
			// End of variable declaration

MainOutCtx methodOut = programCtx.getMainOutCtx();

// *
//  MOVE 123.45 TO WRK-DB-1DAY-FLT
          methodOut.setWrkDb1dayFlt(BigDecimal.valueOf(123.45).setScale(4));
//  MOVE WRK-DB-1DAY-FLT TO WRK-DB-1DAY-FLT-DISP
//  FORMAT_361692278 = "------.9999"
          methodOut.setWrkDb1dayFltDisp(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_361692278,methodOut.getWrkDb1dayFlt().toPlainString().toCharArray()));
//  DISPLAY '* 1* WRK-DB-1DAY-FLT  = ' WRK-DB-1DAY-FLT-DISP
          logger.info("* 1* WRK-DB-1DAY-FLT  = {}", new String(methodOut.getWrkDb1dayFltDisp())); 

// *

// *
//  MULTIPLY .65 BY WRK-DB-1DAY-FLT
          tempDecimal = BigDecimal.valueOf(.65).multiply(methodOut.getWrkDb1dayFlt()).setScale(4,RoundingMode.DOWN);
          methodOut.setWrkDb1dayFlt(tempDecimal);
          //
          //
//  MOVE WRK-DB-1DAY-FLT TO WRK-DB-1DAY-FLT-DISP
//  FORMAT_361692278 = "------.9999"
          methodOut.setWrkDb1dayFltDisp(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_361692278,methodOut.getWrkDb1dayFlt().toPlainString().toCharArray()));
//  DISPLAY '* 2* WRK-DB-1DAY-FLT  = ' WRK-DB-1DAY-FLT-DISP
          logger.info("* 2* WRK-DB-1DAY-FLT  = {}", new String(methodOut.getWrkDb1dayFltDisp())); 

// *
//  MOVE 20.96 TO AXIS-WP-COI-ACCUM
          methodOut.setAxisWpCoiAccum(BigDecimal.valueOf(20.96).setScale(2));
//  MULTIPLY AXIS-WP-COI-ACCUM BY 1 GIVING AXIS-WP-COI-ROUND ROUNDED
          methodOut.setAxisWpCoiRound(methodOut.getAxisWpCoiAccum().multiply(BigDecimal.ONE).setScale(0,RoundingMode.HALF_UP).intValue());
//  MOVE AXIS-WP-COI-ROUND TO AXIS-WP-COI-ROUND-DISP
//  FORMAT_287469216 = "----------"
          methodOut.setAxisWpCoiRoundDisp(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_287469216,String.valueOf(methodOut.getAxisWpCoiRound()).toCharArray()));
//  DISPLAY '* 3* AXIS-WP-COI-ROUND-DISP   = ' AXIS-WP-COI-ROUND-DISP
          logger.info("* 3* AXIS-WP-COI-ROUND-DISP   = {}", new String(methodOut.getAxisWpCoiRoundDisp())); 
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return methodOut;
      
      }
  
  
  
  
  
  
  
  
  }
