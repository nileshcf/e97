  package com.cloudframe.app.process.impl;
  /* 
*------------------------
*------------------------
*---------------------
*/
  
  import com.cloudframe.app.sh025.Sh025Ctx.*;
  import com.cloudframe.app.sh025.Sh025Ctx;
  import com.cloudframe.app.process.Sh025;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import java.math.BigDecimal;
  import java.math.RoundingMode;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.sh025.dto.*;
  import com.cloudframe.app.sh025.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("sh025")
  
  public class Sh025Impl extends CommonProcess implements Sh025 {
  
  Logger logger = LoggerFactory.getLogger(Sh025Impl.class);
  
  
  
  
  
  
  
  
  
  
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      public int process(Sh025Ctx programCtx) throws Exception {
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

      * Output : None 

      * @throws CFException
      */
      @Override
      public void main(Sh025Ctx programCtx) throws Exception {
//  PERFORM 0000-MAIN-SPLIT0
          mainSplit0(programCtx);/*0000-MAIN-SPLIT0*/
//  PERFORM 0000-MAIN-SPLIT1
          mainSplit1(programCtx.getMainSplit1InCtx());/*0000-MAIN-SPLIT1*/
      
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
      @Override
      public MainSplit0OutCtx mainSplit0(Sh025Ctx programCtx) throws Exception {
MainSplit0OutCtx methodOut = programCtx.getMainSplit0OutCtx();

// *
//  MOVE 12532.3528 TO WV-VOL-EXPOSED
          methodOut.setWvVolExposed(BigDecimal.valueOf(12532.3528).setScale(4));
//  MOVE 157.3286 TO DEALGPAL-ALLOC-WGTN-NUM
          methodOut.setDealgpalAllocWgtnNum(BigDecimal.valueOf(157.3286).setScale(4));
          methodOut.setWvVolExposed(methodOut.getWvVolExposed().multiply(methodOut.getDealgpalAllocWgtnNum().divide(BigDecimal.valueOf(100),18,RoundingMode.DOWN).setScale(4,BigDecimal.ROUND_DOWN)));
//  MOVE WV-VOL-EXPOSED TO WV-VOL-EXPOSED-EDIT
//  FORMAT_481972414 = "-ZZZZZZZZ9.9999"
          methodOut.setWvVolExposedEdit(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_481972414,methodOut.getWvVolExposed().toPlainString().toCharArray()));
//  DISPLAY WV-VOL-EXPOSED-EDIT
          logger.info(new String(methodOut.getWvVolExposedEdit())); 
          methodOut.setWvVolExposed(methodOut.getWvVolExposed().multiply(methodOut.getDealgpalAllocWgtnNum().divide(BigDecimal.valueOf(100),18,RoundingMode.DOWN).setScale(5,BigDecimal.ROUND_DOWN)).setScale(4,RoundingMode.HALF_UP));
//  MOVE WV-VOL-EXPOSED TO WV-VOL-EXPOSED-EDIT
//  FORMAT_481972414 = "-ZZZZZZZZ9.9999"
          methodOut.setWvVolExposedEdit(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_481972414,methodOut.getWvVolExposed().toPlainString().toCharArray()));
//  DISPLAY WV-VOL-EXPOSED-EDIT
          logger.info(new String(methodOut.getWvVolExposedEdit())); 

// *
//  MOVE 12532.3528 TO WV-VOL-EXPOSED
          methodOut.setWvVolExposed(BigDecimal.valueOf(12532.3528).setScale(4));
//  MOVE 157.9999 TO DEALGPAL-ALLOC-WGTN-NUM
          methodOut.setDealgpalAllocWgtnNum(BigDecimal.valueOf(157.9999).setScale(4));
          methodOut.setWvVolExposed(methodOut.getWvVolExposed().multiply(methodOut.getDealgpalAllocWgtnNum().divide(BigDecimal.valueOf(100),18,RoundingMode.DOWN).setScale(4,BigDecimal.ROUND_DOWN)));
//  MOVE WV-VOL-EXPOSED TO WV-VOL-EXPOSED-EDIT
//  FORMAT_481972414 = "-ZZZZZZZZ9.9999"
          methodOut.setWvVolExposedEdit(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_481972414,methodOut.getWvVolExposed().toPlainString().toCharArray()));
//  DISPLAY WV-VOL-EXPOSED-EDIT
          logger.info(new String(methodOut.getWvVolExposedEdit())); 
          methodOut.setWvVolExposed(methodOut.getWvVolExposed().multiply(methodOut.getDealgpalAllocWgtnNum().divide(BigDecimal.valueOf(100),18,RoundingMode.DOWN).setScale(5,BigDecimal.ROUND_DOWN)).setScale(4,RoundingMode.HALF_UP));
//  MOVE WV-VOL-EXPOSED TO WV-VOL-EXPOSED-EDIT
//  FORMAT_481972414 = "-ZZZZZZZZ9.9999"
          methodOut.setWvVolExposedEdit(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_481972414,methodOut.getWvVolExposed().toPlainString().toCharArray()));
