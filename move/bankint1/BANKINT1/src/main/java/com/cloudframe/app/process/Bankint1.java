  package com.cloudframe.app.process;
  /* 
*------------------------
*------------------------
*---------------------
*/
  
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.bankint1.dto.AcafscedSalida;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.bankint1.dto.*;
  import com.cloudframe.app.bankint1.dto.AcafscedAreaComunicacion;
  import com.cloudframe.app.bankint1.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.utility.CFUtil;
  
  @Component("bankint1")
  
  public class Bankint1 extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Bankint1.class);
  
  private AcafscedAreaComunicacion acafscedAreaComunicacion = new AcafscedAreaComunicacion() ;
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
//  PERFORM 0000-MAIN
          main();/*0000-MAIN*/
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
      private void main() throws Exception {
			// Declare local variables used in the method
			AcafscedSalida acafscedSalida = acafscedAreaComunicacion.getAcafscedSalida();
			// End of variable declaration


// *    Move zeroes to acafsced-s-saldo-cedido.
// *    move zeroes to acafsced-s-saldo-tomado.
// *    move zeroes to acafsced-s-sal-prcedido.
// *    move zeroes to acafsced-s-sal-prtomado.
// *    move zeroes to acafsced-s-sal-traspaso.
//  INITIALIZE ACAFSCED-AREA-COMUNICACION
          acafscedAreaComunicacion.initialize();
//  DISPLAY ACAFSCED-CONTROL
          logger.info(acafscedSalida.getAcafscedControl().toString()); 
  
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
