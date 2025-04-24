  package com.cloudframe.app.process.impl;
  /* 
*---------------------------------------------
*---------------------------------------------
*/
  
  import com.cloudframe.app.comput.ComputCtx.*;
  import com.cloudframe.app.comput.ComputCtx;
  import com.cloudframe.app.process.Comput;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import java.util.Comparator;
  import java.util.stream.Stream;
  import java.math.BigDecimal;
  import java.math.RoundingMode;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.comput.dto.*;
  import com.cloudframe.app.comput.dto.Msp3pprcsIcaNumGroup300;
  import com.cloudframe.app.comput.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("comput")
  
  public class ComputImpl extends CommonProcess implements Comput {
  
  Logger logger = LoggerFactory.getLogger(ComputImpl.class);
  
  
  
  
  
  
  
  
  
  
      /**
      * process 
      * Input  : None 

      * Output :  

      * - coordinatedGeneration          COBOL Name: WS-COORDINATED-GENERATION
      * - reportGen                      COBOL Name: WS-REPORT-GEN
      * - cbsumGen                       COBOL Name: WS-CBSUM-GEN
      * - omsumpvGen                     COBOL Name: WS-OMSUMPV-GEN
      * - omauditGen                     COBOL Name: WS-OMAUDIT-GEN
      * - omencfGen                      COBOL Name: WS-OMENCF-GEN
      * - recsWithoutPrice               COBOL Name: WS-RECS-WITHOUT-PRICE
      * - detailRecs                     COBOL Name: WS-DETAIL-RECS
      * - pctWithNoPrice                 COBOL Name: WS-PCT-WITH-NO-PRICE
      * - pctWoPrice                     COBOL Name: WS-PCT-WO-PRICE
      * - intOfDt1                       COBOL Name: WS-INT-OF-DT-1
      * - hvStartDt81d                   COBOL Name: HV-START-DT8-1D
      * - a                              COBOL Name: A
      * - b                              COBOL Name: B
      * - c                              COBOL Name: C
      * - d                              COBOL Name: D
      * - e                              COBOL Name: E
      * - f                              COBOL Name: F
      * - tb11148AdminAmt                COBOL Name: TB11148-ADMIN-AMT
      * - totAmt                         COBOL Name: WS-TOT-AMT
      * - rlu3aMtnAcAcctChgsCredits      COBOL Name: RLU3A-MTN-AC-ACCT-CHGS-CREDITS
      * - chrgCreditTotNotax             COBOL Name: WS-CHRG-CREDIT-TOT-NOTAX
      * - ccatCombinedSize               COBOL Name: CCAT-COMBINED-SIZE
      * - ccatTitleSize                  COBOL Name: CCAT-TITLE-SIZE
      * - w3v2A                          COBOL Name: W-3V2-A
      * - w3v2                           COBOL Name: W-3V2
      * - w3v2Result                     COBOL Name: W-3V2-RESULT
      * - w5v5A                          COBOL Name: W-5V5-A
      * - w5v5                           COBOL Name: W-5V5
      *
      * @throws CFException
      */
      public int process(ComputCtx programCtx) throws Exception {
			// Declare local variables used in the method
			BigDecimal tempDecimal = BigDecimal.ZERO;
			// End of variable declaration

       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
ProcessInCtx methodIn = programCtx.getProcessInCtx();
ProcessOutCtx methodOut = methodIn.getProcessOutCtx();

// *          -------              -----------
          // MOVE 0 TO WS-COORDINATED-GENERATION
          methodOut.setCoordinatedGeneration(0);
          // MOVE 559 TO WS-REPORT-GEN
          methodOut.setReportGen(559);
          // MOVE 535 TO WS-CBSUM-GEN
          methodOut.setCbsumGen(535);
          // MOVE 584 TO WS-OMSUMPV-GEN
          methodOut.setOmsumpvGen(584);
          // MOVE 543 TO WS-OMAUDIT-GEN
          methodOut.setOmauditGen(543);
          // MOVE 551 TO WS-OMENCF-GEN
          methodOut.setOmencfGen(551);
          methodOut.setCoordinatedGeneration((int)Math.abs(Stream.of(methodOut.getReportGen(),methodOut.getCbsumGen(),methodOut.getOmsumpvGen(),methodOut.getOmauditGen(),methodOut.getOmencfGen()).min(Comparator.comparing(Integer::valueOf)).get() - 1));
//  DISPLAY ' 36. WS-COORDINATED-GENERATION = ' WS-COORDINATED-GENERATION
          logger.info(" 36. WS-COORDINATED-GENERATION = {}", String.valueOf(methodOut.getCoordinatedGeneration())); 

// *          -------              -----------
//  MOVE 48007741 TO WS-RECS-WITHOUT-PRICE
          methodOut.setRecsWithoutPrice((long)48007741);
//  MOVE 53039640 TO WS-DETAIL-RECS
          methodOut.setDetailRecs((long)53039640);
          methodOut.setPctWithNoPrice(BigDecimal.valueOf(methodOut.getRecsWithoutPrice()).multiply(BigDecimal.valueOf(100)).setScale(3,BigDecimal.ROUND_DOWN).divide(BigDecimal.valueOf(methodOut.getDetailRecs()).subtract(BigDecimal.ONE).setScale(3,BigDecimal.ROUND_DOWN),18,RoundingMode.DOWN).setScale(3,BigDecimal.ROUND_DOWN).setScale(2,RoundingMode.HALF_UP));
//  MOVE WS-PCT-WITH-NO-PRICE TO WS-PCT-WO-PRICE
//  FORMAT_1997170837 = "ZZZZZZZ9.99"
          methodOut.setPctWoPrice(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1997170837,methodOut.getPctWithNoPrice().toPlainString().toCharArray()));
//  DISPLAY ' 35. WITHOUT PRICE ' WS-PCT-WO-PRICE
          logger.info(" 35. WITHOUT PRICE {}", new String(methodOut.getPctWoPrice())); 

// *          -------              -----------
//  MOVE 2000 TO WS-INT-OF-DT-1
          methodOut.setIntOfDt1(2000);
          methodOut.setHvStartDt81d((long)Math.abs(CFUtil.dateOfInteger(methodOut.getIntOfDt1())));
//  DISPLAY ' 34. DATE-OF-INTEGER ' HV-START-DT8-1D
          logger.info(" 34. DATE-OF-INTEGER {}", String.valueOf(methodOut.getHvStartDt81d())); 
//  MOVE 0.22 TO A
          methodOut.setA(BigDecimal.valueOf(0.22).setScale(2));
//  MOVE 0.222 TO B
          methodOut.setB(BigDecimal.valueOf(0.222).setScale(3));
//  MOVE 0.22 TO C
          methodOut.setC(BigDecimal.valueOf(0.22).setScale(3));
//  MOVE 0.222 TO D
          methodOut.setD(BigDecimal.valueOf(0.222).setScale(2,RoundingMode.DOWN));
//  MOVE 0.22 TO E
          methodOut.setE(BigDecimal.valueOf(0.22).setScale(2));
          methodOut.setF(methodOut.getA().subtract(methodOut.getB()).add(methodOut.getC()).subtract(methodOut.getD()).add(methodOut.getE()));
//  DISPLAY ' 33. F - A - B + C - D + E    ' F
          logger.info(" 33. F - A - B + C - D + E    {}", String.valueOf(methodOut.getF().movePointRight(2))); 

// *          -------Setup variable-----------
//  MOVE 0.22 TO TB11148-ADMIN-AMT
          methodOut.setTb11148AdminAmt(BigDecimal.valueOf(0.22).setScale(2));
//  MOVE 0.22 TO WS-TOT-AMT
          methodOut.setTotAmt(BigDecimal.valueOf(0.22).setScale(2));
//  MOVE 0.22 TO RLU3A-MTN-AC-ACCT-CHGS-CREDITS
          methodOut.setRlu3aMtnAcAcctChgsCredits(BigDecimal.valueOf(0.22).setScale(2));
//  MOVE 0.22 TO WS-CHRG-CREDIT-TOT-NOTAX
          methodOut.setChrgCreditTotNotax(BigDecimal.valueOf(0.22).setScale(2));

// *          --------End set up variable ---------
//  ADD TB11148-ADMIN-AMT TO WS-TOT-AMT RLU3A-MTN-AC-ACCT-CHGS-CREDITS WS-CHRG-CREDIT-TOT-NOTAX
          tempDecimal = methodOut.getTotAmt().add(methodOut.getTb11148AdminAmt()).setScale(2,RoundingMode.DOWN);
          methodOut.setTotAmt(tempDecimal);
          //
          tempDecimal = methodOut.getRlu3aMtnAcAcctChgsCredits().add(methodOut.getTb11148AdminAmt()).setScale(2,RoundingMode.DOWN);
          methodOut.setRlu3aMtnAcAcctChgsCredits(tempDecimal);
          //
          tempDecimal = methodOut.getChrgCreditTotNotax().add(methodOut.getTb11148AdminAmt()).setScale(2,RoundingMode.DOWN);
          methodOut.setChrgCreditTotNotax(tempDecimal);
          //

// *          --------End -------------------------
//  DISPLAY ' 32. WS-CHRG-CREDIT-TOT-NOTAX ' WS-CHRG-CREDIT-TOT-NOTAX
          logger.info(" 32. WS-CHRG-CREDIT-TOT-NOTAX {}", String.valueOf(methodOut.getChrgCreditTotNotax().movePointRight(2))); 
//  DISPLAY ' 31. RLU3A-MTN-AC-ACCT-CHGS-CREDITS  ' RLU3A-MTN-AC-ACCT-CHGS-CREDITS
          logger.info(" 31. RLU3A-MTN-AC-ACCT-CHGS-CREDITS  {}", String.valueOf(methodOut.getRlu3aMtnAcAcctChgsCredits().movePointRight(2))); 
//  DISPLAY ' 30. WS-TOT-AMT ' WS-TOT-AMT
          logger.info(" 30. WS-TOT-AMT {}", String.valueOf(methodOut.getTotAmt().movePointRight(2))); 

// *
//  MOVE 9 TO CCAT-COMBINED-SIZE
          methodOut.setCcatCombinedSize(9);
//  MOVE 2 TO CCAT-TITLE-SIZE
          methodOut.setCcatTitleSize(2);
//  SUBTRACT 1, CCAT-TITLE-SIZE FROM CCAT-COMBINED-SIZE
          methodOut.setCcatCombinedSize(Math.abs(methodOut.getCcatCombinedSize()-1-methodOut.getCcatTitleSize()));
//  DISPLAY ' 29. CCAT-COMBINED-SIZE ' CCAT-COMBINED-SIZE
          logger.info(" 29. CCAT-COMBINED-SIZE {}", String.valueOf(methodOut.getCcatCombinedSize())); 

// *
// *
          // MOVE 1.24 TO W-3V2-A
          methodOut.setW3v2A(BigDecimal.valueOf(1.24).setScale(2,RoundingMode.DOWN));
          // MOVE 1.22 TO W-3V2
          methodOut.setW3v2(BigDecimal.valueOf(1.22).setScale(2,RoundingMode.DOWN));
          methodOut.setW3v2Result(methodOut.getW3v2A().add(methodOut.getW3v2()));
          if(methodOut.getW3v2Result().signum() < 0 )  methodOut.setW3v2Result(methodOut.getW3v2Result().negate());
//  DISPLAY '28. 1.24   + 1.22  = 2.46           ' W-3V2-RESULT
          logger.info("28. 1.24   + 1.22  = 2.46           {}", String.valueOf(methodOut.getW3v2Result().movePointRight(2))); 

// *
          // MOVE 1.22 TO W-3V2-A
          methodOut.setW3v2A(BigDecimal.valueOf(1.22).setScale(2,RoundingMode.DOWN));
          // MOVE 1.22 TO W-3V2
          methodOut.setW3v2(BigDecimal.valueOf(1.22).setScale(2,RoundingMode.DOWN));
          methodOut.setW3v2Result(methodOut.getW3v2A().add(methodOut.getW3v2()));
          if(methodOut.getW3v2Result().signum() < 0 )  methodOut.setW3v2Result(methodOut.getW3v2Result().negate());
//  DISPLAY '27. 1.22   + 1.22  = 2.44           ' W-3V2-RESULT
          logger.info("27. 1.22   + 1.22  = 2.44           {}", String.valueOf(methodOut.getW3v2Result().movePointRight(2))); 

// *
          // MOVE 0.0009 TO W-5V5-A
          methodOut.setW5v5A(BigDecimal.valueOf(0.0009).setScale(5,RoundingMode.DOWN));
          // MOVE 1.2243 TO W-5V5
          methodOut.setW5v5(BigDecimal.valueOf(1.2243).setScale(5,RoundingMode.DOWN));
          // MOVE 1.22 TO W-3V2
          methodOut.setW3v2(BigDecimal.valueOf(1.22).setScale(2,RoundingMode.DOWN));
          methodOut.setW3v2Result(methodOut.getW5v5().add(methodOut.getW3v2()).add(methodOut.getW5v5A()));
          if(methodOut.getW3v2Result().signum() < 0 )  methodOut.setW3v2Result(methodOut.getW3v2Result().negate());
//  DISPLAY '26. 1.2243 + 1.23 + 0.0009 = 2.4452 ' W-3V2-RESULT
          logger.info("26. 1.2243 + 1.23 + 0.0009 = 2.4452 {}", String.valueOf(methodOut.getW3v2Result().movePointRight(2))); 

// *
          // MOVE 1.2268 TO W-5V5
          methodOut.setW5v5(BigDecimal.valueOf(1.2268).setScale(5,RoundingMode.DOWN));
          // MOVE 1.22 TO W-3V2
          methodOut.setW3v2(BigDecimal.valueOf(1.22).setScale(2,RoundingMode.DOWN));
          methodOut.setW3v2Result(methodOut.getW5v5().add(methodOut.getW3v2()));
          if(methodOut.getW3v2Result().signum() < 0 )  methodOut.setW3v2Result(methodOut.getW3v2Result().negate());
//  PERFORM PROCESS-1
          process1(programCtx);/*PROCESS-1*/
       } catch(Exception e) {
            handleErrorCode(e);
            throw e;
       }
      
       return programCtx.getRc(); // Exit with return code
      // end of process method
      }
      /**
      * process1 
      *   This method is derived from 
  *   COBOL Paragraph - PROCESS-1 COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void process1(ComputCtx programCtx) throws Exception {
//  PERFORM PROCESS-1-SPLIT3
          process1Split3(programCtx.getProcess1Split3InCtx());/*PROCESS-1-SPLIT3*/
