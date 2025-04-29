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
  import java.math.RoundingMode;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.sh025.dto.*;
  import com.cloudframe.app.sh025.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("sh025")
  
  public class Sh025 extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Sh025.class);
  
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

      * Output : None 

      * @throws CFException
      */
      private void main() throws Exception {
//  PERFORM 0000-MAIN-SPLIT0
          mainSplit0();/*0000-MAIN-SPLIT0*/
//  PERFORM 0000-MAIN-SPLIT1
          mainSplit1();/*0000-MAIN-SPLIT1*/
      
      }
      /**
      * mainSplit0 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAIN-SPLIT0 COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output :  

      * - wvVolExposed                   COBOL Name: WV-VOL-EXPOSED
      * - dealgpalAllocWgtnNum           COBOL Name: DEALGPAL-ALLOC-WGTN-NUM
      * - wvVolExposedEdit               COBOL Name: WV-VOL-EXPOSED-EDIT
      * - pcstlogUsdCostValue            COBOL Name: PCSTLOG-USD-COST-VALUE
      * - wvExtrOUsdValue                COBOL Name: WV-EXTR-O-USD-VALUE
      * - wvExtrOUsdValue2               COBOL Name: WV-EXTR-O-USD-VALUE2
      *
      * @throws CFException
      */
      private void mainSplit0() throws Exception {

// *
//  MOVE 12532.3528 TO WV-VOL-EXPOSED
          work.setWvVolExposed(BigDecimal.valueOf(12532.3528).setScale(4));
//  MOVE 157.3286 TO DEALGPAL-ALLOC-WGTN-NUM
          work.setDealgpalAllocWgtnNum(BigDecimal.valueOf(157.3286).setScale(4));
          work.setWvVolExposed(work.getWvVolExposed().multiply(work.getDealgpalAllocWgtnNum().divide(BigDecimal.valueOf(100),18,RoundingMode.DOWN).setScale(4,BigDecimal.ROUND_DOWN)));
//  MOVE WV-VOL-EXPOSED TO WV-VOL-EXPOSED-EDIT
//  FORMAT_481972414 = "-ZZZZZZZZ9.9999"
          work.setWvVolExposedEdit(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_481972414,work.getWvVolExposed().toPlainString().toCharArray()));
//  DISPLAY WV-VOL-EXPOSED-EDIT
          logger.info(new String(work.getWvVolExposedEdit())); 
          work.setWvVolExposed(work.getWvVolExposed().multiply(work.getDealgpalAllocWgtnNum().divide(BigDecimal.valueOf(100),18,RoundingMode.DOWN).setScale(5,BigDecimal.ROUND_DOWN)).setScale(4,RoundingMode.HALF_UP));
//  MOVE WV-VOL-EXPOSED TO WV-VOL-EXPOSED-EDIT
//  FORMAT_481972414 = "-ZZZZZZZZ9.9999"
          work.setWvVolExposedEdit(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_481972414,work.getWvVolExposed().toPlainString().toCharArray()));
//  DISPLAY WV-VOL-EXPOSED-EDIT
          logger.info(new String(work.getWvVolExposedEdit())); 

// *
//  MOVE 12532.3528 TO WV-VOL-EXPOSED
          work.setWvVolExposed(BigDecimal.valueOf(12532.3528).setScale(4));
//  MOVE 157.9999 TO DEALGPAL-ALLOC-WGTN-NUM
          work.setDealgpalAllocWgtnNum(BigDecimal.valueOf(157.9999).setScale(4));
          work.setWvVolExposed(work.getWvVolExposed().multiply(work.getDealgpalAllocWgtnNum().divide(BigDecimal.valueOf(100),18,RoundingMode.DOWN).setScale(4,BigDecimal.ROUND_DOWN)));
//  MOVE WV-VOL-EXPOSED TO WV-VOL-EXPOSED-EDIT
//  FORMAT_481972414 = "-ZZZZZZZZ9.9999"
          work.setWvVolExposedEdit(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_481972414,work.getWvVolExposed().toPlainString().toCharArray()));
//  DISPLAY WV-VOL-EXPOSED-EDIT
          logger.info(new String(work.getWvVolExposedEdit())); 
          work.setWvVolExposed(work.getWvVolExposed().multiply(work.getDealgpalAllocWgtnNum().divide(BigDecimal.valueOf(100),18,RoundingMode.DOWN).setScale(5,BigDecimal.ROUND_DOWN)).setScale(4,RoundingMode.HALF_UP));
