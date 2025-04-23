  package com.cloudframe.app.process;
  /* 
*---------------------------------------------
* mcextend - aggregate balance for credit card
*           to output file
*--------------------------------------------
*
*/
  
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.process.Mcfile1;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.process.Mcfile2;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.mcextend.dto.*;
  import com.cloudframe.app.mcextend.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.utility.CFUtil;
  
  @Component("mcextend")
  
  public class Mcextend extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Mcextend.class);
  
  private Work work = new Work() ;
  
  
  
  @Autowired 
  @Qualifier("mcfile1")
  Mcfile1 mcfile1;
  @Autowired 
  @Qualifier("mcfile2")
  Mcfile2 mcfile2;
  
  
  
  
  
  
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
//  PERFORM 0000-MAINLINE
          mainline();/*0000-MAINLINE*/
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
  *   COBOL Paragraph - 0000-MAINLINE COBOL Cyclomatic complexity - 3
      * Input  : None 

      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      private void mainline() throws Exception {

// *
//  PERFORM 5 TIMES
          for (int index0 = 0; index0 < 5;index0++) {
//  CALL WS-MCFILE1
              // CALL WS-MCFILE1
              	this.setRc( mcfile1.process());
//  CALL WS-MCFILE2
              // CALL WS-MCFILE2
              	this.setRc( mcfile2.process());
          }

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
