  package com.cloudframe.app.process.impl;
  /* 
*---------------------------------------------
* mcextend - aggregate balance for credit card
*           to output file
*--------------------------------------------
*
*/
  
  import com.cloudframe.app.mcextend.McextendCtx.*;
  import com.cloudframe.app.mcextend.McextendCtx;
  import com.cloudframe.app.process.Mcextend;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import com.cloudframe.app.process.Mcfile1;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.process.*;
  import com.cloudframe.app.process.Mcfile2;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.mcextend.dto.*;
  import com.cloudframe.app.mcextend.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.utility.CFUtil;
  
  @Component("mcextend")
  
  public class McextendImpl extends CommonProcess implements Mcextend {
  
  Logger logger = LoggerFactory.getLogger(McextendImpl.class);
  
  
  
  
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
      public int process(McextendCtx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
          ;
//  PERFORM 0000-MAINLINE
          mainline(programCtx.getMainlineInCtx());/*0000-MAINLINE*/
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
  *   COBOL Paragraph - 0000-MAINLINE COBOL Cyclomatic complexity - 3
      * Input  : None 

      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public MainlineOutCtx mainline(MainlineInCtx methodIn) throws Exception {
McextendCtx programCtx = methodIn.getMcextendCtx();
MainlineOutCtx methodOut = methodIn.getMainlineOutCtx();

// *
//  PERFORM 5 TIMES
          for (int index0 = 0; index0 < 5;index0++) {
//  CALL WS-MCFILE1
              // CALL WS-MCFILE1
              	programCtx.setRc( mcfile1.process(programCtx.getGlobalCtx().getContext("MCFILE1")));
//  CALL WS-MCFILE2
              // CALL WS-MCFILE2
              	programCtx.setRc( mcfile2.process(programCtx.getGlobalCtx().getContext("MCFILE2")));
          }

// *
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return methodOut;
      
      }
  
  
  
  
  
  
  
  
  }
