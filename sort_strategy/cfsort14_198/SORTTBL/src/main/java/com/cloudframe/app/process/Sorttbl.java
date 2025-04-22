  package com.cloudframe.app.process;
  /* 
*
*/
  
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.sorttbl.file.Scanner;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Qualifier;
  import com.cloudframe.app.data.Field;
  import java.util.Comparator;
  import com.cloudframe.app.sorttbl.dto.Ip00854wTable;
  import com.cloudframe.app.process.Ip666040;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.global.sharedvar.Ip66601UserTagInformation;
  import com.cloudframe.app.sorttbl.dto.*;
  import com.cloudframe.app.sorttbl.dto.Ip00854wTableData;
  import com.cloudframe.app.sorttbl.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.utility.CFUtil;
  
  @Component("sorttbl")
  
  public class Sorttbl extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Sorttbl.class);
  
  private Ip00854wTableData ip00854wTableData = new Ip00854wTableData() ;
  private Work work = new Work() ;
  
  
  
  @Autowired 
  @Qualifier("ip666040")
  Ip666040 ip666040;
  @Autowired 
  @Qualifier("global_ip66601UserTagInformation")
  Ip66601UserTagInformation ip66601UserTagInformation;
  
  
  private static final int IP00854WTXNCURRCDX_OFFSET = 0;
  private static final int IP00854WTXNCURRCDX_LENGTH = 3;
  private static final int IP00854WRECONCURRCDX_OFFSET = 3;
  private static final int IP00854WRECONCURRCDX_LENGTH = 3;
  private static final int IP00854WRULEEFFDATE_OFFSET = 6;
  private static final int IP00854WRULEEFFDATE_LENGTH = 8;
  private static final int IP66601_USER_TAG_LENGTH = 13;
  
  int ip66601UserEnd;
  int ip00854wIdx;
  int userEnd800;
  int ip66601UserT;
  
    @Autowired
    @Qualifier("sorttbl_scanner")
    Scanner scanner;
  
  
  
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
//  PERFORM MAINLINE
          mainline();/*MAINLINE*/
          if (this.isProgramEnded()) {
              return getRc();
          }
       } catch(Exception e) {
            handleErrorCode(e);
            throw e;
       }
        finally {
      		if(scanner.hasOpened()) { 
      			scanner.close();
      		}
      }
      
       return getRc(); // Exit with return code
      // end of process method
      }
      /**
      * mainline 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE COBOL Cyclomatic complexity - 14
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void mainline() throws Exception {
      
// *

// *
// *    Sort table with no duplicates
// *
//  PERFORM MAINLINE-SPLIT0
          mainlineSplit0();/*MAINLINE-SPLIT0*/
//  PERFORM MAINLINE-SPLIT1
          mainlineSplit1();/*MAINLINE-SPLIT1*/
