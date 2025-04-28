  package com.cloudframe.app.process.impl;
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
  
  import com.cloudframe.app.si994010.Si994010Ctx.*;
  import com.cloudframe.app.si994010.Si994010Ctx;
  import com.cloudframe.app.process.Si994010;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import org.springframework.web.bind.annotation.RequestParam;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.dto.ProgramContext;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.si994010.dto.*;
  import com.cloudframe.app.si994010.dto.DataGroup1000;
  import com.cloudframe.app.si994010.dto.Si530DataElementMaskArea;
  import com.cloudframe.app.si994010.dto.BitMap1800;
  import com.cloudframe.app.si994010.dto.ElementTable800;
  import com.cloudframe.app.si994010.dto.BitMap2800;
  import com.cloudframe.app.si994010.dto.IdxGroup400;
  import com.cloudframe.app.si994010.dto.ParsingPatternValuesGroup500;
  import com.cloudframe.app.si994010.dto.Si520DeAndLengthsGroup;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.global.sharedvar.Si583ParserArea;
  import com.cloudframe.app.si994010.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("si994010")
  
  public class Si994010Impl extends CommonProcess implements Si994010 {
  
  Logger logger = LoggerFactory.getLogger(Si994010Impl.class);
  
  
  
  
  
  
  
  
  
  
      @Override
      public int setParameter(Si994010Ctx programCtx, String dataGroup1000) throws Exception {
      		if(dataGroup1000 != null)
      		    programCtx.getDataGroup1000().setString(com.cloudframe.app.data.Field.getParm(dataGroup1000),new String(CONSTANTS.EBCDIC_ENCODING));
      		setInitDone(false);
      		process(programCtx);
      		return programCtx.getRc();
      }
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      public int process(Si994010Ctx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
ProcessInCtx methodIn = programCtx.getProcessInCtx();
          ;
//  PERFORM 0000-MAINLINE
          mainline(programCtx.getMainlineInCtx());/*0000-MAINLINE*/
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
      @Override
      public void mainline(MainlineInCtx methodIn) throws Exception {
      
// *****************************************************************
// ***** Mainline required comment.*********************************
// *****************************************************************
Si994010Ctx programCtx = methodIn.getSi994010Ctx();
//  PERFORM 1000-INITIALIZE-WORK-AREAS
          initializeWorkAreas(programCtx.getInitializeWorkAreasInCtx());/*1000-INITIALIZE-WORK-AREAS*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  PERFORM 2000-GET-FIRST-MESSAGE
          getFirstMessage(programCtx.getGetFirstMessageInCtx());/*2000-GET-FIRST-MESSAGE*/
          if (programCtx.isProgramEnded()) {
              return ;
          }

// *    Perform varying si520-idx from 1 by 1 until si520-idx > 128
// *       display si520-tbl-fomat(si520-idx) ' **'
// *               si520-tbl-length(si520-idx)
// *    end-perform
//  IF SI583-RETURN-CODE = 300-BINARY-ZEROS
          if (	( methodIn.getSi583ReturnCode() == methodIn.getBinaryZeros300() )) { 
//  PERFORM 3000-PARSE-FIRST-MESSAGE
              parseFirstMessage(programCtx.getParseFirstMessageInCtx());/*3000-PARSE-FIRST-MESSAGE*/
              if (programCtx.isProgramEnded()) {
                  return ;
              }
          }
//  IF 800-SUB < 300-MAX-MESSAGE
          if (	( methodIn.getSub800() < methodIn.getMaxMessage300() ) ) { 
//  IF SI583-RETURN-CODE = 300-BINARY-ZEROS
              if (	( methodIn.getSi583ReturnCode() == methodIn.getBinaryZeros300() )) { 
//  PERFORM 4000-GET-SECOND-MESSAGE
                  getSecondMessage(programCtx.getGetSecondMessageInCtx());/*4000-GET-SECOND-MESSAGE*/
                  if (programCtx.isProgramEnded()) {
                      return ;
                  }
              }
//  IF SI583-RETURN-CODE = 300-BINARY-ZEROS
              if (	( methodIn.getSi583ReturnCode() == methodIn.getBinaryZeros300() )) { 
//  IF SI583-MTI-2 = SPACES OR LOW-VALUES
//  ELSE
                  if (        ( !allSpaces(methodIn.getSi583Mti2())  ) && !( checkLowValue(methodIn.getSi583Mti2()) ) ) { 
//  PERFORM 5000-PARSE-SECOND-MESSAGE
                      parseSecondMessage(programCtx.getParseSecondMessageInCtx());/*5000-PARSE-SECOND-MESSAGE*/
                      if (programCtx.isProgramEnded()) {
                          return ;
                      }
                  }
              }
          }
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
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
      @Override
      public InitializeWorkAreasOutCtx initializeWorkAreas(InitializeWorkAreasInCtx methodIn) throws Exception {
      
// ******************************************************************
// ***** Get things ready to go.           **************************
// ******************************************************************
Si994010Ctx programCtx = methodIn.getSi994010Ctx();
InitializeWorkAreasOutCtx methodOut = methodIn.getInitializeWorkAreasOutCtx();
//  MOVE 300-BINARY-ZEROS TO SI583-RETURN-CODE SI583-DATA-ELEMENT-IN-ERROR
          methodOut.setSi583ReturnCode(methodOut.getBinaryZeros300());
          methodOut.setSi583DataElementInError(methodOut.getBinaryZeros300());
//  MOVE SPACES TO SI583-RETURN-MESSAGE
          methodOut.setSi583ReturnMessage(CONSTANTS.SPACE_80);
          // MOVE SI530-DATA-ELEMENT-MASK-AREA TO SI583-DATA-ELEMENT-WORK-AREA-1 SI583-DATA-ELEMENT-WORK-AREA-2
          methodOut.getSi583DataElementWorkArea1().setString(methodOut.getSi530DataElementMaskArea().getCharArray());
          methodOut.getSi583DataElementWorkArea2().setString(methodOut.getSi530DataElementMaskArea().getCharArray());
//  MOVE ZEROS TO SI583-MTI-1 SI583-MTI-2
          methodOut.setSi583Mti1(CONSTANTS.ZERO_4);
          methodOut.setSi583Mti2(CONSTANTS.ZERO_4);
//  IF SI583-DATA-PTR = NULL
//  LITERAL_NULL = NULL
          if (compareChars(pad(4,String.valueOf(methodIn.getSi583DataPtr()),"0",CFUtil.LEFT_PAD),CONSTANTS.LITERAL_NULL) == 0) { 
//  SET 88-SI583-INVALID-PTR TO TRUE
              methodOut.setSi583InvalidPtr88True(); 
              
//  MOVE 600-ERR-MSG-8 TO SI583-RETURN-MESSAGE
              methodOut.setSi583ReturnMessage(methodOut.getErrMsg8600());
          }
//  ELSE
          else { 
//  SET ADDRESS OF 1000-DATA TO SI583-DATA-PTR
              methodIn.getDataGroup1000().set(getObject(methodIn.getSi583DataPtr())); 
              
          }
//  IF SI583-DATA-LENGTH > ZERO
          if (	( methodIn.getSi583DataLength() > 0 )) { 
              methodOut.setMaxMessage300(methodIn.getSi583DataLength() + methodIn.getBinary1300());
          }
      
      return methodOut;
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
      @Override
      public GetFirstMessageOutCtx getFirstMessage(GetFirstMessageInCtx methodIn) throws Exception {
      
// ******************************************************************
// ***** Move the message to the work area and begin analyzing. *****
// ******************************************************************
Si994010Ctx programCtx = methodIn.getSi994010Ctx();
GetFirstMessageOutCtx methodOut = methodIn.getGetFirstMessageOutCtx();
//  MOVE 1000-DATA (1 : 4) TO SI583-MTI-1
          methodOut.setSi583Mti1(methodOut.getData1000());
//  MOVE 1000-DATA (5 : 8) TO 800-BIT-MAP-1
          methodOut.getBitMap1800().replace(methodIn.getDataGroup1000()/*parent*/,0+5 - 1/*fromOffset - (bitMap1800) */,8/*fromLen*/,0/*toOffset - (data1000) */,8/*toLen*/);
//  MOVE 300-BINARY-13 TO 800-SUB
          methodOut.setSub800(methodOut.getBinary13300());
//  IF SI583-MTI-1 IS NUMERIC OR SI583-MTI-1 = 300-ASTERISKS
          if (    isNumeric(methodOut.getSi583Mti1()) || 		compareChars(methodOut.getSi583Mti1(),methodIn.getAsterisks300()) == 0 ) { 
//  PERFORM 8000-EXPAND-THE-BIT-MAP
              expandTheBitMap(programCtx.getExpandTheBitMapInCtx());/*8000-EXPAND-THE-BIT-MAP*/
          }
//  ELSE
          else { 
//  MOVE 600-ERR-MSG-3 TO SI583-RETURN-MESSAGE
              methodOut.setSi583ReturnMessage(methodOut.getErrMsg3600());
//  SET 88-SI583-MTI1-ERROR TO TRUE
              methodOut.setSi583Mti1Error88True(); 
              
          }
//  IF 800-ELEMENT (1) = 300-CHAR-X
          if (		compareChars(methodIn.getElement800(0),methodIn.getCharX300()) == 0 ) { 
//  SET 88-SI583-DE-PRESENT-1 (1) TO TRUE
              methodOut.setSi583DePresent188True(0); 
              
          }
      
      return methodOut;
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
      @Override
      public ParseFirstMessageOutCtx parseFirstMessage(ParseFirstMessageInCtx methodIn) throws Exception {
      
// ******************************************************************
// ***** Loop through message looking for data elements.   **********
// ******************************************************************
Si994010Ctx programCtx = methodIn.getSi994010Ctx();
ParseFirstMessageOutCtx methodOut = methodIn.getParseFirstMessageOutCtx();
//  IF 800-ELEMENT (1) = 300-CHAR-X
          if (		compareChars(methodIn.getElement800(0),methodIn.getCharX300()) == 0 ) { 
//  MOVE 300-BINARY-128 TO 300-DE-MAX
              methodOut.setDeMax300(methodOut.getBinary128300());
          }
//  ELSE
          else { 
//  MOVE 300-BINARY-64 TO 300-DE-MAX
              methodOut.setDeMax300(methodOut.getBinary64300());
          }
//  PERFORM VARYING 800-IDX FROM 300-BINARY-2 BY 300-BINARY-1 UNTIL 800-IDX > 300-DE-MAX OR SI583-RETURN-CODE > 300-BINARY-ZEROS
          for (methodOut.setIdx800(methodIn.getBinary2300()); (	( methodOut.getIdx800() <= methodOut.getDeMax300() )  && 	( methodOut.getSi583ReturnCode() <= methodIn.getBinaryZeros300() )) ; methodOut.setIdx800(methodOut.getIdx800() + methodIn.getBinary1300()) ) {
//  IF 800-ELEMENT ( 800-IDX ) = 300-CHAR-X
              if (		compareChars(methodIn.getElement800(methodOut.getIdx800() - 1),methodIn.getCharX300()) == 0 ) { 
//  SET SI583-I1 TO 800-IDX
                  methodOut.setSi583I1(methodOut.getIdx800()); 
                  
//  SET SI520-IDX TO 800-IDX
                  methodOut.setSi520Idx(methodOut.getIdx800()); 
                  
//  SET 88-SI583-DE-PRESENT-1 ( SI583-I1 ) TO TRUE
                  methodOut.setSi583DePresent188True(methodOut.getSi583I1() - 1); 
                  
//  IF 88-SI520-FIXED-FORMAT ( SI520-IDX )
                  if ( methodIn.isSi520FixedFormat88(methodOut.getSi520Idx() - 1)  ) { 
//  PERFORM 3010-SETUP-FIXED
                      setupFixed(programCtx.getSetupFixedInCtx());/*3010-SETUP-FIXED*/
                  }
//  ELSE
                  else { 
//  IF 88-SI520-VAR-FORMAT ( SI520-IDX )
                      if ( methodIn.isSi520VarFormat88(methodOut.getSi520Idx() - 1)  ) { 
//  PERFORM 3020-SETUP-VAR
                          setupVar(programCtx.getSetupVarInCtx());/*3020-SETUP-VAR*/
                      }
//  ELSE
                      else { 
//  PERFORM 3030-SETUP-UNUSED-ERROR
                          setupUnusedError(programCtx.getSetupUnusedErrorInCtx());/*3030-SETUP-UNUSED-ERROR*/
                      }
                  }
//  IF 800-SUB > 300-MAX-MESSAGE
                  if (	( methodIn.getSub800() > methodIn.getMaxMessage300() ) ) { 
//  DISPLAY 'LTH1 ERROR ' 800-SUB ' > ' 300-MAX-MESSAGE
                      logger.info("LTH1 ERROR {} > {}", String.valueOf(methodIn.getSub800()), String.valueOf(methodIn.getMaxMessage300())); 
//  SET SI583-DATA-ELEMENT-IN-ERROR TO SI520-IDX
                      methodOut.setSi583DataElementInError((short) (short) methodOut.getSi520Idx()); 
                      
//  SET 88-SI583-LTH1-ERROR TO TRUE
                      methodOut.setSi583Lth1Error88True(); 
                      
//  MOVE 600-ERR-MSG-7 TO SI583-RETURN-MESSAGE
                      methodOut.setSi583ReturnMessage(methodOut.getErrMsg7600());
                  }
              }
          }
      
      return methodOut;
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
      @Override
      public SetupFixedOutCtx setupFixed(SetupFixedInCtx methodIn) throws Exception {
      
// ******************************************************************
// ***** Establish start and fixed end positions.      **************
// ******************************************************************
Si994010Ctx programCtx = methodIn.getSi994010Ctx();
SetupFixedOutCtx methodOut = methodIn.getSetupFixedOutCtx();
//  MOVE 800-SUB TO SI583-DE-STARTING-POS-1 ( SI583-I1 )
          methodOut.setSi583DeStartingPos1(methodIn.getSi583I1() - 1,methodOut.getSub800());
//  MOVE SI520-TBL-LENGTH ( SI520-IDX ) TO SI583-DE-LENGTH-1 ( SI583-I1 )
          methodOut.setSi583DeLength1(methodIn.getSi583I1() - 1,methodOut.getSi520TblLength(methodIn.getSi520Idx() - 1));
//  ADD SI520-TBL-LENGTH ( SI520-IDX ) TO 800-SUB
          methodOut.setSub800( (short) (methodOut.getSub800()+methodOut.getSi520TblLength(methodIn.getSi520Idx() - 1)));
//  DISPLAY '*1* ' SI520-TBL-LENGTH ( SI520-IDX ) '  ' 800-SUB
          logger.info("*1* {}  {}", String.valueOf(methodOut.getSi520TblLength(methodIn.getSi520Idx() - 1)), String.valueOf(methodOut.getSub800())); 
      
      return methodOut;
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
      @Override
      public SetupVarOutCtx setupVar(SetupVarInCtx methodIn) throws Exception {
      
// ******************************************************************
// ***** Establish start and variable end positions.     ************
// ******************************************************************
Si994010Ctx programCtx = methodIn.getSi994010Ctx();
SetupVarOutCtx methodOut = methodIn.getSetupVarOutCtx();
//  DISPLAY '*7* ' 800-SUB '  ' SI520-TBL-LENGTH ( SI520-IDX )
          logger.info("*7* {}  {}", String.valueOf(methodOut.getSub800()), String.valueOf(methodIn.getSi520TblLength(methodIn.getSi520Idx() - 1))); 
//  IF 1000-DATA ( 800-SUB : SI520-TBL-LENGTH ( SI520-IDX )) NUMERIC
          if (    isNumeric(substring(methodOut.getData1000(),(methodOut.getSub800()-1), (methodIn.getSi520TblLength(methodIn.getSi520Idx() - 1) + (methodOut.getSub800() - 1)) ))) { 
//  MOVE 1000-DATA ( 800-SUB : SI520-TBL-LENGTH ( SI520-IDX )) TO SI583-DE-LENGTH-1 ( SI583-I1 )
              methodOut.setSi583DeLength1(methodIn.getSi583I1() - 1,CFUtil.getShort(substring(methodOut.getData1000(),(methodOut.getSub800()-1), (methodIn.getSi520TblLength(methodIn.getSi520Idx() - 1) + (methodOut.getSub800() - 1)) )));
//  ADD SI520-TBL-LENGTH ( SI520-IDX ) TO 800-SUB
              methodOut.setSub800( (short) (methodOut.getSub800()+methodIn.getSi520TblLength(methodIn.getSi520Idx() - 1)));
//  DISPLAY '*2* ' SI520-TBL-LENGTH ( SI520-IDX ) '  ' 800-SUB
              logger.info("*2* {}  {}", String.valueOf(methodIn.getSi520TblLength(methodIn.getSi520Idx() - 1)), String.valueOf(methodOut.getSub800())); 
//  MOVE 800-SUB TO SI583-DE-STARTING-POS-1 ( SI583-I1 )
              methodOut.setSi583DeStartingPos1(methodIn.getSi583I1() - 1,methodOut.getSub800());
//  ADD SI583-DE-LENGTH-1 ( SI583-I1 ) TO 800-SUB
              methodOut.setSub800( (short) (methodOut.getSub800()+methodOut.getSi583DeLength1(methodIn.getSi583I1() - 1)));
//  DISPLAY '*3* ' SI583-DE-LENGTH-1 ( SI583-I1 ) '  ' 800-SUB
              logger.info("*3* {}  {}", String.valueOf(methodOut.getSi583DeLength1(methodIn.getSi583I1() - 1)), String.valueOf(methodOut.getSub800())); 
          }
//  ELSE
          else { 
//  DISPLAY 'LTH1 ERROR '
              logger.info("LTH1 ERROR "); 
//  DISPLAY 1000-DATA ( 800-SUB : SI520-TBL-LENGTH ( SI520-IDX )) ' IS NOT NUMERIC'
              logger.info("{} IS NOT NUMERIC", new String(substring(methodOut.getData1000(),(methodOut.getSub800()-1), (methodIn.getSi520TblLength(methodIn.getSi520Idx() - 1) + (methodOut.getSub800() - 1)) ))); 
//  SET SI583-DATA-ELEMENT-IN-ERROR TO SI520-IDX
              methodOut.setSi583DataElementInError((short) (short) methodIn.getSi520Idx()); 
              
//  SET 88-SI583-LTH1-ERROR TO TRUE
              methodOut.setSi583Lth1Error88True(); 
              
//  MOVE 600-ERR-MSG-5 TO SI583-RETURN-MESSAGE
              methodOut.setSi583ReturnMessage(methodOut.getErrMsg5600());
          }
      
      return methodOut;
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
      @Override
      public SetupUnusedErrorOutCtx setupUnusedError(SetupUnusedErrorInCtx methodIn) throws Exception {
      
// ******************************************************************
// ***** It is an error if an unused de has its bit flag on.  *******
// ******************************************************************
Si994010Ctx programCtx = methodIn.getSi994010Ctx();
SetupUnusedErrorOutCtx methodOut = methodIn.getSetupUnusedErrorOutCtx();
//  SET SI583-DATA-ELEMENT-IN-ERROR TO SI520-IDX
          methodOut.setSi583DataElementInError((short) (short) methodIn.getSi520Idx()); 
          
//  SET 88-SI583-DEF1-ERROR TO TRUE
          methodOut.setSi583Def1Error88True(); 
          
//  MOVE 600-ERR-MSG-1 TO SI583-RETURN-MESSAGE
          methodOut.setSi583ReturnMessage(methodOut.getErrMsg1600());
      
      return methodOut;
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
      @Override
      public GetSecondMessageOutCtx getSecondMessage(GetSecondMessageInCtx methodIn) throws Exception {
      
// ******************************************************************
// ***** Repeat the steps looking for a possible second message. ****
// ******************************************************************
Si994010Ctx programCtx = methodIn.getSi994010Ctx();
GetSecondMessageOutCtx methodOut = methodIn.getGetSecondMessageOutCtx();
//  MOVE 1000-DATA ( 800-SUB : 4) TO SI583-MTI-2
          methodIn.getSi583ParserArea().replace(methodIn.getDataGroup1000()/*parent*/,0+methodOut.getSub800() - 1/*fromOffset - (si583Mti2) */,4/*fromLen*/,96/*toOffset - (data1000) */,4/*toLen*/);
//  ADD 300-BINARY-4 TO 800-SUB
          methodOut.setSub800( (short) (methodOut.getSub800()+methodIn.getBinary4300()));
//  MOVE 1000-DATA ( 800-SUB : 8) TO 800-BIT-MAP-1
          methodOut.getBitMap1800().replace(methodIn.getDataGroup1000()/*parent*/,0+methodOut.getSub800() - 1/*fromOffset - (bitMap1800) */,8/*fromLen*/,0/*toOffset - (data1000) */,8/*toLen*/);
//  ADD 300-BINARY-8 TO 800-SUB
          methodOut.setSub800( (short) (methodOut.getSub800()+methodIn.getBinary8300()));
//  IF SI583-MTI-2 = SPACES OR LOW-VALUES
//  ELSE
          if (        ( !allSpaces(methodOut.getSi583Mti2())  ) && !( checkLowValue(methodOut.getSi583Mti2()) ) ) { 
//  IF SI583-MTI-2 IS NUMERIC OR SI583-MTI-2 = 300-ASTERISKS
              if (    isNumeric(methodOut.getSi583Mti2()) || 		compareChars(methodOut.getSi583Mti2(),methodIn.getAsterisks300()) == 0 ) { 
//  PERFORM 8000-EXPAND-THE-BIT-MAP
                  expandTheBitMap(programCtx.getExpandTheBitMapInCtx());/*8000-EXPAND-THE-BIT-MAP*/
//  IF 800-ELEMENT (1) = 300-CHAR-X
                  if (		compareChars(methodIn.getElement800(0),methodIn.getCharX300()) == 0 ) { 
//  SET 88-SI583-DE-PRESENT-2 (1) TO TRUE
                      methodOut.setSi583DePresent288True(0); 
                      
                  }
              }
//  ELSE
              else { 
//  SET SI583-DATA-ELEMENT-IN-ERROR TO SI520-IDX
                  methodOut.setSi583DataElementInError((short) (short) methodIn.getSi520Idx()); 
                  
//  SET 88-SI583-MTI2-ERROR TO TRUE
                  methodOut.setSi583Mti2Error88True(); 
                  
//  MOVE 600-ERR-MSG-4 TO SI583-RETURN-MESSAGE
                  methodOut.setSi583ReturnMessage(methodOut.getErrMsg4600());
              }
          }
      
      return methodOut;
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
      @Override
      public ParseSecondMessageOutCtx parseSecondMessage(ParseSecondMessageInCtx methodIn) throws Exception {
      
// ******************************************************************
// ***** The second message has its own results area in the copybook*
// ******************************************************************
Si994010Ctx programCtx = methodIn.getSi994010Ctx();
ParseSecondMessageOutCtx methodOut = methodIn.getParseSecondMessageOutCtx();
//  IF 800-ELEMENT (1) = 300-CHAR-X
          if (		compareChars(methodIn.getElement800(0),methodIn.getCharX300()) == 0 ) { 
//  MOVE 300-BINARY-128 TO 300-DE-MAX
              methodOut.setDeMax300(methodOut.getBinary128300());
          }
//  ELSE
          else { 
//  MOVE 300-BINARY-64 TO 300-DE-MAX
              methodOut.setDeMax300(methodOut.getBinary64300());
          }
//  PERFORM VARYING 800-IDX FROM 300-BINARY-2 BY 300-BINARY-1 UNTIL 800-IDX > 300-DE-MAX OR SI583-RETURN-CODE > 300-BINARY-ZEROS
          for (methodOut.setIdx800(methodIn.getBinary2300()); (	( methodOut.getIdx800() <= methodOut.getDeMax300() )  && 	( methodOut.getSi583ReturnCode() <= methodIn.getBinaryZeros300() )) ; methodOut.setIdx800(methodOut.getIdx800() + methodIn.getBinary1300()) ) {
//  IF 800-ELEMENT ( 800-IDX ) = 300-CHAR-X
              if (		compareChars(methodIn.getElement800(methodOut.getIdx800() - 1),methodIn.getCharX300()) == 0 ) { 
//  SET SI583-I2 TO 800-IDX
                  methodOut.setSi583I2(methodOut.getIdx800()); 
                  
//  SET SI520-IDX TO 800-IDX
                  methodOut.setSi520Idx(methodOut.getIdx800()); 
                  
//  SET 88-SI583-DE-PRESENT-2 ( SI583-I2 ) TO TRUE
                  methodOut.setSi583DePresent288True(methodOut.getSi583I2() - 1); 
                  
//  IF 88-SI520-FIXED-FORMAT ( SI520-IDX )
                  if ( methodIn.isSi520FixedFormat88(methodOut.getSi520Idx() - 1)  ) { 
//  PERFORM 5010-SETUP-FIXED
                      setupFixed5010(programCtx.getSetupFixed5010InCtx());/*5010-SETUP-FIXED*/
                  }
//  ELSE
                  else { 
//  IF 88-SI520-VAR-FORMAT ( SI520-IDX )
                      if ( methodIn.isSi520VarFormat88(methodOut.getSi520Idx() - 1)  ) { 
//  PERFORM 5020-SETUP-VAR
                          setupVar5020(programCtx.getSetupVar5020InCtx());/*5020-SETUP-VAR*/
                      }
//  ELSE
                      else { 
//  PERFORM 5030-SETUP-UNUSED-ERROR
                          setupUnusedError5030(programCtx.getSetupUnusedError5030InCtx());/*5030-SETUP-UNUSED-ERROR*/
                      }
                  }
//  IF 800-SUB > 300-MAX-MESSAGE
                  if (	( methodIn.getSub800() > methodIn.getMaxMessage300() ) ) { 
//  SET SI583-DATA-ELEMENT-IN-ERROR TO SI520-IDX
                      methodOut.setSi583DataElementInError((short) (short) methodOut.getSi520Idx()); 
                      
//  SET 88-SI583-LTH2-ERROR TO TRUE
                      methodOut.setSi583Lth2Error88True(); 
                      
//  MOVE 600-ERR-MSG-7 TO SI583-RETURN-MESSAGE
                      methodOut.setSi583ReturnMessage(methodOut.getErrMsg7600());
                  }
              }
          }
      
      return methodOut;
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
      @Override
      public SetupFixed5010OutCtx setupFixed5010(SetupFixed5010InCtx methodIn) throws Exception {
      
// ******************************************************************
// ***** Repeat of fixed.                                    ********
// ******************************************************************
Si994010Ctx programCtx = methodIn.getSi994010Ctx();
SetupFixed5010OutCtx methodOut = methodIn.getSetupFixed5010OutCtx();
//  MOVE 800-SUB TO SI583-DE-STARTING-POS-2 ( SI583-I2 )
          methodOut.setSi583DeStartingPos2(methodIn.getSi583I2() - 1,methodOut.getSub800());
//  MOVE SI520-TBL-LENGTH ( SI520-IDX ) TO SI583-DE-LENGTH-2 ( SI583-I2 )
          methodOut.setSi583DeLength2(methodIn.getSi583I2() - 1,methodOut.getSi520TblLength(methodIn.getSi520Idx() - 1));
//  ADD SI520-TBL-LENGTH ( SI520-IDX ) TO 800-SUB
          methodOut.setSub800( (short) (methodOut.getSub800()+methodOut.getSi520TblLength(methodIn.getSi520Idx() - 1)));
//  DISPLAY '*4* ' SI520-TBL-LENGTH ( SI520-IDX ) '  ' 800-SUB
          logger.info("*4* {}  {}", String.valueOf(methodOut.getSi520TblLength(methodIn.getSi520Idx() - 1)), String.valueOf(methodOut.getSub800())); 
      
      return methodOut;
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
      @Override
      public SetupVar5020OutCtx setupVar5020(SetupVar5020InCtx methodIn) throws Exception {
      
// ******************************************************************
// ***** Repeat of variable.                                 ********
// ******************************************************************

// *    Display '*dbg* ' 800-sub ' * ' si520-tbl-length(si520-idx)
// *    display '*dbg* ' 800-sub ' * '
// *    display '*dbg* '         ' * ' si520-tbl-length(si520-idx)
// *    display '*dbg* '         ' * '
// *    ' *' 1000-data (800-sub:si520-tbl-length(si520-idx))
Si994010Ctx programCtx = methodIn.getSi994010Ctx();
SetupVar5020OutCtx methodOut = methodIn.getSetupVar5020OutCtx();
//  IF 1000-DATA ( 800-SUB : SI520-TBL-LENGTH ( SI520-IDX )) NUMERIC
          if (    isNumeric(substring(methodOut.getData1000(),(methodOut.getSub800()-1), (methodIn.getSi520TblLength(methodIn.getSi520Idx() - 1) + (methodOut.getSub800() - 1)) ))) { 
//  MOVE 1000-DATA ( 800-SUB : SI520-TBL-LENGTH ( SI520-IDX )) TO SI583-DE-LENGTH-2 ( SI583-I2 )
              methodOut.setSi583DeLength2(methodIn.getSi583I2() - 1,CFUtil.getShort(substring(methodOut.getData1000(),(methodOut.getSub800()-1), (methodIn.getSi520TblLength(methodIn.getSi520Idx() - 1) + (methodOut.getSub800() - 1)) )));
//  ADD SI520-TBL-LENGTH ( SI520-IDX ) TO 800-SUB
              methodOut.setSub800( (short) (methodOut.getSub800()+methodIn.getSi520TblLength(methodIn.getSi520Idx() - 1)));
//  DISPLAY '*5* ' SI520-TBL-LENGTH ( SI520-IDX ) '  ' 800-SUB
              logger.info("*5* {}  {}", String.valueOf(methodIn.getSi520TblLength(methodIn.getSi520Idx() - 1)), String.valueOf(methodOut.getSub800())); 
//  MOVE 800-SUB TO SI583-DE-STARTING-POS-2 ( SI583-I2 )
              methodOut.setSi583DeStartingPos2(methodIn.getSi583I2() - 1,methodOut.getSub800());
//  ADD SI583-DE-LENGTH-2 ( SI583-I2 ) TO 800-SUB
              methodOut.setSub800( (short) (methodOut.getSub800()+methodOut.getSi583DeLength2(methodIn.getSi583I2() - 1)));
          }
//  ELSE
          else { 
//  SET SI583-DATA-ELEMENT-IN-ERROR TO SI520-IDX
              methodOut.setSi583DataElementInError((short) (short) methodIn.getSi520Idx()); 
              
//  SET 88-SI583-LTH2-ERROR TO TRUE
              methodOut.setSi583Lth2Error88True(); 
              
//  MOVE 600-ERR-MSG-6 TO SI583-RETURN-MESSAGE
              methodOut.setSi583ReturnMessage(methodOut.getErrMsg6600());
          }
      
      return methodOut;
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
      @Override
      public SetupUnusedError5030OutCtx setupUnusedError5030(SetupUnusedError5030InCtx methodIn) throws Exception {
      
// ******************************************************************
// ***** Repeat of unused.                                   ********
// ******************************************************************
Si994010Ctx programCtx = methodIn.getSi994010Ctx();
SetupUnusedError5030OutCtx methodOut = methodIn.getSetupUnusedError5030OutCtx();
//  SET SI583-DATA-ELEMENT-IN-ERROR TO SI520-IDX
          methodOut.setSi583DataElementInError((short) (short) methodIn.getSi520Idx()); 
          
//  SET 88-SI583-DEF2-ERROR TO TRUE
          methodOut.setSi583Def2Error88True(); 
          
//  MOVE 600-ERR-MSG-2 TO SI583-RETURN-MESSAGE
          methodOut.setSi583ReturnMessage(methodOut.getErrMsg2600());
      
      return methodOut;
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
      @Override
      public ExpandTheBitMapOutCtx expandTheBitMap(ExpandTheBitMapInCtx methodIn) throws Exception {
      
// ******************************************************************
// ***** Turn the binary bit map into an addressable byte map. ******
// ******************************************************************
Si994010Ctx programCtx = methodIn.getSi994010Ctx();
ExpandTheBitMapOutCtx methodOut = methodIn.getExpandTheBitMapOutCtx();
//  MOVE 800-BIT-MAP-BYTE-1 TO 400-IDX-X
          methodOut.setIdxX400(methodOut.getBitMapByte1800());
//  SET 500-IDX TO 400-IDX
          methodOut.setIdx500(methodIn.getIdx400()); 
          
//  MOVE 500-PARSING-PATTERN ( 500-IDX + 1) TO 800-ELEMENT-TABLE (1 : 8)
          methodOut.getElementTable800().replace(methodOut.getParsingPattern500(methodOut.getIdx500() + 1 - 1),0,methodOut.getParsingPattern500(methodOut.getIdx500() + 1 - 1).length,0,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE 800-BIT-MAP-BYTE-2 TO 400-IDX-X
          methodOut.setIdxX400(methodOut.getBitMapByte2800());
//  SET 500-IDX TO 400-IDX
          methodOut.setIdx500(methodIn.getIdx400()); 
          
//  MOVE 500-PARSING-PATTERN ( 500-IDX + 1) TO 800-ELEMENT-TABLE (9 : 8)
          methodOut.getElementTable800().replace(methodOut.getParsingPattern500(methodOut.getIdx500() + 1 - 1),0,methodOut.getParsingPattern500(methodOut.getIdx500() + 1 - 1).length,8,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE 800-BIT-MAP-BYTE-3 TO 400-IDX-X
          methodOut.setIdxX400(methodOut.getBitMapByte3800());
//  SET 500-IDX TO 400-IDX
          methodOut.setIdx500(methodIn.getIdx400()); 
          
//  MOVE 500-PARSING-PATTERN ( 500-IDX + 1) TO 800-ELEMENT-TABLE (17 : 8)
          methodOut.getElementTable800().replace(methodOut.getParsingPattern500(methodOut.getIdx500() + 1 - 1),0,methodOut.getParsingPattern500(methodOut.getIdx500() + 1 - 1).length,16,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE 800-BIT-MAP-BYTE-4 TO 400-IDX-X
          methodOut.setIdxX400(methodOut.getBitMapByte4800());
//  SET 500-IDX TO 400-IDX
          methodOut.setIdx500(methodIn.getIdx400()); 
          
//  MOVE 500-PARSING-PATTERN ( 500-IDX + 1) TO 800-ELEMENT-TABLE (25 : 8)
          methodOut.getElementTable800().replace(methodOut.getParsingPattern500(methodOut.getIdx500() + 1 - 1),0,methodOut.getParsingPattern500(methodOut.getIdx500() + 1 - 1).length,24,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE 800-BIT-MAP-BYTE-5 TO 400-IDX-X
          methodOut.setIdxX400(methodOut.getBitMapByte5800());
//  SET 500-IDX TO 400-IDX
          methodOut.setIdx500(methodIn.getIdx400()); 
          
//  MOVE 500-PARSING-PATTERN ( 500-IDX + 1) TO 800-ELEMENT-TABLE (33 : 8)
          methodOut.getElementTable800().replace(methodOut.getParsingPattern500(methodOut.getIdx500() + 1 - 1),0,methodOut.getParsingPattern500(methodOut.getIdx500() + 1 - 1).length,32,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE 800-BIT-MAP-BYTE-6 TO 400-IDX-X
          methodOut.setIdxX400(methodOut.getBitMapByte6800());
//  SET 500-IDX TO 400-IDX
          methodOut.setIdx500(methodIn.getIdx400()); 
          
//  MOVE 500-PARSING-PATTERN ( 500-IDX + 1) TO 800-ELEMENT-TABLE (41 : 8)
          methodOut.getElementTable800().replace(methodOut.getParsingPattern500(methodOut.getIdx500() + 1 - 1),0,methodOut.getParsingPattern500(methodOut.getIdx500() + 1 - 1).length,40,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE 800-BIT-MAP-BYTE-7 TO 400-IDX-X
          methodOut.setIdxX400(methodOut.getBitMapByte7800());
//  SET 500-IDX TO 400-IDX
          methodOut.setIdx500(methodIn.getIdx400()); 
          
//  MOVE 500-PARSING-PATTERN ( 500-IDX + 1) TO 800-ELEMENT-TABLE (49 : 8)
          methodOut.getElementTable800().replace(methodOut.getParsingPattern500(methodOut.getIdx500() + 1 - 1),0,methodOut.getParsingPattern500(methodOut.getIdx500() + 1 - 1).length,48,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE 800-BIT-MAP-BYTE-8 TO 400-IDX-X
          methodOut.setIdxX400(methodOut.getBitMapByte8800());
//  SET 500-IDX TO 400-IDX
          methodOut.setIdx500(methodIn.getIdx400()); 
          
//  MOVE 500-PARSING-PATTERN ( 500-IDX + 1) TO 800-ELEMENT-TABLE (57 : 8)
          methodOut.getElementTable800().replace(methodOut.getParsingPattern500(methodOut.getIdx500() + 1 - 1),0,methodOut.getParsingPattern500(methodOut.getIdx500() + 1 - 1).length,56,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  IF 800-ELEMENT (1) = 300-CHAR-X
          if (		compareChars(methodOut.getElement800(0),methodIn.getCharX300()) == 0 ) { 
//  MOVE 1000-DATA ( 800-SUB : 8) TO 800-BIT-MAP-2
              methodOut.getBitMap2800().replace(methodIn.getDataGroup1000()/*parent*/,0+methodOut.getSub800() - 1/*fromOffset - (bitMap2800) */,8/*fromLen*/,0/*toOffset - (data1000) */,8/*toLen*/);
//  ADD 300-BINARY-8 TO 800-SUB
              methodOut.setSub800( (short) (methodOut.getSub800()+methodIn.getBinary8300()));
//  DISPLAY '*6* ' 300-BINARY-8 '  ' 800-SUB
              logger.info("*6* {}  {}", String.valueOf(methodIn.getBinary8300()), String.valueOf(methodOut.getSub800())); 
//  MOVE 800-BIT-MAP-BYTE-9 TO 400-IDX-X
              methodOut.setIdxX400(methodOut.getBitMapByte9800());
//  SET 500-IDX TO 400-IDX
              methodOut.setIdx500(methodIn.getIdx400()); 
              
//  MOVE 500-PARSING-PATTERN ( 500-IDX + 1) TO 800-ELEMENT-TABLE (65 : 8)
              methodOut.getElementTable800().replace(methodOut.getParsingPattern500(methodOut.getIdx500() + 1 - 1),0,methodOut.getParsingPattern500(methodOut.getIdx500() + 1 - 1).length,64,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE 800-BIT-MAP-BYTE-10 TO 400-IDX-X
              methodOut.setIdxX400(methodOut.getBitMapByte10800());
//  SET 500-IDX TO 400-IDX
              methodOut.setIdx500(methodIn.getIdx400()); 
              
//  MOVE 500-PARSING-PATTERN ( 500-IDX + 1) TO 800-ELEMENT-TABLE (73 : 8)
              methodOut.getElementTable800().replace(methodOut.getParsingPattern500(methodOut.getIdx500() + 1 - 1),0,methodOut.getParsingPattern500(methodOut.getIdx500() + 1 - 1).length,72,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE 800-BIT-MAP-BYTE-11 TO 400-IDX-X
              methodOut.setIdxX400(methodOut.getBitMapByte11800());
//  SET 500-IDX TO 400-IDX
              methodOut.setIdx500(methodIn.getIdx400()); 
              
//  MOVE 500-PARSING-PATTERN ( 500-IDX + 1) TO 800-ELEMENT-TABLE (81 : 8)
              methodOut.getElementTable800().replace(methodOut.getParsingPattern500(methodOut.getIdx500() + 1 - 1),0,methodOut.getParsingPattern500(methodOut.getIdx500() + 1 - 1).length,80,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE 800-BIT-MAP-BYTE-12 TO 400-IDX-X
              methodOut.setIdxX400(methodOut.getBitMapByte12800());
//  SET 500-IDX TO 400-IDX
              methodOut.setIdx500(methodIn.getIdx400()); 
              
//  MOVE 500-PARSING-PATTERN ( 500-IDX + 1) TO 800-ELEMENT-TABLE (89 : 8)
              methodOut.getElementTable800().replace(methodOut.getParsingPattern500(methodOut.getIdx500() + 1 - 1),0,methodOut.getParsingPattern500(methodOut.getIdx500() + 1 - 1).length,88,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE 800-BIT-MAP-BYTE-13 TO 400-IDX-X
              methodOut.setIdxX400(methodOut.getBitMapByte13800());
//  SET 500-IDX TO 400-IDX
              methodOut.setIdx500(methodIn.getIdx400()); 
              
//  MOVE 500-PARSING-PATTERN ( 500-IDX + 1) TO 800-ELEMENT-TABLE (97 : 8)
              methodOut.getElementTable800().replace(methodOut.getParsingPattern500(methodOut.getIdx500() + 1 - 1),0,methodOut.getParsingPattern500(methodOut.getIdx500() + 1 - 1).length,96,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE 800-BIT-MAP-BYTE-14 TO 400-IDX-X
              methodOut.setIdxX400(methodOut.getBitMapByte14800());
//  SET 500-IDX TO 400-IDX
              methodOut.setIdx500(methodIn.getIdx400()); 
              
//  MOVE 500-PARSING-PATTERN ( 500-IDX + 1) TO 800-ELEMENT-TABLE (105 : 8)
              methodOut.getElementTable800().replace(methodOut.getParsingPattern500(methodOut.getIdx500() + 1 - 1),0,methodOut.getParsingPattern500(methodOut.getIdx500() + 1 - 1).length,104,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE 800-BIT-MAP-BYTE-15 TO 400-IDX-X
              methodOut.setIdxX400(methodOut.getBitMapByte15800());
//  SET 500-IDX TO 400-IDX
              methodOut.setIdx500(methodIn.getIdx400()); 
              
//  MOVE 500-PARSING-PATTERN ( 500-IDX + 1) TO 800-ELEMENT-TABLE (113 : 8)
              methodOut.getElementTable800().replace(methodOut.getParsingPattern500(methodOut.getIdx500() + 1 - 1),0,methodOut.getParsingPattern500(methodOut.getIdx500() + 1 - 1).length,112,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE 800-BIT-MAP-BYTE-16 TO 400-IDX-X
              methodOut.setIdxX400(methodOut.getBitMapByte16800());
//  SET 500-IDX TO 400-IDX
              methodOut.setIdx500(methodIn.getIdx400()); 
              
//  MOVE 500-PARSING-PATTERN ( 500-IDX + 1) TO 800-ELEMENT-TABLE (121 : 8)
              methodOut.getElementTable800().replace(methodOut.getParsingPattern500(methodOut.getIdx500() + 1 - 1),0,methodOut.getParsingPattern500(methodOut.getIdx500() + 1 - 1).length,120,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
          }
      
      return methodOut;
      }
  
  
  
      public int call(ProgramContext ctx, Object[] params) throws Exception {
      Si994010Ctx programCtx = (Si994010Ctx) ctx;
      
      int len = params.length;
         if (len > 0 && params[0] != null )
            programCtx.getDataGroup1000().set((Field)params[0]);
         // invoke the process and return rc
         return process(programCtx);
         
      }
      
      public int call(ProgramContext ctx, Field... parameters) throws Exception {
      Si994010Ctx programCtx = (Si994010Ctx) ctx;
         for (int index = 0; index < parameters.length;index++) {
             switch(index) {
              case 0:
                      if(parameters[index] != null ) {
              		if (parameters[index] instanceof DataGroup1000) {
                       	programCtx.setDataGroup1000((DataGroup1000) parameters[index]);
                  	} else {
                       	programCtx.getDataGroup1000().set(parameters[index]);
                  	}
                  }
                
                  break;
            }
         }
      	return process(programCtx);
      }
      
      
  
  
  
  
  
  }
