  package com.cloudframe.app.process;
  /* 
*----------------------------------------------------------------*
*----------------------------------------------------------------*
*/
  
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import java.util.ArrayList;
  import java.util.List;
  import java.util.regex.Pattern;
  import java.util.regex.Matcher;
  import com.cloudframe.app.utility.Pair;
  import java.util.stream.IntStream;
  import java.nio.CharBuffer;
  import java.util.Arrays;
  import java.util.Map;
  import java.util.HashMap;
  import com.cloudframe.app.utility.CFUtil;
  import com.cloudframe.app.data.Field;
  import com.cloudframe.app.cfstring.dto.ExtCustAcctNo;
  import com.cloudframe.app.cfstring.dto.ExtFlds;
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.cfstring.dto.*;
  import com.cloudframe.app.cfstring.dto.ExtractRec;
  import com.cloudframe.app.cfstring.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("cfstring")
  
  public class Cfstring extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Cfstring.class);
  
  private ExtractRec extractRec = new ExtractRec() ;
  private Work work = new Work() ;
  
  
  
  
  
  private int tallyCount = 0;
  private Map<String, Pattern> patternMap = new HashMap<>();
  
  
  
  
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
  *   COBOL Paragraph - 0000-MAINLINE COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void mainline() throws Exception {
//  PERFORM 0010-INSPECT THRU 0010-EXIT
          inspect();/*0010-INSPECT*/
          if (this.isProgramEnded()) {
              return ;
          }
//  PERFORM 0020-UNSTRING-1 THRU 0020-EXIT
          unstring1();/*0020-UNSTRING-1*/
          if (this.isProgramEnded()) {
              return ;
          }
//  PERFORM 0030-UNSTRING-2 THRU 0030-EXIT
          unstring2();/*0030-UNSTRING-2*/
          if (this.isProgramEnded()) {
              return ;
          }
//  PERFORM 0040-STRING-1 THRU 0040-EXIT
          string1();/*0040-STRING-1*/
          if (this.isProgramEnded()) {
              return ;
          }
//cobolCode::GO TO 9999-GOBACK
goback();
 return ;
//cobolCodeEnds::GO TO 9999-GOBACK
      
      }
      /**
      * inspect 
      *   This method is derived from 
  *   COBOL Paragraph - 0010-INSPECT COBOL Cyclomatic complexity - 1
      * Input  :  

      * - string1                        COBOL Name: WS-STRING-1
      * - cnt1                           COBOL Name: WS-CNT1
      *
      * Output :  

      * - holdString                     COBOL Name: WS-HOLD-STRING
      * - string1                        COBOL Name: WS-STRING-1
      *
      * @throws CFException
      */
      private void inspect() throws Exception {
      
// *----------------------------------------------------------------*

// *----------------------------------------------------------------*
//  DISPLAY '*--------------------------------------*'
          logger.info("*--------------------------------------*"); 
//  DISPLAY 'String before inspect replacing:'
          logger.info("String before inspect replacing:"); 
//  DISPLAY WS-STRING-1
          logger.info(new String(work.getString1())); 
//  DISPLAY ' '
          logger.info(" "); 
          // MOVE WS-STRING-1 TO WS-HOLD-STRING
          work.setHoldString(work.getString1());
//  INSPECT WS-STRING-1 TALLYING WS-CNT1 FOR ALL '%'
          tallyCount = tallyAll(work.getString1(),CONSTANTS.LITERAL_PR_);
          work.setCnt1(    work.getCnt1() + tallyCount );
//  DISPLAY "Number of % signs: " WS-CNT1
          logger.info("Number of % signs: {}", String.valueOf(work.getCnt1())); 
//  INSPECT WS-STRING-1 REPLACING ALL '%' BY '$'
          work.setString1(  replaceAll(work.getString1(),CONSTANTS.LITERAL_PR_,CONSTANTS.LITERAL_33824)  );
//  DISPLAY 'After replacing % with $:'
          logger.info("After replacing % with $:"); 
//  DISPLAY WS-STRING-1
          logger.info(new String(work.getString1())); 
//  DISPLAY ' '
          logger.info(" "); 
//  DISPLAY '*--------------------------------------*'
          logger.info("*--------------------------------------*"); 
          ;
      
      }
      /**
      * unstring1 
      *   This method is derived from 
  *   COBOL Paragraph - 0020-UNSTRING-1 COBOL Cyclomatic complexity - 9
      * Input  :  

      * - string1                        COBOL Name: WS-STRING-1
      * - holdString                     COBOL Name: WS-HOLD-STRING
      *
      * Output :  

      * - parm1                          COBOL Name: WS-PARM-1
      * - parm2                          COBOL Name: WS-PARM-2
      * - parm3                          COBOL Name: WS-PARM-3
      * - parm4                          COBOL Name: WS-PARM-4
      * - parm5                          COBOL Name: WS-PARM-5
      * - parm6                          COBOL Name: WS-PARM-6
      * - p1Cnt                          COBOL Name: WS-P1-CNT
      * - p2Cnt                          COBOL Name: WS-P2-CNT
      * - p3Cnt                          COBOL Name: WS-P3-CNT
      * - p4Cnt                          COBOL Name: WS-P4-CNT
      * - p5Cnt                          COBOL Name: WS-P5-CNT
      * - p6Cnt                          COBOL Name: WS-P6-CNT
      * - string2                        COBOL Name: WS-STRING-2
      * - edit                           COBOL Name: WS-EDIT
      *
      * @throws CFException
      */
      private void unstring1() throws Exception {
			// Declare local variables used in the method
			int loop = 0;
			int pointerCnt = 0;
			String updatedRegEx = null;
			char[] resultKey = null;
			char[] resultValue = null;
			char[] padArr = new char[] {' '};
			char[] plusSign = new char[] {'+'};
			char[] actualUnstringStr = null;
			char[] joinCharArray = null;
			char[] string2 = null;
			char[] holdString = null;
			ArrayList<String> splitBy = null;
			List<Pair> result = null;
			boolean overflow = false;
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			Map<String,Object> updated = null;
			// End of variable declaration

      
// *----------------------------------------------------------------*

// *----------------------------------------------------------------*
//  DISPLAY 'Unstring with sufficient parms'
          logger.info("Unstring with sufficient parms"); 
          // MOVE SPACES TO WS-PARM-1 , WS-PARM-2 , WS-PARM-3 , WS-PARM-4 , WS-PARM-5 , WS-PARM-6
          work.setParm1(CONSTANTS.SPACE_30);
          work.setParm2(CONSTANTS.SPACE_30);
          work.setParm3(CONSTANTS.SPACE_30);
          work.setParm4(CONSTANTS.SPACE_30);
          work.setParm5(CONSTANTS.SPACE_30);
          work.setParm6(CONSTANTS.SPACE_30);
//  MOVE +0 TO WS-P1-CNT , WS-P2-CNT , WS-P3-CNT , WS-P4-CNT , WS-P5-CNT , WS-P6-CNT
          work.setP1Cnt(0);
          work.setP2Cnt(0);
          work.setP3Cnt(0);
          work.setP4Cnt(0);
          work.setP5Cnt(0);
          work.setP6Cnt(0);
//  UNSTRING WS-STRING-1 DELIMITED BY '%' OR '$' INTO WS-PARM-1 COUNT IN WS-P1-CNT , WS-PARM-2 COUNT IN WS-P2-CNT , WS-PARM-3 COUNT IN WS-P3-CNT , WS-PARM-4 , WS-PARM-5 COUNT IN WS-P5-CNT , WS-PARM-6 COUNT IN WS-P6-CNT
          //This will have the no of characters parsed while un string. On NoOverflow pointerCnt == actualstring.length
          actualUnstringStr = work.getString1();
          overflow = false;
          //Construct an ArrayList by the given Delimited String. '+' will be added when there is ALL.EG ALL $, then delimited String will be $+
          splitBy = getArrayList(CONSTANTS.LITERAL_PR_,CONSTANTS.LITERAL_33824);
          //Create a RegularExpression String from the above delimited list (updateRegEx will add escape character \\ if in need, also group the values when required)
          updatedRegEx = updateRegEx(splitBy);
          //Split and store the String and delimited values.(EG : AABC$$$GH%, delimited by = ALL $, %, then result will have AABC - $ , GH - %)
          result = splitString(actualUnstringStr,updatedRegEx);
          loop = 0;
          try{
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setParm1(resultKey);
          work.setP1Cnt(resultKey.length);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setParm2(resultKey);
          work.setP2Cnt(resultKey.length);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setParm3(resultKey);
          work.setP3Cnt(resultKey.length);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setParm4(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setParm5(resultKey);
          work.setP5Cnt(resultKey.length);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setParm6(resultKey);
          work.setP6Cnt(resultKey.length);
          	
          	loop++;
          }
          catch(IndexOutOfBoundsException e ){
            //  overflow = true;
          	//logger.info(e.getMessage());
          }
          if(6 < result.size() ) overflow = true;
          if (overflow) {
          //  ON OVERFLOW
          //  DISPLAY 'Too many parms in string'
               logger.info("Too many parms in string"); 
          } else  {
          //  NOT ON OVERFLOW
          //  PERFORM 2000-NO-OVERFLOW
               noOverflow();/*2000-NO-OVERFLOW*/
           }
//  PERFORM 1000-DISPLAY-PARMS THRU 1000-EXIT
          displayParms();/*1000-DISPLAY-PARMS*/

// *            Not on overflow display 'done with unstring'
//  MOVE '*' TO WS-PARM-5 ( WS-P5-CNT + 1 : 1)
//  LITERAL_STR_ = '*'
          work.setParm5(replace(work.getParm5(),CONSTANTS.LITERAL_STR_,(work.getP5Cnt() + 1-1), (work.getP5Cnt() + 1 + 0) ));
//  MOVE +1 TO WS-P2-CNT
          work.setP2Cnt(1);
//  STRING WS-PARM-1 (1 : WS-P1-CNT ) '%' DELIMITED BY SIZE WS-PARM-2 '%' DELIMITED BY SPACES WS-PARM-3 (1 : WS-P3-CNT ) '%' DELIMITED BY SIZE WS-PARM-4 '%' DELIMITED BY SPACES WS-PARM-5 DELIMITED BY '*' INTO WS-STRING-2 WITH POINTER WS-P2-CNT
          charArray = new ArrayList<char[]>();
             charArray.add(substring(work.getParm1(),0,work.getP1Cnt()));
             charArray.add(CONSTANTS.LITERAL_PR_);
             charArray.add(splitFirst( work.getParm2() , CONSTANTS.SPACE ) );
             charArray.add(splitFirst( CONSTANTS.LITERAL_PR_ , CONSTANTS.SPACE ) );
             charArray.add(substring(work.getParm3(),0,work.getP3Cnt()));
             charArray.add(CONSTANTS.LITERAL_PR_);
             charArray.add(splitFirst( work.getParm4() , CONSTANTS.SPACE ) );
             charArray.add(splitFirst( CONSTANTS.LITERAL_PR_ , CONSTANTS.SPACE ) );
             charArray.add(splitFirst( work.getParm5() , CONSTANTS.LITERAL_STR_ ) );
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3),charArray.get(4),charArray.get(5),charArray.get(6),charArray.get(7),charArray.get(8));
          updated = updateString(work.getString2() ,joinCharArray ,(work.getP2Cnt()-1));
          work.setString2(   (char[])updated.get("string"));
          work.setP2Cnt((int)updated.get("startAt"));
          overflow = (boolean)updated.get("exceeds");
          if (overflow) {
          //  ON OVERFLOW
          //  DISPLAY 'Target field to short for string'
               logger.info("Target field to short for string"); 
          } else  {
          //  NOT ON OVERFLOW
          //  DISPLAY 'String data fits target'
               logger.info("String data fits target"); 
           }
          work.setP2Cnt(work.getP2Cnt() - 1);
