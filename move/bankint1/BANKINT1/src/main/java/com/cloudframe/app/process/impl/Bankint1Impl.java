  package com.cloudframe.app.process.impl;
  /* 
*------------------------
*------------------------
*---------------------
*/
  
  import com.cloudframe.app.bankint1.Bankint1Ctx.*;
  import com.cloudframe.app.bankint1.Bankint1Ctx;
  import com.cloudframe.app.process.Bankint1;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.bankint1.dto.*;
  import com.cloudframe.app.bankint1.dto.AcafscedAreaComunicacion;
  import com.cloudframe.app.bankint1.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.utility.CFUtil;
  
  @Component("bankint1")
  
  public class Bankint1Impl extends CommonProcess implements Bankint1 {
  
  Logger logger = LoggerFactory.getLogger(Bankint1Impl.class);
  
  
  
  
  
  
  
  
  
  
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      public int process(Bankint1Ctx programCtx) throws Exception {
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

      * Output :  

      * - acafscedAreaComunicacion       COBOL Name: ACAFSCED-AREA-COMUNICACION
      * - acafscedControl                COBOL Name: ACAFSCED-CONTROL
      *
      * @throws CFException
      */
      @Override
      public MainOutCtx main(Bankint1Ctx programCtx) throws Exception {
MainOutCtx methodOut = programCtx.getMainOutCtx();

// *    Move zeroes to acafsced-s-saldo-cedido.
// *    move zeroes to acafsced-s-saldo-tomado.
// *    move zeroes to acafsced-s-sal-prcedido.
// *    move zeroes to acafsced-s-sal-prtomado.
// *    move zeroes to acafsced-s-sal-traspaso.
//  INITIALIZE ACAFSCED-AREA-COMUNICACION
          methodOut.getAcafscedAreaComunicacion().initialize();
//  DISPLAY ACAFSCED-CONTROL
          logger.info(methodOut.getAcafscedControl().toString()); 
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return methodOut;
      
      }
  
  
  
  
  
  
  
  
  }