//  PERFORM MAINLINE-SPLIT2
          mainlineSplit2();/*MAINLINE-SPLIT2*/
      
      }
      /**
      * mainlineSplit0 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT0 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - ip00854wEntriesMax             COBOL Name: IP00854W-ENTRIES-MAX
      *
      * Output :  

      * - recordsLoaded400               COBOL Name: 400-RECORDS-LOADED
      * - acceptInput                    COBOL Name: WS-ACCEPT-INPUT
      * - ip00854wEntry                  COBOL Name: IP00854W-ENTRY
      * - ip00854wIdx                    COBOL Name: IP00854W-IDX
      * - ip66601UserTagInformation      COBOL Name: IP66601-USER-TAG-INFORMATION
      * - ip66601UserTcnt                COBOL Name: IP66601-USER-TCNT
      * - idx                            COBOL Name: WS-IDX
      * - ip66601UserTagType             COBOL Name: IP66601-USER-TAG-TYPE
      * - ip66601UserTagNo               COBOL Name: IP66601-USER-TAG-NO
      * - ip66601UserTagOccurrence       COBOL Name: IP66601-USER-TAG-OCCURRENCE
      * - ip66601UserTagSubfldNo         COBOL Name: IP66601-USER-TAG-SUBFLD-NO
      * - ip66601UserTagStart            COBOL Name: IP66601-USER-TAG-START
      * - ip66601UserTagLngth            COBOL Name: IP66601-USER-TAG-LNGTH
      * - ip66601UserTagStatus           COBOL Name: IP66601-USER-TAG-STATUS
      *
      * @throws CFException
      */
      private void mainlineSplit0() throws Exception {
			// Declare local variables used in the method
			char[] consoleInput = null;
			Ip00854wTable ip00854wTable = ip00854wTableData.getIp00854wTable();
			// End of variable declaration

//  MOVE 0 TO 400-RECORDS-LOADED
          work.setRecordsLoaded400(0);
//  ACCEPT WS-ACCEPT-INPUT
          consoleInput = scanner.nextLine();
          if (!scanner.hasEnded()) {
             work.setAcceptInput(consoleInput);  // read from console and assign
          }
//  PERFORM UNTIL WS-ACCEPT-INPUT (1 : 5) = '*END*' OR 400-RECORDS-LOADED >= IP00854W-ENTRIES-MAX
          while ((!(Field.compareChar(work.getAcceptInput() , CONSTANTS.LITERAL_STR2_END , ( 0 /*start*/ ), 5 /*left len*/ , 5 /*right len*/)) && 	( work.getRecordsLoaded400() < work.getIp00854wEntriesMax() ))) {
//  ADD 1 TO 400-RECORDS-LOADED
              work.setRecordsLoaded400(work.getRecordsLoaded400()+1);
//  MOVE WS-ACCEPT-INPUT TO IP00854W-ENTRY ( 400-RECORDS-LOADED )
              ip00854wTableData.getIp00854wTable().setIp00854wEntry((work.getRecordsLoaded400() - 1),work.getAcceptInput());
//  ACCEPT WS-ACCEPT-INPUT
              consoleInput = scanner.nextLine();
              if (!scanner.hasEnded()) {
                 work.setAcceptInput(consoleInput);  // read from console and assign
              }
          }

// *
//  SORT IP00854W-ENTRY ASCENDING IP00854W-TXN-CURR-CD-X , IP00854W-RECON-CURR-CD-X DESCENDING IP00854W-RULE-EFF-DATE
          try {
              ip00854wTable.getIp00854wEntry().sort(Ip00854wEntry.getIp00854wTxnCurrCdXComparator(true/*isAscending*/)
                .thenComparing(Ip00854wEntry.getIp00854wReconCurrCdXComparator(true/*isAscending*/))
                .thenComparing(Comparator.<Ip00854wEntry>comparingLong( value -> { try { return value.getIp00854wRuleEffDate();}catch(Exception e) { throw new RuntimeException("Error occurred during comparison", e); }}).reversed()));
          } catch(Exception e) {
              logger.error("{}",e);
          }	
  
//  DISPLAY '>>>>>>>'
          logger.info(">>>>>>>"); 
//  DISPLAY ' '
          logger.info(" "); 
//  DISPLAY 'SORTED TABLE (NO DUPLICATES)'
          logger.info("SORTED TABLE (NO DUPLICATES)"); 
//  DISPLAY ' '
          logger.info(" "); 
//  PERFORM VARYING IP00854W-IDX FROM 1 BY 1 UNTIL IP00854W-IDX > 400-RECORDS-LOADED
          for (ip00854wIdx = 1; (	( ip00854wIdx <= work.getRecordsLoaded400() )) ; ip00854wIdx = ip00854wIdx + 1 ) {
//  DISPLAY IP00854W-ENTRY ( IP00854W-IDX )
              logger.info(ip00854wTableData.getIp00854wTable().getIp00854wEntry(ip00854wIdx - 1).toString()); 
          }
//  DISPLAY ' '
          logger.info(" "); 
//  DISPLAY '<<<<<<<'
          logger.info("<<<<<<<"); 
//  DISPLAY ' '
          logger.info(" "); 

// *
// *    Sort table with duplicates
// *
//  MOVE 0 TO 400-RECORDS-LOADED
          work.setRecordsLoaded400(0);
//  ACCEPT WS-ACCEPT-INPUT
          consoleInput = scanner.nextLine();
          if (!scanner.hasEnded()) {
             work.setAcceptInput(consoleInput);  // read from console and assign
          }
//  PERFORM UNTIL WS-ACCEPT-INPUT (1 : 5) = '*END*' OR 400-RECORDS-LOADED >= IP00854W-ENTRIES-MAX
          while ((!(Field.compareChar(work.getAcceptInput() , CONSTANTS.LITERAL_STR2_END , ( 0 /*start*/ ), 5 /*left len*/ , 5 /*right len*/)) && 	( work.getRecordsLoaded400() < work.getIp00854wEntriesMax() ))) {
//  ADD 1 TO 400-RECORDS-LOADED
              work.setRecordsLoaded400(work.getRecordsLoaded400()+1);
//  MOVE WS-ACCEPT-INPUT TO IP00854W-ENTRY ( 400-RECORDS-LOADED )
              ip00854wTableData.getIp00854wTable().setIp00854wEntry((work.getRecordsLoaded400() - 1),work.getAcceptInput());
//  ACCEPT WS-ACCEPT-INPUT
              consoleInput = scanner.nextLine();
              if (!scanner.hasEnded()) {
                 work.setAcceptInput(consoleInput);  // read from console and assign
              }
          }

// *
//  SORT IP00854W-ENTRY ASCENDING IP00854W-TXN-CURR-CD-X , IP00854W-RECON-CURR-CD-X DESCENDING IP00854W-RULE-EFF-DATE WITH DUPLICATES IN ORDER COLLATING SEQUENCE IS EBCDIC
          try {
              ip00854wTable.getIp00854wEntry().sort(Ip00854wEntry.getIp00854wTxnCurrCdXComparator(true/*isAscending*/)
                .thenComparing(Ip00854wEntry.getIp00854wReconCurrCdXComparator(true/*isAscending*/))
                .thenComparing(Comparator.<Ip00854wEntry>comparingLong( value -> { try { return value.getIp00854wRuleEffDate();}catch(Exception e) { throw new RuntimeException("Error occurred during comparison", e); }}).reversed()));
          } catch(Exception e) {
              logger.error("{}",e);
          }	
  

// *
//  DISPLAY '>>>>>>>'
          logger.info(">>>>>>>"); 
//  DISPLAY ' '
          logger.info(" "); 
//  DISPLAY 'SORTED TABLE (DUPLICATES)'
          logger.info("SORTED TABLE (DUPLICATES)"); 
//  DISPLAY ' '
          logger.info(" "); 
//  PERFORM VARYING IP00854W-IDX FROM 1 BY 1 UNTIL IP00854W-IDX > 400-RECORDS-LOADED
          for (ip00854wIdx = 1; (	( ip00854wIdx <= work.getRecordsLoaded400() )) ; ip00854wIdx = ip00854wIdx + 1 ) {
//  DISPLAY IP00854W-ENTRY ( IP00854W-IDX )
              logger.info(ip00854wTableData.getIp00854wTable().getIp00854wEntry(ip00854wIdx - 1).toString()); 
          }
//  DISPLAY ' '
          logger.info(" "); 
//  DISPLAY '<<<<<<<'
          logger.info("<<<<<<<"); 
//  DISPLAY ' '
          logger.info(" "); 

// *
// *
// * Populate ip66601-user-tag-table
// *
//  MOVE SPACES TO IP66601-USER-TAG-INFORMATION
          ip66601UserTagInformation.setString(CONSTANTS.SPACE_9102);
//  MOVE 10 TO IP66601-USER-TCNT
          ip66601UserTagInformation.setIp66601UserTcnt((short)10);

// * Item 1

// *
          // MOVE 1 TO WS-IDX
          work.setIdx((short)1);
//  MOVE 1 TO IP66601-USER-TAG-TYPE ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagType((short)1);
//  MOVE 0 TO IP66601-USER-TAG-NO ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagNo((short)0);
//  MOVE 0 TO IP66601-USER-TAG-OCCURRENCE ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).getIp66601UserTagId().setIp66601UserTagOccurrence((short)0);
//  MOVE 0 TO IP66601-USER-TAG-SUBFLD-NO ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).getIp66601UserTagId().setIp66601UserTagSubfldNo((short)0);
//  MOVE 1 TO IP66601-USER-TAG-START ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).setIp66601UserTagStart((short)1);
//  MOVE 4 TO IP66601-USER-TAG-LNGTH ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).setIp66601UserTagLngth((short)4);
//  MOVE '?' TO IP66601-USER-TAG-STATUS ( IP66601-USER-T )
//  LITERAL_34661 = '?'
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).setIp66601UserTagStatus(CONSTANTS.LITERAL_34661);

