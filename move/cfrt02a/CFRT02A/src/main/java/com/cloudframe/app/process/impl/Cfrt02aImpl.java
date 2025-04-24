  package com.cloudframe.app.process.impl;
  /* 
* this program illustrates nested performs
*/
  
  import com.cloudframe.app.cfrt02a.Cfrt02aCtx.*;
  import com.cloudframe.app.cfrt02a.Cfrt02aCtx;
  import com.cloudframe.app.process.Cfrt02a;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import com.cloudframe.app.exception.Terminate;
  import java.util.ArrayList;
  import com.cloudframe.app.data.Field;
  import java.util.Map;
  import java.util.HashMap;
  import com.cloudframe.app.cfrt02a.dto.*;
  import com.cloudframe.app.cfrt02a.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.utility.CFUtil;
  
  @Component("cfrt02a")
  
  public class Cfrt02aImpl extends CommonProcess implements Cfrt02a {
  
  Logger logger = LoggerFactory.getLogger(Cfrt02aImpl.class);
  
  
  
  
  
  
  
  
  
  
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      public int process(Cfrt02aCtx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
          ;
//  PERFORM PROGRAM-BEGIN
          programBegin(programCtx.getProgramBeginInCtx());/*PROGRAM-BEGIN*/
          if (programCtx.isProgramEnded()) {
              return programCtx.getRc();
          }
//  PERFORM PROGRAM-DONE
          programDone(programCtx);/*PROGRAM-DONE*/
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
      * programBegin 
      *   This method is derived from 
  *   COBOL Paragraph - PROGRAM-BEGIN COBOL Cyclomatic complexity - 5
      * Input  :  

      * - sub                            COBOL Name: WS-SUB
      * - inx                            COBOL Name: INX
      *
      * Output :  

      * - sub                            COBOL Name: WS-SUB
      * - theDisplay                     COBOL Name: THE-DISPLAY
      * - inx                            COBOL Name: INX
      * - aSpace                         COBOL Name: A-SPACE
      * - theNumber                      COBOL Name: THE-NUMBER
      * - theMessage                     COBOL Name: THE-MESSAGE
      *
      * @throws CFException
      */
      @Override
      public ProgramBeginOutCtx programBegin(ProgramBeginInCtx methodIn) throws Exception {
Cfrt02aCtx programCtx = methodIn.getCfrt02aCtx();
ProgramBeginOutCtx methodOut = methodIn.getProgramBeginOutCtx();
//  PERFORM VARYING WS-SUB FROM 1 BY 1 UNTIL WS-SUB > 605
          for (methodOut.setSub(1); (	( methodOut.getSub() <= 605 ) ) ; methodOut.setSub(methodOut.getSub() + 1) ) {
//  MOVE INX TO THE-DISPLAY ( WS-SUB : 1)
              methodOut.setTheDisplay(replace(methodOut.getTheDisplay(),String.valueOf(methodOut.getInxString()).toCharArray(),(methodOut.getSub()-1), (methodOut.getSub() + 0) ));
//  IF INX = 9 THEN
              if (	( methodOut.getInx() == 9 )) { 
                  // MOVE 0 TO INX
                  methodOut.setInx(0);
              }
//  ELSE
              else { 
//  ADD 1 TO INX
                  methodOut.setInx(methodOut.getInx()+1);
              }
          }

// * Initialize the space variable

// *    Start the-number at 0

// * Set up and display line 1
          // MOVE " " TO A-SPACE
          methodOut.setASpace(CONSTANTS.SPACE);
          // MOVE 0 TO THE-NUMBER
          methodOut.setTheNumber(0);
          // MOVE "THERE ONCE WAS A LADY FROM EIGER," TO THE-MESSAGE
          methodOut.setTheMessage(CONSTANTS.LITERAL_415191115);
//  PERFORM ADD-NUMBER-AND-DISPLAY
          addNumberAndDisplay(programCtx);/*ADD-NUMBER-AND-DISPLAY*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }

// * Set up and display line 2
          // MOVE "WHO SMILED AND RODE FORTH ON A TIGER." TO THE-MESSAGE
          methodOut.setTheMessage(CONSTANTS.LITERAL_34385685);
//  PERFORM ADD-NUMBER-AND-DISPLAY
          addNumberAndDisplay(programCtx);/*ADD-NUMBER-AND-DISPLAY*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }

// * Set up and display line 3
          // MOVE "THEY RETURNED FROM THE RIDE" TO THE-MESSAGE
          methodOut.setTheMessage(CONSTANTS.LITERAL_1362506716);
//  PERFORM ADD-NUMBER-AND-DISPLAY
          addNumberAndDisplay(programCtx);/*ADD-NUMBER-AND-DISPLAY*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }

// * Set up and display line 4
          // MOVE "WITH THE LADY INSIDE," TO THE-MESSAGE
          methodOut.setTheMessage(CONSTANTS.LITERAL_1792223421);
//  PERFORM ADD-NUMBER-AND-DISPLAY
          addNumberAndDisplay(programCtx);/*ADD-NUMBER-AND-DISPLAY*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }

// * Set up and display line 5
          // MOVE "AND THE SMILE ON THE FACE OF THE TIGER." TO THE-MESSAGE
          methodOut.setTheMessage(CONSTANTS.LITERAL_782950204);
//  PERFORM ADD-NUMBER-AND-DISPLAY
          addNumberAndDisplay(programCtx);/*ADD-NUMBER-AND-DISPLAY*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }
//  DISPLAY THE-DISPLAY
          logger.info(new String(methodOut.getTheDisplay())); 
      
      return methodOut;
      }
      /**
      * programDone 
      *   This method is derived from 
  *   COBOL Paragraph - PROGRAM-DONE COBOL Cyclomatic complexity - 2
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void programDone(Cfrt02aCtx programCtx) throws Exception {
//  STOP RUN
          throw Terminate.TERMINATE;
      
      }
      /**
      * addNumberAndDisplay 
      *   This method is derived from 
  *   COBOL Paragraph - ADD-NUMBER-AND-DISPLAY COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void addNumberAndDisplay(Cfrt02aCtx programCtx) throws Exception {
      
// * This paragraph is performed 5 times from within
// * program-begin. this paragraph in turn performs
// * two other paragraphs
//  PERFORM ADD-THE-NUMBER
          addTheNumber(programCtx.getAddTheNumberInCtx());/*ADD-THE-NUMBER*/
//  PERFORM DISPLAY-THE-MESSAGE
          displayTheMessage(programCtx.getDisplayTheMessageInCtx());/*DISPLAY-THE-MESSAGE*/
          ;
      
      }
      /**
      * addTheNumber 
      *   This method is derived from 
  *   COBOL Paragraph - ADD-THE-NUMBER COBOL Cyclomatic complexity - 1
      * Input  :  

      * - theNumber                      COBOL Name: THE-NUMBER
      *
      * Output :  

      * - theNumber                      COBOL Name: THE-NUMBER
      *
      * @throws CFException
      */
      @Override
      public AddTheNumberOutCtx addTheNumber(AddTheNumberInCtx methodIn) throws Exception {
      
// * Is performed.
Cfrt02aCtx programCtx = methodIn.getCfrt02aCtx();
AddTheNumberOutCtx methodOut = methodIn.getAddTheNumberOutCtx();
//  ADD 1 TO THE-NUMBER
          methodOut.setTheNumber(methodOut.getTheNumber()+1);
      
      return methodOut;
      }
      /**
      * displayTheMessage 
      *   This method is derived from 
  *   COBOL Paragraph - DISPLAY-THE-MESSAGE COBOL Cyclomatic complexity - 5
      * Input  :  

      * - theNumber                      COBOL Name: THE-NUMBER
      * - aSpace                         COBOL Name: A-SPACE
      * - theMessage                     COBOL Name: THE-MESSAGE
      * - start                          COBOL Name: WS-START
      *
      * Output :  

      * - stage                          COBOL Name: WS-STAGE
      * - theDisplay                     COBOL Name: THE-DISPLAY
      * - start                          COBOL Name: WS-START
      *
      * @throws CFException
      */
      @Override
      public DisplayTheMessageOutCtx displayTheMessage(DisplayTheMessageInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			// End of variable declaration

Cfrt02aCtx programCtx = methodIn.getCfrt02aCtx();
DisplayTheMessageOutCtx methodOut = methodIn.getDisplayTheMessageOutCtx();
//  STRING THE-NUMBER DELIMITED BY SIZE A-SPACE DELIMITED BY SIZE THE-MESSAGE DELIMITED BY SIZE INTO WS-STAGE END-STRING
          charArray = new ArrayList<char[]>();
             charArray.add(String.valueOf(methodIn.getTheNumberString()).toCharArray());
             charArray.add(methodIn.getASpace());
             charArray.add(methodIn.getTheMessage());
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2));
          updated = updateString(methodOut.getStage() ,joinCharArray);
          methodOut.setStage(  (char[])updated.get("string"));
//  MOVE WS-STAGE TO THE-DISPLAY ( WS-START : 60)
          methodOut.setTheDisplay(replace(methodOut.getTheDisplay(),methodOut.getStage(),(methodOut.getStart()-1), (methodOut.getStart() + 59) ));
//  ADD 121 TO WS-START
          methodOut.setStart( (short) (methodOut.getStart()+(short)121));
      
      return methodOut;
      }
  
  
  
  
  
  
  
  
  }
