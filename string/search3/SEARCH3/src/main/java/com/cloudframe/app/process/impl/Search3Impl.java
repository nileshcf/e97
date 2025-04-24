  package com.cloudframe.app.process.impl;
  /* 
*
*
*/
  
  import com.cloudframe.app.search3.Search3Ctx.*;
  import com.cloudframe.app.search3.Search3Ctx;
  import com.cloudframe.app.process.Search3;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.search3.dto.*;
  import com.cloudframe.app.search3.dto.TableGroup;
  import com.cloudframe.app.search3.dto.SrchVar;
  import com.cloudframe.app.search3.dto.AccGrp500;
  import com.cloudframe.app.search3.dto.Ip66601UserTagInformation;
  import com.cloudframe.app.search3.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.utility.CFUtil;
  
  @Component("search3")
  
  public class Search3Impl extends CommonProcess implements Search3 {
  
  Logger logger = LoggerFactory.getLogger(Search3Impl.class);
  
  
  
  
  
  
  
  
  
  
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      public int process(Search3Ctx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
          ;
//  PERFORM MAIN-LINE
          mainLine(programCtx.getMainLineInCtx());/*MAIN-LINE*/
          if (programCtx.isProgramEnded()) {
              return programCtx.getRc();
          }
//  PERFORM PROGRAM-DONE
          programDone(programCtx);/*PROGRAM-DONE*/
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
      @Override
      public MainLineOutCtx mainLine(MainLineInCtx methodIn) throws Exception {
Search3Ctx programCtx = methodIn.getSearch3Ctx();
MainLineOutCtx methodOut = methodIn.getMainLineOutCtx();

// *
// * Populate ip66601-user-tag-table
// *
//  PERFORM VARYING WS-I FROM 1 BY 1 UNTIL WS-I > 10
          for (methodOut.setI(1); (	( methodOut.getI() <= 10 ) ) ; methodOut.setI(methodOut.getI() + 1) ) {
//  MOVE WS-I TO IP66601-USER-TAG-TYPE ( WS-I )
              methodOut.setIp66601UserTagType(methodOut.getI() - 1,methodOut.getI());
              methodOut.setIp66601UserTagNo(methodOut.getI() - 1,(short) (methodOut.getI() * 10));
              methodOut.setIp66601UserTagOccurrence(methodOut.getI() - 1,(short) (methodOut.getI() * 11));
              methodOut.setIp66601UserTagSubfldNo(methodOut.getI() - 1,(short) (methodOut.getI() * 12));
              methodOut.setIp66601UserTagStart(methodOut.getI() - 1,(short) (methodOut.getI() * 13));
              methodOut.setIp66601UserTagLngth(methodOut.getI() - 1,(short) (methodOut.getI() * 14));
//  MOVE 'A' TO IP66601-USER-TAG-STATUS ( WS-I )
//  LITERAL_A = 'A'
              methodOut.setIp66601UserTagStatus(methodOut.getI() - 1,CONSTANTS.LITERAL_A);
          }

// *

// *
//  MOVE 10 TO IP66601-USER-TCNT
          methodOut.setIp66601UserTcnt((short)10);
//  SET IP66601-USER-T , IP66601-USER-P TO 1
          methodOut.setIp66601UserT(1); 
          
          methodOut.setIp66601UserP(1); 
          
//  SET IP66601-USER-LEFT TO 1
          methodOut.setIp66601UserLeft(1); 
          
//  SET IP66601-USER-RIGHT TO 10
          methodOut.setIp66601UserRight(10); 
          
//  SET IP66601-USER-MEDIAN TO 5
          methodOut.setIp66601UserMedian(5); 
          
//  SET IP66601-USER-START TO 6
          methodOut.setIp66601UserStart(6); 
          
//  SET IP66601-USER-END TO 7
          methodOut.setIp66601UserEnd(7); 
          
//  SET IP66601-USER-P TO 1
          methodOut.setIp66601UserP(1); 
          

// *
//  DISPLAY '-------------------------------------------'
          logger.info("-------------------------------------------"); 
          // MOVE 3 TO WS-SRCHVAL
          methodOut.setSrchval(3);
//  DISPLAY ' ABOUT TO SEARCH TAGTYPE ' WS-SRCHVAL
          logger.info(" ABOUT TO SEARCH TAGTYPE {}", String.valueOf(methodOut.getSrchval())); 
//  PERFORM 0200-SEARCH THRU 0200-EXIT
          search(programCtx.getSearchInCtx());/*0200-SEARCH*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }

// *
//  DISPLAY '-------------------------------------------'
          logger.info("-------------------------------------------"); 
          // MOVE 7 TO WS-SRCHVAL
          methodOut.setSrchval(7);
//  DISPLAY ' ABOUT TO SEARCH TAGTYPE ' WS-SRCHVAL
          logger.info(" ABOUT TO SEARCH TAGTYPE {}", String.valueOf(methodOut.getSrchval())); 
//  PERFORM 0200-SEARCH THRU 0200-EXIT
          search(programCtx.getSearchInCtx());/*0200-SEARCH*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }

// *
//  DISPLAY '-------------------------------------------'
          logger.info("-------------------------------------------"); 
          // MOVE 2 TO WS-SRCHVAL
          methodOut.setSrchval(2);
//  DISPLAY ' ABOUT TO SEARCH TAGTYPE ' WS-SRCHVAL
          logger.info(" ABOUT TO SEARCH TAGTYPE {}", String.valueOf(methodOut.getSrchval())); 
//  PERFORM 0200-SEARCH THRU 0200-EXIT
          search(programCtx.getSearchInCtx());/*0200-SEARCH*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }

// *
//  DISPLAY '-------------------------------------------'
          logger.info("-------------------------------------------"); 
          // MOVE 4 TO WS-SRCHVAL
          methodOut.setSrchval(4);
//  DISPLAY ' ABOUT TO SEARCH TAGTYPE ' WS-SRCHVAL
          logger.info(" ABOUT TO SEARCH TAGTYPE {}", String.valueOf(methodOut.getSrchval())); 
//  PERFORM 0300-SEARCH THRU 0300-EXIT
          search0300(programCtx.getSearch0300InCtx());/*0300-SEARCH*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }

// *
//  DISPLAY '-------------------------------------------'
          logger.info("-------------------------------------------"); 
          // MOVE 2 TO WS-SRCHVAL
          methodOut.setSrchval(2);
//  DISPLAY ' ABOUT TO SEARCH TAGTYPE ' WS-SRCHVAL
          logger.info(" ABOUT TO SEARCH TAGTYPE {}", String.valueOf(methodOut.getSrchval())); 
//  PERFORM 0300-SEARCH THRU 0300-EXIT
          search0300(programCtx.getSearch0300InCtx());/*0300-SEARCH*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }

// *
// *
//  DISPLAY '-------------------------------------------'
          logger.info("-------------------------------------------"); 
          // MOVE 5 TO WS-SRCHVAL
          methodOut.setSrchval(5);
//  DISPLAY ' ABOUT TO SEARCH TAGTYPE ' WS-SRCHVAL
          logger.info(" ABOUT TO SEARCH TAGTYPE {}", String.valueOf(methodOut.getSrchval())); 
//  PERFORM 0400-SEARCH THRU 0400-EXIT
          search0400(programCtx.getSearch0400InCtx());/*0400-SEARCH*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }

// *
//  DISPLAY '-------------------------------------------'
          logger.info("-------------------------------------------"); 
//  DISPLAY ' SEARCH WITH COMPLEX WHEN CONDITION '
          logger.info(" SEARCH WITH COMPLEX WHEN CONDITION "); 
//  PERFORM 0500-SEARCH THRU 0500-EXIT
          search0500(programCtx.getSearch0500InCtx());/*0500-SEARCH*/
          if (programCtx.isProgramEnded()) {
              return methodOut;
          }
          ;
      
      return methodOut;
      }
      /**
      * programDone 
      *   This method is derived from 
  *   COBOL Paragraph - PROGRAM-DONE COBOL Cyclomatic complexity - 2
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void programDone(Search3Ctx programCtx) throws Exception {
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
      @Override
      public SearchOutCtx search(SearchInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			boolean keepSearching = true;
			// End of variable declaration

Search3Ctx programCtx = methodIn.getSearch3Ctx();
SearchOutCtx methodOut = methodIn.getSearchOutCtx();

// *

// *
//  SET IP66601-USER-P TO 1
          methodOut.setIp66601UserP(1); 
          
//  SEARCH IP66601-USER-TAG VARYING IP66601-USER-P
          keepSearching = true;
          while(keepSearching) {
          	if  (	( methodIn.getIp66601UserTagType(methodOut.getIp66601UserP() - 1) == methodIn.getSrchval() ) ) { 
//  DISPLAY 'SEARCHING FOR TAG TYPE = ' WS-SRCHVAL
              logger.info("SEARCHING FOR TAG TYPE = {}", String.valueOf(methodIn.getSrchval())); 
//  DISPLAY '100-THERE-ARE-PDSES'
              logger.info("100-THERE-ARE-PDSES"); 
//  SET 800-LAST-DE-TAG TO IP66601-USER-P
              methodOut.setLastDeTag800(methodOut.getIp66601UserP()); 
              
//  SUBTRACT 1 FROM 800-LAST-DE-TAG
              methodOut.setLastDeTag800(methodOut.getLastDeTag800()-1);
          	break;
          	}
          	else if  (	( methodOut.getIp66601UserP() >= methodOut.getIp66601UserTcnt() ) ) { 
//  DISPLAY 'SEARCHING FOR TAG TYPE = ' WS-SRCHVAL
              logger.info("SEARCHING FOR TAG TYPE = {}", String.valueOf(methodIn.getSrchval())); 
//  DISPLAY '100-WE-ARE-DONE-WITH-PDSES'
              logger.info("100-WE-ARE-DONE-WITH-PDSES"); 
//  MOVE IP66601-USER-TCNT TO 800-LAST-DE-TAG
              methodOut.setLastDeTag800(methodOut.getIp66601UserTcnt());
          	break;
          	}
          	methodOut.setIp66601UserP(methodOut.getIp66601UserP() + 1);
          	if (methodOut.getIp66601UserP() > 700) { 
          	 keepSearching = false;
          	}
          }
          	if(!keepSearching) { 
//  DISPLAY 'SEARCHING FOR TAG TYPE = ' WS-SRCHVAL
              logger.info("SEARCHING FOR TAG TYPE = {}", String.valueOf(methodIn.getSrchval())); 
//  DISPLAY '100-WE-ARE-DONE-WITH-PDSES'
              logger.info("100-WE-ARE-DONE-WITH-PDSES"); 
//  MOVE IP66601-USER-TCNT TO 800-LAST-DE-TAG
              methodOut.setLastDeTag800(methodOut.getIp66601UserTcnt());
          	}
//  DISPLAY ' '
          logger.info(" "); 
//  DISPLAY '800-LAST-DE-TAG = ' 800-LAST-DE-TAG
          logger.info("800-LAST-DE-TAG = {}", String.valueOf(methodOut.getLastDeTag800())); 
//  DISPLAY 'MATCHED VALUES WITH IP66601-USER-P INDEX      ' IP66601-USER-TAG-TYPE ( IP66601-USER-P ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-P ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-P ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-P ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-P ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-P ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-P )
          logger.info("MATCHED VALUES WITH IP66601-USER-P INDEX      {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(methodIn.getIp66601UserTagType(methodOut.getIp66601UserP() - 1)), String.valueOf(methodIn.getIp66601UserTagNo(methodOut.getIp66601UserP() - 1)), String.valueOf(methodIn.getIp66601UserTagOccurrence(methodOut.getIp66601UserP() - 1)), String.valueOf(methodIn.getIp66601UserTagSubfldNo(methodOut.getIp66601UserP() - 1)), String.valueOf(methodIn.getIp66601UserTagStart(methodOut.getIp66601UserP() - 1)), String.valueOf(methodIn.getIp66601UserTagLngth(methodOut.getIp66601UserP() - 1)), new String(methodIn.getIp66601UserTagStatus(methodOut.getIp66601UserP() - 1))); 
//  DISPLAY '....... VALUES WITH IP66601-USER-T INDEX      ' IP66601-USER-TAG-TYPE ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-T )
          logger.info("....... VALUES WITH IP66601-USER-T INDEX      {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(methodIn.getIp66601UserTagType(methodIn.getIp66601UserT() - 1)), String.valueOf(methodIn.getIp66601UserTagNo(methodIn.getIp66601UserT() - 1)), String.valueOf(methodIn.getIp66601UserTagOccurrence(methodIn.getIp66601UserT() - 1)), String.valueOf(methodIn.getIp66601UserTagSubfldNo(methodIn.getIp66601UserT() - 1)), String.valueOf(methodIn.getIp66601UserTagStart(methodIn.getIp66601UserT() - 1)), String.valueOf(methodIn.getIp66601UserTagLngth(methodIn.getIp66601UserT() - 1)), new String(methodIn.getIp66601UserTagStatus(methodIn.getIp66601UserT() - 1))); 
//  DISPLAY '....... VALUES WITH IP66601-USER-LEFT INDEX   ' IP66601-USER-TAG-TYPE ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-LEFT )
          logger.info("....... VALUES WITH IP66601-USER-LEFT INDEX   {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(methodIn.getIp66601UserTagType(methodIn.getIp66601UserLeft() - 1)), String.valueOf(methodIn.getIp66601UserTagNo(methodIn.getIp66601UserLeft() - 1)), String.valueOf(methodIn.getIp66601UserTagOccurrence(methodIn.getIp66601UserLeft() - 1)), String.valueOf(methodIn.getIp66601UserTagSubfldNo(methodIn.getIp66601UserLeft() - 1)), String.valueOf(methodIn.getIp66601UserTagStart(methodIn.getIp66601UserLeft() - 1)), String.valueOf(methodIn.getIp66601UserTagLngth(methodIn.getIp66601UserLeft() - 1)), new String(methodIn.getIp66601UserTagStatus(methodIn.getIp66601UserLeft() - 1))); 
//  DISPLAY '....... VALUES WITH IP66601-USER-RIGHT INDEX  ' IP66601-USER-TAG-TYPE ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-RIGHT )
          logger.info("....... VALUES WITH IP66601-USER-RIGHT INDEX  {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(methodIn.getIp66601UserTagType(methodIn.getIp66601UserRight() - 1)), String.valueOf(methodIn.getIp66601UserTagNo(methodIn.getIp66601UserRight() - 1)), String.valueOf(methodIn.getIp66601UserTagOccurrence(methodIn.getIp66601UserRight() - 1)), String.valueOf(methodIn.getIp66601UserTagSubfldNo(methodIn.getIp66601UserRight() - 1)), String.valueOf(methodIn.getIp66601UserTagStart(methodIn.getIp66601UserRight() - 1)), String.valueOf(methodIn.getIp66601UserTagLngth(methodIn.getIp66601UserRight() - 1)), new String(methodIn.getIp66601UserTagStatus(methodIn.getIp66601UserRight() - 1))); 
//  DISPLAY '....... VALUES WITH IP66601-USER-MEDIAN INDEX ' IP66601-USER-TAG-TYPE ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-MEDIAN )
          logger.info("....... VALUES WITH IP66601-USER-MEDIAN INDEX {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(methodIn.getIp66601UserTagType(methodIn.getIp66601UserMedian() - 1)), String.valueOf(methodIn.getIp66601UserTagNo(methodIn.getIp66601UserMedian() - 1)), String.valueOf(methodIn.getIp66601UserTagOccurrence(methodIn.getIp66601UserMedian() - 1)), String.valueOf(methodIn.getIp66601UserTagSubfldNo(methodIn.getIp66601UserMedian() - 1)), String.valueOf(methodIn.getIp66601UserTagStart(methodIn.getIp66601UserMedian() - 1)), String.valueOf(methodIn.getIp66601UserTagLngth(methodIn.getIp66601UserMedian() - 1)), new String(methodIn.getIp66601UserTagStatus(methodIn.getIp66601UserMedian() - 1))); 
//  DISPLAY '....... VALUES WITH IP66601-USER-START INDEX  ' IP66601-USER-TAG-TYPE ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-START )
          logger.info("....... VALUES WITH IP66601-USER-START INDEX  {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(methodIn.getIp66601UserTagType(methodIn.getIp66601UserStart() - 1)), String.valueOf(methodIn.getIp66601UserTagNo(methodIn.getIp66601UserStart() - 1)), String.valueOf(methodIn.getIp66601UserTagOccurrence(methodIn.getIp66601UserStart() - 1)), String.valueOf(methodIn.getIp66601UserTagSubfldNo(methodIn.getIp66601UserStart() - 1)), String.valueOf(methodIn.getIp66601UserTagStart(methodIn.getIp66601UserStart() - 1)), String.valueOf(methodIn.getIp66601UserTagLngth(methodIn.getIp66601UserStart() - 1)), new String(methodIn.getIp66601UserTagStatus(methodIn.getIp66601UserStart() - 1))); 
//  DISPLAY '....... VALUES WITH IP66601-USER-END INDEX    ' IP66601-USER-TAG-TYPE ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-END )
          logger.info("....... VALUES WITH IP66601-USER-END INDEX    {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(methodIn.getIp66601UserTagType(methodIn.getIp66601UserEnd() - 1)), String.valueOf(methodIn.getIp66601UserTagNo(methodIn.getIp66601UserEnd() - 1)), String.valueOf(methodIn.getIp66601UserTagOccurrence(methodIn.getIp66601UserEnd() - 1)), String.valueOf(methodIn.getIp66601UserTagSubfldNo(methodIn.getIp66601UserEnd() - 1)), String.valueOf(methodIn.getIp66601UserTagStart(methodIn.getIp66601UserEnd() - 1)), String.valueOf(methodIn.getIp66601UserTagLngth(methodIn.getIp66601UserEnd() - 1)), new String(methodIn.getIp66601UserTagStatus(methodIn.getIp66601UserEnd() - 1))); 
          ;
      
      return methodOut;
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
      @Override
      public Search0300OutCtx search0300(Search0300InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			boolean keepSearching = true;
			// End of variable declaration

      
// *

// *

// *
Search3Ctx programCtx = methodIn.getSearch3Ctx();
Search0300OutCtx methodOut = methodIn.getSearch0300OutCtx();
//  SET IP66601-USER-END TO 1
          methodOut.setIp66601UserEnd(1); 
          
//  SEARCH IP66601-USER-TAG VARYING IP66601-USER-END
          keepSearching = true;
          while(keepSearching) {
          	if  (	( methodIn.getIp66601UserTagType(methodOut.getIp66601UserEnd() - 1) == methodIn.getSrchval() ) ) { 
//  DISPLAY 'SEARCHING FOR TAG TYPE = ' WS-SRCHVAL
              logger.info("SEARCHING FOR TAG TYPE = {}", String.valueOf(methodIn.getSrchval())); 
//  DISPLAY '100-THERE-ARE-PDSES'
              logger.info("100-THERE-ARE-PDSES"); 
//  SET 800-LAST-DE-TAG TO IP66601-USER-END
              methodOut.setLastDeTag800(methodOut.getIp66601UserEnd()); 
              
//  SUBTRACT 1 FROM 800-LAST-DE-TAG
              methodOut.setLastDeTag800(methodOut.getLastDeTag800()-1);
//  IF IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-END ) > IP66601-USER-TAG-OCCURRENCE (3) THEN
              if (	( methodOut.getIp66601UserTagOccurrence(methodOut.getIp66601UserEnd() - 1) > methodOut.getIp66601UserTagOccurrence(2) )) { 
//  DISPLAY 'TAG OCCURENCE IS > 33'
                  logger.info("TAG OCCURENCE IS > 33"); 
//  MOVE IP66601-USER-TAG-OCCURRENCE (3) TO IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-END )
                  methodOut.setIp66601UserTagOccurrence(methodOut.getIp66601UserEnd() - 1,methodOut.getIp66601UserTagOccurrence(2));
              }
//  ELSE
              else { 
//  DISPLAY 'TAG OCCURENCE IS <= 33'
                  logger.info("TAG OCCURENCE IS <= 33"); 
//  MOVE IP66601-USER-TAG-OCCURRENCE (3) TO IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-END )
                  methodOut.setIp66601UserTagOccurrence(methodOut.getIp66601UserEnd() - 1,methodOut.getIp66601UserTagOccurrence(2));
              }
          	break;
          	}
          	else if  (	( methodOut.getIp66601UserEnd() >= methodOut.getIp66601UserTcnt() ) ) { 
//  DISPLAY 'SEARCHING FOR TAG TYPE = ' WS-SRCHVAL
              logger.info("SEARCHING FOR TAG TYPE = {}", String.valueOf(methodIn.getSrchval())); 
//  DISPLAY '100-WE-ARE-DONE-WITH-PDSES'
              logger.info("100-WE-ARE-DONE-WITH-PDSES"); 
//  MOVE IP66601-USER-TCNT TO 800-LAST-DE-TAG
              methodOut.setLastDeTag800(methodOut.getIp66601UserTcnt());
          	break;
          	}
          	methodOut.setIp66601UserEnd(methodOut.getIp66601UserEnd() + 1);
          	if (methodOut.getIp66601UserEnd() > 700) { 
          	 keepSearching = false;
          	}
          }
          	if(!keepSearching) { 
//  DISPLAY 'SEARCHING FOR TAG TYPE = ' WS-SRCHVAL
              logger.info("SEARCHING FOR TAG TYPE = {}", String.valueOf(methodIn.getSrchval())); 
//  DISPLAY '100-WE-ARE-DONE-WITH-PDSES'
              logger.info("100-WE-ARE-DONE-WITH-PDSES"); 
//  MOVE IP66601-USER-TCNT TO 800-LAST-DE-TAG
              methodOut.setLastDeTag800(methodOut.getIp66601UserTcnt());
          	}
//  DISPLAY ' '
          logger.info(" "); 
//  DISPLAY '800-LAST-DE-TAG = ' 800-LAST-DE-TAG
          logger.info("800-LAST-DE-TAG = {}", String.valueOf(methodOut.getLastDeTag800())); 
//  DISPLAY 'MATCHED VALUES WITH IP66601-USER-END INDEX    ' IP66601-USER-TAG-TYPE ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-END )
          logger.info("MATCHED VALUES WITH IP66601-USER-END INDEX    {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(methodIn.getIp66601UserTagType(methodOut.getIp66601UserEnd() - 1)), String.valueOf(methodIn.getIp66601UserTagNo(methodOut.getIp66601UserEnd() - 1)), String.valueOf(methodOut.getIp66601UserTagOccurrence(methodOut.getIp66601UserEnd() - 1)), String.valueOf(methodIn.getIp66601UserTagSubfldNo(methodOut.getIp66601UserEnd() - 1)), String.valueOf(methodIn.getIp66601UserTagStart(methodOut.getIp66601UserEnd() - 1)), String.valueOf(methodIn.getIp66601UserTagLngth(methodOut.getIp66601UserEnd() - 1)), new String(methodIn.getIp66601UserTagStatus(methodOut.getIp66601UserEnd() - 1))); 
//  DISPLAY '....... VALUES WITH IP66601-USER-T INDEX      ' IP66601-USER-TAG-TYPE ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-T )
          logger.info("....... VALUES WITH IP66601-USER-T INDEX      {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(methodIn.getIp66601UserTagType(methodIn.getIp66601UserT() - 1)), String.valueOf(methodIn.getIp66601UserTagNo(methodIn.getIp66601UserT() - 1)), String.valueOf(methodOut.getIp66601UserTagOccurrence(methodIn.getIp66601UserT() - 1)), String.valueOf(methodIn.getIp66601UserTagSubfldNo(methodIn.getIp66601UserT() - 1)), String.valueOf(methodIn.getIp66601UserTagStart(methodIn.getIp66601UserT() - 1)), String.valueOf(methodIn.getIp66601UserTagLngth(methodIn.getIp66601UserT() - 1)), new String(methodIn.getIp66601UserTagStatus(methodIn.getIp66601UserT() - 1))); 
//  DISPLAY '....... VALUES WITH IP66601-USER-LEFT INDEX   ' IP66601-USER-TAG-TYPE ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-LEFT )
          logger.info("....... VALUES WITH IP66601-USER-LEFT INDEX   {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(methodIn.getIp66601UserTagType(methodIn.getIp66601UserLeft() - 1)), String.valueOf(methodIn.getIp66601UserTagNo(methodIn.getIp66601UserLeft() - 1)), String.valueOf(methodOut.getIp66601UserTagOccurrence(methodIn.getIp66601UserLeft() - 1)), String.valueOf(methodIn.getIp66601UserTagSubfldNo(methodIn.getIp66601UserLeft() - 1)), String.valueOf(methodIn.getIp66601UserTagStart(methodIn.getIp66601UserLeft() - 1)), String.valueOf(methodIn.getIp66601UserTagLngth(methodIn.getIp66601UserLeft() - 1)), new String(methodIn.getIp66601UserTagStatus(methodIn.getIp66601UserLeft() - 1))); 
//  DISPLAY '....... VALUES WITH IP66601-USER-RIGHT INDEX  ' IP66601-USER-TAG-TYPE ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-RIGHT )
          logger.info("....... VALUES WITH IP66601-USER-RIGHT INDEX  {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(methodIn.getIp66601UserTagType(methodIn.getIp66601UserRight() - 1)), String.valueOf(methodIn.getIp66601UserTagNo(methodIn.getIp66601UserRight() - 1)), String.valueOf(methodOut.getIp66601UserTagOccurrence(methodIn.getIp66601UserRight() - 1)), String.valueOf(methodIn.getIp66601UserTagSubfldNo(methodIn.getIp66601UserRight() - 1)), String.valueOf(methodIn.getIp66601UserTagStart(methodIn.getIp66601UserRight() - 1)), String.valueOf(methodIn.getIp66601UserTagLngth(methodIn.getIp66601UserRight() - 1)), new String(methodIn.getIp66601UserTagStatus(methodIn.getIp66601UserRight() - 1))); 
//  DISPLAY '....... VALUES WITH IP66601-USER-MEDIAN INDEX ' IP66601-USER-TAG-TYPE ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-MEDIAN )
          logger.info("....... VALUES WITH IP66601-USER-MEDIAN INDEX {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(methodIn.getIp66601UserTagType(methodIn.getIp66601UserMedian() - 1)), String.valueOf(methodIn.getIp66601UserTagNo(methodIn.getIp66601UserMedian() - 1)), String.valueOf(methodOut.getIp66601UserTagOccurrence(methodIn.getIp66601UserMedian() - 1)), String.valueOf(methodIn.getIp66601UserTagSubfldNo(methodIn.getIp66601UserMedian() - 1)), String.valueOf(methodIn.getIp66601UserTagStart(methodIn.getIp66601UserMedian() - 1)), String.valueOf(methodIn.getIp66601UserTagLngth(methodIn.getIp66601UserMedian() - 1)), new String(methodIn.getIp66601UserTagStatus(methodIn.getIp66601UserMedian() - 1))); 
//  DISPLAY '....... VALUES WITH IP66601-USER-START INDEX  ' IP66601-USER-TAG-TYPE ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-START )
          logger.info("....... VALUES WITH IP66601-USER-START INDEX  {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(methodIn.getIp66601UserTagType(methodIn.getIp66601UserStart() - 1)), String.valueOf(methodIn.getIp66601UserTagNo(methodIn.getIp66601UserStart() - 1)), String.valueOf(methodOut.getIp66601UserTagOccurrence(methodIn.getIp66601UserStart() - 1)), String.valueOf(methodIn.getIp66601UserTagSubfldNo(methodIn.getIp66601UserStart() - 1)), String.valueOf(methodIn.getIp66601UserTagStart(methodIn.getIp66601UserStart() - 1)), String.valueOf(methodIn.getIp66601UserTagLngth(methodIn.getIp66601UserStart() - 1)), new String(methodIn.getIp66601UserTagStatus(methodIn.getIp66601UserStart() - 1))); 
//  DISPLAY '....... VALUES WITH IP66601-USER-P INDEX      ' IP66601-USER-TAG-TYPE ( IP66601-USER-P ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-P ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-P ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-P ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-P ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-P ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-P )
          logger.info("....... VALUES WITH IP66601-USER-P INDEX      {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(methodIn.getIp66601UserTagType(methodIn.getIp66601UserP() - 1)), String.valueOf(methodIn.getIp66601UserTagNo(methodIn.getIp66601UserP() - 1)), String.valueOf(methodOut.getIp66601UserTagOccurrence(methodIn.getIp66601UserP() - 1)), String.valueOf(methodIn.getIp66601UserTagSubfldNo(methodIn.getIp66601UserP() - 1)), String.valueOf(methodIn.getIp66601UserTagStart(methodIn.getIp66601UserP() - 1)), String.valueOf(methodIn.getIp66601UserTagLngth(methodIn.getIp66601UserP() - 1)), new String(methodIn.getIp66601UserTagStatus(methodIn.getIp66601UserP() - 1))); 
          ;
      
      return methodOut;
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
      @Override
      public Search0400OutCtx search0400(Search0400InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			boolean keepSearching = true;
			// End of variable declaration

      
// *

// *

// *
Search3Ctx programCtx = methodIn.getSearch3Ctx();
Search0400OutCtx methodOut = methodIn.getSearch0400OutCtx();
//  SET IP66601-USER-MEDIAN TO 1
          methodOut.setIp66601UserMedian(1); 
          
//  SEARCH IP66601-USER-TAG VARYING IP66601-USER-MEDIAN
          keepSearching = true;
          while(keepSearching) {
          	if  (	( methodIn.getIp66601UserTagType(methodOut.getIp66601UserMedian() - 1) == methodIn.getSrchval() ) ) { 
//  DISPLAY 'SEARCHING FOR TAG TYPE = ' WS-SRCHVAL
              logger.info("SEARCHING FOR TAG TYPE = {}", String.valueOf(methodIn.getSrchval())); 
//  DISPLAY '100-THERE-ARE-PDSES'
              logger.info("100-THERE-ARE-PDSES"); 
//  SET 800-LAST-DE-TAG TO IP66601-USER-MEDIAN
              methodOut.setLastDeTag800(methodOut.getIp66601UserMedian()); 
              
//  SUBTRACT 1 FROM 800-LAST-DE-TAG
              methodOut.setLastDeTag800(methodOut.getLastDeTag800()-1);

// *
// * The following logic extracted from ip460010 from search/when
// *
//  SET 500-FIN-NF-CURR-CD-IDX TO 5
              methodOut.setFinNfCurrCdIdx500(5); 
              
//  MOVE 'DR' TO 500-ACC-FIN-NF-IND ( 500-FIN-NF-CURR-CD-IDX )
//  LITERAL_DR = 'DR'
              methodOut.setAccFinNfInd500(methodOut.getFinNfCurrCdIdx500() - 1,CONSTANTS.LITERAL_DR);
              // MOVE 'CR' TO 400-ACC-FIN-NON-FIN-IND
              //  LITERAL_CR = 'CR'
              methodOut.setAccFinNonFinInd400(CONSTANTS.LITERAL_CR);
//  MOVE 123 TO 500-ACC-FIN-NF-AMT ( 500-FIN-NF-CURR-CD-IDX )
              methodOut.setAccFinNfAmt500(methodOut.getFinNfCurrCdIdx500() - 1,123);
              // MOVE 345 TO 400-ACC-FIN-NON-FIN-AMT
              methodOut.setAccFinNonFinAmt400((short)345);
              // MOVE 567 TO 801-ACC-AMOUNT
              methodOut.setAccAmount801((short)567);
//  EVALUATE 500-ACC-FIN-NF-IND ( 500-FIN-NF-CURR-CD-IDX ) ALSO 400-ACC-FIN-NON-FIN-IND
              if  (((		compareChars(methodOut.getAccFinNfInd500(methodOut.getFinNfCurrCdIdx500() - 1),methodOut.getValueCr300()) == 0 )     && (		compareChars(methodOut.getAccFinNonFinInd400(),methodIn.getValueDr300()) == 0 )) || ((		compareChars(methodOut.getAccFinNfInd500(methodOut.getFinNfCurrCdIdx500() - 1),methodIn.getValueDr300()) == 0 )     && (		compareChars(methodOut.getAccFinNonFinInd400(),methodOut.getValueCr300()) == 0 ))) { 
//  DISPLAY '*1* REACHED WHEN'
                  logger.info("*1* REACHED WHEN"); 
//  IF 801-ACC-AMOUNT GREATER 400-ACC-FIN-NON-FIN-AMT
                  if (	( methodOut.getAccAmount801() > methodOut.getAccFinNonFinAmt400() )) { 
//  DISPLAY '*2* REACHED IF'
                      logger.info("*2* REACHED IF"); 
                      methodOut.setAccFinNfAmt500(methodOut.getFinNfCurrCdIdx500() - 1,methodOut.getAccAmount801() - methodOut.getAccFinNonFinAmt400());
//  DISPLAY '500-ACC-FIN-NF-AMT = ' 500-ACC-FIN-NF-AMT ( 500-FIN-NF-CURR-CD-IDX ) ' ** ' 500-ACC-FIN-NF-IND ( 500-FIN-NF-CURR-CD-IDX )
                      logger.info("500-ACC-FIN-NF-AMT = {} ** {}", String.valueOf(methodOut.getAccFinNfAmt500(methodOut.getFinNfCurrCdIdx500() - 1)), new String(methodOut.getAccFinNfInd500(methodOut.getFinNfCurrCdIdx500() - 1))); 
                  }
//  ELSE
                  else { 
//  DISPLAY '*3* REACHED ELSE'
                      logger.info("*3* REACHED ELSE"); 
                      methodOut.setAccFinNfAmt500(methodOut.getFinNfCurrCdIdx500() - 1,methodOut.getAccFinNonFinAmt400() - methodOut.getAccAmount801());
//  MOVE 400-ACC-FIN-NON-FIN-IND TO 500-ACC-FIN-NF-IND ( 500-FIN-NF-CURR-CD-IDX )
                      methodOut.setAccFinNfInd500(methodOut.getFinNfCurrCdIdx500() - 1,methodOut.getAccFinNonFinInd400());
//  DISPLAY '500-ACC-FIN-NF-AMT = ' 500-ACC-FIN-NF-AMT ( 500-FIN-NF-CURR-CD-IDX ) ' ** ' 500-ACC-FIN-NF-IND ( 500-FIN-NF-CURR-CD-IDX )
                      logger.info("500-ACC-FIN-NF-AMT = {} ** {}", String.valueOf(methodOut.getAccFinNfAmt500(methodOut.getFinNfCurrCdIdx500() - 1)), new String(methodOut.getAccFinNfInd500(methodOut.getFinNfCurrCdIdx500() - 1))); 
                  }
              }
              else   { 
//  ADD 400-ACC-FIN-NON-FIN-AMT TO 500-ACC-FIN-NF-AMT ( 500-FIN-NF-CURR-CD-IDX )
                  methodOut.setAccFinNfAmt500(methodOut.getFinNfCurrCdIdx500() - 1,methodOut.getAccFinNfAmt500(methodOut.getFinNfCurrCdIdx500() - 1)+methodOut.getAccFinNonFinAmt400());
              }
//  IF 500-ACC-FIN-NF-AMT ( 500-FIN-NF-CURR-CD-IDX ) EQUAL ZEROES
              if (	( methodOut.getAccFinNfAmt500(methodOut.getFinNfCurrCdIdx500() - 1) == 0 )) { 
//  DISPLAY '500-ACC-FIN-NF-AMT ZERO'
                  logger.info("500-ACC-FIN-NF-AMT ZERO"); 
//  MOVE 300-VALUE-CR TO 500-ACC-FIN-NF-IND ( 500-FIN-NF-CURR-CD-IDX )
                  methodOut.setAccFinNfInd500(methodOut.getFinNfCurrCdIdx500() - 1,methodOut.getValueCr300());
              }

// *
//  SET 500-FIN-NF-CURR-CD-IDX TO 9
              methodOut.setFinNfCurrCdIdx500(9); 
              
//  MOVE 'CR' TO 500-ACC-FIN-NF-IND ( 500-FIN-NF-CURR-CD-IDX )
//  LITERAL_CR = 'CR'
              methodOut.setAccFinNfInd500(methodOut.getFinNfCurrCdIdx500() - 1,CONSTANTS.LITERAL_CR);
              // MOVE 'DR' TO 400-ACC-FIN-NON-FIN-IND
              //  LITERAL_DR = 'DR'
              methodOut.setAccFinNonFinInd400(CONSTANTS.LITERAL_DR);
//  MOVE 123 TO 500-ACC-FIN-NF-AMT ( 500-FIN-NF-CURR-CD-IDX )
              methodOut.setAccFinNfAmt500(methodOut.getFinNfCurrCdIdx500() - 1,123);
              // MOVE 567 TO 400-ACC-FIN-NON-FIN-AMT
              methodOut.setAccFinNonFinAmt400((short)567);
              // MOVE 341 TO 801-ACC-AMOUNT
              methodOut.setAccAmount801((short)341);
//  EVALUATE 500-ACC-FIN-NF-IND ( 500-FIN-NF-CURR-CD-IDX ) ALSO 400-ACC-FIN-NON-FIN-IND
              if  (((		compareChars(methodOut.getAccFinNfInd500(methodOut.getFinNfCurrCdIdx500() - 1),methodOut.getValueCr300()) == 0 )     && (		compareChars(methodOut.getAccFinNonFinInd400(),methodIn.getValueDr300()) == 0 )) || ((		compareChars(methodOut.getAccFinNfInd500(methodOut.getFinNfCurrCdIdx500() - 1),methodIn.getValueDr300()) == 0 )     && (		compareChars(methodOut.getAccFinNonFinInd400(),methodOut.getValueCr300()) == 0 ))) { 
//  DISPLAY '*1* REACHED WHEN'
                  logger.info("*1* REACHED WHEN"); 
//  IF 801-ACC-AMOUNT GREATER 400-ACC-FIN-NON-FIN-AMT
                  if (	( methodOut.getAccAmount801() > methodOut.getAccFinNonFinAmt400() )) { 
//  DISPLAY '*2* REACHED IF'
                      logger.info("*2* REACHED IF"); 
                      methodOut.setAccFinNfAmt500(methodOut.getFinNfCurrCdIdx500() - 1,methodOut.getAccAmount801() - methodOut.getAccFinNonFinAmt400());
//  DISPLAY '500-ACC-FIN-NF-AMT = ' 500-ACC-FIN-NF-AMT ( 500-FIN-NF-CURR-CD-IDX ) ' ** ' 500-ACC-FIN-NF-IND ( 500-FIN-NF-CURR-CD-IDX )
                      logger.info("500-ACC-FIN-NF-AMT = {} ** {}", String.valueOf(methodOut.getAccFinNfAmt500(methodOut.getFinNfCurrCdIdx500() - 1)), new String(methodOut.getAccFinNfInd500(methodOut.getFinNfCurrCdIdx500() - 1))); 
                  }
//  ELSE
                  else { 
//  DISPLAY '*3* REACHED ELSE'
                      logger.info("*3* REACHED ELSE"); 
                      methodOut.setAccFinNfAmt500(methodOut.getFinNfCurrCdIdx500() - 1,methodOut.getAccFinNonFinAmt400() - methodOut.getAccAmount801());
//  MOVE 400-ACC-FIN-NON-FIN-IND TO 500-ACC-FIN-NF-IND ( 500-FIN-NF-CURR-CD-IDX )
                      methodOut.setAccFinNfInd500(methodOut.getFinNfCurrCdIdx500() - 1,methodOut.getAccFinNonFinInd400());
//  DISPLAY '500-ACC-FIN-NF-AMT = ' 500-ACC-FIN-NF-AMT ( 500-FIN-NF-CURR-CD-IDX ) ' ** ' 500-ACC-FIN-NF-IND ( 500-FIN-NF-CURR-CD-IDX )
                      logger.info("500-ACC-FIN-NF-AMT = {} ** {}", String.valueOf(methodOut.getAccFinNfAmt500(methodOut.getFinNfCurrCdIdx500() - 1)), new String(methodOut.getAccFinNfInd500(methodOut.getFinNfCurrCdIdx500() - 1))); 
                  }
              }
              else   { 
//  ADD 400-ACC-FIN-NON-FIN-AMT TO 500-ACC-FIN-NF-AMT ( 500-FIN-NF-CURR-CD-IDX )
                  methodOut.setAccFinNfAmt500(methodOut.getFinNfCurrCdIdx500() - 1,methodOut.getAccFinNfAmt500(methodOut.getFinNfCurrCdIdx500() - 1)+methodOut.getAccFinNonFinAmt400());
              }
//  MOVE ZERO TO 500-ACC-FIN-NF-AMT ( 500-FIN-NF-CURR-CD-IDX )
              methodOut.setAccFinNfAmt500(methodOut.getFinNfCurrCdIdx500() - 1,0);
//  DISPLAY 'MOVING ZERO TO 500-ACC-FIN-NF-AMT'
              logger.info("MOVING ZERO TO 500-ACC-FIN-NF-AMT"); 
//  IF 500-ACC-FIN-NF-AMT ( 500-FIN-NF-CURR-CD-IDX ) EQUAL ZEROES
              if (	( methodOut.getAccFinNfAmt500(methodOut.getFinNfCurrCdIdx500() - 1) == 0 )) { 
//  MOVE 300-VALUE-CR TO 500-ACC-FIN-NF-IND ( 500-FIN-NF-CURR-CD-IDX )
                  methodOut.setAccFinNfInd500(methodOut.getFinNfCurrCdIdx500() - 1,methodOut.getValueCr300());
//  DISPLAY '500-ACC-FIN-NF-AMT = 00000000' ' ** ' 500-ACC-FIN-NF-IND ( 500-FIN-NF-CURR-CD-IDX )
                  logger.info("500-ACC-FIN-NF-AMT = 00000000 ** {}", new String(methodOut.getAccFinNfInd500(methodOut.getFinNfCurrCdIdx500() - 1))); 
              }

// *
//  IF IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-MEDIAN ) > IP66601-USER-TAG-OCCURRENCE (3) THEN
              if (	( methodOut.getIp66601UserTagOccurrence(methodOut.getIp66601UserMedian() - 1) > methodOut.getIp66601UserTagOccurrence(2) )) { 
//  DISPLAY 'TAG OCCURENCE IS > 33'
                  logger.info("TAG OCCURENCE IS > 33"); 
//  MOVE IP66601-USER-TAG-OCCURRENCE (3) TO IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-MEDIAN )
                  methodOut.setIp66601UserTagOccurrence(methodOut.getIp66601UserMedian() - 1,methodOut.getIp66601UserTagOccurrence(2));
              }
//  ELSE
              else { 
//  DISPLAY 'TAG OCCURENCE IS <= 33'
                  logger.info("TAG OCCURENCE IS <= 33"); 
//  MOVE IP66601-USER-TAG-OCCURRENCE (3) TO IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-MEDIAN )
                  methodOut.setIp66601UserTagOccurrence(methodOut.getIp66601UserMedian() - 1,methodOut.getIp66601UserTagOccurrence(2));
              }
          	break;
          	}
          	else if  (	( methodOut.getIp66601UserMedian() >= methodOut.getIp66601UserTcnt() ) ) { 
//  DISPLAY 'SEARCHING FOR TAG TYPE = ' WS-SRCHVAL
              logger.info("SEARCHING FOR TAG TYPE = {}", String.valueOf(methodIn.getSrchval())); 
//  DISPLAY '100-WE-ARE-DONE-WITH-PDSES'
              logger.info("100-WE-ARE-DONE-WITH-PDSES"); 
//  MOVE IP66601-USER-TCNT TO 800-LAST-DE-TAG
              methodOut.setLastDeTag800(methodOut.getIp66601UserTcnt());
          	break;
          	}
          	methodOut.setIp66601UserMedian(methodOut.getIp66601UserMedian() + 1);
          	if (methodOut.getIp66601UserMedian() > 700) { 
          	 keepSearching = false;
          	}
          }
          	if(!keepSearching) { 
//  DISPLAY 'SEARCHING FOR TAG TYPE = ' WS-SRCHVAL
              logger.info("SEARCHING FOR TAG TYPE = {}", String.valueOf(methodIn.getSrchval())); 
//  DISPLAY '100-WE-ARE-DONE-WITH-PDSES'
              logger.info("100-WE-ARE-DONE-WITH-PDSES"); 
//  MOVE IP66601-USER-TCNT TO 800-LAST-DE-TAG
              methodOut.setLastDeTag800(methodOut.getIp66601UserTcnt());
          	}
//  DISPLAY ' '
          logger.info(" "); 
//  DISPLAY '800-LAST-DE-TAG = ' 800-LAST-DE-TAG
          logger.info("800-LAST-DE-TAG = {}", String.valueOf(methodOut.getLastDeTag800())); 
//  DISPLAY 'MATCHED VALUES WITH IP66601-USER-MEDIAN INDEX ' IP66601-USER-TAG-TYPE ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-MEDIAN )
          logger.info("MATCHED VALUES WITH IP66601-USER-MEDIAN INDEX {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(methodIn.getIp66601UserTagType(methodOut.getIp66601UserMedian() - 1)), String.valueOf(methodIn.getIp66601UserTagNo(methodOut.getIp66601UserMedian() - 1)), String.valueOf(methodOut.getIp66601UserTagOccurrence(methodOut.getIp66601UserMedian() - 1)), String.valueOf(methodIn.getIp66601UserTagSubfldNo(methodOut.getIp66601UserMedian() - 1)), String.valueOf(methodIn.getIp66601UserTagStart(methodOut.getIp66601UserMedian() - 1)), String.valueOf(methodIn.getIp66601UserTagLngth(methodOut.getIp66601UserMedian() - 1)), new String(methodIn.getIp66601UserTagStatus(methodOut.getIp66601UserMedian() - 1))); 
//  DISPLAY '....... VALUES WITH IP66601-USER-T INDEX      ' IP66601-USER-TAG-TYPE ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-T )
          logger.info("....... VALUES WITH IP66601-USER-T INDEX      {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(methodIn.getIp66601UserTagType(methodIn.getIp66601UserT() - 1)), String.valueOf(methodIn.getIp66601UserTagNo(methodIn.getIp66601UserT() - 1)), String.valueOf(methodOut.getIp66601UserTagOccurrence(methodIn.getIp66601UserT() - 1)), String.valueOf(methodIn.getIp66601UserTagSubfldNo(methodIn.getIp66601UserT() - 1)), String.valueOf(methodIn.getIp66601UserTagStart(methodIn.getIp66601UserT() - 1)), String.valueOf(methodIn.getIp66601UserTagLngth(methodIn.getIp66601UserT() - 1)), new String(methodIn.getIp66601UserTagStatus(methodIn.getIp66601UserT() - 1))); 
//  DISPLAY '....... VALUES WITH IP66601-USER-LEFT INDEX   ' IP66601-USER-TAG-TYPE ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-LEFT )
          logger.info("....... VALUES WITH IP66601-USER-LEFT INDEX   {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(methodIn.getIp66601UserTagType(methodIn.getIp66601UserLeft() - 1)), String.valueOf(methodIn.getIp66601UserTagNo(methodIn.getIp66601UserLeft() - 1)), String.valueOf(methodOut.getIp66601UserTagOccurrence(methodIn.getIp66601UserLeft() - 1)), String.valueOf(methodIn.getIp66601UserTagSubfldNo(methodIn.getIp66601UserLeft() - 1)), String.valueOf(methodIn.getIp66601UserTagStart(methodIn.getIp66601UserLeft() - 1)), String.valueOf(methodIn.getIp66601UserTagLngth(methodIn.getIp66601UserLeft() - 1)), new String(methodIn.getIp66601UserTagStatus(methodIn.getIp66601UserLeft() - 1))); 
//  DISPLAY '....... VALUES WITH IP66601-USER-RIGHT INDEX  ' IP66601-USER-TAG-TYPE ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-RIGHT )
          logger.info("....... VALUES WITH IP66601-USER-RIGHT INDEX  {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(methodIn.getIp66601UserTagType(methodIn.getIp66601UserRight() - 1)), String.valueOf(methodIn.getIp66601UserTagNo(methodIn.getIp66601UserRight() - 1)), String.valueOf(methodOut.getIp66601UserTagOccurrence(methodIn.getIp66601UserRight() - 1)), String.valueOf(methodIn.getIp66601UserTagSubfldNo(methodIn.getIp66601UserRight() - 1)), String.valueOf(methodIn.getIp66601UserTagStart(methodIn.getIp66601UserRight() - 1)), String.valueOf(methodIn.getIp66601UserTagLngth(methodIn.getIp66601UserRight() - 1)), new String(methodIn.getIp66601UserTagStatus(methodIn.getIp66601UserRight() - 1))); 
//  DISPLAY '....... VALUES WITH IP66601-USER-MEDIAN INDEX ' IP66601-USER-TAG-TYPE ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-MEDIAN )
          logger.info("....... VALUES WITH IP66601-USER-MEDIAN INDEX {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(methodIn.getIp66601UserTagType(methodOut.getIp66601UserMedian() - 1)), String.valueOf(methodIn.getIp66601UserTagNo(methodOut.getIp66601UserMedian() - 1)), String.valueOf(methodOut.getIp66601UserTagOccurrence(methodOut.getIp66601UserMedian() - 1)), String.valueOf(methodIn.getIp66601UserTagSubfldNo(methodOut.getIp66601UserMedian() - 1)), String.valueOf(methodIn.getIp66601UserTagStart(methodOut.getIp66601UserMedian() - 1)), String.valueOf(methodIn.getIp66601UserTagLngth(methodOut.getIp66601UserMedian() - 1)), new String(methodIn.getIp66601UserTagStatus(methodOut.getIp66601UserMedian() - 1))); 
//  DISPLAY '....... VALUES WITH IP66601-USER-START INDEX  ' IP66601-USER-TAG-TYPE ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-START )
          logger.info("....... VALUES WITH IP66601-USER-START INDEX  {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(methodIn.getIp66601UserTagType(methodIn.getIp66601UserStart() - 1)), String.valueOf(methodIn.getIp66601UserTagNo(methodIn.getIp66601UserStart() - 1)), String.valueOf(methodOut.getIp66601UserTagOccurrence(methodIn.getIp66601UserStart() - 1)), String.valueOf(methodIn.getIp66601UserTagSubfldNo(methodIn.getIp66601UserStart() - 1)), String.valueOf(methodIn.getIp66601UserTagStart(methodIn.getIp66601UserStart() - 1)), String.valueOf(methodIn.getIp66601UserTagLngth(methodIn.getIp66601UserStart() - 1)), new String(methodIn.getIp66601UserTagStatus(methodIn.getIp66601UserStart() - 1))); 
//  DISPLAY '....... VALUES WITH IP66601-USER-END INDEX    ' IP66601-USER-TAG-TYPE ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-END )
          logger.info("....... VALUES WITH IP66601-USER-END INDEX    {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(methodIn.getIp66601UserTagType(methodIn.getIp66601UserEnd() - 1)), String.valueOf(methodIn.getIp66601UserTagNo(methodIn.getIp66601UserEnd() - 1)), String.valueOf(methodOut.getIp66601UserTagOccurrence(methodIn.getIp66601UserEnd() - 1)), String.valueOf(methodIn.getIp66601UserTagSubfldNo(methodIn.getIp66601UserEnd() - 1)), String.valueOf(methodIn.getIp66601UserTagStart(methodIn.getIp66601UserEnd() - 1)), String.valueOf(methodIn.getIp66601UserTagLngth(methodIn.getIp66601UserEnd() - 1)), new String(methodIn.getIp66601UserTagStatus(methodIn.getIp66601UserEnd() - 1))); 
          ;
      
      return methodOut;
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
      @Override
      public Search0500OutCtx search0500(Search0500InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			boolean keepSearching = true;
			int[] searchIndexes = null;
			int searchLowPoint = 0;
			int searchMidPoint = 0;
			int searchHighPoint = 0;
			int searchCompare = 0;
			// End of variable declaration

      
// *

// *
Search3Ctx programCtx = methodIn.getSearch3Ctx();
Search0500OutCtx methodOut = methodIn.getSearch0500OutCtx();
//  SET IP66601-USER-T TO 1
          methodOut.setIp66601UserT(1); 
          
//  MOVE 1 TO WS-IP66601-USER-TAG-TYPE
          methodOut.setIp66601UserTagType01(1);
//  MOVE 10 TO WS-IP66601-USER-TAG-NO
          methodOut.setIp66601UserTagNo01(10);
//  MOVE 11 TO WS-IP66601-USER-TAG-OCCURRENCE
          methodOut.setIp66601UserTagOccurrence01(11);
//  MOVE 12 TO WS-IP66601-USER-TAG-SUBFLD-NO
          methodOut.setIp66601UserTagSubfldNo01(12);
          // MOVE 13 TO WS-IP66601-USER-TAG-START
          methodOut.setIp66601UserTagStart01((short)13);
          // MOVE 14 TO WS-IP66601-USER-TAG-LNGTH
          methodOut.setIp66601UserTagLngth01((short)14);
          // MOVE 'A' TO WS-IP66601-USER-TAG-STATUS
          //  LITERAL_A = 'A'
          methodOut.setIp66601UserTagStatus01(CONSTANTS.LITERAL_A);
//  SET ENTRY-NOT-FOUND-N TO TRUE
          methodOut.setEntryNotFoundNTrue(); 
          

// *
//  SEARCH IP66601-USER-TAG
          keepSearching = true;
          while(keepSearching) {
          	if  (	( methodIn.getIp66601UserTagType(methodOut.getIp66601UserT() - 1) == methodOut.getIp66601UserTagType01() ) && 	( methodIn.getIp66601UserTagNo(methodOut.getIp66601UserT() - 1) == methodOut.getIp66601UserTagNo01() ) && 	( methodIn.getIp66601UserTagOccurrence(methodOut.getIp66601UserT() - 1) == methodOut.getIp66601UserTagOccurrence01() ) && 	( methodIn.getIp66601UserTagSubfldNo(methodOut.getIp66601UserT() - 1) == methodOut.getIp66601UserTagSubfldNo01() ) && 	( methodIn.getIp66601UserTagStart(methodOut.getIp66601UserT() - 1) == methodOut.getIp66601UserTagStart01() ) && 	( methodIn.getIp66601UserTagLngth(methodOut.getIp66601UserT() - 1) == methodOut.getIp66601UserTagLngth01() ) && 		compareChars(methodIn.getIp66601UserTagStatus(methodOut.getIp66601UserT() - 1),methodOut.getIp66601UserTagStatus01()) == 0 ) { 
//  SET ENTRY-FOUND-Y TO TRUE
              methodOut.setEntryFoundYTrue(); 
              
//  DISPLAY 'MATCHING ENTRY FOUND!!'
              logger.info("MATCHING ENTRY FOUND!!"); 
          	break;
          	}
          	methodOut.setIp66601UserT(methodOut.getIp66601UserT() + 1);
          	if (methodOut.getIp66601UserT() > 700) { 
          	 keepSearching = false;
          	}
          }
//  IF ENTRY-FOUND-Y
          if ( methodOut.isEntryFoundY()  ) { 
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
          logger.info("....... VALUES WITH IP66601-USER-P INDEX      {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(methodIn.getIp66601UserTagType(methodIn.getIp66601UserP() - 1)), String.valueOf(methodIn.getIp66601UserTagNo(methodIn.getIp66601UserP() - 1)), String.valueOf(methodIn.getIp66601UserTagOccurrence(methodIn.getIp66601UserP() - 1)), String.valueOf(methodIn.getIp66601UserTagSubfldNo(methodIn.getIp66601UserP() - 1)), String.valueOf(methodIn.getIp66601UserTagStart(methodIn.getIp66601UserP() - 1)), String.valueOf(methodIn.getIp66601UserTagLngth(methodIn.getIp66601UserP() - 1)), new String(methodIn.getIp66601UserTagStatus(methodIn.getIp66601UserP() - 1))); 
//  DISPLAY '....... VALUES WITH IP66601-USER-T INDEX      ' IP66601-USER-TAG-TYPE ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-T )
          logger.info("....... VALUES WITH IP66601-USER-T INDEX      {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(methodIn.getIp66601UserTagType(methodOut.getIp66601UserT() - 1)), String.valueOf(methodIn.getIp66601UserTagNo(methodOut.getIp66601UserT() - 1)), String.valueOf(methodIn.getIp66601UserTagOccurrence(methodOut.getIp66601UserT() - 1)), String.valueOf(methodIn.getIp66601UserTagSubfldNo(methodOut.getIp66601UserT() - 1)), String.valueOf(methodIn.getIp66601UserTagStart(methodOut.getIp66601UserT() - 1)), String.valueOf(methodIn.getIp66601UserTagLngth(methodOut.getIp66601UserT() - 1)), new String(methodIn.getIp66601UserTagStatus(methodOut.getIp66601UserT() - 1))); 
//  DISPLAY '....... VALUES WITH IP66601-USER-LEFT INDEX   ' IP66601-USER-TAG-TYPE ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-LEFT )
          logger.info("....... VALUES WITH IP66601-USER-LEFT INDEX   {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(methodIn.getIp66601UserTagType(methodIn.getIp66601UserLeft() - 1)), String.valueOf(methodIn.getIp66601UserTagNo(methodIn.getIp66601UserLeft() - 1)), String.valueOf(methodIn.getIp66601UserTagOccurrence(methodIn.getIp66601UserLeft() - 1)), String.valueOf(methodIn.getIp66601UserTagSubfldNo(methodIn.getIp66601UserLeft() - 1)), String.valueOf(methodIn.getIp66601UserTagStart(methodIn.getIp66601UserLeft() - 1)), String.valueOf(methodIn.getIp66601UserTagLngth(methodIn.getIp66601UserLeft() - 1)), new String(methodIn.getIp66601UserTagStatus(methodIn.getIp66601UserLeft() - 1))); 
//  DISPLAY '....... VALUES WITH IP66601-USER-RIGHT INDEX  ' IP66601-USER-TAG-TYPE ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-RIGHT )
          logger.info("....... VALUES WITH IP66601-USER-RIGHT INDEX  {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(methodIn.getIp66601UserTagType(methodIn.getIp66601UserRight() - 1)), String.valueOf(methodIn.getIp66601UserTagNo(methodIn.getIp66601UserRight() - 1)), String.valueOf(methodIn.getIp66601UserTagOccurrence(methodIn.getIp66601UserRight() - 1)), String.valueOf(methodIn.getIp66601UserTagSubfldNo(methodIn.getIp66601UserRight() - 1)), String.valueOf(methodIn.getIp66601UserTagStart(methodIn.getIp66601UserRight() - 1)), String.valueOf(methodIn.getIp66601UserTagLngth(methodIn.getIp66601UserRight() - 1)), new String(methodIn.getIp66601UserTagStatus(methodIn.getIp66601UserRight() - 1))); 
//  DISPLAY '....... VALUES WITH IP66601-USER-MEDIAN INDEX ' IP66601-USER-TAG-TYPE ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-MEDIAN )
          logger.info("....... VALUES WITH IP66601-USER-MEDIAN INDEX {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(methodIn.getIp66601UserTagType(methodIn.getIp66601UserMedian() - 1)), String.valueOf(methodIn.getIp66601UserTagNo(methodIn.getIp66601UserMedian() - 1)), String.valueOf(methodIn.getIp66601UserTagOccurrence(methodIn.getIp66601UserMedian() - 1)), String.valueOf(methodIn.getIp66601UserTagSubfldNo(methodIn.getIp66601UserMedian() - 1)), String.valueOf(methodIn.getIp66601UserTagStart(methodIn.getIp66601UserMedian() - 1)), String.valueOf(methodIn.getIp66601UserTagLngth(methodIn.getIp66601UserMedian() - 1)), new String(methodIn.getIp66601UserTagStatus(methodIn.getIp66601UserMedian() - 1))); 
//  DISPLAY '....... VALUES WITH IP66601-USER-START INDEX  ' IP66601-USER-TAG-TYPE ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-START )
          logger.info("....... VALUES WITH IP66601-USER-START INDEX  {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(methodIn.getIp66601UserTagType(methodIn.getIp66601UserStart() - 1)), String.valueOf(methodIn.getIp66601UserTagNo(methodIn.getIp66601UserStart() - 1)), String.valueOf(methodIn.getIp66601UserTagOccurrence(methodIn.getIp66601UserStart() - 1)), String.valueOf(methodIn.getIp66601UserTagSubfldNo(methodIn.getIp66601UserStart() - 1)), String.valueOf(methodIn.getIp66601UserTagStart(methodIn.getIp66601UserStart() - 1)), String.valueOf(methodIn.getIp66601UserTagLngth(methodIn.getIp66601UserStart() - 1)), new String(methodIn.getIp66601UserTagStatus(methodIn.getIp66601UserStart() - 1))); 
//  DISPLAY '....... VALUES WITH IP66601-USER-END INDEX    ' IP66601-USER-TAG-TYPE ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-END )
          logger.info("....... VALUES WITH IP66601-USER-END INDEX    {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(methodIn.getIp66601UserTagType(methodIn.getIp66601UserEnd() - 1)), String.valueOf(methodIn.getIp66601UserTagNo(methodIn.getIp66601UserEnd() - 1)), String.valueOf(methodIn.getIp66601UserTagOccurrence(methodIn.getIp66601UserEnd() - 1)), String.valueOf(methodIn.getIp66601UserTagSubfldNo(methodIn.getIp66601UserEnd() - 1)), String.valueOf(methodIn.getIp66601UserTagStart(methodIn.getIp66601UserEnd() - 1)), String.valueOf(methodIn.getIp66601UserTagLngth(methodIn.getIp66601UserEnd() - 1)), new String(methodIn.getIp66601UserTagStatus(methodIn.getIp66601UserEnd() - 1))); 

// *
          // MOVE 'I' TO WS-IP66601-USER-TAG-STATUS
          //  LITERAL_I = 'I'
          methodOut.setIp66601UserTagStatus01(CONSTANTS.LITERAL_I);
//  SET ENTRY-NOT-FOUND-N TO TRUE
          methodOut.setEntryNotFoundNTrue(); 
          

// *
//  SEARCH IP66601-USER-TAG
          keepSearching = true;
          while(keepSearching) {
          	if  (	( methodIn.getIp66601UserTagType(methodOut.getIp66601UserT() - 1) == methodOut.getIp66601UserTagType01() ) && 	( methodIn.getIp66601UserTagNo(methodOut.getIp66601UserT() - 1) == methodOut.getIp66601UserTagNo01() ) && 	( methodIn.getIp66601UserTagOccurrence(methodOut.getIp66601UserT() - 1) == methodOut.getIp66601UserTagOccurrence01() ) && 	( methodIn.getIp66601UserTagSubfldNo(methodOut.getIp66601UserT() - 1) == methodOut.getIp66601UserTagSubfldNo01() ) && 	( methodIn.getIp66601UserTagStart(methodOut.getIp66601UserT() - 1) == methodOut.getIp66601UserTagStart01() ) && 	( methodIn.getIp66601UserTagLngth(methodOut.getIp66601UserT() - 1) == methodOut.getIp66601UserTagLngth01() ) && 		compareChars(methodIn.getIp66601UserTagStatus(methodOut.getIp66601UserT() - 1),methodOut.getIp66601UserTagStatus01()) == 0 ) { 
//  SET ENTRY-FOUND-Y TO TRUE
              methodOut.setEntryFoundYTrue(); 
              
//  DISPLAY 'MATCHING ENTRY FOUND!!'
              logger.info("MATCHING ENTRY FOUND!!"); 
          	break;
          	}
          	methodOut.setIp66601UserT(methodOut.getIp66601UserT() + 1);
          	if (methodOut.getIp66601UserT() > 700) { 
          	 keepSearching = false;
          	}
          }
//  IF ENTRY-NOT-FOUND-N
          if ( methodOut.isEntryNotFoundN()  ) { 
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
          logger.info("....... VALUES WITH IP66601-USER-P INDEX      {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(methodIn.getIp66601UserTagType(methodIn.getIp66601UserP() - 1)), String.valueOf(methodIn.getIp66601UserTagNo(methodIn.getIp66601UserP() - 1)), String.valueOf(methodIn.getIp66601UserTagOccurrence(methodIn.getIp66601UserP() - 1)), String.valueOf(methodIn.getIp66601UserTagSubfldNo(methodIn.getIp66601UserP() - 1)), String.valueOf(methodIn.getIp66601UserTagStart(methodIn.getIp66601UserP() - 1)), String.valueOf(methodIn.getIp66601UserTagLngth(methodIn.getIp66601UserP() - 1)), new String(methodIn.getIp66601UserTagStatus(methodIn.getIp66601UserP() - 1))); 
//  IF IP66601-USER-T <= 700 THEN
          if (	( methodOut.getIp66601UserT() <= 700 )) { 
//  DISPLAY '....... VALUES WITH IP66601-USER-T INDEX      ' IP66601-USER-TAG-TYPE ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-T ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-T )
              logger.info("....... VALUES WITH IP66601-USER-T INDEX      {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(methodIn.getIp66601UserTagType(methodOut.getIp66601UserT() - 1)), String.valueOf(methodIn.getIp66601UserTagNo(methodOut.getIp66601UserT() - 1)), String.valueOf(methodIn.getIp66601UserTagOccurrence(methodOut.getIp66601UserT() - 1)), String.valueOf(methodIn.getIp66601UserTagSubfldNo(methodOut.getIp66601UserT() - 1)), String.valueOf(methodIn.getIp66601UserTagStart(methodOut.getIp66601UserT() - 1)), String.valueOf(methodIn.getIp66601UserTagLngth(methodOut.getIp66601UserT() - 1)), new String(methodIn.getIp66601UserTagStatus(methodOut.getIp66601UserT() - 1))); 
          }
//  DISPLAY '....... VALUES WITH IP66601-USER-LEFT INDEX   ' IP66601-USER-TAG-TYPE ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-LEFT ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-LEFT )
          logger.info("....... VALUES WITH IP66601-USER-LEFT INDEX   {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(methodIn.getIp66601UserTagType(methodIn.getIp66601UserLeft() - 1)), String.valueOf(methodIn.getIp66601UserTagNo(methodIn.getIp66601UserLeft() - 1)), String.valueOf(methodIn.getIp66601UserTagOccurrence(methodIn.getIp66601UserLeft() - 1)), String.valueOf(methodIn.getIp66601UserTagSubfldNo(methodIn.getIp66601UserLeft() - 1)), String.valueOf(methodIn.getIp66601UserTagStart(methodIn.getIp66601UserLeft() - 1)), String.valueOf(methodIn.getIp66601UserTagLngth(methodIn.getIp66601UserLeft() - 1)), new String(methodIn.getIp66601UserTagStatus(methodIn.getIp66601UserLeft() - 1))); 
//  DISPLAY '....... VALUES WITH IP66601-USER-RIGHT INDEX  ' IP66601-USER-TAG-TYPE ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-RIGHT ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-RIGHT )
          logger.info("....... VALUES WITH IP66601-USER-RIGHT INDEX  {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(methodIn.getIp66601UserTagType(methodIn.getIp66601UserRight() - 1)), String.valueOf(methodIn.getIp66601UserTagNo(methodIn.getIp66601UserRight() - 1)), String.valueOf(methodIn.getIp66601UserTagOccurrence(methodIn.getIp66601UserRight() - 1)), String.valueOf(methodIn.getIp66601UserTagSubfldNo(methodIn.getIp66601UserRight() - 1)), String.valueOf(methodIn.getIp66601UserTagStart(methodIn.getIp66601UserRight() - 1)), String.valueOf(methodIn.getIp66601UserTagLngth(methodIn.getIp66601UserRight() - 1)), new String(methodIn.getIp66601UserTagStatus(methodIn.getIp66601UserRight() - 1))); 
//  DISPLAY '....... VALUES WITH IP66601-USER-MEDIAN INDEX ' IP66601-USER-TAG-TYPE ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-MEDIAN ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-MEDIAN )
          logger.info("....... VALUES WITH IP66601-USER-MEDIAN INDEX {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(methodIn.getIp66601UserTagType(methodIn.getIp66601UserMedian() - 1)), String.valueOf(methodIn.getIp66601UserTagNo(methodIn.getIp66601UserMedian() - 1)), String.valueOf(methodIn.getIp66601UserTagOccurrence(methodIn.getIp66601UserMedian() - 1)), String.valueOf(methodIn.getIp66601UserTagSubfldNo(methodIn.getIp66601UserMedian() - 1)), String.valueOf(methodIn.getIp66601UserTagStart(methodIn.getIp66601UserMedian() - 1)), String.valueOf(methodIn.getIp66601UserTagLngth(methodIn.getIp66601UserMedian() - 1)), new String(methodIn.getIp66601UserTagStatus(methodIn.getIp66601UserMedian() - 1))); 
//  DISPLAY '....... VALUES WITH IP66601-USER-START INDEX  ' IP66601-USER-TAG-TYPE ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-START ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-START )
          logger.info("....... VALUES WITH IP66601-USER-START INDEX  {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(methodIn.getIp66601UserTagType(methodIn.getIp66601UserStart() - 1)), String.valueOf(methodIn.getIp66601UserTagNo(methodIn.getIp66601UserStart() - 1)), String.valueOf(methodIn.getIp66601UserTagOccurrence(methodIn.getIp66601UserStart() - 1)), String.valueOf(methodIn.getIp66601UserTagSubfldNo(methodIn.getIp66601UserStart() - 1)), String.valueOf(methodIn.getIp66601UserTagStart(methodIn.getIp66601UserStart() - 1)), String.valueOf(methodIn.getIp66601UserTagLngth(methodIn.getIp66601UserStart() - 1)), new String(methodIn.getIp66601UserTagStatus(methodIn.getIp66601UserStart() - 1))); 
//  DISPLAY '....... VALUES WITH IP66601-USER-END INDEX    ' IP66601-USER-TAG-TYPE ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-NO ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-OCCURRENCE ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-SUBFLD-NO ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-START ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-LNGTH ( IP66601-USER-END ) ' ** ' IP66601-USER-TAG-STATUS ( IP66601-USER-END )
          logger.info("....... VALUES WITH IP66601-USER-END INDEX    {} ** {} ** {} ** {} ** {} ** {} ** {}", String.valueOf(methodIn.getIp66601UserTagType(methodIn.getIp66601UserEnd() - 1)), String.valueOf(methodIn.getIp66601UserTagNo(methodIn.getIp66601UserEnd() - 1)), String.valueOf(methodIn.getIp66601UserTagOccurrence(methodIn.getIp66601UserEnd() - 1)), String.valueOf(methodIn.getIp66601UserTagSubfldNo(methodIn.getIp66601UserEnd() - 1)), String.valueOf(methodIn.getIp66601UserTagStart(methodIn.getIp66601UserEnd() - 1)), String.valueOf(methodIn.getIp66601UserTagLngth(methodIn.getIp66601UserEnd() - 1)), new String(methodIn.getIp66601UserTagStatus(methodIn.getIp66601UserEnd() - 1))); 

// *
// * Build ws-table-group using ref mod and then do search all
// *
//  MOVE SPACES TO WS-TABLE (1 : 100)
          methodOut.getTable().replace(CONSTANTS.SPACE_100,0,100/* length */,0,100 /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  DISPLAY '  '
          logger.info("  "); 
          // MOVE 1 TO WS-START
          methodOut.setStart((short)1);
          // MOVE 6 TO WS-LEN
          methodOut.setLen((short)6);
//  PERFORM VARYING WS-I FROM 1 BY 1 UNTIL WS-I > 100
          for (methodOut.setI(1); (	( methodOut.getI() <= 100 ) ) ; methodOut.setI(methodOut.getI() + 1) ) {
//  MOVE 'AB' TO WS-SRCH-VAR-1
//  LITERAL_AB = 'AB'
              methodOut.setSrchVar1(CONSTANTS.LITERAL_AB);
//  MOVE WS-I TO WS-SRCH-VAR-2
              methodOut.setSrchVar2(methodOut.getI());
//  MOVE WS-SRCH-VAR TO WS-TABLE-GROUP ( WS-START : WS-LEN )
              methodOut.getTableGroup().replace(methodOut.getSrchVar().getCharArray(),0,methodOut.getSrchVar().length(),(methodOut.getStart()-1),methodOut.getLen() /* replace,sourceIndex,sourceLen,targetIndex,targetLen */);
//  ADD WS-LEN TO WS-START
              methodOut.setStart( (short) (methodOut.getStart()+methodOut.getLen()));
          }
//  MOVE 'AB' TO WS-SRCH-VAR-1
//  LITERAL_AB = 'AB'
          methodOut.setSrchVar1(CONSTANTS.LITERAL_AB);
          // MOVE 59 TO WS-SRCH-VAR-2
          methodOut.setSrchVar2(59);
//  SEARCH ALL WS-TABLE-ENTRY
          // Binary Search through methodOut.getTable().tableEntry
          searchLowPoint = 0; //prevLowValue
          searchHighPoint = methodOut.getTable().tableEntrySize(); //prevHighValue
          searchMidPoint = searchHighPoint / 2; //starting at mid point
          searchIndexes = new int[]{searchLowPoint,searchMidPoint,searchHighPoint};
          keepSearching = true;
          while (keepSearching) {
          // compare logic below
             searchCompare = compareAscending(methodOut.getVar1(searchMidPoint),methodOut.getSrchVar1());
             if (searchCompare == 0) 
             searchCompare = compareAscending(methodOut.getVar2(searchMidPoint) , methodOut.getSrchVar2());
          // end of compare logic
          	if (searchCompare == 0 ) { // if search found
          	      keepSearching = false;
          	     methodOut.setTableIndex(searchMidPoint + 1);
//  DISPLAY 'SEARCH VALUE ' WS-SRCH-VAR-1 WS-SRCH-VAR-2 ' FOUND'
              logger.info("SEARCH VALUE {}{} FOUND", new String(methodOut.getSrchVar1()), String.valueOf(methodOut.getSrchVar2())); 
          	} else  {
          		adjustSearchIndex(searchCompare,searchIndexes);
          		searchLowPoint  = searchIndexes[0];
           		searchMidPoint  = searchIndexes[1];
           		searchHighPoint = searchIndexes[2];
           		if (searchMidPoint == -1) { // search exhausted
           		    keepSearching = false; 
//  DISPLAY 'SEARCH VALUE ' WS-SRCH-VAR-1 WS-SRCH-VAR-2 ' NOT FOUND'
              logger.info("SEARCH VALUE {}{} NOT FOUND", new String(methodOut.getSrchVar1()), String.valueOf(methodOut.getSrchVar2())); 
           		}
          	}
          }
//  MOVE 'AB' TO WS-SRCH-VAR-1
//  LITERAL_AB = 'AB'
          methodOut.setSrchVar1(CONSTANTS.LITERAL_AB);
          // MOVE 01 TO WS-SRCH-VAR-2
          methodOut.setSrchVar2(1);
//  SEARCH ALL WS-TABLE-ENTRY
          // Binary Search through methodOut.getTable().tableEntry
          searchLowPoint = 0; //prevLowValue
          searchHighPoint = methodOut.getTable().tableEntrySize(); //prevHighValue
          searchMidPoint = searchHighPoint / 2; //starting at mid point
          searchIndexes = new int[]{searchLowPoint,searchMidPoint,searchHighPoint};
          keepSearching = true;
          while (keepSearching) {
          // compare logic below
             searchCompare = compareAscending(methodOut.getVar1(searchMidPoint),methodOut.getSrchVar1());
             if (searchCompare == 0) 
             searchCompare = compareAscending(methodOut.getVar2(searchMidPoint) , methodOut.getSrchVar2());
          // end of compare logic
          	if (searchCompare == 0 ) { // if search found
          	      keepSearching = false;
          	     methodOut.setTableIndex(searchMidPoint + 1);
//  DISPLAY 'SEARCH VALUE ' WS-SRCH-VAR-1 WS-SRCH-VAR-2 ' FOUND'
              logger.info("SEARCH VALUE {}{} FOUND", new String(methodOut.getSrchVar1()), String.valueOf(methodOut.getSrchVar2())); 
          	} else  {
          		adjustSearchIndex(searchCompare,searchIndexes);
          		searchLowPoint  = searchIndexes[0];
           		searchMidPoint  = searchIndexes[1];
           		searchHighPoint = searchIndexes[2];
           		if (searchMidPoint == -1) { // search exhausted
           		    keepSearching = false; 
//  DISPLAY 'SEARCH VALUE ' WS-SRCH-VAR-1 WS-SRCH-VAR-2 ' NOT FOUND'
              logger.info("SEARCH VALUE {}{} NOT FOUND", new String(methodOut.getSrchVar1()), String.valueOf(methodOut.getSrchVar2())); 
           		}
          	}
          }
//  MOVE 'AB' TO WS-SRCH-VAR-1
//  LITERAL_AB = 'AB'
          methodOut.setSrchVar1(CONSTANTS.LITERAL_AB);
          // MOVE 100 TO WS-SRCH-VAR-2
          methodOut.setSrchVar2(100);
//  SEARCH ALL WS-TABLE-ENTRY
          // Binary Search through methodOut.getTable().tableEntry
          searchLowPoint = 0; //prevLowValue
          searchHighPoint = methodOut.getTable().tableEntrySize(); //prevHighValue
          searchMidPoint = searchHighPoint / 2; //starting at mid point
          searchIndexes = new int[]{searchLowPoint,searchMidPoint,searchHighPoint};
          keepSearching = true;
          while (keepSearching) {
          // compare logic below
             searchCompare = compareAscending(methodOut.getVar1(searchMidPoint),methodOut.getSrchVar1());
             if (searchCompare == 0) 
             searchCompare = compareAscending(methodOut.getVar2(searchMidPoint) , methodOut.getSrchVar2());
          // end of compare logic
          	if (searchCompare == 0 ) { // if search found
          	      keepSearching = false;
          	     methodOut.setTableIndex(searchMidPoint + 1);
//  DISPLAY 'SEARCH VALUE ' WS-SRCH-VAR-1 WS-SRCH-VAR-2 ' FOUND'
              logger.info("SEARCH VALUE {}{} FOUND", new String(methodOut.getSrchVar1()), String.valueOf(methodOut.getSrchVar2())); 
          	} else  {
          		adjustSearchIndex(searchCompare,searchIndexes);
          		searchLowPoint  = searchIndexes[0];
           		searchMidPoint  = searchIndexes[1];
           		searchHighPoint = searchIndexes[2];
           		if (searchMidPoint == -1) { // search exhausted
           		    keepSearching = false; 
//  DISPLAY 'SEARCH VALUE ' WS-SRCH-VAR-1 WS-SRCH-VAR-2 ' NOT FOUND'
              logger.info("SEARCH VALUE {}{} NOT FOUND", new String(methodOut.getSrchVar1()), String.valueOf(methodOut.getSrchVar2())); 
           		}
          	}
          }
//  MOVE 'AB' TO WS-SRCH-VAR-1
//  LITERAL_AB = 'AB'
          methodOut.setSrchVar1(CONSTANTS.LITERAL_AB);
          // MOVE 000 TO WS-SRCH-VAR-2
          methodOut.setSrchVar2(0);
//  SEARCH ALL WS-TABLE-ENTRY
          // Binary Search through methodOut.getTable().tableEntry
          searchLowPoint = 0; //prevLowValue
          searchHighPoint = methodOut.getTable().tableEntrySize(); //prevHighValue
          searchMidPoint = searchHighPoint / 2; //starting at mid point
          searchIndexes = new int[]{searchLowPoint,searchMidPoint,searchHighPoint};
          keepSearching = true;
          while (keepSearching) {
          // compare logic below
             searchCompare = compareAscending(methodOut.getVar1(searchMidPoint),methodOut.getSrchVar1());
             if (searchCompare == 0) 
             searchCompare = compareAscending(methodOut.getVar2(searchMidPoint) , methodOut.getSrchVar2());
          // end of compare logic
          	if (searchCompare == 0 ) { // if search found
          	      keepSearching = false;
          	     methodOut.setTableIndex(searchMidPoint + 1);
//  DISPLAY 'SEARCH VALUE ' WS-SRCH-VAR-1 WS-SRCH-VAR-2 ' FOUND'
              logger.info("SEARCH VALUE {}{} FOUND", new String(methodOut.getSrchVar1()), String.valueOf(methodOut.getSrchVar2())); 
          	} else  {
          		adjustSearchIndex(searchCompare,searchIndexes);
          		searchLowPoint  = searchIndexes[0];
           		searchMidPoint  = searchIndexes[1];
           		searchHighPoint = searchIndexes[2];
           		if (searchMidPoint == -1) { // search exhausted
           		    keepSearching = false; 
//  DISPLAY 'SEARCH VALUE ' WS-SRCH-VAR-1 WS-SRCH-VAR-2 ' NOT FOUND'
              logger.info("SEARCH VALUE {}{} NOT FOUND", new String(methodOut.getSrchVar1()), String.valueOf(methodOut.getSrchVar2())); 
           		}
          	}
          }
//  MOVE 'AB' TO WS-SRCH-VAR-1
//  LITERAL_AB = 'AB'
          methodOut.setSrchVar1(CONSTANTS.LITERAL_AB);
          // MOVE 101 TO WS-SRCH-VAR-2
          methodOut.setSrchVar2(101);
//  SEARCH ALL WS-TABLE-ENTRY
          // Binary Search through methodOut.getTable().tableEntry
          searchLowPoint = 0; //prevLowValue
          searchHighPoint = methodOut.getTable().tableEntrySize(); //prevHighValue
          searchMidPoint = searchHighPoint / 2; //starting at mid point
          searchIndexes = new int[]{searchLowPoint,searchMidPoint,searchHighPoint};
          keepSearching = true;
          while (keepSearching) {
          // compare logic below
             searchCompare = compareAscending(methodOut.getVar1(searchMidPoint),methodOut.getSrchVar1());
             if (searchCompare == 0) 
             searchCompare = compareAscending(methodOut.getVar2(searchMidPoint) , methodOut.getSrchVar2());
          // end of compare logic
          	if (searchCompare == 0 ) { // if search found
          	      keepSearching = false;
          	     methodOut.setTableIndex(searchMidPoint + 1);
//  DISPLAY 'SEARCH VALUE ' WS-SRCH-VAR-1 WS-SRCH-VAR-2 ' FOUND'
              logger.info("SEARCH VALUE {}{} FOUND", new String(methodOut.getSrchVar1()), String.valueOf(methodOut.getSrchVar2())); 
          	} else  {
          		adjustSearchIndex(searchCompare,searchIndexes);
          		searchLowPoint  = searchIndexes[0];
           		searchMidPoint  = searchIndexes[1];
           		searchHighPoint = searchIndexes[2];
           		if (searchMidPoint == -1) { // search exhausted
           		    keepSearching = false; 
//  DISPLAY 'SEARCH VALUE ' WS-SRCH-VAR-1 WS-SRCH-VAR-2 ' NOT FOUND'
              logger.info("SEARCH VALUE {}{} NOT FOUND", new String(methodOut.getSrchVar1()), String.valueOf(methodOut.getSrchVar2())); 
           		}
          	}
          }
//  DISPLAY 'DOING FULL TABLE SEARCH ..'
          logger.info("DOING FULL TABLE SEARCH .."); 
//  SEARCH WS-TABLE-ENTRY
          keepSearching = true;
          while(keepSearching) {
          	if  (		compareChars(methodOut.getVar1(methodOut.getTableIndex() - 1),methodOut.getSrchVar1()) == 0  && 	( methodOut.getVar2(methodOut.getTableIndex() - 1) == methodOut.getSrchVar2() )) { 
//  DISPLAY 'SEARCH VALUE ' WS-SRCH-VAR-1 WS-SRCH-VAR-2 ' FOUND'
              logger.info("SEARCH VALUE {}{} FOUND", new String(methodOut.getSrchVar1()), String.valueOf(methodOut.getSrchVar2())); 
          	break;
          	}
          	methodOut.setTableIndex(methodOut.getTableIndex() + 1);
          	if (methodOut.getTableIndex() > 100) { 
          	 keepSearching = false;
          	}
          }
          	if(!keepSearching) { 
//  DISPLAY 'SEARCH VALUE ' WS-SRCH-VAR-1 WS-SRCH-VAR-2 ' NOT FOUND'
              logger.info("SEARCH VALUE {}{} NOT FOUND", new String(methodOut.getSrchVar1()), String.valueOf(methodOut.getSrchVar2())); 
          	}
          ;
      
      return methodOut;
      }
  
  
  
  
  
  
  
  
  }
