  package com.cloudframe.app.process.impl;
  /* 
*----------------------------------------------------------------*
*----------------------------------------------------------------*
*/
  
  import com.cloudframe.app.cfstring.CfstringCtx.*;
  import com.cloudframe.app.cfstring.CfstringCtx;
  import com.cloudframe.app.process.Cfstring;
  import com.cloudframe.app.process.BaseProcess;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.slf4j.Logger;
  import org.slf4j.LoggerFactory;
  import com.cloudframe.app.exception.CFException;
  import org.springframework.stereotype.Component;
  import org.springframework.web.bind.annotation.RestController;
  import com.cloudframe.app.dto.GlobalExecutorCtx;
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
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.cfstring.dto.*;
  import com.cloudframe.app.cfstring.dto.ExtractRec;
  import com.cloudframe.app.cfstring.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("cfstring")
  
  public class CfstringImpl extends CommonProcess implements Cfstring {
  
  Logger logger = LoggerFactory.getLogger(CfstringImpl.class);
  
  
  
  
  
  
  private int tallyCount = 0;
  private Map<String, Pattern> patternMap = new HashMap<>();
  
  
  
  
      /**
      * process 
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      public int process(CfstringCtx programCtx) throws Exception {
       try {
       setCodePage("1047");
            // Reset program ended flag
           programCtx.setProgramEnded(false);
          ;
//  PERFORM 0000-MAINLINE
          mainline(programCtx);/*0000-MAINLINE*/
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
  *   COBOL Paragraph - 0000-MAINLINE COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void mainline(CfstringCtx programCtx) throws Exception {
//  PERFORM 0010-INSPECT THRU 0010-EXIT
          inspect(programCtx.getInspectInCtx());/*0010-INSPECT*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  PERFORM 0020-UNSTRING-1 THRU 0020-EXIT
          unstring1(programCtx.getUnstring1InCtx());/*0020-UNSTRING-1*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  PERFORM 0030-UNSTRING-2 THRU 0030-EXIT
          unstring2(programCtx.getUnstring2InCtx());/*0030-UNSTRING-2*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//  PERFORM 0040-STRING-1 THRU 0040-EXIT
          string1(programCtx.getString1InCtx());/*0040-STRING-1*/
          if (programCtx.isProgramEnded()) {
              return ;
          }
//cobolCode::GO TO 9999-GOBACK
goback(programCtx);
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
      @Override
      public InspectOutCtx inspect(InspectInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*

// *----------------------------------------------------------------*
CfstringCtx programCtx = methodIn.getCfstringCtx();
InspectOutCtx methodOut = methodIn.getInspectOutCtx();
//  DISPLAY '*--------------------------------------*'
          logger.info("*--------------------------------------*"); 
//  DISPLAY 'String before inspect replacing:'
          logger.info("String before inspect replacing:"); 
//  DISPLAY WS-STRING-1
          logger.info(new String(methodOut.getString1())); 
//  DISPLAY ' '
          logger.info(" "); 
          // MOVE WS-STRING-1 TO WS-HOLD-STRING
          methodOut.setHoldString(methodOut.getString1());
//  INSPECT WS-STRING-1 TALLYING WS-CNT1 FOR ALL '%'
          tallyCount = tallyAll(methodOut.getString1(),CONSTANTS.LITERAL_PR_);
          methodIn.setCnt1(    methodIn.getCnt1() + tallyCount );
//  DISPLAY "Number of % signs: " WS-CNT1
          logger.info("Number of % signs: {}", String.valueOf(methodIn.getCnt1())); 
//  INSPECT WS-STRING-1 REPLACING ALL '%' BY '$'
          methodOut.setString1(  replaceAll(methodOut.getString1(),CONSTANTS.LITERAL_PR_,CONSTANTS.LITERAL_33824)  );
//  DISPLAY 'After replacing % with $:'
          logger.info("After replacing % with $:"); 
//  DISPLAY WS-STRING-1
          logger.info(new String(methodOut.getString1())); 
//  DISPLAY ' '
          logger.info(" "); 
//  DISPLAY '*--------------------------------------*'
          logger.info("*--------------------------------------*"); 
          ;
      
      return methodOut;
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
      @Override
      public Unstring1OutCtx unstring1(Unstring1InCtx methodIn) throws Exception {
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
			ArrayList<String> splitBy = null;
			List<Pair> result = null;
			boolean overflow = false;
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			Map<String,Object> updated = null;
			// End of variable declaration

      
// *----------------------------------------------------------------*

// *----------------------------------------------------------------*
CfstringCtx programCtx = methodIn.getCfstringCtx();
Unstring1OutCtx methodOut = methodIn.getUnstring1OutCtx();
//  DISPLAY 'Unstring with sufficient parms'
          logger.info("Unstring with sufficient parms"); 
          // MOVE SPACES TO WS-PARM-1 , WS-PARM-2 , WS-PARM-3 , WS-PARM-4 , WS-PARM-5 , WS-PARM-6
          methodOut.setParm1(CONSTANTS.SPACE_30);
          methodOut.setParm2(CONSTANTS.SPACE_30);
          methodOut.setParm3(CONSTANTS.SPACE_30);
          methodOut.setParm4(CONSTANTS.SPACE_30);
          methodOut.setParm5(CONSTANTS.SPACE_30);
          methodOut.setParm6(CONSTANTS.SPACE_30);
//  MOVE +0 TO WS-P1-CNT , WS-P2-CNT , WS-P3-CNT , WS-P4-CNT , WS-P5-CNT , WS-P6-CNT
          methodOut.setP1Cnt(0);
          methodOut.setP2Cnt(0);
          methodOut.setP3Cnt(0);
          methodOut.setP4Cnt(0);
          methodOut.setP5Cnt(0);
          methodOut.setP6Cnt(0);
//  UNSTRING WS-STRING-1 DELIMITED BY '%' OR '$' INTO WS-PARM-1 COUNT IN WS-P1-CNT , WS-PARM-2 COUNT IN WS-P2-CNT , WS-PARM-3 COUNT IN WS-P3-CNT , WS-PARM-4 , WS-PARM-5 COUNT IN WS-P5-CNT , WS-PARM-6 COUNT IN WS-P6-CNT
          //This will have the no of characters parsed while un string. On NoOverflow pointerCnt == actualstring.length
          actualUnstringStr = methodIn.getString1();
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
          	methodOut.setParm1(resultKey);
          methodOut.setP1Cnt(resultKey.length);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setParm2(resultKey);
          methodOut.setP2Cnt(resultKey.length);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setParm3(resultKey);
          methodOut.setP3Cnt(resultKey.length);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setParm4(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setParm5(resultKey);
          methodOut.setP5Cnt(resultKey.length);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setParm6(resultKey);
          methodOut.setP6Cnt(resultKey.length);
          	
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
               noOverflow(programCtx);/*2000-NO-OVERFLOW*/
           }
//  PERFORM 1000-DISPLAY-PARMS THRU 1000-EXIT
          displayParms(programCtx.getDisplayParmsInCtx());/*1000-DISPLAY-PARMS*/

// *            Not on overflow display 'done with unstring'
//  MOVE '*' TO WS-PARM-5 ( WS-P5-CNT + 1 : 1)
//  LITERAL_STR_ = '*'
          methodOut.setParm5(replace(methodOut.getParm5(),CONSTANTS.LITERAL_STR_,(methodOut.getP5Cnt() + 1-1), (methodOut.getP5Cnt() + 1 + 0) ));
//  MOVE +1 TO WS-P2-CNT
          methodOut.setP2Cnt(1);
//  STRING WS-PARM-1 (1 : WS-P1-CNT ) '%' DELIMITED BY SIZE WS-PARM-2 '%' DELIMITED BY SPACES WS-PARM-3 (1 : WS-P3-CNT ) '%' DELIMITED BY SIZE WS-PARM-4 '%' DELIMITED BY SPACES WS-PARM-5 DELIMITED BY '*' INTO WS-STRING-2 WITH POINTER WS-P2-CNT
          charArray = new ArrayList<char[]>();
             charArray.add(substring(methodOut.getParm1(),0,methodOut.getP1Cnt()));
             charArray.add(CONSTANTS.LITERAL_PR_);
             charArray.add(splitFirst( methodOut.getParm2() , CONSTANTS.SPACE ) );
             charArray.add(splitFirst( CONSTANTS.LITERAL_PR_ , CONSTANTS.SPACE ) );
             charArray.add(substring(methodOut.getParm3(),0,methodOut.getP3Cnt()));
             charArray.add(CONSTANTS.LITERAL_PR_);
             charArray.add(splitFirst( methodOut.getParm4() , CONSTANTS.SPACE ) );
             charArray.add(splitFirst( CONSTANTS.LITERAL_PR_ , CONSTANTS.SPACE ) );
             charArray.add(splitFirst( methodOut.getParm5() , CONSTANTS.LITERAL_STR_ ) );
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3),charArray.get(4),charArray.get(5),charArray.get(6),charArray.get(7),charArray.get(8));
          updated = updateString(methodOut.getString2() ,joinCharArray ,(methodOut.getP2Cnt()-1));
          methodOut.setString2(   (char[])updated.get("string"));
          methodOut.setP2Cnt((int)updated.get("startAt"));
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
          methodOut.setP2Cnt(methodOut.getP2Cnt() - 1);
//  MOVE WS-P2-CNT TO WS-EDIT
//  FORMAT_1441609963 = "----9"
          methodOut.setEdit(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1441609963,String.valueOf(methodOut.getP2Cnt()).toCharArray()));
//  DISPLAY 'Length of restrung data: ' WS-EDIT
          logger.info("Length of restrung data: {}", new String(methodOut.getEdit())); 
//  IF WS-STRING-2 = WS-HOLD-STRING
          if (		compareChars(methodOut.getString2(),methodIn.getHoldString()) == 0 ) { 
//  DISPLAY 'Restring worked'
              logger.info("Restring worked"); 
          }
//  ELSE
          else { 
//  DISPLAY 'Original String: ' WS-HOLD-STRING
              logger.info("Original String: {}", new String(methodIn.getHoldString())); 
//  DISPLAY 'Restrung String: ' WS-STRING-2
              logger.info("Restrung String: {}", new String(methodOut.getString2())); 
          }
          ;
      
      return methodOut;
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
      @Override
      public Unstring2OutCtx unstring2(Unstring2InCtx methodIn) throws Exception {
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
CfstringCtx programCtx = methodIn.getCfstringCtx();
Unstring2OutCtx methodOut = methodIn.getUnstring2OutCtx();
//  DISPLAY 'Unstring with insufficient parms'
          logger.info("Unstring with insufficient parms"); 
          // MOVE SPACES TO WS-PARM-1 , WS-PARM-2 , WS-PARM-3 , WS-PARM-4 , WS-PARM-5 , WS-PARM-6
          methodOut.setParm1(CONSTANTS.SPACE_30);
          methodOut.setParm2(CONSTANTS.SPACE_30);
          methodOut.setParm3(CONSTANTS.SPACE_30);
          methodOut.setParm4(CONSTANTS.SPACE_30);
          methodOut.setParm5(CONSTANTS.SPACE_30);
          methodOut.setParm6(CONSTANTS.SPACE_30);
//  MOVE +0 TO WS-P1-CNT , WS-P2-CNT , WS-P3-CNT , WS-P4-CNT , WS-P5-CNT , WS-P6-CNT
          methodOut.setP1Cnt(0);
          methodOut.setP2Cnt(0);
          methodOut.setP3Cnt(0);
          methodOut.setP4Cnt(0);
          methodOut.setP5Cnt(0);
          methodOut.setP6Cnt(0);
//  UNSTRING WS-STRING-1 DELIMITED BY '%' OR '$' INTO WS-PARM-1 COUNT IN WS-P1-CNT , WS-PARM-2 COUNT IN WS-P2-CNT
          //This will have the no of characters parsed while un string. On NoOverflow pointerCnt == actualstring.length
          actualUnstringStr = methodIn.getString1();
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
          	methodOut.setParm1(resultKey);
          methodOut.setP1Cnt(resultKey.length);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	methodOut.setParm2(resultKey);
          methodOut.setP2Cnt(resultKey.length);
          	
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
               overflow(programCtx);/*3000-OVERFLOW*/
          } else  {
          //  NOT ON OVERFLOW
          //  DISPLAY 'Done with unstring'
               logger.info("Done with unstring"); 
           }
//  PERFORM 1000-DISPLAY-PARMS THRU 1000-EXIT
          displayParms(programCtx.getDisplayParmsInCtx());/*1000-DISPLAY-PARMS*/
          ;
      
      return methodOut;
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
      @Override
      public String1OutCtx string1(String1InCtx methodIn) throws Exception {
			// Declare local variables used in the method
			ArrayList<char[]> charArray = new ArrayList<char[]>();
			char[] joinCharArray = null;
			Map<String,Object> updated = null;
			// End of variable declaration

CfstringCtx programCtx = methodIn.getCfstringCtx();
String1OutCtx methodOut = methodIn.getString1OutCtx();

// *
//  STRING WS-EXT-MTN DELIMITED BY SIZE '|' DELIMITED BY SIZE WS-EXT-LNAME DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-FNAME DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-ACT-EFF-DT DELIMITED BY SIZE '|' DELIMITED BY SIZE WS-EXT-CARRIER-NAME DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-DEVICE-ID DELIMITED BY ' ' '|' DELIMITED BY SIZE WS-EXT-REGION-CD DELIMITED BY ' ' '|' DELIMITED BY SIZE WS-EXT-OUTLET-ID DELIMITED BY ' ' '|' DELIMITED BY SIZE WS-EXT-MFG-NME DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-PROD-NME DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-ADDR1 DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-ADDR2 DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-CITY DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-STATE DELIMITED BY ' ' '|' DELIMITED BY SIZE WS-EXT-ZIP-CODE DELIMITED BY ' ' '|' DELIMITED BY SIZE WS-EXT-ANALOG-DIGITAL-CD DELIMITED BY SIZE '|' DELIMITED BY SIZE WS-EXT-TERMNL-OPT-CD DELIMITED ' ' '|' DELIMITED BY SIZE WS-EXT-WARRANTY DELIMITED BY SIZE '|' DELIMITED BY SIZE WS-EXT-MTN-EFF-DT DELIMITED BY SIZE '|' DELIMITED BY SIZE WS-EXT-CUST-ID-NO DELIMITED BY ' ' '|' DELIMITED BY SIZE WS-EXT-ACCT-NO DELIMITED BY ' ' '|' DELIMITED BY SIZE WS-EXT-ACT-DEACT DELIMITED BY ' ' '|' DELIMITED BY SIZE WS-EXT-PRICE-PLAN DELIMITED BY SIZE '|' DELIMITED BY SIZE WS-EXT-SFO ( WS-LEN + 1 : ) DELIMITED BY SIZE '|' DELIMITED BY SIZE WS-EXT-MARKET-CD DELIMITED BY SIZE '|' DELIMITED BY SIZE WS-EXT-MIN-ID DELIMITED BY SIZE '|' DELIMITED BY SIZE WS-EXT-AUSER-CNT DELIMITED BY SIZE '|' DELIMITED BY SIZE WS-EXT-AUTH-USR-LNAME (1) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-AUTH-USR-FNAME (1) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-AUTH-USR-LNAME (2) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-AUTH-USR-FNAME (2) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-AUTH-USR-LNAME (3) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-AUTH-USR-FNAME (3) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-AUTH-USR-LNAME (4) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-AUTH-USR-FNAME (4) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-AUTH-USR-LNAME (5) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-AUTH-USR-FNAME (5) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-AUTH-USR-LNAME (6) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-AUTH-USR-FNAME (6) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-AUTH-USR-LNAME (7) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-AUTH-USR-FNAME (7) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-AUTH-USR-LNAME (8) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-AUTH-USR-FNAME (8) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-AUTH-USR-LNAME (9) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-AUTH-USR-FNAME (9) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-AUTH-USR-LNAME (10) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-AUTH-USR-FNAME (10) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-ICCID DELIMITED BY ' ' '|' DELIMITED BY SIZE WS-EXT-DEVICE-ID-TYPE DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-DVC-TRANS-RSN-CD DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-ACTV-REQ-DT DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-CUST-TYPE-CD DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-SFO-SPO-INDICATOR DELIMITED BY SIZE '|' DELIMITED BY SIZE WS-EXT-LEVEL DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-LINE-STATUS DELIMITED BY SPACES '|' DELIMITED BY SIZE WS-EXT-FIN-MARKET-CODE DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-EMAIL-ADDR1 DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-EMAIL-ADDR2 DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-EMAIL-ADDR3 DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-SVC-ID-NO-P1 DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-SVC-ID-NO-P2 DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-LOCATION-STATE DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-UNIQUE-ID DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-BRAND-IDENTIFIER DELIMITED BY SIZE '|' DELIMITED BY SIZE WS-EXT-BILL-CYCLE-DT DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-SERVICE-START-DT DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-SLS-REP-ID DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-SLS-REP-LNAME DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-SLS-REP-FNAME DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-CHNL-DETAIL DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-OUTLET-NAME DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-DISTRICT-DESC DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-VZ-MKT-DESC DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-UNIQUE-ID-LINE DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-SVC-ADDR1 DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-SVC-ADDR2 DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-SVC-CITY DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-SVC-STATE DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-SVC-ZIP-CODE DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-MFG-NM (1) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-PRD-NME (1) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-MACID (1) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-ACTIVATION-DATE (1) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-MFG-NM (2) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-PRD-NME (2) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-MACID (2) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-ACTIVATION-DATE (2) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-MFG-NM (3) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-PRD-NME (3) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-MACID (3) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-ACTIVATION-DATE (3) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-MFG-NM (4) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-PRD-NME (4) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-MACID (4) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-ACTIVATION-DATE (4) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-MFG-NM (5) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-PRD-NME (5) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-MACID (5) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-ACTIVATION-DATE (5) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-MFG-NM (6) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-PRD-NME (6) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-MACID (6) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-ACTIVATION-DATE (6) DELIMITED BY '  ' '|' DELIMITED BY SIZE WS-EXT-SKU-ID DELIMITED BY '  ' INTO WS-DELIM-REC END-STRING
          charArray = new ArrayList<char[]>();
             charArray.add(methodIn.getExtMtn());
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtLname() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtFname() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(methodIn.getExtActEffDt().toCharArray());
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtCarrierName() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtDeviceId() , CONSTANTS.SPACE ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtRegionCd() , CONSTANTS.SPACE ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( String.valueOf(methodIn.getExtOutletIdString()).toCharArray() , CONSTANTS.SPACE ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtMfgNme() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtProdNme() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtAddr1() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtAddr2() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtCity() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtState() , CONSTANTS.SPACE ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtZipCode() , CONSTANTS.SPACE ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(methodIn.getExtAnalogDigitalCd());
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtTermnlOptCd() , CONSTANTS.SPACE ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(methodIn.getExtWarranty());
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(methodIn.getExtMtnEffDt());
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( String.valueOf(methodIn.getExtCustIdNoString()).toCharArray() , CONSTANTS.SPACE ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( String.valueOf(methodIn.getExtAcctNoString()).toCharArray() , CONSTANTS.SPACE ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtActDeact() , CONSTANTS.SPACE ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(String.valueOf(methodIn.getExtPricePlanString()).toCharArray());
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(String.valueOf(substring(methodIn.getExtSfoString(),(methodIn.getLen() + 1-1), (methodIn.getLen() + 1 + 9) )).toCharArray());
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(methodIn.getExtMarketCd());
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(methodIn.getExtMinId());
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(String.valueOf(methodIn.getExtAuserCntString()).toCharArray());
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtAuthUsrLname(0) , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtAuthUsrFname(0) , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtAuthUsrLname(1) , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtAuthUsrFname(1) , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtAuthUsrLname(2) , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtAuthUsrFname(2) , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtAuthUsrLname(3) , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtAuthUsrFname(3) , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtAuthUsrLname(4) , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtAuthUsrFname(4) , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtAuthUsrLname(5) , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtAuthUsrFname(5) , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtAuthUsrLname(6) , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtAuthUsrFname(6) , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtAuthUsrLname(7) , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtAuthUsrFname(7) , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtAuthUsrLname(8) , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtAuthUsrFname(8) , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtAuthUsrLname(9) , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtAuthUsrFname(9) , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtIccid() , CONSTANTS.SPACE ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtDeviceIdType() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getDvcTransRsnCd() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtActvReqDt() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtCustTypeCd() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(methodIn.getExtSfoSpoIndicator());
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtLevel() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtLineStatus() , CONSTANTS.SPACE ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtFinMarketCode() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtEmailAddr1() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtEmailAddr2() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtEmailAddr3() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getSvcIdNoP1() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getSvcIdNoP2() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtLocationState() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( String.valueOf(methodIn.getExtUniqueIdString()).toCharArray() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(methodIn.getExtBrandIdentifier());
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtBillCycleDt().toCharArray() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtServiceStartDt().toCharArray() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtSlsRepId() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtSlsRepLname() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtSlsRepFname() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtChnlDetail() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtOutletName() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtDistrictDesc() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtVzMktDesc() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtUniqueIdLine() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtSvcAddr1() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtSvcAddr2() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtSvcCity() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtSvcState() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtSvcZipCode() , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtMfgNm(0) , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtPrdNme(0) , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtMacid(0) , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtActivationDate(0) , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtMfgNm(1) , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtPrdNme(1) , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtMacid(1) , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtActivationDate(1) , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtMfgNm(2) , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtPrdNme(2) , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtMacid(2) , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtActivationDate(2) , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtMfgNm(3) , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtPrdNme(3) , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtMacid(3) , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtActivationDate(3) , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtMfgNm(4) , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtPrdNme(4) , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtMacid(4) , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtActivationDate(4) , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtMfgNm(5) , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtPrdNme(5) , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtMacid(5) , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtActivationDate(5) , CONSTANTS.SPACE_2 ) );
             charArray.add(CONSTANTS.LITERAL_36552);
             charArray.add(splitFirst( methodIn.getExtSkuId() , CONSTANTS.SPACE_2 ) );
          joinCharArray = Field.mergeArrays(charArray.get(0),charArray.get(1),charArray.get(2),charArray.get(3),charArray.get(4),charArray.get(5),charArray.get(6),charArray.get(7),charArray.get(8),charArray.get(9),charArray.get(10),charArray.get(11),charArray.get(12),charArray.get(13),charArray.get(14),charArray.get(15),charArray.get(16),charArray.get(17),charArray.get(18),charArray.get(19),charArray.get(20),charArray.get(21),charArray.get(22),charArray.get(23),charArray.get(24),charArray.get(25),charArray.get(26),charArray.get(27),charArray.get(28),charArray.get(29),charArray.get(30),charArray.get(31),charArray.get(32),charArray.get(33),charArray.get(34),charArray.get(35),charArray.get(36),charArray.get(37),charArray.get(38),charArray.get(39),charArray.get(40),charArray.get(41),charArray.get(42),charArray.get(43),charArray.get(44),charArray.get(45),charArray.get(46),charArray.get(47),charArray.get(48),charArray.get(49),charArray.get(50),charArray.get(51),charArray.get(52),charArray.get(53),charArray.get(54),charArray.get(55),charArray.get(56),charArray.get(57),charArray.get(58),charArray.get(59),charArray.get(60),charArray.get(61),charArray.get(62),charArray.get(63),charArray.get(64),charArray.get(65),charArray.get(66),charArray.get(67),charArray.get(68),charArray.get(69),charArray.get(70),charArray.get(71),charArray.get(72),charArray.get(73),charArray.get(74),charArray.get(75),charArray.get(76),charArray.get(77),charArray.get(78),charArray.get(79),charArray.get(80),charArray.get(81),charArray.get(82),charArray.get(83),charArray.get(84),charArray.get(85),charArray.get(86),charArray.get(87),charArray.get(88),charArray.get(89),charArray.get(90),charArray.get(91),charArray.get(92),charArray.get(93),charArray.get(94),charArray.get(95),charArray.get(96),charArray.get(97),charArray.get(98),charArray.get(99),charArray.get(100),charArray.get(101),charArray.get(102),charArray.get(103),charArray.get(104),charArray.get(105),charArray.get(106),charArray.get(107),charArray.get(108),charArray.get(109),charArray.get(110),charArray.get(111),charArray.get(112),charArray.get(113),charArray.get(114),charArray.get(115),charArray.get(116),charArray.get(117),charArray.get(118),charArray.get(119),charArray.get(120),charArray.get(121),charArray.get(122),charArray.get(123),charArray.get(124),charArray.get(125),charArray.get(126),charArray.get(127),charArray.get(128),charArray.get(129),charArray.get(130),charArray.get(131),charArray.get(132),charArray.get(133),charArray.get(134),charArray.get(135),charArray.get(136),charArray.get(137),charArray.get(138),charArray.get(139),charArray.get(140),charArray.get(141),charArray.get(142),charArray.get(143),charArray.get(144),charArray.get(145),charArray.get(146),charArray.get(147),charArray.get(148),charArray.get(149),charArray.get(150),charArray.get(151),charArray.get(152),charArray.get(153),charArray.get(154),charArray.get(155),charArray.get(156),charArray.get(157),charArray.get(158),charArray.get(159),charArray.get(160),charArray.get(161),charArray.get(162),charArray.get(163),charArray.get(164),charArray.get(165),charArray.get(166),charArray.get(167),charArray.get(168),charArray.get(169),charArray.get(170),charArray.get(171),charArray.get(172),charArray.get(173),charArray.get(174),charArray.get(175),charArray.get(176),charArray.get(177),charArray.get(178),charArray.get(179),charArray.get(180),charArray.get(181),charArray.get(182),charArray.get(183),charArray.get(184),charArray.get(185),charArray.get(186),charArray.get(187),charArray.get(188),charArray.get(189),charArray.get(190),charArray.get(191),charArray.get(192),charArray.get(193),charArray.get(194),charArray.get(195),charArray.get(196),charArray.get(197),charArray.get(198),charArray.get(199),charArray.get(200),charArray.get(201),charArray.get(202),charArray.get(203),charArray.get(204),charArray.get(205),charArray.get(206));
          updated = updateString(methodOut.getDelimRec() ,joinCharArray);
          methodOut.setDelimRec(  (char[])updated.get("string"));
//  DISPLAY 'STRING: ' WS-DELIM-REC
          logger.info("STRING: {}", new String(methodOut.getDelimRec())); 
          ;
      
      return methodOut;
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
      @Override
      public DisplayParmsOutCtx displayParms(DisplayParmsInCtx methodIn) throws Exception {
      
// *----------------------------------------------------------------*

// *----------------------------------------------------------------*
CfstringCtx programCtx = methodIn.getCfstringCtx();
DisplayParmsOutCtx methodOut = methodIn.getDisplayParmsOutCtx();
//  MOVE WS-P1-CNT TO WS-EDIT
//  FORMAT_1441609963 = "----9"
          methodOut.setEdit(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1441609963,String.valueOf(methodOut.getP1Cnt()).toCharArray()));
//  DISPLAY 'Parm 1....: ' WS-PARM-1
          logger.info("Parm 1....: {}", new String(methodIn.getParm1())); 
//  DISPLAY 'Parm 1 Len: ' WS-EDIT
          logger.info("Parm 1 Len: {}", new String(methodOut.getEdit())); 
//  MOVE WS-P2-CNT TO WS-EDIT
//  FORMAT_1441609963 = "----9"
          methodOut.setEdit(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1441609963,String.valueOf(methodOut.getP2Cnt()).toCharArray()));
//  DISPLAY 'Parm 2....: ' WS-PARM-2
          logger.info("Parm 2....: {}", new String(methodIn.getParm2())); 
//  DISPLAY 'Parm 2 Len: ' WS-EDIT
          logger.info("Parm 2 Len: {}", new String(methodOut.getEdit())); 
//  MOVE WS-P3-CNT TO WS-EDIT
//  FORMAT_1441609963 = "----9"
          methodOut.setEdit(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1441609963,String.valueOf(methodOut.getP3Cnt()).toCharArray()));
//  DISPLAY 'Parm 3....: ' WS-PARM-3
          logger.info("Parm 3....: {}", new String(methodIn.getParm3())); 
//  DISPLAY 'Parm 3 Len: ' WS-EDIT
          logger.info("Parm 3 Len: {}", new String(methodOut.getEdit())); 
//  MOVE WS-P4-CNT TO WS-EDIT
//  FORMAT_1441609963 = "----9"
          methodOut.setEdit(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1441609963,String.valueOf(methodOut.getP4Cnt()).toCharArray()));
//  DISPLAY 'Parm 4....: ' WS-PARM-4
          logger.info("Parm 4....: {}", new String(methodIn.getParm4())); 
//  DISPLAY 'Parm 4 Len: ' WS-EDIT
          logger.info("Parm 4 Len: {}", new String(methodOut.getEdit())); 
//  MOVE WS-P5-CNT TO WS-EDIT
//  FORMAT_1441609963 = "----9"
          methodOut.setEdit(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1441609963,String.valueOf(methodOut.getP5Cnt()).toCharArray()));