// *
// *
// * Item 2
// *

// *
          // MOVE 2 TO WS-IDX
          work.setIdx((short)2);
//  MOVE 2 TO IP66601-USER-TAG-TYPE ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagType((short)2);
//  MOVE 24 TO IP66601-USER-TAG-NO ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagNo((short)24);
//  MOVE 0 TO IP66601-USER-TAG-OCCURRENCE ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).getIp66601UserTagId().setIp66601UserTagOccurrence((short)0);
//  MOVE 0 TO IP66601-USER-TAG-SUBFLD-NO ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).getIp66601UserTagId().setIp66601UserTagSubfldNo((short)0);
//  MOVE 21 TO IP66601-USER-TAG-START ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).setIp66601UserTagStart((short)21);
//  MOVE 3 TO IP66601-USER-TAG-LNGTH ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).setIp66601UserTagLngth((short)3);
//  MOVE ' ' TO IP66601-USER-TAG-STATUS ( IP66601-USER-T )
//  SPACE = ' '
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).setIp66601UserTagStatus(CONSTANTS.SPACE);

// *
// *
// * Item 3
// *

// *
          // MOVE 3 TO WS-IDX
          work.setIdx((short)3);
//  MOVE 3 TO IP66601-USER-TAG-TYPE ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagType((short)3);
//  MOVE 105 TO IP66601-USER-TAG-NO ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagNo((short)105);
//  MOVE 0 TO IP66601-USER-TAG-OCCURRENCE ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).getIp66601UserTagId().setIp66601UserTagOccurrence((short)0);
//  MOVE 1 TO IP66601-USER-TAG-SUBFLD-NO ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).getIp66601UserTagId().setIp66601UserTagSubfldNo((short)1);
//  MOVE 34 TO IP66601-USER-TAG-START ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).setIp66601UserTagStart((short)34);
//  MOVE 3 TO IP66601-USER-TAG-LNGTH ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).setIp66601UserTagLngth((short)3);
//  MOVE ' ' TO IP66601-USER-TAG-STATUS ( IP66601-USER-T )
//  SPACE = ' '
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).setIp66601UserTagStatus(CONSTANTS.SPACE);

