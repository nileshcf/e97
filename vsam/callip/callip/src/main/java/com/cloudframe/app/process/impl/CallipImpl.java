  package com.cloudframe.app.process.impl;
  /* 
* the message is returned to the caller in ip66102-ipm-message.
*----------------------------------------------------------------*
*/
  
  import com.cloudframe.app.callip.CallipCtx.*;
  import com.cloudframe.app.callip.CallipCtx;
  import com.cloudframe.app.process.Callip;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import com.cloudframe.app.process.Ip662010;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.process.*;
  import com.cloudframe.app.process.Ip650010;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.global.sharedvar.CurrentTableKey800;
  import com.cloudframe.app.global.sharedvar.Ip65504CurrentTagTable;
  import com.cloudframe.app.global.sharedvar.Ip65504TcntGroup;
  import com.cloudframe.app.global.sharedvar.Ip65504MessageStatusGroup;
  import com.cloudframe.app.global.sharedvar.Ip65504SelElemEntriesAll;
  import com.cloudframe.app.global.sharedvar.Ip65504TaggedRecordInfo;
  import com.cloudframe.app.global.sharedvar.Ip66102IpmFileInformation;
  import com.cloudframe.app.global.sharedvar.Ip50005OneDayRecLthGroup;
  import com.cloudframe.app.global.sharedvar.Ip50005OneDayRec;
  import com.cloudframe.app.global.sharedvar.Ip50005OneDayReadStatusGroup;
  import com.cloudframe.app.global.sharedvar.Ip50005ClearingDtTm;
  import com.cloudframe.app.callip.dto.*;
  import com.cloudframe.app.callip.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.utility.CFUtil;
  
  @Component("callip")
  
  public class CallipImpl extends CommonProcess implements Callip {
  
  Logger logger = LoggerFactory.getLogger(CallipImpl.class);
  
  
  
  
  @Autowired 
  @Qualifier("ip662010")
  Ip662010 ip662010;
  
  
  
  
  
  
      /**
      * process 
      * Input  :  

      * - ip66102IsIpmFileFinished       COBOL Name: IP66102-IS-IPM-FILE-FINISHED
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      * - currentTableKey800             COBOL Name: 800-CURRENT-TABLE-KEY
      * - ip50005TableId                 COBOL Name: IP50005-TABLE-ID
      * - ip50005EffDate                 COBOL Name: IP50005-EFF-DATE
      * - ip50005Seq                     COBOL Name: IP50005-SEQ
      *
      * @throws CFException
      */
      public int process(CallipCtx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
ProcessInCtx methodIn = programCtx.getProcessInCtx();
ProcessOutCtx methodOut = methodIn.getProcessOutCtx();
//  DISPLAY 'START OF CALLIP PROGRAM '
          logger.info("START OF CALLIP PROGRAM "); 
//  PERFORM UNTIL IP66102-IPM-FILE-IS-FINISHED
          while ((!(methodIn.isIp66102IpmFileIsFinished()) )) {
//  CALL WS-IP662010
              // CALL WS-IP662010
              	programCtx.setRc( ip662010.process(programCtx.getGlobalCtx().getContext("IP662010")));
//  IF NOT IP66102-IPM-FILE-IS-FINISHED
              if (!(methodIn.isIp66102IpmFileIsFinished()) ) { 
//  MOVE SPACES TO 800-CURRENT-TABLE-KEY
                  methodOut.getCurrentTableKey800().setString(CONSTANTS.SPACE_18);
//  MOVE 'IP0000T1' TO IP50005-TABLE-ID
//  LITERAL_IP0000T1 = 'IP0000T1'
                  methodOut.setIp50005TableId(CONSTANTS.LITERAL_IP0000T1);
                  // MOVE '2019060614' TO IP50005-EFF-DATE
                  methodOut.setIp50005EffDate((long)2019060614);
//  MOVE ZEROS TO IP50005-SEQ
                  methodOut.setIp50005Seq(0);
//  CALL WS-IP650010
                  // CALL WS-IP650010
                  	programCtx.setRc( ip650010.process(programCtx.getGlobalCtx().getContext("IP650010")));
//  DISPLAY 'DB SIZE AFTER SEEK '
                  logger.info("DB SIZE AFTER SEEK "); 
              }
          }

// *         Display 'no of entries ' ip65504-tcnt
// *         display '-------------------------------'
// *
// *         perform varying ws-sub from 1 by 1 until
// *             ws-sub > ip65504-tcnt
// *             display 'msg tag type ' ip65504-tag-type(ws-sub)
// *             display 'tag no       ' ip65504-tag-no(ws-sub)
// *             display 'sub field no '
// *                           ip65504-tag-sub-fld-no (ws-sub)
// *             display 'tag starts '
// *                           ip65504-tag-starts(ws-sub)
// *             display 'tag len '
// *                           ip65504-tag-lngth(ws-sub)
// *             display 'tag status '
// *                           ip65504-tag-status(ws-sub)
// *           display '-------                   -----'
// *         end-perform
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
