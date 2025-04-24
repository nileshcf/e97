  package com.cloudframe.app.process.impl;
  /* 
*this program has the divide test case from the issue program
*
*/
  
  import com.cloudframe.app.divide0.Divide0Ctx.*;
  import com.cloudframe.app.divide0.Divide0Ctx;
  import com.cloudframe.app.process.Divide0;
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
  import com.cloudframe.app.divide0.dto.*;
  import com.cloudframe.app.divide0.dto.BaPrefixVolumeTable;
  import com.cloudframe.app.divide0.dto.DaReportTable;
  import com.cloudframe.app.divide0.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("divide0")
  
  public class Divide0Impl extends CommonProcess implements Divide0 {
  
  Logger logger = LoggerFactory.getLogger(Divide0Impl.class);
  
  
  
  
  
  
  
  
  
  
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      public int process(Divide0Ctx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
          ;
//  PERFORM MAINLINE
          mainline(programCtx);/*MAINLINE*/
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
      * mainline 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE COBOL Cyclomatic complexity - 2
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void mainline(Divide0Ctx programCtx) throws Exception {
      
// *

// *
// * This is a copy of mcissues
// *
//  PERFORM MAINLINE-SPLIT0
          mainlineSplit0(programCtx.getMainlineSplit0InCtx());/*MAINLINE-SPLIT0*/
//  PERFORM MAINLINE-SPLIT1
          mainlineSplit1(programCtx);/*MAINLINE-SPLIT1*/
      
      }
      /**
      * mainlineSplit0 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT0 COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output :  

      * - ip20004ItemLength              COBOL Name: IP20004-ITEM-LENGTH
      * - tmpLth800                      COBOL Name: 800-TMP-LTH
      * - daSub                          COBOL Name: DA-SUB
      * - daIx                           COBOL Name: DA-IX
      * - fbTotalVolume                  COBOL Name: FB-TOTAL-VOLUME
      * - baVolEntry                     COBOL Name: BA-VOL-ENTRY
      * - daPcntHold                     COBOL Name: DA-PCNT-HOLD
      * - daPcntHoldDisp                 COBOL Name: DA-PCNT-HOLD-DISP
      * - daPercent                      COBOL Name: DA-PERCENT
      * - daPercentDisp                  COBOL Name: DA-PERCENT-DISP
      * - editFld1                       COBOL Name: WS-EDIT-FLD1
      * - decimal                        COBOL Name: WS-DECIMAL
      * - editFld2                       COBOL Name: WS-EDIT-FLD2
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit0OutCtx mainlineSplit0(MainlineSplit0InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			BigDecimal tempDecimal = BigDecimal.ZERO;
			// End of variable declaration

Divide0Ctx programCtx = methodIn.getDivide0Ctx();
MainlineSplit0OutCtx methodOut = methodIn.getMainlineSplit0OutCtx();
          // MOVE 5 TO IP20004-ITEM-LENGTH
          methodOut.setIp20004ItemLength((short)5);
//  DISPLAY '* 1*  IP20004-ITEM-LENGTH  = ' IP20004-ITEM-LENGTH
          logger.info("* 1*  IP20004-ITEM-LENGTH  = {}", String.valueOf(methodOut.getIp20004ItemLength())); 

// *
//  DIVIDE IP20004-ITEM-LENGTH BY 2 GIVING IP20004-ITEM-LENGTH REMAINDER 800-TMP-LTH
          methodOut.setTmpLth800( (short) (methodOut.getIp20004ItemLength()%2));
          methodOut.setIp20004ItemLength( (short) (methodOut.getIp20004ItemLength()/2));

// *
//  DISPLAY '* 2*  IP20004-ITEM-LENGTH  = ' IP20004-ITEM-LENGTH
          logger.info("* 2*  IP20004-ITEM-LENGTH  = {}", String.valueOf(methodOut.getIp20004ItemLength())); 
//  DISPLAY '* 3*  800-TMP-LTH          = ' 800-TMP-LTH
          logger.info("* 3*  800-TMP-LTH          = {}", String.valueOf(methodOut.getTmpLth800())); 

// *
          // MOVE 5 TO IP20004-ITEM-LENGTH
          methodOut.setIp20004ItemLength((short)5);
//  DISPLAY '* 4*  IP20004-ITEM-LENGTH  = ' IP20004-ITEM-LENGTH
          logger.info("* 4*  IP20004-ITEM-LENGTH  = {}", String.valueOf(methodOut.getIp20004ItemLength())); 

// *
//  DIVIDE IP20004-ITEM-LENGTH BY 2 GIVING 800-TMP-LTH REMAINDER IP20004-ITEM-LENGTH
          methodOut.setTmpLth800( (short) (methodOut.getIp20004ItemLength()/2));
          methodOut.setIp20004ItemLength( (short) (methodOut.getIp20004ItemLength()%2));

// *
//  DISPLAY '* 5*  IP20004-ITEM-LENGTH  = ' IP20004-ITEM-LENGTH
          logger.info("* 5*  IP20004-ITEM-LENGTH  = {}", String.valueOf(methodOut.getIp20004ItemLength())); 
//  DISPLAY '* 6*  800-TMP-LTH          = ' 800-TMP-LTH
          logger.info("* 6*  800-TMP-LTH          = {}", String.valueOf(methodOut.getTmpLth800())); 

// *
          // MOVE 10 TO DA-SUB DA-IX
          methodOut.setDaSub(10);
          methodOut.setDaIx(10);
          // MOVE 876543210 TO FB-TOTAL-VOLUME
          methodOut.setFbTotalVolume((long)876543210);
//  MOVE 123456789 TO BA-VOL-ENTRY ( DA-IX )
          methodOut.setBaVolEntry(methodOut.getDaIx() - 1,(long)123456789);
//  DIVIDE FB-TOTAL-VOLUME INTO BA-VOL-ENTRY ( DA-IX ) GIVING DA-PCNT-HOLD
          tempDecimal = BigDecimal.valueOf(methodOut.getBaVolEntry(methodOut.getDaIx() - 1)* 1.0/methodOut.getFbTotalVolume());
          methodOut.setDaPcntHold(tempDecimal);
          if(methodOut.getDaPcntHold().signum() < 0 )  methodOut.setDaPcntHold(methodOut.getDaPcntHold().negate());
          //
          // MOVE DA-PCNT-HOLD TO DA-PCNT-HOLD-DISP
          //  FORMAT_59252204 = "ZZZ.ZZZZ"
          methodOut.setDaPcntHoldDisp(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_59252204,methodOut.getDaPcntHold().toPlainString().toCharArray()));
//  DISPLAY '* 7*  DA-PCNT-HOLD         = ' DA-PCNT-HOLD-DISP
          logger.info("* 7*  DA-PCNT-HOLD         = {}", new String(methodOut.getDaPcntHoldDisp())); 
//  MULTIPLY DA-PCNT-HOLD BY 100 GIVING DA-PERCENT ( DA-SUB )
          tempDecimal = methodOut.getDaPcntHold().multiply(BigDecimal.valueOf(100)).setScale(2,RoundingMode.DOWN);
          methodOut.setDaPercent(methodOut.getDaSub() - 1,tempDecimal);
          //
          if(methodOut.getDaPercent(methodOut.getDaSub() - 1).signum() < 0 )  methodOut.setDaPercent(methodOut.getDaSub() - 1,methodOut.getDaPercent(methodOut.getDaSub() - 1).negate());
          //
//  MOVE DA-PERCENT ( DA-SUB ) TO DA-PERCENT-DISP
//  FORMAT_58162092 = "ZZZ.ZZ"
          methodOut.setDaPercentDisp(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_58162092,methodOut.getDaPercent(methodOut.getDaSub() - 1).toPlainString().toCharArray()));
//  DISPLAY '* 8*  DA-PERCENT (DA-SUB)  = ' DA-PERCENT-DISP
          logger.info("* 8*  DA-PERCENT (DA-SUB)  = {}", new String(methodOut.getDaPercentDisp())); 

// *
          // MOVE 11 TO IP20004-ITEM-LENGTH
          methodOut.setIp20004ItemLength((short)11);
//  DIVIDE IP20004-ITEM-LENGTH BY 2 GIVING IP20004-ITEM-LENGTH
          methodOut.setIp20004ItemLength( (short) (methodOut.getIp20004ItemLength()/2));
//  DISPLAY '* 9*  IP20004-ITEM-LENGTH  = ' IP20004-ITEM-LENGTH
          logger.info("* 9*  IP20004-ITEM-LENGTH  = {}", String.valueOf(methodOut.getIp20004ItemLength())); 

// *
          // MOVE 11 TO IP20004-ITEM-LENGTH
          methodOut.setIp20004ItemLength((short)11);
//  DIVIDE IP20004-ITEM-LENGTH BY 8 GIVING IP20004-ITEM-LENGTH ROUNDED
          methodOut.setIp20004ItemLength( (short) (round(methodOut.getIp20004ItemLength()*1.0/8)));
//  DISPLAY '*10*  IP20004-ITEM-LENGTH  = ' IP20004-ITEM-LENGTH
          logger.info("*10*  IP20004-ITEM-LENGTH  = {}", String.valueOf(methodOut.getIp20004ItemLength())); 

// *
          // MOVE 11 TO IP20004-ITEM-LENGTH
          methodOut.setIp20004ItemLength((short)11);
//  DIVIDE IP20004-ITEM-LENGTH BY 8 GIVING IP20004-ITEM-LENGTH
          methodOut.setIp20004ItemLength( (short) (methodOut.getIp20004ItemLength()/8));
//  DISPLAY '*11*  IP20004-ITEM-LENGTH  = ' IP20004-ITEM-LENGTH
          logger.info("*11*  IP20004-ITEM-LENGTH  = {}", String.valueOf(methodOut.getIp20004ItemLength())); 

// *
          // MOVE 11 TO IP20004-ITEM-LENGTH
          methodOut.setIp20004ItemLength((short)11);
//  DIVIDE IP20004-ITEM-LENGTH BY 3 GIVING IP20004-ITEM-LENGTH ROUNDED
          methodOut.setIp20004ItemLength( (short) (round(methodOut.getIp20004ItemLength()*1.0/3)));
//  DISPLAY '*12*  IP20004-ITEM-LENGTH  = ' IP20004-ITEM-LENGTH
          logger.info("*12*  IP20004-ITEM-LENGTH  = {}", String.valueOf(methodOut.getIp20004ItemLength())); 

// *
          // MOVE -13 TO IP20004-ITEM-LENGTH
          methodOut.setIp20004ItemLength((short)-13);
//  DIVIDE IP20004-ITEM-LENGTH BY 2 GIVING IP20004-ITEM-LENGTH
          methodOut.setIp20004ItemLength( (short) (methodOut.getIp20004ItemLength()/2));
//  MOVE IP20004-ITEM-LENGTH TO WS-EDIT-FLD1
//  FORMAT_1453061239 = "-9999"
          methodOut.setEditFld1(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1453061239,String.valueOf(methodOut.getIp20004ItemLength()).toCharArray()));
//  DISPLAY '*13*  IP20004-ITEM-LENGTH  = ' WS-EDIT-FLD1
          logger.info("*13*  IP20004-ITEM-LENGTH  = {}", new String(methodOut.getEditFld1())); 

// *
          // MOVE -13 TO IP20004-ITEM-LENGTH
          methodOut.setIp20004ItemLength((short)-13);
//  DIVIDE IP20004-ITEM-LENGTH BY 2 GIVING IP20004-ITEM-LENGTH ROUNDED
          methodOut.setIp20004ItemLength( (short) (round(methodOut.getIp20004ItemLength()*1.0/2)));
//  MOVE IP20004-ITEM-LENGTH TO WS-EDIT-FLD1
//  FORMAT_1453061239 = "-9999"
          methodOut.setEditFld1(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1453061239,String.valueOf(methodOut.getIp20004ItemLength()).toCharArray()));
//  DISPLAY '*14*  IP20004-ITEM-LENGTH  = ' WS-EDIT-FLD1
          logger.info("*14*  IP20004-ITEM-LENGTH  = {}", new String(methodOut.getEditFld1())); 

// *
          // MOVE -16 TO IP20004-ITEM-LENGTH
          methodOut.setIp20004ItemLength((short)-16);
//  DIVIDE IP20004-ITEM-LENGTH BY 3 GIVING IP20004-ITEM-LENGTH
          methodOut.setIp20004ItemLength( (short) (methodOut.getIp20004ItemLength()/3));
//  MOVE IP20004-ITEM-LENGTH TO WS-EDIT-FLD1
//  FORMAT_1453061239 = "-9999"
          methodOut.setEditFld1(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1453061239,String.valueOf(methodOut.getIp20004ItemLength()).toCharArray()));
//  DISPLAY '*15*  IP20004-ITEM-LENGTH  = ' WS-EDIT-FLD1
          logger.info("*15*  IP20004-ITEM-LENGTH  = {}", new String(methodOut.getEditFld1())); 

// *
          // MOVE -16 TO IP20004-ITEM-LENGTH
          methodOut.setIp20004ItemLength((short)-16);
//  DIVIDE IP20004-ITEM-LENGTH BY 3 GIVING IP20004-ITEM-LENGTH ROUNDED
          methodOut.setIp20004ItemLength( (short) (round(methodOut.getIp20004ItemLength()*1.0/3)));
//  MOVE IP20004-ITEM-LENGTH TO WS-EDIT-FLD1
//  FORMAT_1453061239 = "-9999"
          methodOut.setEditFld1(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1453061239,String.valueOf(methodOut.getIp20004ItemLength()).toCharArray()));
//  DISPLAY '*16*  IP20004-ITEM-LENGTH  = ' WS-EDIT-FLD1
          logger.info("*16*  IP20004-ITEM-LENGTH  = {}", new String(methodOut.getEditFld1())); 

// *
//  MOVE 11.66 TO WS-DECIMAL
          methodOut.setDecimal(BigDecimal.valueOf(11.66).setScale(2));
//  DIVIDE WS-DECIMAL BY 3.4 GIVING WS-DECIMAL
          tempDecimal = methodOut.getDecimal().divide(BigDecimal.valueOf(3.4),2,RoundingMode.DOWN);
          methodOut.setDecimal(tempDecimal);
          //
//  MOVE WS-DECIMAL TO WS-EDIT-FLD2
//  FORMAT_2094898495 = "-99.99"
          methodOut.setEditFld2(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2094898495,methodOut.getDecimal().toPlainString().toCharArray()));
//  DISPLAY '*17*  WS-DECIMAL           = ' WS-EDIT-FLD2
          logger.info("*17*  WS-DECIMAL           = {}", new String(methodOut.getEditFld2())); 
      
      return methodOut;
      }
      /**
      * mainlineSplit1 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT1 COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output :  

      * - decimal                        COBOL Name: WS-DECIMAL
      * - editFld2                       COBOL Name: WS-EDIT-FLD2
      *
      * @throws CFException
      */
      @Override
      public MainlineSplit1OutCtx mainlineSplit1(Divide0Ctx programCtx) throws Exception {
			// Declare local variables used in the method
			BigDecimal tempDecimal = BigDecimal.ZERO;
			// End of variable declaration

MainlineSplit1OutCtx methodOut = programCtx.getMainlineSplit1OutCtx();

// *
//  MOVE 11.66 TO WS-DECIMAL
          methodOut.setDecimal(BigDecimal.valueOf(11.66).setScale(2));
//  DIVIDE WS-DECIMAL BY 3.4 GIVING WS-DECIMAL ROUNDED
          tempDecimal = methodOut.getDecimal().divide(BigDecimal.valueOf(3.4),2,RoundingMode.HALF_UP);
          methodOut.setDecimal(tempDecimal);
          //
//  MOVE WS-DECIMAL TO WS-EDIT-FLD2
//  FORMAT_2094898495 = "-99.99"
          methodOut.setEditFld2(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2094898495,methodOut.getDecimal().toPlainString().toCharArray()));
//  DISPLAY '*18*  WS-DECIMAL           = ' WS-EDIT-FLD2
          logger.info("*18*  WS-DECIMAL           = {}", new String(methodOut.getEditFld2())); 

// *
//  MOVE 12.37 TO WS-DECIMAL
          methodOut.setDecimal(BigDecimal.valueOf(12.37).setScale(2));
//  DIVIDE WS-DECIMAL BY 4.9 GIVING WS-DECIMAL
          tempDecimal = methodOut.getDecimal().divide(BigDecimal.valueOf(4.9),2,RoundingMode.DOWN);
          methodOut.setDecimal(tempDecimal);
          //
//  MOVE WS-DECIMAL TO WS-EDIT-FLD2
//  FORMAT_2094898495 = "-99.99"
          methodOut.setEditFld2(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2094898495,methodOut.getDecimal().toPlainString().toCharArray()));
//  DISPLAY '*19*  WS-DECIMAL           = ' WS-EDIT-FLD2
          logger.info("*19*  WS-DECIMAL           = {}", new String(methodOut.getEditFld2())); 

// *
//  MOVE 12.37 TO WS-DECIMAL
          methodOut.setDecimal(BigDecimal.valueOf(12.37).setScale(2));
//  DIVIDE WS-DECIMAL BY 4.9 GIVING WS-DECIMAL ROUNDED
          tempDecimal = methodOut.getDecimal().divide(BigDecimal.valueOf(4.9),2,RoundingMode.HALF_UP);
          methodOut.setDecimal(tempDecimal);
          //
//  MOVE WS-DECIMAL TO WS-EDIT-FLD2
//  FORMAT_2094898495 = "-99.99"
          methodOut.setEditFld2(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2094898495,methodOut.getDecimal().toPlainString().toCharArray()));