//  MOVE WS-P2-CNT TO WS-EDIT
//  FORMAT_1441609963 = "----9"
          work.setEdit(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1441609963,String.valueOf(work.getP2Cnt()).toCharArray()));
//  DISPLAY 'Length of restrung data: ' WS-EDIT
          logger.info("Length of restrung data: {}", new String(work.getEdit())); 
          holdString = work.getHoldString();
          string2 = work.getString2();
//  IF WS-STRING-2 = WS-HOLD-STRING
          if (		compareChars(string2,holdString) == 0 ) { 
//  DISPLAY 'Restring worked'
              logger.info("Restring worked"); 
          }
  
//  ELSE
          else { 
//  DISPLAY 'Original String: ' WS-HOLD-STRING
              logger.info("Original String: {}", new String(work.getHoldString())); 
//  DISPLAY 'Restrung String: ' WS-STRING-2
              logger.info("Restrung String: {}", new String(work.getString2())); 
          }
          ;
      
      }
      /**
      * unstring2 
      *   This method is derived from 
  *   COBOL Paragraph - 0030-UNSTRING-2 COBOL Cyclomatic complexity - 4
      * Input  :  

      * - string1                        COBOL Name: WS-STRING-1
      *
      * Output :  

      * - parm1                          COBOL Name: WS-PARM-1
      * - parm2                          COBOL Name: WS-PARM-2
      * - parm3                          COBOL Name: WS-PARM-3
      * - parm4                          COBOL Name: WS-PARM-4
      * - parm5                          COBOL Name: WS-PARM-5
      * - parm6                          COBOL Name: WS-PARM-6
      * - p1Cnt                          COBOL Name: WS-P1-CNT
      * - p2Cnt                          COBOL Name: WS-P2-CNT
      * - p3Cnt                          COBOL Name: WS-P3-CNT
      * - p4Cnt                          COBOL Name: WS-P4-CNT
      * - p5Cnt                          COBOL Name: WS-P5-CNT
      * - p6Cnt                          COBOL Name: WS-P6-CNT
      *
      * @throws CFException
      */
      private void unstring2() throws Exception {
			// Declare local variables used in the method
			int loop = 0;
			int pointerCnt = 0;
			String updatedRegEx = null;
			char[] resultKey = null;
			char[] resultValue = null;
			char[] padArr = new char[] {' '};
			char[] plusSign = new char[] {'+'};
			char[] actualUnstringStr = null;
			ArrayList<String> splitBy = null;
			List<Pair> result = null;
			boolean overflow = false;
			// End of variable declaration

      
// *----------------------------------------------------------------*

// *----------------------------------------------------------------*
//  DISPLAY 'Unstring with insufficient parms'
          logger.info("Unstring with insufficient parms"); 
          // MOVE SPACES TO WS-PARM-1 , WS-PARM-2 , WS-PARM-3 , WS-PARM-4 , WS-PARM-5 , WS-PARM-6
          work.setParm1(CONSTANTS.SPACE_30);
          work.setParm2(CONSTANTS.SPACE_30);
          work.setParm3(CONSTANTS.SPACE_30);
          work.setParm4(CONSTANTS.SPACE_30);
          work.setParm5(CONSTANTS.SPACE_30);
          work.setParm6(CONSTANTS.SPACE_30);
//  MOVE +0 TO WS-P1-CNT , WS-P2-CNT , WS-P3-CNT , WS-P4-CNT , WS-P5-CNT , WS-P6-CNT
          work.setP1Cnt(0);
          work.setP2Cnt(0);
          work.setP3Cnt(0);
          work.setP4Cnt(0);
          work.setP5Cnt(0);
          work.setP6Cnt(0);
//  UNSTRING WS-STRING-1 DELIMITED BY '%' OR '$' INTO WS-PARM-1 COUNT IN WS-P1-CNT , WS-PARM-2 COUNT IN WS-P2-CNT
          //This will have the no of characters parsed while un string. On NoOverflow pointerCnt == actualstring.length
          actualUnstringStr = work.getString1();
          overflow = false;
          //Construct an ArrayList by the given Delimited String. '+' will be added when there is ALL.EG ALL $, then delimited String will be $+
          splitBy = getArrayList(CONSTANTS.LITERAL_PR_,CONSTANTS.LITERAL_33824);
          //Create a RegularExpression String from the above delimited list (updateRegEx will add escape character \\ if in need, also group the values when required)
          updatedRegEx = updateRegEx(splitBy);
          //Split and store the String and delimited values.(EG : AABC$$$GH%, delimited by = ALL $, %, then result will have AABC - $ , GH - %)
          result = splitString(actualUnstringStr,updatedRegEx);
          loop = 0;
          try{
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setParm1(resultKey);
          work.setP1Cnt(resultKey.length);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setParm2(resultKey);
          work.setP2Cnt(resultKey.length);
          	
          	loop++;
          }
          catch(IndexOutOfBoundsException e ){
            //  overflow = true;
          	//logger.info(e.getMessage());
          }
          if(2 < result.size() ) overflow = true;
          if (overflow) {
          //  ON OVERFLOW
          //  PERFORM 3000-OVERFLOW
               overflow();/*3000-OVERFLOW*/
          } else  {
          //  NOT ON OVERFLOW
          //  DISPLAY 'Done with unstring'
               logger.info("Done with unstring"); 
           }
//  PERFORM 1000-DISPLAY-PARMS THRU 1000-EXIT
          displayParms();/*1000-DISPLAY-PARMS*/
          ;
      
      }
      /**
      * string1 
      *   This method is derived from 
  *   COBOL Paragraph - 0040-STRING-1 COBOL Cyclomatic complexity - 116
      * Input  :  

      * - extMtn                         COBOL Name: WS-EXT-MTN
      * - extLname                       COBOL Name: WS-EXT-LNAME
      * - extFname                       COBOL Name: WS-EXT-FNAME
      * - extActEffDt                    COBOL Name: WS-EXT-ACT-EFF-DT
      * - extCarrierName                 COBOL Name: WS-EXT-CARRIER-NAME
      * - extDeviceId                    COBOL Name: WS-EXT-DEVICE-ID
      * - extRegionCd                    COBOL Name: WS-EXT-REGION-CD
      * - extOutletId                    COBOL Name: WS-EXT-OUTLET-ID
      * - extMfgNme                      COBOL Name: WS-EXT-MFG-NME
      * - extProdNme                     COBOL Name: WS-EXT-PROD-NME
      * - extAddr1                       COBOL Name: WS-EXT-ADDR1
      * - extAddr2                       COBOL Name: WS-EXT-ADDR2
      * - extCity                        COBOL Name: WS-EXT-CITY
      * - extState                       COBOL Name: WS-EXT-STATE
      * - extZipCode                     COBOL Name: WS-EXT-ZIP-CODE
      * - extAnalogDigitalCd             COBOL Name: WS-EXT-ANALOG-DIGITAL-CD
      * - extTermnlOptCd                 COBOL Name: WS-EXT-TERMNL-OPT-CD
      * - extWarranty                    COBOL Name: WS-EXT-WARRANTY
      * - extMtnEffDt                    COBOL Name: WS-EXT-MTN-EFF-DT
      * - extCustIdNo                    COBOL Name: WS-EXT-CUST-ID-NO
      * - extAcctNo                      COBOL Name: WS-EXT-ACCT-NO
      * - extActDeact                    COBOL Name: WS-EXT-ACT-DEACT
      * - extPricePlan                   COBOL Name: WS-EXT-PRICE-PLAN
      * - extSfo                         COBOL Name: WS-EXT-SFO
      * - extMarketCd                    COBOL Name: WS-EXT-MARKET-CD
      * - extMinId                       COBOL Name: WS-EXT-MIN-ID
      * - extAuserCnt                    COBOL Name: WS-EXT-AUSER-CNT
      * - extAuthUsrLname                COBOL Name: WS-EXT-AUTH-USR-LNAME
      * - extAuthUsrFname                COBOL Name: WS-EXT-AUTH-USR-FNAME
      * - extIccid                       COBOL Name: WS-EXT-ICCID
      * - extDeviceIdType                COBOL Name: WS-EXT-DEVICE-ID-TYPE
      * - dvcTransRsnCd                  COBOL Name: WS-DVC-TRANS-RSN-CD
      * - extActvReqDt                   COBOL Name: WS-EXT-ACTV-REQ-DT
      * - extCustTypeCd                  COBOL Name: WS-EXT-CUST-TYPE-CD
      * - extSfoSpoIndicator             COBOL Name: WS-EXT-SFO-SPO-INDICATOR
      * - extLevel                       COBOL Name: WS-EXT-LEVEL
      * - extLineStatus                  COBOL Name: WS-EXT-LINE-STATUS
      * - extFinMarketCode               COBOL Name: WS-EXT-FIN-MARKET-CODE
      * - extEmailAddr1                  COBOL Name: WS-EXT-EMAIL-ADDR1
      * - extEmailAddr2                  COBOL Name: WS-EXT-EMAIL-ADDR2
      * - extEmailAddr3                  COBOL Name: WS-EXT-EMAIL-ADDR3
      * - svcIdNoP1                      COBOL Name: WS-SVC-ID-NO-P1
      * - svcIdNoP2                      COBOL Name: WS-SVC-ID-NO-P2
      * - extLocationState               COBOL Name: WS-EXT-LOCATION-STATE
      * - extUniqueId                    COBOL Name: WS-EXT-UNIQUE-ID
      * - extBrandIdentifier             COBOL Name: WS-EXT-BRAND-IDENTIFIER
      * - extBillCycleDt                 COBOL Name: WS-EXT-BILL-CYCLE-DT
      * - extServiceStartDt              COBOL Name: WS-EXT-SERVICE-START-DT
      * - extSlsRepId                    COBOL Name: WS-EXT-SLS-REP-ID
      * - extSlsRepLname                 COBOL Name: WS-EXT-SLS-REP-LNAME
      * - extSlsRepFname                 COBOL Name: WS-EXT-SLS-REP-FNAME
      * - extChnlDetail                  COBOL Name: WS-EXT-CHNL-DETAIL
      * - extOutletName                  COBOL Name: WS-EXT-OUTLET-NAME
      * - extDistrictDesc                COBOL Name: WS-EXT-DISTRICT-DESC
      * - extVzMktDesc                   COBOL Name: WS-EXT-VZ-MKT-DESC
      * - extUniqueIdLine                COBOL Name: WS-EXT-UNIQUE-ID-LINE
      * - extSvcAddr1                    COBOL Name: WS-EXT-SVC-ADDR1
      * - extSvcAddr2                    COBOL Name: WS-EXT-SVC-ADDR2
      * - extSvcCity                     COBOL Name: WS-EXT-SVC-CITY
      * - extSvcState                    COBOL Name: WS-EXT-SVC-STATE
      * - extSvcZipCode                  COBOL Name: WS-EXT-SVC-ZIP-CODE
      * - extMfgNm                       COBOL Name: WS-EXT-MFG-NM
      * - extPrdNme                      COBOL Name: WS-EXT-PRD-NME
      * - extMacid                       COBOL Name: WS-EXT-MACID
      * - extActivationDate              COBOL Name: WS-EXT-ACTIVATION-DATE
      * - extSkuId                       COBOL Name: WS-EXT-SKU-ID
      *
      * Output :  

      * - delimRec                       COBOL Name: WS-DELIM-REC
      *
      * @throws CFException
      */
      private void string1() throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			ExtCustAcctNo extCustAcctNo = extractRec.getExtCustAcctNo();
			ExtFlds extFlds = extractRec.getExtFlds();
			// End of variable declaration


