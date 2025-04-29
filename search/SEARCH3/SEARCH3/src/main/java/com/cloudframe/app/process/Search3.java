  package com.cloudframe.app.process;
  /* 
*
*
*/
  
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.search3.dto.Ip66601UserTagTable;
  import com.cloudframe.app.search3.dto.Table;
  import com.cloudframe.app.search3.dto.*;
  import com.cloudframe.app.search3.dto.SrchVar;
  import com.cloudframe.app.search3.dto.TableGroup;
  import com.cloudframe.app.search3.dto.AccGrp500;
  import com.cloudframe.app.search3.dto.Ip66601UserTagInformation;
  import com.cloudframe.app.search3.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.utility.CFUtil;
  
  @Component("search3")
  
  public class Search3 extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Search3.class);
  
  private SrchVar srchVar = new SrchVar() ;
  private TableGroup tableGroup = new TableGroup() ;
  private AccGrp500 accGrp500 = new AccGrp500() ;
  private Ip66601UserTagInformation ip66601UserTagInformation = new Ip66601UserTagInformation() ;
  private Work work = new Work() ;
  
  
  
  
  
  
  int ip66601UserEnd;
  int ip66601UserP;
  int ip66601UserRight;
  int ip66601UserT;
  int finNfCurrCdIdx500;
  int tableIndex;
  int ip66601UserLeft;
  int ip66601UserStart;
  int ip66601UserMedian;
  
  
  
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
//  PERFORM MAIN-LINE
          mainLine();/*MAIN-LINE*/
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
      * mainLine 
      *   This method is derived from 
  *   COBOL Paragraph - MAIN-LINE COBOL Cyclomatic complexity - 4
      * Input  :  

      * - i                              COBOL Name: WS-I
      *
      * Output :  

      * - i                              COBOL Name: WS-I
      * - ip66601UserTagType             COBOL Name: IP66601-USER-TAG-TYPE
      * - ip66601UserTagNo               COBOL Name: IP66601-USER-TAG-NO
      * - ip66601UserTagOccurrence       COBOL Name: IP66601-USER-TAG-OCCURRENCE
      * - ip66601UserTagSubfldNo         COBOL Name: IP66601-USER-TAG-SUBFLD-NO
      * - ip66601UserTagStart            COBOL Name: IP66601-USER-TAG-START
      * - ip66601UserTagLngth            COBOL Name: IP66601-USER-TAG-LNGTH
      * - ip66601UserTagStatus           COBOL Name: IP66601-USER-TAG-STATUS
      * - ip66601UserTcnt                COBOL Name: IP66601-USER-TCNT
      * - ip66601UserT                   COBOL Name: IP66601-USER-T
      * - ip66601UserP                   COBOL Name: IP66601-USER-P
      * - ip66601UserLeft                COBOL Name: IP66601-USER-LEFT
      * - ip66601UserRight               COBOL Name: IP66601-USER-RIGHT
      * - ip66601UserMedian              COBOL Name: IP66601-USER-MEDIAN
      * - ip66601UserStart               COBOL Name: IP66601-USER-START
      * - ip66601UserEnd                 COBOL Name: IP66601-USER-END
      * - srchval                        COBOL Name: WS-SRCHVAL
      *
      * @throws CFException
      */
      private void mainLine() throws Exception {

// *
// * Populate ip66601-user-tag-table
// *
//  PERFORM VARYING WS-I FROM 1 BY 1 UNTIL WS-I > 10
          for (work.setI(1); (	( work.getI() <= 10 ) ) ; work.setI(work.getI() + 1) ) {
//  MOVE WS-I TO IP66601-USER-TAG-TYPE ( WS-I )
              ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getI() - 1).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagType(work.getI());
              ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getI() - 1).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagNo((short) (work.getI() * 10));
              ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getI() - 1).getIp66601UserTagId().setIp66601UserTagOccurrence((short) (work.getI() * 11));
              ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getI() - 1).getIp66601UserTagId().setIp66601UserTagSubfldNo((short) (work.getI() * 12));
              ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getI() - 1).setIp66601UserTagStart((short) (work.getI() * 13));
              ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getI() - 1).setIp66601UserTagLngth((short) (work.getI() * 14));
//  MOVE 'A' TO IP66601-USER-TAG-STATUS ( WS-I )
//  LITERAL_A = 'A'
              ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(work.getI() - 1).setIp66601UserTagStatus(CONSTANTS.LITERAL_A);
          }

// *

// *
//  MOVE 10 TO IP66601-USER-TCNT
          ip66601UserTagInformation.setIp66601UserTcnt((short)10);
//  SET IP66601-USER-T , IP66601-USER-P TO 1
          ip66601UserT = 1; 
          
          ip66601UserP = 1; 
          
//  SET IP66601-USER-LEFT TO 1
          ip66601UserLeft = 1; 
          
//  SET IP66601-USER-RIGHT TO 10
          ip66601UserRight = 10; 
          
//  SET IP66601-USER-MEDIAN TO 5
          ip66601UserMedian = 5; 
          
//  SET IP66601-USER-START TO 6
          ip66601UserStart = 6; 
          
//  SET IP66601-USER-END TO 7
          ip66601UserEnd = 7; 
          
//  SET IP66601-USER-P TO 1
          ip66601UserP = 1; 
          

// *
//  DISPLAY '-------------------------------------------'
          logger.info("-------------------------------------------"); 
          // MOVE 3 TO WS-SRCHVAL
          work.setSrchval(3);
//  DISPLAY ' ABOUT TO SEARCH TAGTYPE ' WS-SRCHVAL
          logger.info(" ABOUT TO SEARCH TAGTYPE {}", String.valueOf(work.getSrchval())); 
//  PERFORM 0200-SEARCH THRU 0200-EXIT
          search();/*0200-SEARCH*/
          if (this.isProgramEnded()) {
              return ;
          }

// *
//  DISPLAY '-------------------------------------------'
          logger.info("-------------------------------------------"); 
          // MOVE 7 TO WS-SRCHVAL
          work.setSrchval(7);
//  DISPLAY ' ABOUT TO SEARCH TAGTYPE ' WS-SRCHVAL
          logger.info(" ABOUT TO SEARCH TAGTYPE {}", String.valueOf(work.getSrchval())); 
//  PERFORM 0200-SEARCH THRU 0200-EXIT
          search();/*0200-SEARCH*/
          if (this.isProgramEnded()) {
              return ;
          }

// *
//  DISPLAY '-------------------------------------------'
          logger.info("-------------------------------------------"); 
          // MOVE 2 TO WS-SRCHVAL
          work.setSrchval(2);
//  DISPLAY ' ABOUT TO SEARCH TAGTYPE ' WS-SRCHVAL
          logger.info(" ABOUT TO SEARCH TAGTYPE {}", String.valueOf(work.getSrchval())); 
//  PERFORM 0200-SEARCH THRU 0200-EXIT
          search();/*0200-SEARCH*/
          if (this.isProgramEnded()) {
              return ;
          }

// *
//  DISPLAY '-------------------------------------------'
          logger.info("-------------------------------------------"); 
          // MOVE 4 TO WS-SRCHVAL
          work.setSrchval(4);
//  DISPLAY ' ABOUT TO SEARCH TAGTYPE ' WS-SRCHVAL
          logger.info(" ABOUT TO SEARCH TAGTYPE {}", String.valueOf(work.getSrchval())); 
//  PERFORM 0300-SEARCH THRU 0300-EXIT
          search0300();/*0300-SEARCH*/
          if (this.isProgramEnded()) {
              return ;
          }

// *
//  DISPLAY '-------------------------------------------'
          logger.info("-------------------------------------------"); 
          // MOVE 2 TO WS-SRCHVAL
          work.setSrchval(2);
//  DISPLAY ' ABOUT TO SEARCH TAGTYPE ' WS-SRCHVAL
          logger.info(" ABOUT TO SEARCH TAGTYPE {}", String.valueOf(work.getSrchval())); 
//  PERFORM 0300-SEARCH THRU 0300-EXIT
          search0300();/*0300-SEARCH*/
          if (this.isProgramEnded()) {
              return ;
          }

// *
// *
//  DISPLAY '-------------------------------------------'
          logger.info("-------------------------------------------"); 
          // MOVE 5 TO WS-SRCHVAL
          work.setSrchval(5);
//  DISPLAY ' ABOUT TO SEARCH TAGTYPE ' WS-SRCHVAL
          logger.info(" ABOUT TO SEARCH TAGTYPE {}", String.valueOf(work.getSrchval())); 
//  PERFORM 0400-SEARCH THRU 0400-EXIT
          search0400();/*0400-SEARCH*/
          if (this.isProgramEnded()) {
              return ;
          }

// *
//  DISPLAY '-------------------------------------------'
          logger.info("-------------------------------------------"); 
//  DISPLAY ' SEARCH WITH COMPLEX WHEN CONDITION '
          logger.info(" SEARCH WITH COMPLEX WHEN CONDITION "); 
