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
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.uhissue1.dto.*;
  import com.cloudframe.app.uhissue1.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.utility.CFUtil;
  
  @Component("uhissue1")
  
  public class Uhissue1 extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Uhissue1.class);
  
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
//  PERFORM 0000-EXIT
          exit();/*0000-EXIT*/
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
  *   COBOL Paragraph - 0000-MAIN COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void main() throws Exception {

// *

// *
//  PERFORM 2000-PATH1
          path1();/*2000-PATH1*/
          if (this.isProgramEnded()) {
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
      private void exit() throws Exception {
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          this.setProgramEnded(true);
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
      private void path1() throws Exception {
      
// *

// *
//  DISPLAY 'TESTING PATH1'
          logger.info("TESTING PATH1"); 
//  DISPLAY '>>> TEST FLAGS : NNN'
          logger.info(">>> TEST FLAGS : NNN"); 
//  SET FLAG1-NOTSET TO TRUE
          work.setFlag1NotsetTrue(); 
          
//  SET FLAG2-NOTSET TO TRUE
          work.setFlag2NotsetTrue(); 
          
//  SET FLAG3-NOTSET TO TRUE
          work.setFlag3NotsetTrue(); 
          

// *
//  PERFORM 0010-CHECK-CONDITION THRU 0010-EXIT
          checkCondition();/*0010-CHECK-CONDITION SECTION*/

// *
//  DISPLAY '>>> TEST FLAGS : NYN'
          logger.info(">>> TEST FLAGS : NYN"); 
//  SET FLAG1-NOTSET TO TRUE
          work.setFlag1NotsetTrue(); 
          
//  SET FLAG2-SET TO TRUE
          work.setFlag2SetTrue(); 
          
//  SET FLAG3-NOTSET TO TRUE
          work.setFlag3NotsetTrue(); 
          

// *
//  PERFORM 0010-CHECK-CONDITION THRU 0010-EXIT
          checkCondition();/*0010-CHECK-CONDITION SECTION*/

// *
//  DISPLAY '>>> TEST FLAGS : YYN'
          logger.info(">>> TEST FLAGS : YYN"); 
//  SET FLAG1-SET TO TRUE
          work.setFlag1SetTrue(); 
          
//  SET FLAG2-SET TO TRUE
          work.setFlag2SetTrue(); 
          
//  SET FLAG3-NOTSET TO TRUE
          work.setFlag3NotsetTrue(); 
          

// *
//  PERFORM 0010-CHECK-CONDITION THRU 0010-EXIT
          checkCondition();/*0010-CHECK-CONDITION SECTION*/

// *
//  DISPLAY '>>> TEST FLAGS : YYY'
          logger.info(">>> TEST FLAGS : YYY"); 
//  SET FLAG1-SET TO TRUE
          work.setFlag1SetTrue(); 
          
//  SET FLAG2-SET TO TRUE
          work.setFlag2SetTrue(); 
          
//  SET FLAG3-SET TO TRUE
          work.setFlag3SetTrue(); 
          

// *
//  PERFORM 0010-CHECK-CONDITION THRU 0010-EXIT
          checkCondition();/*0010-CHECK-CONDITION SECTION*/
          ;
      
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
      private void checkCondition() throws Exception {
      
// *

// *
//  IF FLAG1-NOTSET
          if ( work.isFlag1Notset()  ) { 
//  NEXT SENTENCE
              return ;
          }

// *

// *
//  DISPLAY '   FLAG1 ON'
          logger.info("   FLAG1 ON"); 
//  IF FLAG2-NOTSET
          if ( work.isFlag2Notset()  ) { 
//  NEXT SENTENCE
              return ;
          }

// *

// *
//  DISPLAY '   FLAG2 ON'
          logger.info("   FLAG2 ON"); 
//  IF FLAG3-NOTSET
          if ( work.isFlag3Notset()  ) { 
//  NEXT SENTENCE
              return ;
          }

// *

// *
//  DISPLAY '   FLAG3 ON'
          logger.info("   FLAG3 ON"); 
//  IF FLAG1-SET AND FLAG2-SET AND FLAG3-SET
          if ( work.isFlag1Set()   &&  work.isFlag2Set()   &&  work.isFlag3Set()  ) { 
//  NEXT SENTENCE
              return ;
          }

// *

// *

// *
//  DISPLAY ' *** WE SHOULD NOT SEE THIS MESSAGE *** '
          logger.info(" *** WE SHOULD NOT SEE THIS MESSAGE *** "); 
      
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
