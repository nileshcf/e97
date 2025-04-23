  package com.cloudframe.app.process;
   /* The comment section is too large, 
	 * hence added at the end of the java code 
	 * please scroll all the way to the bottom to see complete comments 
	 */
  
  import java.util.Comparator;
  import java.util.stream.Stream;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.process.Ip661020;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.global.sharedvar.Ip66102NormalIpmMsgRedefined;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.process.Ip739010;
  import com.cloudframe.app.process.Ip741010;
  import com.cloudframe.app.global.sharedvar.Ip65504CurrentTagTable;
  import com.cloudframe.app.global.sharedvar.Ip65504TagArea;
  import com.cloudframe.app.global.sharedvar.Ip65504PdsMap;
  import com.cloudframe.app.global.sharedvar.Ip65504PdsMapEntry;
  import com.cloudframe.app.utility.CFUtil;
  import org.springframework.beans.factory.annotation.Value;
  import com.cloudframe.app.ip662010.dto.IpmErrorElementId600;
  import com.cloudframe.app.global.sharedvar.Ip000804PdsAttrTable;
  import java.util.ArrayList;
  import java.util.Map;
  import java.util.HashMap;
  import com.cloudframe.app.ip662010.dto.Id800;
  import com.cloudframe.app.global.sharedvar.Ip66102BitMap;
  import com.cloudframe.app.global.sharedvar.Ip66102IpmMsg;
  import com.cloudframe.app.global.sharedvar.Ip65504SelPdsEntriesAll;
  import com.cloudframe.app.ip662010.dto.*;
  import com.cloudframe.app.ip662010.dto.UndefinedPds600;
  import com.cloudframe.app.ip662010.dto.CurrentTag800;
  import com.cloudframe.app.global.sharedvar.Ip65504SelElemEntriesAll;
  import com.cloudframe.app.ip662010.dto.TooManyTags600;
  import com.cloudframe.app.ip662010.dto.CharMapColumns600;
  import com.cloudframe.app.ip662010.dto.LastSubfldTag800;
  import com.cloudframe.app.ip662010.dto.NewTag800;
  import com.cloudframe.app.global.sharedvar.Ip65504TaggedRecordInfo;
  import com.cloudframe.app.ip662010.dto.IpmErrorMsg600;
  import com.cloudframe.app.ip662010.dto.MessageLengthMsg600;
  import com.cloudframe.app.ip662010.dto.BadRecLngth600;
  import com.cloudframe.app.ip662010.dto.RemainingCarrLthNumGroup400;
  import com.cloudframe.app.ip662010.dto.PGroup400;
  import com.cloudframe.app.ip662010.dto.ParsingPatternValuesGroup500;
  import com.cloudframe.app.ip662010.dto.CarrierTooShortValuesGroup600;
  import com.cloudframe.app.ip662010.dto.Ip662011ReadParserErrMsgsGroup;
  import com.cloudframe.app.global.sharedvar.Ip000604DeAttrTable;
  import com.cloudframe.app.global.sharedvar.Ip000704DeSubAttrTable;
  import com.cloudframe.app.global.sharedvar.Ip000804PdsAttributes;
  import com.cloudframe.app.global.sharedvar.Ip000904PdsSubAttrTable;
  import com.cloudframe.app.global.sharedvar.Ip000608ProcessingDateTimeGroup;
  import com.cloudframe.app.global.sharedvar.Ip66102IpmFileInformation;
  import com.cloudframe.app.global.sharedvar.Ip65504TcntGroup;
  import com.cloudframe.app.global.sharedvar.Ip65504MessageStatusGroup;
  import com.cloudframe.app.global.sharedvar.Ip65504DeMapGroup;
  import com.cloudframe.app.global.sharedvar.Ip65504PdsMapGroup;
  import com.cloudframe.app.global.sharedvar.Ip662011ErrSubscriptGroup;
  import com.cloudframe.app.ip662010.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("ip662010")
  
  public class Ip662010 extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Ip662010.class);
  
  private UndefinedPds600 undefinedPds600 = new UndefinedPds600() ;
  private CurrentTag800 currentTag800 = new CurrentTag800() ;
  private TooManyTags600 tooManyTags600 = new TooManyTags600() ;
  private CharMapColumns600 charMapColumns600 = new CharMapColumns600() ;
  private LastSubfldTag800 lastSubfldTag800 = new LastSubfldTag800() ;
  private NewTag800 newTag800 = new NewTag800() ;
  private IpmErrorMsg600 ipmErrorMsg600 = new IpmErrorMsg600() ;
  private MessageLengthMsg600 messageLengthMsg600 = new MessageLengthMsg600() ;
  private BadRecLngth600 badRecLngth600 = new BadRecLngth600() ;
  private RemainingCarrLthNumGroup400 remainingCarrLthNumGroup400 = new RemainingCarrLthNumGroup400() ;
  private PGroup400 pGroup400 = new PGroup400() ;
  private ParsingPatternValuesGroup500 parsingPatternValuesGroup500 = new ParsingPatternValuesGroup500() ;
  private CarrierTooShortValuesGroup600 carrierTooShortValuesGroup600 = new CarrierTooShortValuesGroup600() ;
  private Ip662011ReadParserErrMsgsGroup ip662011ReadParserErrMsgsGroup = new Ip662011ReadParserErrMsgsGroup() ;
  private Work work = new Work() ;
  
  @Value("${timeZoneId:Etc/GMT}")
  private String timeZoneId;
  
  
  @Autowired 
  @Qualifier("ip661020")
  Ip661020 ip661020;
  @Autowired 
  @Qualifier("ip739010")
  Ip739010 ip739010;
  @Autowired 
  @Qualifier("ip741010")
  Ip741010 ip741010;
  @Autowired 
  @Qualifier("global_ip65504SelPdsEntriesAll")
  Ip65504SelPdsEntriesAll ip65504SelPdsEntriesAll;
  @Autowired 
  @Qualifier("global_ip65504DeMapGroup")
  Ip65504DeMapGroup ip65504DeMapGroup;
  @Autowired 
  @Qualifier("global_ip65504PdsMapGroup")
  Ip65504PdsMapGroup ip65504PdsMapGroup;
  @Autowired 
  @Qualifier("global_ip662011ErrSubscriptGroup")
  Ip662011ErrSubscriptGroup ip662011ErrSubscriptGroup;
  
  
  private static final int IP65504_TAG_AREA_LENGTH = 11;
  private static final int IP000704_DE_SUB_ATTR_ROW_LENGTH = 70;
  private static final int IP000904_PDS_SUB_ATTR_ROW_LENGTH = 70;
  
  int ip000804I;
  int ip65504T;
  int carrierShortCodeNdx600;
  int ip65504P;
  int ip000904I;
  int ip65504Max500;
  int ip000604I;
  int ip000704I;
  int ip662011ErrIndex;
  int maxTagNoX800;
  int ip65504D;
  
  
  
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
//  PERFORM 00000-MAINLINE
          mainline();/*00000-MAINLINE*/
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
  *   COBOL Paragraph - 00000-MAINLINE COBOL Cyclomatic complexity - 10
      * Input  :  

      * - isItTheFirstTime100            COBOL Name: 100-IS-IT-THE-FIRST-TIME
      * - ip66102IpmFileStatus           COBOL Name: IP66102-IPM-FILE-STATUS
      * - ip66102IsTagTablePresent       COBOL Name: IP66102-IS-TAG-TABLE-PRESENT
      * - ip66102IpmMsg                  COBOL Name: IP66102-IPM-MSG
      * - readParserChop300              COBOL Name: 300-READ-PARSER-CHOP
      * - writeParserChop300             COBOL Name: 300-WRITE-PARSER-CHOP
      * - ipmUpdaterChop300              COBOL Name: 300-IPM-UPDATER-CHOP
      * - ip66102TagStart                COBOL Name: IP66102-TAG-START
      * - eofMessage300                  COBOL Name: 300-EOF-MESSAGE
      * - ip65504MessageStatus           COBOL Name: IP65504-MESSAGE-STATUS
      * - ip662011ErrSubscript           COBOL Name: IP662011-ERR-SUBSCRIPT
      * - ip662011ReadParserMsg          COBOL Name: IP662011-READ-PARSER-MSG
      *
      * Output :  

      * - ip66102IsIpmFileFinished       COBOL Name: IP66102-IS-IPM-FILE-FINISHED
      * - ip66102IpmFileStatus           COBOL Name: IP66102-IPM-FILE-STATUS
      * - rc                             COBOL Name: RETURN-CODE
      * - ip662011ErrIndex               COBOL Name: IP662011-ERR-INDEX
      * - ip65504TagStatus               COBOL Name: IP65504-TAG-STATUS
      * - readParserChop300              COBOL Name: 300-READ-PARSER-CHOP
      *
      * @throws CFException
      */
      private void mainline() throws Exception {
			// Declare local variables used in the method
			Ip66102NormalIpmMsgRedefined ip66102NormalIpmMsgRedefined = ip66102IpmMsg.getIp66102NormalIpmMsgRedefined();
			char[] readParserChop300 = null;
			char[] writeParserChop300 = null;
			char[] ipmUpdaterChop300 = null;
			short ip65504MessageStatus = 0;
			// End of variable declaration

      
// *-----------------------------------------------------------------
// * We perform paragraph 0100- to display compile and current date
// * messages the 1st time in.   each time we will initialize working
// * fields that are required for parsing each specific message.   we
// * perform paragraph 2000- to parse the string.
// *-----------------------------------------------------------------
//  IF 88-IT-IS-THE-FIRST-TIME
          if ( work.isItIsTheFirstTime88()  ) { 
//  PERFORM 00100-DO-FIRST-TIME-SETUP
              doFirstTimeSetup();/*00100-DO-FIRST-TIME-SETUP*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
//  PERFORM 20000-INITIALIZE-PARSING-AREAS
          initializeParsingAreas();/*20000-INITIALIZE-PARSING-AREAS*/
          if (this.isProgramEnded()) {
              return ;
          }
//  IF IP66102-RECORD-ALREADY-READ
          if ( ip66102IpmFileInformation.isIp66102RecordAlreadyRead()  ) { 
//  SET IP66102-WE-GOT-A-MSG TO TRUE
              ip66102IpmFileInformation.setIp66102WeGotAMsgTrue(); 
              
          }
//  ELSE
          else { 

// *       Read an ipm record into ip66102-ipm-message.
// *       the message length is returned in ip66102-ipm-msg-lngth.
// *       ip66102-is-ipm-file-finished will be 'y' or 'n'.
//  SET IP66102-IPM-IO-WAS-GOOD TO TRUE
              ip66102IpmFileInformation.setIp66102IpmIoWasGoodTrue(); 
              
//  CALL 800-PTR-IP661020
              // CALL 800-PTR-IP661020
              	this.setRc( ip661020.process());
          }
//  IF IP66102-WE-GOT-A-MSG
          if ( ip66102IpmFileInformation.isIp66102WeGotAMsg()  ) { 
              ip66102NormalIpmMsgRedefined = ip66102IpmMsg.getIp66102NormalIpmMsgRedefined();
//  IF IP66102-TAG-TABLE-IS-PRESENT
              if ( ip66102NormalIpmMsgRedefined.isIp66102TagTableIsPresent()  ) { 
                  readParserChop300 = work.getReadParserChop300();
                  writeParserChop300 = work.getWriteParserChop300();
                  ipmUpdaterChop300 = work.getIpmUpdaterChop300();
//  IF IP66102-IPM-MSG ( IP66102-TAG-START + 10 : 1) = 300-READ-PARSER-CHOP OR 300-WRITE-PARSER-CHOP OR 300-IPM-UPDATER-CHOP
                  if (Field.compareChar(ip66102IpmMsg.toCharArray() , readParserChop300 , ( ((int) (ip66102NormalIpmMsgRedefined.getIp66102TagStart() + 10) - 1) /*start*/ ), 1 /*left len*/ , 1 /*right len*/) || Field.compareChar(ip66102IpmMsg.toCharArray() , writeParserChop300 , ( ((int) (ip66102NormalIpmMsgRedefined.getIp66102TagStart() + 10) - 1) /*start*/ ), 1 /*left len*/ , 1 /*right len*/) || Field.compareChar(ip66102IpmMsg.toCharArray() , ipmUpdaterChop300 , ( ((int) (ip66102NormalIpmMsgRedefined.getIp66102TagStart() + 10) - 1) /*start*/ ), 1 /*left len*/ , 1 /*right len*/)) { 

// *              It is a trustable tag table
//  PERFORM 40000-PARSE-VIA-TAG-TABLE
                      parseViaTagTable();/*40000-PARSE-VIA-TAG-TABLE*/
                      if (this.isProgramEnded()) {
                          return ;
                      }
                  }
  
//  ELSE
                  else { 

// *              It is a "brand-x" tag table so we discard it
//  PERFORM 40005-MOVE-MSG-TO-STD-AREA
                      moveMsgToStdArea();/*40005-MOVE-MSG-TO-STD-AREA*/
                      if (this.isProgramEnded()) {
                          return ;
                      }
//  PERFORM 30000-PARSE-THE-MESSAGE
                      parseTheMessage();/*30000-PARSE-THE-MESSAGE*/
                      if (this.isProgramEnded()) {
                          return ;
                      }
//  PERFORM 60000-CHECK-RECORD-LENGTH
                      checkRecordLength();/*60000-CHECK-RECORD-LENGTH*/
                      if (this.isProgramEnded()) {
                          return ;
                      }
                  }
              }
  
//  ELSE
              else { 
//  PERFORM 30000-PARSE-THE-MESSAGE
                  parseTheMessage();/*30000-PARSE-THE-MESSAGE*/
                  if (this.isProgramEnded()) {
                      return ;
                  }
//  PERFORM 60000-CHECK-RECORD-LENGTH
                  checkRecordLength();/*60000-CHECK-RECORD-LENGTH*/
                  if (this.isProgramEnded()) {
                      return ;
                  }
              }
          }
//  ELSE
          else { 
//  DISPLAY 300-EOF-MESSAGE
              logger.info(new String(work.getEofMessage300())); 
          }
          ip65504MessageStatus = ip65504MessageStatusGroup.getIp65504MessageStatus();
//  IF IP65504-MESSAGE-STATUS > 0
          if (	( ip65504MessageStatus > 0 ) ) { 
//  SET IP662011-ERR-INDEX TO IP662011-ERR-SUBSCRIPT
              ip662011ErrIndex = ip662011ErrSubscriptGroup.getIp662011ErrSubscript(); 
              
//  DISPLAY 'IP662010-' IP662011-READ-PARSER-MSG ( IP662011-ERR-INDEX )
              logger.info("IP662010-{}", new String(ip662011ReadParserErrMsgsGroup.getIp662011ReadParserErrMsgsRedefined().getIp662011ReadParserMsg(ip662011ErrIndex - 1))); 
          }
  
//  MOVE 300-READ-PARSER-CHOP TO IP65504-TAG-STATUS (1)
          ip65504CurrentTagTable.getIp65504TagArea(0).setIp65504TagStatus(work.getReadParserChop300());

// *       Mark this as created by ip662010.
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          this.setProgramEnded(true);
          return ;
      
      }
      /**
      * doFirstTimeSetup 
      *   This method is derived from 
  *   COBOL Paragraph - 00100-DO-FIRST-TIME-SETUP COBOL Cyclomatic complexity - 4
      * Input  :  

      * - readApi300                     COBOL Name: 300-READ-API
      * - loadT6T7300                    COBOL Name: 300-LOAD-T6-T7
      * - loadT8T9300                    COBOL Name: 300-LOAD-T8-T9
      *
      * Output :  

      * - ptrIp661020800                 COBOL Name: 800-PTR-IP661020
      * - ptrIp739010800                 COBOL Name: 800-PTR-IP739010
      * - ptrIp741010800                 COBOL Name: 800-PTR-IP741010
      * - isItTheFirstTime100            COBOL Name: 100-IS-IT-THE-FIRST-TIME
      * - ip65504IsFileTagged            COBOL Name: IP65504-IS-FILE-TAGGED
      * - badMessageCount400             COBOL Name: 400-BAD-MESSAGE-COUNT
      * - ip65504Tcnt                    COBOL Name: IP65504-TCNT
      * - rc                             COBOL Name: RETURN-CODE
      * - maxTagNo800                    COBOL Name: 800-MAX-TAG-NO
      * - maxTagNo600                    COBOL Name: 600-MAX-TAG-NO
      * - ip65504T                       COBOL Name: IP65504-T
      * - maxTagNoX800                   COBOL Name: 800-MAX-TAG-NO-X
      * - maxPdsNo800                    COBOL Name: 800-MAX-PDS-NO
      *
      * @throws CFException
      */
      private void doFirstTimeSetup() throws Exception {
//  SET 800-PTR-IP661020 TO ENTRY 300-READ-API
          work.setPtrIp661020800(work.getReadApi300()); 
          
//  SET 800-PTR-IP739010 TO ENTRY 300-LOAD-T6-T7
          work.setPtrIp739010800(work.getLoadT6T7300()); 
          
//  SET 800-PTR-IP741010 TO ENTRY 300-LOAD-T8-T9
          work.setPtrIp741010800(work.getLoadT8T9300()); 
          
//  MOVE 'N' TO 100-IS-IT-THE-FIRST-TIME IP65504-IS-FILE-TAGGED
//  LITERAL_N = 'N'
          work.setIsItTheFirstTime100(CONSTANTS.LITERAL_N);
          ip65504TaggedRecordInfo.setIp65504IsFileTagged(CONSTANTS.LITERAL_N);

// *          Assume the file is not "tagged".  this will be
// *          reset if we find that the file is tagged.
//  MOVE ZERO TO 400-BAD-MESSAGE-COUNT IP65504-TCNT
          work.setBadMessageCount400((short) 0);
          ip65504TcntGroup.setIp65504Tcnt((short) 0);
//  PERFORM 200-GET-TIMESTAMP-FOR-TABLES
          getTimestampForTables();/*200-GET-TIMESTAMP-FOR-TABLES*/
//  CALL 800-PTR-IP739010
          // CALL 800-PTR-IP739010
          	this.setRc( ip739010.process());

// *       If the load is unsuccessful the api will abend

// *       If the load is unsuccessful the api will abend
//  CALL 800-PTR-IP741010
          // CALL 800-PTR-IP741010
          	this.setRc( ip741010.process());
//  DIVIDE LENGTH OF IP65504-CURRENT-TAG-TABLE BY LENGTH OF IP65504-TAG-AREA GIVING 800-MAX-TAG-NO 600-MAX-TAG-NO
          work.setMaxTagNo800( (short) (Ip65504CurrentTagTable.getIp65504CurrentTagTableFieldLength()/Ip65504TagArea.getIp65504TagAreaFieldLength()));
          tooManyTags600.setMaxTagNo600( (int) Ip65504CurrentTagTable.getIp65504CurrentTagTableFieldLength()/Ip65504TagArea.getIp65504TagAreaFieldLength());
//  SET IP65504-T TO 800-MAX-TAG-NO
          ip65504T = work.getMaxTagNo800(); 
          
//  SET 800-MAX-TAG-NO-X TO IP65504-T
          maxTagNoX800 = IP65504_TAG_AREA_LENGTH * ( ((ip65504T < 1) ? 1:ip65504T) - 1); 
          
//  DIVIDE LENGTH OF IP65504-PDS-MAP BY LENGTH OF IP65504-PDS-MAP-ENTRY GIVING 800-MAX-PDS-NO
          work.setMaxPdsNo800( (short) (Ip65504PdsMap.getIp65504PdsMapFieldLength()/Ip65504PdsMapEntry.getIp65504PdsMapEntryFieldLength()));
      
      }
      /**
      * getTimestampForTables 
      *   This method is derived from 
  *   COBOL Paragraph - 200-GET-TIMESTAMP-FOR-TABLES COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output :  

      * - ip000608ProcessingDateTime     COBOL Name: IP000608-PROCESSING-DATE-TIME
      *
      * @throws CFException
      */
      private void getTimestampForTables() throws Exception {
//  MOVE FUNCTION CURRENT-DATE TO IP000608-PROCESSING-DATE-TIME
          ip000608ProcessingDateTimeGroup.setIp000608ProcessingDateTime( substring(CFUtil.getCurrentDate(timeZoneId),0,10));
      
      }
      /**
      * initializeParsingAreas 
      *   This method is derived from 
  *   COBOL Paragraph - 20000-INITIALIZE-PARSING-AREAS COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output :  

      * - ip65504SelPdsEntriesAll        COBOL Name: IP65504-SEL-PDS-ENTRIES-ALL
      * - ip65504Tcnt                    COBOL Name: IP65504-TCNT
      * - ip65504MessageStatus           COBOL Name: IP65504-MESSAGE-STATUS
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      private void initializeParsingAreas() throws Exception {

// *---------------------------------------------------------------
// * Each time this program is called we need to re-initialize the
// * pds byte map and the start/length tables for data elements and
// * pdses.
// *---------------------------------------------------------------
//  MOVE SPACES TO IP65504-SEL-PDS-ENTRIES-ALL
          ip65504SelPdsEntriesAll.setString(CONSTANTS.SPACE_3000);
//  PERFORM 20100-MOVE-LOW-VALUES
          moveLowValues();/*20100-MOVE-LOW-VALUES*/
//  MOVE ZEROES TO IP65504-TCNT IP65504-MESSAGE-STATUS RETURN-CODE
          ip65504TcntGroup.setIp65504Tcnt((short) 0);
          ip65504MessageStatusGroup.setIp65504MessageStatus((short) 0);
          this.setRc(0);
      
      }
      /**
      * moveLowValues 
      *   This method is derived from 
  *   COBOL Paragraph - 20100-MOVE-LOW-VALUES COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ip65504Tcnt                    COBOL Name: IP65504-TCNT
      *
      * Output :  

      * - tableLen800                    COBOL Name: 800-TABLE-LEN
      * - ip65504CurrentTagTable         COBOL Name: IP65504-CURRENT-TAG-TABLE
      * - ip65504DeMap                   COBOL Name: IP65504-DE-MAP
      * - ip65504PdsMap                  COBOL Name: IP65504-PDS-MAP
      * - ip65504TaggedRecordInfo        COBOL Name: IP65504-TAGGED-RECORD-INFO
      *
      * @throws CFException
      */
      private void moveLowValues() throws Exception {
			// Declare local variables used in the method
			short ip65504Tcnt = 0;
			// End of variable declaration


// * Initialize the tag table  with low values
          ip65504Tcnt = ip65504TcntGroup.getIp65504Tcnt();
//  IF IP65504-TCNT > 0
          if (	( ip65504Tcnt > 0 ) ) { 
//  MULTIPLY IP65504-TCNT BY LENGTH OF IP65504-TAG-AREA GIVING 800-TABLE-LEN
              work.setTableLen800( (short) (ip65504TcntGroup.getIp65504Tcnt()*(short) Ip65504TagArea.getIp65504TagAreaFieldLength()));
          }
  
//  ELSE
          else { 
//  MOVE LENGTH OF IP65504-CURRENT-TAG-TABLE TO 800-TABLE-LEN
              work.setTableLen800((short) Ip65504CurrentTagTable.getIp65504CurrentTagTableFieldLength());
          }
//  MOVE LOW-VALUES TO IP65504-CURRENT-TAG-TABLE (1 : 800-TABLE-LEN )
          ip65504CurrentTagTable.replace(CONSTANTS.LOW_VALUE_1907281621,0,7700/* length */,0,work.getTableLen800() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// * Initialize the de & pds maps and the tagged record
// * information with low values
//  MOVE LOW-VALUES TO IP65504-DE-MAP IP65504-PDS-MAP IP65504-TAGGED-RECORD-INFO
          ip65504DeMapGroup.setIp65504DeMap(CONSTANTS.LOW_VALUE_1901534004);
          ip65504PdsMapGroup.setIp65504PdsMap(CONSTANTS.LOW_VALUE_1149727953);
          ip65504TaggedRecordInfo.setString(CONSTANTS.LOW_VALUE_1703015800);
      
      }
      /**
      * parseTheMessage 
      *   This method is derived from 
  *   COBOL Paragraph - 30000-PARSE-THE-MESSAGE COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ip65504SelElemEnt              COBOL Name: IP65504-SEL-ELEM-ENT
      * - missingBitMap600               COBOL Name: 600-MISSING-BIT-MAP
      * - missingBitMapCode600           COBOL Name: 600-MISSING-BIT-MAP-CODE
      * - missingBitMapNdx600            COBOL Name: 600-MISSING-BIT-MAP-NDX
      *
      * Output :  

      * - ip65504TagType                 COBOL Name: IP65504-TAG-TYPE
      * - ip65504TagNo                   COBOL Name: IP65504-TAG-NO
      * - ip65504TagStarts               COBOL Name: IP65504-TAG-STARTS
      * - ip65504TagLngth                COBOL Name: IP65504-TAG-LNGTH
      * - j400                           COBOL Name: 400-J
      * - ip65504T                       COBOL Name: IP65504-T
      * - ip65504Tcnt                    COBOL Name: IP65504-TCNT
      * - ipmErrorElementId600           COBOL Name: 600-IPM-ERROR-ELEMENT-ID
      * - ipmErrorText600                COBOL Name: 600-IPM-ERROR-TEXT
      * - missingBitMap600               COBOL Name: 600-MISSING-BIT-MAP
      * - errorCode600                   COBOL Name: 600-ERROR-CODE
      * - ip65504MessageStatus           COBOL Name: IP65504-MESSAGE-STATUS
      * - missingBitMapCode600           COBOL Name: 600-MISSING-BIT-MAP-CODE
      * - ip662011ErrSubscript           COBOL Name: IP662011-ERR-SUBSCRIPT
      * - missingBitMapNdx600            COBOL Name: 600-MISSING-BIT-MAP-NDX
      * - ip65504SelElemEntriesAll       COBOL Name: IP65504-SEL-ELEM-ENTRIES-ALL
      * - ipmErrorPointerWidth600        COBOL Name: 600-IPM-ERROR-POINTER-WIDTH
      *
      * @throws CFException
      */
      private void parseTheMessage() throws Exception {
//  PERFORM 50000-EXPAND-THE-BIT-MAP
          expandTheBitMap();/*50000-EXPAND-THE-BIT-MAP*/
//  IF IP65504-SEL-ELEM-ENT (1) = 'X'
//  LITERAL_X = 'X'
          if (ip65504SelElemEntriesAll.getIp65504SelElemEnt(0)[0] == 'X') { 

// *       If the second bit-map is present
// *       create mti tag table entry
//  MOVE 1 TO IP65504-TAG-TYPE (1)
              ip65504CurrentTagTable.getIp65504TagArea(0).getIp65504TagId().setIp65504TagType((short)1);
//  MOVE 0 TO IP65504-TAG-NO (1)
              ip65504CurrentTagTable.getIp65504TagArea(0).getIp65504TagId().setIp65504TagNo((short)0);
//  MOVE 1 TO IP65504-TAG-STARTS (1)
              ip65504CurrentTagTable.getIp65504TagArea(0).setIp65504TagStarts((short)1);
//  MOVE 4 TO IP65504-TAG-LNGTH (1)
              ip65504CurrentTagTable.getIp65504TagArea(0).setIp65504TagLngth((short)4);
              // MOVE 21 TO 400-J
              work.setJ400((short)21);

// *          We set the current ipm message subscript, j, to point
// *          to the first byte after the second bit-map, d001.

// *          Set the tag table index to 1
//  SET IP65504-T TO 1
              ip65504T = 1; 
              
//  PERFORM 32000-FIND-ELEMENTS
              findElements();/*32000-FIND-ELEMENTS*/
              if (this.isProgramEnded()) {
                  return ;
              }
//  SET IP65504-TCNT TO IP65504-T
              ip65504TcntGroup.setIp65504Tcnt((short) ip65504T); 
              
          }

// *          Set the tag counter to the tag-table index
//  ELSE
          else { 
              // MOVE 'D0001' TO 600-IPM-ERROR-ELEMENT-ID
              //  LITERAL_D0001 = 'D0001'
              ipmErrorMsg600.getIpmErrorElementId600().setString(CONSTANTS.LITERAL_D0001);
//  MOVE 600-MISSING-BIT-MAP TO 600-IPM-ERROR-TEXT
              ipmErrorMsg600.setIpmErrorText600(pad(64,work.getMissingBitMap600(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 600-MISSING-BIT-MAP-CODE TO 600-ERROR-CODE IP65504-MESSAGE-STATUS
              ipmErrorMsg600.setErrorCode600( work.getMissingBitMapCode600());
              ip65504MessageStatusGroup.setIp65504MessageStatus((short) work.getMissingBitMapCode600());
//  MOVE 600-MISSING-BIT-MAP-NDX TO IP662011-ERR-SUBSCRIPT
              ip662011ErrSubscriptGroup.setIp662011ErrSubscript(work.getMissingBitMapNdx600());
              // MOVE 13 TO 400-J
              work.setJ400((short)13);
//  MOVE SPACES TO IP65504-SEL-ELEM-ENTRIES-ALL (65 : 64)
              ip65504SelElemEntriesAll.replace(CONSTANTS.SPACE_64,0,64/* length */,64,64 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
              // MOVE 8 TO 600-IPM-ERROR-POINTER-WIDTH
              work.setIpmErrorPointerWidth600((short)8);
//  MOVE 1 TO IP65504-TCNT
              ip65504TcntGroup.setIp65504Tcnt((short)1);
//  MOVE 1 TO IP65504-TAG-TYPE (1)
              ip65504CurrentTagTable.getIp65504TagArea(0).getIp65504TagId().setIp65504TagType((short)1);
//  MOVE 1 TO IP65504-TAG-STARTS (1)
              ip65504CurrentTagTable.getIp65504TagArea(0).setIp65504TagStarts((short)1);
//  MOVE 4 TO IP65504-TAG-LNGTH (1)
              ip65504CurrentTagTable.getIp65504TagArea(0).setIp65504TagLngth((short)4);
//  PERFORM 81000-PROCESS-BAD-MESSAGE
              processBadMessage();/*81000-PROCESS-BAD-MESSAGE*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
      
      }
      /**
      * findElements 
      *   This method is derived from 
  *   COBOL Paragraph - 32000-FIND-ELEMENTS COBOL Cyclomatic complexity - 11
      * Input  :  

      * - i400                           COBOL Name: 400-I
      * - ip65504SelElemEnt              COBOL Name: IP65504-SEL-ELEM-ENT
      * - ip000604DeSubflds              COBOL Name: IP000604-DE-SUBFLDS
      *
      * Output :  

      * - i400                           COBOL Name: 400-I
      * - ip65504D                       COBOL Name: IP65504-D
      * - ip65504DeMapEntry              COBOL Name: IP65504-DE-MAP-ENTRY
      * - ip000604I                      COBOL Name: IP000604-I
      * - ip65504DeStart                 COBOL Name: IP65504-DE-START
      * - j400                           COBOL Name: 400-J
      *
      * @throws CFException
      */
      private void findElements() throws Exception {

// *    Scan the byte-map for "x"s.  we start with position 2, since
// *    we've already handled de001, the second bit-map.
//  PERFORM VARYING 400-I FROM 2 BY 1 UNTIL 400-I > 128
          for (work.setI400(2); (	( work.getI400() <= 128 ) ) ; work.setI400(work.getI400() + 1) ) {
//  IF IP65504-SEL-ELEM-ENT ( 400-I ) = 'X'
//  LITERAL_X = 'X'
              if (ip65504SelElemEntriesAll.getIp65504SelElemEnt(work.getI400() - 1)[0] == 'X') { 
//  SET IP65504-D TO 400-I
                  ip65504D = work.getI400(); 
                  
//  MOVE HIGH-VALUES TO IP65504-DE-MAP-ENTRY ( IP65504-D )
                  ip65504DeMapGroup.getIp65504DeMap().setIp65504DeMapEntry((ip65504D - 1),CONSTANTS.HIGH_VALUE_1986603393);

// *             This is the "null" value for the "first-subfld"
// *             index.  low-values would be identical to an index to
// *             the first entry in the tag table--i.e, offset zero.
//  SET IP000604-I TO 400-I
                  ip000604I = work.getI400(); 
                  
//  IF IP000604-DE-SUBFLDS ( IP000604-I ) = 0
                  if (	( ip000604DeAttrTable.getIp000604DeAttrRow(ip000604I - 1).getIp000604DeSubflds() == 0 ) ) { 

// *             There are no subfields, so enter the whole element
//  PERFORM 32100-ENTER-WHOLE-DATA-ELEMENT
                      enterWholeDataElement();/*32100-ENTER-WHOLE-DATA-ELEMENT*/
                      if (this.isProgramEnded()) {
                          return ;
                      }
                  }
//  ELSE
                  else { 
//  PERFORM 32103-ENTER-DE-SUBFIELD-INFO
                      enterDeSubfieldInfo();/*32103-ENTER-DE-SUBFIELD-INFO*/
                      if (this.isProgramEnded()) {
                          return ;
                      }
                  }
              }
          }

// *    Check for pds carriers
//  IF IP65504-DE-START (48) > 0
          if (	( ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(47).getIp65504DeStart() > 0 ) ) { 
//  MOVE IP65504-DE-START (48) TO 400-J
              work.setJ400(ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(47).getIp65504DeStart());
              // MOVE 48 TO 400-I
              work.setI400((short)48);
//  PERFORM 32110-ENTER-PDS-INFO
              enterPdsInfo();/*32110-ENTER-PDS-INFO*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
//  IF IP65504-DE-START (62) > 0
          if (	( ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(61).getIp65504DeStart() > 0 ) ) { 
//  MOVE IP65504-DE-START (62) TO 400-J
              work.setJ400(ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(61).getIp65504DeStart());
              // MOVE 62 TO 400-I
              work.setI400((short)62);
//  PERFORM 32110-ENTER-PDS-INFO
              enterPdsInfo();/*32110-ENTER-PDS-INFO*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
//  IF IP65504-DE-START (123) > 0
          if (	( ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(122).getIp65504DeStart() > 0 ) ) { 
//  MOVE IP65504-DE-START (123) TO 400-J
              work.setJ400(ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(122).getIp65504DeStart());
              // MOVE 123 TO 400-I
              work.setI400((short)123);
//  PERFORM 32110-ENTER-PDS-INFO
              enterPdsInfo();/*32110-ENTER-PDS-INFO*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
//  IF IP65504-DE-START (124) > 0
          if (	( ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(123).getIp65504DeStart() > 0 ) ) { 
//  MOVE IP65504-DE-START (124) TO 400-J
              work.setJ400(ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(123).getIp65504DeStart());
              // MOVE 124 TO 400-I
              work.setI400((short)124);
//  PERFORM 32110-ENTER-PDS-INFO
              enterPdsInfo();/*32110-ENTER-PDS-INFO*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
//  IF IP65504-DE-START (125) > 0
          if (	( ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(124).getIp65504DeStart() > 0 ) ) { 
//  MOVE IP65504-DE-START (125) TO 400-J
              work.setJ400(ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(124).getIp65504DeStart());
              // MOVE 125 TO 400-I
              work.setI400((short)125);
//  PERFORM 32110-ENTER-PDS-INFO
              enterPdsInfo();/*32110-ENTER-PDS-INFO*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
//  IF IP65504-DE-START (127) > 0
          if (	( ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(126).getIp65504DeStart() > 0 ) ) { 
//  MOVE IP65504-DE-START (127) TO 400-J
              work.setJ400(ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(126).getIp65504DeStart());
              // MOVE 127 TO 400-I
              work.setI400((short)127);
//  PERFORM 32110-ENTER-PDS-INFO
              enterPdsInfo();/*32110-ENTER-PDS-INFO*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
      
      }
      /**
      * enterWholeDataElement 
      *   This method is derived from 
  *   COBOL Paragraph - 32100-ENTER-WHOLE-DATA-ELEMENT COBOL Cyclomatic complexity - 8
      * Input  :  

      * - i400                           COBOL Name: 400-I
      * - j400                           COBOL Name: 400-J
      * - ip65504DeLngth                 COBOL Name: IP65504-DE-LNGTH
      *
      * Output :  

      * - ip65504T                       COBOL Name: IP65504-T
      * - ip65504TagType                 COBOL Name: IP65504-TAG-TYPE
      * - ip65504TagNo                   COBOL Name: IP65504-TAG-NO
      * - i400                           COBOL Name: 400-I
      * - ip65504TagSubFldNo             COBOL Name: IP65504-TAG-SUB-FLD-NO
      * - ip65504TagStarts               COBOL Name: IP65504-TAG-STARTS
      * - ip65504DeStart                 COBOL Name: IP65504-DE-START
      * - j400                           COBOL Name: 400-J
      * - ip65504TagLngth                COBOL Name: IP65504-TAG-LNGTH
      * - ip65504DeLngth                 COBOL Name: IP65504-DE-LNGTH
      *
      * @throws CFException
      */
      private void enterWholeDataElement() throws Exception {
			// Declare local variables used in the method
			short i400 = 0;
			// End of variable declaration

//  SET IP65504-T UP BY 1
          ip65504T++; 
          

// *       Count this tag-table entry

// *      Check to see if the tag table is big enough for this entry

// *      Mark it as a data element rather than pds or mti
//  PERFORM 32106-CHECK-TAG-LIMIT
          checkTagLimit();/*32106-CHECK-TAG-LIMIT*/
          if (this.isProgramEnded()) {
              return ;
          }
//  MOVE 2 TO IP65504-TAG-TYPE ( IP65504-T )
          ip65504CurrentTagTable.getIp65504TagArea(ip65504T - 1).getIp65504TagId().setIp65504TagType((short)2);
//  MOVE 400-I TO IP65504-TAG-NO ( IP65504-T )
          ip65504CurrentTagTable.getIp65504TagArea(ip65504T - 1).getIp65504TagId().setIp65504TagNo(work.getI400());
//  MOVE ZERO TO IP65504-TAG-SUB-FLD-NO ( IP65504-T )
          ip65504CurrentTagTable.getIp65504TagArea(ip65504T - 1).setIp65504TagSubFldNo((short) 0);
//  PERFORM 32101-STORE-DE-LENGTH
          storeDeLength();/*32101-STORE-DE-LENGTH*/
          if (this.isProgramEnded()) {
              return ;
          }
//  MOVE 400-J TO IP65504-TAG-STARTS ( IP65504-T ) IP65504-DE-START ( 400-I )
          ip65504CurrentTagTable.getIp65504TagArea(ip65504T - 1).setIp65504TagStarts(work.getJ400());
          ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(work.getI400() - 1).setIp65504DeStart(work.getJ400());
//  MOVE IP65504-DE-LNGTH ( 400-I ) TO IP65504-TAG-LNGTH ( IP65504-T )
          ip65504CurrentTagTable.getIp65504TagArea(ip65504T - 1).setIp65504TagLngth(ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(work.getI400() - 1).getIp65504DeLngth());
          i400 = work.getI400();
//  IF ( 400-I = 48 OR 62 OR 123 OR 124 OR 125 OR 127)
          if ((	( i400 == 48 )  || 	( i400 == 62 )  || 	( i400 == 123 )  || 	( i400 == 124 )  || 	( i400 == 125 )  || 	( i400 == 127 ) )) { 

// *       This is a "pds carrier"

// *          The carrier is too short to contain a pds prefix
// *          and one byte of data
//  IF IP65504-DE-LNGTH ( 400-I ) < 8
              if (	( ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(work.getI400() - 1).getIp65504DeLngth() < 8 ) ) { 
//  PERFORM 32119-HANDLE-SHORT-CARRIER
                  handleShortCarrier();/*32119-HANDLE-SHORT-CARRIER*/
                  if (this.isProgramEnded()) {
                      return ;
                  }
              }
//  SET IP65504-T DOWN BY 1
              ip65504T--; 
              
          }
  

// *       Suppress the tag table entry for any carrier.
//  ADD IP65504-DE-LNGTH ( 400-I ) TO 400-J
          work.setJ400( (short) (work.getJ400()+ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(work.getI400() - 1).getIp65504DeLngth()));
      
      }
      /**
      * storeDeLength 
      *   This method is derived from 
  *   COBOL Paragraph - 32101-STORE-DE-LENGTH COBOL Cyclomatic complexity - 10
      * Input  :  

      * - ip000604DeMinLngth             COBOL Name: IP000604-DE-MIN-LNGTH
      * - ip66102IpmMsg                  COBOL Name: IP66102-IPM-MSG
      * - j400                           COBOL Name: 400-J
      * - ip000604DeLllSize              COBOL Name: IP000604-DE-LLL-SIZE
      * - i400                           COBOL Name: 400-I
      * - code661300                     COBOL Name: 300-CODE-661
      *
      * Output :  

      * - ip65504DeLngth                 COBOL Name: IP65504-DE-LNGTH
      * - ip000604DeMinLngth             COBOL Name: IP000604-DE-MIN-LNGTH
      * - ip66102IpmMsg                  COBOL Name: IP66102-IPM-MSG
      * - j400                           COBOL Name: 400-J
      * - ipmErrorPointerWidth600        COBOL Name: 600-IPM-ERROR-POINTER-WIDTH
      * - displayNumber600               COBOL Name: 600-DISPLAY-NUMBER
      * - ip000604DeLllSize              COBOL Name: IP000604-DE-LLL-SIZE
      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      * - code661300                     COBOL Name: 300-CODE-661
      *
      * @throws CFException
      */
      private void storeDeLength() throws Exception {

// *    Numeric.
// *-----------------------------------------------------------------
//  EVALUATE IP000604-DE-LLL-SIZE ( 400-I )
          switch(ip000604DeAttrTable.getIp000604DeAttrRow(work.getI400() - 1).getIp000604DeLllSize()){
          	case 0:
//  MOVE IP000604-DE-MIN-LNGTH ( 400-I ) TO IP65504-DE-LNGTH ( 400-I )
              ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(work.getI400() - 1).setIp65504DeLngth(ip000604DeAttrTable.getIp000604DeAttrRow(work.getI400() - 1).getIp000604DeMinLngth());
          break;
          	case 2:
//  IF IP66102-IPM-MSG ( 400-J : 2) IS NUMERIC AND IP66102-IPM-MSG ( 400-J : 2) NOT = '00'
//  LITERAL_00 = '00'
              if (    isNumeric(substring(ip66102IpmMsg.getCharArray(),(work.getJ400()-1), (work.getJ400() + 1) )) && !(Field.compareChar(ip66102IpmMsg.toCharArray() , CONSTANTS.LITERAL_00 , ( (work.getJ400() - 1) /*start*/ ), 2 /*left len*/ , 2 /*right len*/))) { 
//  MOVE IP66102-IPM-MSG ( 400-J : 2) TO IP65504-DE-LNGTH ( 400-I )
                  ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(work.getI400() - 1).setIp65504DeLngth(CFUtil.getShort(substring(ip66102IpmMsg.getCharArray(),(work.getJ400()-1), (work.getJ400() + 1) )));
//  ADD 2 TO 400-J
                  work.setJ400( (short) (work.getJ400()+(short)2));
              }
//  ELSE
              else { 
                  // MOVE 2 TO 600-IPM-ERROR-POINTER-WIDTH
                  work.setIpmErrorPointerWidth600((short)2);
//  PERFORM 80000-HANDLE-BAD-LENGTH-FIELD
                  handleBadLengthField();/*80000-HANDLE-BAD-LENGTH-FIELD*/
                  if (this.isProgramEnded()) {
                      return ;
                  }
              }
          break;
          	case 3:
//  IF IP66102-IPM-MSG ( 400-J : 3) IS NUMERIC AND IP66102-IPM-MSG ( 400-J : 3) NOT = '000'
//  LITERAL_000 = '000'
              if (    isNumeric(substring(ip66102IpmMsg.getCharArray(),(work.getJ400()-1), (work.getJ400() + 2) )) && !(Field.compareChar(ip66102IpmMsg.toCharArray() , CONSTANTS.LITERAL_000 , ( (work.getJ400() - 1) /*start*/ ), 3 /*left len*/ , 3 /*right len*/))) { 
//  MOVE IP66102-IPM-MSG ( 400-J : 3) TO IP65504-DE-LNGTH ( 400-I )
                  ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(work.getI400() - 1).setIp65504DeLngth(CFUtil.getShort(substring(ip66102IpmMsg.getCharArray(),(work.getJ400()-1), (work.getJ400() + 2) )));
//  ADD 3 TO 400-J
                  work.setJ400( (short) (work.getJ400()+(short)3));
              }
//  ELSE
              else { 
                  // MOVE 3 TO 600-IPM-ERROR-POINTER-WIDTH
                  work.setIpmErrorPointerWidth600((short)3);
//  PERFORM 80000-HANDLE-BAD-LENGTH-FIELD
                  handleBadLengthField();/*80000-HANDLE-BAD-LENGTH-FIELD*/
                  if (this.isProgramEnded()) {
                      return ;
                  }
              }
          break;
          default :
//  MOVE IP000604-DE-LLL-SIZE ( 400-I ) TO 600-DISPLAY-NUMBER
//  FORMAT_1564585219 = "Z,ZZ9"
              work.setDisplayNumber600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1564585219,String.valueOf(ip000604DeAttrTable.getIp000604DeAttrRow(work.getI400() - 1).getIp000604DeLllSize()).toCharArray()));
//  DISPLAY 'IP662010-32101-INVALID TABLE-6 ELEM-IN-LLL(' 400-I ') = ' 600-DISPLAY-NUMBER
              logger.info("IP662010-32101-INVALID TABLE-6 ELEM-IN-LLL({}) = {}", String.valueOf(work.getI400()), new String(work.getDisplayNumber600())); 
//  DISPLAY '               MUST BE 0, 2 OR 3'
              logger.info("               MUST BE 0, 2 OR 3"); 
//  MOVE 300-CODE-661 TO 900-ABEND-CODE
              work.setAbendCode900(work.getCode661300());
//  PERFORM 99999-ABEND
              abend();/*99999-ABEND*/
          }
      
      }
      /**
      * enterDeSubfieldInfo 
      *   This method is derived from 
  *   COBOL Paragraph - 32103-ENTER-DE-SUBFIELD-INFO COBOL Cyclomatic complexity - 3
      * Input  :  

      * - i400                           COBOL Name: 400-I
      * - j400                           COBOL Name: 400-J
      * - ip65504DeLngth                 COBOL Name: IP65504-DE-LNGTH
      * - ip66102IpmMsgLngth             COBOL Name: IP66102-IPM-MSG-LNGTH
      *
      * Output :  

      * - doesVarSubfExist100            COBOL Name: 100-DOES-VAR-SUBF-EXIST
      * - newType800                     COBOL Name: 800-NEW-TYPE
      * - newNo800                       COBOL Name: 800-NEW-NO
      * - i400                           COBOL Name: 400-I
      * - ip65504DeStart                 COBOL Name: IP65504-DE-START
      * - j400                           COBOL Name: 400-J
      * - ip65504D                       COBOL Name: IP65504-D
      * - ip65504T                       COBOL Name: IP65504-T
      * - ip65504DeFirstSubfld           COBOL Name: IP65504-DE-FIRST-SUBFLD
      * - startOfNextElement800          COBOL Name: 800-START-OF-NEXT-ELEMENT
      *
      * @throws CFException
      */
      private void enterDeSubfieldInfo() throws Exception {
          // MOVE 'N' TO 100-DOES-VAR-SUBF-EXIST
          //  LITERAL_N = 'N'
          work.setDoesVarSubfExist100(CONSTANTS.LITERAL_N);
//  MOVE 2 TO 800-NEW-TYPE
          newTag800.setNewType800((short)2);
//  MOVE 400-I TO 800-NEW-NO
          newTag800.setNewNo800(work.getI400());
//  PERFORM 32101-STORE-DE-LENGTH
          storeDeLength();/*32101-STORE-DE-LENGTH*/
          if (this.isProgramEnded()) {
              return ;
          }
//  MOVE 400-J TO IP65504-DE-START ( 400-I )
          ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(work.getI400() - 1).setIp65504DeStart(work.getJ400());

// *    Link the de-map entry to its first subfield in the tag table
//  SET IP65504-D TO 400-I
          ip65504D = work.getI400(); 
          
//  SET IP65504-T UP BY 1
          ip65504T++; 
          
//  SET IP65504-DE-FIRST-SUBFLD ( IP65504-D ) TO IP65504-T
          ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(ip65504D - 1).setIp65504DeFirstSubfld(IP65504_TAG_AREA_LENGTH * ( ((ip65504T < 1) ? 1:ip65504T) - 1)); 
          
//  SET IP65504-T DOWN BY 1
          ip65504T--; 
          
//  ADD IP65504-DE-LNGTH ( 400-I ) TO 400-J GIVING 800-START-OF-NEXT-ELEMENT
          work.setStartOfNextElement800( (short) (work.getJ400()+ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(work.getI400() - 1).getIp65504DeLngth()));
//  PERFORM 32104-DO-A-DE-OCCURRENCE-GROUP UNTIL 400-J >= 800-START-OF-NEXT-ELEMENT OR 400-J > IP66102-IPM-MSG-LNGTH
          while (	( work.getJ400() < work.getStartOfNextElement800() ) && 	( work.getJ400() <= ip66102IpmFileInformation.getIp66102IpmMsgLngth() ) ) {
             doADeOccurrenceGroup();/*32104-DO-A-DE-OCCURRENCE-GROUP*/
             if (this.isProgramEnded()) {
                 return ;
             }
          }
          ;
      
      }
      /**
      * doADeOccurrenceGroup 
      *   This method is derived from 
  *   COBOL Paragraph - 32104-DO-A-DE-OCCURRENCE-GROUP COBOL Cyclomatic complexity - 12
      * Input  :  

      * - ip000604DeFirstSubfld          COBOL Name: IP000604-DE-FIRST-SUBFLD
      * - j400                           COBOL Name: 400-J
      * - startOfNextElement800          COBOL Name: 800-START-OF-NEXT-ELEMENT
      * - currentSubfld400               COBOL Name: 400-CURRENT-SUBFLD
      * - ip000604DeSubflds              COBOL Name: IP000604-DE-SUBFLDS
      * - ip000604I                      COBOL Name: IP000604-I
      * - ip000704DeSubMinLngth          COBOL Name: IP000704-DE-SUB-MIN-LNGTH
      * - ip000704DeSubMaxLngth          COBOL Name: IP000704-DE-SUB-MAX-LNGTH
      * - newTag800                      COBOL Name: 800-NEW-TAG
      * - ip65504DeLngth                 COBOL Name: IP65504-DE-LNGTH
      * - ip000604DeMinLngth             COBOL Name: IP000604-DE-MIN-LNGTH
      * - doesVarSubfExist100            COBOL Name: 100-DOES-VAR-SUBF-EXIST
      * - i400                           COBOL Name: 400-I
      *
      * Output :  

      * - ip000704I                      COBOL Name: IP000704-I
      * - currentSubfld400               COBOL Name: 400-CURRENT-SUBFLD
      * - newSubfldNo800                 COBOL Name: 800-NEW-SUBFLD-NO
      * - newStart800                    COBOL Name: 800-NEW-START
      * - j400                           COBOL Name: 400-J
      * - newLength800                   COBOL Name: 800-NEW-LENGTH
      * - ip000704DeSubMinLngth          COBOL Name: IP000704-DE-SUB-MIN-LNGTH
      * - ip65504T                       COBOL Name: IP65504-T
      * - ip65504TagArea                 COBOL Name: IP65504-TAG-AREA
      * - newTag800                      COBOL Name: 800-NEW-TAG
      * - newStatus800                   COBOL Name: 800-NEW-STATUS
      *
      * @throws CFException
      */
      private void doADeOccurrenceGroup() throws Exception {
			// Declare local variables used in the method
			short currentSubfld400 = 0;
			short newLength800 = 0;
			short j400 = 0;
			short startOfNextElement800 = 0;
			// End of variable declaration


// *    Loop through all the defined subfields once, building a tag
// *    entry for each one
//  SET IP000704-I TO IP000604-DE-FIRST-SUBFLD ( IP000604-I )
          ip000704I = (ip000604DeAttrTable.getIp000604DeAttrRow(ip000604I - 1).getIp000604DeFirstSubfld()/IP000704_DE_SUB_ATTR_ROW_LENGTH) + 1 ; 
          
//  PERFORM VARYING 400-CURRENT-SUBFLD FROM 1 BY 1 UNTIL 400-J >= 800-START-OF-NEXT-ELEMENT OR 400-CURRENT-SUBFLD > IP000604-DE-SUBFLDS ( IP000604-I )
          for (work.setCurrentSubfld400(1); (	( work.getJ400() < work.getStartOfNextElement800() ) && 	( work.getCurrentSubfld400() <= ip000604DeAttrTable.getIp000604DeAttrRow(ip000604I - 1).getIp000604DeSubflds() )) ; work.setCurrentSubfld400(work.getCurrentSubfld400() + 1) ) {
//  PERFORM 32106-CHECK-TAG-LIMIT
              checkTagLimit();/*32106-CHECK-TAG-LIMIT*/
              if (this.isProgramEnded()) {
                  return ;
              }
//  MOVE 400-CURRENT-SUBFLD TO 800-NEW-SUBFLD-NO
              newTag800.setNewSubfldNo800(work.getCurrentSubfld400());
//  MOVE 400-J TO 800-NEW-START
              newTag800.setNewStart800(work.getJ400());
//  IF IP000704-DE-SUB-MIN-LNGTH ( IP000704-I ) LESS THAN IP000704-DE-SUB-MAX-LNGTH ( IP000704-I )
              if (	( ip000704DeSubAttrTable.getIp000704DeSubAttrRow(ip000704I - 1).getIp000704DeSubMinLngth() < ip000704DeSubAttrTable.getIp000704DeSubAttrRow(ip000704I - 1).getIp000704DeSubMaxLngth() )) { 

// *          Variable-length subfield; must be delimited by "\"
// *          unless it is the last in the element
                  currentSubfld400 = work.getCurrentSubfld400();
//  IF 400-CURRENT-SUBFLD < IP000604-DE-SUBFLDS ( IP000604-I )
                  if (	( currentSubfld400 < ip000604DeAttrTable.getIp000604DeAttrRow(ip000604I - 1).getIp000604DeSubflds() )) { 
//  PERFORM 32105-DO-DELIMITED-SUBFLD
                      doDelimitedSubfld();/*32105-DO-DELIMITED-SUBFLD*/
                      if (this.isProgramEnded()) {
                          return ;
                      }
                  }
  
//  ELSE
                  else { 
//  SUBTRACT 400-J FROM 800-START-OF-NEXT-ELEMENT GIVING 800-NEW-LENGTH
                      newTag800.setNewLength800( (short) (work.getStartOfNextElement800()-work.getJ400()));
//  ADD 800-NEW-LENGTH TO 400-J
                      work.setJ400( (short) (work.getJ400()+newTag800.getNewLength800()));
                  }
              }
//  ELSE
              else { 

// *          Fixed-length subfield
// *          we'll use the shorter of the t7 length and the
// *          remaining length in the data element.
//  SUBTRACT 400-J FROM 800-START-OF-NEXT-ELEMENT GIVING 800-NEW-LENGTH
                  newTag800.setNewLength800( (short) (work.getStartOfNextElement800()-work.getJ400()));
                  newLength800 = newTag800.getNewLength800();
//  IF 800-NEW-LENGTH > IP000704-DE-SUB-MIN-LNGTH ( IP000704-I )
                  if (	( newLength800 > ip000704DeSubAttrTable.getIp000704DeSubAttrRow(ip000704I - 1).getIp000704DeSubMinLngth() )) { 
//  MOVE IP000704-DE-SUB-MIN-LNGTH ( IP000704-I ) TO 800-NEW-LENGTH
                      newTag800.setNewLength800(ip000704DeSubAttrTable.getIp000704DeSubAttrRow(ip000704I - 1).getIp000704DeSubMinLngth());
                  }
  
//  ADD 800-NEW-LENGTH TO 400-J
                  work.setJ400( (short) (work.getJ400()+newTag800.getNewLength800()));
              }
//  SET IP65504-T UP BY 1
              ip65504T++; 
              

// *          Count this tag-table entry
//  MOVE 800-NEW-TAG TO IP65504-TAG-AREA ( IP65504-T )
              ip65504CurrentTagTable.setIp65504TagArea((ip65504T - 1),newTag800.getCharArray());
//  SET IP000704-I UP BY 1
              ip000704I++; 
              

// *       If we have used up the data, but not yet defined all the
// *       subfields we will insert zero-length tags for all
// *       remaining subfields.
              j400 = work.getJ400();
              startOfNextElement800 = work.getStartOfNextElement800();
              currentSubfld400 = work.getCurrentSubfld400();
//  IF 400-J >= 800-START-OF-NEXT-ELEMENT AND 400-CURRENT-SUBFLD < IP000604-DE-SUBFLDS ( IP000604-I )
              if (	( j400 >= startOfNextElement800 ) && 	( currentSubfld400 < ip000604DeAttrTable.getIp000604DeAttrRow(ip000604I - 1).getIp000604DeSubflds() )) { 
//  IF IP65504-DE-LNGTH ( 400-I ) < IP000604-DE-MIN-LNGTH ( IP000604-I ) OR 88-100-VAR-SUBF-EXISTS
                  if (	( ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(work.getI400() - 1).getIp65504DeLngth() < ip000604DeAttrTable.getIp000604DeAttrRow(ip000604I - 1).getIp000604DeMinLngth() ) ||  work.isVarSubfExists88100()  ) { 
//  ADD 1 TO 400-CURRENT-SUBFLD
                      work.setCurrentSubfld400( (short) (work.getCurrentSubfld400()+(short)1));
//  ADD 800-NEW-LENGTH TO 800-NEW-START GIVING 800-NEW-START
                      newTag800.setNewStart800( (short) (newTag800.getNewStart800()+newTag800.getNewLength800()));
//  MOVE ZERO TO 800-NEW-LENGTH
                      newTag800.setNewLength800((short) 0);
//  MOVE SPACE TO 800-NEW-STATUS
                      newTag800.setNewStatus800(CONSTANTS.SPACE);
//  PERFORM UNTIL 400-CURRENT-SUBFLD > IP000604-DE-SUBFLDS ( IP000604-I )
                      while ((	( work.getCurrentSubfld400() <= ip000604DeAttrTable.getIp000604DeAttrRow(ip000604I - 1).getIp000604DeSubflds() ))) {
//  MOVE 400-CURRENT-SUBFLD TO 800-NEW-SUBFLD-NO
                          newTag800.setNewSubfldNo800(work.getCurrentSubfld400());
//  SET IP65504-T UP BY 1
                          ip65504T++; 
                          
//  MOVE 800-NEW-TAG TO IP65504-TAG-AREA ( IP65504-T )
                          ip65504CurrentTagTable.setIp65504TagArea((ip65504T - 1),newTag800.getCharArray());
//  SET IP000704-I UP BY 1
                          ip000704I++; 
                          
//  ADD 1 TO 400-CURRENT-SUBFLD
                          work.setCurrentSubfld400( (short) (work.getCurrentSubfld400()+(short)1));
                      }
                  }
              }
  
          }
      
      }
      /**
      * doDelimitedSubfld 
      *   This method is derived from 
  *   COBOL Paragraph - 32105-DO-DELIMITED-SUBFLD COBOL Cyclomatic complexity - 8
      * Input  :  

      * - subfldLength400                COBOL Name: 400-SUBFLD-LENGTH
      * - ip000704DeSubMaxLngth          COBOL Name: IP000704-DE-SUB-MAX-LNGTH
      * - ip000704I                      COBOL Name: IP000704-I
      * - ip66102IpmMsg                  COBOL Name: IP66102-IPM-MSG
      * - j400                           COBOL Name: 400-J
      * - noBackslashCode600             COBOL Name: 600-NO-BACKSLASH-CODE
      * - noBackslash600                 COBOL Name: 600-NO-BACKSLASH
      * - noBackslashNdx600              COBOL Name: 600-NO-BACKSLASH-NDX
      * - newType800                     COBOL Name: 800-NEW-TYPE
      * - newNo800                       COBOL Name: 800-NEW-NO
      * - newStart800                    COBOL Name: 800-NEW-START
      *
      * Output :  

      * - doesVarSubfExist100            COBOL Name: 100-DOES-VAR-SUBF-EXIST
      * - subfldLength400                COBOL Name: 400-SUBFLD-LENGTH
      * - j400                           COBOL Name: 400-J
      * - newLength800                   COBOL Name: 800-NEW-LENGTH
      * - errorCode600                   COBOL Name: 600-ERROR-CODE
      * - ip65504MessageStatus           COBOL Name: IP65504-MESSAGE-STATUS
      * - noBackslashCode600             COBOL Name: 600-NO-BACKSLASH-CODE
      * - ipmErrorText600                COBOL Name: 600-IPM-ERROR-TEXT
      * - noBackslash600                 COBOL Name: 600-NO-BACKSLASH
      * - ip662011ErrSubscript           COBOL Name: IP662011-ERR-SUBSCRIPT
      * - noBackslashNdx600              COBOL Name: 600-NO-BACKSLASH-NDX
      * - ip65504T                       COBOL Name: IP65504-T
      * - ipmErrorPointerWidth600        COBOL Name: 600-IPM-ERROR-POINTER-WIDTH
      * - ip65504TagLngth                COBOL Name: IP65504-TAG-LNGTH
      * - ip000704DeSubMaxLngth          COBOL Name: IP000704-DE-SUB-MAX-LNGTH
      * - ip65504TagType                 COBOL Name: IP65504-TAG-TYPE
      * - newType800                     COBOL Name: 800-NEW-TYPE
      * - ipmErrorElementType600         COBOL Name: 600-IPM-ERROR-ELEMENT-TYPE
      * - ip65504TagNo                   COBOL Name: IP65504-TAG-NO
      * - ipmErrorElementNo600           COBOL Name: 600-IPM-ERROR-ELEMENT-NO
      * - newNo800                       COBOL Name: 800-NEW-NO
      * - ip65504TagStarts               COBOL Name: IP65504-TAG-STARTS
      * - newStart800                    COBOL Name: 800-NEW-START
      *
      * @throws CFException
      */
      private void doDelimitedSubfld() throws Exception {
			// Declare local variables used in the method
			IpmErrorElementId600 ipmErrorElementId600 = ipmErrorMsg600.getIpmErrorElementId600();
			// End of variable declaration

//  SET 88-100-VAR-SUBF-EXISTS TO TRUE
          work.setVarSubfExists88100True(); 
          
//  PERFORM VARYING 400-SUBFLD-LENGTH FROM 0 BY 1 UNTIL 400-SUBFLD-LENGTH = IP000704-DE-SUB-MAX-LNGTH ( IP000704-I ) OR IP66102-IPM-MSG ( 400-J : 1) = '\'
          for (work.setSubfldLength400(0); (	( work.getSubfldLength400() != ip000704DeSubAttrTable.getIp000704DeSubAttrRow(ip000704I - 1).getIp000704DeSubMaxLngth() ) && work.getJ400() > 0 && ip66102IpmMsg.toCharArray()[getIndex(work.getJ400())] != '\\') ; work.setSubfldLength400(work.getSubfldLength400() + 1) ) {
//  ADD 1 TO 400-J
              work.setJ400( (short) (work.getJ400()+(short)1));
          }
//  IF IP66102-IPM-MSG ( 400-J : 1) = '\'
          if (work.getJ400() > 0 && ip66102IpmMsg.toCharArray()[getIndex(work.getJ400())] == '\\') { 
//  MOVE 400-SUBFLD-LENGTH TO 800-NEW-LENGTH
              newTag800.setNewLength800(work.getSubfldLength400());
//  ADD 1 TO 400-J
              work.setJ400( (short) (work.getJ400()+(short)1));
          }

// *          Skip over the slash
//  ELSE
          else { 
//  MOVE 600-NO-BACKSLASH-CODE TO 600-ERROR-CODE IP65504-MESSAGE-STATUS
              ipmErrorMsg600.setErrorCode600( work.getNoBackslashCode600());
              ip65504MessageStatusGroup.setIp65504MessageStatus((short) work.getNoBackslashCode600());
//  MOVE 600-NO-BACKSLASH TO 600-IPM-ERROR-TEXT
              ipmErrorMsg600.setIpmErrorText600(pad(64,work.getNoBackslash600(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 600-NO-BACKSLASH-NDX TO IP662011-ERR-SUBSCRIPT
              ip662011ErrSubscriptGroup.setIp662011ErrSubscript(work.getNoBackslashNdx600());
//  SUBTRACT 400-SUBFLD-LENGTH FROM 400-J
              work.setJ400( (short) (work.getJ400()-work.getSubfldLength400()));
//  SET IP65504-T UP BY 1
              ip65504T++; 
              
//  MOVE IP000704-DE-SUB-MAX-LNGTH ( IP000704-I ) TO 600-IPM-ERROR-POINTER-WIDTH IP65504-TAG-LNGTH ( IP65504-T )
              work.setIpmErrorPointerWidth600(ip000704DeSubAttrTable.getIp000704DeSubAttrRow(ip000704I - 1).getIp000704DeSubMaxLngth());
              ip65504CurrentTagTable.getIp65504TagArea(ip65504T - 1).setIp65504TagLngth(ip000704DeSubAttrTable.getIp000704DeSubAttrRow(ip000704I - 1).getIp000704DeSubMaxLngth());
//  MOVE 800-NEW-TYPE TO IP65504-TAG-TYPE ( IP65504-T )
              ip65504CurrentTagTable.getIp65504TagArea(ip65504T - 1).getIp65504TagId().setIp65504TagType(newTag800.getNewType800());
//  EVALUATE 800-NEW-TYPE
              switch(newTag800.getNewType800()){
              	case 2:
//  MOVE 'D' TO 600-IPM-ERROR-ELEMENT-TYPE
//  LITERAL_D = 'D'
                  ipmErrorElementId600.setIpmErrorElementType600(CONSTANTS.LITERAL_D);
  
              break;
              	case 3:
//  MOVE 'P' TO 600-IPM-ERROR-ELEMENT-TYPE
//  LITERAL_P = 'P'
                  ipmErrorElementId600.setIpmErrorElementType600(CONSTANTS.LITERAL_P);
  
              break;
              default :
//  MOVE '?' TO 600-IPM-ERROR-ELEMENT-TYPE
//  LITERAL_34661 = '?'
                  ipmErrorElementId600.setIpmErrorElementType600(CONSTANTS.LITERAL_34661);
  
              }
//  MOVE 800-NEW-NO TO IP65504-TAG-NO ( IP65504-T ) 600-IPM-ERROR-ELEMENT-NO
              ip65504CurrentTagTable.getIp65504TagArea(ip65504T - 1).getIp65504TagId().setIp65504TagNo(newTag800.getNewNo800());
              ipmErrorElementId600.setIpmErrorElementNo600(newTag800.getNewNo800());
  
//  MOVE 800-NEW-START TO IP65504-TAG-STARTS ( IP65504-T )
              ip65504CurrentTagTable.getIp65504TagArea(ip65504T - 1).setIp65504TagStarts(newTag800.getNewStart800());
//  PERFORM 81000-PROCESS-BAD-MESSAGE
              processBadMessage();/*81000-PROCESS-BAD-MESSAGE*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
      
      }
      /**
      * checkTagLimit 
      *   This method is derived from 
  *   COBOL Paragraph - 32106-CHECK-TAG-LIMIT COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ip65504T                       COBOL Name: IP65504-T
      * - maxTagNoX800                   COBOL Name: 800-MAX-TAG-NO-X
      * - tooManyTagsCode600             COBOL Name: 600-TOO-MANY-TAGS-CODE
      * - tooManyTagsNdx600              COBOL Name: 600-TOO-MANY-TAGS-NDX
      * - tooManyTags600                 COBOL Name: 600-TOO-MANY-TAGS
      * - k400                           COBOL Name: 400-K
      *
      * Output :  

      * - errorCode600                   COBOL Name: 600-ERROR-CODE
      * - ip65504MessageStatus           COBOL Name: IP65504-MESSAGE-STATUS
      * - tooManyTagsCode600             COBOL Name: 600-TOO-MANY-TAGS-CODE
      * - ip662011ErrSubscript           COBOL Name: IP662011-ERR-SUBSCRIPT
      * - tooManyTagsNdx600              COBOL Name: 600-TOO-MANY-TAGS-NDX
      * - ipmErrorText600                COBOL Name: 600-IPM-ERROR-TEXT
      * - tooManyTags600                 COBOL Name: 600-TOO-MANY-TAGS
      * - j400                           COBOL Name: 400-J
      * - k400                           COBOL Name: 400-K
      *
      * @throws CFException
      */
      private void checkTagLimit() throws Exception {
//  IF IP65504-T GREATER THAN 800-MAX-TAG-NO-X
          if (	( ip65504T > ( maxTagNoX800 / 11 ) + 1  )) { 
//  MOVE 600-TOO-MANY-TAGS-CODE TO 600-ERROR-CODE IP65504-MESSAGE-STATUS
              ipmErrorMsg600.setErrorCode600( work.getTooManyTagsCode600());
              ip65504MessageStatusGroup.setIp65504MessageStatus((short) work.getTooManyTagsCode600());
//  MOVE 600-TOO-MANY-TAGS-NDX TO IP662011-ERR-SUBSCRIPT
              ip662011ErrSubscriptGroup.setIp662011ErrSubscript(work.getTooManyTagsNdx600());
              // MOVE 600-TOO-MANY-TAGS TO 600-IPM-ERROR-TEXT
              ipmErrorMsg600.setIpmErrorText600(tooManyTags600.toCharArray());
//  MOVE 400-K TO 400-J
              work.setJ400(work.getK400());

// *           Point 400-j to the error
//  PERFORM 43000-HANDLE-BAD-TAG
              handleBadTag();/*43000-HANDLE-BAD-TAG*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
      
      }
      /**
      * enterPdsInfo 
      *   This method is derived from 
  *   COBOL Paragraph - 32110-ENTER-PDS-INFO COBOL Cyclomatic complexity - 11
      * Input  :  

      * - j400                           COBOL Name: 400-J
      * - ip65504DeLngth                 COBOL Name: IP65504-DE-LNGTH
      * - ip66102IpmMsg                  COBOL Name: IP66102-IPM-MSG
      * - nonNumericPdsCode600           COBOL Name: 600-NON-NUMERIC-PDS-CODE
      * - nonNumericPdsNdx600            COBOL Name: 600-NON-NUMERIC-PDS-NDX
      * - nonNumericPdsId600             COBOL Name: 600-NON-NUMERIC-PDS-ID
      * - remainingCarrLthNumX400        COBOL Name: 400-REMAINING-CARR-LTH-NUM-X
      * - ip000804PdsSubflds             COBOL Name: IP000804-PDS-SUBFLDS
      *
      * Output :  

      * - k400                           COBOL Name: 400-K
      * - j400                           COBOL Name: 400-J
      * - remainingCarrierLth400         COBOL Name: 400-REMAINING-CARRIER-LTH
      * - ip65504DeLngth                 COBOL Name: IP65504-DE-LNGTH
      * - remainingCarrLthNum400         COBOL Name: 400-REMAINING-CARR-LTH-NUM
      * - errorCode600                   COBOL Name: 600-ERROR-CODE
      * - ip65504MessageStatus           COBOL Name: IP65504-MESSAGE-STATUS
      * - nonNumericPdsCode600           COBOL Name: 600-NON-NUMERIC-PDS-CODE
      * - ip662011ErrSubscript           COBOL Name: IP662011-ERR-SUBSCRIPT
      * - nonNumericPdsNdx600            COBOL Name: 600-NON-NUMERIC-PDS-NDX
      * - ipmErrorText600                COBOL Name: 600-IPM-ERROR-TEXT
      * - nonNumericPdsId600             COBOL Name: 600-NON-NUMERIC-PDS-ID
      * - ip65504T                       COBOL Name: IP65504-T
      * - ip65504TagType                 COBOL Name: IP65504-TAG-TYPE
      * - ip65504TagStarts               COBOL Name: IP65504-TAG-STARTS
      * - ip65504TagLngth                COBOL Name: IP65504-TAG-LNGTH
      * - ip66102IpmMsg                  COBOL Name: IP66102-IPM-MSG
      * - ipmErrorPointerWidth600        COBOL Name: 600-IPM-ERROR-POINTER-WIDTH
      * - ip65504TagNo                   COBOL Name: IP65504-TAG-NO
      * - pdsTag400                      COBOL Name: 400-PDS-TAG
      * - ip65504SelPdsEnt               COBOL Name: IP65504-SEL-PDS-ENT
      * - ip65504P                       COBOL Name: IP65504-P
      * - ip65504PdsMapEntry             COBOL Name: IP65504-PDS-MAP-ENTRY
      * - ip65504PdsStart                COBOL Name: IP65504-PDS-START
      * - pdsLength400                   COBOL Name: 400-PDS-LENGTH
      * - ip65504PdsLngth                COBOL Name: IP65504-PDS-LNGTH
      * - ip000804I                      COBOL Name: IP000804-I
      *
      * @throws CFException
      */
      private void enterPdsInfo() throws Exception {
			// Declare local variables used in the method
			Ip000804PdsAttrTable ip000804PdsAttrTable = ip000804PdsAttributes.getIp000804PdsAttrTable();
			char[] remainingCarrLthNumX400 = null;
			// End of variable declaration


// *-----------------------------------------------------------------
// * Enter the pds id, start and length into the tag table for each
// * pds in this data element.  also enter the starting position and
// * length for each pds into the appropriate entry of the pds table.
// * pds lengths are determined by reading the first three bytes
// * following the pds tag in the data element.
// *
// * if a pds contains subfields then tags for the subfields are
// * entered into the tag table instead of one tag for the whole pds.
// *-----------------------------------------------------------------

// *       400-K will be used to step through this carrier data
// *       element, while 400-j stays pointing to its start
//  MOVE 400-J TO 400-K
          work.setK400(work.getJ400());
//  MOVE IP65504-DE-LNGTH ( 400-I ) TO 400-REMAINING-CARRIER-LTH
          work.setRemainingCarrierLth400(ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(work.getI400() - 1).getIp65504DeLngth());
//  PERFORM UNTIL 400-REMAINING-CARRIER-LTH LESS THAN OR EQUAL ZERO
          while ((	( work.getRemainingCarrierLth400() > 0 ) )) {
//  MOVE 400-REMAINING-CARRIER-LTH TO 400-REMAINING-CARR-LTH-NUM
              remainingCarrLthNumGroup400.setRemainingCarrLthNum400(work.getRemainingCarrierLth400());
              remainingCarrLthNumX400 = remainingCarrLthNumGroup400.getRemainingCarrLthNumX400();
//  EVALUATE TRUE
              if  (    !( isNumeric(substring(ip66102IpmMsg.getCharArray(),(work.getK400()-1), (work.getK400() + 3) )) )) { 
//  MOVE 600-NON-NUMERIC-PDS-CODE TO 600-ERROR-CODE IP65504-MESSAGE-STATUS
                  ipmErrorMsg600.setErrorCode600( work.getNonNumericPdsCode600());
                  ip65504MessageStatusGroup.setIp65504MessageStatus((short) work.getNonNumericPdsCode600());
//  MOVE 600-NON-NUMERIC-PDS-NDX TO IP662011-ERR-SUBSCRIPT
                  ip662011ErrSubscriptGroup.setIp662011ErrSubscript(work.getNonNumericPdsNdx600());
//  MOVE 600-NON-NUMERIC-PDS-ID TO 600-IPM-ERROR-TEXT
                  ipmErrorMsg600.setIpmErrorText600(pad(64,work.getNonNumericPdsId600(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 400-K TO 400-J
                  work.setJ400(work.getK400());

// *               Point 400-j to the error
//  SET IP65504-T UP BY 1
                  ip65504T++; 
                  
//  MOVE 3 TO IP65504-TAG-TYPE ( IP65504-T )
                  ip65504CurrentTagTable.getIp65504TagArea(ip65504T - 1).getIp65504TagId().setIp65504TagType((short)3);
//  ADD 7 TO 400-K GIVING IP65504-TAG-STARTS ( IP65504-T )
                  ip65504CurrentTagTable.getIp65504TagArea(ip65504T - 1).setIp65504TagStarts( (short) (work.getK400()+(short)7));
//  IF IP66102-IPM-MSG ( 400-K + 4 : 3) IS NUMERIC
                  if (    isNumeric(substring(ip66102IpmMsg.getCharArray(),(work.getK400() + 4-1), (work.getK400() + 4 + 2) ))) { 
//  MOVE IP66102-IPM-MSG ( 400-K + 4 : 3) TO IP65504-TAG-LNGTH ( IP65504-T )
                      ip65504CurrentTagTable.getIp65504TagArea(ip65504T - 1).setIp65504TagLngth(CFUtil.getShort(substring(ip66102IpmMsg.getCharArray(),(work.getK400() + 4-1), (work.getK400() + 4 + 2) )));
                  }
//  PERFORM 32116-HANDLE-BAD-PDS-ID
                  handleBadPdsId();/*32116-HANDLE-BAD-PDS-ID*/
                  if (this.isProgramEnded()) {
                      return ;
                  }
              }
              else if  (    !( isNumeric(substring(ip66102IpmMsg.getCharArray(),(work.getK400() + 4-1), (work.getK400() + 4 + 2) )) ) || Field.compareChar(ip66102IpmMsg.toCharArray() , CONSTANTS.LITERAL_000 , ( (work.getK400() + 4 - 1) /*start*/ ), 3 /*left len*/ , 3 /*right len*/) || 		compareChars(substring(ip66102IpmMsg.getCharArray(),(work.getK400() + 4-1), (work.getK400() + 4 + 2) ),remainingCarrLthNumX400) > 0 ) { 

// *            The pds-length is invalid

// *               Point 400-j to the error
//  ADD 4 400-K GIVING 400-J
                  work.setJ400( (short) ((short)4+work.getK400()));
                  // MOVE 3 TO 600-IPM-ERROR-POINTER-WIDTH
                  work.setIpmErrorPointerWidth600((short)3);
//  SET IP65504-T UP BY 1
                  ip65504T++; 
                  
//  MOVE 3 TO IP65504-TAG-TYPE ( IP65504-T )
                  ip65504CurrentTagTable.getIp65504TagArea(ip65504T - 1).getIp65504TagId().setIp65504TagType((short)3);
//  MOVE IP66102-IPM-MSG ( 400-K : 4) TO IP65504-TAG-NO ( IP65504-T )
                  ip65504CurrentTagTable.getIp65504TagArea(ip65504T - 1).getIp65504TagId().setIp65504TagNo(CFUtil.getShort(substring(ip66102IpmMsg.getCharArray(),(work.getK400()-1), (work.getK400() + 3) )));
//  ADD 7 TO 400-K GIVING IP65504-TAG-STARTS ( IP65504-T )
                  ip65504CurrentTagTable.getIp65504TagArea(ip65504T - 1).setIp65504TagStarts( (short) (work.getK400()+(short)7));
//  PERFORM 80000-HANDLE-BAD-LENGTH-FIELD
                  handleBadLengthField();/*80000-HANDLE-BAD-LENGTH-FIELD*/
                  if (this.isProgramEnded()) {
                      return ;
                  }
              }
              else   { 

// *           The pds looks good, put it in the tag table and
// *           pds map
//  MOVE IP66102-IPM-MSG ( 400-K : 4) TO 400-PDS-TAG
                  work.setPdsTag400(CFUtil.getShort(substring(ip66102IpmMsg.getCharArray(),(work.getK400()-1), (work.getK400() + 3) )));
//  PERFORM 32110-1-CHECK-FOR-VALID-PDS-NO
                  _1CheckForValidPdsNo();/*32110-1-CHECK-FOR-VALID-PDS-NO*/
                  if (this.isProgramEnded()) {
                      return ;
                  }
//  PERFORM 32111-CHECK-FOR-DUPLICATE-PDS
                  checkForDuplicatePds();/*32111-CHECK-FOR-DUPLICATE-PDS*/
                  if (this.isProgramEnded()) {
                      return ;
                  }
//  MOVE 'X' TO IP65504-SEL-PDS-ENT ( 400-PDS-TAG )
//  LITERAL_X = 'X', LITERAL_X = "X"
                  ip65504SelPdsEntriesAll.setIp65504SelPdsEnt((work.getPdsTag400() - 1),CONSTANTS.LITERAL_X);
//  SET IP65504-P TO 400-PDS-TAG
                  ip65504P = work.getPdsTag400(); 
                  
//  MOVE HIGH-VALUES TO IP65504-PDS-MAP-ENTRY ( IP65504-P )
                  ip65504PdsMapGroup.getIp65504PdsMap().setIp65504PdsMapEntry((ip65504P - 1),CONSTANTS.HIGH_VALUE_1986603393);

// *             This is the "null" value for the "first-subfld"
// *           index. low-values would be identical to an index to
// *           the first entry in the tag table--i.e, offset zero.
//  ADD 7 400-K GIVING IP65504-PDS-START ( IP65504-P )
                  ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry(ip65504P - 1).setIp65504PdsStart( (short) ((short)7+work.getK400()));
//  IF IP66102-IPM-MSG ( 400-K + 4 : 3) NUMERIC
                  if (    isNumeric(substring(ip66102IpmMsg.getCharArray(),(work.getK400() + 4-1), (work.getK400() + 4 + 2) ))) { 
//  MOVE IP66102-IPM-MSG ( 400-K + 4 : 3) TO 400-PDS-LENGTH
                      work.setPdsLength400(CFUtil.getShort(substring(ip66102IpmMsg.getCharArray(),(work.getK400() + 4-1), (work.getK400() + 4 + 2) )));
//  MOVE 400-PDS-LENGTH TO IP65504-PDS-LNGTH ( IP65504-P )
                      ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry(ip65504P - 1).setIp65504PdsLngth(work.getPdsLength400());
                  }
//  SET IP000804-I TO 400-PDS-TAG
                  ip000804I = work.getPdsTag400(); 
                  
//  IF IP000804-PDS-SUBFLDS ( IP000804-I ) = 0
                  if (	( ip000804PdsAttrTable.getIp000804PdsAttrRow(ip000804I - 1).getIp000804PdsSubflds() == 0 ) ) { 

// *              There are no subfields, so enter the whole pds
//  PERFORM 32112-ENTER-WHOLE-PDS
                      enterWholePds();/*32112-ENTER-WHOLE-PDS*/
                      if (this.isProgramEnded()) {
                          return ;
                      }
                  }
  
//  ELSE
                  else { 
//  PERFORM 32113-ENTER-PDS-SUBFIELDS
                      enterPdsSubfields();/*32113-ENTER-PDS-SUBFIELDS*/
                      if (this.isProgramEnded()) {
                          return ;
                      }
                  }
//  ADD 7 400-PDS-LENGTH TO 400-K
                  work.setK400( (short) (work.getK400()+(short)7+work.getPdsLength400()));

// *              Position after this pds
//  SUBTRACT 7 400-PDS-LENGTH FROM 400-REMAINING-CARRIER-LTH
                  work.setRemainingCarrierLth400( (short) (work.getRemainingCarrierLth400()-(short)7-work.getPdsLength400()));
              }
  
          }
      
      }
      /**
      * _1CheckForValidPdsNo 
      *   This method is derived from 
  *   COBOL Paragraph - 32110-1-CHECK-FOR-VALID-PDS-NO COBOL Cyclomatic complexity - 3
      * Input  :  

      * - pdsTag400                      COBOL Name: 400-PDS-TAG
      * - ip000804MaxPdsNo               COBOL Name: IP000804-MAX-PDS-NO
      * - undefinedPdsCode600            COBOL Name: 600-UNDEFINED-PDS-CODE
      * - undefinedPdsNdx600             COBOL Name: 600-UNDEFINED-PDS-NDX
      * - undefinedPds600                COBOL Name: 600-UNDEFINED-PDS
      * - k400                           COBOL Name: 400-K
      *
      * Output :  

      * - undefinedPdsNo600              COBOL Name: 600-UNDEFINED-PDS-NO
      * - ip65504TagNo                   COBOL Name: IP65504-TAG-NO
      * - pdsTag400                      COBOL Name: 400-PDS-TAG
      * - ip65504TagType                 COBOL Name: IP65504-TAG-TYPE
      * - errorCode600                   COBOL Name: 600-ERROR-CODE
      * - ip65504MessageStatus           COBOL Name: IP65504-MESSAGE-STATUS
      * - undefinedPdsCode600            COBOL Name: 600-UNDEFINED-PDS-CODE
      * - ip662011ErrSubscript           COBOL Name: IP662011-ERR-SUBSCRIPT
      * - undefinedPdsNdx600             COBOL Name: 600-UNDEFINED-PDS-NDX
      * - ipmErrorText600                COBOL Name: 600-IPM-ERROR-TEXT
      * - undefinedPds600                COBOL Name: 600-UNDEFINED-PDS
      * - j400                           COBOL Name: 400-J
      * - k400                           COBOL Name: 400-K
      *
      * @throws CFException
      */
      private void _1CheckForValidPdsNo() throws Exception {
			// Declare local variables used in the method
			short pdsTag400 = 0;
			short ip000804MaxPdsNo = 0;
			// End of variable declaration

          pdsTag400 = work.getPdsTag400();
          ip000804MaxPdsNo = ip000804PdsAttributes.getIp000804MaxPdsNo();
//  IF 400-PDS-TAG = ZERO OR 400-PDS-TAG > IP000804-MAX-PDS-NO
          if (	( pdsTag400 == 0 )  || 	( pdsTag400 > ip000804MaxPdsNo )) { 

// *       The pds-no is invalid
//  MOVE 400-PDS-TAG TO 600-UNDEFINED-PDS-NO IP65504-TAG-NO ( IP65504-T )
              undefinedPds600.setUndefinedPdsNo600(work.getPdsTag400());
              ip65504CurrentTagTable.getIp65504TagArea(ip65504T - 1).getIp65504TagId().setIp65504TagNo(work.getPdsTag400());
//  MOVE 3 TO IP65504-TAG-TYPE ( IP65504-T )
              ip65504CurrentTagTable.getIp65504TagArea(ip65504T - 1).getIp65504TagId().setIp65504TagType((short)3);
//  MOVE 600-UNDEFINED-PDS-CODE TO 600-ERROR-CODE IP65504-MESSAGE-STATUS
              ipmErrorMsg600.setErrorCode600( work.getUndefinedPdsCode600());
              ip65504MessageStatusGroup.setIp65504MessageStatus((short) work.getUndefinedPdsCode600());
//  MOVE 600-UNDEFINED-PDS-NDX TO IP662011-ERR-SUBSCRIPT
              ip662011ErrSubscriptGroup.setIp662011ErrSubscript(work.getUndefinedPdsNdx600());
              // MOVE 600-UNDEFINED-PDS TO 600-IPM-ERROR-TEXT
              ipmErrorMsg600.setIpmErrorText600(undefinedPds600.toCharArray());
//  MOVE 400-K TO 400-J
              work.setJ400(work.getK400());

// *          Point 400-j to the error
//  PERFORM 32116-HANDLE-BAD-PDS-ID
              handleBadPdsId();/*32116-HANDLE-BAD-PDS-ID*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
  
      
      }
      /**
      * checkForDuplicatePds 
      *   This method is derived from 
  *   COBOL Paragraph - 32111-CHECK-FOR-DUPLICATE-PDS COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ip65504PdsStart                COBOL Name: IP65504-PDS-START
      * - pdsTag400                      COBOL Name: 400-PDS-TAG
      * - duplicatePdsCode600            COBOL Name: 600-DUPLICATE-PDS-CODE
      * - duplicatePdsNdx600             COBOL Name: 600-DUPLICATE-PDS-NDX
      * - duplicatePds600                COBOL Name: 600-DUPLICATE-PDS
      * - k400                           COBOL Name: 400-K
      *
      * Output :  

      * - errorCode600                   COBOL Name: 600-ERROR-CODE
      * - ip65504MessageStatus           COBOL Name: IP65504-MESSAGE-STATUS
      * - duplicatePdsCode600            COBOL Name: 600-DUPLICATE-PDS-CODE
      * - ip662011ErrSubscript           COBOL Name: IP662011-ERR-SUBSCRIPT
      * - duplicatePdsNdx600             COBOL Name: 600-DUPLICATE-PDS-NDX
      * - ipmErrorText600                COBOL Name: 600-IPM-ERROR-TEXT
      * - duplicatePds600                COBOL Name: 600-DUPLICATE-PDS
      * - ip65504T                       COBOL Name: IP65504-T
      * - ip65504TagType                 COBOL Name: IP65504-TAG-TYPE
      * - ip65504TagNo                   COBOL Name: IP65504-TAG-NO
      * - pdsTag400                      COBOL Name: 400-PDS-TAG
      * - j400                           COBOL Name: 400-J
      * - k400                           COBOL Name: 400-K
      *
      * @throws CFException
      */
      private void checkForDuplicatePds() throws Exception {
//  IF IP65504-PDS-START ( 400-PDS-TAG ) > ZERO
          if (	( ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry(work.getPdsTag400() - 1).getIp65504PdsStart() > 0 ) ) { 

// *       This is a duplicate pds
//  MOVE 600-DUPLICATE-PDS-CODE TO 600-ERROR-CODE IP65504-MESSAGE-STATUS
              ipmErrorMsg600.setErrorCode600( work.getDuplicatePdsCode600());
              ip65504MessageStatusGroup.setIp65504MessageStatus((short) work.getDuplicatePdsCode600());
//  MOVE 600-DUPLICATE-PDS-NDX TO IP662011-ERR-SUBSCRIPT
              ip662011ErrSubscriptGroup.setIp662011ErrSubscript(work.getDuplicatePdsNdx600());
//  MOVE 600-DUPLICATE-PDS TO 600-IPM-ERROR-TEXT
              ipmErrorMsg600.setIpmErrorText600(pad(64,work.getDuplicatePds600(),SPACE_CHAR,RIGHT_PAD));
//  SET IP65504-T UP BY 1
              ip65504T++; 
              
//  MOVE 3 TO IP65504-TAG-TYPE ( IP65504-T )
              ip65504CurrentTagTable.getIp65504TagArea(ip65504T - 1).getIp65504TagId().setIp65504TagType((short)3);
//  MOVE 400-PDS-TAG TO IP65504-TAG-NO ( IP65504-T )
              ip65504CurrentTagTable.getIp65504TagArea(ip65504T - 1).getIp65504TagId().setIp65504TagNo(work.getPdsTag400());
//  MOVE 400-K TO 400-J
              work.setJ400(work.getK400());

// *          Point 400-j to the error
//  PERFORM 32116-HANDLE-BAD-PDS-ID
              handleBadPdsId();/*32116-HANDLE-BAD-PDS-ID*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
      
      }
      /**
      * enterWholePds 
      *   This method is derived from 
  *   COBOL Paragraph - 32112-ENTER-WHOLE-PDS COBOL Cyclomatic complexity - 1
      * Input  :  

      * - pdsTag400                      COBOL Name: 400-PDS-TAG
      * - pdsLength400                   COBOL Name: 400-PDS-LENGTH
      * - k400                           COBOL Name: 400-K
      *
      * Output :  

      * - ip65504T                       COBOL Name: IP65504-T
      * - ip65504TagType                 COBOL Name: IP65504-TAG-TYPE
      * - ip65504TagNo                   COBOL Name: IP65504-TAG-NO
      * - pdsTag400                      COBOL Name: 400-PDS-TAG
      * - ip65504TagSubFldNo             COBOL Name: IP65504-TAG-SUB-FLD-NO
      * - ip65504TagLngth                COBOL Name: IP65504-TAG-LNGTH
      * - pdsLength400                   COBOL Name: 400-PDS-LENGTH
      * - ip65504TagStarts               COBOL Name: IP65504-TAG-STARTS
      *
      * @throws CFException
      */
      private void enterWholePds() throws Exception {
//  SET IP65504-T UP BY 1
          ip65504T++; 
          
//  PERFORM 32106-CHECK-TAG-LIMIT
          checkTagLimit();/*32106-CHECK-TAG-LIMIT*/
          if (this.isProgramEnded()) {
              return ;
          }

// *       Is there room in the tag table for this tag?

// *    Move the tag id to the tag table
//  MOVE 3 TO IP65504-TAG-TYPE ( IP65504-T )
          ip65504CurrentTagTable.getIp65504TagArea(ip65504T - 1).getIp65504TagId().setIp65504TagType((short)3);
//  MOVE 400-PDS-TAG TO IP65504-TAG-NO ( IP65504-T )
          ip65504CurrentTagTable.getIp65504TagArea(ip65504T - 1).getIp65504TagId().setIp65504TagNo(work.getPdsTag400());
//  PERFORM 32117-CHECK-PDS-LIMIT
          checkPdsLimit();/*32117-CHECK-PDS-LIMIT*/
          if (this.isProgramEnded()) {
              return ;
          }

// *       Is this pds number within the defined range?
//  MOVE ZERO TO IP65504-TAG-SUB-FLD-NO ( IP65504-T )
          ip65504CurrentTagTable.getIp65504TagArea(ip65504T - 1).setIp65504TagSubFldNo((short) 0);
//  MOVE 400-PDS-LENGTH TO IP65504-TAG-LNGTH ( IP65504-T )
          ip65504CurrentTagTable.getIp65504TagArea(ip65504T - 1).setIp65504TagLngth(work.getPdsLength400());
//  ADD 7 400-K GIVING IP65504-TAG-STARTS ( IP65504-T )
          ip65504CurrentTagTable.getIp65504TagArea(ip65504T - 1).setIp65504TagStarts( (short) ((short)7+work.getK400()));
      
      }
      /**
      * enterPdsSubfields 
      *   This method is derived from 
  *   COBOL Paragraph - 32113-ENTER-PDS-SUBFIELDS COBOL Cyclomatic complexity - 2
      * Input  :  

      * - pdsTag400                      COBOL Name: 400-PDS-TAG
      * - k400                           COBOL Name: 400-K
      * - pdsLength400                   COBOL Name: 400-PDS-LENGTH
      *
      * Output :  

      * - doesVarSubfExist100            COBOL Name: 100-DOES-VAR-SUBF-EXIST
      * - newType800                     COBOL Name: 800-NEW-TYPE
      * - newNo800                       COBOL Name: 800-NEW-NO
      * - pdsTag400                      COBOL Name: 400-PDS-TAG
      * - m400                           COBOL Name: 400-M
      * - k400                           COBOL Name: 400-K
      * - startOfNextElement800          COBOL Name: 800-START-OF-NEXT-ELEMENT
      * - ip65504P                       COBOL Name: IP65504-P
      * - ip65504T                       COBOL Name: IP65504-T
      * - ip65504PdsFirstSubfld          COBOL Name: IP65504-PDS-FIRST-SUBFLD
      *
      * @throws CFException
      */
      private void enterPdsSubfields() throws Exception {
          // MOVE 'N' TO 100-DOES-VAR-SUBF-EXIST
          //  LITERAL_N = 'N'
          work.setDoesVarSubfExist100(CONSTANTS.LITERAL_N);
//  MOVE 3 TO 800-NEW-TYPE
          newTag800.setNewType800((short)3);
//  MOVE 400-PDS-TAG TO 800-NEW-NO
          newTag800.setNewNo800(work.getPdsTag400());
//  MOVE 400-K TO 400-M
          work.setM400(work.getK400());
//  ADD 7 TO 400-M
          work.setM400( (short) (work.getM400()+(short)7));
//  ADD 400-PDS-LENGTH TO 400-M GIVING 800-START-OF-NEXT-ELEMENT
          work.setStartOfNextElement800( (short) (work.getM400()+work.getPdsLength400()));

// *    Link the pds-map entry to its first subfld in the tag table
//  SET IP65504-P TO 800-NEW-NO
          ip65504P = newTag800.getNewNo800(); 
          
//  SET IP65504-T UP BY 1
          ip65504T++; 
          
//  SET IP65504-PDS-FIRST-SUBFLD ( IP65504-P ) TO IP65504-T
          ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry(ip65504P - 1).setIp65504PdsFirstSubfld(IP65504_TAG_AREA_LENGTH * ( ((ip65504T < 1) ? 1:ip65504T) - 1)); 
          
//  SET IP65504-T DOWN BY 1
          ip65504T--; 
          
//  PERFORM 32114-DO-A-PDS-OCCURRENCE-GRP UNTIL 400-M >= 800-START-OF-NEXT-ELEMENT
          while (	( work.getM400() < work.getStartOfNextElement800() )) {
             doAPdsOccurrenceGrp();/*32114-DO-A-PDS-OCCURRENCE-GRP*/
             if (this.isProgramEnded()) {
                 return ;
             }
          }
          ;
      
      }
      /**
      * doAPdsOccurrenceGrp 
      *   This method is derived from 
  *   COBOL Paragraph - 32114-DO-A-PDS-OCCURRENCE-GRP COBOL Cyclomatic complexity - 12
      * Input  :  

      * - ip000804PdsFirstSubfld         COBOL Name: IP000804-PDS-FIRST-SUBFLD
      * - currentSubfld400               COBOL Name: 400-CURRENT-SUBFLD
      * - ip000804PdsSubflds             COBOL Name: IP000804-PDS-SUBFLDS
      * - ip000804I                      COBOL Name: IP000804-I
      * - m400                           COBOL Name: 400-M
      * - startOfNextElement800          COBOL Name: 800-START-OF-NEXT-ELEMENT
      * - ip000904PdsSubMinLngth         COBOL Name: IP000904-PDS-SUB-MIN-LNGTH
      * - ip000904PdsSubMaxLngth         COBOL Name: IP000904-PDS-SUB-MAX-LNGTH
      * - newTag800                      COBOL Name: 800-NEW-TAG
      * - doesVarSubfExist100            COBOL Name: 100-DOES-VAR-SUBF-EXIST
      * - pdsLength400                   COBOL Name: 400-PDS-LENGTH
      * - ip000804PdsMinLngth            COBOL Name: IP000804-PDS-MIN-LNGTH
      *
      * Output :  

      * - ip000904I                      COBOL Name: IP000904-I
      * - currentSubfld400               COBOL Name: 400-CURRENT-SUBFLD
      * - ip65504T                       COBOL Name: IP65504-T
      * - newSubfldNo800                 COBOL Name: 800-NEW-SUBFLD-NO
      * - newStart800                    COBOL Name: 800-NEW-START
      * - m400                           COBOL Name: 400-M
      * - newLength800                   COBOL Name: 800-NEW-LENGTH
      * - ip000904PdsSubMinLngth         COBOL Name: IP000904-PDS-SUB-MIN-LNGTH
      * - ip65504TagArea                 COBOL Name: IP65504-TAG-AREA
      * - newTag800                      COBOL Name: 800-NEW-TAG
      * - newStatus800                   COBOL Name: 800-NEW-STATUS
      *
      * @throws CFException
      */
      private void doAPdsOccurrenceGrp() throws Exception {
			// Declare local variables used in the method
			Ip000804PdsAttrTable ip000804PdsAttrTable = ip000804PdsAttributes.getIp000804PdsAttrTable();
			short currentSubfld400 = 0;
			short newLength800 = 0;
			short pdsLength400 = 0;
			short m400 = 0;
			short startOfNextElement800 = 0;
			// End of variable declaration


// *    Loop through all the defined subfields once, building a tag
// *    entry for each one
//  SET IP000904-I TO IP000804-PDS-FIRST-SUBFLD ( IP000804-I )
          ip000904I = (ip000804PdsAttributes.getIp000804PdsAttrTable().getIp000804PdsAttrRow(ip000804I - 1).getIp000804PdsFirstSubfld()/IP000904_PDS_SUB_ATTR_ROW_LENGTH) + 1 ; 
          
//  PERFORM VARYING 400-CURRENT-SUBFLD FROM 1 BY 1 UNTIL 400-CURRENT-SUBFLD > IP000804-PDS-SUBFLDS ( IP000804-I ) OR 400-M >= 800-START-OF-NEXT-ELEMENT
          for (work.setCurrentSubfld400(1); (	( work.getCurrentSubfld400() <= ip000804PdsAttrTable.getIp000804PdsAttrRow(ip000804I - 1).getIp000804PdsSubflds() ) && 	( work.getM400() < work.getStartOfNextElement800() )) ; work.setCurrentSubfld400(work.getCurrentSubfld400() + 1) ) {
//  SET IP65504-T UP BY 1
              ip65504T++; 
              

// *       Count this tag-table entry
//  PERFORM 32106-CHECK-TAG-LIMIT
              checkTagLimit();/*32106-CHECK-TAG-LIMIT*/
              if (this.isProgramEnded()) {
                  return ;
              }
//  MOVE 400-CURRENT-SUBFLD TO 800-NEW-SUBFLD-NO
              newTag800.setNewSubfldNo800(work.getCurrentSubfld400());
//  MOVE 400-M TO 800-NEW-START
              newTag800.setNewStart800(work.getM400());
//  IF IP000904-PDS-SUB-MIN-LNGTH ( IP000904-I ) LESS THAN IP000904-PDS-SUB-MAX-LNGTH ( IP000904-I )
              if (	( ip000904PdsSubAttrTable.getIp000904PdsSubAttrRow(ip000904I - 1).getIp000904PdsSubMinLngth() < ip000904PdsSubAttrTable.getIp000904PdsSubAttrRow(ip000904I - 1).getIp000904PdsSubMaxLngth() )) { 

// *          Variable-length subfield; must be delimited by "\"
// *          unless they are the last in the element
                  currentSubfld400 = work.getCurrentSubfld400();
//  IF 400-CURRENT-SUBFLD < IP000804-PDS-SUBFLDS ( IP000804-I )
                  if (	( currentSubfld400 < ip000804PdsAttrTable.getIp000804PdsAttrRow(ip000804I - 1).getIp000804PdsSubflds() )) { 
//  PERFORM 32115-DO-DELIMITED-PDS-SUBFLD
                      doDelimitedPdsSubfld();/*32115-DO-DELIMITED-PDS-SUBFLD*/
                      if (this.isProgramEnded()) {
                          return ;
                      }
                  }
  
//  ELSE
                  else { 
//  SUBTRACT 400-M FROM 800-START-OF-NEXT-ELEMENT GIVING 800-NEW-LENGTH
                      newTag800.setNewLength800( (short) (work.getStartOfNextElement800()-work.getM400()));
//  ADD 800-NEW-LENGTH TO 400-M
                      work.setM400( (short) (work.getM400()+newTag800.getNewLength800()));
                  }
              }
//  ELSE
              else { 

// *          Fixed-length subfield
// *          we'll use the shorter of the t7 length and the
// *          remaining length in the data element.
//  SUBTRACT 400-M FROM 800-START-OF-NEXT-ELEMENT GIVING 800-NEW-LENGTH
                  newTag800.setNewLength800( (short) (work.getStartOfNextElement800()-work.getM400()));
                  newLength800 = newTag800.getNewLength800();
//  IF 800-NEW-LENGTH > IP000904-PDS-SUB-MIN-LNGTH ( IP000904-I )
                  if (	( newLength800 > ip000904PdsSubAttrTable.getIp000904PdsSubAttrRow(ip000904I - 1).getIp000904PdsSubMinLngth() )) { 
//  MOVE IP000904-PDS-SUB-MIN-LNGTH ( IP000904-I ) TO 800-NEW-LENGTH
                      newTag800.setNewLength800(ip000904PdsSubAttrTable.getIp000904PdsSubAttrRow(ip000904I - 1).getIp000904PdsSubMinLngth());
                  }
  
//  ADD 800-NEW-LENGTH TO 400-M
                  work.setM400( (short) (work.getM400()+newTag800.getNewLength800()));
              }
//  MOVE 800-NEW-TAG TO IP65504-TAG-AREA ( IP65504-T )
              ip65504CurrentTagTable.setIp65504TagArea((ip65504T - 1),newTag800.getCharArray());
//  SET IP000904-I UP BY 1
              ip000904I++; 
              
              startOfNextElement800 = work.getStartOfNextElement800();
              m400 = work.getM400();
              currentSubfld400 = work.getCurrentSubfld400();
//  IF 400-M >= 800-START-OF-NEXT-ELEMENT AND 400-CURRENT-SUBFLD < IP000804-PDS-SUBFLDS ( IP000804-I )
              if (	( m400 >= startOfNextElement800 ) && 	( currentSubfld400 < ip000804PdsAttrTable.getIp000804PdsAttrRow(ip000804I - 1).getIp000804PdsSubflds() )) { 
                  pdsLength400 = work.getPdsLength400();
//  IF 88-100-VAR-SUBF-EXISTS OR 400-PDS-LENGTH < IP000804-PDS-MIN-LNGTH ( IP000804-I )
                  if ( work.isVarSubfExists88100()   || 	( pdsLength400 < ip000804PdsAttrTable.getIp000804PdsAttrRow(ip000804I - 1).getIp000804PdsMinLngth() )) { 
//  ADD 1 TO 400-CURRENT-SUBFLD
                      work.setCurrentSubfld400( (short) (work.getCurrentSubfld400()+(short)1));
//  ADD 800-NEW-LENGTH TO 800-NEW-START GIVING 800-NEW-START
                      newTag800.setNewStart800( (short) (newTag800.getNewStart800()+newTag800.getNewLength800()));
//  MOVE ZERO TO 800-NEW-LENGTH
                      newTag800.setNewLength800((short) 0);
//  MOVE SPACE TO 800-NEW-STATUS
                      newTag800.setNewStatus800(CONSTANTS.SPACE);
//  PERFORM UNTIL 400-CURRENT-SUBFLD > IP000804-PDS-SUBFLDS ( IP000804-I )
                      while ((	( work.getCurrentSubfld400() <= ip000804PdsAttrTable.getIp000804PdsAttrRow(ip000804I - 1).getIp000804PdsSubflds() ))) {
//  MOVE 400-CURRENT-SUBFLD TO 800-NEW-SUBFLD-NO
                          newTag800.setNewSubfldNo800(work.getCurrentSubfld400());
//  SET IP65504-T UP BY 1
                          ip65504T++; 
                          
//  MOVE 800-NEW-TAG TO IP65504-TAG-AREA ( IP65504-T )
                          ip65504CurrentTagTable.setIp65504TagArea((ip65504T - 1),newTag800.getCharArray());
//  SET IP000904-I UP BY 1
                          ip000904I++; 
                          
//  ADD 1 TO 400-CURRENT-SUBFLD
                          work.setCurrentSubfld400( (short) (work.getCurrentSubfld400()+(short)1));
                      }
  
                  }
  
              }
  
          }
  
      
      }
      /**
      * doDelimitedPdsSubfld 
      *   This method is derived from 
  *   COBOL Paragraph - 32115-DO-DELIMITED-PDS-SUBFLD COBOL Cyclomatic complexity - 5
      * Input  :  

      * - subfldLength400                COBOL Name: 400-SUBFLD-LENGTH
      * - ip000904PdsSubMaxLngth         COBOL Name: IP000904-PDS-SUB-MAX-LNGTH
      * - ip000904I                      COBOL Name: IP000904-I
      * - ip66102IpmMsg                  COBOL Name: IP66102-IPM-MSG
      * - m400                           COBOL Name: 400-M
      * - noBackslashCode600             COBOL Name: 600-NO-BACKSLASH-CODE
      * - noBackslashNdx600              COBOL Name: 600-NO-BACKSLASH-NDX
      * - noBackslash600                 COBOL Name: 600-NO-BACKSLASH
      * - newType800                     COBOL Name: 800-NEW-TYPE
      * - newNo800                       COBOL Name: 800-NEW-NO
      * - newStart800                    COBOL Name: 800-NEW-START
      *
      * Output :  

      * - doesVarSubfExist100            COBOL Name: 100-DOES-VAR-SUBF-EXIST
      * - subfldLength400                COBOL Name: 400-SUBFLD-LENGTH
      * - m400                           COBOL Name: 400-M
      * - newLength800                   COBOL Name: 800-NEW-LENGTH
      * - errorCode600                   COBOL Name: 600-ERROR-CODE
      * - ip65504MessageStatus           COBOL Name: IP65504-MESSAGE-STATUS
      * - noBackslashCode600             COBOL Name: 600-NO-BACKSLASH-CODE
      * - ip662011ErrSubscript           COBOL Name: IP662011-ERR-SUBSCRIPT
      * - noBackslashNdx600              COBOL Name: 600-NO-BACKSLASH-NDX
      * - ipmErrorText600                COBOL Name: 600-IPM-ERROR-TEXT
      * - noBackslash600                 COBOL Name: 600-NO-BACKSLASH
      * - j400                           COBOL Name: 400-J
      * - ipmErrorPointerWidth600        COBOL Name: 600-IPM-ERROR-POINTER-WIDTH
      * - ip000904PdsSubMaxLngth         COBOL Name: IP000904-PDS-SUB-MAX-LNGTH
      * - ip65504T                       COBOL Name: IP65504-T
      * - ip65504TagType                 COBOL Name: IP65504-TAG-TYPE
      * - newType800                     COBOL Name: 800-NEW-TYPE
      * - ip65504TagNo                   COBOL Name: IP65504-TAG-NO
      * - newNo800                       COBOL Name: 800-NEW-NO
      * - ip65504TagStarts               COBOL Name: IP65504-TAG-STARTS
      * - newStart800                    COBOL Name: 800-NEW-START
      *
      * @throws CFException
      */
      private void doDelimitedPdsSubfld() throws Exception {
//  SET 88-100-VAR-SUBF-EXISTS TO TRUE
          work.setVarSubfExists88100True(); 
          
//  PERFORM VARYING 400-SUBFLD-LENGTH FROM 0 BY 1 UNTIL 400-SUBFLD-LENGTH > IP000904-PDS-SUB-MAX-LNGTH ( IP000904-I ) OR IP66102-IPM-MSG ( 400-M : 1) = '\'
          for (work.setSubfldLength400(0); (	( work.getSubfldLength400() <= ip000904PdsSubAttrTable.getIp000904PdsSubAttrRow(ip000904I - 1).getIp000904PdsSubMaxLngth() ) && work.getM400() > 0 && ip66102IpmMsg.toCharArray()[getIndex(work.getM400())] != '\\') ; work.setSubfldLength400(work.getSubfldLength400() + 1) ) {
//  ADD 1 TO 400-M
              work.setM400( (short) (work.getM400()+(short)1));
          }
//  IF IP66102-IPM-MSG ( 400-M : 1) = '\'
          if (work.getM400() > 0 && ip66102IpmMsg.toCharArray()[getIndex(work.getM400())] == '\\') { 
//  MOVE 400-SUBFLD-LENGTH TO 800-NEW-LENGTH
              newTag800.setNewLength800(work.getSubfldLength400());
//  ADD 1 TO 400-M
              work.setM400( (short) (work.getM400()+(short)1));
          }

// *          Skip over the slash
//  ELSE
          else { 
//  MOVE 600-NO-BACKSLASH-CODE TO 600-ERROR-CODE IP65504-MESSAGE-STATUS
              ipmErrorMsg600.setErrorCode600( work.getNoBackslashCode600());
              ip65504MessageStatusGroup.setIp65504MessageStatus((short) work.getNoBackslashCode600());
//  MOVE 600-NO-BACKSLASH-NDX TO IP662011-ERR-SUBSCRIPT
              ip662011ErrSubscriptGroup.setIp662011ErrSubscript(work.getNoBackslashNdx600());
//  MOVE 600-NO-BACKSLASH TO 600-IPM-ERROR-TEXT
              ipmErrorMsg600.setIpmErrorText600(pad(64,work.getNoBackslash600(),SPACE_CHAR,RIGHT_PAD));
//  SUBTRACT 400-SUBFLD-LENGTH FROM 400-M
              work.setM400( (short) (work.getM400()-work.getSubfldLength400()));
//  MOVE 400-M TO 400-J
              work.setJ400(work.getM400());
//  MOVE IP000904-PDS-SUB-MAX-LNGTH ( IP000904-I ) TO 600-IPM-ERROR-POINTER-WIDTH
              work.setIpmErrorPointerWidth600(ip000904PdsSubAttrTable.getIp000904PdsSubAttrRow(ip000904I - 1).getIp000904PdsSubMaxLngth());
//  SET IP65504-T UP BY 1
              ip65504T++; 
              
//  MOVE 800-NEW-TYPE TO IP65504-TAG-TYPE ( IP65504-T )
              ip65504CurrentTagTable.getIp65504TagArea(ip65504T - 1).getIp65504TagId().setIp65504TagType(newTag800.getNewType800());
//  MOVE 800-NEW-NO TO IP65504-TAG-NO ( IP65504-T )
              ip65504CurrentTagTable.getIp65504TagArea(ip65504T - 1).getIp65504TagId().setIp65504TagNo(newTag800.getNewNo800());
//  MOVE 800-NEW-START TO IP65504-TAG-STARTS ( IP65504-T )
              ip65504CurrentTagTable.getIp65504TagArea(ip65504T - 1).setIp65504TagStarts(newTag800.getNewStart800());
//  PERFORM 81000-PROCESS-BAD-MESSAGE
              processBadMessage();/*81000-PROCESS-BAD-MESSAGE*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
      
      }
      /**
      * handleBadPdsId 
      *   This method is derived from 
  *   COBOL Paragraph - 32116-HANDLE-BAD-PDS-ID COBOL Cyclomatic complexity - 4
      * Input  :  

      * - ip66102IpmMsg                  COBOL Name: IP66102-IPM-MSG
      * - j400                           COBOL Name: 400-J
      *
      * Output :  

      * - ipmErrorPointerWidth600        COBOL Name: 600-IPM-ERROR-POINTER-WIDTH
      * - ipmErrorElementId600           COBOL Name: 600-IPM-ERROR-ELEMENT-ID
      * - ip65504TagType                 COBOL Name: IP65504-TAG-TYPE
      * - ip65504TagNo                   COBOL Name: IP65504-TAG-NO
      * - ip66102IpmMsg                  COBOL Name: IP66102-IPM-MSG
      * - ip65504TagStarts               COBOL Name: IP65504-TAG-STARTS
      * - ip65504TagLngth                COBOL Name: IP65504-TAG-LNGTH
      *
      * @throws CFException
      */
      private void handleBadPdsId() throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			// End of variable declaration

          // MOVE 4 TO 600-IPM-ERROR-POINTER-WIDTH
          work.setIpmErrorPointerWidth600((short)4);
//  STRING 'P' IP66102-IPM-MSG ( 400-J : 4) DELIMITED BY SIZE INTO 600-IPM-ERROR-ELEMENT-ID
          charArray = new ArrayList<char[]>();
             charArray.add(CONSTANTS.LITERAL_P);
             charArray.add(substring(ip66102IpmMsg.getCharArray(),(work.getJ400()-1), (work.getJ400() + 3) ));
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
          updated = updateString(ipmErrorMsg600.getIpmErrorElementId600().toCharArray() ,joinCharArray);
          ipmErrorMsg600.getIpmErrorElementId600().setString(  (char[])updated.get("string"));
//  MOVE '3' TO IP65504-TAG-TYPE ( IP65504-T )
          ip65504CurrentTagTable.getIp65504TagArea(ip65504T - 1).getIp65504TagId().setIp65504TagType((short)3);

// ****************  Rel 5.1 change begin   ****************
//  IF IP66102-IPM-MSG ( 400-J : 4) IS NUMERIC
          if (    isNumeric(substring(ip66102IpmMsg.getCharArray(),(work.getJ400()-1), (work.getJ400() + 3) ))) { 
//  MOVE IP66102-IPM-MSG ( 400-J : 4) TO IP65504-TAG-NO ( IP65504-T )
              ip65504CurrentTagTable.getIp65504TagArea(ip65504T - 1).getIp65504TagId().setIp65504TagNo(CFUtil.getShort(substring(ip66102IpmMsg.getCharArray(),(work.getJ400()-1), (work.getJ400() + 3) )));
          }

// ****************  Rel 5.1 change end     ****************
//  ADD 7 TO 400-J GIVING IP65504-TAG-STARTS ( IP65504-T )
          ip65504CurrentTagTable.getIp65504TagArea(ip65504T - 1).setIp65504TagStarts( (short) (work.getJ400()+(short)7));
//  IF IP66102-IPM-MSG ( 400-J + 4 : 3) IS NUMERIC
          if (    isNumeric(substring(ip66102IpmMsg.getCharArray(),(work.getJ400() + 4-1), (work.getJ400() + 4 + 2) ))) { 
//  MOVE IP66102-IPM-MSG ( 400-J + 4 : 3) TO IP65504-TAG-LNGTH ( IP65504-T )
              ip65504CurrentTagTable.getIp65504TagArea(ip65504T - 1).setIp65504TagLngth(CFUtil.getShort(substring(ip66102IpmMsg.getCharArray(),(work.getJ400() + 4-1), (work.getJ400() + 4 + 2) )));
          }
//  PERFORM 81000-PROCESS-BAD-MESSAGE
          processBadMessage();/*81000-PROCESS-BAD-MESSAGE*/
          if (this.isProgramEnded()) {
              return ;
          }
          ;
      
      }
      /**
      * checkPdsLimit 
      *   This method is derived from 
  *   COBOL Paragraph - 32117-CHECK-PDS-LIMIT COBOL Cyclomatic complexity - 2
      * Input  :  

      * - pdsTag400                      COBOL Name: 400-PDS-TAG
      * - maxPdsNo800                    COBOL Name: 800-MAX-PDS-NO
      * - undefinedPdsCode600            COBOL Name: 600-UNDEFINED-PDS-CODE
      * - undefinedPds600                COBOL Name: 600-UNDEFINED-PDS
      * - k400                           COBOL Name: 400-K
      *
      * Output :  

      * - errorCode600                   COBOL Name: 600-ERROR-CODE
      * - ip65504MessageStatus           COBOL Name: IP65504-MESSAGE-STATUS
      * - undefinedPdsCode600            COBOL Name: 600-UNDEFINED-PDS-CODE
      * - tagNo600                       COBOL Name: 600-TAG-NO
      * - pdsTag400                      COBOL Name: 400-PDS-TAG
      * - undefinedPdsNo600              COBOL Name: 600-UNDEFINED-PDS-NO
      * - ipmErrorText600                COBOL Name: 600-IPM-ERROR-TEXT
      * - undefinedPds600                COBOL Name: 600-UNDEFINED-PDS
      * - j400                           COBOL Name: 400-J
      * - k400                           COBOL Name: 400-K
      *
      * @throws CFException
      */
      private void checkPdsLimit() throws Exception {
			// Declare local variables used in the method
			short pdsTag400 = 0;
			short maxPdsNo800 = 0;
			// End of variable declaration

          maxPdsNo800 = work.getMaxPdsNo800();
          pdsTag400 = work.getPdsTag400();
//  IF 400-PDS-TAG GREATER THAN 800-MAX-PDS-NO
          if (	( pdsTag400 > maxPdsNo800 )) { 
//  MOVE 600-UNDEFINED-PDS-CODE TO 600-ERROR-CODE IP65504-MESSAGE-STATUS
              ipmErrorMsg600.setErrorCode600( work.getUndefinedPdsCode600());
              ip65504MessageStatusGroup.setIp65504MessageStatus((short) work.getUndefinedPdsCode600());
//  MOVE 400-PDS-TAG TO 600-TAG-NO
//  FORMAT_1059277505 = "ZZZ9"
              work.setTagNo600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(work.getPdsTag400()).toCharArray()));
//  MOVE 600-TAG-NO TO 600-UNDEFINED-PDS-NO
              undefinedPds600.setUndefinedPdsNo600(CFUtil.getInt(work.getTagNo600()));
              // MOVE 600-UNDEFINED-PDS TO 600-IPM-ERROR-TEXT
              ipmErrorMsg600.setIpmErrorText600(undefinedPds600.toCharArray());
//  MOVE 400-K TO 400-J
              work.setJ400(work.getK400());

// *           Point 400-j to the error
//  PERFORM 32116-HANDLE-BAD-PDS-ID
              handleBadPdsId();/*32116-HANDLE-BAD-PDS-ID*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
  
      
      }
      /**
      * handleShortCarrier 
      *   This method is derived from 
  *   COBOL Paragraph - 32119-HANDLE-SHORT-CARRIER COBOL Cyclomatic complexity - 2
      * Input  :  

      * - carrierShortRow600             COBOL Name: 600-CARRIER-SHORT-ROW
      * - i400                           COBOL Name: 400-I
      * - carrierTooShortDe600           COBOL Name: 600-CARRIER-TOO-SHORT-DE
      * - carrierTooShortCode600         COBOL Name: 600-CARRIER-TOO-SHORT-CODE
      * - carrierTooShortNdx600          COBOL Name: 600-CARRIER-TOO-SHORT-NDX
      * - carrierTooShort600             COBOL Name: 600-CARRIER-TOO-SHORT
      * - ip65504DeStart                 COBOL Name: IP65504-DE-START
      *
      * Output :  

      * - carrierShortCodeNdx600         COBOL Name: 600-CARRIER-SHORT-CODE-NDX
      * - errorCode600                   COBOL Name: 600-ERROR-CODE
      * - ip65504MessageStatus           COBOL Name: IP65504-MESSAGE-STATUS
      * - carrierTooShortCode600         COBOL Name: 600-CARRIER-TOO-SHORT-CODE
      * - ip662011ErrSubscript           COBOL Name: IP662011-ERR-SUBSCRIPT
      * - carrierTooShortNdx600          COBOL Name: 600-CARRIER-TOO-SHORT-NDX
      * - ipmErrorText600                COBOL Name: 600-IPM-ERROR-TEXT
      * - carrierTooShort600             COBOL Name: 600-CARRIER-TOO-SHORT
      * - ipmErrorPointerWidth600        COBOL Name: 600-IPM-ERROR-POINTER-WIDTH
      * - ipmErrorElementType600         COBOL Name: 600-IPM-ERROR-ELEMENT-TYPE
      * - ipmErrorElementNo600           COBOL Name: 600-IPM-ERROR-ELEMENT-NO
      * - i400                           COBOL Name: 400-I
      * - j400                           COBOL Name: 400-J
      *
      * @throws CFException
      */
      private void handleShortCarrier() throws Exception {
			// Declare local variables used in the method
			boolean keepSearching = true;
			short i400 = 0;
			IpmErrorElementId600 ipmErrorElementId600 = ipmErrorMsg600.getIpmErrorElementId600();
			// End of variable declaration

//  SET 600-CARRIER-SHORT-CODE-NDX TO 1
          carrierShortCodeNdx600 = 1; 
          
          i400 = work.getI400();
//  SEARCH 600-CARRIER-SHORT-ROW
          keepSearching = true;
          while(keepSearching) {
          	if  (	( i400 == carrierTooShortValuesGroup600.getCarrierTooShortCodes600().getCarrierShortRow600(carrierShortCodeNdx600 - 1).getCarrierTooShortDe600() )) { 
//  MOVE 600-CARRIER-TOO-SHORT-CODE ( 600-CARRIER-SHORT-CODE-NDX ) TO 600-ERROR-CODE IP65504-MESSAGE-STATUS
              ipmErrorMsg600.setErrorCode600( carrierTooShortValuesGroup600.getCarrierTooShortCodes600().getCarrierShortRow600(carrierShortCodeNdx600 - 1).getCarrierTooShortCode600());
              ip65504MessageStatusGroup.setIp65504MessageStatus(carrierTooShortValuesGroup600.getCarrierTooShortCodes600().getCarrierShortRow600(carrierShortCodeNdx600 - 1).getCarrierTooShortCode600());
          	break;
          	}
          	carrierShortCodeNdx600++;
          	if (carrierShortCodeNdx600 > 5) { 
          	 keepSearching = false;
          	}
          }
  
//  MOVE 600-CARRIER-TOO-SHORT-NDX TO IP662011-ERR-SUBSCRIPT
          ip662011ErrSubscriptGroup.setIp662011ErrSubscript(work.getCarrierTooShortNdx600());
//  MOVE 600-CARRIER-TOO-SHORT TO 600-IPM-ERROR-TEXT
          ipmErrorMsg600.setIpmErrorText600(pad(64,work.getCarrierTooShort600(),SPACE_CHAR,RIGHT_PAD));
          // MOVE 3 TO 600-IPM-ERROR-POINTER-WIDTH
          work.setIpmErrorPointerWidth600((short)3);
//  MOVE 'D' TO 600-IPM-ERROR-ELEMENT-TYPE
//  LITERAL_D = 'D'
          ipmErrorElementId600.setIpmErrorElementType600(CONSTANTS.LITERAL_D);
  
//  MOVE 400-I TO 600-IPM-ERROR-ELEMENT-NO
          ipmErrorElementId600.setIpmErrorElementNo600(work.getI400());
  
//  SUBTRACT 3 FROM IP65504-DE-START ( 400-I ) GIVING 400-J
          work.setJ400( (short) (ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(work.getI400() - 1).getIp65504DeStart()-(short)3));

// *                      This points to the bad length in the msg
//  PERFORM 81000-PROCESS-BAD-MESSAGE
          processBadMessage();/*81000-PROCESS-BAD-MESSAGE*/
          if (this.isProgramEnded()) {
              return ;
          }
          ;
      
      }
      /**
      * parseViaTagTable 
      *   This method is derived from 
  *   COBOL Paragraph - 40000-PARSE-VIA-TAG-TABLE COBOL Cyclomatic complexity - 5
      * Input  :  

      * - ip66102IpmMsgLngth             COBOL Name: IP66102-IPM-MSG-LNGTH
      * - ip66102TagStart                COBOL Name: IP66102-TAG-START
      * - ip66102IpmMsg                  COBOL Name: IP66102-IPM-MSG
      * - isAMapEntryPending100          COBOL Name: 100-IS-A-MAP-ENTRY-PENDING
      * - lastSubfldNo800                COBOL Name: 800-LAST-SUBFLD-NO
      *
      * Output :  

      * - tagTableLength400              COBOL Name: 400-TAG-TABLE-LENGTH
      * - ip65504Tcnt                    COBOL Name: IP65504-TCNT
      * - ip65504CurrentTagTable         COBOL Name: IP65504-CURRENT-TAG-TABLE
      * - ip66102IpmMsg                  COBOL Name: IP66102-IPM-MSG
      * - ip65504TaggedRecordInfo        COBOL Name: IP65504-TAGGED-RECORD-INFO
      * - ip65504T                       COBOL Name: IP65504-T
      * - ip65504Max500                  COBOL Name: 500-IP65504-MAX
      *
      * @throws CFException
      */
      private void parseViaTagTable() throws Exception {
			// Declare local variables used in the method
			Ip66102NormalIpmMsgRedefined ip66102NormalIpmMsgRedefined = ip66102IpmMsg.getIp66102NormalIpmMsgRedefined();
			short lastSubfldNo800 = 0;
			// End of variable declaration

          work.setTagTableLength400((short) (ip66102IpmFileInformation.getIp66102IpmMsgLngth() - ip66102IpmMsg.getIp66102NormalIpmMsgRedefined().getIp66102TagStart() + 1));

// *    Determine how many entries are in the tag-table.
//  DIVIDE 400-TAG-TABLE-LENGTH BY LENGTH OF IP65504-TAG-AREA (1) GIVING IP65504-TCNT
          ip65504TcntGroup.setIp65504Tcnt( (short) (work.getTagTableLength400()/Ip65504TagArea.getIp65504TagAreaFieldLength()));

// *    Put the appended tag table into place as current-tag-table
//  MOVE IP66102-IPM-MSG ( IP66102-TAG-START : 400-TAG-TABLE-LENGTH ) TO IP65504-CURRENT-TAG-TABLE
          ip65504CurrentTagTable.setString(substring(ip66102IpmMsg.getCharArray(),((int) ip66102IpmMsg.getIp66102NormalIpmMsgRedefined().getIp66102TagStart()-1), (work.getTagTableLength400() + ((int) ip66102IpmMsg.getIp66102NormalIpmMsgRedefined().getIp66102TagStart() - 1)) ));

// *    Save the control info to allow users to determine whether
// *    the file was tagged.
//  MOVE IP66102-IPM-MSG (1 : 5) TO IP65504-TAGGED-RECORD-INFO
          ip65504TaggedRecordInfo.setString(substring(ip66102IpmMsg.getCharArray(),0,5));
//  PERFORM 40005-MOVE-MSG-TO-STD-AREA
          moveMsgToStdArea();/*40005-MOVE-MSG-TO-STD-AREA*/
//  PERFORM 50000-EXPAND-THE-BIT-MAP
          expandTheBitMap();/*50000-EXPAND-THE-BIT-MAP*/
//  SET IP65504-T TO IP65504-TCNT
          ip65504T = ip65504TcntGroup.getIp65504Tcnt(); 
          
//  SET 500-IP65504-MAX TO IP65504-T
          ip65504Max500 = IP65504_TAG_AREA_LENGTH * ( ((ip65504T < 1) ? 1:ip65504T) - 1); 
          
//  PERFORM 40010-PROCESS-A-TAG VARYING IP65504-T FROM 1 BY 1 UNTIL IP65504-T > 500-IP65504-MAX
          for (ip65504T = 1; 	( ip65504T <= ( ip65504Max500 / 11 ) + 1  ) ; ip65504T = ip65504T + 1 ) {
          	processATag();/*40010-PROCESS-A-TAG*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
          lastSubfldNo800 = lastSubfldTag800.getLastSubfldNo800();
//  IF 88-100-MAP-ENTRY-PENDING AND 800-LAST-SUBFLD-NO GREATER THAN ZERO
          if ( work.isMapEntryPending88100()   && 	( lastSubfldNo800 > 0 ) ) { 
//  PERFORM 40015-FINISH-PENDING-ENTRY
              finishPendingEntry();/*40015-FINISH-PENDING-ENTRY*/
          }
  
      
      }
      /**
      * moveMsgToStdArea 
      *   This method is derived from 
  *   COBOL Paragraph - 40005-MOVE-MSG-TO-STD-AREA COBOL Cyclomatic complexity - 1
      * Input  :  

      * - ip66102TagStart                COBOL Name: IP66102-TAG-START
      * - ip66102IpmMsg                  COBOL Name: IP66102-IPM-MSG
      *
      * Output :  

      * - ip66102IpmMsgLngth             COBOL Name: IP66102-IPM-MSG-LNGTH
      * - ip66102IpmMsg                  COBOL Name: IP66102-IPM-MSG
      *
      * @throws CFException
      */
      private void moveMsgToStdArea() throws Exception {
			// Declare local variables used in the method
			Ip66102NormalIpmMsgRedefined ip66102NormalIpmMsgRedefined = ip66102IpmMsg.getIp66102NormalIpmMsgRedefined();
			// End of variable declaration

          ip66102IpmFileInformation.setIp66102IpmMsgLngth((long)Math.abs(ip66102IpmMsg.getIp66102NormalIpmMsgRedefined().getIp66102TagStart() - 6));

// *    Move the message into the same position as if it had not
// *    been tagged.
//  MOVE IP66102-IPM-MSG (6 : IP66102-IPM-MSG-LNGTH ) TO IP66102-IPM-MSG (1 : IP66102-IPM-MSG-LNGTH )
          ip66102IpmMsg.replace(ip66102IpmMsg,5,(int) ip66102IpmFileInformation.getIp66102IpmMsgLngth(),0,(int) ip66102IpmFileInformation.getIp66102IpmMsgLngth() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
      
      }
      /**
      * processATag 
      *   This method is derived from 
  *   COBOL Paragraph - 40010-PROCESS-A-TAG COBOL Cyclomatic complexity - 9
      * Input  :  

      * - ip65504TagArea                 COBOL Name: IP65504-TAG-AREA
      * - isAMapEntryPending100          COBOL Name: 100-IS-A-MAP-ENTRY-PENDING
      * - lastSubId800                   COBOL Name: 800-LAST-SUB-ID
      * - invalidTagTypeCode600          COBOL Name: 600-INVALID-TAG-TYPE-CODE
      * - invalidTagTypeNdx600           COBOL Name: 600-INVALID-TAG-TYPE-NDX
      * - invalidTagType600              COBOL Name: 600-INVALID-TAG-TYPE
      *
      * Output :  

      * - currentTag800                  COBOL Name: 800-CURRENT-TAG
      * - ip65504TagArea                 COBOL Name: IP65504-TAG-AREA
      * - id800                          COBOL Name: 800-ID
      * - type800                        COBOL Name: 800-TYPE
      * - no800                          COBOL Name: 800-NO
      * - errorCode600                   COBOL Name: 600-ERROR-CODE
      * - ip65504MessageStatus           COBOL Name: IP65504-MESSAGE-STATUS
      * - invalidTagTypeCode600          COBOL Name: 600-INVALID-TAG-TYPE-CODE
      * - ip662011ErrSubscript           COBOL Name: IP662011-ERR-SUBSCRIPT
      * - invalidTagTypeNdx600           COBOL Name: 600-INVALID-TAG-TYPE-NDX
      * - ipmErrorText600                COBOL Name: 600-IPM-ERROR-TEXT
      * - invalidTagType600              COBOL Name: 600-INVALID-TAG-TYPE
      *
      * @throws CFException
      */
      private void processATag() throws Exception {
			// Declare local variables used in the method
			Id800 id800 = currentTag800.getId800();
			char[] lastSubId800 = null;
			// End of variable declaration

      
// *       Note:  this statement will produce a compiler warning
// *              about an "overlapping move".  ignore the warning
// *              message.
//  MOVE IP65504-TAG-AREA ( IP65504-T ) TO 800-CURRENT-TAG
          currentTag800.setString(ip65504CurrentTagTable.getIp65504TagArea(ip65504T - 1).toCharArray());
          lastSubId800 = lastSubfldTag800.getLastSubId800();
          id800 = currentTag800.getId800();
//  IF 88-100-MAP-ENTRY-PENDING AND 800-ID NOT EQUAL 800-LAST-SUB-ID
          if ( work.isMapEntryPending88100()   && 		compareChars(id800,lastSubId800) != 0 ) { 
//  PERFORM 40015-FINISH-PENDING-ENTRY
              finishPendingEntry();/*40015-FINISH-PENDING-ENTRY*/
          }
  
          id800 = currentTag800.getId800();
//  EVALUATE TRUE
          if  ( id800.isItsAPds800()  ) { 
//  PERFORM 40020-DO-PDS-TAG
              doPdsTag();/*40020-DO-PDS-TAG*/
          }
          else if  ( id800.isItsADataElement800()   &&  id800.isDeNoIsValid800()  ) { 
//  PERFORM 40030-DO-DE-TAG
              doDeTag();/*40030-DO-DE-TAG*/
          }
          else if  ( id800.isItsAnMti800()  ) { 
              ;
          }
          else if  ( id800.isTagHasBeenDeleted800()  ) { 
              ;
          }
          else   { 
//  MOVE 600-INVALID-TAG-TYPE-CODE TO 600-ERROR-CODE IP65504-MESSAGE-STATUS
              ipmErrorMsg600.setErrorCode600( work.getInvalidTagTypeCode600());
              ip65504MessageStatusGroup.setIp65504MessageStatus((short) work.getInvalidTagTypeCode600());
//  MOVE 600-INVALID-TAG-TYPE-NDX TO IP662011-ERR-SUBSCRIPT
              ip662011ErrSubscriptGroup.setIp662011ErrSubscript(work.getInvalidTagTypeNdx600());
//  MOVE 600-INVALID-TAG-TYPE TO 600-IPM-ERROR-TEXT
              ipmErrorMsg600.setIpmErrorText600(pad(64,work.getInvalidTagType600(),SPACE_CHAR,RIGHT_PAD));
//  PERFORM 43000-HANDLE-BAD-TAG
              handleBadTag();/*43000-HANDLE-BAD-TAG*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
  
      
      }
      /**
      * finishPendingEntry 
      *   This method is derived from 
  *   COBOL Paragraph - 40015-FINISH-PENDING-ENTRY COBOL Cyclomatic complexity - 2
      * Input  :  

      * - isAMapEntryPending100          COBOL Name: 100-IS-A-MAP-ENTRY-PENDING
      * - lastSubStart800                COBOL Name: 800-LAST-SUB-START
      * - ip65504PdsStart                COBOL Name: IP65504-PDS-START
      * - lastSubLngth800                COBOL Name: 800-LAST-SUB-LNGTH
      * - ip65504DeStart                 COBOL Name: IP65504-DE-START
      *
      * Output :  

      * - ip65504PdsLngth                COBOL Name: IP65504-PDS-LNGTH
      * - ip65504DeLngth                 COBOL Name: IP65504-DE-LNGTH
      * - isAMapEntryPending100          COBOL Name: 100-IS-A-MAP-ENTRY-PENDING
      *
      * @throws CFException
      */
      private void finishPendingEntry() throws Exception {

// *    We were working on subfield tags and have come to the
// *    tag table entry beyond the last subfield of that element
// *    so we'll post that pending element's length in the map.
//  IF 88-100-PDS-ENTRY-PENDING
          if ( work.isPdsEntryPending88100()  ) { 
              ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry(ip65504P - 1).setIp65504PdsLngth((short) (lastSubfldTag800.getLastSubStart800() - ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry(ip65504P - 1).getIp65504PdsStart() + lastSubfldTag800.getLastSubLngth800()));
          }
//  ELSE
          else { 
              ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(ip65504D - 1).setIp65504DeLngth((short) (lastSubfldTag800.getLastSubStart800() - ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(ip65504D - 1).getIp65504DeStart() + lastSubfldTag800.getLastSubLngth800()));
          }
//  SET 88-100-NO-MAP-ENTRY-PENDING TO TRUE
          work.setNoMapEntryPending88100True(); 
          
      
      }
      /**
      * doPdsTag 
      *   This method is derived from 
  *   COBOL Paragraph - 40020-DO-PDS-TAG COBOL Cyclomatic complexity - 5
      * Input  :  

      * - no800                          COBOL Name: 800-NO
      * - start800                       COBOL Name: 800-START
      * - length800                      COBOL Name: 800-LENGTH
      * - isAMapEntryPending100          COBOL Name: 100-IS-A-MAP-ENTRY-PENDING
      * - ip65504T                       COBOL Name: IP65504-T
      * - currentTag800                  COBOL Name: 800-CURRENT-TAG
      *
      * Output :  

      * - ip65504SelPdsEnt               COBOL Name: IP65504-SEL-PDS-ENT
      * - ip65504P                       COBOL Name: IP65504-P
      * - ip65504PdsMapEntry             COBOL Name: IP65504-PDS-MAP-ENTRY
      * - ip65504PdsStart                COBOL Name: IP65504-PDS-START
      * - start800                       COBOL Name: 800-START
      * - ip65504PdsLngth                COBOL Name: IP65504-PDS-LNGTH
      * - length800                      COBOL Name: 800-LENGTH
      * - ip65504PdsFirstSubfld          COBOL Name: IP65504-PDS-FIRST-SUBFLD
      * - isAMapEntryPending100          COBOL Name: 100-IS-A-MAP-ENTRY-PENDING
      * - lastSubfldTag800               COBOL Name: 800-LAST-SUBFLD-TAG
      * - currentTag800                  COBOL Name: 800-CURRENT-TAG
      *
      * @throws CFException
      */
      private void doPdsTag() throws Exception {
			// Declare local variables used in the method
			Id800 id800 = currentTag800.getId800();
			// End of variable declaration

//  EVALUATE 800-SUBFLD-NO
          switch(currentTag800.getSubfldNo800()){
          	case 0:

// *          We have a tag for an entire pds
//  MOVE 'X' TO IP65504-SEL-PDS-ENT ( 800-NO )
//  LITERAL_X = 'X', LITERAL_X = "X"
              ip65504SelPdsEntriesAll.setIp65504SelPdsEnt((currentTag800.getId800().getNo800() - 1),CONSTANTS.LITERAL_X);
//  SET IP65504-P TO 800-NO
              ip65504P = id800.getNo800(); 
              
  
//  MOVE HIGH-VALUES TO IP65504-PDS-MAP-ENTRY ( IP65504-P )
              ip65504PdsMapGroup.getIp65504PdsMap().setIp65504PdsMapEntry((ip65504P - 1),CONSTANTS.HIGH_VALUE_1986603393);

// *             This places a "null" value in the
// *             first-subfld index pointer of the map entry
//  MOVE 800-START TO IP65504-PDS-START ( IP65504-P )
              ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry(ip65504P - 1).setIp65504PdsStart(currentTag800.getStart800());
//  MOVE 800-LENGTH TO IP65504-PDS-LNGTH ( IP65504-P )
              ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry(ip65504P - 1).setIp65504PdsLngth(currentTag800.getLength800());
          break;
          	case 1:
//  IF 88-100-NO-MAP-ENTRY-PENDING
              if ( work.isNoMapEntryPending88100()  ) { 

// *             We have the first subfield tag
//  MOVE 'X' TO IP65504-SEL-PDS-ENT ( 800-NO )
//  LITERAL_X = 'X', LITERAL_X = "X"
                  ip65504SelPdsEntriesAll.setIp65504SelPdsEnt((currentTag800.getId800().getNo800() - 1),CONSTANTS.LITERAL_X);
//  SET IP65504-P TO 800-NO
                  ip65504P = id800.getNo800(); 
                  
  
//  SET IP65504-PDS-FIRST-SUBFLD ( IP65504-P ) TO IP65504-T
                  ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry(ip65504P - 1).setIp65504PdsFirstSubfld(IP65504_TAG_AREA_LENGTH * ( ((ip65504T < 1) ? 1:ip65504T) - 1)); 
                  
//  MOVE 800-START TO IP65504-PDS-START ( IP65504-P )
                  ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry(ip65504P - 1).setIp65504PdsStart(currentTag800.getStart800());
//  SET 88-100-PDS-ENTRY-PENDING TO TRUE
                  work.setPdsEntryPending88100True(); 
                  
              }
              // MOVE 800-CURRENT-TAG TO 800-LAST-SUBFLD-TAG
              lastSubfldTag800.setString(currentTag800.getCharArray());
          break;
          default :
              // MOVE 800-CURRENT-TAG TO 800-LAST-SUBFLD-TAG
              lastSubfldTag800.setString(currentTag800.getCharArray());
          }
      
      }
      /**
      * doDeTag 
      *   This method is derived from 
  *   COBOL Paragraph - 40030-DO-DE-TAG COBOL Cyclomatic complexity - 5
      * Input  :  

      * - no800                          COBOL Name: 800-NO
      * - start800                       COBOL Name: 800-START
      * - length800                      COBOL Name: 800-LENGTH
      * - isAMapEntryPending100          COBOL Name: 100-IS-A-MAP-ENTRY-PENDING
      * - ip65504T                       COBOL Name: IP65504-T
      * - currentTag800                  COBOL Name: 800-CURRENT-TAG
      *
      * Output :  

      * - ip65504SelElemEnt              COBOL Name: IP65504-SEL-ELEM-ENT
      * - ip65504D                       COBOL Name: IP65504-D
      * - ip65504DeMapEntry              COBOL Name: IP65504-DE-MAP-ENTRY
      * - ip65504DeStart                 COBOL Name: IP65504-DE-START
      * - start800                       COBOL Name: 800-START
      * - ip65504DeLngth                 COBOL Name: IP65504-DE-LNGTH
      * - length800                      COBOL Name: 800-LENGTH
      * - ip65504DeFirstSubfld           COBOL Name: IP65504-DE-FIRST-SUBFLD
      * - isAMapEntryPending100          COBOL Name: 100-IS-A-MAP-ENTRY-PENDING
      * - lastSubfldTag800               COBOL Name: 800-LAST-SUBFLD-TAG
      * - currentTag800                  COBOL Name: 800-CURRENT-TAG
      *
      * @throws CFException
      */
      private void doDeTag() throws Exception {
			// Declare local variables used in the method
			Id800 id800 = currentTag800.getId800();
			// End of variable declaration

//  EVALUATE 800-SUBFLD-NO
          switch(currentTag800.getSubfldNo800()){
          	case 0:

// *          We have a tag for an entire de
//  MOVE 'X' TO IP65504-SEL-ELEM-ENT ( 800-NO )
//  LITERAL_X = 'X', LITERAL_X = "X"
              ip65504SelElemEntriesAll.setIp65504SelElemEnt((currentTag800.getId800().getNo800() - 1),CONSTANTS.LITERAL_X);
//  SET IP65504-D TO 800-NO
              ip65504D = id800.getNo800(); 
              
  
//  MOVE HIGH-VALUES TO IP65504-DE-MAP-ENTRY ( IP65504-D )
              ip65504DeMapGroup.getIp65504DeMap().setIp65504DeMapEntry((ip65504D - 1),CONSTANTS.HIGH_VALUE_1986603393);

// *             This places a "null" value in the
// *             first-subfld index pointer of the map entry
//  MOVE 800-START TO IP65504-DE-START ( IP65504-D )
              ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(ip65504D - 1).setIp65504DeStart(currentTag800.getStart800());
//  MOVE 800-LENGTH TO IP65504-DE-LNGTH ( IP65504-D )
              ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(ip65504D - 1).setIp65504DeLngth(currentTag800.getLength800());
          break;
          	case 1:
//  IF 88-100-NO-MAP-ENTRY-PENDING
              if ( work.isNoMapEntryPending88100()  ) { 

// *             We have the first subfield tag
//  MOVE 'X' TO IP65504-SEL-ELEM-ENT ( 800-NO )
//  LITERAL_X = 'X', LITERAL_X = "X"
                  ip65504SelElemEntriesAll.setIp65504SelElemEnt((currentTag800.getId800().getNo800() - 1),CONSTANTS.LITERAL_X);
//  SET IP65504-D TO 800-NO
                  ip65504D = id800.getNo800(); 
                  
  
//  SET IP65504-DE-FIRST-SUBFLD ( IP65504-D ) TO IP65504-T
                  ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(ip65504D - 1).setIp65504DeFirstSubfld(IP65504_TAG_AREA_LENGTH * ( ((ip65504T < 1) ? 1:ip65504T) - 1)); 
                  
//  MOVE 800-START TO IP65504-DE-START ( IP65504-D )
                  ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(ip65504D - 1).setIp65504DeStart(currentTag800.getStart800());
//  SET 88-100-DE-ENTRY-PENDING TO TRUE
                  work.setDeEntryPending88100True(); 
                  
              }
              // MOVE 800-CURRENT-TAG TO 800-LAST-SUBFLD-TAG
              lastSubfldTag800.setString(currentTag800.getCharArray());
          break;
          default :
              // MOVE 800-CURRENT-TAG TO 800-LAST-SUBFLD-TAG
              lastSubfldTag800.setString(currentTag800.getCharArray());
          }
      
      }
      /**
      * handleBadTag 
      *   This method is derived from 
  *   COBOL Paragraph - 43000-HANDLE-BAD-TAG COBOL Cyclomatic complexity - 1
      * Input  :  

      * - ip65504CurrentTagTable         COBOL Name: IP65504-CURRENT-TAG-TABLE
      * - ip66102IpmMsgLngth             COBOL Name: IP66102-IPM-MSG-LNGTH
      * - i400                           COBOL Name: 400-I
      * - tagTableLength400              COBOL Name: 400-TAG-TABLE-LENGTH
      *
      * Output :  

      * - ipmErrorElementId600           COBOL Name: 600-IPM-ERROR-ELEMENT-ID
      * - ip66102IpmMsg                  COBOL Name: IP66102-IPM-MSG
      * - ip65504CurrentTagTable         COBOL Name: IP65504-CURRENT-TAG-TABLE
      * - j400                           COBOL Name: 400-J
      * - ipmErrorPointerWidth600        COBOL Name: 600-IPM-ERROR-POINTER-WIDTH
      * - ip66102IpmMsgLngth             COBOL Name: IP66102-IPM-MSG-LNGTH
      *
      * @throws CFException
      */
      private void handleBadTag() throws Exception {
          // MOVE 'TAGS' TO 600-IPM-ERROR-ELEMENT-ID
          ipmErrorMsg600.getIpmErrorElementId600().setString(CONSTANTS.LITERAL_TAGS_B_);

// *    Append tag-table to ipm message
//  MOVE IP65504-CURRENT-TAG-TABLE (1 : 400-TAG-TABLE-LENGTH ) TO IP66102-IPM-MSG ( IP66102-IPM-MSG-LNGTH + 1 : 400-TAG-TABLE-LENGTH )
          ip66102IpmMsg.replace(ip65504CurrentTagTable,0,work.getTagTableLength400(),((int) (ip66102IpmFileInformation.getIp66102IpmMsgLngth() + 1)-1),work.getTagTableLength400() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
          work.setJ400((short) (ip66102IpmFileInformation.getIp66102IpmMsgLngth() +  (  ( work.getI400() - 1 )  * Ip65504TagArea.getIp65504TagAreaFieldLength() )  + 1));
          // MOVE 5 TO 600-IPM-ERROR-POINTER-WIDTH
          work.setIpmErrorPointerWidth600((short)5);
//  ADD 400-TAG-TABLE-LENGTH TO IP66102-IPM-MSG-LNGTH
          ip66102IpmFileInformation.setIp66102IpmMsgLngth(ip66102IpmFileInformation.getIp66102IpmMsgLngth()+(short) work.getTagTableLength400());
//  PERFORM 81000-PROCESS-BAD-MESSAGE
          processBadMessage();/*81000-PROCESS-BAD-MESSAGE*/
          if (this.isProgramEnded()) {
              return ;
          }
          ;
      
      }
      /**
      * expandTheBitMap 
      *   This method is derived from 
  *   COBOL Paragraph - 50000-EXPAND-THE-BIT-MAP COBOL Cyclomatic complexity - 1
      * Input  :  

      * - ip66102BitByte1                COBOL Name: IP66102-BIT-BYTE-1
      * - parsingPattern500              COBOL Name: 500-PARSING-PATTERN
      * - ip66102BitByte2                COBOL Name: IP66102-BIT-BYTE-2
      * - ip66102BitByte3                COBOL Name: IP66102-BIT-BYTE-3
      * - ip66102BitByte4                COBOL Name: IP66102-BIT-BYTE-4
      * - ip66102BitByte5                COBOL Name: IP66102-BIT-BYTE-5
      * - ip66102BitByte6                COBOL Name: IP66102-BIT-BYTE-6
      * - ip66102BitByte7                COBOL Name: IP66102-BIT-BYTE-7
      * - ip66102BitByte8                COBOL Name: IP66102-BIT-BYTE-8
      * - ip66102BitByte9                COBOL Name: IP66102-BIT-BYTE-9
      * - ip66102BitByte10               COBOL Name: IP66102-BIT-BYTE-10
      * - ip66102BitByte11               COBOL Name: IP66102-BIT-BYTE-11
      * - ip66102BitByte12               COBOL Name: IP66102-BIT-BYTE-12
      * - ip66102BitByte13               COBOL Name: IP66102-BIT-BYTE-13
      * - ip66102BitByte14               COBOL Name: IP66102-BIT-BYTE-14
      * - ip66102BitByte15               COBOL Name: IP66102-BIT-BYTE-15
      * - ip66102BitByte16               COBOL Name: IP66102-BIT-BYTE-16
      *
      * Output :  

      * - pX400                          COBOL Name: 400-P-X
      * - ip66102BitByte1                COBOL Name: IP66102-BIT-BYTE-1
      * - ip65504SelElemEntriesAll       COBOL Name: IP65504-SEL-ELEM-ENTRIES-ALL
      * - parsingPattern500              COBOL Name: 500-PARSING-PATTERN
      * - ip66102BitByte2                COBOL Name: IP66102-BIT-BYTE-2
      * - ip66102BitByte3                COBOL Name: IP66102-BIT-BYTE-3
      * - ip66102BitByte4                COBOL Name: IP66102-BIT-BYTE-4
      * - ip66102BitByte5                COBOL Name: IP66102-BIT-BYTE-5
      * - ip66102BitByte6                COBOL Name: IP66102-BIT-BYTE-6
      * - ip66102BitByte7                COBOL Name: IP66102-BIT-BYTE-7
      * - ip66102BitByte8                COBOL Name: IP66102-BIT-BYTE-8
      * - ip66102BitByte9                COBOL Name: IP66102-BIT-BYTE-9
      * - ip66102BitByte10               COBOL Name: IP66102-BIT-BYTE-10
      * - ip66102BitByte11               COBOL Name: IP66102-BIT-BYTE-11
      * - ip66102BitByte12               COBOL Name: IP66102-BIT-BYTE-12
      * - ip66102BitByte13               COBOL Name: IP66102-BIT-BYTE-13
      * - ip66102BitByte14               COBOL Name: IP66102-BIT-BYTE-14
      * - ip66102BitByte15               COBOL Name: IP66102-BIT-BYTE-15
      * - ip66102BitByte16               COBOL Name: IP66102-BIT-BYTE-16
      *
      * @throws CFException
      */
      private void expandTheBitMap() throws Exception {
			// Declare local variables used in the method
			Ip66102BitMap ip66102BitMap = ip66102IpmMsg.getIp66102NormalIpmMsg().getIp66102BitMap();
			// End of variable declaration

      
// *    Note:  the displayed message will not include the
// *           binary ip66102-tag-start field.

// *  For each byte of the the bit-map, move the byte to the right-
// *  most byte of p-x, a two-byte field which is redefined as a
// *  half-word binary number, p.  then use p as a subscript to find
// *  the parsing-pattern which will contain a string of eight 'x's
// *  and/or spaces equivalent to the eight bits.  move that pattern
// *  into sel-elem-entries-all which is the "byte-map".
//  MOVE IP66102-BIT-BYTE-1 TO 400-P-X
          pGroup400.getP400Redefined().setPX400(ip66102BitMap.getIp66102BitByte1());
  
//  MOVE 500-PARSING-PATTERN ( 400-P + 1) TO IP65504-SEL-ELEM-ENTRIES-ALL (1 : 8)
          ip65504SelElemEntriesAll.replace(parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(pGroup400.getP400() + 1 - 1),0,parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(pGroup400.getP400() + 1 - 1).length,0,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *               Add one because a bit pattern of x'00'
// *               must retrieve parsing-pattern(1)
//  MOVE IP66102-BIT-BYTE-2 TO 400-P-X
          pGroup400.getP400Redefined().setPX400(ip66102BitMap.getIp66102BitByte2());
  
//  MOVE 500-PARSING-PATTERN ( 400-P + 1) TO IP65504-SEL-ELEM-ENTRIES-ALL (9 : 8)
          ip65504SelElemEntriesAll.replace(parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(pGroup400.getP400() + 1 - 1),0,parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(pGroup400.getP400() + 1 - 1).length,8,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE IP66102-BIT-BYTE-3 TO 400-P-X
          pGroup400.getP400Redefined().setPX400(ip66102BitMap.getIp66102BitByte3());
  
//  MOVE 500-PARSING-PATTERN ( 400-P + 1) TO IP65504-SEL-ELEM-ENTRIES-ALL (17 : 8)
          ip65504SelElemEntriesAll.replace(parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(pGroup400.getP400() + 1 - 1),0,parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(pGroup400.getP400() + 1 - 1).length,16,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE IP66102-BIT-BYTE-4 TO 400-P-X
          pGroup400.getP400Redefined().setPX400(ip66102BitMap.getIp66102BitByte4());
  
//  MOVE 500-PARSING-PATTERN ( 400-P + 1) TO IP65504-SEL-ELEM-ENTRIES-ALL (25 : 8)
          ip65504SelElemEntriesAll.replace(parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(pGroup400.getP400() + 1 - 1),0,parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(pGroup400.getP400() + 1 - 1).length,24,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE IP66102-BIT-BYTE-5 TO 400-P-X
          pGroup400.getP400Redefined().setPX400(ip66102BitMap.getIp66102BitByte5());
  
//  MOVE 500-PARSING-PATTERN ( 400-P + 1) TO IP65504-SEL-ELEM-ENTRIES-ALL (33 : 8)
          ip65504SelElemEntriesAll.replace(parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(pGroup400.getP400() + 1 - 1),0,parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(pGroup400.getP400() + 1 - 1).length,32,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE IP66102-BIT-BYTE-6 TO 400-P-X
          pGroup400.getP400Redefined().setPX400(ip66102BitMap.getIp66102BitByte6());
  
//  MOVE 500-PARSING-PATTERN ( 400-P + 1) TO IP65504-SEL-ELEM-ENTRIES-ALL (41 : 8)
          ip65504SelElemEntriesAll.replace(parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(pGroup400.getP400() + 1 - 1),0,parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(pGroup400.getP400() + 1 - 1).length,40,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE IP66102-BIT-BYTE-7 TO 400-P-X
          pGroup400.getP400Redefined().setPX400(ip66102BitMap.getIp66102BitByte7());
  
//  MOVE 500-PARSING-PATTERN ( 400-P + 1) TO IP65504-SEL-ELEM-ENTRIES-ALL (49 : 8)
          ip65504SelElemEntriesAll.replace(parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(pGroup400.getP400() + 1 - 1),0,parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(pGroup400.getP400() + 1 - 1).length,48,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE IP66102-BIT-BYTE-8 TO 400-P-X
          pGroup400.getP400Redefined().setPX400(ip66102BitMap.getIp66102BitByte8());
  
//  MOVE 500-PARSING-PATTERN ( 400-P + 1) TO IP65504-SEL-ELEM-ENTRIES-ALL (57 : 8)
          ip65504SelElemEntriesAll.replace(parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(pGroup400.getP400() + 1 - 1),0,parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(pGroup400.getP400() + 1 - 1).length,56,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE IP66102-BIT-BYTE-9 TO 400-P-X
          pGroup400.getP400Redefined().setPX400(ip66102BitMap.getIp66102BitByte9());
  
//  MOVE 500-PARSING-PATTERN ( 400-P + 1) TO IP65504-SEL-ELEM-ENTRIES-ALL (65 : 8)
          ip65504SelElemEntriesAll.replace(parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(pGroup400.getP400() + 1 - 1),0,parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(pGroup400.getP400() + 1 - 1).length,64,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE IP66102-BIT-BYTE-10 TO 400-P-X
          pGroup400.getP400Redefined().setPX400(ip66102BitMap.getIp66102BitByte10());
  
//  MOVE 500-PARSING-PATTERN ( 400-P + 1) TO IP65504-SEL-ELEM-ENTRIES-ALL (73 : 8)
          ip65504SelElemEntriesAll.replace(parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(pGroup400.getP400() + 1 - 1),0,parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(pGroup400.getP400() + 1 - 1).length,72,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE IP66102-BIT-BYTE-11 TO 400-P-X
          pGroup400.getP400Redefined().setPX400(ip66102BitMap.getIp66102BitByte11());
  
//  MOVE 500-PARSING-PATTERN ( 400-P + 1) TO IP65504-SEL-ELEM-ENTRIES-ALL (81 : 8)
          ip65504SelElemEntriesAll.replace(parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(pGroup400.getP400() + 1 - 1),0,parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(pGroup400.getP400() + 1 - 1).length,80,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE IP66102-BIT-BYTE-12 TO 400-P-X
          pGroup400.getP400Redefined().setPX400(ip66102BitMap.getIp66102BitByte12());
  
//  MOVE 500-PARSING-PATTERN ( 400-P + 1) TO IP65504-SEL-ELEM-ENTRIES-ALL (89 : 8)
          ip65504SelElemEntriesAll.replace(parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(pGroup400.getP400() + 1 - 1),0,parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(pGroup400.getP400() + 1 - 1).length,88,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE IP66102-BIT-BYTE-13 TO 400-P-X
          pGroup400.getP400Redefined().setPX400(ip66102BitMap.getIp66102BitByte13());
  
//  MOVE 500-PARSING-PATTERN ( 400-P + 1) TO IP65504-SEL-ELEM-ENTRIES-ALL (97 : 8)
          ip65504SelElemEntriesAll.replace(parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(pGroup400.getP400() + 1 - 1),0,parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(pGroup400.getP400() + 1 - 1).length,96,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE IP66102-BIT-BYTE-14 TO 400-P-X
          pGroup400.getP400Redefined().setPX400(ip66102BitMap.getIp66102BitByte14());
  
//  MOVE 500-PARSING-PATTERN ( 400-P + 1) TO IP65504-SEL-ELEM-ENTRIES-ALL (105 : 8)
          ip65504SelElemEntriesAll.replace(parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(pGroup400.getP400() + 1 - 1),0,parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(pGroup400.getP400() + 1 - 1).length,104,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE IP66102-BIT-BYTE-15 TO 400-P-X
          pGroup400.getP400Redefined().setPX400(ip66102BitMap.getIp66102BitByte15());
  
//  MOVE 500-PARSING-PATTERN ( 400-P + 1) TO IP65504-SEL-ELEM-ENTRIES-ALL (113 : 8)
          ip65504SelElemEntriesAll.replace(parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(pGroup400.getP400() + 1 - 1),0,parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(pGroup400.getP400() + 1 - 1).length,112,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE IP66102-BIT-BYTE-16 TO 400-P-X
          pGroup400.getP400Redefined().setPX400(ip66102BitMap.getIp66102BitByte16());
  
//  MOVE 500-PARSING-PATTERN ( 400-P + 1) TO IP65504-SEL-ELEM-ENTRIES-ALL (121 : 8)
          ip65504SelElemEntriesAll.replace(parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(pGroup400.getP400() + 1 - 1),0,parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(pGroup400.getP400() + 1 - 1).length,120,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
      
      }
      /**
      * checkRecordLength 
      *   This method is derived from 
  *   COBOL Paragraph - 60000-CHECK-RECORD-LENGTH COBOL Cyclomatic complexity - 2
      * Input  :  

      * - ip65504DeStart                 COBOL Name: IP65504-DE-START
      * - ip65504DeLngth                 COBOL Name: IP65504-DE-LNGTH
      * - ip66102IpmMsgLngth             COBOL Name: IP66102-IPM-MSG-LNGTH
      *
      * Output :  

      * - parsedMsgLngth400              COBOL Name: 400-PARSED-MSG-LNGTH
      *
      * @throws CFException
      */
      private void checkRecordLength() throws Exception {
			// Declare local variables used in the method
			int parsedMsgLngth400 = 0;
			long ip66102IpmMsgLngth = 0;
			// End of variable declaration

          work.setParsedMsgLngth400(ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(ip65504D - 1).getIp65504DeStart() + ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(ip65504D - 1).getIp65504DeLngth() - 1);
          ip66102IpmMsgLngth = ip66102IpmFileInformation.getIp66102IpmMsgLngth();
          parsedMsgLngth400 = work.getParsedMsgLngth400();
//  IF 400-PARSED-MSG-LNGTH NOT = IP66102-IPM-MSG-LNGTH
          if (	( parsedMsgLngth400 != ip66102IpmMsgLngth ) ) { 
//  PERFORM 60010-HANDLE-BAD-RECORD-LNGTH
              handleBadRecordLngth();/*60010-HANDLE-BAD-RECORD-LNGTH*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
  
      
      }
      /**
      * handleBadRecordLngth 
      *   This method is derived from 
  *   COBOL Paragraph - 60010-HANDLE-BAD-RECORD-LNGTH COBOL Cyclomatic complexity - 2
      * Input  :  

      * - badRecLngthCode600             COBOL Name: 600-BAD-REC-LNGTH-CODE
      * - badRecLngthNdx600              COBOL Name: 600-BAD-REC-LNGTH-NDX
      * - parsedMsgLngth400              COBOL Name: 400-PARSED-MSG-LNGTH
      * - ip66102IpmMsgLngth             COBOL Name: IP66102-IPM-MSG-LNGTH
      * - badRecLngth600                 COBOL Name: 600-BAD-REC-LNGTH
      *
      * Output :  

      * - errorCode600                   COBOL Name: 600-ERROR-CODE
      * - ip65504MessageStatus           COBOL Name: IP65504-MESSAGE-STATUS
      * - badRecLngthCode600             COBOL Name: 600-BAD-REC-LNGTH-CODE
      * - ip662011ErrSubscript           COBOL Name: IP662011-ERR-SUBSCRIPT
      * - badRecLngthNdx600              COBOL Name: 600-BAD-REC-LNGTH-NDX
      * - parsedLngth600                 COBOL Name: 600-PARSED-LNGTH
      * - parsedMsgLngth400              COBOL Name: 400-PARSED-MSG-LNGTH
      * - rdwLngth600                    COBOL Name: 600-RDW-LNGTH
      * - ip66102IpmMsgLngth             COBOL Name: IP66102-IPM-MSG-LNGTH
      * - ipmErrorText600                COBOL Name: 600-IPM-ERROR-TEXT
      * - badRecLngth600                 COBOL Name: 600-BAD-REC-LNGTH
      * - j400                           COBOL Name: 400-J
      * - ipmErrorPointerWidth600        COBOL Name: 600-IPM-ERROR-POINTER-WIDTH
      *
      * @throws CFException
      */
      private void handleBadRecordLngth() throws Exception {
			// Declare local variables used in the method
			long ip66102IpmMsgLngth = 0;
			int parsedMsgLngth400 = 0;
			// End of variable declaration

//  MOVE 600-BAD-REC-LNGTH-CODE TO 600-ERROR-CODE IP65504-MESSAGE-STATUS
          ipmErrorMsg600.setErrorCode600( work.getBadRecLngthCode600());
          ip65504MessageStatusGroup.setIp65504MessageStatus((short) work.getBadRecLngthCode600());
//  MOVE 600-BAD-REC-LNGTH-NDX TO IP662011-ERR-SUBSCRIPT
          ip662011ErrSubscriptGroup.setIp662011ErrSubscript(work.getBadRecLngthNdx600());
//  MOVE 400-PARSED-MSG-LNGTH TO 600-PARSED-LNGTH
//  FORMAT_16989907 = "ZZ,ZZ9"
          badRecLngth600.setParsedLngth600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_16989907,String.valueOf(work.getParsedMsgLngth400()).toCharArray()));
//  MOVE IP66102-IPM-MSG-LNGTH TO 600-RDW-LNGTH
//  FORMAT_16989907 = "ZZ,ZZ9"
          badRecLngth600.setRdwLngth600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_16989907,String.valueOf(ip66102IpmFileInformation.getIp66102IpmMsgLngth()).toCharArray()));
          // MOVE 600-BAD-REC-LNGTH TO 600-IPM-ERROR-TEXT
          ipmErrorMsg600.setIpmErrorText600(badRecLngth600.toCharArray());

// *    Point 400-j to the error
          parsedMsgLngth400 = work.getParsedMsgLngth400();
          ip66102IpmMsgLngth = ip66102IpmFileInformation.getIp66102IpmMsgLngth();
//  IF IP66102-IPM-MSG-LNGTH < 400-PARSED-MSG-LNGTH
          if (	( ip66102IpmMsgLngth < parsedMsgLngth400 ) ) { 
//  MOVE IP66102-IPM-MSG-LNGTH TO 400-J
              work.setJ400((short) ip66102IpmFileInformation.getIp66102IpmMsgLngth());
//  SUBTRACT IP66102-IPM-MSG-LNGTH FROM 400-PARSED-MSG-LNGTH GIVING 600-IPM-ERROR-POINTER-WIDTH
              work.setIpmErrorPointerWidth600( (short) ((short) work.getParsedMsgLngth400()-(short) ip66102IpmFileInformation.getIp66102IpmMsgLngth()));
          }
  
//  ELSE
          else { 
//  MOVE 400-PARSED-MSG-LNGTH TO 400-J
              work.setJ400((short) work.getParsedMsgLngth400());
//  SUBTRACT 400-PARSED-MSG-LNGTH FROM IP66102-IPM-MSG-LNGTH GIVING 600-IPM-ERROR-POINTER-WIDTH
              work.setIpmErrorPointerWidth600( (short) ((short) ip66102IpmFileInformation.getIp66102IpmMsgLngth()-(short) work.getParsedMsgLngth400()));
          }
//  ADD 1 TO 400-J
          work.setJ400( (short) (work.getJ400()+(short)1));
//  PERFORM 81000-PROCESS-BAD-MESSAGE
          processBadMessage();/*81000-PROCESS-BAD-MESSAGE*/
          if (this.isProgramEnded()) {
              return ;
          }
          ;
      
      }
      /**
      * handleBadLengthField 
      *   This method is derived from 
  *   COBOL Paragraph - 80000-HANDLE-BAD-LENGTH-FIELD COBOL Cyclomatic complexity - 4
      * Input  :  

      * - i400                           COBOL Name: 400-I
      * - ip000604DeSubflds              COBOL Name: IP000604-DE-SUBFLDS
      * - ipmErrorPointerWidth600        COBOL Name: 600-IPM-ERROR-POINTER-WIDTH
      * - j400                           COBOL Name: 400-J
      * - nonNumericLngth600             COBOL Name: 600-NON-NUMERIC-LNGTH
      * - nonNumericLngthCode600         COBOL Name: 600-NON-NUMERIC-LNGTH-CODE
      * - nonNumericLngthNdx600          COBOL Name: 600-NON-NUMERIC-LNGTH-NDX
      *
      * Output :  

      * - ip000604I                      COBOL Name: IP000604-I
      * - ip65504T                       COBOL Name: IP65504-T
      * - ip65504TagType                 COBOL Name: IP65504-TAG-TYPE
      * - ip65504TagNo                   COBOL Name: IP65504-TAG-NO
      * - i400                           COBOL Name: 400-I
      * - ip65504TagStarts               COBOL Name: IP65504-TAG-STARTS
      * - ip65504DeStart                 COBOL Name: IP65504-DE-START
      * - ipmErrorElementType600         COBOL Name: 600-IPM-ERROR-ELEMENT-TYPE
      * - ip65504PdsStart                COBOL Name: IP65504-PDS-START
      * - ipmErrorElementNo600           COBOL Name: 600-IPM-ERROR-ELEMENT-NO
      * - ipmErrorText600                COBOL Name: 600-IPM-ERROR-TEXT
      * - nonNumericLngth600             COBOL Name: 600-NON-NUMERIC-LNGTH
      * - errorCode600                   COBOL Name: 600-ERROR-CODE
      * - ip65504MessageStatus           COBOL Name: IP65504-MESSAGE-STATUS
      * - nonNumericLngthCode600         COBOL Name: 600-NON-NUMERIC-LNGTH-CODE
      * - ip662011ErrSubscript           COBOL Name: IP662011-ERR-SUBSCRIPT
      * - nonNumericLngthNdx600          COBOL Name: 600-NON-NUMERIC-LNGTH-NDX
      *
      * @throws CFException
      */
      private void handleBadLengthField() throws Exception {
			// Declare local variables used in the method
			IpmErrorElementId600 ipmErrorElementId600 = ipmErrorMsg600.getIpmErrorElementId600();
			// End of variable declaration

//  SET IP000604-I TO 400-I
          ip000604I = work.getI400(); 
          

// *       400-I always contains the current de-number

// *       We're dealing with a de subfield, so ip65504-t has not
// *       been incremented.  (for pdses the current de is the
// *       carrier, which will have no subfields.)
//  IF IP000604-DE-SUBFLDS ( IP000604-I ) > 0
          if (	( ip000604DeAttrTable.getIp000604DeAttrRow(ip000604I - 1).getIp000604DeSubflds() > 0 ) ) { 
//  SET IP65504-T UP BY 1
              ip65504T++; 
              
//  MOVE 2 TO IP65504-TAG-TYPE ( IP65504-T )
              ip65504CurrentTagTable.getIp65504TagArea(ip65504T - 1).getIp65504TagId().setIp65504TagType((short)2);
//  MOVE 400-I TO IP65504-TAG-NO ( IP65504-T )
              ip65504CurrentTagTable.getIp65504TagArea(ip65504T - 1).getIp65504TagId().setIp65504TagNo(work.getI400());
          }
//  ADD 600-IPM-ERROR-POINTER-WIDTH 400-J GIVING IP65504-TAG-STARTS ( IP65504-T )
          ip65504CurrentTagTable.getIp65504TagArea(ip65504T - 1).setIp65504TagStarts( (short) (work.getIpmErrorPointerWidth600()+work.getJ400()));
//  EVALUATE TRUE
          if  ( ip65504CurrentTagTable.getIp65504TagArea(ip65504T - 1).getIp65504TagId().isIp6550488DeTag()  ) { 
//  MOVE IP65504-TAG-STARTS ( IP65504-T ) TO IP65504-DE-START ( 400-I )
              ip65504DeMapGroup.getIp65504DeMap().getIp65504DeMapEntry(work.getI400() - 1).setIp65504DeStart(ip65504CurrentTagTable.getIp65504TagArea(ip65504T - 1).getIp65504TagStarts());
//  MOVE 'D' TO 600-IPM-ERROR-ELEMENT-TYPE
//  LITERAL_D = 'D'
              ipmErrorElementId600.setIpmErrorElementType600(CONSTANTS.LITERAL_D);
  
//  MOVE 2 TO IP65504-TAG-TYPE ( IP65504-T )
              ip65504CurrentTagTable.getIp65504TagArea(ip65504T - 1).getIp65504TagId().setIp65504TagType((short)2);
          }
          else if  ( ip65504CurrentTagTable.getIp65504TagArea(ip65504T - 1).getIp65504TagId().isIp6550488PdsTag()  ) { 
//  MOVE IP65504-TAG-STARTS ( IP65504-T ) TO IP65504-PDS-START ( 400-I )
              ip65504PdsMapGroup.getIp65504PdsMap().getIp65504PdsMapEntry(work.getI400() - 1).setIp65504PdsStart(ip65504CurrentTagTable.getIp65504TagArea(ip65504T - 1).getIp65504TagStarts());
//  MOVE 'P' TO 600-IPM-ERROR-ELEMENT-TYPE
//  LITERAL_P = 'P'
              ipmErrorElementId600.setIpmErrorElementType600(CONSTANTS.LITERAL_P);
  
//  MOVE 3 TO IP65504-TAG-TYPE ( IP65504-T )
              ip65504CurrentTagTable.getIp65504TagArea(ip65504T - 1).getIp65504TagId().setIp65504TagType((short)3);
          }
//  MOVE IP65504-TAG-NO ( IP65504-T ) TO 600-IPM-ERROR-ELEMENT-NO
          ipmErrorElementId600.setIpmErrorElementNo600(ip65504CurrentTagTable.getIp65504TagArea(ip65504T - 1).getIp65504TagId().getIp65504TagNo());
  
//  MOVE 600-NON-NUMERIC-LNGTH TO 600-IPM-ERROR-TEXT
          ipmErrorMsg600.setIpmErrorText600(pad(64,work.getNonNumericLngth600(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 600-NON-NUMERIC-LNGTH-CODE TO 600-ERROR-CODE IP65504-MESSAGE-STATUS
          ipmErrorMsg600.setErrorCode600( work.getNonNumericLngthCode600());
          ip65504MessageStatusGroup.setIp65504MessageStatus((short) work.getNonNumericLngthCode600());
//  MOVE 600-NON-NUMERIC-LNGTH-NDX TO IP662011-ERR-SUBSCRIPT
          ip662011ErrSubscriptGroup.setIp662011ErrSubscript(work.getNonNumericLngthNdx600());
//  PERFORM 81000-PROCESS-BAD-MESSAGE
          processBadMessage();/*81000-PROCESS-BAD-MESSAGE*/
          if (this.isProgramEnded()) {
              return ;
          }
          ;
      
      }
      /**
      * processBadMessage 
      *   This method is derived from 
  *   COBOL Paragraph - 81000-PROCESS-BAD-MESSAGE COBOL Cyclomatic complexity - 7
      * Input  :  

      * - ip66102IpmMsgsRead             COBOL Name: IP66102-IPM-MSGS-READ
      * - badMessageCount400             COBOL Name: 400-BAD-MESSAGE-COUNT
      * - errorMessageHeader600          COBOL Name: 600-ERROR-MESSAGE-HEADER
      * - maxBadIpmMsgs300               COBOL Name: 300-MAX-BAD-IPM-MSGS
      *
      * Output :  

      * - ipmErrorRecordNo600            COBOL Name: 600-IPM-ERROR-RECORD-NO
      * - ip66102IpmMsgsRead             COBOL Name: IP66102-IPM-MSGS-READ
      * - badMessageCount400             COBOL Name: 400-BAD-MESSAGE-COUNT
      * - rc                             COBOL Name: RETURN-CODE
      * - displayNumber600               COBOL Name: 600-DISPLAY-NUMBER
      * - maxBadIpmMsgs300               COBOL Name: 300-MAX-BAD-IPM-MSGS
      *
      * @throws CFException
      */
      private void processBadMessage() throws Exception {
			// Declare local variables used in the method
			short badMessageCount400 = 0;
			short maxBadIpmMsgs300 = 0;
			// End of variable declaration

          // MOVE IP66102-IPM-MSGS-READ TO 600-IPM-ERROR-RECORD-NO
          //  FORMAT769933041 = "ZZZ,ZZZ,ZZ9"
          ipmErrorMsg600.setIpmErrorRecordNo600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT769933041,String.valueOf(ip66102IpmFileInformation.getIp66102IpmMsgsRead()).toCharArray()));
//  ADD 1 TO 400-BAD-MESSAGE-COUNT
          work.setBadMessageCount400( (short) (work.getBadMessageCount400()+(short)1));
          badMessageCount400 = work.getBadMessageCount400();
          maxBadIpmMsgs300 = work.getMaxBadIpmMsgs300();
//  EVALUATE TRUE
          if  (	( badMessageCount400 == 1 ) ) { 
              // MOVE 4 TO RETURN-CODE
              this.setRc( 4);
//  DISPLAY SPACES
              logger.info(" "); 
//  DISPLAY 600-ERROR-MESSAGE-HEADER
              logger.info(new String(work.getErrorMessageHeader600())); 
//  PERFORM 81100-DISPLAY-BAD-IPM-MESSAGE
              displayBadIpmMessage();/*81100-DISPLAY-BAD-IPM-MESSAGE*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
          else if  (	( badMessageCount400 < maxBadIpmMsgs300 )) { 
              // MOVE 4 TO RETURN-CODE
              this.setRc( 4);
//  PERFORM 81100-DISPLAY-BAD-IPM-MESSAGE
              displayBadIpmMessage();/*81100-DISPLAY-BAD-IPM-MESSAGE*/
              if (this.isProgramEnded()) {
                  return ;
              }
          }
          else if  (	( badMessageCount400 == maxBadIpmMsgs300 )) { 
              // MOVE 8 TO RETURN-CODE
              this.setRc( 8);
//  PERFORM 81100-DISPLAY-BAD-IPM-MESSAGE
              displayBadIpmMessage();/*81100-DISPLAY-BAD-IPM-MESSAGE*/
              if (this.isProgramEnded()) {
                  return ;
              }
//  MOVE 300-MAX-BAD-IPM-MSGS TO 600-DISPLAY-NUMBER
//  FORMAT_1564585219 = "Z,ZZ9"
              work.setDisplayNumber600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1564585219,String.valueOf(work.getMaxBadIpmMsgs300()).toCharArray()));
//  DISPLAY 'IP662010-81000-MAXIMUM INVALID IPM MESSAGES IS ' 600-DISPLAY-NUMBER '.  FURTHER MESSAGES SUPPRESSED.'
              logger.info("IP662010-81000-MAXIMUM INVALID IPM MESSAGES IS {}.  FURTHER MESSAGES SUPPRESSED.", new String(work.getDisplayNumber600())); 
          }
          else if  (	( badMessageCount400 > maxBadIpmMsgs300 )) { 
              // MOVE 8 TO RETURN-CODE
              this.setRc( 8);
          }
  
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          this.setProgramEnded(true);
          return ;
      
      }
      /**
      * displayBadIpmMessage 
      *   This method is derived from 
  *   COBOL Paragraph - 81100-DISPLAY-BAD-IPM-MESSAGE COBOL Cyclomatic complexity - 11
      * Input  :  

      * - ipmErrorPointerWidth600        COBOL Name: 600-IPM-ERROR-POINTER-WIDTH
      * - j400                           COBOL Name: 400-J
      * - ipmErrorMsg600                 COBOL Name: 600-IPM-ERROR-MSG
      * - charMapColumns600              COBOL Name: 600-CHAR-MAP-COLUMNS
      * - ip65504SelElemEntriesAll       COBOL Name: IP65504-SEL-ELEM-ENTRIES-ALL
      * - ipmErrorColumns600             COBOL Name: 600-IPM-ERROR-COLUMNS
      * - k400                           COBOL Name: 400-K
      * - ip66102IpmMsgLngth             COBOL Name: IP66102-IPM-MSG-LNGTH
      * - ip66102IpmMsg                  COBOL Name: IP66102-IPM-MSG
      * - errorCode600                   COBOL Name: 600-ERROR-CODE
      * - messageLengthMsg600            COBOL Name: 600-MESSAGE-LENGTH-MSG
      *
      * Output :  

      * - errEnd400                      COBOL Name: 400-ERR-END
      * - ipmErrorPointerLine600         COBOL Name: 600-IPM-ERROR-POINTER-LINE
      * - errStart400                    COBOL Name: 400-ERR-START
      * - errLngth400                    COBOL Name: 400-ERR-LNGTH
      * - k400                           COBOL Name: 400-K
      * - l400                           COBOL Name: 400-L
      * - ipmErrorPointerWidth600        COBOL Name: 600-IPM-ERROR-POINTER-WIDTH
      * - messageLengthErrCode600        COBOL Name: 600-MESSAGE-LENGTH-ERR-CODE
      * - errorCode600                   COBOL Name: 600-ERROR-CODE
      * - messageLength600               COBOL Name: 600-MESSAGE-LENGTH
      * - ip66102IpmMsgLngth             COBOL Name: IP66102-IPM-MSG-LNGTH
      *
      * @throws CFException
      */
      private void displayBadIpmMessage() throws Exception {
			// Declare local variables used in the method
			short ipmErrorPointerWidth600 = 0;
			short errEnd400 = 0;
			short k400 = 0;
			short l400 = 0;
			// End of variable declaration

//  DISPLAY SPACE
          logger.info(" "); 
          ipmErrorPointerWidth600 = work.getIpmErrorPointerWidth600();
//  IF 600-IPM-ERROR-POINTER-WIDTH > 0
          if (	( ipmErrorPointerWidth600 > 0 ) ) { 
              work.setErrEnd400((short) (work.getJ400() - 1 + work.getIpmErrorPointerWidth600()));
              // MOVE SPACES TO 600-IPM-ERROR-POINTER-LINE
              work.setIpmErrorPointerLine600(CONSTANTS.SPACE_100);
              work.setErrStart400((short) (Math.floorMod(work.getJ400(),100)));
              work.setErrLngth400((short) (Stream.of(work.getIpmErrorPointerWidth600(),(short) (101 - work.getErrStart400())).min(Comparator.comparing(Integer::valueOf)).get()));
//  MOVE ALL '|' TO 600-IPM-ERROR-POINTER-LINE ( 400-ERR-START : 400-ERR-LNGTH )
              work.setIpmErrorPointerLine600(replace(work.getIpmErrorPointerLine600(),CONSTANTS.LITERAL_36552,(work.getErrStart400()-1), (work.getErrLngth400() + (work.getErrStart400() - 1)) ));
          }
  

// *       This will print below the bad ipm message, thus
// *       pointing to the invalid field
//  DISPLAY 600-IPM-ERROR-MSG
          logger.info(ipmErrorMsg600.toString()); 
//  DISPLAY 600-CHAR-MAP-COLUMNS
          logger.info(charMapColumns600.toString()); 
//  DISPLAY IP65504-SEL-ELEM-ENTRIES-ALL
          logger.info(ip65504SelElemEntriesAll.toString()); 
//  DISPLAY 600-IPM-ERROR-COLUMNS
          logger.info(new String(charMapColumns600.getIpmErrorColumns600())); 
//  PERFORM VARYING 400-K FROM 1 BY 100 UNTIL 400-K GREATER THAN IP66102-IPM-MSG-LNGTH
          for (work.setK400(1); (	( work.getK400() <= ip66102IpmFileInformation.getIp66102IpmMsgLngth() ) ) ; work.setK400(work.getK400() + 100) ) {
//  DISPLAY IP66102-IPM-MSG ( 400-K : FUNCTION MIN (100 IP66102-IPM-MSG-LNGTH - 400-K + 1))
              logger.info(new String(substring(ip66102IpmMsg.getCharArray(),(work.getK400()-1), (Stream.of(100,(int) (ip66102IpmFileInformation.getIp66102IpmMsgLngth() - work.getK400() + 1)).min(Comparator.comparing(Integer::valueOf)).get() + (work.getK400() - 1)) ))); 

// *       Now see if the bad field was on the line just displayed.
// *       if so, display the pointer-line to point to it.
//  ADD 100 TO 400-K GIVING 400-L
              work.setL400( (short) (work.getK400()+(short)100));
              k400 = work.getK400();
              errEnd400 = work.getErrEnd400();
              l400 = work.getL400();
//  IF ( 400-J IS GREATER THAN OR EQUAL TO 400-K AND 400-J IS LESS THAN 400-L ) OR ( 400-ERR-END GREATER THAN OR EQUAL TO 400-K AND 400-ERR-END LESS THAN 400-L )
              if ((	( work.getJ400() >= k400 ) && 	( work.getJ400() < l400 )) || (	( errEnd400 >= k400 ) && 	( errEnd400 < l400 ))) { 
//  DISPLAY 600-IPM-ERROR-POINTER-LINE
                  logger.info(new String(work.getIpmErrorPointerLine600())); 
//  DISPLAY SPACE
                  logger.info(" "); 
//  SUBTRACT 400-ERR-LNGTH FROM 600-IPM-ERROR-POINTER-WIDTH
                  work.setIpmErrorPointerWidth600( (short) (work.getIpmErrorPointerWidth600()-work.getErrLngth400()));
                  ipmErrorPointerWidth600 = work.getIpmErrorPointerWidth600();
//  IF 600-IPM-ERROR-POINTER-WIDTH > 0
                  if (	( ipmErrorPointerWidth600 > 0 ) ) { 

// *             Set up next line of error-pointers
                      // MOVE 1 TO 400-ERR-START
                      work.setErrStart400((short)1);
                      work.setErrLngth400((short) (Stream.of(work.getIpmErrorPointerWidth600(),(short) (101 - work.getErrStart400())).min(Comparator.comparing(Integer::valueOf)).get()));
                      // MOVE SPACES TO 600-IPM-ERROR-POINTER-LINE
                      work.setIpmErrorPointerLine600(CONSTANTS.SPACE_100);
//  MOVE ALL '|' TO 600-IPM-ERROR-POINTER-LINE ( 400-ERR-START : 400-ERR-LNGTH )
                      work.setIpmErrorPointerLine600(replace(work.getIpmErrorPointerLine600(),CONSTANTS.LITERAL_36552,(work.getErrStart400()-1), (work.getErrLngth400() + (work.getErrStart400() - 1)) ));
                  }
  
              }
  
          }
//  MOVE 600-ERROR-CODE TO 600-MESSAGE-LENGTH-ERR-CODE
          messageLengthMsg600.setMessageLengthErrCode600(String.valueOf(ipmErrorMsg600.getErrorCode600String()).toCharArray());
//  MOVE IP66102-IPM-MSG-LNGTH TO 600-MESSAGE-LENGTH
//  FORMAT_16989907 = "ZZ,ZZ9"
          messageLengthMsg600.setMessageLength600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_16989907,String.valueOf(ip66102IpmFileInformation.getIp66102IpmMsgLngth()).toCharArray()));
//  DISPLAY 600-MESSAGE-LENGTH-MSG
          logger.info(messageLengthMsg600.toString()); 
//  PERFORM 81110-DISPLAY-TAG-TABLE
          displayTagTable();/*81110-DISPLAY-TAG-TABLE*/
          ;
      
      }
      /**
      * displayTagTable 
      *   This method is derived from 
  *   COBOL Paragraph - 81110-DISPLAY-TAG-TABLE COBOL Cyclomatic complexity - 10
      * Input  :  

      * - ip65504T                       COBOL Name: IP65504-T
      * - tagTableHeader600              COBOL Name: 600-TAG-TABLE-HEADER
      * - i800                           COBOL Name: 800-I
      * - ip65504TagNo                   COBOL Name: IP65504-TAG-NO
      * - ip65504TagSubFldNo             COBOL Name: IP65504-TAG-SUB-FLD-NO
      * - ip65504TagStarts               COBOL Name: IP65504-TAG-STARTS
      * - ip65504TagLngth                COBOL Name: IP65504-TAG-LNGTH
      * - ip65504TagStatus               COBOL Name: IP65504-TAG-STATUS
      * - ip66102IpmMsg                  COBOL Name: IP66102-IPM-MSG
      *
      * Output :  

      * - ip65504Tcnt                    COBOL Name: IP65504-TCNT
      * - i800                           COBOL Name: 800-I
      * - tagType600                     COBOL Name: 600-TAG-TYPE
      * - tagNo600                       COBOL Name: 600-TAG-NO
      * - ip65504TagNo                   COBOL Name: IP65504-TAG-NO
      * - tagSubfldNo600                 COBOL Name: 600-TAG-SUBFLD-NO
      * - ip65504TagSubFldNo             COBOL Name: IP65504-TAG-SUB-FLD-NO
      * - tagStarts600                   COBOL Name: 600-TAG-STARTS
      * - ip65504TagStarts               COBOL Name: IP65504-TAG-STARTS
      * - tagLngth600                    COBOL Name: 600-TAG-LNGTH
      * - ip65504TagLngth                COBOL Name: IP65504-TAG-LNGTH
      * - tagStatus600                   COBOL Name: 600-TAG-STATUS
      * - tagContent600                  COBOL Name: 600-TAG-CONTENT
      * - ip66102IpmMsg                  COBOL Name: IP66102-IPM-MSG
      *
      * @throws CFException
      */
      private void displayTagTable() throws Exception {
//  DISPLAY SPACE
          logger.info(" "); 
//  SET IP65504-TCNT TO IP65504-T
          ip65504TcntGroup.setIp65504Tcnt((short) ip65504T); 
          
//  DISPLAY 'IP662010- TAG TABLE (' IP65504-TCNT ' ENTRIES)'
          logger.info("IP662010- TAG TABLE ({} ENTRIES)", String.valueOf(ip65504TcntGroup.getIp65504Tcnt())); 
//  DISPLAY 600-TAG-TABLE-HEADER
          logger.info(new String(work.getTagTableHeader600())); 
//  PERFORM VARYING 800-I FROM 1 BY 1 UNTIL 800-I > IP65504-TCNT
          for (work.setI800(1); (	( work.getI800() <= ip65504TcntGroup.getIp65504Tcnt() )) ; work.setI800(work.getI800() + 1) ) {
//  EVALUATE IP65504-TAG-TYPE ( 800-I )
              switch(ip65504CurrentTagTable.getIp65504TagArea(work.getI800() - 1).getIp65504TagId().getIp65504TagType()){
              	case 1:
                  // MOVE 'M' TO 600-TAG-TYPE
                  //  LITERAL_M = 'M'
                  work.setTagType600(CONSTANTS.LITERAL_M);
              break;
              	case 2:
                  // MOVE 'D' TO 600-TAG-TYPE
                  //  LITERAL_D = 'D'
                  work.setTagType600(CONSTANTS.LITERAL_D);
              break;
              	case 3:
                  // MOVE 'P' TO 600-TAG-TYPE
                  //  LITERAL_P = 'P'
                  work.setTagType600(CONSTANTS.LITERAL_P);
              break;
              }
//  MOVE IP65504-TAG-NO ( 800-I ) TO 600-TAG-NO
//  FORMAT_1059277505 = "ZZZ9"
              work.setTagNo600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(ip65504CurrentTagTable.getIp65504TagArea(work.getI800() - 1).getIp65504TagId().getIp65504TagNo()).toCharArray()));
//  MOVE IP65504-TAG-SUB-FLD-NO ( 800-I ) TO 600-TAG-SUBFLD-NO
//  FORMAT_1059277505 = "ZZZ9"
              work.setTagSubfldNo600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(ip65504CurrentTagTable.getIp65504TagArea(work.getI800() - 1).getIp65504TagSubFldNo()).toCharArray()));
//  MOVE IP65504-TAG-STARTS ( 800-I ) TO 600-TAG-STARTS
//  FORMAT_1059277505 = "ZZZ9"
              work.setTagStarts600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(ip65504CurrentTagTable.getIp65504TagArea(work.getI800() - 1).getIp65504TagStarts()).toCharArray()));
//  MOVE IP65504-TAG-LNGTH ( 800-I ) TO 600-TAG-LNGTH
//  FORMAT_1059277505 = "ZZZ9"
              work.setTagLngth600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(ip65504CurrentTagTable.getIp65504TagArea(work.getI800() - 1).getIp65504TagLngth()).toCharArray()));
//  IF IP65504-TAG-STATUS ( 800-I ) EQUAL HIGH-VALUES
//  LITERAL_X = "X"
              if (( isHighValue(ip65504CurrentTagTable.getIp65504TagArea(work.getI800() - 1).getIp65504TagStatus()) ) ) { 
                  // MOVE 'X' TO 600-TAG-STATUS
                  //  LITERAL_X = 'X', LITERAL_X = "X"
                  work.setTagStatus600(CONSTANTS.LITERAL_X);
              }
//  IF IP65504-TAG-STARTS ( 800-I ) > 0 AND IP65504-TAG-LNGTH ( 800-I ) > 0
              if (	( ip65504CurrentTagTable.getIp65504TagArea(work.getI800() - 1).getIp65504TagStarts() > 0 )  && 	( ip65504CurrentTagTable.getIp65504TagArea(work.getI800() - 1).getIp65504TagLngth() > 0 ) ) { 
//  MOVE IP66102-IPM-MSG ( IP65504-TAG-STARTS ( 800-I ) : IP65504-TAG-LNGTH ( 800-I )) TO 600-TAG-CONTENT
                  work.setTagContent600(substring(ip66102IpmMsg.getCharArray(),(ip65504CurrentTagTable.getIp65504TagArea(work.getI800() - 1).getIp65504TagStarts()-1), (ip65504CurrentTagTable.getIp65504TagArea(work.getI800() - 1).getIp65504TagLngth() + (ip65504CurrentTagTable.getIp65504TagArea(work.getI800() - 1).getIp65504TagStarts() - 1)) ));
              }
//  ELSE
              else { 
                  // MOVE '<== NON-POSITIVE START OR LENGTH' TO 600-TAG-CONTENT
                  work.setTagContent600(CONSTANTS.LITERAL_627409146);
              }
//  DISPLAY '          ' 600-TAG-TYPE ' ' 600-TAG-NO ' ' 600-TAG-SUBFLD-NO '   ' 600-TAG-STARTS '  ' 600-TAG-LNGTH '   ' 600-TAG-STATUS '      ' 600-TAG-CONTENT
              logger.info("          {} {} {}   {}  {}   {}      {}", new String(work.getTagType600()), new String(work.getTagNo600()), new String(work.getTagSubfldNo600()), new String(work.getTagStarts600()), new String(work.getTagLngth600()), new String(work.getTagStatus600()), new String(work.getTagContent600())); 
          }
      
      }
      /**
      * abend 
      *   This method is derived from 
  *   COBOL Paragraph - 99999-ABEND COBOL Cyclomatic complexity - 1
      * Input  :  

      * - abendCode900                   COBOL Name: 900-ABEND-CODE
      *
      * Output : None 

      * @throws CFException
      */
      private void abend() throws Exception {

// *----------------------------------------------------------------
// * Function      : standard mastercard abend routine.
// *----------------------------------------------------------------
//  DISPLAY '----------------------------------'
          logger.info("----------------------------------"); 
//  DISPLAY 'A B E N D  A B E N D  A B E N D   '
          logger.info("A B E N D  A B E N D  A B E N D   "); 
//  DISPLAY 'A B E N D  IP662010               '
          logger.info("A B E N D  IP662010               "); 
//  DISPLAY '----------------------------------'
          logger.info("----------------------------------"); 
//  DISPLAY 900-ABEND-CODE
          logger.info(String.valueOf(work.getAbendCode900())); 
      
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
*author.  steve callahan.
*installation. mastercard international inc.
*date-written. july, 1999.
*-----------------------------------------------------------------
* this program will read a message from the ipm file and parse it.
* the file is in variable length record format, with one ipm
* message per record.
*
* the message may be:
*    1.  in standard iso ipm format, or
*    2.  accompanied by its tag-table.  such "tagged" messages
*        have been previously parsed and a tag table has been
*        appended to each record for efficiency in subsequent
*        processing.  tagged records have two fields preceding
*        the mti field:
*           - the character "!" to mark it as a tagged message
*           - a four-byte binary number indicating the starting
*             position of the tag-table.
*
* a 128-character string, ip655041-sel-elem-entries-all, the
* "data-element byte map" is created from decoding the de000 and
* de001 bit map fields. this string will have an 'x' in the
* relative position for the data elements which are present in the
* ipm message.  the maclib member for this field is ip655041.
*
* ip655041-sel-pds-entries-all will be created.  it is the "pds
* byte map", having an 'x' in each position corresponding to a pds
* which is present in the message.
*
* an entry for each data element and private data subelement in
* the message will be placed into ip65504-current-tag-table.  such
* an entry will contain:
*     1.  element id.   (e.g., d004, p265, etc.)
*     2.  subfield number
*     3.  starting offset
*     4.  length
*     5.  (reserved)
*
* the tag table is used to drive subsequent editing activity by
* other modules.
*
* the lengths of data elements are also saved in two indexable
* tables:
*     1.  ip65504-de-map    for data elements
*     2.  ip65504-pds-map   for private data subelements
*
* the message is returned to the caller in ip66102-ipm-message.
*=================================================================
* note:
*   this program calls 4 other programs using procedure pointers.
*     a. ip661020 - read parser api
*     b. ip739010 - load tables 6, 6a and 7
*     c. ip741010 - load tables 8 and 9
*=================================================================
*-----------------------------------------------------------------
* revision history log :
*-----------------------------------------------------------------
* project      : ses-ipm preedit
* date         : 1999-08-20
* version      : 001.00
* programmer   : steve callahan
*-----------------------------------------------------------------
* date         : 1999-09-08
* version      : 001.00
* programmer   : steve callahan
*-----------------------------------------------------------------
* date         : 1999-10-01
* version      : 001.00
* programmer   : p flor
* modification : rearranged order of tags so that all de's would
*              : come before the pds's
*              : move low-values to actual current-tag-table
*              : area used
*-----------------------------------------------------------------
* date         : 2000-02-10
* version      : 001.00
* programmer   : steve callaan
* modification : added check to ensure that pds tags do not
*              : exceed number of entries in the pds attribute
*              : table (table 8)
*-----------------------------------------------------------------
* date         : 2000-03-30
* version      : 001.00
* programmer   : steve callaan
* modification : corrected handling of occurrence groups in de's
*              : and pdses so that the length of a "fixed" sub-
*              : field will be the shorter of:
*              :     - the bytes remaining in the element
*              :     - the table-defined length for the subfield
*-----------------------------------------------------------------
* date         : 2000-07-10
* version      : 001.00
* programmer   : gopinath joshi
* modification : 00.2 nt changes- added an if statement
*              : 'if 600-ipm-error-pointer-width > 0' in para
*              : 81100-display-bad-ipm-message before statement
*              : 'move all '|' to 600-ipm-error-pointer-line'
*              : to avoid runtime error for preedit on nt 00.2
*-----------------------------------------------------------------
* date         : 2000-10-13
* version      : 002.00
* programmer   : steve callahan
* modification : changed to load tables from the vsam ksds
*              : optimized parameter file via the new table load
*              : apis ip739010 and ip741010.
*              : (previously tables had been loaded from a flat
*              : "one-day" file by ip661030.)
*-----------------------------------------------------------------
* date         : 2000-11-15
* version      : 002.00
* programmer   : steve callahan
* modification : added a check to detect carrier length less than
*              : seven.
*-----------------------------------------------------------------
* date         : 2000-11-29
* version      : 002.00
* programmer   : steve callahan
* modification : corrected handling of lengths for non-canonical
*              : files for elements having subfields.   instead of
*              : using the ll field from the message itself we now
*              : accumulate the lengths from the subfield entries
*              : in the tag table.
*              :
*              : removed extraneous code testing for presence of
*              : carrier tags in the tag table of a tagged record.
*-----------------------------------------------------------------
* date         : 2001-01-12
* version      : 002.00
* programmer   : steve callahan
* modification : corrected posting of first-subfld-ptr in the case
*              : of multiple subfield-group occurrences.
*-----------------------------------------------------------------
* date         : 2001-01-25
* version      : 002.00
* programmer   : steve callahan
* modification : "carrier-too-short" condition changed to check
*              : for >= 8 rather than >= 7.
*-----------------------------------------------------------------
* date         : 2001-03-02
* version      : 002.00
* programmer   : steve callahan
* modification : 1. added "content" to display of bad tag table
*              :    in 81110-display-tag-table
*              : 2. moved check for carrier length < 8 to moment
*              :    we realize it is a carrier.
*-----------------------------------------------------------------
* date         : 2001-05-25
* version      : 002.00
* programmer   : steve callahan
* modification : corrected handling of maximum length of variable
*              : length subfields (de43).
*-----------------------------------------------------------------
* date         : 2001-06-07
* version      : 002.00
* programmer   : steve callahan
* modification : corrected handling of the start position of
*              : absent subfields.  it was zero;  it's now the
*              : same as the preceding subfield.
*-----------------------------------------------------------------
* date         : 2001-09-06
* version      : 002.00
* programmer   : steve callahan
* modification : corrected handling of second occurrence of
*              : subfield one in a pds or de so that the last-
*              : subfield-tag is updated.
*-----------------------------------------------------------------
* date         : 2001-09-27
* version      : 002.00
* programmer   : steve callahan
* modification : initialized ip65504-tcnt to zero and 800-table-
*              : len to the size of the tag table so that proper
*              : initilizing to low values is done at first-time.
*              : moved zero to subfld column in tag table for
*              : items with no subfields.
*-----------------------------------------------------------------
* date         : 2001-12-07
* version      : 002.00
* programmer   : steve callahan
* modification : included test for zero in start and length fields
*              : in paragraph 81110 to avoid invalid damaging
*              : reference modifications.
*-----------------------------------------------------------------
* date         : 2002-01-03
* version      : 002.00
* programmer   : steve callahan
* modification : added check for zero in ll-field.  this error
*              : and non-numeric ll-field get same message.
*              : parser must check this since the 11 key elements
*              : are used in level-1 prior to any edit routines.
*-----------------------------------------------------------------
* date         : 2002-04-05
* version      : 001.02
* programmer   : doug wall
* modification : modified code to recognize de124 as new carrier.
* gcms rel02.1 : to see, do find on gcms21
*-----------------------------------------------------------------
* date         : 2002-04-30
* version      : 002.01
* programmer   : steve callahan
* modification : added code to obtain correct utc timestamp for
* gcms rel02.2 : calls to ip739010 and ip741010.
*-----------------------------------------------------------------
* date         : 2002-06-20
* version      : 002.02
* programmer   : steve callahan
* modification : changed from placing non-parsable element id in
* gcms rel02.2 : tag-table(1) to tag-table(ip65504-t).
*              : added same treatment for non-numeric or 0 lngth.
*-----------------------------------------------------------------
*    project         :gcms release 3.1
*    date            :04/04/2003
*    version         :
*    programmer      :dlh
*-----------------------------------------------------------------
* date         : 2003-02-19
* programmer   : steve callahan
* release      : 4.1
* modification : 1. added logic to check parsed msg length against
*              :    record length.  mismatch gives error msg and
*              :    ipm msg is rejected as unparsable.
*              : 2. corrected logic of '|||' pointers to error
*              :    fields in displayed msg.
*              :     - pointers can now span lines
*              :     - removed risk of overlaying working storage
*              :       with pointers extending beyond column 100.
*-----------------------------------------------------------------
* project      : gcms release 04.1
* date         : 2003-03-05
* programmer   : steve callahan
* modification : correct error code for msg-length error to 2256.
*                eliminated initial move low values to tag-table.
*                set up index item to hold max-tag-no so compare
*                with ip65504-t will be faster.
*-----------------------------------------------------------------
* project     : gcms release 04.1
* date        : 2003-08-07
* programmer  : steve callahan
* modification: when reading a tagged file only tag tables created
*               by our  parsers are to be trusted.  tag tables
*               created by "brand-x" parsers are not credible, and
*               such messages need to be fully parsed despite the
*               presence of a tag table.  to distinguish our tag
*               tables from others we will place a mark in the
*               status field of the first row of any tag table
*               created by our parsers.  the read parser will
*               check for this mark, and do a full parse if it
*               is not present.
*-----------------------------------------------------------------
* project      :ea fix asd02742
* date         :2004/03/11
* programmer   :robert m. jones
* modification :performance enhancement - added index field to
*               limit perform
*-----------------------------------------------------------------
* project      :rel 5.1   asd03684
* date         :2004/12/06
* programmer   :p flor
* modification :eliminate s0c7 abend handling bad pds
*              :- change in 32116-handle-bad-pds-id to check if
*              :  numeric before moving from ip66102-ipm-msg to
*              :  ip65504-tag-no
*-----------------------------------------------------------------
*    project         :scr05598  - 7.2                            *
*    date            :2007/10/12                                 *
*    programmer      :mpact                                      *
*    modification    :modified to raise error if calculated pds  *
*                     carrier length is greater than  provided   *
*                     pds carrier length.                        *
*----------------------------------------------------------------*
*/
