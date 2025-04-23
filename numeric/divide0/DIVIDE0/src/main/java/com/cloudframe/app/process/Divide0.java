  package com.cloudframe.app.process;
  /* 
*this program has the divide test case from the issue program
*
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
  import com.cloudframe.app.divide0.dto.*;
  import com.cloudframe.app.divide0.dto.BaPrefixVolumeTable;
  import com.cloudframe.app.divide0.dto.DaReportTable;
  import com.cloudframe.app.divide0.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("divide0")
  
  public class Divide0 extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Divide0.class);
  
  private BaPrefixVolumeTable baPrefixVolumeTable = new BaPrefixVolumeTable() ;
  private DaReportTable daReportTable = new DaReportTable() ;
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
//  PERFORM MAINLINE
          mainline();/*MAINLINE*/
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
      * mainline 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE COBOL Cyclomatic complexity - 2
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void mainline() throws Exception {
      
// *

// *
// * This is a copy of mcissues
// *
//  PERFORM MAINLINE-SPLIT0
          mainlineSplit0();/*MAINLINE-SPLIT0*/
//  PERFORM MAINLINE-SPLIT1
          mainlineSplit1();/*MAINLINE-SPLIT1*/
      
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
      private void mainlineSplit0() throws Exception {
			// Declare local variables used in the method
			BigDecimal tempDecimal = BigDecimal.ZERO;
			// End of variable declaration

          // MOVE 5 TO IP20004-ITEM-LENGTH
          work.setIp20004ItemLength((short)5);
//  DISPLAY '* 1*  IP20004-ITEM-LENGTH  = ' IP20004-ITEM-LENGTH
          logger.info("* 1*  IP20004-ITEM-LENGTH  = {}", String.valueOf(work.getIp20004ItemLength())); 

// *
//  DIVIDE IP20004-ITEM-LENGTH BY 2 GIVING IP20004-ITEM-LENGTH REMAINDER 800-TMP-LTH
          work.setTmpLth800( (short) (work.getIp20004ItemLength()%2));
          work.setIp20004ItemLength( (short) (work.getIp20004ItemLength()/2));

// *
//  DISPLAY '* 2*  IP20004-ITEM-LENGTH  = ' IP20004-ITEM-LENGTH
          logger.info("* 2*  IP20004-ITEM-LENGTH  = {}", String.valueOf(work.getIp20004ItemLength())); 
//  DISPLAY '* 3*  800-TMP-LTH          = ' 800-TMP-LTH
          logger.info("* 3*  800-TMP-LTH          = {}", String.valueOf(work.getTmpLth800())); 

// *
          // MOVE 5 TO IP20004-ITEM-LENGTH
          work.setIp20004ItemLength((short)5);
//  DISPLAY '* 4*  IP20004-ITEM-LENGTH  = ' IP20004-ITEM-LENGTH
          logger.info("* 4*  IP20004-ITEM-LENGTH  = {}", String.valueOf(work.getIp20004ItemLength())); 

// *
//  DIVIDE IP20004-ITEM-LENGTH BY 2 GIVING 800-TMP-LTH REMAINDER IP20004-ITEM-LENGTH
          work.setTmpLth800( (short) (work.getIp20004ItemLength()/2));
          work.setIp20004ItemLength( (short) (work.getIp20004ItemLength()%2));

// *
//  DISPLAY '* 5*  IP20004-ITEM-LENGTH  = ' IP20004-ITEM-LENGTH
          logger.info("* 5*  IP20004-ITEM-LENGTH  = {}", String.valueOf(work.getIp20004ItemLength())); 
//  DISPLAY '* 6*  800-TMP-LTH          = ' 800-TMP-LTH
          logger.info("* 6*  800-TMP-LTH          = {}", String.valueOf(work.getTmpLth800())); 

// *
          // MOVE 10 TO DA-SUB DA-IX
          daReportTable.setDaSub(10);
          daReportTable.setDaIx(10);
          // MOVE 876543210 TO FB-TOTAL-VOLUME
          work.setFbTotalVolume((long)876543210);
//  MOVE 123456789 TO BA-VOL-ENTRY ( DA-IX )
          baPrefixVolumeTable.getBaVolumeEntry(daReportTable.getDaIx() - 1).setBaVolEntry((long)123456789);
//  DIVIDE FB-TOTAL-VOLUME INTO BA-VOL-ENTRY ( DA-IX ) GIVING DA-PCNT-HOLD
          tempDecimal = BigDecimal.valueOf(baPrefixVolumeTable.getBaVolumeEntry(daReportTable.getDaIx() - 1).getBaVolEntry()* 1.0/work.getFbTotalVolume());
          daReportTable.setDaPcntHold(tempDecimal);
          if(daReportTable.getDaPcntHold().signum() < 0 )  daReportTable.setDaPcntHold(daReportTable.getDaPcntHold().negate());
          //
          // MOVE DA-PCNT-HOLD TO DA-PCNT-HOLD-DISP
          //  FORMAT_59252204 = "ZZZ.ZZZZ"
          work.setDaPcntHoldDisp(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_59252204,daReportTable.getDaPcntHold().toPlainString().toCharArray()));
//  DISPLAY '* 7*  DA-PCNT-HOLD         = ' DA-PCNT-HOLD-DISP
          logger.info("* 7*  DA-PCNT-HOLD         = {}", new String(work.getDaPcntHoldDisp())); 
//  MULTIPLY DA-PCNT-HOLD BY 100 GIVING DA-PERCENT ( DA-SUB )
          tempDecimal = daReportTable.getDaPcntHold().multiply(BigDecimal.valueOf(100)).setScale(2,RoundingMode.DOWN);
          daReportTable.getDaTblEntries(daReportTable.getDaSub() - 1).setDaPercent(tempDecimal);
          //
          if(daReportTable.getDaTblEntries(daReportTable.getDaSub() - 1).getDaPercent().signum() < 0 )  daReportTable.getDaTblEntries(daReportTable.getDaSub() - 1).setDaPercent(daReportTable.getDaTblEntries(daReportTable.getDaSub() - 1).getDaPercent().negate());
          //
//  MOVE DA-PERCENT ( DA-SUB ) TO DA-PERCENT-DISP
//  FORMAT_58162092 = "ZZZ.ZZ"
          work.setDaPercentDisp(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_58162092,daReportTable.getDaTblEntries(daReportTable.getDaSub() - 1).getDaPercent().toPlainString().toCharArray()));