// *
// *
// * Item 4
// *

// *
          // MOVE 4 TO WS-IDX
          work.setIdx((short)4);
      
      }
      /**
      * mainlineSplit1 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT1 COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output :  

      * - ip66601UserTagType             COBOL Name: IP66601-USER-TAG-TYPE
      * - ip66601UserTagNo               COBOL Name: IP66601-USER-TAG-NO
      * - ip66601UserTagOccurrence       COBOL Name: IP66601-USER-TAG-OCCURRENCE
      * - ip66601UserTagSubfldNo         COBOL Name: IP66601-USER-TAG-SUBFLD-NO
      * - ip66601UserTagStart            COBOL Name: IP66601-USER-TAG-START
      * - ip66601UserTagLngth            COBOL Name: IP66601-USER-TAG-LNGTH
      * - ip66601UserTagStatus           COBOL Name: IP66601-USER-TAG-STATUS
      * - idx                            COBOL Name: WS-IDX
      *
      * @throws CFException
      */
      private void mainlineSplit1() throws Exception {
//  MOVE 3 TO IP66601-USER-TAG-TYPE ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagType((short)3);
//  MOVE 105 TO IP66601-USER-TAG-NO ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagNo((short)105);
//  MOVE 0 TO IP66601-USER-TAG-OCCURRENCE ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).getIp66601UserTagId().setIp66601UserTagOccurrence((short)0);
//  MOVE 2 TO IP66601-USER-TAG-SUBFLD-NO ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).getIp66601UserTagId().setIp66601UserTagSubfldNo((short)2);
//  MOVE 37 TO IP66601-USER-TAG-START ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).setIp66601UserTagStart((short)37);
//  MOVE 6 TO IP66601-USER-TAG-LNGTH ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).setIp66601UserTagLngth((short)6);
//  MOVE ' ' TO IP66601-USER-TAG-STATUS ( IP66601-USER-T )
//  SPACE = ' '
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).setIp66601UserTagStatus(CONSTANTS.SPACE);