//  MOVE WV-VOL-EXPOSED TO WV-VOL-EXPOSED-EDIT
//  FORMAT_481972414 = "-ZZZZZZZZ9.9999"
          work.setWvVolExposedEdit(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_481972414,work.getWvVolExposed().toPlainString().toCharArray()));
//  DISPLAY WV-VOL-EXPOSED-EDIT
          logger.info(new String(work.getWvVolExposedEdit())); 

// *    End-perform
// *
//  MOVE 1193564.728 TO PCSTLOG-USD-COST-VALUE
          work.setPcstlogUsdCostValue(BigDecimal.valueOf(1193564.728).setScale(4));
//  MOVE 15.9999 TO DEALGPAL-ALLOC-WGTN-NUM
          work.setDealgpalAllocWgtnNum(BigDecimal.valueOf(15.9999).setScale(4));
          work.setWvExtrOUsdValue(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_287469588,(work.getPcstlogUsdCostValue().multiply(work.getDealgpalAllocWgtnNum().divide(BigDecimal.valueOf(100),18,RoundingMode.DOWN).setScale(4,BigDecimal.ROUND_DOWN))).toPlainString()));
//  DISPLAY WV-EXTR-O-USD-VALUE
          logger.info(new String(work.getWvExtrOUsdValue())); 
          work.setWvExtrOUsdValue(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_287469588,(work.getPcstlogUsdCostValue().multiply(work.getDealgpalAllocWgtnNum().divide(BigDecimal.valueOf(100),18,RoundingMode.DOWN).setScale(4,BigDecimal.ROUND_DOWN)).setScale(0,BigDecimal.ROUND_HALF_UP)).toPlainString()));
//  DISPLAY WV-EXTR-O-USD-VALUE
          logger.info(new String(work.getWvExtrOUsdValue())); 

// *
// *
//  MOVE 1193568.9181 TO PCSTLOG-USD-COST-VALUE
          work.setPcstlogUsdCostValue(BigDecimal.valueOf(1193568.9181).setScale(4));
//  MOVE 15.9999 TO DEALGPAL-ALLOC-WGTN-NUM
          work.setDealgpalAllocWgtnNum(BigDecimal.valueOf(15.9999).setScale(4));
          work.setWvExtrOUsdValue(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_287469588,(work.getPcstlogUsdCostValue().multiply(work.getDealgpalAllocWgtnNum().divide(BigDecimal.valueOf(100),18,RoundingMode.DOWN).setScale(4,BigDecimal.ROUND_DOWN))).toPlainString()));
//  DISPLAY WV-EXTR-O-USD-VALUE
          logger.info(new String(work.getWvExtrOUsdValue())); 
          work.setWvExtrOUsdValue(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_287469588,(work.getPcstlogUsdCostValue().multiply(work.getDealgpalAllocWgtnNum().divide(BigDecimal.valueOf(100),18,RoundingMode.DOWN).setScale(4,BigDecimal.ROUND_DOWN)).setScale(0,BigDecimal.ROUND_HALF_UP)).toPlainString()));
//  DISPLAY WV-EXTR-O-USD-VALUE
          logger.info(new String(work.getWvExtrOUsdValue())); 

// *
//  MOVE 1193568.9181 TO PCSTLOG-USD-COST-VALUE
          work.setPcstlogUsdCostValue(BigDecimal.valueOf(1193568.9181).setScale(4));
//  MOVE 15.0311 TO DEALGPAL-ALLOC-WGTN-NUM
          work.setDealgpalAllocWgtnNum(BigDecimal.valueOf(15.0311).setScale(4));
          work.setWvExtrOUsdValue(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_287469588,(work.getPcstlogUsdCostValue().multiply(work.getDealgpalAllocWgtnNum().divide(BigDecimal.valueOf(100),18,RoundingMode.DOWN).setScale(4,BigDecimal.ROUND_DOWN))).toPlainString()));
//  DISPLAY WV-EXTR-O-USD-VALUE
          logger.info(new String(work.getWvExtrOUsdValue())); 
          work.setWvExtrOUsdValue(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_287469588,(work.getPcstlogUsdCostValue().multiply(work.getDealgpalAllocWgtnNum().divide(BigDecimal.valueOf(100),18,RoundingMode.DOWN).setScale(4,BigDecimal.ROUND_DOWN)).setScale(0,BigDecimal.ROUND_HALF_UP)).toPlainString()));
//  DISPLAY WV-EXTR-O-USD-VALUE
          logger.info(new String(work.getWvExtrOUsdValue())); 

