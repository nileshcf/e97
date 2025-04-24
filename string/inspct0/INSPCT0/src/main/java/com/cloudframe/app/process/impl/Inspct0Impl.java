  package com.cloudframe.app.process.impl;
  /* 
*--------------------------------------------------
*/
  
  import com.cloudframe.app.inspct0.Inspct0Ctx.*;
  import com.cloudframe.app.inspct0.Inspct0Ctx;
  import com.cloudframe.app.process.Inspct0;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.inspct0.dto.*;
  import com.cloudframe.app.inspct0.dto.Misc;
  import com.cloudframe.app.inspct0.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.utility.CFUtil;
  
  @Component("inspct0")
  
  public class Inspct0Impl extends CommonProcess implements Inspct0 {
  
  Logger logger = LoggerFactory.getLogger(Inspct0Impl.class);
  
  
  
  
  
  
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
      public int process(Inspct0Ctx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
ProcessInCtx methodIn = programCtx.getProcessInCtx();
ProcessOutCtx methodOut = methodIn.getProcessOutCtx();
//  PERFORM VARYING WS-CNT FROM 1 BY 1 UNTIL WS-CNT > 730
          for (methodOut.setCnt(1); (	( methodOut.getCnt() <= 730 )) ; methodOut.setCnt(methodOut.getCnt() + 1) ) {
              ;
          }
//  MOVE ZERO TO WS-CNT
          methodOut.setCnt(0);
//  MOVE LOW-VALUES TO WS-PARM
          methodOut.setParm(CONSTANTS.LOW_VALUE_1253883912);
//  MOVE '0000000000 NAT CA VER ' TO WS-PARM (1 : 22)
//  LITERAL_0000000000_B4_NATCAVER = '0000000000 NAT CA VER '
          methodOut.setParm(replace(methodOut.getParm(),CONSTANTS.LITERAL_0000000000_B4_NATCAVER,0,22));
//  INSPECT WS-PARM TALLYING WS-CNT FOR CHARACTERS BEFORE '  '
          tallyCount = tallyCharBefore(methodOut.getParm(),CONSTANTS.SPACE_2);
          methodOut.setCnt(    methodOut.getCnt() + tallyCount );
//  DISPLAY '1. WS-CNT   ' WS-CNT
          logger.info("1. WS-CNT   {}", String.valueOf(methodOut.getCnt())); 
          ;
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return programCtx.getRc();
       } catch(Exception e) {
            handleErrorCode(e);
            throw e;
       }
      
      // end of process method
      }
  
  
  
  
  
  
  
  
  }
