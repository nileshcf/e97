  package com.cloudframe.app.process;
   /* The comment section is too large, 
	 * hence added at the end of the java code 
	 * please scroll all the way to the bottom to see complete comments 
	 */
  
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
  import com.cloudframe.app.global.sharedvar.Ip90134EditGroupKey;
  import com.cloudframe.app.process.Ip200100;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.global.sharedvar.Ip00321ErrorInfo;
  import com.cloudframe.app.process.Ip381120;
  import com.cloudframe.app.process.Ip610010;
  import com.cloudframe.app.ip200090.dto.*;
  import com.cloudframe.app.ip200090.dto.ErrorMessage610;
  import com.cloudframe.app.ip200090.dto.AbendMessage900;
  import com.cloudframe.app.ip200090.dto.AbendParaName900;
  import com.cloudframe.app.ip200090.dto.EditType23InfoTableGroup500;
  import com.cloudframe.app.ip200090.dto.SyntaxPgmTableGroup500;
  import com.cloudframe.app.ip200090.dto.BslIdGroup800;
  import com.cloudframe.app.ip200090.dto.EditNumGroup800;
  import com.cloudframe.app.global.sharedvar.Ip00702CaTable;
  import com.cloudframe.app.global.sharedvar.Ip00702CaStringGroup;
  import com.cloudframe.app.global.sharedvar.Ip60001EventLogWorkArea;
  import com.cloudframe.app.global.sharedvar.Ip65504CurrentTagTable;
  import com.cloudframe.app.global.sharedvar.Ip65504TcntGroup;
  import com.cloudframe.app.global.sharedvar.Ip65504MessageStatusGroup;
  import com.cloudframe.app.global.sharedvar.Ip65504SelElemEntriesAll;
  import com.cloudframe.app.global.sharedvar.Ip65504TaggedRecordInfo;
  import com.cloudframe.app.global.sharedvar.Ip65504DeMapGroup;
  import com.cloudframe.app.global.sharedvar.Ip65504SelPdsEntriesAll;
  import com.cloudframe.app.global.sharedvar.Ip65504PdsMapGroup;
  import com.cloudframe.app.global.sharedvar.AdditionalSyntaxChecksGroup100;
  import com.cloudframe.app.global.sharedvar.Ip90134TableEntry;
  import com.cloudframe.app.global.sharedvar.IsSoftSyntaxAppliedGroup100;
  import com.cloudframe.app.global.sharedvar.Ip00321EditListRec;
  import com.cloudframe.app.global.sharedvar.Ip996011ProgramStartMessage;
  import com.cloudframe.app.global.sharedvar.Ip90134EntryFoundGroup800;
  import com.cloudframe.app.ip200090.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("ip200090")
  
  public class Ip200090 extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Ip200090.class);
  
  private ErrorMessage610 errorMessage610 = new ErrorMessage610() ;
  private AbendMessage900 abendMessage900 = new AbendMessage900() ;
  private AbendParaName900 abendParaName900 = new AbendParaName900() ;
  private EditType23InfoTableGroup500 editType23InfoTableGroup500 = new EditType23InfoTableGroup500() ;
  private SyntaxPgmTableGroup500 syntaxPgmTableGroup500 = new SyntaxPgmTableGroup500() ;
  private BslIdGroup800 bslIdGroup800 = new BslIdGroup800() ;
  private EditNumGroup800 editNumGroup800 = new EditNumGroup800() ;
  private Work work = new Work() ;
  
  
  
  @Autowired 
  @Qualifier("ip200100")
  Ip200100 ip200100;
  @Autowired 
  @Qualifier("ip381120")
  Ip381120 ip381120;
  @Autowired 
  @Qualifier("global_ip00702CaTable")
  Ip00702CaTable ip00702CaTable;
  @Autowired 
  @Qualifier("global_ip00702CaStringGroup")
  Ip00702CaStringGroup ip00702CaStringGroup;
  @Autowired 
  @Qualifier("global_ip90134TableEntry")
  Ip90134TableEntry ip90134TableEntry;
  @Autowired 
  @Qualifier("global_isSoftSyntaxAppliedGroup100")
  IsSoftSyntaxAppliedGroup100 isSoftSyntaxAppliedGroup100;
  @Autowired 
  @Qualifier("global_ip90134EntryFoundGroup800")
  Ip90134EntryFoundGroup800 ip90134EntryFoundGroup800;
  
  
  private static final int IP65504_TAG_AREA_LENGTH = 11;
  
  int ip65504P;
  int ip65504T;
  int ip65504D;
  int pgmIdx500;
  int syntaxIdx500;
  
  
  
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
// *The mainline paragraph passes control to other paragraphs that
// *display execution messages on first time entry and perform other
// *functions for achieiving the required functionality.
// *-----------------------------------------------------------------
//  PERFORM 1000-PERFORM-INITIALIZATION
          performInitialization();/*1000-PERFORM-INITIALIZATION*/
          if (this.isProgramEnded()) {
              return ;
          }
//  PERFORM 2000-CHOOSE-EDIT-PROGRAM
          chooseEditProgram();/*2000-CHOOSE-EDIT-PROGRAM*/
          if (this.isProgramEnded()) {
              return ;
          }
