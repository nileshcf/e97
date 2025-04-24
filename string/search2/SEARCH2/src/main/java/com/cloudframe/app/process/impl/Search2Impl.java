  package com.cloudframe.app.process.impl;
  /* 
*---------------------------------------------
*/
  
  import com.cloudframe.app.search2.Search2Ctx.*;
  import com.cloudframe.app.search2.Search2Ctx;
  import com.cloudframe.app.process.Search2;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.search2.dto.*;
  import com.cloudframe.app.search2.dto.WtFields;
  import com.cloudframe.app.search2.dto.MiscData;
  import com.cloudframe.app.search2.dto.SbidGroupTbl;
  import com.cloudframe.app.search2.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.utility.CFUtil;
  
  @Component("search2")
  
  public class Search2Impl extends CommonProcess implements Search2 {
  
  Logger logger = LoggerFactory.getLogger(Search2Impl.class);
  
  
  
  
  
  
  
  
  
  
      /**
      * process 
      * Input  :  

      * - sub                            COBOL Name: WS-SUB
      * - increment                      COBOL Name: WS-INCREMENT
      * - toggle123                      COBOL Name: WS-123-TOGGLE
      * - i                              COBOL Name: I
      * - sbid                           COBOL Name: WS-SBID
      * - ecp                            COBOL Name: WS-ECP
      * - sbidGroupEntries               COBOL Name: WS-SBID-GROUP-ENTRIES
      *
      * Output :  

      * - initial                        COBOL Name: WS-INITIAL
      * - counter                        COBOL Name: WS-COUNTER
      * - sub                            COBOL Name: WS-SUB
      * - codeValue                      COBOL Name: WS-CODE-VALUE
      * - codeMarker                     COBOL Name: WS-CODE-MARKER
      * - codeToggle                     COBOL Name: WS-CODE-TOGGLE
      * - toggle123                      COBOL Name: WS-123-TOGGLE
      * - sbidCount                      COBOL Name: WS-SBID-COUNT
      * - sbidIndex                      COBOL Name: WS-SBID-INDEX
      * - cmdCaHomeSidBidCode            COBOL Name: CMD-CA-HOME-SID-BID-CODE
      * - i                              COBOL Name: I
      * - tblSbid                        COBOL Name: WS-TBL-SBID
      * - sbid                           COBOL Name: WS-SBID
      * - tblEcp                         COBOL Name: WS-TBL-ECP
      * - ecp                            COBOL Name: WS-ECP
      *
      * @throws CFException
      */
      public int process(Search2Ctx programCtx) throws Exception {
			// Declare local variables used in the method
			boolean keepSearching = true;
			int[] searchIndexes = null;
			int searchLowPoint = 0;
			int searchMidPoint = 0;
			int searchHighPoint = 0;
			int searchCompare = 0;
			// End of variable declaration

       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
ProcessInCtx methodIn = programCtx.getProcessInCtx();
ProcessOutCtx methodOut = methodIn.getProcessOutCtx();

// *    ----
//  MOVE 1000 TO WS-INITIAL
          methodOut.setInitial(1000);
//  MOVE 5901 TO WS-COUNTER
          methodOut.setCounter(5901);
//  PERFORM VARYING WS-SUB FROM 1 BY 1 UNTIL WS-SUB > WS-COUNTER
          for (methodOut.setSub(1); (	( methodOut.getSub() <= methodOut.getCounter() )) ; methodOut.setSub(methodOut.getSub() + 1) ) {
//  ADD WS-INCREMENT TO WS-INITIAL
              methodOut.setInitial(methodOut.getInitial()+methodIn.getIncrement());
//  MOVE WS-INITIAL TO WS-CODE-VALUE ( WS-SUB )
              methodOut.setCodeValue(methodOut.getSub() - 1,(int) methodOut.getInitial());
//  MOVE WS-SUB TO WS-CODE-MARKER ( WS-SUB )
              methodOut.setCodeMarker(methodOut.getSub() - 1, methodOut.getSub());
//  MOVE 1 TO WS-CODE-TOGGLE ( WS-SUB )
              methodOut.setCodeToggle(methodOut.getSub() - 1,1);
//  PERFORM 0005-TOGGLE THROUGH 0005-EXIT
              toggle(programCtx.getToggleInCtx());/*0005-TOGGLE*/
              if (programCtx.isProgramEnded()) {
                  return programCtx.getRc();
              }
//  ADD 1 TO WS-123-TOGGLE
              methodOut.setToggle123( (short) (methodOut.getToggle123()+(short)1));
          }
//  MOVE 1 TO WS-SUB WS-123-TOGGLE
          methodOut.setSub(1);
          methodOut.setToggle123((short)1);
//  DISPLAY 'SEARCH DUPLICATES '
          logger.info("SEARCH DUPLICATES "); 
//  DISPLAY '--------------------'
          logger.info("--------------------"); 
//  PERFORM 0010-FILL-DETAIL THROUGH 0010-EXIT UNTIL WS-SUB > 5901
          while (	( methodOut.getSub() <= 5901 )) {
             fillDetail(programCtx.getFillDetailInCtx());/*0010-FILL-DETAIL*/
             if (programCtx.isProgramEnded()) {
                 return programCtx.getRc();
             }
          }

// *    ----
//  MOVE +26 TO WS-SBID-COUNT
          methodOut.setSbidCount(26);
//  SET WS-SBID-INDEX TO +1
          methodOut.setSbidIndex(1); 
          
          // MOVE '00019' TO CMD-CA-HOME-SID-BID-CODE
          //  LITERAL_00019 = '00019'
          methodOut.setCmdCaHomeSidBidCode(CONSTANTS.LITERAL_00019);
//  PERFORM VARYING I FROM +1 BY +1 UNTIL I > +26
          for (methodOut.setI(1); (	( methodOut.getI() <= 26 ) ) ; methodOut.setI(methodOut.getI() + 1) ) {
//  MOVE WS-SBID (I) TO WS-TBL-SBID ( WS-SBID-INDEX )
              methodOut.setTblSbid(methodOut.getSbidIndex() - 1,methodOut.getSbid(methodOut.getI() - 1));
//  MOVE WS-ECP (I) TO WS-TBL-ECP ( WS-SBID-INDEX )
              methodOut.setTblEcp(methodOut.getSbidIndex() - 1,methodOut.getEcp(methodOut.getI() - 1));
//  SET WS-SBID-INDEX UP BY +1
              methodOut.setSbidIndex(methodOut.getSbidIndex() + 1); 
              
          }
//  SEARCH ALL WS-SBID-GROUP-ENTRIES
          // Binary Search through methodIn.getSbidGroupTbl().sbidGroupEntries
          searchLowPoint = 0; //prevLowValue
          searchHighPoint = methodOut.getSbidCount(); //prevHighValue
          searchMidPoint = searchHighPoint / 2; //starting at mid point
          searchIndexes = new int[]{searchLowPoint,searchMidPoint,searchHighPoint};
          keepSearching = true;
          while (keepSearching) {
          // compare logic below
             searchCompare = compareAscending(methodIn.getSbidGroupEntries(searchMidPoint).getTblSbidString(),methodOut.getCmdCaHomeSidBidCode());
          // end of compare logic
          	if (searchCompare == 0 ) { // if search found
          	      keepSearching = false;
          	     methodOut.setSbidIndex(searchMidPoint + 1);
//  DISPLAY 'CMD-CA-HOME-SID-BID-CODE: ' CMD-CA-HOME-SID-BID-CODE ', found. ECP = ' WS-TBL-ECP ( WS-SBID-INDEX )
              logger.info("CMD-CA-HOME-SID-BID-CODE: {}, found. ECP = {}", new String(methodOut.getCmdCaHomeSidBidCode()), new String(methodOut.getTblEcp(methodOut.getSbidIndex() - 1))); 
          	} else  {
          		adjustSearchIndex(searchCompare,searchIndexes);
          		searchLowPoint  = searchIndexes[0];
           		searchMidPoint  = searchIndexes[1];
           		searchHighPoint = searchIndexes[2];
           		if (searchMidPoint == -1) { // search exhausted
           		    keepSearching = false; 
//  DISPLAY 'CMD-CA-HOME-SID-BID-CODE: ' CMD-CA-HOME-SID-BID-CODE ', NOT found'
              logger.info("CMD-CA-HOME-SID-BID-CODE: {}, NOT found", new String(methodOut.getCmdCaHomeSidBidCode())); 
           		}
          	}
          }

// *    ----

// *    ----
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return programCtx.getRc();
       } catch(Exception e) {
            handleErrorCode(e);
            throw e;
       }
      
      // end of process method
      }
      /**
      * toggle 
      *   This method is derived from 
  *   COBOL Paragraph - 0005-TOGGLE COBOL Cyclomatic complexity - 5
      * Input  :  

      * - toggle123                      COBOL Name: WS-123-TOGGLE
      * - toggleMax                      COBOL Name: WS-TOGGLE-MAX
      * - sub2                           COBOL Name: WS-SUB2
      * - sub                            COBOL Name: WS-SUB
      * - codeValue                      COBOL Name: WS-CODE-VALUE
      *
      * Output :  

      * - sub2                           COBOL Name: WS-SUB2
      * - sub3                           COBOL Name: WS-SUB3
      * - codeValue                      COBOL Name: WS-CODE-VALUE
      * - toggle123                      COBOL Name: WS-123-TOGGLE
      * - toggleMax                      COBOL Name: WS-TOGGLE-MAX
      *
      * @throws CFException
      */
      @Override
      public ToggleOutCtx toggle(ToggleInCtx methodIn) throws Exception {
Search2Ctx programCtx = methodIn.getSearch2Ctx();
ToggleOutCtx methodOut = methodIn.getToggleOutCtx();
//  IF WS-123-TOGGLE > WS-TOGGLE-MAX THEN
          if (	( methodOut.getToggle123() > methodOut.getToggleMax() )) { 
//  PERFORM VARYING WS-SUB2 FROM 1 BY 1 UNTIL WS-SUB2 > WS-TOGGLE-MAX
              for (methodOut.setSub2(1); (	( methodOut.getSub2() <= methodOut.getToggleMax() ) ) ; methodOut.setSub2(methodOut.getSub2() + 1) ) {
//  SUBTRACT WS-SUB2 FROM WS-SUB GIVING WS-SUB3
                  methodOut.setSub3(methodIn.getSub()-methodOut.getSub2());
//  MOVE WS-CODE-VALUE ( WS-SUB ) TO WS-CODE-VALUE ( WS-SUB3 )
                  methodOut.setCodeValue(methodOut.getSub3() - 1,methodOut.getCodeValue(methodIn.getSub() - 1));
              }
              // MOVE ZERO TO WS-123-TOGGLE
              methodOut.setToggle123((short) 0);
//  ADD 1 TO WS-TOGGLE-MAX
              methodOut.setToggleMax( (short) (methodOut.getToggleMax()+(short)1));
//  IF WS-TOGGLE-MAX > 5 THEN
              if (	( methodOut.getToggleMax() > 5 ) ) { 
                  // MOVE 1 TO WS-TOGGLE-MAX
                  methodOut.setToggleMax((short)1);
              }
          }
          ;
      
      return methodOut;
      }
      /**
      * fillDetail 
      *   This method is derived from 
  *   COBOL Paragraph - 0010-FILL-DETAIL COBOL Cyclomatic complexity - 3
      * Input  :  

      * - sub                            COBOL Name: WS-SUB
      * - codeValue                      COBOL Name: WS-CODE-VALUE
      * - codeToggle                     COBOL Name: WS-CODE-TOGGLE
      * - codeMarker                     COBOL Name: WS-CODE-MARKER
      * - toggle123                      COBOL Name: WS-123-TOGGLE
      * - toggleMax                      COBOL Name: WS-TOGGLE-MAX
      *
      * Output :  

      * - searchItem                     COBOL Name: WS-SEARCH-ITEM
      * - toggle123                      COBOL Name: WS-123-TOGGLE
      * - toggleMax                      COBOL Name: WS-TOGGLE-MAX
      * - sub                            COBOL Name: WS-SUB
      *
      * @throws CFException
      */
      @Override
      public FillDetailOutCtx fillDetail(FillDetailInCtx methodIn) throws Exception {
Search2Ctx programCtx = methodIn.getSearch2Ctx();
FillDetailOutCtx methodOut = methodIn.getFillDetailOutCtx();
//  DISPLAY '** ' WS-SUB ' ** ' WS-CODE-VALUE ( WS-SUB ) ' , ' WS-CODE-TOGGLE ( WS-SUB ) ' , ' WS-CODE-MARKER ( WS-SUB )
          logger.info("** {} ** {} , {} , {}", String.valueOf(methodOut.getSub()), String.valueOf(methodIn.getCodeValue(methodOut.getSub() - 1)), String.valueOf(methodIn.getCodeToggle(methodOut.getSub() - 1)), String.valueOf(methodIn.getCodeMarker(methodOut.getSub() - 1))); 
//  IF WS-123-TOGGLE > WS-TOGGLE-MAX THEN
          if (	( methodOut.getToggle123() > methodOut.getToggleMax() )) { 
              methodOut.setSearchItem((long) (Math.abs(methodOut.getSub() * 100 + 1000)));
//  PERFORM 0100-SEARCH-ALL THRU 0100-EXIT
              searchAll(programCtx.getSearchAllInCtx());/*0100-SEARCH-ALL*/
              // MOVE ZERO TO WS-123-TOGGLE
              methodOut.setToggle123((short) 0);
//  ADD 1 TO WS-TOGGLE-MAX
              methodOut.setToggleMax( (short) (methodOut.getToggleMax()+(short)1));
//  IF WS-TOGGLE-MAX > 5 THEN
              if (	( methodOut.getToggleMax() > 5 ) ) { 
                  // MOVE 1 TO WS-TOGGLE-MAX
                  methodOut.setToggleMax((short)1);
              }
          }
//  ADD 1 TO WS-123-TOGGLE WS-SUB
          methodOut.setToggle123( (short) (methodOut.getToggle123()+(short)1));
          methodOut.setSub(methodOut.getSub()+1);
          ;
      
      return methodOut;
      }
      /**
      * fillDetail0011 
      *   This method is derived from 
  *   COBOL Paragraph - 0011-FILL-DETAIL COBOL Cyclomatic complexity - 2
      * Input  :  

      * - toggle123                      COBOL Name: WS-123-TOGGLE
      * - sub                            COBOL Name: WS-SUB
      *
      * Output :  

      * - searchItem                     COBOL Name: WS-SEARCH-ITEM
      * - codeValue                      COBOL Name: WS-CODE-VALUE
      * - toggle123                      COBOL Name: WS-123-TOGGLE
      * - sub                            COBOL Name: WS-SUB
      *
      * @throws CFException
      */
      @Override
      public FillDetail0011OutCtx fillDetail0011(FillDetail0011InCtx methodIn) throws Exception {
      
// *    ----
Search2Ctx programCtx = methodIn.getSearch2Ctx();
FillDetail0011OutCtx methodOut = methodIn.getFillDetail0011OutCtx();
//  IF WS-123-TOGGLE > 3 THEN
          if (	( methodOut.getToggle123() > 3 ) ) { 
              methodOut.setSearchItem((long) (Math.abs(methodOut.getSub() * 100 + 1000)));
//  MOVE WS-SEARCH-ITEM TO WS-CODE-VALUE ( WS-SUB )
              methodOut.setCodeValue(methodOut.getSub() - 1,methodOut.getSearchItem());
//  PERFORM 0100-SEARCH-ALL THRU 0100-EXIT
              searchAll(programCtx.getSearchAllInCtx());/*0100-SEARCH-ALL*/
              // MOVE ZERO TO WS-123-TOGGLE
              methodOut.setToggle123((short) 0);
          }
//  ADD 1 TO WS-123-TOGGLE WS-SUB
          methodOut.setToggle123( (short) (methodOut.getToggle123()+(short)1));
          methodOut.setSub(methodOut.getSub()+1);
          ;
      
      return methodOut;
      }
      /**
      * searchAll 
      *   This method is derived from 
  *   COBOL Paragraph - 0100-SEARCH-ALL COBOL Cyclomatic complexity - 3
      * Input  :  

      * - codeCtrl                       COBOL Name: WS-CODE-CTRL
      * - searchItem                     COBOL Name: WS-SEARCH-ITEM
      * - codeValue                      COBOL Name: WS-CODE-VALUE
      * - codeIndex                      COBOL Name: WS-CODE-INDEX
      * - codeToggle                     COBOL Name: WS-CODE-TOGGLE
      * - toggle123                      COBOL Name: WS-123-TOGGLE
      * - codeMarker                     COBOL Name: WS-CODE-MARKER
      *
      * Output : None 

      * @throws CFException
      */
      @Override
      public void searchAll(SearchAllInCtx methodIn) throws Exception {
			// Declare local variables used in the method
			boolean keepSearching = true;
			int[] searchIndexes = null;
			int searchLowPoint = 0;
			int searchMidPoint = 0;
			int searchHighPoint = 0;
			int searchCompare = 0;
			// End of variable declaration

      
// *    ----
Search2Ctx programCtx = methodIn.getSearch2Ctx();
//  SEARCH ALL WS-CODE-CTRL
          // Binary Search through methodIn.getWtFields().codeCtrl
          searchLowPoint = 0; //prevLowValue
          searchHighPoint = methodIn.getCounter(); //prevHighValue
          searchMidPoint = searchHighPoint / 2; //starting at mid point
          searchIndexes = new int[]{searchLowPoint,searchMidPoint,searchHighPoint};
          keepSearching = true;
          while (keepSearching) {
          // compare logic below
             searchCompare = compareAscending(methodIn.getCodeValue(searchMidPoint) , methodIn.getSearchItem());
             if (searchCompare == 0) 
             searchCompare = compareAscending(methodIn.getCodeToggle(searchMidPoint) , 1);
          // end of compare logic
          	if (searchCompare == 0 ) { // if search found
          	      keepSearching = false;
          	     methodIn.setCodeIndex(searchMidPoint + 1);
//  DISPLAY ' SEARCHING ' WS-SEARCH-ITEM ' TOGGLE ' WS-123-TOGGLE ' ITEM FOUND ' WS-CODE-MARKER ( WS-CODE-INDEX )
              logger.info(" SEARCHING {} TOGGLE {} ITEM FOUND {}", String.valueOf(methodIn.getSearchItem()), String.valueOf(methodIn.getToggle123()), String.valueOf(methodIn.getCodeMarker(methodIn.getCodeIndex() - 1))); 
          	} else  {
          		adjustSearchIndex(searchCompare,searchIndexes);
          		searchLowPoint  = searchIndexes[0];
           		searchMidPoint  = searchIndexes[1];
           		searchHighPoint = searchIndexes[2];
           		if (searchMidPoint == -1) { // search exhausted
           		    keepSearching = false; 
//  DISPLAY WS-SEARCH-ITEM ' NOT FOUND '
              logger.info("{} NOT FOUND ", String.valueOf(methodIn.getSearchItem())); 
           		}
          	}
          }
          ;
      
      }
  
  
  
  
  
  
  
  
  }
