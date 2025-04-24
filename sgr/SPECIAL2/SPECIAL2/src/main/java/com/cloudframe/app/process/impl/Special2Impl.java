  package com.cloudframe.app.process.impl;
  /* 
*
*/
  
  import com.cloudframe.app.special2.Special2Ctx.*;
  import com.cloudframe.app.special2.Special2Ctx;
  import com.cloudframe.app.process.Special2;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import com.cloudframe.app.utility.CFUtil;
  import java.math.BigDecimal;
  import java.math.RoundingMode;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.special2.dto.*;
  import com.cloudframe.app.special2.dto.RestoTablas;
  import com.cloudframe.app.special2.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("special2")
  
  public class Special2Impl extends CommonProcess implements Special2 {
  
  Logger logger = LoggerFactory.getLogger(Special2Impl.class);
  
  
  
  
  
  
  
  
  
  
      /**
      * process 
      * Input  :  

      * - cnt3r                          COBOL Name: WS-CNT-3R
      *
      * Output :  

      * - cnt1r                          COBOL Name: WS-CNT-1R
      * - edit                           COBOL Name: WS-EDIT
      * - cnt2r                          COBOL Name: WS-CNT-2R
      * - edit2                          COBOL Name: WS-EDIT2
      * - edit3                          COBOL Name: WS-EDIT3
      * - cnt3r                          COBOL Name: WS-CNT-3R
      * - numericFlag                    COBOL Name: WS-NUMERIC-FLAG
      * - tiNTot                         COBOL Name: TI-N-TOT
      * - tiNMaxheight                   COBOL Name: TI-N-MAXHEIGHT
      * - bodyHeight                     COBOL Name: WS-BODY-HEIGHT
      * - bhDisplay                      COBOL Name: WS-BH-DISPLAY
      *
      * @throws CFException
      */
      public int process(Special2Ctx programCtx) throws Exception {
			// Declare local variables used in the method
			BigDecimal tempDecimal = BigDecimal.ZERO;
			// End of variable declaration

CFUtil.setDecimalAsComma();
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
ProcessInCtx methodIn = programCtx.getProcessInCtx();
ProcessOutCtx methodOut = methodIn.getProcessOutCtx();

// *
// *----------------------------------------------------------------
//  MOVE 600939 TO WS-CNT-1R
          methodOut.setCnt1r(600939);
//  MOVE WS-CNT-1R TO WS-EDIT
//  FORMAT_88027629 = "ZZZ.ZZZ.ZZ9"
          methodOut.setEdit(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_88027629,String.valueOf(methodOut.getCnt1r()).toCharArray()));
//  DISPLAY '*  1* WS-CNT-1R = ' WS-EDIT
          logger.info("*  1* WS-CNT-1R = {}", new String(methodOut.getEdit())); 

// *
//  MOVE -123456.789 TO WS-CNT-2R
          methodOut.setCnt2r(BigDecimal.valueOf(-123456.789).setScale(3));
//  MOVE WS-CNT-2R TO WS-EDIT2
//  FORMAT_22758683 = "-ZZZ.ZZ9,999"
          methodOut.setEdit2(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_22758683,methodOut.getCnt2r().toPlainString().toCharArray()));
//  DISPLAY '*  2* WS-CNT-2R = ' WS-EDIT2
          logger.info("*  2* WS-CNT-2R = {}", new String(methodOut.getEdit2())); 

// *
          // MOVE WS-CNT-3R TO WS-EDIT3
          //  FORMAT_1514821298 = "$.$$$,99"
          methodOut.setEdit3(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1514821298,methodOut.getCnt3r().toPlainString().toCharArray()));
//  DISPLAY '*  3* WS-CNT-3R = ' WS-EDIT3
          logger.info("*  3* WS-CNT-3R = {}", new String(methodOut.getEdit3())); 

// *
// *
          // MOVE 3456.78 TO WS-NUMERIC-FLAG
          methodOut.setNumericFlag(BigDecimal.valueOf(3456.78).setScale(2).setScale(2));
//  IF VALID-NUMERIC THEN
          if ( methodOut.isValidNumeric()  ) { 
//  DISPLAY '*  4* SUCCESS'
              logger.info("*  4* SUCCESS"); 
          }
//  ELSE
          else { 
//  DISPLAY '*  5* FAILURE'
              logger.info("*  5* FAILURE"); 
          }