//  DISPLAY '* 8*  DA-PERCENT (DA-SUB)  = ' DA-PERCENT-DISP
          logger.info("* 8*  DA-PERCENT (DA-SUB)  = {}", new String(work.getDaPercentDisp())); 

// *
          // MOVE 11 TO IP20004-ITEM-LENGTH
          work.setIp20004ItemLength((short)11);
//  DIVIDE IP20004-ITEM-LENGTH BY 2 GIVING IP20004-ITEM-LENGTH
          work.setIp20004ItemLength( (short) (work.getIp20004ItemLength()/2));
//  DISPLAY '* 9*  IP20004-ITEM-LENGTH  = ' IP20004-ITEM-LENGTH
          logger.info("* 9*  IP20004-ITEM-LENGTH  = {}", String.valueOf(work.getIp20004ItemLength())); 

// *
          // MOVE 11 TO IP20004-ITEM-LENGTH
          work.setIp20004ItemLength((short)11);
//  DIVIDE IP20004-ITEM-LENGTH BY 8 GIVING IP20004-ITEM-LENGTH ROUNDED
          work.setIp20004ItemLength( (short) (round(work.getIp20004ItemLength()*1.0/8)));
//  DISPLAY '*10*  IP20004-ITEM-LENGTH  = ' IP20004-ITEM-LENGTH
          logger.info("*10*  IP20004-ITEM-LENGTH  = {}", String.valueOf(work.getIp20004ItemLength())); 

