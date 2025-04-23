  package com.cloudframe.app.process;
  /* 
****************************************************************
*          -- -- -- c o n f i d e n t i a l -- -- --           *
*    this item contains information and procedures which are   *
*    proprietary to mastercard international, incorporated,    *
*    and which are confidential.  it is provided with the      *
*    express understanding that it is to be used only for the  *
*    benefit of interbank card association, and is not to be   *
*    used, copied, or disclosed for any other purpose.  any    *
*    authorized reproduction (in whole or in part) of this     *
*    material must be marked with this legend.                 *
****************************************************************
*author.  satir rizvi.
*installation. mastercard international inc.
*date-written. mar,26 2007.
*****************************************************************
* this program will recieve up to 2 messages parse them         *
* this program will only return if an element is present, its   *
* starting postion in the record and it's length.  it is has    *
* written to be flexiable enough to handle all message types    *
*****************************************************************
*  language:       cobol ii                                     *
*  system name:    standin                                      *
*  frequency:      called                                       *
*  classification: subroutine                                   *
*****************************************************************
*  r e v i s i o n   h i s t o r y                              *
*****************************************************************
*****************************************************************
* ver *  date  *  rpi   *  pgmr     * modification              *
*****************************************************************
* 01  |03/26/07|rel 7.2 | satir     | initial version           *
*-----+--------+--------+-----------+---------------------------*
* 02  |05/07/07|rel 7.2 |arnold j.  | recompile for si583020    *
*     |        |        |trembley   | copybook correction.      *
*     |        |        |           | fixed bitmap loop count.  *
*-----+--------+--------+-----------+---------------------------*
* 03  |09/20/07|apsup07 |arnold j.  | add unique return codes   *
*     |        |        |trembley   | for different error       *
*     |        |        |           | conditions.               *
*-----+--------+--------+-----------+---------------------------*
* 04  |12/12/07|apsup07 |arnold j.  | recompile for si583020    *
*     |  2007  |        |trembley   | copybook corrections.     *
*     |        |        |           | see also si993010.        *
*-----+--------+--------+-----------+---------------------------*
* 05  |02/26/09|rel 9.1 |lanter     | limit mti to 0000-9999,   *
*     |        |        |           | restrict sub to 2048.     *
*     |        |        |           | 2000- 3000- 4000- 5000-   *
*-----+--------+--------+-----------+---------------------------*
* 06  |02/27/09|rel 9.1 |lanter     | allow second mti to be    *
*     |        |        |           | spaces or low values      *
*     |        |        |           | 1000- 4000-               *
*-----+--------+--------+-----------+---------------------------*
* 07  |08/01/09|rel 10.1|janakiram  | auth message expansion:   *
*     |        |c12010  |thumati    | 800-message is eliminated *
*     |        |        |           | from program and replaced *
*     |        |        |           | all it occurrences with   *
*     |        |        |           | 1000-data.                *
*-----+--------+--------+-----------+---------------------------*
* 08  |12/28/09|rel 10.2|lanter     | change for address pointer*
*     |        |c12442  |           | logic.                    *
*     |        |        |           |                           *
*-----+--------+--------+-----------+---------------------------*
* 09  |04/29/10|rel 10.2|urban      | added logic to 2000- to   *
*     |        |c12442  |           | not abend if asterisks are*
*     |        |        |           | present in mti-1          *
*-----+--------+--------+-----------+---------------------------*
* 10  |01/16/14|prod    |arnold j.  | allow '****' in mti-2 or  *
*     |        |support |trembley   | mti-1 for stand-in, to    *
*     |        |        |           | prevent pci exposure.     *
*-----+--------+--------+-----------+---------------------------*
*****************************************************************
*/
  
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import org.springframework.web.bind.annotation.RequestParam;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.si994010.dto.*;
  import com.cloudframe.app.si994010.dto.DataGroup1000;
  import com.cloudframe.app.si994010.dto.BitMap1800;
  import com.cloudframe.app.si994010.dto.ElementTable800;
  import com.cloudframe.app.si994010.dto.BitMap2800;
  import com.cloudframe.app.si994010.dto.Si530DataElementMaskArea;
  import com.cloudframe.app.si994010.dto.IdxGroup400;
  import com.cloudframe.app.si994010.dto.ParsingPatternValuesGroup500;
  import com.cloudframe.app.si994010.dto.Si520DeAndLengthsGroup;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.global.sharedvar.Si583ParserArea;
  import com.cloudframe.app.si994010.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("si994010")
  
  public class Si994010 extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Si994010.class);
  
  private DataGroup1000 dataGroup1000 = new DataGroup1000() ;
  private BitMap1800 bitMap1800 = new BitMap1800() ;
  private ElementTable800 elementTable800 = new ElementTable800() ;
  private BitMap2800 bitMap2800 = new BitMap2800() ;
  private Si530DataElementMaskArea si530DataElementMaskArea = new Si530DataElementMaskArea() ;
  private IdxGroup400 idxGroup400 = new IdxGroup400() ;
  private ParsingPatternValuesGroup500 parsingPatternValuesGroup500 = new ParsingPatternValuesGroup500() ;
  private Si520DeAndLengthsGroup si520DeAndLengthsGroup = new Si520DeAndLengthsGroup() ;
  private Work work = new Work() ;
  
  
  
  
  
  
  int idx500;
  int si583I1;
  int si583I2;
  int si520Idx;
  int idx800;
  
  
  
      public int setParameter(String dataGroup1000) throws Exception {
      		if(dataGroup1000 != null)
      		    this.dataGroup1000.setString(com.cloudframe.app.data.Field.getParm(dataGroup1000),new String(CONSTANTS.EBCDIC_ENCODING));
      		setInitDone(false);
      		process();
      		return getRc();
      }
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
//  PERFORM 0000-MAINLINE
          mainline();/*0000-MAINLINE*/
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
      * mainline 
      *   This method is derived from 
  *   COBOL Paragraph - 0000-MAINLINE COBOL Cyclomatic complexity - 8
      * Input  :  

      * - si583ReturnCode                COBOL Name: SI583-RETURN-CODE
      * - binaryZeros300                 COBOL Name: 300-BINARY-ZEROS
      * - sub800                         COBOL Name: 800-SUB
      * - maxMessage300                  COBOL Name: 300-MAX-MESSAGE
      * - si583Mti2                      COBOL Name: SI583-MTI-2
      *
      * Output : None 

      * @throws CFException
      */
      private void mainline() throws Exception {
			// Declare local variables used in the method
			short si583ReturnCode = 0;
			short binaryZeros300 = 0;
			short sub800 = 0;
			char[] si583Mti2 = null;
			int maxMessage300 = 0;
			// End of variable declaration

      
// *****************************************************************
// ***** Mainline required comment.*********************************
// *****************************************************************
//  PERFORM 1000-INITIALIZE-WORK-AREAS
          initializeWorkAreas();/*1000-INITIALIZE-WORK-AREAS*/
          if (this.isProgramEnded()) {
              return ;
          }
//  PERFORM 2000-GET-FIRST-MESSAGE
          getFirstMessage();/*2000-GET-FIRST-MESSAGE*/
          if (this.isProgramEnded()) {
              return ;
          }

// *    Perform varying si520-idx from 1 by 1 until si520-idx > 128
// *       display si520-tbl-fomat(si520-idx) ' **'
// *               si520-tbl-length(si520-idx)
// *    end-perform
          binaryZeros300 = work.getBinaryZeros300();
          si583ReturnCode = si583ParserArea.getSi583ReturnCode();
//  IF SI583-RETURN-CODE = 300-BINARY-ZEROS
          if (	( si583ReturnCode == binaryZeros300 )) { 
//  PERFORM 3000-PARSE-FIRST-MESSAGE
              parseFirstMessage();/*3000-PARSE-FIRST-MESSAGE*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
  
          maxMessage300 = work.getMaxMessage300();
          sub800 = work.getSub800();
//  IF 800-SUB < 300-MAX-MESSAGE
          if (	( sub800 < maxMessage300 ) ) { 
              binaryZeros300 = work.getBinaryZeros300();
              si583ReturnCode = si583ParserArea.getSi583ReturnCode();
//  IF SI583-RETURN-CODE = 300-BINARY-ZEROS
              if (	( si583ReturnCode == binaryZeros300 )) { 
//  PERFORM 4000-GET-SECOND-MESSAGE
                  getSecondMessage();/*4000-GET-SECOND-MESSAGE*/
                  if (this.isProgramEnded()) {
                      return ;
                  }
              }
  
              binaryZeros300 = work.getBinaryZeros300();
              si583ReturnCode = si583ParserArea.getSi583ReturnCode();
//  IF SI583-RETURN-CODE = 300-BINARY-ZEROS
              if (	( si583ReturnCode == binaryZeros300 )) { 
//  IF SI583-MTI-2 = SPACES OR LOW-VALUES
                  si583Mti2 = si583ParserArea.getSi583Mti2();
//  ELSE
                  if (        ( !allSpaces(si583Mti2)  ) && !( checkLowValue(si583Mti2) ) ) { 
//  PERFORM 5000-PARSE-SECOND-MESSAGE
                      parseSecondMessage();/*5000-PARSE-SECOND-MESSAGE*/
                      if (this.isProgramEnded()) {
                          return ;
                      }
                  }
  
              }
  
          }
  
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          this.setProgramEnded(true);
          return ;
      
      }
      /**
      * initializeWorkAreas 
      *   This method is derived from 
  *   COBOL Paragraph - 1000-INITIALIZE-WORK-AREAS COBOL Cyclomatic complexity - 3
      * Input  :  

      * - binaryZeros300                 COBOL Name: 300-BINARY-ZEROS
      * - si530DataElementMaskArea       COBOL Name: SI530-DATA-ELEMENT-MASK-AREA
      * - si583DataPtr                   COBOL Name: SI583-DATA-PTR
      * - errMsg8600                     COBOL Name: 600-ERR-MSG-8
      * - si583DataLength                COBOL Name: SI583-DATA-LENGTH
      * - binary1300                     COBOL Name: 300-BINARY-1
      *
      * Output :  

      * - si583ReturnCode                COBOL Name: SI583-RETURN-CODE
      * - si583DataElementInError        COBOL Name: SI583-DATA-ELEMENT-IN-ERROR
      * - binaryZeros300                 COBOL Name: 300-BINARY-ZEROS
      * - si583ReturnMessage             COBOL Name: SI583-RETURN-MESSAGE
      * - si583DataElementWorkArea1      COBOL Name: SI583-DATA-ELEMENT-WORK-AREA-1
      * - si583DataElementWorkArea2      COBOL Name: SI583-DATA-ELEMENT-WORK-AREA-2
      * - si530DataElementMaskArea       COBOL Name: SI530-DATA-ELEMENT-MASK-AREA
      * - si583Mti1                      COBOL Name: SI583-MTI-1
      * - si583Mti2                      COBOL Name: SI583-MTI-2
      * - errMsg8600                     COBOL Name: 600-ERR-MSG-8
      * - data1000                       COBOL Name: 1000-DATA
      * - maxMessage300                  COBOL Name: 300-MAX-MESSAGE
      *
      * @throws CFException
      */
      private void initializeWorkAreas() throws Exception {
			// Declare local variables used in the method
			int si583DataPtr = 0;
			int si583DataLength = 0;
			// End of variable declaration

      
// ******************************************************************
// ***** Get things ready to go.           **************************
// ******************************************************************
//  MOVE 300-BINARY-ZEROS TO SI583-RETURN-CODE SI583-DATA-ELEMENT-IN-ERROR
          si583ParserArea.setSi583ReturnCode(work.getBinaryZeros300());
          si583ParserArea.setSi583DataElementInError(work.getBinaryZeros300());
//  MOVE SPACES TO SI583-RETURN-MESSAGE
          si583ParserArea.setSi583ReturnMessage(CONSTANTS.SPACE_80);
          // MOVE SI530-DATA-ELEMENT-MASK-AREA TO SI583-DATA-ELEMENT-WORK-AREA-1 SI583-DATA-ELEMENT-WORK-AREA-2
          si583ParserArea.getSi583DataElementWorkArea1().setString(si530DataElementMaskArea.getCharArray());
          si583ParserArea.getSi583DataElementWorkArea2().setString(si530DataElementMaskArea.getCharArray());
//  MOVE ZEROS TO SI583-MTI-1 SI583-MTI-2
          si583ParserArea.setSi583Mti1(CONSTANTS.ZERO_4);
          si583ParserArea.setSi583Mti2(CONSTANTS.ZERO_4);
          si583DataPtr = si583ParserArea.getSi583DataPtr();
//  IF SI583-DATA-PTR = NULL
//  LITERAL_NULL = NULL
          if (compareChars(pad(4,String.valueOf(si583DataPtr),"0",CFUtil.LEFT_PAD),CONSTANTS.LITERAL_NULL) == 0) { 
//  SET 88-SI583-INVALID-PTR TO TRUE
              si583ParserArea.setSi583InvalidPtr88True(); 
              
//  MOVE 600-ERR-MSG-8 TO SI583-RETURN-MESSAGE
              si583ParserArea.setSi583ReturnMessage(work.getErrMsg8600());
          }
  
//  ELSE
          else { 
//  SET ADDRESS OF 1000-DATA TO SI583-DATA-PTR
              dataGroup1000.set(getObject(si583ParserArea.getSi583DataPtr())); 
              
          }
          si583DataLength = si583ParserArea.getSi583DataLength();
//  IF SI583-DATA-LENGTH > ZERO
          if (	( si583DataLength > 0 )) { 
              work.setMaxMessage300(si583ParserArea.getSi583DataLength() + work.getBinary1300());
          }
  
      
      }
      /**
      * getFirstMessage 
      *   This method is derived from 
  *   COBOL Paragraph - 2000-GET-FIRST-MESSAGE COBOL Cyclomatic complexity - 4
      * Input  :  

      * - data1000                       COBOL Name: 1000-DATA
      * - binary13300                    COBOL Name: 300-BINARY-13
      * - asterisks300                   COBOL Name: 300-ASTERISKS
      * - errMsg3600                     COBOL Name: 600-ERR-MSG-3
      * - element800                     COBOL Name: 800-ELEMENT
      * - charX300                       COBOL Name: 300-CHAR-X
      *
      * Output :  

      * - si583Mti1                      COBOL Name: SI583-MTI-1
      * - data1000                       COBOL Name: 1000-DATA
      * - bitMap1800                     COBOL Name: 800-BIT-MAP-1
      * - sub800                         COBOL Name: 800-SUB
      * - binary13300                    COBOL Name: 300-BINARY-13
      * - si583ReturnMessage             COBOL Name: SI583-RETURN-MESSAGE
      * - errMsg3600                     COBOL Name: 600-ERR-MSG-3
      * - si583ReturnCode                COBOL Name: SI583-RETURN-CODE
      * - si583DePresentInd1             COBOL Name: SI583-DE-PRESENT-IND-1
      *
      * @throws CFException
      */
      private void getFirstMessage() throws Exception {
			// Declare local variables used in the method
			char[] si583Mti1 = null;
			char[] asterisks300 = null;
			char[] charX300 = null;
			// End of variable declaration

      
// ******************************************************************
// ***** Move the message to the work area and begin analyzing. *****
// ******************************************************************
//  MOVE 1000-DATA (1 : 4) TO SI583-MTI-1
          si583ParserArea.setSi583Mti1(dataGroup1000.getData1000());
//  MOVE 1000-DATA (5 : 8) TO 800-BIT-MAP-1
          bitMap1800.replace(dataGroup1000/*parent*/,0+5 - 1/*fromOffset - (bitMap1800) */,8/*fromLen*/,0/*toOffset - (data1000) */,8/*toLen*/);
//  MOVE 300-BINARY-13 TO 800-SUB
          work.setSub800(work.getBinary13300());
          si583Mti1 = si583ParserArea.getSi583Mti1();
          asterisks300 = work.getAsterisks300();
//  IF SI583-MTI-1 IS NUMERIC OR SI583-MTI-1 = 300-ASTERISKS
          if (    isNumeric(si583Mti1) || 		compareChars(si583Mti1,asterisks300) == 0 ) { 
//  PERFORM 8000-EXPAND-THE-BIT-MAP
              expandTheBitMap();/*8000-EXPAND-THE-BIT-MAP*/
          }
  
//  ELSE
          else { 
//  MOVE 600-ERR-MSG-3 TO SI583-RETURN-MESSAGE
              si583ParserArea.setSi583ReturnMessage(work.getErrMsg3600());
//  SET 88-SI583-MTI1-ERROR TO TRUE
              si583ParserArea.setSi583Mti1Error88True(); 
              
          }
          charX300 = work.getCharX300();
//  IF 800-ELEMENT (1) = 300-CHAR-X
          if (		compareChars(elementTable800.getElement800(0),charX300) == 0 ) { 
//  SET 88-SI583-DE-PRESENT-1 (1) TO TRUE
              si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(0).setSi583DePresent188True(); 
              
          }
  
      
      }
      /**
      * parseFirstMessage 
      *   This method is derived from 
  *   COBOL Paragraph - 3000-PARSE-FIRST-MESSAGE COBOL Cyclomatic complexity - 9
      * Input  :  

      * - element800                     COBOL Name: 800-ELEMENT
      * - charX300                       COBOL Name: 300-CHAR-X
      * - binary128300                   COBOL Name: 300-BINARY-128
      * - binary64300                    COBOL Name: 300-BINARY-64
      * - binary1300                     COBOL Name: 300-BINARY-1
      * - binary2300                     COBOL Name: 300-BINARY-2
      * - idx800                         COBOL Name: 800-IDX
      * - si583ReturnCode                COBOL Name: SI583-RETURN-CODE
      * - binaryZeros300                 COBOL Name: 300-BINARY-ZEROS
      * - si520TblFomat                  COBOL Name: SI520-TBL-FOMAT
      * - sub800                         COBOL Name: 800-SUB
      * - maxMessage300                  COBOL Name: 300-MAX-MESSAGE
      * - errMsg7600                     COBOL Name: 600-ERR-MSG-7
      *
      * Output :  

      * - deMax300                       COBOL Name: 300-DE-MAX
      * - binary128300                   COBOL Name: 300-BINARY-128
      * - binary64300                    COBOL Name: 300-BINARY-64
      * - idx800                         COBOL Name: 800-IDX
      * - si583I1                        COBOL Name: SI583-I1
      * - si520Idx                       COBOL Name: SI520-IDX
      * - si583DePresentInd1             COBOL Name: SI583-DE-PRESENT-IND-1
      * - si583DataElementInError        COBOL Name: SI583-DATA-ELEMENT-IN-ERROR
      * - si583ReturnCode                COBOL Name: SI583-RETURN-CODE
      * - si583ReturnMessage             COBOL Name: SI583-RETURN-MESSAGE
      * - errMsg7600                     COBOL Name: 600-ERR-MSG-7
      *
      * @throws CFException
      */
      private void parseFirstMessage() throws Exception {
			// Declare local variables used in the method
			char[] charX300 = null;
			short sub800 = 0;
			int maxMessage300 = 0;
			// End of variable declaration

      
// ******************************************************************
// ***** Loop through message looking for data elements.   **********
// ******************************************************************
          charX300 = work.getCharX300();
//  IF 800-ELEMENT (1) = 300-CHAR-X
          if (		compareChars(elementTable800.getElement800(0),charX300) == 0 ) { 
//  MOVE 300-BINARY-128 TO 300-DE-MAX
              work.setDeMax300(work.getBinary128300());
          }
  
//  ELSE
          else { 
//  MOVE 300-BINARY-64 TO 300-DE-MAX
              work.setDeMax300(work.getBinary64300());
          }
//  PERFORM VARYING 800-IDX FROM 300-BINARY-2 BY 300-BINARY-1 UNTIL 800-IDX > 300-DE-MAX OR SI583-RETURN-CODE > 300-BINARY-ZEROS
          for (idx800 = work.getBinary2300(); (	( idx800 <= work.getDeMax300() )  && 	( si583ParserArea.getSi583ReturnCode() <= work.getBinaryZeros300() )) ; idx800 = idx800 + work.getBinary1300() ) {
              charX300 = work.getCharX300();
//  IF 800-ELEMENT ( 800-IDX ) = 300-CHAR-X
              if (		compareChars(elementTable800.getElement800(idx800 - 1),charX300) == 0 ) { 
//  SET SI583-I1 TO 800-IDX
                  si583I1 = idx800; 
                  
//  SET SI520-IDX TO 800-IDX
                  si520Idx = idx800; 
                  
//  SET 88-SI583-DE-PRESENT-1 ( SI583-I1 ) TO TRUE
                  si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(si583I1 - 1).setSi583DePresent188True(); 
                  
//  IF 88-SI520-FIXED-FORMAT ( SI520-IDX )
                  if ( si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(si520Idx - 1).isSi520FixedFormat88()  ) { 
//  PERFORM 3010-SETUP-FIXED
                      setupFixed();/*3010-SETUP-FIXED*/
                  }
//  ELSE
                  else { 
//  IF 88-SI520-VAR-FORMAT ( SI520-IDX )
                      if ( si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(si520Idx - 1).isSi520VarFormat88()  ) { 
//  PERFORM 3020-SETUP-VAR
                          setupVar();/*3020-SETUP-VAR*/
                      }
//  ELSE
                      else { 
//  PERFORM 3030-SETUP-UNUSED-ERROR
                          setupUnusedError();/*3030-SETUP-UNUSED-ERROR*/
                      }
                  }
                  maxMessage300 = work.getMaxMessage300();
                  sub800 = work.getSub800();
//  IF 800-SUB > 300-MAX-MESSAGE
                  if (	( sub800 > maxMessage300 ) ) { 
//  DISPLAY 'LTH1 ERROR ' 800-SUB ' > ' 300-MAX-MESSAGE
                      logger.info("LTH1 ERROR {} > {}", String.valueOf(work.getSub800()), String.valueOf(work.getMaxMessage300())); 
//  SET SI583-DATA-ELEMENT-IN-ERROR TO SI520-IDX
                      si583ParserArea.setSi583DataElementInError((short) si520Idx); 
                      
//  SET 88-SI583-LTH1-ERROR TO TRUE
                      si583ParserArea.setSi583Lth1Error88True(); 
                      
//  MOVE 600-ERR-MSG-7 TO SI583-RETURN-MESSAGE
                      si583ParserArea.setSi583ReturnMessage(work.getErrMsg7600());
                  }
  
              }
  
          }
      
      }
      /**
      * setupFixed 
      *   This method is derived from 
  *   COBOL Paragraph - 3010-SETUP-FIXED COBOL Cyclomatic complexity - 1
      * Input  :  

      * - sub800                         COBOL Name: 800-SUB
      * - si520TblLength                 COBOL Name: SI520-TBL-LENGTH
      *
      * Output :  

      * - si583DeStartingPos1            COBOL Name: SI583-DE-STARTING-POS-1
      * - sub800                         COBOL Name: 800-SUB
      * - si583DeLength1                 COBOL Name: SI583-DE-LENGTH-1
      * - si520TblLength                 COBOL Name: SI520-TBL-LENGTH
      *
      * @throws CFException
      */
      private void setupFixed() throws Exception {
      
// ******************************************************************
// ***** Establish start and fixed end positions.      **************
// ******************************************************************
//  MOVE 800-SUB TO SI583-DE-STARTING-POS-1 ( SI583-I1 )
          si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(si583I1 - 1).setSi583DeStartingPos1(work.getSub800());
//  MOVE SI520-TBL-LENGTH ( SI520-IDX ) TO SI583-DE-LENGTH-1 ( SI583-I1 )
          si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(si583I1 - 1).setSi583DeLength1(si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(si520Idx - 1).getSi520TblLength());
//  ADD SI520-TBL-LENGTH ( SI520-IDX ) TO 800-SUB
          work.setSub800( (short) (work.getSub800()+si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(si520Idx - 1).getSi520TblLength()));
//  DISPLAY '*1* ' SI520-TBL-LENGTH ( SI520-IDX ) '  ' 800-SUB
          logger.info("*1* {}  {}", String.valueOf(si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(si520Idx - 1).getSi520TblLength()), String.valueOf(work.getSub800())); 
      
      }
      /**
      * setupVar 
      *   This method is derived from 
  *   COBOL Paragraph - 3020-SETUP-VAR COBOL Cyclomatic complexity - 2
      * Input  :  

      * - sub800                         COBOL Name: 800-SUB
      * - si520TblLength                 COBOL Name: SI520-TBL-LENGTH
      * - data1000                       COBOL Name: 1000-DATA
      * - si520Idx                       COBOL Name: SI520-IDX
      * - errMsg5600                     COBOL Name: 600-ERR-MSG-5
      *
      * Output :  

      * - si583DeLength1                 COBOL Name: SI583-DE-LENGTH-1
      * - data1000                       COBOL Name: 1000-DATA
      * - sub800                         COBOL Name: 800-SUB
      * - si583DeStartingPos1            COBOL Name: SI583-DE-STARTING-POS-1
      * - si583DataElementInError        COBOL Name: SI583-DATA-ELEMENT-IN-ERROR
      * - si583ReturnCode                COBOL Name: SI583-RETURN-CODE
      * - si583ReturnMessage             COBOL Name: SI583-RETURN-MESSAGE
      * - errMsg5600                     COBOL Name: 600-ERR-MSG-5
      *
      * @throws CFException
      */
      private void setupVar() throws Exception {
			// Declare local variables used in the method
			char[] data1000 = null;
			// End of variable declaration

      
// ******************************************************************
// ***** Establish start and variable end positions.     ************
// ******************************************************************
//  DISPLAY '*7* ' 800-SUB '  ' SI520-TBL-LENGTH ( SI520-IDX )
          logger.info("*7* {}  {}", String.valueOf(work.getSub800()), String.valueOf(si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(si520Idx - 1).getSi520TblLength())); 
          data1000 = dataGroup1000.getData1000();
//  IF 1000-DATA ( 800-SUB : SI520-TBL-LENGTH ( SI520-IDX )) NUMERIC
          if (    isNumeric(substring(data1000,(work.getSub800()-1), (si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(si520Idx - 1).getSi520TblLength() + (work.getSub800() - 1)) ))) { 
//  MOVE 1000-DATA ( 800-SUB : SI520-TBL-LENGTH ( SI520-IDX )) TO SI583-DE-LENGTH-1 ( SI583-I1 )
              si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(si583I1 - 1).setSi583DeLength1(CFUtil.getShort(substring(dataGroup1000.getData1000(),(work.getSub800()-1), (si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(si520Idx - 1).getSi520TblLength() + (work.getSub800() - 1)) )));
//  ADD SI520-TBL-LENGTH ( SI520-IDX ) TO 800-SUB
              work.setSub800( (short) (work.getSub800()+si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(si520Idx - 1).getSi520TblLength()));
//  DISPLAY '*2* ' SI520-TBL-LENGTH ( SI520-IDX ) '  ' 800-SUB
              logger.info("*2* {}  {}", String.valueOf(si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(si520Idx - 1).getSi520TblLength()), String.valueOf(work.getSub800())); 
//  MOVE 800-SUB TO SI583-DE-STARTING-POS-1 ( SI583-I1 )
              si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(si583I1 - 1).setSi583DeStartingPos1(work.getSub800());
//  ADD SI583-DE-LENGTH-1 ( SI583-I1 ) TO 800-SUB
              work.setSub800( (short) (work.getSub800()+si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(si583I1 - 1).getSi583DeLength1()));
//  DISPLAY '*3* ' SI583-DE-LENGTH-1 ( SI583-I1 ) '  ' 800-SUB
              logger.info("*3* {}  {}", String.valueOf(si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(si583I1 - 1).getSi583DeLength1()), String.valueOf(work.getSub800())); 
          }
  
//  ELSE
          else { 
//  DISPLAY 'LTH1 ERROR '
              logger.info("LTH1 ERROR "); 
//  DISPLAY 1000-DATA ( 800-SUB : SI520-TBL-LENGTH ( SI520-IDX )) ' IS NOT NUMERIC'
              logger.info("{} IS NOT NUMERIC", new String(substring(dataGroup1000.getData1000(),(work.getSub800()-1), (si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(si520Idx - 1).getSi520TblLength() + (work.getSub800() - 1)) ))); 
//  SET SI583-DATA-ELEMENT-IN-ERROR TO SI520-IDX
              si583ParserArea.setSi583DataElementInError((short) si520Idx); 
              
//  SET 88-SI583-LTH1-ERROR TO TRUE
              si583ParserArea.setSi583Lth1Error88True(); 
              
//  MOVE 600-ERR-MSG-5 TO SI583-RETURN-MESSAGE
              si583ParserArea.setSi583ReturnMessage(work.getErrMsg5600());
          }
      
      }
      /**
      * setupUnusedError 
      *   This method is derived from 
  *   COBOL Paragraph - 3030-SETUP-UNUSED-ERROR COBOL Cyclomatic complexity - 1
      * Input  :  

      * - si520Idx                       COBOL Name: SI520-IDX
      * - errMsg1600                     COBOL Name: 600-ERR-MSG-1
      *
      * Output :  

      * - si583DataElementInError        COBOL Name: SI583-DATA-ELEMENT-IN-ERROR
      * - si583ReturnCode                COBOL Name: SI583-RETURN-CODE
      * - si583ReturnMessage             COBOL Name: SI583-RETURN-MESSAGE
      * - errMsg1600                     COBOL Name: 600-ERR-MSG-1
      *
      * @throws CFException
      */
      private void setupUnusedError() throws Exception {
      
// ******************************************************************
// ***** It is an error if an unused de has its bit flag on.  *******
// ******************************************************************
//  SET SI583-DATA-ELEMENT-IN-ERROR TO SI520-IDX
          si583ParserArea.setSi583DataElementInError((short) si520Idx); 
          
//  SET 88-SI583-DEF1-ERROR TO TRUE
          si583ParserArea.setSi583Def1Error88True(); 
          
//  MOVE 600-ERR-MSG-1 TO SI583-RETURN-MESSAGE
          si583ParserArea.setSi583ReturnMessage(work.getErrMsg1600());
      
      }
      /**
      * getSecondMessage 
      *   This method is derived from 
  *   COBOL Paragraph - 4000-GET-SECOND-MESSAGE COBOL Cyclomatic complexity - 6
      * Input  :  

      * - data1000                       COBOL Name: 1000-DATA
      * - sub800                         COBOL Name: 800-SUB
      * - binary4300                     COBOL Name: 300-BINARY-4
      * - binary8300                     COBOL Name: 300-BINARY-8
      * - asterisks300                   COBOL Name: 300-ASTERISKS
      * - element800                     COBOL Name: 800-ELEMENT
      * - charX300                       COBOL Name: 300-CHAR-X
      * - si520Idx                       COBOL Name: SI520-IDX
      * - errMsg4600                     COBOL Name: 600-ERR-MSG-4
      *
      * Output :  

      * - si583Mti2                      COBOL Name: SI583-MTI-2
      * - data1000                       COBOL Name: 1000-DATA
      * - sub800                         COBOL Name: 800-SUB
      * - bitMap1800                     COBOL Name: 800-BIT-MAP-1
      * - si583DePresentInd2             COBOL Name: SI583-DE-PRESENT-IND-2
      * - si583DataElementInError        COBOL Name: SI583-DATA-ELEMENT-IN-ERROR
      * - si583ReturnCode                COBOL Name: SI583-RETURN-CODE
      * - si583ReturnMessage             COBOL Name: SI583-RETURN-MESSAGE
      * - errMsg4600                     COBOL Name: 600-ERR-MSG-4
      *
      * @throws CFException
      */
      private void getSecondMessage() throws Exception {
			// Declare local variables used in the method
			char[] si583Mti2 = null;
			char[] charX300 = null;
			char[] asterisks300 = null;
			// End of variable declaration

      
// ******************************************************************
// ***** Repeat the steps looking for a possible second message. ****
// ******************************************************************
//  MOVE 1000-DATA ( 800-SUB : 4) TO SI583-MTI-2
          si583ParserArea.replace(dataGroup1000/*parent*/,0+work.getSub800() - 1/*fromOffset - (si583Mti2) */,4/*fromLen*/,96/*toOffset - (data1000) */,4/*toLen*/);
//  ADD 300-BINARY-4 TO 800-SUB
          work.setSub800( (short) (work.getSub800()+work.getBinary4300()));
//  MOVE 1000-DATA ( 800-SUB : 8) TO 800-BIT-MAP-1
          bitMap1800.replace(dataGroup1000/*parent*/,0+work.getSub800() - 1/*fromOffset - (bitMap1800) */,8/*fromLen*/,0/*toOffset - (data1000) */,8/*toLen*/);
//  ADD 300-BINARY-8 TO 800-SUB
          work.setSub800( (short) (work.getSub800()+work.getBinary8300()));
//  IF SI583-MTI-2 = SPACES OR LOW-VALUES
          si583Mti2 = si583ParserArea.getSi583Mti2();
//  ELSE
          if (        ( !allSpaces(si583Mti2)  ) && !( checkLowValue(si583Mti2) ) ) { 
              si583Mti2 = si583ParserArea.getSi583Mti2();
              asterisks300 = work.getAsterisks300();
//  IF SI583-MTI-2 IS NUMERIC OR SI583-MTI-2 = 300-ASTERISKS
              if (    isNumeric(si583Mti2) || 		compareChars(si583Mti2,asterisks300) == 0 ) { 
//  PERFORM 8000-EXPAND-THE-BIT-MAP
                  expandTheBitMap();/*8000-EXPAND-THE-BIT-MAP*/
                  charX300 = work.getCharX300();
//  IF 800-ELEMENT (1) = 300-CHAR-X
                  if (		compareChars(elementTable800.getElement800(0),charX300) == 0 ) { 
//  SET 88-SI583-DE-PRESENT-2 (1) TO TRUE
                      si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(0).setSi583DePresent288True(); 
                      
                  }
  
              }
  
//  ELSE
              else { 
//  SET SI583-DATA-ELEMENT-IN-ERROR TO SI520-IDX
                  si583ParserArea.setSi583DataElementInError((short) si520Idx); 
                  
//  SET 88-SI583-MTI2-ERROR TO TRUE
                  si583ParserArea.setSi583Mti2Error88True(); 
                  
//  MOVE 600-ERR-MSG-4 TO SI583-RETURN-MESSAGE
                  si583ParserArea.setSi583ReturnMessage(work.getErrMsg4600());
              }
          }
  
      
      }
      /**
      * parseSecondMessage 
      *   This method is derived from 
  *   COBOL Paragraph - 5000-PARSE-SECOND-MESSAGE COBOL Cyclomatic complexity - 9
      * Input  :  

      * - element800                     COBOL Name: 800-ELEMENT
      * - charX300                       COBOL Name: 300-CHAR-X
      * - binary128300                   COBOL Name: 300-BINARY-128
      * - binary64300                    COBOL Name: 300-BINARY-64
      * - binary1300                     COBOL Name: 300-BINARY-1
      * - binary2300                     COBOL Name: 300-BINARY-2
      * - idx800                         COBOL Name: 800-IDX
      * - si583ReturnCode                COBOL Name: SI583-RETURN-CODE
      * - binaryZeros300                 COBOL Name: 300-BINARY-ZEROS
      * - si520TblFomat                  COBOL Name: SI520-TBL-FOMAT
      * - sub800                         COBOL Name: 800-SUB
      * - maxMessage300                  COBOL Name: 300-MAX-MESSAGE
      * - errMsg7600                     COBOL Name: 600-ERR-MSG-7
      *
      * Output :  

      * - deMax300                       COBOL Name: 300-DE-MAX
      * - binary128300                   COBOL Name: 300-BINARY-128
      * - binary64300                    COBOL Name: 300-BINARY-64
      * - idx800                         COBOL Name: 800-IDX
      * - si583I2                        COBOL Name: SI583-I2
      * - si520Idx                       COBOL Name: SI520-IDX
      * - si583DePresentInd2             COBOL Name: SI583-DE-PRESENT-IND-2
      * - si583DataElementInError        COBOL Name: SI583-DATA-ELEMENT-IN-ERROR
      * - si583ReturnCode                COBOL Name: SI583-RETURN-CODE
      * - si583ReturnMessage             COBOL Name: SI583-RETURN-MESSAGE
      * - errMsg7600                     COBOL Name: 600-ERR-MSG-7
      *
      * @throws CFException
      */
      private void parseSecondMessage() throws Exception {
			// Declare local variables used in the method
			char[] charX300 = null;
			short sub800 = 0;
			int maxMessage300 = 0;
			// End of variable declaration

      
// ******************************************************************
// ***** The second message has its own results area in the copybook*
// ******************************************************************
          charX300 = work.getCharX300();
//  IF 800-ELEMENT (1) = 300-CHAR-X
          if (		compareChars(elementTable800.getElement800(0),charX300) == 0 ) { 
//  MOVE 300-BINARY-128 TO 300-DE-MAX
              work.setDeMax300(work.getBinary128300());
          }
  
//  ELSE
          else { 
//  MOVE 300-BINARY-64 TO 300-DE-MAX
              work.setDeMax300(work.getBinary64300());
          }
//  PERFORM VARYING 800-IDX FROM 300-BINARY-2 BY 300-BINARY-1 UNTIL 800-IDX > 300-DE-MAX OR SI583-RETURN-CODE > 300-BINARY-ZEROS
          for (idx800 = work.getBinary2300(); (	( idx800 <= work.getDeMax300() )  && 	( si583ParserArea.getSi583ReturnCode() <= work.getBinaryZeros300() )) ; idx800 = idx800 + work.getBinary1300() ) {
              charX300 = work.getCharX300();
//  IF 800-ELEMENT ( 800-IDX ) = 300-CHAR-X
              if (		compareChars(elementTable800.getElement800(idx800 - 1),charX300) == 0 ) { 
//  SET SI583-I2 TO 800-IDX
                  si583I2 = idx800; 
                  
//  SET SI520-IDX TO 800-IDX
                  si520Idx = idx800; 
                  
//  SET 88-SI583-DE-PRESENT-2 ( SI583-I2 ) TO TRUE
                  si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(si583I2 - 1).setSi583DePresent288True(); 
                  
//  IF 88-SI520-FIXED-FORMAT ( SI520-IDX )
                  if ( si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(si520Idx - 1).isSi520FixedFormat88()  ) { 
//  PERFORM 5010-SETUP-FIXED
                      setupFixed5010();/*5010-SETUP-FIXED*/
                  }
//  ELSE
                  else { 
//  IF 88-SI520-VAR-FORMAT ( SI520-IDX )
                      if ( si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(si520Idx - 1).isSi520VarFormat88()  ) { 
//  PERFORM 5020-SETUP-VAR
                          setupVar5020();/*5020-SETUP-VAR*/
                      }
//  ELSE
                      else { 
//  PERFORM 5030-SETUP-UNUSED-ERROR
                          setupUnusedError5030();/*5030-SETUP-UNUSED-ERROR*/
                      }
                  }
                  maxMessage300 = work.getMaxMessage300();
                  sub800 = work.getSub800();
//  IF 800-SUB > 300-MAX-MESSAGE
                  if (	( sub800 > maxMessage300 ) ) { 
//  SET SI583-DATA-ELEMENT-IN-ERROR TO SI520-IDX
                      si583ParserArea.setSi583DataElementInError((short) si520Idx); 
                      
//  SET 88-SI583-LTH2-ERROR TO TRUE
                      si583ParserArea.setSi583Lth2Error88True(); 
                      
//  MOVE 600-ERR-MSG-7 TO SI583-RETURN-MESSAGE
                      si583ParserArea.setSi583ReturnMessage(work.getErrMsg7600());
                  }
  
              }
  
          }
      
      }
      /**
      * setupFixed5010 
      *   This method is derived from 
  *   COBOL Paragraph - 5010-SETUP-FIXED COBOL Cyclomatic complexity - 1
      * Input  :  

      * - sub800                         COBOL Name: 800-SUB
      * - si520TblLength                 COBOL Name: SI520-TBL-LENGTH
      *
      * Output :  

      * - si583DeStartingPos2            COBOL Name: SI583-DE-STARTING-POS-2
      * - sub800                         COBOL Name: 800-SUB
      * - si583DeLength2                 COBOL Name: SI583-DE-LENGTH-2
      * - si520TblLength                 COBOL Name: SI520-TBL-LENGTH
      *
      * @throws CFException
      */
      private void setupFixed5010() throws Exception {
      
// ******************************************************************
// ***** Repeat of fixed.                                    ********
// ******************************************************************
//  MOVE 800-SUB TO SI583-DE-STARTING-POS-2 ( SI583-I2 )
          si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(si583I2 - 1).setSi583DeStartingPos2(work.getSub800());
//  MOVE SI520-TBL-LENGTH ( SI520-IDX ) TO SI583-DE-LENGTH-2 ( SI583-I2 )
          si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(si583I2 - 1).setSi583DeLength2(si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(si520Idx - 1).getSi520TblLength());
//  ADD SI520-TBL-LENGTH ( SI520-IDX ) TO 800-SUB
          work.setSub800( (short) (work.getSub800()+si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(si520Idx - 1).getSi520TblLength()));
//  DISPLAY '*4* ' SI520-TBL-LENGTH ( SI520-IDX ) '  ' 800-SUB
          logger.info("*4* {}  {}", String.valueOf(si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(si520Idx - 1).getSi520TblLength()), String.valueOf(work.getSub800())); 
      
      }
      /**
      * setupVar5020 
      *   This method is derived from 
  *   COBOL Paragraph - 5020-SETUP-VAR COBOL Cyclomatic complexity - 2
      * Input  :  

      * - data1000                       COBOL Name: 1000-DATA
      * - sub800                         COBOL Name: 800-SUB
      * - si520TblLength                 COBOL Name: SI520-TBL-LENGTH
      * - si520Idx                       COBOL Name: SI520-IDX
      * - errMsg6600                     COBOL Name: 600-ERR-MSG-6
      *
      * Output :  

      * - si583DeLength2                 COBOL Name: SI583-DE-LENGTH-2
      * - data1000                       COBOL Name: 1000-DATA
      * - sub800                         COBOL Name: 800-SUB
      * - si583DeStartingPos2            COBOL Name: SI583-DE-STARTING-POS-2
      * - si583DataElementInError        COBOL Name: SI583-DATA-ELEMENT-IN-ERROR
      * - si583ReturnCode                COBOL Name: SI583-RETURN-CODE
      * - si583ReturnMessage             COBOL Name: SI583-RETURN-MESSAGE
      * - errMsg6600                     COBOL Name: 600-ERR-MSG-6
      *
      * @throws CFException
      */
      private void setupVar5020() throws Exception {
			// Declare local variables used in the method
			char[] data1000 = null;
			// End of variable declaration

      
// ******************************************************************
// ***** Repeat of variable.                                 ********
// ******************************************************************

// *    Display '*dbg* ' 800-sub ' * ' si520-tbl-length(si520-idx)
// *    display '*dbg* ' 800-sub ' * '
// *    display '*dbg* '         ' * ' si520-tbl-length(si520-idx)
// *    display '*dbg* '         ' * '
// *    ' *' 1000-data (800-sub:si520-tbl-length(si520-idx))
          data1000 = dataGroup1000.getData1000();
//  IF 1000-DATA ( 800-SUB : SI520-TBL-LENGTH ( SI520-IDX )) NUMERIC
          if (    isNumeric(substring(data1000,(work.getSub800()-1), (si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(si520Idx - 1).getSi520TblLength() + (work.getSub800() - 1)) ))) { 
//  MOVE 1000-DATA ( 800-SUB : SI520-TBL-LENGTH ( SI520-IDX )) TO SI583-DE-LENGTH-2 ( SI583-I2 )
              si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(si583I2 - 1).setSi583DeLength2(CFUtil.getShort(substring(dataGroup1000.getData1000(),(work.getSub800()-1), (si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(si520Idx - 1).getSi520TblLength() + (work.getSub800() - 1)) )));
//  ADD SI520-TBL-LENGTH ( SI520-IDX ) TO 800-SUB
              work.setSub800( (short) (work.getSub800()+si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(si520Idx - 1).getSi520TblLength()));
//  DISPLAY '*5* ' SI520-TBL-LENGTH ( SI520-IDX ) '  ' 800-SUB
              logger.info("*5* {}  {}", String.valueOf(si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(si520Idx - 1).getSi520TblLength()), String.valueOf(work.getSub800())); 
//  MOVE 800-SUB TO SI583-DE-STARTING-POS-2 ( SI583-I2 )
              si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(si583I2 - 1).setSi583DeStartingPos2(work.getSub800());
//  ADD SI583-DE-LENGTH-2 ( SI583-I2 ) TO 800-SUB
              work.setSub800( (short) (work.getSub800()+si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(si583I2 - 1).getSi583DeLength2()));
          }
  
//  ELSE
          else { 
//  SET SI583-DATA-ELEMENT-IN-ERROR TO SI520-IDX
              si583ParserArea.setSi583DataElementInError((short) si520Idx); 
              
//  SET 88-SI583-LTH2-ERROR TO TRUE
              si583ParserArea.setSi583Lth2Error88True(); 
              
//  MOVE 600-ERR-MSG-6 TO SI583-RETURN-MESSAGE
              si583ParserArea.setSi583ReturnMessage(work.getErrMsg6600());
          }
      
      }
      /**
      * setupUnusedError5030 
      *   This method is derived from 
  *   COBOL Paragraph - 5030-SETUP-UNUSED-ERROR COBOL Cyclomatic complexity - 1
      * Input  :  

      * - si520Idx                       COBOL Name: SI520-IDX
      * - errMsg2600                     COBOL Name: 600-ERR-MSG-2
      *
      * Output :  

      * - si583DataElementInError        COBOL Name: SI583-DATA-ELEMENT-IN-ERROR
      * - si583ReturnCode                COBOL Name: SI583-RETURN-CODE
      * - si583ReturnMessage             COBOL Name: SI583-RETURN-MESSAGE
      * - errMsg2600                     COBOL Name: 600-ERR-MSG-2
      *
      * @throws CFException
      */
      private void setupUnusedError5030() throws Exception {
      
// ******************************************************************
// ***** Repeat of unused.                                   ********
// ******************************************************************
//  SET SI583-DATA-ELEMENT-IN-ERROR TO SI520-IDX
          si583ParserArea.setSi583DataElementInError((short) si520Idx); 
          
//  SET 88-SI583-DEF2-ERROR TO TRUE
          si583ParserArea.setSi583Def2Error88True(); 
          
//  MOVE 600-ERR-MSG-2 TO SI583-RETURN-MESSAGE
          si583ParserArea.setSi583ReturnMessage(work.getErrMsg2600());
      
      }
      /**
      * expandTheBitMap 
      *   This method is derived from 
  *   COBOL Paragraph - 8000-EXPAND-THE-BIT-MAP COBOL Cyclomatic complexity - 2
      * Input  :  

      * - bitMapByte1800                 COBOL Name: 800-BIT-MAP-BYTE-1
      * - idx400                         COBOL Name: 400-IDX
      * - parsingPattern500              COBOL Name: 500-PARSING-PATTERN
      * - bitMapByte2800                 COBOL Name: 800-BIT-MAP-BYTE-2
      * - bitMapByte3800                 COBOL Name: 800-BIT-MAP-BYTE-3
      * - bitMapByte4800                 COBOL Name: 800-BIT-MAP-BYTE-4
      * - bitMapByte5800                 COBOL Name: 800-BIT-MAP-BYTE-5
      * - bitMapByte6800                 COBOL Name: 800-BIT-MAP-BYTE-6
      * - bitMapByte7800                 COBOL Name: 800-BIT-MAP-BYTE-7
      * - bitMapByte8800                 COBOL Name: 800-BIT-MAP-BYTE-8
      * - charX300                       COBOL Name: 300-CHAR-X
      * - data1000                       COBOL Name: 1000-DATA
      * - sub800                         COBOL Name: 800-SUB
      * - binary8300                     COBOL Name: 300-BINARY-8
      *
      * Output :  

      * - idxX400                        COBOL Name: 400-IDX-X
      * - bitMapByte1800                 COBOL Name: 800-BIT-MAP-BYTE-1
      * - idx500                         COBOL Name: 500-IDX
      * - elementTable800                COBOL Name: 800-ELEMENT-TABLE
      * - parsingPattern500              COBOL Name: 500-PARSING-PATTERN
      * - bitMapByte2800                 COBOL Name: 800-BIT-MAP-BYTE-2
      * - bitMapByte3800                 COBOL Name: 800-BIT-MAP-BYTE-3
      * - bitMapByte4800                 COBOL Name: 800-BIT-MAP-BYTE-4
      * - bitMapByte5800                 COBOL Name: 800-BIT-MAP-BYTE-5
      * - bitMapByte6800                 COBOL Name: 800-BIT-MAP-BYTE-6
      * - bitMapByte7800                 COBOL Name: 800-BIT-MAP-BYTE-7
      * - bitMapByte8800                 COBOL Name: 800-BIT-MAP-BYTE-8
      * - element800                     COBOL Name: 800-ELEMENT
      * - bitMap2800                     COBOL Name: 800-BIT-MAP-2
      * - data1000                       COBOL Name: 1000-DATA
      * - sub800                         COBOL Name: 800-SUB
      * - bitMapByte9800                 COBOL Name: 800-BIT-MAP-BYTE-9
      * - bitMapByte10800                COBOL Name: 800-BIT-MAP-BYTE-10
      * - bitMapByte11800                COBOL Name: 800-BIT-MAP-BYTE-11
      * - bitMapByte12800                COBOL Name: 800-BIT-MAP-BYTE-12
      * - bitMapByte13800                COBOL Name: 800-BIT-MAP-BYTE-13
      * - bitMapByte14800                COBOL Name: 800-BIT-MAP-BYTE-14
      * - bitMapByte15800                COBOL Name: 800-BIT-MAP-BYTE-15
      * - bitMapByte16800                COBOL Name: 800-BIT-MAP-BYTE-16
      *
      * @throws CFException
      */
      private void expandTheBitMap() throws Exception {
			// Declare local variables used in the method
			char[] charX300 = null;
			// End of variable declaration

      
// ******************************************************************
// ***** Turn the binary bit map into an addressable byte map. ******
// ******************************************************************
//  MOVE 800-BIT-MAP-BYTE-1 TO 400-IDX-X
          idxGroup400.getIdx400Redefined().setIdxX400(bitMap1800.getBitMapByte1800());
//  SET 500-IDX TO 400-IDX
          idx500 = idxGroup400.getIdx400(); 
          
//  MOVE 500-PARSING-PATTERN ( 500-IDX + 1) TO 800-ELEMENT-TABLE (1 : 8)
          elementTable800.replace(parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(idx500 + 1 - 1),0,parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(idx500 + 1 - 1).length,0,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE 800-BIT-MAP-BYTE-2 TO 400-IDX-X
          idxGroup400.getIdx400Redefined().setIdxX400(bitMap1800.getBitMapByte2800());
//  SET 500-IDX TO 400-IDX
          idx500 = idxGroup400.getIdx400(); 
          
//  MOVE 500-PARSING-PATTERN ( 500-IDX + 1) TO 800-ELEMENT-TABLE (9 : 8)
          elementTable800.replace(parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(idx500 + 1 - 1),0,parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(idx500 + 1 - 1).length,8,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE 800-BIT-MAP-BYTE-3 TO 400-IDX-X
          idxGroup400.getIdx400Redefined().setIdxX400(bitMap1800.getBitMapByte3800());
//  SET 500-IDX TO 400-IDX
          idx500 = idxGroup400.getIdx400(); 
          
//  MOVE 500-PARSING-PATTERN ( 500-IDX + 1) TO 800-ELEMENT-TABLE (17 : 8)
          elementTable800.replace(parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(idx500 + 1 - 1),0,parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(idx500 + 1 - 1).length,16,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE 800-BIT-MAP-BYTE-4 TO 400-IDX-X
          idxGroup400.getIdx400Redefined().setIdxX400(bitMap1800.getBitMapByte4800());
//  SET 500-IDX TO 400-IDX
          idx500 = idxGroup400.getIdx400(); 
          
//  MOVE 500-PARSING-PATTERN ( 500-IDX + 1) TO 800-ELEMENT-TABLE (25 : 8)
          elementTable800.replace(parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(idx500 + 1 - 1),0,parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(idx500 + 1 - 1).length,24,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE 800-BIT-MAP-BYTE-5 TO 400-IDX-X
          idxGroup400.getIdx400Redefined().setIdxX400(bitMap1800.getBitMapByte5800());
//  SET 500-IDX TO 400-IDX
          idx500 = idxGroup400.getIdx400(); 
          
//  MOVE 500-PARSING-PATTERN ( 500-IDX + 1) TO 800-ELEMENT-TABLE (33 : 8)
          elementTable800.replace(parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(idx500 + 1 - 1),0,parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(idx500 + 1 - 1).length,32,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE 800-BIT-MAP-BYTE-6 TO 400-IDX-X
          idxGroup400.getIdx400Redefined().setIdxX400(bitMap1800.getBitMapByte6800());
//  SET 500-IDX TO 400-IDX
          idx500 = idxGroup400.getIdx400(); 
          
//  MOVE 500-PARSING-PATTERN ( 500-IDX + 1) TO 800-ELEMENT-TABLE (41 : 8)
          elementTable800.replace(parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(idx500 + 1 - 1),0,parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(idx500 + 1 - 1).length,40,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE 800-BIT-MAP-BYTE-7 TO 400-IDX-X
          idxGroup400.getIdx400Redefined().setIdxX400(bitMap1800.getBitMapByte7800());
//  SET 500-IDX TO 400-IDX
          idx500 = idxGroup400.getIdx400(); 
          
//  MOVE 500-PARSING-PATTERN ( 500-IDX + 1) TO 800-ELEMENT-TABLE (49 : 8)
          elementTable800.replace(parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(idx500 + 1 - 1),0,parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(idx500 + 1 - 1).length,48,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE 800-BIT-MAP-BYTE-8 TO 400-IDX-X
          idxGroup400.getIdx400Redefined().setIdxX400(bitMap1800.getBitMapByte8800());
//  SET 500-IDX TO 400-IDX
          idx500 = idxGroup400.getIdx400(); 
          
//  MOVE 500-PARSING-PATTERN ( 500-IDX + 1) TO 800-ELEMENT-TABLE (57 : 8)
          elementTable800.replace(parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(idx500 + 1 - 1),0,parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(idx500 + 1 - 1).length,56,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
          charX300 = work.getCharX300();
//  IF 800-ELEMENT (1) = 300-CHAR-X
          if (		compareChars(elementTable800.getElement800(0),charX300) == 0 ) { 
//  MOVE 1000-DATA ( 800-SUB : 8) TO 800-BIT-MAP-2
              bitMap2800.replace(dataGroup1000/*parent*/,0+work.getSub800() - 1/*fromOffset - (bitMap2800) */,8/*fromLen*/,0/*toOffset - (data1000) */,8/*toLen*/);
//  ADD 300-BINARY-8 TO 800-SUB
              work.setSub800( (short) (work.getSub800()+work.getBinary8300()));
//  DISPLAY '*6* ' 300-BINARY-8 '  ' 800-SUB
              logger.info("*6* {}  {}", String.valueOf(work.getBinary8300()), String.valueOf(work.getSub800())); 
//  MOVE 800-BIT-MAP-BYTE-9 TO 400-IDX-X
              idxGroup400.getIdx400Redefined().setIdxX400(bitMap2800.getBitMapByte9800());
//  SET 500-IDX TO 400-IDX
              idx500 = idxGroup400.getIdx400(); 
              
//  MOVE 500-PARSING-PATTERN ( 500-IDX + 1) TO 800-ELEMENT-TABLE (65 : 8)
              elementTable800.replace(parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(idx500 + 1 - 1),0,parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(idx500 + 1 - 1).length,64,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE 800-BIT-MAP-BYTE-10 TO 400-IDX-X
              idxGroup400.getIdx400Redefined().setIdxX400(bitMap2800.getBitMapByte10800());
//  SET 500-IDX TO 400-IDX
              idx500 = idxGroup400.getIdx400(); 
              
//  MOVE 500-PARSING-PATTERN ( 500-IDX + 1) TO 800-ELEMENT-TABLE (73 : 8)
              elementTable800.replace(parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(idx500 + 1 - 1),0,parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(idx500 + 1 - 1).length,72,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE 800-BIT-MAP-BYTE-11 TO 400-IDX-X
              idxGroup400.getIdx400Redefined().setIdxX400(bitMap2800.getBitMapByte11800());
//  SET 500-IDX TO 400-IDX
              idx500 = idxGroup400.getIdx400(); 
              
//  MOVE 500-PARSING-PATTERN ( 500-IDX + 1) TO 800-ELEMENT-TABLE (81 : 8)
              elementTable800.replace(parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(idx500 + 1 - 1),0,parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(idx500 + 1 - 1).length,80,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE 800-BIT-MAP-BYTE-12 TO 400-IDX-X
              idxGroup400.getIdx400Redefined().setIdxX400(bitMap2800.getBitMapByte12800());
//  SET 500-IDX TO 400-IDX
              idx500 = idxGroup400.getIdx400(); 
              
//  MOVE 500-PARSING-PATTERN ( 500-IDX + 1) TO 800-ELEMENT-TABLE (89 : 8)
              elementTable800.replace(parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(idx500 + 1 - 1),0,parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(idx500 + 1 - 1).length,88,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE 800-BIT-MAP-BYTE-13 TO 400-IDX-X
              idxGroup400.getIdx400Redefined().setIdxX400(bitMap2800.getBitMapByte13800());
//  SET 500-IDX TO 400-IDX
              idx500 = idxGroup400.getIdx400(); 
              
//  MOVE 500-PARSING-PATTERN ( 500-IDX + 1) TO 800-ELEMENT-TABLE (97 : 8)
              elementTable800.replace(parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(idx500 + 1 - 1),0,parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(idx500 + 1 - 1).length,96,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE 800-BIT-MAP-BYTE-14 TO 400-IDX-X
              idxGroup400.getIdx400Redefined().setIdxX400(bitMap2800.getBitMapByte14800());
//  SET 500-IDX TO 400-IDX
              idx500 = idxGroup400.getIdx400(); 
              
//  MOVE 500-PARSING-PATTERN ( 500-IDX + 1) TO 800-ELEMENT-TABLE (105 : 8)
              elementTable800.replace(parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(idx500 + 1 - 1),0,parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(idx500 + 1 - 1).length,104,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE 800-BIT-MAP-BYTE-15 TO 400-IDX-X
              idxGroup400.getIdx400Redefined().setIdxX400(bitMap2800.getBitMapByte15800());
//  SET 500-IDX TO 400-IDX
              idx500 = idxGroup400.getIdx400(); 
              
//  MOVE 500-PARSING-PATTERN ( 500-IDX + 1) TO 800-ELEMENT-TABLE (113 : 8)
              elementTable800.replace(parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(idx500 + 1 - 1),0,parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(idx500 + 1 - 1).length,112,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE 800-BIT-MAP-BYTE-16 TO 400-IDX-X
              idxGroup400.getIdx400Redefined().setIdxX400(bitMap2800.getBitMapByte16800());
//  SET 500-IDX TO 400-IDX
              idx500 = idxGroup400.getIdx400(); 
              
//  MOVE 500-PARSING-PATTERN ( 500-IDX + 1) TO 800-ELEMENT-TABLE (121 : 8)
              elementTable800.replace(parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(idx500 + 1 - 1),0,parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(idx500 + 1 - 1).length,120,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
          }
  
      
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
  
      public int call(Object[] params) throws Exception {
      
      int len = params.length;
         if (len > 0 && params[0] != null )
            dataGroup1000.set((Field)params[0]);
         // invoke the process and return rc
         return process();
         
      }
      
      public int call(Field... parameters) throws Exception {
         for (int index = 0; index < parameters.length;index++) {
             switch(index) {
              case 0:
                      if(parameters[index] != null ) {
              		if (parameters[index] instanceof DataGroup1000) {
                       	this.dataGroup1000 = ((DataGroup1000) parameters[index]);
                  	} else {
                       	this.dataGroup1000.set(parameters[index]);
                  	}
                  }
                
                  break;
            }
         }
          return process();
      }
      
      
  
  
  
  
  
  }