//  DISPLAY '*20*  WS-DECIMAL           = ' WS-EDIT-FLD2
          logger.info("*20*  WS-DECIMAL           = {}", new String(methodOut.getEditFld2())); 

// *
//  MOVE -11.66 TO WS-DECIMAL
          methodOut.setDecimal(BigDecimal.valueOf(-11.66).setScale(2));
//  DIVIDE WS-DECIMAL BY 3.4 GIVING WS-DECIMAL
          tempDecimal = methodOut.getDecimal().divide(BigDecimal.valueOf(3.4),2,RoundingMode.DOWN);
          methodOut.setDecimal(tempDecimal);
          //
//  MOVE WS-DECIMAL TO WS-EDIT-FLD2
//  FORMAT_2094898495 = "-99.99"
          methodOut.setEditFld2(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2094898495,methodOut.getDecimal().toPlainString().toCharArray()));
//  DISPLAY '*21*  WS-DECIMAL           = ' WS-EDIT-FLD2
          logger.info("*21*  WS-DECIMAL           = {}", new String(methodOut.getEditFld2())); 

// *
//  MOVE -11.66 TO WS-DECIMAL
          methodOut.setDecimal(BigDecimal.valueOf(-11.66).setScale(2));
//  DIVIDE WS-DECIMAL BY 3.4 GIVING WS-DECIMAL ROUNDED
          tempDecimal = methodOut.getDecimal().divide(BigDecimal.valueOf(3.4),2,RoundingMode.HALF_UP);
          methodOut.setDecimal(tempDecimal);
          //