// *
//  STRING WS-EXT-MTN DELIMITED BY SIZE '|' DELIMITED BY SIZE WS-EXT-LNAME DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-FNAME DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-ACT-EFF-DT DELIMITED BY SIZE '|' DELIMITED BY SIZE WS-EXT-CARRIER-NAME DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-DEVICE-ID DELIMITED BY ' ' '|' DELIMITED BY SIZE WS-EXT-REGION-CD DELIMITED BY ' ' '|' DELIMITED BY SIZE WS-EXT-OUTLET-ID DELIMITED BY ' ' '|' DELIMITED BY SIZE WS-EXT-MFG-NME DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-PROD-NME DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-ADDR1 DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-ADDR2 DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-CITY DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-STATE DELIMITED BY ' ' '|' DELIMITED BY SIZE WS-EXT-ZIP-CODE DELIMITED BY ' ' '|' DELIMITED BY SIZE WS-EXT-ANALOG-DIGITAL-CD DELIMITED BY SIZE '|' DELIMITED BY SIZE WS-EXT-TERMNL-OPT-CD DELIMITED ' ' '|' DELIMITED BY SIZE WS-EXT-WARRANTY DELIMITED BY SIZE '|' DELIMITED BY SIZE WS-EXT-MTN-EFF-DT DELIMITED BY SIZE '|' DELIMITED BY SIZE WS-EXT-CUST-ID-NO DELIMITED BY ' ' '|' DELIMITED BY SIZE WS-EXT-ACCT-NO DELIMITED BY ' ' '|' DELIMITED BY SIZE WS-EXT-ACT-DEACT DELIMITED BY ' ' '|' DELIMITED BY SIZE WS-EXT-PRICE-PLAN DELIMITED BY SIZE '|' DELIMITED BY SIZE WS-EXT-SFO ( WS-LEN + 1 : ) DELIMITED BY SIZE '|' DELIMITED BY SIZE WS-EXT-MARKET-CD DELIMITED BY SIZE '|' DELIMITED BY SIZE WS-EXT-MIN-ID DELIMITED BY SIZE '|' DELIMITED BY SIZE WS-EXT-AUSER-CNT DELIMITED BY SIZE '|' DELIMITED BY SIZE WS-EXT-AUTH-USR-LNAME (1) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-AUTH-USR-FNAME (1) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-AUTH-USR-LNAME (2) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-AUTH-USR-FNAME (2) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-AUTH-USR-LNAME (3) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-AUTH-USR-FNAME (3) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-AUTH-USR-LNAME (4) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-AUTH-USR-FNAME (4) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-AUTH-USR-LNAME (5) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-AUTH-USR-FNAME (5) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-AUTH-USR-LNAME (6) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-AUTH-USR-FNAME (6) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-AUTH-USR-LNAME (7) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-AUTH-USR-FNAME (7) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-AUTH-USR-LNAME (8) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-AUTH-USR-FNAME (8) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-AUTH-USR-LNAME (9) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-AUTH-USR-FNAME (9) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-AUTH-USR-LNAME (10) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-AUTH-USR-FNAME (10) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-ICCID DELIMITED BY ' ' '|' DELIMITED BY SIZE WS-EXT-DEVICE-ID-TYPE DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-DVC-TRANS-RSN-CD DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-ACTV-REQ-DT DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-CUST-TYPE-CD DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-SFO-SPO-INDICATOR DELIMITED BY SIZE '|' DELIMITED BY SIZE WS-EXT-LEVEL DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-LINE-STATUS DELIMITED BY SPACES '|' DELIMITED BY SIZE WS-EXT-FIN-MARKET-CODE DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-EMAIL-ADDR1 DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-EMAIL-ADDR2 DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-EMAIL-ADDR3 DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-SVC-ID-NO-P1 DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-SVC-ID-NO-P2 DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-LOCATION-STATE DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-UNIQUE-ID DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-BRAND-IDENTIFIER DELIMITED BY SIZE '|' DELIMITED BY SIZE WS-EXT-BILL-CYCLE-DT DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-SERVICE-START-DT DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-SLS-REP-ID DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-SLS-REP-LNAME DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-SLS-REP-FNAME DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-CHNL-DETAIL DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-OUTLET-NAME DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-DISTRICT-DESC DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-VZ-MKT-DESC DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-UNIQUE-ID-LINE DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-SVC-ADDR1 DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-SVC-ADDR2 DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-SVC-CITY DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-SVC-STATE DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-SVC-ZIP-CODE DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-MFG-NM (1) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-PRD-NME (1) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-MACID (1) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-ACTIVATION-DATE (1) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-MFG-NM (2) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-PRD-NME (2) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-MACID (2) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-ACTIVATION-DATE (2) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-MFG-NM (3) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-PRD-NME (3) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-MACID (3) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-ACTIVATION-DATE (3) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-MFG-NM (4) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-PRD-NME (4) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-MACID (4) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-ACTIVATION-DATE (4) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-MFG-NM (5) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-PRD-NME (5) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-MACID (5) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-ACTIVATION-DATE (5) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-MFG-NM (6) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-PRD-NME (6) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-MACID (6) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-ACTIVATION-DATE (6) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-SKU-ID DELIMITED BY '  ' INTO WS-DELIM-REC END-STRING
          charArray = new ArrayList<char[]>();
             charArray.add(extractRec.getExtMtn());
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtLname() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtFname() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(extractRec.getExtActEffDt().toCharArray());
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtCarrierName() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtDeviceId() , CONSTANTS.SPACE ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtRegionCd() , CONSTANTS.SPACE ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( String.valueOf(extractRec.getExtOutletIdString()).toCharArray() , CONSTANTS.SPACE ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtMfgNme() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtProdNme() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtAddr1() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtAddr2() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtCity() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtState() , CONSTANTS.SPACE ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtZipCode() , CONSTANTS.SPACE ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(extractRec.getExtAnalogDigitalCd());
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtTermnlOptCd() , CONSTANTS.SPACE ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(extractRec.getExtWarranty());
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(extractRec.getExtMtnEffDt());
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( String.valueOf(extCustAcctNo.getExtCustIdNoString()).toCharArray() , CONSTANTS.SPACE ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( String.valueOf(extCustAcctNo.getExtAcctNoString()).toCharArray() , CONSTANTS.SPACE ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtActDeact() , CONSTANTS.SPACE ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(String.valueOf(extFlds.getExtPricePlanString()).toCharArray());
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(String.valueOf(substring(extFlds.getExtSfoString(),(work.getLen() + 1-1), (work.getLen() + 1 + 9) )).toCharArray());
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(extFlds.getExtMarketCd());
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(extFlds.getExtMinId());
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(String.valueOf(extractRec.getExtAuserCntString()).toCharArray());
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtAuthUsers(0).getExtAuthUsrLname() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtAuthUsers(0).getExtAuthUsrFname() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtAuthUsers(1).getExtAuthUsrLname() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtAuthUsers(1).getExtAuthUsrFname() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtAuthUsers(2).getExtAuthUsrLname() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtAuthUsers(2).getExtAuthUsrFname() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtAuthUsers(3).getExtAuthUsrLname() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtAuthUsers(3).getExtAuthUsrFname() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtAuthUsers(4).getExtAuthUsrLname() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtAuthUsers(4).getExtAuthUsrFname() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtAuthUsers(5).getExtAuthUsrLname() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtAuthUsers(5).getExtAuthUsrFname() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtAuthUsers(6).getExtAuthUsrLname() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtAuthUsers(6).getExtAuthUsrFname() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtAuthUsers(7).getExtAuthUsrLname() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtAuthUsers(7).getExtAuthUsrFname() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtAuthUsers(8).getExtAuthUsrLname() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtAuthUsers(8).getExtAuthUsrFname() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtAuthUsers(9).getExtAuthUsrLname() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtAuthUsers(9).getExtAuthUsrFname() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtIccid() , CONSTANTS.SPACE ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtDeviceIdType() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getDvcTransRsnCd() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtActvReqDt() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtCustTypeCd() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(extractRec.getExtSfoSpoIndicator());
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtLevel() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtLineStatus() , CONSTANTS.SPACE ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtFinMarketCode() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtEmailAddr1() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtEmailAddr2() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtEmailAddr3() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( work.getSvcIdNoP1() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( work.getSvcIdNoP2() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtLocationState() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( String.valueOf(extractRec.getExtUniqueIdString()).toCharArray() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(extractRec.getExtBrandIdentifier());
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtBillCycleDt().toCharArray() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtServiceStartDt().toCharArray() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtSlsRepId() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtSlsRepLname() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtSlsRepFname() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtChnlDetail() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtOutletName() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtDistrictDesc() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtVzMktDesc() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtUniqueIdLine() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtSvcAddr1() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtSvcAddr2() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtSvcCity() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtSvcState() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtSvcZipCode() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtShsArea().getExtSpoTbl(0).getExtMfgNm() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtShsArea().getExtSpoTbl(0).getExtPrdNme() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtShsArea().getExtSpoTbl(0).getExtMacid() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtShsArea().getExtSpoTbl(0).getExtActivationDate() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtShsArea().getExtSpoTbl(1).getExtMfgNm() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtShsArea().getExtSpoTbl(1).getExtPrdNme() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtShsArea().getExtSpoTbl(1).getExtMacid() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtShsArea().getExtSpoTbl(1).getExtActivationDate() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtShsArea().getExtSpoTbl(2).getExtMfgNm() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtShsArea().getExtSpoTbl(2).getExtPrdNme() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtShsArea().getExtSpoTbl(2).getExtMacid() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtShsArea().getExtSpoTbl(2).getExtActivationDate() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtShsArea().getExtSpoTbl(3).getExtMfgNm() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtShsArea().getExtSpoTbl(3).getExtPrdNme() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtShsArea().getExtSpoTbl(3).getExtMacid() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtShsArea().getExtSpoTbl(3).getExtActivationDate() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtShsArea().getExtSpoTbl(4).getExtMfgNm() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtShsArea().getExtSpoTbl(4).getExtPrdNme() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtShsArea().getExtSpoTbl(4).getExtMacid() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtShsArea().getExtSpoTbl(4).getExtActivationDate() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtShsArea().getExtSpoTbl(5).getExtMfgNm() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtShsArea().getExtSpoTbl(5).getExtPrdNme() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtShsArea().getExtSpoTbl(5).getExtMacid() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtShsArea().getExtSpoTbl(5).getExtActivationDate() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( extractRec.getExtSkuId() , CONSTANTS.SPACE_2 ) );
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3),charArray.get(4),charArray.get(5),charArray.get(6),charArray.get(7),charArray.get(8),charArray.get(9),charArray.get(10),charArray.get(11),charArray.get(12),charArray.get(13),charArray.get(14),charArray.get(15),charArray.get(16),charArray.get(17),charArray.get(18),charArray.get(19),charArray.get(20),charArray.get(21),charArray.get(22),charArray.get(23),charArray.get(24),charArray.get(25),charArray.get(26),charArray.get(27),charArray.get(28),charArray.get(29),charArray.get(30),charArray.get(31),charArray.get(32),charArray.get(33),charArray.get(34),charArray.get(35),charArray.get(36),charArray.get(37),charArray.get(38),charArray.get(39),charArray.get(40),charArray.get(41),charArray.get(42),charArray.get(43),charArray.get(44),charArray.get(45),charArray.get(46),charArray.get(47),charArray.get(48),charArray.get(49),charArray.get(50),charArray.get(51),charArray.get(52),charArray.get(53),charArray.get(54),charArray.get(55),charArray.get(56),charArray.get(57),charArray.get(58),charArray.get(59),charArray.get(60),charArray.get(61),charArray.get(62),charArray.get(63),charArray.get(64),charArray.get(65),charArray.get(66),charArray.get(67),charArray.get(68),charArray.get(69),charArray.get(70),charArray.get(71),charArray.get(72),charArray.get(73),charArray.get(74),charArray.get(75),charArray.get(76),charArray.get(77),charArray.get(78),charArray.get(79),charArray.get(80),charArray.get(81),charArray.get(82),charArray.get(83),charArray.get(84),charArray.get(85),charArray.get(86),charArray.get(87),charArray.get(88),charArray.get(89),charArray.get(90),charArray.get(91),charArray.get(92),charArray.get(93),charArray.get(94),charArray.get(95),charArray.get(96),charArray.get(97),charArray.get(98),charArray.get(99),charArray.get(100),charArray.get(101),charArray.get(102),charArray.get(103),charArray.get(104),charArray.get(105),charArray.get(106),charArray.get(107),charArray.get(108),charArray.get(109),charArray.get(110),charArray.get(111),charArray.get(112),charArray.get(113),charArray.get(114),charArray.get(115),charArray.get(116),charArray.get(117),charArray.get(118),charArray.get(119),charArray.get(120),charArray.get(121),charArray.get(122),charArray.get(123),charArray.get(124),charArray.get(125),charArray.get(126),charArray.get(127),charArray.get(128),charArray.get(129),charArray.get(130),charArray.get(131),charArray.get(132),charArray.get(133),charArray.get(134),charArray.get(135),charArray.get(136),charArray.get(137),charArray.get(138),charArray.get(139),charArray.get(140),charArray.get(141),charArray.get(142),charArray.get(143),charArray.get(144),charArray.get(145),charArray.get(146),charArray.get(147),charArray.get(148),charArray.get(149),charArray.get(150),charArray.get(151),charArray.get(152),charArray.get(153),charArray.get(154),charArray.get(155),charArray.get(156),charArray.get(157),charArray.get(158),charArray.get(159),charArray.get(160),charArray.get(161),charArray.get(162),charArray.get(163),charArray.get(164),charArray.get(165),charArray.get(166),charArray.get(167),charArray.get(168),charArray.get(169),charArray.get(170),charArray.get(171),charArray.get(172),charArray.get(173),charArray.get(174),charArray.get(175),charArray.get(176),charArray.get(177),charArray.get(178),charArray.get(179),charArray.get(180),charArray.get(181),charArray.get(182),charArray.get(183),charArray.get(184),charArray.get(185),charArray.get(186),charArray.get(187),charArray.get(188),charArray.get(189),charArray.get(190),charArray.get(191),charArray.get(192),charArray.get(193),charArray.get(194),charArray.get(195),charArray.get(196),charArray.get(197),charArray.get(198),charArray.get(199),charArray.get(200),charArray.get(201),charArray.get(202),charArray.get(203),charArray.get(204),charArray.get(205),charArray.get(206));
          updated = updateString(work.getDelimRec() ,joinCharArray);
          work.setDelimRec(  (char[])updated.get("string"));
  
//  DISPLAY 'STRING: ' WS-DELIM-REC
          logger.info("STRING: {}", new String(work.getDelimRec())); 
          ;
      
      }
      /**
      * displayParms 
      *   This method is derived from 
  *   COBOL Paragraph - 1000-DISPLAY-PARMS COBOL Cyclomatic complexity - 1
      * Input  :  

      * - p1Cnt                          COBOL Name: WS-P1-CNT
      * - parm1                          COBOL Name: WS-PARM-1
      * - p2Cnt                          COBOL Name: WS-P2-CNT
      * - parm2                          COBOL Name: WS-PARM-2
      * - p3Cnt                          COBOL Name: WS-P3-CNT
      * - parm3                          COBOL Name: WS-PARM-3
      * - p4Cnt                          COBOL Name: WS-P4-CNT
      * - parm4                          COBOL Name: WS-PARM-4
      * - p5Cnt                          COBOL Name: WS-P5-CNT
      * - parm5                          COBOL Name: WS-PARM-5
      * - p6Cnt                          COBOL Name: WS-P6-CNT
      * - parm6                          COBOL Name: WS-PARM-6
      *
      * Output :  

      * - edit                           COBOL Name: WS-EDIT
      * - p1Cnt                          COBOL Name: WS-P1-CNT
      * - p2Cnt                          COBOL Name: WS-P2-CNT
      * - p3Cnt                          COBOL Name: WS-P3-CNT
      * - p4Cnt                          COBOL Name: WS-P4-CNT
      * - p5Cnt                          COBOL Name: WS-P5-CNT
      * - p6Cnt                          COBOL Name: WS-P6-CNT
      *
      * @throws CFException
      */
      private void displayParms() throws Exception {
      
// *----------------------------------------------------------------*

// *----------------------------------------------------------------*
//  MOVE WS-P1-CNT TO WS-EDIT
//  FORMAT_1441609963 = "----9"
          work.setEdit(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1441609963,String.valueOf(work.getP1Cnt()).toCharArray()));
//  DISPLAY 'Parm 1....: ' WS-PARM-1
          logger.info("Parm 1....: {}", new String(work.getParm1())); 
//  DISPLAY 'Parm 1 Len: ' WS-EDIT
          logger.info("Parm 1 Len: {}", new String(work.getEdit())); 
//  MOVE WS-P2-CNT TO WS-EDIT
//  FORMAT_1441609963 = "----9"
          work.setEdit(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1441609963,String.valueOf(work.getP2Cnt()).toCharArray()));
//  DISPLAY 'Parm 2....: ' WS-PARM-2
          logger.info("Parm 2....: {}", new String(work.getParm2())); 
//  DISPLAY 'Parm 2 Len: ' WS-EDIT
          logger.info("Parm 2 Len: {}", new String(work.getEdit())); 
//  MOVE WS-P3-CNT TO WS-EDIT
//  FORMAT_1441609963 = "----9"
          work.setEdit(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1441609963,String.valueOf(work.getP3Cnt()).toCharArray()));