//  IF EXACT-MATCH THEN
          if ( methodOut.isExactMatch()  ) { 
//  DISPLAY '*  6* SUCCESS'
              logger.info("*  6* SUCCESS"); 
          }
//  ELSE
          else { 
//  DISPLAY '*  7* FAILURE'
              logger.info("*  7* FAILURE"); 
          }
          // MOVE 7231.93 TO WS-NUMERIC-FLAG
          methodOut.setNumericFlag(BigDecimal.valueOf(7231.93).setScale(2).setScale(2));
//  IF INVALID-NUMERIC THEN
          if ( methodOut.isInvalidNumeric()  ) { 
//  DISPLAY '*  8* SUCCESS'
              logger.info("*  8* SUCCESS"); 
          }
//  ELSE
          else { 
//  DISPLAY '*  9* FAILURE'
              logger.info("*  9* FAILURE"); 
          }

// *
//  MOVE 0.00 TO WS-CNT-2R
          methodOut.setCnt2r(BigDecimal.valueOf(0.00).setScale(3));
//  ADD 7231.93 TO WS-CNT-2R
          tempDecimal = methodOut.getCnt2r().add(BigDecimal.valueOf(7231.93)).setScale(3,RoundingMode.DOWN);
          methodOut.setCnt2r(tempDecimal);
          //
//  ADD 123.34 , 35.45 TO WS-CNT-2R
          tempDecimal = methodOut.getCnt2r().add(BigDecimal.valueOf(123.34)).add(BigDecimal.valueOf(35.45)).setScale(3,RoundingMode.DOWN);
          methodOut.setCnt2r(tempDecimal);
          //
//  MOVE WS-CNT-2R TO WS-EDIT2
//  FORMAT_22758683 = "-ZZZ.ZZ9,999"
          methodOut.setEdit2(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_22758683,methodOut.getCnt2r().toPlainString().toCharArray()));
//  DISPLAY '* 10* WS-CNT-2R = ' WS-EDIT2
          logger.info("* 10* WS-CNT-2R = {}", new String(methodOut.getEdit2())); 

// *
//  MOVE 0.00 TO WS-CNT-2R
          methodOut.setCnt2r(BigDecimal.valueOf(0.00).setScale(3));
//  ADD 1.2 TO WS-CNT-2R
          tempDecimal = methodOut.getCnt2r().add(BigDecimal.valueOf(1.2)).setScale(3,RoundingMode.DOWN);
          methodOut.setCnt2r(tempDecimal);
          //
//  MOVE WS-CNT-2R TO WS-EDIT2
//  FORMAT_22758683 = "-ZZZ.ZZ9,999"
          methodOut.setEdit2(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_22758683,methodOut.getCnt2r().toPlainString().toCharArray()));
//  DISPLAY '* 11* WS-CNT-2R = ' WS-EDIT2
          logger.info("* 11* WS-CNT-2R = {}", new String(methodOut.getEdit2())); 

// *
//  MOVE 0.00 TO WS-CNT-2R
          methodOut.setCnt2r(BigDecimal.valueOf(0.00).setScale(3));
//  ADD 1 , 2 TO WS-CNT-2R
          tempDecimal = methodOut.getCnt2r().add(BigDecimal.ONE).add(BigDecimal.valueOf(2)).setScale(3,RoundingMode.DOWN);
          methodOut.setCnt2r(tempDecimal);
          //
//  MOVE WS-CNT-2R TO WS-EDIT2
//  FORMAT_22758683 = "-ZZZ.ZZ9,999"
          methodOut.setEdit2(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_22758683,methodOut.getCnt2r().toPlainString().toCharArray()));
//  DISPLAY '* 12* WS-CNT-2R = ' WS-EDIT2
          logger.info("* 12* WS-CNT-2R = {}", new String(methodOut.getEdit2())); 

// *
          // MOVE 5 TO TI-N-TOT
          methodOut.setTiNTot(5);
//  MOVE 123 TO TI-N-MAXHEIGHT ( TI-N-TOT )
          methodOut.setTiNMaxheight(methodOut.getTiNTot() - 1,123);
//  MOVE 76248.5732 TO WS-BODY-HEIGHT
          methodOut.setBodyHeight(BigDecimal.valueOf(76248.5732).setScale(4));
