  package com.cloudframe.app.process.impl;
   /* The comment section is too large, 
	 * hence added at the end of the java code 
	 * please scroll all the way to the bottom to see complete comments 
	 */
  
  import java.util.Comparator;
  import java.util.stream.Stream;
  import com.cloudframe.app.ip662010.Ip662010Ctx.*;
  import com.cloudframe.app.ip662010.Ip662010Ctx;
  import com.cloudframe.app.process.Ip662010;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import com.cloudframe.app.process.Ip661020;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.process.*;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.process.Ip739010;
  import com.cloudframe.app.process.Ip741010;
  import com.cloudframe.app.global.sharedvar.Ip65504CurrentTagTable;
  import com.cloudframe.app.global.sharedvar.Ip65504TagArea;
  import com.cloudframe.app.global.sharedvar.Ip65504PdsMap;
  import com.cloudframe.app.global.sharedvar.Ip65504PdsMapEntry;
  import com.cloudframe.app.utility.CFUtil;
  import org.springframework.beans.factory.annotation.Value;
  import java.util.ArrayList;
  import java.util.Map;
  import java.util.HashMap;
  import com.cloudframe.app.ip662010.dto.*;
  import com.cloudframe.app.ip662010.dto.NewTag800;
  import com.cloudframe.app.global.sharedvar.Ip65504TaggedRecordInfo;
  import com.cloudframe.app.ip662010.dto.MessageLengthMsg600;
  import com.cloudframe.app.ip662010.dto.CurrentTag800;
  import com.cloudframe.app.ip662010.dto.TooManyTags600;
  import com.cloudframe.app.ip662010.dto.UndefinedPds600;
  import com.cloudframe.app.global.sharedvar.Ip66102IpmMsg;
  import com.cloudframe.app.ip662010.dto.IpmErrorMsg600;
  import com.cloudframe.app.global.sharedvar.Ip65504SelPdsEntriesAll;
  import com.cloudframe.app.ip662010.dto.CharMapColumns600;
  import com.cloudframe.app.ip662010.dto.LastSubfldTag800;
  import com.cloudframe.app.global.sharedvar.Ip65504SelElemEntriesAll;
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
  
  public class Ip662010Impl extends CommonProcess implements Ip662010 {
  
  Logger logger = LoggerFactory.getLogger(Ip662010Impl.class);
  
  
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
  
  
  private static final int IP65504_TAG_AREA_LENGTH = 11;
  private static final int IP000704_DE_SUB_ATTR_ROW_LENGTH = 70;
  private static final int IP000904_PDS_SUB_ATTR_ROW_LENGTH = 70;
  
  
  
  
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      public int process(Ip662010Ctx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
          ;
//  PERFORM 00000-MAINLINE
          mainline(programCtx.getMainlineInCtx());/*00000-MAINLINE*/
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
      @Override
      public MainlineOutCtx mainline(MainlineInCtx methodIn) throws Exception {
      
// *-----------------------------------------------------------------
// * We perform paragraph 0100- to display compile and current date
// * messages the 1st time in.   each time we will initialize working
// * fields that are required for parsing each specific message.   we
// * perform paragraph 2000- to parse the string.
// *-----------------------------------------------------------------
Ip662010Ctx programCtx = methodIn.getIp662010Ctx();
MainlineOutCtx methodOut = methodIn.getMainlineOutCtx();
//  IF 88-IT-IS-THE-FIRST-TIME
          if ( methodIn.isItIsTheFirstTime88()  ) { 
//  PERFORM 00100-DO-FIRST-TIME-SETUP
              doFirstTimeSetup(programCtx.getDoFirstTimeSetupInCtx());/*00100-DO-FIRST-TIME-SETUP*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
//  PERFORM 20000-INITIALIZE-PARSING-AREAS
          initializeParsingAreas(programCtx);/*20000-INITIALIZE-PARSING-AREAS*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }
//  IF IP66102-RECORD-ALREADY-READ
          if ( methodIn.isIp66102RecordAlreadyRead()  ) { 
//  SET IP66102-WE-GOT-A-MSG TO TRUE
              methodOut.setIp66102WeGotAMsgTrue(); 
              
          }
//  ELSE
          else { 

// *       Read an ipm record into ip66102-ipm-message.
// *       the message length is returned in ip66102-ipm-msg-lngth.
// *       ip66102-is-ipm-file-finished will be 'y' or 'n'.
//  SET IP66102-IPM-IO-WAS-GOOD TO TRUE
              methodOut.setIp66102IpmIoWasGoodTrue(); 
              
//  CALL 800-PTR-IP661020
              // CALL 800-PTR-IP661020
              	programCtx.setRc( ip661020.process(programCtx.getGlobalCtx().getContext("IP661020")));
          }
//  IF IP66102-WE-GOT-A-MSG
          if ( methodOut.isIp66102WeGotAMsg()  ) { 
//  IF IP66102-TAG-TABLE-IS-PRESENT
              if ( methodIn.isIp66102TagTableIsPresent()  ) { 
//  IF IP66102-IPM-MSG ( IP66102-TAG-START + 10 : 1) = 300-READ-PARSER-CHOP OR 300-WRITE-PARSER-CHOP OR 300-IPM-UPDATER-CHOP
                  if (Field.compareChar(methodIn.getIp66102IpmMsg().toCharArray() , methodOut.getReadParserChop300() , ( ((int) (methodIn.getIp66102TagStart() + 10) - 1) /*start*/ ), 1 /*left len*/ , 1 /*right len*/) || Field.compareChar(methodIn.getIp66102IpmMsg().toCharArray() , methodIn.getWriteParserChop300() , ( ((int) (methodIn.getIp66102TagStart() + 10) - 1) /*start*/ ), 1 /*left len*/ , 1 /*right len*/) || Field.compareChar(methodIn.getIp66102IpmMsg().toCharArray() , methodIn.getIpmUpdaterChop300() , ( ((int) (methodIn.getIp66102TagStart() + 10) - 1) /*start*/ ), 1 /*left len*/ , 1 /*right len*/)) { 

// *              It is a trustable tag table
//  PERFORM 40000-PARSE-VIA-TAG-TABLE
                      parseViaTagTable(programCtx.getParseViaTagTableInCtx());/*40000-PARSE-VIA-TAG-TABLE*/
                      if (programCtx.isProgramEnded()) {
                          return methodOut;
                      }
                  }
//  ELSE
                  else { 

// *              It is a "brand-x" tag table so we discard it
//  PERFORM 40005-MOVE-MSG-TO-STD-AREA
                      moveMsgToStdArea(programCtx.getMoveMsgToStdAreaInCtx());/*40005-MOVE-MSG-TO-STD-AREA*/
                      if (programCtx.isProgramEnded()) {
                          return methodOut;
                      }
//  PERFORM 30000-PARSE-THE-MESSAGE
                      parseTheMessage(programCtx.getParseTheMessageInCtx());/*30000-PARSE-THE-MESSAGE*/
                      if (programCtx.isProgramEnded()) {
                          return methodOut;
                      }
//  PERFORM 60000-CHECK-RECORD-LENGTH
                      checkRecordLength(programCtx.getCheckRecordLengthInCtx());/*60000-CHECK-RECORD-LENGTH*/
                      if (programCtx.isProgramEnded()) {
                          return methodOut;
                      }
                  }
              }
//  ELSE
              else { 
//  PERFORM 30000-PARSE-THE-MESSAGE
                  parseTheMessage(programCtx.getParseTheMessageInCtx());/*30000-PARSE-THE-MESSAGE*/
                  if (programCtx.isProgramEnded()) {
                      return methodOut;
                  }
//  PERFORM 60000-CHECK-RECORD-LENGTH
                  checkRecordLength(programCtx.getCheckRecordLengthInCtx());/*60000-CHECK-RECORD-LENGTH*/
                  if (programCtx.isProgramEnded()) {
                      return methodOut;
                  }
              }
          }
//  ELSE
          else { 
//  DISPLAY 300-EOF-MESSAGE
              logger.info(new String(methodIn.getEofMessage300())); 
          }
//  IF IP65504-MESSAGE-STATUS > 0
          if (	( methodIn.getIp65504MessageStatus() > 0 ) ) { 
//  SET IP662011-ERR-INDEX TO IP662011-ERR-SUBSCRIPT
              methodOut.setIp662011ErrIndex(methodIn.getIp662011ErrSubscript()); 
              
//  DISPLAY 'IP662010-' IP662011-READ-PARSER-MSG ( IP662011-ERR-INDEX )
              logger.info("IP662010-{}", new String(methodIn.getIp662011ReadParserMsg(methodOut.getIp662011ErrIndex() - 1))); 
          }
//  MOVE 300-READ-PARSER-CHOP TO IP65504-TAG-STATUS (1)
          methodOut.setIp65504TagStatus(0,methodOut.getReadParserChop300());