//  DISPLAY 'Parm 3....: ' WS-PARM-3
          logger.info("Parm 3....: {}", new String(work.getParm3())); 
//  DISPLAY 'Parm 3 Len: ' WS-EDIT
          logger.info("Parm 3 Len: {}", new String(work.getEdit())); 
//  MOVE WS-P4-CNT TO WS-EDIT
//  FORMAT_1441609963 = "----9"
          work.setEdit(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1441609963,String.valueOf(work.getP4Cnt()).toCharArray()));
//  DISPLAY 'Parm 4....: ' WS-PARM-4
          logger.info("Parm 4....: {}", new String(work.getParm4())); 
//  DISPLAY 'Parm 4 Len: ' WS-EDIT
          logger.info("Parm 4 Len: {}", new String(work.getEdit())); 
//  MOVE WS-P5-CNT TO WS-EDIT
//  FORMAT_1441609963 = "----9"
          work.setEdit(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1441609963,String.valueOf(work.getP5Cnt()).toCharArray()));
//  DISPLAY 'Parm 5....: ' WS-PARM-5
          logger.info("Parm 5....: {}", new String(work.getParm5())); 
//  DISPLAY 'Parm 5 Len: ' WS-EDIT
          logger.info("Parm 5 Len: {}", new String(work.getEdit())); 
