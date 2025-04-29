  package com.cloudframe.app.process;
  /* 
* the message is returned to the caller in ip66102-ipm-message.
*----------------------------------------------------------------*
*/
  
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.process.Ip662010;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.global.sharedvar.Ip50005TableKey;
  import com.cloudframe.app.global.sharedvar.Ip50005TableKeyAll;
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
  
  public class Callip extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Callip.class);
  
  private Work work = new Work() ;
  
  
  
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
      @Override
      public int process() throws Exception {
       initVars();
			// Declare local variables used in the method
			Ip50005TableKey ip50005TableKey = ip50005OneDayRec.getIp50005TableKeyAll().getIp50005TableKey();
			Ip50005TableKeyAll ip50005TableKeyAll = ip50005OneDayRec.getIp50005TableKeyAll();
			// End of variable declaration

       try {
       setCodePage("1047");
//  DISPLAY 'START OF CALLIP PROGRAM '
          logger.info("START OF CALLIP PROGRAM "); 
//  PERFORM UNTIL IP66102-IPM-FILE-IS-FINISHED
          while ((!(ip66102IpmFileInformation.isIp66102IpmFileIsFinished()) )) {
//  CALL WS-IP662010
              // CALL WS-IP662010
              	this.setRc( ip662010.process());
//  IF NOT IP66102-IPM-FILE-IS-FINISHED
              if (!(ip66102IpmFileInformation.isIp66102IpmFileIsFinished()) ) { 
//  MOVE SPACES TO 800-CURRENT-TABLE-KEY
                  currentTableKey800.setString(CONSTANTS.SPACE_18);
//  MOVE 'IP0000T1' TO IP50005-TABLE-ID
//  LITERAL_IP0000T1 = 'IP0000T1'
                  ip50005TableKey.setIp50005TableId(CONSTANTS.LITERAL_IP0000T1);
  
                  // MOVE '2019060614' TO IP50005-EFF-DATE
                  ip50005OneDayRec.getIp50005TableKeyAll().getIp50005TableKey().setIp50005EffDate((long)2019060614);
  
//  MOVE ZEROS TO IP50005-SEQ
                  ip50005TableKeyAll.setIp50005Seq(0);
  
//  CALL WS-IP650010
                  // CALL WS-IP650010
                  	this.setRc( ip650010.process());
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