//  DISPLAY WV-VOL-EXPOSED-EDIT
          logger.info(new String(methodOut.getWvVolExposedEdit())); 

// *    End-perform
// *
//  MOVE 1193564.728 TO PCSTLOG-USD-COST-VALUE
          methodOut.setPcstlogUsdCostValue(BigDecimal.valueOf(1193564.728).setScale(4));
//  MOVE 15.9999 TO DEALGPAL-ALLOC-WGTN-NUM
          methodOut.setDealgpalAllocWgtnNum(BigDecimal.valueOf(15.9999).setScale(4));
          methodOut.setWvExtrOUsdValue(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_287469588,(methodOut.getPcstlogUsdCostValue().multiply(methodOut.getDealgpalAllocWgtnNum().divide(BigDecimal.valueOf(100),18,RoundingMode.DOWN).setScale(4,BigDecimal.ROUND_DOWN))).toPlainString()));
//  DISPLAY WV-EXTR-O-USD-VALUE
          logger.info(new String(methodOut.getWvExtrOUsdValue())); 
          methodOut.setWvExtrOUsdValue(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_287469588,(methodOut.getPcstlogUsdCostValue().multiply(methodOut.getDealgpalAllocWgtnNum().divide(BigDecimal.valueOf(100),18,RoundingMode.DOWN).setScale(4,BigDecimal.ROUND_DOWN)).setScale(0,BigDecimal.ROUND_HALF_UP)).toPlainString()));
//  DISPLAY WV-EXTR-O-USD-VALUE
          logger.info(new String(methodOut.getWvExtrOUsdValue())); 

// *
// *
//  MOVE 1193568.9181 TO PCSTLOG-USD-COST-VALUE
          methodOut.setPcstlogUsdCostValue(BigDecimal.valueOf(1193568.9181).setScale(4));
//  MOVE 15.9999 TO DEALGPAL-ALLOC-WGTN-NUM
          methodOut.setDealgpalAllocWgtnNum(BigDecimal.valueOf(15.9999).setScale(4));
          methodOut.setWvExtrOUsdValue(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_287469588,(methodOut.getPcstlogUsdCostValue().multiply(methodOut.getDealgpalAllocWgtnNum().divide(BigDecimal.valueOf(100),18,RoundingMode.DOWN).setScale(4,BigDecimal.ROUND_DOWN))).toPlainString()));
//  DISPLAY WV-EXTR-O-USD-VALUE
          logger.info(new String(methodOut.getWvExtrOUsdValue())); 
          methodOut.setWvExtrOUsdValue(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_287469588,(methodOut.getPcstlogUsdCostValue().multiply(methodOut.getDealgpalAllocWgtnNum().divide(BigDecimal.valueOf(100),18,RoundingMode.DOWN).setScale(4,BigDecimal.ROUND_DOWN)).setScale(0,BigDecimal.ROUND_HALF_UP)).toPlainString()));
//  DISPLAY WV-EXTR-O-USD-VALUE
          logger.info(new String(methodOut.getWvExtrOUsdValue())); 

// *
//  MOVE 1193568.9181 TO PCSTLOG-USD-COST-VALUE
          methodOut.setPcstlogUsdCostValue(BigDecimal.valueOf(1193568.9181).setScale(4));
//  MOVE 15.0311 TO DEALGPAL-ALLOC-WGTN-NUM
          methodOut.setDealgpalAllocWgtnNum(BigDecimal.valueOf(15.0311).setScale(4));
          methodOut.setWvExtrOUsdValue(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_287469588,(methodOut.getPcstlogUsdCostValue().multiply(methodOut.getDealgpalAllocWgtnNum().divide(BigDecimal.valueOf(100),18,RoundingMode.DOWN).setScale(4,BigDecimal.ROUND_DOWN))).toPlainString()));
//  DISPLAY WV-EXTR-O-USD-VALUE
          logger.info(new String(methodOut.getWvExtrOUsdValue())); 
          methodOut.setWvExtrOUsdValue(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_287469588,(methodOut.getPcstlogUsdCostValue().multiply(methodOut.getDealgpalAllocWgtnNum().divide(BigDecimal.valueOf(100),18,RoundingMode.DOWN).setScale(4,BigDecimal.ROUND_DOWN)).setScale(0,BigDecimal.ROUND_HALF_UP)).toPlainString()));
