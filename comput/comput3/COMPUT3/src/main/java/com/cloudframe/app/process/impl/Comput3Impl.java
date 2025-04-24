  package com.cloudframe.app.process.impl;
  /* 
* this listing was added for sup-368 & cffix-109
*/
  
  import com.cloudframe.app.comput3.Comput3Ctx.*;
  import com.cloudframe.app.comput3.Comput3Ctx;
  import com.cloudframe.app.process.Comput3;
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
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.comput3.dto.*;
  import com.cloudframe.app.comput3.dto.WcStandardVolumesGroup;
  import com.cloudframe.app.comput3.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.utility.CFUtil;
  
  @Component("comput3")
  
  public class Comput3Impl extends CommonProcess implements Comput3 {
  
  Logger logger = LoggerFactory.getLogger(Comput3Impl.class);
  
  
  
  
  
  
  
  
  
  
      /**
      * process 
      * Input  :  

      * - wcVolumes                      COBOL Name: WC-VOLUMES
      *
      * Output :  

      * - dexr001SourceQty               COBOL Name: DEXR001-SOURCE-QTY
      * - wvWorkingQty                   COBOL Name: WV-WORKING-QTY
      * - wvSourceScale                  COBOL Name: WV-SOURCE-SCALE
      * - wvSourceSub                    COBOL Name: WV-SOURCE-SUB
      * - wvTargetSub                    COBOL Name: WV-TARGET-SUB
      * - wvTempVolume                   COBOL Name: WV-TEMP-VOLUME
      * - wvUnsignedVolume               COBOL Name: WV-UNSIGNED-VOLUME
      * - dexr001TargetQty               COBOL Name: DEXR001-TARGET-QTY
      *
      * @throws CFException
      */
      public int process(Comput3Ctx programCtx) throws Exception {
			// Declare local variables used in the method
			BigDecimal tempDecimal = BigDecimal.ZERO;
			// End of variable declaration

       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
ProcessInCtx methodIn = programCtx.getProcessInCtx();
ProcessOutCtx methodOut = methodIn.getProcessOutCtx();

// *
//  DISPLAY '-----------------------'
          logger.info("-----------------------"); 
//  MOVE 123456789.1234 TO DEXR001-SOURCE-QTY
          methodOut.setDexr001SourceQty(BigDecimal.valueOf(123456789.1234).setScale(4));
//  MOVE DEXR001-SOURCE-QTY TO WV-WORKING-QTY
          methodOut.setWvWorkingQty(methodOut.getDexr001SourceQty());
//  MOVE 1000000 TO WV-SOURCE-SCALE
          methodOut.setWvSourceScale((long)1000000);
          // MOVE 7 TO WV-SOURCE-SUB
          methodOut.setWvSourceSub((short)7);
          // MOVE 10 TO WV-TARGET-SUB
          methodOut.setWvTargetSub((short)10);
//  SUBTRACT 6 FROM WV-SOURCE-SUB
          methodOut.setWvSourceSub( (short) (methodOut.getWvSourceSub()-(short)6));
//  SUBTRACT 6 FROM WV-TARGET-SUB
          methodOut.setWvTargetSub( (short) (methodOut.getWvTargetSub()-(short)6));
          methodOut.setWvTempVolume(methodIn.getWcVolumes(methodOut.getWvSourceSub() - 1,methodOut.getWvTargetSub() - 1).divide(BigDecimal.valueOf(methodOut.getWvSourceScale()),18,RoundingMode.DOWN));
//  DISPLAY 'WV-TEMP-VOLUME *D* = ' WV-TEMP-VOLUME
          logger.info("WV-TEMP-VOLUME *D* = {}", new String(methodOut.getWvTempVolume().toPlainString().toCharArray())); 
          methodOut.setWvTempVolume(methodIn.getWcVolumes(methodOut.getWvSourceSub() - 1,methodOut.getWvTargetSub() - 1).divide(BigDecimal.valueOf(methodOut.getWvSourceScale()),18,RoundingMode.DOWN).multiply(methodOut.getWvWorkingQty()));
//  DISPLAY 'WV-TEMP-VOLUME *F* = ' WV-TEMP-VOLUME
          logger.info("WV-TEMP-VOLUME *F* = {}", new String(methodOut.getWvTempVolume().toPlainString().toCharArray())); 
//  MOVE WV-TEMP-VOLUME TO WV-UNSIGNED-VOLUME
          methodOut.setWvUnsignedVolume(methodOut.getWvTempVolume().setScale(5,RoundingMode.HALF_DOWN));
//  DISPLAY 'WV-UNSIGNED-VOLUME = ' WV-UNSIGNED-VOLUME
          logger.info("WV-UNSIGNED-VOLUME = {}", String.valueOf(methodOut.getWvUnsignedVolume().movePointRight(5))); 
//  MULTIPLY WV-UNSIGNED-VOLUME BY +1 GIVING DEXR001-TARGET-QTY
          tempDecimal = methodOut.getWvUnsignedVolume().multiply(BigDecimal.ONE).setScale(4,RoundingMode.DOWN);
          methodOut.setDexr001TargetQty(tempDecimal);
          //
          //

// *

// *
//  DISPLAY 'DEXR001-TARGET-QTY = ' DEXR001-TARGET-QTY
          logger.info("DEXR001-TARGET-QTY = {}", String.valueOf(methodOut.getDexr001TargetQty().movePointRight(4))); 
//  DISPLAY '-----------------------'
          logger.info("-----------------------"); 
//  MOVE 90000 TO DEXR001-SOURCE-QTY
          methodOut.setDexr001SourceQty(BigDecimal.valueOf(90000));
//  MOVE DEXR001-SOURCE-QTY TO WV-WORKING-QTY
          methodOut.setWvWorkingQty(methodOut.getDexr001SourceQty());
//  MOVE 1000000 TO WV-SOURCE-SCALE
          methodOut.setWvSourceScale((long)1000000);
          // MOVE 7 TO WV-SOURCE-SUB
          methodOut.setWvSourceSub((short)7);
          // MOVE 10 TO WV-TARGET-SUB
          methodOut.setWvTargetSub((short)10);
//  SUBTRACT 6 FROM WV-SOURCE-SUB
          methodOut.setWvSourceSub( (short) (methodOut.getWvSourceSub()-(short)6));
//  SUBTRACT 6 FROM WV-TARGET-SUB
          methodOut.setWvTargetSub( (short) (methodOut.getWvTargetSub()-(short)6));
          methodOut.setWvTempVolume(methodIn.getWcVolumes(methodOut.getWvSourceSub() - 1,methodOut.getWvTargetSub() - 1).divide(BigDecimal.valueOf(methodOut.getWvSourceScale()),18,RoundingMode.DOWN));
//  DISPLAY 'WV-TEMP-VOLUME *D* = ' WV-TEMP-VOLUME
          logger.info("WV-TEMP-VOLUME *D* = {}", new String(methodOut.getWvTempVolume().toPlainString().toCharArray())); 
          methodOut.setWvTempVolume(methodIn.getWcVolumes(methodOut.getWvSourceSub() - 1,methodOut.getWvTargetSub() - 1).divide(BigDecimal.valueOf(methodOut.getWvSourceScale()),18,RoundingMode.DOWN).multiply(methodOut.getWvWorkingQty()));
//  DISPLAY 'WV-TEMP-VOLUME *F* = ' WV-TEMP-VOLUME
          logger.info("WV-TEMP-VOLUME *F* = {}", new String(methodOut.getWvTempVolume().toPlainString().toCharArray())); 
//  MOVE WV-TEMP-VOLUME TO WV-UNSIGNED-VOLUME
          methodOut.setWvUnsignedVolume(methodOut.getWvTempVolume().setScale(5,RoundingMode.HALF_DOWN));
//  DISPLAY 'WV-UNSIGNED-VOLUME = ' WV-UNSIGNED-VOLUME
          logger.info("WV-UNSIGNED-VOLUME = {}", String.valueOf(methodOut.getWvUnsignedVolume().movePointRight(5))); 
//  MULTIPLY WV-UNSIGNED-VOLUME BY +1 GIVING DEXR001-TARGET-QTY
          tempDecimal = methodOut.getWvUnsignedVolume().multiply(BigDecimal.ONE).setScale(4,RoundingMode.DOWN);
          methodOut.setDexr001TargetQty(tempDecimal);
          //
          //

// *

// *
// *
//  DISPLAY 'DEXR001-TARGET-QTY = ' DEXR001-TARGET-QTY
          logger.info("DEXR001-TARGET-QTY = {}", String.valueOf(methodOut.getDexr001TargetQty().movePointRight(4))); 
//  DISPLAY '-----------------------'
          logger.info("-----------------------"); 
//  MOVE 314550 TO DEXR001-SOURCE-QTY
          methodOut.setDexr001SourceQty(BigDecimal.valueOf(314550));
//  MOVE DEXR001-SOURCE-QTY TO WV-WORKING-QTY
          methodOut.setWvWorkingQty(methodOut.getDexr001SourceQty());
//  MOVE 1000000 TO WV-SOURCE-SCALE
          methodOut.setWvSourceScale((long)1000000);
          // MOVE 7 TO WV-SOURCE-SUB
          methodOut.setWvSourceSub((short)7);
          // MOVE 10 TO WV-TARGET-SUB
          methodOut.setWvTargetSub((short)10);
//  SUBTRACT 6 FROM WV-SOURCE-SUB
          methodOut.setWvSourceSub( (short) (methodOut.getWvSourceSub()-(short)6));
//  SUBTRACT 6 FROM WV-TARGET-SUB
          methodOut.setWvTargetSub( (short) (methodOut.getWvTargetSub()-(short)6));
          methodOut.setWvTempVolume(methodIn.getWcVolumes(methodOut.getWvSourceSub() - 1,methodOut.getWvTargetSub() - 1).divide(BigDecimal.valueOf(methodOut.getWvSourceScale()),18,RoundingMode.DOWN));
//  DISPLAY 'WV-TEMP-VOLUME *D* = ' WV-TEMP-VOLUME
          logger.info("WV-TEMP-VOLUME *D* = {}", new String(methodOut.getWvTempVolume().toPlainString().toCharArray())); 
          methodOut.setWvTempVolume(methodIn.getWcVolumes(methodOut.getWvSourceSub() - 1,methodOut.getWvTargetSub() - 1).divide(BigDecimal.valueOf(methodOut.getWvSourceScale()),18,RoundingMode.DOWN).multiply(methodOut.getWvWorkingQty()));
//  DISPLAY 'WV-TEMP-VOLUME *F* = ' WV-TEMP-VOLUME
          logger.info("WV-TEMP-VOLUME *F* = {}", new String(methodOut.getWvTempVolume().toPlainString().toCharArray())); 
//  MOVE WV-TEMP-VOLUME TO WV-UNSIGNED-VOLUME
          methodOut.setWvUnsignedVolume(methodOut.getWvTempVolume().setScale(5,RoundingMode.HALF_DOWN));
//  DISPLAY 'WV-UNSIGNED-VOLUME = ' WV-UNSIGNED-VOLUME
          logger.info("WV-UNSIGNED-VOLUME = {}", String.valueOf(methodOut.getWvUnsignedVolume().movePointRight(5))); 
//  MULTIPLY WV-UNSIGNED-VOLUME BY +1 GIVING DEXR001-TARGET-QTY
          tempDecimal = methodOut.getWvUnsignedVolume().multiply(BigDecimal.ONE).setScale(4,RoundingMode.DOWN);
          methodOut.setDexr001TargetQty(tempDecimal);
          //
          //

// *

// *
//  DISPLAY 'DEXR001-TARGET-QTY = ' DEXR001-TARGET-QTY
          logger.info("DEXR001-TARGET-QTY = {}", String.valueOf(methodOut.getDexr001TargetQty().movePointRight(4))); 
//  STOP RUN
          throw Terminate.TERMINATE;
       } catch(Exception e) {
            handleErrorCode(e);
            throw e;
       }
      
      // end of process method
      }
  
  
  
  
  
  
  
  
  }