//  MOVE WS-DECIMAL TO WS-EDIT-FLD2
//  FORMAT_2094898495 = "-99.99"
          methodOut.setEditFld2(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2094898495,methodOut.getDecimal().toPlainString().toCharArray()));
//  DISPLAY '*22*  WS-DECIMAL           = ' WS-EDIT-FLD2
          logger.info("*22*  WS-DECIMAL           = {}", new String(methodOut.getEditFld2())); 

// *
//  MOVE -12.37 TO WS-DECIMAL
          methodOut.setDecimal(BigDecimal.valueOf(-12.37).setScale(2));
//  DIVIDE WS-DECIMAL BY 4.9 GIVING WS-DECIMAL
          tempDecimal = methodOut.getDecimal().divide(BigDecimal.valueOf(4.9),2,RoundingMode.DOWN);
          methodOut.setDecimal(tempDecimal);
          //
//  MOVE WS-DECIMAL TO WS-EDIT-FLD2
//  FORMAT_2094898495 = "-99.99"
          methodOut.setEditFld2(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2094898495,methodOut.getDecimal().toPlainString().toCharArray()));
//  DISPLAY '*23*  WS-DECIMAL           = ' WS-EDIT-FLD2
          logger.info("*23*  WS-DECIMAL           = {}", new String(methodOut.getEditFld2())); 

// *
//  MOVE -12.37 TO WS-DECIMAL
          methodOut.setDecimal(BigDecimal.valueOf(-12.37).setScale(2));
//  DIVIDE WS-DECIMAL BY 4.9 GIVING WS-DECIMAL ROUNDED
          tempDecimal = methodOut.getDecimal().divide(BigDecimal.valueOf(4.9),2,RoundingMode.HALF_UP);
          methodOut.setDecimal(tempDecimal);
          //
//  MOVE WS-DECIMAL TO WS-EDIT-FLD2
//  FORMAT_2094898495 = "-99.99"
          methodOut.setEditFld2(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2094898495,methodOut.getDecimal().toPlainString().toCharArray()));
//  DISPLAY '*24*  WS-DECIMAL           = ' WS-EDIT-FLD2
          logger.info("*24*  WS-DECIMAL           = {}", new String(methodOut.getEditFld2())); 

// *
//  STOP RUN
          throw Terminate.TERMINATE;
      
      }
  
  
  
  
  
  
  
  
  }
