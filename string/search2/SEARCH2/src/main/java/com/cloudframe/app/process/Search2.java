  package com.cloudframe.app.process;
  /* 
*---------------------------------------------
*/
  
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.search2.dto.*;
  import com.cloudframe.app.search2.dto.WtFields;
  import com.cloudframe.app.search2.dto.MiscData;
  import com.cloudframe.app.search2.dto.SbidGroupTbl;
  import com.cloudframe.app.search2.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  import com.cloudframe.app.utility.CFUtil;
  
  @Component("search2")
  
  public class Search2 extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Search2.class);
  
  private WtFields wtFields = new WtFields() ;
  private MiscData miscData = new MiscData() ;
  private SbidGroupTbl sbidGroupTbl = new SbidGroupTbl() ;
  private Work work = new Work() ;
  
  
  
  
  
  
  int sbidIndex;
  int codeIndex;
  
  
  
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
      @Override
      public int process() throws Exception {
       initVars();
			// Declare local variables used in the method
			boolean keepSearching = true;
			int[] searchIndexes = null;
			int searchLowPoint = 0;
			int searchMidPoint = 0;
			int searchHighPoint = 0;
			int searchCompare = 0;
			char[] cmdCaHomeSidBidCode = null;
			// End of variable declaration

       try {
       setCodePage("1047");

// *    ----
//  MOVE 1000 TO WS-INITIAL
          work.setInitial(1000);
//  MOVE 5901 TO WS-COUNTER
          work.setCounter(5901);
//  PERFORM VARYING WS-SUB FROM 1 BY 1 UNTIL WS-SUB > WS-COUNTER
          for (work.setSub(1); (	( work.getSub() <= work.getCounter() )) ; work.setSub(work.getSub() + 1) ) {
//  ADD WS-INCREMENT TO WS-INITIAL
              work.setInitial(work.getInitial()+work.getIncrement());
//  MOVE WS-INITIAL TO WS-CODE-VALUE ( WS-SUB )
              wtFields.getCodeCtrl(work.getSub() - 1).setCodeValue((int) work.getInitial());
//  MOVE WS-SUB TO WS-CODE-MARKER ( WS-SUB )
              wtFields.getCodeCtrl(work.getSub() - 1).setCodeMarker( work.getSub());
//  MOVE 1 TO WS-CODE-TOGGLE ( WS-SUB )
              wtFields.getCodeCtrl(work.getSub() - 1).setCodeToggle(1);
//  PERFORM 0005-TOGGLE THROUGH 0005-EXIT
              toggle();/*0005-TOGGLE*/
              if (this.isProgramEnded()) {
                  return getRc();
              }
//  ADD 1 TO WS-123-TOGGLE
              work.setToggle123( (short) (work.getToggle123()+(short)1));
          }
//  MOVE 1 TO WS-SUB WS-123-TOGGLE
          work.setSub(1);
          work.setToggle123((short)1);
//  DISPLAY 'SEARCH DUPLICATES '
          logger.info("SEARCH DUPLICATES "); 
//  DISPLAY '--------------------'
          logger.info("--------------------"); 
//  PERFORM 0010-FILL-DETAIL THROUGH 0010-EXIT UNTIL WS-SUB > 5901
          while (	( work.getSub() <= 5901 )) {
             fillDetail();/*0010-FILL-DETAIL*/
             if (this.isProgramEnded()) {
                 return getRc();
             }
          }

// *    ----
//  MOVE +26 TO WS-SBID-COUNT
          work.setSbidCount(26);
//  SET WS-SBID-INDEX TO +1
          sbidIndex = 1; 
          
          // MOVE '00019' TO CMD-CA-HOME-SID-BID-CODE
          //  LITERAL_00019 = '00019'
          miscData.setCmdCaHomeSidBidCode(CONSTANTS.LITERAL_00019);
//  PERFORM VARYING I FROM +1 BY +1 UNTIL I > +26
          for (miscData.setI(1); (	( miscData.getI() <= 26 ) ) ; miscData.setI(miscData.getI() + 1) ) {
//  MOVE WS-SBID (I) TO WS-TBL-SBID ( WS-SBID-INDEX )
              sbidGroupTbl.getSbidGroupEntries(sbidIndex - 1).setTblSbid(miscData.getTblsRedefined(miscData.getI() - 1).getSbid());
//  MOVE WS-ECP (I) TO WS-TBL-ECP ( WS-SBID-INDEX )
              sbidGroupTbl.getSbidGroupEntries(sbidIndex - 1).setTblEcp(miscData.getTblsRedefined(miscData.getI() - 1).getEcp());
//  SET WS-SBID-INDEX UP BY +1
              sbidIndex++; 
              
          }
          cmdCaHomeSidBidCode = miscData.getCmdCaHomeSidBidCode();
//  SEARCH ALL WS-SBID-GROUP-ENTRIES
          // Binary Search through sbidGroupTbl.sbidGroupEntries
          searchLowPoint = 0; //prevLowValue
          searchHighPoint = work.getSbidCount(); //prevHighValue
          searchMidPoint = searchHighPoint / 2; //starting at mid point
          searchIndexes = new int[]{searchLowPoint,searchMidPoint,searchHighPoint};
          keepSearching = true;
          while (keepSearching) {
          // compare logic below
             searchCompare = compareAscending(sbidGroupTbl.getSbidGroupEntries(searchMidPoint).getTblSbidString(),cmdCaHomeSidBidCode);
          // end of compare logic
          	if (searchCompare == 0 ) { // if search found
          	      keepSearching = false;
          	     sbidIndex = searchMidPoint	 + 1;
//  DISPLAY 'CMD-CA-HOME-SID-BID-CODE: ' CMD-CA-HOME-SID-BID-CODE ', found. ECP = ' WS-TBL-ECP ( WS-SBID-INDEX )
              logger.info("CMD-CA-HOME-SID-BID-CODE: {}, found. ECP = {}", new String(miscData.getCmdCaHomeSidBidCode()), new String(sbidGroupTbl.getSbidGroupEntries(sbidIndex - 1).getTblEcp())); 
          	} else  {
          		adjustSearchIndex(searchCompare,searchIndexes);
          		searchLowPoint  = searchIndexes[0];
           		searchMidPoint  = searchIndexes[1];
           		searchHighPoint = searchIndexes[2];
           		if (searchMidPoint == -1) { // search exhausted
           		    keepSearching = false; 
//  DISPLAY 'CMD-CA-HOME-SID-BID-CODE: ' CMD-CA-HOME-SID-BID-CODE ', NOT found'
              logger.info("CMD-CA-HOME-SID-BID-CODE: {}, NOT found", new String(miscData.getCmdCaHomeSidBidCode())); 
           		}
          	}
          }
  

// *    ----

// *    ----
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          this.setProgramEnded(true);
          return getRc();
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
      private void toggle() throws Exception {
			// Declare local variables used in the method
			short toggleMax = 0;
			short toggle123 = 0;
			// End of variable declaration

          toggleMax = work.getToggleMax();
          toggle123 = work.getToggle123();
//  IF WS-123-TOGGLE > WS-TOGGLE-MAX THEN
          if (	( toggle123 > toggleMax )) { 
//  PERFORM VARYING WS-SUB2 FROM 1 BY 1 UNTIL WS-SUB2 > WS-TOGGLE-MAX
              for (work.setSub2(1); (	( work.getSub2() <= work.getToggleMax() ) ) ; work.setSub2(work.getSub2() + 1) ) {
//  SUBTRACT WS-SUB2 FROM WS-SUB GIVING WS-SUB3
                  work.setSub3(work.getSub()-work.getSub2());
//  MOVE WS-CODE-VALUE ( WS-SUB ) TO WS-CODE-VALUE ( WS-SUB3 )
                  wtFields.getCodeCtrl(work.getSub3() - 1).setCodeValue(wtFields.getCodeCtrl(work.getSub() - 1).getCodeValue());
              }
              // MOVE ZERO TO WS-123-TOGGLE
              work.setToggle123((short) 0);
//  ADD 1 TO WS-TOGGLE-MAX
              work.setToggleMax( (short) (work.getToggleMax()+(short)1));
              toggleMax = work.getToggleMax();
//  IF WS-TOGGLE-MAX > 5 THEN
              if (	( toggleMax > 5 ) ) { 
                  // MOVE 1 TO WS-TOGGLE-MAX
                  work.setToggleMax((short)1);
              }
  
          }
  
          ;
      
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
      private void fillDetail() throws Exception {
			// Declare local variables used in the method
			short toggleMax = 0;
			short toggle123 = 0;
			// End of variable declaration

//  DISPLAY '** ' WS-SUB ' ** ' WS-CODE-VALUE ( WS-SUB ) ' , ' WS-CODE-TOGGLE ( WS-SUB ) ' , ' WS-CODE-MARKER ( WS-SUB )
          logger.info("** {} ** {} , {} , {}", String.valueOf(work.getSub()), String.valueOf(wtFields.getCodeCtrl(work.getSub() - 1).getCodeValue()), String.valueOf(wtFields.getCodeCtrl(work.getSub() - 1).getCodeToggle()), String.valueOf(wtFields.getCodeCtrl(work.getSub() - 1).getCodeMarker())); 
          toggleMax = work.getToggleMax();
          toggle123 = work.getToggle123();
//  IF WS-123-TOGGLE > WS-TOGGLE-MAX THEN
          if (	( toggle123 > toggleMax )) { 
              work.setSearchItem((long) (Math.abs(work.getSub() * 100 + 1000)));
//  PERFORM 0100-SEARCH-ALL THRU 0100-EXIT
              searchAll();/*0100-SEARCH-ALL*/
              // MOVE ZERO TO WS-123-TOGGLE
              work.setToggle123((short) 0);
//  ADD 1 TO WS-TOGGLE-MAX
              work.setToggleMax( (short) (work.getToggleMax()+(short)1));
              toggleMax = work.getToggleMax();
//  IF WS-TOGGLE-MAX > 5 THEN
              if (	( toggleMax > 5 ) ) { 
                  // MOVE 1 TO WS-TOGGLE-MAX
                  work.setToggleMax((short)1);
              }
  
          }
  
//  ADD 1 TO WS-123-TOGGLE WS-SUB
          work.setToggle123( (short) (work.getToggle123()+(short)1));
          work.setSub(work.getSub()+1);
          ;
      
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
      private void fillDetail0011() throws Exception {
			// Declare local variables used in the method
			short toggle123 = 0;
			// End of variable declaration

      
// *    ----
          toggle123 = work.getToggle123();
//  IF WS-123-TOGGLE > 3 THEN
          if (	( toggle123 > 3 ) ) { 
              work.setSearchItem((long) (Math.abs(work.getSub() * 100 + 1000)));
//  MOVE WS-SEARCH-ITEM TO WS-CODE-VALUE ( WS-SUB )
              wtFields.getCodeCtrl(work.getSub() - 1).setCodeValue(work.getSearchItem());
//  PERFORM 0100-SEARCH-ALL THRU 0100-EXIT
              searchAll();/*0100-SEARCH-ALL*/
              // MOVE ZERO TO WS-123-TOGGLE
              work.setToggle123((short) 0);
          }
  
//  ADD 1 TO WS-123-TOGGLE WS-SUB
          work.setToggle123( (short) (work.getToggle123()+(short)1));
          work.setSub(work.getSub()+1);
          ;
      
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
      private void searchAll() throws Exception {
			// Declare local variables used in the method
			boolean keepSearching = true;
			int[] searchIndexes = null;
			int searchLowPoint = 0;
			int searchMidPoint = 0;
			int searchHighPoint = 0;
			int searchCompare = 0;
			long searchItem = 0;
			// End of variable declaration

      
// *    ----
          searchItem = work.getSearchItem();
//  SEARCH ALL WS-CODE-CTRL
          // Binary Search through wtFields.codeCtrl
          searchLowPoint = 0; //prevLowValue
          searchHighPoint = work.getCounter(); //prevHighValue
          searchMidPoint = searchHighPoint / 2; //starting at mid point
          searchIndexes = new int[]{searchLowPoint,searchMidPoint,searchHighPoint};
          keepSearching = true;
          while (keepSearching) {
          // compare logic below
             searchCompare = compareAscending(wtFields.getCodeCtrl(searchMidPoint).getCodeValue() , searchItem);
             if (searchCompare == 0) 
             searchCompare = compareAscending(wtFields.getCodeCtrl(searchMidPoint).getCodeToggle() , 1);
          // end of compare logic
          	if (searchCompare == 0 ) { // if search found
          	      keepSearching = false;
          	     codeIndex = searchMidPoint	 + 1;
//  DISPLAY ' SEARCHING ' WS-SEARCH-ITEM ' TOGGLE ' WS-123-TOGGLE ' ITEM FOUND ' WS-CODE-MARKER ( WS-CODE-INDEX )
              logger.info(" SEARCHING {} TOGGLE {} ITEM FOUND {}", String.valueOf(work.getSearchItem()), String.valueOf(work.getToggle123()), String.valueOf(wtFields.getCodeCtrl(codeIndex - 1).getCodeMarker())); 
          	} else  {
          		adjustSearchIndex(searchCompare,searchIndexes);
          		searchLowPoint  = searchIndexes[0];
           		searchMidPoint  = searchIndexes[1];
           		searchHighPoint = searchIndexes[2];
           		if (searchMidPoint == -1) { // search exhausted
           		    keepSearching = false; 
//  DISPLAY WS-SEARCH-ITEM ' NOT FOUND '
              logger.info("{} NOT FOUND ", String.valueOf(work.getSearchItem())); 
           		}
          	}
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
