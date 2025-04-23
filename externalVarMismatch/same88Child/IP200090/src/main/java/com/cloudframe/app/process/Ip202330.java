  package com.cloudframe.app.process;
   /* The comment section is too large, 
	 * hence added at the end of the java code 
	 * please scroll all the way to the bottom to see complete comments 
	 */
  
  import java.util.regex.Pattern;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.process.Ip996010;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.global.sharedvar.Ip00321ErrorInfo;
  import java.nio.CharBuffer;
  import com.cloudframe.app.ip202330.dto.ErrorText600;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.process.Ip200110;
  import com.cloudframe.app.process.Ip610010;
  import com.cloudframe.app.global.sharedvar.Ip66102IpmMsg;
  import com.cloudframe.app.ip202330.dto.*;
  import com.cloudframe.app.ip202330.dto.FormatTypeErrorMessage600;
  import com.cloudframe.app.ip202330.dto.AbendParaName900;
  import com.cloudframe.app.ip202330.dto.AbendMessage900;
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
  
  public class Ip202330 extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Ip202330.class);
  
  private FormatTypeErrorMessage600 formatTypeErrorMessage600 = new FormatTypeErrorMessage600() ;
  private AbendParaName900 abendParaName900 = new AbendParaName900() ;
  private AbendMessage900 abendMessage900 = new AbendMessage900() ;
  private Work work = new Work() ;
  
  
  
  @Autowired 
  @Qualifier("ip200110")
  Ip200110 ip200110;
  @Autowired 
  @Qualifier("global_ip66102IpmMsg")
  Ip66102IpmMsg ip66102IpmMsg;
  @Autowired 
  @Qualifier("global_ip000604DeAttrTable")
  Ip000604DeAttrTable ip000604DeAttrTable;
  @Autowired 
  @Qualifier("global_ip000804PdsAttributes")
  Ip000804PdsAttributes ip000804PdsAttributes;
  @Autowired 
  @Qualifier("global_ip66102IpmFileInformation")
  Ip66102IpmFileInformation ip66102IpmFileInformation;
  @Autowired 
  @Qualifier("global_strtLngth800")
  StrtLngth800 strtLngth800;
  
  
  private static final Pattern ALPHA_SPACE = Pattern.compile("^[A-Z|a-z|\\s]*$");
  private static final Pattern NUMERIC_SPACE = Pattern.compile("^[0-9|\\s]*$");
  private static final Pattern ALPHA_NUMERIC = Pattern.compile("^[A-Z|a-z|0-9]*$");
  private static final Pattern ALPHA_NUMERIC_SPACE = Pattern.compile("^[A-Z|a-z|0-9|\\s]*$");
  private static final Pattern ALPHA_NUMERIC_SPACE_DASH = Pattern.compile("^[A-Z|a-z|0-9|\\s|\\-]*$");
  
  int ip65504D;
  int ip000604I;
  int ip65504P;
  int ip65504T;
  int ip000804I;
  
  
  
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
  *   COBOL Paragraph - 0000-MAINLINE COBOL Cyclomatic complexity - 2
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void mainline() throws Exception {
      
// *-----------------------------------------------------------------
// *Check for first time entry. if first time entry, display
// *necessary information like program name, version etc and then
// *perform syntax edits.
// *-----------------------------------------------------------------
//  PERFORM 1000-PERFORM-INITIALIZATION
          performInitialization();/*1000-PERFORM-INITIALIZATION*/
          if (this.isProgramEnded()) {
              return ;
          }
//  PERFORM 2000-PERFORM-EDIT
          performEdit();/*2000-PERFORM-EDIT*/
          if (this.isProgramEnded()) {
              return ;
          }
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          this.setProgramEnded(true);
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
      private void performInitialization() throws Exception {
      
// *All the initialization activities are done in this para. if it
// *is the first time then it will display log details.
// *-----------------------------------------------------------------
//  MOVE 300-EDIT-0233 TO IP60001-HOLD-PGM-NAME
          ip60001EventLogWorkArea.setIp60001HoldPgmName(work.getEdit0233300());
//  PERFORM 9950-UPDATE-EVENT-LOG
          updateEventLog();/*9950-UPDATE-EVENT-LOG*/
//  MOVE ZEROES TO RETURN-CODE
          this.setRc(0);
//  IF 88-100-IT-IS-THE-FIRST-TIME
          if ( work.isItIsTheFirstTime88100()  ) { 
//  SET 800-PTR-IP200110 TO ENTRY 300-PGM-IP200110
              work.setPtrIp200110800(work.getPgmIp200110300()); 
              
//  PERFORM 1100-DISPLAY-EXEC-MSGS
              displayExecMsgs();/*1100-DISPLAY-EXEC-MSGS*/
//  SET 88-100-IT-IS-NOT-FIRST-TIME TO TRUE
              work.setItIsNotFirstTime88100True(); 
              
          }
      
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
      private void displayExecMsgs() throws Exception {
      
// *-----------------------------------------------------------------
// *This paragraph displays the program execution messages.
// *-----------------------------------------------------------------
//  MOVE 300-EDIT-0233 TO IP996011-PGM-ID
          ip996011ProgramStartMessage.setIp996011PgmId(work.getEdit0233300());
//  MOVE 300-PGM-VERSION TO IP996011-PGM-VERSION
          ip996011ProgramStartMessage.setIp996011PgmVersion(work.getPgmVersion300());
          // MOVE WHEN-COMPILED TO IP996011-WHEN-COMPILED
          //  FORMAT1311677340 = "X(08)BX(08)"
          ip996011ProgramStartMessage.setIp996011WhenCompiled(CFUtil.cobolAnEditFormatter(CONSTANTS.FORMAT1311677340,CONSTANTS.LITERAL_1484748993));
//  SET 800-PTR-IP996010 TO ENTRY 300-PGM-IP996010
          work.setPtrIp996010800(work.getPgmIp996010300()); 
          
//  CALL 800-PTR-IP996010
          // CALL 800-PTR-IP996010
          	this.setRc( ip996010.process());
      
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
      private void performEdit() throws Exception {
			// Declare local variables used in the method
			short candidateLngth800 = 0;
			// End of variable declaration

      
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
//  PERFORM 2100-CHECK-FOR-DE-PDS-MTI
          checkForDePdsMti();/*2100-CHECK-FOR-DE-PDS-MTI*/
//  IF 88-100-NOT-ALL-SPACES OR 88-100-NOT-SPACES-OR-ZEROS OR 88-100-NOT-SPACES-ZEROS-ALPHA OR 88-100-NOT-SPACES-ZEROS-NINE OR 88-100-LEFT-JUSTIFY-NO-BASIC OR 88-100-NO-ZERO-BASIC-PRESENCE OR 88-100-NO-LH-BASIC-PRESENCE OR 88-100-LEFT-JUSTIFY-NO-SPC-ZER OR 88-100-LEFT-JUSTIFY-NOT-SPACE OR 800-CANDIDATE-LNGTH IS EQUAL TO ZEROES
          candidateLngth800 = work.getCandidateLngth800();
//  ELSE
          if (!(additionalSyntaxChecksGroup100.isNotAllSpaces88100())  && !(additionalSyntaxChecksGroup100.isNotSpacesOrZeros88100())  && !(additionalSyntaxChecksGroup100.isNotSpacesZerosAlpha88100())  && !(additionalSyntaxChecksGroup100.isNotSpacesZerosNine88100())  && !(additionalSyntaxChecksGroup100.isLeftJustifyNoBasic88100())  && !(additionalSyntaxChecksGroup100.isNoZeroBasicPresence88100())  && !(additionalSyntaxChecksGroup100.isNoLhBasicPresence88100())  && !(additionalSyntaxChecksGroup100.isLeftJustifyNoSpcZer88100())  && !(additionalSyntaxChecksGroup100.isLeftJustifyNotSpace88100())  && 	( candidateLngth800 != 0 ) ) { 
//  PERFORM 2200-PERFORM-PRIMARY-EDIT
              performPrimaryEdit();/*2200-PERFORM-PRIMARY-EDIT*/
          }
  
//  IF RETURN-CODE GREATER THAN ZERO OR 88-100-NO-ADDITIONAL-CHECKS OR 800-CANDIDATE-LNGTH IS EQUAL TO ZEROES
          candidateLngth800 = work.getCandidateLngth800();
//  ELSE
          if (	( getRc() <= 0 ) && !(additionalSyntaxChecksGroup100.isNoAdditionalChecks88100())  && 	( candidateLngth800 != 0 ) ) { 
//  PERFORM 2300-CHECK-ADDITIONAL-SYNTAX
              checkAdditionalSyntax();/*2300-CHECK-ADDITIONAL-SYNTAX*/
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
      private void checkForDePdsMti() throws Exception {
			// Declare local variables used in the method
			Ip00321ErrorInfo ip00321ErrorInfo = ip00321EditListRec.getIp00321CurrEditInfo().getIp00321ErrorInfo();
			// End of variable declaration

      
// *-----------------------------------------------------------------
// *Check whether the syntax edit is to be performed for mti, data
// *element or for pds. depending on this, move start,length and
// *data attribute of the field to working storage variables.
// *-----------------------------------------------------------------
          ip00321ErrorInfo = ip00321EditListRec.getIp00321CurrEditInfo().getIp00321ErrorInfo();
//  EVALUATE TRUE
          if  ( ip00321ErrorInfo.isIp00321MMti88()  ) { 
//  SET IP65504-T TO 300-VALUE-ONE
              ip65504T = work.getValueOne300(); 
              
//  MOVE IP65504-TAG-STARTS ( IP65504-T ) TO 800-CANDIDATE-START
              work.setCandidateStart800(ip65504CurrentTagTable.getIp65504TagArea(ip65504T - 1).getIp65504TagStarts());
//  MOVE IP65504-TAG-LNGTH ( IP65504-T ) TO 800-CANDIDATE-LNGTH
              work.setCandidateLngth800(ip65504CurrentTagTable.getIp65504TagArea(ip65504T - 1).getIp65504TagLngth());
//  MOVE 300-NUMERIC-SYNTAX TO 800-CANDIDATE-SYNTAX
              work.setCandidateSyntax800(work.getNumericSyntax300());
          }
          else if  ( ip00321ErrorInfo.isIp00321DDataElement88()  ) { 

// *** Gcms 5.1 changes begin ***
//  SET IP65504-D IP000604-I TO IP00321-IPM-FIELD-NUMBER
              ip65504D = (int) (int) ip00321ErrorInfo.getIp00321IpmFieldNumber(); 
              
              ip000604I = (int) (int) ip00321ErrorInfo.getIp00321IpmFieldNumber(); 
              
  
//  MOVE IP65504-DE-START ( IP65504-D ) TO 800-CANDIDATE-START
              work.setCandidateStart800(ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(ip65504D - 1).getIp65504DeStart());
//  MOVE IP65504-DE-LNGTH ( IP65504-D ) TO 800-CANDIDATE-LNGTH
              work.setCandidateLngth800(ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(ip65504D - 1).getIp65504DeLngth());
//  MOVE IP000604-DE-FORMAT ( IP000604-I ) TO 800-CANDIDATE-SYNTAX
              work.setCandidateSyntax800(ip000604DeAttrTable.getIp000604DeAttrRow(ip000604I - 1).getIp000604DeAttrUserRow().getIp000604DeFormat());
//  PERFORM 8000-CALL-PGM-IP200110
              callPgmIp200110();/*8000-CALL-PGM-IP200110*/
          }
          else if  ( ip00321ErrorInfo.isIp00321PPds88()  ) { 
//  SET IP65504-P IP000804-I TO IP00321-IPM-FIELD-NUMBER
              ip65504P = (int) (int) ip00321ErrorInfo.getIp00321IpmFieldNumber(); 
              
              ip000804I = (int) (int) ip00321ErrorInfo.getIp00321IpmFieldNumber(); 
              
  
//  MOVE IP65504-PDS-START ( IP65504-P ) TO 800-CANDIDATE-START
              work.setCandidateStart800(ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry(ip65504P - 1).getIp65504PdsStart());
//  MOVE IP65504-PDS-LNGTH ( IP65504-P ) TO 800-CANDIDATE-LNGTH
              work.setCandidateLngth800(ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry(ip65504P - 1).getIp65504PdsLngth());
//  MOVE IP000804-PDS-FORMAT ( IP000804-I ) TO 800-CANDIDATE-SYNTAX
              work.setCandidateSyntax800(ip000804PdsAttributes.getIp000804PdsAttrTable().getIp000804PdsAttrRow(ip000804I - 1).getIp000804PdsFormat());
//  PERFORM 8000-CALL-PGM-IP200110
              callPgmIp200110();/*8000-CALL-PGM-IP200110*/
          }
  
      
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
      private void performPrimaryEdit() throws Exception {
      
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
//  EVALUATE TRUE
          if  ( work.isNumeric88800()  ) { 
//  PERFORM 2210-CHECK-FOR-NUMERIC
              checkForNumeric();/*2210-CHECK-FOR-NUMERIC*/
          }
          else if  ( work.isAlphabet88800()  ) { 
//  PERFORM 2220-CHECK-FOR-ALPHABETIC
              checkForAlphabetic();/*2220-CHECK-FOR-ALPHABETIC*/
          }
          else if  ( work.isAlphabetSpace88800()  ) { 
//  PERFORM 2230-CHECK-FOR-ALPHABET-SPACE
              checkForAlphabetSpace();/*2230-CHECK-FOR-ALPHABET-SPACE*/
          }
          else if  ( work.isNumericSpace88800()  ) { 
//  PERFORM 2240-CHECK-FOR-NUMERIC-SPACE
              checkForNumericSpace();/*2240-CHECK-FOR-NUMERIC-SPACE*/
          }
          else if  ( work.isAlphabetNumeric88800()  ) { 
//  PERFORM 2250-CHECK-ALPHABET-NUMERIC
              checkAlphabetNumeric();/*2250-CHECK-ALPHABET-NUMERIC*/
          }
          else if  ( work.isAlphanumSpecial88800()  ) { 

// *** Gcms 3.2 changes begin ***
//  IF 88-100-ALPHANUMERIC-SPACE
              if ( additionalSyntaxChecksGroup100.isAlphanumericSpace88100()  ) { 
//  PERFORM 2270-CHECK-ALPHANUM-SPACE
                  checkAlphanumSpace();/*2270-CHECK-ALPHANUM-SPACE*/
              }
//  ELSE
              else { 
//  IF 88-100-ALPNUM-DAS-NT-AL-SPC
                  if ( additionalSyntaxChecksGroup100.isAlpnumDasNtAlSpc88100()  ) { 
//  PERFORM 2280-CHECK-ALPHANUM-DASH
                      checkAlphanumDash();/*2280-CHECK-ALPHANUM-DASH*/
                  }
//  ELSE
                  else { 
//  IF 88-100-ALPNUM-NOT-SPACE-ZERO
                      if ( additionalSyntaxChecksGroup100.isAlpnumNotSpaceZero88100()  ) { 
//  PERFORM 2290-CHECK-NOT-SPACE-ZERO
                          checkNotSpaceZero();/*2290-CHECK-NOT-SPACE-ZERO*/
                      }
//  ELSE
                      else { 
//  PERFORM 8100-CHECK-NOT-LOW-HIGH-VALUE
                          checkNotLowHighValue();/*8100-CHECK-NOT-LOW-HIGH-VALUE*/
                      }
                  }
              }
          }
          else if  (( work.isPad88800()  ) || ( work.isSpecial88800()  ) || ( work.isBinary88800()  ) || ( work.isTrackData88800()  ) || ( work.isCreditOrDebit88800()  ) || ( work.isAlphanumPad88800()  )) { 
              ;
          }
          else   { 
//  MOVE 300-VALUE-ONE TO RETURN-CODE
              this.setRc(work.getValueOne300());
//  PERFORM 2260-BUILD-ABEND-DATA
              buildAbendData();/*2260-BUILD-ABEND-DATA*/
          }
      
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
      private void checkForNumeric() throws Exception {
      
// *-----------------------------------------------------------------
// *The required data is extracted from current message and check if
// *it is numeric.
// *-----------------------------------------------------------------
//  IF IP66102-IPM-MSG ( 800-CANDIDATE-START : 800-CANDIDATE-LNGTH ) IS NUMERIC
//  ELSE
          if (    !( isNumeric(substring(ip66102IpmMsg.getCharArray(),(work.getCandidateStart800()-1), (work.getCandidateLngth800() + (work.getCandidateStart800() - 1)) )) )) { 
//  MOVE 300-VALUE-ONE TO RETURN-CODE
              this.setRc(work.getValueOne300());
          }
      
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
      private void checkForAlphabetic() throws Exception {
      
// *-----------------------------------------------------------------
// *The required data is extracted from current message and checked
// *for alphabetic data.
// *-----------------------------------------------------------------
//  IF IP66102-IPM-MSG ( 800-CANDIDATE-START : 800-CANDIDATE-LNGTH ) IS ALPHABETIC
//  ELSE
          if (  	    !(isAlphabetic(substring(ip66102IpmMsg.getCharArray(),(work.getCandidateStart800()-1), (work.getCandidateLngth800() + (work.getCandidateStart800() - 1)) ))) /*Alphabetic*/) { 
//  MOVE 300-VALUE-ONE TO RETURN-CODE
              this.setRc(work.getValueOne300());
          }
      
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
      private void checkForAlphabetSpace() throws Exception {
      
// *-----------------------------------------------------------------
// *The required data is extracted from current message to check for
// *alphabetic or space.
// *
// *alpha-space class is defined in environment division.
// *-----------------------------------------------------------------
//  IF IP66102-IPM-MSG ( 800-CANDIDATE-START : 800-CANDIDATE-LNGTH ) IS ALPHA-SPACE
//  ELSE
          if (!( ALPHA_SPACE.matcher(CharBuffer.wrap(substring(ip66102IpmMsg.getCharArray(),(work.getCandidateStart800()-1), (work.getCandidateLngth800() + (work.getCandidateStart800() - 1)) ))).matches() ) /*class condition*/) { 
//  MOVE 300-VALUE-ONE TO RETURN-CODE
              this.setRc(work.getValueOne300());
          }
      
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
      private void checkForNumericSpace() throws Exception {
      
// *-----------------------------------------------------------------
// *The required data is extracted from current message to check for
// *numeric or space.
// *
// *numeric-space class is defined in environment division.
// *-----------------------------------------------------------------
//  IF IP66102-IPM-MSG ( 800-CANDIDATE-START : 800-CANDIDATE-LNGTH ) IS NUMERIC-SPACE
//  ELSE
          if (!( NUMERIC_SPACE.matcher(CharBuffer.wrap(substring(ip66102IpmMsg.getCharArray(),(work.getCandidateStart800()-1), (work.getCandidateLngth800() + (work.getCandidateStart800() - 1)) ))).matches() ) /*class condition*/) { 
//  MOVE 300-VALUE-ONE TO RETURN-CODE
              this.setRc(work.getValueOne300());
          }
      
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
      private void checkAlphabetNumeric() throws Exception {
      
// *-----------------------------------------------------------------
// *The required data is extracted from current message to check for
// *alphabetic or numeric data.
// *
// *alpha-numeric class is defined in environment division.
// *-----------------------------------------------------------------
//  IF IP66102-IPM-MSG ( 800-CANDIDATE-START : 800-CANDIDATE-LNGTH ) IS ALPHA-NUMERIC
//  ELSE
          if (!( ALPHA_NUMERIC.matcher(CharBuffer.wrap(substring(ip66102IpmMsg.getCharArray(),(work.getCandidateStart800()-1), (work.getCandidateLngth800() + (work.getCandidateStart800() - 1)) ))).matches() ) /*class condition*/) { 
//  MOVE 300-VALUE-ONE TO RETURN-CODE
              this.setRc(work.getValueOne300());
          }
      
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
      private void buildAbendData() throws Exception {
			// Declare local variables used in the method
			ErrorText600 errorText600 = formatTypeErrorMessage600.getErrorText600();
			Ip00321ErrorInfo ip00321ErrorInfo = ip00321EditListRec.getIp00321CurrEditInfo().getIp00321ErrorInfo();
			// End of variable declaration

      
// *-----------------------------------------------------------------
// *The required data is moved to abend area.
// *-----------------------------------------------------------------
          formatTypeErrorMessage600.getErrorText600().setErrorFieldNumber600((short) (ip00321EditListRec.getIp00321CurrEditInfo().getIp00321ErrorInfo().getIp00321IpmFieldNumber()));
//  MOVE 300-FORMAT-ABEND-CODE TO 900-ABEND-CODE IP60001-EVENT-ERROR-CODE
          abendMessage900.setAbendCode900(work.getFormatAbendCode300());
          ip60001EventLogWorkArea.setIp60001EventErrorCode(work.getFormatAbendCode300());
//  MOVE 300-PARA-2200 TO 900-ABEND-PARA
          abendParaName900.setAbendPara900(pad(30,work.getPara2200300(),SPACE_CHAR,RIGHT_PAD));
          // MOVE 600-FORMAT-TYPE-ERROR-MESSAGE TO 900-ABEND-TEXT IP60001-EVENT-ERROR-MSG
          abendMessage900.setAbendText900(formatTypeErrorMessage600.toCharArray());
          ip60001EventLogWorkArea.setIp60001EventErrorMsg(formatTypeErrorMessage600.toCharArray());
//  PERFORM 9000-TERMINATE-ON-ERROR
          terminateOnError();/*9000-TERMINATE-ON-ERROR*/
          ;
      
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
      private void checkAlphanumSpace() throws Exception {
      
// *** Gcms 3.2 changes begin ***
// *-----------------------------------------------------------------
// *the required data is extracted from current message to check for
// *alphabetic or numeric or space data.
// *
// *alpha-numeric-space class is defined in environment division.
// *-----------------------------------------------------------------
//  IF IP66102-IPM-MSG ( 800-CANDIDATE-START : 800-CANDIDATE-LNGTH ) IS ALPHA-NUMERIC-SPACE
//  ELSE
          if (!( ALPHA_NUMERIC_SPACE.matcher(CharBuffer.wrap(substring(ip66102IpmMsg.getCharArray(),(work.getCandidateStart800()-1), (work.getCandidateLngth800() + (work.getCandidateStart800() - 1)) ))).matches() ) /*class condition*/) { 
//  MOVE 300-VALUE-ONE TO RETURN-CODE
              this.setRc(work.getValueOne300());
          }
      
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
      private void checkAlphanumDash() throws Exception {
      
// *----------------------------------------------------------------*
// *The para will check for de/pds with alpha numeric dash but not  *
// *all spaces for pds0184                                          *
// *-----------------------------------------------------------------
//  IF IP66102-IPM-MSG ( 800-CANDIDATE-START : 800-CANDIDATE-LNGTH ) IS EQUAL TO SPACES OR IP66102-IPM-MSG ( 800-CANDIDATE-START : 300-VALUE-ONE ) IS EQUAL TO SPACES
          if (Field.allSpaces(ip66102IpmMsg.toCharArray(),( (work.getCandidateStart800() - 1) /*start*/ ), work.getCandidateLngth800() /*len*/) || Field.allSpaces(ip66102IpmMsg.toCharArray(),( (work.getCandidateStart800() - 1) /*start*/ ), work.getValueOne300() /*len*/)) { 
//  MOVE 300-VALUE-ONE TO RETURN-CODE
              this.setRc(work.getValueOne300());
          }
//  ELSE
          else { 
//  IF IP66102-IPM-MSG ( 800-CANDIDATE-START : 800-CANDIDATE-LNGTH ) IS ALPHA-NUMERIC-SPACE-DASH
//  ELSE
              if (!( ALPHA_NUMERIC_SPACE_DASH.matcher(CharBuffer.wrap(substring(ip66102IpmMsg.getCharArray(),(work.getCandidateStart800()-1), (work.getCandidateLngth800() + (work.getCandidateStart800() - 1)) ))).matches() ) /*class condition*/) { 
//  MOVE 300-VALUE-ONE TO RETURN-CODE
                  this.setRc(work.getValueOne300());
              }
          }
      
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
      private void checkNotSpaceZero() throws Exception {
      
// *----------------------------------------------------------------*
// *The para will check for de/pds with not all spaces , not all    *
// *zeros and must be left justified for pds0185                    *
// *----------------------------------------------------------------*
//  IF IP66102-IPM-MSG ( 800-CANDIDATE-START : 800-CANDIDATE-LNGTH ) IS EQUAL TO SPACES OR ZEROS
          if (Field.allSpaces(ip66102IpmMsg.toCharArray(),( (work.getCandidateStart800() - 1) /*start*/ ), work.getCandidateLngth800() /*len*/) || ( allZeros(substring(ip66102IpmMsg.getCharArray(),(work.getCandidateStart800()-1), (work.getCandidateLngth800() + (work.getCandidateStart800() - 1)) )) ) /*  ==  zeros*/) { 
//  MOVE 300-VALUE-ONE TO RETURN-CODE
              this.setRc(work.getValueOne300());
          }
//  ELSE
          else { 
//  IF IP66102-IPM-MSG ( 800-CANDIDATE-START : 300-VALUE-ONE ) IS NOT EQUAL TO SPACES
//  ELSE
              if (Field.allSpaces(ip66102IpmMsg.toCharArray(),( (work.getCandidateStart800() - 1) /*start*/ ), work.getValueOne300() /*len*/)) { 
//  MOVE 300-VALUE-ONE TO RETURN-CODE
                  this.setRc(work.getValueOne300());
              }
          }
      
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
      private void checkAdditionalSyntax() throws Exception {
      
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
//  EVALUATE TRUE
          if  (( additionalSyntaxChecksGroup100.isNumericNotZero88100()  ) || ( additionalSyntaxChecksGroup100.isNoZeroBasicPresence88100()  )) { 
//  PERFORM 2310-CHECK-NUMERIC-NOT-ZERO
              checkNumericNotZero();/*2310-CHECK-NUMERIC-NOT-ZERO*/
          }
          else if  ( additionalSyntaxChecksGroup100.isNotAllSpaces88100()  ) { 
//  PERFORM 2320-CHECK-NOT-ALL-SPACES
              checkNotAllSpaces();/*2320-CHECK-NOT-ALL-SPACES*/
          }
          else if  ( additionalSyntaxChecksGroup100.isNotSpacesOrZeros88100()  ) { 
//  PERFORM 2330-CHECK-NOT-SPACES-OR-ZEROS
              checkNotSpacesOrZeros();/*2330-CHECK-NOT-SPACES-OR-ZEROS*/
          }
          else if  ( additionalSyntaxChecksGroup100.isNotSpacesZerosNine88100()  ) { 
//  PERFORM 2360-CHECK-NOT-SPACE-ZERO-NINE
              checkNotSpaceZeroNine();/*2360-CHECK-NOT-SPACE-ZERO-NINE*/
          }
          else if  (( additionalSyntaxChecksGroup100.isLeftJustifyNotSpace88100()  ) || ( additionalSyntaxChecksGroup100.isLeftJustifyNoBasic88100()  )) { 
//  PERFORM 2340-LEFT-JUSTIFY-NOT-SPACE
              leftJustifyNotSpace();/*2340-LEFT-JUSTIFY-NOT-SPACE*/
          }
          else if  ( additionalSyntaxChecksGroup100.isLeftJustifyNoSpcZer88100()  ) { 
//  PERFORM 2350-LEFT-JUSTIFY-NO-SPC-ZER
              leftJustifyNoSpcZer();/*2350-LEFT-JUSTIFY-NO-SPC-ZER*/
          }
          else if  ( additionalSyntaxChecksGroup100.isNotSpacesZerosAlpha88100()  ) { 
//  PERFORM 2370-CHECK-NOT-SPC-ZER-ALPHA
              checkNotSpcZerAlpha();/*2370-CHECK-NOT-SPC-ZER-ALPHA*/
          }
          else if  ( additionalSyntaxChecksGroup100.isLeadSpaceLjAllZeros88100()  ) { 
//  PERFORM 2380-LEAD-SPACE-LJ-ALL-ZEROS
              leadSpaceLjAllZeros();/*2380-LEAD-SPACE-LJ-ALL-ZEROS*/
          }
          else if  (( additionalSyntaxChecksGroup100.isNotLowHighValue88100()  ) || ( additionalSyntaxChecksGroup100.isNoLhBasicPresence88100()  )) { 
//  PERFORM 8100-CHECK-NOT-LOW-HIGH-VALUE
              checkNotLowHighValue();/*8100-CHECK-NOT-LOW-HIGH-VALUE*/
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
      private void checkNumericNotZero() throws Exception {
      
// *-----------------------------------------------------------------
// *The required data is extracted from current message to check for
// *zeros.
// *this additional check is performed for the edit requiring a check
// *for numeric but not zero. numeric check is already performed as
// *part of primary syntax check.
// *-----------------------------------------------------------------
//  IF IP66102-IPM-MSG ( 800-CANDIDATE-START : 800-CANDIDATE-LNGTH ) IS EQUAL TO ZEROS
          if (( allZeros(substring(ip66102IpmMsg.getCharArray(),(work.getCandidateStart800()-1), (work.getCandidateLngth800() + (work.getCandidateStart800() - 1)) )) ) /*  ==  zeros*/) { 
//  MOVE 300-VALUE-ONE TO RETURN-CODE
              this.setRc(work.getValueOne300());
          }
      
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
      private void checkNotAllSpaces() throws Exception {
      
// *-----------------------------------------------------------------
// *The required data is extracted from current message to check for
// *spaces.if found it calls an error routine.
// *-----------------------------------------------------------------
//  IF IP66102-IPM-MSG ( 800-CANDIDATE-START : 800-CANDIDATE-LNGTH ) IS EQUAL TO SPACES
          if (Field.allSpaces(ip66102IpmMsg.toCharArray(),( (work.getCandidateStart800() - 1) /*start*/ ), work.getCandidateLngth800() /*len*/)) { 
//  MOVE 300-VALUE-ONE TO RETURN-CODE
              this.setRc(work.getValueOne300());
          }
      
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
      private void checkNotSpacesOrZeros() throws Exception {
      
// *For spaces or zeroes.if found it calls an error routine.
// *-----------------------------------------------------------------
//  IF IP66102-IPM-MSG ( 800-CANDIDATE-START : 800-CANDIDATE-LNGTH ) IS EQUAL TO SPACES OR ZEROS
          if (Field.allSpaces(ip66102IpmMsg.toCharArray(),( (work.getCandidateStart800() - 1) /*start*/ ), work.getCandidateLngth800() /*len*/) || ( allZeros(substring(ip66102IpmMsg.getCharArray(),(work.getCandidateStart800()-1), (work.getCandidateLngth800() + (work.getCandidateStart800() - 1)) )) ) /*  ==  zeros*/) { 
//  MOVE 300-VALUE-ONE TO RETURN-CODE
              this.setRc(work.getValueOne300());
          }
      
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
      private void checkNotSpaceZeroNine() throws Exception {
			// Declare local variables used in the method
			short valueOne300 = 0;
			char[] value9300 = null;
			// End of variable declaration

      
// *-----------------------------------------------------------------
// *The required data is extracted from current message and checked
// *for spaces or zeroes.if found it calls an error routine.
// *for spaces or zeroes or all nines.if found it calls an error
// *routine.
// *-----------------------------------------------------------------
//  IF IP66102-IPM-MSG ( 800-CANDIDATE-START : 800-CANDIDATE-LNGTH ) IS EQUAL TO SPACES OR ZEROS
          if (Field.allSpaces(ip66102IpmMsg.toCharArray(),( (work.getCandidateStart800() - 1) /*start*/ ), work.getCandidateLngth800() /*len*/) || ( allZeros(substring(ip66102IpmMsg.getCharArray(),(work.getCandidateStart800()-1), (work.getCandidateLngth800() + (work.getCandidateStart800() - 1)) )) ) /*  ==  zeros*/) { 
//  MOVE 300-VALUE-ONE TO RETURN-CODE
              this.setRc(work.getValueOne300());
          }
//  IF RETURN-CODE = 300-VALUE-ONE
          valueOne300 = work.getValueOne300();
//  ELSE
          if (	( getRc() != valueOne300 ) ) { 
//  MOVE 300-VALUE-ONE TO RETURN-CODE
              this.setRc(work.getValueOne300());
//  MOVE 800-CANDIDATE-START TO 800-ELEMENT-START
              work.setElementStart800(work.getCandidateStart800());
//  PERFORM VARYING 800-START-INDEX FROM 1 BY 1 UNTIL 800-START-INDEX GREATER 800-CANDIDATE-LNGTH
              for (work.setStartIndex800(1); (	( work.getStartIndex800() <= work.getCandidateLngth800() )) ; work.setStartIndex800(work.getStartIndex800() + 1) ) {
                  value9300 = work.getValue9300();
//  IF IP66102-IPM-MSG ( 800-ELEMENT-START : 1) NOT EQUAL 300-VALUE-9
                  if (!(Field.compareChar(ip66102IpmMsg.toCharArray() , value9300 , ( (work.getElementStart800() - 1) /*start*/ ), 1 /*left len*/ , 1 /*right len*/))) { 
//  MOVE ZEROES TO RETURN-CODE
                      this.setRc(0);
                      work.setStartIndex800((short) (work.getCandidateLngth800() + 1));
                  }
  
//  ADD 1 TO 800-ELEMENT-START
                  work.setElementStart800( (short) (work.getElementStart800()+(short)1));
              }
          }
  
      
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
      private void leftJustifyNotSpace() throws Exception {
      
// *-----------------------------------------------------------------
// *The first position of the extracted variable is checked for
// *spaces.if found equal it calls an error routine.
// *-----------------------------------------------------------------
//  IF IP66102-IPM-MSG ( 800-CANDIDATE-START : 300-VALUE-ONE ) IS EQUAL TO SPACES
          if (Field.allSpaces(ip66102IpmMsg.toCharArray(),( (work.getCandidateStart800() - 1) /*start*/ ), work.getValueOne300() /*len*/)) { 
//  MOVE 300-VALUE-ONE TO RETURN-CODE
              this.setRc(work.getValueOne300());
          }
      
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
      private void leftJustifyNoSpcZer() throws Exception {
      
// *Spaces. the required data is also checked for spaces and zeroes.
// *if found equal it calls an error routine.
// *-----------------------------------------------------------------
//  IF ( IP66102-IPM-MSG ( 800-CANDIDATE-START : 300-VALUE-ONE ) IS EQUAL TO SPACES OR IP66102-IPM-MSG ( 800-CANDIDATE-START : 800-CANDIDATE-LNGTH ) EQUAL ZEROS)
          if ((Field.allSpaces(ip66102IpmMsg.toCharArray(),( (work.getCandidateStart800() - 1) /*start*/ ), work.getValueOne300() /*len*/) || ( allZeros(substring(ip66102IpmMsg.getCharArray(),(work.getCandidateStart800()-1), (work.getCandidateLngth800() + (work.getCandidateStart800() - 1)) )) ) /*  ==  zeros*/)) { 
//  MOVE 300-VALUE-ONE TO RETURN-CODE
              this.setRc(work.getValueOne300());
          }
      
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
      private void checkNotSpcZerAlpha() throws Exception {
      
// *-----------------------------------------------------------------
// *The required data is extracted from current message and checked
// *for spaces or zeroes or not numeric. if found equal, it sets
// *return code to 1.
// *-----------------------------------------------------------------
//  IF IP66102-IPM-MSG ( 800-CANDIDATE-START : 800-CANDIDATE-LNGTH ) EQUAL SPACES OR IP66102-IPM-MSG ( 800-CANDIDATE-START : 800-CANDIDATE-LNGTH ) EQUAL ZEROES OR IP66102-IPM-MSG ( 800-CANDIDATE-START : 800-CANDIDATE-LNGTH ) IS NOT NUMERIC
          if (Field.allSpaces(ip66102IpmMsg.toCharArray(),( (work.getCandidateStart800() - 1) /*start*/ ), work.getCandidateLngth800() /*len*/) || ( allZeros(substring(ip66102IpmMsg.getCharArray(),(work.getCandidateStart800()-1), (work.getCandidateLngth800() + (work.getCandidateStart800() - 1)) )) ) /*  ==  zeros*/ ||     !( isNumeric(substring(ip66102IpmMsg.getCharArray(),(work.getCandidateStart800()-1), (work.getCandidateLngth800() + (work.getCandidateStart800() - 1)) )) )) { 
//  MOVE 300-VALUE-ONE TO RETURN-CODE
              this.setRc(work.getValueOne300());
          }
      
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
      private void leadSpaceLjAllZeros() throws Exception {
      
// *-----------------------------------------------------------------
// *The first position of the extracted variable is checked for
// *spaces. the required data is also checked for contains all
// *zeroes if found equal it calls an error routine.
// *-----------------------------------------------------------------
//  IF IP66102-IPM-MSG ( 800-CANDIDATE-START : 300-VALUE-ONE ) IS EQUAL SPACES OR IP66102-IPM-MSG ( 800-CANDIDATE-START : 800-CANDIDATE-LNGTH ) IS EQUAL ZEROS
          if (Field.allSpaces(ip66102IpmMsg.toCharArray(),( (work.getCandidateStart800() - 1) /*start*/ ), work.getValueOne300() /*len*/) || ( allZeros(substring(ip66102IpmMsg.getCharArray(),(work.getCandidateStart800()-1), (work.getCandidateLngth800() + (work.getCandidateStart800() - 1)) )) ) /*  ==  zeros*/) { 
//  MOVE 300-VALUE-ONE TO RETURN-CODE
              this.setRc(work.getValueOne300());
          }
      
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
      private void callPgmIp200110() throws Exception {
			// Declare local variables used in the method
			short candidateStrt800 = 0;
			short candidateLnth800 = 0;
			// End of variable declaration

      
// *-----------------------------------------------------------------
// *Call ip200110 to determine new de/pds start and length from
// *ip9013t1 for mexico domestic transctions.
// *-----------------------------------------------------------------
//  CALL 800-PTR-IP200110
          // CALL 800-PTR-IP200110
          	this.setRc( ip200110.process());
          candidateStrt800 = strtLngth800.getCandidateStrt800();
          candidateLnth800 = strtLngth800.getCandidateLnth800();
//  IF 800-CANDIDATE-STRT GREATER THAN ZERO AND 800-CANDIDATE-LNTH GREATER THAN ZERO
          if (	( candidateStrt800 > 0 )  && 	( candidateLnth800 > 0 ) ) { 
//  MOVE 800-CANDIDATE-STRT TO 800-CANDIDATE-START
              work.setCandidateStart800(strtLngth800.getCandidateStrt800());
//  MOVE 800-CANDIDATE-LNTH TO 800-CANDIDATE-LNGTH
              work.setCandidateLngth800(strtLngth800.getCandidateLnth800());
          }
  
      
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
      private void checkNotLowHighValue() throws Exception {
      
// *-----------------------------------------------------------------
// *The required data is extracted from current message and checked
// *for low or high values.
// *
// *this check is also performed for de/pds's with data attribute as
// *'ans' in table 6 or 8.
// *-----------------------------------------------------------------
//  IF IP66102-IPM-MSG ( 800-CANDIDATE-START : 800-CANDIDATE-LNGTH ) IS EQUAL TO LOW-VALUES OR HIGH-VALUES
          if (Field.compareAll(ip66102IpmMsg.toCharArray(),CONSTANTS.LOW_VALUE_STRING,( (work.getCandidateStart800() - 1) /*start*/ ), work.getCandidateLngth800() /*len*/) || Field.allHighValues(ip66102IpmMsg.toCharArray(),( (work.getCandidateStart800() - 1) /*start*/ ), work.getCandidateLngth800() /*len*/)) { 
//  MOVE 300-VALUE-ONE TO RETURN-CODE
              this.setRc(work.getValueOne300());
          }
      
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
      private void terminateOnError() throws Exception {
      
// *-----------------------------------------------------------------
// *This program abends if a valid data attribute is not found
// *in table 6 or 8.this para displays the abend message.
// *-----------------------------------------------------------------
//  DISPLAY '***********************************'
          logger.info("***********************************"); 
//  DISPLAY 'A B E N D   A B E N D   A B E N D  '
          logger.info("A B E N D   A B E N D   A B E N D  "); 
//  DISPLAY 'A B E N D   I P 2 0 2 3 3 0        '
          logger.info("A B E N D   I P 2 0 2 3 3 0        "); 
//  DISPLAY '***********************************'
          logger.info("***********************************"); 
//  DISPLAY 900-ABEND-PARA-NAME
          logger.info(abendParaName900.toString()); 
//  DISPLAY 900-ABEND-MESSAGE
          logger.info(abendMessage900.toString()); 
//  CALL 300-ABEND-PGM
          // CALL 300-ABEND-PGM
          	this.setRc( ip610010.process());
      
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
      private void updateEventLog() throws Exception {
			// Declare local variables used in the method
			long ip60001Subscript = 0;
			// End of variable declaration

      
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
//  IF 88-IP60001-LOG-EVENT
          if ( ip60001EventLogWorkArea.isIp60001LogEvent88()  ) { 
              ip60001Subscript = ip60001EventLogWorkArea.getIp60001Subscript();
//  IF IP60001-SUBSCRIPT = 500
              if (	( ip60001Subscript == 500 ) ) { 
//  MOVE 1 TO IP60001-SUBSCRIPT
                  ip60001EventLogWorkArea.setIp60001Subscript((long)1);
              }
  
//  ELSE
              else { 
//  ADD 1 TO IP60001-SUBSCRIPT
                  ip60001EventLogWorkArea.setIp60001Subscript(ip60001EventLogWorkArea.getIp60001Subscript()+(long)1);
              }
//  MOVE IP60001-HOLD-PGM-NAME TO IP60001-PGM-NAME ( IP60001-SUBSCRIPT )
              ip60001EventLogWorkArea.getIp60001EventEntry((int) ip60001EventLogWorkArea.getIp60001Subscript() - 1).setIp60001PgmName(ip60001EventLogWorkArea.getIp60001HoldPgmName());
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
