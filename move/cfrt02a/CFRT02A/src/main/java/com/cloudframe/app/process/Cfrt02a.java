  package com.cloudframe.app.process;
  /* 
* this program illustrates nested performs
*/
  
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
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
  
  public class Cfrt02a extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Cfrt02a.class);
  
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
//  PERFORM PROGRAM-BEGIN
          programBegin();/*PROGRAM-BEGIN*/
          if (this.isProgramEnded()) {
              return getRc();
          }
//  PERFORM PROGRAM-DONE
          programDone();/*PROGRAM-DONE*/
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
      private void programBegin() throws Exception {
			// Declare local variables used in the method
			int inx = 0;
			// End of variable declaration

//  PERFORM VARYING WS-SUB FROM 1 BY 1 UNTIL WS-SUB > 605
          for (work.setSub(1); (	( work.getSub() <= 605 ) ) ; work.setSub(work.getSub() + 1) ) {
//  MOVE INX TO THE-DISPLAY ( WS-SUB : 1)
              work.setTheDisplay(replace(work.getTheDisplay(),String.valueOf(work.getInxString()).toCharArray(),(work.getSub()-1), (work.getSub() + 0) ));
              inx = work.getInx();
//  IF INX = 9 THEN
              if (	( inx == 9 )) { 
                  // MOVE 0 TO INX
                  work.setInx(0);
              }
  
//  ELSE
              else { 
//  ADD 1 TO INX
                  work.setInx(work.getInx()+1);
              }
          }

// * Initialize the space variable

// *    Start the-number at 0

// * Set up and display line 1
          // MOVE " " TO A-SPACE
          work.setASpace(CONSTANTS.SPACE);
          // MOVE 0 TO THE-NUMBER
          work.setTheNumber(0);
          // MOVE "THERE ONCE WAS A LADY FROM EIGER," TO THE-MESSAGE
          work.setTheMessage(CONSTANTS.LITERAL_415191115);
//  PERFORM ADD-NUMBER-AND-DISPLAY
          addNumberAndDisplay();/*ADD-NUMBER-AND-DISPLAY*/
          if (this.isProgramEnded()) {
              return ;
          }

// * Set up and display line 2
          // MOVE "WHO SMILED AND RODE FORTH ON A TIGER." TO THE-MESSAGE
          work.setTheMessage(CONSTANTS.LITERAL_34385685);
//  PERFORM ADD-NUMBER-AND-DISPLAY
          addNumberAndDisplay();/*ADD-NUMBER-AND-DISPLAY*/
          if (this.isProgramEnded()) {
              return ;
          }

// * Set up and display line 3
          // MOVE "THEY RETURNED FROM THE RIDE" TO THE-MESSAGE
          work.setTheMessage(CONSTANTS.LITERAL_1362506716);
//  PERFORM ADD-NUMBER-AND-DISPLAY
          addNumberAndDisplay();/*ADD-NUMBER-AND-DISPLAY*/
          if (this.isProgramEnded()) {
              return ;
          }

// * Set up and display line 4
          // MOVE "WITH THE LADY INSIDE," TO THE-MESSAGE
          work.setTheMessage(CONSTANTS.LITERAL_1792223421);
//  PERFORM ADD-NUMBER-AND-DISPLAY
          addNumberAndDisplay();/*ADD-NUMBER-AND-DISPLAY*/
          if (this.isProgramEnded()) {
              return ;
          }

// * Set up and display line 5
          // MOVE "AND THE SMILE ON THE FACE OF THE TIGER." TO THE-MESSAGE
          work.setTheMessage(CONSTANTS.LITERAL_782950204);
//  PERFORM ADD-NUMBER-AND-DISPLAY
          addNumberAndDisplay();/*ADD-NUMBER-AND-DISPLAY*/
          if (this.isProgramEnded()) {
              return ;
          }
//  DISPLAY THE-DISPLAY
          logger.info(new String(work.getTheDisplay())); 
      
      }
      /**
      * programDone 
      *   This method is derived from 
  *   COBOL Paragraph - PROGRAM-DONE COBOL Cyclomatic complexity - 2
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void programDone() throws Exception {
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
      private void addNumberAndDisplay() throws Exception {
      
// * This paragraph is performed 5 times from within
// * program-begin. this paragraph in turn performs
// * two other paragraphs
//  PERFORM ADD-THE-NUMBER
          addTheNumber();/*ADD-THE-NUMBER*/
//  PERFORM DISPLAY-THE-MESSAGE
          displayTheMessage();/*DISPLAY-THE-MESSAGE*/
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
      private void addTheNumber() throws Exception {
      
// * Is performed.
//  ADD 1 TO THE-NUMBER
          work.setTheNumber(work.getTheNumber()+1);
      
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
      private void displayTheMessage() throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			// End of variable declaration

//  STRING THE-NUMBER DELIMITED BY SIZE A-SPACE DELIMITED BY SIZE THE-MESSAGE DELIMITED BY SIZE INTO WS-STAGE END-STRING
          charArray = new ArrayList<char[]>();
             charArray.add(String.valueOf(work.getTheNumberString()).toCharArray());
             charArray.add(work.getASpace());
             charArray.add(work.getTheMessage());
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2));
          updated = updateString(work.getStage() ,joinCharArray);
          work.setStage(  (char[])updated.get("string"));
//  MOVE WS-STAGE TO THE-DISPLAY ( WS-START : 60)
          work.setTheDisplay(replace(work.getTheDisplay(),work.getStage(),(work.getStart()-1), (work.getStart() + 59) ));
//  ADD 121 TO WS-START
          work.setStart( (short) (work.getStart()+(short)121));
      
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