//  DISPLAY WV-EXTR-O-USD-VALUE
          logger.info(new String(methodOut.getWvExtrOUsdValue())); 

// *
//  MOVE 1193564.728 TO PCSTLOG-USD-COST-VALUE
          methodOut.setPcstlogUsdCostValue(BigDecimal.valueOf(1193564.728).setScale(4));
//  MOVE 15.9999 TO DEALGPAL-ALLOC-WGTN-NUM
          methodOut.setDealgpalAllocWgtnNum(BigDecimal.valueOf(15.9999).setScale(4));
          methodOut.setWvExtrOUsdValue2(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1380380457,(methodOut.getPcstlogUsdCostValue().multiply(methodOut.getDealgpalAllocWgtnNum().divide(BigDecimal.valueOf(100),18,RoundingMode.DOWN).setScale(4,BigDecimal.ROUND_DOWN))).toPlainString()));
//  DISPLAY WV-EXTR-O-USD-VALUE2
          logger.info(new String(methodOut.getWvExtrOUsdValue2())); 
          methodOut.setWvExtrOUsdValue2(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1380380457,(methodOut.getPcstlogUsdCostValue().multiply(methodOut.getDealgpalAllocWgtnNum().divide(BigDecimal.valueOf(100),18,RoundingMode.DOWN).setScale(4,BigDecimal.ROUND_DOWN)).setScale(1,BigDecimal.ROUND_HALF_UP)).toPlainString()));
//  DISPLAY WV-EXTR-O-USD-VALUE2
          logger.info(new String(methodOut.getWvExtrOUsdValue2())); 

// *
// *
//  MOVE 1193568.9181 TO PCSTLOG-USD-COST-VALUE
          methodOut.setPcstlogUsdCostValue(BigDecimal.valueOf(1193568.9181).setScale(4));
//  MOVE 15.9999 TO DEALGPAL-ALLOC-WGTN-NUM
          methodOut.setDealgpalAllocWgtnNum(BigDecimal.valueOf(15.9999).setScale(4));
          methodOut.setWvExtrOUsdValue2(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1380380457,(methodOut.getPcstlogUsdCostValue().multiply(methodOut.getDealgpalAllocWgtnNum().divide(BigDecimal.valueOf(100),18,RoundingMode.DOWN).setScale(4,BigDecimal.ROUND_DOWN))).toPlainString()));
//  DISPLAY WV-EXTR-O-USD-VALUE2
          logger.info(new String(methodOut.getWvExtrOUsdValue2())); 
          methodOut.setWvExtrOUsdValue2(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1380380457,(methodOut.getPcstlogUsdCostValue().multiply(methodOut.getDealgpalAllocWgtnNum().divide(BigDecimal.valueOf(100),18,RoundingMode.DOWN).setScale(4,BigDecimal.ROUND_DOWN)).setScale(1,BigDecimal.ROUND_HALF_UP)).toPlainString()));
//  DISPLAY WV-EXTR-O-USD-VALUE2
          logger.info(new String(methodOut.getWvExtrOUsdValue2())); 

// *
//  MOVE 1193568.9181 TO PCSTLOG-USD-COST-VALUE
          methodOut.setPcstlogUsdCostValue(BigDecimal.valueOf(1193568.9181).setScale(4));
//  MOVE 15.0311 TO DEALGPAL-ALLOC-WGTN-NUM
          methodOut.setDealgpalAllocWgtnNum(BigDecimal.valueOf(15.0311).setScale(4));
          methodOut.setWvExtrOUsdValue2(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1380380457,(methodOut.getPcstlogUsdCostValue().multiply(methodOut.getDealgpalAllocWgtnNum().divide(BigDecimal.valueOf(100),18,RoundingMode.DOWN).setScale(4,BigDecimal.ROUND_DOWN))).toPlainString()));
//  DISPLAY WV-EXTR-O-USD-VALUE2
          logger.info(new String(methodOut.getWvExtrOUsdValue2())); 
          methodOut.setWvExtrOUsdValue2(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1380380457,(methodOut.getPcstlogUsdCostValue().multiply(methodOut.getDealgpalAllocWgtnNum().divide(BigDecimal.valueOf(100),18,RoundingMode.DOWN).setScale(4,BigDecimal.ROUND_DOWN)).setScale(1,BigDecimal.ROUND_HALF_UP)).toPlainString()));
      
      return methodOut;
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
      @Override
      public void mainSplit1(MainSplit1InCtx methodIn) throws Exception {
Sh025Ctx programCtx = methodIn.getSh025Ctx();
//  DISPLAY WV-EXTR-O-USD-VALUE2
          logger.info(new String(methodIn.getWvExtrOUsdValue2())); 

// *
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return ;
      
      }
  
  
  
  
  
  
  
  
  }