// *
          // MOVE 11 TO IP20004-ITEM-LENGTH
          work.setIp20004ItemLength((short)11);
//  DIVIDE IP20004-ITEM-LENGTH BY 8 GIVING IP20004-ITEM-LENGTH
          work.setIp20004ItemLength( (short) (work.getIp20004ItemLength()/8));
//  DISPLAY '*11*  IP20004-ITEM-LENGTH  = ' IP20004-ITEM-LENGTH
          logger.info("*11*  IP20004-ITEM-LENGTH  = {}", String.valueOf(work.getIp20004ItemLength())); 

// *
          // MOVE 11 TO IP20004-ITEM-LENGTH
          work.setIp20004ItemLength((short)11);
//  DIVIDE IP20004-ITEM-LENGTH BY 3 GIVING IP20004-ITEM-LENGTH ROUNDED
          work.setIp20004ItemLength( (short) (round(work.getIp20004ItemLength()*1.0/3)));
//  DISPLAY '*12*  IP20004-ITEM-LENGTH  = ' IP20004-ITEM-LENGTH
          logger.info("*12*  IP20004-ITEM-LENGTH  = {}", String.valueOf(work.getIp20004ItemLength())); 

// *
          // MOVE -13 TO IP20004-ITEM-LENGTH
          work.setIp20004ItemLength((short)-13);
//  DIVIDE IP20004-ITEM-LENGTH BY 2 GIVING IP20004-ITEM-LENGTH
          work.setIp20004ItemLength( (short) (work.getIp20004ItemLength()/2));
//  MOVE IP20004-ITEM-LENGTH TO WS-EDIT-FLD1
//  FORMAT_1453061239 = "-9999"
          work.setEditFld1(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1453061239,String.valueOf(work.getIp20004ItemLength()).toCharArray()));
//  DISPLAY '*13*  IP20004-ITEM-LENGTH  = ' WS-EDIT-FLD1
          logger.info("*13*  IP20004-ITEM-LENGTH  = {}", new String(work.getEditFld1())); 

// *
          // MOVE -13 TO IP20004-ITEM-LENGTH
          work.setIp20004ItemLength((short)-13);
//  DIVIDE IP20004-ITEM-LENGTH BY 2 GIVING IP20004-ITEM-LENGTH ROUNDED
          work.setIp20004ItemLength( (short) (round(work.getIp20004ItemLength()*1.0/2)));
//  MOVE IP20004-ITEM-LENGTH TO WS-EDIT-FLD1
//  FORMAT_1453061239 = "-9999"
          work.setEditFld1(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1453061239,String.valueOf(work.getIp20004ItemLength()).toCharArray()));
//  DISPLAY '*14*  IP20004-ITEM-LENGTH  = ' WS-EDIT-FLD1
          logger.info("*14*  IP20004-ITEM-LENGTH  = {}", new String(work.getEditFld1())); 

// *
          // MOVE -16 TO IP20004-ITEM-LENGTH
          work.setIp20004ItemLength((short)-16);
//  DIVIDE IP20004-ITEM-LENGTH BY 3 GIVING IP20004-ITEM-LENGTH
          work.setIp20004ItemLength( (short) (work.getIp20004ItemLength()/3));
//  MOVE IP20004-ITEM-LENGTH TO WS-EDIT-FLD1
//  FORMAT_1453061239 = "-9999"
          work.setEditFld1(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1453061239,String.valueOf(work.getIp20004ItemLength()).toCharArray()));
//  DISPLAY '*15*  IP20004-ITEM-LENGTH  = ' WS-EDIT-FLD1
          logger.info("*15*  IP20004-ITEM-LENGTH  = {}", new String(work.getEditFld1())); 

// *
          // MOVE -16 TO IP20004-ITEM-LENGTH
          work.setIp20004ItemLength((short)-16);