//  PERFORM 3000-CALL-PGM-IP381120
          callPgmIp381120();/*3000-CALL-PGM-IP381120*/
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
  *   COBOL Paragraph - 1000-PERFORM-INITIALIZATION COBOL Cyclomatic complexity - 2
      * Input  :  

      * - isItTheFirstTime100            COBOL Name: 100-IS-IT-THE-FIRST-TIME
      *
      * Output :  

      * - isItTheFirstTime100            COBOL Name: 100-IS-IT-THE-FIRST-TIME
      *
      * @throws CFException
      */
      private void performInitialization() throws Exception {
      
// *-----------------------------------------------------------------
// *Note:
// *update event log has been removed from this program to improve
// *application performance.
// *-----------------------------------------------------------------
// *check for first time entry. if it is first time entry, display
// *necessary information like program name, version etc and then
// *perform syntax edits.
// *-----------------------------------------------------------------
//  IF 88-100-IT-IS-THE-FIRST-TIME
          if ( work.isItIsTheFirstTime88100()  ) { 
//  PERFORM 1100-DISPLAY-EXEC-MSGS
              displayExecMsgs();/*1100-DISPLAY-EXEC-MSGS*/
//  SET 88-100-IT-IS-NOT-FIRST-TIME TO TRUE
              work.setItIsNotFirstTime88100True(); 
              
//  PERFORM 1200-SET-PROCEDURE-POINTERS
              setProcedurePointers();/*1200-SET-PROCEDURE-POINTERS*/
          }
//  PERFORM 1300-INITIALIZE-VARIABLES
          initializeVariables();/*1300-INITIALIZE-VARIABLES*/
          ;
      
      }
      /**
      * displayExecMsgs 
      *   This method is derived from 
  *   COBOL Paragraph - 1100-DISPLAY-EXEC-MSGS COBOL Cyclomatic complexity - 2
      * Input  :  

      * - edit0009300                    COBOL Name: 300-EDIT-0009
      * - pgmVersion300                  COBOL Name: 300-PGM-VERSION
      * - pgmIp996010300                 COBOL Name: 300-PGM-IP996010
      *
      * Output :  

      * - ip996011PgmId                  COBOL Name: IP996011-PGM-ID
      * - edit0009300                    COBOL Name: 300-EDIT-0009
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
// *This paragraph displays program execution messages.
// *-----------------------------------------------------------------
//  MOVE 300-EDIT-0009 TO IP996011-PGM-ID
          ip996011ProgramStartMessage.setIp996011PgmId(work.getEdit0009300());
//  MOVE 300-PGM-VERSION TO IP996011-PGM-VERSION
          ip996011ProgramStartMessage.setIp996011PgmVersion(work.getPgmVersion300());
          // MOVE WHEN-COMPILED TO IP996011-WHEN-COMPILED
          //  FORMAT1311677340 = "X(08)BX(08)"
          ip996011ProgramStartMessage.setIp996011WhenCompiled(CFUtil.cobolAnEditFormatter(CONSTANTS.FORMAT1311677340,CONSTANTS.LITERAL_1482901889));
//  SET 800-PTR-IP996010 TO ENTRY 300-PGM-IP996010
          work.setPtrIp996010800(work.getPgmIp996010300()); 
          
//  CALL 800-PTR-IP996010
          // CALL 800-PTR-IP996010
          	this.setRc( ip996010.process());
      
      }
      /**
      * setProcedurePointers 
      *   This method is derived from 
  *   COBOL Paragraph - 1200-SET-PROCEDURE-POINTERS COBOL Cyclomatic complexity - 12
      * Input  :  

      * - syntaxIp202330Name500          COBOL Name: 500-SYNTAX-IP202330-NAME
      * - syntaxIp200690Name500          COBOL Name: 500-SYNTAX-IP200690-NAME
      * - syntaxIp223190Name500          COBOL Name: 500-SYNTAX-IP223190-NAME
      * - syntaxIp223870Name500          COBOL Name: 500-SYNTAX-IP223870-NAME
      * - syntaxIp209700Name500          COBOL Name: 500-SYNTAX-IP209700-NAME
      * - syntaxIp221080Name500          COBOL Name: 500-SYNTAX-IP221080-NAME
      * - syntaxIp209720Name500          COBOL Name: 500-SYNTAX-IP209720-NAME
      * - syntaxIp218620Name500          COBOL Name: 500-SYNTAX-IP218620-NAME
      * - syntaxIp202990Name500          COBOL Name: 500-SYNTAX-IP202990-NAME
      * - pgmIp200100300                 COBOL Name: 300-PGM-IP200100
      * - pgmIp381120300                 COBOL Name: 300-PGM-IP381120
      *
      * Output :  

      * - ptrIp202330500                 COBOL Name: 500-PTR-IP202330
      * - ptrIp200690500                 COBOL Name: 500-PTR-IP200690
      * - ptrIp223190500                 COBOL Name: 500-PTR-IP223190
      * - ptrIp223870500                 COBOL Name: 500-PTR-IP223870
      * - ptrIp209700500                 COBOL Name: 500-PTR-IP209700
      * - ptrIp221080500                 COBOL Name: 500-PTR-IP221080
      * - ptrIp209720500                 COBOL Name: 500-PTR-IP209720
      * - ptrIp218620500                 COBOL Name: 500-PTR-IP218620
      * - ptrIp202990500                 COBOL Name: 500-PTR-IP202990
      * - ptrIp200100800                 COBOL Name: 800-PTR-IP200100
      * - ptrIp381120800                 COBOL Name: 800-PTR-IP381120
      *
      * @throws CFException
      */
      private void setProcedurePointers() throws Exception {
      
// *---------------------------------------------------------------
// *Set procedure pointers to respective programs.
// *---------------------------------------------------------------
//  SET 500-PTR-IP202330 TO ENTRY 500-SYNTAX-IP202330-NAME
          syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp202330500(syntaxPgmTableGroup500.getSyntaxPgmTable500().getSyntaxIp202330Name500()); 
          
//  SET 500-PTR-IP200690 TO ENTRY 500-SYNTAX-IP200690-NAME
          syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp200690500(syntaxPgmTableGroup500.getSyntaxPgmTable500().getSyntaxIp200690Name500()); 
          
//  SET 500-PTR-IP223190 TO ENTRY 500-SYNTAX-IP223190-NAME
          syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp223190500(syntaxPgmTableGroup500.getSyntaxPgmTable500().getSyntaxIp223190Name500()); 
          
//  SET 500-PTR-IP223870 TO ENTRY 500-SYNTAX-IP223870-NAME
          syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp223870500(syntaxPgmTableGroup500.getSyntaxPgmTable500().getSyntaxIp223870Name500()); 
          
//  SET 500-PTR-IP209700 TO ENTRY 500-SYNTAX-IP209700-NAME
          syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp209700500(syntaxPgmTableGroup500.getSyntaxPgmTable500().getSyntaxIp209700Name500()); 
          
//  SET 500-PTR-IP221080 TO ENTRY 500-SYNTAX-IP221080-NAME
          syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp221080500(syntaxPgmTableGroup500.getSyntaxPgmTable500().getSyntaxIp221080Name500()); 
          
//  SET 500-PTR-IP209720 TO ENTRY 500-SYNTAX-IP209720-NAME
          syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp209720500(syntaxPgmTableGroup500.getSyntaxPgmTable500().getSyntaxIp209720Name500()); 
          
//  SET 500-PTR-IP218620 TO ENTRY 500-SYNTAX-IP218620-NAME
          syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp218620500(syntaxPgmTableGroup500.getSyntaxPgmTable500().getSyntaxIp218620Name500()); 
          
//  SET 500-PTR-IP202990 TO ENTRY 500-SYNTAX-IP202990-NAME
          syntaxPgmTableGroup500.getSyntaxPgmTable500().setPtrIp202990500(syntaxPgmTableGroup500.getSyntaxPgmTable500().getSyntaxIp202990Name500()); 
          
//  SET 800-PTR-IP200100 TO ENTRY 300-PGM-IP200100
          work.setPtrIp200100800(work.getPgmIp200100300()); 
          
//  SET 800-PTR-IP381120 TO ENTRY 300-PGM-IP381120
          work.setPtrIp381120800(work.getPgmIp381120300()); 
          
      
      }
      /**
      * initializeVariables 
      *   This method is derived from 
  *   COBOL Paragraph - 1300-INITIALIZE-VARIABLES COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      * - additionalSyntaxChecks100      COBOL Name: 100-ADDITIONAL-SYNTAX-CHECKS
      * - isCandidatePresent100          COBOL Name: 100-IS-CANDIDATE-PRESENT
      * - isSubfldCheckOver100           COBOL Name: 100-IS-SUBFLD-CHECK-OVER
      *
      * @throws CFException
      */
      private void initializeVariables() throws Exception {
      
// *-----------------------------------------------------------------
// *Reset the flags before exiting the program.
// *-----------------------------------------------------------------
//  MOVE ZEROES TO RETURN-CODE
          this.setRc(0);
//  SET 88-100-NO-ADDITIONAL-CHECKS TO TRUE
          additionalSyntaxChecksGroup100.setNoAdditionalChecks88100True(); 
          
//  SET 88-100-CANDIDATE-ABSENT TO TRUE
          work.setCandidateAbsent88100True(); 
          
//  SET 88-100-SUBFLD-CHECK-NOT-OVER TO TRUE
          work.setSubfldCheckNotOver88100True(); 
          
      
      }
      /**
      * chooseEditProgram 
      *   This method is derived from 
  *   COBOL Paragraph - 2000-CHOOSE-EDIT-PROGRAM COBOL Cyclomatic complexity - 15
      * Input  :  

      * - ip00702CaString                COBOL Name: IP00702-CA-STRING
      * - bslIdR800                      COBOL Name: 800-BSL-ID-R
      * - isSoftSyntaxApplied100         COBOL Name: 100-IS-SOFT-SYNTAX-APPLIED
      * - ip00321EditNbr                 COBOL Name: IP00321-EDIT-NBR
      * - ip90134EntryFound800           COBOL Name: 800-IP90134-ENTRY-FOUND
      * - value1441300                   COBOL Name: 300-VALUE-1441
      * - valueY300                      COBOL Name: 300-VALUE-Y
      * - ip00702CaStart                 COBOL Name: IP00702-CA-START
      * - ip00702CaLength                COBOL Name: IP00702-CA-LENGTH
      * - isCandidatePresent100          COBOL Name: 100-IS-CANDIDATE-PRESENT
      * - value1811300                   COBOL Name: 300-VALUE-1811
      * - value1813300                   COBOL Name: 300-VALUE-1813
      * - isFieldShouldPresent500        COBOL Name: 500-IS-FIELD-SHOULD-PRESENT
      *
      * Output :  

      * - ip90134EditGroup               COBOL Name: IP90134-EDIT-GROUP
      * - ip90134AccBrand                COBOL Name: IP90134-ACC-BRAND
      * - ip90134ElementType             COBOL Name: IP90134-ELEMENT-TYPE
      * - ip90134ElementNum              COBOL Name: IP90134-ELEMENT-NUM
      * - ip90134ElementSubNum           COBOL Name: IP90134-ELEMENT-SUB-NUM
      * - ip90134EditNumber              COBOL Name: IP90134-EDIT-NUMBER
      * - editNum800                     COBOL Name: 800-EDIT-NUM
      * - editNumR800                    COBOL Name: 800-EDIT-NUM-R
      * - bslId800                       COBOL Name: 800-BSL-ID
      * - bsl800                         COBOL Name: 800-BSL
      * - ip00702CaString                COBOL Name: IP00702-CA-STRING
      * - bsid800                        COBOL Name: 800-BSID
      * - ip00321EditNbr                 COBOL Name: IP00321-EDIT-NBR
      * - editValue800                   COBOL Name: 800-EDIT-VALUE
      * - rc                             COBOL Name: RETURN-CODE
      * - syntaxIdx500                   COBOL Name: 500-SYNTAX-IDX
      *
      * @throws CFException
      */
      private void chooseEditProgram() throws Exception {
			// Declare local variables used in the method
			Ip90134EditGroupKey ip90134EditGroupKey = ip90134TableEntry.getIp90134EditGroupKey();
			char[] ip00702CaString = null;
			char[] valueY300 = null;
			long ip00321EditNbr = 0;
			short value1813300 = 0;
			// End of variable declaration

      
// *-----------------------------------------------------------------
// *This para first calls the program ip200100 to retrieve the
// * edit information when business service is 4/484001.
// *depending on edit requirements, the field presence check is done.
// *then the actual syntax edit program is called.
// *-----------------------------------------------------------------
//  MOVE SPACES TO IP90134-EDIT-GROUP IP90134-ACC-BRAND
          ip90134EditGroupKey.setIp90134EditGroup(CONSTANTS.SPACE);
          ip90134EditGroupKey.setIp90134AccBrand(CONSTANTS.SPACE_3);
  
//  MOVE ZEROES TO IP90134-ELEMENT-TYPE IP90134-ELEMENT-NUM IP90134-ELEMENT-SUB-NUM IP90134-EDIT-NUMBER 800-EDIT-NUM 800-EDIT-NUM-R
          ip90134EditGroupKey.setIp90134ElementType(0);
          ip90134EditGroupKey.setIp90134ElementNum(0);
          ip90134EditGroupKey.setIp90134ElementSubNum(0);
          ip90134EditGroupKey.setIp90134EditNumber(0);
          editNumGroup800.setEditNum800(0);
          editNumGroup800.setEditNumR800(CONSTANTS.ZERO_8);
  
//  MOVE SPACES TO 800-BSL-ID
          bslIdGroup800.setBslId800(CONSTANTS.SPACE_7);
//  MOVE IP00702-CA-STRING ( IP00702-CA-START (10) : IP00702-CA-LENGTH (10)) TO 800-BSL
          bslIdGroup800.replace(ip00702CaStringGroup/*parent*/,0+ip00702CaTable.getIp00702CaEntry(9).getIp00702CaStart() - 1/*fromOffset - (bsl800) */,ip00702CaTable.getIp00702CaEntry(9).getIp00702CaLength()/*fromLen*/,0/*toOffset - (ip00702CaString) */,1/*toLen*/);
//  MOVE IP00702-CA-STRING ( IP00702-CA-START (11) : IP00702-CA-LENGTH (11)) TO 800-BSID
          bslIdGroup800.replace(ip00702CaStringGroup/*parent*/,0+ip00702CaTable.getIp00702CaEntry(10).getIp00702CaStart() - 1/*fromOffset - (bsid800) */,ip00702CaTable.getIp00702CaEntry(10).getIp00702CaLength()/*fromLen*/,1/*toOffset - (ip00702CaString) */,6/*toLen*/);

// *** Note - if the entry is not found in ip9013t1, then
// *** initialize edit number of ip901304 copybook to zeroes,
// *** so that ip200110 will be bypassed and the original
// *** de/pds length will be maintained.
//  IF 88-800-MEX-BSA OR 88-100-SOFT-SYNTAX-APPLIED-Y
          if ( bslIdGroup800.isMexBsa88800()   ||  isSoftSyntaxAppliedGroup100.isSoftSyntaxAppliedY88100()  ) { 
//  MOVE IP00321-EDIT-NBR TO 800-EDIT-NUM
              editNumGroup800.setEditNum800(ip00321EditListRec.getIp00321EditNbr());
//  MOVE 800-EDIT-VALUE TO IP90134-EDIT-NUMBER
              ip90134EditGroupKey.setIp90134EditNumber(editNumGroup800.getEditNumR800().getEditValue800());
  
//  CALL 800-PTR-IP200100
              // CALL 800-PTR-IP200100
              	this.setRc( ip200100.process());
//  IF RETURN-CODE NOT EQUAL ZEROES OR 88-800-IP90134-ENTRY-FOUND-N
              if (	( getRc() != 0 ) ||  ip90134EntryFoundGroup800.isIp90134EntryFoundN88800()  ) { 
//  MOVE ZEROES TO IP90134-EDIT-NUMBER RETURN-CODE
                  ip90134EditGroupKey.setIp90134EditNumber(0);
                  this.setRc(0);
  
              }
          }
//  SET 500-SYNTAX-IDX TO IP00321-EDIT-NBR
          syntaxIdx500 = (int) (int) ip00321EditListRec.getIp00321EditNbr(); 
          
          value1813300 = work.getValue1813300();
          ip00321EditNbr = ip00321EditListRec.getIp00321EditNbr();
//  EVALUATE IP00321-EDIT-NBR
          if  (	( ip00321EditNbr == work.getValue1441300() ) ) { 
              ip00702CaString = ip00702CaStringGroup.getIp00702CaString();
              valueY300 = work.getValueY300();
//  IF IP00702-CA-STRING ( IP00702-CA-START (150) : IP00702-CA-LENGTH (150)) EQUAL 300-VALUE-Y
              if (Field.compareChar(ip00702CaString , valueY300 , ( (ip00702CaTable.getIp00702CaEntry(149).getIp00702CaStart() - 1) /*start*/ ), ip00702CaTable.getIp00702CaEntry(149).getIp00702CaLength() /*left len*/ , 1 /*right len*/)) { 
//  PERFORM 2100-CHECK-PRESENCE-OF-FLD
                  checkPresenceOfFld();/*2100-CHECK-PRESENCE-OF-FLD*/
//  IF 88-100-CANDIDATE-PRESENT
                  if ( work.isCandidatePresent88100()  ) { 
//  PERFORM 2200-SET-EDIT-PROGRAM-POINTER
                      setEditProgramPointer();/*2200-SET-EDIT-PROGRAM-POINTER*/
                  }
              }
  
          }
          else if  ((	( ip00321EditNbr == work.getValue1811300() ) ) || (	( ip00321EditNbr == value1813300 ) )) { 
              ip00702CaString = ip00702CaStringGroup.getIp00702CaString();
              valueY300 = work.getValueY300();
//  IF IP00702-CA-STRING ( IP00702-CA-START (187) : IP00702-CA-LENGTH (187)) EQUAL 300-VALUE-Y
              if (Field.compareChar(ip00702CaString , valueY300 , ( (ip00702CaTable.getIp00702CaEntry(186).getIp00702CaStart() - 1) /*start*/ ), ip00702CaTable.getIp00702CaEntry(186).getIp00702CaLength() /*left len*/ , 1 /*right len*/)) { 
//  PERFORM 2100-CHECK-PRESENCE-OF-FLD
                  checkPresenceOfFld();/*2100-CHECK-PRESENCE-OF-FLD*/
//  IF 88-100-CANDIDATE-PRESENT
                  if ( work.isCandidatePresent88100()  ) { 
//  PERFORM 2200-SET-EDIT-PROGRAM-POINTER
                      setEditProgramPointer();/*2200-SET-EDIT-PROGRAM-POINTER*/
                  }
              }
  
          }
          else   { 
//  IF 88-500-FIELD-MUST-BE-PRESENT ( 500-SYNTAX-IDX )
              if ( editType23InfoTableGroup500.getEditType23InfoTable500Redefined01().getSyntaxEditInfoEntry500(syntaxIdx500 - 1).isFieldMustBePresent88500()  ) { 
//  PERFORM 2100-CHECK-PRESENCE-OF-FLD
                  checkPresenceOfFld();/*2100-CHECK-PRESENCE-OF-FLD*/
//  IF 88-100-CANDIDATE-PRESENT
                  if ( work.isCandidatePresent88100()  ) { 
//  PERFORM 2200-SET-EDIT-PROGRAM-POINTER
                      setEditProgramPointer();/*2200-SET-EDIT-PROGRAM-POINTER*/
                  }
              }
//  ELSE
              else { 
//  PERFORM 2200-SET-EDIT-PROGRAM-POINTER
                  setEditProgramPointer();/*2200-SET-EDIT-PROGRAM-POINTER*/
              }
          }
  
      
      }
      /**
      * checkPresenceOfFld 
      *   This method is derived from 
  *   COBOL Paragraph - 2100-CHECK-PRESENCE-OF-FLD COBOL Cyclomatic complexity - 6
      * Input  :  

      * - ip00321IpmFieldType            COBOL Name: IP00321-IPM-FIELD-TYPE
      * - ip65504SelElemEnt              COBOL Name: IP65504-SEL-ELEM-ENT
      * - valueX300                      COBOL Name: 300-VALUE-X
      * - ip00321IpmFieldNumber          COBOL Name: IP00321-IPM-FIELD-NUMBER
      * - ip00321IpmSubfieldNumber       COBOL Name: IP00321-IPM-SUBFIELD-NUMBER
      * - ip65504DeFirstSubfld           COBOL Name: IP65504-DE-FIRST-SUBFLD
      * - ip65504SelPdsEnt               COBOL Name: IP65504-SEL-PDS-ENT
      * - ip65504PdsFirstSubfld          COBOL Name: IP65504-PDS-FIRST-SUBFLD
      *
      * Output :  

      * - ip65504D                       COBOL Name: IP65504-D
      * - ip65504T                       COBOL Name: IP65504-T
      * - candidateTagType800            COBOL Name: 800-CANDIDATE-TAG-TYPE
      * - isCandidatePresent100          COBOL Name: 100-IS-CANDIDATE-PRESENT
      * - ip65504P                       COBOL Name: IP65504-P
      *
      * @throws CFException
      */
      private void checkPresenceOfFld() throws Exception {
			// Declare local variables used in the method
			Ip00321ErrorInfo ip00321ErrorInfo = ip00321EditListRec.getIp00321CurrEditInfo().getIp00321ErrorInfo();
			long ip00321IpmSubfieldNumber = 0;
			char[] valueX300 = null;
			// End of variable declaration

      
// *-----------------------------------------------------------------
// *Check the presence of de/pds by fetching the presence indicator
// *in tag table.
// *-----------------------------------------------------------------
          ip00321ErrorInfo = ip00321EditListRec.getIp00321CurrEditInfo().getIp00321ErrorInfo();
//  IF 88-IP00321-D-DATA-ELEMENT
          if ( ip00321ErrorInfo.isIp00321DDataElement88()  ) { 
              valueX300 = work.getValueX300();
//  IF IP65504-SEL-ELEM-ENT ( IP00321-IPM-FIELD-NUMBER ) IS EQUAL TO 300-VALUE-X
              if (		compareChars(ip65504SelElemEntriesAll.getIp65504SelElemEnt((int) ip00321ErrorInfo.getIp00321IpmFieldNumber() - 1),valueX300) == 0 ) { 
                  ip00321IpmSubfieldNumber = ip00321ErrorInfo.getIp00321IpmSubfieldNumber();
//  IF IP00321-IPM-SUBFIELD-NUMBER IS GREATER THAN ZERO
                  if (	( ip00321IpmSubfieldNumber > 0 ) ) { 

// *** Gcms 5.1 changes begin ***
//  SET IP65504-D TO IP00321-IPM-FIELD-NUMBER
                      ip65504D = (int) (int) ip00321ErrorInfo.getIp00321IpmFieldNumber(); 
                      
  
//  SET IP65504-T TO IP65504-DE-FIRST-SUBFLD ( IP65504-D )
                      ip65504T = (ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(ip65504D - 1).getIp65504DeFirstSubfld()/IP65504_TAG_AREA_LENGTH) + 1 ; 
                      
                      // MOVE 2 TO 800-CANDIDATE-TAG-TYPE
                      work.setCandidateTagType800((short)2);
//  PERFORM 8100-CHECK-SUBFLD-PRESENCE
                      checkSubfldPresence();/*8100-CHECK-SUBFLD-PRESENCE*/
                  }
  

// *** Gcms 5.1 changes end   ***
//  ELSE
                  else { 
//  SET 88-100-CANDIDATE-PRESENT TO TRUE
                      work.setCandidatePresent88100True(); 
                      
                  }
              }
  
          }
  
//  ELSE
          else { 
              valueX300 = work.getValueX300();
//  IF IP65504-SEL-PDS-ENT ( IP00321-IPM-FIELD-NUMBER ) IS EQUAL TO 300-VALUE-X
              if (		compareChars(ip65504SelPdsEntriesAll.getIp65504SelPdsEnt((int) ip00321ErrorInfo.getIp00321IpmFieldNumber() - 1),valueX300) == 0 ) { 
                  ip00321IpmSubfieldNumber = ip00321ErrorInfo.getIp00321IpmSubfieldNumber();
//  IF IP00321-IPM-SUBFIELD-NUMBER IS GREATER THAN ZERO
                  if (	( ip00321IpmSubfieldNumber > 0 ) ) { 

// *** Gcms 5.1 changes begin ***
//  SET IP65504-P TO IP00321-IPM-FIELD-NUMBER
                      ip65504P = (int) (int) ip00321ErrorInfo.getIp00321IpmFieldNumber(); 
                      
  
//  SET IP65504-T TO IP65504-PDS-FIRST-SUBFLD ( IP65504-P )
                      ip65504T = (ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry(ip65504P - 1).getIp65504PdsFirstSubfld()/IP65504_TAG_AREA_LENGTH) + 1 ; 
                      
                      // MOVE 3 TO 800-CANDIDATE-TAG-TYPE
                      work.setCandidateTagType800((short)3);
//  PERFORM 8100-CHECK-SUBFLD-PRESENCE
                      checkSubfldPresence();/*8100-CHECK-SUBFLD-PRESENCE*/
                  }
  

// *** Gcms 5.1 changes end   ***
//  ELSE
                  else { 
//  SET 88-100-CANDIDATE-PRESENT TO TRUE
                      work.setCandidatePresent88100True(); 
                      
                  }
              }
  
          }
      
      }
      /**
      * setEditProgramPointer 
      *   This method is derived from 
  *   COBOL Paragraph - 2200-SET-EDIT-PROGRAM-POINTER COBOL Cyclomatic complexity - 2
      * Input  :  

      * - editModuleIndex500             COBOL Name: 500-EDIT-MODULE-INDEX
      * - syntaxIdx500                   COBOL Name: 500-SYNTAX-IDX
      * - syntaxPgmPtr500                COBOL Name: 500-SYNTAX-PGM-PTR
      * - additionalSyntaxChkInd500      COBOL Name: 500-ADDITIONAL-SYNTAX-CHK-IND
      * - para2200300                    COBOL Name: 300-PARA-2200
      * - ip00321EditNbr                 COBOL Name: IP00321-EDIT-NBR
      * - errorMessage610                COBOL Name: 610-ERROR-MESSAGE
      * - wrongEditAbendCode300          COBOL Name: 300-WRONG-EDIT-ABEND-CODE
      *
      * Output :  

      * - pgmIdx500                      COBOL Name: 500-PGM-IDX
      * - syntaxPgmPtr800                COBOL Name: 800-SYNTAX-PGM-PTR
      * - additionalSyntaxChecks100      COBOL Name: 100-ADDITIONAL-SYNTAX-CHECKS
      * - additionalSyntaxChkInd500      COBOL Name: 500-ADDITIONAL-SYNTAX-CHK-IND
      * - abendPara900                   COBOL Name: 900-ABEND-PARA
      * - para2200300                    COBOL Name: 300-PARA-2200
      * - editNumber610                  COBOL Name: 610-EDIT-NUMBER
      * - ip00321EditNbr                 COBOL Name: IP00321-EDIT-NBR
      * - abendText900                   COBOL Name: 900-ABEND-TEXT
      * - ip60001EventErrorMsg           COBOL Name: IP60001-EVENT-ERROR-MSG
      * - errorMessage610                COBOL Name: 610-ERROR-MESSAGE
      * - ip60001EventErrorCode          COBOL Name: IP60001-EVENT-ERROR-CODE
      * - wrongEditAbendCode300          COBOL Name: 300-WRONG-EDIT-ABEND-CODE
      *
      * @throws CFException
      */
      private void setEditProgramPointer() throws Exception {
      
// *-----------------------------------------------------------------
// *Based on the edits table in copy member ip200091 different
// *edit programs are called.
// *-----------------------------------------------------------------

// *** Gcms 5.1 changes begin ***
//  IF 88-500-VALID-PROGRAMS ( 500-SYNTAX-IDX )
          if ( editType23InfoTableGroup500.getEditType23InfoTable500Redefined01().getSyntaxEditInfoEntry500(syntaxIdx500 - 1).isValidPrograms88500()  ) { 
//  SET 500-PGM-IDX TO 500-EDIT-MODULE-INDEX ( 500-SYNTAX-IDX )
              pgmIdx500 = editType23InfoTableGroup500.getEditType23InfoTable500Redefined01().getSyntaxEditInfoEntry500(syntaxIdx500 - 1).getEditModuleIndex500(); 
              
//  SET 800-SYNTAX-PGM-PTR TO 500-SYNTAX-PGM-PTR ( 500-PGM-IDX )
              work.setSyntaxPgmPtr800(syntaxPgmTableGroup500.getSyntaxPgmRedTable500().getSyntaxPgmTableEntry500(pgmIdx500 - 1).getSyntaxPgmPtr500()); 
              
//  MOVE 500-ADDITIONAL-SYNTAX-CHK-IND ( 500-SYNTAX-IDX ) TO 100-ADDITIONAL-SYNTAX-CHECKS
              additionalSyntaxChecksGroup100.setAdditionalSyntaxChecks100(editType23InfoTableGroup500.getEditType23InfoTable500Redefined01().getSyntaxEditInfoEntry500(syntaxIdx500 - 1).getAdditionalSyntaxChkInd500());

// *** Gcms 5.1 changes end   ***
//  PERFORM 8000-CALL-EDIT-MODULE
              callEditModule();/*8000-CALL-EDIT-MODULE*/
          }
//  ELSE
          else { 
//  MOVE 300-PARA-2200 TO 900-ABEND-PARA
              abendParaName900.setAbendPara900(work.getPara2200300());
//  MOVE IP00321-EDIT-NBR TO 610-EDIT-NUMBER
              errorMessage610.setEditNumber610(ip00321EditListRec.getIp00321EditNbr());
              // MOVE 610-ERROR-MESSAGE TO 900-ABEND-TEXT IP60001-EVENT-ERROR-MSG
              abendMessage900.setAbendText900(errorMessage610.toCharArray());
              ip60001EventLogWorkArea.setIp60001EventErrorMsg(errorMessage610.toCharArray());
//  MOVE 300-WRONG-EDIT-ABEND-CODE TO IP60001-EVENT-ERROR-CODE
              ip60001EventLogWorkArea.setIp60001EventErrorCode(work.getWrongEditAbendCode300());
//  PERFORM 9000-TERMINATE-ON-ERROR
              terminateOnError();/*9000-TERMINATE-ON-ERROR*/
          }
      
      }
      /**
      * callPgmIp381120 
      *   This method is derived from 
  *   COBOL Paragraph - 3000-CALL-PGM-IP381120 COBOL Cyclomatic complexity - 3
      * Input  :  

      * - ip90134EditNumber              COBOL Name: IP90134-EDIT-NUMBER
      * - value1643300                   COBOL Name: 300-VALUE-1643
      * - value1659300                   COBOL Name: 300-VALUE-1659
      * - rc                             COBOL Name: RETURN-CODE
      *
      * Output :  

      * - holdReturnCode800              COBOL Name: 800-HOLD-RETURN-CODE
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      private void callPgmIp381120() throws Exception {
			// Declare local variables used in the method
			Ip90134EditGroupKey ip90134EditGroupKey = ip90134TableEntry.getIp90134EditGroupKey();
			int ip90134EditNumber = 0;
			short value1643300 = 0;
			short value1659300 = 0;
			// End of variable declaration

      
// *-----------------------------------------------------------------
// *Call ip381120 to update for soft syntax edit
// *-----------------------------------------------------------------
          ip90134EditNumber = ip90134EditGroupKey.getIp90134EditNumber();
          value1643300 = work.getValue1643300();
          value1659300 = work.getValue1659300();
//  IF IP90134-EDIT-NUMBER EQUAL 300-VALUE-1643 OR IP90134-EDIT-NUMBER EQUAL 300-VALUE-1659
          if (	( ip90134EditNumber == value1643300 )  || 	( ip90134EditNumber == value1659300 ) ) { 
//  MOVE RETURN-CODE TO 800-HOLD-RETURN-CODE
              work.setHoldReturnCode800((short) getRc());
//  CALL 800-PTR-IP381120
              // CALL 800-PTR-IP381120
              	this.setRc( ip381120.process());
//  MOVE 800-HOLD-RETURN-CODE TO RETURN-CODE
              this.setRc(work.getHoldReturnCode800());
          }
  
      
      }
      /**
      * callEditModule 
      *   This method is derived from 
  *   COBOL Paragraph - 8000-CALL-EDIT-MODULE COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output :  

      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      private void callEditModule() throws Exception {
			// Declare local variables used in the method
			BaseProcess baseProcess = null;
			// End of variable declaration

      
// *-----------------------------------------------------------------
// *Call edit module.
// *-----------------------------------------------------------------
//  CALL 800-SYNTAX-PGM-PTR
          // CALL 800-SYNTAX-PGM-PTR
          baseProcess = getProcess(String.valueOf(work.getSyntaxPgmPtr800()));
          if(baseProcess != null) {
          	this.setRc( baseProcess.process());
          }
      
      }
      /**
      * checkSubfldPresence 
      *   This method is derived from 
  *   COBOL Paragraph - 8100-CHECK-SUBFLD-PRESENCE COBOL Cyclomatic complexity - 4
      * Input  :  

      * - ip65504TagNo                   COBOL Name: IP65504-TAG-NO
      * - ip00321IpmFieldNumber          COBOL Name: IP00321-IPM-FIELD-NUMBER
      * - ip65504TagType                 COBOL Name: IP65504-TAG-TYPE
      * - candidateTagType800            COBOL Name: 800-CANDIDATE-TAG-TYPE
      * - ip65504TagLngth                COBOL Name: IP65504-TAG-LNGTH
      *
      * Output :  

      * - ip65504T                       COBOL Name: IP65504-T
      * - isCandidatePresent100          COBOL Name: 100-IS-CANDIDATE-PRESENT
      * - isSubfldCheckOver100           COBOL Name: 100-IS-SUBFLD-CHECK-OVER
      *
      * @throws CFException
      */
      private void checkSubfldPresence() throws Exception {
			// Declare local variables used in the method
			Ip00321ErrorInfo ip00321ErrorInfo = ip00321EditListRec.getIp00321CurrEditInfo().getIp00321ErrorInfo();
			long ip00321IpmFieldNumber = 0;
			short candidateTagType800 = 0;
			// End of variable declaration

      
// *** Gcms 5.1 changes begin ***
// *-----------------------------------------------------------------
// *check the presence of de/pds subfield with the index of the tag
// *table set to the desired subfield.
// *-----------------------------------------------------------------
//  SET IP65504-T UP BY IP00321-IPM-SUBFIELD-NUMBER
          ip65504T = ip65504T + (int) ip00321ErrorInfo.getIp00321IpmSubfieldNumber(); 
          
  
//  SET IP65504-T DOWN BY 1
          ip65504T--; 
          
          candidateTagType800 = work.getCandidateTagType800();
          ip00321IpmFieldNumber = ip00321ErrorInfo.getIp00321IpmFieldNumber();
//  IF IP65504-TAG-NO ( IP65504-T ) = IP00321-IPM-FIELD-NUMBER AND IP65504-TAG-TYPE ( IP65504-T ) = 800-CANDIDATE-TAG-TYPE AND IP65504-TAG-LNGTH ( IP65504-T ) > 0
          if (	( ip65504CurrentTagTable.getIp65504TagArea(ip65504T - 1).getIp65504TagId().getIp65504TagNo() == ip00321IpmFieldNumber )  && 	( ip65504CurrentTagTable.getIp65504TagArea(ip65504T - 1).getIp65504TagId().getIp65504TagType() == candidateTagType800 ) && 	( ip65504CurrentTagTable.getIp65504TagArea(ip65504T - 1).getIp65504TagLngth() > 0 ) ) { 
//  SET 88-100-CANDIDATE-PRESENT TO TRUE
              work.setCandidatePresent88100True(); 
              
          }
  
//  ELSE
          else { 
//  SET 88-100-SUBFLD-CHECK-OVER TO TRUE
              work.setSubfldCheckOver88100True(); 
              
          }
      
      }
      /**
      * terminateOnError 
      *   This method is derived from 
  *   COBOL Paragraph - 9000-TERMINATE-ON-ERROR COBOL Cyclomatic complexity - 1
      * Input  :  

      * - edit0009300                    COBOL Name: 300-EDIT-0009
      * - abendParaName900               COBOL Name: 900-ABEND-PARA-NAME
      * - abendMessage900                COBOL Name: 900-ABEND-MESSAGE
      *
      * Output :  

      * - ip60001HoldPgmName             COBOL Name: IP60001-HOLD-PGM-NAME
      * - edit0009300                    COBOL Name: 300-EDIT-0009
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      private void terminateOnError() throws Exception {
      
// *-----------------------------------------------------------------
//  MOVE 300-EDIT-0009 TO IP60001-HOLD-PGM-NAME
          ip60001EventLogWorkArea.setIp60001HoldPgmName(work.getEdit0009300());
//  DISPLAY '***********************************'
          logger.info("***********************************"); 
//  DISPLAY 'A B E N D   A B E N D   A B E N D  '
          logger.info("A B E N D   A B E N D   A B E N D  "); 
//  DISPLAY 'A B E N D   I P 2 0 0 0 9 0        '
          logger.info("A B E N D   I P 2 0 0 0 9 0        "); 
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
* element ip200090 as of 06/28/21 12:13:39                    �vc�
*-----------------------------------------------------------------
*          -- -- -- c o n f i d e n t i a l -- -- --            *
*    this item contains information and procedures which are    *
*    proprietary to mastercard international, incorporated,     *
*    and which are confidential.  it is provided with the       *
*    express understanding that it is to be used only for the   *
*    benefit of interbank card association, and is not to be    *
*    used, copied, or disclosed for any other purpose.  any     *
*    authorized reproduction (in whole or in part) of this      *
*    material must be marked with this legend.                  *
*-----------------------------------------------------------------
*author.         isc.
*date-written.   july, 1999.
*date-compiled.  july, 1999.
*security.       property of mastercard international, inc.
*-----------------------------------------------------------------
*program functionality:
*-----------------------------------------------------------------
*this is a driver program for calling multiple syntax edits
*depending upon the edit type.
*-----------------------------------------------------------------
*revision history:
*-----------------------------------------------------------------
*
*    project         :ses ipm pre-edit
*    date            :1999/07/08
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
** project  |10/01/02 | regenerated for 02.1 release.         **
** version  |         | 001.02                                **
*-----------------------------------------------------------------
*    project         :gcms release 3.2
*    date            :2003/10/03
*    version         :001.04
*    programmer      :mathew alapatt
*    modification    :modified syntax program:
*                     ip202990 (de & pds subfields)
*                     for checking telephone numbers
*-----------------------------------------------------------------
*    project         :switch pre-edit
*    date            :2004/10/01
*    version         :001.05
*    programmer      :ron gawedzinski
*    modification    :recompiled for updated copybook ip200091.
*-----------------------------------------------------------------
*    project         :gcms release 5.1
*    date            :2005/04/01
*    version         :005.01
*    programmer      :ron gawedzinski
*    modification    :recompiled for updated copybook ip200091.
*-----------------------------------------------------------------
*    project         :gcms 5.1 - asd03215 & asd03318
*    date            :2005/04/01
*    programmer      :karthik shanmugam
*    modification    :modified for asd03215 & asd03318
*-----------------------------------------------------------------
*    project         :gcms release 11.q4 - c22668
*                     mexico domestic switching phase ii
*    date            :2011/10/14
*    programmer      :wipro
*    modification    :included call to program ip200100 to
*                     retrieve edit information when business
*                     service is 4/484001
*-----------------------------------------------------------------
* project           :gcms 16q4-prb71635                          *
* date              :2016/10/14                                  *
* programmer        :wipro                                       *
* modification      :added redefines to avoid truncation errors  *
******************************************************************
*    project         :gcms release 19.q4 - i11447                *
*                     moneysend enhancements                     *
*    date            :2019/10/18                                 *
*    programmer      :wipro                                      *
*    modification    :modified code to perform the syntax check  *
*                     for the edit 1441 only for the valid       *
*                     moneysend transaction type id.             *
*----------------------------------------------------------------*
*    project         :gcms release 19.q4 - i11447                *
*                     moneysend enhancements - qc13217           *
*    date            :2019/10/18                                 *
*    programmer      :wipro                                      *
*    modification    :modified code to check ca 150 = y to       *
*                     determine if 1240 message is moneysend     *
*                     for the edit 1441 and removed the call on  *
*                     ip203040 to search on ip0304t1.            *
*----------------------------------------------------------------*
*----------------------------------------------------------------*
*    project         :gcms 21.q2 i14881                          *
*                     moneysend enhancement phase iii            *
*    date            :2021/04/17                                 *
*    programmer      :wipro                                      *
*    modification    :modified the code by adding the condition  *
*                     for edit 1811 & 1813 to continue only when *
*                     moneysend addendum cross border indicator  *
*                     ca(187) is set to 'y'                      *
*----------------------------------------------------------------*
*/