//  DISPLAY 'Parm 5....: ' WS-PARM-5
          logger.info("Parm 5....: {}", new String(methodIn.getParm5())); 
//  DISPLAY 'Parm 5 Len: ' WS-EDIT
          logger.info("Parm 5 Len: {}", new String(methodOut.getEdit())); 
//  MOVE WS-P6-CNT TO WS-EDIT
//  FORMAT_1441609963 = "----9"
          methodOut.setEdit(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1441609963,String.valueOf(methodOut.getP6Cnt()).toCharArray()));
//  DISPLAY 'Parm 6....: ' WS-PARM-6
          logger.info("Parm 6....: {}", new String(methodIn.getParm6())); 
//  DISPLAY 'Parm 6 Len: ' WS-EDIT
          logger.info("Parm 6 Len: {}", new String(methodOut.getEdit())); 
//  DISPLAY '  '
          logger.info("  "); 
//  DISPLAY '*--------------------------------------*'
          logger.info("*--------------------------------------*"); 
//  DISPLAY '  '
          logger.info("  "); 
          ;
      
      return methodOut;
      }
      /**
      * noOverflow 
      *   This method is derived from 
  *   COBOL Paragraph - 2000-NO-OVERFLOW COBOL Cyclomatic complexity - 1
      * Input  : None 

      * Output : None 

      * @throws CFException
      */
      @Override
      public void noOverflow(CfstringCtx programCtx) throws Exception {
      
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
      @Override
      public void overflow(CfstringCtx programCtx) throws Exception {
      
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
      @Override
      public void goback(CfstringCtx programCtx) throws Exception {
      
// *----------------------------------------------------------------*

// *----------------------------------------------------------------*
//  GOBACK
          setNotLogged(false); // no need to log, it is a normal termination
          programCtx.setProgramEnded(true);
          return ;
      
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
