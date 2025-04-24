  package com.cloudframe.app.process.impl;
  /* 
*
*
*/
  
  import com.cloudframe.app.dxc001.Dxc001Ctx.*;
  import com.cloudframe.app.dxc001.Dxc001Ctx;
  import com.cloudframe.app.process.Dxc001;
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
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.dxc001.dto.*;
  import com.cloudframe.app.dxc001.dto.CurrDate1;
  import com.cloudframe.app.dxc001.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("dxc001")
  
  public class Dxc001Impl extends CommonProcess implements Dxc001 {
  
  Logger logger = LoggerFactory.getLogger(Dxc001Impl.class);
  
  
  
  
  
  
  
  
  
  
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      public int process(Dxc001Ctx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
          ;
//  PERFORM MAINLINE
          mainline(programCtx.getMainlineInCtx());/*MAINLINE*/
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

      * Output :  

      * - chckYear1                      COBOL Name: CHCK-YEAR1
      * - chckMonth1                     COBOL Name: CHCK-MONTH1
      * - chckDay1                       COBOL Name: CHCK-DAY1
      * - currDat1                       COBOL Name: CURR-DAT1
      *
      * @throws CFException
      */
      @Override
      public MainlineOutCtx mainline(MainlineInCtx methodIn) throws Exception {
      
// *
Dxc001Ctx programCtx = methodIn.getDxc001Ctx();
MainlineOutCtx methodOut = methodIn.getMainlineOutCtx();
          // MOVE 2022 TO CHCK-YEAR1
          methodOut.setChckYear1(2022);
          // MOVE 10 TO CHCK-MONTH1
          methodOut.setChckMonth1(10);
          // MOVE 06 TO CHCK-DAY1
          methodOut.setChckDay1(6);
          methodOut.setCurrDat1(Math.abs(new BigDecimal(CFUtil.getNumberString(methodIn.getCurrDate1())).longValue()));
//  DISPLAY 'CURR-DAT1 = ' CURR-DAT1
          logger.info("CURR-DAT1 = {}", String.valueOf(methodOut.getCurrDat1())); 
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return methodOut;
      
      }
  
  
  
  
  
  
  
  
  }
