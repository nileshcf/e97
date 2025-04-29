  package com.cloudframe.app.process;
  /* 
*
*
*/
  
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import java.math.BigDecimal;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.dxc001.dto.*;
  import com.cloudframe.app.dxc001.dto.CurrDate1;
  import com.cloudframe.app.dxc001.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("dxc001")
  
  public class Dxc001 extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Dxc001.class);
  
  private CurrDate1 currDate1 = new CurrDate1() ;
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

      * Output :  

      * - chckYear1                      COBOL Name: CHCK-YEAR1
      * - chckMonth1                     COBOL Name: CHCK-MONTH1
      * - chckDay1                       COBOL Name: CHCK-DAY1
      * - currDat1                       COBOL Name: CURR-DAT1
      *
      * @throws CFException
      */
      private void mainline() throws Exception {
      
// *
          // MOVE 2022 TO CHCK-YEAR1
          currDate1.setChckYear1(2022);
          // MOVE 10 TO CHCK-MONTH1
          currDate1.setChckMonth1(10);
          // MOVE 06 TO CHCK-DAY1
          currDate1.setChckDay1(6);
          work.setCurrDat1(Math.abs(new BigDecimal(CFUtil.getNumberString(currDate1)).longValue()));
//  DISPLAY 'CURR-DAT1 = ' CURR-DAT1
          logger.info("CURR-DAT1 = {}", String.valueOf(work.getCurrDat1())); 
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