//  PERFORM 0500-SEARCH THRU 0500-EXIT
          search0500();/*0500-SEARCH*/
          if (this.isProgramEnded()) {
              return ;
          }
          ;
      
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
      * search 
      *   This method is derived from 
  *   COBOL Paragraph - 0200-SEARCH COBOL Cyclomatic complexity - 5
      * Input  :  

      * - ip66601UserTag                 COBOL Name: IP66601-USER-TAG
      * - srchval                        COBOL Name: WS-SRCHVAL
      * - ip66601UserTcnt                COBOL Name: IP66601-USER-TCNT
      * - ip66601UserTagType             COBOL Name: IP66601-USER-TAG-TYPE
      * - ip66601UserTagNo               COBOL Name: IP66601-USER-TAG-NO
      * - ip66601UserTagOccurrence       COBOL Name: IP66601-USER-TAG-OCCURRENCE
      * - ip66601UserTagSubfldNo         COBOL Name: IP66601-USER-TAG-SUBFLD-NO
      * - ip66601UserTagStart            COBOL Name: IP66601-USER-TAG-START
      * - ip66601UserTagLngth            COBOL Name: IP66601-USER-TAG-LNGTH
      * - ip66601UserTagStatus           COBOL Name: IP66601-USER-TAG-STATUS
      *
      * Output :  

      * - ip66601UserP                   COBOL Name: IP66601-USER-P
      * - lastDeTag800                   COBOL Name: 800-LAST-DE-TAG
      * - ip66601UserTcnt                COBOL Name: IP66601-USER-TCNT
      *
      * @throws CFException
      */
      private void search() throws Exception {
			// Declare local variables used in the method
			Ip66601UserTagTable ip66601UserTagTable = ip66601UserTagInformation.getIp66601UserTagTable();
			boolean keepSearching = true;
			short ip66601UserTcnt = 0;
			// End of variable declaration


// *

// *
//  SET IP66601-USER-P TO 1
          ip66601UserP = 1; 
          
          ip66601UserTcnt = ip66601UserTagInformation.getIp66601UserTcnt();
//  SEARCH IP66601-USER-TAG VARYING IP66601-USER-P
          keepSearching = true;
          while(keepSearching) {
          	if  (	( ip66601UserTagTable.getIp66601UserTag(ip66601UserP - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagType() == work.getSrchval() ) ) { 
//  DISPLAY 'SEARCHING FOR TAG TYPE = ' WS-SRCHVAL
              logger.info("SEARCHING FOR TAG TYPE = {}", String.valueOf(work.getSrchval())); 
//  DISPLAY '100-THERE-ARE-PDSES'
              logger.info("100-THERE-ARE-PDSES"); 
//  SET 800-LAST-DE-TAG TO IP66601-USER-P
              work.setLastDeTag800(ip66601UserP); 
              
//  SUBTRACT 1 FROM 800-LAST-DE-TAG
              work.setLastDeTag800(work.getLastDeTag800()-1);
          	break;
          	}
          	else if  (	( ip66601UserP >= ip66601UserTcnt ) ) { 
//  DISPLAY 'SEARCHING FOR TAG TYPE = ' WS-SRCHVAL
              logger.info("SEARCHING FOR TAG TYPE = {}", String.valueOf(work.getSrchval())); 
//  DISPLAY '100-WE-ARE-DONE-WITH-PDSES'
              logger.info("100-WE-ARE-DONE-WITH-PDSES"); 
//  MOVE IP66601-USER-TCNT TO 800-LAST-DE-TAG
              work.setLastDeTag800(ip66601UserTagInformation.getIp66601UserTcnt());
          	break;
          	}
          	ip66601UserP++;
          	if (ip66601UserP > 700) { 
          	 keepSearching = false;
          	}
          }
          	if(!keepSearching) { 
//  DISPLAY 'SEARCHING FOR TAG TYPE = ' WS-SRCHVAL
              logger.info("SEARCHING FOR TAG TYPE = {}", String.valueOf(work.getSrchval())); 
//  DISPLAY '100-WE-ARE-DONE-WITH-PDSES'
              logger.info("100-WE-ARE-DONE-WITH-PDSES"); 
//  MOVE IP66601-USER-TCNT TO 800-LAST-DE-TAG
              work.setLastDeTag800(ip66601UserTagInformation.getIp66601UserTcnt());
          	}
  
//  DISPLAY ' '
          logger.info(" "); 
//  DISPLAY '800-LAST-DE-TAG = ' 800-LAST-DE-TAG
          logger.info("800-LAST-DE-TAG = {}", String.valueOf(work.getLastDeTag800())); 
//  DISPLAY 'MATCHED VALUES WITH IP66601-USER-P INDEX      ' IP66601-USER-TAG-TYPE ( IP66601-USER-P ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-P ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-P ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-P ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-P ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-P ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-P )
          logger.info("MATCHED VALUES WITH IP66601-USER-P INDEX      {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserP - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagType()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserP - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserP - 1).getIp66601UserTagId().getIp66601UserTagOccurrence()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserP - 1).getIp66601UserTagId().getIp66601UserTagSubfldNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserP - 1).getIp66601UserTagStart()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserP - 1).getIp66601UserTagLngth()), new String(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserP - 1).getIp66601UserTagStatus())); 
//  DISPLAY '....... VALUES WITH IP66601-USER-T INDEX      ' IP66601-USER-TAG-TYPE ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-T )
          logger.info("....... VALUES WITH IP66601-USER-T INDEX      {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagType()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserTagOccurrence()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserTagSubfldNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagStart()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagLngth()), new String(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagStatus())); 
//  DISPLAY '....... VALUES WITH IP66601-USER-LEFT INDEX   ' IP66601-USER-TAG-TYPE ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-LEFT )
          logger.info("....... VALUES WITH IP66601-USER-LEFT INDEX   {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserLeft - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagType()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserLeft - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserLeft - 1).getIp66601UserTagId().getIp66601UserTagOccurrence()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserLeft - 1).getIp66601UserTagId().getIp66601UserTagSubfldNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserLeft - 1).getIp66601UserTagStart()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserLeft - 1).getIp66601UserTagLngth()), new String(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserLeft - 1).getIp66601UserTagStatus())); 
//  DISPLAY '....... VALUES WITH IP66601-USER-RIGHT INDEX  ' IP66601-USER-TAG-TYPE ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-RIGHT )
          logger.info("....... VALUES WITH IP66601-USER-RIGHT INDEX  {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserRight - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagType()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserRight - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserRight - 1).getIp66601UserTagId().getIp66601UserTagOccurrence()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserRight - 1).getIp66601UserTagId().getIp66601UserTagSubfldNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserRight - 1).getIp66601UserTagStart()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserRight - 1).getIp66601UserTagLngth()), new String(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserRight - 1).getIp66601UserTagStatus())); 
//  DISPLAY '....... VALUES WITH IP66601-USER-MEDIAN INDEX ' IP66601-USER-TAG-TYPE ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-MEDIAN )
          logger.info("....... VALUES WITH IP66601-USER-MEDIAN INDEX {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserMedian - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagType()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserMedian - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserMedian - 1).getIp66601UserTagId().getIp66601UserTagOccurrence()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserMedian - 1).getIp66601UserTagId().getIp66601UserTagSubfldNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserMedian - 1).getIp66601UserTagStart()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserMedian - 1).getIp66601UserTagLngth()), new String(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserMedian - 1).getIp66601UserTagStatus())); 
//  DISPLAY '....... VALUES WITH IP66601-USER-START INDEX  ' IP66601-USER-TAG-TYPE ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-START )
          logger.info("....... VALUES WITH IP66601-USER-START INDEX  {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserStart - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagType()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserStart - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserStart - 1).getIp66601UserTagId().getIp66601UserTagOccurrence()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserStart - 1).getIp66601UserTagId().getIp66601UserTagSubfldNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserStart - 1).getIp66601UserTagStart()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserStart - 1).getIp66601UserTagLngth()), new String(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserStart - 1).getIp66601UserTagStatus())); 
//  DISPLAY '....... VALUES WITH IP66601-USER-END INDEX    ' IP66601-USER-TAG-TYPE ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-END )
          logger.info("....... VALUES WITH IP66601-USER-END INDEX    {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserEnd - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagType()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserEnd - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserEnd - 1).getIp66601UserTagId().getIp66601UserTagOccurrence()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserEnd - 1).getIp66601UserTagId().getIp66601UserTagSubfldNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserEnd - 1).getIp66601UserTagStart()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserEnd - 1).getIp66601UserTagLngth()), new String(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserEnd - 1).getIp66601UserTagStatus())); 
          ;
      
      }
      /**
      * search0300 
      *   This method is derived from 
  *   COBOL Paragraph - 0300-SEARCH COBOL Cyclomatic complexity - 6
      * Input  :  

      * - ip66601UserTag                 COBOL Name: IP66601-USER-TAG
      * - srchval                        COBOL Name: WS-SRCHVAL
      * - ip66601UserTcnt                COBOL Name: IP66601-USER-TCNT
      * - ip66601UserTagType             COBOL Name: IP66601-USER-TAG-TYPE
      * - ip66601UserTagOccurrence       COBOL Name: IP66601-USER-TAG-OCCURRENCE
      * - ip66601UserTagNo               COBOL Name: IP66601-USER-TAG-NO
      * - ip66601UserTagSubfldNo         COBOL Name: IP66601-USER-TAG-SUBFLD-NO
      * - ip66601UserTagStart            COBOL Name: IP66601-USER-TAG-START
      * - ip66601UserTagLngth            COBOL Name: IP66601-USER-TAG-LNGTH
      * - ip66601UserTagStatus           COBOL Name: IP66601-USER-TAG-STATUS
      *
      * Output :  

      * - ip66601UserEnd                 COBOL Name: IP66601-USER-END
      * - lastDeTag800                   COBOL Name: 800-LAST-DE-TAG
      * - ip66601UserTcnt                COBOL Name: IP66601-USER-TCNT
      * - ip66601UserTagOccurrence       COBOL Name: IP66601-USER-TAG-OCCURRENCE
      *
      * @throws CFException
      */
      private void search0300() throws Exception {
			// Declare local variables used in the method
			Ip66601UserTagTable ip66601UserTagTable = ip66601UserTagInformation.getIp66601UserTagTable();
			boolean keepSearching = true;
			short ip66601UserTcnt = 0;
			// End of variable declaration

      
// *

// *

// *
//  SET IP66601-USER-END TO 1
          ip66601UserEnd = 1; 
          
          ip66601UserTcnt = ip66601UserTagInformation.getIp66601UserTcnt();
//  SEARCH IP66601-USER-TAG VARYING IP66601-USER-END
          keepSearching = true;
          while(keepSearching) {
          	if  (	( ip66601UserTagTable.getIp66601UserTag(ip66601UserEnd - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagType() == work.getSrchval() ) ) { 
//  DISPLAY 'SEARCHING FOR TAG TYPE = ' WS-SRCHVAL
              logger.info("SEARCHING FOR TAG TYPE = {}", String.valueOf(work.getSrchval())); 
//  DISPLAY '100-THERE-ARE-PDSES'
              logger.info("100-THERE-ARE-PDSES"); 
//  SET 800-LAST-DE-TAG TO IP66601-USER-END
              work.setLastDeTag800(ip66601UserEnd); 
              
//  SUBTRACT 1 FROM 800-LAST-DE-TAG
              work.setLastDeTag800(work.getLastDeTag800()-1);
//  IF IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-END ) > IP66601-USER-TAG-OCCURRENCE (3) THEN
              if (	( ip66601UserTagTable.getIp66601UserTag(ip66601UserEnd - 1).getIp66601UserTagId().getIp66601UserTagOccurrence() > ip66601UserTagTable.getIp66601UserTag(2).getIp66601UserTagId().getIp66601UserTagOccurrence() )) { 
//  DISPLAY 'TAG OCCURENCE IS > 33'
                  logger.info("TAG OCCURENCE IS > 33"); 
//  MOVE IP66601-USER-TAG-OCCURRENCE (3) TO IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-END )
                  ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserEnd - 1).getIp66601UserTagId().setIp66601UserTagOccurrence(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(2).getIp66601UserTagId().getIp66601UserTagOccurrence());
              }
  
//  ELSE
              else { 
//  DISPLAY 'TAG OCCURENCE IS <= 33'
                  logger.info("TAG OCCURENCE IS <= 33"); 
//  MOVE IP66601-USER-TAG-OCCURRENCE (3) TO IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-END )
                  ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserEnd - 1).getIp66601UserTagId().setIp66601UserTagOccurrence(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(2).getIp66601UserTagId().getIp66601UserTagOccurrence());
              }
          	break;
          	}
          	else if  (	( ip66601UserEnd >= ip66601UserTcnt ) ) { 
//  DISPLAY 'SEARCHING FOR TAG TYPE = ' WS-SRCHVAL
              logger.info("SEARCHING FOR TAG TYPE = {}", String.valueOf(work.getSrchval())); 
//  DISPLAY '100-WE-ARE-DONE-WITH-PDSES'
              logger.info("100-WE-ARE-DONE-WITH-PDSES"); 
//  MOVE IP66601-USER-TCNT TO 800-LAST-DE-TAG
              work.setLastDeTag800(ip66601UserTagInformation.getIp66601UserTcnt());
          	break;
          	}
          	ip66601UserEnd++;
          	if (ip66601UserEnd > 700) { 
          	 keepSearching = false;
          	}
          }
          	if(!keepSearching) { 
//  DISPLAY 'SEARCHING FOR TAG TYPE = ' WS-SRCHVAL
              logger.info("SEARCHING FOR TAG TYPE = {}", String.valueOf(work.getSrchval())); 
//  DISPLAY '100-WE-ARE-DONE-WITH-PDSES'
              logger.info("100-WE-ARE-DONE-WITH-PDSES"); 
//  MOVE IP66601-USER-TCNT TO 800-LAST-DE-TAG
              work.setLastDeTag800(ip66601UserTagInformation.getIp66601UserTcnt());
          	}
  
//  DISPLAY ' '
          logger.info(" "); 
//  DISPLAY '800-LAST-DE-TAG = ' 800-LAST-DE-TAG
          logger.info("800-LAST-DE-TAG = {}", String.valueOf(work.getLastDeTag800())); 
//  DISPLAY 'MATCHED VALUES WITH IP66601-USER-END INDEX    ' IP66601-USER-TAG-TYPE ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-END )
          logger.info("MATCHED VALUES WITH IP66601-USER-END INDEX    {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserEnd - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagType()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserEnd - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserEnd - 1).getIp66601UserTagId().getIp66601UserTagOccurrence()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserEnd - 1).getIp66601UserTagId().getIp66601UserTagSubfldNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserEnd - 1).getIp66601UserTagStart()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserEnd - 1).getIp66601UserTagLngth()), new String(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserEnd - 1).getIp66601UserTagStatus())); 
//  DISPLAY '....... VALUES WITH IP66601-USER-T INDEX      ' IP66601-USER-TAG-TYPE ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-T )
          logger.info("....... VALUES WITH IP66601-USER-T INDEX      {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagType()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserTagOccurrence()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserTagSubfldNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagStart()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagLngth()), new String(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagStatus())); 
//  DISPLAY '....... VALUES WITH IP66601-USER-LEFT INDEX   ' IP66601-USER-TAG-TYPE ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-LEFT )
          logger.info("....... VALUES WITH IP66601-USER-LEFT INDEX   {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserLeft - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagType()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserLeft - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserLeft - 1).getIp66601UserTagId().getIp66601UserTagOccurrence()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserLeft - 1).getIp66601UserTagId().getIp66601UserTagSubfldNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserLeft - 1).getIp66601UserTagStart()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserLeft - 1).getIp66601UserTagLngth()), new String(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserLeft - 1).getIp66601UserTagStatus())); 
//  DISPLAY '....... VALUES WITH IP66601-USER-RIGHT INDEX  ' IP66601-USER-TAG-TYPE ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-RIGHT )
          logger.info("....... VALUES WITH IP66601-USER-RIGHT INDEX  {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserRight - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagType()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserRight - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserRight - 1).getIp66601UserTagId().getIp66601UserTagOccurrence()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserRight - 1).getIp66601UserTagId().getIp66601UserTagSubfldNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserRight - 1).getIp66601UserTagStart()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserRight - 1).getIp66601UserTagLngth()), new String(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserRight - 1).getIp66601UserTagStatus())); 
//  DISPLAY '....... VALUES WITH IP66601-USER-MEDIAN INDEX ' IP66601-USER-TAG-TYPE ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-MEDIAN )
          logger.info("....... VALUES WITH IP66601-USER-MEDIAN INDEX {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserMedian - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagType()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserMedian - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserMedian - 1).getIp66601UserTagId().getIp66601UserTagOccurrence()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserMedian - 1).getIp66601UserTagId().getIp66601UserTagSubfldNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserMedian - 1).getIp66601UserTagStart()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserMedian - 1).getIp66601UserTagLngth()), new String(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserMedian - 1).getIp66601UserTagStatus())); 
//  DISPLAY '....... VALUES WITH IP66601-USER-START INDEX  ' IP66601-USER-TAG-TYPE ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-START )
          logger.info("....... VALUES WITH IP66601-USER-START INDEX  {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserStart - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagType()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserStart - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserStart - 1).getIp66601UserTagId().getIp66601UserTagOccurrence()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserStart - 1).getIp66601UserTagId().getIp66601UserTagSubfldNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserStart - 1).getIp66601UserTagStart()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserStart - 1).getIp66601UserTagLngth()), new String(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserStart - 1).getIp66601UserTagStatus())); 
//  DISPLAY '....... VALUES WITH IP66601-USER-P INDEX      ' IP66601-USER-TAG-TYPE ( IP66601-USER-P ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-P ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-P ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-P ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-P ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-P ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-P )
          logger.info("....... VALUES WITH IP66601-USER-P INDEX      {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserP - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagType()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserP - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserP - 1).getIp66601UserTagId().getIp66601UserTagOccurrence()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserP - 1).getIp66601UserTagId().getIp66601UserTagSubfldNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserP - 1).getIp66601UserTagStart()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserP - 1).getIp66601UserTagLngth()), new String(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserP - 1).getIp66601UserTagStatus())); 
          ;
      
      }
      /**
      * search0400 
      *   This method is derived from 
  *   COBOL Paragraph - 0400-SEARCH COBOL Cyclomatic complexity - 26
      * Input  :  

      * - ip66601UserTag                 COBOL Name: IP66601-USER-TAG
      * - srchval                        COBOL Name: WS-SRCHVAL
      * - ip66601UserTcnt                COBOL Name: IP66601-USER-TCNT
      * - ip66601UserTagType             COBOL Name: IP66601-USER-TAG-TYPE
      * - valueCr300                     COBOL Name: 300-VALUE-CR
      * - valueDr300                     COBOL Name: 300-VALUE-DR
      * - ip66601UserTagOccurrence       COBOL Name: IP66601-USER-TAG-OCCURRENCE
      * - ip66601UserTagNo               COBOL Name: IP66601-USER-TAG-NO
      * - ip66601UserTagSubfldNo         COBOL Name: IP66601-USER-TAG-SUBFLD-NO
      * - ip66601UserTagStart            COBOL Name: IP66601-USER-TAG-START
      * - ip66601UserTagLngth            COBOL Name: IP66601-USER-TAG-LNGTH
      * - ip66601UserTagStatus           COBOL Name: IP66601-USER-TAG-STATUS
      *
      * Output :  

      * - ip66601UserMedian              COBOL Name: IP66601-USER-MEDIAN
      * - lastDeTag800                   COBOL Name: 800-LAST-DE-TAG
      * - ip66601UserTcnt                COBOL Name: IP66601-USER-TCNT
      * - finNfCurrCdIdx500              COBOL Name: 500-FIN-NF-CURR-CD-IDX
      * - accFinNfInd500                 COBOL Name: 500-ACC-FIN-NF-IND
      * - accFinNonFinInd400             COBOL Name: 400-ACC-FIN-NON-FIN-IND
      * - accFinNfAmt500                 COBOL Name: 500-ACC-FIN-NF-AMT
      * - accFinNonFinAmt400             COBOL Name: 400-ACC-FIN-NON-FIN-AMT
      * - accAmount801                   COBOL Name: 801-ACC-AMOUNT
      * - valueCr300                     COBOL Name: 300-VALUE-CR
      * - ip66601UserTagOccurrence       COBOL Name: IP66601-USER-TAG-OCCURRENCE
      *
      * @throws CFException
      */
      private void search0400() throws Exception {
			// Declare local variables used in the method
			short accAmount801 = 0;
			short accFinNonFinAmt400 = 0;
			short ip66601UserTcnt = 0;
			char[] accFinNonFinInd400 = null;
			char[] valueCr300 = null;
			Ip66601UserTagTable ip66601UserTagTable = ip66601UserTagInformation.getIp66601UserTagTable();
			boolean keepSearching = true;
			// End of variable declaration

      
// *

// *

// *
//  SET IP66601-USER-MEDIAN TO 1
          ip66601UserMedian = 1; 
          
          ip66601UserTcnt = ip66601UserTagInformation.getIp66601UserTcnt();
//  SEARCH IP66601-USER-TAG VARYING IP66601-USER-MEDIAN
          keepSearching = true;
          while(keepSearching) {
          	if  (	( ip66601UserTagTable.getIp66601UserTag(ip66601UserMedian - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagType() == work.getSrchval() ) ) { 
//  DISPLAY 'SEARCHING FOR TAG TYPE = ' WS-SRCHVAL
              logger.info("SEARCHING FOR TAG TYPE = {}", String.valueOf(work.getSrchval())); 
//  DISPLAY '100-THERE-ARE-PDSES'
              logger.info("100-THERE-ARE-PDSES"); 
//  SET 800-LAST-DE-TAG TO IP66601-USER-MEDIAN
              work.setLastDeTag800(ip66601UserMedian); 
              
//  SUBTRACT 1 FROM 800-LAST-DE-TAG
              work.setLastDeTag800(work.getLastDeTag800()-1);

// *
// * The following logic extracted from ip460010 from search/when
// *
//  SET 500-FIN-NF-CURR-CD-IDX TO 5
              finNfCurrCdIdx500 = 5; 
              
//  MOVE 'DR' TO 500-ACC-FIN-NF-IND ( 500-FIN-NF-CURR-CD-IDX )
//  LITERAL_DR = 'DR'
              accGrp500.getAccFinTbl500(finNfCurrCdIdx500 - 1).setAccFinNfInd500(CONSTANTS.LITERAL_DR);
              // MOVE 'CR' TO 400-ACC-FIN-NON-FIN-IND
              //  LITERAL_CR = 'CR'
              work.setAccFinNonFinInd400(CONSTANTS.LITERAL_CR);
//  MOVE 123 TO 500-ACC-FIN-NF-AMT ( 500-FIN-NF-CURR-CD-IDX )
              accGrp500.getAccFinTbl500(finNfCurrCdIdx500 - 1).setAccFinNfAmt500(123);
              // MOVE 345 TO 400-ACC-FIN-NON-FIN-AMT
              work.setAccFinNonFinAmt400((short)345);
              // MOVE 567 TO 801-ACC-AMOUNT
              work.setAccAmount801((short)567);
              accFinNonFinInd400 = work.getAccFinNonFinInd400();
              valueCr300 = work.getValueCr300();
//  EVALUATE 500-ACC-FIN-NF-IND ( 500-FIN-NF-CURR-CD-IDX ) ALSO 400-ACC-FIN-NON-FIN-IND
              if  (((		compareChars(accGrp500.getAccFinTbl500(finNfCurrCdIdx500 - 1).getAccFinNfInd500(),valueCr300) == 0 )     && (		compareChars(accFinNonFinInd400,work.getValueDr300()) == 0 )) || ((		compareChars(accGrp500.getAccFinTbl500(finNfCurrCdIdx500 - 1).getAccFinNfInd500(),work.getValueDr300()) == 0 )     && (		compareChars(accFinNonFinInd400,valueCr300) == 0 ))) { 
//  DISPLAY '*1* REACHED WHEN'
                  logger.info("*1* REACHED WHEN"); 
                  accAmount801 = work.getAccAmount801();
                  accFinNonFinAmt400 = work.getAccFinNonFinAmt400();
//  IF 801-ACC-AMOUNT GREATER 400-ACC-FIN-NON-FIN-AMT
                  if (	( accAmount801 > accFinNonFinAmt400 )) { 
//  DISPLAY '*2* REACHED IF'
                      logger.info("*2* REACHED IF"); 
                      accGrp500.getAccFinTbl500(finNfCurrCdIdx500 - 1).setAccFinNfAmt500(work.getAccAmount801() - work.getAccFinNonFinAmt400());
//  DISPLAY '500-ACC-FIN-NF-AMT = ' 500-ACC-FIN-NF-AMT ( 500-FIN-NF-CURR-CD-IDX ) ' ** ' 500-ACC-FIN-NF-IND ( 500-FIN-NF-CURR-CD-IDX )
                      logger.info("500-ACC-FIN-NF-AMT = {} ** {}", String.valueOf(accGrp500.getAccFinTbl500(finNfCurrCdIdx500 - 1).getAccFinNfAmt500()), new String(accGrp500.getAccFinTbl500(finNfCurrCdIdx500 - 1).getAccFinNfInd500())); 
                  }
  
//  ELSE
                  else { 
//  DISPLAY '*3* REACHED ELSE'
                      logger.info("*3* REACHED ELSE"); 
                      accGrp500.getAccFinTbl500(finNfCurrCdIdx500 - 1).setAccFinNfAmt500(work.getAccFinNonFinAmt400() - work.getAccAmount801());
//  MOVE 400-ACC-FIN-NON-FIN-IND TO 500-ACC-FIN-NF-IND ( 500-FIN-NF-CURR-CD-IDX )
                      accGrp500.getAccFinTbl500(finNfCurrCdIdx500 - 1).setAccFinNfInd500(work.getAccFinNonFinInd400());
//  DISPLAY '500-ACC-FIN-NF-AMT = ' 500-ACC-FIN-NF-AMT ( 500-FIN-NF-CURR-CD-IDX ) ' ** ' 500-ACC-FIN-NF-IND ( 500-FIN-NF-CURR-CD-IDX )
                      logger.info("500-ACC-FIN-NF-AMT = {} ** {}", String.valueOf(accGrp500.getAccFinTbl500(finNfCurrCdIdx500 - 1).getAccFinNfAmt500()), new String(accGrp500.getAccFinTbl500(finNfCurrCdIdx500 - 1).getAccFinNfInd500())); 
                  }
              }
              else   { 
//  ADD 400-ACC-FIN-NON-FIN-AMT TO 500-ACC-FIN-NF-AMT ( 500-FIN-NF-CURR-CD-IDX )
                  accGrp500.getAccFinTbl500(finNfCurrCdIdx500 - 1).setAccFinNfAmt500(accGrp500.getAccFinTbl500(finNfCurrCdIdx500 - 1).getAccFinNfAmt500()+work.getAccFinNonFinAmt400());
              }
  
//  IF 500-ACC-FIN-NF-AMT ( 500-FIN-NF-CURR-CD-IDX ) EQUAL ZEROES
              if (	( accGrp500.getAccFinTbl500(finNfCurrCdIdx500 - 1).getAccFinNfAmt500() == 0 )) { 
//  DISPLAY '500-ACC-FIN-NF-AMT ZERO'
                  logger.info("500-ACC-FIN-NF-AMT ZERO"); 
//  MOVE 300-VALUE-CR TO 500-ACC-FIN-NF-IND ( 500-FIN-NF-CURR-CD-IDX )
                  accGrp500.getAccFinTbl500(finNfCurrCdIdx500 - 1).setAccFinNfInd500(work.getValueCr300());
              }

// *
//  SET 500-FIN-NF-CURR-CD-IDX TO 9
              finNfCurrCdIdx500 = 9; 
              
//  MOVE 'CR' TO 500-ACC-FIN-NF-IND ( 500-FIN-NF-CURR-CD-IDX )
//  LITERAL_CR = 'CR'
              accGrp500.getAccFinTbl500(finNfCurrCdIdx500 - 1).setAccFinNfInd500(CONSTANTS.LITERAL_CR);
              // MOVE 'DR' TO 400-ACC-FIN-NON-FIN-IND
              //  LITERAL_DR = 'DR'
              work.setAccFinNonFinInd400(CONSTANTS.LITERAL_DR);
//  MOVE 123 TO 500-ACC-FIN-NF-AMT ( 500-FIN-NF-CURR-CD-IDX )
              accGrp500.getAccFinTbl500(finNfCurrCdIdx500 - 1).setAccFinNfAmt500(123);
              // MOVE 567 TO 400-ACC-FIN-NON-FIN-AMT
              work.setAccFinNonFinAmt400((short)567);
              // MOVE 341 TO 801-ACC-AMOUNT
              work.setAccAmount801((short)341);
              accFinNonFinInd400 = work.getAccFinNonFinInd400();
              valueCr300 = work.getValueCr300();
//  EVALUATE 500-ACC-FIN-NF-IND ( 500-FIN-NF-CURR-CD-IDX ) ALSO 400-ACC-FIN-NON-FIN-IND
              if  (((		compareChars(accGrp500.getAccFinTbl500(finNfCurrCdIdx500 - 1).getAccFinNfInd500(),valueCr300) == 0 )     && (		compareChars(accFinNonFinInd400,work.getValueDr300()) == 0 )) || ((		compareChars(accGrp500.getAccFinTbl500(finNfCurrCdIdx500 - 1).getAccFinNfInd500(),work.getValueDr300()) == 0 )     && (		compareChars(accFinNonFinInd400,valueCr300) == 0 ))) { 
//  DISPLAY '*1* REACHED WHEN'
                  logger.info("*1* REACHED WHEN"); 
                  accAmount801 = work.getAccAmount801();
                  accFinNonFinAmt400 = work.getAccFinNonFinAmt400();
//  IF 801-ACC-AMOUNT GREATER 400-ACC-FIN-NON-FIN-AMT
                  if (	( accAmount801 > accFinNonFinAmt400 )) { 
//  DISPLAY '*2* REACHED IF'
                      logger.info("*2* REACHED IF"); 
                      accGrp500.getAccFinTbl500(finNfCurrCdIdx500 - 1).setAccFinNfAmt500(work.getAccAmount801() - work.getAccFinNonFinAmt400());
//  DISPLAY '500-ACC-FIN-NF-AMT = ' 500-ACC-FIN-NF-AMT ( 500-FIN-NF-CURR-CD-IDX ) ' ** ' 500-ACC-FIN-NF-IND ( 500-FIN-NF-CURR-CD-IDX )
                      logger.info("500-ACC-FIN-NF-AMT = {} ** {}", String.valueOf(accGrp500.getAccFinTbl500(finNfCurrCdIdx500 - 1).getAccFinNfAmt500()), new String(accGrp500.getAccFinTbl500(finNfCurrCdIdx500 - 1).getAccFinNfInd500())); 
                  }
  
//  ELSE
                  else { 
//  DISPLAY '*3* REACHED ELSE'
                      logger.info("*3* REACHED ELSE"); 
                      accGrp500.getAccFinTbl500(finNfCurrCdIdx500 - 1).setAccFinNfAmt500(work.getAccFinNonFinAmt400() - work.getAccAmount801());
//  MOVE 400-ACC-FIN-NON-FIN-IND TO 500-ACC-FIN-NF-IND ( 500-FIN-NF-CURR-CD-IDX )
                      accGrp500.getAccFinTbl500(finNfCurrCdIdx500 - 1).setAccFinNfInd500(work.getAccFinNonFinInd400());
//  DISPLAY '500-ACC-FIN-NF-AMT = ' 500-ACC-FIN-NF-AMT ( 500-FIN-NF-CURR-CD-IDX ) ' ** ' 500-ACC-FIN-NF-IND ( 500-FIN-NF-CURR-CD-IDX )
                      logger.info("500-ACC-FIN-NF-AMT = {} ** {}", String.valueOf(accGrp500.getAccFinTbl500(finNfCurrCdIdx500 - 1).getAccFinNfAmt500()), new String(accGrp500.getAccFinTbl500(finNfCurrCdIdx500 - 1).getAccFinNfInd500())); 
                  }
              }
              else   { 
//  ADD 400-ACC-FIN-NON-FIN-AMT TO 500-ACC-FIN-NF-AMT ( 500-FIN-NF-CURR-CD-IDX )
                  accGrp500.getAccFinTbl500(finNfCurrCdIdx500 - 1).setAccFinNfAmt500(accGrp500.getAccFinTbl500(finNfCurrCdIdx500 - 1).getAccFinNfAmt500()+work.getAccFinNonFinAmt400());
              }
  
//  MOVE ZERO TO 500-ACC-FIN-NF-AMT ( 500-FIN-NF-CURR-CD-IDX )
              accGrp500.getAccFinTbl500(finNfCurrCdIdx500 - 1).setAccFinNfAmt500(0);
//  DISPLAY 'MOVING ZERO TO 500-ACC-FIN-NF-AMT'
              logger.info("MOVING ZERO TO 500-ACC-FIN-NF-AMT"); 
//  IF 500-ACC-FIN-NF-AMT ( 500-FIN-NF-CURR-CD-IDX ) EQUAL ZEROES
              if (	( accGrp500.getAccFinTbl500(finNfCurrCdIdx500 - 1).getAccFinNfAmt500() == 0 )) { 
//  MOVE 300-VALUE-CR TO 500-ACC-FIN-NF-IND ( 500-FIN-NF-CURR-CD-IDX )
                  accGrp500.getAccFinTbl500(finNfCurrCdIdx500 - 1).setAccFinNfInd500(work.getValueCr300());
//  DISPLAY '500-ACC-FIN-NF-AMT = 00000000' ' ** ' 500-ACC-FIN-NF-IND ( 500-FIN-NF-CURR-CD-IDX )
                  logger.info("500-ACC-FIN-NF-AMT = 00000000 ** {}", new String(accGrp500.getAccFinTbl500(finNfCurrCdIdx500 - 1).getAccFinNfInd500())); 
              }

// *
//  IF IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-MEDIAN ) > IP66601-USER-TAG-OCCURRENCE (3) THEN
              if (	( ip66601UserTagTable.getIp66601UserTag(ip66601UserMedian - 1).getIp66601UserTagId().getIp66601UserTagOccurrence() > ip66601UserTagTable.getIp66601UserTag(2).getIp66601UserTagId().getIp66601UserTagOccurrence() )) { 
//  DISPLAY 'TAG OCCURENCE IS > 33'
                  logger.info("TAG OCCURENCE IS > 33"); 
//  MOVE IP66601-USER-TAG-OCCURRENCE (3) TO IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-MEDIAN )
                  ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserMedian - 1).getIp66601UserTagId().setIp66601UserTagOccurrence(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(2).getIp66601UserTagId().getIp66601UserTagOccurrence());
              }
  
//  ELSE
              else { 
//  DISPLAY 'TAG OCCURENCE IS <= 33'
                  logger.info("TAG OCCURENCE IS <= 33"); 
//  MOVE IP66601-USER-TAG-OCCURRENCE (3) TO IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-MEDIAN )
                  ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserMedian - 1).getIp66601UserTagId().setIp66601UserTagOccurrence(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(2).getIp66601UserTagId().getIp66601UserTagOccurrence());
              }
          	break;
          	}
          	else if  (	( ip66601UserMedian >= ip66601UserTcnt ) ) { 
//  DISPLAY 'SEARCHING FOR TAG TYPE = ' WS-SRCHVAL
              logger.info("SEARCHING FOR TAG TYPE = {}", String.valueOf(work.getSrchval())); 
//  DISPLAY '100-WE-ARE-DONE-WITH-PDSES'
              logger.info("100-WE-ARE-DONE-WITH-PDSES"); 
//  MOVE IP66601-USER-TCNT TO 800-LAST-DE-TAG
              work.setLastDeTag800(ip66601UserTagInformation.getIp66601UserTcnt());
          	break;
          	}
          	ip66601UserMedian++;
          	if (ip66601UserMedian > 700) { 
          	 keepSearching = false;
          	}
          }
          	if(!keepSearching) { 
//  DISPLAY 'SEARCHING FOR TAG TYPE = ' WS-SRCHVAL
              logger.info("SEARCHING FOR TAG TYPE = {}", String.valueOf(work.getSrchval())); 
//  DISPLAY '100-WE-ARE-DONE-WITH-PDSES'
              logger.info("100-WE-ARE-DONE-WITH-PDSES"); 
//  MOVE IP66601-USER-TCNT TO 800-LAST-DE-TAG
              work.setLastDeTag800(ip66601UserTagInformation.getIp66601UserTcnt());
          	}
  
//  DISPLAY ' '
          logger.info(" "); 
//  DISPLAY '800-LAST-DE-TAG = ' 800-LAST-DE-TAG
          logger.info("800-LAST-DE-TAG = {}", String.valueOf(work.getLastDeTag800())); 
//  DISPLAY 'MATCHED VALUES WITH IP66601-USER-MEDIAN INDEX ' IP66601-USER-TAG-TYPE ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-MEDIAN )
          logger.info("MATCHED VALUES WITH IP66601-USER-MEDIAN INDEX {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserMedian - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagType()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserMedian - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserMedian - 1).getIp66601UserTagId().getIp66601UserTagOccurrence()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserMedian - 1).getIp66601UserTagId().getIp66601UserTagSubfldNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserMedian - 1).getIp66601UserTagStart()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserMedian - 1).getIp66601UserTagLngth()), new String(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserMedian - 1).getIp66601UserTagStatus())); 
//  DISPLAY '....... VALUES WITH IP66601-USER-T INDEX      ' IP66601-USER-TAG-TYPE ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-T )
          logger.info("....... VALUES WITH IP66601-USER-T INDEX      {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagType()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserTagOccurrence()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserTagSubfldNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagStart()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagLngth()), new String(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagStatus())); 
//  DISPLAY '....... VALUES WITH IP66601-USER-LEFT INDEX   ' IP66601-USER-TAG-TYPE ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-LEFT )
          logger.info("....... VALUES WITH IP66601-USER-LEFT INDEX   {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserLeft - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagType()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserLeft - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserLeft - 1).getIp66601UserTagId().getIp66601UserTagOccurrence()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserLeft - 1).getIp66601UserTagId().getIp66601UserTagSubfldNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserLeft - 1).getIp66601UserTagStart()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserLeft - 1).getIp66601UserTagLngth()), new String(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserLeft - 1).getIp66601UserTagStatus())); 
//  DISPLAY '....... VALUES WITH IP66601-USER-RIGHT INDEX  ' IP66601-USER-TAG-TYPE ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-RIGHT )
          logger.info("....... VALUES WITH IP66601-USER-RIGHT INDEX  {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserRight - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagType()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserRight - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserRight - 1).getIp66601UserTagId().getIp66601UserTagOccurrence()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserRight - 1).getIp66601UserTagId().getIp66601UserTagSubfldNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserRight - 1).getIp66601UserTagStart()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserRight - 1).getIp66601UserTagLngth()), new String(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserRight - 1).getIp66601UserTagStatus())); 
//  DISPLAY '....... VALUES WITH IP66601-USER-MEDIAN INDEX ' IP66601-USER-TAG-TYPE ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-MEDIAN )
          logger.info("....... VALUES WITH IP66601-USER-MEDIAN INDEX {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserMedian - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagType()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserMedian - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserMedian - 1).getIp66601UserTagId().getIp66601UserTagOccurrence()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserMedian - 1).getIp66601UserTagId().getIp66601UserTagSubfldNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserMedian - 1).getIp66601UserTagStart()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserMedian - 1).getIp66601UserTagLngth()), new String(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserMedian - 1).getIp66601UserTagStatus())); 
//  DISPLAY '....... VALUES WITH IP66601-USER-START INDEX  ' IP66601-USER-TAG-TYPE ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-START )
          logger.info("....... VALUES WITH IP66601-USER-START INDEX  {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserStart - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagType()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserStart - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserStart - 1).getIp66601UserTagId().getIp66601UserTagOccurrence()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserStart - 1).getIp66601UserTagId().getIp66601UserTagSubfldNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserStart - 1).getIp66601UserTagStart()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserStart - 1).getIp66601UserTagLngth()), new String(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserStart - 1).getIp66601UserTagStatus())); 
//  DISPLAY '....... VALUES WITH IP66601-USER-END INDEX    ' IP66601-USER-TAG-TYPE ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-END )
          logger.info("....... VALUES WITH IP66601-USER-END INDEX    {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserEnd - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagType()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserEnd - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserEnd - 1).getIp66601UserTagId().getIp66601UserTagOccurrence()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserEnd - 1).getIp66601UserTagId().getIp66601UserTagSubfldNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserEnd - 1).getIp66601UserTagStart()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserEnd - 1).getIp66601UserTagLngth()), new String(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserEnd - 1).getIp66601UserTagStatus())); 
          ;
      
      }
      /**
      * search0500 
      *   This method is derived from 
  *   COBOL Paragraph - 0500-SEARCH COBOL Cyclomatic complexity - 34
      * Input  :  

      * - ip66601UserTag                 COBOL Name: IP66601-USER-TAG
      * - ip66601UserTagType             COBOL Name: IP66601-USER-TAG-TYPE
      * - ip66601UserTagNo               COBOL Name: IP66601-USER-TAG-NO
      * - ip66601UserTagOccurrence       COBOL Name: IP66601-USER-TAG-OCCURRENCE
      * - ip66601UserTagSubfldNo         COBOL Name: IP66601-USER-TAG-SUBFLD-NO
      * - ip66601UserTagStart            COBOL Name: IP66601-USER-TAG-START
      * - ip66601UserTagLngth            COBOL Name: IP66601-USER-TAG-LNGTH
      * - ip66601UserTagStatus           COBOL Name: IP66601-USER-TAG-STATUS
      * - i                              COBOL Name: WS-I
      * - srchVar                        COBOL Name: WS-SRCH-VAR
      *
      * Output :  

      * - ip66601UserT                   COBOL Name: IP66601-USER-T
      * - ip66601UserTagType01           COBOL Name: WS-IP66601-USER-TAG-TYPE
      * - ip66601UserTagNo01             COBOL Name: WS-IP66601-USER-TAG-NO
      * - ip66601UserTagOccurrence01     COBOL Name: WS-IP66601-USER-TAG-OCCURRENCE
      * - ip66601UserTagSubfldNo01       COBOL Name: WS-IP66601-USER-TAG-SUBFLD-NO
      * - ip66601UserTagStart01          COBOL Name: WS-IP66601-USER-TAG-START
      * - ip66601UserTagLngth01          COBOL Name: WS-IP66601-USER-TAG-LNGTH
      * - ip66601UserTagStatus01         COBOL Name: WS-IP66601-USER-TAG-STATUS
      * - entryFoundFlg                  COBOL Name: ENTRY-FOUND-FLG
      * - table                          COBOL Name: WS-TABLE
      * - start                          COBOL Name: WS-START
      * - len                            COBOL Name: WS-LEN
      * - i                              COBOL Name: WS-I
      * - srchVar1                       COBOL Name: WS-SRCH-VAR-1
      * - srchVar2                       COBOL Name: WS-SRCH-VAR-2
      * - tableGroup                     COBOL Name: WS-TABLE-GROUP
      * - srchVar                        COBOL Name: WS-SRCH-VAR
      * - tableEntry                     COBOL Name: WS-TABLE-ENTRY
      * - var1                           COBOL Name: WS-VAR-1
      * - tableIndex                     COBOL Name: WS-TABLE-INDEX
      * - var2                           COBOL Name: WS-VAR-2
      *
      * @throws CFException
      */
      private void search0500() throws Exception {
			// Declare local variables used in the method
			Ip66601UserTagTable ip66601UserTagTable = ip66601UserTagInformation.getIp66601UserTagTable();
			boolean keepSearching = true;
			short ip66601UserTagType01 = 0;
			short ip66601UserTagNo01 = 0;
			short ip66601UserTagOccurrence01 = 0;
			short ip66601UserTagSubfldNo01 = 0;
			short ip66601UserTagStart01 = 0;
			short ip66601UserTagLngth01 = 0;
			char[] ip66601UserTagStatus01 = null;
			char[] srchVar1 = null;
			Table table = tableGroup.getTable();
			int[] searchIndexes = null;
			int searchLowPoint = 0;
			int searchMidPoint = 0;
			int searchHighPoint = 0;
			int searchCompare = 0;
			int srchVar2 = 0;
			// End of variable declaration

      
// *

// *
//  SET IP66601-USER-T TO 1
          ip66601UserT = 1; 
          
//  MOVE 1 TO WS-IP66601-USER-TAG-TYPE
          work.setIp66601UserTagType01(1);
//  MOVE 10 TO WS-IP66601-USER-TAG-NO
          work.setIp66601UserTagNo01(10);
//  MOVE 11 TO WS-IP66601-USER-TAG-OCCURRENCE
          work.setIp66601UserTagOccurrence01(11);
//  MOVE 12 TO WS-IP66601-USER-TAG-SUBFLD-NO
          work.setIp66601UserTagSubfldNo01(12);
          // MOVE 13 TO WS-IP66601-USER-TAG-START
          work.setIp66601UserTagStart01((short)13);
          // MOVE 14 TO WS-IP66601-USER-TAG-LNGTH
          work.setIp66601UserTagLngth01((short)14);
          // MOVE 'A' TO WS-IP66601-USER-TAG-STATUS
          //  LITERAL_A = 'A'
          work.setIp66601UserTagStatus01(CONSTANTS.LITERAL_A);
//  SET ENTRY-NOT-FOUND-N TO TRUE
          work.setEntryNotFoundNTrue(); 
          

// *
          ip66601UserTagStart01 = work.getIp66601UserTagStart01();
          ip66601UserTagSubfldNo01 = work.getIp66601UserTagSubfldNo01();
          ip66601UserTagNo01 = work.getIp66601UserTagNo01();
          ip66601UserTagOccurrence01 = work.getIp66601UserTagOccurrence01();
          ip66601UserTagStatus01 = work.getIp66601UserTagStatus01();
          ip66601UserTagType01 = work.getIp66601UserTagType01();
          ip66601UserTagLngth01 = work.getIp66601UserTagLngth01();
//  SEARCH IP66601-USER-TAG
          keepSearching = true;
          while(keepSearching) {
          	if  (	( ip66601UserTagTable.getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagType() == ip66601UserTagType01 ) && 	( ip66601UserTagTable.getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagNo() == ip66601UserTagNo01 ) && 	( ip66601UserTagTable.getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserTagOccurrence() == ip66601UserTagOccurrence01 ) && 	( ip66601UserTagTable.getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserTagSubfldNo() == ip66601UserTagSubfldNo01 ) && 	( ip66601UserTagTable.getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagStart() == ip66601UserTagStart01 ) && 	( ip66601UserTagTable.getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagLngth() == ip66601UserTagLngth01 ) && 		compareChars(ip66601UserTagTable.getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagStatus(),ip66601UserTagStatus01) == 0 ) { 
//  SET ENTRY-FOUND-Y TO TRUE
              work.setEntryFoundYTrue(); 
              
//  DISPLAY 'MATCHING ENTRY FOUND!!'
              logger.info("MATCHING ENTRY FOUND!!"); 
          	break;
          	}
          	ip66601UserT++;
          	if (ip66601UserT > 700) { 
          	 keepSearching = false;
          	}
          }
  
//  IF ENTRY-FOUND-Y
          if ( work.isEntryFoundY()  ) { 
//  DISPLAY ' '
              logger.info(" "); 
//  DISPLAY '*SUCCESS* ENTRY-FOUND-Y HAS BEEN FLAGGED'
              logger.info("*SUCCESS* ENTRY-FOUND-Y HAS BEEN FLAGGED"); 
//  DISPLAY ' '
              logger.info(" "); 
          }
//  ELSE
          else { 
//  DISPLAY ' '
              logger.info(" "); 
//  DISPLAY '*ERROR  * ENTRY-NOT-FOUND-N HAS BEEN FLAGGED'
              logger.info("*ERROR  * ENTRY-NOT-FOUND-N HAS BEEN FLAGGED"); 
//  DISPLAY ' '
              logger.info(" "); 
          }
//  DISPLAY '....... VALUES WITH IP66601-USER-P INDEX      ' IP66601-USER-TAG-TYPE ( IP66601-USER-P ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-P ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-P ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-P ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-P ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-P ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-P )
          logger.info("....... VALUES WITH IP66601-USER-P INDEX      {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserP - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagType()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserP - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserP - 1).getIp66601UserTagId().getIp66601UserTagOccurrence()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserP - 1).getIp66601UserTagId().getIp66601UserTagSubfldNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserP - 1).getIp66601UserTagStart()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserP - 1).getIp66601UserTagLngth()), new String(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserP - 1).getIp66601UserTagStatus())); 
//  DISPLAY '....... VALUES WITH IP66601-USER-T INDEX      ' IP66601-USER-TAG-TYPE ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-T )
          logger.info("....... VALUES WITH IP66601-USER-T INDEX      {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagType()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserTagOccurrence()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserTagSubfldNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagStart()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagLngth()), new String(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagStatus())); 
//  DISPLAY '....... VALUES WITH IP66601-USER-LEFT INDEX   ' IP66601-USER-TAG-TYPE ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-LEFT )
          logger.info("....... VALUES WITH IP66601-USER-LEFT INDEX   {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserLeft - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagType()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserLeft - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserLeft - 1).getIp66601UserTagId().getIp66601UserTagOccurrence()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserLeft - 1).getIp66601UserTagId().getIp66601UserTagSubfldNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserLeft - 1).getIp66601UserTagStart()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserLeft - 1).getIp66601UserTagLngth()), new String(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserLeft - 1).getIp66601UserTagStatus())); 
//  DISPLAY '....... VALUES WITH IP66601-USER-RIGHT INDEX  ' IP66601-USER-TAG-TYPE ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-RIGHT )
          logger.info("....... VALUES WITH IP66601-USER-RIGHT INDEX  {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserRight - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagType()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserRight - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserRight - 1).getIp66601UserTagId().getIp66601UserTagOccurrence()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserRight - 1).getIp66601UserTagId().getIp66601UserTagSubfldNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserRight - 1).getIp66601UserTagStart()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserRight - 1).getIp66601UserTagLngth()), new String(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserRight - 1).getIp66601UserTagStatus())); 
//  DISPLAY '....... VALUES WITH IP66601-USER-MEDIAN INDEX ' IP66601-USER-TAG-TYPE ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-MEDIAN )
          logger.info("....... VALUES WITH IP66601-USER-MEDIAN INDEX {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserMedian - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagType()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserMedian - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserMedian - 1).getIp66601UserTagId().getIp66601UserTagOccurrence()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserMedian - 1).getIp66601UserTagId().getIp66601UserTagSubfldNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserMedian - 1).getIp66601UserTagStart()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserMedian - 1).getIp66601UserTagLngth()), new String(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserMedian - 1).getIp66601UserTagStatus())); 
//  DISPLAY '....... VALUES WITH IP66601-USER-START INDEX  ' IP66601-USER-TAG-TYPE ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-START )
          logger.info("....... VALUES WITH IP66601-USER-START INDEX  {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserStart - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagType()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserStart - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserStart - 1).getIp66601UserTagId().getIp66601UserTagOccurrence()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserStart - 1).getIp66601UserTagId().getIp66601UserTagSubfldNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserStart - 1).getIp66601UserTagStart()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserStart - 1).getIp66601UserTagLngth()), new String(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserStart - 1).getIp66601UserTagStatus())); 
//  DISPLAY '....... VALUES WITH IP66601-USER-END INDEX    ' IP66601-USER-TAG-TYPE ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-END )
          logger.info("....... VALUES WITH IP66601-USER-END INDEX    {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserEnd - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagType()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserEnd - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserEnd - 1).getIp66601UserTagId().getIp66601UserTagOccurrence()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserEnd - 1).getIp66601UserTagId().getIp66601UserTagSubfldNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserEnd - 1).getIp66601UserTagStart()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserEnd - 1).getIp66601UserTagLngth()), new String(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserEnd - 1).getIp66601UserTagStatus())); 

// *
          // MOVE 'I' TO WS-IP66601-USER-TAG-STATUS
          //  LITERAL_I = 'I'
          work.setIp66601UserTagStatus01(CONSTANTS.LITERAL_I);
//  SET ENTRY-NOT-FOUND-N TO TRUE
          work.setEntryNotFoundNTrue(); 
          

// *
          ip66601UserTagStart01 = work.getIp66601UserTagStart01();
          ip66601UserTagSubfldNo01 = work.getIp66601UserTagSubfldNo01();
          ip66601UserTagNo01 = work.getIp66601UserTagNo01();
          ip66601UserTagOccurrence01 = work.getIp66601UserTagOccurrence01();
          ip66601UserTagStatus01 = work.getIp66601UserTagStatus01();
          ip66601UserTagType01 = work.getIp66601UserTagType01();
          ip66601UserTagLngth01 = work.getIp66601UserTagLngth01();
//  SEARCH IP66601-USER-TAG
          keepSearching = true;
          while(keepSearching) {
          	if  (	( ip66601UserTagTable.getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagType() == ip66601UserTagType01 ) && 	( ip66601UserTagTable.getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagNo() == ip66601UserTagNo01 ) && 	( ip66601UserTagTable.getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserTagOccurrence() == ip66601UserTagOccurrence01 ) && 	( ip66601UserTagTable.getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserTagSubfldNo() == ip66601UserTagSubfldNo01 ) && 	( ip66601UserTagTable.getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagStart() == ip66601UserTagStart01 ) && 	( ip66601UserTagTable.getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagLngth() == ip66601UserTagLngth01 ) && 		compareChars(ip66601UserTagTable.getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagStatus(),ip66601UserTagStatus01) == 0 ) { 
//  SET ENTRY-FOUND-Y TO TRUE
              work.setEntryFoundYTrue(); 
              
//  DISPLAY 'MATCHING ENTRY FOUND!!'
              logger.info("MATCHING ENTRY FOUND!!"); 
          	break;
          	}
          	ip66601UserT++;
          	if (ip66601UserT > 700) { 
          	 keepSearching = false;
          	}
          }
  
//  IF ENTRY-NOT-FOUND-N
          if ( work.isEntryNotFoundN()  ) { 
//  DISPLAY ' '
              logger.info(" "); 
//  DISPLAY '*SUCCESS* ENTRY-NOT-FOUND-N HAS BEEN FLAGGED'
              logger.info("*SUCCESS* ENTRY-NOT-FOUND-N HAS BEEN FLAGGED"); 
//  DISPLAY ' '
              logger.info(" "); 
          }
//  ELSE
          else { 
//  DISPLAY ' '
              logger.info(" "); 
//  DISPLAY '*ERROR  * ENTRY-FOUND-Y HAS BEEN FLAGGED'
              logger.info("*ERROR  * ENTRY-FOUND-Y HAS BEEN FLAGGED"); 
//  DISPLAY ' '
              logger.info(" "); 
          }
//  DISPLAY '....... VALUES WITH IP66601-USER-P INDEX      ' IP66601-USER-TAG-TYPE ( IP66601-USER-P ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-P ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-P ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-P ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-P ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-P ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-P )
          logger.info("....... VALUES WITH IP66601-USER-P INDEX      {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserP - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagType()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserP - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserP - 1).getIp66601UserTagId().getIp66601UserTagOccurrence()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserP - 1).getIp66601UserTagId().getIp66601UserTagSubfldNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserP - 1).getIp66601UserTagStart()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserP - 1).getIp66601UserTagLngth()), new String(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserP - 1).getIp66601UserTagStatus())); 
//  IF IP66601-USER-T <= 700 THEN
          if (	( ip66601UserT <= 700 )) { 
//  DISPLAY '....... VALUES WITH IP66601-USER-T INDEX      ' IP66601-USER-TAG-TYPE ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-T )
              logger.info("....... VALUES WITH IP66601-USER-T INDEX      {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagType()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserTagOccurrence()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagId().getIp66601UserTagSubfldNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagStart()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagLngth()), new String(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserT - 1).getIp66601UserTagStatus())); 
          }
//  DISPLAY '....... VALUES WITH IP66601-USER-LEFT INDEX   ' IP66601-USER-TAG-TYPE ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-LEFT )
          logger.info("....... VALUES WITH IP66601-USER-LEFT INDEX   {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserLeft - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagType()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserLeft - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserLeft - 1).getIp66601UserTagId().getIp66601UserTagOccurrence()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserLeft - 1).getIp66601UserTagId().getIp66601UserTagSubfldNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserLeft - 1).getIp66601UserTagStart()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserLeft - 1).getIp66601UserTagLngth()), new String(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserLeft - 1).getIp66601UserTagStatus())); 
//  DISPLAY '....... VALUES WITH IP66601-USER-RIGHT INDEX  ' IP66601-USER-TAG-TYPE ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-RIGHT )
          logger.info("....... VALUES WITH IP66601-USER-RIGHT INDEX  {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserRight - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagType()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserRight - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserRight - 1).getIp66601UserTagId().getIp66601UserTagOccurrence()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserRight - 1).getIp66601UserTagId().getIp66601UserTagSubfldNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserRight - 1).getIp66601UserTagStart()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserRight - 1).getIp66601UserTagLngth()), new String(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserRight - 1).getIp66601UserTagStatus())); 
//  DISPLAY '....... VALUES WITH IP66601-USER-MEDIAN INDEX ' IP66601-USER-TAG-TYPE ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-MEDIAN )
          logger.info("....... VALUES WITH IP66601-USER-MEDIAN INDEX {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserMedian - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagType()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserMedian - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserMedian - 1).getIp66601UserTagId().getIp66601UserTagOccurrence()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserMedian - 1).getIp66601UserTagId().getIp66601UserTagSubfldNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserMedian - 1).getIp66601UserTagStart()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserMedian - 1).getIp66601UserTagLngth()), new String(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserMedian - 1).getIp66601UserTagStatus())); 
//  DISPLAY '....... VALUES WITH IP66601-USER-START INDEX  ' IP66601-USER-TAG-TYPE ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-START )
          logger.info("....... VALUES WITH IP66601-USER-START INDEX  {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserStart - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagType()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserStart - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserStart - 1).getIp66601UserTagId().getIp66601UserTagOccurrence()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserStart - 1).getIp66601UserTagId().getIp66601UserTagSubfldNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserStart - 1).getIp66601UserTagStart()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserStart - 1).getIp66601UserTagLngth()), new String(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserStart - 1).getIp66601UserTagStatus())); 
//  DISPLAY '....... VALUES WITH IP66601-USER-END INDEX    ' IP66601-USER-TAG-TYPE ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-END )
          logger.info("....... VALUES WITH IP66601-USER-END INDEX    {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserEnd - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagType()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserEnd - 1).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserEnd - 1).getIp66601UserTagId().getIp66601UserTagOccurrence()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserEnd - 1).getIp66601UserTagId().getIp66601UserTagSubfldNo()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserEnd - 1).getIp66601UserTagStart()), String.valueOf(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserEnd - 1).getIp66601UserTagLngth()), new String(ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(ip66601UserEnd - 1).getIp66601UserTagStatus())); 

// *
// * Build ws-table-group using ref mod and then do search all
// *
//  MOVE SPACES TO WS-TABLE (1 : 100)
          tableGroup.getTable().replace(CONSTANTS.SPACE_100,0,100/* length */,0,100 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  DISPLAY '  '
          logger.info("  "); 
          // MOVE 1 TO WS-START
          work.setStart((short)1);
          // MOVE 6 TO WS-LEN
          work.setLen((short)6);
//  PERFORM VARYING WS-I FROM 1 BY 1 UNTIL WS-I > 100
          for (work.setI(1); (	( work.getI() <= 100 ) ) ; work.setI(work.getI() + 1) ) {
//  MOVE 'AB' TO WS-SRCH-VAR-1
//  LITERAL_AB = 'AB'
              srchVar.setSrchVar1(CONSTANTS.LITERAL_AB);
//  MOVE WS-I TO WS-SRCH-VAR-2
              srchVar.setSrchVar2(work.getI());
//  MOVE WS-SRCH-VAR TO WS-TABLE-GROUP ( WS-START : WS-LEN )
              tableGroup.replace(srchVar.getCharArray(),0,srchVar.length(),(work.getStart()-1),work.getLen() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  ADD WS-LEN TO WS-START
              work.setStart( (short) (work.getStart()+work.getLen()));
          }
//  MOVE 'AB' TO WS-SRCH-VAR-1
//  LITERAL_AB = 'AB'
          srchVar.setSrchVar1(CONSTANTS.LITERAL_AB);
          // MOVE 59 TO WS-SRCH-VAR-2
          srchVar.setSrchVar2(59);
          srchVar1 = srchVar.getSrchVar1();
          srchVar2 = srchVar.getSrchVar2();
//  SEARCH ALL WS-TABLE-ENTRY
          // Binary Search through table.tableEntry
          searchLowPoint = 0; //prevLowValue
          searchHighPoint = table.tableEntrySize(); //prevHighValue
          searchMidPoint = searchHighPoint / 2; //starting at mid point
          searchIndexes = new int[]{searchLowPoint,searchMidPoint,searchHighPoint};
          keepSearching = true;
          while (keepSearching) {
          // compare logic below
             searchCompare = compareAscending(table.getTableEntry(searchMidPoint).getVar1(),srchVar1);
             if (searchCompare == 0) 
             searchCompare = compareAscending(table.getTableEntry(searchMidPoint).getVar2() , srchVar2);
          // end of compare logic
          	if (searchCompare == 0 ) { // if search found
          	      keepSearching = false;
          	     tableIndex = searchMidPoint	 + 1;
//  DISPLAY 'SEARCH VALUE ' WS-SRCH-VAR-1 WS-SRCH-VAR-2 ' FOUND'
              logger.info("SEARCH VALUE {}{} FOUND", new String(srchVar.getSrchVar1()), String.valueOf(srchVar.getSrchVar2())); 
          	} else  {
          		adjustSearchIndex(searchCompare,searchIndexes);
          		searchLowPoint  = searchIndexes[0];
           		searchMidPoint  = searchIndexes[1];
           		searchHighPoint = searchIndexes[2];
           		if (searchMidPoint == -1) { // search exhausted
           		    keepSearching = false; 
//  DISPLAY 'SEARCH VALUE ' WS-SRCH-VAR-1 WS-SRCH-VAR-2 ' NOT FOUND'
              logger.info("SEARCH VALUE {}{} NOT FOUND", new String(srchVar.getSrchVar1()), String.valueOf(srchVar.getSrchVar2())); 
           		}
          	}
          }
  
//  MOVE 'AB' TO WS-SRCH-VAR-1
//  LITERAL_AB = 'AB'
          srchVar.setSrchVar1(CONSTANTS.LITERAL_AB);
          // MOVE 01 TO WS-SRCH-VAR-2
          srchVar.setSrchVar2(1);
          srchVar1 = srchVar.getSrchVar1();
          srchVar2 = srchVar.getSrchVar2();
//  SEARCH ALL WS-TABLE-ENTRY
          // Binary Search through table.tableEntry
          searchLowPoint = 0; //prevLowValue
          searchHighPoint = table.tableEntrySize(); //prevHighValue
          searchMidPoint = searchHighPoint / 2; //starting at mid point
          searchIndexes = new int[]{searchLowPoint,searchMidPoint,searchHighPoint};
          keepSearching = true;
          while (keepSearching) {
          // compare logic below
             searchCompare = compareAscending(table.getTableEntry(searchMidPoint).getVar1(),srchVar1);
             if (searchCompare == 0) 
             searchCompare = compareAscending(table.getTableEntry(searchMidPoint).getVar2() , srchVar2);
          // end of compare logic
          	if (searchCompare == 0 ) { // if search found
          	      keepSearching = false;
          	     tableIndex = searchMidPoint	 + 1;
//  DISPLAY 'SEARCH VALUE ' WS-SRCH-VAR-1 WS-SRCH-VAR-2 ' FOUND'
              logger.info("SEARCH VALUE {}{} FOUND", new String(srchVar.getSrchVar1()), String.valueOf(srchVar.getSrchVar2())); 
          	} else  {
          		adjustSearchIndex(searchCompare,searchIndexes);
          		searchLowPoint  = searchIndexes[0];
           		searchMidPoint  = searchIndexes[1];
           		searchHighPoint = searchIndexes[2];
           		if (searchMidPoint == -1) { // search exhausted
           		    keepSearching = false; 
//  DISPLAY 'SEARCH VALUE ' WS-SRCH-VAR-1 WS-SRCH-VAR-2 ' NOT FOUND'
              logger.info("SEARCH VALUE {}{} NOT FOUND", new String(srchVar.getSrchVar1()), String.valueOf(srchVar.getSrchVar2())); 
           		}
          	}
          }
  
//  MOVE 'AB' TO WS-SRCH-VAR-1
//  LITERAL_AB = 'AB'
          srchVar.setSrchVar1(CONSTANTS.LITERAL_AB);
          // MOVE 100 TO WS-SRCH-VAR-2
          srchVar.setSrchVar2(100);
          srchVar1 = srchVar.getSrchVar1();
          srchVar2 = srchVar.getSrchVar2();
//  SEARCH ALL WS-TABLE-ENTRY
          // Binary Search through table.tableEntry
          searchLowPoint = 0; //prevLowValue
          searchHighPoint = table.tableEntrySize(); //prevHighValue
          searchMidPoint = searchHighPoint / 2; //starting at mid point
          searchIndexes = new int[]{searchLowPoint,searchMidPoint,searchHighPoint};
          keepSearching = true;
          while (keepSearching) {
          // compare logic below
             searchCompare = compareAscending(table.getTableEntry(searchMidPoint).getVar1(),srchVar1);
             if (searchCompare == 0) 
             searchCompare = compareAscending(table.getTableEntry(searchMidPoint).getVar2() , srchVar2);
          // end of compare logic
          	if (searchCompare == 0 ) { // if search found
          	      keepSearching = false;
          	     tableIndex = searchMidPoint	 + 1;
//  DISPLAY 'SEARCH VALUE ' WS-SRCH-VAR-1 WS-SRCH-VAR-2 ' FOUND'
              logger.info("SEARCH VALUE {}{} FOUND", new String(srchVar.getSrchVar1()), String.valueOf(srchVar.getSrchVar2())); 
          	} else  {
          		adjustSearchIndex(searchCompare,searchIndexes);
          		searchLowPoint  = searchIndexes[0];
           		searchMidPoint  = searchIndexes[1];
           		searchHighPoint = searchIndexes[2];
           		if (searchMidPoint == -1) { // search exhausted
           		    keepSearching = false; 
//  DISPLAY 'SEARCH VALUE ' WS-SRCH-VAR-1 WS-SRCH-VAR-2 ' NOT FOUND'
              logger.info("SEARCH VALUE {}{} NOT FOUND", new String(srchVar.getSrchVar1()), String.valueOf(srchVar.getSrchVar2())); 
           		}
          	}
          }
  
//  MOVE 'AB' TO WS-SRCH-VAR-1
//  LITERAL_AB = 'AB'
          srchVar.setSrchVar1(CONSTANTS.LITERAL_AB);
          // MOVE 000 TO WS-SRCH-VAR-2
          srchVar.setSrchVar2(0);
          srchVar1 = srchVar.getSrchVar1();
          srchVar2 = srchVar.getSrchVar2();
//  SEARCH ALL WS-TABLE-ENTRY
          // Binary Search through table.tableEntry
          searchLowPoint = 0; //prevLowValue
          searchHighPoint = table.tableEntrySize(); //prevHighValue
          searchMidPoint = searchHighPoint / 2; //starting at mid point
          searchIndexes = new int[]{searchLowPoint,searchMidPoint,searchHighPoint};
          keepSearching = true;
          while (keepSearching) {
          // compare logic below
             searchCompare = compareAscending(table.getTableEntry(searchMidPoint).getVar1(),srchVar1);
             if (searchCompare == 0) 
             searchCompare = compareAscending(table.getTableEntry(searchMidPoint).getVar2() , srchVar2);
          // end of compare logic
          	if (searchCompare == 0 ) { // if search found
          	      keepSearching = false;
          	     tableIndex = searchMidPoint	 + 1;
//  DISPLAY 'SEARCH VALUE ' WS-SRCH-VAR-1 WS-SRCH-VAR-2 ' FOUND'
              logger.info("SEARCH VALUE {}{} FOUND", new String(srchVar.getSrchVar1()), String.valueOf(srchVar.getSrchVar2())); 
          	} else  {
          		adjustSearchIndex(searchCompare,searchIndexes);
          		searchLowPoint  = searchIndexes[0];
           		searchMidPoint  = searchIndexes[1];
           		searchHighPoint = searchIndexes[2];
           		if (searchMidPoint == -1) { // search exhausted
           		    keepSearching = false; 
//  DISPLAY 'SEARCH VALUE ' WS-SRCH-VAR-1 WS-SRCH-VAR-2 ' NOT FOUND'
              logger.info("SEARCH VALUE {}{} NOT FOUND", new String(srchVar.getSrchVar1()), String.valueOf(srchVar.getSrchVar2())); 
           		}
          	}
          }
  
//  MOVE 'AB' TO WS-SRCH-VAR-1
//  LITERAL_AB = 'AB'
          srchVar.setSrchVar1(CONSTANTS.LITERAL_AB);
          // MOVE 101 TO WS-SRCH-VAR-2
          srchVar.setSrchVar2(101);
          srchVar1 = srchVar.getSrchVar1();
          srchVar2 = srchVar.getSrchVar2();
//  SEARCH ALL WS-TABLE-ENTRY
          // Binary Search through table.tableEntry
          searchLowPoint = 0; //prevLowValue
          searchHighPoint = table.tableEntrySize(); //prevHighValue
          searchMidPoint = searchHighPoint / 2; //starting at mid point
          searchIndexes = new int[]{searchLowPoint,searchMidPoint,searchHighPoint};
          keepSearching = true;
          while (keepSearching) {
          // compare logic below
             searchCompare = compareAscending(table.getTableEntry(searchMidPoint).getVar1(),srchVar1);
             if (searchCompare == 0) 
             searchCompare = compareAscending(table.getTableEntry(searchMidPoint).getVar2() , srchVar2);
          // end of compare logic
          	if (searchCompare == 0 ) { // if search found
          	      keepSearching = false;
          	     tableIndex = searchMidPoint	 + 1;
//  DISPLAY 'SEARCH VALUE ' WS-SRCH-VAR-1 WS-SRCH-VAR-2 ' FOUND'
              logger.info("SEARCH VALUE {}{} FOUND", new String(srchVar.getSrchVar1()), String.valueOf(srchVar.getSrchVar2())); 
          	} else  {
          		adjustSearchIndex(searchCompare,searchIndexes);
          		searchLowPoint  = searchIndexes[0];
           		searchMidPoint  = searchIndexes[1];
           		searchHighPoint = searchIndexes[2];
           		if (searchMidPoint == -1) { // search exhausted
           		    keepSearching = false; 
//  DISPLAY 'SEARCH VALUE ' WS-SRCH-VAR-1 WS-SRCH-VAR-2 ' NOT FOUND'
              logger.info("SEARCH VALUE {}{} NOT FOUND", new String(srchVar.getSrchVar1()), String.valueOf(srchVar.getSrchVar2())); 
           		}
          	}
          }
  
//  DISPLAY 'DOING FULL TABLE SEARCH ..'
          logger.info("DOING FULL TABLE SEARCH .."); 
          srchVar1 = srchVar.getSrchVar1();
          srchVar2 = srchVar.getSrchVar2();
//  SEARCH WS-TABLE-ENTRY
          keepSearching = true;
          while(keepSearching) {
          	if  (		compareChars(table.getTableEntry(tableIndex - 1).getVar1(),srchVar1) == 0  && 	( table.getTableEntry(tableIndex - 1).getVar2() == srchVar2 )) { 
//  DISPLAY 'SEARCH VALUE ' WS-SRCH-VAR-1 WS-SRCH-VAR-2 ' FOUND'
              logger.info("SEARCH VALUE {}{} FOUND", new String(srchVar.getSrchVar1()), String.valueOf(srchVar.getSrchVar2())); 
          	break;
          	}
          	tableIndex++;
          	if (tableIndex > 100) { 
          	 keepSearching = false;
          	}
          }
          	if(!keepSearching) { 
//  DISPLAY 'SEARCH VALUE ' WS-SRCH-VAR-1 WS-SRCH-VAR-2 ' NOT FOUND'
              logger.info("SEARCH VALUE {}{} NOT FOUND", new String(srchVar.getSrchVar1()), String.valueOf(srchVar.getSrchVar2())); 
          	}
  
          ;
      
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
