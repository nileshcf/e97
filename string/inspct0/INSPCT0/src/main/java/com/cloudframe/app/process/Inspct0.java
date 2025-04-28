  package com.cloudframe.app.process;
  /* 
*--------------------------------------------------
*/
  
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.inspct0.dto.*;
  import com.cloudframe.app.inspct0.dto.Misc;
  import com.cloudframe.app.inspct0.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.utility.CFUtil;
  
  @Component("inspct0")
  
  public class Inspct0 extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Inspct0.class);
  
  private Misc misc = new Misc() ;
  private Work work = new Work() ;
  
  
  
  
  
  private int tallyCount = 0;
  
  
  
  
      /**
      * process 
      * Input  :  

      * - cnt                            COBOL Name: WS-CNT
      *
      * Output :  

      * - cnt                            COBOL Name: WS-CNT
      * - parm                           COBOL Name: WS-PARM
      *
      * @throws CFException
      */
      @Override
      public int process() throws Exception {
       initVars();
       try {
       setCodePage("1047");
//  PERFORM VARYING WS-CNT FROM 1 BY 1 UNTIL WS-CNT > 730
          for (misc.setCnt(1); (	( misc.getCnt() <= 730 )) ; misc.setCnt(misc.getCnt() + 1) ) {
              ;
          }
//  MOVE ZERO TO WS-CNT
          misc.setCnt(0);
//  MOVE LOW-VALUES TO WS-PARM
          misc.setParm(CONSTANTS.LOW_VALUE_1253883912);
//  MOVE '0000000000 NAT CA VER ' TO WS-PARM (1 : 22)
//  LITERAL_0000000000_B4_NATCAVER = '0000000000 NAT CA VER '
          misc.setParm(replace(misc.getParm(),CONSTANTS.LITERAL_0000000000_B4_NATCAVER,0,22));
//  INSPECT WS-PARM TALLYING WS-CNT FOR CHARACTERS BEFORE '  '
          tallyCount = tallyCharBefore(misc.getParm(),CONSTANTS.SPACE_2);
          misc.setCnt(    misc.getCnt() + tallyCount );
//  DISPLAY '1. WS-CNT   ' WS-CNT
          logger.info("1. WS-CNT   {}", String.valueOf(misc.getCnt())); 
          ;
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          this.setProgramEnded(true);
          return getRc();
       } catch(Exception e) {
            handleErrorCode(e);
            throw e;
       }
      
      // end of process method
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