// *
// *
// * Item 5
// *

// *
          // MOVE 5 TO WS-IDX
          work.setIdx((short)5);
//  MOVE 3 TO IP66601-USER-TAG-TYPE ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagType((short)3);
//  MOVE 105 TO IP66601-USER-TAG-NO ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagNo((short)105);
//  MOVE 0 TO IP66601-USER-TAG-OCCURRENCE ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).getIp66601UserTagId().setIp66601UserTagOccurrence((short)0);
//  MOVE 3 TO IP66601-USER-TAG-SUBFLD-NO ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).getIp66601UserTagId().setIp66601UserTagSubfldNo((short)3);
//  MOVE 43 TO IP66601-USER-TAG-START ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).setIp66601UserTagStart((short)43);
//  MOVE 11 TO IP66601-USER-TAG-LNGTH ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).setIp66601UserTagLngth((short)11);
//  MOVE ' ' TO IP66601-USER-TAG-STATUS ( IP66601-USER-T )
//  SPACE = ' '
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).setIp66601UserTagStatus(CONSTANTS.SPACE);

// *
// *
// * Item 6
// *

// *
          // MOVE 6 TO WS-IDX
          work.setIdx((short)6);
//  MOVE 3 TO IP66601-USER-TAG-TYPE ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagType((short)3);
//  MOVE 105 TO IP66601-USER-TAG-NO ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagNo((short)105);
//  MOVE 0 TO IP66601-USER-TAG-OCCURRENCE ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).getIp66601UserTagId().setIp66601UserTagOccurrence((short)0);
//  MOVE 4 TO IP66601-USER-TAG-SUBFLD-NO ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).getIp66601UserTagId().setIp66601UserTagSubfldNo((short)4);
//  MOVE 54 TO IP66601-USER-TAG-START ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).setIp66601UserTagStart((short)54);
//  MOVE 05 TO IP66601-USER-TAG-LNGTH ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).setIp66601UserTagLngth((short)5);
//  MOVE ' ' TO IP66601-USER-TAG-STATUS ( IP66601-USER-T )
//  SPACE = ' '
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).setIp66601UserTagStatus(CONSTANTS.SPACE);

// *
// *
// * Item 7
// *

// *
          // MOVE 7 TO WS-IDX
          work.setIdx((short)7);
//  MOVE 3 TO IP66601-USER-TAG-TYPE ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagType((short)3);
//  MOVE 122 TO IP66601-USER-TAG-NO ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagNo((short)122);
//  MOVE 0 TO IP66601-USER-TAG-OCCURRENCE ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).getIp66601UserTagId().setIp66601UserTagOccurrence((short)0);
//  MOVE 0 TO IP66601-USER-TAG-SUBFLD-NO ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).getIp66601UserTagId().setIp66601UserTagSubfldNo((short)0);
//  MOVE 66 TO IP66601-USER-TAG-START ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).setIp66601UserTagStart((short)66);
//  MOVE 1 TO IP66601-USER-TAG-LNGTH ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).setIp66601UserTagLngth((short)1);
//  MOVE ' ' TO IP66601-USER-TAG-STATUS ( IP66601-USER-T )
//  SPACE = ' '
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).setIp66601UserTagStatus(CONSTANTS.SPACE);

