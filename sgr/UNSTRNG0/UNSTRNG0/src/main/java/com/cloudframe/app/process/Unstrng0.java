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
  import com.cloudframe.app.exception.Terminate;
  import com.cloudframe.app.unstrng0.dto.*;
  import com.cloudframe.app.unstrng0.dto.Work;
  import com.cloudframe.app.common.CONSTANTS;
  
  @Component("unstrng0")
  
  public class Unstrng0 extends CommonProcess {
  
  Logger logger = LoggerFactory.getLogger(Unstrng0.class);
  
  private Work work = new Work() ;
  
  
  
  
  
  private Map<String, Pattern> patternMap = new HashMap<>();
  
  
  
  
      /**
      * process 
      * Input  :  

      * - inputRec                       COBOL Name: INPUT-REC
      * - valc                           COBOL Name: WS-VALC
      * - inputRecOverflw1               COBOL Name: INPUT-REC-OVERFLW1
      * - inputRecOverflw2               COBOL Name: INPUT-REC-OVERFLW2
      * - inputRecOverflw3               COBOL Name: INPUT-REC-OVERFLW3
      * - data0                          COBOL Name: WS-DATA0
      * - data                           COBOL Name: WS-DATA
      * - delim1                         COBOL Name: WS-DELIM1
      * - delim3                         COBOL Name: WS-DELIM3
      * - delim4                         COBOL Name: WS-DELIM4
      * - tally                          COBOL Name: WS-TALLY
      *
      * Output :  

      * - retain                         COBOL Name: WS-RETAIN
      * - val1                           COBOL Name: WS-VAL1
      * - val2                           COBOL Name: WS-VAL2
      * - val3                           COBOL Name: WS-VAL3
      * - val4                           COBOL Name: WS-VAL4
      * - val5                           COBOL Name: WS-VAL5
      * - val6                           COBOL Name: WS-VAL6
      * - val7                           COBOL Name: WS-VAL7
      * - val8                           COBOL Name: WS-VAL8
      * - val9                           COBOL Name: WS-VAL9
      * - vala                           COBOL Name: WS-VALA
      * - valb                           COBOL Name: WS-VALB
      * - count                          COBOL Name: WS-COUNT
      * - pointer                        COBOL Name: WS-POINTER
      * - field1                         COBOL Name: WS-FIELD1
      * - field2                         COBOL Name: WS-FIELD2
      * - field3                         COBOL Name: WS-FIELD3
      * - field4                         COBOL Name: WS-FIELD4
      * - field5                         COBOL Name: WS-FIELD5
      * - count1                         COBOL Name: WS-COUNT1
      * - count2                         COBOL Name: WS-COUNT2
      * - count3                         COBOL Name: WS-COUNT3
      * - count4                         COBOL Name: WS-COUNT4
      * - count5                         COBOL Name: WS-COUNT5
      *
      * @throws CFException
      */
      @Override
      public int process() throws Exception {
       initVars();
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
			// End of variable declaration

       try {
       setCodePage("1047");
          // MOVE ALL 'Z' TO WS-RETAIN
          work.setRetain(CONSTANTS.LITERAL_301812617);
//  UNSTRING INPUT-REC DELIMITED BY '|' INTO WS-VAL1 , WS-VAL2 , WS-VAL3 , WS-VAL4 , WS-VAL5 , WS-VAL6 , WS-VAL7 , WS-VAL8 , WS-VAL9 , WS-VALA WS-VALB COUNT IN WS-COUNT END-UNSTRING
          //This will have the no of characters parsed while un string. On NoOverflow pointerCnt == actualstring.length
          actualUnstringStr = work.getInputRec();
          //Construct an ArrayList by the given Delimited String. '+' will be added when there is ALL.EG ALL $, then delimited String will be $+
          splitBy = getArrayList(CONSTANTS.LITERAL_36552);
          //Create a RegularExpression String from the above delimited list (updateRegEx will add escape character \\ if in need, also group the values when required)
          updatedRegEx = updateRegEx(splitBy);
          //Split and store the String and delimited values.(EG : AABC$$$GH%, delimited by = ALL $, %, then result will have AABC - $ , GH - %)
          result = splitString(actualUnstringStr,updatedRegEx);
          loop = 0;
          try{
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setVal1(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setVal2(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setVal3(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setVal4(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setVal5(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setVal6(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setVal7(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setVal8(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setVal9(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setVala(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setValb(resultKey);
          work.setCount(resultKey.length);
          	
          	loop++;
          }
          catch(IndexOutOfBoundsException e ){
          	//logger.info(e.getMessage());
          }
//  DISPLAY '1. WS-COUNT ' WS-COUNT
          logger.info("1. WS-COUNT {}", String.valueOf(work.getCount())); 
//  DISPLAY '2. WS-VALB  ' WS-VALB
          logger.info("2. WS-VALB  {}", new String(work.getValb())); 
//  DISPLAY '3. WS-VALC  ' WS-VALC
          logger.info("3. WS-VALC  {}", new String(work.getValc())); 
//  DISPLAY '3A. RETAIN ' WS-RETAIN (1 : 50)
          logger.info("3A. RETAIN {}", new String(substring(work.getRetain(),0,50))); 

// *
          // MOVE ALL 'Z' TO WS-RETAIN
          work.setRetain(CONSTANTS.LITERAL_301812617);
//  UNSTRING INPUT-REC-OVERFLW1 DELIMITED BY '|' INTO WS-VAL1 , WS-VAL2 , WS-VAL3 , WS-VAL4 , WS-VAL5 , WS-VAL6 , WS-VAL7 , WS-VAL8 , WS-VAL9 , WS-VALA WS-VALB COUNT IN WS-COUNT END-UNSTRING
          //This will have the no of characters parsed while un string. On NoOverflow pointerCnt == actualstring.length
          actualUnstringStr = work.getInputRecOverflw1();
          //Construct an ArrayList by the given Delimited String. '+' will be added when there is ALL.EG ALL $, then delimited String will be $+
          splitBy = getArrayList(CONSTANTS.LITERAL_36552);
          //Create a RegularExpression String from the above delimited list (updateRegEx will add escape character \\ if in need, also group the values when required)
          updatedRegEx = updateRegEx(splitBy);
          //Split and store the String and delimited values.(EG : AABC$$$GH%, delimited by = ALL $, %, then result will have AABC - $ , GH - %)
          result = splitString(actualUnstringStr,updatedRegEx);
          loop = 0;
          try{
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setVal1(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setVal2(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setVal3(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setVal4(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setVal5(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setVal6(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setVal7(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setVal8(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setVal9(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setVala(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setValb(resultKey);
          work.setCount(resultKey.length);
          	
          	loop++;
          }
          catch(IndexOutOfBoundsException e ){
          	//logger.info(e.getMessage());
          }
//  DISPLAY '4. WS-COUNT ' WS-COUNT
          logger.info("4. WS-COUNT {}", String.valueOf(work.getCount())); 
//  DISPLAY '5. WS-VALB  ' WS-VALB
          logger.info("5. WS-VALB  {}", new String(work.getValb())); 
//  DISPLAY '6. WS-VALC  ' WS-VALC
          logger.info("6. WS-VALC  {}", new String(work.getValc())); 
//  DISPLAY '6A. RETAIN ' WS-RETAIN (1 : 50)
          logger.info("6A. RETAIN {}", new String(substring(work.getRetain(),0,50))); 

// *
          // MOVE ALL 'Z' TO WS-RETAIN
          work.setRetain(CONSTANTS.LITERAL_301812617);
//  UNSTRING INPUT-REC-OVERFLW2 DELIMITED BY '|' INTO WS-VAL1 , WS-VAL2 , WS-VAL3 , WS-VAL4 , WS-VAL5 , WS-VAL6 , WS-VAL7 , WS-VAL8 , WS-VAL9 , WS-VALA WS-VALB COUNT IN WS-COUNT END-UNSTRING
          //This will have the no of characters parsed while un string. On NoOverflow pointerCnt == actualstring.length
          actualUnstringStr = work.getInputRecOverflw2();
          //Construct an ArrayList by the given Delimited String. '+' will be added when there is ALL.EG ALL $, then delimited String will be $+
          splitBy = getArrayList(CONSTANTS.LITERAL_36552);
          //Create a RegularExpression String from the above delimited list (updateRegEx will add escape character \\ if in need, also group the values when required)
          updatedRegEx = updateRegEx(splitBy);
          //Split and store the String and delimited values.(EG : AABC$$$GH%, delimited by = ALL $, %, then result will have AABC - $ , GH - %)
          result = splitString(actualUnstringStr,updatedRegEx);
          loop = 0;
          try{
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setVal1(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setVal2(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setVal3(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setVal4(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setVal5(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setVal6(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setVal7(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setVal8(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setVal9(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setVala(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setValb(resultKey);
          work.setCount(resultKey.length);
          	
          	loop++;
          }
          catch(IndexOutOfBoundsException e ){
          	//logger.info(e.getMessage());
          }
//  DISPLAY '7. WS-COUNT ' WS-COUNT
          logger.info("7. WS-COUNT {}", String.valueOf(work.getCount())); 
//  DISPLAY '8. WS-VALB  ' WS-VALB
          logger.info("8. WS-VALB  {}", new String(work.getValb())); 
//  DISPLAY '9. WS-VALC  ' WS-VALC
          logger.info("9. WS-VALC  {}", new String(work.getValc())); 
//  DISPLAY '9A. RETAIN ' WS-RETAIN (1 : 50)
          logger.info("9A. RETAIN {}", new String(substring(work.getRetain(),0,50))); 

// *
          // MOVE ALL 'Z' TO WS-RETAIN
          work.setRetain(CONSTANTS.LITERAL_301812617);
//  UNSTRING INPUT-REC-OVERFLW3 DELIMITED BY '|' INTO WS-VAL1 , WS-VAL2 , WS-VAL3 , WS-VAL4 , WS-VAL5 , WS-VAL6 , WS-VAL7 , WS-VAL8 , WS-VAL9 , WS-VALA WS-VALB COUNT IN WS-COUNT END-UNSTRING
          //This will have the no of characters parsed while un string. On NoOverflow pointerCnt == actualstring.length
          actualUnstringStr = work.getInputRecOverflw3();
          //Construct an ArrayList by the given Delimited String. '+' will be added when there is ALL.EG ALL $, then delimited String will be $+
          splitBy = getArrayList(CONSTANTS.LITERAL_36552);
          //Create a RegularExpression String from the above delimited list (updateRegEx will add escape character \\ if in need, also group the values when required)
          updatedRegEx = updateRegEx(splitBy);
          //Split and store the String and delimited values.(EG : AABC$$$GH%, delimited by = ALL $, %, then result will have AABC - $ , GH - %)
          result = splitString(actualUnstringStr,updatedRegEx);
          loop = 0;
          try{
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setVal1(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setVal2(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setVal3(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setVal4(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setVal5(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setVal6(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setVal7(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setVal8(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setVal9(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setVala(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setValb(resultKey);
          work.setCount(resultKey.length);
          	
          	loop++;
          }
          catch(IndexOutOfBoundsException e ){
          	//logger.info(e.getMessage());
          }
//  DISPLAY '10. WS-COUNT ' WS-COUNT
          logger.info("10. WS-COUNT {}", String.valueOf(work.getCount())); 
//  DISPLAY '11. WS-VALB  ' WS-VALB
          logger.info("11. WS-VALB  {}", new String(work.getValb())); 
//  DISPLAY '12. WS-VALC  ' WS-VALC
          logger.info("12. WS-VALC  {}", new String(work.getValc())); 
//  DISPLAY '12A. RETAIN ' WS-RETAIN (1 : 50)
          logger.info("12A. RETAIN {}", new String(substring(work.getRetain(),0,50))); 

// *
          // MOVE 4 TO WS-POINTER
          work.setPointer((long)4);
//  UNSTRING WS-DATA0 (1 : WS-DATA0-LEN ) DELIMITED BY ',' INTO WS-FIELD1 WS-FIELD2 WS-FIELD3 WS-FIELD4 WS-FIELD5
          //This will have the no of characters parsed while un string. On NoOverflow pointerCnt == actualstring.length
          actualUnstringStr = substring(work.getData0(),0,work.getData0Len());
          //Construct an ArrayList by the given Delimited String. '+' will be added when there is ALL.EG ALL $, then delimited String will be $+
          splitBy = getArrayList(CONSTANTS.LITERAL_34072);
          //Create a RegularExpression String from the above delimited list (updateRegEx will add escape character \\ if in need, also group the values when required)
          updatedRegEx = updateRegEx(splitBy);
          //Split and store the String and delimited values.(EG : AABC$$$GH%, delimited by = ALL $, %, then result will have AABC - $ , GH - %)
          result = splitString(actualUnstringStr,updatedRegEx);
          loop = 0;
          try{
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setField1(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setField2(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setField3(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setField4(resultKey);
          	
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setField5(resultKey);
          	
          	loop++;
          }
          catch(IndexOutOfBoundsException e ){
          	//logger.info(e.getMessage());
          }
//  DISPLAY ' ---------------------------------  '
          logger.info(" ---------------------------------  "); 
//  DISPLAY ' FIELD 1 ' WS-FIELD1
          logger.info(" FIELD 1 {}", new String(work.getField1())); 
//  DISPLAY ' FIELD 2 ' WS-FIELD2
          logger.info(" FIELD 2 {}", new String(work.getField2())); 
//  DISPLAY ' FIELD 3 ' WS-FIELD3
          logger.info(" FIELD 3 {}", new String(work.getField3())); 
//  DISPLAY ' FIELD 4 ' WS-FIELD4
          logger.info(" FIELD 4 {}", new String(work.getField4())); 
//  DISPLAY ' FIELD 5 ' WS-FIELD5
          logger.info(" FIELD 5 {}", new String(work.getField5())); 
//  DISPLAY ' ---------------------------------  '
          logger.info(" ---------------------------------  "); 
//  UNSTRING WS-DATA DELIMITED BY '%' OR ALL '$' INTO WS-FIELD1 DELIMITER IN WS-DELIM1 COUNT IN WS-COUNT1 WS-FIELD2 COUNT IN WS-COUNT2 WS-FIELD3 DELIMITER IN WS-DELIM3 COUNT IN WS-COUNT3 WS-FIELD4 DELIMITER IN WS-DELIM4 COUNT IN WS-COUNT4 WS-FIELD5 COUNT IN WS-COUNT5 POINTER WS-POINTER TALLYING WS-TALLY END-UNSTRING
          pointerCnt = 0;
          actualUnstringStr =  Arrays.copyOfRange(work.getData(),getIndex((int) work.getPointer()), work.getData().length);
          //work.setPointer(work.getData().length()+1);
          //Construct an ArrayList by the given Delimited String. '+' will be added when there is ALL.EG ALL $, then delimited String will be $+
          splitBy = getArrayList(CONSTANTS.LITERAL_PR_,addArrays(CONSTANTS.LITERAL_33824,plusSign));
          //Create a RegularExpression String from the above delimited list (updateRegEx will add escape character \\ if in need, also group the values when required)
          updatedRegEx = updateRegEx(splitBy);
          //Split and store the String and delimited values.(EG : AABC$$$GH%, delimited by = ALL $, %, then result will have AABC - $ , GH - %)
          result = splitString(actualUnstringStr,updatedRegEx);
          loop = 0;
          try{
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setField1(resultKey);
          work.setDelim1(removeDuplicateChars(resultValue));
          work.setCount1(resultKey.length);
          	pointerCnt += resultKey.length + resultValue.length;
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setField2(resultKey);
          work.setCount2(resultKey.length);
          	pointerCnt += resultKey.length + resultValue.length;
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setField3(resultKey);
          work.setDelim3(removeDuplicateChars(resultValue));
          work.setCount3(resultKey.length);
          	pointerCnt += resultKey.length + resultValue.length;
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setField4(resultKey);
          work.setDelim4(removeDuplicateChars(resultValue));
          work.setCount4(resultKey.length);
          	pointerCnt += resultKey.length + resultValue.length;
          	loop++;
          	resultKey = (char[])result.get(loop).getKey();
          	resultValue = (char[])result.get(loop).getValue();
          	work.setField5(resultKey);
          work.setCount5(resultKey.length);
          	pointerCnt += resultKey.length + resultValue.length;
          	loop++;
          }
          catch(IndexOutOfBoundsException e ){
          	//logger.info(e.getMessage());
          }
          work.setPointer((int) work.getPointer()+pointerCnt);
          	work.setTally(loop);	
//  DISPLAY ' FIELD 1 ' WS-FIELD1 ' DELIM ' WS-DELIM1 ' COUNT ' WS-COUNT1
          logger.info(" FIELD 1 {} DELIM {} COUNT {}", new String(work.getField1()), new String(work.getDelim1()), String.valueOf(work.getCount1())); 
//  DISPLAY ' FIELD 2 ' WS-FIELD2 ' COUNT ' WS-COUNT2
          logger.info(" FIELD 2 {} COUNT {}", new String(work.getField2()), String.valueOf(work.getCount2())); 
//  DISPLAY ' FIELD 3 ' WS-FIELD3 ' DELIM ' WS-DELIM3 ' COUNT ' WS-COUNT3
          logger.info(" FIELD 3 {} DELIM {} COUNT {}", new String(work.getField3()), new String(work.getDelim3()), String.valueOf(work.getCount3())); 
//  DISPLAY ' FIELD 4 ' WS-FIELD4 ' DELIM ' WS-DELIM4 ' COUNT ' WS-COUNT4
          logger.info(" FIELD 4 {} DELIM {} COUNT {}", new String(work.getField4()), new String(work.getDelim4()), String.valueOf(work.getCount4())); 
//  DISPLAY ' FIELD 5 ' WS-FIELD5 ' COUNT ' WS-COUNT5
          logger.info(" FIELD 5 {} COUNT {}", new String(work.getField5()), String.valueOf(work.getCount5())); 
//  DISPLAY ' TALLY ' WS-TALLY
          logger.info(" TALLY {}", String.valueOf(work.getTally())); 
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