//  DIVIDE IP20004-ITEM-LENGTH BY 3 GIVING IP20004-ITEM-LENGTH ROUNDED
          work.setIp20004ItemLength( (short) (round(work.getIp20004ItemLength()*1.0/3)));
//  MOVE IP20004-ITEM-LENGTH TO WS-EDIT-FLD1
//  FORMAT_1453061239 = "-9999"
          work.setEditFld1(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1453061239,String.valueOf(work.getIp20004ItemLength()).toCharArray()));
//  DISPLAY '*16*  IP20004-ITEM-LENGTH  = ' WS-EDIT-FLD1
          logger.info("*16*  IP20004-ITEM-LENGTH  = {}", new String(work.getEditFld1())); 

// *
//  MOVE 11.66 TO WS-DECIMAL
          work.setDecimal(BigDecimal.valueOf(11.66).setScale(2));
//  DIVIDE WS-DECIMAL BY 3.4 GIVING WS-DECIMAL
          tempDecimal = work.getDecimal().divide(BigDecimal.valueOf(3.4),2,RoundingMode.DOWN);
          work.setDecimal(tempDecimal);
          //
//  MOVE WS-DECIMAL TO WS-EDIT-FLD2
//  FORMAT_2094898495 = "-99.99"
          work.setEditFld2(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2094898495,work.getDecimal().toPlainString().toCharArray()));
//  DISPLAY '*17*  WS-DECIMAL           = ' WS-EDIT-FLD2
          logger.info("*17*  WS-DECIMAL           = {}", new String(work.getEditFld2())); 
      
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
      private void mainlineSplit1() throws Exception {
			// Declare local variables used in the method
			BigDecimal tempDecimal = BigDecimal.ZERO;
			// End of variable declaration


// *
//  MOVE 11.66 TO WS-DECIMAL
          work.setDecimal(BigDecimal.valueOf(11.66).setScale(2));
//  DIVIDE WS-DECIMAL BY 3.4 GIVING WS-DECIMAL ROUNDED
          tempDecimal = work.getDecimal().divide(BigDecimal.valueOf(3.4),2,RoundingMode.HALF_UP);
          work.setDecimal(tempDecimal);
          //
//  MOVE WS-DECIMAL TO WS-EDIT-FLD2
//  FORMAT_2094898495 = "-99.99"
          work.setEditFld2(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2094898495,work.getDecimal().toPlainString().toCharArray()));
//  DISPLAY '*18*  WS-DECIMAL           = ' WS-EDIT-FLD2
          logger.info("*18*  WS-DECIMAL           = {}", new String(work.getEditFld2())); 

// *
//  MOVE 12.37 TO WS-DECIMAL
          work.setDecimal(BigDecimal.valueOf(12.37).setScale(2));
//  DIVIDE WS-DECIMAL BY 4.9 GIVING WS-DECIMAL
          tempDecimal = work.getDecimal().divide(BigDecimal.valueOf(4.9),2,RoundingMode.DOWN);
          work.setDecimal(tempDecimal);
          //
//  MOVE WS-DECIMAL TO WS-EDIT-FLD2
//  FORMAT_2094898495 = "-99.99"
          work.setEditFld2(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2094898495,work.getDecimal().toPlainString().toCharArray()));
//  DISPLAY '*19*  WS-DECIMAL           = ' WS-EDIT-FLD2
          logger.info("*19*  WS-DECIMAL           = {}", new String(work.getEditFld2())); 

// *
//  MOVE 12.37 TO WS-DECIMAL
          work.setDecimal(BigDecimal.valueOf(12.37).setScale(2));
//  DIVIDE WS-DECIMAL BY 4.9 GIVING WS-DECIMAL ROUNDED
          tempDecimal = work.getDecimal().divide(BigDecimal.valueOf(4.9),2,RoundingMode.HALF_UP);
          work.setDecimal(tempDecimal);
          //