// *
//  MOVE 1193564.728 TO PCSTLOG-USD-COST-VALUE
          work.setPcstlogUsdCostValue(BigDecimal.valueOf(1193564.728).setScale(4));
//  MOVE 15.9999 TO DEALGPAL-ALLOC-WGTN-NUM
          work.setDealgpalAllocWgtnNum(BigDecimal.valueOf(15.9999).setScale(4));
          work.setWvExtrOUsdValue2(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1380380457,(work.getPcstlogUsdCostValue().multiply(work.getDealgpalAllocWgtnNum().divide(BigDecimal.valueOf(100),18,RoundingMode.DOWN).setScale(4,BigDecimal.ROUND_DOWN))).toPlainString()));
//  DISPLAY WV-EXTR-O-USD-VALUE2
          logger.info(new String(work.getWvExtrOUsdValue2())); 
          work.setWvExtrOUsdValue2(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1380380457,(work.getPcstlogUsdCostValue().multiply(work.getDealgpalAllocWgtnNum().divide(BigDecimal.valueOf(100),18,RoundingMode.DOWN).setScale(4,BigDecimal.ROUND_DOWN)).setScale(1,BigDecimal.ROUND_HALF_UP)).toPlainString()));
//  DISPLAY WV-EXTR-O-USD-VALUE2
          logger.info(new String(work.getWvExtrOUsdValue2())); 

// *
// *
//  MOVE 1193568.9181 TO PCSTLOG-USD-COST-VALUE
          work.setPcstlogUsdCostValue(BigDecimal.valueOf(1193568.9181).setScale(4));
//  MOVE 15.9999 TO DEALGPAL-ALLOC-WGTN-NUM
          work.setDealgpalAllocWgtnNum(BigDecimal.valueOf(15.9999).setScale(4));
          work.setWvExtrOUsdValue2(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1380380457,(work.getPcstlogUsdCostValue().multiply(work.getDealgpalAllocWgtnNum().divide(BigDecimal.valueOf(100),18,RoundingMode.DOWN).setScale(4,BigDecimal.ROUND_DOWN))).toPlainString()));
//  DISPLAY WV-EXTR-O-USD-VALUE2
          logger.info(new String(work.getWvExtrOUsdValue2())); 
          work.setWvExtrOUsdValue2(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1380380457,(work.getPcstlogUsdCostValue().multiply(work.getDealgpalAllocWgtnNum().divide(BigDecimal.valueOf(100),18,RoundingMode.DOWN).setScale(4,BigDecimal.ROUND_DOWN)).setScale(1,BigDecimal.ROUND_HALF_UP)).toPlainString()));
//  DISPLAY WV-EXTR-O-USD-VALUE2
          logger.info(new String(work.getWvExtrOUsdValue2())); 

// *
//  MOVE 1193568.9181 TO PCSTLOG-USD-COST-VALUE
          work.setPcstlogUsdCostValue(BigDecimal.valueOf(1193568.9181).setScale(4));
//  MOVE 15.0311 TO DEALGPAL-ALLOC-WGTN-NUM
          work.setDealgpalAllocWgtnNum(BigDecimal.valueOf(15.0311).setScale(4));
          work.setWvExtrOUsdValue2(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1380380457,(work.getPcstlogUsdCostValue().multiply(work.getDealgpalAllocWgtnNum().divide(BigDecimal.valueOf(100),18,RoundingMode.DOWN).setScale(4,BigDecimal.ROUND_DOWN))).toPlainString()));
//  DISPLAY WV-EXTR-O-USD-VALUE2
          logger.info(new String(work.getWvExtrOUsdValue2())); 
          work.setWvExtrOUsdValue2(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1380380457,(work.getPcstlogUsdCostValue().multiply(work.getDealgpalAllocWgtnNum().divide(BigDecimal.valueOf(100),18,RoundingMode.DOWN).setScale(4,BigDecimal.ROUND_DOWN)).setScale(1,BigDecimal.ROUND_HALF_UP)).toPlainString()));
      
      }
      /**
      * mainSplit1 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAIN-SPLIT1 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - wvExtrOUsdValue2               COBOL Name: WV-EXTR-O-USD-VALUE2
      *
      * Output : None 

      * @throws CFException
      */
      private void mainSplit1() throws Exception {
//  DISPLAY WV-EXTR-O-USD-VALUE2
          logger.info(new String(work.getWvExtrOUsdValue2())); 

// *
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