//  PERFORM PROCESS-1-SPLIT4
          process1Split4(programCtx);/*PROCESS-1-SPLIT4*/
      
      }
      /**
      * process1Split3 
      *   This method is derived from 
  *   COBOL Paragraph - PROCESS-1-SPLIT3 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - w3v2Result                     COBOL Name: W-3V2-RESULT
      *
      * Output :  

      * - w5v5                           COBOL Name: W-5V5
      * - w3v2                           COBOL Name: W-3V2
      * - w3v2Result                     COBOL Name: W-3V2-RESULT
      * - w3v2A                          COBOL Name: W-3V2-A
      * - w5v5A                          COBOL Name: W-5V5-A
      *
      * @throws CFException
      */
      @Override
      public Process1Split3OutCtx process1Split3(Process1Split3InCtx methodIn) throws Exception {
ComputCtx programCtx = methodIn.getComputCtx();
Process1Split3OutCtx methodOut = methodIn.getProcess1Split3OutCtx();
//  DISPLAY '25. 1.2268 + 1.23 = 2.4468 ' W-3V2-RESULT
          logger.info("25. 1.2268 + 1.23 = 2.4468 {}", String.valueOf(methodOut.getW3v2Result().movePointRight(2))); 

// *
          // MOVE 1.2261 TO W-5V5
          methodOut.setW5v5(BigDecimal.valueOf(1.2261).setScale(5,RoundingMode.DOWN));
          // MOVE 1.22 TO W-3V2
          methodOut.setW3v2(BigDecimal.valueOf(1.22).setScale(2,RoundingMode.DOWN));
          methodOut.setW3v2Result(methodOut.getW5v5().add(methodOut.getW3v2()));
          if(methodOut.getW3v2Result().signum() < 0 )  methodOut.setW3v2Result(methodOut.getW3v2Result().negate());
//  DISPLAY '24. 1.2261 + 1.23 = 2.4461 ' W-3V2-RESULT
          logger.info("24. 1.2261 + 1.23 = 2.4461 {}", String.valueOf(methodOut.getW3v2Result().movePointRight(2))); 

// *
          // MOVE 1.2259 TO W-5V5
          methodOut.setW5v5(BigDecimal.valueOf(1.2259).setScale(5,RoundingMode.DOWN));
          // MOVE 1.22 TO W-3V2
          methodOut.setW3v2(BigDecimal.valueOf(1.22).setScale(2,RoundingMode.DOWN));
          methodOut.setW3v2Result(methodOut.getW5v5().add(methodOut.getW3v2()));
          if(methodOut.getW3v2Result().signum() < 0 )  methodOut.setW3v2Result(methodOut.getW3v2Result().negate());
//  DISPLAY '23. 1.2259 + 1.23 = 2.4459 ' W-3V2-RESULT
          logger.info("23. 1.2259 + 1.23 = 2.4459 {}", String.valueOf(methodOut.getW3v2Result().movePointRight(2))); 

// *
          // MOVE 1.2251 TO W-5V5
          methodOut.setW5v5(BigDecimal.valueOf(1.2251).setScale(5,RoundingMode.DOWN));
          // MOVE 1.22 TO W-3V2
          methodOut.setW3v2(BigDecimal.valueOf(1.22).setScale(2,RoundingMode.DOWN));
          methodOut.setW3v2Result(methodOut.getW5v5().add(methodOut.getW3v2()));
          if(methodOut.getW3v2Result().signum() < 0 )  methodOut.setW3v2Result(methodOut.getW3v2Result().negate());
//  DISPLAY '22. 1.2251 + 1.23 = 2.4451 ' W-3V2-RESULT
          logger.info("22. 1.2251 + 1.23 = 2.4451 {}", String.valueOf(methodOut.getW3v2Result().movePointRight(2))); 

// *
          // MOVE 1.2249 TO W-5V5
          methodOut.setW5v5(BigDecimal.valueOf(1.2249).setScale(5,RoundingMode.DOWN));
          // MOVE 1.22 TO W-3V2
          methodOut.setW3v2(BigDecimal.valueOf(1.22).setScale(2,RoundingMode.DOWN));
          methodOut.setW3v2Result(methodOut.getW5v5().add(methodOut.getW3v2()));
          if(methodOut.getW3v2Result().signum() < 0 )  methodOut.setW3v2Result(methodOut.getW3v2Result().negate());
//  DISPLAY '21. 1.2249 + 1.23 = 2.4449 ' W-3V2-RESULT
          logger.info("21. 1.2249 + 1.23 = 2.4449 {}", String.valueOf(methodOut.getW3v2Result().movePointRight(2))); 

// *
          // MOVE 1.2243 TO W-5V5
          methodOut.setW5v5(BigDecimal.valueOf(1.2243).setScale(5,RoundingMode.DOWN));
          // MOVE 1.22 TO W-3V2
          methodOut.setW3v2(BigDecimal.valueOf(1.22).setScale(2,RoundingMode.DOWN));
          methodOut.setW3v2Result(methodOut.getW5v5().add(methodOut.getW3v2()));
          if(methodOut.getW3v2Result().signum() < 0 )  methodOut.setW3v2Result(methodOut.getW3v2Result().negate());
//  DISPLAY '20. 1.2243 + 1.23 = 2.4443 ' W-3V2-RESULT
          logger.info("20. 1.2243 + 1.23 = 2.4443 {}", String.valueOf(methodOut.getW3v2Result().movePointRight(2))); 

// *
          // MOVE 1.2233 TO W-5V5
          methodOut.setW5v5(BigDecimal.valueOf(1.2233).setScale(5,RoundingMode.DOWN));
          // MOVE 1.22 TO W-3V2
          methodOut.setW3v2(BigDecimal.valueOf(1.22).setScale(2,RoundingMode.DOWN));
          methodOut.setW3v2Result(methodOut.getW5v5().add(methodOut.getW3v2()));
          if(methodOut.getW3v2Result().signum() < 0 )  methodOut.setW3v2Result(methodOut.getW3v2Result().negate());
//  DISPLAY '19. 1.2233 + 1.23 = 2.4433 ' W-3V2-RESULT
          logger.info("19. 1.2233 + 1.23 = 2.4433 {}", String.valueOf(methodOut.getW3v2Result().movePointRight(2))); 

// *
          // MOVE 1.2223 TO W-5V5
          methodOut.setW5v5(BigDecimal.valueOf(1.2223).setScale(5,RoundingMode.DOWN));
          // MOVE 1.22 TO W-3V2
          methodOut.setW3v2(BigDecimal.valueOf(1.22).setScale(2,RoundingMode.DOWN));
          methodOut.setW3v2Result(methodOut.getW5v5().add(methodOut.getW3v2()));
          if(methodOut.getW3v2Result().signum() < 0 )  methodOut.setW3v2Result(methodOut.getW3v2Result().negate());
//  DISPLAY '18. 1.2223 + 1.22 = 2.4423 ' W-3V2-RESULT
          logger.info("18. 1.2223 + 1.22 = 2.4423 {}", String.valueOf(methodOut.getW3v2Result().movePointRight(2))); 

// *
          // MOVE 1.2213 TO W-5V5
          methodOut.setW5v5(BigDecimal.valueOf(1.2213).setScale(5,RoundingMode.DOWN));
          // MOVE 1.22 TO W-3V2
          methodOut.setW3v2(BigDecimal.valueOf(1.22).setScale(2,RoundingMode.DOWN));
          methodOut.setW3v2Result(methodOut.getW5v5().add(methodOut.getW3v2()));
          if(methodOut.getW3v2Result().signum() < 0 )  methodOut.setW3v2Result(methodOut.getW3v2Result().negate());
//  DISPLAY '17. 1.2213 + 1.22 = 2.4413 ' W-3V2-RESULT
          logger.info("17. 1.2213 + 1.22 = 2.4413 {}", String.valueOf(methodOut.getW3v2Result().movePointRight(2))); 

// *   Rounded starts below
          // MOVE 1.24 TO W-3V2-A
          methodOut.setW3v2A(BigDecimal.valueOf(1.24).setScale(2,RoundingMode.DOWN));
          // MOVE 1.22 TO W-3V2
          methodOut.setW3v2(BigDecimal.valueOf(1.22).setScale(2,RoundingMode.DOWN));
          methodOut.setW3v2Result(methodOut.getW3v2A().add(methodOut.getW3v2()).setScale(3,BigDecimal.ROUND_DOWN).setScale(2,RoundingMode.HALF_UP));
          if(methodOut.getW3v2Result().signum() < 0 )  methodOut.setW3v2Result(methodOut.getW3v2Result().negate());
//  DISPLAY '16. 1.24   + 1.22  = 2.46           ' W-3V2-RESULT
          logger.info("16. 1.24   + 1.22  = 2.46           {}", String.valueOf(methodOut.getW3v2Result().movePointRight(2))); 

// *
          // MOVE 1.22 TO W-3V2-A
          methodOut.setW3v2A(BigDecimal.valueOf(1.22).setScale(2,RoundingMode.DOWN));
          // MOVE 1.22 TO W-3V2
          methodOut.setW3v2(BigDecimal.valueOf(1.22).setScale(2,RoundingMode.DOWN));
          methodOut.setW3v2Result(methodOut.getW3v2A().add(methodOut.getW3v2()).setScale(3,BigDecimal.ROUND_DOWN).setScale(2,RoundingMode.HALF_UP));
          if(methodOut.getW3v2Result().signum() < 0 )  methodOut.setW3v2Result(methodOut.getW3v2Result().negate());
//  DISPLAY '15. 1.22   + 1.22  = 2.44           ' W-3V2-RESULT
          logger.info("15. 1.22   + 1.22  = 2.44           {}", String.valueOf(methodOut.getW3v2Result().movePointRight(2))); 

// *
          // MOVE 0.0009 TO W-5V5-A
          methodOut.setW5v5A(BigDecimal.valueOf(0.0009).setScale(5,RoundingMode.DOWN));
          // MOVE 1.2243 TO W-5V5
          methodOut.setW5v5(BigDecimal.valueOf(1.2243).setScale(5,RoundingMode.DOWN));
          // MOVE 1.22 TO W-3V2
          methodOut.setW3v2(BigDecimal.valueOf(1.22).setScale(2,RoundingMode.DOWN));
          methodOut.setW3v2Result(methodOut.getW5v5().add(methodOut.getW3v2()).add(methodOut.getW5v5A()).setScale(2,RoundingMode.HALF_UP));
          if(methodOut.getW3v2Result().signum() < 0 )  methodOut.setW3v2Result(methodOut.getW3v2Result().negate());
//  DISPLAY '14. 1.2243 + 1.23 + 0.0009 = 2.4452 ' W-3V2-RESULT
          logger.info("14. 1.2243 + 1.23 + 0.0009 = 2.4452 {}", String.valueOf(methodOut.getW3v2Result().movePointRight(2))); 

// *
          // MOVE 1.2268 TO W-5V5
          methodOut.setW5v5(BigDecimal.valueOf(1.2268).setScale(5,RoundingMode.DOWN));
          // MOVE 1.22 TO W-3V2
          methodOut.setW3v2(BigDecimal.valueOf(1.22).setScale(2,RoundingMode.DOWN));
          methodOut.setW3v2Result(methodOut.getW5v5().add(methodOut.getW3v2()).setScale(2,RoundingMode.HALF_UP));
          if(methodOut.getW3v2Result().signum() < 0 )  methodOut.setW3v2Result(methodOut.getW3v2Result().negate());
//  DISPLAY '13. 1.2268 + 1.23 = 2.4468 ' W-3V2-RESULT
          logger.info("13. 1.2268 + 1.23 = 2.4468 {}", String.valueOf(methodOut.getW3v2Result().movePointRight(2))); 

// *
          // MOVE 1.2261 TO W-5V5
          methodOut.setW5v5(BigDecimal.valueOf(1.2261).setScale(5,RoundingMode.DOWN));
      
      return methodOut;
      }
      /**
      * process1Split4 
      *   This method is derived from 
  *   COBOL Paragraph - PROCESS-1-SPLIT4 COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void process1Split4(ComputCtx programCtx) throws Exception {
//  PERFORM PROCESS-2
          process2(programCtx);/*PROCESS-2*/
      
      }
      /**
      * process2 
      *   This method is derived from 
  *   COBOL Paragraph - PROCESS-2 COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void process2(ComputCtx programCtx) throws Exception {
//  PERFORM PROCESS-2-SPLIT5
          process2Split5(programCtx.getProcess2Split5InCtx());/*PROCESS-2-SPLIT5*/
