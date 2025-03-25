package org.optum.uhg.service.impl;
  /* 
*
* this program does cics get container api
*
*/
  
import org.optum.uhg.common.CommonProcess;
import com.cloudframe.app.process.BaseProcess;
  import com.cloudframe.app.cics.CICSSession;
import org.optum.uhg.dto.cics0010.Cics0010Ctx.*;
import org.optum.uhg.dto.cics0010.Cics0010Ctx;
import org.optum.uhg.service.Cics0010;
  import com.cloudframe.app.process.BaseProcess;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import com.cloudframe.app.cics.TransactionManager;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.dto.ProgramContext;
  import com.cloudframe.app.data.Field;
import org.optum.uhg.dto.cics0010.*;
import org.optum.uhg.dto.cics0010.DfhcommareaGroup;
import org.optum.uhg.dto.cics0010.LsDfhcommarea;
import org.optum.uhg.dto.cics0010.Work;
import org.optum.uhg.common.CONSTANTS;
  import com.cloudframe.app.utility.CFUtil;
  
  @Component("cics0010")
  
  public class Cics0010Impl extends CommonProcess implements Cics0010 {
  
  Logger logger = LoggerFactory.getLogger(Cics0010Impl.class);
  
  
  
  
  
  
  
  
  
  
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      public int process(Cics0010Ctx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
ProcessInCtx methodIn = programCtx.getProcessInCtx();
//  PERFORM 0000-MAINLINE
          mainline(programCtx.getMainlineInCtx());/*0000-MAINLINE SECTION*/
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
      * mainline 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAINLINE SECTION COBOL Cyclomatic complexity - 6
      * Input  : None 

      * Output :  

      * - lsReturnCode                   COBOL Name: LS-RETURN-CODE
      * - lsReturnEibresp                COBOL Name: LS-RETURN-EIBRESP
      * - lsReturnEibresp2               COBOL Name: LS-RETURN-EIBRESP2
      *
      * @throws CFException
      */
      @Override
      public MainlineOutCtx mainline(MainlineInCtx methodIn) throws Exception {
Cics0010Ctx programCtx = methodIn.getCics0010Ctx();
MainlineOutCtx methodOut = methodIn.getMainlineOutCtx();
//  GET CONTAINER('CICS0010-COMAREA') CHANNEL('CLFR-CHANNEL') SET(ADDRESS OF LS-DFHCOMMAREA) FLENGTH(FUNCTION~LENGTH~LS-DFHCOMMAREA) RESP (CICSRESP) RESP2 (CICSRESP2)
          // GET CONTAINER('CICS0010-COMAREA') CHANNEL('CLFR-CHANNEL') SET(ADDRESS OF LS-DFHCOMMAREA) FLENGTH(FUNCTION~LENGTH~LS-DFHCOMMAREA) RESP (CICSRESP) RESP2 (CICSRESP2)
          // get data from a container
          	if(programCtx.getGlobalCtx().containerExists(String.valueOf(CONSTANTS.LITERAL_CICS0010_MN_COMAREA).trim())) {
          		methodIn.getLsDfhcommarea().setString(programCtx.getGlobalCtx().fetchContainer(String.valueOf(CONSTANTS.LITERAL_CICS0010_MN_COMAREA).trim()));
               } else {
               }
          // MOVE 0 TO LS-RETURN-CODE LS-RETURN-EIBRESP LS-RETURN-EIBRESP2
          methodOut.setLsReturnCode(0);
          methodOut.setLsReturnEibresp((long)0);
          methodOut.setLsReturnEibresp2((long)0);
//  EVALUATE LS-REQUEST-TYPE
          switch(methodIn.getLsRequestType()){
          	case 1:
//  PERFORM 0001-GET-REQUEST THRU 0001-EXIT
              getRequest(programCtx.getGetRequestInCtx());/*0001-GET-REQUEST*/
          break;
          	case 2:
//  PERFORM 0002-GET-REQUEST THRU 0002-EXIT
              getRequest0002(programCtx.getGetRequest0002InCtx());/*0002-GET-REQUEST*/
          break;
          	case 3:
//  PERFORM 0003-GET-REQUEST THRU 0003-EXIT
              getRequest0003(programCtx.getGetRequest0003InCtx());/*0003-GET-REQUEST*/
          break;
          default :
              // MOVE 16 TO LS-RETURN-CODE
              methodOut.setLsReturnCode(16);
          }
//  PUT CONTAINER('CICS0010-COMAREA') CHANNEL('CLFR-CHANNEL') FROM(LS-DFHCOMMAREA) FLENGTH(FUNCTION~LENGTH~LS-DFHCOMMAREA) RESP (CICSRESP) RESP2 (CICSRESP2)
          // PUT CONTAINER('CICS0010-COMAREA') CHANNEL('CLFR-CHANNEL') FROM(LS-DFHCOMMAREA) FLENGTH(FUNCTION~LENGTH~LS-DFHCOMMAREA) RESP (CICSRESP) RESP2 (CICSRESP2)
          // write data to a container
          	programCtx.getGlobalCtx().addContainer(String.valueOf(CONSTANTS.LITERAL_CICS0010_MN_COMAREA).trim(),methodIn.getLsDfhcommarea().toCharArray());
          
          methodIn.setCicsresp(programCtx.getCicsSession().getEibresp());
          methodIn.setCicsresp2(programCtx.getCicsSession().getEibresp2());
          	
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return methodOut;
      
      }
      /**
      * getRequest 
      *   This method is derived from 
  *   COBOL Paragraph - 0001-GET-REQUEST COBOL Cyclomatic complexity - 3
      * Input  :  

      * - cicsresp                       COBOL Name: CICSRESP
      * - cicsresp2                      COBOL Name: CICSRESP2
      *
      * Output :  

      * - containerLength                COBOL Name: CONTAINER-LENGTH
      * - lsReturnCode                   COBOL Name: LS-RETURN-CODE
      * - lsReturnEibresp                COBOL Name: LS-RETURN-EIBRESP
      * - cicsresp                       COBOL Name: CICSRESP
      * - lsReturnEibresp2               COBOL Name: LS-RETURN-EIBRESP2
      * - cicsresp2                      COBOL Name: CICSRESP2
      *
      * @throws CFException
      */
      @Override
      public GetRequestOutCtx getRequest(GetRequestInCtx methodIn) throws Exception {
Cics0010Ctx programCtx = methodIn.getCics0010Ctx();
GetRequestOutCtx methodOut = methodIn.getGetRequestOutCtx();
//  MOVE 1000 TO CONTAINER-LENGTH
          methodOut.setContainerLength(1000);
//  GET CONTAINER (CONTAINER-NAME) CHANNEL (CHANNEL-NAME) INTO (LS-REQUEST-DATA) FLENGTH (CONTAINER-LENGTH) NOHANDLE RESP (CICSRESP) RESP2 (CICSRESP2)
          // GET CONTAINER (CONTAINER-NAME) CHANNEL (CHANNEL-NAME) INTO (LS-REQUEST-DATA) FLENGTH (CONTAINER-LENGTH) NOHANDLE RESP (CICSRESP) RESP2 (CICSRESP2)
          // get data from a container
          	if(programCtx.getGlobalCtx().containerExists(String.valueOf(methodIn.getContainerName()).trim())) {
          		methodIn.setLsRequestData(programCtx.getGlobalCtx().fetchContainer(String.valueOf(methodIn.getContainerName()).trim()));
               } else {
               }
//  IF ( CICSRESP = 0 AND CICSRESP2 = 0 )
//  ELSE
          if ((	( methodOut.getCicsresp() != 0 ) || 	( methodOut.getCicsresp2() != 0 ))) { 
              // MOVE 12 TO LS-RETURN-CODE
              methodOut.setLsReturnCode(12);
              // MOVE CICSRESP TO LS-RETURN-EIBRESP
              methodOut.setLsReturnEibresp(methodOut.getCicsresp());
              // MOVE CICSRESP2 TO LS-RETURN-EIBRESP2
              methodOut.setLsReturnEibresp2(methodOut.getCicsresp2());
          }
      
      return methodOut;
      }
      /**
      * getRequest0002 
      *   This method is derived from 
  *   COBOL Paragraph - 0002-GET-REQUEST COBOL Cyclomatic complexity - 3
      * Input  :  

      * - cicsresp                       COBOL Name: CICSRESP
      * - cicsresp2                      COBOL Name: CICSRESP2
      *
      * Output :  

      * - requestData002                 COBOL Name: WS-002-REQUEST-DATA
      * - containerLength                COBOL Name: CONTAINER-LENGTH
      * - lsRequestData                  COBOL Name: LS-REQUEST-DATA
      * - lsReturnCode                   COBOL Name: LS-RETURN-CODE
      * - lsReturnEibresp                COBOL Name: LS-RETURN-EIBRESP
      * - cicsresp                       COBOL Name: CICSRESP
      * - lsReturnEibresp2               COBOL Name: LS-RETURN-EIBRESP2
      * - cicsresp2                      COBOL Name: CICSRESP2
      *
      * @throws CFException
      */
      @Override
      public GetRequest0002OutCtx getRequest0002(GetRequest0002InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			 final int REQUEST_DATA_002_LENGTH = 100;
			// End of variable declaration

      
// *
Cics0010Ctx programCtx = methodIn.getCics0010Ctx();
GetRequest0002OutCtx methodOut = methodIn.getGetRequest0002OutCtx();
          // MOVE SPACES TO WS-002-REQUEST-DATA
          methodOut.setRequestData002(CONSTANTS.SPACE_100);
//  MOVE LENGTH OF WS-002-REQUEST-DATA TO CONTAINER-LENGTH
          methodOut.setContainerLength(REQUEST_DATA_002_LENGTH);
//  GET CONTAINER (CONTAINER-NAME) CHANNEL (CHANNEL-NAME) INTO (WS-002-REQUEST-DATA) FLENGTH (CONTAINER-LENGTH) NOHANDLE RESP (CICSRESP) RESP2 (CICSRESP2)
          // GET CONTAINER (CONTAINER-NAME) CHANNEL (CHANNEL-NAME) INTO (WS-002-REQUEST-DATA) FLENGTH (CONTAINER-LENGTH) NOHANDLE RESP (CICSRESP) RESP2 (CICSRESP2)
          // get data from a container
          	if(programCtx.getGlobalCtx().containerExists(String.valueOf(methodIn.getContainerName()).trim())) {
          		methodOut.setRequestData002(programCtx.getGlobalCtx().fetchContainer(String.valueOf(methodIn.getContainerName()).trim()));
               } else {
               }
//  IF ( CICSRESP = 0 AND CICSRESP2 = 0 )
          if ((	( methodOut.getCicsresp() == 0 ) && 	( methodOut.getCicsresp2() == 0 ))) { 
//  MOVE WS-002-REQUEST-DATA TO LS-REQUEST-DATA
              methodOut.setLsRequestData(methodOut.getRequestData002());
          }
//  ELSE
          else { 
              // MOVE 12 TO LS-RETURN-CODE
              methodOut.setLsReturnCode(12);
              // MOVE CICSRESP TO LS-RETURN-EIBRESP
              methodOut.setLsReturnEibresp(methodOut.getCicsresp());
              // MOVE CICSRESP2 TO LS-RETURN-EIBRESP2
              methodOut.setLsReturnEibresp2(methodOut.getCicsresp2());
          }
      
      return methodOut;
      }
      /**
      * getRequest0003 
      *   This method is derived from 
  *   COBOL Paragraph - 0003-GET-REQUEST COBOL Cyclomatic complexity - 3
      * Input  :  

      * - cicsresp                       COBOL Name: CICSRESP
      * - cicsresp2                      COBOL Name: CICSRESP2
      * - ls003RequestData               COBOL Name: LS-003-REQUEST-DATA
      *
      * Output :  

      * - containerLength                COBOL Name: CONTAINER-LENGTH
      * - lsRequestData                  COBOL Name: LS-REQUEST-DATA
      * - ls003RequestData               COBOL Name: LS-003-REQUEST-DATA
      * - lsReturnCode                   COBOL Name: LS-RETURN-CODE
      * - lsReturnEibresp                COBOL Name: LS-RETURN-EIBRESP
      * - cicsresp                       COBOL Name: CICSRESP
      * - lsReturnEibresp2               COBOL Name: LS-RETURN-EIBRESP2
      * - cicsresp2                      COBOL Name: CICSRESP2
      *
      * @throws CFException
      */
      @Override
      public GetRequest0003OutCtx getRequest0003(GetRequest0003InCtx methodIn) throws Exception {
      
// *
Cics0010Ctx programCtx = methodIn.getCics0010Ctx();
GetRequest0003OutCtx methodOut = methodIn.getGetRequest0003OutCtx();
//  MOVE 100 TO CONTAINER-LENGTH
          methodOut.setContainerLength(100);
//  GET CONTAINER (CONTAINER-NAME) CHANNEL (CHANNEL-NAME) SET (ADDRESS OF LS-003-REQUEST-DATA) FLENGTH (CONTAINER-LENGTH) NOHANDLE RESP (CICSRESP) RESP2 (CICSRESP2)
          // GET CONTAINER (CONTAINER-NAME) CHANNEL (CHANNEL-NAME) SET (ADDRESS OF LS-003-REQUEST-DATA) FLENGTH (CONTAINER-LENGTH) NOHANDLE RESP (CICSRESP) RESP2 (CICSRESP2)
          // get data from a container
          	if(programCtx.getGlobalCtx().containerExists(String.valueOf(methodIn.getContainerName()).trim())) {
          		methodOut.setLs003RequestData(programCtx.getGlobalCtx().fetchContainer(String.valueOf(methodIn.getContainerName()).trim()));
               } else {
               }
//  IF ( CICSRESP = 0 AND CICSRESP2 = 0 )
          if ((	( methodOut.getCicsresp() == 0 ) && 	( methodOut.getCicsresp2() == 0 ))) { 
//  MOVE LS-003-REQUEST-DATA TO LS-REQUEST-DATA
              methodOut.setLsRequestData(methodOut.getLs003RequestData());
          }
//  ELSE
          else { 
              // MOVE 12 TO LS-RETURN-CODE
              methodOut.setLsReturnCode(12);
              // MOVE CICSRESP TO LS-RETURN-EIBRESP
              methodOut.setLsReturnEibresp(methodOut.getCicsresp());
              // MOVE CICSRESP2 TO LS-RETURN-EIBRESP2
              methodOut.setLsReturnEibresp2(methodOut.getCicsresp2());
          }
      
      return methodOut;
      }
  
  
  
      public int call(ProgramContext ctx, Object[] params) throws Exception {
      Cics0010Ctx programCtx = (Cics0010Ctx) ctx;
      
      int len = params.length;
         if (len > 1 && params[1] != null )
            programCtx.getDfhcommareaGroup().set((Field)params[1]);
         // invoke the process and return rc
         return process(programCtx);
         
      }
      
      public int call(ProgramContext ctx, Field... parameters) throws Exception {
      Cics0010Ctx programCtx = (Cics0010Ctx) ctx;
         for (int index = 0; index < parameters.length;index++) {
             switch(index) {
              case 1:
                      if(parameters[index] != null ) {
              		if (parameters[index] instanceof DfhcommareaGroup) {
                       	programCtx.setDfhcommareaGroup((DfhcommareaGroup) parameters[index]);
                  	} else {
                       	programCtx.getDfhcommareaGroup().set(parameters[index]);
                  	}
                  }
                
                  break;
            }
         }
      	return process(programCtx);
      }
      
      
  
  
  
  
  
  }
