  package com.cloudframe.app.process.impl;
  /* 
*------------------------
*------------------------
*---------------------
*/
  
  import com.cloudframe.app.uhissue1.Uhissue1Ctx.*;
  import com.cloudframe.app.uhissue1.Uhissue1Ctx;
  import com.cloudframe.app.process.Uhissue1;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.uhissue1.dto.*;
  import com.cloudframe.app.uhissue1.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.utility.CFUtil;
  
  @Component("uhissue1")
  
  public class Uhissue1Impl extends CommonProcess implements Uhissue1 {
  
  Logger logger = LoggerFactory.getLogger(Uhissue1Impl.class);
  
  
  
  
  
  
  
  
  
  
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      public int process(Uhissue1Ctx programCtx) throws Exception {
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
//  PERFORM 0000-EXIT
          exit(programCtx);/*0000-EXIT*/
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
  *   COBOL Paragraph - 0000-MAIN COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void main(Uhissue1Ctx programCtx) throws Exception {

// *

// *
//  PERFORM 2000-PATH1
          path1(programCtx);/*2000-PATH1*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
          ;
      
      }
      /**
      * exit 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-EXIT COBOL Cyclomatic complexity - 2
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void exit(Uhissue1Ctx programCtx) throws Exception {
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return ;
      
      }
      /**
      * path1 
      *   This method is derived from 
  *   COBOL Paragraph - 2000-PATH1 COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output :  

      * - flag1                          COBOL Name: WS-FLAG1
      * - flag2                          COBOL Name: WS-FLAG2
      * - flag3                          COBOL Name: WS-FLAG3
      *
      * @throws CFException
      */
      @Override
      public Path1OutCtx path1(Uhissue1Ctx programCtx) throws Exception {
      
// *

// *
Path1OutCtx methodOut = programCtx.getPath1OutCtx();
//  DISPLAY 'TESTING PATH1'
          logger.info("TESTING PATH1"); 
//  DISPLAY '>>> TEST FLAGS : NNN'
          logger.info(">>> TEST FLAGS : NNN"); 
//  SET FLAG1-NOTSET TO TRUE
          methodOut.setFlag1NotsetTrue(); 
          
//  SET FLAG2-NOTSET TO TRUE
          methodOut.setFlag2NotsetTrue(); 
          
//  SET FLAG3-NOTSET TO TRUE
          methodOut.setFlag3NotsetTrue(); 
          

// *
//  PERFORM 0010-CHECK-CONDITION THRU 0010-EXIT
          checkCondition(programCtx.getCheckConditionInCtx());/*0010-CHECK-CONDITION SECTION*/

// *
//  DISPLAY '>>> TEST FLAGS : NYN'
          logger.info(">>> TEST FLAGS : NYN"); 
//  SET FLAG1-NOTSET TO TRUE
          methodOut.setFlag1NotsetTrue(); 
          
//  SET FLAG2-SET TO TRUE
          methodOut.setFlag2SetTrue(); 
          
//  SET FLAG3-NOTSET TO TRUE
          methodOut.setFlag3NotsetTrue(); 
          

// *
//  PERFORM 0010-CHECK-CONDITION THRU 0010-EXIT
          checkCondition(programCtx.getCheckConditionInCtx());/*0010-CHECK-CONDITION SECTION*/

// *
//  DISPLAY '>>> TEST FLAGS : YYN'
          logger.info(">>> TEST FLAGS : YYN"); 
//  SET FLAG1-SET TO TRUE
          methodOut.setFlag1SetTrue(); 
          
//  SET FLAG2-SET TO TRUE
          methodOut.setFlag2SetTrue(); 
          
//  SET FLAG3-NOTSET TO TRUE
          methodOut.setFlag3NotsetTrue(); 
          

// *
//  PERFORM 0010-CHECK-CONDITION THRU 0010-EXIT
          checkCondition(programCtx.getCheckConditionInCtx());/*0010-CHECK-CONDITION SECTION*/

// *
//  DISPLAY '>>> TEST FLAGS : YYY'
          logger.info(">>> TEST FLAGS : YYY"); 
//  SET FLAG1-SET TO TRUE
          methodOut.setFlag1SetTrue(); 
          
//  SET FLAG2-SET TO TRUE
          methodOut.setFlag2SetTrue(); 
          
//  SET FLAG3-SET TO TRUE
          methodOut.setFlag3SetTrue(); 
          

// *
//  PERFORM 0010-CHECK-CONDITION THRU 0010-EXIT
          checkCondition(programCtx.getCheckConditionInCtx());/*0010-CHECK-CONDITION SECTION*/
          ;
      
      return methodOut;
      }
      /**
      * checkCondition 
      *   This method is derived from 
  *   COBOL Paragraph - 0010-CHECK-CONDITION SECTION COBOL Cyclomatic complexity - 7
      * Input  :  

      * - flag1                          COBOL Name: WS-FLAG1
      * - flag2                          COBOL Name: WS-FLAG2
      * - flag3                          COBOL Name: WS-FLAG3
      *
      * Output : None 

      * @throws CFException
      */
      @Override
      public void checkCondition(CheckConditionInCtx methodIn) throws Exception {
      
// *

// *
Uhissue1Ctx programCtx = methodIn.getUhissue1Ctx();
//  IF FLAG1-NOTSET
          if ( methodIn.isFlag1Notset()  ) { 
//  NEXT SENTENCE
              return ;
          }

// *

// *
//  DISPLAY '   FLAG1 ON'
          logger.info("   FLAG1 ON"); 
//  IF FLAG2-NOTSET
          if ( methodIn.isFlag2Notset()  ) { 
//  NEXT SENTENCE
              return ;
          }

// *

// *
//  DISPLAY '   FLAG2 ON'
          logger.info("   FLAG2 ON"); 
//  IF FLAG3-NOTSET
          if ( methodIn.isFlag3Notset()  ) { 
//  NEXT SENTENCE
              return ;
          }

// *

// *
//  DISPLAY '   FLAG3 ON'
          logger.info("   FLAG3 ON"); 
//  IF FLAG1-SET AND FLAG2-SET AND FLAG3-SET
          if ( methodIn.isFlag1Set()   &&  methodIn.isFlag2Set()   &&  methodIn.isFlag3Set()  ) { 
//  NEXT SENTENCE
              return ;
          }

// *

// *

// *
//  DISPLAY ' *** WE SHOULD NOT SEE THIS MESSAGE *** '
          logger.info(" *** WE SHOULD NOT SEE THIS MESSAGE *** "); 
      
      }
  
  
  
  
  
  
  
  
  }