// *       Mark this as created by ip662010.
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return methodOut;
      
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
      @Override
      public DoFirstTimeSetupOutCtx doFirstTimeSetup(DoFirstTimeSetupInCtx methodIn) throws Exception {
Ip662010Ctx programCtx = methodIn.getIp662010Ctx();
DoFirstTimeSetupOutCtx methodOut = methodIn.getDoFirstTimeSetupOutCtx();
//  SET 800-PTR-IP661020 TO ENTRY 300-READ-API
          methodOut.setPtrIp661020800(methodIn.getReadApi300()); 
          
//  SET 800-PTR-IP739010 TO ENTRY 300-LOAD-T6-T7
          methodOut.setPtrIp739010800(methodIn.getLoadT6T7300()); 
          
//  SET 800-PTR-IP741010 TO ENTRY 300-LOAD-T8-T9
          methodOut.setPtrIp741010800(methodIn.getLoadT8T9300()); 
          
//  MOVE 'N' TO 100-IS-IT-THE-FIRST-TIME IP65504-IS-FILE-TAGGED
//  LITERAL_N = 'N'
          methodOut.setIsItTheFirstTime100(CONSTANTS.LITERAL_N);
          methodOut.setIp65504IsFileTagged(CONSTANTS.LITERAL_N);

// *          Assume the file is not "tagged".  this will be
// *          reset if we find that the file is tagged.
//  MOVE ZERO TO 400-BAD-MESSAGE-COUNT IP65504-TCNT
          methodOut.setBadMessageCount400((short) 0);
          methodOut.setIp65504Tcnt((short) 0);
//  PERFORM 200-GET-TIMESTAMP-FOR-TABLES
          getTimestampForTables(programCtx);/*200-GET-TIMESTAMP-FOR-TABLES*/
//  CALL 800-PTR-IP739010
          // CALL 800-PTR-IP739010
          	programCtx.setRc( ip739010.process(programCtx.getGlobalCtx().getContext("IP739010")));

// *       If the load is unsuccessful the api will abend

// *       If the load is unsuccessful the api will abend
//  CALL 800-PTR-IP741010
          // CALL 800-PTR-IP741010
          	programCtx.setRc( ip741010.process(programCtx.getGlobalCtx().getContext("IP741010")));
//  DIVIDE LENGTH OF IP65504-CURRENT-TAG-TABLE BY LENGTH OF IP65504-TAG-AREA GIVING 800-MAX-TAG-NO 600-MAX-TAG-NO
          methodOut.setMaxTagNo800( (short) (Ip65504CurrentTagTable.getIp65504CurrentTagTableFieldLength()/Ip65504TagArea.getIp65504TagAreaFieldLength()));
          methodOut.setMaxTagNo600( (int) Ip65504CurrentTagTable.getIp65504CurrentTagTableFieldLength()/Ip65504TagArea.getIp65504TagAreaFieldLength());
//  SET IP65504-T TO 800-MAX-TAG-NO
          methodOut.setIp65504T(methodOut.getMaxTagNo800()); 
          
//  SET 800-MAX-TAG-NO-X TO IP65504-T
          methodOut.setMaxTagNoX800(IP65504_TAG_AREA_LENGTH * ( ((methodOut.getIp65504T() < 1) ? 1:methodOut.getIp65504T()) - 1)); 
          
//  DIVIDE LENGTH OF IP65504-PDS-MAP BY LENGTH OF IP65504-PDS-MAP-ENTRY GIVING 800-MAX-PDS-NO
          methodOut.setMaxPdsNo800( (short) (Ip65504PdsMap.getIp65504PdsMapFieldLength()/Ip65504PdsMapEntry.getIp65504PdsMapEntryFieldLength()));
      
      return methodOut;
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
      @Override
      public GetTimestampForTablesOutCtx getTimestampForTables(Ip662010Ctx programCtx) throws Exception {
GetTimestampForTablesOutCtx methodOut = programCtx.getGetTimestampForTablesOutCtx();
//  MOVE FUNCTION CURRENT-DATE TO IP000608-PROCESSING-DATE-TIME
          methodOut.setIp000608ProcessingDateTime( substring(CFUtil.getCurrentDate(timeZoneId),0,10));
      
      return methodOut;
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
      @Override
      public InitializeParsingAreasOutCtx initializeParsingAreas(Ip662010Ctx programCtx) throws Exception {
InitializeParsingAreasOutCtx methodOut = programCtx.getInitializeParsingAreasOutCtx();

// *---------------------------------------------------------------
// * Each time this program is called we need to re-initialize the
// * pds byte map and the start/length tables for data elements and
// * pdses.
// *---------------------------------------------------------------
//  MOVE SPACES TO IP65504-SEL-PDS-ENTRIES-ALL
          methodOut.getIp65504SelPdsEntriesAll().setString(CONSTANTS.SPACE_3000);
//  PERFORM 20100-MOVE-LOW-VALUES
          moveLowValues(programCtx.getMoveLowValuesInCtx());/*20100-MOVE-LOW-VALUES*/
//  MOVE ZEROES TO IP65504-TCNT IP65504-MESSAGE-STATUS RETURN-CODE
          methodOut.setIp65504Tcnt((short) 0);
          methodOut.setIp65504MessageStatus((short) 0);
          programCtx.setRc(0);
      
      return methodOut;
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
      @Override
      public MoveLowValuesOutCtx moveLowValues(MoveLowValuesInCtx methodIn) throws Exception {
Ip662010Ctx programCtx = methodIn.getIp662010Ctx();
MoveLowValuesOutCtx methodOut = methodIn.getMoveLowValuesOutCtx();

// * Initialize the tag table  with low values
//  IF IP65504-TCNT > 0
          if (	( methodIn.getIp65504Tcnt() > 0 ) ) { 
//  MULTIPLY IP65504-TCNT BY LENGTH OF IP65504-TAG-AREA GIVING 800-TABLE-LEN
              methodOut.setTableLen800( (short) (methodIn.getIp65504Tcnt()*(short) Ip65504TagArea.getIp65504TagAreaFieldLength()));
          }
//  ELSE
          else { 
//  MOVE LENGTH OF IP65504-CURRENT-TAG-TABLE TO 800-TABLE-LEN
              methodOut.setTableLen800((short) Ip65504CurrentTagTable.getIp65504CurrentTagTableFieldLength());
          }
//  MOVE LOW-VALUES TO IP65504-CURRENT-TAG-TABLE (1 : 800-TABLE-LEN )
          methodOut.getIp65504CurrentTagTable().replace(CONSTANTS.LOW_VALUE_1907281621,0,7700/* length */,0,methodOut.getTableLen800() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// * Initialize the de & pds maps and the tagged record
// * information with low values
//  MOVE LOW-VALUES TO IP65504-DE-MAP IP65504-PDS-MAP IP65504-TAGGED-RECORD-INFO
          methodOut.setIp65504DeMap(CONSTANTS.LOW_VALUE_1901534004);
          methodOut.setIp65504PdsMap(CONSTANTS.LOW_VALUE_1149727953);
          methodOut.getIp65504TaggedRecordInfo().setString(CONSTANTS.LOW_VALUE_1703015800);
      
      return methodOut;
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
      @Override
      public ParseTheMessageOutCtx parseTheMessage(ParseTheMessageInCtx methodIn) throws Exception {
Ip662010Ctx programCtx = methodIn.getIp662010Ctx();
ParseTheMessageOutCtx methodOut = methodIn.getParseTheMessageOutCtx();
//  PERFORM 50000-EXPAND-THE-BIT-MAP
          expandTheBitMap(programCtx.getExpandTheBitMapInCtx());/*50000-EXPAND-THE-BIT-MAP*/
//  IF IP65504-SEL-ELEM-ENT (1) = 'X'
//  LITERAL_X = 'X'
          if (methodIn.getIp65504SelElemEnt(0)[0] == 'X') { 

// *       If the second bit-map is present
// *       create mti tag table entry
//  MOVE 1 TO IP65504-TAG-TYPE (1)
              methodOut.setIp65504TagType(0,(short)1);
//  MOVE 0 TO IP65504-TAG-NO (1)
              methodOut.setIp65504TagNo(0,(short)0);
//  MOVE 1 TO IP65504-TAG-STARTS (1)
              methodOut.setIp65504TagStarts(0,(short)1);
//  MOVE 4 TO IP65504-TAG-LNGTH (1)
              methodOut.setIp65504TagLngth(0,(short)4);
              // MOVE 21 TO 400-J
              methodOut.setJ400((short)21);

// *          We set the current ipm message subscript, j, to point
// *          to the first byte after the second bit-map, d001.

// *          Set the tag table index to 1
//  SET IP65504-T TO 1
              methodOut.setIp65504T(1); 
              
//  PERFORM 32000-FIND-ELEMENTS
              findElements(programCtx.getFindElementsInCtx());/*32000-FIND-ELEMENTS*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
//  SET IP65504-TCNT TO IP65504-T
              methodOut.setIp65504Tcnt((short) (short) methodOut.getIp65504T()); 
              
          }

// *          Set the tag counter to the tag-table index
//  ELSE
          else { 
              // MOVE 'D0001' TO 600-IPM-ERROR-ELEMENT-ID
              //  LITERAL_D0001 = 'D0001'
              methodOut.getIpmErrorElementId600().setString(CONSTANTS.LITERAL_D0001);
//  MOVE 600-MISSING-BIT-MAP TO 600-IPM-ERROR-TEXT
              methodOut.setIpmErrorText600(pad(64,methodOut.getMissingBitMap600(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 600-MISSING-BIT-MAP-CODE TO 600-ERROR-CODE IP65504-MESSAGE-STATUS
              methodOut.setErrorCode600( methodOut.getMissingBitMapCode600());
              methodOut.setIp65504MessageStatus((short) methodOut.getMissingBitMapCode600());
//  MOVE 600-MISSING-BIT-MAP-NDX TO IP662011-ERR-SUBSCRIPT
              methodOut.setIp662011ErrSubscript(methodOut.getMissingBitMapNdx600());
              // MOVE 13 TO 400-J
              methodOut.setJ400((short)13);
//  MOVE SPACES TO IP65504-SEL-ELEM-ENTRIES-ALL (65 : 64)
              methodOut.getIp65504SelElemEntriesAll().replace(CONSTANTS.SPACE_64,0,64/* length */,64,64 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
              // MOVE 8 TO 600-IPM-ERROR-POINTER-WIDTH
              methodOut.setIpmErrorPointerWidth600((short)8);
//  MOVE 1 TO IP65504-TCNT
              methodOut.setIp65504Tcnt((short)1);
//  MOVE 1 TO IP65504-TAG-TYPE (1)
              methodOut.setIp65504TagType(0,(short)1);
//  MOVE 1 TO IP65504-TAG-STARTS (1)
              methodOut.setIp65504TagStarts(0,(short)1);
//  MOVE 4 TO IP65504-TAG-LNGTH (1)
              methodOut.setIp65504TagLngth(0,(short)4);
//  PERFORM 81000-PROCESS-BAD-MESSAGE
              processBadMessage(programCtx.getProcessBadMessageInCtx());/*81000-PROCESS-BAD-MESSAGE*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
      
      return methodOut;
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
      @Override
      public FindElementsOutCtx findElements(FindElementsInCtx methodIn) throws Exception {
Ip662010Ctx programCtx = methodIn.getIp662010Ctx();
FindElementsOutCtx methodOut = methodIn.getFindElementsOutCtx();

// *    Scan the byte-map for "x"s.  we start with position 2, since
// *    we've already handled de001, the second bit-map.
//  PERFORM VARYING 400-I FROM 2 BY 1 UNTIL 400-I > 128
          for (methodOut.setI400(2); (	( methodOut.getI400() <= 128 ) ) ; methodOut.setI400(methodOut.getI400() + 1) ) {
//  IF IP65504-SEL-ELEM-ENT ( 400-I ) = 'X'
//  LITERAL_X = 'X'
              if (methodIn.getIp65504SelElemEnt(methodOut.getI400() - 1)[0] == 'X') { 
//  SET IP65504-D TO 400-I
                  methodOut.setIp65504D(methodOut.getI400()); 
                  
//  MOVE HIGH-VALUES TO IP65504-DE-MAP-ENTRY ( IP65504-D )
                  methodOut.setIp65504DeMapEntry(methodOut.getIp65504D() - 1,CONSTANTS.HIGH_VALUE_1986603393);

// *             This is the "null" value for the "first-subfld"
// *             index.  low-values would be identical to an index to
// *             the first entry in the tag table--i.e, offset zero.
//  SET IP000604-I TO 400-I
                  methodOut.setIp000604I(methodOut.getI400()); 
                  
//  IF IP000604-DE-SUBFLDS ( IP000604-I ) = 0
                  if (	( methodIn.getIp000604DeSubflds(methodOut.getIp000604I() - 1) == 0 ) ) { 

// *             There are no subfields, so enter the whole element
//  PERFORM 32100-ENTER-WHOLE-DATA-ELEMENT
                      enterWholeDataElement(programCtx.getEnterWholeDataElementInCtx());/*32100-ENTER-WHOLE-DATA-ELEMENT*/
                      if (programCtx.isProgramEnded()) {
                          return methodOut;
                      }
                  }
//  ELSE
                  else { 
//  PERFORM 32103-ENTER-DE-SUBFIELD-INFO
                      enterDeSubfieldInfo(programCtx.getEnterDeSubfieldInfoInCtx());/*32103-ENTER-DE-SUBFIELD-INFO*/
                      if (programCtx.isProgramEnded()) {
                          return methodOut;
                      }
                  }
              }
          }

// *    Check for pds carriers
//  IF IP65504-DE-START (48) > 0
          if (	( methodOut.getIp65504DeStart(47) > 0 ) ) { 
//  MOVE IP65504-DE-START (48) TO 400-J
              methodOut.setJ400(methodOut.getIp65504DeStart(47));
              // MOVE 48 TO 400-I
              methodOut.setI400((short)48);
//  PERFORM 32110-ENTER-PDS-INFO
              enterPdsInfo(programCtx.getEnterPdsInfoInCtx());/*32110-ENTER-PDS-INFO*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
//  IF IP65504-DE-START (62) > 0
          if (	( methodOut.getIp65504DeStart(61) > 0 ) ) { 
//  MOVE IP65504-DE-START (62) TO 400-J
              methodOut.setJ400(methodOut.getIp65504DeStart(61));
              // MOVE 62 TO 400-I
              methodOut.setI400((short)62);
//  PERFORM 32110-ENTER-PDS-INFO
              enterPdsInfo(programCtx.getEnterPdsInfoInCtx());/*32110-ENTER-PDS-INFO*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
//  IF IP65504-DE-START (123) > 0
          if (	( methodOut.getIp65504DeStart(122) > 0 ) ) { 
//  MOVE IP65504-DE-START (123) TO 400-J
              methodOut.setJ400(methodOut.getIp65504DeStart(122));
              // MOVE 123 TO 400-I
              methodOut.setI400((short)123);
//  PERFORM 32110-ENTER-PDS-INFO
              enterPdsInfo(programCtx.getEnterPdsInfoInCtx());/*32110-ENTER-PDS-INFO*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
//  IF IP65504-DE-START (124) > 0
          if (	( methodOut.getIp65504DeStart(123) > 0 ) ) { 
//  MOVE IP65504-DE-START (124) TO 400-J
              methodOut.setJ400(methodOut.getIp65504DeStart(123));
              // MOVE 124 TO 400-I
              methodOut.setI400((short)124);
//  PERFORM 32110-ENTER-PDS-INFO
              enterPdsInfo(programCtx.getEnterPdsInfoInCtx());/*32110-ENTER-PDS-INFO*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
//  IF IP65504-DE-START (125) > 0
          if (	( methodOut.getIp65504DeStart(124) > 0 ) ) { 
//  MOVE IP65504-DE-START (125) TO 400-J
              methodOut.setJ400(methodOut.getIp65504DeStart(124));
              // MOVE 125 TO 400-I
              methodOut.setI400((short)125);
//  PERFORM 32110-ENTER-PDS-INFO
              enterPdsInfo(programCtx.getEnterPdsInfoInCtx());/*32110-ENTER-PDS-INFO*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
//  IF IP65504-DE-START (127) > 0
          if (	( methodOut.getIp65504DeStart(126) > 0 ) ) { 
//  MOVE IP65504-DE-START (127) TO 400-J
              methodOut.setJ400(methodOut.getIp65504DeStart(126));
              // MOVE 127 TO 400-I
              methodOut.setI400((short)127);
//  PERFORM 32110-ENTER-PDS-INFO
              enterPdsInfo(programCtx.getEnterPdsInfoInCtx());/*32110-ENTER-PDS-INFO*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
      
      return methodOut;
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
      @Override
      public EnterWholeDataElementOutCtx enterWholeDataElement(EnterWholeDataElementInCtx methodIn) throws Exception {
Ip662010Ctx programCtx = methodIn.getIp662010Ctx();
EnterWholeDataElementOutCtx methodOut = methodIn.getEnterWholeDataElementOutCtx();
//  SET IP65504-T UP BY 1
          methodOut.setIp65504T(methodOut.getIp65504T() + 1); 
          

// *       Count this tag-table entry

// *      Check to see if the tag table is big enough for this entry

// *      Mark it as a data element rather than pds or mti
//  PERFORM 32106-CHECK-TAG-LIMIT
          checkTagLimit(programCtx.getCheckTagLimitInCtx());/*32106-CHECK-TAG-LIMIT*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }
//  MOVE 2 TO IP65504-TAG-TYPE ( IP65504-T )
          methodOut.setIp65504TagType(methodOut.getIp65504T() - 1,(short)2);
//  MOVE 400-I TO IP65504-TAG-NO ( IP65504-T )
          methodOut.setIp65504TagNo(methodOut.getIp65504T() - 1,methodOut.getI400());
//  MOVE ZERO TO IP65504-TAG-SUB-FLD-NO ( IP65504-T )
          methodOut.setIp65504TagSubFldNo(methodOut.getIp65504T() - 1,(short) 0);
//  PERFORM 32101-STORE-DE-LENGTH
          storeDeLength(programCtx.getStoreDeLengthInCtx());/*32101-STORE-DE-LENGTH*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }
//  MOVE 400-J TO IP65504-TAG-STARTS ( IP65504-T ) IP65504-DE-START ( 400-I )
          methodOut.setIp65504TagStarts(methodOut.getIp65504T() - 1,methodOut.getJ400());
          methodOut.setIp65504DeStart(methodOut.getI400() - 1,methodOut.getJ400());
//  MOVE IP65504-DE-LNGTH ( 400-I ) TO IP65504-TAG-LNGTH ( IP65504-T )
          methodOut.setIp65504TagLngth(methodOut.getIp65504T() - 1,methodOut.getIp65504DeLngth(methodOut.getI400() - 1));
//  IF ( 400-I = 48 OR 62 OR 123 OR 124 OR 125 OR 127)
          if ((	( methodOut.getI400() == 48 )  || 	( methodOut.getI400() == 62 )  || 	( methodOut.getI400() == 123 )  || 	( methodOut.getI400() == 124 )  || 	( methodOut.getI400() == 125 )  || 	( methodOut.getI400() == 127 ) )) { 

// *       This is a "pds carrier"

// *          The carrier is too short to contain a pds prefix
// *          and one byte of data
//  IF IP65504-DE-LNGTH ( 400-I ) < 8
              if (	( methodOut.getIp65504DeLngth(methodOut.getI400() - 1) < 8 ) ) { 
//  PERFORM 32119-HANDLE-SHORT-CARRIER
                  handleShortCarrier(programCtx.getHandleShortCarrierInCtx());/*32119-HANDLE-SHORT-CARRIER*/
                  if (programCtx.isProgramEnded()) {
                      return methodOut;
                  }
              }
//  SET IP65504-T DOWN BY 1
              methodOut.setIp65504T(methodOut.getIp65504T() - 1); 
              
          }

// *       Suppress the tag table entry for any carrier.
//  ADD IP65504-DE-LNGTH ( 400-I ) TO 400-J
          methodOut.setJ400( (short) (methodOut.getJ400()+methodOut.getIp65504DeLngth(methodOut.getI400() - 1)));
      
      return methodOut;
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
      @Override
      public StoreDeLengthOutCtx storeDeLength(StoreDeLengthInCtx methodIn) throws Exception {
Ip662010Ctx programCtx = methodIn.getIp662010Ctx();
StoreDeLengthOutCtx methodOut = methodIn.getStoreDeLengthOutCtx();

// *    Numeric.
// *-----------------------------------------------------------------
//  EVALUATE IP000604-DE-LLL-SIZE ( 400-I )
          switch(methodOut.getIp000604DeLllSize(methodIn.getI400() - 1)){
          	case 0:
//  MOVE IP000604-DE-MIN-LNGTH ( 400-I ) TO IP65504-DE-LNGTH ( 400-I )
              methodOut.setIp65504DeLngth(methodIn.getI400() - 1,methodOut.getIp000604DeMinLngth(methodIn.getI400() - 1));
          break;
          	case 2:
//  IF IP66102-IPM-MSG ( 400-J : 2) IS NUMERIC AND IP66102-IPM-MSG ( 400-J : 2) NOT = '00'
//  LITERAL_00 = '00'
              if (    isNumeric(substring(methodOut.getIp66102IpmMsg().getCharArray(),(methodOut.getJ400()-1), (methodOut.getJ400() + 1) )) && !(Field.compareChar(methodOut.getIp66102IpmMsg().toCharArray() , CONSTANTS.LITERAL_00 , ( (methodOut.getJ400() - 1) /*start*/ ), 2 /*left len*/ , 2 /*right len*/))) { 
//  MOVE IP66102-IPM-MSG ( 400-J : 2) TO IP65504-DE-LNGTH ( 400-I )
                  methodOut.setIp65504DeLngth(methodIn.getI400() - 1,CFUtil.getShort(substring(methodOut.getIp66102IpmMsg().getCharArray(),(methodOut.getJ400()-1), (methodOut.getJ400() + 1) )));
//  ADD 2 TO 400-J
                  methodOut.setJ400( (short) (methodOut.getJ400()+(short)2));
              }
//  ELSE
              else { 
                  // MOVE 2 TO 600-IPM-ERROR-POINTER-WIDTH
                  methodOut.setIpmErrorPointerWidth600((short)2);
//  PERFORM 80000-HANDLE-BAD-LENGTH-FIELD
                  handleBadLengthField(programCtx.getHandleBadLengthFieldInCtx());/*80000-HANDLE-BAD-LENGTH-FIELD*/
                  if (programCtx.isProgramEnded()) {
                      return methodOut;
                  }
              }
          break;
          	case 3:
//  IF IP66102-IPM-MSG ( 400-J : 3) IS NUMERIC AND IP66102-IPM-MSG ( 400-J : 3) NOT = '000'
//  LITERAL_000 = '000'
              if (    isNumeric(substring(methodOut.getIp66102IpmMsg().getCharArray(),(methodOut.getJ400()-1), (methodOut.getJ400() + 2) )) && !(Field.compareChar(methodOut.getIp66102IpmMsg().toCharArray() , CONSTANTS.LITERAL_000 , ( (methodOut.getJ400() - 1) /*start*/ ), 3 /*left len*/ , 3 /*right len*/))) { 
//  MOVE IP66102-IPM-MSG ( 400-J : 3) TO IP65504-DE-LNGTH ( 400-I )
                  methodOut.setIp65504DeLngth(methodIn.getI400() - 1,CFUtil.getShort(substring(methodOut.getIp66102IpmMsg().getCharArray(),(methodOut.getJ400()-1), (methodOut.getJ400() + 2) )));
//  ADD 3 TO 400-J
                  methodOut.setJ400( (short) (methodOut.getJ400()+(short)3));
              }
//  ELSE
              else { 
                  // MOVE 3 TO 600-IPM-ERROR-POINTER-WIDTH
                  methodOut.setIpmErrorPointerWidth600((short)3);
//  PERFORM 80000-HANDLE-BAD-LENGTH-FIELD
                  handleBadLengthField(programCtx.getHandleBadLengthFieldInCtx());/*80000-HANDLE-BAD-LENGTH-FIELD*/
                  if (programCtx.isProgramEnded()) {
                      return methodOut;
                  }
              }
          break;
          default :
//  MOVE IP000604-DE-LLL-SIZE ( 400-I ) TO 600-DISPLAY-NUMBER
//  FORMAT_1564585219 = "Z,ZZ9"
              methodOut.setDisplayNumber600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1564585219,String.valueOf(methodOut.getIp000604DeLllSize(methodIn.getI400() - 1)).toCharArray()));
//  DISPLAY 'IP662010-32101-INVALID TABLE-6 ELEM-IN-LLL(' 400-I ') = ' 600-DISPLAY-NUMBER
              logger.info("IP662010-32101-INVALID TABLE-6 ELEM-IN-LLL({}) = {}", String.valueOf(methodIn.getI400()), new String(methodOut.getDisplayNumber600())); 
//  DISPLAY '               MUST BE 0, 2 OR 3'
              logger.info("               MUST BE 0, 2 OR 3"); 
//  MOVE 300-CODE-661 TO 900-ABEND-CODE
              methodOut.setAbendCode900(methodOut.getCode661300());
//  PERFORM 99999-ABEND
              abend(programCtx.getAbendInCtx());/*99999-ABEND*/
          }
      
      return methodOut;
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
      @Override
      public EnterDeSubfieldInfoOutCtx enterDeSubfieldInfo(EnterDeSubfieldInfoInCtx methodIn) throws Exception {
Ip662010Ctx programCtx = methodIn.getIp662010Ctx();
EnterDeSubfieldInfoOutCtx methodOut = methodIn.getEnterDeSubfieldInfoOutCtx();
          // MOVE 'N' TO 100-DOES-VAR-SUBF-EXIST
          //  LITERAL_N = 'N'
          methodOut.setDoesVarSubfExist100(CONSTANTS.LITERAL_N);
//  MOVE 2 TO 800-NEW-TYPE
          methodOut.setNewType800((short)2);
//  MOVE 400-I TO 800-NEW-NO
          methodOut.setNewNo800(methodOut.getI400());
//  PERFORM 32101-STORE-DE-LENGTH
          storeDeLength(programCtx.getStoreDeLengthInCtx());/*32101-STORE-DE-LENGTH*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }
//  MOVE 400-J TO IP65504-DE-START ( 400-I )
          methodOut.setIp65504DeStart(methodOut.getI400() - 1,methodOut.getJ400());

// *    Link the de-map entry to its first subfield in the tag table
//  SET IP65504-D TO 400-I
          methodOut.setIp65504D(methodOut.getI400()); 
          
//  SET IP65504-T UP BY 1
          methodOut.setIp65504T(methodOut.getIp65504T() + 1); 
          
//  SET IP65504-DE-FIRST-SUBFLD ( IP65504-D ) TO IP65504-T
          methodOut.setIp65504DeFirstSubfld(methodOut.getIp65504D() - 1,IP65504_TAG_AREA_LENGTH * ( ((methodOut.getIp65504T() < 1) ? 1:methodOut.getIp65504T()) - 1)); 
          
//  SET IP65504-T DOWN BY 1
          methodOut.setIp65504T(methodOut.getIp65504T() - 1); 
          
//  ADD IP65504-DE-LNGTH ( 400-I ) TO 400-J GIVING 800-START-OF-NEXT-ELEMENT
          methodOut.setStartOfNextElement800( (short) (methodOut.getJ400()+methodIn.getIp65504DeLngth(methodOut.getI400() - 1)));
//  PERFORM 32104-DO-A-DE-OCCURRENCE-GROUP UNTIL 400-J >= 800-START-OF-NEXT-ELEMENT OR 400-J > IP66102-IPM-MSG-LNGTH
          while (	( methodOut.getJ400() < methodOut.getStartOfNextElement800() ) && 	( methodOut.getJ400() <= methodIn.getIp66102IpmMsgLngth() ) ) {
             doADeOccurrenceGroup(programCtx.getDoADeOccurrenceGroupInCtx());/*32104-DO-A-DE-OCCURRENCE-GROUP*/
             if (programCtx.isProgramEnded()) {
                 return methodOut;
             }
          }
          ;
      
      return methodOut;
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
      @Override
      public DoADeOccurrenceGroupOutCtx doADeOccurrenceGroup(DoADeOccurrenceGroupInCtx methodIn) throws Exception {
Ip662010Ctx programCtx = methodIn.getIp662010Ctx();
DoADeOccurrenceGroupOutCtx methodOut = methodIn.getDoADeOccurrenceGroupOutCtx();

// *    Loop through all the defined subfields once, building a tag
// *    entry for each one
//  SET IP000704-I TO IP000604-DE-FIRST-SUBFLD ( IP000604-I )
          methodOut.setIp000704I((methodIn.getIp000604DeFirstSubfld(methodIn.getIp000604I() - 1)/IP000704_DE_SUB_ATTR_ROW_LENGTH) + 1 ); 
          
//  PERFORM VARYING 400-CURRENT-SUBFLD FROM 1 BY 1 UNTIL 400-J >= 800-START-OF-NEXT-ELEMENT OR 400-CURRENT-SUBFLD > IP000604-DE-SUBFLDS ( IP000604-I )
          for (methodOut.setCurrentSubfld400(1); (	( methodOut.getJ400() < methodIn.getStartOfNextElement800() ) && 	( methodOut.getCurrentSubfld400() <= methodIn.getIp000604DeSubflds(methodIn.getIp000604I() - 1) )) ; methodOut.setCurrentSubfld400(methodOut.getCurrentSubfld400() + 1) ) {
//  PERFORM 32106-CHECK-TAG-LIMIT
              checkTagLimit(programCtx.getCheckTagLimitInCtx());/*32106-CHECK-TAG-LIMIT*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
//  MOVE 400-CURRENT-SUBFLD TO 800-NEW-SUBFLD-NO
              methodOut.setNewSubfldNo800(methodOut.getCurrentSubfld400());
//  MOVE 400-J TO 800-NEW-START
              methodOut.setNewStart800(methodOut.getJ400());
//  IF IP000704-DE-SUB-MIN-LNGTH ( IP000704-I ) LESS THAN IP000704-DE-SUB-MAX-LNGTH ( IP000704-I )
              if (	( methodOut.getIp000704DeSubMinLngth(methodOut.getIp000704I() - 1) < methodIn.getIp000704DeSubMaxLngth(methodOut.getIp000704I() - 1) )) { 

// *          Variable-length subfield; must be delimited by "\"
// *          unless it is the last in the element
//  IF 400-CURRENT-SUBFLD < IP000604-DE-SUBFLDS ( IP000604-I )
                  if (	( methodOut.getCurrentSubfld400() < methodIn.getIp000604DeSubflds(methodIn.getIp000604I() - 1) )) { 
//  PERFORM 32105-DO-DELIMITED-SUBFLD
                      doDelimitedSubfld(programCtx.getDoDelimitedSubfldInCtx());/*32105-DO-DELIMITED-SUBFLD*/
                      if (programCtx.isProgramEnded()) {
                          return methodOut;
                      }
                  }
//  ELSE
                  else { 
//  SUBTRACT 400-J FROM 800-START-OF-NEXT-ELEMENT GIVING 800-NEW-LENGTH
                      methodOut.setNewLength800( (short) (methodIn.getStartOfNextElement800()-methodOut.getJ400()));
//  ADD 800-NEW-LENGTH TO 400-J
                      methodOut.setJ400( (short) (methodOut.getJ400()+methodOut.getNewLength800()));
                  }
              }
//  ELSE
              else { 

// *          Fixed-length subfield
// *          we'll use the shorter of the t7 length and the
// *          remaining length in the data element.
//  SUBTRACT 400-J FROM 800-START-OF-NEXT-ELEMENT GIVING 800-NEW-LENGTH
                  methodOut.setNewLength800( (short) (methodIn.getStartOfNextElement800()-methodOut.getJ400()));
//  IF 800-NEW-LENGTH > IP000704-DE-SUB-MIN-LNGTH ( IP000704-I )
                  if (	( methodOut.getNewLength800() > methodOut.getIp000704DeSubMinLngth(methodOut.getIp000704I() - 1) )) { 
//  MOVE IP000704-DE-SUB-MIN-LNGTH ( IP000704-I ) TO 800-NEW-LENGTH
                      methodOut.setNewLength800(methodOut.getIp000704DeSubMinLngth(methodOut.getIp000704I() - 1));
                  }
//  ADD 800-NEW-LENGTH TO 400-J
                  methodOut.setJ400( (short) (methodOut.getJ400()+methodOut.getNewLength800()));
              }
//  SET IP65504-T UP BY 1
              methodOut.setIp65504T(methodOut.getIp65504T() + 1); 
              

// *          Count this tag-table entry
//  MOVE 800-NEW-TAG TO IP65504-TAG-AREA ( IP65504-T )
              methodOut.setIp65504TagArea(methodOut.getIp65504T() - 1,methodOut.getNewTag800().getCharArray());
//  SET IP000704-I UP BY 1
              methodOut.setIp000704I(methodOut.getIp000704I() + 1); 
              

// *       If we have used up the data, but not yet defined all the
// *       subfields we will insert zero-length tags for all
// *       remaining subfields.
//  IF 400-J >= 800-START-OF-NEXT-ELEMENT AND 400-CURRENT-SUBFLD < IP000604-DE-SUBFLDS ( IP000604-I )
              if (	( methodOut.getJ400() >= methodIn.getStartOfNextElement800() ) && 	( methodOut.getCurrentSubfld400() < methodIn.getIp000604DeSubflds(methodIn.getIp000604I() - 1) )) { 
//  IF IP65504-DE-LNGTH ( 400-I ) < IP000604-DE-MIN-LNGTH ( IP000604-I ) OR 88-100-VAR-SUBF-EXISTS
                  if (	( methodIn.getIp65504DeLngth(methodIn.getI400() - 1) < methodIn.getIp000604DeMinLngth(methodIn.getIp000604I() - 1) ) ||  methodIn.isVarSubfExists88100()  ) { 
//  ADD 1 TO 400-CURRENT-SUBFLD
                      methodOut.setCurrentSubfld400( (short) (methodOut.getCurrentSubfld400()+(short)1));
//  ADD 800-NEW-LENGTH TO 800-NEW-START GIVING 800-NEW-START
                      methodOut.setNewStart800( (short) (methodOut.getNewStart800()+methodOut.getNewLength800()));
//  MOVE ZERO TO 800-NEW-LENGTH
                      methodOut.setNewLength800((short) 0);
//  MOVE SPACE TO 800-NEW-STATUS
                      methodOut.setNewStatus800(CONSTANTS.SPACE);
//  PERFORM UNTIL 400-CURRENT-SUBFLD > IP000604-DE-SUBFLDS ( IP000604-I )
                      while ((	( methodOut.getCurrentSubfld400() <= methodIn.getIp000604DeSubflds(methodIn.getIp000604I() - 1) ))) {
//  MOVE 400-CURRENT-SUBFLD TO 800-NEW-SUBFLD-NO
                          methodOut.setNewSubfldNo800(methodOut.getCurrentSubfld400());
//  SET IP65504-T UP BY 1
                          methodOut.setIp65504T(methodOut.getIp65504T() + 1); 
                          
//  MOVE 800-NEW-TAG TO IP65504-TAG-AREA ( IP65504-T )
                          methodOut.setIp65504TagArea(methodOut.getIp65504T() - 1,methodOut.getNewTag800().getCharArray());
//  SET IP000704-I UP BY 1
                          methodOut.setIp000704I(methodOut.getIp000704I() + 1); 
                          
//  ADD 1 TO 400-CURRENT-SUBFLD
                          methodOut.setCurrentSubfld400( (short) (methodOut.getCurrentSubfld400()+(short)1));
                      }
                  }
              }
          }
      
      return methodOut;
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
      @Override
      public DoDelimitedSubfldOutCtx doDelimitedSubfld(DoDelimitedSubfldInCtx methodIn) throws Exception {
Ip662010Ctx programCtx = methodIn.getIp662010Ctx();
DoDelimitedSubfldOutCtx methodOut = methodIn.getDoDelimitedSubfldOutCtx();
//  SET 88-100-VAR-SUBF-EXISTS TO TRUE
          methodOut.setVarSubfExists88100True(); 
          
//  PERFORM VARYING 400-SUBFLD-LENGTH FROM 0 BY 1 UNTIL 400-SUBFLD-LENGTH = IP000704-DE-SUB-MAX-LNGTH ( IP000704-I ) OR IP66102-IPM-MSG ( 400-J : 1) = '\'
          for (methodOut.setSubfldLength400(0); (	( methodOut.getSubfldLength400() != methodOut.getIp000704DeSubMaxLngth(methodIn.getIp000704I() - 1) ) && methodOut.getJ400() > 0 && methodIn.getIp66102IpmMsg().toCharArray()[getIndex(methodOut.getJ400())] != '\\') ; methodOut.setSubfldLength400(methodOut.getSubfldLength400() + 1) ) {
//  ADD 1 TO 400-J
              methodOut.setJ400( (short) (methodOut.getJ400()+(short)1));
          }
//  IF IP66102-IPM-MSG ( 400-J : 1) = '\'
          if (methodOut.getJ400() > 0 && methodIn.getIp66102IpmMsg().toCharArray()[getIndex(methodOut.getJ400())] == '\\') { 
//  MOVE 400-SUBFLD-LENGTH TO 800-NEW-LENGTH
              methodOut.setNewLength800(methodOut.getSubfldLength400());
//  ADD 1 TO 400-J
              methodOut.setJ400( (short) (methodOut.getJ400()+(short)1));
          }

// *          Skip over the slash
//  ELSE
          else { 
//  MOVE 600-NO-BACKSLASH-CODE TO 600-ERROR-CODE IP65504-MESSAGE-STATUS
              methodOut.setErrorCode600( methodOut.getNoBackslashCode600());
              methodOut.setIp65504MessageStatus((short) methodOut.getNoBackslashCode600());
//  MOVE 600-NO-BACKSLASH TO 600-IPM-ERROR-TEXT
              methodOut.setIpmErrorText600(pad(64,methodOut.getNoBackslash600(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 600-NO-BACKSLASH-NDX TO IP662011-ERR-SUBSCRIPT
              methodOut.setIp662011ErrSubscript(methodOut.getNoBackslashNdx600());
//  SUBTRACT 400-SUBFLD-LENGTH FROM 400-J
              methodOut.setJ400( (short) (methodOut.getJ400()-methodOut.getSubfldLength400()));
//  SET IP65504-T UP BY 1
              methodOut.setIp65504T(methodOut.getIp65504T() + 1); 
              
//  MOVE IP000704-DE-SUB-MAX-LNGTH ( IP000704-I ) TO 600-IPM-ERROR-POINTER-WIDTH IP65504-TAG-LNGTH ( IP65504-T )
              methodOut.setIpmErrorPointerWidth600(methodOut.getIp000704DeSubMaxLngth(methodIn.getIp000704I() - 1));
              methodOut.setIp65504TagLngth(methodOut.getIp65504T() - 1,methodOut.getIp000704DeSubMaxLngth(methodIn.getIp000704I() - 1));
//  MOVE 800-NEW-TYPE TO IP65504-TAG-TYPE ( IP65504-T )
              methodOut.setIp65504TagType(methodOut.getIp65504T() - 1,methodOut.getNewType800());
//  EVALUATE 800-NEW-TYPE
              switch(methodOut.getNewType800()){
              	case 2:
//  MOVE 'D' TO 600-IPM-ERROR-ELEMENT-TYPE
//  LITERAL_D = 'D'
                  methodOut.setIpmErrorElementType600(CONSTANTS.LITERAL_D);
              break;
              	case 3:
//  MOVE 'P' TO 600-IPM-ERROR-ELEMENT-TYPE
//  LITERAL_P = 'P'
                  methodOut.setIpmErrorElementType600(CONSTANTS.LITERAL_P);
              break;
              default :
//  MOVE '?' TO 600-IPM-ERROR-ELEMENT-TYPE
//  LITERAL_34661 = '?'
                  methodOut.setIpmErrorElementType600(CONSTANTS.LITERAL_34661);
              }
//  MOVE 800-NEW-NO TO IP65504-TAG-NO ( IP65504-T ) 600-IPM-ERROR-ELEMENT-NO
              methodOut.setIp65504TagNo(methodOut.getIp65504T() - 1,methodOut.getNewNo800());
              methodOut.setIpmErrorElementNo600(methodOut.getNewNo800());
//  MOVE 800-NEW-START TO IP65504-TAG-STARTS ( IP65504-T )
              methodOut.setIp65504TagStarts(methodOut.getIp65504T() - 1,methodOut.getNewStart800());
//  PERFORM 81000-PROCESS-BAD-MESSAGE
              processBadMessage(programCtx.getProcessBadMessageInCtx());/*81000-PROCESS-BAD-MESSAGE*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
      
      return methodOut;
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
      @Override
      public CheckTagLimitOutCtx checkTagLimit(CheckTagLimitInCtx methodIn) throws Exception {
Ip662010Ctx programCtx = methodIn.getIp662010Ctx();
CheckTagLimitOutCtx methodOut = methodIn.getCheckTagLimitOutCtx();
//  IF IP65504-T GREATER THAN 800-MAX-TAG-NO-X
          if (	( methodIn.getIp65504T() > ( methodIn.getMaxTagNoX800() / 11 ) + 1  )) { 
//  MOVE 600-TOO-MANY-TAGS-CODE TO 600-ERROR-CODE IP65504-MESSAGE-STATUS
              methodOut.setErrorCode600( methodOut.getTooManyTagsCode600());
              methodOut.setIp65504MessageStatus((short) methodOut.getTooManyTagsCode600());
//  MOVE 600-TOO-MANY-TAGS-NDX TO IP662011-ERR-SUBSCRIPT
              methodOut.setIp662011ErrSubscript(methodOut.getTooManyTagsNdx600());
              // MOVE 600-TOO-MANY-TAGS TO 600-IPM-ERROR-TEXT
              methodOut.setIpmErrorText600(methodOut.getTooManyTags600().toCharArray());
//  MOVE 400-K TO 400-J
              methodOut.setJ400(methodOut.getK400());

// *           Point 400-j to the error
//  PERFORM 43000-HANDLE-BAD-TAG
              handleBadTag(programCtx.getHandleBadTagInCtx());/*43000-HANDLE-BAD-TAG*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
      
      return methodOut;
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
      @Override
      public EnterPdsInfoOutCtx enterPdsInfo(EnterPdsInfoInCtx methodIn) throws Exception {
Ip662010Ctx programCtx = methodIn.getIp662010Ctx();
EnterPdsInfoOutCtx methodOut = methodIn.getEnterPdsInfoOutCtx();

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
          methodOut.setK400(methodOut.getJ400());
//  MOVE IP65504-DE-LNGTH ( 400-I ) TO 400-REMAINING-CARRIER-LTH
          methodOut.setRemainingCarrierLth400(methodOut.getIp65504DeLngth(methodIn.getI400() - 1));
//  PERFORM UNTIL 400-REMAINING-CARRIER-LTH LESS THAN OR EQUAL ZERO
          while ((	( methodOut.getRemainingCarrierLth400() > 0 ) )) {
//  MOVE 400-REMAINING-CARRIER-LTH TO 400-REMAINING-CARR-LTH-NUM
              methodOut.setRemainingCarrLthNum400(methodOut.getRemainingCarrierLth400());
//  EVALUATE TRUE
              if  (    !( isNumeric(substring(methodOut.getIp66102IpmMsg().getCharArray(),(methodOut.getK400()-1), (methodOut.getK400() + 3) )) )) { 
//  MOVE 600-NON-NUMERIC-PDS-CODE TO 600-ERROR-CODE IP65504-MESSAGE-STATUS
                  methodOut.setErrorCode600( methodOut.getNonNumericPdsCode600());
                  methodOut.setIp65504MessageStatus((short) methodOut.getNonNumericPdsCode600());
//  MOVE 600-NON-NUMERIC-PDS-NDX TO IP662011-ERR-SUBSCRIPT
                  methodOut.setIp662011ErrSubscript(methodOut.getNonNumericPdsNdx600());
//  MOVE 600-NON-NUMERIC-PDS-ID TO 600-IPM-ERROR-TEXT
                  methodOut.setIpmErrorText600(pad(64,methodOut.getNonNumericPdsId600(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 400-K TO 400-J
                  methodOut.setJ400(methodOut.getK400());

// *               Point 400-j to the error
//  SET IP65504-T UP BY 1
                  methodOut.setIp65504T(methodOut.getIp65504T() + 1); 
                  
//  MOVE 3 TO IP65504-TAG-TYPE ( IP65504-T )
                  methodOut.setIp65504TagType(methodOut.getIp65504T() - 1,(short)3);
//  ADD 7 TO 400-K GIVING IP65504-TAG-STARTS ( IP65504-T )
                  methodOut.setIp65504TagStarts(methodOut.getIp65504T() - 1, (short) (methodOut.getK400()+(short)7));
//  IF IP66102-IPM-MSG ( 400-K + 4 : 3) IS NUMERIC
                  if (    isNumeric(substring(methodOut.getIp66102IpmMsg().getCharArray(),(methodOut.getK400() + 4-1), (methodOut.getK400() + 4 + 2) ))) { 
//  MOVE IP66102-IPM-MSG ( 400-K + 4 : 3) TO IP65504-TAG-LNGTH ( IP65504-T )
                      methodOut.setIp65504TagLngth(methodOut.getIp65504T() - 1,CFUtil.getShort(substring(methodOut.getIp66102IpmMsg().getCharArray(),(methodOut.getK400() + 4-1), (methodOut.getK400() + 4 + 2) )));
                  }
//  PERFORM 32116-HANDLE-BAD-PDS-ID
                  handleBadPdsId(programCtx.getHandleBadPdsIdInCtx());/*32116-HANDLE-BAD-PDS-ID*/
                  if (programCtx.isProgramEnded()) {
                      return methodOut;
                  }
              }
              else if  (    !( isNumeric(substring(methodOut.getIp66102IpmMsg().getCharArray(),(methodOut.getK400() + 4-1), (methodOut.getK400() + 4 + 2) )) ) || Field.compareChar(methodOut.getIp66102IpmMsg().toCharArray() , CONSTANTS.LITERAL_000 , ( (methodOut.getK400() + 4 - 1) /*start*/ ), 3 /*left len*/ , 3 /*right len*/) || 		compareChars(substring(methodOut.getIp66102IpmMsg().getCharArray(),(methodOut.getK400() + 4-1), (methodOut.getK400() + 4 + 2) ),methodIn.getRemainingCarrLthNumX400()) > 0 ) { 

// *            The pds-length is invalid

// *               Point 400-j to the error
//  ADD 4 400-K GIVING 400-J
                  methodOut.setJ400( (short) ((short)4+methodOut.getK400()));
                  // MOVE 3 TO 600-IPM-ERROR-POINTER-WIDTH
                  methodOut.setIpmErrorPointerWidth600((short)3);
//  SET IP65504-T UP BY 1
                  methodOut.setIp65504T(methodOut.getIp65504T() + 1); 
                  
//  MOVE 3 TO IP65504-TAG-TYPE ( IP65504-T )
                  methodOut.setIp65504TagType(methodOut.getIp65504T() - 1,(short)3);
//  MOVE IP66102-IPM-MSG ( 400-K : 4) TO IP65504-TAG-NO ( IP65504-T )
                  methodOut.setIp65504TagNo(methodOut.getIp65504T() - 1,CFUtil.getShort(substring(methodOut.getIp66102IpmMsg().getCharArray(),(methodOut.getK400()-1), (methodOut.getK400() + 3) )));
//  ADD 7 TO 400-K GIVING IP65504-TAG-STARTS ( IP65504-T )
                  methodOut.setIp65504TagStarts(methodOut.getIp65504T() - 1, (short) (methodOut.getK400()+(short)7));
//  PERFORM 80000-HANDLE-BAD-LENGTH-FIELD
                  handleBadLengthField(programCtx.getHandleBadLengthFieldInCtx());/*80000-HANDLE-BAD-LENGTH-FIELD*/
                  if (programCtx.isProgramEnded()) {
                      return methodOut;
                  }
              }
              else   { 

// *           The pds looks good, put it in the tag table and
// *           pds map
//  MOVE IP66102-IPM-MSG ( 400-K : 4) TO 400-PDS-TAG
                  methodOut.setPdsTag400(CFUtil.getShort(substring(methodOut.getIp66102IpmMsg().getCharArray(),(methodOut.getK400()-1), (methodOut.getK400() + 3) )));
//  PERFORM 32110-1-CHECK-FOR-VALID-PDS-NO
                  _1CheckForValidPdsNo(programCtx.get_1CheckForValidPdsNoInCtx());/*32110-1-CHECK-FOR-VALID-PDS-NO*/
                  if (programCtx.isProgramEnded()) {
                      return methodOut;
                  }
//  PERFORM 32111-CHECK-FOR-DUPLICATE-PDS
                  checkForDuplicatePds(programCtx.getCheckForDuplicatePdsInCtx());/*32111-CHECK-FOR-DUPLICATE-PDS*/
                  if (programCtx.isProgramEnded()) {
                      return methodOut;
                  }
//  MOVE 'X' TO IP65504-SEL-PDS-ENT ( 400-PDS-TAG )
//  LITERAL_X = 'X', LITERAL_X = "X"
                  methodOut.setIp65504SelPdsEnt(methodOut.getPdsTag400() - 1,CONSTANTS.LITERAL_X);
//  SET IP65504-P TO 400-PDS-TAG
                  methodOut.setIp65504P(methodOut.getPdsTag400()); 
                  
//  MOVE HIGH-VALUES TO IP65504-PDS-MAP-ENTRY ( IP65504-P )
                  methodOut.setIp65504PdsMapEntry(methodOut.getIp65504P() - 1,CONSTANTS.HIGH_VALUE_1986603393);

// *             This is the "null" value for the "first-subfld"
// *           index. low-values would be identical to an index to
// *           the first entry in the tag table--i.e, offset zero.
//  ADD 7 400-K GIVING IP65504-PDS-START ( IP65504-P )
                  methodOut.setIp65504PdsStart(methodOut.getIp65504P() - 1, (short) ((short)7+methodOut.getK400()));
//  IF IP66102-IPM-MSG ( 400-K + 4 : 3) NUMERIC
                  if (    isNumeric(substring(methodOut.getIp66102IpmMsg().getCharArray(),(methodOut.getK400() + 4-1), (methodOut.getK400() + 4 + 2) ))) { 
//  MOVE IP66102-IPM-MSG ( 400-K + 4 : 3) TO 400-PDS-LENGTH
                      methodOut.setPdsLength400(CFUtil.getShort(substring(methodOut.getIp66102IpmMsg().getCharArray(),(methodOut.getK400() + 4-1), (methodOut.getK400() + 4 + 2) )));
//  MOVE 400-PDS-LENGTH TO IP65504-PDS-LNGTH ( IP65504-P )
                      methodOut.setIp65504PdsLngth(methodOut.getIp65504P() - 1,methodOut.getPdsLength400());
                  }
//  SET IP000804-I TO 400-PDS-TAG
                  methodOut.setIp000804I(methodOut.getPdsTag400()); 
                  
//  IF IP000804-PDS-SUBFLDS ( IP000804-I ) = 0
                  if (	( methodIn.getIp000804PdsSubflds(methodOut.getIp000804I() - 1) == 0 ) ) { 

// *              There are no subfields, so enter the whole pds
//  PERFORM 32112-ENTER-WHOLE-PDS
                      enterWholePds(programCtx.getEnterWholePdsInCtx());/*32112-ENTER-WHOLE-PDS*/
                      if (programCtx.isProgramEnded()) {
                          return methodOut;
                      }
                  }
//  ELSE
                  else { 
//  PERFORM 32113-ENTER-PDS-SUBFIELDS
                      enterPdsSubfields(programCtx.getEnterPdsSubfieldsInCtx());/*32113-ENTER-PDS-SUBFIELDS*/
                      if (programCtx.isProgramEnded()) {
                          return methodOut;
                      }
                  }
//  ADD 7 400-PDS-LENGTH TO 400-K
                  methodOut.setK400( (short) (methodOut.getK400()+(short)7+methodOut.getPdsLength400()));

// *              Position after this pds
//  SUBTRACT 7 400-PDS-LENGTH FROM 400-REMAINING-CARRIER-LTH
                  methodOut.setRemainingCarrierLth400( (short) (methodOut.getRemainingCarrierLth400()-(short)7-methodOut.getPdsLength400()));
              }
          }
      
      return methodOut;
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
      @Override
      public _1CheckForValidPdsNoOutCtx _1CheckForValidPdsNo(_1CheckForValidPdsNoInCtx methodIn) throws Exception {
Ip662010Ctx programCtx = methodIn.getIp662010Ctx();
_1CheckForValidPdsNoOutCtx methodOut = methodIn.get_1CheckForValidPdsNoOutCtx();
//  IF 400-PDS-TAG = ZERO OR 400-PDS-TAG > IP000804-MAX-PDS-NO
          if (	( methodOut.getPdsTag400() == 0 )  || 	( methodOut.getPdsTag400() > methodIn.getIp000804MaxPdsNo() )) { 

// *       The pds-no is invalid
//  MOVE 400-PDS-TAG TO 600-UNDEFINED-PDS-NO IP65504-TAG-NO ( IP65504-T )
              methodOut.setUndefinedPdsNo600(methodOut.getPdsTag400());
              methodOut.setIp65504TagNo(methodIn.getIp65504T() - 1,methodOut.getPdsTag400());
//  MOVE 3 TO IP65504-TAG-TYPE ( IP65504-T )
              methodOut.setIp65504TagType(methodIn.getIp65504T() - 1,(short)3);
//  MOVE 600-UNDEFINED-PDS-CODE TO 600-ERROR-CODE IP65504-MESSAGE-STATUS
              methodOut.setErrorCode600( methodOut.getUndefinedPdsCode600());
              methodOut.setIp65504MessageStatus((short) methodOut.getUndefinedPdsCode600());
//  MOVE 600-UNDEFINED-PDS-NDX TO IP662011-ERR-SUBSCRIPT
              methodOut.setIp662011ErrSubscript(methodOut.getUndefinedPdsNdx600());
              // MOVE 600-UNDEFINED-PDS TO 600-IPM-ERROR-TEXT
              methodOut.setIpmErrorText600(methodOut.getUndefinedPds600().toCharArray());
//  MOVE 400-K TO 400-J
              methodOut.setJ400(methodOut.getK400());

// *          Point 400-j to the error
//  PERFORM 32116-HANDLE-BAD-PDS-ID
              handleBadPdsId(programCtx.getHandleBadPdsIdInCtx());/*32116-HANDLE-BAD-PDS-ID*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
      
      return methodOut;
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
      @Override
      public CheckForDuplicatePdsOutCtx checkForDuplicatePds(CheckForDuplicatePdsInCtx methodIn) throws Exception {
Ip662010Ctx programCtx = methodIn.getIp662010Ctx();
CheckForDuplicatePdsOutCtx methodOut = methodIn.getCheckForDuplicatePdsOutCtx();
//  IF IP65504-PDS-START ( 400-PDS-TAG ) > ZERO
          if (	( methodIn.getIp65504PdsStart(methodOut.getPdsTag400() - 1) > 0 ) ) { 

// *       This is a duplicate pds
//  MOVE 600-DUPLICATE-PDS-CODE TO 600-ERROR-CODE IP65504-MESSAGE-STATUS
              methodOut.setErrorCode600( methodOut.getDuplicatePdsCode600());
              methodOut.setIp65504MessageStatus((short) methodOut.getDuplicatePdsCode600());
//  MOVE 600-DUPLICATE-PDS-NDX TO IP662011-ERR-SUBSCRIPT
              methodOut.setIp662011ErrSubscript(methodOut.getDuplicatePdsNdx600());
//  MOVE 600-DUPLICATE-PDS TO 600-IPM-ERROR-TEXT
              methodOut.setIpmErrorText600(pad(64,methodOut.getDuplicatePds600(),SPACE_CHAR,RIGHT_PAD));
//  SET IP65504-T UP BY 1
              methodOut.setIp65504T(methodOut.getIp65504T() + 1); 
              
//  MOVE 3 TO IP65504-TAG-TYPE ( IP65504-T )
              methodOut.setIp65504TagType(methodOut.getIp65504T() - 1,(short)3);
//  MOVE 400-PDS-TAG TO IP65504-TAG-NO ( IP65504-T )
              methodOut.setIp65504TagNo(methodOut.getIp65504T() - 1,methodOut.getPdsTag400());
//  MOVE 400-K TO 400-J
              methodOut.setJ400(methodOut.getK400());

// *          Point 400-j to the error
//  PERFORM 32116-HANDLE-BAD-PDS-ID
              handleBadPdsId(programCtx.getHandleBadPdsIdInCtx());/*32116-HANDLE-BAD-PDS-ID*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
      
      return methodOut;
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
      @Override
      public EnterWholePdsOutCtx enterWholePds(EnterWholePdsInCtx methodIn) throws Exception {
Ip662010Ctx programCtx = methodIn.getIp662010Ctx();
EnterWholePdsOutCtx methodOut = methodIn.getEnterWholePdsOutCtx();
//  SET IP65504-T UP BY 1
          methodOut.setIp65504T(methodOut.getIp65504T() + 1); 
          
//  PERFORM 32106-CHECK-TAG-LIMIT
          checkTagLimit(programCtx.getCheckTagLimitInCtx());/*32106-CHECK-TAG-LIMIT*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }

// *       Is there room in the tag table for this tag?

// *    Move the tag id to the tag table
//  MOVE 3 TO IP65504-TAG-TYPE ( IP65504-T )
          methodOut.setIp65504TagType(methodOut.getIp65504T() - 1,(short)3);
//  MOVE 400-PDS-TAG TO IP65504-TAG-NO ( IP65504-T )
          methodOut.setIp65504TagNo(methodOut.getIp65504T() - 1,methodOut.getPdsTag400());
//  PERFORM 32117-CHECK-PDS-LIMIT
          checkPdsLimit(programCtx.getCheckPdsLimitInCtx());/*32117-CHECK-PDS-LIMIT*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }

// *       Is this pds number within the defined range?
//  MOVE ZERO TO IP65504-TAG-SUB-FLD-NO ( IP65504-T )
          methodOut.setIp65504TagSubFldNo(methodOut.getIp65504T() - 1,(short) 0);
//  MOVE 400-PDS-LENGTH TO IP65504-TAG-LNGTH ( IP65504-T )
          methodOut.setIp65504TagLngth(methodOut.getIp65504T() - 1,methodOut.getPdsLength400());
//  ADD 7 400-K GIVING IP65504-TAG-STARTS ( IP65504-T )
          methodOut.setIp65504TagStarts(methodOut.getIp65504T() - 1, (short) ((short)7+methodIn.getK400()));
      
      return methodOut;
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
      @Override
      public EnterPdsSubfieldsOutCtx enterPdsSubfields(EnterPdsSubfieldsInCtx methodIn) throws Exception {
Ip662010Ctx programCtx = methodIn.getIp662010Ctx();
EnterPdsSubfieldsOutCtx methodOut = methodIn.getEnterPdsSubfieldsOutCtx();
          // MOVE 'N' TO 100-DOES-VAR-SUBF-EXIST
          //  LITERAL_N = 'N'
          methodOut.setDoesVarSubfExist100(CONSTANTS.LITERAL_N);
//  MOVE 3 TO 800-NEW-TYPE
          methodOut.setNewType800((short)3);
//  MOVE 400-PDS-TAG TO 800-NEW-NO
          methodOut.setNewNo800(methodOut.getPdsTag400());
//  MOVE 400-K TO 400-M
          methodOut.setM400(methodOut.getK400());
//  ADD 7 TO 400-M
          methodOut.setM400( (short) (methodOut.getM400()+(short)7));
//  ADD 400-PDS-LENGTH TO 400-M GIVING 800-START-OF-NEXT-ELEMENT
          methodOut.setStartOfNextElement800( (short) (methodOut.getM400()+methodIn.getPdsLength400()));

// *    Link the pds-map entry to its first subfld in the tag table
//  SET IP65504-P TO 800-NEW-NO
          methodOut.setIp65504P(methodOut.getNewNo800()); 
          
//  SET IP65504-T UP BY 1
          methodOut.setIp65504T(methodOut.getIp65504T() + 1); 
          
//  SET IP65504-PDS-FIRST-SUBFLD ( IP65504-P ) TO IP65504-T
          methodOut.setIp65504PdsFirstSubfld(methodOut.getIp65504P() - 1,IP65504_TAG_AREA_LENGTH * ( ((methodOut.getIp65504T() < 1) ? 1:methodOut.getIp65504T()) - 1)); 
          
//  SET IP65504-T DOWN BY 1
          methodOut.setIp65504T(methodOut.getIp65504T() - 1); 
          
//  PERFORM 32114-DO-A-PDS-OCCURRENCE-GRP UNTIL 400-M >= 800-START-OF-NEXT-ELEMENT
          while (	( methodOut.getM400() < methodOut.getStartOfNextElement800() )) {
             doAPdsOccurrenceGrp(programCtx.getDoAPdsOccurrenceGrpInCtx());/*32114-DO-A-PDS-OCCURRENCE-GRP*/
             if (programCtx.isProgramEnded()) {
                 return methodOut;
             }
          }
          ;
      
      return methodOut;
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
      @Override
      public DoAPdsOccurrenceGrpOutCtx doAPdsOccurrenceGrp(DoAPdsOccurrenceGrpInCtx methodIn) throws Exception {
Ip662010Ctx programCtx = methodIn.getIp662010Ctx();
DoAPdsOccurrenceGrpOutCtx methodOut = methodIn.getDoAPdsOccurrenceGrpOutCtx();

// *    Loop through all the defined subfields once, building a tag
// *    entry for each one
//  SET IP000904-I TO IP000804-PDS-FIRST-SUBFLD ( IP000804-I )
          methodOut.setIp000904I((methodIn.getIp000804PdsFirstSubfld(methodIn.getIp000804I() - 1)/IP000904_PDS_SUB_ATTR_ROW_LENGTH) + 1 ); 
          
//  PERFORM VARYING 400-CURRENT-SUBFLD FROM 1 BY 1 UNTIL 400-CURRENT-SUBFLD > IP000804-PDS-SUBFLDS ( IP000804-I ) OR 400-M >= 800-START-OF-NEXT-ELEMENT
          for (methodOut.setCurrentSubfld400(1); (	( methodOut.getCurrentSubfld400() <= methodIn.getIp000804PdsSubflds(methodIn.getIp000804I() - 1) ) && 	( methodOut.getM400() < methodIn.getStartOfNextElement800() )) ; methodOut.setCurrentSubfld400(methodOut.getCurrentSubfld400() + 1) ) {
//  SET IP65504-T UP BY 1
              methodOut.setIp65504T(methodOut.getIp65504T() + 1); 
              

// *       Count this tag-table entry
//  PERFORM 32106-CHECK-TAG-LIMIT
              checkTagLimit(programCtx.getCheckTagLimitInCtx());/*32106-CHECK-TAG-LIMIT*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
//  MOVE 400-CURRENT-SUBFLD TO 800-NEW-SUBFLD-NO
              methodOut.setNewSubfldNo800(methodOut.getCurrentSubfld400());
//  MOVE 400-M TO 800-NEW-START
              methodOut.setNewStart800(methodOut.getM400());
//  IF IP000904-PDS-SUB-MIN-LNGTH ( IP000904-I ) LESS THAN IP000904-PDS-SUB-MAX-LNGTH ( IP000904-I )
              if (	( methodOut.getIp000904PdsSubMinLngth(methodOut.getIp000904I() - 1) < methodIn.getIp000904PdsSubMaxLngth(methodOut.getIp000904I() - 1) )) { 

// *          Variable-length subfield; must be delimited by "\"
// *          unless they are the last in the element
//  IF 400-CURRENT-SUBFLD < IP000804-PDS-SUBFLDS ( IP000804-I )
                  if (	( methodOut.getCurrentSubfld400() < methodIn.getIp000804PdsSubflds(methodIn.getIp000804I() - 1) )) { 
//  PERFORM 32115-DO-DELIMITED-PDS-SUBFLD
                      doDelimitedPdsSubfld(programCtx.getDoDelimitedPdsSubfldInCtx());/*32115-DO-DELIMITED-PDS-SUBFLD*/
                      if (programCtx.isProgramEnded()) {
                          return methodOut;
                      }
                  }
//  ELSE
                  else { 
//  SUBTRACT 400-M FROM 800-START-OF-NEXT-ELEMENT GIVING 800-NEW-LENGTH
                      methodOut.setNewLength800( (short) (methodIn.getStartOfNextElement800()-methodOut.getM400()));
//  ADD 800-NEW-LENGTH TO 400-M
                      methodOut.setM400( (short) (methodOut.getM400()+methodOut.getNewLength800()));
                  }
              }
//  ELSE
              else { 

// *          Fixed-length subfield
// *          we'll use the shorter of the t7 length and the
// *          remaining length in the data element.
//  SUBTRACT 400-M FROM 800-START-OF-NEXT-ELEMENT GIVING 800-NEW-LENGTH
                  methodOut.setNewLength800( (short) (methodIn.getStartOfNextElement800()-methodOut.getM400()));
//  IF 800-NEW-LENGTH > IP000904-PDS-SUB-MIN-LNGTH ( IP000904-I )
                  if (	( methodOut.getNewLength800() > methodOut.getIp000904PdsSubMinLngth(methodOut.getIp000904I() - 1) )) { 
//  MOVE IP000904-PDS-SUB-MIN-LNGTH ( IP000904-I ) TO 800-NEW-LENGTH
                      methodOut.setNewLength800(methodOut.getIp000904PdsSubMinLngth(methodOut.getIp000904I() - 1));
                  }
//  ADD 800-NEW-LENGTH TO 400-M
                  methodOut.setM400( (short) (methodOut.getM400()+methodOut.getNewLength800()));
              }
//  MOVE 800-NEW-TAG TO IP65504-TAG-AREA ( IP65504-T )
              methodOut.setIp65504TagArea(methodOut.getIp65504T() - 1,methodOut.getNewTag800().getCharArray());
//  SET IP000904-I UP BY 1
              methodOut.setIp000904I(methodOut.getIp000904I() + 1); 
              
//  IF 400-M >= 800-START-OF-NEXT-ELEMENT AND 400-CURRENT-SUBFLD < IP000804-PDS-SUBFLDS ( IP000804-I )
              if (	( methodOut.getM400() >= methodIn.getStartOfNextElement800() ) && 	( methodOut.getCurrentSubfld400() < methodIn.getIp000804PdsSubflds(methodIn.getIp000804I() - 1) )) { 
//  IF 88-100-VAR-SUBF-EXISTS OR 400-PDS-LENGTH < IP000804-PDS-MIN-LNGTH ( IP000804-I )
                  if ( methodIn.isVarSubfExists88100()   || 	( methodIn.getPdsLength400() < methodIn.getIp000804PdsMinLngth(methodIn.getIp000804I() - 1) )) { 
//  ADD 1 TO 400-CURRENT-SUBFLD
                      methodOut.setCurrentSubfld400( (short) (methodOut.getCurrentSubfld400()+(short)1));
//  ADD 800-NEW-LENGTH TO 800-NEW-START GIVING 800-NEW-START
                      methodOut.setNewStart800( (short) (methodOut.getNewStart800()+methodOut.getNewLength800()));
//  MOVE ZERO TO 800-NEW-LENGTH
                      methodOut.setNewLength800((short) 0);
//  MOVE SPACE TO 800-NEW-STATUS
                      methodOut.setNewStatus800(CONSTANTS.SPACE);
//  PERFORM UNTIL 400-CURRENT-SUBFLD > IP000804-PDS-SUBFLDS ( IP000804-I )
                      while ((	( methodOut.getCurrentSubfld400() <= methodIn.getIp000804PdsSubflds(methodIn.getIp000804I() - 1) ))) {
//  MOVE 400-CURRENT-SUBFLD TO 800-NEW-SUBFLD-NO
                          methodOut.setNewSubfldNo800(methodOut.getCurrentSubfld400());
//  SET IP65504-T UP BY 1
                          methodOut.setIp65504T(methodOut.getIp65504T() + 1); 
                          
//  MOVE 800-NEW-TAG TO IP65504-TAG-AREA ( IP65504-T )
                          methodOut.setIp65504TagArea(methodOut.getIp65504T() - 1,methodOut.getNewTag800().getCharArray());
//  SET IP000904-I UP BY 1
                          methodOut.setIp000904I(methodOut.getIp000904I() + 1); 
                          
//  ADD 1 TO 400-CURRENT-SUBFLD
                          methodOut.setCurrentSubfld400( (short) (methodOut.getCurrentSubfld400()+(short)1));
                      }
                  }
              }
          }
      
      return methodOut;
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
      @Override
      public DoDelimitedPdsSubfldOutCtx doDelimitedPdsSubfld(DoDelimitedPdsSubfldInCtx methodIn) throws Exception {
Ip662010Ctx programCtx = methodIn.getIp662010Ctx();
DoDelimitedPdsSubfldOutCtx methodOut = methodIn.getDoDelimitedPdsSubfldOutCtx();
//  SET 88-100-VAR-SUBF-EXISTS TO TRUE
          methodOut.setVarSubfExists88100True(); 
          
//  PERFORM VARYING 400-SUBFLD-LENGTH FROM 0 BY 1 UNTIL 400-SUBFLD-LENGTH > IP000904-PDS-SUB-MAX-LNGTH ( IP000904-I ) OR IP66102-IPM-MSG ( 400-M : 1) = '\'
          for (methodOut.setSubfldLength400(0); (	( methodOut.getSubfldLength400() <= methodOut.getIp000904PdsSubMaxLngth(methodIn.getIp000904I() - 1) ) && methodOut.getM400() > 0 && methodIn.getIp66102IpmMsg().toCharArray()[getIndex(methodOut.getM400())] != '\\') ; methodOut.setSubfldLength400(methodOut.getSubfldLength400() + 1) ) {
//  ADD 1 TO 400-M
              methodOut.setM400( (short) (methodOut.getM400()+(short)1));
          }
//  IF IP66102-IPM-MSG ( 400-M : 1) = '\'
          if (methodOut.getM400() > 0 && methodIn.getIp66102IpmMsg().toCharArray()[getIndex(methodOut.getM400())] == '\\') { 
//  MOVE 400-SUBFLD-LENGTH TO 800-NEW-LENGTH
              methodOut.setNewLength800(methodOut.getSubfldLength400());
//  ADD 1 TO 400-M
              methodOut.setM400( (short) (methodOut.getM400()+(short)1));
          }

// *          Skip over the slash
//  ELSE
          else { 
//  MOVE 600-NO-BACKSLASH-CODE TO 600-ERROR-CODE IP65504-MESSAGE-STATUS
              methodOut.setErrorCode600( methodOut.getNoBackslashCode600());
              methodOut.setIp65504MessageStatus((short) methodOut.getNoBackslashCode600());
//  MOVE 600-NO-BACKSLASH-NDX TO IP662011-ERR-SUBSCRIPT
              methodOut.setIp662011ErrSubscript(methodOut.getNoBackslashNdx600());
//  MOVE 600-NO-BACKSLASH TO 600-IPM-ERROR-TEXT
              methodOut.setIpmErrorText600(pad(64,methodOut.getNoBackslash600(),SPACE_CHAR,RIGHT_PAD));
//  SUBTRACT 400-SUBFLD-LENGTH FROM 400-M
              methodOut.setM400( (short) (methodOut.getM400()-methodOut.getSubfldLength400()));
//  MOVE 400-M TO 400-J
              methodOut.setJ400(methodOut.getM400());
//  MOVE IP000904-PDS-SUB-MAX-LNGTH ( IP000904-I ) TO 600-IPM-ERROR-POINTER-WIDTH
              methodOut.setIpmErrorPointerWidth600(methodOut.getIp000904PdsSubMaxLngth(methodIn.getIp000904I() - 1));
//  SET IP65504-T UP BY 1
              methodOut.setIp65504T(methodOut.getIp65504T() + 1); 
              
//  MOVE 800-NEW-TYPE TO IP65504-TAG-TYPE ( IP65504-T )
              methodOut.setIp65504TagType(methodOut.getIp65504T() - 1,methodOut.getNewType800());
//  MOVE 800-NEW-NO TO IP65504-TAG-NO ( IP65504-T )
              methodOut.setIp65504TagNo(methodOut.getIp65504T() - 1,methodOut.getNewNo800());
//  MOVE 800-NEW-START TO IP65504-TAG-STARTS ( IP65504-T )
              methodOut.setIp65504TagStarts(methodOut.getIp65504T() - 1,methodOut.getNewStart800());
//  PERFORM 81000-PROCESS-BAD-MESSAGE
              processBadMessage(programCtx.getProcessBadMessageInCtx());/*81000-PROCESS-BAD-MESSAGE*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
      
      return methodOut;
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
      @Override
      public HandleBadPdsIdOutCtx handleBadPdsId(HandleBadPdsIdInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			// End of variable declaration

Ip662010Ctx programCtx = methodIn.getIp662010Ctx();
HandleBadPdsIdOutCtx methodOut = methodIn.getHandleBadPdsIdOutCtx();
          // MOVE 4 TO 600-IPM-ERROR-POINTER-WIDTH
          methodOut.setIpmErrorPointerWidth600((short)4);
//  STRING 'P' IP66102-IPM-MSG ( 400-J : 4) DELIMITED BY SIZE INTO 600-IPM-ERROR-ELEMENT-ID
          charArray = new ArrayList<char[]>();
             charArray.add(CONSTANTS.LITERAL_P);
             charArray.add(substring(methodOut.getIp66102IpmMsg().getCharArray(),(methodIn.getJ400()-1), (methodIn.getJ400() + 3) ));
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1));
          updated = updateString(methodOut.getIpmErrorElementId600().toCharArray() ,joinCharArray);
          methodOut.getIpmErrorElementId600().setString(  (char[])updated.get("string"));
//  MOVE '3' TO IP65504-TAG-TYPE ( IP65504-T )
          methodOut.setIp65504TagType(methodIn.getIp65504T() - 1,(short)3);

// ****************  Rel 5.1 change begin   ****************
//  IF IP66102-IPM-MSG ( 400-J : 4) IS NUMERIC
          if (    isNumeric(substring(methodOut.getIp66102IpmMsg().getCharArray(),(methodIn.getJ400()-1), (methodIn.getJ400() + 3) ))) { 
//  MOVE IP66102-IPM-MSG ( 400-J : 4) TO IP65504-TAG-NO ( IP65504-T )
              methodOut.setIp65504TagNo(methodIn.getIp65504T() - 1,CFUtil.getShort(substring(methodOut.getIp66102IpmMsg().getCharArray(),(methodIn.getJ400()-1), (methodIn.getJ400() + 3) )));
          }

// ****************  Rel 5.1 change end     ****************
//  ADD 7 TO 400-J GIVING IP65504-TAG-STARTS ( IP65504-T )
          methodOut.setIp65504TagStarts(methodIn.getIp65504T() - 1, (short) (methodIn.getJ400()+(short)7));
//  IF IP66102-IPM-MSG ( 400-J + 4 : 3) IS NUMERIC
          if (    isNumeric(substring(methodOut.getIp66102IpmMsg().getCharArray(),(methodIn.getJ400() + 4-1), (methodIn.getJ400() + 4 + 2) ))) { 
//  MOVE IP66102-IPM-MSG ( 400-J + 4 : 3) TO IP65504-TAG-LNGTH ( IP65504-T )
              methodOut.setIp65504TagLngth(methodIn.getIp65504T() - 1,CFUtil.getShort(substring(methodOut.getIp66102IpmMsg().getCharArray(),(methodIn.getJ400() + 4-1), (methodIn.getJ400() + 4 + 2) )));
          }
//  PERFORM 81000-PROCESS-BAD-MESSAGE
          processBadMessage(programCtx.getProcessBadMessageInCtx());/*81000-PROCESS-BAD-MESSAGE*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }
          ;
      
      return methodOut;
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
      @Override
      public CheckPdsLimitOutCtx checkPdsLimit(CheckPdsLimitInCtx methodIn) throws Exception {
Ip662010Ctx programCtx = methodIn.getIp662010Ctx();
CheckPdsLimitOutCtx methodOut = methodIn.getCheckPdsLimitOutCtx();
//  IF 400-PDS-TAG GREATER THAN 800-MAX-PDS-NO
          if (	( methodOut.getPdsTag400() > methodIn.getMaxPdsNo800() )) { 
//  MOVE 600-UNDEFINED-PDS-CODE TO 600-ERROR-CODE IP65504-MESSAGE-STATUS
              methodOut.setErrorCode600( methodOut.getUndefinedPdsCode600());
              methodOut.setIp65504MessageStatus((short) methodOut.getUndefinedPdsCode600());
//  MOVE 400-PDS-TAG TO 600-TAG-NO
//  FORMAT_1059277505 = "ZZZ9"
              methodOut.setTagNo600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(methodOut.getPdsTag400()).toCharArray()));
//  MOVE 600-TAG-NO TO 600-UNDEFINED-PDS-NO
              methodOut.setUndefinedPdsNo600(CFUtil.getInt(methodOut.getTagNo600()));
              // MOVE 600-UNDEFINED-PDS TO 600-IPM-ERROR-TEXT
              methodOut.setIpmErrorText600(methodOut.getUndefinedPds600().toCharArray());
//  MOVE 400-K TO 400-J
              methodOut.setJ400(methodOut.getK400());

// *           Point 400-j to the error
//  PERFORM 32116-HANDLE-BAD-PDS-ID
              handleBadPdsId(programCtx.getHandleBadPdsIdInCtx());/*32116-HANDLE-BAD-PDS-ID*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
      
      return methodOut;
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
      @Override
      public HandleShortCarrierOutCtx handleShortCarrier(HandleShortCarrierInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			boolean keepSearching = true;
			// End of variable declaration

Ip662010Ctx programCtx = methodIn.getIp662010Ctx();
HandleShortCarrierOutCtx methodOut = methodIn.getHandleShortCarrierOutCtx();
//  SET 600-CARRIER-SHORT-CODE-NDX TO 1
          methodOut.setCarrierShortCodeNdx600(1); 
          
//  SEARCH 600-CARRIER-SHORT-ROW
          keepSearching = true;
          while(keepSearching) {
          	if  (	( methodOut.getI400() == methodIn.getCarrierTooShortDe600(methodOut.getCarrierShortCodeNdx600() - 1) )) { 
//  MOVE 600-CARRIER-TOO-SHORT-CODE ( 600-CARRIER-SHORT-CODE-NDX ) TO 600-ERROR-CODE IP65504-MESSAGE-STATUS
              methodOut.setErrorCode600( methodOut.getCarrierTooShortCode600(methodOut.getCarrierShortCodeNdx600() - 1));
              methodOut.setIp65504MessageStatus(methodOut.getCarrierTooShortCode600(methodOut.getCarrierShortCodeNdx600() - 1));
          	break;
          	}
          	methodOut.setCarrierShortCodeNdx600(methodOut.getCarrierShortCodeNdx600() + 1);
          	if (methodOut.getCarrierShortCodeNdx600() > 5) { 
          	 keepSearching = false;
          	}
          }
//  MOVE 600-CARRIER-TOO-SHORT-NDX TO IP662011-ERR-SUBSCRIPT
          methodOut.setIp662011ErrSubscript(methodOut.getCarrierTooShortNdx600());
//  MOVE 600-CARRIER-TOO-SHORT TO 600-IPM-ERROR-TEXT
          methodOut.setIpmErrorText600(pad(64,methodOut.getCarrierTooShort600(),SPACE_CHAR,RIGHT_PAD));
          // MOVE 3 TO 600-IPM-ERROR-POINTER-WIDTH
          methodOut.setIpmErrorPointerWidth600((short)3);
//  MOVE 'D' TO 600-IPM-ERROR-ELEMENT-TYPE
//  LITERAL_D = 'D'
          methodOut.setIpmErrorElementType600(CONSTANTS.LITERAL_D);
//  MOVE 400-I TO 600-IPM-ERROR-ELEMENT-NO
          methodOut.setIpmErrorElementNo600(methodOut.getI400());
//  SUBTRACT 3 FROM IP65504-DE-START ( 400-I ) GIVING 400-J
          methodOut.setJ400( (short) (methodIn.getIp65504DeStart(methodOut.getI400() - 1)-(short)3));

// *                      This points to the bad length in the msg
//  PERFORM 81000-PROCESS-BAD-MESSAGE
          processBadMessage(programCtx.getProcessBadMessageInCtx());/*81000-PROCESS-BAD-MESSAGE*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }
          ;
      
      return methodOut;
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
      @Override
      public ParseViaTagTableOutCtx parseViaTagTable(ParseViaTagTableInCtx methodIn) throws Exception {
Ip662010Ctx programCtx = methodIn.getIp662010Ctx();
ParseViaTagTableOutCtx methodOut = methodIn.getParseViaTagTableOutCtx();
          methodOut.setTagTableLength400((short) (methodIn.getIp66102IpmMsgLngth() - methodIn.getIp66102TagStart() + 1));

// *    Determine how many entries are in the tag-table.
//  DIVIDE 400-TAG-TABLE-LENGTH BY LENGTH OF IP65504-TAG-AREA (1) GIVING IP65504-TCNT
          methodOut.setIp65504Tcnt( (short) (methodOut.getTagTableLength400()/Ip65504TagArea.getIp65504TagAreaFieldLength()));

// *    Put the appended tag table into place as current-tag-table
//  MOVE IP66102-IPM-MSG ( IP66102-TAG-START : 400-TAG-TABLE-LENGTH ) TO IP65504-CURRENT-TAG-TABLE
          methodOut.getIp65504CurrentTagTable().setString(substring(methodOut.getIp66102IpmMsg().getCharArray(),((int) methodIn.getIp66102TagStart()-1), (methodOut.getTagTableLength400() + ((int) methodIn.getIp66102TagStart() - 1)) ));

// *    Save the control info to allow users to determine whether
// *    the file was tagged.
//  MOVE IP66102-IPM-MSG (1 : 5) TO IP65504-TAGGED-RECORD-INFO
          methodOut.getIp65504TaggedRecordInfo().setString(substring(methodOut.getIp66102IpmMsg().getCharArray(),0,5));
//  PERFORM 40005-MOVE-MSG-TO-STD-AREA
          moveMsgToStdArea(programCtx.getMoveMsgToStdAreaInCtx());/*40005-MOVE-MSG-TO-STD-AREA*/
//  PERFORM 50000-EXPAND-THE-BIT-MAP
          expandTheBitMap(programCtx.getExpandTheBitMapInCtx());/*50000-EXPAND-THE-BIT-MAP*/
//  SET IP65504-T TO IP65504-TCNT
          methodOut.setIp65504T(methodOut.getIp65504Tcnt()); 
          
//  SET 500-IP65504-MAX TO IP65504-T
          methodOut.setIp65504Max500(IP65504_TAG_AREA_LENGTH * ( ((methodOut.getIp65504T() < 1) ? 1:methodOut.getIp65504T()) - 1)); 
          
//  PERFORM 40010-PROCESS-A-TAG VARYING IP65504-T FROM 1 BY 1 UNTIL IP65504-T > 500-IP65504-MAX
          for (methodOut.setIp65504T(1); 	( methodOut.getIp65504T() <= ( methodOut.getIp65504Max500() / 11 ) + 1  ) ; methodOut.setIp65504T(methodOut.getIp65504T() + 1) ) {
          	processATag(programCtx.getProcessATagInCtx());/*40010-PROCESS-A-TAG*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
//  IF 88-100-MAP-ENTRY-PENDING AND 800-LAST-SUBFLD-NO GREATER THAN ZERO
          if ( methodIn.isMapEntryPending88100()   && 	( methodIn.getLastSubfldNo800() > 0 ) ) { 
//  PERFORM 40015-FINISH-PENDING-ENTRY
              finishPendingEntry(programCtx.getFinishPendingEntryInCtx());/*40015-FINISH-PENDING-ENTRY*/
          }
      
      return methodOut;
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
      @Override
      public MoveMsgToStdAreaOutCtx moveMsgToStdArea(MoveMsgToStdAreaInCtx methodIn) throws Exception {
Ip662010Ctx programCtx = methodIn.getIp662010Ctx();
MoveMsgToStdAreaOutCtx methodOut = methodIn.getMoveMsgToStdAreaOutCtx();
          methodOut.setIp66102IpmMsgLngth((long)Math.abs(methodIn.getIp66102TagStart() - 6));

// *    Move the message into the same position as if it had not
// *    been tagged.
//  MOVE IP66102-IPM-MSG (6 : IP66102-IPM-MSG-LNGTH ) TO IP66102-IPM-MSG (1 : IP66102-IPM-MSG-LNGTH )
          methodOut.getIp66102IpmMsg().replace(methodOut.getIp66102IpmMsg(),5,(int) methodOut.getIp66102IpmMsgLngth(),0,(int) methodOut.getIp66102IpmMsgLngth() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
      
      return methodOut;
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
      @Override
      public ProcessATagOutCtx processATag(ProcessATagInCtx methodIn) throws Exception {
      
// *       Note:  this statement will produce a compiler warning
// *              about an "overlapping move".  ignore the warning
// *              message.
Ip662010Ctx programCtx = methodIn.getIp662010Ctx();
ProcessATagOutCtx methodOut = methodIn.getProcessATagOutCtx();
//  MOVE IP65504-TAG-AREA ( IP65504-T ) TO 800-CURRENT-TAG
          methodOut.getCurrentTag800().setString(methodOut.getIp65504TagArea(methodIn.getIp65504T() - 1).toCharArray());
//  IF 88-100-MAP-ENTRY-PENDING AND 800-ID NOT EQUAL 800-LAST-SUB-ID
          if ( methodIn.isMapEntryPending88100()   && 		compareChars(methodOut.getId800(),methodIn.getLastSubId800()) != 0 ) { 
//  PERFORM 40015-FINISH-PENDING-ENTRY
              finishPendingEntry(programCtx.getFinishPendingEntryInCtx());/*40015-FINISH-PENDING-ENTRY*/
          }
//  EVALUATE TRUE
          if  ( methodOut.isItsAPds800()  ) { 
//  PERFORM 40020-DO-PDS-TAG
              doPdsTag(programCtx.getDoPdsTagInCtx());/*40020-DO-PDS-TAG*/
          }
          else if  ( methodOut.isItsADataElement800()   &&  methodOut.isDeNoIsValid800()  ) { 
//  PERFORM 40030-DO-DE-TAG
              doDeTag(programCtx.getDoDeTagInCtx());/*40030-DO-DE-TAG*/
          }
          else if  ( methodOut.isItsAnMti800()  ) { 
              ;
          }
          else if  ( methodOut.isTagHasBeenDeleted800()  ) { 
              ;
          }
          else   { 
//  MOVE 600-INVALID-TAG-TYPE-CODE TO 600-ERROR-CODE IP65504-MESSAGE-STATUS
              methodOut.setErrorCode600( methodOut.getInvalidTagTypeCode600());
              methodOut.setIp65504MessageStatus((short) methodOut.getInvalidTagTypeCode600());
//  MOVE 600-INVALID-TAG-TYPE-NDX TO IP662011-ERR-SUBSCRIPT
              methodOut.setIp662011ErrSubscript(methodOut.getInvalidTagTypeNdx600());
//  MOVE 600-INVALID-TAG-TYPE TO 600-IPM-ERROR-TEXT
              methodOut.setIpmErrorText600(pad(64,methodOut.getInvalidTagType600(),SPACE_CHAR,RIGHT_PAD));
//  PERFORM 43000-HANDLE-BAD-TAG
              handleBadTag(programCtx.getHandleBadTagInCtx());/*43000-HANDLE-BAD-TAG*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
      
      return methodOut;
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
      @Override
      public FinishPendingEntryOutCtx finishPendingEntry(FinishPendingEntryInCtx methodIn) throws Exception {
Ip662010Ctx programCtx = methodIn.getIp662010Ctx();
FinishPendingEntryOutCtx methodOut = methodIn.getFinishPendingEntryOutCtx();

// *    We were working on subfield tags and have come to the
// *    tag table entry beyond the last subfield of that element
// *    so we'll post that pending element's length in the map.
//  IF 88-100-PDS-ENTRY-PENDING
          if ( methodIn.isPdsEntryPending88100()  ) { 
              methodOut.setIp65504PdsLngth(methodIn.getIp65504P() - 1,(short) (methodIn.getLastSubStart800() - methodIn.getIp65504PdsStart(methodIn.getIp65504P() - 1) + methodIn.getLastSubLngth800()));
          }
//  ELSE
          else { 
              methodOut.setIp65504DeLngth(methodIn.getIp65504D() - 1,(short) (methodIn.getLastSubStart800() - methodIn.getIp65504DeStart(methodIn.getIp65504D() - 1) + methodIn.getLastSubLngth800()));
          }
//  SET 88-100-NO-MAP-ENTRY-PENDING TO TRUE
          methodOut.setNoMapEntryPending88100True(); 
          
      
      return methodOut;
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
      @Override
      public DoPdsTagOutCtx doPdsTag(DoPdsTagInCtx methodIn) throws Exception {
Ip662010Ctx programCtx = methodIn.getIp662010Ctx();
DoPdsTagOutCtx methodOut = methodIn.getDoPdsTagOutCtx();
//  EVALUATE 800-SUBFLD-NO
          switch(methodIn.getSubfldNo800()){
          	case 0:

// *          We have a tag for an entire pds
//  MOVE 'X' TO IP65504-SEL-PDS-ENT ( 800-NO )
//  LITERAL_X = 'X', LITERAL_X = "X"
              methodOut.setIp65504SelPdsEnt(methodIn.getNo800() - 1,CONSTANTS.LITERAL_X);
//  SET IP65504-P TO 800-NO
              methodOut.setIp65504P(methodIn.getNo800()); 
              
//  MOVE HIGH-VALUES TO IP65504-PDS-MAP-ENTRY ( IP65504-P )
              methodOut.setIp65504PdsMapEntry(methodOut.getIp65504P() - 1,CONSTANTS.HIGH_VALUE_1986603393);

// *             This places a "null" value in the
// *             first-subfld index pointer of the map entry
//  MOVE 800-START TO IP65504-PDS-START ( IP65504-P )
              methodOut.setIp65504PdsStart(methodOut.getIp65504P() - 1,methodOut.getStart800());
//  MOVE 800-LENGTH TO IP65504-PDS-LNGTH ( IP65504-P )
              methodOut.setIp65504PdsLngth(methodOut.getIp65504P() - 1,methodOut.getLength800());
          break;
          	case 1:
//  IF 88-100-NO-MAP-ENTRY-PENDING
              if ( methodIn.isNoMapEntryPending88100()  ) { 

// *             We have the first subfield tag
//  MOVE 'X' TO IP65504-SEL-PDS-ENT ( 800-NO )
//  LITERAL_X = 'X', LITERAL_X = "X"
                  methodOut.setIp65504SelPdsEnt(methodIn.getNo800() - 1,CONSTANTS.LITERAL_X);
//  SET IP65504-P TO 800-NO
                  methodOut.setIp65504P(methodIn.getNo800()); 
                  
//  SET IP65504-PDS-FIRST-SUBFLD ( IP65504-P ) TO IP65504-T
                  methodOut.setIp65504PdsFirstSubfld(methodOut.getIp65504P() - 1,IP65504_TAG_AREA_LENGTH * ( ((methodIn.getIp65504T() < 1) ? 1:methodIn.getIp65504T()) - 1)); 
                  
//  MOVE 800-START TO IP65504-PDS-START ( IP65504-P )
                  methodOut.setIp65504PdsStart(methodOut.getIp65504P() - 1,methodOut.getStart800());
//  SET 88-100-PDS-ENTRY-PENDING TO TRUE
                  methodOut.setPdsEntryPending88100True(); 
                  
              }
              // MOVE 800-CURRENT-TAG TO 800-LAST-SUBFLD-TAG
              methodOut.getLastSubfldTag800().setString(methodOut.getCurrentTag800().getCharArray());
          break;
          default :
              // MOVE 800-CURRENT-TAG TO 800-LAST-SUBFLD-TAG
              methodOut.getLastSubfldTag800().setString(methodOut.getCurrentTag800().getCharArray());
          }
      
      return methodOut;
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
      @Override
      public DoDeTagOutCtx doDeTag(DoDeTagInCtx methodIn) throws Exception {
Ip662010Ctx programCtx = methodIn.getIp662010Ctx();
DoDeTagOutCtx methodOut = methodIn.getDoDeTagOutCtx();
//  EVALUATE 800-SUBFLD-NO
          switch(methodIn.getSubfldNo800()){
          	case 0:

// *          We have a tag for an entire de
//  MOVE 'X' TO IP65504-SEL-ELEM-ENT ( 800-NO )
//  LITERAL_X = 'X', LITERAL_X = "X"
              methodOut.setIp65504SelElemEnt(methodIn.getNo800() - 1,CONSTANTS.LITERAL_X);
//  SET IP65504-D TO 800-NO
              methodOut.setIp65504D(methodIn.getNo800()); 
              
//  MOVE HIGH-VALUES TO IP65504-DE-MAP-ENTRY ( IP65504-D )
              methodOut.setIp65504DeMapEntry(methodOut.getIp65504D() - 1,CONSTANTS.HIGH_VALUE_1986603393);

// *             This places a "null" value in the
// *             first-subfld index pointer of the map entry
//  MOVE 800-START TO IP65504-DE-START ( IP65504-D )
              methodOut.setIp65504DeStart(methodOut.getIp65504D() - 1,methodOut.getStart800());
//  MOVE 800-LENGTH TO IP65504-DE-LNGTH ( IP65504-D )
              methodOut.setIp65504DeLngth(methodOut.getIp65504D() - 1,methodOut.getLength800());
          break;
          	case 1:
//  IF 88-100-NO-MAP-ENTRY-PENDING
              if ( methodIn.isNoMapEntryPending88100()  ) { 

// *             We have the first subfield tag
//  MOVE 'X' TO IP65504-SEL-ELEM-ENT ( 800-NO )
//  LITERAL_X = 'X', LITERAL_X = "X"
                  methodOut.setIp65504SelElemEnt(methodIn.getNo800() - 1,CONSTANTS.LITERAL_X);
//  SET IP65504-D TO 800-NO
                  methodOut.setIp65504D(methodIn.getNo800()); 
                  
//  SET IP65504-DE-FIRST-SUBFLD ( IP65504-D ) TO IP65504-T
                  methodOut.setIp65504DeFirstSubfld(methodOut.getIp65504D() - 1,IP65504_TAG_AREA_LENGTH * ( ((methodIn.getIp65504T() < 1) ? 1:methodIn.getIp65504T()) - 1)); 
                  
//  MOVE 800-START TO IP65504-DE-START ( IP65504-D )
                  methodOut.setIp65504DeStart(methodOut.getIp65504D() - 1,methodOut.getStart800());
//  SET 88-100-DE-ENTRY-PENDING TO TRUE
                  methodOut.setDeEntryPending88100True(); 
                  
              }
              // MOVE 800-CURRENT-TAG TO 800-LAST-SUBFLD-TAG
              methodOut.getLastSubfldTag800().setString(methodOut.getCurrentTag800().getCharArray());
          break;
          default :
              // MOVE 800-CURRENT-TAG TO 800-LAST-SUBFLD-TAG
              methodOut.getLastSubfldTag800().setString(methodOut.getCurrentTag800().getCharArray());
          }
      
      return methodOut;
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
      @Override
      public HandleBadTagOutCtx handleBadTag(HandleBadTagInCtx methodIn) throws Exception {
Ip662010Ctx programCtx = methodIn.getIp662010Ctx();
HandleBadTagOutCtx methodOut = methodIn.getHandleBadTagOutCtx();
          // MOVE 'TAGS' TO 600-IPM-ERROR-ELEMENT-ID
          methodOut.getIpmErrorElementId600().setString(CONSTANTS.LITERAL_TAGS_B_);

// *    Append tag-table to ipm message
//  MOVE IP65504-CURRENT-TAG-TABLE (1 : 400-TAG-TABLE-LENGTH ) TO IP66102-IPM-MSG ( IP66102-IPM-MSG-LNGTH + 1 : 400-TAG-TABLE-LENGTH )
          methodOut.getIp66102IpmMsg().replace(methodOut.getIp65504CurrentTagTable(),0,methodIn.getTagTableLength400(),((int) (methodOut.getIp66102IpmMsgLngth() + 1)-1),methodIn.getTagTableLength400() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
          methodOut.setJ400((short) (methodOut.getIp66102IpmMsgLngth() +  (  ( methodIn.getI400() - 1 )  * Ip65504TagArea.getIp65504TagAreaFieldLength() )  + 1));
          // MOVE 5 TO 600-IPM-ERROR-POINTER-WIDTH
          methodOut.setIpmErrorPointerWidth600((short)5);
//  ADD 400-TAG-TABLE-LENGTH TO IP66102-IPM-MSG-LNGTH
          methodOut.setIp66102IpmMsgLngth(methodOut.getIp66102IpmMsgLngth()+(short) methodIn.getTagTableLength400());
//  PERFORM 81000-PROCESS-BAD-MESSAGE
          processBadMessage(programCtx.getProcessBadMessageInCtx());/*81000-PROCESS-BAD-MESSAGE*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }
          ;
      
      return methodOut;
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
      @Override
      public ExpandTheBitMapOutCtx expandTheBitMap(ExpandTheBitMapInCtx methodIn) throws Exception {
      
// *    Note:  the displayed message will not include the
// *           binary ip66102-tag-start field.

// *  For each byte of the the bit-map, move the byte to the right-
// *  most byte of p-x, a two-byte field which is redefined as a
// *  half-word binary number, p.  then use p as a subscript to find
// *  the parsing-pattern which will contain a string of eight 'x's
// *  and/or spaces equivalent to the eight bits.  move that pattern
// *  into sel-elem-entries-all which is the "byte-map".
Ip662010Ctx programCtx = methodIn.getIp662010Ctx();
ExpandTheBitMapOutCtx methodOut = methodIn.getExpandTheBitMapOutCtx();
//  MOVE IP66102-BIT-BYTE-1 TO 400-P-X
          methodOut.setPX400(methodOut.getIp66102BitByte1());
//  MOVE 500-PARSING-PATTERN ( 400-P + 1) TO IP65504-SEL-ELEM-ENTRIES-ALL (1 : 8)
          methodOut.getIp65504SelElemEntriesAll().replace(methodOut.getParsingPattern500(methodIn.getP400() + 1 - 1),0,methodOut.getParsingPattern500(methodIn.getP400() + 1 - 1).length,0,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);

// *               Add one because a bit pattern of x'00'
// *               must retrieve parsing-pattern(1)
//  MOVE IP66102-BIT-BYTE-2 TO 400-P-X
          methodOut.setPX400(methodOut.getIp66102BitByte2());
//  MOVE 500-PARSING-PATTERN ( 400-P + 1) TO IP65504-SEL-ELEM-ENTRIES-ALL (9 : 8)
          methodOut.getIp65504SelElemEntriesAll().replace(methodOut.getParsingPattern500(methodIn.getP400() + 1 - 1),0,methodOut.getParsingPattern500(methodIn.getP400() + 1 - 1).length,8,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE IP66102-BIT-BYTE-3 TO 400-P-X
          methodOut.setPX400(methodOut.getIp66102BitByte3());
//  MOVE 500-PARSING-PATTERN ( 400-P + 1) TO IP65504-SEL-ELEM-ENTRIES-ALL (17 : 8)
          methodOut.getIp65504SelElemEntriesAll().replace(methodOut.getParsingPattern500(methodIn.getP400() + 1 - 1),0,methodOut.getParsingPattern500(methodIn.getP400() + 1 - 1).length,16,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE IP66102-BIT-BYTE-4 TO 400-P-X
          methodOut.setPX400(methodOut.getIp66102BitByte4());
//  MOVE 500-PARSING-PATTERN ( 400-P + 1) TO IP65504-SEL-ELEM-ENTRIES-ALL (25 : 8)
          methodOut.getIp65504SelElemEntriesAll().replace(methodOut.getParsingPattern500(methodIn.getP400() + 1 - 1),0,methodOut.getParsingPattern500(methodIn.getP400() + 1 - 1).length,24,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE IP66102-BIT-BYTE-5 TO 400-P-X
          methodOut.setPX400(methodOut.getIp66102BitByte5());
//  MOVE 500-PARSING-PATTERN ( 400-P + 1) TO IP65504-SEL-ELEM-ENTRIES-ALL (33 : 8)
          methodOut.getIp65504SelElemEntriesAll().replace(methodOut.getParsingPattern500(methodIn.getP400() + 1 - 1),0,methodOut.getParsingPattern500(methodIn.getP400() + 1 - 1).length,32,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE IP66102-BIT-BYTE-6 TO 400-P-X
          methodOut.setPX400(methodOut.getIp66102BitByte6());
//  MOVE 500-PARSING-PATTERN ( 400-P + 1) TO IP65504-SEL-ELEM-ENTRIES-ALL (41 : 8)
          methodOut.getIp65504SelElemEntriesAll().replace(methodOut.getParsingPattern500(methodIn.getP400() + 1 - 1),0,methodOut.getParsingPattern500(methodIn.getP400() + 1 - 1).length,40,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE IP66102-BIT-BYTE-7 TO 400-P-X
          methodOut.setPX400(methodOut.getIp66102BitByte7());
//  MOVE 500-PARSING-PATTERN ( 400-P + 1) TO IP65504-SEL-ELEM-ENTRIES-ALL (49 : 8)
          methodOut.getIp65504SelElemEntriesAll().replace(methodOut.getParsingPattern500(methodIn.getP400() + 1 - 1),0,methodOut.getParsingPattern500(methodIn.getP400() + 1 - 1).length,48,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE IP66102-BIT-BYTE-8 TO 400-P-X
          methodOut.setPX400(methodOut.getIp66102BitByte8());
//  MOVE 500-PARSING-PATTERN ( 400-P + 1) TO IP65504-SEL-ELEM-ENTRIES-ALL (57 : 8)
          methodOut.getIp65504SelElemEntriesAll().replace(methodOut.getParsingPattern500(methodIn.getP400() + 1 - 1),0,methodOut.getParsingPattern500(methodIn.getP400() + 1 - 1).length,56,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE IP66102-BIT-BYTE-9 TO 400-P-X
          methodOut.setPX400(methodOut.getIp66102BitByte9());
//  MOVE 500-PARSING-PATTERN ( 400-P + 1) TO IP65504-SEL-ELEM-ENTRIES-ALL (65 : 8)
          methodOut.getIp65504SelElemEntriesAll().replace(methodOut.getParsingPattern500(methodIn.getP400() + 1 - 1),0,methodOut.getParsingPattern500(methodIn.getP400() + 1 - 1).length,64,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE IP66102-BIT-BYTE-10 TO 400-P-X
          methodOut.setPX400(methodOut.getIp66102BitByte10());
//  MOVE 500-PARSING-PATTERN ( 400-P + 1) TO IP65504-SEL-ELEM-ENTRIES-ALL (73 : 8)
          methodOut.getIp65504SelElemEntriesAll().replace(methodOut.getParsingPattern500(methodIn.getP400() + 1 - 1),0,methodOut.getParsingPattern500(methodIn.getP400() + 1 - 1).length,72,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE IP66102-BIT-BYTE-11 TO 400-P-X
          methodOut.setPX400(methodOut.getIp66102BitByte11());
//  MOVE 500-PARSING-PATTERN ( 400-P + 1) TO IP65504-SEL-ELEM-ENTRIES-ALL (81 : 8)
          methodOut.getIp65504SelElemEntriesAll().replace(methodOut.getParsingPattern500(methodIn.getP400() + 1 - 1),0,methodOut.getParsingPattern500(methodIn.getP400() + 1 - 1).length,80,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE IP66102-BIT-BYTE-12 TO 400-P-X
          methodOut.setPX400(methodOut.getIp66102BitByte12());
//  MOVE 500-PARSING-PATTERN ( 400-P + 1) TO IP65504-SEL-ELEM-ENTRIES-ALL (89 : 8)
          methodOut.getIp65504SelElemEntriesAll().replace(methodOut.getParsingPattern500(methodIn.getP400() + 1 - 1),0,methodOut.getParsingPattern500(methodIn.getP400() + 1 - 1).length,88,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE IP66102-BIT-BYTE-13 TO 400-P-X
          methodOut.setPX400(methodOut.getIp66102BitByte13());
//  MOVE 500-PARSING-PATTERN ( 400-P + 1) TO IP65504-SEL-ELEM-ENTRIES-ALL (97 : 8)
          methodOut.getIp65504SelElemEntriesAll().replace(methodOut.getParsingPattern500(methodIn.getP400() + 1 - 1),0,methodOut.getParsingPattern500(methodIn.getP400() + 1 - 1).length,96,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE IP66102-BIT-BYTE-14 TO 400-P-X
          methodOut.setPX400(methodOut.getIp66102BitByte14());
//  MOVE 500-PARSING-PATTERN ( 400-P + 1) TO IP65504-SEL-ELEM-ENTRIES-ALL (105 : 8)
          methodOut.getIp65504SelElemEntriesAll().replace(methodOut.getParsingPattern500(methodIn.getP400() + 1 - 1),0,methodOut.getParsingPattern500(methodIn.getP400() + 1 - 1).length,104,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE IP66102-BIT-BYTE-15 TO 400-P-X
          methodOut.setPX400(methodOut.getIp66102BitByte15());
//  MOVE 500-PARSING-PATTERN ( 400-P + 1) TO IP65504-SEL-ELEM-ENTRIES-ALL (113 : 8)
          methodOut.getIp65504SelElemEntriesAll().replace(methodOut.getParsingPattern500(methodIn.getP400() + 1 - 1),0,methodOut.getParsingPattern500(methodIn.getP400() + 1 - 1).length,112,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  MOVE IP66102-BIT-BYTE-16 TO 400-P-X
          methodOut.setPX400(methodOut.getIp66102BitByte16());
//  MOVE 500-PARSING-PATTERN ( 400-P + 1) TO IP65504-SEL-ELEM-ENTRIES-ALL (121 : 8)
          methodOut.getIp65504SelElemEntriesAll().replace(methodOut.getParsingPattern500(methodIn.getP400() + 1 - 1),0,methodOut.getParsingPattern500(methodIn.getP400() + 1 - 1).length,120,8 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
      
      return methodOut;
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
      @Override
      public CheckRecordLengthOutCtx checkRecordLength(CheckRecordLengthInCtx methodIn) throws Exception {
Ip662010Ctx programCtx = methodIn.getIp662010Ctx();
CheckRecordLengthOutCtx methodOut = methodIn.getCheckRecordLengthOutCtx();
          methodOut.setParsedMsgLngth400(methodIn.getIp65504DeStart(methodIn.getIp65504D() - 1) + methodIn.getIp65504DeLngth(methodIn.getIp65504D() - 1) - 1);
//  IF 400-PARSED-MSG-LNGTH NOT = IP66102-IPM-MSG-LNGTH
          if (	( methodOut.getParsedMsgLngth400() != methodIn.getIp66102IpmMsgLngth() ) ) { 
//  PERFORM 60010-HANDLE-BAD-RECORD-LNGTH
              handleBadRecordLngth(programCtx.getHandleBadRecordLngthInCtx());/*60010-HANDLE-BAD-RECORD-LNGTH*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
      
      return methodOut;
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
      @Override
      public HandleBadRecordLngthOutCtx handleBadRecordLngth(HandleBadRecordLngthInCtx methodIn) throws Exception {
Ip662010Ctx programCtx = methodIn.getIp662010Ctx();
HandleBadRecordLngthOutCtx methodOut = methodIn.getHandleBadRecordLngthOutCtx();
//  MOVE 600-BAD-REC-LNGTH-CODE TO 600-ERROR-CODE IP65504-MESSAGE-STATUS
          methodOut.setErrorCode600( methodOut.getBadRecLngthCode600());
          methodOut.setIp65504MessageStatus((short) methodOut.getBadRecLngthCode600());
//  MOVE 600-BAD-REC-LNGTH-NDX TO IP662011-ERR-SUBSCRIPT
          methodOut.setIp662011ErrSubscript(methodOut.getBadRecLngthNdx600());
//  MOVE 400-PARSED-MSG-LNGTH TO 600-PARSED-LNGTH
//  FORMAT_16989907 = "ZZ,ZZ9"
          methodOut.setParsedLngth600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_16989907,String.valueOf(methodOut.getParsedMsgLngth400()).toCharArray()));
//  MOVE IP66102-IPM-MSG-LNGTH TO 600-RDW-LNGTH
//  FORMAT_16989907 = "ZZ,ZZ9"
          methodOut.setRdwLngth600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_16989907,String.valueOf(methodOut.getIp66102IpmMsgLngth()).toCharArray()));
          // MOVE 600-BAD-REC-LNGTH TO 600-IPM-ERROR-TEXT
          methodOut.setIpmErrorText600(methodOut.getBadRecLngth600().toCharArray());

// *    Point 400-j to the error
//  IF IP66102-IPM-MSG-LNGTH < 400-PARSED-MSG-LNGTH
          if (	( methodOut.getIp66102IpmMsgLngth() < methodOut.getParsedMsgLngth400() ) ) { 
//  MOVE IP66102-IPM-MSG-LNGTH TO 400-J
              methodOut.setJ400((short) methodOut.getIp66102IpmMsgLngth());
//  SUBTRACT IP66102-IPM-MSG-LNGTH FROM 400-PARSED-MSG-LNGTH GIVING 600-IPM-ERROR-POINTER-WIDTH
              methodOut.setIpmErrorPointerWidth600( (short) ((short) methodOut.getParsedMsgLngth400()-(short) methodOut.getIp66102IpmMsgLngth()));
          }
//  ELSE
          else { 
//  MOVE 400-PARSED-MSG-LNGTH TO 400-J
              methodOut.setJ400((short) methodOut.getParsedMsgLngth400());
//  SUBTRACT 400-PARSED-MSG-LNGTH FROM IP66102-IPM-MSG-LNGTH GIVING 600-IPM-ERROR-POINTER-WIDTH
              methodOut.setIpmErrorPointerWidth600( (short) ((short) methodOut.getIp66102IpmMsgLngth()-(short) methodOut.getParsedMsgLngth400()));
          }
//  ADD 1 TO 400-J
          methodOut.setJ400( (short) (methodOut.getJ400()+(short)1));
//  PERFORM 81000-PROCESS-BAD-MESSAGE
          processBadMessage(programCtx.getProcessBadMessageInCtx());/*81000-PROCESS-BAD-MESSAGE*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }
          ;
      
      return methodOut;
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
      @Override
      public HandleBadLengthFieldOutCtx handleBadLengthField(HandleBadLengthFieldInCtx methodIn) throws Exception {
Ip662010Ctx programCtx = methodIn.getIp662010Ctx();
HandleBadLengthFieldOutCtx methodOut = methodIn.getHandleBadLengthFieldOutCtx();
//  SET IP000604-I TO 400-I
          methodOut.setIp000604I(methodOut.getI400()); 
          

// *       400-I always contains the current de-number

// *       We're dealing with a de subfield, so ip65504-t has not
// *       been incremented.  (for pdses the current de is the
// *       carrier, which will have no subfields.)
//  IF IP000604-DE-SUBFLDS ( IP000604-I ) > 0
          if (	( methodIn.getIp000604DeSubflds(methodOut.getIp000604I() - 1) > 0 ) ) { 
//  SET IP65504-T UP BY 1
              methodOut.setIp65504T(methodOut.getIp65504T() + 1); 
              
//  MOVE 2 TO IP65504-TAG-TYPE ( IP65504-T )
              methodOut.setIp65504TagType(methodOut.getIp65504T() - 1,(short)2);
//  MOVE 400-I TO IP65504-TAG-NO ( IP65504-T )
              methodOut.setIp65504TagNo(methodOut.getIp65504T() - 1,methodOut.getI400());
          }
//  ADD 600-IPM-ERROR-POINTER-WIDTH 400-J GIVING IP65504-TAG-STARTS ( IP65504-T )
          methodOut.setIp65504TagStarts(methodOut.getIp65504T() - 1, (short) (methodIn.getIpmErrorPointerWidth600()+methodIn.getJ400()));
//  EVALUATE TRUE
          if  ( methodOut.isIp6550488DeTag(methodOut.getIp65504T() - 1)  ) { 
//  MOVE IP65504-TAG-STARTS ( IP65504-T ) TO IP65504-DE-START ( 400-I )
              methodOut.setIp65504DeStart(methodOut.getI400() - 1,methodOut.getIp65504TagStarts(methodOut.getIp65504T() - 1));
//  MOVE 'D' TO 600-IPM-ERROR-ELEMENT-TYPE
//  LITERAL_D = 'D'
              methodOut.setIpmErrorElementType600(CONSTANTS.LITERAL_D);
//  MOVE 2 TO IP65504-TAG-TYPE ( IP65504-T )
              methodOut.setIp65504TagType(methodOut.getIp65504T() - 1,(short)2);
          }
          else if  ( methodOut.isIp6550488PdsTag(methodOut.getIp65504T() - 1)  ) { 
//  MOVE IP65504-TAG-STARTS ( IP65504-T ) TO IP65504-PDS-START ( 400-I )
              methodOut.setIp65504PdsStart(methodOut.getI400() - 1,methodOut.getIp65504TagStarts(methodOut.getIp65504T() - 1));
//  MOVE 'P' TO 600-IPM-ERROR-ELEMENT-TYPE
//  LITERAL_P = 'P'
              methodOut.setIpmErrorElementType600(CONSTANTS.LITERAL_P);
//  MOVE 3 TO IP65504-TAG-TYPE ( IP65504-T )
              methodOut.setIp65504TagType(methodOut.getIp65504T() - 1,(short)3);
          }
//  MOVE IP65504-TAG-NO ( IP65504-T ) TO 600-IPM-ERROR-ELEMENT-NO
          methodOut.setIpmErrorElementNo600(methodOut.getIp65504TagNo(methodOut.getIp65504T() - 1));
//  MOVE 600-NON-NUMERIC-LNGTH TO 600-IPM-ERROR-TEXT
          methodOut.setIpmErrorText600(pad(64,methodOut.getNonNumericLngth600(),SPACE_CHAR,RIGHT_PAD));
//  MOVE 600-NON-NUMERIC-LNGTH-CODE TO 600-ERROR-CODE IP65504-MESSAGE-STATUS
          methodOut.setErrorCode600( methodOut.getNonNumericLngthCode600());
          methodOut.setIp65504MessageStatus((short) methodOut.getNonNumericLngthCode600());
//  MOVE 600-NON-NUMERIC-LNGTH-NDX TO IP662011-ERR-SUBSCRIPT
          methodOut.setIp662011ErrSubscript(methodOut.getNonNumericLngthNdx600());
//  PERFORM 81000-PROCESS-BAD-MESSAGE
          processBadMessage(programCtx.getProcessBadMessageInCtx());/*81000-PROCESS-BAD-MESSAGE*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }
          ;
      
      return methodOut;
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
      @Override
      public ProcessBadMessageOutCtx processBadMessage(ProcessBadMessageInCtx methodIn) throws Exception {
Ip662010Ctx programCtx = methodIn.getIp662010Ctx();
ProcessBadMessageOutCtx methodOut = methodIn.getProcessBadMessageOutCtx();
          // MOVE IP66102-IPM-MSGS-READ TO 600-IPM-ERROR-RECORD-NO
          //  FORMAT769933041 = "ZZZ,ZZZ,ZZ9"
          methodOut.setIpmErrorRecordNo600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT769933041,String.valueOf(methodOut.getIp66102IpmMsgsRead()).toCharArray()));
//  ADD 1 TO 400-BAD-MESSAGE-COUNT
          methodOut.setBadMessageCount400( (short) (methodOut.getBadMessageCount400()+(short)1));
//  EVALUATE TRUE
          if  (	( methodOut.getBadMessageCount400() == 1 ) ) { 
              // MOVE 4 TO RETURN-CODE
              programCtx.setRc( 4);
//  DISPLAY SPACES
              logger.info(" "); 
//  DISPLAY 600-ERROR-MESSAGE-HEADER
              logger.info(new String(methodIn.getErrorMessageHeader600())); 
//  PERFORM 81100-DISPLAY-BAD-IPM-MESSAGE
              displayBadIpmMessage(programCtx.getDisplayBadIpmMessageInCtx());/*81100-DISPLAY-BAD-IPM-MESSAGE*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
          else if  (	( methodOut.getBadMessageCount400() < methodOut.getMaxBadIpmMsgs300() )) { 
              // MOVE 4 TO RETURN-CODE
              programCtx.setRc( 4);
//  PERFORM 81100-DISPLAY-BAD-IPM-MESSAGE
              displayBadIpmMessage(programCtx.getDisplayBadIpmMessageInCtx());/*81100-DISPLAY-BAD-IPM-MESSAGE*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
          }
          else if  (	( methodOut.getBadMessageCount400() == methodOut.getMaxBadIpmMsgs300() )) { 
              // MOVE 8 TO RETURN-CODE
              programCtx.setRc( 8);
//  PERFORM 81100-DISPLAY-BAD-IPM-MESSAGE
              displayBadIpmMessage(programCtx.getDisplayBadIpmMessageInCtx());/*81100-DISPLAY-BAD-IPM-MESSAGE*/
              if (programCtx.isProgramEnded()) {
                  return methodOut;
              }
//  MOVE 300-MAX-BAD-IPM-MSGS TO 600-DISPLAY-NUMBER
//  FORMAT_1564585219 = "Z,ZZ9"
              methodOut.setDisplayNumber600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1564585219,String.valueOf(methodOut.getMaxBadIpmMsgs300()).toCharArray()));
//  DISPLAY 'IP662010-81000-MAXIMUM INVALID IPM MESSAGES IS ' 600-DISPLAY-NUMBER '.  FURTHER MESSAGES SUPPRESSED.'
              logger.info("IP662010-81000-MAXIMUM INVALID IPM MESSAGES IS {}.  FURTHER MESSAGES SUPPRESSED.", new String(methodOut.getDisplayNumber600())); 
          }
          else if  (	( methodOut.getBadMessageCount400() > methodOut.getMaxBadIpmMsgs300() )) { 
              // MOVE 8 TO RETURN-CODE
              programCtx.setRc( 8);
          }
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return methodOut;
      
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
      @Override
      public DisplayBadIpmMessageOutCtx displayBadIpmMessage(DisplayBadIpmMessageInCtx methodIn) throws Exception {
Ip662010Ctx programCtx = methodIn.getIp662010Ctx();
DisplayBadIpmMessageOutCtx methodOut = methodIn.getDisplayBadIpmMessageOutCtx();
//  DISPLAY SPACE
          logger.info(" "); 
//  IF 600-IPM-ERROR-POINTER-WIDTH > 0
          if (	( methodOut.getIpmErrorPointerWidth600() > 0 ) ) { 
              methodOut.setErrEnd400((short) (methodIn.getJ400() - 1 + methodOut.getIpmErrorPointerWidth600()));
              // MOVE SPACES TO 600-IPM-ERROR-POINTER-LINE
              methodOut.setIpmErrorPointerLine600(CONSTANTS.SPACE_100);
              methodOut.setErrStart400((short) (Math.floorMod(methodIn.getJ400(),100)));
              methodOut.setErrLngth400((short) (Stream.of(methodOut.getIpmErrorPointerWidth600(),(short) (101 - methodOut.getErrStart400())).min(Comparator.comparing(Integer::valueOf)).get()));
//  MOVE ALL '|' TO 600-IPM-ERROR-POINTER-LINE ( 400-ERR-START : 400-ERR-LNGTH )
              methodOut.setIpmErrorPointerLine600(replace(methodOut.getIpmErrorPointerLine600(),CONSTANTS.LITERAL_36552,(methodOut.getErrStart400()-1), (methodOut.getErrLngth400() + (methodOut.getErrStart400() - 1)) ));
          }

// *       This will print below the bad ipm message, thus
// *       pointing to the invalid field
//  DISPLAY 600-IPM-ERROR-MSG
          logger.info(methodIn.getIpmErrorMsg600().toString()); 
//  DISPLAY 600-CHAR-MAP-COLUMNS
          logger.info(methodIn.getCharMapColumns600().toString()); 
//  DISPLAY IP65504-SEL-ELEM-ENTRIES-ALL
          logger.info(methodIn.getIp65504SelElemEntriesAll().toString()); 
//  DISPLAY 600-IPM-ERROR-COLUMNS
          logger.info(new String(methodIn.getIpmErrorColumns600())); 
//  PERFORM VARYING 400-K FROM 1 BY 100 UNTIL 400-K GREATER THAN IP66102-IPM-MSG-LNGTH
          for (methodOut.setK400(1); (	( methodOut.getK400() <= methodOut.getIp66102IpmMsgLngth() ) ) ; methodOut.setK400(methodOut.getK400() + 100) ) {
//  DISPLAY IP66102-IPM-MSG ( 400-K : FUNCTION MIN (100 IP66102-IPM-MSG-LNGTH - 400-K + 1))
              logger.info(new String(substring(methodIn.getIp66102IpmMsg().getCharArray(),(methodOut.getK400()-1), (Stream.of(100,(int) (methodOut.getIp66102IpmMsgLngth() - methodOut.getK400() + 1)).min(Comparator.comparing(Integer::valueOf)).get() + (methodOut.getK400() - 1)) ))); 

// *       Now see if the bad field was on the line just displayed.
// *       if so, display the pointer-line to point to it.
//  ADD 100 TO 400-K GIVING 400-L
              methodOut.setL400( (short) (methodOut.getK400()+(short)100));
//  IF ( 400-J IS GREATER THAN OR EQUAL TO 400-K AND 400-J IS LESS THAN 400-L ) OR ( 400-ERR-END GREATER THAN OR EQUAL TO 400-K AND 400-ERR-END LESS THAN 400-L )
              if ((	( methodIn.getJ400() >= methodOut.getK400() ) && 	( methodIn.getJ400() < methodOut.getL400() )) || (	( methodOut.getErrEnd400() >= methodOut.getK400() ) && 	( methodOut.getErrEnd400() < methodOut.getL400() ))) { 
//  DISPLAY 600-IPM-ERROR-POINTER-LINE
                  logger.info(new String(methodOut.getIpmErrorPointerLine600())); 
//  DISPLAY SPACE
                  logger.info(" "); 
//  SUBTRACT 400-ERR-LNGTH FROM 600-IPM-ERROR-POINTER-WIDTH
                  methodOut.setIpmErrorPointerWidth600( (short) (methodOut.getIpmErrorPointerWidth600()-methodOut.getErrLngth400()));
//  IF 600-IPM-ERROR-POINTER-WIDTH > 0
                  if (	( methodOut.getIpmErrorPointerWidth600() > 0 ) ) { 

// *             Set up next line of error-pointers
                      // MOVE 1 TO 400-ERR-START
                      methodOut.setErrStart400((short)1);
                      methodOut.setErrLngth400((short) (Stream.of(methodOut.getIpmErrorPointerWidth600(),(short) (101 - methodOut.getErrStart400())).min(Comparator.comparing(Integer::valueOf)).get()));
                      // MOVE SPACES TO 600-IPM-ERROR-POINTER-LINE
                      methodOut.setIpmErrorPointerLine600(CONSTANTS.SPACE_100);
//  MOVE ALL '|' TO 600-IPM-ERROR-POINTER-LINE ( 400-ERR-START : 400-ERR-LNGTH )
                      methodOut.setIpmErrorPointerLine600(replace(methodOut.getIpmErrorPointerLine600(),CONSTANTS.LITERAL_36552,(methodOut.getErrStart400()-1), (methodOut.getErrLngth400() + (methodOut.getErrStart400() - 1)) ));
                  }
              }
          }
//  MOVE 600-ERROR-CODE TO 600-MESSAGE-LENGTH-ERR-CODE
          methodOut.setMessageLengthErrCode600(String.valueOf(methodOut.getErrorCode600String()).toCharArray());
//  MOVE IP66102-IPM-MSG-LNGTH TO 600-MESSAGE-LENGTH
//  FORMAT_16989907 = "ZZ,ZZ9"
          methodOut.setMessageLength600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_16989907,String.valueOf(methodOut.getIp66102IpmMsgLngth()).toCharArray()));
//  DISPLAY 600-MESSAGE-LENGTH-MSG
          logger.info(methodIn.getMessageLengthMsg600().toString()); 
//  PERFORM 81110-DISPLAY-TAG-TABLE
          displayTagTable(programCtx.getDisplayTagTableInCtx());/*81110-DISPLAY-TAG-TABLE*/
          ;
      
      return methodOut;
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
      @Override
      public DisplayTagTableOutCtx displayTagTable(DisplayTagTableInCtx methodIn) throws Exception {
Ip662010Ctx programCtx = methodIn.getIp662010Ctx();
DisplayTagTableOutCtx methodOut = methodIn.getDisplayTagTableOutCtx();
//  DISPLAY SPACE
          logger.info(" "); 
//  SET IP65504-TCNT TO IP65504-T
          methodOut.setIp65504Tcnt((short) (short) methodIn.getIp65504T()); 
          
//  DISPLAY 'IP662010- TAG TABLE (' IP65504-TCNT ' ENTRIES)'
          logger.info("IP662010- TAG TABLE ({} ENTRIES)", String.valueOf(methodOut.getIp65504Tcnt())); 
//  DISPLAY 600-TAG-TABLE-HEADER
          logger.info(new String(methodIn.getTagTableHeader600())); 
//  PERFORM VARYING 800-I FROM 1 BY 1 UNTIL 800-I > IP65504-TCNT
          for (methodOut.setI800(1); (	( methodOut.getI800() <= methodOut.getIp65504Tcnt() )) ; methodOut.setI800(methodOut.getI800() + 1) ) {
//  EVALUATE IP65504-TAG-TYPE ( 800-I )
              switch(methodIn.getIp65504TagType(methodOut.getI800() - 1)){
              	case 1:
                  // MOVE 'M' TO 600-TAG-TYPE
                  //  LITERAL_M = 'M'
                  methodOut.setTagType600(CONSTANTS.LITERAL_M);
              break;
              	case 2:
                  // MOVE 'D' TO 600-TAG-TYPE
                  //  LITERAL_D = 'D'
                  methodOut.setTagType600(CONSTANTS.LITERAL_D);
              break;
              	case 3:
                  // MOVE 'P' TO 600-TAG-TYPE
                  //  LITERAL_P = 'P'
                  methodOut.setTagType600(CONSTANTS.LITERAL_P);
              break;
              }
//  MOVE IP65504-TAG-NO ( 800-I ) TO 600-TAG-NO
//  FORMAT_1059277505 = "ZZZ9"
              methodOut.setTagNo600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(methodOut.getIp65504TagNo(methodOut.getI800() - 1)).toCharArray()));
//  MOVE IP65504-TAG-SUB-FLD-NO ( 800-I ) TO 600-TAG-SUBFLD-NO
//  FORMAT_1059277505 = "ZZZ9"
              methodOut.setTagSubfldNo600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(methodOut.getIp65504TagSubFldNo(methodOut.getI800() - 1)).toCharArray()));
//  MOVE IP65504-TAG-STARTS ( 800-I ) TO 600-TAG-STARTS
//  FORMAT_1059277505 = "ZZZ9"
              methodOut.setTagStarts600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(methodOut.getIp65504TagStarts(methodOut.getI800() - 1)).toCharArray()));
//  MOVE IP65504-TAG-LNGTH ( 800-I ) TO 600-TAG-LNGTH
//  FORMAT_1059277505 = "ZZZ9"
              methodOut.setTagLngth600(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1059277505,String.valueOf(methodOut.getIp65504TagLngth(methodOut.getI800() - 1)).toCharArray()));
//  IF IP65504-TAG-STATUS ( 800-I ) EQUAL HIGH-VALUES
//  LITERAL_X = "X"
              if (( isHighValue(methodIn.getIp65504TagStatus(methodOut.getI800() - 1)) ) ) { 
                  // MOVE 'X' TO 600-TAG-STATUS
                  //  LITERAL_X = 'X', LITERAL_X = "X"
                  methodOut.setTagStatus600(CONSTANTS.LITERAL_X);
              }
//  IF IP65504-TAG-STARTS ( 800-I ) > 0 AND IP65504-TAG-LNGTH ( 800-I ) > 0
              if (	( methodOut.getIp65504TagStarts(methodOut.getI800() - 1) > 0 )  && 	( methodOut.getIp65504TagLngth(methodOut.getI800() - 1) > 0 ) ) { 
//  MOVE IP66102-IPM-MSG ( IP65504-TAG-STARTS ( 800-I ) : IP65504-TAG-LNGTH ( 800-I )) TO 600-TAG-CONTENT
                  methodOut.setTagContent600(substring(methodOut.getIp66102IpmMsg().getCharArray(),(methodOut.getIp65504TagStarts(methodOut.getI800() - 1)-1), (methodOut.getIp65504TagLngth(methodOut.getI800() - 1) + (methodOut.getIp65504TagStarts(methodOut.getI800() - 1) - 1)) ));
              }
//  ELSE
              else { 
                  // MOVE '<== NON-POSITIVE START OR LENGTH' TO 600-TAG-CONTENT
                  methodOut.setTagContent600(CONSTANTS.LITERAL_627409146);
              }
//  DISPLAY '          ' 600-TAG-TYPE ' ' 600-TAG-NO ' ' 600-TAG-SUBFLD-NO '   ' 600-TAG-STARTS '  ' 600-TAG-LNGTH '   ' 600-TAG-STATUS '      ' 600-TAG-CONTENT
              logger.info("          {} {} {}   {}  {}   {}      {}", new String(methodOut.getTagType600()), new String(methodOut.getTagNo600()), new String(methodOut.getTagSubfldNo600()), new String(methodOut.getTagStarts600()), new String(methodOut.getTagLngth600()), new String(methodOut.getTagStatus600()), new String(methodOut.getTagContent600())); 
          }
      
      return methodOut;
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
      @Override
      public void abend(AbendInCtx methodIn) throws Exception {
Ip662010Ctx programCtx = methodIn.getIp662010Ctx();

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
          logger.info(String.valueOf(methodIn.getAbendCode900())); 
      
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
