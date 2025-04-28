  package com.cloudframe.app.process.impl;
  /* 
*------------------------
*------------------------
*---------------------
*/
  
  import com.cloudframe.app.mc082.Mc082Ctx.*;
  import com.cloudframe.app.mc082.Mc082Ctx;
  import com.cloudframe.app.process.Mc082;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import com.cloudframe.app.process.Mc083;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.process.*;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.mc082.dto.*;
  import com.cloudframe.app.mc082.dto.Mc083ReadFileParm;
  import com.cloudframe.app.global.sharedvar.FirstTimeCallGroup;
  import com.cloudframe.app.mc082.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.utility.CFUtil;
  
  @Component("mc082")
  
  public class Mc082Impl extends CommonProcess implements Mc082 {
  
  Logger logger = LoggerFactory.getLogger(Mc082Impl.class);
  
  
  
  
  @Autowired 
  @Qualifier("mc083")
  Mc083 mc083;
  
  
  
  
  
  
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      public int process(Mc082Ctx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
          ;
//  PERFORM 0000-MAIN
          main(programCtx.getMainInCtx());/*0000-MAIN*/
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
  *   COBOL Paragraph - 0000-MAIN COBOL Cyclomatic complexity - 5
      * Input  :  

      * - mc083Data                      COBOL Name: MC083-DATA
      *
      * Output :  

      * - firstTimeCall                  COBOL Name: FIRST-TIME-CALL
      * - mc083FileStatus                COBOL Name: MC083-FILE-STATUS
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public MainOutCtx main(MainInCtx methodIn) throws Exception {
Mc082Ctx programCtx = methodIn.getMc082Ctx();
MainOutCtx methodOut = methodIn.getMainOutCtx();

// *
// *    Call mc083 to read all records
// *
//  MOVE 'Y' TO FIRST-TIME-CALL
//  LITERAL_Y = 'Y'
          methodOut.setFirstTimeCall(CONSTANTS.LITERAL_Y);
//  MOVE ZERO TO MC083-FILE-STATUS
          methodOut.setMc083FileStatus(CONSTANTS.ZERO_2);

// *
//  PERFORM UNTIL MC083-FILE-STATUS NOT = '00'
          while ((		compareChars(methodOut.getMc083FileStatus(),CONSTANTS.LITERAL_00) == 0 )) {
//  CALL MC083-PROG USING MC083-READ-FILE-PARM END-CALL
              // CALL MC083-PROG USING MC083-READ-FILE-PARM END-CALL
                   programCtx.setRc( mc083.call(programCtx.getGlobalCtx().getContext("MC083"),methodOut.getMc083ReadFileParm()));
//  IF MC083-FILE-STATUS = '00'
//  LITERAL_00 = '00'
              if (		compareChars(methodOut.getMc083FileStatus(),CONSTANTS.LITERAL_00) == 0 ) { 
//  DISPLAY MC083-DATA
                  logger.info(new String(methodIn.getMc083Data())); 
              }
//  ELSE
              else { 
//  IF MC083-FILE-STATUS = '10'
//  LITERAL_10 = '10'
                  if (		compareChars(methodOut.getMc083FileStatus(),CONSTANTS.LITERAL_10) == 0 ) { 
//  DISPLAY '*** END OF FILE ***'
                      logger.info("*** END OF FILE ***"); 
                  }
//  ELSE
                  else { 
//  DISPLAY 'FAILURE : MC083-FILE-STATUS = ' MC083-FILE-STATUS
                      logger.info("FAILURE : MC083-FILE-STATUS = {}", new String(methodOut.getMc083FileStatus())); 
                  }
              }
          }

// *
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return methodOut;
      
      }
  
  
  
      public void setFromMc083(Mc082Ctx programCtx, Object[] params) {
      int len = params.length;
         if (len > 0)
         if(params[0] instanceof Field) 
   programCtx.getMc083ReadFileParm().setString(((Field)params[0] ).toCharArray());
 else    programCtx.getMc083ReadFileParm().setString((char[])params[0] );
      }
  
  
  
  
  
  }