//  PERFORM PROCESS-2-SPLIT6
          process2Split6(programCtx);/*PROCESS-2-SPLIT6*/
      
      }
      /**
      * process2Split5 
      *   This method is derived from 
  *   COBOL Paragraph - PROCESS-2-SPLIT5 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - w5v5                           COBOL Name: W-5V5
      *
      * Output :  

      * - w3v2                           COBOL Name: W-3V2
      * - w3v2Result                     COBOL Name: W-3V2-RESULT
      * - w5v5                           COBOL Name: W-5V5
      * - w5                             COBOL Name: W5
      * - w4                             COBOL Name: W4
      * - w2                             COBOL Name: W2
      * - w1                             COBOL Name: W1
      * - w3                             COBOL Name: W3
      * - wcdliCurYyyy                   COBOL Name: WCDLI-CUR-YYYY
      * - wcdloLeapYear                  COBOL Name: WCDLO-LEAP-YEAR
      * - wFeePromoxAmt                  COBOL Name: W-FEE-PROMOX-AMT
      * - pmslk402ListPrice              COBOL Name: PMSLK402-LIST-PRICE
      * - wChgAmtDec5                    COBOL Name: W-CHG-AMT-DEC5
      * - w03a1DiComp3                   COBOL Name: W03A-1-DI-COMP3
      * - w03a1DiComp                    COBOL Name: W03A-1-DI-COMP
      * - w03a1DiDecimal                 COBOL Name: W03A-1-DI-DECIMAL
      * - w03a1DiSmallint                COBOL Name: W03A-1-DI-SMALLINT
      * - w03a1DiInt                     COBOL Name: W03A-1-DI-INT
      * - w03a1DiBigint                  COBOL Name: W03A-1-DI-BIGINT
      * - w03a1DiReal                    COBOL Name: W03A-1-DI-REAL
      * - w03a1DiDouble                  COBOL Name: W03A-1-DI-DOUBLE
      * - w03a1DoComp3                   COBOL Name: W03A-1-DO-COMP3
      * - w03a1DoComp                    COBOL Name: W03A-1-DO-COMP
      * - w03a1DoDecimal                 COBOL Name: W03A-1-DO-DECIMAL
      * - w03a1DoSmallint                COBOL Name: W03A-1-DO-SMALLINT
      *
      * @throws CFException
      */
      @Override
      public Process2Split5OutCtx process2Split5(Process2Split5InCtx methodIn) throws Exception {
ComputCtx programCtx = methodIn.getComputCtx();
Process2Split5OutCtx methodOut = methodIn.getProcess2Split5OutCtx();
          // MOVE 1.22 TO W-3V2
          methodOut.setW3v2(BigDecimal.valueOf(1.22).setScale(2,RoundingMode.DOWN));
          methodOut.setW3v2Result(methodOut.getW5v5().add(methodOut.getW3v2()).setScale(2,RoundingMode.HALF_UP));
          if(methodOut.getW3v2Result().signum() < 0 )  methodOut.setW3v2Result(methodOut.getW3v2Result().negate());
//  DISPLAY '12. 1.2261 + 1.23 = 2.4461 ' W-3V2-RESULT
          logger.info("12. 1.2261 + 1.23 = 2.4461 {}", String.valueOf(methodOut.getW3v2Result().movePointRight(2))); 

// *
          // MOVE 1.2259 TO W-5V5
          methodOut.setW5v5(BigDecimal.valueOf(1.2259).setScale(5,RoundingMode.DOWN));
          // MOVE 1.22 TO W-3V2
          methodOut.setW3v2(BigDecimal.valueOf(1.22).setScale(2,RoundingMode.DOWN));
          methodOut.setW3v2Result(methodOut.getW5v5().add(methodOut.getW3v2()).setScale(2,RoundingMode.HALF_UP));
          if(methodOut.getW3v2Result().signum() < 0 )  methodOut.setW3v2Result(methodOut.getW3v2Result().negate());
//  DISPLAY '11. 1.2259 + 1.23 = 2.4459 ' W-3V2-RESULT
          logger.info("11. 1.2259 + 1.23 = 2.4459 {}", String.valueOf(methodOut.getW3v2Result().movePointRight(2))); 

// *
          // MOVE 1.2251 TO W-5V5
          methodOut.setW5v5(BigDecimal.valueOf(1.2251).setScale(5,RoundingMode.DOWN));
          // MOVE 1.22 TO W-3V2
          methodOut.setW3v2(BigDecimal.valueOf(1.22).setScale(2,RoundingMode.DOWN));
          methodOut.setW3v2Result(methodOut.getW5v5().add(methodOut.getW3v2()).setScale(2,RoundingMode.HALF_UP));
          if(methodOut.getW3v2Result().signum() < 0 )  methodOut.setW3v2Result(methodOut.getW3v2Result().negate());
//  DISPLAY '10. 1.2251 + 1.23 = 2.4451 ' W-3V2-RESULT
          logger.info("10. 1.2251 + 1.23 = 2.4451 {}", String.valueOf(methodOut.getW3v2Result().movePointRight(2))); 

// *
          // MOVE 1.2249 TO W-5V5
          methodOut.setW5v5(BigDecimal.valueOf(1.2249).setScale(5,RoundingMode.DOWN));
          // MOVE 1.22 TO W-3V2
          methodOut.setW3v2(BigDecimal.valueOf(1.22).setScale(2,RoundingMode.DOWN));
          methodOut.setW3v2Result(methodOut.getW5v5().add(methodOut.getW3v2()).setScale(2,RoundingMode.HALF_UP));
          if(methodOut.getW3v2Result().signum() < 0 )  methodOut.setW3v2Result(methodOut.getW3v2Result().negate());
//  DISPLAY '9. 1.2249 + 1.23 = 2.4449 ' W-3V2-RESULT
          logger.info("9. 1.2249 + 1.23 = 2.4449 {}", String.valueOf(methodOut.getW3v2Result().movePointRight(2))); 

// *
          // MOVE 1.2243 TO W-5V5
          methodOut.setW5v5(BigDecimal.valueOf(1.2243).setScale(5,RoundingMode.DOWN));
          // MOVE 1.22 TO W-3V2
          methodOut.setW3v2(BigDecimal.valueOf(1.22).setScale(2,RoundingMode.DOWN));
          methodOut.setW3v2Result(methodOut.getW5v5().add(methodOut.getW3v2()).setScale(2,RoundingMode.HALF_UP));
          if(methodOut.getW3v2Result().signum() < 0 )  methodOut.setW3v2Result(methodOut.getW3v2Result().negate());
//  DISPLAY '8. 1.2243 + 1.23 = 2.4443 ' W-3V2-RESULT
          logger.info("8. 1.2243 + 1.23 = 2.4443 {}", String.valueOf(methodOut.getW3v2Result().movePointRight(2))); 

// *
          // MOVE 1.2233 TO W-5V5
          methodOut.setW5v5(BigDecimal.valueOf(1.2233).setScale(5,RoundingMode.DOWN));
          // MOVE 1.22 TO W-3V2
          methodOut.setW3v2(BigDecimal.valueOf(1.22).setScale(2,RoundingMode.DOWN));
          methodOut.setW3v2Result(methodOut.getW5v5().add(methodOut.getW3v2()).setScale(2,RoundingMode.HALF_UP));
          if(methodOut.getW3v2Result().signum() < 0 )  methodOut.setW3v2Result(methodOut.getW3v2Result().negate());
//  DISPLAY '7. 1.2233 + 1.23 = 2.4433 ' W-3V2-RESULT
          logger.info("7. 1.2233 + 1.23 = 2.4433 {}", String.valueOf(methodOut.getW3v2Result().movePointRight(2))); 

// *
          // MOVE 1.2223 TO W-5V5
          methodOut.setW5v5(BigDecimal.valueOf(1.2223).setScale(5,RoundingMode.DOWN));
          // MOVE 1.22 TO W-3V2
          methodOut.setW3v2(BigDecimal.valueOf(1.22).setScale(2,RoundingMode.DOWN));
          methodOut.setW3v2Result(methodOut.getW5v5().add(methodOut.getW3v2()).setScale(2,RoundingMode.HALF_UP));
          if(methodOut.getW3v2Result().signum() < 0 )  methodOut.setW3v2Result(methodOut.getW3v2Result().negate());
//  DISPLAY '6. 1.2223 + 1.22 = 2.4423 ' W-3V2-RESULT
          logger.info("6. 1.2223 + 1.22 = 2.4423 {}", String.valueOf(methodOut.getW3v2Result().movePointRight(2))); 

// *
          // MOVE 1.2213 TO W-5V5
          methodOut.setW5v5(BigDecimal.valueOf(1.2213).setScale(5,RoundingMode.DOWN));
          // MOVE 1.22 TO W-3V2
          methodOut.setW3v2(BigDecimal.valueOf(1.22).setScale(2,RoundingMode.DOWN));
          methodOut.setW3v2Result(methodOut.getW5v5().add(methodOut.getW3v2()).setScale(2,RoundingMode.HALF_UP));
          if(methodOut.getW3v2Result().signum() < 0 )  methodOut.setW3v2Result(methodOut.getW3v2Result().negate());
//  DISPLAY '5. 1.2213 + 1.22 = 2.4413 ' W-3V2-RESULT
          logger.info("5. 1.2213 + 1.22 = 2.4413 {}", String.valueOf(methodOut.getW3v2Result().movePointRight(2))); 

// *
//  MOVE 2019 TO W5
          methodOut.setW5(2019);
          methodOut.setW4(BigDecimal.valueOf(methodOut.getW5()).divide(BigDecimal.valueOf(4),18,RoundingMode.DOWN).setScale(2,BigDecimal.ROUND_DOWN));
          if(methodOut.getW4().signum() < 0 )  methodOut.setW4(methodOut.getW4().negate());
//  DISPLAY '4. W4              ' W4
          logger.info("4. W4              {}", String.valueOf(methodOut.getW4().movePointRight(2))); 

// *
//  MOVE 123.22 TO W2
          methodOut.setW2(BigDecimal.valueOf(123.22).setScale(2));
//  MOVE -1230.2222 TO W1
          methodOut.setW1(BigDecimal.valueOf(-1230.2222).setScale(4));
          methodOut.setW3(methodOut.getW2().divide(methodOut.getW1(),18,RoundingMode.DOWN).setScale(6,BigDecimal.ROUND_DOWN).setScale(5,RoundingMode.HALF_UP));
//  DISPLAY '3. W3             ' W3
          logger.info("3. W3             {}", String.valueOf(methodOut.getW3().movePointRight(5))); 

// *
          // MOVE 2019 TO WCDLI-CUR-YYYY
          methodOut.setWcdliCurYyyy(2019);
          methodOut.setWcdloLeapYear(BigDecimal.valueOf(methodOut.getWcdliCurYyyy()).divide(BigDecimal.valueOf(4),18,RoundingMode.DOWN).setScale(2,BigDecimal.ROUND_DOWN));
          if(methodOut.getWcdloLeapYear().signum() < 0 )  methodOut.setWcdloLeapYear(methodOut.getWcdloLeapYear().negate());
//  DISPLAY '2. WCDLO-LEAP-YEAR ' WCDLO-LEAP-YEAR
          logger.info("2. WCDLO-LEAP-YEAR {}", String.valueOf(methodOut.getWcdloLeapYear().movePointRight(2))); 

// *
//  MOVE 123.22 TO W-FEE-PROMOX-AMT
          methodOut.setWFeePromoxAmt(BigDecimal.valueOf(123.22).setScale(2));
//  MOVE -1230.2222 TO PMSLK402-LIST-PRICE
          methodOut.setPmslk402ListPrice(BigDecimal.valueOf(-1230.2222).setScale(4));
          methodOut.setWChgAmtDec5(methodOut.getWFeePromoxAmt().divide(methodOut.getPmslk402ListPrice(),18,RoundingMode.DOWN).setScale(6,BigDecimal.ROUND_DOWN).setScale(5,RoundingMode.HALF_UP));
//  DISPLAY '1. W-CHG-AMT-DEC5 ' W-CHG-AMT-DEC5
          logger.info("1. W-CHG-AMT-DEC5 {}", String.valueOf(methodOut.getWChgAmtDec5().movePointRight(5))); 

// *    W03a-1-area-compute.
//  DISPLAY '03 COMPUTE VERB VALIDATION'
          logger.info("03 COMPUTE VERB VALIDATION"); 
//  MOVE -9999 TO W03A-1-DI-COMP3 W03A-1-DI-COMP W03A-1-DI-DECIMAL W03A-1-DI-SMALLINT W03A-1-DI-INT W03A-1-DI-BIGINT W03A-1-DI-REAL W03A-1-DI-DOUBLE
          methodOut.setW03a1DiComp3((long)-9999);
          methodOut.setW03a1DiComp(-9999);
          methodOut.setW03a1DiDecimal(BigDecimal.valueOf(-9999));
          methodOut.setW03a1DiSmallint((short)-9999);
          methodOut.setW03a1DiInt(-9999);
          methodOut.setW03a1DiBigint((long)-9999);
          methodOut.setW03a1DiReal(BigDecimal.valueOf(-9999));
          methodOut.setW03a1DiDouble(BigDecimal.valueOf(-9999));
          methodOut.setW03a1DoComp3( - methodOut.getW03a1DiComp3());
          methodOut.setW03a1DoComp( - methodOut.getW03a1DiComp());
          methodOut.setW03a1DoDecimal(methodOut.getW03a1DiDecimal().negate());
          methodOut.setW03a1DoSmallint((short) ( - methodOut.getW03a1DiSmallint()));
      
      return methodOut;
      }
      /**
      * process2Split6 
      *   This method is derived from 
  *   COBOL Paragraph - PROCESS-2-SPLIT6 COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void process2Split6(ComputCtx programCtx) throws Exception {
//  PERFORM PROCESS-3
          process3(programCtx.getProcess3InCtx());/*PROCESS-3*/
      
      }
      /**
      * process3 
      *   This method is derived from 
  *   COBOL Paragraph - PROCESS-3 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - w03a1DiInt                     COBOL Name: W03A-1-DI-INT
      * - w03a1DiBigint                  COBOL Name: W03A-1-DI-BIGINT
      * - w03a1DiReal                    COBOL Name: W03A-1-DI-REAL
      * - w03a1DiDouble                  COBOL Name: W03A-1-DI-DOUBLE
      * - w03a1DoComp3                   COBOL Name: W03A-1-DO-COMP3
      * - w03a1DoComp                    COBOL Name: W03A-1-DO-COMP
      * - w03a1DoSmallint                COBOL Name: W03A-1-DO-SMALLINT
      * - w03a1DiDecimal                 COBOL Name: W03A-1-DI-DECIMAL
      * - byte7300                       COBOL Name: 300-BYTE-7
      * - byte6300                       COBOL Name: 300-BYTE-6
      * - byte5300                       COBOL Name: 300-BYTE-5
      * - byte4300                       COBOL Name: 300-BYTE-4
      * - byte3300                       COBOL Name: 300-BYTE-3
      * - byte2300                       COBOL Name: 300-BYTE-2
      * - byte1300                       COBOL Name: 300-BYTE-1
      * - byte0300                       COBOL Name: 300-BYTE-0
      *
      * Output :  

      * - w03a1DoInt                     COBOL Name: W03A-1-DO-INT
      * - w03a1DoBigint                  COBOL Name: W03A-1-DO-BIGINT
      * - w03a1DoReal                    COBOL Name: W03A-1-DO-REAL
      * - w03a1DoDouble                  COBOL Name: W03A-1-DO-DOUBLE
      * - w03a1DoDecimal                 COBOL Name: W03A-1-DO-DECIMAL
      * - decimalNo300                   COBOL Name: 300-DECIMAL-NO
      *
      * @throws CFException
      */
      @Override
      public Process3OutCtx process3(Process3InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			boolean truncated = false;
			// End of variable declaration

ComputCtx programCtx = methodIn.getComputCtx();
Process3OutCtx methodOut = methodIn.getProcess3OutCtx();
          methodOut.setW03a1DoInt( - methodIn.getW03a1DiInt());
          methodOut.setW03a1DoBigint( - methodIn.getW03a1DiBigint());
          methodOut.setW03a1DoReal(methodIn.getW03a1DiReal().negate());
          methodOut.setW03a1DoDouble(methodIn.getW03a1DiDouble().negate());
//  DISPLAY ' W03A-1-DO-XXXX     ? 9999'
          logger.info(" W03A-1-DO-XXXX     ? 9999"); 
//  DISPLAY ' W03A-1-DO-COMP3    = ' W03A-1-DO-COMP3
          logger.info(" W03A-1-DO-COMP3    = {}", String.valueOf(methodIn.getW03a1DoComp3())); 
//  DISPLAY ' W03A-1-DO-COMP     = ' W03A-1-DO-COMP
          logger.info(" W03A-1-DO-COMP     = {}", String.valueOf(methodIn.getW03a1DoComp())); 
//  DISPLAY ' W03A-1-DO-SMALLINT = ' W03A-1-DO-SMALLINT
          logger.info(" W03A-1-DO-SMALLINT = {}", String.valueOf(methodIn.getW03a1DoSmallint())); 
//  DISPLAY ' W03A-1-DO-INT      = ' W03A-1-DO-INT
          logger.info(" W03A-1-DO-INT      = {}", String.valueOf(methodOut.getW03a1DoInt())); 
//  DISPLAY ' W03A-1-DO-BIGINT   = ' W03A-1-DO-BIGINT
          logger.info(" W03A-1-DO-BIGINT   = {}", String.valueOf(methodOut.getW03a1DoBigint())); 
//  DISPLAY ' W03A-1-DO-REAL     = ' W03A-1-DO-REAL
          logger.info(" W03A-1-DO-REAL     = {}", new String(methodOut.getW03a1DoReal().toPlainString().toCharArray())); 
//  DISPLAY ' W03A-1-DO-DOUBLE   = ' W03A-1-DO-DOUBLE
          logger.info(" W03A-1-DO-DOUBLE   = {}", new String(methodOut.getW03a1DoDouble().toPlainString().toCharArray())); 
//  DISPLAY '?W03A-1-DO-DECIMAL NOT ON SIZE ERROR'
          logger.info("?W03A-1-DO-DECIMAL NOT ON SIZE ERROR"); 
          methodOut.setW03a1DoDecimal(methodIn.getW03a1DiDecimal().negate().add(BigDecimal.valueOf(1234.12345)).setScale(2,RoundingMode.HALF_UP));
          if (methodIn.getWork().isTruncated() ) { 
//  ON SIZE ERROR
//  DISPLAY ' W03A-1-DO-DECIMAL ON SIZE ERROR'
                        logger.info(" W03A-1-DO-DECIMAL ON SIZE ERROR"); 
          } else  {
//  NOT ON SIZE ERROR
//  PERFORM 1 TIMES
                        for (int index1 = 0; index1 < 1;index1++) {
//  DISPLAY ' W03A-1-DO-DECIMAL NOT ON SIZE ERROR'
                            logger.info(" W03A-1-DO-DECIMAL NOT ON SIZE ERROR"); 
                        }
          }
          //
//  DISPLAY '?W03A-1-DO-DECIMAL ON SIZE ERROR'
          logger.info("?W03A-1-DO-DECIMAL ON SIZE ERROR"); 
          methodOut.setW03a1DoDecimal(methodIn.getW03a1DiDecimal().negate().add(BigDecimal.valueOf(9999234.12345)).setScale(2,RoundingMode.HALF_UP));
          if (methodIn.getWork().isTruncated() ) { 
//  ON SIZE ERROR
//  PERFORM 2 TIMES
                        for (int index1 = 0; index1 < 2;index1++) {
//  DISPLAY ' W03A-1-DO-DECIMAL ON SIZE ERROR'
                            logger.info(" W03A-1-DO-DECIMAL ON SIZE ERROR"); 
                        }
          } else  {
//  NOT ON SIZE ERROR
//  DISPLAY ' W03A-1-DO-DECIMAL NOT ON SIZE ERROR'
                        logger.info(" W03A-1-DO-DECIMAL NOT ON SIZE ERROR"); 
          }
          //
//  DISPLAY 'PROGRAM CFM004A ENDED SUCCESSFULLY'
          logger.info("PROGRAM CFM004A ENDED SUCCESSFULLY"); 
          methodOut.setDecimalNo300((long) (Math.abs( ( methodIn.getByte7300() *  ( 16 * 7 )  )  +  ( methodIn.getByte6300() *  ( 16 * 6 )  )  +  ( methodIn.getByte5300() *  ( 16 * 5 )  )  +  ( methodIn.getByte4300() *  ( 16 * 4 )  )  +  ( methodIn.getByte3300() *  ( 16 * 3 )  )  +  ( methodIn.getByte2300() *  ( 16 * 2 )  )  +  ( methodIn.getByte1300() *  ( 16 * 1 )  )  +  ( methodIn.getByte0300() *  ( 16 * 0 )  ) )));
//  DISPLAY '*37* 300-DECIMAL-NO *' 300-DECIMAL-NO
          logger.info("*37* 300-DECIMAL-NO *{}", String.valueOf(methodOut.getDecimalNo300())); 
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return methodOut;
      
      }
  
  
  
  
  
  
  
  
  }