// *
// *
// * Item 8
// *

// *
          // MOVE 8 TO WS-IDX
          work.setIdx((short)8);
//  MOVE 2 TO IP66601-USER-TAG-TYPE ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagType((short)2);
//  MOVE 71 TO IP66601-USER-TAG-NO ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagNo((short)71);
//  MOVE 0 TO IP66601-USER-TAG-OCCURRENCE ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).getIp66601UserTagId().setIp66601UserTagOccurrence((short)0);
//  MOVE 0 TO IP66601-USER-TAG-SUBFLD-NO ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).getIp66601UserTagId().setIp66601UserTagSubfldNo((short)0);
//  MOVE 67 TO IP66601-USER-TAG-START ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).setIp66601UserTagStart((short)67);
//  MOVE 8 TO IP66601-USER-TAG-LNGTH ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).setIp66601UserTagLngth((short)8);
//  MOVE ' ' TO IP66601-USER-TAG-STATUS ( IP66601-USER-T )
//  SPACE = ' '
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).setIp66601UserTagStatus(CONSTANTS.SPACE);

// *
// *
// * Item 9
// *

// *
          // MOVE 9 TO WS-IDX
          work.setIdx((short)9);
//  MOVE 3 TO IP66601-USER-TAG-TYPE ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagType((short)3);
//  MOVE 26 TO IP66601-USER-TAG-NO ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagNo((short)26);
//  MOVE 0 TO IP66601-USER-TAG-OCCURRENCE ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).getIp66601UserTagId().setIp66601UserTagOccurrence((short)0);
//  MOVE 1 TO IP66601-USER-TAG-SUBFLD-NO ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).getIp66601UserTagId().setIp66601UserTagSubfldNo((short)1);
//  MOVE 75 TO IP66601-USER-TAG-START ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).setIp66601UserTagStart((short)75);
//  MOVE 1 TO IP66601-USER-TAG-LNGTH ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).setIp66601UserTagLngth((short)1);
//  MOVE ' ' TO IP66601-USER-TAG-STATUS ( IP66601-USER-T )
//  SPACE = ' '
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).setIp66601UserTagStatus(CONSTANTS.SPACE);

// *
// *
// * Item 10
// *

// *
          // MOVE 10 TO WS-IDX
          work.setIdx((short)10);