//  MOVE WS-DECIMAL TO WS-EDIT-FLD2
//  FORMAT_2094898495 = "-99.99"
          work.setEditFld2(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2094898495,work.getDecimal().toPlainString().toCharArray()));
//  DISPLAY '*20*  WS-DECIMAL           = ' WS-EDIT-FLD2
          logger.info("*20*  WS-DECIMAL           = {}", new String(work.getEditFld2())); 

// *
//  MOVE -11.66 TO WS-DECIMAL
          work.setDecimal(BigDecimal.valueOf(-11.66).setScale(2));
//  DIVIDE WS-DECIMAL BY 3.4 GIVING WS-DECIMAL
          tempDecimal = work.getDecimal().divide(BigDecimal.valueOf(3.4),2,RoundingMode.DOWN);
          work.setDecimal(tempDecimal);
          //
//  MOVE WS-DECIMAL TO WS-EDIT-FLD2
//  FORMAT_2094898495 = "-99.99"
          work.setEditFld2(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2094898495,work.getDecimal().toPlainString().toCharArray()));
//  DISPLAY '*21*  WS-DECIMAL           = ' WS-EDIT-FLD2
          logger.info("*21*  WS-DECIMAL           = {}", new String(work.getEditFld2())); 

// *
//  MOVE -11.66 TO WS-DECIMAL
          work.setDecimal(BigDecimal.valueOf(-11.66).setScale(2));
//  DIVIDE WS-DECIMAL BY 3.4 GIVING WS-DECIMAL ROUNDED
          tempDecimal = work.getDecimal().divide(BigDecimal.valueOf(3.4),2,RoundingMode.HALF_UP);
          work.setDecimal(tempDecimal);
          //
//  MOVE WS-DECIMAL TO WS-EDIT-FLD2
//  FORMAT_2094898495 = "-99.99"
          work.setEditFld2(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2094898495,work.getDecimal().toPlainString().toCharArray()));
//  DISPLAY '*22*  WS-DECIMAL           = ' WS-EDIT-FLD2
          logger.info("*22*  WS-DECIMAL           = {}", new String(work.getEditFld2())); 

// *
//  MOVE -12.37 TO WS-DECIMAL
          work.setDecimal(BigDecimal.valueOf(-12.37).setScale(2));
//  DIVIDE WS-DECIMAL BY 4.9 GIVING WS-DECIMAL
          tempDecimal = work.getDecimal().divide(BigDecimal.valueOf(4.9),2,RoundingMode.DOWN);
          work.setDecimal(tempDecimal);
          //
//  MOVE WS-DECIMAL TO WS-EDIT-FLD2
//  FORMAT_2094898495 = "-99.99"
          work.setEditFld2(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2094898495,work.getDecimal().toPlainString().toCharArray()));
//  DISPLAY '*23*  WS-DECIMAL           = ' WS-EDIT-FLD2
          logger.info("*23*  WS-DECIMAL           = {}", new String(work.getEditFld2())); 

// *
//  MOVE -12.37 TO WS-DECIMAL
          work.setDecimal(BigDecimal.valueOf(-12.37).setScale(2));
//  DIVIDE WS-DECIMAL BY 4.9 GIVING WS-DECIMAL ROUNDED
          tempDecimal = work.getDecimal().divide(BigDecimal.valueOf(4.9),2,RoundingMode.HALF_UP);
          work.setDecimal(tempDecimal);
          //
//  MOVE WS-DECIMAL TO WS-EDIT-FLD2
//  FORMAT_2094898495 = "-99.99"
          work.setEditFld2(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_2094898495,work.getDecimal().toPlainString().toCharArray()));
//  DISPLAY '*24*  WS-DECIMAL           = ' WS-EDIT-FLD2
          logger.info("*24*  WS-DECIMAL           = {}", new String(work.getEditFld2())); 

// *
//  STOP RUN
          throw Terminate.TERMINATE;
      
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
