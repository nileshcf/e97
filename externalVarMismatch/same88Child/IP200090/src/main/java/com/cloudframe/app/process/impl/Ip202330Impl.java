  package com.cloudframe.app.process.impl;
   /* The comment section is too large, 
	 * hence added at the end of the java code 
	 * please scroll all the way to the bottom to see complete comments 
	 */
  
  import java.util.regex.Pattern;
  import com.cloudframe.app.ip202330.Ip202330Ctx.*;
  import com.cloudframe.app.ip202330.Ip202330Ctx;
  import com.cloudframe.app.process.Ip202330;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.process.Ip996010;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.process.*;
  import java.nio.CharBuffer;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.process.Ip200110;
  import com.cloudframe.app.process.Ip610010;
  import com.cloudframe.app.ip202330.dto.*;
  import com.cloudframe.app.ip202330.dto.FormatTypeErrorMessage600;
  import com.cloudframe.app.ip202330.dto.AbendMessage900;
  import com.cloudframe.app.global.sharedvar.Ip66102IpmMsg;
  import com.cloudframe.app.ip202330.dto.AbendParaName900;
  import com.cloudframe.app.global.sharedvar.Ip000604DeAttrTable;
  import com.cloudframe.app.global.sharedvar.Ip000804PdsAttributes;
  import com.cloudframe.app.global.sharedvar.Ip60001EventLogWorkArea;
  import com.cloudframe.app.global.sharedvar.Ip65504CurrentTagTable;
  import com.cloudframe.app.global.sharedvar.Ip65504TcntGroup;
  import com.cloudframe.app.global.sharedvar.Ip65504MessageStatusGroup;
  import com.cloudframe.app.global.sharedvar.Ip65504SelElemEntriesAll;
  import com.cloudframe.app.global.sharedvar.Ip65504TaggedRecordInfo;
  import com.cloudframe.app.global.sharedvar.Ip65504DeMapGroup;
  import com.cloudframe.app.global.sharedvar.Ip65504SelPdsEntriesAll;
  import com.cloudframe.app.global.sharedvar.Ip65504PdsMapGroup;
  import com.cloudframe.app.global.sharedvar.Ip66102IpmFileInformation;
  import com.cloudframe.app.global.sharedvar.AdditionalSyntaxChecksGroup100;
  import com.cloudframe.app.global.sharedvar.Ip00321EditListRec;
  import com.cloudframe.app.global.sharedvar.Ip996011ProgramStartMessage;
  import com.cloudframe.app.global.sharedvar.StrtLngth800;
  import com.cloudframe.app.ip202330.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("ip202330")
  
  public class Ip202330Impl extends CommonProcess implements Ip202330 {
  
  Logger logger = LoggerFactory.getLogger(Ip202330Impl.class);
  
  
  
  
  @Autowired 
  @Qualifier("ip200110")
  Ip200110 ip200110;
  
  
  private static final Pattern ALPHA_SPACE = Pattern.compile("^[A-Z|a-z|\\s]*$");
  private static final Pattern NUMERIC_SPACE = Pattern.compile("^[0-9|\\s]*$");
  private static final Pattern ALPHA_NUMERIC = Pattern.compile("^[A-Z|a-z|0-9]*$");
  private static final Pattern ALPHA_NUMERIC_SPACE = Pattern.compile("^[A-Z|a-z|0-9|\\s]*$");
  private static final Pattern ALPHA_NUMERIC_SPACE_DASH = Pattern.compile("^[A-Z|a-z|0-9|\\s|\\-]*$");
  
  
  
  
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      public int process(Ip202330Ctx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
          ;
//  PERFORM 0000-MAINLINE
          mainline(programCtx);/*0000-MAINLINE*/
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
  *   COBOL Paragraph - 0000-MAINLINE COBOL Cyclomatic complexity - 2
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void mainline(Ip202330Ctx programCtx) throws Exception {
      
// *-----------------------------------------------------------------
// *Check for first time entry. if first time entry, display
// *necessary information like program name, version etc and then
// *perform syntax edits.
// *-----------------------------------------------------------------
//  PERFORM 1000-PERFORM-INITIALIZATION
          performInitialization(programCtx.getPerformInitializationInCtx());/*1000-PERFORM-INITIALIZATION*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  PERFORM 2000-PERFORM-EDIT
          performEdit(programCtx.getPerformEditInCtx());/*2000-PERFORM-EDIT*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return ;
      
      }
      /**
      * performInitialization 
      *   This method is derived from 
  *   COBOL Paragraph - 1000-PERFORM-INITIALIZATION COBOL Cyclomatic complexity - 3
      * Input  :  

      * - edit0233300                    COBOL Name: 300-EDIT-0233
      * - isItTheFirstTime100            COBOL Name: 100-IS-IT-THE-FIRST-TIME
      * - pgmIp200110300                 COBOL Name: 300-PGM-IP200110
      *
      * Output :  

      * - ip60001HoldPgmName             COBOL Name: IP60001-HOLD-PGM-NAME
      * - edit0233300                    COBOL Name: 300-EDIT-0233
      * - rc                             COBOL Name: RETURN-CODE
      * - ptrIp200110800                 COBOL Name: 800-PTR-IP200110
      * - isItTheFirstTime100            COBOL Name: 100-IS-IT-THE-FIRST-TIME
      *
      * @throws CFException
      */
      @Override
      public PerformInitializationOutCtx performInitialization(PerformInitializationInCtx methodIn) throws Exception {
      
// *All the initialization activities are done in this para. if it
// *is the first time then it will display log details.
// *-----------------------------------------------------------------
Ip202330Ctx programCtx = methodIn.getIp202330Ctx();
PerformInitializationOutCtx methodOut = methodIn.getPerformInitializationOutCtx();
//  MOVE 300-EDIT-0233 TO IP60001-HOLD-PGM-NAME
          methodOut.setIp60001HoldPgmName(methodOut.getEdit0233300());
//  PERFORM 9950-UPDATE-EVENT-LOG
          updateEventLog(programCtx.getUpdateEventLogInCtx());/*9950-UPDATE-EVENT-LOG*/
//  MOVE ZEROES TO RETURN-CODE
          programCtx.setRc(0);
//  IF 88-100-IT-IS-THE-FIRST-TIME
          if ( methodIn.isItIsTheFirstTime88100()  ) { 
//  SET 800-PTR-IP200110 TO ENTRY 300-PGM-IP200110
              methodOut.setPtrIp200110800(methodIn.getPgmIp200110300()); 
              
//  PERFORM 1100-DISPLAY-EXEC-MSGS
              displayExecMsgs(programCtx.getDisplayExecMsgsInCtx());/*1100-DISPLAY-EXEC-MSGS*/
//  SET 88-100-IT-IS-NOT-FIRST-TIME TO TRUE
              methodOut.setItIsNotFirstTime88100True(); 
              
          }
      
      return methodOut;
      }
      /**
      * displayExecMsgs 
      *   This method is derived from 
  *   COBOL Paragraph - 1100-DISPLAY-EXEC-MSGS COBOL Cyclomatic complexity - 2
      * Input  :  

      * - edit0233300                    COBOL Name: 300-EDIT-0233
      * - pgmVersion300                  COBOL Name: 300-PGM-VERSION
      * - pgmIp996010300                 COBOL Name: 300-PGM-IP996010
      *
      * Output :  

      * - ip996011PgmId                  COBOL Name: IP996011-PGM-ID
      * - edit0233300                    COBOL Name: 300-EDIT-0233
      * - ip996011PgmVersion             COBOL Name: IP996011-PGM-VERSION
      * - pgmVersion300                  COBOL Name: 300-PGM-VERSION
      * - ip996011WhenCompiled           COBOL Name: IP996011-WHEN-COMPILED
      * - ptrIp996010800                 COBOL Name: 800-PTR-IP996010
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public DisplayExecMsgsOutCtx displayExecMsgs(DisplayExecMsgsInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph displays the program execution messages.
// *-----------------------------------------------------------------
Ip202330Ctx programCtx = methodIn.getIp202330Ctx();
DisplayExecMsgsOutCtx methodOut = methodIn.getDisplayExecMsgsOutCtx();
//  MOVE 300-EDIT-0233 TO IP996011-PGM-ID
          methodOut.setIp996011PgmId(methodOut.getEdit0233300());
//  MOVE 300-PGM-VERSION TO IP996011-PGM-VERSION
          methodOut.setIp996011PgmVersion(methodOut.getPgmVersion300());
          // MOVE WHEN-COMPILED TO IP996011-WHEN-COMPILED
          //  FORMAT1311677340 = "X(08)BX(08)"
          methodOut.setIp996011WhenCompiled(CFUtil.cobolAnEditFormatter(CONSTANTS.FORMAT1311677340,CONSTANTS.LITERAL_1484748993));
//  SET 800-PTR-IP996010 TO ENTRY 300-PGM-IP996010
          methodOut.setPtrIp996010800(methodIn.getPgmIp996010300()); 
          
//  CALL 800-PTR-IP996010
          // CALL 800-PTR-IP996010
          	programCtx.setRc( ip996010.process(programCtx.getGlobalCtx().getContext("IP996010")));
      
      return methodOut;
      }
      /**
      * performEdit 
      *   This method is derived from 
  *   COBOL Paragraph - 2000-PERFORM-EDIT COBOL Cyclomatic complexity - 14
      * Input  :  

      * - additionalSyntaxChecks100      COBOL Name: 100-ADDITIONAL-SYNTAX-CHECKS
      * - candidateLngth800              COBOL Name: 800-CANDIDATE-LNGTH
      * - rc                             COBOL Name: RETURN-CODE
      *
      * Output : None 

      * @throws CFException
      */
      @Override
      public void performEdit(PerformEditInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph performs actual syntax edit.
// *1.first routine checks whether the syntax edit is to be performed
// *  for mti, data element or for pds.
// *
// *2.second routine evaluates the candidate data attribute and
// *  accordingly performs necessary primary syntax edits.
// *
// *if the syntax edit does not fail then it performs another routine
// *to check for the additional syntax if required.
// *-----------------------------------------------------------------
Ip202330Ctx programCtx = methodIn.getIp202330Ctx();
//  PERFORM 2100-CHECK-FOR-DE-PDS-MTI
          checkForDePdsMti(programCtx.getCheckForDePdsMtiInCtx());/*2100-CHECK-FOR-DE-PDS-MTI*/
//  IF 88-100-NOT-ALL-SPACES OR 88-100-NOT-SPACES-OR-ZEROS OR 88-100-NOT-SPACES-ZEROS-ALPHA OR 88-100-NOT-SPACES-ZEROS-NINE OR 88-100-LEFT-JUSTIFY-NO-BASIC OR 88-100-NO-ZERO-BASIC-PRESENCE OR 88-100-NO-LH-BASIC-PRESENCE OR 88-100-LEFT-JUSTIFY-NO-SPC-ZER OR 88-100-LEFT-JUSTIFY-NOT-SPACE OR 800-CANDIDATE-LNGTH IS EQUAL TO ZEROES
//  ELSE
          if (!(methodIn.isNotAllSpaces88100())  && !(methodIn.isNotSpacesOrZeros88100())  && !(methodIn.isNotSpacesZerosAlpha88100())  && !(methodIn.isNotSpacesZerosNine88100())  && !(methodIn.isLeftJustifyNoBasic88100())  && !(methodIn.isNoZeroBasicPresence88100())  && !(methodIn.isNoLhBasicPresence88100())  && !(methodIn.isLeftJustifyNoSpcZer88100())  && !(methodIn.isLeftJustifyNotSpace88100())  && 	( methodIn.getCandidateLngth800() != 0 ) ) { 
//  PERFORM 2200-PERFORM-PRIMARY-EDIT
              performPrimaryEdit(programCtx.getPerformPrimaryEditInCtx());/*2200-PERFORM-PRIMARY-EDIT*/
          }
//  IF RETURN-CODE GREATER THAN ZERO OR 88-100-NO-ADDITIONAL-CHECKS OR 800-CANDIDATE-LNGTH IS EQUAL TO ZEROES
//  ELSE
          if (	( programCtx.getRc() <= 0 ) && !(methodIn.isNoAdditionalChecks88100())  && 	( methodIn.getCandidateLngth800() != 0 ) ) { 
//  PERFORM 2300-CHECK-ADDITIONAL-SYNTAX
              checkAdditionalSyntax(programCtx.getCheckAdditionalSyntaxInCtx());/*2300-CHECK-ADDITIONAL-SYNTAX*/
          }
      
      }
      /**
      * checkForDePdsMti 
      *   This method is derived from 
  *   COBOL Paragraph - 2100-CHECK-FOR-DE-PDS-MTI COBOL Cyclomatic complexity - 4
      * Input  :  

      * - ip00321IpmFieldType            COBOL Name: IP00321-IPM-FIELD-TYPE
      * - valueOne300                    COBOL Name: 300-VALUE-ONE
      * - ip65504TagStarts               COBOL Name: IP65504-TAG-STARTS
      * - ip65504TagLngth                COBOL Name: IP65504-TAG-LNGTH
      * - numericSyntax300               COBOL Name: 300-NUMERIC-SYNTAX
      * - ip00321IpmFieldNumber          COBOL Name: IP00321-IPM-FIELD-NUMBER
      * - ip65504DeStart                 COBOL Name: IP65504-DE-START
      * - ip65504DeLngth                 COBOL Name: IP65504-DE-LNGTH
      * - ip000604DeFormat               COBOL Name: IP000604-DE-FORMAT
      * - ip65504PdsStart                COBOL Name: IP65504-PDS-START
      * - ip65504PdsLngth                COBOL Name: IP65504-PDS-LNGTH
      * - ip000804PdsFormat              COBOL Name: IP000804-PDS-FORMAT
      *
      * Output :  

      * - ip65504T                       COBOL Name: IP65504-T
      * - candidateStart800              COBOL Name: 800-CANDIDATE-START
      * - ip65504TagStarts               COBOL Name: IP65504-TAG-STARTS
      * - candidateLngth800              COBOL Name: 800-CANDIDATE-LNGTH
      * - ip65504TagLngth                COBOL Name: IP65504-TAG-LNGTH
      * - candidateSyntax800             COBOL Name: 800-CANDIDATE-SYNTAX
      * - numericSyntax300               COBOL Name: 300-NUMERIC-SYNTAX
      * - ip65504D                       COBOL Name: IP65504-D
      * - ip000604I                      COBOL Name: IP000604-I
      * - ip65504DeStart                 COBOL Name: IP65504-DE-START
      * - ip65504DeLngth                 COBOL Name: IP65504-DE-LNGTH
      * - ip000604DeFormat               COBOL Name: IP000604-DE-FORMAT
      * - ip65504P                       COBOL Name: IP65504-P
      * - ip000804I                      COBOL Name: IP000804-I
      * - ip65504PdsStart                COBOL Name: IP65504-PDS-START
      * - ip65504PdsLngth                COBOL Name: IP65504-PDS-LNGTH
      * - ip000804PdsFormat              COBOL Name: IP000804-PDS-FORMAT
      *
      * @throws CFException
      */
      @Override
      public CheckForDePdsMtiOutCtx checkForDePdsMti(CheckForDePdsMtiInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *Check whether the syntax edit is to be performed for mti, data
// *element or for pds. depending on this, move start,length and
// *data attribute of the field to working storage variables.
// *-----------------------------------------------------------------
Ip202330Ctx programCtx = methodIn.getIp202330Ctx();
CheckForDePdsMtiOutCtx methodOut = methodIn.getCheckForDePdsMtiOutCtx();
//  EVALUATE TRUE
          if  ( methodIn.isIp00321MMti88()  ) { 
//  SET IP65504-T TO 300-VALUE-ONE
              methodOut.setIp65504T(methodIn.getValueOne300()); 
              
//  MOVE IP65504-TAG-STARTS ( IP65504-T ) TO 800-CANDIDATE-START
              methodOut.setCandidateStart800(methodOut.getIp65504TagStarts(methodOut.getIp65504T() - 1));
//  MOVE IP65504-TAG-LNGTH ( IP65504-T ) TO 800-CANDIDATE-LNGTH
              methodOut.setCandidateLngth800(methodOut.getIp65504TagLngth(methodOut.getIp65504T() - 1));
//  MOVE 300-NUMERIC-SYNTAX TO 800-CANDIDATE-SYNTAX
              methodOut.setCandidateSyntax800(methodOut.getNumericSyntax300());
          }
          else if  ( methodIn.isIp00321DDataElement88()  ) { 

// *** Gcms 5.1 changes begin ***
//  SET IP65504-D IP000604-I TO IP00321-IPM-FIELD-NUMBER
              methodOut.setIp65504D((int) (int) methodIn.getIp00321IpmFieldNumber()); 
              
              methodOut.setIp000604I((int) (int) methodIn.getIp00321IpmFieldNumber()); 
              
//  MOVE IP65504-DE-START ( IP65504-D ) TO 800-CANDIDATE-START
              methodOut.setCandidateStart800(methodOut.getIp65504DeStart(methodOut.getIp65504D() - 1));
//  MOVE IP65504-DE-LNGTH ( IP65504-D ) TO 800-CANDIDATE-LNGTH
              methodOut.setCandidateLngth800(methodOut.getIp65504DeLngth(methodOut.getIp65504D() - 1));
//  MOVE IP000604-DE-FORMAT ( IP000604-I ) TO 800-CANDIDATE-SYNTAX
              methodOut.setCandidateSyntax800(methodOut.getIp000604DeFormat(methodOut.getIp000604I() - 1));
//  PERFORM 8000-CALL-PGM-IP200110
              callPgmIp200110(programCtx.getCallPgmIp200110InCtx());/*8000-CALL-PGM-IP200110*/
          }
          else if  ( methodIn.isIp00321PPds88()  ) { 
//  SET IP65504-P IP000804-I TO IP00321-IPM-FIELD-NUMBER
              methodOut.setIp65504P((int) (int) methodIn.getIp00321IpmFieldNumber()); 
              
              methodOut.setIp000804I((int) (int) methodIn.getIp00321IpmFieldNumber()); 
              
//  MOVE IP65504-PDS-START ( IP65504-P ) TO 800-CANDIDATE-START
              methodOut.setCandidateStart800(methodOut.getIp65504PdsStart(methodOut.getIp65504P() - 1));
//  MOVE IP65504-PDS-LNGTH ( IP65504-P ) TO 800-CANDIDATE-LNGTH
              methodOut.setCandidateLngth800(methodOut.getIp65504PdsLngth(methodOut.getIp65504P() - 1));
//  MOVE IP000804-PDS-FORMAT ( IP000804-I ) TO 800-CANDIDATE-SYNTAX
              methodOut.setCandidateSyntax800(methodOut.getIp000804PdsFormat(methodOut.getIp000804I() - 1));
//  PERFORM 8000-CALL-PGM-IP200110
              callPgmIp200110(programCtx.getCallPgmIp200110InCtx());/*8000-CALL-PGM-IP200110*/
          }
      
      return methodOut;
      }
      /**
      * performPrimaryEdit 
      *   This method is derived from 
  *   COBOL Paragraph - 2200-PERFORM-PRIMARY-EDIT COBOL Cyclomatic complexity - 17
      * Input  :  

      * - candidateSyntax800             COBOL Name: 800-CANDIDATE-SYNTAX
      * - additionalSyntaxChecks100      COBOL Name: 100-ADDITIONAL-SYNTAX-CHECKS
      * - valueOne300                    COBOL Name: 300-VALUE-ONE
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      * - valueOne300                    COBOL Name: 300-VALUE-ONE
      *
      * @throws CFException
      */
      @Override
      public PerformPrimaryEditOutCtx performPrimaryEdit(PerformPrimaryEditInCtx methodIn) throws Exception {
      
// *** Gcms 5.1 changes end   ***

// *-----------------------------------------------------------------
// *The routine will perform the following primary syntax checks:
// *-----------------------------------------------------------------
// *    1. mti numeric check.
// *    2. de/pds numeric check.
// *    3. de/pds alphabetic
// *    4. de/pds alphabet or space
// *    5. de/pds numeric or spaces check.
// *    6. de/pds alpha numeric check.
// *    7. de/pds alphabetic, numeric and special character check.
// *    8. de/pds alphabetic, numeric and space character check.
// *-----------------------------------------------------------------
Ip202330Ctx programCtx = methodIn.getIp202330Ctx();
PerformPrimaryEditOutCtx methodOut = methodIn.getPerformPrimaryEditOutCtx();
//  EVALUATE TRUE
          if  ( methodIn.isNumeric88800()  ) { 
//  PERFORM 2210-CHECK-FOR-NUMERIC
              checkForNumeric(programCtx.getCheckForNumericInCtx());/*2210-CHECK-FOR-NUMERIC*/
          }
          else if  ( methodIn.isAlphabet88800()  ) { 
//  PERFORM 2220-CHECK-FOR-ALPHABETIC
              checkForAlphabetic(programCtx.getCheckForAlphabeticInCtx());/*2220-CHECK-FOR-ALPHABETIC*/
          }
          else if  ( methodIn.isAlphabetSpace88800()  ) { 
//  PERFORM 2230-CHECK-FOR-ALPHABET-SPACE
              checkForAlphabetSpace(programCtx.getCheckForAlphabetSpaceInCtx());/*2230-CHECK-FOR-ALPHABET-SPACE*/
          }
          else if  ( methodIn.isNumericSpace88800()  ) { 
//  PERFORM 2240-CHECK-FOR-NUMERIC-SPACE
              checkForNumericSpace(programCtx.getCheckForNumericSpaceInCtx());/*2240-CHECK-FOR-NUMERIC-SPACE*/
          }
          else if  ( methodIn.isAlphabetNumeric88800()  ) { 
//  PERFORM 2250-CHECK-ALPHABET-NUMERIC
              checkAlphabetNumeric(programCtx.getCheckAlphabetNumericInCtx());/*2250-CHECK-ALPHABET-NUMERIC*/
          }
          else if  ( methodIn.isAlphanumSpecial88800()  ) { 

// *** Gcms 3.2 changes begin ***
//  IF 88-100-ALPHANUMERIC-SPACE
              if ( methodIn.isAlphanumericSpace88100()  ) { 
//  PERFORM 2270-CHECK-ALPHANUM-SPACE
                  checkAlphanumSpace(programCtx.getCheckAlphanumSpaceInCtx());/*2270-CHECK-ALPHANUM-SPACE*/
              }
//  ELSE
              else { 
//  IF 88-100-ALPNUM-DAS-NT-AL-SPC
                  if ( methodIn.isAlpnumDasNtAlSpc88100()  ) { 
//  PERFORM 2280-CHECK-ALPHANUM-DASH
                      checkAlphanumDash(programCtx.getCheckAlphanumDashInCtx());/*2280-CHECK-ALPHANUM-DASH*/
                  }
//  ELSE
                  else { 
//  IF 88-100-ALPNUM-NOT-SPACE-ZERO
                      if ( methodIn.isAlpnumNotSpaceZero88100()  ) { 
//  PERFORM 2290-CHECK-NOT-SPACE-ZERO
                          checkNotSpaceZero(programCtx.getCheckNotSpaceZeroInCtx());/*2290-CHECK-NOT-SPACE-ZERO*/
                      }
//  ELSE
                      else { 
//  PERFORM 8100-CHECK-NOT-LOW-HIGH-VALUE
                          checkNotLowHighValue(programCtx.getCheckNotLowHighValueInCtx());/*8100-CHECK-NOT-LOW-HIGH-VALUE*/
                      }
                  }
              }
          }
          else if  (( methodIn.isPad88800()  ) || ( methodIn.isSpecial88800()  ) || ( methodIn.isBinary88800()  ) || ( methodIn.isTrackData88800()  ) || ( methodIn.isCreditOrDebit88800()  ) || ( methodIn.isAlphanumPad88800()  )) { 
              ;
          }
          else   { 
//  MOVE 300-VALUE-ONE TO RETURN-CODE
              programCtx.setRc(methodOut.getValueOne300());
//  PERFORM 2260-BUILD-ABEND-DATA
              buildAbendData(programCtx.getBuildAbendDataInCtx());/*2260-BUILD-ABEND-DATA*/
          }
      
      return methodOut;
      }
      /**
      * checkForNumeric 
      *   This method is derived from 
  *   COBOL Paragraph - 2210-CHECK-FOR-NUMERIC COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ip66102IpmMsg                  COBOL Name: IP66102-IPM-MSG
      * - candidateStart800              COBOL Name: 800-CANDIDATE-START
      * - candidateLngth800              COBOL Name: 800-CANDIDATE-LNGTH
      * - valueOne300                    COBOL Name: 300-VALUE-ONE
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      * - valueOne300                    COBOL Name: 300-VALUE-ONE
      *
      * @throws CFException
      */
      @Override
      public CheckForNumericOutCtx checkForNumeric(CheckForNumericInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *The required data is extracted from current message and check if
// *it is numeric.
// *-----------------------------------------------------------------
Ip202330Ctx programCtx = methodIn.getIp202330Ctx();
CheckForNumericOutCtx methodOut = methodIn.getCheckForNumericOutCtx();
//  IF IP66102-IPM-MSG ( 800-CANDIDATE-START : 800-CANDIDATE-LNGTH ) IS NUMERIC
//  ELSE
          if (    !( isNumeric(substring(methodIn.getIp66102IpmMsg().getCharArray(),(methodIn.getCandidateStart800()-1), (methodIn.getCandidateLngth800() + (methodIn.getCandidateStart800() - 1)) )) )) { 
//  MOVE 300-VALUE-ONE TO RETURN-CODE
              programCtx.setRc(methodOut.getValueOne300());
          }
      
      return methodOut;
      }
      /**
      * checkForAlphabetic 
      *   This method is derived from 
  *   COBOL Paragraph - 2220-CHECK-FOR-ALPHABETIC COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ip66102IpmMsg                  COBOL Name: IP66102-IPM-MSG
      * - candidateStart800              COBOL Name: 800-CANDIDATE-START
      * - candidateLngth800              COBOL Name: 800-CANDIDATE-LNGTH
      * - valueOne300                    COBOL Name: 300-VALUE-ONE
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      * - valueOne300                    COBOL Name: 300-VALUE-ONE
      *
      * @throws CFException
      */
      @Override
      public CheckForAlphabeticOutCtx checkForAlphabetic(CheckForAlphabeticInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *The required data is extracted from current message and checked
// *for alphabetic data.
// *-----------------------------------------------------------------
Ip202330Ctx programCtx = methodIn.getIp202330Ctx();
CheckForAlphabeticOutCtx methodOut = methodIn.getCheckForAlphabeticOutCtx();
//  IF IP66102-IPM-MSG ( 800-CANDIDATE-START : 800-CANDIDATE-LNGTH ) IS ALPHABETIC
//  ELSE
          if (  	    !(isAlphabetic(substring(methodIn.getIp66102IpmMsg().getCharArray(),(methodIn.getCandidateStart800()-1), (methodIn.getCandidateLngth800() + (methodIn.getCandidateStart800() - 1)) ))) /*Alphabetic*/) { 
//  MOVE 300-VALUE-ONE TO RETURN-CODE
              programCtx.setRc(methodOut.getValueOne300());
          }
      
      return methodOut;
      }
      /**
      * checkForAlphabetSpace 
      *   This method is derived from 
  *   COBOL Paragraph - 2230-CHECK-FOR-ALPHABET-SPACE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ip66102IpmMsg                  COBOL Name: IP66102-IPM-MSG
      * - candidateStart800              COBOL Name: 800-CANDIDATE-START
      * - candidateLngth800              COBOL Name: 800-CANDIDATE-LNGTH
      * - valueOne300                    COBOL Name: 300-VALUE-ONE
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      * - valueOne300                    COBOL Name: 300-VALUE-ONE
      *
      * @throws CFException
      */
      @Override
      public CheckForAlphabetSpaceOutCtx checkForAlphabetSpace(CheckForAlphabetSpaceInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *The required data is extracted from current message to check for
// *alphabetic or space.
// *
// *alpha-space class is defined in environment division.
// *-----------------------------------------------------------------
Ip202330Ctx programCtx = methodIn.getIp202330Ctx();
CheckForAlphabetSpaceOutCtx methodOut = methodIn.getCheckForAlphabetSpaceOutCtx();
//  IF IP66102-IPM-MSG ( 800-CANDIDATE-START : 800-CANDIDATE-LNGTH ) IS ALPHA-SPACE
//  ELSE
          if (!( ALPHA_SPACE.matcher(CharBuffer.wrap(substring(methodIn.getIp66102IpmMsg().getCharArray(),(methodIn.getCandidateStart800()-1), (methodIn.getCandidateLngth800() + (methodIn.getCandidateStart800() - 1)) ))).matches() ) /*class condition*/) { 
//  MOVE 300-VALUE-ONE TO RETURN-CODE
              programCtx.setRc(methodOut.getValueOne300());
          }
      
      return methodOut;
      }
      /**
      * checkForNumericSpace 
      *   This method is derived from 
  *   COBOL Paragraph - 2240-CHECK-FOR-NUMERIC-SPACE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ip66102IpmMsg                  COBOL Name: IP66102-IPM-MSG
      * - candidateStart800              COBOL Name: 800-CANDIDATE-START
      * - candidateLngth800              COBOL Name: 800-CANDIDATE-LNGTH
      * - valueOne300                    COBOL Name: 300-VALUE-ONE
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      * - valueOne300                    COBOL Name: 300-VALUE-ONE
      *
      * @throws CFException
      */
      @Override
      public CheckForNumericSpaceOutCtx checkForNumericSpace(CheckForNumericSpaceInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *The required data is extracted from current message to check for
// *numeric or space.
// *
// *numeric-space class is defined in environment division.
// *-----------------------------------------------------------------
Ip202330Ctx programCtx = methodIn.getIp202330Ctx();
CheckForNumericSpaceOutCtx methodOut = methodIn.getCheckForNumericSpaceOutCtx();
//  IF IP66102-IPM-MSG ( 800-CANDIDATE-START : 800-CANDIDATE-LNGTH ) IS NUMERIC-SPACE
//  ELSE
          if (!( NUMERIC_SPACE.matcher(CharBuffer.wrap(substring(methodIn.getIp66102IpmMsg().getCharArray(),(methodIn.getCandidateStart800()-1), (methodIn.getCandidateLngth800() + (methodIn.getCandidateStart800() - 1)) ))).matches() ) /*class condition*/) { 
//  MOVE 300-VALUE-ONE TO RETURN-CODE
              programCtx.setRc(methodOut.getValueOne300());
          }
      
      return methodOut;
      }
      /**
      * checkAlphabetNumeric 
      *   This method is derived from 
  *   COBOL Paragraph - 2250-CHECK-ALPHABET-NUMERIC COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ip66102IpmMsg                  COBOL Name: IP66102-IPM-MSG
      * - candidateStart800              COBOL Name: 800-CANDIDATE-START
      * - candidateLngth800              COBOL Name: 800-CANDIDATE-LNGTH
      * - valueOne300                    COBOL Name: 300-VALUE-ONE
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      * - valueOne300                    COBOL Name: 300-VALUE-ONE
      *
      * @throws CFException
      */
      @Override
      public CheckAlphabetNumericOutCtx checkAlphabetNumeric(CheckAlphabetNumericInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *The required data is extracted from current message to check for
// *alphabetic or numeric data.
// *
// *alpha-numeric class is defined in environment division.
// *-----------------------------------------------------------------
Ip202330Ctx programCtx = methodIn.getIp202330Ctx();
CheckAlphabetNumericOutCtx methodOut = methodIn.getCheckAlphabetNumericOutCtx();
//  IF IP66102-IPM-MSG ( 800-CANDIDATE-START : 800-CANDIDATE-LNGTH ) IS ALPHA-NUMERIC
//  ELSE
          if (!( ALPHA_NUMERIC.matcher(CharBuffer.wrap(substring(methodIn.getIp66102IpmMsg().getCharArray(),(methodIn.getCandidateStart800()-1), (methodIn.getCandidateLngth800() + (methodIn.getCandidateStart800() - 1)) ))).matches() ) /*class condition*/) { 
//  MOVE 300-VALUE-ONE TO RETURN-CODE
              programCtx.setRc(methodOut.getValueOne300());
          }
      
      return methodOut;
      }
      /**
      * buildAbendData 
      *   This method is derived from 
  *   COBOL Paragraph - 2260-BUILD-ABEND-DATA COBOL Cyclomatic complexity - 1
      * Input  :  

      * - ip00321IpmFieldNumber          COBOL Name: IP00321-IPM-FIELD-NUMBER
      * - formatAbendCode300             COBOL Name: 300-FORMAT-ABEND-CODE
      * - para2200300                    COBOL Name: 300-PARA-2200
      * - formatTypeErrorMessage600      COBOL Name: 600-FORMAT-TYPE-ERROR-MESSAGE
      *
      * Output :  

      * - errorFieldNumber600            COBOL Name: 600-ERROR-FIELD-NUMBER
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - ip60001EventErrorCode          COBOL Name: IP60001-EVENT-ERROR-CODE
      * - formatAbendCode300             COBOL Name: 300-FORMAT-ABEND-CODE
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para2200300                    COBOL Name: 300-PARA-2200
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - ip60001EventErrorMsg           COBOL Name: IP60001-EVENT-ERROR-MSG
      * - formatTypeErrorMessage600      COBOL Name: 600-FORMAT-TYPE-ERROR-MESSAGE
      *
      * @throws CFException
      */
      @Override
      public BuildAbendDataOutCtx buildAbendData(BuildAbendDataInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *The required data is moved to abend area.
// *-----------------------------------------------------------------
Ip202330Ctx programCtx = methodIn.getIp202330Ctx();
BuildAbendDataOutCtx methodOut = methodIn.getBuildAbendDataOutCtx();
          methodOut.setErrorFieldNumber600((short) (methodIn.getIp00321IpmFieldNumber()));
//  MOVE 300-FORMAT-ABEND-CODE TO 900-ABEND-CODE IP60001-EVENT-ERROR-CODE
          methodOut.setAbendCode900(methodOut.getFormatAbendCode300());
          methodOut.setIp60001EventErrorCode(methodOut.getFormatAbendCode300());
//  MOVE 300-PARA-2200 TO 900-ABEND-PARA
          methodOut.setAbendPara900(pad(30,methodOut.getPara2200300(),SPACE_CHAR,RIGHT_PAD));
          // MOVE 600-FORMAT-TYPE-ERROR-MESSAGE TO 900-ABEND-TEXT IP60001-EVENT-ERROR-MSG
          methodOut.setAbendText900(methodOut.getFormatTypeErrorMessage600().toCharArray());
          methodOut.setIp60001EventErrorMsg(methodOut.getFormatTypeErrorMessage600().toCharArray());
//  PERFORM 9000-TERMINATE-ON-ERROR
          terminateOnError(programCtx.getTerminateOnErrorInCtx());/*9000-TERMINATE-ON-ERROR*/
          ;
      
      return methodOut;
      }
      /**
      * checkAlphanumSpace 
      *   This method is derived from 
  *   COBOL Paragraph - 2270-CHECK-ALPHANUM-SPACE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ip66102IpmMsg                  COBOL Name: IP66102-IPM-MSG
      * - candidateStart800              COBOL Name: 800-CANDIDATE-START
      * - candidateLngth800              COBOL Name: 800-CANDIDATE-LNGTH
      * - valueOne300                    COBOL Name: 300-VALUE-ONE
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      * - valueOne300                    COBOL Name: 300-VALUE-ONE
      *
      * @throws CFException
      */
      @Override
      public CheckAlphanumSpaceOutCtx checkAlphanumSpace(CheckAlphanumSpaceInCtx methodIn) throws Exception {
      
// *** Gcms 3.2 changes begin ***
// *-----------------------------------------------------------------
// *the required data is extracted from current message to check for
// *alphabetic or numeric or space data.
// *
// *alpha-numeric-space class is defined in environment division.
// *-----------------------------------------------------------------
Ip202330Ctx programCtx = methodIn.getIp202330Ctx();
CheckAlphanumSpaceOutCtx methodOut = methodIn.getCheckAlphanumSpaceOutCtx();
//  IF IP66102-IPM-MSG ( 800-CANDIDATE-START : 800-CANDIDATE-LNGTH ) IS ALPHA-NUMERIC-SPACE
//  ELSE
          if (!( ALPHA_NUMERIC_SPACE.matcher(CharBuffer.wrap(substring(methodIn.getIp66102IpmMsg().getCharArray(),(methodIn.getCandidateStart800()-1), (methodIn.getCandidateLngth800() + (methodIn.getCandidateStart800() - 1)) ))).matches() ) /*class condition*/) { 
//  MOVE 300-VALUE-ONE TO RETURN-CODE
              programCtx.setRc(methodOut.getValueOne300());
          }
      
      return methodOut;
      }
      /**
      * checkAlphanumDash 
      *   This method is derived from 
  *   COBOL Paragraph - 2280-CHECK-ALPHANUM-DASH COBOL Cyclomatic complexity - 4
      * Input  :  

      * - ip66102IpmMsg                  COBOL Name: IP66102-IPM-MSG
      * - candidateStart800              COBOL Name: 800-CANDIDATE-START
      * - candidateLngth800              COBOL Name: 800-CANDIDATE-LNGTH
      * - valueOne300                    COBOL Name: 300-VALUE-ONE
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      * - valueOne300                    COBOL Name: 300-VALUE-ONE
      *
      * @throws CFException
      */
      @Override
      public CheckAlphanumDashOutCtx checkAlphanumDash(CheckAlphanumDashInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *The para will check for de/pds with alpha numeric dash but not  *
// *all spaces for pds0184                                          *
// *-----------------------------------------------------------------
Ip202330Ctx programCtx = methodIn.getIp202330Ctx();
CheckAlphanumDashOutCtx methodOut = methodIn.getCheckAlphanumDashOutCtx();
//  IF IP66102-IPM-MSG ( 800-CANDIDATE-START : 800-CANDIDATE-LNGTH ) IS EQUAL TO SPACES OR IP66102-IPM-MSG ( 800-CANDIDATE-START : 300-VALUE-ONE ) IS EQUAL TO SPACES
          if (Field.allSpaces(methodIn.getIp66102IpmMsg().toCharArray(),( (methodIn.getCandidateStart800() - 1) /*start*/ ), methodIn.getCandidateLngth800() /*len*/) || Field.allSpaces(methodIn.getIp66102IpmMsg().toCharArray(),( (methodIn.getCandidateStart800() - 1) /*start*/ ), methodOut.getValueOne300() /*len*/)) { 
//  MOVE 300-VALUE-ONE TO RETURN-CODE
              programCtx.setRc(methodOut.getValueOne300());
          }
//  ELSE
          else { 
//  IF IP66102-IPM-MSG ( 800-CANDIDATE-START : 800-CANDIDATE-LNGTH ) IS ALPHA-NUMERIC-SPACE-DASH
//  ELSE
              if (!( ALPHA_NUMERIC_SPACE_DASH.matcher(CharBuffer.wrap(substring(methodIn.getIp66102IpmMsg().getCharArray(),(methodIn.getCandidateStart800()-1), (methodIn.getCandidateLngth800() + (methodIn.getCandidateStart800() - 1)) ))).matches() ) /*class condition*/) { 
//  MOVE 300-VALUE-ONE TO RETURN-CODE
                  programCtx.setRc(methodOut.getValueOne300());
              }
          }
      
      return methodOut;
      }
      /**
      * checkNotSpaceZero 
      *   This method is derived from 
  *   COBOL Paragraph - 2290-CHECK-NOT-SPACE-ZERO COBOL Cyclomatic complexity - 4
      * Input  :  

      * - ip66102IpmMsg                  COBOL Name: IP66102-IPM-MSG
      * - candidateStart800              COBOL Name: 800-CANDIDATE-START
      * - candidateLngth800              COBOL Name: 800-CANDIDATE-LNGTH
      * - valueOne300                    COBOL Name: 300-VALUE-ONE
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      * - valueOne300                    COBOL Name: 300-VALUE-ONE
      *
      * @throws CFException
      */
      @Override
      public CheckNotSpaceZeroOutCtx checkNotSpaceZero(CheckNotSpaceZeroInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*
// *The para will check for de/pds with not all spaces , not all    *
// *zeros and must be left justified for pds0185                    *
// *----------------------------------------------------------------*
Ip202330Ctx programCtx = methodIn.getIp202330Ctx();
CheckNotSpaceZeroOutCtx methodOut = methodIn.getCheckNotSpaceZeroOutCtx();
//  IF IP66102-IPM-MSG ( 800-CANDIDATE-START : 800-CANDIDATE-LNGTH ) IS EQUAL TO SPACES OR ZEROS
          if (Field.allSpaces(methodIn.getIp66102IpmMsg().toCharArray(),( (methodIn.getCandidateStart800() - 1) /*start*/ ), methodIn.getCandidateLngth800() /*len*/) || ( allZeros(substring(methodIn.getIp66102IpmMsg().getCharArray(),(methodIn.getCandidateStart800()-1), (methodIn.getCandidateLngth800() + (methodIn.getCandidateStart800() - 1)) )) ) /*  ==  zeros*/) { 
//  MOVE 300-VALUE-ONE TO RETURN-CODE
              programCtx.setRc(methodOut.getValueOne300());
          }
//  ELSE
          else { 
//  IF IP66102-IPM-MSG ( 800-CANDIDATE-START : 300-VALUE-ONE ) IS NOT EQUAL TO SPACES
//  ELSE
              if (Field.allSpaces(methodIn.getIp66102IpmMsg().toCharArray(),( (methodIn.getCandidateStart800() - 1) /*start*/ ), methodOut.getValueOne300() /*len*/)) { 
//  MOVE 300-VALUE-ONE TO RETURN-CODE
                  programCtx.setRc(methodOut.getValueOne300());
              }
          }
      
      return methodOut;
      }
      /**
      * checkAdditionalSyntax 
      *   This method is derived from 
  *   COBOL Paragraph - 2300-CHECK-ADDITIONAL-SYNTAX COBOL Cyclomatic complexity - 13
      * Input  :  

      * - additionalSyntaxChecks100      COBOL Name: 100-ADDITIONAL-SYNTAX-CHECKS
      *
      * Output : None 

      * @throws CFException
      */
      @Override
      public void checkAdditionalSyntax(CheckAdditionalSyntaxInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *This routine check whether additional-syntax-checks external
// *variable is set. based on its value, the following additional
// *syntax checks are performed:
// *    1. de/pds not equal to zero check.
// *    2. de/pds not all spaces check.
// *    3. de/pds left justified check.
// *    4. de/pds left justified and not equal to spaces check.
// *    5. de/pds not low-values or high-values check.
// *    6. de/pds left justified and not all zeroes and spaces.
// *-----------------------------------------------------------------
Ip202330Ctx programCtx = methodIn.getIp202330Ctx();
//  EVALUATE TRUE
          if  (( methodIn.isNumericNotZero88100()  ) || ( methodIn.isNoZeroBasicPresence88100()  )) { 
//  PERFORM 2310-CHECK-NUMERIC-NOT-ZERO
              checkNumericNotZero(programCtx.getCheckNumericNotZeroInCtx());/*2310-CHECK-NUMERIC-NOT-ZERO*/
          }
          else if  ( methodIn.isNotAllSpaces88100()  ) { 
//  PERFORM 2320-CHECK-NOT-ALL-SPACES
              checkNotAllSpaces(programCtx.getCheckNotAllSpacesInCtx());/*2320-CHECK-NOT-ALL-SPACES*/
          }
          else if  ( methodIn.isNotSpacesOrZeros88100()  ) { 
//  PERFORM 2330-CHECK-NOT-SPACES-OR-ZEROS
              checkNotSpacesOrZeros(programCtx.getCheckNotSpacesOrZerosInCtx());/*2330-CHECK-NOT-SPACES-OR-ZEROS*/
          }
          else if  ( methodIn.isNotSpacesZerosNine88100()  ) { 
//  PERFORM 2360-CHECK-NOT-SPACE-ZERO-NINE
              checkNotSpaceZeroNine(programCtx.getCheckNotSpaceZeroNineInCtx());/*2360-CHECK-NOT-SPACE-ZERO-NINE*/
          }
          else if  (( methodIn.isLeftJustifyNotSpace88100()  ) || ( methodIn.isLeftJustifyNoBasic88100()  )) { 
//  PERFORM 2340-LEFT-JUSTIFY-NOT-SPACE
              leftJustifyNotSpace(programCtx.getLeftJustifyNotSpaceInCtx());/*2340-LEFT-JUSTIFY-NOT-SPACE*/
          }
          else if  ( methodIn.isLeftJustifyNoSpcZer88100()  ) { 
//  PERFORM 2350-LEFT-JUSTIFY-NO-SPC-ZER
              leftJustifyNoSpcZer(programCtx.getLeftJustifyNoSpcZerInCtx());/*2350-LEFT-JUSTIFY-NO-SPC-ZER*/
          }
          else if  ( methodIn.isNotSpacesZerosAlpha88100()  ) { 
//  PERFORM 2370-CHECK-NOT-SPC-ZER-ALPHA
              checkNotSpcZerAlpha(programCtx.getCheckNotSpcZerAlphaInCtx());/*2370-CHECK-NOT-SPC-ZER-ALPHA*/
          }
          else if  ( methodIn.isLeadSpaceLjAllZeros88100()  ) { 
//  PERFORM 2380-LEAD-SPACE-LJ-ALL-ZEROS
              leadSpaceLjAllZeros(programCtx.getLeadSpaceLjAllZerosInCtx());/*2380-LEAD-SPACE-LJ-ALL-ZEROS*/
          }
          else if  (( methodIn.isNotLowHighValue88100()  ) || ( methodIn.isNoLhBasicPresence88100()  )) { 
//  PERFORM 8100-CHECK-NOT-LOW-HIGH-VALUE
              checkNotLowHighValue(programCtx.getCheckNotLowHighValueInCtx());/*8100-CHECK-NOT-LOW-HIGH-VALUE*/
          }
      
      }
      /**
      * checkNumericNotZero 
      *   This method is derived from 
  *   COBOL Paragraph - 2310-CHECK-NUMERIC-NOT-ZERO COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ip66102IpmMsg                  COBOL Name: IP66102-IPM-MSG
      * - candidateStart800              COBOL Name: 800-CANDIDATE-START
      * - candidateLngth800              COBOL Name: 800-CANDIDATE-LNGTH
      * - valueOne300                    COBOL Name: 300-VALUE-ONE
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      * - valueOne300                    COBOL Name: 300-VALUE-ONE
      *
      * @throws CFException
      */
      @Override
      public CheckNumericNotZeroOutCtx checkNumericNotZero(CheckNumericNotZeroInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *The required data is extracted from current message to check for
// *zeros.
// *this additional check is performed for the edit requiring a check
// *for numeric but not zero. numeric check is already performed as
// *part of primary syntax check.
// *-----------------------------------------------------------------
Ip202330Ctx programCtx = methodIn.getIp202330Ctx();
CheckNumericNotZeroOutCtx methodOut = methodIn.getCheckNumericNotZeroOutCtx();
//  IF IP66102-IPM-MSG ( 800-CANDIDATE-START : 800-CANDIDATE-LNGTH ) IS EQUAL TO ZEROS
          if (( allZeros(substring(methodIn.getIp66102IpmMsg().getCharArray(),(methodIn.getCandidateStart800()-1), (methodIn.getCandidateLngth800() + (methodIn.getCandidateStart800() - 1)) )) ) /*  ==  zeros*/) { 
//  MOVE 300-VALUE-ONE TO RETURN-CODE
              programCtx.setRc(methodOut.getValueOne300());
          }
      
      return methodOut;
      }
      /**
      * checkNotAllSpaces 
      *   This method is derived from 
  *   COBOL Paragraph - 2320-CHECK-NOT-ALL-SPACES COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ip66102IpmMsg                  COBOL Name: IP66102-IPM-MSG
      * - candidateStart800              COBOL Name: 800-CANDIDATE-START
      * - candidateLngth800              COBOL Name: 800-CANDIDATE-LNGTH
      * - valueOne300                    COBOL Name: 300-VALUE-ONE
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      * - valueOne300                    COBOL Name: 300-VALUE-ONE
      *
      * @throws CFException
      */
      @Override
      public CheckNotAllSpacesOutCtx checkNotAllSpaces(CheckNotAllSpacesInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *The required data is extracted from current message to check for
// *spaces.if found it calls an error routine.
// *-----------------------------------------------------------------
Ip202330Ctx programCtx = methodIn.getIp202330Ctx();
CheckNotAllSpacesOutCtx methodOut = methodIn.getCheckNotAllSpacesOutCtx();
//  IF IP66102-IPM-MSG ( 800-CANDIDATE-START : 800-CANDIDATE-LNGTH ) IS EQUAL TO SPACES
          if (Field.allSpaces(methodIn.getIp66102IpmMsg().toCharArray(),( (methodIn.getCandidateStart800() - 1) /*start*/ ), methodIn.getCandidateLngth800() /*len*/)) { 
//  MOVE 300-VALUE-ONE TO RETURN-CODE
              programCtx.setRc(methodOut.getValueOne300());
          }
      
      return methodOut;
      }
      /**
      * checkNotSpacesOrZeros 
      *   This method is derived from 
  *   COBOL Paragraph - 2330-CHECK-NOT-SPACES-OR-ZEROS COBOL Cyclomatic complexity - 3
      * Input  :  

      * - ip66102IpmMsg                  COBOL Name: IP66102-IPM-MSG
      * - candidateStart800              COBOL Name: 800-CANDIDATE-START
      * - candidateLngth800              COBOL Name: 800-CANDIDATE-LNGTH
      * - valueOne300                    COBOL Name: 300-VALUE-ONE
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      * - valueOne300                    COBOL Name: 300-VALUE-ONE
      *
      * @throws CFException
      */
      @Override
      public CheckNotSpacesOrZerosOutCtx checkNotSpacesOrZeros(CheckNotSpacesOrZerosInCtx methodIn) throws Exception {
      
// *For spaces or zeroes.if found it calls an error routine.
// *-----------------------------------------------------------------
Ip202330Ctx programCtx = methodIn.getIp202330Ctx();
CheckNotSpacesOrZerosOutCtx methodOut = methodIn.getCheckNotSpacesOrZerosOutCtx();
//  IF IP66102-IPM-MSG ( 800-CANDIDATE-START : 800-CANDIDATE-LNGTH ) IS EQUAL TO SPACES OR ZEROS
          if (Field.allSpaces(methodIn.getIp66102IpmMsg().toCharArray(),( (methodIn.getCandidateStart800() - 1) /*start*/ ), methodIn.getCandidateLngth800() /*len*/) || ( allZeros(substring(methodIn.getIp66102IpmMsg().getCharArray(),(methodIn.getCandidateStart800()-1), (methodIn.getCandidateLngth800() + (methodIn.getCandidateStart800() - 1)) )) ) /*  ==  zeros*/) { 
//  MOVE 300-VALUE-ONE TO RETURN-CODE
              programCtx.setRc(methodOut.getValueOne300());
          }
      
      return methodOut;
      }
      /**
      * checkNotSpaceZeroNine 
      *   This method is derived from 
  *   COBOL Paragraph - 2360-CHECK-NOT-SPACE-ZERO-NINE COBOL Cyclomatic complexity - 7
      * Input  :  

      * - ip66102IpmMsg                  COBOL Name: IP66102-IPM-MSG
      * - candidateStart800              COBOL Name: 800-CANDIDATE-START
      * - candidateLngth800              COBOL Name: 800-CANDIDATE-LNGTH
      * - valueOne300                    COBOL Name: 300-VALUE-ONE
      * - startIndex800                  COBOL Name: 800-START-INDEX
      * - value9300                      COBOL Name: 300-VALUE-9
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      * - valueOne300                    COBOL Name: 300-VALUE-ONE
      * - elementStart800                COBOL Name: 800-ELEMENT-START
      * - candidateStart800              COBOL Name: 800-CANDIDATE-START
      * - startIndex800                  COBOL Name: 800-START-INDEX
      *
      * @throws CFException
      */
      @Override
      public CheckNotSpaceZeroNineOutCtx checkNotSpaceZeroNine(CheckNotSpaceZeroNineInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *The required data is extracted from current message and checked
// *for spaces or zeroes.if found it calls an error routine.
// *for spaces or zeroes or all nines.if found it calls an error
// *routine.
// *-----------------------------------------------------------------
Ip202330Ctx programCtx = methodIn.getIp202330Ctx();
CheckNotSpaceZeroNineOutCtx methodOut = methodIn.getCheckNotSpaceZeroNineOutCtx();
//  IF IP66102-IPM-MSG ( 800-CANDIDATE-START : 800-CANDIDATE-LNGTH ) IS EQUAL TO SPACES OR ZEROS
          if (Field.allSpaces(methodIn.getIp66102IpmMsg().toCharArray(),( (methodOut.getCandidateStart800() - 1) /*start*/ ), methodIn.getCandidateLngth800() /*len*/) || ( allZeros(substring(methodIn.getIp66102IpmMsg().getCharArray(),(methodOut.getCandidateStart800()-1), (methodIn.getCandidateLngth800() + (methodOut.getCandidateStart800() - 1)) )) ) /*  ==  zeros*/) { 
//  MOVE 300-VALUE-ONE TO RETURN-CODE
              programCtx.setRc(methodOut.getValueOne300());
          }
//  IF RETURN-CODE = 300-VALUE-ONE
//  ELSE
          if (	( programCtx.getRc() != methodOut.getValueOne300() ) ) { 
//  MOVE 300-VALUE-ONE TO RETURN-CODE
              programCtx.setRc(methodOut.getValueOne300());
//  MOVE 800-CANDIDATE-START TO 800-ELEMENT-START
              methodOut.setElementStart800(methodOut.getCandidateStart800());
//  PERFORM VARYING 800-START-INDEX FROM 1 BY 1 UNTIL 800-START-INDEX GREATER 800-CANDIDATE-LNGTH
              for (methodOut.setStartIndex800(1); (	( methodOut.getStartIndex800() <= methodIn.getCandidateLngth800() )) ; methodOut.setStartIndex800(methodOut.getStartIndex800() + 1) ) {
//  IF IP66102-IPM-MSG ( 800-ELEMENT-START : 1) NOT EQUAL 300-VALUE-9
                  if (!(Field.compareChar(methodIn.getIp66102IpmMsg().toCharArray() , methodIn.getValue9300() , ( (methodOut.getElementStart800() - 1) /*start*/ ), 1 /*left len*/ , 1 /*right len*/))) { 
//  MOVE ZEROES TO RETURN-CODE
                      programCtx.setRc(0);
                      methodOut.setStartIndex800((short) (methodIn.getCandidateLngth800() + 1));
                  }
//  ADD 1 TO 800-ELEMENT-START
                  methodOut.setElementStart800( (short) (methodOut.getElementStart800()+(short)1));
              }
          }
      
      return methodOut;
      }
      /**
      * leftJustifyNotSpace 
      *   This method is derived from 
  *   COBOL Paragraph - 2340-LEFT-JUSTIFY-NOT-SPACE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ip66102IpmMsg                  COBOL Name: IP66102-IPM-MSG
      * - candidateStart800              COBOL Name: 800-CANDIDATE-START
      * - valueOne300                    COBOL Name: 300-VALUE-ONE
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      * - valueOne300                    COBOL Name: 300-VALUE-ONE
      *
      * @throws CFException
      */
      @Override
      public LeftJustifyNotSpaceOutCtx leftJustifyNotSpace(LeftJustifyNotSpaceInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *The first position of the extracted variable is checked for
// *spaces.if found equal it calls an error routine.
// *-----------------------------------------------------------------
Ip202330Ctx programCtx = methodIn.getIp202330Ctx();
LeftJustifyNotSpaceOutCtx methodOut = methodIn.getLeftJustifyNotSpaceOutCtx();
//  IF IP66102-IPM-MSG ( 800-CANDIDATE-START : 300-VALUE-ONE ) IS EQUAL TO SPACES
          if (Field.allSpaces(methodIn.getIp66102IpmMsg().toCharArray(),( (methodIn.getCandidateStart800() - 1) /*start*/ ), methodOut.getValueOne300() /*len*/)) { 
//  MOVE 300-VALUE-ONE TO RETURN-CODE
              programCtx.setRc(methodOut.getValueOne300());
          }
      
      return methodOut;
      }
      /**
      * leftJustifyNoSpcZer 
      *   This method is derived from 
  *   COBOL Paragraph - 2350-LEFT-JUSTIFY-NO-SPC-ZER COBOL Cyclomatic complexity - 3
      * Input  :  

      * - ip66102IpmMsg                  COBOL Name: IP66102-IPM-MSG
      * - candidateStart800              COBOL Name: 800-CANDIDATE-START
      * - valueOne300                    COBOL Name: 300-VALUE-ONE
      * - candidateLngth800              COBOL Name: 800-CANDIDATE-LNGTH
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      * - valueOne300                    COBOL Name: 300-VALUE-ONE
      *
      * @throws CFException
      */
      @Override
      public LeftJustifyNoSpcZerOutCtx leftJustifyNoSpcZer(LeftJustifyNoSpcZerInCtx methodIn) throws Exception {
      
// *Spaces. the required data is also checked for spaces and zeroes.
// *if found equal it calls an error routine.
// *-----------------------------------------------------------------
Ip202330Ctx programCtx = methodIn.getIp202330Ctx();
LeftJustifyNoSpcZerOutCtx methodOut = methodIn.getLeftJustifyNoSpcZerOutCtx();
//  IF ( IP66102-IPM-MSG ( 800-CANDIDATE-START : 300-VALUE-ONE ) IS EQUAL TO SPACES OR IP66102-IPM-MSG ( 800-CANDIDATE-START : 800-CANDIDATE-LNGTH ) EQUAL ZEROS)
          if ((Field.allSpaces(methodIn.getIp66102IpmMsg().toCharArray(),( (methodIn.getCandidateStart800() - 1) /*start*/ ), methodOut.getValueOne300() /*len*/) || ( allZeros(substring(methodIn.getIp66102IpmMsg().getCharArray(),(methodIn.getCandidateStart800()-1), (methodIn.getCandidateLngth800() + (methodIn.getCandidateStart800() - 1)) )) ) /*  ==  zeros*/)) { 
//  MOVE 300-VALUE-ONE TO RETURN-CODE
              programCtx.setRc(methodOut.getValueOne300());
          }
      
      return methodOut;
      }
      /**
      * checkNotSpcZerAlpha 
      *   This method is derived from 
  *   COBOL Paragraph - 2370-CHECK-NOT-SPC-ZER-ALPHA COBOL Cyclomatic complexity - 4
      * Input  :  

      * - ip66102IpmMsg                  COBOL Name: IP66102-IPM-MSG
      * - candidateStart800              COBOL Name: 800-CANDIDATE-START
      * - candidateLngth800              COBOL Name: 800-CANDIDATE-LNGTH
      * - valueOne300                    COBOL Name: 300-VALUE-ONE
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      * - valueOne300                    COBOL Name: 300-VALUE-ONE
      *
      * @throws CFException
      */
      @Override
      public CheckNotSpcZerAlphaOutCtx checkNotSpcZerAlpha(CheckNotSpcZerAlphaInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *The required data is extracted from current message and checked
// *for spaces or zeroes or not numeric. if found equal, it sets
// *return code to 1.
// *-----------------------------------------------------------------
Ip202330Ctx programCtx = methodIn.getIp202330Ctx();
CheckNotSpcZerAlphaOutCtx methodOut = methodIn.getCheckNotSpcZerAlphaOutCtx();
//  IF IP66102-IPM-MSG ( 800-CANDIDATE-START : 800-CANDIDATE-LNGTH ) EQUAL SPACES OR IP66102-IPM-MSG ( 800-CANDIDATE-START : 800-CANDIDATE-LNGTH ) EQUAL ZEROES OR IP66102-IPM-MSG ( 800-CANDIDATE-START : 800-CANDIDATE-LNGTH ) IS NOT NUMERIC
          if (Field.allSpaces(methodIn.getIp66102IpmMsg().toCharArray(),( (methodIn.getCandidateStart800() - 1) /*start*/ ), methodIn.getCandidateLngth800() /*len*/) || ( allZeros(substring(methodIn.getIp66102IpmMsg().getCharArray(),(methodIn.getCandidateStart800()-1), (methodIn.getCandidateLngth800() + (methodIn.getCandidateStart800() - 1)) )) ) /*  ==  zeros*/ ||     !( isNumeric(substring(methodIn.getIp66102IpmMsg().getCharArray(),(methodIn.getCandidateStart800()-1), (methodIn.getCandidateLngth800() + (methodIn.getCandidateStart800() - 1)) )) )) { 
//  MOVE 300-VALUE-ONE TO RETURN-CODE
              programCtx.setRc(methodOut.getValueOne300());
          }
      
      return methodOut;
      }
      /**
      * leadSpaceLjAllZeros 
      *   This method is derived from 
  *   COBOL Paragraph - 2380-LEAD-SPACE-LJ-ALL-ZEROS COBOL Cyclomatic complexity - 3
      * Input  :  

      * - ip66102IpmMsg                  COBOL Name: IP66102-IPM-MSG
      * - candidateStart800              COBOL Name: 800-CANDIDATE-START
      * - valueOne300                    COBOL Name: 300-VALUE-ONE
      * - candidateLngth800              COBOL Name: 800-CANDIDATE-LNGTH
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      * - valueOne300                    COBOL Name: 300-VALUE-ONE
      *
      * @throws CFException
      */
      @Override
      public LeadSpaceLjAllZerosOutCtx leadSpaceLjAllZeros(LeadSpaceLjAllZerosInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *The first position of the extracted variable is checked for
// *spaces. the required data is also checked for contains all
// *zeroes if found equal it calls an error routine.
// *-----------------------------------------------------------------
Ip202330Ctx programCtx = methodIn.getIp202330Ctx();
LeadSpaceLjAllZerosOutCtx methodOut = methodIn.getLeadSpaceLjAllZerosOutCtx();
//  IF IP66102-IPM-MSG ( 800-CANDIDATE-START : 300-VALUE-ONE ) IS EQUAL SPACES OR IP66102-IPM-MSG ( 800-CANDIDATE-START : 800-CANDIDATE-LNGTH ) IS EQUAL ZEROS
          if (Field.allSpaces(methodIn.getIp66102IpmMsg().toCharArray(),( (methodIn.getCandidateStart800() - 1) /*start*/ ), methodOut.getValueOne300() /*len*/) || ( allZeros(substring(methodIn.getIp66102IpmMsg().getCharArray(),(methodIn.getCandidateStart800()-1), (methodIn.getCandidateLngth800() + (methodIn.getCandidateStart800() - 1)) )) ) /*  ==  zeros*/) { 
//  MOVE 300-VALUE-ONE TO RETURN-CODE
              programCtx.setRc(methodOut.getValueOne300());
          }
      
      return methodOut;
      }
      /**
      * callPgmIp200110 
      *   This method is derived from 
  *   COBOL Paragraph - 8000-CALL-PGM-IP200110 COBOL Cyclomatic complexity - 3
      * Input  :  

      * - candidateStrt800               COBOL Name: 800-CANDIDATE-STRT
      * - candidateLnth800               COBOL Name: 800-CANDIDATE-LNTH
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      * - candidateStart800              COBOL Name: 800-CANDIDATE-START
      * - candidateStrt800               COBOL Name: 800-CANDIDATE-STRT
      * - candidateLngth800              COBOL Name: 800-CANDIDATE-LNGTH
      * - candidateLnth800               COBOL Name: 800-CANDIDATE-LNTH
      *
      * @throws CFException
      */
      @Override
      public CallPgmIp200110OutCtx callPgmIp200110(CallPgmIp200110InCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *Call ip200110 to determine new de/pds start and length from
// *ip9013t1 for mexico domestic transctions.
// *-----------------------------------------------------------------
Ip202330Ctx programCtx = methodIn.getIp202330Ctx();
CallPgmIp200110OutCtx methodOut = methodIn.getCallPgmIp200110OutCtx();
//  CALL 800-PTR-IP200110
          // CALL 800-PTR-IP200110
          	programCtx.setRc( ip200110.process(programCtx.getGlobalCtx().getContext("IP200110")));
//  IF 800-CANDIDATE-STRT GREATER THAN ZERO AND 800-CANDIDATE-LNTH GREATER THAN ZERO
          if (	( methodOut.getCandidateStrt800() > 0 )  && 	( methodOut.getCandidateLnth800() > 0 ) ) { 
//  MOVE 800-CANDIDATE-STRT TO 800-CANDIDATE-START
              methodOut.setCandidateStart800(methodOut.getCandidateStrt800());
//  MOVE 800-CANDIDATE-LNTH TO 800-CANDIDATE-LNGTH
              methodOut.setCandidateLngth800(methodOut.getCandidateLnth800());
          }
      
      return methodOut;
      }
      /**
      * checkNotLowHighValue 
      *   This method is derived from 
  *   COBOL Paragraph - 8100-CHECK-NOT-LOW-HIGH-VALUE COBOL Cyclomatic complexity - 3
      * Input  :  

      * - ip66102IpmMsg                  COBOL Name: IP66102-IPM-MSG
      * - candidateStart800              COBOL Name: 800-CANDIDATE-START
      * - candidateLngth800              COBOL Name: 800-CANDIDATE-LNGTH
      * - valueOne300                    COBOL Name: 300-VALUE-ONE
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      * - valueOne300                    COBOL Name: 300-VALUE-ONE
      *
      * @throws CFException
      */
      @Override
      public CheckNotLowHighValueOutCtx checkNotLowHighValue(CheckNotLowHighValueInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *The required data is extracted from current message and checked
// *for low or high values.
// *
// *this check is also performed for de/pds's with data attribute as
// *'ans' in table 6 or 8.
// *-----------------------------------------------------------------
Ip202330Ctx programCtx = methodIn.getIp202330Ctx();
CheckNotLowHighValueOutCtx methodOut = methodIn.getCheckNotLowHighValueOutCtx();
//  IF IP66102-IPM-MSG ( 800-CANDIDATE-START : 800-CANDIDATE-LNGTH ) IS EQUAL TO LOW-VALUES OR HIGH-VALUES
          if (Field.compareAll(methodIn.getIp66102IpmMsg().toCharArray(),CONSTANTS.LOW_VALUE_STRING,( (methodIn.getCandidateStart800() - 1) /*start*/ ), methodIn.getCandidateLngth800() /*len*/) || Field.allHighValues(methodIn.getIp66102IpmMsg().toCharArray(),( (methodIn.getCandidateStart800() - 1) /*start*/ ), methodIn.getCandidateLngth800() /*len*/)) { 
//  MOVE 300-VALUE-ONE TO RETURN-CODE
              programCtx.setRc(methodOut.getValueOne300());
          }
      
      return methodOut;
      }
      /**
      * terminateOnError 
      *   This method is derived from 
  *   COBOL Paragraph - 9000-TERMINATE-ON-ERROR COBOL Cyclomatic complexity - 1
      * Input  :  

      * - abendParaName900               COBOL Name: 900-ABEND-PARA-NAME
      * - abendMessage900                COBOL Name: 900-ABEND-MESSAGE
      *
      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      @Override
      public TerminateOnErrorOutCtx terminateOnError(TerminateOnErrorInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// *This program abends if a valid data attribute is not found
// *in table 6 or 8.this para displays the abend message.
// *-----------------------------------------------------------------
Ip202330Ctx programCtx = methodIn.getIp202330Ctx();
TerminateOnErrorOutCtx methodOut = methodIn.getTerminateOnErrorOutCtx();
//  DISPLAY '***********************************'
          logger.info("***********************************"); 
//  DISPLAY 'A B E N D   A B E N D   A B E N D  '
          logger.info("A B E N D   A B E N D   A B E N D  "); 
//  DISPLAY 'A B E N D   I P 2 0 2 3 3 0        '
          logger.info("A B E N D   I P 2 0 2 3 3 0        "); 
//  DISPLAY '***********************************'
          logger.info("***********************************"); 
//  DISPLAY 900-ABEND-PARA-NAME
          logger.info(methodIn.getAbendParaName900().toString()); 
//  DISPLAY 900-ABEND-MESSAGE
          logger.info(methodIn.getAbendMessage900().toString()); 
//  CALL 300-ABEND-PGM
          // CALL 300-ABEND-PGM
          	programCtx.setRc( ip610010.process(programCtx.getGlobalCtx().getContext("IP610010")));
      
      return methodOut;
      }
      /**
      * updateEventLog 
      *   This method is derived from 
  *   COBOL Paragraph - 9950-UPDATE-EVENT-LOG COBOL Cyclomatic complexity - 3
      * Input  :  

      * - ip60001EventLogControl         COBOL Name: IP60001-EVENT-LOG-CONTROL
      * - ip60001Subscript               COBOL Name: IP60001-SUBSCRIPT
      * - ip60001HoldPgmName             COBOL Name: IP60001-HOLD-PGM-NAME
      *
      * Output :  

      * - ip60001Subscript               COBOL Name: IP60001-SUBSCRIPT
      * - ip60001PgmName                 COBOL Name: IP60001-PGM-NAME
      * - ip60001HoldPgmName             COBOL Name: IP60001-HOLD-PGM-NAME
      *
      * @throws CFException
      */
      @Override
      public UpdateEventLogOutCtx updateEventLog(UpdateEventLogInCtx methodIn) throws Exception {
      
// * Element ip601011 as of 10/31/02 04:53:52                    �vc�
// ******************************************************************
// *   description: this is the procedure division copybook to      *
// *                fill the event log table.  move the current     *
// *                program name to ip60001-hold-pgm-name and       *
// *                the current paragraph name to                   *
// *                ip60001-hold-para-name.  then perform paragraph *
// *                9950-update-event-log.                          *
// ******************************************************************
// *   modifications history                                        *
// *   date             project     modifications                   *
// *   07/30/99         2526        created                         *
// *   mm/dd/yy         xxxxxxx     description                     *
// ******************************************************************
// *  layout description:  event log update                         *
// ******************************************************************
// *  start copybook member ip601011 - event log update             *
// ******************************************************************
Ip202330Ctx programCtx = methodIn.getIp202330Ctx();
UpdateEventLogOutCtx methodOut = methodIn.getUpdateEventLogOutCtx();
//  IF 88-IP60001-LOG-EVENT
          if ( methodIn.isIp60001LogEvent88()  ) { 
//  IF IP60001-SUBSCRIPT = 500
              if (	( methodOut.getIp60001Subscript() == 500 ) ) { 
//  MOVE 1 TO IP60001-SUBSCRIPT
                  methodOut.setIp60001Subscript((long)1);
              }
//  ELSE
              else { 
//  ADD 1 TO IP60001-SUBSCRIPT
                  methodOut.setIp60001Subscript(methodOut.getIp60001Subscript()+(long)1);
              }
//  MOVE IP60001-HOLD-PGM-NAME TO IP60001-PGM-NAME ( IP60001-SUBSCRIPT )
              methodOut.setIp60001PgmName((int) methodOut.getIp60001Subscript() - 1,methodOut.getIp60001HoldPgmName());
          }
      
      return methodOut;
      }
  
  
  
  
  
  
  
  
  }
  /* 
* element ip202330 as of 06/28/21 11:35:06                    �vc�
*-----------------------------------------------------------------
*          -- -- -- c o n f i d e n t i a l -- -- --
*    this item contains information and procedures which are
*    proprietary to mastercard international, incorporated,
*    and which are confidential.  it is provided with the
*    express understanding that it is to be used only for the
*    benefit of interbank card association, and is not to be
*    used, copied, or disclosed for any other purpose.  any
*    authorized reproduction (in whole or  in part) of this
*    material must be marked with this legend.
*-----------------------------------------------------------------
*author.         isc.
*date-written.   july, 1999.
*security.       property of mastercard international, inc.
*-----------------------------------------------------------------
*program functionality:
*-----------------------------------------------------------------
*this is a common program for doing multiple syntax edits for mti,
*data element (de)or private data subelements (pds) which
*specifically fall under numeric,alphabetic,alphanumeric,spaces
*and related combinations.
*
*this program is called from the syntax edit driver program and
*the edit are set externally. these variables, indicate the
*additional syntax checks to be performed along with the edit.
*
*this program does following syntax checks.
*-----------------------------------------------------------------
*this program does the following primary syntax checks:
*-----------------------------------------------------------------
*    1. mti numeric check.
*    2. de/pds numeric check.
*    3. de/pds alphabetic
*    4. de/pds alphabet or space
*    5. de/pds numeric or spaces check.
*    6. de/pds alpha numeric check.
*    7. de/pds alphabetic, numeric and special character check.
*    8. de/pds alphabetic, numeric and space character check.
*
*-----------------------------------------------------------------
*this program does the following additional syntax checks. the
*flags corresponding to individual checks are set in the syntax
*edit driver program. the flags will be available to this program
*as external variables in ip302201 copybook:
*-----------------------------------------------------------------
*
*    1. de/pds not equal to zero check.
*    2. de/pds not all spaces check.
*    3. de/pds left justified and not equal to spaces check.
*    4. de/pds not low-values or high-values check.
*    5. de/pds not equal to spaces or zeros.
*    6. de/pds left justified and not all zeroes or spaces.
*    7. de/pds not all spaces ,zeros or nines.
*-----------------------------------------------------------------
*revision history:
*-----------------------------------------------------------------
*
*    project         :ses ipm pre-edit
*    date            :1999/07/05
*    version         :001.01
*    programmer      :isc
*    modification    :initial version
*-----------------------------------------------------------------
** project  |15/01/02 | regenerated for 02.1 release.         **
** version  |         | 001.02                                **
*-----------------------------------------------------------------
*    project         :gcms release 3.1
*    date            :2002/05/17
*    version         :001.03
*    programmer      :isc
*    modification    :modified to call ip996010 to display
*                     execution messages and version is updated.
*-----------------------------------------------------------------
*    project         :gcms release 3.2 - crf # 6510
*                     enhanced data.
*    date            :2003/10/03
*    programmer      :vijila victor
*    modification    :modified to include a check whether de/pds
*                     is left justified and not all zeroes or
*                     spaces.
*                     modified to include a check whether de/pds
*                     is alphabetic, numeric, or space.
*-----------------------------------------------------------------
*    project         :gcms 5.1 - asd03216                        *
*    date            :2005/04/01                                 *
*    programmer      :karthik shanmugam                          *
*    modification    :modified the program for asd03216          *
*-----------------------------------------------------------------
*    project         :asd4983/gcms 6.2 cq - atd0100071394        *
*    date            :2006/10/13                                 *
*    programmer      :gcms offshore team                         *
*    modification    :modified the program for asd04983          *
*----------------------------------------------------------------*
*    project         :gcms 09.2 - moneysend transaction routing  *
*    date            :2009/10/16                                 *
*    programmer      :shankar subramanian                        *
*    modification    :included syntax check for all nines        *
*----------------------------------------------------------------*
*    project         :gcms 11.q4 release - c22668                *
*                     mexico domestic switching phase ii         *
*    date            :2011/10/14                                 *
*    programmer      :wipro                                      *
*    modification    :included call to ip200110 to determine new *
*                     start and length of de/pds for mexico      *
*                     domestic transactions.                     *
*----------------------------------------------------------------*
*    project         :gcms release 18.q4 i8095                   *
*                     aav verification                           *
*    date            :2018/10/12                                 *
*    programmer      :wipro                                      *
*    modification    :modified the program to check if de/pds    *
*                     is alphanumeric with spaces or dash but    *
*                     not all spaces for pds0184 and to check if *
*                     de/pds is with not all spaces ,not all     *
*                     zeros & must be left justified for pds0185 *
*----------------------------------------------------------------*
*    project      : gcms release 18.q4 i6459 mpqr funding        *
*                   transactions                                 *
*    date         : 2018/10/12                                   *
*    programmer   : wipro                                        *
*    modification :included the logic in                         *
*                  2300-check-additional-syntax para to check    *
*                  whether the extracted de or pds contains      *
*                  leading spaces, or not left justified         *
*                  or contains all zeroes                        *
*----------------------------------------------------------------*
* project            :gcms release 21q4 pbi45784                 *
* date               :2021/10/16                                 *
* programmer         :shankar subramanian                        *
* modification       :included copybook ip000605                 *
*----------------------------------------------------------------*
*/