//  IF TI-N-MAXHEIGHT ( TI-N-TOT ) < ( WS-BODY-HEIGHT - 5)
          if (( BigDecimal.valueOf(methodOut.getTiNMaxheight(methodOut.getTiNTot() - 1)).compareTo(methodOut.getBodyHeight().subtract(BigDecimal.valueOf(5)).setScale(15,BigDecimal.ROUND_DOWN)) < 0) ) { 
//  SUBTRACT TI-N-MAXHEIGHT ( TI-N-TOT ) FROM WS-BODY-HEIGHT
              tempDecimal = methodOut.getBodyHeight().subtract(BigDecimal.valueOf(methodOut.getTiNMaxheight(methodOut.getTiNTot() - 1))).setScale(4,RoundingMode.DOWN);
              methodOut.setBodyHeight(tempDecimal);
              //
          }
//  ELSE
          else { 
//  ADD TI-N-MAXHEIGHT ( TI-N-TOT ) TO WS-BODY-HEIGHT
              tempDecimal = methodOut.getBodyHeight().add(BigDecimal.valueOf(methodOut.getTiNMaxheight(methodOut.getTiNTot() - 1))).setScale(4,RoundingMode.DOWN);
              methodOut.setBodyHeight(tempDecimal);
              //
          }
//  MOVE WS-BODY-HEIGHT TO WS-BH-DISPLAY
//  FORMAT_56047868 = "-ZZZZ9,9999"
          methodOut.setBhDisplay(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_56047868,methodOut.getBodyHeight().toPlainString().toCharArray()));
//  DISPLAY '* 13* WS-BODY-HEIGHT = ' WS-BH-DISPLAY
          logger.info("* 13* WS-BODY-HEIGHT = {}", new String(methodOut.getBhDisplay())); 

// *
          // MOVE 5 TO TI-N-TOT
          methodOut.setTiNTot(5);
//  MOVE 345 TO TI-N-MAXHEIGHT ( TI-N-TOT )
          methodOut.setTiNMaxheight(methodOut.getTiNTot() - 1,345);
//  MOVE -76248.5732 TO WS-BODY-HEIGHT
          methodOut.setBodyHeight(BigDecimal.valueOf(-76248.5732).setScale(4));
//  IF TI-N-MAXHEIGHT ( TI-N-TOT ) < ( WS-BODY-HEIGHT - 5)
          if (( BigDecimal.valueOf(methodOut.getTiNMaxheight(methodOut.getTiNTot() - 1)).compareTo(methodOut.getBodyHeight().subtract(BigDecimal.valueOf(5)).setScale(15,BigDecimal.ROUND_DOWN)) < 0) ) { 
//  SUBTRACT TI-N-MAXHEIGHT ( TI-N-TOT ) FROM WS-BODY-HEIGHT
              tempDecimal = methodOut.getBodyHeight().subtract(BigDecimal.valueOf(methodOut.getTiNMaxheight(methodOut.getTiNTot() - 1))).setScale(4,RoundingMode.DOWN);
              methodOut.setBodyHeight(tempDecimal);
              //
          }
//  ELSE
          else { 
//  ADD TI-N-MAXHEIGHT ( TI-N-TOT ) TO WS-BODY-HEIGHT
              tempDecimal = methodOut.getBodyHeight().add(BigDecimal.valueOf(methodOut.getTiNMaxheight(methodOut.getTiNTot() - 1))).setScale(4,RoundingMode.DOWN);
              methodOut.setBodyHeight(tempDecimal);
              //
          }
//  MOVE WS-BODY-HEIGHT TO WS-BH-DISPLAY
//  FORMAT_56047868 = "-ZZZZ9,9999"
          methodOut.setBhDisplay(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_56047868,methodOut.getBodyHeight().toPlainString().toCharArray()));
//  DISPLAY '* 14* WS-BODY-HEIGHT = ' WS-BH-DISPLAY
          logger.info("* 14* WS-BODY-HEIGHT = {}", new String(methodOut.getBhDisplay())); 

// *
// *
// * Unsuppoted : cobol puts 1 as integer part & 2+3+4=9
// *              as decimal part and gives 1,9 as the result
// *    move 0,00     to ws-cnt-2r
// *    add  1,2,3,4  to ws-cnt-2r
// *    move ws-cnt-2r to ws-edit2
// *    display '* 13* ws-cnt-2r = ' ws-edit2
// *
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return programCtx.getRc();
       } catch(Exception e) {
            handleErrorCode(e);
            throw e;
       }
      
      // end of process method
      }
  
  
  
  
  
  
  
  
  }