//  MOVE WS-P6-CNT TO WS-EDIT
//  FORMAT_1441609963 = "----9"
          work.setEdit(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1441609963,String.valueOf(work.getP6Cnt()).toCharArray()));
//  DISPLAY 'Parm 6....: ' WS-PARM-6
          logger.info("Parm 6....: {}", new String(work.getParm6())); 
//  DISPLAY 'Parm 6 Len: ' WS-EDIT
          logger.info("Parm 6 Len: {}", new String(work.getEdit())); 
//  DISPLAY '  '
          logger.info("  "); 
//  DISPLAY '*--------------------------------------*'
          logger.info("*--------------------------------------*"); 
//  DISPLAY '  '
          logger.info("  "); 
          ;
      
      }
      /**
      * noOverflow 
      *   This method is derived from 
  *   COBOL Paragraph - 2000-NO-OVERFLOW COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void noOverflow() throws Exception {
      
// *----------------------------------------------------------------*

// *----------------------------------------------------------------*
//  DISPLAY 'Done with unstring'
          logger.info("Done with unstring"); 
          ;
      
      }
      /**
      * overflow 
      *   This method is derived from 
  *   COBOL Paragraph - 3000-OVERFLOW COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void overflow() throws Exception {
      
// *----------------------------------------------------------------*

// *----------------------------------------------------------------*
//  DISPLAY 'Too many parms in string'
          logger.info("Too many parms in string"); 
          ;
      
      }
      /**
      * goback 
      *   This method is derived from 
  *   COBOL Paragraph - 9999-GOBACK COBOL Cyclomatic complexity - 2
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      private void goback() throws Exception {
      
// *----------------------------------------------------------------*

// *----------------------------------------------------------------*
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
  
  
        /**
         * Split the Original String with the given splitBy and return the ArrayList<Pair> 
         * @param original - Eg: one,two,,three,four,,five
         * @param splitBy - , 
         * @return result - List<Pair> (splitString,delimiter)
         */
              public List<Pair> splitString(char[] original,String splitBy) {
            	 	List<Pair> resultStrArr = new ArrayList<>();
                   Pattern pattern = patternMap.computeIfAbsent(splitBy, k -> Pattern.compile(splitBy));
                   Matcher m = pattern.matcher(CharBuffer.wrap(original));
                  	int start = 0;
                  	while (m.find()) {
                  		resultStrArr.add(new Pair(Arrays.copyOfRange(original, start, m.start()),m.group().toCharArray()));
                  		start = m.end();
                  	}
                  	if(start<original.length)
                  	   resultStrArr.add(new Pair(Arrays.copyOfRange(original, start,original.length),new char[0]));
                    return resultStrArr;
              }
      
        
  
  
  
  
  }