//  MOVE 3 TO IP66601-USER-TAG-TYPE ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagType((short)3);
//  MOVE 26 TO IP66601-USER-TAG-NO ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagNo((short)26);
//  MOVE 0 TO IP66601-USER-TAG-OCCURRENCE ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).getIp66601UserTagId().setIp66601UserTagOccurrence((short)0);
      
      }
      /**
      * mainlineSplit2 
      *   This method is derived from 
  *   COBOL Paragraph - MAINLINE-SPLIT2 COBOL Cyclomatic complexity - 1
      * Input  :  

      * - ip66601UserT                   COBOL Name: IP66601-USER-T
      * - ip66601UserTcnt                COBOL Name: IP66601-USER-TCNT
      * - ip66601UserTagType             COBOL Name: IP66601-USER-TAG-TYPE
      * - ip66601UserTagNo               COBOL Name: IP66601-USER-TAG-NO
      * - ip66601UserTagOccurrence       COBOL Name: IP66601-USER-TAG-OCCURRENCE
      * - quicksort300                   COBOL Name: 300-QUICKSORT
      *
      * Output :  

      * - ip66601UserTagSubfldNo         COBOL Name: IP66601-USER-TAG-SUBFLD-NO
      * - ip66601UserTagStart            COBOL Name: IP66601-USER-TAG-START
      * - ip66601UserTagLngth            COBOL Name: IP66601-USER-TAG-LNGTH
      * - ip66601UserTagStatus           COBOL Name: IP66601-USER-TAG-STATUS
      * - ip66601UserT                   COBOL Name: IP66601-USER-T
      * - ptrIp666040800                 COBOL Name: 800-PTR-IP666040
      * - ip66601UserEnd                 COBOL Name: IP66601-USER-END
      * - userEnd800                     COBOL Name: 800-USER-END
      * - rc                             COBOL Name: RETURN-CODE
      *
      * @throws CFException
      */
      private void mainlineSplit2() throws Exception {
//  MOVE 2 TO IP66601-USER-TAG-SUBFLD-NO ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).getIp66601UserTagId().setIp66601UserTagSubfldNo((short)2);
//  MOVE 76 TO IP66601-USER-TAG-START ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).setIp66601UserTagStart((short)76);
//  MOVE 6 TO IP66601-USER-TAG-LNGTH ( WS-IDX )
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getIdx() - 1).setIp66601UserTagLngth((short)6);
//  MOVE ' ' TO IP66601-USER-TAG-STATUS ( IP66601-USER-T )
//  SPACE = ' '
          ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).setIp66601UserTagStatus(CONSTANTS.SPACE);

// *
//  DISPLAY ' '
          logger.info(" "); 
//  DISPLAY 'IP66601 TABLE ** INITIAL DISPLAY ** '
          logger.info("IP66601 TABLE ** INITIAL DISPLAY ** "); 
//  DISPLAY ' '
          logger.info(" "); 
//  PERFORM VARYING IP66601-USER-T FROM 1 BY 1 UNTIL IP66601-USER-T > IP66601-USER-TCNT
          for (ip66601UserT = 1; (	( ip66601UserT <= ip66601UserTagInformation.getIp66601UserTcnt() ) ) ; ip66601UserT = ip66601UserT + 1 ) {
//  DISPLAY '_____________'
              logger.info("_____________"); 
//  DISPLAY IP66601-USER-TAG-TYPE ( IP66601-USER-T )
              logger.info(String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagType())); 
//  DISPLAY IP66601-USER-TAG-NO ( IP66601-USER-T )
              logger.info(String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagNo())); 
//  DISPLAY IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-T )
              logger.info(String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserTagOccurrence())); 
//  DISPLAY IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-T )
              logger.info(String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserTagSubfldNo())); 
//  DISPLAY IP66601-USER-TAG-START ( IP66601-USER-T )
              logger.info(String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagStart())); 
//  DISPLAY IP66601-USER-TAG-LNGTH ( IP66601-USER-T )
              logger.info(String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagLngth())); 
//  DISPLAY IP66601-USER-TAG-STATUS ( IP66601-USER-T )
              logger.info(new String(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagStatus())); 
          }

// *
//  SET 800-PTR-IP666040 TO ENTRY 300-QUICKSORT
          work.setPtrIp666040800(work.getQuicksort300()); 
          
//  SET IP66601-USER-END TO IP66601-USER-TCNT
          ip66601UserEnd = ip66601UserTagInformation.getIp66601UserTcnt(); 
          
//  SET 800-USER-END TO IP66601-USER-END
          userEnd800 = IP66601_USER_TAG_LENGTH * ( ((ip66601UserEnd < 1) ? 1:ip66601UserEnd) - 1); 
          
//  DISPLAY '** CALLING IP666040 **'
          logger.info("** CALLING IP666040 **"); 
//  CALL 800-PTR-IP666040
          // CALL 800-PTR-IP666040
          	this.setRc( ip666040.process());
//  SET IP66601-USER-T TO 800-USER-END
          ip66601UserT = (userEnd800/IP66601_USER_TAG_LENGTH) + 1 ; 
          

// *

// *
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          this.setProgramEnded(true);
          return ;
      
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
