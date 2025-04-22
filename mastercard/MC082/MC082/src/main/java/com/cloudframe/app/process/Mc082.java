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
  import com.cloudframe.app.process.Mc083;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.mc082.dto.*;
  import com.cloudframe.app.mc082.dto.Mc083ReadFileParm;
  import com.cloudframe.app.global.sharedvar.FirstTimeCallGroup;
  import com.cloudframe.app.mc082.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.utility.CFUtil;
  
  @Component("mc082")
  
  public class Mc082 extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Mc082.class);
  
  private Mc083ReadFileParm mc083ReadFileParm = new Mc083ReadFileParm() ;
  private Work work = new Work() ;
  
  
  
  @Autowired 
  @Qualifier("mc083")
  Mc083 mc083;
  
  
  
  
  
  
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
      private void main() throws Exception {
			// Declare local variables used in the method
			char[] mc083FileStatus = null;
			// End of variable declaration


// *
// *    Call mc083 to read all records
// *
//  MOVE 'Y' TO FIRST-TIME-CALL
//  LITERAL_Y = 'Y'
          firstTimeCallGroup.setFirstTimeCall(CONSTANTS.LITERAL_Y);
//  MOVE ZERO TO MC083-FILE-STATUS
          mc083ReadFileParm.setMc083FileStatus(CONSTANTS.ZERO_2);

// *
//  PERFORM UNTIL MC083-FILE-STATUS NOT = '00'
          while ((		compareChars(mc083ReadFileParm.getMc083FileStatus(),CONSTANTS.LITERAL_00) == 0 )) {
//  CALL MC083-PROG USING MC083-READ-FILE-PARM END-CALL
              // CALL MC083-PROG USING MC083-READ-FILE-PARM END-CALL
                   this.setRc( mc083.call(mc083ReadFileParm));
              mc083FileStatus = mc083ReadFileParm.getMc083FileStatus();
//  IF MC083-FILE-STATUS = '00'
//  LITERAL_00 = '00'
              if (		compareChars(mc083FileStatus,CONSTANTS.LITERAL_00) == 0 ) { 
//  DISPLAY MC083-DATA
                  logger.info(new String(mc083ReadFileParm.getMc083Data())); 
              }
  
//  ELSE
              else { 
                  mc083FileStatus = mc083ReadFileParm.getMc083FileStatus();
//  IF MC083-FILE-STATUS = '10'
//  LITERAL_10 = '10'
                  if (		compareChars(mc083FileStatus,CONSTANTS.LITERAL_10) == 0 ) { 
//  DISPLAY '*** END OF FILE ***'
                      logger.info("*** END OF FILE ***"); 
                  }
  
//  ELSE
                  else { 
//  DISPLAY 'FAILURE : MC083-FILE-STATUS = ' MC083-FILE-STATUS
                      logger.info("FAILURE : MC083-FILE-STATUS = {}", new String(mc083ReadFileParm.getMc083FileStatus())); 
                  }
              }
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
  
      public void setFromMc083(Object[] params) {
      int len = params.length;
         if (len > 0)
         if(params[0] instanceof Field) 
   mc083ReadFileParm.setString(((Field)params[0] ).toCharArray());
 else    mc083ReadFileParm.setString((char[])params[0] );
      }
  
  
  
  
  
  }
